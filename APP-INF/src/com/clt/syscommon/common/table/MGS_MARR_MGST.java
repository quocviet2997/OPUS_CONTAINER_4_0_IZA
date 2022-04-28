/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : MGS_MARR_MGST.java
*@FileTitle : Adding Surcharge Agreement
*Open Issues :
*Change history :
*@LastModifyDate : 2007-06-14
*@LastModifier : agreement
*@LastVersion : 1.0
* 2007-06-14 agreement
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
 * @author agreement
 * @since J2EE 1.4
 */
public final class MGS_MARR_MGST implements java.io.Serializable {

	private String            ibflag            = "";
	private String            page_rows         = "";
	private String            mgst_no           = "";
	private String            marr_mgst_marr_dt = "";
	private String            chss_no           = "";
	private String            cntr_no           = "";
	private String            marr_yd_cd        = "";
	private String            dtch_yd_cd        = "";
	private String            marr_mgst_dtch_dt = "";
	private String            cre_ofc_cd        = "";
	private String            cre_usr_id        = "";
	private String            cre_dt            = "";
	private String            upd_usr_id        = "";
	private String            upd_dt            = "";
	private String            eai_evnt_dt       = "";

	public MGS_MARR_MGST(){}

	public MGS_MARR_MGST(
			String            ibflag           ,
			String            page_rows        ,
			String            mgst_no          ,
			String            marr_mgst_marr_dt,
			String            chss_no          ,
			String            cntr_no          ,
			String            marr_yd_cd       ,
			String            dtch_yd_cd       ,
			String            marr_mgst_dtch_dt,
			String            cre_ofc_cd       ,
			String            cre_usr_id       ,
			String            cre_dt           ,
			String            upd_usr_id       ,
			String            upd_dt           ,
			String            eai_evnt_dt      ){
		this.ibflag            = ibflag           ;
		this.page_rows         = page_rows        ;
		this.mgst_no           = mgst_no          ;
		this.marr_mgst_marr_dt = marr_mgst_marr_dt;
		this.chss_no           = chss_no          ;
		this.cntr_no           = cntr_no          ;
		this.marr_yd_cd        = marr_yd_cd       ;
		this.dtch_yd_cd        = dtch_yd_cd       ;
		this.marr_mgst_dtch_dt = marr_mgst_dtch_dt;
		this.cre_ofc_cd        = cre_ofc_cd       ;
		this.cre_usr_id        = cre_usr_id       ;
		this.cre_dt            = cre_dt           ;
		this.upd_usr_id        = upd_usr_id       ;
		this.upd_dt            = upd_dt           ;
		this.eai_evnt_dt       = eai_evnt_dt      ;
	}

	// getter method is proceeding ..
	public String            getIbflag           (){	return ibflag           	;	}
	public String            getPage_rows        (){	return page_rows        	;	}
	public String            getMgst_no          (){	return mgst_no          	;	}
	public String            getMarr_mgst_marr_dt(){	return marr_mgst_marr_dt	;	}
	public String            getChss_no          (){	return chss_no          	;	}
	public String            getCntr_no          (){	return cntr_no          	;	}
	public String            getMarr_yd_cd       (){	return marr_yd_cd       	;	}
	public String            getDtch_yd_cd       (){	return dtch_yd_cd       	;	}
	public String            getMarr_mgst_dtch_dt(){	return marr_mgst_dtch_dt	;	}
	public String            getCre_ofc_cd       (){	return cre_ofc_cd       	;	}
	public String            getCre_usr_id       (){	return cre_usr_id       	;	}
	public String            getCre_dt           (){	return cre_dt           	;	}
	public String            getUpd_usr_id       (){	return upd_usr_id       	;	}
	public String            getUpd_dt           (){	return upd_dt           	;	}
	public String            getEai_evnt_dt      (){	return eai_evnt_dt      	;	}

