/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : SPC_COM_PPT.java
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

public class SPC_COM_PPT implements Serializable {

	String ibflag = null;

	boolean b_ibflag = false;

	String page_rows = null;

	boolean b_page_rows = false;

	String aloc_ppt_cd = null;

	boolean b_aloc_ppt_cd = false;

	String aloc_ppt_desc = null;

	boolean b_aloc_ppt_desc = false;

	String aloc_ppt_ctnt = null;

	boolean b_aloc_ppt_ctnt = false;

	String cre_usr_id = null;

	boolean b_cre_usr_id = false;

	String upd_usr_id = null;

	boolean b_upd_usr_id = false;

	String[][] columns = { { "aloc_ppt_cd", "PK" }, { "aloc_ppt_desc", "" },
			{ "aloc_ppt_ctnt", "" } };

	public SPC_COM_PPT() {
	}

	public SPC_COM_PPT(String ibflag, String page_rows, String aloc_ppt_cd,
			String aloc_ppt_desc, String aloc_ppt_ctnt, String cre_usr_id,
			String upd_usr_id) {
		this.ibflag = ibflag;
		this.page_rows = page_rows;
		this.aloc_ppt_cd = aloc_ppt_cd;
		this.aloc_ppt_desc = aloc_ppt_desc;
		this.aloc_ppt_ctnt = aloc_ppt_ctnt;
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

	public String getAloc_ppt_cd() {
		return this.aloc_ppt_cd;
	}

	public boolean getAloc_ppt_cdStatus() {
		return this.b_aloc_ppt_cd;
	}

	public String getAloc_ppt_desc() {
		return this.aloc_ppt_desc;
	}

	public boolean getAloc_ppt_descStatus() {
		return this.b_aloc_ppt_desc;
	}

	public String getAloc_ppt_ctnt() {
		return this.aloc_ppt_ctnt;
	}

	public boolean getAloc_ppt_ctntStatus() {
		return this.b_aloc_ppt_ctnt;
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

	public void setAloc_ppt_cd(String aloc_ppt_cd) {
		this.aloc_ppt_cd = aloc_ppt_cd;
		this.b_aloc_ppt_cd = true;
	}

	public void setAloc_ppt_desc(String aloc_ppt_desc) {
		this.aloc_ppt_desc = aloc_ppt_desc;
		this.b_aloc_ppt_desc = true;
	}

	public void setAloc_ppt_ctnt(String aloc_ppt_ctnt) {
		this.aloc_ppt_ctnt = aloc_ppt_ctnt;
		this.b_aloc_ppt_ctnt = true;
	}

	public void setCre_usr_id(String cre_usr_id) {
		this.cre_usr_id = cre_usr_id;
		this.b_cre_usr_id = true;
	}

	public void setUpd_usr_id(String upd_usr_id) {
		this.upd_usr_id = upd_usr_id;
		this.b_upd_usr_id = true;
	}

	public static SPC_COM_PPT fromRequest(HttpServletRequest request) {
		String strUserId = getUserId(request);
		SPC_COM_PPT model = new SPC_COM_PPT();
		try {
			model.setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
			model.setPage_rows(JSPUtil.getParameter(request, "page_rows", ""));
			model.setAloc_ppt_cd(JSPUtil.getParameter(request, "aloc_ppt_cd",
					""));
			model.setAloc_ppt_desc(JSPUtil.getParameter(request,
					"aloc_ppt_desc", ""));
			model.setAloc_ppt_ctnt(JSPUtil.getParameter(request,
					"aloc_ppt_ctnt", ""));
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
		SPC_COM_PPT model = null;
		Collection models = new ArrayList();
		String[] params = request.getParameterValues(prefix + "aloc_ppt_cd");
		if (params == null)
			return models;
		int length = request.getParameterValues(prefix + "aloc_ppt_cd").length;
		try {
			String[] ibflag = (JSPUtil.getParameter(request, prefix
					+ "ibflag".trim(), length));
			String[] page_rows = (JSPUtil.getParameter(request, prefix
					+ "page_rows".trim(), length));
			String[] aloc_ppt_cd = (JSPUtil.getParameter(request, prefix
					+ "aloc_ppt_cd".trim(), length));
			String[] aloc_ppt_desc = (JSPUtil.getParameter(request, prefix
					+ "aloc_ppt_desc".trim(), length));
			String[] aloc_ppt_ctnt = (JSPUtil.getParameter(request, prefix
					+ "aloc_ppt_ctnt".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new SPC_COM_PPT();
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (page_rows[i] != null)
					model.setPage_rows(page_rows[i]);
				if (aloc_ppt_cd[i] != null)
					model.setAloc_ppt_cd(aloc_ppt_cd[i]);
				if (aloc_ppt_desc[i] != null)
					model.setAloc_ppt_desc(aloc_ppt_desc[i]);
				if (aloc_ppt_ctnt[i] != null)
					model.setAloc_ppt_ctnt(aloc_ppt_ctnt[i]);
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