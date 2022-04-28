/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : COM_MENU.java
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
public final class COM_MENU implements java.io.Serializable {

	private String      ibflag      = "";
	private String      page_rows   = "";
	private String      mnu_ccd     = "";
	private String      up_pgm_no   = "";
	private String      lwrk_pgm_no = "";
	private String      pgm_lvl     = "";
	private String      eps_seq     = "";
	private String      cre_dt      = "";

	public COM_MENU(){}

	public COM_MENU(
			String      ibflag     ,
			String      page_rows  ,
			String      mnu_ccd    ,
			String      up_pgm_no  ,
			String      lwrk_pgm_no,
			String      pgm_lvl    ,
			String      eps_seq    ,
			String      cre_dt     ){
		this.ibflag      = ibflag     ;
		this.page_rows   = page_rows  ;
		this.mnu_ccd     = mnu_ccd    ;
		this.up_pgm_no   = up_pgm_no  ;
		this.lwrk_pgm_no = lwrk_pgm_no;
		this.pgm_lvl     = pgm_lvl    ;
		this.eps_seq     = eps_seq    ;
		this.cre_dt      = cre_dt     ;
	}

	// getter method is proceeding ..
	public String      getIbflag     (){	return ibflag     	;	}
	public String      getPage_rows  (){	return page_rows  	;	}
	public String      getMnu_ccd    (){	return mnu_ccd    	;	}
	public String      getUp_pgm_no  (){	return up_pgm_no  	;	}
	public String      getLwrk_pgm_no(){	return lwrk_pgm_no	;	}
	public String      getPgm_lvl    (){	return pgm_lvl    	;	}
	public String      getEps_seq    (){	return eps_seq    	;	}
	public String      getCre_dt     (){	return cre_dt     	;	}

	// setter method is proceeding ..
	public void setIbflag     ( String      ibflag      ){	this.ibflag      = ibflag     	;	}
	public void setPage_rows  ( String      page_rows   ){	this.page_rows   = page_rows  	;	}
	public void setMnu_ccd    ( String      mnu_ccd     ){	this.mnu_ccd     = mnu_ccd    	;	}
	public void setUp_pgm_no  ( String      up_pgm_no   ){	this.up_pgm_no   = up_pgm_no  	;	}
	public void setLwrk_pgm_no( String      lwrk_pgm_no ){	this.lwrk_pgm_no = lwrk_pgm_no	;	}
	public void setPgm_lvl    ( String      pgm_lvl     ){	this.pgm_lvl     = pgm_lvl    	;	}
	public void setEps_seq    ( String      eps_seq     ){	this.eps_seq     = eps_seq    	;	}
	public void setCre_dt     ( String      cre_dt      ){	this.cre_dt      = cre_dt     	;	}

	public static COM_MENU fromRequest(HttpServletRequest request) {
		COM_MENU model = new COM_MENU();
		try {
			model.setIbflag     	(JSPUtil.getParameter(request, "ibflag     		".trim(), ""));
			model.setPage_rows  	(JSPUtil.getParameter(request, "page_rows  		".trim(), ""));
			model.setMnu_ccd    	(JSPUtil.getParameter(request, "mnu_ccd    		".trim(), ""));
			model.setUp_pgm_no  	(JSPUtil.getParameter(request, "up_pgm_no  		".trim(), ""));
			model.setLwrk_pgm_no	(JSPUtil.getParameter(request, "lwrk_pgm_no		".trim(), ""));
			model.setPgm_lvl    	(JSPUtil.getParameter(request, "pgm_lvl    		".trim(), ""));
			model.setEps_seq    	(JSPUtil.getParameter(request, "eps_seq    		".trim(), ""));
			model.setCre_dt     	(JSPUtil.getParameter(request, "cre_dt     		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		COM_MENU model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag      =  (JSPUtil.getParameter(request, "ibflag     		".trim(), length));
			String[] page_rows   =  (JSPUtil.getParameter(request, "page_rows  		".trim(), length));
			String[] mnu_ccd     =  (JSPUtil.getParameter(request, "mnu_ccd    		".trim(), length));
			String[] up_pgm_no   =  (JSPUtil.getParameter(request, "up_pgm_no  		".trim(), length));
			String[] lwrk_pgm_no =  (JSPUtil.getParameter(request, "lwrk_pgm_no		".trim(), length));
			String[] pgm_lvl     =  (JSPUtil.getParameter(request, "pgm_lvl    		".trim(), length));
			String[] eps_seq     =  (JSPUtil.getParameter(request, "eps_seq    		".trim(), length));
			String[] cre_dt      =  (JSPUtil.getParameter(request, "cre_dt     		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new COM_MENU();
				model.setIbflag     		  (ibflag     	[i]);
				model.setPage_rows  		  (page_rows  	[i]);
				model.setMnu_ccd    		  (mnu_ccd    	[i]);
				model.setUp_pgm_no  		  (up_pgm_no  	[i]);
				model.setLwrk_pgm_no		  (lwrk_pgm_no	[i]);
				model.setPgm_lvl    		  (pgm_lvl    	[i]);
				model.setEps_seq    		  (eps_seq    	[i]);
				model.setCre_dt     		  (cre_dt     	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		COM_MENU model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag      =  (JSPUtil.getParameter(request, prefix + "ibflag     		".trim(), length));
			String[] page_rows   =  (JSPUtil.getParameter(request, prefix + "page_rows  		".trim(), length));
			String[] mnu_ccd     =  (JSPUtil.getParameter(request, prefix + "mnu_ccd    		".trim(), length));
			String[] up_pgm_no   =  (JSPUtil.getParameter(request, prefix + "up_pgm_no  		".trim(), length));
			String[] lwrk_pgm_no =  (JSPUtil.getParameter(request, prefix + "lwrk_pgm_no		".trim(), length));
			String[] pgm_lvl     =  (JSPUtil.getParameter(request, prefix + "pgm_lvl    		".trim(), length));
			String[] eps_seq     =  (JSPUtil.getParameter(request, prefix + "eps_seq    		".trim(), length));
			String[] cre_dt      =  (JSPUtil.getParameter(request, prefix + "cre_dt     		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new COM_MENU();
				model.setIbflag     		  ( ibflag     	[i]);
				model.setPage_rows  		  ( page_rows  	[i]);
				model.setMnu_ccd    		  ( mnu_ccd    	[i]);
				model.setUp_pgm_no  		  ( up_pgm_no  	[i]);
				model.setLwrk_pgm_no		  ( lwrk_pgm_no	[i]);
				model.setPgm_lvl    		  ( pgm_lvl    	[i]);
				model.setEps_seq    		  ( eps_seq    	[i]);
				model.setCre_dt     		  ( cre_dt     	[i]);
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
