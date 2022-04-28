/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : SPE_SVC_PROV_RLT_ATRC_RSLT.java
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
public final class SPE_SVC_PROV_RLT_ATRC_RSLT implements java.io.Serializable {

	private String               ibflag               = "";
	private String               page_rows            = "";
	private String               vndr_seq             = "";
	private String               ev_yr                = "";
	private String               atrc_to_svc_hjs_scre = "";
	private String               atrc_to_sp_scre      = "";
	private String               cre_usr_id           = "";
	private String               cre_dt               = "";
	private String               upd_usr_id           = "";
	private String               upd_dt               = "";

	public SPE_SVC_PROV_RLT_ATRC_RSLT(){}

	public SPE_SVC_PROV_RLT_ATRC_RSLT(
			String               ibflag              ,
			String               page_rows           ,
			String               vndr_seq            ,
			String               ev_yr               ,
			String               atrc_to_svc_hjs_scre,
			String               atrc_to_sp_scre     ,
			String               cre_usr_id          ,
			String               cre_dt              ,
			String               upd_usr_id          ,
			String               upd_dt              ){
		this.ibflag               = ibflag              ;
		this.page_rows            = page_rows           ;
		this.vndr_seq             = vndr_seq            ;
		this.ev_yr                = ev_yr               ;
		this.atrc_to_svc_hjs_scre = atrc_to_svc_hjs_scre;
		this.atrc_to_sp_scre      = atrc_to_sp_scre     ;
		this.cre_usr_id           = cre_usr_id          ;
		this.cre_dt               = cre_dt              ;
		this.upd_usr_id           = upd_usr_id          ;
		this.upd_dt               = upd_dt              ;
	}

	// getter method is proceeding ..
	public String               getIbflag              (){	return ibflag              	;	}
	public String               getPage_rows           (){	return page_rows           	;	}
	public String               getVndr_seq            (){	return vndr_seq            	;	}
	public String               getEv_yr               (){	return ev_yr               	;	}
	public String               getAtrc_to_svc_hjs_scre(){	return atrc_to_svc_hjs_scre	;	}
	public String               getAtrc_to_sp_scre     (){	return atrc_to_sp_scre     	;	}
	public String               getCre_usr_id          (){	return cre_usr_id          	;	}
	public String               getCre_dt              (){	return cre_dt              	;	}
	public String               getUpd_usr_id          (){	return upd_usr_id          	;	}
	public String               getUpd_dt              (){	return upd_dt              	;	}

	// setter method is proceeding ..
	public void setIbflag              ( String               ibflag               ){	this.ibflag               = ibflag              	;	}
	public void setPage_rows           ( String               page_rows            ){	this.page_rows            = page_rows           	;	}
	public void setVndr_seq            ( String               vndr_seq             ){	this.vndr_seq             = vndr_seq            	;	}
	public void setEv_yr               ( String               ev_yr                ){	this.ev_yr                = ev_yr               	;	}
	public void setAtrc_to_svc_hjs_scre( String               atrc_to_svc_hjs_scre ){	this.atrc_to_svc_hjs_scre = atrc_to_svc_hjs_scre	;	}
	public void setAtrc_to_sp_scre     ( String               atrc_to_sp_scre      ){	this.atrc_to_sp_scre      = atrc_to_sp_scre     	;	}
	public void setCre_usr_id          ( String               cre_usr_id           ){	this.cre_usr_id           = cre_usr_id          	;	}
	public void setCre_dt              ( String               cre_dt               ){	this.cre_dt               = cre_dt              	;	}
	public void setUpd_usr_id          ( String               upd_usr_id           ){	this.upd_usr_id           = upd_usr_id          	;	}
	public void setUpd_dt              ( String               upd_dt               ){	this.upd_dt               = upd_dt              	;	}

