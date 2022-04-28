/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : PRD_PROD_CTL_MST.java
*@FileTitle : Product Catalog 생성결과 조회 화면
*Open Issues :
*Change history :
*@LastModifyDate : 2006-11-21
*@LastModifier : jungsunyoung
*@LastVersion : 1.0
* 2006-11-21 jungsunyoung
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
 * @author jungsunyoung
 * @since J2EE 1.4
 */
public final class PRD_PROD_CTL_MST implements java.io.Serializable {

	private String           ibflag           = "";
	private String           page_rows        = "";
	private String           pctl_no          = "";
	private String           bkg_no           = "";
	private String           bkg_no_split     = "";
	private String           mty_pkup_yd_cd   = "";
	private String           por_cd           = "";
	private String           por_nod_cd       = "";
	private String           pol_cd           = "";
	private String           n1st_ts_port_cd  = "";
	private String           n2nd_ts_port_cd  = "";
	private String           n3rd_ts_port_cd  = "";
	private String           pod_cd           = "";
	private String           del_cd           = "";
	private String           del_nod_cd       = "";
	private String           mty_rtn_yd_cd    = "";
	private String           ttl_tztm_hrs     = "";
	private String           prod_rev         = "";
	private String           ttl_expn_amt     = "";
	private String           cm_amt           = "";
	private String           trnk_aval_spc    = "";
	private String           bkg_sel_flg      = "";
	private String           cop_cre_flg      = "";
	private String           ob_itchg_ctnt    = "";
	private String           ib_itchg_ctnt    = "";
	private String           trnk_vsl_cd      = "";
	private String           trnk_skd_voy_no  = "";
	private String           trnk_skd_dir_cd  = "";
	private String           bkg_cgo_tp_cd    = "";
	private String           bkg_rcv_term_cd  = "";
	private String           bkg_de_term_cd   = "";
	private String           rep_cmdt_cd      = "";
	private String           cmdt_cd          = "";
	private String           shpr_cnt_cd      = "";
	private String           shpr_seq         = "";
	private String           cnee_cnt_cd      = "";
	private String           cnee_seq         = "";
	private String           sc_no            = "";
	private String           rfa_no           = "";
	private String           dg_clss_cd       = "";
	private String           dg_spcl_flg      = "";
	private String           rf_spcl_flg      = "";
	private String           spcl_awk_cgo_flg = "";
	private String           bb_spcl_flg      = "";
	private String           rd_spcl_flg      = "";
	private String           hngr_spcl_flg    = "";
	private String           soc_flg          = "";
	private String           eq_subst_flg     = "";
	private String           bkg_wgt          = "";
	private String           bkg_wgt_ut_cd    = "";
	private String           sls_ofc_cd       = "";
	private String           sls_rhq_cd       = "";
	private String           sls_ho_cd        = "";
	private String           bkg_ofc_cd       = "";
	private String           cre_ofc_cd       = "";
	private String           cre_usr_id       = "";
	private String           cre_dt           = "";
	private String           upd_usr_id       = "";
	private String           upd_dt           = "";

	public PRD_PROD_CTL_MST(){}

	public PRD_PROD_CTL_MST(
			String           ibflag          ,
			String           page_rows       ,
			String           pctl_no         ,
			String           bkg_no          ,
			String           bkg_no_split    ,
			String           mty_pkup_yd_cd  ,
			String           por_cd          ,
			String           por_nod_cd      ,
			String           pol_cd          ,
			String           n1st_ts_port_cd ,
			String           n2nd_ts_port_cd ,
			String           n3rd_ts_port_cd ,
			String           pod_cd          ,
			String           del_cd          ,
			String           del_nod_cd      ,
			String           mty_rtn_yd_cd   ,
			String           ttl_tztm_hrs    ,
			String           prod_rev        ,
			String           ttl_expn_amt    ,
			String           cm_amt          ,
			String           trnk_aval_spc   ,
			String           bkg_sel_flg     ,
			String           cop_cre_flg     ,
			String           ob_itchg_ctnt   ,
			String           ib_itchg_ctnt   ,
			String           trnk_vsl_cd     ,
			String           trnk_skd_voy_no ,
			String           trnk_skd_dir_cd ,
			String           bkg_cgo_tp_cd   ,
			String           bkg_rcv_term_cd ,
			String           bkg_de_term_cd  ,
			String           rep_cmdt_cd     ,
			String           cmdt_cd         ,
			String           shpr_cnt_cd     ,
			String           shpr_seq        ,
			String           cnee_cnt_cd     ,
			String           cnee_seq        ,
			String           sc_no           ,
			String           rfa_no          ,
			String           dg_clss_cd      ,
			String           dg_spcl_flg     ,
			String           rf_spcl_flg     ,
			String           spcl_awk_cgo_flg,
			String           bb_spcl_flg     ,
			String           rd_spcl_flg     ,
			String           hngr_spcl_flg   ,
			String           soc_flg         ,
			String           eq_subst_flg    ,
			String           bkg_wgt         ,
			String           bkg_wgt_ut_cd   ,
			String           sls_ofc_cd      ,
			String           sls_rhq_cd      ,
			String           sls_ho_cd       ,
			String           bkg_ofc_cd      ,
			String           cre_ofc_cd      ,
			String           cre_usr_id      ,
			String           cre_dt          ,
			String           upd_usr_id      ,
			String           upd_dt          ){
		this.ibflag           = ibflag          ;
		this.page_rows        = page_rows       ;
		this.pctl_no          = pctl_no         ;
		this.bkg_no           = bkg_no          ;
		this.bkg_no_split     = bkg_no_split    ;
		this.mty_pkup_yd_cd   = mty_pkup_yd_cd  ;
		this.por_cd           = por_cd          ;
		this.por_nod_cd       = por_nod_cd      ;
		this.pol_cd           = pol_cd          ;
		this.n1st_ts_port_cd  = n1st_ts_port_cd ;
		this.n2nd_ts_port_cd  = n2nd_ts_port_cd ;
		this.n3rd_ts_port_cd  = n3rd_ts_port_cd ;
		this.pod_cd           = pod_cd          ;
		this.del_cd           = del_cd          ;
		this.del_nod_cd       = del_nod_cd      ;
		this.mty_rtn_yd_cd    = mty_rtn_yd_cd   ;
		this.ttl_tztm_hrs     = ttl_tztm_hrs    ;
		this.prod_rev         = prod_rev        ;
		this.ttl_expn_amt     = ttl_expn_amt    ;
		this.cm_amt           = cm_amt          ;
		this.trnk_aval_spc    = trnk_aval_spc   ;
		this.bkg_sel_flg      = bkg_sel_flg     ;
		this.cop_cre_flg      = cop_cre_flg     ;
		this.ob_itchg_ctnt    = ob_itchg_ctnt   ;
		this.ib_itchg_ctnt    = ib_itchg_ctnt   ;
		this.trnk_vsl_cd      = trnk_vsl_cd     ;
		this.trnk_skd_voy_no  = trnk_skd_voy_no ;
		this.trnk_skd_dir_cd  = trnk_skd_dir_cd ;
		this.bkg_cgo_tp_cd    = bkg_cgo_tp_cd   ;
		this.bkg_rcv_term_cd  = bkg_rcv_term_cd ;
		this.bkg_de_term_cd   = bkg_de_term_cd  ;
		this.rep_cmdt_cd      = rep_cmdt_cd     ;
		this.cmdt_cd          = cmdt_cd         ;
		this.shpr_cnt_cd      = shpr_cnt_cd     ;
		this.shpr_seq         = shpr_seq        ;
		this.cnee_cnt_cd      = cnee_cnt_cd     ;
		this.cnee_seq         = cnee_seq        ;
		this.sc_no            = sc_no           ;
		this.rfa_no           = rfa_no          ;
		this.dg_clss_cd       = dg_clss_cd      ;
		this.dg_spcl_flg      = dg_spcl_flg     ;
		this.rf_spcl_flg      = rf_spcl_flg     ;
		this.spcl_awk_cgo_flg = spcl_awk_cgo_flg;
		this.bb_spcl_flg      = bb_spcl_flg     ;
		this.rd_spcl_flg      = rd_spcl_flg     ;
		this.hngr_spcl_flg    = hngr_spcl_flg   ;
		this.soc_flg          = soc_flg         ;
		this.eq_subst_flg     = eq_subst_flg    ;
		this.bkg_wgt          = bkg_wgt         ;
		this.bkg_wgt_ut_cd    = bkg_wgt_ut_cd   ;
		this.sls_ofc_cd       = sls_ofc_cd      ;
		this.sls_rhq_cd       = sls_rhq_cd      ;
		this.sls_ho_cd        = sls_ho_cd       ;
		this.bkg_ofc_cd       = bkg_ofc_cd      ;
		this.cre_ofc_cd       = cre_ofc_cd      ;
		this.cre_usr_id       = cre_usr_id      ;
		this.cre_dt           = cre_dt          ;
		this.upd_usr_id       = upd_usr_id      ;
		this.upd_dt           = upd_dt          ;
	}

