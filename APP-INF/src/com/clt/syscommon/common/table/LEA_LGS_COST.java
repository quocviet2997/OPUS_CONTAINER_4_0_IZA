/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : LEA_LGS_COST.java
*@FileTitle : Cost Code Inquiry
*Open Issues :
*Change history :
*@LastModifyDate : 2007-03-07
*@LastModifier : Park Yeon Jin
*@LastVersion : 1.0
* 2007-03-07 Park Yeon Jin
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
public final class LEA_LGS_COST implements java.io.Serializable {

	private String               ibflag               = "";
	private String               page_rows            = "";
	private String               lgs_cost_cd          = "";
	private String               lgs_cost_full_nm     = "";
	private String               lgs_cost_abbr_nm     = "";
	private String               sub_cost_tp_cd       = "";
	private String               rep_acct_cd          = "";
	private String               acct_cd              = "";
	private String               acct_cd_nm           = "";
	private String               accl_auto_cd         = "";
	private String               otr_crr_rep_acct_cd  = "";
	private String               otr_crr_acct_cd      = "";
	private String               otr_crr_acct_nm      = "";
	private String               otr_crr_accl_auto_cd = "";
	private String               accl_flg             = "";
	private String               accl_lgc_tp_cd       = "";
	private String               estm_cost_flg        = "";
	private String               cost_src_sys_cd      = "";
	private String               oput_seq             = "";
	private String               lgs_cost_rmk         = "";
	private String               delt_flg             = "";
	private String               cre_dt               = "";
	private String               upd_dt               = "";

	public LEA_LGS_COST(){}

	public LEA_LGS_COST(
			String               ibflag              ,
			String               page_rows           ,
			String               lgs_cost_cd         ,
			String               lgs_cost_full_nm    ,
			String               lgs_cost_abbr_nm    ,
			String               sub_cost_tp_cd      ,
			String               rep_acct_cd         ,
			String               acct_cd             ,
			String               acct_cd_nm          ,
			String               accl_auto_cd        ,
			String               otr_crr_rep_acct_cd ,
			String               otr_crr_acct_cd     ,
			String               otr_crr_acct_nm     ,
			String               otr_crr_accl_auto_cd,
			String               accl_flg            ,
			String               accl_lgc_tp_cd      ,
			String               estm_cost_flg       ,
			String               cost_src_sys_cd     ,
			String               oput_seq            ,
			String               lgs_cost_rmk        ,
			String               delt_flg            ,
			String               cre_dt              ,
			String               upd_dt              ){
		this.ibflag               = ibflag              ;
		this.page_rows            = page_rows           ;
		this.lgs_cost_cd          = lgs_cost_cd         ;
		this.lgs_cost_full_nm     = lgs_cost_full_nm    ;
		this.lgs_cost_abbr_nm     = lgs_cost_abbr_nm    ;
		this.sub_cost_tp_cd       = sub_cost_tp_cd      ;
		this.rep_acct_cd          = rep_acct_cd         ;
		this.acct_cd              = acct_cd             ;
		this.acct_cd_nm           = acct_cd_nm          ;
		this.accl_auto_cd         = accl_auto_cd        ;
		this.otr_crr_rep_acct_cd  = otr_crr_rep_acct_cd ;
		this.otr_crr_acct_cd      = otr_crr_acct_cd     ;
		this.otr_crr_acct_nm      = otr_crr_acct_nm     ;
		this.otr_crr_accl_auto_cd = otr_crr_accl_auto_cd;
		this.accl_flg             = accl_flg            ;
		this.accl_lgc_tp_cd       = accl_lgc_tp_cd      ;
		this.estm_cost_flg        = estm_cost_flg       ;
		this.cost_src_sys_cd      = cost_src_sys_cd     ;
		this.oput_seq             = oput_seq            ;
		this.lgs_cost_rmk         = lgs_cost_rmk        ;
		this.delt_flg             = delt_flg            ;
		this.cre_dt               = cre_dt              ;
		this.upd_dt               = upd_dt              ;
	}

