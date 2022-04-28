/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : SPC_DLY_FCAST_ROUT.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-02
*@LastModifier : 김원섭
*@LastVersion : 1.0
* 2006-10-02 김원섭
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
 * @author 김원섭
 * @since J2EE 1.4
 */

public class SPC_DLY_FCAST_ROUT implements Serializable {

	String ibflag = null;

	boolean b_ibflag = false;

	String page_rows = null;

	boolean b_page_rows = false;

	String sls_fcast_no = null;

	boolean b_sls_fcast_no = false;

	String altn_fcast_seq = null;

	boolean b_altn_fcast_seq = false;

	String ts_seq = null;

	boolean b_ts_seq = false;

	String rlane_cd = null;

	boolean b_rlane_cd = false;

	String vsl_cd = null;

	boolean b_vsl_cd = false;

	String skd_voy_no = null;

	boolean b_skd_voy_no = false;

	String skd_dir_cd = null;

	boolean b_skd_dir_cd = false;

	String pol_cd = null;

	boolean b_pol_cd = false;

	String pod_cd = null;

	boolean b_pod_cd = false;

	String cre_usr_id = null;

	boolean b_cre_usr_id = false;

	String upd_usr_id = null;

	boolean b_upd_usr_id = false;

	String[][] columns = { { "sls_fcast_no", "PK" },
			{ "altn_fcast_seq", "PK" }, { "ts_seq", "PK" }, { "rlane_cd", "" },
			{ "vsl_cd", "" }, { "skd_voy_no", "" }, { "skd_dir_cd", "" },
			{ "pol_cd", "" }, { "pod_cd", "" } };

	public SPC_DLY_FCAST_ROUT() {
	}

