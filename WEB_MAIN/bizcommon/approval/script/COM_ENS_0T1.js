/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : COM_ENS_0T1.js
*@FileTitle  : 
*@author     : CLT
*@version    : 1.0
*@since      : 2014/07/21
=========================================================*/
  	// 공통전역변수
	var tabObjects=new Array();
	var tabCnt=0 ;
	var beforetab=1;
	var sheetObjects=new Array();
	var sheetCnt=0;
	var IBSAVE02=32;
	// 버튼클릭이벤트를 받아 처리하는 이벤트핸들러 정의 */
	document.onclick=processButtonClick;
	// 버튼 네임으로 구분하여 프로세스를 분기처리하는 이벤트핸들러 */
    function processButtonClick(){
         /***** 탭당 시트가 2개 이상인 경우엔 추가 시트변수 지정하여 사용한 *****/
         var sheetObject1=sheetObjects[0];
         var sheetObject2=sheetObjects[1];
         /*******************************************************/
         var formObject=document.form;
    	try {
    		var srcName=ComGetEvent("name");
            switch(srcName) {
            	case "btn_Search":
            		if ( document.getElementById("search_text").value == "" ) return;	
            		findXML(document.getElementById("search").value, document.getElementById("search_text").value);
            		break;
            	case "btn_retrieve":    
            		doActionIBSheet(sheetObject2,formObject,IBSEARCH);
                    break;
            	case "btn_save":
        	        if(formObject.sub_sys_cd.value == "") {
        	        	ComShowCodeMessage("COM12113", "Module");
        	        	return;
        	        }
        	        doActionIBSheet(sheetObject2, formObject, IBSAVE);
        	        break;
            	case "btns_add":
            		var selrow=sheetObjects[0].GetSelectRow();
                    if ( selrow > 0 ){
                    	sheet1_OnDblClick("", "", "", "");
            		}     	        
            		break;
         	    case "btns_del":
         	    	var selrow=sheetObjects[1].GetSelectRow();
                    if ( selrow > 0 ){
                    	sheet2_OnDblClick("", "", "", "");
            		}    
         	    	break;
        	    case "btn_confirm":
        	        doActionIBSheet(sheetObject2, formObject, IBSAVE);
        	        break; 	
        	    case "btn_ok":
        	        returnApprovalRoute();
        	        break;
        	    case "btn_close":
        	    	ComClosePopup(); 
        	        break;
            } // end switch
    	}catch(e) {
    		if( e == "[object Error]") {
    			ComShowMessage(OBJECT_ERROR);
    		} else {
    			ComShowMessage(e.message);
    		}
    	}
    }
    /**
     * 페이지에 생성된 IBSheet Object를 sheetObjects배열에 등록한다. <br>
     * sheetObjects 배열은 공통전역변수로 상단에 정의하고, 이 함수는 {@link CoObject#ComSheetObject} 함수에 의해서 IBSheet Object가 생성되면서 자동 호출된다. <br>
     * @param {ibsheet} sheet_obj    IBSheet Object
     **/
    function setSheetObject(sheet_obj){
       sheetObjects[sheetCnt++]=sheet_obj;
    }
    /**
     * body.onload 이벤트에서 호출되는 함수로 페이지 로드완료 후 선처리해야할 기능을 추가한다. <br>
     * HTML컨트롤의 각종 이벤트와 IBSheet, IBTab 등을 초기화 한다. <br>
     **/
    function loadPage() {
    	for(i=0;i<sheetObjects.length;i++){
			//khlee-시작 환경 설정 함수 이름 변경
			ComConfigSheet (sheetObjects[i]);
			initSheet(sheetObjects[i],i+1);
			//khlee-마지막 환경 설정 함수 추가
			ComEndConfigSheet(sheetObjects[i]);
		}
        // 기저장된 Approval Route 조회
        var formObject=document.form;
        var mode=formObject.mode.value;
        var sheetObjectUser2=sheetObjects[1];
       doActionIBSheet(sheetObjectUser2, formObject, IBSEARCH);
    }
    /**
     * 페이지에 있는 IBSheet Object를 초기화 한다. <br>
     * IBSheet가 여러개일 경우 개수만큼 case를 추가하여 IBSheet 초기화 모듈을 구성한다. <br>
     * {@link #loadPage}함수에서 이 함수를 호출하여 IBSheet Object를 초기화 한다. <br>
     * @param {ibsheet} sheetObj    IBSheet Object
     * @param {int}     sheetNo     sheetObjects 배열에서 순번
     **/
    function initSheet(sheetObj,sheetNo) {
        var cnt=0;
		var sheetID=sheetObj.id;
        switch(sheetID) {
            case "sheet1":
                with (sheetObj) {
                var HeadTitle="Name|Dept|Title|" ;
                var headCount=ComCountHeadTitle(HeadTitle);
                SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1 } );
                var info    = { Sort:1, ColMove:1, ColResize:1, HeaderCheck:1 };
                var headers = [ { Text:HeadTitle, Align:"Center"} ];
                InitHeaders(headers, info);
                var cols = [ {Type:"Text",      Hidden:0,  Width:90,   Align:"Left",    ColMerge:0,   SaveName:"NAME",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                 {Type:"Text",      Hidden:0,  Width:90,   Align:"Center",  ColMerge:0,   SaveName:"TEAMNM",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                 {Type:"Text",      Hidden:0,  Width:0,    Align:"Left",    ColMerge:0,   SaveName:"BUJAE",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                 {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"CN",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
                InitColumns(cols);
                SetEditable(1);
                SetSheetHeight(322);
                }
                break;
            case "sheet2":     //IBSheet2 init
            	with (sheetObj) {
                var HeadTitle="|No|Name|Dept|Title|" ;
                var headCount=ComCountHeadTitle(HeadTitle);
                SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1 } );
                var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
                var headers = [ { Text:HeadTitle, Align:"Center"} ];
                InitHeaders(headers, info);
                var cols = [ {Type:"Status",    Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"ibflag",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                    {Type:"Text",      Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:"apro_seq",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                    {Type:"Text",      Hidden:0,  Width:90,   Align:"Left",    ColMerge:0,   SaveName:"apro_usr_nm",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                    {Type:"Text",      Hidden:0,  Width:90,   Align:"Center",  ColMerge:0,   SaveName:"apro_ofc_cd",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                    {Type:"Text",      Hidden:0,  Width:85,   Align:"Left",    ColMerge:0,   SaveName:"apro_usr_jb_tit_nm",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                    {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:"apro_usr_id",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
                InitColumns(cols);
                SetEditable(1);
                SetCellBackColor(0,"name","#555555");
                SetCellBackColor(0,"mail",GetCellBackColor(0,"name"));
                SetSheetHeight(322);
	           }
            break;
        }
    }
     /* Sheet관련 프로세스 처리 */
     function doActionIBSheet(sheetObj,formObj,sAction) {
         switch(sAction) {
           case IBSAVE02:
	            formObj.f_cmd.value=MULTI01;
	            formObj.frst_apro_usr_id.value=sheetObj.GetCellValue(sheetObj.RowCount(), "apro_usr_id");
	            var SaveStr=sheetObj.GetSaveString();
	            var sXml=sheetObj.GetSaveData("COM_ENS_0T1GSRoute.do", SaveStr + "&" + FormQueryString(formObj));
  		   break;
            case IBSAVE:        //저장
	            // 모두 재입력을 원칙으로 함
	            for(var i=0; i<sheetObj.RowCount(); i++) {
	                sheetObj.SetCellValue(i + 1, "ibflag","I",0);
	            }
    			formObj.f_cmd.value=MULTI;
    			var SaveStr=sheetObj.GetSaveString();
    			var sXml=sheetObj.GetSaveData("COM_ENS_0T1GSRoute.do", SaveStr + "&" + FormQueryString(formObj));
    			sheetObj.LoadSaveData(sXml);
            break;
            case IBSEARCH:      //조회
            	formObj.f_cmd.value=SEARCH03;
            	sheetObj.DoSearch("COM_ENS_0T1GS2.do", FormQueryString(formObj) );
            break;
         }
     }
     // OrganTree 로 부터 받은 HashMap 결과를 시트에 바인딩
    function loadData(data) {
    	var sheetObject=sheetObjects[0];
    	var sheetXml="<SHEET><DATA COLSEPARATOR='|'>";
    	for( var i=0 ; i < data.length ; i++ ) {
    		sheetXml += "<TR><![CDATA[";
    		sheetXml += data[i].getPos(1) + "|" + data[i].getPos(0) + "|" + data[i].getPos(7) + "|" + data[i].getPos(4);	//data[i].get("TEAM");
    		sheetXml += "]]></TR>";
    	}
    	sheetObject.LoadSearchData(sheetXml+"</DATA></SHEET>",{Sync:1} );
     }
    function sheet1_OnDblClick(sheetObj, row, col, value) {
    	var sheetObject1=sheetObjects[0];
        var sheetObject2=sheetObjects[1];
        var selrow=sheetObject1.GetSelectRow();
        if ( selrow > 0 )
        {
			var usr_id=sheetObject1.GetCellValue(selrow, "CN");
			var usr_nm=sheetObject1.GetCellValue(selrow, "NAME");
			var ofc_cd=sheetObject1.GetCellValue(selrow, "TEAMNM");
			var title=sheetObject1.GetCellValue(selrow, "BUJAE");
            // Duplication(중복) 체크
            for(var i=0; i<sheetObject2.RowCount(); i++) {
            	if(sheetObject2.GetCellValue(i + 1, "apro_usr_id") == usr_id) {
                    ComShowMessage(usr_id + " is already added");
                    return;
                }
            }
            /*
            if(ofc_cd.length > 6){
                ComShowMessage(ofc_cd + " is wrong code");
                return;
            }
            */
            // 대상 Sheet로 데이타 이행
            row=sheetObject2.DataInsert(0);
			sheetObject2.SetCellValue(row, "apro_usr_nm",usr_nm,0);
			sheetObject2.SetCellValue(row, "apro_ofc_cd",ofc_cd,0);
			sheetObject2.SetCellValue(row, "apro_usr_jb_tit_nm",title,0);
			sheetObject2.SetCellValue(row, "apro_usr_id",usr_id,0);
            // APPROVAL SEQ 재정렬
//            var RowCount()=sheetObject2.RowCount();
            for(var i=0; i<sheetObject2.sheetObject2.RowCount(); i++) {
                  sheetObject2.SetCellValue(i + 1, "apro_seq",sheetObject2.RowCount() - i,0);
            }
            /*
            var RowCount()=sheetObject2.RowCount();
            for(var i=0; i<RowCount(); i++) {
                  sheetObject2.SetCellValue(i + 1, "apro_seq",i+1,0);
            }*/
        }
    }
 // 소속 Office 자동 펼침 처리
    function officeSearch() {
	 	findXML('TEAMNM', document.getElementById("ofc_cd").value);
    }
    function sheet2_OnDblClick(sheetObj, row, col, value) {
    	var sheetObject2=sheetObjects[1];
        var selrow=sheetObject2.GetSelectRow();
        if(selrow > 0) {
            sheetObject2.RowDelete(selrow, false);
        }
        // APPROVAL SEQ 재정렬
//        var RowCount()=sheetObject2.RowCount();
        for(var i=0; i<sheetObject2.RowCount(); i++) {
              sheetObject2.SetCellValue(i + 1, "apro_seq",sheetObject2.RowCount()- i,0);
        }
    }
    function returnApprovalRoute() {
    	var formObject=document.form;
        var sheetObject2=sheetObjects[1];
        var apro_step="";
        var aproSeqKey="";
        var wi=sheetObject2.RowCount()-1;
        for(var i=wi; i<sheetObject2.RowCount(); i--) {
        	if(i<0) break;
            if(i != sheetObject2.RowCount()-1) {
                apro_step += " - ";
            }
            apro_step += sheetObject2.GetCellValue(i + 1, "apro_seq")
            apro_step += "/";
            apro_step += sheetObject2.GetCellValue(i + 1, "apro_usr_id")
            apro_step += "/";
            apro_step += sheetObject2.GetCellValue(i + 1, "apro_usr_nm")
            apro_step += "/";
            apro_step += sheetObject2.GetCellValue(i + 1, "apro_ofc_cd")
            apro_step += "/";
            apro_step += sheetObject2.GetCellValue(i + 1, "apro_usr_jb_tit_nm")
            if(sheetObject2.GetCellValue(i + 1, "apro_seq") == wi+1){
            	aproSeqKey=sheetObject2.GetCellValue(i + 1, "apro_usr_jb_tit_nm") == '' ? sheetObject2.GetCellValue(i + 1, "apro_usr_nm") : sheetObject2.GetCellValue(i + 1, "apro_usr_jb_tit_nm") + '/' + sheetObject2.GetCellValue(i + 1, "apro_usr_nm");
			}
        }
        // 모달창인 경우는 window 객체로부터 opener를 획득
		if(!opener)
			opener=window;
        opener.document.all[formObject.target_obj_nm.value].value=apro_step;
        opener.document.form.aproSeqKey.value=aproSeqKey;
        ////
        // 모두 재입력을 원칙으로 함
        for(var i=0; i<sheetObject2.RowCount(); i++) {
        	sheetObject2.SetCellValue(i + 1, "ibflag","U",0);
        }
        formObject.aproSeqKey.value=aproSeqKey;
        var csr_no=formObject.csr_no.value;
        if( csr_no != ""){
        	document.form.apro_step.value=apro_step;
        	doActionIBSheet(sheetObject2, formObject, IBSAVE02);  
        }
        ComClosePopup(); 
    }
	/* 개발자 작업  끝 */