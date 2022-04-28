/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : SPC_FCAST_OFC_POL_MAPG.java
*@FileTitle : 사용자 관리
*Open Issues :
*Change history :
*@LastModifyDate : 2007-11-27
*@LastModifier : Kildong_hong
*@LastVersion : 1.0
* 2007-11-27 Kildong_hong
* 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.common.table;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.clt.framework.component.util.JSPUtil;
import com.clt.framework.support.controller.html.CommonWebKeys;
import com.clt.framework.support.view.signon.SignOnUserAccount;

/**
 * Table Value Ojbect<br>
 * - 모든 업무에서 공통으로 사용하는 PDTO(Data Transfer Object including Parameters)<br>
 * - 관련 Event에서 작성, 서버실행요청시 PDTO의 역할을 수행하는 Value Object<br>
 * 
 * @author Kildong_hong
 * @since J2EE 1.4
 */
public final class SPC_FCAST_OFC_POL_MAPG implements java.io.Serializable {

	private String         ibflag         = "";
	private String         page_rows      = "";
	private String         rep_trd_cd     = "";
	private String         rep_sub_trd_cd = "";
	private String         rlane_cd       = "";
	private String         dir_cd         = "";
	private String         ioc_ts_cd      = "";
	private String         bse_yrwk       = "";
	private String         sls_ofc_cd     = "";
	private String         pol_cd         = "";
	private String         cd_dp_seq      = "";
	private String         trd_cd         = "";
	private String         sub_trd_cd     = "";
	private String         sls_rhq_cd     = "";
	private String         sls_aq_cd      = "";
	private String         sls_rgn_ofc_cd = "";
	private String         cre_usr_id     = "";
	private String         cre_dt         = "";
	private String         upd_usr_id     = "";
	private String         upd_dt         = "";
	private String         bse_yr         = "";
	private String         bse_wk         = "";
	

	public SPC_FCAST_OFC_POL_MAPG(){}

	public SPC_FCAST_OFC_POL_MAPG(
			String         ibflag        ,
			String         page_rows     ,
			String         rep_trd_cd    ,
			String         rep_sub_trd_cd,
			String         rlane_cd      ,
			String         dir_cd        ,
			String         ioc_ts_cd     ,
			String         bse_yrwk      ,
			String         sls_ofc_cd    ,
			String         pol_cd        ,
			String         cd_dp_seq     ,
			String         trd_cd        ,
			String         sub_trd_cd    ,
			String         sls_rhq_cd    ,
			String         sls_aq_cd     ,
			String         sls_rgn_ofc_cd,
			String         cre_usr_id    ,
			String         cre_dt        ,
			String         upd_usr_id    ,
			String         upd_dt        ,
			String         bse_yr        ,
			String         bse_wk        ){
		this.ibflag         = ibflag        ;
		this.page_rows      = page_rows     ;
		this.rep_trd_cd     = rep_trd_cd    ;
		this.rep_sub_trd_cd = rep_sub_trd_cd;
		this.rlane_cd       = rlane_cd      ;
		this.dir_cd         = dir_cd        ;
		this.ioc_ts_cd      = ioc_ts_cd     ;
		this.bse_yrwk       = bse_yrwk      ;
		this.sls_ofc_cd     = sls_ofc_cd    ;
		this.pol_cd         = pol_cd        ;
		this.cd_dp_seq      = cd_dp_seq     ;
		this.trd_cd         = trd_cd        ;
		this.sub_trd_cd     = sub_trd_cd    ;
		this.sls_rhq_cd     = sls_rhq_cd    ;
		this.sls_aq_cd      = sls_aq_cd     ;
		this.sls_rgn_ofc_cd = sls_rgn_ofc_cd;
		this.cre_usr_id     = cre_usr_id    ;
		this.cre_dt         = cre_dt        ;
		this.upd_usr_id     = upd_usr_id    ;
		this.upd_dt         = upd_dt        ;
		this.bse_yr         = bse_yr        ;
		this.bse_wk         = bse_wk        ;
		
	}