	// getter method is proceeding ..
	public String           getIbflag          (){	return ibflag          	;	}
	public String           getPage_rows       (){	return page_rows       	;	}
	public String           getPctl_no         (){	return pctl_no         	;	}
	public String           getBkg_no          (){	return bkg_no          	;	}
	public String           getBkg_no_split    (){	return bkg_no_split    	;	}
	public String           getMty_pkup_yd_cd  (){	return mty_pkup_yd_cd  	;	}
	public String           getPor_cd          (){	return por_cd          	;	}
	public String           getPor_nod_cd      (){	return por_nod_cd      	;	}
	public String           getPol_cd          (){	return pol_cd          	;	}
	public String           getN1st_ts_port_cd (){	return n1st_ts_port_cd 	;	}
	public String           getN2nd_ts_port_cd (){	return n2nd_ts_port_cd 	;	}
	public String           getN3rd_ts_port_cd (){	return n3rd_ts_port_cd 	;	}
	public String           getPod_cd          (){	return pod_cd          	;	}
	public String           getDel_cd          (){	return del_cd          	;	}
	public String           getDel_nod_cd      (){	return del_nod_cd      	;	}
	public String           getMty_rtn_yd_cd   (){	return mty_rtn_yd_cd   	;	}
	public String           getTtl_tztm_hrs    (){	return ttl_tztm_hrs    	;	}
	public String           getProd_rev        (){	return prod_rev        	;	}
	public String           getTtl_expn_amt    (){	return ttl_expn_amt    	;	}
	public String           getCm_amt          (){	return cm_amt          	;	}
	public String           getTrnk_aval_spc   (){	return trnk_aval_spc   	;	}
	public String           getBkg_sel_flg     (){	return bkg_sel_flg     	;	}
	public String           getCop_cre_flg     (){	return cop_cre_flg     	;	}
	public String           getOb_itchg_ctnt   (){	return ob_itchg_ctnt   	;	}
	public String           getIb_itchg_ctnt   (){	return ib_itchg_ctnt   	;	}
	public String           getTrnk_vsl_cd     (){	return trnk_vsl_cd     	;	}
	public String           getTrnk_skd_voy_no (){	return trnk_skd_voy_no 	;	}
	public String           getTrnk_skd_dir_cd (){	return trnk_skd_dir_cd 	;	}
	public String           getBkg_cgo_tp_cd   (){	return bkg_cgo_tp_cd   	;	}
	public String           getBkg_rcv_term_cd (){	return bkg_rcv_term_cd 	;	}
	public String           getBkg_de_term_cd  (){	return bkg_de_term_cd  	;	}
	public String           getRep_cmdt_cd     (){	return rep_cmdt_cd     	;	}
	public String           getCmdt_cd         (){	return cmdt_cd         	;	}
	public String           getShpr_cnt_cd     (){	return shpr_cnt_cd     	;	}
	public String           getShpr_seq        (){	return shpr_seq        	;	}
	public String           getCnee_cnt_cd     (){	return cnee_cnt_cd     	;	}
	public String           getCnee_seq        (){	return cnee_seq        	;	}
	public String           getSc_no           (){	return sc_no           	;	}
	public String           getRfa_no          (){	return rfa_no          	;	}
	public String           getDg_clss_cd      (){	return dg_clss_cd      	;	}
	public String           getDg_spcl_flg     (){	return dg_spcl_flg     	;	}
	public String           getRf_spcl_flg     (){	return rf_spcl_flg     	;	}
	public String           getSpcl_awk_cgo_flg(){	return spcl_awk_cgo_flg	;	}
	public String           getBb_spcl_flg     (){	return bb_spcl_flg     	;	}
	public String           getRd_spcl_flg     (){	return rd_spcl_flg     	;	}
	public String           getHngr_spcl_flg   (){	return hngr_spcl_flg   	;	}
	public String           getSoc_flg         (){	return soc_flg         	;	}
	public String           getEq_subst_flg    (){	return eq_subst_flg    	;	}
	public String           getBkg_wgt         (){	return bkg_wgt         	;	}
	public String           getBkg_wgt_ut_cd   (){	return bkg_wgt_ut_cd   	;	}
	public String           getSls_ofc_cd      (){	return sls_ofc_cd      	;	}
	public String           getSls_rhq_cd      (){	return sls_rhq_cd      	;	}
	public String           getSls_ho_cd       (){	return sls_ho_cd       	;	}
	public String           getBkg_ofc_cd      (){	return bkg_ofc_cd      	;	}
	public String           getCre_ofc_cd      (){	return cre_ofc_cd      	;	}
	public String           getCre_usr_id      (){	return cre_usr_id      	;	}
	public String           getCre_dt          (){	return cre_dt          	;	}
	public String           getUpd_usr_id      (){	return upd_usr_id      	;	}
	public String           getUpd_dt          (){	return upd_dt          	;	}

