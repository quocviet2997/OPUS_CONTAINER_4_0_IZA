/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : SPC_DLY_FCAST_HIS.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2008-02-28
*@LastModifier : 서관영
*@LastVersion : 1.0
* 2008-02-28 서관영
* 1.0 최초 생성
* 2008-03-20 서관영
* CSR : N200802185179 
* Forecast Histroy 화면 개발  - by Office,by Account  
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
 * @author 서관영
 * @since J2EE 1.4
 */

public class SPC_DLY_FCAST_HIS implements Serializable {

	String ibflag = null;
	String page_rows = null;
	String rlane_cd = null;
	String dir_cd = null;
	String vsl_cd = null;
	String skd_voy_no = null;
	String skd_dir_cd = null;
	String sls_ofc_cd = null;
	String pol_cd = null;
	String pod_cd = null;
	String bse_dt = null;
	String fcast_lod_qty = null;
	String aloc_lod_qty = null;
	String fcast_cntr_wgt = null;
	String grs_rpb_rev = null;
	String cm_uc_amt = null;
	String rep_trd_cd = null;
	String rep_sub_trd_cd = null;
	String trd_cd = null;
	String sub_trd_cd = null;
	String ioc_cd = null;
	String sls_rhq_cd = null;
	String sls_rgn_ofc_cd = null;
	String cre_usr_id = null;
	String upd_usr_id = null;
	String sls_aq_cd = null;
	String ofc_knd_cd = null;
	String fcast_tp_cd = null;
	String bse_yrmon = null;
	String bse_wk = null;
	String fcast_40ft_hc_qty = null;
	String fcast_45ft_hc_qty = null;
	String fcast_rf_qty = null;
	String fcast_ttl_wgt = null;
	String aloc_40ft_hc_qty = null;
	String aloc_45ft_hc_qty = null;
	String aloc_rf_qty = null;
	String aloc_ttl_wgt = null;

	public SPC_DLY_FCAST_HIS() {
	}

	public SPC_DLY_FCAST_HIS(String ibflag, String page_rows, String rlane_cd,
			String dir_cd, String vsl_cd, String skd_voy_no, String skd_dir_cd,
			String sls_ofc_cd, String pol_cd, String pod_cd, String bse_dt,
			String fcast_lod_qty, String aloc_lod_qty, String fcast_cntr_wgt,
			String grs_rpb_rev, String cm_uc_amt, String rep_trd_cd,
			String rep_sub_trd_cd, String trd_cd, String sub_trd_cd,
			String ioc_cd, String sls_rhq_cd, String sls_rgn_ofc_cd,
			String cre_usr_id, String upd_usr_id, String sls_aq_cd,
			String ofc_knd_cd, String fcast_tp_cd, String bse_yrmon,
			String bse_wk, String fcast_40ft_hc_qty, String fcast_45ft_hc_qty,
			String fcast_rf_qty, String fcast_ttl_wgt, String aloc_40ft_hc_qty,
			String aloc_45ft_hc_qty, String aloc_rf_qty, String aloc_ttl_wgt) {
		this.ibflag = ibflag;
		this.page_rows = page_rows;
		this.rlane_cd = rlane_cd;
		this.dir_cd = dir_cd;
		this.vsl_cd = vsl_cd;
		this.skd_voy_no = skd_voy_no;
		this.skd_dir_cd = skd_dir_cd;
		this.sls_ofc_cd = sls_ofc_cd;
		this.pol_cd = pol_cd;
		this.pod_cd = pod_cd;
		this.bse_dt = bse_dt;
		this.fcast_lod_qty = fcast_lod_qty;
		this.aloc_lod_qty = aloc_lod_qty;
		this.fcast_cntr_wgt = fcast_cntr_wgt;
		this.grs_rpb_rev = grs_rpb_rev;
		this.cm_uc_amt = cm_uc_amt;
		this.rep_trd_cd = rep_trd_cd;
		this.rep_sub_trd_cd = rep_sub_trd_cd;
		this.trd_cd = trd_cd;
		this.sub_trd_cd = sub_trd_cd;
		this.ioc_cd = ioc_cd;
		this.sls_rhq_cd = sls_rhq_cd;
		this.sls_rgn_ofc_cd = sls_rgn_ofc_cd;
		this.cre_usr_id = cre_usr_id;
		this.upd_usr_id = upd_usr_id;
		this.sls_aq_cd = sls_aq_cd;
		this.ofc_knd_cd = ofc_knd_cd;
		this.fcast_tp_cd = fcast_tp_cd;
		this.bse_yrmon = bse_yrmon;
		this.bse_wk = bse_wk;
		this.fcast_40ft_hc_qty = fcast_40ft_hc_qty;
		this.fcast_45ft_hc_qty = fcast_45ft_hc_qty;
		this.fcast_rf_qty = fcast_rf_qty;
		this.fcast_ttl_wgt = fcast_ttl_wgt;
		this.aloc_40ft_hc_qty = aloc_40ft_hc_qty;
		this.aloc_45ft_hc_qty = aloc_45ft_hc_qty;
		this.aloc_rf_qty = aloc_rf_qty;
		this.aloc_ttl_wgt = aloc_ttl_wgt;
	}

