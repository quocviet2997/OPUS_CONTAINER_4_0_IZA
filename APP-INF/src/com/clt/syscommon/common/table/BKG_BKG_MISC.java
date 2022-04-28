/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : BKG_BKG_MISC.java
*@FileTitle : 사용자 관리5
*Open Issues :
*Change history :
*@LastModifyDate : 2007-01-05
*@LastModifier : Kildong_hong6
*@LastVersion : 1.0
* 2007-01-05 Kildong_hong6
* 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.common.table;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;

import com.clt.framework.component.util.JSPUtil;

/**
 * Table Value Ojbect<br>
 * - 모든 업무에서 공통으로 사용하는 PDTO(Data Transfer Object including Parameters)<br>
 * - 관련 Event에서 작성, 서버실행요청시 PDTO의 역할을 수행하는 Value Object<br>
 * 
 * @author Kildong_hong6
 * @since J2EE 1.4
 */
public final class BKG_BKG_MISC implements java.io.Serializable {

	private String                  ibflag                  = "";
	private String                  page_rows               = "";
	private String                  bkg_no                  = "";
	private String                  bkg_no_split            = "";
	private String                  bl_no                   = "";
	private String                  bl_no_tp                = "";
	private String                  bl_no_chk               = "";
	private String                  gen_rfa_no              = "";
	private String                  gen_rfa_ofc_cty_cd      = "";
	private String                  sc_prop_no              = "";
	private String                  bl_trf_no               = "";
	private String                  teu_grs_rev_amt         = "";
	private String                  feu_grs_rev_amt         = "";
	private String                  teu_net_rev_amt         = "";
	private String                  feu_net_rev_amt         = "";
	private String                  teu_cost_amt            = "";
	private String                  feu_cost_amt            = "";
	private String                  teu_mgn_rev_amt         = "";
	private String                  feu_mgn_rev_amt         = "";
	private String                  bkg_cfm_flg             = "";
	private String                  bkg_cfm_dt              = "";
	private String                  bkg_cfm_usr_id          = "";
	private String                  bl_frt_cd               = "";
	private String                  bl_do_no                = "";
	private String                  do_ofc_cd               = "";
	private String                  do_dt                   = "";
	private String                  bl_ppd_cd               = "";
	private String                  bl_ppd_ofc_cd           = "";
	private String                  bl_ppd_dt               = "";
	private String                  bl_clt_cd               = "";
	private String                  bl_clt_ofc_cd           = "";
	private String                  bl_clt_dt               = "";
	private String                  bl_rat_cd               = "";
	private String                  bl_rat_cng_cd           = "";
	private String                  bl_inv_ppd_cd           = "";
	private String                  bl_inv_clt_cd           = "";
	private String                  bl_inv_com_cd           = "";
	private String                  bl_mrn_no               = "";
	private String                  bl_mrn_no_sub_seq       = "";
	private String                  org_bl_rcv_cd           = "";
	private String                  org_bl_rcv_usr_id       = "";
	private String                  cgo_de_cd               = "";
	private String                  xpt_decl_cd             = "";
	private String                  bl_cpy_no               = "";
	private String                  org_iss_knt             = "";
	private String                  bl_dt                   = "";
	private String                  bl_iss_ofc_cd           = "";
	private String                  bl_iss_nm               = "";
	private String                  bl_doc_usr_id           = "";
	private String                  bl_iss_flg              = "";
	private String                  bl_org_cnt_nm           = "";
	private String                  bl_mv_tp_nm             = "";
	private String                  bl_fnl_dest_nm          = "";
	private String                  bl_ttl_pck_desc         = "";
	private String                  bl_xpt_lic_no           = "";
	private String                  bl_tp_cd                = "";
	private String                  bl_obrd_tp_cd           = "";
	private String                  bl_obrd_dt              = "";
	private String                  bl_vsl_nm               = "";
	private String                  bl_pre_vsl_nm           = "";
	private String                  bl_por_nm               = "";
	private String                  bl_pol_nm               = "";
	private String                  bl_pod_nm               = "";
	private String                  bl_del_nm               = "";
	private String                  cstms_clr_cd            = "";
	private String                  cstms_clr_loc_cd        = "";
	private String                  cstms_clr_wr_hus_nm     = "";
	private String                  cstms_clr_flg           = "";
	private String                  imdt_trsp_ref_no        = "";
	private String                  cgo_inv_val_no          = "";
	private String                  bd_doc_rcv_ofc_cd       = "";
	private String                  bd_doc_rcv_dt           = "";
	private String                  otr_doc_tp_cd           = "";
	private String                  otr_doc_rcv_ofc_cd      = "";
	private String                  otr_doc_rcv_dt          = "";
	private String                  org_bl_rcv_ofc_cd       = "";
	private String                  org_bl_rcv_dt           = "";
	private String                  org_bl_rcv_no           = "";
	private String                  mf_cfm_flg              = "";
	private String                  locl_clr_flg            = "";
	private String                  bl_iss_rmk              = "";
	private String                  bkg_svc_scp_cd          = "";
	private String                  bl_por_cd               = "";
	private String                  bl_pol_cd               = "";
	private String                  bl_pod_cd               = "";
	private String                  bl_del_cd               = "";
	private String                  org_bl_rdem_ofc_cd      = "";
	private String                  org_bl_rdem_dt          = "";
	private String                  org_bl_rdem_no          = "";
	private String                  bl_ppd_ofc_n3rd_pay_flg = "";
	private String                  bl_cct_ofc_n3rd_pay_flg = "";
	private String                  an_cust_fax_no          = "";
	private String                  an_cust_fax_no2         = "";
	private String                  an_cust_fax_no3         = "";
	private String                  bl_mst_no               = "";
	private String                  bl_mst_div_cd           = "";
	private String                  bl_cust_tp_cd           = "";
	private String                  finc_if_dt              = "";
	private String                  frt_fwrd_fmc_no         = "";
	private String                  repl_flg                = "";
	private String                  bl_mst_bkg_no           = "";
	private String                  bl_mst_bkg_no_split     = "";
	private String                  bl_split_cd             = "";
	private String                  cgo_arr_dt              = "";
	private String                  cgo_pkup_aval_dt        = "";
	private String                  free_dt_to_pkup_dt      = "";
	private String                  cgo_pkup_cy_cd          = "";
	private String                  cgo_pkup_cfs_cd         = "";
	private String                  hcos_if_flg             = "";
	private String                  mty_rlse_cfm_flg        = "";
	private String                  finc_seq                = "";
	private String                  wt_flg                  = "";
	private String                  cpls_frm_flg            = "";
	private String                  rfa_no                  = "";
	private String                  nis_evnt_dt             = "";
	private String                  bank_cd                 = "";
	private String                  bank_flg                = "";
	private String                  prnt_cnt_cd             = "";
	private String                  prnt_cust_seq           = "";
	private String                  po_no                   = "";
	private String                  bl_pod_dt               = "";
	private String                  sony_inv_desc           = "";
	private String                  finc_inv_no             = "";
	private String                  rdem_upd_usr_id         = "";
	private String                  otr_doc_upd_usr_id      = "";
	private String                  ib_doc_upd_usr_id       = "";
	private String                  frt_sts_upd_usr_id      = "";
	private String                  nvocc_file_no           = "";
	private String                  hus_bl_ttl_knt          = "";
	private String                  blck_bl_flg             = "";
	private String                  ublck_usr_id            = "";
	private String                  ublck_dt                = "";
	private String                  bl_ublck_dt             = "";
	private String                  cnd_nvocc_no            = "";
	private String                  dept_no                 = "";
	private String                  edo_trk_cd              = "";
	private String                  edo_trk_nm              = "";
	private String                  pkl_shpr_call_no        = "";
	private String                  vsl_ref_no              = "";
	private String                  bl_cfm_usr_id           = "";
	private String                  bl_cfm_dt               = "";
	private String                  bl_cfm_flg              = "";
	private String                  do_asgn_pre_rmk         = "";
	private String                  bkg_alt_cust_cfm_flg    = "";
	private String                  sc_act_cust_cnt_cd      = "";
	private String                  sc_act_cust_seq         = "";
	private String                  all_mtr_flg             = "";
	private String                  all_mtr_chg_flg         = "";
	private String                  bkg_split_rto			= ""; // 2007 12 06 hyunsu added 
	private String                  eai_evnt_dt             = "";
	  
	public BKG_BKG_MISC(){}

	public BKG_BKG_MISC(
			String                  ibflag                 ,
			String                  page_rows              ,
			String                  bkg_no                 ,
			String                  bkg_no_split           ,
			String                  bl_no                  ,
			String                  bl_no_tp               ,
			String                  bl_no_chk              ,
			String                  gen_rfa_no             ,
			String                  gen_rfa_ofc_cty_cd     ,
			String                  sc_prop_no             ,
			String                  bl_trf_no              ,
			String                  teu_grs_rev_amt        ,
			String                  feu_grs_rev_amt        ,
			String                  teu_net_rev_amt        ,
			String                  feu_net_rev_amt        ,
			String                  teu_cost_amt           ,
			String                  feu_cost_amt           ,
			String                  teu_mgn_rev_amt        ,
			String                  feu_mgn_rev_amt        ,
			String                  bkg_cfm_flg            ,
			String                  bkg_cfm_dt             ,
			String                  bkg_cfm_usr_id         ,
			String                  bl_frt_cd              ,
			String                  bl_do_no               ,
			String                  do_ofc_cd              ,
			String                  do_dt                  ,
			String                  bl_ppd_cd              ,
			String                  bl_ppd_ofc_cd          ,
			String                  bl_ppd_dt              ,
			String                  bl_clt_cd              ,
			String                  bl_clt_ofc_cd          ,
			String                  bl_clt_dt              ,
			String                  bl_rat_cd              ,
			String                  bl_rat_cng_cd          ,
			String                  bl_inv_ppd_cd          ,
			String                  bl_inv_clt_cd          ,
			String                  bl_inv_com_cd          ,
			String                  bl_mrn_no              ,
			String                  bl_mrn_no_sub_seq      ,
			String                  org_bl_rcv_cd          ,
			String                  org_bl_rcv_usr_id      ,
			String                  cgo_de_cd              ,
			String                  xpt_decl_cd            ,
			String                  bl_cpy_no              ,
			String                  org_iss_knt            ,
			String                  bl_dt                  ,
			String                  bl_iss_ofc_cd          ,
			String                  bl_iss_nm              ,
			String                  bl_doc_usr_id          ,
			String                  bl_iss_flg             ,
			String                  bl_org_cnt_nm          ,
			String                  bl_mv_tp_nm            ,
			String                  bl_fnl_dest_nm         ,
			String                  bl_ttl_pck_desc        ,
			String                  bl_xpt_lic_no          ,
			String                  bl_tp_cd               ,
			String                  bl_obrd_tp_cd          ,
			String                  bl_obrd_dt             ,
			String                  bl_vsl_nm              ,
			String                  bl_pre_vsl_nm          ,
			String                  bl_por_nm              ,
			String                  bl_pol_nm              ,
			String                  bl_pod_nm              ,
			String                  bl_del_nm              ,
			String                  cstms_clr_cd           ,
			String                  cstms_clr_loc_cd       ,
			String                  cstms_clr_wr_hus_nm    ,
			String                  cstms_clr_flg          ,
			String                  imdt_trsp_ref_no       ,
			String                  cgo_inv_val_no         ,
			String                  bd_doc_rcv_ofc_cd      ,
			String                  bd_doc_rcv_dt          ,
			String                  otr_doc_tp_cd          ,
			String                  otr_doc_rcv_ofc_cd     ,
			String                  otr_doc_rcv_dt         ,
			String                  org_bl_rcv_ofc_cd      ,
			String                  org_bl_rcv_dt          ,
			String                  org_bl_rcv_no          ,
			String                  mf_cfm_flg             ,
			String                  locl_clr_flg           ,
			String                  bl_iss_rmk             ,
			String                  bkg_svc_scp_cd         ,
			String                  bl_por_cd              ,
			String                  bl_pol_cd              ,
			String                  bl_pod_cd              ,
			String                  bl_del_cd              ,
			String                  org_bl_rdem_ofc_cd     ,
			String                  org_bl_rdem_dt         ,
			String                  org_bl_rdem_no         ,
			String                  bl_ppd_ofc_n3rd_pay_flg,
			String                  bl_cct_ofc_n3rd_pay_flg,
			String                  an_cust_fax_no         ,
			String                  an_cust_fax_no2        ,
			String                  an_cust_fax_no3        ,
			String                  bl_mst_no              ,
			String                  bl_mst_div_cd          ,
			String                  bl_cust_tp_cd          ,
			String                  finc_if_dt             ,
			String                  frt_fwrd_fmc_no        ,
			String                  repl_flg               ,
			String                  bl_mst_bkg_no          ,
			String                  bl_mst_bkg_no_split    ,
			String                  bl_split_cd            ,
			String                  cgo_arr_dt             ,
			String                  cgo_pkup_aval_dt       ,
			String                  free_dt_to_pkup_dt     ,
			String                  cgo_pkup_cy_cd         ,
			String                  cgo_pkup_cfs_cd        ,
			String                  hcos_if_flg            ,
			String                  mty_rlse_cfm_flg       ,
			String                  finc_seq               ,
			String                  wt_flg                 ,
			String                  cpls_frm_flg           ,
			String                  rfa_no                 ,
			String                  nis_evnt_dt            ,
			String                  bank_cd                ,
			String                  bank_flg               ,
			String                  prnt_cnt_cd            ,
			String                  prnt_cust_seq          ,
			String                  po_no                  ,
			String                  bl_pod_dt              ,
			String                  sony_inv_desc          ,
			String                  finc_inv_no            ,
			String                  rdem_upd_usr_id        ,
			String                  otr_doc_upd_usr_id     ,
			String                  ib_doc_upd_usr_id      ,
			String                  frt_sts_upd_usr_id     ,
			String                  nvocc_file_no          ,
			String                  hus_bl_ttl_knt         ,
			String                  blck_bl_flg            ,
			String                  ublck_usr_id           ,
			String                  ublck_dt               ,
			String                  bl_ublck_dt            ,
			String                  cnd_nvocc_no           ,
			String                  dept_no                ,
			String                  edo_trk_cd             ,
			String                  edo_trk_nm             ,
			String                  pkl_shpr_call_no       ,
			String                  vsl_ref_no             ,
			String                  bl_cfm_usr_id          ,
			String                  bl_cfm_dt              ,
			String                  bl_cfm_flg             ,
			String                  do_asgn_pre_rmk        ,
			String                  bkg_alt_cust_cfm_flg   ,
			String                  sc_act_cust_cnt_cd     ,
			String                  sc_act_cust_seq        ,
			String                  all_mtr_flg            ,
			String                  all_mtr_chg_flg        ,
			String					bkg_split_rto		   , // 2007 12 06 hyunsu added 
			String                  eai_evnt_dt            ){
		this.ibflag                  = ibflag                 ;
		this.page_rows               = page_rows              ;
		this.bkg_no                  = bkg_no                 ;
		this.bkg_no_split            = bkg_no_split           ;
		this.bl_no                   = bl_no                  ;
		this.bl_no_tp                = bl_no_tp               ;
		this.bl_no_chk               = bl_no_chk              ;
		this.gen_rfa_no              = gen_rfa_no             ;
		this.gen_rfa_ofc_cty_cd      = gen_rfa_ofc_cty_cd     ;
		this.sc_prop_no              = sc_prop_no             ;
		this.bl_trf_no               = bl_trf_no              ;
		this.teu_grs_rev_amt         = teu_grs_rev_amt        ;
		this.feu_grs_rev_amt         = feu_grs_rev_amt        ;
		this.teu_net_rev_amt         = teu_net_rev_amt        ;
		this.feu_net_rev_amt         = feu_net_rev_amt        ;
		this.teu_cost_amt            = teu_cost_amt           ;
		this.feu_cost_amt            = feu_cost_amt           ;
		this.teu_mgn_rev_amt         = teu_mgn_rev_amt        ;
		this.feu_mgn_rev_amt         = feu_mgn_rev_amt        ;
		this.bkg_cfm_flg             = bkg_cfm_flg            ;
		this.bkg_cfm_dt              = bkg_cfm_dt             ;
		this.bkg_cfm_usr_id          = bkg_cfm_usr_id         ;
		this.bl_frt_cd               = bl_frt_cd              ;
		this.bl_do_no                = bl_do_no               ;
		this.do_ofc_cd               = do_ofc_cd              ;
		this.do_dt                   = do_dt                  ;
		this.bl_ppd_cd               = bl_ppd_cd              ;
		this.bl_ppd_ofc_cd           = bl_ppd_ofc_cd          ;
		this.bl_ppd_dt               = bl_ppd_dt              ;
		this.bl_clt_cd               = bl_clt_cd              ;
		this.bl_clt_ofc_cd           = bl_clt_ofc_cd          ;
		this.bl_clt_dt               = bl_clt_dt              ;
		this.bl_rat_cd               = bl_rat_cd              ;
		this.bl_rat_cng_cd           = bl_rat_cng_cd          ;
		this.bl_inv_ppd_cd           = bl_inv_ppd_cd          ;
		this.bl_inv_clt_cd           = bl_inv_clt_cd          ;
		this.bl_inv_com_cd           = bl_inv_com_cd          ;
		this.bl_mrn_no               = bl_mrn_no              ;
		this.bl_mrn_no_sub_seq       = bl_mrn_no_sub_seq      ;
		this.org_bl_rcv_cd           = org_bl_rcv_cd          ;
		this.org_bl_rcv_usr_id       = org_bl_rcv_usr_id      ;
		this.cgo_de_cd               = cgo_de_cd              ;
		this.xpt_decl_cd             = xpt_decl_cd            ;
		this.bl_cpy_no               = bl_cpy_no              ;
		this.org_iss_knt             = org_iss_knt            ;
		this.bl_dt                   = bl_dt                  ;
		this.bl_iss_ofc_cd           = bl_iss_ofc_cd          ;
		this.bl_iss_nm               = bl_iss_nm              ;
		this.bl_doc_usr_id           = bl_doc_usr_id          ;
		this.bl_iss_flg              = bl_iss_flg             ;
		this.bl_org_cnt_nm           = bl_org_cnt_nm          ;
		this.bl_mv_tp_nm             = bl_mv_tp_nm            ;
		this.bl_fnl_dest_nm          = bl_fnl_dest_nm         ;
		this.bl_ttl_pck_desc         = bl_ttl_pck_desc        ;
		this.bl_xpt_lic_no           = bl_xpt_lic_no          ;
		this.bl_tp_cd                = bl_tp_cd               ;
		this.bl_obrd_tp_cd           = bl_obrd_tp_cd          ;
		this.bl_obrd_dt              = bl_obrd_dt             ;
		this.bl_vsl_nm               = bl_vsl_nm              ;
		this.bl_pre_vsl_nm           = bl_pre_vsl_nm          ;
		this.bl_por_nm               = bl_por_nm              ;
		this.bl_pol_nm               = bl_pol_nm              ;
		this.bl_pod_nm               = bl_pod_nm              ;
		this.bl_del_nm               = bl_del_nm              ;
		this.cstms_clr_cd            = cstms_clr_cd           ;
		this.cstms_clr_loc_cd        = cstms_clr_loc_cd       ;
		this.cstms_clr_wr_hus_nm     = cstms_clr_wr_hus_nm    ;
		this.cstms_clr_flg           = cstms_clr_flg          ;
		this.imdt_trsp_ref_no        = imdt_trsp_ref_no       ;
		this.cgo_inv_val_no          = cgo_inv_val_no         ;
		this.bd_doc_rcv_ofc_cd       = bd_doc_rcv_ofc_cd      ;
		this.bd_doc_rcv_dt           = bd_doc_rcv_dt          ;
		this.otr_doc_tp_cd           = otr_doc_tp_cd          ;
		this.otr_doc_rcv_ofc_cd      = otr_doc_rcv_ofc_cd     ;
		this.otr_doc_rcv_dt          = otr_doc_rcv_dt         ;
		this.org_bl_rcv_ofc_cd       = org_bl_rcv_ofc_cd      ;
		this.org_bl_rcv_dt           = org_bl_rcv_dt          ;
		this.org_bl_rcv_no           = org_bl_rcv_no          ;
		this.mf_cfm_flg              = mf_cfm_flg             ;
		this.locl_clr_flg            = locl_clr_flg           ;
		this.bl_iss_rmk              = bl_iss_rmk             ;
		this.bkg_svc_scp_cd          = bkg_svc_scp_cd         ;
		this.bl_por_cd               = bl_por_cd              ;
		this.bl_pol_cd               = bl_pol_cd              ;
		this.bl_pod_cd               = bl_pod_cd              ;
		this.bl_del_cd               = bl_del_cd              ;
		this.org_bl_rdem_ofc_cd      = org_bl_rdem_ofc_cd     ;
		this.org_bl_rdem_dt          = org_bl_rdem_dt         ;
		this.org_bl_rdem_no          = org_bl_rdem_no         ;
		this.bl_ppd_ofc_n3rd_pay_flg = bl_ppd_ofc_n3rd_pay_flg;
		this.bl_cct_ofc_n3rd_pay_flg = bl_cct_ofc_n3rd_pay_flg;
		this.an_cust_fax_no          = an_cust_fax_no         ;
		this.an_cust_fax_no2         = an_cust_fax_no2        ;
		this.an_cust_fax_no3         = an_cust_fax_no3        ;
		this.bl_mst_no               = bl_mst_no              ;
		this.bl_mst_div_cd           = bl_mst_div_cd          ;
		this.bl_cust_tp_cd           = bl_cust_tp_cd          ;
		this.finc_if_dt              = finc_if_dt             ;
		this.frt_fwrd_fmc_no         = frt_fwrd_fmc_no        ;
		this.repl_flg                = repl_flg               ;
		this.bl_mst_bkg_no           = bl_mst_bkg_no          ;
		this.bl_mst_bkg_no_split     = bl_mst_bkg_no_split    ;
		this.bl_split_cd             = bl_split_cd            ;
		this.cgo_arr_dt              = cgo_arr_dt             ;
		this.cgo_pkup_aval_dt        = cgo_pkup_aval_dt       ;
		this.free_dt_to_pkup_dt      = free_dt_to_pkup_dt     ;
		this.cgo_pkup_cy_cd          = cgo_pkup_cy_cd         ;
		this.cgo_pkup_cfs_cd         = cgo_pkup_cfs_cd        ;
		this.hcos_if_flg             = hcos_if_flg            ;
		this.mty_rlse_cfm_flg        = mty_rlse_cfm_flg       ;
		this.finc_seq                = finc_seq               ;
		this.wt_flg                  = wt_flg                 ;
		this.cpls_frm_flg            = cpls_frm_flg           ;
		this.rfa_no                  = rfa_no                 ;
		this.nis_evnt_dt             = nis_evnt_dt            ;
		this.bank_cd                 = bank_cd                ;
		this.bank_flg                = bank_flg               ;
		this.prnt_cnt_cd             = prnt_cnt_cd            ;
		this.prnt_cust_seq           = prnt_cust_seq          ;
		this.po_no                   = po_no                  ;
		this.bl_pod_dt               = bl_pod_dt              ;
		this.sony_inv_desc           = sony_inv_desc          ;
		this.finc_inv_no             = finc_inv_no            ;
		this.rdem_upd_usr_id         = rdem_upd_usr_id        ;
		this.otr_doc_upd_usr_id      = otr_doc_upd_usr_id     ;
		this.ib_doc_upd_usr_id       = ib_doc_upd_usr_id      ;
		this.frt_sts_upd_usr_id      = frt_sts_upd_usr_id     ;
		this.nvocc_file_no           = nvocc_file_no          ;
		this.hus_bl_ttl_knt          = hus_bl_ttl_knt         ;
		this.blck_bl_flg             = blck_bl_flg            ;
		this.ublck_usr_id            = ublck_usr_id           ;
		this.ublck_dt                = ublck_dt               ;
		this.bl_ublck_dt             = bl_ublck_dt            ;
		this.cnd_nvocc_no            = cnd_nvocc_no           ;
		this.dept_no                 = dept_no                ;
		this.edo_trk_cd              = edo_trk_cd             ;
		this.edo_trk_nm              = edo_trk_nm             ;
		this.pkl_shpr_call_no        = pkl_shpr_call_no       ;
		this.vsl_ref_no              = vsl_ref_no             ;
		this.bl_cfm_usr_id           = bl_cfm_usr_id          ;
		this.bl_cfm_dt               = bl_cfm_dt              ;
		this.bl_cfm_flg              = bl_cfm_flg             ;
		this.do_asgn_pre_rmk         = do_asgn_pre_rmk        ;
		this.bkg_alt_cust_cfm_flg    = bkg_alt_cust_cfm_flg   ;
		this.sc_act_cust_cnt_cd      = sc_act_cust_cnt_cd     ;
		this.sc_act_cust_seq         = sc_act_cust_seq        ;
		this.all_mtr_flg             = all_mtr_flg            ;
		this.all_mtr_chg_flg         = all_mtr_chg_flg        ;
		this.bkg_split_rto			 = bkg_split_rto		  ; // 2007 12 06 hyunsu added 
		this.eai_evnt_dt             = eai_evnt_dt            ;
	}

