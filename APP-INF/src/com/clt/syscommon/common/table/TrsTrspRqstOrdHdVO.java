/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : TRS_TRSP_RQST_ORD_HD_TMP.java
*@FileTitle : Adding Surcharge Agreement
*Open Issues :
*Change history :
*@LastModifyDate : 2007-10-12
*@LastModifier : agreement
*@LastVersion : 1.0
* 2007-10-12 agreement
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
 * @author agreement
 * @since J2EE 1.4 
 */
public final class TrsTrspRqstOrdHdVO implements java.io.Serializable {

	private String                ibflag                = "";
	private String                page_rows             = "";
	private String                bkg_no                = "";
	private String                bkg_no_split          = "";
	private String                trsp_rqst_ord_bnd_cd  = "";
	private String                trsp_rqst_ord_seq     = "";
	private String                cntr_tpsz_cd          = "";
	private String                cntr_no               = "";
	private String                cntr_wgt              = "";
	private String                trsp_rqst_hlg_cd      = "";
	private String                trsp_rqst_mod_cd      = "";
	private String                trsp_rqst_tp_cd       = "";
	private String                cntr_rtn_yd_cd        = "";
	private String                cntr_pkup_yd_cd       = "";
	private String                cntr_rtn_dt           = "";
	private String                cntr_pkup_dt          = "";
	private String                rep_cmdt_cd           = "";
	private String                rep_cmdt_desc         = "";
	private String                trsp_rqst_t1_ind_flg  = "";
	private String                spcl_instr_rmk        = "";
	private String                trsp_rqst_proc_ind_cd = "";
	private String                cstms_clr_no          = "";
	private String                trsp_rqst_ord_rev_amt = "";
	private String                rev_curr_cd           = "";
	private String                act_cust_cnt_cd       = "";
	private String                act_cust_seq          = "";
	private String                cxl_flg               = "";
	private String                dcgo_seq              = "";
	private String                rc_seq                = "";
	private String                awk_cgo_seq           = "";
	private String                tro_drp_off_seq       = "";
	private String                tro_pkup_seq          = "";
	private String                tva_ind_cd            = "";
	private String                tro_cfm_hlg_cd        = "";
	private String                tro_cfm_curr_cd       = "";
	private String                tro_cfm_rev_amt       = "";
	private String                tro_cfm_tva_ind_cd    = "";
	private String                ca_ind_cd             = "";
	private String                tro_corr_no           = "";
	private String                tro_cfm_upd_dt        = "";
	private String                tro_cfm_all_rt_cd     = "";
	private String                tro_lod_ref_no        = "";
	private String                cre_ofc_cd            = "";
	private String                cre_dt                = "";
	private String                cre_usr_id            = "";
	private String                upd_dt                = "";
	private String                upd_usr_id            = "";
	private String                eai_evnt_dt           = "";
	private String                tro_cfm_ofc_cd        = "";
	private String                tro_all_in_rt_cd      = "";

	public TrsTrspRqstOrdHdVO(){}

	public TrsTrspRqstOrdHdVO(
			String                ibflag               ,
			String                page_rows            ,
			String                bkg_no               ,
			String                bkg_no_split         ,
			String                trsp_rqst_ord_bnd_cd ,
			String                trsp_rqst_ord_seq    ,
			String                cntr_tpsz_cd         ,
			String                cntr_no              ,
			String                cntr_wgt             ,
			String                trsp_rqst_hlg_cd     ,
			String                trsp_rqst_mod_cd     ,
			String                trsp_rqst_tp_cd      ,
			String                cntr_rtn_yd_cd       ,
			String                cntr_pkup_yd_cd      ,
			String                cntr_rtn_dt          ,
			String                cntr_pkup_dt         ,
			String                rep_cmdt_cd          ,
			String                rep_cmdt_desc        ,
			String                trsp_rqst_t1_ind_flg ,
			String                spcl_instr_rmk       ,
			String                trsp_rqst_proc_ind_cd,
			String                cstms_clr_no         ,
			String                trsp_rqst_ord_rev_amt,
			String                rev_curr_cd          ,
			String                act_cust_cnt_cd      ,
			String                act_cust_seq         ,
			String                cxl_flg              ,
			String                dcgo_seq             ,
			String                rc_seq               ,
			String                awk_cgo_seq          ,
			String                tro_drp_off_seq      ,
			String                tro_pkup_seq         ,
			String                tva_ind_cd           ,
			String                tro_cfm_hlg_cd       ,
			String                tro_cfm_curr_cd      ,
			String                tro_cfm_rev_amt      ,
			String                tro_cfm_tva_ind_cd   ,
			String                ca_ind_cd            ,
			String                tro_corr_no          ,
			String                tro_cfm_upd_dt       ,
			String                tro_cfm_all_rt_cd    ,
			String                tro_lod_ref_no       ,
			String                cre_ofc_cd           ,
			String                cre_dt               ,
			String                cre_usr_id           ,
			String                upd_dt               ,
			String                upd_usr_id           ,
			String                eai_evnt_dt          ,
			String                tro_cfm_ofc_cd       ,
			String                tro_all_in_rt_cd      ){
		this.ibflag                = ibflag               ;
		this.page_rows             = page_rows            ;
		this.bkg_no                = bkg_no               ;
		this.bkg_no_split          = bkg_no_split         ;
		this.trsp_rqst_ord_bnd_cd  = trsp_rqst_ord_bnd_cd ;
		this.trsp_rqst_ord_seq     = trsp_rqst_ord_seq    ;
		this.cntr_tpsz_cd          = cntr_tpsz_cd         ;
		this.cntr_no               = cntr_no              ;
		this.cntr_wgt              = cntr_wgt             ;
		this.trsp_rqst_hlg_cd      = trsp_rqst_hlg_cd     ;
		this.trsp_rqst_mod_cd      = trsp_rqst_mod_cd     ;
		this.trsp_rqst_tp_cd       = trsp_rqst_tp_cd      ;
		this.cntr_rtn_yd_cd        = cntr_rtn_yd_cd       ;
		this.cntr_pkup_yd_cd       = cntr_pkup_yd_cd      ;
		this.cntr_rtn_dt           = cntr_rtn_dt          ;
		this.cntr_pkup_dt          = cntr_pkup_dt         ;
		this.rep_cmdt_cd           = rep_cmdt_cd          ;
		this.rep_cmdt_desc         = rep_cmdt_desc        ;
		this.trsp_rqst_t1_ind_flg  = trsp_rqst_t1_ind_flg ;
		this.spcl_instr_rmk        = spcl_instr_rmk       ;
		this.trsp_rqst_proc_ind_cd = trsp_rqst_proc_ind_cd;
		this.cstms_clr_no          = cstms_clr_no         ;
		this.trsp_rqst_ord_rev_amt = trsp_rqst_ord_rev_amt;
		this.rev_curr_cd           = rev_curr_cd          ;
		this.act_cust_cnt_cd       = act_cust_cnt_cd      ;
		this.act_cust_seq          = act_cust_seq         ;
		this.cxl_flg               = cxl_flg              ;
		this.dcgo_seq              = dcgo_seq             ;
		this.rc_seq                = rc_seq               ;
		this.awk_cgo_seq           = awk_cgo_seq          ;
		this.tro_drp_off_seq       = tro_drp_off_seq      ;
		this.tro_pkup_seq          = tro_pkup_seq         ;
		this.tva_ind_cd            = tva_ind_cd           ;
		this.tro_cfm_hlg_cd        = tro_cfm_hlg_cd       ;
		this.tro_cfm_curr_cd       = tro_cfm_curr_cd      ;
		this.tro_cfm_rev_amt       = tro_cfm_rev_amt      ;
		this.tro_cfm_tva_ind_cd    = tro_cfm_tva_ind_cd   ;
		this.ca_ind_cd             = ca_ind_cd            ;
		this.tro_corr_no           = tro_corr_no          ;
		this.tro_cfm_upd_dt        = tro_cfm_upd_dt       ;
		this.tro_cfm_all_rt_cd     = tro_cfm_all_rt_cd    ;
		this.tro_lod_ref_no        = tro_lod_ref_no       ;
		this.cre_ofc_cd            = cre_ofc_cd           ;
		this.cre_dt                = cre_dt               ;
		this.cre_usr_id            = cre_usr_id           ;
		this.upd_dt                = upd_dt               ;
		this.upd_usr_id            = upd_usr_id           ;
		this.eai_evnt_dt           = eai_evnt_dt          ;
		this.tro_cfm_ofc_cd        = tro_cfm_ofc_cd       ;
		this.tro_all_in_rt_cd      = tro_all_in_rt_cd     ;
	}

