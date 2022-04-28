/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : SPC_MAX_LOD_FCTR.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-13
*@LastModifier : 송민석
*@LastVersion : 1.0
* 2006-10-13 송민석
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

public class SPC_MAX_LOD_FCTR implements Serializable {

	String ibflag = null;

	boolean b_ibflag = false;

	String page_rows = null;

	boolean b_page_rows = false;

	String bse_yr = null;

	boolean b_bse_yr = false;

	String voy_diff_wk = null;

	boolean b_voy_diff_wk = false;

	String rlane_cd = null;

	boolean b_rlane_cd = false;

	String dir_cd = null;

	boolean b_dir_cd = false;

	String trd_cd = null;

	boolean b_trd_cd = false;

	String sub_trd_cd = null;

	boolean b_sub_trd_cd = false;

	String max_ldf_rto = null;

	boolean b_max_ldf_rto = false;

	String cre_usr_id = null;

	boolean b_cre_usr_id = false;

	String upd_usr_id = null;

	boolean b_upd_usr_id = false;

	String[][] columns = { { "bse_yr", "PK" }, { "voy_diff_wk", "PK" }, { "rlane_cd", "PK" }, { "dir_cd", "PK" },
			{ "trd_cd", "" }, { "sub_trd_cd", "" }, { "max_ldf_rto", "" } };

	public SPC_MAX_LOD_FCTR() {
	}

	public SPC_MAX_LOD_FCTR(String ibflag, String page_rows, String bse_yr, String voy_diff_wk, String rlane_cd,
			String dir_cd, String trd_cd, String sub_trd_cd, String max_ldf_rto, String cre_usr_id,
			String upd_usr_id) {
		this.ibflag = ibflag;
		this.page_rows = page_rows;
		this.bse_yr = bse_yr;
		this.voy_diff_wk = voy_diff_wk;
		this.rlane_cd = rlane_cd;
		this.dir_cd = dir_cd;
		this.trd_cd = trd_cd;
		this.sub_trd_cd = sub_trd_cd;
		this.max_ldf_rto = max_ldf_rto;
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

	public String getBse_yr() {
		return this.bse_yr;
	}

	public boolean getBse_yrStatus() {
		return this.b_bse_yr;
	}

	public String getVoy_diff_wk() {
		return this.voy_diff_wk;
	}

	public boolean getVoy_diff_wkStatus() {
		return this.b_voy_diff_wk;
	}

	public String getRlane_cd() {
		return this.rlane_cd;
	}

	public boolean getRlane_cdStatus() {
		return this.b_rlane_cd;
	}

	public String getDir_cd() {
		return this.dir_cd;
	}

	public boolean getDir_cdStatus() {
		return this.b_dir_cd;
	}

	public String getTrd_cd() {
		return this.trd_cd;
	}

	public boolean getTrd_cdStatus() {
		return this.b_trd_cd;
	}

	public String getSub_trd_cd() {
		return this.sub_trd_cd;
	}

	public boolean getSub_trd_cdStatus() {
		return this.b_sub_trd_cd;
	}

	public String getMax_ldf_rto() {
		return this.max_ldf_rto;
	}

	public boolean getMax_ldf_rtoStatus() {
		return this.b_max_ldf_rto;
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

	public void setBse_yr(String bse_yr) {
		this.bse_yr = bse_yr;
		this.b_bse_yr = true;
	}

	public void setVoy_diff_wk(String voy_diff_wk) {
		this.voy_diff_wk = voy_diff_wk;
		this.b_voy_diff_wk = true;
	}

	public void setRlane_cd(String rlane_cd) {
		this.rlane_cd = rlane_cd;
		this.b_rlane_cd = true;
	}

	public void setDir_cd(String dir_cd) {
		this.dir_cd = dir_cd;
		this.b_dir_cd = true;
	}

	public void setTrd_cd(String trd_cd) {
		this.trd_cd = trd_cd;
		this.b_trd_cd = true;
	}

	public void setSub_trd_cd(String sub_trd_cd) {
		this.sub_trd_cd = sub_trd_cd;
		this.b_sub_trd_cd = true;
	}

	public void setMax_ldf_rto(String max_ldf_rto) {
		this.max_ldf_rto = max_ldf_rto;
		this.b_max_ldf_rto = true;
	}

	public void setCre_usr_id(String cre_usr_id) {
		this.cre_usr_id = cre_usr_id;
		this.b_cre_usr_id = true;
	}

	public void setUpd_usr_id(String upd_usr_id) {
		this.upd_usr_id = upd_usr_id;
		this.b_upd_usr_id = true;
	}

	public static SPC_MAX_LOD_FCTR fromRequest(HttpServletRequest request) {
		String strUserId = getUserId(request);
		SPC_MAX_LOD_FCTR model = new SPC_MAX_LOD_FCTR();
		try {
			model.setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
			model.setPage_rows(JSPUtil.getParameter(request, "page_rows", ""));
			model.setBse_yr(JSPUtil.getParameter(request, "bse_yr", ""));
			model.setVoy_diff_wk(JSPUtil.getParameter(request, "voy_diff_wk", ""));
			model.setRlane_cd(JSPUtil.getParameter(request, "rlane_cd", ""));
			model.setDir_cd(JSPUtil.getParameter(request, "dir_cd", ""));
			model.setTrd_cd(JSPUtil.getParameter(request, "trd_cd", ""));
			model.setSub_trd_cd(JSPUtil.getParameter(request, "sub_trd_cd", ""));
			model.setMax_ldf_rto(JSPUtil.getParameter(request, "max_ldf_rto", ""));
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
		SPC_MAX_LOD_FCTR model = null;
		Collection models = new ArrayList();
		String[] params = request.getParameterValues(prefix + "bse_yr");
		if (params == null)
			return models;
		int length = request.getParameterValues(prefix + "bse_yr").length;
		try {
			String[] ibflag = (JSPUtil.getParameter(request, prefix + "ibflag".trim(), length));
			String[] page_rows = (JSPUtil.getParameter(request, prefix + "page_rows".trim(), length));
			String[] bse_yr = (JSPUtil.getParameter(request, prefix + "bse_yr".trim(), length));
			String[] voy_diff_wk = (JSPUtil.getParameter(request, prefix + "voy_diff_wk".trim(), length));
			String[] rlane_cd = (JSPUtil.getParameter(request, prefix + "rlane_cd".trim(), length));
			String[] dir_cd = (JSPUtil.getParameter(request, prefix + "dir_cd".trim(), length));
			String[] trd_cd = (JSPUtil.getParameter(request, prefix + "trd_cd".trim(), length));
			String[] sub_trd_cd = (JSPUtil.getParameter(request, prefix + "sub_trd_cd".trim(), length));
			String[] max_ldf_rto = (JSPUtil.getParameter(request, prefix + "max_ldf_rto".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new SPC_MAX_LOD_FCTR();
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (page_rows[i] != null)
					model.setPage_rows(page_rows[i]);
				if (bse_yr[i] != null)
					model.setBse_yr(bse_yr[i]);
				if (voy_diff_wk[i] != null)
					model.setVoy_diff_wk(voy_diff_wk[i]);
				if (rlane_cd[i] != null)
					model.setRlane_cd(rlane_cd[i]);
				if (dir_cd[i] != null)
					model.setDir_cd(dir_cd[i]);
				if (trd_cd[i] != null)
					model.setTrd_cd(trd_cd[i]);
				if (sub_trd_cd[i] != null)
					model.setSub_trd_cd(sub_trd_cd[i]);
				if (max_ldf_rto[i] != null)
					model.setMax_ldf_rto(max_ldf_rto[i]);
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