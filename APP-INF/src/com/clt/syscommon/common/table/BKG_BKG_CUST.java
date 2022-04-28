/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : BKG_BKG_CUST.java
*@FileTitle : 사용자 관리5
*Open Issues :
*Change history :
*@LastModifyDate : 2007-01-05
*@LastModifier : Kildong_hong6
*@LastVersion : 1.0
* 2007-01-05 Kildong_hong6
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
public final class BKG_BKG_CUST implements java.io.Serializable {

	private String          ibflag          = "";
	private String          page_rows       = "";
	private String          bkg_no          = "";
	private String          bkg_no_split    = "";
	private String          bkg_cust_tp_cd  = "";
	private String          cust_cnt_cd     = "";
	private String          cust_seq        = "";
	private String          cust_nm         = "";
	private String          cust_addr       = "";
	private String          fmc_rpt_no      = "";
	private String          cust_to_ord_flg = "";
	private String          prnt_cust_tp_cd = "";
	private String          fwrd_prn_flg    = "";
	private String          nis_evnt_dt     = "";
	private String          fax_no          = "";
	private String          bkg_xter_cd     = "";
	private String          fwrd_ref_no     = "";
	private String          bkg_si_cd       = "";
	private String          cust_cty_nm     = "";
	private String          cust_cty_cd     = "";
	private String          cust_ste_cd     = "";
	private String          cust_zip_cd     = "";
	private String          eai_evnt_dt     = "";
	private String			ref_no			= "";
	private String          bro_pay_acct_cd = "";

	public BKG_BKG_CUST(){}

	public BKG_BKG_CUST(
			String          ibflag         ,
			String          page_rows      ,
			String          bkg_no         ,
			String          bkg_no_split   ,
			String          bkg_cust_tp_cd ,
			String          cust_cnt_cd    ,
			String          cust_seq       ,
			String          cust_nm        ,
			String          cust_addr      ,
			String          fmc_rpt_no     ,
			String          cust_to_ord_flg,
			String          prnt_cust_tp_cd,
			String          fwrd_prn_flg   ,
			String          nis_evnt_dt    ,
			String          fax_no         ,
			String          bkg_xter_cd    ,
			String          fwrd_ref_no    ,
			String          bkg_si_cd      ,
			String          cust_cty_nm    ,
			String          cust_cty_cd    ,
			String          cust_ste_cd    ,
			String          cust_zip_cd    ,
			String          eai_evnt_dt    ,
			String			ref_no		   ,
			String			bro_pay_acct_cd){
		this.ibflag          = ibflag         ;
		this.page_rows       = page_rows      ;
		this.bkg_no          = bkg_no         ;
		this.bkg_no_split    = bkg_no_split   ;
		this.bkg_cust_tp_cd  = bkg_cust_tp_cd ;
		this.cust_cnt_cd     = cust_cnt_cd    ;
		this.cust_seq        = cust_seq       ;
		this.cust_nm         = cust_nm        ;
		this.cust_addr       = cust_addr      ;
		this.fmc_rpt_no      = fmc_rpt_no     ;
		this.cust_to_ord_flg = cust_to_ord_flg;
		this.prnt_cust_tp_cd = prnt_cust_tp_cd;
		this.fwrd_prn_flg    = fwrd_prn_flg   ;
		this.nis_evnt_dt     = nis_evnt_dt    ;
		this.fax_no          = fax_no         ;
		this.bkg_xter_cd     = bkg_xter_cd    ;
		this.fwrd_ref_no     = fwrd_ref_no    ;
		this.bkg_si_cd       = bkg_si_cd      ;
		this.cust_cty_nm     = cust_cty_nm    ;
		this.cust_cty_cd     = cust_cty_cd    ;
		this.cust_ste_cd     = cust_ste_cd    ;
		this.cust_zip_cd     = cust_zip_cd    ;
		this.eai_evnt_dt     = eai_evnt_dt    ;
		this.ref_no			 = ref_no    	  ;
		this.bro_pay_acct_cd = bro_pay_acct_cd    ;
	}

