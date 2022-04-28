/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : MDM_CURRENCY.java
*@FileTitle : 사용자 관리5
*Open Issues :
*Change history :
*@LastModifyDate : 2007-01-12
*@LastModifier : Kildong_hong6
*@LastVersion : 1.0
* 2007-01-12 Kildong_hong6
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
public final class MdmCurrency implements java.io.Serializable {

	private String       ibflag       = "";
	private String       page_rows    = "";
	private String       curr_cd      = "";
	private String       curr_nm      = "";
	private String       curr_desc    = "";
	private String       cnt_cd       = "";
	private String       fm_eff_dt    = "";
	private String       to_eff_dt    = "";
	private String       dp_prcs_knt  = "";
	private String       xtd_prcs_knt = "";
	private String       cre_usr_id   = "";
	private String       cre_dt       = "";
	private String       upd_usr_id   = "";
	private String       upd_dt       = "";
	private String       delt_flg     = "";
	private String       eai_evnt_dt  = "";

	public MdmCurrency(){}

	public MdmCurrency(
			String       ibflag      ,
			String       page_rows   ,
			String       curr_cd     ,
			String       curr_nm     ,
			String       curr_desc   ,
			String       cnt_cd      ,
			String       fm_eff_dt   ,
			String       to_eff_dt   ,
			String       dp_prcs_knt ,
			String       xtd_prcs_knt,
			String       cre_usr_id  ,
			String       cre_dt      ,
			String       upd_usr_id  ,
			String       upd_dt      ,
			String       delt_flg    ,
			String       eai_evnt_dt ){
		this.ibflag       = ibflag      ;
		this.page_rows    = page_rows   ;
		this.curr_cd      = curr_cd     ;
		this.curr_nm      = curr_nm     ;
		this.curr_desc    = curr_desc   ;
		this.cnt_cd       = cnt_cd      ;
		this.fm_eff_dt    = fm_eff_dt   ;
		this.to_eff_dt    = to_eff_dt   ;
		this.dp_prcs_knt  = dp_prcs_knt ;
		this.xtd_prcs_knt = xtd_prcs_knt;
		this.cre_usr_id   = cre_usr_id  ;
		this.cre_dt       = cre_dt      ;
		this.upd_usr_id   = upd_usr_id  ;
		this.upd_dt       = upd_dt      ;
		this.delt_flg     = delt_flg    ;
		this.eai_evnt_dt  = eai_evnt_dt ;
	}

	// getter method is proceeding ..
	public String       getIbflag      (){	return ibflag      	;	}
	public String       getPage_rows   (){	return page_rows   	;	}
	public String       getCurr_cd     (){	return curr_cd     	;	}
	public String       getCurr_nm     (){	return curr_nm     	;	}
	public String       getCurr_desc   (){	return curr_desc   	;	}
	public String       getCnt_cd      (){	return cnt_cd      	;	}
	public String       getFm_eff_dt   (){	return fm_eff_dt   	;	}
	public String       getTo_eff_dt   (){	return to_eff_dt   	;	}
	public String       getDp_prcs_knt (){	return dp_prcs_knt 	;	}
	public String       getXtd_prcs_knt(){	return xtd_prcs_knt	;	}
	public String       getCre_usr_id  (){	return cre_usr_id  	;	}
	public String       getCre_dt      (){	return cre_dt      	;	}
	public String       getUpd_usr_id  (){	return upd_usr_id  	;	}
	public String       getUpd_dt      (){	return upd_dt      	;	}
	public String       getDelt_flg    (){	return delt_flg    	;	}
	public String       getEai_evnt_dt (){	return eai_evnt_dt 	;	}