	// getter method is proceeding ..
	public String                  getIbflag                 (){	return ibflag                 	;	}
	public String                  getPage_rows              (){	return page_rows              	;	}
	public String                  getBkg_no                 (){	return bkg_no                 	;	}
	public String                  getBkg_no_split           (){	return bkg_no_split           	;	}
	public String                  getBl_no                  (){	return bl_no                  	;	}
	public String                  getBl_no_tp               (){	return bl_no_tp               	;	}
	public String                  getBl_no_chk              (){	return bl_no_chk              	;	}
	public String                  getGen_rfa_no             (){	return gen_rfa_no             	;	}
	public String                  getGen_rfa_ofc_cty_cd     (){	return gen_rfa_ofc_cty_cd     	;	}
	public String                  getSc_prop_no             (){	return sc_prop_no             	;	}
	public String                  getBl_trf_no              (){	return bl_trf_no              	;	}
	public String                  getTeu_grs_rev_amt        (){	return teu_grs_rev_amt        	;	}
	public String                  getFeu_grs_rev_amt        (){	return feu_grs_rev_amt        	;	}
	public String                  getTeu_net_rev_amt        (){	return teu_net_rev_amt        	;	}
	public String                  getFeu_net_rev_amt        (){	return feu_net_rev_amt        	;	}
	public String                  getTeu_cost_amt           (){	return teu_cost_amt           	;	}
	public String                  getFeu_cost_amt           (){	return feu_cost_amt           	;	}
	public String                  getTeu_mgn_rev_amt        (){	return teu_mgn_rev_amt        	;	}
	public String                  getFeu_mgn_rev_amt        (){	return feu_mgn_rev_amt        	;	}
	public String                  getBkg_cfm_flg            (){	return bkg_cfm_flg            	;	}
	public String                  getBkg_cfm_dt             (){	return bkg_cfm_dt             	;	}
	public String                  getBkg_cfm_usr_id         (){	return bkg_cfm_usr_id         	;	}
	public String                  getBl_frt_cd              (){	return bl_frt_cd              	;	}
	public String                  getBl_do_no               (){	return bl_do_no               	;	}
	public String                  getDo_ofc_cd              (){	return do_ofc_cd              	;	}
	public String                  getDo_dt                  (){	return do_dt                  	;	}
	public String                  getBl_ppd_cd              (){	return bl_ppd_cd              	;	}
	public String                  getBl_ppd_ofc_cd          (){	return bl_ppd_ofc_cd          	;	}
	public String                  getBl_ppd_dt              (){	return bl_ppd_dt              	;	}
	public String                  getBl_clt_cd              (){	return bl_clt_cd              	;	}
	public String                  getBl_clt_ofc_cd          (){	return bl_clt_ofc_cd          	;	}
	public String                  getBl_clt_dt              (){	return bl_clt_dt              	;	}
	public String                  getBl_rat_cd              (){	return bl_rat_cd              	;	}
	public String                  getBl_rat_cng_cd          (){	return bl_rat_cng_cd          	;	}
	public String                  getBl_inv_ppd_cd          (){	return bl_inv_ppd_cd          	;	}
	public String                  getBl_inv_clt_cd          (){	return bl_inv_clt_cd          	;	}
	public String                  getBl_inv_com_cd          (){	return bl_inv_com_cd          	;	}
	public String                  getBl_mrn_no              (){	return bl_mrn_no              	;	}
	public String                  getBl_mrn_no_sub_seq      (){	return bl_mrn_no_sub_seq      	;	}
	public String                  getOrg_bl_rcv_cd          (){	return org_bl_rcv_cd          	;	}
	public String                  getOrg_bl_rcv_usr_id      (){	return org_bl_rcv_usr_id      	;	}
	public String                  getCgo_de_cd              (){	return cgo_de_cd              	;	}
	public String                  getXpt_decl_cd            (){	return xpt_decl_cd            	;	}
	public String                  getBl_cpy_no              (){	return bl_cpy_no              	;	}
	public String                  getOrg_iss_knt            (){	return org_iss_knt            	;	}
	public String                  getBl_dt                  (){	return bl_dt                  	;	}
	public String                  getBl_iss_ofc_cd          (){	return bl_iss_ofc_cd          	;	}
	public String                  getBl_iss_nm              (){	return bl_iss_nm              	;	}
	public String                  getBl_doc_usr_id          (){	return bl_doc_usr_id          	;	}
	public String                  getBl_iss_flg             (){	return bl_iss_flg             	;	}
	public String                  getBl_org_cnt_nm          (){	return bl_org_cnt_nm          	;	}
	public String                  getBl_mv_tp_nm            (){	return bl_mv_tp_nm            	;	}
	public String                  getBl_fnl_dest_nm         (){	return bl_fnl_dest_nm         	;	}
	public String                  getBl_ttl_pck_desc        (){	return bl_ttl_pck_desc        	;	}
	public String                  getBl_xpt_lic_no          (){	return bl_xpt_lic_no          	;	}
	public String                  getBl_tp_cd               (){	return bl_tp_cd               	;	}
	public String                  getBl_obrd_tp_cd          (){	return bl_obrd_tp_cd          	;	}
	public String                  getBl_obrd_dt             (){	return bl_obrd_dt             	;	}
	public String                  getBl_vsl_nm              (){	return bl_vsl_nm              	;	}
	public String                  getBl_pre_vsl_nm          (){	return bl_pre_vsl_nm          	;	}
	public String                  getBl_por_nm              (){	return bl_por_nm              	;	}
	public String                  getBl_pol_nm              (){	return bl_pol_nm              	;	}
	public String                  getBl_pod_nm              (){	return bl_pod_nm              	;	}
	public String                  getBl_del_nm              (){	return bl_del_nm              	;	}
	public String                  getCstms_clr_cd           (){	return cstms_clr_cd           	;	}
	public String                  getCstms_clr_loc_cd       (){	return cstms_clr_loc_cd       	;	}
	public String                  getCstms_clr_wr_hus_nm    (){	return cstms_clr_wr_hus_nm    	;	}
	public String                  getCstms_clr_flg          (){	return cstms_clr_flg          	;	}
	public String                  getImdt_trsp_ref_no       (){	return imdt_trsp_ref_no       	;	}
	public String                  getCgo_inv_val_no         (){	return cgo_inv_val_no         	;	}
	public String                  getBd_doc_rcv_ofc_cd      (){	return bd_doc_rcv_ofc_cd      	;	}
	public String                  getBd_doc_rcv_dt          (){	return bd_doc_rcv_dt          	;	}
	public String                  getOtr_doc_tp_cd          (){	return otr_doc_tp_cd          	;	}
	public String                  getOtr_doc_rcv_ofc_cd     (){	return otr_doc_rcv_ofc_cd     	;	}
	public String                  getOtr_doc_rcv_dt         (){	return otr_doc_rcv_dt         	;	}
	public String                  getOrg_bl_rcv_ofc_cd      (){	return org_bl_rcv_ofc_cd      	;	}
	public String                  getOrg_bl_rcv_dt          (){	return org_bl_rcv_dt          	;	}
	public String                  getOrg_bl_rcv_no          (){	return org_bl_rcv_no          	;	}
	public String                  getMf_cfm_flg             (){	return mf_cfm_flg             	;	}
	public String                  getLocl_clr_flg           (){	return locl_clr_flg           	;	}
	public String                  getBl_iss_rmk             (){	return bl_iss_rmk             	;	}
	public String                  getBkg_svc_scp_cd         (){	return bkg_svc_scp_cd         	;	}
	public String                  getBl_por_cd              (){	return bl_por_cd              	;	}
	public String                  getBl_pol_cd              (){	return bl_pol_cd              	;	}
	public String                  getBl_pod_cd              (){	return bl_pod_cd              	;	}
	public String                  getBl_del_cd              (){	return bl_del_cd              	;	}
	public String                  getOrg_bl_rdem_ofc_cd     (){	return org_bl_rdem_ofc_cd     	;	}
	public String                  getOrg_bl_rdem_dt         (){	return org_bl_rdem_dt         	;	}
	public String                  getOrg_bl_rdem_no         (){	return org_bl_rdem_no         	;	}
	public String                  getBl_ppd_ofc_n3rd_pay_flg(){	return bl_ppd_ofc_n3rd_pay_flg	;	}
	public String                  getBl_cct_ofc_n3rd_pay_flg(){	return bl_cct_ofc_n3rd_pay_flg	;	}
	public String                  getAn_cust_fax_no         (){	return an_cust_fax_no         	;	}
	public String                  getAn_cust_fax_no2        (){	return an_cust_fax_no2        	;	}
	public String                  getAn_cust_fax_no3        (){	return an_cust_fax_no3        	;	}
	public String                  getBl_mst_no              (){	return bl_mst_no              	;	}
	public String                  getBl_mst_div_cd          (){	return bl_mst_div_cd          	;	}
	public String                  getBl_cust_tp_cd          (){	return bl_cust_tp_cd          	;	}
	public String                  getFinc_if_dt             (){	return finc_if_dt             	;	}
	public String                  getFrt_fwrd_fmc_no        (){	return frt_fwrd_fmc_no        	;	}
	public String                  getRepl_flg               (){	return repl_flg               	;	}
	public String                  getBl_mst_bkg_no          (){	return bl_mst_bkg_no          	;	}
	public String                  getBl_mst_bkg_no_split    (){	return bl_mst_bkg_no_split    	;	}
	public String                  getBl_split_cd            (){	return bl_split_cd            	;	}
	public String                  getCgo_arr_dt             (){	return cgo_arr_dt             	;	}
	public String                  getCgo_pkup_aval_dt       (){	return cgo_pkup_aval_dt       	;	}
	public String                  getFree_dt_to_pkup_dt     (){	return free_dt_to_pkup_dt     	;	}
	public String                  getCgo_pkup_cy_cd         (){	return cgo_pkup_cy_cd         	;	}
	public String                  getCgo_pkup_cfs_cd        (){	return cgo_pkup_cfs_cd        	;	}
	public String                  getHcos_if_flg            (){	return hcos_if_flg            	;	}
	public String                  getMty_rlse_cfm_flg       (){	return mty_rlse_cfm_flg       	;	}
	public String                  getFinc_seq               (){	return finc_seq               	;	}
	public String                  getWt_flg                 (){	return wt_flg                 	;	}
	public String                  getCpls_frm_flg           (){	return cpls_frm_flg           	;	}
	public String                  getRfa_no                 (){	return rfa_no                 	;	}
	public String                  getNis_evnt_dt            (){	return nis_evnt_dt            	;	}
	public String                  getBank_cd                (){	return bank_cd                	;	}
	public String                  getBank_flg               (){	return bank_flg               	;	}
	public String                  getPrnt_cnt_cd            (){	return prnt_cnt_cd            	;	}
	public String                  getPrnt_cust_seq          (){	return prnt_cust_seq          	;	}
	public String                  getPo_no                  (){	return po_no                  	;	}
	public String                  getBl_pod_dt              (){	return bl_pod_dt              	;	}
	public String                  getSony_inv_desc          (){	return sony_inv_desc          	;	}
	public String                  getFinc_inv_no            (){	return finc_inv_no            	;	}
	public String                  getRdem_upd_usr_id        (){	return rdem_upd_usr_id        	;	}
	public String                  getOtr_doc_upd_usr_id     (){	return otr_doc_upd_usr_id     	;	}
	public String                  getIb_doc_upd_usr_id      (){	return ib_doc_upd_usr_id      	;	}
	public String                  getFrt_sts_upd_usr_id     (){	return frt_sts_upd_usr_id     	;	}
	public String                  getNvocc_file_no          (){	return nvocc_file_no          	;	}
	public String                  getHus_bl_ttl_knt         (){	return hus_bl_ttl_knt         	;	}
	public String                  getBlck_bl_flg            (){	return blck_bl_flg            	;	}
	public String                  getUblck_usr_id           (){	return ublck_usr_id           	;	}
	public String                  getUblck_dt               (){	return ublck_dt               	;	}
	public String                  getBl_ublck_dt            (){	return bl_ublck_dt            	;	}
	public String                  getCnd_nvocc_no           (){	return cnd_nvocc_no           	;	}
	public String                  getDept_no                (){	return dept_no                	;	}
	public String                  getEdo_trk_cd             (){	return edo_trk_cd             	;	}
	public String                  getEdo_trk_nm             (){	return edo_trk_nm             	;	}
	public String                  getPkl_shpr_call_no       (){	return pkl_shpr_call_no       	;	}
	public String                  getVsl_ref_no             (){	return vsl_ref_no             	;	}
	public String                  getBl_cfm_usr_id          (){	return bl_cfm_usr_id          	;	}
	public String                  getBl_cfm_dt              (){	return bl_cfm_dt              	;	}
	public String                  getBl_cfm_flg             (){	return bl_cfm_flg             	;	}
	public String                  getDo_asgn_pre_rmk        (){	return do_asgn_pre_rmk        	;	}
	public String                  getBkg_alt_cust_cfm_flg   (){	return bkg_alt_cust_cfm_flg   	;	}
	public String                  getSc_act_cust_cnt_cd     (){	return sc_act_cust_cnt_cd     	;	}
	public String                  getSc_act_cust_seq        (){	return sc_act_cust_seq        	;	}
	public String                  getAll_mtr_flg            (){	return all_mtr_flg            	;	}
	public String                  getAll_mtr_chg_flg        (){	return all_mtr_chg_flg        	;	}
	public String                  getBkg_split_rto        	 (){	return bkg_split_rto        	;	} // 2007 12 06 hyunsu  added 
	public String                  getEai_evnt_dt            (){	return eai_evnt_dt            	;	}

