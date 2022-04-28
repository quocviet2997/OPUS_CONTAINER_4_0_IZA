/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : MDM_CHARGE.java
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
public final class MdmCharge implements java.io.Serializable {

	private String           ibflag           = "";
	private String           page_rows        = "";
	private String           chg_cd           = "";
	private String           chg_nm           = "";
	private String           frt_chg_tp_cd    = "";
	private String           sen_chg_acct_cd  = "";
	private String           hjs_chg_acct_cd  = "";
	private String           rep_chg_cd       = "";
	private String           chg_rev_tp_cd    = "";
	private String           chg_aply_tp_cd   = "";
	private String           chg_aply_area_cd = "";
	private String           cy_rd_term_flg   = "";
	private String           cfs_rd_term_flg  = "";
	private String           dor_rd_term_flg  = "";
	private String           na_rd_term_flg   = "";
	private String           tkl_tml_flg      = "";
	private String           aply_svc_mod_flg = "";
	private String           use_co_tp_cd     = "";
	private String           auto_rat_flg     = "";
	private String           sen_grp_chg_cd   = "";
	private String           chg_edi_cd       = "";
	private String           dp_seq           = "";
	private String           chg_sts_cd       = "";
	private String           cre_usr_id       = "";
	private String           cre_dt           = "";
	private String           upd_usr_id       = "";
	private String           upd_dt           = "";
	private String           delt_flg         = "";
	private String           eai_evnt_dt      = "";

	public MdmCharge(){}

	public MdmCharge(
			String           ibflag          ,
			String           page_rows       ,
			String           chg_cd          ,
			String           chg_nm          ,
			String           frt_chg_tp_cd   ,
			String           sen_chg_acct_cd ,
			String           hjs_chg_acct_cd ,
			String           rep_chg_cd      ,
			String           chg_rev_tp_cd   ,
			String           chg_aply_tp_cd  ,
			String           chg_aply_area_cd,
			String           cy_rd_term_flg  ,
			String           cfs_rd_term_flg ,
			String           dor_rd_term_flg ,
			String           na_rd_term_flg  ,
			String           tkl_tml_flg     ,
			String           aply_svc_mod_flg,
			String           use_co_tp_cd    ,
			String           auto_rat_flg    ,
			String           sen_grp_chg_cd  ,
			String           chg_edi_cd      ,
			String           dp_seq          ,
			String           chg_sts_cd      ,
			String           cre_usr_id      ,
			String           cre_dt          ,
			String           upd_usr_id      ,
			String           upd_dt          ,
			String           delt_flg        ,
			String           eai_evnt_dt     ){
		this.ibflag           = ibflag          ;
		this.page_rows        = page_rows       ;
		this.chg_cd           = chg_cd          ;
		this.chg_nm           = chg_nm          ;
		this.frt_chg_tp_cd    = frt_chg_tp_cd   ;
		this.sen_chg_acct_cd  = sen_chg_acct_cd ;
		this.hjs_chg_acct_cd  = hjs_chg_acct_cd ;
		this.rep_chg_cd       = rep_chg_cd      ;
		this.chg_rev_tp_cd    = chg_rev_tp_cd   ;
		this.chg_aply_tp_cd   = chg_aply_tp_cd  ;
		this.chg_aply_area_cd = chg_aply_area_cd;
		this.cy_rd_term_flg   = cy_rd_term_flg  ;
		this.cfs_rd_term_flg  = cfs_rd_term_flg ;
		this.dor_rd_term_flg  = dor_rd_term_flg ;
		this.na_rd_term_flg   = na_rd_term_flg  ;
		this.tkl_tml_flg      = tkl_tml_flg     ;
		this.aply_svc_mod_flg = aply_svc_mod_flg;
		this.use_co_tp_cd     = use_co_tp_cd    ;
		this.auto_rat_flg     = auto_rat_flg    ;
		this.sen_grp_chg_cd   = sen_grp_chg_cd  ;
		this.chg_edi_cd       = chg_edi_cd      ;
		this.dp_seq           = dp_seq          ;
		this.chg_sts_cd       = chg_sts_cd      ;
		this.cre_usr_id       = cre_usr_id      ;
		this.cre_dt           = cre_dt          ;
		this.upd_usr_id       = upd_usr_id      ;
		this.upd_dt           = upd_dt          ;
		this.delt_flg         = delt_flg        ;
		this.eai_evnt_dt      = eai_evnt_dt     ;
	}

