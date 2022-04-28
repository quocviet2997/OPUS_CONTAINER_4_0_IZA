/*=========================================================
*Copyright(c) 2008 CyberLogitec
*@FileName : CNTR_MVMT_EDI_MSG.java
*@FileTitle : ${FILE_TITLE}
*Open Issues :
*Change history :
*@LastModifyDate : 2008.12.12
*@LastModifier : 정인선
*@LastVersion : 1.0
* 2008.12.12 정인선
* 1.0 최초 생성
=========================================================*/

package com.clt.syscommon.common.table;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;

import com.clt.framework.component.util.JSPUtil;

/**
 * Table Value Ojbect<br>
 * - PDTO(Data Transfer Object including Parameters)<br>
 * - 관련 Event에서 작성, 서버실행요청시 PDTO의 역할을 수행하는 Value Object<br>
 *
 * @author 정인선
 * @since J2EE 1.5
 */

public class CntrMvmtEdi implements Serializable {

	String page_rows = null;
	String cmem_por = null;
	String clm_arv_dt = null;
	String cmem_pol = null;
	String cmem_msg_id = null;
	String cmem_vsl_cd = null;
	String cmem_svc_ord_no = null;
	String cmem_rty_cnt = null;
	String cmem_pickup_rqdt = null;
	String cmem_bkg_no_split = null;
	String cmem_cnms_cd = null;
	String cmem_mode_cd = null;
	String cmem_rst_flg = null;
	String mem_sys_dt = null;
	String cmem_cntr_no = null;
	String cmem_bl_no = null;
	String clm_dpt_splc = null;
	String cmem_yd = null;
	String cmem_seal_no = null;
	String cmem_tol = null;
	String clm_sight_cd = null;
	String cmem_hngr_flg = null;
	String clm_arv_splc = null;
	String cmem_bkg_cnt = null;
	String cmem_cst_cd = null;
	String cmem_pod = null;
	String cmem_muid_area = null;
	String cmem_act_dt = null;
	String cnmv_pickup_no = null;
	String cmem_cntr_stat = null;
	String cmem_gate_stat = null;
	String cmem_flag = null;
	String cmem_arv_yd = null;
	String cnmv_waybill_no = null;
	String cmem_dst_loc = null;
	String cmem_muid_dt = null;
	String cmem_dir_cd = null;
	String cmem_del = null;
	String cmem_flatcar_no = null;
	String clm_arv_loc = null;
	String cmem_bkg_no = null;
	String train_no = null;
	String cmem_sb = null;
	String cmem_rmk = null;
	String cmem_vndr_seq = null;
	String cmem_muid_seq = null;
	String cmem_chss_no = null;
	String cmem_cnt_cd = null;
	String cmem_edi_id = null;
	String cmem_tml_nm = null;
	String cmem_sight_cd = null;
	String cmem_315_flg = null;
	String cmem_dmg_flag = null;
	String cmem_mgset = null;
	String cmem_voyage_no = null;
	String cmem_dt_tm = null;
	String cmem_dpt_yd = null;
	
	public CntrMvmtEdi() {}

