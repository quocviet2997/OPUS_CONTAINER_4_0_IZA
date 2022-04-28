/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : COM_PROGRAM.java
*@FileTitle : 공통코드검색
*Open Issues :
*Change history :
*@LastModifyDate : 2006-09-15
*@LastModifier : HOESOO_JANG
*@LastVersion : 1.0
* 2006-09-15 HOESOO_JANG
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
 * @author HOESOO_JANG
 * @since J2EE 1.4
 */
public final class COM_PROGRAM implements java.io.Serializable {

	private String         ibflag         = "";
	private String         page_rows      = "";
	private String         pgm_no         = "";
	private String         pgm_appl_cd    = "";
	private String         pgm_sub_sys_cd = "";
	private String         pgm_lvl_div_cd = "";
	private String         pgm_tp_cd      = "";
	private String         pgm_nm         = "";
	private String         pgm_desc       = "";
	private String         pgm_url        = "";
	private String         pgm_mnu_div_cd = "";
	private String         pgm_sts_cd     = "";
	private String         dev_nm         = "";
	private String         dev_dt         = "";
	private String         modi_dt        = "";
	private String         popup_flg      = "";
	private String         use_flg        = "";
	private String         cre_usr_id     = "";
	private String         cre_dt         = "";
	private String         upd_usr_id     = "";
	private String         upd_dt         = "";

	public COM_PROGRAM(){}

	public COM_PROGRAM(
			String         ibflag        ,
			String         page_rows     ,
			String         pgm_no        ,
			String         pgm_appl_cd   ,
			String         pgm_sub_sys_cd,
			String         pgm_lvl_div_cd,
			String         pgm_tp_cd     ,
			String         pgm_nm        ,
			String         pgm_desc      ,
			String         pgm_url       ,
			String         pgm_mnu_div_cd,
			String         pgm_sts_cd    ,
			String         dev_nm        ,
			String         dev_dt        ,
			String         modi_dt       ,
			String         popup_flg     ,
			String         use_flg       ,
			String         cre_usr_id    ,
			String         cre_dt        ,
			String         upd_usr_id    ,
			String         upd_dt        ){
		this.ibflag         = ibflag        ;
		this.page_rows      = page_rows     ;
		this.pgm_no         = pgm_no        ;
		this.pgm_appl_cd    = pgm_appl_cd   ;
		this.pgm_sub_sys_cd = pgm_sub_sys_cd;
		this.pgm_lvl_div_cd = pgm_lvl_div_cd;
		this.pgm_tp_cd      = pgm_tp_cd     ;
		this.pgm_nm         = pgm_nm        ;
		this.pgm_desc       = pgm_desc      ;
		this.pgm_url        = pgm_url       ;
		this.pgm_mnu_div_cd = pgm_mnu_div_cd;
		this.pgm_sts_cd     = pgm_sts_cd    ;
		this.dev_nm         = dev_nm        ;
		this.dev_dt         = dev_dt        ;
		this.modi_dt        = modi_dt       ;
		this.popup_flg      = popup_flg     ;
		this.use_flg        = use_flg       ;
		this.cre_usr_id     = cre_usr_id    ;
		this.cre_dt         = cre_dt        ;
		this.upd_usr_id     = upd_usr_id    ;
		this.upd_dt         = upd_dt        ;
	}

	// getter method is proceeding ..
	public String         getIbflag        (){	return ibflag        	;	}
	public String         getPage_rows     (){	return page_rows     	;	}
	public String         getPgm_no        (){	return pgm_no        	;	}
	public String         getPgm_appl_cd   (){	return pgm_appl_cd   	;	}
	public String         getPgm_sub_sys_cd(){	return pgm_sub_sys_cd	;	}
	public String         getPgm_lvl_div_cd(){	return pgm_lvl_div_cd	;	}
	public String         getPgm_tp_cd     (){	return pgm_tp_cd     	;	}
	public String         getPgm_nm        (){	return pgm_nm        	;	}
	public String         getPgm_desc      (){	return pgm_desc      	;	}
	public String         getPgm_url       (){	return pgm_url       	;	}
	public String         getPgm_mnu_div_cd(){	return pgm_mnu_div_cd	;	}
	public String         getPgm_sts_cd    (){	return pgm_sts_cd    	;	}
	public String         getDev_nm        (){	return dev_nm        	;	}
	public String         getDev_dt        (){	return dev_dt        	;	}
	public String         getModi_dt       (){	return modi_dt       	;	}
	public String         getPopup_flg     (){	return popup_flg     	;	}
	public String         getUse_flg       (){	return use_flg       	;	}
	public String         getCre_usr_id    (){	return cre_usr_id    	;	}
	public String         getCre_dt        (){	return cre_dt        	;	}
	public String         getUpd_usr_id    (){	return upd_usr_id    	;	}
	public String         getUpd_dt        (){	return upd_dt        	;	}

