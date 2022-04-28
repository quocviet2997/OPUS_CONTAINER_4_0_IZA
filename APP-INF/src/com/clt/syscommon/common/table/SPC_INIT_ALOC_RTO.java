/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : SPC_INIT_ALOC_RTO.java
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
 * Table Value Ojbect<br>
 * - PDTO(Data Transfer Object including Parameters)<br>
 * - 관련 Event에서 작성, 서버실행요청시 PDTO의 역할을 수행하는 Value Object<br>
 *
 * @author 김원섭
 * @since J2EE 1.4
 */

public class SPC_INIT_ALOC_RTO implements Serializable {

	String ibflag = null;

	boolean b_ibflag = false;

	String page_rows = null;

	boolean b_page_rows = false;

	String rep_trd_cd = null;

	boolean b_rep_trd_cd = false;

	String dir_cd = null;

	boolean b_dir_cd = false;

	String bse_mon = null;

	boolean b_bse_mon = false;

	String init_aloc_rto = null;

	boolean b_init_aloc_rto = false;

	String cre_usr_id = null;

	boolean b_cre_usr_id = false;

	String upd_usr_id = null;

	boolean b_upd_usr_id = false;

	String[][] columns = { { "rep_trd_cd", "PK" }, { "dir_cd", "PK" },
			{ "bse_mon", "PK" }, { "init_aloc_rto", "" } };

	public SPC_INIT_ALOC_RTO() {
	}

	public SPC_INIT_ALOC_RTO(String ibflag, String page_rows,
			String rep_trd_cd, String dir_cd, String bse_mon,
			String init_aloc_rto, String cre_usr_id, String upd_usr_id) {
		this.ibflag = ibflag;
		this.page_rows = page_rows;
		this.rep_trd_cd = rep_trd_cd;
		this.dir_cd = dir_cd;
		this.bse_mon = bse_mon;
		this.init_aloc_rto = init_aloc_rto;
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

	public String getRep_trd_cd() {
		return this.rep_trd_cd;
	}

	public boolean getRep_trd_cdStatus() {
		return this.b_rep_trd_cd;
	}

	public String getDir_cd() {
		return this.dir_cd;
	}

	public boolean getDir_cdStatus() {
		return this.b_dir_cd;
	}

	public String getBse_mon() {
		return this.bse_mon;
	}

	public boolean getBse_monStatus() {
		return this.b_bse_mon;
	}

	public String getInit_aloc_rto() {
		return this.init_aloc_rto;
	}

	public boolean getInit_aloc_rtoStatus() {
		return this.b_init_aloc_rto;
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

	public void setRep_trd_cd(String rep_trd_cd) {
		this.rep_trd_cd = rep_trd_cd;
		this.b_rep_trd_cd = true;
	}

	public void setDir_cd(String dir_cd) {
		this.dir_cd = dir_cd;
		this.b_dir_cd = true;
	}

	public void setBse_mon(String bse_mon) {
		this.bse_mon = bse_mon;
		this.b_bse_mon = true;
	}

	public void setInit_aloc_rto(String init_aloc_rto) {
		this.init_aloc_rto = init_aloc_rto;
		this.b_init_aloc_rto = true;
	}

	public void setCre_usr_id(String cre_usr_id) {
		this.cre_usr_id = cre_usr_id;
		this.b_cre_usr_id = true;
	}

	public void setUpd_usr_id(String upd_usr_id) {
		this.upd_usr_id = upd_usr_id;
		this.b_upd_usr_id = true;
	}

	public static SPC_INIT_ALOC_RTO fromRequest(HttpServletRequest request) {
		String strUserId = getUserId(request);
		SPC_INIT_ALOC_RTO model = new SPC_INIT_ALOC_RTO();
		try {
			model.setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
			model.setPage_rows(JSPUtil.getParameter(request, "page_rows", ""));
			model
					.setRep_trd_cd(JSPUtil.getParameter(request, "rep_trd_cd",
							""));
			model.setDir_cd(JSPUtil.getParameter(request, "dir_cd", ""));
			model.setBse_mon(JSPUtil.getParameter(request, "bse_mon", ""));
			model.setInit_aloc_rto(JSPUtil.getParameter(request,
					"init_aloc_rto", ""));
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
		SPC_INIT_ALOC_RTO model = null;
		Collection models = new ArrayList();
		String[] params = request.getParameterValues(prefix + "rep_trd_cd");
		if (params == null)
			return models;
		int length = request.getParameterValues(prefix + "rep_trd_cd").length;
		try {
			String[] ibflag = (JSPUtil.getParameter(request, prefix
					+ "ibflag".trim(), length));
			String[] page_rows = (JSPUtil.getParameter(request, prefix
					+ "page_rows".trim(), length));
			String[] rep_trd_cd = (JSPUtil.getParameter(request, prefix
					+ "rep_trd_cd".trim(), length));
			String[] dir_cd = (JSPUtil.getParameter(request, prefix
					+ "dir_cd".trim(), length));
			String[] bse_mon = (JSPUtil.getParameter(request, prefix
					+ "bse_mon".trim(), length));
			String[] init_aloc_rto = (JSPUtil.getParameter(request, prefix
					+ "init_aloc_rto".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new SPC_INIT_ALOC_RTO();
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (page_rows[i] != null)
					model.setPage_rows(page_rows[i]);
				if (rep_trd_cd[i] != null)
					model.setRep_trd_cd(rep_trd_cd[i]);
				if (dir_cd[i] != null)
					model.setDir_cd(dir_cd[i]);
				if (bse_mon[i] != null)
					model.setBse_mon(bse_mon[i]);
				if (init_aloc_rto[i] != null)
					model.setInit_aloc_rto(init_aloc_rto[i]);
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