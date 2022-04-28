/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : AR_AGN_STMT_AGMT.java
*@FileTitle : 사용자 관리5
*Open Issues :
*Change history :
*@LastModifyDate : 2007-01-25
*@LastModifier : Kildong_hong6
*@LastVersion : 1.0
* 2007-01-25 Kildong_hong6
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
public final class AR_AGN_STMT_AGMT implements java.io.Serializable {

	private String          ibflag          = "";
	private String          page_rows       = "";
	private String          asa_rhq_cd      = "";
	private String          asa_no          = "";
	private String          asa_ofc_cd      = "";
	private String          asa_curr_cd     = "";
	private String          asa_prd_fm_dt   = "";
	private String          asa_prd_to_dt   = "";
	private String          bfwrd_dr_bal    = "";
	private String          bfwrd_cr_bal    = "";
	private String          rev_clt_dr_amt  = "";
	private String          rev_clt_cr_amt  = "";
	private String          rev_clt_eff_dt  = "";
	private String          rfnd_dr_amt     = "";
	private String          rfnd_cr_amt     = "";
	private String          rfnd_eff_dt     = "";
	private String          expn_dr_amt     = "";
	private String          expn_cr_amt     = "";
	private String          expn_eff_dt     = "";
	private String          ac_dr_amt       = "";
	private String          ac_cr_amt       = "";
	private String          ac_eff_dt       = "";
	private String          remit_dr_amt    = "";
	private String          remit_cr_amt    = "";
	private String          remit_eff_dt    = "";
	private String          cfwrd_dr_bal    = "";
	private String          cfwrd_cr_bal    = "";
	private String          eff_yrmon       = "";
	private String          asa_clz_dt      = "";
	private String          asa_prpr_usr_id = "";
	private String          asa_apro_usr_id = "";
	private String          asa_apro_dt     = "";
	private String          delt_flg        = "";
	private String          cre_usr_id      = "";
	private String          cre_dt          = "";
	private String          upd_usr_id      = "";
	private String          upd_dt          = "";
	private String          eai_evnt_dt     = "";

	public AR_AGN_STMT_AGMT(){}

	public AR_AGN_STMT_AGMT(
			String          ibflag         ,
			String          page_rows      ,
			String          asa_rhq_cd     ,
			String          asa_no         ,
			String          asa_ofc_cd     ,
			String          asa_curr_cd    ,
			String          asa_prd_fm_dt  ,
			String          asa_prd_to_dt  ,
			String          bfwrd_dr_bal   ,
			String          bfwrd_cr_bal   ,
			String          rev_clt_dr_amt ,
			String          rev_clt_cr_amt ,
			String          rev_clt_eff_dt ,
			String          rfnd_dr_amt    ,
			String          rfnd_cr_amt    ,
			String          rfnd_eff_dt    ,
			String          expn_dr_amt    ,
			String          expn_cr_amt    ,
			String          expn_eff_dt    ,
			String          ac_dr_amt      ,
			String          ac_cr_amt      ,
			String          ac_eff_dt      ,
			String          remit_dr_amt   ,
			String          remit_cr_amt   ,
			String          remit_eff_dt   ,
			String          cfwrd_dr_bal   ,
			String          cfwrd_cr_bal   ,
			String          eff_yrmon      ,
			String          asa_clz_dt     ,
			String          asa_prpr_usr_id,
			String          asa_apro_usr_id,
			String          asa_apro_dt    ,
			String          delt_flg       ,
			String          cre_usr_id     ,
			String          cre_dt         ,
			String          upd_usr_id     ,
			String          upd_dt         ,
			String          eai_evnt_dt    ){
		this.ibflag          = ibflag         ;
		this.page_rows       = page_rows      ;
		this.asa_rhq_cd      = asa_rhq_cd     ;
		this.asa_no          = asa_no         ;
		this.asa_ofc_cd      = asa_ofc_cd     ;
		this.asa_curr_cd     = asa_curr_cd    ;
		this.asa_prd_fm_dt   = asa_prd_fm_dt  ;
		this.asa_prd_to_dt   = asa_prd_to_dt  ;
		this.bfwrd_dr_bal    = bfwrd_dr_bal   ;
		this.bfwrd_cr_bal    = bfwrd_cr_bal   ;
		this.rev_clt_dr_amt  = rev_clt_dr_amt ;
		this.rev_clt_cr_amt  = rev_clt_cr_amt ;
		this.rev_clt_eff_dt  = rev_clt_eff_dt ;
		this.rfnd_dr_amt     = rfnd_dr_amt    ;
		this.rfnd_cr_amt     = rfnd_cr_amt    ;
		this.rfnd_eff_dt     = rfnd_eff_dt    ;
		this.expn_dr_amt     = expn_dr_amt    ;
		this.expn_cr_amt     = expn_cr_amt    ;
		this.expn_eff_dt     = expn_eff_dt    ;
		this.ac_dr_amt       = ac_dr_amt      ;
		this.ac_cr_amt       = ac_cr_amt      ;
		this.ac_eff_dt       = ac_eff_dt      ;
		this.remit_dr_amt    = remit_dr_amt   ;
		this.remit_cr_amt    = remit_cr_amt   ;
		this.remit_eff_dt    = remit_eff_dt   ;
		this.cfwrd_dr_bal    = cfwrd_dr_bal   ;
		this.cfwrd_cr_bal    = cfwrd_cr_bal   ;
		this.eff_yrmon       = eff_yrmon      ;
		this.asa_clz_dt      = asa_clz_dt     ;
		this.asa_prpr_usr_id = asa_prpr_usr_id;
		this.asa_apro_usr_id = asa_apro_usr_id;
		this.asa_apro_dt     = asa_apro_dt    ;
		this.delt_flg        = delt_flg       ;
		this.cre_usr_id      = cre_usr_id     ;
		this.cre_dt          = cre_dt         ;
		this.upd_usr_id      = upd_usr_id     ;
		this.upd_dt          = upd_dt         ;
		this.eai_evnt_dt     = eai_evnt_dt    ;
	}

