/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : COM_USER2.java
*@FileTitle : 사용자관리
*Open Issues :
*Change history :
*@LastModifyDate : 2006-09-15
*@LastModifier : SeongWook Kim
*@LastVersion : 1.0
* 2006-09-15 SeongWook Kim
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
public final class COM_USER2 implements java.io.Serializable {

	private String        ibflag        = "";
	private String        page_rows     = "";
	private String        usr_id        = "";
	private String        usr_nm        = "";
	private String        usr_pwd       = "";
	private String        use_flg       = "";
	private String        mphn_no       = "";
	private String        usr_eml       = "";
	private String        cnt_cd        = "";
	private String        lang_tp_cd    = "";
	private String        gmt_tmzn_cd   = "";
	private String        cnt_dt_fmt_cd = "";
	private String        cnt_no_fmt_cd = "";
	private String        xtn_phn_no    = "";
	private String        cre_usr_id    = "";
	private String        cre_dt        = "";
	private String        upd_usr_id    = "";
	private String        upd_dt        = "";
	
	private String        usr_locl_nm   = "";
	private String        usr_auth_tp_cd= "";
	private String        ofc_cd        = "";

	public COM_USER2(){}

	public COM_USER2(
			String        ibflag       ,
			String        page_rows    ,
			String        usr_id       ,
			String        usr_nm       ,
			String        usr_pwd      ,
			String        use_flg      ,
			String        mphn_no      ,
			String        usr_eml      ,
			String        cnt_cd       ,
			String        lang_tp_cd   ,
			String        gmt_tmzn_cd  ,
			String        cnt_dt_fmt_cd,
			String        cnt_no_fmt_cd,
			String        xtn_phn_no   ,
			String        cre_usr_id   ,
			String        cre_dt       ,
			String        upd_usr_id   ,
			String        upd_dt       ){
		this.ibflag        = ibflag       ;
		this.page_rows     = page_rows    ;
		this.usr_id        = usr_id       ;
		this.usr_nm        = usr_nm       ;
		this.usr_pwd       = usr_pwd      ;
		this.use_flg       = use_flg      ;
		this.mphn_no       = mphn_no      ;
		this.usr_eml       = usr_eml      ;
		this.cnt_cd        = cnt_cd       ;
		this.lang_tp_cd    = lang_tp_cd   ;
		this.gmt_tmzn_cd   = gmt_tmzn_cd  ;
		this.cnt_dt_fmt_cd = cnt_dt_fmt_cd;
		this.cnt_no_fmt_cd = cnt_no_fmt_cd;
		this.xtn_phn_no    = xtn_phn_no   ;
		this.cre_usr_id    = cre_usr_id   ;
		this.cre_dt        = cre_dt       ;
		this.upd_usr_id    = upd_usr_id   ;
		this.upd_dt        = upd_dt       ;
	}

	public COM_USER2(
			String        ibflag       ,
			String        page_rows    ,
			String        usr_id       ,
			String        usr_nm       ,
			String        usr_pwd      ,
			String        use_flg      ,
			String        mphn_no      ,
			String        usr_eml      ,
			String        cnt_cd       ,
			String        lang_tp_cd   ,
			String        gmt_tmzn_cd  ,
			String        cnt_dt_fmt_cd,
			String        cnt_no_fmt_cd,
			String        xtn_phn_no   ,
			String        cre_usr_id   ,
			String        cre_dt       ,
			String        upd_usr_id   ,
			String        upd_dt       ,
			String        usr_locl_nm  ,
			String        usr_auth_tp_cd,
			String        ofc_cd        ){
		this.ibflag        = ibflag       ;
		this.page_rows     = page_rows    ;
		this.usr_id        = usr_id       ;
		this.usr_nm        = usr_nm       ;
		this.usr_pwd       = usr_pwd      ;
		this.use_flg       = use_flg      ;
		this.mphn_no       = mphn_no      ;
		this.usr_eml       = usr_eml      ;
		this.cnt_cd        = cnt_cd       ;
		this.lang_tp_cd    = lang_tp_cd   ;
		this.gmt_tmzn_cd   = gmt_tmzn_cd  ;
		this.cnt_dt_fmt_cd = cnt_dt_fmt_cd;
		this.cnt_no_fmt_cd = cnt_no_fmt_cd;
		this.xtn_phn_no    = xtn_phn_no   ;
		this.cre_usr_id    = cre_usr_id   ;
		this.cre_dt        = cre_dt       ;
		this.upd_usr_id    = upd_usr_id   ;
		this.upd_dt        = upd_dt       ;
		this.usr_locl_nm   = usr_locl_nm  ;
		this.usr_auth_tp_cd= usr_auth_tp_cd       ;
		this.ofc_cd        = ofc_cd       ;
	}

