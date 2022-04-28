/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : SPC_NSHW_RFLT.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2006-12-26
*@LastModifier : 박경애
*@LastVersion : 1.0
* 2006-12-26 박경애
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

public class SPC_NSHW_RFLT implements Serializable {

	String ibflag = null;

	String page_rows = null;

	String trd_cd = null;

	String sub_trd_cd = null;

	String rlane_cd = null;

	String dir_cd = null;

	String aloc_ddct_bse_cd = null;

	String aloc_ddct_cs_cd = null;

	String aloc_ddct_tgt_cd = null;

	String aloc_ddct_mod_cd = null;

	String aloc_ddct_mod_val = null;

	String cre_usr_id = null;

	String upd_usr_id = null;

	public SPC_NSHW_RFLT() {
	}

	public SPC_NSHW_RFLT(String ibflag, String page_rows, String trd_cd, String sub_trd_cd, String rlane_cd,
			String dir_cd, String aloc_ddct_bse_cd, String aloc_ddct_cs_cd, String aloc_ddct_tgt_cd,
			String aloc_ddct_mod_cd, String aloc_ddct_mod_val, String cre_usr_id, String upd_usr_id) {
		this.ibflag = ibflag;
		this.page_rows = page_rows;
		this.trd_cd = trd_cd;
		this.sub_trd_cd = sub_trd_cd;
		this.rlane_cd = rlane_cd;
		this.dir_cd = dir_cd;
		this.aloc_ddct_bse_cd = aloc_ddct_bse_cd;
		this.aloc_ddct_cs_cd = aloc_ddct_cs_cd;
		this.aloc_ddct_tgt_cd = aloc_ddct_tgt_cd;
		this.aloc_ddct_mod_cd = aloc_ddct_mod_cd;
		this.aloc_ddct_mod_val = aloc_ddct_mod_val;
		this.cre_usr_id = cre_usr_id;
		this.upd_usr_id = upd_usr_id;
	}

	public String getIbflag() {
		return this.ibflag;
	}

