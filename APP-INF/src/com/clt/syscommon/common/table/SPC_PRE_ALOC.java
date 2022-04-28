/*=========================================================
 *Copyright(c) 2006 CyberLogitec
 *@FileName : SPC_PRE_ALOC.java
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
 * Table Value Ojbect<br> - PDTO(Data Transfer Object including Parameters)<br> -
 * 관련 Event에서 작성, 서버실행요청시 PDTO의 역할을 수행하는 Value Object<br>
 * 
 * @author 김원섭
 * @since J2EE 1.4
 */

public class SPC_PRE_ALOC implements Serializable {

	String ibflag = null;

	boolean b_ibflag = false;

	String page_rows = null;

	boolean b_page_rows = false;

	String bse_yr = null;

	boolean b_bse_yr = false;

	String bse_mon = null;

	boolean b_bse_mon = false;

	String rlane_cd = null;

	boolean b_rlane_cd = false;

	String dir_cd = null;

	boolean b_dir_cd = false;

	String ioc_cd = null;

	boolean b_ioc_cd = false;

	String vsl_clss_capa = null;

	boolean b_vsl_clss_capa = false;

	String bse_seq = null;

	boolean b_bse_seq = false;

	String bse_wk = null;

	boolean b_bse_wk = false;

	String aloc_qty = null;

	boolean b_aloc_qty = false;

	String cre_usr_id = null;

	boolean b_cre_usr_id = false;

	String upd_usr_id = null;

	boolean b_upd_usr_id = false;

	String[][] columns = { { "bse_yr", "PK" }, { "bse_mon", "PK" },
			{ "rlane_cd", "PK" }, { "dir_cd", "PK" }, { "ioc_cd", "PK" },
			{ "vsl_clss_capa", "PK" }, { "bse_seq", "PK" }, { "bse_wk", "PK" },
			{ "aloc_qty", "" } };

	public SPC_PRE_ALOC() {
	}

