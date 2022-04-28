/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : SPC_ALOC_CTRL_OPT.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2007-10-12
*@LastModifier : 김원섭
*@LastVersion : 1.0
* 2007-10-12 김원섭
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

public class SPC_ALOC_CTRL_OPT implements Serializable {

	String ibflag = null;

	boolean b_ibflag = false;

	String page_rows = null;

	boolean b_page_rows = false;

	String rlane_cd = null;

	boolean b_rlane_cd = false;

	String dir_cd = null;

	boolean b_dir_cd = false;

	String vsl_cd = null;

	boolean b_vsl_cd = false;

	String skd_voy_no = null;

	boolean b_skd_voy_no = false;

	String skd_dir_cd = null;

	boolean b_skd_dir_cd = false;

	String rep_trd_cd = null;

	boolean b_rep_trd_cd = false;

	String rep_sub_trd_cd = null;

	boolean b_rep_sub_trd_cd = false;

	String ctrl_port_flg = null;

	boolean b_ctrl_port_flg = false;

	String ctrl_wgt_flg = null;

	boolean b_ctrl_wgt_flg = false;

	String ctrl_spc_flg = null;

	boolean b_ctrl_spc_flg = false;

	String ctrl_40ft_hc_flg = null;

	boolean b_ctrl_40ft_hc_flg = false;

	String ctrl_45ft_hc_flg = null;

	boolean b_ctrl_45ft_hc_flg = false;

	String ctrl_rf_flg = null;

	boolean b_ctrl_rf_flg = false;

	String ctrl_ts_flg = null;

	boolean b_ctrl_ts_flg = false;

	String cre_usr_id = null;

	boolean b_cre_usr_id = false;

	String upd_usr_id = null;

	boolean b_upd_usr_id = false;

	String ctrl_lvl_cd = null;

	boolean b_ctrl_lvl_cd = false;

	String[][] columns = { { "rlane_cd", "PK" }, { "dir_cd", "PK" }, { "vsl_cd", "PK" }, { "skd_voy_no", "PK" },
			{ "skd_dir_cd", "PK" }, { "rep_trd_cd", "" }, { "rep_sub_trd_cd", "" }, { "ctrl_port_flg", "" },
			{ "ctrl_wgt_flg", "" }, { "ctrl_spc_flg", "" }, { "ctrl_40ft_hc_flg", "" }, { "ctrl_45ft_hc_flg", "" },
			{ "ctrl_rf_flg", "" }, { "ctrl_ts_flg", "" }, { "cre_usr_id", "" } };

	public SPC_ALOC_CTRL_OPT() {
	}

