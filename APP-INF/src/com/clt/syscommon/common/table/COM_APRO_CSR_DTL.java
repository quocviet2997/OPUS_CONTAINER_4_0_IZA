/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : COM_APRO_CSR_DTL.java
*@FileTitle : 사용자 관리
*Open Issues :
*Change history :
*@LastModifyDate : 2007-03-12
*@LastModifier : Kildong_hong
*@LastVersion : 1.0
* 2007-03-12 Kildong_hong
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
 * @author Kildong_hong
 * @since J2EE 1.4
 */
public final class COM_APRO_CSR_DTL implements java.io.Serializable {

	private String       ibflag       = "";
	private String       page_rows    = "";
	private String       apro_rqst_no = "";
	private String       csr_no       = "";
	private String       cost_ofc_cd  = "";
	private String       inv_knt      = "";
	private String       vndr_seq     = "";
	private String       pay_due_dt   = "";
	private String       curr_cd      = "";
	private String       apro_ttl_amt = "";
	private String       cre_usr_id   = "";
	private String       cre_dt       = "";
	private String       upd_usr_id   = "";
	private String       upd_dt       = "";
	private String       delt_flg     = "";

	public COM_APRO_CSR_DTL(){}

	public COM_APRO_CSR_DTL(
			String       ibflag      ,
			String       page_rows   ,
			String       apro_rqst_no,
			String       csr_no      ,
			String       cost_ofc_cd ,
			String       inv_knt     ,
			String       vndr_seq    ,
			String       pay_due_dt  ,
			String       curr_cd     ,
			String       apro_ttl_amt,
			String       cre_usr_id  ,
			String       cre_dt      ,
			String       upd_usr_id  ,
			String       upd_dt      ,
			String       delt_flg    ){
		this.ibflag       = ibflag      ;
		this.page_rows    = page_rows   ;
		this.apro_rqst_no = apro_rqst_no;
		this.csr_no       = csr_no      ;
		this.cost_ofc_cd  = cost_ofc_cd ;
		this.inv_knt      = inv_knt     ;
		this.vndr_seq     = vndr_seq    ;
		this.pay_due_dt   = pay_due_dt  ;
		this.curr_cd      = curr_cd     ;
		this.apro_ttl_amt = apro_ttl_amt;
		this.cre_usr_id   = cre_usr_id  ;
		this.cre_dt       = cre_dt      ;
		this.upd_usr_id   = upd_usr_id  ;
		this.upd_dt       = upd_dt      ;
		this.delt_flg     = delt_flg    ;
	}

	// getter method is proceeding ..
	public String       getIbflag      (){	return ibflag      	;	}
	public String       getPage_rows   (){	return page_rows   	;	}
	public String       getApro_rqst_no(){	return apro_rqst_no	;	}
	public String       getCsr_no      (){	return csr_no      	;	}
	public String       getCost_ofc_cd (){	return cost_ofc_cd 	;	}
	public String       getInv_knt     (){	return inv_knt     	;	}
	public String       getVndr_seq    (){	return vndr_seq    	;	}
	public String       getPay_due_dt  (){	return pay_due_dt  	;	}
	public String       getCurr_cd     (){	return curr_cd     	;	}
	public String       getApro_ttl_amt(){	return apro_ttl_amt	;	}
	public String       getCre_usr_id  (){	return cre_usr_id  	;	}
	public String       getCre_dt      (){	return cre_dt      	;	}
	public String       getUpd_usr_id  (){	return upd_usr_id  	;	}
	public String       getUpd_dt      (){	return upd_dt      	;	}
	public String       getDelt_flg    (){	return delt_flg    	;	}

