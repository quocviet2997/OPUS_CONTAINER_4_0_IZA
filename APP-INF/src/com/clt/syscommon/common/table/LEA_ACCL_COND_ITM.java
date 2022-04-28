/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : LEA_ACCL_COND_ITM.java
*@FileTitle : Expense Accrual Batch Main
*Open Issues :
*Change history :
*@LastModifyDate : 2007-02-05
*@LastModifier : Park Yeon Jin
*@LastVersion : 1.0
* 2007-02-05 Park Yeon Jin
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
public final class LEA_ACCL_COND_ITM implements java.io.Serializable {

	private String                ibflag                = "";
	private String                page_rows             = "";
	private String                exe_yrmon             = "";
	private String                ap_clz_flg            = "";
	private String                rev_vvd_if_flg        = "";
	private String                rev_vvd_if_knt        = "";
	private String                mon_avg_xch_rt_if_flg = "";
	private String                mon_avg_xch_rt_if_knt = "";
	private String                cond_cfm_flg          = "";
	private String                mnl_inp_flg           = "";
	private String                erp_if_flg            = "";
	private String                erp_if_dt             = "";
	private String                cre_ofc_cd            = "";
	private String                cre_usr_id            = "";
	private String                cre_dt                = "";
	private String                upd_ofc_cd            = "";
	private String                upd_usr_id            = "";
	private String                upd_dt                = "";

	public LEA_ACCL_COND_ITM(){}

	public LEA_ACCL_COND_ITM(
			String                ibflag               ,
			String                page_rows            ,
			String                exe_yrmon            ,
			String                ap_clz_flg           ,
			String                rev_vvd_if_flg       ,
			String                rev_vvd_if_knt       ,
			String                mon_avg_xch_rt_if_flg,
			String                mon_avg_xch_rt_if_knt,
			String                cond_cfm_flg         ,
			String                mnl_inp_flg          ,
			String                erp_if_flg           ,
			String                erp_if_dt            ,
			String                cre_ofc_cd           ,
			String                cre_usr_id           ,
			String                cre_dt               ,
			String                upd_ofc_cd           ,
			String                upd_usr_id           ,
			String                upd_dt               ){
		this.ibflag                = ibflag               ;
		this.page_rows             = page_rows            ;
		this.exe_yrmon             = exe_yrmon            ;
		this.ap_clz_flg            = ap_clz_flg           ;
		this.rev_vvd_if_flg        = rev_vvd_if_flg       ;
		this.rev_vvd_if_knt        = rev_vvd_if_knt       ;
		this.mon_avg_xch_rt_if_flg = mon_avg_xch_rt_if_flg;
		this.mon_avg_xch_rt_if_knt = mon_avg_xch_rt_if_knt;
		this.cond_cfm_flg          = cond_cfm_flg         ;
		this.mnl_inp_flg           = mnl_inp_flg          ;
		this.erp_if_flg            = erp_if_flg           ;
		this.erp_if_dt             = erp_if_dt            ;
		this.cre_ofc_cd            = cre_ofc_cd           ;
		this.cre_usr_id            = cre_usr_id           ;
		this.cre_dt                = cre_dt               ;
		this.upd_ofc_cd            = upd_ofc_cd           ;
		this.upd_usr_id            = upd_usr_id           ;
		this.upd_dt                = upd_dt               ;
	}

	// getter method is proceeding ..
	public String                getIbflag               (){	return ibflag               	;	}
	public String                getPage_rows            (){	return page_rows            	;	}
	public String                getExe_yrmon            (){	return exe_yrmon            	;	}
	public String                getAp_clz_flg           (){	return ap_clz_flg           	;	}
	public String                getRev_vvd_if_flg       (){	return rev_vvd_if_flg       	;	}
	public String                getRev_vvd_if_knt       (){	return rev_vvd_if_knt       	;	}
	public String                getMon_avg_xch_rt_if_flg(){	return mon_avg_xch_rt_if_flg	;	}
	public String                getMon_avg_xch_rt_if_knt(){	return mon_avg_xch_rt_if_knt	;	}
	public String                getCond_cfm_flg         (){	return cond_cfm_flg         	;	}
	public String                getMnl_inp_flg          (){	return mnl_inp_flg          	;	}
	public String                getErp_if_flg           (){	return erp_if_flg           	;	}
	public String                getErp_if_dt            (){	return erp_if_dt            	;	}
	public String                getCre_ofc_cd           (){	return cre_ofc_cd           	;	}
	public String                getCre_usr_id           (){	return cre_usr_id           	;	}
	public String                getCre_dt               (){	return cre_dt               	;	}
	public String                getUpd_ofc_cd           (){	return upd_ofc_cd           	;	}
	public String                getUpd_usr_id           (){	return upd_usr_id           	;	}
	public String                getUpd_dt               (){	return upd_dt               	;	}

