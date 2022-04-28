/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : SPC_SREP_CUST_MAPG.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2007-12-14
*@LastModifier : 김원섭
*@LastVersion : 1.0
* 2007-12-14 김원섭
* 1.0 최초 생성
* 2009-03-27 최윤성 CSR:R200903190002
* - SPC_SREP_CUST_MAPG 테이블의 SREP_USR_ID -> SREP_CD 컬럼명 수정
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

public class SPC_SREP_CUST_MAPG implements Serializable {

	String ibflag = null;
	String page_rows = null;
	String srep_cd = null;
	String trd_cd = null;
	String sub_trd_cd = null;
	String rlane_cd = null;
	String dir_cd = null;
	String ioc_ts_cd = null;
	String cust_cnt_cd = null;
	String cust_seq = null;
	String fcast_cust_tp_cd = null;
	String rep_trd_cd = null;
	String rep_sub_trd_cd = null;
	String sls_rhq_cd = null;
	String sls_aq_cd = null;
	String sls_rgn_ofc_cd = null;
	String sls_ofc_cd = null;
	String fcast_ofc_cd = null;
	String cre_usr_id = null;
	String upd_usr_id = null;

	public SPC_SREP_CUST_MAPG() {
	}

	public SPC_SREP_CUST_MAPG(String ibflag, String page_rows, String srep_cd, String trd_cd, String sub_trd_cd,
			String rlane_cd, String dir_cd, String ioc_ts_cd, String cust_cnt_cd, String cust_seq,
			String fcast_cust_tp_cd, String rep_trd_cd, String rep_sub_trd_cd, String sls_rhq_cd, String sls_aq_cd,
			String sls_rgn_ofc_cd, String sls_ofc_cd, String fcast_ofc_cd, String cre_usr_id, String upd_usr_id) {
		this.ibflag = ibflag;
		this.page_rows = page_rows;
		this.srep_cd = srep_cd;
		this.trd_cd = trd_cd;
		this.sub_trd_cd = sub_trd_cd;
		this.rlane_cd = rlane_cd;
		this.dir_cd = dir_cd;
		this.ioc_ts_cd = ioc_ts_cd;
		this.cust_cnt_cd = cust_cnt_cd;
		this.cust_seq = cust_seq;
		this.fcast_cust_tp_cd = fcast_cust_tp_cd;
		this.rep_trd_cd = rep_trd_cd;
		this.rep_sub_trd_cd = rep_sub_trd_cd;
		this.sls_rhq_cd = sls_rhq_cd;
		this.sls_aq_cd = sls_aq_cd;
		this.sls_rgn_ofc_cd = sls_rgn_ofc_cd;
		this.sls_ofc_cd = sls_ofc_cd;
		this.fcast_ofc_cd = fcast_ofc_cd;
		this.cre_usr_id = cre_usr_id;
		this.upd_usr_id = upd_usr_id;
	}

	public String getIbflag() {
		return this.ibflag;
	}

	public String getPage_rows() {
		return this.page_rows;
	}