	// getter method is proceeding ..
	public String               getIbflag              (){	return ibflag              	;	}
	public String               getPage_rows           (){	return page_rows           	;	}
	public String               getLgs_cost_cd         (){	return lgs_cost_cd         	;	}
	public String               getLgs_cost_full_nm    (){	return lgs_cost_full_nm    	;	}
	public String               getLgs_cost_abbr_nm    (){	return lgs_cost_abbr_nm    	;	}
	public String               getSub_cost_tp_cd      (){	return sub_cost_tp_cd      	;	}
	public String               getRep_acct_cd         (){	return rep_acct_cd         	;	}
	public String               getAcct_cd             (){	return acct_cd             	;	}
	public String               getAcct_cd_nm          (){	return acct_cd_nm          	;	}
	public String               getAccl_auto_cd        (){	return accl_auto_cd        	;	}
	public String               getOtr_crr_rep_acct_cd (){	return otr_crr_rep_acct_cd 	;	}
	public String               getOtr_crr_acct_cd     (){	return otr_crr_acct_cd     	;	}
	public String               getOtr_crr_acct_nm     (){	return otr_crr_acct_nm     	;	}
	public String               getOtr_crr_accl_auto_cd(){	return otr_crr_accl_auto_cd	;	}
	public String               getAccl_flg            (){	return accl_flg            	;	}
	public String               getAccl_lgc_tp_cd      (){	return accl_lgc_tp_cd      	;	}
	public String               getEstm_cost_flg       (){	return estm_cost_flg       	;	}
	public String               getCost_src_sys_cd     (){	return cost_src_sys_cd     	;	}
	public String               getOput_seq            (){	return oput_seq            	;	}
	public String               getLgs_cost_rmk        (){	return lgs_cost_rmk        	;	}
	public String               getDelt_flg            (){	return delt_flg            	;	}
	public String               getCre_dt              (){	return cre_dt              	;	}
	public String               getUpd_dt              (){	return upd_dt              	;	}

	// setter method is proceeding ..
	public void setIbflag              ( String               ibflag               ){	this.ibflag               = ibflag              	;	}
	public void setPage_rows           ( String               page_rows            ){	this.page_rows            = page_rows           	;	}
	public void setLgs_cost_cd         ( String               lgs_cost_cd          ){	this.lgs_cost_cd          = lgs_cost_cd         	;	}
	public void setLgs_cost_full_nm    ( String               lgs_cost_full_nm     ){	this.lgs_cost_full_nm     = lgs_cost_full_nm    	;	}
	public void setLgs_cost_abbr_nm    ( String               lgs_cost_abbr_nm     ){	this.lgs_cost_abbr_nm     = lgs_cost_abbr_nm    	;	}
	public void setSub_cost_tp_cd      ( String               sub_cost_tp_cd       ){	this.sub_cost_tp_cd       = sub_cost_tp_cd      	;	}
	public void setRep_acct_cd         ( String               rep_acct_cd          ){	this.rep_acct_cd          = rep_acct_cd         	;	}
	public void setAcct_cd             ( String               acct_cd              ){	this.acct_cd              = acct_cd             	;	}
	public void setAcct_cd_nm          ( String               acct_cd_nm           ){	this.acct_cd_nm           = acct_cd_nm          	;	}
	public void setAccl_auto_cd        ( String               accl_auto_cd         ){	this.accl_auto_cd         = accl_auto_cd        	;	}
	public void setOtr_crr_rep_acct_cd ( String               otr_crr_rep_acct_cd  ){	this.otr_crr_rep_acct_cd  = otr_crr_rep_acct_cd 	;	}
	public void setOtr_crr_acct_cd     ( String               otr_crr_acct_cd      ){	this.otr_crr_acct_cd      = otr_crr_acct_cd     	;	}
	public void setOtr_crr_acct_nm     ( String               otr_crr_acct_nm      ){	this.otr_crr_acct_nm      = otr_crr_acct_nm     	;	}
	public void setOtr_crr_accl_auto_cd( String               otr_crr_accl_auto_cd ){	this.otr_crr_accl_auto_cd = otr_crr_accl_auto_cd	;	}
	public void setAccl_flg            ( String               accl_flg             ){	this.accl_flg             = accl_flg            	;	}
	public void setAccl_lgc_tp_cd      ( String               accl_lgc_tp_cd       ){	this.accl_lgc_tp_cd       = accl_lgc_tp_cd      	;	}
	public void setEstm_cost_flg       ( String               estm_cost_flg        ){	this.estm_cost_flg        = estm_cost_flg       	;	}
	public void setCost_src_sys_cd     ( String               cost_src_sys_cd      ){	this.cost_src_sys_cd      = cost_src_sys_cd     	;	}
	public void setOput_seq            ( String               oput_seq             ){	this.oput_seq             = oput_seq            	;	}
	public void setLgs_cost_rmk        ( String               lgs_cost_rmk         ){	this.lgs_cost_rmk         = lgs_cost_rmk        	;	}
	public void setDelt_flg            ( String               delt_flg             ){	this.delt_flg             = delt_flg            	;	}
	public void setCre_dt              ( String               cre_dt               ){	this.cre_dt               = cre_dt              	;	}
	public void setUpd_dt              ( String               upd_dt               ){	this.upd_dt               = upd_dt              	;	}