	public CntrMvmtEdi(String ibflag, String page_rows, String cmem_edi_id, String cmem_msg_id, String cmem_muid_area, String cmem_muid_dt, String cmem_muid_seq, String cmem_tml_nm, String cmem_cntr_no, String cmem_yd, String cmem_dt_tm, String cmem_gate_stat, String cmem_cntr_stat, String cmem_chss_no, String cmem_vsl_cd, String cmem_voyage_no, String cmem_dir_cd, String cmem_bl_no, String cmem_bkg_cnt, String cmem_bkg_no, String cmem_bkg_no_split, String cmem_pol, String cmem_pod, String cmem_tol, String cmem_seal_no, String cmem_mgset, String cmem_sb, String cmem_cnt_cd, String cmem_vndr_seq, String cmem_mode_cd, String cmem_flatcar_no, String cmem_cnms_cd, String cmem_hngr_flg, String cnmv_waybill_no, String cnmv_pickup_no, String clm_arv_dt, String clm_arv_loc, String clm_sight_cd, String cmem_act_dt, String cmem_por, String cmem_del, String cmem_dpt_yd, String cmem_dst_loc, String cmem_arv_yd, String cmem_svc_ord_no, String cmem_cst_cd, String cmem_pickup_rqdt, String cmem_rst_flg, String cmem_rmk, String cmem_rty_cnt, String train_no, String clm_arv_splc, String clm_dpt_splc, String mem_sys_dt, String cmem_flag, String cmem_sight_cd, String cmem_315_flg, String cmem_dmg_flag, String from_dt, String from_to) {

			this.page_rows = page_rows;
			this.cmem_por = cmem_por;
			this.clm_arv_dt = clm_arv_dt;
			this.cmem_pol = cmem_pol;
			this.cmem_msg_id = cmem_msg_id;
			this.cmem_vsl_cd = cmem_vsl_cd;
			this.cmem_svc_ord_no = cmem_svc_ord_no;
			this.cmem_rty_cnt = cmem_rty_cnt;
			this.cmem_pickup_rqdt = cmem_pickup_rqdt;
			this.cmem_bkg_no_split = cmem_bkg_no_split;
			this.cmem_cnms_cd = cmem_cnms_cd;
			this.cmem_mode_cd = cmem_mode_cd;
			this.cmem_rst_flg = cmem_rst_flg;
			this.mem_sys_dt = mem_sys_dt;
			this.cmem_cntr_no = cmem_cntr_no;
			this.cmem_bl_no = cmem_bl_no;
			this.clm_dpt_splc = clm_dpt_splc;
			this.cmem_yd = cmem_yd;
			this.cmem_seal_no = cmem_seal_no;
			this.cmem_tol = cmem_tol;
			this.clm_sight_cd = clm_sight_cd;
			this.cmem_hngr_flg = cmem_hngr_flg;
			this.clm_arv_splc = clm_arv_splc;
			this.cmem_bkg_cnt = cmem_bkg_cnt;
			this.cmem_cst_cd = cmem_cst_cd;
			this.cmem_pod = cmem_pod;
			this.cmem_muid_area = cmem_muid_area;
			this.cmem_act_dt = cmem_act_dt;
			this.cnmv_pickup_no = cnmv_pickup_no;
			this.cmem_cntr_stat = cmem_cntr_stat;
			this.cmem_gate_stat = cmem_gate_stat;
			this.cmem_flag = cmem_flag;
			this.cmem_arv_yd = cmem_arv_yd;
			this.cnmv_waybill_no = cnmv_waybill_no;
			this.cmem_dst_loc = cmem_dst_loc;
			this.cmem_muid_dt = cmem_muid_dt;
			this.cmem_dir_cd = cmem_dir_cd;
			this.cmem_del = cmem_del;
			this.cmem_flatcar_no = cmem_flatcar_no;
			this.clm_arv_loc = clm_arv_loc;
			this.cmem_bkg_no = cmem_bkg_no;
			this.train_no = train_no;
			this.cmem_sb = cmem_sb;
			this.cmem_rmk = cmem_rmk;
			this.cmem_vndr_seq = cmem_vndr_seq;
			this.cmem_muid_seq = cmem_muid_seq;
			this.cmem_chss_no = cmem_chss_no;
			this.cmem_cnt_cd = cmem_cnt_cd;
			this.cmem_edi_id = cmem_edi_id;
			this.cmem_tml_nm = cmem_tml_nm;
			this.cmem_sight_cd = cmem_sight_cd;
			this.cmem_315_flg = cmem_315_flg;
			this.cmem_dmg_flag = cmem_dmg_flag;
			this.cmem_mgset = cmem_mgset;
			this.cmem_voyage_no = cmem_voyage_no;
			this.cmem_dt_tm = cmem_dt_tm;
			this.cmem_dpt_yd = cmem_dpt_yd;

		}

	public String getPage_rows() {
		return this.page_rows;
	}
	public String getCmem_por() {
		return this.cmem_por;
	}
	public String getClm_arv_dt() {
		return this.clm_arv_dt;
	}
	public String getCmem_pol() {
		return this.cmem_pol;
	}
	public String getCmem_msg_id() {
		return this.cmem_msg_id;
	}
	public String getCmem_vsl_cd() {
		return this.cmem_vsl_cd;
	}
	public String getCmem_svc_ord_no() {
		return this.cmem_svc_ord_no;
	}
	public String getCmem_rty_cnt() {
		return this.cmem_rty_cnt;
	}
	public String getCmem_pickup_rqdt() {
		return this.cmem_pickup_rqdt;
	}
	public String getCmem_bkg_no_split() {
		return this.cmem_bkg_no_split;
	}
	public String getCmem_cnms_cd() {
		return this.cmem_cnms_cd;
	}
	public String getCmem_mode_cd() {
		return this.cmem_mode_cd;
	}
	public String getCmem_rst_flg() {
		return this.cmem_rst_flg;
	}
	public String getMem_sys_dt() {
		return this.mem_sys_dt;
	}
	public String getCmem_cntr_no() {
		return this.cmem_cntr_no;
	}
	public String getCmem_bl_no() {
		return this.cmem_bl_no;
	}
	public String getClm_dpt_splc() {
		return this.clm_dpt_splc;
	}
	public String getCmem_yd() {
		return this.cmem_yd;
	}
	public String getCmem_seal_no() {
		return this.cmem_seal_no;
	}
	public String getCmem_tol() {
		return this.cmem_tol;
	}
	public String getClm_sight_cd() {
		return this.clm_sight_cd;
	}
	public String getCmem_hngr_flg() {
		return this.cmem_hngr_flg;
	}
	public String getClm_arv_splc() {
		return this.clm_arv_splc;
	}
	public String getCmem_bkg_cnt() {
		return this.cmem_bkg_cnt;
	}
	public String getCmem_cst_cd() {
		return this.cmem_cst_cd;
	}
	public String getCmem_pod() {
		return this.cmem_pod;
	}
	public String getCmem_muid_area() {
		return this.cmem_muid_area;
	}
	public String getCmem_act_dt() {
		return this.cmem_act_dt;
	}
	public String getCnmv_pickup_no() {
		return this.cnmv_pickup_no;
	}
	public String getCmem_cntr_stat() {
		return this.cmem_cntr_stat;
	}
	public String getCmem_gate_stat() {
		return this.cmem_gate_stat;
	}
	public String getCmem_flag() {
		return this.cmem_flag;
	}
	public String getCmem_arv_yd() {
		return this.cmem_arv_yd;
	}
	public String getCnmv_waybill_no() {
		return this.cnmv_waybill_no;
	}
	public String getCmem_dst_loc() {
		return this.cmem_dst_loc;
	}
	public String getCmem_muid_dt() {
		return this.cmem_muid_dt;
	}
	public String getCmem_dir_cd() {
		return this.cmem_dir_cd;
	}
	public String getCmem_del() {
		return this.cmem_del;
	}
	public String getCmem_flatcar_no() {
		return this.cmem_flatcar_no;
	}
	public String getClm_arv_loc() {
		return this.clm_arv_loc;
	}
	public String getCmem_bkg_no() {
		return this.cmem_bkg_no;
	}
	public String getTrain_no() {
		return this.train_no;
	}
	public String getCmem_sb() {
		return this.cmem_sb;
	}
	public String getCmem_rmk() {
		return this.cmem_rmk;
	}
	public String getCmem_vndr_seq() {
		return this.cmem_vndr_seq;
	}
	public String getCmem_muid_seq() {
		return this.cmem_muid_seq;
	}
	public String getCmem_chss_no() {
		return this.cmem_chss_no;
	}
	public String getCmem_cnt_cd() {
		return this.cmem_cnt_cd;
	}
	public String getCmem_edi_id() {
		return this.cmem_edi_id;
	}
	public String getCmem_tml_nm() {
		return this.cmem_tml_nm;
	}
	public String getCmem_sight_cd() {
		return this.cmem_sight_cd;
	}
	public String getCmem_315_flg() {
		return this.cmem_315_flg;
	}
	public String getCmem_dmg_flag() {
		return this.cmem_dmg_flag;
	}
	public String getCmem_mgset() {
		return this.cmem_mgset;
	}
	public String getCmem_voyage_no() {
		return this.cmem_voyage_no;
	}
	public String getCmem_dt_tm() {
		return this.cmem_dt_tm;
	}
	public String getCmem_dpt_yd() {
		return this.cmem_dpt_yd;
	}

