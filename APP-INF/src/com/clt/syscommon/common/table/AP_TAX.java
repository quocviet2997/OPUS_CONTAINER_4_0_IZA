/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : AP_TAX.java
*@FileTitle : 사용자 관리5
*Open Issues :
*Change history :
*@LastModifyDate : 2007-01-25
*@LastModifier : Kildong_hong6
*@LastVersion : 1.0
* 2007-01-25 Kildong_hong6
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
 * @author Kildong_hong6
 * @since J2EE 1.4
 */
public final class AP_TAX implements java.io.Serializable {

	private String       ibflag       = "";
	private String       page_rows    = "";
	private String       ap_tax_nm    = "";
	private String       tax_no       = "";
	private String       tax_rt       = "";
	private String       tax_naid_flg = "";
	private String       fa_flg       = "";
	private String       tax_nsl_flg  = "";
	private String       cre_dt       = "";
	private String       cre_usr_id   = "";
	private String       upd_dt       = "";
	private String       upd_usr_id   = "";
	private String       eai_evnt_dt  = "";
	private String		 aval_flg		= "";

	public AP_TAX(){}

	public AP_TAX(
			String       ibflag      ,
			String       page_rows   ,
			String       ap_tax_nm   ,
			String       tax_no      ,
			String       tax_rt      ,
			String       tax_naid_flg,
			String       fa_flg      ,
			String       tax_nsl_flg ,
			String       cre_dt      ,
			String       cre_usr_id  ,
			String       upd_dt      ,
			String       upd_usr_id  ,
			String       eai_evnt_dt ,
			String		 aval_flg		){
		this.ibflag       = ibflag      ;
		this.page_rows    = page_rows   ;
		this.ap_tax_nm    = ap_tax_nm   ;
		this.tax_no       = tax_no      ;
		this.tax_rt       = tax_rt      ;
		this.tax_naid_flg = tax_naid_flg;
		this.fa_flg       = fa_flg      ;
		this.tax_nsl_flg  = tax_nsl_flg ;
		this.cre_dt       = cre_dt      ;
		this.cre_usr_id   = cre_usr_id  ;
		this.upd_dt       = upd_dt      ;
		this.upd_usr_id   = upd_usr_id  ;
		this.eai_evnt_dt  = eai_evnt_dt ;
		this.aval_flg  = aval_flg ;
	}

	// getter method is proceeding ..
	public String       getIbflag      (){	return ibflag      	;	}
	public String       getPage_rows   (){	return page_rows   	;	}
	public String       getAp_tax_nm   (){	return ap_tax_nm   	;	}
	public String       getTax_no      (){	return tax_no      	;	}
	public String       getTax_rt      (){	return tax_rt      	;	}
	public String       getTax_naid_flg(){	return tax_naid_flg	;	}
	public String       getFa_flg      (){	return fa_flg      	;	}
	public String       getTax_nsl_flg (){	return tax_nsl_flg 	;	}
	public String       getCre_dt      (){	return cre_dt      	;	}
	public String       getCre_usr_id  (){	return cre_usr_id  	;	}
	public String       getUpd_dt      (){	return upd_dt      	;	}
	public String       getUpd_usr_id  (){	return upd_usr_id  	;	}
	public String       getEai_evnt_dt (){	return eai_evnt_dt 	;	}
	public String       getAval_flg (){	return aval_flg 	;	}

