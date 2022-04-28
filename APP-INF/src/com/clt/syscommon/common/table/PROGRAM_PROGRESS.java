/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : TB_PROGRESS.java
*@FileTitle : 진척관리
*Open Issues :
*Change history :
*@LastModifyDate : 2006-08-21
*@LastModifier : SeongWook Kim
*@LastVersion : 1.0
* 2006-08-21 SeongWook Kim
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
 * @author SeongWook Kim
 * @since J2EE 1.4
 */
public final class PROGRAM_PROGRESS implements java.io.Serializable {

	public static final String USER_TYPE_MANAGER = "M";
	public static final String USER_TYPE_GENERAL = "G";
	
	private String         ibflag              = "";
	private String         page_rows           = "";
	private String         reg_date            = "";
	private String         reg_seq             = "";
	private String         progress_prcnt      = "";
	private String         plan_st_time        = "";
	private String         plan_end_time       = "";
	private String         real_st_time        = "";
	private String         comments            = "";
	private String         prog_id             = "";
	private String         real_end_time       = "";
	private String         sel_usecase_id      = "ALL";
	private String         sel_week            = "";
	private String         sel_subsystem       = "";
	private String         application_system  = "";
	private String         unit_test_conf_date = "";
	private String         unit_test_yn        = "";
	private String         developer           = "";
	private String         session_gubun       = "";
	private String         program_type        = "";
	private String         link_id             = "";
	
	private String         prog_user_id        = "";
	private String         prog_user_password  = "";
	private String         prog_user_type      = "";
	private String         prog_user_app_code  = "";

	public PROGRAM_PROGRESS(){}

	public PROGRAM_PROGRESS(
			String         ibflag             ,
			String         page_rows          ,
			String         reg_date           ,
			String         reg_seq            ,
			String         progress_prcnt     ,
			String         plan_st_time       ,
			String         plan_end_time      ,
			String         real_st_time       ,
			String         comments           ,
			String         prog_id            ,
			String         real_end_time      ,
			String         sel_week           ,
			String         sel_subsystem      ,
			String         sel_usecase_id     ,
			String         unit_test_conf_date,
			String         unit_test_yn       ,
			String         developer          ){
		this.ibflag              = ibflag             ;
		this.page_rows           = page_rows          ;
		this.reg_date            = reg_date           ;
		this.reg_seq             = reg_seq            ;
		this.progress_prcnt      = progress_prcnt     ;
		this.plan_st_time        = plan_st_time       ;
		this.plan_end_time       = plan_end_time      ;
		this.real_st_time        = real_st_time       ;
		this.comments            = comments           ;
		this.prog_id             = prog_id            ;
		this.real_end_time       = real_end_time      ;
		this.sel_week            = sel_week           ;
		this.sel_subsystem       = sel_subsystem      ;
		this.sel_usecase_id      = sel_usecase_id     ;
		this.unit_test_conf_date = unit_test_conf_date;
		this.unit_test_yn        = unit_test_yn       ;
		this.developer           = developer          ;
	}

	// getter method is proceeding ..
	public String    getIbflag             (){	return ibflag        	     ;	}
	public String    getPage_rows          (){	return page_rows     	     ;	}
	public String    getReg_date           (){	return reg_date      	     ;	}
	public String    getReg_seq            (){	return reg_seq       	     ;	}
	public String    getProgress_prcnt     (){	return progress_prcnt	     ;	}
	public String    getPlan_st_time       (){	return plan_st_time  	     ;	}
	public String    getPlan_end_time      (){	return plan_end_time 	     ;	}
	public String    getReal_st_time       (){	return real_st_time  	     ;	}
	public String    getComments           (){	return comments      	     ;	}
	public String    getProg_id            (){	return prog_id       	     ;	}
	public String    getReal_end_time      (){	return real_end_time 	     ;	}
	public String    getSel_week           (){	return sel_week              ;	}
	public String    getSel_subsystem      (){	return sel_subsystem         ;	}
	public String    getSel_usecase_id     (){	return sel_usecase_id        ;	}
	public String    getUnit_test_conf_date(){	return unit_test_conf_date   ;	}
	public String    getUnit_test_yn       (){  return unit_test_yn          ;	}
	public String    getDeveloper          (){  return developer             ;	}
	public String getLink_id               (){	return link_id               ;	}
	public String getProgram_type          (){	return program_type          ;	}
	public String getSession_gubun         (){	return session_gubun         ;	}
	
