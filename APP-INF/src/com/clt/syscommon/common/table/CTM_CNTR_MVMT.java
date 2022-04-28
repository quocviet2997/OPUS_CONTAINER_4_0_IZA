/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : CTM_CNTR_MVMT.java
*@FileTitle : 사용자 관리5
*Open Issues :
*Change history :
*@LastModifyDate : 2007-01-26
*@LastModifier : Kildong_hong6
*@LastVersion : 1.0
* 2007-01-26 Kildong_hong6
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
public final class CTM_CNTR_MVMT implements java.io.Serializable {

	private String            ibflag            = "";
	private String            page_rows         = "";
	private String            cntr_no           = "";
	private String            cnmv_yr           = "";
	private String            cnmv_id_no        = "";
	private String            cnmv_seq          = "";
	private String            cnmv_split_cd     = "";
	private String            cntr_tpsz_cd      = "";
	private String            cnmv_cyc_no       = "";
	private String            cnmv_sts_cd       = "";
	private String            cnmv_lvl_no       = "";
	private String            cnmv_evnt_dt      = "";
	private String            org_yd_cd         = "";
	private String            dest_yd_cd        = "";
	private String            inp_yd_cd         = "";
	private String            fdr_vsl_cd        = "";
	private String            fdr_skd_voy_no    = "";
	private String            fdr_skd_dir_cd    = "";
	private String            trnk_vsl_cd       = "";
	private String            trnk_skd_voy_no   = "";
	private String            trnk_skd_dir_cd   = "";
	private String            chss_no           = "";
	private String            cntr_seal_no      = "";
	private String            cntr_cgo_tp_cd    = "";
	private String            cntr_dmg_flg      = "";
	private String            fcntr_flg         = "";
	private String            ob_cntr_flg       = "";
	private String            rcv_term_cd       = "";
	private String            vndr_cnt_cd       = "";
	private String            vndr_seq          = "";
	private String            trsp_mod_cd       = "";
	private String            loc_cd            = "";
	private String            cnmv_rmk          = "";
	private String            usr_nm            = "";
	private String            cre_tp_cd         = "";
	private String            n1st_cost_cd      = "";
	private String            n2nd_cost_cd      = "";
	private String            n3rd_cost_cd      = "";
	private String            subst_rule_cd     = "";
	private String            spcl_cgo_flg      = "";
	private String            bkg_knt           = "";
	private String            bkg_no            = "";
	private String            bkg_no_split      = "";
	private String            upd_dt            = "";
	private String            cre_dt            = "";
	private String            cre_usr_id        = "";
	private String            cntr_hngr_rck_flg = "";
	private String            cntr_act_cd       = "";
	private String            cntr_rfub_flg     = "";
	private String            cntr_disp_flg     = "";
	private String            imdt_ext_flg      = "";
	private String            cntr_xch_flg      = "";
	private String            inlnd_trsp_lic_no = "";
	private String            tt_flg            = "";
	private String            ctrt_ofc_cty_cd   = "";
	private String            ctrt_seq          = "";
	private String            gmt_dt            = "";
	private String            edi_tp_cd         = "";
	private String            edi_msg_tp_cd     = "";
	private String            edi_msg_area_cd   = "";
	private String            edi_msg_yrmondy   = "";
	private String            edi_msg_seq       = "";
	private String            fcar_no           = "";
	private String            wbl_no            = "";
	private String            pkup_no           = "";
	private String            n4th_cost_cd      = "";
	private String            cnmv_cyc_flg      = "";
	private String            trn_no            = "";
	private String            chss_seq          = "";
	private String            nis_evnt_dt       = "";
	private String            cntr_mv_flg       = "";
	private String            eai_evnt_dt       = "";
	
	//추가 20070430
	private String			  cnmv_co_cd		= "";

	public CTM_CNTR_MVMT(){}

	public CTM_CNTR_MVMT(
			String            ibflag           ,
			String            page_rows        ,
			String            cntr_no          ,
			String            cnmv_yr          ,
			String            cnmv_id_no       ,
			String            cnmv_seq         ,
			String            cnmv_split_cd    ,
			String            cntr_tpsz_cd     ,
			String            cnmv_cyc_no      ,
			String            cnmv_sts_cd      ,
			String            cnmv_lvl_no      ,
			String            cnmv_evnt_dt     ,
			String            org_yd_cd        ,
			String            dest_yd_cd       ,
			String            inp_yd_cd        ,
			String            fdr_vsl_cd       ,
			String            fdr_skd_voy_no   ,
			String            fdr_skd_dir_cd   ,
			String            trnk_vsl_cd      ,
			String            trnk_skd_voy_no  ,
			String            trnk_skd_dir_cd  ,
			String            chss_no          ,
			String            cntr_seal_no     ,
			String            cntr_cgo_tp_cd   ,
			String            cntr_dmg_flg     ,
			String            fcntr_flg        ,
			String            ob_cntr_flg      ,
			String            rcv_term_cd      ,
			String            vndr_cnt_cd      ,
			String            vndr_seq         ,
			String            trsp_mod_cd      ,
			String            loc_cd           ,
			String            cnmv_rmk         ,
			String            usr_nm           ,
			String            cre_tp_cd        ,
			String            n1st_cost_cd     ,
			String            n2nd_cost_cd     ,
			String            n3rd_cost_cd     ,
			String            subst_rule_cd    ,
			String            spcl_cgo_flg     ,
			String            bkg_knt          ,
			String            bkg_no           ,
			String            bkg_no_split     ,
			String            upd_dt           ,
			String            cre_dt           ,
			String            cre_usr_id       ,
			String            cntr_hngr_rck_flg,
			String            cntr_act_cd      ,
			String            cntr_rfub_flg    ,
			String            cntr_disp_flg    ,
			String            imdt_ext_flg     ,
			String            cntr_xch_flg     ,
			String            inlnd_trsp_lic_no,
			String            tt_flg           ,
			String            ctrt_ofc_cty_cd  ,
			String            ctrt_seq         ,
			String            gmt_dt           ,
			String            edi_tp_cd        ,
			String            edi_msg_tp_cd    ,
			String            edi_msg_area_cd  ,
			String            edi_msg_yrmondy  ,
			String            edi_msg_seq      ,
			String            fcar_no          ,
			String            wbl_no           ,
			String            pkup_no          ,
			String            n4th_cost_cd     ,
			String            cnmv_cyc_flg     ,
			String            trn_no           ,
			String            chss_seq         ,
			String            nis_evnt_dt      ,
			String            cntr_mv_flg      ,
			String            eai_evnt_dt      ,
			String			  cnmv_co_cd		){
		this.ibflag            = ibflag           ;
		this.page_rows         = page_rows        ;
		this.cntr_no           = cntr_no          ;
		this.cnmv_yr           = cnmv_yr          ;
		this.cnmv_id_no        = cnmv_id_no       ;
		this.cnmv_seq          = cnmv_seq         ;
		this.cnmv_split_cd     = cnmv_split_cd    ;
		this.cntr_tpsz_cd      = cntr_tpsz_cd     ;
		this.cnmv_cyc_no       = cnmv_cyc_no      ;
		this.cnmv_sts_cd       = cnmv_sts_cd      ;
		this.cnmv_lvl_no       = cnmv_lvl_no      ;
		this.cnmv_evnt_dt      = cnmv_evnt_dt     ;
		this.org_yd_cd         = org_yd_cd        ;
		this.dest_yd_cd        = dest_yd_cd       ;
		this.inp_yd_cd         = inp_yd_cd        ;
		this.fdr_vsl_cd        = fdr_vsl_cd       ;
		this.fdr_skd_voy_no    = fdr_skd_voy_no   ;
		this.fdr_skd_dir_cd    = fdr_skd_dir_cd   ;
		this.trnk_vsl_cd       = trnk_vsl_cd      ;
		this.trnk_skd_voy_no   = trnk_skd_voy_no  ;
		this.trnk_skd_dir_cd   = trnk_skd_dir_cd  ;
		this.chss_no           = chss_no          ;
		this.cntr_seal_no      = cntr_seal_no     ;
		this.cntr_cgo_tp_cd    = cntr_cgo_tp_cd   ;
		this.cntr_dmg_flg      = cntr_dmg_flg     ;
		this.fcntr_flg         = fcntr_flg        ;
		this.ob_cntr_flg       = ob_cntr_flg      ;
		this.rcv_term_cd       = rcv_term_cd      ;
		this.vndr_cnt_cd       = vndr_cnt_cd      ;
		this.vndr_seq          = vndr_seq         ;
		this.trsp_mod_cd       = trsp_mod_cd      ;
		this.loc_cd            = loc_cd           ;
		this.cnmv_rmk          = cnmv_rmk         ;
		this.usr_nm            = usr_nm           ;
		this.cre_tp_cd         = cre_tp_cd        ;
		this.n1st_cost_cd      = n1st_cost_cd     ;
		this.n2nd_cost_cd      = n2nd_cost_cd     ;
		this.n3rd_cost_cd      = n3rd_cost_cd     ;
		this.subst_rule_cd     = subst_rule_cd    ;
		this.spcl_cgo_flg      = spcl_cgo_flg     ;
		this.bkg_knt           = bkg_knt          ;
		this.bkg_no            = bkg_no           ;
		this.bkg_no_split      = bkg_no_split     ;
		this.upd_dt            = upd_dt           ;
		this.cre_dt            = cre_dt           ;
		this.cre_usr_id        = cre_usr_id       ;
		this.cntr_hngr_rck_flg = cntr_hngr_rck_flg;
		this.cntr_act_cd       = cntr_act_cd      ;
		this.cntr_rfub_flg     = cntr_rfub_flg    ;
		this.cntr_disp_flg     = cntr_disp_flg    ;
		this.imdt_ext_flg      = imdt_ext_flg     ;
		this.cntr_xch_flg      = cntr_xch_flg     ;
		this.inlnd_trsp_lic_no = inlnd_trsp_lic_no;
		this.tt_flg            = tt_flg           ;
		this.ctrt_ofc_cty_cd   = ctrt_ofc_cty_cd  ;
		this.ctrt_seq          = ctrt_seq         ;
		this.gmt_dt            = gmt_dt           ;
		this.edi_tp_cd         = edi_tp_cd        ;
		this.edi_msg_tp_cd     = edi_msg_tp_cd    ;
		this.edi_msg_area_cd   = edi_msg_area_cd  ;
		this.edi_msg_yrmondy   = edi_msg_yrmondy  ;
		this.edi_msg_seq       = edi_msg_seq      ;
		this.fcar_no           = fcar_no          ;
		this.wbl_no            = wbl_no           ;
		this.pkup_no           = pkup_no          ;
		this.n4th_cost_cd      = n4th_cost_cd     ;
		this.cnmv_cyc_flg      = cnmv_cyc_flg     ;
		this.trn_no            = trn_no           ;
		this.chss_seq          = chss_seq         ;
		this.nis_evnt_dt       = nis_evnt_dt      ;
		this.cntr_mv_flg       = cntr_mv_flg      ;
		this.eai_evnt_dt       = eai_evnt_dt      ;
		this.cnmv_co_cd		   = cnmv_co_cd		  ;
	}