	// setter method is proceeding ..
	public void setIbflag          ( String           ibflag           ){	this.ibflag           = ibflag          	;	}
	public void setPage_rows       ( String           page_rows        ){	this.page_rows        = page_rows       	;	}
	public void setPctl_no         ( String           pctl_no          ){	this.pctl_no          = pctl_no         	;	}
	public void setBkg_no          ( String           bkg_no           ){	this.bkg_no           = bkg_no          	;	}
	public void setBkg_no_split    ( String           bkg_no_split     ){	this.bkg_no_split     = bkg_no_split    	;	}
	public void setMty_pkup_yd_cd  ( String           mty_pkup_yd_cd   ){	this.mty_pkup_yd_cd   = mty_pkup_yd_cd  	;	}
	public void setPor_cd          ( String           por_cd           ){	this.por_cd           = por_cd          	;	}
	public void setPor_nod_cd      ( String           por_nod_cd       ){	this.por_nod_cd       = por_nod_cd      	;	}
	public void setPol_cd          ( String           pol_cd           ){	this.pol_cd           = pol_cd          	;	}
	public void setN1st_ts_port_cd ( String           n1st_ts_port_cd  ){	this.n1st_ts_port_cd  = n1st_ts_port_cd 	;	}
	public void setN2nd_ts_port_cd ( String           n2nd_ts_port_cd  ){	this.n2nd_ts_port_cd  = n2nd_ts_port_cd 	;	}
	public void setN3rd_ts_port_cd ( String           n3rd_ts_port_cd  ){	this.n3rd_ts_port_cd  = n3rd_ts_port_cd 	;	}
	public void setPod_cd          ( String           pod_cd           ){	this.pod_cd           = pod_cd          	;	}
	public void setDel_cd          ( String           del_cd           ){	this.del_cd           = del_cd          	;	}
	public void setDel_nod_cd      ( String           del_nod_cd       ){	this.del_nod_cd       = del_nod_cd      	;	}
	public void setMty_rtn_yd_cd   ( String           mty_rtn_yd_cd    ){	this.mty_rtn_yd_cd    = mty_rtn_yd_cd   	;	}
	public void setTtl_tztm_hrs    ( String           ttl_tztm_hrs     ){	this.ttl_tztm_hrs     = ttl_tztm_hrs    	;	}
	public void setProd_rev        ( String           prod_rev         ){	this.prod_rev         = prod_rev        	;	}
	public void setTtl_expn_amt    ( String           ttl_expn_amt     ){	this.ttl_expn_amt     = ttl_expn_amt    	;	}
	public void setCm_amt          ( String           cm_amt           ){	this.cm_amt           = cm_amt          	;	}
	public void setTrnk_aval_spc   ( String           trnk_aval_spc    ){	this.trnk_aval_spc    = trnk_aval_spc   	;	}
	public void setBkg_sel_flg     ( String           bkg_sel_flg      ){	this.bkg_sel_flg      = bkg_sel_flg     	;	}
	public void setCop_cre_flg     ( String           cop_cre_flg      ){	this.cop_cre_flg      = cop_cre_flg     	;	}
	public void setOb_itchg_ctnt   ( String           ob_itchg_ctnt    ){	this.ob_itchg_ctnt    = ob_itchg_ctnt   	;	}
	public void setIb_itchg_ctnt   ( String           ib_itchg_ctnt    ){	this.ib_itchg_ctnt    = ib_itchg_ctnt   	;	}
	public void setTrnk_vsl_cd     ( String           trnk_vsl_cd      ){	this.trnk_vsl_cd      = trnk_vsl_cd     	;	}
	public void setTrnk_skd_voy_no ( String           trnk_skd_voy_no  ){	this.trnk_skd_voy_no  = trnk_skd_voy_no 	;	}
	public void setTrnk_skd_dir_cd ( String           trnk_skd_dir_cd  ){	this.trnk_skd_dir_cd  = trnk_skd_dir_cd 	;	}
	public void setBkg_cgo_tp_cd   ( String           bkg_cgo_tp_cd    ){	this.bkg_cgo_tp_cd    = bkg_cgo_tp_cd   	;	}
	public void setBkg_rcv_term_cd ( String           bkg_rcv_term_cd  ){	this.bkg_rcv_term_cd  = bkg_rcv_term_cd 	;	}
	public void setBkg_de_term_cd  ( String           bkg_de_term_cd   ){	this.bkg_de_term_cd   = bkg_de_term_cd  	;	}
	public void setRep_cmdt_cd     ( String           rep_cmdt_cd      ){	this.rep_cmdt_cd      = rep_cmdt_cd     	;	}
	public void setCmdt_cd         ( String           cmdt_cd          ){	this.cmdt_cd          = cmdt_cd         	;	}
	public void setShpr_cnt_cd     ( String           shpr_cnt_cd      ){	this.shpr_cnt_cd      = shpr_cnt_cd     	;	}
	public void setShpr_seq        ( String           shpr_seq         ){	this.shpr_seq         = shpr_seq        	;	}
	public void setCnee_cnt_cd     ( String           cnee_cnt_cd      ){	this.cnee_cnt_cd      = cnee_cnt_cd     	;	}
	public void setCnee_seq        ( String           cnee_seq         ){	this.cnee_seq         = cnee_seq        	;	}
	public void setSc_no           ( String           sc_no            ){	this.sc_no            = sc_no           	;	}
	public void setRfa_no          ( String           rfa_no           ){	this.rfa_no           = rfa_no          	;	}
	public void setDg_clss_cd      ( String           dg_clss_cd       ){	this.dg_clss_cd       = dg_clss_cd      	;	}
	public void setDg_spcl_flg     ( String           dg_spcl_flg      ){	this.dg_spcl_flg      = dg_spcl_flg     	;	}
	public void setRf_spcl_flg     ( String           rf_spcl_flg      ){	this.rf_spcl_flg      = rf_spcl_flg     	;	}
	public void setSpcl_awk_cgo_flg( String           spcl_awk_cgo_flg ){	this.spcl_awk_cgo_flg = spcl_awk_cgo_flg	;	}
	public void setBb_spcl_flg     ( String           bb_spcl_flg      ){	this.bb_spcl_flg      = bb_spcl_flg     	;	}
	public void setRd_spcl_flg     ( String           rd_spcl_flg      ){	this.rd_spcl_flg      = rd_spcl_flg     	;	}
	public void setHngr_spcl_flg   ( String           hngr_spcl_flg    ){	this.hngr_spcl_flg    = hngr_spcl_flg   	;	}
	public void setSoc_flg         ( String           soc_flg          ){	this.soc_flg          = soc_flg         	;	}
	public void setEq_subst_flg    ( String           eq_subst_flg     ){	this.eq_subst_flg     = eq_subst_flg    	;	}
	public void setBkg_wgt         ( String           bkg_wgt          ){	this.bkg_wgt          = bkg_wgt         	;	}
	public void setBkg_wgt_ut_cd   ( String           bkg_wgt_ut_cd    ){	this.bkg_wgt_ut_cd    = bkg_wgt_ut_cd   	;	}
	public void setSls_ofc_cd      ( String           sls_ofc_cd       ){	this.sls_ofc_cd       = sls_ofc_cd      	;	}
	public void setSls_rhq_cd      ( String           sls_rhq_cd       ){	this.sls_rhq_cd       = sls_rhq_cd      	;	}
	public void setSls_ho_cd       ( String           sls_ho_cd        ){	this.sls_ho_cd        = sls_ho_cd       	;	}
	public void setBkg_ofc_cd      ( String           bkg_ofc_cd       ){	this.bkg_ofc_cd       = bkg_ofc_cd      	;	}
	public void setCre_ofc_cd      ( String           cre_ofc_cd       ){	this.cre_ofc_cd       = cre_ofc_cd      	;	}
	public void setCre_usr_id      ( String           cre_usr_id       ){	this.cre_usr_id       = cre_usr_id      	;	}
	public void setCre_dt          ( String           cre_dt           ){	this.cre_dt           = cre_dt          	;	}
	public void setUpd_usr_id      ( String           upd_usr_id       ){	this.upd_usr_id       = upd_usr_id      	;	}
	public void setUpd_dt          ( String           upd_dt           ){	this.upd_dt           = upd_dt          	;	}

