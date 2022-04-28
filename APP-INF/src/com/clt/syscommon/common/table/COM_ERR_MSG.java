/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : COM_ERR_MSG.java
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
public final class COM_ERR_MSG implements java.io.Serializable {

	private String     ibflag     = "";
	private String     page_rows  = "";
	private String     err_msg_cd = "";
	private String     lang_tp_cd = "";
	private String     err_tp_cd  = "";
	private String     err_msg    = "";
	private String     err_desc   = "";
	private String     cre_usr_id = "";
	private String     cre_dt     = "";
	private String     upd_usr_id = "";
	private String     upd_dt     = "";

	public COM_ERR_MSG(){}

	public COM_ERR_MSG(
			String     ibflag    ,
			String     page_rows ,
			String     err_msg_cd,
			String     lang_tp_cd,
			String     err_tp_cd ,
			String     err_msg   ,
			String     err_desc  ,
			String     cre_usr_id,
			String     cre_dt    ,
			String     upd_usr_id,
			String     upd_dt    ){
		this.ibflag     = ibflag    ;
		this.page_rows  = page_rows ;
		this.err_msg_cd = err_msg_cd;
		this.lang_tp_cd = lang_tp_cd;
		this.err_tp_cd  = err_tp_cd ;
		this.err_msg    = err_msg   ;
		this.err_desc   = err_desc  ;
		this.cre_usr_id = cre_usr_id;
		this.cre_dt     = cre_dt    ;
		this.upd_usr_id = upd_usr_id;
		this.upd_dt     = upd_dt    ;
	}

	// getter method is proceeding ..
	public String     getIbflag    (){	return ibflag    	;	}
	public String     getPage_rows (){	return page_rows 	;	}
	public String     getErr_msg_cd(){	return err_msg_cd	;	}
	public String     getLang_tp_cd(){	return lang_tp_cd	;	}
	public String     getErr_tp_cd (){	return err_tp_cd 	;	}
	public String     getErr_msg   (){	return err_msg   	;	}
	public String     getErr_desc  (){	return err_desc  	;	}
	public String     getCre_usr_id(){	return cre_usr_id	;	}
	public String     getCre_dt    (){	return cre_dt    	;	}
	public String     getUpd_usr_id(){	return upd_usr_id	;	}
	public String     getUpd_dt    (){	return upd_dt    	;	}

	// setter method is proceeding ..
	public void setIbflag    ( String     ibflag     ){	this.ibflag     = ibflag    	;	}
	public void setPage_rows ( String     page_rows  ){	this.page_rows  = page_rows 	;	}
	public void setErr_msg_cd( String     err_msg_cd ){	this.err_msg_cd = err_msg_cd	;	}
	public void setLang_tp_cd( String     lang_tp_cd ){	this.lang_tp_cd = lang_tp_cd	;	}
	public void setErr_tp_cd ( String     err_tp_cd  ){	this.err_tp_cd  = err_tp_cd 	;	}
	public void setErr_msg   ( String     err_msg    ){	this.err_msg    = err_msg   	;	}
	public void setErr_desc  ( String     err_desc   ){	this.err_desc   = err_desc  	;	}
	public void setCre_usr_id( String     cre_usr_id ){	this.cre_usr_id = cre_usr_id	;	}
	public void setCre_dt    ( String     cre_dt     ){	this.cre_dt     = cre_dt    	;	}
	public void setUpd_usr_id( String     upd_usr_id ){	this.upd_usr_id = upd_usr_id	;	}
	public void setUpd_dt    ( String     upd_dt     ){	this.upd_dt     = upd_dt    	;	}

