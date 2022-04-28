/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : SPC_RALOC_MDL_EXE.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2006-12-14
*@LastModifier : 송민석
*@LastVersion : 1.0
* 2006-12-14 송민석
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
 * @author 송민석
 * @since J2EE 1.4
 */

public class SPC_RALOC_MDL_EXE implements Serializable {

	String ibflag = null;

	String page_rows = null;

	String raloc_ver_no = null;

	String raloc_mdl_exe_sts_cd = null;

	String exe_usr_id = null;

	String exe_gdt = null;

	String mdl_st_gdt = null;

	String mdl_end_gdt = null;

	String cre_usr_id = null;

	String upd_usr_id = null;

	public SPC_RALOC_MDL_EXE() {
	}

	public SPC_RALOC_MDL_EXE(String ibflag, String page_rows, String raloc_ver_no, String raloc_mdl_exe_sts_cd,
			String exe_usr_id, String exe_gdt, String mdl_st_gdt, String mdl_end_gdt, String cre_usr_id,
			String upd_usr_id) {
		this.ibflag = ibflag;
		this.page_rows = page_rows;
		this.raloc_ver_no = raloc_ver_no;
		this.raloc_mdl_exe_sts_cd = raloc_mdl_exe_sts_cd;
		this.exe_usr_id = exe_usr_id;
		this.exe_gdt = exe_gdt;
		this.mdl_st_gdt = mdl_st_gdt;
		this.mdl_end_gdt = mdl_end_gdt;
		this.cre_usr_id = cre_usr_id;
		this.upd_usr_id = upd_usr_id;
	}

	public String getIbflag() {
		return this.ibflag;
	}

	public String getPage_rows() {
		return this.page_rows;
	}

	public String getRaloc_ver_no() {
		return this.raloc_ver_no;
	}

	public String getRaloc_mdl_exe_sts_cd() {
		return this.raloc_mdl_exe_sts_cd;
	}

	public String getExe_usr_id() {
		return this.exe_usr_id;
	}

	public String getExe_gdt() {
		return this.exe_gdt;
	}

	public String getMdl_st_gdt() {
		return this.mdl_st_gdt;
	}

	public String getMdl_end_gdt() {
		return this.mdl_end_gdt;
	}

	public String getCre_usr_id() {
		return this.cre_usr_id;
	}