	public static SPE_SVC_PROV_RLT_ATRC_RSLT fromRequest(HttpServletRequest request) {
		SPE_SVC_PROV_RLT_ATRC_RSLT model = new SPE_SVC_PROV_RLT_ATRC_RSLT();
		try {
			model.setIbflag              	(JSPUtil.getParameter(request, "ibflag              		".trim(), ""));
			model.setPage_rows           	(JSPUtil.getParameter(request, "page_rows           		".trim(), ""));
			model.setVndr_seq            	(JSPUtil.getParameter(request, "vndr_seq            		".trim(), ""));
			model.setEv_yr               	(JSPUtil.getParameter(request, "ev_yr               		".trim(), ""));
			model.setAtrc_to_svc_hjs_scre	(JSPUtil.getParameter(request, "atrc_to_svc_hjs_scre		".trim(), ""));
			model.setAtrc_to_sp_scre     	(JSPUtil.getParameter(request, "atrc_to_sp_scre     		".trim(), ""));
			model.setCre_usr_id          	(JSPUtil.getParameter(request, "cre_usr_id          		".trim(), ""));
			model.setCre_dt              	(JSPUtil.getParameter(request, "cre_dt              		".trim(), ""));
			model.setUpd_usr_id          	(JSPUtil.getParameter(request, "upd_usr_id          		".trim(), ""));
			model.setUpd_dt              	(JSPUtil.getParameter(request, "upd_dt              		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		SPE_SVC_PROV_RLT_ATRC_RSLT model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag               =  (JSPUtil.getParameter(request, "ibflag              		".trim(), length));
			String[] page_rows            =  (JSPUtil.getParameter(request, "page_rows           		".trim(), length));
			String[] vndr_seq             =  (JSPUtil.getParameter(request, "vndr_seq            		".trim(), length));
			String[] ev_yr                =  (JSPUtil.getParameter(request, "ev_yr               		".trim(), length));
			String[] atrc_to_svc_hjs_scre =  (JSPUtil.getParameter(request, "atrc_to_svc_hjs_scre		".trim(), length));
			String[] atrc_to_sp_scre      =  (JSPUtil.getParameter(request, "atrc_to_sp_scre     		".trim(), length));
			String[] cre_usr_id           =  (JSPUtil.getParameter(request, "cre_usr_id          		".trim(), length));
			String[] cre_dt               =  (JSPUtil.getParameter(request, "cre_dt              		".trim(), length));
			String[] upd_usr_id           =  (JSPUtil.getParameter(request, "upd_usr_id          		".trim(), length));
			String[] upd_dt               =  (JSPUtil.getParameter(request, "upd_dt              		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new SPE_SVC_PROV_RLT_ATRC_RSLT();
				model.setIbflag              		  (ibflag              	[i]);
				model.setPage_rows           		  (page_rows           	[i]);
				model.setVndr_seq            		  (vndr_seq            	[i]);
				model.setEv_yr               		  (ev_yr               	[i]);
				model.setAtrc_to_svc_hjs_scre		  (atrc_to_svc_hjs_scre	[i]);
				model.setAtrc_to_sp_scre     		  (atrc_to_sp_scre     	[i]);
				model.setCre_usr_id          		  (cre_usr_id          	[i]);
				model.setCre_dt              		  (cre_dt              	[i]);
				model.setUpd_usr_id          		  (upd_usr_id          	[i]);
				model.setUpd_dt              		  (upd_dt              	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		SPE_SVC_PROV_RLT_ATRC_RSLT model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag               =  (JSPUtil.getParameter(request, prefix + "ibflag              		".trim(), length));
			String[] page_rows            =  (JSPUtil.getParameter(request, prefix + "page_rows           		".trim(), length));
			String[] vndr_seq             =  (JSPUtil.getParameter(request, prefix + "vndr_seq            		".trim(), length));
			String[] ev_yr                =  (JSPUtil.getParameter(request, prefix + "ev_yr               		".trim(), length));
			String[] atrc_to_svc_hjs_scre =  (JSPUtil.getParameter(request, prefix + "atrc_to_svc_hjs_scre		".trim(), length));
			String[] atrc_to_sp_scre      =  (JSPUtil.getParameter(request, prefix + "atrc_to_sp_scre     		".trim(), length));
			String[] cre_usr_id           =  (JSPUtil.getParameter(request, prefix + "cre_usr_id          		".trim(), length));
			String[] cre_dt               =  (JSPUtil.getParameter(request, prefix + "cre_dt              		".trim(), length));
			String[] upd_usr_id           =  (JSPUtil.getParameter(request, prefix + "upd_usr_id          		".trim(), length));
			String[] upd_dt               =  (JSPUtil.getParameter(request, prefix + "upd_dt              		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new SPE_SVC_PROV_RLT_ATRC_RSLT();
				model.setIbflag              		  ( ibflag              	[i]);
				model.setPage_rows           		  ( page_rows           	[i]);
				model.setVndr_seq            		  ( vndr_seq            	[i]);
				model.setEv_yr               		  ( ev_yr               	[i]);
				model.setAtrc_to_svc_hjs_scre		  ( atrc_to_svc_hjs_scre	[i]);
				model.setAtrc_to_sp_scre     		  ( atrc_to_sp_scre     	[i]);
				model.setCre_usr_id          		  ( cre_usr_id          	[i]);
				model.setCre_dt              		  ( cre_dt              	[i]);
				model.setUpd_usr_id          		  ( upd_usr_id          	[i]);
				model.setUpd_dt              		  ( upd_dt              	[i]);
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
