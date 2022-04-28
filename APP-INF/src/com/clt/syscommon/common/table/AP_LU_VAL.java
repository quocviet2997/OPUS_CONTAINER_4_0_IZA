/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : AP_LU_VAL.java
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
public final class AP_LU_VAL implements java.io.Serializable {

	private String        ibflag        = "";
	private String        page_rows     = "";
	private String        lu_tp_ind_cd  = "";
	private String        lu_cd         = "";
	private String        lu_delt_flg   = "";
	private String        lu_ctnt       = "";
	private String        lu_desc       = "";
	private String        lu_st_act_dt  = "";
	private String        lu_end_act_dt = "";
	private String        cre_dt        = "";
	private String        cre_usr_id    = "";
	private String        upd_dt        = "";
	private String        upd_usr_id    = "";
	private String        eai_evnt_dt   = "";
	private String		  aval_flg		= "";

	public AP_LU_VAL(){}

	public AP_LU_VAL(
			String        ibflag       ,
			String        page_rows    ,
			String        lu_tp_ind_cd ,
			String        lu_cd        ,
			String        lu_delt_flg  ,
			String        lu_ctnt      ,
			String        lu_desc      ,
			String        lu_st_act_dt ,
			String        lu_end_act_dt,
			String        cre_dt       ,
			String        cre_usr_id   ,
			String        upd_dt       ,
			String        upd_usr_id   ,
			String        eai_evnt_dt  ,
			String		  aval_flg		){
		this.ibflag        = ibflag       ;
		this.page_rows     = page_rows    ;
		this.lu_tp_ind_cd  = lu_tp_ind_cd ;
		this.lu_cd         = lu_cd        ;
		this.lu_delt_flg   = lu_delt_flg  ;
		this.lu_ctnt       = lu_ctnt      ;
		this.lu_desc       = lu_desc      ;
		this.lu_st_act_dt  = lu_st_act_dt ;
		this.lu_end_act_dt = lu_end_act_dt;
		this.cre_dt        = cre_dt       ;
		this.cre_usr_id    = cre_usr_id   ;
		this.upd_dt        = upd_dt       ;
		this.upd_usr_id    = upd_usr_id   ;
		this.eai_evnt_dt   = eai_evnt_dt  ;
		this.aval_flg   = aval_flg  ;
	}

	// getter method is proceeding ..
	public String        getIbflag       (){	return ibflag       	;	}
	public String        getPage_rows    (){	return page_rows    	;	}
	public String        getLu_tp_ind_cd (){	return lu_tp_ind_cd 	;	}
	public String        getLu_cd        (){	return lu_cd        	;	}
	public String        getLu_delt_flg  (){	return lu_delt_flg  	;	}
	public String        getLu_ctnt      (){	return lu_ctnt      	;	}
	public String        getLu_desc      (){	return lu_desc      	;	}
	public String        getLu_st_act_dt (){	return lu_st_act_dt 	;	}
	public String        getLu_end_act_dt(){	return lu_end_act_dt	;	}
	public String        getCre_dt       (){	return cre_dt       	;	}
	public String        getCre_usr_id   (){	return cre_usr_id   	;	}
	public String        getUpd_dt       (){	return upd_dt       	;	}
	public String        getUpd_usr_id   (){	return upd_usr_id   	;	}
	public String        getEai_evnt_dt  (){	return eai_evnt_dt  	;	}
	public String        getAval_flg  (){	return aval_flg  	;	}

