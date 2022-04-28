/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : BKG_BOOKING.java
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
public final class BKG_BOOKING implements java.io.Serializable {

	private String                   ibflag                   = "";
	private String                   page_rows                = "";
	private String                   bkg_no                   = "";
	private String                   bkg_no_split             = "";
	private String                   vsl_cd                   = "";
	private String                   skd_voy_no               = "";
	private String                   skd_dir_cd               = "";
	private String                   slan_cd                  = "";
	private String                   por_cd                   = "";
	private String                   pol_cd                   = "";
	private String                   pod_cd                   = "";
	private String                   del_cd                   = "";
	private String                   pre_rly_port_cd          = "";
	private String                   pst_rly_port_cd          = "";
	private String                   bkg_ofc_cd               = "";
	private String                   rhq_cd                   = "";
	private String                   rgn_ofc_cd               = "";
	private String                   bkg_sls_ofc_cd           = "";
	private String                   bkg_ib_sls_ofc_cd        = "";
	private String                   bkg_split_cd             = "";
	private String                   bkg_doc_usr_id           = "";
	private String                   bkg_cre_dt               = "";
	private String                   sl_rep_cd                = "";
	private String                   bkg_sts_cd               = "";
	private String                   bkg_wt_rsn_cd            = "";
	private String                   bkg_cntr_rsn_flg         = "";
	private String                   bkg_prohi_cmdt_rsn_flg   = "";
	private String                   bkg_not_net_rev_rsn_flg  = "";
	private String                   bkg_dg_cgo_auth_rsn_flg  = "";
	private String                   bkg_awk_cgo_auth_rsn_flg = "";
	private String                   bkg_prohi_dest_rsn_flg   = "";
	private String                   bkg_rc_rsn_flg           = "";
	private String                   bkg_bb_rsn_flg           = "";
	private String                   bkg_fcty_rsn_flg         = "";
	private String                   bkg_otr_rsn_flg          = "";
	private String                   bkg_rqst_dt              = "";
	private String                   bkg_cgo_tp_cd            = "";
	private String                   bkg_adv_shtg_cd          = "";
	private String                   bkg_hot_de_flg           = "";
	private String                   nvocc_cd                 = "";
	private String                   rcv_term_cd              = "";
	private String                   bkg_rcv_dor_cd           = "";
	private String                   de_term_cd               = "";
	private String                   bkg_de_dor_cd            = "";
	private String                   bkg_fnl_dest_cd          = "";
	private String                   bkg_ocp_cd               = "";
	private String                   cmdt_cd                  = "";
	private String                   cmdt_dtl_cd              = "";
	private String                   rep_cmdt_cd              = "";
	private String                   spcl_dg_cgo_flg          = "";
	private String                   spcl_rc_flg              = "";
	private String                   spcl_awk_cgo_flg         = "";
	private String                   spcl_bb_cgo_flg          = "";
	private String                   spcl_rd_cgo_flg          = "";
	private String                   pck_qty                  = "";
	private String                   pck_tp_cd                = "";
	private String                   bkg_meas_qty             = "";
	private String                   bkg_meas_tp_cd           = "";
	private String                   act_bkg_wgt              = "";
	private String                   act_bkg_wgt_tp_cd        = "";
	private String                   estm_bkg_wgt             = "";
	private String                   estm_bkg_wgt_tp_cd       = "";
	private String                   lc_no                    = "";
	private String                   bkg_edi_ref_no           = "";
	private String                   org_svc_mod_cd           = "";
	private String                   dest_svc_mod_cd          = "";
	private String                   twn_so_no                = "";
	private String                   scac_no                  = "";
	private String                   bkg_rmk                  = "";
	private String                   spcl_cgo_auth_seq        = "";
	private String                   bl_no                    = "";
	private String                   bl_no_tp                 = "";
	private String                   bl_no_chk                = "";
	private String                   bl_tp_cd                 = "";
	private String                   bkg_cxl_dt               = "";
	private String                   bkg_pson_nm              = "";
	private String                   bkg_pson_telcm_no        = "";
	private String                   bkg_pson_fax_no          = "";
	private String                   bkg_pson_eml             = "";
	private String                   bkg_hot_de_dt            = "";
	private String                   bkg_org_rout_cd          = "";
	private String                   dest_rout_cd             = "";
	private String                   psa_no                   = "";
	private String                   ref_no                   = "";
	private String                   qurn_no                  = "";
	private String                   qurn_nm                  = "";
	private String                   sr_flg                   = "";
	private String                   ib_trns_flg              = "";
	private String                   bkg_bd_tp_cd             = "";
	private String                   bkg_bd_cd                = "";
	private String                   wr_hus_cd                = "";
	private String                   bkg_cgo_dt               = "";
	private String                   bkg_hngr_flg             = "";
	private String                   bkg_shpr_ownr_flg        = "";
	private String                   eq_subst_flg             = "";
	private String                   org_hlg_flg              = "";
	private String                   dest_hlg_flg             = "";
	private String                   pkup_loc_cd              = "";
	private String                   pkup_yd_cd               = "";
	private String                   pkup_dt                  = "";
	private String                   rtn_loc_cd               = "";
	private String                   rtn_yd_cd                = "";
	private String                   cntr_lst_cfm_dt          = "";
	private String                   bkg_lst_cfm_usr_id       = "";
	private String                   bkg_rt_aply_dt           = "";
	private String                   cbf_flg                  = "";
	private String                   cbf_itm_chk_flg          = "";
	private String                   bkg_bdr_dt               = "";
	private String                   bkg_bdr_cng_flg          = "";
	private String                   bkg_bdr_flg              = "";
	private String                   bkg_cntr_mf_cfm_flg      = "";
	private String                   hcos_bkg_no              = "";
	private String                   hcos_bkg_no_split        = "";
	private String                   bkg_gen_cd               = "";
	private String                   bkg_cntr_frm_flg         = "";
	private String                   bkg_cfm_snt_flg          = "";
	private String                   bkg_cfm_snt_dt           = "";
	private String                   bkg_frt_fwrd_flg         = "";
	private String                   bkg_lst_ca_iss_dt        = "";
	private String                   cmb_bkg_no               = "";
	private String                   cmb_bkg_no_split         = "";
	private String                   finc_dir_cd              = "";
	private String                   bkg_cbf_auth_flg         = "";
	private String                   bkg_shpr_xpt_decl_cd     = "";
	private String                   bkg_agn_cd               = "";
	private String                   eq_ctrl_ofc_cd           = "";
	private String                   pkup_loc_yd_cd           = "";
	private String                   bkg_corr_no              = "";
	private String                   ca_usr_id                = "";
	private String                   bkg_corr_ofc_cd          = "";
	private String                   corr_dt                  = "";
	private String                   bl_prn_wgt_flg           = "";
	private String                   bkg_cre_flg              = "";
	private String                   oop_loc_cd               = "";
	private String                   pfd_loc_cd               = "";
	private String                   dbl_bkg_flg              = "";
	private String                   ap_brog_flg              = "";
	private String                   bis_sys_flg              = "";
	private String                   nis_evnt_dt              = "";
	private String                   bkg_xter_rmk             = "";
	private String                   xter_bkg_cd              = "";
	private String                   bkg_rev_aud_flg          = "";
	private String                   spcl_hide_flg            = "";
	private String                   cust_rlse_flg            = "";
	private String                   cdr_cng_flg              = "";
	private String                   rcdr_dt                  = "";
	private String                   cdr_vsl_cd               = "";
	private String                   cdr_skd_voy_no           = "";
	private String                   cdr_skd_dir_cd           = "";
	private String                   cdr_pol_cd               = "";
	private String                   mty_bkg_cd               = "";
	private String                   cdr_dchg_port_cd         = "";
	private String                   bkg_pod_tml_cd           = "";
	private String                   fd_grd_flg               = "";
	private String                   org_trns_mod_cd          = "";
	private String                   dest_trns_mod_cd         = "";
	private String                   rail_blk_flg             = "";
	private String                   rail_blk_cd              = "";
	private String                   mcntr_dor_arr_dt         = "";
	private String                   lodg_due_dt              = "";
	private String                   de_due_dt                = "";
	private String                   por_zn_cd                = "";
	private String                   del_zn_cd                = "";
	private String                   pctl_no                  = "";
	private String                   und_cm_flg               = "";
	private String                   eai_evnt_dt              = "";
	
	//추가(20070416)
	private String					 spcl_prct_cgo_flg		  = "";
	private String					 cntr_full_pkup_loc_cd	  = "";
	private String 					 cntr_full_pkup_yd_cd 	  = "";
	private String					 ctrt_ofc_cd			  = "";
	private String					 ctrt_srep_cd			  = "";

	// 추가(20070419)
	private String				 	 ib_del_de_dt             = "";
	private String				 	 ib_mty_rtn_yd_cd     	  = "";
	private String				 	 bl_mst_bkg_no            = "";
	private String				 	 bl_mst_bkg_no_split      = "";
	
	// 2008 03 07 
	private String				 	 blck_stwg_cd      		  = "";
	
	// 2008 04 18 hyunsu added 
	private String				 	 cntr_tpsz_mix_flg        = "";
	
	//2009.01.15 add
	private String					 pol_zone_cd 			  = "";
	
	public BKG_BOOKING(){}

	public BKG_BOOKING(
			String                   ibflag                  ,
			String                   page_rows               ,
			String                   bkg_no                  ,
			String                   bkg_no_split            ,
			String                   vsl_cd                  ,
			String                   skd_voy_no              ,
			String                   skd_dir_cd              ,
			String                   slan_cd                 ,
			String                   por_cd                  ,
			String                   pol_cd                  ,
			String                   pod_cd                  ,
			String                   del_cd                  ,
			String                   pre_rly_port_cd         ,
			String                   pst_rly_port_cd         ,
			String                   bkg_ofc_cd              ,
			String                   rhq_cd                  ,
			String                   rgn_ofc_cd              ,
			String                   bkg_sls_ofc_cd          ,
			String                   bkg_ib_sls_ofc_cd       ,
			String                   bkg_split_cd            ,
			String                   bkg_doc_usr_id          ,
			String                   bkg_cre_dt              ,
			String                   sl_rep_cd               ,
			String                   bkg_sts_cd              ,
			String                   bkg_wt_rsn_cd           ,
			String                   bkg_cntr_rsn_flg        ,
			String                   bkg_prohi_cmdt_rsn_flg  ,
			String                   bkg_not_net_rev_rsn_flg ,
			String                   bkg_dg_cgo_auth_rsn_flg ,
			String                   bkg_awk_cgo_auth_rsn_flg,
			String                   bkg_prohi_dest_rsn_flg  ,
			String                   bkg_rc_rsn_flg          ,
			String                   bkg_bb_rsn_flg          ,
			String                   bkg_fcty_rsn_flg        ,
			String                   bkg_otr_rsn_flg         ,
			String                   bkg_rqst_dt             ,
			String                   bkg_cgo_tp_cd           ,
			String                   bkg_adv_shtg_cd         ,
			String                   bkg_hot_de_flg          ,
			String                   nvocc_cd                ,
			String                   rcv_term_cd             ,
			String                   bkg_rcv_dor_cd          ,
			String                   de_term_cd              ,
			String                   bkg_de_dor_cd           ,
			String                   bkg_fnl_dest_cd         ,
			String                   bkg_ocp_cd              ,
			String                   cmdt_cd                 ,
			String                   cmdt_dtl_cd             ,
			String                   rep_cmdt_cd             ,
			String                   spcl_dg_cgo_flg         ,
			String                   spcl_rc_flg             ,
			String                   spcl_awk_cgo_flg        ,
			String                   spcl_bb_cgo_flg         ,
			String                   spcl_rd_cgo_flg         ,
			String                   pck_qty                 ,
			String                   pck_tp_cd               ,
			String                   bkg_meas_qty            ,
			String                   bkg_meas_tp_cd          ,
			String                   act_bkg_wgt             ,
			String                   act_bkg_wgt_tp_cd       ,
			String                   estm_bkg_wgt            ,
			String                   estm_bkg_wgt_tp_cd      ,
			String                   lc_no                   ,
			String                   bkg_edi_ref_no          ,
			String                   org_svc_mod_cd          ,
			String                   dest_svc_mod_cd         ,
			String                   twn_so_no               ,
			String                   scac_no                 ,
			String                   bkg_rmk                 ,
			String                   spcl_cgo_auth_seq       ,
			String                   bl_no                   ,
			String                   bl_no_tp                ,
			String                   bl_no_chk               ,
			String                   bl_tp_cd                ,
			String                   bkg_cxl_dt              ,
			String                   bkg_pson_nm             ,
			String                   bkg_pson_telcm_no       ,
			String                   bkg_pson_fax_no         ,
			String                   bkg_pson_eml            ,
			String                   bkg_hot_de_dt           ,
			String                   bkg_org_rout_cd         ,
			String                   dest_rout_cd            ,
			String                   psa_no                  ,
			String                   ref_no                  ,
			String                   qurn_no                 ,
			String                   qurn_nm                 ,
			String                   sr_flg                  ,
			String                   ib_trns_flg             ,
			String                   bkg_bd_tp_cd            ,
			String                   bkg_bd_cd               ,
			String                   wr_hus_cd               ,
			String                   bkg_cgo_dt              ,
			String                   bkg_hngr_flg            ,
			String                   bkg_shpr_ownr_flg       ,
			String                   eq_subst_flg            ,
			String                   org_hlg_flg             ,
			String                   dest_hlg_flg            ,
			String                   pkup_loc_cd             ,
			String                   pkup_yd_cd              ,
			String                   pkup_dt                 ,
			String                   rtn_loc_cd              ,
			String                   rtn_yd_cd               ,
			String                   cntr_lst_cfm_dt         ,
			String                   bkg_lst_cfm_usr_id      ,
			String                   bkg_rt_aply_dt          ,
			String                   cbf_flg                 ,
			String                   cbf_itm_chk_flg         ,
			String                   bkg_bdr_dt              ,
			String                   bkg_bdr_cng_flg         ,
			String                   bkg_bdr_flg             ,
			String                   bkg_cntr_mf_cfm_flg     ,
			String                   hcos_bkg_no             ,
			String                   hcos_bkg_no_split       ,
			String                   bkg_gen_cd              ,
			String                   bkg_cntr_frm_flg        ,
			String                   bkg_cfm_snt_flg         ,
			String                   bkg_cfm_snt_dt          ,
			String                   bkg_frt_fwrd_flg        ,
			String                   bkg_lst_ca_iss_dt       ,
			String                   cmb_bkg_no              ,
			String                   cmb_bkg_no_split        ,
			String                   finc_dir_cd             ,
			String                   bkg_cbf_auth_flg        ,
			String                   bkg_shpr_xpt_decl_cd    ,
			String                   bkg_agn_cd              ,
			String                   eq_ctrl_ofc_cd          ,
			String                   pkup_loc_yd_cd          ,
			String                   bkg_corr_no             ,
			String                   ca_usr_id               ,
			String                   bkg_corr_ofc_cd         ,
			String                   corr_dt                 ,
			String                   bl_prn_wgt_flg          ,
			String                   bkg_cre_flg             ,
			String                   oop_loc_cd              ,
			String                   pfd_loc_cd              ,
			String                   dbl_bkg_flg             ,
			String                   ap_brog_flg             ,
			String                   bis_sys_flg             ,
			String                   nis_evnt_dt             ,
			String                   bkg_xter_rmk            ,
			String                   xter_bkg_cd             ,
			String                   bkg_rev_aud_flg         ,
			String                   spcl_hide_flg           ,
			String                   cust_rlse_flg           ,
			String                   cdr_cng_flg             ,
			String                   rcdr_dt                 ,
			String                   cdr_vsl_cd              ,
			String                   cdr_skd_voy_no          ,
			String                   cdr_skd_dir_cd          ,
			String                   cdr_pol_cd              ,
			String                   mty_bkg_cd              ,
			String                   cdr_dchg_port_cd        ,
			String                   bkg_pod_tml_cd          ,
			String                   fd_grd_flg              ,
			String                   org_trns_mod_cd         ,
			String                   dest_trns_mod_cd        ,
			String                   rail_blk_flg            ,
			String                   rail_blk_cd             ,
			String                   mcntr_dor_arr_dt        ,
			String                   lodg_due_dt             ,
			String                   de_due_dt               ,
			String                   por_zn_cd               ,
			String                   del_zn_cd               ,
			String                   pctl_no                 ,
			String                   und_cm_flg              ,
			String                   eai_evnt_dt             ,
			String					 spcl_prct_cgo_flg		 ,
			String					 cntr_full_pkup_loc_cd	 ,
			String 					 cntr_full_pkup_yd_cd	 ,
			String					 ctrt_ofc_cd			 ,
			String					 ctrt_srep_cd			 ,
			String				 	 ib_del_de_dt			 ,
			String				 	 ib_mty_rtn_yd_cd	 ,
			String				 	 bl_mst_bkg_no			 ,
			String				 	 bl_mst_bkg_no_split,
			String				 	 pol_zone_cd,
			String 					 blck_stwg_cd,					// 2008 03 07 hyunsu added
			String					 cntr_tpsz_mix_flg ){			// 2008 04 18 hyunsu added
		this.ibflag                   = ibflag                  ;
		this.page_rows                = page_rows               ;
		this.bkg_no                   = bkg_no                  ;
		this.bkg_no_split             = bkg_no_split            ;
		this.vsl_cd                   = vsl_cd                  ;
		this.skd_voy_no               = skd_voy_no              ;
		this.skd_dir_cd               = skd_dir_cd              ;
		this.slan_cd                  = slan_cd                 ;
		this.por_cd                   = por_cd                  ;
		this.pol_cd                   = pol_cd                  ;
		this.pod_cd                   = pod_cd                  ;
		this.del_cd                   = del_cd                  ;
		this.pre_rly_port_cd          = pre_rly_port_cd         ;
		this.pst_rly_port_cd          = pst_rly_port_cd         ;
		this.bkg_ofc_cd               = bkg_ofc_cd              ;
		this.rhq_cd                   = rhq_cd                  ;
		this.rgn_ofc_cd               = rgn_ofc_cd              ;
		this.bkg_sls_ofc_cd           = bkg_sls_ofc_cd          ;
		this.bkg_ib_sls_ofc_cd        = bkg_ib_sls_ofc_cd       ;
		this.bkg_split_cd             = bkg_split_cd            ;
		this.bkg_doc_usr_id           = bkg_doc_usr_id          ;
		this.bkg_cre_dt               = bkg_cre_dt              ;
		this.sl_rep_cd                = sl_rep_cd               ;
		this.bkg_sts_cd               = bkg_sts_cd              ;
		this.bkg_wt_rsn_cd            = bkg_wt_rsn_cd           ;
		this.bkg_cntr_rsn_flg         = bkg_cntr_rsn_flg        ;
		this.bkg_prohi_cmdt_rsn_flg   = bkg_prohi_cmdt_rsn_flg  ;
		this.bkg_not_net_rev_rsn_flg  = bkg_not_net_rev_rsn_flg ;
		this.bkg_dg_cgo_auth_rsn_flg  = bkg_dg_cgo_auth_rsn_flg ;
		this.bkg_awk_cgo_auth_rsn_flg = bkg_awk_cgo_auth_rsn_flg;
		this.bkg_prohi_dest_rsn_flg   = bkg_prohi_dest_rsn_flg  ;
		this.bkg_rc_rsn_flg           = bkg_rc_rsn_flg          ;
		this.bkg_bb_rsn_flg           = bkg_bb_rsn_flg          ;
		this.bkg_fcty_rsn_flg         = bkg_fcty_rsn_flg        ;
		this.bkg_otr_rsn_flg          = bkg_otr_rsn_flg         ;
		this.bkg_rqst_dt              = bkg_rqst_dt             ;
		this.bkg_cgo_tp_cd            = bkg_cgo_tp_cd           ;
		this.bkg_adv_shtg_cd          = bkg_adv_shtg_cd         ;
		this.bkg_hot_de_flg           = bkg_hot_de_flg          ;
		this.nvocc_cd                 = nvocc_cd                ;
		this.rcv_term_cd              = rcv_term_cd             ;
		this.bkg_rcv_dor_cd           = bkg_rcv_dor_cd          ;
		this.de_term_cd               = de_term_cd              ;
		this.bkg_de_dor_cd            = bkg_de_dor_cd           ;
		this.bkg_fnl_dest_cd          = bkg_fnl_dest_cd         ;
		this.bkg_ocp_cd               = bkg_ocp_cd              ;
		this.cmdt_cd                  = cmdt_cd                 ;
		this.cmdt_dtl_cd              = cmdt_dtl_cd             ;
		this.rep_cmdt_cd              = rep_cmdt_cd             ;
		this.spcl_dg_cgo_flg          = spcl_dg_cgo_flg         ;
		this.spcl_rc_flg              = spcl_rc_flg             ;
		this.spcl_awk_cgo_flg         = spcl_awk_cgo_flg        ;
		this.spcl_bb_cgo_flg          = spcl_bb_cgo_flg         ;
		this.spcl_rd_cgo_flg          = spcl_rd_cgo_flg         ;
		this.pck_qty                  = pck_qty                 ;
		this.pck_tp_cd                = pck_tp_cd               ;
		this.bkg_meas_qty             = bkg_meas_qty            ;
		this.bkg_meas_tp_cd           = bkg_meas_tp_cd          ;
		this.act_bkg_wgt              = act_bkg_wgt             ;
		this.act_bkg_wgt_tp_cd        = act_bkg_wgt_tp_cd       ;
		this.estm_bkg_wgt             = estm_bkg_wgt            ;
		this.estm_bkg_wgt_tp_cd       = estm_bkg_wgt_tp_cd      ;
		this.lc_no                    = lc_no                   ;
		this.bkg_edi_ref_no           = bkg_edi_ref_no          ;
		this.org_svc_mod_cd           = org_svc_mod_cd          ;
		this.dest_svc_mod_cd          = dest_svc_mod_cd         ;
		this.twn_so_no                = twn_so_no               ;
		this.scac_no                  = scac_no                 ;
		this.bkg_rmk                  = bkg_rmk                 ;
		this.spcl_cgo_auth_seq        = spcl_cgo_auth_seq       ;
		this.bl_no                    = bl_no                   ;
		this.bl_no_tp                 = bl_no_tp                ;
		this.bl_no_chk                = bl_no_chk               ;
		this.bl_tp_cd                 = bl_tp_cd                ;
		this.bkg_cxl_dt               = bkg_cxl_dt              ;
		this.bkg_pson_nm              = bkg_pson_nm             ;
		this.bkg_pson_telcm_no        = bkg_pson_telcm_no       ;
		this.bkg_pson_fax_no          = bkg_pson_fax_no         ;
		this.bkg_pson_eml             = bkg_pson_eml            ;
		this.bkg_hot_de_dt            = bkg_hot_de_dt           ;
		this.bkg_org_rout_cd          = bkg_org_rout_cd         ;
		this.dest_rout_cd             = dest_rout_cd            ;
		this.psa_no                   = psa_no                  ;
		this.ref_no                   = ref_no                  ;
		this.qurn_no                  = qurn_no                 ;
		this.qurn_nm                  = qurn_nm                 ;
		this.sr_flg                   = sr_flg                  ;
		this.ib_trns_flg              = ib_trns_flg             ;
		this.bkg_bd_tp_cd             = bkg_bd_tp_cd            ;
		this.bkg_bd_cd                = bkg_bd_cd               ;
		this.wr_hus_cd                = wr_hus_cd               ;
		this.bkg_cgo_dt               = bkg_cgo_dt              ;
		this.bkg_hngr_flg             = bkg_hngr_flg            ;
		this.bkg_shpr_ownr_flg        = bkg_shpr_ownr_flg       ;
		this.eq_subst_flg             = eq_subst_flg            ;
		this.org_hlg_flg              = org_hlg_flg             ;
		this.dest_hlg_flg             = dest_hlg_flg            ;
		this.pkup_loc_cd              = pkup_loc_cd             ;
		this.pkup_yd_cd               = pkup_yd_cd              ;
		this.pkup_dt                  = pkup_dt                 ;
		this.rtn_loc_cd               = rtn_loc_cd              ;
		this.rtn_yd_cd                = rtn_yd_cd               ;
		this.cntr_lst_cfm_dt          = cntr_lst_cfm_dt         ;
		this.bkg_lst_cfm_usr_id       = bkg_lst_cfm_usr_id      ;
		this.bkg_rt_aply_dt           = bkg_rt_aply_dt          ;
		this.cbf_flg                  = cbf_flg                 ;
		this.cbf_itm_chk_flg          = cbf_itm_chk_flg         ;
		this.bkg_bdr_dt               = bkg_bdr_dt              ;
		this.bkg_bdr_cng_flg          = bkg_bdr_cng_flg         ;
		this.bkg_bdr_flg              = bkg_bdr_flg             ;
		this.bkg_cntr_mf_cfm_flg      = bkg_cntr_mf_cfm_flg     ;
		this.hcos_bkg_no              = hcos_bkg_no             ;
		this.hcos_bkg_no_split        = hcos_bkg_no_split       ;
		this.bkg_gen_cd               = bkg_gen_cd              ;
		this.bkg_cntr_frm_flg         = bkg_cntr_frm_flg        ;
		this.bkg_cfm_snt_flg          = bkg_cfm_snt_flg         ;
		this.bkg_cfm_snt_dt           = bkg_cfm_snt_dt          ;
		this.bkg_frt_fwrd_flg         = bkg_frt_fwrd_flg        ;
		this.bkg_lst_ca_iss_dt        = bkg_lst_ca_iss_dt       ;
		this.cmb_bkg_no               = cmb_bkg_no              ;
		this.cmb_bkg_no_split         = cmb_bkg_no_split        ;
		this.finc_dir_cd              = finc_dir_cd             ;
		this.bkg_cbf_auth_flg         = bkg_cbf_auth_flg        ;
		this.bkg_shpr_xpt_decl_cd     = bkg_shpr_xpt_decl_cd    ;
		this.bkg_agn_cd               = bkg_agn_cd              ;
		this.eq_ctrl_ofc_cd           = eq_ctrl_ofc_cd          ;
		this.pkup_loc_yd_cd           = pkup_loc_yd_cd          ;
		this.bkg_corr_no              = bkg_corr_no             ;
		this.ca_usr_id                = ca_usr_id               ;
		this.bkg_corr_ofc_cd          = bkg_corr_ofc_cd         ;
		this.corr_dt                  = corr_dt                 ;
		this.bl_prn_wgt_flg           = bl_prn_wgt_flg          ;
		this.bkg_cre_flg              = bkg_cre_flg             ;
		this.oop_loc_cd               = oop_loc_cd              ;
		this.pfd_loc_cd               = pfd_loc_cd              ;
		this.dbl_bkg_flg              = dbl_bkg_flg             ;
		this.ap_brog_flg              = ap_brog_flg             ;
		this.bis_sys_flg              = bis_sys_flg             ;
		this.nis_evnt_dt              = nis_evnt_dt             ;
		this.bkg_xter_rmk             = bkg_xter_rmk            ;
		this.xter_bkg_cd              = xter_bkg_cd             ;
		this.bkg_rev_aud_flg          = bkg_rev_aud_flg         ;
		this.spcl_hide_flg            = spcl_hide_flg           ;
		this.cust_rlse_flg            = cust_rlse_flg           ;
		this.cdr_cng_flg              = cdr_cng_flg             ;
		this.rcdr_dt                  = rcdr_dt                 ;
		this.cdr_vsl_cd               = cdr_vsl_cd              ;
		this.cdr_skd_voy_no           = cdr_skd_voy_no          ;
		this.cdr_skd_dir_cd           = cdr_skd_dir_cd          ;
		this.cdr_pol_cd               = cdr_pol_cd              ;
		this.mty_bkg_cd               = mty_bkg_cd              ;
		this.cdr_dchg_port_cd         = cdr_dchg_port_cd        ;
		this.bkg_pod_tml_cd           = bkg_pod_tml_cd          ;
		this.fd_grd_flg               = fd_grd_flg              ;
		this.org_trns_mod_cd          = org_trns_mod_cd         ;
		this.dest_trns_mod_cd         = dest_trns_mod_cd        ;
		this.rail_blk_flg             = rail_blk_flg            ;
		this.rail_blk_cd              = rail_blk_cd             ;
		this.mcntr_dor_arr_dt         = mcntr_dor_arr_dt        ;
		this.lodg_due_dt              = lodg_due_dt             ;
		this.de_due_dt                = de_due_dt               ;
		this.por_zn_cd                = por_zn_cd               ;
		this.del_zn_cd                = del_zn_cd               ;
		this.pctl_no                  = pctl_no                 ;
		this.und_cm_flg               = und_cm_flg              ;
		this.eai_evnt_dt              = eai_evnt_dt             ;
		this.spcl_prct_cgo_flg		  = spcl_prct_cgo_flg		;
		this.cntr_full_pkup_loc_cd    = cntr_full_pkup_loc_cd	;
		this.cntr_full_pkup_yd_cd	  = cntr_full_pkup_yd_cd	;
		this.ctrt_ofc_cd			  = ctrt_ofc_cd				;
		this.ctrt_srep_cd			  = ctrt_srep_cd			;
		this.ib_del_de_dt			  = ib_del_de_dt			;
		this.ib_mty_rtn_yd_cd	  	  = ib_mty_rtn_yd_cd		;
		this.bl_mst_bkg_no			  = bl_mst_bkg_no			;
		this.bl_mst_bkg_no_split	  = bl_mst_bkg_no_split		;
		this.pol_zone_cd			  = pol_zone_cd				;
		this.blck_stwg_cd 			  = blck_stwg_cd    		;		// 2008 03 07 hyunsu added 
		this.cntr_tpsz_mix_flg		  = cntr_tpsz_mix_flg		;		// 2008 04 18 hyunsu added 
	}
	
