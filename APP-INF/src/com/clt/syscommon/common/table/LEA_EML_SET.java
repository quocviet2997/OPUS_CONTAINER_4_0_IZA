/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : LEA_EML_SET.java
*@FileTitle : Expense Accrual Batch History
*Open Issues :
*Change history :
*@LastModifyDate : 2007-02-08
*@LastModifier : Park Yeon Jin
*@LastVersion : 1.0
* 2007-02-08 Park Yeon Jin
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
public final class LEA_EML_SET implements java.io.Serializable {

	private String         ibflag         = "";
	private String         page_rows      = "";
	private String         pgm_sub_sys_cd = "";
	private String         eml_svr_ip     = "";
	private String         port_no        = "";
	private String         bat_fm_eml     = "";
	private String         bat_to_eml     = "";
	private String         bat_cc_eml     = "";
	private String         bat_subj_nm    = "";
	private String         bat_ctnt       = "";
	private String         bat_snd_flg    = "";
	private String         if_fm_eml      = "";
	private String         if_to_eml      = "";
	private String         if_cc_eml      = "";
	private String         if_subj_nm     = "";
	private String         if_ctnt        = "";
	private String         if_snd_flg     = "";
	private String         cre_usr_id     = "";
	private String         cre_dt         = "";
	private String         upd_usr_id     = "";
	private String         upd_dt         = "";

	public LEA_EML_SET(){}

	public LEA_EML_SET(
			String         ibflag        ,
			String         page_rows     ,
			String         pgm_sub_sys_cd,
			String         eml_svr_ip    ,
			String         port_no       ,
			String         bat_fm_eml    ,
			String         bat_to_eml    ,
			String         bat_cc_eml    ,
			String         bat_subj_nm   ,
			String         bat_ctnt      ,
			String         bat_snd_flg   ,
			String         if_fm_eml     ,
			String         if_to_eml     ,
			String         if_cc_eml     ,
			String         if_subj_nm    ,
			String         if_ctnt       ,
			String         if_snd_flg    ,
			String         cre_usr_id    ,
			String         cre_dt        ,
			String         upd_usr_id    ,
			String         upd_dt        ){
		this.ibflag         = ibflag        ;
		this.page_rows      = page_rows     ;
		this.pgm_sub_sys_cd = pgm_sub_sys_cd;
		this.eml_svr_ip     = eml_svr_ip    ;
		this.port_no        = port_no       ;
		this.bat_fm_eml     = bat_fm_eml    ;
		this.bat_to_eml     = bat_to_eml    ;
		this.bat_cc_eml     = bat_cc_eml    ;
		this.bat_subj_nm    = bat_subj_nm   ;
		this.bat_ctnt       = bat_ctnt      ;
		this.bat_snd_flg    = bat_snd_flg   ;
		this.if_fm_eml      = if_fm_eml     ;
		this.if_to_eml      = if_to_eml     ;
		this.if_cc_eml      = if_cc_eml     ;
		this.if_subj_nm     = if_subj_nm    ;
		this.if_ctnt        = if_ctnt       ;
		this.if_snd_flg     = if_snd_flg    ;
		this.cre_usr_id     = cre_usr_id    ;
		this.cre_dt         = cre_dt        ;
		this.upd_usr_id     = upd_usr_id    ;
		this.upd_dt         = upd_dt        ;
	}

	// getter method is proceeding ..
	public String         getIbflag        (){	return ibflag        	;	}
	public String         getPage_rows     (){	return page_rows     	;	}
	public String         getPgm_sub_sys_cd(){	return pgm_sub_sys_cd	;	}
	public String         getEml_svr_ip    (){	return eml_svr_ip    	;	}
	public String         getPort_no       (){	return port_no       	;	}
	public String         getBat_fm_eml    (){	return bat_fm_eml    	;	}
	public String         getBat_to_eml    (){	return bat_to_eml    	;	}
	public String         getBat_cc_eml    (){	return bat_cc_eml    	;	}
	public String         getBat_subj_nm   (){	return bat_subj_nm   	;	}
	public String         getBat_ctnt      (){	return bat_ctnt      	;	}
	public String         getBat_snd_flg   (){	return bat_snd_flg   	;	}
	public String         getIf_fm_eml     (){	return if_fm_eml     	;	}
	public String         getIf_to_eml     (){	return if_to_eml     	;	}
	public String         getIf_cc_eml     (){	return if_cc_eml     	;	}
	public String         getIf_subj_nm    (){	return if_subj_nm    	;	}
	public String         getIf_ctnt       (){	return if_ctnt       	;	}
	public String         getIf_snd_flg    (){	return if_snd_flg    	;	}
	public String         getCre_usr_id    (){	return cre_usr_id    	;	}
	public String         getCre_dt        (){	return cre_dt        	;	}
	public String         getUpd_usr_id    (){	return upd_usr_id    	;	}
	public String         getUpd_dt        (){	return upd_dt        	;	}

