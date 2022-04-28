/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : SSC_RFA_CUST.java
*@FileTitle : 사용자 관리5
*Open Issues :
*Change history :
*@LastModifyDate : 2007-01-08
*@LastModifier : Kildong_hong6
*@LastVersion : 1.0
* 2007-01-08 Kildong_hong6
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
public final class SSC_RFA_CUST implements java.io.Serializable {

	private String       ibflag       = "";
	private String       page_rows    = "";
	private String       ofc_pfx_cd   = "";
	private String       ofc_qttn_seq = "";
	private String       cust_cnt_cd  = "";
	private String       cust_seq     = "";
	private String       cust_role_cd = "";
	private String       cust_dp_no   = "";
	private String       cust_tp_cd   = "";
	private String       loc_cd       = "";
	private String       upd_dt       = "";
	private String       cre_usr_id   = "";
	private String       cust_nm      = "";
	private String       rfa_prn_no   = "";
	private String       cre_dt       = "";
	private String       nis_evnt_dt  = "";
	private String       eai_evnt_dt  = "";

	public SSC_RFA_CUST(){}

	public SSC_RFA_CUST(
			String       ibflag      ,
			String       page_rows   ,
			String       ofc_pfx_cd  ,
			String       ofc_qttn_seq,
			String       cust_cnt_cd ,
			String       cust_seq    ,
			String       cust_role_cd,
			String       cust_dp_no  ,
			String       cust_tp_cd  ,
			String       loc_cd      ,
			String       upd_dt      ,
			String       cre_usr_id  ,
			String       cust_nm     ,
			String       rfa_prn_no  ,
			String       cre_dt      ,
			String       nis_evnt_dt ,
			String       eai_evnt_dt ){
		this.ibflag       = ibflag      ;
		this.page_rows    = page_rows   ;
		this.ofc_pfx_cd   = ofc_pfx_cd  ;
		this.ofc_qttn_seq = ofc_qttn_seq;
		this.cust_cnt_cd  = cust_cnt_cd ;
		this.cust_seq     = cust_seq    ;
		this.cust_role_cd = cust_role_cd;
		this.cust_dp_no   = cust_dp_no  ;
		this.cust_tp_cd   = cust_tp_cd  ;
		this.loc_cd       = loc_cd      ;
		this.upd_dt       = upd_dt      ;
		this.cre_usr_id   = cre_usr_id  ;
		this.cust_nm      = cust_nm     ;
		this.rfa_prn_no   = rfa_prn_no  ;
		this.cre_dt       = cre_dt      ;
		this.nis_evnt_dt  = nis_evnt_dt ;
		this.eai_evnt_dt  = eai_evnt_dt ;
	}

	// getter method is proceeding ..
	public String       getIbflag      (){	return ibflag      	;	}
	public String       getPage_rows   (){	return page_rows   	;	}
	public String       getOfc_pfx_cd  (){	return ofc_pfx_cd  	;	}
	public String       getOfc_qttn_seq(){	return ofc_qttn_seq	;	}
	public String       getCust_cnt_cd (){	return cust_cnt_cd 	;	}
	public String       getCust_seq    (){	return cust_seq    	;	}
	public String       getCust_role_cd(){	return cust_role_cd	;	}
	public String       getCust_dp_no  (){	return cust_dp_no  	;	}
	public String       getCust_tp_cd  (){	return cust_tp_cd  	;	}
	public String       getLoc_cd      (){	return loc_cd      	;	}
	public String       getUpd_dt      (){	return upd_dt      	;	}
	public String       getCre_usr_id  (){	return cre_usr_id  	;	}
	public String       getCust_nm     (){	return cust_nm     	;	}
	public String       getRfa_prn_no  (){	return rfa_prn_no  	;	}
	public String       getCre_dt      (){	return cre_dt      	;	}
	public String       getNis_evnt_dt (){	return nis_evnt_dt 	;	}
	public String       getEai_evnt_dt (){	return eai_evnt_dt 	;	}

