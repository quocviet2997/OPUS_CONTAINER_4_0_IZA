/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : MDM_YARD.java
*@FileTitle : 사용자 관리5
*Open Issues :
*Change history :
*@LastModifyDate : 2007-01-12
*@LastModifier : Kildong_hong6
*@LastVersion : 1.0
* 2007-01-12 Kildong_hong6
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
public final class MdmYard implements java.io.Serializable {

	private String                  ibflag                  = "";
	private String                  page_rows               = "";
	private String                  yd_cd                   = "";
	private String                  yd_nm                   = "";
	private String                  loc_cd                  = "";
	private String                  n1st_vndr_cnt_cd        = "";
	private String                  n1st_vndr_seq           = "";
	private String                  ofc_cd                  = "";
	private String                  avg_dwll_hrs            = "";
	private String                  min_dwll_hrs            = "";
	private String                  yd_chr_cd               = "";
	private String                  yd_fcty_tp_mrn_tml_flg  = "";
	private String                  yd_fcty_tp_cy_flg       = "";
	private String                  yd_fcty_tp_cfs_flg      = "";
	private String                  yd_fcty_tp_rail_rmp_flg = "";
	private String                  yd_oshp_cd              = "";
	private String                  bd_yd_flg               = "";
	private String                  onf_hir_yd_flg          = "";
	private String                  yd_ft_hrs               = "";
	private String                  rep_zn_cd               = "";
	private String                  yd_addr                 = "";
	private String                  zip_cd                  = "";
	private String                  intl_phn_no             = "";
	private String                  phn_no                  = "";
	private String                  fax_no                  = "";
	private String                  yd_pic_nm               = "";
	private String                  yd_ceo_nm               = "";
	private String                  gate_opn_hrmnt          = "";
	private String                  gate_clz_hrmnt          = "";
	private String                  hol_gate_opn_hrmnt      = "";
	private String                  hol_gate_clz_hrmnt      = "";
	private String                  sun_gate_opn_hrmnt      = "";
	private String                  sun_gate_clz_hrmnt      = "";
	private String                  sat_gate_opn_hrmnt      = "";
	private String                  sat_gate_clz_hrmnt      = "";
	private String                  yd_cgo_clz_hrmnt_msg    = "";
	private String                  yd_rmk                  = "";
	private String                  brth_no                 = "";
	private String                  yd_brth_len             = "";
	private String                  yd_brth_alng_sd_desc    = "";
	private String                  yd_brth_dpth_chnl_knt   = "";
	private String                  yd_ttl_spc              = "";
	private String                  yd_act_spc              = "";
	private String                  yd_hjs_spc              = "";
	private String                  yd_hndl_capa            = "";
	private String                  yd_rf_rcpt_440v_knt     = "";
	private String                  yd_rf_rcpt_220v_knt     = "";
	private String                  yd_rf_rcpt_dul_knt      = "";
	private String                  yd_op_sys_cd            = "";
	private String                  yd_inrl_flg             = "";
	private String                  yd_cfs_spc              = "";
	private String                  mnr_shop_flg            = "";
	private String                  yd_hndl_yr              = "";
	private String                  yd_ttl_vol_teu_knt      = "";
	private String                  yd_ttl_vol_bx_knt       = "";
	private String                  yd_hjs_vol_teu_knt      = "";
	private String                  yd_hjs_vol_bx_knt       = "";
	private String                  yd_pst_pgc_knt          = "";
	private String                  yd_pgc_knt              = "";
	private String                  trstr_knt               = "";
	private String                  frk_knt                 = "";
	private String                  yd_strdl_crr_knt        = "";
	private String                  yd_trct_knt             = "";
	private String                  yd_top_lft_knt          = "";
	private String                  tml_chss_knt            = "";
	private String                  eir_svc_flg             = "";
	private String                  tml_prod_knt            = "";
	private String                  yd_cstms_no             = "";
	private String                  yd_fcty_tp_psdo_yd_flg  = "";
	private String                  yd_eml                  = "";
	private String                  dem_ib_clt_flg          = "";
	private String                  dem_ob_clt_flg          = "";
	private String                  bkg_pod_yd_flg          = "";
	private String                  n2nd_vndr_cnt_cd        = "";
	private String                  n2nd_vndr_seq           = "";
	private String                  n3rd_vndr_cnt_cd        = "";
	private String                  n3rd_vndr_seq           = "";
	private String                  dmdt_ofc_cd             = "";
	private String                  yd_fcty_tp_brg_rmp_flg  = "";
	private String                  bfr_ofc_cd              = "";
	private String                  bfr_ofc_cng_dt          = "";
	private String                  modi_yd_cd              = "";
	private String                  rep_yd_tp_cd            = "";
	private String                  cre_usr_id              = "";
	private String                  cre_dt                  = "";
	private String                  upd_usr_id              = "";
	private String                  upd_dt                  = "";
	private String                  delt_flg                = "";
	private String                  eai_evnt_dt             = "";
	private String                  hub_yd_flg              = "";

	public MdmYard(){}

	public MdmYard(
			String                  ibflag                 ,
			String                  page_rows              ,
			String                  yd_cd                  ,
			String                  yd_nm                  ,
			String                  loc_cd                 ,
			String                  n1st_vndr_cnt_cd       ,
			String                  n1st_vndr_seq          ,
			String                  ofc_cd                 ,
			String                  avg_dwll_hrs           ,
			String                  min_dwll_hrs           ,
			String                  yd_chr_cd              ,
			String                  yd_fcty_tp_mrn_tml_flg ,
			String                  yd_fcty_tp_cy_flg      ,
			String                  yd_fcty_tp_cfs_flg     ,
			String                  yd_fcty_tp_rail_rmp_flg,
			String                  yd_oshp_cd             ,
			String                  bd_yd_flg              ,
			String                  onf_hir_yd_flg         ,
			String                  yd_ft_hrs              ,
			String                  rep_zn_cd              ,
			String                  yd_addr                ,
			String                  zip_cd                 ,
			String                  intl_phn_no            ,
			String                  phn_no                 ,
			String                  fax_no                 ,
			String                  yd_pic_nm              ,
			String                  yd_ceo_nm              ,
			String                  gate_opn_hrmnt         ,
			String                  gate_clz_hrmnt         ,
			String                  hol_gate_opn_hrmnt     ,
			String                  hol_gate_clz_hrmnt     ,
			String                  sun_gate_opn_hrmnt     ,
			String                  sun_gate_clz_hrmnt     ,
			String                  sat_gate_opn_hrmnt     ,
			String                  sat_gate_clz_hrmnt     ,
			String                  yd_cgo_clz_hrmnt_msg   ,
			String                  yd_rmk                 ,
			String                  brth_no                ,
			String                  yd_brth_len            ,
			String                  yd_brth_alng_sd_desc   ,
			String                  yd_brth_dpth_chnl_knt  ,
			String                  yd_ttl_spc             ,
			String                  yd_act_spc             ,
			String                  yd_hjs_spc             ,
			String                  yd_hndl_capa           ,
			String                  yd_rf_rcpt_440v_knt    ,
			String                  yd_rf_rcpt_220v_knt    ,
			String                  yd_rf_rcpt_dul_knt     ,
			String                  yd_op_sys_cd           ,
			String                  yd_inrl_flg            ,
			String                  yd_cfs_spc             ,
			String                  mnr_shop_flg           ,
			String                  yd_hndl_yr             ,
			String                  yd_ttl_vol_teu_knt     ,
			String                  yd_ttl_vol_bx_knt      ,
			String                  yd_hjs_vol_teu_knt     ,
			String                  yd_hjs_vol_bx_knt      ,
			String                  yd_pst_pgc_knt         ,
			String                  yd_pgc_knt             ,
			String                  trstr_knt              ,
			String                  frk_knt                ,
			String                  yd_strdl_crr_knt       ,
			String                  yd_trct_knt            ,
			String                  yd_top_lft_knt         ,
			String                  tml_chss_knt           ,
			String                  eir_svc_flg            ,
			String                  tml_prod_knt           ,
			String                  yd_cstms_no            ,
			String                  yd_fcty_tp_psdo_yd_flg ,
			String                  yd_eml                 ,
			String                  dem_ib_clt_flg         ,
			String                  dem_ob_clt_flg         ,
			String                  bkg_pod_yd_flg         ,
			String                  n2nd_vndr_cnt_cd       ,
			String                  n2nd_vndr_seq          ,
			String                  n3rd_vndr_cnt_cd       ,
			String                  n3rd_vndr_seq          ,
			String                  dmdt_ofc_cd            ,
			String                  yd_fcty_tp_brg_rmp_flg ,
			String                  bfr_ofc_cd             ,
			String                  bfr_ofc_cng_dt         ,
			String                  modi_yd_cd             ,
			String                  rep_yd_tp_cd           ,
			String                  cre_usr_id             ,
			String                  cre_dt                 ,
			String                  upd_usr_id             ,
			String                  upd_dt                 ,
			String                  delt_flg               ,
			String                  eai_evnt_dt            ,
			String                  hub_yd_flg             ){
		this.ibflag                  = ibflag                 ;
		this.page_rows               = page_rows              ;
		this.yd_cd                   = yd_cd                  ;
		this.yd_nm                   = yd_nm                  ;
		this.loc_cd                  = loc_cd                 ;
		this.n1st_vndr_cnt_cd        = n1st_vndr_cnt_cd       ;
		this.n1st_vndr_seq           = n1st_vndr_seq          ;
		this.ofc_cd                  = ofc_cd                 ;
		this.avg_dwll_hrs            = avg_dwll_hrs           ;
		this.min_dwll_hrs            = min_dwll_hrs           ;
		this.yd_chr_cd               = yd_chr_cd              ;
		this.yd_fcty_tp_mrn_tml_flg  = yd_fcty_tp_mrn_tml_flg ;
		this.yd_fcty_tp_cy_flg       = yd_fcty_tp_cy_flg      ;
		this.yd_fcty_tp_cfs_flg      = yd_fcty_tp_cfs_flg     ;
		this.yd_fcty_tp_rail_rmp_flg = yd_fcty_tp_rail_rmp_flg;
		this.yd_oshp_cd              = yd_oshp_cd             ;
		this.bd_yd_flg               = bd_yd_flg              ;
		this.onf_hir_yd_flg          = onf_hir_yd_flg         ;
		this.yd_ft_hrs               = yd_ft_hrs              ;
		this.rep_zn_cd               = rep_zn_cd              ;
		this.yd_addr                 = yd_addr                ;
		this.zip_cd                  = zip_cd                 ;
		this.intl_phn_no             = intl_phn_no            ;
		this.phn_no                  = phn_no                 ;
		this.fax_no                  = fax_no                 ;
		this.yd_pic_nm               = yd_pic_nm              ;
		this.yd_ceo_nm               = yd_ceo_nm              ;
		this.gate_opn_hrmnt          = gate_opn_hrmnt         ;
		this.gate_clz_hrmnt          = gate_clz_hrmnt         ;
		this.hol_gate_opn_hrmnt      = hol_gate_opn_hrmnt     ;
		this.hol_gate_clz_hrmnt      = hol_gate_clz_hrmnt     ;
		this.sun_gate_opn_hrmnt      = sun_gate_opn_hrmnt     ;
		this.sun_gate_clz_hrmnt      = sun_gate_clz_hrmnt     ;
		this.sat_gate_opn_hrmnt      = sat_gate_opn_hrmnt     ;
		this.sat_gate_clz_hrmnt      = sat_gate_clz_hrmnt     ;
		this.yd_cgo_clz_hrmnt_msg    = yd_cgo_clz_hrmnt_msg   ;
		this.yd_rmk                  = yd_rmk                 ;
		this.brth_no                 = brth_no                ;
		this.yd_brth_len             = yd_brth_len            ;
		this.yd_brth_alng_sd_desc    = yd_brth_alng_sd_desc   ;
		this.yd_brth_dpth_chnl_knt   = yd_brth_dpth_chnl_knt  ;
		this.yd_ttl_spc              = yd_ttl_spc             ;
		this.yd_act_spc              = yd_act_spc             ;
		this.yd_hjs_spc              = yd_hjs_spc             ;
		this.yd_hndl_capa            = yd_hndl_capa           ;
		this.yd_rf_rcpt_440v_knt     = yd_rf_rcpt_440v_knt    ;
		this.yd_rf_rcpt_220v_knt     = yd_rf_rcpt_220v_knt    ;
		this.yd_rf_rcpt_dul_knt      = yd_rf_rcpt_dul_knt     ;
		this.yd_op_sys_cd            = yd_op_sys_cd           ;
		this.yd_inrl_flg             = yd_inrl_flg            ;
		this.yd_cfs_spc              = yd_cfs_spc             ;
		this.mnr_shop_flg            = mnr_shop_flg           ;
		this.yd_hndl_yr              = yd_hndl_yr             ;
		this.yd_ttl_vol_teu_knt      = yd_ttl_vol_teu_knt     ;
		this.yd_ttl_vol_bx_knt       = yd_ttl_vol_bx_knt      ;
		this.yd_hjs_vol_teu_knt      = yd_hjs_vol_teu_knt     ;
		this.yd_hjs_vol_bx_knt       = yd_hjs_vol_bx_knt      ;
		this.yd_pst_pgc_knt          = yd_pst_pgc_knt         ;
		this.yd_pgc_knt              = yd_pgc_knt             ;
		this.trstr_knt               = trstr_knt              ;
		this.frk_knt                 = frk_knt                ;
		this.yd_strdl_crr_knt        = yd_strdl_crr_knt       ;
		this.yd_trct_knt             = yd_trct_knt            ;
		this.yd_top_lft_knt          = yd_top_lft_knt         ;
		this.tml_chss_knt            = tml_chss_knt           ;
		this.eir_svc_flg             = eir_svc_flg            ;
		this.tml_prod_knt            = tml_prod_knt           ;
		this.yd_cstms_no             = yd_cstms_no            ;
		this.yd_fcty_tp_psdo_yd_flg  = yd_fcty_tp_psdo_yd_flg ;
		this.yd_eml                  = yd_eml                 ;
		this.dem_ib_clt_flg          = dem_ib_clt_flg         ;
		this.dem_ob_clt_flg          = dem_ob_clt_flg         ;
		this.bkg_pod_yd_flg          = bkg_pod_yd_flg         ;
		this.n2nd_vndr_cnt_cd        = n2nd_vndr_cnt_cd       ;
		this.n2nd_vndr_seq           = n2nd_vndr_seq          ;
		this.n3rd_vndr_cnt_cd        = n3rd_vndr_cnt_cd       ;
		this.n3rd_vndr_seq           = n3rd_vndr_seq          ;
		this.dmdt_ofc_cd             = dmdt_ofc_cd            ;
		this.yd_fcty_tp_brg_rmp_flg  = yd_fcty_tp_brg_rmp_flg ;
		this.bfr_ofc_cd              = bfr_ofc_cd             ;
		this.bfr_ofc_cng_dt          = bfr_ofc_cng_dt         ;
		this.modi_yd_cd              = modi_yd_cd             ;
		this.rep_yd_tp_cd            = rep_yd_tp_cd           ;
		this.cre_usr_id              = cre_usr_id             ;
		this.cre_dt                  = cre_dt                 ;
		this.upd_usr_id              = upd_usr_id             ;
		this.upd_dt                  = upd_dt                 ;
		this.delt_flg                = delt_flg               ;
		this.eai_evnt_dt             = eai_evnt_dt            ;
		this.hub_yd_flg              = hub_yd_flg             ;
	}

