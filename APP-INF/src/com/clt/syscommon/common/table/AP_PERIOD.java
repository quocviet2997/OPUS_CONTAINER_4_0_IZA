/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : AP_PERIOD.java
*@FileTitle : SD Analysis Report
*Open Issues :
*Change history :
*@LastModifyDate : 2007-04-03
*@LastModifier : Jung-Jae Kim
*@LastVersion : 1.0
* 2007-04-03 Jung-Jae Kim
* 1.0 최초 생성
* 2008-06-17 : schema변경
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
public final class AP_PERIOD implements java.io.Serializable {

	private String         ibflag         = "";
	private String         page_rows      = "";
	private String         sys_div_cd     = "";
	private String         eff_yrmon 	  = "";
	private String         ofc_cd 	      = "";
	private String         ar_ap_div_cd	  = "";
	private String         rhq_ofc_cd 	  = "";
	private String         clz_sts_cd     = "";
	private String         sys_desc       = "";
	private String         eai_evnt_dt    = "";

	public AP_PERIOD(){}

	public AP_PERIOD(
			String         ibflag        ,
			String         page_rows     ,
			String         sys_div_cd    ,
			String         eff_yrmon	 ,
			String         ofc_cd	     ,
			String         ar_ap_div_cd	 ,
			String         rhq_ofc_cd	 ,
			String         clz_sts_cd    ,
			String         sys_desc      ,
			String         eai_evnt_dt   ){
		this.ibflag         = ibflag        ;
		this.page_rows      = page_rows     ;
		this.sys_div_cd     = sys_div_cd    ;
		this.eff_yrmon      = eff_yrmon		;
		this.ofc_cd      	= ofc_cd		;
		this.ar_ap_div_cd   = ar_ap_div_cd  ;
		this.rhq_ofc_cd     = rhq_ofc_cd	;
		this.clz_sts_cd     = clz_sts_cd    ;
		this.sys_desc       = sys_desc      ;
		this.eai_evnt_dt    = eai_evnt_dt   ;
	}

	// getter method is proceeding ..
	public String         getIbflag         (){	return ibflag       ;	}
	public String         getPage_rows      (){	return page_rows    ;	}
	public String         getSys_div_cd     (){	return sys_div_cd   ;	}
	public String         getEff_yrmon		(){	return eff_yrmon	;	}
	public String         getOfc_cd			(){	return ofc_cd		;	}
	public String         getAr_ap_div_cd	(){	return ar_ap_div_cd	;	}
	public String         getRhq_ofc_cd		(){	return rhq_ofc_cd	;	}
	public String         getClz_sts_cd     (){	return clz_sts_cd   ;	}
	public String         getSys_desc    	(){	return sys_desc    	;	}
	public String         getEai_evnt_dt   	(){	return eai_evnt_dt  ;	}

	// setter method is proceeding ..
	public void setIbflag        ( String         ibflag         ){	this.ibflag         = ibflag        ;	}
	public void setPage_rows     ( String         page_rows      ){	this.page_rows      = page_rows     ;	}
	public void setSys_div_cd    ( String         sys_div_cd     ){	this.sys_div_cd     = sys_div_cd    ;	}
	public void setEff_yrmon	 ( String         eff_yrmon 	 ){	this.eff_yrmon 	    = eff_yrmon		;	}
	public void setOfc_cd	 	 ( String         ofc_cd 	     ){	this.ofc_cd 	    = ofc_cd		;	}
	public void setAr_ap_div_cd	 ( String         ar_ap_div_cd 	 ){	this.ar_ap_div_cd 	= ar_ap_div_cd	;	}
	public void setRhq_ofc_cd	 ( String         rhq_ofc_cd 	 ){	this.rhq_ofc_cd 	= rhq_ofc_cd	;	}
	public void setClz_sts_cd    ( String         clz_sts_cd     ){	this.clz_sts_cd     = clz_sts_cd    ;	}
	public void setSys_desc    	 ( String         sys_desc       ){	this.sys_desc       = sys_desc    	;	}
	public void setEai_evnt_dt   ( String         eai_evnt_dt    ){	this.eai_evnt_dt    = eai_evnt_dt   ;	}