	public String getPage_rows() {
		return this.page_rows;
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

	public String getAloc_ddct_bse_cd() {
		return this.aloc_ddct_bse_cd;
	}

	public String getAloc_ddct_cs_cd() {
		return this.aloc_ddct_cs_cd;
	}

	public String getAloc_ddct_tgt_cd() {
		return this.aloc_ddct_tgt_cd;
	}

	public String getAloc_ddct_mod_cd() {
		return this.aloc_ddct_mod_cd;
	}

	public String getAloc_ddct_mod_val() {
		return this.aloc_ddct_mod_val;
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

	public void setAloc_ddct_bse_cd(String aloc_ddct_bse_cd) {
		this.aloc_ddct_bse_cd = aloc_ddct_bse_cd;
		//this.b_aloc_ddct_bse_cd=true;
	}

	public void setAloc_ddct_cs_cd(String aloc_ddct_cs_cd) {
		this.aloc_ddct_cs_cd = aloc_ddct_cs_cd;
		//this.b_aloc_ddct_cs_cd=true;
	}

	public void setAloc_ddct_tgt_cd(String aloc_ddct_tgt_cd) {
		this.aloc_ddct_tgt_cd = aloc_ddct_tgt_cd;
		//this.b_aloc_ddct_tgt_cd=true;
	}

	public void setAloc_ddct_mod_cd(String aloc_ddct_mod_cd) {
		this.aloc_ddct_mod_cd = aloc_ddct_mod_cd;
		//this.b_aloc_ddct_mod_cd=true;
	}

	public void setAloc_ddct_mod_val(String aloc_ddct_mod_val) {
		this.aloc_ddct_mod_val = aloc_ddct_mod_val;
		//this.b_aloc_ddct_mod_val=true;
	}

	public void setCre_usr_id(String cre_usr_id) {
		this.cre_usr_id = cre_usr_id;
		//this.b_cre_usr_id=true;
	}

	public void setUpd_usr_id(String upd_usr_id) {
		this.upd_usr_id = upd_usr_id;
		//this.b_upd_usr_id=true;
	}

	public static SPC_NSHW_RFLT fromRequest(HttpServletRequest request) {
		String strUserId = getUserId(request);
		SPC_NSHW_RFLT model = new SPC_NSHW_RFLT();
		try {
			model.setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
			model.setPage_rows(JSPUtil.getParameter(request, "page_rows", ""));
			model.setTrd_cd(JSPUtil.getParameter(request, "trd_cd", ""));
			model.setSub_trd_cd(JSPUtil.getParameter(request, "sub_trd_cd", ""));
			model.setRlane_cd(JSPUtil.getParameter(request, "rlane_cd", ""));
			model.setDir_cd(JSPUtil.getParameter(request, "dir_cd", ""));
			model.setAloc_ddct_bse_cd(JSPUtil.getParameter(request, "aloc_ddct_bse_cd", ""));
			model.setAloc_ddct_cs_cd(JSPUtil.getParameter(request, "aloc_ddct_cs_cd", ""));
			model.setAloc_ddct_tgt_cd(JSPUtil.getParameter(request, "aloc_ddct_tgt_cd", ""));
			model.setAloc_ddct_mod_cd(JSPUtil.getParameter(request, "aloc_ddct_mod_cd", ""));
			model.setAloc_ddct_mod_val(JSPUtil.getParameter(request, "aloc_ddct_mod_val", ""));
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
		SPC_NSHW_RFLT model = null;
		Collection models = new ArrayList();
		String[] params = request.getParameterValues(prefix + "trd_cd");
		if (params == null)
			return models;
		int length = request.getParameterValues(prefix + "trd_cd").length;
		try {
			String[] ibflag = (JSPUtil.getParameter(request, prefix + "ibflag".trim(), length));
			String[] page_rows = (JSPUtil.getParameter(request, prefix + "page_rows".trim(), length));
			String[] trd_cd = (JSPUtil.getParameter(request, prefix + "trd_cd".trim(), length));
			String[] sub_trd_cd = (JSPUtil.getParameter(request, prefix + "sub_trd_cd".trim(), length));
			String[] rlane_cd = (JSPUtil.getParameter(request, prefix + "rlane_cd".trim(), length));
			String[] dir_cd = (JSPUtil.getParameter(request, prefix + "dir_cd".trim(), length));
			String[] aloc_ddct_bse_cd = (JSPUtil.getParameter(request, prefix + "aloc_ddct_bse_cd".trim(), length));
			String[] aloc_ddct_cs_cd = (JSPUtil.getParameter(request, prefix + "aloc_ddct_cs_cd".trim(), length));
			String[] aloc_ddct_tgt_cd = (JSPUtil.getParameter(request, prefix + "aloc_ddct_tgt_cd".trim(), length));
			String[] aloc_ddct_mod_cd = (JSPUtil.getParameter(request, prefix + "aloc_ddct_mod_cd".trim(), length));
			String[] aloc_ddct_mod_val = (JSPUtil.getParameter(request, prefix + "aloc_ddct_mod_val".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new SPC_NSHW_RFLT();
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (page_rows[i] != null)
					model.setPage_rows(page_rows[i]);
				if (trd_cd[i] != null)
					model.setTrd_cd(trd_cd[i]);
				if (sub_trd_cd[i] != null)
					model.setSub_trd_cd(sub_trd_cd[i]);
				if (rlane_cd[i] != null)
					model.setRlane_cd(rlane_cd[i]);
				if (dir_cd[i] != null)
					model.setDir_cd(dir_cd[i]);
				if (aloc_ddct_bse_cd[i] != null)
					model.setAloc_ddct_bse_cd(aloc_ddct_bse_cd[i]);
				if (aloc_ddct_cs_cd[i] != null)
					model.setAloc_ddct_cs_cd(aloc_ddct_cs_cd[i]);
				if (aloc_ddct_tgt_cd[i] != null)
					model.setAloc_ddct_tgt_cd(aloc_ddct_tgt_cd[i]);
				if (aloc_ddct_mod_cd[i] != null)
					model.setAloc_ddct_mod_cd(aloc_ddct_mod_cd[i]);
				if (aloc_ddct_mod_val[i] != null)
					model.setAloc_ddct_mod_val(aloc_ddct_mod_val[i]);
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