	// getter method is proceeding ..
	public String                  getIbflag                 (){	return ibflag                 	;	}
	public String                  getPage_rows              (){	return page_rows              	;	}
	public String                  getYd_cd                  (){	return yd_cd                  	;	}
	public String                  getYd_nm                  (){	return yd_nm                  	;	}
	public String                  getLoc_cd                 (){	return loc_cd                 	;	}
	public String                  getN1st_vndr_cnt_cd       (){	return n1st_vndr_cnt_cd       	;	}
	public String                  getN1st_vndr_seq          (){	return n1st_vndr_seq          	;	}
	public String                  getOfc_cd                 (){	return ofc_cd                 	;	}
	public String                  getAvg_dwll_hrs           (){	return avg_dwll_hrs           	;	}
	public String                  getMin_dwll_hrs           (){	return min_dwll_hrs           	;	}
	public String                  getYd_chr_cd              (){	return yd_chr_cd              	;	}
	public String                  getYd_fcty_tp_mrn_tml_flg (){	return yd_fcty_tp_mrn_tml_flg 	;	}
	public String                  getYd_fcty_tp_cy_flg      (){	return yd_fcty_tp_cy_flg      	;	}
	public String                  getYd_fcty_tp_cfs_flg     (){	return yd_fcty_tp_cfs_flg     	;	}
	public String                  getYd_fcty_tp_rail_rmp_flg(){	return yd_fcty_tp_rail_rmp_flg	;	}
	public String                  getYd_oshp_cd             (){	return yd_oshp_cd             	;	}
	public String                  getBd_yd_flg              (){	return bd_yd_flg              	;	}
	public String                  getOnf_hir_yd_flg         (){	return onf_hir_yd_flg         	;	}
	public String                  getYd_ft_hrs              (){	return yd_ft_hrs              	;	}
	public String                  getRep_zn_cd              (){	return rep_zn_cd              	;	}
	public String                  getYd_addr                (){	return yd_addr                	;	}
	public String                  getZip_cd                 (){	return zip_cd                 	;	}
	public String                  getIntl_phn_no            (){	return intl_phn_no            	;	}
	public String                  getPhn_no                 (){	return phn_no                 	;	}
	public String                  getFax_no                 (){	return fax_no                 	;	}
	public String                  getYd_pic_nm              (){	return yd_pic_nm              	;	}
	public String                  getYd_ceo_nm              (){	return yd_ceo_nm              	;	}
	public String                  getGate_opn_hrmnt         (){	return gate_opn_hrmnt         	;	}
	public String                  getGate_clz_hrmnt         (){	return gate_clz_hrmnt         	;	}
	public String                  getHol_gate_opn_hrmnt     (){	return hol_gate_opn_hrmnt     	;	}
	public String                  getHol_gate_clz_hrmnt     (){	return hol_gate_clz_hrmnt     	;	}
	public String                  getSun_gate_opn_hrmnt     (){	return sun_gate_opn_hrmnt     	;	}
	public String                  getSun_gate_clz_hrmnt     (){	return sun_gate_clz_hrmnt     	;	}
	public String                  getSat_gate_opn_hrmnt     (){	return sat_gate_opn_hrmnt     	;	}
	public String                  getSat_gate_clz_hrmnt     (){	return sat_gate_clz_hrmnt     	;	}
	public String                  getYd_cgo_clz_hrmnt_msg   (){	return yd_cgo_clz_hrmnt_msg   	;	}
	public String                  getYd_rmk                 (){	return yd_rmk                 	;	}
	public String                  getBrth_no                (){	return brth_no                	;	}
	public String                  getYd_brth_len            (){	return yd_brth_len            	;	}
	public String                  getYd_brth_alng_sd_desc   (){	return yd_brth_alng_sd_desc   	;	}
	public String                  getYd_brth_dpth_chnl_knt  (){	return yd_brth_dpth_chnl_knt  	;	}
	public String                  getYd_ttl_spc             (){	return yd_ttl_spc             	;	}
	public String                  getYd_act_spc             (){	return yd_act_spc             	;	}
	public String                  getYd_hjs_spc             (){	return yd_hjs_spc             	;	}
	public String                  getYd_hndl_capa           (){	return yd_hndl_capa           	;	}
	public String                  getYd_rf_rcpt_440v_knt    (){	return yd_rf_rcpt_440v_knt    	;	}
	public String                  getYd_rf_rcpt_220v_knt    (){	return yd_rf_rcpt_220v_knt    	;	}
	public String                  getYd_rf_rcpt_dul_knt     (){	return yd_rf_rcpt_dul_knt     	;	}
	public String                  getYd_op_sys_cd           (){	return yd_op_sys_cd           	;	}
	public String                  getYd_inrl_flg            (){	return yd_inrl_flg            	;	}
	public String                  getYd_cfs_spc             (){	return yd_cfs_spc             	;	}
	public String                  getMnr_shop_flg           (){	return mnr_shop_flg           	;	}
	public String                  getYd_hndl_yr             (){	return yd_hndl_yr             	;	}
	public String                  getYd_ttl_vol_teu_knt     (){	return yd_ttl_vol_teu_knt     	;	}
	public String                  getYd_ttl_vol_bx_knt      (){	return yd_ttl_vol_bx_knt      	;	}
	public String                  getYd_hjs_vol_teu_knt     (){	return yd_hjs_vol_teu_knt     	;	}
	public String                  getYd_hjs_vol_bx_knt      (){	return yd_hjs_vol_bx_knt      	;	}
	public String                  getYd_pst_pgc_knt         (){	return yd_pst_pgc_knt         	;	}
	public String                  getYd_pgc_knt             (){	return yd_pgc_knt             	;	}
	public String                  getTrstr_knt              (){	return trstr_knt              	;	}
	public String                  getFrk_knt                (){	return frk_knt                	;	}
	public String                  getYd_strdl_crr_knt       (){	return yd_strdl_crr_knt       	;	}
	public String                  getYd_trct_knt            (){	return yd_trct_knt            	;	}
	public String                  getYd_top_lft_knt         (){	return yd_top_lft_knt         	;	}
	public String                  getTml_chss_knt           (){	return tml_chss_knt           	;	}
	public String                  getEir_svc_flg            (){	return eir_svc_flg            	;	}
	public String                  getTml_prod_knt           (){	return tml_prod_knt           	;	}
	public String                  getYd_cstms_no            (){	return yd_cstms_no            	;	}
	public String                  getYd_fcty_tp_psdo_yd_flg (){	return yd_fcty_tp_psdo_yd_flg 	;	}
	public String                  getYd_eml                 (){	return yd_eml                 	;	}
	public String                  getDem_ib_clt_flg         (){	return dem_ib_clt_flg         	;	}
	public String                  getDem_ob_clt_flg         (){	return dem_ob_clt_flg         	;	}
	public String                  getBkg_pod_yd_flg         (){	return bkg_pod_yd_flg         	;	}
	public String                  getN2nd_vndr_cnt_cd       (){	return n2nd_vndr_cnt_cd       	;	}
	public String                  getN2nd_vndr_seq          (){	return n2nd_vndr_seq          	;	}
	public String                  getN3rd_vndr_cnt_cd       (){	return n3rd_vndr_cnt_cd       	;	}
	public String                  getN3rd_vndr_seq          (){	return n3rd_vndr_seq          	;	}
	public String                  getDmdt_ofc_cd            (){	return dmdt_ofc_cd            	;	}
	public String                  getYd_fcty_tp_brg_rmp_flg (){	return yd_fcty_tp_brg_rmp_flg 	;	}
	public String                  getBfr_ofc_cd             (){	return bfr_ofc_cd             	;	}
	public String                  getBfr_ofc_cng_dt         (){	return bfr_ofc_cng_dt         	;	}
	public String                  getModi_yd_cd             (){	return modi_yd_cd             	;	}
	public String                  getRep_yd_tp_cd           (){	return rep_yd_tp_cd           	;	}
	public String                  getCre_usr_id             (){	return cre_usr_id             	;	}
	public String                  getCre_dt                 (){	return cre_dt                 	;	}
	public String                  getUpd_usr_id             (){	return upd_usr_id             	;	}
	public String                  getUpd_dt                 (){	return upd_dt                 	;	}
	public String                  getDelt_flg               (){	return delt_flg               	;	}
	public String                  getEai_evnt_dt            (){	return eai_evnt_dt            	;	}
	public String                  getHub_yd_flg             (){	return hub_yd_flg             	;	}