	public static AP_PERIOD fromRequest(HttpServletRequest request) {
		AP_PERIOD model = new AP_PERIOD();
		try {
			model.setIbflag        	(JSPUtil.getParameter(request, "ibflag        		".trim(), ""));
			model.setPage_rows     	(JSPUtil.getParameter(request, "page_rows     		".trim(), ""));
			model.setSys_div_cd     (JSPUtil.getParameter(request, "sys_div_cd        	".trim(), ""));
			model.setEff_yrmon		(JSPUtil.getParameter(request, "eff_yrmon			".trim(), ""));
			model.setOfc_cd			(JSPUtil.getParameter(request, "ofc_cd				".trim(), ""));
			model.setAr_ap_div_cd	(JSPUtil.getParameter(request, "ar_ap_div_cd		".trim(), ""));
			model.setRhq_ofc_cd		(JSPUtil.getParameter(request, "rhq_ofc_cd			".trim(), ""));
			model.setClz_sts_cd     (JSPUtil.getParameter(request, "clz_sts_cd     		".trim(), ""));
			model.setSys_desc    	(JSPUtil.getParameter(request, "sys_desc    		".trim(), ""));
			model.setEai_evnt_dt   	(JSPUtil.getParameter(request, "eai_evnt_dt   		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		AP_PERIOD model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag         =  (JSPUtil.getParameter(request, "ibflag        	".trim(), length));
			String[] page_rows      =  (JSPUtil.getParameter(request, "page_rows     	".trim(), length));
			String[] sys_div_cd     =  (JSPUtil.getParameter(request, "sys_div_cd       ".trim(), length));
			String[] eff_yrmon 		=  (JSPUtil.getParameter(request, "eff_yrmon		".trim(), length));
			String[] ofc_cd 		=  (JSPUtil.getParameter(request, "ofc_cd			".trim(), length));
			String[] ar_ap_div_cd 	=  (JSPUtil.getParameter(request, "ar_ap_div_cd		".trim(), length));
			String[] rhq_ofc_cd 	=  (JSPUtil.getParameter(request, "rhq_ofc_cd		".trim(), length));
			String[] clz_sts_cd     =  (JSPUtil.getParameter(request, "clz_sts_cd     	".trim(), length));
			String[] sys_desc       =  (JSPUtil.getParameter(request, "sys_desc    		".trim(), length));
			String[] eai_evnt_dt    =  (JSPUtil.getParameter(request, "eai_evnt_dt   	".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new AP_PERIOD();
				model.setIbflag        		(ibflag      [i]);
				model.setPage_rows     		(page_rows   [i]);
				model.setSys_div_cd        	(sys_div_cd  [i]);
				model.setEff_yrmon		  	(eff_yrmon	 [i]);
				model.setOfc_cd		  		(ofc_cd	     [i]);
				model.setAr_ap_div_cd		(ar_ap_div_cd[i]);
				model.setRhq_ofc_cd		  	(rhq_ofc_cd	 [i]);
				model.setClz_sts_cd     	(clz_sts_cd  [i]);
				model.setSys_desc    		(sys_desc    [i]);
				model.setEai_evnt_dt   		(eai_evnt_dt [i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		AP_PERIOD model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag         =  (JSPUtil.getParameter(request, prefix + "ibflag        	".trim(), length));
			String[] page_rows      =  (JSPUtil.getParameter(request, prefix + "page_rows     	".trim(), length));
			String[] sys_div_cd     =  (JSPUtil.getParameter(request, prefix + "sys_div_cd      ".trim(), length));
			String[] eff_yrmon 		=  (JSPUtil.getParameter(request, prefix + "eff_yrmon		".trim(), length));
			String[] ofc_cd 		=  (JSPUtil.getParameter(request, prefix + "ofc_cd			".trim(), length));
			String[] ar_ap_div_cd 	=  (JSPUtil.getParameter(request, prefix + "ar_ap_div_cd	".trim(), length));
			String[] rhq_ofc_cd 	=  (JSPUtil.getParameter(request, prefix + "rhq_ofc_cd		".trim(), length));
			String[] clz_sts_cd     =  (JSPUtil.getParameter(request, prefix + "clz_sts_cd     	".trim(), length));
			String[] sys_desc     	=  (JSPUtil.getParameter(request, prefix + "sys_desc    	".trim(), length));
			String[] eai_evnt_dt    =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt   	".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new AP_PERIOD();
				model.setIbflag        	( ibflag        [i]);
				model.setPage_rows     	( page_rows     [i]);
				model.setSys_div_cd     ( sys_div_cd    [i]);
				model.setEff_yrmon		( eff_yrmon		[i]);
				model.setOfc_cd			( ofc_cd		[i]);
				model.setAr_ap_div_cd	( ar_ap_div_cd	[i]);
				model.setRhq_ofc_cd		( rhq_ofc_cd	[i]);
				model.setClz_sts_cd     ( clz_sts_cd    [i]);
				model.setSys_desc    	( sys_desc    	[i]);
				model.setEai_evnt_dt   	( eai_evnt_dt   [i]);
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