	// setter method is proceeding ..
	public void setIbflag               ( String                ibflag                ){	this.ibflag                = ibflag               	;	}
	public void setPage_rows            ( String                page_rows             ){	this.page_rows             = page_rows            	;	}
	public void setExe_yrmon            ( String                exe_yrmon             ){	this.exe_yrmon             = exe_yrmon            	;	}
	public void setAp_clz_flg           ( String                ap_clz_flg            ){	this.ap_clz_flg            = ap_clz_flg           	;	}
	public void setRev_vvd_if_flg       ( String                rev_vvd_if_flg        ){	this.rev_vvd_if_flg        = rev_vvd_if_flg       	;	}
	public void setRev_vvd_if_knt       ( String                rev_vvd_if_knt        ){	this.rev_vvd_if_knt        = rev_vvd_if_knt       	;	}
	public void setMon_avg_xch_rt_if_flg( String                mon_avg_xch_rt_if_flg ){	this.mon_avg_xch_rt_if_flg = mon_avg_xch_rt_if_flg	;	}
	public void setMon_avg_xch_rt_if_knt( String                mon_avg_xch_rt_if_knt ){	this.mon_avg_xch_rt_if_knt = mon_avg_xch_rt_if_knt	;	}
	public void setCond_cfm_flg         ( String                cond_cfm_flg          ){	this.cond_cfm_flg          = cond_cfm_flg         	;	}
	public void setMnl_inp_flg          ( String                mnl_inp_flg           ){	this.mnl_inp_flg           = mnl_inp_flg          	;	}
	public void setErp_if_flg           ( String                erp_if_flg            ){	this.erp_if_flg            = erp_if_flg           	;	}
	public void setErp_if_dt            ( String                erp_if_dt             ){	this.erp_if_dt             = erp_if_dt            	;	}
	public void setCre_ofc_cd           ( String                cre_ofc_cd            ){	this.cre_ofc_cd            = cre_ofc_cd           	;	}
	public void setCre_usr_id           ( String                cre_usr_id            ){	this.cre_usr_id            = cre_usr_id           	;	}
	public void setCre_dt               ( String                cre_dt                ){	this.cre_dt                = cre_dt               	;	}
	public void setUpd_ofc_cd           ( String                upd_ofc_cd            ){	this.upd_ofc_cd            = upd_ofc_cd           	;	}
	public void setUpd_usr_id           ( String                upd_usr_id            ){	this.upd_usr_id            = upd_usr_id           	;	}
	public void setUpd_dt               ( String                upd_dt                ){	this.upd_dt                = upd_dt               	;	}

