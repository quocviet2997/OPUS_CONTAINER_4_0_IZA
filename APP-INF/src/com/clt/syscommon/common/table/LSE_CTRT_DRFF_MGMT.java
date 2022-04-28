/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : LSE_CTRT_DRFF_MGMT.java
*@FileTitle : Adding Surcharge Agreement
*Open Issues :
*Change history :
*@LastModifyDate : 2007-06-20
*@LastModifier : agreement
*@LastVersion : 1.0
* 2007-06-20 agreement
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
public final class LSE_CTRT_DRFF_MGMT implements java.io.Serializable {

	private String           ibflag           = "";
	private String           page_rows        = "";
	private String           ctrt_ofc_cty_cd  = "";
	private String           ctrt_seq         = "";
	private String           ctrt_ver_no      = "";
	private String           cntr_offh_loc_cd = "";
	private String           cntr_tpsz_cd     = "";
	private String           drff_lmt_no      = "";
	private String           drff_chg_amt     = "";
	private String           drff_cre_dt      = "";
	private String           drff_upd_dt      = "";
	private String           eai_evnt_dt      = "";

	public LSE_CTRT_DRFF_MGMT(){}

	public LSE_CTRT_DRFF_MGMT(
			String           ibflag          ,
			String           page_rows       ,
			String           ctrt_ofc_cty_cd ,
			String           ctrt_seq        ,
			String           ctrt_ver_no     ,
			String           cntr_offh_loc_cd,
			String           cntr_tpsz_cd    ,
			String           drff_lmt_no     ,
			String           drff_chg_amt    ,
			String           drff_cre_dt     ,
			String           drff_upd_dt     ,
			String           eai_evnt_dt     ){
		this.ibflag           = ibflag          ;
		this.page_rows        = page_rows       ;
		this.ctrt_ofc_cty_cd  = ctrt_ofc_cty_cd ;
		this.ctrt_seq         = ctrt_seq        ;
		this.ctrt_ver_no      = ctrt_ver_no     ;
		this.cntr_offh_loc_cd = cntr_offh_loc_cd;
		this.cntr_tpsz_cd     = cntr_tpsz_cd    ;
		this.drff_lmt_no      = drff_lmt_no     ;
		this.drff_chg_amt     = drff_chg_amt    ;
		this.drff_cre_dt      = drff_cre_dt     ;
		this.drff_upd_dt      = drff_upd_dt     ;
		this.eai_evnt_dt      = eai_evnt_dt     ;
	}

	// getter method is proceeding ..
	public String           getIbflag          (){	return ibflag          	;	}
	public String           getPage_rows       (){	return page_rows       	;	}
	public String           getCtrt_ofc_cty_cd (){	return ctrt_ofc_cty_cd 	;	}
	public String           getCtrt_seq        (){	return ctrt_seq        	;	}
	public String           getCtrt_ver_no     (){	return ctrt_ver_no     	;	}
	public String           getCntr_offh_loc_cd(){	return cntr_offh_loc_cd	;	}
	public String           getCntr_tpsz_cd    (){	return cntr_tpsz_cd    	;	}
	public String           getDrff_lmt_no     (){	return drff_lmt_no     	;	}
	public String           getDrff_chg_amt    (){	return drff_chg_amt    	;	}
	public String           getDrff_cre_dt     (){	return drff_cre_dt     	;	}
	public String           getDrff_upd_dt     (){	return drff_upd_dt     	;	}
	public String           getEai_evnt_dt     (){	return eai_evnt_dt     	;	}

