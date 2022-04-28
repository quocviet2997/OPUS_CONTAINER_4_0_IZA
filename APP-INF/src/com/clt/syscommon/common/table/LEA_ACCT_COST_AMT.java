/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : LEA_ACCT_COST_AMT.java
*@FileTitle : Accrual Batch Result by Account Code (Tab1)
*Open Issues :
*Change history :
*@LastModifyDate : 2007-02-13
*@LastModifier : Park Yeon Jin
*@LastVersion : 1.0
* 2007-02-13 Park Yeon Jin
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
public final class LEA_ACCT_COST_AMT implements java.io.Serializable {

	private String           ibflag           = "";
	private String           page_rows        = "";
	private String           exe_yrmon        = "";
	private String           rev_yrmon        = "";
	private String           rep_acct_cd      = "";
	private String           estm_cost_amt    = "";
	private String           pre_act_cost_amt = "";
	private String           pst_act_cost_amt = "";
	private String           accl_cost_amt    = "";
	private String           acct_mnl_flg     = "";
	private String           cre_usr_id       = "";
	private String           cre_dt           = "";
	private String           upd_usr_id       = "";
	private String           upd_dt           = "";

	public LEA_ACCT_COST_AMT(){}

	public LEA_ACCT_COST_AMT(
			String           ibflag          ,
			String           page_rows       ,
			String           exe_yrmon       ,
			String           rev_yrmon       ,
			String           rep_acct_cd     ,
			String           estm_cost_amt   ,
			String           pre_act_cost_amt,
			String           pst_act_cost_amt,
			String           accl_cost_amt   ,
			String           acct_mnl_flg    ,
			String           cre_usr_id      ,
			String           cre_dt          ,
			String           upd_usr_id      ,
			String           upd_dt          ){
		this.ibflag           = ibflag          ;
		this.page_rows        = page_rows       ;
		this.exe_yrmon        = exe_yrmon       ;
		this.rev_yrmon        = rev_yrmon       ;
		this.rep_acct_cd      = rep_acct_cd     ;
		this.estm_cost_amt    = estm_cost_amt   ;
		this.pre_act_cost_amt = pre_act_cost_amt;
		this.pst_act_cost_amt = pst_act_cost_amt;
		this.accl_cost_amt    = accl_cost_amt   ;
		this.acct_mnl_flg     = acct_mnl_flg    ;
		this.cre_usr_id       = cre_usr_id      ;
		this.cre_dt           = cre_dt          ;
		this.upd_usr_id       = upd_usr_id      ;
		this.upd_dt           = upd_dt          ;
	}

	// getter method is proceeding ..
	public String           getIbflag          (){	return ibflag          	;	}
	public String           getPage_rows       (){	return page_rows       	;	}
	public String           getExe_yrmon       (){	return exe_yrmon       	;	}
	public String           getRev_yrmon       (){	return rev_yrmon       	;	}
	public String           getRep_acct_cd     (){	return rep_acct_cd     	;	}
	public String           getEstm_cost_amt   (){	return estm_cost_amt   	;	}
	public String           getPre_act_cost_amt(){	return pre_act_cost_amt	;	}
	public String           getPst_act_cost_amt(){	return pst_act_cost_amt	;	}
	public String           getAccl_cost_amt   (){	return accl_cost_amt   	;	}
	public String           getAcct_mnl_flg    (){	return acct_mnl_flg    	;	}
	public String           getCre_usr_id      (){	return cre_usr_id      	;	}
	public String           getCre_dt          (){	return cre_dt          	;	}
	public String           getUpd_usr_id      (){	return upd_usr_id      	;	}
	public String           getUpd_dt          (){	return upd_dt          	;	}