	// setter method is proceeding ..
	public void setIbflag           ( String            ibflag            ){	this.ibflag            = ibflag           	;	}
	public void setPage_rows        ( String            page_rows         ){	this.page_rows         = page_rows        	;	}
	public void setMgst_no          ( String            mgst_no           ){	this.mgst_no           = mgst_no          	;	}
	public void setMarr_mgst_marr_dt( String            marr_mgst_marr_dt ){	this.marr_mgst_marr_dt = marr_mgst_marr_dt	;	}
	public void setChss_no          ( String            chss_no           ){	this.chss_no           = chss_no          	;	}
	public void setCntr_no          ( String            cntr_no           ){	this.cntr_no           = cntr_no          	;	}
	public void setMarr_yd_cd       ( String            marr_yd_cd        ){	this.marr_yd_cd        = marr_yd_cd       	;	}
	public void setDtch_yd_cd       ( String            dtch_yd_cd        ){	this.dtch_yd_cd        = dtch_yd_cd       	;	}
	public void setMarr_mgst_dtch_dt( String            marr_mgst_dtch_dt ){	this.marr_mgst_dtch_dt = marr_mgst_dtch_dt	;	}
	public void setCre_ofc_cd       ( String            cre_ofc_cd        ){	this.cre_ofc_cd        = cre_ofc_cd       	;	}
	public void setCre_usr_id       ( String            cre_usr_id        ){	this.cre_usr_id        = cre_usr_id       	;	}
	public void setCre_dt           ( String            cre_dt            ){	this.cre_dt            = cre_dt           	;	}
	public void setUpd_usr_id       ( String            upd_usr_id        ){	this.upd_usr_id        = upd_usr_id       	;	}
	public void setUpd_dt           ( String            upd_dt            ){	this.upd_dt            = upd_dt           	;	}
	public void setEai_evnt_dt      ( String            eai_evnt_dt       ){	this.eai_evnt_dt       = eai_evnt_dt      	;	}