	// setter method is proceeding ..
	public void setIbflag          ( String           ibflag           ){	this.ibflag           = ibflag          	;	}
	public void setPage_rows       ( String           page_rows        ){	this.page_rows        = page_rows       	;	}
	public void setCtrt_ofc_cty_cd ( String           ctrt_ofc_cty_cd  ){	this.ctrt_ofc_cty_cd  = ctrt_ofc_cty_cd 	;	}
	public void setCtrt_seq        ( String           ctrt_seq         ){	this.ctrt_seq         = ctrt_seq        	;	}
	public void setCtrt_ver_no     ( String           ctrt_ver_no      ){	this.ctrt_ver_no      = ctrt_ver_no     	;	}
	public void setCntr_offh_loc_cd( String           cntr_offh_loc_cd ){	this.cntr_offh_loc_cd = cntr_offh_loc_cd	;	}
	public void setCntr_tpsz_cd    ( String           cntr_tpsz_cd     ){	this.cntr_tpsz_cd     = cntr_tpsz_cd    	;	}
	public void setDrff_lmt_no     ( String           drff_lmt_no      ){	this.drff_lmt_no      = drff_lmt_no     	;	}
	public void setDrff_chg_amt    ( String           drff_chg_amt     ){	this.drff_chg_amt     = drff_chg_amt    	;	}
	public void setDrff_cre_dt     ( String           drff_cre_dt      ){	this.drff_cre_dt      = drff_cre_dt     	;	}
	public void setDrff_upd_dt     ( String           drff_upd_dt      ){	this.drff_upd_dt      = drff_upd_dt     	;	}
	public void setEai_evnt_dt     ( String           eai_evnt_dt      ){	this.eai_evnt_dt      = eai_evnt_dt     	;	}

