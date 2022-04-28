/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : COM_UPLD_FILE.java
*@FileTitle : ${FILE_TITLE}
*Open Issues :
*Change history :
*@LastModifyDate : 2009.01.05
*@LastModifier : fdf
*@LastVersion : 1.0
* 2009.01.05 fdf
* 1.0 최초 생성
=========================================================*/

package com.clt.syscommon.common.table;

import java.io.Serializable;
import java.lang.String;
import javax.servlet.http.HttpServletRequest;

import com.clt.framework.component.util.JSPUtil;
import com.clt.framework.support.controller.html.CommonWebKeys;
import com.clt.framework.support.view.signon.SignOnUserAccount;

import java.util.Collection;
import java.util.ArrayList;
import java.lang.reflect.Field;
import javax.servlet.http.HttpSession;

/**
 * Table Value Ojbect<br>
 * - PDTO(Data Transfer Object including Parameters)<br>
 * - 관련 Event에서 작성, 서버실행요청시 PDTO의 역할을 수행하는 Value Object<br>
 *
 * @author fdf
 * @since J2EE 1.5
 * @see
 */

public class COM_UPLD_FILE implements Serializable {

	String page_rows = null;
	String file_sav_id = null;
	String ibflag = null;
	String cre_dt = null;
	String file_path_url = null;
	String upd_usr_id = null;
	String file_sz_capa = null;
	String delt_flg = null;
	String upd_dt = null;
	String pgm_sub_sys_cd = null;
	String cre_usr_id = null;
	String file_upld_nm = null;

	public COM_UPLD_FILE() {}

	public COM_UPLD_FILE(String ibflag, String page_rows, String file_sav_id, String file_upld_nm, String file_sz_capa, String file_path_url, String pgm_sub_sys_cd, String delt_flg, String cre_usr_id, String cre_dt, String upd_usr_id, String upd_dt) {

			this.page_rows = page_rows;
			this.file_sav_id = file_sav_id;
			this.ibflag = ibflag;
			this.cre_dt = cre_dt;
			this.file_path_url = file_path_url;
			this.upd_usr_id = upd_usr_id;
			this.file_sz_capa = file_sz_capa;
			this.delt_flg = delt_flg;
			this.upd_dt = upd_dt;
			this.pgm_sub_sys_cd = pgm_sub_sys_cd;
			this.cre_usr_id = cre_usr_id;
			this.file_upld_nm = file_upld_nm;
		}