	// setter method is proceeding ..
	public void setIbflag      ( String       ibflag       ){	this.ibflag       = ibflag      	;	}
	public void setPage_rows   ( String       page_rows    ){	this.page_rows    = page_rows   	;	}
	public void setAp_tax_nm   ( String       ap_tax_nm    ){	this.ap_tax_nm    = ap_tax_nm   	;	}
	public void setTax_no      ( String       tax_no       ){	this.tax_no       = tax_no      	;	}
	public void setTax_rt      ( String       tax_rt       ){	this.tax_rt       = tax_rt      	;	}
	public void setTax_naid_flg( String       tax_naid_flg ){	this.tax_naid_flg = tax_naid_flg	;	}
	public void setFa_flg      ( String       fa_flg       ){	this.fa_flg       = fa_flg      	;	}
	public void setTax_nsl_flg ( String       tax_nsl_flg  ){	this.tax_nsl_flg  = tax_nsl_flg 	;	}
	public void setCre_dt      ( String       cre_dt       ){	this.cre_dt       = cre_dt      	;	}
	public void setCre_usr_id  ( String       cre_usr_id   ){	this.cre_usr_id   = cre_usr_id  	;	}
	public void setUpd_dt      ( String       upd_dt       ){	this.upd_dt       = upd_dt      	;	}
	public void setUpd_usr_id  ( String       upd_usr_id   ){	this.upd_usr_id   = upd_usr_id  	;	}
	public void setEai_evnt_dt ( String       eai_evnt_dt  ){	this.eai_evnt_dt  = eai_evnt_dt 	;	}
	public void setAval_flg ( String       aval_flg  ){	this.aval_flg  = aval_flg 	;	}