	// getter method is proceeding ..
	public String                getIbflag               (){	return ibflag               	;	}
	public String                getPage_rows            (){	return page_rows            	;	}
	public String                getBkg_no               (){	return bkg_no               	;	}
	public String                getBkg_no_split         (){	return bkg_no_split         	;	}
	public String                getTrsp_rqst_ord_bnd_cd (){	return trsp_rqst_ord_bnd_cd 	;	}
	public String                getTrsp_rqst_ord_seq    (){	return trsp_rqst_ord_seq    	;	}
	public String                getCntr_tpsz_cd         (){	return cntr_tpsz_cd         	;	}
	public String                getCntr_no              (){	return cntr_no              	;	}
	public String                getCntr_wgt             (){	return cntr_wgt             	;	}
	public String                getTrsp_rqst_hlg_cd     (){	return trsp_rqst_hlg_cd     	;	}
	public String                getTrsp_rqst_mod_cd     (){	return trsp_rqst_mod_cd     	;	}
	public String                getTrsp_rqst_tp_cd      (){	return trsp_rqst_tp_cd      	;	}
	public String                getCntr_rtn_yd_cd       (){	return cntr_rtn_yd_cd       	;	}
	public String                getCntr_pkup_yd_cd      (){	return cntr_pkup_yd_cd      	;	}
	public String                getCntr_rtn_dt          (){	return cntr_rtn_dt          	;	}
	public String                getCntr_pkup_dt         (){	return cntr_pkup_dt         	;	}
	public String                getRep_cmdt_cd          (){	return rep_cmdt_cd          	;	}
	public String                getRep_cmdt_desc        (){	return rep_cmdt_desc        	;	}
	public String                getTrsp_rqst_t1_ind_flg (){	return trsp_rqst_t1_ind_flg 	;	}
	public String                getSpcl_instr_rmk       (){	return spcl_instr_rmk       	;	}
	public String                getTrsp_rqst_proc_ind_cd(){	return trsp_rqst_proc_ind_cd	;	}
	public String                getCstms_clr_no         (){	return cstms_clr_no         	;	}
	public String                getTrsp_rqst_ord_rev_amt(){	return trsp_rqst_ord_rev_amt	;	}
	public String                getRev_curr_cd          (){	return rev_curr_cd          	;	}
	public String                getAct_cust_cnt_cd      (){	return act_cust_cnt_cd      	;	}
	public String                getAct_cust_seq         (){	return act_cust_seq         	;	}
	public String                getCxl_flg              (){	return cxl_flg              	;	}
	public String                getDcgo_seq             (){	return dcgo_seq             	;	}
	public String                getRc_seq               (){	return rc_seq               	;	}
	public String                getAwk_cgo_seq          (){	return awk_cgo_seq          	;	}
	public String                getTro_drp_off_seq      (){	return tro_drp_off_seq      	;	}
	public String                getTro_pkup_seq         (){	return tro_pkup_seq         	;	}
	public String                getTva_ind_cd           (){	return tva_ind_cd           	;	}
	public String                getTro_cfm_hlg_cd       (){	return tro_cfm_hlg_cd       	;	}
	public String                getTro_cfm_curr_cd      (){	return tro_cfm_curr_cd      	;	}
	public String                getTro_cfm_rev_amt      (){	return tro_cfm_rev_amt      	;	}
	public String                getTro_cfm_tva_ind_cd   (){	return tro_cfm_tva_ind_cd   	;	}
	public String                getCa_ind_cd            (){	return ca_ind_cd            	;	}
	public String                getTro_corr_no          (){	return tro_corr_no          	;	}
	public String                getTro_cfm_upd_dt       (){	return tro_cfm_upd_dt       	;	}
	public String                getTro_cfm_all_rt_cd    (){	return tro_cfm_all_rt_cd    	;	}
	public String                getTro_lod_ref_no       (){	return tro_lod_ref_no       	;	}
	public String                getCre_ofc_cd           (){	return cre_ofc_cd           	;	}
	public String                getCre_dt               (){	return cre_dt               	;	}
	public String                getCre_usr_id           (){	return cre_usr_id           	;	}
	public String                getUpd_dt               (){	return upd_dt               	;	}
	public String                getUpd_usr_id           (){	return upd_usr_id           	;	}
	public String                getEai_evnt_dt          (){	return eai_evnt_dt          	;	}
	public String                getTro_cfm_ofc_cd       (){	return tro_cfm_ofc_cd       	;	}
	public String                getTro_all_in_rt_cd     (){	return tro_all_in_rt_cd      	;	}

