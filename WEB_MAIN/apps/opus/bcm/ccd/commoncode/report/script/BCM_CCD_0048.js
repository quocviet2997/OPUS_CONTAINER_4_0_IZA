/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0048.js
*@FileTitle  : Office Report
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/11
=========================================================*/
/****************************************************************************************
  이벤트 구분 코드: [초기화]INIT=0;  [조회]SEARCH=1;
 ***************************************************************************************/
/*------------------다음 코드는 JSDoc을 잘 만들기 위해서 추가된 코드임 ------------------*/
   /**
     * @fileoverview 업무에서 공통으로 사용하는 자바스크립트파일로 달력 관련 함수가 정의되어 있다.
     * @author
     */
    /**
     * @extends
     * @class BCM_CCD_0048 : BCM_CCD_0048 생성을 위한 화면에서 사용하는 업무 스크립트를 정의한다.
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
    function processButtonClick(){
        var formObj=document.form;
        try {
            var srcName=ComGetEvent("name");
            switch(srcName) {
            case "btn_DownExcel":
				doActionIBSheet(sheetObjects[0],formObj,SEARCH);
				break;
            case "btn_new":
            	doActionIBSheet(sheetObjects[0],formObj,IBCLEAR);
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
     * IBSheet Object를 배열로 등록
     * 향후 다른 항목들을 일괄처리할 필요가 있을 때 배열로 담는 프로세스를 추가할 수 있다
     * 배열은 소스 상단에 정의
     */
    function setSheetObject(sheet_obj){
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
        for(i=0;i<sheetObjects.length;i++){
            ComConfigSheet (sheetObjects[i]);
            initSheet(sheetObjects[i],i+1);
            ComEndConfigSheet(sheetObjects[i]);
        }
        initControl();
        doActionIBCombo(sheetObjects[0], formObj, SEARCH02);
    }
    /**
     * 시트 초기설정값, 헤더 정의
     * param : sheetObj ==> 시트오브젝트, sheetNo ==> 시트오브젝트 태그의 아이디에 붙인 일련번호
     * 시트가 다수일 경우 시트 수만큼 case를 추가하여 시트 초기화모듈을 구성한다
     */
    function initSheet(sheetObj,sheetNo) {
    	var cnt=0;
		        with(sheetObj){

		          var HeadTitle="|Office Code|English Name|Local Name|INTL Tel. No|Tel. No|INTL Fax No|Fax No|URL|Office Rep Email|ZIP Code|Address|Local Address|";
		          HeadTitle+="Office Type|Communication Code (G/W)|Office Kind|Agent Type|Parent Office|Inactive Sales Org.|Location Code|Fax IP Address|";
		          HeadTitle+="Open Date|Close Date|Pseudo Code (TAX/GL)|Non-Use in BKG/DOC|Non-Use in Finance|Subsidiary Company Flag|Sales Office  DIV|Remark|";
		          HeadTitle+="A/R Office|A/R Regional HQ|A/R Center Code|Finance Region|O/B Credit Term (Days)|I/B Credit Term (Days)|A/R Currency|";
		          HeadTitle+="Rep. Customer Code|Invoice Prefix|Fixed Currency Exch. Rate|Office TAX Payer ID|ASA Credit Term (Days)|Sub Agent|";
		          HeadTitle+="A/P Office|A/P Control Office|A/P Center Code|G/L Center Code|A/P Currency|Vendor Country Code|Vendor Code|S/O Interface|";
		          //HeadTitle+="PrepaidParty|Alternate Currency|Manual Booking Option|Trade for ERP|Sakura Agent Code|Delete Flag|Create User|Create Date/Time|Last Update User|Last Update Date/Time";
		          HeadTitle+="PrepaidParty|Alternate Currency|Manual Booking Option|SAP CTR Code|SAP Office Code|Delete Flag|Create User|Create Date/Time|Last Update User|Last Update Date/Time";

		          SetConfig( { SearchMode:2, MergeSheet:0, Page:20, DataRowMerge:0 } );

		          var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
		          var headers = [ { Text:HeadTitle, Align:"Center"} ];
		          InitHeaders(headers, info);

		          var cols = [ {Type:"Status",    Hidden:1, Width:50,   Align:"Center",  ColMerge:0,   SaveName:"ibflag" },
		                 {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",ColMerge:0,   SaveName:"ofc_cd",              KeyField:0,   CalcLogic:"",   Format:"" },
		                 {Type:"Text",      Hidden:0,  Width:200,  Align:"Left",  ColMerge:0,   SaveName:"ofc_eng_nm",          KeyField:0,   CalcLogic:"",   Format:"" },
		                 {Type:"Text",      Hidden:0,  Width:200,  Align:"Left",  ColMerge:0,   SaveName:"ofc_locl_nm",         KeyField:0,   CalcLogic:"",   Format:"" },
		                 {Type:"Text",      Hidden:0,  Width:170,  Align:"Left",  ColMerge:0,   SaveName:"intl_phn_no",         KeyField:0,   CalcLogic:"",   Format:"" },
		                 {Type:"Text",      Hidden:0,  Width:120,  Align:"Left",  ColMerge:0,   SaveName:"ofc_phn_no",          KeyField:0,   CalcLogic:"",   Format:"" },
		                 {Type:"Text",      Hidden:0,  Width:200,  Align:"Left",  ColMerge:0,   SaveName:"intl_fax_no",         KeyField:0,   CalcLogic:"",   Format:"" },
		                 {Type:"Text",      Hidden:0,  Width:100,  Align:"Left",  ColMerge:0,   SaveName:"ofc_fax_no",          KeyField:0,   CalcLogic:"",   Format:"" },
		                 {Type:"Text",      Hidden:0,  Width:120,  Align:"Left",  ColMerge:0,   SaveName:"ofc_url",             KeyField:0,   CalcLogic:"",   Format:"" },
		                 {Type:"Text",      Hidden:0,  Width:120,  Align:"Left",  ColMerge:0,   SaveName:"ofc_rep_eml",         KeyField:0,   CalcLogic:"",   Format:"" },
		                 {Type:"Text",      Hidden:0,  Width:120,  Align:"Left",  ColMerge:0,   SaveName:"ofc_zip_cd",          KeyField:0,   CalcLogic:"",   Format:"" },
		                 {Type:"Text",      Hidden:0,  Width:100,  Align:"Left",  ColMerge:0,   SaveName:"ofc_addr",            KeyField:0,   CalcLogic:"",   Format:"" },
		                 {Type:"Text",      Hidden:0,  Width:200,  Align:"Left",  ColMerge:0,   SaveName:"ofc_locl_lang_addr",  KeyField:0,   CalcLogic:"",   Format:"" },
		                 {Type:"Text",      Hidden:0,  Width:200,  Align:"Left",  ColMerge:0,   SaveName:"ofc_tp_cd",           KeyField:0,   CalcLogic:"",   Format:"" },
		                 {Type:"Text",      Hidden:0,  Width:170,  Align:"Left",  ColMerge:0,   SaveName:"ofc_cmmc_cd",         KeyField:0,   CalcLogic:"",   Format:"" },
		                 {Type:"Text",      Hidden:0,  Width:120,  Align:"Left",  ColMerge:0,   SaveName:"ofc_knd_cd",          KeyField:0,   CalcLogic:"",   Format:"" },
		                 {Type:"Text",      Hidden:0,  Width:200,  Align:"Left",  ColMerge:0,   SaveName:"agn_knd_cd",          KeyField:0,   CalcLogic:"",   Format:"" },
		                 {Type:"Text",      Hidden:0,  Width:100,  Align:"Left",  ColMerge:0,   SaveName:"prnt_ofc_cd",         KeyField:0,   CalcLogic:"",   Format:"" },
		                 {Type:"Text",      Hidden:0,  Width:120,  Align:"Left",  ColMerge:0,   SaveName:"ofc_sls_delt_flg",    KeyField:0,   CalcLogic:"",   Format:"" },
		                 {Type:"Text",      Hidden:0,  Width:120,  Align:"Left",  ColMerge:0,   SaveName:"loc_cd",              KeyField:0,   CalcLogic:"",   Format:"" },
		                 {Type:"Text",      Hidden:0,  Width:120,  Align:"Left",  ColMerge:0,   SaveName:"fax_ip",              KeyField:0,   CalcLogic:"",   Format:"" },
		                 {Type:"Text",      Hidden:0,  Width:100,  Align:"Left",  ColMerge:0,   SaveName:"opn_dt",              KeyField:0,   CalcLogic:"",   Format:"" },
		                 {Type:"Text",      Hidden:0,  Width:200,  Align:"Left",  ColMerge:0,   SaveName:"clz_dt",              KeyField:0,   CalcLogic:"",   Format:"" },
		                 {Type:"Text",      Hidden:0,  Width:200,  Align:"Left",  ColMerge:0,   SaveName:"finc_psdo_ofc_flg",   KeyField:0,   CalcLogic:"",   Format:"" },
		                 {Type:"Text",      Hidden:0,  Width:170,  Align:"Left",  ColMerge:0,   SaveName:"doc_rcvr_hide_flg",   KeyField:0,   CalcLogic:"",   Format:"" },
		                 {Type:"Text",      Hidden:0,  Width:120,  Align:"Left",  ColMerge:0,   SaveName:"finc_hide_flg",       KeyField:0,   CalcLogic:"",   Format:"" },
		                 {Type:"Text",      Hidden:0,  Width:200,  Align:"Left",  ColMerge:0,   SaveName:"subs_co_flg",         KeyField:0,   CalcLogic:"",   Format:"" },
		                 {Type:"Text",      Hidden:0,  Width:100,  Align:"Left",  ColMerge:0,   SaveName:"sls_ofc_div_cd",      KeyField:0,   CalcLogic:"",   Format:"" },
//		                 {Type:"Text",      Hidden:0,  Width:120,  Align:"Left",  ColMerge:0,   SaveName:"ofc_rfa_sc_use_flg",  KeyField:0,   CalcLogic:"",   Format:"" },
		                 {Type:"Text",      Hidden:0,  Width:120,  Align:"Left",  ColMerge:0,   SaveName:"ofc_rmk",             KeyField:0,   CalcLogic:"",   Format:"" },
		                 {Type:"Text",      Hidden:0,  Width:120,  Align:"Left",  ColMerge:0,   SaveName:"ar_ofc_cd",           KeyField:0,   CalcLogic:"",   Format:"" },
//		                 {Type:"Text",      Hidden:0,  Width:100,  Align:"Left",  ColMerge:0,   SaveName:"ar_ctrl_ofc_cd",      KeyField:0,   CalcLogic:"",   Format:"" },
		                 {Type:"Text",      Hidden:0,  Width:200,  Align:"Left",  ColMerge:0,   SaveName:"ar_hd_qtr_ofc_cd",    KeyField:0,   CalcLogic:"",   Format:"" },
		                 {Type:"Text",      Hidden:0,  Width:200,  Align:"Left",  ColMerge:0,   SaveName:"ar_ctr_cd",           KeyField:0,   CalcLogic:"",   Format:"" },
		                 {Type:"Text",      Hidden:0,  Width:170,  Align:"Left",  ColMerge:0,   SaveName:"finc_rgn_cd",         KeyField:0,   CalcLogic:"",   Format:"" },
		                 {Type:"Text",      Hidden:0,  Width:120,  Align:"Left",  ColMerge:0,   SaveName:"ob_cr_term_dys",      KeyField:0,   CalcLogic:"",   Format:"" },
		                 {Type:"Text",      Hidden:0,  Width:200,  Align:"Left",  ColMerge:0,   SaveName:"ib_cr_term_dys",      KeyField:0,   CalcLogic:"",   Format:"" },
		                 {Type:"Text",      Hidden:0,  Width:100,  Align:"Left",  ColMerge:0,   SaveName:"ar_curr_cd",          KeyField:0,   CalcLogic:"",   Format:"" },
		                 {Type:"Text",      Hidden:0,  Width:120,  Align:"Left",  ColMerge:0,   SaveName:"rep_cust_cd",         KeyField:0,   CalcLogic:"",   Format:"" },
		                 {Type:"Text",      Hidden:0,  Width:120,  Align:"Left",  ColMerge:0,   SaveName:"inv_pfx_cd",          KeyField:0,   CalcLogic:"",   Format:"" },
		                 {Type:"Text",      Hidden:0,  Width:120,  Align:"Left",  ColMerge:0,   SaveName:"fx_curr_rt",          KeyField:0,   CalcLogic:"",   Format:"" },
		                 {Type:"Text",      Hidden:0,  Width:100,  Align:"Left",  ColMerge:0,   SaveName:"ofc_tax_id",          KeyField:0,   CalcLogic:"",   Format:"" },
		                 {Type:"Text",      Hidden:0,  Width:200,  Align:"Left",  ColMerge:0,   SaveName:"asa_cr_term_dys",     KeyField:0,   CalcLogic:"",   Format:"" },
		                 {Type:"Text",      Hidden:0,  Width:200,  Align:"Left",  ColMerge:0,   SaveName:"sub_agn_flg",         KeyField:0,   CalcLogic:"",   Format:"" },
//		                 {Type:"Text",      Hidden:0,  Width:170,  Align:"Left",  ColMerge:0,   SaveName:"ar_agn_stl_cd",       KeyField:0,   CalcLogic:"",   Format:"" },
		                 {Type:"Text",      Hidden:0,  Width:120,  Align:"Left",  ColMerge:0,   SaveName:"ap_ofc_cd",           KeyField:0,   CalcLogic:"",   Format:"" },
		                 {Type:"Text",      Hidden:0,  Width:200,  Align:"Left",  ColMerge:0,   SaveName:"ap_ctrl_ofc_cd",      KeyField:0,   CalcLogic:"",   Format:"" },
		                 {Type:"Text",      Hidden:0,  Width:100,  Align:"Left",  ColMerge:0,   SaveName:"ap_ctr_cd",           KeyField:0,   CalcLogic:"",   Format:"" },
		                 {Type:"Text",      Hidden:0,  Width:120,  Align:"Left",  ColMerge:0,   SaveName:"gl_ctr_cd",           KeyField:0,   CalcLogic:"",   Format:"" },
//		                 {Type:"Text",      Hidden:0,  Width:120,  Align:"Left",  ColMerge:0,   SaveName:"comm_if_ind_cd",      KeyField:0,   CalcLogic:"",   Format:"" },
		                 {Type:"Text",      Hidden:0,  Width:120,  Align:"Left",  ColMerge:0,   SaveName:"bil_curr_cd",         KeyField:0,   CalcLogic:"",   Format:"" },
		                 {Type:"Text",      Hidden:0,  Width:100,  Align:"Left",  ColMerge:0,   SaveName:"vndr_cnt_cd",         KeyField:0,   CalcLogic:"",   Format:"" },
		                 {Type:"Text",      Hidden:0,  Width:200,  Align:"Left",  ColMerge:0,   SaveName:"vndr_seq",            KeyField:0,   CalcLogic:"",   Format:"" },
		                 {Type:"Text",      Hidden:0,  Width:200,  Align:"Left",  ColMerge:0,   SaveName:"so_if_cd",            KeyField:0,   CalcLogic:"",   Format:"" },
		                 {Type:"Text",      Hidden:0,  Width:200,  Align:"Left",  ColMerge:0,   SaveName:"ppd_pty_tp_cd",       KeyField:0,   CalcLogic:"",   Format:"" },
		                 {Type:"Text",      Hidden:0,  Width:200,  Align:"Left",  ColMerge:0,   SaveName:"altn_curr_div_cd",    KeyField:0,   CalcLogic:"",   Format:"" },
		                 {Type:"Text",      Hidden:0,  Width:200,  Align:"Left",  ColMerge:0,   SaveName:"mnl_bkg_no_opt_cd",   KeyField:0,   CalcLogic:"",   Format:"" },
		                 {Type:"Text",      Hidden:0,  Width:200,  Align:"Left",  ColMerge:0,   SaveName:"modi_cost_ctr_cd",    KeyField:0,   CalcLogic:"",   Format:"" },
		                 {Type:"Text",      Hidden:0,  Width:200,  Align:"Left",  ColMerge:0,   SaveName:"modi_agn_cd",         KeyField:0,   CalcLogic:"",   Format:"" },
		                 {Type:"Text",      Hidden:0,  Width:70,  Align:"Left",  ColMerge:0,   SaveName:"delt_flg",            KeyField:0,   CalcLogic:"",   Format:"" },
		                 {Type:"Text",      Hidden:0,  Width:70,  Align:"Left",  ColMerge:0,   SaveName:"cre_usr_id",            KeyField:0,   CalcLogic:"",   Format:"" },
		                 {Type:"Text",      Hidden:0,  Width:120,  Align:"Left",  ColMerge:0,   SaveName:"cre_dt",            KeyField:0,   CalcLogic:"",   Format:"" },
		                 {Type:"Text",      Hidden:0,  Width:90,  Align:"Left",  ColMerge:0,   SaveName:"upd_usr_id",            KeyField:0,   CalcLogic:"",   Format:"" },
		                 {Type:"Text",      Hidden:0,  Width:150,  Align:"Left",  ColMerge:0,   SaveName:"upd_dt",            KeyField:0,   CalcLogic:"",   Format:"" }];

		          InitColumns(cols);
		          SetVisible(false);
		          SetEditable(1);
        }


    }
    // Sheet관련 프로세스 처리
    function doActionIBSheet(sheetObj,formObj,sAction) {
    	switch(sAction) {
    	case SEARCH:				//조회
    		formObj.f_cmd.value=SEARCH01;
    		sheetObj.SetWaitImageVisible(0);
    	    var sParam=FormQueryString(formObj) + "&" + ComGetPrefixParam("sheet1_");
    	    var sXml=sheetObj.GetSearchData("BCM_CCD_0048GS.do" , sParam);
			if( ComGetEtcData(sXml, "cnt") > 0 ){
				if(ComShowCodeConfirm("CCD00011", ComGetEtcData(sXml, "cnt"))){
					ComOpenWait(true);
					formObj.f_cmd.value=SEARCH;
					var sParam=FormQueryString(formObj);
					var sXml=sheetObj.GetSearchData("BCM_CCD_0048GS.do", sParam);
					if(sXml.length>0){
						sheetObj.LoadSearchData(sXml,{Sync:1} );
						sheetObj.Down2Excel( {FileName : "BCM_CCD_0048DL.xls", DownCols: makeHiddenSkipCol(sheetObj), SheetDesign:1,Merge:1 });

	    			}
	    			ComOpenWait(false);
				}
			}else{
				ComShowCodeMessage("CCD00002");
			}
    		break;
    	case IBCLEAR:
    		formObj.reset();
    		ofc_knd_cd.SetSelectCode("");
    		sheetObj.RemoveAll();
        	sheetObj.RemoveEtcData();
    		break;
    	}
    }
    /**
    * 공통 콤보 박스 조회
    */
    function doActionIBCombo(sheetObj,formObj,sAction,sComboObj,sComboAction,sComboKey){
    	switch (sAction) {
    		case SEARCH02: // load page 시
    			var sXml=sheetObj.GetSearchData("BCM_CCD_0048GS.do", "f_cmd=" + SEARCH02);
    			var rtnValue=sXml.split("|$$|");
    			if(rtnValue!=null && rtnValue.length>0){
    				for(var i=0; i<rtnValue.length; i++){
    					var comboXml=ComXml2ComboString(rtnValue[i], "cd_desc", "cd");
    					if(comboXml!=null && comboXml!=undefined && comboXml!='undefined'){
    						var cdName=comboXml[0].split("|");
    						var cdValue=comboXml[1].split("|");
    						for (var j=0; j < cdName.length; j++) {
    							comboObjects[i].InsertItem(j, cdName[j], cdValue[j]);
    			        	}
    					}
    				}
    			}
    			break;
    	}
    }

    /**
     * 화면 폼입력값에 대한 유효성검증 프로세스 처리
     */
    function validateForm(sheetObj, formObj, sAction) {
    	switch (sAction) {
	    	case SEARCH:
	    		break;
	    	return true;
        }
     }
	function initControl() {
		var formObj=document.form;
//		axon_event.addListenerForm('focus', 'obj_focus', form);
		axon_event.addListenerForm('change', 'obj_change', form); 		// - form 전체 컨트롤 중 dataformat 속성이 있는 모든 컨트롤의 onchange 이벤트에 코드 처리
//		axon_event.addListenerForm('keypress', 'obj_keypress', form); 	// - form 전체 컨트롤 중 dataformat 속성이 있는 모든 컨트롤의 onkeypress 이벤트에 코드 처리
//		axon_event.addListenerForm('keyup', 'obj_keyup', form); 		// - form 전체 컨트롤 중 dataformat 속성이 있는 모든  컨트롤의 onkeyup 이벤트에 코드 처리
//		axon_event.addListenerForm('keydown', 'obj_keydown', form); 	// - form 전체 컨트롤 onkeydown 이벤트에 코드 처리
		axon_event.addListenerForm('keydown', 'ComKeyEnter', form);
		axon_event.addListenerForm("propertychange", "obj_propertychange", formObj);
	}