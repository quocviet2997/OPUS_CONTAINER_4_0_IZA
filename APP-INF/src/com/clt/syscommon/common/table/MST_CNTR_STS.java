/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : MST_CNTR_STS.java
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
public final class MST_CNTR_STS implements java.io.Serializable {

	private String      ibflag      = "";
	private String      page_rows   = "";
	private String      cntr_sts_cd = "";
	private String      cntr_sts_nm = "";
	private String      cre_dt      = "";
	private String      upd_dt      = "";
	private String      upd_usr_id  = "";
	private String      nis_evnt_dt = "";
	private String      eai_evnt_dt = "";

	public MST_CNTR_STS(){}

	public MST_CNTR_STS(
			String      ibflag     ,
			String      page_rows  ,
			String      cntr_sts_cd,
			String      cntr_sts_nm,
			String      cre_dt     ,
			String      upd_dt     ,
			String      upd_usr_id ,
			String      nis_evnt_dt,
			String      eai_evnt_dt){
		this.ibflag      = ibflag     ;
		this.page_rows   = page_rows  ;
		this.cntr_sts_cd = cntr_sts_cd;
		this.cntr_sts_nm = cntr_sts_nm;
		this.cre_dt      = cre_dt     ;
		this.upd_dt      = upd_dt     ;
		this.upd_usr_id  = upd_usr_id ;
		this.nis_evnt_dt = nis_evnt_dt;
		this.eai_evnt_dt = eai_evnt_dt;
	}

	// getter method is proceeding ..
	public String      getIbflag     (){	return ibflag     	;	}
	public String      getPage_rows  (){	return page_rows  	;	}
	public String      getCntr_sts_cd(){	return cntr_sts_cd	;	}
	public String      getCntr_sts_nm(){	return cntr_sts_nm	;	}
	public String      getCre_dt     (){	return cre_dt     	;	}
	public String      getUpd_dt     (){	return upd_dt     	;	}
	public String      getUpd_usr_id (){	return upd_usr_id 	;	}
	public String      getNis_evnt_dt(){	return nis_evnt_dt	;	}
	public String      getEai_evnt_dt(){	return eai_evnt_dt	;	}

	// setter method is proceeding ..
	public void setIbflag     ( String      ibflag      ){	this.ibflag      = ibflag     	;	}
	public void setPage_rows  ( String      page_rows   ){	this.page_rows   = page_rows  	;	}
	public void setCntr_sts_cd( String      cntr_sts_cd ){	this.cntr_sts_cd = cntr_sts_cd	;	}
	public void setCntr_sts_nm( String      cntr_sts_nm ){	this.cntr_sts_nm = cntr_sts_nm	;	}
	public void setCre_dt     ( String      cre_dt      ){	this.cre_dt      = cre_dt     	;	}
	public void setUpd_dt     ( String      upd_dt      ){	this.upd_dt      = upd_dt     	;	}
	public void setUpd_usr_id ( String      upd_usr_id  ){	this.upd_usr_id  = upd_usr_id 	;	}
	public void setNis_evnt_dt( String      nis_evnt_dt ){	this.nis_evnt_dt = nis_evnt_dt	;	}
	public void setEai_evnt_dt( String      eai_evnt_dt ){	this.eai_evnt_dt = eai_evnt_dt	;	}