	// setter method is proceeding ..
	public void setIbflag               ( String                ibflag                ){	this.ibflag                = ibflag               	;	}
	public void setPage_rows            ( String                page_rows             ){	this.page_rows             = page_rows            	;	}
	public void setBkg_no               ( String                bkg_no                ){	this.bkg_no                = bkg_no               	;	}
	public void setBkg_no_split         ( String                bkg_no_split          ){	this.bkg_no_split          = bkg_no_split         	;	}
	public void setTrsp_rqst_ord_bnd_cd ( String                trsp_rqst_ord_bnd_cd  ){	this.trsp_rqst_ord_bnd_cd  = trsp_rqst_ord_bnd_cd 	;	}
	public void setTrsp_rqst_ord_seq    ( String                trsp_rqst_ord_seq     ){	this.trsp_rqst_ord_seq     = trsp_rqst_ord_seq    	;	}
	public void setCntr_tpsz_cd         ( String                cntr_tpsz_cd          ){	this.cntr_tpsz_cd          = cntr_tpsz_cd         	;	}
	public void setCntr_no              ( String                cntr_no               ){	this.cntr_no               = cntr_no              	;	}
	public void setCntr_wgt             ( String                cntr_wgt              ){	this.cntr_wgt              = cntr_wgt             	;	}
	public void setTrsp_rqst_hlg_cd     ( String                trsp_rqst_hlg_cd      ){	this.trsp_rqst_hlg_cd      = trsp_rqst_hlg_cd     	;	}
	public void setTrsp_rqst_mod_cd     ( String                trsp_rqst_mod_cd      ){	this.trsp_rqst_mod_cd      = trsp_rqst_mod_cd     	;	}
	public void setTrsp_rqst_tp_cd      ( String                trsp_rqst_tp_cd       ){	this.trsp_rqst_tp_cd       = trsp_rqst_tp_cd      	;	}
	public void setCntr_rtn_yd_cd       ( String                cntr_rtn_yd_cd        ){	this.cntr_rtn_yd_cd        = cntr_rtn_yd_cd       	;	}
	public void setCntr_pkup_yd_cd      ( String                cntr_pkup_yd_cd       ){	this.cntr_pkup_yd_cd       = cntr_pkup_yd_cd      	;	}
	public void setCntr_rtn_dt          ( String                cntr_rtn_dt           ){	this.cntr_rtn_dt           = cntr_rtn_dt          	;	}
	public void setCntr_pkup_dt         ( String                cntr_pkup_dt          ){	this.cntr_pkup_dt          = cntr_pkup_dt         	;	}
	public void setRep_cmdt_cd          ( String                rep_cmdt_cd           ){	this.rep_cmdt_cd           = rep_cmdt_cd          	;	}
	public void setRep_cmdt_desc        ( String                rep_cmdt_desc         ){	this.rep_cmdt_desc         = rep_cmdt_desc        	;	}
	public void setTrsp_rqst_t1_ind_flg ( String                trsp_rqst_t1_ind_flg  ){	this.trsp_rqst_t1_ind_flg  = trsp_rqst_t1_ind_flg 	;	}
	public void setSpcl_instr_rmk       ( String                spcl_instr_rmk        ){	this.spcl_instr_rmk        = spcl_instr_rmk       	;	}
	public void setTrsp_rqst_proc_ind_cd( String                trsp_rqst_proc_ind_cd ){	this.trsp_rqst_proc_ind_cd = trsp_rqst_proc_ind_cd	;	}
	public void setCstms_clr_no         ( String                cstms_clr_no          ){	this.cstms_clr_no          = cstms_clr_no         	;	}
	public void setTrsp_rqst_ord_rev_amt( String                trsp_rqst_ord_rev_amt ){	this.trsp_rqst_ord_rev_amt = trsp_rqst_ord_rev_amt	;	}
	public void setRev_curr_cd          ( String                rev_curr_cd           ){	this.rev_curr_cd           = rev_curr_cd          	;	}
	public void setAct_cust_cnt_cd      ( String                act_cust_cnt_cd       ){	this.act_cust_cnt_cd       = act_cust_cnt_cd      	;	}
	public void setAct_cust_seq         ( String                act_cust_seq          ){	this.act_cust_seq          = act_cust_seq         	;	}
	public void setCxl_flg              ( String                cxl_flg               ){	this.cxl_flg               = cxl_flg              	;	}
	public void setDcgo_seq             ( String                dcgo_seq              ){	this.dcgo_seq              = dcgo_seq             	;	}
	public void setRc_seq               ( String                rc_seq                ){	this.rc_seq                = rc_seq               	;	}
	public void setAwk_cgo_seq          ( String                awk_cgo_seq           ){	this.awk_cgo_seq           = awk_cgo_seq          	;	}
	public void setTro_drp_off_seq      ( String                tro_drp_off_seq       ){	this.tro_drp_off_seq       = tro_drp_off_seq      	;	}
	public void setTro_pkup_seq         ( String                tro_pkup_seq          ){	this.tro_pkup_seq          = tro_pkup_seq         	;	}
	public void setTva_ind_cd           ( String                tva_ind_cd            ){	this.tva_ind_cd            = tva_ind_cd           	;	}
	public void setTro_cfm_hlg_cd       ( String                tro_cfm_hlg_cd        ){	this.tro_cfm_hlg_cd        = tro_cfm_hlg_cd       	;	}
	public void setTro_cfm_curr_cd      ( String                tro_cfm_curr_cd       ){	this.tro_cfm_curr_cd       = tro_cfm_curr_cd      	;	}
	public void setTro_cfm_rev_amt      ( String                tro_cfm_rev_amt       ){	this.tro_cfm_rev_amt       = tro_cfm_rev_amt      	;	}
	public void setTro_cfm_tva_ind_cd   ( String                tro_cfm_tva_ind_cd    ){	this.tro_cfm_tva_ind_cd    = tro_cfm_tva_ind_cd   	;	}
	public void setCa_ind_cd            ( String                ca_ind_cd             ){	this.ca_ind_cd             = ca_ind_cd            	;	}
	public void setTro_corr_no          ( String                tro_corr_no           ){	this.tro_corr_no           = tro_corr_no          	;	}
	public void setTro_cfm_upd_dt       ( String                tro_cfm_upd_dt        ){	this.tro_cfm_upd_dt        = tro_cfm_upd_dt       	;	}
	public void setTro_cfm_all_rt_cd    ( String                tro_cfm_all_rt_cd     ){	this.tro_cfm_all_rt_cd     = tro_cfm_all_rt_cd    	;	}
	public void setTro_lod_ref_no       ( String                tro_lod_ref_no        ){	this.tro_lod_ref_no        = tro_lod_ref_no       	;	}
	public void setCre_ofc_cd           ( String                cre_ofc_cd            ){	this.cre_ofc_cd            = cre_ofc_cd           	;	}
	public void setCre_dt               ( String                cre_dt                ){	this.cre_dt                = cre_dt               	;	}
	public void setCre_usr_id           ( String                cre_usr_id            ){	this.cre_usr_id            = cre_usr_id           	;	}
	public void setUpd_dt               ( String                upd_dt                ){	this.upd_dt                = upd_dt               	;	}
	public void setUpd_usr_id           ( String                upd_usr_id            ){	this.upd_usr_id            = upd_usr_id           	;	}
	public void setEai_evnt_dt          ( String                eai_evnt_dt           ){	this.eai_evnt_dt           = eai_evnt_dt          	;	}
	public void setTro_cfm_ofc_cd       ( String                tro_cfm_ofc_cd        ){	this.tro_cfm_ofc_cd        = tro_cfm_ofc_cd       	;	}
	public void setTro_all_in_rt_cd     ( String                tro_all_in_rt_cd      ){	this.tro_all_in_rt_cd      = tro_all_in_rt_cd       ;	}

