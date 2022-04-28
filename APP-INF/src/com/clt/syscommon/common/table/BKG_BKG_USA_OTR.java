/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : BKG_BKG_USA_OTR.java
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
public final class BKG_BKG_USA_OTR implements java.io.Serializable {

	private String       ibflag       = "";
	private String       page_rows    = "";
	private String       bkg_no       = "";
	private String       bkg_no_split = "";
	private String       stop_loc_cd  = "";
	private String       cntc_pson_nm = "";
	private String       stop_phn_no  = "";
	private String       stop_rmk     = "";
	private String       eai_evnt_dt  = "";

	public BKG_BKG_USA_OTR(){}

	public BKG_BKG_USA_OTR(
			String       ibflag      ,
			String       page_rows   ,
			String       bkg_no      ,
			String       bkg_no_split,
			String       stop_loc_cd ,
			String       cntc_pson_nm,
			String       stop_phn_no ,
			String       stop_rmk    ,
			String       eai_evnt_dt ){
		this.ibflag       = ibflag      ;
		this.page_rows    = page_rows   ;
		this.bkg_no       = bkg_no      ;
		this.bkg_no_split = bkg_no_split;
		this.stop_loc_cd  = stop_loc_cd ;
		this.cntc_pson_nm = cntc_pson_nm;
		this.stop_phn_no  = stop_phn_no ;
		this.stop_rmk     = stop_rmk    ;
		this.eai_evnt_dt  = eai_evnt_dt ;
	}

	// getter method is proceeding ..
	public String       getIbflag      (){	return ibflag      	;	}
	public String       getPage_rows   (){	return page_rows   	;	}
	public String       getBkg_no      (){	return bkg_no      	;	}
	public String       getBkg_no_split(){	return bkg_no_split	;	}
	public String       getStop_loc_cd (){	return stop_loc_cd 	;	}
	public String       getCntc_pson_nm(){	return cntc_pson_nm	;	}
	public String       getStop_phn_no (){	return stop_phn_no 	;	}
	public String       getStop_rmk    (){	return stop_rmk    	;	}
	public String       getEai_evnt_dt (){	return eai_evnt_dt 	;	}

	// setter method is proceeding ..
	public void setIbflag      ( String       ibflag       ){	this.ibflag       = ibflag      	;	}
	public void setPage_rows   ( String       page_rows    ){	this.page_rows    = page_rows   	;	}
	public void setBkg_no      ( String       bkg_no       ){	this.bkg_no       = bkg_no      	;	}
	public void setBkg_no_split( String       bkg_no_split ){	this.bkg_no_split = bkg_no_split	;	}
	public void setStop_loc_cd ( String       stop_loc_cd  ){	this.stop_loc_cd  = stop_loc_cd 	;	}
	public void setCntc_pson_nm( String       cntc_pson_nm ){	this.cntc_pson_nm = cntc_pson_nm	;	}
	public void setStop_phn_no ( String       stop_phn_no  ){	this.stop_phn_no  = stop_phn_no 	;	}
	public void setStop_rmk    ( String       stop_rmk     ){	this.stop_rmk     = stop_rmk    	;	}
	public void setEai_evnt_dt ( String       eai_evnt_dt  ){	this.eai_evnt_dt  = eai_evnt_dt 	;	}