	// setter method is proceeding ..
	public void setIbflag        ( String         ibflag         ){	this.ibflag         = ibflag        	;	}
	public void setPage_rows     ( String         page_rows      ){	this.page_rows      = page_rows     	;	}
	public void setPgm_sub_sys_cd( String         pgm_sub_sys_cd ){	this.pgm_sub_sys_cd = pgm_sub_sys_cd	;	}
	public void setEml_svr_ip    ( String         eml_svr_ip     ){	this.eml_svr_ip     = eml_svr_ip    	;	}
	public void setPort_no       ( String         port_no        ){	this.port_no        = port_no       	;	}
	public void setBat_fm_eml    ( String         bat_fm_eml     ){	this.bat_fm_eml     = bat_fm_eml    	;	}
	public void setBat_to_eml    ( String         bat_to_eml     ){	this.bat_to_eml     = bat_to_eml    	;	}
	public void setBat_cc_eml    ( String         bat_cc_eml     ){	this.bat_cc_eml     = bat_cc_eml    	;	}
	public void setBat_subj_nm   ( String         bat_subj_nm    ){	this.bat_subj_nm    = bat_subj_nm   	;	}
	public void setBat_ctnt      ( String         bat_ctnt       ){	this.bat_ctnt       = bat_ctnt      	;	}
	public void setBat_snd_flg   ( String         bat_snd_flg    ){	this.bat_snd_flg    = bat_snd_flg   	;	}
	public void setIf_fm_eml     ( String         if_fm_eml      ){	this.if_fm_eml      = if_fm_eml     	;	}
	public void setIf_to_eml     ( String         if_to_eml      ){	this.if_to_eml      = if_to_eml     	;	}
	public void setIf_cc_eml     ( String         if_cc_eml      ){	this.if_cc_eml      = if_cc_eml     	;	}
	public void setIf_subj_nm    ( String         if_subj_nm     ){	this.if_subj_nm     = if_subj_nm    	;	}
	public void setIf_ctnt       ( String         if_ctnt        ){	this.if_ctnt        = if_ctnt       	;	}
	public void setIf_snd_flg    ( String         if_snd_flg     ){	this.if_snd_flg     = if_snd_flg    	;	}
	public void setCre_usr_id    ( String         cre_usr_id     ){	this.cre_usr_id     = cre_usr_id    	;	}
	public void setCre_dt        ( String         cre_dt         ){	this.cre_dt         = cre_dt        	;	}
	public void setUpd_usr_id    ( String         upd_usr_id     ){	this.upd_usr_id     = upd_usr_id    	;	}
	public void setUpd_dt        ( String         upd_dt         ){	this.upd_dt         = upd_dt        	;	}

