/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : InvArAmtVO.java
*@FileTitle : InvArAmtVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.10.28
*@LastModifier : 최도순
*@LastVersion : 1.0
* 2009.10.28 최도순 
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.common.table;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.clt.framework.component.common.AbstractValueObject;
import com.clt.framework.component.util.JSPUtil;

/**
 * Table Value Ojbect<br>
 * 관련 Event 에서 생성, 서버실행요청시 Data 전달역할을 수행하는 Value Object
 *
 * @author 최도순
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class InvArAmtVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<InvArAmtVO> models = new ArrayList<InvArAmtVO>();
	
	/* Column Info */
	private String currCd = null;
	/* Column Info */
	private String invCoaRevDirCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String tjSrcNm = null;
	/* Column Info */
	private String invCoaCoCd = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String invCoaAcctCd = null;
	/* Column Info */
	private String erpIfOfcCd = null;
	/* Column Info */
	private String arIfNo = null;
	/* Column Info */
	private String invAmt = null;
	/* Column Info */
	private String invCoaRgnCd = null;
	/* Column Info */
	private String invCoaInterCoCd = null;
	/* Column Info */
	private String invCoaVoyNo = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String invCoaVslCd = null;
	/* Column Info */
	private String arInvSrcCd = null;
	/* Column Info */
	private String invCoaSkdDirCd = null;
	/* Column Info */
	private String invCoaCtrCd = null;
	/* Column Info */
	private String invErpIfStsCd = null;
	/* Column Info */
	private String erpIfDt = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String errDesc = null;
	/* Column Info */
	private String erpIfGlDt = null;
	/* Column Info */
	private String arIfSerNo = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public InvArAmtVO() {}

	public InvArAmtVO(String ibflag, String pagerows, String arIfNo, String arIfSerNo, String tjSrcNm, String currCd, String invAmt, String invErpIfStsCd, String erpIfDt, String creUsrId, String creDt, String updUsrId, String updDt, String errDesc, String arInvSrcCd, String invCoaCoCd, String invCoaRgnCd, String invCoaCtrCd, String invCoaAcctCd, String invCoaInterCoCd, String invCoaVslCd, String invCoaVoyNo, String invCoaSkdDirCd, String invCoaRevDirCd, String erpIfGlDt, String erpIfOfcCd) {
		this.currCd = currCd;
		this.invCoaRevDirCd = invCoaRevDirCd;
		this.creDt = creDt;
		this.tjSrcNm = tjSrcNm;
		this.invCoaCoCd = invCoaCoCd;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.invCoaAcctCd = invCoaAcctCd;
		this.erpIfOfcCd = erpIfOfcCd;
		this.arIfNo = arIfNo;
		this.invAmt = invAmt;
		this.invCoaRgnCd = invCoaRgnCd;
		this.invCoaInterCoCd = invCoaInterCoCd;
		this.invCoaVoyNo = invCoaVoyNo;
		this.updUsrId = updUsrId;
		this.updDt = updDt;
		this.invCoaVslCd = invCoaVslCd;
		this.arInvSrcCd = arInvSrcCd;
		this.invCoaSkdDirCd = invCoaSkdDirCd;
		this.invCoaCtrCd = invCoaCtrCd;
		this.invErpIfStsCd = invErpIfStsCd;
		this.erpIfDt = erpIfDt;
		this.creUsrId = creUsrId;
		this.errDesc = errDesc;
		this.erpIfGlDt = erpIfGlDt;
		this.arIfSerNo = arIfSerNo;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("curr_cd", getCurrCd());
		this.hashColumns.put("inv_coa_rev_dir_cd", getInvCoaRevDirCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("tj_src_nm", getTjSrcNm());
		this.hashColumns.put("inv_coa_co_cd", getInvCoaCoCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("inv_coa_acct_cd", getInvCoaAcctCd());
		this.hashColumns.put("erp_if_ofc_cd", getErpIfOfcCd());
		this.hashColumns.put("ar_if_no", getArIfNo());
		this.hashColumns.put("inv_amt", getInvAmt());
		this.hashColumns.put("inv_coa_rgn_cd", getInvCoaRgnCd());
		this.hashColumns.put("inv_coa_inter_co_cd", getInvCoaInterCoCd());
		this.hashColumns.put("inv_coa_voy_no", getInvCoaVoyNo());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("inv_coa_vsl_cd", getInvCoaVslCd());
		this.hashColumns.put("ar_inv_src_cd", getArInvSrcCd());
		this.hashColumns.put("inv_coa_skd_dir_cd", getInvCoaSkdDirCd());
		this.hashColumns.put("inv_coa_ctr_cd", getInvCoaCtrCd());
		this.hashColumns.put("inv_erp_if_sts_cd", getInvErpIfStsCd());
		this.hashColumns.put("erp_if_dt", getErpIfDt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("err_desc", getErrDesc());
		this.hashColumns.put("erp_if_gl_dt", getErpIfGlDt());
		this.hashColumns.put("ar_if_ser_no", getArIfSerNo());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("curr_cd", "currCd");
		this.hashFields.put("inv_coa_rev_dir_cd", "invCoaRevDirCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("tj_src_nm", "tjSrcNm");
		this.hashFields.put("inv_coa_co_cd", "invCoaCoCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("inv_coa_acct_cd", "invCoaAcctCd");
		this.hashFields.put("erp_if_ofc_cd", "erpIfOfcCd");
		this.hashFields.put("ar_if_no", "arIfNo");
		this.hashFields.put("inv_amt", "invAmt");
		this.hashFields.put("inv_coa_rgn_cd", "invCoaRgnCd");
		this.hashFields.put("inv_coa_inter_co_cd", "invCoaInterCoCd");
		this.hashFields.put("inv_coa_voy_no", "invCoaVoyNo");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("inv_coa_vsl_cd", "invCoaVslCd");
		this.hashFields.put("ar_inv_src_cd", "arInvSrcCd");
		this.hashFields.put("inv_coa_skd_dir_cd", "invCoaSkdDirCd");
		this.hashFields.put("inv_coa_ctr_cd", "invCoaCtrCd");
		this.hashFields.put("inv_erp_if_sts_cd", "invErpIfStsCd");
		this.hashFields.put("erp_if_dt", "erpIfDt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("err_desc", "errDesc");
		this.hashFields.put("erp_if_gl_dt", "erpIfGlDt");
		this.hashFields.put("ar_if_ser_no", "arIfSerNo");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return currCd
	 */
	public String getCurrCd() {
		return this.currCd;
	}
	
	/**
	 * Column Info
	 * @return invCoaRevDirCd
	 */
	public String getInvCoaRevDirCd() {
		return this.invCoaRevDirCd;
	}
	
	/**
	 * Column Info
	 * @return creDt
	 */
	public String getCreDt() {
		return this.creDt;
	}
	
	/**
	 * Column Info
	 * @return tjSrcNm
	 */
	public String getTjSrcNm() {
		return this.tjSrcNm;
	}
	
	/**
	 * Column Info
	 * @return invCoaCoCd
	 */
	public String getInvCoaCoCd() {
		return this.invCoaCoCd;
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
	 * @return invCoaAcctCd
	 */
	public String getInvCoaAcctCd() {
		return this.invCoaAcctCd;
	}
	
	/**
	 * Column Info
	 * @return erpIfOfcCd
	 */
	public String getErpIfOfcCd() {
		return this.erpIfOfcCd;
	}
	
	/**
	 * Column Info
	 * @return arIfNo
	 */
	public String getArIfNo() {
		return this.arIfNo;
	}
	
	/**
	 * Column Info
	 * @return invAmt
	 */
	public String getInvAmt() {
		return this.invAmt;
	}
	
	/**
	 * Column Info
	 * @return invCoaRgnCd
	 */
	public String getInvCoaRgnCd() {
		return this.invCoaRgnCd;
	}
	
	/**
	 * Column Info
	 * @return invCoaInterCoCd
	 */
	public String getInvCoaInterCoCd() {
		return this.invCoaInterCoCd;
	}
	
	/**
	 * Column Info
	 * @return invCoaVoyNo
	 */
	public String getInvCoaVoyNo() {
		return this.invCoaVoyNo;
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
	 * @return invCoaVslCd
	 */
	public String getInvCoaVslCd() {
		return this.invCoaVslCd;
	}
	
	/**
	 * Column Info
	 * @return arInvSrcCd
	 */
	public String getArInvSrcCd() {
		return this.arInvSrcCd;
	}
	
	/**
	 * Column Info
	 * @return invCoaSkdDirCd
	 */
	public String getInvCoaSkdDirCd() {
		return this.invCoaSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @return invCoaCtrCd
	 */
	public String getInvCoaCtrCd() {
		return this.invCoaCtrCd;
	}
	
	/**
	 * Column Info
	 * @return invErpIfStsCd
	 */
	public String getInvErpIfStsCd() {
		return this.invErpIfStsCd;
	}
	
	/**
	 * Column Info
	 * @return erpIfDt
	 */
	public String getErpIfDt() {
		return this.erpIfDt;
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
	 * @return errDesc
	 */
	public String getErrDesc() {
		return this.errDesc;
	}
	
	/**
	 * Column Info
	 * @return erpIfGlDt
	 */
	public String getErpIfGlDt() {
		return this.erpIfGlDt;
	}
	
	/**
	 * Column Info
	 * @return arIfSerNo
	 */
	public String getArIfSerNo() {
		return this.arIfSerNo;
	}
	

	/**
	 * Column Info
	 * @param currCd
	 */
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	
	/**
	 * Column Info
	 * @param invCoaRevDirCd
	 */
	public void setInvCoaRevDirCd(String invCoaRevDirCd) {
		this.invCoaRevDirCd = invCoaRevDirCd;
	}
	
	/**
	 * Column Info
	 * @param creDt
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
	}
	
	/**
	 * Column Info
	 * @param tjSrcNm
	 */
	public void setTjSrcNm(String tjSrcNm) {
		this.tjSrcNm = tjSrcNm;
	}
	
	/**
	 * Column Info
	 * @param invCoaCoCd
	 */
	public void setInvCoaCoCd(String invCoaCoCd) {
		this.invCoaCoCd = invCoaCoCd;
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
	 * @param invCoaAcctCd
	 */
	public void setInvCoaAcctCd(String invCoaAcctCd) {
		this.invCoaAcctCd = invCoaAcctCd;
	}
	
	/**
	 * Column Info
	 * @param erpIfOfcCd
	 */
	public void setErpIfOfcCd(String erpIfOfcCd) {
		this.erpIfOfcCd = erpIfOfcCd;
	}
	
	/**
	 * Column Info
	 * @param arIfNo
	 */
	public void setArIfNo(String arIfNo) {
		this.arIfNo = arIfNo;
	}
	
	/**
	 * Column Info
	 * @param invAmt
	 */
	public void setInvAmt(String invAmt) {
		this.invAmt = invAmt;
	}
	
	/**
	 * Column Info
	 * @param invCoaRgnCd
	 */
	public void setInvCoaRgnCd(String invCoaRgnCd) {
		this.invCoaRgnCd = invCoaRgnCd;
	}
	
	/**
	 * Column Info
	 * @param invCoaInterCoCd
	 */
	public void setInvCoaInterCoCd(String invCoaInterCoCd) {
		this.invCoaInterCoCd = invCoaInterCoCd;
	}
	
	/**
	 * Column Info
	 * @param invCoaVoyNo
	 */
	public void setInvCoaVoyNo(String invCoaVoyNo) {
		this.invCoaVoyNo = invCoaVoyNo;
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
	 * @param invCoaVslCd
	 */
	public void setInvCoaVslCd(String invCoaVslCd) {
		this.invCoaVslCd = invCoaVslCd;
	}
	
	/**
	 * Column Info
	 * @param arInvSrcCd
	 */
	public void setArInvSrcCd(String arInvSrcCd) {
		this.arInvSrcCd = arInvSrcCd;
	}
	
	/**
	 * Column Info
	 * @param invCoaSkdDirCd
	 */
	public void setInvCoaSkdDirCd(String invCoaSkdDirCd) {
		this.invCoaSkdDirCd = invCoaSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @param invCoaCtrCd
	 */
	public void setInvCoaCtrCd(String invCoaCtrCd) {
		this.invCoaCtrCd = invCoaCtrCd;
	}
	
	/**
	 * Column Info
	 * @param invErpIfStsCd
	 */
	public void setInvErpIfStsCd(String invErpIfStsCd) {
		this.invErpIfStsCd = invErpIfStsCd;
	}
	
	/**
	 * Column Info
	 * @param erpIfDt
	 */
	public void setErpIfDt(String erpIfDt) {
		this.erpIfDt = erpIfDt;
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
	 * @param errDesc
	 */
	public void setErrDesc(String errDesc) {
		this.errDesc = errDesc;
	}
	
	/**
	 * Column Info
	 * @param erpIfGlDt
	 */
	public void setErpIfGlDt(String erpIfGlDt) {
		this.erpIfGlDt = erpIfGlDt;
	}
	
	/**
	 * Column Info
	 * @param arIfSerNo
	 */
	public void setArIfSerNo(String arIfSerNo) {
		this.arIfSerNo = arIfSerNo;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setCurrCd(JSPUtil.getParameter(request, "curr_cd", ""));
		setInvCoaRevDirCd(JSPUtil.getParameter(request, "inv_coa_rev_dir_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setTjSrcNm(JSPUtil.getParameter(request, "tj_src_nm", ""));
		setInvCoaCoCd(JSPUtil.getParameter(request, "inv_coa_co_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setInvCoaAcctCd(JSPUtil.getParameter(request, "inv_coa_acct_cd", ""));
		setErpIfOfcCd(JSPUtil.getParameter(request, "erp_if_ofc_cd", ""));
		setArIfNo(JSPUtil.getParameter(request, "ar_if_no", ""));
		setInvAmt(JSPUtil.getParameter(request, "inv_amt", ""));
		setInvCoaRgnCd(JSPUtil.getParameter(request, "inv_coa_rgn_cd", ""));
		setInvCoaInterCoCd(JSPUtil.getParameter(request, "inv_coa_inter_co_cd", ""));
		setInvCoaVoyNo(JSPUtil.getParameter(request, "inv_coa_voy_no", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setInvCoaVslCd(JSPUtil.getParameter(request, "inv_coa_vsl_cd", ""));
		setArInvSrcCd(JSPUtil.getParameter(request, "ar_inv_src_cd", ""));
		setInvCoaSkdDirCd(JSPUtil.getParameter(request, "inv_coa_skd_dir_cd", ""));
		setInvCoaCtrCd(JSPUtil.getParameter(request, "inv_coa_ctr_cd", ""));
		setInvErpIfStsCd(JSPUtil.getParameter(request, "inv_erp_if_sts_cd", ""));
		setErpIfDt(JSPUtil.getParameter(request, "erp_if_dt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setErrDesc(JSPUtil.getParameter(request, "err_desc", ""));
		setErpIfGlDt(JSPUtil.getParameter(request, "erp_if_gl_dt", ""));
		setArIfSerNo(JSPUtil.getParameter(request, "ar_if_ser_no", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return InvArAmtVO[]
	 */
	public InvArAmtVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return InvArAmtVO[]
	 */
	public InvArAmtVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		InvArAmtVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] currCd = (JSPUtil.getParameter(request, prefix	+ "curr_cd", length));
			String[] invCoaRevDirCd = (JSPUtil.getParameter(request, prefix	+ "inv_coa_rev_dir_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] tjSrcNm = (JSPUtil.getParameter(request, prefix	+ "tj_src_nm", length));
			String[] invCoaCoCd = (JSPUtil.getParameter(request, prefix	+ "inv_coa_co_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] invCoaAcctCd = (JSPUtil.getParameter(request, prefix	+ "inv_coa_acct_cd", length));
			String[] erpIfOfcCd = (JSPUtil.getParameter(request, prefix	+ "erp_if_ofc_cd", length));
			String[] arIfNo = (JSPUtil.getParameter(request, prefix	+ "ar_if_no", length));
			String[] invAmt = (JSPUtil.getParameter(request, prefix	+ "inv_amt", length));
			String[] invCoaRgnCd = (JSPUtil.getParameter(request, prefix	+ "inv_coa_rgn_cd", length));
			String[] invCoaInterCoCd = (JSPUtil.getParameter(request, prefix	+ "inv_coa_inter_co_cd", length));
			String[] invCoaVoyNo = (JSPUtil.getParameter(request, prefix	+ "inv_coa_voy_no", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] invCoaVslCd = (JSPUtil.getParameter(request, prefix	+ "inv_coa_vsl_cd", length));
			String[] arInvSrcCd = (JSPUtil.getParameter(request, prefix	+ "ar_inv_src_cd", length));
			String[] invCoaSkdDirCd = (JSPUtil.getParameter(request, prefix	+ "inv_coa_skd_dir_cd", length));
			String[] invCoaCtrCd = (JSPUtil.getParameter(request, prefix	+ "inv_coa_ctr_cd", length));
			String[] invErpIfStsCd = (JSPUtil.getParameter(request, prefix	+ "inv_erp_if_sts_cd", length));
			String[] erpIfDt = (JSPUtil.getParameter(request, prefix	+ "erp_if_dt", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] errDesc = (JSPUtil.getParameter(request, prefix	+ "err_desc", length));
			String[] erpIfGlDt = (JSPUtil.getParameter(request, prefix	+ "erp_if_gl_dt", length));
			String[] arIfSerNo = (JSPUtil.getParameter(request, prefix	+ "ar_if_ser_no", length));
			
			for (int i = 0; i < length; i++) {
				model = new InvArAmtVO();
				if (currCd[i] != null)
					model.setCurrCd(currCd[i]);
				if (invCoaRevDirCd[i] != null)
					model.setInvCoaRevDirCd(invCoaRevDirCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (tjSrcNm[i] != null)
					model.setTjSrcNm(tjSrcNm[i]);
				if (invCoaCoCd[i] != null)
					model.setInvCoaCoCd(invCoaCoCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (invCoaAcctCd[i] != null)
					model.setInvCoaAcctCd(invCoaAcctCd[i]);
				if (erpIfOfcCd[i] != null)
					model.setErpIfOfcCd(erpIfOfcCd[i]);
				if (arIfNo[i] != null)
					model.setArIfNo(arIfNo[i]);
				if (invAmt[i] != null)
					model.setInvAmt(invAmt[i]);
				if (invCoaRgnCd[i] != null)
					model.setInvCoaRgnCd(invCoaRgnCd[i]);
				if (invCoaInterCoCd[i] != null)
					model.setInvCoaInterCoCd(invCoaInterCoCd[i]);
				if (invCoaVoyNo[i] != null)
					model.setInvCoaVoyNo(invCoaVoyNo[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (invCoaVslCd[i] != null)
					model.setInvCoaVslCd(invCoaVslCd[i]);
				if (arInvSrcCd[i] != null)
					model.setArInvSrcCd(arInvSrcCd[i]);
				if (invCoaSkdDirCd[i] != null)
					model.setInvCoaSkdDirCd(invCoaSkdDirCd[i]);
				if (invCoaCtrCd[i] != null)
					model.setInvCoaCtrCd(invCoaCtrCd[i]);
				if (invErpIfStsCd[i] != null)
					model.setInvErpIfStsCd(invErpIfStsCd[i]);
				if (erpIfDt[i] != null)
					model.setErpIfDt(erpIfDt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (errDesc[i] != null)
					model.setErrDesc(errDesc[i]);
				if (erpIfGlDt[i] != null)
					model.setErpIfGlDt(erpIfGlDt[i]);
				if (arIfSerNo[i] != null)
					model.setArIfSerNo(arIfSerNo[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getInvArAmtVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return InvArAmtVO[]
	 */
	public InvArAmtVO[] getInvArAmtVOs(){
		InvArAmtVO[] vos = (InvArAmtVO[])models.toArray(new InvArAmtVO[models.size()]);
		return vos;
	}
	
	/**
	 * VO Class의 내용을 String으로 변환
	 */
	public String toString() {
		   return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE );
	   }

	/**
	* 포맷팅된 문자열에서 특수문자 제거("-","/",",",":")
	*/
	public void unDataFormat(){
		this.currCd = this.currCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invCoaRevDirCd = this.invCoaRevDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tjSrcNm = this.tjSrcNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invCoaCoCd = this.invCoaCoCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invCoaAcctCd = this.invCoaAcctCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.erpIfOfcCd = this.erpIfOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arIfNo = this.arIfNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invAmt = this.invAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invCoaRgnCd = this.invCoaRgnCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invCoaInterCoCd = this.invCoaInterCoCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invCoaVoyNo = this.invCoaVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invCoaVslCd = this.invCoaVslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arInvSrcCd = this.arInvSrcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invCoaSkdDirCd = this.invCoaSkdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invCoaCtrCd = this.invCoaCtrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invErpIfStsCd = this.invErpIfStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.erpIfDt = this.erpIfDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.errDesc = this.errDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.erpIfGlDt = this.erpIfGlDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arIfSerNo = this.arIfSerNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
