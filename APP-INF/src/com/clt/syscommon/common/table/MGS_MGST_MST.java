/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : MGS_MGST_MST.java
*@FileTitle : S/P Performance Evaluation Creation
*Open Issues :
*Change history :
*@LastModifyDate : 2007-01-05
*@LastModifier : Lee_SangWoo
*@LastVersion : 1.0
* 2007-01-05 Lee_SangWoo
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
 * @author Lee_SangWoo
 * @since J2EE 1.4
 */
public final class MGS_MGST_MST implements java.io.Serializable {

	private String         ibflag         = "";
	private String         page_rows      = "";
	private String         mgst_no        = "";
	private String         mgst_tp_cd     = "";
	private String         lstm_cd        = "";
	private String         mgst_onh_dt    = "";
	private String         mgst_onh_yd_cd = "";
	private String         vndr_seq       = "";
	private String         cre_ofc_cd     = "";
	private String         cre_usr_id     = "";
	private String         cre_dt         = "";
	private String         upd_usr_id     = "";
	private String         upd_dt         = "";
	private String         eai_evnt_dt    = "";

	public MGS_MGST_MST(){}

	public MGS_MGST_MST(
			String         ibflag        ,
			String         page_rows     ,
			String         mgst_no       ,
			String         mgst_tp_cd    ,
			String         lstm_cd       ,
			String         mgst_onh_dt   ,
			String         mgst_onh_yd_cd,
			String         vndr_seq      ,
			String         cre_ofc_cd    ,
			String         cre_usr_id    ,
			String         cre_dt        ,
			String         upd_usr_id    ,
			String         upd_dt        ,
			String         eai_evnt_dt   ){
		this.ibflag         = ibflag        ;
		this.page_rows      = page_rows     ;
		this.mgst_no        = mgst_no       ;
		this.mgst_tp_cd     = mgst_tp_cd    ;
		this.lstm_cd        = lstm_cd       ;
		this.mgst_onh_dt    = mgst_onh_dt   ;
		this.mgst_onh_yd_cd = mgst_onh_yd_cd;
		this.vndr_seq       = vndr_seq      ;
		this.cre_ofc_cd     = cre_ofc_cd    ;
		this.cre_usr_id     = cre_usr_id    ;
		this.cre_dt         = cre_dt        ;
		this.upd_usr_id     = upd_usr_id    ;
		this.upd_dt         = upd_dt        ;
		this.eai_evnt_dt    = eai_evnt_dt   ;
	}

	// getter method is proceeding ..
	public String         getIbflag        (){	return ibflag        	;	}
	public String         getPage_rows     (){	return page_rows     	;	}
	public String         getMgst_no       (){	return mgst_no       	;	}
	public String         getMgst_tp_cd    (){	return mgst_tp_cd    	;	}
	public String         getLstm_cd       (){	return lstm_cd       	;	}
	public String         getMgst_onh_dt   (){	return mgst_onh_dt   	;	}
	public String         getMgst_onh_yd_cd(){	return mgst_onh_yd_cd	;	}
	public String         getVndr_seq      (){	return vndr_seq      	;	}
	public String         getCre_ofc_cd    (){	return cre_ofc_cd    	;	}
	public String         getCre_usr_id    (){	return cre_usr_id    	;	}
	public String         getCre_dt        (){	return cre_dt        	;	}
	public String         getUpd_usr_id    (){	return upd_usr_id    	;	}
	public String         getUpd_dt        (){	return upd_dt        	;	}
	public String         getEai_evnt_dt   (){	return eai_evnt_dt   	;	}