	// setter method is proceeding ..
	public void setIbflag        ( String         ibflag         ){	this.ibflag         = ibflag        	;	}
	public void setPage_rows     ( String         page_rows      ){	this.page_rows      = page_rows     	;	}
	public void setPgm_no        ( String         pgm_no         ){	this.pgm_no         = pgm_no        	;	}
	public void setPgm_appl_cd   ( String         pgm_appl_cd    ){	this.pgm_appl_cd    = pgm_appl_cd   	;	}
	public void setPgm_sub_sys_cd( String         pgm_sub_sys_cd ){	this.pgm_sub_sys_cd = pgm_sub_sys_cd	;	}
	public void setPgm_lvl_div_cd( String         pgm_lvl_div_cd ){	this.pgm_lvl_div_cd = pgm_lvl_div_cd	;	}
	public void setPgm_tp_cd     ( String         pgm_tp_cd      ){	this.pgm_tp_cd      = pgm_tp_cd     	;	}
	public void setPgm_nm        ( String         pgm_nm         ){	this.pgm_nm         = pgm_nm        	;	}
	public void setPgm_desc      ( String         pgm_desc       ){	this.pgm_desc       = pgm_desc      	;	}
	public void setPgm_url       ( String         pgm_url        ){	this.pgm_url        = pgm_url       	;	}
	public void setPgm_mnu_div_cd( String         pgm_mnu_div_cd ){	this.pgm_mnu_div_cd = pgm_mnu_div_cd	;	}
	public void setPgm_sts_cd    ( String         pgm_sts_cd     ){	this.pgm_sts_cd     = pgm_sts_cd    	;	}
	public void setDev_nm        ( String         dev_nm         ){	this.dev_nm         = dev_nm        	;	}
	public void setDev_dt        ( String         dev_dt         ){	this.dev_dt         = dev_dt        	;	}
	public void setModi_dt       ( String         modi_dt        ){	this.modi_dt        = modi_dt       	;	}
	public void setPopup_flg     ( String         popup_flg      ){	this.popup_flg      = popup_flg     	;	}
	public void setUse_flg       ( String         use_flg        ){	this.use_flg        = use_flg       	;	}
	public void setCre_usr_id    ( String         cre_usr_id     ){	this.cre_usr_id     = cre_usr_id    	;	}
	public void setCre_dt        ( String         cre_dt         ){	this.cre_dt         = cre_dt        	;	}
	public void setUpd_usr_id    ( String         upd_usr_id     ){	this.upd_usr_id     = upd_usr_id    	;	}
	public void setUpd_dt        ( String         upd_dt         ){	this.upd_dt         = upd_dt        	;	}