	// getter method is proceeding ..
	public String           getIbflag          (){	return ibflag          	;	}
	public String           getPage_rows       (){	return page_rows       	;	}
	public String           getChg_cd          (){	return chg_cd          	;	}
	public String           getChg_nm          (){	return chg_nm          	;	}
	public String           getFrt_chg_tp_cd   (){	return frt_chg_tp_cd   	;	}
	public String           getSen_chg_acct_cd (){	return sen_chg_acct_cd 	;	}
	public String           getHjs_chg_acct_cd (){	return hjs_chg_acct_cd 	;	}
	public String           getRep_chg_cd      (){	return rep_chg_cd      	;	}
	public String           getChg_rev_tp_cd   (){	return chg_rev_tp_cd   	;	}
	public String           getChg_aply_tp_cd  (){	return chg_aply_tp_cd  	;	}
	public String           getChg_aply_area_cd(){	return chg_aply_area_cd	;	}
	public String           getCy_rd_term_flg  (){	return cy_rd_term_flg  	;	}
	public String           getCfs_rd_term_flg (){	return cfs_rd_term_flg 	;	}
	public String           getDor_rd_term_flg (){	return dor_rd_term_flg 	;	}
	public String           getNa_rd_term_flg  (){	return na_rd_term_flg  	;	}
	public String           getTkl_tml_flg     (){	return tkl_tml_flg     	;	}
	public String           getAply_svc_mod_flg(){	return aply_svc_mod_flg	;	}
	public String           getUse_co_tp_cd    (){	return use_co_tp_cd    	;	}
	public String           getAuto_rat_flg    (){	return auto_rat_flg    	;	}
	public String           getSen_grp_chg_cd  (){	return sen_grp_chg_cd  	;	}
	public String           getChg_edi_cd      (){	return chg_edi_cd      	;	}
	public String           getDp_seq          (){	return dp_seq          	;	}
	public String           getChg_sts_cd      (){	return chg_sts_cd      	;	}
	public String           getCre_usr_id      (){	return cre_usr_id      	;	}
	public String           getCre_dt          (){	return cre_dt          	;	}
	public String           getUpd_usr_id      (){	return upd_usr_id      	;	}
	public String           getUpd_dt          (){	return upd_dt          	;	}
	public String           getDelt_flg        (){	return delt_flg        	;	}
	public String           getEai_evnt_dt     (){	return eai_evnt_dt     	;	}

	// setter method is proceeding ..
	public void setIbflag          ( String           ibflag           ){	this.ibflag           = ibflag          	;	}
	public void setPage_rows       ( String           page_rows        ){	this.page_rows        = page_rows       	;	}
	public void setChg_cd          ( String           chg_cd           ){	this.chg_cd           = chg_cd          	;	}
	public void setChg_nm          ( String           chg_nm           ){	this.chg_nm           = chg_nm          	;	}
	public void setFrt_chg_tp_cd   ( String           frt_chg_tp_cd    ){	this.frt_chg_tp_cd    = frt_chg_tp_cd   	;	}
	public void setSen_chg_acct_cd ( String           sen_chg_acct_cd  ){	this.sen_chg_acct_cd  = sen_chg_acct_cd 	;	}
	public void setHjs_chg_acct_cd ( String           hjs_chg_acct_cd  ){	this.hjs_chg_acct_cd  = hjs_chg_acct_cd 	;	}
	public void setRep_chg_cd      ( String           rep_chg_cd       ){	this.rep_chg_cd       = rep_chg_cd      	;	}
	public void setChg_rev_tp_cd   ( String           chg_rev_tp_cd    ){	this.chg_rev_tp_cd    = chg_rev_tp_cd   	;	}
	public void setChg_aply_tp_cd  ( String           chg_aply_tp_cd   ){	this.chg_aply_tp_cd   = chg_aply_tp_cd  	;	}
	public void setChg_aply_area_cd( String           chg_aply_area_cd ){	this.chg_aply_area_cd = chg_aply_area_cd	;	}
	public void setCy_rd_term_flg  ( String           cy_rd_term_flg   ){	this.cy_rd_term_flg   = cy_rd_term_flg  	;	}
	public void setCfs_rd_term_flg ( String           cfs_rd_term_flg  ){	this.cfs_rd_term_flg  = cfs_rd_term_flg 	;	}
	public void setDor_rd_term_flg ( String           dor_rd_term_flg  ){	this.dor_rd_term_flg  = dor_rd_term_flg 	;	}
	public void setNa_rd_term_flg  ( String           na_rd_term_flg   ){	this.na_rd_term_flg   = na_rd_term_flg  	;	}
	public void setTkl_tml_flg     ( String           tkl_tml_flg      ){	this.tkl_tml_flg      = tkl_tml_flg     	;	}
	public void setAply_svc_mod_flg( String           aply_svc_mod_flg ){	this.aply_svc_mod_flg = aply_svc_mod_flg	;	}
	public void setUse_co_tp_cd    ( String           use_co_tp_cd     ){	this.use_co_tp_cd     = use_co_tp_cd    	;	}
	public void setAuto_rat_flg    ( String           auto_rat_flg     ){	this.auto_rat_flg     = auto_rat_flg    	;	}
	public void setSen_grp_chg_cd  ( String           sen_grp_chg_cd   ){	this.sen_grp_chg_cd   = sen_grp_chg_cd  	;	}
	public void setChg_edi_cd      ( String           chg_edi_cd       ){	this.chg_edi_cd       = chg_edi_cd      	;	}
	public void setDp_seq          ( String           dp_seq           ){	this.dp_seq           = dp_seq          	;	}
	public void setChg_sts_cd      ( String           chg_sts_cd       ){	this.chg_sts_cd       = chg_sts_cd      	;	}
	public void setCre_usr_id      ( String           cre_usr_id       ){	this.cre_usr_id       = cre_usr_id      	;	}
	public void setCre_dt          ( String           cre_dt           ){	this.cre_dt           = cre_dt          	;	}
	public void setUpd_usr_id      ( String           upd_usr_id       ){	this.upd_usr_id       = upd_usr_id      	;	}
	public void setUpd_dt          ( String           upd_dt           ){	this.upd_dt           = upd_dt          	;	}
	public void setDelt_flg        ( String           delt_flg         ){	this.delt_flg         = delt_flg        	;	}
	public void setEai_evnt_dt     ( String           eai_evnt_dt      ){	this.eai_evnt_dt      = eai_evnt_dt     	;	}

