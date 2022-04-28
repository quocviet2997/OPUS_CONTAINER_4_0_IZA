/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : AGT_CHG_ROUT.java
*@FileTitle : 사용자 관리5
*Open Issues :
*Change history :
*@LastModifyDate : 2007-10-29
*@LastModifier : 
*@LastVersion : 1.0
* 2007-10-29 
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
public final class AGT_CHG_ROUT implements java.io.Serializable {

	private String           eai_sts        = "";
	private String           eai_dt        	= "";
	private String           company    	= "";
	private String           bkg_no         = "";
	private String           bkg_no_split  	= "";
	private String           chg_cd 		= "";
	private String           bkg_agmt_ut_cd = "";
	private String           curr_cd       	= "";
	private String           spcl_cgo_ctnt  = "";
	private String           rout_trf_rt    = "";
	private String           rout_trf_rto   = "";
	private String           comm_proc_sts_rsn	= "";

	public AGT_CHG_ROUT(){}

	public AGT_CHG_ROUT(
			String           eai_sts        ,
			String           eai_dt        	,
			String           company    	,
			String           bkg_no         ,
			String           bkg_no_split  	,
			String           chg_cd 		,
			String           bkg_agmt_ut_cd ,
			String           curr_cd        ,
			String           spcl_cgo_ctnt  ,
			String           rout_trf_rt    ,
			String           rout_trf_rto   ,
			String           comm_proc_sts_rsn      	 ){
		this.eai_sts        = eai_sts;
		this.eai_dt        	= eai_dt;
		this.company    	= company;
		this.bkg_no         = bkg_no;
		this.bkg_no_split  	= bkg_no_split;
		this.chg_cd 		= chg_cd;
		this.bkg_agmt_ut_cd = bkg_agmt_ut_cd;
		this.curr_cd       	= curr_cd;
		this.spcl_cgo_ctnt  = spcl_cgo_ctnt;
		this.rout_trf_rt    = rout_trf_rt;
		this.rout_trf_rto   = rout_trf_rto;
		this.comm_proc_sts_rsn	= comm_proc_sts_rsn;
	}

	// getter method is proceeding ..
	public String           getEaiSts			(){	return eai_sts        	;	}
	public String           getEaiDt			(){	return eai_dt       	;	}
	public String           getCompany			(){	return company  		;	}
	public String           getBkgNo			(){	return bkg_no       	;	}
	public String           getBkgNoSplit		(){	return bkg_no_split 	;	}
	public String           getChgCd			(){	return chg_cd			;	}
	public String           getBkgAgmtUtCd 		(){	return bkg_agmt_ut_cd 	;	}
	public String           getCurrCd			(){	return curr_cd      	;	}
	public String           getSpclCgoCtnt		(){	return spcl_cgo_ctnt    ;	}
	public String           getRoutTrfRt		(){	return rout_trf_rt      ;	}
	public String           getRoutTrfRto		(){	return rout_trf_rto     ;	}
	public String           getCommProcStsRsn	(){	return comm_proc_sts_rsn;	}

	// setter method is proceeding ..
	public void setEaiSts        	( String           eai_sts        	){	this.eai_sts          	= eai_sts         	;	}
	public void setEaiDt       		( String           eai_dt        	){	this.eai_dt        		= eai_dt       		;	}
	public void setCompany  		( String           company  		){	this.company    		= company   		;	}
	public void setBkgNo       		( String           bkg_no       	){	this.bkg_no         	= bkg_no        	;	}
	public void setBkgNoSplit 		( String           bkg_no_split  	){	this.bkg_no_split  		= bkg_no_split 		;	}
	public void setChgCd			( String           chg_cd 			){	this.chg_cd 			= chg_cd			;	}
	public void setBkgAgmtUtCd 		( String           bkg_agmt_ut_cd  	){	this.bkg_agmt_ut_cd  	= bkg_agmt_ut_cd 	;	}
	public void setCurrCd      		( String           curr_cd       	){	this.curr_cd       		= curr_cd      		;	}
	public void setSpclCgoCtnt      ( String           spcl_cgo_ctnt    ){	this.spcl_cgo_ctnt      = spcl_cgo_ctnt     ;	}
	public void setRoutTrfRt   		( String           rout_trf_rt     	){	this.rout_trf_rt     	= rout_trf_rt    	;	}
	public void setRoutTrfRto     	( String           rout_trf_rto     ){	this.rout_trf_rto       = rout_trf_rto      ;	}
	public void setCommProcStsRsn   ( String           comm_proc_sts_rsn){	this.comm_proc_sts_rsn  = comm_proc_sts_rsn ;	}