	// setter method is proceeding ..
	public void setIbflag                 ( String                  ibflag                  ){	this.ibflag                  = ibflag                 	;	}
	public void setPage_rows              ( String                  page_rows               ){	this.page_rows               = page_rows              	;	}
	public void setYd_cd                  ( String                  yd_cd                   ){	this.yd_cd                   = yd_cd                  	;	}
	public void setYd_nm                  ( String                  yd_nm                   ){	this.yd_nm                   = yd_nm                  	;	}
	public void setLoc_cd                 ( String                  loc_cd                  ){	this.loc_cd                  = loc_cd                 	;	}
	public void setN1st_vndr_cnt_cd       ( String                  n1st_vndr_cnt_cd        ){	this.n1st_vndr_cnt_cd        = n1st_vndr_cnt_cd       	;	}
	public void setN1st_vndr_seq          ( String                  n1st_vndr_seq           ){	this.n1st_vndr_seq           = n1st_vndr_seq          	;	}
	public void setOfc_cd                 ( String                  ofc_cd                  ){	this.ofc_cd                  = ofc_cd                 	;	}
	public void setAvg_dwll_hrs           ( String                  avg_dwll_hrs            ){	this.avg_dwll_hrs            = avg_dwll_hrs           	;	}
	public void setMin_dwll_hrs           ( String                  min_dwll_hrs            ){	this.min_dwll_hrs            = min_dwll_hrs           	;	}
	public void setYd_chr_cd              ( String                  yd_chr_cd               ){	this.yd_chr_cd               = yd_chr_cd              	;	}
	public void setYd_fcty_tp_mrn_tml_flg ( String                  yd_fcty_tp_mrn_tml_flg  ){	this.yd_fcty_tp_mrn_tml_flg  = yd_fcty_tp_mrn_tml_flg 	;	}
	public void setYd_fcty_tp_cy_flg      ( String                  yd_fcty_tp_cy_flg       ){	this.yd_fcty_tp_cy_flg       = yd_fcty_tp_cy_flg      	;	}
	public void setYd_fcty_tp_cfs_flg     ( String                  yd_fcty_tp_cfs_flg      ){	this.yd_fcty_tp_cfs_flg      = yd_fcty_tp_cfs_flg     	;	}
	public void setYd_fcty_tp_rail_rmp_flg( String                  yd_fcty_tp_rail_rmp_flg ){	this.yd_fcty_tp_rail_rmp_flg = yd_fcty_tp_rail_rmp_flg	;	}
	public void setYd_oshp_cd             ( String                  yd_oshp_cd              ){	this.yd_oshp_cd              = yd_oshp_cd             	;	}
	public void setBd_yd_flg              ( String                  bd_yd_flg               ){	this.bd_yd_flg               = bd_yd_flg              	;	}
	public void setOnf_hir_yd_flg         ( String                  onf_hir_yd_flg          ){	this.onf_hir_yd_flg          = onf_hir_yd_flg         	;	}
	public void setYd_ft_hrs              ( String                  yd_ft_hrs               ){	this.yd_ft_hrs               = yd_ft_hrs              	;	}
	public void setRep_zn_cd              ( String                  rep_zn_cd               ){	this.rep_zn_cd               = rep_zn_cd              	;	}
	public void setYd_addr                ( String                  yd_addr                 ){	this.yd_addr                 = yd_addr                	;	}
	public void setZip_cd                 ( String                  zip_cd                  ){	this.zip_cd                  = zip_cd                 	;	}
	public void setIntl_phn_no            ( String                  intl_phn_no             ){	this.intl_phn_no             = intl_phn_no            	;	}
	public void setPhn_no                 ( String                  phn_no                  ){	this.phn_no                  = phn_no                 	;	}
	public void setFax_no                 ( String                  fax_no                  ){	this.fax_no                  = fax_no                 	;	}
	public void setYd_pic_nm              ( String                  yd_pic_nm               ){	this.yd_pic_nm               = yd_pic_nm              	;	}
	public void setYd_ceo_nm              ( String                  yd_ceo_nm               ){	this.yd_ceo_nm               = yd_ceo_nm              	;	}
	public void setGate_opn_hrmnt         ( String                  gate_opn_hrmnt          ){	this.gate_opn_hrmnt          = gate_opn_hrmnt         	;	}
	public void setGate_clz_hrmnt         ( String                  gate_clz_hrmnt          ){	this.gate_clz_hrmnt          = gate_clz_hrmnt         	;	}
	public void setHol_gate_opn_hrmnt     ( String                  hol_gate_opn_hrmnt      ){	this.hol_gate_opn_hrmnt      = hol_gate_opn_hrmnt     	;	}
	public void setHol_gate_clz_hrmnt     ( String                  hol_gate_clz_hrmnt      ){	this.hol_gate_clz_hrmnt      = hol_gate_clz_hrmnt     	;	}
	public void setSun_gate_opn_hrmnt     ( String                  sun_gate_opn_hrmnt      ){	this.sun_gate_opn_hrmnt      = sun_gate_opn_hrmnt     	;	}
	public void setSun_gate_clz_hrmnt     ( String                  sun_gate_clz_hrmnt      ){	this.sun_gate_clz_hrmnt      = sun_gate_clz_hrmnt     	;	}
	public void setSat_gate_opn_hrmnt     ( String                  sat_gate_opn_hrmnt      ){	this.sat_gate_opn_hrmnt      = sat_gate_opn_hrmnt     	;	}
	public void setSat_gate_clz_hrmnt     ( String                  sat_gate_clz_hrmnt      ){	this.sat_gate_clz_hrmnt      = sat_gate_clz_hrmnt     	;	}
	public void setYd_cgo_clz_hrmnt_msg   ( String                  yd_cgo_clz_hrmnt_msg    ){	this.yd_cgo_clz_hrmnt_msg    = yd_cgo_clz_hrmnt_msg   	;	}
	public void setYd_rmk                 ( String                  yd_rmk                  ){	this.yd_rmk                  = yd_rmk                 	;	}
	public void setBrth_no                ( String                  brth_no                 ){	this.brth_no                 = brth_no                	;	}
	public void setYd_brth_len            ( String                  yd_brth_len             ){	this.yd_brth_len             = yd_brth_len            	;	}
	public void setYd_brth_alng_sd_desc   ( String                  yd_brth_alng_sd_desc    ){	this.yd_brth_alng_sd_desc    = yd_brth_alng_sd_desc   	;	}
	public void setYd_brth_dpth_chnl_knt  ( String                  yd_brth_dpth_chnl_knt   ){	this.yd_brth_dpth_chnl_knt   = yd_brth_dpth_chnl_knt  	;	}
	public void setYd_ttl_spc             ( String                  yd_ttl_spc              ){	this.yd_ttl_spc              = yd_ttl_spc             	;	}
	public void setYd_act_spc             ( String                  yd_act_spc              ){	this.yd_act_spc              = yd_act_spc             	;	}
	public void setYd_hjs_spc             ( String                  yd_hjs_spc              ){	this.yd_hjs_spc              = yd_hjs_spc             	;	}
	public void setYd_hndl_capa           ( String                  yd_hndl_capa            ){	this.yd_hndl_capa            = yd_hndl_capa           	;	}
	public void setYd_rf_rcpt_440v_knt    ( String                  yd_rf_rcpt_440v_knt     ){	this.yd_rf_rcpt_440v_knt     = yd_rf_rcpt_440v_knt    	;	}
	public void setYd_rf_rcpt_220v_knt    ( String                  yd_rf_rcpt_220v_knt     ){	this.yd_rf_rcpt_220v_knt     = yd_rf_rcpt_220v_knt    	;	}
	public void setYd_rf_rcpt_dul_knt     ( String                  yd_rf_rcpt_dul_knt      ){	this.yd_rf_rcpt_dul_knt      = yd_rf_rcpt_dul_knt     	;	}
	public void setYd_op_sys_cd           ( String                  yd_op_sys_cd            ){	this.yd_op_sys_cd            = yd_op_sys_cd           	;	}
	public void setYd_inrl_flg            ( String                  yd_inrl_flg             ){	this.yd_inrl_flg             = yd_inrl_flg            	;	}
	public void setYd_cfs_spc             ( String                  yd_cfs_spc              ){	this.yd_cfs_spc              = yd_cfs_spc             	;	}
	public void setMnr_shop_flg           ( String                  mnr_shop_flg            ){	this.mnr_shop_flg            = mnr_shop_flg           	;	}
	public void setYd_hndl_yr             ( String                  yd_hndl_yr              ){	this.yd_hndl_yr              = yd_hndl_yr             	;	}
	public void setYd_ttl_vol_teu_knt     ( String                  yd_ttl_vol_teu_knt      ){	this.yd_ttl_vol_teu_knt      = yd_ttl_vol_teu_knt     	;	}
	public void setYd_ttl_vol_bx_knt      ( String                  yd_ttl_vol_bx_knt       ){	this.yd_ttl_vol_bx_knt       = yd_ttl_vol_bx_knt      	;	}
	public void setYd_hjs_vol_teu_knt     ( String                  yd_hjs_vol_teu_knt      ){	this.yd_hjs_vol_teu_knt      = yd_hjs_vol_teu_knt     	;	}
	public void setYd_hjs_vol_bx_knt      ( String                  yd_hjs_vol_bx_knt       ){	this.yd_hjs_vol_bx_knt       = yd_hjs_vol_bx_knt      	;	}
	public void setYd_pst_pgc_knt         ( String                  yd_pst_pgc_knt          ){	this.yd_pst_pgc_knt          = yd_pst_pgc_knt         	;	}
	public void setYd_pgc_knt             ( String                  yd_pgc_knt              ){	this.yd_pgc_knt              = yd_pgc_knt             	;	}
	public void setTrstr_knt              ( String                  trstr_knt               ){	this.trstr_knt               = trstr_knt              	;	}
	public void setFrk_knt                ( String                  frk_knt                 ){	this.frk_knt                 = frk_knt                	;	}
	public void setYd_strdl_crr_knt       ( String                  yd_strdl_crr_knt        ){	this.yd_strdl_crr_knt        = yd_strdl_crr_knt       	;	}
	public void setYd_trct_knt            ( String                  yd_trct_knt             ){	this.yd_trct_knt             = yd_trct_knt            	;	}
	public void setYd_top_lft_knt         ( String                  yd_top_lft_knt          ){	this.yd_top_lft_knt          = yd_top_lft_knt         	;	}
	public void setTml_chss_knt           ( String                  tml_chss_knt            ){	this.tml_chss_knt            = tml_chss_knt           	;	}
	public void setEir_svc_flg            ( String                  eir_svc_flg             ){	this.eir_svc_flg             = eir_svc_flg            	;	}
	public void setTml_prod_knt           ( String                  tml_prod_knt            ){	this.tml_prod_knt            = tml_prod_knt           	;	}
	public void setYd_cstms_no            ( String                  yd_cstms_no             ){	this.yd_cstms_no             = yd_cstms_no            	;	}
	public void setYd_fcty_tp_psdo_yd_flg ( String                  yd_fcty_tp_psdo_yd_flg  ){	this.yd_fcty_tp_psdo_yd_flg  = yd_fcty_tp_psdo_yd_flg 	;	}
	public void setYd_eml                 ( String                  yd_eml                  ){	this.yd_eml                  = yd_eml                 	;	}
	public void setDem_ib_clt_flg         ( String                  dem_ib_clt_flg          ){	this.dem_ib_clt_flg          = dem_ib_clt_flg         	;	}
	public void setDem_ob_clt_flg         ( String                  dem_ob_clt_flg          ){	this.dem_ob_clt_flg          = dem_ob_clt_flg         	;	}
	public void setBkg_pod_yd_flg         ( String                  bkg_pod_yd_flg          ){	this.bkg_pod_yd_flg          = bkg_pod_yd_flg         	;	}
	public void setN2nd_vndr_cnt_cd       ( String                  n2nd_vndr_cnt_cd        ){	this.n2nd_vndr_cnt_cd        = n2nd_vndr_cnt_cd       	;	}
	public void setN2nd_vndr_seq          ( String                  n2nd_vndr_seq           ){	this.n2nd_vndr_seq           = n2nd_vndr_seq          	;	}
	public void setN3rd_vndr_cnt_cd       ( String                  n3rd_vndr_cnt_cd        ){	this.n3rd_vndr_cnt_cd        = n3rd_vndr_cnt_cd       	;	}
	public void setN3rd_vndr_seq          ( String                  n3rd_vndr_seq           ){	this.n3rd_vndr_seq           = n3rd_vndr_seq          	;	}
	public void setDmdt_ofc_cd            ( String                  dmdt_ofc_cd             ){	this.dmdt_ofc_cd             = dmdt_ofc_cd            	;	}
	public void setYd_fcty_tp_brg_rmp_flg ( String                  yd_fcty_tp_brg_rmp_flg  ){	this.yd_fcty_tp_brg_rmp_flg  = yd_fcty_tp_brg_rmp_flg 	;	}
	public void setBfr_ofc_cd             ( String                  bfr_ofc_cd              ){	this.bfr_ofc_cd              = bfr_ofc_cd             	;	}
	public void setBfr_ofc_cng_dt         ( String                  bfr_ofc_cng_dt          ){	this.bfr_ofc_cng_dt          = bfr_ofc_cng_dt         	;	}
	public void setModi_yd_cd             ( String                  modi_yd_cd              ){	this.modi_yd_cd              = modi_yd_cd             	;	}
	public void setRep_yd_tp_cd           ( String                  rep_yd_tp_cd            ){	this.rep_yd_tp_cd            = rep_yd_tp_cd           	;	}
	public void setCre_usr_id             ( String                  cre_usr_id              ){	this.cre_usr_id              = cre_usr_id             	;	}
	public void setCre_dt                 ( String                  cre_dt                  ){	this.cre_dt                  = cre_dt                 	;	}
	public void setUpd_usr_id             ( String                  upd_usr_id              ){	this.upd_usr_id              = upd_usr_id             	;	}
	public void setUpd_dt                 ( String                  upd_dt                  ){	this.upd_dt                  = upd_dt                 	;	}
	public void setDelt_flg               ( String                  delt_flg                ){	this.delt_flg                = delt_flg               	;	}
	public void setEai_evnt_dt            ( String                  eai_evnt_dt             ){	this.eai_evnt_dt             = eai_evnt_dt            	;	}
	public void setHub_yd_flg             ( String                  hub_yd_flg              ){	this.hub_yd_flg              = hub_yd_flg             	;	}

