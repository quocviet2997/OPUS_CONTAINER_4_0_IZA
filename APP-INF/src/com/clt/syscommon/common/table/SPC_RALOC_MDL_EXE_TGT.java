/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : SPC_RALOC_MDL_EXE_TGT.java
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

public class SPC_RALOC_MDL_EXE_TGT implements Serializable {

	String ibflag = null;

	String page_rows = null;

	String raloc_ver_no = null;

	String rlane_cd = null;

	String dir_cd = null;

	String vsl_cd = null;

	String skd_voy_no = null;

	String skd_dir_cd = null;

	String cre_usr_id = null;

	String upd_usr_id = null;

	public SPC_RALOC_MDL_EXE_TGT() {
	}

	public SPC_RALOC_MDL_EXE_TGT(String ibflag, String page_rows, String raloc_ver_no, String rlane_cd, String dir_cd,
			String vsl_cd, String skd_voy_no, String skd_dir_cd, String cre_usr_id, String upd_usr_id) {
		this.ibflag = ibflag;
		this.page_rows = page_rows;
		this.raloc_ver_no = raloc_ver_no;
		this.rlane_cd = rlane_cd;
		this.dir_cd = dir_cd;
		this.vsl_cd = vsl_cd;
		this.skd_voy_no = skd_voy_no;
		this.skd_dir_cd = skd_dir_cd;
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

	public String getRlane_cd() {
		return this.rlane_cd;
	}

	public String getDir_cd() {
		return this.dir_cd;
	}

	public String getVsl_cd() {
		return this.vsl_cd;
	}

	public String getSkd_voy_no() {
		return this.skd_voy_no;
	}

	public String getSkd_dir_cd() {
		return this.skd_dir_cd;
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

	public void setRlane_cd(String rlane_cd) {
		this.rlane_cd = rlane_cd;
		//this.b_rlane_cd=true;
	}

	public void setDir_cd(String dir_cd) {
		this.dir_cd = dir_cd;
		//this.b_dir_cd=true;
	}

	public void setVsl_cd(String vsl_cd) {
		this.vsl_cd = vsl_cd;
		//this.b_vsl_cd=true;
	}

	public void setSkd_voy_no(String skd_voy_no) {
		this.skd_voy_no = skd_voy_no;
		//this.b_skd_voy_no=true;
	}

	public void setSkd_dir_cd(String skd_dir_cd) {
		this.skd_dir_cd = skd_dir_cd;
		//this.b_skd_dir_cd=true;
	}

	public void setCre_usr_id(String cre_usr_id) {
		this.cre_usr_id = cre_usr_id;
		//this.b_cre_usr_id=true;
	}

	public void setUpd_usr_id(String upd_usr_id) {
		this.upd_usr_id = upd_usr_id;
		//this.b_upd_usr_id=true;
	}

	public static SPC_RALOC_MDL_EXE_TGT fromRequest(HttpServletRequest request) {
		String strUserId = getUserId(request);
		SPC_RALOC_MDL_EXE_TGT model = new SPC_RALOC_MDL_EXE_TGT();
		try {
			model.setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
			model.setPage_rows(JSPUtil.getParameter(request, "page_rows", ""));
			model.setRaloc_ver_no(JSPUtil.getParameter(request, "raloc_ver_no", ""));
			model.setRlane_cd(JSPUtil.getParameter(request, "rlane_cd", ""));
			model.setDir_cd(JSPUtil.getParameter(request, "dir_cd", ""));
			model.setVsl_cd(JSPUtil.getParameter(request, "vsl_cd", ""));
			model.setSkd_voy_no(JSPUtil.getParameter(request, "skd_voy_no", ""));
			model.setSkd_dir_cd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
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
		SPC_RALOC_MDL_EXE_TGT model = null;
		Collection models = new ArrayList();
		String[] params = request.getParameterValues(prefix + "raloc_ver_no");
		if (params == null)
			return models;
		int length = request.getParameterValues(prefix + "raloc_ver_no").length;
		try {
			String[] ibflag = (JSPUtil.getParameter(request, prefix + "ibflag".trim(), length));
			String[] page_rows = (JSPUtil.getParameter(request, prefix + "page_rows".trim(), length));
			String[] raloc_ver_no = (JSPUtil.getParameter(request, prefix + "raloc_ver_no".trim(), length));
			String[] rlane_cd = (JSPUtil.getParameter(request, prefix + "rlane_cd".trim(), length));
			String[] dir_cd = (JSPUtil.getParameter(request, prefix + "dir_cd".trim(), length));
			String[] vsl_cd = (JSPUtil.getParameter(request, prefix + "vsl_cd".trim(), length));
			String[] skd_voy_no = (JSPUtil.getParameter(request, prefix + "skd_voy_no".trim(), length));
			String[] skd_dir_cd = (JSPUtil.getParameter(request, prefix + "skd_dir_cd".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new SPC_RALOC_MDL_EXE_TGT();
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (page_rows[i] != null)
					model.setPage_rows(page_rows[i]);
				if (raloc_ver_no[i] != null)
					model.setRaloc_ver_no(raloc_ver_no[i]);
				if (rlane_cd[i] != null)
					model.setRlane_cd(rlane_cd[i]);
				if (dir_cd[i] != null)
					model.setDir_cd(dir_cd[i]);
				if (vsl_cd[i] != null)
					model.setVsl_cd(vsl_cd[i]);
				if (skd_voy_no[i] != null)
					model.setSkd_voy_no(skd_voy_no[i]);
				if (skd_dir_cd[i] != null)
					model.setSkd_dir_cd(skd_dir_cd[i]);
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