	// setter method is proceeding ..
	public void setIbflag      ( String       ibflag       ){	this.ibflag       = ibflag      	;	}
	public void setPage_rows   ( String       page_rows    ){	this.page_rows    = page_rows   	;	}
	public void setApro_rqst_no( String       apro_rqst_no ){	this.apro_rqst_no = apro_rqst_no	;	}
	public void setCsr_no      ( String       csr_no       ){	this.csr_no       = csr_no      	;	}
	public void setCost_ofc_cd ( String       cost_ofc_cd  ){	this.cost_ofc_cd  = cost_ofc_cd 	;	}
	public void setInv_knt     ( String       inv_knt      ){	this.inv_knt      = inv_knt     	;	}
	public void setVndr_seq    ( String       vndr_seq     ){	this.vndr_seq     = vndr_seq    	;	}
	public void setPay_due_dt  ( String       pay_due_dt   ){	this.pay_due_dt   = pay_due_dt  	;	}
	public void setCurr_cd     ( String       curr_cd      ){	this.curr_cd      = curr_cd     	;	}
	public void setApro_ttl_amt( String       apro_ttl_amt ){	this.apro_ttl_amt = apro_ttl_amt	;	}
	public void setCre_usr_id  ( String       cre_usr_id   ){	this.cre_usr_id   = cre_usr_id  	;	}
	public void setCre_dt      ( String       cre_dt       ){	this.cre_dt       = cre_dt      	;	}
	public void setUpd_usr_id  ( String       upd_usr_id   ){	this.upd_usr_id   = upd_usr_id  	;	}
	public void setUpd_dt      ( String       upd_dt       ){	this.upd_dt       = upd_dt      	;	}
	public void setDelt_flg    ( String       delt_flg     ){	this.delt_flg     = delt_flg    	;	}