	public String getIbflag() {
		return this.ibflag;
	}

	public String getPage_rows() {
		return this.page_rows;
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

	public String getSls_ofc_cd() {
		return this.sls_ofc_cd;
	}

	public String getPol_cd() {
		return this.pol_cd;
	}

	public String getPod_cd() {
		return this.pod_cd;
	}

	public String getBse_dt() {
		return this.bse_dt;
	}

	public String getFcast_lod_qty() {
		return this.fcast_lod_qty;
	}

	public String getAloc_lod_qty() {
		return this.aloc_lod_qty;
	}

	public String getFcast_cntr_wgt() {
		return this.fcast_cntr_wgt;
	}

	public String getGrs_rpb_rev() {
		return this.grs_rpb_rev;
	}

	public String getCm_uc_amt() {
		return this.cm_uc_amt;
	}

	public String getRep_trd_cd() {
		return this.rep_trd_cd;
	}

	public String getRep_sub_trd_cd() {
		return this.rep_sub_trd_cd;
	}

	public String getTrd_cd() {
		return this.trd_cd;
	}

	public String getSub_trd_cd() {
		return this.sub_trd_cd;
	}

	public String getIoc_cd() {
		return this.ioc_cd;
	}

	public String getSls_rhq_cd() {
		return this.sls_rhq_cd;
	}

	public String getSls_rgn_ofc_cd() {
		return this.sls_rgn_ofc_cd;
	}

	public String getCre_usr_id() {
		return this.cre_usr_id;
	}

	public String getUpd_usr_id() {
		return this.upd_usr_id;
	}

	public String getSls_aq_cd() {
		return this.sls_aq_cd;
	}

	public String getOfc_knd_cd() {
		return this.ofc_knd_cd;
	}

	public String getFcast_tp_cd() {
		return this.fcast_tp_cd;
	}

	public String getBse_yrmon() {
		return this.bse_yrmon;
	}

	public String getBse_wk() {
		return this.bse_wk;
	}

	public String getFcast_40ft_hc_qty() {
		return this.fcast_40ft_hc_qty;
	}

	public String getFcast_45ft_hc_qty() {
		return this.fcast_45ft_hc_qty;
	}

	public String getFcast_rf_qty() {
		return this.fcast_rf_qty;
	}

	public String getFcast_ttl_wgt() {
		return this.fcast_ttl_wgt;
	}

	public String getAloc_40ft_hc_qty() {
		return this.aloc_40ft_hc_qty;
	}

	public String getAloc_45ft_hc_qty() {
		return this.aloc_45ft_hc_qty;
	}

	public String getAloc_rf_qty() {
		return this.aloc_rf_qty;
	}

	public String getAloc_ttl_wgt() {
		return this.aloc_ttl_wgt;
	}

	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.b_ibflag=true;
	}