	// getter method is proceeding ..
	public String          getIbflag         (){	return ibflag         	;	}
	public String          getPage_rows      (){	return page_rows      	;	}
	public String          getAsa_rhq_cd     (){	return asa_rhq_cd     	;	}
	public String          getAsa_no         (){	return asa_no         	;	}
	public String          getAsa_ofc_cd     (){	return asa_ofc_cd     	;	}
	public String          getAsa_curr_cd    (){	return asa_curr_cd    	;	}
	public String          getAsa_prd_fm_dt  (){	return asa_prd_fm_dt  	;	}
	public String          getAsa_prd_to_dt  (){	return asa_prd_to_dt  	;	}
	public String          getBfwrd_dr_bal   (){	return bfwrd_dr_bal   	;	}
	public String          getBfwrd_cr_bal   (){	return bfwrd_cr_bal   	;	}
	public String          getRev_clt_dr_amt (){	return rev_clt_dr_amt 	;	}
	public String          getRev_clt_cr_amt (){	return rev_clt_cr_amt 	;	}
	public String          getRev_clt_eff_dt (){	return rev_clt_eff_dt 	;	}
	public String          getRfnd_dr_amt    (){	return rfnd_dr_amt    	;	}
	public String          getRfnd_cr_amt    (){	return rfnd_cr_amt    	;	}
	public String          getRfnd_eff_dt    (){	return rfnd_eff_dt    	;	}
	public String          getExpn_dr_amt    (){	return expn_dr_amt    	;	}
	public String          getExpn_cr_amt    (){	return expn_cr_amt    	;	}
	public String          getExpn_eff_dt    (){	return expn_eff_dt    	;	}
	public String          getAc_dr_amt      (){	return ac_dr_amt      	;	}
	public String          getAc_cr_amt      (){	return ac_cr_amt      	;	}
	public String          getAc_eff_dt      (){	return ac_eff_dt      	;	}
	public String          getRemit_dr_amt   (){	return remit_dr_amt   	;	}
	public String          getRemit_cr_amt   (){	return remit_cr_amt   	;	}
	public String          getRemit_eff_dt   (){	return remit_eff_dt   	;	}
	public String          getCfwrd_dr_bal   (){	return cfwrd_dr_bal   	;	}
	public String          getCfwrd_cr_bal   (){	return cfwrd_cr_bal   	;	}
	public String          getEff_yrmon      (){	return eff_yrmon      	;	}
	public String          getAsa_clz_dt     (){	return asa_clz_dt     	;	}
	public String          getAsa_prpr_usr_id(){	return asa_prpr_usr_id	;	}
	public String          getAsa_apro_usr_id(){	return asa_apro_usr_id	;	}
	public String          getAsa_apro_dt    (){	return asa_apro_dt    	;	}
	public String          getDelt_flg       (){	return delt_flg       	;	}
	public String          getCre_usr_id     (){	return cre_usr_id     	;	}
	public String          getCre_dt         (){	return cre_dt         	;	}
	public String          getUpd_usr_id     (){	return upd_usr_id     	;	}
	public String          getUpd_dt         (){	return upd_dt         	;	}
	public String          getEai_evnt_dt    (){	return eai_evnt_dt    	;	}

