/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : LEA_ACCL_BAT_HIS.java
*@FileTitle : Expense Accrual Batch History
*Open Issues :
*Change history :
*@LastModifyDate : 2007-02-07
*@LastModifier : Park Yeon Jin
*@LastVersion : 1.0
* 2007-02-07 Park Yeon Jin
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
public final class LEA_ACCL_BAT_HIS implements java.io.Serializable {

	private String          ibflag          = "";
	private String          page_rows       = "";
	private String          exe_yrmon       = "";
	private String          bat_id          = "";
	private String          bat_st_dt       = "";
	private String          bat_end_dt      = "";
	private String          estm_st_dt      = "";
	private String          estm_end_dt     = "";
	private String          estm_knt        = "";
	private String          estm_upd_st_dt  = "";
	private String          estm_upd_end_dt = "";
	private String          estm_upd_knt    = "";
	private String          mapg_st_dt      = "";
	private String          mapg_end_dt     = "";
	private String          mapg_knt        = "";
	private String          aloc_st_dt      = "";
	private String          aloc_end_dt     = "";
	private String          aloc_knt        = "";
	private String          err_knt         = "";
	private String          bat_cmpl_flg    = "";
	private String          bat_rmk         = "";
	private String          cre_ofc_cd      = "";
	private String          cre_usr_id      = "";
	private String          cre_dt          = "";

	public LEA_ACCL_BAT_HIS(){}

	public LEA_ACCL_BAT_HIS(
			String          ibflag         ,
			String          page_rows      ,
			String          exe_yrmon      ,
			String          bat_id         ,
			String          bat_st_dt      ,
			String          bat_end_dt     ,
			String          estm_st_dt     ,
			String          estm_end_dt    ,
			String          estm_knt       ,
			String          estm_upd_st_dt ,
			String          estm_upd_end_dt,
			String          estm_upd_knt   ,
			String          mapg_st_dt     ,
			String          mapg_end_dt    ,
			String          mapg_knt       ,
			String          aloc_st_dt     ,
			String          aloc_end_dt    ,
			String          aloc_knt       ,
			String          err_knt        ,
			String          bat_cmpl_flg   ,
			String          bat_rmk        ,
			String          cre_ofc_cd     ,
			String          cre_usr_id     ,
			String          cre_dt         ){
		this.ibflag          = ibflag         ;
		this.page_rows       = page_rows      ;
		this.exe_yrmon       = exe_yrmon      ;
		this.bat_id          = bat_id         ;
		this.bat_st_dt       = bat_st_dt      ;
		this.bat_end_dt      = bat_end_dt     ;
		this.estm_st_dt      = estm_st_dt     ;
		this.estm_end_dt     = estm_end_dt    ;
		this.estm_knt        = estm_knt       ;
		this.estm_upd_st_dt  = estm_upd_st_dt ;
		this.estm_upd_end_dt = estm_upd_end_dt;
		this.estm_upd_knt    = estm_upd_knt   ;
		this.mapg_st_dt      = mapg_st_dt     ;
		this.mapg_end_dt     = mapg_end_dt    ;
		this.mapg_knt        = mapg_knt       ;
		this.aloc_st_dt      = aloc_st_dt     ;
		this.aloc_end_dt     = aloc_end_dt    ;
		this.aloc_knt        = aloc_knt       ;
		this.err_knt         = err_knt        ;
		this.bat_cmpl_flg    = bat_cmpl_flg   ;
		this.bat_rmk         = bat_rmk        ;
		this.cre_ofc_cd      = cre_ofc_cd     ;
		this.cre_usr_id      = cre_usr_id     ;
		this.cre_dt          = cre_dt         ;
	}