	public static MdmCharge fromRequest(HttpServletRequest request) {
		MdmCharge model = new MdmCharge();
		try {
			model.setIbflag          	(JSPUtil.getParameter(request, "ibflag          		".trim(), ""));
			model.setPage_rows       	(JSPUtil.getParameter(request, "page_rows       		".trim(), ""));
			model.setChg_cd          	(JSPUtil.getParameter(request, "chg_cd          		".trim(), ""));
			model.setChg_nm          	(JSPUtil.getParameter(request, "chg_nm          		".trim(), ""));
			model.setFrt_chg_tp_cd   	(JSPUtil.getParameter(request, "frt_chg_tp_cd   		".trim(), ""));
			model.setSen_chg_acct_cd 	(JSPUtil.getParameter(request, "sen_chg_acct_cd 		".trim(), ""));
			model.setHjs_chg_acct_cd 	(JSPUtil.getParameter(request, "hjs_chg_acct_cd 		".trim(), ""));
			model.setRep_chg_cd      	(JSPUtil.getParameter(request, "rep_chg_cd      		".trim(), ""));
			model.setChg_rev_tp_cd   	(JSPUtil.getParameter(request, "chg_rev_tp_cd   		".trim(), ""));
			model.setChg_aply_tp_cd  	(JSPUtil.getParameter(request, "chg_aply_tp_cd  		".trim(), ""));
			model.setChg_aply_area_cd	(JSPUtil.getParameter(request, "chg_aply_area_cd		".trim(), ""));
			model.setCy_rd_term_flg  	(JSPUtil.getParameter(request, "cy_rd_term_flg  		".trim(), ""));
			model.setCfs_rd_term_flg 	(JSPUtil.getParameter(request, "cfs_rd_term_flg 		".trim(), ""));
			model.setDor_rd_term_flg 	(JSPUtil.getParameter(request, "dor_rd_term_flg 		".trim(), ""));
			model.setNa_rd_term_flg  	(JSPUtil.getParameter(request, "na_rd_term_flg  		".trim(), ""));
			model.setTkl_tml_flg     	(JSPUtil.getParameter(request, "tkl_tml_flg     		".trim(), ""));
			model.setAply_svc_mod_flg	(JSPUtil.getParameter(request, "aply_svc_mod_flg		".trim(), ""));
			model.setUse_co_tp_cd    	(JSPUtil.getParameter(request, "use_co_tp_cd    		".trim(), ""));
			model.setAuto_rat_flg    	(JSPUtil.getParameter(request, "auto_rat_flg    		".trim(), ""));
			model.setSen_grp_chg_cd  	(JSPUtil.getParameter(request, "sen_grp_chg_cd  		".trim(), ""));
			model.setChg_edi_cd      	(JSPUtil.getParameter(request, "chg_edi_cd      		".trim(), ""));
			model.setDp_seq          	(JSPUtil.getParameter(request, "dp_seq          		".trim(), ""));
			model.setChg_sts_cd      	(JSPUtil.getParameter(request, "chg_sts_cd      		".trim(), ""));
			model.setCre_usr_id      	(JSPUtil.getParameter(request, "cre_usr_id      		".trim(), ""));
			model.setCre_dt          	(JSPUtil.getParameter(request, "cre_dt          		".trim(), ""));
			model.setUpd_usr_id      	(JSPUtil.getParameter(request, "upd_usr_id      		".trim(), ""));
			model.setUpd_dt          	(JSPUtil.getParameter(request, "upd_dt          		".trim(), ""));
			model.setDelt_flg        	(JSPUtil.getParameter(request, "delt_flg        		".trim(), ""));
			model.setEai_evnt_dt     	(JSPUtil.getParameter(request, "eai_evnt_dt     		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		MdmCharge model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag           =  (JSPUtil.getParameter(request, "ibflag          		".trim(), length));
			String[] page_rows        =  (JSPUtil.getParameter(request, "page_rows       		".trim(), length));
			String[] chg_cd           =  (JSPUtil.getParameter(request, "chg_cd          		".trim(), length));
			String[] chg_nm           =  (JSPUtil.getParameter(request, "chg_nm          		".trim(), length));
			String[] frt_chg_tp_cd    =  (JSPUtil.getParameter(request, "frt_chg_tp_cd   		".trim(), length));
			String[] sen_chg_acct_cd  =  (JSPUtil.getParameter(request, "sen_chg_acct_cd 		".trim(), length));
			String[] hjs_chg_acct_cd  =  (JSPUtil.getParameter(request, "hjs_chg_acct_cd 		".trim(), length));
			String[] rep_chg_cd       =  (JSPUtil.getParameter(request, "rep_chg_cd      		".trim(), length));
			String[] chg_rev_tp_cd    =  (JSPUtil.getParameter(request, "chg_rev_tp_cd   		".trim(), length));
			String[] chg_aply_tp_cd   =  (JSPUtil.getParameter(request, "chg_aply_tp_cd  		".trim(), length));
			String[] chg_aply_area_cd =  (JSPUtil.getParameter(request, "chg_aply_area_cd		".trim(), length));
			String[] cy_rd_term_flg   =  (JSPUtil.getParameter(request, "cy_rd_term_flg  		".trim(), length));
			String[] cfs_rd_term_flg  =  (JSPUtil.getParameter(request, "cfs_rd_term_flg 		".trim(), length));
			String[] dor_rd_term_flg  =  (JSPUtil.getParameter(request, "dor_rd_term_flg 		".trim(), length));
			String[] na_rd_term_flg   =  (JSPUtil.getParameter(request, "na_rd_term_flg  		".trim(), length));
			String[] tkl_tml_flg      =  (JSPUtil.getParameter(request, "tkl_tml_flg     		".trim(), length));
			String[] aply_svc_mod_flg =  (JSPUtil.getParameter(request, "aply_svc_mod_flg		".trim(), length));
			String[] use_co_tp_cd     =  (JSPUtil.getParameter(request, "use_co_tp_cd    		".trim(), length));
			String[] auto_rat_flg     =  (JSPUtil.getParameter(request, "auto_rat_flg    		".trim(), length));
			String[] sen_grp_chg_cd   =  (JSPUtil.getParameter(request, "sen_grp_chg_cd  		".trim(), length));
			String[] chg_edi_cd       =  (JSPUtil.getParameter(request, "chg_edi_cd      		".trim(), length));
			String[] dp_seq           =  (JSPUtil.getParameter(request, "dp_seq          		".trim(), length));
			String[] chg_sts_cd       =  (JSPUtil.getParameter(request, "chg_sts_cd      		".trim(), length));
			String[] cre_usr_id       =  (JSPUtil.getParameter(request, "cre_usr_id      		".trim(), length));
			String[] cre_dt           =  (JSPUtil.getParameter(request, "cre_dt          		".trim(), length));
			String[] upd_usr_id       =  (JSPUtil.getParameter(request, "upd_usr_id      		".trim(), length));
			String[] upd_dt           =  (JSPUtil.getParameter(request, "upd_dt          		".trim(), length));
			String[] delt_flg         =  (JSPUtil.getParameter(request, "delt_flg        		".trim(), length));
			String[] eai_evnt_dt      =  (JSPUtil.getParameter(request, "eai_evnt_dt     		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new MdmCharge();
				model.setIbflag          		  (ibflag          	[i]);
				model.setPage_rows       		  (page_rows       	[i]);
				model.setChg_cd          		  (chg_cd          	[i]);
				model.setChg_nm          		  (chg_nm          	[i]);
				model.setFrt_chg_tp_cd   		  (frt_chg_tp_cd   	[i]);
				model.setSen_chg_acct_cd 		  (sen_chg_acct_cd 	[i]);
				model.setHjs_chg_acct_cd 		  (hjs_chg_acct_cd 	[i]);
				model.setRep_chg_cd      		  (rep_chg_cd      	[i]);
				model.setChg_rev_tp_cd   		  (chg_rev_tp_cd   	[i]);
				model.setChg_aply_tp_cd  		  (chg_aply_tp_cd  	[i]);
				model.setChg_aply_area_cd		  (chg_aply_area_cd	[i]);
				model.setCy_rd_term_flg  		  (cy_rd_term_flg  	[i]);
				model.setCfs_rd_term_flg 		  (cfs_rd_term_flg 	[i]);
				model.setDor_rd_term_flg 		  (dor_rd_term_flg 	[i]);
				model.setNa_rd_term_flg  		  (na_rd_term_flg  	[i]);
				model.setTkl_tml_flg     		  (tkl_tml_flg     	[i]);
				model.setAply_svc_mod_flg		  (aply_svc_mod_flg	[i]);
				model.setUse_co_tp_cd    		  (use_co_tp_cd    	[i]);
				model.setAuto_rat_flg    		  (auto_rat_flg    	[i]);
				model.setSen_grp_chg_cd  		  (sen_grp_chg_cd  	[i]);
				model.setChg_edi_cd      		  (chg_edi_cd      	[i]);
				model.setDp_seq          		  (dp_seq          	[i]);
				model.setChg_sts_cd      		  (chg_sts_cd      	[i]);
				model.setCre_usr_id      		  (cre_usr_id      	[i]);
				model.setCre_dt          		  (cre_dt          	[i]);
				model.setUpd_usr_id      		  (upd_usr_id      	[i]);
				model.setUpd_dt          		  (upd_dt          	[i]);
				model.setDelt_flg        		  (delt_flg        	[i]);
				model.setEai_evnt_dt     		  (eai_evnt_dt     	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		MdmCharge model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag           =  (JSPUtil.getParameter(request, prefix + "ibflag          		".trim(), length));
			String[] page_rows        =  (JSPUtil.getParameter(request, prefix + "page_rows       		".trim(), length));
			String[] chg_cd           =  (JSPUtil.getParameter(request, prefix + "chg_cd          		".trim(), length));
			String[] chg_nm           =  (JSPUtil.getParameter(request, prefix + "chg_nm          		".trim(), length));
			String[] frt_chg_tp_cd    =  (JSPUtil.getParameter(request, prefix + "frt_chg_tp_cd   		".trim(), length));
			String[] sen_chg_acct_cd  =  (JSPUtil.getParameter(request, prefix + "sen_chg_acct_cd 		".trim(), length));
			String[] hjs_chg_acct_cd  =  (JSPUtil.getParameter(request, prefix + "hjs_chg_acct_cd 		".trim(), length));
			String[] rep_chg_cd       =  (JSPUtil.getParameter(request, prefix + "rep_chg_cd      		".trim(), length));
			String[] chg_rev_tp_cd    =  (JSPUtil.getParameter(request, prefix + "chg_rev_tp_cd   		".trim(), length));
			String[] chg_aply_tp_cd   =  (JSPUtil.getParameter(request, prefix + "chg_aply_tp_cd  		".trim(), length));
			String[] chg_aply_area_cd =  (JSPUtil.getParameter(request, prefix + "chg_aply_area_cd		".trim(), length));
			String[] cy_rd_term_flg   =  (JSPUtil.getParameter(request, prefix + "cy_rd_term_flg  		".trim(), length));
			String[] cfs_rd_term_flg  =  (JSPUtil.getParameter(request, prefix + "cfs_rd_term_flg 		".trim(), length));
			String[] dor_rd_term_flg  =  (JSPUtil.getParameter(request, prefix + "dor_rd_term_flg 		".trim(), length));
			String[] na_rd_term_flg   =  (JSPUtil.getParameter(request, prefix + "na_rd_term_flg  		".trim(), length));
			String[] tkl_tml_flg      =  (JSPUtil.getParameter(request, prefix + "tkl_tml_flg     		".trim(), length));
			String[] aply_svc_mod_flg =  (JSPUtil.getParameter(request, prefix + "aply_svc_mod_flg		".trim(), length));
			String[] use_co_tp_cd     =  (JSPUtil.getParameter(request, prefix + "use_co_tp_cd    		".trim(), length));
			String[] auto_rat_flg     =  (JSPUtil.getParameter(request, prefix + "auto_rat_flg    		".trim(), length));
			String[] sen_grp_chg_cd   =  (JSPUtil.getParameter(request, prefix + "sen_grp_chg_cd  		".trim(), length));
			String[] chg_edi_cd       =  (JSPUtil.getParameter(request, prefix + "chg_edi_cd      		".trim(), length));
			String[] dp_seq           =  (JSPUtil.getParameter(request, prefix + "dp_seq          		".trim(), length));
			String[] chg_sts_cd       =  (JSPUtil.getParameter(request, prefix + "chg_sts_cd      		".trim(), length));
			String[] cre_usr_id       =  (JSPUtil.getParameter(request, prefix + "cre_usr_id      		".trim(), length));
			String[] cre_dt           =  (JSPUtil.getParameter(request, prefix + "cre_dt          		".trim(), length));
			String[] upd_usr_id       =  (JSPUtil.getParameter(request, prefix + "upd_usr_id      		".trim(), length));
			String[] upd_dt           =  (JSPUtil.getParameter(request, prefix + "upd_dt          		".trim(), length));
			String[] delt_flg         =  (JSPUtil.getParameter(request, prefix + "delt_flg        		".trim(), length));
			String[] eai_evnt_dt      =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt     		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new MdmCharge();
				model.setIbflag          		  ( ibflag          	[i]);
				model.setPage_rows       		  ( page_rows       	[i]);
				model.setChg_cd          		  ( chg_cd          	[i]);
				model.setChg_nm          		  ( chg_nm          	[i]);
				model.setFrt_chg_tp_cd   		  ( frt_chg_tp_cd   	[i]);
				model.setSen_chg_acct_cd 		  ( sen_chg_acct_cd 	[i]);
				model.setHjs_chg_acct_cd 		  ( hjs_chg_acct_cd 	[i]);
				model.setRep_chg_cd      		  ( rep_chg_cd      	[i]);
				model.setChg_rev_tp_cd   		  ( chg_rev_tp_cd   	[i]);
				model.setChg_aply_tp_cd  		  ( chg_aply_tp_cd  	[i]);
				model.setChg_aply_area_cd		  ( chg_aply_area_cd	[i]);
				model.setCy_rd_term_flg  		  ( cy_rd_term_flg  	[i]);
				model.setCfs_rd_term_flg 		  ( cfs_rd_term_flg 	[i]);
				model.setDor_rd_term_flg 		  ( dor_rd_term_flg 	[i]);
				model.setNa_rd_term_flg  		  ( na_rd_term_flg  	[i]);
				model.setTkl_tml_flg     		  ( tkl_tml_flg     	[i]);
				model.setAply_svc_mod_flg		  ( aply_svc_mod_flg	[i]);
				model.setUse_co_tp_cd    		  ( use_co_tp_cd    	[i]);
				model.setAuto_rat_flg    		  ( auto_rat_flg    	[i]);
				model.setSen_grp_chg_cd  		  ( sen_grp_chg_cd  	[i]);
				model.setChg_edi_cd      		  ( chg_edi_cd      	[i]);
				model.setDp_seq          		  ( dp_seq          	[i]);
				model.setChg_sts_cd      		  ( chg_sts_cd      	[i]);
				model.setCre_usr_id      		  ( cre_usr_id      	[i]);
				model.setCre_dt          		  ( cre_dt          	[i]);
				model.setUpd_usr_id      		  ( upd_usr_id      	[i]);
				model.setUpd_dt          		  ( upd_dt          	[i]);
				model.setDelt_flg        		  ( delt_flg        	[i]);
				model.setEai_evnt_dt     		  ( eai_evnt_dt     	[i]);
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
