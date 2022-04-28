/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0049.js
*@FileTitle  : Vessel Report
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
     * @class BCM_CCD_0049 : BCM_CCD_0049 생성을 위한 화면에서 사용하는 업무 스크립트를 정의한다.
     */
    function BCM_CCD_0049() {
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
        //페이지 로드시 선처리 기능을 호출한다.
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
	          var HeadTitle="|Vessel Code|Ownership|Vessel Name(ENG)|Vessel Name(Local)|Carrier|New Built|Builder|Company|Build Area Name|Call Sign|Flag";
	          HeadTitle=HeadTitle+"|Port Of Registry|Class|Class No|IMO No(LLOYD No)|Hull No|Crew Count|P&I CLUB|EDI Vessel Name|Tel No|Fax|TLX|E-Mail";
	          HeadTitle=HeadTitle+"|Registered No|Feeder Division|Common Vessel|Keel Laid Date|Launched Date|Delivered Date|Registered Date|Close Date|Vessel Remark";
	          HeadTitle=HeadTitle+"|CNTR Capacity-Design|CNTR Capacity-Operation|CNTR Capacity-Panama|CNTR Capacity-OPER(R/F)|CNTR Capacity-Max(R/F)|CNTR Capacity-Vessel Class(TEU)";
	          HeadTitle=HeadTitle+"|CNTR Capacity-Total TEU|CNTR Capacity-Hatch CNT|CNTR Capacity-Hold CNT|Dimension(M)-L.O.A|Dimension(M)-L.B.P|Dimension(M)-Breadth";
	          HeadTitle=HeadTitle+"|Dimension(M)-Depth|Dimension(M)-Height|Dimension(M)-Summer Draft|Dimension(M)-Freeboard|Speed(Knots)-Economy|Speed(Knots)-Service";
	          HeadTitle=HeadTitle+"|Speed(Knots)-Max|Others(MT)-Displacement|Others(MT)-Dead Weight|Others(MT)-Light Ship|International-Gross Ton|Panama-Gross Ton";
	          HeadTitle=HeadTitle+"|Suez-Gross Ton|ITC|International - Net Ton|Panama - Net Ton|Suez - Net Ton|Suez - Net Ton (Maiden Voyage)";
	          HeadTitle=HeadTitle+"|Capacity(CBM)-F.O|Capacity(CBM)-D.O|Capacity(CBM)-F.W|Capacity(CBM)-Ballast|Consumption(MT)-F.O|Consumption(MT)-D.O";
	          HeadTitle=HeadTitle+"|Consumption(MT)-F.W|Main Engine-Maker|Main Engine-Type|Main Engine-B.H.P|Main Engine-R.P.M|Bow Thruster-Maker";
	          HeadTitle=HeadTitle+"|Bow Thruster-Type|Bow Thruster-B.H.P|BOW Thruster-R.P.M|Generator  Engine-Maker|Generator Engine-Type|Generator Engine-B.H.P|Generator Engine-R.P.M|Delete Flag";
	          
	          var headCount=ComCountHeadTitle(HeadTitle);
	          SetConfig( { SearchMode:2, MergeSheet:0, Page:20, DataRowMerge:0 } );
	
	          var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
	          var headers = [ { Text:HeadTitle, Align:"Center"} ];
	          InitHeaders(headers, info);
	
	          var cols = [ {Type:"Status",    Hidden:1, Width:50,   Align:"Center",  ColMerge:0,   SaveName:"ibflag" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",ColMerge:0,   SaveName:"vsl_cd",                     KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"vsl_own_ind_cd",             KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"vsl_eng_nm",                 KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"vsl_locl_nm",                KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"crr_cd",                     KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"vsl_bld_cd",                 KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"vsl_bldr_nm",                KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"co_cd",                      KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"vsl_bld_area_nm",            KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"call_sgn_no",                KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"vsl_rgst_cnt_cd",            KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"rgst_port_cd",               KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"clss_no_rgst_area_nm",       KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"vsl_clss_no",                KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"lloyd_no",                   KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"vsl_hl_no",                  KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"crw_knt",                    KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"piclb_desc",                 KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"vsl_edi_nm",                 KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"phn_no",                     KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"fax_no",                     KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"tlx_no",                     KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"vsl_eml",                    KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"rgst_no",                    KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"fdr_div_cd",                 KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"vsl_clss_flg",               KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"vsl_kel_ly_dt",              KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"vsl_lnch_dt",                KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"vsl_de_dt",                  KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"rgst_dt",                    KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"vsl_clz_dt",                 KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"vsl_rmk",                    KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"cntr_dzn_capa",              KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"cntr_op_capa",               KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"cntr_pnm_capa",              KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"rf_rcpt_knt",                KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"rf_rcpt_max_knt",            KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"cntr_vsl_clss_capa",         KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"ttl_teu_knt",                KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"vsl_htch_knt",               KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"vsl_hld_knt",                KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"loa_len",                    KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"lbp_len",                    KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"vsl_wdt",                    KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"vsl_dpth",                   KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"vsl_hgt",                    KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"smr_drft_hgt",               KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"fbd_capa",                   KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"ecn_spd",                    KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"vsl_svc_spd",                KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"max_spd",                    KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"dpl_capa",                   KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"dwt_wgt",                    KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"lgt_shp_tong_wgt",           KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"grs_rgst_tong_wgt",          KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"pnm_gt_wgt",                 KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"suz_gt_wgt",                 KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"intl_tong_certi_flg",        KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"net_rgst_tong_wgt",          KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"pnm_net_tong_wgt",           KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"suz_net_tong_wgt",           KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"madn_voy_suz_net_tong_wgt",  KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"foil_capa",                  KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"doil_capa",                  KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"frsh_wtr_capa",              KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"blst_tnk_capa",              KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"foil_csm",                   KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"doil_csm",                   KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"frsh_wtr_csm",               KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"mn_eng_mkr_nm",              KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"mn_eng_tp_desc",             KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"mn_eng_bhp_pwr",             KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"mn_eng_rpm_pwr",             KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"bwthst_mkr_nm",              KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"bwthst_tp_desc",             KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"bwthst_bhp_pwr",             KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"bwthst_rpm_pwr",             KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"gnr_mkr_nm",                 KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"gnr_tp_desc",                KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"gnr_bhp_pwr",                KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"gnr_rpm_pwr",                KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Left",  ColMerge:0,   SaveName:"delt_flg",                   KeyField:0,   CalcLogic:"",   Format:"" } ];
	           
	          InitColumns(cols);
	          SetVisible(false);
	          SetEditable(1);
        }
    }
    // Sheet관련 프로세스 처리
    function doActionIBSheet(sheetObj,formObj,sAction) {
    	switch(sAction) {
    	case SEARCH: // Download Excel
	  		formObj.f_cmd.value=SEARCH01;
			//sheetObj.SetWaitImageVisible(0);
    	    var sParam=FormQueryString(formObj) + "&" + ComGetPrefixParam("sheet1_");
    	    var sXml=sheetObj.GetSearchData("BCM_CCD_0049GS.do" , sParam);
			//if( ComGetEtcData(sXml, "cnt") > 0 ){
    	    var cnt=ComGetEtcData(sXml, "cnt");
			if( cnt > 0 ){
				if(ComShowCodeConfirm("CCD00011", cnt)){
					ComOpenWait(true);
					/*formObj.f_cmd.value=SEARCH;
					var sParam=FormQueryString(formObj);
					var sXml=sheetObj.GetSearchData("BCM_CCD_0049GS.do", sParam);
					if(sXml.length>0){
						sheetObj.LoadSearchData(sXml,{Sync:1} );
						sheetObj.Down2Excel({DownCols: makeHiddenSkipCol(sheetObj), SheetDesign:1, Merge:1});
	    			}*/
					formObj.f_cmd.value = SEARCH;
				    formObj.target = "_self"
				    formObj.action = "BCM_CCD_0049DL.do?"+ FormQueryString(formObj);
				    formObj.submit();
				    
	    			ComOpenWait(false);					
				}
			}else{
				ComShowCodeMessage("CCD00002");
			}
    		break;
    	case IBCLEAR:
    		formObj.reset();
    		fdr_div_cd.SetSelectCode("");
    		sheetObj.RemoveAll();
        	sheetObj.RemoveEtcData();
    		break;
    	}
    }
    function doActionIBCombo(sheetObj,formObj,sAction,sComboObj,sComboAction,sComboKey){
    	switch (sAction) {
    		case SEARCH02: // load page 시
    			var sXml=sheetObj.GetSearchData("BCM_CCD_0049GS.do", "f_cmd=" + SEARCH02);
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
//		axon_event.addListenerForm('keydown', 'ComKeyEnter', form);
		axon_event.addListenerForm("propertychange", "obj_propertychange", formObj);
	}