	// getter method is proceeding ..
	public String          getIbflag         (){	return ibflag         	;	}
	public String          getPage_rows      (){	return page_rows      	;	}
	public String          getExe_yrmon      (){	return exe_yrmon      	;	}
	public String          getBat_id         (){	return bat_id         	;	}
	public String          getBat_st_dt      (){	return bat_st_dt      	;	}
	public String          getBat_end_dt     (){	return bat_end_dt     	;	}
	public String          getEstm_st_dt     (){	return estm_st_dt     	;	}
	public String          getEstm_end_dt    (){	return estm_end_dt    	;	}
	public String          getEstm_knt       (){	return estm_knt       	;	}
	public String          getEstm_upd_st_dt (){	return estm_upd_st_dt 	;	}
	public String          getEstm_upd_end_dt(){	return estm_upd_end_dt	;	}
	public String          getEstm_upd_knt   (){	return estm_upd_knt   	;	}
	public String          getMapg_st_dt     (){	return mapg_st_dt     	;	}
	public String          getMapg_end_dt    (){	return mapg_end_dt    	;	}
	public String          getMapg_knt       (){	return mapg_knt       	;	}
	public String          getAloc_st_dt     (){	return aloc_st_dt     	;	}
	public String          getAloc_end_dt    (){	return aloc_end_dt    	;	}
	public String          getAloc_knt       (){	return aloc_knt       	;	}
	public String          getErr_knt        (){	return err_knt        	;	}
	public String          getBat_cmpl_flg   (){	return bat_cmpl_flg   	;	}
	public String          getBat_rmk        (){	return bat_rmk        	;	}
	public String          getCre_ofc_cd     (){	return cre_ofc_cd     	;	}
	public String          getCre_usr_id     (){	return cre_usr_id     	;	}
	public String          getCre_dt         (){	return cre_dt         	;	}

	// setter method is proceeding ..
	public void setIbflag         ( String          ibflag          ){	this.ibflag          = ibflag         	;	}
	public void setPage_rows      ( String          page_rows       ){	this.page_rows       = page_rows      	;	}
	public void setExe_yrmon      ( String          exe_yrmon       ){	this.exe_yrmon       = exe_yrmon      	;	}
	public void setBat_id         ( String          bat_id          ){	this.bat_id          = bat_id         	;	}
	public void setBat_st_dt      ( String          bat_st_dt       ){	this.bat_st_dt       = bat_st_dt      	;	}
	public void setBat_end_dt     ( String          bat_end_dt      ){	this.bat_end_dt      = bat_end_dt     	;	}
	public void setEstm_st_dt     ( String          estm_st_dt      ){	this.estm_st_dt      = estm_st_dt     	;	}
	public void setEstm_end_dt    ( String          estm_end_dt     ){	this.estm_end_dt     = estm_end_dt    	;	}
	public void setEstm_knt       ( String          estm_knt        ){	this.estm_knt        = estm_knt       	;	}
	public void setEstm_upd_st_dt ( String          estm_upd_st_dt  ){	this.estm_upd_st_dt  = estm_upd_st_dt 	;	}
	public void setEstm_upd_end_dt( String          estm_upd_end_dt ){	this.estm_upd_end_dt = estm_upd_end_dt	;	}
	public void setEstm_upd_knt   ( String          estm_upd_knt    ){	this.estm_upd_knt    = estm_upd_knt   	;	}
	public void setMapg_st_dt     ( String          mapg_st_dt      ){	this.mapg_st_dt      = mapg_st_dt     	;	}
	public void setMapg_end_dt    ( String          mapg_end_dt     ){	this.mapg_end_dt     = mapg_end_dt    	;	}
	public void setMapg_knt       ( String          mapg_knt        ){	this.mapg_knt        = mapg_knt       	;	}
	public void setAloc_st_dt     ( String          aloc_st_dt      ){	this.aloc_st_dt      = aloc_st_dt     	;	}
	public void setAloc_end_dt    ( String          aloc_end_dt     ){	this.aloc_end_dt     = aloc_end_dt    	;	}
	public void setAloc_knt       ( String          aloc_knt        ){	this.aloc_knt        = aloc_knt       	;	}
	public void setErr_knt        ( String          err_knt         ){	this.err_knt         = err_knt        	;	}
	public void setBat_cmpl_flg   ( String          bat_cmpl_flg    ){	this.bat_cmpl_flg    = bat_cmpl_flg   	;	}
	public void setBat_rmk        ( String          bat_rmk         ){	this.bat_rmk         = bat_rmk        	;	}
	public void setCre_ofc_cd     ( String          cre_ofc_cd      ){	this.cre_ofc_cd      = cre_ofc_cd     	;	}
	public void setCre_usr_id     ( String          cre_usr_id      ){	this.cre_usr_id      = cre_usr_id     	;	}
	public void setCre_dt         ( String          cre_dt          ){	this.cre_dt          = cre_dt         	;	}