	// setter method is proceeding ..
	public void setIbflag        ( String         ibflag         ){	this.ibflag         = ibflag        	;	}
	public void setPage_rows     ( String         page_rows      ){	this.page_rows      = page_rows     	;	}
	public void setReg_date      ( String         reg_date       ){	this.reg_date       = reg_date      	;	}
	public void setReg_seq       ( String         reg_seq        ){	this.reg_seq        = reg_seq       	;	}
	public void setProgress_prcnt( String         progress_prcnt ){	this.progress_prcnt = progress_prcnt	;	}
	public void setPlan_st_time  ( String         plan_st_time   ){	this.plan_st_time   = plan_st_time  	;	}
	public void setPlan_end_time ( String         plan_end_time  ){	this.plan_end_time  = plan_end_time 	;	}
	public void setReal_st_time  ( String         real_st_time   ){	this.real_st_time   = real_st_time  	;	}
	public void setComments      ( String         comments       ){	this.comments       = comments      	;	}
	public void setProg_id       ( String         prog_id        ){	this.prog_id        = prog_id       	;	}
	public void setReal_end_time ( String         real_end_time  ){	this.real_end_time  = real_end_time 	;	}
	public void setSel_week      ( String         sel_week       ){	this.sel_week       = sel_week 	        ;	}
	public void setSel_subsystem ( String         sel_subsystem ){	this.sel_subsystem     = sel_subsystem  ;	}
	public void setSel_usecase_id( String         sel_usecase_id ){	
		if(sel_usecase_id==null) 
			this.sel_usecase_id = "ALL";
		this.sel_usecase_id     = sel_usecase_id    	;	
	}
	public void setUnit_test_conf_date( String    unit_test_conf_date ){	this.unit_test_conf_date = unit_test_conf_date    ;	}
	public void setUnit_test_yn (String           unit_test_yn   ){ this.unit_test_yn   = unit_test_yn      ;	}
	public void setDeveloper    (String           developer      ){ this.developer      = developer         ;	}
	public void setLink_id      (String           link_id        ){	this.link_id        = link_id           ;	}
	public void setProgram_type (String           program_type   ){	this.program_type   = program_type      ;	}
	public void setSession_gubun(String           session_gubun  ){	this.session_gubun  = session_gubun     ;	}
	
