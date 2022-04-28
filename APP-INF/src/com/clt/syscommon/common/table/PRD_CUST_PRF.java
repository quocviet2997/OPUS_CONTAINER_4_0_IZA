/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : PRD_CUST_PRF.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2006-12-19
*@LastModifier : Jeongseon An
*@LastVersion : 1.0
* 2006-12-19 Jeongseon An
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
 * @author Jeongseon An
 * @since J2EE 1.4
 */
public final class PRD_CUST_PRF implements java.io.Serializable {

	private String      ibflag      = "";
	private String      page_rows   = "";
	private String      crm_row_id  = "";
	private String      cust_cnt_cd = "";
	private String      cust_seq    = "";
	private String      trsp_mod_cd = "";
	private String      org_loc_cd  = "";
	private String      dest_loc_cd = "";
	private String      vndr_cnt_cd = "";
	private String      vndr_seq    = "";
	private String      cre_usr_id  = "";
	private String      cre_dt      = "";
	private String      upd_usr_id  = "";
	private String      upd_dt      = "";

	public PRD_CUST_PRF(){}

	public PRD_CUST_PRF(
			String      ibflag     ,
			String      page_rows  ,
			String      crm_row_id ,
			String      cust_cnt_cd,
			String      cust_seq   ,
			String      trsp_mod_cd,
			String      org_loc_cd ,
			String      dest_loc_cd,
			String      vndr_cnt_cd,
			String      vndr_seq   ,
			String      cre_usr_id ,
			String      cre_dt     ,
			String      upd_usr_id ,
			String      upd_dt     ){
		this.ibflag      = ibflag     ;
		this.page_rows   = page_rows  ;
		this.crm_row_id  = crm_row_id ;
		this.cust_cnt_cd = cust_cnt_cd;
		this.cust_seq    = cust_seq   ;
		this.trsp_mod_cd = trsp_mod_cd;
		this.org_loc_cd  = org_loc_cd ;
		this.dest_loc_cd = dest_loc_cd;
		this.vndr_cnt_cd = vndr_cnt_cd;
		this.vndr_seq    = vndr_seq   ;
		this.cre_usr_id  = cre_usr_id ;
		this.cre_dt      = cre_dt     ;
		this.upd_usr_id  = upd_usr_id ;
		this.upd_dt      = upd_dt     ;
	}

	// getter method is proceeding ..
	public String      getIbflag     (){	return ibflag     	;	}
	public String      getPage_rows  (){	return page_rows  	;	}
	public String      getCrm_row_id (){	return crm_row_id 	;	}
	public String      getCust_cnt_cd(){	return cust_cnt_cd	;	}
	public String      getCust_seq   (){	return cust_seq   	;	}
	public String      getTrsp_mod_cd(){	return trsp_mod_cd	;	}
	public String      getOrg_loc_cd (){	return org_loc_cd 	;	}
	public String      getDest_loc_cd(){	return dest_loc_cd	;	}
	public String      getVndr_cnt_cd(){	return vndr_cnt_cd	;	}
	public String      getVndr_seq   (){	return vndr_seq   	;	}
	public String      getCre_usr_id (){	return cre_usr_id 	;	}
	public String      getCre_dt     (){	return cre_dt     	;	}
	public String      getUpd_usr_id (){	return upd_usr_id 	;	}
	public String      getUpd_dt     (){	return upd_dt     	;	}