	public static MdmYard fromRequest(HttpServletRequest request) {
		MdmYard model = new MdmYard();
		try {
			model.setIbflag                 	(JSPUtil.getParameter(request, "ibflag                 		".trim(), ""));
			model.setPage_rows              	(JSPUtil.getParameter(request, "page_rows              		".trim(), ""));
			model.setYd_cd                  	(JSPUtil.getParameter(request, "yd_cd                  		".trim(), ""));
			model.setYd_nm                  	(JSPUtil.getParameter(request, "yd_nm                  		".trim(), ""));
			model.setLoc_cd                 	(JSPUtil.getParameter(request, "loc_cd                 		".trim(), ""));
			model.setN1st_vndr_cnt_cd       	(JSPUtil.getParameter(request, "n1st_vndr_cnt_cd       		".trim(), ""));
			model.setN1st_vndr_seq          	(JSPUtil.getParameter(request, "n1st_vndr_seq          		".trim(), ""));
			model.setOfc_cd                 	(JSPUtil.getParameter(request, "ofc_cd                 		".trim(), ""));
			model.setAvg_dwll_hrs           	(JSPUtil.getParameter(request, "avg_dwll_hrs           		".trim(), ""));
			model.setMin_dwll_hrs           	(JSPUtil.getParameter(request, "min_dwll_hrs           		".trim(), ""));
			model.setYd_chr_cd              	(JSPUtil.getParameter(request, "yd_chr_cd              		".trim(), ""));
			model.setYd_fcty_tp_mrn_tml_flg 	(JSPUtil.getParameter(request, "yd_fcty_tp_mrn_tml_flg 		".trim(), ""));
			model.setYd_fcty_tp_cy_flg      	(JSPUtil.getParameter(request, "yd_fcty_tp_cy_flg      		".trim(), ""));
			model.setYd_fcty_tp_cfs_flg     	(JSPUtil.getParameter(request, "yd_fcty_tp_cfs_flg     		".trim(), ""));
			model.setYd_fcty_tp_rail_rmp_flg	(JSPUtil.getParameter(request, "yd_fcty_tp_rail_rmp_flg		".trim(), ""));
			model.setYd_oshp_cd             	(JSPUtil.getParameter(request, "yd_oshp_cd             		".trim(), ""));
			model.setBd_yd_flg              	(JSPUtil.getParameter(request, "bd_yd_flg              		".trim(), ""));
			model.setOnf_hir_yd_flg         	(JSPUtil.getParameter(request, "onf_hir_yd_flg         		".trim(), ""));
			model.setYd_ft_hrs              	(JSPUtil.getParameter(request, "yd_ft_hrs              		".trim(), ""));
			model.setRep_zn_cd              	(JSPUtil.getParameter(request, "rep_zn_cd              		".trim(), ""));
			model.setYd_addr                	(JSPUtil.getParameter(request, "yd_addr                		".trim(), ""));
			model.setZip_cd                 	(JSPUtil.getParameter(request, "zip_cd                 		".trim(), ""));
			model.setIntl_phn_no            	(JSPUtil.getParameter(request, "intl_phn_no            		".trim(), ""));
			model.setPhn_no                 	(JSPUtil.getParameter(request, "phn_no                 		".trim(), ""));
			model.setFax_no                 	(JSPUtil.getParameter(request, "fax_no                 		".trim(), ""));
			model.setYd_pic_nm              	(JSPUtil.getParameter(request, "yd_pic_nm              		".trim(), ""));
			model.setYd_ceo_nm              	(JSPUtil.getParameter(request, "yd_ceo_nm              		".trim(), ""));
			model.setGate_opn_hrmnt         	(JSPUtil.getParameter(request, "gate_opn_hrmnt         		".trim(), ""));
			model.setGate_clz_hrmnt         	(JSPUtil.getParameter(request, "gate_clz_hrmnt         		".trim(), ""));
			model.setHol_gate_opn_hrmnt     	(JSPUtil.getParameter(request, "hol_gate_opn_hrmnt     		".trim(), ""));
			model.setHol_gate_clz_hrmnt     	(JSPUtil.getParameter(request, "hol_gate_clz_hrmnt     		".trim(), ""));
			model.setSun_gate_opn_hrmnt     	(JSPUtil.getParameter(request, "sun_gate_opn_hrmnt     		".trim(), ""));
			model.setSun_gate_clz_hrmnt     	(JSPUtil.getParameter(request, "sun_gate_clz_hrmnt     		".trim(), ""));
			model.setSat_gate_opn_hrmnt     	(JSPUtil.getParameter(request, "sat_gate_opn_hrmnt     		".trim(), ""));
			model.setSat_gate_clz_hrmnt     	(JSPUtil.getParameter(request, "sat_gate_clz_hrmnt     		".trim(), ""));
			model.setYd_cgo_clz_hrmnt_msg   	(JSPUtil.getParameter(request, "yd_cgo_clz_hrmnt_msg   		".trim(), ""));
			model.setYd_rmk                 	(JSPUtil.getParameter(request, "yd_rmk                 		".trim(), ""));
			model.setBrth_no                	(JSPUtil.getParameter(request, "brth_no                		".trim(), ""));
			model.setYd_brth_len            	(JSPUtil.getParameter(request, "yd_brth_len            		".trim(), ""));
			model.setYd_brth_alng_sd_desc   	(JSPUtil.getParameter(request, "yd_brth_alng_sd_desc   		".trim(), ""));
			model.setYd_brth_dpth_chnl_knt  	(JSPUtil.getParameter(request, "yd_brth_dpth_chnl_knt  		".trim(), ""));
			model.setYd_ttl_spc             	(JSPUtil.getParameter(request, "yd_ttl_spc             		".trim(), ""));
			model.setYd_act_spc             	(JSPUtil.getParameter(request, "yd_act_spc             		".trim(), ""));
			model.setYd_hjs_spc             	(JSPUtil.getParameter(request, "yd_hjs_spc             		".trim(), ""));
			model.setYd_hndl_capa           	(JSPUtil.getParameter(request, "yd_hndl_capa           		".trim(), ""));
			model.setYd_rf_rcpt_440v_knt    	(JSPUtil.getParameter(request, "yd_rf_rcpt_440v_knt    		".trim(), ""));
			model.setYd_rf_rcpt_220v_knt    	(JSPUtil.getParameter(request, "yd_rf_rcpt_220v_knt    		".trim(), ""));
			model.setYd_rf_rcpt_dul_knt     	(JSPUtil.getParameter(request, "yd_rf_rcpt_dul_knt     		".trim(), ""));
			model.setYd_op_sys_cd           	(JSPUtil.getParameter(request, "yd_op_sys_cd           		".trim(), ""));
			model.setYd_inrl_flg            	(JSPUtil.getParameter(request, "yd_inrl_flg            		".trim(), ""));
			model.setYd_cfs_spc             	(JSPUtil.getParameter(request, "yd_cfs_spc             		".trim(), ""));
			model.setMnr_shop_flg           	(JSPUtil.getParameter(request, "mnr_shop_flg           		".trim(), ""));
			model.setYd_hndl_yr             	(JSPUtil.getParameter(request, "yd_hndl_yr             		".trim(), ""));
			model.setYd_ttl_vol_teu_knt     	(JSPUtil.getParameter(request, "yd_ttl_vol_teu_knt     		".trim(), ""));
			model.setYd_ttl_vol_bx_knt      	(JSPUtil.getParameter(request, "yd_ttl_vol_bx_knt      		".trim(), ""));
			model.setYd_hjs_vol_teu_knt     	(JSPUtil.getParameter(request, "yd_hjs_vol_teu_knt     		".trim(), ""));
			model.setYd_hjs_vol_bx_knt      	(JSPUtil.getParameter(request, "yd_hjs_vol_bx_knt      		".trim(), ""));
			model.setYd_pst_pgc_knt         	(JSPUtil.getParameter(request, "yd_pst_pgc_knt         		".trim(), ""));
			model.setYd_pgc_knt             	(JSPUtil.getParameter(request, "yd_pgc_knt             		".trim(), ""));
			model.setTrstr_knt              	(JSPUtil.getParameter(request, "trstr_knt              		".trim(), ""));
			model.setFrk_knt                	(JSPUtil.getParameter(request, "frk_knt                		".trim(), ""));
			model.setYd_strdl_crr_knt       	(JSPUtil.getParameter(request, "yd_strdl_crr_knt       		".trim(), ""));
			model.setYd_trct_knt            	(JSPUtil.getParameter(request, "yd_trct_knt            		".trim(), ""));
			model.setYd_top_lft_knt         	(JSPUtil.getParameter(request, "yd_top_lft_knt         		".trim(), ""));
			model.setTml_chss_knt           	(JSPUtil.getParameter(request, "tml_chss_knt           		".trim(), ""));
			model.setEir_svc_flg            	(JSPUtil.getParameter(request, "eir_svc_flg            		".trim(), ""));
			model.setTml_prod_knt           	(JSPUtil.getParameter(request, "tml_prod_knt           		".trim(), ""));
			model.setYd_cstms_no            	(JSPUtil.getParameter(request, "yd_cstms_no            		".trim(), ""));
			model.setYd_fcty_tp_psdo_yd_flg 	(JSPUtil.getParameter(request, "yd_fcty_tp_psdo_yd_flg 		".trim(), ""));
			model.setYd_eml                 	(JSPUtil.getParameter(request, "yd_eml                 		".trim(), ""));
			model.setDem_ib_clt_flg         	(JSPUtil.getParameter(request, "dem_ib_clt_flg         		".trim(), ""));
			model.setDem_ob_clt_flg         	(JSPUtil.getParameter(request, "dem_ob_clt_flg         		".trim(), ""));
			model.setBkg_pod_yd_flg         	(JSPUtil.getParameter(request, "bkg_pod_yd_flg         		".trim(), ""));
			model.setN2nd_vndr_cnt_cd       	(JSPUtil.getParameter(request, "n2nd_vndr_cnt_cd       		".trim(), ""));
			model.setN2nd_vndr_seq          	(JSPUtil.getParameter(request, "n2nd_vndr_seq          		".trim(), ""));
			model.setN3rd_vndr_cnt_cd       	(JSPUtil.getParameter(request, "n3rd_vndr_cnt_cd       		".trim(), ""));
			model.setN3rd_vndr_seq          	(JSPUtil.getParameter(request, "n3rd_vndr_seq          		".trim(), ""));
			model.setDmdt_ofc_cd            	(JSPUtil.getParameter(request, "dmdt_ofc_cd            		".trim(), ""));
			model.setYd_fcty_tp_brg_rmp_flg 	(JSPUtil.getParameter(request, "yd_fcty_tp_brg_rmp_flg 		".trim(), ""));
			model.setBfr_ofc_cd             	(JSPUtil.getParameter(request, "bfr_ofc_cd             		".trim(), ""));
			model.setBfr_ofc_cng_dt         	(JSPUtil.getParameter(request, "bfr_ofc_cng_dt         		".trim(), ""));
			model.setModi_yd_cd             	(JSPUtil.getParameter(request, "modi_yd_cd             		".trim(), ""));
			model.setRep_yd_tp_cd           	(JSPUtil.getParameter(request, "rep_yd_tp_cd           		".trim(), ""));
			model.setCre_usr_id             	(JSPUtil.getParameter(request, "cre_usr_id             		".trim(), ""));
			model.setCre_dt                 	(JSPUtil.getParameter(request, "cre_dt                 		".trim(), ""));
			model.setUpd_usr_id             	(JSPUtil.getParameter(request, "upd_usr_id             		".trim(), ""));
			model.setUpd_dt                 	(JSPUtil.getParameter(request, "upd_dt                 		".trim(), ""));
			model.setDelt_flg               	(JSPUtil.getParameter(request, "delt_flg               		".trim(), ""));
			model.setEai_evnt_dt            	(JSPUtil.getParameter(request, "eai_evnt_dt            		".trim(), ""));
			model.setHub_yd_flg             	(JSPUtil.getParameter(request, "hub_yd_flg             		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		MdmYard model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag                  =  (JSPUtil.getParameter(request, "ibflag                 		".trim(), length));
			String[] page_rows               =  (JSPUtil.getParameter(request, "page_rows              		".trim(), length));
			String[] yd_cd                   =  (JSPUtil.getParameter(request, "yd_cd                  		".trim(), length));
			String[] yd_nm                   =  (JSPUtil.getParameter(request, "yd_nm                  		".trim(), length));
			String[] loc_cd                  =  (JSPUtil.getParameter(request, "loc_cd                 		".trim(), length));
			String[] n1st_vndr_cnt_cd        =  (JSPUtil.getParameter(request, "n1st_vndr_cnt_cd       		".trim(), length));
			String[] n1st_vndr_seq           =  (JSPUtil.getParameter(request, "n1st_vndr_seq          		".trim(), length));
			String[] ofc_cd                  =  (JSPUtil.getParameter(request, "ofc_cd                 		".trim(), length));
			String[] avg_dwll_hrs            =  (JSPUtil.getParameter(request, "avg_dwll_hrs           		".trim(), length));
			String[] min_dwll_hrs            =  (JSPUtil.getParameter(request, "min_dwll_hrs           		".trim(), length));
			String[] yd_chr_cd               =  (JSPUtil.getParameter(request, "yd_chr_cd              		".trim(), length));
			String[] yd_fcty_tp_mrn_tml_flg  =  (JSPUtil.getParameter(request, "yd_fcty_tp_mrn_tml_flg 		".trim(), length));
			String[] yd_fcty_tp_cy_flg       =  (JSPUtil.getParameter(request, "yd_fcty_tp_cy_flg      		".trim(), length));
			String[] yd_fcty_tp_cfs_flg      =  (JSPUtil.getParameter(request, "yd_fcty_tp_cfs_flg     		".trim(), length));
			String[] yd_fcty_tp_rail_rmp_flg =  (JSPUtil.getParameter(request, "yd_fcty_tp_rail_rmp_flg		".trim(), length));
			String[] yd_oshp_cd              =  (JSPUtil.getParameter(request, "yd_oshp_cd             		".trim(), length));
			String[] bd_yd_flg               =  (JSPUtil.getParameter(request, "bd_yd_flg              		".trim(), length));
			String[] onf_hir_yd_flg          =  (JSPUtil.getParameter(request, "onf_hir_yd_flg         		".trim(), length));
			String[] yd_ft_hrs               =  (JSPUtil.getParameter(request, "yd_ft_hrs              		".trim(), length));
			String[] rep_zn_cd               =  (JSPUtil.getParameter(request, "rep_zn_cd              		".trim(), length));
			String[] yd_addr                 =  (JSPUtil.getParameter(request, "yd_addr                		".trim(), length));
			String[] zip_cd                  =  (JSPUtil.getParameter(request, "zip_cd                 		".trim(), length));
			String[] intl_phn_no             =  (JSPUtil.getParameter(request, "intl_phn_no            		".trim(), length));
			String[] phn_no                  =  (JSPUtil.getParameter(request, "phn_no                 		".trim(), length));
			String[] fax_no                  =  (JSPUtil.getParameter(request, "fax_no                 		".trim(), length));
			String[] yd_pic_nm               =  (JSPUtil.getParameter(request, "yd_pic_nm              		".trim(), length));
			String[] yd_ceo_nm               =  (JSPUtil.getParameter(request, "yd_ceo_nm              		".trim(), length));
			String[] gate_opn_hrmnt          =  (JSPUtil.getParameter(request, "gate_opn_hrmnt         		".trim(), length));
			String[] gate_clz_hrmnt          =  (JSPUtil.getParameter(request, "gate_clz_hrmnt         		".trim(), length));
			String[] hol_gate_opn_hrmnt      =  (JSPUtil.getParameter(request, "hol_gate_opn_hrmnt     		".trim(), length));
			String[] hol_gate_clz_hrmnt      =  (JSPUtil.getParameter(request, "hol_gate_clz_hrmnt     		".trim(), length));
			String[] sun_gate_opn_hrmnt      =  (JSPUtil.getParameter(request, "sun_gate_opn_hrmnt     		".trim(), length));
			String[] sun_gate_clz_hrmnt      =  (JSPUtil.getParameter(request, "sun_gate_clz_hrmnt     		".trim(), length));
			String[] sat_gate_opn_hrmnt      =  (JSPUtil.getParameter(request, "sat_gate_opn_hrmnt     		".trim(), length));
			String[] sat_gate_clz_hrmnt      =  (JSPUtil.getParameter(request, "sat_gate_clz_hrmnt     		".trim(), length));
			String[] yd_cgo_clz_hrmnt_msg    =  (JSPUtil.getParameter(request, "yd_cgo_clz_hrmnt_msg   		".trim(), length));
			String[] yd_rmk                  =  (JSPUtil.getParameter(request, "yd_rmk                 		".trim(), length));
			String[] brth_no                 =  (JSPUtil.getParameter(request, "brth_no                		".trim(), length));
			String[] yd_brth_len             =  (JSPUtil.getParameter(request, "yd_brth_len            		".trim(), length));
			String[] yd_brth_alng_sd_desc    =  (JSPUtil.getParameter(request, "yd_brth_alng_sd_desc   		".trim(), length));
			String[] yd_brth_dpth_chnl_knt   =  (JSPUtil.getParameter(request, "yd_brth_dpth_chnl_knt  		".trim(), length));
			String[] yd_ttl_spc              =  (JSPUtil.getParameter(request, "yd_ttl_spc             		".trim(), length));
			String[] yd_act_spc              =  (JSPUtil.getParameter(request, "yd_act_spc             		".trim(), length));
			String[] yd_hjs_spc              =  (JSPUtil.getParameter(request, "yd_hjs_spc             		".trim(), length));
			String[] yd_hndl_capa            =  (JSPUtil.getParameter(request, "yd_hndl_capa           		".trim(), length));
			String[] yd_rf_rcpt_440v_knt     =  (JSPUtil.getParameter(request, "yd_rf_rcpt_440v_knt    		".trim(), length));
			String[] yd_rf_rcpt_220v_knt     =  (JSPUtil.getParameter(request, "yd_rf_rcpt_220v_knt    		".trim(), length));
			String[] yd_rf_rcpt_dul_knt      =  (JSPUtil.getParameter(request, "yd_rf_rcpt_dul_knt     		".trim(), length));
			String[] yd_op_sys_cd            =  (JSPUtil.getParameter(request, "yd_op_sys_cd           		".trim(), length));
			String[] yd_inrl_flg             =  (JSPUtil.getParameter(request, "yd_inrl_flg            		".trim(), length));
			String[] yd_cfs_spc              =  (JSPUtil.getParameter(request, "yd_cfs_spc             		".trim(), length));
			String[] mnr_shop_flg            =  (JSPUtil.getParameter(request, "mnr_shop_flg           		".trim(), length));
			String[] yd_hndl_yr              =  (JSPUtil.getParameter(request, "yd_hndl_yr             		".trim(), length));
			String[] yd_ttl_vol_teu_knt      =  (JSPUtil.getParameter(request, "yd_ttl_vol_teu_knt     		".trim(), length));
			String[] yd_ttl_vol_bx_knt       =  (JSPUtil.getParameter(request, "yd_ttl_vol_bx_knt      		".trim(), length));
			String[] yd_hjs_vol_teu_knt      =  (JSPUtil.getParameter(request, "yd_hjs_vol_teu_knt     		".trim(), length));
			String[] yd_hjs_vol_bx_knt       =  (JSPUtil.getParameter(request, "yd_hjs_vol_bx_knt      		".trim(), length));
			String[] yd_pst_pgc_knt          =  (JSPUtil.getParameter(request, "yd_pst_pgc_knt         		".trim(), length));
			String[] yd_pgc_knt              =  (JSPUtil.getParameter(request, "yd_pgc_knt             		".trim(), length));
			String[] trstr_knt               =  (JSPUtil.getParameter(request, "trstr_knt              		".trim(), length));
			String[] frk_knt                 =  (JSPUtil.getParameter(request, "frk_knt                		".trim(), length));
			String[] yd_strdl_crr_knt        =  (JSPUtil.getParameter(request, "yd_strdl_crr_knt       		".trim(), length));
			String[] yd_trct_knt             =  (JSPUtil.getParameter(request, "yd_trct_knt            		".trim(), length));
			String[] yd_top_lft_knt          =  (JSPUtil.getParameter(request, "yd_top_lft_knt         		".trim(), length));
			String[] tml_chss_knt            =  (JSPUtil.getParameter(request, "tml_chss_knt           		".trim(), length));
			String[] eir_svc_flg             =  (JSPUtil.getParameter(request, "eir_svc_flg            		".trim(), length));
			String[] tml_prod_knt            =  (JSPUtil.getParameter(request, "tml_prod_knt           		".trim(), length));
			String[] yd_cstms_no             =  (JSPUtil.getParameter(request, "yd_cstms_no            		".trim(), length));
			String[] yd_fcty_tp_psdo_yd_flg  =  (JSPUtil.getParameter(request, "yd_fcty_tp_psdo_yd_flg 		".trim(), length));
			String[] yd_eml                  =  (JSPUtil.getParameter(request, "yd_eml                 		".trim(), length));
			String[] dem_ib_clt_flg          =  (JSPUtil.getParameter(request, "dem_ib_clt_flg         		".trim(), length));
			String[] dem_ob_clt_flg          =  (JSPUtil.getParameter(request, "dem_ob_clt_flg         		".trim(), length));
			String[] bkg_pod_yd_flg          =  (JSPUtil.getParameter(request, "bkg_pod_yd_flg         		".trim(), length));
			String[] n2nd_vndr_cnt_cd        =  (JSPUtil.getParameter(request, "n2nd_vndr_cnt_cd       		".trim(), length));
			String[] n2nd_vndr_seq           =  (JSPUtil.getParameter(request, "n2nd_vndr_seq          		".trim(), length));
			String[] n3rd_vndr_cnt_cd        =  (JSPUtil.getParameter(request, "n3rd_vndr_cnt_cd       		".trim(), length));
			String[] n3rd_vndr_seq           =  (JSPUtil.getParameter(request, "n3rd_vndr_seq          		".trim(), length));
			String[] dmdt_ofc_cd             =  (JSPUtil.getParameter(request, "dmdt_ofc_cd            		".trim(), length));
			String[] yd_fcty_tp_brg_rmp_flg  =  (JSPUtil.getParameter(request, "yd_fcty_tp_brg_rmp_flg 		".trim(), length));
			String[] bfr_ofc_cd              =  (JSPUtil.getParameter(request, "bfr_ofc_cd             		".trim(), length));
			String[] bfr_ofc_cng_dt          =  (JSPUtil.getParameter(request, "bfr_ofc_cng_dt         		".trim(), length));
			String[] modi_yd_cd              =  (JSPUtil.getParameter(request, "modi_yd_cd             		".trim(), length));
			String[] rep_yd_tp_cd            =  (JSPUtil.getParameter(request, "rep_yd_tp_cd           		".trim(), length));
			String[] cre_usr_id              =  (JSPUtil.getParameter(request, "cre_usr_id             		".trim(), length));
			String[] cre_dt                  =  (JSPUtil.getParameter(request, "cre_dt                 		".trim(), length));
			String[] upd_usr_id              =  (JSPUtil.getParameter(request, "upd_usr_id             		".trim(), length));
			String[] upd_dt                  =  (JSPUtil.getParameter(request, "upd_dt                 		".trim(), length));
			String[] delt_flg                =  (JSPUtil.getParameter(request, "delt_flg               		".trim(), length));
			String[] eai_evnt_dt             =  (JSPUtil.getParameter(request, "eai_evnt_dt            		".trim(), length));
			String[] hub_yd_flg              =  (JSPUtil.getParameter(request, "hub_yd_flg             		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new MdmYard();
				model.setIbflag                 		  (ibflag                 	[i]);
				model.setPage_rows              		  (page_rows              	[i]);
				model.setYd_cd                  		  (yd_cd                  	[i]);
				model.setYd_nm                  		  (yd_nm                  	[i]);
				model.setLoc_cd                 		  (loc_cd                 	[i]);
				model.setN1st_vndr_cnt_cd       		  (n1st_vndr_cnt_cd       	[i]);
				model.setN1st_vndr_seq          		  (n1st_vndr_seq          	[i]);
				model.setOfc_cd                 		  (ofc_cd                 	[i]);
				model.setAvg_dwll_hrs           		  (avg_dwll_hrs           	[i]);
				model.setMin_dwll_hrs           		  (min_dwll_hrs           	[i]);
				model.setYd_chr_cd              		  (yd_chr_cd              	[i]);
				model.setYd_fcty_tp_mrn_tml_flg 		  (yd_fcty_tp_mrn_tml_flg 	[i]);
				model.setYd_fcty_tp_cy_flg      		  (yd_fcty_tp_cy_flg      	[i]);
				model.setYd_fcty_tp_cfs_flg     		  (yd_fcty_tp_cfs_flg     	[i]);
				model.setYd_fcty_tp_rail_rmp_flg		  (yd_fcty_tp_rail_rmp_flg	[i]);
				model.setYd_oshp_cd             		  (yd_oshp_cd             	[i]);
				model.setBd_yd_flg              		  (bd_yd_flg              	[i]);
				model.setOnf_hir_yd_flg         		  (onf_hir_yd_flg         	[i]);
				model.setYd_ft_hrs              		  (yd_ft_hrs              	[i]);
				model.setRep_zn_cd              		  (rep_zn_cd              	[i]);
				model.setYd_addr                		  (yd_addr                	[i]);
				model.setZip_cd                 		  (zip_cd                 	[i]);
				model.setIntl_phn_no            		  (intl_phn_no            	[i]);
				model.setPhn_no                 		  (phn_no                 	[i]);
				model.setFax_no                 		  (fax_no                 	[i]);
				model.setYd_pic_nm              		  (yd_pic_nm              	[i]);
				model.setYd_ceo_nm              		  (yd_ceo_nm              	[i]);
				model.setGate_opn_hrmnt         		  (gate_opn_hrmnt         	[i]);
				model.setGate_clz_hrmnt         		  (gate_clz_hrmnt         	[i]);
				model.setHol_gate_opn_hrmnt     		  (hol_gate_opn_hrmnt     	[i]);
				model.setHol_gate_clz_hrmnt     		  (hol_gate_clz_hrmnt     	[i]);
				model.setSun_gate_opn_hrmnt     		  (sun_gate_opn_hrmnt     	[i]);
				model.setSun_gate_clz_hrmnt     		  (sun_gate_clz_hrmnt     	[i]);
				model.setSat_gate_opn_hrmnt     		  (sat_gate_opn_hrmnt     	[i]);
				model.setSat_gate_clz_hrmnt     		  (sat_gate_clz_hrmnt     	[i]);
				model.setYd_cgo_clz_hrmnt_msg   		  (yd_cgo_clz_hrmnt_msg   	[i]);
				model.setYd_rmk                 		  (yd_rmk                 	[i]);
				model.setBrth_no                		  (brth_no                	[i]);
				model.setYd_brth_len            		  (yd_brth_len            	[i]);
				model.setYd_brth_alng_sd_desc   		  (yd_brth_alng_sd_desc   	[i]);
				model.setYd_brth_dpth_chnl_knt  		  (yd_brth_dpth_chnl_knt  	[i]);
				model.setYd_ttl_spc             		  (yd_ttl_spc             	[i]);
				model.setYd_act_spc             		  (yd_act_spc             	[i]);
				model.setYd_hjs_spc             		  (yd_hjs_spc             	[i]);
				model.setYd_hndl_capa           		  (yd_hndl_capa           	[i]);
				model.setYd_rf_rcpt_440v_knt    		  (yd_rf_rcpt_440v_knt    	[i]);
				model.setYd_rf_rcpt_220v_knt    		  (yd_rf_rcpt_220v_knt    	[i]);
				model.setYd_rf_rcpt_dul_knt     		  (yd_rf_rcpt_dul_knt     	[i]);
				model.setYd_op_sys_cd           		  (yd_op_sys_cd           	[i]);
				model.setYd_inrl_flg            		  (yd_inrl_flg            	[i]);
				model.setYd_cfs_spc             		  (yd_cfs_spc             	[i]);
				model.setMnr_shop_flg           		  (mnr_shop_flg           	[i]);
				model.setYd_hndl_yr             		  (yd_hndl_yr             	[i]);
				model.setYd_ttl_vol_teu_knt     		  (yd_ttl_vol_teu_knt     	[i]);
				model.setYd_ttl_vol_bx_knt      		  (yd_ttl_vol_bx_knt      	[i]);
				model.setYd_hjs_vol_teu_knt     		  (yd_hjs_vol_teu_knt     	[i]);
				model.setYd_hjs_vol_bx_knt      		  (yd_hjs_vol_bx_knt      	[i]);
				model.setYd_pst_pgc_knt         		  (yd_pst_pgc_knt         	[i]);
				model.setYd_pgc_knt             		  (yd_pgc_knt             	[i]);
				model.setTrstr_knt              		  (trstr_knt              	[i]);
				model.setFrk_knt                		  (frk_knt                	[i]);
				model.setYd_strdl_crr_knt       		  (yd_strdl_crr_knt       	[i]);
				model.setYd_trct_knt            		  (yd_trct_knt            	[i]);
				model.setYd_top_lft_knt         		  (yd_top_lft_knt         	[i]);
				model.setTml_chss_knt           		  (tml_chss_knt           	[i]);
				model.setEir_svc_flg            		  (eir_svc_flg            	[i]);
				model.setTml_prod_knt           		  (tml_prod_knt           	[i]);
				model.setYd_cstms_no            		  (yd_cstms_no            	[i]);
				model.setYd_fcty_tp_psdo_yd_flg 		  (yd_fcty_tp_psdo_yd_flg 	[i]);
				model.setYd_eml                 		  (yd_eml                 	[i]);
				model.setDem_ib_clt_flg         		  (dem_ib_clt_flg         	[i]);
				model.setDem_ob_clt_flg         		  (dem_ob_clt_flg         	[i]);
				model.setBkg_pod_yd_flg         		  (bkg_pod_yd_flg         	[i]);
				model.setN2nd_vndr_cnt_cd       		  (n2nd_vndr_cnt_cd       	[i]);
				model.setN2nd_vndr_seq          		  (n2nd_vndr_seq          	[i]);
				model.setN3rd_vndr_cnt_cd       		  (n3rd_vndr_cnt_cd       	[i]);
				model.setN3rd_vndr_seq          		  (n3rd_vndr_seq          	[i]);
				model.setDmdt_ofc_cd            		  (dmdt_ofc_cd            	[i]);
				model.setYd_fcty_tp_brg_rmp_flg 		  (yd_fcty_tp_brg_rmp_flg 	[i]);
				model.setBfr_ofc_cd             		  (bfr_ofc_cd             	[i]);
				model.setBfr_ofc_cng_dt         		  (bfr_ofc_cng_dt         	[i]);
				model.setModi_yd_cd             		  (modi_yd_cd             	[i]);
				model.setRep_yd_tp_cd           		  (rep_yd_tp_cd           	[i]);
				model.setCre_usr_id             		  (cre_usr_id             	[i]);
				model.setCre_dt                 		  (cre_dt                 	[i]);
				model.setUpd_usr_id             		  (upd_usr_id             	[i]);
				model.setUpd_dt                 		  (upd_dt                 	[i]);
				model.setDelt_flg               		  (delt_flg               	[i]);
				model.setEai_evnt_dt            		  (eai_evnt_dt            	[i]);
				model.setHub_yd_flg             		  (hub_yd_flg             	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		MdmYard model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag                  =  (JSPUtil.getParameter(request, prefix + "ibflag                 		".trim(), length));
			String[] page_rows               =  (JSPUtil.getParameter(request, prefix + "page_rows              		".trim(), length));
			String[] yd_cd                   =  (JSPUtil.getParameter(request, prefix + "yd_cd                  		".trim(), length));
			String[] yd_nm                   =  (JSPUtil.getParameter(request, prefix + "yd_nm                  		".trim(), length));
			String[] loc_cd                  =  (JSPUtil.getParameter(request, prefix + "loc_cd                 		".trim(), length));
			String[] n1st_vndr_cnt_cd        =  (JSPUtil.getParameter(request, prefix + "n1st_vndr_cnt_cd       		".trim(), length));
			String[] n1st_vndr_seq           =  (JSPUtil.getParameter(request, prefix + "n1st_vndr_seq          		".trim(), length));
			String[] ofc_cd                  =  (JSPUtil.getParameter(request, prefix + "ofc_cd                 		".trim(), length));
			String[] avg_dwll_hrs            =  (JSPUtil.getParameter(request, prefix + "avg_dwll_hrs           		".trim(), length));
			String[] min_dwll_hrs            =  (JSPUtil.getParameter(request, prefix + "min_dwll_hrs           		".trim(), length));
			String[] yd_chr_cd               =  (JSPUtil.getParameter(request, prefix + "yd_chr_cd              		".trim(), length));
			String[] yd_fcty_tp_mrn_tml_flg  =  (JSPUtil.getParameter(request, prefix + "yd_fcty_tp_mrn_tml_flg 		".trim(), length));
			String[] yd_fcty_tp_cy_flg       =  (JSPUtil.getParameter(request, prefix + "yd_fcty_tp_cy_flg      		".trim(), length));
			String[] yd_fcty_tp_cfs_flg      =  (JSPUtil.getParameter(request, prefix + "yd_fcty_tp_cfs_flg     		".trim(), length));
			String[] yd_fcty_tp_rail_rmp_flg =  (JSPUtil.getParameter(request, prefix + "yd_fcty_tp_rail_rmp_flg		".trim(), length));
			String[] yd_oshp_cd              =  (JSPUtil.getParameter(request, prefix + "yd_oshp_cd             		".trim(), length));
			String[] bd_yd_flg               =  (JSPUtil.getParameter(request, prefix + "bd_yd_flg              		".trim(), length));
			String[] onf_hir_yd_flg          =  (JSPUtil.getParameter(request, prefix + "onf_hir_yd_flg         		".trim(), length));
			String[] yd_ft_hrs               =  (JSPUtil.getParameter(request, prefix + "yd_ft_hrs              		".trim(), length));
			String[] rep_zn_cd               =  (JSPUtil.getParameter(request, prefix + "rep_zn_cd              		".trim(), length));
			String[] yd_addr                 =  (JSPUtil.getParameter(request, prefix + "yd_addr                		".trim(), length));
			String[] zip_cd                  =  (JSPUtil.getParameter(request, prefix + "zip_cd                 		".trim(), length));
			String[] intl_phn_no             =  (JSPUtil.getParameter(request, prefix + "intl_phn_no            		".trim(), length));
			String[] phn_no                  =  (JSPUtil.getParameter(request, prefix + "phn_no                 		".trim(), length));
			String[] fax_no                  =  (JSPUtil.getParameter(request, prefix + "fax_no                 		".trim(), length));
			String[] yd_pic_nm               =  (JSPUtil.getParameter(request, prefix + "yd_pic_nm              		".trim(), length));
			String[] yd_ceo_nm               =  (JSPUtil.getParameter(request, prefix + "yd_ceo_nm              		".trim(), length));
			String[] gate_opn_hrmnt          =  (JSPUtil.getParameter(request, prefix + "gate_opn_hrmnt         		".trim(), length));
			String[] gate_clz_hrmnt          =  (JSPUtil.getParameter(request, prefix + "gate_clz_hrmnt         		".trim(), length));
			String[] hol_gate_opn_hrmnt      =  (JSPUtil.getParameter(request, prefix + "hol_gate_opn_hrmnt     		".trim(), length));
			String[] hol_gate_clz_hrmnt      =  (JSPUtil.getParameter(request, prefix + "hol_gate_clz_hrmnt     		".trim(), length));
			String[] sun_gate_opn_hrmnt      =  (JSPUtil.getParameter(request, prefix + "sun_gate_opn_hrmnt     		".trim(), length));
			String[] sun_gate_clz_hrmnt      =  (JSPUtil.getParameter(request, prefix + "sun_gate_clz_hrmnt     		".trim(), length));
			String[] sat_gate_opn_hrmnt      =  (JSPUtil.getParameter(request, prefix + "sat_gate_opn_hrmnt     		".trim(), length));
			String[] sat_gate_clz_hrmnt      =  (JSPUtil.getParameter(request, prefix + "sat_gate_clz_hrmnt     		".trim(), length));
			String[] yd_cgo_clz_hrmnt_msg    =  (JSPUtil.getParameter(request, prefix + "yd_cgo_clz_hrmnt_msg   		".trim(), length));
			String[] yd_rmk                  =  (JSPUtil.getParameter(request, prefix + "yd_rmk                 		".trim(), length));
			String[] brth_no                 =  (JSPUtil.getParameter(request, prefix + "brth_no                		".trim(), length));
			String[] yd_brth_len             =  (JSPUtil.getParameter(request, prefix + "yd_brth_len            		".trim(), length));
			String[] yd_brth_alng_sd_desc    =  (JSPUtil.getParameter(request, prefix + "yd_brth_alng_sd_desc   		".trim(), length));
			String[] yd_brth_dpth_chnl_knt   =  (JSPUtil.getParameter(request, prefix + "yd_brth_dpth_chnl_knt  		".trim(), length));
			String[] yd_ttl_spc              =  (JSPUtil.getParameter(request, prefix + "yd_ttl_spc             		".trim(), length));
			String[] yd_act_spc              =  (JSPUtil.getParameter(request, prefix + "yd_act_spc             		".trim(), length));
			String[] yd_hjs_spc              =  (JSPUtil.getParameter(request, prefix + "yd_hjs_spc             		".trim(), length));
			String[] yd_hndl_capa            =  (JSPUtil.getParameter(request, prefix + "yd_hndl_capa           		".trim(), length));
			String[] yd_rf_rcpt_440v_knt     =  (JSPUtil.getParameter(request, prefix + "yd_rf_rcpt_440v_knt    		".trim(), length));
			String[] yd_rf_rcpt_220v_knt     =  (JSPUtil.getParameter(request, prefix + "yd_rf_rcpt_220v_knt    		".trim(), length));
			String[] yd_rf_rcpt_dul_knt      =  (JSPUtil.getParameter(request, prefix + "yd_rf_rcpt_dul_knt     		".trim(), length));
			String[] yd_op_sys_cd            =  (JSPUtil.getParameter(request, prefix + "yd_op_sys_cd           		".trim(), length));
			String[] yd_inrl_flg             =  (JSPUtil.getParameter(request, prefix + "yd_inrl_flg            		".trim(), length));
			String[] yd_cfs_spc              =  (JSPUtil.getParameter(request, prefix + "yd_cfs_spc             		".trim(), length));
			String[] mnr_shop_flg            =  (JSPUtil.getParameter(request, prefix + "mnr_shop_flg           		".trim(), length));
			String[] yd_hndl_yr              =  (JSPUtil.getParameter(request, prefix + "yd_hndl_yr             		".trim(), length));
			String[] yd_ttl_vol_teu_knt      =  (JSPUtil.getParameter(request, prefix + "yd_ttl_vol_teu_knt     		".trim(), length));
			String[] yd_ttl_vol_bx_knt       =  (JSPUtil.getParameter(request, prefix + "yd_ttl_vol_bx_knt      		".trim(), length));
			String[] yd_hjs_vol_teu_knt      =  (JSPUtil.getParameter(request, prefix + "yd_hjs_vol_teu_knt     		".trim(), length));
			String[] yd_hjs_vol_bx_knt       =  (JSPUtil.getParameter(request, prefix + "yd_hjs_vol_bx_knt      		".trim(), length));
			String[] yd_pst_pgc_knt          =  (JSPUtil.getParameter(request, prefix + "yd_pst_pgc_knt         		".trim(), length));
			String[] yd_pgc_knt              =  (JSPUtil.getParameter(request, prefix + "yd_pgc_knt             		".trim(), length));
			String[] trstr_knt               =  (JSPUtil.getParameter(request, prefix + "trstr_knt              		".trim(), length));
			String[] frk_knt                 =  (JSPUtil.getParameter(request, prefix + "frk_knt                		".trim(), length));
			String[] yd_strdl_crr_knt        =  (JSPUtil.getParameter(request, prefix + "yd_strdl_crr_knt       		".trim(), length));
			String[] yd_trct_knt             =  (JSPUtil.getParameter(request, prefix + "yd_trct_knt            		".trim(), length));
			String[] yd_top_lft_knt          =  (JSPUtil.getParameter(request, prefix + "yd_top_lft_knt         		".trim(), length));
			String[] tml_chss_knt            =  (JSPUtil.getParameter(request, prefix + "tml_chss_knt           		".trim(), length));
			String[] eir_svc_flg             =  (JSPUtil.getParameter(request, prefix + "eir_svc_flg            		".trim(), length));
			String[] tml_prod_knt            =  (JSPUtil.getParameter(request, prefix + "tml_prod_knt           		".trim(), length));
			String[] yd_cstms_no             =  (JSPUtil.getParameter(request, prefix + "yd_cstms_no            		".trim(), length));
			String[] yd_fcty_tp_psdo_yd_flg  =  (JSPUtil.getParameter(request, prefix + "yd_fcty_tp_psdo_yd_flg 		".trim(), length));
			String[] yd_eml                  =  (JSPUtil.getParameter(request, prefix + "yd_eml                 		".trim(), length));
			String[] dem_ib_clt_flg          =  (JSPUtil.getParameter(request, prefix + "dem_ib_clt_flg         		".trim(), length));
			String[] dem_ob_clt_flg          =  (JSPUtil.getParameter(request, prefix + "dem_ob_clt_flg         		".trim(), length));
			String[] bkg_pod_yd_flg          =  (JSPUtil.getParameter(request, prefix + "bkg_pod_yd_flg         		".trim(), length));
			String[] n2nd_vndr_cnt_cd        =  (JSPUtil.getParameter(request, prefix + "n2nd_vndr_cnt_cd       		".trim(), length));
			String[] n2nd_vndr_seq           =  (JSPUtil.getParameter(request, prefix + "n2nd_vndr_seq          		".trim(), length));
			String[] n3rd_vndr_cnt_cd        =  (JSPUtil.getParameter(request, prefix + "n3rd_vndr_cnt_cd       		".trim(), length));
			String[] n3rd_vndr_seq           =  (JSPUtil.getParameter(request, prefix + "n3rd_vndr_seq          		".trim(), length));
			String[] dmdt_ofc_cd             =  (JSPUtil.getParameter(request, prefix + "dmdt_ofc_cd            		".trim(), length));
			String[] yd_fcty_tp_brg_rmp_flg  =  (JSPUtil.getParameter(request, prefix + "yd_fcty_tp_brg_rmp_flg 		".trim(), length));
			String[] bfr_ofc_cd              =  (JSPUtil.getParameter(request, prefix + "bfr_ofc_cd             		".trim(), length));
			String[] bfr_ofc_cng_dt          =  (JSPUtil.getParameter(request, prefix + "bfr_ofc_cng_dt         		".trim(), length));
			String[] modi_yd_cd              =  (JSPUtil.getParameter(request, prefix + "modi_yd_cd             		".trim(), length));
			String[] rep_yd_tp_cd            =  (JSPUtil.getParameter(request, prefix + "rep_yd_tp_cd           		".trim(), length));
			String[] cre_usr_id              =  (JSPUtil.getParameter(request, prefix + "cre_usr_id             		".trim(), length));
			String[] cre_dt                  =  (JSPUtil.getParameter(request, prefix + "cre_dt                 		".trim(), length));
			String[] upd_usr_id              =  (JSPUtil.getParameter(request, prefix + "upd_usr_id             		".trim(), length));
			String[] upd_dt                  =  (JSPUtil.getParameter(request, prefix + "upd_dt                 		".trim(), length));
			String[] delt_flg                =  (JSPUtil.getParameter(request, prefix + "delt_flg               		".trim(), length));
			String[] eai_evnt_dt             =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt            		".trim(), length));
			String[] hub_yd_flg              =  (JSPUtil.getParameter(request, prefix + "hub_yd_flg             		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new MdmYard();
				model.setIbflag                 		  ( ibflag                 	[i]);
				model.setPage_rows              		  ( page_rows              	[i]);
				model.setYd_cd                  		  ( yd_cd                  	[i]);
				model.setYd_nm                  		  ( yd_nm                  	[i]);
				model.setLoc_cd                 		  ( loc_cd                 	[i]);
				model.setN1st_vndr_cnt_cd       		  ( n1st_vndr_cnt_cd       	[i]);
				model.setN1st_vndr_seq          		  ( n1st_vndr_seq          	[i]);
				model.setOfc_cd                 		  ( ofc_cd                 	[i]);
				model.setAvg_dwll_hrs           		  ( avg_dwll_hrs           	[i]);
				model.setMin_dwll_hrs           		  ( min_dwll_hrs           	[i]);
				model.setYd_chr_cd              		  ( yd_chr_cd              	[i]);
				model.setYd_fcty_tp_mrn_tml_flg 		  ( yd_fcty_tp_mrn_tml_flg 	[i]);
				model.setYd_fcty_tp_cy_flg      		  ( yd_fcty_tp_cy_flg      	[i]);
				model.setYd_fcty_tp_cfs_flg     		  ( yd_fcty_tp_cfs_flg     	[i]);
				model.setYd_fcty_tp_rail_rmp_flg		  ( yd_fcty_tp_rail_rmp_flg	[i]);
				model.setYd_oshp_cd             		  ( yd_oshp_cd             	[i]);
				model.setBd_yd_flg              		  ( bd_yd_flg              	[i]);
				model.setOnf_hir_yd_flg         		  ( onf_hir_yd_flg         	[i]);
				model.setYd_ft_hrs              		  ( yd_ft_hrs              	[i]);
				model.setRep_zn_cd              		  ( rep_zn_cd              	[i]);
				model.setYd_addr                		  ( yd_addr                	[i]);
				model.setZip_cd                 		  ( zip_cd                 	[i]);
				model.setIntl_phn_no            		  ( intl_phn_no            	[i]);
				model.setPhn_no                 		  ( phn_no                 	[i]);
				model.setFax_no                 		  ( fax_no                 	[i]);
				model.setYd_pic_nm              		  ( yd_pic_nm              	[i]);
				model.setYd_ceo_nm              		  ( yd_ceo_nm              	[i]);
				model.setGate_opn_hrmnt         		  ( gate_opn_hrmnt         	[i]);
				model.setGate_clz_hrmnt         		  ( gate_clz_hrmnt         	[i]);
				model.setHol_gate_opn_hrmnt     		  ( hol_gate_opn_hrmnt     	[i]);
				model.setHol_gate_clz_hrmnt     		  ( hol_gate_clz_hrmnt     	[i]);
				model.setSun_gate_opn_hrmnt     		  ( sun_gate_opn_hrmnt     	[i]);
				model.setSun_gate_clz_hrmnt     		  ( sun_gate_clz_hrmnt     	[i]);
				model.setSat_gate_opn_hrmnt     		  ( sat_gate_opn_hrmnt     	[i]);
				model.setSat_gate_clz_hrmnt     		  ( sat_gate_clz_hrmnt     	[i]);
				model.setYd_cgo_clz_hrmnt_msg   		  ( yd_cgo_clz_hrmnt_msg   	[i]);
				model.setYd_rmk                 		  ( yd_rmk                 	[i]);
				model.setBrth_no                		  ( brth_no                	[i]);
				model.setYd_brth_len            		  ( yd_brth_len            	[i]);
				model.setYd_brth_alng_sd_desc   		  ( yd_brth_alng_sd_desc   	[i]);
				model.setYd_brth_dpth_chnl_knt  		  ( yd_brth_dpth_chnl_knt  	[i]);
				model.setYd_ttl_spc             		  ( yd_ttl_spc             	[i]);
				model.setYd_act_spc             		  ( yd_act_spc             	[i]);
				model.setYd_hjs_spc             		  ( yd_hjs_spc             	[i]);
				model.setYd_hndl_capa           		  ( yd_hndl_capa           	[i]);
				model.setYd_rf_rcpt_440v_knt    		  ( yd_rf_rcpt_440v_knt    	[i]);
				model.setYd_rf_rcpt_220v_knt    		  ( yd_rf_rcpt_220v_knt    	[i]);
				model.setYd_rf_rcpt_dul_knt     		  ( yd_rf_rcpt_dul_knt     	[i]);
				model.setYd_op_sys_cd           		  ( yd_op_sys_cd           	[i]);
				model.setYd_inrl_flg            		  ( yd_inrl_flg            	[i]);
				model.setYd_cfs_spc             		  ( yd_cfs_spc             	[i]);
				model.setMnr_shop_flg           		  ( mnr_shop_flg           	[i]);
				model.setYd_hndl_yr             		  ( yd_hndl_yr             	[i]);
				model.setYd_ttl_vol_teu_knt     		  ( yd_ttl_vol_teu_knt     	[i]);
				model.setYd_ttl_vol_bx_knt      		  ( yd_ttl_vol_bx_knt      	[i]);
				model.setYd_hjs_vol_teu_knt     		  ( yd_hjs_vol_teu_knt     	[i]);
				model.setYd_hjs_vol_bx_knt      		  ( yd_hjs_vol_bx_knt      	[i]);
				model.setYd_pst_pgc_knt         		  ( yd_pst_pgc_knt         	[i]);
				model.setYd_pgc_knt             		  ( yd_pgc_knt             	[i]);
				model.setTrstr_knt              		  ( trstr_knt              	[i]);
				model.setFrk_knt                		  ( frk_knt                	[i]);
				model.setYd_strdl_crr_knt       		  ( yd_strdl_crr_knt       	[i]);
				model.setYd_trct_knt            		  ( yd_trct_knt            	[i]);
				model.setYd_top_lft_knt         		  ( yd_top_lft_knt         	[i]);
				model.setTml_chss_knt           		  ( tml_chss_knt           	[i]);
				model.setEir_svc_flg            		  ( eir_svc_flg            	[i]);
				model.setTml_prod_knt           		  ( tml_prod_knt           	[i]);
				model.setYd_cstms_no            		  ( yd_cstms_no            	[i]);
				model.setYd_fcty_tp_psdo_yd_flg 		  ( yd_fcty_tp_psdo_yd_flg 	[i]);
				model.setYd_eml                 		  ( yd_eml                 	[i]);
				model.setDem_ib_clt_flg         		  ( dem_ib_clt_flg         	[i]);
				model.setDem_ob_clt_flg         		  ( dem_ob_clt_flg         	[i]);
				model.setBkg_pod_yd_flg         		  ( bkg_pod_yd_flg         	[i]);
				model.setN2nd_vndr_cnt_cd       		  ( n2nd_vndr_cnt_cd       	[i]);
				model.setN2nd_vndr_seq          		  ( n2nd_vndr_seq          	[i]);
				model.setN3rd_vndr_cnt_cd       		  ( n3rd_vndr_cnt_cd       	[i]);
				model.setN3rd_vndr_seq          		  ( n3rd_vndr_seq          	[i]);
				model.setDmdt_ofc_cd            		  ( dmdt_ofc_cd            	[i]);
				model.setYd_fcty_tp_brg_rmp_flg 		  ( yd_fcty_tp_brg_rmp_flg 	[i]);
				model.setBfr_ofc_cd             		  ( bfr_ofc_cd             	[i]);
				model.setBfr_ofc_cng_dt         		  ( bfr_ofc_cng_dt         	[i]);
				model.setModi_yd_cd             		  ( modi_yd_cd             	[i]);
				model.setRep_yd_tp_cd           		  ( rep_yd_tp_cd           	[i]);
				model.setCre_usr_id             		  ( cre_usr_id             	[i]);
				model.setCre_dt                 		  ( cre_dt                 	[i]);
				model.setUpd_usr_id             		  ( upd_usr_id             	[i]);
				model.setUpd_dt                 		  ( upd_dt                 	[i]);
				model.setDelt_flg               		  ( delt_flg               	[i]);
				model.setEai_evnt_dt            		  ( eai_evnt_dt            	[i]);
				model.setHub_yd_flg             		  ( hub_yd_flg             	[i]);
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