	public static LEA_ACCL_BAT_HIS fromRequest(HttpServletRequest request) {
		LEA_ACCL_BAT_HIS model = new LEA_ACCL_BAT_HIS();
		try {
			model.setIbflag         	(JSPUtil.getParameter(request, "ibflag         		".trim(), ""));
			model.setPage_rows      	(JSPUtil.getParameter(request, "page_rows      		".trim(), ""));
			model.setExe_yrmon      	(JSPUtil.getParameter(request, "exe_yrmon      		".trim(), ""));
			model.setBat_id         	(JSPUtil.getParameter(request, "bat_id         		".trim(), ""));
			model.setBat_st_dt      	(JSPUtil.getParameter(request, "bat_st_dt      		".trim(), ""));
			model.setBat_end_dt     	(JSPUtil.getParameter(request, "bat_end_dt     		".trim(), ""));
			model.setEstm_st_dt     	(JSPUtil.getParameter(request, "estm_st_dt     		".trim(), ""));
			model.setEstm_end_dt    	(JSPUtil.getParameter(request, "estm_end_dt    		".trim(), ""));
			model.setEstm_knt       	(JSPUtil.getParameter(request, "estm_knt       		".trim(), ""));
			model.setEstm_upd_st_dt 	(JSPUtil.getParameter(request, "estm_upd_st_dt 		".trim(), ""));
			model.setEstm_upd_end_dt	(JSPUtil.getParameter(request, "estm_upd_end_dt		".trim(), ""));
			model.setEstm_upd_knt   	(JSPUtil.getParameter(request, "estm_upd_knt   		".trim(), ""));
			model.setMapg_st_dt     	(JSPUtil.getParameter(request, "mapg_st_dt     		".trim(), ""));
			model.setMapg_end_dt    	(JSPUtil.getParameter(request, "mapg_end_dt    		".trim(), ""));
			model.setMapg_knt       	(JSPUtil.getParameter(request, "mapg_knt       		".trim(), ""));
			model.setAloc_st_dt     	(JSPUtil.getParameter(request, "aloc_st_dt     		".trim(), ""));
			model.setAloc_end_dt    	(JSPUtil.getParameter(request, "aloc_end_dt    		".trim(), ""));
			model.setAloc_knt       	(JSPUtil.getParameter(request, "aloc_knt       		".trim(), ""));
			model.setErr_knt        	(JSPUtil.getParameter(request, "err_knt        		".trim(), ""));
			model.setBat_cmpl_flg   	(JSPUtil.getParameter(request, "bat_cmpl_flg   		".trim(), ""));
			model.setBat_rmk        	(JSPUtil.getParameter(request, "bat_rmk        		".trim(), ""));
			model.setCre_ofc_cd     	(JSPUtil.getParameter(request, "cre_ofc_cd     		".trim(), ""));
			model.setCre_usr_id     	(JSPUtil.getParameter(request, "cre_usr_id     		".trim(), ""));
			model.setCre_dt         	(JSPUtil.getParameter(request, "cre_dt         		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		LEA_ACCL_BAT_HIS model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag          =  (JSPUtil.getParameter(request, "ibflag         		".trim(), length));
			String[] page_rows       =  (JSPUtil.getParameter(request, "page_rows      		".trim(), length));
			String[] exe_yrmon       =  (JSPUtil.getParameter(request, "exe_yrmon      		".trim(), length));
			String[] bat_id          =  (JSPUtil.getParameter(request, "bat_id         		".trim(), length));
			String[] bat_st_dt       =  (JSPUtil.getParameter(request, "bat_st_dt      		".trim(), length));
			String[] bat_end_dt      =  (JSPUtil.getParameter(request, "bat_end_dt     		".trim(), length));
			String[] estm_st_dt      =  (JSPUtil.getParameter(request, "estm_st_dt     		".trim(), length));
			String[] estm_end_dt     =  (JSPUtil.getParameter(request, "estm_end_dt    		".trim(), length));
			String[] estm_knt        =  (JSPUtil.getParameter(request, "estm_knt       		".trim(), length));
			String[] estm_upd_st_dt  =  (JSPUtil.getParameter(request, "estm_upd_st_dt 		".trim(), length));
			String[] estm_upd_end_dt =  (JSPUtil.getParameter(request, "estm_upd_end_dt		".trim(), length));
			String[] estm_upd_knt    =  (JSPUtil.getParameter(request, "estm_upd_knt   		".trim(), length));
			String[] mapg_st_dt      =  (JSPUtil.getParameter(request, "mapg_st_dt     		".trim(), length));
			String[] mapg_end_dt     =  (JSPUtil.getParameter(request, "mapg_end_dt    		".trim(), length));
			String[] mapg_knt        =  (JSPUtil.getParameter(request, "mapg_knt       		".trim(), length));
			String[] aloc_st_dt      =  (JSPUtil.getParameter(request, "aloc_st_dt     		".trim(), length));
			String[] aloc_end_dt     =  (JSPUtil.getParameter(request, "aloc_end_dt    		".trim(), length));
			String[] aloc_knt        =  (JSPUtil.getParameter(request, "aloc_knt       		".trim(), length));
			String[] err_knt         =  (JSPUtil.getParameter(request, "err_knt        		".trim(), length));
			String[] bat_cmpl_flg    =  (JSPUtil.getParameter(request, "bat_cmpl_flg   		".trim(), length));
			String[] bat_rmk         =  (JSPUtil.getParameter(request, "bat_rmk        		".trim(), length));
			String[] cre_ofc_cd      =  (JSPUtil.getParameter(request, "cre_ofc_cd     		".trim(), length));
			String[] cre_usr_id      =  (JSPUtil.getParameter(request, "cre_usr_id     		".trim(), length));
			String[] cre_dt          =  (JSPUtil.getParameter(request, "cre_dt         		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new LEA_ACCL_BAT_HIS();
				model.setIbflag         		  (ibflag         	[i]);
				model.setPage_rows      		  (page_rows      	[i]);
				model.setExe_yrmon      		  (exe_yrmon      	[i]);
				model.setBat_id         		  (bat_id         	[i]);
				model.setBat_st_dt      		  (bat_st_dt      	[i]);
				model.setBat_end_dt     		  (bat_end_dt     	[i]);
				model.setEstm_st_dt     		  (estm_st_dt     	[i]);
				model.setEstm_end_dt    		  (estm_end_dt    	[i]);
				model.setEstm_knt       		  (estm_knt       	[i]);
				model.setEstm_upd_st_dt 		  (estm_upd_st_dt 	[i]);
				model.setEstm_upd_end_dt		  (estm_upd_end_dt	[i]);
				model.setEstm_upd_knt   		  (estm_upd_knt   	[i]);
				model.setMapg_st_dt     		  (mapg_st_dt     	[i]);
				model.setMapg_end_dt    		  (mapg_end_dt    	[i]);
				model.setMapg_knt       		  (mapg_knt       	[i]);
				model.setAloc_st_dt     		  (aloc_st_dt     	[i]);
				model.setAloc_end_dt    		  (aloc_end_dt    	[i]);
				model.setAloc_knt       		  (aloc_knt       	[i]);
				model.setErr_knt        		  (err_knt        	[i]);
				model.setBat_cmpl_flg   		  (bat_cmpl_flg   	[i]);
				model.setBat_rmk        		  (bat_rmk        	[i]);
				model.setCre_ofc_cd     		  (cre_ofc_cd     	[i]);
				model.setCre_usr_id     		  (cre_usr_id     	[i]);
				model.setCre_dt         		  (cre_dt         	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		LEA_ACCL_BAT_HIS model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag          =  (JSPUtil.getParameter(request, prefix + "ibflag         		".trim(), length));
			String[] page_rows       =  (JSPUtil.getParameter(request, prefix + "page_rows      		".trim(), length));
			String[] exe_yrmon       =  (JSPUtil.getParameter(request, prefix + "exe_yrmon      		".trim(), length));
			String[] bat_id          =  (JSPUtil.getParameter(request, prefix + "bat_id         		".trim(), length));
			String[] bat_st_dt       =  (JSPUtil.getParameter(request, prefix + "bat_st_dt      		".trim(), length));
			String[] bat_end_dt      =  (JSPUtil.getParameter(request, prefix + "bat_end_dt     		".trim(), length));
			String[] estm_st_dt      =  (JSPUtil.getParameter(request, prefix + "estm_st_dt     		".trim(), length));
			String[] estm_end_dt     =  (JSPUtil.getParameter(request, prefix + "estm_end_dt    		".trim(), length));
			String[] estm_knt        =  (JSPUtil.getParameter(request, prefix + "estm_knt       		".trim(), length));
			String[] estm_upd_st_dt  =  (JSPUtil.getParameter(request, prefix + "estm_upd_st_dt 		".trim(), length));
			String[] estm_upd_end_dt =  (JSPUtil.getParameter(request, prefix + "estm_upd_end_dt		".trim(), length));
			String[] estm_upd_knt    =  (JSPUtil.getParameter(request, prefix + "estm_upd_knt   		".trim(), length));
			String[] mapg_st_dt      =  (JSPUtil.getParameter(request, prefix + "mapg_st_dt     		".trim(), length));
			String[] mapg_end_dt     =  (JSPUtil.getParameter(request, prefix + "mapg_end_dt    		".trim(), length));
			String[] mapg_knt        =  (JSPUtil.getParameter(request, prefix + "mapg_knt       		".trim(), length));
			String[] aloc_st_dt      =  (JSPUtil.getParameter(request, prefix + "aloc_st_dt     		".trim(), length));
			String[] aloc_end_dt     =  (JSPUtil.getParameter(request, prefix + "aloc_end_dt    		".trim(), length));
			String[] aloc_knt        =  (JSPUtil.getParameter(request, prefix + "aloc_knt       		".trim(), length));
			String[] err_knt         =  (JSPUtil.getParameter(request, prefix + "err_knt        		".trim(), length));
			String[] bat_cmpl_flg    =  (JSPUtil.getParameter(request, prefix + "bat_cmpl_flg   		".trim(), length));
			String[] bat_rmk         =  (JSPUtil.getParameter(request, prefix + "bat_rmk        		".trim(), length));
			String[] cre_ofc_cd      =  (JSPUtil.getParameter(request, prefix + "cre_ofc_cd     		".trim(), length));
			String[] cre_usr_id      =  (JSPUtil.getParameter(request, prefix + "cre_usr_id     		".trim(), length));
			String[] cre_dt          =  (JSPUtil.getParameter(request, prefix + "cre_dt         		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new LEA_ACCL_BAT_HIS();
				model.setIbflag         		  ( ibflag         	[i]);
				model.setPage_rows      		  ( page_rows      	[i]);
				model.setExe_yrmon      		  ( exe_yrmon      	[i]);
				model.setBat_id         		  ( bat_id         	[i]);
				model.setBat_st_dt      		  ( bat_st_dt      	[i]);
				model.setBat_end_dt     		  ( bat_end_dt     	[i]);
				model.setEstm_st_dt     		  ( estm_st_dt     	[i]);
				model.setEstm_end_dt    		  ( estm_end_dt    	[i]);
				model.setEstm_knt       		  ( estm_knt       	[i]);
				model.setEstm_upd_st_dt 		  ( estm_upd_st_dt 	[i]);
				model.setEstm_upd_end_dt		  ( estm_upd_end_dt	[i]);
				model.setEstm_upd_knt   		  ( estm_upd_knt   	[i]);
				model.setMapg_st_dt     		  ( mapg_st_dt     	[i]);
				model.setMapg_end_dt    		  ( mapg_end_dt    	[i]);
				model.setMapg_knt       		  ( mapg_knt       	[i]);
				model.setAloc_st_dt     		  ( aloc_st_dt     	[i]);
				model.setAloc_end_dt    		  ( aloc_end_dt    	[i]);
				model.setAloc_knt       		  ( aloc_knt       	[i]);
				model.setErr_knt        		  ( err_knt        	[i]);
				model.setBat_cmpl_flg   		  ( bat_cmpl_flg   	[i]);
				model.setBat_rmk        		  ( bat_rmk        	[i]);
				model.setCre_ofc_cd     		  ( cre_ofc_cd     	[i]);
				model.setCre_usr_id     		  ( cre_usr_id     	[i]);
				model.setCre_dt         		  ( cre_dt         	[i]);
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
