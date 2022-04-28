/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : GL_MON_XCH_RT.java
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
public final class GL_MON_XCH_RT implements java.io.Serializable {

	private String            ibflag            = "";
	private String            page_rows         = "";
	private String            acct_xch_rt_yrmon = "";
	private String            acct_xch_rt_lvl   = "";
	private String            curr_cd           = "";
	private String            usd_locl_xch_rt   = "";
	private String            locl_krw_xch_rt   = "";
	private String            usd_krw_xch_rt    = "";
	private String            upd_dt            = "";
	private String            acct_rt_usr_lvl   = "";
	private String            log_upd_dt        = "";
	private String            upd_usr_id        = "";
	private String            delt_flg          = "";
	private String            cre_dt            = "";
	private String            nis_evnt_dt       = "";
	private String            eai_evnt_dt       = "";

	public GL_MON_XCH_RT(){}

	public GL_MON_XCH_RT(
			String            ibflag           ,
			String            page_rows        ,
			String            acct_xch_rt_yrmon,
			String            acct_xch_rt_lvl  ,
			String            curr_cd          ,
			String            usd_locl_xch_rt  ,
			String            locl_krw_xch_rt  ,
			String            usd_krw_xch_rt   ,
			String            upd_dt           ,
			String            acct_rt_usr_lvl  ,
			String            log_upd_dt       ,
			String            upd_usr_id       ,
			String            delt_flg         ,
			String            cre_dt           ,
			String            nis_evnt_dt      ,
			String            eai_evnt_dt      ){
		this.ibflag            = ibflag           ;
		this.page_rows         = page_rows        ;
		this.acct_xch_rt_yrmon = acct_xch_rt_yrmon;
		this.acct_xch_rt_lvl   = acct_xch_rt_lvl  ;
		this.curr_cd           = curr_cd          ;
		this.usd_locl_xch_rt   = usd_locl_xch_rt  ;
		this.locl_krw_xch_rt   = locl_krw_xch_rt  ;
		this.usd_krw_xch_rt    = usd_krw_xch_rt   ;
		this.upd_dt            = upd_dt           ;
		this.acct_rt_usr_lvl   = acct_rt_usr_lvl  ;
		this.log_upd_dt        = log_upd_dt       ;
		this.upd_usr_id        = upd_usr_id       ;
		this.delt_flg          = delt_flg         ;
		this.cre_dt            = cre_dt           ;
		this.nis_evnt_dt       = nis_evnt_dt      ;
		this.eai_evnt_dt       = eai_evnt_dt      ;
	}

	// getter method is proceeding ..
	public String            getIbflag           (){	return ibflag           	;	}
	public String            getPage_rows        (){	return page_rows        	;	}
	public String            getAcct_xch_rt_yrmon(){	return acct_xch_rt_yrmon	;	}
	public String            getAcct_xch_rt_lvl  (){	return acct_xch_rt_lvl  	;	}
	public String            getCurr_cd          (){	return curr_cd          	;	}
	public String            getUsd_locl_xch_rt  (){	return usd_locl_xch_rt  	;	}
	public String            getLocl_krw_xch_rt  (){	return locl_krw_xch_rt  	;	}
	public String            getUsd_krw_xch_rt   (){	return usd_krw_xch_rt   	;	}
	public String            getUpd_dt           (){	return upd_dt           	;	}
	public String            getAcct_rt_usr_lvl  (){	return acct_rt_usr_lvl  	;	}
	public String            getLog_upd_dt       (){	return log_upd_dt       	;	}
	public String            getUpd_usr_id       (){	return upd_usr_id       	;	}
	public String            getDelt_flg         (){	return delt_flg         	;	}
	public String            getCre_dt           (){	return cre_dt           	;	}
	public String            getNis_evnt_dt      (){	return nis_evnt_dt      	;	}
	public String            getEai_evnt_dt      (){	return eai_evnt_dt      	;	}

