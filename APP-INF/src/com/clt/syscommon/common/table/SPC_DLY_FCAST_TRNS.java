/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : SPC_DLY_FCAST_TRNS.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2006-11-24
*@LastModifier : 박경애
*@LastVersion : 1.0
* 2006-11-24 박경애
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
 * @author 박경애
 * @since J2EE 1.4
 */

public class SPC_DLY_FCAST_TRNS implements Serializable {

	String ibflag = null;

	String page_rows = null;

	String sls_fcast_no = null;

	String altn_fcast_seq = null;

	String raloc_ver_no = null;

	String vsl_cd = null;

	String skd_voy_no = null;

	String skd_dir_cd = null;

	String cust_cnt_cd = null;

	String cust_seq = null;

	String sls_ofc_cd = null;

	String por_cd = null;

	String del_cd = null;

	String n1st_pol_cd = null;

	String lst_pod_cd = null;

	String trnk_pol_cd = null;

	String trnk_pod_cd = null;

	String fcast_cntr_tpsz_cd = null;

	String lod_qty = null;

	String grs_rev = null;

	String cost_amt = null;

	String cm_amt = null;

	String mdl_rslt_flg = null;

	String mdl_aloc_qty = null;

	String bse_yr = null;

	String bse_mon = null;

	String bse_wk = null;

	String trd_cd = null;

	String sub_trd_cd = null;

	String rlane_cd = null;

	String dir_cd = null;

	String ioc_cd = null;

	String cre_usr_id = null;

	String upd_usr_id = null;

	public SPC_DLY_FCAST_TRNS() {
	}

	public SPC_DLY_FCAST_TRNS(String ibflag, String page_rows, String sls_fcast_no, String altn_fcast_seq,
			String raloc_ver_no, String vsl_cd, String skd_voy_no, String skd_dir_cd, String cust_cnt_cd,
			String cust_seq, String sls_ofc_cd, String por_cd, String del_cd, String n1st_pol_cd, String lst_pod_cd,
			String trnk_pol_cd, String trnk_pod_cd, String fcast_cntr_tpsz_cd, String lod_qty, String grs_rev,
			String cost_amt, String cm_amt, String mdl_rslt_flg, String mdl_aloc_qty, String bse_yr, String bse_mon,
			String bse_wk, String trd_cd, String sub_trd_cd, String rlane_cd, String dir_cd, String ioc_cd,
			String cre_usr_id, String upd_usr_id) {
		this.ibflag = ibflag;
		this.page_rows = page_rows;
		this.sls_fcast_no = sls_fcast_no;
		this.altn_fcast_seq = altn_fcast_seq;
		this.raloc_ver_no = raloc_ver_no;
		this.vsl_cd = vsl_cd;
		this.skd_voy_no = skd_voy_no;
		this.skd_dir_cd = skd_dir_cd;
		this.cust_cnt_cd = cust_cnt_cd;
		this.cust_seq = cust_seq;
		this.sls_ofc_cd = sls_ofc_cd;
		this.por_cd = por_cd;
		this.del_cd = del_cd;
		this.n1st_pol_cd = n1st_pol_cd;
		this.lst_pod_cd = lst_pod_cd;
		this.trnk_pol_cd = trnk_pol_cd;
		this.trnk_pod_cd = trnk_pod_cd;
		this.fcast_cntr_tpsz_cd = fcast_cntr_tpsz_cd;
		this.lod_qty = lod_qty;
		this.grs_rev = grs_rev;
		this.cost_amt = cost_amt;
		this.cm_amt = cm_amt;
		this.mdl_rslt_flg = mdl_rslt_flg.replace('1', 'Y').replace('0', 'N');
		this.mdl_aloc_qty = mdl_aloc_qty;
		this.bse_yr = bse_yr;
		this.bse_mon = bse_mon;
		this.bse_wk = bse_wk;
		this.trd_cd = trd_cd;
		this.sub_trd_cd = sub_trd_cd;
		this.rlane_cd = rlane_cd;
		this.dir_cd = dir_cd;
		this.ioc_cd = ioc_cd;
		this.cre_usr_id = cre_usr_id;
		this.upd_usr_id = upd_usr_id;
	}

	public String getIbflag() {
		return this.ibflag;
	}

	public String getPage_rows() {
		return this.page_rows;
	}

	public String getSls_fcast_no() {
		return this.sls_fcast_no;
	}

