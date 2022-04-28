/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : LEA_ACCL_ACT_CALC.java
*@FileTitle : Accrual Batch Result by Container
*Open Issues :
*Change history :
*@LastModifyDate : 2007-02-15
*@LastModifier : Park Yeon Jin
*@LastVersion : 1.0
* 2007-02-15 Park Yeon Jin
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
 * @author Park Yeon Jin
 * @since J2EE 1.4
 */
public final class LEA_ACCL_ACT_CALC implements java.io.Serializable {

	private String           ibflag           = "";
	private String           page_rows        = "";
	private String           rev_yrmon        = "";
	private String           bkg_no           = "";
	private String           bkg_no_split     = "";
	private String           cntr_tpsz_cd     = "";
	private String           cost_act_grp_cd  = "";
	private String           cost_act_grp_seq = "";
	private String           lgs_cost_cd      = "";
	private String           exe_yrmon        = "";
	private String           act_calc_seq     = "";
	private String           act_cost_tp_cd   = "";
	private String           gl_dt            = "";
	private String           inv_sys_id       = "";
	private String           if_seq           = "";
	private String           act_cost_amt     = "";
	private String           cre_dt           = "";
	private String           upd_dt           = "";

	public LEA_ACCL_ACT_CALC(){}

	public LEA_ACCL_ACT_CALC(
			String           ibflag          ,
			String           page_rows       ,
			String           rev_yrmon       ,
			String           bkg_no          ,
			String           bkg_no_split    ,
			String           cntr_tpsz_cd    ,
			String           cost_act_grp_cd ,
			String           cost_act_grp_seq,
			String           lgs_cost_cd     ,
			String           exe_yrmon       ,
			String           act_calc_seq    ,
			String           act_cost_tp_cd  ,
			String           gl_dt           ,
			String           inv_sys_id      ,
			String           if_seq          ,
			String           act_cost_amt    ,
			String           cre_dt          ,
			String           upd_dt          ){
		this.ibflag           = ibflag          ;
		this.page_rows        = page_rows       ;
		this.rev_yrmon        = rev_yrmon       ;
		this.bkg_no           = bkg_no          ;
		this.bkg_no_split     = bkg_no_split    ;
		this.cntr_tpsz_cd     = cntr_tpsz_cd    ;
		this.cost_act_grp_cd  = cost_act_grp_cd ;
		this.cost_act_grp_seq = cost_act_grp_seq;
		this.lgs_cost_cd      = lgs_cost_cd     ;
		this.exe_yrmon        = exe_yrmon       ;
		this.act_calc_seq     = act_calc_seq    ;
		this.act_cost_tp_cd   = act_cost_tp_cd  ;
		this.gl_dt            = gl_dt           ;
		this.inv_sys_id       = inv_sys_id      ;
		this.if_seq           = if_seq          ;
		this.act_cost_amt     = act_cost_amt    ;
		this.cre_dt           = cre_dt          ;
		this.upd_dt           = upd_dt          ;
	}

	// getter method is proceeding ..
	public String           getIbflag          (){	return ibflag          	;	}
	public String           getPage_rows       (){	return page_rows       	;	}
	public String           getRev_yrmon       (){	return rev_yrmon       	;	}
	public String           getBkg_no          (){	return bkg_no          	;	}
	public String           getBkg_no_split    (){	return bkg_no_split    	;	}
	public String           getCntr_tpsz_cd    (){	return cntr_tpsz_cd    	;	}
	public String           getCost_act_grp_cd (){	return cost_act_grp_cd 	;	}
	public String           getCost_act_grp_seq(){	return cost_act_grp_seq	;	}
	public String           getLgs_cost_cd     (){	return lgs_cost_cd     	;	}
	public String           getExe_yrmon       (){	return exe_yrmon       	;	}
	public String           getAct_calc_seq    (){	return act_calc_seq    	;	}
	public String           getAct_cost_tp_cd  (){	return act_cost_tp_cd  	;	}
	public String           getGl_dt           (){	return gl_dt           	;	}
	public String           getInv_sys_id      (){	return inv_sys_id      	;	}
	public String           getIf_seq          (){	return if_seq          	;	}
	public String           getAct_cost_amt    (){	return act_cost_amt    	;	}
	public String           getCre_dt          (){	return cre_dt          	;	}
	public String           getUpd_dt          (){	return upd_dt          	;	}