	// getter method is proceeding ..
	public String            getIbflag           (){	return ibflag           	;	}
	public String            getPage_rows        (){	return page_rows        	;	}
	public String            getCntr_no          (){	return cntr_no          	;	}
	public String            getCnmv_yr          (){	return cnmv_yr          	;	}
	public String            getCnmv_id_no       (){	return cnmv_id_no       	;	}
	public String            getCnmv_seq         (){	return cnmv_seq         	;	}
	public String            getCnmv_split_cd    (){	return cnmv_split_cd    	;	}
	public String            getCntr_tpsz_cd     (){	return cntr_tpsz_cd     	;	}
	public String            getCnmv_cyc_no      (){	return cnmv_cyc_no      	;	}
	public String            getCnmv_sts_cd      (){	return cnmv_sts_cd      	;	}
	public String            getCnmv_lvl_no      (){	return cnmv_lvl_no      	;	}
	public String            getCnmv_evnt_dt     (){	return cnmv_evnt_dt     	;	}
	public String            getOrg_yd_cd        (){	return org_yd_cd        	;	}
	public String            getDest_yd_cd       (){	return dest_yd_cd       	;	}
	public String            getInp_yd_cd        (){	return inp_yd_cd        	;	}
	public String            getFdr_vsl_cd       (){	return fdr_vsl_cd       	;	}
	public String            getFdr_skd_voy_no   (){	return fdr_skd_voy_no   	;	}
	public String            getFdr_skd_dir_cd   (){	return fdr_skd_dir_cd   	;	}
	public String            getTrnk_vsl_cd      (){	return trnk_vsl_cd      	;	}
	public String            getTrnk_skd_voy_no  (){	return trnk_skd_voy_no  	;	}
	public String            getTrnk_skd_dir_cd  (){	return trnk_skd_dir_cd  	;	}
	public String            getChss_no          (){	return chss_no          	;	}
	public String            getCntr_seal_no     (){	return cntr_seal_no     	;	}
	public String            getCntr_cgo_tp_cd   (){	return cntr_cgo_tp_cd   	;	}
	public String            getCntr_dmg_flg     (){	return cntr_dmg_flg     	;	}
	public String            getFcntr_flg        (){	return fcntr_flg        	;	}
	public String            getOb_cntr_flg      (){	return ob_cntr_flg      	;	}
	public String            getRcv_term_cd      (){	return rcv_term_cd      	;	}
	public String            getVndr_cnt_cd      (){	return vndr_cnt_cd      	;	}
	public String            getVndr_seq         (){	return vndr_seq         	;	}
	public String            getTrsp_mod_cd      (){	return trsp_mod_cd      	;	}
	public String            getLoc_cd           (){	return loc_cd           	;	}
	public String            getCnmv_rmk         (){	return cnmv_rmk         	;	}
	public String            getUsr_nm           (){	return usr_nm           	;	}
	public String            getCre_tp_cd        (){	return cre_tp_cd        	;	}
	public String            getN1st_cost_cd     (){	return n1st_cost_cd     	;	}
	public String            getN2nd_cost_cd     (){	return n2nd_cost_cd     	;	}
	public String            getN3rd_cost_cd     (){	return n3rd_cost_cd     	;	}
	public String            getSubst_rule_cd    (){	return subst_rule_cd    	;	}
	public String            getSpcl_cgo_flg     (){	return spcl_cgo_flg     	;	}
	public String            getBkg_knt          (){	return bkg_knt          	;	}
	public String            getBkg_no           (){	return bkg_no           	;	}
	public String            getBkg_no_split     (){	return bkg_no_split     	;	}
	public String            getUpd_dt           (){	return upd_dt           	;	}
	public String            getCre_dt           (){	return cre_dt           	;	}
	public String            getCre_usr_id       (){	return cre_usr_id       	;	}
	public String            getCntr_hngr_rck_flg(){	return cntr_hngr_rck_flg	;	}
	public String            getCntr_act_cd      (){	return cntr_act_cd      	;	}
	public String            getCntr_rfub_flg    (){	return cntr_rfub_flg    	;	}
	public String            getCntr_disp_flg    (){	return cntr_disp_flg    	;	}
	public String            getImdt_ext_flg     (){	return imdt_ext_flg     	;	}
	public String            getCntr_xch_flg     (){	return cntr_xch_flg     	;	}
	public String            getInlnd_trsp_lic_no(){	return inlnd_trsp_lic_no	;	}
	public String            getTt_flg           (){	return tt_flg           	;	}
	public String            getCtrt_ofc_cty_cd  (){	return ctrt_ofc_cty_cd  	;	}
	public String            getCtrt_seq         (){	return ctrt_seq         	;	}
	public String            getGmt_dt           (){	return gmt_dt           	;	}
	public String            getEdi_tp_cd        (){	return edi_tp_cd        	;	}
	public String            getEdi_msg_tp_cd    (){	return edi_msg_tp_cd    	;	}
	public String            getEdi_msg_area_cd  (){	return edi_msg_area_cd  	;	}
	public String            getEdi_msg_yrmondy  (){	return edi_msg_yrmondy  	;	}
	public String            getEdi_msg_seq      (){	return edi_msg_seq      	;	}
	public String            getFcar_no          (){	return fcar_no          	;	}
	public String            getWbl_no           (){	return wbl_no           	;	}
	public String            getPkup_no          (){	return pkup_no          	;	}
	public String            getN4th_cost_cd     (){	return n4th_cost_cd     	;	}
	public String            getCnmv_cyc_flg     (){	return cnmv_cyc_flg     	;	}
	public String            getTrn_no           (){	return trn_no           	;	}
	public String            getChss_seq         (){	return chss_seq         	;	}
	public String            getNis_evnt_dt      (){	return nis_evnt_dt      	;	}
	public String            getCntr_mv_flg      (){	return cntr_mv_flg      	;	}
	public String            getEai_evnt_dt      (){	return eai_evnt_dt      	;	}
	public String			 getCnmv_co_cd		 (){	return cnmv_co_cd			;	}