	// setter method is proceeding ..
	public void setIbflag        ( String         ibflag         ){	this.ibflag         = ibflag        	;	}
	public void setPage_rows     ( String         page_rows      ){	this.page_rows      = page_rows     	;	}
	public void setMgst_no       ( String         mgst_no        ){	this.mgst_no        = mgst_no       	;	}
	public void setMgst_tp_cd    ( String         mgst_tp_cd     ){	this.mgst_tp_cd     = mgst_tp_cd    	;	}
	public void setLstm_cd       ( String         lstm_cd        ){	this.lstm_cd        = lstm_cd       	;	}
	public void setMgst_onh_dt   ( String         mgst_onh_dt    ){	this.mgst_onh_dt    = mgst_onh_dt   	;	}
	public void setMgst_onh_yd_cd( String         mgst_onh_yd_cd ){	this.mgst_onh_yd_cd = mgst_onh_yd_cd	;	}
	public void setVndr_seq      ( String         vndr_seq       ){	this.vndr_seq       = vndr_seq      	;	}
	public void setCre_ofc_cd    ( String         cre_ofc_cd     ){	this.cre_ofc_cd     = cre_ofc_cd    	;	}
	public void setCre_usr_id    ( String         cre_usr_id     ){	this.cre_usr_id     = cre_usr_id    	;	}
	public void setCre_dt        ( String         cre_dt         ){	this.cre_dt         = cre_dt        	;	}
	public void setUpd_usr_id    ( String         upd_usr_id     ){	this.upd_usr_id     = upd_usr_id    	;	}
	public void setUpd_dt        ( String         upd_dt         ){	this.upd_dt         = upd_dt        	;	}
	public void setEai_evnt_dt   ( String         eai_evnt_dt    ){	this.eai_evnt_dt    = eai_evnt_dt   	;	}

