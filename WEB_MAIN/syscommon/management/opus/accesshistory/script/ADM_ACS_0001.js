/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : ADM_ACS_0001.js
*@FileTitle  : ADM_ACS_0001
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
    var timer;
    var sheetObjects=new Array();
    var sheetCnt=0;
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
				case "btn_Retrieve":
					doActionIBSheet(sheetObject1,formObject,IBSEARCH);
					break;
				case "btn_New":
					sheetObject1.RemoveAll();
					sheetObject1.SetCellValue(0, "level","Level",0);
					formObject.reset();
				    form.dateFrom.value=ComGetDateAdd(ComGetDateAdd(null,"M",-1),"D",-1);
				    form.dateTo.value=ComGetDateAdd(null,"D",0);
				    ComSetObjValue(formObject.level, 6);
					break;
				case "btn_DownExcel":
            		doActionIBSheet(sheetObject2,formObject,IBDOWNEXCEL);
					break;
				case "btn_ofc_cd":
					ComOpenPopupWithTarget('/opuscntr/COM_ENS_071.do?ofc_pts_cd=ALL', 700, 500, "ofc_cd:ofcCd", '0,0,1,1,1,1,1,1', true);
					break;
				case "btn_pgm_no":
					ComOpenPopup("/opuscntr/ESM_HJS_0101.do", 500, 465, "setPgmNo", "0,1,1");
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
     * IBSheet Object를 배열로 등록
     * 향후 다른 항목들을 일괄처리할 필요가 있을 때 배열로 담는 프로세스를 추가할 수 있다
     * 배열은 소스 상단에 정의
     */
    function setSheetObject(sheet_obj){
    	sheetObjects[sheetCnt++]=sheet_obj;
    }
    /**
     * Sheet 기본 설정 및 초기화
     * body 태그의 onLoad 이벤트핸들러 구현
     * 화면을 브라우저에서 로딩한 후에 선처리해야 하는 기능을 추가한다
     */
    function loadPage() {
			for(i=0;i<sheetObjects.length;i++){
				ComConfigSheet (sheetObjects[i]);
				initSheet(sheetObjects[i],i+1);
				ComEndConfigSheet(sheetObjects[i]);
			}
			initControl();
			
			var tmpRhq=rhqOfcId.substring(1,rhqOfcId.length-1).split(", ");
			rhq.SetMultiSeparator(",");
			rhq.SetDropHeight(140);
			for ( var i=0; i<tmpRhq.length; i++) {
				rhq.InsertItem(i, tmpRhq[i], tmpRhq[i]);
			}
			sheetObjects[0].SetColHidden("rhq",1);
			sheetObjects[0].SetColHidden("ofc_cd",1);
			sheetObjects[0].SetColHidden("usr_id",1);
		}
    function initControl() {
      	var formObject=document.form;
          axon_event.addListener ('keydown', 'ComKeyEnter', 'form');
      }
    function obj_deactivate(){
    	 ComChkObjValid(event.srcElement);
   }
   function obj_activate(){
    	 ComClearSeparator(event.srcElement);
   }
      //업무 자바스크립트 OnKeyPress 이벤트 처리
      function keypressFormat() {
      	obj=event.srcElement;
    	    if(obj.dataformat == null) return;
    	    window.defaultStatus=obj.dataformat;
    	    switch(obj.name) {
	        case "pgm_no":
	        	ComKeyOnlyAlphabet('uppernum',"95");
	            break;
	        case "skd_id":
	        	ComKeyOnlyNumber(obj);
	            break;
		    case "dateFrom":
		        ComKeyOnlyNumber(obj, "-"); 
	            break;
		    case "dateTo":
		        ComKeyOnlyNumber(obj, "-"); 
	            break;
    	    }
      }
  /**
     * 시트 초기설정값, 헤더 정의
     * param : sheetObj ==> 시트오브젝트, sheetNo ==> 시트오브젝트 태그의 아이디에 붙인 일련번호
     * 시트가 다수일 경우 시트 수만큼 case를 추가하여 시트 초기화모듈을 구성한다
     */
    function initSheet(sheetObj,sheetNo) {
        var cnt=0;
		var sheetID=sheetObj.id;
		switch(sheetID) {
            case "sheet1":
                with(sheetObj){
              var HeadTitle1="Level||Menu No|Menu Name|Total Count|Menu Count|CUD Count|R Count|ETC Count|RHQ|Office|User ID";
              var headCount=ComCountHeadTitle(HeadTitle1);

              SetConfig( { SearchMode:2, MergeSheet:5, Page:20, FrozenCol:0, DataRowMerge:1, ChildPage:6} );

              var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
              var headers = [ { Text:HeadTitle1, Align:"Center"} ];
              InitHeaders(headers, info);

              var cols = [ {Type:"Text",      Hidden:0, Width:70,   Align:"Center",  ColMerge:1,   SaveName:"level",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   TreeCol:1 ,  LevelSaveName:"level" },
                     {Type:"Text",      Hidden:1, Width:100,  Align:"Center",  ColMerge:1,   SaveName:"hlvl",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                     {Type:"Text",      Hidden:0, Width:120,  Align:"Center",  ColMerge:1,   SaveName:"pgm_no",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                     {Type:"Text",      Hidden:0, Width:300,  Align:"Left",    ColMerge:1,   SaveName:"pgm_nm",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                     {Type:"Text",      Hidden:0, Width:100,  Align:"Right",   ColMerge:1,   SaveName:"cnt_total",  KeyField:0,   CalcLogic:"",   Format:"NullInteger", PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                     {Type:"Text",      Hidden:0, Width:100,  Align:"Right",   ColMerge:1,   SaveName:"cnt_load",   KeyField:0,   CalcLogic:"",   Format:"NullInteger", PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                     {Type:"Text",      Hidden:0, Width:100,  Align:"Right",   ColMerge:1,   SaveName:"cnt_cud",    KeyField:0,   CalcLogic:"",   Format:"NullInteger", PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                     {Type:"Text",      Hidden:0, Width:100,  Align:"Right",   ColMerge:1,   SaveName:"cnt_rrr",    KeyField:0,   CalcLogic:"",   Format:"NullInteger", PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                     {Type:"Text",      Hidden:0, Width:100,  Align:"Right",   ColMerge:1,   SaveName:"cnt_etc",    KeyField:0,   CalcLogic:"",   Format:"NullInteger", PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                     {Type:"Text",      Hidden:0, Width:100,  Align:"Left",    ColMerge:1,   SaveName:"rhq",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                     {Type:"Text",      Hidden:0, Width:100,  Align:"Left",    ColMerge:1,   SaveName:"ofc_cd",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                     {Type:"Text",      Hidden:0, Width:100,  Align:"Left",    ColMerge:1,   SaveName:"usr_id",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
               
              InitColumns(cols);

              SetCountPosition(0);
	          SetWaitImageVisible(0);
	          SetSheetHeight(400);
            }
            break;
            case "sheet2":
                with(sheetObj){
	              var HeadTitle="Level1|Level2|Level3|Level4|Level5|Level6|Menu No|Menu Name|Total Count|Menu Count|CUD Count|R Count|ETC Count|RHQ|Office|User ID" ;
	              var headCount=ComCountHeadTitle(HeadTitle);
	
	              SetConfig( { SearchMode:2, MergeSheet:5, Page:20, FrozenCol:0, DataRowMerge:1, ChildPage:6} );
	
	              var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
	              var headers = [ { Text:HeadTitle, Align:"Center"} ];
	              InitHeaders(headers, info);
	
	              var cols = [ {Type:"Text",      Hidden:0, Width:100,  Align:"Center",  ColMerge:0,   SaveName:"lvl1",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
	                     {Type:"Text",      Hidden:0, Width:100,  Align:"Center",  ColMerge:0,   SaveName:"lvl2",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
	                     {Type:"Text",      Hidden:0, Width:100,  Align:"Center",  ColMerge:0,   SaveName:"lvl3",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
	                     {Type:"Text",      Hidden:0, Width:100,  Align:"Center",  ColMerge:0,   SaveName:"lvl4",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
	                     {Type:"Text",      Hidden:0, Width:100,  Align:"Center",  ColMerge:0,   SaveName:"lvl5",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
	                     {Type:"Text",      Hidden:0, Width:100,  Align:"Center",  ColMerge:0,   SaveName:"lvl6",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
	                     {Type:"Text",      Hidden:0, Width:100,  Align:"Center",  ColMerge:0,   SaveName:"pgm_no",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
	                     {Type:"Text",      Hidden:0, Width:150,  Align:"Center",  ColMerge:0,   SaveName:"pgm_nm",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
	                     {Type:"Text",      Hidden:0, Width:100,  Align:"Right",   ColMerge:1,   SaveName:"cnt_total",  KeyField:0,   CalcLogic:"",   Format:"NullInteger", PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	                     {Type:"Text",      Hidden:0, Width:100,  Align:"Right",   ColMerge:1,   SaveName:"cnt_load",   KeyField:0,   CalcLogic:"",   Format:"NullInteger", PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	                     {Type:"Text",      Hidden:0, Width:100,  Align:"Right",   ColMerge:1,   SaveName:"cnt_cud",    KeyField:0,   CalcLogic:"",   Format:"NullInteger", PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	                     {Type:"Text",      Hidden:0, Width:100,  Align:"Right",   ColMerge:1,   SaveName:"cnt_rrr",    KeyField:0,   CalcLogic:"",   Format:"NullInteger", PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	                     {Type:"Text",      Hidden:0, Width:100,  Align:"Right",   ColMerge:1,   SaveName:"cnt_etc",    KeyField:0,   CalcLogic:"",   Format:"NullInteger", PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	                     {Type:"Text",      Hidden:0, Width:100,  Align:"Left",    ColMerge:1,   SaveName:"rhq",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	                     {Type:"Text",      Hidden:0, Width:100,  Align:"Left",    ColMerge:1,   SaveName:"ofc_cd",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	                     {Type:"Text",      Hidden:0, Width:100,  Align:"Left",    ColMerge:1,   SaveName:"usr_id",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
	               
	              InitColumns(cols);
	
	              SetVisible(0);
	              SetCountPosition(0);
	              SetWaitImageVisible(0);
	            }
           break;
        }
    }
  // Sheet관련 프로세스 처리
    function doActionIBSheet(sheetObj,formObj,sAction) {
        //sheetObj.ShowDebugMsg(false);
        switch(sAction) {
			case IBSEARCH:      //조회
				if(!validateForm(sheetObj,formObj,sAction)) return;
		    	ComOpenWait(true);
				formObj.f_cmd.value=SEARCH;
				var key = ComSearchEtcData(sheetObj, "ADM_ACS_0001GS.do", FormQueryString(formObj), "key");
				timer = setInterval('checkHistoryData(0,'+key+');', '5000');
				//document.all.btn_Retrieve.innerHTML='<font color=red>Searching</font>';
				break;
			case IBDOWNEXCEL:		// Excel download
				ComOpenWait(true);
		    	formObj.f_cmd.value=SEARCH01;
				var key = ComSearchEtcData(sheetObj, "ADM_ACS_0001GS.do", FormQueryString(formObj), "key");
				timer = setInterval('checkHistoryData(1,'+key+');', '5000');
				//document.all.btn_DownExcel.innerHTML='<font color=red>Downloading</font>';
				break;
        }
    }
    function checkHistoryData(sheetNum,key) {
    	var formObj=document.form;
    	var sheetObj=sheetObjects[sheetNum];
		formObj.f_cmd.value=SEARCH02;
    	var sXml=sheetObj.GetSearchData("ADM_ACS_0001GS.do?key="+key, FormQueryString(formObj));
    	if ( ComGetEtcData(sXml,"key") == key ) return;
    	
    	clearInterval(timer);
    	sheetObj.LoadSearchData(sXml );
    }
    
    function sheet2_OnSearchEnd(sheetObj){
    	ComOpenWait(false);
    	sheetGetColHidden(sheetObj);
    	sheetObjects[0].Down2Excel({ HiddenColumn:-1});
    	if(sheetObj.RowCount() < 1){
    		ComShowCodeMessage("COM132501");
    	}else{
    		sheetObj.Down2Excel({ HiddenColumn:-1});
    	}
		//document.all.btn_DownExcel.innerHTML='<font color=white>Down Excel</font>';
    }
    
    function sheet1_OnSearchEnd(sheetObj){
    	ComOpenWait(false);
    	//document.all.btn_Retrieve.innerHTML='<font color=white>Search</font>';
		sheetObj.ShowTreeLevel(document.form.level.value,1);
		
    	//sheetObj.RederSheet=0;
    	calculateSubSum(sheetObj, "4", "5", "#CCFFCC")
    	calculateSubSum(sheetObj, "3", "4", "#99FF99")
    	calculateSubSum(sheetObj, "2", "3", "#33FF33")
    	calculateSubSum(sheetObj, "1", "2", "#33CC33")
    	sheetGetColHidden(sheetObj);
    	sheetObj.SetCellValue(0, "level","Level (-)",0);
    	//sheetObj.RederSheet=1;
    }
    function sheet1_OnSort(sheetObj, Col, SortArrow) {
    	if ( Col == 0 ) {
    		if ( sheetObj.GetCellValue(Col, "level") == "Level (-)" ) {
    			sheetObj.ShowTreeLevel(0,1);
    			sheetObj.SetCellValue(Col, "level","Level (+)",0);
    		} else {
    			sheetObj.ShowTreeLevel(-1);
    			sheetObj.SetCellValue(Col, "level","Level (-)",0);
    		}
    	}
    }
    function calculateSubSum(sheetObj, plvl, clvl, color){
    	//alert(plvl+' '+clvl+' '+color);
    	var preColNum=0;
    	var totTOT=0;
    	var totLOAD=0;
    	var totCUD=0;
    	var totREAD=0;
    	var totETC=0;
		for(var i=1; i<sheetObj.RowCount()+1; i++) {
			if(sheetObj.GetCellValue(i, "hlvl") == plvl) {
    			if ( preColNum > 0 ) {
    				sheetObj.SetCellValue(preColNum, "cnt_total",totTOT,0);
         			sheetObj.SetCellBackColor(preColNum,"cnt_total",color);
    				sheetObj.SetCellValue(preColNum, "cnt_load",totLOAD,0);
         			sheetObj.SetCellBackColor(preColNum,"cnt_load",color);
    				sheetObj.SetCellValue(preColNum, "cnt_cud",totCUD,0);
         			sheetObj.SetCellBackColor(preColNum,"cnt_cud",color);
    				sheetObj.SetCellValue(preColNum, "cnt_rrr",totREAD,0);
         			sheetObj.SetCellBackColor(preColNum,"cnt_rrr",color);
    				sheetObj.SetCellValue(preColNum, "cnt_etc",totETC,0);
         			sheetObj.SetCellBackColor(preColNum,"cnt_etc",color);
        			totTOT=0; totLOAD=0; totCUD=0; totREAD=0; totETC=0;
    			}
    			if (sheetObj.GetCellValue(i, "cnt_total") == "") preColNum=i;
    			else preColNum=0;
   			}
			if(sheetObj.GetCellValue(i, "hlvl") == clvl) {
    	    	var tmpTOT=0;
    	    	var tmpLOAD=0;
    	    	var tmpCUD=0;
    	    	var tmpREAD=0;
    	    	var tmpETC=0;
			if ( sheetObj.GetCellValue(i, "cnt_total") == "" ) sheetObj.SetCellValue(i, "cnt_total",0,0);
			else tmpTOT=sheetObj.GetCellValue(i, "cnt_total");
			if ( sheetObj.GetCellValue(i, "cnt_load") == "" ) sheetObj.SetCellValue(i, "cnt_load",0,0);
			else tmpLOAD=sheetObj.GetCellValue(i, "cnt_load");
			if ( sheetObj.GetCellValue(i, "cnt_cud") == "" ) sheetObj.SetCellValue(i, "cnt_cud",0,0);
			else tmpCUD=sheetObj.GetCellValue(i, "cnt_cud");
			if ( sheetObj.GetCellValue(i, "cnt_rrr") == "" ) sheetObj.SetCellValue(i, "cnt_rrr",0,0);
			else tmpREAD=sheetObj.GetCellValue(i, "cnt_rrr");
			if ( sheetObj.GetCellValue(i, "cnt_etc") == "" ) sheetObj.SetCellValue(i, "cnt_etc",0,0);
			else tmpETC=sheetObj.GetCellValue(i, "cnt_etc");
    			totTOT=totTOT + parseInt(tmpTOT,10);
    			totLOAD=totLOAD + parseInt(tmpLOAD,10);
    			totCUD=totCUD + parseInt(tmpCUD,10);
    			totREAD=totREAD + parseInt(tmpREAD,10);
    			totETC=totETC + parseInt(tmpETC,10);
    		}
   		}
		if ( preColNum > 0 ) {
			sheetObj.SetCellValue(preColNum, "cnt_total",totTOT,0);
 			sheetObj.SetCellBackColor(preColNum,"cnt_total",color);
			sheetObj.SetCellValue(preColNum, "cnt_load",totLOAD,0);
 			sheetObj.SetCellBackColor(preColNum,"cnt_load",color);
			sheetObj.SetCellValue(preColNum, "cnt_cud",totCUD,0);
 			sheetObj.SetCellBackColor(preColNum,"cnt_cud",color);
			sheetObj.SetCellValue(preColNum, "cnt_rrr",totREAD,0);
 			sheetObj.SetCellBackColor(preColNum,"cnt_rrr",color);
			sheetObj.SetCellValue(preColNum, "cnt_etc",totETC,0);
 			sheetObj.SetCellBackColor(preColNum,"cnt_etc",color);
			preColNum=0;
		}
    }
    function sheetGetColHidden(sheetObj){
    	var kind=document.form.kind.value;
    	var rhq=document.form.rhq.value;
    	var ofcCd=document.form.ofcCd.value;
    	var usrId=document.form.usrId.value;
    	if (kind == "") {
    		sheetObj.SetColHidden("cnt_total",0);
    		sheetObj.SetColHidden("cnt_load",0);
    		sheetObj.SetColHidden("cnt_cud",0);
    		sheetObj.SetColHidden("cnt_rrr",0);
    		sheetObj.SetColHidden("cnt_etc",0);
    	} else if (kind == "M") {
    		sheetObj.SetColHidden("cnt_total",0);
    		sheetObj.SetColHidden("cnt_load",0);
    		sheetObj.SetColHidden("cnt_cud",1);
    		sheetObj.SetColHidden("cnt_rrr",1);
    		sheetObj.SetColHidden("cnt_etc",1);
		} else if (kind == "C") {
			sheetObj.SetColHidden("cnt_total",0);
			sheetObj.SetColHidden("cnt_load",1);
			sheetObj.SetColHidden("cnt_cud",0);
			sheetObj.SetColHidden("cnt_rrr",1);
			sheetObj.SetColHidden("cnt_etc",1);
		} else if (kind == "R") {
			sheetObj.SetColHidden("cnt_total",0);
			sheetObj.SetColHidden("cnt_load",1);
			sheetObj.SetColHidden("cnt_cud",1);
			sheetObj.SetColHidden("cnt_rrr",0);
			sheetObj.SetColHidden("cnt_etc",1);
		} else if (kind == "E") {
			sheetObj.SetColHidden("cnt_total",0);
			sheetObj.SetColHidden("cnt_load",1);
			sheetObj.SetColHidden("cnt_cud",1);
			sheetObj.SetColHidden("cnt_rrr",1);
			sheetObj.SetColHidden("cnt_etc",0);
		}
    	if (rhq == "") {
    		sheetObj.SetColHidden("rhq",1);
    	} else {
    		sheetObj.SetColHidden("rhq",0);
    	}
    	if (ofcCd == "") {
    		sheetObj.SetColHidden("ofc_cd",1);
    	} else {
    		sheetObj.SetColHidden("ofc_cd",0);
    	}
    	if (usrId == "") {
    		sheetObj.SetColHidden("usr_id",1);
    	} else {
    		sheetObj.SetColHidden("usr_id",0);
    	}
    	sheetObj.FitColWidth();
    }
    /**
     * 팝업에서 Check로 멀티 선택을 한경우..
     */
    function setPgmNo(rowArray) {
    	var form=document.form;
    	form.pgmNo.value="";
    	var gubun=',';
    	for(var i=0; i<rowArray.length; i++)
    	{
    		if(i == rowArray.length-1) gubun='';
    		colArray=rowArray[i];
    		form.pgmNo.value += colArray[2] + gubun;
    	}
    }
    /**
     * 화면 폼입력값에 대한 유효성검증 프로세스 처리
     */
    function validateForm(sheetObj,formObj,sAction){
        return true;
    }
	/* 개발자 작업  끝 */