	// setter method is proceeding ..
	public void setIbflag          ( String           ibflag           ){	this.ibflag           = ibflag          	;	}
	public void setPage_rows       ( String           page_rows        ){	this.page_rows        = page_rows       	;	}
	public void setRev_yrmon       ( String           rev_yrmon        ){	this.rev_yrmon        = rev_yrmon       	;	}
	public void setBkg_no          ( String           bkg_no           ){	this.bkg_no           = bkg_no          	;	}
	public void setBkg_no_split    ( String           bkg_no_split     ){	this.bkg_no_split     = bkg_no_split    	;	}
	public void setCntr_tpsz_cd    ( String           cntr_tpsz_cd     ){	this.cntr_tpsz_cd     = cntr_tpsz_cd    	;	}
	public void setCost_act_grp_cd ( String           cost_act_grp_cd  ){	this.cost_act_grp_cd  = cost_act_grp_cd 	;	}
	public void setCost_act_grp_seq( String           cost_act_grp_seq ){	this.cost_act_grp_seq = cost_act_grp_seq	;	}
	public void setLgs_cost_cd     ( String           lgs_cost_cd      ){	this.lgs_cost_cd      = lgs_cost_cd     	;	}
	public void setExe_yrmon       ( String           exe_yrmon        ){	this.exe_yrmon        = exe_yrmon       	;	}
	public void setAct_calc_seq    ( String           act_calc_seq     ){	this.act_calc_seq     = act_calc_seq    	;	}
	public void setAct_cost_tp_cd  ( String           act_cost_tp_cd   ){	this.act_cost_tp_cd   = act_cost_tp_cd  	;	}
	public void setGl_dt           ( String           gl_dt            ){	this.gl_dt            = gl_dt           	;	}
	public void setInv_sys_id      ( String           inv_sys_id       ){	this.inv_sys_id       = inv_sys_id      	;	}
	public void setIf_seq          ( String           if_seq           ){	this.if_seq           = if_seq          	;	}
	public void setAct_cost_amt    ( String           act_cost_amt     ){	this.act_cost_amt     = act_cost_amt    	;	}
	public void setCre_dt          ( String           cre_dt           ){	this.cre_dt           = cre_dt          	;	}
	public void setUpd_dt          ( String           upd_dt           ){	this.upd_dt           = upd_dt          	;	}