	// setter method is proceeding ..
	public void setIbflag           ( String            ibflag            ){	this.ibflag            = ibflag           	;	}
	public void setPage_rows        ( String            page_rows         ){	this.page_rows         = page_rows        	;	}
	public void setAcct_xch_rt_yrmon( String            acct_xch_rt_yrmon ){	this.acct_xch_rt_yrmon = acct_xch_rt_yrmon	;	}
	public void setAcct_xch_rt_lvl  ( String            acct_xch_rt_lvl   ){	this.acct_xch_rt_lvl   = acct_xch_rt_lvl  	;	}
	public void setCurr_cd          ( String            curr_cd           ){	this.curr_cd           = curr_cd          	;	}
	public void setUsd_locl_xch_rt  ( String            usd_locl_xch_rt   ){	this.usd_locl_xch_rt   = usd_locl_xch_rt  	;	}
	public void setLocl_krw_xch_rt  ( String            locl_krw_xch_rt   ){	this.locl_krw_xch_rt   = locl_krw_xch_rt  	;	}
	public void setUsd_krw_xch_rt   ( String            usd_krw_xch_rt    ){	this.usd_krw_xch_rt    = usd_krw_xch_rt   	;	}
	public void setUpd_dt           ( String            upd_dt            ){	this.upd_dt            = upd_dt           	;	}
	public void setAcct_rt_usr_lvl  ( String            acct_rt_usr_lvl   ){	this.acct_rt_usr_lvl   = acct_rt_usr_lvl  	;	}
	public void setLog_upd_dt       ( String            log_upd_dt        ){	this.log_upd_dt        = log_upd_dt       	;	}
	public void setUpd_usr_id       ( String            upd_usr_id        ){	this.upd_usr_id        = upd_usr_id       	;	}
	public void setDelt_flg         ( String            delt_flg          ){	this.delt_flg          = delt_flg         	;	}
	public void setCre_dt           ( String            cre_dt            ){	this.cre_dt            = cre_dt           	;	}
	public void setNis_evnt_dt      ( String            nis_evnt_dt       ){	this.nis_evnt_dt       = nis_evnt_dt      	;	}
	public void setEai_evnt_dt      ( String            eai_evnt_dt       ){	this.eai_evnt_dt       = eai_evnt_dt      	;	}