	public static LEA_EML_SET fromRequest(HttpServletRequest request) {
		LEA_EML_SET model = new LEA_EML_SET();
		try {
			model.setIbflag        	(JSPUtil.getParameter(request, "ibflag        		".trim(), ""));
			model.setPage_rows     	(JSPUtil.getParameter(request, "page_rows     		".trim(), ""));
			model.setPgm_sub_sys_cd	(JSPUtil.getParameter(request, "pgm_sub_sys_cd		".trim(), ""));
			model.setEml_svr_ip    	(JSPUtil.getParameter(request, "eml_svr_ip    		".trim(), ""));
			model.setPort_no       	(JSPUtil.getParameter(request, "port_no       		".trim(), ""));
			model.setBat_fm_eml    	(JSPUtil.getParameter(request, "bat_fm_eml    		".trim(), ""));
			model.setBat_to_eml    	(JSPUtil.getParameter(request, "bat_to_eml    		".trim(), ""));
			model.setBat_cc_eml    	(JSPUtil.getParameter(request, "bat_cc_eml    		".trim(), ""));
			model.setBat_subj_nm   	(JSPUtil.getParameter(request, "bat_subj_nm   		".trim(), ""));
			model.setBat_ctnt      	(JSPUtil.getParameter(request, "bat_ctnt      		".trim(), ""));
			model.setBat_snd_flg   	(JSPUtil.getParameter(request, "bat_snd_flg   		".trim(), ""));
			model.setIf_fm_eml     	(JSPUtil.getParameter(request, "if_fm_eml     		".trim(), ""));
			model.setIf_to_eml     	(JSPUtil.getParameter(request, "if_to_eml     		".trim(), ""));
			model.setIf_cc_eml     	(JSPUtil.getParameter(request, "if_cc_eml     		".trim(), ""));
			model.setIf_subj_nm    	(JSPUtil.getParameter(request, "if_subj_nm    		".trim(), ""));
			model.setIf_ctnt       	(JSPUtil.getParameter(request, "if_ctnt       		".trim(), ""));
			model.setIf_snd_flg    	(JSPUtil.getParameter(request, "if_snd_flg    		".trim(), ""));
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
		LEA_EML_SET model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag         =  (JSPUtil.getParameter(request, "ibflag        		".trim(), length));
			String[] page_rows      =  (JSPUtil.getParameter(request, "page_rows     		".trim(), length));
			String[] pgm_sub_sys_cd =  (JSPUtil.getParameter(request, "pgm_sub_sys_cd		".trim(), length));
			String[] eml_svr_ip     =  (JSPUtil.getParameter(request, "eml_svr_ip    		".trim(), length));
			String[] port_no        =  (JSPUtil.getParameter(request, "port_no       		".trim(), length));
			String[] bat_fm_eml     =  (JSPUtil.getParameter(request, "bat_fm_eml    		".trim(), length));
			String[] bat_to_eml     =  (JSPUtil.getParameter(request, "bat_to_eml    		".trim(), length));
			String[] bat_cc_eml     =  (JSPUtil.getParameter(request, "bat_cc_eml    		".trim(), length));
			String[] bat_subj_nm    =  (JSPUtil.getParameter(request, "bat_subj_nm   		".trim(), length));
			String[] bat_ctnt       =  (JSPUtil.getParameter(request, "bat_ctnt      		".trim(), length));
			String[] bat_snd_flg    =  (JSPUtil.getParameter(request, "bat_snd_flg   		".trim(), length));
			String[] if_fm_eml      =  (JSPUtil.getParameter(request, "if_fm_eml     		".trim(), length));
			String[] if_to_eml      =  (JSPUtil.getParameter(request, "if_to_eml     		".trim(), length));
			String[] if_cc_eml      =  (JSPUtil.getParameter(request, "if_cc_eml     		".trim(), length));
			String[] if_subj_nm     =  (JSPUtil.getParameter(request, "if_subj_nm    		".trim(), length));
			String[] if_ctnt        =  (JSPUtil.getParameter(request, "if_ctnt       		".trim(), length));
			String[] if_snd_flg     =  (JSPUtil.getParameter(request, "if_snd_flg    		".trim(), length));
			String[] cre_usr_id     =  (JSPUtil.getParameter(request, "cre_usr_id    		".trim(), length));
			String[] cre_dt         =  (JSPUtil.getParameter(request, "cre_dt        		".trim(), length));
			String[] upd_usr_id     =  (JSPUtil.getParameter(request, "upd_usr_id    		".trim(), length));
			String[] upd_dt         =  (JSPUtil.getParameter(request, "upd_dt        		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new LEA_EML_SET();
				model.setIbflag        		  (ibflag        	[i]);
				model.setPage_rows     		  (page_rows     	[i]);
				model.setPgm_sub_sys_cd		  (pgm_sub_sys_cd	[i]);
				model.setEml_svr_ip    		  (eml_svr_ip    	[i]);
				model.setPort_no       		  (port_no       	[i]);
				model.setBat_fm_eml    		  (bat_fm_eml    	[i]);
				model.setBat_to_eml    		  (bat_to_eml    	[i]);
				model.setBat_cc_eml    		  (bat_cc_eml    	[i]);
				model.setBat_subj_nm   		  (bat_subj_nm   	[i]);
				model.setBat_ctnt      		  (bat_ctnt      	[i]);
				model.setBat_snd_flg   		  (bat_snd_flg   	[i]);
				model.setIf_fm_eml     		  (if_fm_eml     	[i]);
				model.setIf_to_eml     		  (if_to_eml     	[i]);
				model.setIf_cc_eml     		  (if_cc_eml     	[i]);
				model.setIf_subj_nm    		  (if_subj_nm    	[i]);
				model.setIf_ctnt       		  (if_ctnt       	[i]);
				model.setIf_snd_flg    		  (if_snd_flg    	[i]);
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
		LEA_EML_SET model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag         =  (JSPUtil.getParameter(request, prefix + "ibflag        		".trim(), length));
			String[] page_rows      =  (JSPUtil.getParameter(request, prefix + "page_rows     		".trim(), length));
			String[] pgm_sub_sys_cd =  (JSPUtil.getParameter(request, prefix + "pgm_sub_sys_cd		".trim(), length));
			String[] eml_svr_ip     =  (JSPUtil.getParameter(request, prefix + "eml_svr_ip    		".trim(), length));
			String[] port_no        =  (JSPUtil.getParameter(request, prefix + "port_no       		".trim(), length));
			String[] bat_fm_eml     =  (JSPUtil.getParameter(request, prefix + "bat_fm_eml    		".trim(), length));
			String[] bat_to_eml     =  (JSPUtil.getParameter(request, prefix + "bat_to_eml    		".trim(), length));
			String[] bat_cc_eml     =  (JSPUtil.getParameter(request, prefix + "bat_cc_eml    		".trim(), length));
			String[] bat_subj_nm    =  (JSPUtil.getParameter(request, prefix + "bat_subj_nm   		".trim(), length));
			String[] bat_ctnt       =  (JSPUtil.getParameter(request, prefix + "bat_ctnt      		".trim(), length));
			String[] bat_snd_flg    =  (JSPUtil.getParameter(request, prefix + "bat_snd_flg   		".trim(), length));
			String[] if_fm_eml      =  (JSPUtil.getParameter(request, prefix + "if_fm_eml     		".trim(), length));
			String[] if_to_eml      =  (JSPUtil.getParameter(request, prefix + "if_to_eml     		".trim(), length));
			String[] if_cc_eml      =  (JSPUtil.getParameter(request, prefix + "if_cc_eml     		".trim(), length));
			String[] if_subj_nm     =  (JSPUtil.getParameter(request, prefix + "if_subj_nm    		".trim(), length));
			String[] if_ctnt        =  (JSPUtil.getParameter(request, prefix + "if_ctnt       		".trim(), length));
			String[] if_snd_flg     =  (JSPUtil.getParameter(request, prefix + "if_snd_flg    		".trim(), length));
			String[] cre_usr_id     =  (JSPUtil.getParameter(request, prefix + "cre_usr_id    		".trim(), length));
			String[] cre_dt         =  (JSPUtil.getParameter(request, prefix + "cre_dt        		".trim(), length));
			String[] upd_usr_id     =  (JSPUtil.getParameter(request, prefix + "upd_usr_id    		".trim(), length));
			String[] upd_dt         =  (JSPUtil.getParameter(request, prefix + "upd_dt        		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new LEA_EML_SET();
				model.setIbflag        		  ( ibflag        	[i]);
				model.setPage_rows     		  ( page_rows     	[i]);
				model.setPgm_sub_sys_cd		  ( pgm_sub_sys_cd	[i]);
				model.setEml_svr_ip    		  ( eml_svr_ip    	[i]);
				model.setPort_no       		  ( port_no       	[i]);
				model.setBat_fm_eml    		  ( bat_fm_eml    	[i]);
				model.setBat_to_eml    		  ( bat_to_eml    	[i]);
				model.setBat_cc_eml    		  ( bat_cc_eml    	[i]);
				model.setBat_subj_nm   		  ( bat_subj_nm   	[i]);
				model.setBat_ctnt      		  ( bat_ctnt      	[i]);
				model.setBat_snd_flg   		  ( bat_snd_flg   	[i]);
				model.setIf_fm_eml     		  ( if_fm_eml     	[i]);
				model.setIf_to_eml     		  ( if_to_eml     	[i]);
				model.setIf_cc_eml     		  ( if_cc_eml     	[i]);
				model.setIf_subj_nm    		  ( if_subj_nm    	[i]);
				model.setIf_ctnt       		  ( if_ctnt       	[i]);
				model.setIf_snd_flg    		  ( if_snd_flg    	[i]);
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