	public static LEA_ACCL_ACT_CALC fromRequest(HttpServletRequest request) {
		LEA_ACCL_ACT_CALC model = new LEA_ACCL_ACT_CALC();
		try {
			model.setIbflag          	(JSPUtil.getParameter(request, "ibflag          		".trim(), ""));
			model.setPage_rows       	(JSPUtil.getParameter(request, "page_rows       		".trim(), ""));
			model.setRev_yrmon       	(JSPUtil.getParameter(request, "rev_yrmon       		".trim(), ""));
			model.setBkg_no          	(JSPUtil.getParameter(request, "bkg_no          		".trim(), ""));
			model.setBkg_no_split    	(JSPUtil.getParameter(request, "bkg_no_split    		".trim(), ""));
			model.setCntr_tpsz_cd    	(JSPUtil.getParameter(request, "cntr_tpsz_cd    		".trim(), ""));
			model.setCost_act_grp_cd 	(JSPUtil.getParameter(request, "cost_act_grp_cd 		".trim(), ""));
			model.setCost_act_grp_seq	(JSPUtil.getParameter(request, "cost_act_grp_seq		".trim(), ""));
			model.setLgs_cost_cd     	(JSPUtil.getParameter(request, "lgs_cost_cd     		".trim(), ""));
			model.setExe_yrmon       	(JSPUtil.getParameter(request, "exe_yrmon       		".trim(), ""));
			model.setAct_calc_seq    	(JSPUtil.getParameter(request, "act_calc_seq    		".trim(), ""));
			model.setAct_cost_tp_cd  	(JSPUtil.getParameter(request, "act_cost_tp_cd  		".trim(), ""));
			model.setGl_dt           	(JSPUtil.getParameter(request, "gl_dt           		".trim(), ""));
			model.setInv_sys_id      	(JSPUtil.getParameter(request, "inv_sys_id      		".trim(), ""));
			model.setIf_seq          	(JSPUtil.getParameter(request, "if_seq          		".trim(), ""));
			model.setAct_cost_amt    	(JSPUtil.getParameter(request, "act_cost_amt    		".trim(), ""));
			model.setCre_dt          	(JSPUtil.getParameter(request, "cre_dt          		".trim(), ""));
			model.setUpd_dt          	(JSPUtil.getParameter(request, "upd_dt          		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		LEA_ACCL_ACT_CALC model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag           =  (JSPUtil.getParameter(request, "ibflag          		".trim(), length));
			String[] page_rows        =  (JSPUtil.getParameter(request, "page_rows       		".trim(), length));
			String[] rev_yrmon        =  (JSPUtil.getParameter(request, "rev_yrmon       		".trim(), length));
			String[] bkg_no           =  (JSPUtil.getParameter(request, "bkg_no          		".trim(), length));
			String[] bkg_no_split     =  (JSPUtil.getParameter(request, "bkg_no_split    		".trim(), length));
			String[] cntr_tpsz_cd     =  (JSPUtil.getParameter(request, "cntr_tpsz_cd    		".trim(), length));
			String[] cost_act_grp_cd  =  (JSPUtil.getParameter(request, "cost_act_grp_cd 		".trim(), length));
			String[] cost_act_grp_seq =  (JSPUtil.getParameter(request, "cost_act_grp_seq		".trim(), length));
			String[] lgs_cost_cd      =  (JSPUtil.getParameter(request, "lgs_cost_cd     		".trim(), length));
			String[] exe_yrmon        =  (JSPUtil.getParameter(request, "exe_yrmon       		".trim(), length));
			String[] act_calc_seq     =  (JSPUtil.getParameter(request, "act_calc_seq    		".trim(), length));
			String[] act_cost_tp_cd   =  (JSPUtil.getParameter(request, "act_cost_tp_cd  		".trim(), length));
			String[] gl_dt            =  (JSPUtil.getParameter(request, "gl_dt           		".trim(), length));
			String[] inv_sys_id       =  (JSPUtil.getParameter(request, "inv_sys_id      		".trim(), length));
			String[] if_seq           =  (JSPUtil.getParameter(request, "if_seq          		".trim(), length));
			String[] act_cost_amt     =  (JSPUtil.getParameter(request, "act_cost_amt    		".trim(), length));
			String[] cre_dt           =  (JSPUtil.getParameter(request, "cre_dt          		".trim(), length));
			String[] upd_dt           =  (JSPUtil.getParameter(request, "upd_dt          		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new LEA_ACCL_ACT_CALC();
				model.setIbflag          		  (ibflag          	[i]);
				model.setPage_rows       		  (page_rows       	[i]);
				model.setRev_yrmon       		  (rev_yrmon       	[i]);
				model.setBkg_no          		  (bkg_no          	[i]);
				model.setBkg_no_split    		  (bkg_no_split    	[i]);
				model.setCntr_tpsz_cd    		  (cntr_tpsz_cd    	[i]);
				model.setCost_act_grp_cd 		  (cost_act_grp_cd 	[i]);
				model.setCost_act_grp_seq		  (cost_act_grp_seq	[i]);
				model.setLgs_cost_cd     		  (lgs_cost_cd     	[i]);
				model.setExe_yrmon       		  (exe_yrmon       	[i]);
				model.setAct_calc_seq    		  (act_calc_seq    	[i]);
				model.setAct_cost_tp_cd  		  (act_cost_tp_cd  	[i]);
				model.setGl_dt           		  (gl_dt           	[i]);
				model.setInv_sys_id      		  (inv_sys_id      	[i]);
				model.setIf_seq          		  (if_seq          	[i]);
				model.setAct_cost_amt    		  (act_cost_amt    	[i]);
				model.setCre_dt          		  (cre_dt          	[i]);
				model.setUpd_dt          		  (upd_dt          	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		LEA_ACCL_ACT_CALC model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag           =  (JSPUtil.getParameter(request, prefix + "ibflag          		".trim(), length));
			String[] page_rows        =  (JSPUtil.getParameter(request, prefix + "page_rows       		".trim(), length));
			String[] rev_yrmon        =  (JSPUtil.getParameter(request, prefix + "rev_yrmon       		".trim(), length));
			String[] bkg_no           =  (JSPUtil.getParameter(request, prefix + "bkg_no          		".trim(), length));
			String[] bkg_no_split     =  (JSPUtil.getParameter(request, prefix + "bkg_no_split    		".trim(), length));
			String[] cntr_tpsz_cd     =  (JSPUtil.getParameter(request, prefix + "cntr_tpsz_cd    		".trim(), length));
			String[] cost_act_grp_cd  =  (JSPUtil.getParameter(request, prefix + "cost_act_grp_cd 		".trim(), length));
			String[] cost_act_grp_seq =  (JSPUtil.getParameter(request, prefix + "cost_act_grp_seq		".trim(), length));
			String[] lgs_cost_cd      =  (JSPUtil.getParameter(request, prefix + "lgs_cost_cd     		".trim(), length));
			String[] exe_yrmon        =  (JSPUtil.getParameter(request, prefix + "exe_yrmon       		".trim(), length));
			String[] act_calc_seq     =  (JSPUtil.getParameter(request, prefix + "act_calc_seq    		".trim(), length));
			String[] act_cost_tp_cd   =  (JSPUtil.getParameter(request, prefix + "act_cost_tp_cd  		".trim(), length));
			String[] gl_dt            =  (JSPUtil.getParameter(request, prefix + "gl_dt           		".trim(), length));
			String[] inv_sys_id       =  (JSPUtil.getParameter(request, prefix + "inv_sys_id      		".trim(), length));
			String[] if_seq           =  (JSPUtil.getParameter(request, prefix + "if_seq          		".trim(), length));
			String[] act_cost_amt     =  (JSPUtil.getParameter(request, prefix + "act_cost_amt    		".trim(), length));
			String[] cre_dt           =  (JSPUtil.getParameter(request, prefix + "cre_dt          		".trim(), length));
			String[] upd_dt           =  (JSPUtil.getParameter(request, prefix + "upd_dt          		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new LEA_ACCL_ACT_CALC();
				model.setIbflag          		  ( ibflag          	[i]);
				model.setPage_rows       		  ( page_rows       	[i]);
				model.setRev_yrmon       		  ( rev_yrmon       	[i]);
				model.setBkg_no          		  ( bkg_no          	[i]);
				model.setBkg_no_split    		  ( bkg_no_split    	[i]);
				model.setCntr_tpsz_cd    		  ( cntr_tpsz_cd    	[i]);
				model.setCost_act_grp_cd 		  ( cost_act_grp_cd 	[i]);
				model.setCost_act_grp_seq		  ( cost_act_grp_seq	[i]);
				model.setLgs_cost_cd     		  ( lgs_cost_cd     	[i]);
				model.setExe_yrmon       		  ( exe_yrmon       	[i]);
				model.setAct_calc_seq    		  ( act_calc_seq    	[i]);
				model.setAct_cost_tp_cd  		  ( act_cost_tp_cd  	[i]);
				model.setGl_dt           		  ( gl_dt           	[i]);
				model.setInv_sys_id      		  ( inv_sys_id      	[i]);
				model.setIf_seq          		  ( if_seq          	[i]);
				model.setAct_cost_amt    		  ( act_cost_amt    	[i]);
				model.setCre_dt          		  ( cre_dt          	[i]);
				model.setUpd_dt          		  ( upd_dt          	[i]);
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