	// setter method is proceeding ..
	public void setIbflag      ( String       ibflag       ){	this.ibflag       = ibflag      	;	}
	public void setPage_rows   ( String       page_rows    ){	this.page_rows    = page_rows   	;	}
	public void setOfc_pfx_cd  ( String       ofc_pfx_cd   ){	this.ofc_pfx_cd   = ofc_pfx_cd  	;	}
	public void setOfc_qttn_seq( String       ofc_qttn_seq ){	this.ofc_qttn_seq = ofc_qttn_seq	;	}
	public void setCust_cnt_cd ( String       cust_cnt_cd  ){	this.cust_cnt_cd  = cust_cnt_cd 	;	}
	public void setCust_seq    ( String       cust_seq     ){	this.cust_seq     = cust_seq    	;	}
	public void setCust_role_cd( String       cust_role_cd ){	this.cust_role_cd = cust_role_cd	;	}
	public void setCust_dp_no  ( String       cust_dp_no   ){	this.cust_dp_no   = cust_dp_no  	;	}
	public void setCust_tp_cd  ( String       cust_tp_cd   ){	this.cust_tp_cd   = cust_tp_cd  	;	}
	public void setLoc_cd      ( String       loc_cd       ){	this.loc_cd       = loc_cd      	;	}
	public void setUpd_dt      ( String       upd_dt       ){	this.upd_dt       = upd_dt      	;	}
	public void setCre_usr_id  ( String       cre_usr_id   ){	this.cre_usr_id   = cre_usr_id  	;	}
	public void setCust_nm     ( String       cust_nm      ){	this.cust_nm      = cust_nm     	;	}
	public void setRfa_prn_no  ( String       rfa_prn_no   ){	this.rfa_prn_no   = rfa_prn_no  	;	}
	public void setCre_dt      ( String       cre_dt       ){	this.cre_dt       = cre_dt      	;	}
	public void setNis_evnt_dt ( String       nis_evnt_dt  ){	this.nis_evnt_dt  = nis_evnt_dt 	;	}
	public void setEai_evnt_dt ( String       eai_evnt_dt  ){	this.eai_evnt_dt  = eai_evnt_dt 	;	}