	// getter method is proceeding ..
	public String                   getIbflag                  (){	return ibflag                  	;	}
	public String                   getPage_rows               (){	return page_rows               	;	}
	public String                   getBkg_no                  (){	return bkg_no                  	;	}
	public String                   getBkg_no_split            (){	return bkg_no_split            	;	}
	public String                   getVsl_cd                  (){	return vsl_cd                  	;	}
	public String                   getSkd_voy_no              (){	return skd_voy_no              	;	}
	public String                   getSkd_dir_cd              (){	return skd_dir_cd              	;	}
	public String                   getSlan_cd                 (){	return slan_cd                 	;	}
	public String                   getPor_cd                  (){	return por_cd                  	;	}
	public String                   getPol_cd                  (){	return pol_cd                  	;	}
	public String                   getPod_cd                  (){	return pod_cd                  	;	}
	public String                   getDel_cd                  (){	return del_cd                  	;	}
	public String                   getPre_rly_port_cd         (){	return pre_rly_port_cd         	;	}
	public String                   getPst_rly_port_cd         (){	return pst_rly_port_cd         	;	}
	public String                   getBkg_ofc_cd              (){	return bkg_ofc_cd              	;	}
	public String                   getRhq_cd                  (){	return rhq_cd                  	;	}
	public String                   getRgn_ofc_cd              (){	return rgn_ofc_cd              	;	}
	public String                   getBkg_sls_ofc_cd          (){	return bkg_sls_ofc_cd          	;	}
	public String                   getBkg_ib_sls_ofc_cd       (){	return bkg_ib_sls_ofc_cd       	;	}
	public String                   getBkg_split_cd            (){	return bkg_split_cd            	;	}
	public String                   getBkg_doc_usr_id          (){	return bkg_doc_usr_id          	;	}
	public String                   getBkg_cre_dt              (){	return bkg_cre_dt              	;	}
	public String                   getSl_rep_cd               (){	return sl_rep_cd               	;	}
	public String                   getBkg_sts_cd              (){	return bkg_sts_cd              	;	}
	public String                   getBkg_wt_rsn_cd           (){	return bkg_wt_rsn_cd           	;	}
	public String                   getBkg_cntr_rsn_flg        (){	return bkg_cntr_rsn_flg        	;	}
	public String                   getBkg_prohi_cmdt_rsn_flg  (){	return bkg_prohi_cmdt_rsn_flg  	;	}
	public String                   getBkg_not_net_rev_rsn_flg (){	return bkg_not_net_rev_rsn_flg 	;	}
	public String                   getBkg_dg_cgo_auth_rsn_flg (){	return bkg_dg_cgo_auth_rsn_flg 	;	}
	public String                   getBkg_awk_cgo_auth_rsn_flg(){	return bkg_awk_cgo_auth_rsn_flg	;	}
	public String                   getBkg_prohi_dest_rsn_flg  (){	return bkg_prohi_dest_rsn_flg  	;	}
	public String                   getBkg_rc_rsn_flg          (){	return bkg_rc_rsn_flg          	;	}
	public String                   getBkg_bb_rsn_flg          (){	return bkg_bb_rsn_flg          	;	}
	public String                   getBkg_fcty_rsn_flg        (){	return bkg_fcty_rsn_flg        	;	}
	public String                   getBkg_otr_rsn_flg         (){	return bkg_otr_rsn_flg         	;	}
	public String                   getBkg_rqst_dt             (){	return bkg_rqst_dt             	;	}
	public String                   getBkg_cgo_tp_cd           (){	return bkg_cgo_tp_cd           	;	}
	public String                   getBkg_adv_shtg_cd         (){	return bkg_adv_shtg_cd         	;	}
	public String                   getBkg_hot_de_flg          (){	return bkg_hot_de_flg          	;	}
	public String                   getNvocc_cd                (){	return nvocc_cd                	;	}
	public String                   getRcv_term_cd             (){	return rcv_term_cd             	;	}
	public String                   getBkg_rcv_dor_cd          (){	return bkg_rcv_dor_cd          	;	}
	public String                   getDe_term_cd              (){	return de_term_cd              	;	}
	public String                   getBkg_de_dor_cd           (){	return bkg_de_dor_cd           	;	}
	public String                   getBkg_fnl_dest_cd         (){	return bkg_fnl_dest_cd         	;	}
	public String                   getBkg_ocp_cd              (){	return bkg_ocp_cd              	;	}
	public String                   getCmdt_cd                 (){	return cmdt_cd                 	;	}
	public String                   getCmdt_dtl_cd             (){	return cmdt_dtl_cd             	;	}
	public String                   getRep_cmdt_cd             (){	return rep_cmdt_cd             	;	}
	public String                   getSpcl_dg_cgo_flg         (){	return spcl_dg_cgo_flg         	;	}
	public String                   getSpcl_rc_flg             (){	return spcl_rc_flg             	;	}
	public String                   getSpcl_awk_cgo_flg        (){	return spcl_awk_cgo_flg        	;	}
	public String                   getSpcl_bb_cgo_flg         (){	return spcl_bb_cgo_flg         	;	}
	public String                   getSpcl_rd_cgo_flg         (){	return spcl_rd_cgo_flg         	;	}
	public String                   getPck_qty                 (){	return pck_qty                 	;	}
	public String                   getPck_tp_cd               (){	return pck_tp_cd               	;	}
	public String                   getBkg_meas_qty            (){	return bkg_meas_qty            	;	}
	public String                   getBkg_meas_tp_cd          (){	return bkg_meas_tp_cd          	;	}
	public String                   getAct_bkg_wgt             (){	return act_bkg_wgt             	;	}
	public String                   getAct_bkg_wgt_tp_cd       (){	return act_bkg_wgt_tp_cd       	;	}
	public String                   getEstm_bkg_wgt            (){	return estm_bkg_wgt            	;	}
	public String                   getEstm_bkg_wgt_tp_cd      (){	return estm_bkg_wgt_tp_cd      	;	}
	public String                   getLc_no                   (){	return lc_no                   	;	}
	public String                   getBkg_edi_ref_no          (){	return bkg_edi_ref_no          	;	}
	public String                   getOrg_svc_mod_cd          (){	return org_svc_mod_cd          	;	}
	public String                   getDest_svc_mod_cd         (){	return dest_svc_mod_cd         	;	}
	public String                   getTwn_so_no               (){	return twn_so_no               	;	}
	public String                   getScac_no                 (){	return scac_no                 	;	}
	public String                   getBkg_rmk                 (){	return bkg_rmk                 	;	}
	public String                   getSpcl_cgo_auth_seq       (){	return spcl_cgo_auth_seq       	;	}
	public String                   getBl_no                   (){	return bl_no                   	;	}
	public String                   getBl_no_tp                (){	return bl_no_tp                	;	}
	public String                   getBl_no_chk               (){	return bl_no_chk               	;	}
	public String                   getBl_tp_cd                (){	return bl_tp_cd                	;	}
	public String                   getBkg_cxl_dt              (){	return bkg_cxl_dt              	;	}
	public String                   getBkg_pson_nm             (){	return bkg_pson_nm             	;	}
	public String                   getBkg_pson_telcm_no       (){	return bkg_pson_telcm_no       	;	}
	public String                   getBkg_pson_fax_no         (){	return bkg_pson_fax_no         	;	}
	public String                   getBkg_pson_eml            (){	return bkg_pson_eml            	;	}
	public String                   getBkg_hot_de_dt           (){	return bkg_hot_de_dt           	;	}
	public String                   getBkg_org_rout_cd         (){	return bkg_org_rout_cd         	;	}
	public String                   getDest_rout_cd            (){	return dest_rout_cd            	;	}
	public String                   getPsa_no                  (){	return psa_no                  	;	}
	public String                   getRef_no                  (){	return ref_no                  	;	}
	public String                   getQurn_no                 (){	return qurn_no                 	;	}
	public String                   getQurn_nm                 (){	return qurn_nm                 	;	}
	public String                   getSr_flg                  (){	return sr_flg                  	;	}
	public String                   getIb_trns_flg             (){	return ib_trns_flg             	;	}
	public String                   getBkg_bd_tp_cd            (){	return bkg_bd_tp_cd            	;	}
	public String                   getBkg_bd_cd               (){	return bkg_bd_cd               	;	}
	public String                   getWr_hus_cd               (){	return wr_hus_cd               	;	}
	public String                   getBkg_cgo_dt              (){	return bkg_cgo_dt              	;	}
	public String                   getBkg_hngr_flg            (){	return bkg_hngr_flg            	;	}
	public String                   getBkg_shpr_ownr_flg       (){	return bkg_shpr_ownr_flg       	;	}
	public String                   getEq_subst_flg            (){	return eq_subst_flg            	;	}
	public String                   getOrg_hlg_flg             (){	return org_hlg_flg             	;	}
	public String                   getDest_hlg_flg            (){	return dest_hlg_flg            	;	}
	public String                   getPkup_loc_cd             (){	return pkup_loc_cd             	;	}
	public String                   getPkup_yd_cd              (){	return pkup_yd_cd              	;	}
	public String                   getPkup_dt                 (){	return pkup_dt                 	;	}
	public String                   getRtn_loc_cd              (){	return rtn_loc_cd              	;	}
	public String                   getRtn_yd_cd               (){	return rtn_yd_cd               	;	}
	public String                   getCntr_lst_cfm_dt         (){	return cntr_lst_cfm_dt         	;	}
	public String                   getBkg_lst_cfm_usr_id      (){	return bkg_lst_cfm_usr_id      	;	}
	public String                   getBkg_rt_aply_dt          (){	return bkg_rt_aply_dt          	;	}
	public String                   getCbf_flg                 (){	return cbf_flg                 	;	}
	public String                   getCbf_itm_chk_flg         (){	return cbf_itm_chk_flg         	;	}
	public String                   getBkg_bdr_dt              (){	return bkg_bdr_dt              	;	}
	public String                   getBkg_bdr_cng_flg         (){	return bkg_bdr_cng_flg         	;	}
	public String                   getBkg_bdr_flg             (){	return bkg_bdr_flg             	;	}
	public String                   getBkg_cntr_mf_cfm_flg     (){	return bkg_cntr_mf_cfm_flg     	;	}
	public String                   getHcos_bkg_no             (){	return hcos_bkg_no             	;	}
	public String                   getHcos_bkg_no_split       (){	return hcos_bkg_no_split       	;	}
	public String                   getBkg_gen_cd              (){	return bkg_gen_cd              	;	}
	public String                   getBkg_cntr_frm_flg        (){	return bkg_cntr_frm_flg        	;	}
	public String                   getBkg_cfm_snt_flg         (){	return bkg_cfm_snt_flg         	;	}
	public String                   getBkg_cfm_snt_dt          (){	return bkg_cfm_snt_dt          	;	}
	public String                   getBkg_frt_fwrd_flg        (){	return bkg_frt_fwrd_flg        	;	}
	public String                   getBkg_lst_ca_iss_dt       (){	return bkg_lst_ca_iss_dt       	;	}
	public String                   getCmb_bkg_no              (){	return cmb_bkg_no              	;	}
	public String                   getCmb_bkg_no_split        (){	return cmb_bkg_no_split        	;	}
	public String                   getFinc_dir_cd             (){	return finc_dir_cd             	;	}
	public String                   getBkg_cbf_auth_flg        (){	return bkg_cbf_auth_flg        	;	}
	public String                   getBkg_shpr_xpt_decl_cd    (){	return bkg_shpr_xpt_decl_cd    	;	}
	public String                   getBkg_agn_cd              (){	return bkg_agn_cd              	;	}
	public String                   getEq_ctrl_ofc_cd          (){	return eq_ctrl_ofc_cd          	;	}
	public String                   getPkup_loc_yd_cd          (){	return pkup_loc_yd_cd          	;	}
	public String                   getBkg_corr_no             (){	return bkg_corr_no             	;	}
	public String                   getCa_usr_id               (){	return ca_usr_id               	;	}
	public String                   getBkg_corr_ofc_cd         (){	return bkg_corr_ofc_cd         	;	}
	public String                   getCorr_dt                 (){	return corr_dt                 	;	}
	public String                   getBl_prn_wgt_flg          (){	return bl_prn_wgt_flg          	;	}
	public String                   getBkg_cre_flg             (){	return bkg_cre_flg             	;	}
	public String                   getOop_loc_cd              (){	return oop_loc_cd              	;	}
	public String                   getPfd_loc_cd              (){	return pfd_loc_cd              	;	}
	public String                   getDbl_bkg_flg             (){	return dbl_bkg_flg             	;	}
	public String                   getAp_brog_flg             (){	return ap_brog_flg             	;	}
	public String                   getBis_sys_flg             (){	return bis_sys_flg             	;	}
	public String                   getNis_evnt_dt             (){	return nis_evnt_dt             	;	}
	public String                   getBkg_xter_rmk            (){	return bkg_xter_rmk            	;	}
	public String                   getXter_bkg_cd             (){	return xter_bkg_cd             	;	}
	public String                   getBkg_rev_aud_flg         (){	return bkg_rev_aud_flg         	;	}
	public String                   getSpcl_hide_flg           (){	return spcl_hide_flg           	;	}
	public String                   getCust_rlse_flg           (){	return cust_rlse_flg           	;	}
	public String                   getCdr_cng_flg             (){	return cdr_cng_flg             	;	}
	public String                   getRcdr_dt                 (){	return rcdr_dt                 	;	}
	public String                   getCdr_vsl_cd              (){	return cdr_vsl_cd              	;	}
	public String                   getCdr_skd_voy_no          (){	return cdr_skd_voy_no          	;	}
	public String                   getCdr_skd_dir_cd          (){	return cdr_skd_dir_cd          	;	}
	public String                   getCdr_pol_cd              (){	return cdr_pol_cd              	;	}
	public String                   getMty_bkg_cd              (){	return mty_bkg_cd              	;	}
	public String                   getCdr_dchg_port_cd        (){	return cdr_dchg_port_cd        	;	}
	public String                   getBkg_pod_tml_cd          (){	return bkg_pod_tml_cd          	;	}
	public String                   getFd_grd_flg              (){	return fd_grd_flg              	;	}
	public String                   getOrg_trns_mod_cd         (){	return org_trns_mod_cd         	;	}
	public String                   getDest_trns_mod_cd        (){	return dest_trns_mod_cd        	;	}
	public String                   getRail_blk_flg            (){	return rail_blk_flg            	;	}
	public String                   getRail_blk_cd             (){	return rail_blk_cd             	;	}
	public String                   getMcntr_dor_arr_dt        (){	return mcntr_dor_arr_dt        	;	}
	public String                   getLodg_due_dt             (){	return lodg_due_dt             	;	}
	public String                   getDe_due_dt               (){	return de_due_dt               	;	}
	public String                   getPor_zn_cd               (){	return por_zn_cd               	;	}
	public String                   getDel_zn_cd               (){	return del_zn_cd               	;	}
	public String                   getPctl_no                 (){	return pctl_no                 	;	}
	public String                   getUnd_cm_flg              (){	return und_cm_flg              	;	}
	public String                   getEai_evnt_dt             (){	return eai_evnt_dt             	;	}
	public String					getSpcl_prct_cgo_flg	   (){	return spcl_prct_cgo_flg		;	}
	public String					getCntr_full_pkup_loc_cd   (){	return cntr_full_pkup_loc_cd	;	}
	public String					getCntr_full_pkup_yd_cd	   (){	return cntr_full_pkup_yd_cd		;	}
	public String					getCtrt_ofc_cd	   		   (){	return ctrt_ofc_cd				;	}
	public String					getCtrt_srep_cd	   		   (){	return ctrt_srep_cd				;	}
	
