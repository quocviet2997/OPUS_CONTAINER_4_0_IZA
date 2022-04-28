/*=========================================================
* * 1.0 Creation
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0043.js
*@FileTitle  :  Zone report
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/10
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
     * @class BCM_CCD_0043 : BCM_CCD_0043 생성을 위한 화면에서 사용하는 업무 스크립트를 정의한다.
     */
    function BCM_CCD_0043() {
    	this.processButtonClick=tprocessButtonClick;
    	this.setSheetObject=setSheetObject;
    	this.loadPage=loadPage;
    	this.initSheet=initSheet;
    	this.initControl=initControl;
    	this.doActionIBSheet=doActionIBSheet;
    	this.setTabObject=setTabObject;
    	this.validateForm=validateForm;
    }
    // 공통전역변수
	var sheetObjects=new Array();
	var sheetCnt=0;
	var comboObjects=new Array();
	var comboCnt=0;
	var create_cust_cd='';
	// 버튼클릭이벤트를 받아 처리하는 이벤트핸들러 정의 */
	document.onclick=processButtonClick;
	// 버튼 네임으로 구분하여 프로세스를 분기처리하는 이벤트핸들러 */
	function processButtonClick() {
		/***** 탭당 시트가 2개 이상인 경우엔 추가 시트변수 지정하여 사용한 *****/
		var sheetObject=sheetObjects[0];
		var sheetObject1=sheetObjects[1];
		/** **************************************************** */
		var formObj=document.form;
		try {
			var srcName=ComGetEvent("name");
			switch (srcName) {
			case "btn_downexcel":
				doActionIBSheet(sheetObjects[0], formObj, SEARCH);
				break;
			case "btn_New":
				doActionIBSheet(sheetObjects[0],formObj,IBCLEAR);
			    break;	
			case "btn_com_ens_041":
				var param="";
	    		param=param + "&" + "cust_seq=" + form.cust_seq.value;
	    		ComOpenPopup('/opuscntr/COM_ENS_041.do?' + param, 780, 500, 'setCallBack0B2', '1,0,1,1,1,1,1,1', true);
				break;
			case "btn_com_ens_0M1":
				var param="";
	    		param=param + "&" + "cust_cnt_cd=" + form.cust_cnt_cd.value;
	    		ComOpenPopup('/opuscntr/COM_ENS_0M1.do?' + param, 780, 470, 'setCallBack0B5', '1,0,1,1,1,1,1,1', true);
				break;
             case "btn_com_ens_051":
				var param="";
	    		param=param + "&" + "loc_cd=" + form.loc_cd.value;
	    		ComOpenPopup('/opuscntr/COM_ENS_051.do?' + param, 780, 470, 'setCallBack0B1', '1,0,1,1,1,1,1,1', true);
				break;
             case "btn_com_ens_071":
 				var param="";
 	    		param=param + "&" + "ofc_cd=" + form.ofc_cd.value;
 	    		ComOpenPopup('/opuscntr/COM_ENS_071.do?' + param, 780, 520, 'setCallBack0B3', '1,0,1,1,1,1,1,1', true);
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
		initControl();
		doActionIBSheet(sheetObjects[0],document.form,IBCLEAR);
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
//		axon_event.addListenerForm('change', 'obj_change', form);
//	    axon_event.addListenerFormat('keypress',       'obj_keypress',    formObject); //- 키보드 입력할때
//	    axon_event.addListener ('keydown', 'ComKeyEnter', 'form');
	    ComClearSeparator (formObject.cust_cd,"eng"); //한글 변환 키 막기 
	    ComClearSeparator (document.form.cust_cnt_cd,"eng"); //한글 변환 키 막기 
		ComClearSeparator (document.form.cust_lgl_eng_nm,"eng");
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
			        
			      var HeadTitle1="|Customer Code|Customer Country|Legal English Name|Local Language Name|Parent|Legacy Customer Code|Legacy Customer Name|Address|Abbreviation|Tax Payer ID or Registry No.|Location Code|Admin. Office|Sales Rep Code|Firm/Private|Customer Type|Customer Hierarchy|Individual/Group|Container Customer Type|Need Base Seg. Class1|Need Base Seg. Class2|Need Base Seg. Class3|Need Base Seg. Class|Vendor Code|Group Customer|Multi Trade Account|Named Customer Flag|Key Account Flag|Key Account Effective Date|Key Account Expire Date|Foundation Date|Finance Status|Employees|Industry Type|Yearly Volume (TEU)|Listed Stock|CTS No.|Capital Currency|Capital Amount|Remark|Standard Carrier Alpha Code|NVO FMC License No|NVO FMC Bond No|FMC Bond Amount|Bond Effective Date|Bond Expire Date|F/FWDR FMC File No|Priority for Rail Road|EDI Invoice Number Required|MOT Number|MOT Effective Date|MOT Expire Date|Certificate|Track in CRM|Delete Flag";
		
			      SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1 } );		
			      var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
			      var headers = [ { Text:HeadTitle1, Align:"Center"} ];
			      InitHeaders(headers, info);
		
			      var cols = [ {Type:"Status",   Hidden:1,  Width:0,    Align:"Left",  ColMerge:0,   SaveName:"ibflag" },
			                   {Type:"Text",     Hidden:0,  Width:40,   Align:"Left",  ColMerge:0,   SaveName:"cust_cnt_cd" },
			                   {Type:"Text",     Hidden:0,  Width:40,   Align:"Left",  ColMerge:0,   SaveName:"cust_seq" },
			                   {Type:"Text",     Hidden:0,  Width:40,   Align:"Left",  ColMerge:0,   SaveName:"cust_lgl_eng_nm" },
			                   {Type:"Text",     Hidden:0,  Width:40,   Align:"Left",  ColMerge:0,   SaveName:"cust_locl_lang_nm" },
			                   {Type:"Text",     Hidden:0,  Width:40,   Align:"Left",  ColMerge:0,   SaveName:"lgcy_co_cd" },
			                   {Type:"Text",     Hidden:0,  Width:40,   Align:"Left",  ColMerge:0,   SaveName:"lgcy_cd" },
			                   {Type:"Text",     Hidden:0,  Width:40,   Align:"Left",  ColMerge:0,   SaveName:"lgcy_nm" },
			                   {Type:"Text",     Hidden:0,  Width:40,   Align:"Left",  ColMerge:0,   SaveName:"bzet_addr" },
			                   {Type:"Text",     Hidden:0,  Width:40,   Align:"Left",  ColMerge:0,   SaveName:"cust_abbr_nm" },
			                   {Type:"Text",     Hidden:0,  Width:40,   Align:"Left",  ColMerge:0,   SaveName:"cust_rgst_no" },
			                   {Type:"Text",     Hidden:0,  Width:40,   Align:"Left",  ColMerge:0,   SaveName:"loc_cd" },
			                   {Type:"Text",     Hidden:0,  Width:40,   Align:"Left",  ColMerge:0,   SaveName:"ofc_cd" },
			                   {Type:"Text",     Hidden:0,  Width:40,   Align:"Left",  ColMerge:0,   SaveName:"srep_cd" },
			                   {Type:"Text",     Hidden:0,  Width:40,   Align:"Left",  ColMerge:0,   SaveName:"indiv_corp_div_cd" },
			                   {Type:"Text",     Hidden:0,  Width:40,   Align:"Left",  ColMerge:0,   SaveName:"cntr_div_flg" },
			                   {Type:"Text",     Hidden:0,  Width:40,   Align:"Left",  ColMerge:0,   SaveName:"cntr_cust_tp_cd" },
			                   {Type:"Text",     Hidden:0,  Width:40,   Align:"Left",  ColMerge:0,   SaveName:"cust_grp_hrchy_cd" },
			                   {Type:"Text",     Hidden:0,  Width:40,   Align:"Left",  ColMerge:0,   SaveName:"cust_div_cd" },
			                   {Type:"Text",     Hidden:0,  Width:40,   Align:"Left",  ColMerge:0,   SaveName:"nbs_clss_cd1" },
			                   {Type:"Text",     Hidden:0,  Width:40,   Align:"Left",  ColMerge:0,   SaveName:"nbs_clss_cd2" },
			                   {Type:"Text",     Hidden:0,  Width:40,   Align:"Left",  ColMerge:0,   SaveName:"nbs_clss_cd3" },
			                   {Type:"Text",     Hidden:0,  Width:40,   Align:"Left",  ColMerge:0,   SaveName:"vbs_clss_cd" },
			                   {Type:"Text",     Hidden:0,  Width:40,   Align:"Left",  ColMerge:0,   SaveName:"vndr_seq" },
			                   {Type:"Text",     Hidden:0,  Width:40,   Align:"Left",  ColMerge:0,   SaveName:"cust_grp_id" },
			                   {Type:"Text",     Hidden:0,  Width:40,   Align:"Left",  ColMerge:0,   SaveName:"mlt_trd_acct_flg" },
			                   {Type:"Text",     Hidden:0,  Width:40,   Align:"Left",  ColMerge:0,   SaveName:"nmd_cust_flg" },
			                   {Type:"Text",     Hidden:0,  Width:40,   Align:"Left",  ColMerge:0,   SaveName:"key_acct_flg" },
			                   {Type:"Text",     Hidden:0,  Width:40,   Align:"Left",  ColMerge:0,   SaveName:"key_acct_st_eff_dt" },
			                   {Type:"Text",     Hidden:0,  Width:40,   Align:"Left",  ColMerge:0,   SaveName:"key_acct_end_eff_dt" },
			                   {Type:"Text",     Hidden:0,  Width:40,   Align:"Left",  ColMerge:0,   SaveName:"fndt_dt" },
			                   {Type:"Text",     Hidden:0,  Width:40,   Align:"Left",  ColMerge:0,   SaveName:"finc_sts_lvl_cd" },
			                   {Type:"Text",     Hidden:0,  Width:40,   Align:"Left",  ColMerge:0,   SaveName:"empe_knt" },
			                   {Type:"Text",     Hidden:0,  Width:40,   Align:"Left",  ColMerge:0,   SaveName:"indus_desc" },
			                   {Type:"Text",     Hidden:0,  Width:40,   Align:"Left",  ColMerge:0,   SaveName:"crnt_vol_knt" },
			                   {Type:"Text",     Hidden:0,  Width:40,   Align:"Left",  ColMerge:0,   SaveName:"lstk_flg" },
			                   {Type:"Text",     Hidden:0,  Width:40,   Align:"Left",  ColMerge:0,   SaveName:"cts_no" },
			                   {Type:"Text",     Hidden:0,  Width:40,   Align:"Left",  ColMerge:0,   SaveName:"capi_curr_cd" },
			                   {Type:"Text",     Hidden:0,  Width:40,   Align:"Left",  ColMerge:0,   SaveName:"capi_amt" },
			                   {Type:"Text",     Hidden:0,  Width:40,   Align:"Left",  ColMerge:0,   SaveName:"cust_rmk" },
			                   {Type:"Text",     Hidden:0,  Width:40,   Align:"Left",  ColMerge:0,   SaveName:"nvocc_co_scac_cd" },
			                   {Type:"Text",     Hidden:0,  Width:40,   Align:"Left",  ColMerge:0,   SaveName:"nvocc_lic_no" },
			                   {Type:"Text",     Hidden:0,  Width:40,   Align:"Left",  ColMerge:0,   SaveName:"nvocc_bd_no" },
			                   {Type:"Text",     Hidden:0,  Width:40,   Align:"Left",  ColMerge:0,   SaveName:"nvocc_bd_amt" },
			                   {Type:"Text",     Hidden:0,  Width:40,   Align:"Left",  ColMerge:0,   SaveName:"nvocc_bd_st_eff_dt" },
			                   {Type:"Text",     Hidden:0,  Width:40,   Align:"Left",  ColMerge:0,   SaveName:"nvocc_bd_end_eff_dt" },
			                   {Type:"Text",     Hidden:0,  Width:40,   Align:"Left",  ColMerge:0,   SaveName:"frt_fwrd_fmc_no" },
			                   {Type:"Text",     Hidden:0,  Width:40,   Align:"Left",  ColMerge:0,   SaveName:"rail_road_prio_flg" },
			                   {Type:"Text",     Hidden:0,  Width:40,   Align:"Left",  ColMerge:0,   SaveName:"edi_inv_no_req_flg" },
			                   {Type:"Text",     Hidden:0,  Width:40,   Align:"Left",  ColMerge:0,   SaveName:"mot_no" },
			                   {Type:"Text",     Hidden:0,  Width:40,   Align:"Left",  ColMerge:0,   SaveName:"mot_eff_dt" },
			                   {Type:"Text",     Hidden:0,  Width:40,   Align:"Left",  ColMerge:0,   SaveName:"mot_exp_dt" },
			                   {Type:"Text",     Hidden:0,  Width:40,   Align:"Left",  ColMerge:0,   SaveName:"certi_flg" },
			                   {Type:"Text",     Hidden:0,  Width:40,   Align:"Left",  ColMerge:0,   SaveName:"crm_if_flg" },
			                   {Type:"Text",     Hidden:0,  Width:40,   Align:"Left",  ColMerge:0,   SaveName:"delt_flg" } ];
			       
			      InitColumns(cols);
		
			      SetEditable(1);
			      SetWaitImageVisible(0);
			      SetSheetHeight(300);
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
			if(formObj.cust_cnt_cd.value == "" || formObj.cust_cnt_cd.value == null){
		 		alert("Mandatory fiels is missing. Please enter Country Code");
		 		ComSetFocus(formObj.cust_cnt_cd);
		 		break;
		 	}
    		formObj.f_cmd.value=SEARCH01;
    		sheetObj.SetWaitImageVisible(0);
        	ComOpenWait(true);
    		var sParam=FormQueryString(formObj);
    		var sXml=sheetObj.GetSearchData("BCM_CCD_0043GS.do", sParam);
    		var sav=ComGetEtcData(sXml, "TRANS_RESULT_KEY");
    		if(sav != 'S'){
    			ComOpenWait(false);
    			ComShowCodeMessage("CCD00002");
    			return;
    		}else{
    			var rowCnt=ComGetEtcData(sXml, "row_cnt");
    			ComOpenWait(false);
    			if(rowCnt == 0){
    				ComOpenWait(false);
	    			ComShowCodeMessage("CCD00002");
	    			return;
    			}else if(ComShowCodeConfirm("CCD00011", rowCnt)){
    				ComOpenWait(true);
//	    				formObj.f_cmd.value=SEARCH;
//	    				sParam=FormQueryString(formObj);
//	    				sXml=sheetObj.GetSearchData("BCM_CCD_0043GS.do", sParam);
//	    				sheetObj.LoadSearchData(sXml,{Sync:1} );
//	    				if(sheetObj.RowCount() < 1){//no data	
//	    					ComShowCodeMessage("COM132501");
//	    				}else{	
////	    					 sheetObj.Down2Excel({ HiddenColumn:{HiddenColumn:-1}});
//	    					 sheetObj.Down2Excel({ DownCols: makeHiddenSkipCol(sheetObj)});
//	    				}		    	
    				formObj.f_cmd.value = SEARCH;
    				formObj.target = "_self"
    				formObj.action = "BCM_CCD_0043DL.do?"+ FormQueryString(formObj);
    				formObj.submit();
    				ComOpenWait(false);
    			}
    		}
    		break;
		case IBCLEAR:      //초기화
			formObj.reset();
//    		formObj.status.SetSelectCode("N");
 			ComSetFocus(document.form.cust_cnt_cd);					
		    break;
		case SEARCH02:      //Customer Country Code check
			if(validateForm(sheetObj,formObj,sAction)){
				ComOpenWait(true);
				formObj.f_cmd.value=SEARCH02;
				var sParam=FormQueryString(formObj);
				var sXml=sheetObj.GetSearchData("BCM_CCD_0043GS.do", sParam);
		        var result=ComGetEtcData(sXml, "result");
		        if(result==""){
		        	ComShowCodeMessage("COM130402", "Customer Country Code");
		        	formObj.cust_cnt_cd.value="";
		        }
				ComOpenWait(false);
			}
			break;
    	case SEARCH03:      //Location Code check
			if(validateForm(sheetObj,formObj,sAction)){
				ComOpenWait(true);
				formObj.f_cmd.value=SEARCH03;
				var sParam=FormQueryString(formObj);
				var sXml=sheetObj.GetSearchData("BCM_CCD_0043GS.do", sParam);
		        var result=ComGetEtcData(sXml, "result");
		        if(result==""){
		        	ComShowCodeMessage("COM130402", "Location Code");
		        	formObj.loc_cd.value="";
		        }
				ComOpenWait(false);
			}
			break;
    	case SEARCH04:      //Office Code check
			if(validateForm(sheetObj,formObj,sAction)){
				ComOpenWait(true);
				formObj.f_cmd.value=SEARCH04;
				var sParam=FormQueryString(formObj);
				var sXml=sheetObj.GetSearchData("BCM_CCD_0043GS.do", sParam);
		        var result=ComGetEtcData(sXml, "result");
		        if(result==""){
		        	ComShowCodeMessage("COM130402", "Admin. Officd Code");
		        	formObj.ofc_cd.value="";
		        }
				ComOpenWait(false);
			}
			break;
    	case SEARCH09:      //Customer Code check
			if(validateForm(sheetObj,formObj,sAction)){
				ComOpenWait(true);
				formObj.f_cmd.value=SEARCH09;
				var sParam=FormQueryString(formObj);
				var sXml=sheetObj.GetSearchData("BCM_CCD_0043GS.do", sParam);
		        var result=ComGetEtcData(sXml, "result");
		        if(result==""){
		        	ComShowCodeMessage("COM130402", "Customer Code");
		        	formObj.cust_seq.value="";
		        	document.form.cust_seq.focus();
		        }
				ComOpenWait(false);
			}
			break;
		}	
	 		//ComOpenWait(false);
	}
	/**
	 * 팝업에서 check 선택시 부모창으로 값을 전달. <br>
	 * 
	 * @param {ibsheet} sheetObj IBSheet Object
	 * @param {String} value sheetObj의 입력값
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
	 * @param {arry} aryPopupData
	 * @return 없음
	 * @see
	 * @author 조원주
	 * @version 2010.02.17
	 */ 
	function setCallBack0B2(aryPopupData) {
		var form=document.form;
		form.cust_seq.value=aryPopupData[0][3].substring(2,8);
		form.cust_cnt_cd.value=aryPopupData[0][3].substring(0,2);
	} 
	function setCallBack0B1(aryPopupData) {
		var form=document.form;
		form.loc_cd.value=aryPopupData[0][3];
	} 
	function setCallBack0B3(aryPopupData) {
		var form=document.form;
		form.ofc_cd.value=aryPopupData[0][3];
	}
	function setCallBack0B5(aryPopupData) {
		var form=document.form;
		form.cust_cnt_cd.value=aryPopupData[0][3];
	}
	 /**
	 * 화면 폼입력값에 대한 유효성검증 프로세스 처리
	 */
	function validateForm(sheetObj, formObj, sAction) {
		 switch (sAction) {
		 }
    	return true;
	}