	public void setPage_rows(String page_rows) {
		this.page_rows = page_rows;
		//this.page_rows=true;
	}
	public void setCmem_por(String cmem_por) {
		this.cmem_por = cmem_por;
		//this.cmem_por=true;
	}
	public void setClm_arv_dt(String clm_arv_dt) {
		this.clm_arv_dt = clm_arv_dt;
		//this.clm_arv_dt=true;
	}
	public void setCmem_pol(String cmem_pol) {
		this.cmem_pol = cmem_pol;
		//this.cmem_pol=true;
	}
	public void setCmem_msg_id(String cmem_msg_id) {
		this.cmem_msg_id = cmem_msg_id;
		//this.cmem_msg_id=true;
	}
	public void setCmem_vsl_cd(String cmem_vsl_cd) {
		this.cmem_vsl_cd = cmem_vsl_cd;
		//this.cmem_vsl_cd=true;
	}
	public void setCmem_svc_ord_no(String cmem_svc_ord_no) {
		this.cmem_svc_ord_no = cmem_svc_ord_no;
		//this.cmem_svc_ord_no=true;
	}
	public void setCmem_rty_cnt(String cmem_rty_cnt) {
		this.cmem_rty_cnt = cmem_rty_cnt;
		//this.cmem_rty_cnt=true;
	}
	public void setCmem_pickup_rqdt(String cmem_pickup_rqdt) {
		this.cmem_pickup_rqdt = cmem_pickup_rqdt;
		//this.cmem_pickup_rqdt=true;
	}
	public void setCmem_bkg_no_split(String cmem_bkg_no_split) {
		this.cmem_bkg_no_split = cmem_bkg_no_split;
		//this.cmem_bkg_no_split=true;
	}
	public void setCmem_cnms_cd(String cmem_cnms_cd) {
		this.cmem_cnms_cd = cmem_cnms_cd;
		//this.cmem_cnms_cd=true;
	}
	public void setCmem_mode_cd(String cmem_mode_cd) {
		this.cmem_mode_cd = cmem_mode_cd;
		//this.cmem_mode_cd=true;
	}
	public void setCmem_rst_flg(String cmem_rst_flg) {
		this.cmem_rst_flg = cmem_rst_flg;
		//this.cmem_rst_flg=true;
	}
	public void setMem_sys_dt(String mem_sys_dt) {
		this.mem_sys_dt = mem_sys_dt;
		//this.mem_sys_dt=true;
	}
	public void setCmem_cntr_no(String cmem_cntr_no) {
		this.cmem_cntr_no = cmem_cntr_no;
		//this.cmem_cntr_no=true;
	}
	public void setCmem_bl_no(String cmem_bl_no) {
		this.cmem_bl_no = cmem_bl_no;
		//this.cmem_bl_no=true;
	}
	public void setClm_dpt_splc(String clm_dpt_splc) {
		this.clm_dpt_splc = clm_dpt_splc;
		//this.clm_dpt_splc=true;
	}
	public void setCmem_yd(String cmem_yd) {
		this.cmem_yd = cmem_yd;
		//this.cmem_yd=true;
	}
	public void setCmem_seal_no(String cmem_seal_no) {
		this.cmem_seal_no = cmem_seal_no;
		//this.cmem_seal_no=true;
	}
	public void setCmem_tol(String cmem_tol) {
		this.cmem_tol = cmem_tol;
		//this.cmem_tol=true;
	}
	public void setClm_sight_cd(String clm_sight_cd) {
		this.clm_sight_cd = clm_sight_cd;
		//this.clm_sight_cd=true;
	}
	public void setCmem_hngr_flg(String cmem_hngr_flg) {
		this.cmem_hngr_flg = cmem_hngr_flg;
		//this.cmem_hngr_flg=true;
	}
	public void setClm_arv_splc(String clm_arv_splc) {
		this.clm_arv_splc = clm_arv_splc;
		//this.clm_arv_splc=true;
	}
	public void setCmem_bkg_cnt(String cmem_bkg_cnt) {
		this.cmem_bkg_cnt = cmem_bkg_cnt;
		//this.cmem_bkg_cnt=true;
	}
	public void setCmem_cst_cd(String cmem_cst_cd) {
		this.cmem_cst_cd = cmem_cst_cd;
		//this.cmem_cst_cd=true;
	}
	public void setCmem_pod(String cmem_pod) {
		this.cmem_pod = cmem_pod;
		//this.cmem_pod=true;
	}
	public void setCmem_muid_area(String cmem_muid_area) {
		this.cmem_muid_area = cmem_muid_area;
		//this.cmem_muid_area=true;
	}
	public void setCmem_act_dt(String cmem_act_dt) {
		this.cmem_act_dt = cmem_act_dt;
		//this.cmem_act_dt=true;
	}
	public void setCnmv_pickup_no(String cnmv_pickup_no) {
		this.cnmv_pickup_no = cnmv_pickup_no;
		//this.cnmv_pickup_no=true;
	}
	public void setCmem_cntr_stat(String cmem_cntr_stat) {
		this.cmem_cntr_stat = cmem_cntr_stat;
		//this.cmem_cntr_stat=true;
	}
	public void setCmem_gate_stat(String cmem_gate_stat) {
		this.cmem_gate_stat = cmem_gate_stat;
		//this.cmem_gate_stat=true;
	}
	public void setCmem_flag(String cmem_flag) {
		this.cmem_flag = cmem_flag;
		//this.cmem_flag=true;
	}
	public void setCmem_arv_yd(String cmem_arv_yd) {
		this.cmem_arv_yd = cmem_arv_yd;
		//this.cmem_arv_yd=true;
	}
	public void setCnmv_waybill_no(String cnmv_waybill_no) {
		this.cnmv_waybill_no = cnmv_waybill_no;
		//this.cnmv_waybill_no=true;
	}
	public void setCmem_dst_loc(String cmem_dst_loc) {
		this.cmem_dst_loc = cmem_dst_loc;
		//this.cmem_dst_loc=true;
	}
	public void setCmem_muid_dt(String cmem_muid_dt) {
		this.cmem_muid_dt = cmem_muid_dt;
		//this.cmem_muid_dt=true;
	}
	public void setCmem_dir_cd(String cmem_dir_cd) {
		this.cmem_dir_cd = cmem_dir_cd;
		//this.cmem_dir_cd=true;
	}
	public void setCmem_del(String cmem_del) {
		this.cmem_del = cmem_del;
		//this.cmem_del=true;
	}
	public void setCmem_flatcar_no(String cmem_flatcar_no) {
		this.cmem_flatcar_no = cmem_flatcar_no;
		//this.cmem_flatcar_no=true;
	}
	public void setClm_arv_loc(String clm_arv_loc) {
		this.clm_arv_loc = clm_arv_loc;
		//this.clm_arv_loc=true;
	}
	public void setCmem_bkg_no(String cmem_bkg_no) {
		this.cmem_bkg_no = cmem_bkg_no;
		//this.cmem_bkg_no=true;
	}
	public void setTrain_no(String train_no) {
		this.train_no = train_no;
		//this.train_no=true;
	}
	public void setCmem_sb(String cmem_sb) {
		this.cmem_sb = cmem_sb;
		//this.cmem_sb=true;
	}
	public void setCmem_rmk(String cmem_rmk) {
		this.cmem_rmk = cmem_rmk;
		//this.cmem_rmk=true;
	}
	public void setCmem_vndr_seq(String cmem_vndr_seq) {
		this.cmem_vndr_seq = cmem_vndr_seq;
		//this.cmem_vndr_seq=true;
	}
	public void setCmem_muid_seq(String cmem_muid_seq) {
		this.cmem_muid_seq = cmem_muid_seq;
		//this.cmem_muid_seq=true;
	}
	public void setCmem_chss_no(String cmem_chss_no) {
		this.cmem_chss_no = cmem_chss_no;
		//this.cmem_chss_no=true;
	}
	public void setCmem_cnt_cd(String cmem_cnt_cd) {
		this.cmem_cnt_cd = cmem_cnt_cd;
		//this.cmem_cnt_cd=true;
	}
	public void setCmem_edi_id(String cmem_edi_id) {
		this.cmem_edi_id = cmem_edi_id;
		//this.cmem_edi_id=true;
	}
	public void setCmem_tml_nm(String cmem_tml_nm) {
		this.cmem_tml_nm = cmem_tml_nm;
		//this.cmem_tml_nm=true;
	}
	public void setCmem_sight_cd(String cmem_sight_cd) {
		this.cmem_sight_cd = cmem_sight_cd;
		//this.cmem_sight_cd=true;
	}
	public void setCmem_315_flg(String cmem_315_flg) {
		this.cmem_315_flg = cmem_315_flg;
		//this.cmem_315_flg=true;
	}
	public void setCmem_dmg_flag(String cmem_dmg_flag) {
		this.cmem_dmg_flag = cmem_dmg_flag;
		//this.cmem_dmg_flag=true;
	}
	public void setCmem_mgset(String cmem_mgset) {
		this.cmem_mgset = cmem_mgset;
		//this.cmem_mgset=true;
	}
	public void setCmem_voyage_no(String cmem_voyage_no) {
		this.cmem_voyage_no = cmem_voyage_no;
		//this.cmem_voyage_no=true;
	}
	public void setCmem_dt_tm(String cmem_dt_tm) {
		this.cmem_dt_tm = cmem_dt_tm;
		//this.cmem_dt_tm=true;
	}
	public void setCmem_dpt_yd(String cmem_dpt_yd) {
		this.cmem_dpt_yd = cmem_dpt_yd;
		//this.cmem_dpt_yd=true;
	}