	public static LEA_ACCL_COND_ITM fromRequest(HttpServletRequest request) {
		LEA_ACCL_COND_ITM model = new LEA_ACCL_COND_ITM();
		try {
			model.setIbflag               	(JSPUtil.getParameter(request, "ibflag               		".trim(), ""));
			model.setPage_rows            	(JSPUtil.getParameter(request, "page_rows            		".trim(), ""));
			model.setExe_yrmon            	(JSPUtil.getParameter(request, "exe_yrmon            		".trim(), ""));
			model.setAp_clz_flg           	(JSPUtil.getParameter(request, "ap_clz_flg           		".trim(), ""));
			model.setRev_vvd_if_flg       	(JSPUtil.getParameter(request, "rev_vvd_if_flg       		".trim(), ""));
			model.setRev_vvd_if_knt       	(JSPUtil.getParameter(request, "rev_vvd_if_knt       		".trim(), ""));
			model.setMon_avg_xch_rt_if_flg	(JSPUtil.getParameter(request, "mon_avg_xch_rt_if_flg		".trim(), ""));
			model.setMon_avg_xch_rt_if_knt	(JSPUtil.getParameter(request, "mon_avg_xch_rt_if_knt		".trim(), ""));
			model.setCond_cfm_flg         	(JSPUtil.getParameter(request, "cond_cfm_flg         		".trim(), ""));
			model.setMnl_inp_flg          	(JSPUtil.getParameter(request, "mnl_inp_flg          		".trim(), ""));
			model.setErp_if_flg           	(JSPUtil.getParameter(request, "erp_if_flg           		".trim(), ""));
			model.setErp_if_dt            	(JSPUtil.getParameter(request, "erp_if_dt            		".trim(), ""));
			model.setCre_ofc_cd           	(JSPUtil.getParameter(request, "cre_ofc_cd           		".trim(), ""));
			model.setCre_usr_id           	(JSPUtil.getParameter(request, "cre_usr_id           		".trim(), ""));
			model.setCre_dt               	(JSPUtil.getParameter(request, "cre_dt               		".trim(), ""));
			model.setUpd_ofc_cd           	(JSPUtil.getParameter(request, "upd_ofc_cd           		".trim(), ""));
			model.setUpd_usr_id           	(JSPUtil.getParameter(request, "upd_usr_id           		".trim(), ""));
			model.setUpd_dt               	(JSPUtil.getParameter(request, "upd_dt               		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		LEA_ACCL_COND_ITM model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag                =  (JSPUtil.getParameter(request, "ibflag               		".trim(), length));
			String[] page_rows             =  (JSPUtil.getParameter(request, "page_rows            		".trim(), length));
			String[] exe_yrmon             =  (JSPUtil.getParameter(request, "exe_yrmon            		".trim(), length));
			String[] ap_clz_flg            =  (JSPUtil.getParameter(request, "ap_clz_flg           		".trim(), length));
			String[] rev_vvd_if_flg        =  (JSPUtil.getParameter(request, "rev_vvd_if_flg       		".trim(), length));
			String[] rev_vvd_if_knt        =  (JSPUtil.getParameter(request, "rev_vvd_if_knt       		".trim(), length));
			String[] mon_avg_xch_rt_if_flg =  (JSPUtil.getParameter(request, "mon_avg_xch_rt_if_flg		".trim(), length));
			String[] mon_avg_xch_rt_if_knt =  (JSPUtil.getParameter(request, "mon_avg_xch_rt_if_knt		".trim(), length));
			String[] cond_cfm_flg          =  (JSPUtil.getParameter(request, "cond_cfm_flg         		".trim(), length));
			String[] mnl_inp_flg           =  (JSPUtil.getParameter(request, "mnl_inp_flg          		".trim(), length));
			String[] erp_if_flg            =  (JSPUtil.getParameter(request, "erp_if_flg           		".trim(), length));
			String[] erp_if_dt             =  (JSPUtil.getParameter(request, "erp_if_dt            		".trim(), length));
			String[] cre_ofc_cd            =  (JSPUtil.getParameter(request, "cre_ofc_cd           		".trim(), length));
			String[] cre_usr_id            =  (JSPUtil.getParameter(request, "cre_usr_id           		".trim(), length));
			String[] cre_dt                =  (JSPUtil.getParameter(request, "cre_dt               		".trim(), length));
			String[] upd_ofc_cd            =  (JSPUtil.getParameter(request, "upd_ofc_cd           		".trim(), length));
			String[] upd_usr_id            =  (JSPUtil.getParameter(request, "upd_usr_id           		".trim(), length));
			String[] upd_dt                =  (JSPUtil.getParameter(request, "upd_dt               		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new LEA_ACCL_COND_ITM();
				model.setIbflag               		  (ibflag               	[i]);
				model.setPage_rows            		  (page_rows            	[i]);
				model.setExe_yrmon            		  (exe_yrmon            	[i]);
				model.setAp_clz_flg           		  (ap_clz_flg           	[i]);
				model.setRev_vvd_if_flg       		  (rev_vvd_if_flg       	[i]);
				model.setRev_vvd_if_knt       		  (rev_vvd_if_knt       	[i]);
				model.setMon_avg_xch_rt_if_flg		  (mon_avg_xch_rt_if_flg	[i]);
				model.setMon_avg_xch_rt_if_knt		  (mon_avg_xch_rt_if_knt	[i]);
				model.setCond_cfm_flg         		  (cond_cfm_flg         	[i]);
				model.setMnl_inp_flg          		  (mnl_inp_flg          	[i]);
				model.setErp_if_flg           		  (erp_if_flg           	[i]);
				model.setErp_if_dt            		  (erp_if_dt            	[i]);
				model.setCre_ofc_cd           		  (cre_ofc_cd           	[i]);
				model.setCre_usr_id           		  (cre_usr_id           	[i]);
				model.setCre_dt               		  (cre_dt               	[i]);
				model.setUpd_ofc_cd           		  (upd_ofc_cd           	[i]);
				model.setUpd_usr_id           		  (upd_usr_id           	[i]);
				model.setUpd_dt               		  (upd_dt               	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		LEA_ACCL_COND_ITM model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag                =  (JSPUtil.getParameter(request, prefix + "ibflag               		".trim(), length));
			String[] page_rows             =  (JSPUtil.getParameter(request, prefix + "page_rows            		".trim(), length));
			String[] exe_yrmon             =  (JSPUtil.getParameter(request, prefix + "exe_yrmon            		".trim(), length));
			String[] ap_clz_flg            =  (JSPUtil.getParameter(request, prefix + "ap_clz_flg           		".trim(), length));
			String[] rev_vvd_if_flg        =  (JSPUtil.getParameter(request, prefix + "rev_vvd_if_flg       		".trim(), length));
			String[] rev_vvd_if_knt        =  (JSPUtil.getParameter(request, prefix + "rev_vvd_if_knt       		".trim(), length));
			String[] mon_avg_xch_rt_if_flg =  (JSPUtil.getParameter(request, prefix + "mon_avg_xch_rt_if_flg		".trim(), length));
			String[] mon_avg_xch_rt_if_knt =  (JSPUtil.getParameter(request, prefix + "mon_avg_xch_rt_if_knt		".trim(), length));
			String[] cond_cfm_flg          =  (JSPUtil.getParameter(request, prefix + "cond_cfm_flg         		".trim(), length));
			String[] mnl_inp_flg           =  (JSPUtil.getParameter(request, prefix + "mnl_inp_flg          		".trim(), length));
			String[] erp_if_flg            =  (JSPUtil.getParameter(request, prefix + "erp_if_flg           		".trim(), length));
			String[] erp_if_dt             =  (JSPUtil.getParameter(request, prefix + "erp_if_dt            		".trim(), length));
			String[] cre_ofc_cd            =  (JSPUtil.getParameter(request, prefix + "cre_ofc_cd           		".trim(), length));
			String[] cre_usr_id            =  (JSPUtil.getParameter(request, prefix + "cre_usr_id           		".trim(), length));
			String[] cre_dt                =  (JSPUtil.getParameter(request, prefix + "cre_dt               		".trim(), length));
			String[] upd_ofc_cd            =  (JSPUtil.getParameter(request, prefix + "upd_ofc_cd           		".trim(), length));
			String[] upd_usr_id            =  (JSPUtil.getParameter(request, prefix + "upd_usr_id           		".trim(), length));
			String[] upd_dt                =  (JSPUtil.getParameter(request, prefix + "upd_dt               		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new LEA_ACCL_COND_ITM();
				model.setIbflag               		  ( ibflag               	[i]);
				model.setPage_rows            		  ( page_rows            	[i]);
				model.setExe_yrmon            		  ( exe_yrmon            	[i]);
				model.setAp_clz_flg           		  ( ap_clz_flg           	[i]);
				model.setRev_vvd_if_flg       		  ( rev_vvd_if_flg       	[i]);
				model.setRev_vvd_if_knt       		  ( rev_vvd_if_knt       	[i]);
				model.setMon_avg_xch_rt_if_flg		  ( mon_avg_xch_rt_if_flg	[i]);
				model.setMon_avg_xch_rt_if_knt		  ( mon_avg_xch_rt_if_knt	[i]);
				model.setCond_cfm_flg         		  ( cond_cfm_flg         	[i]);
				model.setMnl_inp_flg          		  ( mnl_inp_flg          	[i]);
				model.setErp_if_flg           		  ( erp_if_flg           	[i]);
				model.setErp_if_dt            		  ( erp_if_dt            	[i]);
				model.setCre_ofc_cd           		  ( cre_ofc_cd           	[i]);
				model.setCre_usr_id           		  ( cre_usr_id           	[i]);
				model.setCre_dt               		  ( cre_dt               	[i]);
				model.setUpd_ofc_cd           		  ( upd_ofc_cd           	[i]);
				model.setUpd_usr_id           		  ( upd_usr_id           	[i]);
				model.setUpd_dt               		  ( upd_dt               	[i]);
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