	public static MGS_MGST_MST fromRequest(HttpServletRequest request) {
		MGS_MGST_MST model = new MGS_MGST_MST();
		try {
			model.setIbflag        	(JSPUtil.getParameter(request, "ibflag        		".trim(), ""));
			model.setPage_rows     	(JSPUtil.getParameter(request, "page_rows     		".trim(), ""));
			model.setMgst_no       	(JSPUtil.getParameter(request, "mgst_no       		".trim(), ""));
			model.setMgst_tp_cd    	(JSPUtil.getParameter(request, "mgst_tp_cd    		".trim(), ""));
			model.setLstm_cd       	(JSPUtil.getParameter(request, "lstm_cd       		".trim(), ""));
			model.setMgst_onh_dt   	(JSPUtil.getParameter(request, "mgst_onh_dt   		".trim(), ""));
			model.setMgst_onh_yd_cd	(JSPUtil.getParameter(request, "mgst_onh_yd_cd		".trim(), ""));
			model.setVndr_seq      	(JSPUtil.getParameter(request, "vndr_seq      		".trim(), ""));
			model.setCre_ofc_cd    	(JSPUtil.getParameter(request, "cre_ofc_cd    		".trim(), ""));
			model.setCre_usr_id    	(JSPUtil.getParameter(request, "cre_usr_id    		".trim(), ""));
			model.setCre_dt        	(JSPUtil.getParameter(request, "cre_dt        		".trim(), ""));
			model.setUpd_usr_id    	(JSPUtil.getParameter(request, "upd_usr_id    		".trim(), ""));
			model.setUpd_dt        	(JSPUtil.getParameter(request, "upd_dt        		".trim(), ""));
			model.setEai_evnt_dt   	(JSPUtil.getParameter(request, "eai_evnt_dt   		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		MGS_MGST_MST model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag         =  (JSPUtil.getParameter(request, "ibflag        		".trim(), length));
			String[] page_rows      =  (JSPUtil.getParameter(request, "page_rows     		".trim(), length));
			String[] mgst_no        =  (JSPUtil.getParameter(request, "mgst_no       		".trim(), length));
			String[] mgst_tp_cd     =  (JSPUtil.getParameter(request, "mgst_tp_cd    		".trim(), length));
			String[] lstm_cd        =  (JSPUtil.getParameter(request, "lstm_cd       		".trim(), length));
			String[] mgst_onh_dt    =  (JSPUtil.getParameter(request, "mgst_onh_dt   		".trim(), length));
			String[] mgst_onh_yd_cd =  (JSPUtil.getParameter(request, "mgst_onh_yd_cd		".trim(), length));
			String[] vndr_seq       =  (JSPUtil.getParameter(request, "vndr_seq      		".trim(), length));
			String[] cre_ofc_cd     =  (JSPUtil.getParameter(request, "cre_ofc_cd    		".trim(), length));
			String[] cre_usr_id     =  (JSPUtil.getParameter(request, "cre_usr_id    		".trim(), length));
			String[] cre_dt         =  (JSPUtil.getParameter(request, "cre_dt        		".trim(), length));
			String[] upd_usr_id     =  (JSPUtil.getParameter(request, "upd_usr_id    		".trim(), length));
			String[] upd_dt         =  (JSPUtil.getParameter(request, "upd_dt        		".trim(), length));
			String[] eai_evnt_dt    =  (JSPUtil.getParameter(request, "eai_evnt_dt   		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new MGS_MGST_MST();
				model.setIbflag        		  (ibflag        	[i]);
				model.setPage_rows     		  (page_rows     	[i]);
				model.setMgst_no       		  (mgst_no       	[i]);
				model.setMgst_tp_cd    		  (mgst_tp_cd    	[i]);
				model.setLstm_cd       		  (lstm_cd       	[i]);
				model.setMgst_onh_dt   		  (mgst_onh_dt   	[i]);
				model.setMgst_onh_yd_cd		  (mgst_onh_yd_cd	[i]);
				model.setVndr_seq      		  (vndr_seq      	[i]);
				model.setCre_ofc_cd    		  (cre_ofc_cd    	[i]);
				model.setCre_usr_id    		  (cre_usr_id    	[i]);
				model.setCre_dt        		  (cre_dt        	[i]);
				model.setUpd_usr_id    		  (upd_usr_id    	[i]);
				model.setUpd_dt        		  (upd_dt        	[i]);
				model.setEai_evnt_dt   		  (eai_evnt_dt   	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		MGS_MGST_MST model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag         =  (JSPUtil.getParameter(request, prefix + "ibflag        		".trim(), length));
			String[] page_rows      =  (JSPUtil.getParameter(request, prefix + "page_rows     		".trim(), length));
			String[] mgst_no        =  (JSPUtil.getParameter(request, prefix + "mgst_no       		".trim(), length));
			String[] mgst_tp_cd     =  (JSPUtil.getParameter(request, prefix + "mgst_tp_cd    		".trim(), length));
			String[] lstm_cd        =  (JSPUtil.getParameter(request, prefix + "lstm_cd       		".trim(), length));
			String[] mgst_onh_dt    =  (JSPUtil.getParameter(request, prefix + "mgst_onh_dt   		".trim(), length));
			String[] mgst_onh_yd_cd =  (JSPUtil.getParameter(request, prefix + "mgst_onh_yd_cd		".trim(), length));
			String[] vndr_seq       =  (JSPUtil.getParameter(request, prefix + "vndr_seq      		".trim(), length));
			String[] cre_ofc_cd     =  (JSPUtil.getParameter(request, prefix + "cre_ofc_cd    		".trim(), length));
			String[] cre_usr_id     =  (JSPUtil.getParameter(request, prefix + "cre_usr_id    		".trim(), length));
			String[] cre_dt         =  (JSPUtil.getParameter(request, prefix + "cre_dt        		".trim(), length));
			String[] upd_usr_id     =  (JSPUtil.getParameter(request, prefix + "upd_usr_id    		".trim(), length));
			String[] upd_dt         =  (JSPUtil.getParameter(request, prefix + "upd_dt        		".trim(), length));
			String[] eai_evnt_dt    =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt   		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new MGS_MGST_MST();
				model.setIbflag        		  ( ibflag        	[i]);
				model.setPage_rows     		  ( page_rows     	[i]);
				model.setMgst_no       		  ( mgst_no       	[i]);
				model.setMgst_tp_cd    		  ( mgst_tp_cd    	[i]);
				model.setLstm_cd       		  ( lstm_cd       	[i]);
				model.setMgst_onh_dt   		  ( mgst_onh_dt   	[i]);
				model.setMgst_onh_yd_cd		  ( mgst_onh_yd_cd	[i]);
				model.setVndr_seq      		  ( vndr_seq      	[i]);
				model.setCre_ofc_cd    		  ( cre_ofc_cd    	[i]);
				model.setCre_usr_id    		  ( cre_usr_id    	[i]);
				model.setCre_dt        		  ( cre_dt        	[i]);
				model.setUpd_usr_id    		  ( upd_usr_id    	[i]);
				model.setUpd_dt        		  ( upd_dt        	[i]);
				model.setEai_evnt_dt   		  ( eai_evnt_dt   	[i]);
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
