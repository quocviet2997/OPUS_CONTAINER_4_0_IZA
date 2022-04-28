/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : InvArChgVO.java
*@FileTitle : InvArChgVO
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

public class InvArChgVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<InvArChgVO> models = new ArrayList<InvArChgVO>();
	
	/* Column Info */
	private String repChgCd = null;
	/* Column Info */
	private String revCoaDirCd = null;
	/* Column Info */
	private String currCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String trfRtAmt = null;
	/* Column Info */
	private String chgSeq = null;
	/* Column Info */
	private String tjSrcNm = null;
	/* Column Info */
	private String chgCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String invIssFlg = null;
	/* Column Info */
	private String revCoaAcctCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String arIfNo = null;
	/* Column Info */
	private String acctCd = null;
	/* Column Info */
	private String chgAmt = null;
	/* Column Info */
	private String revCoaCtrCd = null;
	/* Column Info */
	private String invXchRtDt = null;
	/* Column Info */
	private String revCoaCoCd = null;
	/* Column Info */
	private String arIfChgSeq = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String invXchRt = null;
	/* Column Info */
	private String invClrFlg = null;
	/* Column Info */
	private String chgRmk = null;
	/* Column Info */
	private String sobId = null;
	/* Column Info */
	private String invRevTpSrcCd = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String revCoaVslCd = null;
	/* Column Info */
	private String perTpCd = null;
	/* Column Info */
	private String chgFullNm = null;
	/* Column Info */
	private String revCoaSkdDirCd = null;
	/* Column Info */
	private String revCoaRgnCd = null;
	/* Column Info */
	private String mfDivCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String revCoaVoyNo = null;
	/* Column Info */
	private String trfNo = null;
	/* Column Info */
	private String revCoaInterCoCd = null;
	/* Column Info */
	private String ratAsCntrQty = null;
	/* Column Info */
	private String tvaFlg = null;
	/* Column Info */
	private String arIfSerNo = null;
	/* Column Info */
	private String mnlFlg = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public InvArChgVO() {}

	public InvArChgVO(String ibflag, String pagerows, String arIfNo, String arIfSerNo, String chgSeq, String chgCd, String currCd, String perTpCd, String trfRtAmt, String ratAsCntrQty, String chgAmt, String invXchRt, String invXchRtDt, String repChgCd, String chgFullNm, String trfNo, String invIssFlg, String invClrFlg, String sobId, String invRevTpSrcCd, String revCoaCoCd, String revCoaRgnCd, String revCoaCtrCd, String revCoaAcctCd, String revCoaInterCoCd, String revCoaVslCd, String revCoaVoyNo, String revCoaSkdDirCd, String revCoaDirCd, String acctCd, String tvaFlg, String chgRmk, String mnlFlg, String mfDivCd, String creUsrId, String creDt, String updUsrId, String updDt, String arIfChgSeq, String tjSrcNm) {
		this.repChgCd = repChgCd;
		this.revCoaDirCd = revCoaDirCd;
		this.currCd = currCd;
		this.creDt = creDt;
		this.trfRtAmt = trfRtAmt;
		this.chgSeq = chgSeq;
		this.tjSrcNm = tjSrcNm;
		this.chgCd = chgCd;
		this.pagerows = pagerows;
		this.invIssFlg = invIssFlg;
		this.revCoaAcctCd = revCoaAcctCd;
		this.ibflag = ibflag;
		this.arIfNo = arIfNo;
		this.acctCd = acctCd;
		this.chgAmt = chgAmt;
		this.revCoaCtrCd = revCoaCtrCd;
		this.invXchRtDt = invXchRtDt;
		this.revCoaCoCd = revCoaCoCd;
		this.arIfChgSeq = arIfChgSeq;
		this.updUsrId = updUsrId;
		this.invXchRt = invXchRt;
		this.invClrFlg = invClrFlg;
		this.chgRmk = chgRmk;
		this.sobId = sobId;
		this.invRevTpSrcCd = invRevTpSrcCd;
		this.updDt = updDt;
		this.revCoaVslCd = revCoaVslCd;
		this.perTpCd = perTpCd;
		this.chgFullNm = chgFullNm;
		this.revCoaSkdDirCd = revCoaSkdDirCd;
		this.revCoaRgnCd = revCoaRgnCd;
		this.mfDivCd = mfDivCd;
		this.creUsrId = creUsrId;
		this.revCoaVoyNo = revCoaVoyNo;
		this.trfNo = trfNo;
		this.revCoaInterCoCd = revCoaInterCoCd;
		this.ratAsCntrQty = ratAsCntrQty;
		this.tvaFlg = tvaFlg;
		this.arIfSerNo = arIfSerNo;
		this.mnlFlg = mnlFlg;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("rep_chg_cd", getRepChgCd());
		this.hashColumns.put("rev_coa_dir_cd", getRevCoaDirCd());
		this.hashColumns.put("curr_cd", getCurrCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("trf_rt_amt", getTrfRtAmt());
		this.hashColumns.put("chg_seq", getChgSeq());
		this.hashColumns.put("tj_src_nm", getTjSrcNm());
		this.hashColumns.put("chg_cd", getChgCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("inv_iss_flg", getInvIssFlg());
		this.hashColumns.put("rev_coa_acct_cd", getRevCoaAcctCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("ar_if_no", getArIfNo());
		this.hashColumns.put("acct_cd", getAcctCd());
		this.hashColumns.put("chg_amt", getChgAmt());
		this.hashColumns.put("rev_coa_ctr_cd", getRevCoaCtrCd());
		this.hashColumns.put("inv_xch_rt_dt", getInvXchRtDt());
		this.hashColumns.put("rev_coa_co_cd", getRevCoaCoCd());
		this.hashColumns.put("ar_if_chg_seq", getArIfChgSeq());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("inv_xch_rt", getInvXchRt());
		this.hashColumns.put("inv_clr_flg", getInvClrFlg());
		this.hashColumns.put("chg_rmk", getChgRmk());
		this.hashColumns.put("sob_id", getSobId());
		this.hashColumns.put("inv_rev_tp_src_cd", getInvRevTpSrcCd());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("rev_coa_vsl_cd", getRevCoaVslCd());
		this.hashColumns.put("per_tp_cd", getPerTpCd());
		this.hashColumns.put("chg_full_nm", getChgFullNm());
		this.hashColumns.put("rev_coa_skd_dir_cd", getRevCoaSkdDirCd());
		this.hashColumns.put("rev_coa_rgn_cd", getRevCoaRgnCd());
		this.hashColumns.put("mf_div_cd", getMfDivCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("rev_coa_voy_no", getRevCoaVoyNo());
		this.hashColumns.put("trf_no", getTrfNo());
		this.hashColumns.put("rev_coa_inter_co_cd", getRevCoaInterCoCd());
		this.hashColumns.put("rat_as_cntr_qty", getRatAsCntrQty());
		this.hashColumns.put("tva_flg", getTvaFlg());
		this.hashColumns.put("ar_if_ser_no", getArIfSerNo());
		this.hashColumns.put("mnl_flg", getMnlFlg());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("rep_chg_cd", "repChgCd");
		this.hashFields.put("rev_coa_dir_cd", "revCoaDirCd");
		this.hashFields.put("curr_cd", "currCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("trf_rt_amt", "trfRtAmt");
		this.hashFields.put("chg_seq", "chgSeq");
		this.hashFields.put("tj_src_nm", "tjSrcNm");
		this.hashFields.put("chg_cd", "chgCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("inv_iss_flg", "invIssFlg");
		this.hashFields.put("rev_coa_acct_cd", "revCoaAcctCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("ar_if_no", "arIfNo");
		this.hashFields.put("acct_cd", "acctCd");
		this.hashFields.put("chg_amt", "chgAmt");
		this.hashFields.put("rev_coa_ctr_cd", "revCoaCtrCd");
		this.hashFields.put("inv_xch_rt_dt", "invXchRtDt");
		this.hashFields.put("rev_coa_co_cd", "revCoaCoCd");
		this.hashFields.put("ar_if_chg_seq", "arIfChgSeq");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("inv_xch_rt", "invXchRt");
		this.hashFields.put("inv_clr_flg", "invClrFlg");
		this.hashFields.put("chg_rmk", "chgRmk");
		this.hashFields.put("sob_id", "sobId");
		this.hashFields.put("inv_rev_tp_src_cd", "invRevTpSrcCd");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("rev_coa_vsl_cd", "revCoaVslCd");
		this.hashFields.put("per_tp_cd", "perTpCd");
		this.hashFields.put("chg_full_nm", "chgFullNm");
		this.hashFields.put("rev_coa_skd_dir_cd", "revCoaSkdDirCd");
		this.hashFields.put("rev_coa_rgn_cd", "revCoaRgnCd");
		this.hashFields.put("mf_div_cd", "mfDivCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("rev_coa_voy_no", "revCoaVoyNo");
		this.hashFields.put("trf_no", "trfNo");
		this.hashFields.put("rev_coa_inter_co_cd", "revCoaInterCoCd");
		this.hashFields.put("rat_as_cntr_qty", "ratAsCntrQty");
		this.hashFields.put("tva_flg", "tvaFlg");
		this.hashFields.put("ar_if_ser_no", "arIfSerNo");
		this.hashFields.put("mnl_flg", "mnlFlg");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return repChgCd
	 */
	public String getRepChgCd() {
		return this.repChgCd;
	}
	
	/**
	 * Column Info
	 * @return revCoaDirCd
	 */
	public String getRevCoaDirCd() {
		return this.revCoaDirCd;
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
	 * @return creDt
	 */
	public String getCreDt() {
		return this.creDt;
	}
	
	/**
	 * Column Info
	 * @return trfRtAmt
	 */
	public String getTrfRtAmt() {
		return this.trfRtAmt;
	}
	
	/**
	 * Column Info
	 * @return chgSeq
	 */
	public String getChgSeq() {
		return this.chgSeq;
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
	 * @return chgCd
	 */
	public String getChgCd() {
		return this.chgCd;
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
	 * @return invIssFlg
	 */
	public String getInvIssFlg() {
		return this.invIssFlg;
	}
	
	/**
	 * Column Info
	 * @return revCoaAcctCd
	 */
	public String getRevCoaAcctCd() {
		return this.revCoaAcctCd;
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
	 * @return arIfNo
	 */
	public String getArIfNo() {
		return this.arIfNo;
	}
	
	/**
	 * Column Info
	 * @return acctCd
	 */
	public String getAcctCd() {
		return this.acctCd;
	}
	
	/**
	 * Column Info
	 * @return chgAmt
	 */
	public String getChgAmt() {
		return this.chgAmt;
	}
	
	/**
	 * Column Info
	 * @return revCoaCtrCd
	 */
	public String getRevCoaCtrCd() {
		return this.revCoaCtrCd;
	}
	
	/**
	 * Column Info
	 * @return invXchRtDt
	 */
	public String getInvXchRtDt() {
		return this.invXchRtDt;
	}
	
	/**
	 * Column Info
	 * @return revCoaCoCd
	 */
	public String getRevCoaCoCd() {
		return this.revCoaCoCd;
	}
	
	/**
	 * Column Info
	 * @return arIfChgSeq
	 */
	public String getArIfChgSeq() {
		return this.arIfChgSeq;
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
	 * @return invXchRt
	 */
	public String getInvXchRt() {
		return this.invXchRt;
	}
	
	/**
	 * Column Info
	 * @return invClrFlg
	 */
	public String getInvClrFlg() {
		return this.invClrFlg;
	}
	
	/**
	 * Column Info
	 * @return chgRmk
	 */
	public String getChgRmk() {
		return this.chgRmk;
	}
	
	/**
	 * Column Info
	 * @return sobId
	 */
	public String getSobId() {
		return this.sobId;
	}
	
	/**
	 * Column Info
	 * @return invRevTpSrcCd
	 */
	public String getInvRevTpSrcCd() {
		return this.invRevTpSrcCd;
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
	 * @return revCoaVslCd
	 */
	public String getRevCoaVslCd() {
		return this.revCoaVslCd;
	}
	
	/**
	 * Column Info
	 * @return perTpCd
	 */
	public String getPerTpCd() {
		return this.perTpCd;
	}
	
	/**
	 * Column Info
	 * @return chgFullNm
	 */
	public String getChgFullNm() {
		return this.chgFullNm;
	}
	
	/**
	 * Column Info
	 * @return revCoaSkdDirCd
	 */
	public String getRevCoaSkdDirCd() {
		return this.revCoaSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @return revCoaRgnCd
	 */
	public String getRevCoaRgnCd() {
		return this.revCoaRgnCd;
	}
	
	/**
	 * Column Info
	 * @return mfDivCd
	 */
	public String getMfDivCd() {
		return this.mfDivCd;
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
	 * @return revCoaVoyNo
	 */
	public String getRevCoaVoyNo() {
		return this.revCoaVoyNo;
	}
	
	/**
	 * Column Info
	 * @return trfNo
	 */
	public String getTrfNo() {
		return this.trfNo;
	}
	
	/**
	 * Column Info
	 * @return revCoaInterCoCd
	 */
	public String getRevCoaInterCoCd() {
		return this.revCoaInterCoCd;
	}
	
	/**
	 * Column Info
	 * @return ratAsCntrQty
	 */
	public String getRatAsCntrQty() {
		return this.ratAsCntrQty;
	}
	
	/**
	 * Column Info
	 * @return tvaFlg
	 */
	public String getTvaFlg() {
		return this.tvaFlg;
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
	 * @return mnlFlg
	 */
	public String getMnlFlg() {
		return this.mnlFlg;
	}
	

	/**
	 * Column Info
	 * @param repChgCd
	 */
	public void setRepChgCd(String repChgCd) {
		this.repChgCd = repChgCd;
	}
	
	/**
	 * Column Info
	 * @param revCoaDirCd
	 */
	public void setRevCoaDirCd(String revCoaDirCd) {
		this.revCoaDirCd = revCoaDirCd;
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
	 * @param creDt
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
	}
	
	/**
	 * Column Info
	 * @param trfRtAmt
	 */
	public void setTrfRtAmt(String trfRtAmt) {
		this.trfRtAmt = trfRtAmt;
	}
	
	/**
	 * Column Info
	 * @param chgSeq
	 */
	public void setChgSeq(String chgSeq) {
		this.chgSeq = chgSeq;
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
	 * @param chgCd
	 */
	public void setChgCd(String chgCd) {
		this.chgCd = chgCd;
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
	 * @param invIssFlg
	 */
	public void setInvIssFlg(String invIssFlg) {
		this.invIssFlg = invIssFlg;
	}
	
	/**
	 * Column Info
	 * @param revCoaAcctCd
	 */
	public void setRevCoaAcctCd(String revCoaAcctCd) {
		this.revCoaAcctCd = revCoaAcctCd;
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
	 * @param arIfNo
	 */
	public void setArIfNo(String arIfNo) {
		this.arIfNo = arIfNo;
	}
	
	/**
	 * Column Info
	 * @param acctCd
	 */
	public void setAcctCd(String acctCd) {
		this.acctCd = acctCd;
	}
	
	/**
	 * Column Info
	 * @param chgAmt
	 */
	public void setChgAmt(String chgAmt) {
		this.chgAmt = chgAmt;
	}
	
	/**
	 * Column Info
	 * @param revCoaCtrCd
	 */
	public void setRevCoaCtrCd(String revCoaCtrCd) {
		this.revCoaCtrCd = revCoaCtrCd;
	}
	
	/**
	 * Column Info
	 * @param invXchRtDt
	 */
	public void setInvXchRtDt(String invXchRtDt) {
		this.invXchRtDt = invXchRtDt;
	}
	
	/**
	 * Column Info
	 * @param revCoaCoCd
	 */
	public void setRevCoaCoCd(String revCoaCoCd) {
		this.revCoaCoCd = revCoaCoCd;
	}
	
	/**
	 * Column Info
	 * @param arIfChgSeq
	 */
	public void setArIfChgSeq(String arIfChgSeq) {
		this.arIfChgSeq = arIfChgSeq;
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
	 * @param invXchRt
	 */
	public void setInvXchRt(String invXchRt) {
		this.invXchRt = invXchRt;
	}
	
	/**
	 * Column Info
	 * @param invClrFlg
	 */
	public void setInvClrFlg(String invClrFlg) {
		this.invClrFlg = invClrFlg;
	}
	
	/**
	 * Column Info
	 * @param chgRmk
	 */
	public void setChgRmk(String chgRmk) {
		this.chgRmk = chgRmk;
	}
	
	/**
	 * Column Info
	 * @param sobId
	 */
	public void setSobId(String sobId) {
		this.sobId = sobId;
	}
	
	/**
	 * Column Info
	 * @param invRevTpSrcCd
	 */
	public void setInvRevTpSrcCd(String invRevTpSrcCd) {
		this.invRevTpSrcCd = invRevTpSrcCd;
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
	 * @param revCoaVslCd
	 */
	public void setRevCoaVslCd(String revCoaVslCd) {
		this.revCoaVslCd = revCoaVslCd;
	}
	
	/**
	 * Column Info
	 * @param perTpCd
	 */
	public void setPerTpCd(String perTpCd) {
		this.perTpCd = perTpCd;
	}
	
	/**
	 * Column Info
	 * @param chgFullNm
	 */
	public void setChgFullNm(String chgFullNm) {
		this.chgFullNm = chgFullNm;
	}
	
	/**
	 * Column Info
	 * @param revCoaSkdDirCd
	 */
	public void setRevCoaSkdDirCd(String revCoaSkdDirCd) {
		this.revCoaSkdDirCd = revCoaSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @param revCoaRgnCd
	 */
	public void setRevCoaRgnCd(String revCoaRgnCd) {
		this.revCoaRgnCd = revCoaRgnCd;
	}
	
	/**
	 * Column Info
	 * @param mfDivCd
	 */
	public void setMfDivCd(String mfDivCd) {
		this.mfDivCd = mfDivCd;
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
	 * @param revCoaVoyNo
	 */
	public void setRevCoaVoyNo(String revCoaVoyNo) {
		this.revCoaVoyNo = revCoaVoyNo;
	}
	
	/**
	 * Column Info
	 * @param trfNo
	 */
	public void setTrfNo(String trfNo) {
		this.trfNo = trfNo;
	}
	
	/**
	 * Column Info
	 * @param revCoaInterCoCd
	 */
	public void setRevCoaInterCoCd(String revCoaInterCoCd) {
		this.revCoaInterCoCd = revCoaInterCoCd;
	}
	
	/**
	 * Column Info
	 * @param ratAsCntrQty
	 */
	public void setRatAsCntrQty(String ratAsCntrQty) {
		this.ratAsCntrQty = ratAsCntrQty;
	}
	
	/**
	 * Column Info
	 * @param tvaFlg
	 */
	public void setTvaFlg(String tvaFlg) {
		this.tvaFlg = tvaFlg;
	}
	
	/**
	 * Column Info
	 * @param arIfSerNo
	 */
	public void setArIfSerNo(String arIfSerNo) {
		this.arIfSerNo = arIfSerNo;
	}
	
	/**
	 * Column Info
	 * @param mnlFlg
	 */
	public void setMnlFlg(String mnlFlg) {
		this.mnlFlg = mnlFlg;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setRepChgCd(JSPUtil.getParameter(request, "rep_chg_cd", ""));
		setRevCoaDirCd(JSPUtil.getParameter(request, "rev_coa_dir_cd", ""));
		setCurrCd(JSPUtil.getParameter(request, "curr_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setTrfRtAmt(JSPUtil.getParameter(request, "trf_rt_amt", ""));
		setChgSeq(JSPUtil.getParameter(request, "chg_seq", ""));
		setTjSrcNm(JSPUtil.getParameter(request, "tj_src_nm", ""));
		setChgCd(JSPUtil.getParameter(request, "chg_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setInvIssFlg(JSPUtil.getParameter(request, "inv_iss_flg", ""));
		setRevCoaAcctCd(JSPUtil.getParameter(request, "rev_coa_acct_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setArIfNo(JSPUtil.getParameter(request, "ar_if_no", ""));
		setAcctCd(JSPUtil.getParameter(request, "acct_cd", ""));
		setChgAmt(JSPUtil.getParameter(request, "chg_amt", ""));
		setRevCoaCtrCd(JSPUtil.getParameter(request, "rev_coa_ctr_cd", ""));
		setInvXchRtDt(JSPUtil.getParameter(request, "inv_xch_rt_dt", ""));
		setRevCoaCoCd(JSPUtil.getParameter(request, "rev_coa_co_cd", ""));
		setArIfChgSeq(JSPUtil.getParameter(request, "ar_if_chg_seq", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setInvXchRt(JSPUtil.getParameter(request, "inv_xch_rt", ""));
		setInvClrFlg(JSPUtil.getParameter(request, "inv_clr_flg", ""));
		setChgRmk(JSPUtil.getParameter(request, "chg_rmk", ""));
		setSobId(JSPUtil.getParameter(request, "sob_id", ""));
		setInvRevTpSrcCd(JSPUtil.getParameter(request, "inv_rev_tp_src_cd", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setRevCoaVslCd(JSPUtil.getParameter(request, "rev_coa_vsl_cd", ""));
		setPerTpCd(JSPUtil.getParameter(request, "per_tp_cd", ""));
		setChgFullNm(JSPUtil.getParameter(request, "chg_full_nm", ""));
		setRevCoaSkdDirCd(JSPUtil.getParameter(request, "rev_coa_skd_dir_cd", ""));
		setRevCoaRgnCd(JSPUtil.getParameter(request, "rev_coa_rgn_cd", ""));
		setMfDivCd(JSPUtil.getParameter(request, "mf_div_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setRevCoaVoyNo(JSPUtil.getParameter(request, "rev_coa_voy_no", ""));
		setTrfNo(JSPUtil.getParameter(request, "trf_no", ""));
		setRevCoaInterCoCd(JSPUtil.getParameter(request, "rev_coa_inter_co_cd", ""));
		setRatAsCntrQty(JSPUtil.getParameter(request, "rat_as_cntr_qty", ""));
		setTvaFlg(JSPUtil.getParameter(request, "tva_flg", ""));
		setArIfSerNo(JSPUtil.getParameter(request, "ar_if_ser_no", ""));
		setMnlFlg(JSPUtil.getParameter(request, "mnl_flg", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return InvArChgVO[]
	 */
	public InvArChgVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return InvArChgVO[]
	 */
	public InvArChgVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		InvArChgVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] repChgCd = (JSPUtil.getParameter(request, prefix	+ "rep_chg_cd", length));
			String[] revCoaDirCd = (JSPUtil.getParameter(request, prefix	+ "rev_coa_dir_cd", length));
			String[] currCd = (JSPUtil.getParameter(request, prefix	+ "curr_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] trfRtAmt = (JSPUtil.getParameter(request, prefix	+ "trf_rt_amt", length));
			String[] chgSeq = (JSPUtil.getParameter(request, prefix	+ "chg_seq", length));
			String[] tjSrcNm = (JSPUtil.getParameter(request, prefix	+ "tj_src_nm", length));
			String[] chgCd = (JSPUtil.getParameter(request, prefix	+ "chg_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] invIssFlg = (JSPUtil.getParameter(request, prefix	+ "inv_iss_flg", length));
			String[] revCoaAcctCd = (JSPUtil.getParameter(request, prefix	+ "rev_coa_acct_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] arIfNo = (JSPUtil.getParameter(request, prefix	+ "ar_if_no", length));
			String[] acctCd = (JSPUtil.getParameter(request, prefix	+ "acct_cd", length));
			String[] chgAmt = (JSPUtil.getParameter(request, prefix	+ "chg_amt", length));
			String[] revCoaCtrCd = (JSPUtil.getParameter(request, prefix	+ "rev_coa_ctr_cd", length));
			String[] invXchRtDt = (JSPUtil.getParameter(request, prefix	+ "inv_xch_rt_dt", length));
			String[] revCoaCoCd = (JSPUtil.getParameter(request, prefix	+ "rev_coa_co_cd", length));
			String[] arIfChgSeq = (JSPUtil.getParameter(request, prefix	+ "ar_if_chg_seq", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] invXchRt = (JSPUtil.getParameter(request, prefix	+ "inv_xch_rt", length));
			String[] invClrFlg = (JSPUtil.getParameter(request, prefix	+ "inv_clr_flg", length));
			String[] chgRmk = (JSPUtil.getParameter(request, prefix	+ "chg_rmk", length));
			String[] sobId = (JSPUtil.getParameter(request, prefix	+ "sob_id", length));
			String[] invRevTpSrcCd = (JSPUtil.getParameter(request, prefix	+ "inv_rev_tp_src_cd", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] revCoaVslCd = (JSPUtil.getParameter(request, prefix	+ "rev_coa_vsl_cd", length));
			String[] perTpCd = (JSPUtil.getParameter(request, prefix	+ "per_tp_cd", length));
			String[] chgFullNm = (JSPUtil.getParameter(request, prefix	+ "chg_full_nm", length));
			String[] revCoaSkdDirCd = (JSPUtil.getParameter(request, prefix	+ "rev_coa_skd_dir_cd", length));
			String[] revCoaRgnCd = (JSPUtil.getParameter(request, prefix	+ "rev_coa_rgn_cd", length));
			String[] mfDivCd = (JSPUtil.getParameter(request, prefix	+ "mf_div_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] revCoaVoyNo = (JSPUtil.getParameter(request, prefix	+ "rev_coa_voy_no", length));
			String[] trfNo = (JSPUtil.getParameter(request, prefix	+ "trf_no", length));
			String[] revCoaInterCoCd = (JSPUtil.getParameter(request, prefix	+ "rev_coa_inter_co_cd", length));
			String[] ratAsCntrQty = (JSPUtil.getParameter(request, prefix	+ "rat_as_cntr_qty", length));
			String[] tvaFlg = (JSPUtil.getParameter(request, prefix	+ "tva_flg", length));
			String[] arIfSerNo = (JSPUtil.getParameter(request, prefix	+ "ar_if_ser_no", length));
			String[] mnlFlg = (JSPUtil.getParameter(request, prefix	+ "mnl_flg", length));
			
			for (int i = 0; i < length; i++) {
				model = new InvArChgVO();
				if (repChgCd[i] != null)
					model.setRepChgCd(repChgCd[i]);
				if (revCoaDirCd[i] != null)
					model.setRevCoaDirCd(revCoaDirCd[i]);
				if (currCd[i] != null)
					model.setCurrCd(currCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (trfRtAmt[i] != null)
					model.setTrfRtAmt(trfRtAmt[i]);
				if (chgSeq[i] != null)
					model.setChgSeq(chgSeq[i]);
				if (tjSrcNm[i] != null)
					model.setTjSrcNm(tjSrcNm[i]);
				if (chgCd[i] != null)
					model.setChgCd(chgCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (invIssFlg[i] != null)
					model.setInvIssFlg(invIssFlg[i]);
				if (revCoaAcctCd[i] != null)
					model.setRevCoaAcctCd(revCoaAcctCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (arIfNo[i] != null)
					model.setArIfNo(arIfNo[i]);
				if (acctCd[i] != null)
					model.setAcctCd(acctCd[i]);
				if (chgAmt[i] != null)
					model.setChgAmt(chgAmt[i]);
				if (revCoaCtrCd[i] != null)
					model.setRevCoaCtrCd(revCoaCtrCd[i]);
				if (invXchRtDt[i] != null)
					model.setInvXchRtDt(invXchRtDt[i]);
				if (revCoaCoCd[i] != null)
					model.setRevCoaCoCd(revCoaCoCd[i]);
				if (arIfChgSeq[i] != null)
					model.setArIfChgSeq(arIfChgSeq[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (invXchRt[i] != null)
					model.setInvXchRt(invXchRt[i]);
				if (invClrFlg[i] != null)
					model.setInvClrFlg(invClrFlg[i]);
				if (chgRmk[i] != null)
					model.setChgRmk(chgRmk[i]);
				if (sobId[i] != null)
					model.setSobId(sobId[i]);
				if (invRevTpSrcCd[i] != null)
					model.setInvRevTpSrcCd(invRevTpSrcCd[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (revCoaVslCd[i] != null)
					model.setRevCoaVslCd(revCoaVslCd[i]);
				if (perTpCd[i] != null)
					model.setPerTpCd(perTpCd[i]);
				if (chgFullNm[i] != null)
					model.setChgFullNm(chgFullNm[i]);
				if (revCoaSkdDirCd[i] != null)
					model.setRevCoaSkdDirCd(revCoaSkdDirCd[i]);
				if (revCoaRgnCd[i] != null)
					model.setRevCoaRgnCd(revCoaRgnCd[i]);
				if (mfDivCd[i] != null)
					model.setMfDivCd(mfDivCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (revCoaVoyNo[i] != null)
					model.setRevCoaVoyNo(revCoaVoyNo[i]);
				if (trfNo[i] != null)
					model.setTrfNo(trfNo[i]);
				if (revCoaInterCoCd[i] != null)
					model.setRevCoaInterCoCd(revCoaInterCoCd[i]);
				if (ratAsCntrQty[i] != null)
					model.setRatAsCntrQty(ratAsCntrQty[i]);
				if (tvaFlg[i] != null)
					model.setTvaFlg(tvaFlg[i]);
				if (arIfSerNo[i] != null)
					model.setArIfSerNo(arIfSerNo[i]);
				if (mnlFlg[i] != null)
					model.setMnlFlg(mnlFlg[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getInvArChgVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return InvArChgVO[]
	 */
	public InvArChgVO[] getInvArChgVOs(){
		InvArChgVO[] vos = (InvArChgVO[])models.toArray(new InvArChgVO[models.size()]);
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
		this.repChgCd = this.repChgCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.revCoaDirCd = this.revCoaDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.currCd = this.currCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trfRtAmt = this.trfRtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chgSeq = this.chgSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tjSrcNm = this.tjSrcNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chgCd = this.chgCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invIssFlg = this.invIssFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.revCoaAcctCd = this.revCoaAcctCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arIfNo = this.arIfNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acctCd = this.acctCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chgAmt = this.chgAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.revCoaCtrCd = this.revCoaCtrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invXchRtDt = this.invXchRtDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.revCoaCoCd = this.revCoaCoCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arIfChgSeq = this.arIfChgSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invXchRt = this.invXchRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invClrFlg = this.invClrFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chgRmk = this.chgRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sobId = this.sobId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invRevTpSrcCd = this.invRevTpSrcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.revCoaVslCd = this.revCoaVslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.perTpCd = this.perTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chgFullNm = this.chgFullNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.revCoaSkdDirCd = this.revCoaSkdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.revCoaRgnCd = this.revCoaRgnCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mfDivCd = this.mfDivCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.revCoaVoyNo = this.revCoaVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trfNo = this.trfNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.revCoaInterCoCd = this.revCoaInterCoCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ratAsCntrQty = this.ratAsCntrQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tvaFlg = this.tvaFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arIfSerNo = this.arIfSerNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mnlFlg = this.mnlFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