	public void setPage_rows(String page_rows) {
		this.page_rows = page_rows;
		//this.b_page_rows=true;
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

	public void setSls_ofc_cd(String sls_ofc_cd) {
		this.sls_ofc_cd = sls_ofc_cd;
		//this.b_sls_ofc_cd=true;
	}

	public void setPol_cd(String pol_cd) {
		this.pol_cd = pol_cd;
		//this.b_pol_cd=true;
	}

	public void setPod_cd(String pod_cd) {
		this.pod_cd = pod_cd;
		//this.b_pod_cd=true;
	}

	public void setBse_dt(String bse_dt) {
		this.bse_dt = bse_dt;
		//this.b_bse_dt=true;
	}

	public void setFcast_lod_qty(String fcast_lod_qty) {
		this.fcast_lod_qty = fcast_lod_qty;
		//this.b_fcast_lod_qty=true;
	}

	public void setAloc_lod_qty(String aloc_lod_qty) {
		this.aloc_lod_qty = aloc_lod_qty;
		//this.b_aloc_lod_qty=true;
	}

	public void setFcast_cntr_wgt(String fcast_cntr_wgt) {
		this.fcast_cntr_wgt = fcast_cntr_wgt;
		//this.b_fcast_cntr_wgt=true;
	}

	public void setGrs_rpb_rev(String grs_rpb_rev) {
		this.grs_rpb_rev = grs_rpb_rev;
		//this.b_grs_rpb_rev=true;
	}

	public void setCm_uc_amt(String cm_uc_amt) {
		this.cm_uc_amt = cm_uc_amt;
		//this.b_cm_uc_amt=true;
	}

	public void setRep_trd_cd(String rep_trd_cd) {
		this.rep_trd_cd = rep_trd_cd;
		//this.b_rep_trd_cd=true;
	}

	public void setRep_sub_trd_cd(String rep_sub_trd_cd) {
		this.rep_sub_trd_cd = rep_sub_trd_cd;
		//this.b_rep_sub_trd_cd=true;
	}

	public void setTrd_cd(String trd_cd) {
		this.trd_cd = trd_cd;
		//this.b_trd_cd=true;
	}

	public void setSub_trd_cd(String sub_trd_cd) {
		this.sub_trd_cd = sub_trd_cd;
		//this.b_sub_trd_cd=true;
	}

	public void setIoc_cd(String ioc_cd) {
		this.ioc_cd = ioc_cd;
		//this.b_ioc_cd=true;
	}

	public void setSls_rhq_cd(String sls_rhq_cd) {
		this.sls_rhq_cd = sls_rhq_cd;
		//this.b_sls_rhq_cd=true;
	}

	public void setSls_rgn_ofc_cd(String sls_rgn_ofc_cd) {
		this.sls_rgn_ofc_cd = sls_rgn_ofc_cd;
		//this.b_sls_rgn_ofc_cd=true;
	}

	public void setCre_usr_id(String cre_usr_id) {
		this.cre_usr_id = cre_usr_id;
		//this.b_cre_usr_id=true;
	}

	public void setUpd_usr_id(String upd_usr_id) {
		this.upd_usr_id = upd_usr_id;
		//this.b_upd_usr_id=true;
	}

	public void setSls_aq_cd(String sls_aq_cd) {
		this.sls_aq_cd = sls_aq_cd;
		//this.b_sls_aq_cd=true;
	}

	public void setOfc_knd_cd(String ofc_knd_cd) {
		this.ofc_knd_cd = ofc_knd_cd;
		//this.b_ofc_knd_cd=true;
	}

	public void setFcast_tp_cd(String fcast_tp_cd) {
		this.fcast_tp_cd = fcast_tp_cd;
		//this.b_fcast_tp_cd=true;
	}

	public void setBse_yrmon(String bse_yrmon) {
		this.bse_yrmon = bse_yrmon;
		//this.b_bse_yrmon=true;
	}

	public void setBse_wk(String bse_wk) {
		this.bse_wk = bse_wk;
		//this.b_bse_wk=true;
	}

	public void setFcast_40ft_hc_qty(String fcast_40ft_hc_qty) {
		this.fcast_40ft_hc_qty = fcast_40ft_hc_qty;
		//this.b_fcast_40ft_hc_qty=true;
	}

	public void setFcast_45ft_hc_qty(String fcast_45ft_hc_qty) {
		this.fcast_45ft_hc_qty = fcast_45ft_hc_qty;
		//this.b_fcast_45ft_hc_qty=true;
	}

	public void setFcast_rf_qty(String fcast_rf_qty) {
		this.fcast_rf_qty = fcast_rf_qty;
		//this.b_fcast_rf_qty=true;
	}

	public void setFcast_ttl_wgt(String fcast_ttl_wgt) {
		this.fcast_ttl_wgt = fcast_ttl_wgt;
		//this.b_fcast_ttl_wgt=true;
	}

	public void setAloc_40ft_hc_qty(String aloc_40ft_hc_qty) {
		this.aloc_40ft_hc_qty = aloc_40ft_hc_qty;
		//this.b_aloc_40ft_hc_qty=true;
	}

	public void setAloc_45ft_hc_qty(String aloc_45ft_hc_qty) {
		this.aloc_45ft_hc_qty = aloc_45ft_hc_qty;
		//this.b_aloc_45ft_hc_qty=true;
	}

	public void setAloc_rf_qty(String aloc_rf_qty) {
		this.aloc_rf_qty = aloc_rf_qty;
		//this.b_aloc_rf_qty=true;
	}

	public void setAloc_ttl_wgt(String aloc_ttl_wgt) {
		this.aloc_ttl_wgt = aloc_ttl_wgt;
		//this.b_aloc_ttl_wgt=true;
	}

	public static SPC_DLY_FCAST_HIS fromRequest(HttpServletRequest request) {
		String strUserId = getUserId(request);
		SPC_DLY_FCAST_HIS model = new SPC_DLY_FCAST_HIS();
		try {
			model.setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
			model.setPage_rows(JSPUtil.getParameter(request, "page_rows", ""));
			model.setRlane_cd(JSPUtil.getParameter(request, "rlane_cd", ""));
			model.setDir_cd(JSPUtil.getParameter(request, "dir_cd", ""));
			model.setVsl_cd(JSPUtil.getParameter(request, "vsl_cd", ""));
			model
					.setSkd_voy_no(JSPUtil.getParameter(request, "skd_voy_no",
							""));
			model
					.setSkd_dir_cd(JSPUtil.getParameter(request, "skd_dir_cd",
							""));
			model
					.setSls_ofc_cd(JSPUtil.getParameter(request, "sls_ofc_cd",
							""));
			model.setPol_cd(JSPUtil.getParameter(request, "pol_cd", ""));
			model.setPod_cd(JSPUtil.getParameter(request, "pod_cd", ""));
			model.setBse_dt(JSPUtil.getParameter(request, "bse_dt", ""));
			model.setFcast_lod_qty(JSPUtil.getParameter(request,
					"fcast_lod_qty", ""));
			model.setAloc_lod_qty(JSPUtil.getParameter(request, "aloc_lod_qty",
					""));
			model.setFcast_cntr_wgt(JSPUtil.getParameter(request,
					"fcast_cntr_wgt", ""));
			model.setGrs_rpb_rev(JSPUtil.getParameter(request, "grs_rpb_rev",
					""));
			model.setCm_uc_amt(JSPUtil.getParameter(request, "cm_uc_amt", ""));
			model
					.setRep_trd_cd(JSPUtil.getParameter(request, "rep_trd_cd",
							""));
			model.setRep_sub_trd_cd(JSPUtil.getParameter(request,
					"rep_sub_trd_cd", ""));
			model.setTrd_cd(JSPUtil.getParameter(request, "trd_cd", ""));
			model
					.setSub_trd_cd(JSPUtil.getParameter(request, "sub_trd_cd",
							""));
			model.setIoc_cd(JSPUtil.getParameter(request, "ioc_cd", ""));
			model
					.setSls_rhq_cd(JSPUtil.getParameter(request, "sls_rhq_cd",
							""));
			model.setSls_rgn_ofc_cd(JSPUtil.getParameter(request,
					"sls_rgn_ofc_cd", ""));
			model.setSls_aq_cd(JSPUtil.getParameter(request, "sls_aq_cd", ""));
			model
					.setOfc_knd_cd(JSPUtil.getParameter(request, "ofc_knd_cd",
							""));
			model.setFcast_tp_cd(JSPUtil.getParameter(request, "fcast_tp_cd",
					""));
			model.setBse_yrmon(JSPUtil.getParameter(request, "bse_yrmon", ""));
			model.setBse_wk(JSPUtil.getParameter(request, "bse_wk", ""));
			model.setFcast_40ft_hc_qty(JSPUtil.getParameter(request,
					"fcast_40ft_hc_qty", ""));
			model.setFcast_45ft_hc_qty(JSPUtil.getParameter(request,
					"fcast_45ft_hc_qty", ""));
			model.setFcast_rf_qty(JSPUtil.getParameter(request, "fcast_rf_qty",
					""));
			model.setFcast_ttl_wgt(JSPUtil.getParameter(request,
					"fcast_ttl_wgt", ""));
			model.setAloc_40ft_hc_qty(JSPUtil.getParameter(request,
					"aloc_40ft_hc_qty", ""));
			model.setAloc_45ft_hc_qty(JSPUtil.getParameter(request,
					"aloc_45ft_hc_qty", ""));
			model.setAloc_rf_qty(JSPUtil.getParameter(request, "aloc_rf_qty",
					""));
			model.setAloc_ttl_wgt(JSPUtil.getParameter(request, "aloc_ttl_wgt",
					""));
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
		SPC_DLY_FCAST_HIS model = null;
		Collection models = new ArrayList();
		String[] params = request.getParameterValues(prefix + "rlane_cd");
		if (params == null)
			return models;
		int length = request.getParameterValues(prefix + "rlane_cd").length;
		try {
			String[] ibflag = (JSPUtil.getParameter(request, prefix
					+ "ibflag".trim(), length));
			String[] page_rows = (JSPUtil.getParameter(request, prefix
					+ "page_rows".trim(), length));
			String[] rlane_cd = (JSPUtil.getParameter(request, prefix
					+ "rlane_cd".trim(), length));
			String[] dir_cd = (JSPUtil.getParameter(request, prefix
					+ "dir_cd".trim(), length));
			String[] vsl_cd = (JSPUtil.getParameter(request, prefix
					+ "vsl_cd".trim(), length));
			String[] skd_voy_no = (JSPUtil.getParameter(request, prefix
					+ "skd_voy_no".trim(), length));
			String[] skd_dir_cd = (JSPUtil.getParameter(request, prefix
					+ "skd_dir_cd".trim(), length));
			String[] sls_ofc_cd = (JSPUtil.getParameter(request, prefix
					+ "sls_ofc_cd".trim(), length));
			String[] pol_cd = (JSPUtil.getParameter(request, prefix
					+ "pol_cd".trim(), length));
			String[] pod_cd = (JSPUtil.getParameter(request, prefix
					+ "pod_cd".trim(), length));
			String[] bse_dt = (JSPUtil.getParameter(request, prefix
					+ "bse_dt".trim(), length));
			String[] fcast_lod_qty = (JSPUtil.getParameter(request, prefix
					+ "fcast_lod_qty".trim(), length));
			String[] aloc_lod_qty = (JSPUtil.getParameter(request, prefix
					+ "aloc_lod_qty".trim(), length));
			String[] fcast_cntr_wgt = (JSPUtil.getParameter(request, prefix
					+ "fcast_cntr_wgt".trim(), length));
			String[] grs_rpb_rev = (JSPUtil.getParameter(request, prefix
					+ "grs_rpb_rev".trim(), length));
			String[] cm_uc_amt = (JSPUtil.getParameter(request, prefix
					+ "cm_uc_amt".trim(), length));
			String[] rep_trd_cd = (JSPUtil.getParameter(request, prefix
					+ "rep_trd_cd".trim(), length));
			String[] rep_sub_trd_cd = (JSPUtil.getParameter(request, prefix
					+ "rep_sub_trd_cd".trim(), length));
			String[] trd_cd = (JSPUtil.getParameter(request, prefix
					+ "trd_cd".trim(), length));
			String[] sub_trd_cd = (JSPUtil.getParameter(request, prefix
					+ "sub_trd_cd".trim(), length));
			String[] ioc_cd = (JSPUtil.getParameter(request, prefix
					+ "ioc_cd".trim(), length));
			String[] sls_rhq_cd = (JSPUtil.getParameter(request, prefix
					+ "sls_rhq_cd".trim(), length));
			String[] sls_rgn_ofc_cd = (JSPUtil.getParameter(request, prefix
					+ "sls_rgn_ofc_cd".trim(), length));
			String[] sls_aq_cd = (JSPUtil.getParameter(request, prefix
					+ "sls_aq_cd".trim(), length));
			String[] ofc_knd_cd = (JSPUtil.getParameter(request, prefix
					+ "ofc_knd_cd".trim(), length));
			String[] fcast_tp_cd = (JSPUtil.getParameter(request, prefix
					+ "fcast_tp_cd".trim(), length));
			String[] bse_yrmon = (JSPUtil.getParameter(request, prefix
					+ "bse_yrmon".trim(), length));
			String[] bse_wk = (JSPUtil.getParameter(request, prefix
					+ "bse_wk".trim(), length));
			String[] fcast_40ft_hc_qty = (JSPUtil.getParameter(request, prefix
					+ "fcast_40ft_hc_qty".trim(), length));
			String[] fcast_45ft_hc_qty = (JSPUtil.getParameter(request, prefix
					+ "fcast_45ft_hc_qty".trim(), length));
			String[] fcast_rf_qty = (JSPUtil.getParameter(request, prefix
					+ "fcast_rf_qty".trim(), length));
			String[] fcast_ttl_wgt = (JSPUtil.getParameter(request, prefix
					+ "fcast_ttl_wgt".trim(), length));
			String[] aloc_40ft_hc_qty = (JSPUtil.getParameter(request, prefix
					+ "aloc_40ft_hc_qty".trim(), length));
			String[] aloc_45ft_hc_qty = (JSPUtil.getParameter(request, prefix
					+ "aloc_45ft_hc_qty".trim(), length));
			String[] aloc_rf_qty = (JSPUtil.getParameter(request, prefix
					+ "aloc_rf_qty".trim(), length));
			String[] aloc_ttl_wgt = (JSPUtil.getParameter(request, prefix
					+ "aloc_ttl_wgt".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new SPC_DLY_FCAST_HIS();
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
				if (pod_cd[i] != null)
					model.setPod_cd(pod_cd[i]);
				if (bse_dt[i] != null)
					model.setBse_dt(bse_dt[i]);
				if (fcast_lod_qty[i] != null)
					model.setFcast_lod_qty(fcast_lod_qty[i]);
				if (aloc_lod_qty[i] != null)
					model.setAloc_lod_qty(aloc_lod_qty[i]);
				if (fcast_cntr_wgt[i] != null)
					model.setFcast_cntr_wgt(fcast_cntr_wgt[i]);
				if (grs_rpb_rev[i] != null)
					model.setGrs_rpb_rev(grs_rpb_rev[i]);
				if (cm_uc_amt[i] != null)
					model.setCm_uc_amt(cm_uc_amt[i]);
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
				if (sls_aq_cd[i] != null)
					model.setSls_aq_cd(sls_aq_cd[i]);
				if (ofc_knd_cd[i] != null)
					model.setOfc_knd_cd(ofc_knd_cd[i]);
				if (fcast_tp_cd[i] != null)
					model.setFcast_tp_cd(fcast_tp_cd[i]);
				if (bse_yrmon[i] != null)
					model.setBse_yrmon(bse_yrmon[i]);
				if (bse_wk[i] != null)
					model.setBse_wk(bse_wk[i]);
				if (fcast_40ft_hc_qty[i] != null)
					model.setFcast_40ft_hc_qty(fcast_40ft_hc_qty[i]);
				if (fcast_45ft_hc_qty[i] != null)
					model.setFcast_45ft_hc_qty(fcast_45ft_hc_qty[i]);
				if (fcast_rf_qty[i] != null)
					model.setFcast_rf_qty(fcast_rf_qty[i]);
				if (fcast_ttl_wgt[i] != null)
					model.setFcast_ttl_wgt(fcast_ttl_wgt[i]);
				if (aloc_40ft_hc_qty[i] != null)
					model.setAloc_40ft_hc_qty(aloc_40ft_hc_qty[i]);
				if (aloc_45ft_hc_qty[i] != null)
					model.setAloc_45ft_hc_qty(aloc_45ft_hc_qty[i]);
				if (aloc_rf_qty[i] != null)
					model.setAloc_rf_qty(aloc_rf_qty[i]);
				if (aloc_ttl_wgt[i] != null)
					model.setAloc_ttl_wgt(aloc_ttl_wgt[i]);
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