	public static COM_PROGRAM fromRequest(HttpServletRequest request) {
		COM_PROGRAM model = new COM_PROGRAM();
		try {
			model.setIbflag        	(JSPUtil.getParameter(request, "ibflag        		".trim(), ""));
			model.setPage_rows     	(JSPUtil.getParameter(request, "page_rows     		".trim(), ""));
			model.setPgm_no        	(JSPUtil.getParameter(request, "pgm_no        		".trim(), ""));
			model.setPgm_appl_cd   	(JSPUtil.getParameter(request, "pgm_appl_cd   		".trim(), ""));
			model.setPgm_sub_sys_cd	(JSPUtil.getParameter(request, "pgm_sub_sys_cd		".trim(), ""));
			model.setPgm_lvl_div_cd	(JSPUtil.getParameter(request, "pgm_lvl_div_cd		".trim(), ""));
			model.setPgm_tp_cd     	(JSPUtil.getParameter(request, "pgm_tp_cd     		".trim(), ""));
			model.setPgm_nm        	(JSPUtil.getParameter(request, "pgm_nm        		".trim(), ""));
			model.setPgm_desc      	(JSPUtil.getParameter(request, "pgm_desc      		".trim(), ""));
			model.setPgm_url       	(JSPUtil.getParameter(request, "pgm_url       		".trim(), ""));
			model.setPgm_mnu_div_cd	(JSPUtil.getParameter(request, "pgm_mnu_div_cd		".trim(), ""));
			model.setPgm_sts_cd    	(JSPUtil.getParameter(request, "pgm_sts_cd    		".trim(), ""));
			model.setDev_nm        	(JSPUtil.getParameter(request, "dev_nm        		".trim(), ""));
			model.setDev_dt        	(JSPUtil.getParameter(request, "dev_dt        		".trim(), ""));
			model.setModi_dt       	(JSPUtil.getParameter(request, "modi_dt       		".trim(), ""));
			model.setPopup_flg     	(JSPUtil.getParameter(request, "popup_flg     		".trim(), ""));
			model.setUse_flg       	(JSPUtil.getParameter(request, "use_flg       		".trim(), ""));
			model.setCre_usr_id    	(JSPUtil.getParameter(request, "cre_usr_id    		".trim(), ""));
			model.setCre_dt        	(JSPUtil.getParameter(request, "cre_dt        		".trim(), ""));
			model.setUpd_usr_id    	(JSPUtil.getParameter(request, "upd_usr_id    		".trim(), ""));
			model.setUpd_dt        	(JSPUtil.getParameter(request, "upd_dt        		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		COM_PROGRAM model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag         =  (JSPUtil.getParameter(request, "ibflag        		".trim(), length));
			String[] page_rows      =  (JSPUtil.getParameter(request, "page_rows     		".trim(), length));
			String[] pgm_no         =  (JSPUtil.getParameter(request, "pgm_no        		".trim(), length));
			String[] pgm_appl_cd    =  (JSPUtil.getParameter(request, "pgm_appl_cd   		".trim(), length));
			String[] pgm_sub_sys_cd =  (JSPUtil.getParameter(request, "pgm_sub_sys_cd		".trim(), length));
			String[] pgm_lvl_div_cd =  (JSPUtil.getParameter(request, "pgm_lvl_div_cd		".trim(), length));
			String[] pgm_tp_cd      =  (JSPUtil.getParameter(request, "pgm_tp_cd     		".trim(), length));
			String[] pgm_nm         =  (JSPUtil.getParameter(request, "pgm_nm        		".trim(), length));
			String[] pgm_desc       =  (JSPUtil.getParameter(request, "pgm_desc      		".trim(), length));
			String[] pgm_url        =  (JSPUtil.getParameter(request, "pgm_url       		".trim(), length));
			String[] pgm_mnu_div_cd =  (JSPUtil.getParameter(request, "pgm_mnu_div_cd		".trim(), length));
			String[] pgm_sts_cd     =  (JSPUtil.getParameter(request, "pgm_sts_cd    		".trim(), length));
			String[] dev_nm         =  (JSPUtil.getParameter(request, "dev_nm        		".trim(), length));
			String[] dev_dt         =  (JSPUtil.getParameter(request, "dev_dt        		".trim(), length));
			String[] modi_dt        =  (JSPUtil.getParameter(request, "modi_dt       		".trim(), length));
			String[] popup_flg      =  (JSPUtil.getParameter(request, "popup_flg     		".trim(), length));
			String[] use_flg        =  (JSPUtil.getParameter(request, "use_flg       		".trim(), length));
			String[] cre_usr_id     =  (JSPUtil.getParameter(request, "cre_usr_id    		".trim(), length));
			String[] cre_dt         =  (JSPUtil.getParameter(request, "cre_dt        		".trim(), length));
			String[] upd_usr_id     =  (JSPUtil.getParameter(request, "upd_usr_id    		".trim(), length));
			String[] upd_dt         =  (JSPUtil.getParameter(request, "upd_dt        		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new COM_PROGRAM();
				model.setIbflag        		  (ibflag        	[i]);
				model.setPage_rows     		  (page_rows     	[i]);
				model.setPgm_no        		  (pgm_no        	[i]);
				model.setPgm_appl_cd   		  (pgm_appl_cd   	[i]);
				model.setPgm_sub_sys_cd		  (pgm_sub_sys_cd	[i]);
				model.setPgm_lvl_div_cd		  (pgm_lvl_div_cd	[i]);
				model.setPgm_tp_cd     		  (pgm_tp_cd     	[i]);
				model.setPgm_nm        		  (pgm_nm        	[i]);
				model.setPgm_desc      		  (pgm_desc      	[i]);
				model.setPgm_url       		  (pgm_url       	[i]);
				model.setPgm_mnu_div_cd		  (pgm_mnu_div_cd	[i]);
				model.setPgm_sts_cd    		  (pgm_sts_cd    	[i]);
				model.setDev_nm        		  (dev_nm        	[i]);
				model.setDev_dt        		  (dev_dt        	[i]);
				model.setModi_dt       		  (modi_dt       	[i]);
				model.setPopup_flg     		  (popup_flg     	[i]);
				model.setUse_flg       		  (use_flg       	[i]);
				model.setCre_usr_id    		  (cre_usr_id    	[i]);
				model.setCre_dt        		  (cre_dt        	[i]);
				model.setUpd_usr_id    		  (upd_usr_id    	[i]);
				model.setUpd_dt        		  (upd_dt        	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		COM_PROGRAM model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag         =  (JSPUtil.getParameter(request, prefix + "ibflag        		".trim(), length));
			String[] page_rows      =  (JSPUtil.getParameter(request, prefix + "page_rows     		".trim(), length));
			String[] pgm_no         =  (JSPUtil.getParameter(request, prefix + "pgm_no        		".trim(), length));
			String[] pgm_appl_cd    =  (JSPUtil.getParameter(request, prefix + "pgm_appl_cd   		".trim(), length));
			String[] pgm_sub_sys_cd =  (JSPUtil.getParameter(request, prefix + "pgm_sub_sys_cd		".trim(), length));
			String[] pgm_lvl_div_cd =  (JSPUtil.getParameter(request, prefix + "pgm_lvl_div_cd		".trim(), length));
			String[] pgm_tp_cd      =  (JSPUtil.getParameter(request, prefix + "pgm_tp_cd     		".trim(), length));
			String[] pgm_nm         =  (JSPUtil.getParameter(request, prefix + "pgm_nm        		".trim(), length));
			String[] pgm_desc       =  (JSPUtil.getParameter(request, prefix + "pgm_desc      		".trim(), length));
			String[] pgm_url        =  (JSPUtil.getParameter(request, prefix + "pgm_url       		".trim(), length));
			String[] pgm_mnu_div_cd =  (JSPUtil.getParameter(request, prefix + "pgm_mnu_div_cd		".trim(), length));
			String[] pgm_sts_cd     =  (JSPUtil.getParameter(request, prefix + "pgm_sts_cd    		".trim(), length));
			String[] dev_nm         =  (JSPUtil.getParameter(request, prefix + "dev_nm        		".trim(), length));
			String[] dev_dt         =  (JSPUtil.getParameter(request, prefix + "dev_dt        		".trim(), length));
			String[] modi_dt        =  (JSPUtil.getParameter(request, prefix + "modi_dt       		".trim(), length));
			String[] popup_flg      =  (JSPUtil.getParameter(request, prefix + "popup_flg     		".trim(), length));
			String[] use_flg        =  (JSPUtil.getParameter(request, prefix + "use_flg       		".trim(), length));
			String[] cre_usr_id     =  (JSPUtil.getParameter(request, prefix + "cre_usr_id    		".trim(), length));
			String[] cre_dt         =  (JSPUtil.getParameter(request, prefix + "cre_dt        		".trim(), length));
			String[] upd_usr_id     =  (JSPUtil.getParameter(request, prefix + "upd_usr_id    		".trim(), length));
			String[] upd_dt         =  (JSPUtil.getParameter(request, prefix + "upd_dt        		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new COM_PROGRAM();
				model.setIbflag        		  ( ibflag        	[i]);
				model.setPage_rows     		  ( page_rows     	[i]);
				model.setPgm_no        		  ( pgm_no        	[i]);
				model.setPgm_appl_cd   		  ( pgm_appl_cd   	[i]);
				model.setPgm_sub_sys_cd		  ( pgm_sub_sys_cd	[i]);
				model.setPgm_lvl_div_cd		  ( pgm_lvl_div_cd	[i]);
				model.setPgm_tp_cd     		  ( pgm_tp_cd     	[i]);
				model.setPgm_nm        		  ( pgm_nm        	[i]);
				model.setPgm_desc      		  ( pgm_desc      	[i]);
				model.setPgm_url       		  ( pgm_url       	[i]);
				model.setPgm_mnu_div_cd		  ( pgm_mnu_div_cd	[i]);
				model.setPgm_sts_cd    		  ( pgm_sts_cd    	[i]);
				model.setDev_nm        		  ( dev_nm        	[i]);
				model.setDev_dt        		  ( dev_dt        	[i]);
				model.setModi_dt       		  ( modi_dt       	[i]);
				model.setPopup_flg     		  ( popup_flg     	[i]);
				model.setUse_flg       		  ( use_flg       	[i]);
				model.setCre_usr_id    		  ( cre_usr_id    	[i]);
				model.setCre_dt        		  ( cre_dt        	[i]);
				model.setUpd_usr_id    		  ( upd_usr_id    	[i]);
				model.setUpd_dt        		  ( upd_dt        	[i]);
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