	public static LEA_LGS_COST fromRequest(HttpServletRequest request) {
		LEA_LGS_COST model = new LEA_LGS_COST();
		try {
			model.setIbflag              	(JSPUtil.getParameter(request, "ibflag              		".trim(), ""));
			model.setPage_rows           	(JSPUtil.getParameter(request, "page_rows           		".trim(), ""));
			model.setLgs_cost_cd         	(JSPUtil.getParameter(request, "lgs_cost_cd         		".trim(), ""));
			model.setLgs_cost_full_nm    	(JSPUtil.getParameter(request, "lgs_cost_full_nm    		".trim(), ""));
			model.setLgs_cost_abbr_nm    	(JSPUtil.getParameter(request, "lgs_cost_abbr_nm    		".trim(), ""));
			model.setSub_cost_tp_cd      	(JSPUtil.getParameter(request, "sub_cost_tp_cd      		".trim(), ""));
			model.setRep_acct_cd         	(JSPUtil.getParameter(request, "rep_acct_cd         		".trim(), ""));
			model.setAcct_cd             	(JSPUtil.getParameter(request, "acct_cd             		".trim(), ""));
			model.setAcct_cd_nm          	(JSPUtil.getParameter(request, "acct_cd_nm          		".trim(), ""));
			model.setAccl_auto_cd        	(JSPUtil.getParameter(request, "accl_auto_cd        		".trim(), ""));
			model.setOtr_crr_rep_acct_cd 	(JSPUtil.getParameter(request, "otr_crr_rep_acct_cd 		".trim(), ""));
			model.setOtr_crr_acct_cd     	(JSPUtil.getParameter(request, "otr_crr_acct_cd     		".trim(), ""));
			model.setOtr_crr_acct_nm     	(JSPUtil.getParameter(request, "otr_crr_acct_nm     		".trim(), ""));
			model.setOtr_crr_accl_auto_cd	(JSPUtil.getParameter(request, "otr_crr_accl_auto_cd		".trim(), ""));
			model.setAccl_flg            	(JSPUtil.getParameter(request, "accl_flg            		".trim(), ""));
			model.setAccl_lgc_tp_cd      	(JSPUtil.getParameter(request, "accl_lgc_tp_cd      		".trim(), ""));
			model.setEstm_cost_flg       	(JSPUtil.getParameter(request, "estm_cost_flg       		".trim(), ""));
			model.setCost_src_sys_cd     	(JSPUtil.getParameter(request, "cost_src_sys_cd     		".trim(), ""));
			model.setOput_seq            	(JSPUtil.getParameter(request, "oput_seq            		".trim(), ""));
			model.setLgs_cost_rmk        	(JSPUtil.getParameter(request, "lgs_cost_rmk        		".trim(), ""));
			model.setDelt_flg            	(JSPUtil.getParameter(request, "delt_flg            		".trim(), ""));
			model.setCre_dt              	(JSPUtil.getParameter(request, "cre_dt              		".trim(), ""));
			model.setUpd_dt              	(JSPUtil.getParameter(request, "upd_dt              		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		LEA_LGS_COST model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag               =  (JSPUtil.getParameter(request, "ibflag              		".trim(), length));
			String[] page_rows            =  (JSPUtil.getParameter(request, "page_rows           		".trim(), length));
			String[] lgs_cost_cd          =  (JSPUtil.getParameter(request, "lgs_cost_cd         		".trim(), length));
			String[] lgs_cost_full_nm     =  (JSPUtil.getParameter(request, "lgs_cost_full_nm    		".trim(), length));
			String[] lgs_cost_abbr_nm     =  (JSPUtil.getParameter(request, "lgs_cost_abbr_nm    		".trim(), length));
			String[] sub_cost_tp_cd       =  (JSPUtil.getParameter(request, "sub_cost_tp_cd      		".trim(), length));
			String[] rep_acct_cd          =  (JSPUtil.getParameter(request, "rep_acct_cd         		".trim(), length));
			String[] acct_cd              =  (JSPUtil.getParameter(request, "acct_cd             		".trim(), length));
			String[] acct_cd_nm           =  (JSPUtil.getParameter(request, "acct_cd_nm          		".trim(), length));
			String[] accl_auto_cd         =  (JSPUtil.getParameter(request, "accl_auto_cd        		".trim(), length));
			String[] otr_crr_rep_acct_cd  =  (JSPUtil.getParameter(request, "otr_crr_rep_acct_cd 		".trim(), length));
			String[] otr_crr_acct_cd      =  (JSPUtil.getParameter(request, "otr_crr_acct_cd     		".trim(), length));
			String[] otr_crr_acct_nm      =  (JSPUtil.getParameter(request, "otr_crr_acct_nm     		".trim(), length));
			String[] otr_crr_accl_auto_cd =  (JSPUtil.getParameter(request, "otr_crr_accl_auto_cd		".trim(), length));
			String[] accl_flg             =  (JSPUtil.getParameter(request, "accl_flg            		".trim(), length));
			String[] accl_lgc_tp_cd       =  (JSPUtil.getParameter(request, "accl_lgc_tp_cd      		".trim(), length));
			String[] estm_cost_flg        =  (JSPUtil.getParameter(request, "estm_cost_flg       		".trim(), length));
			String[] cost_src_sys_cd      =  (JSPUtil.getParameter(request, "cost_src_sys_cd     		".trim(), length));
			String[] oput_seq             =  (JSPUtil.getParameter(request, "oput_seq            		".trim(), length));
			String[] lgs_cost_rmk         =  (JSPUtil.getParameter(request, "lgs_cost_rmk        		".trim(), length));
			String[] delt_flg             =  (JSPUtil.getParameter(request, "delt_flg            		".trim(), length));
			String[] cre_dt               =  (JSPUtil.getParameter(request, "cre_dt              		".trim(), length));
			String[] upd_dt               =  (JSPUtil.getParameter(request, "upd_dt              		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new LEA_LGS_COST();
				model.setIbflag              		  (ibflag              	[i]);
				model.setPage_rows           		  (page_rows           	[i]);
				model.setLgs_cost_cd         		  (lgs_cost_cd         	[i]);
				model.setLgs_cost_full_nm    		  (lgs_cost_full_nm    	[i]);
				model.setLgs_cost_abbr_nm    		  (lgs_cost_abbr_nm    	[i]);
				model.setSub_cost_tp_cd      		  (sub_cost_tp_cd      	[i]);
				model.setRep_acct_cd         		  (rep_acct_cd         	[i]);
				model.setAcct_cd             		  (acct_cd             	[i]);
				model.setAcct_cd_nm          		  (acct_cd_nm          	[i]);
				model.setAccl_auto_cd        		  (accl_auto_cd        	[i]);
				model.setOtr_crr_rep_acct_cd 		  (otr_crr_rep_acct_cd 	[i]);
				model.setOtr_crr_acct_cd     		  (otr_crr_acct_cd     	[i]);
				model.setOtr_crr_acct_nm     		  (otr_crr_acct_nm     	[i]);
				model.setOtr_crr_accl_auto_cd		  (otr_crr_accl_auto_cd	[i]);
				model.setAccl_flg            		  (accl_flg            	[i]);
				model.setAccl_lgc_tp_cd      		  (accl_lgc_tp_cd      	[i]);
				model.setEstm_cost_flg       		  (estm_cost_flg       	[i]);
				model.setCost_src_sys_cd     		  (cost_src_sys_cd     	[i]);
				model.setOput_seq            		  (oput_seq            	[i]);
				model.setLgs_cost_rmk        		  (lgs_cost_rmk        	[i]);
				model.setDelt_flg            		  (delt_flg            	[i]);
				model.setCre_dt              		  (cre_dt              	[i]);
				model.setUpd_dt              		  (upd_dt              	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		LEA_LGS_COST model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag               =  (JSPUtil.getParameter(request, prefix + "ibflag              		".trim(), length));
			String[] page_rows            =  (JSPUtil.getParameter(request, prefix + "page_rows           		".trim(), length));
			String[] lgs_cost_cd          =  (JSPUtil.getParameter(request, prefix + "lgs_cost_cd         		".trim(), length));
			String[] lgs_cost_full_nm     =  (JSPUtil.getParameter(request, prefix + "lgs_cost_full_nm    		".trim(), length));
			String[] lgs_cost_abbr_nm     =  (JSPUtil.getParameter(request, prefix + "lgs_cost_abbr_nm    		".trim(), length));
			String[] sub_cost_tp_cd       =  (JSPUtil.getParameter(request, prefix + "sub_cost_tp_cd      		".trim(), length));
			String[] rep_acct_cd          =  (JSPUtil.getParameter(request, prefix + "rep_acct_cd         		".trim(), length));
			String[] acct_cd              =  (JSPUtil.getParameter(request, prefix + "acct_cd             		".trim(), length));
			String[] acct_cd_nm           =  (JSPUtil.getParameter(request, prefix + "acct_cd_nm          		".trim(), length));
			String[] accl_auto_cd         =  (JSPUtil.getParameter(request, prefix + "accl_auto_cd        		".trim(), length));
			String[] otr_crr_rep_acct_cd  =  (JSPUtil.getParameter(request, prefix + "otr_crr_rep_acct_cd 		".trim(), length));
			String[] otr_crr_acct_cd      =  (JSPUtil.getParameter(request, prefix + "otr_crr_acct_cd     		".trim(), length));
			String[] otr_crr_acct_nm      =  (JSPUtil.getParameter(request, prefix + "otr_crr_acct_nm     		".trim(), length));
			String[] otr_crr_accl_auto_cd =  (JSPUtil.getParameter(request, prefix + "otr_crr_accl_auto_cd		".trim(), length));
			String[] accl_flg             =  (JSPUtil.getParameter(request, prefix + "accl_flg            		".trim(), length));
			String[] accl_lgc_tp_cd       =  (JSPUtil.getParameter(request, prefix + "accl_lgc_tp_cd      		".trim(), length));
			String[] estm_cost_flg        =  (JSPUtil.getParameter(request, prefix + "estm_cost_flg       		".trim(), length));
			String[] cost_src_sys_cd      =  (JSPUtil.getParameter(request, prefix + "cost_src_sys_cd     		".trim(), length));
			String[] oput_seq             =  (JSPUtil.getParameter(request, prefix + "oput_seq            		".trim(), length));
			String[] lgs_cost_rmk         =  (JSPUtil.getParameter(request, prefix + "lgs_cost_rmk        		".trim(), length));
			String[] delt_flg             =  (JSPUtil.getParameter(request, prefix + "delt_flg            		".trim(), length));
			String[] cre_dt               =  (JSPUtil.getParameter(request, prefix + "cre_dt              		".trim(), length));
			String[] upd_dt               =  (JSPUtil.getParameter(request, prefix + "upd_dt              		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new LEA_LGS_COST();
				model.setIbflag              		  ( ibflag              	[i]);
				model.setPage_rows           		  ( page_rows           	[i]);
				model.setLgs_cost_cd         		  ( lgs_cost_cd         	[i]);
				model.setLgs_cost_full_nm    		  ( lgs_cost_full_nm    	[i]);
				model.setLgs_cost_abbr_nm    		  ( lgs_cost_abbr_nm    	[i]);
				model.setSub_cost_tp_cd      		  ( sub_cost_tp_cd      	[i]);
				model.setRep_acct_cd         		  ( rep_acct_cd         	[i]);
				model.setAcct_cd             		  ( acct_cd             	[i]);
				model.setAcct_cd_nm          		  ( acct_cd_nm          	[i]);
				model.setAccl_auto_cd        		  ( accl_auto_cd        	[i]);
				model.setOtr_crr_rep_acct_cd 		  ( otr_crr_rep_acct_cd 	[i]);
				model.setOtr_crr_acct_cd     		  ( otr_crr_acct_cd     	[i]);
				model.setOtr_crr_acct_nm     		  ( otr_crr_acct_nm     	[i]);
				model.setOtr_crr_accl_auto_cd		  ( otr_crr_accl_auto_cd	[i]);
				model.setAccl_flg            		  ( accl_flg            	[i]);
				model.setAccl_lgc_tp_cd      		  ( accl_lgc_tp_cd      	[i]);
				model.setEstm_cost_flg       		  ( estm_cost_flg       	[i]);
				model.setCost_src_sys_cd     		  ( cost_src_sys_cd     	[i]);
				model.setOput_seq            		  ( oput_seq            	[i]);
				model.setLgs_cost_rmk        		  ( lgs_cost_rmk        	[i]);
				model.setDelt_flg            		  ( delt_flg            	[i]);
				model.setCre_dt              		  ( cre_dt              	[i]);
				model.setUpd_dt              		  ( upd_dt              	[i]);
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