	public static MGS_MARR_MGST fromRequest(HttpServletRequest request) {
		MGS_MARR_MGST model = new MGS_MARR_MGST();
		try {
			model.setIbflag           	(JSPUtil.getParameter(request, "ibflag           		".trim(), ""));
			model.setPage_rows        	(JSPUtil.getParameter(request, "page_rows        		".trim(), ""));
			model.setMgst_no          	(JSPUtil.getParameter(request, "mgst_no          		".trim(), ""));
			model.setMarr_mgst_marr_dt	(JSPUtil.getParameter(request, "marr_mgst_marr_dt		".trim(), ""));
			model.setChss_no          	(JSPUtil.getParameter(request, "chss_no          		".trim(), ""));
			model.setCntr_no          	(JSPUtil.getParameter(request, "cntr_no          		".trim(), ""));
			model.setMarr_yd_cd       	(JSPUtil.getParameter(request, "marr_yd_cd       		".trim(), ""));
			model.setDtch_yd_cd       	(JSPUtil.getParameter(request, "dtch_yd_cd       		".trim(), ""));
			model.setMarr_mgst_dtch_dt	(JSPUtil.getParameter(request, "marr_mgst_dtch_dt		".trim(), ""));
			model.setCre_ofc_cd       	(JSPUtil.getParameter(request, "cre_ofc_cd       		".trim(), ""));
			model.setCre_usr_id       	(JSPUtil.getParameter(request, "cre_usr_id       		".trim(), ""));
			model.setCre_dt           	(JSPUtil.getParameter(request, "cre_dt           		".trim(), ""));
			model.setUpd_usr_id       	(JSPUtil.getParameter(request, "upd_usr_id       		".trim(), ""));
			model.setUpd_dt           	(JSPUtil.getParameter(request, "upd_dt           		".trim(), ""));
			model.setEai_evnt_dt      	(JSPUtil.getParameter(request, "eai_evnt_dt      		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		MGS_MARR_MGST model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag            =  (JSPUtil.getParameter(request, "ibflag           		".trim(), length));
			String[] page_rows         =  (JSPUtil.getParameter(request, "page_rows        		".trim(), length));
			String[] mgst_no           =  (JSPUtil.getParameter(request, "mgst_no          		".trim(), length));
			String[] marr_mgst_marr_dt =  (JSPUtil.getParameter(request, "marr_mgst_marr_dt		".trim(), length));
			String[] chss_no           =  (JSPUtil.getParameter(request, "chss_no          		".trim(), length));
			String[] cntr_no           =  (JSPUtil.getParameter(request, "cntr_no          		".trim(), length));
			String[] marr_yd_cd        =  (JSPUtil.getParameter(request, "marr_yd_cd       		".trim(), length));
			String[] dtch_yd_cd        =  (JSPUtil.getParameter(request, "dtch_yd_cd       		".trim(), length));
			String[] marr_mgst_dtch_dt =  (JSPUtil.getParameter(request, "marr_mgst_dtch_dt		".trim(), length));
			String[] cre_ofc_cd        =  (JSPUtil.getParameter(request, "cre_ofc_cd       		".trim(), length));
			String[] cre_usr_id        =  (JSPUtil.getParameter(request, "cre_usr_id       		".trim(), length));
			String[] cre_dt            =  (JSPUtil.getParameter(request, "cre_dt           		".trim(), length));
			String[] upd_usr_id        =  (JSPUtil.getParameter(request, "upd_usr_id       		".trim(), length));
			String[] upd_dt            =  (JSPUtil.getParameter(request, "upd_dt           		".trim(), length));
			String[] eai_evnt_dt       =  (JSPUtil.getParameter(request, "eai_evnt_dt      		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new MGS_MARR_MGST();
				model.setIbflag           		  (ibflag           	[i]);
				model.setPage_rows        		  (page_rows        	[i]);
				model.setMgst_no          		  (mgst_no          	[i]);
				model.setMarr_mgst_marr_dt		  (marr_mgst_marr_dt	[i]);
				model.setChss_no          		  (chss_no          	[i]);
				model.setCntr_no          		  (cntr_no          	[i]);
				model.setMarr_yd_cd       		  (marr_yd_cd       	[i]);
				model.setDtch_yd_cd       		  (dtch_yd_cd       	[i]);
				model.setMarr_mgst_dtch_dt		  (marr_mgst_dtch_dt	[i]);
				model.setCre_ofc_cd       		  (cre_ofc_cd       	[i]);
				model.setCre_usr_id       		  (cre_usr_id       	[i]);
				model.setCre_dt           		  (cre_dt           	[i]);
				model.setUpd_usr_id       		  (upd_usr_id       	[i]);
				model.setUpd_dt           		  (upd_dt           	[i]);
				model.setEai_evnt_dt      		  (eai_evnt_dt      	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		MGS_MARR_MGST model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag            =  (JSPUtil.getParameter(request, prefix + "ibflag           		".trim(), length));
			String[] page_rows         =  (JSPUtil.getParameter(request, prefix + "page_rows        		".trim(), length));
			String[] mgst_no           =  (JSPUtil.getParameter(request, prefix + "mgst_no          		".trim(), length));
			String[] marr_mgst_marr_dt =  (JSPUtil.getParameter(request, prefix + "marr_mgst_marr_dt		".trim(), length));
			String[] chss_no           =  (JSPUtil.getParameter(request, prefix + "chss_no          		".trim(), length));
			String[] cntr_no           =  (JSPUtil.getParameter(request, prefix + "cntr_no          		".trim(), length));
			String[] marr_yd_cd        =  (JSPUtil.getParameter(request, prefix + "marr_yd_cd       		".trim(), length));
			String[] dtch_yd_cd        =  (JSPUtil.getParameter(request, prefix + "dtch_yd_cd       		".trim(), length));
			String[] marr_mgst_dtch_dt =  (JSPUtil.getParameter(request, prefix + "marr_mgst_dtch_dt		".trim(), length));
			String[] cre_ofc_cd        =  (JSPUtil.getParameter(request, prefix + "cre_ofc_cd       		".trim(), length));
			String[] cre_usr_id        =  (JSPUtil.getParameter(request, prefix + "cre_usr_id       		".trim(), length));
			String[] cre_dt            =  (JSPUtil.getParameter(request, prefix + "cre_dt           		".trim(), length));
			String[] upd_usr_id        =  (JSPUtil.getParameter(request, prefix + "upd_usr_id       		".trim(), length));
			String[] upd_dt            =  (JSPUtil.getParameter(request, prefix + "upd_dt           		".trim(), length));
			String[] eai_evnt_dt       =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt      		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new MGS_MARR_MGST();
				model.setIbflag           		  ( ibflag           	[i]);
				model.setPage_rows        		  ( page_rows        	[i]);
				model.setMgst_no          		  ( mgst_no          	[i]);
				model.setMarr_mgst_marr_dt		  ( marr_mgst_marr_dt	[i]);
				model.setChss_no          		  ( chss_no          	[i]);
				model.setCntr_no          		  ( cntr_no          	[i]);
				model.setMarr_yd_cd       		  ( marr_yd_cd       	[i]);
				model.setDtch_yd_cd       		  ( dtch_yd_cd       	[i]);
				model.setMarr_mgst_dtch_dt		  ( marr_mgst_dtch_dt	[i]);
				model.setCre_ofc_cd       		  ( cre_ofc_cd       	[i]);
				model.setCre_usr_id       		  ( cre_usr_id       	[i]);
				model.setCre_dt           		  ( cre_dt           	[i]);
				model.setUpd_usr_id       		  ( upd_usr_id       	[i]);
				model.setUpd_dt           		  ( upd_dt           	[i]);
				model.setEai_evnt_dt      		  ( eai_evnt_dt      	[i]);
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
