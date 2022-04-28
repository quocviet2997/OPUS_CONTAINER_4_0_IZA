/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : COM_BR.java
*@FileTitle : 사용자 관리
*Open Issues :
*Change history :
*@LastModifyDate : 2006-09-05
*@LastModifier : HOESOO_JANG
*@LastVersion : 1.0
* 2006-09-05 HOESOO_JANG
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
public final class COM_BR implements java.io.Serializable {

	private String    ibflag    = "";
	private String    page_rows = "";
	private String    ofc_cd    = "";
	private String    ofc_nm    = "";
	private String    up_ofc_cd = "";
	private String    use_yn    = "";
	private String    cre_dt    = "";
	private String    ofc_ccd   = "";

	public COM_BR(){}

	public COM_BR(
			String    ibflag   ,
			String    page_rows,
			String    ofc_cd   ,
			String    ofc_nm   ,
			String    up_ofc_cd,
			String    use_yn   ,
			String    cre_dt   ,
			String    ofc_ccd  ){
		this.ibflag    = ibflag   ;
		this.page_rows = page_rows;
		this.ofc_cd    = ofc_cd   ;
		this.ofc_nm    = ofc_nm   ;
		this.up_ofc_cd = up_ofc_cd;
		this.use_yn    = use_yn   ;
		this.cre_dt    = cre_dt   ;
		this.ofc_ccd   = ofc_ccd  ;
	}

	// getter method is proceeding ..
	public String    getIbflag   (){	return ibflag   	;	}
	public String    getPage_rows(){	return page_rows	;	}
	public String    getOfc_cd   (){	return ofc_cd   	;	}
	public String    getOfc_nm   (){	return ofc_nm   	;	}
	public String    getUp_ofc_cd(){	return up_ofc_cd	;	}
	public String    getUse_yn   (){	return use_yn   	;	}
	public String    getCre_dt   (){	return cre_dt   	;	}
	public String    getOfc_ccd  (){	return ofc_ccd  	;	}

	// setter method is proceeding ..
	public void setIbflag   ( String    ibflag    ){	this.ibflag    = ibflag   	;	}
	public void setPage_rows( String    page_rows ){	this.page_rows = page_rows	;	}
	public void setOfc_cd   ( String    ofc_cd    ){	this.ofc_cd    = ofc_cd   	;	}
	public void setOfc_nm   ( String    ofc_nm    ){	this.ofc_nm    = ofc_nm   	;	}
	public void setUp_ofc_cd( String    up_ofc_cd ){	this.up_ofc_cd = up_ofc_cd	;	}
	public void setUse_yn   ( String    use_yn    ){	this.use_yn    = use_yn   	;	}
	public void setCre_dt   ( String    cre_dt    ){	this.cre_dt    = cre_dt   	;	}
	public void setOfc_ccd  ( String    ofc_ccd   ){	this.ofc_ccd   = ofc_ccd  	;	}

	public static COM_BR fromRequest(HttpServletRequest request) {
		COM_BR model = new COM_BR();
		try {
			model.setIbflag   	(JSPUtil.getParameter(request, "ibflag   		".trim(), ""));
			model.setPage_rows	(JSPUtil.getParameter(request, "page_rows		".trim(), ""));
			model.setOfc_cd   	(JSPUtil.getParameter(request, "ofc_cd   		".trim(), ""));
			model.setOfc_nm   	(JSPUtil.getParameter(request, "ofc_nm   		".trim(), ""));
			model.setUp_ofc_cd	(JSPUtil.getParameter(request, "up_ofc_cd		".trim(), ""));
			model.setUse_yn   	(JSPUtil.getParameter(request, "use_yn   		".trim(), ""));
			model.setCre_dt   	(JSPUtil.getParameter(request, "cre_dt   		".trim(), ""));
			model.setOfc_ccd  	(JSPUtil.getParameter(request, "ofc_ccd  		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		COM_BR model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag    =  (JSPUtil.getParameter(request, "ibflag   		".trim(), length));
			String[] page_rows =  (JSPUtil.getParameter(request, "page_rows		".trim(), length));
			String[] ofc_cd    =  (JSPUtil.getParameter(request, "ofc_cd   		".trim(), length));
			String[] ofc_nm    =  (JSPUtil.getParameter(request, "ofc_nm   		".trim(), length));
			String[] up_ofc_cd =  (JSPUtil.getParameter(request, "up_ofc_cd		".trim(), length));
			String[] use_yn    =  (JSPUtil.getParameter(request, "use_yn   		".trim(), length));
			String[] cre_dt    =  (JSPUtil.getParameter(request, "cre_dt   		".trim(), length));
			String[] ofc_ccd   =  (JSPUtil.getParameter(request, "ofc_ccd  		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new COM_BR();
				model.setIbflag   		  (ibflag   	[i]);
				model.setPage_rows		  (page_rows	[i]);
				model.setOfc_cd   		  (ofc_cd   	[i]);
				model.setOfc_nm   		  (ofc_nm   	[i]);
				model.setUp_ofc_cd		  (up_ofc_cd	[i]);
				model.setUse_yn   		  (use_yn   	[i]);
				model.setCre_dt   		  (cre_dt   	[i]);
				model.setOfc_ccd  		  (ofc_ccd  	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		COM_BR model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag    =  (JSPUtil.getParameter(request, prefix + "ibflag   		".trim(), length));
			String[] page_rows =  (JSPUtil.getParameter(request, prefix + "page_rows		".trim(), length));
			String[] ofc_cd    =  (JSPUtil.getParameter(request, prefix + "ofc_cd   		".trim(), length));
			String[] ofc_nm    =  (JSPUtil.getParameter(request, prefix + "ofc_nm   		".trim(), length));
			String[] up_ofc_cd =  (JSPUtil.getParameter(request, prefix + "up_ofc_cd		".trim(), length));
			String[] use_yn    =  (JSPUtil.getParameter(request, prefix + "use_yn   		".trim(), length));
			String[] cre_dt    =  (JSPUtil.getParameter(request, prefix + "cre_dt   		".trim(), length));
			String[] ofc_ccd   =  (JSPUtil.getParameter(request, prefix + "ofc_ccd  		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new COM_BR();
				model.setIbflag   		  ( ibflag   	[i]);
				model.setPage_rows		  ( page_rows	[i]);
				model.setOfc_cd   		  ( ofc_cd   	[i]);
				model.setOfc_nm   		  ( ofc_nm   	[i]);
				model.setUp_ofc_cd		  ( up_ofc_cd	[i]);
				model.setUse_yn   		  ( use_yn   	[i]);
				model.setCre_dt   		  ( cre_dt   	[i]);
				model.setOfc_ccd  		  ( ofc_ccd  	[i]);
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