	// getter method is proceeding ..
	public String          getIbflag         (){	return ibflag         	;	}
	public String          getPage_rows      (){	return page_rows      	;	}
	public String          getBkg_no         (){	return bkg_no         	;	}
	public String          getBkg_no_split   (){	return bkg_no_split   	;	}
	public String          getBkg_cust_tp_cd (){	return bkg_cust_tp_cd 	;	}
	public String          getCust_cnt_cd    (){	return cust_cnt_cd    	;	}
	public String          getCust_seq       (){	return cust_seq       	;	}
	public String          getCust_nm        (){	return cust_nm        	;	}
	public String          getCust_addr      (){	return cust_addr      	;	}
	public String          getFmc_rpt_no     (){	return fmc_rpt_no     	;	}
	public String          getCust_to_ord_flg(){	return cust_to_ord_flg	;	}
	public String          getPrnt_cust_tp_cd(){	return prnt_cust_tp_cd	;	}
	public String          getFwrd_prn_flg   (){	return fwrd_prn_flg   	;	}
	public String          getNis_evnt_dt    (){	return nis_evnt_dt    	;	}
	public String          getFax_no         (){	return fax_no         	;	}
	public String          getBkg_xter_cd    (){	return bkg_xter_cd    	;	}
	public String          getFwrd_ref_no    (){	return fwrd_ref_no    	;	}
	public String          getBkg_si_cd      (){	return bkg_si_cd      	;	}
	public String          getCust_cty_nm    (){	return cust_cty_nm    	;	}
	public String          getCust_cty_cd    (){	return cust_cty_cd    	;	}
	public String          getCust_ste_cd    (){	return cust_ste_cd    	;	}
	public String          getCust_zip_cd    (){	return cust_zip_cd    	;	}
	public String          getEai_evnt_dt    (){	return eai_evnt_dt    	;	}
	public String          getRef_no	     (){	return ref_no    	;	}
	public String          getBro_pay_acct_cd(){	return bro_pay_acct_cd    	;	}

	// setter method is proceeding ..
	public void setIbflag         ( String          ibflag          ){	this.ibflag          = ibflag         	;	}
	public void setPage_rows      ( String          page_rows       ){	this.page_rows       = page_rows      	;	}
	public void setBkg_no         ( String          bkg_no          ){	this.bkg_no          = bkg_no         	;	}
	public void setBkg_no_split   ( String          bkg_no_split    ){	this.bkg_no_split    = bkg_no_split   	;	}
	public void setBkg_cust_tp_cd ( String          bkg_cust_tp_cd  ){	this.bkg_cust_tp_cd  = bkg_cust_tp_cd 	;	}
	public void setCust_cnt_cd    ( String          cust_cnt_cd     ){	this.cust_cnt_cd     = cust_cnt_cd    	;	}
	public void setCust_seq       ( String          cust_seq        ){	this.cust_seq        = cust_seq       	;	}
	public void setCust_nm        ( String          cust_nm         ){	this.cust_nm         = cust_nm        	;	}
	public void setCust_addr      ( String          cust_addr       ){	this.cust_addr       = cust_addr      	;	}
	public void setFmc_rpt_no     ( String          fmc_rpt_no      ){	this.fmc_rpt_no      = fmc_rpt_no     	;	}
	public void setCust_to_ord_flg( String          cust_to_ord_flg ){	this.cust_to_ord_flg = cust_to_ord_flg	;	}
	public void setPrnt_cust_tp_cd( String          prnt_cust_tp_cd ){	this.prnt_cust_tp_cd = prnt_cust_tp_cd	;	}
	public void setFwrd_prn_flg   ( String          fwrd_prn_flg    ){	this.fwrd_prn_flg    = fwrd_prn_flg   	;	}
	public void setNis_evnt_dt    ( String          nis_evnt_dt     ){	this.nis_evnt_dt     = nis_evnt_dt    	;	}
	public void setFax_no         ( String          fax_no          ){	this.fax_no          = fax_no         	;	}
	public void setBkg_xter_cd    ( String          bkg_xter_cd     ){	this.bkg_xter_cd     = bkg_xter_cd    	;	}
	public void setFwrd_ref_no    ( String          fwrd_ref_no     ){	this.fwrd_ref_no     = fwrd_ref_no    	;	}
	public void setBkg_si_cd      ( String          bkg_si_cd       ){	this.bkg_si_cd       = bkg_si_cd      	;	}
	public void setCust_cty_nm    ( String          cust_cty_nm     ){	this.cust_cty_nm     = cust_cty_nm    	;	}
	public void setCust_cty_cd    ( String          cust_cty_cd     ){	this.cust_cty_cd     = cust_cty_cd    	;	}
	public void setCust_ste_cd    ( String          cust_ste_cd     ){	this.cust_ste_cd     = cust_ste_cd    	;	}
	public void setCust_zip_cd    ( String          cust_zip_cd     ){	this.cust_zip_cd     = cust_zip_cd    	;	}
	public void setEai_evnt_dt    ( String          eai_evnt_dt     ){	this.eai_evnt_dt     = eai_evnt_dt    	;	}
	public void setRef_no	      ( String          ref_no     		){	this.ref_no     	 = ref_no    		;	}
	public void setBro_pay_acct_cd( String          bro_pay_acct_cd ){	this.bro_pay_acct_cd = bro_pay_acct_cd 	;	}