	public String getAltn_fcast_seq() {
		return this.altn_fcast_seq;
	}

	public String getRaloc_ver_no() {
		return this.raloc_ver_no;
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

	public String getCust_cnt_cd() {
		return this.cust_cnt_cd;
	}

	public String getCust_seq() {
		return this.cust_seq;
	}

	public String getSls_ofc_cd() {
		return this.sls_ofc_cd;
	}

	public String getPor_cd() {
		return this.por_cd;
	}

	public String getDel_cd() {
		return this.del_cd;
	}

	public String getN1st_pol_cd() {
		return this.n1st_pol_cd;
	}

	public String getLst_pod_cd() {
		return this.lst_pod_cd;
	}

	public String getTrnk_pol_cd() {
		return this.trnk_pol_cd;
	}

	public String getTrnk_pod_cd() {
		return this.trnk_pod_cd;
	}

	public String getFcast_cntr_tpsz_cd() {
		return this.fcast_cntr_tpsz_cd;
	}

	public String getLod_qty() {
		return this.lod_qty;
	}

	public String getGrs_rev() {
		return this.grs_rev;
	}

	public String getCost_amt() {
		return this.cost_amt;
	}

	public String getCm_amt() {
		return this.cm_amt;
	}

	public String getMdl_rslt_flg() {
		return this.mdl_rslt_flg;
	}

	public String getMdl_aloc_qty() {
		return this.mdl_aloc_qty;
	}

	public String getBse_yr() {
		return this.bse_yr;
	}

	public String getBse_mon() {
		return this.bse_mon;
	}

	public String getBse_wk() {
		return this.bse_wk;
	}

	public String getTrd_cd() {
		return this.trd_cd;
	}

	public String getSub_trd_cd() {
		return this.sub_trd_cd;
	}

	public String getRlane_cd() {
		return this.rlane_cd;
	}

	public String getDir_cd() {
		return this.dir_cd;
	}

	public String getIoc_cd() {
		return this.ioc_cd;
	}

	public String getCre_usr_id() {
		return this.cre_usr_id;
	}

	public String getUpd_usr_id() {
		return this.upd_usr_id;
	}

	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.b_ibflag=true;
	}

	public void setPage_rows(String page_rows) {
		this.page_rows = page_rows;
		//this.b_page_rows=true;
	}

	public void setSls_fcast_no(String sls_fcast_no) {
		this.sls_fcast_no = sls_fcast_no;
		//this.b_sls_fcast_no=true;
	}

	public void setAltn_fcast_seq(String altn_fcast_seq) {
		this.altn_fcast_seq = altn_fcast_seq;
		//this.b_altn_fcast_seq=true;
	}