	public String getSrep_cd() {
		return this.srep_cd;
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

	public String getIoc_ts_cd() {
		return this.ioc_ts_cd;
	}

	public String getCust_cnt_cd() {
		return this.cust_cnt_cd;
	}

	public String getCust_seq() {
		return this.cust_seq;
	}

	public String getFcast_cust_tp_cd() {
		return this.fcast_cust_tp_cd;
	}

	public String getRep_trd_cd() {
		return this.rep_trd_cd;
	}

	public String getRep_sub_trd_cd() {
		return this.rep_sub_trd_cd;
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

	public String getFcast_ofc_cd() {
		return this.fcast_ofc_cd;
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

	public void setSrep_cd(String srep_cd) {
		this.srep_cd = srep_cd;
		//this.b_srep_cd=true;
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

	public void setIoc_ts_cd(String ioc_ts_cd) {
		this.ioc_ts_cd = ioc_ts_cd;
		//this.b_ioc_ts_cd=true;
	}

	public void setCust_cnt_cd(String cust_cnt_cd) {
		this.cust_cnt_cd = cust_cnt_cd;
		//this.b_cust_cnt_cd=true;
	}

	public void setCust_seq(String cust_seq) {
		this.cust_seq = cust_seq;
		//this.b_cust_seq=true;
	}

	public void setFcast_cust_tp_cd(String fcast_cust_tp_cd) {
		this.fcast_cust_tp_cd = fcast_cust_tp_cd;
		//this.b_fcast_cust_tp_cd=true;
	}

	public void setRep_trd_cd(String rep_trd_cd) {
		this.rep_trd_cd = rep_trd_cd;
		//this.b_rep_trd_cd=true;
	}

	public void setRep_sub_trd_cd(String rep_sub_trd_cd) {
		this.rep_sub_trd_cd = rep_sub_trd_cd;
		//this.b_rep_sub_trd_cd=true;
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

	public void setFcast_ofc_cd(String fcast_ofc_cd) {
		this.fcast_ofc_cd = fcast_ofc_cd;
		//this.b_fcast_ofc_cd=true;
	}

	public void setCre_usr_id(String cre_usr_id) {
		this.cre_usr_id = cre_usr_id;
		//this.b_cre_usr_id=true;
	}

	public void setUpd_usr_id(String upd_usr_id) {
		this.upd_usr_id = upd_usr_id;
		//this.b_upd_usr_id=true;
	}

	public static SPC_SREP_CUST_MAPG fromRequest(HttpServletRequest request) {
		String strUserId = getUserId(request);
		SPC_SREP_CUST_MAPG model = new SPC_SREP_CUST_MAPG();
		try {
			model.setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
			model.setPage_rows(JSPUtil.getParameter(request, "page_rows", ""));
			model.setSrep_cd(JSPUtil.getParameter(request, "srep_cd", ""));
			model.setTrd_cd(JSPUtil.getParameter(request, "trd_cd", ""));
			model.setSub_trd_cd(JSPUtil.getParameter(request, "sub_trd_cd", ""));
			model.setRlane_cd(JSPUtil.getParameter(request, "rlane_cd", ""));
			model.setDir_cd(JSPUtil.getParameter(request, "dir_cd", ""));
			model.setIoc_ts_cd(JSPUtil.getParameter(request, "ioc_ts_cd", ""));
			model.setCust_cnt_cd(JSPUtil.getParameter(request, "cust_cnt_cd", ""));
			model.setCust_seq(JSPUtil.getParameter(request, "cust_seq", ""));
			model.setFcast_cust_tp_cd(JSPUtil.getParameter(request, "fcast_cust_tp_cd", ""));
			model.setRep_trd_cd(JSPUtil.getParameter(request, "rep_trd_cd", ""));
			model.setRep_sub_trd_cd(JSPUtil.getParameter(request, "rep_sub_trd_cd", ""));
			model.setSls_rhq_cd(JSPUtil.getParameter(request, "sls_rhq_cd", ""));
			model.setSls_aq_cd(JSPUtil.getParameter(request, "sls_aq_cd", ""));
			model.setSls_rgn_ofc_cd(JSPUtil.getParameter(request, "sls_rgn_ofc_cd", ""));
			model.setSls_ofc_cd(JSPUtil.getParameter(request, "sls_ofc_cd", ""));
			model.setFcast_ofc_cd(JSPUtil.getParameter(request, "fcast_ofc_cd", ""));
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
		SPC_SREP_CUST_MAPG model = null;
		Collection models = new ArrayList();
		String[] params = request.getParameterValues(prefix + "srep_cd");
		if (params == null)
			return models;
		int length = request.getParameterValues(prefix + "srep_cd").length;
		try {
			String[] ibflag = (JSPUtil.getParameter(request, prefix + "ibflag".trim(), length));
			String[] page_rows = (JSPUtil.getParameter(request, prefix + "page_rows".trim(), length));
			String[] srep_cd = (JSPUtil.getParameter(request, prefix + "srep_cd".trim(), length));
			String[] trd_cd = (JSPUtil.getParameter(request, prefix + "trd_cd".trim(), length));
			String[] sub_trd_cd = (JSPUtil.getParameter(request, prefix + "sub_trd_cd".trim(), length));
			String[] rlane_cd = (JSPUtil.getParameter(request, prefix + "rlane_cd".trim(), length));
			String[] dir_cd = (JSPUtil.getParameter(request, prefix + "dir_cd".trim(), length));
			String[] ioc_ts_cd = (JSPUtil.getParameter(request, prefix + "ioc_ts_cd".trim(), length));
			String[] cust_cnt_cd = (JSPUtil.getParameter(request, prefix + "cust_cnt_cd".trim(), length));
			String[] cust_seq = (JSPUtil.getParameter(request, prefix + "cust_seq".trim(), length));
			String[] fcast_cust_tp_cd = (JSPUtil.getParameter(request, prefix + "fcast_cust_tp_cd".trim(), length));
			String[] rep_trd_cd = (JSPUtil.getParameter(request, prefix + "rep_trd_cd".trim(), length));
			String[] rep_sub_trd_cd = (JSPUtil.getParameter(request, prefix + "rep_sub_trd_cd".trim(), length));
			String[] sls_rhq_cd = (JSPUtil.getParameter(request, prefix + "sls_rhq_cd".trim(), length));
			String[] sls_aq_cd = (JSPUtil.getParameter(request, prefix + "sls_aq_cd".trim(), length));
			String[] sls_rgn_ofc_cd = (JSPUtil.getParameter(request, prefix + "sls_rgn_ofc_cd".trim(), length));
			String[] sls_ofc_cd = (JSPUtil.getParameter(request, prefix + "sls_ofc_cd".trim(), length));
			String[] fcast_ofc_cd = (JSPUtil.getParameter(request, prefix + "fcast_ofc_cd".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new SPC_SREP_CUST_MAPG();
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (page_rows[i] != null)
					model.setPage_rows(page_rows[i]);
				if (srep_cd[i] != null)
					model.setSrep_cd(srep_cd[i]);
				if (trd_cd[i] != null)
					model.setTrd_cd(trd_cd[i]);
				if (sub_trd_cd[i] != null)
					model.setSub_trd_cd(sub_trd_cd[i]);
				if (rlane_cd[i] != null)
					model.setRlane_cd(rlane_cd[i]);
				if (dir_cd[i] != null)
					model.setDir_cd(dir_cd[i]);
				if (ioc_ts_cd[i] != null)
					model.setIoc_ts_cd(ioc_ts_cd[i]);
				if (cust_cnt_cd[i] != null)
					model.setCust_cnt_cd(cust_cnt_cd[i]);
				if (cust_seq[i] != null)
					model.setCust_seq(cust_seq[i]);
				if (fcast_cust_tp_cd[i] != null)
					model.setFcast_cust_tp_cd(fcast_cust_tp_cd[i]);
				if (rep_trd_cd[i] != null)
					model.setRep_trd_cd(rep_trd_cd[i]);
				if (rep_sub_trd_cd[i] != null)
					model.setRep_sub_trd_cd(rep_sub_trd_cd[i]);
				if (sls_rhq_cd[i] != null)
					model.setSls_rhq_cd(sls_rhq_cd[i]);
				if (sls_aq_cd[i] != null)
					model.setSls_aq_cd(sls_aq_cd[i]);
				if (sls_rgn_ofc_cd[i] != null)
					model.setSls_rgn_ofc_cd(sls_rgn_ofc_cd[i]);
				if (sls_ofc_cd[i] != null)
					model.setSls_ofc_cd(sls_ofc_cd[i]);
				if (fcast_ofc_cd[i] != null)
					model.setFcast_ofc_cd(fcast_ofc_cd[i]);
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