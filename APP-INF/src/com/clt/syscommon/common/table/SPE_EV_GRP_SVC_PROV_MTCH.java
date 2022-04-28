/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : SPE_EV_GRP_SVC_PROV_MTCH.java
*@FileTitle : SRS Analysis Result Inquiry
*Open Issues :
*Change history :
*@LastModifyDate : 2007-03-23
*@LastModifier : Jung-Jae Kim
*@LastVersion : 1.0
* 2007-03-23 Jung-Jae Kim
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
 * @author Jung-Jae Kim
 * @since J2EE 1.4
 */
public final class SPE_EV_GRP_SVC_PROV_MTCH implements java.io.Serializable {

	private String       ibflag       = "";
	private String       page_rows    = "";
	private String       eg_id        = "";
	private String       eg_id_seq    = "";
	private String       vndr_seq     = "";
	private String       eng_vndr_rmk = "";
	private String       cre_usr_id   = "";
	private String       cre_dt       = "";
	private String       upd_usr_id   = "";
	private String       upd_dt       = "";

	public SPE_EV_GRP_SVC_PROV_MTCH(){}

	public SPE_EV_GRP_SVC_PROV_MTCH(
			String       ibflag      ,
			String       page_rows   ,
			String       eg_id       ,
			String       eg_id_seq   ,
			String       vndr_seq    ,
			String       eng_vndr_rmk,
			String       cre_usr_id  ,
			String       cre_dt      ,
			String       upd_usr_id  ,
			String       upd_dt      ){
		this.ibflag       = ibflag      ;
		this.page_rows    = page_rows   ;
		this.eg_id        = eg_id       ;
		this.eg_id_seq    = eg_id_seq   ;
		this.vndr_seq     = vndr_seq    ;
		this.eng_vndr_rmk = eng_vndr_rmk;
		this.cre_usr_id   = cre_usr_id  ;
		this.cre_dt       = cre_dt      ;
		this.upd_usr_id   = upd_usr_id  ;
		this.upd_dt       = upd_dt      ;
	}

	// getter method is proceeding ..
	public String       getIbflag      (){	return ibflag      	;	}
	public String       getPage_rows   (){	return page_rows   	;	}
	public String       getEg_id       (){	return eg_id       	;	}
	public String       getEg_id_seq   (){	return eg_id_seq   	;	}
	public String       getVndr_seq    (){	return vndr_seq    	;	}
	public String       getEng_vndr_rmk(){	return eng_vndr_rmk	;	}
	public String       getCre_usr_id  (){	return cre_usr_id  	;	}
	public String       getCre_dt      (){	return cre_dt      	;	}
	public String       getUpd_usr_id  (){	return upd_usr_id  	;	}
	public String       getUpd_dt      (){	return upd_dt      	;	}

	// setter method is proceeding ..
	public void setIbflag      ( String       ibflag       ){	this.ibflag       = ibflag      	;	}
	public void setPage_rows   ( String       page_rows    ){	this.page_rows    = page_rows   	;	}
	public void setEg_id       ( String       eg_id        ){	this.eg_id        = eg_id       	;	}
	public void setEg_id_seq   ( String       eg_id_seq    ){	this.eg_id_seq    = eg_id_seq   	;	}
	public void setVndr_seq    ( String       vndr_seq     ){	this.vndr_seq     = vndr_seq    	;	}
	public void setEng_vndr_rmk( String       eng_vndr_rmk ){	this.eng_vndr_rmk = eng_vndr_rmk	;	}
	public void setCre_usr_id  ( String       cre_usr_id   ){	this.cre_usr_id   = cre_usr_id  	;	}
	public void setCre_dt      ( String       cre_dt       ){	this.cre_dt       = cre_dt      	;	}
	public void setUpd_usr_id  ( String       upd_usr_id   ){	this.upd_usr_id   = upd_usr_id  	;	}
	public void setUpd_dt      ( String       upd_dt       ){	this.upd_dt       = upd_dt      	;	}