	public static AP_TAX fromRequest(HttpServletRequest request) {
		AP_TAX model = new AP_TAX();
		try {
			model.setIbflag      	(JSPUtil.getParameter(request, "ibflag      		".trim(), ""));
			model.setPage_rows   	(JSPUtil.getParameter(request, "page_rows   		".trim(), ""));
			model.setAp_tax_nm   	(JSPUtil.getParameter(request, "ap_tax_nm   		".trim(), ""));
			model.setTax_no      	(JSPUtil.getParameter(request, "tax_no      		".trim(), ""));
			model.setTax_rt      	(JSPUtil.getParameter(request, "tax_rt      		".trim(), ""));
			model.setTax_naid_flg	(JSPUtil.getParameter(request, "tax_naid_flg		".trim(), ""));
			model.setFa_flg      	(JSPUtil.getParameter(request, "fa_flg      		".trim(), ""));
			model.setTax_nsl_flg 	(JSPUtil.getParameter(request, "tax_nsl_flg 		".trim(), ""));
			model.setCre_dt      	(JSPUtil.getParameter(request, "cre_dt      		".trim(), ""));
			model.setCre_usr_id  	(JSPUtil.getParameter(request, "cre_usr_id  		".trim(), ""));
			model.setUpd_dt      	(JSPUtil.getParameter(request, "upd_dt      		".trim(), ""));
			model.setUpd_usr_id  	(JSPUtil.getParameter(request, "upd_usr_id  		".trim(), ""));
			model.setEai_evnt_dt 	(JSPUtil.getParameter(request, "eai_evnt_dt 		".trim(), ""));
			model.setAval_flg 	(JSPUtil.getParameter(request, "aval_flg 		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		AP_TAX model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag       =  (JSPUtil.getParameter(request, "ibflag      		".trim(), length));
			String[] page_rows    =  (JSPUtil.getParameter(request, "page_rows   		".trim(), length));
			String[] ap_tax_nm    =  (JSPUtil.getParameter(request, "ap_tax_nm   		".trim(), length));
			String[] tax_no       =  (JSPUtil.getParameter(request, "tax_no      		".trim(), length));
			String[] tax_rt       =  (JSPUtil.getParameter(request, "tax_rt      		".trim(), length));
			String[] tax_naid_flg =  (JSPUtil.getParameter(request, "tax_naid_flg		".trim(), length));
			String[] fa_flg       =  (JSPUtil.getParameter(request, "fa_flg      		".trim(), length));
			String[] tax_nsl_flg  =  (JSPUtil.getParameter(request, "tax_nsl_flg 		".trim(), length));
			String[] cre_dt       =  (JSPUtil.getParameter(request, "cre_dt      		".trim(), length));
			String[] cre_usr_id   =  (JSPUtil.getParameter(request, "cre_usr_id  		".trim(), length));
			String[] upd_dt       =  (JSPUtil.getParameter(request, "upd_dt      		".trim(), length));
			String[] upd_usr_id   =  (JSPUtil.getParameter(request, "upd_usr_id  		".trim(), length));
			String[] eai_evnt_dt  =  (JSPUtil.getParameter(request, "eai_evnt_dt 		".trim(), length));
			String[] aval_flg  =  (JSPUtil.getParameter(request, "aval_flg 		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new AP_TAX();
				model.setIbflag      		  (ibflag      	[i]);
				model.setPage_rows   		  (page_rows   	[i]);
				model.setAp_tax_nm   		  (ap_tax_nm   	[i]);
				model.setTax_no      		  (tax_no      	[i]);
				model.setTax_rt      		  (tax_rt      	[i]);
				model.setTax_naid_flg		  (tax_naid_flg	[i]);
				model.setFa_flg      		  (fa_flg      	[i]);
				model.setTax_nsl_flg 		  (tax_nsl_flg 	[i]);
				model.setCre_dt      		  (cre_dt      	[i]);
				model.setCre_usr_id  		  (cre_usr_id  	[i]);
				model.setUpd_dt      		  (upd_dt      	[i]);
				model.setUpd_usr_id  		  (upd_usr_id  	[i]);
				model.setEai_evnt_dt 		  (eai_evnt_dt 	[i]);
				model.setAval_flg 		  (aval_flg 	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		AP_TAX model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag       =  (JSPUtil.getParameter(request, prefix + "ibflag      		".trim(), length));
			String[] page_rows    =  (JSPUtil.getParameter(request, prefix + "page_rows   		".trim(), length));
			String[] ap_tax_nm    =  (JSPUtil.getParameter(request, prefix + "ap_tax_nm   		".trim(), length));
			String[] tax_no       =  (JSPUtil.getParameter(request, prefix + "tax_no      		".trim(), length));
			String[] tax_rt       =  (JSPUtil.getParameter(request, prefix + "tax_rt      		".trim(), length));
			String[] tax_naid_flg =  (JSPUtil.getParameter(request, prefix + "tax_naid_flg		".trim(), length));
			String[] fa_flg       =  (JSPUtil.getParameter(request, prefix + "fa_flg      		".trim(), length));
			String[] tax_nsl_flg  =  (JSPUtil.getParameter(request, prefix + "tax_nsl_flg 		".trim(), length));
			String[] cre_dt       =  (JSPUtil.getParameter(request, prefix + "cre_dt      		".trim(), length));
			String[] cre_usr_id   =  (JSPUtil.getParameter(request, prefix + "cre_usr_id  		".trim(), length));
			String[] upd_dt       =  (JSPUtil.getParameter(request, prefix + "upd_dt      		".trim(), length));
			String[] upd_usr_id   =  (JSPUtil.getParameter(request, prefix + "upd_usr_id  		".trim(), length));
			String[] eai_evnt_dt  =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt 		".trim(), length));
			String[] aval_flg  =  (JSPUtil.getParameter(request, prefix + "aval_flg 		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new AP_TAX();
				model.setIbflag      		  ( ibflag      	[i]);
				model.setPage_rows   		  ( page_rows   	[i]);
				model.setAp_tax_nm   		  ( ap_tax_nm   	[i]);
				model.setTax_no      		  ( tax_no      	[i]);
				model.setTax_rt      		  ( tax_rt      	[i]);
				model.setTax_naid_flg		  ( tax_naid_flg	[i]);
				model.setFa_flg      		  ( fa_flg      	[i]);
				model.setTax_nsl_flg 		  ( tax_nsl_flg 	[i]);
				model.setCre_dt      		  ( cre_dt      	[i]);
				model.setCre_usr_id  		  ( cre_usr_id  	[i]);
				model.setUpd_dt      		  ( upd_dt      	[i]);
				model.setUpd_usr_id  		  ( upd_usr_id  	[i]);
				model.setEai_evnt_dt 		  ( eai_evnt_dt 	[i]);
				model.setAval_flg 		  ( aval_flg 	[i]);
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
