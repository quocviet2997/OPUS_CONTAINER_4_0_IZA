/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : LSE_AGMT_CTRT.java
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
public final class LSE_AGMT_CTRT implements java.io.Serializable {

	private String          ibflag          = "";
	private String          page_rows       = "";
	private String          ctrt_ofc_cty_cd = "";
	private String          ctrt_seq        = "";
	private String          cnt_cd          = "";
	private String          vndr_seq        = "";
	private String          ctrt_eff_dt     = "";
	private String          ctrt_exp_dt     = "";
	private String          eai_evnt_dt     = "";

	public LSE_AGMT_CTRT(){}

	public LSE_AGMT_CTRT(
			String          ibflag         ,
			String          page_rows      ,
			String          ctrt_ofc_cty_cd,
			String          ctrt_seq       ,
			String          cnt_cd         ,
			String          vndr_seq       ,
			String          ctrt_eff_dt    ,
			String          ctrt_exp_dt    ,
			String          eai_evnt_dt    ){
		this.ibflag          = ibflag         ;
		this.page_rows       = page_rows      ;
		this.ctrt_ofc_cty_cd = ctrt_ofc_cty_cd;
		this.ctrt_seq        = ctrt_seq       ;
		this.cnt_cd          = cnt_cd         ;
		this.vndr_seq        = vndr_seq       ;
		this.ctrt_eff_dt     = ctrt_eff_dt    ;
		this.ctrt_exp_dt     = ctrt_exp_dt    ;
		this.eai_evnt_dt     = eai_evnt_dt    ;
	}

	// getter method is proceeding ..
	public String          getIbflag         (){	return ibflag         	;	}
	public String          getPage_rows      (){	return page_rows      	;	}
	public String          getCtrt_ofc_cty_cd(){	return ctrt_ofc_cty_cd	;	}
	public String          getCtrt_seq       (){	return ctrt_seq       	;	}
	public String          getCnt_cd         (){	return cnt_cd         	;	}
	public String          getVndr_seq       (){	return vndr_seq       	;	}
	public String          getCtrt_eff_dt    (){	return ctrt_eff_dt    	;	}
	public String          getCtrt_exp_dt    (){	return ctrt_exp_dt    	;	}
	public String          getEai_evnt_dt    (){	return eai_evnt_dt    	;	}

	// setter method is proceeding ..
	public void setIbflag         ( String          ibflag          ){	this.ibflag          = ibflag         	;	}
	public void setPage_rows      ( String          page_rows       ){	this.page_rows       = page_rows      	;	}
	public void setCtrt_ofc_cty_cd( String          ctrt_ofc_cty_cd ){	this.ctrt_ofc_cty_cd = ctrt_ofc_cty_cd	;	}
	public void setCtrt_seq       ( String          ctrt_seq        ){	this.ctrt_seq        = ctrt_seq       	;	}
	public void setCnt_cd         ( String          cnt_cd          ){	this.cnt_cd          = cnt_cd         	;	}
	public void setVndr_seq       ( String          vndr_seq        ){	this.vndr_seq        = vndr_seq       	;	}
	public void setCtrt_eff_dt    ( String          ctrt_eff_dt     ){	this.ctrt_eff_dt     = ctrt_eff_dt    	;	}
	public void setCtrt_exp_dt    ( String          ctrt_exp_dt     ){	this.ctrt_exp_dt     = ctrt_exp_dt    	;	}
	public void setEai_evnt_dt    ( String          eai_evnt_dt     ){	this.eai_evnt_dt     = eai_evnt_dt    	;	}

