/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : AR_FINC_DIR_CONV.java
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
public final class AR_FINC_DIR_CONV implements java.io.Serializable {

	private String       ibflag       = "";
	private String       page_rows    = "";
	private String       slan_cd      = "";
	private String       sconti_cd    = "";
	private String       slan_dir_cd  = "";
	private String       rlane_dir_cd = "";
	private String       dir_cng_cd   = "";
	private String       delt_flg     = "";
	private String       upd_usr_id   = "";
	private String       cre_dt       = "";
	private String       upd_dt       = "";
	private String       eai_evnt_dt  = "";
	private String 		ap_mk = "";

	public AR_FINC_DIR_CONV(){}

	public AR_FINC_DIR_CONV(
			String       ibflag      ,
			String       page_rows   ,
			String       slan_cd     ,
			String       sconti_cd   ,
			String       slan_dir_cd ,
			String       rlane_dir_cd,
			String       dir_cng_cd  ,
			String       delt_flg    ,
			String       upd_usr_id  ,
			String       cre_dt      ,
			String       upd_dt      ,
			String       eai_evnt_dt ,
			String 		ap_mk ){
		this.ibflag       = ibflag      ;
		this.page_rows    = page_rows   ;
		this.slan_cd      = slan_cd     ;
		this.sconti_cd    = sconti_cd   ;
		this.slan_dir_cd  = slan_dir_cd ;
		this.rlane_dir_cd = rlane_dir_cd;
		this.dir_cng_cd   = dir_cng_cd  ;
		this.delt_flg     = delt_flg    ;
		this.upd_usr_id   = upd_usr_id  ;
		this.cre_dt       = cre_dt      ;
		this.upd_dt       = upd_dt      ;
		this.eai_evnt_dt  = eai_evnt_dt ;
		this.ap_mk = ap_mk;
	}

	// getter method is proceeding ..
	public String       getIbflag      (){	return ibflag      	;	}
	public String       getPage_rows   (){	return page_rows   	;	}
	public String       getSlan_cd     (){	return slan_cd     	;	}
	public String       getSconti_cd   (){	return sconti_cd   	;	}
	public String       getSlan_dir_cd (){	return slan_dir_cd 	;	}
	public String       getRlane_dir_cd(){	return rlane_dir_cd	;	}
	public String       getDir_cng_cd  (){	return dir_cng_cd  	;	}
	public String       getDelt_flg    (){	return delt_flg    	;	}
	public String       getUpd_usr_id  (){	return upd_usr_id  	;	}
	public String       getCre_dt      (){	return cre_dt      	;	}
	public String       getUpd_dt      (){	return upd_dt      	;	}
	public String       getEai_evnt_dt (){	return eai_evnt_dt 	;	}
	public String getAp_mk() {
		return ap_mk;
	}

	// setter method is proceeding ..
	public void setIbflag      ( String       ibflag       ){	this.ibflag       = ibflag      	;	}
	public void setPage_rows   ( String       page_rows    ){	this.page_rows    = page_rows   	;	}
	public void setSlan_cd     ( String       slan_cd      ){	this.slan_cd      = slan_cd     	;	}
	public void setSconti_cd   ( String       sconti_cd    ){	this.sconti_cd    = sconti_cd   	;	}
	public void setSlan_dir_cd ( String       slan_dir_cd  ){	this.slan_dir_cd  = slan_dir_cd 	;	}
	public void setRlane_dir_cd( String       rlane_dir_cd ){	this.rlane_dir_cd = rlane_dir_cd	;	}
	public void setDir_cng_cd  ( String       dir_cng_cd   ){	this.dir_cng_cd   = dir_cng_cd  	;	}
	public void setDelt_flg    ( String       delt_flg     ){	this.delt_flg     = delt_flg    	;	}
	public void setUpd_usr_id  ( String       upd_usr_id   ){	this.upd_usr_id   = upd_usr_id  	;	}
	public void setCre_dt      ( String       cre_dt       ){	this.cre_dt       = cre_dt      	;	}
	public void setUpd_dt      ( String       upd_dt       ){	this.upd_dt       = upd_dt      	;	}
	public void setEai_evnt_dt ( String       eai_evnt_dt  ){	this.eai_evnt_dt  = eai_evnt_dt 	;	}
	public void setAp_mk(String ap_mk) {
		this.ap_mk = ap_mk;
	}

