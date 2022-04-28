/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : ADM_BAT_0002.js
*@FileTitle  : Batch Job Schedule Log
*@author     : CLT
*@version    : 1.0
*@since      : 2014/04/08
=========================================================*/
var tabObjects=new Array();
var tabCnt=0 ;
var beforetab=1;
var sheetObjects=new Array();
var sheetCnt=0;
document.onclick=processButtonClick;
    function processButtonClick(){
		var sheetObject1=sheetObjects[0];
        var formObject=document.form;
    	try {
    		var srcName=ComGetEvent("name");
            switch(srcName) {
				case "btn_Retrieve":
					doActionIBSheet(sheetObject1,formObject,IBSEARCH);
					break;
				case "btn_DirectExcute":
					doActionIBSheet(sheetObject1,formObject,IBSAVE);
					break;
				case "btn_LogDownload":
					document.log_ifr.downloadFile();
					break;
				case "btn_DownExcel":
					if(sheetObject1.RowCount() < 1){
						ComShowCodeMessage("COM132501");
					}else{
						엑셀다운코드
						sheetObject1.Down2Excel();
					}
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
	}
    
    function initControl() {
      	var formObject=document.form;
          //Axon 이벤트 처리1. 이벤트catch(개발자변경)
          axon_event.addListenerFormat('keypress', 'keypressFormat', formObject);
          axon_event.addListener ('keydown', 'ComKeyEnter', 'form');
    }
      //업무 자바스크립트 OnKeyPress 이벤트 처리
    function keypressFormat() {
    	obj = ComGetEvent();
        if(obj.dataformat == null) return;
    	    window.defaultStatus=obj.dataformat;
    	    switch(obj.name) {
	        case "pgm_no":
	        	ComKeyOnlyAlphabet('uppernum',"95");
	            break;
	        case "skd_id":
	        	ComKeyOnlyNumber(obj);
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
			var HeadTitle1="|Log ID|Job ID|Job Type|Program No.|Out Log|Error Log|Status|Start Time|End Time|Elapsed Time|||";
			var headCount=ComCountHeadTitle(HeadTitle1);
			SetConfig( { SearchMode:2, MergeSheet:5, Page:20, FrozenCol:0, DataRowMerge:1 } );
			var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
			var headers = [ { Text:HeadTitle1, Align:"Center"} ];
			InitHeaders(headers, info);
			
			var cols = [ {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"ibflag" },
						{Type:"Text",      Hidden:1, Width:100,  Align:"Center",  ColMerge:1,   SaveName:"log_id",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
						{Type:"Text",      Hidden:0, Width:70,   Align:"Center",  ColMerge:1,   SaveName:"skd_id",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
						{Type:"Combo",     Hidden:0, Width:80,   Align:"Center",  ColMerge:1,   SaveName:"skd_tp_cd",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0, ComboText:"Direct|Reserved|Scheduled", ComboCode:"D|R|S"},
						{Type:"Text",      Hidden:0, Width:150,  Align:"Center",  ColMerge:1,   SaveName:"pgm_no",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
						{Type:"Popup",     Hidden:0, Width:80,   Align:"Center",  ColMerge:1,   SaveName:"out",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
						{Type:"Popup",     Hidden:0, Width:80,   Align:"Center",  ColMerge:1,   SaveName:"err",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
						{Type:"Combo",     Hidden:0, Width:90,   Align:"Center",  ColMerge:1,   SaveName:"sts_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0, ComboText:"RUNNING|STARTING|SUCCESS|FAILURE|TERMINATED|ON_ICE|INACTIVE|ACTIVATED|RESTART|ON_HOLD|QUE_WAIT", ComboCode:"1|3|4|5|6|7|8|9|10|11|12"},
						{Type:"Text",      Hidden:0, Width:130,  Align:"Center",  ColMerge:1,   SaveName:"st_tm",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0, Format:"####-##-####:##:##"},
						{Type:"Text",      Hidden:0, Width:130,  Align:"Center",  ColMerge:1,   SaveName:"end_tm",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0, Format:"####-##-####:##:##"},
						{Type:"Text",      Hidden:0, Width:70,   Align:"Center",  ColMerge:1,   SaveName:"elapsed_time",  KeyField:0,   CalcLogic:"",   Format:"Hm",          PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
						{Type:"Text",      Hidden:1, Width:100,  Align:"Center",  ColMerge:1,   SaveName:"std_out_file",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
						{Type:"Text",      Hidden:1, Width:100,  Align:"Center",  ColMerge:1,   SaveName:"std_err_file",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
						{Type:"Text",      Hidden:1, Width:100,  Align:"Center",  ColMerge:1,   SaveName:"machine",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
			  
			InitColumns(cols);
			SetCountPosition(0);
			SetShowButtonImage(2);
			SetSheetHeight(202);
        	}
		break;
        }
    }
  
  // Sheet관련 프로세스 처리
    function doActionIBSheet(sheetObj,formObj,sAction) {
        sheetObj.ShowDebugMsg(false);
        switch(sAction) {
			case IBSEARCH:      //조회
				if(validateForm(sheetObj,formObj,sAction))
					if (sheetObj.id == "sheet1") {
						formObj.f_cmd.value=SEARCH;
 						sheetObj.DoSearch("ADM_BAT_0002GS.do", FormQueryString(formObj) );
					}
			break;
        }
    }
    /**
     * 화면 폼입력값에 대한 유효성검증 프로세스 처리
     */
    function validateForm(sheetObj,formObj,sAction){
		switch(sAction) {
			case IBSEARCH:
	    		with(formObj){
	                if (formObj.pgm_no.value == "" && formObj.skd_id.value == "") {
	                	alert('Input Job ID or Progarm No.'); 
	                    formObj.pgm_no.focus();
	                   return false;
	                }
	    		}
	    		break;
        }
        return true;
    }
      /**
     * Program Name Data List OpenWindow. <br>
     * @param {int}	Row	행번호
     * @param {int}	Col	컬럼번호
     **/
    function sheet1_OnPopupClick(sheetObj,Row,Col){
         switch (sheetObj.ColSaveName(Col)) {
			case "out" :
			getFileContents(sheetObj.GetCellValue(Row, "machine"),sheetObj.GetCellValue(Row, "std_out_file"));
			break;
			case "err" :
			getFileContents(sheetObj.GetCellValue(Row, "machine"),sheetObj.GetCellValue(Row, "std_err_file"));
			break;
 	   	 }
    }
    
    function getFileContents(machine, filepath){
        var frm=document.form;
        var url='';
        if ( machine == 'ktx6600b' ) url='http://203.246.130.159:7310';
        else if ( machine == 'kox6600b' ) url='http://203.246.130.137:7310';
        else if ( machine == 'kox6600c' ) url='http://203.246.130.138:7310';
        else if ( machine == 'kox6600d' ) url='http://203.246.130.139:7310';
        else if ( machine == 'kox6600e' ) url='http://203.246.130.145:7310';
        else if ( machine == 'kos5220f' ) url='http://203.246.130.154:7310';
        else url='';
        frm.target="log_ifr";
        frm.filepath.value=filepath;
        frm.action=url+"/opuscntr/syscommon/management/alps/schedule/jsp/fileview.jsp";
        frm.submit();
    }