	public static LSE_AGMT_CTRT fromRequest(HttpServletRequest request) {
		LSE_AGMT_CTRT model = new LSE_AGMT_CTRT();
		try {
			model.setIbflag         	(JSPUtil.getParameter(request, "ibflag         		".trim(), ""));
			model.setPage_rows      	(JSPUtil.getParameter(request, "page_rows      		".trim(), ""));
			model.setCtrt_ofc_cty_cd	(JSPUtil.getParameter(request, "ctrt_ofc_cty_cd		".trim(), ""));
			model.setCtrt_seq       	(JSPUtil.getParameter(request, "ctrt_seq       		".trim(), ""));
			model.setCnt_cd         	(JSPUtil.getParameter(request, "cnt_cd         		".trim(), ""));
			model.setVndr_seq       	(JSPUtil.getParameter(request, "vndr_seq       		".trim(), ""));
			model.setCtrt_eff_dt    	(JSPUtil.getParameter(request, "ctrt_eff_dt    		".trim(), ""));
			model.setCtrt_exp_dt    	(JSPUtil.getParameter(request, "ctrt_exp_dt    		".trim(), ""));
			model.setEai_evnt_dt    	(JSPUtil.getParameter(request, "eai_evnt_dt    		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		LSE_AGMT_CTRT model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag          =  (JSPUtil.getParameter(request, "ibflag         		".trim(), length));
			String[] page_rows       =  (JSPUtil.getParameter(request, "page_rows      		".trim(), length));
			String[] ctrt_ofc_cty_cd =  (JSPUtil.getParameter(request, "ctrt_ofc_cty_cd		".trim(), length));
			String[] ctrt_seq        =  (JSPUtil.getParameter(request, "ctrt_seq       		".trim(), length));
			String[] cnt_cd          =  (JSPUtil.getParameter(request, "cnt_cd         		".trim(), length));
			String[] vndr_seq        =  (JSPUtil.getParameter(request, "vndr_seq       		".trim(), length));
			String[] ctrt_eff_dt     =  (JSPUtil.getParameter(request, "ctrt_eff_dt    		".trim(), length));
			String[] ctrt_exp_dt     =  (JSPUtil.getParameter(request, "ctrt_exp_dt    		".trim(), length));
			String[] eai_evnt_dt     =  (JSPUtil.getParameter(request, "eai_evnt_dt    		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new LSE_AGMT_CTRT();
				model.setIbflag         		  (ibflag         	[i]);
				model.setPage_rows      		  (page_rows      	[i]);
				model.setCtrt_ofc_cty_cd		  (ctrt_ofc_cty_cd	[i]);
				model.setCtrt_seq       		  (ctrt_seq       	[i]);
				model.setCnt_cd         		  (cnt_cd         	[i]);
				model.setVndr_seq       		  (vndr_seq       	[i]);
				model.setCtrt_eff_dt    		  (ctrt_eff_dt    	[i]);
				model.setCtrt_exp_dt    		  (ctrt_exp_dt    	[i]);
				model.setEai_evnt_dt    		  (eai_evnt_dt    	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		LSE_AGMT_CTRT model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag          =  (JSPUtil.getParameter(request, prefix + "ibflag         		".trim(), length));
			String[] page_rows       =  (JSPUtil.getParameter(request, prefix + "page_rows      		".trim(), length));
			String[] ctrt_ofc_cty_cd =  (JSPUtil.getParameter(request, prefix + "ctrt_ofc_cty_cd		".trim(), length));
			String[] ctrt_seq        =  (JSPUtil.getParameter(request, prefix + "ctrt_seq       		".trim(), length));
			String[] cnt_cd          =  (JSPUtil.getParameter(request, prefix + "cnt_cd         		".trim(), length));
			String[] vndr_seq        =  (JSPUtil.getParameter(request, prefix + "vndr_seq       		".trim(), length));
			String[] ctrt_eff_dt     =  (JSPUtil.getParameter(request, prefix + "ctrt_eff_dt    		".trim(), length));
			String[] ctrt_exp_dt     =  (JSPUtil.getParameter(request, prefix + "ctrt_exp_dt    		".trim(), length));
			String[] eai_evnt_dt     =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt    		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new LSE_AGMT_CTRT();
				model.setIbflag         		  ( ibflag         	[i]);
				model.setPage_rows      		  ( page_rows      	[i]);
				model.setCtrt_ofc_cty_cd		  ( ctrt_ofc_cty_cd	[i]);
				model.setCtrt_seq       		  ( ctrt_seq       	[i]);
				model.setCnt_cd         		  ( cnt_cd         	[i]);
				model.setVndr_seq       		  ( vndr_seq       	[i]);
				model.setCtrt_eff_dt    		  ( ctrt_eff_dt    	[i]);
				model.setCtrt_exp_dt    		  ( ctrt_exp_dt    	[i]);
				model.setEai_evnt_dt    		  ( eai_evnt_dt    	[i]);
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