	public static AR_FINC_DIR_CONV fromRequest(HttpServletRequest request) {
		AR_FINC_DIR_CONV model = new AR_FINC_DIR_CONV();
		try {
			model.setIbflag      	(JSPUtil.getParameter(request, "ibflag      		".trim(), ""));
			model.setPage_rows   	(JSPUtil.getParameter(request, "page_rows   		".trim(), ""));
			model.setSlan_cd     	(JSPUtil.getParameter(request, "slan_cd     		".trim(), ""));
			model.setSconti_cd   	(JSPUtil.getParameter(request, "sconti_cd   		".trim(), ""));
			model.setSlan_dir_cd 	(JSPUtil.getParameter(request, "slan_dir_cd 		".trim(), ""));
			model.setRlane_dir_cd	(JSPUtil.getParameter(request, "rlane_dir_cd		".trim(), ""));
			model.setDir_cng_cd  	(JSPUtil.getParameter(request, "dir_cng_cd  		".trim(), ""));
			model.setDelt_flg    	(JSPUtil.getParameter(request, "delt_flg    		".trim(), ""));
			model.setUpd_usr_id  	(JSPUtil.getParameter(request, "upd_usr_id  		".trim(), ""));
			model.setCre_dt      	(JSPUtil.getParameter(request, "cre_dt      		".trim(), ""));
			model.setUpd_dt      	(JSPUtil.getParameter(request, "upd_dt      		".trim(), ""));
			model.setEai_evnt_dt 	(JSPUtil.getParameter(request, "eai_evnt_dt 		".trim(), ""));
			model.setAp_mk 	(JSPUtil.getParameter(request, "ap_mk 		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		AR_FINC_DIR_CONV model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag       =  (JSPUtil.getParameter(request, "ibflag      		".trim(), length));
			String[] page_rows    =  (JSPUtil.getParameter(request, "page_rows   		".trim(), length));
			String[] slan_cd      =  (JSPUtil.getParameter(request, "slan_cd     		".trim(), length));
			String[] sconti_cd    =  (JSPUtil.getParameter(request, "sconti_cd   		".trim(), length));
			String[] slan_dir_cd  =  (JSPUtil.getParameter(request, "slan_dir_cd 		".trim(), length));
			String[] rlane_dir_cd =  (JSPUtil.getParameter(request, "rlane_dir_cd		".trim(), length));
			String[] dir_cng_cd   =  (JSPUtil.getParameter(request, "dir_cng_cd  		".trim(), length));
			String[] delt_flg     =  (JSPUtil.getParameter(request, "delt_flg    		".trim(), length));
			String[] upd_usr_id   =  (JSPUtil.getParameter(request, "upd_usr_id  		".trim(), length));
			String[] cre_dt       =  (JSPUtil.getParameter(request, "cre_dt      		".trim(), length));
			String[] upd_dt       =  (JSPUtil.getParameter(request, "upd_dt      		".trim(), length));
			String[] eai_evnt_dt  =  (JSPUtil.getParameter(request, "eai_evnt_dt 		".trim(), length));
			String[] ap_mk  =  (JSPUtil.getParameter(request, "ap_mk 		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new AR_FINC_DIR_CONV();
				model.setIbflag      		  (ibflag      	[i]);
				model.setPage_rows   		  (page_rows   	[i]);
				model.setSlan_cd     		  (slan_cd     	[i]);
				model.setSconti_cd   		  (sconti_cd   	[i]);
				model.setSlan_dir_cd 		  (slan_dir_cd 	[i]);
				model.setRlane_dir_cd		  (rlane_dir_cd	[i]);
				model.setDir_cng_cd  		  (dir_cng_cd  	[i]);
				model.setDelt_flg    		  (delt_flg    	[i]);
				model.setUpd_usr_id  		  (upd_usr_id  	[i]);
				model.setCre_dt      		  (cre_dt      	[i]);
				model.setUpd_dt      		  (upd_dt      	[i]);
				model.setEai_evnt_dt 		  (eai_evnt_dt 	[i]);
				model.setAp_mk 		  (ap_mk 	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		AR_FINC_DIR_CONV model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag       =  (JSPUtil.getParameter(request, prefix + "ibflag      		".trim(), length));
			String[] page_rows    =  (JSPUtil.getParameter(request, prefix + "page_rows   		".trim(), length));
			String[] slan_cd      =  (JSPUtil.getParameter(request, prefix + "slan_cd     		".trim(), length));
			String[] sconti_cd    =  (JSPUtil.getParameter(request, prefix + "sconti_cd   		".trim(), length));
			String[] slan_dir_cd  =  (JSPUtil.getParameter(request, prefix + "slan_dir_cd 		".trim(), length));
			String[] rlane_dir_cd =  (JSPUtil.getParameter(request, prefix + "rlane_dir_cd		".trim(), length));
			String[] dir_cng_cd   =  (JSPUtil.getParameter(request, prefix + "dir_cng_cd  		".trim(), length));
			String[] delt_flg     =  (JSPUtil.getParameter(request, prefix + "delt_flg    		".trim(), length));
			String[] upd_usr_id   =  (JSPUtil.getParameter(request, prefix + "upd_usr_id  		".trim(), length));
			String[] cre_dt       =  (JSPUtil.getParameter(request, prefix + "cre_dt      		".trim(), length));
			String[] upd_dt       =  (JSPUtil.getParameter(request, prefix + "upd_dt      		".trim(), length));
			String[] eai_evnt_dt  =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt 		".trim(), length));
			String[] ap_mk  =  (JSPUtil.getParameter(request, prefix + "ap_mk 		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new AR_FINC_DIR_CONV();
				model.setIbflag      		  ( ibflag      	[i]);
				model.setPage_rows   		  ( page_rows   	[i]);
				model.setSlan_cd     		  ( slan_cd     	[i]);
				model.setSconti_cd   		  ( sconti_cd   	[i]);
				model.setSlan_dir_cd 		  ( slan_dir_cd 	[i]);
				model.setRlane_dir_cd		  ( rlane_dir_cd	[i]);
				model.setDir_cng_cd  		  ( dir_cng_cd  	[i]);
				model.setDelt_flg    		  ( delt_flg    	[i]);
				model.setUpd_usr_id  		  ( upd_usr_id  	[i]);
				model.setCre_dt      		  ( cre_dt      	[i]);
				model.setUpd_dt      		  ( upd_dt      	[i]);
				model.setEai_evnt_dt 		  ( eai_evnt_dt 	[i]);
				model.setAp_mk 		  ( ap_mk 	[i]);
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