	public static SPE_EV_GRP_SVC_PROV_MTCH fromRequest(HttpServletRequest request) {
		SPE_EV_GRP_SVC_PROV_MTCH model = new SPE_EV_GRP_SVC_PROV_MTCH();
		try {
			model.setIbflag      	(JSPUtil.getParameter(request, "ibflag      		".trim(), ""));
			model.setPage_rows   	(JSPUtil.getParameter(request, "page_rows   		".trim(), ""));
			model.setEg_id       	(JSPUtil.getParameter(request, "eg_id       		".trim(), ""));
			model.setEg_id_seq   	(JSPUtil.getParameter(request, "eg_id_seq   		".trim(), ""));
			model.setVndr_seq    	(JSPUtil.getParameter(request, "vndr_seq    		".trim(), ""));
			model.setEng_vndr_rmk	(JSPUtil.getParameter(request, "eng_vndr_rmk		".trim(), ""));
			model.setCre_usr_id  	(JSPUtil.getParameter(request, "cre_usr_id  		".trim(), ""));
			model.setCre_dt      	(JSPUtil.getParameter(request, "cre_dt      		".trim(), ""));
			model.setUpd_usr_id  	(JSPUtil.getParameter(request, "upd_usr_id  		".trim(), ""));
			model.setUpd_dt      	(JSPUtil.getParameter(request, "upd_dt      		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		SPE_EV_GRP_SVC_PROV_MTCH model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag       =  (JSPUtil.getParameter(request, "ibflag      		".trim(), length));
			String[] page_rows    =  (JSPUtil.getParameter(request, "page_rows   		".trim(), length));
			String[] eg_id        =  (JSPUtil.getParameter(request, "eg_id       		".trim(), length));
			String[] eg_id_seq    =  (JSPUtil.getParameter(request, "eg_id_seq   		".trim(), length));
			String[] vndr_seq     =  (JSPUtil.getParameter(request, "vndr_seq    		".trim(), length));
			String[] eng_vndr_rmk =  (JSPUtil.getParameter(request, "eng_vndr_rmk		".trim(), length));
			String[] cre_usr_id   =  (JSPUtil.getParameter(request, "cre_usr_id  		".trim(), length));
			String[] cre_dt       =  (JSPUtil.getParameter(request, "cre_dt      		".trim(), length));
			String[] upd_usr_id   =  (JSPUtil.getParameter(request, "upd_usr_id  		".trim(), length));
			String[] upd_dt       =  (JSPUtil.getParameter(request, "upd_dt      		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new SPE_EV_GRP_SVC_PROV_MTCH();
				model.setIbflag      		  (ibflag      	[i]);
				model.setPage_rows   		  (page_rows   	[i]);
				model.setEg_id       		  (eg_id       	[i]);
				model.setEg_id_seq   		  (eg_id_seq   	[i]);
				model.setVndr_seq    		  (vndr_seq    	[i]);
				model.setEng_vndr_rmk		  (eng_vndr_rmk	[i]);
				model.setCre_usr_id  		  (cre_usr_id  	[i]);
				model.setCre_dt      		  (cre_dt      	[i]);
				model.setUpd_usr_id  		  (upd_usr_id  	[i]);
				model.setUpd_dt      		  (upd_dt      	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		SPE_EV_GRP_SVC_PROV_MTCH model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag       =  (JSPUtil.getParameter(request, prefix + "ibflag      		".trim(), length));
			String[] page_rows    =  (JSPUtil.getParameter(request, prefix + "page_rows   		".trim(), length));
			String[] eg_id        =  (JSPUtil.getParameter(request, prefix + "eg_id       		".trim(), length));
			String[] eg_id_seq    =  (JSPUtil.getParameter(request, prefix + "eg_id_seq   		".trim(), length));
			String[] vndr_seq     =  (JSPUtil.getParameter(request, prefix + "vndr_seq    		".trim(), length));
			String[] eng_vndr_rmk =  (JSPUtil.getParameter(request, prefix + "eng_vndr_rmk		".trim(), length));
			String[] cre_usr_id   =  (JSPUtil.getParameter(request, prefix + "cre_usr_id  		".trim(), length));
			String[] cre_dt       =  (JSPUtil.getParameter(request, prefix + "cre_dt      		".trim(), length));
			String[] upd_usr_id   =  (JSPUtil.getParameter(request, prefix + "upd_usr_id  		".trim(), length));
			String[] upd_dt       =  (JSPUtil.getParameter(request, prefix + "upd_dt      		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new SPE_EV_GRP_SVC_PROV_MTCH();
				model.setIbflag      		  ( ibflag      	[i]);
				model.setPage_rows   		  ( page_rows   	[i]);
				model.setEg_id       		  ( eg_id       	[i]);
				model.setEg_id_seq   		  ( eg_id_seq   	[i]);
				model.setVndr_seq    		  ( vndr_seq    	[i]);
				model.setEng_vndr_rmk		  ( eng_vndr_rmk	[i]);
				model.setCre_usr_id  		  ( cre_usr_id  	[i]);
				model.setCre_dt      		  ( cre_dt      	[i]);
				model.setUpd_usr_id  		  ( upd_usr_id  	[i]);
				model.setUpd_dt      		  ( upd_dt      	[i]);
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
