/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : ADM_SYS_0010.js
*@FileTitle  : Menu Management
*@author     : CLT
*@version    : 1.0
*@since      : 2014/04/08
=========================================================*/
/****************************************************************************************
  이벤트 구분 코드: [초기화]INIT=0; [입력]ADD=1; [조회]SEARCH=2; [리스트조회]SEARCHLIST=3;
					[수정]MODIFY=4; [삭제]REMOVE=5; [리스트삭제]REMOVELIST=6 [다중처리]MULTI=7
					기타 여분의 문자상수  COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/

   	/* 개발자 작업	*/
  	// 공통전역변수
	var tabObjects=new Array();
	var tabCnt=0 ;
	var beforetab=1;
	var sheetObjects=new Array();
	var sheetCnt=0;
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
	    	    case "btng_rowadd":
		            doActionIBSheet(sheetObject2,formObject,IBINSERT);
	    	        break;
            	case "btn_New":
            		sheetObject1.SetCellValue(1,0,"",0);
            		sheetObject1.SetCellValue(1,1,"",0);
            		sheetObject1.SetCellValue(1,2,"",0);
            		sheetObject1.SetCellValue(1,3,"",0);
            		sheetObject1.SetCellValue(1,4,"",0);
            		sheetObject1.SetCellValue(1,5,"",0);
            		sheetObject1.SetCellValue(1,6,"",0);
            		sheetObject2.RemoveAll();
            		formObject.opt[0].checked=true;
            		formObject.RAP.checked=false;
            		formObject.SUR.checked=false;
            		formObject.OC.checked=false;
            		sheetObject2.DataInsert(-1);
            		break;
            	case "btn_Save":
            		doActionIBSheet(sheetObject2,formObject,IBSAVE);
            		break;
            	case "btn_Close":
        			ComClosePopup(); 
            		break;
            	case "btn_DownExcel":
            		doActionIBSheet(sheetObject3,formObject,IBDOWNEXCEL);
             		sheetObject2.Down2Excel({ HiddenColumn:0});
             		sheetObject3.Down2Excel({ HiddenColumn:-1});
            		break;
            } // end switch
    	}catch(e) {
    		if( e == "[object Error]") {
    			ComShowMessage(OBJECT_ERROR);
    		} else {
    			ComShowMessage(e);
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
		sheetObjects[0].DataInsert();
		sheetObjects[1].DataInsert();

		initControl();
		
	}
     function initControl() {
       	var formObject=document.form;
           //Axon 이벤트 처리1. 이벤트catch(개발자변경)
          // axon_event.addListenerFormat('keypress', 'keypressFormat', formObject);
          // axon_event.addListener ('keydown', 'ComKeyEnter', 'form');
       }
       //업무 자바스크립트 OnKeyPress 이벤트 처리
       function keypressFormat() {
       	obj=ComGetEvent();
     	    if(obj.dataformat == null) return;
     	    window.defaultStatus=obj.dataformat;
     	    switch(obj.name) {
     	        case "pgm_no":
     	        	ComKeyOnlyAlphabet('uppernum',"95");
     	            break;
     	    }
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
            with(sheetObj){
	          var HeadTitle="ID|Name|RHQ|Office|Use Flag|Auth Type|ID DIV" ;
	          var headCount=ComCountHeadTitle(HeadTitle);
	
	          SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1 } );	          
	
	          var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };	          
	          var headers = [ { Text:HeadTitle, Align:"Center"} ];
	          InitHeaders(headers, info);
	
	          var cols = [ {Type:"Text",      Hidden:0, Width:80,   Align:"Center",  ColMerge:0,   SaveName:"usr_id",          KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },	                       
		                 {Type:"Text",      Hidden:0, Width:100,  Align:"Left",    ColMerge:0,   SaveName:"usr_nm",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		                 {Type:"Text",      Hidden:0, Width:80,   Align:"Center",  ColMerge:0,   SaveName:"rhq",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		                 {Type:"Text",      Hidden:0, Width:80,   Align:"Center",  ColMerge:0,   SaveName:"ofc_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		                 {Type:"Combo",     Hidden:0, Width:80,   Align:"Center",  ColMerge:0,   SaveName:"use_flg",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		                 {Type:"Combo",     Hidden:0, Width:80,   Align:"Center",  ColMerge:0,   SaveName:"usr_auth_tp_cd",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		                 {Type:"Combo",     Hidden:0, Width:80,   Align:"Center",  ColMerge:0,   SaveName:"div",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
	           
	          InitColumns(cols);	
	          SetEditable(1);
	          SetEditTabBehavior(1);
	          SetColProperty("usr_auth_tp_cd", {ComboText:"|Almighty|SuperUser|Regular|SystemAdmin", ComboCode:"|A|S|R|E"} );
	          SetColProperty("use_flg", {ComboText:"|Yes|No", ComboCode:"|Y|N"} );
	          SetColProperty("div", {ComboText:"|LID|GID", ComboCode:"|L|G"} );
	          SetWaitImageVisible(0);	          
              SetSheetHeight(120);
          }
            break;
        case "sheet2":
            with(sheetObj){
			var HeadTitle="|Del|ID|Name|RHQ|Office|Use Flag|Auth Type|ID DIV" ;
			var headCount=ComCountHeadTitle(HeadTitle);
			
			SetConfig( { SearchMode:2, MergeSheet:5, Page:20, FrozenCol:0, DataRowMerge:1 } );
			
			var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
			var headers = [ { Text:HeadTitle, Align:"Center"} ];
			InitHeaders(headers, info);			
			var cols = [ {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"ibflag" },
						{Type:"DelCheck",  Hidden:0, Width:30,   Align:"Center",  ColMerge:1,   SaveName:"DEL",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
						{Type:"Text",      Hidden:0, Width:80,   Align:"Center",  ColMerge:0,   SaveName:"usr_id",          KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
						{Type:"Text",      Hidden:0, Width:100,  Align:"Left",    ColMerge:0,   SaveName:"usr_nm",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
						{Type:"Text",      Hidden:0, Width:80,   Align:"Center",  ColMerge:0,   SaveName:"rhq",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
						{Type:"Text",      Hidden:0, Width:80,   Align:"Center",  ColMerge:0,   SaveName:"ofc_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
						{Type:"Combo",     Hidden:0, Width:80,   Align:"Center",  ColMerge:0,   SaveName:"use_flg",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
						{Type:"Combo",     Hidden:0, Width:80,   Align:"Center",  ColMerge:0,   SaveName:"usr_auth_tp_cd",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
						{Type:"Combo",     Hidden:0, Width:80,   Align:"Center",  ColMerge:0,   SaveName:"div",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
			
			InitColumns(cols);			
			SetEditable(1);
			SetEditTabBehavior(1);
			SetColProperty("usr_auth_tp_cd", {ComboText:"|Almighty|SuperUser|Regular|SystemAdmin", ComboCode:"|A|S|R|E"} );
			SetColProperty("use_flg", {ComboText:"|Yes|No", ComboCode:"|Y|N"} );
			SetColProperty("div", {ComboText:"|LID|GID", ComboCode:"|L|G"} );
			SetWaitImageVisible(0);
			SetSheetHeight(200);
			}
        break;
        }
    }
    /**
     * IBSheet 관련 각종 기능(조회,저장 등)을 처리한다. <br>
     * {@link #processButtonClick}함수에서 이 함수를 호출하여 버튼에서 IBSheet의 기능을 호추할 때 사용한다. <br>
     * @param {ibsheet} sheetObj    IBSheet Object
     * @param {form}    formObj     Form Object
     * @param {int}     sAction     처리할 Action 코드(예:IBSEARCH,IBSAVE,IBDELETE,IBDOWNEXCEL 등이며 CoObject.js에 정의됨)
     **/
    function doActionIBSheet(sheetObj,formObj,sAction) {
        sheetObj.ShowDebugMsg(false);
        switch(sAction) {
			case IBSAVE:        //저장
				if(!validateForm(sheetObj,formObj,sAction))return;
				ComOpenWait(true);
            	formObj.f_cmd.value=MULTI;
                //저장처리
                var formparam=FormQueryString(formObj);
                var usrIDs="";
                
                for(var i=1; i<sheetObj.RowCount()+1; i++) {
					usrIDs += sheetObj.GetCellValue(i, 2) + "!@@!";
                }
                
				sheetObjects[1].DoSave("ADM_SYS_0010GS.do", formparam + "&from_usr_id=" + sheetObjects[0].GetCellValue(1, "usr_id") + "&to_usr_id=" + usrIDs, -1);
				ComOpenWait(false);
				break;
			case IBINSERT:      // 입력
				for (var i=0;i<formObj.addrows.value;i++) sheetObj.DataInsert();
				break;
        }
    }
    /**
     * 화면 폼입력값에 대한 유효성검증 프로세스 처리한다. <br>
     * @param {ibsheet} sheetObj    IBSheet Object
     * @param {form}    formObj     Form Object
     * @param {int}     sAction     처리할 Action 코드(예:IBSEARCH,IBSAVE,IBDELETE,IBDOWNEXCEL 등이며 CoObject.js에 정의됨)
     **/
    function validateForm(sheetObj,formObj,sAction){
        with(formObj){
            if (!formObj.RAP.checked&&!formObj.SUR.checked&&!formObj.OC.checked) {
            	alert('select function !');
                return false;
            }
			if (sheetObjects[0].GetCellValue(1,"usr_nm")=="") {
            	alert('input from user !');
            	return false;
            }
            if (sheetObj.rowCount==0) {
            	alert('empty to user !');
            	return false;
            }
            for(var i=1; i<sheetObj.rowCount+1; i++) {
            	//alert(sheetObj.CellValue(i,"usr_nm"));
			if (sheetObj.GetCellValue(i,"usr_nm")=="") {
            		alert('input to user !');
            		return false;
            	}
			if (sheetObj.GetCellValue(i,"usr_auth_tp_cd")!="S"&&formObj.SUR.checked) {
            		alert('there is a user who is not Super User authority !');
            		formObj.SUR.checked=false;
            		return false;
            	}
            }
        }
        return true;
    }
    function sheet2_OnSaveEnd(sheetObj,Code,Msg,StCode,StMsg) {
		if(Code >= 0){
			ComShowMessage("Saved successfully.");
		} else{
			ComShowMessage("An error occurred while saving data.");
		}
    }
    function sheet1_OnChange(sheetObj,Row,Col) {
    	sheetOnChange(sheetObj,Row,Col);
    }
    function sheet2_OnChange(sheetObj,Row,Col) {
    	if (sheetObj.ColSaveName(Col)!="DEL") sheetOnChange(sheetObj,Row,Col);
    }
    function sheetOnChange(sheetObj,Row,Col) {
    	var formObject=document.form;
		formObject.f_cmd.value=SEARCH05;
 		var sXml=sheetObj.GetSearchData("ADM_SYS_0003GS.do?usr_id="+sheetObj.GetCellValue(Row,Col), FormQueryString(formObject));
		if(ComGetEtcData(sXml,"total") != "0"){
			sheetObj.SetCellValue(Row, "usr_nm",ComGetEtcData(sXml,"usr_nm"),0);
			sheetObj.SetCellValue(Row, "rhq",ComGetEtcData(sXml,"rhq"),0);
			sheetObj.SetCellValue(Row, "ofc_cd",ComGetEtcData(sXml,"ofc_cd"),0);
			sheetObj.SetCellValue(Row, "use_flg",ComGetEtcData(sXml,"use_flg"),0);
			sheetObj.SetCellValue(Row, "usr_auth_tp_cd",ComGetEtcData(sXml,"usr_auth_tp_cd"),0);
			sheetObj.SetCellValue(Row, "div",ComGetEtcData(sXml,"div"),0);
		} else {
			alert('no user !');
		}
    }
	/* 개발자 작업  끝 */
