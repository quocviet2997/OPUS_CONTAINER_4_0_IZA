/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : COM_EMP_ROLE.java
*@FileTitle : 공통코드검색
*Open Issues :
*Change history :
*@LastModifyDate : 2006-09-15
*@LastModifier : HOESOO_JANG
*@LastVersion : 1.0
* 2006-09-15 HOESOO_JANG
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
 * @author HOESOO_JANG
 * @since J2EE 1.4
 */
public final class COM_EMP_ROLE implements java.io.Serializable {

	private String     ibflag     = "";
	private String     page_rows  = "";
	private String     role_cd    = "";
	private String     usr_id     = "";
	private String     cre_usr_id = "";
	private String     cre_dt     = "";
	private String     upd_usr_id = "";
	private String     upd_dt     = "";

	public COM_EMP_ROLE(){}

	public COM_EMP_ROLE(
			String     ibflag    ,
			String     page_rows ,
			String     role_cd   ,
			String     usr_id    ,
			String     cre_usr_id,
			String     cre_dt    ,
			String     upd_usr_id,
			String     upd_dt    ){
		this.ibflag     = ibflag    ;
		this.page_rows  = page_rows ;
		this.role_cd    = role_cd   ;
		this.usr_id     = usr_id    ;
		this.cre_usr_id = cre_usr_id;
		this.cre_dt     = cre_dt    ;
		this.upd_usr_id = upd_usr_id;
		this.upd_dt     = upd_dt    ;
	}

	// getter method is proceeding ..
	public String     getIbflag    (){	return ibflag    	;	}
	public String     getPage_rows (){	return page_rows 	;	}
	public String     getRole_cd   (){	return role_cd   	;	}
	public String     getUsr_id    (){	return usr_id    	;	}
	public String     getCre_usr_id(){	return cre_usr_id	;	}
	public String     getCre_dt    (){	return cre_dt    	;	}
	public String     getUpd_usr_id(){	return upd_usr_id	;	}
	public String     getUpd_dt    (){	return upd_dt    	;	}

	// setter method is proceeding ..
	public void setIbflag    ( String     ibflag     ){	this.ibflag     = ibflag    	;	}
	public void setPage_rows ( String     page_rows  ){	this.page_rows  = page_rows 	;	}
	public void setRole_cd   ( String     role_cd    ){	this.role_cd    = role_cd   	;	}
	public void setUsr_id    ( String     usr_id     ){	this.usr_id     = usr_id    	;	}
	public void setCre_usr_id( String     cre_usr_id ){	this.cre_usr_id = cre_usr_id	;	}
	public void setCre_dt    ( String     cre_dt     ){	this.cre_dt     = cre_dt    	;	}
	public void setUpd_usr_id( String     upd_usr_id ){	this.upd_usr_id = upd_usr_id	;	}
	public void setUpd_dt    ( String     upd_dt     ){	this.upd_dt     = upd_dt    	;	}

	public static COM_EMP_ROLE fromRequest(HttpServletRequest request) {
		COM_EMP_ROLE model = new COM_EMP_ROLE();
		try {
			model.setIbflag    	(JSPUtil.getParameter(request, "ibflag    		".trim(), ""));
			model.setPage_rows 	(JSPUtil.getParameter(request, "page_rows 		".trim(), ""));
			model.setRole_cd   	(JSPUtil.getParameter(request, "role_cd   		".trim(), ""));
			model.setUsr_id    	(JSPUtil.getParameter(request, "usr_id    		".trim(), ""));
			model.setCre_usr_id	(JSPUtil.getParameter(request, "cre_usr_id		".trim(), ""));
			model.setCre_dt    	(JSPUtil.getParameter(request, "cre_dt    		".trim(), ""));
			model.setUpd_usr_id	(JSPUtil.getParameter(request, "upd_usr_id		".trim(), ""));
			model.setUpd_dt    	(JSPUtil.getParameter(request, "upd_dt    		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		COM_EMP_ROLE model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag     =  (JSPUtil.getParameter(request, "ibflag    		".trim(), length));
			String[] page_rows  =  (JSPUtil.getParameter(request, "page_rows 		".trim(), length));
			String[] role_cd    =  (JSPUtil.getParameter(request, "role_cd   		".trim(), length));
			String[] usr_id     =  (JSPUtil.getParameter(request, "usr_id    		".trim(), length));
			String[] cre_usr_id =  (JSPUtil.getParameter(request, "cre_usr_id		".trim(), length));
			String[] cre_dt     =  (JSPUtil.getParameter(request, "cre_dt    		".trim(), length));
			String[] upd_usr_id =  (JSPUtil.getParameter(request, "upd_usr_id		".trim(), length));
			String[] upd_dt     =  (JSPUtil.getParameter(request, "upd_dt    		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new COM_EMP_ROLE();
				model.setIbflag    		  (ibflag    	[i]);
				model.setPage_rows 		  (page_rows 	[i]);
				model.setRole_cd   		  (role_cd   	[i]);
				model.setUsr_id    		  (usr_id    	[i]);
				model.setCre_usr_id		  (cre_usr_id	[i]);
				model.setCre_dt    		  (cre_dt    	[i]);
				model.setUpd_usr_id		  (upd_usr_id	[i]);
				model.setUpd_dt    		  (upd_dt    	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		COM_EMP_ROLE model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag     =  (JSPUtil.getParameter(request, prefix + "ibflag    		".trim(), length));
			String[] page_rows  =  (JSPUtil.getParameter(request, prefix + "page_rows 		".trim(), length));
			String[] role_cd    =  (JSPUtil.getParameter(request, prefix + "role_cd   		".trim(), length));
			String[] usr_id     =  (JSPUtil.getParameter(request, prefix + "usr_id    		".trim(), length));
			String[] cre_usr_id =  (JSPUtil.getParameter(request, prefix + "cre_usr_id		".trim(), length));
			String[] cre_dt     =  (JSPUtil.getParameter(request, prefix + "cre_dt    		".trim(), length));
			String[] upd_usr_id =  (JSPUtil.getParameter(request, prefix + "upd_usr_id		".trim(), length));
			String[] upd_dt     =  (JSPUtil.getParameter(request, prefix + "upd_dt    		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new COM_EMP_ROLE();
				model.setIbflag    		  ( ibflag    	[i]);
				model.setPage_rows 		  ( page_rows 	[i]);
				model.setRole_cd   		  ( role_cd   	[i]);
				model.setUsr_id    		  ( usr_id    	[i]);
				model.setCre_usr_id		  ( cre_usr_id	[i]);
				model.setCre_dt    		  ( cre_dt    	[i]);
				model.setUpd_usr_id		  ( upd_usr_id	[i]);
				model.setUpd_dt    		  ( upd_dt    	[i]);
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