	public static BKG_BKG_USA_OTR fromRequest(HttpServletRequest request) {
		BKG_BKG_USA_OTR model = new BKG_BKG_USA_OTR();
		try {
			model.setIbflag      	(JSPUtil.getParameter(request, "ibflag      		".trim(), ""));
			model.setPage_rows   	(JSPUtil.getParameter(request, "page_rows   		".trim(), ""));
			model.setBkg_no      	(JSPUtil.getParameter(request, "bkg_no      		".trim(), ""));
			model.setBkg_no_split	(JSPUtil.getParameter(request, "bkg_no_split		".trim(), ""));
			model.setStop_loc_cd 	(JSPUtil.getParameter(request, "stop_loc_cd 		".trim(), ""));
			model.setCntc_pson_nm	(JSPUtil.getParameter(request, "cntc_pson_nm		".trim(), ""));
			model.setStop_phn_no 	(JSPUtil.getParameter(request, "stop_phn_no 		".trim(), ""));
			model.setStop_rmk    	(JSPUtil.getParameter(request, "stop_rmk    		".trim(), ""));
			model.setEai_evnt_dt 	(JSPUtil.getParameter(request, "eai_evnt_dt 		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		BKG_BKG_USA_OTR model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag       =  (JSPUtil.getParameter(request, "ibflag      		".trim(), length));
			String[] page_rows    =  (JSPUtil.getParameter(request, "page_rows   		".trim(), length));
			String[] bkg_no       =  (JSPUtil.getParameter(request, "bkg_no      		".trim(), length));
			String[] bkg_no_split =  (JSPUtil.getParameter(request, "bkg_no_split		".trim(), length));
			String[] stop_loc_cd  =  (JSPUtil.getParameter(request, "stop_loc_cd 		".trim(), length));
			String[] cntc_pson_nm =  (JSPUtil.getParameter(request, "cntc_pson_nm		".trim(), length));
			String[] stop_phn_no  =  (JSPUtil.getParameter(request, "stop_phn_no 		".trim(), length));
			String[] stop_rmk     =  (JSPUtil.getParameter(request, "stop_rmk    		".trim(), length));
			String[] eai_evnt_dt  =  (JSPUtil.getParameter(request, "eai_evnt_dt 		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new BKG_BKG_USA_OTR();
				model.setIbflag      		  (ibflag      	[i]);
				model.setPage_rows   		  (page_rows   	[i]);
				model.setBkg_no      		  (bkg_no      	[i]);
				model.setBkg_no_split		  (bkg_no_split	[i]);
				model.setStop_loc_cd 		  (stop_loc_cd 	[i]);
				model.setCntc_pson_nm		  (cntc_pson_nm	[i]);
				model.setStop_phn_no 		  (stop_phn_no 	[i]);
				model.setStop_rmk    		  (stop_rmk    	[i]);
				model.setEai_evnt_dt 		  (eai_evnt_dt 	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		BKG_BKG_USA_OTR model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag       =  (JSPUtil.getParameter(request, prefix + "ibflag      		".trim(), length));
			String[] page_rows    =  (JSPUtil.getParameter(request, prefix + "page_rows   		".trim(), length));
			String[] bkg_no       =  (JSPUtil.getParameter(request, prefix + "bkg_no      		".trim(), length));
			String[] bkg_no_split =  (JSPUtil.getParameter(request, prefix + "bkg_no_split		".trim(), length));
			String[] stop_loc_cd  =  (JSPUtil.getParameter(request, prefix + "stop_loc_cd 		".trim(), length));
			String[] cntc_pson_nm =  (JSPUtil.getParameter(request, prefix + "cntc_pson_nm		".trim(), length));
			String[] stop_phn_no  =  (JSPUtil.getParameter(request, prefix + "stop_phn_no 		".trim(), length));
			String[] stop_rmk     =  (JSPUtil.getParameter(request, prefix + "stop_rmk    		".trim(), length));
			String[] eai_evnt_dt  =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt 		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new BKG_BKG_USA_OTR();
				model.setIbflag      		  ( ibflag      	[i]);
				model.setPage_rows   		  ( page_rows   	[i]);
				model.setBkg_no      		  ( bkg_no      	[i]);
				model.setBkg_no_split		  ( bkg_no_split	[i]);
				model.setStop_loc_cd 		  ( stop_loc_cd 	[i]);
				model.setCntc_pson_nm		  ( cntc_pson_nm	[i]);
				model.setStop_phn_no 		  ( stop_phn_no 	[i]);
				model.setStop_rmk    		  ( stop_rmk    	[i]);
				model.setEai_evnt_dt 		  ( eai_evnt_dt 	[i]);
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