	public void setRaloc_ver_no(String raloc_ver_no) {
		this.raloc_ver_no = raloc_ver_no;
		//this.b_raloc_ver_no=true;
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

	public void setCust_cnt_cd(String cust_cnt_cd) {
		this.cust_cnt_cd = cust_cnt_cd;
		//this.b_cust_cnt_cd=true;
	}

	public void setCust_seq(String cust_seq) {
		this.cust_seq = cust_seq;
		//this.b_cust_seq=true;
	}

	public void setSls_ofc_cd(String sls_ofc_cd) {
		this.sls_ofc_cd = sls_ofc_cd;
		//this.b_sls_ofc_cd=true;
	}

	public void setPor_cd(String por_cd) {
		this.por_cd = por_cd;
		//this.b_por_cd=true;
	}

	public void setDel_cd(String del_cd) {
		this.del_cd = del_cd;
		//this.b_del_cd=true;
	}

	public void setN1st_pol_cd(String n1st_pol_cd) {
		this.n1st_pol_cd = n1st_pol_cd;
		//this.b_n1st_pol_cd=true;
	}

	public void setLst_pod_cd(String lst_pod_cd) {
		this.lst_pod_cd = lst_pod_cd;
		//this.b_lst_pod_cd=true;
	}

	public void setTrnk_pol_cd(String trnk_pol_cd) {
		this.trnk_pol_cd = trnk_pol_cd;
		//this.b_trnk_pol_cd=true;
	}

	public void setTrnk_pod_cd(String trnk_pod_cd) {
		this.trnk_pod_cd = trnk_pod_cd;
		//this.b_trnk_pod_cd=true;
	}

	public void setFcast_cntr_tpsz_cd(String fcast_cntr_tpsz_cd) {
		this.fcast_cntr_tpsz_cd = fcast_cntr_tpsz_cd;
		//this.b_fcast_cntr_tpsz_cd=true;
	}

	public void setLod_qty(String lod_qty) {
		this.lod_qty = lod_qty;
		//this.b_lod_qty=true;
	}

	public void setGrs_rev(String grs_rev) {
		this.grs_rev = grs_rev;
		//this.b_grs_rev=true;
	}

	public void setCost_amt(String cost_amt) {
		this.cost_amt = cost_amt;
		//this.b_cost_amt=true;
	}

	public void setCm_amt(String cm_amt) {
		this.cm_amt = cm_amt;
		//this.b_cm_amt=true;
	}

	public void setMdl_rslt_flg(String mdl_rslt_flg) {
		this.mdl_rslt_flg = mdl_rslt_flg.replace('1', 'Y').replace('0', 'N');
		//this.b_mdl_rslt_flg=true;
	}

	public void setMdl_aloc_qty(String mdl_aloc_qty) {
		this.mdl_aloc_qty = mdl_aloc_qty;
		//this.b_mdl_aloc_qty=true;
	}

	public void setBse_yr(String bse_yr) {
		this.bse_yr = bse_yr;
		//this.b_bse_yr=true;
	}

	public void setBse_mon(String bse_mon) {
		this.bse_mon = bse_mon;
		//this.b_bse_mon=true;
	}

	public void setBse_wk(String bse_wk) {
		this.bse_wk = bse_wk;
		//this.b_bse_wk=true;
	}

	public void setTrd_cd(String trd_cd) {
		this.trd_cd = trd_cd;
		//this.b_trd_cd=true;
	}

	public void setSub_trd_cd(String sub_trd_cd) {
		this.sub_trd_cd = sub_trd_cd;
		//this.b_sub_trd_cd=true;
	}

	public void setRlane_cd(String rlane_cd) {
		this.rlane_cd = rlane_cd;
		//this.b_rlane_cd=true;
	}

	public void setDir_cd(String dir_cd) {
		this.dir_cd = dir_cd;
		//this.b_dir_cd=true;
	}

	public void setIoc_cd(String ioc_cd) {
		this.ioc_cd = ioc_cd;
		//this.b_ioc_cd=true;
	}

	public void setCre_usr_id(String cre_usr_id) {
		this.cre_usr_id = cre_usr_id;
		//this.b_cre_usr_id=true;
	}

	public void setUpd_usr_id(String upd_usr_id) {
		this.upd_usr_id = upd_usr_id;
		//this.b_upd_usr_id=true;
	}

	public static SPC_DLY_FCAST_TRNS fromRequest(HttpServletRequest request) {
		String strUserId = getUserId(request);
		SPC_DLY_FCAST_TRNS model = new SPC_DLY_FCAST_TRNS();
		try {
			model.setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
			model.setPage_rows(JSPUtil.getParameter(request, "page_rows", ""));
			model.setSls_fcast_no(JSPUtil.getParameter(request, "sls_fcast_no", ""));
			model.setAltn_fcast_seq(JSPUtil.getParameter(request, "altn_fcast_seq", ""));
			model.setRaloc_ver_no(JSPUtil.getParameter(request, "raloc_ver_no", ""));
			model.setVsl_cd(JSPUtil.getParameter(request, "vsl_cd", ""));
			model.setSkd_voy_no(JSPUtil.getParameter(request, "skd_voy_no", ""));
			model.setSkd_dir_cd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
			model.setCust_cnt_cd(JSPUtil.getParameter(request, "cust_cnt_cd", ""));
			model.setCust_seq(JSPUtil.getParameter(request, "cust_seq", ""));
			model.setSls_ofc_cd(JSPUtil.getParameter(request, "sls_ofc_cd", ""));
			model.setPor_cd(JSPUtil.getParameter(request, "por_cd", ""));
			model.setDel_cd(JSPUtil.getParameter(request, "del_cd", ""));
			model.setN1st_pol_cd(JSPUtil.getParameter(request, "n1st_pol_cd", ""));
			model.setLst_pod_cd(JSPUtil.getParameter(request, "lst_pod_cd", ""));
			model.setTrnk_pol_cd(JSPUtil.getParameter(request, "trnk_pol_cd", ""));
			model.setTrnk_pod_cd(JSPUtil.getParameter(request, "trnk_pod_cd", ""));
			model.setFcast_cntr_tpsz_cd(JSPUtil.getParameter(request, "fcast_cntr_tpsz_cd", ""));
			model.setLod_qty(JSPUtil.getParameter(request, "lod_qty", ""));
			model.setGrs_rev(JSPUtil.getParameter(request, "grs_rev", ""));
			model.setCost_amt(JSPUtil.getParameter(request, "cost_amt", ""));
			model.setCm_amt(JSPUtil.getParameter(request, "cm_amt", ""));
			model.setMdl_rslt_flg(JSPUtil.getParameter(request, "mdl_rslt_flg", ""));
			model.setMdl_aloc_qty(JSPUtil.getParameter(request, "mdl_aloc_qty", ""));
			model.setBse_yr(JSPUtil.getParameter(request, "bse_yr", ""));
			model.setBse_mon(JSPUtil.getParameter(request, "bse_mon", ""));
			model.setBse_wk(JSPUtil.getParameter(request, "bse_wk", ""));
			model.setTrd_cd(JSPUtil.getParameter(request, "trd_cd", ""));
			model.setSub_trd_cd(JSPUtil.getParameter(request, "sub_trd_cd", ""));
			model.setRlane_cd(JSPUtil.getParameter(request, "rlane_cd", ""));
			model.setDir_cd(JSPUtil.getParameter(request, "dir_cd", ""));
			model.setIoc_cd(JSPUtil.getParameter(request, "ioc_cd", ""));
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
		SPC_DLY_FCAST_TRNS model = null;
		Collection models = new ArrayList();
		String[] params = request.getParameterValues(prefix + "sls_fcast_no");
		if (params == null)
			return models;
		int length = request.getParameterValues(prefix + "sls_fcast_no").length;
		try {
			String[] ibflag = (JSPUtil.getParameter(request, prefix + "ibflag".trim(), length));
			String[] page_rows = (JSPUtil.getParameter(request, prefix + "page_rows".trim(), length));
			String[] sls_fcast_no = (JSPUtil.getParameter(request, prefix + "sls_fcast_no".trim(), length));
			String[] altn_fcast_seq = (JSPUtil.getParameter(request, prefix + "altn_fcast_seq".trim(), length));
			String[] raloc_ver_no = (JSPUtil.getParameter(request, prefix + "raloc_ver_no".trim(), length));
			String[] vsl_cd = (JSPUtil.getParameter(request, prefix + "vsl_cd".trim(), length));
			String[] skd_voy_no = (JSPUtil.getParameter(request, prefix + "skd_voy_no".trim(), length));
			String[] skd_dir_cd = (JSPUtil.getParameter(request, prefix + "skd_dir_cd".trim(), length));
			String[] cust_cnt_cd = (JSPUtil.getParameter(request, prefix + "cust_cnt_cd".trim(), length));
			String[] cust_seq = (JSPUtil.getParameter(request, prefix + "cust_seq".trim(), length));
			String[] sls_ofc_cd = (JSPUtil.getParameter(request, prefix + "sls_ofc_cd".trim(), length));
			String[] por_cd = (JSPUtil.getParameter(request, prefix + "por_cd".trim(), length));
			String[] del_cd = (JSPUtil.getParameter(request, prefix + "del_cd".trim(), length));
			String[] n1st_pol_cd = (JSPUtil.getParameter(request, prefix + "n1st_pol_cd".trim(), length));
			String[] lst_pod_cd = (JSPUtil.getParameter(request, prefix + "lst_pod_cd".trim(), length));
			String[] trnk_pol_cd = (JSPUtil.getParameter(request, prefix + "trnk_pol_cd".trim(), length));
			String[] trnk_pod_cd = (JSPUtil.getParameter(request, prefix + "trnk_pod_cd".trim(), length));
			String[] fcast_cntr_tpsz_cd = (JSPUtil.getParameter(request, prefix + "fcast_cntr_tpsz_cd".trim(), length));
			String[] lod_qty = (JSPUtil.getParameter(request, prefix + "lod_qty".trim(), length));
			String[] grs_rev = (JSPUtil.getParameter(request, prefix + "grs_rev".trim(), length));
			String[] cost_amt = (JSPUtil.getParameter(request, prefix + "cost_amt".trim(), length));
			String[] cm_amt = (JSPUtil.getParameter(request, prefix + "cm_amt".trim(), length));
			String[] mdl_rslt_flg = (JSPUtil.getParameter(request, prefix + "mdl_rslt_flg".trim(), length));
			String[] mdl_aloc_qty = (JSPUtil.getParameter(request, prefix + "mdl_aloc_qty".trim(), length));
			String[] bse_yr = (JSPUtil.getParameter(request, prefix + "bse_yr".trim(), length));
			String[] bse_mon = (JSPUtil.getParameter(request, prefix + "bse_mon".trim(), length));
			String[] bse_wk = (JSPUtil.getParameter(request, prefix + "bse_wk".trim(), length));
			String[] trd_cd = (JSPUtil.getParameter(request, prefix + "trd_cd".trim(), length));
			String[] sub_trd_cd = (JSPUtil.getParameter(request, prefix + "sub_trd_cd".trim(), length));
			String[] rlane_cd = (JSPUtil.getParameter(request, prefix + "rlane_cd".trim(), length));
			String[] dir_cd = (JSPUtil.getParameter(request, prefix + "dir_cd".trim(), length));
			String[] ioc_cd = (JSPUtil.getParameter(request, prefix + "ioc_cd".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new SPC_DLY_FCAST_TRNS();
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (page_rows[i] != null)
					model.setPage_rows(page_rows[i]);
				if (sls_fcast_no[i] != null)
					model.setSls_fcast_no(sls_fcast_no[i]);
				if (altn_fcast_seq[i] != null)
					model.setAltn_fcast_seq(altn_fcast_seq[i]);
				if (raloc_ver_no[i] != null)
					model.setRaloc_ver_no(raloc_ver_no[i]);
				if (vsl_cd[i] != null)
					model.setVsl_cd(vsl_cd[i]);
				if (skd_voy_no[i] != null)
					model.setSkd_voy_no(skd_voy_no[i]);
				if (skd_dir_cd[i] != null)
					model.setSkd_dir_cd(skd_dir_cd[i]);
				if (cust_cnt_cd[i] != null)
					model.setCust_cnt_cd(cust_cnt_cd[i]);
				if (cust_seq[i] != null)
					model.setCust_seq(cust_seq[i]);
				if (sls_ofc_cd[i] != null)
					model.setSls_ofc_cd(sls_ofc_cd[i]);
				if (por_cd[i] != null)
					model.setPor_cd(por_cd[i]);
				if (del_cd[i] != null)
					model.setDel_cd(del_cd[i]);
				if (n1st_pol_cd[i] != null)
					model.setN1st_pol_cd(n1st_pol_cd[i]);
				if (lst_pod_cd[i] != null)
					model.setLst_pod_cd(lst_pod_cd[i]);
				if (trnk_pol_cd[i] != null)
					model.setTrnk_pol_cd(trnk_pol_cd[i]);
				if (trnk_pod_cd[i] != null)
					model.setTrnk_pod_cd(trnk_pod_cd[i]);
				if (fcast_cntr_tpsz_cd[i] != null)
					model.setFcast_cntr_tpsz_cd(fcast_cntr_tpsz_cd[i]);
				if (lod_qty[i] != null)
					model.setLod_qty(lod_qty[i]);
				if (grs_rev[i] != null)
					model.setGrs_rev(grs_rev[i]);
				if (cost_amt[i] != null)
					model.setCost_amt(cost_amt[i]);
				if (cm_amt[i] != null)
					model.setCm_amt(cm_amt[i]);
				if (mdl_rslt_flg[i] != null)
					model.setMdl_rslt_flg(mdl_rslt_flg[i]);
				if (mdl_aloc_qty[i] != null)
					model.setMdl_aloc_qty(mdl_aloc_qty[i]);
				if (bse_yr[i] != null)
					model.setBse_yr(bse_yr[i]);
				if (bse_mon[i] != null)
					model.setBse_mon(bse_mon[i]);
				if (bse_wk[i] != null)
					model.setBse_wk(bse_wk[i]);
				if (trd_cd[i] != null)
					model.setTrd_cd(trd_cd[i]);
				if (sub_trd_cd[i] != null)
					model.setSub_trd_cd(sub_trd_cd[i]);
				if (rlane_cd[i] != null)
					model.setRlane_cd(rlane_cd[i]);
				if (dir_cd[i] != null)
					model.setDir_cd(dir_cd[i]);
				if (ioc_cd[i] != null)
					model.setIoc_cd(ioc_cd[i]);
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