	// getter method is proceeding ..
	public String        getIbflag       (){	return ibflag       	;	}
	public String        getPage_rows    (){	return page_rows    	;	}
	public String        getUsr_id       (){	return usr_id       	;	}
	public String        getUsr_nm       (){	return usr_nm       	;	}
	public String        getUsr_pwd      (){	return usr_pwd      	;	}
	public String        getUse_flg      (){	return use_flg      	;	}
	public String        getMphn_no      (){	return mphn_no      	;	}
	public String        getUsr_eml      (){	return usr_eml      	;	}
	public String        getCnt_cd       (){	return cnt_cd       	;	}
	public String        getLang_tp_cd   (){	return lang_tp_cd   	;	}
	public String        getGmt_tmzn_cd  (){	return gmt_tmzn_cd  	;	}
	public String        getCnt_dt_fmt_cd(){	return cnt_dt_fmt_cd	;	}
	public String        getCnt_no_fmt_cd(){	return cnt_no_fmt_cd	;	}
	public String        getXtn_phn_no   (){	return xtn_phn_no   	;	}
	public String        getCre_usr_id   (){	return cre_usr_id   	;	}
	public String        getCre_dt       (){	return cre_dt       	;	}
	public String        getUpd_usr_id   (){	return upd_usr_id   	;	}
	public String        getUpd_dt       (){	return upd_dt       	;	}
	public String        getUsr_locl_nm  (){	return usr_locl_nm      ;	}
	public String        getUsr_auth_tp_cd(){	return usr_auth_tp_cd   ;	}
	public String        getOfc_cd       (){	return ofc_cd           ;	}

	// setter method is proceeding ..
	public void setIbflag       ( String        ibflag        ){	this.ibflag        = ibflag       	;	}
	public void setPage_rows    ( String        page_rows     ){	this.page_rows     = page_rows    	;	}
	public void setUsr_id       ( String        usr_id        ){	this.usr_id        = usr_id       	;	}
	public void setUsr_nm       ( String        usr_nm        ){	this.usr_nm        = usr_nm       	;	}
	public void setUsr_pwd      ( String        usr_pwd       ){	this.usr_pwd       = usr_pwd      	;	}
	public void setUse_flg      ( String        use_flg       ){	this.use_flg       = use_flg      	;	}
	public void setMphn_no      ( String        mphn_no       ){	this.mphn_no       = mphn_no      	;	}
	public void setUsr_eml      ( String        usr_eml       ){	this.usr_eml       = usr_eml      	;	}
	public void setCnt_cd       ( String        cnt_cd        ){	this.cnt_cd        = cnt_cd       	;	}
	public void setLang_tp_cd   ( String        lang_tp_cd    ){	this.lang_tp_cd    = lang_tp_cd   	;	}
	public void setGmt_tmzn_cd  ( String        gmt_tmzn_cd   ){	this.gmt_tmzn_cd   = gmt_tmzn_cd  	;	}
	public void setCnt_dt_fmt_cd( String        cnt_dt_fmt_cd ){	this.cnt_dt_fmt_cd = cnt_dt_fmt_cd	;	}
	public void setCnt_no_fmt_cd( String        cnt_no_fmt_cd ){	this.cnt_no_fmt_cd = cnt_no_fmt_cd	;	}
	public void setXtn_phn_no   ( String        xtn_phn_no    ){	this.xtn_phn_no    = xtn_phn_no   	;	}
	public void setCre_usr_id   ( String        cre_usr_id    ){	this.cre_usr_id    = cre_usr_id   	;	}
	public void setCre_dt       ( String        cre_dt        ){	this.cre_dt        = cre_dt       	;	}
	public void setUpd_usr_id   ( String        upd_usr_id    ){	this.upd_usr_id    = upd_usr_id   	;	}
	public void setUpd_dt       ( String        upd_dt        ){	this.upd_dt        = upd_dt       	;	}
	public void setUsr_locl_nm  ( String        usr_locl_nm   ){	this.usr_locl_nm   = usr_locl_nm    ;	}
	public void setUsr_auth_tp_cd(String        usr_auth_tp_cd){	this.usr_auth_tp_cd = usr_auth_tp_cd;	}
	public void setOfc_cd       ( String        ofc_cd        ){	this.ofc_cd        = ofc_cd         ;	}
	