	public static CntrMvmtEdi fromRequest(HttpServletRequest request) {
		CntrMvmtEdi model = new CntrMvmtEdi();
		try {
					model.setPage_rows(JSPUtil.getParameter(request, "page_rows", ""));
					model.setCmem_por(JSPUtil.getParameter(request, "cmem_por", ""));
					model.setClm_arv_dt(JSPUtil.getParameter(request, "clm_arv_dt", ""));
					model.setCmem_pol(JSPUtil.getParameter(request, "cmem_pol", ""));
					model.setCmem_msg_id(JSPUtil.getParameter(request, "cmem_msg_id", ""));
					model.setCmem_vsl_cd(JSPUtil.getParameter(request, "cmem_vsl_cd", ""));
					model.setCmem_svc_ord_no(JSPUtil.getParameter(request, "cmem_svc_ord_no", ""));
					model.setCmem_rty_cnt(JSPUtil.getParameter(request, "cmem_rty_cnt", ""));
					model.setCmem_pickup_rqdt(JSPUtil.getParameter(request, "cmem_pickup_rqdt", ""));
					model.setCmem_bkg_no_split(JSPUtil.getParameter(request, "cmem_bkg_no_split", ""));
					model.setCmem_cnms_cd(JSPUtil.getParameter(request, "cmem_cnms_cd", ""));
					model.setCmem_mode_cd(JSPUtil.getParameter(request, "cmem_mode_cd", ""));
					model.setCmem_rst_flg(JSPUtil.getParameter(request, "cmem_rst_flg", ""));
					model.setMem_sys_dt(JSPUtil.getParameter(request, "mem_sys_dt", ""));
					model.setCmem_cntr_no(JSPUtil.getParameter(request, "cmem_cntr_no", ""));
					model.setCmem_bl_no(JSPUtil.getParameter(request, "cmem_bl_no", ""));
					model.setClm_dpt_splc(JSPUtil.getParameter(request, "clm_dpt_splc", ""));
					model.setCmem_yd(JSPUtil.getParameter(request, "cmem_yd", ""));
					model.setCmem_seal_no(JSPUtil.getParameter(request, "cmem_seal_no", ""));
					model.setCmem_tol(JSPUtil.getParameter(request, "cmem_tol", ""));
					model.setClm_sight_cd(JSPUtil.getParameter(request, "clm_sight_cd", ""));
					model.setCmem_hngr_flg(JSPUtil.getParameter(request, "cmem_hngr_flg", ""));
					model.setClm_arv_splc(JSPUtil.getParameter(request, "clm_arv_splc", ""));
					model.setCmem_bkg_cnt(JSPUtil.getParameter(request, "cmem_bkg_cnt", ""));
					model.setCmem_cst_cd(JSPUtil.getParameter(request, "cmem_cst_cd", ""));
					model.setCmem_pod(JSPUtil.getParameter(request, "cmem_pod", ""));
					model.setCmem_muid_area(JSPUtil.getParameter(request, "cmem_muid_area", ""));
					model.setCmem_act_dt(JSPUtil.getParameter(request, "cmem_act_dt", ""));
					model.setCnmv_pickup_no(JSPUtil.getParameter(request, "cnmv_pickup_no", ""));
					model.setCmem_cntr_stat(JSPUtil.getParameter(request, "cmem_cntr_stat", ""));
					model.setCmem_gate_stat(JSPUtil.getParameter(request, "cmem_gate_stat", ""));
					model.setCmem_flag(JSPUtil.getParameter(request, "cmem_flag", ""));
					model.setCmem_arv_yd(JSPUtil.getParameter(request, "cmem_arv_yd", ""));
					model.setCnmv_waybill_no(JSPUtil.getParameter(request, "cnmv_waybill_no", ""));
					model.setCmem_dst_loc(JSPUtil.getParameter(request, "cmem_dst_loc", ""));
//					model.setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
					model.setCmem_muid_dt(JSPUtil.getParameter(request, "cmem_muid_dt", ""));
					model.setCmem_dir_cd(JSPUtil.getParameter(request, "cmem_dir_cd", ""));
					model.setCmem_del(JSPUtil.getParameter(request, "cmem_del", ""));
					model.setCmem_flatcar_no(JSPUtil.getParameter(request, "cmem_flatcar_no", ""));
					model.setClm_arv_loc(JSPUtil.getParameter(request, "clm_arv_loc", ""));
					model.setCmem_bkg_no(JSPUtil.getParameter(request, "cmem_bkg_no", ""));
					model.setTrain_no(JSPUtil.getParameter(request, "train_no", ""));
					model.setCmem_sb(JSPUtil.getParameter(request, "cmem_sb", ""));
					model.setCmem_rmk(JSPUtil.getParameter(request, "cmem_rmk", ""));
					model.setCmem_vndr_seq(JSPUtil.getParameter(request, "cmem_vndr_seq", ""));
					model.setCmem_muid_seq(JSPUtil.getParameter(request, "cmem_muid_seq", ""));
					model.setCmem_chss_no(JSPUtil.getParameter(request, "cmem_chss_no", ""));
					model.setCmem_cnt_cd(JSPUtil.getParameter(request, "cmem_cnt_cd", ""));
					model.setCmem_edi_id(JSPUtil.getParameter(request, "cmem_edi_id", ""));
					model.setCmem_tml_nm(JSPUtil.getParameter(request, "cmem_tml_nm", ""));
					model.setCmem_sight_cd(JSPUtil.getParameter(request, "cmem_sight_cd", ""));
					model.setCmem_315_flg(JSPUtil.getParameter(request, "cmem_315_flg", ""));
					model.setCmem_dmg_flag(JSPUtil.getParameter(request, "cmem_dmg_flag", ""));
					model.setCmem_mgset(JSPUtil.getParameter(request, "cmem_mgset", ""));
					model.setCmem_voyage_no(JSPUtil.getParameter(request, "cmem_voyage_no", ""));
					model.setCmem_dt_tm(JSPUtil.getParameter(request, "cmem_dt_tm", ""));
					model.setCmem_dpt_yd(JSPUtil.getParameter(request, "cmem_dpt_yd", ""));
					
				} catch (Exception e) {
		}
		return model;
	}