	// setter method is proceeding ..
	public void setIbflag          ( String           ibflag           ){	this.ibflag           = ibflag          	;	}
	public void setPage_rows       ( String           page_rows        ){	this.page_rows        = page_rows       	;	}
	public void setExe_yrmon       ( String           exe_yrmon        ){	this.exe_yrmon        = exe_yrmon       	;	}
	public void setRev_yrmon       ( String           rev_yrmon        ){	this.rev_yrmon        = rev_yrmon       	;	}
	public void setRep_acct_cd     ( String           rep_acct_cd      ){	this.rep_acct_cd      = rep_acct_cd     	;	}
	public void setEstm_cost_amt   ( String           estm_cost_amt    ){	this.estm_cost_amt    = estm_cost_amt   	;	}
	public void setPre_act_cost_amt( String           pre_act_cost_amt ){	this.pre_act_cost_amt = pre_act_cost_amt	;	}
	public void setPst_act_cost_amt( String           pst_act_cost_amt ){	this.pst_act_cost_amt = pst_act_cost_amt	;	}
	public void setAccl_cost_amt   ( String           accl_cost_amt    ){	this.accl_cost_amt    = accl_cost_amt   	;	}
	public void setAcct_mnl_flg    ( String           acct_mnl_flg     ){	this.acct_mnl_flg     = acct_mnl_flg    	;	}
	public void setCre_usr_id      ( String           cre_usr_id       ){	this.cre_usr_id       = cre_usr_id      	;	}
	public void setCre_dt          ( String           cre_dt           ){	this.cre_dt           = cre_dt          	;	}
	public void setUpd_usr_id      ( String           upd_usr_id       ){	this.upd_usr_id       = upd_usr_id      	;	}
	public void setUpd_dt          ( String           upd_dt           ){	this.upd_dt           = upd_dt          	;	}