	public static LSE_CTRT_DRFF_MGMT fromRequest(HttpServletRequest request) {
		LSE_CTRT_DRFF_MGMT model = new LSE_CTRT_DRFF_MGMT();
		try {
			model.setIbflag          	(JSPUtil.getParameter(request, "ibflag          		".trim(), ""));
			model.setPage_rows       	(JSPUtil.getParameter(request, "page_rows       		".trim(), ""));
			model.setCtrt_ofc_cty_cd 	(JSPUtil.getParameter(request, "ctrt_ofc_cty_cd 		".trim(), ""));
			model.setCtrt_seq        	(JSPUtil.getParameter(request, "ctrt_seq        		".trim(), ""));
			model.setCtrt_ver_no     	(JSPUtil.getParameter(request, "ctrt_ver_no     		".trim(), ""));
			model.setCntr_offh_loc_cd	(JSPUtil.getParameter(request, "cntr_offh_loc_cd		".trim(), ""));
			model.setCntr_tpsz_cd    	(JSPUtil.getParameter(request, "cntr_tpsz_cd    		".trim(), ""));
			model.setDrff_lmt_no     	(JSPUtil.getParameter(request, "drff_lmt_no     		".trim(), ""));
			model.setDrff_chg_amt    	(JSPUtil.getParameter(request, "drff_chg_amt    		".trim(), ""));
			model.setDrff_cre_dt     	(JSPUtil.getParameter(request, "drff_cre_dt     		".trim(), ""));
			model.setDrff_upd_dt     	(JSPUtil.getParameter(request, "drff_upd_dt     		".trim(), ""));
			model.setEai_evnt_dt     	(JSPUtil.getParameter(request, "eai_evnt_dt     		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		LSE_CTRT_DRFF_MGMT model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag           =  (JSPUtil.getParameter(request, "ibflag          		".trim(), length));
			String[] page_rows        =  (JSPUtil.getParameter(request, "page_rows       		".trim(), length));
			String[] ctrt_ofc_cty_cd  =  (JSPUtil.getParameter(request, "ctrt_ofc_cty_cd 		".trim(), length));
			String[] ctrt_seq         =  (JSPUtil.getParameter(request, "ctrt_seq        		".trim(), length));
			String[] ctrt_ver_no      =  (JSPUtil.getParameter(request, "ctrt_ver_no     		".trim(), length));
			String[] cntr_offh_loc_cd =  (JSPUtil.getParameter(request, "cntr_offh_loc_cd		".trim(), length));
			String[] cntr_tpsz_cd     =  (JSPUtil.getParameter(request, "cntr_tpsz_cd    		".trim(), length));
			String[] drff_lmt_no      =  (JSPUtil.getParameter(request, "drff_lmt_no     		".trim(), length));
			String[] drff_chg_amt     =  (JSPUtil.getParameter(request, "drff_chg_amt    		".trim(), length));
			String[] drff_cre_dt      =  (JSPUtil.getParameter(request, "drff_cre_dt     		".trim(), length));
			String[] drff_upd_dt      =  (JSPUtil.getParameter(request, "drff_upd_dt     		".trim(), length));
			String[] eai_evnt_dt      =  (JSPUtil.getParameter(request, "eai_evnt_dt     		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new LSE_CTRT_DRFF_MGMT();
				model.setIbflag          		  (ibflag          	[i]);
				model.setPage_rows       		  (page_rows       	[i]);
				model.setCtrt_ofc_cty_cd 		  (ctrt_ofc_cty_cd 	[i]);
				model.setCtrt_seq        		  (ctrt_seq        	[i]);
				model.setCtrt_ver_no     		  (ctrt_ver_no     	[i]);
				model.setCntr_offh_loc_cd		  (cntr_offh_loc_cd	[i]);
				model.setCntr_tpsz_cd    		  (cntr_tpsz_cd    	[i]);
				model.setDrff_lmt_no     		  (drff_lmt_no     	[i]);
				model.setDrff_chg_amt    		  (drff_chg_amt    	[i]);
				model.setDrff_cre_dt     		  (drff_cre_dt     	[i]);
				model.setDrff_upd_dt     		  (drff_upd_dt     	[i]);
				model.setEai_evnt_dt     		  (eai_evnt_dt     	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		LSE_CTRT_DRFF_MGMT model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag           =  (JSPUtil.getParameter(request, prefix + "ibflag          		".trim(), length));
			String[] page_rows        =  (JSPUtil.getParameter(request, prefix + "page_rows       		".trim(), length));
			String[] ctrt_ofc_cty_cd  =  (JSPUtil.getParameter(request, prefix + "ctrt_ofc_cty_cd 		".trim(), length));
			String[] ctrt_seq         =  (JSPUtil.getParameter(request, prefix + "ctrt_seq        		".trim(), length));
			String[] ctrt_ver_no      =  (JSPUtil.getParameter(request, prefix + "ctrt_ver_no     		".trim(), length));
			String[] cntr_offh_loc_cd =  (JSPUtil.getParameter(request, prefix + "cntr_offh_loc_cd		".trim(), length));
			String[] cntr_tpsz_cd     =  (JSPUtil.getParameter(request, prefix + "cntr_tpsz_cd    		".trim(), length));
			String[] drff_lmt_no      =  (JSPUtil.getParameter(request, prefix + "drff_lmt_no     		".trim(), length));
			String[] drff_chg_amt     =  (JSPUtil.getParameter(request, prefix + "drff_chg_amt    		".trim(), length));
			String[] drff_cre_dt      =  (JSPUtil.getParameter(request, prefix + "drff_cre_dt     		".trim(), length));
			String[] drff_upd_dt      =  (JSPUtil.getParameter(request, prefix + "drff_upd_dt     		".trim(), length));
			String[] eai_evnt_dt      =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt     		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new LSE_CTRT_DRFF_MGMT();
				model.setIbflag          		  ( ibflag          	[i]);
				model.setPage_rows       		  ( page_rows       	[i]);
				model.setCtrt_ofc_cty_cd 		  ( ctrt_ofc_cty_cd 	[i]);
				model.setCtrt_seq        		  ( ctrt_seq        	[i]);
				model.setCtrt_ver_no     		  ( ctrt_ver_no     	[i]);
				model.setCntr_offh_loc_cd		  ( cntr_offh_loc_cd	[i]);
				model.setCntr_tpsz_cd    		  ( cntr_tpsz_cd    	[i]);
				model.setDrff_lmt_no     		  ( drff_lmt_no     	[i]);
				model.setDrff_chg_amt    		  ( drff_chg_amt    	[i]);
				model.setDrff_cre_dt     		  ( drff_cre_dt     	[i]);
				model.setDrff_upd_dt     		  ( drff_upd_dt     	[i]);
				model.setEai_evnt_dt     		  ( eai_evnt_dt     	[i]);
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
