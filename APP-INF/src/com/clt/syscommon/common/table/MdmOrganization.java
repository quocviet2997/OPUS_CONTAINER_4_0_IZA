/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : MDM_ORGANIZATION.java
*@FileTitle : 사용자 관리
*Open Issues :
*Change history :
*@LastModifyDate : 2007-01-08
*@LastModifier : Kildong_hong
*@LastVersion : 1.0
* 2007-01-08 Kildong_hong
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
 * @author Kildong_hong
 * @since J2EE 1.4
 */
public final class MdmOrganization implements java.io.Serializable {

	private String                        ibflag                        = "";
	private String                        page_rows                     = "";
	private String                        ofc_cd                        = "";
	private String                        ofc_eng_nm                    = "";
	private String                        ofc_krn_nm                    = "";
	private String                        ofc_addr                      = "";
	private String                        ofc_zip_cd                    = "";
	private String                        ofc_knd_cd                    = "";
	private String                        agn_knd_cd                    = "";
	private String                        vndr_cnt_cd                   = "";
	private String                        vndr_seq                      = "";
	private String                        intl_phn_no                   = "";
	private String                        ofc_phn_no                    = "";
	private String                        intl_fax_no                   = "";
	private String                        ofc_fax_no                    = "";
	private String                        ofc_pson_knt                  = "";
	private String                        ofc_rmk                       = "";
	private String                        loc_cd                        = "";
	private String                        bil_curr_cd                   = "";
	private String                        ar_curr_cd                    = "";
	private String                        ar_ctr_cd                     = "";
	private String                        prnt_ofc_cd                   = "";
	private String                        opn_dt                        = "";
	private String                        clz_dt                        = "";
	private String                        finc_rgn_cd                   = "";
	private String                        ar_ofc_cd                     = "";
	private String                        ar_ctrl_ofc_cd                = "";
	private String                        ar_hd_qtr_ofc_cd              = "";
	private String                        ib_cr_term_dys                = "";
	private String                        ob_cr_term_dys                = "";
	private String                        sub_agn_flg                   = "";
	private String                        rep_cust_cnt_cd               = "";
	private String                        rep_cust_seq                  = "";
	private String                        inv_pfx_cd                    = "";
	private String                        ap_ofc_cd                     = "";
	private String                        ap_ctrl_ofc_cd                = "";
	private String                        ap_ho_acct_cd                 = "";
	private String                        ap_ctr_cd                     = "";
	private String                        ar_agn_stl_cd                 = "";
	private String                        fx_curr_rt                    = "";
	private String                        ap_euro_curr_use_flg          = "";
	private String                        usa_brk_brnc_rqst_ctrl_ofc_cd = "";
	private String                        asa_cr_term_dys               = "";
	private String                        so_if_cd                      = "";
	private String                        sls_ofc_use_flg               = "";
	private String                        sls_ofc_div_cd                = "";
	private String                        ofc_tax_id                    = "";
	private String                        ofc_rfa_sc_use_flg            = "";
	private String                        comm_if_ind_cd                = "";
	private String                        fax_ip                        = "";
	private String                        bfr_ofc_cd                    = "";
	private String                        modi_ofc_cd                   = "";
	private String                        ofc_cmmc_cd                   = "";
	private String                        ofc_tp_cd                     = "";
	private String                        prc_ofc_cd                    = "";
	private String                        ofc_url                       = "";
	private String                        ofc_rep_eml                   = "";
	private String                        bkg_svr_srch_rout_cd          = "";
	private String                        ofc_sls_delt_flg              = "";
	private String                        doc_rcvr_hide_flg             = "";
	private String                        finc_hide_flg                 = "";
	private String                        finc_psdo_ofc_flg             = "";
	private String                        subs_co_flg                   = "";
	private String                        gl_ctr_cd                     = "";
	private String                        cre_usr_id                    = "";
	private String                        cre_dt                        = "";
	private String                        upd_usr_id                    = "";
	private String                        upd_dt                        = "";
	private String                        delt_flg                      = "";
	private String                        eai_evnt_dt                   = "";
	private String                        mst_ofc_id                    = "";
	private String                        prnt_mofc_id                  = "";

	public MdmOrganization(){}

	public MdmOrganization(
			String                        ibflag                       ,
			String                        page_rows                    ,
			String                        ofc_cd                       ,
			String                        ofc_eng_nm                   ,
			String                        ofc_krn_nm                   ,
			String                        ofc_addr                     ,
			String                        ofc_zip_cd                   ,
			String                        ofc_knd_cd                   ,
			String                        agn_knd_cd                   ,
			String                        vndr_cnt_cd                  ,
			String                        vndr_seq                     ,
			String                        intl_phn_no                  ,
			String                        ofc_phn_no                   ,
			String                        intl_fax_no                  ,
			String                        ofc_fax_no                   ,
			String                        ofc_pson_knt                 ,
			String                        ofc_rmk                      ,
			String                        loc_cd                       ,
			String                        bil_curr_cd                  ,
			String                        ar_curr_cd                   ,
			String                        ar_ctr_cd                    ,
			String                        prnt_ofc_cd                  ,
			String                        opn_dt                       ,
			String                        clz_dt                       ,
			String                        finc_rgn_cd                  ,
			String                        ar_ofc_cd                    ,
			String                        ar_ctrl_ofc_cd               ,
			String                        ar_hd_qtr_ofc_cd             ,
			String                        ib_cr_term_dys               ,
			String                        ob_cr_term_dys               ,
			String                        sub_agn_flg                  ,
			String                        rep_cust_cnt_cd              ,
			String                        rep_cust_seq                 ,
			String                        inv_pfx_cd                   ,
			String                        ap_ofc_cd                    ,
			String                        ap_ctrl_ofc_cd               ,
			String                        ap_ho_acct_cd                ,
			String                        ap_ctr_cd                    ,
			String                        ar_agn_stl_cd                ,
			String                        fx_curr_rt                   ,
			String                        ap_euro_curr_use_flg         ,
			String                        usa_brk_brnc_rqst_ctrl_ofc_cd,
			String                        asa_cr_term_dys              ,
			String                        so_if_cd                     ,
			String                        sls_ofc_use_flg              ,
			String                        sls_ofc_div_cd               ,
			String                        ofc_tax_id                   ,
			String                        ofc_rfa_sc_use_flg           ,
			String                        comm_if_ind_cd               ,
			String                        fax_ip                       ,
			String                        bfr_ofc_cd                   ,
			String                        modi_ofc_cd                  ,
			String                        ofc_cmmc_cd                  ,
			String                        ofc_tp_cd                    ,
			String                        prc_ofc_cd                   ,
			String                        ofc_url                      ,
			String                        ofc_rep_eml                  ,
			String                        bkg_svr_srch_rout_cd         ,
			String                        ofc_sls_delt_flg             ,
			String                        doc_rcvr_hide_flg            ,
			String                        finc_hide_flg                ,
			String                        finc_psdo_ofc_flg            ,
			String                        subs_co_flg                  ,
			String                        gl_ctr_cd                    ,
			String                        cre_usr_id                   ,
			String                        cre_dt                       ,
			String                        upd_usr_id                   ,
			String                        upd_dt                       ,
			String                        delt_flg                     ,
			String                        eai_evnt_dt                  ,
			String                        mst_ofc_id                   ,
			String                        prnt_mofc_id                 ){
		this.ibflag                        = ibflag                       ;
		this.page_rows                     = page_rows                    ;
		this.ofc_cd                        = ofc_cd                       ;
		this.ofc_eng_nm                    = ofc_eng_nm                   ;
		this.ofc_krn_nm                    = ofc_krn_nm                   ;
		this.ofc_addr                      = ofc_addr                     ;
		this.ofc_zip_cd                    = ofc_zip_cd                   ;
		this.ofc_knd_cd                    = ofc_knd_cd                   ;
		this.agn_knd_cd                    = agn_knd_cd                   ;
		this.vndr_cnt_cd                   = vndr_cnt_cd                  ;
		this.vndr_seq                      = vndr_seq                     ;
		this.intl_phn_no                   = intl_phn_no                  ;
		this.ofc_phn_no                    = ofc_phn_no                   ;
		this.intl_fax_no                   = intl_fax_no                  ;
		this.ofc_fax_no                    = ofc_fax_no                   ;
		this.ofc_pson_knt                  = ofc_pson_knt                 ;
		this.ofc_rmk                       = ofc_rmk                      ;
		this.loc_cd                        = loc_cd                       ;
		this.bil_curr_cd                   = bil_curr_cd                  ;
		this.ar_curr_cd                    = ar_curr_cd                   ;
		this.ar_ctr_cd                     = ar_ctr_cd                    ;
		this.prnt_ofc_cd                   = prnt_ofc_cd                  ;
		this.opn_dt                        = opn_dt                       ;
		this.clz_dt                        = clz_dt                       ;
		this.finc_rgn_cd                   = finc_rgn_cd                  ;
		this.ar_ofc_cd                     = ar_ofc_cd                    ;
		this.ar_ctrl_ofc_cd                = ar_ctrl_ofc_cd               ;
		this.ar_hd_qtr_ofc_cd              = ar_hd_qtr_ofc_cd             ;
		this.ib_cr_term_dys                = ib_cr_term_dys               ;
		this.ob_cr_term_dys                = ob_cr_term_dys               ;
		this.sub_agn_flg                   = sub_agn_flg                  ;
		this.rep_cust_cnt_cd               = rep_cust_cnt_cd              ;
		this.rep_cust_seq                  = rep_cust_seq                 ;
		this.inv_pfx_cd                    = inv_pfx_cd                   ;
		this.ap_ofc_cd                     = ap_ofc_cd                    ;
		this.ap_ctrl_ofc_cd                = ap_ctrl_ofc_cd               ;
		this.ap_ho_acct_cd                 = ap_ho_acct_cd                ;
		this.ap_ctr_cd                     = ap_ctr_cd                    ;
		this.ar_agn_stl_cd                 = ar_agn_stl_cd                ;
		this.fx_curr_rt                    = fx_curr_rt                   ;
		this.ap_euro_curr_use_flg          = ap_euro_curr_use_flg         ;
		this.usa_brk_brnc_rqst_ctrl_ofc_cd = usa_brk_brnc_rqst_ctrl_ofc_cd;
		this.asa_cr_term_dys               = asa_cr_term_dys              ;
		this.so_if_cd                      = so_if_cd                     ;
		this.sls_ofc_use_flg               = sls_ofc_use_flg              ;
		this.sls_ofc_div_cd                = sls_ofc_div_cd               ;
		this.ofc_tax_id                    = ofc_tax_id                   ;
		this.ofc_rfa_sc_use_flg            = ofc_rfa_sc_use_flg           ;
		this.comm_if_ind_cd                = comm_if_ind_cd               ;
		this.fax_ip                        = fax_ip                       ;
		this.bfr_ofc_cd                    = bfr_ofc_cd                   ;
		this.modi_ofc_cd                   = modi_ofc_cd                  ;
		this.ofc_cmmc_cd                   = ofc_cmmc_cd                  ;
		this.ofc_tp_cd                     = ofc_tp_cd                    ;
		this.prc_ofc_cd                    = prc_ofc_cd                   ;
		this.ofc_url                       = ofc_url                      ;
		this.ofc_rep_eml                   = ofc_rep_eml                  ;
		this.bkg_svr_srch_rout_cd          = bkg_svr_srch_rout_cd         ;
		this.ofc_sls_delt_flg              = ofc_sls_delt_flg             ;
		this.doc_rcvr_hide_flg             = doc_rcvr_hide_flg            ;
		this.finc_hide_flg                 = finc_hide_flg                ;
		this.finc_psdo_ofc_flg             = finc_psdo_ofc_flg            ;
		this.subs_co_flg                   = subs_co_flg                  ;
		this.gl_ctr_cd                     = gl_ctr_cd                    ;
		this.cre_usr_id                    = cre_usr_id                   ;
		this.cre_dt                        = cre_dt                       ;
		this.upd_usr_id                    = upd_usr_id                   ;
		this.upd_dt                        = upd_dt                       ;
		this.delt_flg                      = delt_flg                     ;
		this.eai_evnt_dt                   = eai_evnt_dt                  ;
		this.mst_ofc_id                    = mst_ofc_id                   ;
		this.prnt_mofc_id                  = prnt_mofc_id                 ;
	}

