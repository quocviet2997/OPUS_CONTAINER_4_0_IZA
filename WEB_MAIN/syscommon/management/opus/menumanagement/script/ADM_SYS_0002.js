/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : ADM_SYS_0002.js
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
	var sheetObjects=new Array();
	var sheetCnt=0;
	// 버튼클릭이벤트를 받아 처리하는 이벤트핸들러 정의 */
	document.onclick=processButtonClick;
	// 버튼 네임으로 구분하여 프로세스를 분기처리하는 이벤트핸들러 */
    function processButtonClick(){
         /***** 탭당 시트가 2개 이상인 경우엔 추가 시트변수 지정하여 사용한 *****/
        var sheetObject1=sheetObjects[0];
        var sheetObject2=sheetObjects[1];
        var sheetObject3=sheetObjects[2];
         /*******************************************************/
        var formObject=document.form;
    	try {
    		var srcName = ComGetEvent("name");
    		
            switch(srcName) {
            	case "btn_Add":
            		doActionIBSheetAdd(sheetObject1,sheetObject2,ComGetObjValue(formObject.add_type));
            		break;
            	case "btn_Retrieve":
            		doActionIBSheet(sheetObject1,formObject,IBSEARCH);
            		break;
            	case "btn_Save":
            		doActionIBSheet(sheetObject1,formObject,IBSAVE);
            		break;
            	case "btn_DownExcel":
            		doActionIBSheet(sheetObject3,formObject,IBDOWNEXCEL);
            		if(sheetObject2.RowCount() < 1){
            			ComShowCodeMessage("COM132501");
            			break;
            		}else{
            			sheetObject2.Down2Excel({DownCols: makeHiddenSkipCol(sheetObject2), SheetDesign:1, Merge:1});
            		}
            		
            		if(sheetObject3.RowCount() < 1){
            			ComShowCodeMessage("COM132501");
            		}else{
            			sheetObject3.Down2Excel({DownCols: makeHiddenSkipCol(sheetObject3), SheetDesign:1, Merge:1});
            			break;
            		}
            }
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
		initControl();
	}
     function initControl() {
       	var formObject=document.form;
           /*//Axon 이벤트 처리1. 이벤트catch(개발자변경)
           axon_event.addListenerFormat('keypress', 'keypressFormat', formObject);
           axon_event.addListener ('keydown', 'ComKeyEnter', 'form');*/
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
        var cnt = 0;
		var sheetID = sheetObj.id;
        switch(sheetID) {
        case "sheet1":
            with(sheetObj){
		          var HeadTitle="Division|Program No|Program Name|Program Url" ;
		          var headCount=ComCountHeadTitle(HeadTitle);
		
		          SetConfig( { SearchMode:2, MergeSheet:5, Page:100, FrozenCol:0, DataRowMerge:1 } );
		
		          var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
		          var headers = [ { Text:HeadTitle, Align:"Center"} ];
		          InitHeaders(headers, info);
		
		          var cols = [ {Type:"Combo",     Hidden:0, Width:60,   Align:"Center",  ColMerge:0,   SaveName:"pgm_mnu_div_cd",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                 {Type:"Text",      Hidden:0, Width:120,  Align:"Center",  ColMerge:0,   SaveName:"pgm_no",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                 {Type:"Text",      Hidden:0, Width:180,  Align:"Left",    ColMerge:0,   SaveName:"pgm_nm",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                 {Type:"Text",      Hidden:0, Width:130,  Align:"Left",    ColMerge:0,   SaveName:"pgm_url",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
		           
		          InitColumns(cols);
		          SetSelectionMode(3);
		          SetColProperty("pgm_mnu_div_cd", {ComboText:"Menu|Program", ComboCode:"01|02"} );
		          SetCountPosition(0);
		          //SetSheetHeight(510);
		          resizeSheet();
		          SetWaitImageVisible(0);
           }


            break;

        case "sheet2":
            with(sheetObj){
		          var HeadTitle="|Del|Menu No|Menu Name|Order|Program Url|Pgm_Level|Cfg Cd|Parent No|access level" ;
		
		          SetConfig( { SearchMode:2, MergeSheet:5, Page:100, FrozenCol:0, DataRowMerge:1, ChildPage:10 } );
		
		          var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
		          var headers = [ { Text:HeadTitle, Align:"Center"} ];
		          InitHeaders(headers, info);
		
		          var cols = [ {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"ibflag" },
			                 {Type:"DelCheck",  Hidden:0, Width:45,   Align:"Center",  ColMerge:1,   SaveName:"DEL",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
			                 {Type:"Text",      Hidden:0, Width:180,  Align:"Center",  ColMerge:0,   SaveName:"chd_pgm_no",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1,   TreeCol:1 ,  LevelSaveName:"level" },
			                 {Type:"Text",      Hidden:0, Width:180,  Align:"Left",    ColMerge:0,   SaveName:"pgm_nm",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
			                 {Type:"Text",      Hidden:0, Width:40,   Align:"Center",  ColMerge:0,   SaveName:"dp_seq",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
			                 {Type:"Text",      Hidden:0, Width:180,  Align:"Left",    ColMerge:0,   SaveName:"pgm_url",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
			                 {Type:"Text",      Hidden:1, Width:50,   Align:"Center",  ColMerge:0,   SaveName:"pgm_lvl_val",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
			                 {Type:"Text",      Hidden:1, Width:50,   Align:"Center",  ColMerge:0,   SaveName:"mnu_cfg_cd",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
			                 {Type:"Text",      Hidden:1, Width:80,   Align:"Center",  ColMerge:0,   SaveName:"prnt_pgm_no",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
			                 {Type:"Text",      Hidden:1, Width:80,   Align:"Center",  ColMerge:0,   SaveName:"access_lvl",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 } ];
		           
		          InitColumns(cols);
		          SetCountPosition(0);
		          //SetSheetHeight(480);
		          resizeSheet();
		          SetWaitImageVisible(0);
	        }
            break;

        case "sheet3":
        	with(sheetObj){
	        	var HeadTitle="Level1|Level2|Level3|Level4|Level5|Level6|Program No|Menu Name|Program Url" ;
	
	        	SetConfig( { SearchMode:2, MergeSheet:5, Page:100, FrozenCol:0, DataRowMerge:1 } );
	
	        	var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
	        	var headers = [ { Text:HeadTitle, Align:"Center"} ];
	        	InitHeaders(headers, info);
	
	        	var cols = [ {Type:"Text",      Hidden:0, Width:100,  Align:"Center",  ColMerge:0,   SaveName:"lvl1",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
	        	             {Type:"Text",      Hidden:0, Width:100,  Align:"Center",  ColMerge:0,   SaveName:"lvl2",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
	        	             {Type:"Text",      Hidden:0, Width:100,  Align:"Center",  ColMerge:0,   SaveName:"lvl3",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
	        	             {Type:"Text",      Hidden:0, Width:100,  Align:"Center",  ColMerge:0,   SaveName:"lvl4",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
	        	             {Type:"Text",      Hidden:0, Width:100,  Align:"Center",  ColMerge:0,   SaveName:"lvl5",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
	        	             {Type:"Text",      Hidden:0, Width:100,  Align:"Center",  ColMerge:0,   SaveName:"lvl6",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
	        	             {Type:"Text",      Hidden:0, Width:100,  Align:"Center",  ColMerge:0,   SaveName:"pgm_no",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
	        	             {Type:"Text",      Hidden:0, Width:150,  Align:"Center",  ColMerge:0,   SaveName:"pgm_desc",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
	        	             {Type:"Text",      Hidden:0, Width:150,  Align:"Center",  ColMerge:0,   SaveName:"pgm_url",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 } ];
	        	 
	        	InitColumns(cols);
	
	          	SetEditable(1);
	        	SetCountPosition(0);
	        	SetWaitImageVisible(0);
	        	SetVisible(0);
        	}
        	break;

        }
    }
    
    function resizeSheet(){
   	         ComResizeSheet(sheetObjects[0]);
   	         ComResizeSheet(sheetObjects[1]);
   }

    /**
     * IBSheet 관련 각종 기능(조회,저장 등)을 처리한다. <br>
     * {@link #processButtonClick}함수에서 이 함수를 호출하여 버튼에서 IBSheet의 기능을 호추할 때 사용한다. <br>
     * @param {ibsheet} sheetObj    IBSheet Object
     * @param {form}    formObj     Form Object
     * @param {int}     sAction     처리할 Action 코드(예:IBSEARCH,IBSAVE,IBDELETE,IBDOWNEXCEL 등이며 CoObject.js에 정의됨)
     **/
    function searchData() {
		var sXml=sheetObjects[0].GetSearchData('ADM_SYS_0002GS.do' , FormQueryString(document.form));
		var arrXml=sXml.split("|$$|");
		if (arrXml.length > 0) sheetObjects[0].LoadSearchData(arrXml[1]);
		if (arrXml.length > 1) sheetObjects[1].LoadSearchData(arrXml[0]);
    }
    function doActionIBSheet(sheetObj,formObj,sAction) {
        switch(sAction) {
			case IBSEARCH:      //조회
				if(validateForm(sheetObj,formObj,sAction)){
					if (sheetObj.id == "sheet1"){
						ComOpenWait(true);
						formObj.f_cmd.value=SEARCH;
						setTimeout("searchData();", 100);
					}
				}
				break;
			case IBSAVE:        //저장
            	formObj.f_cmd.value=MULTI;
                sheetObjects[1].DoSave("ADM_SYS_0002GS.do",  FormQueryString(formObj));
				break;
			case IBINSERT:      // 입력
				row=sheetObj.DataInsert(-1);
				break;
			case IBDOWNEXCEL:		// Excel download
				formObj.f_cmd.value=SEARCH01;
				var sXml=sheetObj.GetSearchData("ADM_SYS_0002GS.do" , FormQueryString(formObj));
				sheetObjects[2].LoadSearchData(sXml,{Sync:1} );
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
//            if (!isNumber(formObj.iPage)) {
//                return false;
//            }
        }
        return true;
    }
    // sheet click
    function sheet2_OnClick(sheetObj, Row, Col) {
    	var boxes=document.getElementsByTagName("input");
    	var access_level=sheetObj.GetCellValue(Row,"access_lvl");
    	for ( var i=0 ; i < boxes.length ; i++ ) 
    		if ( boxes[i].getAttribute("type") == "checkbox" ) 
    			boxes[i].checked=false;
	    	if ( access_level.charAt(0) == '1' )	document.all.SHO.checked=true;
	    	if ( access_level.charAt(1) == '1' )	document.all.RHQ.checked=true;
	    	if ( access_level.charAt(2) == '1' )	document.all.GOF.checked=true;
	    	if ( access_level.charAt(3) == '1' )	document.all.SOF.checked=true;
	    	if ( access_level.charAt(4) == '1' )	document.all.LOF.checked=true;
	    	if ( access_level.charAt(5) == '1' )	document.all.AGT.checked=true;
	    	if ( access_level.charAt(6) == '1' )	document.all.OTH.checked=true;
      }
    // Sheet관련 프로세스 처리
    function doActionIBSheetAdd(srcSheetObj,tgtSheetObj,sAction) {
        var sRowStr=srcSheetObj.GetSelectionRows();
        var arr=sRowStr.split("|");
        /*
        0 : Child 
        1 : Previous Sibling 
        2 : Next Sibling 
		*/
        switch(sAction) {
           case "0":      //as last child
                var newGetRowLevel=tgtSheetObj.GetRowLevel(tgtSheetObj.GetSelectRow())+1;
                var prnt_pgm_no=tgtSheetObj.GetCellValue(tgtSheetObj.GetSelectRow(),"chd_pgm_no");
                for (i=0; i<arr.length; i++) {
                    // If insert same program numbers to child of itself, do not work and alert to user !   
                	if( prnt_pgm_no == srcSheetObj.GetCellValue(arr[i],"pgm_no") )
                    {
                    	ComShowMessage("Can not insert program_no into a child of itself !\n[" + 
                    			srcSheetObj.GetCellValue(arr[i],"pgm_no") + "]");
                    	return;
                    }
                }
                for (i=0; i<arr.length; i++) {
                    var returnRow = tgtSheetObj.DataInsert(tgtSheetObj.GetSelectRow()+1,newGetRowLevel);
					tgtSheetObj.SetCellValue(returnRow,"chd_pgm_no",srcSheetObj.GetCellValue(arr[i],"pgm_no"));
					tgtSheetObj.SetCellValue(returnRow,"pgm_nm",srcSheetObj.GetCellValue(arr[i],"pgm_nm"));
                    tgtSheetObj.SetCellValue(returnRow,"dp_seq","1");
                    tgtSheetObj.SetCellValue(returnRow,"pgm_lvl_val",tgtSheetObj.GetRowLevel(returnRow));
                    tgtSheetObj.SetCellValue(returnRow,"mnu_cfg_cd",tgtSheetObj.GetCellValue(returnRow-1,"mnu_cfg_cd"));
                    tgtSheetObj.SetCellValue(returnRow,"prnt_pgm_no",prnt_pgm_no);
                    //tgtSheetObj.showTreeLevel(-1);
                }
                setMenuOrder(tgtSheetObj,tgtSheetObj.GetSelectRow());
                break;
            case "1":     //as previous sibling
                //var prnt_pgm_no = tgtSheetObj.CellValue(tgtSheetObj.SelectRow-1,"chd_pgm_no");
                for (i=arr.length-1; i>-1; i--) {
                	var returnRow = tgtSheetObj.DataInsert(tgtSheetObj.GetSelectRow(),tgtSheetObj.GetRowLevel(tgtSheetObj.GetSelectRow()));
                	tgtSheetObj.SetCellValue(returnRow,"chd_pgm_no",srcSheetObj.GetCellValue(arr[i],"pgm_no"));
                	tgtSheetObj.SetCellValue(returnRow,"pgm_nm",srcSheetObj.GetCellValue(arr[i],"pgm_nm"));
                    tgtSheetObj.SetCellValue(returnRow,"dp_seq","1");
                    tgtSheetObj.SetCellValue(returnRow,"pgm_lvl_val",tgtSheetObj.GetRowLevel(returnRow));
                    tgtSheetObj.SetCellValue(returnRow,"mnu_cfg_cd",tgtSheetObj.GetCellValue(returnRow+1,"mnu_cfg_cd"));
                    tgtSheetObj.SetCellValue(returnRow,"prnt_pgm_no",tgtSheetObj.GetCellValue(returnRow+1,"prnt_pgm_no"));
                    //tgtSheetObj.showTreeLevel(-1);
                }
                setMenuOrder(tgtSheetObj,tgtSheetObj.GetSelectRow());
                break;
           case "2":      //as next sibling
             if(tgtSheetObj.IsHaveChild(tgtSheetObj.GetSelectRow())){  // Node인 경우
               var rowLevel=tgtSheetObj.GetRowLevel(tgtSheetObj.GetSelectRow());
               var currOrder=eval(tgtSheetObj.GetCellValue(tgtSheetObj.GetSelectRow(),"dp_seq"));
               var prntPgm=tgtSheetObj.GetCellValue(tgtSheetObj.GetSelectRow(),"prnt_pgm_no");
               var currRow=tgtSheetObj.RowCount();
               for(i=tgtSheetObj.GetSelectRow()+1;i<=tgtSheetObj.RowCount();i++){
                 if(tgtSheetObj.GetRowLevel(i)<=tgtSheetObj.GetRowLevel(tgtSheetObj.GetSelectRow())){
                   currRow=i-1;
                   break;
                 }
                 //else if(i==tgtSheetObj.RowCount){
                 //  currRow = i;
                 //}
               }
                tgtSheetObj.SetSelectRow(currRow);
                //ComShowMessage(rowLevel);
                for (i=0; i<arr.length; i++) {
                    tgtSheetObj.DataInsert(tgtSheetObj.GetSelectRow(),rowLevel);
                    tgtSheetObj.SetCellValue(tgtSheetObj.GetSelectRow(),"chd_pgm_no",srcSheetObj.GetCellValue(arr[i],"pgm_no"));
                    tgtSheetObj.SetCellValue(tgtSheetObj.GetSelectRow(),"pgm_nm",srcSheetObj.GetCellValue(arr[i],"pgm_nm"));
                    tgtSheetObj.SetCellValue(tgtSheetObj.GetSelectRow(),"dp_seq",currOrder+1);
                    tgtSheetObj.SetCellValue(tgtSheetObj.GetSelectRow(),"pgm_lvl_val",rowLevel);
                    tgtSheetObj.SetCellValue(tgtSheetObj.GetSelectRow(),"mnu_cfg_cd",tgtSheetObj.GetCellValue(tgtSheetObj.GetSelectRow()-1,"mnu_cfg_cd"));
                    tgtSheetObj.SetCellValue(tgtSheetObj.GetSelectRow(),"prnt_pgm_no",prntPgm);
                }
                setMenuOrder(tgtSheetObj,tgtSheetObj.GetSelectRow());
                break;
             }else{// || tgtSheetObj.GetSelectRow()== tgtSheetObj.RowCount()// Leaf인 경우
                for (i=0; i<arr.length; i++) {
                    tgtSheetObj.DataInsert(tgtSheetObj.GetSelectRow()+1,tgtSheetObj.GetRowLevel(tgtSheetObj.GetSelectRow()));
                    tgtSheetObj.SetCellValue(tgtSheetObj.GetSelectRow(),"chd_pgm_no",srcSheetObj.GetCellValue(arr[i],"pgm_no"));
                    tgtSheetObj.SetCellValue(tgtSheetObj.GetSelectRow(),"pgm_nm",srcSheetObj.GetCellValue(arr[i],"pgm_nm"));
                    tgtSheetObj.SetCellValue(tgtSheetObj.GetSelectRow(),"dp_seq",eval(tgtSheetObj.GetCellValue(tgtSheetObj.GetSelectRow()-1,"dp_seq"))+1);
                    tgtSheetObj.SetCellValue(tgtSheetObj.GetSelectRow(),"pgm_lvl_val",tgtSheetObj.GetRowLevel(tgtSheetObj.GetSelectRow()));
                    tgtSheetObj.SetCellValue(tgtSheetObj.GetSelectRow(),"mnu_cfg_cd",tgtSheetObj.GetCellValue(tgtSheetObj.GetSelectRow()-1,"mnu_cfg_cd"));
                    tgtSheetObj.SetCellValue(tgtSheetObj.GetSelectRow(),"prnt_pgm_no",tgtSheetObj.GetCellValue(tgtSheetObj.GetSelectRow()-1,"prnt_pgm_no"));
                    //tgtSheetObj.showTreeLevel(-1);
                }
                setMenuOrder(tgtSheetObj,tgtSheetObj.GetSelectRow());
                break;
             }
        }
    }
    /**
     * 추가/변경된 메뉴의 메뉴순번을 재정렬한다.
     */
    function setMenuOrder(sheetObj,currRow){
      //ComShowMessage(currRow);
      var nodes=getSiblingNodes(sheetObj,currRow);
      //ComShowMessage(nodes.join(","));
      for(k=0;k<nodes.length;k++){
        sheetObj.SetCellValue(nodes[k],"dp_seq",k+1,0);
      }
    }
    /**
     * 파라메터로 받은 행번호의 데이터와 동일한 부모노드를 가진 자식노드들의 배열을 넘긴다.
     */
    function getSiblingNodes(sheetObj,currRow){
      //부모노드의 트리레벨
      var parentGetRowLevel=sheetObj.GetRowLevel(currRow)-1;
      //부모노드의 프로그램번호
      var parentPgmNo=sheetObj.GetCellValue(currRow,"prnt_pgm_no");
      //부모노드의 행번호
      var parentRow=0;
      //자식노드 배열
      var childNodes=new Array();
      //자식노드 배열인덱스
      var arrIndex=0;
      //ComShowMessage("변수선언 완료");
      //부모노드 찾기
      for(i=currRow-1;i>-1;i--){
    	  if(sheetObj.GetCellValue(i,"chd_pgm_no")==parentPgmNo){
          parentRow=i;
          break;
        }
      }
      //ComShowMessage("부모노드 찾기 완료 :" + parentRow);
      //자식노드 찾기
      for(j=parentRow+1;j<=sheetObj.RowCount();j++){
        if(sheetObj.GetRowLevel(j)<=parentGetRowLevel){
          //ComShowMessage("자식노드 찾기 if :" + j);
          break;
        }else if(sheetObj.GetCellValue(j,"prnt_pgm_no")==parentPgmNo){
          //ComShowMessage("자식노드 찾기 else if :" + j + " 메뉴번호 :" + sheetObj.CellValue(j,"chd_pgm_no"));
          childNodes[arrIndex++]=j;
        }
      }
      //ComShowMessage("자식노드 찾기 완료");
      return childNodes;
    }
    
    function sheet1_OnSearchEnd(sheetObj, Code, Msg, StCode, StMsg) { 
    	//ComOpenWait(false);
    }
    function sheet2_OnSearchEnd(sheetObj, Code, Msg, StCode, StMsg) { 
    	sheetObj.ShowTreeLevel(1,1);
    	ComOpenWait(false);
    }
	/* 개발자 작업  끝 */
