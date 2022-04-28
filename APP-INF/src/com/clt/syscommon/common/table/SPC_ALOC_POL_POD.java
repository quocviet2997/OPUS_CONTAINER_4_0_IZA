/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : SPC_ALOC_POL_POD.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2006-12-15
*@LastModifier : 김원섭
*@LastVersion : 1.0
* 2006-12-15 김원섭
* 1.0 최초 생성
* 2008-02-18 김원섭
* CSR : N200801300018 - Alloc 입력화면에서 History data 저장 
*    - 테이블 스키마 변경
* 2008-08-01 서관영
* CSR : N200807150018,N200807168076 - Space control - Allocation 화면 추가 개발 요청
*      - Aloc1차 화면에 Remark기능 추가  
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

public class SPC_ALOC_POL_POD implements Serializable {

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
	String ts_flg = null;
	String mnl_flg = null;
	String rep_trd_cd = null;
	String rep_sub_trd_cd = null;
	String trd_cd = null;
	String sub_trd_cd = null;
	String ioc_cd = null;
	String sls_rhq_cd = null;
	String sls_rgn_ofc_cd = null;
	String asgn_ttl_qty = null;
	String asgn_20ft_qty = null;
	String asgn_40ft_qty = null;
	String asgn_40ft_hc_qty = null;
	String asgn_45ft_hc_qty = null;
	String asgn_rf_qty = null;
	String asgn_ttl_wgt = null;
	String bkg_aval_ttl_qty = null;
	String bkg_aval_20ft_qty = null;
	String bkg_aval_40ft_qty = null;
	String bkg_aval_40ft_hc_qty = null;
	String bkg_aval_45ft_hc_qty = null;
	String bkg_aval_rf_qty = null;
	String bkg_aval_ttl_wgt = null;
	String mnl_aloc_rmk = null;
	String aloc_usr_id = null;
	String aloc_gdt = null;
	String cre_usr_id = null;
	String upd_usr_id = null;
	String sls_aq_cd = null;
	String fcast_ttl_qty = null;
	String fcast_40ft_hc_qty = null;
	String fcast_45ft_hc_qty = null;
	String fcast_rf_qty = null;
	String fcast_ttl_wgt = null;
	String usd_bkg_ttl_qty = null;
	String usd_bkg_20ft_qty = null;
	String usd_bkg_40ft_qty = null;
	String usd_bkg_40ft_hc_qty = null;
	String usd_bkg_45ft_hc_qty = null;
	String usd_bkg_rf_qty = null;
	String usd_bkg_ttl_wgt = null;
	String spc_ctrl_aloc_rmk = null;
	String spc_ctrl_aloc_pol_rmk = null;
	String spc_ctrl_aloc_pod_rmk = null;
	String mode_rmk = null;

	public SPC_ALOC_POL_POD() {
	}