	// getter method is proceeding ..
	public String                        getIbflag                       (){	return ibflag                       	;	}
	public String                        getPage_rows                    (){	return page_rows                    	;	}
	public String                        getOfc_cd                       (){	return ofc_cd                       	;	}
	public String                        getOfc_eng_nm                   (){	return ofc_eng_nm                   	;	}
	public String                        getOfc_krn_nm                   (){	return ofc_krn_nm                   	;	}
	public String                        getOfc_addr                     (){	return ofc_addr                     	;	}
	public String                        getOfc_zip_cd                   (){	return ofc_zip_cd                   	;	}
	public String                        getOfc_knd_cd                   (){	return ofc_knd_cd                   	;	}
	public String                        getAgn_knd_cd                   (){	return agn_knd_cd                   	;	}
	public String                        getVndr_cnt_cd                  (){	return vndr_cnt_cd                  	;	}
	public String                        getVndr_seq                     (){	return vndr_seq                     	;	}
	public String                        getIntl_phn_no                  (){	return intl_phn_no                  	;	}
	public String                        getOfc_phn_no                   (){	return ofc_phn_no                   	;	}
	public String                        getIntl_fax_no                  (){	return intl_fax_no                  	;	}
	public String                        getOfc_fax_no                   (){	return ofc_fax_no                   	;	}
	public String                        getOfc_pson_knt                 (){	return ofc_pson_knt                 	;	}
	public String                        getOfc_rmk                      (){	return ofc_rmk                      	;	}
	public String                        getLoc_cd                       (){	return loc_cd                       	;	}
	public String                        getBil_curr_cd                  (){	return bil_curr_cd                  	;	}
	public String                        getAr_curr_cd                   (){	return ar_curr_cd                   	;	}
	public String                        getAr_ctr_cd                    (){	return ar_ctr_cd                    	;	}
	public String                        getPrnt_ofc_cd                  (){	return prnt_ofc_cd                  	;	}
	public String                        getOpn_dt                       (){	return opn_dt                       	;	}
	public String                        getClz_dt                       (){	return clz_dt                       	;	}
	public String                        getFinc_rgn_cd                  (){	return finc_rgn_cd                  	;	}
	public String                        getAr_ofc_cd                    (){	return ar_ofc_cd                    	;	}
	public String                        getAr_ctrl_ofc_cd               (){	return ar_ctrl_ofc_cd               	;	}
	public String                        getAr_hd_qtr_ofc_cd             (){	return ar_hd_qtr_ofc_cd             	;	}
	public String                        getIb_cr_term_dys               (){	return ib_cr_term_dys               	;	}
	public String                        getOb_cr_term_dys               (){	return ob_cr_term_dys               	;	}
	public String                        getSub_agn_flg                  (){	return sub_agn_flg                  	;	}
	public String                        getRep_cust_cnt_cd              (){	return rep_cust_cnt_cd              	;	}
	public String                        getRep_cust_seq                 (){	return rep_cust_seq                 	;	}
	public String                        getInv_pfx_cd                   (){	return inv_pfx_cd                   	;	}
	public String                        getAp_ofc_cd                    (){	return ap_ofc_cd                    	;	}
	public String                        getAp_ctrl_ofc_cd               (){	return ap_ctrl_ofc_cd               	;	}
	public String                        getAp_ho_acct_cd                (){	return ap_ho_acct_cd                	;	}
	public String                        getAp_ctr_cd                    (){	return ap_ctr_cd                    	;	}
	public String                        getAr_agn_stl_cd                (){	return ar_agn_stl_cd                	;	}
	public String                        getFx_curr_rt                   (){	return fx_curr_rt                   	;	}
	public String                        getAp_euro_curr_use_flg         (){	return ap_euro_curr_use_flg         	;	}
	public String                        getUsa_brk_brnc_rqst_ctrl_ofc_cd(){	return usa_brk_brnc_rqst_ctrl_ofc_cd	;	}
	public String                        getAsa_cr_term_dys              (){	return asa_cr_term_dys              	;	}
	public String                        getSo_if_cd                     (){	return so_if_cd                     	;	}
	public String                        getSls_ofc_use_flg              (){	return sls_ofc_use_flg              	;	}
	public String                        getSls_ofc_div_cd               (){	return sls_ofc_div_cd               	;	}
	public String                        getOfc_tax_id                   (){	return ofc_tax_id                   	;	}
	public String                        getOfc_rfa_sc_use_flg           (){	return ofc_rfa_sc_use_flg           	;	}
	public String                        getComm_if_ind_cd               (){	return comm_if_ind_cd               	;	}
	public String                        getFax_ip                       (){	return fax_ip                       	;	}
	public String                        getBfr_ofc_cd                   (){	return bfr_ofc_cd                   	;	}
	public String                        getModi_ofc_cd                  (){	return modi_ofc_cd                  	;	}
	public String                        getOfc_cmmc_cd                  (){	return ofc_cmmc_cd                  	;	}
	public String                        getOfc_tp_cd                    (){	return ofc_tp_cd                    	;	}
	public String                        getPrc_ofc_cd                   (){	return prc_ofc_cd                   	;	}
	public String                        getOfc_url                      (){	return ofc_url                      	;	}
	public String                        getOfc_rep_eml                  (){	return ofc_rep_eml                  	;	}
	public String                        getBkg_svr_srch_rout_cd         (){	return bkg_svr_srch_rout_cd         	;	}
	public String                        getOfc_sls_delt_flg             (){	return ofc_sls_delt_flg             	;	}
	public String                        getDoc_rcvr_hide_flg            (){	return doc_rcvr_hide_flg            	;	}
	public String                        getFinc_hide_flg                (){	return finc_hide_flg                	;	}
	public String                        getFinc_psdo_ofc_flg            (){	return finc_psdo_ofc_flg            	;	}
	public String                        getSubs_co_flg                  (){	return subs_co_flg                  	;	}
	public String                        getGl_ctr_cd                    (){	return gl_ctr_cd                    	;	}
	public String                        getCre_usr_id                   (){	return cre_usr_id                   	;	}
	public String                        getCre_dt                       (){	return cre_dt                       	;	}
	public String                        getUpd_usr_id                   (){	return upd_usr_id                   	;	}
	public String                        getUpd_dt                       (){	return upd_dt                       	;	}
	public String                        getDelt_flg                     (){	return delt_flg                     	;	}
	public String                        getEai_evnt_dt                  (){	return eai_evnt_dt                  	;	}
	public String                        getMst_ofc_id                   (){	return mst_ofc_id                   	;	}
	public String                        getPrnt_mofc_id                 (){	return prnt_mofc_id                 	;	}

