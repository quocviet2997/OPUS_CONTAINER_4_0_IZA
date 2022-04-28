/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : SPC_NSHW_RSLT.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2007-10-05
*@LastModifier : 김원섭
*@LastVersion : 1.0
* 2007-10-05 김원섭
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

public class SPC_NSHW_RSLT implements Serializable {

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

	String sls_ofc_cd = null;

	boolean b_sls_ofc_cd = false;

	String pol_cd = null;

	boolean b_pol_cd = false;

	String aloc_ddct_bse_cd = null;

	boolean b_aloc_ddct_bse_cd = false;

	String fcast_lod_qty = null;

	boolean b_fcast_lod_qty = false;

	String aloc_lod_qty = null;

	boolean b_aloc_lod_qty = false;

	String bkg_lod_qty = null;

	boolean b_bkg_lod_qty = false;

	String rep_trd_cd = null;

	boolean b_rep_trd_cd = false;

	String rep_sub_trd_cd = null;

	boolean b_rep_sub_trd_cd = false;

	String trd_cd = null;

	boolean b_trd_cd = false;

	String sub_trd_cd = null;

	boolean b_sub_trd_cd = false;

	String ioc_cd = null;

	boolean b_ioc_cd = false;

	String sls_rhq_cd = null;

	boolean b_sls_rhq_cd = false;

	String sls_rgn_ofc_cd = null;

	boolean b_sls_rgn_ofc_cd = false;

	String cre_usr_id = null;

	boolean b_cre_usr_id = false;

	String upd_usr_id = null;

	boolean b_upd_usr_id = false;

	String ofc_knd_cd = null;

	boolean b_ofc_knd_cd = false;

	String sls_aq_cd = null;

	boolean b_sls_aq_cd = false;

	String bse_yrmon = null;

	boolean b_bse_yrmon = false;

	String bse_wk = null;

	boolean b_bse_wk = false;

	String org_fcast_lod_qty = null;

	boolean b_org_fcast_lod_qty = false;

	String org_aloc_lod_qty = null;

	boolean b_org_aloc_lod_qty = false;

	String[][] columns = { { "rlane_cd", "PK" }, { "dir_cd", "PK" }, { "vsl_cd", "PK" }, { "skd_voy_no", "PK" },
			{ "skd_dir_cd", "PK" }, { "sls_ofc_cd", "PK" }, { "pol_cd", "PK" }, { "aloc_ddct_bse_cd", "PK" },
			{ "fcast_lod_qty", "" }, { "aloc_lod_qty", "" }, { "bkg_lod_qty", "" }, { "rep_trd_cd", "" },
			{ "rep_sub_trd_cd", "" }, { "trd_cd", "" }, { "sub_trd_cd", "" }, { "ioc_cd", "" }, { "sls_rhq_cd", "" },
			{ "sls_rgn_ofc_cd", "" }, { "cre_usr_id", "" }, { "upd_usr_id", "" }, { "ofc_knd_cd", "" },
			{ "sls_aq_cd", "" }, { "bse_yrmon", "PK" }, { "bse_wk", "" } };

	public SPC_NSHW_RSLT() {
	}