	public static AGT_CHG_ROUT fromRequest(HttpServletRequest request) {
		AGT_CHG_ROUT model = new AGT_CHG_ROUT();
		try {
			model.setEaiSts          	(JSPUtil.getParameter(request, "eai_sts".trim(), ""));
			model.setEaiDt       		(JSPUtil.getParameter(request, "eai_dt".trim(), ""));
			model.setCompany     		(JSPUtil.getParameter(request, "company".trim(), ""));
			model.setBkgNo         		(JSPUtil.getParameter(request, "bkg_no".trim(), ""));
			model.setBkgNoSplit 		(JSPUtil.getParameter(request, "bkg_no_split".trim(), ""));
			model.setChgCd				(JSPUtil.getParameter(request, "chg_cd".trim(), ""));
			model.setBkgAgmtUtCd 		(JSPUtil.getParameter(request, "bkg_agmt_ut_cd".trim(), ""));
			model.setCurrCd      		(JSPUtil.getParameter(request, "curr_cd".trim(), ""));
			model.setSpclCgoCtnt        (JSPUtil.getParameter(request, "spcl_cgo_ctnt".trim(), ""));
			model.setRoutTrfRt    		(JSPUtil.getParameter(request, "rout_trf_rt".trim(), ""));
			model.setRoutTrfRto        	(JSPUtil.getParameter(request, "rout_trf_rto".trim(), ""));
			model.setCommProcStsRsn     (JSPUtil.getParameter(request, "comm_proc_sts_rsn".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		AGT_CHG_ROUT model = null;
		Collection models = new ArrayList();
		try {
			String[] eai_sts          	=  (JSPUtil.getParameter(request, "eai_sts".trim(), length));
			String[] eai_dt        		=  (JSPUtil.getParameter(request, "eai_dt".trim(), length));
			String[] company    		=  (JSPUtil.getParameter(request, "company".trim(), length));
			String[] bkg_no         	=  (JSPUtil.getParameter(request, "bkg_no".trim(), length));
			String[] bkg_no_split  		=  (JSPUtil.getParameter(request, "bkg_no_split".trim(), length));
			String[] chg_cd 			=  (JSPUtil.getParameter(request, "chg_cd".trim(), length));
			String[] bkg_agmt_ut_cd  	=  (JSPUtil.getParameter(request, "bkg_agmt_ut_cd".trim(), length));
			String[] curr_cd       		=  (JSPUtil.getParameter(request, "curr_cd".trim(), length));
			String[] spcl_cgo_ctnt      =  (JSPUtil.getParameter(request, "spcl_cgo_ctnt".trim(), length));
			String[] rout_trf_rt     	=  (JSPUtil.getParameter(request, "rout_trf_rt".trim(), length));
			String[] rout_trf_rto       =  (JSPUtil.getParameter(request, "rout_trf_rto".trim(), length));
			String[] comm_proc_sts_rsn  =  (JSPUtil.getParameter(request, "comm_proc_sts_rsn".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new AGT_CHG_ROUT();
				model.setEaiSts          	(eai_sts[i]);
				model.setEaiDt       		(eai_dt[i]);
				model.setCompany     		(company[i]);
				model.setBkgNo         		(bkg_no[i]);
				model.setBkgNoSplit 		(bkg_no_split[i]);
				model.setChgCd				(chg_cd[i]);
				model.setBkgAgmtUtCd 		(bkg_agmt_ut_cd[i]);
				model.setCurrCd      		(curr_cd[i]);
				model.setSpclCgoCtnt        (spcl_cgo_ctnt[i]);
				model.setRoutTrfRt    		(rout_trf_rt[i]);
				model.setRoutTrfRto        	(rout_trf_rto[i]);
				model.setCommProcStsRsn     (comm_proc_sts_rsn[i]);				
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		AGT_CHG_ROUT model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] eai_sts          	=  (JSPUtil.getParameter(request, prefix + "eai_sts".trim(), length));
			String[] eai_dt        		=  (JSPUtil.getParameter(request, prefix + "eai_dt".trim(), length));
			String[] company    		=  (JSPUtil.getParameter(request, prefix + "company".trim(), length));
			String[] bkg_no         	=  (JSPUtil.getParameter(request, prefix + "bkg_no".trim(), length));
			String[] bkg_no_split  		=  (JSPUtil.getParameter(request, prefix + "bkg_no_split".trim(), length));
			String[] chg_cd 			=  (JSPUtil.getParameter(request, prefix + "chg_cd".trim(), length));
			String[] bkg_agmt_ut_cd  	=  (JSPUtil.getParameter(request, prefix + "bkg_agmt_ut_cd".trim(), length));
			String[] curr_cd       		=  (JSPUtil.getParameter(request, prefix + "curr_cd".trim(), length));
			String[] spcl_cgo_ctnt      =  (JSPUtil.getParameter(request, prefix + "spcl_cgo_ctnt".trim(), length));
			String[] rout_trf_rt     	=  (JSPUtil.getParameter(request, prefix + "rout_trf_rt".trim(), length));
			String[] rout_trf_rto       =  (JSPUtil.getParameter(request, prefix + "rout_trf_rto".trim(), length));
			String[] comm_proc_sts_rsn  =  (JSPUtil.getParameter(request, prefix + "comm_proc_sts_rsn".trim(), length));

			for (int i = 0; i < length; i++) {
				model = new AGT_CHG_ROUT();
				model.setEaiSts         (eai_sts[i]);
				model.setEaiDt       	(eai_dt[i]);
				model.setCompany     	(company[i]);
				model.setBkgNo         	(bkg_no[i]);
				model.setBkgNoSplit 	(bkg_no_split[i]);
				model.setChgCd			(chg_cd[i]);
				model.setBkgAgmtUtCd 	(bkg_agmt_ut_cd[i]);
				model.setCurrCd      	(curr_cd[i]);
				model.setSpclCgoCtnt    (spcl_cgo_ctnt[i]);
				model.setRoutTrfRt    	(rout_trf_rt[i]);
				model.setRoutTrfRto     (rout_trf_rto[i]);
				model.setCommProcStsRsn (comm_proc_sts_rsn[i]);
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