	// setter method is proceeding ..
	public void setIbflag                       ( String                        ibflag                        ){	this.ibflag                        = ibflag                       	;	}
	public void setPage_rows                    ( String                        page_rows                     ){	this.page_rows                     = page_rows                    	;	}
	public void setOfc_cd                       ( String                        ofc_cd                        ){	this.ofc_cd                        = ofc_cd                       	;	}
	public void setOfc_eng_nm                   ( String                        ofc_eng_nm                    ){	this.ofc_eng_nm                    = ofc_eng_nm                   	;	}
	public void setOfc_krn_nm                   ( String                        ofc_krn_nm                    ){	this.ofc_krn_nm                    = ofc_krn_nm                   	;	}
	public void setOfc_addr                     ( String                        ofc_addr                      ){	this.ofc_addr                      = ofc_addr                     	;	}
	public void setOfc_zip_cd                   ( String                        ofc_zip_cd                    ){	this.ofc_zip_cd                    = ofc_zip_cd                   	;	}
	public void setOfc_knd_cd                   ( String                        ofc_knd_cd                    ){	this.ofc_knd_cd                    = ofc_knd_cd                   	;	}
	public void setAgn_knd_cd                   ( String                        agn_knd_cd                    ){	this.agn_knd_cd                    = agn_knd_cd                   	;	}
	public void setVndr_cnt_cd                  ( String                        vndr_cnt_cd                   ){	this.vndr_cnt_cd                   = vndr_cnt_cd                  	;	}
	public void setVndr_seq                     ( String                        vndr_seq                      ){	this.vndr_seq                      = vndr_seq                     	;	}
	public void setIntl_phn_no                  ( String                        intl_phn_no                   ){	this.intl_phn_no                   = intl_phn_no                  	;	}
	public void setOfc_phn_no                   ( String                        ofc_phn_no                    ){	this.ofc_phn_no                    = ofc_phn_no                   	;	}
	public void setIntl_fax_no                  ( String                        intl_fax_no                   ){	this.intl_fax_no                   = intl_fax_no                  	;	}
	public void setOfc_fax_no                   ( String                        ofc_fax_no                    ){	this.ofc_fax_no                    = ofc_fax_no                   	;	}
	public void setOfc_pson_knt                 ( String                        ofc_pson_knt                  ){	this.ofc_pson_knt                  = ofc_pson_knt                 	;	}
	public void setOfc_rmk                      ( String                        ofc_rmk                       ){	this.ofc_rmk                       = ofc_rmk                      	;	}
	public void setLoc_cd                       ( String                        loc_cd                        ){	this.loc_cd                        = loc_cd                       	;	}
	public void setBil_curr_cd                  ( String                        bil_curr_cd                   ){	this.bil_curr_cd                   = bil_curr_cd                  	;	}
	public void setAr_curr_cd                   ( String                        ar_curr_cd                    ){	this.ar_curr_cd                    = ar_curr_cd                   	;	}
	public void setAr_ctr_cd                    ( String                        ar_ctr_cd                     ){	this.ar_ctr_cd                     = ar_ctr_cd                    	;	}
	public void setPrnt_ofc_cd                  ( String                        prnt_ofc_cd                   ){	this.prnt_ofc_cd                   = prnt_ofc_cd                  	;	}
	public void setOpn_dt                       ( String                        opn_dt                        ){	this.opn_dt                        = opn_dt                       	;	}
	public void setClz_dt                       ( String                        clz_dt                        ){	this.clz_dt                        = clz_dt                       	;	}
	public void setFinc_rgn_cd                  ( String                        finc_rgn_cd                   ){	this.finc_rgn_cd                   = finc_rgn_cd                  	;	}
	public void setAr_ofc_cd                    ( String                        ar_ofc_cd                     ){	this.ar_ofc_cd                     = ar_ofc_cd                    	;	}
	public void setAr_ctrl_ofc_cd               ( String                        ar_ctrl_ofc_cd                ){	this.ar_ctrl_ofc_cd                = ar_ctrl_ofc_cd               	;	}
	public void setAr_hd_qtr_ofc_cd             ( String                        ar_hd_qtr_ofc_cd              ){	this.ar_hd_qtr_ofc_cd              = ar_hd_qtr_ofc_cd             	;	}
	public void setIb_cr_term_dys               ( String                        ib_cr_term_dys                ){	this.ib_cr_term_dys                = ib_cr_term_dys               	;	}
	public void setOb_cr_term_dys               ( String                        ob_cr_term_dys                ){	this.ob_cr_term_dys                = ob_cr_term_dys               	;	}
	public void setSub_agn_flg                  ( String                        sub_agn_flg                   ){	this.sub_agn_flg                   = sub_agn_flg                  	;	}
	public void setRep_cust_cnt_cd              ( String                        rep_cust_cnt_cd               ){	this.rep_cust_cnt_cd               = rep_cust_cnt_cd              	;	}
	public void setRep_cust_seq                 ( String                        rep_cust_seq                  ){	this.rep_cust_seq                  = rep_cust_seq                 	;	}
	public void setInv_pfx_cd                   ( String                        inv_pfx_cd                    ){	this.inv_pfx_cd                    = inv_pfx_cd                   	;	}
	public void setAp_ofc_cd                    ( String                        ap_ofc_cd                     ){	this.ap_ofc_cd                     = ap_ofc_cd                    	;	}
	public void setAp_ctrl_ofc_cd               ( String                        ap_ctrl_ofc_cd                ){	this.ap_ctrl_ofc_cd                = ap_ctrl_ofc_cd               	;	}
	public void setAp_ho_acct_cd                ( String                        ap_ho_acct_cd                 ){	this.ap_ho_acct_cd                 = ap_ho_acct_cd                	;	}
	public void setAp_ctr_cd                    ( String                        ap_ctr_cd                     ){	this.ap_ctr_cd                     = ap_ctr_cd                    	;	}
	public void setAr_agn_stl_cd                ( String                        ar_agn_stl_cd                 ){	this.ar_agn_stl_cd                 = ar_agn_stl_cd                	;	}
	public void setFx_curr_rt                   ( String                        fx_curr_rt                    ){	this.fx_curr_rt                    = fx_curr_rt                   	;	}
	public void setAp_euro_curr_use_flg         ( String                        ap_euro_curr_use_flg          ){	this.ap_euro_curr_use_flg          = ap_euro_curr_use_flg         	;	}
	public void setUsa_brk_brnc_rqst_ctrl_ofc_cd( String                        usa_brk_brnc_rqst_ctrl_ofc_cd ){	this.usa_brk_brnc_rqst_ctrl_ofc_cd = usa_brk_brnc_rqst_ctrl_ofc_cd	;	}
	public void setAsa_cr_term_dys              ( String                        asa_cr_term_dys               ){	this.asa_cr_term_dys               = asa_cr_term_dys              	;	}
	public void setSo_if_cd                     ( String                        so_if_cd                      ){	this.so_if_cd                      = so_if_cd                     	;	}
	public void setSls_ofc_use_flg              ( String                        sls_ofc_use_flg               ){	this.sls_ofc_use_flg               = sls_ofc_use_flg              	;	}
	public void setSls_ofc_div_cd               ( String                        sls_ofc_div_cd                ){	this.sls_ofc_div_cd                = sls_ofc_div_cd               	;	}
	public void setOfc_tax_id                   ( String                        ofc_tax_id                    ){	this.ofc_tax_id                    = ofc_tax_id                   	;	}
	public void setOfc_rfa_sc_use_flg           ( String                        ofc_rfa_sc_use_flg            ){	this.ofc_rfa_sc_use_flg            = ofc_rfa_sc_use_flg           	;	}
	public void setComm_if_ind_cd               ( String                        comm_if_ind_cd                ){	this.comm_if_ind_cd                = comm_if_ind_cd               	;	}
	public void setFax_ip                       ( String                        fax_ip                        ){	this.fax_ip                        = fax_ip                       	;	}
	public void setBfr_ofc_cd                   ( String                        bfr_ofc_cd                    ){	this.bfr_ofc_cd                    = bfr_ofc_cd                   	;	}
	public void setModi_ofc_cd                  ( String                        modi_ofc_cd                   ){	this.modi_ofc_cd                   = modi_ofc_cd                  	;	}
	public void setOfc_cmmc_cd                  ( String                        ofc_cmmc_cd                   ){	this.ofc_cmmc_cd                   = ofc_cmmc_cd                  	;	}
	public void setOfc_tp_cd                    ( String                        ofc_tp_cd                     ){	this.ofc_tp_cd                     = ofc_tp_cd                    	;	}
	public void setPrc_ofc_cd                   ( String                        prc_ofc_cd                    ){	this.prc_ofc_cd                    = prc_ofc_cd                   	;	}
	public void setOfc_url                      ( String                        ofc_url                       ){	this.ofc_url                       = ofc_url                      	;	}
	public void setOfc_rep_eml                  ( String                        ofc_rep_eml                   ){	this.ofc_rep_eml                   = ofc_rep_eml                  	;	}
	public void setBkg_svr_srch_rout_cd         ( String                        bkg_svr_srch_rout_cd          ){	this.bkg_svr_srch_rout_cd          = bkg_svr_srch_rout_cd         	;	}
	public void setOfc_sls_delt_flg             ( String                        ofc_sls_delt_flg              ){	this.ofc_sls_delt_flg              = ofc_sls_delt_flg             	;	}
	public void setDoc_rcvr_hide_flg            ( String                        doc_rcvr_hide_flg             ){	this.doc_rcvr_hide_flg             = doc_rcvr_hide_flg            	;	}
	public void setFinc_hide_flg                ( String                        finc_hide_flg                 ){	this.finc_hide_flg                 = finc_hide_flg                	;	}
	public void setFinc_psdo_ofc_flg            ( String                        finc_psdo_ofc_flg             ){	this.finc_psdo_ofc_flg             = finc_psdo_ofc_flg            	;	}
	public void setSubs_co_flg                  ( String                        subs_co_flg                   ){	this.subs_co_flg                   = subs_co_flg                  	;	}
	public void setGl_ctr_cd                    ( String                        gl_ctr_cd                     ){	this.gl_ctr_cd                     = gl_ctr_cd                    	;	}
	public void setCre_usr_id                   ( String                        cre_usr_id                    ){	this.cre_usr_id                    = cre_usr_id                   	;	}
	public void setCre_dt                       ( String                        cre_dt                        ){	this.cre_dt                        = cre_dt                       	;	}
	public void setUpd_usr_id                   ( String                        upd_usr_id                    ){	this.upd_usr_id                    = upd_usr_id                   	;	}
	public void setUpd_dt                       ( String                        upd_dt                        ){	this.upd_dt                        = upd_dt                       	;	}
	public void setDelt_flg                     ( String                        delt_flg                      ){	this.delt_flg                      = delt_flg                     	;	}
	public void setEai_evnt_dt                  ( String                        eai_evnt_dt                   ){	this.eai_evnt_dt                   = eai_evnt_dt                  	;	}
	public void setMst_ofc_id                   ( String                        mst_ofc_id                    ){	this.mst_ofc_id                    = mst_ofc_id                   	;	}
	public void setPrnt_mofc_id                 ( String                        prnt_mofc_id                  ){	this.prnt_mofc_id                  = prnt_mofc_id                 	;	}