	public static PROGRAM_PROGRESS fromRequest(HttpServletRequest request) {
		PROGRAM_PROGRESS model = new PROGRAM_PROGRESS();
		try {
			model.setIbflag        	(JSPUtil.getParameter(request, "ibflag        		".trim(), ""));
			model.setPage_rows     	(JSPUtil.getParameter(request, "page_rows     		".trim(), ""));
			model.setReg_date      	(JSPUtil.getParameter(request, "reg_date      		".trim(), ""));
			model.setReg_seq       	(JSPUtil.getParameter(request, "reg_seq       		".trim(), ""));
			model.setProgress_prcnt	(JSPUtil.getParameter(request, "progress_prcnt		".trim(), ""));
			model.setPlan_st_time  	(JSPUtil.getParameter(request, "plan_st_time  		".trim(), ""));
			model.setPlan_end_time 	(JSPUtil.getParameter(request, "plan_end_time 		".trim(), ""));
			model.setReal_st_time  	(JSPUtil.getParameter(request, "real_st_time  		".trim(), ""));
			model.setComments      	(JSPUtil.getParameter(request, "comments      		".trim(), ""));
			model.setProg_id       	(JSPUtil.getParameter(request, "prog_id       		".trim(), ""));
			model.setReal_end_time 	(JSPUtil.getParameter(request, "real_end_time 		".trim(), ""));
			model.setSel_week       (JSPUtil.getParameter(request, "sel_week   	        ".trim(), ""));
			model.setSel_subsystem  (JSPUtil.getParameter(request, "sel_subsystem   	".trim(), ""));
			model.setSel_usecase_id (JSPUtil.getParameter(request, "sel_usecase_id   	".trim(), ""));
			model.setApplication_system (JSPUtil.getParameter(request, "application_system   	".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		PROGRAM_PROGRESS model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag         =  (JSPUtil.getParameter(request, "ibflag        		".trim(), length));
			String[] page_rows      =  (JSPUtil.getParameter(request, "page_rows     		".trim(), length));
			String[] reg_date       =  (JSPUtil.getParameter(request, "reg_date      		".trim(), length));
			String[] reg_seq        =  (JSPUtil.getParameter(request, "reg_seq       		".trim(), length));
			String[] progress_prcnt =  (JSPUtil.getParameter(request, "progress_prcnt		".trim(), length));
			String[] plan_st_time   =  (JSPUtil.getParameter(request, "plan_st_time  		".trim(), length));
			String[] plan_end_time  =  (JSPUtil.getParameter(request, "plan_end_time 		".trim(), length));
			String[] real_st_time   =  (JSPUtil.getParameter(request, "real_st_time  		".trim(), length));
			String[] comments       =  (JSPUtil.getParameter(request, "comments      		".trim(), length));
			String[] prog_id        =  (JSPUtil.getParameter(request, "prog_id       		".trim(), length));
			String[] real_end_time  =  (JSPUtil.getParameter(request, "real_end_time 		".trim(), length));
			String[] sel_week       =  (JSPUtil.getParameter(request, "sel_week 		    ".trim(), length));
			String[] sel_subsystem  =  (JSPUtil.getParameter(request, "sel_subsystem 		".trim(), length));
			String[] sel_usecase_id =  (JSPUtil.getParameter(request, "sel_usecase_id  		".trim(), length));
			String[] application_system =  (JSPUtil.getParameter(request, "application_system  		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new PROGRAM_PROGRESS();
				model.setIbflag        		  (ibflag        	[i]);
				model.setPage_rows     		  (page_rows     	[i]);
				model.setReg_date      		  (reg_date      	[i]);
				model.setReg_seq       		  (reg_seq       	[i]);
				model.setProgress_prcnt		  (progress_prcnt	[i]);
				model.setPlan_st_time  		  (plan_st_time  	[i]);
				model.setPlan_end_time 		  (plan_end_time 	[i]);
				model.setReal_st_time  		  (real_st_time  	[i]);
				model.setComments      		  (comments      	[i]);
				model.setProg_id       		  (prog_id       	[i]);
				model.setReal_end_time 		  (real_end_time 	[i]);
				model.setSel_week             (sel_week         [i]);
				model.setSel_subsystem        (sel_subsystem    [i]);
				model.setSel_usecase_id       (sel_usecase_id   [i]);
				model.setApplication_system   (application_system   [i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		PROGRAM_PROGRESS model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
				String[] ibflag              =  (JSPUtil.getParameter(request, prefix + "ibflag        		".trim(), length));
				String[] page_rows           =  (JSPUtil.getParameter(request, prefix + "page_rows     		".trim(), length));
				String[] reg_date            =  (JSPUtil.getParameter(request, prefix + "reg_date      		".trim(), length));
				String[] reg_seq             =  (JSPUtil.getParameter(request, prefix + "reg_seq       		".trim(), length));
				String[] progress_prcnt      =  (JSPUtil.getParameter(request, prefix + "progress_prcnt		".trim(), length));
				String[] plan_st_time        =  (JSPUtil.getParameter(request, prefix + "plan_st_time  		".trim(), length));
				String[] plan_end_time       =  (JSPUtil.getParameter(request, prefix + "plan_end_time 		".trim(), length));
				String[] real_st_time        =  (JSPUtil.getParameter(request, prefix + "real_st_time  		".trim(), length));
				String[] comments            =  (JSPUtil.getParameter(request, prefix + "comments      		".trim(), length));
				String[] prog_id             =  (JSPUtil.getParameter(request, prefix + "prog_id       		".trim(), length));
				String[] real_end_time       =  (JSPUtil.getParameter(request, prefix + "real_end_time 		".trim(), length));
				String[] unit_test_conf_date =  (JSPUtil.getParameter(request, prefix + "unit_test_conf_date".trim(), length));
				String[] unit_test_yn        =  (JSPUtil.getParameter(request, prefix + "unit_test_yn       ".trim(), length));
				String[] developer           =  (JSPUtil.getParameter(request, prefix + "developer          ".trim(), length));
				String[] session_gubun       =  (JSPUtil.getParameter(request, prefix + "session_gubun      ".trim(), length));
				String[] program_type        =  (JSPUtil.getParameter(request, prefix + "program_type       ".trim(), length));
				String[] link_id             =  (JSPUtil.getParameter(request, prefix + "link_id            ".trim(), length));
				for (int i = 0; i < length; i++) {
					model = new PROGRAM_PROGRESS();
					model.setIbflag        		  ( ibflag        	    [i]);
					model.setPage_rows     		  ( page_rows     	    [i]);
					model.setReg_date      		  ( reg_date      	    [i]);
					model.setReg_seq       		  ( reg_seq       	    [i]);
					model.setProgress_prcnt		  ( progress_prcnt	    [i]);
					model.setPlan_st_time  		  ( plan_st_time  	    [i]);
					model.setPlan_end_time 		  ( plan_end_time 	    [i]);
					model.setReal_st_time  		  ( real_st_time  	    [i]);
					model.setComments      		  ( comments      	    [i]);
					model.setProg_id       		  ( prog_id       	    [i]);
					model.setReal_end_time 		  ( real_end_time 	    [i]);
					model.setUnit_test_conf_date  ( unit_test_conf_date [i]);
					model.setUnit_test_yn         ( unit_test_yn        [i]);
					model.setDeveloper            ( developer           [i]);
					model.setSession_gubun        ( session_gubun       [i]);
					model.setProgram_type         ( program_type        [i]);
					model.setLink_id              ( link_id             [i]);
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

	public String getProg_user_id() {
		return prog_user_id;
	}

	public void setProg_user_id(String prog_user_id) {
		this.prog_user_id = prog_user_id;
	}

	public String getProg_user_password() {
		return prog_user_password;
	}

	public void setProg_user_password(String prog_user_password) {
		this.prog_user_password = prog_user_password;
	}

	public String getProg_user_type() {
		return prog_user_type;
	}

	public void setProg_user_type(String prog_user_type) {
		this.prog_user_type = prog_user_type;
	}

	public String getProg_user_app_code() {
		return prog_user_app_code;
	}

	public void setProg_user_app_code(String prog_user_app_code) {
		this.prog_user_app_code = prog_user_app_code;
	}

	public String getApplication_system() {
		return application_system;
	}

	public void setApplication_system(String application_system) {
		this.application_system = application_system;
	}

}