	public SPC_ALOC_CTRL_OPT(String ibflag, String page_rows, String rlane_cd, String dir_cd, String vsl_cd,
			String skd_voy_no, String skd_dir_cd, String rep_trd_cd, String rep_sub_trd_cd, String ctrl_port_flg,
			String ctrl_wgt_flg, String ctrl_spc_flg, String ctrl_40ft_hc_flg, String ctrl_45ft_hc_flg,
			String ctrl_rf_flg, String ctrl_ts_flg, String cre_usr_id, String upd_usr_id, String ctrl_lvl_cd) {
		this.ibflag = ibflag;
		this.page_rows = page_rows;
		this.rlane_cd = rlane_cd;
		this.dir_cd = dir_cd;
		this.vsl_cd = vsl_cd;
		this.skd_voy_no = skd_voy_no;
		this.skd_dir_cd = skd_dir_cd;
		this.rep_trd_cd = rep_trd_cd;
		this.rep_sub_trd_cd = rep_sub_trd_cd;
		this.ctrl_port_flg = ctrl_port_flg.replace('1', 'Y').replace('0', 'N');
		this.ctrl_wgt_flg = ctrl_wgt_flg.replace('1', 'Y').replace('0', 'N');
		this.ctrl_spc_flg = ctrl_spc_flg.replace('1', 'Y').replace('0', 'N');
		this.ctrl_40ft_hc_flg = ctrl_40ft_hc_flg.replace('1', 'Y').replace('0', 'N');
		this.ctrl_45ft_hc_flg = ctrl_45ft_hc_flg.replace('1', 'Y').replace('0', 'N');
		this.ctrl_rf_flg = ctrl_rf_flg.replace('1', 'Y').replace('0', 'N');
		this.ctrl_ts_flg = ctrl_ts_flg.replace('1', 'Y').replace('0', 'N');
		this.cre_usr_id = cre_usr_id;
		this.upd_usr_id = upd_usr_id;
		this.ctrl_lvl_cd = ctrl_lvl_cd;
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

	public String getRep_trd_cd() {
		return this.rep_trd_cd;
	}

	public boolean getRep_trd_cdStatus() {
		return this.b_rep_trd_cd;
	}

	public String getRep_sub_trd_cd() {
		return this.rep_sub_trd_cd;
	}

	public boolean getRep_sub_trd_cdStatus() {
		return this.b_rep_sub_trd_cd;
	}

	public String getCtrl_port_flg() {
		return this.ctrl_port_flg;
	}

	public boolean getCtrl_port_flgStatus() {
		return this.b_ctrl_port_flg;
	}

	public String getCtrl_wgt_flg() {
		return this.ctrl_wgt_flg;
	}

	public boolean getCtrl_wgt_flgStatus() {
		return this.b_ctrl_wgt_flg;
	}

	public String getCtrl_spc_flg() {
		return this.ctrl_spc_flg;
	}

	public boolean getCtrl_spc_flgStatus() {
		return this.b_ctrl_spc_flg;
	}

	public String getCtrl_40ft_hc_flg() {
		return this.ctrl_40ft_hc_flg;
	}

	public boolean getCtrl_40ft_hc_flgStatus() {
		return this.b_ctrl_40ft_hc_flg;
	}

	public String getCtrl_45ft_hc_flg() {
		return this.ctrl_45ft_hc_flg;
	}

	public boolean getCtrl_45ft_hc_flgStatus() {
		return this.b_ctrl_45ft_hc_flg;
	}

	public String getCtrl_rf_flg() {
		return this.ctrl_rf_flg;
	}

	public boolean getCtrl_rf_flgStatus() {
		return this.b_ctrl_rf_flg;
	}

	public String getCtrl_ts_flg() {
		return this.ctrl_ts_flg;
	}

	public boolean getCtrl_ts_flgStatus() {
		return this.b_ctrl_ts_flg;
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

	public String getCtrl_lvl_cd() {
		return this.ctrl_lvl_cd;
	}

	public boolean getCtrl_lvl_cdStatus() {
		return this.b_ctrl_lvl_cd;
	}

	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		this.b_ibflag = true;
	}

	public void setPage_rows(String page_rows) {
		this.page_rows = page_rows;
		this.b_page_rows = true;
	}

	public void setRlane_cd(String rlane_cd) {
		this.rlane_cd = rlane_cd;
		this.b_rlane_cd = true;
	}

	public void setDir_cd(String dir_cd) {
		this.dir_cd = dir_cd;
		this.b_dir_cd = true;
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

	public void setRep_trd_cd(String rep_trd_cd) {
		this.rep_trd_cd = rep_trd_cd;
		this.b_rep_trd_cd = true;
	}

	public void setRep_sub_trd_cd(String rep_sub_trd_cd) {
		this.rep_sub_trd_cd = rep_sub_trd_cd;
		this.b_rep_sub_trd_cd = true;
	}

	public void setCtrl_port_flg(String ctrl_port_flg) {
		this.ctrl_port_flg = ctrl_port_flg.replace('1', 'Y').replace('0', 'N');
		this.b_ctrl_port_flg = true;
	}

	public void setCtrl_wgt_flg(String ctrl_wgt_flg) {
		this.ctrl_wgt_flg = ctrl_wgt_flg.replace('1', 'Y').replace('0', 'N');
		this.b_ctrl_wgt_flg = true;
	}

	public void setCtrl_spc_flg(String ctrl_spc_flg) {
		this.ctrl_spc_flg = ctrl_spc_flg.replace('1', 'Y').replace('0', 'N');
		this.b_ctrl_spc_flg = true;
	}

	public void setCtrl_40ft_hc_flg(String ctrl_40ft_hc_flg) {
		this.ctrl_40ft_hc_flg = ctrl_40ft_hc_flg.replace('1', 'Y').replace('0', 'N');
		this.b_ctrl_40ft_hc_flg = true;
	}

	public void setCtrl_45ft_hc_flg(String ctrl_45ft_hc_flg) {
		this.ctrl_45ft_hc_flg = ctrl_45ft_hc_flg.replace('1', 'Y').replace('0', 'N');
		this.b_ctrl_45ft_hc_flg = true;
	}

	public void setCtrl_rf_flg(String ctrl_rf_flg) {
		this.ctrl_rf_flg = ctrl_rf_flg.replace('1', 'Y').replace('0', 'N');
		this.b_ctrl_rf_flg = true;
	}

	public void setCtrl_ts_flg(String ctrl_ts_flg) {
		this.ctrl_ts_flg = ctrl_ts_flg.replace('1', 'Y').replace('0', 'N');
		this.b_ctrl_ts_flg = true;
	}

	public void setCre_usr_id(String cre_usr_id) {
		this.cre_usr_id = cre_usr_id;
		this.b_cre_usr_id = true;
	}

	public void setUpd_usr_id(String upd_usr_id) {
		this.upd_usr_id = upd_usr_id;
		this.b_upd_usr_id = true;
	}

	public void setCtrl_lvl_cd(String ctrl_lvl_cd) {
		this.ctrl_lvl_cd = ctrl_lvl_cd;
		this.b_ctrl_lvl_cd = true;
	}

	public static SPC_ALOC_CTRL_OPT fromRequest(HttpServletRequest request) {
		String strUserId = getUserId(request);
		SPC_ALOC_CTRL_OPT model = new SPC_ALOC_CTRL_OPT();
		try {
			model.setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
			model.setPage_rows(JSPUtil.getParameter(request, "page_rows", ""));
			model.setRlane_cd(JSPUtil.getParameter(request, "rlane_cd", ""));
			model.setDir_cd(JSPUtil.getParameter(request, "dir_cd", ""));
			model.setVsl_cd(JSPUtil.getParameter(request, "vsl_cd", ""));
			model.setSkd_voy_no(JSPUtil.getParameter(request, "skd_voy_no", ""));
			model.setSkd_dir_cd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
			model.setRep_trd_cd(JSPUtil.getParameter(request, "rep_trd_cd", ""));
			model.setRep_sub_trd_cd(JSPUtil.getParameter(request, "rep_sub_trd_cd", ""));
			model.setCtrl_port_flg(JSPUtil.getParameter(request, "ctrl_port_flg", ""));
			model.setCtrl_wgt_flg(JSPUtil.getParameter(request, "ctrl_wgt_flg", ""));
			model.setCtrl_spc_flg(JSPUtil.getParameter(request, "ctrl_spc_flg", ""));
			model.setCtrl_40ft_hc_flg(JSPUtil.getParameter(request, "ctrl_40ft_hc_flg", ""));
			model.setCtrl_45ft_hc_flg(JSPUtil.getParameter(request, "ctrl_45ft_hc_flg", ""));
			model.setCtrl_rf_flg(JSPUtil.getParameter(request, "ctrl_rf_flg", ""));
			model.setCtrl_ts_flg(JSPUtil.getParameter(request, "ctrl_ts_flg", ""));
			model.setCtrl_lvl_cd(JSPUtil.getParameter(request, "ctrl_lvl_cd", ""));
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
		SPC_ALOC_CTRL_OPT model = null;
		Collection models = new ArrayList();
		String[] params = request.getParameterValues(prefix + "rlane_cd");
		if (params == null)
			return models;
		int length = request.getParameterValues(prefix + "rlane_cd").length;
		try {
			String[] ibflag = (JSPUtil.getParameter(request, prefix + "ibflag".trim(), length));
			String[] page_rows = (JSPUtil.getParameter(request, prefix + "page_rows".trim(), length));
			String[] rlane_cd = (JSPUtil.getParameter(request, prefix + "rlane_cd".trim(), length));
			String[] dir_cd = (JSPUtil.getParameter(request, prefix + "dir_cd".trim(), length));
			String[] vsl_cd = (JSPUtil.getParameter(request, prefix + "vsl_cd".trim(), length));
			String[] skd_voy_no = (JSPUtil.getParameter(request, prefix + "skd_voy_no".trim(), length));
			String[] skd_dir_cd = (JSPUtil.getParameter(request, prefix + "skd_dir_cd".trim(), length));
			String[] rep_trd_cd = (JSPUtil.getParameter(request, prefix + "rep_trd_cd".trim(), length));
			String[] rep_sub_trd_cd = (JSPUtil.getParameter(request, prefix + "rep_sub_trd_cd".trim(), length));
			String[] ctrl_port_flg = (JSPUtil.getParameter(request, prefix + "ctrl_port_flg".trim(), length));
			String[] ctrl_wgt_flg = (JSPUtil.getParameter(request, prefix + "ctrl_wgt_flg".trim(), length));
			String[] ctrl_spc_flg = (JSPUtil.getParameter(request, prefix + "ctrl_spc_flg".trim(), length));
			String[] ctrl_40ft_hc_flg = (JSPUtil.getParameter(request, prefix + "ctrl_40ft_hc_flg".trim(), length));
			String[] ctrl_45ft_hc_flg = (JSPUtil.getParameter(request, prefix + "ctrl_45ft_hc_flg".trim(), length));
			String[] ctrl_rf_flg = (JSPUtil.getParameter(request, prefix + "ctrl_rf_flg".trim(), length));
			String[] ctrl_ts_flg = (JSPUtil.getParameter(request, prefix + "ctrl_ts_flg".trim(), length));
			String[] ctrl_lvl_cd = (JSPUtil.getParameter(request, prefix + "ctrl_lvl_cd".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new SPC_ALOC_CTRL_OPT();
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (page_rows[i] != null)
					model.setPage_rows(page_rows[i]);
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
				if (rep_trd_cd[i] != null)
					model.setRep_trd_cd(rep_trd_cd[i]);
				if (rep_sub_trd_cd[i] != null)
					model.setRep_sub_trd_cd(rep_sub_trd_cd[i]);
				if (ctrl_port_flg[i] != null)
					model.setCtrl_port_flg(ctrl_port_flg[i]);
				if (ctrl_wgt_flg[i] != null)
					model.setCtrl_wgt_flg(ctrl_wgt_flg[i]);
				if (ctrl_spc_flg[i] != null)
					model.setCtrl_spc_flg(ctrl_spc_flg[i]);
				if (ctrl_40ft_hc_flg[i] != null)
					model.setCtrl_40ft_hc_flg(ctrl_40ft_hc_flg[i]);
				if (ctrl_45ft_hc_flg[i] != null)
					model.setCtrl_45ft_hc_flg(ctrl_45ft_hc_flg[i]);
				if (ctrl_rf_flg[i] != null)
					model.setCtrl_rf_flg(ctrl_rf_flg[i]);
				if (ctrl_ts_flg[i] != null)
					model.setCtrl_ts_flg(ctrl_ts_flg[i]);
				if (ctrl_lvl_cd[i] != null)
					model.setCtrl_lvl_cd(ctrl_lvl_cd[i]);
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