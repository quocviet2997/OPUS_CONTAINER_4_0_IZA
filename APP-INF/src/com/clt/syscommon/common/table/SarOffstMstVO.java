/*=========================================================
*Copyright(c) 2014 CyberLogitec
*@FileName : SarOffstMstVO.java
*@FileTitle : SarOffstMstVO
*Open Issues :
*Change history :
*@LastModifyDate : 2014.10.28
*@LastModifier : 
*@LastVersion : 1.0
* 2014.10.28  
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.common.table;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.clt.framework.component.common.AbstractValueObject;
import com.clt.framework.component.util.JSPUtil;

/**
 * Table Value Ojbect<br>
 * 관련 Event 에서 생성, 서버실행요청시 Data 전달역할을 수행하는 Value Object
 *
 * @author 
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class SarOffstMstVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SarOffstMstVO> models = new ArrayList<SarOffstMstVO>();
	
	/* Column Info */
	private String chgTpCd = null;
	/* Column Info */
	private String glDt = null;
	/* Column Info */
	private String currCd = null;
	/* Column Info */
	private String arOffstSeq = null;
	/* Column Info */
	private String cxlFlg = null;
	/* Column Info */
	private String offstTpCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String bilToCntCd = null;
	/* Column Info */
	private String blNo = null;
	/* Column Info */
	private String otsBalAmt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String arOffstDt = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String vndrNo = null;
	/* Column Info */
	private String apInvTermDt = null;
	/* Column Info */
	private String offstAmt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String rhqCd = null;
	/* Column Info */
	private String apInvNo = null;
	/* Column Info */
	private String offstOfcCd = null;
	/* Column Info */
	private String bilToCustSeq = null;
	/* Column Info */
	private String arOffstNo = null;
	/* Column Info */
	private String offstXchAmt = null;
	/* Column Info */
	private String offstXchRt = null;
	/* Column Info */
	private String invNo = null;
	/* Column Info */
	private String ofcCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String maxArIfNo = null;
	/* Column Info */
	private String otsOfcCd = null;
	/* Column Info */
	private String offstCurrCd = null;
	/* Column Info */
	private String apRmk = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new LinkedHashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new LinkedHashMap<String, String>();
	
	public SarOffstMstVO() {}

	public SarOffstMstVO(String ibflag, String pagerows, String glDt, String chgTpCd, String currCd, String arOffstSeq, String offstTpCd, String cxlFlg, String creDt, String bilToCntCd, String blNo, String otsBalAmt, String arOffstDt, String vndrNo, String offstAmt, String updUsrId, String updDt, String rhqCd, String apInvNo, String offstOfcCd, String bilToCustSeq, String arOffstNo, String offstXchAmt, String offstXchRt, String invNo, String ofcCd, String creUsrId, String otsOfcCd, String maxArIfNo, String offstCurrCd, String apRmk, String apInvTermDt) {
		this.chgTpCd = chgTpCd;
		this.glDt = glDt;
		this.currCd = currCd;
		this.arOffstSeq = arOffstSeq;
		this.cxlFlg = cxlFlg;
		this.offstTpCd = offstTpCd;
		this.creDt = creDt;
		this.bilToCntCd = bilToCntCd;
		this.blNo = blNo;
		this.otsBalAmt = otsBalAmt;
		this.pagerows = pagerows;
		this.arOffstDt = arOffstDt;
		this.ibflag = ibflag;
		this.vndrNo = vndrNo;
		this.apInvTermDt = apInvTermDt;
		this.offstAmt = offstAmt;
		this.updUsrId = updUsrId;
		this.updDt = updDt;
		this.rhqCd = rhqCd;
		this.apInvNo = apInvNo;
		this.offstOfcCd = offstOfcCd;
		this.bilToCustSeq = bilToCustSeq;
		this.arOffstNo = arOffstNo;
		this.offstXchAmt = offstXchAmt;
		this.offstXchRt = offstXchRt;
		this.invNo = invNo;
		this.ofcCd = ofcCd;
		this.creUsrId = creUsrId;
		this.maxArIfNo = maxArIfNo;
		this.otsOfcCd = otsOfcCd;
		this.offstCurrCd = offstCurrCd;
		this.apRmk = apRmk;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("chg_tp_cd", getChgTpCd());
		this.hashColumns.put("gl_dt", getGlDt());
		this.hashColumns.put("curr_cd", getCurrCd());
		this.hashColumns.put("ar_offst_seq", getArOffstSeq());
		this.hashColumns.put("cxl_flg", getCxlFlg());
		this.hashColumns.put("offst_tp_cd", getOffstTpCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("bil_to_cnt_cd", getBilToCntCd());
		this.hashColumns.put("bl_no", getBlNo());
		this.hashColumns.put("ots_bal_amt", getOtsBalAmt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ar_offst_dt", getArOffstDt());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("vndr_no", getVndrNo());
		this.hashColumns.put("ap_inv_term_dt", getApInvTermDt());
		this.hashColumns.put("offst_amt", getOffstAmt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("rhq_cd", getRhqCd());
		this.hashColumns.put("ap_inv_no", getApInvNo());
		this.hashColumns.put("offst_ofc_cd", getOffstOfcCd());
		this.hashColumns.put("bil_to_cust_seq", getBilToCustSeq());
		this.hashColumns.put("ar_offst_no", getArOffstNo());
		this.hashColumns.put("offst_xch_amt", getOffstXchAmt());
		this.hashColumns.put("offst_xch_rt", getOffstXchRt());
		this.hashColumns.put("inv_no", getInvNo());
		this.hashColumns.put("ofc_cd", getOfcCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("max_ar_if_no", getMaxArIfNo());
		this.hashColumns.put("ots_ofc_cd", getOtsOfcCd());
		this.hashColumns.put("offst_curr_cd", getOffstCurrCd());
		this.hashColumns.put("ap_rmk", getApRmk());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("chg_tp_cd", "chgTpCd");
		this.hashFields.put("gl_dt", "glDt");
		this.hashFields.put("curr_cd", "currCd");
		this.hashFields.put("ar_offst_seq", "arOffstSeq");
		this.hashFields.put("cxl_flg", "cxlFlg");
		this.hashFields.put("offst_tp_cd", "offstTpCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("bil_to_cnt_cd", "bilToCntCd");
		this.hashFields.put("bl_no", "blNo");
		this.hashFields.put("ots_bal_amt", "otsBalAmt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ar_offst_dt", "arOffstDt");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("vndr_no", "vndrNo");
		this.hashFields.put("ap_inv_term_dt", "apInvTermDt");
		this.hashFields.put("offst_amt", "offstAmt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("rhq_cd", "rhqCd");
		this.hashFields.put("ap_inv_no", "apInvNo");
		this.hashFields.put("offst_ofc_cd", "offstOfcCd");
		this.hashFields.put("bil_to_cust_seq", "bilToCustSeq");
		this.hashFields.put("ar_offst_no", "arOffstNo");
		this.hashFields.put("offst_xch_amt", "offstXchAmt");
		this.hashFields.put("offst_xch_rt", "offstXchRt");
		this.hashFields.put("inv_no", "invNo");
		this.hashFields.put("ofc_cd", "ofcCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("max_ar_if_no", "maxArIfNo");
		this.hashFields.put("ots_ofc_cd", "otsOfcCd");
		this.hashFields.put("offst_curr_cd", "offstCurrCd");
		this.hashFields.put("ap_rmk", "apRmk");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return chgTpCd
	 */
	public String getChgTpCd() {
		return this.chgTpCd;
	}
	
	/**
	 * Column Info
	 * @return glDt
	 */
	public String getGlDt() {
		return this.glDt;
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
	 * @return arOffstSeq
	 */
	public String getArOffstSeq() {
		return this.arOffstSeq;
	}
	
	/**
	 * Column Info
	 * @return cxlFlg
	 */
	public String getCxlFlg() {
		return this.cxlFlg;
	}
	
	/**
	 * Column Info
	 * @return offstTpCd
	 */
	public String getOffstTpCd() {
		return this.offstTpCd;
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
	 * @return bilToCntCd
	 */
	public String getBilToCntCd() {
		return this.bilToCntCd;
	}
	
	/**
	 * Column Info
	 * @return blNo
	 */
	public String getBlNo() {
		return this.blNo;
	}
	
	/**
	 * Column Info
	 * @return otsBalAmt
	 */
	public String getOtsBalAmt() {
		return this.otsBalAmt;
	}
	
	/**
	 * Page Number
	 * @return pagerows
	 */
	public String getPagerows() {
		return this.pagerows;
	}
	
	/**
	 * Column Info
	 * @return arOffstDt
	 */
	public String getArOffstDt() {
		return this.arOffstDt;
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
	 * @return vndrNo
	 */
	public String getVndrNo() {
		return this.vndrNo;
	}
	
	/**
	 * Column Info
	 * @return apInvTermDt
	 */
	public String getApInvTermDt() {
		return this.apInvTermDt;
	}
	
	/**
	 * Column Info
	 * @return offstAmt
	 */
	public String getOffstAmt() {
		return this.offstAmt;
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
	 * @return rhqCd
	 */
	public String getRhqCd() {
		return this.rhqCd;
	}
	
	/**
	 * Column Info
	 * @return apInvNo
	 */
	public String getApInvNo() {
		return this.apInvNo;
	}
	
	/**
	 * Column Info
	 * @return offstOfcCd
	 */
	public String getOffstOfcCd() {
		return this.offstOfcCd;
	}
	
	/**
	 * Column Info
	 * @return bilToCustSeq
	 */
	public String getBilToCustSeq() {
		return this.bilToCustSeq;
	}
	
	/**
	 * Column Info
	 * @return arOffstNo
	 */
	public String getArOffstNo() {
		return this.arOffstNo;
	}
	
	/**
	 * Column Info
	 * @return offstXchAmt
	 */
	public String getOffstXchAmt() {
		return this.offstXchAmt;
	}
	
	/**
	 * Column Info
	 * @return offstXchRt
	 */
	public String getOffstXchRt() {
		return this.offstXchRt;
	}
	
	/**
	 * Column Info
	 * @return invNo
	 */
	public String getInvNo() {
		return this.invNo;
	}
	
	/**
	 * Column Info
	 * @return ofcCd
	 */
	public String getOfcCd() {
		return this.ofcCd;
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
	 * @return maxArIfNo
	 */
	public String getMaxArIfNo() {
		return this.maxArIfNo;
	}
	
	/**
	 * Column Info
	 * @return otsOfcCd
	 */
	public String getOtsOfcCd() {
		return this.otsOfcCd;
	}
	
	/**
	 * Column Info
	 * @return offstCurrCd
	 */
	public String getOffstCurrCd() {
		return this.offstCurrCd;
	}
	
	/**
	 * Column Info
	 * @return apRmk
	 */
	public String getApRmk() {
		return this.apRmk;
	}
	

	/**
	 * Column Info
	 * @param chgTpCd
	 */
	public void setChgTpCd(String chgTpCd) {
		this.chgTpCd = chgTpCd;
	}
	
	/**
	 * Column Info
	 * @param glDt
	 */
	public void setGlDt(String glDt) {
		this.glDt = glDt;
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
	 * @param arOffstSeq
	 */
	public void setArOffstSeq(String arOffstSeq) {
		this.arOffstSeq = arOffstSeq;
	}
	
	/**
	 * Column Info
	 * @param cxlFlg
	 */
	public void setCxlFlg(String cxlFlg) {
		this.cxlFlg = cxlFlg;
	}
	
	/**
	 * Column Info
	 * @param offstTpCd
	 */
	public void setOffstTpCd(String offstTpCd) {
		this.offstTpCd = offstTpCd;
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
	 * @param bilToCntCd
	 */
	public void setBilToCntCd(String bilToCntCd) {
		this.bilToCntCd = bilToCntCd;
	}
	
	/**
	 * Column Info
	 * @param blNo
	 */
	public void setBlNo(String blNo) {
		this.blNo = blNo;
	}
	
	/**
	 * Column Info
	 * @param otsBalAmt
	 */
	public void setOtsBalAmt(String otsBalAmt) {
		this.otsBalAmt = otsBalAmt;
	}
	
	/**
	 * Page Number
	 * @param pagerows
	 */
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
	}
	
	/**
	 * Column Info
	 * @param arOffstDt
	 */
	public void setArOffstDt(String arOffstDt) {
		this.arOffstDt = arOffstDt;
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
	 * @param vndrNo
	 */
	public void setVndrNo(String vndrNo) {
		this.vndrNo = vndrNo;
	}
	
	/**
	 * Column Info
	 * @param apInvTermDt
	 */
	public void setApInvTermDt(String apInvTermDt) {
		this.apInvTermDt = apInvTermDt;
	}
	
	/**
	 * Column Info
	 * @param offstAmt
	 */
	public void setOffstAmt(String offstAmt) {
		this.offstAmt = offstAmt;
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
	 * @param rhqCd
	 */
	public void setRhqCd(String rhqCd) {
		this.rhqCd = rhqCd;
	}
	
	/**
	 * Column Info
	 * @param apInvNo
	 */
	public void setApInvNo(String apInvNo) {
		this.apInvNo = apInvNo;
	}
	
	/**
	 * Column Info
	 * @param offstOfcCd
	 */
	public void setOffstOfcCd(String offstOfcCd) {
		this.offstOfcCd = offstOfcCd;
	}
	
	/**
	 * Column Info
	 * @param bilToCustSeq
	 */
	public void setBilToCustSeq(String bilToCustSeq) {
		this.bilToCustSeq = bilToCustSeq;
	}
	
	/**
	 * Column Info
	 * @param arOffstNo
	 */
	public void setArOffstNo(String arOffstNo) {
		this.arOffstNo = arOffstNo;
	}
	
	/**
	 * Column Info
	 * @param offstXchAmt
	 */
	public void setOffstXchAmt(String offstXchAmt) {
		this.offstXchAmt = offstXchAmt;
	}
	
	/**
	 * Column Info
	 * @param offstXchRt
	 */
	public void setOffstXchRt(String offstXchRt) {
		this.offstXchRt = offstXchRt;
	}
	
	/**
	 * Column Info
	 * @param invNo
	 */
	public void setInvNo(String invNo) {
		this.invNo = invNo;
	}
	
	/**
	 * Column Info
	 * @param ofcCd
	 */
	public void setOfcCd(String ofcCd) {
		this.ofcCd = ofcCd;
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
	 * @param maxArIfNo
	 */
	public void setMaxArIfNo(String maxArIfNo) {
		this.maxArIfNo = maxArIfNo;
	}
	
	/**
	 * Column Info
	 * @param otsOfcCd
	 */
	public void setOtsOfcCd(String otsOfcCd) {
		this.otsOfcCd = otsOfcCd;
	}
	
	/**
	 * Column Info
	 * @param offstCurrCd
	 */
	public void setOffstCurrCd(String offstCurrCd) {
		this.offstCurrCd = offstCurrCd;
	}
	
	/**
	 * Column Info
	 * @param apRmk
	 */
	public void setApRmk(String apRmk) {
		this.apRmk = apRmk;
	}
	
/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		fromRequest(request,"");
	}

	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request, String prefix) {
		setChgTpCd(JSPUtil.getParameter(request, prefix + "chg_tp_cd", ""));
		setGlDt(JSPUtil.getParameter(request, prefix + "gl_dt", ""));
		setCurrCd(JSPUtil.getParameter(request, prefix + "curr_cd", ""));
		setArOffstSeq(JSPUtil.getParameter(request, prefix + "ar_offst_seq", ""));
		setCxlFlg(JSPUtil.getParameter(request, prefix + "cxl_flg", ""));
		setOffstTpCd(JSPUtil.getParameter(request, prefix + "offst_tp_cd", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setBilToCntCd(JSPUtil.getParameter(request, prefix + "bil_to_cnt_cd", ""));
		setBlNo(JSPUtil.getParameter(request, prefix + "bl_no", ""));
		setOtsBalAmt(JSPUtil.getParameter(request, prefix + "ots_bal_amt", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setArOffstDt(JSPUtil.getParameter(request, prefix + "ar_offst_dt", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setVndrNo(JSPUtil.getParameter(request, prefix + "vndr_no", ""));
		setApInvTermDt(JSPUtil.getParameter(request, prefix + "ap_inv_term_dt", ""));
		setOffstAmt(JSPUtil.getParameter(request, prefix + "offst_amt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setRhqCd(JSPUtil.getParameter(request, prefix + "rhq_cd", ""));
		setApInvNo(JSPUtil.getParameter(request, prefix + "ap_inv_no", ""));
		setOffstOfcCd(JSPUtil.getParameter(request, prefix + "offst_ofc_cd", ""));
		setBilToCustSeq(JSPUtil.getParameter(request, prefix + "bil_to_cust_seq", ""));
		setArOffstNo(JSPUtil.getParameter(request, prefix + "ar_offst_no", ""));
		setOffstXchAmt(JSPUtil.getParameter(request, prefix + "offst_xch_amt", ""));
		setOffstXchRt(JSPUtil.getParameter(request, prefix + "offst_xch_rt", ""));
		setInvNo(JSPUtil.getParameter(request, prefix + "inv_no", ""));
		setOfcCd(JSPUtil.getParameter(request, prefix + "ofc_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setMaxArIfNo(JSPUtil.getParameter(request, prefix + "max_ar_if_no", ""));
		setOtsOfcCd(JSPUtil.getParameter(request, prefix + "ots_ofc_cd", ""));
		setOffstCurrCd(JSPUtil.getParameter(request, prefix + "offst_curr_cd", ""));
		setApRmk(JSPUtil.getParameter(request, prefix + "ap_rmk", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return SarOffstMstVO[]
	 */
	public SarOffstMstVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SarOffstMstVO[]
	 */
	public SarOffstMstVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SarOffstMstVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] chgTpCd = (JSPUtil.getParameter(request, prefix	+ "chg_tp_cd", length));
			String[] glDt = (JSPUtil.getParameter(request, prefix	+ "gl_dt", length));
			String[] currCd = (JSPUtil.getParameter(request, prefix	+ "curr_cd", length));
			String[] arOffstSeq = (JSPUtil.getParameter(request, prefix	+ "ar_offst_seq", length));
			String[] cxlFlg = (JSPUtil.getParameter(request, prefix	+ "cxl_flg", length));
			String[] offstTpCd = (JSPUtil.getParameter(request, prefix	+ "offst_tp_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] bilToCntCd = (JSPUtil.getParameter(request, prefix	+ "bil_to_cnt_cd", length));
			String[] blNo = (JSPUtil.getParameter(request, prefix	+ "bl_no", length));
			String[] otsBalAmt = (JSPUtil.getParameter(request, prefix	+ "ots_bal_amt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] arOffstDt = (JSPUtil.getParameter(request, prefix	+ "ar_offst_dt", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] vndrNo = (JSPUtil.getParameter(request, prefix	+ "vndr_no", length));
			String[] apInvTermDt = (JSPUtil.getParameter(request, prefix	+ "ap_inv_term_dt", length));
			String[] offstAmt = (JSPUtil.getParameter(request, prefix	+ "offst_amt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] rhqCd = (JSPUtil.getParameter(request, prefix	+ "rhq_cd", length));
			String[] apInvNo = (JSPUtil.getParameter(request, prefix	+ "ap_inv_no", length));
			String[] offstOfcCd = (JSPUtil.getParameter(request, prefix	+ "offst_ofc_cd", length));
			String[] bilToCustSeq = (JSPUtil.getParameter(request, prefix	+ "bil_to_cust_seq", length));
			String[] arOffstNo = (JSPUtil.getParameter(request, prefix	+ "ar_offst_no", length));
			String[] offstXchAmt = (JSPUtil.getParameter(request, prefix	+ "offst_xch_amt", length));
			String[] offstXchRt = (JSPUtil.getParameter(request, prefix	+ "offst_xch_rt", length));
			String[] invNo = (JSPUtil.getParameter(request, prefix	+ "inv_no", length));
			String[] ofcCd = (JSPUtil.getParameter(request, prefix	+ "ofc_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] maxArIfNo = (JSPUtil.getParameter(request, prefix	+ "max_ar_if_no", length));
			String[] otsOfcCd = (JSPUtil.getParameter(request, prefix	+ "ots_ofc_cd", length));
			String[] offstCurrCd = (JSPUtil.getParameter(request, prefix	+ "offst_curr_cd", length));
			String[] apRmk = (JSPUtil.getParameter(request, prefix	+ "ap_rmk", length));
			
			for (int i = 0; i < length; i++) {
				model = new SarOffstMstVO();
				if (chgTpCd[i] != null)
					model.setChgTpCd(chgTpCd[i]);
				if (glDt[i] != null)
					model.setGlDt(glDt[i]);
				if (currCd[i] != null)
					model.setCurrCd(currCd[i]);
				if (arOffstSeq[i] != null)
					model.setArOffstSeq(arOffstSeq[i]);
				if (cxlFlg[i] != null)
					model.setCxlFlg(cxlFlg[i]);
				if (offstTpCd[i] != null)
					model.setOffstTpCd(offstTpCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (bilToCntCd[i] != null)
					model.setBilToCntCd(bilToCntCd[i]);
				if (blNo[i] != null)
					model.setBlNo(blNo[i]);
				if (otsBalAmt[i] != null)
					model.setOtsBalAmt(otsBalAmt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (arOffstDt[i] != null)
					model.setArOffstDt(arOffstDt[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (vndrNo[i] != null)
					model.setVndrNo(vndrNo[i]);
				if (apInvTermDt[i] != null)
					model.setApInvTermDt(apInvTermDt[i]);
				if (offstAmt[i] != null)
					model.setOffstAmt(offstAmt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (rhqCd[i] != null)
					model.setRhqCd(rhqCd[i]);
				if (apInvNo[i] != null)
					model.setApInvNo(apInvNo[i]);
				if (offstOfcCd[i] != null)
					model.setOffstOfcCd(offstOfcCd[i]);
				if (bilToCustSeq[i] != null)
					model.setBilToCustSeq(bilToCustSeq[i]);
				if (arOffstNo[i] != null)
					model.setArOffstNo(arOffstNo[i]);
				if (offstXchAmt[i] != null)
					model.setOffstXchAmt(offstXchAmt[i]);
				if (offstXchRt[i] != null)
					model.setOffstXchRt(offstXchRt[i]);
				if (invNo[i] != null)
					model.setInvNo(invNo[i]);
				if (ofcCd[i] != null)
					model.setOfcCd(ofcCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (maxArIfNo[i] != null)
					model.setMaxArIfNo(maxArIfNo[i]);
				if (otsOfcCd[i] != null)
					model.setOtsOfcCd(otsOfcCd[i]);
				if (offstCurrCd[i] != null)
					model.setOffstCurrCd(offstCurrCd[i]);
				if (apRmk[i] != null)
					model.setApRmk(apRmk[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSarOffstMstVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return SarOffstMstVO[]
	 */
	public SarOffstMstVO[] getSarOffstMstVOs(){
		SarOffstMstVO[] vos = (SarOffstMstVO[])models.toArray(new SarOffstMstVO[models.size()]);
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
		this.chgTpCd = this.chgTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.glDt = this.glDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.currCd = this.currCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arOffstSeq = this.arOffstSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cxlFlg = this.cxlFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.offstTpCd = this.offstTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bilToCntCd = this.bilToCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blNo = this.blNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.otsBalAmt = this.otsBalAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arOffstDt = this.arOffstDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrNo = this.vndrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.apInvTermDt = this.apInvTermDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.offstAmt = this.offstAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rhqCd = this.rhqCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.apInvNo = this.apInvNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.offstOfcCd = this.offstOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bilToCustSeq = this.bilToCustSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arOffstNo = this.arOffstNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.offstXchAmt = this.offstXchAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.offstXchRt = this.offstXchRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invNo = this.invNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcCd = this.ofcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.maxArIfNo = this.maxArIfNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.otsOfcCd = this.otsOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.offstCurrCd = this.offstCurrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.apRmk = this.apRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