	public static TrsTrspRqstOrdHdVO fromRequest(HttpServletRequest request) {
		TrsTrspRqstOrdHdVO model = new TrsTrspRqstOrdHdVO();
		try {
			model.setIbflag               	(JSPUtil.getParameter(request, "ibflag               		".trim(), ""));
			model.setPage_rows            	(JSPUtil.getParameter(request, "page_rows            		".trim(), ""));
			model.setBkg_no               	(JSPUtil.getParameter(request, "bkg_no               		".trim(), ""));
			model.setBkg_no_split         	(JSPUtil.getParameter(request, "bkg_no_split         		".trim(), ""));
			model.setTrsp_rqst_ord_bnd_cd 	(JSPUtil.getParameter(request, "trsp_rqst_ord_bnd_cd 		".trim(), ""));
			model.setTrsp_rqst_ord_seq    	(JSPUtil.getParameter(request, "trsp_rqst_ord_seq    		".trim(), ""));
			model.setCntr_tpsz_cd         	(JSPUtil.getParameter(request, "cntr_tpsz_cd         		".trim(), ""));
			model.setCntr_no              	(JSPUtil.getParameter(request, "cntr_no              		".trim(), ""));
			model.setCntr_wgt             	(JSPUtil.getParameter(request, "cntr_wgt             		".trim(), ""));
			model.setTrsp_rqst_hlg_cd     	(JSPUtil.getParameter(request, "trsp_rqst_hlg_cd     		".trim(), ""));
			model.setTrsp_rqst_mod_cd     	(JSPUtil.getParameter(request, "trsp_rqst_mod_cd     		".trim(), ""));
			model.setTrsp_rqst_tp_cd      	(JSPUtil.getParameter(request, "trsp_rqst_tp_cd      		".trim(), ""));
			model.setCntr_rtn_yd_cd       	(JSPUtil.getParameter(request, "cntr_rtn_yd_cd       		".trim(), ""));
			model.setCntr_pkup_yd_cd      	(JSPUtil.getParameter(request, "cntr_pkup_yd_cd      		".trim(), ""));
			model.setCntr_rtn_dt          	(JSPUtil.getParameter(request, "cntr_rtn_dt          		".trim(), ""));
			model.setCntr_pkup_dt         	(JSPUtil.getParameter(request, "cntr_pkup_dt         		".trim(), ""));
			model.setRep_cmdt_cd          	(JSPUtil.getParameter(request, "rep_cmdt_cd          		".trim(), ""));
			model.setRep_cmdt_desc        	(JSPUtil.getParameter(request, "rep_cmdt_desc        		".trim(), ""));
			model.setTrsp_rqst_t1_ind_flg 	(JSPUtil.getParameter(request, "trsp_rqst_t1_ind_flg 		".trim(), ""));
			model.setSpcl_instr_rmk       	(JSPUtil.getParameter(request, "spcl_instr_rmk       		".trim(), ""));
			model.setTrsp_rqst_proc_ind_cd	(JSPUtil.getParameter(request, "trsp_rqst_proc_ind_cd		".trim(), ""));
			model.setCstms_clr_no         	(JSPUtil.getParameter(request, "cstms_clr_no         		".trim(), ""));
			model.setTrsp_rqst_ord_rev_amt	(JSPUtil.getParameter(request, "trsp_rqst_ord_rev_amt		".trim(), ""));
			model.setRev_curr_cd          	(JSPUtil.getParameter(request, "rev_curr_cd          		".trim(), ""));
			model.setAct_cust_cnt_cd      	(JSPUtil.getParameter(request, "act_cust_cnt_cd      		".trim(), ""));
			model.setAct_cust_seq         	(JSPUtil.getParameter(request, "act_cust_seq         		".trim(), ""));
			model.setCxl_flg              	(JSPUtil.getParameter(request, "cxl_flg              		".trim(), ""));
			model.setDcgo_seq             	(JSPUtil.getParameter(request, "dcgo_seq             		".trim(), ""));
			model.setRc_seq               	(JSPUtil.getParameter(request, "rc_seq               		".trim(), ""));
			model.setAwk_cgo_seq          	(JSPUtil.getParameter(request, "awk_cgo_seq          		".trim(), ""));
			model.setTro_drp_off_seq      	(JSPUtil.getParameter(request, "tro_drp_off_seq      		".trim(), ""));
			model.setTro_pkup_seq         	(JSPUtil.getParameter(request, "tro_pkup_seq         		".trim(), ""));
			model.setTva_ind_cd           	(JSPUtil.getParameter(request, "tva_ind_cd           		".trim(), ""));
			model.setTro_cfm_hlg_cd       	(JSPUtil.getParameter(request, "tro_cfm_hlg_cd       		".trim(), ""));
			model.setTro_cfm_curr_cd      	(JSPUtil.getParameter(request, "tro_cfm_curr_cd      		".trim(), ""));
			model.setTro_cfm_rev_amt      	(JSPUtil.getParameter(request, "tro_cfm_rev_amt      		".trim(), ""));
			model.setTro_cfm_tva_ind_cd   	(JSPUtil.getParameter(request, "tro_cfm_tva_ind_cd   		".trim(), ""));
			model.setCa_ind_cd            	(JSPUtil.getParameter(request, "ca_ind_cd            		".trim(), ""));
			model.setTro_corr_no          	(JSPUtil.getParameter(request, "tro_corr_no          		".trim(), ""));
			model.setTro_cfm_upd_dt       	(JSPUtil.getParameter(request, "tro_cfm_upd_dt       		".trim(), ""));
			model.setTro_cfm_all_rt_cd    	(JSPUtil.getParameter(request, "tro_cfm_all_rt_cd    		".trim(), ""));
			model.setTro_lod_ref_no       	(JSPUtil.getParameter(request, "tro_lod_ref_no       		".trim(), ""));
			model.setCre_ofc_cd           	(JSPUtil.getParameter(request, "cre_ofc_cd           		".trim(), ""));
			model.setCre_dt               	(JSPUtil.getParameter(request, "cre_dt               		".trim(), ""));
			model.setCre_usr_id           	(JSPUtil.getParameter(request, "cre_usr_id           		".trim(), ""));
			model.setUpd_dt               	(JSPUtil.getParameter(request, "upd_dt               		".trim(), ""));
			model.setUpd_usr_id           	(JSPUtil.getParameter(request, "upd_usr_id           		".trim(), ""));
			model.setEai_evnt_dt          	(JSPUtil.getParameter(request, "eai_evnt_dt          		".trim(), ""));
			model.setTro_cfm_ofc_cd       	(JSPUtil.getParameter(request, "tro_cfm_ofc_cd       		".trim(), ""));
			model.setTro_all_in_rt_cd     	(JSPUtil.getParameter(request, "tro_all_in_rt_cd       		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		TrsTrspRqstOrdHdVO model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag                =  (JSPUtil.getParameter(request, "ibflag               		".trim(), length));
			String[] page_rows             =  (JSPUtil.getParameter(request, "page_rows            		".trim(), length));
			String[] bkg_no                =  (JSPUtil.getParameter(request, "bkg_no               		".trim(), length));
			String[] bkg_no_split          =  (JSPUtil.getParameter(request, "bkg_no_split         		".trim(), length));
			String[] trsp_rqst_ord_bnd_cd  =  (JSPUtil.getParameter(request, "trsp_rqst_ord_bnd_cd 		".trim(), length));
			String[] trsp_rqst_ord_seq     =  (JSPUtil.getParameter(request, "trsp_rqst_ord_seq    		".trim(), length));
			String[] cntr_tpsz_cd          =  (JSPUtil.getParameter(request, "cntr_tpsz_cd         		".trim(), length));
			String[] cntr_no               =  (JSPUtil.getParameter(request, "cntr_no              		".trim(), length));
			String[] cntr_wgt              =  (JSPUtil.getParameter(request, "cntr_wgt             		".trim(), length));
			String[] trsp_rqst_hlg_cd      =  (JSPUtil.getParameter(request, "trsp_rqst_hlg_cd     		".trim(), length));
			String[] trsp_rqst_mod_cd      =  (JSPUtil.getParameter(request, "trsp_rqst_mod_cd     		".trim(), length));
			String[] trsp_rqst_tp_cd       =  (JSPUtil.getParameter(request, "trsp_rqst_tp_cd      		".trim(), length));
			String[] cntr_rtn_yd_cd        =  (JSPUtil.getParameter(request, "cntr_rtn_yd_cd       		".trim(), length));
			String[] cntr_pkup_yd_cd       =  (JSPUtil.getParameter(request, "cntr_pkup_yd_cd      		".trim(), length));
			String[] cntr_rtn_dt           =  (JSPUtil.getParameter(request, "cntr_rtn_dt          		".trim(), length));
			String[] cntr_pkup_dt          =  (JSPUtil.getParameter(request, "cntr_pkup_dt         		".trim(), length));
			String[] rep_cmdt_cd           =  (JSPUtil.getParameter(request, "rep_cmdt_cd          		".trim(), length));
			String[] rep_cmdt_desc         =  (JSPUtil.getParameter(request, "rep_cmdt_desc        		".trim(), length));
			String[] trsp_rqst_t1_ind_flg  =  (JSPUtil.getParameter(request, "trsp_rqst_t1_ind_flg 		".trim(), length));
			String[] spcl_instr_rmk        =  (JSPUtil.getParameter(request, "spcl_instr_rmk       		".trim(), length));
			String[] trsp_rqst_proc_ind_cd =  (JSPUtil.getParameter(request, "trsp_rqst_proc_ind_cd		".trim(), length));
			String[] cstms_clr_no          =  (JSPUtil.getParameter(request, "cstms_clr_no         		".trim(), length));
			String[] trsp_rqst_ord_rev_amt =  (JSPUtil.getParameter(request, "trsp_rqst_ord_rev_amt		".trim(), length));
			String[] rev_curr_cd           =  (JSPUtil.getParameter(request, "rev_curr_cd          		".trim(), length));
			String[] act_cust_cnt_cd       =  (JSPUtil.getParameter(request, "act_cust_cnt_cd      		".trim(), length));
			String[] act_cust_seq          =  (JSPUtil.getParameter(request, "act_cust_seq         		".trim(), length));
			String[] cxl_flg               =  (JSPUtil.getParameter(request, "cxl_flg              		".trim(), length));
			String[] dcgo_seq              =  (JSPUtil.getParameter(request, "dcgo_seq             		".trim(), length));
			String[] rc_seq                =  (JSPUtil.getParameter(request, "rc_seq               		".trim(), length));
			String[] awk_cgo_seq           =  (JSPUtil.getParameter(request, "awk_cgo_seq          		".trim(), length));
			String[] tro_drp_off_seq       =  (JSPUtil.getParameter(request, "tro_drp_off_seq      		".trim(), length));
			String[] tro_pkup_seq          =  (JSPUtil.getParameter(request, "tro_pkup_seq         		".trim(), length));
			String[] tva_ind_cd            =  (JSPUtil.getParameter(request, "tva_ind_cd           		".trim(), length));
			String[] tro_cfm_hlg_cd        =  (JSPUtil.getParameter(request, "tro_cfm_hlg_cd       		".trim(), length));
			String[] tro_cfm_curr_cd       =  (JSPUtil.getParameter(request, "tro_cfm_curr_cd      		".trim(), length));
			String[] tro_cfm_rev_amt       =  (JSPUtil.getParameter(request, "tro_cfm_rev_amt      		".trim(), length));
			String[] tro_cfm_tva_ind_cd    =  (JSPUtil.getParameter(request, "tro_cfm_tva_ind_cd   		".trim(), length));
			String[] ca_ind_cd             =  (JSPUtil.getParameter(request, "ca_ind_cd            		".trim(), length));
			String[] tro_corr_no           =  (JSPUtil.getParameter(request, "tro_corr_no          		".trim(), length));
			String[] tro_cfm_upd_dt        =  (JSPUtil.getParameter(request, "tro_cfm_upd_dt       		".trim(), length));
			String[] tro_cfm_all_rt_cd     =  (JSPUtil.getParameter(request, "tro_cfm_all_rt_cd    		".trim(), length));
			String[] tro_lod_ref_no        =  (JSPUtil.getParameter(request, "tro_lod_ref_no       		".trim(), length));
			String[] cre_ofc_cd            =  (JSPUtil.getParameter(request, "cre_ofc_cd           		".trim(), length));
			String[] cre_dt                =  (JSPUtil.getParameter(request, "cre_dt               		".trim(), length));
			String[] cre_usr_id            =  (JSPUtil.getParameter(request, "cre_usr_id           		".trim(), length));
			String[] upd_dt                =  (JSPUtil.getParameter(request, "upd_dt               		".trim(), length));
			String[] upd_usr_id            =  (JSPUtil.getParameter(request, "upd_usr_id           		".trim(), length));
			String[] eai_evnt_dt           =  (JSPUtil.getParameter(request, "eai_evnt_dt          		".trim(), length));
			String[] tro_cfm_ofc_cd        =  (JSPUtil.getParameter(request, "tro_cfm_ofc_cd       		".trim(), length));
			String[] tro_all_in_rt_cd      =  (JSPUtil.getParameter(request, "tro_all_in_rt_cd       	".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new TrsTrspRqstOrdHdVO();
				model.setIbflag               		  (ibflag               	[i]);
				model.setPage_rows            		  (page_rows            	[i]);
				model.setBkg_no               		  (bkg_no               	[i]);
				model.setBkg_no_split         		  (bkg_no_split         	[i]);
				model.setTrsp_rqst_ord_bnd_cd 		  (trsp_rqst_ord_bnd_cd 	[i]);
				model.setTrsp_rqst_ord_seq    		  (trsp_rqst_ord_seq    	[i]);
				model.setCntr_tpsz_cd         		  (cntr_tpsz_cd         	[i]);
				model.setCntr_no              		  (cntr_no              	[i]);
				model.setCntr_wgt             		  (cntr_wgt             	[i]);
				model.setTrsp_rqst_hlg_cd     		  (trsp_rqst_hlg_cd     	[i]);
				model.setTrsp_rqst_mod_cd     		  (trsp_rqst_mod_cd     	[i]);
				model.setTrsp_rqst_tp_cd      		  (trsp_rqst_tp_cd      	[i]);
				model.setCntr_rtn_yd_cd       		  (cntr_rtn_yd_cd       	[i]);
				model.setCntr_pkup_yd_cd      		  (cntr_pkup_yd_cd      	[i]);
				model.setCntr_rtn_dt          		  (cntr_rtn_dt          	[i]);
				model.setCntr_pkup_dt         		  (cntr_pkup_dt         	[i]);
				model.setRep_cmdt_cd          		  (rep_cmdt_cd          	[i]);
				model.setRep_cmdt_desc        		  (rep_cmdt_desc        	[i]);
				model.setTrsp_rqst_t1_ind_flg 		  (trsp_rqst_t1_ind_flg 	[i]);
				model.setSpcl_instr_rmk       		  (spcl_instr_rmk       	[i]);
				model.setTrsp_rqst_proc_ind_cd		  (trsp_rqst_proc_ind_cd	[i]);
				model.setCstms_clr_no         		  (cstms_clr_no         	[i]);
				model.setTrsp_rqst_ord_rev_amt		  (trsp_rqst_ord_rev_amt	[i]);
				model.setRev_curr_cd          		  (rev_curr_cd          	[i]);
				model.setAct_cust_cnt_cd      		  (act_cust_cnt_cd      	[i]);
				model.setAct_cust_seq         		  (act_cust_seq         	[i]);
				model.setCxl_flg              		  (cxl_flg              	[i]);
				model.setDcgo_seq             		  (dcgo_seq             	[i]);
				model.setRc_seq               		  (rc_seq               	[i]);
				model.setAwk_cgo_seq          		  (awk_cgo_seq          	[i]);
				model.setTro_drp_off_seq      		  (tro_drp_off_seq      	[i]);
				model.setTro_pkup_seq         		  (tro_pkup_seq         	[i]);
				model.setTva_ind_cd           		  (tva_ind_cd           	[i]);
				model.setTro_cfm_hlg_cd       		  (tro_cfm_hlg_cd       	[i]);
				model.setTro_cfm_curr_cd      		  (tro_cfm_curr_cd      	[i]);
				model.setTro_cfm_rev_amt      		  (tro_cfm_rev_amt      	[i]);
				model.setTro_cfm_tva_ind_cd   		  (tro_cfm_tva_ind_cd   	[i]);
				model.setCa_ind_cd            		  (ca_ind_cd            	[i]);
				model.setTro_corr_no          		  (tro_corr_no          	[i]);
				model.setTro_cfm_upd_dt       		  (tro_cfm_upd_dt       	[i]);
				model.setTro_cfm_all_rt_cd    		  (tro_cfm_all_rt_cd    	[i]);
				model.setTro_lod_ref_no       		  (tro_lod_ref_no       	[i]);
				model.setCre_ofc_cd           		  (cre_ofc_cd           	[i]);
				model.setCre_dt               		  (cre_dt               	[i]);
				model.setCre_usr_id           		  (cre_usr_id           	[i]);
				model.setUpd_dt               		  (upd_dt               	[i]);
				model.setUpd_usr_id           		  (upd_usr_id           	[i]);
				model.setEai_evnt_dt          		  (eai_evnt_dt          	[i]);
				model.setTro_cfm_ofc_cd       		  (tro_cfm_ofc_cd       	[i]);
				model.setTro_all_in_rt_cd      		  (tro_all_in_rt_cd       	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		TrsTrspRqstOrdHdVO model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag                =  (JSPUtil.getParameter(request, prefix + "ibflag               		".trim(), length));
			String[] page_rows             =  (JSPUtil.getParameter(request, prefix + "page_rows            		".trim(), length));
			String[] bkg_no                =  (JSPUtil.getParameter(request, prefix + "bkg_no               		".trim(), length));
			String[] bkg_no_split          =  (JSPUtil.getParameter(request, prefix + "bkg_no_split         		".trim(), length));
			String[] trsp_rqst_ord_bnd_cd  =  (JSPUtil.getParameter(request, prefix + "trsp_rqst_ord_bnd_cd 		".trim(), length));
			String[] trsp_rqst_ord_seq     =  (JSPUtil.getParameter(request, prefix + "trsp_rqst_ord_seq    		".trim(), length));
			String[] cntr_tpsz_cd          =  (JSPUtil.getParameter(request, prefix + "cntr_tpsz_cd         		".trim(), length));
			String[] cntr_no               =  (JSPUtil.getParameter(request, prefix + "cntr_no              		".trim(), length));
			String[] cntr_wgt              =  (JSPUtil.getParameter(request, prefix + "cntr_wgt             		".trim(), length));
			String[] trsp_rqst_hlg_cd      =  (JSPUtil.getParameter(request, prefix + "trsp_rqst_hlg_cd     		".trim(), length));
			String[] trsp_rqst_mod_cd      =  (JSPUtil.getParameter(request, prefix + "trsp_rqst_mod_cd     		".trim(), length));
			String[] trsp_rqst_tp_cd       =  (JSPUtil.getParameter(request, prefix + "trsp_rqst_tp_cd      		".trim(), length));
			String[] cntr_rtn_yd_cd        =  (JSPUtil.getParameter(request, prefix + "cntr_rtn_yd_cd       		".trim(), length));
			String[] cntr_pkup_yd_cd       =  (JSPUtil.getParameter(request, prefix + "cntr_pkup_yd_cd      		".trim(), length));
			String[] cntr_rtn_dt           =  (JSPUtil.getParameter(request, prefix + "cntr_rtn_dt          		".trim(), length));
			String[] cntr_pkup_dt          =  (JSPUtil.getParameter(request, prefix + "cntr_pkup_dt         		".trim(), length));
			String[] rep_cmdt_cd           =  (JSPUtil.getParameter(request, prefix + "rep_cmdt_cd          		".trim(), length));
			String[] rep_cmdt_desc         =  (JSPUtil.getParameter(request, prefix + "rep_cmdt_desc        		".trim(), length));
			String[] trsp_rqst_t1_ind_flg  =  (JSPUtil.getParameter(request, prefix + "trsp_rqst_t1_ind_flg 		".trim(), length));
			String[] spcl_instr_rmk        =  (JSPUtil.getParameter(request, prefix + "spcl_instr_rmk       		".trim(), length));
			String[] trsp_rqst_proc_ind_cd =  (JSPUtil.getParameter(request, prefix + "trsp_rqst_proc_ind_cd		".trim(), length));
			String[] cstms_clr_no          =  (JSPUtil.getParameter(request, prefix + "cstms_clr_no         		".trim(), length));
			String[] trsp_rqst_ord_rev_amt =  (JSPUtil.getParameter(request, prefix + "trsp_rqst_ord_rev_amt		".trim(), length));
			String[] rev_curr_cd           =  (JSPUtil.getParameter(request, prefix + "rev_curr_cd          		".trim(), length));
			String[] act_cust_cnt_cd       =  (JSPUtil.getParameter(request, prefix + "act_cust_cnt_cd      		".trim(), length));
			String[] act_cust_seq          =  (JSPUtil.getParameter(request, prefix + "act_cust_seq         		".trim(), length));
			String[] cxl_flg               =  (JSPUtil.getParameter(request, prefix + "cxl_flg              		".trim(), length));
			String[] dcgo_seq              =  (JSPUtil.getParameter(request, prefix + "dcgo_seq             		".trim(), length));
			String[] rc_seq                =  (JSPUtil.getParameter(request, prefix + "rc_seq               		".trim(), length));
			String[] awk_cgo_seq           =  (JSPUtil.getParameter(request, prefix + "awk_cgo_seq          		".trim(), length));
			String[] tro_drp_off_seq       =  (JSPUtil.getParameter(request, prefix + "tro_drp_off_seq      		".trim(), length));
			String[] tro_pkup_seq          =  (JSPUtil.getParameter(request, prefix + "tro_pkup_seq         		".trim(), length));
			String[] tva_ind_cd            =  (JSPUtil.getParameter(request, prefix + "tva_ind_cd           		".trim(), length));
			String[] tro_cfm_hlg_cd        =  (JSPUtil.getParameter(request, prefix + "tro_cfm_hlg_cd       		".trim(), length));
			String[] tro_cfm_curr_cd       =  (JSPUtil.getParameter(request, prefix + "tro_cfm_curr_cd      		".trim(), length));
			String[] tro_cfm_rev_amt       =  (JSPUtil.getParameter(request, prefix + "tro_cfm_rev_amt      		".trim(), length));
			String[] tro_cfm_tva_ind_cd    =  (JSPUtil.getParameter(request, prefix + "tro_cfm_tva_ind_cd   		".trim(), length));
			String[] ca_ind_cd             =  (JSPUtil.getParameter(request, prefix + "ca_ind_cd            		".trim(), length));
			String[] tro_corr_no           =  (JSPUtil.getParameter(request, prefix + "tro_corr_no          		".trim(), length));
			String[] tro_cfm_upd_dt        =  (JSPUtil.getParameter(request, prefix + "tro_cfm_upd_dt       		".trim(), length));
			String[] tro_cfm_all_rt_cd     =  (JSPUtil.getParameter(request, prefix + "tro_cfm_all_rt_cd    		".trim(), length));
			String[] tro_lod_ref_no        =  (JSPUtil.getParameter(request, prefix + "tro_lod_ref_no       		".trim(), length));
			String[] cre_ofc_cd            =  (JSPUtil.getParameter(request, prefix + "cre_ofc_cd           		".trim(), length));
			String[] cre_dt                =  (JSPUtil.getParameter(request, prefix + "cre_dt               		".trim(), length));
			String[] cre_usr_id            =  (JSPUtil.getParameter(request, prefix + "cre_usr_id           		".trim(), length));
			String[] upd_dt                =  (JSPUtil.getParameter(request, prefix + "upd_dt               		".trim(), length));
			String[] upd_usr_id            =  (JSPUtil.getParameter(request, prefix + "upd_usr_id           		".trim(), length));
			String[] eai_evnt_dt           =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt          		".trim(), length));
			String[] tro_cfm_ofc_cd        =  (JSPUtil.getParameter(request, prefix + "tro_cfm_ofc_cd       		".trim(), length));
			String[] tro_all_in_rt_cd      =  (JSPUtil.getParameter(request, prefix + "tro_all_in_rt_cd       		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new TrsTrspRqstOrdHdVO();
				model.setIbflag               		  ( ibflag               	[i]);
				model.setPage_rows            		  ( page_rows            	[i]);
				model.setBkg_no               		  ( bkg_no               	[i]);
				model.setBkg_no_split         		  ( bkg_no_split         	[i]);
				model.setTrsp_rqst_ord_bnd_cd 		  ( trsp_rqst_ord_bnd_cd 	[i]);
				model.setTrsp_rqst_ord_seq    		  ( trsp_rqst_ord_seq    	[i]);
				model.setCntr_tpsz_cd         		  ( cntr_tpsz_cd         	[i]);
				model.setCntr_no              		  ( cntr_no              	[i]);
				model.setCntr_wgt             		  ( cntr_wgt             	[i]);
				model.setTrsp_rqst_hlg_cd     		  ( trsp_rqst_hlg_cd     	[i]);
				model.setTrsp_rqst_mod_cd     		  ( trsp_rqst_mod_cd     	[i]);
				model.setTrsp_rqst_tp_cd      		  ( trsp_rqst_tp_cd      	[i]);
				model.setCntr_rtn_yd_cd       		  ( cntr_rtn_yd_cd       	[i]);
				model.setCntr_pkup_yd_cd      		  ( cntr_pkup_yd_cd      	[i]);
				model.setCntr_rtn_dt          		  ( cntr_rtn_dt          	[i]);
				model.setCntr_pkup_dt         		  ( cntr_pkup_dt         	[i]);
				model.setRep_cmdt_cd          		  ( rep_cmdt_cd          	[i]);
				model.setRep_cmdt_desc        		  ( rep_cmdt_desc        	[i]);
				model.setTrsp_rqst_t1_ind_flg 		  ( trsp_rqst_t1_ind_flg 	[i]);
				model.setSpcl_instr_rmk       		  ( spcl_instr_rmk       	[i]);
				model.setTrsp_rqst_proc_ind_cd		  ( trsp_rqst_proc_ind_cd	[i]);
				model.setCstms_clr_no         		  ( cstms_clr_no         	[i]);
				model.setTrsp_rqst_ord_rev_amt		  ( trsp_rqst_ord_rev_amt	[i]);
				model.setRev_curr_cd          		  ( rev_curr_cd          	[i]);
				model.setAct_cust_cnt_cd      		  ( act_cust_cnt_cd      	[i]);
				model.setAct_cust_seq         		  ( act_cust_seq         	[i]);
				model.setCxl_flg              		  ( cxl_flg              	[i]);
				model.setDcgo_seq             		  ( dcgo_seq             	[i]);
				model.setRc_seq               		  ( rc_seq               	[i]);
				model.setAwk_cgo_seq          		  ( awk_cgo_seq          	[i]);
				model.setTro_drp_off_seq      		  ( tro_drp_off_seq      	[i]);
				model.setTro_pkup_seq         		  ( tro_pkup_seq         	[i]);
				model.setTva_ind_cd           		  ( tva_ind_cd           	[i]);
				model.setTro_cfm_hlg_cd       		  ( tro_cfm_hlg_cd       	[i]);
				model.setTro_cfm_curr_cd      		  ( tro_cfm_curr_cd      	[i]);
				model.setTro_cfm_rev_amt      		  ( tro_cfm_rev_amt      	[i]);
				model.setTro_cfm_tva_ind_cd   		  ( tro_cfm_tva_ind_cd   	[i]);
				model.setCa_ind_cd            		  ( ca_ind_cd            	[i]);
				model.setTro_corr_no          		  ( tro_corr_no          	[i]);
				model.setTro_cfm_upd_dt       		  ( tro_cfm_upd_dt       	[i]);
				model.setTro_cfm_all_rt_cd    		  ( tro_cfm_all_rt_cd    	[i]);
				model.setTro_lod_ref_no       		  ( tro_lod_ref_no       	[i]);
				model.setCre_ofc_cd           		  ( cre_ofc_cd           	[i]);
				model.setCre_dt               		  ( cre_dt               	[i]);
				model.setCre_usr_id           		  ( cre_usr_id           	[i]);
				model.setUpd_dt               		  ( upd_dt               	[i]);
				model.setUpd_usr_id           		  ( upd_usr_id           	[i]);
				model.setEai_evnt_dt          		  ( eai_evnt_dt          	[i]);
				model.setTro_cfm_ofc_cd       		  ( tro_cfm_ofc_cd       	[i]);
				model.setTro_all_in_rt_cd      		  ( tro_all_in_rt_cd       	[i]);
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