	// setter method is proceeding ..
	public void setIbflag         ( String          ibflag          ){	this.ibflag          = ibflag         	;	}
	public void setPage_rows      ( String          page_rows       ){	this.page_rows       = page_rows      	;	}
	public void setAsa_rhq_cd     ( String          asa_rhq_cd      ){	this.asa_rhq_cd      = asa_rhq_cd     	;	}
	public void setAsa_no         ( String          asa_no          ){	this.asa_no          = asa_no         	;	}
	public void setAsa_ofc_cd     ( String          asa_ofc_cd      ){	this.asa_ofc_cd      = asa_ofc_cd     	;	}
	public void setAsa_curr_cd    ( String          asa_curr_cd     ){	this.asa_curr_cd     = asa_curr_cd    	;	}
	public void setAsa_prd_fm_dt  ( String          asa_prd_fm_dt   ){	this.asa_prd_fm_dt   = asa_prd_fm_dt  	;	}
	public void setAsa_prd_to_dt  ( String          asa_prd_to_dt   ){	this.asa_prd_to_dt   = asa_prd_to_dt  	;	}
	public void setBfwrd_dr_bal   ( String          bfwrd_dr_bal    ){	this.bfwrd_dr_bal    = bfwrd_dr_bal   	;	}
	public void setBfwrd_cr_bal   ( String          bfwrd_cr_bal    ){	this.bfwrd_cr_bal    = bfwrd_cr_bal   	;	}
	public void setRev_clt_dr_amt ( String          rev_clt_dr_amt  ){	this.rev_clt_dr_amt  = rev_clt_dr_amt 	;	}
	public void setRev_clt_cr_amt ( String          rev_clt_cr_amt  ){	this.rev_clt_cr_amt  = rev_clt_cr_amt 	;	}
	public void setRev_clt_eff_dt ( String          rev_clt_eff_dt  ){	this.rev_clt_eff_dt  = rev_clt_eff_dt 	;	}
	public void setRfnd_dr_amt    ( String          rfnd_dr_amt     ){	this.rfnd_dr_amt     = rfnd_dr_amt    	;	}
	public void setRfnd_cr_amt    ( String          rfnd_cr_amt     ){	this.rfnd_cr_amt     = rfnd_cr_amt    	;	}
	public void setRfnd_eff_dt    ( String          rfnd_eff_dt     ){	this.rfnd_eff_dt     = rfnd_eff_dt    	;	}
	public void setExpn_dr_amt    ( String          expn_dr_amt     ){	this.expn_dr_amt     = expn_dr_amt    	;	}
	public void setExpn_cr_amt    ( String          expn_cr_amt     ){	this.expn_cr_amt     = expn_cr_amt    	;	}
	public void setExpn_eff_dt    ( String          expn_eff_dt     ){	this.expn_eff_dt     = expn_eff_dt    	;	}
	public void setAc_dr_amt      ( String          ac_dr_amt       ){	this.ac_dr_amt       = ac_dr_amt      	;	}
	public void setAc_cr_amt      ( String          ac_cr_amt       ){	this.ac_cr_amt       = ac_cr_amt      	;	}
	public void setAc_eff_dt      ( String          ac_eff_dt       ){	this.ac_eff_dt       = ac_eff_dt      	;	}
	public void setRemit_dr_amt   ( String          remit_dr_amt    ){	this.remit_dr_amt    = remit_dr_amt   	;	}
	public void setRemit_cr_amt   ( String          remit_cr_amt    ){	this.remit_cr_amt    = remit_cr_amt   	;	}
	public void setRemit_eff_dt   ( String          remit_eff_dt    ){	this.remit_eff_dt    = remit_eff_dt   	;	}
	public void setCfwrd_dr_bal   ( String          cfwrd_dr_bal    ){	this.cfwrd_dr_bal    = cfwrd_dr_bal   	;	}
	public void setCfwrd_cr_bal   ( String          cfwrd_cr_bal    ){	this.cfwrd_cr_bal    = cfwrd_cr_bal   	;	}
	public void setEff_yrmon      ( String          eff_yrmon       ){	this.eff_yrmon       = eff_yrmon      	;	}
	public void setAsa_clz_dt     ( String          asa_clz_dt      ){	this.asa_clz_dt      = asa_clz_dt     	;	}
	public void setAsa_prpr_usr_id( String          asa_prpr_usr_id ){	this.asa_prpr_usr_id = asa_prpr_usr_id	;	}
	public void setAsa_apro_usr_id( String          asa_apro_usr_id ){	this.asa_apro_usr_id = asa_apro_usr_id	;	}
	public void setAsa_apro_dt    ( String          asa_apro_dt     ){	this.asa_apro_dt     = asa_apro_dt    	;	}
	public void setDelt_flg       ( String          delt_flg        ){	this.delt_flg        = delt_flg       	;	}
	public void setCre_usr_id     ( String          cre_usr_id      ){	this.cre_usr_id      = cre_usr_id     	;	}
	public void setCre_dt         ( String          cre_dt          ){	this.cre_dt          = cre_dt         	;	}
	public void setUpd_usr_id     ( String          upd_usr_id      ){	this.upd_usr_id      = upd_usr_id     	;	}
	public void setUpd_dt         ( String          upd_dt          ){	this.upd_dt          = upd_dt         	;	}
	public void setEai_evnt_dt    ( String          eai_evnt_dt     ){	this.eai_evnt_dt     = eai_evnt_dt    	;	}

