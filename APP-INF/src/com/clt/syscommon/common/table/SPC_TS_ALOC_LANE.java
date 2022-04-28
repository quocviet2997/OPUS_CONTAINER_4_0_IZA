/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : SPC_TS_ALOC_LANE.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2007-03-05
*@LastModifier : 김원섭
*@LastVersion : 1.0
* 2007-03-05 김원섭
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

public class SPC_TS_ALOC_LANE implements Serializable {

	String ibflag = null;

	String page_rows = null;

	String bse_yr = null;

	String bse_mon = null;

	String rlane_cd = null;

	String dir_cd = null;

	String sls_rhq_cd = null;

	String rep_trd_cd = null;

	String cre_usr_id = null;

	String upd_usr_id = null;

	public SPC_TS_ALOC_LANE() {
	}

	public SPC_TS_ALOC_LANE(String ibflag, String page_rows, String bse_yr,
			String bse_mon, String rlane_cd, String dir_cd, String sls_rhq_cd,
			String rep_trd_cd, String cre_usr_id,
			String upd_usr_id) {
		this.ibflag = ibflag;
		this.page_rows = page_rows;
		this.bse_yr = bse_yr;
		this.bse_mon = bse_mon;
		this.rlane_cd = rlane_cd;
		this.dir_cd = dir_cd;
		this.sls_rhq_cd = sls_rhq_cd;
		this.rep_trd_cd = rep_trd_cd;
		this.cre_usr_id = cre_usr_id;
		this.upd_usr_id = upd_usr_id;
	}

	public String getIbflag() {
		return this.ibflag;
	}

	public String getPage_rows() {
		return this.page_rows;
	}

	public String getBse_yr() {
		return this.bse_yr;
	}

	public String getBse_mon() {
		return this.bse_mon;
	}

	public String getRlane_cd() {
		return this.rlane_cd;
	}

	public String getDir_cd() {
		return this.dir_cd;
	}

	public String getSls_rhq_cd() {
		return this.sls_rhq_cd;
	}

	public String getRep_trd_cd() {
		return this.rep_trd_cd;
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

	public void setBse_yr(String bse_yr) {
		this.bse_yr = bse_yr;
		//this.b_bse_yr=true;
	}

	public void setBse_mon(String bse_mon) {
		this.bse_mon = bse_mon;
		//this.b_bse_mon=true;
	}

	public void setRlane_cd(String rlane_cd) {
		this.rlane_cd = rlane_cd;
		//this.b_rlane_cd=true;
	}

	public void setDir_cd(String dir_cd) {
		this.dir_cd = dir_cd;
		//this.b_dir_cd=true;
	}

	public void setSls_rhq_cd(String to_trd_cd) {
		this.sls_rhq_cd = to_trd_cd;
		//this.b_to_trd_cd=true;
	}

	public void setRep_trd_cd(String rep_trd_cd) {
		this.rep_trd_cd = rep_trd_cd;
		//this.b_rep_trd_cd=true;
	}

	public void setCre_usr_id(String cre_usr_id) {
		this.cre_usr_id = cre_usr_id;
		//this.b_cre_usr_id=true;
	}

	public void setUpd_usr_id(String upd_usr_id) {
		this.upd_usr_id = upd_usr_id;
		//this.b_upd_usr_id=true;
	}

	public static SPC_TS_ALOC_LANE fromRequest(HttpServletRequest request) {
		String strUserId = getUserId(request);
		SPC_TS_ALOC_LANE model = new SPC_TS_ALOC_LANE();
		try {
			model.setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
			model.setPage_rows(JSPUtil.getParameter(request, "page_rows", ""));
			model.setBse_yr(JSPUtil.getParameter(request, "bse_yr", ""));
			model.setBse_mon(JSPUtil.getParameter(request, "bse_mon", ""));
			model.setRlane_cd(JSPUtil.getParameter(request, "rlane_cd", ""));
			model.setDir_cd(JSPUtil.getParameter(request, "dir_cd", ""));
			model.setSls_rhq_cd(JSPUtil.getParameter(request, "sls_rhq_cd", ""));
			model
					.setRep_trd_cd(JSPUtil.getParameter(request, "rep_trd_cd",
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
		SPC_TS_ALOC_LANE model = null;
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
			String[] sls_rhq_cd = (JSPUtil.getParameter(request, prefix
					+ "sls_rhq_cd".trim(), length));
			String[] rep_trd_cd = (JSPUtil.getParameter(request, prefix
					+ "rep_trd_cd".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new SPC_TS_ALOC_LANE();
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
				if (sls_rhq_cd[i] != null)
					model.setSls_rhq_cd(sls_rhq_cd[i]);
				if (rep_trd_cd[i] != null)
					model.setRep_trd_cd(rep_trd_cd[i]);
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