	public static SSC_RFA_CUST fromRequest(HttpServletRequest request) {
		SSC_RFA_CUST model = new SSC_RFA_CUST();
		try {
			model.setIbflag      	(JSPUtil.getParameter(request, "ibflag      		".trim(), ""));
			model.setPage_rows   	(JSPUtil.getParameter(request, "page_rows   		".trim(), ""));
			model.setOfc_pfx_cd  	(JSPUtil.getParameter(request, "ofc_pfx_cd  		".trim(), ""));
			model.setOfc_qttn_seq	(JSPUtil.getParameter(request, "ofc_qttn_seq		".trim(), ""));
			model.setCust_cnt_cd 	(JSPUtil.getParameter(request, "cust_cnt_cd 		".trim(), ""));
			model.setCust_seq    	(JSPUtil.getParameter(request, "cust_seq    		".trim(), ""));
			model.setCust_role_cd	(JSPUtil.getParameter(request, "cust_role_cd		".trim(), ""));
			model.setCust_dp_no  	(JSPUtil.getParameter(request, "cust_dp_no  		".trim(), ""));
			model.setCust_tp_cd  	(JSPUtil.getParameter(request, "cust_tp_cd  		".trim(), ""));
			model.setLoc_cd      	(JSPUtil.getParameter(request, "loc_cd      		".trim(), ""));
			model.setUpd_dt      	(JSPUtil.getParameter(request, "upd_dt      		".trim(), ""));
			model.setCre_usr_id  	(JSPUtil.getParameter(request, "cre_usr_id  		".trim(), ""));
			model.setCust_nm     	(JSPUtil.getParameter(request, "cust_nm     		".trim(), ""));
			model.setRfa_prn_no  	(JSPUtil.getParameter(request, "rfa_prn_no  		".trim(), ""));
			model.setCre_dt      	(JSPUtil.getParameter(request, "cre_dt      		".trim(), ""));
			model.setNis_evnt_dt 	(JSPUtil.getParameter(request, "nis_evnt_dt 		".trim(), ""));
			model.setEai_evnt_dt 	(JSPUtil.getParameter(request, "eai_evnt_dt 		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		SSC_RFA_CUST model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag       =  (JSPUtil.getParameter(request, "ibflag      		".trim(), length));
			String[] page_rows    =  (JSPUtil.getParameter(request, "page_rows   		".trim(), length));
			String[] ofc_pfx_cd   =  (JSPUtil.getParameter(request, "ofc_pfx_cd  		".trim(), length));
			String[] ofc_qttn_seq =  (JSPUtil.getParameter(request, "ofc_qttn_seq		".trim(), length));
			String[] cust_cnt_cd  =  (JSPUtil.getParameter(request, "cust_cnt_cd 		".trim(), length));
			String[] cust_seq     =  (JSPUtil.getParameter(request, "cust_seq    		".trim(), length));
			String[] cust_role_cd =  (JSPUtil.getParameter(request, "cust_role_cd		".trim(), length));
			String[] cust_dp_no   =  (JSPUtil.getParameter(request, "cust_dp_no  		".trim(), length));
			String[] cust_tp_cd   =  (JSPUtil.getParameter(request, "cust_tp_cd  		".trim(), length));
			String[] loc_cd       =  (JSPUtil.getParameter(request, "loc_cd      		".trim(), length));
			String[] upd_dt       =  (JSPUtil.getParameter(request, "upd_dt      		".trim(), length));
			String[] cre_usr_id   =  (JSPUtil.getParameter(request, "cre_usr_id  		".trim(), length));
			String[] cust_nm      =  (JSPUtil.getParameter(request, "cust_nm     		".trim(), length));
			String[] rfa_prn_no   =  (JSPUtil.getParameter(request, "rfa_prn_no  		".trim(), length));
			String[] cre_dt       =  (JSPUtil.getParameter(request, "cre_dt      		".trim(), length));
			String[] nis_evnt_dt  =  (JSPUtil.getParameter(request, "nis_evnt_dt 		".trim(), length));
			String[] eai_evnt_dt  =  (JSPUtil.getParameter(request, "eai_evnt_dt 		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new SSC_RFA_CUST();
				model.setIbflag      		  (ibflag      	[i]);
				model.setPage_rows   		  (page_rows   	[i]);
				model.setOfc_pfx_cd  		  (ofc_pfx_cd  	[i]);
				model.setOfc_qttn_seq		  (ofc_qttn_seq	[i]);
				model.setCust_cnt_cd 		  (cust_cnt_cd 	[i]);
				model.setCust_seq    		  (cust_seq    	[i]);
				model.setCust_role_cd		  (cust_role_cd	[i]);
				model.setCust_dp_no  		  (cust_dp_no  	[i]);
				model.setCust_tp_cd  		  (cust_tp_cd  	[i]);
				model.setLoc_cd      		  (loc_cd      	[i]);
				model.setUpd_dt      		  (upd_dt      	[i]);
				model.setCre_usr_id  		  (cre_usr_id  	[i]);
				model.setCust_nm     		  (cust_nm     	[i]);
				model.setRfa_prn_no  		  (rfa_prn_no  	[i]);
				model.setCre_dt      		  (cre_dt      	[i]);
				model.setNis_evnt_dt 		  (nis_evnt_dt 	[i]);
				model.setEai_evnt_dt 		  (eai_evnt_dt 	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		SSC_RFA_CUST model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag       =  (JSPUtil.getParameter(request, prefix + "ibflag      		".trim(), length));
			String[] page_rows    =  (JSPUtil.getParameter(request, prefix + "page_rows   		".trim(), length));
			String[] ofc_pfx_cd   =  (JSPUtil.getParameter(request, prefix + "ofc_pfx_cd  		".trim(), length));
			String[] ofc_qttn_seq =  (JSPUtil.getParameter(request, prefix + "ofc_qttn_seq		".trim(), length));
			String[] cust_cnt_cd  =  (JSPUtil.getParameter(request, prefix + "cust_cnt_cd 		".trim(), length));
			String[] cust_seq     =  (JSPUtil.getParameter(request, prefix + "cust_seq    		".trim(), length));
			String[] cust_role_cd =  (JSPUtil.getParameter(request, prefix + "cust_role_cd		".trim(), length));
			String[] cust_dp_no   =  (JSPUtil.getParameter(request, prefix + "cust_dp_no  		".trim(), length));
			String[] cust_tp_cd   =  (JSPUtil.getParameter(request, prefix + "cust_tp_cd  		".trim(), length));
			String[] loc_cd       =  (JSPUtil.getParameter(request, prefix + "loc_cd      		".trim(), length));
			String[] upd_dt       =  (JSPUtil.getParameter(request, prefix + "upd_dt      		".trim(), length));
			String[] cre_usr_id   =  (JSPUtil.getParameter(request, prefix + "cre_usr_id  		".trim(), length));
			String[] cust_nm      =  (JSPUtil.getParameter(request, prefix + "cust_nm     		".trim(), length));
			String[] rfa_prn_no   =  (JSPUtil.getParameter(request, prefix + "rfa_prn_no  		".trim(), length));
			String[] cre_dt       =  (JSPUtil.getParameter(request, prefix + "cre_dt      		".trim(), length));
			String[] nis_evnt_dt  =  (JSPUtil.getParameter(request, prefix + "nis_evnt_dt 		".trim(), length));
			String[] eai_evnt_dt  =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt 		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new SSC_RFA_CUST();
				model.setIbflag      		  ( ibflag      	[i]);
				model.setPage_rows   		  ( page_rows   	[i]);
				model.setOfc_pfx_cd  		  ( ofc_pfx_cd  	[i]);
				model.setOfc_qttn_seq		  ( ofc_qttn_seq	[i]);
				model.setCust_cnt_cd 		  ( cust_cnt_cd 	[i]);
				model.setCust_seq    		  ( cust_seq    	[i]);
				model.setCust_role_cd		  ( cust_role_cd	[i]);
				model.setCust_dp_no  		  ( cust_dp_no  	[i]);
				model.setCust_tp_cd  		  ( cust_tp_cd  	[i]);
				model.setLoc_cd      		  ( loc_cd      	[i]);
				model.setUpd_dt      		  ( upd_dt      	[i]);
				model.setCre_usr_id  		  ( cre_usr_id  	[i]);
				model.setCust_nm     		  ( cust_nm     	[i]);
				model.setRfa_prn_no  		  ( rfa_prn_no  	[i]);
				model.setCre_dt      		  ( cre_dt      	[i]);
				model.setNis_evnt_dt 		  ( nis_evnt_dt 	[i]);
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
