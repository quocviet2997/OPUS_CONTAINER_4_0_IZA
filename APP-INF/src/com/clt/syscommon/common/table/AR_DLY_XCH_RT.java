/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : AR_DLY_XCH_RT.java
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
public final class AR_DLY_XCH_RT implements java.io.Serializable {

	private String           lifid          = "";
	private String           seq        	= "";
	private String           total_count    = "";
	private String           rownum         = "";
	private String           opcd  			= "";
	private String           cntry_cd 		= "";
	private String           cust_cd  		= "";
	private String           bnd       		= "";
	private String           from_dt        = "";
	private String           to_dt     		= "";
	private String           chg_curr       = "";
	private String           lcl_curr       = "";
	private String           ex_rate        = "";
	private String           del_mk      	= "";
	private String           log_rgst_dt    = "";
	private String           log_updt_dt    = "";
	private String           log_user_id    = "";
	private String           nis_event_dt   = "";
	private String           ofc_cd      	= "";
	private String           rt_type      	= "";

	public AR_DLY_XCH_RT(){}

	public AR_DLY_XCH_RT(
			String           lifid          ,
			String           seq        	,
			String           total_count    ,
			String           rownum         ,
			String           opcd  			,
			String           cntry_cd 		,
			String           cust_cd  		,
			String           bnd       		,
			String           from_dt        ,
			String           to_dt     		,
			String           chg_curr       ,
			String           lcl_curr       ,
			String           ex_rate        ,
			String           del_mk      	,
			String           log_rgst_dt    ,
			String           log_updt_dt    ,
			String           log_user_id    ,
			String           nis_event_dt   ,
			String           ofc_cd      	,
			String           rt_type      	 ){
		this.lifid          = lifid;
		this.seq        	= seq;
		this.total_count    = total_count;
		this.rownum         = rownum;
		this.opcd  			= opcd;
		this.cntry_cd 		= cntry_cd;
		this.cust_cd  		= cust_cd;
		this.bnd       		= bnd;
		this.from_dt     	= from_dt;
		this.to_dt         	= to_dt;
		this.chg_curr       = chg_curr;
		this.lcl_curr       = lcl_curr;
		this.ex_rate      	= ex_rate;
		this.del_mk      	= del_mk;
		this.log_rgst_dt    = log_rgst_dt;
		this.log_updt_dt    = log_updt_dt;
		this.log_user_id    = log_user_id;
		this.nis_event_dt   = nis_event_dt;
		this.ofc_cd      	= ofc_cd;
		this.rt_type      	= rt_type;
	}

	// getter method is proceeding ..
	public String           getLifid		(){	return lifid        ;	}
	public String           getSeq			(){	return seq       	;	}
	public String           getTotal_count	(){	return total_count  ;	}
	public String           getRownum		(){	return rownum       ;	}
	public String           getOpcd			(){	return opcd 		;	}
	public String           getCntry_cd		(){	return cntry_cd		;	}
	public String           getCust_cd 		(){	return cust_cd 		;	}
	public String           getBnd			(){	return bnd      	;	}
	public String           getFrom_dt		(){	return from_dt    	;	}
	public String           getTo_dt		(){	return to_dt        ;	}
	public String           getChg_curr		(){	return chg_curr     ;	}
	public String           getLcl_curr		(){	return lcl_curr     ;	}
	public String           getEx_rate		(){	return ex_rate     	;	}
	public String           getDel_mk		(){	return del_mk     	;	}
	public String           getLog_rgst_dt	(){	return log_rgst_dt  ;	}
	public String           getLog_updt_dt	(){	return log_updt_dt  ;	}
	public String           getLog_user_id	(){	return log_user_id  ;	}
	public String           getNis_event_dt	(){	return nis_event_dt ;	}
	public String           getOfc_cd		(){	return ofc_cd       ;	}
	public String           getRt_type		(){	return rt_type     	;	}

	// setter method is proceeding ..
	public void setLifid        ( String           lifid        ){	this.lifid          = lifid         ;	}
	public void setSeq       	( String           seq        	){	this.seq        	= seq       	;	}
	public void setTotal_count  ( String           total_count  ){	this.total_count    = total_count   ;	}
	public void setRownum       ( String           rownum       ){	this.rownum         = rownum        ;	}
	public void setOpcd 		( String           opcd  		){	this.opcd  			= opcd 			;	}
	public void setCntry_cd		( String           cntry_cd 	){	this.cntry_cd 		= cntry_cd		;	}
	public void setCust_cd 		( String           cust_cd  	){	this.cust_cd  		= cust_cd 		;	}
	public void setBnd      	( String           bnd       	){	this.bnd       		= bnd      		;	}
	public void setFrom_dt      ( String           from_dt      ){	this.from_dt        = from_dt       ;	}
	public void setTo_dt   		( String           to_dt     	){	this.to_dt     		= to_dt    		;	}
	public void setChg_curr     ( String           chg_curr     ){	this.chg_curr       = chg_curr      ;	}
	public void setLcl_curr     ( String           lcl_curr     ){	this.lcl_curr       = lcl_curr      ;	}
	public void setEx_rate      ( String           ex_rate      ){	this.ex_rate        = ex_rate       ;	}
	public void setDel_mk     	( String           del_mk      	){	this.del_mk      	= del_mk     	;	}
	public void setLog_rgst_dt  ( String           log_rgst_dt  ){	this.log_rgst_dt    = log_rgst_dt   ;	}
	public void setLog_updt_dt  ( String           log_updt_dt  ){	this.log_updt_dt    = log_updt_dt   ;	}
	public void setLog_user_id  ( String           log_user_id  ){	this.log_user_id    = log_user_id   ;	}
	public void setNis_event_dt ( String           nis_event_dt ){	this.nis_event_dt   = nis_event_dt  ;	}
	public void setOfc_cd     	( String           ofc_cd      	){	this.ofc_cd      	= ofc_cd     	;	}
	public void setRt_type     	( String           rt_type      ){	this.rt_type      	= rt_type     	;	}