	// setter method is proceeding ..
	public void setIbflag                 ( String                  ibflag                  ){	this.ibflag                  = ibflag                 	;	}
	public void setPage_rows              ( String                  page_rows               ){	this.page_rows               = page_rows              	;	}
	public void setBkg_no                 ( String                  bkg_no                  ){	this.bkg_no                  = bkg_no                 	;	}
	public void setBkg_no_split           ( String                  bkg_no_split            ){	this.bkg_no_split            = bkg_no_split           	;	}
	public void setBl_no                  ( String                  bl_no                   ){	this.bl_no                   = bl_no                  	;	}
	public void setBl_no_tp               ( String                  bl_no_tp                ){	this.bl_no_tp                = bl_no_tp               	;	}
	public void setBl_no_chk              ( String                  bl_no_chk               ){	this.bl_no_chk               = bl_no_chk              	;	}
	public void setGen_rfa_no             ( String                  gen_rfa_no              ){	this.gen_rfa_no              = gen_rfa_no             	;	}
	public void setGen_rfa_ofc_cty_cd     ( String                  gen_rfa_ofc_cty_cd      ){	this.gen_rfa_ofc_cty_cd      = gen_rfa_ofc_cty_cd     	;	}
	public void setSc_prop_no             ( String                  sc_prop_no              ){	this.sc_prop_no              = sc_prop_no             	;	}
	public void setBl_trf_no              ( String                  bl_trf_no               ){	this.bl_trf_no               = bl_trf_no              	;	}
	public void setTeu_grs_rev_amt        ( String                  teu_grs_rev_amt         ){	this.teu_grs_rev_amt         = teu_grs_rev_amt        	;	}
	public void setFeu_grs_rev_amt        ( String                  feu_grs_rev_amt         ){	this.feu_grs_rev_amt         = feu_grs_rev_amt        	;	}
	public void setTeu_net_rev_amt        ( String                  teu_net_rev_amt         ){	this.teu_net_rev_amt         = teu_net_rev_amt        	;	}
	public void setFeu_net_rev_amt        ( String                  feu_net_rev_amt         ){	this.feu_net_rev_amt         = feu_net_rev_amt        	;	}
	public void setTeu_cost_amt           ( String                  teu_cost_amt            ){	this.teu_cost_amt            = teu_cost_amt           	;	}
	public void setFeu_cost_amt           ( String                  feu_cost_amt            ){	this.feu_cost_amt            = feu_cost_amt           	;	}
	public void setTeu_mgn_rev_amt        ( String                  teu_mgn_rev_amt         ){	this.teu_mgn_rev_amt         = teu_mgn_rev_amt        	;	}
	public void setFeu_mgn_rev_amt        ( String                  feu_mgn_rev_amt         ){	this.feu_mgn_rev_amt         = feu_mgn_rev_amt        	;	}
	public void setBkg_cfm_flg            ( String                  bkg_cfm_flg             ){	this.bkg_cfm_flg             = bkg_cfm_flg            	;	}
	public void setBkg_cfm_dt             ( String                  bkg_cfm_dt              ){	this.bkg_cfm_dt              = bkg_cfm_dt             	;	}
	public void setBkg_cfm_usr_id         ( String                  bkg_cfm_usr_id          ){	this.bkg_cfm_usr_id          = bkg_cfm_usr_id         	;	}
	public void setBl_frt_cd              ( String                  bl_frt_cd               ){	this.bl_frt_cd               = bl_frt_cd              	;	}
	public void setBl_do_no               ( String                  bl_do_no                ){	this.bl_do_no                = bl_do_no               	;	}
	public void setDo_ofc_cd              ( String                  do_ofc_cd               ){	this.do_ofc_cd               = do_ofc_cd              	;	}
	public void setDo_dt                  ( String                  do_dt                   ){	this.do_dt                   = do_dt                  	;	}
	public void setBl_ppd_cd              ( String                  bl_ppd_cd               ){	this.bl_ppd_cd               = bl_ppd_cd              	;	}
	public void setBl_ppd_ofc_cd          ( String                  bl_ppd_ofc_cd           ){	this.bl_ppd_ofc_cd           = bl_ppd_ofc_cd          	;	}
	public void setBl_ppd_dt              ( String                  bl_ppd_dt               ){	this.bl_ppd_dt               = bl_ppd_dt              	;	}
	public void setBl_clt_cd              ( String                  bl_clt_cd               ){	this.bl_clt_cd               = bl_clt_cd              	;	}
	public void setBl_clt_ofc_cd          ( String                  bl_clt_ofc_cd           ){	this.bl_clt_ofc_cd           = bl_clt_ofc_cd          	;	}
	public void setBl_clt_dt              ( String                  bl_clt_dt               ){	this.bl_clt_dt               = bl_clt_dt              	;	}
	public void setBl_rat_cd              ( String                  bl_rat_cd               ){	this.bl_rat_cd               = bl_rat_cd              	;	}
	public void setBl_rat_cng_cd          ( String                  bl_rat_cng_cd           ){	this.bl_rat_cng_cd           = bl_rat_cng_cd          	;	}
	public void setBl_inv_ppd_cd          ( String                  bl_inv_ppd_cd           ){	this.bl_inv_ppd_cd           = bl_inv_ppd_cd          	;	}
	public void setBl_inv_clt_cd          ( String                  bl_inv_clt_cd           ){	this.bl_inv_clt_cd           = bl_inv_clt_cd          	;	}
	public void setBl_inv_com_cd          ( String                  bl_inv_com_cd           ){	this.bl_inv_com_cd           = bl_inv_com_cd          	;	}
	public void setBl_mrn_no              ( String                  bl_mrn_no               ){	this.bl_mrn_no               = bl_mrn_no              	;	}
	public void setBl_mrn_no_sub_seq      ( String                  bl_mrn_no_sub_seq       ){	this.bl_mrn_no_sub_seq       = bl_mrn_no_sub_seq      	;	}
	public void setOrg_bl_rcv_cd          ( String                  org_bl_rcv_cd           ){	this.org_bl_rcv_cd           = org_bl_rcv_cd          	;	}
	public void setOrg_bl_rcv_usr_id      ( String                  org_bl_rcv_usr_id       ){	this.org_bl_rcv_usr_id       = org_bl_rcv_usr_id      	;	}
	public void setCgo_de_cd              ( String                  cgo_de_cd               ){	this.cgo_de_cd               = cgo_de_cd              	;	}
	public void setXpt_decl_cd            ( String                  xpt_decl_cd             ){	this.xpt_decl_cd             = xpt_decl_cd            	;	}
	public void setBl_cpy_no              ( String                  bl_cpy_no               ){	this.bl_cpy_no               = bl_cpy_no              	;	}
	public void setOrg_iss_knt            ( String                  org_iss_knt             ){	this.org_iss_knt             = org_iss_knt            	;	}
	public void setBl_dt                  ( String                  bl_dt                   ){	this.bl_dt                   = bl_dt                  	;	}
	public void setBl_iss_ofc_cd          ( String                  bl_iss_ofc_cd           ){	this.bl_iss_ofc_cd           = bl_iss_ofc_cd          	;	}
	public void setBl_iss_nm              ( String                  bl_iss_nm               ){	this.bl_iss_nm               = bl_iss_nm              	;	}
	public void setBl_doc_usr_id          ( String                  bl_doc_usr_id           ){	this.bl_doc_usr_id           = bl_doc_usr_id          	;	}
	public void setBl_iss_flg             ( String                  bl_iss_flg              ){	this.bl_iss_flg              = bl_iss_flg             	;	}
	public void setBl_org_cnt_nm          ( String                  bl_org_cnt_nm           ){	this.bl_org_cnt_nm           = bl_org_cnt_nm          	;	}
	public void setBl_mv_tp_nm            ( String                  bl_mv_tp_nm             ){	this.bl_mv_tp_nm             = bl_mv_tp_nm            	;	}
	public void setBl_fnl_dest_nm         ( String                  bl_fnl_dest_nm          ){	this.bl_fnl_dest_nm          = bl_fnl_dest_nm         	;	}
	public void setBl_ttl_pck_desc        ( String                  bl_ttl_pck_desc         ){	this.bl_ttl_pck_desc         = bl_ttl_pck_desc        	;	}
	public void setBl_xpt_lic_no          ( String                  bl_xpt_lic_no           ){	this.bl_xpt_lic_no           = bl_xpt_lic_no          	;	}
	public void setBl_tp_cd               ( String                  bl_tp_cd                ){	this.bl_tp_cd                = bl_tp_cd               	;	}
	public void setBl_obrd_tp_cd          ( String                  bl_obrd_tp_cd           ){	this.bl_obrd_tp_cd           = bl_obrd_tp_cd          	;	}
	public void setBl_obrd_dt             ( String                  bl_obrd_dt              ){	this.bl_obrd_dt              = bl_obrd_dt             	;	}
	public void setBl_vsl_nm              ( String                  bl_vsl_nm               ){	this.bl_vsl_nm               = bl_vsl_nm              	;	}
	public void setBl_pre_vsl_nm          ( String                  bl_pre_vsl_nm           ){	this.bl_pre_vsl_nm           = bl_pre_vsl_nm          	;	}
	public void setBl_por_nm              ( String                  bl_por_nm               ){	this.bl_por_nm               = bl_por_nm              	;	}
	public void setBl_pol_nm              ( String                  bl_pol_nm               ){	this.bl_pol_nm               = bl_pol_nm              	;	}
	public void setBl_pod_nm              ( String                  bl_pod_nm               ){	this.bl_pod_nm               = bl_pod_nm              	;	}
	public void setBl_del_nm              ( String                  bl_del_nm               ){	this.bl_del_nm               = bl_del_nm              	;	}
	public void setCstms_clr_cd           ( String                  cstms_clr_cd            ){	this.cstms_clr_cd            = cstms_clr_cd           	;	}
	public void setCstms_clr_loc_cd       ( String                  cstms_clr_loc_cd        ){	this.cstms_clr_loc_cd        = cstms_clr_loc_cd       	;	}
	public void setCstms_clr_wr_hus_nm    ( String                  cstms_clr_wr_hus_nm     ){	this.cstms_clr_wr_hus_nm     = cstms_clr_wr_hus_nm    	;	}
	public void setCstms_clr_flg          ( String                  cstms_clr_flg           ){	this.cstms_clr_flg           = cstms_clr_flg          	;	}
	public void setImdt_trsp_ref_no       ( String                  imdt_trsp_ref_no        ){	this.imdt_trsp_ref_no        = imdt_trsp_ref_no       	;	}
	public void setCgo_inv_val_no         ( String                  cgo_inv_val_no          ){	this.cgo_inv_val_no          = cgo_inv_val_no         	;	}
	public void setBd_doc_rcv_ofc_cd      ( String                  bd_doc_rcv_ofc_cd       ){	this.bd_doc_rcv_ofc_cd       = bd_doc_rcv_ofc_cd      	;	}
	public void setBd_doc_rcv_dt          ( String                  bd_doc_rcv_dt           ){	this.bd_doc_rcv_dt           = bd_doc_rcv_dt          	;	}
	public void setOtr_doc_tp_cd          ( String                  otr_doc_tp_cd           ){	this.otr_doc_tp_cd           = otr_doc_tp_cd          	;	}
	public void setOtr_doc_rcv_ofc_cd     ( String                  otr_doc_rcv_ofc_cd      ){	this.otr_doc_rcv_ofc_cd      = otr_doc_rcv_ofc_cd     	;	}
	public void setOtr_doc_rcv_dt         ( String                  otr_doc_rcv_dt          ){	this.otr_doc_rcv_dt          = otr_doc_rcv_dt         	;	}
	public void setOrg_bl_rcv_ofc_cd      ( String                  org_bl_rcv_ofc_cd       ){	this.org_bl_rcv_ofc_cd       = org_bl_rcv_ofc_cd      	;	}
	public void setOrg_bl_rcv_dt          ( String                  org_bl_rcv_dt           ){	this.org_bl_rcv_dt           = org_bl_rcv_dt          	;	}
	public void setOrg_bl_rcv_no          ( String                  org_bl_rcv_no           ){	this.org_bl_rcv_no           = org_bl_rcv_no          	;	}
	public void setMf_cfm_flg             ( String                  mf_cfm_flg              ){	this.mf_cfm_flg              = mf_cfm_flg             	;	}
	public void setLocl_clr_flg           ( String                  locl_clr_flg            ){	this.locl_clr_flg            = locl_clr_flg           	;	}
	public void setBl_iss_rmk             ( String                  bl_iss_rmk              ){	this.bl_iss_rmk              = bl_iss_rmk             	;	}
	public void setBkg_svc_scp_cd         ( String                  bkg_svc_scp_cd          ){	this.bkg_svc_scp_cd          = bkg_svc_scp_cd         	;	}
	public void setBl_por_cd              ( String                  bl_por_cd               ){	this.bl_por_cd               = bl_por_cd              	;	}
	public void setBl_pol_cd              ( String                  bl_pol_cd               ){	this.bl_pol_cd               = bl_pol_cd              	;	}
	public void setBl_pod_cd              ( String                  bl_pod_cd               ){	this.bl_pod_cd               = bl_pod_cd              	;	}
	public void setBl_del_cd              ( String                  bl_del_cd               ){	this.bl_del_cd               = bl_del_cd              	;	}
	public void setOrg_bl_rdem_ofc_cd     ( String                  org_bl_rdem_ofc_cd      ){	this.org_bl_rdem_ofc_cd      = org_bl_rdem_ofc_cd     	;	}
	public void setOrg_bl_rdem_dt         ( String                  org_bl_rdem_dt          ){	this.org_bl_rdem_dt          = org_bl_rdem_dt         	;	}
	public void setOrg_bl_rdem_no         ( String                  org_bl_rdem_no          ){	this.org_bl_rdem_no          = org_bl_rdem_no         	;	}
	public void setBl_ppd_ofc_n3rd_pay_flg( String                  bl_ppd_ofc_n3rd_pay_flg ){	this.bl_ppd_ofc_n3rd_pay_flg = bl_ppd_ofc_n3rd_pay_flg	;	}
	public void setBl_cct_ofc_n3rd_pay_flg( String                  bl_cct_ofc_n3rd_pay_flg ){	this.bl_cct_ofc_n3rd_pay_flg = bl_cct_ofc_n3rd_pay_flg	;	}
	public void setAn_cust_fax_no         ( String                  an_cust_fax_no          ){	this.an_cust_fax_no          = an_cust_fax_no         	;	}
	public void setAn_cust_fax_no2        ( String                  an_cust_fax_no2         ){	this.an_cust_fax_no2         = an_cust_fax_no2        	;	}
	public void setAn_cust_fax_no3        ( String                  an_cust_fax_no3         ){	this.an_cust_fax_no3         = an_cust_fax_no3        	;	}
	public void setBl_mst_no              ( String                  bl_mst_no               ){	this.bl_mst_no               = bl_mst_no              	;	}
	public void setBl_mst_div_cd          ( String                  bl_mst_div_cd           ){	this.bl_mst_div_cd           = bl_mst_div_cd          	;	}
	public void setBl_cust_tp_cd          ( String                  bl_cust_tp_cd           ){	this.bl_cust_tp_cd           = bl_cust_tp_cd          	;	}
	public void setFinc_if_dt             ( String                  finc_if_dt              ){	this.finc_if_dt              = finc_if_dt             	;	}
	public void setFrt_fwrd_fmc_no        ( String                  frt_fwrd_fmc_no         ){	this.frt_fwrd_fmc_no         = frt_fwrd_fmc_no        	;	}
	public void setRepl_flg               ( String                  repl_flg                ){	this.repl_flg                = repl_flg               	;	}
	public void setBl_mst_bkg_no          ( String                  bl_mst_bkg_no           ){	this.bl_mst_bkg_no           = bl_mst_bkg_no          	;	}
	public void setBl_mst_bkg_no_split    ( String                  bl_mst_bkg_no_split     ){	this.bl_mst_bkg_no_split     = bl_mst_bkg_no_split    	;	}
	public void setBl_split_cd            ( String                  bl_split_cd             ){	this.bl_split_cd             = bl_split_cd            	;	}
	public void setCgo_arr_dt             ( String                  cgo_arr_dt              ){	this.cgo_arr_dt              = cgo_arr_dt             	;	}
	public void setCgo_pkup_aval_dt       ( String                  cgo_pkup_aval_dt        ){	this.cgo_pkup_aval_dt        = cgo_pkup_aval_dt       	;	}
	public void setFree_dt_to_pkup_dt     ( String                  free_dt_to_pkup_dt      ){	this.free_dt_to_pkup_dt      = free_dt_to_pkup_dt     	;	}
	public void setCgo_pkup_cy_cd         ( String                  cgo_pkup_cy_cd          ){	this.cgo_pkup_cy_cd          = cgo_pkup_cy_cd         	;	}
	public void setCgo_pkup_cfs_cd        ( String                  cgo_pkup_cfs_cd         ){	this.cgo_pkup_cfs_cd         = cgo_pkup_cfs_cd        	;	}
	public void setHcos_if_flg            ( String                  hcos_if_flg             ){	this.hcos_if_flg             = hcos_if_flg            	;	}
	public void setMty_rlse_cfm_flg       ( String                  mty_rlse_cfm_flg        ){	this.mty_rlse_cfm_flg        = mty_rlse_cfm_flg       	;	}
	public void setFinc_seq               ( String                  finc_seq                ){	this.finc_seq                = finc_seq               	;	}
	public void setWt_flg                 ( String                  wt_flg                  ){	this.wt_flg                  = wt_flg                 	;	}
	public void setCpls_frm_flg           ( String                  cpls_frm_flg            ){	this.cpls_frm_flg            = cpls_frm_flg           	;	}
	public void setRfa_no                 ( String                  rfa_no                  ){	this.rfa_no                  = rfa_no                 	;	}
	public void setNis_evnt_dt            ( String                  nis_evnt_dt             ){	this.nis_evnt_dt             = nis_evnt_dt            	;	}
	public void setBank_cd                ( String                  bank_cd                 ){	this.bank_cd                 = bank_cd                	;	}
	public void setBank_flg               ( String                  bank_flg                ){	this.bank_flg                = bank_flg               	;	}
	public void setPrnt_cnt_cd            ( String                  prnt_cnt_cd             ){	this.prnt_cnt_cd             = prnt_cnt_cd            	;	}
	public void setPrnt_cust_seq          ( String                  prnt_cust_seq           ){	this.prnt_cust_seq           = prnt_cust_seq          	;	}
	public void setPo_no                  ( String                  po_no                   ){	this.po_no                   = po_no                  	;	}
	public void setBl_pod_dt              ( String                  bl_pod_dt               ){	this.bl_pod_dt               = bl_pod_dt              	;	}
	public void setSony_inv_desc          ( String                  sony_inv_desc           ){	this.sony_inv_desc           = sony_inv_desc          	;	}
	public void setFinc_inv_no            ( String                  finc_inv_no             ){	this.finc_inv_no             = finc_inv_no            	;	}
	public void setRdem_upd_usr_id        ( String                  rdem_upd_usr_id         ){	this.rdem_upd_usr_id         = rdem_upd_usr_id        	;	}
	public void setOtr_doc_upd_usr_id     ( String                  otr_doc_upd_usr_id      ){	this.otr_doc_upd_usr_id      = otr_doc_upd_usr_id     	;	}
	public void setIb_doc_upd_usr_id      ( String                  ib_doc_upd_usr_id       ){	this.ib_doc_upd_usr_id       = ib_doc_upd_usr_id      	;	}
	public void setFrt_sts_upd_usr_id     ( String                  frt_sts_upd_usr_id      ){	this.frt_sts_upd_usr_id      = frt_sts_upd_usr_id     	;	}
	public void setNvocc_file_no          ( String                  nvocc_file_no           ){	this.nvocc_file_no           = nvocc_file_no          	;	}
	public void setHus_bl_ttl_knt         ( String                  hus_bl_ttl_knt          ){	this.hus_bl_ttl_knt          = hus_bl_ttl_knt         	;	}
	public void setBlck_bl_flg            ( String                  blck_bl_flg             ){	this.blck_bl_flg             = blck_bl_flg            	;	}
	public void setUblck_usr_id           ( String                  ublck_usr_id            ){	this.ublck_usr_id            = ublck_usr_id           	;	}
	public void setUblck_dt               ( String                  ublck_dt                ){	this.ublck_dt                = ublck_dt               	;	}
	public void setBl_ublck_dt            ( String                  bl_ublck_dt             ){	this.bl_ublck_dt             = bl_ublck_dt            	;	}
	public void setCnd_nvocc_no           ( String                  cnd_nvocc_no            ){	this.cnd_nvocc_no            = cnd_nvocc_no           	;	}
	public void setDept_no                ( String                  dept_no                 ){	this.dept_no                 = dept_no                	;	}
	public void setEdo_trk_cd             ( String                  edo_trk_cd              ){	this.edo_trk_cd              = edo_trk_cd             	;	}
	public void setEdo_trk_nm             ( String                  edo_trk_nm              ){	this.edo_trk_nm              = edo_trk_nm             	;	}
	public void setPkl_shpr_call_no       ( String                  pkl_shpr_call_no        ){	this.pkl_shpr_call_no        = pkl_shpr_call_no       	;	}
	public void setVsl_ref_no             ( String                  vsl_ref_no              ){	this.vsl_ref_no              = vsl_ref_no             	;	}
	public void setBl_cfm_usr_id          ( String                  bl_cfm_usr_id           ){	this.bl_cfm_usr_id           = bl_cfm_usr_id          	;	}
	public void setBl_cfm_dt              ( String                  bl_cfm_dt               ){	this.bl_cfm_dt               = bl_cfm_dt              	;	}
	public void setBl_cfm_flg             ( String                  bl_cfm_flg              ){	this.bl_cfm_flg              = bl_cfm_flg             	;	}
	public void setDo_asgn_pre_rmk        ( String                  do_asgn_pre_rmk         ){	this.do_asgn_pre_rmk         = do_asgn_pre_rmk        	;	}
	public void setBkg_alt_cust_cfm_flg   ( String                  bkg_alt_cust_cfm_flg    ){	this.bkg_alt_cust_cfm_flg    = bkg_alt_cust_cfm_flg   	;	}
	public void setSc_act_cust_cnt_cd     ( String                  sc_act_cust_cnt_cd      ){	this.sc_act_cust_cnt_cd      = sc_act_cust_cnt_cd     	;	}
	public void setSc_act_cust_seq        ( String                  sc_act_cust_seq         ){	this.sc_act_cust_seq         = sc_act_cust_seq        	;	}
	public void setAll_mtr_flg            ( String                  all_mtr_flg             ){	this.all_mtr_flg             = all_mtr_flg            	;	}
	public void setAll_mtr_chg_flg        ( String                  all_mtr_chg_flg         ){	this.all_mtr_chg_flg         = all_mtr_chg_flg        	;	}
	public void setBkg_split_rto       	  ( String                  bkg_split_rto         	){	this.bkg_split_rto         	 = bkg_split_rto        	;	}// 2007 12 06 hyunsu added 
	public void setEai_evnt_dt            ( String                  eai_evnt_dt             ){	this.eai_evnt_dt             = eai_evnt_dt            	;	}

	
	