	public static COM_USER2 fromRequest(HttpServletRequest request) {
		COM_USER2 model = new COM_USER2();
		try {
			model.setIbflag       	(JSPUtil.getParameter(request, "ibflag       		".trim(), ""));
			model.setPage_rows    	(JSPUtil.getParameter(request, "page_rows    		".trim(), ""));
			model.setUsr_id       	(JSPUtil.getParameter(request, "usr_id       		".trim(), ""));
			model.setUsr_nm       	(JSPUtil.getParameter(request, "usr_nm       		".trim(), ""));
			model.setUsr_pwd      	(JSPUtil.getParameter(request, "usr_pwd      		".trim(), ""));
			model.setUse_flg      	(JSPUtil.getParameter(request, "use_flg      		".trim(), ""));
			model.setMphn_no      	(JSPUtil.getParameter(request, "mphn_no      		".trim(), ""));
			model.setUsr_eml      	(JSPUtil.getParameter(request, "usr_eml      		".trim(), ""));
			model.setCnt_cd       	(JSPUtil.getParameter(request, "cnt_cd       		".trim(), ""));
			model.setLang_tp_cd   	(JSPUtil.getParameter(request, "lang_tp_cd   		".trim(), ""));
			model.setGmt_tmzn_cd  	(JSPUtil.getParameter(request, "gmt_tmzn_cd  		".trim(), ""));
			model.setCnt_dt_fmt_cd	(JSPUtil.getParameter(request, "cnt_dt_fmt_cd		".trim(), ""));
			model.setCnt_no_fmt_cd	(JSPUtil.getParameter(request, "cnt_no_fmt_cd		".trim(), ""));
			model.setXtn_phn_no   	(JSPUtil.getParameter(request, "xtn_phn_no   		".trim(), ""));
			model.setCre_usr_id   	(JSPUtil.getParameter(request, "cre_usr_id   		".trim(), ""));
			model.setCre_dt       	(JSPUtil.getParameter(request, "cre_dt       		".trim(), ""));
			model.setUpd_usr_id   	(JSPUtil.getParameter(request, "upd_usr_id   		".trim(), ""));
			model.setUpd_dt       	(JSPUtil.getParameter(request, "upd_dt       		".trim(), ""));
			model.setUsr_locl_nm   	(JSPUtil.getParameter(request, "usr_locl_nm   		".trim(), ""));
			model.setUsr_auth_tp_cd (JSPUtil.getParameter(request, "usr_auth_tp_cd      ".trim(), ""));
			model.setOfc_cd         (JSPUtil.getParameter(request, "ofc_cd              ".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		COM_USER2 model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag        =  (JSPUtil.getParameter(request, "ibflag       		".trim(), length));
			String[] page_rows     =  (JSPUtil.getParameter(request, "page_rows    		".trim(), length));
			String[] usr_id        =  (JSPUtil.getParameter(request, "usr_id       		".trim(), length));
			String[] usr_nm        =  (JSPUtil.getParameter(request, "usr_nm       		".trim(), length));
			String[] usr_pwd       =  (JSPUtil.getParameter(request, "usr_pwd      		".trim(), length));
			String[] use_flg       =  (JSPUtil.getParameter(request, "use_flg      		".trim(), length));
			String[] mphn_no       =  (JSPUtil.getParameter(request, "mphn_no      		".trim(), length));
			String[] usr_eml       =  (JSPUtil.getParameter(request, "usr_eml      		".trim(), length));
			String[] cnt_cd        =  (JSPUtil.getParameter(request, "cnt_cd       		".trim(), length));
			String[] lang_tp_cd    =  (JSPUtil.getParameter(request, "lang_tp_cd   		".trim(), length));
			String[] gmt_tmzn_cd   =  (JSPUtil.getParameter(request, "gmt_tmzn_cd  		".trim(), length));
			String[] cnt_dt_fmt_cd =  (JSPUtil.getParameter(request, "cnt_dt_fmt_cd		".trim(), length));
			String[] cnt_no_fmt_cd =  (JSPUtil.getParameter(request, "cnt_no_fmt_cd		".trim(), length));
			String[] xtn_phn_no    =  (JSPUtil.getParameter(request, "xtn_phn_no   		".trim(), length));
			String[] cre_usr_id    =  (JSPUtil.getParameter(request, "cre_usr_id   		".trim(), length));
			String[] cre_dt        =  (JSPUtil.getParameter(request, "cre_dt       		".trim(), length));
			String[] upd_usr_id    =  (JSPUtil.getParameter(request, "upd_usr_id   		".trim(), length));
			String[] upd_dt        =  (JSPUtil.getParameter(request, "upd_dt       		".trim(), length));
			String[] usr_locl_nm   =  (JSPUtil.getParameter(request, "usr_locl_nm   	".trim(), length));
			String[] usr_auth_tp_cd=  (JSPUtil.getParameter(request, "usr_auth_tp_cd    ".trim(), length));
			String[] ofc_cd        =  (JSPUtil.getParameter(request, "ofc_cd            ".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new COM_USER2();
				model.setIbflag       		  (ibflag       	[i]);
				model.setPage_rows    		  (page_rows    	[i]);
				model.setUsr_id       		  (usr_id       	[i]);
				model.setUsr_nm       		  (usr_nm       	[i]);
				model.setUsr_pwd      		  (usr_pwd      	[i]);
				model.setUse_flg      		  (use_flg      	[i]);
				model.setMphn_no      		  (mphn_no      	[i]);
				model.setUsr_eml      		  (usr_eml      	[i]);
				model.setCnt_cd       		  (cnt_cd       	[i]);
				model.setLang_tp_cd   		  (lang_tp_cd   	[i]);
				model.setGmt_tmzn_cd  		  (gmt_tmzn_cd  	[i]);
				model.setCnt_dt_fmt_cd		  (cnt_dt_fmt_cd	[i]);
				model.setCnt_no_fmt_cd		  (cnt_no_fmt_cd	[i]);
				model.setXtn_phn_no   		  (xtn_phn_no   	[i]);
				model.setCre_usr_id   		  (cre_usr_id   	[i]);
				model.setCre_dt       		  (cre_dt       	[i]);
				model.setUpd_usr_id   		  (upd_usr_id   	[i]);
				model.setUpd_dt       		  (upd_dt       	[i]);
				model.setUsr_locl_nm   	      (usr_locl_nm   	[i]);
				model.setUsr_auth_tp_cd       (usr_auth_tp_cd   [i]);
				model.setOfc_cd               (ofc_cd   	    [i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		COM_USER2 model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag        =  (JSPUtil.getParameter(request, prefix + "ibflag       		".trim(), length));
			String[] page_rows     =  (JSPUtil.getParameter(request, prefix + "page_rows    		".trim(), length));
			String[] usr_id        =  (JSPUtil.getParameter(request, prefix + "usr_id       		".trim(), length));
			String[] usr_nm        =  (JSPUtil.getParameter(request, prefix + "usr_nm       		".trim(), length));
			String[] usr_pwd       =  (JSPUtil.getParameter(request, prefix + "usr_pwd      		".trim(), length));
			String[] use_flg       =  (JSPUtil.getParameter(request, prefix + "use_flg      		".trim(), length));
			String[] mphn_no       =  (JSPUtil.getParameter(request, prefix + "mphn_no      		".trim(), length));
			String[] usr_eml       =  (JSPUtil.getParameter(request, prefix + "usr_eml      		".trim(), length));
			String[] cnt_cd        =  (JSPUtil.getParameter(request, prefix + "cnt_cd       		".trim(), length));
			String[] lang_tp_cd    =  (JSPUtil.getParameter(request, prefix + "lang_tp_cd   		".trim(), length));
			String[] gmt_tmzn_cd   =  (JSPUtil.getParameter(request, prefix + "gmt_tmzn_cd  		".trim(), length));
			String[] cnt_dt_fmt_cd =  (JSPUtil.getParameter(request, prefix + "cnt_dt_fmt_cd		".trim(), length));
			String[] cnt_no_fmt_cd =  (JSPUtil.getParameter(request, prefix + "cnt_no_fmt_cd		".trim(), length));
			String[] xtn_phn_no    =  (JSPUtil.getParameter(request, prefix + "xtn_phn_no   		".trim(), length));
			String[] cre_usr_id    =  (JSPUtil.getParameter(request, prefix + "cre_usr_id   		".trim(), length));
			String[] cre_dt        =  (JSPUtil.getParameter(request, prefix + "cre_dt       		".trim(), length));
			String[] upd_usr_id    =  (JSPUtil.getParameter(request, prefix + "upd_usr_id   		".trim(), length));
			String[] upd_dt        =  (JSPUtil.getParameter(request, prefix + "upd_dt       		".trim(), length));
			String[] usr_locl_nm   =  (JSPUtil.getParameter(request, prefix + "usr_locl_nm   	    ".trim(), length));
			String[] usr_auth_tp_cd=  (JSPUtil.getParameter(request, prefix + "usr_auth_tp_cd       ".trim(), length));
			String[] ofc_cd        =  (JSPUtil.getParameter(request, prefix + "ofc_cd               ".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new COM_USER2();
				model.setIbflag       		  ( ibflag       	[i]);
				model.setPage_rows    		  ( page_rows    	[i]);
				model.setUsr_id       		  ( usr_id       	[i]);
				model.setUsr_nm       		  ( usr_nm       	[i]);
				model.setUsr_pwd      		  ( usr_pwd      	[i]);
				model.setUse_flg      		  ( use_flg      	[i]);
				model.setMphn_no      		  ( mphn_no      	[i]);
				model.setUsr_eml      		  ( usr_eml      	[i]);
				model.setCnt_cd       		  ( cnt_cd       	[i]);
				model.setLang_tp_cd   		  ( lang_tp_cd   	[i]);
				model.setGmt_tmzn_cd  		  ( gmt_tmzn_cd  	[i]);
				model.setCnt_dt_fmt_cd		  ( cnt_dt_fmt_cd	[i]);
				model.setCnt_no_fmt_cd		  ( cnt_no_fmt_cd	[i]);
				model.setXtn_phn_no   		  ( xtn_phn_no   	[i]);
				model.setCre_usr_id   		  ( cre_usr_id   	[i]);
				model.setCre_dt       		  ( cre_dt       	[i]);
				model.setUpd_usr_id   		  ( upd_usr_id   	[i]);
				model.setUpd_dt       		  ( upd_dt       	[i]);
				model.setUsr_locl_nm   	      (usr_locl_nm   	[i]);
				model.setUsr_auth_tp_cd       (usr_auth_tp_cd   [i]);
				model.setOfc_cd               (ofc_cd   	    [i]);
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
