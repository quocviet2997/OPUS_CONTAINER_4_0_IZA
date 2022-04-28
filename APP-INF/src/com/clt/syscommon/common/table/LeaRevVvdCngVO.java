/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : LeaRevVvdCngVO.java
*@FileTitle : LeaRevVvdCngVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.08.06
*@LastModifier : 전재홍
*@LastVersion : 1.0
* 2009.08.06 전재홍 
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.common.table;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import com.clt.framework.component.common.AbstractValueObject;
import com.clt.framework.component.util.JSPUtil;

/**
 * Table Value Ojbect<br>
 * 관련 Event 에서 생성, 서버실행요청시 Data 전달역할을 수행하는 Value Object
 *
 * @author 전재홍
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class LeaRevVvdCngVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<LeaRevVvdCngVO> models = new ArrayList<LeaRevVvdCngVO>();
	
	/* Column Info */
	private String oldVslCd = null;
	/* Column Info */
	private String modiCsrCreFlg = null;
	/* Column Info */
	private String invSysRmk = null;
	/* Column Info */
	private String invSysId = null;
	/* Column Info */
	private String creDt = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String modiGlDt = null;
	/* Column Info */
	private String erpIfFlg = null;
	/* Column Info */
	private String newSkdVoyNo = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String csrNo = null;
	/* Column Info */
	private String modiCsrNo = null;
	/* Column Info */
	private String exeYrmon = null;
	/* Column Info */
	private String newVslCd = null;
	/* Column Info */
	private String oldRevYrmon = null;
	/* Column Info */
	private String oldSkdVoyNo = null;
	/* Column Info */
	private String newSkdDirCd = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String oldRevDirCd = null;
	/* Column Info */
	private String oldSkdDirCd = null;
	/* Column Info */
	private String newRevDirCd = null;
	/* Column Info */
	private String newRevYrmon = null;
	/* Column Info */
	private String leaIfFlg = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public LeaRevVvdCngVO() {}

	public LeaRevVvdCngVO(String ibflag, String pagerows, String exeYrmon, String csrNo, String bkgNo, String invSysId, String oldVslCd, String oldSkdVoyNo, String oldSkdDirCd, String oldRevDirCd, String newVslCd, String newSkdVoyNo, String newSkdDirCd, String newRevDirCd, String oldRevYrmon, String newRevYrmon, String modiCsrNo, String modiGlDt, String modiCsrCreFlg, String erpIfFlg, String invSysRmk, String creUsrId, String creDt, String updUsrId, String updDt, String leaIfFlg) {
		this.oldVslCd = oldVslCd;
		this.modiCsrCreFlg = modiCsrCreFlg;
		this.invSysRmk = invSysRmk;
		this.invSysId = invSysId;
		this.creDt = creDt;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.modiGlDt = modiGlDt;
		this.erpIfFlg = erpIfFlg;
		this.newSkdVoyNo = newSkdVoyNo;
		this.updUsrId = updUsrId;
		this.updDt = updDt;
		this.csrNo = csrNo;
		this.modiCsrNo = modiCsrNo;
		this.exeYrmon = exeYrmon;
		this.newVslCd = newVslCd;
		this.oldRevYrmon = oldRevYrmon;
		this.oldSkdVoyNo = oldSkdVoyNo;
		this.newSkdDirCd = newSkdDirCd;
		this.bkgNo = bkgNo;
		this.creUsrId = creUsrId;
		this.oldRevDirCd = oldRevDirCd;
		this.oldSkdDirCd = oldSkdDirCd;
		this.newRevDirCd = newRevDirCd;
		this.newRevYrmon = newRevYrmon;
		this.leaIfFlg = leaIfFlg;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("old_vsl_cd", getOldVslCd());
		this.hashColumns.put("modi_csr_cre_flg", getModiCsrCreFlg());
		this.hashColumns.put("inv_sys_rmk", getInvSysRmk());
		this.hashColumns.put("inv_sys_id", getInvSysId());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("modi_gl_dt", getModiGlDt());
		this.hashColumns.put("erp_if_flg", getErpIfFlg());
		this.hashColumns.put("new_skd_voy_no", getNewSkdVoyNo());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("csr_no", getCsrNo());
		this.hashColumns.put("modi_csr_no", getModiCsrNo());
		this.hashColumns.put("exe_yrmon", getExeYrmon());
		this.hashColumns.put("new_vsl_cd", getNewVslCd());
		this.hashColumns.put("old_rev_yrmon", getOldRevYrmon());
		this.hashColumns.put("old_skd_voy_no", getOldSkdVoyNo());
		this.hashColumns.put("new_skd_dir_cd", getNewSkdDirCd());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("old_rev_dir_cd", getOldRevDirCd());
		this.hashColumns.put("old_skd_dir_cd", getOldSkdDirCd());
		this.hashColumns.put("new_rev_dir_cd", getNewRevDirCd());
		this.hashColumns.put("new_rev_yrmon", getNewRevYrmon());
		this.hashColumns.put("lea_if_flg", getLeaIfFlg());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("old_vsl_cd", "oldVslCd");
		this.hashFields.put("modi_csr_cre_flg", "modiCsrCreFlg");
		this.hashFields.put("inv_sys_rmk", "invSysRmk");
		this.hashFields.put("inv_sys_id", "invSysId");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("modi_gl_dt", "modiGlDt");
		this.hashFields.put("erp_if_flg", "erpIfFlg");
		this.hashFields.put("new_skd_voy_no", "newSkdVoyNo");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("csr_no", "csrNo");
		this.hashFields.put("modi_csr_no", "modiCsrNo");
		this.hashFields.put("exe_yrmon", "exeYrmon");
		this.hashFields.put("new_vsl_cd", "newVslCd");
		this.hashFields.put("old_rev_yrmon", "oldRevYrmon");
		this.hashFields.put("old_skd_voy_no", "oldSkdVoyNo");
		this.hashFields.put("new_skd_dir_cd", "newSkdDirCd");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("old_rev_dir_cd", "oldRevDirCd");
		this.hashFields.put("old_skd_dir_cd", "oldSkdDirCd");
		this.hashFields.put("new_rev_dir_cd", "newRevDirCd");
		this.hashFields.put("new_rev_yrmon", "newRevYrmon");
		this.hashFields.put("lea_if_flg", "leaIfFlg");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return oldVslCd
	 */
	public String getOldVslCd() {
		return this.oldVslCd;
	}
	
	/**
	 * Column Info
	 * @return modiCsrCreFlg
	 */
	public String getModiCsrCreFlg() {
		return this.modiCsrCreFlg;
	}
	
	/**
	 * Column Info
	 * @return invSysRmk
	 */
	public String getInvSysRmk() {
		return this.invSysRmk;
	}
	
	/**
	 * Column Info
	 * @return invSysId
	 */
	public String getInvSysId() {
		return this.invSysId;
	}
	
	/**
	 * Column Info
	 * @return creDt
	 */
	public String getCreDt() {
		return this.creDt;
	}
	
	/**
	 * Page Number
	 * @return pagerows
	 */
	public String getPagerows() {
		return this.pagerows;
	}
	
	/**
	 * VO Data Value( C:Creation, U:Update, D:Delete )
	 * @return ibflag
	 */
	public String getIbflag() {
		return this.ibflag;
	}
	
	/**
	 * Column Info
	 * @return modiGlDt
	 */
	public String getModiGlDt() {
		return this.modiGlDt;
	}
	
	/**
	 * Column Info
	 * @return erpIfFlg
	 */
	public String getErpIfFlg() {
		return this.erpIfFlg;
	}
	
	/**
	 * Column Info
	 * @return newSkdVoyNo
	 */
	public String getNewSkdVoyNo() {
		return this.newSkdVoyNo;
	}
	
	/**
	 * Column Info
	 * @return updUsrId
	 */
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	
	/**
	 * Column Info
	 * @return updDt
	 */
	public String getUpdDt() {
		return this.updDt;
	}
	
	/**
	 * Column Info
	 * @return csrNo
	 */
	public String getCsrNo() {
		return this.csrNo;
	}
	
	/**
	 * Column Info
	 * @return modiCsrNo
	 */
	public String getModiCsrNo() {
		return this.modiCsrNo;
	}
	
	/**
	 * Column Info
	 * @return exeYrmon
	 */
	public String getExeYrmon() {
		return this.exeYrmon;
	}
	
	/**
	 * Column Info
	 * @return newVslCd
	 */
	public String getNewVslCd() {
		return this.newVslCd;
	}
	
	/**
	 * Column Info
	 * @return oldRevYrmon
	 */
	public String getOldRevYrmon() {
		return this.oldRevYrmon;
	}
	
	/**
	 * Column Info
	 * @return oldSkdVoyNo
	 */
	public String getOldSkdVoyNo() {
		return this.oldSkdVoyNo;
	}
	
	/**
	 * Column Info
	 * @return newSkdDirCd
	 */
	public String getNewSkdDirCd() {
		return this.newSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @return bkgNo
	 */
	public String getBkgNo() {
		return this.bkgNo;
	}
	
	/**
	 * Column Info
	 * @return creUsrId
	 */
	public String getCreUsrId() {
		return this.creUsrId;
	}
	
	/**
	 * Column Info
	 * @return oldRevDirCd
	 */
	public String getOldRevDirCd() {
		return this.oldRevDirCd;
	}
	
	/**
	 * Column Info
	 * @return oldSkdDirCd
	 */
	public String getOldSkdDirCd() {
		return this.oldSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @return newRevDirCd
	 */
	public String getNewRevDirCd() {
		return this.newRevDirCd;
	}
	
	/**
	 * Column Info
	 * @return newRevYrmon
	 */
	public String getNewRevYrmon() {
		return this.newRevYrmon;
	}
	
	/**
	 * Column Info
	 * @return leaIfFlg
	 */
	public String getLeaIfFlg() {
		return this.leaIfFlg;
	}
	

	/**
	 * Column Info
	 * @param oldVslCd
	 */
	public void setOldVslCd(String oldVslCd) {
		this.oldVslCd = oldVslCd;
	}
	
	/**
	 * Column Info
	 * @param modiCsrCreFlg
	 */
	public void setModiCsrCreFlg(String modiCsrCreFlg) {
		this.modiCsrCreFlg = modiCsrCreFlg;
	}
	
	/**
	 * Column Info
	 * @param invSysRmk
	 */
	public void setInvSysRmk(String invSysRmk) {
		this.invSysRmk = invSysRmk;
	}
	
	/**
	 * Column Info
	 * @param invSysId
	 */
	public void setInvSysId(String invSysId) {
		this.invSysId = invSysId;
	}
	
	/**
	 * Column Info
	 * @param creDt
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
	}
	
	/**
	 * Page Number
	 * @param pagerows
	 */
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
	}
	
	/**
	 * VO Data Value( C:Creation, U:Update, D:Delete )
	 * @param ibflag
	 */
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
	}
	
	/**
	 * Column Info
	 * @param modiGlDt
	 */
	public void setModiGlDt(String modiGlDt) {
		this.modiGlDt = modiGlDt;
	}
	
	/**
	 * Column Info
	 * @param erpIfFlg
	 */
	public void setErpIfFlg(String erpIfFlg) {
		this.erpIfFlg = erpIfFlg;
	}
	
	/**
	 * Column Info
	 * @param newSkdVoyNo
	 */
	public void setNewSkdVoyNo(String newSkdVoyNo) {
		this.newSkdVoyNo = newSkdVoyNo;
	}
	
	/**
	 * Column Info
	 * @param updUsrId
	 */
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
	}
	
	/**
	 * Column Info
	 * @param updDt
	 */
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
	}
	
	/**
	 * Column Info
	 * @param csrNo
	 */
	public void setCsrNo(String csrNo) {
		this.csrNo = csrNo;
	}
	
	/**
	 * Column Info
	 * @param modiCsrNo
	 */
	public void setModiCsrNo(String modiCsrNo) {
		this.modiCsrNo = modiCsrNo;
	}
	
	/**
	 * Column Info
	 * @param exeYrmon
	 */
	public void setExeYrmon(String exeYrmon) {
		this.exeYrmon = exeYrmon;
	}
	
	/**
	 * Column Info
	 * @param newVslCd
	 */
	public void setNewVslCd(String newVslCd) {
		this.newVslCd = newVslCd;
	}
	
	/**
	 * Column Info
	 * @param oldRevYrmon
	 */
	public void setOldRevYrmon(String oldRevYrmon) {
		this.oldRevYrmon = oldRevYrmon;
	}
	
	/**
	 * Column Info
	 * @param oldSkdVoyNo
	 */
	public void setOldSkdVoyNo(String oldSkdVoyNo) {
		this.oldSkdVoyNo = oldSkdVoyNo;
	}
	
	/**
	 * Column Info
	 * @param newSkdDirCd
	 */
	public void setNewSkdDirCd(String newSkdDirCd) {
		this.newSkdDirCd = newSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @param bkgNo
	 */
	public void setBkgNo(String bkgNo) {
		this.bkgNo = bkgNo;
	}
	
	/**
	 * Column Info
	 * @param creUsrId
	 */
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
	}
	
	/**
	 * Column Info
	 * @param oldRevDirCd
	 */
	public void setOldRevDirCd(String oldRevDirCd) {
		this.oldRevDirCd = oldRevDirCd;
	}
	
	/**
	 * Column Info
	 * @param oldSkdDirCd
	 */
	public void setOldSkdDirCd(String oldSkdDirCd) {
		this.oldSkdDirCd = oldSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @param newRevDirCd
	 */
	public void setNewRevDirCd(String newRevDirCd) {
		this.newRevDirCd = newRevDirCd;
	}
	
	/**
	 * Column Info
	 * @param newRevYrmon
	 */
	public void setNewRevYrmon(String newRevYrmon) {
		this.newRevYrmon = newRevYrmon;
	}
	
	/**
	 * Column Info
	 * @param leaIfFlg
	 */
	public void setLeaIfFlg(String leaIfFlg) {
		this.leaIfFlg = leaIfFlg;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setOldVslCd(JSPUtil.getParameter(request, "old_vsl_cd", ""));
		setModiCsrCreFlg(JSPUtil.getParameter(request, "modi_csr_cre_flg", ""));
		setInvSysRmk(JSPUtil.getParameter(request, "inv_sys_rmk", ""));
		setInvSysId(JSPUtil.getParameter(request, "inv_sys_id", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setModiGlDt(JSPUtil.getParameter(request, "modi_gl_dt", ""));
		setErpIfFlg(JSPUtil.getParameter(request, "erp_if_flg", ""));
		setNewSkdVoyNo(JSPUtil.getParameter(request, "new_skd_voy_no", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCsrNo(JSPUtil.getParameter(request, "csr_no", ""));
		setModiCsrNo(JSPUtil.getParameter(request, "modi_csr_no", ""));
		setExeYrmon(JSPUtil.getParameter(request, "exe_yrmon", ""));
		setNewVslCd(JSPUtil.getParameter(request, "new_vsl_cd", ""));
		setOldRevYrmon(JSPUtil.getParameter(request, "old_rev_yrmon", ""));
		setOldSkdVoyNo(JSPUtil.getParameter(request, "old_skd_voy_no", ""));
		setNewSkdDirCd(JSPUtil.getParameter(request, "new_skd_dir_cd", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setOldRevDirCd(JSPUtil.getParameter(request, "old_rev_dir_cd", ""));
		setOldSkdDirCd(JSPUtil.getParameter(request, "old_skd_dir_cd", ""));
		setNewRevDirCd(JSPUtil.getParameter(request, "new_rev_dir_cd", ""));
		setNewRevYrmon(JSPUtil.getParameter(request, "new_rev_yrmon", ""));
		setLeaIfFlg(JSPUtil.getParameter(request, "lea_if_flg", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return LeaRevVvdCngVO[]
	 */
	public LeaRevVvdCngVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return LeaRevVvdCngVO[]
	 */
	public LeaRevVvdCngVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		LeaRevVvdCngVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] oldVslCd = (JSPUtil.getParameter(request, prefix	+ "old_vsl_cd", length));
			String[] modiCsrCreFlg = (JSPUtil.getParameter(request, prefix	+ "modi_csr_cre_flg", length));
			String[] invSysRmk = (JSPUtil.getParameter(request, prefix	+ "inv_sys_rmk", length));
			String[] invSysId = (JSPUtil.getParameter(request, prefix	+ "inv_sys_id", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] modiGlDt = (JSPUtil.getParameter(request, prefix	+ "modi_gl_dt", length));
			String[] erpIfFlg = (JSPUtil.getParameter(request, prefix	+ "erp_if_flg", length));
			String[] newSkdVoyNo = (JSPUtil.getParameter(request, prefix	+ "new_skd_voy_no", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] csrNo = (JSPUtil.getParameter(request, prefix	+ "csr_no", length));
			String[] modiCsrNo = (JSPUtil.getParameter(request, prefix	+ "modi_csr_no", length));
			String[] exeYrmon = (JSPUtil.getParameter(request, prefix	+ "exe_yrmon", length));
			String[] newVslCd = (JSPUtil.getParameter(request, prefix	+ "new_vsl_cd", length));
			String[] oldRevYrmon = (JSPUtil.getParameter(request, prefix	+ "old_rev_yrmon", length));
			String[] oldSkdVoyNo = (JSPUtil.getParameter(request, prefix	+ "old_skd_voy_no", length));
			String[] newSkdDirCd = (JSPUtil.getParameter(request, prefix	+ "new_skd_dir_cd", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] oldRevDirCd = (JSPUtil.getParameter(request, prefix	+ "old_rev_dir_cd", length));
			String[] oldSkdDirCd = (JSPUtil.getParameter(request, prefix	+ "old_skd_dir_cd", length));
			String[] newRevDirCd = (JSPUtil.getParameter(request, prefix	+ "new_rev_dir_cd", length));
			String[] newRevYrmon = (JSPUtil.getParameter(request, prefix	+ "new_rev_yrmon", length));
			String[] leaIfFlg = (JSPUtil.getParameter(request, prefix	+ "lea_if_flg", length));
			
			for (int i = 0; i < length; i++) {
				model = new LeaRevVvdCngVO();
				if (oldVslCd[i] != null)
					model.setOldVslCd(oldVslCd[i]);
				if (modiCsrCreFlg[i] != null)
					model.setModiCsrCreFlg(modiCsrCreFlg[i]);
				if (invSysRmk[i] != null)
					model.setInvSysRmk(invSysRmk[i]);
				if (invSysId[i] != null)
					model.setInvSysId(invSysId[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (modiGlDt[i] != null)
					model.setModiGlDt(modiGlDt[i]);
				if (erpIfFlg[i] != null)
					model.setErpIfFlg(erpIfFlg[i]);
				if (newSkdVoyNo[i] != null)
					model.setNewSkdVoyNo(newSkdVoyNo[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (csrNo[i] != null)
					model.setCsrNo(csrNo[i]);
				if (modiCsrNo[i] != null)
					model.setModiCsrNo(modiCsrNo[i]);
				if (exeYrmon[i] != null)
					model.setExeYrmon(exeYrmon[i]);
				if (newVslCd[i] != null)
					model.setNewVslCd(newVslCd[i]);
				if (oldRevYrmon[i] != null)
					model.setOldRevYrmon(oldRevYrmon[i]);
				if (oldSkdVoyNo[i] != null)
					model.setOldSkdVoyNo(oldSkdVoyNo[i]);
				if (newSkdDirCd[i] != null)
					model.setNewSkdDirCd(newSkdDirCd[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (oldRevDirCd[i] != null)
					model.setOldRevDirCd(oldRevDirCd[i]);
				if (oldSkdDirCd[i] != null)
					model.setOldSkdDirCd(oldSkdDirCd[i]);
				if (newRevDirCd[i] != null)
					model.setNewRevDirCd(newRevDirCd[i]);
				if (newRevYrmon[i] != null)
					model.setNewRevYrmon(newRevYrmon[i]);
				if (leaIfFlg[i] != null)
					model.setLeaIfFlg(leaIfFlg[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getLeaRevVvdCngVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return LeaRevVvdCngVO[]
	 */
	public LeaRevVvdCngVO[] getLeaRevVvdCngVOs(){
		LeaRevVvdCngVO[] vos = (LeaRevVvdCngVO[])models.toArray(new LeaRevVvdCngVO[models.size()]);
		return vos;
	}
	
	/**
	 * VO Class의 내용을 String으로 변환
	 */
	public String toString() {
		StringBuffer ret = new StringBuffer();
		Field[] field = this.getClass().getDeclaredFields();
		String space = "";
		try{
			for(int i = 0; i < field.length; i++){
				String[] arr = null;
				arr = getField(field, i);
				if(arr != null){
					for(int j = 0; j < arr.length; j++) {
						ret.append(field[i].getName().concat(space).substring(0, 30).concat("= ") + arr[j] + "\n");
					}
				} else {
					ret.append(field[i].getName() + " =  null \n");
				}
			}
		} catch (Exception ex) {
			return null;
		}
		return ret.toString();
	}
	
	/**
	 * 필드에 있는 값을 스트링 배열로 반환.
	 * @param field
	 * @param i
	 * @return String[]
	 */
	private String[] getField(Field[] field, int i) {
		String[] arr = null;
		try{
			arr = (String[]) field[i].get(this);
		}catch(Exception ex){
			arr = null;
		}
		return arr;
	}

	/**
	* 포맷팅된 문자열에서 특수문자 제거("-","/",",",":")
	*/
	public void unDataFormat(){
		this.oldVslCd = this.oldVslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.modiCsrCreFlg = this.modiCsrCreFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invSysRmk = this.invSysRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invSysId = this.invSysId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.modiGlDt = this.modiGlDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.erpIfFlg = this.erpIfFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.newSkdVoyNo = this.newSkdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.csrNo = this.csrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.modiCsrNo = this.modiCsrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.exeYrmon = this.exeYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.newVslCd = this.newVslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.oldRevYrmon = this.oldRevYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.oldSkdVoyNo = this.oldSkdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.newSkdDirCd = this.newSkdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.oldRevDirCd = this.oldRevDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.oldSkdDirCd = this.oldSkdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.newRevDirCd = this.newRevDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.newRevYrmon = this.newRevYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.leaIfFlg = this.leaIfFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