	public static GL_MON_XCH_RT fromRequest(HttpServletRequest request) {
		GL_MON_XCH_RT model = new GL_MON_XCH_RT();
		try {
			model.setIbflag           	(JSPUtil.getParameter(request, "ibflag           		".trim(), ""));
			model.setPage_rows        	(JSPUtil.getParameter(request, "page_rows        		".trim(), ""));
			model.setAcct_xch_rt_yrmon	(JSPUtil.getParameter(request, "acct_xch_rt_yrmon		".trim(), ""));
			model.setAcct_xch_rt_lvl  	(JSPUtil.getParameter(request, "acct_xch_rt_lvl  		".trim(), ""));
			model.setCurr_cd          	(JSPUtil.getParameter(request, "curr_cd          		".trim(), ""));
			model.setUsd_locl_xch_rt  	(JSPUtil.getParameter(request, "usd_locl_xch_rt  		".trim(), ""));
			model.setLocl_krw_xch_rt  	(JSPUtil.getParameter(request, "locl_krw_xch_rt  		".trim(), ""));
			model.setUsd_krw_xch_rt   	(JSPUtil.getParameter(request, "usd_krw_xch_rt   		".trim(), ""));
			model.setUpd_dt           	(JSPUtil.getParameter(request, "upd_dt           		".trim(), ""));
			model.setAcct_rt_usr_lvl  	(JSPUtil.getParameter(request, "acct_rt_usr_lvl  		".trim(), ""));
			model.setLog_upd_dt       	(JSPUtil.getParameter(request, "log_upd_dt       		".trim(), ""));
			model.setUpd_usr_id       	(JSPUtil.getParameter(request, "upd_usr_id       		".trim(), ""));
			model.setDelt_flg         	(JSPUtil.getParameter(request, "delt_flg         		".trim(), ""));
			model.setCre_dt           	(JSPUtil.getParameter(request, "cre_dt           		".trim(), ""));
			model.setNis_evnt_dt      	(JSPUtil.getParameter(request, "nis_evnt_dt      		".trim(), ""));
			model.setEai_evnt_dt      	(JSPUtil.getParameter(request, "eai_evnt_dt      		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		GL_MON_XCH_RT model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag            =  (JSPUtil.getParameter(request, "ibflag           		".trim(), length));
			String[] page_rows         =  (JSPUtil.getParameter(request, "page_rows        		".trim(), length));
			String[] acct_xch_rt_yrmon =  (JSPUtil.getParameter(request, "acct_xch_rt_yrmon		".trim(), length));
			String[] acct_xch_rt_lvl   =  (JSPUtil.getParameter(request, "acct_xch_rt_lvl  		".trim(), length));
			String[] curr_cd           =  (JSPUtil.getParameter(request, "curr_cd          		".trim(), length));
			String[] usd_locl_xch_rt   =  (JSPUtil.getParameter(request, "usd_locl_xch_rt  		".trim(), length));
			String[] locl_krw_xch_rt   =  (JSPUtil.getParameter(request, "locl_krw_xch_rt  		".trim(), length));
			String[] usd_krw_xch_rt    =  (JSPUtil.getParameter(request, "usd_krw_xch_rt   		".trim(), length));
			String[] upd_dt            =  (JSPUtil.getParameter(request, "upd_dt           		".trim(), length));
			String[] acct_rt_usr_lvl   =  (JSPUtil.getParameter(request, "acct_rt_usr_lvl  		".trim(), length));
			String[] log_upd_dt        =  (JSPUtil.getParameter(request, "log_upd_dt       		".trim(), length));
			String[] upd_usr_id        =  (JSPUtil.getParameter(request, "upd_usr_id       		".trim(), length));
			String[] delt_flg          =  (JSPUtil.getParameter(request, "delt_flg         		".trim(), length));
			String[] cre_dt            =  (JSPUtil.getParameter(request, "cre_dt           		".trim(), length));
			String[] nis_evnt_dt       =  (JSPUtil.getParameter(request, "nis_evnt_dt      		".trim(), length));
			String[] eai_evnt_dt       =  (JSPUtil.getParameter(request, "eai_evnt_dt      		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new GL_MON_XCH_RT();
				model.setIbflag           		  (ibflag           	[i]);
				model.setPage_rows        		  (page_rows        	[i]);
				model.setAcct_xch_rt_yrmon		  (acct_xch_rt_yrmon	[i]);
				model.setAcct_xch_rt_lvl  		  (acct_xch_rt_lvl  	[i]);
				model.setCurr_cd          		  (curr_cd          	[i]);
				model.setUsd_locl_xch_rt  		  (usd_locl_xch_rt  	[i]);
				model.setLocl_krw_xch_rt  		  (locl_krw_xch_rt  	[i]);
				model.setUsd_krw_xch_rt   		  (usd_krw_xch_rt   	[i]);
				model.setUpd_dt           		  (upd_dt           	[i]);
				model.setAcct_rt_usr_lvl  		  (acct_rt_usr_lvl  	[i]);
				model.setLog_upd_dt       		  (log_upd_dt       	[i]);
				model.setUpd_usr_id       		  (upd_usr_id       	[i]);
				model.setDelt_flg         		  (delt_flg         	[i]);
				model.setCre_dt           		  (cre_dt           	[i]);
				model.setNis_evnt_dt      		  (nis_evnt_dt      	[i]);
				model.setEai_evnt_dt      		  (eai_evnt_dt      	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		GL_MON_XCH_RT model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag            =  (JSPUtil.getParameter(request, prefix + "ibflag           		".trim(), length));
			String[] page_rows         =  (JSPUtil.getParameter(request, prefix + "page_rows        		".trim(), length));
			String[] acct_xch_rt_yrmon =  (JSPUtil.getParameter(request, prefix + "acct_xch_rt_yrmon		".trim(), length));
			String[] acct_xch_rt_lvl   =  (JSPUtil.getParameter(request, prefix + "acct_xch_rt_lvl  		".trim(), length));
			String[] curr_cd           =  (JSPUtil.getParameter(request, prefix + "curr_cd          		".trim(), length));
			String[] usd_locl_xch_rt   =  (JSPUtil.getParameter(request, prefix + "usd_locl_xch_rt  		".trim(), length));
			String[] locl_krw_xch_rt   =  (JSPUtil.getParameter(request, prefix + "locl_krw_xch_rt  		".trim(), length));
			String[] usd_krw_xch_rt    =  (JSPUtil.getParameter(request, prefix + "usd_krw_xch_rt   		".trim(), length));
			String[] upd_dt            =  (JSPUtil.getParameter(request, prefix + "upd_dt           		".trim(), length));
			String[] acct_rt_usr_lvl   =  (JSPUtil.getParameter(request, prefix + "acct_rt_usr_lvl  		".trim(), length));
			String[] log_upd_dt        =  (JSPUtil.getParameter(request, prefix + "log_upd_dt       		".trim(), length));
			String[] upd_usr_id        =  (JSPUtil.getParameter(request, prefix + "upd_usr_id       		".trim(), length));
			String[] delt_flg          =  (JSPUtil.getParameter(request, prefix + "delt_flg         		".trim(), length));
			String[] cre_dt            =  (JSPUtil.getParameter(request, prefix + "cre_dt           		".trim(), length));
			String[] nis_evnt_dt       =  (JSPUtil.getParameter(request, prefix + "nis_evnt_dt      		".trim(), length));
			String[] eai_evnt_dt       =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt      		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new GL_MON_XCH_RT();
				model.setIbflag           		  ( ibflag           	[i]);
				model.setPage_rows        		  ( page_rows        	[i]);
				model.setAcct_xch_rt_yrmon		  ( acct_xch_rt_yrmon	[i]);
				model.setAcct_xch_rt_lvl  		  ( acct_xch_rt_lvl  	[i]);
				model.setCurr_cd          		  ( curr_cd          	[i]);
				model.setUsd_locl_xch_rt  		  ( usd_locl_xch_rt  	[i]);
				model.setLocl_krw_xch_rt  		  ( locl_krw_xch_rt  	[i]);
				model.setUsd_krw_xch_rt   		  ( usd_krw_xch_rt   	[i]);
				model.setUpd_dt           		  ( upd_dt           	[i]);
				model.setAcct_rt_usr_lvl  		  ( acct_rt_usr_lvl  	[i]);
				model.setLog_upd_dt       		  ( log_upd_dt       	[i]);
				model.setUpd_usr_id       		  ( upd_usr_id       	[i]);
				model.setDelt_flg         		  ( delt_flg         	[i]);
				model.setCre_dt           		  ( cre_dt           	[i]);
				model.setNis_evnt_dt      		  ( nis_evnt_dt      	[i]);
				model.setEai_evnt_dt      		  ( eai_evnt_dt      	[i]);
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