	public SPC_NSHW_RSLT(String ibflag, String page_rows, String rlane_cd, String dir_cd, String vsl_cd,
			String skd_voy_no, String skd_dir_cd, String sls_ofc_cd, String pol_cd, String aloc_ddct_bse_cd,
			String fcast_lod_qty, String aloc_lod_qty, String bkg_lod_qty, String rep_trd_cd, String rep_sub_trd_cd,
			String trd_cd, String sub_trd_cd, String ioc_cd, String sls_rhq_cd, String sls_rgn_ofc_cd,
			String cre_usr_id, String upd_usr_id, String ofc_knd_cd, String sls_aq_cd, String bse_yrmon, String bse_wk,
			String org_fcast_lod_qty, String org_aloc_lod_qty) {
		this.ibflag = ibflag;
		this.page_rows = page_rows;
		this.rlane_cd = rlane_cd;
		this.dir_cd = dir_cd;
		this.vsl_cd = vsl_cd;
		this.skd_voy_no = skd_voy_no;
		this.skd_dir_cd = skd_dir_cd;
		this.sls_ofc_cd = sls_ofc_cd;
		this.pol_cd = pol_cd;
		this.aloc_ddct_bse_cd = aloc_ddct_bse_cd;
		this.fcast_lod_qty = fcast_lod_qty;
		this.aloc_lod_qty = aloc_lod_qty;
		this.bkg_lod_qty = bkg_lod_qty;
		this.rep_trd_cd = rep_trd_cd;
		this.rep_sub_trd_cd = rep_sub_trd_cd;
		this.trd_cd = trd_cd;
		this.sub_trd_cd = sub_trd_cd;
		this.ioc_cd = ioc_cd;
		this.sls_rhq_cd = sls_rhq_cd;
		this.sls_rgn_ofc_cd = sls_rgn_ofc_cd;
		this.cre_usr_id = cre_usr_id;
		this.upd_usr_id = upd_usr_id;
		this.ofc_knd_cd = ofc_knd_cd;
		this.sls_aq_cd = sls_aq_cd;
		this.bse_yrmon = bse_yrmon;
		this.bse_wk = bse_wk;
		this.org_fcast_lod_qty = org_fcast_lod_qty;
		this.org_aloc_lod_qty = org_aloc_lod_qty;
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

	public String getSls_ofc_cd() {
		return this.sls_ofc_cd;
	}

	public boolean getSls_ofc_cdStatus() {
		return this.b_sls_ofc_cd;
	}

	public String getPol_cd() {
		return this.pol_cd;
	}

	public boolean getPol_cdStatus() {
		return this.b_pol_cd;
	}

	public String getAloc_ddct_bse_cd() {
		return this.aloc_ddct_bse_cd;
	}

	public boolean getAloc_ddct_bse_cdStatus() {
		return this.b_aloc_ddct_bse_cd;
	}

	public String getFcast_lod_qty() {
		return this.fcast_lod_qty;
	}

	public boolean getFcast_lod_qtyStatus() {
		return this.b_fcast_lod_qty;
	}

	public String getAloc_lod_qty() {
		return this.aloc_lod_qty;
	}

	public boolean getAloc_lod_qtyStatus() {
		return this.b_aloc_lod_qty;
	}

	public String getBkg_lod_qty() {
		return this.bkg_lod_qty;
	}

	public boolean getBkg_lod_qtyStatus() {
		return this.b_bkg_lod_qty;
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

	public String getIoc_cd() {
		return this.ioc_cd;
	}

	public boolean getIoc_cdStatus() {
		return this.b_ioc_cd;
	}

	public String getSls_rhq_cd() {
		return this.sls_rhq_cd;
	}

	public boolean getSls_rhq_cdStatus() {
		return this.b_sls_rhq_cd;
	}

	public String getSls_rgn_ofc_cd() {
		return this.sls_rgn_ofc_cd;
	}

	public boolean getSls_rgn_ofc_cdStatus() {
		return this.b_sls_rgn_ofc_cd;
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

	public String getOfc_knd_cd() {
		return this.ofc_knd_cd;
	}

	public boolean getOfc_knd_cdStatus() {
		return this.b_ofc_knd_cd;
	}

	public String getSls_aq_cd() {
		return this.sls_aq_cd;
	}

	public boolean getSls_aq_cdStatus() {
		return this.b_sls_aq_cd;
	}

	public String getBse_yrmon() {
		return this.bse_yrmon;
	}

	public boolean getBse_yrmonStatus() {
		return this.b_bse_yrmon;
	}

	public String getBse_wk() {
		return this.bse_wk;
	}

	public boolean getBse_wkStatus() {
		return this.b_bse_wk;
	}

	public String getOrg_fcast_lod_qty() {
		return this.org_fcast_lod_qty;
	}

	public boolean getOrg_fcast_lod_qtyStatus() {
		return this.b_org_fcast_lod_qty;
	}

	public String getOrg_aloc_lod_qty() {
		return this.org_aloc_lod_qty;
	}

	public boolean getOrg_aloc_lod_qtyStatus() {
		return this.b_org_aloc_lod_qty;
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

	public void setSls_ofc_cd(String sls_ofc_cd) {
		this.sls_ofc_cd = sls_ofc_cd;
		this.b_sls_ofc_cd = true;
	}

	public void setPol_cd(String pol_cd) {
		this.pol_cd = pol_cd;
		this.b_pol_cd = true;
	}

	public void setAloc_ddct_bse_cd(String aloc_ddct_bse_cd) {
		this.aloc_ddct_bse_cd = aloc_ddct_bse_cd;
		this.b_aloc_ddct_bse_cd = true;
	}

	public void setFcast_lod_qty(String fcast_lod_qty) {
		this.fcast_lod_qty = fcast_lod_qty;
		this.b_fcast_lod_qty = true;
	}

	public void setAloc_lod_qty(String aloc_lod_qty) {
		this.aloc_lod_qty = aloc_lod_qty;
		this.b_aloc_lod_qty = true;
	}

	public void setBkg_lod_qty(String bkg_lod_qty) {
		this.bkg_lod_qty = bkg_lod_qty;
		this.b_bkg_lod_qty = true;
	}

	public void setRep_trd_cd(String rep_trd_cd) {
		this.rep_trd_cd = rep_trd_cd;
		this.b_rep_trd_cd = true;
	}

	public void setRep_sub_trd_cd(String rep_sub_trd_cd) {
		this.rep_sub_trd_cd = rep_sub_trd_cd;
		this.b_rep_sub_trd_cd = true;
	}

	public void setTrd_cd(String trd_cd) {
		this.trd_cd = trd_cd;
		this.b_trd_cd = true;
	}

	public void setSub_trd_cd(String sub_trd_cd) {
		this.sub_trd_cd = sub_trd_cd;
		this.b_sub_trd_cd = true;
	}

	public void setIoc_cd(String ioc_cd) {
		this.ioc_cd = ioc_cd;
		this.b_ioc_cd = true;
	}

	public void setSls_rhq_cd(String sls_rhq_cd) {
		this.sls_rhq_cd = sls_rhq_cd;
		this.b_sls_rhq_cd = true;
	}

	public void setSls_rgn_ofc_cd(String sls_rgn_ofc_cd) {
		this.sls_rgn_ofc_cd = sls_rgn_ofc_cd;
		this.b_sls_rgn_ofc_cd = true;
	}

	public void setCre_usr_id(String cre_usr_id) {
		this.cre_usr_id = cre_usr_id;
		this.b_cre_usr_id = true;
	}

	public void setUpd_usr_id(String upd_usr_id) {
		this.upd_usr_id = upd_usr_id;
		this.b_upd_usr_id = true;
	}

	public void setOfc_knd_cd(String ofc_knd_cd) {
		this.ofc_knd_cd = ofc_knd_cd;
		this.b_ofc_knd_cd = true;
	}

	public void setSls_aq_cd(String sls_aq_cd) {
		this.sls_aq_cd = sls_aq_cd;
		this.b_sls_aq_cd = true;
	}

	public void setBse_yrmon(String bse_yrmon) {
		this.bse_yrmon = bse_yrmon;
		this.b_bse_yrmon = true;
	}

	public void setBse_wk(String bse_wk) {
		this.bse_wk = bse_wk;
		this.b_bse_wk = true;
	}

	public void setOrg_fcast_lod_qty(String org_fcast_lod_qty) {
		this.org_fcast_lod_qty = org_fcast_lod_qty;
		this.b_org_fcast_lod_qty = true;
	}

	public void setOrg_aloc_lod_qty(String org_aloc_lod_qty) {
		this.org_aloc_lod_qty = org_aloc_lod_qty;
		this.b_org_aloc_lod_qty = true;
	}

	public static SPC_NSHW_RSLT fromRequest(HttpServletRequest request) {
		String strUserId = getUserId(request);
		SPC_NSHW_RSLT model = new SPC_NSHW_RSLT();
		try {
			model.setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
			model.setPage_rows(JSPUtil.getParameter(request, "page_rows", ""));
			model.setRlane_cd(JSPUtil.getParameter(request, "rlane_cd", ""));
			model.setDir_cd(JSPUtil.getParameter(request, "dir_cd", ""));
			model.setVsl_cd(JSPUtil.getParameter(request, "vsl_cd", ""));
			model.setSkd_voy_no(JSPUtil.getParameter(request, "skd_voy_no", ""));
			model.setSkd_dir_cd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
			model.setSls_ofc_cd(JSPUtil.getParameter(request, "sls_ofc_cd", ""));
			model.setPol_cd(JSPUtil.getParameter(request, "pol_cd", ""));
			model.setAloc_ddct_bse_cd(JSPUtil.getParameter(request, "aloc_ddct_bse_cd", ""));
			model.setFcast_lod_qty(JSPUtil.getParameter(request, "fcast_lod_qty", ""));
			model.setAloc_lod_qty(JSPUtil.getParameter(request, "aloc_lod_qty", ""));
			model.setBkg_lod_qty(JSPUtil.getParameter(request, "bkg_lod_qty", ""));
			model.setRep_trd_cd(JSPUtil.getParameter(request, "rep_trd_cd", ""));
			model.setRep_sub_trd_cd(JSPUtil.getParameter(request, "rep_sub_trd_cd", ""));
			model.setTrd_cd(JSPUtil.getParameter(request, "trd_cd", ""));
			model.setSub_trd_cd(JSPUtil.getParameter(request, "sub_trd_cd", ""));
			model.setIoc_cd(JSPUtil.getParameter(request, "ioc_cd", ""));
			model.setSls_rhq_cd(JSPUtil.getParameter(request, "sls_rhq_cd", ""));
			model.setSls_rgn_ofc_cd(JSPUtil.getParameter(request, "sls_rgn_ofc_cd", ""));
			model.setOfc_knd_cd(JSPUtil.getParameter(request, "ofc_knd_cd", ""));
			model.setSls_aq_cd(JSPUtil.getParameter(request, "sls_aq_cd", ""));
			model.setBse_yrmon(JSPUtil.getParameter(request, "bse_yrmon", ""));
			model.setBse_wk(JSPUtil.getParameter(request, "bse_wk", ""));
			model.setOrg_fcast_lod_qty(JSPUtil.getParameter(request, "org_fcast_lod_qty", ""));
			model.setOrg_aloc_lod_qty(JSPUtil.getParameter(request, "org_aloc_lod_qty", ""));
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
		SPC_NSHW_RSLT model = null;
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
			String[] sls_ofc_cd = (JSPUtil.getParameter(request, prefix + "sls_ofc_cd".trim(), length));
			String[] pol_cd = (JSPUtil.getParameter(request, prefix + "pol_cd".trim(), length));
			String[] aloc_ddct_bse_cd = (JSPUtil.getParameter(request, prefix + "aloc_ddct_bse_cd".trim(), length));
			String[] fcast_lod_qty = (JSPUtil.getParameter(request, prefix + "fcast_lod_qty".trim(), length));
			String[] aloc_lod_qty = (JSPUtil.getParameter(request, prefix + "aloc_lod_qty".trim(), length));
			String[] bkg_lod_qty = (JSPUtil.getParameter(request, prefix + "bkg_lod_qty".trim(), length));
			String[] rep_trd_cd = (JSPUtil.getParameter(request, prefix + "rep_trd_cd".trim(), length));
			String[] rep_sub_trd_cd = (JSPUtil.getParameter(request, prefix + "rep_sub_trd_cd".trim(), length));
			String[] trd_cd = (JSPUtil.getParameter(request, prefix + "trd_cd".trim(), length));
			String[] sub_trd_cd = (JSPUtil.getParameter(request, prefix + "sub_trd_cd".trim(), length));
			String[] ioc_cd = (JSPUtil.getParameter(request, prefix + "ioc_cd".trim(), length));
			String[] sls_rhq_cd = (JSPUtil.getParameter(request, prefix + "sls_rhq_cd".trim(), length));
			String[] sls_rgn_ofc_cd = (JSPUtil.getParameter(request, prefix + "sls_rgn_ofc_cd".trim(), length));
			String[] ofc_knd_cd = (JSPUtil.getParameter(request, prefix + "ofc_knd_cd".trim(), length));
			String[] sls_aq_cd = (JSPUtil.getParameter(request, prefix + "sls_aq_cd".trim(), length));
			String[] bse_yrmon = (JSPUtil.getParameter(request, prefix + "bse_yrmon".trim(), length));
			String[] bse_wk = (JSPUtil.getParameter(request, prefix + "bse_wk".trim(), length));
			String[] org_fcast_lod_qty = (JSPUtil.getParameter(request, prefix + "org_fcast_lod_qty".trim(), length));
			String[] org_aloc_lod_qty = (JSPUtil.getParameter(request, prefix + "org_aloc_lod_qty".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new SPC_NSHW_RSLT();
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
				if (sls_ofc_cd[i] != null)
					model.setSls_ofc_cd(sls_ofc_cd[i]);
				if (pol_cd[i] != null)
					model.setPol_cd(pol_cd[i]);
				if (aloc_ddct_bse_cd[i] != null)
					model.setAloc_ddct_bse_cd(aloc_ddct_bse_cd[i]);
				if (fcast_lod_qty[i] != null)
					model.setFcast_lod_qty(fcast_lod_qty[i]);
				if (aloc_lod_qty[i] != null)
					model.setAloc_lod_qty(aloc_lod_qty[i]);
				if (bkg_lod_qty[i] != null)
					model.setBkg_lod_qty(bkg_lod_qty[i]);
				if (rep_trd_cd[i] != null)
					model.setRep_trd_cd(rep_trd_cd[i]);
				if (rep_sub_trd_cd[i] != null)
					model.setRep_sub_trd_cd(rep_sub_trd_cd[i]);
				if (trd_cd[i] != null)
					model.setTrd_cd(trd_cd[i]);
				if (sub_trd_cd[i] != null)
					model.setSub_trd_cd(sub_trd_cd[i]);
				if (ioc_cd[i] != null)
					model.setIoc_cd(ioc_cd[i]);
				if (sls_rhq_cd[i] != null)
					model.setSls_rhq_cd(sls_rhq_cd[i]);
				if (sls_rgn_ofc_cd[i] != null)
					model.setSls_rgn_ofc_cd(sls_rgn_ofc_cd[i]);
				if (ofc_knd_cd[i] != null)
					model.setOfc_knd_cd(ofc_knd_cd[i]);
				if (sls_aq_cd[i] != null)
					model.setSls_aq_cd(sls_aq_cd[i]);
				if (bse_yrmon[i] != null)
					model.setBse_yrmon(bse_yrmon[i]);
				if (bse_wk[i] != null)
					model.setBse_wk(bse_wk[i]);
				if (org_fcast_lod_qty[i] != null)
					model.setOrg_fcast_lod_qty(org_fcast_lod_qty[i]);
				if (org_aloc_lod_qty[i] != null)
					model.setOrg_aloc_lod_qty(org_aloc_lod_qty[i]);
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