	public static PRD_PROD_CTL_MST fromRequest(HttpServletRequest request) {
		PRD_PROD_CTL_MST model = new PRD_PROD_CTL_MST();
		try {
			model.setIbflag          	(JSPUtil.getParameter(request, "ibflag          		".trim(), ""));
			model.setPage_rows       	(JSPUtil.getParameter(request, "page_rows       		".trim(), ""));
			model.setPctl_no         	(JSPUtil.getParameter(request, "pctl_no         		".trim(), ""));
			model.setBkg_no          	(JSPUtil.getParameter(request, "bkg_no          		".trim(), ""));
			model.setBkg_no_split    	(JSPUtil.getParameter(request, "bkg_no_split    		".trim(), ""));
			model.setMty_pkup_yd_cd  	(JSPUtil.getParameter(request, "mty_pkup_yd_cd  		".trim(), ""));
			model.setPor_cd          	(JSPUtil.getParameter(request, "por_cd          		".trim(), ""));
			model.setPor_nod_cd      	(JSPUtil.getParameter(request, "por_nod_cd      		".trim(), ""));
			model.setPol_cd          	(JSPUtil.getParameter(request, "pol_cd          		".trim(), ""));
			model.setN1st_ts_port_cd 	(JSPUtil.getParameter(request, "n1st_ts_port_cd 		".trim(), ""));
			model.setN2nd_ts_port_cd 	(JSPUtil.getParameter(request, "n2nd_ts_port_cd 		".trim(), ""));
			model.setN3rd_ts_port_cd 	(JSPUtil.getParameter(request, "n3rd_ts_port_cd 		".trim(), ""));
			model.setPod_cd          	(JSPUtil.getParameter(request, "pod_cd          		".trim(), ""));
			model.setDel_cd          	(JSPUtil.getParameter(request, "del_cd          		".trim(), ""));
			model.setDel_nod_cd      	(JSPUtil.getParameter(request, "del_nod_cd      		".trim(), ""));
			model.setMty_rtn_yd_cd   	(JSPUtil.getParameter(request, "mty_rtn_yd_cd   		".trim(), ""));
			model.setTtl_tztm_hrs    	(JSPUtil.getParameter(request, "ttl_tztm_hrs    		".trim(), ""));
			model.setProd_rev        	(JSPUtil.getParameter(request, "prod_rev        		".trim(), ""));
			model.setTtl_expn_amt    	(JSPUtil.getParameter(request, "ttl_expn_amt    		".trim(), ""));
			model.setCm_amt          	(JSPUtil.getParameter(request, "cm_amt          		".trim(), ""));
			model.setTrnk_aval_spc   	(JSPUtil.getParameter(request, "trnk_aval_spc   		".trim(), ""));
			model.setBkg_sel_flg     	(JSPUtil.getParameter(request, "bkg_sel_flg     		".trim(), ""));
			model.setCop_cre_flg     	(JSPUtil.getParameter(request, "cop_cre_flg     		".trim(), ""));
			model.setOb_itchg_ctnt   	(JSPUtil.getParameter(request, "ob_itchg_ctnt   		".trim(), ""));
			model.setIb_itchg_ctnt   	(JSPUtil.getParameter(request, "ib_itchg_ctnt   		".trim(), ""));
			model.setTrnk_vsl_cd     	(JSPUtil.getParameter(request, "trnk_vsl_cd     		".trim(), ""));
			model.setTrnk_skd_voy_no 	(JSPUtil.getParameter(request, "trnk_skd_voy_no 		".trim(), ""));
			model.setTrnk_skd_dir_cd 	(JSPUtil.getParameter(request, "trnk_skd_dir_cd 		".trim(), ""));
			model.setBkg_cgo_tp_cd   	(JSPUtil.getParameter(request, "bkg_cgo_tp_cd   		".trim(), ""));
			model.setBkg_rcv_term_cd 	(JSPUtil.getParameter(request, "bkg_rcv_term_cd 		".trim(), ""));
			model.setBkg_de_term_cd  	(JSPUtil.getParameter(request, "bkg_de_term_cd  		".trim(), ""));
			model.setRep_cmdt_cd     	(JSPUtil.getParameter(request, "rep_cmdt_cd     		".trim(), ""));
			model.setCmdt_cd         	(JSPUtil.getParameter(request, "cmdt_cd         		".trim(), ""));
			model.setShpr_cnt_cd     	(JSPUtil.getParameter(request, "shpr_cnt_cd     		".trim(), ""));
			model.setShpr_seq        	(JSPUtil.getParameter(request, "shpr_seq        		".trim(), ""));
			model.setCnee_cnt_cd     	(JSPUtil.getParameter(request, "cnee_cnt_cd     		".trim(), ""));
			model.setCnee_seq        	(JSPUtil.getParameter(request, "cnee_seq        		".trim(), ""));
			model.setSc_no           	(JSPUtil.getParameter(request, "sc_no           		".trim(), ""));
			model.setRfa_no          	(JSPUtil.getParameter(request, "rfa_no          		".trim(), ""));
			model.setDg_clss_cd      	(JSPUtil.getParameter(request, "dg_clss_cd      		".trim(), ""));
			model.setDg_spcl_flg     	(JSPUtil.getParameter(request, "dg_spcl_flg     		".trim(), ""));
			model.setRf_spcl_flg     	(JSPUtil.getParameter(request, "rf_spcl_flg     		".trim(), ""));
			model.setSpcl_awk_cgo_flg	(JSPUtil.getParameter(request, "spcl_awk_cgo_flg		".trim(), ""));
			model.setBb_spcl_flg     	(JSPUtil.getParameter(request, "bb_spcl_flg     		".trim(), ""));
			model.setRd_spcl_flg     	(JSPUtil.getParameter(request, "rd_spcl_flg     		".trim(), ""));
			model.setHngr_spcl_flg   	(JSPUtil.getParameter(request, "hngr_spcl_flg   		".trim(), ""));
			model.setSoc_flg         	(JSPUtil.getParameter(request, "soc_flg         		".trim(), ""));
			model.setEq_subst_flg    	(JSPUtil.getParameter(request, "eq_subst_flg    		".trim(), ""));
			model.setBkg_wgt         	(JSPUtil.getParameter(request, "bkg_wgt         		".trim(), ""));
			model.setBkg_wgt_ut_cd   	(JSPUtil.getParameter(request, "bkg_wgt_ut_cd   		".trim(), ""));
			model.setSls_ofc_cd      	(JSPUtil.getParameter(request, "sls_ofc_cd      		".trim(), ""));
			model.setSls_rhq_cd      	(JSPUtil.getParameter(request, "sls_rhq_cd      		".trim(), ""));
			model.setSls_ho_cd       	(JSPUtil.getParameter(request, "sls_ho_cd       		".trim(), ""));
			model.setBkg_ofc_cd      	(JSPUtil.getParameter(request, "bkg_ofc_cd      		".trim(), ""));
			model.setCre_ofc_cd      	(JSPUtil.getParameter(request, "cre_ofc_cd      		".trim(), ""));
			model.setCre_usr_id      	(JSPUtil.getParameter(request, "cre_usr_id      		".trim(), ""));
			model.setCre_dt          	(JSPUtil.getParameter(request, "cre_dt          		".trim(), ""));
			model.setUpd_usr_id      	(JSPUtil.getParameter(request, "upd_usr_id      		".trim(), ""));
			model.setUpd_dt          	(JSPUtil.getParameter(request, "upd_dt          		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		PRD_PROD_CTL_MST model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag           =  (JSPUtil.getParameter(request, "ibflag          		".trim(), length));
			String[] page_rows        =  (JSPUtil.getParameter(request, "page_rows       		".trim(), length));
			String[] pctl_no          =  (JSPUtil.getParameter(request, "pctl_no         		".trim(), length));
			String[] bkg_no           =  (JSPUtil.getParameter(request, "bkg_no          		".trim(), length));
			String[] bkg_no_split     =  (JSPUtil.getParameter(request, "bkg_no_split    		".trim(), length));
			String[] mty_pkup_yd_cd   =  (JSPUtil.getParameter(request, "mty_pkup_yd_cd  		".trim(), length));
			String[] por_cd           =  (JSPUtil.getParameter(request, "por_cd          		".trim(), length));
			String[] por_nod_cd       =  (JSPUtil.getParameter(request, "por_nod_cd      		".trim(), length));
			String[] pol_cd           =  (JSPUtil.getParameter(request, "pol_cd          		".trim(), length));
			String[] n1st_ts_port_cd  =  (JSPUtil.getParameter(request, "n1st_ts_port_cd 		".trim(), length));
			String[] n2nd_ts_port_cd  =  (JSPUtil.getParameter(request, "n2nd_ts_port_cd 		".trim(), length));
			String[] n3rd_ts_port_cd  =  (JSPUtil.getParameter(request, "n3rd_ts_port_cd 		".trim(), length));
			String[] pod_cd           =  (JSPUtil.getParameter(request, "pod_cd          		".trim(), length));
			String[] del_cd           =  (JSPUtil.getParameter(request, "del_cd          		".trim(), length));
			String[] del_nod_cd       =  (JSPUtil.getParameter(request, "del_nod_cd      		".trim(), length));
			String[] mty_rtn_yd_cd    =  (JSPUtil.getParameter(request, "mty_rtn_yd_cd   		".trim(), length));
			String[] ttl_tztm_hrs     =  (JSPUtil.getParameter(request, "ttl_tztm_hrs    		".trim(), length));
			String[] prod_rev         =  (JSPUtil.getParameter(request, "prod_rev        		".trim(), length));
			String[] ttl_expn_amt     =  (JSPUtil.getParameter(request, "ttl_expn_amt    		".trim(), length));
			String[] cm_amt           =  (JSPUtil.getParameter(request, "cm_amt          		".trim(), length));
			String[] trnk_aval_spc    =  (JSPUtil.getParameter(request, "trnk_aval_spc   		".trim(), length));
			String[] bkg_sel_flg      =  (JSPUtil.getParameter(request, "bkg_sel_flg     		".trim(), length));
			String[] cop_cre_flg      =  (JSPUtil.getParameter(request, "cop_cre_flg     		".trim(), length));
			String[] ob_itchg_ctnt    =  (JSPUtil.getParameter(request, "ob_itchg_ctnt   		".trim(), length));
			String[] ib_itchg_ctnt    =  (JSPUtil.getParameter(request, "ib_itchg_ctnt   		".trim(), length));
			String[] trnk_vsl_cd      =  (JSPUtil.getParameter(request, "trnk_vsl_cd     		".trim(), length));
			String[] trnk_skd_voy_no  =  (JSPUtil.getParameter(request, "trnk_skd_voy_no 		".trim(), length));
			String[] trnk_skd_dir_cd  =  (JSPUtil.getParameter(request, "trnk_skd_dir_cd 		".trim(), length));
			String[] bkg_cgo_tp_cd    =  (JSPUtil.getParameter(request, "bkg_cgo_tp_cd   		".trim(), length));
			String[] bkg_rcv_term_cd  =  (JSPUtil.getParameter(request, "bkg_rcv_term_cd 		".trim(), length));
			String[] bkg_de_term_cd   =  (JSPUtil.getParameter(request, "bkg_de_term_cd  		".trim(), length));
			String[] rep_cmdt_cd      =  (JSPUtil.getParameter(request, "rep_cmdt_cd     		".trim(), length));
			String[] cmdt_cd          =  (JSPUtil.getParameter(request, "cmdt_cd         		".trim(), length));
			String[] shpr_cnt_cd      =  (JSPUtil.getParameter(request, "shpr_cnt_cd     		".trim(), length));
			String[] shpr_seq         =  (JSPUtil.getParameter(request, "shpr_seq        		".trim(), length));
			String[] cnee_cnt_cd      =  (JSPUtil.getParameter(request, "cnee_cnt_cd     		".trim(), length));
			String[] cnee_seq         =  (JSPUtil.getParameter(request, "cnee_seq        		".trim(), length));
			String[] sc_no            =  (JSPUtil.getParameter(request, "sc_no           		".trim(), length));
			String[] rfa_no           =  (JSPUtil.getParameter(request, "rfa_no          		".trim(), length));
			String[] dg_clss_cd       =  (JSPUtil.getParameter(request, "dg_clss_cd      		".trim(), length));
			String[] dg_spcl_flg      =  (JSPUtil.getParameter(request, "dg_spcl_flg     		".trim(), length));
			String[] rf_spcl_flg      =  (JSPUtil.getParameter(request, "rf_spcl_flg     		".trim(), length));
			String[] spcl_awk_cgo_flg =  (JSPUtil.getParameter(request, "spcl_awk_cgo_flg		".trim(), length));
			String[] bb_spcl_flg      =  (JSPUtil.getParameter(request, "bb_spcl_flg     		".trim(), length));
			String[] rd_spcl_flg      =  (JSPUtil.getParameter(request, "rd_spcl_flg     		".trim(), length));
			String[] hngr_spcl_flg    =  (JSPUtil.getParameter(request, "hngr_spcl_flg   		".trim(), length));
			String[] soc_flg          =  (JSPUtil.getParameter(request, "soc_flg         		".trim(), length));
			String[] eq_subst_flg     =  (JSPUtil.getParameter(request, "eq_subst_flg    		".trim(), length));
			String[] bkg_wgt          =  (JSPUtil.getParameter(request, "bkg_wgt         		".trim(), length));
			String[] bkg_wgt_ut_cd    =  (JSPUtil.getParameter(request, "bkg_wgt_ut_cd   		".trim(), length));
			String[] sls_ofc_cd       =  (JSPUtil.getParameter(request, "sls_ofc_cd      		".trim(), length));
			String[] sls_rhq_cd       =  (JSPUtil.getParameter(request, "sls_rhq_cd      		".trim(), length));
			String[] sls_ho_cd        =  (JSPUtil.getParameter(request, "sls_ho_cd       		".trim(), length));
			String[] bkg_ofc_cd       =  (JSPUtil.getParameter(request, "bkg_ofc_cd      		".trim(), length));
			String[] cre_ofc_cd       =  (JSPUtil.getParameter(request, "cre_ofc_cd      		".trim(), length));
			String[] cre_usr_id       =  (JSPUtil.getParameter(request, "cre_usr_id      		".trim(), length));
			String[] cre_dt           =  (JSPUtil.getParameter(request, "cre_dt          		".trim(), length));
			String[] upd_usr_id       =  (JSPUtil.getParameter(request, "upd_usr_id      		".trim(), length));
			String[] upd_dt           =  (JSPUtil.getParameter(request, "upd_dt          		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new PRD_PROD_CTL_MST();
				model.setIbflag          		  (ibflag          	[i]);
				model.setPage_rows       		  (page_rows       	[i]);
				model.setPctl_no         		  (pctl_no         	[i]);
				model.setBkg_no          		  (bkg_no          	[i]);
				model.setBkg_no_split    		  (bkg_no_split    	[i]);
				model.setMty_pkup_yd_cd  		  (mty_pkup_yd_cd  	[i]);
				model.setPor_cd          		  (por_cd          	[i]);
				model.setPor_nod_cd      		  (por_nod_cd      	[i]);
				model.setPol_cd          		  (pol_cd          	[i]);
				model.setN1st_ts_port_cd 		  (n1st_ts_port_cd 	[i]);
				model.setN2nd_ts_port_cd 		  (n2nd_ts_port_cd 	[i]);
				model.setN3rd_ts_port_cd 		  (n3rd_ts_port_cd 	[i]);
				model.setPod_cd          		  (pod_cd          	[i]);
				model.setDel_cd          		  (del_cd          	[i]);
				model.setDel_nod_cd      		  (del_nod_cd      	[i]);
				model.setMty_rtn_yd_cd   		  (mty_rtn_yd_cd   	[i]);
				model.setTtl_tztm_hrs    		  (ttl_tztm_hrs    	[i]);
				model.setProd_rev        		  (prod_rev        	[i]);
				model.setTtl_expn_amt    		  (ttl_expn_amt    	[i]);
				model.setCm_amt          		  (cm_amt          	[i]);
				model.setTrnk_aval_spc   		  (trnk_aval_spc   	[i]);
				model.setBkg_sel_flg     		  (bkg_sel_flg     	[i]);
				model.setCop_cre_flg     		  (cop_cre_flg     	[i]);
				model.setOb_itchg_ctnt   		  (ob_itchg_ctnt   	[i]);
				model.setIb_itchg_ctnt   		  (ib_itchg_ctnt   	[i]);
				model.setTrnk_vsl_cd     		  (trnk_vsl_cd     	[i]);
				model.setTrnk_skd_voy_no 		  (trnk_skd_voy_no 	[i]);
				model.setTrnk_skd_dir_cd 		  (trnk_skd_dir_cd 	[i]);
				model.setBkg_cgo_tp_cd   		  (bkg_cgo_tp_cd   	[i]);
				model.setBkg_rcv_term_cd 		  (bkg_rcv_term_cd 	[i]);
				model.setBkg_de_term_cd  		  (bkg_de_term_cd  	[i]);
				model.setRep_cmdt_cd     		  (rep_cmdt_cd     	[i]);
				model.setCmdt_cd         		  (cmdt_cd         	[i]);
				model.setShpr_cnt_cd     		  (shpr_cnt_cd     	[i]);
				model.setShpr_seq        		  (shpr_seq        	[i]);
				model.setCnee_cnt_cd     		  (cnee_cnt_cd     	[i]);
				model.setCnee_seq        		  (cnee_seq        	[i]);
				model.setSc_no           		  (sc_no           	[i]);
				model.setRfa_no          		  (rfa_no          	[i]);
				model.setDg_clss_cd      		  (dg_clss_cd      	[i]);
				model.setDg_spcl_flg     		  (dg_spcl_flg     	[i]);
				model.setRf_spcl_flg     		  (rf_spcl_flg     	[i]);
				model.setSpcl_awk_cgo_flg		  (spcl_awk_cgo_flg	[i]);
				model.setBb_spcl_flg     		  (bb_spcl_flg     	[i]);
				model.setRd_spcl_flg     		  (rd_spcl_flg     	[i]);
				model.setHngr_spcl_flg   		  (hngr_spcl_flg   	[i]);
				model.setSoc_flg         		  (soc_flg         	[i]);
				model.setEq_subst_flg    		  (eq_subst_flg    	[i]);
				model.setBkg_wgt         		  (bkg_wgt         	[i]);
				model.setBkg_wgt_ut_cd   		  (bkg_wgt_ut_cd   	[i]);
				model.setSls_ofc_cd      		  (sls_ofc_cd      	[i]);
				model.setSls_rhq_cd      		  (sls_rhq_cd      	[i]);
				model.setSls_ho_cd       		  (sls_ho_cd       	[i]);
				model.setBkg_ofc_cd      		  (bkg_ofc_cd      	[i]);
				model.setCre_ofc_cd      		  (cre_ofc_cd      	[i]);
				model.setCre_usr_id      		  (cre_usr_id      	[i]);
				model.setCre_dt          		  (cre_dt          	[i]);
				model.setUpd_usr_id      		  (upd_usr_id      	[i]);
				model.setUpd_dt          		  (upd_dt          	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		PRD_PROD_CTL_MST model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag           =  (JSPUtil.getParameter(request, prefix + "ibflag          		".trim(), length));
			String[] page_rows        =  (JSPUtil.getParameter(request, prefix + "page_rows       		".trim(), length));
			String[] pctl_no          =  (JSPUtil.getParameter(request, prefix + "pctl_no         		".trim(), length));
			String[] bkg_no           =  (JSPUtil.getParameter(request, prefix + "bkg_no          		".trim(), length));
			String[] bkg_no_split     =  (JSPUtil.getParameter(request, prefix + "bkg_no_split    		".trim(), length));
			String[] mty_pkup_yd_cd   =  (JSPUtil.getParameter(request, prefix + "mty_pkup_yd_cd  		".trim(), length));
			String[] por_cd           =  (JSPUtil.getParameter(request, prefix + "por_cd          		".trim(), length));
			String[] por_nod_cd       =  (JSPUtil.getParameter(request, prefix + "por_nod_cd      		".trim(), length));
			String[] pol_cd           =  (JSPUtil.getParameter(request, prefix + "pol_cd          		".trim(), length));
			String[] n1st_ts_port_cd  =  (JSPUtil.getParameter(request, prefix + "n1st_ts_port_cd 		".trim(), length));
			String[] n2nd_ts_port_cd  =  (JSPUtil.getParameter(request, prefix + "n2nd_ts_port_cd 		".trim(), length));
			String[] n3rd_ts_port_cd  =  (JSPUtil.getParameter(request, prefix + "n3rd_ts_port_cd 		".trim(), length));
			String[] pod_cd           =  (JSPUtil.getParameter(request, prefix + "pod_cd          		".trim(), length));
			String[] del_cd           =  (JSPUtil.getParameter(request, prefix + "del_cd          		".trim(), length));
			String[] del_nod_cd       =  (JSPUtil.getParameter(request, prefix + "del_nod_cd      		".trim(), length));
			String[] mty_rtn_yd_cd    =  (JSPUtil.getParameter(request, prefix + "mty_rtn_yd_cd   		".trim(), length));
			String[] ttl_tztm_hrs     =  (JSPUtil.getParameter(request, prefix + "ttl_tztm_hrs    		".trim(), length));
			String[] prod_rev         =  (JSPUtil.getParameter(request, prefix + "prod_rev        		".trim(), length));
			String[] ttl_expn_amt     =  (JSPUtil.getParameter(request, prefix + "ttl_expn_amt    		".trim(), length));
			String[] cm_amt           =  (JSPUtil.getParameter(request, prefix + "cm_amt          		".trim(), length));
			String[] trnk_aval_spc    =  (JSPUtil.getParameter(request, prefix + "trnk_aval_spc   		".trim(), length));
			String[] bkg_sel_flg      =  (JSPUtil.getParameter(request, prefix + "bkg_sel_flg     		".trim(), length));
			String[] cop_cre_flg      =  (JSPUtil.getParameter(request, prefix + "cop_cre_flg     		".trim(), length));
			String[] ob_itchg_ctnt    =  (JSPUtil.getParameter(request, prefix + "ob_itchg_ctnt   		".trim(), length));
			String[] ib_itchg_ctnt    =  (JSPUtil.getParameter(request, prefix + "ib_itchg_ctnt   		".trim(), length));
			String[] trnk_vsl_cd      =  (JSPUtil.getParameter(request, prefix + "trnk_vsl_cd     		".trim(), length));
			String[] trnk_skd_voy_no  =  (JSPUtil.getParameter(request, prefix + "trnk_skd_voy_no 		".trim(), length));
			String[] trnk_skd_dir_cd  =  (JSPUtil.getParameter(request, prefix + "trnk_skd_dir_cd 		".trim(), length));
			String[] bkg_cgo_tp_cd    =  (JSPUtil.getParameter(request, prefix + "bkg_cgo_tp_cd   		".trim(), length));
			String[] bkg_rcv_term_cd  =  (JSPUtil.getParameter(request, prefix + "bkg_rcv_term_cd 		".trim(), length));
			String[] bkg_de_term_cd   =  (JSPUtil.getParameter(request, prefix + "bkg_de_term_cd  		".trim(), length));
			String[] rep_cmdt_cd      =  (JSPUtil.getParameter(request, prefix + "rep_cmdt_cd     		".trim(), length));
			String[] cmdt_cd          =  (JSPUtil.getParameter(request, prefix + "cmdt_cd         		".trim(), length));
			String[] shpr_cnt_cd      =  (JSPUtil.getParameter(request, prefix + "shpr_cnt_cd     		".trim(), length));
			String[] shpr_seq         =  (JSPUtil.getParameter(request, prefix + "shpr_seq        		".trim(), length));
			String[] cnee_cnt_cd      =  (JSPUtil.getParameter(request, prefix + "cnee_cnt_cd     		".trim(), length));
			String[] cnee_seq         =  (JSPUtil.getParameter(request, prefix + "cnee_seq        		".trim(), length));
			String[] sc_no            =  (JSPUtil.getParameter(request, prefix + "sc_no           		".trim(), length));
			String[] rfa_no           =  (JSPUtil.getParameter(request, prefix + "rfa_no          		".trim(), length));
			String[] dg_clss_cd       =  (JSPUtil.getParameter(request, prefix + "dg_clss_cd      		".trim(), length));
			String[] dg_spcl_flg      =  (JSPUtil.getParameter(request, prefix + "dg_spcl_flg     		".trim(), length));
			String[] rf_spcl_flg      =  (JSPUtil.getParameter(request, prefix + "rf_spcl_flg     		".trim(), length));
			String[] spcl_awk_cgo_flg =  (JSPUtil.getParameter(request, prefix + "spcl_awk_cgo_flg		".trim(), length));
			String[] bb_spcl_flg      =  (JSPUtil.getParameter(request, prefix + "bb_spcl_flg     		".trim(), length));
			String[] rd_spcl_flg      =  (JSPUtil.getParameter(request, prefix + "rd_spcl_flg     		".trim(), length));
			String[] hngr_spcl_flg    =  (JSPUtil.getParameter(request, prefix + "hngr_spcl_flg   		".trim(), length));
			String[] soc_flg          =  (JSPUtil.getParameter(request, prefix + "soc_flg         		".trim(), length));
			String[] eq_subst_flg     =  (JSPUtil.getParameter(request, prefix + "eq_subst_flg    		".trim(), length));
			String[] bkg_wgt          =  (JSPUtil.getParameter(request, prefix + "bkg_wgt         		".trim(), length));
			String[] bkg_wgt_ut_cd    =  (JSPUtil.getParameter(request, prefix + "bkg_wgt_ut_cd   		".trim(), length));
			String[] sls_ofc_cd       =  (JSPUtil.getParameter(request, prefix + "sls_ofc_cd      		".trim(), length));
			String[] sls_rhq_cd       =  (JSPUtil.getParameter(request, prefix + "sls_rhq_cd      		".trim(), length));
			String[] sls_ho_cd        =  (JSPUtil.getParameter(request, prefix + "sls_ho_cd       		".trim(), length));
			String[] bkg_ofc_cd       =  (JSPUtil.getParameter(request, prefix + "bkg_ofc_cd      		".trim(), length));
			String[] cre_ofc_cd       =  (JSPUtil.getParameter(request, prefix + "cre_ofc_cd      		".trim(), length));
			String[] cre_usr_id       =  (JSPUtil.getParameter(request, prefix + "cre_usr_id      		".trim(), length));
			String[] cre_dt           =  (JSPUtil.getParameter(request, prefix + "cre_dt          		".trim(), length));
			String[] upd_usr_id       =  (JSPUtil.getParameter(request, prefix + "upd_usr_id      		".trim(), length));
			String[] upd_dt           =  (JSPUtil.getParameter(request, prefix + "upd_dt          		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new PRD_PROD_CTL_MST();
				model.setIbflag          		  ( ibflag          	[i]);
				model.setPage_rows       		  ( page_rows       	[i]);
				model.setPctl_no         		  ( pctl_no         	[i]);
				model.setBkg_no          		  ( bkg_no          	[i]);
				model.setBkg_no_split    		  ( bkg_no_split    	[i]);
				model.setMty_pkup_yd_cd  		  ( mty_pkup_yd_cd  	[i]);
				model.setPor_cd          		  ( por_cd          	[i]);
				model.setPor_nod_cd      		  ( por_nod_cd      	[i]);
				model.setPol_cd          		  ( pol_cd          	[i]);
				model.setN1st_ts_port_cd 		  ( n1st_ts_port_cd 	[i]);
				model.setN2nd_ts_port_cd 		  ( n2nd_ts_port_cd 	[i]);
				model.setN3rd_ts_port_cd 		  ( n3rd_ts_port_cd 	[i]);
				model.setPod_cd          		  ( pod_cd          	[i]);
				model.setDel_cd          		  ( del_cd          	[i]);
				model.setDel_nod_cd      		  ( del_nod_cd      	[i]);
				model.setMty_rtn_yd_cd   		  ( mty_rtn_yd_cd   	[i]);
				model.setTtl_tztm_hrs    		  ( ttl_tztm_hrs    	[i]);
				model.setProd_rev        		  ( prod_rev        	[i]);
				model.setTtl_expn_amt    		  ( ttl_expn_amt    	[i]);
				model.setCm_amt          		  ( cm_amt          	[i]);
				model.setTrnk_aval_spc   		  ( trnk_aval_spc   	[i]);
				model.setBkg_sel_flg     		  ( bkg_sel_flg     	[i]);
				model.setCop_cre_flg     		  ( cop_cre_flg     	[i]);
				model.setOb_itchg_ctnt   		  ( ob_itchg_ctnt   	[i]);
				model.setIb_itchg_ctnt   		  ( ib_itchg_ctnt   	[i]);
				model.setTrnk_vsl_cd     		  ( trnk_vsl_cd     	[i]);
				model.setTrnk_skd_voy_no 		  ( trnk_skd_voy_no 	[i]);
				model.setTrnk_skd_dir_cd 		  ( trnk_skd_dir_cd 	[i]);
				model.setBkg_cgo_tp_cd   		  ( bkg_cgo_tp_cd   	[i]);
				model.setBkg_rcv_term_cd 		  ( bkg_rcv_term_cd 	[i]);
				model.setBkg_de_term_cd  		  ( bkg_de_term_cd  	[i]);
				model.setRep_cmdt_cd     		  ( rep_cmdt_cd     	[i]);
				model.setCmdt_cd         		  ( cmdt_cd         	[i]);
				model.setShpr_cnt_cd     		  ( shpr_cnt_cd     	[i]);
				model.setShpr_seq        		  ( shpr_seq        	[i]);
				model.setCnee_cnt_cd     		  ( cnee_cnt_cd     	[i]);
				model.setCnee_seq        		  ( cnee_seq        	[i]);
				model.setSc_no           		  ( sc_no           	[i]);
				model.setRfa_no          		  ( rfa_no          	[i]);
				model.setDg_clss_cd      		  ( dg_clss_cd      	[i]);
				model.setDg_spcl_flg     		  ( dg_spcl_flg     	[i]);
				model.setRf_spcl_flg     		  ( rf_spcl_flg     	[i]);
				model.setSpcl_awk_cgo_flg		  ( spcl_awk_cgo_flg	[i]);
				model.setBb_spcl_flg     		  ( bb_spcl_flg     	[i]);
				model.setRd_spcl_flg     		  ( rd_spcl_flg     	[i]);
				model.setHngr_spcl_flg   		  ( hngr_spcl_flg   	[i]);
				model.setSoc_flg         		  ( soc_flg         	[i]);
				model.setEq_subst_flg    		  ( eq_subst_flg    	[i]);
				model.setBkg_wgt         		  ( bkg_wgt         	[i]);
				model.setBkg_wgt_ut_cd   		  ( bkg_wgt_ut_cd   	[i]);
				model.setSls_ofc_cd      		  ( sls_ofc_cd      	[i]);
				model.setSls_rhq_cd      		  ( sls_rhq_cd      	[i]);
				model.setSls_ho_cd       		  ( sls_ho_cd       	[i]);
				model.setBkg_ofc_cd      		  ( bkg_ofc_cd      	[i]);
				model.setCre_ofc_cd      		  ( cre_ofc_cd      	[i]);
				model.setCre_usr_id      		  ( cre_usr_id      	[i]);
				model.setCre_dt          		  ( cre_dt          	[i]);
				model.setUpd_usr_id      		  ( upd_usr_id      	[i]);
				model.setUpd_dt          		  ( upd_dt          	[i]);
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