	// setter method is proceeding ..
	public void setIbflag      ( String       ibflag       ){	this.ibflag       = ibflag      	;	}
	public void setPage_rows   ( String       page_rows    ){	this.page_rows    = page_rows   	;	}
	public void setCurr_cd     ( String       curr_cd      ){	this.curr_cd      = curr_cd     	;	}
	public void setCurr_nm     ( String       curr_nm      ){	this.curr_nm      = curr_nm     	;	}
	public void setCurr_desc   ( String       curr_desc    ){	this.curr_desc    = curr_desc   	;	}
	public void setCnt_cd      ( String       cnt_cd       ){	this.cnt_cd       = cnt_cd      	;	}
	public void setFm_eff_dt   ( String       fm_eff_dt    ){	this.fm_eff_dt    = fm_eff_dt   	;	}
	public void setTo_eff_dt   ( String       to_eff_dt    ){	this.to_eff_dt    = to_eff_dt   	;	}
	public void setDp_prcs_knt ( String       dp_prcs_knt  ){	this.dp_prcs_knt  = dp_prcs_knt 	;	}
	public void setXtd_prcs_knt( String       xtd_prcs_knt ){	this.xtd_prcs_knt = xtd_prcs_knt	;	}
	public void setCre_usr_id  ( String       cre_usr_id   ){	this.cre_usr_id   = cre_usr_id  	;	}
	public void setCre_dt      ( String       cre_dt       ){	this.cre_dt       = cre_dt      	;	}
	public void setUpd_usr_id  ( String       upd_usr_id   ){	this.upd_usr_id   = upd_usr_id  	;	}
	public void setUpd_dt      ( String       upd_dt       ){	this.upd_dt       = upd_dt      	;	}
	public void setDelt_flg    ( String       delt_flg     ){	this.delt_flg     = delt_flg    	;	}
	public void setEai_evnt_dt ( String       eai_evnt_dt  ){	this.eai_evnt_dt  = eai_evnt_dt 	;	}