	public SPC_DLY_FCAST_ROUT(String ibflag, String page_rows,
			String sls_fcast_no, String altn_fcast_seq, String ts_seq,
			String rlane_cd, String vsl_cd, String skd_voy_no,
			String skd_dir_cd, String pol_cd, String pod_cd, String cre_usr_id,
			String upd_usr_id) {
		this.ibflag = ibflag;
		this.page_rows = page_rows;
		this.sls_fcast_no = sls_fcast_no;
		this.altn_fcast_seq = altn_fcast_seq;
		this.ts_seq = ts_seq;
		this.rlane_cd = rlane_cd;
		this.vsl_cd = vsl_cd;
		this.skd_voy_no = skd_voy_no;
		this.skd_dir_cd = skd_dir_cd;
		this.pol_cd = pol_cd;
		this.pod_cd = pod_cd;
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

	public String getSls_fcast_no() {
		return this.sls_fcast_no;
	}

	public boolean getSls_fcast_noStatus() {
		return this.b_sls_fcast_no;
	}

	public String getAltn_fcast_seq() {
		return this.altn_fcast_seq;
	}

	public boolean getAltn_fcast_seqStatus() {
		return this.b_altn_fcast_seq;
	}

	public String getTs_seq() {
		return this.ts_seq;
	}

	public boolean getTs_seqStatus() {
		return this.b_ts_seq;
	}

	public String getRlane_cd() {
		return this.rlane_cd;
	}

	public boolean getRlane_cdStatus() {
		return this.b_rlane_cd;
	}

	public String getVsl_cd() {
		return this.vsl_cd;
	}

	public boolean getVsl_cdStatus() {
		return this.b_vsl_cd;
	}

	public String getSkd_voy_no() {
		return this.skd_voy_no;
	}

	public boolean getSkd_voy_noStatus() {
		return this.b_skd_voy_no;
	}

	public String getSkd_dir_cd() {
		return this.skd_dir_cd;
	}

	public boolean getSkd_dir_cdStatus() {
		return this.b_skd_dir_cd;
	}

	public String getPol_cd() {
		return this.pol_cd;
	}

	public boolean getPol_cdStatus() {
		return this.b_pol_cd;
	}

	public String getPod_cd() {
		return this.pod_cd;
	}

	public boolean getPod_cdStatus() {
		return this.b_pod_cd;
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

	public void setSls_fcast_no(String sls_fcast_no) {
		this.sls_fcast_no = sls_fcast_no;
		this.b_sls_fcast_no = true;
	}

	public void setAltn_fcast_seq(String altn_fcast_seq) {
		this.altn_fcast_seq = altn_fcast_seq;
		this.b_altn_fcast_seq = true;
	}

	public void setTs_seq(String ts_seq) {
		this.ts_seq = ts_seq;
		this.b_ts_seq = true;
	}

	public void setRlane_cd(String rlane_cd) {
		this.rlane_cd = rlane_cd;
		this.b_rlane_cd = true;
	}

	public void setVsl_cd(String vsl_cd) {
		this.vsl_cd = vsl_cd;
		this.b_vsl_cd = true;
	}

	public void setSkd_voy_no(String skd_voy_no) {
		this.skd_voy_no = skd_voy_no;
		this.b_skd_voy_no = true;
	}

	public void setSkd_dir_cd(String skd_dir_cd) {
		this.skd_dir_cd = skd_dir_cd;
		this.b_skd_dir_cd = true;
	}

	public void setPol_cd(String pol_cd) {
		this.pol_cd = pol_cd;
		this.b_pol_cd = true;
	}

	public void setPod_cd(String pod_cd) {
		this.pod_cd = pod_cd;
		this.b_pod_cd = true;
	}

	public void setCre_usr_id(String cre_usr_id) {
		this.cre_usr_id = cre_usr_id;
		this.b_cre_usr_id = true;
	}

	public void setUpd_usr_id(String upd_usr_id) {
		this.upd_usr_id = upd_usr_id;
		this.b_upd_usr_id = true;
	}

	public static SPC_DLY_FCAST_ROUT fromRequest(HttpServletRequest request) {
		String strUserId = getUserId(request);
		SPC_DLY_FCAST_ROUT model = new SPC_DLY_FCAST_ROUT();
		try {
			model.setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
			model.setPage_rows(JSPUtil.getParameter(request, "page_rows", ""));
			model.setSls_fcast_no(JSPUtil.getParameter(request, "sls_fcast_no",
					""));
			model.setAltn_fcast_seq(JSPUtil.getParameter(request,
					"altn_fcast_seq", ""));
			model.setTs_seq(JSPUtil.getParameter(request, "ts_seq", ""));
			model.setRlane_cd(JSPUtil.getParameter(request, "rlane_cd", ""));
			model.setVsl_cd(JSPUtil.getParameter(request, "vsl_cd", ""));
			model
					.setSkd_voy_no(JSPUtil.getParameter(request, "skd_voy_no",
							""));
			model
					.setSkd_dir_cd(JSPUtil.getParameter(request, "skd_dir_cd",
							""));
			model.setPol_cd(JSPUtil.getParameter(request, "pol_cd", ""));
			model.setPod_cd(JSPUtil.getParameter(request, "pod_cd", ""));
			model.setCre_usr_id(strUserId);
			model.setUpd_usr_id(strUserId);
		} catch (Exception e) {
		}
		return model;
	}

	public static Collection fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public static Collection fromRequestGrid(HttpServletRequest request,
			String prefix) {
		String strUserId = getUserId(request);
		SPC_DLY_FCAST_ROUT model = null;
		Collection models = new ArrayList();
		String[] params = request.getParameterValues(prefix + "sls_fcast_no");
		if (params == null)
			return models;
		int length = request.getParameterValues(prefix + "sls_fcast_no").length;
		try {
			String[] ibflag = (JSPUtil.getParameter(request, prefix
					+ "ibflag".trim(), length));
			String[] page_rows = (JSPUtil.getParameter(request, prefix
					+ "page_rows".trim(), length));
			String[] sls_fcast_no = (JSPUtil.getParameter(request, prefix
					+ "sls_fcast_no".trim(), length));
			String[] altn_fcast_seq = (JSPUtil.getParameter(request, prefix
					+ "altn_fcast_seq".trim(), length));
			String[] ts_seq = (JSPUtil.getParameter(request, prefix
					+ "ts_seq".trim(), length));
			String[] rlane_cd = (JSPUtil.getParameter(request, prefix
					+ "rlane_cd".trim(), length));
			String[] vsl_cd = (JSPUtil.getParameter(request, prefix
					+ "vsl_cd".trim(), length));
			String[] skd_voy_no = (JSPUtil.getParameter(request, prefix
					+ "skd_voy_no".trim(), length));
			String[] skd_dir_cd = (JSPUtil.getParameter(request, prefix
					+ "skd_dir_cd".trim(), length));
			String[] pol_cd = (JSPUtil.getParameter(request, prefix
					+ "pol_cd".trim(), length));
			String[] pod_cd = (JSPUtil.getParameter(request, prefix
					+ "pod_cd".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new SPC_DLY_FCAST_ROUT();
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (page_rows[i] != null)
					model.setPage_rows(page_rows[i]);
				if (sls_fcast_no[i] != null)
					model.setSls_fcast_no(sls_fcast_no[i]);
				if (altn_fcast_seq[i] != null)
					model.setAltn_fcast_seq(altn_fcast_seq[i]);
				if (ts_seq[i] != null)
					model.setTs_seq(ts_seq[i]);
				if (rlane_cd[i] != null)
					model.setRlane_cd(rlane_cd[i]);
				if (vsl_cd[i] != null)
					model.setVsl_cd(vsl_cd[i]);
				if (skd_voy_no[i] != null)
					model.setSkd_voy_no(skd_voy_no[i]);
				if (skd_dir_cd[i] != null)
					model.setSkd_dir_cd(skd_dir_cd[i]);
				if (pol_cd[i] != null)
					model.setPol_cd(pol_cd[i]);
				if (pod_cd[i] != null)
					model.setPod_cd(pod_cd[i]);
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

	private static String getUserId(HttpServletRequest request) {
		HttpSession session = request.getSession();
		SignOnUserAccount account = ((SignOnUserAccount) (session
				.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT)));
		String strUserId = account.getUsr_id();
		return strUserId;
	}
}