	public String getUpd_usr_id() {
		return this.upd_usr_id;
	}

	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.b_ibflag=true;
	}

	public void setPage_rows(String page_rows) {
		this.page_rows = page_rows;
		//this.b_page_rows=true;
	}

	public void setRaloc_ver_no(String raloc_ver_no) {
		this.raloc_ver_no = raloc_ver_no;
		//this.b_raloc_ver_no=true;
	}

	public void setRaloc_mdl_exe_sts_cd(String raloc_mdl_exe_sts_cd) {
		this.raloc_mdl_exe_sts_cd = raloc_mdl_exe_sts_cd;
		//this.b_raloc_mdl_exe_sts_cd=true;
	}

	public void setExe_usr_id(String exe_usr_id) {
		this.exe_usr_id = exe_usr_id;
		//this.b_exe_usr_id=true;
	}

	public void setExe_gdt(String exe_gdt) {
		this.exe_gdt = exe_gdt;
		//this.b_exe_gdt=true;
	}

	public void setMdl_st_gdt(String mdl_st_gdt) {
		this.mdl_st_gdt = mdl_st_gdt;
		//this.b_mdl_st_gdt=true;
	}

	public void setMdl_end_gdt(String mdl_end_gdt) {
		this.mdl_end_gdt = mdl_end_gdt;
		//this.b_mdl_end_gdt=true;
	}

	public void setCre_usr_id(String cre_usr_id) {
		this.cre_usr_id = cre_usr_id;
		//this.b_cre_usr_id=true;
	}

	public void setUpd_usr_id(String upd_usr_id) {
		this.upd_usr_id = upd_usr_id;
		//this.b_upd_usr_id=true;
	}

	public static SPC_RALOC_MDL_EXE fromRequest(HttpServletRequest request) {
		String strUserId = getUserId(request);
		SPC_RALOC_MDL_EXE model = new SPC_RALOC_MDL_EXE();
		try {
			model.setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
			model.setPage_rows(JSPUtil.getParameter(request, "page_rows", ""));
			model.setRaloc_ver_no(JSPUtil.getParameter(request, "raloc_ver_no", ""));
			model.setRaloc_mdl_exe_sts_cd(JSPUtil.getParameter(request, "raloc_mdl_exe_sts_cd", ""));
			model.setExe_usr_id(JSPUtil.getParameter(request, "exe_usr_id", ""));
			model.setExe_gdt(JSPUtil.getParameter(request, "exe_gdt", ""));
			model.setMdl_st_gdt(JSPUtil.getParameter(request, "mdl_st_gdt", ""));
			model.setMdl_end_gdt(JSPUtil.getParameter(request, "mdl_end_gdt", ""));
			model.setCre_usr_id(strUserId);
			model.setUpd_usr_id(strUserId);
		} catch (Exception e) {
		}
		return model;
	}

	public static Collection fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		String strUserId = getUserId(request);
		SPC_RALOC_MDL_EXE model = null;
		Collection models = new ArrayList();
		String[] params = request.getParameterValues(prefix + "raloc_ver_no");
		if (params == null)
			return models;
		int length = request.getParameterValues(prefix + "raloc_ver_no").length;
		try {
			String[] ibflag = (JSPUtil.getParameter(request, prefix + "ibflag".trim(), length));
			String[] page_rows = (JSPUtil.getParameter(request, prefix + "page_rows".trim(), length));
			String[] raloc_ver_no = (JSPUtil.getParameter(request, prefix + "raloc_ver_no".trim(), length));
			String[] raloc_mdl_exe_sts_cd = (JSPUtil.getParameter(request, prefix + "raloc_mdl_exe_sts_cd".trim(),
					length));
			String[] exe_usr_id = (JSPUtil.getParameter(request, prefix + "exe_usr_id".trim(), length));
			String[] exe_gdt = (JSPUtil.getParameter(request, prefix + "exe_gdt".trim(), length));
			String[] mdl_st_gdt = (JSPUtil.getParameter(request, prefix + "mdl_st_gdt".trim(), length));
			String[] mdl_end_gdt = (JSPUtil.getParameter(request, prefix + "mdl_end_gdt".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new SPC_RALOC_MDL_EXE();
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (page_rows[i] != null)
					model.setPage_rows(page_rows[i]);
				if (raloc_ver_no[i] != null)
					model.setRaloc_ver_no(raloc_ver_no[i]);
				if (raloc_mdl_exe_sts_cd[i] != null)
					model.setRaloc_mdl_exe_sts_cd(raloc_mdl_exe_sts_cd[i]);
				if (exe_usr_id[i] != null)
					model.setExe_usr_id(exe_usr_id[i]);
				if (exe_gdt[i] != null)
					model.setExe_gdt(exe_gdt[i]);
				if (mdl_st_gdt[i] != null)
					model.setMdl_st_gdt(mdl_st_gdt[i]);
				if (mdl_end_gdt[i] != null)
					model.setMdl_end_gdt(mdl_end_gdt[i]);
				model.setCre_usr_id(strUserId);
				model.setUpd_usr_id(strUserId);
				models.add(model);
			}
		} catch (Exception e) {
		}
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
						ret.append(field[i].getName().concat(space).substring(0, 30).concat("= ") + arr[j] + "\n");
					}
				} else {
					ret.append(field[i].getName() + " =  null \n");
				}
			}
		} catch (Exception ex) {
		}
		return ret.toString();
	}

	private static String getUserId(HttpServletRequest request) {
		HttpSession session = request.getSession();
		SignOnUserAccount account = ((SignOnUserAccount) (session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT)));
		String strUserId = account.getUsr_id();
		return strUserId;
	}
}