	public static MdmCurrency fromRequest(HttpServletRequest request) {
		MdmCurrency model = new MdmCurrency();
		try {
			model.setIbflag      	(JSPUtil.getParameter(request, "ibflag      		".trim(), ""));
			model.setPage_rows   	(JSPUtil.getParameter(request, "page_rows   		".trim(), ""));
			model.setCurr_cd     	(JSPUtil.getParameter(request, "curr_cd     		".trim(), ""));
			model.setCurr_nm     	(JSPUtil.getParameter(request, "curr_nm     		".trim(), ""));
			model.setCurr_desc   	(JSPUtil.getParameter(request, "curr_desc   		".trim(), ""));
			model.setCnt_cd      	(JSPUtil.getParameter(request, "cnt_cd      		".trim(), ""));
			model.setFm_eff_dt   	(JSPUtil.getParameter(request, "fm_eff_dt   		".trim(), ""));
			model.setTo_eff_dt   	(JSPUtil.getParameter(request, "to_eff_dt   		".trim(), ""));
			model.setDp_prcs_knt 	(JSPUtil.getParameter(request, "dp_prcs_knt 		".trim(), ""));
			model.setXtd_prcs_knt	(JSPUtil.getParameter(request, "xtd_prcs_knt		".trim(), ""));
			model.setCre_usr_id  	(JSPUtil.getParameter(request, "cre_usr_id  		".trim(), ""));
			model.setCre_dt      	(JSPUtil.getParameter(request, "cre_dt      		".trim(), ""));
			model.setUpd_usr_id  	(JSPUtil.getParameter(request, "upd_usr_id  		".trim(), ""));
			model.setUpd_dt      	(JSPUtil.getParameter(request, "upd_dt      		".trim(), ""));
			model.setDelt_flg    	(JSPUtil.getParameter(request, "delt_flg    		".trim(), ""));
			model.setEai_evnt_dt 	(JSPUtil.getParameter(request, "eai_evnt_dt 		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		MdmCurrency model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag       =  (JSPUtil.getParameter(request, "ibflag      		".trim(), length));
			String[] page_rows    =  (JSPUtil.getParameter(request, "page_rows   		".trim(), length));
			String[] curr_cd      =  (JSPUtil.getParameter(request, "curr_cd     		".trim(), length));
			String[] curr_nm      =  (JSPUtil.getParameter(request, "curr_nm     		".trim(), length));
			String[] curr_desc    =  (JSPUtil.getParameter(request, "curr_desc   		".trim(), length));
			String[] cnt_cd       =  (JSPUtil.getParameter(request, "cnt_cd      		".trim(), length));
			String[] fm_eff_dt    =  (JSPUtil.getParameter(request, "fm_eff_dt   		".trim(), length));
			String[] to_eff_dt    =  (JSPUtil.getParameter(request, "to_eff_dt   		".trim(), length));
			String[] dp_prcs_knt  =  (JSPUtil.getParameter(request, "dp_prcs_knt 		".trim(), length));
			String[] xtd_prcs_knt =  (JSPUtil.getParameter(request, "xtd_prcs_knt		".trim(), length));
			String[] cre_usr_id   =  (JSPUtil.getParameter(request, "cre_usr_id  		".trim(), length));
			String[] cre_dt       =  (JSPUtil.getParameter(request, "cre_dt      		".trim(), length));
			String[] upd_usr_id   =  (JSPUtil.getParameter(request, "upd_usr_id  		".trim(), length));
			String[] upd_dt       =  (JSPUtil.getParameter(request, "upd_dt      		".trim(), length));
			String[] delt_flg     =  (JSPUtil.getParameter(request, "delt_flg    		".trim(), length));
			String[] eai_evnt_dt  =  (JSPUtil.getParameter(request, "eai_evnt_dt 		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new MdmCurrency();
				model.setIbflag      		  (ibflag      	[i]);
				model.setPage_rows   		  (page_rows   	[i]);
				model.setCurr_cd     		  (curr_cd     	[i]);
				model.setCurr_nm     		  (curr_nm     	[i]);
				model.setCurr_desc   		  (curr_desc   	[i]);
				model.setCnt_cd      		  (cnt_cd      	[i]);
				model.setFm_eff_dt   		  (fm_eff_dt   	[i]);
				model.setTo_eff_dt   		  (to_eff_dt   	[i]);
				model.setDp_prcs_knt 		  (dp_prcs_knt 	[i]);
				model.setXtd_prcs_knt		  (xtd_prcs_knt	[i]);
				model.setCre_usr_id  		  (cre_usr_id  	[i]);
				model.setCre_dt      		  (cre_dt      	[i]);
				model.setUpd_usr_id  		  (upd_usr_id  	[i]);
				model.setUpd_dt      		  (upd_dt      	[i]);
				model.setDelt_flg    		  (delt_flg    	[i]);
				model.setEai_evnt_dt 		  (eai_evnt_dt 	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		MdmCurrency model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag       =  (JSPUtil.getParameter(request, prefix + "ibflag      		".trim(), length));
			String[] page_rows    =  (JSPUtil.getParameter(request, prefix + "page_rows   		".trim(), length));
			String[] curr_cd      =  (JSPUtil.getParameter(request, prefix + "curr_cd     		".trim(), length));
			String[] curr_nm      =  (JSPUtil.getParameter(request, prefix + "curr_nm     		".trim(), length));
			String[] curr_desc    =  (JSPUtil.getParameter(request, prefix + "curr_desc   		".trim(), length));
			String[] cnt_cd       =  (JSPUtil.getParameter(request, prefix + "cnt_cd      		".trim(), length));
			String[] fm_eff_dt    =  (JSPUtil.getParameter(request, prefix + "fm_eff_dt   		".trim(), length));
			String[] to_eff_dt    =  (JSPUtil.getParameter(request, prefix + "to_eff_dt   		".trim(), length));
			String[] dp_prcs_knt  =  (JSPUtil.getParameter(request, prefix + "dp_prcs_knt 		".trim(), length));
			String[] xtd_prcs_knt =  (JSPUtil.getParameter(request, prefix + "xtd_prcs_knt		".trim(), length));
			String[] cre_usr_id   =  (JSPUtil.getParameter(request, prefix + "cre_usr_id  		".trim(), length));
			String[] cre_dt       =  (JSPUtil.getParameter(request, prefix + "cre_dt      		".trim(), length));
			String[] upd_usr_id   =  (JSPUtil.getParameter(request, prefix + "upd_usr_id  		".trim(), length));
			String[] upd_dt       =  (JSPUtil.getParameter(request, prefix + "upd_dt      		".trim(), length));
			String[] delt_flg     =  (JSPUtil.getParameter(request, prefix + "delt_flg    		".trim(), length));
			String[] eai_evnt_dt  =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt 		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new MdmCurrency();
				model.setIbflag      		  ( ibflag      	[i]);
				model.setPage_rows   		  ( page_rows   	[i]);
				model.setCurr_cd     		  ( curr_cd     	[i]);
				model.setCurr_nm     		  ( curr_nm     	[i]);
				model.setCurr_desc   		  ( curr_desc   	[i]);
				model.setCnt_cd      		  ( cnt_cd      	[i]);
				model.setFm_eff_dt   		  ( fm_eff_dt   	[i]);
				model.setTo_eff_dt   		  ( to_eff_dt   	[i]);
				model.setDp_prcs_knt 		  ( dp_prcs_knt 	[i]);
				model.setXtd_prcs_knt		  ( xtd_prcs_knt	[i]);
				model.setCre_usr_id  		  ( cre_usr_id  	[i]);
				model.setCre_dt      		  ( cre_dt      	[i]);
				model.setUpd_usr_id  		  ( upd_usr_id  	[i]);
				model.setUpd_dt      		  ( upd_dt      	[i]);
				model.setDelt_flg    		  ( delt_flg    	[i]);
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