	public SPC_PRE_ALOC(String ibflag, String page_rows, String bse_yr,
			String bse_mon, String rlane_cd, String dir_cd, String ioc_cd,
			String vsl_clss_capa, String bse_seq, String bse_wk,
			String aloc_qty, String cre_usr_id, String upd_usr_id) {
		this.ibflag = ibflag;
		this.page_rows = page_rows;
		this.bse_yr = bse_yr;
		this.bse_mon = bse_mon;
		this.rlane_cd = rlane_cd;
		this.dir_cd = dir_cd;
		this.ioc_cd = ioc_cd;
		this.vsl_clss_capa = vsl_clss_capa;
		this.bse_seq = bse_seq;
		this.bse_wk = bse_wk;
		this.aloc_qty = aloc_qty;
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

	public String getBse_mon() {
		return this.bse_mon;
	}

	public boolean getBse_monStatus() {
		return this.b_bse_mon;
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

	public String getIoc_cd() {
		return this.ioc_cd;
	}

	public boolean getIoc_cdStatus() {
		return this.b_ioc_cd;
	}

	public String getVsl_clss_capa() {
		return this.vsl_clss_capa;
	}

	public boolean getVsl_clss_capaStatus() {
		return this.b_vsl_clss_capa;
	}

	public String getBse_seq() {
		return this.bse_seq;
	}

	public boolean getBse_seqStatus() {
		return this.b_bse_seq;
	}

	public String getBse_wk() {
		return this.bse_wk;
	}

	public boolean getBse_wkStatus() {
		return this.b_bse_wk;
	}

	public String getAloc_qty() {
		return this.aloc_qty;
	}

	public boolean getAloc_qtyStatus() {
		return this.b_aloc_qty;
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

	public void setBse_mon(String bse_mon) {
		this.bse_mon = bse_mon;
		this.b_bse_mon = true;
	}

	public void setRlane_cd(String rlane_cd) {
		this.rlane_cd = rlane_cd;
		this.b_rlane_cd = true;
	}

	public void setDir_cd(String dir_cd) {
		this.dir_cd = dir_cd;
		this.b_dir_cd = true;
	}

	public void setIoc_cd(String ioc_cd) {
		this.ioc_cd = ioc_cd;
		this.b_ioc_cd = true;
	}

	public void setVsl_clss_capa(String vsl_clss_capa) {
		this.vsl_clss_capa = vsl_clss_capa;
		this.b_vsl_clss_capa = true;
	}

	public void setBse_seq(String bse_seq) {
		this.bse_seq = bse_seq;
		this.b_bse_seq = true;
	}

	public void setBse_wk(String bse_wk) {
		this.bse_wk = bse_wk;
		this.b_bse_wk = true;
	}

	public void setAloc_qty(String aloc_qty) {
		this.aloc_qty = aloc_qty;
		this.b_aloc_qty = true;
	}

	public void setCre_usr_id(String cre_usr_id) {
		this.cre_usr_id = cre_usr_id;
		this.b_cre_usr_id = true;
	}

	public void setUpd_usr_id(String upd_usr_id) {
		this.upd_usr_id = upd_usr_id;
		this.b_upd_usr_id = true;
	}

	public static SPC_PRE_ALOC fromRequest(HttpServletRequest request) {
		String strUserId = getUserId(request);
		SPC_PRE_ALOC model = new SPC_PRE_ALOC();
		try {
			model.setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
			model.setPage_rows(JSPUtil.getParameter(request, "page_rows", ""));
			model.setBse_yr(JSPUtil.getParameter(request, "bse_yr", ""));
			model.setBse_mon(JSPUtil.getParameter(request, "bse_mon", ""));
			model.setRlane_cd(JSPUtil.getParameter(request, "rlane_cd", ""));
			model.setDir_cd(JSPUtil.getParameter(request, "dir_cd", ""));
			model.setIoc_cd(JSPUtil.getParameter(request, "ioc_cd", ""));
			model.setVsl_clss_capa(JSPUtil.getParameter(request,
					"vsl_clss_capa", ""));
			model.setBse_seq(JSPUtil.getParameter(request, "bse_seq", ""));
			model.setBse_wk(JSPUtil.getParameter(request, "bse_wk", ""));
			model.setAloc_qty(JSPUtil.getParameter(request, "aloc_qty", ""));
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
		SPC_PRE_ALOC model = null;
		Collection models = new ArrayList();
		String[] params = request.getParameterValues(prefix + "bse_yr");
		if (params == null)
			return models;
		int length = request.getParameterValues(prefix + "bse_yr").length;
		try {
			String[] ibflag = (JSPUtil.getParameter(request, prefix
					+ "ibflag".trim(), length));
			String[] page_rows = (JSPUtil.getParameter(request, prefix
					+ "page_rows".trim(), length));
			String[] bse_yr = (JSPUtil.getParameter(request, prefix
					+ "bse_yr".trim(), length));
			String[] bse_mon = (JSPUtil.getParameter(request, prefix
					+ "bse_mon".trim(), length));
			String[] rlane_cd = (JSPUtil.getParameter(request, prefix
					+ "rlane_cd".trim(), length));
			String[] dir_cd = (JSPUtil.getParameter(request, prefix
					+ "dir_cd".trim(), length));
			String[] ioc_cd = (JSPUtil.getParameter(request, prefix
					+ "ioc_cd".trim(), length));
			String[] vsl_clss_capa = (JSPUtil.getParameter(request, prefix
					+ "vsl_clss_capa".trim(), length));
			String[] bse_seq = (JSPUtil.getParameter(request, prefix
					+ "bse_seq".trim(), length));
			String[] bse_wk = (JSPUtil.getParameter(request, prefix
					+ "bse_wk".trim(), length));
			String[] aloc_qty = (JSPUtil.getParameter(request, prefix
					+ "aloc_qty".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new SPC_PRE_ALOC();
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (page_rows[i] != null)
					model.setPage_rows(page_rows[i]);
				if (bse_yr[i] != null)
					model.setBse_yr(bse_yr[i]);
				if (bse_mon[i] != null)
					model.setBse_mon(bse_mon[i]);
				if (rlane_cd[i] != null)
					model.setRlane_cd(rlane_cd[i]);
				if (dir_cd[i] != null)
					model.setDir_cd(dir_cd[i]);
				if (ioc_cd[i] != null)
					model.setIoc_cd(ioc_cd[i]);
				if (vsl_clss_capa[i] != null)
					model.setVsl_clss_capa(vsl_clss_capa[i]);
				if (bse_seq[i] != null)
					model.setBse_seq(bse_seq[i]);
				if (bse_wk[i] != null)
					model.setBse_wk(bse_wk[i]);
				if (aloc_qty[i] != null)
					model.setAloc_qty(aloc_qty[i]);
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