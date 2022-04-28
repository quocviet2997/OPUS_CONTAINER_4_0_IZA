/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0016.js
*@FileTitle  : Invoice Item Correction(General)
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/13 
=========================================================*/
/****************************************************************************************
  이벤트 구분 코드: [초기화]INIT=0; [입력]ADD=1; [retrieve]SEARCH=2; [리스트retrieve]SEARCHLIST=3;
                    [수정]MODIFY=4; [삭제]REMOVE=5; [리스트삭제]REMOVELIST=6 [다중처리]MULTI=7
                    기타 여분의 문자상수  COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
// common global variables
var tabObjects=new Array();
var tabCnt=0 ;
var beforetab=1;
var sheetObjects=new Array();
var sheetCnt=0;
// define button click event handler */
document.onclick=processButtonClick;
/** 
 * event handler branch process by button name <br>
 * <br><b>Example :</b>
 * <pre>
 * </pre>
 * @param  none  
 * @return none
 * @see #
 * @author Choi Do Soon
 * @version 2009.11.16 
 */
function processButtonClick(){
    var sheetObject1=sheetObjects[0];
    var sheetObject2=sheetObjects[1];
    var sheetObject3=sheetObjects[2];
    var sheetObject4=sheetObjects[3];
    var sheetObject5=sheetObjects[4];
    /*******************************************************/
    var formObject=document.form;
    try {
        var srcName=ComGetEvent("name");
        switch(srcName) {
            case "btn_retrieve":
                doActionIBSheet(sheetObject1,document.form,IBSEARCH);
                ComBtnEnable("btn_save");
                break;
            case "btn_new":
            	 
                sheetObject1.RemoveAll();
                sheetObject2.RemoveAll();
                sheetObject3.RemoveAll();
                sheetObject4.RemoveAll();
                sheetObject5.RemoveAll();
                form.bl_no.value="";
                form.bkg_no.value="";
                form.if_no.value="";
                form.str_inv_no.value="";
                form.act_cust_cnt_cd.value="";
                form.act_cust_seq.value="";
                form.cust_nm.value="";
                form.cust_rgst_no.value="";
                form.inv_cust_cnt_cd.value="";
                form.inv_cust_seq.value="";
                form.cr_curr_cd.value="";
                form.cr_amt.value="";
                form.ob_cr_term_dys.value="";
                form.ib_cr_term_dys.value="";
                form.cr_clt_ofc_cd.value="";
                form.local_vvd.value="";
                form.svc_scp_cd.value="";
                form.io_bnd_cd.value="";
                form.sail_arr_dt.value="";
                form.trunk_vvd.value="";
                form.slan_cd.value="";
                form.por_cd.value="";
                form.pol_cd.value="";
                form.pod_cd.value="";
                form.del_cd.value="";
                form.bkg_corr_no.value="";
                form.bkg_corr_dt.value="";
                form.co_stf_ctnt.value="";
                form.inv_ref_no.value="";
                form.bkg_ref_no.value="";
                form.si_ref_no.value="";
                form.inv_rmk.value="";
                form.rev_tp_cd.value="";
                form.rev_src_cd.value="";
                form.mst_bl_no.value="";
                form.rfa_no.value="";
                form.sc_no.value="";
                form.srep_cd.value="";
                form.cgo_wgt.value="";
                form.cgo_meas_qty.value="";
                form.whf_decl_no.value="";
                form.whf_decl_cfm_dt.value="";
                form.bkg_teu_qty.value="";
                form.bkg_feu_qty.value="";
                form.bl_inv_if_dt.value="";
                form.bl_inv_cfm_dt.value="";
                form.gl_eff_dt.value="";
                form.inv_no.value="";
                form.iss_dt.value="";
                form.due_dt.value="";
                form.frt_fwrd_cnt_cd.value="";
                form.frt_fwrd_cust_seq.value="";
                form.cr_flg.value=sheetObjects[0].GetCellValue(1, "cr_flg");
                form.zn_ioc_cd.value="";
                form.cust_cnt_cd.value="";
                form.cust_seq.value="";
                form.lcl_curr.value="";
                form.str_inv_no.readOnly=false ;
                document.all.str_inv_no.className="input" ;
                form.mod_flag.value="N";
                form.act_inv_flag.value="N";
                form.inv_cust_flg.value="N";
              
                form.ida_gst_expt_cd.checked = false;
                form.ida_gst_expt_cd.value = "";
                form.ida_oft_expt_flg.checked = false;
                form.ida_oft_expt_flg.value = "N";
                form.chg_oft_flg.value = "";
                form.chg_expt_cd.value = "";
                
                form.exp_mod_flag.value="N"; // if the tax examption flag is modified.
                
                ComBtnEnable("btn_save");
                form.bl_no.focus();
        		checkTaxCountry();  // Whether or not the invoice tax country (2017.12.08)
                break; 
            case "btn_save":
                doActionIBSheet(sheetObject1,document.form,IBSAVE);
                break; 
            case "btn_container":
                open_container();
                break; 
            case "btn_actcust":
                var param='?pgmNo=FNS_INV_0013&cust_cnt_cd='+formObject.act_cust_cnt_cd.value+'&cust_seq='+formObject.act_cust_seq.value+'&pop_yn=Y';
                var Row=1;
                var Col=1;
                ComOpenPopup('/opuscntr/FNS_INV_0013.do'+param, 1000, 700, '', '0,0', false, false, "", "", 0);
                break; 
            case "btn_cust":
                var param='?pgmNo=FNS_INV_0013&cust_cnt_cd='+formObject.inv_cust_cnt_cd.value+'&cust_seq='+formObject.inv_cust_seq.value+'&pop_yn=Y';
                var Row=1;
                var Col=1;
                ComOpenPopup('/opuscntr/FNS_INV_0013.do'+param, 1000, 700, '', '0,0', false, false, "", "", 0);
                break; 
            case "btn_custNm":
                param='?pgmNo=FNS_INV_0086&cust_seq='+formObject.act_cust_seq.value+'&cust_cnt_cd='+formObject.act_cust_cnt_cd.value;
                ComOpenPopup('/opuscntr/FNS_INV_0086.do' + param, 900, 450, 'getFNS_INV_0086_1', '1,0', false, false, Row, Col, 0);
                break;
            case "btn_close":
                //ComClosePopup();
            	window.close();
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
 * add IBSheet Object to  sheetObjects array <br>
 * <br><b>Example :</b>
 * <pre>
 * </pre>
 * @param  {IBSheet} sheetObj IBSheet Object
 * @return none
 * @see #
 * @author Choi Do Soon
 * @version 2009.11.16
 */
function setSheetObject(sheet_obj){
    sheetObjects[sheetCnt++]=sheet_obj;
}
/** 
 * define onLoad event handler<br>
 * <br><b>Example :</b>
 * <pre>
 * </pre>
 * @param  none
 * @return none
 * @see #
 * @author Choi Do Soon
 * @version 2009.11.16
 */
function loadPage() {
    sheet_container=sheetObjects[1]; 
    for(i=0;i<sheetObjects.length;i++){
        ComConfigSheet (sheetObjects[i] );  
        initSheet(sheetObjects[i],i+1);
        ComEndConfigSheet(sheetObjects[i]); 
    }
    for(k=0;k<tabObjects.length;k++){
        initTab(tabObjects[k],k+1);
    }
    initControl();
    doActionIBSheet(sheetObjects[0],document.form,IBSEARCH_ASYNC01);    
    if(document.form2.classId.value=="FNS_INV_0016"){
        document.form.bl_no.value=document.form2.bl_src_no.value;
        ar_ofc_cd.SetSelectText(document.form2.ar_ofc_cd.value);
        doActionIBSheet(sheetObjects[0],document.form,IBSEARCH);
    }   
    form.bl_no.focus();    
    resizeSheet();
	checkTaxCountry();  // Whether or not the invoice tax country (2017.12.08)
}
/** 
 * initializing sheet, define header<br> 
 * <br><b>Example :</b>
 * <pre>
 * </pre>
 * @param {IBSheet} sheetObj
 * @param {int} sheetNo   
 * @return none
 * @see #
 * @author Choi Do Soon
 * @version 2009.11.16
 */
function initSheet(sheetObj,sheetNo) {
    var cnt=0;
    var dpPrcsKntLocal=document.form.dp_prcs_knt_local.value;
    switch(sheetNo) {
    case 1:      //sheet1 init
        with(sheetObj){
            var HeadTitle="|bl_no|bkg_no|if_no|actual cust seq| actual cust cd|cust_nm |cust_rgst_no|inv cust cd|inv_cust_seq |crdt limit cd |crdt limit amt | crdt term ob|crdt term ib| crdt office| vsl_cd|skd_voy_no|skd_dir_cd|local vvd| scope| bound|s/a Date|trnk_vsl_cd|trnk_skd_voy_no|trnk_skd_dir_cd|Trunk vvd|Lane|PoR|pol|pod|del|c/a no.|c/a Date|COM Ref.|INV ref.no|Bkg Ref.No|S/I Ref.No|Description|Rev.Type|Source|Master B/L|RFA No.|S/C No|Sales Rep.|Weight|Measure|WHF DEC|WHF Date|TEU|FEU|I/F Date|Good Date|Eff.Date|INV No.|Issue Date|Due Date|FWDR Code|FWDR Seq|cr_flg|zn_ioc_cd|locl_curr_cd|inv_delt_div_cd|CR_TERM_DYS|CUST_CR_FLG|XCH_RT_N3RD_TP_CD|XCH_RT_USD_TP_CD|XCH_RT_DT|usd_xch_rt|sail_dt|dest_trns_svc_mod_cd|inv_svc_scp_cd|split_cd|ida_gst_expt_cd|ida_oft_expt_flg|all_cnt|tax_exp_flg";
            
            SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:1 } );
            
            var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
            var headers = [ { Text:HeadTitle, Align:"Center"} ];
            InitHeaders(headers, info);
            
            var cols = [{Type:"Status",    Hidden:1, Width:40,   Align:"Center",  ColMerge:1,   SaveName:"ibflag" },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"bl_src_no" },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"bkg_no" },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"ar_if_no" },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"act_cust_cnt_cd" },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"act_cust_seq" },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"cust_nm" },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"cust_rgst_no" },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"inv_cust_cnt_cd" },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"inv_cust_seq" },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"cr_curr_cd" },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"cr_amt" },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"ob_cr_term_dys" },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"ib_cr_term_dys" },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"cr_clt_ofc_cd" },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"vsl_cd" },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"skd_voy_no" },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"skd_dir_cd" },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"local_vvd" },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"svc_scp_cd" },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"io_bnd_cd" },
                        {Type:"Date",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"sail_arr_dt",           KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"trnk_vsl_cd" },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"trnk_skd_voy_no" },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"trnk_skd_dir_cd" },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"trunk_vvd" },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"slan_cd" },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"por_cd" },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"pol_cd" },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"pod_cd" },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"del_cd" },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"bkg_corr_no" },
                        {Type:"Date",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"bkg_corr_dt",           KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"co_stf_ctnt" },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"inv_ref_no" },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"bkg_ref_no" },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"si_ref_no" },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"inv_rmk" },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"rev_tp_cd" },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"rev_src_cd" },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"mst_bl_no" },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"rfa_no" },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"sc_no" },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"srep_cd" },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"cgo_wgt" },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"cgo_meas_qty" },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"whf_decl_no" },
                        {Type:"Date",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"whf_decl_cfm_dt",       KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"bkg_teu_qty" },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"bkg_feu_qty" },
                        {Type:"Date",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"bl_inv_if_dt",          KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
                        {Type:"Date",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"bl_inv_cfm_dt",         KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
                        {Type:"Date",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"gl_eff_dt",             KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"inv_no" },
                        {Type:"Date",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"iss_dt",                KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
                        {Type:"Date",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"due_dt",                KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"frt_fwrd_cnt_cd" },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"frt_fwrd_cust_seq" },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"cr_flg" },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"zn_ioc_cd" },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"locl_curr_cd" },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"inv_delt_div_cd" },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"cr_term_dys" },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"cust_cr_flg" },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"xch_rt_n3rd_tp_cd" },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"xch_rt_usd_tp_cd" },
                        {Type:"Date",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"xch_rt_dt",             KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
                        {Type:"Float",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"usd_xch_rt",            KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:6,   UpdateEdit:0,   InsertEdit:0 },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"sail_dt" },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"dest_trns_svc_mod_cd" },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"inv_svc_scp_cd" },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"inv_split_cd" },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"ida_gst_expt_cd" },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"ida_oft_expt_flg" },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"all_cnt" },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"tax_exp_flg" }];
                               
            InitColumns(cols);
            
            SetEditable(1);
            SetWaitImageVisible(0);
            SetVisible(0);
        }
            
        break;
    case 2:      //container
        with(sheetObj){
            var HeadTitle="|cntr_tpsz_cd|cntr_no|cntr_seq|teu|feu|ar_if_no|";
            
            SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:1 } );
            
            var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
            var headers = [ { Text:HeadTitle, Align:"Center"} ];
            InitHeaders(headers, info);
            
            var cols = [{Type:"Status",    Hidden:1, Width:40,   Align:"Center",  ColMerge:1,   SaveName:"ibflag" },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"cntr_tpsz_cd" },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"cntr_no" },
                        {Type:"Seq",       Hidden:0, Width:40,   Align:"Center",  ColMerge:1,   SaveName:"cntr_seq" },
                        {Type:"AutoSum",   Hidden:0, Width:40,   Align:"Center",  ColMerge:1,   SaveName:"teu" },
                        {Type:"AutoSum",   Hidden:0, Width:40,   Align:"Center",  ColMerge:1,   SaveName:"feu" },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"ar_if_no" } ];
                               
            InitColumns(cols);
            
            SetEditable(1);
            SetWaitImageVisible(0);
            SetVisible(0);
        }

        break;
    case 3:      //Summary
        with(sheetObj){
            var HeadTitle="|Cur|Amount|Ex. Rate|Local Cur|Local Amount";
            
            SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:1 } );
            
            var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
            var headers = [ { Text:HeadTitle, Align:"Center"} ];
            InitHeaders(headers, info);
            
            var cols = [{Type:"Status",    Hidden:1, Width:40,   Align:"Center",  ColMerge:1,   SaveName:"ibflag" } ];
                        cols.push({Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:"curr_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 });
                        cols.push({Type:"Text",     Hidden:0,  Width:150,  Align:"Right",   ColMerge:0,   SaveName:"chg_amt",       KeyField:0,   CalcLogic:"",   Format:"",   PointCount:0,   UpdateEdit:0,   InsertEdit:0 });
                        cols.push({Type:"Float",     Hidden:0,  Width:120,  Align:"Right",   ColMerge:0,   SaveName:"inv_xch_rt",    KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:6,   UpdateEdit:0,   InsertEdit:0 });
                        cols.push({Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:"locl_curr_cd",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 });
		            	if (dpPrcsKntLocal > 0) {
		            		cols.push({Type:"AutoSum",   Hidden:0, Width:150,  Align:"Right",   ColMerge:0,   SaveName:"local_total",   KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:dpPrcsKntLocal, UpdateEdit:0,   InsertEdit:0 });
		            	} else {
		            		cols.push({Type:"AutoSum",   Hidden:0, Width:150,  Align:"Right",   ColMerge:0,   SaveName:"local_total",   KeyField:0,   CalcLogic:"",   Format:"Integer", UpdateEdit:0,   InsertEdit:0 });
		            	}
                               
            InitColumns(cols);
            
            SetEditable(1);
            SetEditableColorDiff(0);
            SetWaitImageVisible(0);
            SetSheetHeight(180);
            SetSheetWidth(620);
//            resizeSheet();
            
        }

        break;
    case 4:      //By Charge
        with(sheetObj){
            var HeadTitle="|Seq.|CHG|M/N|Cur|Rate|Rated As|Per|Amount|VAT||||||ida";
            
            SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:1 } );
            
            var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
            var headers = [ { Text:HeadTitle, Align:"Center"} ];
            InitHeaders(headers, info);
            
            var cols = [{Type:"Status",    Hidden:1, Width:40,   Align:"Center",  ColMerge:1,   SaveName:"ibflag" },
                        {Type:"Seq",       Hidden:0, Width:60,   Align:"Center",  ColMerge:1,   SaveName:"seq" },
                        {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"chg_cd",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                        {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"mf_div_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                        {Type:"Text",      Hidden:0,  Width:60,  Align:"Center",  ColMerge:0,   SaveName:"curr_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                        {Type:"Float",     Hidden:0,  Width:150,  Align:"Right",   ColMerge:0,   SaveName:"trf_rt_amt",       KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
                        {Type:"Float",     Hidden:0,  Width:100,  Align:"Right",   ColMerge:0,   SaveName:"rat_as_cntr_qty",  KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:3,   UpdateEdit:0,   InsertEdit:0 },
                        {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:"per_tp_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                        {Type:"Float",     Hidden:0,  Width:150,  Align:"Right",   ColMerge:0,   SaveName:"chg_amt",          KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
                        {Type:"CheckBox",  Hidden:0, Width:80,   Align:"Center",  ColMerge:0,   SaveName:"tva_flg",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:0 },
                        {Type:"Text",      Hidden:1, Width:130,  Align:"Right",   ColMerge:0,   SaveName:"lcl_curr_cd",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
                        {Type:"Text",      Hidden:1, Width:130,  Align:"Right",   ColMerge:0,   SaveName:"ar_if_ser_no",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
                        {Type:"Text",      Hidden:1, Width:130,  Align:"Right",   ColMerge:0,   SaveName:"chg_seq",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
                        {Type:"Text",      Hidden:1, Width:130,  Align:"Right",   ColMerge:0,   SaveName:"inv_xch_rt",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
                        {Type:"Text",      Hidden:1, Width:130,  Align:"Right",   ColMerge:0,   SaveName:"inv_xch_rt_dt",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
                        {Type:"Text",      Hidden:1, Width:50,   Align:"Center",  ColMerge:0,   SaveName:"ida_flg",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                        {Type:"Text",      Hidden:1, Width:50,   Align:"Center",  ColMerge:0,   SaveName:"ida_oft_expt_flg", KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
                               
            InitColumns(cols);
            
            SetEditable(1);
            SetEditableColorDiff(0);
            SetWaitImageVisible(0);
//            SetSheetHeight(180);
            SetSheetWidth(860);
            resizeSheet();
        }

        break; 
    case 5:      
        with(sheetObj){
            var HeadTitle="|bkg_no|ar_if_no|act_cust_cnt_cd|act_cust_seq|inv_cust_cnt_cd|inv_cust_seq|vsl_cd|skd_voy_no|skd_dir_cd|io_bnd_cd|sail_arr_dt|sail_dt|trnk_vsl_cd|trnk_skd_voy_no|trnk_skd_dir_cd|pol_cd|pod_cd|bl_inv_cfm_dt|ar_ofc_cd|dest_trns_svc_mod_cd";
            var headCount=ComCountHeadTitle(HeadTitle);
            
            SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:1 } );
            
            var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
            var headers = [ { Text:HeadTitle, Align:"Center"} ];
            InitHeaders(headers, info);
        
            var cols = [{Type:"Status",    Hidden:1, Width:40,   Align:"Center",  ColMerge:1,   SaveName:"ibflag" },
                        {Type:"Text",     Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"bkg_no" },
                        {Type:"Text",     Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"ar_if_no" },
                        {Type:"Text",     Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"act_cust_cnt_cd" },
                        {Type:"Text",     Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"act_cust_seq" },
                        {Type:"Text",     Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"inv_cust_cnt_cd" },
                        {Type:"Text",     Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"inv_cust_seq" },
                        {Type:"Text",     Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"vsl_cd" },
                        {Type:"Text",     Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"skd_voy_no" },
                        {Type:"Text",     Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"skd_dir_cd" },
                        {Type:"Text",     Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"io_bnd_cd" },
                        {Type:"Text",     Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"sail_arr_dt" },
                        {Type:"Text",     Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"sail_dt" },
                        {Type:"Text",     Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"trnk_vsl_cd" },
                        {Type:"Text",     Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"trnk_skd_voy_no" },
                        {Type:"Text",     Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"trnk_skd_dir_cd" },
                        {Type:"Text",     Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"pol_cd" },
                        {Type:"Text",     Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"pod_cd" },
                        {Type:"Text",     Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"bl_inv_cfm_dt" },
                        {Type:"Text",     Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"ar_ofc_cd" },
                        {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"dest_trns_svc_mod_cd" } ];
                                           
            InitColumns(cols);
            
            SetEditable(1);
            SetWaitImageVisible(0);
            SetVisible(0);
        }

        break;
    }
}
/** 
 * doActionIBSheet <br>
 * <br><b>Example :</b>
 * <pre>
 * </pre>
 * @param  {IBSheet} sheetObj   
 * @param  {object} formObj
 * @param  {sAction} sAction
 * @return none
 * @see #
 * @author Choi Do Soon
 * @version 2009.11.16
 */
function doActionIBSheet(sheetObj,formObj,sAction) {
    sheetObj.ShowDebugMsg(false);
    switch(sAction) {
    case IBSEARCH_ASYNC01: // retrieve AR_OFFICE_LIST 
        ComOpenWait(true);
        //formObj.f_cmd.value=SEARCH02;
        formObj.f_cmd.value=SEARCH17;
        var sXml=sheetObj.GetSearchData("INVCommonGS.do", FormQueryString(formObj));
        var sStr=ComGetEtcData(sXml,"ar_ofc_cd");
        var arrStr=sStr.split("|");
        MakeComboObject2(ar_ofc_cd, arrStr);
        var arrStr2=arrStr[1].split("^");
        var ar_ofc_cd_str=arrStr2[3];
        ar_ofc_cd.SetSelectText(ar_ofc_cd_str);
        formObj.ofc.value=ar_ofc_cd_str;
        form.ofc_cd.value=form.ofc.value;
        form.loc_cd.value=arrStr2[6];
        ComOpenWait(false);
        break;
    case IBSEARCH:      //retrieve
        if(validateForm(sheetObj,formObj,sAction)) return;
        ComOpenWait(true);
        formObj.f_cmd.value=SEARCH01;
        var sXml=sheetObj.GetSearchData("FNS_INV_0016GS.do" , FormQueryString(formObj));
        var arrXml=sXml.split("|$$|");
        if (arrXml.length > 0) {
        	var lclCurrPoint=ComGetEtcData(arrXml[0], "dp_prcs_knt_local");
        	formObj.dp_prcs_knt_local.value=lclCurrPoint;
        }
        if (sXml.indexOf("ERROR") < 1){
            if ( sheetObj.id == "sheet1") {
                if ( arrXml[0] != null){
                    sheetObjects[0].LoadSearchData(arrXml[0],{Sync:1} );
                    // if data deleted
                    if (sheetObjects[0].GetCellValue(1, "inv_delt_div_cd") == "X") {
                        ComShowCodeMessage("INV00067");
                        ComOpenWait(false);
                        form.bl_no.select();
                        return;
                    }
                    form.bl_no.value=sheetObjects[0].GetCellValue(1, "bl_src_no");
                    form.bkg_no.value=sheetObjects[0].GetCellValue(1, "bkg_no");
                    form.if_no.value=sheetObjects[0].GetCellValue(1, "ar_if_no");
                    form.str_inv_no.value=sheetObjects[0].GetCellValue(1, "inv_no");
                    form.act_cust_cnt_cd.value=sheetObjects[0].GetCellValue(1, "act_cust_cnt_cd");
                    form.act_cust_seq.value=ComLpad(sheetObjects[0].GetCellValue(1, "act_cust_seq"), 6, "0");
                    form.cust_nm.value=sheetObjects[0].GetCellValue(1, "cust_nm");
                    form.cust_rgst_no.value=sheetObjects[0].GetCellValue(1, "cust_rgst_no");
                    form.inv_cust_cnt_cd.value=sheetObjects[0].GetCellValue(1, "inv_cust_cnt_cd");
                    form.inv_cust_seq.value=sheetObjects[0].GetCellValue(1, "inv_cust_seq");
                    form.cr_curr_cd.value=sheetObjects[0].GetCellValue(1, "cr_curr_cd");
                    form.cr_amt.value=ComAddCommaRun(sheetObjects[0].GetCellValue(1, "cr_amt"));
                    form.ob_cr_term_dys.value=sheetObjects[0].GetCellValue(1, "ob_cr_term_dys");
                    form.ib_cr_term_dys.value=sheetObjects[0].GetCellValue(1, "ib_cr_term_dys");
                    form.cr_clt_ofc_cd.value=sheetObjects[0].GetCellValue(1, "cr_clt_ofc_cd");
                    form.local_vvd.value=sheetObjects[0].GetCellValue(1, "local_vvd");
                    form.vvd.value=sheetObjects[0].GetCellValue(1, "vvd");
                    form.svc_scp_cd.value=sheetObjects[0].GetCellValue(1, "svc_scp_cd");
                    form.io_bnd_cd.value=sheetObjects[0].GetCellValue(1, "io_bnd_cd");
                    form.sail_arr_dt.value=sheetObjects[0].GetCellText(1, "sail_arr_dt");
                    form.sail_dt.value=sheetObjects[0].GetCellText(1, "sail_dt");
                    form.trunk_vvd.value=sheetObjects[0].GetCellValue(1, "trunk_vvd");
                    form.slan_cd.value=sheetObjects[0].GetCellValue(1, "slan_cd");
                    form.por_cd.value=sheetObjects[0].GetCellValue(1, "por_cd");
                    form.pol_cd.value=sheetObjects[0].GetCellValue(1, "pol_cd");
                    form.pod_cd.value=sheetObjects[0].GetCellValue(1, "pod_cd");
                    form.del_cd.value=sheetObjects[0].GetCellValue(1, "del_cd");
                    form.bkg_corr_no.value=sheetObjects[0].GetCellValue(1, "bkg_corr_no");
                    form.bkg_corr_dt.value=sheetObjects[0].GetCellText(1, "bkg_corr_dt");
                    form.co_stf_ctnt.value=sheetObjects[0].GetCellValue(1, "co_stf_ctnt");
                    form.inv_ref_no.value=sheetObjects[0].GetCellValue(1, "inv_ref_no");
                    form.bkg_ref_no.value=sheetObjects[0].GetCellValue(1, "bkg_ref_no");
                    form.si_ref_no.value=sheetObjects[0].GetCellValue(1, "si_ref_no");
                    form.inv_rmk.value=sheetObjects[0].GetCellValue(1, "inv_rmk");
                    form.rev_tp_cd.value=sheetObjects[0].GetCellValue(1, "rev_tp_cd");
                    form.rev_src_cd.value=sheetObjects[0].GetCellValue(1, "rev_src_cd");
                    form.mst_bl_no.value=sheetObjects[0].GetCellValue(1, "mst_bl_no");
                    form.rfa_no.value=sheetObjects[0].GetCellValue(1, "rfa_no");
                    form.sc_no.value=sheetObjects[0].GetCellValue(1, "sc_no");
                    form.srep_cd.value=sheetObjects[0].GetCellValue(1, "srep_cd");
                    form.cgo_wgt.value=sheetObjects[0].GetCellValue(1, "cgo_wgt");
                    form.cgo_meas_qty.value=sheetObjects[0].GetCellValue(1, "cgo_meas_qty");
                    form.whf_decl_no.value=sheetObjects[0].GetCellValue(1, "whf_decl_no");
                    form.whf_decl_cfm_dt.value=sheetObjects[0].GetCellText(1, "whf_decl_cfm_dt");
                    form.bkg_teu_qty.value=sheetObjects[0].GetCellValue(1, "bkg_teu_qty");
                    form.bkg_feu_qty.value=sheetObjects[0].GetCellValue(1, "bkg_feu_qty");
                    form.bl_inv_if_dt.value=sheetObjects[0].GetCellText(1, "bl_inv_if_dt");
                    form.bl_inv_cfm_dt.value=sheetObjects[0].GetCellText(1, "bl_inv_cfm_dt");
                    form.gl_eff_dt.value=sheetObjects[0].GetCellText(1, "gl_eff_dt");
                    form.inv_no.value=sheetObjects[0].GetCellValue(1, "inv_no");
                    form.iss_dt.value=sheetObjects[0].GetCellText(1, "iss_dt");
                    form.due_dt.value=sheetObjects[0].GetCellText(1, "due_dt");
                    form.frt_fwrd_cnt_cd.value=sheetObjects[0].GetCellValue(1, "frt_fwrd_cnt_cd");
                    form.frt_fwrd_cust_seq.value=sheetObjects[0].GetCellValue(1, "frt_fwrd_cust_seq");
                    form.cr_flg.value=sheetObjects[0].GetCellValue(1, "cr_flg");
                    form.zn_ioc_cd.value=sheetObjects[0].GetCellValue(1, "zn_ioc_cd");
                    form.cust_cnt_cd.value=form.act_cust_cnt_cd.value;
                    form.cust_seq.value=form.act_cust_seq.value;
                    form.ofc_cd.value=form.ofc.value;
                    form.lcl_curr.value=sheetObjects[0].GetCellValue(1, "locl_curr_cd");
                    form.cr_term_dys.value=sheetObjects[0].GetCellValue(1, "cr_term_dys");
                    form.cust_cr_flg.value=sheetObjects[0].GetCellValue(1, "cust_cr_flg");
                    form.xch_rt_n3rd_tp_cd.value=sheetObjects[0].GetCellValue(1, "xch_rt_n3rd_tp_cd");
                    form.xch_rt_usd_tp_cd.value=sheetObjects[0].GetCellValue(1, "xch_rt_usd_tp_cd");
                    form.xch_rt_dt.value=sheetObjects[0].GetCellValue(1, "xch_rt_dt");
                    form.usd_xch_rt.value=sheetObjects[0].GetCellValue(1, "usd_xch_rt");
                    form.dest_trns_svc_mod_cd.value=sheetObjects[0].GetCellValue(1, "dest_trns_svc_mod_cd");
                    form.inv_svc_scp_cd.value=sheetObjects[0].GetCellValue(1, "inv_svc_scp_cd");
                    form.inv_split_cd.value=sheetObjects[0].GetCellValue(1, "inv_split_cd");
                    //india new gst "E" 면세
                    form.ida_gst_expt_cd.value = sheetObjects[0].GetCellValue(1, "ida_gst_expt_cd")
                    if(sheetObjects[0].GetCellValue(1, "ida_gst_expt_cd") == "E" ){
                    	 form.ida_gst_expt_cd.checked =  true;
                    }else{
                    	 form.ida_gst_expt_cd.checked =  false;
                    }
                    // India OFT 예외 처리
                    form.ida_oft_expt_flg.value = sheetObjects[0].GetCellValue(1, "ida_oft_expt_flg")
                    // all_cnt > 0 and sheetObjects[0].GetCellValue(1, "ida_oft_expt_flg") =="" 인 경우는 BKG에서 결정된 ALL FLAG 임
                    // sheetObjects[0].GetCellValue(1, "ida_oft_expt_flg")는 Manual 수정값
                    if(sheetObjects[0].GetCellValue(1, "ida_oft_expt_flg") == "Y" || sheetObjects[0].GetCellValue(1, "all_cnt")!= 0){
                    	 form.ida_oft_expt_flg.checked =  true;
                    }else{
                    	 form.ida_oft_expt_flg.checked =  false;
                    }

                    // In case the tax country exempt. (2017.11.29 HJ Jeong)
                    if(sheetObjects[0].GetCellValue(1, "tax_exp_flg") == "Y"){  
                    	 form.tax_exp_chk.checked =  true;
                    }else{
                    	 form.tax_exp_chk.checked =  false;
                    }
                    
                    //good date null
                    if (form.bl_inv_cfm_dt.value == "") {
                        form.local_vvd.readOnly=false;
                        form.trunk_vvd.readOnly=false;
                        form.pol_cd.readOnly=false;
                        form.pod_cd.readOnly=false;
                        form.local_vvd.className="input";
                        form.trunk_vvd.className="input";
                        form.pol_cd.className="input";
                        form.pod_cd.className="input";
                        if (form.io_bnd_cd.value == "I/B") {
                            form.pol_cd.readOnly=true;
                            form.pol_cd.className="input2";
                            form.pod_cd.readOnly=false;
                            form.pod_cd.className="input";
                        } else {
                            form.pol_cd.readOnly=false;
                            form.pol_cd.className="input";
                            form.pod_cd.readOnly=true;
                            form.pod_cd.className="input2";
                        }
                        ComEnableObject(form.ida_gst_expt_cd, false);	//india new gst
                        ComEnableObject(form.ida_oft_expt_flg, false);	//india new gst
                    } else {  //good date not null
                        form.local_vvd.readOnly=true;
                        form.trunk_vvd.readOnly=true;
                        form.pol_cd.readOnly=true;
                        form.pod_cd.readOnly=true;
                        form.local_vvd.className="input2";
                        form.trunk_vvd.className="input2";
                        form.pol_cd.className="input2";
                        form.pod_cd.className="input2";
                    }
                   
                    if ((form.inv_no.value == ""||form.inv_dup_flg.value == "Y")&& form.inv_split_cd.value !="S") {
                        form.act_cust_cnt_cd.readOnly=false;
                        form.act_cust_seq.readOnly=false;
                        form.inv_cust_cnt_cd.readOnly=false;
                        form.inv_cust_seq.readOnly=false;
                        form.cust_nm.readOnly=false;
                        form.cust_rgst_no.readOnly=false;
                        form.act_cust_cnt_cd.className="input";
                        form.act_cust_seq.className="input";
                        form.inv_cust_cnt_cd.className="input";
                        form.inv_cust_seq.className="input";
                        form.cust_nm.className="input";
                        form.cust_rgst_no.className="input";
                        document.all.btn_custSer.style.visibility="visible";
                    } else {
                    	
                        form.act_cust_cnt_cd.readOnly=true;
                        form.act_cust_seq.readOnly=true;
                        form.inv_cust_cnt_cd.readOnly=true;
                        form.inv_cust_seq.readOnly=true;
                        form.cust_nm.readOnly=true;
                        form.cust_rgst_no.readOnly=true;
                        form.act_cust_cnt_cd.className="input2";
                        form.act_cust_seq.className="input2";
                        form.inv_cust_cnt_cd.className="input2";
                        form.inv_cust_seq.className="input2";
                        form.cust_nm.className="input2";
                        form.cust_rgst_no.className="input2";
                        document.all.btn_custSer.style.visibility="hidden"; 
                      
                    }
                    if (form.inv_split_cd.value =="S"){
                    	 ComEnableObject(document.form.ida_gst_expt_cd, false);	
                    	 ComEnableObject(document.form.ida_oft_expt_flg, false);
                    }
                    
                    //if(form.io_bnd_cd.value == "O/B"){
                    //    form.inv_ref_no.readOnly=true;
                    //    form.inv_ref_no.className="input2";
                    //}else{
                        form.inv_ref_no.readOnly=false;
                        form.inv_ref_no.className="input";
                    //}

                    form.str_inv_no.readOnly=true;
                    document.all.str_inv_no.className="input2" ;
                }
                if ( arrXml[3] != null) {
                    sheetObjects[1].LoadSearchData(arrXml[3],{Sync:1} );
                }
                if ( arrXml[1] != null) {
                	sheetObjects[2]= sheetObjects[2].Reset();
                	initSheet(sheetObjects[2],3);
                    sheetObjects[2].LoadSearchData(arrXml[1],{Sync:1} );
                }
                if ( arrXml[2] != null) {
                    sheetObjects[3].LoadSearchData(arrXml[2],{Sync:1} );
                }
                if ( arrXml[4] != null) {
                    sheetObjects[4].LoadSearchData(arrXml[4],{Sync:1} );
                }
                sheetObjects[1].SetSumText(0,"cntr_no","Total");
            } 
        } else {
            if (form.ots_smry_cd.value == "INV"){
                ComShowCodeMessage("INV00067","INV");
            } else {
                ComShowCodeMessage("INV00067","BL");
            }
            ComOpenWait(false);
            form.bl_no.select();
            return;
        }
        ComOpenWait(false);
        break;
    case IBSAVE:        //save
    	
        if(validateForm(sheetObj,formObj,sAction)) return;
        ComBtnDisable("btn_save");
        InvOpenWait(true, true);                  
        form.mod_flag.value="N";
        form.act_inv_flag.value="N";
        form.inv_cust_flg.value="N";
        form.ida_mod_flag.value="N";
        form.exp_mod_flag.value="N";
        
        for (var i=1 ; i <= sheetObjects[0].RowCount(); i++ ) {
            //sheetObjects[0].CellValue(i, "ibflag") = "U";
            sheetObjects[0].SetRowStatus(i,"U");
        }                   
        for (var i=1 ; i <= sheetObjects[1].RowCount(); i++ ) {
            //sheetObjects[1].CellValue(i, "ibflag") = "U";
            sheetObjects[1].SetRowStatus(i,"U");
        }   
        for (var i=1 ; i <= sheetObjects[2].RowCount(); i++ ) {
            //sheetObjects[2].CellValue(i, "ibflag") = "U";
            sheetObjects[2].SetRowStatus(i,"U");
        }   
        for (var i=1 ; i <= sheetObjects[3].RowCount(); i++ ) {
            //sheetObjects[3].CellValue(i, "ibflag") = "U";
            sheetObjects[3].SetRowStatus(i,"U");
        }
        for (var i=1 ; i <= sheetObjects[4].RowCount(); i++ ) {
            //sheetObjects[4].CellValue(i, "ibflag") = "U";
            sheetObjects[4].SetRowStatus(i,"U");
        }
        if (form.act_cust_seq.value != sheetObjects[0].GetCellValue(1,"act_cust_seq")||form.act_cust_cnt_cd.value != sheetObjects[0].GetCellValue(1,"act_cust_cnt_cd")||
            form.inv_cust_seq.value != sheetObjects[0].GetCellValue(1,"inv_cust_seq")||form.inv_cust_cnt_cd.value != sheetObjects[0].GetCellValue(1,"inv_cust_cnt_cd")) {
            form.act_inv_flag.value="Y";
        } else {
            form.act_inv_flag.value="N";
        }
        if (form.inv_cust_seq.value != sheetObjects[0].GetCellValue(1,"inv_cust_seq")||form.inv_cust_cnt_cd.value != sheetObjects[0].GetCellValue(1,"inv_cust_cnt_cd")) {
            form.inv_cust_flg.value="Y";
            form.mod_flag.value="Y";
            if(sheetObjects[4].RowCount()>0){
                for (var i=1 ; i <= sheetObjects[4].RowCount(); i++ ) {
                    sheetObjects[4].SetCellValue(i, "inv_cust_seq",form.inv_cust_seq.value,0);
                    sheetObjects[4].SetCellValue(i, "inv_cust_cnt_cd",form.inv_cust_cnt_cd.value,0);
                }
            }                       
        } else {
            form.inv_cust_flg.value="N";
        }
        if (form.act_cust_seq.value != sheetObjects[0].GetCellValue(1,"act_cust_seq")||form.act_cust_cnt_cd.value != sheetObjects[0].GetCellValue(1,"act_cust_cnt_cd")) {
            form.mod_flag.value="Y";                        
            if(sheetObjects[4].RowCount()>0){
                for (var i=1 ; i <= sheetObjects[4].RowCount(); i++ ) {
                    sheetObjects[4].SetCellValue(i, "act_cust_seq",form.act_cust_seq.value,0);
                    sheetObjects[4].SetCellValue(i, "act_cust_cnt_cd",form.act_cust_cnt_cd.value,0);
                }
            }                       
        } 
        if (form.local_vvd.value != sheetObjects[0].GetCellValue(1,"local_vvd")) {
            form.mod_flag.value="Y";                        
            if(sheetObjects[4].RowCount()>0){
                for (var i=1 ; i <= sheetObjects[4].RowCount(); i++ ) {
                    sheetObjects[4].SetCellValue(i, "vsl_cd",form.local_vvd.value.substring(0,4),0);
                    sheetObjects[4].SetCellValue(i, "skd_voy_no",form.local_vvd.value.substring(4,8),0);
                    sheetObjects[4].SetCellValue(i, "skd_dir_cd",form.local_vvd.value.substring(8,9),0);
                }
            }                       
        }
        if (form.pol_cd.value != sheetObjects[0].GetCellValue(1,"pol_cd")) {
            form.mod_flag.value="Y";                        
            if(sheetObjects[4].RowCount()>0){
                for (var i=1 ; i <= sheetObjects[4].RowCount(); i++ ) {
                    sheetObjects[4].SetCellValue(i, "pol_cd",form.pol_cd.value,0);
                }
            }                       
        }
        if (form.pod_cd.value != sheetObjects[0].GetCellValue(1,"pod_cd")) {
            form.mod_flag.value="Y";                        
            if(sheetObjects[4].RowCount()>0){
                for (var i=1 ; i <= sheetObjects[4].RowCount(); i++ ) {
                    sheetObjects[4].SetCellValue(i, "pod_cd",form.pod_cd.value,0);
                }
            }                       
        }
       
        // india
	    if (form.ida_gst_expt_cd.value != sheetObjects[0].GetCellValue(1,"ida_gst_expt_cd")) {
	        	
	         form.ida_mod_flag.value="Y";
	         form.mod_flag.value="Y";
	         form.chg_expt_cd.value = form.ida_gst_expt_cd.value;
	    }else{
	    	 form.chg_expt_cd.value = sheetObjects[0].GetCellValue(1,"ida_gst_expt_cd"); 
	    }
	      
	    var oft_expt_flg = sheetObjects[0].GetCellValue(1,"ida_oft_expt_flg");

	    if(oft_expt_flg !="Y" && oft_expt_flg !=""){
	    	oft_expt_flg = "N";
	    }

	    
	    if (form.ida_oft_expt_flg.value != oft_expt_flg) {
	        form.ida_mod_flag.value = "Y";
	        form.mod_flag.value="Y";
	        form.chg_oft_flg.value = form.ida_oft_expt_flg.value;
	    }else{
	      	form.chg_oft_flg.value = sheetObjects[0].GetCellValue(1,"ida_oft_expt_flg");  
	    }

/**Check Tax Country HJ.Jeong (2018-01-08)*/
	    var aaa = sheetObjects[0].GetCellValue(1,"tax_exp_flg");
	    //alert(aaa);
	    
        if (form.tax_exp_flg.value != sheetObjects[0].GetCellValue(1,"tax_exp_flg")) {
            form.mod_flag.value="Y";    
            form.exp_mod_flag.value="Y";      
        } 
	        
        if(form.mod_flag.value=="Y"){
            fn_vvd_bound_pol_pod_chg();     
        }
        

        if(form.mod_flag.value == "Y" || form.bl_inv_cfm_dt.value == ""){
            var effDt=effectiveDtCheck();
            if(effDt==""){
                ComShowCodeMessage("INV00122");
                InvOpenWait(false, true);               
                return;             
            }
        }
        if (form.inv_no.value != ""&&form.inv_dup_flg.value != "Y"){
            form.mod_flag.value="N";
            form.act_inv_flag.value="N";
            form.inv_cust_flg.value="N"; 
        }  

        formObj.f_cmd.value=MULTI;

        //alert(form.exp_mod_flag.value);
        setTimeout( function () {
        	var sXml=sheetObjects[0].GetSaveData("FNS_INV_0016GS.do",FormQueryString(formObj) + "&" + ComSetPrifix(sheetObjects[0].GetSaveString(),"sheet1_") + "&" + ComSetPrifix(sheetObjects[1].GetSaveString(),"sheet2_") + "&" + ComSetPrifix(sheetObjects[2].GetSaveString(),"t2sheet1_") + "&" + ComSetPrifix(sheetObjects[3].GetSaveString(),"t2sheet2_")+ "&" + ComSetPrifix(sheetObjects[4].GetSaveString(),"sheet5_"));
           
        	InvOpenWait(false, true);
            sheetObjects[0].LoadSaveData(sXml);
		} , 100);
        
        
        
    break;
    case IBSEARCH_ASYNC03: // retrieve customer name 
        if (formObj.cust_rgst_no.value != ""){
            var arrStr2=ar_ofc_cd.GetSelectCode().split("^");
            formObj.ar_ofc_cd2.value=arrStr2[1];
            formObj.f_cmd.value=SEARCH16;
            formObj.act_cust_cnt_cd.value="";
            formObj.act_cust_seq.value="";
            formObj.cust_cnt_cd.value="";
            formObj.cust_seq.value="";
            var sXml=sheetObj.GetSearchData("INVCommonGS.do", FormQueryString(formObj));
            var deltFlg=ComGetEtcData(sXml,"delt_flg");   
            if (deltFlg == undefined) {     
                formObj.cust_nm.value="";
                formObj.cust_rgst_no.value="";
                formObj.cr_curr_cd.value="";
                formObj.cr_amt.value="";
                formObj.ob_cr_term_dys.value="";
                formObj.ib_cr_term_dys.value="";
                formObj.cr_clt_ofc_cd.value="";
                ComShowCodeMessage("INV00060");
                return;                     
            }else if(deltFlg=='Y'){
                form.cust_nm.value="";
                form.act_cust_seq.value="";
                form.cust_seq.value="";
                ComShowCodeMessage("INV00060");
                form.act_cust_cnt_cd.focus();
                return;
            }
            var act_cust_cnt_cd=ComGetEtcData(sXml,"cust_cnt_cd");    
            if (act_cust_cnt_cd != undefined) {
                formObj.act_cust_cnt_cd.value=act_cust_cnt_cd;
            } else {
                formObj.act_cust_cnt_cd.value="";
            }
            var act_cust_seq=ComGetEtcData(sXml,"cust_seq");    
            if (act_cust_seq != undefined) {
                formObj.act_cust_seq.value=ComLpad(act_cust_seq, 6, '0');
            } else {
                formObj.act_cust_seq.value="";
            }
            var cust_nm=ComGetEtcData(sXml,"cust_eng_nm");    
            if (cust_nm != undefined) {
                formObj.cust_nm.value=cust_nm;
            } else {
                formObj.cust_nm.value="";
            }       
            var cust_rgst_no=ComGetEtcData(sXml,"cust_rgst_no");    
            if (cust_rgst_no != undefined) {
                formObj.cust_rgst_no.value=cust_rgst_no;
            } else {
                formObj.cust_rgst_no.value="";
            }
            var cr_curr_cd=ComGetEtcData(sXml,"cr_curr_cd");    
            if (cr_curr_cd != undefined) {
                formObj.cr_curr_cd.value=cr_curr_cd;
            } else {
                formObj.cr_curr_cd.value="";
            }
            var cr_amt=ComGetEtcData(sXml,"cr_amt");    
            if (cr_amt != undefined) {
                formObj.cr_amt.value=ComAddComma(cr_amt);
            } else {
                formObj.cr_amt.value="";
            }
            var ob_cr_term_dys=ComGetEtcData(sXml,"ob_cr_term_dys");    
            if (ob_cr_term_dys != undefined) {
                formObj.ob_cr_term_dys.value=ob_cr_term_dys;
            } else {
                formObj.ob_cr_term_dys.value="";
            }
            var ib_cr_term_dys=ComGetEtcData(sXml,"ib_cr_term_dys");    
            if (ib_cr_term_dys != undefined) {
                formObj.ib_cr_term_dys.value=ib_cr_term_dys;
            } else {
                formObj.ib_cr_term_dys.value="";
            }
            var cr_clt_ofc_cd=ComGetEtcData(sXml,"cr_clt_ofc_cd");    
            if (cr_clt_ofc_cd != undefined) {
                formObj.cr_clt_ofc_cd.value=cr_clt_ofc_cd;
            } else {
                formObj.cr_clt_ofc_cd.value="";
            }
        }
        break;  
 
    case IBSEARCH_ASYNC10:  // Tax country retrieve
		var arrStr2=ar_ofc_cd.GetSelectCode().split("^");
		formObj.ar_ofc_cd2.value=arrStr2[1];			
		formObj.f_cmd.value=SEARCH04;
 		var sXml=sheetObj.GetSearchData("FNS_INV_0016GS.do", FormQueryString(formObj));
		var sStr=ComGetEtcData(sXml,"tax_cnt_flg");
		formObj.tax_cnt_flg.value=sStr;
		break; 
    }
}

function sheet1_OnSearchEnd(sheetObj, Code, Msg, StCode, StMsg) {
	InvOpenWait(false, false);
}


/**
 * create combo box<br>
 * <br><b>Example : </b>
 * <pre>
 *    MakeComboObject2(formObj.ar_ofc_cd, arrStr);
 * </pre>
 * @param object cmbObj
 * @param String arrStr
 * @author Choi Do Soon
 * @version 2009.10.06
 */
function MakeComboObject2(cmbObj, arrStr) {
    for (var i=1; i < arrStr.length;i++ ) {
        var arrStr2=arrStr[i].split("^");
        var ar_ofc_cd_str=arrStr2[1];
        cmbObj.InsertItem(i-1, ar_ofc_cd_str, arrStr[i]);            
    }
    cmbObj.SetDropHeight(190);
}       
/**
 * handling popup (FNS_INV_0086)<br>
 * <br><b>Example : </b>
 * <pre>
 *    getFNS_INV_0086_1(rowArray, 1, 1);
 * </pre>
 * @param String rowArray
 * @param number row
 * @param number col
 * @author Choi Do Soon
 * @version 2009.10.06
 */
function getFNS_INV_0086_1(rowArray, row, col) {         
    var colArray=rowArray[0];   
    document.form.act_cust_cnt_cd.value=colArray[8];
    document.form.act_cust_seq.value=ComLpad(colArray[9], 6, '0');
    fn_act_cust_chg();
}

/**India GST 면제*/
function fn_ida_gst_expt_cd(){
	
	 if(document.form.ida_gst_expt_cd.checked ){
		 document.form.ida_gst_expt_cd.value =  "E";
     }else{
   	     document.form.ida_gst_expt_cd.value =  ""; 
     }
}

/**India OFT Manual 예외- ALL Code와 동일처리*/
function fn_ida_oft_expt_flg(){
	 if(document.form.ida_oft_expt_flg.checked ){
		 document.form.ida_oft_expt_flg.value = "Y";
     }else{
  	     document.form.ida_oft_expt_flg.value = "N"; 
     }
}

/**Tax Invoice Exemption*/
function fn_tax_exp_flg(){
	 if(document.form.tax_exp_flg.checked ){
		 document.form.tax_exp_flg.value = "Y";
     }else{
  	     document.form.tax_exp_flg.value = "N"; 
     }
}


/**
 * function called when act_cust_cnt_cd, act_cust_seq  change<br>
 * <br><b>Example : </b>
 * <pre>
 *    fn_act_cust_chg();
 * </pre>
 * @author Choi Do Soon
 * @version 2009.10.06
 */


function fn_act_cust_chg(){
    fn_cust_nm();
    fn_dueDate_chg();
}
/**
 * function called when inv_cust_cnt_cd, inv_cust_seq change<br>
 * <br><b>Example : </b>
 * <pre>
 *    fn_inv_cust_chg();
 * </pre>
 * @author Choi Do Soon
 * @version 2009.10.20
 */
function fn_inv_cust_chg(){
    form.cust_cnt_cd.value=form.inv_cust_cnt_cd.value;
    form.cust_seq.value=form.inv_cust_seq.value;
    form.ofc_cd.value=form.ofc.value;
    if(form.inv_cust_seq.value!=''){              
        form.inv_cust_seq.value=ComLpad(form.inv_cust_seq.value.trim(), 6, "0");              
    }

    document.form.f_cmd.value=SEARCH03;
    if ((form.cust_cnt_cd.value.trim() != "" )&&(form.cust_seq.value.trim() != "" )&&(form.cust_seq.value.trim() != "000000")){
        var sXml=sheetObjects[0].GetSearchData("INVCommonGS.do", FormQueryString(document.form));
        delt_flg=ComGetEtcData(sXml,"delt_flg");
        cust_nm=ComGetEtcData(sXml,"cust_eng_nm");
        if (cust_nm == undefined) {
            form.cust_seq.value="";
            form.inv_cust_seq.value="";
            ComShowCodeMessage("INV00008");
            form.inv_cust_cnt_cd.focus();
            return;
        } 
        if(delt_flg=='Y'){
            form.inv_cust_seq.value="";
            form.cust_seq.value="";
            ComShowCodeMessage("INV00060");
            form.inv_cust_cnt_cd.focus();
            return;
        }
    }
    
    fn_dueDate_chg();
}
/**
 * function called when act_cust_cnt_cd, act_cust_seq change<br>
 * fn_act_cust_chg() 에서 호출
 * @author Choi Do Soon
 * @version 2009.10.06
 */
function fn_cust_nm(){

    document.form.f_cmd.value=SEARCH03;
    var cust_nm="";
    if ((form.cust_cnt_cd.value.trim() != "" )&&(form.cust_seq.value.trim() != "" )&&(form.cust_seq.value.trim() != "000000")){
        var sXml=sheetObjects[0].GetSearchData("INVCommonGS.do", FormQueryString(document.form));
        cust_nm=ComGetEtcData(sXml,"cust_eng_nm");
        if (cust_nm == undefined) {
            form.cust_nm.value="";
            form.act_cust_seq.value="";
            ComShowCodeMessage("INV00008");
            form.act_cust_cnt_cd.focus();
            return;
        } 
        delt_flg=ComGetEtcData(sXml,"delt_flg");
        if(delt_flg=='Y'){
            form.cust_nm.value="";
            form.act_cust_seq.value="";
            form.cust_seq.value="";
            ComShowCodeMessage("INV00060");
            form.act_cust_cnt_cd.focus();
            return;
        }
        form.cust_nm.value=cust_nm;
        form.cr_curr_cd.value=ComGetEtcData(sXml,"cr_curr_cd");
        form.cr_amt.value=ComGetEtcData(sXml,"cr_amt");
        form.ob_cr_term_dys.value=ComGetEtcData(sXml,"ob_cr_term_dys");
        form.ib_cr_term_dys.value=ComGetEtcData(sXml,"ib_cr_term_dys");
        form.cr_clt_ofc_cd.value=ComGetEtcData(sXml,"cr_clt_ofc_cd");
        form.cust_rgst_no.value=ComGetEtcData(sXml,"cust_rgst_no");
    }
}     
/**
 * function called when inv_cust_cnt_cd, inv_cust_seq change<br>
 * setting exchange rate 
 * <br><b>Example : </b>
 * <pre>
 *    fn_ex_rate_chg();
 * </pre>
 * @author Choi Do Soon
 * @version 2009.10.06
 */     
function fn_ex_rate_chg(){
    document.form.f_cmd.value=SEARCH05;
    sheetObjects[3].SetDataAutoTrim(1);
    var count = sheetObjects[3].RowCount("R");
    form.lcl_vvd.value=form.local_vvd.value.trim();
    for (var i=1; i < count+1; i++) {
        form.curr_cd.value=sheetObjects[3].GetCellText(i,"curr_cd");
        var sXml=sheetObjects[3].GetSearchData("INVCommonGS.do", FormQueryString(document.form));
        sheetObjects[3].SetCellText(i,"inv_xch_rt" ,ComGetEtcData(sXml,"ex_rate"));
        sheetObjects[3].SetCellText(i,"inv_xch_rt_dt" ,ComGetEtcData(sXml,"ex_rate_date"));
        if (i == 1) {
            form.xch_rt_n3rd_tp_cd.value=ComGetEtcData(sXml,"third_exrate_type");
            form.xch_rt_usd_tp_cd.value=ComGetEtcData(sXml,"usd_exrate_type");
            form.xch_rt_dt.value=ComGetEtcData(sXml,"ex_rate_date");
            form.obrd_cd.value=ComGetEtcData(sXml,"chg_indiv_cd");// oneboard type
        }
    }
    // usd check
    form.curr_cd.value="USD";
    var sXml2=sheetObjects[3].GetSearchData("INVCommonGS.do", FormQueryString(document.form));
    form.usd_xch_rt.value=ComGetEtcData(sXml2,"ex_rate");
}
/**
 * function called when vvd_cd,io_bound,pol_cd,pod_cd change<br>
 * setting sail_arr_dt 
 * <br><b>Example : </b>
 * <pre>
 *    fn_vvd_bound_pol_pod_chg();
 * </pre>
 * @author Choi Do Soon
 * @version 2009.10.06
 */
function fn_vvd_bound_pol_pod_chg(){
    document.form.f_cmd.value=SEARCH07;
    sheetObjects[3].SetDataAutoTrim(1);
    form.vvd.value=form.local_vvd.value.trim();
    form.bnd.value=form.io_bnd_cd.value.trim().substring(0,1);
    if (form.io_bnd_cd.value.trim().substring(0,1) == "O") {
        form.port.value=form.pol_cd.value.trim();  //outbound
    } else {
        form.port.value=form.pod_cd.value.trim();   //inbound
    }
    var sXml=sheetObjects[3].GetSearchData("INVCommonGS.do", FormQueryString(document.form));
    form.sail_arr_dt.value=ComGetEtcData(sXml,"sail_arr_dt");
    fn_dueDate_chg();
    fn_ex_rate_chg();
}
/**
 * function called when vvd_cd,io_bound,pol_cd,pod_cd,act_cust_cnt_cd,act_cust_seq change <br>
 * setting cr_flg,cr_term_dys,due_date 
 * <br><b>Example : </b>
 * <pre>
 *    fn_dueDate_chg();
 * </pre>
 * @author Choi Do Soon
 * @version 2009.10.06
 */
function fn_dueDate_chg(){
    form.cust_cnt_cd.value=form.act_cust_cnt_cd.value;
    form.cust_seq.value=form.act_cust_seq.value;
    form.ofc_cd.value=form.ofc.value;
    form.cust_rgst_no.value="";
    if(form.act_cust_seq.value!=''){
        document.form.f_cmd.value=SEARCH02;
        form.act_cust_seq.value=ComLpad(form.act_cust_seq.value.trim(), 6, "0");
        if(form.sail_arr_dt.value!=""){

            var sXml=sheetObjects[0].GetSearchData("FNS_INV_0016GS.do", FormQueryString(document.form));
            //form.cust_cr_flg.value=ComGetEtcData(sXml,"cr_flg");
            //form.cr_term_dys.value=ComGetEtcData(sXml,"cr_term");
            //form.due_dt.value=ComGetMaskedValue(ComGetEtcData(sXml,"due_dt"), "ymd");

			var dueDt=ComGetMaskedValue(ComGetEtcData(sXml,"due_date"), "ymd");
			var crCltOfcCd=ComGetEtcData(sXml,"cr_clt_ofc_cd");
			var ibCrTermDys=ComGetEtcData(sXml,"ib_cr_term_dys");
			var obCrTermDys=ComGetEtcData(sXml,"ob_cr_term_dys");
			var crAmt=ComGetEtcData(sXml,"cr_amt");
			var crCurrCd=ComGetEtcData(sXml,"cr_curr_cd");
			var crFlg=ComGetEtcData(sXml,"cr_flg");
			var crTermDys=ComGetEtcData(sXml,"cr_term_dys");
			
			if (dueDt != undefined) {
				form.due_dt.value=dueDt;
			} else {
				form.due_dt.value="";
			} 
			
			if (crFlg != undefined) {
	            form.cust_cr_flg.value=crFlg;
			} else {
				form.cust_cr_flg.value="";
			} 
            
			if (crCltOfcCd != undefined) {
				form.cr_clt_ofc_cd.value=crCltOfcCd;
			} else {
				form.cr_clt_ofc_cd.value="";
			}
			
			if (crTermDys != undefined) {
				form.cr_term_dys.value=crTermDys;
			} else {
				form.cr_term_dys.value="";
			}
			
			if (ibCrTermDys != undefined) {
				form.ib_cr_term_dys.value=ibCrTermDys;
			} else {
				form.ib_cr_term_dys.value="";
			}
			
			if (obCrTermDys != undefined) {
				form.ob_cr_term_dys.value=obCrTermDys;
			} else {
				form.ob_cr_term_dys.value="";
			}
			
			if (crAmt != undefined) {
				form.cr_amt.value=crAmt;
			} else {
				form.cr_amt.value="";
			}
			
			if (crCurrCd != undefined) {
				form.cr_curr_cd.value=crCurrCd;
			} else {
				form.cr_curr_cd.value="";
			}
  
            
            //form.cust_cr_flg.value=ComGetEtcData(sXml,"cr_flg");
            //form.due_dt.value=ComGetMaskedValue(ComGetEtcData(sXml,"due_date"), "ymd");
            //form.ib_cr_term_dys.value=ComGetEtcData(sXml,"ib_cr_term_dys");
            //form.ob_cr_term_dys.value=ComGetEtcData(sXml,"ib_cr_term_dys");
            //form.cr_clt_ofc_cd.value=ComGetEtcData(sXml,"cr_clt_ofc_cd");
            //form.cr_term_dys.value=ComGetEtcData(sXml,"cr_term_dys");
            //form.cr_amt.value=ComGetEtcData(sXml,"cr_amt");
            //form.cr_curr_cd.value=ComGetEtcData(sXml,"cr_curr_cd");
            
     
        }else{
            form.cust_cr_flg.value="";
            form.cr_term_dys.value="";
            form.due_dt.value="";
            form.ib_cr_term_dys.value="";
            form.ob_cr_term_dys.value="";
            form.cr_clt_ofc_cd.value="";
            form.cr_amt.value="";
            form.cr_curr_cd.value="";
        }
    }
}
/**
 *  add IBTab Object to setTabObject array
 */
function setTabObject(tab_obj){
    tabObjects[tabCnt++]=tab_obj;
}
/**
 * init tap
 */
function initTab(tabObj , tabNo) {
    switch(tabNo) {
    case 1:
        with (tabObj) {
            var cnt=0 ;
        InsertItem( "Correction" , "");
        InsertItem( "Charge" , "");
        SetSelectedIndex(0);
        }
        break;
    }
}
/**
 * tab click event
 */
function tab1_OnChange(tabObj , nItem)
{
    var objs=document.all.item("tabLayer");
    objs[nItem].style.display="Inline";
    objs[beforetab].style.display="none";
    //--------------- this is important! --------------------------//
    objs[beforetab].style.zIndex=objs[nItem].style.zIndex -1 ;
    //------------------------------------------------------//
    beforetab=nItem;
    resizeSheet();
}
/** 
 * validateForm <br>
 * <br><b>Example :</b>
 * <pre>
 * </pre>
 * @param  {IBSheet} sheetObj   
 * @param  {object} formObj
 * @param  {sAction} sAction 
 * @return true, false
 * @see #
 * @author Choi Do Soon
 * @version 2009.11.16
 */
function validateForm(sheetObj,formObj,sAction){
    with(formObj){
        switch(sAction) {
        case IBSEARCH:        //retrieve
            var sStr2=form.ots_smry_cd.value;
            if (sStr2=="INV") {
                if((form.bl_no.value.trim() != "")){
                    document.form.bkg_no.value="";
                    document.form.str_inv_no.value="";
                    document.form.if_no.value="";
                    
                    document.form.bl_srch_flg.value = "Y";
                }else{
                	document.form.bl_srch_flg.value = "N";
                }
                if( (form.str_inv_no.value.trim() == "") && (form.bl_no.value.trim() == "") ) {                     
                    ComShowCodeMessage("INV00004");
                    form.str_inv_no.focus();
                    return true;
                } 
            } else {
                document.form.bkg_no.value="";
                document.form.str_inv_no.value="";
                document.form.if_no.value="";
                
                document.form.bl_srch_flg.value = "Y";
                
                //if ((form.bl_no.value.trim() == "") || (form.bl_no.value.trim().length < 12))  {
                if (form.bl_no.value.trim() == "")  {
                    ComShowCodeMessage("INV00004");
                    form.bl_no.focus();
                    return true;
                } 
            }
            break;
        case IBSAVE:        //save
        	
            if (form.if_no.value == "") {
                ComShowCodeMessage("INV00004");
                form.bl_no.focus();
                return true;
            }
            if (form.act_cust_cnt_cd.value == "") {
                ComShowCodeMessage("INV00004");
                form.act_cust_cnt_cd.focus();
                return true;
            }
            if (form.act_cust_seq.value == "") {
                ComShowCodeMessage("INV00004");
                form.act_cust_seq.focus();
                return true;
            }
            if (form.inv_cust_cnt_cd.value == "") {
                ComShowCodeMessage("INV00004");
                form.inv_cust_cnt_cd.focus();
                return true;
            }
            if (form.inv_cust_seq.value == "") {
                ComShowCodeMessage("INV00004");
                form.inv_cust_seq.focus();
                return true;
            }
            if (form.local_vvd.value == "") {
                ComShowCodeMessage("INV00004");
                form.local_vvd.focus();
                return true;
            }
            if (form.pol_cd.value == "") {
                ComShowCodeMessage("INV00004");
                form.pol_cd.focus();
                return true;
            }
            if (form.pod_cd.value == "") {
                ComShowCodeMessage("INV00004");
                form.pod_cd.focus();
                return true;
            }
            break;
        }
    }     
    return;    
}
function t2sheet2_OnPopupClick(sheetObj, Row,Col){
    alert("popup_click");
}
function t2sheet1_OnChangeSum( sheetObj, Row )
{
    sheetObj.SetSumText(0,"curr_cd","Total");
    sheetObj.SetSumText(0,"locl_curr_cd",sheetObjects[2].GetCellValue(1, "locl_curr_cd"));//
    sheetObj.SetCellAlign(sheetObj.LastRow(),"curr_cd","Center");
    sheetObj.SetCellAlign(sheetObj.LastRow(),"locl_curr_cd","Center");
    form.inv_ttl_locl_amt.value=sheetObjects[2].GetCellValue(sheetObjects[2].LastRow(), "local_total");
}
/**
 * retrieve container popup <br>
 * <br><b>Example : </b>
 * <pre>
 *    open_container();
 * </pre>
 * @see FNS_INV_0098
 * @author Choi Do Soon
 * @version 2009.10.06
 */
function open_container() {
    ComOpenPopup('/opuscntr/FNS_INV_0098.do?pgmNo=FNS_INV_0098&pagetype=E', 700, 400, '', '0,0');       
}
/**
 * setting act_cust_cnt_cd,act_cust_seq from popup(FNS_INV_0013)<br>
 * <br><b>Example : </b>
 * <pre>
 *   getPopData(rowArray);
 * </pre>
 * @param String rowArray
 * @author Choi Do Soon
 * @version 2009.10.06
 */
function getPopData(rowArray){
    var colArray=rowArray[0];   
    document.form.act_cust_cnt_cd.value=colArray[1];
    document.form.act_cust_seq.value=colArray[2];
}
/**
 * function called when combo box ar_ofc_cd change<br>
 * <br><b>Example : </b>
 * <pre>
 *   ar_ofc_cd_OnChange(obj,oldindex, oldtext, oldcode , newindex, newtext , newcode);
 * </pre>
 * @param {IBMultiCombo} comboObj
 * @param {String} oldIndex
 * @param {String} oldText
 * @param {String} oldCode
 * @param {String} newIndex
 * @param {String} newText
 * @param {String} newCode
 * @author Choi Do Soon
 * @version 2009.10.06
 */ 
function ar_ofc_cd_OnChange(obj,oldindex, oldtext, oldcode , newindex, newtext , newcode){ 
    sheetObjects[0].RemoveAll();
    sheetObjects[1].RemoveAll();
    sheetObjects[2].RemoveAll();
    sheetObjects[3].RemoveAll();
    sheetObjects[4].RemoveAll();
    arrStr=newcode.split("^");        
    document.form.ofc.value=arrStr[1];
    var ar_ofc_cd_str=arrStr[3];    
    document.form.ofc_cd.value=form.ofc.value;
    document.form.loc_cd.value=arrStr[6];
    document.form.svr_id.value=arrStr[7];
    document.form.inv_dup_flg.value=arrStr[14];
    
    document.form.office_cnt_cd.value=arrStr[6].substring(0,2);
    var office_cnt_cd =  arrStr[6].substring(0,2);
    if(office_cnt_cd == "IN"){
    	ComEnableObject(document.form.ida_gst_expt_cd, true);
    	document.getElementById('ida_gst_expt_cd').style.display="";
    	document.getElementById('ida_gst_expt_nm').style.display="";
    	ComEnableObject(document.form.ida_oft_expt_flg, true);
    	document.getElementById('ida_oft_expt_flg').style.display="";
    	document.getElementById('ida_oft_expt_nm').style.display="";
    }else{
    	document.form.ida_gst_expt_cd.value ="";
    	ComEnableObject(document.form.ida_gst_expt_cd, false);
    	document.getElementById('ida_gst_expt_cd').style.display="none";
    	document.getElementById('ida_gst_expt_nm').style.display="none";
    	
    	document.form.ida_oft_expt_flg.value ="N";
    	ComEnableObject(document.form.ida_oft_expt_flg, false);
    	document.getElementById('ida_oft_expt_flg').style.display="none";
    	document.getElementById('ida_oft_expt_nm').style.display="none";
    } 	
    
    document.form.f_cmd.value=SEARCH;
    var sXml2=sheetObjects[0].GetSearchData("FNS_INV_0016GS.do", FormQueryString(document.form));
    var sStr2=ComGetEtcData(sXml2,"ots_smry_cd");
    document.form.ots_smry_cd.value=sStr2;
    if (sStr2=="INV") {
        form.str_inv_no.readOnly=false ;
        document.all.str_inv_no.className="input" ;
    } else {
        form.str_inv_no.readOnly=true;
        document.all.str_inv_no.className="input2" ;
    }
    checkTaxCountry(); 
}
/**
 * retrieve effective Date <br>
 * <br><b>Example : </b>
 * <pre>
 *    effectiveDtCheck();
 * </pre>
 * @author Choi Do Soon
 * @version 2009.11.11
 */
function effectiveDtCheck(){
    document.form.f_cmd.value=SEARCH08;           
    var sXml=sheetObjects[0].GetSearchData("INVCommonGS.do", FormQueryString(document.form));
    document.form.sail_dt.value=ComGetEtcData(sXml,"sail_dt");
    document.form.f_cmd.value=SEARCH09;           
    var sXml=sheetObjects[0].GetSearchData("INVCommonGS.do", FormQueryString(document.form));
    document.form.gl_eff_dt.value=ComGetEtcData(sXml,"eff_dt");
    document.form.gl_eff_dt.value=ComGetMaskedValue(document.form.gl_eff_dt,"ymd","-");
    return ComGetEtcData(sXml,"eff_dt");
}
function keyEnterRetreive(e){
    if(e.keyCode == 9 || e.keyCode == '13') {
        doActionIBSheet(sheetObjects[0],document.form,IBSEARCH);
    }
}
/**KEY Event<br>
 * @author Choi Do Soon
 * @version 2009.11.10
 */
function initControl() {
    axon_event.addListenerFormat('keypress', 'obj_keypress', form); //- 키보드 입력할때
    axon_event.addListenerForm ('focusout', 'obj_focusout', form);
}
/**KEY Event<br>
 * @author Choi Do Soon
 * @version 2009.11.10
 */
function obj_keypress(){
    switch(ComGetEvent("dataformat")){
    case "float":
        //number+"."
        ComKeyOnlyNumber(ComGetEvent(), ".");
        break;
    case "ymd":
        //number+"-"
        ComKeyOnlyNumber(ComGetEvent());
        break;
    case "eng":
        //english only
        ComKeyOnlyAlphabet();
        break;
    case "engdn":
        //lower case only
        ComKeyOnlyAlphabet('lower');
        break;
    case "engup":
        //upper case only
        ComKeyOnlyAlphabet('upper');
        break;
    case "num":
        //number only
        ComKeyOnlyNumber('num');
        break;
    case "uppernum":
        //upper case+number 
        ComKeyOnlyAlphabet('uppernum');
        break;
    default:
        //upper case only
        ComKeyOnlyAlphabet('upper');
    }
} 

/** 
 * OnFocusOut event(on focus out)<br>
 * <br><b>Example :</b>
 * <pre>
 * 
 * </pre>
 * @param none
 * @return none
 * @see #
 * @author 박정진
 * @version 2009.05.04
 */
function obj_focusout() {
    var sheetObject=sheetObjects[0];
    var formObject=document.form;
    var v_tmp="";
    switch(ComGetEvent("name")){
        case "act_cust_seq":
			if (formObject.act_cust_seq.value.length != 0 && formObject.act_cust_seq.value.length < 6) {
				for(i=0; i < 6 - formObject.act_cust_seq.value.length; i++){
					v_tmp=v_tmp + "0";
				}
				formObject.act_cust_seq.value=v_tmp+formObject.act_cust_seq.value;
			}	            	
            if (formObject.act_cust_cnt_cd.value != '' && formObject.act_cust_seq.value) {
                doActionIBSheet(sheetObject,formObject,IBSEARCH_ASYNC20);
            }
            if(formObject.act_cust_cnt_cd.value == '' || formObject.act_cust_seq.value == ''){
            	formObject.cust_nm.value = '';
            }
        case "act_cust_cnt_cd":
            if(formObject.act_cust_cnt_cd.value == '' || formObject.act_cust_seq.value == ''){
            	formObject.cust_nm.value = '';
            }
        	
        break;
    }
}

 /**
 * retrieve Customer Name  <br>
 * <br><b>Example :</b>
 * <pre>
 *    fn_rgst_chg();
 * </pre>
 * @param none
 * @return none
 * @author 정휘택
 * @version 2009.10.20
 */
function fn_rgst_chg() {
    var sheetObject=sheetObjects[0];
    var formObject=document.form;
    doActionIBSheet(sheetObject,formObject,IBSEARCH_ASYNC03);  
    fn_dueDate_chg()
}    

function resizeSheet(){
//	ComResizeSheet(sheetObjects[2]);
	ComResizeSheet(sheetObjects[3]);
}

/**Tax Invoice Exemption (2017-12-08)*/
function fn_tax_exp_chk(){
	 if(document.form.tax_exp_chk.checked ){
		 document.form.tax_exp_flg.value = "Y";
     }else{
  	     document.form.tax_exp_flg.value = "N"; 
     }
}
/**Check Tax Country HJ.Jeong (2017-12-08)*/
function checkTaxCountry() {
	 var sheetObject=sheetObjects[0];
	 var formObject=document.form;	 
	 doActionIBSheet(sheetObject,formObject,IBSEARCH_ASYNC10);
	 if(formObject.tax_cnt_flg.value == "Y") {
	     document.getElementById('tax_exp_mn').style.display="block";
	     document.getElementById('tax_exp_chk').style.display="block";
	 } else{
	     document.getElementById('tax_exp_mn').style.display="none";
	     document.getElementById('tax_exp_chk').style.display="none";
	 }
	 formObject.tax_exp_chk.checked = false;
	 formObject.tax_exp_flg.value = "N";
}