	public String getPage_rows() {
		return this.page_rows;
	}
	public String getFile_sav_id() {
		return this.file_sav_id;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getCre_dt() {
		return this.cre_dt;
	}
	public String getFile_path_url() {
		return this.file_path_url;
	}
	public String getUpd_usr_id() {
		return this.upd_usr_id;
	}
	public String getFile_sz_capa() {
		return this.file_sz_capa;
	}
	public String getDelt_flg() {
		return this.delt_flg;
	}
	public String getUpd_dt() {
		return this.upd_dt;
	}
	public String getPgm_sub_sys_cd() {
		return this.pgm_sub_sys_cd;
	}
	public String getCre_usr_id() {
		return this.cre_usr_id;
	}
	public String getFile_upld_nm() {
		return this.file_upld_nm;
	}

	public void setPage_rows(String page_rows) {
		this.page_rows = page_rows;
		//this.page_rows=true;
	}
	public void setFile_sav_id(String file_sav_id) {
		this.file_sav_id = file_sav_id;
		//this.file_sav_id=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setCre_dt(String cre_dt) {
		this.cre_dt = cre_dt;
		//this.cre_dt=true;
	}
	public void setFile_path_url(String file_path_url) {
		this.file_path_url = file_path_url;
		//this.file_path_url=true;
	}
	public void setUpd_usr_id(String upd_usr_id) {
		this.upd_usr_id = upd_usr_id;
		//this.upd_usr_id=true;
	}
	public void setFile_sz_capa(String file_sz_capa) {
		this.file_sz_capa = file_sz_capa;
		//this.file_sz_capa=true;
	}
	public void setDelt_flg(String delt_flg) {
		this.delt_flg = delt_flg;
		//this.delt_flg=true;
	}
	public void setUpd_dt(String upd_dt) {
		this.upd_dt = upd_dt;
		//this.upd_dt=true;
	}
	public void setPgm_sub_sys_cd(String pgm_sub_sys_cd) {
		this.pgm_sub_sys_cd = pgm_sub_sys_cd;
		//this.pgm_sub_sys_cd=true;
	}
	public void setCre_usr_id(String cre_usr_id) {
		this.cre_usr_id = cre_usr_id;
		//this.cre_usr_id=true;
	}
	public void setFile_upld_nm(String file_upld_nm) {
		this.file_upld_nm = file_upld_nm;
		//this.file_upld_nm=true;
	}
	public static COM_UPLD_FILE fromRequest(HttpServletRequest request) {
		COM_UPLD_FILE model = new COM_UPLD_FILE();
		try {
					model.setPage_rows(JSPUtil.getParameter(request, "page_rows", ""));
					model.setFile_sav_id(JSPUtil.getParameter(request, "file_sav_id", ""));
					model.setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
					model.setCre_dt(JSPUtil.getParameter(request, "cre_dt", ""));
					model.setFile_path_url(JSPUtil.getParameter(request, "file_path_url", ""));
					model.setUpd_usr_id(JSPUtil.getParameter(request, "upd_usr_id", ""));
					model.setFile_sz_capa(JSPUtil.getParameter(request, "file_sz_capa", ""));
					model.setDelt_flg(JSPUtil.getParameter(request, "delt_flg", ""));
					model.setUpd_dt(JSPUtil.getParameter(request, "upd_dt", ""));
					model.setPgm_sub_sys_cd(JSPUtil.getParameter(request, "pgm_sub_sys_cd", ""));
					model.setCre_usr_id(JSPUtil.getParameter(request, "cre_usr_id", ""));
					model.setFile_upld_nm(JSPUtil.getParameter(request, "file_upld_nm", ""));
				} catch (Exception e) {
		}
		return model;
	}

	public static Collection fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		COM_UPLD_FILE model = null;
		Collection models = new ArrayList();

		int length = request.getParameterValues("ibflag").length;
		try {
					String[] page_rows = (JSPUtil.getParameter(request, prefix	+ "page_rows".trim(), length));
					String[] file_sav_id = (JSPUtil.getParameter(request, prefix	+ "file_sav_id".trim(), length));
					String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
					String[] cre_dt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
					String[] file_path_url = (JSPUtil.getParameter(request, prefix	+ "file_path_url".trim(), length));
					String[] upd_usr_id = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
					String[] file_sz_capa = (JSPUtil.getParameter(request, prefix	+ "file_sz_capa".trim(), length));
					String[] delt_flg = (JSPUtil.getParameter(request, prefix	+ "delt_flg".trim(), length));
					String[] upd_dt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
					String[] pgm_sub_sys_cd = (JSPUtil.getParameter(request, prefix	+ "pgm_sub_sys_cd".trim(), length));
					String[] cre_usr_id = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
					String[] file_upld_nm = (JSPUtil.getParameter(request, prefix	+ "file_upld_nm".trim(), length));
					
			for (int i = 0; i < length; i++) {
				model = new COM_UPLD_FILE();
							if (page_rows[i] != null)
					model.setPage_rows(page_rows[i]);
							if (file_sav_id[i] != null)
					model.setFile_sav_id(file_sav_id[i]);
							if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
							if (cre_dt[i] != null)
					model.setCre_dt(cre_dt[i]);
							if (file_path_url[i] != null)
					model.setFile_path_url(file_path_url[i]);
							if (upd_usr_id[i] != null)
					model.setUpd_usr_id(upd_usr_id[i]);
							if (file_sz_capa[i] != null)
					model.setFile_sz_capa(file_sz_capa[i]);
							if (delt_flg[i] != null)
					model.setDelt_flg(delt_flg[i]);
							if (upd_dt[i] != null)
					model.setUpd_dt(upd_dt[i]);
							if (pgm_sub_sys_cd[i] != null)
					model.setPgm_sub_sys_cd(pgm_sub_sys_cd[i]);
							if (cre_usr_id[i] != null)
					model.setCre_usr_id(cre_usr_id[i]);
							if (file_upld_nm[i] != null)
					model.setFile_upld_nm(file_upld_nm[i]);
							models.add(model);
			}

		} catch (Exception e) {}
		return models;
	}

	public String toString() {
		StringBuffer ret = new StringBuffer();
		Field[] field = this.getClass().getDeclaredFields();
		String space = "							  ";
		try {
			for (int i = 0; i < field.length; i++) {
				String[] arr = null;
				try {
					arr = (String[]) field[i].get(this);
				} catch (Exception ex) {
					arr = new String[1];
					arr[0] = String.valueOf(field[i].get(this));
				}
				if (arr != null) {
					for (int j = 0; j < arr.length; j++) {
						ret.append(field[i].getName().concat(space).substring(
								0, 30).concat("= ")
								+ arr[j] + "\n");
					}
				} else {
					ret.append(field[i].getName() + " =  null \n");
				}
			}
		} catch (Exception ex) {
		}
		return ret.toString();
	}

}