//	  function obj_focus() {
//	      	if(event.srcElement.options){
//	      		event.srcElement.focus();
//	      	}else{
//	      		event.srcElement.select();
//	      	}
//	      }
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
/*
            	case "cust_cnt_cd":
            		if(formObject.cust_cnt_cd.value.length>0){
            			doActionIBSheet(sheetObject1, formObject, SEARCH02);
	            		if(formObject.cust_cnt_cd.value.length==0){
	            			document.form.cust_cnt_cd.focus();
            			}	            			
            		}
            		break;
            	case "loc_cd":
            		if(formObject.loc_cd.value.length>0){
            			doActionIBSheet(sheetObject1, formObject, SEARCH03);
            			if(formObject.loc_cd.value.length==0){
	            			document.form.loc_cd.focus();
	            			}
            		}
            		break;
            	case "ofc_cd":
            		if(formObject.ofc_cd.value.length>0){
            			doActionIBSheet(sheetObject1, formObject, SEARCH04);
            			if(formObject.ofc_cd.value.length==0){
	            			document.form.ofc_cd.focus();
	            		}
            		}
            		break;
*/
            	case "cust_seq":
            		var max_seq=formObject.cust_seq.value;
        			while(max_seq.toString().length < 6){
        				max_seq="0" + max_seq;
        			}
        			formObject.cust_seq.value=max_seq;
            		if((formObject.cust_seq.value.length>0)&&(formObject.cust_cnt_cd.value.length>0)){
            			doActionIBSheet(sheetObject1, formObject, SEARCH09);
            			if(formObject.cust_seq.value.length==0){
	            			document.form.cust_seq.focus();
            			}
            		}
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
   * HTML Object의 OnKeyPress이벤트 처리
   */
//	   function obj_keypress(event) {
//		   obj=event.srcElement;
//		   keyValidation(obj);
//	       var formObj=document.form;
//	       var eleObj=window.event.srcElement;
//	       var srcName=eleObj.getAttribute("name");
//	       switch(srcName) {
//	          case "key_acct_st_eff_dt":						//날짜형식에 맞게 입력 되도록
//	          	checkDateForm(formObj.key_acct_st_eff_dt);
//	          break;
//	          case "key_acct_end_eff_dt":					//날짜형식에 맞게 입력 되도록
//	          	checkDateForm(formObj.key_acct_end_eff_dt);
//	          break;
//	          case "nvocc_bd_st_eff_dt":						//날짜형식에 맞게 입력 되도록
//	          	checkDateForm(formObj.nvocc_bd_st_eff_dt);
//	          break;
//	          case "nvocc_bd_end_eff_dt":					//날짜형식에 맞게 입력 되도록
//	          	checkDateForm(formObj.nvocc_bd_end_eff_dt);
//	          break;
//	          case "fndt_dt":					//날짜형식에 맞게 입력 되도록
//	          	checkDateForm(formObj.fndt_dt);
//	          break;
//	      }
//	   }    
	/* 개발자 작업  끝 */
