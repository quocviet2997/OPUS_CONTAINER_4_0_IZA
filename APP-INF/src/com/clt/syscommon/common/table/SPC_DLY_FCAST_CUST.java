/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : SPC_DLY_FCAST_CUST.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2007-12-11
*@LastModifier : 김원섭
*@LastVersion : 1.0
* 2007-12-11 김원섭
* 1.0 최초 생성
* 2008-02-25 김원섭
* CSR : N200802180006   Forecast history 화면 개발 요청 
*    - Table Schema 변경
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

public class SPC_DLY_FCAST_CUST implements Serializable {

	String ibflag = null;
	String page_rows = null;
	String rlane_cd = null;
	String dir_cd = null;
	String vsl_cd = null;
	String skd_voy_no = null;
	String skd_dir_cd = null;
	String ioc_ts_cd = null;
	String srep_usr_id = null;
	String cust_cnt_cd = null;
	String cust_seq = null;
	String pol_cd = null;
	String pod_cd = null;
	String fcast_ofc_cd = null;
	String fcast_cust_tp_cd = null;
	String ioc_cd = null;
	String rep_trd_cd = null;
	String rep_sub_trd_cd = null;
	String trd_cd = null;
	String sub_trd_cd = null;
	String sls_rhq_cd = null;
	String sls_aq_cd = null;
	String sls_rgn_ofc_cd = null;
	String sls_ofc_cd = null;
	String fcast_ttl_qty = null;
	String fcast_40ft_hc_qty = null;
	String fcast_45ft_hc_qty = null;
	String fcast_rf_qty = null;
	String fcast_ttl_wgt = null;
	String cfm_ttl_qty = null;
	String cfm_40ft_hc_qty = null;
	String cfm_45ft_hc_qty = null;
	String cfm_rf_qty = null;
	String cfm_ttl_wgt = null;
	String ctrl_lvl_cd = null;
	String modi_gdt = null;
	String cfm_usr_id = null;
	String cfm_dt = null;
	String cre_usr_id = null;
	String upd_usr_id = null;
	String usd_bkg_ttl_qty = null;
	String usd_bkg_20ft_qty = null;
	String usd_bkg_40ft_qty = null;
	String usd_bkg_40ft_hc_qty = null;
	String usd_bkg_45ft_hc_qty = null;
	String usd_bkg_rf_qty = null;
	String usd_bkg_ttl_wgt = null;

	public SPC_DLY_FCAST_CUST() {
	}