	// setter method is proceeding ..
	public void setIbflag       ( String        ibflag        ){	this.ibflag        = ibflag       	;	}
	public void setPage_rows    ( String        page_rows     ){	this.page_rows     = page_rows    	;	}
	public void setLu_tp_ind_cd ( String        lu_tp_ind_cd  ){	this.lu_tp_ind_cd  = lu_tp_ind_cd 	;	}
	public void setLu_cd        ( String        lu_cd         ){	this.lu_cd         = lu_cd        	;	}
	public void setLu_delt_flg  ( String        lu_delt_flg   ){	this.lu_delt_flg   = lu_delt_flg  	;	}
	public void setLu_ctnt      ( String        lu_ctnt       ){	this.lu_ctnt       = lu_ctnt      	;	}
	public void setLu_desc      ( String        lu_desc       ){	this.lu_desc       = lu_desc      	;	}
	public void setLu_st_act_dt ( String        lu_st_act_dt  ){	this.lu_st_act_dt  = lu_st_act_dt 	;	}
	public void setLu_end_act_dt( String        lu_end_act_dt ){	this.lu_end_act_dt = lu_end_act_dt	;	}
	public void setCre_dt       ( String        cre_dt        ){	this.cre_dt        = cre_dt       	;	}
	public void setCre_usr_id   ( String        cre_usr_id    ){	this.cre_usr_id    = cre_usr_id   	;	}
	public void setUpd_dt       ( String        upd_dt        ){	this.upd_dt        = upd_dt       	;	}
	public void setUpd_usr_id   ( String        upd_usr_id    ){	this.upd_usr_id    = upd_usr_id   	;	}
	public void setEai_evnt_dt  ( String        eai_evnt_dt   ){	this.eai_evnt_dt   = eai_evnt_dt  	;	}
	public void setAval_flg  ( String        aval_flg   ){	this.aval_flg   = aval_flg  	;	}