	// getter method is proceeding ..
	public String         getIbflag        (){	return ibflag        	;	}
	public String         getPage_rows     (){	return page_rows     	;	}
	public String         getRep_trd_cd    (){	return rep_trd_cd    	;	}
	public String         getRep_sub_trd_cd(){	return rep_sub_trd_cd	;	}
	public String         getRlane_cd      (){	return rlane_cd      	;	}
	public String         getDir_cd        (){	return dir_cd        	;	}
	public String         getIoc_ts_cd     (){	return ioc_ts_cd     	;	}
	public String         getBse_yrwk      (){	return bse_yrwk      	;	}
	public String         getSls_ofc_cd    (){	return sls_ofc_cd    	;	}
	public String         getPol_cd        (){	return pol_cd        	;	}
	public String         getCd_dp_seq     (){	return cd_dp_seq     	;	}
	public String         getTrd_cd        (){	return trd_cd        	;	}
	public String         getSub_trd_cd    (){	return sub_trd_cd    	;	}
	public String         getSls_rhq_cd    (){	return sls_rhq_cd    	;	}
	public String         getSls_aq_cd     (){	return sls_aq_cd     	;	}
	public String         getSls_rgn_ofc_cd(){	return sls_rgn_ofc_cd	;	}
	public String         getCre_usr_id    (){	return cre_usr_id    	;	}
	public String         getCre_dt        (){	return cre_dt        	;	}
	public String         getUpd_usr_id    (){	return upd_usr_id    	;	}
	public String         getUpd_dt        (){	return upd_dt        	;	}
	public String         getBse_yr        (){	return bse_yr        	;	}
	public String         getBse_wk        (){	return bse_wk        	;	}

	// setter method is proceeding ..
	public void setIbflag        ( String         ibflag         ){	this.ibflag         = ibflag        	;	}
	public void setPage_rows     ( String         page_rows      ){	this.page_rows      = page_rows     	;	}
	public void setRep_trd_cd    ( String         rep_trd_cd     ){	this.rep_trd_cd     = rep_trd_cd    	;	}
	public void setRep_sub_trd_cd( String         rep_sub_trd_cd ){	this.rep_sub_trd_cd = rep_sub_trd_cd	;	}
	public void setRlane_cd      ( String         rlane_cd       ){	this.rlane_cd       = rlane_cd      	;	}
	public void setDir_cd        ( String         dir_cd         ){	this.dir_cd         = dir_cd        	;	}
	public void setIoc_ts_cd     ( String         ioc_ts_cd      ){	this.ioc_ts_cd      = ioc_ts_cd     	;	}
	public void setBse_yrwk      ( String         bse_yrwk       ){	this.bse_yrwk       = bse_yrwk      	;	}
	public void setSls_ofc_cd    ( String         sls_ofc_cd     ){	this.sls_ofc_cd     = sls_ofc_cd    	;	}
	public void setPol_cd        ( String         pol_cd         ){	this.pol_cd         = pol_cd        	;	}
	public void setCd_dp_seq     ( String         cd_dp_seq      ){	this.cd_dp_seq      = cd_dp_seq     	;	}
	public void setTrd_cd        ( String         trd_cd         ){	this.trd_cd         = trd_cd        	;	}
	public void setSub_trd_cd    ( String         sub_trd_cd     ){	this.sub_trd_cd     = sub_trd_cd    	;	}
	public void setSls_rhq_cd    ( String         sls_rhq_cd     ){	this.sls_rhq_cd     = sls_rhq_cd    	;	}
	public void setSls_aq_cd     ( String         sls_aq_cd      ){	this.sls_aq_cd      = sls_aq_cd     	;	}
	public void setSls_rgn_ofc_cd( String         sls_rgn_ofc_cd ){	this.sls_rgn_ofc_cd = sls_rgn_ofc_cd	;	}
	public void setCre_usr_id    ( String         cre_usr_id     ){	this.cre_usr_id     = cre_usr_id    	;	}
	public void setCre_dt        ( String         cre_dt         ){	this.cre_dt         = cre_dt        	;	}
	public void setUpd_usr_id    ( String         upd_usr_id     ){	this.upd_usr_id     = upd_usr_id    	;	}
	public void setUpd_dt        ( String         upd_dt         ){	this.upd_dt         = upd_dt        	;	}
	public void setBse_yr        ( String         bse_yr         ){	this.bse_yr         = bse_yr        	;	}
	public void setBse_wk        ( String         bse_wk         ){	this.bse_wk         = bse_wk        	;	}