	public SPC_ALOC_POL_POD(String ibflag, String page_rows, String rlane_cd, String dir_cd, String vsl_cd, String skd_voy_no, String skd_dir_cd, String sls_ofc_cd, String pol_cd, String pod_cd, String ts_flg, String mnl_flg, String rep_trd_cd, String rep_sub_trd_cd, String trd_cd,
			String sub_trd_cd, String ioc_cd, String sls_rhq_cd, String sls_rgn_ofc_cd, String asgn_ttl_qty, String asgn_20ft_qty, String asgn_40ft_qty, String asgn_40ft_hc_qty, String asgn_45ft_hc_qty, String asgn_rf_qty, String asgn_ttl_wgt, String bkg_aval_ttl_qty, String bkg_aval_20ft_qty,
			String bkg_aval_40ft_qty, String bkg_aval_40ft_hc_qty, String bkg_aval_45ft_hc_qty, String bkg_aval_rf_qty, String bkg_aval_ttl_wgt, String mnl_aloc_rmk, String aloc_usr_id, String aloc_gdt, String cre_usr_id, String upd_usr_id, String sls_aq_cd, String fcast_ttl_qty,
			String fcast_40ft_hc_qty, String fcast_45ft_hc_qty, String fcast_rf_qty, String fcast_ttl_wgt, String usd_bkg_ttl_qty, String usd_bkg_20ft_qty, String usd_bkg_40ft_qty, String usd_bkg_40ft_hc_qty, String usd_bkg_45ft_hc_qty, String usd_bkg_rf_qty, String usd_bkg_ttl_wgt,
			String spc_ctrl_aloc_rmk, String spc_ctrl_aloc_pol_rmk,String spc_ctrl_aloc_pod_rmk,String mode_rmk ) {
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
		this.ts_flg = ts_flg.replace('1', 'Y').replace('0', 'N');
		this.mnl_flg = mnl_flg.replace('1', 'Y').replace('0', 'N');
		this.rep_trd_cd = rep_trd_cd;
		this.rep_sub_trd_cd = rep_sub_trd_cd;
		this.trd_cd = trd_cd;
		this.sub_trd_cd = sub_trd_cd;
		this.ioc_cd = ioc_cd;
		this.sls_rhq_cd = sls_rhq_cd;
		this.sls_rgn_ofc_cd = sls_rgn_ofc_cd;
		this.asgn_ttl_qty = asgn_ttl_qty;
		this.asgn_20ft_qty = asgn_20ft_qty;
		this.asgn_40ft_qty = asgn_40ft_qty;
		this.asgn_40ft_hc_qty = asgn_40ft_hc_qty;
		this.asgn_45ft_hc_qty = asgn_45ft_hc_qty;
		this.asgn_rf_qty = asgn_rf_qty;
		this.asgn_ttl_wgt = asgn_ttl_wgt;
		this.bkg_aval_ttl_qty = bkg_aval_ttl_qty;
		this.bkg_aval_20ft_qty = bkg_aval_20ft_qty;
		this.bkg_aval_40ft_qty = bkg_aval_40ft_qty;
		this.bkg_aval_40ft_hc_qty = bkg_aval_40ft_hc_qty;
		this.bkg_aval_45ft_hc_qty = bkg_aval_45ft_hc_qty;
		this.bkg_aval_rf_qty = bkg_aval_rf_qty;
		this.bkg_aval_ttl_wgt = bkg_aval_ttl_wgt;
		this.mnl_aloc_rmk = mnl_aloc_rmk;
		this.aloc_usr_id = aloc_usr_id;
		this.aloc_gdt = aloc_gdt;
		this.cre_usr_id = cre_usr_id;
		this.upd_usr_id = upd_usr_id;
		this.sls_aq_cd = sls_aq_cd;
		this.fcast_ttl_qty = fcast_ttl_qty;
		this.fcast_40ft_hc_qty = fcast_40ft_hc_qty;
		this.fcast_45ft_hc_qty = fcast_45ft_hc_qty;
		this.fcast_rf_qty = fcast_rf_qty;
		this.fcast_ttl_wgt = fcast_ttl_wgt;
		this.usd_bkg_ttl_qty = usd_bkg_ttl_qty;
		this.usd_bkg_20ft_qty = usd_bkg_20ft_qty;
		this.usd_bkg_40ft_qty = usd_bkg_40ft_qty;
		this.usd_bkg_40ft_hc_qty = usd_bkg_40ft_hc_qty;
		this.usd_bkg_45ft_hc_qty = usd_bkg_45ft_hc_qty;
		this.usd_bkg_rf_qty = usd_bkg_rf_qty;
		this.usd_bkg_ttl_wgt = usd_bkg_ttl_wgt;
		this.spc_ctrl_aloc_rmk  = spc_ctrl_aloc_rmk;
		this.spc_ctrl_aloc_pol_rmk  = spc_ctrl_aloc_pol_rmk;
		this.spc_ctrl_aloc_pod_rmk  = spc_ctrl_aloc_pod_rmk;
		this.mode_rmk  = mode_rmk;
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

	public String getTs_flg() {
		return this.ts_flg;
	}

	public String getMnl_flg() {
		return this.mnl_flg;
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

	public String getAsgn_ttl_qty() {
		return this.asgn_ttl_qty;
	}

	public String getAsgn_20ft_qty() {
		return this.asgn_20ft_qty;
	}

	public String getAsgn_40ft_qty() {
		return this.asgn_40ft_qty;
	}

	public String getAsgn_40ft_hc_qty() {
		return this.asgn_40ft_hc_qty;
	}

	public String getAsgn_45ft_hc_qty() {
		return this.asgn_45ft_hc_qty;
	}

	public String getAsgn_rf_qty() {
		return this.asgn_rf_qty;
	}

	public String getAsgn_ttl_wgt() {
		return this.asgn_ttl_wgt;
	}

	public String getBkg_aval_ttl_qty() {
		return this.bkg_aval_ttl_qty;
	}

	public String getBkg_aval_20ft_qty() {
		return this.bkg_aval_20ft_qty;
	}

	public String getBkg_aval_40ft_qty() {
		return this.bkg_aval_40ft_qty;
	}

	public String getBkg_aval_40ft_hc_qty() {
		return this.bkg_aval_40ft_hc_qty;
	}

	public String getBkg_aval_45ft_hc_qty() {
		return this.bkg_aval_45ft_hc_qty;
	}

	public String getBkg_aval_rf_qty() {
		return this.bkg_aval_rf_qty;
	}

	public String getBkg_aval_ttl_wgt() {
		return this.bkg_aval_ttl_wgt;
	}

	public String getMnl_aloc_rmk() {
		return this.mnl_aloc_rmk;
	}

	public String getAloc_usr_id() {
		return this.aloc_usr_id;
	}

	public String getAloc_gdt() {
		return this.aloc_gdt;
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
	
	public String getSpc_ctrl_aloc_rmk() {
		return this.spc_ctrl_aloc_rmk;
	}
	public String getSpc_ctrl_aloc_pol_rmk() {
		return this.spc_ctrl_aloc_pol_rmk;
	}
	public String getSpc_ctrl_aloc_pod_rmk() {
		return this.spc_ctrl_aloc_pod_rmk;
	}
	public String getMode_rmk() {
		return this.mode_rmk;
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

	public void setTs_flg(String ts_flg) {
		this.ts_flg = ts_flg.replace('1', 'Y').replace('0', 'N');
		//this.b_ts_flg=true;
	}

	public void setMnl_flg(String mnl_flg) {
		this.mnl_flg = mnl_flg.replace('1', 'Y').replace('0', 'N');
		//this.b_mnl_flg=true;
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

	public void setAsgn_ttl_qty(String asgn_ttl_qty) {
		this.asgn_ttl_qty = asgn_ttl_qty;
		//this.b_asgn_ttl_qty=true;
	}

	public void setAsgn_20ft_qty(String asgn_20ft_qty) {
		this.asgn_20ft_qty = asgn_20ft_qty;
		//this.b_asgn_20ft_qty=true;
	}

	public void setAsgn_40ft_qty(String asgn_40ft_qty) {
		this.asgn_40ft_qty = asgn_40ft_qty;
		//this.b_asgn_40ft_qty=true;
	}

	public void setAsgn_40ft_hc_qty(String asgn_40ft_hc_qty) {
		this.asgn_40ft_hc_qty = asgn_40ft_hc_qty;
		//this.b_asgn_40ft_hc_qty=true;
	}

	public void setAsgn_45ft_hc_qty(String asgn_45ft_hc_qty) {
		this.asgn_45ft_hc_qty = asgn_45ft_hc_qty;
		//this.b_asgn_45ft_hc_qty=true;
	}

	public void setAsgn_rf_qty(String asgn_rf_qty) {
		this.asgn_rf_qty = asgn_rf_qty;
		//this.b_asgn_rf_qty=true;
	}

	public void setAsgn_ttl_wgt(String asgn_ttl_wgt) {
		this.asgn_ttl_wgt = asgn_ttl_wgt;
		//this.b_asgn_ttl_wgt=true;
	}

	public void setBkg_aval_ttl_qty(String bkg_aval_ttl_qty) {
		this.bkg_aval_ttl_qty = bkg_aval_ttl_qty;
		//this.b_bkg_aval_ttl_qty=true;
	}

	public void setBkg_aval_20ft_qty(String bkg_aval_20ft_qty) {
		this.bkg_aval_20ft_qty = bkg_aval_20ft_qty;
		//this.b_bkg_aval_20ft_qty=true;
	}

	public void setBkg_aval_40ft_qty(String bkg_aval_40ft_qty) {
		this.bkg_aval_40ft_qty = bkg_aval_40ft_qty;
		//this.b_bkg_aval_40ft_qty=true;
	}

	public void setBkg_aval_40ft_hc_qty(String bkg_aval_40ft_hc_qty) {
		this.bkg_aval_40ft_hc_qty = bkg_aval_40ft_hc_qty;
		//this.b_bkg_aval_40ft_hc_qty=true;
	}

	public void setBkg_aval_45ft_hc_qty(String bkg_aval_45ft_hc_qty) {
		this.bkg_aval_45ft_hc_qty = bkg_aval_45ft_hc_qty;
		//this.b_bkg_aval_45ft_hc_qty=true;
	}

	public void setBkg_aval_rf_qty(String bkg_aval_rf_qty) {
		this.bkg_aval_rf_qty = bkg_aval_rf_qty;
		//this.b_bkg_aval_rf_qty=true;
	}

	public void setBkg_aval_ttl_wgt(String bkg_aval_ttl_wgt) {
		this.bkg_aval_ttl_wgt = bkg_aval_ttl_wgt;
		//this.b_bkg_aval_ttl_wgt=true;
	}

	public void setMnl_aloc_rmk(String mnl_aloc_rmk) {
		this.mnl_aloc_rmk = mnl_aloc_rmk;
		//this.b_mnl_aloc_rmk=true;
	}

	public void setAloc_usr_id(String aloc_usr_id) {
		this.aloc_usr_id = aloc_usr_id;
		//this.b_aloc_usr_id=true;
	}

	public void setAloc_gdt(String aloc_gdt) {
		this.aloc_gdt = aloc_gdt;
		//this.b_aloc_gdt=true;
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
	
	
	public void  setSpc_ctrl_aloc_rmk(String spc_ctrl_aloc_rmk ) {
	    this.spc_ctrl_aloc_rmk = spc_ctrl_aloc_rmk;
	}
   
	public void  setSpc_ctrl_aloc_pol_rmk(String spc_ctrl_aloc_pol_rmk ) {
	    this.spc_ctrl_aloc_pol_rmk = spc_ctrl_aloc_pol_rmk;
	}

	public void  setSpc_ctrl_aloc_pod_rmk(String spc_ctrl_aloc_pod_rmk ) {
	    this.spc_ctrl_aloc_pod_rmk = spc_ctrl_aloc_pod_rmk;
	}
	
	public void  setMode_rmk(String mode_rmk ) {
	    this.mode_rmk = mode_rmk;
	}

	public static SPC_ALOC_POL_POD fromRequest(HttpServletRequest request) {
		String strUserId = getUserId(request);
		SPC_ALOC_POL_POD model = new SPC_ALOC_POL_POD();
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
			model.setPod_cd(JSPUtil.getParameter(request, "pod_cd", ""));
			model.setTs_flg(JSPUtil.getParameter(request, "ts_flg", ""));
			model.setMnl_flg(JSPUtil.getParameter(request, "mnl_flg", ""));
			model.setRep_trd_cd(JSPUtil.getParameter(request, "rep_trd_cd", ""));
			model.setRep_sub_trd_cd(JSPUtil.getParameter(request, "rep_sub_trd_cd", ""));
			model.setTrd_cd(JSPUtil.getParameter(request, "trd_cd", ""));
			model.setSub_trd_cd(JSPUtil.getParameter(request, "sub_trd_cd", ""));
			model.setIoc_cd(JSPUtil.getParameter(request, "ioc_cd", ""));
			model.setSls_rhq_cd(JSPUtil.getParameter(request, "sls_rhq_cd", ""));
			model.setSls_rgn_ofc_cd(JSPUtil.getParameter(request, "sls_rgn_ofc_cd", ""));
			model.setAsgn_ttl_qty(JSPUtil.getParameter(request, "asgn_ttl_qty", ""));
			model.setAsgn_20ft_qty(JSPUtil.getParameter(request, "asgn_20ft_qty", ""));
			model.setAsgn_40ft_qty(JSPUtil.getParameter(request, "asgn_40ft_qty", ""));
			model.setAsgn_40ft_hc_qty(JSPUtil.getParameter(request, "asgn_40ft_hc_qty", ""));
			model.setAsgn_45ft_hc_qty(JSPUtil.getParameter(request, "asgn_45ft_hc_qty", ""));
			model.setAsgn_rf_qty(JSPUtil.getParameter(request, "asgn_rf_qty", ""));
			model.setAsgn_ttl_wgt(JSPUtil.getParameter(request, "asgn_ttl_wgt", ""));
			model.setBkg_aval_ttl_qty(JSPUtil.getParameter(request, "bkg_aval_ttl_qty", ""));
			model.setBkg_aval_20ft_qty(JSPUtil.getParameter(request, "bkg_aval_20ft_qty", ""));
			model.setBkg_aval_40ft_qty(JSPUtil.getParameter(request, "bkg_aval_40ft_qty", ""));
			model.setBkg_aval_40ft_hc_qty(JSPUtil.getParameter(request, "bkg_aval_40ft_hc_qty", ""));
			model.setBkg_aval_45ft_hc_qty(JSPUtil.getParameter(request, "bkg_aval_45ft_hc_qty", ""));
			model.setBkg_aval_rf_qty(JSPUtil.getParameter(request, "bkg_aval_rf_qty", ""));
			model.setBkg_aval_ttl_wgt(JSPUtil.getParameter(request, "bkg_aval_ttl_wgt", ""));
			model.setMnl_aloc_rmk(JSPUtil.getParameter(request, "mnl_aloc_rmk", ""));
			model.setAloc_usr_id(JSPUtil.getParameter(request, "aloc_usr_id", ""));
			model.setAloc_gdt(JSPUtil.getParameter(request, "aloc_gdt", ""));
			model.setSls_aq_cd(JSPUtil.getParameter(request, "sls_aq_cd", ""));
			model.setFcast_ttl_qty(JSPUtil.getParameter(request, "fcast_ttl_qty", ""));
			model.setFcast_40ft_hc_qty(JSPUtil.getParameter(request, "fcast_40ft_hc_qty", ""));
			model.setFcast_45ft_hc_qty(JSPUtil.getParameter(request, "fcast_45ft_hc_qty", ""));
			model.setFcast_rf_qty(JSPUtil.getParameter(request, "fcast_rf_qty", ""));
			model.setFcast_ttl_wgt(JSPUtil.getParameter(request, "fcast_ttl_wgt", ""));
			model.setUsd_bkg_ttl_qty(JSPUtil.getParameter(request, "usd_bkg_ttl_qty", ""));
			model.setUsd_bkg_20ft_qty(JSPUtil.getParameter(request, "usd_bkg_20ft_qty", ""));
			model.setUsd_bkg_40ft_qty(JSPUtil.getParameter(request, "usd_bkg_40ft_qty", ""));
			model.setUsd_bkg_40ft_hc_qty(JSPUtil.getParameter(request, "usd_bkg_40ft_hc_qty", ""));
			model.setUsd_bkg_45ft_hc_qty(JSPUtil.getParameter(request, "usd_bkg_45ft_hc_qty", ""));
			model.setUsd_bkg_rf_qty(JSPUtil.getParameter(request, "usd_bkg_rf_qty", ""));
			model.setUsd_bkg_ttl_wgt(JSPUtil.getParameter(request, "usd_bkg_ttl_wgt", ""));
			model.setCre_usr_id(strUserId);
			model.setUpd_usr_id(strUserId);
			model.setSpc_ctrl_aloc_rmk(JSPUtil.getParameter(request, "spc_ctrl_aloc_rmk", ""));
			model.setSpc_ctrl_aloc_pol_rmk(JSPUtil.getParameter(request, "spc_ctrl_aloc_pol_rmk", ""));
			model.setSpc_ctrl_aloc_pod_rmk(JSPUtil.getParameter(request, "spc_ctrl_aloc_pod_rmk", ""));
			model.setMode_rmk(JSPUtil.getParameter(request, "mode_rmk", ""));
		} catch (Exception e) {
		}
		return model;
	}

	public static Collection fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		String strUserId = getUserId(request);
		SPC_ALOC_POL_POD model = null;
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
			String[] pod_cd = (JSPUtil.getParameter(request, prefix + "pod_cd".trim(), length));
			String[] ts_flg = (JSPUtil.getParameter(request, prefix + "ts_flg".trim(), length));
			String[] mnl_flg = (JSPUtil.getParameter(request, prefix + "mnl_flg".trim(), length));
			String[] rep_trd_cd = (JSPUtil.getParameter(request, prefix + "rep_trd_cd".trim(), length));
			String[] rep_sub_trd_cd = (JSPUtil.getParameter(request, prefix + "rep_sub_trd_cd".trim(), length));
			String[] trd_cd = (JSPUtil.getParameter(request, prefix + "trd_cd".trim(), length));
			String[] sub_trd_cd = (JSPUtil.getParameter(request, prefix + "sub_trd_cd".trim(), length));
			String[] ioc_cd = (JSPUtil.getParameter(request, prefix + "ioc_cd".trim(), length));
			String[] sls_rhq_cd = (JSPUtil.getParameter(request, prefix + "sls_rhq_cd".trim(), length));
			String[] sls_rgn_ofc_cd = (JSPUtil.getParameter(request, prefix + "sls_rgn_ofc_cd".trim(), length));
			String[] asgn_ttl_qty = (JSPUtil.getParameter(request, prefix + "asgn_ttl_qty".trim(), length));
			String[] asgn_20ft_qty = (JSPUtil.getParameter(request, prefix + "asgn_20ft_qty".trim(), length));
			String[] asgn_40ft_qty = (JSPUtil.getParameter(request, prefix + "asgn_40ft_qty".trim(), length));
			String[] asgn_40ft_hc_qty = (JSPUtil.getParameter(request, prefix + "asgn_40ft_hc_qty".trim(), length));
			String[] asgn_45ft_hc_qty = (JSPUtil.getParameter(request, prefix + "asgn_45ft_hc_qty".trim(), length));
			String[] asgn_rf_qty = (JSPUtil.getParameter(request, prefix + "asgn_rf_qty".trim(), length));
			String[] asgn_ttl_wgt = (JSPUtil.getParameter(request, prefix + "asgn_ttl_wgt".trim(), length));
			String[] bkg_aval_ttl_qty = (JSPUtil.getParameter(request, prefix + "bkg_aval_ttl_qty".trim(), length));
			String[] bkg_aval_20ft_qty = (JSPUtil.getParameter(request, prefix + "bkg_aval_20ft_qty".trim(), length));
			String[] bkg_aval_40ft_qty = (JSPUtil.getParameter(request, prefix + "bkg_aval_40ft_qty".trim(), length));
			String[] bkg_aval_40ft_hc_qty = (JSPUtil.getParameter(request, prefix + "bkg_aval_40ft_hc_qty".trim(), length));
			String[] bkg_aval_45ft_hc_qty = (JSPUtil.getParameter(request, prefix + "bkg_aval_45ft_hc_qty".trim(), length));
			String[] bkg_aval_rf_qty = (JSPUtil.getParameter(request, prefix + "bkg_aval_rf_qty".trim(), length));
			String[] bkg_aval_ttl_wgt = (JSPUtil.getParameter(request, prefix + "bkg_aval_ttl_wgt".trim(), length));
			String[] mnl_aloc_rmk = (JSPUtil.getParameter(request, prefix + "mnl_aloc_rmk".trim(), length));
			String[] aloc_usr_id = (JSPUtil.getParameter(request, prefix + "aloc_usr_id".trim(), length));
			String[] aloc_gdt = (JSPUtil.getParameter(request, prefix + "aloc_gdt".trim(), length));
			String[] sls_aq_cd = (JSPUtil.getParameter(request, prefix + "sls_aq_cd".trim(), length));
			String[] fcast_ttl_qty = (JSPUtil.getParameter(request, prefix + "fcast_ttl_qty".trim(), length));
			String[] fcast_40ft_hc_qty = (JSPUtil.getParameter(request, prefix + "fcast_40ft_hc_qty".trim(), length));
			String[] fcast_45ft_hc_qty = (JSPUtil.getParameter(request, prefix + "fcast_45ft_hc_qty".trim(), length));
			String[] fcast_rf_qty = (JSPUtil.getParameter(request, prefix + "fcast_rf_qty".trim(), length));
			String[] fcast_ttl_wgt = (JSPUtil.getParameter(request, prefix + "fcast_ttl_wgt".trim(), length));
			String[] usd_bkg_ttl_qty = (JSPUtil.getParameter(request, prefix + "usd_bkg_ttl_qty".trim(), length));
			String[] usd_bkg_20ft_qty = (JSPUtil.getParameter(request, prefix + "usd_bkg_20ft_qty".trim(), length));
			String[] usd_bkg_40ft_qty = (JSPUtil.getParameter(request, prefix + "usd_bkg_40ft_qty".trim(), length));
			String[] usd_bkg_40ft_hc_qty = (JSPUtil.getParameter(request, prefix + "usd_bkg_40ft_hc_qty".trim(), length));
			String[] usd_bkg_45ft_hc_qty = (JSPUtil.getParameter(request, prefix + "usd_bkg_45ft_hc_qty".trim(), length));
			String[] usd_bkg_rf_qty = (JSPUtil.getParameter(request, prefix + "usd_bkg_rf_qty".trim(), length));
			String[] usd_bkg_ttl_wgt = (JSPUtil.getParameter(request, prefix + "usd_bkg_ttl_wgt".trim(), length));
			String[] spc_ctrl_aloc_rmk = (JSPUtil.getParameter(request, prefix + "spc_ctrl_aloc_rmk".trim(), length));
			String[] spc_ctrl_aloc_pol_rmk = (JSPUtil.getParameter(request, prefix + "spc_ctrl_aloc_pol_rmk".trim(), length));
			String[] spc_ctrl_aloc_pod_rmk = (JSPUtil.getParameter(request, prefix + "spc_ctrl_aloc_pod_rmk".trim(), length));
			String[] mode_rmk = (JSPUtil.getParameter(request, prefix + "mode_rmk".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new SPC_ALOC_POL_POD();
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
				if (ts_flg[i] != null)
					model.setTs_flg(ts_flg[i]);
				if (mnl_flg[i] != null)
					model.setMnl_flg(mnl_flg[i]);
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
				if (asgn_ttl_qty[i] != null)
					model.setAsgn_ttl_qty(asgn_ttl_qty[i]);
				if (asgn_20ft_qty[i] != null)
					model.setAsgn_20ft_qty(asgn_20ft_qty[i]);
				if (asgn_40ft_qty[i] != null)
					model.setAsgn_40ft_qty(asgn_40ft_qty[i]);
				if (asgn_40ft_hc_qty[i] != null)
					model.setAsgn_40ft_hc_qty(asgn_40ft_hc_qty[i]);
				if (asgn_45ft_hc_qty[i] != null)
					model.setAsgn_45ft_hc_qty(asgn_45ft_hc_qty[i]);
				if (asgn_rf_qty[i] != null)
					model.setAsgn_rf_qty(asgn_rf_qty[i]);
				if (asgn_ttl_wgt[i] != null)
					model.setAsgn_ttl_wgt(asgn_ttl_wgt[i]);
				if (bkg_aval_ttl_qty[i] != null)
					model.setBkg_aval_ttl_qty(bkg_aval_ttl_qty[i]);
				if (bkg_aval_20ft_qty[i] != null)
					model.setBkg_aval_20ft_qty(bkg_aval_20ft_qty[i]);
				if (bkg_aval_40ft_qty[i] != null)
					model.setBkg_aval_40ft_qty(bkg_aval_40ft_qty[i]);
				if (bkg_aval_40ft_hc_qty[i] != null)
					model.setBkg_aval_40ft_hc_qty(bkg_aval_40ft_hc_qty[i]);
				if (bkg_aval_45ft_hc_qty[i] != null)
					model.setBkg_aval_45ft_hc_qty(bkg_aval_45ft_hc_qty[i]);
				if (bkg_aval_rf_qty[i] != null)
					model.setBkg_aval_rf_qty(bkg_aval_rf_qty[i]);
				if (bkg_aval_ttl_wgt[i] != null)
					model.setBkg_aval_ttl_wgt(bkg_aval_ttl_wgt[i]);
				if (mnl_aloc_rmk[i] != null)
					model.setMnl_aloc_rmk(mnl_aloc_rmk[i]);
				if (aloc_usr_id[i] != null)
					model.setAloc_usr_id(aloc_usr_id[i]);
				if (aloc_gdt[i] != null)
					model.setAloc_gdt(aloc_gdt[i]);
				if (sls_aq_cd[i] != null)
					model.setSls_aq_cd(sls_aq_cd[i]);
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
				if (spc_ctrl_aloc_rmk[i] != null)
					model.setSpc_ctrl_aloc_rmk(spc_ctrl_aloc_rmk[i]);
				if (spc_ctrl_aloc_pol_rmk[i] != null)
					model.setSpc_ctrl_aloc_pol_rmk(spc_ctrl_aloc_pol_rmk[i]);
				if (spc_ctrl_aloc_pod_rmk[i] != null)
					model.setSpc_ctrl_aloc_pod_rmk(spc_ctrl_aloc_pod_rmk[i]);
				if (mode_rmk[i] != null)
					model.setMode_rmk(mode_rmk[i]);
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