	public String					getIb_del_de_dt	   	   	   (){	return ib_del_de_dt				;	}
	public String					getIb_mty_rtn_yd_cd	   	   (){	return ib_mty_rtn_yd_cd			;	}
	public String					getBl_mst_bkg_no	   	   (){	return bl_mst_bkg_no			;	}
	public String					getBl_mst_bkg_no_split	   (){	return bl_mst_bkg_no_split		;	}
	
	public String					getPol_zone_cd				(){	return pol_zone_cd		;	}
	
	public String					getBlck_stwg_cd			   (){	return blck_stwg_cd				;	} // 2008 03 07 hyunsu added 
	public String					getCntr_tpsz_mix_flg	   (){	return cntr_tpsz_mix_flg		;	} // 2008 04 18 hyunsu added 

	// setter method is proceeding ..
	public void setIbflag                  ( String                   ibflag                   ){	this.ibflag                   = ibflag                  	;	}
	public void setPage_rows               ( String                   page_rows                ){	this.page_rows                = page_rows               	;	}
	public void setBkg_no                  ( String                   bkg_no                   ){	this.bkg_no                   = bkg_no                  	;	}
	public void setBkg_no_split            ( String                   bkg_no_split             ){	this.bkg_no_split             = bkg_no_split            	;	}
	public void setVsl_cd                  ( String                   vsl_cd                   ){	this.vsl_cd                   = vsl_cd                  	;	}
	public void setSkd_voy_no              ( String                   skd_voy_no               ){	this.skd_voy_no               = skd_voy_no              	;	}
	public void setSkd_dir_cd              ( String                   skd_dir_cd               ){	this.skd_dir_cd               = skd_dir_cd              	;	}
	public void setSlan_cd                 ( String                   slan_cd                  ){	this.slan_cd                  = slan_cd                 	;	}
	public void setPor_cd                  ( String                   por_cd                   ){	this.por_cd                   = por_cd                  	;	}
	public void setPol_cd                  ( String                   pol_cd                   ){	this.pol_cd                   = pol_cd                  	;	}
	public void setPod_cd                  ( String                   pod_cd                   ){	this.pod_cd                   = pod_cd                  	;	}
	public void setDel_cd                  ( String                   del_cd                   ){	this.del_cd                   = del_cd                  	;	}
	public void setPre_rly_port_cd         ( String                   pre_rly_port_cd          ){	this.pre_rly_port_cd          = pre_rly_port_cd         	;	}
	public void setPst_rly_port_cd         ( String                   pst_rly_port_cd          ){	this.pst_rly_port_cd          = pst_rly_port_cd         	;	}
	public void setBkg_ofc_cd              ( String                   bkg_ofc_cd               ){	this.bkg_ofc_cd               = bkg_ofc_cd              	;	}
	public void setRhq_cd                  ( String                   rhq_cd                   ){	this.rhq_cd                   = rhq_cd                  	;	}
	public void setRgn_ofc_cd              ( String                   rgn_ofc_cd               ){	this.rgn_ofc_cd               = rgn_ofc_cd              	;	}
	public void setBkg_sls_ofc_cd          ( String                   bkg_sls_ofc_cd           ){	this.bkg_sls_ofc_cd           = bkg_sls_ofc_cd          	;	}
	public void setBkg_ib_sls_ofc_cd       ( String                   bkg_ib_sls_ofc_cd        ){	this.bkg_ib_sls_ofc_cd        = bkg_ib_sls_ofc_cd       	;	}
	public void setBkg_split_cd            ( String                   bkg_split_cd             ){	this.bkg_split_cd             = bkg_split_cd            	;	}
	public void setBkg_doc_usr_id          ( String                   bkg_doc_usr_id           ){	this.bkg_doc_usr_id           = bkg_doc_usr_id          	;	}
	public void setBkg_cre_dt              ( String                   bkg_cre_dt               ){	this.bkg_cre_dt               = bkg_cre_dt              	;	}
	public void setSl_rep_cd               ( String                   sl_rep_cd                ){	this.sl_rep_cd                = sl_rep_cd               	;	}
	public void setBkg_sts_cd              ( String                   bkg_sts_cd               ){	this.bkg_sts_cd               = bkg_sts_cd              	;	}
	public void setBkg_wt_rsn_cd           ( String                   bkg_wt_rsn_cd            ){	this.bkg_wt_rsn_cd            = bkg_wt_rsn_cd           	;	}
	public void setBkg_cntr_rsn_flg        ( String                   bkg_cntr_rsn_flg         ){	this.bkg_cntr_rsn_flg         = bkg_cntr_rsn_flg        	;	}
	public void setBkg_prohi_cmdt_rsn_flg  ( String                   bkg_prohi_cmdt_rsn_flg   ){	this.bkg_prohi_cmdt_rsn_flg   = bkg_prohi_cmdt_rsn_flg  	;	}
	public void setBkg_not_net_rev_rsn_flg ( String                   bkg_not_net_rev_rsn_flg  ){	this.bkg_not_net_rev_rsn_flg  = bkg_not_net_rev_rsn_flg 	;	}
	public void setBkg_dg_cgo_auth_rsn_flg ( String                   bkg_dg_cgo_auth_rsn_flg  ){	this.bkg_dg_cgo_auth_rsn_flg  = bkg_dg_cgo_auth_rsn_flg 	;	}
	public void setBkg_awk_cgo_auth_rsn_flg( String                   bkg_awk_cgo_auth_rsn_flg ){	this.bkg_awk_cgo_auth_rsn_flg = bkg_awk_cgo_auth_rsn_flg	;	}
	public void setBkg_prohi_dest_rsn_flg  ( String                   bkg_prohi_dest_rsn_flg   ){	this.bkg_prohi_dest_rsn_flg   = bkg_prohi_dest_rsn_flg  	;	}
	public void setBkg_rc_rsn_flg          ( String                   bkg_rc_rsn_flg           ){	this.bkg_rc_rsn_flg           = bkg_rc_rsn_flg          	;	}
	public void setBkg_bb_rsn_flg          ( String                   bkg_bb_rsn_flg           ){	this.bkg_bb_rsn_flg           = bkg_bb_rsn_flg          	;	}
	public void setBkg_fcty_rsn_flg        ( String                   bkg_fcty_rsn_flg         ){	this.bkg_fcty_rsn_flg         = bkg_fcty_rsn_flg        	;	}
	public void setBkg_otr_rsn_flg         ( String                   bkg_otr_rsn_flg          ){	this.bkg_otr_rsn_flg          = bkg_otr_rsn_flg         	;	}
	public void setBkg_rqst_dt             ( String                   bkg_rqst_dt              ){	this.bkg_rqst_dt              = bkg_rqst_dt             	;	}
	public void setBkg_cgo_tp_cd           ( String                   bkg_cgo_tp_cd            ){	this.bkg_cgo_tp_cd            = bkg_cgo_tp_cd           	;	}
	public void setBkg_adv_shtg_cd         ( String                   bkg_adv_shtg_cd          ){	this.bkg_adv_shtg_cd          = bkg_adv_shtg_cd         	;	}
	public void setBkg_hot_de_flg          ( String                   bkg_hot_de_flg           ){	this.bkg_hot_de_flg           = bkg_hot_de_flg          	;	}
	public void setNvocc_cd                ( String                   nvocc_cd                 ){	this.nvocc_cd                 = nvocc_cd                	;	}
	public void setRcv_term_cd             ( String                   rcv_term_cd              ){	this.rcv_term_cd              = rcv_term_cd             	;	}
	public void setBkg_rcv_dor_cd          ( String                   bkg_rcv_dor_cd           ){	this.bkg_rcv_dor_cd           = bkg_rcv_dor_cd          	;	}
	public void setDe_term_cd              ( String                   de_term_cd               ){	this.de_term_cd               = de_term_cd              	;	}
	public void setBkg_de_dor_cd           ( String                   bkg_de_dor_cd            ){	this.bkg_de_dor_cd            = bkg_de_dor_cd           	;	}
	public void setBkg_fnl_dest_cd         ( String                   bkg_fnl_dest_cd          ){	this.bkg_fnl_dest_cd          = bkg_fnl_dest_cd         	;	}
	public void setBkg_ocp_cd              ( String                   bkg_ocp_cd               ){	this.bkg_ocp_cd               = bkg_ocp_cd              	;	}
	public void setCmdt_cd                 ( String                   cmdt_cd                  ){	this.cmdt_cd                  = cmdt_cd                 	;	}
	public void setCmdt_dtl_cd             ( String                   cmdt_dtl_cd              ){	this.cmdt_dtl_cd              = cmdt_dtl_cd             	;	}
	public void setRep_cmdt_cd             ( String                   rep_cmdt_cd              ){	this.rep_cmdt_cd              = rep_cmdt_cd             	;	}
	public void setSpcl_dg_cgo_flg         ( String                   spcl_dg_cgo_flg          ){	this.spcl_dg_cgo_flg          = spcl_dg_cgo_flg         	;	}
	public void setSpcl_rc_flg             ( String                   spcl_rc_flg              ){	this.spcl_rc_flg              = spcl_rc_flg             	;	}
	public void setSpcl_awk_cgo_flg        ( String                   spcl_awk_cgo_flg         ){	this.spcl_awk_cgo_flg         = spcl_awk_cgo_flg        	;	}
	public void setSpcl_bb_cgo_flg         ( String                   spcl_bb_cgo_flg          ){	this.spcl_bb_cgo_flg          = spcl_bb_cgo_flg         	;	}
	public void setSpcl_rd_cgo_flg         ( String                   spcl_rd_cgo_flg          ){	this.spcl_rd_cgo_flg          = spcl_rd_cgo_flg         	;	}
	public void setPck_qty                 ( String                   pck_qty                  ){	this.pck_qty                  = pck_qty                 	;	}
	public void setPck_tp_cd               ( String                   pck_tp_cd                ){	this.pck_tp_cd                = pck_tp_cd               	;	}
	public void setBkg_meas_qty            ( String                   bkg_meas_qty             ){	this.bkg_meas_qty             = bkg_meas_qty            	;	}
	public void setBkg_meas_tp_cd          ( String                   bkg_meas_tp_cd           ){	this.bkg_meas_tp_cd           = bkg_meas_tp_cd          	;	}
	public void setAct_bkg_wgt             ( String                   act_bkg_wgt              ){	this.act_bkg_wgt              = act_bkg_wgt             	;	}
	public void setAct_bkg_wgt_tp_cd       ( String                   act_bkg_wgt_tp_cd        ){	this.act_bkg_wgt_tp_cd        = act_bkg_wgt_tp_cd       	;	}
	public void setEstm_bkg_wgt            ( String                   estm_bkg_wgt             ){	this.estm_bkg_wgt             = estm_bkg_wgt            	;	}
	public void setEstm_bkg_wgt_tp_cd      ( String                   estm_bkg_wgt_tp_cd       ){	this.estm_bkg_wgt_tp_cd       = estm_bkg_wgt_tp_cd      	;	}
	public void setLc_no                   ( String                   lc_no                    ){	this.lc_no                    = lc_no                   	;	}
	public void setBkg_edi_ref_no          ( String                   bkg_edi_ref_no           ){	this.bkg_edi_ref_no           = bkg_edi_ref_no          	;	}
	public void setOrg_svc_mod_cd          ( String                   org_svc_mod_cd           ){	this.org_svc_mod_cd           = org_svc_mod_cd          	;	}
	public void setDest_svc_mod_cd         ( String                   dest_svc_mod_cd          ){	this.dest_svc_mod_cd          = dest_svc_mod_cd         	;	}
	public void setTwn_so_no               ( String                   twn_so_no                ){	this.twn_so_no                = twn_so_no               	;	}
	public void setScac_no                 ( String                   scac_no                  ){	this.scac_no                  = scac_no                 	;	}
	public void setBkg_rmk                 ( String                   bkg_rmk                  ){	this.bkg_rmk                  = bkg_rmk                 	;	}
	public void setSpcl_cgo_auth_seq       ( String                   spcl_cgo_auth_seq        ){	this.spcl_cgo_auth_seq        = spcl_cgo_auth_seq       	;	}
	public void setBl_no                   ( String                   bl_no                    ){	this.bl_no                    = bl_no                   	;	}
	public void setBl_no_tp                ( String                   bl_no_tp                 ){	this.bl_no_tp                 = bl_no_tp                	;	}
	public void setBl_no_chk               ( String                   bl_no_chk                ){	this.bl_no_chk                = bl_no_chk               	;	}
	public void setBl_tp_cd                ( String                   bl_tp_cd                 ){	this.bl_tp_cd                 = bl_tp_cd                	;	}
	public void setBkg_cxl_dt              ( String                   bkg_cxl_dt               ){	this.bkg_cxl_dt               = bkg_cxl_dt              	;	}
	public void setBkg_pson_nm             ( String                   bkg_pson_nm              ){	this.bkg_pson_nm              = bkg_pson_nm             	;	}
	public void setBkg_pson_telcm_no       ( String                   bkg_pson_telcm_no        ){	this.bkg_pson_telcm_no        = bkg_pson_telcm_no       	;	}
	public void setBkg_pson_fax_no         ( String                   bkg_pson_fax_no          ){	this.bkg_pson_fax_no          = bkg_pson_fax_no         	;	}
	public void setBkg_pson_eml            ( String                   bkg_pson_eml             ){	this.bkg_pson_eml             = bkg_pson_eml            	;	}
	public void setBkg_hot_de_dt           ( String                   bkg_hot_de_dt            ){	this.bkg_hot_de_dt            = bkg_hot_de_dt           	;	}
	public void setBkg_org_rout_cd         ( String                   bkg_org_rout_cd          ){	this.bkg_org_rout_cd          = bkg_org_rout_cd         	;	}
	public void setDest_rout_cd            ( String                   dest_rout_cd             ){	this.dest_rout_cd             = dest_rout_cd            	;	}
	public void setPsa_no                  ( String                   psa_no                   ){	this.psa_no                   = psa_no                  	;	}
	public void setRef_no                  ( String                   ref_no                   ){	this.ref_no                   = ref_no                  	;	}
	public void setQurn_no                 ( String                   qurn_no                  ){	this.qurn_no                  = qurn_no                 	;	}
	public void setQurn_nm                 ( String                   qurn_nm                  ){	this.qurn_nm                  = qurn_nm                 	;	}
	public void setSr_flg                  ( String                   sr_flg                   ){	this.sr_flg                   = sr_flg                  	;	}
	public void setIb_trns_flg             ( String                   ib_trns_flg              ){	this.ib_trns_flg              = ib_trns_flg             	;	}
	public void setBkg_bd_tp_cd            ( String                   bkg_bd_tp_cd             ){	this.bkg_bd_tp_cd             = bkg_bd_tp_cd            	;	}
	public void setBkg_bd_cd               ( String                   bkg_bd_cd                ){	this.bkg_bd_cd                = bkg_bd_cd               	;	}
	public void setWr_hus_cd               ( String                   wr_hus_cd                ){	this.wr_hus_cd                = wr_hus_cd               	;	}
	public void setBkg_cgo_dt              ( String                   bkg_cgo_dt               ){	this.bkg_cgo_dt               = bkg_cgo_dt              	;	}
	public void setBkg_hngr_flg            ( String                   bkg_hngr_flg             ){	this.bkg_hngr_flg             = bkg_hngr_flg            	;	}
	public void setBkg_shpr_ownr_flg       ( String                   bkg_shpr_ownr_flg        ){	this.bkg_shpr_ownr_flg        = bkg_shpr_ownr_flg       	;	}
	public void setEq_subst_flg            ( String                   eq_subst_flg             ){	this.eq_subst_flg             = eq_subst_flg            	;	}
	public void setOrg_hlg_flg             ( String                   org_hlg_flg              ){	this.org_hlg_flg              = org_hlg_flg             	;	}
	public void setDest_hlg_flg            ( String                   dest_hlg_flg             ){	this.dest_hlg_flg             = dest_hlg_flg            	;	}
	public void setPkup_loc_cd             ( String                   pkup_loc_cd              ){	this.pkup_loc_cd              = pkup_loc_cd             	;	}
	public void setPkup_yd_cd              ( String                   pkup_yd_cd               ){	this.pkup_yd_cd               = pkup_yd_cd              	;	}
	public void setPkup_dt                 ( String                   pkup_dt                  ){	this.pkup_dt                  = pkup_dt                 	;	}
	public void setRtn_loc_cd              ( String                   rtn_loc_cd               ){	this.rtn_loc_cd               = rtn_loc_cd              	;	}
	public void setRtn_yd_cd               ( String                   rtn_yd_cd                ){	this.rtn_yd_cd                = rtn_yd_cd               	;	}
	public void setCntr_lst_cfm_dt         ( String                   cntr_lst_cfm_dt          ){	this.cntr_lst_cfm_dt          = cntr_lst_cfm_dt         	;	}
	public void setBkg_lst_cfm_usr_id      ( String                   bkg_lst_cfm_usr_id       ){	this.bkg_lst_cfm_usr_id       = bkg_lst_cfm_usr_id      	;	}
	public void setBkg_rt_aply_dt          ( String                   bkg_rt_aply_dt           ){	this.bkg_rt_aply_dt           = bkg_rt_aply_dt          	;	}
	public void setCbf_flg                 ( String                   cbf_flg                  ){	this.cbf_flg                  = cbf_flg                 	;	}
	public void setCbf_itm_chk_flg         ( String                   cbf_itm_chk_flg          ){	this.cbf_itm_chk_flg          = cbf_itm_chk_flg         	;	}
	public void setBkg_bdr_dt              ( String                   bkg_bdr_dt               ){	this.bkg_bdr_dt               = bkg_bdr_dt              	;	}
	public void setBkg_bdr_cng_flg         ( String                   bkg_bdr_cng_flg          ){	this.bkg_bdr_cng_flg          = bkg_bdr_cng_flg         	;	}
	public void setBkg_bdr_flg             ( String                   bkg_bdr_flg              ){	this.bkg_bdr_flg              = bkg_bdr_flg             	;	}
	public void setBkg_cntr_mf_cfm_flg     ( String                   bkg_cntr_mf_cfm_flg      ){	this.bkg_cntr_mf_cfm_flg      = bkg_cntr_mf_cfm_flg     	;	}
	public void setHcos_bkg_no             ( String                   hcos_bkg_no              ){	this.hcos_bkg_no              = hcos_bkg_no             	;	}
	public void setHcos_bkg_no_split       ( String                   hcos_bkg_no_split        ){	this.hcos_bkg_no_split        = hcos_bkg_no_split       	;	}
	public void setBkg_gen_cd              ( String                   bkg_gen_cd               ){	this.bkg_gen_cd               = bkg_gen_cd              	;	}
	public void setBkg_cntr_frm_flg        ( String                   bkg_cntr_frm_flg         ){	this.bkg_cntr_frm_flg         = bkg_cntr_frm_flg        	;	}
	public void setBkg_cfm_snt_flg         ( String                   bkg_cfm_snt_flg          ){	this.bkg_cfm_snt_flg          = bkg_cfm_snt_flg         	;	}
	public void setBkg_cfm_snt_dt          ( String                   bkg_cfm_snt_dt           ){	this.bkg_cfm_snt_dt           = bkg_cfm_snt_dt          	;	}
	public void setBkg_frt_fwrd_flg        ( String                   bkg_frt_fwrd_flg         ){	this.bkg_frt_fwrd_flg         = bkg_frt_fwrd_flg        	;	}
	public void setBkg_lst_ca_iss_dt       ( String                   bkg_lst_ca_iss_dt        ){	this.bkg_lst_ca_iss_dt        = bkg_lst_ca_iss_dt       	;	}
	public void setCmb_bkg_no              ( String                   cmb_bkg_no               ){	this.cmb_bkg_no               = cmb_bkg_no              	;	}
	public void setCmb_bkg_no_split        ( String                   cmb_bkg_no_split         ){	this.cmb_bkg_no_split         = cmb_bkg_no_split        	;	}
	public void setFinc_dir_cd             ( String                   finc_dir_cd              ){	this.finc_dir_cd              = finc_dir_cd             	;	}
	public void setBkg_cbf_auth_flg        ( String                   bkg_cbf_auth_flg         ){	this.bkg_cbf_auth_flg         = bkg_cbf_auth_flg        	;	}
	public void setBkg_shpr_xpt_decl_cd    ( String                   bkg_shpr_xpt_decl_cd     ){	this.bkg_shpr_xpt_decl_cd     = bkg_shpr_xpt_decl_cd    	;	}
	public void setBkg_agn_cd              ( String                   bkg_agn_cd               ){	this.bkg_agn_cd               = bkg_agn_cd              	;	}
	public void setEq_ctrl_ofc_cd          ( String                   eq_ctrl_ofc_cd           ){	this.eq_ctrl_ofc_cd           = eq_ctrl_ofc_cd          	;	}
	public void setPkup_loc_yd_cd          ( String                   pkup_loc_yd_cd           ){	this.pkup_loc_yd_cd           = pkup_loc_yd_cd          	;	}
	public void setBkg_corr_no             ( String                   bkg_corr_no              ){	this.bkg_corr_no              = bkg_corr_no             	;	}
	public void setCa_usr_id               ( String                   ca_usr_id                ){	this.ca_usr_id                = ca_usr_id               	;	}
	public void setBkg_corr_ofc_cd         ( String                   bkg_corr_ofc_cd          ){	this.bkg_corr_ofc_cd          = bkg_corr_ofc_cd         	;	}
	public void setCorr_dt                 ( String                   corr_dt                  ){	this.corr_dt                  = corr_dt                 	;	}
	public void setBl_prn_wgt_flg          ( String                   bl_prn_wgt_flg           ){	this.bl_prn_wgt_flg           = bl_prn_wgt_flg          	;	}
	public void setBkg_cre_flg             ( String                   bkg_cre_flg              ){	this.bkg_cre_flg              = bkg_cre_flg             	;	}
	public void setOop_loc_cd              ( String                   oop_loc_cd               ){	this.oop_loc_cd               = oop_loc_cd              	;	}
	public void setPfd_loc_cd              ( String                   pfd_loc_cd               ){	this.pfd_loc_cd               = pfd_loc_cd              	;	}
	public void setDbl_bkg_flg             ( String                   dbl_bkg_flg              ){	this.dbl_bkg_flg              = dbl_bkg_flg             	;	}
	public void setAp_brog_flg             ( String                   ap_brog_flg              ){	this.ap_brog_flg              = ap_brog_flg             	;	}
	public void setBis_sys_flg             ( String                   bis_sys_flg              ){	this.bis_sys_flg              = bis_sys_flg             	;	}
	public void setNis_evnt_dt             ( String                   nis_evnt_dt              ){	this.nis_evnt_dt              = nis_evnt_dt             	;	}
	public void setBkg_xter_rmk            ( String                   bkg_xter_rmk             ){	this.bkg_xter_rmk             = bkg_xter_rmk            	;	}
	public void setXter_bkg_cd             ( String                   xter_bkg_cd              ){	this.xter_bkg_cd              = xter_bkg_cd             	;	}
	public void setBkg_rev_aud_flg         ( String                   bkg_rev_aud_flg          ){	this.bkg_rev_aud_flg          = bkg_rev_aud_flg         	;	}
	public void setSpcl_hide_flg           ( String                   spcl_hide_flg            ){	this.spcl_hide_flg            = spcl_hide_flg           	;	}
	public void setCust_rlse_flg           ( String                   cust_rlse_flg            ){	this.cust_rlse_flg            = cust_rlse_flg           	;	}
	public void setCdr_cng_flg             ( String                   cdr_cng_flg              ){	this.cdr_cng_flg              = cdr_cng_flg             	;	}
	public void setRcdr_dt                 ( String                   rcdr_dt                  ){	this.rcdr_dt                  = rcdr_dt                 	;	}
	public void setCdr_vsl_cd              ( String                   cdr_vsl_cd               ){	this.cdr_vsl_cd               = cdr_vsl_cd              	;	}
	public void setCdr_skd_voy_no          ( String                   cdr_skd_voy_no           ){	this.cdr_skd_voy_no           = cdr_skd_voy_no          	;	}
	public void setCdr_skd_dir_cd          ( String                   cdr_skd_dir_cd           ){	this.cdr_skd_dir_cd           = cdr_skd_dir_cd          	;	}
	public void setCdr_pol_cd              ( String                   cdr_pol_cd               ){	this.cdr_pol_cd               = cdr_pol_cd              	;	}
	public void setMty_bkg_cd              ( String                   mty_bkg_cd               ){	this.mty_bkg_cd               = mty_bkg_cd              	;	}
	public void setCdr_dchg_port_cd        ( String                   cdr_dchg_port_cd         ){	this.cdr_dchg_port_cd         = cdr_dchg_port_cd        	;	}
	public void setBkg_pod_tml_cd          ( String                   bkg_pod_tml_cd           ){	this.bkg_pod_tml_cd           = bkg_pod_tml_cd          	;	}
	public void setFd_grd_flg              ( String                   fd_grd_flg               ){	this.fd_grd_flg               = fd_grd_flg              	;	}
	public void setOrg_trns_mod_cd         ( String                   org_trns_mod_cd          ){	this.org_trns_mod_cd          = org_trns_mod_cd         	;	}
	public void setDest_trns_mod_cd        ( String                   dest_trns_mod_cd         ){	this.dest_trns_mod_cd         = dest_trns_mod_cd        	;	}
	public void setRail_blk_flg            ( String                   rail_blk_flg             ){	this.rail_blk_flg             = rail_blk_flg            	;	}
	public void setRail_blk_cd             ( String                   rail_blk_cd              ){	this.rail_blk_cd              = rail_blk_cd             	;	}
	public void setMcntr_dor_arr_dt        ( String                   mcntr_dor_arr_dt         ){	this.mcntr_dor_arr_dt         = mcntr_dor_arr_dt        	;	}
	public void setLodg_due_dt             ( String                   lodg_due_dt              ){	this.lodg_due_dt              = lodg_due_dt             	;	}
	public void setDe_due_dt               ( String                   de_due_dt                ){	this.de_due_dt                = de_due_dt               	;	}
	public void setPor_zn_cd               ( String                   por_zn_cd                ){	this.por_zn_cd                = por_zn_cd               	;	}
	public void setDel_zn_cd               ( String                   del_zn_cd                ){	this.del_zn_cd                = del_zn_cd               	;	}
	public void setPctl_no                 ( String                   pctl_no                  ){	this.pctl_no                  = pctl_no                 	;	}
	public void setUnd_cm_flg              ( String                   und_cm_flg               ){	this.und_cm_flg               = und_cm_flg              	;	}
	public void setEai_evnt_dt             ( String                   eai_evnt_dt              ){	this.eai_evnt_dt              = eai_evnt_dt             	;	}
	