	public static SPC_FCAST_OFC_POL_MAPG fromRequest(HttpServletRequest request) {
		SPC_FCAST_OFC_POL_MAPG model = new SPC_FCAST_OFC_POL_MAPG();
		String strUserId = getUserId(request);
		try {
			model.setIbflag        	(JSPUtil.getParameter(request, "ibflag        		".trim(), ""));
			model.setPage_rows     	(JSPUtil.getParameter(request, "page_rows     		".trim(), ""));
			model.setRep_trd_cd    	(JSPUtil.getParameter(request, "rep_trd_cd    		".trim(), ""));
			model.setRep_sub_trd_cd	(JSPUtil.getParameter(request, "rep_sub_trd_cd		".trim(), ""));
			model.setRlane_cd      	(JSPUtil.getParameter(request, "rlane_cd      		".trim(), ""));
			model.setDir_cd        	(JSPUtil.getParameter(request, "dir_cd        		".trim(), ""));
			model.setIoc_ts_cd     	(JSPUtil.getParameter(request, "ioc_ts_cd     		".trim(), ""));
			model.setBse_yrwk      	(JSPUtil.getParameter(request, "bse_yrwk      		".trim(), ""));
			model.setSls_ofc_cd    	(JSPUtil.getParameter(request, "sls_ofc_cd    		".trim(), ""));
			model.setPol_cd        	(JSPUtil.getParameter(request, "pol_cd        		".trim(), ""));
			model.setCd_dp_seq     	(JSPUtil.getParameter(request, "cd_dp_seq     		".trim(), ""));
			model.setTrd_cd        	(JSPUtil.getParameter(request, "trd_cd        		".trim(), ""));
			model.setSub_trd_cd    	(JSPUtil.getParameter(request, "sub_trd_cd    		".trim(), ""));
			model.setSls_rhq_cd    	(JSPUtil.getParameter(request, "sls_rhq_cd    		".trim(), ""));
			model.setSls_aq_cd     	(JSPUtil.getParameter(request, "sls_aq_cd     		".trim(), ""));
			model.setSls_rgn_ofc_cd	(JSPUtil.getParameter(request, "sls_rgn_ofc_cd		".trim(), ""));
			model.setCre_usr_id    	(strUserId.trim());
			model.setCre_dt        	(JSPUtil.getParameter(request, "cre_dt        		".trim(), ""));
			model.setUpd_usr_id    	(strUserId.trim());
			model.setUpd_dt        	(JSPUtil.getParameter(request, "upd_dt        		".trim(), ""));
			model.setBse_yr         (JSPUtil.getParameter(request, "bse_yr        		".trim(), ""));
			model.setBse_wk         (JSPUtil.getParameter(request, "bse_wk        		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		SPC_FCAST_OFC_POL_MAPG model = null;
		String strUserId = getUserId(request);
		Collection models = new ArrayList();
		try {
			String[] ibflag         =  (JSPUtil.getParameter(request, "ibflag        		".trim(), length));
			String[] page_rows      =  (JSPUtil.getParameter(request, "page_rows     		".trim(), length));
			String[] rep_trd_cd     =  (JSPUtil.getParameter(request, "rep_trd_cd    		".trim(), length));
			String[] rep_sub_trd_cd =  (JSPUtil.getParameter(request, "rep_sub_trd_cd		".trim(), length));
			String[] rlane_cd       =  (JSPUtil.getParameter(request, "rlane_cd      		".trim(), length));
			String[] dir_cd         =  (JSPUtil.getParameter(request, "dir_cd        		".trim(), length));
			String[] ioc_ts_cd      =  (JSPUtil.getParameter(request, "ioc_ts_cd     		".trim(), length));
			String[] bse_yrwk       =  (JSPUtil.getParameter(request, "bse_yrwk      		".trim(), length));
			String[] sls_ofc_cd     =  (JSPUtil.getParameter(request, "sls_ofc_cd    		".trim(), length));
			String[] pol_cd         =  (JSPUtil.getParameter(request, "pol_cd        		".trim(), length));
			String[] cd_dp_seq      =  (JSPUtil.getParameter(request, "cd_dp_seq     		".trim(), length));
			String[] trd_cd         =  (JSPUtil.getParameter(request, "trd_cd        		".trim(), length));
			String[] sub_trd_cd     =  (JSPUtil.getParameter(request, "sub_trd_cd    		".trim(), length));
			String[] sls_rhq_cd     =  (JSPUtil.getParameter(request, "sls_rhq_cd    		".trim(), length));
			String[] sls_aq_cd      =  (JSPUtil.getParameter(request, "sls_aq_cd     		".trim(), length));
			String[] sls_rgn_ofc_cd =  (JSPUtil.getParameter(request, "sls_rgn_ofc_cd		".trim(), length));
			String[] cre_dt         =  (JSPUtil.getParameter(request, "cre_dt        		".trim(), length));
			String[] upd_dt         =  (JSPUtil.getParameter(request, "upd_dt        		".trim(), length));
			String[] bse_yr         =  (JSPUtil.getParameter(request, "bse_yr        		".trim(), length));
			String[] bse_wk         =  (JSPUtil.getParameter(request, "bse_wk        		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new SPC_FCAST_OFC_POL_MAPG();
				model.setIbflag        		  (ibflag        	[i]);
				model.setPage_rows     		  (page_rows     	[i]);
				model.setRep_trd_cd    		  (rep_trd_cd    	[i]);
				model.setRep_sub_trd_cd		  (rep_sub_trd_cd	[i]);
				model.setRlane_cd      		  (rlane_cd      	[i]);
				model.setDir_cd        		  (dir_cd        	[i]);
				model.setIoc_ts_cd     		  (ioc_ts_cd     	[i]);
				model.setBse_yrwk      		  (bse_yrwk      	[i]);
				model.setSls_ofc_cd    		  (sls_ofc_cd    	[i]);
				model.setPol_cd        		  (pol_cd        	[i]);
				model.setCd_dp_seq     		  (cd_dp_seq     	[i]);
				model.setTrd_cd        		  (trd_cd        	[i]);
				model.setSub_trd_cd    		  (sub_trd_cd    	[i]);
				model.setSls_rhq_cd    		  (sls_rhq_cd    	[i]);
				model.setSls_aq_cd     		  (sls_aq_cd     	[i]);
				model.setSls_rgn_ofc_cd		  (sls_rgn_ofc_cd	[i]);
				model.setCre_usr_id    		  (strUserId.trim());
				model.setCre_dt        		  (cre_dt        	[i]);
				model.setUpd_usr_id    		  (strUserId.trim());
				model.setUpd_dt        		  (upd_dt        	[i]);
				model.setBse_yr        		  (bse_yr        	[i]);
				model.setBse_wk      		  (bse_wk        	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	
	public static Collection fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		SPC_FCAST_OFC_POL_MAPG model = null;
		String strUserId = getUserId(request);
		Collection models = new ArrayList();
		String[] params = request.getParameterValues("rep_trd_cd");
		int length = request.getParameterValues(prefix+"rep_trd_cd")==null?0:request.getParameterValues(prefix+"rep_trd_cd").length;
		if (params == null)
			return models;
		//int length = request.getParameterValues("rep_trd_cd").length;
		//  int length = 10;
		//System.out.println("length" + new Integer(length).toString());
		
		try {
			String[] ibflag         =  (JSPUtil.getParameter(request, prefix + "ibflag"			.trim(), length ));
			String[] page_rows      =  (JSPUtil.getParameter(request, prefix + "page_rows"		.trim(), length));
			String[] rep_trd_cd     =  (JSPUtil.getParameter(request, prefix + "rep_trd_cd"		.trim(), length));
			String[] rep_sub_trd_cd =  (JSPUtil.getParameter(request, prefix + "rep_sub_trd_cd"	.trim(), length));
			String[] rlane_cd       =  (JSPUtil.getParameter(request, prefix + "rlane_cd"		.trim(), length));
			String[] dir_cd         =  (JSPUtil.getParameter(request, prefix + "dir_cd"			.trim(), length));
			String[] ioc_ts_cd      =  (JSPUtil.getParameter(request, prefix + "ioc_ts_cd"		.trim(), length));
			String[] bse_yrwk       =  (JSPUtil.getParameter(request, prefix + "bse_yrwk"		.trim(), length));
			String[] sls_ofc_cd     =  (JSPUtil.getParameter(request, prefix + "sls_ofc_cd"		.trim(), length));
			String[] pol_cd         =  (JSPUtil.getParameter(request, prefix + "pol_cd"			.trim(), length));
			String[] cd_dp_seq      =  (JSPUtil.getParameter(request, prefix + "cd_dp_seq"		.trim(), length));
			String[] trd_cd         =  (JSPUtil.getParameter(request, prefix + "trd_cd"			.trim(), length));
			String[] sub_trd_cd     =  (JSPUtil.getParameter(request, prefix + "sub_trd_cd"		.trim(), length));
			String[] sls_rhq_cd     =  (JSPUtil.getParameter(request, prefix + "sls_rhq_cd"		.trim(), length));
			String[] sls_aq_cd      =  (JSPUtil.getParameter(request, prefix + "sls_aq_cd"		.trim(), length));
			String[] sls_rgn_ofc_cd =  (JSPUtil.getParameter(request, prefix + "sls_rgn_ofc_cd"	.trim(), length));
			String[] cre_dt         =  (JSPUtil.getParameter(request, prefix + "cre_dt"			.trim(), length));
			String[] upd_dt         =  (JSPUtil.getParameter(request, prefix + "upd_dt"			.trim(), length));
			String[] bse_yr         =  (JSPUtil.getParameter(request, prefix + "bse_yr"			.trim(), length));
			String[] bse_wk         =  (JSPUtil.getParameter(request, prefix + "bse_wk"			.trim(), length));
			for (int i = 0; i < length; i++) {
				model = new SPC_FCAST_OFC_POL_MAPG();
				if (ibflag[i] != null) 
				model.setIbflag        		  ( ibflag        	[i]);
				if (page_rows[i] != null)
				model.setPage_rows     		  ( page_rows     	[i]);
				if (rep_trd_cd[i] != null)
				model.setRep_trd_cd    		  ( rep_trd_cd    	[i]);
				if (rep_sub_trd_cd[i] != null)
				model.setRep_sub_trd_cd		  ( rep_sub_trd_cd	[i]);
				if (rlane_cd[i] != null)
				model.setRlane_cd      		  ( rlane_cd      	[i]);
				if (dir_cd[i] != null)
				model.setDir_cd        		  ( dir_cd        	[i]);
				if (ioc_ts_cd[i] != null)
				model.setIoc_ts_cd     		  ( ioc_ts_cd     	[i]);
				model.setBse_yrwk      		  ( bse_yrwk      	[i]);
				if (sls_ofc_cd[i] != null)
				model.setSls_ofc_cd    		  ( sls_ofc_cd    	[i]);
				if (pol_cd[i] != null)
				model.setPol_cd        		  ( pol_cd        	[i]);
				model.setCd_dp_seq     		  ( cd_dp_seq     	[i]);
				model.setTrd_cd        		  ( trd_cd        	[i]);
				model.setSub_trd_cd    		  ( sub_trd_cd    	[i]);
				model.setSls_rhq_cd    		  ( sls_rhq_cd    	[i]);
				model.setSls_aq_cd     		  ( sls_aq_cd     	[i]);
				model.setSls_rgn_ofc_cd		  ( sls_rgn_ofc_cd	[i]);
				model.setCre_usr_id    		  ( strUserId.trim());
				model.setCre_dt        		  ( cre_dt        	[i]);
				model.setUpd_usr_id    		  ( strUserId.trim());
				model.setUpd_dt        		  ( upd_dt        	[i]);
				if (bse_yr[i] != null)
				model.setBse_yr        		  ( bse_yr        	[i]);
				if (bse_wk[i] != null)
				model.setBse_wk        		  ( bse_wk        	[i]);
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
	
	private static String getUserId(HttpServletRequest request) {
		HttpSession session = request.getSession();
		SignOnUserAccount account = ((SignOnUserAccount) (session
				.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT)));
		String strUserId = account.getUsr_id();
		return strUserId;
	}

}