	public SPC_DLY_FCAST_CUST(String ibflag, String page_rows, String rlane_cd, String dir_cd, String vsl_cd, String skd_voy_no, String skd_dir_cd, String ioc_ts_cd, String srep_usr_id, String cust_cnt_cd, String cust_seq, String pol_cd, String pod_cd, String fcast_ofc_cd, String fcast_cust_tp_cd,
			String ioc_cd, String rep_trd_cd, String rep_sub_trd_cd, String trd_cd, String sub_trd_cd, String sls_rhq_cd, String sls_aq_cd, String sls_rgn_ofc_cd, String sls_ofc_cd, String fcast_ttl_qty, String fcast_40ft_hc_qty, String fcast_45ft_hc_qty, String fcast_rf_qty, String fcast_ttl_wgt,
			String cfm_ttl_qty, String cfm_40ft_hc_qty, String cfm_45ft_hc_qty, String cfm_rf_qty, String cfm_ttl_wgt, String ctrl_lvl_cd, String modi_gdt, String cfm_usr_id, String cfm_dt, String cre_usr_id, String upd_usr_id, String usd_bkg_ttl_qty, String usd_bkg_20ft_qty,
			String usd_bkg_40ft_qty, String usd_bkg_40ft_hc_qty, String usd_bkg_45ft_hc_qty, String usd_bkg_rf_qty, String usd_bkg_ttl_wgt) {
		this.ibflag = ibflag;
		this.page_rows = page_rows;
		this.rlane_cd = rlane_cd;
		this.dir_cd = dir_cd;
		this.vsl_cd = vsl_cd;
		this.skd_voy_no = skd_voy_no;
		this.skd_dir_cd = skd_dir_cd;
		this.ioc_ts_cd = ioc_ts_cd;
		this.srep_usr_id = srep_usr_id;
		this.cust_cnt_cd = cust_cnt_cd;
		this.cust_seq = cust_seq;
		this.pol_cd = pol_cd;
		this.pod_cd = pod_cd;
		this.fcast_ofc_cd = fcast_ofc_cd;
		this.fcast_cust_tp_cd = fcast_cust_tp_cd;
		this.ioc_cd = ioc_cd;
		this.rep_trd_cd = rep_trd_cd;
		this.rep_sub_trd_cd = rep_sub_trd_cd;
		this.trd_cd = trd_cd;
		this.sub_trd_cd = sub_trd_cd;
		this.sls_rhq_cd = sls_rhq_cd;
		this.sls_aq_cd = sls_aq_cd;
		this.sls_rgn_ofc_cd = sls_rgn_ofc_cd;
		this.sls_ofc_cd = sls_ofc_cd;
		this.fcast_ttl_qty = fcast_ttl_qty;
		this.fcast_40ft_hc_qty = fcast_40ft_hc_qty;
		this.fcast_45ft_hc_qty = fcast_45ft_hc_qty;
		this.fcast_rf_qty = fcast_rf_qty;
		this.fcast_ttl_wgt = fcast_ttl_wgt;
		this.cfm_ttl_qty = cfm_ttl_qty;
		this.cfm_40ft_hc_qty = cfm_40ft_hc_qty;
		this.cfm_45ft_hc_qty = cfm_45ft_hc_qty;
		this.cfm_rf_qty = cfm_rf_qty;
		this.cfm_ttl_wgt = cfm_ttl_wgt;
		this.ctrl_lvl_cd = ctrl_lvl_cd;
		this.modi_gdt = modi_gdt;
		this.cfm_usr_id = cfm_usr_id;
		this.cfm_dt = cfm_dt;
		this.cre_usr_id = cre_usr_id;
		this.upd_usr_id = upd_usr_id;
		this.usd_bkg_ttl_qty = usd_bkg_ttl_qty;
		this.usd_bkg_20ft_qty = usd_bkg_20ft_qty;
		this.usd_bkg_40ft_qty = usd_bkg_40ft_qty;
		this.usd_bkg_40ft_hc_qty = usd_bkg_40ft_hc_qty;
		this.usd_bkg_45ft_hc_qty = usd_bkg_45ft_hc_qty;
		this.usd_bkg_rf_qty = usd_bkg_rf_qty;
		this.usd_bkg_ttl_wgt = usd_bkg_ttl_wgt;
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

	public String getIoc_ts_cd() {
		return this.ioc_ts_cd;
	}

	public String getSrep_usr_id() {
		return this.srep_usr_id;
	}

	public String getCust_cnt_cd() {
		return this.cust_cnt_cd;
	}

	public String getCust_seq() {
		return this.cust_seq;
	}

	public String getPol_cd() {
		return this.pol_cd;
	}

	public String getPod_cd() {
		return this.pod_cd;
	}

	public String getFcast_ofc_cd() {
		return this.fcast_ofc_cd;
	}

	public String getFcast_cust_tp_cd() {
		return this.fcast_cust_tp_cd;
	}

	public String getIoc_cd() {
		return this.ioc_cd;
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

	public String getSls_rhq_cd() {
		return this.sls_rhq_cd;
	}

	public String getSls_aq_cd() {
		return this.sls_aq_cd;
	}

	public String getSls_rgn_ofc_cd() {
		return this.sls_rgn_ofc_cd;
	}

	public String getSls_ofc_cd() {
		return this.sls_ofc_cd;
	}

	public String getFcast_ttl_qty() {
		return this.fcast_ttl_qty;
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

	public String getCfm_ttl_qty() {
		return this.cfm_ttl_qty;
	}

	public String getCfm_40ft_hc_qty() {
		return this.cfm_40ft_hc_qty;
	}

	public String getCfm_45ft_hc_qty() {
		return this.cfm_45ft_hc_qty;
	}

	public String getCfm_rf_qty() {
		return this.cfm_rf_qty;
	}

	public String getCfm_ttl_wgt() {
		return this.cfm_ttl_wgt;
	}

	public String getCtrl_lvl_cd() {
		return this.ctrl_lvl_cd;
	}

	public String getModi_gdt() {
		return this.modi_gdt;
	}

	public String getCfm_usr_id() {
		return this.cfm_usr_id;
	}

	public String getCfm_dt() {
		return this.cfm_dt;
	}

	public String getCre_usr_id() {
		return this.cre_usr_id;
	}

	public String getUpd_usr_id() {
		return this.upd_usr_id;
	}

	public String getUsd_bkg_ttl_qty() {
		return this.usd_bkg_ttl_qty;
	}

	public String getUsd_bkg_20ft_qty() {
		return this.usd_bkg_20ft_qty;
	}

	public String getUsd_bkg_40ft_qty() {
		return this.usd_bkg_40ft_qty;
	}

	public String getUsd_bkg_40ft_hc_qty() {
		return this.usd_bkg_40ft_hc_qty;
	}

	public String getUsd_bkg_45ft_hc_qty() {
		return this.usd_bkg_45ft_hc_qty;
	}

	public String getUsd_bkg_rf_qty() {
		return this.usd_bkg_rf_qty;
	}

	public String getUsd_bkg_ttl_wgt() {
		return this.usd_bkg_ttl_wgt;
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

	public void setIoc_ts_cd(String ioc_ts_cd) {
		this.ioc_ts_cd = ioc_ts_cd;
		//this.b_ioc_ts_cd=true;
	}

	public void setSrep_usr_id(String srep_usr_id) {
		this.srep_usr_id = srep_usr_id;
		//this.b_srep_usr_id=true;
	}

	public void setCust_cnt_cd(String cust_cnt_cd) {
		this.cust_cnt_cd = cust_cnt_cd;
		//this.b_cust_cnt_cd=true;
	}

	public void setCust_seq(String cust_seq) {
		this.cust_seq = cust_seq;
		//this.b_cust_seq=true;
	}

	public void setPol_cd(String pol_cd) {
		this.pol_cd = pol_cd;
		//this.b_pol_cd=true;
	}

	public void setPod_cd(String pod_cd) {
		this.pod_cd = pod_cd;
		//this.b_pod_cd=true;
	}

	public void setFcast_ofc_cd(String fcast_ofc_cd) {
		this.fcast_ofc_cd = fcast_ofc_cd;
		//this.b_fcast_ofc_cd=true;
	}

	public void setFcast_cust_tp_cd(String fcast_cust_tp_cd) {
		this.fcast_cust_tp_cd = fcast_cust_tp_cd;
		//this.b_fcast_cust_tp_cd=true;
	}

	public void setIoc_cd(String ioc_cd) {
		this.ioc_cd = ioc_cd;
		//this.b_ioc_cd=true;
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

	public void setSls_rhq_cd(String sls_rhq_cd) {
		this.sls_rhq_cd = sls_rhq_cd;
		//this.b_sls_rhq_cd=true;
	}

	public void setSls_aq_cd(String sls_aq_cd) {
		this.sls_aq_cd = sls_aq_cd;
		//this.b_sls_aq_cd=true;
	}

	public void setSls_rgn_ofc_cd(String sls_rgn_ofc_cd) {
		this.sls_rgn_ofc_cd = sls_rgn_ofc_cd;
		//this.b_sls_rgn_ofc_cd=true;
	}

	public void setSls_ofc_cd(String sls_ofc_cd) {
		this.sls_ofc_cd = sls_ofc_cd;
		//this.b_sls_ofc_cd=true;
	}

	public void setFcast_ttl_qty(String fcast_ttl_qty) {
		this.fcast_ttl_qty = fcast_ttl_qty;
		//this.b_fcast_ttl_qty=true;
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

	public void setCfm_ttl_qty(String cfm_ttl_qty) {
		this.cfm_ttl_qty = cfm_ttl_qty;
		//this.b_cfm_ttl_qty=true;
	}

	public void setCfm_40ft_hc_qty(String cfm_40ft_hc_qty) {
		this.cfm_40ft_hc_qty = cfm_40ft_hc_qty;
		//this.b_cfm_40ft_hc_qty=true;
	}

	public void setCfm_45ft_hc_qty(String cfm_45ft_hc_qty) {
		this.cfm_45ft_hc_qty = cfm_45ft_hc_qty;
		//this.b_cfm_45ft_hc_qty=true;
	}

	public void setCfm_rf_qty(String cfm_rf_qty) {
		this.cfm_rf_qty = cfm_rf_qty;
		//this.b_cfm_rf_qty=true;
	}

	public void setCfm_ttl_wgt(String cfm_ttl_wgt) {
		this.cfm_ttl_wgt = cfm_ttl_wgt;
		//this.b_cfm_ttl_wgt=true;
	}

	public void setCtrl_lvl_cd(String ctrl_lvl_cd) {
		this.ctrl_lvl_cd = ctrl_lvl_cd;
		//this.b_ctrl_lvl_cd=true;
	}

	public void setModi_gdt(String modi_gdt) {
		this.modi_gdt = modi_gdt;
		//this.b_modi_gdt=true;
	}

	public void setCfm_usr_id(String cfm_usr_id) {
		this.cfm_usr_id = cfm_usr_id;
		//this.b_cfm_usr_id=true;
	}

	public void setCfm_dt(String cfm_dt) {
		this.cfm_dt = cfm_dt;
		//this.b_cfm_dt=true;
	}

	public void setCre_usr_id(String cre_usr_id) {
		this.cre_usr_id = cre_usr_id;
		//this.b_cre_usr_id=true;
	}

	public void setUpd_usr_id(String upd_usr_id) {
		this.upd_usr_id = upd_usr_id;
		//this.b_upd_usr_id=true;
	}

	public void setUsd_bkg_ttl_qty(String usd_bkg_ttl_qty) {
		this.usd_bkg_ttl_qty = usd_bkg_ttl_qty;
		//this.b_usd_bkg_ttl_qty=true;
	}

	public void setUsd_bkg_20ft_qty(String usd_bkg_20ft_qty) {
		this.usd_bkg_20ft_qty = usd_bkg_20ft_qty;
		//this.b_usd_bkg_20ft_qty=true;
	}

	public void setUsd_bkg_40ft_qty(String usd_bkg_40ft_qty) {
		this.usd_bkg_40ft_qty = usd_bkg_40ft_qty;
		//this.b_usd_bkg_40ft_qty=true;
	}

	public void setUsd_bkg_40ft_hc_qty(String usd_bkg_40ft_hc_qty) {
		this.usd_bkg_40ft_hc_qty = usd_bkg_40ft_hc_qty;
		//this.b_usd_bkg_40ft_hc_qty=true;
	}

	public void setUsd_bkg_45ft_hc_qty(String usd_bkg_45ft_hc_qty) {
		this.usd_bkg_45ft_hc_qty = usd_bkg_45ft_hc_qty;
		//this.b_usd_bkg_45ft_hc_qty=true;
	}

	public void setUsd_bkg_rf_qty(String usd_bkg_rf_qty) {
		this.usd_bkg_rf_qty = usd_bkg_rf_qty;
		//this.b_usd_bkg_rf_qty=true;
	}

	public void setUsd_bkg_ttl_wgt(String usd_bkg_ttl_wgt) {
		this.usd_bkg_ttl_wgt = usd_bkg_ttl_wgt;
		//this.b_usd_bkg_ttl_wgt=true;
	}

	public static SPC_DLY_FCAST_CUST fromRequest(HttpServletRequest request) {
		String strUserId = getUserId(request);
		SPC_DLY_FCAST_CUST model = new SPC_DLY_FCAST_CUST();
		try {
			model.setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
			model.setPage_rows(JSPUtil.getParameter(request, "page_rows", ""));
			model.setRlane_cd(JSPUtil.getParameter(request, "rlane_cd", ""));
			model.setDir_cd(JSPUtil.getParameter(request, "dir_cd", ""));
			model.setVsl_cd(JSPUtil.getParameter(request, "vsl_cd", ""));
			model.setSkd_voy_no(JSPUtil.getParameter(request, "skd_voy_no", ""));
			model.setSkd_dir_cd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
			model.setIoc_ts_cd(JSPUtil.getParameter(request, "ioc_ts_cd", ""));
			model.setSrep_usr_id(JSPUtil.getParameter(request, "srep_usr_id", ""));
			model.setCust_cnt_cd(JSPUtil.getParameter(request, "cust_cnt_cd", ""));
			model.setCust_seq(JSPUtil.getParameter(request, "cust_seq", ""));
			model.setPol_cd(JSPUtil.getParameter(request, "pol_cd", ""));
			model.setPod_cd(JSPUtil.getParameter(request, "pod_cd", ""));
			model.setFcast_ofc_cd(JSPUtil.getParameter(request, "fcast_ofc_cd", ""));
			model.setFcast_cust_tp_cd(JSPUtil.getParameter(request, "fcast_cust_tp_cd", ""));
			model.setIoc_cd(JSPUtil.getParameter(request, "ioc_cd", ""));
			model.setRep_trd_cd(JSPUtil.getParameter(request, "rep_trd_cd", ""));
			model.setRep_sub_trd_cd(JSPUtil.getParameter(request, "rep_sub_trd_cd", ""));
			model.setTrd_cd(JSPUtil.getParameter(request, "trd_cd", ""));
			model.setSub_trd_cd(JSPUtil.getParameter(request, "sub_trd_cd", ""));
			model.setSls_rhq_cd(JSPUtil.getParameter(request, "sls_rhq_cd", ""));
			model.setSls_aq_cd(JSPUtil.getParameter(request, "sls_aq_cd", ""));
			model.setSls_rgn_ofc_cd(JSPUtil.getParameter(request, "sls_rgn_ofc_cd", ""));
			model.setSls_ofc_cd(JSPUtil.getParameter(request, "sls_ofc_cd", ""));
			model.setFcast_ttl_qty(JSPUtil.getParameter(request, "fcast_ttl_qty", ""));
			model.setFcast_40ft_hc_qty(JSPUtil.getParameter(request, "fcast_40ft_hc_qty", ""));
			model.setFcast_45ft_hc_qty(JSPUtil.getParameter(request, "fcast_45ft_hc_qty", ""));
			model.setFcast_rf_qty(JSPUtil.getParameter(request, "fcast_rf_qty", ""));
			model.setFcast_ttl_wgt(JSPUtil.getParameter(request, "fcast_ttl_wgt", ""));
			model.setCfm_ttl_qty(JSPUtil.getParameter(request, "cfm_ttl_qty", ""));
			model.setCfm_40ft_hc_qty(JSPUtil.getParameter(request, "cfm_40ft_hc_qty", ""));
			model.setCfm_45ft_hc_qty(JSPUtil.getParameter(request, "cfm_45ft_hc_qty", ""));
			model.setCfm_rf_qty(JSPUtil.getParameter(request, "cfm_rf_qty", ""));
			model.setCfm_ttl_wgt(JSPUtil.getParameter(request, "cfm_ttl_wgt", ""));
			model.setCtrl_lvl_cd(JSPUtil.getParameter(request, "ctrl_lvl_cd", ""));
			model.setModi_gdt(JSPUtil.getParameter(request, "modi_gdt", ""));
			model.setCfm_usr_id(JSPUtil.getParameter(request, "cfm_usr_id", ""));
			model.setCfm_dt(JSPUtil.getParameter(request, "cfm_dt", ""));
			model.setUsd_bkg_ttl_qty(JSPUtil.getParameter(request, "usd_bkg_ttl_qty", ""));
			model.setUsd_bkg_20ft_qty(JSPUtil.getParameter(request, "usd_bkg_20ft_qty", ""));
			model.setUsd_bkg_40ft_qty(JSPUtil.getParameter(request, "usd_bkg_40ft_qty", ""));
			model.setUsd_bkg_40ft_hc_qty(JSPUtil.getParameter(request, "usd_bkg_40ft_hc_qty", ""));
			model.setUsd_bkg_45ft_hc_qty(JSPUtil.getParameter(request, "usd_bkg_45ft_hc_qty", ""));
			model.setUsd_bkg_rf_qty(JSPUtil.getParameter(request, "usd_bkg_rf_qty", ""));
			model.setUsd_bkg_ttl_wgt(JSPUtil.getParameter(request, "usd_bkg_ttl_wgt", ""));
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
		SPC_DLY_FCAST_CUST model = null;
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
			String[] ioc_ts_cd = (JSPUtil.getParameter(request, prefix + "ioc_ts_cd".trim(), length));
			String[] srep_usr_id = (JSPUtil.getParameter(request, prefix + "srep_usr_id".trim(), length));
			String[] cust_cnt_cd = (JSPUtil.getParameter(request, prefix + "cust_cnt_cd".trim(), length));
			String[] cust_seq = (JSPUtil.getParameter(request, prefix + "cust_seq".trim(), length));
			String[] pol_cd = (JSPUtil.getParameter(request, prefix + "pol_cd".trim(), length));
			String[] pod_cd = (JSPUtil.getParameter(request, prefix + "pod_cd".trim(), length));
			String[] fcast_ofc_cd = (JSPUtil.getParameter(request, prefix + "fcast_ofc_cd".trim(), length));
			String[] fcast_cust_tp_cd = (JSPUtil.getParameter(request, prefix + "fcast_cust_tp_cd".trim(), length));
			String[] ioc_cd = (JSPUtil.getParameter(request, prefix + "ioc_cd".trim(), length));
			String[] rep_trd_cd = (JSPUtil.getParameter(request, prefix + "rep_trd_cd".trim(), length));
			String[] rep_sub_trd_cd = (JSPUtil.getParameter(request, prefix + "rep_sub_trd_cd".trim(), length));
			String[] trd_cd = (JSPUtil.getParameter(request, prefix + "trd_cd".trim(), length));
			String[] sub_trd_cd = (JSPUtil.getParameter(request, prefix + "sub_trd_cd".trim(), length));
			String[] sls_rhq_cd = (JSPUtil.getParameter(request, prefix + "sls_rhq_cd".trim(), length));
			String[] sls_aq_cd = (JSPUtil.getParameter(request, prefix + "sls_aq_cd".trim(), length));
			String[] sls_rgn_ofc_cd = (JSPUtil.getParameter(request, prefix + "sls_rgn_ofc_cd".trim(), length));
			String[] sls_ofc_cd = (JSPUtil.getParameter(request, prefix + "sls_ofc_cd".trim(), length));
			String[] fcast_ttl_qty = (JSPUtil.getParameter(request, prefix + "fcast_ttl_qty".trim(), length));
			String[] fcast_40ft_hc_qty = (JSPUtil.getParameter(request, prefix + "fcast_40ft_hc_qty".trim(), length));
			String[] fcast_45ft_hc_qty = (JSPUtil.getParameter(request, prefix + "fcast_45ft_hc_qty".trim(), length));
			String[] fcast_rf_qty = (JSPUtil.getParameter(request, prefix + "fcast_rf_qty".trim(), length));
			String[] fcast_ttl_wgt = (JSPUtil.getParameter(request, prefix + "fcast_ttl_wgt".trim(), length));
			String[] cfm_ttl_qty = (JSPUtil.getParameter(request, prefix + "cfm_ttl_qty".trim(), length));
			String[] cfm_40ft_hc_qty = (JSPUtil.getParameter(request, prefix + "cfm_40ft_hc_qty".trim(), length));
			String[] cfm_45ft_hc_qty = (JSPUtil.getParameter(request, prefix + "cfm_45ft_hc_qty".trim(), length));
			String[] cfm_rf_qty = (JSPUtil.getParameter(request, prefix + "cfm_rf_qty".trim(), length));
			String[] cfm_ttl_wgt = (JSPUtil.getParameter(request, prefix + "cfm_ttl_wgt".trim(), length));
			String[] ctrl_lvl_cd = (JSPUtil.getParameter(request, prefix + "ctrl_lvl_cd".trim(), length));
			String[] modi_gdt = (JSPUtil.getParameter(request, prefix + "modi_gdt".trim(), length));
			String[] cfm_usr_id = (JSPUtil.getParameter(request, prefix + "cfm_usr_id".trim(), length));
			String[] cfm_dt = (JSPUtil.getParameter(request, prefix + "cfm_dt".trim(), length));
			String[] usd_bkg_ttl_qty = (JSPUtil.getParameter(request, prefix + "usd_bkg_ttl_qty".trim(), length));
			String[] usd_bkg_20ft_qty = (JSPUtil.getParameter(request, prefix + "usd_bkg_20ft_qty".trim(), length));
			String[] usd_bkg_40ft_qty = (JSPUtil.getParameter(request, prefix + "usd_bkg_40ft_qty".trim(), length));
			String[] usd_bkg_40ft_hc_qty = (JSPUtil.getParameter(request, prefix + "usd_bkg_40ft_hc_qty".trim(), length));
			String[] usd_bkg_45ft_hc_qty = (JSPUtil.getParameter(request, prefix + "usd_bkg_45ft_hc_qty".trim(), length));
			String[] usd_bkg_rf_qty = (JSPUtil.getParameter(request, prefix + "usd_bkg_rf_qty".trim(), length));
			String[] usd_bkg_ttl_wgt = (JSPUtil.getParameter(request, prefix + "usd_bkg_ttl_wgt".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new SPC_DLY_FCAST_CUST();
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
				if (ioc_ts_cd[i] != null)
					model.setIoc_ts_cd(ioc_ts_cd[i]);
				if (srep_usr_id[i] != null)
					model.setSrep_usr_id(srep_usr_id[i]);
				if (cust_cnt_cd[i] != null)
					model.setCust_cnt_cd(cust_cnt_cd[i]);
				if (cust_seq[i] != null)
					model.setCust_seq(cust_seq[i]);
				if (pol_cd[i] != null)
					model.setPol_cd(pol_cd[i]);
				if (pod_cd[i] != null)
					model.setPod_cd(pod_cd[i]);
				if (fcast_ofc_cd[i] != null)
					model.setFcast_ofc_cd(fcast_ofc_cd[i]);
				if (fcast_cust_tp_cd[i] != null)
					model.setFcast_cust_tp_cd(fcast_cust_tp_cd[i]);
				if (ioc_cd[i] != null)
					model.setIoc_cd(ioc_cd[i]);
				if (rep_trd_cd[i] != null)
					model.setRep_trd_cd(rep_trd_cd[i]);
				if (rep_sub_trd_cd[i] != null)
					model.setRep_sub_trd_cd(rep_sub_trd_cd[i]);
				if (trd_cd[i] != null)
					model.setTrd_cd(trd_cd[i]);
				if (sub_trd_cd[i] != null)
					model.setSub_trd_cd(sub_trd_cd[i]);
				if (sls_rhq_cd[i] != null)
					model.setSls_rhq_cd(sls_rhq_cd[i]);
				if (sls_aq_cd[i] != null)
					model.setSls_aq_cd(sls_aq_cd[i]);
				if (sls_rgn_ofc_cd[i] != null)
					model.setSls_rgn_ofc_cd(sls_rgn_ofc_cd[i]);
				if (sls_ofc_cd[i] != null)
					model.setSls_ofc_cd(sls_ofc_cd[i]);
				if (fcast_ttl_qty[i] != null)
					model.setFcast_ttl_qty(fcast_ttl_qty[i]);
				if (fcast_40ft_hc_qty[i] != null)
					model.setFcast_40ft_hc_qty(fcast_40ft_hc_qty[i]);
				if (fcast_45ft_hc_qty[i] != null)
					model.setFcast_45ft_hc_qty(fcast_45ft_hc_qty[i]);
				if (fcast_rf_qty[i] != null)
					model.setFcast_rf_qty(fcast_rf_qty[i]);
				if (fcast_ttl_wgt[i] != null)
					model.setFcast_ttl_wgt(fcast_ttl_wgt[i]);
				if (cfm_ttl_qty[i] != null)
					model.setCfm_ttl_qty(cfm_ttl_qty[i]);
				if (cfm_40ft_hc_qty[i] != null)
					model.setCfm_40ft_hc_qty(cfm_40ft_hc_qty[i]);
				if (cfm_45ft_hc_qty[i] != null)
					model.setCfm_45ft_hc_qty(cfm_45ft_hc_qty[i]);
				if (cfm_rf_qty[i] != null)
					model.setCfm_rf_qty(cfm_rf_qty[i]);
				if (cfm_ttl_wgt[i] != null)
					model.setCfm_ttl_wgt(cfm_ttl_wgt[i]);
				if (ctrl_lvl_cd[i] != null)
					model.setCtrl_lvl_cd(ctrl_lvl_cd[i]);
				if (modi_gdt[i] != null)
					model.setModi_gdt(modi_gdt[i]);
				if (cfm_usr_id[i] != null)
					model.setCfm_usr_id(cfm_usr_id[i]);
				if (cfm_dt[i] != null)
					model.setCfm_dt(cfm_dt[i]);
				if (usd_bkg_ttl_qty[i] != null)
					model.setUsd_bkg_ttl_qty(usd_bkg_ttl_qty[i]);
				if (usd_bkg_20ft_qty[i] != null)
					model.setUsd_bkg_20ft_qty(usd_bkg_20ft_qty[i]);
				if (usd_bkg_40ft_qty[i] != null)
					model.setUsd_bkg_40ft_qty(usd_bkg_40ft_qty[i]);
				if (usd_bkg_40ft_hc_qty[i] != null)
					model.setUsd_bkg_40ft_hc_qty(usd_bkg_40ft_hc_qty[i]);
				if (usd_bkg_45ft_hc_qty[i] != null)
					model.setUsd_bkg_45ft_hc_qty(usd_bkg_45ft_hc_qty[i]);
				if (usd_bkg_rf_qty[i] != null)
					model.setUsd_bkg_rf_qty(usd_bkg_rf_qty[i]);
				if (usd_bkg_ttl_wgt[i] != null)
					model.setUsd_bkg_ttl_wgt(usd_bkg_ttl_wgt[i]);
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