	public static COM_APRO_CSR_DTL fromRequest(HttpServletRequest request) {
		COM_APRO_CSR_DTL model = new COM_APRO_CSR_DTL();
		try {
			model.setIbflag      	(JSPUtil.getParameter(request, "ibflag      		".trim(), ""));
			model.setPage_rows   	(JSPUtil.getParameter(request, "page_rows   		".trim(), ""));
			model.setApro_rqst_no	(JSPUtil.getParameter(request, "apro_rqst_no		".trim(), ""));
			model.setCsr_no      	(JSPUtil.getParameter(request, "csr_no      		".trim(), ""));
			model.setCost_ofc_cd 	(JSPUtil.getParameter(request, "cost_ofc_cd 		".trim(), ""));
			model.setInv_knt     	(JSPUtil.getParameter(request, "inv_knt     		".trim(), ""));
			model.setVndr_seq    	(JSPUtil.getParameter(request, "vndr_seq    		".trim(), ""));
			model.setPay_due_dt  	(JSPUtil.getParameter(request, "pay_due_dt  		".trim(), ""));
			model.setCurr_cd     	(JSPUtil.getParameter(request, "curr_cd     		".trim(), ""));
			model.setApro_ttl_amt	(JSPUtil.getParameter(request, "apro_ttl_amt		".trim(), ""));
			model.setCre_usr_id  	(JSPUtil.getParameter(request, "cre_usr_id  		".trim(), ""));
			model.setCre_dt      	(JSPUtil.getParameter(request, "cre_dt      		".trim(), ""));
			model.setUpd_usr_id  	(JSPUtil.getParameter(request, "upd_usr_id  		".trim(), ""));
			model.setUpd_dt      	(JSPUtil.getParameter(request, "upd_dt      		".trim(), ""));
			model.setDelt_flg    	(JSPUtil.getParameter(request, "delt_flg    		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		COM_APRO_CSR_DTL model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag       =  (JSPUtil.getParameter(request, "ibflag      		".trim(), length));
			String[] page_rows    =  (JSPUtil.getParameter(request, "page_rows   		".trim(), length));
			String[] apro_rqst_no =  (JSPUtil.getParameter(request, "apro_rqst_no		".trim(), length));
			String[] csr_no       =  (JSPUtil.getParameter(request, "csr_no      		".trim(), length));
			String[] cost_ofc_cd  =  (JSPUtil.getParameter(request, "cost_ofc_cd 		".trim(), length));
			String[] inv_knt      =  (JSPUtil.getParameter(request, "inv_knt     		".trim(), length));
			String[] vndr_seq     =  (JSPUtil.getParameter(request, "vndr_seq    		".trim(), length));
			String[] pay_due_dt   =  (JSPUtil.getParameter(request, "pay_due_dt  		".trim(), length));
			String[] curr_cd      =  (JSPUtil.getParameter(request, "curr_cd     		".trim(), length));
			String[] apro_ttl_amt =  (JSPUtil.getParameter(request, "apro_ttl_amt		".trim(), length));
			String[] cre_usr_id   =  (JSPUtil.getParameter(request, "cre_usr_id  		".trim(), length));
			String[] cre_dt       =  (JSPUtil.getParameter(request, "cre_dt      		".trim(), length));
			String[] upd_usr_id   =  (JSPUtil.getParameter(request, "upd_usr_id  		".trim(), length));
			String[] upd_dt       =  (JSPUtil.getParameter(request, "upd_dt      		".trim(), length));
			String[] delt_flg     =  (JSPUtil.getParameter(request, "delt_flg    		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new COM_APRO_CSR_DTL();
				model.setIbflag      		  (ibflag      	[i]);
				model.setPage_rows   		  (page_rows   	[i]);
				model.setApro_rqst_no		  (apro_rqst_no	[i]);
				model.setCsr_no      		  (csr_no      	[i]);
				model.setCost_ofc_cd 		  (cost_ofc_cd 	[i]);
				model.setInv_knt     		  (inv_knt     	[i]);
				model.setVndr_seq    		  (vndr_seq    	[i]);
				model.setPay_due_dt  		  (pay_due_dt  	[i]);
				model.setCurr_cd     		  (curr_cd     	[i]);
				model.setApro_ttl_amt		  (apro_ttl_amt	[i]);
				model.setCre_usr_id  		  (cre_usr_id  	[i]);
				model.setCre_dt      		  (cre_dt      	[i]);
				model.setUpd_usr_id  		  (upd_usr_id  	[i]);
				model.setUpd_dt      		  (upd_dt      	[i]);
				model.setDelt_flg    		  (delt_flg    	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		COM_APRO_CSR_DTL model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag       =  (JSPUtil.getParameter(request, prefix + "ibflag      		".trim(), length));
			String[] page_rows    =  (JSPUtil.getParameter(request, prefix + "page_rows   		".trim(), length));
			String[] apro_rqst_no =  (JSPUtil.getParameter(request, prefix + "apro_rqst_no		".trim(), length));
			String[] csr_no       =  (JSPUtil.getParameter(request, prefix + "csr_no      		".trim(), length));
			String[] cost_ofc_cd  =  (JSPUtil.getParameter(request, prefix + "cost_ofc_cd 		".trim(), length));
			String[] inv_knt      =  (JSPUtil.getParameter(request, prefix + "inv_knt     		".trim(), length));
			String[] vndr_seq     =  (JSPUtil.getParameter(request, prefix + "vndr_seq    		".trim(), length));
			String[] pay_due_dt   =  (JSPUtil.getParameter(request, prefix + "pay_due_dt  		".trim(), length));
			String[] curr_cd      =  (JSPUtil.getParameter(request, prefix + "curr_cd     		".trim(), length));
			String[] apro_ttl_amt =  (JSPUtil.getParameter(request, prefix + "apro_ttl_amt		".trim(), length));
			String[] cre_usr_id   =  (JSPUtil.getParameter(request, prefix + "cre_usr_id  		".trim(), length));
			String[] cre_dt       =  (JSPUtil.getParameter(request, prefix + "cre_dt      		".trim(), length));
			String[] upd_usr_id   =  (JSPUtil.getParameter(request, prefix + "upd_usr_id  		".trim(), length));
			String[] upd_dt       =  (JSPUtil.getParameter(request, prefix + "upd_dt      		".trim(), length));
			String[] delt_flg     =  (JSPUtil.getParameter(request, prefix + "delt_flg    		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new COM_APRO_CSR_DTL();
				model.setIbflag      		  ( ibflag      	[i]);
				model.setPage_rows   		  ( page_rows   	[i]);
				model.setApro_rqst_no		  ( apro_rqst_no	[i]);
				model.setCsr_no      		  ( csr_no      	[i]);
				model.setCost_ofc_cd 		  ( cost_ofc_cd 	[i]);
				model.setInv_knt     		  ( inv_knt     	[i]);
				model.setVndr_seq    		  ( vndr_seq    	[i]);
				model.setPay_due_dt  		  ( pay_due_dt  	[i]);
				model.setCurr_cd     		  ( curr_cd     	[i]);
				model.setApro_ttl_amt		  ( apro_ttl_amt	[i]);
				model.setCre_usr_id  		  ( cre_usr_id  	[i]);
				model.setCre_dt      		  ( cre_dt      	[i]);
				model.setUpd_usr_id  		  ( upd_usr_id  	[i]);
				model.setUpd_dt      		  ( upd_dt      	[i]);
				model.setDelt_flg    		  ( delt_flg    	[i]);
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