	public static MST_CNTR_STS fromRequest(HttpServletRequest request) {
		MST_CNTR_STS model = new MST_CNTR_STS();
		try {
			model.setIbflag     	(JSPUtil.getParameter(request, "ibflag     		".trim(), ""));
			model.setPage_rows  	(JSPUtil.getParameter(request, "page_rows  		".trim(), ""));
			model.setCntr_sts_cd	(JSPUtil.getParameter(request, "cntr_sts_cd		".trim(), ""));
			model.setCntr_sts_nm	(JSPUtil.getParameter(request, "cntr_sts_nm		".trim(), ""));
			model.setCre_dt     	(JSPUtil.getParameter(request, "cre_dt     		".trim(), ""));
			model.setUpd_dt     	(JSPUtil.getParameter(request, "upd_dt     		".trim(), ""));
			model.setUpd_usr_id 	(JSPUtil.getParameter(request, "upd_usr_id 		".trim(), ""));
			model.setNis_evnt_dt	(JSPUtil.getParameter(request, "nis_evnt_dt		".trim(), ""));
			model.setEai_evnt_dt	(JSPUtil.getParameter(request, "eai_evnt_dt		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		MST_CNTR_STS model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag      =  (JSPUtil.getParameter(request, "ibflag     		".trim(), length));
			String[] page_rows   =  (JSPUtil.getParameter(request, "page_rows  		".trim(), length));
			String[] cntr_sts_cd =  (JSPUtil.getParameter(request, "cntr_sts_cd		".trim(), length));
			String[] cntr_sts_nm =  (JSPUtil.getParameter(request, "cntr_sts_nm		".trim(), length));
			String[] cre_dt      =  (JSPUtil.getParameter(request, "cre_dt     		".trim(), length));
			String[] upd_dt      =  (JSPUtil.getParameter(request, "upd_dt     		".trim(), length));
			String[] upd_usr_id  =  (JSPUtil.getParameter(request, "upd_usr_id 		".trim(), length));
			String[] nis_evnt_dt =  (JSPUtil.getParameter(request, "nis_evnt_dt		".trim(), length));
			String[] eai_evnt_dt =  (JSPUtil.getParameter(request, "eai_evnt_dt		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new MST_CNTR_STS();
				model.setIbflag     		  (ibflag     	[i]);
				model.setPage_rows  		  (page_rows  	[i]);
				model.setCntr_sts_cd		  (cntr_sts_cd	[i]);
				model.setCntr_sts_nm		  (cntr_sts_nm	[i]);
				model.setCre_dt     		  (cre_dt     	[i]);
				model.setUpd_dt     		  (upd_dt     	[i]);
				model.setUpd_usr_id 		  (upd_usr_id 	[i]);
				model.setNis_evnt_dt		  (nis_evnt_dt	[i]);
				model.setEai_evnt_dt		  (eai_evnt_dt	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		MST_CNTR_STS model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag      =  (JSPUtil.getParameter(request, prefix + "ibflag     		".trim(), length));
			String[] page_rows   =  (JSPUtil.getParameter(request, prefix + "page_rows  		".trim(), length));
			String[] cntr_sts_cd =  (JSPUtil.getParameter(request, prefix + "cntr_sts_cd		".trim(), length));
			String[] cntr_sts_nm =  (JSPUtil.getParameter(request, prefix + "cntr_sts_nm		".trim(), length));
			String[] cre_dt      =  (JSPUtil.getParameter(request, prefix + "cre_dt     		".trim(), length));
			String[] upd_dt      =  (JSPUtil.getParameter(request, prefix + "upd_dt     		".trim(), length));
			String[] upd_usr_id  =  (JSPUtil.getParameter(request, prefix + "upd_usr_id 		".trim(), length));
			String[] nis_evnt_dt =  (JSPUtil.getParameter(request, prefix + "nis_evnt_dt		".trim(), length));
			String[] eai_evnt_dt =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new MST_CNTR_STS();
				model.setIbflag     		  ( ibflag     	[i]);
				model.setPage_rows  		  ( page_rows  	[i]);
				model.setCntr_sts_cd		  ( cntr_sts_cd	[i]);
				model.setCntr_sts_nm		  ( cntr_sts_nm	[i]);
				model.setCre_dt     		  ( cre_dt     	[i]);
				model.setUpd_dt     		  ( upd_dt     	[i]);
				model.setUpd_usr_id 		  ( upd_usr_id 	[i]);
				model.setNis_evnt_dt		  ( nis_evnt_dt	[i]);
				model.setEai_evnt_dt		  ( eai_evnt_dt	[i]);
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