	public static AR_AGN_STMT_AGMT fromRequest(HttpServletRequest request) {
		AR_AGN_STMT_AGMT model = new AR_AGN_STMT_AGMT();
		try {
			model.setIbflag         	(JSPUtil.getParameter(request, "ibflag         		".trim(), ""));
			model.setPage_rows      	(JSPUtil.getParameter(request, "page_rows      		".trim(), ""));
			model.setAsa_rhq_cd     	(JSPUtil.getParameter(request, "asa_rhq_cd     		".trim(), ""));
			model.setAsa_no         	(JSPUtil.getParameter(request, "asa_no         		".trim(), ""));
			model.setAsa_ofc_cd     	(JSPUtil.getParameter(request, "asa_ofc_cd     		".trim(), ""));
			model.setAsa_curr_cd    	(JSPUtil.getParameter(request, "asa_curr_cd    		".trim(), ""));
			model.setAsa_prd_fm_dt  	(JSPUtil.getParameter(request, "asa_prd_fm_dt  		".trim(), ""));
			model.setAsa_prd_to_dt  	(JSPUtil.getParameter(request, "asa_prd_to_dt  		".trim(), ""));
			model.setBfwrd_dr_bal   	(JSPUtil.getParameter(request, "bfwrd_dr_bal   		".trim(), ""));
			model.setBfwrd_cr_bal   	(JSPUtil.getParameter(request, "bfwrd_cr_bal   		".trim(), ""));
			model.setRev_clt_dr_amt 	(JSPUtil.getParameter(request, "rev_clt_dr_amt 		".trim(), ""));
			model.setRev_clt_cr_amt 	(JSPUtil.getParameter(request, "rev_clt_cr_amt 		".trim(), ""));
			model.setRev_clt_eff_dt 	(JSPUtil.getParameter(request, "rev_clt_eff_dt 		".trim(), ""));
			model.setRfnd_dr_amt    	(JSPUtil.getParameter(request, "rfnd_dr_amt    		".trim(), ""));
			model.setRfnd_cr_amt    	(JSPUtil.getParameter(request, "rfnd_cr_amt    		".trim(), ""));
			model.setRfnd_eff_dt    	(JSPUtil.getParameter(request, "rfnd_eff_dt    		".trim(), ""));
			model.setExpn_dr_amt    	(JSPUtil.getParameter(request, "expn_dr_amt    		".trim(), ""));
			model.setExpn_cr_amt    	(JSPUtil.getParameter(request, "expn_cr_amt    		".trim(), ""));
			model.setExpn_eff_dt    	(JSPUtil.getParameter(request, "expn_eff_dt    		".trim(), ""));
			model.setAc_dr_amt      	(JSPUtil.getParameter(request, "ac_dr_amt      		".trim(), ""));
			model.setAc_cr_amt      	(JSPUtil.getParameter(request, "ac_cr_amt      		".trim(), ""));
			model.setAc_eff_dt      	(JSPUtil.getParameter(request, "ac_eff_dt      		".trim(), ""));
			model.setRemit_dr_amt   	(JSPUtil.getParameter(request, "remit_dr_amt   		".trim(), ""));
			model.setRemit_cr_amt   	(JSPUtil.getParameter(request, "remit_cr_amt   		".trim(), ""));
			model.setRemit_eff_dt   	(JSPUtil.getParameter(request, "remit_eff_dt   		".trim(), ""));
			model.setCfwrd_dr_bal   	(JSPUtil.getParameter(request, "cfwrd_dr_bal   		".trim(), ""));
			model.setCfwrd_cr_bal   	(JSPUtil.getParameter(request, "cfwrd_cr_bal   		".trim(), ""));
			model.setEff_yrmon      	(JSPUtil.getParameter(request, "eff_yrmon      		".trim(), ""));
			model.setAsa_clz_dt     	(JSPUtil.getParameter(request, "asa_clz_dt     		".trim(), ""));
			model.setAsa_prpr_usr_id	(JSPUtil.getParameter(request, "asa_prpr_usr_id		".trim(), ""));
			model.setAsa_apro_usr_id	(JSPUtil.getParameter(request, "asa_apro_usr_id		".trim(), ""));
			model.setAsa_apro_dt    	(JSPUtil.getParameter(request, "asa_apro_dt    		".trim(), ""));
			model.setDelt_flg       	(JSPUtil.getParameter(request, "delt_flg       		".trim(), ""));
			model.setCre_usr_id     	(JSPUtil.getParameter(request, "cre_usr_id     		".trim(), ""));
			model.setCre_dt         	(JSPUtil.getParameter(request, "cre_dt         		".trim(), ""));
			model.setUpd_usr_id     	(JSPUtil.getParameter(request, "upd_usr_id     		".trim(), ""));
			model.setUpd_dt         	(JSPUtil.getParameter(request, "upd_dt         		".trim(), ""));
			model.setEai_evnt_dt    	(JSPUtil.getParameter(request, "eai_evnt_dt    		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		AR_AGN_STMT_AGMT model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag          =  (JSPUtil.getParameter(request, "ibflag         		".trim(), length));
			String[] page_rows       =  (JSPUtil.getParameter(request, "page_rows      		".trim(), length));
			String[] asa_rhq_cd      =  (JSPUtil.getParameter(request, "asa_rhq_cd     		".trim(), length));
			String[] asa_no          =  (JSPUtil.getParameter(request, "asa_no         		".trim(), length));
			String[] asa_ofc_cd      =  (JSPUtil.getParameter(request, "asa_ofc_cd     		".trim(), length));
			String[] asa_curr_cd     =  (JSPUtil.getParameter(request, "asa_curr_cd    		".trim(), length));
			String[] asa_prd_fm_dt   =  (JSPUtil.getParameter(request, "asa_prd_fm_dt  		".trim(), length));
			String[] asa_prd_to_dt   =  (JSPUtil.getParameter(request, "asa_prd_to_dt  		".trim(), length));
			String[] bfwrd_dr_bal    =  (JSPUtil.getParameter(request, "bfwrd_dr_bal   		".trim(), length));
			String[] bfwrd_cr_bal    =  (JSPUtil.getParameter(request, "bfwrd_cr_bal   		".trim(), length));
			String[] rev_clt_dr_amt  =  (JSPUtil.getParameter(request, "rev_clt_dr_amt 		".trim(), length));
			String[] rev_clt_cr_amt  =  (JSPUtil.getParameter(request, "rev_clt_cr_amt 		".trim(), length));
			String[] rev_clt_eff_dt  =  (JSPUtil.getParameter(request, "rev_clt_eff_dt 		".trim(), length));
			String[] rfnd_dr_amt     =  (JSPUtil.getParameter(request, "rfnd_dr_amt    		".trim(), length));
			String[] rfnd_cr_amt     =  (JSPUtil.getParameter(request, "rfnd_cr_amt    		".trim(), length));
			String[] rfnd_eff_dt     =  (JSPUtil.getParameter(request, "rfnd_eff_dt    		".trim(), length));
			String[] expn_dr_amt     =  (JSPUtil.getParameter(request, "expn_dr_amt    		".trim(), length));
			String[] expn_cr_amt     =  (JSPUtil.getParameter(request, "expn_cr_amt    		".trim(), length));
			String[] expn_eff_dt     =  (JSPUtil.getParameter(request, "expn_eff_dt    		".trim(), length));
			String[] ac_dr_amt       =  (JSPUtil.getParameter(request, "ac_dr_amt      		".trim(), length));
			String[] ac_cr_amt       =  (JSPUtil.getParameter(request, "ac_cr_amt      		".trim(), length));
			String[] ac_eff_dt       =  (JSPUtil.getParameter(request, "ac_eff_dt      		".trim(), length));
			String[] remit_dr_amt    =  (JSPUtil.getParameter(request, "remit_dr_amt   		".trim(), length));
			String[] remit_cr_amt    =  (JSPUtil.getParameter(request, "remit_cr_amt   		".trim(), length));
			String[] remit_eff_dt    =  (JSPUtil.getParameter(request, "remit_eff_dt   		".trim(), length));
			String[] cfwrd_dr_bal    =  (JSPUtil.getParameter(request, "cfwrd_dr_bal   		".trim(), length));
			String[] cfwrd_cr_bal    =  (JSPUtil.getParameter(request, "cfwrd_cr_bal   		".trim(), length));
			String[] eff_yrmon       =  (JSPUtil.getParameter(request, "eff_yrmon      		".trim(), length));
			String[] asa_clz_dt      =  (JSPUtil.getParameter(request, "asa_clz_dt     		".trim(), length));
			String[] asa_prpr_usr_id =  (JSPUtil.getParameter(request, "asa_prpr_usr_id		".trim(), length));
			String[] asa_apro_usr_id =  (JSPUtil.getParameter(request, "asa_apro_usr_id		".trim(), length));
			String[] asa_apro_dt     =  (JSPUtil.getParameter(request, "asa_apro_dt    		".trim(), length));
			String[] delt_flg        =  (JSPUtil.getParameter(request, "delt_flg       		".trim(), length));
			String[] cre_usr_id      =  (JSPUtil.getParameter(request, "cre_usr_id     		".trim(), length));
			String[] cre_dt          =  (JSPUtil.getParameter(request, "cre_dt         		".trim(), length));
			String[] upd_usr_id      =  (JSPUtil.getParameter(request, "upd_usr_id     		".trim(), length));
			String[] upd_dt          =  (JSPUtil.getParameter(request, "upd_dt         		".trim(), length));
			String[] eai_evnt_dt     =  (JSPUtil.getParameter(request, "eai_evnt_dt    		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new AR_AGN_STMT_AGMT();
				model.setIbflag         		  (ibflag         	[i]);
				model.setPage_rows      		  (page_rows      	[i]);
				model.setAsa_rhq_cd     		  (asa_rhq_cd     	[i]);
				model.setAsa_no         		  (asa_no         	[i]);
				model.setAsa_ofc_cd     		  (asa_ofc_cd     	[i]);
				model.setAsa_curr_cd    		  (asa_curr_cd    	[i]);
				model.setAsa_prd_fm_dt  		  (asa_prd_fm_dt  	[i]);
				model.setAsa_prd_to_dt  		  (asa_prd_to_dt  	[i]);
				model.setBfwrd_dr_bal   		  (bfwrd_dr_bal   	[i]);
				model.setBfwrd_cr_bal   		  (bfwrd_cr_bal   	[i]);
				model.setRev_clt_dr_amt 		  (rev_clt_dr_amt 	[i]);
				model.setRev_clt_cr_amt 		  (rev_clt_cr_amt 	[i]);
				model.setRev_clt_eff_dt 		  (rev_clt_eff_dt 	[i]);
				model.setRfnd_dr_amt    		  (rfnd_dr_amt    	[i]);
				model.setRfnd_cr_amt    		  (rfnd_cr_amt    	[i]);
				model.setRfnd_eff_dt    		  (rfnd_eff_dt    	[i]);
				model.setExpn_dr_amt    		  (expn_dr_amt    	[i]);
				model.setExpn_cr_amt    		  (expn_cr_amt    	[i]);
				model.setExpn_eff_dt    		  (expn_eff_dt    	[i]);
				model.setAc_dr_amt      		  (ac_dr_amt      	[i]);
				model.setAc_cr_amt      		  (ac_cr_amt      	[i]);
				model.setAc_eff_dt      		  (ac_eff_dt      	[i]);
				model.setRemit_dr_amt   		  (remit_dr_amt   	[i]);
				model.setRemit_cr_amt   		  (remit_cr_amt   	[i]);
				model.setRemit_eff_dt   		  (remit_eff_dt   	[i]);
				model.setCfwrd_dr_bal   		  (cfwrd_dr_bal   	[i]);
				model.setCfwrd_cr_bal   		  (cfwrd_cr_bal   	[i]);
				model.setEff_yrmon      		  (eff_yrmon      	[i]);
				model.setAsa_clz_dt     		  (asa_clz_dt     	[i]);
				model.setAsa_prpr_usr_id		  (asa_prpr_usr_id	[i]);
				model.setAsa_apro_usr_id		  (asa_apro_usr_id	[i]);
				model.setAsa_apro_dt    		  (asa_apro_dt    	[i]);
				model.setDelt_flg       		  (delt_flg       	[i]);
				model.setCre_usr_id     		  (cre_usr_id     	[i]);
				model.setCre_dt         		  (cre_dt         	[i]);
				model.setUpd_usr_id     		  (upd_usr_id     	[i]);
				model.setUpd_dt         		  (upd_dt         	[i]);
				model.setEai_evnt_dt    		  (eai_evnt_dt    	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		AR_AGN_STMT_AGMT model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag          =  (JSPUtil.getParameter(request, prefix + "ibflag         		".trim(), length));
			String[] page_rows       =  (JSPUtil.getParameter(request, prefix + "page_rows      		".trim(), length));
			String[] asa_rhq_cd      =  (JSPUtil.getParameter(request, prefix + "asa_rhq_cd     		".trim(), length));
			String[] asa_no          =  (JSPUtil.getParameter(request, prefix + "asa_no         		".trim(), length));
			String[] asa_ofc_cd      =  (JSPUtil.getParameter(request, prefix + "asa_ofc_cd     		".trim(), length));
			String[] asa_curr_cd     =  (JSPUtil.getParameter(request, prefix + "asa_curr_cd    		".trim(), length));
			String[] asa_prd_fm_dt   =  (JSPUtil.getParameter(request, prefix + "asa_prd_fm_dt  		".trim(), length));
			String[] asa_prd_to_dt   =  (JSPUtil.getParameter(request, prefix + "asa_prd_to_dt  		".trim(), length));
			String[] bfwrd_dr_bal    =  (JSPUtil.getParameter(request, prefix + "bfwrd_dr_bal   		".trim(), length));
			String[] bfwrd_cr_bal    =  (JSPUtil.getParameter(request, prefix + "bfwrd_cr_bal   		".trim(), length));
			String[] rev_clt_dr_amt  =  (JSPUtil.getParameter(request, prefix + "rev_clt_dr_amt 		".trim(), length));
			String[] rev_clt_cr_amt  =  (JSPUtil.getParameter(request, prefix + "rev_clt_cr_amt 		".trim(), length));
			String[] rev_clt_eff_dt  =  (JSPUtil.getParameter(request, prefix + "rev_clt_eff_dt 		".trim(), length));
			String[] rfnd_dr_amt     =  (JSPUtil.getParameter(request, prefix + "rfnd_dr_amt    		".trim(), length));
			String[] rfnd_cr_amt     =  (JSPUtil.getParameter(request, prefix + "rfnd_cr_amt    		".trim(), length));
			String[] rfnd_eff_dt     =  (JSPUtil.getParameter(request, prefix + "rfnd_eff_dt    		".trim(), length));
			String[] expn_dr_amt     =  (JSPUtil.getParameter(request, prefix + "expn_dr_amt    		".trim(), length));
			String[] expn_cr_amt     =  (JSPUtil.getParameter(request, prefix + "expn_cr_amt    		".trim(), length));
			String[] expn_eff_dt     =  (JSPUtil.getParameter(request, prefix + "expn_eff_dt    		".trim(), length));
			String[] ac_dr_amt       =  (JSPUtil.getParameter(request, prefix + "ac_dr_amt      		".trim(), length));
			String[] ac_cr_amt       =  (JSPUtil.getParameter(request, prefix + "ac_cr_amt      		".trim(), length));
			String[] ac_eff_dt       =  (JSPUtil.getParameter(request, prefix + "ac_eff_dt      		".trim(), length));
			String[] remit_dr_amt    =  (JSPUtil.getParameter(request, prefix + "remit_dr_amt   		".trim(), length));
			String[] remit_cr_amt    =  (JSPUtil.getParameter(request, prefix + "remit_cr_amt   		".trim(), length));
			String[] remit_eff_dt    =  (JSPUtil.getParameter(request, prefix + "remit_eff_dt   		".trim(), length));
			String[] cfwrd_dr_bal    =  (JSPUtil.getParameter(request, prefix + "cfwrd_dr_bal   		".trim(), length));
			String[] cfwrd_cr_bal    =  (JSPUtil.getParameter(request, prefix + "cfwrd_cr_bal   		".trim(), length));
			String[] eff_yrmon       =  (JSPUtil.getParameter(request, prefix + "eff_yrmon      		".trim(), length));
			String[] asa_clz_dt      =  (JSPUtil.getParameter(request, prefix + "asa_clz_dt     		".trim(), length));
			String[] asa_prpr_usr_id =  (JSPUtil.getParameter(request, prefix + "asa_prpr_usr_id		".trim(), length));
			String[] asa_apro_usr_id =  (JSPUtil.getParameter(request, prefix + "asa_apro_usr_id		".trim(), length));
			String[] asa_apro_dt     =  (JSPUtil.getParameter(request, prefix + "asa_apro_dt    		".trim(), length));
			String[] delt_flg        =  (JSPUtil.getParameter(request, prefix + "delt_flg       		".trim(), length));
			String[] cre_usr_id      =  (JSPUtil.getParameter(request, prefix + "cre_usr_id     		".trim(), length));
			String[] cre_dt          =  (JSPUtil.getParameter(request, prefix + "cre_dt         		".trim(), length));
			String[] upd_usr_id      =  (JSPUtil.getParameter(request, prefix + "upd_usr_id     		".trim(), length));
			String[] upd_dt          =  (JSPUtil.getParameter(request, prefix + "upd_dt         		".trim(), length));
			String[] eai_evnt_dt     =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt    		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new AR_AGN_STMT_AGMT();
				model.setIbflag         		  ( ibflag         	[i]);
				model.setPage_rows      		  ( page_rows      	[i]);
				model.setAsa_rhq_cd     		  ( asa_rhq_cd     	[i]);
				model.setAsa_no         		  ( asa_no         	[i]);
				model.setAsa_ofc_cd     		  ( asa_ofc_cd     	[i]);
				model.setAsa_curr_cd    		  ( asa_curr_cd    	[i]);
				model.setAsa_prd_fm_dt  		  ( asa_prd_fm_dt  	[i]);
				model.setAsa_prd_to_dt  		  ( asa_prd_to_dt  	[i]);
				model.setBfwrd_dr_bal   		  ( bfwrd_dr_bal   	[i]);
				model.setBfwrd_cr_bal   		  ( bfwrd_cr_bal   	[i]);
				model.setRev_clt_dr_amt 		  ( rev_clt_dr_amt 	[i]);
				model.setRev_clt_cr_amt 		  ( rev_clt_cr_amt 	[i]);
				model.setRev_clt_eff_dt 		  ( rev_clt_eff_dt 	[i]);
				model.setRfnd_dr_amt    		  ( rfnd_dr_amt    	[i]);
				model.setRfnd_cr_amt    		  ( rfnd_cr_amt    	[i]);
				model.setRfnd_eff_dt    		  ( rfnd_eff_dt    	[i]);
				model.setExpn_dr_amt    		  ( expn_dr_amt    	[i]);
				model.setExpn_cr_amt    		  ( expn_cr_amt    	[i]);
				model.setExpn_eff_dt    		  ( expn_eff_dt    	[i]);
				model.setAc_dr_amt      		  ( ac_dr_amt      	[i]);
				model.setAc_cr_amt      		  ( ac_cr_amt      	[i]);
				model.setAc_eff_dt      		  ( ac_eff_dt      	[i]);
				model.setRemit_dr_amt   		  ( remit_dr_amt   	[i]);
				model.setRemit_cr_amt   		  ( remit_cr_amt   	[i]);
				model.setRemit_eff_dt   		  ( remit_eff_dt   	[i]);
				model.setCfwrd_dr_bal   		  ( cfwrd_dr_bal   	[i]);
				model.setCfwrd_cr_bal   		  ( cfwrd_cr_bal   	[i]);
				model.setEff_yrmon      		  ( eff_yrmon      	[i]);
				model.setAsa_clz_dt     		  ( asa_clz_dt     	[i]);
				model.setAsa_prpr_usr_id		  ( asa_prpr_usr_id	[i]);
				model.setAsa_apro_usr_id		  ( asa_apro_usr_id	[i]);
				model.setAsa_apro_dt    		  ( asa_apro_dt    	[i]);
				model.setDelt_flg       		  ( delt_flg       	[i]);
				model.setCre_usr_id     		  ( cre_usr_id     	[i]);
				model.setCre_dt         		  ( cre_dt         	[i]);
				model.setUpd_usr_id     		  ( upd_usr_id     	[i]);
				model.setUpd_dt         		  ( upd_dt         	[i]);
				model.setEai_evnt_dt    		  ( eai_evnt_dt    	[i]);
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
