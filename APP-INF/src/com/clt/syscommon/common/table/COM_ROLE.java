/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : COM_ROLE.java
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
public final class COM_ROLE implements java.io.Serializable {

	private String     ibflag     = "";
	private String     page_rows  = "";
	private String     role_cd    = "";
	private String     role_nm    = "";
	private String     role_desc  = "";
	private String     up_role_cd = "";
	private String     cre_dt     = "";
	private String     cre_usr_id = "";

	public COM_ROLE(){}

	public COM_ROLE(
			String     ibflag    ,
			String     page_rows ,
			String     role_cd   ,
			String     role_nm   ,
			String     role_desc ,
			String     up_role_cd,
			String     cre_dt    ,
			String     cre_usr_id){
		this.ibflag     = ibflag    ;
		this.page_rows  = page_rows ;
		this.role_cd    = role_cd   ;
		this.role_nm    = role_nm   ;
		this.role_desc  = role_desc ;
		this.up_role_cd = up_role_cd;
		this.cre_dt     = cre_dt    ;
		this.cre_usr_id = cre_usr_id;
	}

	// getter method is proceeding ..
	public String     getIbflag    (){	return ibflag    	;	}
	public String     getPage_rows (){	return page_rows 	;	}
	public String     getRole_cd   (){	return role_cd   	;	}
	public String     getRole_nm   (){	return role_nm   	;	}
	public String     getRole_desc (){	return role_desc 	;	}
	public String     getUp_role_cd(){	return up_role_cd	;	}
	public String     getCre_dt    (){	return cre_dt    	;	}
	public String     getCre_usr_id(){	return cre_usr_id	;	}

	// setter method is proceeding ..
	public void setIbflag    ( String     ibflag     ){	this.ibflag     = ibflag    	;	}
	public void setPage_rows ( String     page_rows  ){	this.page_rows  = page_rows 	;	}
	public void setRole_cd   ( String     role_cd    ){	this.role_cd    = role_cd   	;	}
	public void setRole_nm   ( String     role_nm    ){	this.role_nm    = role_nm   	;	}
	public void setRole_desc ( String     role_desc  ){	this.role_desc  = role_desc 	;	}
	public void setUp_role_cd( String     up_role_cd ){	this.up_role_cd = up_role_cd	;	}
	public void setCre_dt    ( String     cre_dt     ){	this.cre_dt     = cre_dt    	;	}
	public void setCre_usr_id( String     cre_usr_id ){	this.cre_usr_id = cre_usr_id	;	}

	public static COM_ROLE fromRequest(HttpServletRequest request) {
		COM_ROLE model = new COM_ROLE();
		try {
			model.setIbflag    	(JSPUtil.getParameter(request, "ibflag    		".trim(), ""));
			model.setPage_rows 	(JSPUtil.getParameter(request, "page_rows 		".trim(), ""));
			model.setRole_cd   	(JSPUtil.getParameter(request, "role_cd   		".trim(), ""));
			model.setRole_nm   	(JSPUtil.getParameter(request, "role_nm   		".trim(), ""));
			model.setRole_desc 	(JSPUtil.getParameter(request, "role_desc 		".trim(), ""));
			model.setUp_role_cd	(JSPUtil.getParameter(request, "up_role_cd		".trim(), ""));
			model.setCre_dt    	(JSPUtil.getParameter(request, "cre_dt    		".trim(), ""));
			model.setCre_usr_id	(JSPUtil.getParameter(request, "cre_usr_id		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		COM_ROLE model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag     =  (JSPUtil.getParameter(request, "ibflag    		".trim(), length));
			String[] page_rows  =  (JSPUtil.getParameter(request, "page_rows 		".trim(), length));
			String[] role_cd    =  (JSPUtil.getParameter(request, "role_cd   		".trim(), length));
			String[] role_nm    =  (JSPUtil.getParameter(request, "role_nm   		".trim(), length));
			String[] role_desc  =  (JSPUtil.getParameter(request, "role_desc 		".trim(), length));
			String[] up_role_cd =  (JSPUtil.getParameter(request, "up_role_cd		".trim(), length));
			String[] cre_dt     =  (JSPUtil.getParameter(request, "cre_dt    		".trim(), length));
			String[] cre_usr_id =  (JSPUtil.getParameter(request, "cre_usr_id		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new COM_ROLE();
				model.setIbflag    		  (ibflag    	[i]);
				model.setPage_rows 		  (page_rows 	[i]);
				model.setRole_cd   		  (role_cd   	[i]);
				model.setRole_nm   		  (role_nm   	[i]);
				model.setRole_desc 		  (role_desc 	[i]);
				model.setUp_role_cd		  (up_role_cd	[i]);
				model.setCre_dt    		  (cre_dt    	[i]);
				model.setCre_usr_id		  (cre_usr_id	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		COM_ROLE model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag     =  (JSPUtil.getParameter(request, prefix + "ibflag    		".trim(), length));
			String[] page_rows  =  (JSPUtil.getParameter(request, prefix + "page_rows 		".trim(), length));
			String[] role_cd    =  (JSPUtil.getParameter(request, prefix + "role_cd   		".trim(), length));
			String[] role_nm    =  (JSPUtil.getParameter(request, prefix + "role_nm   		".trim(), length));
			String[] role_desc  =  (JSPUtil.getParameter(request, prefix + "role_desc 		".trim(), length));
			String[] up_role_cd =  (JSPUtil.getParameter(request, prefix + "up_role_cd		".trim(), length));
			String[] cre_dt     =  (JSPUtil.getParameter(request, prefix + "cre_dt    		".trim(), length));
			String[] cre_usr_id =  (JSPUtil.getParameter(request, prefix + "cre_usr_id		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new COM_ROLE();
				model.setIbflag    		  ( ibflag    	[i]);
				model.setPage_rows 		  ( page_rows 	[i]);
				model.setRole_cd   		  ( role_cd   	[i]);
				model.setRole_nm   		  ( role_nm   	[i]);
				model.setRole_desc 		  ( role_desc 	[i]);
				model.setUp_role_cd		  ( up_role_cd	[i]);
				model.setCre_dt    		  ( cre_dt    	[i]);
				model.setCre_usr_id		  ( cre_usr_id	[i]);
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