	// setter method is proceeding ..
	public void setIbflag           ( String            ibflag            ){	this.ibflag            = ibflag           	;	}
	public void setPage_rows        ( String            page_rows         ){	this.page_rows         = page_rows        	;	}
	public void setCntr_no          ( String            cntr_no           ){	this.cntr_no           = cntr_no          	;	}
	public void setCnmv_yr          ( String            cnmv_yr           ){	this.cnmv_yr           = cnmv_yr          	;	}
	public void setCnmv_id_no       ( String            cnmv_id_no        ){	this.cnmv_id_no        = cnmv_id_no       	;	}
	public void setCnmv_seq         ( String            cnmv_seq          ){	this.cnmv_seq          = cnmv_seq         	;	}
	public void setCnmv_split_cd    ( String            cnmv_split_cd     ){	this.cnmv_split_cd     = cnmv_split_cd    	;	}
	public void setCntr_tpsz_cd     ( String            cntr_tpsz_cd      ){	this.cntr_tpsz_cd      = cntr_tpsz_cd     	;	}
	public void setCnmv_cyc_no      ( String            cnmv_cyc_no       ){	this.cnmv_cyc_no       = cnmv_cyc_no      	;	}
	public void setCnmv_sts_cd      ( String            cnmv_sts_cd       ){	this.cnmv_sts_cd       = cnmv_sts_cd      	;	}
	public void setCnmv_lvl_no      ( String            cnmv_lvl_no       ){	this.cnmv_lvl_no       = cnmv_lvl_no      	;	}
	public void setCnmv_evnt_dt     ( String            cnmv_evnt_dt      ){	this.cnmv_evnt_dt      = cnmv_evnt_dt     	;	}
	public void setOrg_yd_cd        ( String            org_yd_cd         ){	this.org_yd_cd         = org_yd_cd        	;	}
	public void setDest_yd_cd       ( String            dest_yd_cd        ){	this.dest_yd_cd        = dest_yd_cd       	;	}
	public void setInp_yd_cd        ( String            inp_yd_cd         ){	this.inp_yd_cd         = inp_yd_cd        	;	}
	public void setFdr_vsl_cd       ( String            fdr_vsl_cd        ){	this.fdr_vsl_cd        = fdr_vsl_cd       	;	}
	public void setFdr_skd_voy_no   ( String            fdr_skd_voy_no    ){	this.fdr_skd_voy_no    = fdr_skd_voy_no   	;	}
	public void setFdr_skd_dir_cd   ( String            fdr_skd_dir_cd    ){	this.fdr_skd_dir_cd    = fdr_skd_dir_cd   	;	}
	public void setTrnk_vsl_cd      ( String            trnk_vsl_cd       ){	this.trnk_vsl_cd       = trnk_vsl_cd      	;	}
	public void setTrnk_skd_voy_no  ( String            trnk_skd_voy_no   ){	this.trnk_skd_voy_no   = trnk_skd_voy_no  	;	}
	public void setTrnk_skd_dir_cd  ( String            trnk_skd_dir_cd   ){	this.trnk_skd_dir_cd   = trnk_skd_dir_cd  	;	}
	public void setChss_no          ( String            chss_no           ){	this.chss_no           = chss_no          	;	}
	public void setCntr_seal_no     ( String            cntr_seal_no      ){	this.cntr_seal_no      = cntr_seal_no     	;	}
	public void setCntr_cgo_tp_cd   ( String            cntr_cgo_tp_cd    ){	this.cntr_cgo_tp_cd    = cntr_cgo_tp_cd   	;	}
	public void setCntr_dmg_flg     ( String            cntr_dmg_flg      ){	this.cntr_dmg_flg      = cntr_dmg_flg     	;	}
	public void setFcntr_flg        ( String            fcntr_flg         ){	this.fcntr_flg         = fcntr_flg        	;	}
	public void setOb_cntr_flg      ( String            ob_cntr_flg       ){	this.ob_cntr_flg       = ob_cntr_flg      	;	}
	public void setRcv_term_cd      ( String            rcv_term_cd       ){	this.rcv_term_cd       = rcv_term_cd      	;	}
	public void setVndr_cnt_cd      ( String            vndr_cnt_cd       ){	this.vndr_cnt_cd       = vndr_cnt_cd      	;	}
	public void setVndr_seq         ( String            vndr_seq          ){	this.vndr_seq          = vndr_seq         	;	}
	public void setTrsp_mod_cd      ( String            trsp_mod_cd       ){	this.trsp_mod_cd       = trsp_mod_cd      	;	}
	public void setLoc_cd           ( String            loc_cd            ){	this.loc_cd            = loc_cd           	;	}
	public void setCnmv_rmk         ( String            cnmv_rmk          ){	this.cnmv_rmk          = cnmv_rmk         	;	}
	public void setUsr_nm           ( String            usr_nm            ){	this.usr_nm            = usr_nm           	;	}
	public void setCre_tp_cd        ( String            cre_tp_cd         ){	this.cre_tp_cd         = cre_tp_cd        	;	}
	public void setN1st_cost_cd     ( String            n1st_cost_cd      ){	this.n1st_cost_cd      = n1st_cost_cd     	;	}
	public void setN2nd_cost_cd     ( String            n2nd_cost_cd      ){	this.n2nd_cost_cd      = n2nd_cost_cd     	;	}
	public void setN3rd_cost_cd     ( String            n3rd_cost_cd      ){	this.n3rd_cost_cd      = n3rd_cost_cd     	;	}
	public void setSubst_rule_cd    ( String            subst_rule_cd     ){	this.subst_rule_cd     = subst_rule_cd    	;	}
	public void setSpcl_cgo_flg     ( String            spcl_cgo_flg      ){	this.spcl_cgo_flg      = spcl_cgo_flg     	;	}
	public void setBkg_knt          ( String            bkg_knt           ){	this.bkg_knt           = bkg_knt          	;	}
	public void setBkg_no           ( String            bkg_no            ){	this.bkg_no            = bkg_no           	;	}
	public void setBkg_no_split     ( String            bkg_no_split      ){	this.bkg_no_split      = bkg_no_split     	;	}
	public void setUpd_dt           ( String            upd_dt            ){	this.upd_dt            = upd_dt           	;	}
	public void setCre_dt           ( String            cre_dt            ){	this.cre_dt            = cre_dt           	;	}
	public void setCre_usr_id       ( String            cre_usr_id        ){	this.cre_usr_id        = cre_usr_id       	;	}
	public void setCntr_hngr_rck_flg( String            cntr_hngr_rck_flg ){	this.cntr_hngr_rck_flg = cntr_hngr_rck_flg	;	}
	public void setCntr_act_cd      ( String            cntr_act_cd       ){	this.cntr_act_cd       = cntr_act_cd      	;	}
	public void setCntr_rfub_flg    ( String            cntr_rfub_flg     ){	this.cntr_rfub_flg     = cntr_rfub_flg    	;	}
	public void setCntr_disp_flg    ( String            cntr_disp_flg     ){	this.cntr_disp_flg     = cntr_disp_flg    	;	}
	public void setImdt_ext_flg     ( String            imdt_ext_flg      ){	this.imdt_ext_flg      = imdt_ext_flg     	;	}
	public void setCntr_xch_flg     ( String            cntr_xch_flg      ){	this.cntr_xch_flg      = cntr_xch_flg     	;	}
	public void setInlnd_trsp_lic_no( String            inlnd_trsp_lic_no ){	this.inlnd_trsp_lic_no = inlnd_trsp_lic_no	;	}
	public void setTt_flg           ( String            tt_flg            ){	this.tt_flg            = tt_flg           	;	}
	public void setCtrt_ofc_cty_cd  ( String            ctrt_ofc_cty_cd   ){	this.ctrt_ofc_cty_cd   = ctrt_ofc_cty_cd  	;	}
	public void setCtrt_seq         ( String            ctrt_seq          ){	this.ctrt_seq          = ctrt_seq         	;	}
	public void setGmt_dt           ( String            gmt_dt            ){	this.gmt_dt            = gmt_dt           	;	}
	public void setEdi_tp_cd        ( String            edi_tp_cd         ){	this.edi_tp_cd         = edi_tp_cd        	;	}
	public void setEdi_msg_tp_cd    ( String            edi_msg_tp_cd     ){	this.edi_msg_tp_cd     = edi_msg_tp_cd    	;	}
	public void setEdi_msg_area_cd  ( String            edi_msg_area_cd   ){	this.edi_msg_area_cd   = edi_msg_area_cd  	;	}
	public void setEdi_msg_yrmondy  ( String            edi_msg_yrmondy   ){	this.edi_msg_yrmondy   = edi_msg_yrmondy  	;	}
	public void setEdi_msg_seq      ( String            edi_msg_seq       ){	this.edi_msg_seq       = edi_msg_seq      	;	}
	public void setFcar_no          ( String            fcar_no           ){	this.fcar_no           = fcar_no          	;	}
	public void setWbl_no           ( String            wbl_no            ){	this.wbl_no            = wbl_no           	;	}
	public void setPkup_no          ( String            pkup_no           ){	this.pkup_no           = pkup_no          	;	}
	public void setN4th_cost_cd     ( String            n4th_cost_cd      ){	this.n4th_cost_cd      = n4th_cost_cd     	;	}
	public void setCnmv_cyc_flg     ( String            cnmv_cyc_flg      ){	this.cnmv_cyc_flg      = cnmv_cyc_flg     	;	}
	public void setTrn_no           ( String            trn_no            ){	this.trn_no            = trn_no           	;	}
	public void setChss_seq         ( String            chss_seq          ){	this.chss_seq          = chss_seq         	;	}
	public void setNis_evnt_dt      ( String            nis_evnt_dt       ){	this.nis_evnt_dt       = nis_evnt_dt      	;	}
	public void setCntr_mv_flg      ( String            cntr_mv_flg       ){	this.cntr_mv_flg       = cntr_mv_flg      	;	}
	public void setEai_evnt_dt      ( String            eai_evnt_dt       ){	this.eai_evnt_dt       = eai_evnt_dt      	;	}
	public void setCnmv_co_cd		( String			cnmv_co_cd		  ){	this.cnmv_co_cd		   = cnmv_co_cd			;	}