	public static Collection fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		CntrMvmtEdi model = null;
		Collection models = new ArrayList();
		
		
		String[] tmp = request.getParameterValues("cmem_muid_area");
		if(tmp==null)
			return models;

		int length = request.getParameterValues(prefix + "cmem_muid_area").length;
		try {
					String[] page_rows = (JSPUtil.getParameter(request, prefix	+ "page_rows".trim(), length));
					String[] cmem_por = (JSPUtil.getParameter(request, prefix	+ "cmem_por".trim(), length));
					String[] clm_arv_dt = (JSPUtil.getParameter(request, prefix	+ "clm_arv_dt".trim(), length));
					String[] cmem_pol = (JSPUtil.getParameter(request, prefix	+ "cmem_pol".trim(), length));
					String[] cmem_msg_id = (JSPUtil.getParameter(request, prefix	+ "cmem_msg_id".trim(), length));
					String[] cmem_vsl_cd = (JSPUtil.getParameter(request, prefix	+ "cmem_vsl_cd".trim(), length));
					String[] cmem_svc_ord_no = (JSPUtil.getParameter(request, prefix	+ "cmem_svc_ord_no".trim(), length));
					String[] cmem_rty_cnt = (JSPUtil.getParameter(request, prefix	+ "cmem_rty_cnt".trim(), length));
					String[] cmem_pickup_rqdt = (JSPUtil.getParameter(request, prefix	+ "cmem_pickup_rqdt".trim(), length));
					String[] cmem_bkg_no_split = (JSPUtil.getParameter(request, prefix	+ "cmem_bkg_no_split".trim(), length));
					String[] cmem_cnms_cd = (JSPUtil.getParameter(request, prefix	+ "cmem_cnms_cd".trim(), length));
					String[] cmem_mode_cd = (JSPUtil.getParameter(request, prefix	+ "cmem_mode_cd".trim(), length));
					String[] cmem_rst_flg = (JSPUtil.getParameter(request, prefix	+ "cmem_rst_flg".trim(), length));
					String[] mem_sys_dt = (JSPUtil.getParameter(request, prefix	+ "mem_sys_dt".trim(), length));
					String[] cmem_cntr_no = (JSPUtil.getParameter(request, prefix	+ "cmem_cntr_no".trim(), length));
					String[] cmem_bl_no = (JSPUtil.getParameter(request, prefix	+ "cmem_bl_no".trim(), length));
					String[] clm_dpt_splc = (JSPUtil.getParameter(request, prefix	+ "clm_dpt_splc".trim(), length));
					String[] cmem_yd = (JSPUtil.getParameter(request, prefix	+ "cmem_yd".trim(), length));
					String[] cmem_seal_no = (JSPUtil.getParameter(request, prefix	+ "cmem_seal_no".trim(), length));
					String[] cmem_tol = (JSPUtil.getParameter(request, prefix	+ "cmem_tol".trim(), length));
					String[] clm_sight_cd = (JSPUtil.getParameter(request, prefix	+ "clm_sight_cd".trim(), length));
					String[] cmem_hngr_flg = (JSPUtil.getParameter(request, prefix	+ "cmem_hngr_flg".trim(), length));
					String[] clm_arv_splc = (JSPUtil.getParameter(request, prefix	+ "clm_arv_splc".trim(), length));
					String[] cmem_bkg_cnt = (JSPUtil.getParameter(request, prefix	+ "cmem_bkg_cnt".trim(), length));
					String[] cmem_cst_cd = (JSPUtil.getParameter(request, prefix	+ "cmem_cst_cd".trim(), length));
					String[] cmem_pod = (JSPUtil.getParameter(request, prefix	+ "cmem_pod".trim(), length));
					String[] cmem_muid_area = (JSPUtil.getParameter(request, prefix	+ "cmem_muid_area".trim(), length));
					String[] cmem_act_dt = (JSPUtil.getParameter(request, prefix	+ "cmem_act_dt".trim(), length));
					String[] cnmv_pickup_no = (JSPUtil.getParameter(request, prefix	+ "cnmv_pickup_no".trim(), length));
					String[] cmem_cntr_stat = (JSPUtil.getParameter(request, prefix	+ "cmem_cntr_stat".trim(), length));
					String[] cmem_gate_stat = (JSPUtil.getParameter(request, prefix	+ "cmem_gate_stat".trim(), length));
					String[] cmem_flag = (JSPUtil.getParameter(request, prefix	+ "cmem_flag".trim(), length));
					String[] cmem_arv_yd = (JSPUtil.getParameter(request, prefix	+ "cmem_arv_yd".trim(), length));
					String[] cnmv_waybill_no = (JSPUtil.getParameter(request, prefix	+ "cnmv_waybill_no".trim(), length));
					String[] cmem_dst_loc = (JSPUtil.getParameter(request, prefix	+ "cmem_dst_loc".trim(), length));
					String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
					String[] cmem_muid_dt = (JSPUtil.getParameter(request, prefix	+ "cmem_muid_dt".trim(), length));
					String[] cmem_dir_cd = (JSPUtil.getParameter(request, prefix	+ "cmem_dir_cd".trim(), length));
					String[] cmem_del = (JSPUtil.getParameter(request, prefix	+ "cmem_del".trim(), length));
					String[] cmem_flatcar_no = (JSPUtil.getParameter(request, prefix	+ "cmem_flatcar_no".trim(), length));
					String[] clm_arv_loc = (JSPUtil.getParameter(request, prefix	+ "clm_arv_loc".trim(), length));
					String[] cmem_bkg_no = (JSPUtil.getParameter(request, prefix	+ "cmem_bkg_no".trim(), length));
					String[] train_no = (JSPUtil.getParameter(request, prefix	+ "train_no".trim(), length));
					String[] cmem_sb = (JSPUtil.getParameter(request, prefix	+ "cmem_sb".trim(), length));
					String[] cmem_rmk = (JSPUtil.getParameter(request, prefix	+ "cmem_rmk".trim(), length));
					String[] cmem_vndr_seq = (JSPUtil.getParameter(request, prefix	+ "cmem_vndr_seq".trim(), length));
					String[] cmem_muid_seq = (JSPUtil.getParameter(request, prefix	+ "cmem_muid_seq".trim(), length));
					String[] cmem_chss_no = (JSPUtil.getParameter(request, prefix	+ "cmem_chss_no".trim(), length));
					String[] cmem_cnt_cd = (JSPUtil.getParameter(request, prefix	+ "cmem_cnt_cd".trim(), length));
					String[] cmem_edi_id = (JSPUtil.getParameter(request, prefix	+ "cmem_edi_id".trim(), length));
					
					//System.out.println("cmem_edi_id=" + cmem_edi_id[0]);
					
					String[] cmem_tml_nm = (JSPUtil.getParameter(request, prefix	+ "cmem_tml_nm".trim(), length));
					String[] cmem_sight_cd = (JSPUtil.getParameter(request, prefix	+ "cmem_sight_cd".trim(), length));
					String[] cmem_315_flg = (JSPUtil.getParameter(request, prefix	+ "cmem_315_flg".trim(), length));
					String[] cmem_dmg_flag = (JSPUtil.getParameter(request, prefix	+ "cmem_dmg_flag".trim(), length));
					String[] cmem_mgset = (JSPUtil.getParameter(request, prefix	+ "cmem_mgset".trim(), length));
					String[] cmem_voyage_no = (JSPUtil.getParameter(request, prefix	+ "cmem_voyage_no".trim(), length));
					String[] cmem_dt_tm = (JSPUtil.getParameter(request, prefix	+ "cmem_dt_tm".trim(), length));
					String[] cmem_dpt_yd = (JSPUtil.getParameter(request, prefix	+ "cmem_dpt_yd".trim(), length));
					
//					System.out.println("cmem_dpt_yd[0]="+ cmem_dpt_yd[0]);
					
					String[] from_dt = (JSPUtil.getParameter(request, prefix	+ "from_dt".trim(), length));
					String[] from_to = (JSPUtil.getParameter(request, prefix	+ "from_to".trim(), length));
					
			for (int i = 0; i < length; i++) {
				model = new CntrMvmtEdi();
							if (page_rows[i] != null)
					model.setPage_rows(page_rows[i]);
							if (cmem_por[i] != null)
					model.setCmem_por(cmem_por[i]);
							if (clm_arv_dt[i] != null)
					model.setClm_arv_dt(clm_arv_dt[i]);
							if (cmem_pol[i] != null)
					model.setCmem_pol(cmem_pol[i]);
							if (cmem_msg_id[i] != null)
					model.setCmem_msg_id(cmem_msg_id[i]);
							if (cmem_vsl_cd[i] != null)
					model.setCmem_vsl_cd(cmem_vsl_cd[i]);
							if (cmem_svc_ord_no[i] != null)
					model.setCmem_svc_ord_no(cmem_svc_ord_no[i]);
							if (cmem_rty_cnt[i] != null)
					model.setCmem_rty_cnt(cmem_rty_cnt[i]);
							if (cmem_pickup_rqdt[i] != null)
					model.setCmem_pickup_rqdt(cmem_pickup_rqdt[i]);
							if (cmem_bkg_no_split[i] != null)
					model.setCmem_bkg_no_split(cmem_bkg_no_split[i]);
							if (cmem_cnms_cd[i] != null)
					model.setCmem_cnms_cd(cmem_cnms_cd[i]);
							if (cmem_mode_cd[i] != null)
					model.setCmem_mode_cd(cmem_mode_cd[i]);
							if (cmem_rst_flg[i] != null)
					model.setCmem_rst_flg(cmem_rst_flg[i]);
							if (mem_sys_dt[i] != null)
					model.setMem_sys_dt(mem_sys_dt[i]);
							if (cmem_cntr_no[i] != null)
					model.setCmem_cntr_no(cmem_cntr_no[i]);
							if (cmem_bl_no[i] != null)
					model.setCmem_bl_no(cmem_bl_no[i]);
							if (clm_dpt_splc[i] != null)
					model.setClm_dpt_splc(clm_dpt_splc[i]);
							if (cmem_yd[i] != null)
					model.setCmem_yd(cmem_yd[i]);
							if (cmem_seal_no[i] != null)
					model.setCmem_seal_no(cmem_seal_no[i]);
							if (cmem_tol[i] != null)
					model.setCmem_tol(cmem_tol[i]);
							if (clm_sight_cd[i] != null)
					model.setClm_sight_cd(clm_sight_cd[i]);
							if (cmem_hngr_flg[i] != null)
					model.setCmem_hngr_flg(cmem_hngr_flg[i]);
							if (clm_arv_splc[i] != null)
					model.setClm_arv_splc(clm_arv_splc[i]);
							if (cmem_bkg_cnt[i] != null)
					model.setCmem_bkg_cnt(cmem_bkg_cnt[i]);
							if (cmem_cst_cd[i] != null)
					model.setCmem_cst_cd(cmem_cst_cd[i]);
							if (cmem_pod[i] != null)
					model.setCmem_pod(cmem_pod[i]);
							if (cmem_muid_area[i] != null)
					model.setCmem_muid_area(cmem_muid_area[i]);
							if (cmem_act_dt[i] != null)
					model.setCmem_act_dt(cmem_act_dt[i]);
							if (cnmv_pickup_no[i] != null)
					model.setCnmv_pickup_no(cnmv_pickup_no[i]);
							if (cmem_cntr_stat[i] != null)
					model.setCmem_cntr_stat(cmem_cntr_stat[i]);
							if (cmem_gate_stat[i] != null)
					model.setCmem_gate_stat(cmem_gate_stat[i]);
							if (cmem_flag[i] != null)
					model.setCmem_flag(cmem_flag[i]);
							if (cmem_arv_yd[i] != null)
					model.setCmem_arv_yd(cmem_arv_yd[i]);
							if (cnmv_waybill_no[i] != null)
					model.setCnmv_waybill_no(cnmv_waybill_no[i]);
							if (cmem_dst_loc[i] != null)
					model.setCmem_dst_loc(cmem_dst_loc[i]);
//							if (ibflag[i] != null)
//					model.setIbflag(ibflag[i]);
							if (cmem_muid_dt[i] != null)
					model.setCmem_muid_dt(cmem_muid_dt[i]);
							if (cmem_dir_cd[i] != null)
					model.setCmem_dir_cd(cmem_dir_cd[i]);
							if (cmem_del[i] != null)
					model.setCmem_del(cmem_del[i]);
							if (cmem_flatcar_no[i] != null)
					model.setCmem_flatcar_no(cmem_flatcar_no[i]);
							if (clm_arv_loc[i] != null)
					model.setClm_arv_loc(clm_arv_loc[i]);
							if (cmem_bkg_no[i] != null)
					model.setCmem_bkg_no(cmem_bkg_no[i]);
							if (train_no[i] != null)
					model.setTrain_no(train_no[i]);
							if (cmem_sb[i] != null)
					model.setCmem_sb(cmem_sb[i]);
							if (cmem_rmk[i] != null)
					model.setCmem_rmk(cmem_rmk[i]);
							if (cmem_vndr_seq[i] != null)
					model.setCmem_vndr_seq(cmem_vndr_seq[i]);
							if (cmem_muid_seq[i] != null)
					model.setCmem_muid_seq(cmem_muid_seq[i]);
							if (cmem_chss_no[i] != null)
					model.setCmem_chss_no(cmem_chss_no[i]);
							if (cmem_cnt_cd[i] != null)
					model.setCmem_cnt_cd(cmem_cnt_cd[i]);
							if (cmem_edi_id[i] != null)
					model.setCmem_edi_id(cmem_edi_id[i]);
							if (cmem_tml_nm[i] != null)
					model.setCmem_tml_nm(cmem_tml_nm[i]);
							if (cmem_sight_cd[i] != null)
					model.setCmem_sight_cd(cmem_sight_cd[i]);
							if (cmem_315_flg[i] != null)
					model.setCmem_315_flg(cmem_315_flg[i]);
							if (cmem_dmg_flag[i] != null)
					model.setCmem_dmg_flag(cmem_dmg_flag[i]);
							if (cmem_mgset[i] != null)
					model.setCmem_mgset(cmem_mgset[i]);
							if (cmem_voyage_no[i] != null)
					model.setCmem_voyage_no(cmem_voyage_no[i]);
							if (cmem_dt_tm[i] != null)
					model.setCmem_dt_tm(cmem_dt_tm[i]);
							if (cmem_dpt_yd[i] != null)
					model.setCmem_dpt_yd(cmem_dpt_yd[i]);

							models.add(model);
			}

		} catch (Exception e) {}
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

}