	// setter method is proceeding ..
	public void setIbflag     ( String      ibflag      ){	this.ibflag      = ibflag     	;	}
	public void setPage_rows  ( String      page_rows   ){	this.page_rows   = page_rows  	;	}
	public void setCrm_row_id ( String      crm_row_id  ){	this.crm_row_id  = crm_row_id 	;	}
	public void setCust_cnt_cd( String      cust_cnt_cd ){	this.cust_cnt_cd = cust_cnt_cd	;	}
	public void setCust_seq   ( String      cust_seq    ){	this.cust_seq    = cust_seq   	;	}
	public void setTrsp_mod_cd( String      trsp_mod_cd ){	this.trsp_mod_cd = trsp_mod_cd	;	}
	public void setOrg_loc_cd ( String      org_loc_cd  ){	this.org_loc_cd  = org_loc_cd 	;	}
	public void setDest_loc_cd( String      dest_loc_cd ){	this.dest_loc_cd = dest_loc_cd	;	}
	public void setVndr_cnt_cd( String      vndr_cnt_cd ){	this.vndr_cnt_cd = vndr_cnt_cd	;	}
	public void setVndr_seq   ( String      vndr_seq    ){	this.vndr_seq    = vndr_seq   	;	}
	public void setCre_usr_id ( String      cre_usr_id  ){	this.cre_usr_id  = cre_usr_id 	;	}
	public void setCre_dt     ( String      cre_dt      ){	this.cre_dt      = cre_dt     	;	}
	public void setUpd_usr_id ( String      upd_usr_id  ){	this.upd_usr_id  = upd_usr_id 	;	}
	public void setUpd_dt     ( String      upd_dt      ){	this.upd_dt      = upd_dt     	;	}