	public static AP_LU_VAL fromRequest(HttpServletRequest request) {
		AP_LU_VAL model = new AP_LU_VAL();
		try {
			model.setIbflag       	(JSPUtil.getParameter(request, "ibflag       		".trim(), ""));
			model.setPage_rows    	(JSPUtil.getParameter(request, "page_rows    		".trim(), ""));
			model.setLu_tp_ind_cd 	(JSPUtil.getParameter(request, "lu_tp_ind_cd 		".trim(), ""));
			model.setLu_cd        	(JSPUtil.getParameter(request, "lu_cd        		".trim(), ""));
			model.setLu_delt_flg  	(JSPUtil.getParameter(request, "lu_delt_flg  		".trim(), ""));
			model.setLu_ctnt      	(JSPUtil.getParameter(request, "lu_ctnt      		".trim(), ""));
			model.setLu_desc      	(JSPUtil.getParameter(request, "lu_desc      		".trim(), ""));
			model.setLu_st_act_dt 	(JSPUtil.getParameter(request, "lu_st_act_dt 		".trim(), ""));
			model.setLu_end_act_dt	(JSPUtil.getParameter(request, "lu_end_act_dt		".trim(), ""));
			model.setCre_dt       	(JSPUtil.getParameter(request, "cre_dt       		".trim(), ""));
			model.setCre_usr_id   	(JSPUtil.getParameter(request, "cre_usr_id   		".trim(), ""));
			model.setUpd_dt       	(JSPUtil.getParameter(request, "upd_dt       		".trim(), ""));
			model.setUpd_usr_id   	(JSPUtil.getParameter(request, "upd_usr_id   		".trim(), ""));
			model.setEai_evnt_dt  	(JSPUtil.getParameter(request, "eai_evnt_dt  		".trim(), ""));
			model.setAval_flg  	(JSPUtil.getParameter(request, "aval_flg  		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		AP_LU_VAL model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag        =  (JSPUtil.getParameter(request, "ibflag       		".trim(), length));
			String[] page_rows     =  (JSPUtil.getParameter(request, "page_rows    		".trim(), length));
			String[] lu_tp_ind_cd  =  (JSPUtil.getParameter(request, "lu_tp_ind_cd 		".trim(), length));
			String[] lu_cd         =  (JSPUtil.getParameter(request, "lu_cd        		".trim(), length));
			String[] lu_delt_flg   =  (JSPUtil.getParameter(request, "lu_delt_flg  		".trim(), length));
			String[] lu_ctnt       =  (JSPUtil.getParameter(request, "lu_ctnt      		".trim(), length));
			String[] lu_desc       =  (JSPUtil.getParameter(request, "lu_desc      		".trim(), length));
			String[] lu_st_act_dt  =  (JSPUtil.getParameter(request, "lu_st_act_dt 		".trim(), length));
			String[] lu_end_act_dt =  (JSPUtil.getParameter(request, "lu_end_act_dt		".trim(), length));
			String[] cre_dt        =  (JSPUtil.getParameter(request, "cre_dt       		".trim(), length));
			String[] cre_usr_id    =  (JSPUtil.getParameter(request, "cre_usr_id   		".trim(), length));
			String[] upd_dt        =  (JSPUtil.getParameter(request, "upd_dt       		".trim(), length));
			String[] upd_usr_id    =  (JSPUtil.getParameter(request, "upd_usr_id   		".trim(), length));
			String[] eai_evnt_dt   =  (JSPUtil.getParameter(request, "eai_evnt_dt  		".trim(), length));
			String[] aval_flg   =  (JSPUtil.getParameter(request, "aval_flg  		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new AP_LU_VAL();
				model.setIbflag       		  (ibflag       	[i]);
				model.setPage_rows    		  (page_rows    	[i]);
				model.setLu_tp_ind_cd 		  (lu_tp_ind_cd 	[i]);
				model.setLu_cd        		  (lu_cd        	[i]);
				model.setLu_delt_flg  		  (lu_delt_flg  	[i]);
				model.setLu_ctnt      		  (lu_ctnt      	[i]);
				model.setLu_desc      		  (lu_desc      	[i]);
				model.setLu_st_act_dt 		  (lu_st_act_dt 	[i]);
				model.setLu_end_act_dt		  (lu_end_act_dt	[i]);
				model.setCre_dt       		  (cre_dt       	[i]);
				model.setCre_usr_id   		  (cre_usr_id   	[i]);
				model.setUpd_dt       		  (upd_dt       	[i]);
				model.setUpd_usr_id   		  (upd_usr_id   	[i]);
				model.setEai_evnt_dt  		  (eai_evnt_dt  	[i]);
				model.setAval_flg  		  (aval_flg  	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		AP_LU_VAL model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag        =  (JSPUtil.getParameter(request, prefix + "ibflag       		".trim(), length));
			String[] page_rows     =  (JSPUtil.getParameter(request, prefix + "page_rows    		".trim(), length));
			String[] lu_tp_ind_cd  =  (JSPUtil.getParameter(request, prefix + "lu_tp_ind_cd 		".trim(), length));
			String[] lu_cd         =  (JSPUtil.getParameter(request, prefix + "lu_cd        		".trim(), length));
			String[] lu_delt_flg   =  (JSPUtil.getParameter(request, prefix + "lu_delt_flg  		".trim(), length));
			String[] lu_ctnt       =  (JSPUtil.getParameter(request, prefix + "lu_ctnt      		".trim(), length));
			String[] lu_desc       =  (JSPUtil.getParameter(request, prefix + "lu_desc      		".trim(), length));
			String[] lu_st_act_dt  =  (JSPUtil.getParameter(request, prefix + "lu_st_act_dt 		".trim(), length));
			String[] lu_end_act_dt =  (JSPUtil.getParameter(request, prefix + "lu_end_act_dt		".trim(), length));
			String[] cre_dt        =  (JSPUtil.getParameter(request, prefix + "cre_dt       		".trim(), length));
			String[] cre_usr_id    =  (JSPUtil.getParameter(request, prefix + "cre_usr_id   		".trim(), length));
			String[] upd_dt        =  (JSPUtil.getParameter(request, prefix + "upd_dt       		".trim(), length));
			String[] upd_usr_id    =  (JSPUtil.getParameter(request, prefix + "upd_usr_id   		".trim(), length));
			String[] eai_evnt_dt   =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt  		".trim(), length));
			String[] aval_flg   =  (JSPUtil.getParameter(request, prefix + "aval_flg  		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new AP_LU_VAL();
				model.setIbflag       		  ( ibflag       	[i]);
				model.setPage_rows    		  ( page_rows    	[i]);
				model.setLu_tp_ind_cd 		  ( lu_tp_ind_cd 	[i]);
				model.setLu_cd        		  ( lu_cd        	[i]);
				model.setLu_delt_flg  		  ( lu_delt_flg  	[i]);
				model.setLu_ctnt      		  ( lu_ctnt      	[i]);
				model.setLu_desc      		  ( lu_desc      	[i]);
				model.setLu_st_act_dt 		  ( lu_st_act_dt 	[i]);
				model.setLu_end_act_dt		  ( lu_end_act_dt	[i]);
				model.setCre_dt       		  ( cre_dt       	[i]);
				model.setCre_usr_id   		  ( cre_usr_id   	[i]);
				model.setUpd_dt       		  ( upd_dt       	[i]);
				model.setUpd_usr_id   		  ( upd_usr_id   	[i]);
				model.setEai_evnt_dt  		  ( eai_evnt_dt  	[i]);
				model.setAval_flg  		  ( aval_flg  	[i]);
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
