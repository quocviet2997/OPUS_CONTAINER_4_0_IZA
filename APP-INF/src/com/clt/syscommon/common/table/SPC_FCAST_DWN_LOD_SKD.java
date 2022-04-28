/*=========================================================
 *Copyright(c) 2006 CyberLogitec
 *@FileName : SPC_FCAST_DWN_LOD_SKD.java
 *@FileTitle : 
 *Open Issues :
 *Change history :
 *@LastModifyDate : 2007-10-04
 *@LastModifier : 김원섭
 *@LastVersion : 1.0
 * 2007-10-04 김원섭
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
 * Table Value Ojbect<br> - PDTO(Data Transfer Object including Parameters)<br> - 관련 Event에서 작성, 서버실행요청시 PDTO의 역할을
 * 수행하는 Value Object<br>
 * 
 * @author 김원섭
 * @since J2EE 1.4
 */

public class SPC_FCAST_DWN_LOD_SKD implements Serializable {

	String ibflag = null;

	boolean b_ibflag = false;

	String page_rows = null;

	boolean b_page_rows = false;

	String bse_yrmon = null;

	boolean b_bse_yrmon = false;

	String dwn_lod_dy = null;

	boolean b_dwn_lod_dy = false;

	String exe_dt = null;

	boolean b_exe_dt = false;

	String cre_usr_id = null;

	boolean b_cre_usr_id = false;

	String upd_usr_id = null;

	boolean b_upd_usr_id = false;

	String[][] columns = { { "bse_yrmon", "PK" }, { "dwn_lod_dy", "" }, { "exe_dt", "" } };

	public SPC_FCAST_DWN_LOD_SKD() {
	}

	public SPC_FCAST_DWN_LOD_SKD(String ibflag, String page_rows, String bse_yrmon, String dwn_lod_dy, String exe_dt,
			String cre_usr_id, String upd_usr_id) {
		this.ibflag = ibflag;
		this.page_rows = page_rows;
		this.bse_yrmon = bse_yrmon;
		this.dwn_lod_dy = dwn_lod_dy;
		this.exe_dt = exe_dt;
		this.cre_usr_id = cre_usr_id;
		this.upd_usr_id = upd_usr_id;
	}

	public String getIbflag() {
		return this.ibflag;
	}

	public boolean getIbflagStatus() {
		return this.b_ibflag;
	}

	public String getPage_rows() {
		return this.page_rows;
	}

	public boolean getPage_rowsStatus() {
		return this.b_page_rows;
	}

	public String getBse_yrmon() {
		return this.bse_yrmon;
	}

	public boolean getBse_yrmonStatus() {
		return this.b_bse_yrmon;
	}

	public String getDwn_lod_dy() {
		return this.dwn_lod_dy;
	}

	public boolean getDwn_lod_dyStatus() {
		return this.b_dwn_lod_dy;
	}

	public String getExe_dt() {
		return this.exe_dt;
	}

	public boolean getExe_dtStatus() {
		return this.b_exe_dt;
	}

	public String getCre_usr_id() {
		return this.cre_usr_id;
	}

	public boolean getCre_usr_idStatus() {
		return this.b_cre_usr_id;
	}

	public String getUpd_usr_id() {
		return this.upd_usr_id;
	}

	public boolean getUpd_usr_idStatus() {
		return this.b_upd_usr_id;
	}

	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		this.b_ibflag = true;
	}

	public void setPage_rows(String page_rows) {
		this.page_rows = page_rows;
		this.b_page_rows = true;
	}

	public void setBse_yrmon(String bse_yrmon) {
		this.bse_yrmon = bse_yrmon;
		this.b_bse_yrmon = true;
	}

	public void setDwn_lod_dy(String dwn_lod_dy) {
		this.dwn_lod_dy = dwn_lod_dy;
		this.b_dwn_lod_dy = true;
	}

	public void setExe_dt(String exe_dt) {
		this.exe_dt = exe_dt;
		this.b_exe_dt = true;
	}

	public void setCre_usr_id(String cre_usr_id) {
		this.cre_usr_id = cre_usr_id;
		this.b_cre_usr_id = true;
	}

	public void setUpd_usr_id(String upd_usr_id) {
		this.upd_usr_id = upd_usr_id;
		this.b_upd_usr_id = true;
	}

	public static SPC_FCAST_DWN_LOD_SKD fromRequest(HttpServletRequest request) {
		String strUserId = getUserId(request);
		SPC_FCAST_DWN_LOD_SKD model = new SPC_FCAST_DWN_LOD_SKD();
		try {
			model.setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
			model.setPage_rows(JSPUtil.getParameter(request, "page_rows", ""));
			model.setBse_yrmon(JSPUtil.getParameter(request, "bse_yrmon", ""));
			model.setDwn_lod_dy(JSPUtil.getParameter(request, "dwn_lod_dy", ""));
			model.setExe_dt(JSPUtil.getParameter(request, "exe_dt", ""));
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
		SPC_FCAST_DWN_LOD_SKD model = null;
		Collection models = new ArrayList();
		String[] params = request.getParameterValues(prefix + "bse_yrmon");
		if (params == null)
			return models;
		int length = request.getParameterValues(prefix + "bse_yrmon").length;
		try {
			String[] ibflag = (JSPUtil.getParameter(request, prefix + "ibflag".trim(), length));
			String[] page_rows = (JSPUtil.getParameter(request, prefix + "page_rows".trim(), length));
			String[] bse_yrmon = (JSPUtil.getParameter(request, prefix + "bse_yrmon".trim(), length));
			String[] dwn_lod_dy = (JSPUtil.getParameter(request, prefix + "dwn_lod_dy".trim(), length));
			String[] exe_dt = (JSPUtil.getParameter(request, prefix + "exe_dt".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new SPC_FCAST_DWN_LOD_SKD();
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (page_rows[i] != null)
					model.setPage_rows(page_rows[i]);
				if (bse_yrmon[i] != null)
					model.setBse_yrmon(bse_yrmon[i]);
				if (dwn_lod_dy[i] != null)
					model.setDwn_lod_dy(dwn_lod_dy[i]);
				if (exe_dt[i] != null)
					model.setExe_dt(exe_dt[i]);
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