	public static MdmOrganization fromRequest(HttpServletRequest request) {
		MdmOrganization model = new MdmOrganization();
		try {
			model.setIbflag                       	(JSPUtil.getParameter(request, "ibflag                       		".trim(), ""));
			model.setPage_rows                    	(JSPUtil.getParameter(request, "page_rows                    		".trim(), ""));
			model.setOfc_cd                       	(JSPUtil.getParameter(request, "ofc_cd                       		".trim(), ""));
			model.setOfc_eng_nm                   	(JSPUtil.getParameter(request, "ofc_eng_nm                   		".trim(), ""));
			model.setOfc_krn_nm                   	(JSPUtil.getParameter(request, "ofc_krn_nm                   		".trim(), ""));
			model.setOfc_addr                     	(JSPUtil.getParameter(request, "ofc_addr                     		".trim(), ""));
			model.setOfc_zip_cd                   	(JSPUtil.getParameter(request, "ofc_zip_cd                   		".trim(), ""));
			model.setOfc_knd_cd                   	(JSPUtil.getParameter(request, "ofc_knd_cd                   		".trim(), ""));
			model.setAgn_knd_cd                   	(JSPUtil.getParameter(request, "agn_knd_cd                   		".trim(), ""));
			model.setVndr_cnt_cd                  	(JSPUtil.getParameter(request, "vndr_cnt_cd                  		".trim(), ""));
			model.setVndr_seq                     	(JSPUtil.getParameter(request, "vndr_seq                     		".trim(), ""));
			model.setIntl_phn_no                  	(JSPUtil.getParameter(request, "intl_phn_no                  		".trim(), ""));
			model.setOfc_phn_no                   	(JSPUtil.getParameter(request, "ofc_phn_no                   		".trim(), ""));
			model.setIntl_fax_no                  	(JSPUtil.getParameter(request, "intl_fax_no                  		".trim(), ""));
			model.setOfc_fax_no                   	(JSPUtil.getParameter(request, "ofc_fax_no                   		".trim(), ""));
			model.setOfc_pson_knt                 	(JSPUtil.getParameter(request, "ofc_pson_knt                 		".trim(), ""));
			model.setOfc_rmk                      	(JSPUtil.getParameter(request, "ofc_rmk                      		".trim(), ""));
			model.setLoc_cd                       	(JSPUtil.getParameter(request, "loc_cd                       		".trim(), ""));
			model.setBil_curr_cd                  	(JSPUtil.getParameter(request, "bil_curr_cd                  		".trim(), ""));
			model.setAr_curr_cd                   	(JSPUtil.getParameter(request, "ar_curr_cd                   		".trim(), ""));
			model.setAr_ctr_cd                    	(JSPUtil.getParameter(request, "ar_ctr_cd                    		".trim(), ""));
			model.setPrnt_ofc_cd                  	(JSPUtil.getParameter(request, "prnt_ofc_cd                  		".trim(), ""));
			model.setOpn_dt                       	(JSPUtil.getParameter(request, "opn_dt                       		".trim(), ""));
			model.setClz_dt                       	(JSPUtil.getParameter(request, "clz_dt                       		".trim(), ""));
			model.setFinc_rgn_cd                  	(JSPUtil.getParameter(request, "finc_rgn_cd                  		".trim(), ""));
			model.setAr_ofc_cd                    	(JSPUtil.getParameter(request, "ar_ofc_cd                    		".trim(), ""));
			model.setAr_ctrl_ofc_cd               	(JSPUtil.getParameter(request, "ar_ctrl_ofc_cd               		".trim(), ""));
			model.setAr_hd_qtr_ofc_cd             	(JSPUtil.getParameter(request, "ar_hd_qtr_ofc_cd             		".trim(), ""));
			model.setIb_cr_term_dys               	(JSPUtil.getParameter(request, "ib_cr_term_dys               		".trim(), ""));
			model.setOb_cr_term_dys               	(JSPUtil.getParameter(request, "ob_cr_term_dys               		".trim(), ""));
			model.setSub_agn_flg                  	(JSPUtil.getParameter(request, "sub_agn_flg                  		".trim(), ""));
			model.setRep_cust_cnt_cd              	(JSPUtil.getParameter(request, "rep_cust_cnt_cd              		".trim(), ""));
			model.setRep_cust_seq                 	(JSPUtil.getParameter(request, "rep_cust_seq                 		".trim(), ""));
			model.setInv_pfx_cd                   	(JSPUtil.getParameter(request, "inv_pfx_cd                   		".trim(), ""));
			model.setAp_ofc_cd                    	(JSPUtil.getParameter(request, "ap_ofc_cd                    		".trim(), ""));
			model.setAp_ctrl_ofc_cd               	(JSPUtil.getParameter(request, "ap_ctrl_ofc_cd               		".trim(), ""));
			model.setAp_ho_acct_cd                	(JSPUtil.getParameter(request, "ap_ho_acct_cd                		".trim(), ""));
			model.setAp_ctr_cd                    	(JSPUtil.getParameter(request, "ap_ctr_cd                    		".trim(), ""));
			model.setAr_agn_stl_cd                	(JSPUtil.getParameter(request, "ar_agn_stl_cd                		".trim(), ""));
			model.setFx_curr_rt                   	(JSPUtil.getParameter(request, "fx_curr_rt                   		".trim(), ""));
			model.setAp_euro_curr_use_flg         	(JSPUtil.getParameter(request, "ap_euro_curr_use_flg         		".trim(), ""));
			model.setUsa_brk_brnc_rqst_ctrl_ofc_cd	(JSPUtil.getParameter(request, "usa_brk_brnc_rqst_ctrl_ofc_cd		".trim(), ""));
			model.setAsa_cr_term_dys              	(JSPUtil.getParameter(request, "asa_cr_term_dys              		".trim(), ""));
			model.setSo_if_cd                     	(JSPUtil.getParameter(request, "so_if_cd                     		".trim(), ""));
			model.setSls_ofc_use_flg              	(JSPUtil.getParameter(request, "sls_ofc_use_flg              		".trim(), ""));
			model.setSls_ofc_div_cd               	(JSPUtil.getParameter(request, "sls_ofc_div_cd               		".trim(), ""));
			model.setOfc_tax_id                   	(JSPUtil.getParameter(request, "ofc_tax_id                   		".trim(), ""));
			model.setOfc_rfa_sc_use_flg           	(JSPUtil.getParameter(request, "ofc_rfa_sc_use_flg           		".trim(), ""));
			model.setComm_if_ind_cd               	(JSPUtil.getParameter(request, "comm_if_ind_cd               		".trim(), ""));
			model.setFax_ip                       	(JSPUtil.getParameter(request, "fax_ip                       		".trim(), ""));
			model.setBfr_ofc_cd                   	(JSPUtil.getParameter(request, "bfr_ofc_cd                   		".trim(), ""));
			model.setModi_ofc_cd                  	(JSPUtil.getParameter(request, "modi_ofc_cd                  		".trim(), ""));
			model.setOfc_cmmc_cd                  	(JSPUtil.getParameter(request, "ofc_cmmc_cd                  		".trim(), ""));
			model.setOfc_tp_cd                    	(JSPUtil.getParameter(request, "ofc_tp_cd                    		".trim(), ""));
			model.setPrc_ofc_cd                   	(JSPUtil.getParameter(request, "prc_ofc_cd                   		".trim(), ""));
			model.setOfc_url                      	(JSPUtil.getParameter(request, "ofc_url                      		".trim(), ""));
			model.setOfc_rep_eml                  	(JSPUtil.getParameter(request, "ofc_rep_eml                  		".trim(), ""));
			model.setBkg_svr_srch_rout_cd         	(JSPUtil.getParameter(request, "bkg_svr_srch_rout_cd         		".trim(), ""));
			model.setOfc_sls_delt_flg             	(JSPUtil.getParameter(request, "ofc_sls_delt_flg             		".trim(), ""));
			model.setDoc_rcvr_hide_flg            	(JSPUtil.getParameter(request, "doc_rcvr_hide_flg            		".trim(), ""));
			model.setFinc_hide_flg                	(JSPUtil.getParameter(request, "finc_hide_flg                		".trim(), ""));
			model.setFinc_psdo_ofc_flg            	(JSPUtil.getParameter(request, "finc_psdo_ofc_flg            		".trim(), ""));
			model.setSubs_co_flg                  	(JSPUtil.getParameter(request, "subs_co_flg                  		".trim(), ""));
			model.setGl_ctr_cd                    	(JSPUtil.getParameter(request, "gl_ctr_cd                    		".trim(), ""));
			model.setCre_usr_id                   	(JSPUtil.getParameter(request, "cre_usr_id                   		".trim(), ""));
			model.setCre_dt                       	(JSPUtil.getParameter(request, "cre_dt                       		".trim(), ""));
			model.setUpd_usr_id                   	(JSPUtil.getParameter(request, "upd_usr_id                   		".trim(), ""));
			model.setUpd_dt                       	(JSPUtil.getParameter(request, "upd_dt                       		".trim(), ""));
			model.setDelt_flg                     	(JSPUtil.getParameter(request, "delt_flg                     		".trim(), ""));
			model.setEai_evnt_dt                  	(JSPUtil.getParameter(request, "eai_evnt_dt                  		".trim(), ""));
			model.setMst_ofc_id                   	(JSPUtil.getParameter(request, "mst_ofc_id                   		".trim(), ""));
			model.setPrnt_mofc_id                 	(JSPUtil.getParameter(request, "prnt_mofc_id                 		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		MdmOrganization model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag                        =  (JSPUtil.getParameter(request, "ibflag                       		".trim(), length));
			String[] page_rows                     =  (JSPUtil.getParameter(request, "page_rows                    		".trim(), length));
			String[] ofc_cd                        =  (JSPUtil.getParameter(request, "ofc_cd                       		".trim(), length));
			String[] ofc_eng_nm                    =  (JSPUtil.getParameter(request, "ofc_eng_nm                   		".trim(), length));
			String[] ofc_krn_nm                    =  (JSPUtil.getParameter(request, "ofc_krn_nm                   		".trim(), length));
			String[] ofc_addr                      =  (JSPUtil.getParameter(request, "ofc_addr                     		".trim(), length));
			String[] ofc_zip_cd                    =  (JSPUtil.getParameter(request, "ofc_zip_cd                   		".trim(), length));
			String[] ofc_knd_cd                    =  (JSPUtil.getParameter(request, "ofc_knd_cd                   		".trim(), length));
			String[] agn_knd_cd                    =  (JSPUtil.getParameter(request, "agn_knd_cd                   		".trim(), length));
			String[] vndr_cnt_cd                   =  (JSPUtil.getParameter(request, "vndr_cnt_cd                  		".trim(), length));
			String[] vndr_seq                      =  (JSPUtil.getParameter(request, "vndr_seq                     		".trim(), length));
			String[] intl_phn_no                   =  (JSPUtil.getParameter(request, "intl_phn_no                  		".trim(), length));
			String[] ofc_phn_no                    =  (JSPUtil.getParameter(request, "ofc_phn_no                   		".trim(), length));
			String[] intl_fax_no                   =  (JSPUtil.getParameter(request, "intl_fax_no                  		".trim(), length));
			String[] ofc_fax_no                    =  (JSPUtil.getParameter(request, "ofc_fax_no                   		".trim(), length));
			String[] ofc_pson_knt                  =  (JSPUtil.getParameter(request, "ofc_pson_knt                 		".trim(), length));
			String[] ofc_rmk                       =  (JSPUtil.getParameter(request, "ofc_rmk                      		".trim(), length));
			String[] loc_cd                        =  (JSPUtil.getParameter(request, "loc_cd                       		".trim(), length));
			String[] bil_curr_cd                   =  (JSPUtil.getParameter(request, "bil_curr_cd                  		".trim(), length));
			String[] ar_curr_cd                    =  (JSPUtil.getParameter(request, "ar_curr_cd                   		".trim(), length));
			String[] ar_ctr_cd                     =  (JSPUtil.getParameter(request, "ar_ctr_cd                    		".trim(), length));
			String[] prnt_ofc_cd                   =  (JSPUtil.getParameter(request, "prnt_ofc_cd                  		".trim(), length));
			String[] opn_dt                        =  (JSPUtil.getParameter(request, "opn_dt                       		".trim(), length));
			String[] clz_dt                        =  (JSPUtil.getParameter(request, "clz_dt                       		".trim(), length));
			String[] finc_rgn_cd                   =  (JSPUtil.getParameter(request, "finc_rgn_cd                  		".trim(), length));
			String[] ar_ofc_cd                     =  (JSPUtil.getParameter(request, "ar_ofc_cd                    		".trim(), length));
			String[] ar_ctrl_ofc_cd                =  (JSPUtil.getParameter(request, "ar_ctrl_ofc_cd               		".trim(), length));
			String[] ar_hd_qtr_ofc_cd              =  (JSPUtil.getParameter(request, "ar_hd_qtr_ofc_cd             		".trim(), length));
			String[] ib_cr_term_dys                =  (JSPUtil.getParameter(request, "ib_cr_term_dys               		".trim(), length));
			String[] ob_cr_term_dys                =  (JSPUtil.getParameter(request, "ob_cr_term_dys               		".trim(), length));
			String[] sub_agn_flg                   =  (JSPUtil.getParameter(request, "sub_agn_flg                  		".trim(), length));
			String[] rep_cust_cnt_cd               =  (JSPUtil.getParameter(request, "rep_cust_cnt_cd              		".trim(), length));
			String[] rep_cust_seq                  =  (JSPUtil.getParameter(request, "rep_cust_seq                 		".trim(), length));
			String[] inv_pfx_cd                    =  (JSPUtil.getParameter(request, "inv_pfx_cd                   		".trim(), length));
			String[] ap_ofc_cd                     =  (JSPUtil.getParameter(request, "ap_ofc_cd                    		".trim(), length));
			String[] ap_ctrl_ofc_cd                =  (JSPUtil.getParameter(request, "ap_ctrl_ofc_cd               		".trim(), length));
			String[] ap_ho_acct_cd                 =  (JSPUtil.getParameter(request, "ap_ho_acct_cd                		".trim(), length));
			String[] ap_ctr_cd                     =  (JSPUtil.getParameter(request, "ap_ctr_cd                    		".trim(), length));
			String[] ar_agn_stl_cd                 =  (JSPUtil.getParameter(request, "ar_agn_stl_cd                		".trim(), length));
			String[] fx_curr_rt                    =  (JSPUtil.getParameter(request, "fx_curr_rt                   		".trim(), length));
			String[] ap_euro_curr_use_flg          =  (JSPUtil.getParameter(request, "ap_euro_curr_use_flg         		".trim(), length));
			String[] usa_brk_brnc_rqst_ctrl_ofc_cd =  (JSPUtil.getParameter(request, "usa_brk_brnc_rqst_ctrl_ofc_cd		".trim(), length));
			String[] asa_cr_term_dys               =  (JSPUtil.getParameter(request, "asa_cr_term_dys              		".trim(), length));
			String[] so_if_cd                      =  (JSPUtil.getParameter(request, "so_if_cd                     		".trim(), length));
			String[] sls_ofc_use_flg               =  (JSPUtil.getParameter(request, "sls_ofc_use_flg              		".trim(), length));
			String[] sls_ofc_div_cd                =  (JSPUtil.getParameter(request, "sls_ofc_div_cd               		".trim(), length));
			String[] ofc_tax_id                    =  (JSPUtil.getParameter(request, "ofc_tax_id                   		".trim(), length));
			String[] ofc_rfa_sc_use_flg            =  (JSPUtil.getParameter(request, "ofc_rfa_sc_use_flg           		".trim(), length));
			String[] comm_if_ind_cd                =  (JSPUtil.getParameter(request, "comm_if_ind_cd               		".trim(), length));
			String[] fax_ip                        =  (JSPUtil.getParameter(request, "fax_ip                       		".trim(), length));
			String[] bfr_ofc_cd                    =  (JSPUtil.getParameter(request, "bfr_ofc_cd                   		".trim(), length));
			String[] modi_ofc_cd                   =  (JSPUtil.getParameter(request, "modi_ofc_cd                  		".trim(), length));
			String[] ofc_cmmc_cd                   =  (JSPUtil.getParameter(request, "ofc_cmmc_cd                  		".trim(), length));
			String[] ofc_tp_cd                     =  (JSPUtil.getParameter(request, "ofc_tp_cd                    		".trim(), length));
			String[] prc_ofc_cd                    =  (JSPUtil.getParameter(request, "prc_ofc_cd                   		".trim(), length));
			String[] ofc_url                       =  (JSPUtil.getParameter(request, "ofc_url                      		".trim(), length));
			String[] ofc_rep_eml                   =  (JSPUtil.getParameter(request, "ofc_rep_eml                  		".trim(), length));
			String[] bkg_svr_srch_rout_cd          =  (JSPUtil.getParameter(request, "bkg_svr_srch_rout_cd         		".trim(), length));
			String[] ofc_sls_delt_flg              =  (JSPUtil.getParameter(request, "ofc_sls_delt_flg             		".trim(), length));
			String[] doc_rcvr_hide_flg             =  (JSPUtil.getParameter(request, "doc_rcvr_hide_flg            		".trim(), length));
			String[] finc_hide_flg                 =  (JSPUtil.getParameter(request, "finc_hide_flg                		".trim(), length));
			String[] finc_psdo_ofc_flg             =  (JSPUtil.getParameter(request, "finc_psdo_ofc_flg            		".trim(), length));
			String[] subs_co_flg                   =  (JSPUtil.getParameter(request, "subs_co_flg                  		".trim(), length));
			String[] gl_ctr_cd                     =  (JSPUtil.getParameter(request, "gl_ctr_cd                    		".trim(), length));
			String[] cre_usr_id                    =  (JSPUtil.getParameter(request, "cre_usr_id                   		".trim(), length));
			String[] cre_dt                        =  (JSPUtil.getParameter(request, "cre_dt                       		".trim(), length));
			String[] upd_usr_id                    =  (JSPUtil.getParameter(request, "upd_usr_id                   		".trim(), length));
			String[] upd_dt                        =  (JSPUtil.getParameter(request, "upd_dt                       		".trim(), length));
			String[] delt_flg                      =  (JSPUtil.getParameter(request, "delt_flg                     		".trim(), length));
			String[] eai_evnt_dt                   =  (JSPUtil.getParameter(request, "eai_evnt_dt                  		".trim(), length));
			String[] mst_ofc_id                    =  (JSPUtil.getParameter(request, "mst_ofc_id                   		".trim(), length));
			String[] prnt_mofc_id                  =  (JSPUtil.getParameter(request, "prnt_mofc_id                 		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new MdmOrganization();
				model.setIbflag                       		  (ibflag                       	[i]);
				model.setPage_rows                    		  (page_rows                    	[i]);
				model.setOfc_cd                       		  (ofc_cd                       	[i]);
				model.setOfc_eng_nm                   		  (ofc_eng_nm                   	[i]);
				model.setOfc_krn_nm                   		  (ofc_krn_nm                   	[i]);
				model.setOfc_addr                     		  (ofc_addr                     	[i]);
				model.setOfc_zip_cd                   		  (ofc_zip_cd                   	[i]);
				model.setOfc_knd_cd                   		  (ofc_knd_cd                   	[i]);
				model.setAgn_knd_cd                   		  (agn_knd_cd                   	[i]);
				model.setVndr_cnt_cd                  		  (vndr_cnt_cd                  	[i]);
				model.setVndr_seq                     		  (vndr_seq                     	[i]);
				model.setIntl_phn_no                  		  (intl_phn_no                  	[i]);
				model.setOfc_phn_no                   		  (ofc_phn_no                   	[i]);
				model.setIntl_fax_no                  		  (intl_fax_no                  	[i]);
				model.setOfc_fax_no                   		  (ofc_fax_no                   	[i]);
				model.setOfc_pson_knt                 		  (ofc_pson_knt                 	[i]);
				model.setOfc_rmk                      		  (ofc_rmk                      	[i]);
				model.setLoc_cd                       		  (loc_cd                       	[i]);
				model.setBil_curr_cd                  		  (bil_curr_cd                  	[i]);
				model.setAr_curr_cd                   		  (ar_curr_cd                   	[i]);
				model.setAr_ctr_cd                    		  (ar_ctr_cd                    	[i]);
				model.setPrnt_ofc_cd                  		  (prnt_ofc_cd                  	[i]);
				model.setOpn_dt                       		  (opn_dt                       	[i]);
				model.setClz_dt                       		  (clz_dt                       	[i]);
				model.setFinc_rgn_cd                  		  (finc_rgn_cd                  	[i]);
				model.setAr_ofc_cd                    		  (ar_ofc_cd                    	[i]);
				model.setAr_ctrl_ofc_cd               		  (ar_ctrl_ofc_cd               	[i]);
				model.setAr_hd_qtr_ofc_cd             		  (ar_hd_qtr_ofc_cd             	[i]);
				model.setIb_cr_term_dys               		  (ib_cr_term_dys               	[i]);
				model.setOb_cr_term_dys               		  (ob_cr_term_dys               	[i]);
				model.setSub_agn_flg                  		  (sub_agn_flg                  	[i]);
				model.setRep_cust_cnt_cd              		  (rep_cust_cnt_cd              	[i]);
				model.setRep_cust_seq                 		  (rep_cust_seq                 	[i]);
				model.setInv_pfx_cd                   		  (inv_pfx_cd                   	[i]);
				model.setAp_ofc_cd                    		  (ap_ofc_cd                    	[i]);
				model.setAp_ctrl_ofc_cd               		  (ap_ctrl_ofc_cd               	[i]);
				model.setAp_ho_acct_cd                		  (ap_ho_acct_cd                	[i]);
				model.setAp_ctr_cd                    		  (ap_ctr_cd                    	[i]);
				model.setAr_agn_stl_cd                		  (ar_agn_stl_cd                	[i]);
				model.setFx_curr_rt                   		  (fx_curr_rt                   	[i]);
				model.setAp_euro_curr_use_flg         		  (ap_euro_curr_use_flg         	[i]);
				model.setUsa_brk_brnc_rqst_ctrl_ofc_cd		  (usa_brk_brnc_rqst_ctrl_ofc_cd	[i]);
				model.setAsa_cr_term_dys              		  (asa_cr_term_dys              	[i]);
				model.setSo_if_cd                     		  (so_if_cd                     	[i]);
				model.setSls_ofc_use_flg              		  (sls_ofc_use_flg              	[i]);
				model.setSls_ofc_div_cd               		  (sls_ofc_div_cd               	[i]);
				model.setOfc_tax_id                   		  (ofc_tax_id                   	[i]);
				model.setOfc_rfa_sc_use_flg           		  (ofc_rfa_sc_use_flg           	[i]);
				model.setComm_if_ind_cd               		  (comm_if_ind_cd               	[i]);
				model.setFax_ip                       		  (fax_ip                       	[i]);
				model.setBfr_ofc_cd                   		  (bfr_ofc_cd                   	[i]);
				model.setModi_ofc_cd                  		  (modi_ofc_cd                  	[i]);
				model.setOfc_cmmc_cd                  		  (ofc_cmmc_cd                  	[i]);
				model.setOfc_tp_cd                    		  (ofc_tp_cd                    	[i]);
				model.setPrc_ofc_cd                   		  (prc_ofc_cd                   	[i]);
				model.setOfc_url                      		  (ofc_url                      	[i]);
				model.setOfc_rep_eml                  		  (ofc_rep_eml                  	[i]);
				model.setBkg_svr_srch_rout_cd         		  (bkg_svr_srch_rout_cd         	[i]);
				model.setOfc_sls_delt_flg             		  (ofc_sls_delt_flg             	[i]);
				model.setDoc_rcvr_hide_flg            		  (doc_rcvr_hide_flg            	[i]);
				model.setFinc_hide_flg                		  (finc_hide_flg                	[i]);
				model.setFinc_psdo_ofc_flg            		  (finc_psdo_ofc_flg            	[i]);
				model.setSubs_co_flg                  		  (subs_co_flg                  	[i]);
				model.setGl_ctr_cd                    		  (gl_ctr_cd                    	[i]);
				model.setCre_usr_id                   		  (cre_usr_id                   	[i]);
				model.setCre_dt                       		  (cre_dt                       	[i]);
				model.setUpd_usr_id                   		  (upd_usr_id                   	[i]);
				model.setUpd_dt                       		  (upd_dt                       	[i]);
				model.setDelt_flg                     		  (delt_flg                     	[i]);
				model.setEai_evnt_dt                  		  (eai_evnt_dt                  	[i]);
				model.setMst_ofc_id                   		  (mst_ofc_id                   	[i]);
				model.setPrnt_mofc_id                 		  (prnt_mofc_id                 	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		MdmOrganization model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues(prefix+"ibflag")==null?0:request.getParameterValues(prefix+"ibflag").length;
		try {
			String[] ibflag                        =  (JSPUtil.getParameter(request, prefix + "ibflag                       		".trim(), length));
			String[] page_rows                     =  (JSPUtil.getParameter(request, prefix + "page_rows                    		".trim(), length));
			String[] ofc_cd                        =  (JSPUtil.getParameter(request, prefix + "ofc_cd                       		".trim(), length));
			String[] ofc_eng_nm                    =  (JSPUtil.getParameter(request, prefix + "ofc_eng_nm                   		".trim(), length));
			String[] ofc_krn_nm                    =  (JSPUtil.getParameter(request, prefix + "ofc_krn_nm                   		".trim(), length));
			String[] ofc_addr                      =  (JSPUtil.getParameter(request, prefix + "ofc_addr                     		".trim(), length));
			String[] ofc_zip_cd                    =  (JSPUtil.getParameter(request, prefix + "ofc_zip_cd                   		".trim(), length));
			String[] ofc_knd_cd                    =  (JSPUtil.getParameter(request, prefix + "ofc_knd_cd                   		".trim(), length));
			String[] agn_knd_cd                    =  (JSPUtil.getParameter(request, prefix + "agn_knd_cd                   		".trim(), length));
			String[] vndr_cnt_cd                   =  (JSPUtil.getParameter(request, prefix + "vndr_cnt_cd                  		".trim(), length));
			String[] vndr_seq                      =  (JSPUtil.getParameter(request, prefix + "vndr_seq                     		".trim(), length));
			String[] intl_phn_no                   =  (JSPUtil.getParameter(request, prefix + "intl_phn_no                  		".trim(), length));
			String[] ofc_phn_no                    =  (JSPUtil.getParameter(request, prefix + "ofc_phn_no                   		".trim(), length));
			String[] intl_fax_no                   =  (JSPUtil.getParameter(request, prefix + "intl_fax_no                  		".trim(), length));
			String[] ofc_fax_no                    =  (JSPUtil.getParameter(request, prefix + "ofc_fax_no                   		".trim(), length));
			String[] ofc_pson_knt                  =  (JSPUtil.getParameter(request, prefix + "ofc_pson_knt                 		".trim(), length));
			String[] ofc_rmk                       =  (JSPUtil.getParameter(request, prefix + "ofc_rmk                      		".trim(), length));
			String[] loc_cd                        =  (JSPUtil.getParameter(request, prefix + "loc_cd                       		".trim(), length));
			String[] bil_curr_cd                   =  (JSPUtil.getParameter(request, prefix + "bil_curr_cd                  		".trim(), length));
			String[] ar_curr_cd                    =  (JSPUtil.getParameter(request, prefix + "ar_curr_cd                   		".trim(), length));
			String[] ar_ctr_cd                     =  (JSPUtil.getParameter(request, prefix + "ar_ctr_cd                    		".trim(), length));
			String[] prnt_ofc_cd                   =  (JSPUtil.getParameter(request, prefix + "prnt_ofc_cd                  		".trim(), length));
			String[] opn_dt                        =  (JSPUtil.getParameter(request, prefix + "opn_dt                       		".trim(), length));
			String[] clz_dt                        =  (JSPUtil.getParameter(request, prefix + "clz_dt                       		".trim(), length));
			String[] finc_rgn_cd                   =  (JSPUtil.getParameter(request, prefix + "finc_rgn_cd                  		".trim(), length));
			String[] ar_ofc_cd                     =  (JSPUtil.getParameter(request, prefix + "ar_ofc_cd                    		".trim(), length));
			String[] ar_ctrl_ofc_cd                =  (JSPUtil.getParameter(request, prefix + "ar_ctrl_ofc_cd               		".trim(), length));
			String[] ar_hd_qtr_ofc_cd              =  (JSPUtil.getParameter(request, prefix + "ar_hd_qtr_ofc_cd             		".trim(), length));
			String[] ib_cr_term_dys                =  (JSPUtil.getParameter(request, prefix + "ib_cr_term_dys               		".trim(), length));
			String[] ob_cr_term_dys                =  (JSPUtil.getParameter(request, prefix + "ob_cr_term_dys               		".trim(), length));
			String[] sub_agn_flg                   =  (JSPUtil.getParameter(request, prefix + "sub_agn_flg                  		".trim(), length));
			String[] rep_cust_cnt_cd               =  (JSPUtil.getParameter(request, prefix + "rep_cust_cnt_cd              		".trim(), length));
			String[] rep_cust_seq                  =  (JSPUtil.getParameter(request, prefix + "rep_cust_seq                 		".trim(), length));
			String[] inv_pfx_cd                    =  (JSPUtil.getParameter(request, prefix + "inv_pfx_cd                   		".trim(), length));
			String[] ap_ofc_cd                     =  (JSPUtil.getParameter(request, prefix + "ap_ofc_cd                    		".trim(), length));
			String[] ap_ctrl_ofc_cd                =  (JSPUtil.getParameter(request, prefix + "ap_ctrl_ofc_cd               		".trim(), length));
			String[] ap_ho_acct_cd                 =  (JSPUtil.getParameter(request, prefix + "ap_ho_acct_cd                		".trim(), length));
			String[] ap_ctr_cd                     =  (JSPUtil.getParameter(request, prefix + "ap_ctr_cd                    		".trim(), length));
			String[] ar_agn_stl_cd                 =  (JSPUtil.getParameter(request, prefix + "ar_agn_stl_cd                		".trim(), length));
			String[] fx_curr_rt                    =  (JSPUtil.getParameter(request, prefix + "fx_curr_rt                   		".trim(), length));
			String[] ap_euro_curr_use_flg          =  (JSPUtil.getParameter(request, prefix + "ap_euro_curr_use_flg         		".trim(), length));
			String[] usa_brk_brnc_rqst_ctrl_ofc_cd =  (JSPUtil.getParameter(request, prefix + "usa_brk_brnc_rqst_ctrl_ofc_cd		".trim(), length));
			String[] asa_cr_term_dys               =  (JSPUtil.getParameter(request, prefix + "asa_cr_term_dys              		".trim(), length));
			String[] so_if_cd                      =  (JSPUtil.getParameter(request, prefix + "so_if_cd                     		".trim(), length));
			String[] sls_ofc_use_flg               =  (JSPUtil.getParameter(request, prefix + "sls_ofc_use_flg              		".trim(), length));
			String[] sls_ofc_div_cd                =  (JSPUtil.getParameter(request, prefix + "sls_ofc_div_cd               		".trim(), length));
			String[] ofc_tax_id                    =  (JSPUtil.getParameter(request, prefix + "ofc_tax_id                   		".trim(), length));
			String[] ofc_rfa_sc_use_flg            =  (JSPUtil.getParameter(request, prefix + "ofc_rfa_sc_use_flg           		".trim(), length));
			String[] comm_if_ind_cd                =  (JSPUtil.getParameter(request, prefix + "comm_if_ind_cd               		".trim(), length));
			String[] fax_ip                        =  (JSPUtil.getParameter(request, prefix + "fax_ip                       		".trim(), length));
			String[] bfr_ofc_cd                    =  (JSPUtil.getParameter(request, prefix + "bfr_ofc_cd                   		".trim(), length));
			String[] modi_ofc_cd                   =  (JSPUtil.getParameter(request, prefix + "modi_ofc_cd                  		".trim(), length));
			String[] ofc_cmmc_cd                   =  (JSPUtil.getParameter(request, prefix + "ofc_cmmc_cd                  		".trim(), length));
			String[] ofc_tp_cd                     =  (JSPUtil.getParameter(request, prefix + "ofc_tp_cd                    		".trim(), length));
			String[] prc_ofc_cd                    =  (JSPUtil.getParameter(request, prefix + "prc_ofc_cd                   		".trim(), length));
			String[] ofc_url                       =  (JSPUtil.getParameter(request, prefix + "ofc_url                      		".trim(), length));
			String[] ofc_rep_eml                   =  (JSPUtil.getParameter(request, prefix + "ofc_rep_eml                  		".trim(), length));
			String[] bkg_svr_srch_rout_cd          =  (JSPUtil.getParameter(request, prefix + "bkg_svr_srch_rout_cd         		".trim(), length));
			String[] ofc_sls_delt_flg              =  (JSPUtil.getParameter(request, prefix + "ofc_sls_delt_flg             		".trim(), length));
			String[] doc_rcvr_hide_flg             =  (JSPUtil.getParameter(request, prefix + "doc_rcvr_hide_flg            		".trim(), length));
			String[] finc_hide_flg                 =  (JSPUtil.getParameter(request, prefix + "finc_hide_flg                		".trim(), length));
			String[] finc_psdo_ofc_flg             =  (JSPUtil.getParameter(request, prefix + "finc_psdo_ofc_flg            		".trim(), length));
			String[] subs_co_flg                   =  (JSPUtil.getParameter(request, prefix + "subs_co_flg                  		".trim(), length));
			String[] gl_ctr_cd                     =  (JSPUtil.getParameter(request, prefix + "gl_ctr_cd                    		".trim(), length));
			String[] cre_usr_id                    =  (JSPUtil.getParameter(request, prefix + "cre_usr_id                   		".trim(), length));
			String[] cre_dt                        =  (JSPUtil.getParameter(request, prefix + "cre_dt                       		".trim(), length));
			String[] upd_usr_id                    =  (JSPUtil.getParameter(request, prefix + "upd_usr_id                   		".trim(), length));
			String[] upd_dt                        =  (JSPUtil.getParameter(request, prefix + "upd_dt                       		".trim(), length));
			String[] delt_flg                      =  (JSPUtil.getParameter(request, prefix + "delt_flg                     		".trim(), length));
			String[] eai_evnt_dt                   =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt                  		".trim(), length));
			String[] mst_ofc_id                    =  (JSPUtil.getParameter(request, prefix + "mst_ofc_id                   		".trim(), length));
			String[] prnt_mofc_id                  =  (JSPUtil.getParameter(request, prefix + "prnt_mofc_id                 		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new MdmOrganization();
				model.setIbflag                       		  ( ibflag                       	[i]);
				model.setPage_rows                    		  ( page_rows                    	[i]);
				model.setOfc_cd                       		  ( ofc_cd                       	[i]);
				model.setOfc_eng_nm                   		  ( ofc_eng_nm                   	[i]);
				model.setOfc_krn_nm                   		  ( ofc_krn_nm                   	[i]);
				model.setOfc_addr                     		  ( ofc_addr                     	[i]);
				model.setOfc_zip_cd                   		  ( ofc_zip_cd                   	[i]);
				model.setOfc_knd_cd                   		  ( ofc_knd_cd                   	[i]);
				model.setAgn_knd_cd                   		  ( agn_knd_cd                   	[i]);
				model.setVndr_cnt_cd                  		  ( vndr_cnt_cd                  	[i]);
				model.setVndr_seq                     		  ( vndr_seq                     	[i]);
				model.setIntl_phn_no                  		  ( intl_phn_no                  	[i]);
				model.setOfc_phn_no                   		  ( ofc_phn_no                   	[i]);
				model.setIntl_fax_no                  		  ( intl_fax_no                  	[i]);
				model.setOfc_fax_no                   		  ( ofc_fax_no                   	[i]);
				model.setOfc_pson_knt                 		  ( ofc_pson_knt                 	[i]);
				model.setOfc_rmk                      		  ( ofc_rmk                      	[i]);
				model.setLoc_cd                       		  ( loc_cd                       	[i]);
				model.setBil_curr_cd                  		  ( bil_curr_cd                  	[i]);
				model.setAr_curr_cd                   		  ( ar_curr_cd                   	[i]);
				model.setAr_ctr_cd                    		  ( ar_ctr_cd                    	[i]);
				model.setPrnt_ofc_cd                  		  ( prnt_ofc_cd                  	[i]);
				model.setOpn_dt                       		  ( opn_dt                       	[i]);
				model.setClz_dt                       		  ( clz_dt                       	[i]);
				model.setFinc_rgn_cd                  		  ( finc_rgn_cd                  	[i]);
				model.setAr_ofc_cd                    		  ( ar_ofc_cd                    	[i]);
				model.setAr_ctrl_ofc_cd               		  ( ar_ctrl_ofc_cd               	[i]);
				model.setAr_hd_qtr_ofc_cd             		  ( ar_hd_qtr_ofc_cd             	[i]);
				model.setIb_cr_term_dys               		  ( ib_cr_term_dys               	[i]);
				model.setOb_cr_term_dys               		  ( ob_cr_term_dys               	[i]);
				model.setSub_agn_flg                  		  ( sub_agn_flg                  	[i]);
				model.setRep_cust_cnt_cd              		  ( rep_cust_cnt_cd              	[i]);
				model.setRep_cust_seq                 		  ( rep_cust_seq                 	[i]);
				model.setInv_pfx_cd                   		  ( inv_pfx_cd                   	[i]);
				model.setAp_ofc_cd                    		  ( ap_ofc_cd                    	[i]);
				model.setAp_ctrl_ofc_cd               		  ( ap_ctrl_ofc_cd               	[i]);
				model.setAp_ho_acct_cd                		  ( ap_ho_acct_cd                	[i]);
				model.setAp_ctr_cd                    		  ( ap_ctr_cd                    	[i]);
				model.setAr_agn_stl_cd                		  ( ar_agn_stl_cd                	[i]);
				model.setFx_curr_rt                   		  ( fx_curr_rt                   	[i]);
				model.setAp_euro_curr_use_flg         		  ( ap_euro_curr_use_flg         	[i]);
				model.setUsa_brk_brnc_rqst_ctrl_ofc_cd		  ( usa_brk_brnc_rqst_ctrl_ofc_cd	[i]);
				model.setAsa_cr_term_dys              		  ( asa_cr_term_dys              	[i]);
				model.setSo_if_cd                     		  ( so_if_cd                     	[i]);
				model.setSls_ofc_use_flg              		  ( sls_ofc_use_flg              	[i]);
				model.setSls_ofc_div_cd               		  ( sls_ofc_div_cd               	[i]);
				model.setOfc_tax_id                   		  ( ofc_tax_id                   	[i]);
				model.setOfc_rfa_sc_use_flg           		  ( ofc_rfa_sc_use_flg           	[i]);
				model.setComm_if_ind_cd               		  ( comm_if_ind_cd               	[i]);
				model.setFax_ip                       		  ( fax_ip                       	[i]);
				model.setBfr_ofc_cd                   		  ( bfr_ofc_cd                   	[i]);
				model.setModi_ofc_cd                  		  ( modi_ofc_cd                  	[i]);
				model.setOfc_cmmc_cd                  		  ( ofc_cmmc_cd                  	[i]);
				model.setOfc_tp_cd                    		  ( ofc_tp_cd                    	[i]);
				model.setPrc_ofc_cd                   		  ( prc_ofc_cd                   	[i]);
				model.setOfc_url                      		  ( ofc_url                      	[i]);
				model.setOfc_rep_eml                  		  ( ofc_rep_eml                  	[i]);
				model.setBkg_svr_srch_rout_cd         		  ( bkg_svr_srch_rout_cd         	[i]);
				model.setOfc_sls_delt_flg             		  ( ofc_sls_delt_flg             	[i]);
				model.setDoc_rcvr_hide_flg            		  ( doc_rcvr_hide_flg            	[i]);
				model.setFinc_hide_flg                		  ( finc_hide_flg                	[i]);
				model.setFinc_psdo_ofc_flg            		  ( finc_psdo_ofc_flg            	[i]);
				model.setSubs_co_flg                  		  ( subs_co_flg                  	[i]);
				model.setGl_ctr_cd                    		  ( gl_ctr_cd                    	[i]);
				model.setCre_usr_id                   		  ( cre_usr_id                   	[i]);
				model.setCre_dt                       		  ( cre_dt                       	[i]);
				model.setUpd_usr_id                   		  ( upd_usr_id                   	[i]);
				model.setUpd_dt                       		  ( upd_dt                       	[i]);
				model.setDelt_flg                     		  ( delt_flg                     	[i]);
				model.setEai_evnt_dt                  		  ( eai_evnt_dt                  	[i]);
				model.setMst_ofc_id                   		  ( mst_ofc_id                   	[i]);
				model.setPrnt_mofc_id                 		  ( prnt_mofc_id                 	[i]);
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