	public static LEA_ACCT_COST_AMT fromRequest(HttpServletRequest request) {
		LEA_ACCT_COST_AMT model = new LEA_ACCT_COST_AMT();
		try {
			model.setIbflag          	(JSPUtil.getParameter(request, "ibflag          		".trim(), ""));
			model.setPage_rows       	(JSPUtil.getParameter(request, "page_rows       		".trim(), ""));
			model.setExe_yrmon       	(JSPUtil.getParameter(request, "exe_yrmon       		".trim(), ""));
			model.setRev_yrmon       	(JSPUtil.getParameter(request, "rev_yrmon       		".trim(), ""));
			model.setRep_acct_cd     	(JSPUtil.getParameter(request, "rep_acct_cd     		".trim(), ""));
			model.setEstm_cost_amt   	(JSPUtil.getParameter(request, "estm_cost_amt   		".trim(), ""));
			model.setPre_act_cost_amt	(JSPUtil.getParameter(request, "pre_act_cost_amt		".trim(), ""));
			model.setPst_act_cost_amt	(JSPUtil.getParameter(request, "pst_act_cost_amt		".trim(), ""));
			model.setAccl_cost_amt   	(JSPUtil.getParameter(request, "accl_cost_amt   		".trim(), ""));
			model.setAcct_mnl_flg    	(JSPUtil.getParameter(request, "acct_mnl_flg    		".trim(), ""));
			model.setCre_usr_id      	(JSPUtil.getParameter(request, "cre_usr_id      		".trim(), ""));
			model.setCre_dt          	(JSPUtil.getParameter(request, "cre_dt          		".trim(), ""));
			model.setUpd_usr_id      	(JSPUtil.getParameter(request, "upd_usr_id      		".trim(), ""));
			model.setUpd_dt          	(JSPUtil.getParameter(request, "upd_dt          		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		LEA_ACCT_COST_AMT model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag           =  (JSPUtil.getParameter(request, "ibflag          		".trim(), length));
			String[] page_rows        =  (JSPUtil.getParameter(request, "page_rows       		".trim(), length));
			String[] exe_yrmon        =  (JSPUtil.getParameter(request, "exe_yrmon       		".trim(), length));
			String[] rev_yrmon        =  (JSPUtil.getParameter(request, "rev_yrmon       		".trim(), length));
			String[] rep_acct_cd      =  (JSPUtil.getParameter(request, "rep_acct_cd     		".trim(), length));
			String[] estm_cost_amt    =  (JSPUtil.getParameter(request, "estm_cost_amt   		".trim(), length));
			String[] pre_act_cost_amt =  (JSPUtil.getParameter(request, "pre_act_cost_amt		".trim(), length));
			String[] pst_act_cost_amt =  (JSPUtil.getParameter(request, "pst_act_cost_amt		".trim(), length));
			String[] accl_cost_amt    =  (JSPUtil.getParameter(request, "accl_cost_amt   		".trim(), length));
			String[] acct_mnl_flg     =  (JSPUtil.getParameter(request, "acct_mnl_flg    		".trim(), length));
			String[] cre_usr_id       =  (JSPUtil.getParameter(request, "cre_usr_id      		".trim(), length));
			String[] cre_dt           =  (JSPUtil.getParameter(request, "cre_dt          		".trim(), length));
			String[] upd_usr_id       =  (JSPUtil.getParameter(request, "upd_usr_id      		".trim(), length));
			String[] upd_dt           =  (JSPUtil.getParameter(request, "upd_dt          		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new LEA_ACCT_COST_AMT();
				model.setIbflag          		  (ibflag          	[i]);
				model.setPage_rows       		  (page_rows       	[i]);
				model.setExe_yrmon       		  (exe_yrmon       	[i]);
				model.setRev_yrmon       		  (rev_yrmon       	[i]);
				model.setRep_acct_cd     		  (rep_acct_cd     	[i]);
				model.setEstm_cost_amt   		  (estm_cost_amt   	[i]);
				model.setPre_act_cost_amt		  (pre_act_cost_amt	[i]);
				model.setPst_act_cost_amt		  (pst_act_cost_amt	[i]);
				model.setAccl_cost_amt   		  (accl_cost_amt   	[i]);
				model.setAcct_mnl_flg    		  (acct_mnl_flg    	[i]);
				model.setCre_usr_id      		  (cre_usr_id      	[i]);
				model.setCre_dt          		  (cre_dt          	[i]);
				model.setUpd_usr_id      		  (upd_usr_id      	[i]);
				model.setUpd_dt          		  (upd_dt          	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		LEA_ACCT_COST_AMT model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag           =  (JSPUtil.getParameter(request, prefix + "ibflag          		".trim(), length));
			String[] page_rows        =  (JSPUtil.getParameter(request, prefix + "page_rows       		".trim(), length));
			String[] exe_yrmon        =  (JSPUtil.getParameter(request, prefix + "exe_yrmon       		".trim(), length));
			String[] rev_yrmon        =  (JSPUtil.getParameter(request, prefix + "rev_yrmon       		".trim(), length));
			String[] rep_acct_cd      =  (JSPUtil.getParameter(request, prefix + "rep_acct_cd     		".trim(), length));
			String[] estm_cost_amt    =  (JSPUtil.getParameter(request, prefix + "estm_cost_amt   		".trim(), length));
			String[] pre_act_cost_amt =  (JSPUtil.getParameter(request, prefix + "pre_act_cost_amt		".trim(), length));
			String[] pst_act_cost_amt =  (JSPUtil.getParameter(request, prefix + "pst_act_cost_amt		".trim(), length));
			String[] accl_cost_amt    =  (JSPUtil.getParameter(request, prefix + "accl_cost_amt   		".trim(), length));
			String[] acct_mnl_flg     =  (JSPUtil.getParameter(request, prefix + "acct_mnl_flg    		".trim(), length));
			String[] cre_usr_id       =  (JSPUtil.getParameter(request, prefix + "cre_usr_id      		".trim(), length));
			String[] cre_dt           =  (JSPUtil.getParameter(request, prefix + "cre_dt          		".trim(), length));
			String[] upd_usr_id       =  (JSPUtil.getParameter(request, prefix + "upd_usr_id      		".trim(), length));
			String[] upd_dt           =  (JSPUtil.getParameter(request, prefix + "upd_dt          		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new LEA_ACCT_COST_AMT();
				model.setIbflag          		  ( ibflag          	[i]);
				model.setPage_rows       		  ( page_rows       	[i]);
				model.setExe_yrmon       		  ( exe_yrmon       	[i]);
				model.setRev_yrmon       		  ( rev_yrmon       	[i]);
				model.setRep_acct_cd     		  ( rep_acct_cd     	[i]);
				model.setEstm_cost_amt   		  ( estm_cost_amt   	[i]);
				model.setPre_act_cost_amt		  ( pre_act_cost_amt	[i]);
				model.setPst_act_cost_amt		  ( pst_act_cost_amt	[i]);
				model.setAccl_cost_amt   		  ( accl_cost_amt   	[i]);
				model.setAcct_mnl_flg    		  ( acct_mnl_flg    	[i]);
				model.setCre_usr_id      		  ( cre_usr_id      	[i]);
				model.setCre_dt          		  ( cre_dt          	[i]);
				model.setUpd_usr_id      		  ( upd_usr_id      	[i]);
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