	public static CTM_CNTR_MVMT fromRequest(HttpServletRequest request) {
		CTM_CNTR_MVMT model = new CTM_CNTR_MVMT();
		try {
			model.setIbflag           	(JSPUtil.getParameter(request, "ibflag           		".trim(), ""));
			model.setPage_rows        	(JSPUtil.getParameter(request, "page_rows        		".trim(), ""));
			model.setCntr_no          	(JSPUtil.getParameter(request, "cntr_no          		".trim(), ""));
			model.setCnmv_yr          	(JSPUtil.getParameter(request, "cnmv_yr          		".trim(), ""));
			model.setCnmv_id_no       	(JSPUtil.getParameter(request, "cnmv_id_no       		".trim(), ""));
			model.setCnmv_seq         	(JSPUtil.getParameter(request, "cnmv_seq         		".trim(), ""));
			model.setCnmv_split_cd    	(JSPUtil.getParameter(request, "cnmv_split_cd    		".trim(), ""));
			model.setCntr_tpsz_cd     	(JSPUtil.getParameter(request, "cntr_tpsz_cd     		".trim(), ""));
			model.setCnmv_cyc_no      	(JSPUtil.getParameter(request, "cnmv_cyc_no      		".trim(), ""));
			model.setCnmv_sts_cd      	(JSPUtil.getParameter(request, "cnmv_sts_cd      		".trim(), ""));
			model.setCnmv_lvl_no      	(JSPUtil.getParameter(request, "cnmv_lvl_no      		".trim(), ""));
			model.setCnmv_evnt_dt     	(JSPUtil.getParameter(request, "cnmv_evnt_dt     		".trim(), ""));
			model.setOrg_yd_cd        	(JSPUtil.getParameter(request, "org_yd_cd        		".trim(), ""));
			model.setDest_yd_cd       	(JSPUtil.getParameter(request, "dest_yd_cd       		".trim(), ""));
			model.setInp_yd_cd        	(JSPUtil.getParameter(request, "inp_yd_cd        		".trim(), ""));
			model.setFdr_vsl_cd       	(JSPUtil.getParameter(request, "fdr_vsl_cd       		".trim(), ""));
			model.setFdr_skd_voy_no   	(JSPUtil.getParameter(request, "fdr_skd_voy_no   		".trim(), ""));
			model.setFdr_skd_dir_cd   	(JSPUtil.getParameter(request, "fdr_skd_dir_cd   		".trim(), ""));
			model.setTrnk_vsl_cd      	(JSPUtil.getParameter(request, "trnk_vsl_cd      		".trim(), ""));
			model.setTrnk_skd_voy_no  	(JSPUtil.getParameter(request, "trnk_skd_voy_no  		".trim(), ""));
			model.setTrnk_skd_dir_cd  	(JSPUtil.getParameter(request, "trnk_skd_dir_cd  		".trim(), ""));
			model.setChss_no          	(JSPUtil.getParameter(request, "chss_no          		".trim(), ""));
			model.setCntr_seal_no     	(JSPUtil.getParameter(request, "cntr_seal_no     		".trim(), ""));
			model.setCntr_cgo_tp_cd   	(JSPUtil.getParameter(request, "cntr_cgo_tp_cd   		".trim(), ""));
			model.setCntr_dmg_flg     	(JSPUtil.getParameter(request, "cntr_dmg_flg     		".trim(), ""));
			model.setFcntr_flg        	(JSPUtil.getParameter(request, "fcntr_flg        		".trim(), ""));
			model.setOb_cntr_flg      	(JSPUtil.getParameter(request, "ob_cntr_flg      		".trim(), ""));
			model.setRcv_term_cd      	(JSPUtil.getParameter(request, "rcv_term_cd      		".trim(), ""));
			model.setVndr_cnt_cd      	(JSPUtil.getParameter(request, "vndr_cnt_cd      		".trim(), ""));
			model.setVndr_seq         	(JSPUtil.getParameter(request, "vndr_seq         		".trim(), ""));
			model.setTrsp_mod_cd      	(JSPUtil.getParameter(request, "trsp_mod_cd      		".trim(), ""));
			model.setLoc_cd           	(JSPUtil.getParameter(request, "loc_cd           		".trim(), ""));
			model.setCnmv_rmk         	(JSPUtil.getParameter(request, "cnmv_rmk         		".trim(), ""));
			model.setUsr_nm           	(JSPUtil.getParameter(request, "usr_nm           		".trim(), ""));
			model.setCre_tp_cd        	(JSPUtil.getParameter(request, "cre_tp_cd        		".trim(), ""));
			model.setN1st_cost_cd     	(JSPUtil.getParameter(request, "n1st_cost_cd     		".trim(), ""));
			model.setN2nd_cost_cd     	(JSPUtil.getParameter(request, "n2nd_cost_cd     		".trim(), ""));
			model.setN3rd_cost_cd     	(JSPUtil.getParameter(request, "n3rd_cost_cd     		".trim(), ""));
			model.setSubst_rule_cd    	(JSPUtil.getParameter(request, "subst_rule_cd    		".trim(), ""));
			model.setSpcl_cgo_flg     	(JSPUtil.getParameter(request, "spcl_cgo_flg     		".trim(), ""));
			model.setBkg_knt          	(JSPUtil.getParameter(request, "bkg_knt          		".trim(), ""));
			model.setBkg_no           	(JSPUtil.getParameter(request, "bkg_no           		".trim(), ""));
			model.setBkg_no_split     	(JSPUtil.getParameter(request, "bkg_no_split     		".trim(), ""));
			model.setUpd_dt           	(JSPUtil.getParameter(request, "upd_dt           		".trim(), ""));
			model.setCre_dt           	(JSPUtil.getParameter(request, "cre_dt           		".trim(), ""));
			model.setCre_usr_id       	(JSPUtil.getParameter(request, "cre_usr_id       		".trim(), ""));
			model.setCntr_hngr_rck_flg	(JSPUtil.getParameter(request, "cntr_hngr_rck_flg		".trim(), ""));
			model.setCntr_act_cd      	(JSPUtil.getParameter(request, "cntr_act_cd      		".trim(), ""));
			model.setCntr_rfub_flg    	(JSPUtil.getParameter(request, "cntr_rfub_flg    		".trim(), ""));
			model.setCntr_disp_flg    	(JSPUtil.getParameter(request, "cntr_disp_flg    		".trim(), ""));
			model.setImdt_ext_flg     	(JSPUtil.getParameter(request, "imdt_ext_flg     		".trim(), ""));
			model.setCntr_xch_flg     	(JSPUtil.getParameter(request, "cntr_xch_flg     		".trim(), ""));
			model.setInlnd_trsp_lic_no	(JSPUtil.getParameter(request, "inlnd_trsp_lic_no		".trim(), ""));
			model.setTt_flg           	(JSPUtil.getParameter(request, "tt_flg           		".trim(), ""));
			model.setCtrt_ofc_cty_cd  	(JSPUtil.getParameter(request, "ctrt_ofc_cty_cd  		".trim(), ""));
			model.setCtrt_seq         	(JSPUtil.getParameter(request, "ctrt_seq         		".trim(), ""));
			model.setGmt_dt           	(JSPUtil.getParameter(request, "gmt_dt           		".trim(), ""));
			model.setEdi_tp_cd        	(JSPUtil.getParameter(request, "edi_tp_cd        		".trim(), ""));
			model.setEdi_msg_tp_cd    	(JSPUtil.getParameter(request, "edi_msg_tp_cd    		".trim(), ""));
			model.setEdi_msg_area_cd  	(JSPUtil.getParameter(request, "edi_msg_area_cd  		".trim(), ""));
			model.setEdi_msg_yrmondy  	(JSPUtil.getParameter(request, "edi_msg_yrmondy  		".trim(), ""));
			model.setEdi_msg_seq      	(JSPUtil.getParameter(request, "edi_msg_seq      		".trim(), ""));
			model.setFcar_no          	(JSPUtil.getParameter(request, "fcar_no          		".trim(), ""));
			model.setWbl_no           	(JSPUtil.getParameter(request, "wbl_no           		".trim(), ""));
			model.setPkup_no          	(JSPUtil.getParameter(request, "pkup_no          		".trim(), ""));
			model.setN4th_cost_cd     	(JSPUtil.getParameter(request, "n4th_cost_cd     		".trim(), ""));
			model.setCnmv_cyc_flg     	(JSPUtil.getParameter(request, "cnmv_cyc_flg     		".trim(), ""));
			model.setTrn_no           	(JSPUtil.getParameter(request, "trn_no           		".trim(), ""));
			model.setChss_seq         	(JSPUtil.getParameter(request, "chss_seq         		".trim(), ""));
			model.setNis_evnt_dt      	(JSPUtil.getParameter(request, "nis_evnt_dt      		".trim(), ""));
			model.setCntr_mv_flg      	(JSPUtil.getParameter(request, "cntr_mv_flg      		".trim(), ""));
			model.setEai_evnt_dt      	(JSPUtil.getParameter(request, "eai_evnt_dt      		".trim(), ""));
			model.setCnmv_co_cd			(JSPUtil.getParameter(request, "cnmv_co_cd				".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		CTM_CNTR_MVMT model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag            =  (JSPUtil.getParameter(request, "ibflag           		".trim(), length));
			String[] page_rows         =  (JSPUtil.getParameter(request, "page_rows        		".trim(), length));
			String[] cntr_no           =  (JSPUtil.getParameter(request, "cntr_no          		".trim(), length));
			String[] cnmv_yr           =  (JSPUtil.getParameter(request, "cnmv_yr          		".trim(), length));
			String[] cnmv_id_no        =  (JSPUtil.getParameter(request, "cnmv_id_no       		".trim(), length));
			String[] cnmv_seq          =  (JSPUtil.getParameter(request, "cnmv_seq         		".trim(), length));
			String[] cnmv_split_cd     =  (JSPUtil.getParameter(request, "cnmv_split_cd    		".trim(), length));
			String[] cntr_tpsz_cd      =  (JSPUtil.getParameter(request, "cntr_tpsz_cd     		".trim(), length));
			String[] cnmv_cyc_no       =  (JSPUtil.getParameter(request, "cnmv_cyc_no      		".trim(), length));
			String[] cnmv_sts_cd       =  (JSPUtil.getParameter(request, "cnmv_sts_cd      		".trim(), length));
			String[] cnmv_lvl_no       =  (JSPUtil.getParameter(request, "cnmv_lvl_no      		".trim(), length));
			String[] cnmv_evnt_dt      =  (JSPUtil.getParameter(request, "cnmv_evnt_dt     		".trim(), length));
			String[] org_yd_cd         =  (JSPUtil.getParameter(request, "org_yd_cd        		".trim(), length));
			String[] dest_yd_cd        =  (JSPUtil.getParameter(request, "dest_yd_cd       		".trim(), length));
			String[] inp_yd_cd         =  (JSPUtil.getParameter(request, "inp_yd_cd        		".trim(), length));
			String[] fdr_vsl_cd        =  (JSPUtil.getParameter(request, "fdr_vsl_cd       		".trim(), length));
			String[] fdr_skd_voy_no    =  (JSPUtil.getParameter(request, "fdr_skd_voy_no   		".trim(), length));
			String[] fdr_skd_dir_cd    =  (JSPUtil.getParameter(request, "fdr_skd_dir_cd   		".trim(), length));
			String[] trnk_vsl_cd       =  (JSPUtil.getParameter(request, "trnk_vsl_cd      		".trim(), length));
			String[] trnk_skd_voy_no   =  (JSPUtil.getParameter(request, "trnk_skd_voy_no  		".trim(), length));
			String[] trnk_skd_dir_cd   =  (JSPUtil.getParameter(request, "trnk_skd_dir_cd  		".trim(), length));
			String[] chss_no           =  (JSPUtil.getParameter(request, "chss_no          		".trim(), length));
			String[] cntr_seal_no      =  (JSPUtil.getParameter(request, "cntr_seal_no     		".trim(), length));
			String[] cntr_cgo_tp_cd    =  (JSPUtil.getParameter(request, "cntr_cgo_tp_cd   		".trim(), length));
			String[] cntr_dmg_flg      =  (JSPUtil.getParameter(request, "cntr_dmg_flg     		".trim(), length));
			String[] fcntr_flg         =  (JSPUtil.getParameter(request, "fcntr_flg        		".trim(), length));
			String[] ob_cntr_flg       =  (JSPUtil.getParameter(request, "ob_cntr_flg      		".trim(), length));
			String[] rcv_term_cd       =  (JSPUtil.getParameter(request, "rcv_term_cd      		".trim(), length));
			String[] vndr_cnt_cd       =  (JSPUtil.getParameter(request, "vndr_cnt_cd      		".trim(), length));
			String[] vndr_seq          =  (JSPUtil.getParameter(request, "vndr_seq         		".trim(), length));
			String[] trsp_mod_cd       =  (JSPUtil.getParameter(request, "trsp_mod_cd      		".trim(), length));
			String[] loc_cd            =  (JSPUtil.getParameter(request, "loc_cd           		".trim(), length));
			String[] cnmv_rmk          =  (JSPUtil.getParameter(request, "cnmv_rmk         		".trim(), length));
			String[] usr_nm            =  (JSPUtil.getParameter(request, "usr_nm           		".trim(), length));
			String[] cre_tp_cd         =  (JSPUtil.getParameter(request, "cre_tp_cd        		".trim(), length));
			String[] n1st_cost_cd      =  (JSPUtil.getParameter(request, "n1st_cost_cd     		".trim(), length));
			String[] n2nd_cost_cd      =  (JSPUtil.getParameter(request, "n2nd_cost_cd     		".trim(), length));
			String[] n3rd_cost_cd      =  (JSPUtil.getParameter(request, "n3rd_cost_cd     		".trim(), length));
			String[] subst_rule_cd     =  (JSPUtil.getParameter(request, "subst_rule_cd    		".trim(), length));
			String[] spcl_cgo_flg      =  (JSPUtil.getParameter(request, "spcl_cgo_flg     		".trim(), length));
			String[] bkg_knt           =  (JSPUtil.getParameter(request, "bkg_knt          		".trim(), length));
			String[] bkg_no            =  (JSPUtil.getParameter(request, "bkg_no           		".trim(), length));
			String[] bkg_no_split      =  (JSPUtil.getParameter(request, "bkg_no_split     		".trim(), length));
			String[] upd_dt            =  (JSPUtil.getParameter(request, "upd_dt           		".trim(), length));
			String[] cre_dt            =  (JSPUtil.getParameter(request, "cre_dt           		".trim(), length));
			String[] cre_usr_id        =  (JSPUtil.getParameter(request, "cre_usr_id       		".trim(), length));
			String[] cntr_hngr_rck_flg =  (JSPUtil.getParameter(request, "cntr_hngr_rck_flg		".trim(), length));
			String[] cntr_act_cd       =  (JSPUtil.getParameter(request, "cntr_act_cd      		".trim(), length));
			String[] cntr_rfub_flg     =  (JSPUtil.getParameter(request, "cntr_rfub_flg    		".trim(), length));
			String[] cntr_disp_flg     =  (JSPUtil.getParameter(request, "cntr_disp_flg    		".trim(), length));
			String[] imdt_ext_flg      =  (JSPUtil.getParameter(request, "imdt_ext_flg     		".trim(), length));
			String[] cntr_xch_flg      =  (JSPUtil.getParameter(request, "cntr_xch_flg     		".trim(), length));
			String[] inlnd_trsp_lic_no =  (JSPUtil.getParameter(request, "inlnd_trsp_lic_no		".trim(), length));
			String[] tt_flg            =  (JSPUtil.getParameter(request, "tt_flg           		".trim(), length));
			String[] ctrt_ofc_cty_cd   =  (JSPUtil.getParameter(request, "ctrt_ofc_cty_cd  		".trim(), length));
			String[] ctrt_seq          =  (JSPUtil.getParameter(request, "ctrt_seq         		".trim(), length));
			String[] gmt_dt            =  (JSPUtil.getParameter(request, "gmt_dt           		".trim(), length));
			String[] edi_tp_cd         =  (JSPUtil.getParameter(request, "edi_tp_cd        		".trim(), length));
			String[] edi_msg_tp_cd     =  (JSPUtil.getParameter(request, "edi_msg_tp_cd    		".trim(), length));
			String[] edi_msg_area_cd   =  (JSPUtil.getParameter(request, "edi_msg_area_cd  		".trim(), length));
			String[] edi_msg_yrmondy   =  (JSPUtil.getParameter(request, "edi_msg_yrmondy  		".trim(), length));
			String[] edi_msg_seq       =  (JSPUtil.getParameter(request, "edi_msg_seq      		".trim(), length));
			String[] fcar_no           =  (JSPUtil.getParameter(request, "fcar_no          		".trim(), length));
			String[] wbl_no            =  (JSPUtil.getParameter(request, "wbl_no           		".trim(), length));
			String[] pkup_no           =  (JSPUtil.getParameter(request, "pkup_no          		".trim(), length));
			String[] n4th_cost_cd      =  (JSPUtil.getParameter(request, "n4th_cost_cd     		".trim(), length));
			String[] cnmv_cyc_flg      =  (JSPUtil.getParameter(request, "cnmv_cyc_flg     		".trim(), length));
			String[] trn_no            =  (JSPUtil.getParameter(request, "trn_no           		".trim(), length));
			String[] chss_seq          =  (JSPUtil.getParameter(request, "chss_seq         		".trim(), length));
			String[] nis_evnt_dt       =  (JSPUtil.getParameter(request, "nis_evnt_dt      		".trim(), length));
			String[] cntr_mv_flg       =  (JSPUtil.getParameter(request, "cntr_mv_flg      		".trim(), length));
			String[] eai_evnt_dt       =  (JSPUtil.getParameter(request, "eai_evnt_dt      		".trim(), length));
			String[] cnmv_co_cd		   =  (JSPUtil.getParameter(request, "cnmv_co_cd			".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new CTM_CNTR_MVMT();
				model.setIbflag           		  (ibflag           	[i]);
				model.setPage_rows        		  (page_rows        	[i]);
				model.setCntr_no          		  (cntr_no          	[i]);
				model.setCnmv_yr          		  (cnmv_yr          	[i]);
				model.setCnmv_id_no       		  (cnmv_id_no       	[i]);
				model.setCnmv_seq         		  (cnmv_seq         	[i]);
				model.setCnmv_split_cd    		  (cnmv_split_cd    	[i]);
				model.setCntr_tpsz_cd     		  (cntr_tpsz_cd     	[i]);
				model.setCnmv_cyc_no      		  (cnmv_cyc_no      	[i]);
				model.setCnmv_sts_cd      		  (cnmv_sts_cd      	[i]);
				model.setCnmv_lvl_no      		  (cnmv_lvl_no      	[i]);
				model.setCnmv_evnt_dt     		  (cnmv_evnt_dt     	[i]);
				model.setOrg_yd_cd        		  (org_yd_cd        	[i]);
				model.setDest_yd_cd       		  (dest_yd_cd       	[i]);
				model.setInp_yd_cd        		  (inp_yd_cd        	[i]);
				model.setFdr_vsl_cd       		  (fdr_vsl_cd       	[i]);
				model.setFdr_skd_voy_no   		  (fdr_skd_voy_no   	[i]);
				model.setFdr_skd_dir_cd   		  (fdr_skd_dir_cd   	[i]);
				model.setTrnk_vsl_cd      		  (trnk_vsl_cd      	[i]);
				model.setTrnk_skd_voy_no  		  (trnk_skd_voy_no  	[i]);
				model.setTrnk_skd_dir_cd  		  (trnk_skd_dir_cd  	[i]);
				model.setChss_no          		  (chss_no          	[i]);
				model.setCntr_seal_no     		  (cntr_seal_no     	[i]);
				model.setCntr_cgo_tp_cd   		  (cntr_cgo_tp_cd   	[i]);
				model.setCntr_dmg_flg     		  (cntr_dmg_flg     	[i]);
				model.setFcntr_flg        		  (fcntr_flg        	[i]);
				model.setOb_cntr_flg      		  (ob_cntr_flg      	[i]);
				model.setRcv_term_cd      		  (rcv_term_cd      	[i]);
				model.setVndr_cnt_cd      		  (vndr_cnt_cd      	[i]);
				model.setVndr_seq         		  (vndr_seq         	[i]);
				model.setTrsp_mod_cd      		  (trsp_mod_cd      	[i]);
				model.setLoc_cd           		  (loc_cd           	[i]);
				model.setCnmv_rmk         		  (cnmv_rmk         	[i]);
				model.setUsr_nm           		  (usr_nm           	[i]);
				model.setCre_tp_cd        		  (cre_tp_cd        	[i]);
				model.setN1st_cost_cd     		  (n1st_cost_cd     	[i]);
				model.setN2nd_cost_cd     		  (n2nd_cost_cd     	[i]);
				model.setN3rd_cost_cd     		  (n3rd_cost_cd     	[i]);
				model.setSubst_rule_cd    		  (subst_rule_cd    	[i]);
				model.setSpcl_cgo_flg     		  (spcl_cgo_flg     	[i]);
				model.setBkg_knt          		  (bkg_knt          	[i]);
				model.setBkg_no           		  (bkg_no           	[i]);
				model.setBkg_no_split     		  (bkg_no_split     	[i]);
				model.setUpd_dt           		  (upd_dt           	[i]);
				model.setCre_dt           		  (cre_dt           	[i]);
				model.setCre_usr_id       		  (cre_usr_id       	[i]);
				model.setCntr_hngr_rck_flg		  (cntr_hngr_rck_flg	[i]);
				model.setCntr_act_cd      		  (cntr_act_cd      	[i]);
				model.setCntr_rfub_flg    		  (cntr_rfub_flg    	[i]);
				model.setCntr_disp_flg    		  (cntr_disp_flg    	[i]);
				model.setImdt_ext_flg     		  (imdt_ext_flg     	[i]);
				model.setCntr_xch_flg     		  (cntr_xch_flg     	[i]);
				model.setInlnd_trsp_lic_no		  (inlnd_trsp_lic_no	[i]);
				model.setTt_flg           		  (tt_flg           	[i]);
				model.setCtrt_ofc_cty_cd  		  (ctrt_ofc_cty_cd  	[i]);
				model.setCtrt_seq         		  (ctrt_seq         	[i]);
				model.setGmt_dt           		  (gmt_dt           	[i]);
				model.setEdi_tp_cd        		  (edi_tp_cd        	[i]);
				model.setEdi_msg_tp_cd    		  (edi_msg_tp_cd    	[i]);
				model.setEdi_msg_area_cd  		  (edi_msg_area_cd  	[i]);
				model.setEdi_msg_yrmondy  		  (edi_msg_yrmondy  	[i]);
				model.setEdi_msg_seq      		  (edi_msg_seq      	[i]);
				model.setFcar_no          		  (fcar_no          	[i]);
				model.setWbl_no           		  (wbl_no           	[i]);
				model.setPkup_no          		  (pkup_no          	[i]);
				model.setN4th_cost_cd     		  (n4th_cost_cd     	[i]);
				model.setCnmv_cyc_flg     		  (cnmv_cyc_flg     	[i]);
				model.setTrn_no           		  (trn_no           	[i]);
				model.setChss_seq         		  (chss_seq         	[i]);
				model.setNis_evnt_dt      		  (nis_evnt_dt      	[i]);
				model.setCntr_mv_flg      		  (cntr_mv_flg      	[i]);
				model.setEai_evnt_dt      		  (eai_evnt_dt      	[i]);
				model.setCnmv_co_cd				  (cnmv_co_cd			[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		CTM_CNTR_MVMT model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag            =  (JSPUtil.getParameter(request, prefix + "ibflag           		".trim(), length));
			String[] page_rows         =  (JSPUtil.getParameter(request, prefix + "page_rows        		".trim(), length));
			String[] cntr_no           =  (JSPUtil.getParameter(request, prefix + "cntr_no          		".trim(), length));
			String[] cnmv_yr           =  (JSPUtil.getParameter(request, prefix + "cnmv_yr          		".trim(), length));
			String[] cnmv_id_no        =  (JSPUtil.getParameter(request, prefix + "cnmv_id_no       		".trim(), length));
			String[] cnmv_seq          =  (JSPUtil.getParameter(request, prefix + "cnmv_seq         		".trim(), length));
			String[] cnmv_split_cd     =  (JSPUtil.getParameter(request, prefix + "cnmv_split_cd    		".trim(), length));
			String[] cntr_tpsz_cd      =  (JSPUtil.getParameter(request, prefix + "cntr_tpsz_cd     		".trim(), length));
			String[] cnmv_cyc_no       =  (JSPUtil.getParameter(request, prefix + "cnmv_cyc_no      		".trim(), length));
			String[] cnmv_sts_cd       =  (JSPUtil.getParameter(request, prefix + "cnmv_sts_cd      		".trim(), length));
			String[] cnmv_lvl_no       =  (JSPUtil.getParameter(request, prefix + "cnmv_lvl_no      		".trim(), length));
			String[] cnmv_evnt_dt      =  (JSPUtil.getParameter(request, prefix + "cnmv_evnt_dt     		".trim(), length));
			String[] org_yd_cd         =  (JSPUtil.getParameter(request, prefix + "org_yd_cd        		".trim(), length));
			String[] dest_yd_cd        =  (JSPUtil.getParameter(request, prefix + "dest_yd_cd       		".trim(), length));
			String[] inp_yd_cd         =  (JSPUtil.getParameter(request, prefix + "inp_yd_cd        		".trim(), length));
			String[] fdr_vsl_cd        =  (JSPUtil.getParameter(request, prefix + "fdr_vsl_cd       		".trim(), length));
			String[] fdr_skd_voy_no    =  (JSPUtil.getParameter(request, prefix + "fdr_skd_voy_no   		".trim(), length));
			String[] fdr_skd_dir_cd    =  (JSPUtil.getParameter(request, prefix + "fdr_skd_dir_cd   		".trim(), length));
			String[] trnk_vsl_cd       =  (JSPUtil.getParameter(request, prefix + "trnk_vsl_cd      		".trim(), length));
			String[] trnk_skd_voy_no   =  (JSPUtil.getParameter(request, prefix + "trnk_skd_voy_no  		".trim(), length));
			String[] trnk_skd_dir_cd   =  (JSPUtil.getParameter(request, prefix + "trnk_skd_dir_cd  		".trim(), length));
			String[] chss_no           =  (JSPUtil.getParameter(request, prefix + "chss_no          		".trim(), length));
			String[] cntr_seal_no      =  (JSPUtil.getParameter(request, prefix + "cntr_seal_no     		".trim(), length));
			String[] cntr_cgo_tp_cd    =  (JSPUtil.getParameter(request, prefix + "cntr_cgo_tp_cd   		".trim(), length));
			String[] cntr_dmg_flg      =  (JSPUtil.getParameter(request, prefix + "cntr_dmg_flg     		".trim(), length));
			String[] fcntr_flg         =  (JSPUtil.getParameter(request, prefix + "fcntr_flg        		".trim(), length));
			String[] ob_cntr_flg       =  (JSPUtil.getParameter(request, prefix + "ob_cntr_flg      		".trim(), length));
			String[] rcv_term_cd       =  (JSPUtil.getParameter(request, prefix + "rcv_term_cd      		".trim(), length));
			String[] vndr_cnt_cd       =  (JSPUtil.getParameter(request, prefix + "vndr_cnt_cd      		".trim(), length));
			String[] vndr_seq          =  (JSPUtil.getParameter(request, prefix + "vndr_seq         		".trim(), length));
			String[] trsp_mod_cd       =  (JSPUtil.getParameter(request, prefix + "trsp_mod_cd      		".trim(), length));
			String[] loc_cd            =  (JSPUtil.getParameter(request, prefix + "loc_cd           		".trim(), length));
			String[] cnmv_rmk          =  (JSPUtil.getParameter(request, prefix + "cnmv_rmk         		".trim(), length));
			String[] usr_nm            =  (JSPUtil.getParameter(request, prefix + "usr_nm           		".trim(), length));
			String[] cre_tp_cd         =  (JSPUtil.getParameter(request, prefix + "cre_tp_cd        		".trim(), length));
			String[] n1st_cost_cd      =  (JSPUtil.getParameter(request, prefix + "n1st_cost_cd     		".trim(), length));
			String[] n2nd_cost_cd      =  (JSPUtil.getParameter(request, prefix + "n2nd_cost_cd     		".trim(), length));
			String[] n3rd_cost_cd      =  (JSPUtil.getParameter(request, prefix + "n3rd_cost_cd     		".trim(), length));
			String[] subst_rule_cd     =  (JSPUtil.getParameter(request, prefix + "subst_rule_cd    		".trim(), length));
			String[] spcl_cgo_flg      =  (JSPUtil.getParameter(request, prefix + "spcl_cgo_flg     		".trim(), length));
			String[] bkg_knt           =  (JSPUtil.getParameter(request, prefix + "bkg_knt          		".trim(), length));
			String[] bkg_no            =  (JSPUtil.getParameter(request, prefix + "bkg_no           		".trim(), length));
			String[] bkg_no_split      =  (JSPUtil.getParameter(request, prefix + "bkg_no_split     		".trim(), length));
			String[] upd_dt            =  (JSPUtil.getParameter(request, prefix + "upd_dt           		".trim(), length));
			String[] cre_dt            =  (JSPUtil.getParameter(request, prefix + "cre_dt           		".trim(), length));
			String[] cre_usr_id        =  (JSPUtil.getParameter(request, prefix + "cre_usr_id       		".trim(), length));
			String[] cntr_hngr_rck_flg =  (JSPUtil.getParameter(request, prefix + "cntr_hngr_rck_flg		".trim(), length));
			String[] cntr_act_cd       =  (JSPUtil.getParameter(request, prefix + "cntr_act_cd      		".trim(), length));
			String[] cntr_rfub_flg     =  (JSPUtil.getParameter(request, prefix + "cntr_rfub_flg    		".trim(), length));
			String[] cntr_disp_flg     =  (JSPUtil.getParameter(request, prefix + "cntr_disp_flg    		".trim(), length));
			String[] imdt_ext_flg      =  (JSPUtil.getParameter(request, prefix + "imdt_ext_flg     		".trim(), length));
			String[] cntr_xch_flg      =  (JSPUtil.getParameter(request, prefix + "cntr_xch_flg     		".trim(), length));
			String[] inlnd_trsp_lic_no =  (JSPUtil.getParameter(request, prefix + "inlnd_trsp_lic_no		".trim(), length));
			String[] tt_flg            =  (JSPUtil.getParameter(request, prefix + "tt_flg           		".trim(), length));
			String[] ctrt_ofc_cty_cd   =  (JSPUtil.getParameter(request, prefix + "ctrt_ofc_cty_cd  		".trim(), length));
			String[] ctrt_seq          =  (JSPUtil.getParameter(request, prefix + "ctrt_seq         		".trim(), length));
			String[] gmt_dt            =  (JSPUtil.getParameter(request, prefix + "gmt_dt           		".trim(), length));
			String[] edi_tp_cd         =  (JSPUtil.getParameter(request, prefix + "edi_tp_cd        		".trim(), length));
			String[] edi_msg_tp_cd     =  (JSPUtil.getParameter(request, prefix + "edi_msg_tp_cd    		".trim(), length));
			String[] edi_msg_area_cd   =  (JSPUtil.getParameter(request, prefix + "edi_msg_area_cd  		".trim(), length));
			String[] edi_msg_yrmondy   =  (JSPUtil.getParameter(request, prefix + "edi_msg_yrmondy  		".trim(), length));
			String[] edi_msg_seq       =  (JSPUtil.getParameter(request, prefix + "edi_msg_seq      		".trim(), length));
			String[] fcar_no           =  (JSPUtil.getParameter(request, prefix + "fcar_no          		".trim(), length));
			String[] wbl_no            =  (JSPUtil.getParameter(request, prefix + "wbl_no           		".trim(), length));
			String[] pkup_no           =  (JSPUtil.getParameter(request, prefix + "pkup_no          		".trim(), length));
			String[] n4th_cost_cd      =  (JSPUtil.getParameter(request, prefix + "n4th_cost_cd     		".trim(), length));
			String[] cnmv_cyc_flg      =  (JSPUtil.getParameter(request, prefix + "cnmv_cyc_flg     		".trim(), length));
			String[] trn_no            =  (JSPUtil.getParameter(request, prefix + "trn_no           		".trim(), length));
			String[] chss_seq          =  (JSPUtil.getParameter(request, prefix + "chss_seq         		".trim(), length));
			String[] nis_evnt_dt       =  (JSPUtil.getParameter(request, prefix + "nis_evnt_dt      		".trim(), length));
			String[] cntr_mv_flg       =  (JSPUtil.getParameter(request, prefix + "cntr_mv_flg      		".trim(), length));
			String[] eai_evnt_dt       =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt      		".trim(), length));
			String[] cnmv_co_cd		   =  (JSPUtil.getParameter(request, prefix + "cnmv_co_cd				".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new CTM_CNTR_MVMT();
				model.setIbflag           		  ( ibflag           	[i]);
				model.setPage_rows        		  ( page_rows        	[i]);
				model.setCntr_no          		  ( cntr_no          	[i]);
				model.setCnmv_yr          		  ( cnmv_yr          	[i]);
				model.setCnmv_id_no       		  ( cnmv_id_no       	[i]);
				model.setCnmv_seq         		  ( cnmv_seq         	[i]);
				model.setCnmv_split_cd    		  ( cnmv_split_cd    	[i]);
				model.setCntr_tpsz_cd     		  ( cntr_tpsz_cd     	[i]);
				model.setCnmv_cyc_no      		  ( cnmv_cyc_no      	[i]);
				model.setCnmv_sts_cd      		  ( cnmv_sts_cd      	[i]);
				model.setCnmv_lvl_no      		  ( cnmv_lvl_no      	[i]);
				model.setCnmv_evnt_dt     		  ( cnmv_evnt_dt     	[i]);
				model.setOrg_yd_cd        		  ( org_yd_cd        	[i]);
				model.setDest_yd_cd       		  ( dest_yd_cd       	[i]);
				model.setInp_yd_cd        		  ( inp_yd_cd        	[i]);
				model.setFdr_vsl_cd       		  ( fdr_vsl_cd       	[i]);
				model.setFdr_skd_voy_no   		  ( fdr_skd_voy_no   	[i]);
				model.setFdr_skd_dir_cd   		  ( fdr_skd_dir_cd   	[i]);
				model.setTrnk_vsl_cd      		  ( trnk_vsl_cd      	[i]);
				model.setTrnk_skd_voy_no  		  ( trnk_skd_voy_no  	[i]);
				model.setTrnk_skd_dir_cd  		  ( trnk_skd_dir_cd  	[i]);
				model.setChss_no          		  ( chss_no          	[i]);
				model.setCntr_seal_no     		  ( cntr_seal_no     	[i]);
				model.setCntr_cgo_tp_cd   		  ( cntr_cgo_tp_cd   	[i]);
				model.setCntr_dmg_flg     		  ( cntr_dmg_flg     	[i]);
				model.setFcntr_flg        		  ( fcntr_flg        	[i]);
				model.setOb_cntr_flg      		  ( ob_cntr_flg      	[i]);
				model.setRcv_term_cd      		  ( rcv_term_cd      	[i]);
				model.setVndr_cnt_cd      		  ( vndr_cnt_cd      	[i]);
				model.setVndr_seq         		  ( vndr_seq         	[i]);
				model.setTrsp_mod_cd      		  ( trsp_mod_cd      	[i]);
				model.setLoc_cd           		  ( loc_cd           	[i]);
				model.setCnmv_rmk         		  ( cnmv_rmk         	[i]);
				model.setUsr_nm           		  ( usr_nm           	[i]);
				model.setCre_tp_cd        		  ( cre_tp_cd        	[i]);
				model.setN1st_cost_cd     		  ( n1st_cost_cd     	[i]);
				model.setN2nd_cost_cd     		  ( n2nd_cost_cd     	[i]);
				model.setN3rd_cost_cd     		  ( n3rd_cost_cd     	[i]);
				model.setSubst_rule_cd    		  ( subst_rule_cd    	[i]);
				model.setSpcl_cgo_flg     		  ( spcl_cgo_flg     	[i]);
				model.setBkg_knt          		  ( bkg_knt          	[i]);
				model.setBkg_no           		  ( bkg_no           	[i]);
				model.setBkg_no_split     		  ( bkg_no_split     	[i]);
				model.setUpd_dt           		  ( upd_dt           	[i]);
				model.setCre_dt           		  ( cre_dt           	[i]);
				model.setCre_usr_id       		  ( cre_usr_id       	[i]);
				model.setCntr_hngr_rck_flg		  ( cntr_hngr_rck_flg	[i]);
				model.setCntr_act_cd      		  ( cntr_act_cd      	[i]);
				model.setCntr_rfub_flg    		  ( cntr_rfub_flg    	[i]);
				model.setCntr_disp_flg    		  ( cntr_disp_flg    	[i]);
				model.setImdt_ext_flg     		  ( imdt_ext_flg     	[i]);
				model.setCntr_xch_flg     		  ( cntr_xch_flg     	[i]);
				model.setInlnd_trsp_lic_no		  ( inlnd_trsp_lic_no	[i]);
				model.setTt_flg           		  ( tt_flg           	[i]);
				model.setCtrt_ofc_cty_cd  		  ( ctrt_ofc_cty_cd  	[i]);
				model.setCtrt_seq         		  ( ctrt_seq         	[i]);
				model.setGmt_dt           		  ( gmt_dt           	[i]);
				model.setEdi_tp_cd        		  ( edi_tp_cd        	[i]);
				model.setEdi_msg_tp_cd    		  ( edi_msg_tp_cd    	[i]);
				model.setEdi_msg_area_cd  		  ( edi_msg_area_cd  	[i]);
				model.setEdi_msg_yrmondy  		  ( edi_msg_yrmondy  	[i]);
				model.setEdi_msg_seq      		  ( edi_msg_seq      	[i]);
				model.setFcar_no          		  ( fcar_no          	[i]);
				model.setWbl_no           		  ( wbl_no           	[i]);
				model.setPkup_no          		  ( pkup_no          	[i]);
				model.setN4th_cost_cd     		  ( n4th_cost_cd     	[i]);
				model.setCnmv_cyc_flg     		  ( cnmv_cyc_flg     	[i]);
				model.setTrn_no           		  ( trn_no           	[i]);
				model.setChss_seq         		  ( chss_seq         	[i]);
				model.setNis_evnt_dt      		  ( nis_evnt_dt      	[i]);
				model.setCntr_mv_flg      		  ( cntr_mv_flg      	[i]);
				model.setEai_evnt_dt      		  ( eai_evnt_dt      	[i]);
				model.setCnmv_co_cd				  (cnmv_co_cd			[i]);
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