	public static COM_ERR_MSG fromRequest(HttpServletRequest request) {
		COM_ERR_MSG model = new COM_ERR_MSG();
		try {
			model.setIbflag    	(JSPUtil.getParameter(request, "ibflag    		".trim(), ""));
			model.setPage_rows 	(JSPUtil.getParameter(request, "page_rows 		".trim(), ""));
			model.setErr_msg_cd	(JSPUtil.getParameter(request, "err_msg_cd		".trim(), ""));
			model.setLang_tp_cd	(JSPUtil.getParameter(request, "lang_tp_cd		".trim(), ""));
			model.setErr_tp_cd 	(JSPUtil.getParameter(request, "err_tp_cd 		".trim(), ""));
			model.setErr_msg   	(JSPUtil.getParameter(request, "err_msg   		".trim(), ""));
			model.setErr_desc  	(JSPUtil.getParameter(request, "err_desc  		".trim(), ""));
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
		COM_ERR_MSG model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag     =  (JSPUtil.getParameter(request, "ibflag    		".trim(), length));
			String[] page_rows  =  (JSPUtil.getParameter(request, "page_rows 		".trim(), length));
			String[] err_msg_cd =  (JSPUtil.getParameter(request, "err_msg_cd		".trim(), length));
			String[] lang_tp_cd =  (JSPUtil.getParameter(request, "lang_tp_cd		".trim(), length));
			String[] err_tp_cd  =  (JSPUtil.getParameter(request, "err_tp_cd 		".trim(), length));
			String[] err_msg    =  (JSPUtil.getParameter(request, "err_msg   		".trim(), length));
			String[] err_desc   =  (JSPUtil.getParameter(request, "err_desc  		".trim(), length));
			String[] cre_usr_id =  (JSPUtil.getParameter(request, "cre_usr_id		".trim(), length));
			String[] cre_dt     =  (JSPUtil.getParameter(request, "cre_dt    		".trim(), length));
			String[] upd_usr_id =  (JSPUtil.getParameter(request, "upd_usr_id		".trim(), length));
			String[] upd_dt     =  (JSPUtil.getParameter(request, "upd_dt    		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new COM_ERR_MSG();
				model.setIbflag    		  (ibflag    	[i]);
				model.setPage_rows 		  (page_rows 	[i]);
				model.setErr_msg_cd		  (err_msg_cd	[i]);
				model.setLang_tp_cd		  (lang_tp_cd	[i]);
				model.setErr_tp_cd 		  (err_tp_cd 	[i]);
				model.setErr_msg   		  (err_msg   	[i]);
				model.setErr_desc  		  (err_desc  	[i]);
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
		COM_ERR_MSG model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag     =  (JSPUtil.getParameter(request, prefix + "ibflag    		".trim(), length));
			String[] page_rows  =  (JSPUtil.getParameter(request, prefix + "page_rows 		".trim(), length));
			String[] err_msg_cd =  (JSPUtil.getParameter(request, prefix + "err_msg_cd		".trim(), length));
			String[] lang_tp_cd =  (JSPUtil.getParameter(request, prefix + "lang_tp_cd		".trim(), length));
			String[] err_tp_cd  =  (JSPUtil.getParameter(request, prefix + "err_tp_cd 		".trim(), length));
			String[] err_msg    =  (JSPUtil.getParameter(request, prefix + "err_msg   		".trim(), length));
			String[] err_desc   =  (JSPUtil.getParameter(request, prefix + "err_desc  		".trim(), length));
			String[] cre_usr_id =  (JSPUtil.getParameter(request, prefix + "cre_usr_id		".trim(), length));
			String[] cre_dt     =  (JSPUtil.getParameter(request, prefix + "cre_dt    		".trim(), length));
			String[] upd_usr_id =  (JSPUtil.getParameter(request, prefix + "upd_usr_id		".trim(), length));
			String[] upd_dt     =  (JSPUtil.getParameter(request, prefix + "upd_dt    		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new COM_ERR_MSG();
				model.setIbflag    		  ( ibflag    	[i]);
				model.setPage_rows 		  ( page_rows 	[i]);
				model.setErr_msg_cd		  ( err_msg_cd	[i]);
				model.setLang_tp_cd		  ( lang_tp_cd	[i]);
				model.setErr_tp_cd 		  ( err_tp_cd 	[i]);
				model.setErr_msg   		  ( err_msg   	[i]);
				model.setErr_desc  		  ( err_desc  	[i]);
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