	public static PRD_CUST_PRF fromRequest(HttpServletRequest request) {
		PRD_CUST_PRF model = new PRD_CUST_PRF();
		try {
			model.setIbflag     	(JSPUtil.getParameter(request, "ibflag     		".trim(), ""));
			model.setPage_rows  	(JSPUtil.getParameter(request, "page_rows  		".trim(), ""));
			model.setCrm_row_id 	(JSPUtil.getParameter(request, "crm_row_id 		".trim(), ""));
			model.setCust_cnt_cd	(JSPUtil.getParameter(request, "cust_cnt_cd		".trim(), ""));
			model.setCust_seq   	(JSPUtil.getParameter(request, "cust_seq   		".trim(), ""));
			model.setTrsp_mod_cd	(JSPUtil.getParameter(request, "trsp_mod_cd		".trim(), ""));
			model.setOrg_loc_cd 	(JSPUtil.getParameter(request, "org_loc_cd 		".trim(), ""));
			model.setDest_loc_cd	(JSPUtil.getParameter(request, "dest_loc_cd		".trim(), ""));
			model.setVndr_cnt_cd	(JSPUtil.getParameter(request, "vndr_cnt_cd		".trim(), ""));
			model.setVndr_seq   	(JSPUtil.getParameter(request, "vndr_seq   		".trim(), ""));
			model.setCre_usr_id 	(JSPUtil.getParameter(request, "cre_usr_id 		".trim(), ""));
			model.setCre_dt     	(JSPUtil.getParameter(request, "cre_dt     		".trim(), ""));
			model.setUpd_usr_id 	(JSPUtil.getParameter(request, "upd_usr_id 		".trim(), ""));
			model.setUpd_dt     	(JSPUtil.getParameter(request, "upd_dt     		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		PRD_CUST_PRF model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag      =  (JSPUtil.getParameter(request, "ibflag     		".trim(), length));
			String[] page_rows   =  (JSPUtil.getParameter(request, "page_rows  		".trim(), length));
			String[] crm_row_id  =  (JSPUtil.getParameter(request, "crm_row_id 		".trim(), length));
			String[] cust_cnt_cd =  (JSPUtil.getParameter(request, "cust_cnt_cd		".trim(), length));
			String[] cust_seq    =  (JSPUtil.getParameter(request, "cust_seq   		".trim(), length));
			String[] trsp_mod_cd =  (JSPUtil.getParameter(request, "trsp_mod_cd		".trim(), length));
			String[] org_loc_cd  =  (JSPUtil.getParameter(request, "org_loc_cd 		".trim(), length));
			String[] dest_loc_cd =  (JSPUtil.getParameter(request, "dest_loc_cd		".trim(), length));
			String[] vndr_cnt_cd =  (JSPUtil.getParameter(request, "vndr_cnt_cd		".trim(), length));
			String[] vndr_seq    =  (JSPUtil.getParameter(request, "vndr_seq   		".trim(), length));
			String[] cre_usr_id  =  (JSPUtil.getParameter(request, "cre_usr_id 		".trim(), length));
			String[] cre_dt      =  (JSPUtil.getParameter(request, "cre_dt     		".trim(), length));
			String[] upd_usr_id  =  (JSPUtil.getParameter(request, "upd_usr_id 		".trim(), length));
			String[] upd_dt      =  (JSPUtil.getParameter(request, "upd_dt     		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new PRD_CUST_PRF();
				model.setIbflag     		  (ibflag     	[i]);
				model.setPage_rows  		  (page_rows  	[i]);
				model.setCrm_row_id 		  (crm_row_id 	[i]);
				model.setCust_cnt_cd		  (cust_cnt_cd	[i]);
				model.setCust_seq   		  (cust_seq   	[i]);
				model.setTrsp_mod_cd		  (trsp_mod_cd	[i]);
				model.setOrg_loc_cd 		  (org_loc_cd 	[i]);
				model.setDest_loc_cd		  (dest_loc_cd	[i]);
				model.setVndr_cnt_cd		  (vndr_cnt_cd	[i]);
				model.setVndr_seq   		  (vndr_seq   	[i]);
				model.setCre_usr_id 		  (cre_usr_id 	[i]);
				model.setCre_dt     		  (cre_dt     	[i]);
				model.setUpd_usr_id 		  (upd_usr_id 	[i]);
				model.setUpd_dt     		  (upd_dt     	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		PRD_CUST_PRF model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag      =  (JSPUtil.getParameter(request, prefix + "ibflag     		".trim(), length));
			String[] page_rows   =  (JSPUtil.getParameter(request, prefix + "page_rows  		".trim(), length));
			String[] crm_row_id  =  (JSPUtil.getParameter(request, prefix + "crm_row_id 		".trim(), length));
			String[] cust_cnt_cd =  (JSPUtil.getParameter(request, prefix + "cust_cnt_cd		".trim(), length));
			String[] cust_seq    =  (JSPUtil.getParameter(request, prefix + "cust_seq   		".trim(), length));
			String[] trsp_mod_cd =  (JSPUtil.getParameter(request, prefix + "trsp_mod_cd		".trim(), length));
			String[] org_loc_cd  =  (JSPUtil.getParameter(request, prefix + "org_loc_cd 		".trim(), length));
			String[] dest_loc_cd =  (JSPUtil.getParameter(request, prefix + "dest_loc_cd		".trim(), length));
			String[] vndr_cnt_cd =  (JSPUtil.getParameter(request, prefix + "vndr_cnt_cd		".trim(), length));
			String[] vndr_seq    =  (JSPUtil.getParameter(request, prefix + "vndr_seq   		".trim(), length));
			String[] cre_usr_id  =  (JSPUtil.getParameter(request, prefix + "cre_usr_id 		".trim(), length));
			String[] cre_dt      =  (JSPUtil.getParameter(request, prefix + "cre_dt     		".trim(), length));
			String[] upd_usr_id  =  (JSPUtil.getParameter(request, prefix + "upd_usr_id 		".trim(), length));
			String[] upd_dt      =  (JSPUtil.getParameter(request, prefix + "upd_dt     		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new PRD_CUST_PRF();
				model.setIbflag     		  ( ibflag     	[i]);
				model.setPage_rows  		  ( page_rows  	[i]);
				model.setCrm_row_id 		  ( crm_row_id 	[i]);
				model.setCust_cnt_cd		  ( cust_cnt_cd	[i]);
				model.setCust_seq   		  ( cust_seq   	[i]);
				model.setTrsp_mod_cd		  ( trsp_mod_cd	[i]);
				model.setOrg_loc_cd 		  ( org_loc_cd 	[i]);
				model.setDest_loc_cd		  ( dest_loc_cd	[i]);
				model.setVndr_cnt_cd		  ( vndr_cnt_cd	[i]);
				model.setVndr_seq   		  ( vndr_seq   	[i]);
				model.setCre_usr_id 		  ( cre_usr_id 	[i]);
				model.setCre_dt     		  ( cre_dt     	[i]);
				model.setUpd_usr_id 		  ( upd_usr_id 	[i]);
				model.setUpd_dt     		  ( upd_dt     	[i]);
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