	public static AR_DLY_XCH_RT fromRequest(HttpServletRequest request) {
		AR_DLY_XCH_RT model = new AR_DLY_XCH_RT();
		try {
			model.setLifid          	(JSPUtil.getParameter(request, "lifid".trim(), ""));
			model.setSeq       			(JSPUtil.getParameter(request, "seq".trim(), ""));
			model.setTotal_count     	(JSPUtil.getParameter(request, "total_count".trim(), ""));
			model.setRownum         	(JSPUtil.getParameter(request, "rownum".trim(), ""));
			model.setOpcd 				(JSPUtil.getParameter(request, "opcd".trim(), ""));
			model.setCntry_cd			(JSPUtil.getParameter(request, "cntry_cd".trim(), ""));
			model.setCust_cd 			(JSPUtil.getParameter(request, "cust_cd".trim(), ""));
			model.setBnd      			(JSPUtil.getParameter(request, "bnd".trim(), ""));
			model.setFrom_dt          	(JSPUtil.getParameter(request, "from_dt".trim(), ""));
			model.setTo_dt    			(JSPUtil.getParameter(request, "to_dt".trim(), ""));
			model.setChg_curr        	(JSPUtil.getParameter(request, "chg_curr".trim(), ""));
			model.setLcl_curr      		(JSPUtil.getParameter(request, "lcl_curr".trim(), ""));
			model.setEx_rate          	(JSPUtil.getParameter(request, "ex_rate".trim(), ""));
			model.setDel_mk     		(JSPUtil.getParameter(request, "del_mk".trim(), ""));
			model.setLog_rgst_dt     	(JSPUtil.getParameter(request, "log_rgst_dt".trim(), ""));
			model.setLog_updt_dt     	(JSPUtil.getParameter(request, "log_updt_dt".trim(), ""));
			model.setLog_user_id     	(JSPUtil.getParameter(request, "log_user_id".trim(), ""));
			model.setNis_event_dt     	(JSPUtil.getParameter(request, "nis_event_dt".trim(), ""));
			model.setOfc_cd     		(JSPUtil.getParameter(request, "ofc_cd".trim(), ""));
			model.setRt_type     		(JSPUtil.getParameter(request, "rt_type".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		AR_DLY_XCH_RT model = null;
		Collection models = new ArrayList();
		try {
			String[] lifid          =  (JSPUtil.getParameter(request, "lifid".trim(), length));
			String[] seq        	=  (JSPUtil.getParameter(request, "seq".trim(), length));
			String[] total_count    =  (JSPUtil.getParameter(request, "total_count".trim(), length));
			String[] rownum         =  (JSPUtil.getParameter(request, "rownum".trim(), length));
			String[] opcd  			=  (JSPUtil.getParameter(request, "opcd".trim(), length));
			String[] cntry_cd 		=  (JSPUtil.getParameter(request, "cntry_cd".trim(), length));
			String[] cust_cd  		=  (JSPUtil.getParameter(request, "cust_cd".trim(), length));
			String[] bnd       		=  (JSPUtil.getParameter(request, "bnd".trim(), length));
			String[] from_dt        =  (JSPUtil.getParameter(request, "from_dt".trim(), length));
			String[] to_dt     		=  (JSPUtil.getParameter(request, "to_dt".trim(), length));
			String[] chg_curr       =  (JSPUtil.getParameter(request, "chg_curr".trim(), length));
			String[] lcl_curr       =  (JSPUtil.getParameter(request, "lcl_curr".trim(), length));
			String[] ex_rate        =  (JSPUtil.getParameter(request, "ex_rate".trim(), length));
			String[] del_mk      	=  (JSPUtil.getParameter(request, "del_mk".trim(), length));
			String[] log_rgst_dt    =  (JSPUtil.getParameter(request, "log_rgst_dt".trim(), length));
			String[] log_updt_dt    =  (JSPUtil.getParameter(request, "log_updt_dt".trim(), length));
			String[] log_user_id    =  (JSPUtil.getParameter(request, "log_user_id".trim(), length));
			String[] nis_event_dt   =  (JSPUtil.getParameter(request, "nis_event_dt".trim(), length));
			String[] ofc_cd      	=  (JSPUtil.getParameter(request, "ofc_cd".trim(), length));
			String[] rt_type      	=  (JSPUtil.getParameter(request, "rt_type".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new AR_DLY_XCH_RT();
				model.setLifid          	(lifid[i]);
				model.setSeq       			(seq[i]);
				model.setTotal_count     	(total_count[i]);
				model.setRownum         	(rownum[i]);
				model.setOpcd 				(opcd[i]);
				model.setCntry_cd			(cntry_cd[i]);
				model.setCust_cd 			(cust_cd[i]);
				model.setBnd      			(bnd[i]);
				model.setFrom_dt          	(from_dt[i]);
				model.setTo_dt    			(to_dt[i]);
				model.setChg_curr        	(chg_curr[i]);
				model.setLcl_curr      		(lcl_curr[i]);
				model.setEx_rate          	(ex_rate[i]);
				model.setDel_mk     		(del_mk[i]);
				model.setLog_rgst_dt     	(log_rgst_dt[i]);
				model.setLog_updt_dt     	(log_updt_dt[i]);
				model.setLog_user_id     	(log_user_id[i]);
				model.setNis_event_dt     	(nis_event_dt[i]);
				model.setOfc_cd     		(ofc_cd[i]);
				model.setRt_type     		(rt_type[i]);				
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		AR_DLY_XCH_RT model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] lifid          =  (JSPUtil.getParameter(request, prefix + "lifid".trim(), length));
			String[] seq        	=  (JSPUtil.getParameter(request, prefix + "seq".trim(), length));
			String[] total_count    =  (JSPUtil.getParameter(request, prefix + "total_count".trim(), length));
			String[] rownum         =  (JSPUtil.getParameter(request, prefix + "rownum".trim(), length));
			String[] opcd  			=  (JSPUtil.getParameter(request, prefix + "opcd".trim(), length));
			String[] cntry_cd 		=  (JSPUtil.getParameter(request, prefix + "cntry_cd".trim(), length));
			String[] cust_cd  		=  (JSPUtil.getParameter(request, prefix + "cust_cd".trim(), length));
			String[] bnd       		=  (JSPUtil.getParameter(request, prefix + "bnd".trim(), length));
			String[] from_dt        =  (JSPUtil.getParameter(request, prefix + "from_dt".trim(), length));
			String[] to_dt     		=  (JSPUtil.getParameter(request, prefix + "to_dt".trim(), length));
			String[] chg_curr       =  (JSPUtil.getParameter(request, prefix + "chg_curr".trim(), length));
			String[] lcl_curr       =  (JSPUtil.getParameter(request, prefix + "lcl_curr".trim(), length));
			String[] ex_rate        =  (JSPUtil.getParameter(request, prefix + "ex_rate".trim(), length));
			String[] del_mk      	=  (JSPUtil.getParameter(request, prefix + "del_mk".trim(), length));
			String[] log_rgst_dt    =  (JSPUtil.getParameter(request, prefix + "log_rgst_dt".trim(), length));
			String[] log_updt_dt    =  (JSPUtil.getParameter(request, prefix + "log_updt_dt".trim(), length));
			String[] log_user_id    =  (JSPUtil.getParameter(request, prefix + "log_user_id".trim(), length));
			String[] nis_event_dt   =  (JSPUtil.getParameter(request, prefix + "nis_event_dt".trim(), length));
			String[] ofc_cd      	=  (JSPUtil.getParameter(request, prefix + "ofc_cd".trim(), length));
			String[] rt_type      	=  (JSPUtil.getParameter(request,prefix +  "rt_type".trim(), length));

			for (int i = 0; i < length; i++) {
				model = new AR_DLY_XCH_RT();
				model.setLifid          	(lifid[i]);
				model.setSeq       			(seq[i]);
				model.setTotal_count     	(total_count[i]);
				model.setRownum         	(rownum[i]);
				model.setOpcd 				(opcd[i]);
				model.setCntry_cd			(cntry_cd[i]);
				model.setCust_cd 			(cust_cd[i]);
				model.setBnd      			(bnd[i]);
				model.setFrom_dt          	(from_dt[i]);
				model.setTo_dt    			(to_dt[i]);
				model.setChg_curr        	(chg_curr[i]);
				model.setLcl_curr      		(lcl_curr[i]);
				model.setEx_rate          	(ex_rate[i]);
				model.setDel_mk     		(del_mk[i]);
				model.setLog_rgst_dt     	(log_rgst_dt[i]);
				model.setLog_updt_dt     	(log_updt_dt[i]);
				model.setLog_user_id     	(log_user_id[i]);
				model.setNis_event_dt     	(nis_event_dt[i]);
				model.setOfc_cd     		(ofc_cd[i]);
				model.setRt_type     		(rt_type[i]);				
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