	public void setSpcl_prct_cgo_flg       ( String                   spcl_prct_cgo_flg        ){	this.spcl_prct_cgo_flg        = spcl_prct_cgo_flg           ;	}
	public void setCntr_full_pkup_loc_cd   ( String                   cntr_full_pkup_loc_cd    ){	this.cntr_full_pkup_loc_cd    = cntr_full_pkup_loc_cd       ;	}
	public void setCntr_full_pkup_yd_cd    ( String                   cntr_full_pkup_yd_cd     ){	this.cntr_full_pkup_yd_cd     = cntr_full_pkup_yd_cd        ;	}
	public void setCtrt_ofc_cd             ( String                   ctrt_ofc_cd              ){	this.ctrt_ofc_cd              = ctrt_ofc_cd             	;	}
	public void setCtrt_srep_cd            ( String                   ctrt_srep_cd             ){	this.ctrt_srep_cd             = ctrt_srep_cd             	;	}
	
	public void setIb_del_de_dt            ( String                   ib_del_de_dt             ){	this.ib_del_de_dt             = ib_del_de_dt             	;	}
	public void setIb_mty_rtn_yd_cd    	   ( String                   ib_mty_rtn_yd_cd         ){	this.ib_mty_rtn_yd_cd     	  = ib_mty_rtn_yd_cd        	;	}
	public void setBl_mst_bkg_no           ( String                   bl_mst_bkg_no            ){	this.bl_mst_bkg_no            = bl_mst_bkg_no             	;	}
	public void setBl_mst_bkg_no_split     ( String                   bl_mst_bkg_no_split      ){	this.bl_mst_bkg_no_split      = bl_mst_bkg_no_split         ;	}
	
	public void setPol_zone_cd     ( String                   pol_zone_cd      ){	this.pol_zone_cd      = pol_zone_cd         ;	}
	
	public void setBlck_stwg_cd			   ( String					  blck_stwg_cd			   ){	this.blck_stwg_cd			  = blck_stwg_cd				;	} // 2008 03 07 hyunsu added
	public void setCntr_tpsz_mix_flg	   ( String					  cntr_tpsz_mix_flg		   ){	this.cntr_tpsz_mix_flg		  = cntr_tpsz_mix_flg			;	} // 2008 04 18 hyunsu added 
	
