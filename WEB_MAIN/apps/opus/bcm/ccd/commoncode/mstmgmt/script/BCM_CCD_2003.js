/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_2003.js
*@FileTitle  : BCM_CCD_2003
*@author     : CLT
*@version    : 1.0
*@since      : 2014/12/02 
=========================================================*/
/****************************************************************************************
  이벤트 구분 코드: [초기화]INIT=0; [입력]ADD=1; [조회]SEARCH=2; [리스트조회]SEARCHLIST=3;
					[수정]MODIFY=4; [삭제]REMOVE=5; [리스트삭제]REMOVELIST=6 [다중처리]MULTI=7
					기타 여분의 문자상수  COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
/*------------------다음 코드는 JSDoc을 잘 만들기 위해서 추가된 코드임 ------------------*/
   /**
     * @fileoverview 업무에서 공통으로 사용하는 자바스크립트파일로 달력 관련 함수가 정의되어 있다.
     * @author 한진해운
     */
    /**
     * @extends 
     * @class BCM_CCD_2003 : BCM_CCD_2003 생성을 위한 화면에서 사용하는 업무 스크립트를 정의한다.
     */
   	/* 개발자 작업	*/
	// 공통전역변수
	var sheetObjects=new Array();
	var sheetCnt=0;
	var comboObjects=new Array();
	var comboCnt=0;
	var prefix="";
	var prefix2="sheet2_";
	var appendPageNo = 1;
   	var appendCondParam = "";
   	var rtv_total = 0;
	// 버튼클릭이벤트를 받아 처리하는 이벤트핸들러 정의 */
	document.onclick=processButtonClick;
	// 버튼 네임으로 구분하여 프로세스를 분기처리하는 이벤트핸들러 */
	function processButtonClick() {
		/***** 탭당 시트가 2개 이상인 경우엔 추가 시트변수 지정하여 사용한 *****/
		var sheetObject=sheetObjects[0];
		var sheetObject2=sheetObjects[1];
		/** **************************************************** */
		var formObj=document.form;
		try {
			var srcName=ComGetEvent("name");
			switch (srcName) {
				case "btns_calendar": //달력 버튼
         			var cal=new ComCalendarFromTo();
                    cal.select(formObj.fm_rqst_dt, formObj.to_rqst_dt, 'yyyy-MM-dd');
					break;
				case "btn_Retrieve":
					doActionIBSheet(sheetObject, formObj, SEARCH);
					break;
				case "btn_New":
					doActionIBSheet(sheetObject, formObj, IBCLEAR);
				    break;		
				case "btn_more":
	                doActionIBSheet1(sheet1, formObj, IBSEARCHAPPEND, appendCondParam, appendPageNo);
	                break;
			} 
		} catch (e) {
			if (e == "[object Error]") {
				ComShowCodeMessage("COM12111");
			} else {
				ComShowMessage(e.message);
			}
		}
	}
	/**
	 * IBSheet Object를 배열로 등록
	 * 향후 다른 항목들을 일괄처리할 필요가 있을 때 배열로 담는 프로세스를 추가할 수 있다
	 * 배열은 소스 상단에 정의
	 */
	function setSheetObject(sheet_obj) {
		sheetObjects[sheetCnt++]=sheet_obj;
	}
	 /**  
	  	 * IBCombo Object를 배열로 등록
	  	 * @param	{IBMultiCombo}	combo_obj	화면에서 사용할 콤보들을 추가한다. 
	  	 * 향후 다른 항목들을 일괄처리할 필요가 있을 때 배열로 담는 프로세스를 추가할 수 있다
	  	 * 배열은 소스 상단에 정의
	  	 */ 
	  	function setComboObject(combo_obj){	     
	      	comboObjects[comboCnt++]=combo_obj;  
	  	} 
	/**
	 * Sheet 기본 설정 및 초기화
	 * body 태그의 onLoad 이벤트핸들러 구현
	 * 화면을 브라우저에서 로딩한 후에 선처리해야 하는 기능을 추가한다
	 */
	function loadPage() {
		var formObj=document.form;
		for (i=0; i < sheetObjects.length; i++) {
			ComConfigSheet(sheetObjects[i]);
			initSheet(sheetObjects[i], i + 1);
			ComEndConfigSheet(sheetObjects[i]);
		}

		doActionIBCombo(sheetObjects[0], formObj, SEARCH01);
		var fmRqstDt=ComGetDateAdd(null, "D", -30);
		var toRqstDt=ComGetNowInfo();
		ComSetObjValue(formObj.fm_rqst_dt, fmRqstDt);
		ComSetObjValue(formObj.to_rqst_dt, toRqstDt);
		rtv_total = 0;
		formObj.pagerows.value=500;
		ComBtnDisable("btn_more");
	}

	//포커스가 나갈 때
    function obj_blur(){
        //입력Validation 확인하기 + 마스크구분자 넣기
        var obj=event.srcElement;
        if(obj.name == 'fm_rqst_dt' || obj.name == 'to_rqst_dt') {
        	ComChkObjValid(obj);
        }
    }


	/**
	 * 시트 초기설정값, 헤더 정의
	 * param : sheetObj ==> 시트오브젝트, sheetNo ==> 시트오브젝트 태그의 아이디에 붙인 일련번호
	 * 시트가 다수일 경우 시트 수만큼 case를 추가하여 시트 초기화모듈을 구성한다
	 */
	function initSheet(sheetObj, sheetNo) {
		var cnt=0;
		var sheetId=sheetObj.id;
		switch (sheetId) {
			case "sheet1":
			    with(sheetObj){
//				      var HeadTitle1="|Sel|Seq.|Request No|Subject|Req. Office|Requester|Code|Name|Req. Date(GMT)|Status|By|Action Date(GMT)|Comment";
//				      var headCount=ComCountHeadTitle(HeadTitle1) + 4;
				
			  	      var HeadTitle ="|Seq.|UI Name|Field Name|Key Value|Key Value|Key Value|Key Value|Key Value|Current Value|Before Value|Modified Date|Modified User ID";
			  	      var HeadTitle1="|Seq.|UI Name|Field Name|1|2|3|4|5|Current Value|Before Value|Modified Date|Modified User ID";
			  	      var headCount=ComCountHeadTitle(HeadTitle1);
		
				      SetConfig( { SearchMode:2, FrozenCol:SaveNameCol(prefix+"tbl_nm"), MergeSheet:5, Page:20, DataRowMerge:1 } );
		
//				      var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
//				      var headers = [ { Text:HeadTitle1, Align:"Center"} ];
//				      InitHeaders(headers, info);
				      var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
					  var headers = [ { Text:HeadTitle, Align:"Center"},{ Text:HeadTitle1, Align:"Center"} ];
					  InitHeaders(headers, info);
					  
				      var cols = [ {Type:"Status",    Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"ibflag" },
				             {Type:"Seq",       Hidden:0, Width:40,   Align:"Center",  ColMerge:0,   SaveName:prefix+"seq" },
				             {Type:"Text",      Hidden:0,  Width:160,  Align:"Left",  ColMerge:0,   SaveName:prefix+"tbl_nm", KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				             {Type:"Text",      Hidden:0,  Width:200,   Align:"Left",  ColMerge:0,   SaveName:prefix+"col_nm",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				             {Type:"Text",      Hidden:0,  Width:120,   Align:"Left",  ColMerge:0,   SaveName:prefix+"n1st_key_col_nm",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				             {Type:"Text",      Hidden:0,  Width:120,   Align:"Left",  ColMerge:0,   SaveName:prefix+"n2nd_key_col_nm",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				             {Type:"Text",      Hidden:0,  Width:120,   Align:"Left",  ColMerge:0,   SaveName:prefix+"n3nd_key_col_nm",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				             {Type:"Text",      Hidden:0,  Width:120,   Align:"Left",  ColMerge:0,   SaveName:prefix+"n4nd_key_col_nm",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				             {Type:"Text",      Hidden:0,  Width:120,   Align:"Left",  ColMerge:0,   SaveName:prefix+"n5nd_key_col_nm",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				             {Type:"Text",      Hidden:0,  Width:160,  Align:"Left",  ColMerge:0,   SaveName:prefix+"aft_ctnt",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				             {Type:"Text",      Hidden:0,  Width:160,  Align:"Left",  ColMerge:0,   SaveName:prefix+"pre_ctnt",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				             {Type:"Text",      Hidden:0,  Width:100,   Align:"Center",  ColMerge:0,   SaveName:prefix+"upd_dt",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				             {Type:"Text",      Hidden:0,  Width:100,   Align:"Center",  ColMerge:0,   SaveName:prefix+"upd_usr_id",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 }]
				      
				      InitColumns(cols);
		
				      SetEditable(1);
				      FrozenCols=SaveNameCol(prefix+"tbl_nm");
				      SetShowButtonImage(2);
				     // SetSheetHeight(225);
				      SetHighlightAfterSort(0);
				      resizeSheet( sheetObj );
		      	}
				break;
		}
	}
	function resizeSheet(){
		ComResizeSheet(sheetObjects[1]);
	}


   /**
     * 모든 콤보 박스 조회
     * 공통 부분 완성되면 추가 작업 요
     */
	function doActionIBCombo(sheetObj,formObj,sAction,sComboObj,sComboAction,sComboKey){
		switch (sAction) {
			case SEARCH01: // load page 시
				var sXml=sheetObj.GetSearchData("BCM_CCD_2003GS.do", "f_cmd=" + SEARCH01);
	     		var arrXml=sXml.split("|$$|");
				if (arrXml.length > 0) {
					ComXml2ComboItem(arrXml[0], mst_table_cd, "cd", "cd_desc");
					mst_table_cd.SetSelectIndex(0, true);
				}
				break;
				
			case SEARCH02: // TABLE콤보 변경시
				var sXml=sheetObj.GetSearchData("BCM_CCD_2003GS.do", "f_cmd=" + SEARCH02 + "&tbl_nm="+formObj.tbl_nm.value);
	     		var arrXml=sXml.split("|$$|");
				if (arrXml.length > 0) {
					ComXml2ComboItem(arrXml[0], mst_column_cd, "cd", "cd_desc");
				}
				break;
     	}
	}
	// Sheet관련 프로세스 처리
	function doActionIBSheet(sheetObj, formObj, sAction, flag) {
		sheetObj.ShowDebugMsg(false);
		switch (sAction) {
			case SEARCH: //조회
				if(!validateForm(sheetObj,formObj,sAction)) {
					return false;
				}
                if(sheetObj.id == "sheet1") {
                    formObj.f_cmd.value=SEARCH;
                    
                    rowTotal = 0;
    				rtv_total=rowTotal;					
    				if(Number(rowTotal) > formObj.pagerows.value) {
    					ComBtnEnable("btn_more");
    				}else{
    					ComBtnDisable("btn_more");
    				}
                   
    				appendPageNo=1;
    				appendCondParam = FormQueryString(formObj);	
                    sheetObj.DoSearch("BCM_CCD_2003GS.do", FormQueryString(formObj) );
                }

				break;
			case IBCLEAR:      //초기화
				ComResetAll();
				var fmRqstDt=ComGetDateAdd(null, "D", -30);
				var toRqstDt=ComGetNowInfo();
				ComSetObjValue(formObj.fm_rqst_dt, fmRqstDt);
				ComSetObjValue(formObj.to_rqst_dt, toRqstDt);
				formObj.tbl_nm.value =  "";
				formObj.col_nm.value =  "";
				rtv_total = 0;
				formObj.pagerows.value=500;
				ComBtnDisable("btn_more");
				break;
		}	
	}
	
	/**
     * handling process for Sheet
     */    
    function doActionIBSheet1(sheetObj, formObj, sAction, CondParam, PageNo) {
    	switch(sAction) {
    	case IBSEARCHAPPEND:
    		if(!validateForm(sheetObj,formObj,sAction)) return;
    		ComOpenWait(true);
			sheetObj.SetWaitImageVisible(0);				
			sheetObj.DoSearch("BCM_CCD_2003GS.do", CondParam+"&"+ "iPage="+ appendPageNo,{Append:true} );  	   
	        
			break;
    	}
    }
	
	function resizeSheet( sheetObj ){
	    ComResizeSheet( sheetObj );
	}
	
	/**
	 * 화면 폼입력값에 대한 유효성검증 프로세스 처리
	 */
	function validateForm(sheetObj, formObj, sAction) {
		 switch (sAction) {
	    	case SEARCH:
	    		 if (ComGetDaysBetween(formObj.fm_rqst_dt.value, formObj.to_rqst_dt.value) < 0 ){
		    		   ComShowCodeMessage('COM12133', 'To date','From date','grater');
		    		   formObj.to_rqst_dt.focus();
		    		   return false;
			          }
	    		break;
		 }
	    return true;
	}
	
	/**
	 * In case of selecting table combo data <br>
	 **/
	
	function mst_table_cd_OnChange(obj,oldindex, oldtext, oldcode , newindex, newtext , newcode){
		var formObj=document.form;
		formObj.tbl_nm.value =  newcode;
		if(obj.GetSelectCode() != '' || obj.GetSelectCode() != ' ') {
			doActionIBCombo(sheetObjects[0], formObj, SEARCH02);
		}
	}
	
	function mst_column_cd_OnChange(obj,oldindex, oldtext, oldcode , newindex, newtext , newcode){
		var formObj=document.form;
		formObj.col_nm.value =  newcode;
		if(obj.GetSelectCode() != '' || obj.GetSelectCode() != ' ') {
			doActionIBSheet(sheetObjects[0], formObj, SEARCH);
		}
	}
	
	/**
     * calling event after retrieving Sheet
	 * @param sheetObj
	 * @param ErrMsg
     */
    function sheet1_OnSearchEnd(sheetObj, ErrMsg) {
    	var formObj = document.form;
    	if(appendPageNo == 1){
    		rtv_total = sheetObj.GetEtcData("rtv_total");
    	}
    	if (sheetObj.RowCount()< rtv_total) {
            // setting page number for APPEND retrieving
            appendPageNo=Math.ceil(sheetObj.RowCount()/ formObj.pagerows.value) + 1;
            ComBtnEnable("btn_more");
        } else {
        	appendPageNo = 1;
            ComBtnDisable("btn_more");
        }		
    	sheetObj.SetWaitImageVisible(0);
    	ComOpenWait(false);    	
    }
	
	/* 개발자 작업  끝 */
