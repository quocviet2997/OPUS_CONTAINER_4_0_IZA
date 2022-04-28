/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_2001.js
*@FileTitle  : BCM_CCD_2001
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/11
=========================================================*/
/****************************************************************************************
  이벤트 구분 코드: [초기화]INIT=0; [입력]ADD=1; [조회]SEARCH=2; [리스트조회]SEARCHLIST=3;
					[수정]MODIFY=4; [삭제]REMOVE=5; [리스트삭제]REMOVELIST=6 [다중처리]MULTI=7
					기타 여분의 문자상수  COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
/*------------------다음 코드는 JSDoc을 잘 만들기 위해서 추가된 코드임 ------------------*/
   /**
     * @fileoverview 업무에서 공통으로 사용하는 자바스크립트파일로 달력 관련 함수가 정의되어 있다.
     * @author
     */
    /**
     * @extends 
     * @class BCM_CCD_2001 : BCM_CCD_2001 생성을 위한 화면에서 사용하는 업무 스크립트를 정의한다.
     */
  
   	/* 개발자 작업	*/
	// 공통전역변수
	var sheetObjects=new Array();
	var sheetCnt=0;
	var comboObjects=new Array();
	var comboCnt=0;
	var prefix="sheet1_";
	// 버튼클릭이벤트를 받아 처리하는 이벤트핸들러 정의 */
	document.onclick=processButtonClick;
	// 버튼 네임으로 구분하여 프로세스를 분기처리하는 이벤트핸들러 */
	function processButtonClick() {
		/***** 탭당 시트가 2개 이상인 경우엔 추가 시트변수 지정하여 사용한 *****/
		var sheetObject=sheetObjects[0];
		/** **************************************************** */
		var formObj=document.form;
		try {
			var srcName=ComGetEvent("name");
			switch (srcName) {
				case "btn_Retrieve":
					doActionIBSheet(sheetObjects[0], formObj, SEARCH);
					break;
				case "btn_Save":                                   
				    doActionIBSheet(sheetObjects[0],formObj,MULTI); 
					break;	
				case "btn_New":
					ComResetAll();
					formObj.usr_id.value=ComGetObjValue(formObj.login_usr_id);
					//ComEnableManyObjects(false, formObj.usr_id, formObj.btn_com_ens_091);
					sheetObjects[0].RemoveAll();
				    break;		
				 case "btn_RowAdd":
					 var newRow=setDataInsert(sheetObject, 1);
	                 break;
				case "btn_RowDelete":
					doActionIBSheet(sheetObjects[0],formObj,IBDELETE);
					break;
				case "btn_com_ens_091":
					if(window.event.srcElement.style.cursor == "default") return;
					var param="";
		    		param=param + "&" + "srep_cd=" + form.usr_id.value;
		    		ComOpenPopup('/opuscntr/COM_ENS_091.do?' + param, 780, 550, 'setCallBack0B2', '1,0,1,1,1,1,1,1', true);
					break;
				case "btn_CopyAuthority":
					var newRow=sheetObject.DataCopy();
					sheetObject.SetCellValue(newRow, prefix+"cre_usr_id",'',0);
					sheetObject.SetCellValue(newRow, prefix+"cre_dt",'',0);
					break;	
				case "btn_DownExcel":
					sheetObject.Down2Excel( {DownCols: makeHiddenSkipCol(sheetObject), SheetDesign:1,Merge:1,KeyFieldMark:0 });
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
		var sheetObj=sheetObjects[0];
		
		for (i=0; i < sheetObjects.length; i++) {
			ComConfigSheet(sheetObjects[i]);
			initSheet(sheetObjects[i], i + 1);
			ComEndConfigSheet(sheetObjects[i]);
		}
		initControl();
		
		doActionIBCombo(sheetObj, formObj, SEARCH01);
		// User's MDA Administrator info retrieve 
		doActionIBSheet(sheetObj, formObj, SEARCH02);
		if(G_MDAA_CHK == 'Y') {
			ComSetDisplay('btn_RowAdd', true);
			ComSetDisplay('btn_RowDelete', true);
			ComSetDisplay('btn_Save', true);
			ComSetDisplay('btn_CopyAuthority', true);
		} else {
			formObj.usr_id.value=ComGetObjValue(formObj.login_usr_id);
			// 비활성화
			ComEnableManyObjects(false, formObj.usr_id, formObj.btn_com_ens_091);
		}
		doActionIBSheet(sheetObj, formObj, SEARCH);
	}
	/**
	 * 페이지에 있는 HTML Control의 이벤트를 동적으로 로드한다. <br>
	 * {@link #loadPage}함수에서 이 함수를 호출하여 IBSheet Object를 초기화 한다. <br>
	 * 
	 * @param {ibsheet}
	 *            sheetObj IBSheet Object
	 * @param {int}
	 *            sheetNo sheetObjects 배열에서 순번
	 */
	function initControl() {
		var formObject=document.form;
		//Axon 이벤트 처리1. 이벤트catch(개발자변경)
		axon_event.addListenerForm('change', 'obj_change', form);
//	    axon_event.addListenerFormat('keypress',       'obj_keypress',    formObject); //- 키보드 입력할때
//	    axon_event.addListener ('keydown', 'ComKeyEnter', 'form');
//	    axon_event.addListener  ('keyup'  , 'obj_keyup', 'cust_cd', 'addr_tp_cd');
	    ComClearSeparator (formObject.cust_cd,"eng"); //한글 변환 키 막기 
	}
	/**
	 * CustomerCode, AddressType 입력시 자동조회. <br>
	 **/
//    function obj_keyup() {
//    	var keyValue=event.keyCode;
//    	var formObj=document.form;
//    	if(formObj.cust_cd.value != "" && formObj.addr_tp_cd.GetSelectCode()!= ""){
//    		doActionIBSheet(sheetObjects[0], formObj, SEARCH);
//    	}
//    }
//    function obj_focus() {
//      	if(event.srcElement.options){
//      		event.srcElement.focus();
//      	}else{
//      		event.srcElement.select();
//      	}
//    }
	/**
     * 필드 데이타가 CHANGE될 경우 이벤트
     */
    function obj_change(){
    	var formObject=document.form;
        /***** 탭당 시트가 2개 이상인 경우엔 추가 시트변수 지정하여 사용한다 *****/
        var sheetObject1=sheetObjects[0];
        /*******************************************************/
    	try {
    		var srcName=ComGetEvent("name");
            switch(srcName) {
            	case "cust_cd":	
            		if(formObject.cust_cd.value.length>0){
              			if(!ComIsNumber(formObject.cust_cd.value.substring(2,formObject.cust_cd.value.length))){
        		        	formObject.cust_cd.value="";
        		        	ComShowCodeMessage("COM130402", "Customer Code"); 	
        		        	ComSetFocus(document.form.cust_cd);	
        		        	return false;
              			}
          			         doActionIBSheet(sheetObject1, formObject, SEARCH04);
    		         }
            		break;
            	}
    	}catch(e) {
    		if( e == "[object Error]") {
    			ComShowMessage(OBJECT_ERROR);
    		} else {
    			ComShowMessage(e.message);
    		}
    	}
    }
	 /**
	  * 키보드가 눌릴 때 dataformat으로 세팅하고 엔터키를 누를때 조회한다.
	 * @author  
	  */
//	  function obj_keypress() {
//		 	obj=event.srcElement;	 	
//		 	keyValidation(obj);  
//	 }
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
			      if (location.hostname != "")
			      var HeadTitle1="|Del|Seq.|Subject|Authority ID|Type|Office|Name|Granted By|Date";
			      var headCount=ComCountHeadTitle(HeadTitle1);
			      //(headCount, 0, 0, true);
		
			      SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1 } );
		
			      var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
			      var headers = [ { Text:HeadTitle1, Align:"Center"} ];
			      InitHeaders(headers, info);
		
			      var cols = [ {Type:"Status",    Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"ibflag" },
			             {Type:"DummyCheck", Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"delchk" },
			             {Type:"Seq",       Hidden:0, Width:40,   Align:"Center",  ColMerge:0,   SaveName:prefix+"seq" },
			             {Type:"Combo",     Hidden:0, Width:130,  Align:"Center",  ColMerge:0,   SaveName:prefix+"mst_dat_subj_cd", KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1,   EditLen:50 },
			             {Type:"Popup",     Hidden:0, Width:250,  Align:"Center",  ColMerge:0,   SaveName:prefix+"usr_id",          KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
			             {Type:"Combo",     Hidden:0, Width:120,  Align:"Center",  ColMerge:0,   SaveName:prefix+"auth_tp_cd",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:2 },
			             {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:prefix+"ofc_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:0,  Width:180,  Align:"Center",  ColMerge:0,   SaveName:prefix+"usr_nm",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:100 },
			             {Type:"Text",      Hidden:0,  Width:120,  Align:"Center",  ColMerge:0,   SaveName:prefix+"cre_usr_id",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:prefix+"cre_dt",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
			       
			      InitColumns(cols);
		
			      SetEditable(1);
			      SetShowButtonImage(2);
			      //SetSheetHeight(485);
			      resizeSheet();
	      }
			break;
		}
	}
	function resizeSheet(){
		ComResizeSheet(sheetObjects[0]);
	}
	/**
     * search end event
     * @param sheetObj
     * @return
     */
    function sheet1_OnSearchEnd(sheetObj, ErrMsg){
    	 with(sheetObj){
 			  for(i=1; i<= LastRow(); i++){
 				  if (GetCellValue(i, prefix+"mst_dat_subj_cd") == "MDAA"){
 						SetCellEditable(i, prefix+"auth_tp_cd",0);
 					}
 			  }
    	 }
 	}
 	function sheet1_OnPopupClick(sheetObj,Row,Col) {
 		var formObj=document.form;
 		var param="";
 		if (sheetObj.ColSaveName(Col) == prefix+"usr_id") {
	 		param="srep_cd=";
	 		//+sheetObj.CellValue(Row,Col);
			ComOpenPopup('/opuscntr/COM_ENS_091.do?' + param, 780, 550, 'getCOM_ENS_091', '1,0,1,1,1,1,1,1', true, Col, Row);
 		}
 	}
	function getCOM_ENS_091(aryPopupData, Row, Col) {
		var sheetObj=sheetObjects[0];
		var formObj=document.form;
		if ( aryPopupData.length > 0 ) {
			sheetObj.SetCellValue(Row,prefix+"ofc_cd",aryPopupData[0][3]);
			sheetObj.SetCellValue(Row,prefix+"usr_id",aryPopupData[0][4]);
			sheetObj.SetCellValue(Row,prefix+"usr_nm",aryPopupData[0][5]);
		}
	}
	function getCOM_ENS_071(aryPopupData, Row, Col) {
        var sheetObj=sheetObjects[0];
		var formObj=document.form;
		if ( aryPopupData.length > 0 ) {
			sheetObj.SetCellValue(Row,prefix+"ofc_cd",aryPopupData[0][1]);
		}
	}
	 /**
	  * setDataInsert 호출 .<br>
	  * DELT FLG를 'N'으로셋팅 
	  * @param sheetObj, sNo
	  */
		function setDataInsert(sheetObj, sNo) {
			var formObj=document.form;
			// 기본셋트는 상황에 따라 어떻게 변경될지 몰라서 switch 문으로 동일하게 분리시킴
			switch (sNo) {
				case 1:
					var nRow=sheetObj.DataInsert(-1); // 맨하위에 삽입
					sheetObj.SetCellValue(nRow, prefix + "delt_flg",'N');
					break;
			}
			return nRow;
		}
   /**
     * 모든 콤보 박스 조회
     * 공통 부분 완성되면 추가 작업 요
     */
	function doActionIBCombo(sheetObj,formObj,sAction,sComboObj,sComboAction,sComboKey){
		switch (sAction) {
			case SEARCH01: // load page 시
				var sXml=sheetObj.GetSearchData("BCM_CCD_2001GS.do", "f_cmd=" + SEARCH01);
	     		var arrXml=sXml.split("|$$|");
				if (arrXml.length > 0) {
					ComXml2ComboItem(arrXml[0], mst_dat_subj_cd, "cd", "cd_desc");
					ComXml2ComboItem(arrXml[1], auth_tp_cd, "cd", "cd_desc");
					var comboString=ComXml2ComboString(arrXml[0], "cd", "cd_desc");
					sheetObj.SetColProperty(prefix+"mst_dat_subj_cd", {ComboText:comboString[1], ComboCode:comboString[0]} );
					comboString=ComXml2ComboString(arrXml[1], "cd", "cd_desc");
					sheetObj.SetColProperty(prefix+"auth_tp_cd", {ComboText:comboString[1], ComboCode:comboString[0]} );
				}
				break;
     	}
	}
	// Sheet관련 프로세스 처리
	function doActionIBSheet(sheetObj, formObj, sAction) {
		sheetObj.ShowDebugMsg(false);
		switch (sAction) {
			case SEARCH: //조회
				if(!validateForm(sheetObj,formObj,sAction)) {
					return false;
				}
				formObj.f_cmd.value=SEARCH;
				sheetObj.DoSearch("BCM_CCD_2001GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix) );
				break;
			case SEARCH02: // MDAA Checking
				var param='f_cmd=' + SEARCH02;
				var xmlStr=sheetObj.GetSearchData("BCM_CCD_2002GS.do", param);
				var chkVal=ComGetEtcData(xmlStr, "MDAA_CHK");
				// global var setting
				G_MDAA_CHK=chkVal;
				break;	
			case MULTI:        //저장
				if(!validateForm(sheetObj,formObj,sAction)) {
					return false;
				}
				formObj.f_cmd.value=MULTI;
		        var sParam=FormQueryString(formObj) + "&" + sheetObj.GetSaveString(false, true, prefix+"ibflag");
		        if(ComShowConfirm(ComGetMsg("COM130101","Data"))) {
         			//ComOpenWait(true);
		        	var sXml=sheetObj.GetSaveData("BCM_CCD_2001GS.do", sParam);
         			//ComOpenWait(false);
         			var result=ComGetEtcData(sXml, "TRANS_RESULT_KEY");
         			if(result != "F"){
         				ComShowCodeMessage("COM130102", "Data");
         				doActionIBSheet(sheetObj, formObj, SEARCH);
         			}else{
         				sheetObj.LoadSaveData(sXml);
//         				ComShowCodeMessage("COM130103", "Data");
         			}
     			}
		        break;
			case IBDELETE:      // 삭제	 		
				ComRowHideDelete(sheetObj, "sheet1_delchk");
				break;
			case IBCLEAR:      //초기화
	  		     break;
			case SEARCH04:      //Customer Code check
			if(validateForm(sheetObj,formObj,sAction)){
				formObj.f_cmd.value=SEARCH04;
				var sParam=FormQueryString(formObj);
				var sXml=sheetObj.GetSearchData("BCM_CCD_0036GS.do", sParam);
		        var result=ComGetEtcData(sXml, "result");
		        if(result==""){
		        	ComShowCodeMessage("COM130402", "Customer Code");
		        	formObj.cust_cd.value="";
		        	document.form.cust_cd.focus();
		        }else{
		        	document.form.addr_tp_cd.focus();
		        }
				ComOpenWait(false);
			}
			break;
		}	
	}
	function sheet1_OnSaveEnd(sheetObj, ErrMsg){
		 if(ErrMsg != '') {	// 저장 오류 발생
//			 alert(ErrMsg);
		 } else {
		 }
   }
	function addr_tp_cd_OnChange(comboObj, value, code) {
		var formObj=document.form;
		var arrText=code.split("|");
		if(arrText[0]=="1"){
			ComBtnDisable("btn_RowDelete");
		}else {
			ComBtnEnable("btn_RowDelete");
		}
		 //* CustomerCode, AddressType 입력시 자동조회
		if(formObj.cust_cd.value != "" && comboObj.GetSelectText()!= ""){
    		doActionIBSheet(sheetObjects[0], formObj, SEARCH);
    	}
	}
	/**
	 * 팝업에서 check 선택시 부모창으로 값을 전달. <br>
	 * 
	 * @param {ibsheet}
	 *            sheetObj IBSheet Object
	 * @param {String}
	 *            value sheetObj의 입력값
	 */
	function chkCallPopupOK(sheetObj) {
		var formObj=document.form;
		var calllFunc;
		var rArray=null; // 행데이터를 담고 있는 배열
		// 단일선택(Radio) 또는 다중선택(CheckBox) 일 때..
		rArray=chkGetLocalCheckedRows(sheetObj);
		if(rArray == null) {
			ComShowCodeMessage("COM12114", "row");
			return;
		}
		calllFunc=formObj.calllFunc.value;
		opener.eval(calllFunc)(rArray);
		ComClosePopup(); 
	}
	//===================================================================================
	//UI Object Event Handler
	// ===================================================================================
	/**
	 * Carrier Code Pop up에서 읽기. <br>
	 * 
	 * @param {arry}
	 *            aryPopupData
	 * @return 없음
	 * @see
	 * @author 조원주
	 * @version 2010.02.17
	 */ 
	function setCallBack0B2(aryPopupData) {
		var form=document.form;
		form.usr_id.value=aryPopupData[0][4];
	}
	 /**
	 * 화면 폼입력값에 대한 유효성검증 프로세스 처리
	 */
	function validateForm(sheetObj, formObj, sAction) {
		 switch (sAction) {
	    	case SEARCH:
	    		break;
	    	case MULTI:
	            for (i=1; i<=sheetObj.LastRow(); i++) {
	            	if(sheetObj.GetCellValue(i, prefix+"mst_dat_subj_cd") == "") {
	            		ComShowCodeMessage("CCD00001", "Subject");
			        	sheetObj.SelectCell(i, prefix+"mst_dat_subj_cd");
			        	return false;
	            	}
	            	if(sheetObj.GetCellValue(i, prefix+"usr_id") == "") {
	            		ComShowCodeMessage("CCD00001", "Authority ID");
			        	sheetObj.SelectCell(i, prefix+"usr_id");
			        	return false;
	            	}
	            	if(sheetObj.GetCellValue(i, prefix+"auth_tp_cd") == "") {
	            		ComShowCodeMessage("CCD00001", "Type");
			        	sheetObj.SelectCell(i, prefix+"auth_tp_cd");
			        	return false;
	            	}
				}
	            var dupRow=sheetObj.ColValueDup(prefix+"mst_dat_subj_cd|" + prefix+"usr_id");
	            if(dupRow != -1) {
	            	ComShowCodeMessage("CCD00004", "Subject and Authority ID");
	            	sheetObj.SetSelectRow(dupRow);
	            	return false;
	            }
	            break;
		 	}
	    	return true;
	}
	/**
	   * OnChange 이벤트 발생시 호출되는 function <br>
	   * @author 
	   * @version 2011.02.25
	 */  	
	function sheet1_OnChange(sheetObj, row, col, value){
		  	var formObject=document.form;
		   	var colname=sheetObj.ColSaveName(col);
	   	with (sheetObj) {
		   	switch(colname){
		   		case prefix+"mst_dat_subj_cd":
		    		if (value == 'MDAA' || value == 'CRDT') { 
		    			sheetObj.SetCellValue(row, prefix+"auth_tp_cd","S",0);
		    			sheetObj.SetCellEditable(row, prefix+"auth_tp_cd",0);
	          		} else {
	          			sheetObj.SetCellEditable(row, prefix+"auth_tp_cd",1);
	          		}
		    		break; 	
		   	}    		
	   	}
	} 
	/**
	 * 
	 * @param sheetObj
	 * @param Row
	 * @param Col
	 * @returns {Boolean}
	 */
	function chkSheetVal(sheetObj, Row, Col){
		with (sheetObj) {
			for(i=1; i <= LastRow(); i++){
				if(i != Row){
					if(sheetObj.GetCellValue(i, prefix+"bzet_nm") == sheetObj.GetCellValue(Row, prefix+"bzet_nm")){
						if(sheetObj.GetCellValue(i, prefix+"bzet_addr") == sheetObj.GetCellValue(Row, prefix+"bzet_addr")){
							if(sheetObj.GetCellValue(i, prefix+"cnt_cd") == sheetObj.GetCellValue(Row, prefix+"cnt_cd")){
								ComShowCodeMessage("CCD00006");
								sheetObj.SetCellValue(Row, Col,"",0);
								sheetObj.SelectCell(Row, Col);
		            			return true;
							}						
						}					
					}
				}
			}
		}
	}
	/* 개발자 작업  끝 */
