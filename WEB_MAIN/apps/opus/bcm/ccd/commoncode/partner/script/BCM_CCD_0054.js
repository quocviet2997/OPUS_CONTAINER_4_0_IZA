/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0054.js
*@FileTitle  : BCM_CCD_0054
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
     * @class BCM_CCD_0054 : BCM_CCD_0054 생성을 위한 화면에서 사용하는 업무 스크립트를 정의한다.
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
				 case "btn_RowAdd":
					 var newRow=setDataInsert(sheetObject, 1);
	                 break;
				case "btn_RowDelete":
					doActionIBSheet(sheetObjects[0],formObj,IBDELETE);
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
		doActionIBSheet(sheetObjects[0], formObj, SEARCH);
//		// User's MDA Administrator info retrieve 
//		doActionIBSheet(sheetObj, formObj, SEARCH02);
//		if(G_MDAA_CHK == 'Y') {
//			ComSetDisplay('btn_RowAdd', true);
//			ComSetDisplay('btn_RowDelete', true);
//			ComSetDisplay('btn_Save', true);
//			ComSetDisplay('btn_CopyAuthority', true);
//		} else {
//			formObj.usr_id.value=ComGetObjValue(formObj.login_usr_id);
//			// 비활성화
//			ComEnableManyObjects(false, formObj.usr_id, formObj.btn_com_ens_091);
//		}
//		doActionIBSheet(sheetObj, formObj, SEARCH);
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
//	    ComClearSeparator (formObject.cust_cd,"eng"); //한글 변환 키 막기 
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
			      if (location.hostname != "")
			      var HeadTitle1="ibflag|sel.|NVO Keyword|Create User|Create Date|Update User|Update Date";
			      var headCount=ComCountHeadTitle(HeadTitle1);
			      //(headCount, 0, 0, true);
		
			      SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1 } );
		
			      var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
			      var headers = [ { Text:HeadTitle1, Align:"Center"} ];
			      InitHeaders(headers, info);
		
			      var cols = [ 
			             {Type:"Status",   Hidden:1,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"ibflag" },
			             {Type:"DummyCheck", Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"delchk" },
			             {Type:"Text",      Hidden:0,  Width:450,  Align:"Center",  ColMerge:0,   SaveName:prefix+"nvocc_kw",          KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
			             {Type:"Text",      Hidden:0,  Width:150,  Align:"Center",  ColMerge:0,   SaveName:prefix+"cre_usr_id",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:100 },
			             {Type:"Text",      Hidden:0,  Width:150,  Align:"Center",  ColMerge:0,   SaveName:prefix+"cre_dt",      KeyField:0,   CalcLogic:"",   Format:"Ymd",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:0,  Width:150,   Align:"Center",  ColMerge:0,   SaveName:prefix+"upd_usr_id",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:0,  Width:150,   Align:"Center",  ColMerge:0,   SaveName:prefix+"upd_dt",          KeyField:0,   CalcLogic:"",   Format:"Ymd",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
			       
			      InitColumns(cols);
		
			      SetEditable(1);
			      SetShowButtonImage(2);
			      SetColProperty(0 ,prefix+"nvocc_kw" , {AcceptKeys:"E|N|[`!@#$%^&*() -_~']"});
			      SetSheetHeight(485);
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
			case SEARCH01:
				var sXml=sheetObj.GetSearchData("BCM_CCD_0054GS.do", "f_cmd=" + SEARCH01);
	     		var arrXml=sXml.split("|$$|");
				if (arrXml.length > 0) {
//					ComXml2ComboItem(arrXml[0], mst_dat_subj_cd, "cd", "cd_desc");
//					ComXml2ComboItem(arrXml[1], auth_tp_cd, "cd", "cd_desc");
					var comboString=ComXml2ComboString(arrXml[0], "cd", "cd_desc");
//					sheetObj.SetColProperty(prefix+"mst_dat_subj_cd", {ComboText:comboString[1], ComboCode:comboString[0]} );
					comboString=ComXml2ComboString(arrXml[1], "cd", "cd_desc");
//					sheetObj.SetColProperty(prefix+"auth_tp_cd", {ComboText:comboString[1], ComboCode:comboString[0]} );
				}
				break;
     	}
	}
//	 Sheet관련 프로세스 처리
	function doActionIBSheet(sheetObj, formObj, sAction) {
		sheetObj.ShowDebugMsg(false);
		switch (sAction) {
			case SEARCH: //조회
				var formObject=document.form;
				if(!validateForm(sheetObj,formObj,sAction)) {
					return false;
				}
				formObj.f_cmd.value=SEARCH;
				sheetObj.DoSearch("BCM_CCD_0054GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix) );
				
				break;
			case MULTI:        //저장
				if(!validateForm(sheetObj,formObj,sAction)) {
					//alert(sheetObj.GetCellValue(prefix+"ibflag"));
					return false;
				}
				formObj.f_cmd.value=MULTI;
				var sParam=FormQueryString(formObj) + "&" + sheetObj.GetSaveString(false, true, prefix+"ibflag");
		        if(ComShowConfirm(ComGetMsg("COM130101","Data"))) {
         			//ComOpenWait(true);
		        	var sXml=sheetObj.GetSaveData("BCM_CCD_0054GS.do", sParam);
         			//ComOpenWait(false);
         			var result=ComGetEtcData(sXml, "TRANS_RESULT_KEY");
         			if(result != "F"){
         				ComShowCodeMessage("COM130102", "Data");
         			}else{
         				sheetObj.LoadSaveData(sXml);
//         				ComShowCodeMessage("COM130103", "Data");
         			}
     			}
	            doActionIBSheet(sheetObjects[0], formObj, SEARCH);
		        break;
			case IBDELETE:      // 삭제	 		
				ComRowHideDelete(sheetObj, "sheet1_delchk");
				break;

			case IBCLEAR:      //초기화
	  		     break;

		}	
	}
	function sheet1_OnSaveEnd(sheetObj, ErrMsg){
		 if(ErrMsg != '') {	// 저장 오류 발생
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
	            	if(sheetObj.GetCellValue(i, prefix+"nvocc_kw") == "") {
	            		ComShowCodeMessage("CCD00001", "NVO Keyword");
			        	sheetObj.SelectCell(i, prefix+"nvocc_kw");
			        	return false;
	            	}
				}
	            var dupRow=sheetObj.ColValueDup(prefix+"nvocc_kw")
	            if(dupRow != -1) {
	            	ComShowCodeMessage("CCD00004", "NVO Keyword");
	            	sheetObj.SetSelectRow(dupRow);
	            	return false;
	            }
	            
	            for (i=1; i<=sheetObj.LastRow(); i++) {
	            	if(sheetObj.GetCellValue(i, prefix+"nvocc_kw").length > 50) {
	            		ComShowCodeMessage("CCD00063");
			        	sheetObj.SelectCell(i, prefix+"nvocc_kw");
			        	return false;
	            	}
				}
	            
	            break;
		 	}
	    	return true;
	    	
	}

	/**
	 * 
	 * @param sheetObj
	 * @param Row
	 * @param Col
	 * @returns {Boolean}
	 */
//	function chkSheetVal(sheetObj, Row, Col){
//		with (sheetObj) {
//			for(i=1; i <= LastRow(); i++){
//				if(i != Row){
//					if(sheetObj.GetCellValue(i, prefix+"bzet_nm") == sheetObj.GetCellValue(Row, prefix+"bzet_nm")){
//						if(sheetObj.GetCellValue(i, prefix+"bzet_addr") == sheetObj.GetCellValue(Row, prefix+"bzet_addr")){
//							if(sheetObj.GetCellValue(i, prefix+"cnt_cd") == sheetObj.GetCellValue(Row, prefix+"cnt_cd")){
//								ComShowCodeMessage("CCD00006");
//								sheetObj.SetCellValue(Row, Col,"",0);
//								sheetObj.SelectCell(Row, Col);
//		            			return true;
//							}						
//						}					
//					}
//				}
//			}
//		}
//	}
	/* 개발자 작업  끝 */