	public static BKG_BKG_CUST fromRequest(HttpServletRequest request) {
		BKG_BKG_CUST model = new BKG_BKG_CUST();
		try {
			model.setIbflag         	(JSPUtil.getParameter(request, "ibflag         		".trim(), ""));
			model.setPage_rows      	(JSPUtil.getParameter(request, "page_rows      		".trim(), ""));
			model.setBkg_no         	(JSPUtil.getParameter(request, "bkg_no         		".trim(), ""));
			model.setBkg_no_split   	(JSPUtil.getParameter(request, "bkg_no_split   		".trim(), ""));
			model.setBkg_cust_tp_cd 	(JSPUtil.getParameter(request, "bkg_cust_tp_cd 		".trim(), ""));
			model.setCust_cnt_cd    	(JSPUtil.getParameter(request, "cust_cnt_cd    		".trim(), ""));
			model.setCust_seq       	(JSPUtil.getParameter(request, "cust_seq       		".trim(), ""));
			model.setCust_nm        	(JSPUtil.getParameter(request, "cust_nm        		".trim(), ""));
			model.setCust_addr      	(JSPUtil.getParameter(request, "cust_addr      		".trim(), ""));
			model.setFmc_rpt_no     	(JSPUtil.getParameter(request, "fmc_rpt_no     		".trim(), ""));
			model.setCust_to_ord_flg	(JSPUtil.getParameter(request, "cust_to_ord_flg		".trim(), ""));
			model.setPrnt_cust_tp_cd	(JSPUtil.getParameter(request, "prnt_cust_tp_cd		".trim(), ""));
			model.setFwrd_prn_flg   	(JSPUtil.getParameter(request, "fwrd_prn_flg   		".trim(), ""));
			model.setNis_evnt_dt    	(JSPUtil.getParameter(request, "nis_evnt_dt    		".trim(), ""));
			model.setFax_no         	(JSPUtil.getParameter(request, "fax_no         		".trim(), ""));
			model.setBkg_xter_cd    	(JSPUtil.getParameter(request, "bkg_xter_cd    		".trim(), ""));
			model.setFwrd_ref_no    	(JSPUtil.getParameter(request, "fwrd_ref_no    		".trim(), ""));
			model.setBkg_si_cd      	(JSPUtil.getParameter(request, "bkg_si_cd      		".trim(), ""));
			model.setCust_cty_nm    	(JSPUtil.getParameter(request, "cust_cty_nm    		".trim(), ""));
			model.setCust_cty_cd    	(JSPUtil.getParameter(request, "cust_cty_cd    		".trim(), ""));
			model.setCust_ste_cd    	(JSPUtil.getParameter(request, "cust_ste_cd    		".trim(), ""));
			model.setCust_zip_cd    	(JSPUtil.getParameter(request, "cust_zip_cd    		".trim(), ""));
			model.setEai_evnt_dt    	(JSPUtil.getParameter(request, "eai_evnt_dt    		".trim(), ""));
			model.setRef_no    			(JSPUtil.getParameter(request, "ref_no    			".trim(), ""));
			model.setBro_pay_acct_cd   	(JSPUtil.getParameter(request, "bro_pay_acct_cd		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		BKG_BKG_CUST model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag          =  (JSPUtil.getParameter(request, "ibflag         		".trim(), length));
			String[] page_rows       =  (JSPUtil.getParameter(request, "page_rows      		".trim(), length));
			String[] bkg_no          =  (JSPUtil.getParameter(request, "bkg_no         		".trim(), length));
			String[] bkg_no_split    =  (JSPUtil.getParameter(request, "bkg_no_split   		".trim(), length));
			String[] bkg_cust_tp_cd  =  (JSPUtil.getParameter(request, "bkg_cust_tp_cd 		".trim(), length));
			String[] cust_cnt_cd     =  (JSPUtil.getParameter(request, "cust_cnt_cd    		".trim(), length));
			String[] cust_seq        =  (JSPUtil.getParameter(request, "cust_seq       		".trim(), length));
			String[] cust_nm         =  (JSPUtil.getParameter(request, "cust_nm        		".trim(), length));
			String[] cust_addr       =  (JSPUtil.getParameter(request, "cust_addr      		".trim(), length));
			String[] fmc_rpt_no      =  (JSPUtil.getParameter(request, "fmc_rpt_no     		".trim(), length));
			String[] cust_to_ord_flg =  (JSPUtil.getParameter(request, "cust_to_ord_flg		".trim(), length));
			String[] prnt_cust_tp_cd =  (JSPUtil.getParameter(request, "prnt_cust_tp_cd		".trim(), length));
			String[] fwrd_prn_flg    =  (JSPUtil.getParameter(request, "fwrd_prn_flg   		".trim(), length));
			String[] nis_evnt_dt     =  (JSPUtil.getParameter(request, "nis_evnt_dt    		".trim(), length));
			String[] fax_no          =  (JSPUtil.getParameter(request, "fax_no         		".trim(), length));
			String[] bkg_xter_cd     =  (JSPUtil.getParameter(request, "bkg_xter_cd    		".trim(), length));
			String[] fwrd_ref_no     =  (JSPUtil.getParameter(request, "fwrd_ref_no    		".trim(), length));
			String[] bkg_si_cd       =  (JSPUtil.getParameter(request, "bkg_si_cd      		".trim(), length));
			String[] cust_cty_nm     =  (JSPUtil.getParameter(request, "cust_cty_nm    		".trim(), length));
			String[] cust_cty_cd     =  (JSPUtil.getParameter(request, "cust_cty_cd    		".trim(), length));
			String[] cust_ste_cd     =  (JSPUtil.getParameter(request, "cust_ste_cd    		".trim(), length));
			String[] cust_zip_cd     =  (JSPUtil.getParameter(request, "cust_zip_cd    		".trim(), length));
			String[] eai_evnt_dt     =  (JSPUtil.getParameter(request, "eai_evnt_dt    		".trim(), length));
			String[] ref_no		     =  (JSPUtil.getParameter(request, "ref_no	    		".trim(), length));
			String[] bro_pay_acct_cd =  (JSPUtil.getParameter(request, "bro_pay_acct_cd		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new BKG_BKG_CUST();
				model.setIbflag         		  (ibflag         	[i]);
				model.setPage_rows      		  (page_rows      	[i]);
				model.setBkg_no         		  (bkg_no         	[i]);
				model.setBkg_no_split   		  (bkg_no_split   	[i]);
				model.setBkg_cust_tp_cd 		  (bkg_cust_tp_cd 	[i]);
				model.setCust_cnt_cd    		  (cust_cnt_cd    	[i]);
				model.setCust_seq       		  (cust_seq       	[i]);
				model.setCust_nm        		  (cust_nm        	[i]);
				model.setCust_addr      		  (cust_addr      	[i]);
				model.setFmc_rpt_no     		  (fmc_rpt_no     	[i]);
				model.setCust_to_ord_flg		  (cust_to_ord_flg	[i]);
				model.setPrnt_cust_tp_cd		  (prnt_cust_tp_cd	[i]);
				model.setFwrd_prn_flg   		  (fwrd_prn_flg   	[i]);
				model.setNis_evnt_dt    		  (nis_evnt_dt    	[i]);
				model.setFax_no         		  (fax_no         	[i]);
				model.setBkg_xter_cd    		  (bkg_xter_cd    	[i]);
				model.setFwrd_ref_no    		  (fwrd_ref_no    	[i]);
				model.setBkg_si_cd      		  (bkg_si_cd      	[i]);
				model.setCust_cty_nm    		  (cust_cty_nm    	[i]);
				model.setCust_cty_cd    		  (cust_cty_cd    	[i]);
				model.setCust_ste_cd    		  (cust_ste_cd    	[i]);
				model.setCust_zip_cd    		  (cust_zip_cd    	[i]);
				model.setEai_evnt_dt    		  (eai_evnt_dt    	[i]);
				model.setRef_no		    		  (ref_no	    	[i]);
				model.setBro_pay_acct_cd   		  (bro_pay_acct_cd 	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		BKG_BKG_CUST model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag          =  (JSPUtil.getParameter(request, prefix + "ibflag         		".trim(), length));
			String[] page_rows       =  (JSPUtil.getParameter(request, prefix + "page_rows      		".trim(), length));
			String[] bkg_no          =  (JSPUtil.getParameter(request, prefix + "bkg_no         		".trim(), length));
			String[] bkg_no_split    =  (JSPUtil.getParameter(request, prefix + "bkg_no_split   		".trim(), length));
			String[] bkg_cust_tp_cd  =  (JSPUtil.getParameter(request, prefix + "bkg_cust_tp_cd 		".trim(), length));
			String[] cust_cnt_cd     =  (JSPUtil.getParameter(request, prefix + "cust_cnt_cd    		".trim(), length));
			String[] cust_seq        =  (JSPUtil.getParameter(request, prefix + "cust_seq       		".trim(), length));
			String[] cust_nm         =  (JSPUtil.getParameter(request, prefix + "cust_nm        		".trim(), length));
			String[] cust_addr       =  (JSPUtil.getParameter(request, prefix + "cust_addr      		".trim(), length));
			String[] fmc_rpt_no      =  (JSPUtil.getParameter(request, prefix + "fmc_rpt_no     		".trim(), length));
			String[] cust_to_ord_flg =  (JSPUtil.getParameter(request, prefix + "cust_to_ord_flg		".trim(), length));
			String[] prnt_cust_tp_cd =  (JSPUtil.getParameter(request, prefix + "prnt_cust_tp_cd		".trim(), length));
			String[] fwrd_prn_flg    =  (JSPUtil.getParameter(request, prefix + "fwrd_prn_flg   		".trim(), length));
			String[] nis_evnt_dt     =  (JSPUtil.getParameter(request, prefix + "nis_evnt_dt    		".trim(), length));
			String[] fax_no          =  (JSPUtil.getParameter(request, prefix + "fax_no         		".trim(), length));
			String[] bkg_xter_cd     =  (JSPUtil.getParameter(request, prefix + "bkg_xter_cd    		".trim(), length));
			String[] fwrd_ref_no     =  (JSPUtil.getParameter(request, prefix + "fwrd_ref_no    		".trim(), length));
			String[] bkg_si_cd       =  (JSPUtil.getParameter(request, prefix + "bkg_si_cd      		".trim(), length));
			String[] cust_cty_nm     =  (JSPUtil.getParameter(request, prefix + "cust_cty_nm    		".trim(), length));
			String[] cust_cty_cd     =  (JSPUtil.getParameter(request, prefix + "cust_cty_cd    		".trim(), length));
			String[] cust_ste_cd     =  (JSPUtil.getParameter(request, prefix + "cust_ste_cd    		".trim(), length));
			String[] cust_zip_cd     =  (JSPUtil.getParameter(request, prefix + "cust_zip_cd    		".trim(), length));
			String[] eai_evnt_dt     =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt    		".trim(), length));
			String[] ref_no		     =  (JSPUtil.getParameter(request, prefix + "ref_no		    		".trim(), length));
			String[] bro_pay_acct_cd =  (JSPUtil.getParameter(request, prefix + "bro_pay_acct_cd  		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new BKG_BKG_CUST();
				model.setIbflag         		  ( ibflag         	[i]);
				model.setPage_rows      		  ( page_rows      	[i]);
				model.setBkg_no         		  ( bkg_no         	[i]);
				model.setBkg_no_split   		  ( bkg_no_split   	[i]);
				model.setBkg_cust_tp_cd 		  ( bkg_cust_tp_cd 	[i]);
				model.setCust_cnt_cd    		  ( cust_cnt_cd    	[i]);
				model.setCust_seq       		  ( cust_seq       	[i]);
				model.setCust_nm        		  ( cust_nm        	[i]);
				model.setCust_addr      		  ( cust_addr      	[i]);
				model.setFmc_rpt_no     		  ( fmc_rpt_no     	[i]);
				model.setCust_to_ord_flg		  ( cust_to_ord_flg	[i]);
				model.setPrnt_cust_tp_cd		  ( prnt_cust_tp_cd	[i]);
				model.setFwrd_prn_flg   		  ( fwrd_prn_flg   	[i]);
				model.setNis_evnt_dt    		  ( nis_evnt_dt    	[i]);
				model.setFax_no         		  ( fax_no         	[i]);
				model.setBkg_xter_cd    		  ( bkg_xter_cd    	[i]);
				model.setFwrd_ref_no    		  ( fwrd_ref_no    	[i]);
				model.setBkg_si_cd      		  ( bkg_si_cd      	[i]);
				model.setCust_cty_nm    		  ( cust_cty_nm    	[i]);
				model.setCust_cty_cd    		  ( cust_cty_cd    	[i]);
				model.setCust_ste_cd    		  ( cust_ste_cd    	[i]);
				model.setCust_zip_cd    		  ( cust_zip_cd    	[i]);
				model.setEai_evnt_dt    		  ( eai_evnt_dt    	[i]);
				model.setRef_no		    		  ( ref_no	    	[i]);
				model.setBro_pay_acct_cd    	  ( bro_pay_acct_cd	[i]);
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