	public static BKG_BKG_MISC fromRequest(HttpServletRequest request) {
		BKG_BKG_MISC model = new BKG_BKG_MISC();
		try {
			model.setIbflag                 	(JSPUtil.getParameter(request, "ibflag                 		".trim(), ""));
			model.setPage_rows              	(JSPUtil.getParameter(request, "page_rows              		".trim(), ""));
			model.setBkg_no                 	(JSPUtil.getParameter(request, "bkg_no                 		".trim(), ""));
			model.setBkg_no_split           	(JSPUtil.getParameter(request, "bkg_no_split           		".trim(), ""));
			model.setBl_no                  	(JSPUtil.getParameter(request, "bl_no                  		".trim(), ""));
			model.setBl_no_tp               	(JSPUtil.getParameter(request, "bl_no_tp               		".trim(), ""));
			model.setBl_no_chk              	(JSPUtil.getParameter(request, "bl_no_chk              		".trim(), ""));
			model.setGen_rfa_no             	(JSPUtil.getParameter(request, "gen_rfa_no             		".trim(), ""));
			model.setGen_rfa_ofc_cty_cd     	(JSPUtil.getParameter(request, "gen_rfa_ofc_cty_cd     		".trim(), ""));
			model.setSc_prop_no             	(JSPUtil.getParameter(request, "sc_prop_no             		".trim(), ""));
			model.setBl_trf_no              	(JSPUtil.getParameter(request, "bl_trf_no              		".trim(), ""));
			model.setTeu_grs_rev_amt        	(JSPUtil.getParameter(request, "teu_grs_rev_amt        		".trim(), ""));
			model.setFeu_grs_rev_amt        	(JSPUtil.getParameter(request, "feu_grs_rev_amt        		".trim(), ""));
			model.setTeu_net_rev_amt        	(JSPUtil.getParameter(request, "teu_net_rev_amt        		".trim(), ""));
			model.setFeu_net_rev_amt        	(JSPUtil.getParameter(request, "feu_net_rev_amt        		".trim(), ""));
			model.setTeu_cost_amt           	(JSPUtil.getParameter(request, "teu_cost_amt           		".trim(), ""));
			model.setFeu_cost_amt           	(JSPUtil.getParameter(request, "feu_cost_amt           		".trim(), ""));
			model.setTeu_mgn_rev_amt        	(JSPUtil.getParameter(request, "teu_mgn_rev_amt        		".trim(), ""));
			model.setFeu_mgn_rev_amt        	(JSPUtil.getParameter(request, "feu_mgn_rev_amt        		".trim(), ""));
			model.setBkg_cfm_flg            	(JSPUtil.getParameter(request, "bkg_cfm_flg            		".trim(), ""));
			model.setBkg_cfm_dt             	(JSPUtil.getParameter(request, "bkg_cfm_dt             		".trim(), ""));
			model.setBkg_cfm_usr_id         	(JSPUtil.getParameter(request, "bkg_cfm_usr_id         		".trim(), ""));
			model.setBl_frt_cd              	(JSPUtil.getParameter(request, "bl_frt_cd              		".trim(), ""));
			model.setBl_do_no               	(JSPUtil.getParameter(request, "bl_do_no               		".trim(), ""));
			model.setDo_ofc_cd              	(JSPUtil.getParameter(request, "do_ofc_cd              		".trim(), ""));
			model.setDo_dt                  	(JSPUtil.getParameter(request, "do_dt                  		".trim(), ""));
			model.setBl_ppd_cd              	(JSPUtil.getParameter(request, "bl_ppd_cd              		".trim(), ""));
			model.setBl_ppd_ofc_cd          	(JSPUtil.getParameter(request, "bl_ppd_ofc_cd          		".trim(), ""));
			model.setBl_ppd_dt              	(JSPUtil.getParameter(request, "bl_ppd_dt              		".trim(), ""));
			model.setBl_clt_cd              	(JSPUtil.getParameter(request, "bl_clt_cd              		".trim(), ""));
			model.setBl_clt_ofc_cd          	(JSPUtil.getParameter(request, "bl_clt_ofc_cd          		".trim(), ""));
			model.setBl_clt_dt              	(JSPUtil.getParameter(request, "bl_clt_dt              		".trim(), ""));
			model.setBl_rat_cd              	(JSPUtil.getParameter(request, "bl_rat_cd              		".trim(), ""));
			model.setBl_rat_cng_cd          	(JSPUtil.getParameter(request, "bl_rat_cng_cd          		".trim(), ""));
			model.setBl_inv_ppd_cd          	(JSPUtil.getParameter(request, "bl_inv_ppd_cd          		".trim(), ""));
			model.setBl_inv_clt_cd          	(JSPUtil.getParameter(request, "bl_inv_clt_cd          		".trim(), ""));
			model.setBl_inv_com_cd          	(JSPUtil.getParameter(request, "bl_inv_com_cd          		".trim(), ""));
			model.setBl_mrn_no              	(JSPUtil.getParameter(request, "bl_mrn_no              		".trim(), ""));
			model.setBl_mrn_no_sub_seq      	(JSPUtil.getParameter(request, "bl_mrn_no_sub_seq      		".trim(), ""));
			model.setOrg_bl_rcv_cd          	(JSPUtil.getParameter(request, "org_bl_rcv_cd          		".trim(), ""));
			model.setOrg_bl_rcv_usr_id      	(JSPUtil.getParameter(request, "org_bl_rcv_usr_id      		".trim(), ""));
			model.setCgo_de_cd              	(JSPUtil.getParameter(request, "cgo_de_cd              		".trim(), ""));
			model.setXpt_decl_cd            	(JSPUtil.getParameter(request, "xpt_decl_cd            		".trim(), ""));
			model.setBl_cpy_no              	(JSPUtil.getParameter(request, "bl_cpy_no              		".trim(), ""));
			model.setOrg_iss_knt            	(JSPUtil.getParameter(request, "org_iss_knt            		".trim(), ""));
			model.setBl_dt                  	(JSPUtil.getParameter(request, "bl_dt                  		".trim(), ""));
			model.setBl_iss_ofc_cd          	(JSPUtil.getParameter(request, "bl_iss_ofc_cd          		".trim(), ""));
			model.setBl_iss_nm              	(JSPUtil.getParameter(request, "bl_iss_nm              		".trim(), ""));
			model.setBl_doc_usr_id          	(JSPUtil.getParameter(request, "bl_doc_usr_id          		".trim(), ""));
			model.setBl_iss_flg             	(JSPUtil.getParameter(request, "bl_iss_flg             		".trim(), ""));
			model.setBl_org_cnt_nm          	(JSPUtil.getParameter(request, "bl_org_cnt_nm          		".trim(), ""));
			model.setBl_mv_tp_nm            	(JSPUtil.getParameter(request, "bl_mv_tp_nm            		".trim(), ""));
			model.setBl_fnl_dest_nm         	(JSPUtil.getParameter(request, "bl_fnl_dest_nm         		".trim(), ""));
			model.setBl_ttl_pck_desc        	(JSPUtil.getParameter(request, "bl_ttl_pck_desc        		".trim(), ""));
			model.setBl_xpt_lic_no          	(JSPUtil.getParameter(request, "bl_xpt_lic_no          		".trim(), ""));
			model.setBl_tp_cd               	(JSPUtil.getParameter(request, "bl_tp_cd               		".trim(), ""));
			model.setBl_obrd_tp_cd          	(JSPUtil.getParameter(request, "bl_obrd_tp_cd          		".trim(), ""));
			model.setBl_obrd_dt             	(JSPUtil.getParameter(request, "bl_obrd_dt             		".trim(), ""));
			model.setBl_vsl_nm              	(JSPUtil.getParameter(request, "bl_vsl_nm              		".trim(), ""));
			model.setBl_pre_vsl_nm          	(JSPUtil.getParameter(request, "bl_pre_vsl_nm          		".trim(), ""));
			model.setBl_por_nm              	(JSPUtil.getParameter(request, "bl_por_nm              		".trim(), ""));
			model.setBl_pol_nm              	(JSPUtil.getParameter(request, "bl_pol_nm              		".trim(), ""));
			model.setBl_pod_nm              	(JSPUtil.getParameter(request, "bl_pod_nm              		".trim(), ""));
			model.setBl_del_nm              	(JSPUtil.getParameter(request, "bl_del_nm              		".trim(), ""));
			model.setCstms_clr_cd           	(JSPUtil.getParameter(request, "cstms_clr_cd           		".trim(), ""));
			model.setCstms_clr_loc_cd       	(JSPUtil.getParameter(request, "cstms_clr_loc_cd       		".trim(), ""));
			model.setCstms_clr_wr_hus_nm    	(JSPUtil.getParameter(request, "cstms_clr_wr_hus_nm    		".trim(), ""));
			model.setCstms_clr_flg          	(JSPUtil.getParameter(request, "cstms_clr_flg          		".trim(), ""));
			model.setImdt_trsp_ref_no       	(JSPUtil.getParameter(request, "imdt_trsp_ref_no       		".trim(), ""));
			model.setCgo_inv_val_no         	(JSPUtil.getParameter(request, "cgo_inv_val_no         		".trim(), ""));
			model.setBd_doc_rcv_ofc_cd      	(JSPUtil.getParameter(request, "bd_doc_rcv_ofc_cd      		".trim(), ""));
			model.setBd_doc_rcv_dt          	(JSPUtil.getParameter(request, "bd_doc_rcv_dt          		".trim(), ""));
			model.setOtr_doc_tp_cd          	(JSPUtil.getParameter(request, "otr_doc_tp_cd          		".trim(), ""));
			model.setOtr_doc_rcv_ofc_cd     	(JSPUtil.getParameter(request, "otr_doc_rcv_ofc_cd     		".trim(), ""));
			model.setOtr_doc_rcv_dt         	(JSPUtil.getParameter(request, "otr_doc_rcv_dt         		".trim(), ""));
			model.setOrg_bl_rcv_ofc_cd      	(JSPUtil.getParameter(request, "org_bl_rcv_ofc_cd      		".trim(), ""));
			model.setOrg_bl_rcv_dt          	(JSPUtil.getParameter(request, "org_bl_rcv_dt          		".trim(), ""));
			model.setOrg_bl_rcv_no          	(JSPUtil.getParameter(request, "org_bl_rcv_no          		".trim(), ""));
			model.setMf_cfm_flg             	(JSPUtil.getParameter(request, "mf_cfm_flg             		".trim(), ""));
			model.setLocl_clr_flg           	(JSPUtil.getParameter(request, "locl_clr_flg           		".trim(), ""));
			model.setBl_iss_rmk             	(JSPUtil.getParameter(request, "bl_iss_rmk             		".trim(), ""));
			model.setBkg_svc_scp_cd         	(JSPUtil.getParameter(request, "bkg_svc_scp_cd         		".trim(), ""));
			model.setBl_por_cd              	(JSPUtil.getParameter(request, "bl_por_cd              		".trim(), ""));
			model.setBl_pol_cd              	(JSPUtil.getParameter(request, "bl_pol_cd              		".trim(), ""));
			model.setBl_pod_cd              	(JSPUtil.getParameter(request, "bl_pod_cd              		".trim(), ""));
			model.setBl_del_cd              	(JSPUtil.getParameter(request, "bl_del_cd              		".trim(), ""));
			model.setOrg_bl_rdem_ofc_cd     	(JSPUtil.getParameter(request, "org_bl_rdem_ofc_cd     		".trim(), ""));
			model.setOrg_bl_rdem_dt         	(JSPUtil.getParameter(request, "org_bl_rdem_dt         		".trim(), ""));
			model.setOrg_bl_rdem_no         	(JSPUtil.getParameter(request, "org_bl_rdem_no         		".trim(), ""));
			model.setBl_ppd_ofc_n3rd_pay_flg	(JSPUtil.getParameter(request, "bl_ppd_ofc_n3rd_pay_flg		".trim(), ""));
			model.setBl_cct_ofc_n3rd_pay_flg	(JSPUtil.getParameter(request, "bl_cct_ofc_n3rd_pay_flg		".trim(), ""));
			model.setAn_cust_fax_no         	(JSPUtil.getParameter(request, "an_cust_fax_no         		".trim(), ""));
			model.setAn_cust_fax_no2        	(JSPUtil.getParameter(request, "an_cust_fax_no2        		".trim(), ""));
			model.setAn_cust_fax_no3        	(JSPUtil.getParameter(request, "an_cust_fax_no3        		".trim(), ""));
			model.setBl_mst_no              	(JSPUtil.getParameter(request, "bl_mst_no              		".trim(), ""));
			model.setBl_mst_div_cd          	(JSPUtil.getParameter(request, "bl_mst_div_cd          		".trim(), ""));
			model.setBl_cust_tp_cd          	(JSPUtil.getParameter(request, "bl_cust_tp_cd          		".trim(), ""));
			model.setFinc_if_dt             	(JSPUtil.getParameter(request, "finc_if_dt             		".trim(), ""));
			model.setFrt_fwrd_fmc_no        	(JSPUtil.getParameter(request, "frt_fwrd_fmc_no        		".trim(), ""));
			model.setRepl_flg               	(JSPUtil.getParameter(request, "repl_flg               		".trim(), ""));
			model.setBl_mst_bkg_no          	(JSPUtil.getParameter(request, "bl_mst_bkg_no          		".trim(), ""));
			model.setBl_mst_bkg_no_split    	(JSPUtil.getParameter(request, "bl_mst_bkg_no_split    		".trim(), ""));
			model.setBl_split_cd            	(JSPUtil.getParameter(request, "bl_split_cd            		".trim(), ""));
			model.setCgo_arr_dt             	(JSPUtil.getParameter(request, "cgo_arr_dt             		".trim(), ""));
			model.setCgo_pkup_aval_dt       	(JSPUtil.getParameter(request, "cgo_pkup_aval_dt       		".trim(), ""));
			model.setFree_dt_to_pkup_dt     	(JSPUtil.getParameter(request, "free_dt_to_pkup_dt     		".trim(), ""));
			model.setCgo_pkup_cy_cd         	(JSPUtil.getParameter(request, "cgo_pkup_cy_cd         		".trim(), ""));
			model.setCgo_pkup_cfs_cd        	(JSPUtil.getParameter(request, "cgo_pkup_cfs_cd        		".trim(), ""));
			model.setHcos_if_flg            	(JSPUtil.getParameter(request, "hcos_if_flg            		".trim(), ""));
			model.setMty_rlse_cfm_flg       	(JSPUtil.getParameter(request, "mty_rlse_cfm_flg       		".trim(), ""));
			model.setFinc_seq               	(JSPUtil.getParameter(request, "finc_seq               		".trim(), ""));
			model.setWt_flg                 	(JSPUtil.getParameter(request, "wt_flg                 		".trim(), ""));
			model.setCpls_frm_flg           	(JSPUtil.getParameter(request, "cpls_frm_flg           		".trim(), ""));
			model.setRfa_no                 	(JSPUtil.getParameter(request, "rfa_no                 		".trim(), ""));
			model.setNis_evnt_dt            	(JSPUtil.getParameter(request, "nis_evnt_dt            		".trim(), ""));
			model.setBank_cd                	(JSPUtil.getParameter(request, "bank_cd                		".trim(), ""));
			model.setBank_flg               	(JSPUtil.getParameter(request, "bank_flg               		".trim(), ""));
			model.setPrnt_cnt_cd            	(JSPUtil.getParameter(request, "prnt_cnt_cd            		".trim(), ""));
			model.setPrnt_cust_seq          	(JSPUtil.getParameter(request, "prnt_cust_seq          		".trim(), ""));
			model.setPo_no                  	(JSPUtil.getParameter(request, "po_no                  		".trim(), ""));
			model.setBl_pod_dt              	(JSPUtil.getParameter(request, "bl_pod_dt              		".trim(), ""));
			model.setSony_inv_desc          	(JSPUtil.getParameter(request, "sony_inv_desc          		".trim(), ""));
			model.setFinc_inv_no            	(JSPUtil.getParameter(request, "finc_inv_no            		".trim(), ""));
			model.setRdem_upd_usr_id        	(JSPUtil.getParameter(request, "rdem_upd_usr_id        		".trim(), ""));
			model.setOtr_doc_upd_usr_id     	(JSPUtil.getParameter(request, "otr_doc_upd_usr_id     		".trim(), ""));
			model.setIb_doc_upd_usr_id      	(JSPUtil.getParameter(request, "ib_doc_upd_usr_id      		".trim(), ""));
			model.setFrt_sts_upd_usr_id     	(JSPUtil.getParameter(request, "frt_sts_upd_usr_id     		".trim(), ""));
			model.setNvocc_file_no          	(JSPUtil.getParameter(request, "nvocc_file_no          		".trim(), ""));
			model.setHus_bl_ttl_knt         	(JSPUtil.getParameter(request, "hus_bl_ttl_knt         		".trim(), ""));
			model.setBlck_bl_flg            	(JSPUtil.getParameter(request, "blck_bl_flg            		".trim(), ""));
			model.setUblck_usr_id           	(JSPUtil.getParameter(request, "ublck_usr_id           		".trim(), ""));
			model.setUblck_dt               	(JSPUtil.getParameter(request, "ublck_dt               		".trim(), ""));
			model.setBl_ublck_dt            	(JSPUtil.getParameter(request, "bl_ublck_dt            		".trim(), ""));
			model.setCnd_nvocc_no           	(JSPUtil.getParameter(request, "cnd_nvocc_no           		".trim(), ""));
			model.setDept_no                	(JSPUtil.getParameter(request, "dept_no                		".trim(), ""));
			model.setEdo_trk_cd             	(JSPUtil.getParameter(request, "edo_trk_cd             		".trim(), ""));
			model.setEdo_trk_nm             	(JSPUtil.getParameter(request, "edo_trk_nm             		".trim(), ""));
			model.setPkl_shpr_call_no       	(JSPUtil.getParameter(request, "pkl_shpr_call_no       		".trim(), ""));
			model.setVsl_ref_no             	(JSPUtil.getParameter(request, "vsl_ref_no             		".trim(), ""));
			model.setBl_cfm_usr_id          	(JSPUtil.getParameter(request, "bl_cfm_usr_id          		".trim(), ""));
			model.setBl_cfm_dt              	(JSPUtil.getParameter(request, "bl_cfm_dt              		".trim(), ""));
			model.setBl_cfm_flg             	(JSPUtil.getParameter(request, "bl_cfm_flg             		".trim(), ""));
			model.setDo_asgn_pre_rmk        	(JSPUtil.getParameter(request, "do_asgn_pre_rmk        		".trim(), ""));
			model.setBkg_alt_cust_cfm_flg   	(JSPUtil.getParameter(request, "bkg_alt_cust_cfm_flg   		".trim(), ""));
			model.setSc_act_cust_cnt_cd     	(JSPUtil.getParameter(request, "sc_act_cust_cnt_cd     		".trim(), ""));
			model.setSc_act_cust_seq        	(JSPUtil.getParameter(request, "sc_act_cust_seq        		".trim(), ""));
			model.setAll_mtr_flg            	(JSPUtil.getParameter(request, "all_mtr_flg            		".trim(), ""));
			model.setAll_mtr_chg_flg        	(JSPUtil.getParameter(request, "all_mtr_chg_flg        		".trim(), ""));
			model.setBkg_split_rto        		(JSPUtil.getParameter(request, "bkg_split_rto        		".trim(), ""));// 2007 12 06 hyunsu added
			model.setEai_evnt_dt            	(JSPUtil.getParameter(request, "eai_evnt_dt            		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		BKG_BKG_MISC model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag                  =  (JSPUtil.getParameter(request, "ibflag                 		".trim(), length));
			String[] page_rows               =  (JSPUtil.getParameter(request, "page_rows              		".trim(), length));
			String[] bkg_no                  =  (JSPUtil.getParameter(request, "bkg_no                 		".trim(), length));
			String[] bkg_no_split            =  (JSPUtil.getParameter(request, "bkg_no_split           		".trim(), length));
			String[] bl_no                   =  (JSPUtil.getParameter(request, "bl_no                  		".trim(), length));
			String[] bl_no_tp                =  (JSPUtil.getParameter(request, "bl_no_tp               		".trim(), length));
			String[] bl_no_chk               =  (JSPUtil.getParameter(request, "bl_no_chk              		".trim(), length));
			String[] gen_rfa_no              =  (JSPUtil.getParameter(request, "gen_rfa_no             		".trim(), length));
			String[] gen_rfa_ofc_cty_cd      =  (JSPUtil.getParameter(request, "gen_rfa_ofc_cty_cd     		".trim(), length));
			String[] sc_prop_no              =  (JSPUtil.getParameter(request, "sc_prop_no             		".trim(), length));
			String[] bl_trf_no               =  (JSPUtil.getParameter(request, "bl_trf_no              		".trim(), length));
			String[] teu_grs_rev_amt         =  (JSPUtil.getParameter(request, "teu_grs_rev_amt        		".trim(), length));
			String[] feu_grs_rev_amt         =  (JSPUtil.getParameter(request, "feu_grs_rev_amt        		".trim(), length));
			String[] teu_net_rev_amt         =  (JSPUtil.getParameter(request, "teu_net_rev_amt        		".trim(), length));
			String[] feu_net_rev_amt         =  (JSPUtil.getParameter(request, "feu_net_rev_amt        		".trim(), length));
			String[] teu_cost_amt            =  (JSPUtil.getParameter(request, "teu_cost_amt           		".trim(), length));
			String[] feu_cost_amt            =  (JSPUtil.getParameter(request, "feu_cost_amt           		".trim(), length));
			String[] teu_mgn_rev_amt         =  (JSPUtil.getParameter(request, "teu_mgn_rev_amt        		".trim(), length));
			String[] feu_mgn_rev_amt         =  (JSPUtil.getParameter(request, "feu_mgn_rev_amt        		".trim(), length));
			String[] bkg_cfm_flg             =  (JSPUtil.getParameter(request, "bkg_cfm_flg            		".trim(), length));
			String[] bkg_cfm_dt              =  (JSPUtil.getParameter(request, "bkg_cfm_dt             		".trim(), length));
			String[] bkg_cfm_usr_id          =  (JSPUtil.getParameter(request, "bkg_cfm_usr_id         		".trim(), length));
			String[] bl_frt_cd               =  (JSPUtil.getParameter(request, "bl_frt_cd              		".trim(), length));
			String[] bl_do_no                =  (JSPUtil.getParameter(request, "bl_do_no               		".trim(), length));
			String[] do_ofc_cd               =  (JSPUtil.getParameter(request, "do_ofc_cd              		".trim(), length));
			String[] do_dt                   =  (JSPUtil.getParameter(request, "do_dt                  		".trim(), length));
			String[] bl_ppd_cd               =  (JSPUtil.getParameter(request, "bl_ppd_cd              		".trim(), length));
			String[] bl_ppd_ofc_cd           =  (JSPUtil.getParameter(request, "bl_ppd_ofc_cd          		".trim(), length));
			String[] bl_ppd_dt               =  (JSPUtil.getParameter(request, "bl_ppd_dt              		".trim(), length));
			String[] bl_clt_cd               =  (JSPUtil.getParameter(request, "bl_clt_cd              		".trim(), length));
			String[] bl_clt_ofc_cd           =  (JSPUtil.getParameter(request, "bl_clt_ofc_cd          		".trim(), length));
			String[] bl_clt_dt               =  (JSPUtil.getParameter(request, "bl_clt_dt              		".trim(), length));
			String[] bl_rat_cd               =  (JSPUtil.getParameter(request, "bl_rat_cd              		".trim(), length));
			String[] bl_rat_cng_cd           =  (JSPUtil.getParameter(request, "bl_rat_cng_cd          		".trim(), length));
			String[] bl_inv_ppd_cd           =  (JSPUtil.getParameter(request, "bl_inv_ppd_cd          		".trim(), length));
			String[] bl_inv_clt_cd           =  (JSPUtil.getParameter(request, "bl_inv_clt_cd          		".trim(), length));
			String[] bl_inv_com_cd           =  (JSPUtil.getParameter(request, "bl_inv_com_cd          		".trim(), length));
			String[] bl_mrn_no               =  (JSPUtil.getParameter(request, "bl_mrn_no              		".trim(), length));
			String[] bl_mrn_no_sub_seq       =  (JSPUtil.getParameter(request, "bl_mrn_no_sub_seq      		".trim(), length));
			String[] org_bl_rcv_cd           =  (JSPUtil.getParameter(request, "org_bl_rcv_cd          		".trim(), length));
			String[] org_bl_rcv_usr_id       =  (JSPUtil.getParameter(request, "org_bl_rcv_usr_id      		".trim(), length));
			String[] cgo_de_cd               =  (JSPUtil.getParameter(request, "cgo_de_cd              		".trim(), length));
			String[] xpt_decl_cd             =  (JSPUtil.getParameter(request, "xpt_decl_cd            		".trim(), length));
			String[] bl_cpy_no               =  (JSPUtil.getParameter(request, "bl_cpy_no              		".trim(), length));
			String[] org_iss_knt             =  (JSPUtil.getParameter(request, "org_iss_knt            		".trim(), length));
			String[] bl_dt                   =  (JSPUtil.getParameter(request, "bl_dt                  		".trim(), length));
			String[] bl_iss_ofc_cd           =  (JSPUtil.getParameter(request, "bl_iss_ofc_cd          		".trim(), length));
			String[] bl_iss_nm               =  (JSPUtil.getParameter(request, "bl_iss_nm              		".trim(), length));
			String[] bl_doc_usr_id           =  (JSPUtil.getParameter(request, "bl_doc_usr_id          		".trim(), length));
			String[] bl_iss_flg              =  (JSPUtil.getParameter(request, "bl_iss_flg             		".trim(), length));
			String[] bl_org_cnt_nm           =  (JSPUtil.getParameter(request, "bl_org_cnt_nm          		".trim(), length));
			String[] bl_mv_tp_nm             =  (JSPUtil.getParameter(request, "bl_mv_tp_nm            		".trim(), length));
			String[] bl_fnl_dest_nm          =  (JSPUtil.getParameter(request, "bl_fnl_dest_nm         		".trim(), length));
			String[] bl_ttl_pck_desc         =  (JSPUtil.getParameter(request, "bl_ttl_pck_desc        		".trim(), length));
			String[] bl_xpt_lic_no           =  (JSPUtil.getParameter(request, "bl_xpt_lic_no          		".trim(), length));
			String[] bl_tp_cd                =  (JSPUtil.getParameter(request, "bl_tp_cd               		".trim(), length));
			String[] bl_obrd_tp_cd           =  (JSPUtil.getParameter(request, "bl_obrd_tp_cd          		".trim(), length));
			String[] bl_obrd_dt              =  (JSPUtil.getParameter(request, "bl_obrd_dt             		".trim(), length));
			String[] bl_vsl_nm               =  (JSPUtil.getParameter(request, "bl_vsl_nm              		".trim(), length));
			String[] bl_pre_vsl_nm           =  (JSPUtil.getParameter(request, "bl_pre_vsl_nm          		".trim(), length));
			String[] bl_por_nm               =  (JSPUtil.getParameter(request, "bl_por_nm              		".trim(), length));
			String[] bl_pol_nm               =  (JSPUtil.getParameter(request, "bl_pol_nm              		".trim(), length));
			String[] bl_pod_nm               =  (JSPUtil.getParameter(request, "bl_pod_nm              		".trim(), length));
			String[] bl_del_nm               =  (JSPUtil.getParameter(request, "bl_del_nm              		".trim(), length));
			String[] cstms_clr_cd            =  (JSPUtil.getParameter(request, "cstms_clr_cd           		".trim(), length));
			String[] cstms_clr_loc_cd        =  (JSPUtil.getParameter(request, "cstms_clr_loc_cd       		".trim(), length));
			String[] cstms_clr_wr_hus_nm     =  (JSPUtil.getParameter(request, "cstms_clr_wr_hus_nm    		".trim(), length));
			String[] cstms_clr_flg           =  (JSPUtil.getParameter(request, "cstms_clr_flg          		".trim(), length));
			String[] imdt_trsp_ref_no        =  (JSPUtil.getParameter(request, "imdt_trsp_ref_no       		".trim(), length));
			String[] cgo_inv_val_no          =  (JSPUtil.getParameter(request, "cgo_inv_val_no         		".trim(), length));
			String[] bd_doc_rcv_ofc_cd       =  (JSPUtil.getParameter(request, "bd_doc_rcv_ofc_cd      		".trim(), length));
			String[] bd_doc_rcv_dt           =  (JSPUtil.getParameter(request, "bd_doc_rcv_dt          		".trim(), length));
			String[] otr_doc_tp_cd           =  (JSPUtil.getParameter(request, "otr_doc_tp_cd          		".trim(), length));
			String[] otr_doc_rcv_ofc_cd      =  (JSPUtil.getParameter(request, "otr_doc_rcv_ofc_cd     		".trim(), length));
			String[] otr_doc_rcv_dt          =  (JSPUtil.getParameter(request, "otr_doc_rcv_dt         		".trim(), length));
			String[] org_bl_rcv_ofc_cd       =  (JSPUtil.getParameter(request, "org_bl_rcv_ofc_cd      		".trim(), length));
			String[] org_bl_rcv_dt           =  (JSPUtil.getParameter(request, "org_bl_rcv_dt          		".trim(), length));
			String[] org_bl_rcv_no           =  (JSPUtil.getParameter(request, "org_bl_rcv_no          		".trim(), length));
			String[] mf_cfm_flg              =  (JSPUtil.getParameter(request, "mf_cfm_flg             		".trim(), length));
			String[] locl_clr_flg            =  (JSPUtil.getParameter(request, "locl_clr_flg           		".trim(), length));
			String[] bl_iss_rmk              =  (JSPUtil.getParameter(request, "bl_iss_rmk             		".trim(), length));
			String[] bkg_svc_scp_cd          =  (JSPUtil.getParameter(request, "bkg_svc_scp_cd         		".trim(), length));
			String[] bl_por_cd               =  (JSPUtil.getParameter(request, "bl_por_cd              		".trim(), length));
			String[] bl_pol_cd               =  (JSPUtil.getParameter(request, "bl_pol_cd              		".trim(), length));
			String[] bl_pod_cd               =  (JSPUtil.getParameter(request, "bl_pod_cd              		".trim(), length));
			String[] bl_del_cd               =  (JSPUtil.getParameter(request, "bl_del_cd              		".trim(), length));
			String[] org_bl_rdem_ofc_cd      =  (JSPUtil.getParameter(request, "org_bl_rdem_ofc_cd     		".trim(), length));
			String[] org_bl_rdem_dt          =  (JSPUtil.getParameter(request, "org_bl_rdem_dt         		".trim(), length));
			String[] org_bl_rdem_no          =  (JSPUtil.getParameter(request, "org_bl_rdem_no         		".trim(), length));
			String[] bl_ppd_ofc_n3rd_pay_flg =  (JSPUtil.getParameter(request, "bl_ppd_ofc_n3rd_pay_flg		".trim(), length));
			String[] bl_cct_ofc_n3rd_pay_flg =  (JSPUtil.getParameter(request, "bl_cct_ofc_n3rd_pay_flg		".trim(), length));
			String[] an_cust_fax_no          =  (JSPUtil.getParameter(request, "an_cust_fax_no         		".trim(), length));
			String[] an_cust_fax_no2         =  (JSPUtil.getParameter(request, "an_cust_fax_no2        		".trim(), length));
			String[] an_cust_fax_no3         =  (JSPUtil.getParameter(request, "an_cust_fax_no3        		".trim(), length));
			String[] bl_mst_no               =  (JSPUtil.getParameter(request, "bl_mst_no              		".trim(), length));
			String[] bl_mst_div_cd           =  (JSPUtil.getParameter(request, "bl_mst_div_cd          		".trim(), length));
			String[] bl_cust_tp_cd           =  (JSPUtil.getParameter(request, "bl_cust_tp_cd          		".trim(), length));
			String[] finc_if_dt              =  (JSPUtil.getParameter(request, "finc_if_dt             		".trim(), length));
			String[] frt_fwrd_fmc_no         =  (JSPUtil.getParameter(request, "frt_fwrd_fmc_no        		".trim(), length));
			String[] repl_flg                =  (JSPUtil.getParameter(request, "repl_flg               		".trim(), length));
			String[] bl_mst_bkg_no           =  (JSPUtil.getParameter(request, "bl_mst_bkg_no          		".trim(), length));
			String[] bl_mst_bkg_no_split     =  (JSPUtil.getParameter(request, "bl_mst_bkg_no_split    		".trim(), length));
			String[] bl_split_cd             =  (JSPUtil.getParameter(request, "bl_split_cd            		".trim(), length));
			String[] cgo_arr_dt              =  (JSPUtil.getParameter(request, "cgo_arr_dt             		".trim(), length));
			String[] cgo_pkup_aval_dt        =  (JSPUtil.getParameter(request, "cgo_pkup_aval_dt       		".trim(), length));
			String[] free_dt_to_pkup_dt      =  (JSPUtil.getParameter(request, "free_dt_to_pkup_dt     		".trim(), length));
			String[] cgo_pkup_cy_cd          =  (JSPUtil.getParameter(request, "cgo_pkup_cy_cd         		".trim(), length));
			String[] cgo_pkup_cfs_cd         =  (JSPUtil.getParameter(request, "cgo_pkup_cfs_cd        		".trim(), length));
			String[] hcos_if_flg             =  (JSPUtil.getParameter(request, "hcos_if_flg            		".trim(), length));
			String[] mty_rlse_cfm_flg        =  (JSPUtil.getParameter(request, "mty_rlse_cfm_flg       		".trim(), length));
			String[] finc_seq                =  (JSPUtil.getParameter(request, "finc_seq               		".trim(), length));
			String[] wt_flg                  =  (JSPUtil.getParameter(request, "wt_flg                 		".trim(), length));
			String[] cpls_frm_flg            =  (JSPUtil.getParameter(request, "cpls_frm_flg           		".trim(), length));
			String[] rfa_no                  =  (JSPUtil.getParameter(request, "rfa_no                 		".trim(), length));
			String[] nis_evnt_dt             =  (JSPUtil.getParameter(request, "nis_evnt_dt            		".trim(), length));
			String[] bank_cd                 =  (JSPUtil.getParameter(request, "bank_cd                		".trim(), length));
			String[] bank_flg                =  (JSPUtil.getParameter(request, "bank_flg               		".trim(), length));
			String[] prnt_cnt_cd             =  (JSPUtil.getParameter(request, "prnt_cnt_cd            		".trim(), length));
			String[] prnt_cust_seq           =  (JSPUtil.getParameter(request, "prnt_cust_seq          		".trim(), length));
			String[] po_no                   =  (JSPUtil.getParameter(request, "po_no                  		".trim(), length));
			String[] bl_pod_dt               =  (JSPUtil.getParameter(request, "bl_pod_dt              		".trim(), length));
			String[] sony_inv_desc           =  (JSPUtil.getParameter(request, "sony_inv_desc          		".trim(), length));
			String[] finc_inv_no             =  (JSPUtil.getParameter(request, "finc_inv_no            		".trim(), length));
			String[] rdem_upd_usr_id         =  (JSPUtil.getParameter(request, "rdem_upd_usr_id        		".trim(), length));
			String[] otr_doc_upd_usr_id      =  (JSPUtil.getParameter(request, "otr_doc_upd_usr_id     		".trim(), length));
			String[] ib_doc_upd_usr_id       =  (JSPUtil.getParameter(request, "ib_doc_upd_usr_id      		".trim(), length));
			String[] frt_sts_upd_usr_id      =  (JSPUtil.getParameter(request, "frt_sts_upd_usr_id     		".trim(), length));
			String[] nvocc_file_no           =  (JSPUtil.getParameter(request, "nvocc_file_no          		".trim(), length));
			String[] hus_bl_ttl_knt          =  (JSPUtil.getParameter(request, "hus_bl_ttl_knt         		".trim(), length));
			String[] blck_bl_flg             =  (JSPUtil.getParameter(request, "blck_bl_flg            		".trim(), length));
			String[] ublck_usr_id            =  (JSPUtil.getParameter(request, "ublck_usr_id           		".trim(), length));
			String[] ublck_dt                =  (JSPUtil.getParameter(request, "ublck_dt               		".trim(), length));
			String[] bl_ublck_dt             =  (JSPUtil.getParameter(request, "bl_ublck_dt            		".trim(), length));
			String[] cnd_nvocc_no            =  (JSPUtil.getParameter(request, "cnd_nvocc_no           		".trim(), length));
			String[] dept_no                 =  (JSPUtil.getParameter(request, "dept_no                		".trim(), length));
			String[] edo_trk_cd              =  (JSPUtil.getParameter(request, "edo_trk_cd             		".trim(), length));
			String[] edo_trk_nm              =  (JSPUtil.getParameter(request, "edo_trk_nm             		".trim(), length));
			String[] pkl_shpr_call_no        =  (JSPUtil.getParameter(request, "pkl_shpr_call_no       		".trim(), length));
			String[] vsl_ref_no              =  (JSPUtil.getParameter(request, "vsl_ref_no             		".trim(), length));
			String[] bl_cfm_usr_id           =  (JSPUtil.getParameter(request, "bl_cfm_usr_id          		".trim(), length));
			String[] bl_cfm_dt               =  (JSPUtil.getParameter(request, "bl_cfm_dt              		".trim(), length));
			String[] bl_cfm_flg              =  (JSPUtil.getParameter(request, "bl_cfm_flg             		".trim(), length));
			String[] do_asgn_pre_rmk         =  (JSPUtil.getParameter(request, "do_asgn_pre_rmk        		".trim(), length));
			String[] bkg_alt_cust_cfm_flg    =  (JSPUtil.getParameter(request, "bkg_alt_cust_cfm_flg   		".trim(), length));
			String[] sc_act_cust_cnt_cd      =  (JSPUtil.getParameter(request, "sc_act_cust_cnt_cd     		".trim(), length));
			String[] sc_act_cust_seq         =  (JSPUtil.getParameter(request, "sc_act_cust_seq        		".trim(), length));
			String[] all_mtr_flg             =  (JSPUtil.getParameter(request, "all_mtr_flg            		".trim(), length));
			String[] all_mtr_chg_flg         =  (JSPUtil.getParameter(request, "all_mtr_chg_flg        		".trim(), length));
			String[] bkg_split_rto         	 =  (JSPUtil.getParameter(request, "bkg_split_rto        		".trim(), length)); // 2007 12 06 hyunsu added 
			String[] eai_evnt_dt             =  (JSPUtil.getParameter(request, "eai_evnt_dt            		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new BKG_BKG_MISC();
				model.setIbflag                 		  (ibflag                 	[i]);
				model.setPage_rows              		  (page_rows              	[i]);
				model.setBkg_no                 		  (bkg_no                 	[i]);
				model.setBkg_no_split           		  (bkg_no_split           	[i]);
				model.setBl_no                  		  (bl_no                  	[i]);
				model.setBl_no_tp               		  (bl_no_tp               	[i]);
				model.setBl_no_chk              		  (bl_no_chk              	[i]);
				model.setGen_rfa_no             		  (gen_rfa_no             	[i]);
				model.setGen_rfa_ofc_cty_cd     		  (gen_rfa_ofc_cty_cd     	[i]);
				model.setSc_prop_no             		  (sc_prop_no             	[i]);
				model.setBl_trf_no              		  (bl_trf_no              	[i]);
				model.setTeu_grs_rev_amt        		  (teu_grs_rev_amt        	[i]);
				model.setFeu_grs_rev_amt        		  (feu_grs_rev_amt        	[i]);
				model.setTeu_net_rev_amt        		  (teu_net_rev_amt        	[i]);
				model.setFeu_net_rev_amt        		  (feu_net_rev_amt        	[i]);
				model.setTeu_cost_amt           		  (teu_cost_amt           	[i]);
				model.setFeu_cost_amt           		  (feu_cost_amt           	[i]);
				model.setTeu_mgn_rev_amt        		  (teu_mgn_rev_amt        	[i]);
				model.setFeu_mgn_rev_amt        		  (feu_mgn_rev_amt        	[i]);
				model.setBkg_cfm_flg            		  (bkg_cfm_flg            	[i]);
				model.setBkg_cfm_dt             		  (bkg_cfm_dt             	[i]);
				model.setBkg_cfm_usr_id         		  (bkg_cfm_usr_id         	[i]);
				model.setBl_frt_cd              		  (bl_frt_cd              	[i]);
				model.setBl_do_no               		  (bl_do_no               	[i]);
				model.setDo_ofc_cd              		  (do_ofc_cd              	[i]);
				model.setDo_dt                  		  (do_dt                  	[i]);
				model.setBl_ppd_cd              		  (bl_ppd_cd              	[i]);
				model.setBl_ppd_ofc_cd          		  (bl_ppd_ofc_cd          	[i]);
				model.setBl_ppd_dt              		  (bl_ppd_dt              	[i]);
				model.setBl_clt_cd              		  (bl_clt_cd              	[i]);
				model.setBl_clt_ofc_cd          		  (bl_clt_ofc_cd          	[i]);
				model.setBl_clt_dt              		  (bl_clt_dt              	[i]);
				model.setBl_rat_cd              		  (bl_rat_cd              	[i]);
				model.setBl_rat_cng_cd          		  (bl_rat_cng_cd          	[i]);
				model.setBl_inv_ppd_cd          		  (bl_inv_ppd_cd          	[i]);
				model.setBl_inv_clt_cd          		  (bl_inv_clt_cd          	[i]);
				model.setBl_inv_com_cd          		  (bl_inv_com_cd          	[i]);
				model.setBl_mrn_no              		  (bl_mrn_no              	[i]);
				model.setBl_mrn_no_sub_seq      		  (bl_mrn_no_sub_seq      	[i]);
				model.setOrg_bl_rcv_cd          		  (org_bl_rcv_cd          	[i]);
				model.setOrg_bl_rcv_usr_id      		  (org_bl_rcv_usr_id      	[i]);
				model.setCgo_de_cd              		  (cgo_de_cd              	[i]);
				model.setXpt_decl_cd            		  (xpt_decl_cd            	[i]);
				model.setBl_cpy_no              		  (bl_cpy_no              	[i]);
				model.setOrg_iss_knt            		  (org_iss_knt            	[i]);
				model.setBl_dt                  		  (bl_dt                  	[i]);
				model.setBl_iss_ofc_cd          		  (bl_iss_ofc_cd          	[i]);
				model.setBl_iss_nm              		  (bl_iss_nm              	[i]);
				model.setBl_doc_usr_id          		  (bl_doc_usr_id          	[i]);
				model.setBl_iss_flg             		  (bl_iss_flg             	[i]);
				model.setBl_org_cnt_nm          		  (bl_org_cnt_nm          	[i]);
				model.setBl_mv_tp_nm            		  (bl_mv_tp_nm            	[i]);
				model.setBl_fnl_dest_nm         		  (bl_fnl_dest_nm         	[i]);
				model.setBl_ttl_pck_desc        		  (bl_ttl_pck_desc        	[i]);
				model.setBl_xpt_lic_no          		  (bl_xpt_lic_no          	[i]);
				model.setBl_tp_cd               		  (bl_tp_cd               	[i]);
				model.setBl_obrd_tp_cd          		  (bl_obrd_tp_cd          	[i]);
				model.setBl_obrd_dt             		  (bl_obrd_dt             	[i]);
				model.setBl_vsl_nm              		  (bl_vsl_nm              	[i]);
				model.setBl_pre_vsl_nm          		  (bl_pre_vsl_nm          	[i]);
				model.setBl_por_nm              		  (bl_por_nm              	[i]);
				model.setBl_pol_nm              		  (bl_pol_nm              	[i]);
				model.setBl_pod_nm              		  (bl_pod_nm              	[i]);
				model.setBl_del_nm              		  (bl_del_nm              	[i]);
				model.setCstms_clr_cd           		  (cstms_clr_cd           	[i]);
				model.setCstms_clr_loc_cd       		  (cstms_clr_loc_cd       	[i]);
				model.setCstms_clr_wr_hus_nm    		  (cstms_clr_wr_hus_nm    	[i]);
				model.setCstms_clr_flg          		  (cstms_clr_flg          	[i]);
				model.setImdt_trsp_ref_no       		  (imdt_trsp_ref_no       	[i]);
				model.setCgo_inv_val_no         		  (cgo_inv_val_no         	[i]);
				model.setBd_doc_rcv_ofc_cd      		  (bd_doc_rcv_ofc_cd      	[i]);
				model.setBd_doc_rcv_dt          		  (bd_doc_rcv_dt          	[i]);
				model.setOtr_doc_tp_cd          		  (otr_doc_tp_cd          	[i]);
				model.setOtr_doc_rcv_ofc_cd     		  (otr_doc_rcv_ofc_cd     	[i]);
				model.setOtr_doc_rcv_dt         		  (otr_doc_rcv_dt         	[i]);
				model.setOrg_bl_rcv_ofc_cd      		  (org_bl_rcv_ofc_cd      	[i]);
				model.setOrg_bl_rcv_dt          		  (org_bl_rcv_dt          	[i]);
				model.setOrg_bl_rcv_no          		  (org_bl_rcv_no          	[i]);
				model.setMf_cfm_flg             		  (mf_cfm_flg             	[i]);
				model.setLocl_clr_flg           		  (locl_clr_flg           	[i]);
				model.setBl_iss_rmk             		  (bl_iss_rmk             	[i]);
				model.setBkg_svc_scp_cd         		  (bkg_svc_scp_cd         	[i]);
				model.setBl_por_cd              		  (bl_por_cd              	[i]);
				model.setBl_pol_cd              		  (bl_pol_cd              	[i]);
				model.setBl_pod_cd              		  (bl_pod_cd              	[i]);
				model.setBl_del_cd              		  (bl_del_cd              	[i]);
				model.setOrg_bl_rdem_ofc_cd     		  (org_bl_rdem_ofc_cd     	[i]);
				model.setOrg_bl_rdem_dt         		  (org_bl_rdem_dt         	[i]);
				model.setOrg_bl_rdem_no         		  (org_bl_rdem_no         	[i]);
				model.setBl_ppd_ofc_n3rd_pay_flg		  (bl_ppd_ofc_n3rd_pay_flg	[i]);
				model.setBl_cct_ofc_n3rd_pay_flg		  (bl_cct_ofc_n3rd_pay_flg	[i]);
				model.setAn_cust_fax_no         		  (an_cust_fax_no         	[i]);
				model.setAn_cust_fax_no2        		  (an_cust_fax_no2        	[i]);
				model.setAn_cust_fax_no3        		  (an_cust_fax_no3        	[i]);
				model.setBl_mst_no              		  (bl_mst_no              	[i]);
				model.setBl_mst_div_cd          		  (bl_mst_div_cd          	[i]);
				model.setBl_cust_tp_cd          		  (bl_cust_tp_cd          	[i]);
				model.setFinc_if_dt             		  (finc_if_dt             	[i]);
				model.setFrt_fwrd_fmc_no        		  (frt_fwrd_fmc_no        	[i]);
				model.setRepl_flg               		  (repl_flg               	[i]);
				model.setBl_mst_bkg_no          		  (bl_mst_bkg_no          	[i]);
				model.setBl_mst_bkg_no_split    		  (bl_mst_bkg_no_split    	[i]);
				model.setBl_split_cd            		  (bl_split_cd            	[i]);
				model.setCgo_arr_dt             		  (cgo_arr_dt             	[i]);
				model.setCgo_pkup_aval_dt       		  (cgo_pkup_aval_dt       	[i]);
				model.setFree_dt_to_pkup_dt     		  (free_dt_to_pkup_dt     	[i]);
				model.setCgo_pkup_cy_cd         		  (cgo_pkup_cy_cd         	[i]);
				model.setCgo_pkup_cfs_cd        		  (cgo_pkup_cfs_cd        	[i]);
				model.setHcos_if_flg            		  (hcos_if_flg            	[i]);
				model.setMty_rlse_cfm_flg       		  (mty_rlse_cfm_flg       	[i]);
				model.setFinc_seq               		  (finc_seq               	[i]);
				model.setWt_flg                 		  (wt_flg                 	[i]);
				model.setCpls_frm_flg           		  (cpls_frm_flg           	[i]);
				model.setRfa_no                 		  (rfa_no                 	[i]);
				model.setNis_evnt_dt            		  (nis_evnt_dt            	[i]);
				model.setBank_cd                		  (bank_cd                	[i]);
				model.setBank_flg               		  (bank_flg               	[i]);
				model.setPrnt_cnt_cd            		  (prnt_cnt_cd            	[i]);
				model.setPrnt_cust_seq          		  (prnt_cust_seq          	[i]);
				model.setPo_no                  		  (po_no                  	[i]);
				model.setBl_pod_dt              		  (bl_pod_dt              	[i]);
				model.setSony_inv_desc          		  (sony_inv_desc          	[i]);
				model.setFinc_inv_no            		  (finc_inv_no            	[i]);
				model.setRdem_upd_usr_id        		  (rdem_upd_usr_id        	[i]);
				model.setOtr_doc_upd_usr_id     		  (otr_doc_upd_usr_id     	[i]);
				model.setIb_doc_upd_usr_id      		  (ib_doc_upd_usr_id      	[i]);
				model.setFrt_sts_upd_usr_id     		  (frt_sts_upd_usr_id     	[i]);
				model.setNvocc_file_no          		  (nvocc_file_no          	[i]);
				model.setHus_bl_ttl_knt         		  (hus_bl_ttl_knt         	[i]);
				model.setBlck_bl_flg            		  (blck_bl_flg            	[i]);
				model.setUblck_usr_id           		  (ublck_usr_id           	[i]);
				model.setUblck_dt               		  (ublck_dt               	[i]);
				model.setBl_ublck_dt            		  (bl_ublck_dt            	[i]);
				model.setCnd_nvocc_no           		  (cnd_nvocc_no           	[i]);
				model.setDept_no                		  (dept_no                	[i]);
				model.setEdo_trk_cd             		  (edo_trk_cd             	[i]);
				model.setEdo_trk_nm             		  (edo_trk_nm             	[i]);
				model.setPkl_shpr_call_no       		  (pkl_shpr_call_no       	[i]);
				model.setVsl_ref_no             		  (vsl_ref_no             	[i]);
				model.setBl_cfm_usr_id          		  (bl_cfm_usr_id          	[i]);
				model.setBl_cfm_dt              		  (bl_cfm_dt              	[i]);
				model.setBl_cfm_flg             		  (bl_cfm_flg             	[i]);
				model.setDo_asgn_pre_rmk        		  (do_asgn_pre_rmk        	[i]);
				model.setBkg_alt_cust_cfm_flg   		  (bkg_alt_cust_cfm_flg   	[i]);
				model.setSc_act_cust_cnt_cd     		  (sc_act_cust_cnt_cd     	[i]);
				model.setSc_act_cust_seq        		  (sc_act_cust_seq        	[i]);
				model.setAll_mtr_flg            		  (all_mtr_flg            	[i]);
				model.setAll_mtr_chg_flg        		  (all_mtr_chg_flg        	[i]);
				model.setBkg_split_rto        		  	  (bkg_split_rto        	[i]); //2007 12 06 hyunsu added 
				model.setEai_evnt_dt            		  (eai_evnt_dt            	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		BKG_BKG_MISC model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag                  =  (JSPUtil.getParameter(request, prefix + "ibflag                 		".trim(), length));
			String[] page_rows               =  (JSPUtil.getParameter(request, prefix + "page_rows              		".trim(), length));
			String[] bkg_no                  =  (JSPUtil.getParameter(request, prefix + "bkg_no                 		".trim(), length));
			String[] bkg_no_split            =  (JSPUtil.getParameter(request, prefix + "bkg_no_split           		".trim(), length));
			String[] bl_no                   =  (JSPUtil.getParameter(request, prefix + "bl_no                  		".trim(), length));
			String[] bl_no_tp                =  (JSPUtil.getParameter(request, prefix + "bl_no_tp               		".trim(), length));
			String[] bl_no_chk               =  (JSPUtil.getParameter(request, prefix + "bl_no_chk              		".trim(), length));
			String[] gen_rfa_no              =  (JSPUtil.getParameter(request, prefix + "gen_rfa_no             		".trim(), length));
			String[] gen_rfa_ofc_cty_cd      =  (JSPUtil.getParameter(request, prefix + "gen_rfa_ofc_cty_cd     		".trim(), length));
			String[] sc_prop_no              =  (JSPUtil.getParameter(request, prefix + "sc_prop_no             		".trim(), length));
			String[] bl_trf_no               =  (JSPUtil.getParameter(request, prefix + "bl_trf_no              		".trim(), length));
			String[] teu_grs_rev_amt         =  (JSPUtil.getParameter(request, prefix + "teu_grs_rev_amt        		".trim(), length));
			String[] feu_grs_rev_amt         =  (JSPUtil.getParameter(request, prefix + "feu_grs_rev_amt        		".trim(), length));
			String[] teu_net_rev_amt         =  (JSPUtil.getParameter(request, prefix + "teu_net_rev_amt        		".trim(), length));
			String[] feu_net_rev_amt         =  (JSPUtil.getParameter(request, prefix + "feu_net_rev_amt        		".trim(), length));
			String[] teu_cost_amt            =  (JSPUtil.getParameter(request, prefix + "teu_cost_amt           		".trim(), length));
			String[] feu_cost_amt            =  (JSPUtil.getParameter(request, prefix + "feu_cost_amt           		".trim(), length));
			String[] teu_mgn_rev_amt         =  (JSPUtil.getParameter(request, prefix + "teu_mgn_rev_amt        		".trim(), length));
			String[] feu_mgn_rev_amt         =  (JSPUtil.getParameter(request, prefix + "feu_mgn_rev_amt        		".trim(), length));
			String[] bkg_cfm_flg             =  (JSPUtil.getParameter(request, prefix + "bkg_cfm_flg            		".trim(), length));
			String[] bkg_cfm_dt              =  (JSPUtil.getParameter(request, prefix + "bkg_cfm_dt             		".trim(), length));
			String[] bkg_cfm_usr_id          =  (JSPUtil.getParameter(request, prefix + "bkg_cfm_usr_id         		".trim(), length));
			String[] bl_frt_cd               =  (JSPUtil.getParameter(request, prefix + "bl_frt_cd              		".trim(), length));
			String[] bl_do_no                =  (JSPUtil.getParameter(request, prefix + "bl_do_no               		".trim(), length));
			String[] do_ofc_cd               =  (JSPUtil.getParameter(request, prefix + "do_ofc_cd              		".trim(), length));
			String[] do_dt                   =  (JSPUtil.getParameter(request, prefix + "do_dt                  		".trim(), length));
			String[] bl_ppd_cd               =  (JSPUtil.getParameter(request, prefix + "bl_ppd_cd              		".trim(), length));
			String[] bl_ppd_ofc_cd           =  (JSPUtil.getParameter(request, prefix + "bl_ppd_ofc_cd          		".trim(), length));
			String[] bl_ppd_dt               =  (JSPUtil.getParameter(request, prefix + "bl_ppd_dt              		".trim(), length));
			String[] bl_clt_cd               =  (JSPUtil.getParameter(request, prefix + "bl_clt_cd              		".trim(), length));
			String[] bl_clt_ofc_cd           =  (JSPUtil.getParameter(request, prefix + "bl_clt_ofc_cd          		".trim(), length));
			String[] bl_clt_dt               =  (JSPUtil.getParameter(request, prefix + "bl_clt_dt              		".trim(), length));
			String[] bl_rat_cd               =  (JSPUtil.getParameter(request, prefix + "bl_rat_cd              		".trim(), length));
			String[] bl_rat_cng_cd           =  (JSPUtil.getParameter(request, prefix + "bl_rat_cng_cd          		".trim(), length));
			String[] bl_inv_ppd_cd           =  (JSPUtil.getParameter(request, prefix + "bl_inv_ppd_cd          		".trim(), length));
			String[] bl_inv_clt_cd           =  (JSPUtil.getParameter(request, prefix + "bl_inv_clt_cd          		".trim(), length));
			String[] bl_inv_com_cd           =  (JSPUtil.getParameter(request, prefix + "bl_inv_com_cd          		".trim(), length));
			String[] bl_mrn_no               =  (JSPUtil.getParameter(request, prefix + "bl_mrn_no              		".trim(), length));
			String[] bl_mrn_no_sub_seq       =  (JSPUtil.getParameter(request, prefix + "bl_mrn_no_sub_seq      		".trim(), length));
			String[] org_bl_rcv_cd           =  (JSPUtil.getParameter(request, prefix + "org_bl_rcv_cd          		".trim(), length));
			String[] org_bl_rcv_usr_id       =  (JSPUtil.getParameter(request, prefix + "org_bl_rcv_usr_id      		".trim(), length));
			String[] cgo_de_cd               =  (JSPUtil.getParameter(request, prefix + "cgo_de_cd              		".trim(), length));
			String[] xpt_decl_cd             =  (JSPUtil.getParameter(request, prefix + "xpt_decl_cd            		".trim(), length));
			String[] bl_cpy_no               =  (JSPUtil.getParameter(request, prefix + "bl_cpy_no              		".trim(), length));
			String[] org_iss_knt             =  (JSPUtil.getParameter(request, prefix + "org_iss_knt            		".trim(), length));
			String[] bl_dt                   =  (JSPUtil.getParameter(request, prefix + "bl_dt                  		".trim(), length));
			String[] bl_iss_ofc_cd           =  (JSPUtil.getParameter(request, prefix + "bl_iss_ofc_cd          		".trim(), length));
			String[] bl_iss_nm               =  (JSPUtil.getParameter(request, prefix + "bl_iss_nm              		".trim(), length));
			String[] bl_doc_usr_id           =  (JSPUtil.getParameter(request, prefix + "bl_doc_usr_id          		".trim(), length));
			String[] bl_iss_flg              =  (JSPUtil.getParameter(request, prefix + "bl_iss_flg             		".trim(), length));
			String[] bl_org_cnt_nm           =  (JSPUtil.getParameter(request, prefix + "bl_org_cnt_nm          		".trim(), length));
			String[] bl_mv_tp_nm             =  (JSPUtil.getParameter(request, prefix + "bl_mv_tp_nm            		".trim(), length));
			String[] bl_fnl_dest_nm          =  (JSPUtil.getParameter(request, prefix + "bl_fnl_dest_nm         		".trim(), length));
			String[] bl_ttl_pck_desc         =  (JSPUtil.getParameter(request, prefix + "bl_ttl_pck_desc        		".trim(), length));
			String[] bl_xpt_lic_no           =  (JSPUtil.getParameter(request, prefix + "bl_xpt_lic_no          		".trim(), length));
			String[] bl_tp_cd                =  (JSPUtil.getParameter(request, prefix + "bl_tp_cd               		".trim(), length));
			String[] bl_obrd_tp_cd           =  (JSPUtil.getParameter(request, prefix + "bl_obrd_tp_cd          		".trim(), length));
			String[] bl_obrd_dt              =  (JSPUtil.getParameter(request, prefix + "bl_obrd_dt             		".trim(), length));
			String[] bl_vsl_nm               =  (JSPUtil.getParameter(request, prefix + "bl_vsl_nm              		".trim(), length));
			String[] bl_pre_vsl_nm           =  (JSPUtil.getParameter(request, prefix + "bl_pre_vsl_nm          		".trim(), length));
			String[] bl_por_nm               =  (JSPUtil.getParameter(request, prefix + "bl_por_nm              		".trim(), length));
			String[] bl_pol_nm               =  (JSPUtil.getParameter(request, prefix + "bl_pol_nm              		".trim(), length));
			String[] bl_pod_nm               =  (JSPUtil.getParameter(request, prefix + "bl_pod_nm              		".trim(), length));
			String[] bl_del_nm               =  (JSPUtil.getParameter(request, prefix + "bl_del_nm              		".trim(), length));
			String[] cstms_clr_cd            =  (JSPUtil.getParameter(request, prefix + "cstms_clr_cd           		".trim(), length));
			String[] cstms_clr_loc_cd        =  (JSPUtil.getParameter(request, prefix + "cstms_clr_loc_cd       		".trim(), length));
			String[] cstms_clr_wr_hus_nm     =  (JSPUtil.getParameter(request, prefix + "cstms_clr_wr_hus_nm    		".trim(), length));
			String[] cstms_clr_flg           =  (JSPUtil.getParameter(request, prefix + "cstms_clr_flg          		".trim(), length));
			String[] imdt_trsp_ref_no        =  (JSPUtil.getParameter(request, prefix + "imdt_trsp_ref_no       		".trim(), length));
			String[] cgo_inv_val_no          =  (JSPUtil.getParameter(request, prefix + "cgo_inv_val_no         		".trim(), length));
			String[] bd_doc_rcv_ofc_cd       =  (JSPUtil.getParameter(request, prefix + "bd_doc_rcv_ofc_cd      		".trim(), length));
			String[] bd_doc_rcv_dt           =  (JSPUtil.getParameter(request, prefix + "bd_doc_rcv_dt          		".trim(), length));
			String[] otr_doc_tp_cd           =  (JSPUtil.getParameter(request, prefix + "otr_doc_tp_cd          		".trim(), length));
			String[] otr_doc_rcv_ofc_cd      =  (JSPUtil.getParameter(request, prefix + "otr_doc_rcv_ofc_cd     		".trim(), length));
			String[] otr_doc_rcv_dt          =  (JSPUtil.getParameter(request, prefix + "otr_doc_rcv_dt         		".trim(), length));
			String[] org_bl_rcv_ofc_cd       =  (JSPUtil.getParameter(request, prefix + "org_bl_rcv_ofc_cd      		".trim(), length));
			String[] org_bl_rcv_dt           =  (JSPUtil.getParameter(request, prefix + "org_bl_rcv_dt          		".trim(), length));
			String[] org_bl_rcv_no           =  (JSPUtil.getParameter(request, prefix + "org_bl_rcv_no          		".trim(), length));
			String[] mf_cfm_flg              =  (JSPUtil.getParameter(request, prefix + "mf_cfm_flg             		".trim(), length));
			String[] locl_clr_flg            =  (JSPUtil.getParameter(request, prefix + "locl_clr_flg           		".trim(), length));
			String[] bl_iss_rmk              =  (JSPUtil.getParameter(request, prefix + "bl_iss_rmk             		".trim(), length));
			String[] bkg_svc_scp_cd          =  (JSPUtil.getParameter(request, prefix + "bkg_svc_scp_cd         		".trim(), length));
			String[] bl_por_cd               =  (JSPUtil.getParameter(request, prefix + "bl_por_cd              		".trim(), length));
			String[] bl_pol_cd               =  (JSPUtil.getParameter(request, prefix + "bl_pol_cd              		".trim(), length));
			String[] bl_pod_cd               =  (JSPUtil.getParameter(request, prefix + "bl_pod_cd              		".trim(), length));
			String[] bl_del_cd               =  (JSPUtil.getParameter(request, prefix + "bl_del_cd              		".trim(), length));
			String[] org_bl_rdem_ofc_cd      =  (JSPUtil.getParameter(request, prefix + "org_bl_rdem_ofc_cd     		".trim(), length));
			String[] org_bl_rdem_dt          =  (JSPUtil.getParameter(request, prefix + "org_bl_rdem_dt         		".trim(), length));
			String[] org_bl_rdem_no          =  (JSPUtil.getParameter(request, prefix + "org_bl_rdem_no         		".trim(), length));
			String[] bl_ppd_ofc_n3rd_pay_flg =  (JSPUtil.getParameter(request, prefix + "bl_ppd_ofc_n3rd_pay_flg		".trim(), length));
			String[] bl_cct_ofc_n3rd_pay_flg =  (JSPUtil.getParameter(request, prefix + "bl_cct_ofc_n3rd_pay_flg		".trim(), length));
			String[] an_cust_fax_no          =  (JSPUtil.getParameter(request, prefix + "an_cust_fax_no         		".trim(), length));
			String[] an_cust_fax_no2         =  (JSPUtil.getParameter(request, prefix + "an_cust_fax_no2        		".trim(), length));
			String[] an_cust_fax_no3         =  (JSPUtil.getParameter(request, prefix + "an_cust_fax_no3        		".trim(), length));
			String[] bl_mst_no               =  (JSPUtil.getParameter(request, prefix + "bl_mst_no              		".trim(), length));
			String[] bl_mst_div_cd           =  (JSPUtil.getParameter(request, prefix + "bl_mst_div_cd          		".trim(), length));
			String[] bl_cust_tp_cd           =  (JSPUtil.getParameter(request, prefix + "bl_cust_tp_cd          		".trim(), length));
			String[] finc_if_dt              =  (JSPUtil.getParameter(request, prefix + "finc_if_dt             		".trim(), length));
			String[] frt_fwrd_fmc_no         =  (JSPUtil.getParameter(request, prefix + "frt_fwrd_fmc_no        		".trim(), length));
			String[] repl_flg                =  (JSPUtil.getParameter(request, prefix + "repl_flg               		".trim(), length));
			String[] bl_mst_bkg_no           =  (JSPUtil.getParameter(request, prefix + "bl_mst_bkg_no          		".trim(), length));
			String[] bl_mst_bkg_no_split     =  (JSPUtil.getParameter(request, prefix + "bl_mst_bkg_no_split    		".trim(), length));
			String[] bl_split_cd             =  (JSPUtil.getParameter(request, prefix + "bl_split_cd            		".trim(), length));
			String[] cgo_arr_dt              =  (JSPUtil.getParameter(request, prefix + "cgo_arr_dt             		".trim(), length));
			String[] cgo_pkup_aval_dt        =  (JSPUtil.getParameter(request, prefix + "cgo_pkup_aval_dt       		".trim(), length));
			String[] free_dt_to_pkup_dt      =  (JSPUtil.getParameter(request, prefix + "free_dt_to_pkup_dt     		".trim(), length));
			String[] cgo_pkup_cy_cd          =  (JSPUtil.getParameter(request, prefix + "cgo_pkup_cy_cd         		".trim(), length));
			String[] cgo_pkup_cfs_cd         =  (JSPUtil.getParameter(request, prefix + "cgo_pkup_cfs_cd        		".trim(), length));
			String[] hcos_if_flg             =  (JSPUtil.getParameter(request, prefix + "hcos_if_flg            		".trim(), length));
			String[] mty_rlse_cfm_flg        =  (JSPUtil.getParameter(request, prefix + "mty_rlse_cfm_flg       		".trim(), length));
			String[] finc_seq                =  (JSPUtil.getParameter(request, prefix + "finc_seq               		".trim(), length));
			String[] wt_flg                  =  (JSPUtil.getParameter(request, prefix + "wt_flg                 		".trim(), length));
			String[] cpls_frm_flg            =  (JSPUtil.getParameter(request, prefix + "cpls_frm_flg           		".trim(), length));
			String[] rfa_no                  =  (JSPUtil.getParameter(request, prefix + "rfa_no                 		".trim(), length));
			String[] nis_evnt_dt             =  (JSPUtil.getParameter(request, prefix + "nis_evnt_dt            		".trim(), length));
			String[] bank_cd                 =  (JSPUtil.getParameter(request, prefix + "bank_cd                		".trim(), length));
			String[] bank_flg                =  (JSPUtil.getParameter(request, prefix + "bank_flg               		".trim(), length));
			String[] prnt_cnt_cd             =  (JSPUtil.getParameter(request, prefix + "prnt_cnt_cd            		".trim(), length));
			String[] prnt_cust_seq           =  (JSPUtil.getParameter(request, prefix + "prnt_cust_seq          		".trim(), length));
			String[] po_no                   =  (JSPUtil.getParameter(request, prefix + "po_no                  		".trim(), length));
			String[] bl_pod_dt               =  (JSPUtil.getParameter(request, prefix + "bl_pod_dt              		".trim(), length));
			String[] sony_inv_desc           =  (JSPUtil.getParameter(request, prefix + "sony_inv_desc          		".trim(), length));
			String[] finc_inv_no             =  (JSPUtil.getParameter(request, prefix + "finc_inv_no            		".trim(), length));
			String[] rdem_upd_usr_id         =  (JSPUtil.getParameter(request, prefix + "rdem_upd_usr_id        		".trim(), length));
			String[] otr_doc_upd_usr_id      =  (JSPUtil.getParameter(request, prefix + "otr_doc_upd_usr_id     		".trim(), length));
			String[] ib_doc_upd_usr_id       =  (JSPUtil.getParameter(request, prefix + "ib_doc_upd_usr_id      		".trim(), length));
			String[] frt_sts_upd_usr_id      =  (JSPUtil.getParameter(request, prefix + "frt_sts_upd_usr_id     		".trim(), length));
			String[] nvocc_file_no           =  (JSPUtil.getParameter(request, prefix + "nvocc_file_no          		".trim(), length));
			String[] hus_bl_ttl_knt          =  (JSPUtil.getParameter(request, prefix + "hus_bl_ttl_knt         		".trim(), length));
			String[] blck_bl_flg             =  (JSPUtil.getParameter(request, prefix + "blck_bl_flg            		".trim(), length));
			String[] ublck_usr_id            =  (JSPUtil.getParameter(request, prefix + "ublck_usr_id           		".trim(), length));
			String[] ublck_dt                =  (JSPUtil.getParameter(request, prefix + "ublck_dt               		".trim(), length));
			String[] bl_ublck_dt             =  (JSPUtil.getParameter(request, prefix + "bl_ublck_dt            		".trim(), length));
			String[] cnd_nvocc_no            =  (JSPUtil.getParameter(request, prefix + "cnd_nvocc_no           		".trim(), length));
			String[] dept_no                 =  (JSPUtil.getParameter(request, prefix + "dept_no                		".trim(), length));
			String[] edo_trk_cd              =  (JSPUtil.getParameter(request, prefix + "edo_trk_cd             		".trim(), length));
			String[] edo_trk_nm              =  (JSPUtil.getParameter(request, prefix + "edo_trk_nm             		".trim(), length));
			String[] pkl_shpr_call_no        =  (JSPUtil.getParameter(request, prefix + "pkl_shpr_call_no       		".trim(), length));
			String[] vsl_ref_no              =  (JSPUtil.getParameter(request, prefix + "vsl_ref_no             		".trim(), length));
			String[] bl_cfm_usr_id           =  (JSPUtil.getParameter(request, prefix + "bl_cfm_usr_id          		".trim(), length));
			String[] bl_cfm_dt               =  (JSPUtil.getParameter(request, prefix + "bl_cfm_dt              		".trim(), length));
			String[] bl_cfm_flg              =  (JSPUtil.getParameter(request, prefix + "bl_cfm_flg             		".trim(), length));
			String[] do_asgn_pre_rmk         =  (JSPUtil.getParameter(request, prefix + "do_asgn_pre_rmk        		".trim(), length));
			String[] bkg_alt_cust_cfm_flg    =  (JSPUtil.getParameter(request, prefix + "bkg_alt_cust_cfm_flg   		".trim(), length));
			String[] sc_act_cust_cnt_cd      =  (JSPUtil.getParameter(request, prefix + "sc_act_cust_cnt_cd     		".trim(), length));
			String[] sc_act_cust_seq         =  (JSPUtil.getParameter(request, prefix + "sc_act_cust_seq        		".trim(), length));
			String[] all_mtr_flg             =  (JSPUtil.getParameter(request, prefix + "all_mtr_flg            		".trim(), length));
			String[] all_mtr_chg_flg         =  (JSPUtil.getParameter(request, prefix + "all_mtr_chg_flg        		".trim(), length));
			String[] bkg_split_rto         	 =  (JSPUtil.getParameter(request, prefix + "bkg_split_rto 		       		".trim(), length)); // 2007 12 06 hyunsu added 
			String[] eai_evnt_dt             =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt            		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new BKG_BKG_MISC();
				model.setIbflag                 		  ( ibflag                 	[i]);
				model.setPage_rows              		  ( page_rows              	[i]);
				model.setBkg_no                 		  ( bkg_no                 	[i]);
				model.setBkg_no_split           		  ( bkg_no_split           	[i]);
				model.setBl_no                  		  ( bl_no                  	[i]);
				model.setBl_no_tp               		  ( bl_no_tp               	[i]);
				model.setBl_no_chk              		  ( bl_no_chk              	[i]);
				model.setGen_rfa_no             		  ( gen_rfa_no             	[i]);
				model.setGen_rfa_ofc_cty_cd     		  ( gen_rfa_ofc_cty_cd     	[i]);
				model.setSc_prop_no             		  ( sc_prop_no             	[i]);
				model.setBl_trf_no              		  ( bl_trf_no              	[i]);
				model.setTeu_grs_rev_amt        		  ( teu_grs_rev_amt        	[i]);
				model.setFeu_grs_rev_amt        		  ( feu_grs_rev_amt        	[i]);
				model.setTeu_net_rev_amt        		  ( teu_net_rev_amt        	[i]);
				model.setFeu_net_rev_amt        		  ( feu_net_rev_amt        	[i]);
				model.setTeu_cost_amt           		  ( teu_cost_amt           	[i]);
				model.setFeu_cost_amt           		  ( feu_cost_amt           	[i]);
				model.setTeu_mgn_rev_amt        		  ( teu_mgn_rev_amt        	[i]);
				model.setFeu_mgn_rev_amt        		  ( feu_mgn_rev_amt        	[i]);
				model.setBkg_cfm_flg            		  ( bkg_cfm_flg            	[i]);
				model.setBkg_cfm_dt             		  ( bkg_cfm_dt             	[i]);
				model.setBkg_cfm_usr_id         		  ( bkg_cfm_usr_id         	[i]);
				model.setBl_frt_cd              		  ( bl_frt_cd              	[i]);
				model.setBl_do_no               		  ( bl_do_no               	[i]);
				model.setDo_ofc_cd              		  ( do_ofc_cd              	[i]);
				model.setDo_dt                  		  ( do_dt                  	[i]);
				model.setBl_ppd_cd              		  ( bl_ppd_cd              	[i]);
				model.setBl_ppd_ofc_cd          		  ( bl_ppd_ofc_cd          	[i]);
				model.setBl_ppd_dt              		  ( bl_ppd_dt              	[i]);
				model.setBl_clt_cd              		  ( bl_clt_cd              	[i]);
				model.setBl_clt_ofc_cd          		  ( bl_clt_ofc_cd          	[i]);
				model.setBl_clt_dt              		  ( bl_clt_dt              	[i]);
				model.setBl_rat_cd              		  ( bl_rat_cd              	[i]);
				model.setBl_rat_cng_cd          		  ( bl_rat_cng_cd          	[i]);
				model.setBl_inv_ppd_cd          		  ( bl_inv_ppd_cd          	[i]);
				model.setBl_inv_clt_cd          		  ( bl_inv_clt_cd          	[i]);
				model.setBl_inv_com_cd          		  ( bl_inv_com_cd          	[i]);
				model.setBl_mrn_no              		  ( bl_mrn_no              	[i]);
				model.setBl_mrn_no_sub_seq      		  ( bl_mrn_no_sub_seq      	[i]);
				model.setOrg_bl_rcv_cd          		  ( org_bl_rcv_cd          	[i]);
				model.setOrg_bl_rcv_usr_id      		  ( org_bl_rcv_usr_id      	[i]);
				model.setCgo_de_cd              		  ( cgo_de_cd              	[i]);
				model.setXpt_decl_cd            		  ( xpt_decl_cd            	[i]);
				model.setBl_cpy_no              		  ( bl_cpy_no              	[i]);
				model.setOrg_iss_knt            		  ( org_iss_knt            	[i]);
				model.setBl_dt                  		  ( bl_dt                  	[i]);
				model.setBl_iss_ofc_cd          		  ( bl_iss_ofc_cd          	[i]);
				model.setBl_iss_nm              		  ( bl_iss_nm              	[i]);
				model.setBl_doc_usr_id          		  ( bl_doc_usr_id          	[i]);
				model.setBl_iss_flg             		  ( bl_iss_flg             	[i]);
				model.setBl_org_cnt_nm          		  ( bl_org_cnt_nm          	[i]);
				model.setBl_mv_tp_nm            		  ( bl_mv_tp_nm            	[i]);
				model.setBl_fnl_dest_nm         		  ( bl_fnl_dest_nm         	[i]);
				model.setBl_ttl_pck_desc        		  ( bl_ttl_pck_desc        	[i]);
				model.setBl_xpt_lic_no          		  ( bl_xpt_lic_no          	[i]);
				model.setBl_tp_cd               		  ( bl_tp_cd               	[i]);
				model.setBl_obrd_tp_cd          		  ( bl_obrd_tp_cd          	[i]);
				model.setBl_obrd_dt             		  ( bl_obrd_dt             	[i]);
				model.setBl_vsl_nm              		  ( bl_vsl_nm              	[i]);
				model.setBl_pre_vsl_nm          		  ( bl_pre_vsl_nm          	[i]);
				model.setBl_por_nm              		  ( bl_por_nm              	[i]);
				model.setBl_pol_nm              		  ( bl_pol_nm              	[i]);
				model.setBl_pod_nm              		  ( bl_pod_nm              	[i]);
				model.setBl_del_nm              		  ( bl_del_nm              	[i]);
				model.setCstms_clr_cd           		  ( cstms_clr_cd           	[i]);
				model.setCstms_clr_loc_cd       		  ( cstms_clr_loc_cd       	[i]);
				model.setCstms_clr_wr_hus_nm    		  ( cstms_clr_wr_hus_nm    	[i]);
				model.setCstms_clr_flg          		  ( cstms_clr_flg          	[i]);
				model.setImdt_trsp_ref_no       		  ( imdt_trsp_ref_no       	[i]);
				model.setCgo_inv_val_no         		  ( cgo_inv_val_no         	[i]);
				model.setBd_doc_rcv_ofc_cd      		  ( bd_doc_rcv_ofc_cd      	[i]);
				model.setBd_doc_rcv_dt          		  ( bd_doc_rcv_dt          	[i]);
				model.setOtr_doc_tp_cd          		  ( otr_doc_tp_cd          	[i]);
				model.setOtr_doc_rcv_ofc_cd     		  ( otr_doc_rcv_ofc_cd     	[i]);
				model.setOtr_doc_rcv_dt         		  ( otr_doc_rcv_dt         	[i]);
				model.setOrg_bl_rcv_ofc_cd      		  ( org_bl_rcv_ofc_cd      	[i]);
				model.setOrg_bl_rcv_dt          		  ( org_bl_rcv_dt          	[i]);
				model.setOrg_bl_rcv_no          		  ( org_bl_rcv_no          	[i]);
				model.setMf_cfm_flg             		  ( mf_cfm_flg             	[i]);
				model.setLocl_clr_flg           		  ( locl_clr_flg           	[i]);
				model.setBl_iss_rmk             		  ( bl_iss_rmk             	[i]);
				model.setBkg_svc_scp_cd         		  ( bkg_svc_scp_cd         	[i]);
				model.setBl_por_cd              		  ( bl_por_cd              	[i]);
				model.setBl_pol_cd              		  ( bl_pol_cd              	[i]);
				model.setBl_pod_cd              		  ( bl_pod_cd              	[i]);
				model.setBl_del_cd              		  ( bl_del_cd              	[i]);
				model.setOrg_bl_rdem_ofc_cd     		  ( org_bl_rdem_ofc_cd     	[i]);
				model.setOrg_bl_rdem_dt         		  ( org_bl_rdem_dt         	[i]);
				model.setOrg_bl_rdem_no         		  ( org_bl_rdem_no         	[i]);
				model.setBl_ppd_ofc_n3rd_pay_flg		  ( bl_ppd_ofc_n3rd_pay_flg	[i]);
				model.setBl_cct_ofc_n3rd_pay_flg		  ( bl_cct_ofc_n3rd_pay_flg	[i]);
				model.setAn_cust_fax_no         		  ( an_cust_fax_no         	[i]);
				model.setAn_cust_fax_no2        		  ( an_cust_fax_no2        	[i]);
				model.setAn_cust_fax_no3        		  ( an_cust_fax_no3        	[i]);
				model.setBl_mst_no              		  ( bl_mst_no              	[i]);
				model.setBl_mst_div_cd          		  ( bl_mst_div_cd          	[i]);
				model.setBl_cust_tp_cd          		  ( bl_cust_tp_cd          	[i]);
				model.setFinc_if_dt             		  ( finc_if_dt             	[i]);
				model.setFrt_fwrd_fmc_no        		  ( frt_fwrd_fmc_no        	[i]);
				model.setRepl_flg               		  ( repl_flg               	[i]);
				model.setBl_mst_bkg_no          		  ( bl_mst_bkg_no          	[i]);
				model.setBl_mst_bkg_no_split    		  ( bl_mst_bkg_no_split    	[i]);
				model.setBl_split_cd            		  ( bl_split_cd            	[i]);
				model.setCgo_arr_dt             		  ( cgo_arr_dt             	[i]);
				model.setCgo_pkup_aval_dt       		  ( cgo_pkup_aval_dt       	[i]);
				model.setFree_dt_to_pkup_dt     		  ( free_dt_to_pkup_dt     	[i]);
				model.setCgo_pkup_cy_cd         		  ( cgo_pkup_cy_cd         	[i]);
				model.setCgo_pkup_cfs_cd        		  ( cgo_pkup_cfs_cd        	[i]);
				model.setHcos_if_flg            		  ( hcos_if_flg            	[i]);
				model.setMty_rlse_cfm_flg       		  ( mty_rlse_cfm_flg       	[i]);
				model.setFinc_seq               		  ( finc_seq               	[i]);
				model.setWt_flg                 		  ( wt_flg                 	[i]);
				model.setCpls_frm_flg           		  ( cpls_frm_flg           	[i]);
				model.setRfa_no                 		  ( rfa_no                 	[i]);
				model.setNis_evnt_dt            		  ( nis_evnt_dt            	[i]);
				model.setBank_cd                		  ( bank_cd                	[i]);
				model.setBank_flg               		  ( bank_flg               	[i]);
				model.setPrnt_cnt_cd            		  ( prnt_cnt_cd            	[i]);
				model.setPrnt_cust_seq          		  ( prnt_cust_seq          	[i]);
				model.setPo_no                  		  ( po_no                  	[i]);
				model.setBl_pod_dt              		  ( bl_pod_dt              	[i]);
				model.setSony_inv_desc          		  ( sony_inv_desc          	[i]);
				model.setFinc_inv_no            		  ( finc_inv_no            	[i]);
				model.setRdem_upd_usr_id        		  ( rdem_upd_usr_id        	[i]);
				model.setOtr_doc_upd_usr_id     		  ( otr_doc_upd_usr_id     	[i]);
				model.setIb_doc_upd_usr_id      		  ( ib_doc_upd_usr_id      	[i]);
				model.setFrt_sts_upd_usr_id     		  ( frt_sts_upd_usr_id     	[i]);
				model.setNvocc_file_no          		  ( nvocc_file_no          	[i]);
				model.setHus_bl_ttl_knt         		  ( hus_bl_ttl_knt         	[i]);
				model.setBlck_bl_flg            		  ( blck_bl_flg            	[i]);
				model.setUblck_usr_id           		  ( ublck_usr_id           	[i]);
				model.setUblck_dt               		  ( ublck_dt               	[i]);
				model.setBl_ublck_dt            		  ( bl_ublck_dt            	[i]);
				model.setCnd_nvocc_no           		  ( cnd_nvocc_no           	[i]);
				model.setDept_no                		  ( dept_no                	[i]);
				model.setEdo_trk_cd             		  ( edo_trk_cd             	[i]);
				model.setEdo_trk_nm             		  ( edo_trk_nm             	[i]);
				model.setPkl_shpr_call_no       		  ( pkl_shpr_call_no       	[i]);
				model.setVsl_ref_no             		  ( vsl_ref_no             	[i]);
				model.setBl_cfm_usr_id          		  ( bl_cfm_usr_id          	[i]);
				model.setBl_cfm_dt              		  ( bl_cfm_dt              	[i]);
				model.setBl_cfm_flg             		  ( bl_cfm_flg             	[i]);
				model.setDo_asgn_pre_rmk        		  ( do_asgn_pre_rmk        	[i]);
				model.setBkg_alt_cust_cfm_flg   		  ( bkg_alt_cust_cfm_flg   	[i]);
				model.setSc_act_cust_cnt_cd     		  ( sc_act_cust_cnt_cd     	[i]);
				model.setSc_act_cust_seq        		  ( sc_act_cust_seq        	[i]);
				model.setAll_mtr_flg            		  ( all_mtr_flg            	[i]);
				model.setAll_mtr_chg_flg        		  ( all_mtr_chg_flg        	[i]);
				model.setBkg_split_rto        		  	  ( bkg_split_rto        	[i]); //2007 12 06 hyunsu added 
				model.setEai_evnt_dt            		  ( eai_evnt_dt            	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}

	// toString() method is overriding ..
	public String toString() {
		StringBuffer ret = new StringBuffer();
		Field[] field = this.getClass().getDeclaredFields();
		String space="                              ";
		try {
			for (int i = 0; i < field.length; i++) {
				String[] arr=null;
				try {
					arr = (String[]) field[i].get(this);
				}catch(Exception ex) {
					arr=new String[1];
					arr[0]=String.valueOf(field[i].get(this));
				}
				if (arr != null) {
					for (int j = 0; j < arr.length; j++) {
						ret.append(field[i].getName().concat(space).substring(0,30).concat("= ") + arr[j] +"\n");
					}
				} else {
					ret.append(field[i].getName() + " =  null \n");
				}
			}
		} catch (Exception ex) {}
		return ret.toString();
	}

}  