	public static BKG_BOOKING fromRequest(HttpServletRequest request) {
		BKG_BOOKING model = new BKG_BOOKING();
		try {
			model.setIbflag                  	(JSPUtil.getParameter(request, "ibflag                  		".trim(), ""));
			model.setPage_rows               	(JSPUtil.getParameter(request, "page_rows               		".trim(), ""));
			model.setBkg_no                  	(JSPUtil.getParameter(request, "bkg_no                  		".trim(), ""));
			model.setBkg_no_split            	(JSPUtil.getParameter(request, "bkg_no_split            		".trim(), ""));
			model.setVsl_cd                  	(JSPUtil.getParameter(request, "vsl_cd                  		".trim(), ""));
			model.setSkd_voy_no              	(JSPUtil.getParameter(request, "skd_voy_no              		".trim(), ""));
			model.setSkd_dir_cd              	(JSPUtil.getParameter(request, "skd_dir_cd              		".trim(), ""));
			model.setSlan_cd                 	(JSPUtil.getParameter(request, "slan_cd                 		".trim(), ""));
			model.setPor_cd                  	(JSPUtil.getParameter(request, "por_cd                  		".trim(), ""));
			model.setPol_cd                  	(JSPUtil.getParameter(request, "pol_cd                  		".trim(), ""));
			model.setPod_cd                  	(JSPUtil.getParameter(request, "pod_cd                  		".trim(), ""));
			model.setDel_cd                  	(JSPUtil.getParameter(request, "del_cd                  		".trim(), ""));
			model.setPre_rly_port_cd         	(JSPUtil.getParameter(request, "pre_rly_port_cd         		".trim(), ""));
			model.setPst_rly_port_cd         	(JSPUtil.getParameter(request, "pst_rly_port_cd         		".trim(), ""));
			model.setBkg_ofc_cd              	(JSPUtil.getParameter(request, "bkg_ofc_cd              		".trim(), ""));
			model.setRhq_cd                  	(JSPUtil.getParameter(request, "rhq_cd                  		".trim(), ""));
			model.setRgn_ofc_cd              	(JSPUtil.getParameter(request, "rgn_ofc_cd              		".trim(), ""));
			model.setBkg_sls_ofc_cd          	(JSPUtil.getParameter(request, "bkg_sls_ofc_cd          		".trim(), ""));
			model.setBkg_ib_sls_ofc_cd       	(JSPUtil.getParameter(request, "bkg_ib_sls_ofc_cd       		".trim(), ""));
			model.setBkg_split_cd            	(JSPUtil.getParameter(request, "bkg_split_cd            		".trim(), ""));
			model.setBkg_doc_usr_id          	(JSPUtil.getParameter(request, "bkg_doc_usr_id          		".trim(), ""));
			model.setBkg_cre_dt              	(JSPUtil.getParameter(request, "bkg_cre_dt              		".trim(), ""));
			model.setSl_rep_cd               	(JSPUtil.getParameter(request, "sl_rep_cd               		".trim(), ""));
			model.setBkg_sts_cd              	(JSPUtil.getParameter(request, "bkg_sts_cd              		".trim(), ""));
			model.setBkg_wt_rsn_cd           	(JSPUtil.getParameter(request, "bkg_wt_rsn_cd           		".trim(), ""));
			model.setBkg_cntr_rsn_flg        	(JSPUtil.getParameter(request, "bkg_cntr_rsn_flg        		".trim(), ""));
			model.setBkg_prohi_cmdt_rsn_flg  	(JSPUtil.getParameter(request, "bkg_prohi_cmdt_rsn_flg  		".trim(), ""));
			model.setBkg_not_net_rev_rsn_flg 	(JSPUtil.getParameter(request, "bkg_not_net_rev_rsn_flg 		".trim(), ""));
			model.setBkg_dg_cgo_auth_rsn_flg 	(JSPUtil.getParameter(request, "bkg_dg_cgo_auth_rsn_flg 		".trim(), ""));
			model.setBkg_awk_cgo_auth_rsn_flg	(JSPUtil.getParameter(request, "bkg_awk_cgo_auth_rsn_flg		".trim(), ""));
			model.setBkg_prohi_dest_rsn_flg  	(JSPUtil.getParameter(request, "bkg_prohi_dest_rsn_flg  		".trim(), ""));
			model.setBkg_rc_rsn_flg          	(JSPUtil.getParameter(request, "bkg_rc_rsn_flg          		".trim(), ""));
			model.setBkg_bb_rsn_flg          	(JSPUtil.getParameter(request, "bkg_bb_rsn_flg          		".trim(), ""));
			model.setBkg_fcty_rsn_flg        	(JSPUtil.getParameter(request, "bkg_fcty_rsn_flg        		".trim(), ""));
			model.setBkg_otr_rsn_flg         	(JSPUtil.getParameter(request, "bkg_otr_rsn_flg         		".trim(), ""));
			model.setBkg_rqst_dt             	(JSPUtil.getParameter(request, "bkg_rqst_dt             		".trim(), ""));
			model.setBkg_cgo_tp_cd           	(JSPUtil.getParameter(request, "bkg_cgo_tp_cd           		".trim(), ""));
			model.setBkg_adv_shtg_cd         	(JSPUtil.getParameter(request, "bkg_adv_shtg_cd         		".trim(), ""));
			model.setBkg_hot_de_flg          	(JSPUtil.getParameter(request, "bkg_hot_de_flg          		".trim(), ""));
			model.setNvocc_cd                	(JSPUtil.getParameter(request, "nvocc_cd                		".trim(), ""));
			model.setRcv_term_cd             	(JSPUtil.getParameter(request, "rcv_term_cd             		".trim(), ""));
			model.setBkg_rcv_dor_cd          	(JSPUtil.getParameter(request, "bkg_rcv_dor_cd          		".trim(), ""));
			model.setDe_term_cd              	(JSPUtil.getParameter(request, "de_term_cd              		".trim(), ""));
			model.setBkg_de_dor_cd           	(JSPUtil.getParameter(request, "bkg_de_dor_cd           		".trim(), ""));
			model.setBkg_fnl_dest_cd         	(JSPUtil.getParameter(request, "bkg_fnl_dest_cd         		".trim(), ""));
			model.setBkg_ocp_cd              	(JSPUtil.getParameter(request, "bkg_ocp_cd              		".trim(), ""));
			model.setCmdt_cd                 	(JSPUtil.getParameter(request, "cmdt_cd                 		".trim(), ""));
			model.setCmdt_dtl_cd             	(JSPUtil.getParameter(request, "cmdt_dtl_cd             		".trim(), ""));
			model.setRep_cmdt_cd             	(JSPUtil.getParameter(request, "rep_cmdt_cd             		".trim(), ""));
			model.setSpcl_dg_cgo_flg         	(JSPUtil.getParameter(request, "spcl_dg_cgo_flg         		".trim(), ""));
			model.setSpcl_rc_flg             	(JSPUtil.getParameter(request, "spcl_rc_flg             		".trim(), ""));
			model.setSpcl_awk_cgo_flg        	(JSPUtil.getParameter(request, "spcl_awk_cgo_flg        		".trim(), ""));
			model.setSpcl_bb_cgo_flg         	(JSPUtil.getParameter(request, "spcl_bb_cgo_flg         		".trim(), ""));
			model.setSpcl_rd_cgo_flg         	(JSPUtil.getParameter(request, "spcl_rd_cgo_flg         		".trim(), ""));
			model.setPck_qty                 	(JSPUtil.getParameter(request, "pck_qty                 		".trim(), ""));
			model.setPck_tp_cd               	(JSPUtil.getParameter(request, "pck_tp_cd               		".trim(), ""));
			model.setBkg_meas_qty            	(JSPUtil.getParameter(request, "bkg_meas_qty            		".trim(), ""));
			model.setBkg_meas_tp_cd          	(JSPUtil.getParameter(request, "bkg_meas_tp_cd          		".trim(), ""));
			model.setAct_bkg_wgt             	(JSPUtil.getParameter(request, "act_bkg_wgt             		".trim(), ""));
			model.setAct_bkg_wgt_tp_cd       	(JSPUtil.getParameter(request, "act_bkg_wgt_tp_cd       		".trim(), ""));
			model.setEstm_bkg_wgt            	(JSPUtil.getParameter(request, "estm_bkg_wgt            		".trim(), ""));
			model.setEstm_bkg_wgt_tp_cd      	(JSPUtil.getParameter(request, "estm_bkg_wgt_tp_cd      		".trim(), ""));
			model.setLc_no                   	(JSPUtil.getParameter(request, "lc_no                   		".trim(), ""));
			model.setBkg_edi_ref_no          	(JSPUtil.getParameter(request, "bkg_edi_ref_no          		".trim(), ""));
			model.setOrg_svc_mod_cd          	(JSPUtil.getParameter(request, "org_svc_mod_cd          		".trim(), ""));
			model.setDest_svc_mod_cd         	(JSPUtil.getParameter(request, "dest_svc_mod_cd         		".trim(), ""));
			model.setTwn_so_no               	(JSPUtil.getParameter(request, "twn_so_no               		".trim(), ""));
			model.setScac_no                 	(JSPUtil.getParameter(request, "scac_no                 		".trim(), ""));
			model.setBkg_rmk                 	(JSPUtil.getParameter(request, "bkg_rmk                 		".trim(), ""));
			model.setSpcl_cgo_auth_seq       	(JSPUtil.getParameter(request, "spcl_cgo_auth_seq       		".trim(), ""));
			model.setBl_no                   	(JSPUtil.getParameter(request, "bl_no                   		".trim(), ""));
			model.setBl_no_tp                	(JSPUtil.getParameter(request, "bl_no_tp                		".trim(), ""));
			model.setBl_no_chk               	(JSPUtil.getParameter(request, "bl_no_chk               		".trim(), ""));
			model.setBl_tp_cd                	(JSPUtil.getParameter(request, "bl_tp_cd                		".trim(), ""));
			model.setBkg_cxl_dt              	(JSPUtil.getParameter(request, "bkg_cxl_dt              		".trim(), ""));
			model.setBkg_pson_nm             	(JSPUtil.getParameter(request, "bkg_pson_nm             		".trim(), ""));
			model.setBkg_pson_telcm_no       	(JSPUtil.getParameter(request, "bkg_pson_telcm_no       		".trim(), ""));
			model.setBkg_pson_fax_no         	(JSPUtil.getParameter(request, "bkg_pson_fax_no         		".trim(), ""));
			model.setBkg_pson_eml            	(JSPUtil.getParameter(request, "bkg_pson_eml            		".trim(), ""));
			model.setBkg_hot_de_dt           	(JSPUtil.getParameter(request, "bkg_hot_de_dt           		".trim(), ""));
			model.setBkg_org_rout_cd         	(JSPUtil.getParameter(request, "bkg_org_rout_cd         		".trim(), ""));
			model.setDest_rout_cd            	(JSPUtil.getParameter(request, "dest_rout_cd            		".trim(), ""));
			model.setPsa_no                  	(JSPUtil.getParameter(request, "psa_no                  		".trim(), ""));
			model.setRef_no                  	(JSPUtil.getParameter(request, "ref_no                  		".trim(), ""));
			model.setQurn_no                 	(JSPUtil.getParameter(request, "qurn_no                 		".trim(), ""));
			model.setQurn_nm                 	(JSPUtil.getParameter(request, "qurn_nm                 		".trim(), ""));
			model.setSr_flg                  	(JSPUtil.getParameter(request, "sr_flg                  		".trim(), ""));
			model.setIb_trns_flg             	(JSPUtil.getParameter(request, "ib_trns_flg             		".trim(), ""));
			model.setBkg_bd_tp_cd            	(JSPUtil.getParameter(request, "bkg_bd_tp_cd            		".trim(), ""));
			model.setBkg_bd_cd               	(JSPUtil.getParameter(request, "bkg_bd_cd               		".trim(), ""));
			model.setWr_hus_cd               	(JSPUtil.getParameter(request, "wr_hus_cd               		".trim(), ""));
			model.setBkg_cgo_dt              	(JSPUtil.getParameter(request, "bkg_cgo_dt              		".trim(), ""));
			model.setBkg_hngr_flg            	(JSPUtil.getParameter(request, "bkg_hngr_flg            		".trim(), ""));
			model.setBkg_shpr_ownr_flg       	(JSPUtil.getParameter(request, "bkg_shpr_ownr_flg       		".trim(), ""));
			model.setEq_subst_flg            	(JSPUtil.getParameter(request, "eq_subst_flg            		".trim(), ""));
			model.setOrg_hlg_flg             	(JSPUtil.getParameter(request, "org_hlg_flg             		".trim(), ""));
			model.setDest_hlg_flg            	(JSPUtil.getParameter(request, "dest_hlg_flg            		".trim(), ""));
			model.setPkup_loc_cd             	(JSPUtil.getParameter(request, "pkup_loc_cd             		".trim(), ""));
			model.setPkup_yd_cd              	(JSPUtil.getParameter(request, "pkup_yd_cd              		".trim(), ""));
			model.setPkup_dt                 	(JSPUtil.getParameter(request, "pkup_dt                 		".trim(), ""));
			model.setRtn_loc_cd              	(JSPUtil.getParameter(request, "rtn_loc_cd              		".trim(), ""));
			model.setRtn_yd_cd               	(JSPUtil.getParameter(request, "rtn_yd_cd               		".trim(), ""));
			model.setCntr_lst_cfm_dt         	(JSPUtil.getParameter(request, "cntr_lst_cfm_dt         		".trim(), ""));
			model.setBkg_lst_cfm_usr_id      	(JSPUtil.getParameter(request, "bkg_lst_cfm_usr_id      		".trim(), ""));
			model.setBkg_rt_aply_dt          	(JSPUtil.getParameter(request, "bkg_rt_aply_dt          		".trim(), ""));
			model.setCbf_flg                 	(JSPUtil.getParameter(request, "cbf_flg                 		".trim(), ""));
			model.setCbf_itm_chk_flg         	(JSPUtil.getParameter(request, "cbf_itm_chk_flg         		".trim(), ""));
			model.setBkg_bdr_dt              	(JSPUtil.getParameter(request, "bkg_bdr_dt              		".trim(), ""));
			model.setBkg_bdr_cng_flg         	(JSPUtil.getParameter(request, "bkg_bdr_cng_flg         		".trim(), ""));
			model.setBkg_bdr_flg             	(JSPUtil.getParameter(request, "bkg_bdr_flg             		".trim(), ""));
			model.setBkg_cntr_mf_cfm_flg     	(JSPUtil.getParameter(request, "bkg_cntr_mf_cfm_flg     		".trim(), ""));
			model.setHcos_bkg_no             	(JSPUtil.getParameter(request, "hcos_bkg_no             		".trim(), ""));
			model.setHcos_bkg_no_split       	(JSPUtil.getParameter(request, "hcos_bkg_no_split       		".trim(), ""));
			model.setBkg_gen_cd              	(JSPUtil.getParameter(request, "bkg_gen_cd              		".trim(), ""));
			model.setBkg_cntr_frm_flg        	(JSPUtil.getParameter(request, "bkg_cntr_frm_flg        		".trim(), ""));
			model.setBkg_cfm_snt_flg         	(JSPUtil.getParameter(request, "bkg_cfm_snt_flg         		".trim(), ""));
			model.setBkg_cfm_snt_dt          	(JSPUtil.getParameter(request, "bkg_cfm_snt_dt          		".trim(), ""));
			model.setBkg_frt_fwrd_flg        	(JSPUtil.getParameter(request, "bkg_frt_fwrd_flg        		".trim(), ""));
			model.setBkg_lst_ca_iss_dt       	(JSPUtil.getParameter(request, "bkg_lst_ca_iss_dt       		".trim(), ""));
			model.setCmb_bkg_no              	(JSPUtil.getParameter(request, "cmb_bkg_no              		".trim(), ""));
			model.setCmb_bkg_no_split        	(JSPUtil.getParameter(request, "cmb_bkg_no_split        		".trim(), ""));
			model.setFinc_dir_cd             	(JSPUtil.getParameter(request, "finc_dir_cd             		".trim(), ""));
			model.setBkg_cbf_auth_flg        	(JSPUtil.getParameter(request, "bkg_cbf_auth_flg        		".trim(), ""));
			model.setBkg_shpr_xpt_decl_cd    	(JSPUtil.getParameter(request, "bkg_shpr_xpt_decl_cd    		".trim(), ""));
			model.setBkg_agn_cd              	(JSPUtil.getParameter(request, "bkg_agn_cd              		".trim(), ""));
			model.setEq_ctrl_ofc_cd          	(JSPUtil.getParameter(request, "eq_ctrl_ofc_cd          		".trim(), ""));
			model.setPkup_loc_yd_cd          	(JSPUtil.getParameter(request, "pkup_loc_yd_cd          		".trim(), ""));
			model.setBkg_corr_no             	(JSPUtil.getParameter(request, "bkg_corr_no             		".trim(), ""));
			model.setCa_usr_id               	(JSPUtil.getParameter(request, "ca_usr_id               		".trim(), ""));
			model.setBkg_corr_ofc_cd         	(JSPUtil.getParameter(request, "bkg_corr_ofc_cd         		".trim(), ""));
			model.setCorr_dt                 	(JSPUtil.getParameter(request, "corr_dt                 		".trim(), ""));
			model.setBl_prn_wgt_flg          	(JSPUtil.getParameter(request, "bl_prn_wgt_flg          		".trim(), ""));
			model.setBkg_cre_flg             	(JSPUtil.getParameter(request, "bkg_cre_flg             		".trim(), ""));
			model.setOop_loc_cd              	(JSPUtil.getParameter(request, "oop_loc_cd              		".trim(), ""));
			model.setPfd_loc_cd              	(JSPUtil.getParameter(request, "pfd_loc_cd              		".trim(), ""));
			model.setDbl_bkg_flg             	(JSPUtil.getParameter(request, "dbl_bkg_flg             		".trim(), ""));
			model.setAp_brog_flg             	(JSPUtil.getParameter(request, "ap_brog_flg             		".trim(), ""));
			model.setBis_sys_flg             	(JSPUtil.getParameter(request, "bis_sys_flg             		".trim(), ""));
			model.setNis_evnt_dt             	(JSPUtil.getParameter(request, "nis_evnt_dt             		".trim(), ""));
			model.setBkg_xter_rmk            	(JSPUtil.getParameter(request, "bkg_xter_rmk            		".trim(), ""));
			model.setXter_bkg_cd             	(JSPUtil.getParameter(request, "xter_bkg_cd             		".trim(), ""));
			model.setBkg_rev_aud_flg         	(JSPUtil.getParameter(request, "bkg_rev_aud_flg         		".trim(), ""));
			model.setSpcl_hide_flg           	(JSPUtil.getParameter(request, "spcl_hide_flg           		".trim(), ""));
			model.setCust_rlse_flg           	(JSPUtil.getParameter(request, "cust_rlse_flg           		".trim(), ""));
			model.setCdr_cng_flg             	(JSPUtil.getParameter(request, "cdr_cng_flg             		".trim(), ""));
			model.setRcdr_dt                 	(JSPUtil.getParameter(request, "rcdr_dt                 		".trim(), ""));
			model.setCdr_vsl_cd              	(JSPUtil.getParameter(request, "cdr_vsl_cd              		".trim(), ""));
			model.setCdr_skd_voy_no          	(JSPUtil.getParameter(request, "cdr_skd_voy_no          		".trim(), ""));
			model.setCdr_skd_dir_cd          	(JSPUtil.getParameter(request, "cdr_skd_dir_cd          		".trim(), ""));
			model.setCdr_pol_cd              	(JSPUtil.getParameter(request, "cdr_pol_cd              		".trim(), ""));
			model.setMty_bkg_cd              	(JSPUtil.getParameter(request, "mty_bkg_cd              		".trim(), ""));
			model.setCdr_dchg_port_cd        	(JSPUtil.getParameter(request, "cdr_dchg_port_cd        		".trim(), ""));
			model.setBkg_pod_tml_cd          	(JSPUtil.getParameter(request, "bkg_pod_tml_cd          		".trim(), ""));
			model.setFd_grd_flg              	(JSPUtil.getParameter(request, "fd_grd_flg              		".trim(), ""));
			model.setOrg_trns_mod_cd         	(JSPUtil.getParameter(request, "org_trns_mod_cd         		".trim(), ""));
			model.setDest_trns_mod_cd        	(JSPUtil.getParameter(request, "dest_trns_mod_cd        		".trim(), ""));
			model.setRail_blk_flg            	(JSPUtil.getParameter(request, "rail_blk_flg            		".trim(), ""));
			model.setRail_blk_cd             	(JSPUtil.getParameter(request, "rail_blk_cd             		".trim(), ""));
			model.setMcntr_dor_arr_dt        	(JSPUtil.getParameter(request, "mcntr_dor_arr_dt        		".trim(), ""));
			model.setLodg_due_dt             	(JSPUtil.getParameter(request, "lodg_due_dt             		".trim(), ""));
			model.setDe_due_dt               	(JSPUtil.getParameter(request, "de_due_dt               		".trim(), ""));
			model.setPor_zn_cd               	(JSPUtil.getParameter(request, "por_zn_cd               		".trim(), ""));
			model.setDel_zn_cd               	(JSPUtil.getParameter(request, "del_zn_cd               		".trim(), ""));
			model.setPctl_no                 	(JSPUtil.getParameter(request, "pctl_no                 		".trim(), ""));
			model.setUnd_cm_flg              	(JSPUtil.getParameter(request, "und_cm_flg              		".trim(), ""));
			model.setEai_evnt_dt             	(JSPUtil.getParameter(request, "eai_evnt_dt             		".trim(), ""));
			
			model.setSpcl_prct_cgo_flg          (JSPUtil.getParameter(request, "spcl_prct_cgo_flg             	".trim(), ""));
			model.setCntr_full_pkup_loc_cd      (JSPUtil.getParameter(request, "cntr_full_pkup_loc_cd           ".trim(), ""));
			model.setCntr_full_pkup_yd_cd       (JSPUtil.getParameter(request, "cntr_full_pkup_yd_cd            ".trim(), ""));
			model.setCtrt_ofc_cd             	(JSPUtil.getParameter(request, "ctrt_ofc_cd             		".trim(), ""));
			model.setCtrt_srep_cd             	(JSPUtil.getParameter(request, "ctrt_srep_cd             		".trim(), ""));
			
			model.setIb_del_de_dt             	(JSPUtil.getParameter(request, "ib_del_de_dt             		".trim(), ""));
			model.setIb_mty_rtn_yd_cd           (JSPUtil.getParameter(request, "ib_mty_rtn_yd_cd            	".trim(), ""));
			model.setBl_mst_bkg_no             	(JSPUtil.getParameter(request, "bl_mst_bkg_no             		".trim(), ""));
			model.setBl_mst_bkg_no_split        (JSPUtil.getParameter(request, "bl_mst_bkg_no_split             ".trim(), ""));
			
			model.setPol_zone_cd        (JSPUtil.getParameter(request, "pol_zone_cd             ".trim(), ""));
			
			model.setBlck_stwg_cd        		(JSPUtil.getParameter(request, "blck_stwg_cd             		".trim(), "")); // 2008 03 07 hyunsu added 
			model.setCntr_tpsz_mix_flg			(JSPUtil.getParameter(request, "cntr_tpsz_mix_flg				".trim(), "")); // 2008 04 18 hyunsu added 			
			
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		BKG_BOOKING model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag                   =  (JSPUtil.getParameter(request, "ibflag                  		".trim(), length));
			String[] page_rows                =  (JSPUtil.getParameter(request, "page_rows               		".trim(), length));
			String[] bkg_no                   =  (JSPUtil.getParameter(request, "bkg_no                  		".trim(), length));
			String[] bkg_no_split             =  (JSPUtil.getParameter(request, "bkg_no_split            		".trim(), length));
			String[] vsl_cd                   =  (JSPUtil.getParameter(request, "vsl_cd                  		".trim(), length));
			String[] skd_voy_no               =  (JSPUtil.getParameter(request, "skd_voy_no              		".trim(), length));
			String[] skd_dir_cd               =  (JSPUtil.getParameter(request, "skd_dir_cd              		".trim(), length));
			String[] slan_cd                  =  (JSPUtil.getParameter(request, "slan_cd                 		".trim(), length));
			String[] por_cd                   =  (JSPUtil.getParameter(request, "por_cd                  		".trim(), length));
			String[] pol_cd                   =  (JSPUtil.getParameter(request, "pol_cd                  		".trim(), length));
			String[] pod_cd                   =  (JSPUtil.getParameter(request, "pod_cd                  		".trim(), length));
			String[] del_cd                   =  (JSPUtil.getParameter(request, "del_cd                  		".trim(), length));
			String[] pre_rly_port_cd          =  (JSPUtil.getParameter(request, "pre_rly_port_cd         		".trim(), length));
			String[] pst_rly_port_cd          =  (JSPUtil.getParameter(request, "pst_rly_port_cd         		".trim(), length));
			String[] bkg_ofc_cd               =  (JSPUtil.getParameter(request, "bkg_ofc_cd              		".trim(), length));
			String[] rhq_cd                   =  (JSPUtil.getParameter(request, "rhq_cd                  		".trim(), length));
			String[] rgn_ofc_cd               =  (JSPUtil.getParameter(request, "rgn_ofc_cd              		".trim(), length));
			String[] bkg_sls_ofc_cd           =  (JSPUtil.getParameter(request, "bkg_sls_ofc_cd          		".trim(), length));
			String[] bkg_ib_sls_ofc_cd        =  (JSPUtil.getParameter(request, "bkg_ib_sls_ofc_cd       		".trim(), length));
			String[] bkg_split_cd             =  (JSPUtil.getParameter(request, "bkg_split_cd            		".trim(), length));
			String[] bkg_doc_usr_id           =  (JSPUtil.getParameter(request, "bkg_doc_usr_id          		".trim(), length));
			String[] bkg_cre_dt               =  (JSPUtil.getParameter(request, "bkg_cre_dt              		".trim(), length));
			String[] sl_rep_cd                =  (JSPUtil.getParameter(request, "sl_rep_cd               		".trim(), length));
			String[] bkg_sts_cd               =  (JSPUtil.getParameter(request, "bkg_sts_cd              		".trim(), length));
			String[] bkg_wt_rsn_cd            =  (JSPUtil.getParameter(request, "bkg_wt_rsn_cd           		".trim(), length));
			String[] bkg_cntr_rsn_flg         =  (JSPUtil.getParameter(request, "bkg_cntr_rsn_flg        		".trim(), length));
			String[] bkg_prohi_cmdt_rsn_flg   =  (JSPUtil.getParameter(request, "bkg_prohi_cmdt_rsn_flg  		".trim(), length));
			String[] bkg_not_net_rev_rsn_flg  =  (JSPUtil.getParameter(request, "bkg_not_net_rev_rsn_flg 		".trim(), length));
			String[] bkg_dg_cgo_auth_rsn_flg  =  (JSPUtil.getParameter(request, "bkg_dg_cgo_auth_rsn_flg 		".trim(), length));
			String[] bkg_awk_cgo_auth_rsn_flg =  (JSPUtil.getParameter(request, "bkg_awk_cgo_auth_rsn_flg		".trim(), length));
			String[] bkg_prohi_dest_rsn_flg   =  (JSPUtil.getParameter(request, "bkg_prohi_dest_rsn_flg  		".trim(), length));
			String[] bkg_rc_rsn_flg           =  (JSPUtil.getParameter(request, "bkg_rc_rsn_flg          		".trim(), length));
			String[] bkg_bb_rsn_flg           =  (JSPUtil.getParameter(request, "bkg_bb_rsn_flg          		".trim(), length));
			String[] bkg_fcty_rsn_flg         =  (JSPUtil.getParameter(request, "bkg_fcty_rsn_flg        		".trim(), length));
			String[] bkg_otr_rsn_flg          =  (JSPUtil.getParameter(request, "bkg_otr_rsn_flg         		".trim(), length));
			String[] bkg_rqst_dt              =  (JSPUtil.getParameter(request, "bkg_rqst_dt             		".trim(), length));
			String[] bkg_cgo_tp_cd            =  (JSPUtil.getParameter(request, "bkg_cgo_tp_cd           		".trim(), length));
			String[] bkg_adv_shtg_cd          =  (JSPUtil.getParameter(request, "bkg_adv_shtg_cd         		".trim(), length));
			String[] bkg_hot_de_flg           =  (JSPUtil.getParameter(request, "bkg_hot_de_flg          		".trim(), length));
			String[] nvocc_cd                 =  (JSPUtil.getParameter(request, "nvocc_cd                		".trim(), length));
			String[] rcv_term_cd              =  (JSPUtil.getParameter(request, "rcv_term_cd             		".trim(), length));
			String[] bkg_rcv_dor_cd           =  (JSPUtil.getParameter(request, "bkg_rcv_dor_cd          		".trim(), length));
			String[] de_term_cd               =  (JSPUtil.getParameter(request, "de_term_cd              		".trim(), length));
			String[] bkg_de_dor_cd            =  (JSPUtil.getParameter(request, "bkg_de_dor_cd           		".trim(), length));
			String[] bkg_fnl_dest_cd          =  (JSPUtil.getParameter(request, "bkg_fnl_dest_cd         		".trim(), length));
			String[] bkg_ocp_cd               =  (JSPUtil.getParameter(request, "bkg_ocp_cd              		".trim(), length));
			String[] cmdt_cd                  =  (JSPUtil.getParameter(request, "cmdt_cd                 		".trim(), length));
			String[] cmdt_dtl_cd              =  (JSPUtil.getParameter(request, "cmdt_dtl_cd             		".trim(), length));
			String[] rep_cmdt_cd              =  (JSPUtil.getParameter(request, "rep_cmdt_cd             		".trim(), length));
			String[] spcl_dg_cgo_flg          =  (JSPUtil.getParameter(request, "spcl_dg_cgo_flg         		".trim(), length));
			String[] spcl_rc_flg              =  (JSPUtil.getParameter(request, "spcl_rc_flg             		".trim(), length));
			String[] spcl_awk_cgo_flg         =  (JSPUtil.getParameter(request, "spcl_awk_cgo_flg        		".trim(), length));
			String[] spcl_bb_cgo_flg          =  (JSPUtil.getParameter(request, "spcl_bb_cgo_flg         		".trim(), length));
			String[] spcl_rd_cgo_flg          =  (JSPUtil.getParameter(request, "spcl_rd_cgo_flg         		".trim(), length));
			String[] pck_qty                  =  (JSPUtil.getParameter(request, "pck_qty                 		".trim(), length));
			String[] pck_tp_cd                =  (JSPUtil.getParameter(request, "pck_tp_cd               		".trim(), length));
			String[] bkg_meas_qty             =  (JSPUtil.getParameter(request, "bkg_meas_qty            		".trim(), length));
			String[] bkg_meas_tp_cd           =  (JSPUtil.getParameter(request, "bkg_meas_tp_cd          		".trim(), length));
			String[] act_bkg_wgt              =  (JSPUtil.getParameter(request, "act_bkg_wgt             		".trim(), length));
			String[] act_bkg_wgt_tp_cd        =  (JSPUtil.getParameter(request, "act_bkg_wgt_tp_cd       		".trim(), length));
			String[] estm_bkg_wgt             =  (JSPUtil.getParameter(request, "estm_bkg_wgt            		".trim(), length));
			String[] estm_bkg_wgt_tp_cd       =  (JSPUtil.getParameter(request, "estm_bkg_wgt_tp_cd      		".trim(), length));
			String[] lc_no                    =  (JSPUtil.getParameter(request, "lc_no                   		".trim(), length));
			String[] bkg_edi_ref_no           =  (JSPUtil.getParameter(request, "bkg_edi_ref_no          		".trim(), length));
			String[] org_svc_mod_cd           =  (JSPUtil.getParameter(request, "org_svc_mod_cd          		".trim(), length));
			String[] dest_svc_mod_cd          =  (JSPUtil.getParameter(request, "dest_svc_mod_cd         		".trim(), length));
			String[] twn_so_no                =  (JSPUtil.getParameter(request, "twn_so_no               		".trim(), length));
			String[] scac_no                  =  (JSPUtil.getParameter(request, "scac_no                 		".trim(), length));
			String[] bkg_rmk                  =  (JSPUtil.getParameter(request, "bkg_rmk                 		".trim(), length));
			String[] spcl_cgo_auth_seq        =  (JSPUtil.getParameter(request, "spcl_cgo_auth_seq       		".trim(), length));
			String[] bl_no                    =  (JSPUtil.getParameter(request, "bl_no                   		".trim(), length));
			String[] bl_no_tp                 =  (JSPUtil.getParameter(request, "bl_no_tp                		".trim(), length));
			String[] bl_no_chk                =  (JSPUtil.getParameter(request, "bl_no_chk               		".trim(), length));
			String[] bl_tp_cd                 =  (JSPUtil.getParameter(request, "bl_tp_cd                		".trim(), length));
			String[] bkg_cxl_dt               =  (JSPUtil.getParameter(request, "bkg_cxl_dt              		".trim(), length));
			String[] bkg_pson_nm              =  (JSPUtil.getParameter(request, "bkg_pson_nm             		".trim(), length));
			String[] bkg_pson_telcm_no        =  (JSPUtil.getParameter(request, "bkg_pson_telcm_no       		".trim(), length));
			String[] bkg_pson_fax_no          =  (JSPUtil.getParameter(request, "bkg_pson_fax_no         		".trim(), length));
			String[] bkg_pson_eml             =  (JSPUtil.getParameter(request, "bkg_pson_eml            		".trim(), length));
			String[] bkg_hot_de_dt            =  (JSPUtil.getParameter(request, "bkg_hot_de_dt           		".trim(), length));
			String[] bkg_org_rout_cd          =  (JSPUtil.getParameter(request, "bkg_org_rout_cd         		".trim(), length));
			String[] dest_rout_cd             =  (JSPUtil.getParameter(request, "dest_rout_cd            		".trim(), length));
			String[] psa_no                   =  (JSPUtil.getParameter(request, "psa_no                  		".trim(), length));
			String[] ref_no                   =  (JSPUtil.getParameter(request, "ref_no                  		".trim(), length));
			String[] qurn_no                  =  (JSPUtil.getParameter(request, "qurn_no                 		".trim(), length));
			String[] qurn_nm                  =  (JSPUtil.getParameter(request, "qurn_nm                 		".trim(), length));
			String[] sr_flg                   =  (JSPUtil.getParameter(request, "sr_flg                  		".trim(), length));
			String[] ib_trns_flg              =  (JSPUtil.getParameter(request, "ib_trns_flg             		".trim(), length));
			String[] bkg_bd_tp_cd             =  (JSPUtil.getParameter(request, "bkg_bd_tp_cd            		".trim(), length));
			String[] bkg_bd_cd                =  (JSPUtil.getParameter(request, "bkg_bd_cd               		".trim(), length));
			String[] wr_hus_cd                =  (JSPUtil.getParameter(request, "wr_hus_cd               		".trim(), length));
			String[] bkg_cgo_dt               =  (JSPUtil.getParameter(request, "bkg_cgo_dt              		".trim(), length));
			String[] bkg_hngr_flg             =  (JSPUtil.getParameter(request, "bkg_hngr_flg            		".trim(), length));
			String[] bkg_shpr_ownr_flg        =  (JSPUtil.getParameter(request, "bkg_shpr_ownr_flg       		".trim(), length));
			String[] eq_subst_flg             =  (JSPUtil.getParameter(request, "eq_subst_flg            		".trim(), length));
			String[] org_hlg_flg              =  (JSPUtil.getParameter(request, "org_hlg_flg             		".trim(), length));
			String[] dest_hlg_flg             =  (JSPUtil.getParameter(request, "dest_hlg_flg            		".trim(), length));
			String[] pkup_loc_cd              =  (JSPUtil.getParameter(request, "pkup_loc_cd             		".trim(), length));
			String[] pkup_yd_cd               =  (JSPUtil.getParameter(request, "pkup_yd_cd              		".trim(), length));
			String[] pkup_dt                  =  (JSPUtil.getParameter(request, "pkup_dt                 		".trim(), length));
			String[] rtn_loc_cd               =  (JSPUtil.getParameter(request, "rtn_loc_cd              		".trim(), length));
			String[] rtn_yd_cd                =  (JSPUtil.getParameter(request, "rtn_yd_cd               		".trim(), length));
			String[] cntr_lst_cfm_dt          =  (JSPUtil.getParameter(request, "cntr_lst_cfm_dt         		".trim(), length));
			String[] bkg_lst_cfm_usr_id       =  (JSPUtil.getParameter(request, "bkg_lst_cfm_usr_id      		".trim(), length));
			String[] bkg_rt_aply_dt           =  (JSPUtil.getParameter(request, "bkg_rt_aply_dt          		".trim(), length));
			String[] cbf_flg                  =  (JSPUtil.getParameter(request, "cbf_flg                 		".trim(), length));
			String[] cbf_itm_chk_flg          =  (JSPUtil.getParameter(request, "cbf_itm_chk_flg         		".trim(), length));
			String[] bkg_bdr_dt               =  (JSPUtil.getParameter(request, "bkg_bdr_dt              		".trim(), length));
			String[] bkg_bdr_cng_flg          =  (JSPUtil.getParameter(request, "bkg_bdr_cng_flg         		".trim(), length));
			String[] bkg_bdr_flg              =  (JSPUtil.getParameter(request, "bkg_bdr_flg             		".trim(), length));
			String[] bkg_cntr_mf_cfm_flg      =  (JSPUtil.getParameter(request, "bkg_cntr_mf_cfm_flg     		".trim(), length));
			String[] hcos_bkg_no              =  (JSPUtil.getParameter(request, "hcos_bkg_no             		".trim(), length));
			String[] hcos_bkg_no_split        =  (JSPUtil.getParameter(request, "hcos_bkg_no_split       		".trim(), length));
			String[] bkg_gen_cd               =  (JSPUtil.getParameter(request, "bkg_gen_cd              		".trim(), length));
			String[] bkg_cntr_frm_flg         =  (JSPUtil.getParameter(request, "bkg_cntr_frm_flg        		".trim(), length));
			String[] bkg_cfm_snt_flg          =  (JSPUtil.getParameter(request, "bkg_cfm_snt_flg         		".trim(), length));
			String[] bkg_cfm_snt_dt           =  (JSPUtil.getParameter(request, "bkg_cfm_snt_dt          		".trim(), length));
			String[] bkg_frt_fwrd_flg         =  (JSPUtil.getParameter(request, "bkg_frt_fwrd_flg        		".trim(), length));
			String[] bkg_lst_ca_iss_dt        =  (JSPUtil.getParameter(request, "bkg_lst_ca_iss_dt       		".trim(), length));
			String[] cmb_bkg_no               =  (JSPUtil.getParameter(request, "cmb_bkg_no              		".trim(), length));
			String[] cmb_bkg_no_split         =  (JSPUtil.getParameter(request, "cmb_bkg_no_split        		".trim(), length));
			String[] finc_dir_cd              =  (JSPUtil.getParameter(request, "finc_dir_cd             		".trim(), length));
			String[] bkg_cbf_auth_flg         =  (JSPUtil.getParameter(request, "bkg_cbf_auth_flg        		".trim(), length));
			String[] bkg_shpr_xpt_decl_cd     =  (JSPUtil.getParameter(request, "bkg_shpr_xpt_decl_cd    		".trim(), length));
			String[] bkg_agn_cd               =  (JSPUtil.getParameter(request, "bkg_agn_cd              		".trim(), length));
			String[] eq_ctrl_ofc_cd           =  (JSPUtil.getParameter(request, "eq_ctrl_ofc_cd          		".trim(), length));
			String[] pkup_loc_yd_cd           =  (JSPUtil.getParameter(request, "pkup_loc_yd_cd          		".trim(), length));
			String[] bkg_corr_no              =  (JSPUtil.getParameter(request, "bkg_corr_no             		".trim(), length));
			String[] ca_usr_id                =  (JSPUtil.getParameter(request, "ca_usr_id               		".trim(), length));
			String[] bkg_corr_ofc_cd          =  (JSPUtil.getParameter(request, "bkg_corr_ofc_cd         		".trim(), length));
			String[] corr_dt                  =  (JSPUtil.getParameter(request, "corr_dt                 		".trim(), length));
			String[] bl_prn_wgt_flg           =  (JSPUtil.getParameter(request, "bl_prn_wgt_flg          		".trim(), length));
			String[] bkg_cre_flg              =  (JSPUtil.getParameter(request, "bkg_cre_flg             		".trim(), length));
			String[] oop_loc_cd               =  (JSPUtil.getParameter(request, "oop_loc_cd              		".trim(), length));
			String[] pfd_loc_cd               =  (JSPUtil.getParameter(request, "pfd_loc_cd              		".trim(), length));
			String[] dbl_bkg_flg              =  (JSPUtil.getParameter(request, "dbl_bkg_flg             		".trim(), length));
			String[] ap_brog_flg              =  (JSPUtil.getParameter(request, "ap_brog_flg             		".trim(), length));
			String[] bis_sys_flg              =  (JSPUtil.getParameter(request, "bis_sys_flg             		".trim(), length));
			String[] nis_evnt_dt              =  (JSPUtil.getParameter(request, "nis_evnt_dt             		".trim(), length));
			String[] bkg_xter_rmk             =  (JSPUtil.getParameter(request, "bkg_xter_rmk            		".trim(), length));
			String[] xter_bkg_cd              =  (JSPUtil.getParameter(request, "xter_bkg_cd             		".trim(), length));
			String[] bkg_rev_aud_flg          =  (JSPUtil.getParameter(request, "bkg_rev_aud_flg         		".trim(), length));
			String[] spcl_hide_flg            =  (JSPUtil.getParameter(request, "spcl_hide_flg           		".trim(), length));
			String[] cust_rlse_flg            =  (JSPUtil.getParameter(request, "cust_rlse_flg           		".trim(), length));
			String[] cdr_cng_flg              =  (JSPUtil.getParameter(request, "cdr_cng_flg             		".trim(), length));
			String[] rcdr_dt                  =  (JSPUtil.getParameter(request, "rcdr_dt                 		".trim(), length));
			String[] cdr_vsl_cd               =  (JSPUtil.getParameter(request, "cdr_vsl_cd              		".trim(), length));
			String[] cdr_skd_voy_no           =  (JSPUtil.getParameter(request, "cdr_skd_voy_no          		".trim(), length));
			String[] cdr_skd_dir_cd           =  (JSPUtil.getParameter(request, "cdr_skd_dir_cd          		".trim(), length));
			String[] cdr_pol_cd               =  (JSPUtil.getParameter(request, "cdr_pol_cd              		".trim(), length));
			String[] mty_bkg_cd               =  (JSPUtil.getParameter(request, "mty_bkg_cd              		".trim(), length));
			String[] cdr_dchg_port_cd         =  (JSPUtil.getParameter(request, "cdr_dchg_port_cd        		".trim(), length));
			String[] bkg_pod_tml_cd           =  (JSPUtil.getParameter(request, "bkg_pod_tml_cd          		".trim(), length));
			String[] fd_grd_flg               =  (JSPUtil.getParameter(request, "fd_grd_flg              		".trim(), length));
			String[] org_trns_mod_cd          =  (JSPUtil.getParameter(request, "org_trns_mod_cd         		".trim(), length));
			String[] dest_trns_mod_cd         =  (JSPUtil.getParameter(request, "dest_trns_mod_cd        		".trim(), length));
			String[] rail_blk_flg             =  (JSPUtil.getParameter(request, "rail_blk_flg            		".trim(), length));
			String[] rail_blk_cd              =  (JSPUtil.getParameter(request, "rail_blk_cd             		".trim(), length));
			String[] mcntr_dor_arr_dt         =  (JSPUtil.getParameter(request, "mcntr_dor_arr_dt        		".trim(), length));
			String[] lodg_due_dt              =  (JSPUtil.getParameter(request, "lodg_due_dt             		".trim(), length));
			String[] de_due_dt                =  (JSPUtil.getParameter(request, "de_due_dt               		".trim(), length));
			String[] por_zn_cd                =  (JSPUtil.getParameter(request, "por_zn_cd               		".trim(), length));
			String[] del_zn_cd                =  (JSPUtil.getParameter(request, "del_zn_cd               		".trim(), length));
			String[] pctl_no                  =  (JSPUtil.getParameter(request, "pctl_no                 		".trim(), length));
			String[] und_cm_flg               =  (JSPUtil.getParameter(request, "und_cm_flg              		".trim(), length));
			String[] eai_evnt_dt              =  (JSPUtil.getParameter(request, "eai_evnt_dt             		".trim(), length));
			
			String[] spcl_prct_cgo_flg        =  (JSPUtil.getParameter(request, "spcl_prct_cgo_flg             	".trim(), length));
			String[] cntr_full_pkup_loc_cd    =  (JSPUtil.getParameter(request, "cntr_full_pkup_loc_cd          ".trim(), length));
			String[] cntr_full_pkup_yd_cd     =  (JSPUtil.getParameter(request, "cntr_full_pkup_yd_cd           ".trim(), length));
			String[] ctrt_ofc_cd              =  (JSPUtil.getParameter(request, "ctrt_ofc_cd             		".trim(), length));
			String[] ctrt_srep_cd             =  (JSPUtil.getParameter(request, "ctrt_srep_cd             		".trim(), length));
			
			String[] ib_del_de_dt            =  (JSPUtil.getParameter(request, "ib_del_de_dt             		".trim(), length));
			String[] ib_mty_rtn_yd_cd     =  (JSPUtil.getParameter(request, "ib_mty_rtn_yd_cd           ".trim(), length));
			String[] bl_mst_bkg_no            =  (JSPUtil.getParameter(request, "bl_mst_bkg_no             		".trim(), length));
			String[] bl_mst_bkg_no_split      =  (JSPUtil.getParameter(request, "bl_mst_bkg_no_split            ".trim(), length));
			
			String[] pol_zone_cd      =  (JSPUtil.getParameter(request, "pol_zone_cd            ".trim(), length));
			
			String[] blck_stwg_cd      		  =  (JSPUtil.getParameter(request, "blck_stwg_cd            		".trim(), length));  // 2008 03 07 hyunsu added 
			String[] cntr_tpsz_mix_flg		  =  (JSPUtil.getParameter(request, "cntr_tpsz_mix_flg         		".trim(), length));  // 2008 04 18 hyunsu added 
			
			
			for (int i = 0; i < length; i++) {
				model = new BKG_BOOKING();
				model.setIbflag                  		  (ibflag                  	[i]);
				model.setPage_rows               		  (page_rows               	[i]);
				model.setBkg_no                  		  (bkg_no                  	[i]);
				model.setBkg_no_split            		  (bkg_no_split            	[i]);
				model.setVsl_cd                  		  (vsl_cd                  	[i]);
				model.setSkd_voy_no              		  (skd_voy_no              	[i]);
				model.setSkd_dir_cd              		  (skd_dir_cd              	[i]);
				model.setSlan_cd                 		  (slan_cd                 	[i]);
				model.setPor_cd                  		  (por_cd                  	[i]);
				model.setPol_cd                  		  (pol_cd                  	[i]);
				model.setPod_cd                  		  (pod_cd                  	[i]);
				model.setDel_cd                  		  (del_cd                  	[i]);
				model.setPre_rly_port_cd         		  (pre_rly_port_cd         	[i]);
				model.setPst_rly_port_cd         		  (pst_rly_port_cd         	[i]);
				model.setBkg_ofc_cd              		  (bkg_ofc_cd              	[i]);
				model.setRhq_cd                  		  (rhq_cd                  	[i]);
				model.setRgn_ofc_cd              		  (rgn_ofc_cd              	[i]);
				model.setBkg_sls_ofc_cd          		  (bkg_sls_ofc_cd          	[i]);
				model.setBkg_ib_sls_ofc_cd       		  (bkg_ib_sls_ofc_cd       	[i]);
				model.setBkg_split_cd            		  (bkg_split_cd            	[i]);
				model.setBkg_doc_usr_id          		  (bkg_doc_usr_id          	[i]);
				model.setBkg_cre_dt              		  (bkg_cre_dt              	[i]);
				model.setSl_rep_cd               		  (sl_rep_cd               	[i]);
				model.setBkg_sts_cd              		  (bkg_sts_cd              	[i]);
				model.setBkg_wt_rsn_cd           		  (bkg_wt_rsn_cd           	[i]);
				model.setBkg_cntr_rsn_flg        		  (bkg_cntr_rsn_flg        	[i]);
				model.setBkg_prohi_cmdt_rsn_flg  		  (bkg_prohi_cmdt_rsn_flg  	[i]);
				model.setBkg_not_net_rev_rsn_flg 		  (bkg_not_net_rev_rsn_flg 	[i]);
				model.setBkg_dg_cgo_auth_rsn_flg 		  (bkg_dg_cgo_auth_rsn_flg 	[i]);
				model.setBkg_awk_cgo_auth_rsn_flg		  (bkg_awk_cgo_auth_rsn_flg	[i]);
				model.setBkg_prohi_dest_rsn_flg  		  (bkg_prohi_dest_rsn_flg  	[i]);
				model.setBkg_rc_rsn_flg          		  (bkg_rc_rsn_flg          	[i]);
				model.setBkg_bb_rsn_flg          		  (bkg_bb_rsn_flg          	[i]);
				model.setBkg_fcty_rsn_flg        		  (bkg_fcty_rsn_flg        	[i]);
				model.setBkg_otr_rsn_flg         		  (bkg_otr_rsn_flg         	[i]);
				model.setBkg_rqst_dt             		  (bkg_rqst_dt             	[i]);
				model.setBkg_cgo_tp_cd           		  (bkg_cgo_tp_cd           	[i]);
				model.setBkg_adv_shtg_cd         		  (bkg_adv_shtg_cd         	[i]);
				model.setBkg_hot_de_flg          		  (bkg_hot_de_flg          	[i]);
				model.setNvocc_cd                		  (nvocc_cd                	[i]);
				model.setRcv_term_cd             		  (rcv_term_cd             	[i]);
				model.setBkg_rcv_dor_cd          		  (bkg_rcv_dor_cd          	[i]);
				model.setDe_term_cd              		  (de_term_cd              	[i]);
				model.setBkg_de_dor_cd           		  (bkg_de_dor_cd           	[i]);
				model.setBkg_fnl_dest_cd         		  (bkg_fnl_dest_cd         	[i]);
				model.setBkg_ocp_cd              		  (bkg_ocp_cd              	[i]);
				model.setCmdt_cd                 		  (cmdt_cd                 	[i]);
				model.setCmdt_dtl_cd             		  (cmdt_dtl_cd             	[i]);
				model.setRep_cmdt_cd             		  (rep_cmdt_cd             	[i]);
				model.setSpcl_dg_cgo_flg         		  (spcl_dg_cgo_flg         	[i]);
				model.setSpcl_rc_flg             		  (spcl_rc_flg             	[i]);
				model.setSpcl_awk_cgo_flg        		  (spcl_awk_cgo_flg        	[i]);
				model.setSpcl_bb_cgo_flg         		  (spcl_bb_cgo_flg         	[i]);
				model.setSpcl_rd_cgo_flg         		  (spcl_rd_cgo_flg         	[i]);
				model.setPck_qty                 		  (pck_qty                 	[i]);
				model.setPck_tp_cd               		  (pck_tp_cd               	[i]);
				model.setBkg_meas_qty            		  (bkg_meas_qty            	[i]);
				model.setBkg_meas_tp_cd          		  (bkg_meas_tp_cd          	[i]);
				model.setAct_bkg_wgt             		  (act_bkg_wgt             	[i]);
				model.setAct_bkg_wgt_tp_cd       		  (act_bkg_wgt_tp_cd       	[i]);
				model.setEstm_bkg_wgt            		  (estm_bkg_wgt            	[i]);
				model.setEstm_bkg_wgt_tp_cd      		  (estm_bkg_wgt_tp_cd      	[i]);
				model.setLc_no                   		  (lc_no                   	[i]);
				model.setBkg_edi_ref_no          		  (bkg_edi_ref_no          	[i]);
				model.setOrg_svc_mod_cd          		  (org_svc_mod_cd          	[i]);
				model.setDest_svc_mod_cd         		  (dest_svc_mod_cd         	[i]);
				model.setTwn_so_no               		  (twn_so_no               	[i]);
				model.setScac_no                 		  (scac_no                 	[i]);
				model.setBkg_rmk                 		  (bkg_rmk                 	[i]);
				model.setSpcl_cgo_auth_seq       		  (spcl_cgo_auth_seq       	[i]);
				model.setBl_no                   		  (bl_no                   	[i]);
				model.setBl_no_tp                		  (bl_no_tp                	[i]);
				model.setBl_no_chk               		  (bl_no_chk               	[i]);
				model.setBl_tp_cd                		  (bl_tp_cd                	[i]);
				model.setBkg_cxl_dt              		  (bkg_cxl_dt              	[i]);
				model.setBkg_pson_nm             		  (bkg_pson_nm             	[i]);
				model.setBkg_pson_telcm_no       		  (bkg_pson_telcm_no       	[i]);
				model.setBkg_pson_fax_no         		  (bkg_pson_fax_no         	[i]);
				model.setBkg_pson_eml            		  (bkg_pson_eml            	[i]);
				model.setBkg_hot_de_dt           		  (bkg_hot_de_dt           	[i]);
				model.setBkg_org_rout_cd         		  (bkg_org_rout_cd         	[i]);
				model.setDest_rout_cd            		  (dest_rout_cd            	[i]);
				model.setPsa_no                  		  (psa_no                  	[i]);
				model.setRef_no                  		  (ref_no                  	[i]);
				model.setQurn_no                 		  (qurn_no                 	[i]);
				model.setQurn_nm                 		  (qurn_nm                 	[i]);
				model.setSr_flg                  		  (sr_flg                  	[i]);
				model.setIb_trns_flg             		  (ib_trns_flg             	[i]);
				model.setBkg_bd_tp_cd            		  (bkg_bd_tp_cd            	[i]);
				model.setBkg_bd_cd               		  (bkg_bd_cd               	[i]);
				model.setWr_hus_cd               		  (wr_hus_cd               	[i]);
				model.setBkg_cgo_dt              		  (bkg_cgo_dt              	[i]);
				model.setBkg_hngr_flg            		  (bkg_hngr_flg            	[i]);
				model.setBkg_shpr_ownr_flg       		  (bkg_shpr_ownr_flg       	[i]);
				model.setEq_subst_flg            		  (eq_subst_flg            	[i]);
				model.setOrg_hlg_flg             		  (org_hlg_flg             	[i]);
				model.setDest_hlg_flg            		  (dest_hlg_flg            	[i]);
				model.setPkup_loc_cd             		  (pkup_loc_cd             	[i]);
				model.setPkup_yd_cd              		  (pkup_yd_cd              	[i]);
				model.setPkup_dt                 		  (pkup_dt                 	[i]);
				model.setRtn_loc_cd              		  (rtn_loc_cd              	[i]);
				model.setRtn_yd_cd               		  (rtn_yd_cd               	[i]);
				model.setCntr_lst_cfm_dt         		  (cntr_lst_cfm_dt         	[i]);
				model.setBkg_lst_cfm_usr_id      		  (bkg_lst_cfm_usr_id      	[i]);
				model.setBkg_rt_aply_dt          		  (bkg_rt_aply_dt          	[i]);
				model.setCbf_flg                 		  (cbf_flg                 	[i]);
				model.setCbf_itm_chk_flg         		  (cbf_itm_chk_flg         	[i]);
				model.setBkg_bdr_dt              		  (bkg_bdr_dt              	[i]);
				model.setBkg_bdr_cng_flg         		  (bkg_bdr_cng_flg         	[i]);
				model.setBkg_bdr_flg             		  (bkg_bdr_flg             	[i]);
				model.setBkg_cntr_mf_cfm_flg     		  (bkg_cntr_mf_cfm_flg     	[i]);
				model.setHcos_bkg_no             		  (hcos_bkg_no             	[i]);
				model.setHcos_bkg_no_split       		  (hcos_bkg_no_split       	[i]);
				model.setBkg_gen_cd              		  (bkg_gen_cd              	[i]);
				model.setBkg_cntr_frm_flg        		  (bkg_cntr_frm_flg        	[i]);
				model.setBkg_cfm_snt_flg         		  (bkg_cfm_snt_flg         	[i]);
				model.setBkg_cfm_snt_dt          		  (bkg_cfm_snt_dt          	[i]);
				model.setBkg_frt_fwrd_flg        		  (bkg_frt_fwrd_flg        	[i]);
				model.setBkg_lst_ca_iss_dt       		  (bkg_lst_ca_iss_dt       	[i]);
				model.setCmb_bkg_no              		  (cmb_bkg_no              	[i]);
				model.setCmb_bkg_no_split        		  (cmb_bkg_no_split        	[i]);
				model.setFinc_dir_cd             		  (finc_dir_cd             	[i]);
				model.setBkg_cbf_auth_flg        		  (bkg_cbf_auth_flg        	[i]);
				model.setBkg_shpr_xpt_decl_cd    		  (bkg_shpr_xpt_decl_cd    	[i]);
				model.setBkg_agn_cd              		  (bkg_agn_cd              	[i]);
				model.setEq_ctrl_ofc_cd          		  (eq_ctrl_ofc_cd          	[i]);
				model.setPkup_loc_yd_cd          		  (pkup_loc_yd_cd          	[i]);
				model.setBkg_corr_no             		  (bkg_corr_no             	[i]);
				model.setCa_usr_id               		  (ca_usr_id               	[i]);
				model.setBkg_corr_ofc_cd         		  (bkg_corr_ofc_cd         	[i]);
				model.setCorr_dt                 		  (corr_dt                 	[i]);
				model.setBl_prn_wgt_flg          		  (bl_prn_wgt_flg          	[i]);
				model.setBkg_cre_flg             		  (bkg_cre_flg             	[i]);
				model.setOop_loc_cd              		  (oop_loc_cd              	[i]);
				model.setPfd_loc_cd              		  (pfd_loc_cd              	[i]);
				model.setDbl_bkg_flg             		  (dbl_bkg_flg             	[i]);
				model.setAp_brog_flg             		  (ap_brog_flg             	[i]);
				model.setBis_sys_flg             		  (bis_sys_flg             	[i]);
				model.setNis_evnt_dt             		  (nis_evnt_dt             	[i]);
				model.setBkg_xter_rmk            		  (bkg_xter_rmk            	[i]);
				model.setXter_bkg_cd             		  (xter_bkg_cd             	[i]);
				model.setBkg_rev_aud_flg         		  (bkg_rev_aud_flg         	[i]);
				model.setSpcl_hide_flg           		  (spcl_hide_flg           	[i]);
				model.setCust_rlse_flg           		  (cust_rlse_flg           	[i]);
				model.setCdr_cng_flg             		  (cdr_cng_flg             	[i]);
				model.setRcdr_dt                 		  (rcdr_dt                 	[i]);
				model.setCdr_vsl_cd              		  (cdr_vsl_cd              	[i]);
				model.setCdr_skd_voy_no          		  (cdr_skd_voy_no          	[i]);
				model.setCdr_skd_dir_cd          		  (cdr_skd_dir_cd          	[i]);
				model.setCdr_pol_cd              		  (cdr_pol_cd              	[i]);
				model.setMty_bkg_cd              		  (mty_bkg_cd              	[i]);
				model.setCdr_dchg_port_cd        		  (cdr_dchg_port_cd        	[i]);
				model.setBkg_pod_tml_cd          		  (bkg_pod_tml_cd          	[i]);
				model.setFd_grd_flg              		  (fd_grd_flg              	[i]);
				model.setOrg_trns_mod_cd         		  (org_trns_mod_cd         	[i]);
				model.setDest_trns_mod_cd        		  (dest_trns_mod_cd        	[i]);
				model.setRail_blk_flg            		  (rail_blk_flg            	[i]);
				model.setRail_blk_cd             		  (rail_blk_cd             	[i]);
				model.setMcntr_dor_arr_dt        		  (mcntr_dor_arr_dt        	[i]);
				model.setLodg_due_dt             		  (lodg_due_dt             	[i]);
				model.setDe_due_dt               		  (de_due_dt               	[i]);
				model.setPor_zn_cd               		  (por_zn_cd               	[i]);
				model.setDel_zn_cd               		  (del_zn_cd               	[i]);
				model.setPctl_no                 		  (pctl_no                 	[i]);
				model.setUnd_cm_flg              		  (und_cm_flg              	[i]);
				model.setEai_evnt_dt             		  (eai_evnt_dt             	[i]);
				
				model.setSpcl_prct_cgo_flg             	  (spcl_prct_cgo_flg        [i]);
				model.setCntr_full_pkup_loc_cd            (cntr_full_pkup_loc_cd    [i]);
				model.setCntr_full_pkup_yd_cd             (cntr_full_pkup_yd_cd     [i]);
				model.setCtrt_ofc_cd             		  (ctrt_ofc_cd             	[i]);
				model.setCtrt_srep_cd             		  (ctrt_srep_cd             [i]);

				model.setIb_del_de_dt             		  (ib_del_de_dt             [i]);
				model.setIb_mty_rtn_yd_cd             	  (ib_mty_rtn_yd_cd     	[i]);
				model.setBl_mst_bkg_no             		  (bl_mst_bkg_no            [i]);
				model.setBl_mst_bkg_no_split              (bl_mst_bkg_no_split      [i]);
				
				model.setPol_zone_cd              (pol_zone_cd      [i]);
				
				model.setBlck_stwg_cd              		  (blck_stwg_cd      		[i]); // 2008 03 07 hyunsu added
				model.setCntr_tpsz_mix_flg				  (cntr_tpsz_mix_flg		[i]); // 2008 04 18 HYUNSU ADDED 
				
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		BKG_BOOKING model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag                   =  (JSPUtil.getParameter(request, prefix + "ibflag                  		".trim(), length));
			String[] page_rows                =  (JSPUtil.getParameter(request, prefix + "page_rows               		".trim(), length));
			String[] bkg_no                   =  (JSPUtil.getParameter(request, prefix + "bkg_no                  		".trim(), length));
			String[] bkg_no_split             =  (JSPUtil.getParameter(request, prefix + "bkg_no_split            		".trim(), length));
			String[] vsl_cd                   =  (JSPUtil.getParameter(request, prefix + "vsl_cd                  		".trim(), length));
			String[] skd_voy_no               =  (JSPUtil.getParameter(request, prefix + "skd_voy_no              		".trim(), length));
			String[] skd_dir_cd               =  (JSPUtil.getParameter(request, prefix + "skd_dir_cd              		".trim(), length));
			String[] slan_cd                  =  (JSPUtil.getParameter(request, prefix + "slan_cd                 		".trim(), length));
			String[] por_cd                   =  (JSPUtil.getParameter(request, prefix + "por_cd                  		".trim(), length));
			String[] pol_cd                   =  (JSPUtil.getParameter(request, prefix + "pol_cd                  		".trim(), length));
			String[] pod_cd                   =  (JSPUtil.getParameter(request, prefix + "pod_cd                  		".trim(), length));
			String[] del_cd                   =  (JSPUtil.getParameter(request, prefix + "del_cd                  		".trim(), length));
			String[] pre_rly_port_cd          =  (JSPUtil.getParameter(request, prefix + "pre_rly_port_cd         		".trim(), length));
			String[] pst_rly_port_cd          =  (JSPUtil.getParameter(request, prefix + "pst_rly_port_cd         		".trim(), length));
			String[] bkg_ofc_cd               =  (JSPUtil.getParameter(request, prefix + "bkg_ofc_cd              		".trim(), length));
			String[] rhq_cd                   =  (JSPUtil.getParameter(request, prefix + "rhq_cd                  		".trim(), length));
			String[] rgn_ofc_cd               =  (JSPUtil.getParameter(request, prefix + "rgn_ofc_cd              		".trim(), length));
			String[] bkg_sls_ofc_cd           =  (JSPUtil.getParameter(request, prefix + "bkg_sls_ofc_cd          		".trim(), length));
			String[] bkg_ib_sls_ofc_cd        =  (JSPUtil.getParameter(request, prefix + "bkg_ib_sls_ofc_cd       		".trim(), length));
			String[] bkg_split_cd             =  (JSPUtil.getParameter(request, prefix + "bkg_split_cd            		".trim(), length));
			String[] bkg_doc_usr_id           =  (JSPUtil.getParameter(request, prefix + "bkg_doc_usr_id          		".trim(), length));
			String[] bkg_cre_dt               =  (JSPUtil.getParameter(request, prefix + "bkg_cre_dt              		".trim(), length));
			String[] sl_rep_cd                =  (JSPUtil.getParameter(request, prefix + "sl_rep_cd               		".trim(), length));
			String[] bkg_sts_cd               =  (JSPUtil.getParameter(request, prefix + "bkg_sts_cd              		".trim(), length));
			String[] bkg_wt_rsn_cd            =  (JSPUtil.getParameter(request, prefix + "bkg_wt_rsn_cd           		".trim(), length));
			String[] bkg_cntr_rsn_flg         =  (JSPUtil.getParameter(request, prefix + "bkg_cntr_rsn_flg        		".trim(), length));
			String[] bkg_prohi_cmdt_rsn_flg   =  (JSPUtil.getParameter(request, prefix + "bkg_prohi_cmdt_rsn_flg  		".trim(), length));
			String[] bkg_not_net_rev_rsn_flg  =  (JSPUtil.getParameter(request, prefix + "bkg_not_net_rev_rsn_flg 		".trim(), length));
			String[] bkg_dg_cgo_auth_rsn_flg  =  (JSPUtil.getParameter(request, prefix + "bkg_dg_cgo_auth_rsn_flg 		".trim(), length));
			String[] bkg_awk_cgo_auth_rsn_flg =  (JSPUtil.getParameter(request, prefix + "bkg_awk_cgo_auth_rsn_flg		".trim(), length));
			String[] bkg_prohi_dest_rsn_flg   =  (JSPUtil.getParameter(request, prefix + "bkg_prohi_dest_rsn_flg  		".trim(), length));
			String[] bkg_rc_rsn_flg           =  (JSPUtil.getParameter(request, prefix + "bkg_rc_rsn_flg          		".trim(), length));
			String[] bkg_bb_rsn_flg           =  (JSPUtil.getParameter(request, prefix + "bkg_bb_rsn_flg          		".trim(), length));
			String[] bkg_fcty_rsn_flg         =  (JSPUtil.getParameter(request, prefix + "bkg_fcty_rsn_flg        		".trim(), length));
			String[] bkg_otr_rsn_flg          =  (JSPUtil.getParameter(request, prefix + "bkg_otr_rsn_flg         		".trim(), length));
			String[] bkg_rqst_dt              =  (JSPUtil.getParameter(request, prefix + "bkg_rqst_dt             		".trim(), length));
			String[] bkg_cgo_tp_cd            =  (JSPUtil.getParameter(request, prefix + "bkg_cgo_tp_cd           		".trim(), length));
			String[] bkg_adv_shtg_cd          =  (JSPUtil.getParameter(request, prefix + "bkg_adv_shtg_cd         		".trim(), length));
			String[] bkg_hot_de_flg           =  (JSPUtil.getParameter(request, prefix + "bkg_hot_de_flg          		".trim(), length));
			String[] nvocc_cd                 =  (JSPUtil.getParameter(request, prefix + "nvocc_cd                		".trim(), length));
			String[] rcv_term_cd              =  (JSPUtil.getParameter(request, prefix + "rcv_term_cd             		".trim(), length));
			String[] bkg_rcv_dor_cd           =  (JSPUtil.getParameter(request, prefix + "bkg_rcv_dor_cd          		".trim(), length));
			String[] de_term_cd               =  (JSPUtil.getParameter(request, prefix + "de_term_cd              		".trim(), length));
			String[] bkg_de_dor_cd            =  (JSPUtil.getParameter(request, prefix + "bkg_de_dor_cd           		".trim(), length));
			String[] bkg_fnl_dest_cd          =  (JSPUtil.getParameter(request, prefix + "bkg_fnl_dest_cd         		".trim(), length));
			String[] bkg_ocp_cd               =  (JSPUtil.getParameter(request, prefix + "bkg_ocp_cd              		".trim(), length));
			String[] cmdt_cd                  =  (JSPUtil.getParameter(request, prefix + "cmdt_cd                 		".trim(), length));
			String[] cmdt_dtl_cd              =  (JSPUtil.getParameter(request, prefix + "cmdt_dtl_cd             		".trim(), length));
			String[] rep_cmdt_cd              =  (JSPUtil.getParameter(request, prefix + "rep_cmdt_cd             		".trim(), length));
			String[] spcl_dg_cgo_flg          =  (JSPUtil.getParameter(request, prefix + "spcl_dg_cgo_flg         		".trim(), length));
			String[] spcl_rc_flg              =  (JSPUtil.getParameter(request, prefix + "spcl_rc_flg             		".trim(), length));
			String[] spcl_awk_cgo_flg         =  (JSPUtil.getParameter(request, prefix + "spcl_awk_cgo_flg        		".trim(), length));
			String[] spcl_bb_cgo_flg          =  (JSPUtil.getParameter(request, prefix + "spcl_bb_cgo_flg         		".trim(), length));
			String[] spcl_rd_cgo_flg          =  (JSPUtil.getParameter(request, prefix + "spcl_rd_cgo_flg         		".trim(), length));
			String[] pck_qty                  =  (JSPUtil.getParameter(request, prefix + "pck_qty                 		".trim(), length));
			String[] pck_tp_cd                =  (JSPUtil.getParameter(request, prefix + "pck_tp_cd               		".trim(), length));
			String[] bkg_meas_qty             =  (JSPUtil.getParameter(request, prefix + "bkg_meas_qty            		".trim(), length));
			String[] bkg_meas_tp_cd           =  (JSPUtil.getParameter(request, prefix + "bkg_meas_tp_cd          		".trim(), length));
			String[] act_bkg_wgt              =  (JSPUtil.getParameter(request, prefix + "act_bkg_wgt             		".trim(), length));
			String[] act_bkg_wgt_tp_cd        =  (JSPUtil.getParameter(request, prefix + "act_bkg_wgt_tp_cd       		".trim(), length));
			String[] estm_bkg_wgt             =  (JSPUtil.getParameter(request, prefix + "estm_bkg_wgt            		".trim(), length));
			String[] estm_bkg_wgt_tp_cd       =  (JSPUtil.getParameter(request, prefix + "estm_bkg_wgt_tp_cd      		".trim(), length));
			String[] lc_no                    =  (JSPUtil.getParameter(request, prefix + "lc_no                   		".trim(), length));
			String[] bkg_edi_ref_no           =  (JSPUtil.getParameter(request, prefix + "bkg_edi_ref_no          		".trim(), length));
			String[] org_svc_mod_cd           =  (JSPUtil.getParameter(request, prefix + "org_svc_mod_cd          		".trim(), length));
			String[] dest_svc_mod_cd          =  (JSPUtil.getParameter(request, prefix + "dest_svc_mod_cd         		".trim(), length));
			String[] twn_so_no                =  (JSPUtil.getParameter(request, prefix + "twn_so_no               		".trim(), length));
			String[] scac_no                  =  (JSPUtil.getParameter(request, prefix + "scac_no                 		".trim(), length));
			String[] bkg_rmk                  =  (JSPUtil.getParameter(request, prefix + "bkg_rmk                 		".trim(), length));
			String[] spcl_cgo_auth_seq        =  (JSPUtil.getParameter(request, prefix + "spcl_cgo_auth_seq       		".trim(), length));
			String[] bl_no                    =  (JSPUtil.getParameter(request, prefix + "bl_no                   		".trim(), length));
			String[] bl_no_tp                 =  (JSPUtil.getParameter(request, prefix + "bl_no_tp                		".trim(), length));
			String[] bl_no_chk                =  (JSPUtil.getParameter(request, prefix + "bl_no_chk               		".trim(), length));
			String[] bl_tp_cd                 =  (JSPUtil.getParameter(request, prefix + "bl_tp_cd                		".trim(), length));
			String[] bkg_cxl_dt               =  (JSPUtil.getParameter(request, prefix + "bkg_cxl_dt              		".trim(), length));
			String[] bkg_pson_nm              =  (JSPUtil.getParameter(request, prefix + "bkg_pson_nm             		".trim(), length));
			String[] bkg_pson_telcm_no        =  (JSPUtil.getParameter(request, prefix + "bkg_pson_telcm_no       		".trim(), length));
			String[] bkg_pson_fax_no          =  (JSPUtil.getParameter(request, prefix + "bkg_pson_fax_no         		".trim(), length));
			String[] bkg_pson_eml             =  (JSPUtil.getParameter(request, prefix + "bkg_pson_eml            		".trim(), length));
			String[] bkg_hot_de_dt            =  (JSPUtil.getParameter(request, prefix + "bkg_hot_de_dt           		".trim(), length));
			String[] bkg_org_rout_cd          =  (JSPUtil.getParameter(request, prefix + "bkg_org_rout_cd         		".trim(), length));
			String[] dest_rout_cd             =  (JSPUtil.getParameter(request, prefix + "dest_rout_cd            		".trim(), length));
			String[] psa_no                   =  (JSPUtil.getParameter(request, prefix + "psa_no                  		".trim(), length));
			String[] ref_no                   =  (JSPUtil.getParameter(request, prefix + "ref_no                  		".trim(), length));
			String[] qurn_no                  =  (JSPUtil.getParameter(request, prefix + "qurn_no                 		".trim(), length));
			String[] qurn_nm                  =  (JSPUtil.getParameter(request, prefix + "qurn_nm                 		".trim(), length));
			String[] sr_flg                   =  (JSPUtil.getParameter(request, prefix + "sr_flg                  		".trim(), length));
			String[] ib_trns_flg              =  (JSPUtil.getParameter(request, prefix + "ib_trns_flg             		".trim(), length));
			String[] bkg_bd_tp_cd             =  (JSPUtil.getParameter(request, prefix + "bkg_bd_tp_cd            		".trim(), length));
			String[] bkg_bd_cd                =  (JSPUtil.getParameter(request, prefix + "bkg_bd_cd               		".trim(), length));
			String[] wr_hus_cd                =  (JSPUtil.getParameter(request, prefix + "wr_hus_cd               		".trim(), length));
			String[] bkg_cgo_dt               =  (JSPUtil.getParameter(request, prefix + "bkg_cgo_dt              		".trim(), length));
			String[] bkg_hngr_flg             =  (JSPUtil.getParameter(request, prefix + "bkg_hngr_flg            		".trim(), length));
			String[] bkg_shpr_ownr_flg        =  (JSPUtil.getParameter(request, prefix + "bkg_shpr_ownr_flg       		".trim(), length));
			String[] eq_subst_flg             =  (JSPUtil.getParameter(request, prefix + "eq_subst_flg            		".trim(), length));
			String[] org_hlg_flg              =  (JSPUtil.getParameter(request, prefix + "org_hlg_flg             		".trim(), length));
			String[] dest_hlg_flg             =  (JSPUtil.getParameter(request, prefix + "dest_hlg_flg            		".trim(), length));
			String[] pkup_loc_cd              =  (JSPUtil.getParameter(request, prefix + "pkup_loc_cd             		".trim(), length));
			String[] pkup_yd_cd               =  (JSPUtil.getParameter(request, prefix + "pkup_yd_cd              		".trim(), length));
			String[] pkup_dt                  =  (JSPUtil.getParameter(request, prefix + "pkup_dt                 		".trim(), length));
			String[] rtn_loc_cd               =  (JSPUtil.getParameter(request, prefix + "rtn_loc_cd              		".trim(), length));
			String[] rtn_yd_cd                =  (JSPUtil.getParameter(request, prefix + "rtn_yd_cd               		".trim(), length));
			String[] cntr_lst_cfm_dt          =  (JSPUtil.getParameter(request, prefix + "cntr_lst_cfm_dt         		".trim(), length));
			String[] bkg_lst_cfm_usr_id       =  (JSPUtil.getParameter(request, prefix + "bkg_lst_cfm_usr_id      		".trim(), length));
			String[] bkg_rt_aply_dt           =  (JSPUtil.getParameter(request, prefix + "bkg_rt_aply_dt          		".trim(), length));
			String[] cbf_flg                  =  (JSPUtil.getParameter(request, prefix + "cbf_flg                 		".trim(), length));
			String[] cbf_itm_chk_flg          =  (JSPUtil.getParameter(request, prefix + "cbf_itm_chk_flg         		".trim(), length));
			String[] bkg_bdr_dt               =  (JSPUtil.getParameter(request, prefix + "bkg_bdr_dt              		".trim(), length));
			String[] bkg_bdr_cng_flg          =  (JSPUtil.getParameter(request, prefix + "bkg_bdr_cng_flg         		".trim(), length));
			String[] bkg_bdr_flg              =  (JSPUtil.getParameter(request, prefix + "bkg_bdr_flg             		".trim(), length));
			String[] bkg_cntr_mf_cfm_flg      =  (JSPUtil.getParameter(request, prefix + "bkg_cntr_mf_cfm_flg     		".trim(), length));
			String[] hcos_bkg_no              =  (JSPUtil.getParameter(request, prefix + "hcos_bkg_no             		".trim(), length));
			String[] hcos_bkg_no_split        =  (JSPUtil.getParameter(request, prefix + "hcos_bkg_no_split       		".trim(), length));
			String[] bkg_gen_cd               =  (JSPUtil.getParameter(request, prefix + "bkg_gen_cd              		".trim(), length));
			String[] bkg_cntr_frm_flg         =  (JSPUtil.getParameter(request, prefix + "bkg_cntr_frm_flg        		".trim(), length));
			String[] bkg_cfm_snt_flg          =  (JSPUtil.getParameter(request, prefix + "bkg_cfm_snt_flg         		".trim(), length));
			String[] bkg_cfm_snt_dt           =  (JSPUtil.getParameter(request, prefix + "bkg_cfm_snt_dt          		".trim(), length));
			String[] bkg_frt_fwrd_flg         =  (JSPUtil.getParameter(request, prefix + "bkg_frt_fwrd_flg        		".trim(), length));
			String[] bkg_lst_ca_iss_dt        =  (JSPUtil.getParameter(request, prefix + "bkg_lst_ca_iss_dt       		".trim(), length));
			String[] cmb_bkg_no               =  (JSPUtil.getParameter(request, prefix + "cmb_bkg_no              		".trim(), length));
			String[] cmb_bkg_no_split         =  (JSPUtil.getParameter(request, prefix + "cmb_bkg_no_split        		".trim(), length));
			String[] finc_dir_cd              =  (JSPUtil.getParameter(request, prefix + "finc_dir_cd             		".trim(), length));
			String[] bkg_cbf_auth_flg         =  (JSPUtil.getParameter(request, prefix + "bkg_cbf_auth_flg        		".trim(), length));
			String[] bkg_shpr_xpt_decl_cd     =  (JSPUtil.getParameter(request, prefix + "bkg_shpr_xpt_decl_cd    		".trim(), length));
			String[] bkg_agn_cd               =  (JSPUtil.getParameter(request, prefix + "bkg_agn_cd              		".trim(), length));
			String[] eq_ctrl_ofc_cd           =  (JSPUtil.getParameter(request, prefix + "eq_ctrl_ofc_cd          		".trim(), length));
			String[] pkup_loc_yd_cd           =  (JSPUtil.getParameter(request, prefix + "pkup_loc_yd_cd          		".trim(), length));
			String[] bkg_corr_no              =  (JSPUtil.getParameter(request, prefix + "bkg_corr_no             		".trim(), length));
			String[] ca_usr_id                =  (JSPUtil.getParameter(request, prefix + "ca_usr_id               		".trim(), length));
			String[] bkg_corr_ofc_cd          =  (JSPUtil.getParameter(request, prefix + "bkg_corr_ofc_cd         		".trim(), length));
			String[] corr_dt                  =  (JSPUtil.getParameter(request, prefix + "corr_dt                 		".trim(), length));
			String[] bl_prn_wgt_flg           =  (JSPUtil.getParameter(request, prefix + "bl_prn_wgt_flg          		".trim(), length));
			String[] bkg_cre_flg              =  (JSPUtil.getParameter(request, prefix + "bkg_cre_flg             		".trim(), length));
			String[] oop_loc_cd               =  (JSPUtil.getParameter(request, prefix + "oop_loc_cd              		".trim(), length));
			String[] pfd_loc_cd               =  (JSPUtil.getParameter(request, prefix + "pfd_loc_cd              		".trim(), length));
			String[] dbl_bkg_flg              =  (JSPUtil.getParameter(request, prefix + "dbl_bkg_flg             		".trim(), length));
			String[] ap_brog_flg              =  (JSPUtil.getParameter(request, prefix + "ap_brog_flg             		".trim(), length));
			String[] bis_sys_flg              =  (JSPUtil.getParameter(request, prefix + "bis_sys_flg             		".trim(), length));
			String[] nis_evnt_dt              =  (JSPUtil.getParameter(request, prefix + "nis_evnt_dt             		".trim(), length));
			String[] bkg_xter_rmk             =  (JSPUtil.getParameter(request, prefix + "bkg_xter_rmk            		".trim(), length));
			String[] xter_bkg_cd              =  (JSPUtil.getParameter(request, prefix + "xter_bkg_cd             		".trim(), length));
			String[] bkg_rev_aud_flg          =  (JSPUtil.getParameter(request, prefix + "bkg_rev_aud_flg         		".trim(), length));
			String[] spcl_hide_flg            =  (JSPUtil.getParameter(request, prefix + "spcl_hide_flg           		".trim(), length));
			String[] cust_rlse_flg            =  (JSPUtil.getParameter(request, prefix + "cust_rlse_flg           		".trim(), length));
			String[] cdr_cng_flg              =  (JSPUtil.getParameter(request, prefix + "cdr_cng_flg             		".trim(), length));
			String[] rcdr_dt                  =  (JSPUtil.getParameter(request, prefix + "rcdr_dt                 		".trim(), length));
			String[] cdr_vsl_cd               =  (JSPUtil.getParameter(request, prefix + "cdr_vsl_cd              		".trim(), length));
			String[] cdr_skd_voy_no           =  (JSPUtil.getParameter(request, prefix + "cdr_skd_voy_no          		".trim(), length));
			String[] cdr_skd_dir_cd           =  (JSPUtil.getParameter(request, prefix + "cdr_skd_dir_cd          		".trim(), length));
			String[] cdr_pol_cd               =  (JSPUtil.getParameter(request, prefix + "cdr_pol_cd              		".trim(), length));
			String[] mty_bkg_cd               =  (JSPUtil.getParameter(request, prefix + "mty_bkg_cd              		".trim(), length));
			String[] cdr_dchg_port_cd         =  (JSPUtil.getParameter(request, prefix + "cdr_dchg_port_cd        		".trim(), length));
			String[] bkg_pod_tml_cd           =  (JSPUtil.getParameter(request, prefix + "bkg_pod_tml_cd          		".trim(), length));
			String[] fd_grd_flg               =  (JSPUtil.getParameter(request, prefix + "fd_grd_flg              		".trim(), length));
			String[] org_trns_mod_cd          =  (JSPUtil.getParameter(request, prefix + "org_trns_mod_cd         		".trim(), length));
			String[] dest_trns_mod_cd         =  (JSPUtil.getParameter(request, prefix + "dest_trns_mod_cd        		".trim(), length));
			String[] rail_blk_flg             =  (JSPUtil.getParameter(request, prefix + "rail_blk_flg            		".trim(), length));
			String[] rail_blk_cd              =  (JSPUtil.getParameter(request, prefix + "rail_blk_cd             		".trim(), length));
			String[] mcntr_dor_arr_dt         =  (JSPUtil.getParameter(request, prefix + "mcntr_dor_arr_dt        		".trim(), length));
			String[] lodg_due_dt              =  (JSPUtil.getParameter(request, prefix + "lodg_due_dt             		".trim(), length));
			String[] de_due_dt                =  (JSPUtil.getParameter(request, prefix + "de_due_dt               		".trim(), length));
			String[] por_zn_cd                =  (JSPUtil.getParameter(request, prefix + "por_zn_cd               		".trim(), length));
			String[] del_zn_cd                =  (JSPUtil.getParameter(request, prefix + "del_zn_cd               		".trim(), length));
			String[] pctl_no                  =  (JSPUtil.getParameter(request, prefix + "pctl_no                 		".trim(), length));
			String[] und_cm_flg               =  (JSPUtil.getParameter(request, prefix + "und_cm_flg              		".trim(), length));
			String[] eai_evnt_dt              =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt             		".trim(), length));
			
			String[] spcl_prct_cgo_flg        =  (JSPUtil.getParameter(request, prefix + "spcl_prct_cgo_flg             ".trim(), length));
			String[] cntr_full_pkup_loc_cd    =  (JSPUtil.getParameter(request, prefix + "cntr_full_pkup_loc_cd         ".trim(), length));
			String[] cntr_full_pkup_yd_cd     =  (JSPUtil.getParameter(request, prefix + "cntr_full_pkup_yd_cd          ".trim(), length));
			String[] ctrt_ofc_cd              =  (JSPUtil.getParameter(request, prefix + "ctrt_ofc_cd             		".trim(), length));
			String[] ctrt_srep_cd             =  (JSPUtil.getParameter(request, prefix + "ctrt_srep_cd             		".trim(), length));
			
			String[] ib_del_de_dt            =  (JSPUtil.getParameter(request, prefix + "ib_del_de_dt             	".trim(), length));
			String[] ib_mty_rtn_yd_cd     =  (JSPUtil.getParameter(request, prefix + "ib_mty_rtn_yd_cd          ".trim(), length));
			String[] bl_mst_bkg_no            =  (JSPUtil.getParameter(request, prefix + "bl_mst_bkg_no             	".trim(), length));
			String[] bl_mst_bkg_no_split      =  (JSPUtil.getParameter(request, prefix + "bl_mst_bkg_no_split           ".trim(), length));
			
			String[] pol_zone_cd      =  (JSPUtil.getParameter(request, prefix + "pol_zone_cd           ".trim(), length));
			
			String[] blck_stwg_cd      		  =  (JSPUtil.getParameter(request, prefix + "blck_stwg_cd           ".trim(), length)); // 2008 03 07 hyunsu added
			String[] cntr_tpsz_mix_flg		  =  (JSPUtil.getParameter(request, prefix + "cntr_tpsz_mix_flg      ".trim(), length)); // 2008 04 18 hyunsu added)
			
			
			for (int i = 0; i < length; i++) {
				model = new BKG_BOOKING();
				model.setIbflag                  		  ( ibflag                  	[i]);
				model.setPage_rows               		  ( page_rows               	[i]);
				model.setBkg_no                  		  ( bkg_no                  	[i]);
				model.setBkg_no_split            		  ( bkg_no_split            	[i]);
				model.setVsl_cd                  		  ( vsl_cd                  	[i]);
				model.setSkd_voy_no              		  ( skd_voy_no              	[i]);
				model.setSkd_dir_cd              		  ( skd_dir_cd              	[i]);
				model.setSlan_cd                 		  ( slan_cd                 	[i]);
				model.setPor_cd                  		  ( por_cd                  	[i]);
				model.setPol_cd                  		  ( pol_cd                  	[i]);
				model.setPod_cd                  		  ( pod_cd                  	[i]);
				model.setDel_cd                  		  ( del_cd                  	[i]);
				model.setPre_rly_port_cd         		  ( pre_rly_port_cd         	[i]);
				model.setPst_rly_port_cd         		  ( pst_rly_port_cd         	[i]);
				model.setBkg_ofc_cd              		  ( bkg_ofc_cd              	[i]);
				model.setRhq_cd                  		  ( rhq_cd                  	[i]);
				model.setRgn_ofc_cd              		  ( rgn_ofc_cd              	[i]);
				model.setBkg_sls_ofc_cd          		  ( bkg_sls_ofc_cd          	[i]);
				model.setBkg_ib_sls_ofc_cd       		  ( bkg_ib_sls_ofc_cd       	[i]);
				model.setBkg_split_cd            		  ( bkg_split_cd            	[i]);
				model.setBkg_doc_usr_id          		  ( bkg_doc_usr_id          	[i]);
				model.setBkg_cre_dt              		  ( bkg_cre_dt              	[i]);
				model.setSl_rep_cd               		  ( sl_rep_cd               	[i]);
				model.setBkg_sts_cd              		  ( bkg_sts_cd              	[i]);
				model.setBkg_wt_rsn_cd           		  ( bkg_wt_rsn_cd           	[i]);
				model.setBkg_cntr_rsn_flg        		  ( bkg_cntr_rsn_flg        	[i]);
				model.setBkg_prohi_cmdt_rsn_flg  		  ( bkg_prohi_cmdt_rsn_flg  	[i]);
				model.setBkg_not_net_rev_rsn_flg 		  ( bkg_not_net_rev_rsn_flg 	[i]);
				model.setBkg_dg_cgo_auth_rsn_flg 		  ( bkg_dg_cgo_auth_rsn_flg 	[i]);
				model.setBkg_awk_cgo_auth_rsn_flg		  ( bkg_awk_cgo_auth_rsn_flg	[i]);
				model.setBkg_prohi_dest_rsn_flg  		  ( bkg_prohi_dest_rsn_flg  	[i]);
				model.setBkg_rc_rsn_flg          		  ( bkg_rc_rsn_flg          	[i]);
				model.setBkg_bb_rsn_flg          		  ( bkg_bb_rsn_flg          	[i]);
				model.setBkg_fcty_rsn_flg        		  ( bkg_fcty_rsn_flg        	[i]);
				model.setBkg_otr_rsn_flg         		  ( bkg_otr_rsn_flg         	[i]);
				model.setBkg_rqst_dt             		  ( bkg_rqst_dt             	[i]);
				model.setBkg_cgo_tp_cd           		  ( bkg_cgo_tp_cd           	[i]);
				model.setBkg_adv_shtg_cd         		  ( bkg_adv_shtg_cd         	[i]);
				model.setBkg_hot_de_flg          		  ( bkg_hot_de_flg          	[i]);
				model.setNvocc_cd                		  ( nvocc_cd                	[i]);
				model.setRcv_term_cd             		  ( rcv_term_cd             	[i]);
				model.setBkg_rcv_dor_cd          		  ( bkg_rcv_dor_cd          	[i]);
				model.setDe_term_cd              		  ( de_term_cd              	[i]);
				model.setBkg_de_dor_cd           		  ( bkg_de_dor_cd           	[i]);
				model.setBkg_fnl_dest_cd         		  ( bkg_fnl_dest_cd         	[i]);
				model.setBkg_ocp_cd              		  ( bkg_ocp_cd              	[i]);
				model.setCmdt_cd                 		  ( cmdt_cd                 	[i]);
				model.setCmdt_dtl_cd             		  ( cmdt_dtl_cd             	[i]);
				model.setRep_cmdt_cd             		  ( rep_cmdt_cd             	[i]);
				model.setSpcl_dg_cgo_flg         		  ( spcl_dg_cgo_flg         	[i]);
				model.setSpcl_rc_flg             		  ( spcl_rc_flg             	[i]);
				model.setSpcl_awk_cgo_flg        		  ( spcl_awk_cgo_flg        	[i]);
				model.setSpcl_bb_cgo_flg         		  ( spcl_bb_cgo_flg         	[i]);
				model.setSpcl_rd_cgo_flg         		  ( spcl_rd_cgo_flg         	[i]);
				model.setPck_qty                 		  ( pck_qty                 	[i]);
				model.setPck_tp_cd               		  ( pck_tp_cd               	[i]);
				model.setBkg_meas_qty            		  ( bkg_meas_qty            	[i]);
				model.setBkg_meas_tp_cd          		  ( bkg_meas_tp_cd          	[i]);
				model.setAct_bkg_wgt             		  ( act_bkg_wgt             	[i]);
				model.setAct_bkg_wgt_tp_cd       		  ( act_bkg_wgt_tp_cd       	[i]);
				model.setEstm_bkg_wgt            		  ( estm_bkg_wgt            	[i]);
				model.setEstm_bkg_wgt_tp_cd      		  ( estm_bkg_wgt_tp_cd      	[i]);
				model.setLc_no                   		  ( lc_no                   	[i]);
				model.setBkg_edi_ref_no          		  ( bkg_edi_ref_no          	[i]);
				model.setOrg_svc_mod_cd          		  ( org_svc_mod_cd          	[i]);
				model.setDest_svc_mod_cd         		  ( dest_svc_mod_cd         	[i]);
				model.setTwn_so_no               		  ( twn_so_no               	[i]);
				model.setScac_no                 		  ( scac_no                 	[i]);
				model.setBkg_rmk                 		  ( bkg_rmk                 	[i]);
				model.setSpcl_cgo_auth_seq       		  ( spcl_cgo_auth_seq       	[i]);
				model.setBl_no                   		  ( bl_no                   	[i]);
				model.setBl_no_tp                		  ( bl_no_tp                	[i]);
				model.setBl_no_chk               		  ( bl_no_chk               	[i]);
				model.setBl_tp_cd                		  ( bl_tp_cd                	[i]);
				model.setBkg_cxl_dt              		  ( bkg_cxl_dt              	[i]);
				model.setBkg_pson_nm             		  ( bkg_pson_nm             	[i]);
				model.setBkg_pson_telcm_no       		  ( bkg_pson_telcm_no       	[i]);
				model.setBkg_pson_fax_no         		  ( bkg_pson_fax_no         	[i]);
				model.setBkg_pson_eml            		  ( bkg_pson_eml            	[i]);
				model.setBkg_hot_de_dt           		  ( bkg_hot_de_dt           	[i]);
				model.setBkg_org_rout_cd         		  ( bkg_org_rout_cd         	[i]);
				model.setDest_rout_cd            		  ( dest_rout_cd            	[i]);
				model.setPsa_no                  		  ( psa_no                  	[i]);
				model.setRef_no                  		  ( ref_no                  	[i]);
				model.setQurn_no                 		  ( qurn_no                 	[i]);
				model.setQurn_nm                 		  ( qurn_nm                 	[i]);
				model.setSr_flg                  		  ( sr_flg                  	[i]);
				model.setIb_trns_flg             		  ( ib_trns_flg             	[i]);
				model.setBkg_bd_tp_cd            		  ( bkg_bd_tp_cd            	[i]);
				model.setBkg_bd_cd               		  ( bkg_bd_cd               	[i]);
				model.setWr_hus_cd               		  ( wr_hus_cd               	[i]);
				model.setBkg_cgo_dt              		  ( bkg_cgo_dt              	[i]);
				model.setBkg_hngr_flg            		  ( bkg_hngr_flg            	[i]);
				model.setBkg_shpr_ownr_flg       		  ( bkg_shpr_ownr_flg       	[i]);
				model.setEq_subst_flg            		  ( eq_subst_flg            	[i]);
				model.setOrg_hlg_flg             		  ( org_hlg_flg             	[i]);
				model.setDest_hlg_flg            		  ( dest_hlg_flg            	[i]);
				model.setPkup_loc_cd             		  ( pkup_loc_cd             	[i]);
				model.setPkup_yd_cd              		  ( pkup_yd_cd              	[i]);
				model.setPkup_dt                 		  ( pkup_dt                 	[i]);
				model.setRtn_loc_cd              		  ( rtn_loc_cd              	[i]);
				model.setRtn_yd_cd               		  ( rtn_yd_cd               	[i]);
				model.setCntr_lst_cfm_dt         		  ( cntr_lst_cfm_dt         	[i]);
				model.setBkg_lst_cfm_usr_id      		  ( bkg_lst_cfm_usr_id      	[i]);
				model.setBkg_rt_aply_dt          		  ( bkg_rt_aply_dt          	[i]);
				model.setCbf_flg                 		  ( cbf_flg                 	[i]);
				model.setCbf_itm_chk_flg         		  ( cbf_itm_chk_flg         	[i]);
				model.setBkg_bdr_dt              		  ( bkg_bdr_dt              	[i]);
				model.setBkg_bdr_cng_flg         		  ( bkg_bdr_cng_flg         	[i]);
				model.setBkg_bdr_flg             		  ( bkg_bdr_flg             	[i]);
				model.setBkg_cntr_mf_cfm_flg     		  ( bkg_cntr_mf_cfm_flg     	[i]);
				model.setHcos_bkg_no             		  ( hcos_bkg_no             	[i]);
				model.setHcos_bkg_no_split       		  ( hcos_bkg_no_split       	[i]);
				model.setBkg_gen_cd              		  ( bkg_gen_cd              	[i]);
				model.setBkg_cntr_frm_flg        		  ( bkg_cntr_frm_flg        	[i]);
				model.setBkg_cfm_snt_flg         		  ( bkg_cfm_snt_flg         	[i]);
				model.setBkg_cfm_snt_dt          		  ( bkg_cfm_snt_dt          	[i]);
				model.setBkg_frt_fwrd_flg        		  ( bkg_frt_fwrd_flg        	[i]);
				model.setBkg_lst_ca_iss_dt       		  ( bkg_lst_ca_iss_dt       	[i]);
				model.setCmb_bkg_no              		  ( cmb_bkg_no              	[i]);
				model.setCmb_bkg_no_split        		  ( cmb_bkg_no_split        	[i]);
				model.setFinc_dir_cd             		  ( finc_dir_cd             	[i]);
				model.setBkg_cbf_auth_flg        		  ( bkg_cbf_auth_flg        	[i]);
				model.setBkg_shpr_xpt_decl_cd    		  ( bkg_shpr_xpt_decl_cd    	[i]);
				model.setBkg_agn_cd              		  ( bkg_agn_cd              	[i]);
				model.setEq_ctrl_ofc_cd          		  ( eq_ctrl_ofc_cd          	[i]);
				model.setPkup_loc_yd_cd          		  ( pkup_loc_yd_cd          	[i]);
				model.setBkg_corr_no             		  ( bkg_corr_no             	[i]);
				model.setCa_usr_id               		  ( ca_usr_id               	[i]);
				model.setBkg_corr_ofc_cd         		  ( bkg_corr_ofc_cd         	[i]);
				model.setCorr_dt                 		  ( corr_dt                 	[i]);
				model.setBl_prn_wgt_flg          		  ( bl_prn_wgt_flg          	[i]);
				model.setBkg_cre_flg             		  ( bkg_cre_flg             	[i]);
				model.setOop_loc_cd              		  ( oop_loc_cd              	[i]);
				model.setPfd_loc_cd              		  ( pfd_loc_cd              	[i]);
				model.setDbl_bkg_flg             		  ( dbl_bkg_flg             	[i]);
				model.setAp_brog_flg             		  ( ap_brog_flg             	[i]);
				model.setBis_sys_flg             		  ( bis_sys_flg             	[i]);
				model.setNis_evnt_dt             		  ( nis_evnt_dt             	[i]);
				model.setBkg_xter_rmk            		  ( bkg_xter_rmk            	[i]);
				model.setXter_bkg_cd             		  ( xter_bkg_cd             	[i]);
				model.setBkg_rev_aud_flg         		  ( bkg_rev_aud_flg         	[i]);
				model.setSpcl_hide_flg           		  ( spcl_hide_flg           	[i]);
				model.setCust_rlse_flg           		  ( cust_rlse_flg           	[i]);
				model.setCdr_cng_flg             		  ( cdr_cng_flg             	[i]);
				model.setRcdr_dt                 		  ( rcdr_dt                 	[i]);
				model.setCdr_vsl_cd              		  ( cdr_vsl_cd              	[i]);
				model.setCdr_skd_voy_no          		  ( cdr_skd_voy_no          	[i]);
				model.setCdr_skd_dir_cd          		  ( cdr_skd_dir_cd          	[i]);
				model.setCdr_pol_cd              		  ( cdr_pol_cd              	[i]);
				model.setMty_bkg_cd              		  ( mty_bkg_cd              	[i]);
				model.setCdr_dchg_port_cd        		  ( cdr_dchg_port_cd        	[i]);
				model.setBkg_pod_tml_cd          		  ( bkg_pod_tml_cd          	[i]);
				model.setFd_grd_flg              		  ( fd_grd_flg              	[i]);
				model.setOrg_trns_mod_cd         		  ( org_trns_mod_cd         	[i]);
				model.setDest_trns_mod_cd        		  ( dest_trns_mod_cd        	[i]);
				model.setRail_blk_flg            		  ( rail_blk_flg            	[i]);
				model.setRail_blk_cd             		  ( rail_blk_cd             	[i]);
				model.setMcntr_dor_arr_dt        		  ( mcntr_dor_arr_dt        	[i]);
				model.setLodg_due_dt             		  ( lodg_due_dt             	[i]);
				model.setDe_due_dt               		  ( de_due_dt               	[i]);
				model.setPor_zn_cd               		  ( por_zn_cd               	[i]);
				model.setDel_zn_cd               		  ( del_zn_cd               	[i]);
				model.setPctl_no                 		  ( pctl_no                 	[i]);
				model.setUnd_cm_flg              		  ( und_cm_flg              	[i]);
				model.setEai_evnt_dt             		  ( eai_evnt_dt             	[i]);
				
				model.setSpcl_prct_cgo_flg             	  ( spcl_prct_cgo_flg           [i]);
				model.setCntr_full_pkup_loc_cd            ( cntr_full_pkup_loc_cd       [i]);
				model.setCntr_full_pkup_yd_cd             ( cntr_full_pkup_yd_cd        [i]);
				model.setCtrt_ofc_cd             		  ( ctrt_ofc_cd             	[i]);
				model.setCtrt_srep_cd             		  ( ctrt_srep_cd             	[i]);
				
				model.setIb_del_de_dt             		  ( ib_del_de_dt             	[i]);
				model.setIb_mty_rtn_yd_cd             	  ( ib_mty_rtn_yd_cd        	[i]);
				model.setBl_mst_bkg_no             		  ( bl_mst_bkg_no             	[i]);
				model.setBl_mst_bkg_no_split              ( bl_mst_bkg_no_split         [i]);
				
				model.setPol_zone_cd              ( pol_zone_cd         [i]);
				
				model.setBlck_stwg_cd              		  ( blck_stwg_cd         		[i]); // 2008 03 17 hyunsu added 
				model.setCntr_tpsz_mix_flg				  ( cntr_tpsz_mix_flg			[i]); // 2008 04 18 hyunsu added 
				
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
