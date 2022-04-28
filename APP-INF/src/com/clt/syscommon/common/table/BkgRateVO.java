/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : bkgRateVO.java
*@FileTitle : bkgRateVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.11.02
*@LastModifier : 박상훈
*@LastVersion : 1.0
* 2009.11.02 박상훈 
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.common.table;

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
 * @author 박상훈
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgRateVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgRateVO> models = new ArrayList<BkgRateVO>();
	
	/* Column Info */
	private String ppdRcvOfcCd = null;
	/* Column Info */
	private String revDivCd = null;
	/* Column Info */
	private String bkgRtWhfExptCd = null;
	/* Column Info */
	private String ppdPayrCntCd = null;
	/* Column Info */
	private String rtAplyDt = null;
	/* Column Info */
	private String cltOfcCd = null;
	/* Column Info */
	private String rtBlTpCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String prcCmdtHdrSeq = null;
	/* Column Info */
	private String cltPayrCustSeq = null;
	/* Column Info */
	private String cgoRcvDt = null;
	/* Column Info */
	private String cltPayrCntCd = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String bkgCtrtTpCd = null;
	/* Column Info */
	private String prcGenSpclRtTpCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String frtTermCd = null;
	/* Column Info */
	private String prcRoutSeq = null;
	/* Column Info */
	private String trfLnrItmNo = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String diffRmk = null;
	/* Column Info */
	private String audPrfmFlg = null;
	/* Column Info */
	private String prcRtMtchPattCd = null;
	/* Column Info */
	private String whfShprRgstNo = null;
	/* Column Info */
	private String ppdPayrCustSeq = null;
	/* Column Info */
	private String docLocCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgRateVO() {}

	public BkgRateVO(String ibflag, String pagerows, String bkgNo, String rtBlTpCd, String frtTermCd, String bkgCtrtTpCd, String ppdRcvOfcCd, String ppdPayrCntCd, String ppdPayrCustSeq, String cltOfcCd, String cltPayrCntCd, String cltPayrCustSeq, String revDivCd, String bkgRtWhfExptCd, String whfShprRgstNo, String rtAplyDt, String cgoRcvDt, String diffRmk, String audPrfmFlg, String creUsrId, String creDt, String updUsrId, String updDt, String prcRtMtchPattCd, String prcGenSpclRtTpCd, String prcCmdtHdrSeq, String prcRoutSeq, String trfLnrItmNo, String docLocCd) {
		this.ppdRcvOfcCd = ppdRcvOfcCd;
		this.revDivCd = revDivCd;
		this.bkgRtWhfExptCd = bkgRtWhfExptCd;
		this.ppdPayrCntCd = ppdPayrCntCd;
		this.rtAplyDt = rtAplyDt;
		this.cltOfcCd = cltOfcCd;
		this.rtBlTpCd = rtBlTpCd;
		this.creDt = creDt;
		this.prcCmdtHdrSeq = prcCmdtHdrSeq;
		this.cltPayrCustSeq = cltPayrCustSeq;
		this.cgoRcvDt = cgoRcvDt;
		this.cltPayrCntCd = cltPayrCntCd;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.bkgCtrtTpCd = bkgCtrtTpCd;
		this.prcGenSpclRtTpCd = prcGenSpclRtTpCd;
		this.updUsrId = updUsrId;
		this.updDt = updDt;
		this.frtTermCd = frtTermCd;
		this.prcRoutSeq = prcRoutSeq;
		this.trfLnrItmNo = trfLnrItmNo;
		this.bkgNo = bkgNo;
		this.creUsrId = creUsrId;
		this.diffRmk = diffRmk;
		this.audPrfmFlg = audPrfmFlg;
		this.prcRtMtchPattCd = prcRtMtchPattCd;
		this.whfShprRgstNo = whfShprRgstNo;
		this.ppdPayrCustSeq = ppdPayrCustSeq;
		this.docLocCd = docLocCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("ppd_rcv_ofc_cd", getPpdRcvOfcCd());
		this.hashColumns.put("rev_div_cd", getRevDivCd());
		this.hashColumns.put("bkg_rt_whf_expt_cd", getBkgRtWhfExptCd());
		this.hashColumns.put("ppd_payr_cnt_cd", getPpdPayrCntCd());
		this.hashColumns.put("rt_aply_dt", getRtAplyDt());
		this.hashColumns.put("clt_ofc_cd", getCltOfcCd());
		this.hashColumns.put("rt_bl_tp_cd", getRtBlTpCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("prc_cmdt_hdr_seq", getPrcCmdtHdrSeq());
		this.hashColumns.put("clt_payr_cust_seq", getCltPayrCustSeq());
		this.hashColumns.put("cgo_rcv_dt", getCgoRcvDt());
		this.hashColumns.put("clt_payr_cnt_cd", getCltPayrCntCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("bkg_ctrt_tp_cd", getBkgCtrtTpCd());
		this.hashColumns.put("prc_gen_spcl_rt_tp_cd", getPrcGenSpclRtTpCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("frt_term_cd", getFrtTermCd());
		this.hashColumns.put("prc_rout_seq", getPrcRoutSeq());
		this.hashColumns.put("trf_lnr_itm_no", getTrfLnrItmNo());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("diff_rmk", getDiffRmk());
		this.hashColumns.put("aud_prfm_flg", getAudPrfmFlg());
		this.hashColumns.put("prc_rt_mtch_patt_cd", getPrcRtMtchPattCd());
		this.hashColumns.put("whf_shpr_rgst_no", getWhfShprRgstNo());
		this.hashColumns.put("ppd_payr_cust_seq", getPpdPayrCustSeq());
		this.hashColumns.put("doc_loc_cd", getDocLocCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("ppd_rcv_ofc_cd", "ppdRcvOfcCd");
		this.hashFields.put("rev_div_cd", "revDivCd");
		this.hashFields.put("bkg_rt_whf_expt_cd", "bkgRtWhfExptCd");
		this.hashFields.put("ppd_payr_cnt_cd", "ppdPayrCntCd");
		this.hashFields.put("rt_aply_dt", "rtAplyDt");
		this.hashFields.put("clt_ofc_cd", "cltOfcCd");
		this.hashFields.put("rt_bl_tp_cd", "rtBlTpCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("prc_cmdt_hdr_seq", "prcCmdtHdrSeq");
		this.hashFields.put("clt_payr_cust_seq", "cltPayrCustSeq");
		this.hashFields.put("cgo_rcv_dt", "cgoRcvDt");
		this.hashFields.put("clt_payr_cnt_cd", "cltPayrCntCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("bkg_ctrt_tp_cd", "bkgCtrtTpCd");
		this.hashFields.put("prc_gen_spcl_rt_tp_cd", "prcGenSpclRtTpCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("frt_term_cd", "frtTermCd");
		this.hashFields.put("prc_rout_seq", "prcRoutSeq");
		this.hashFields.put("trf_lnr_itm_no", "trfLnrItmNo");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("diff_rmk", "diffRmk");
		this.hashFields.put("aud_prfm_flg", "audPrfmFlg");
		this.hashFields.put("prc_rt_mtch_patt_cd", "prcRtMtchPattCd");
		this.hashFields.put("whf_shpr_rgst_no", "whfShprRgstNo");
		this.hashFields.put("ppd_payr_cust_seq", "ppdPayrCustSeq");
		this.hashFields.put("doc_loc_cd", "docLocCd");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return ppdRcvOfcCd
	 */
	public String getPpdRcvOfcCd() {
		return this.ppdRcvOfcCd;
	}
	
	/**
	 * Column Info
	 * @return revDivCd
	 */
	public String getRevDivCd() {
		return this.revDivCd;
	}
	
	/**
	 * Column Info
	 * @return bkgRtWhfExptCd
	 */
	public String getBkgRtWhfExptCd() {
		return this.bkgRtWhfExptCd;
	}
	
	/**
	 * Column Info
	 * @return ppdPayrCntCd
	 */
	public String getPpdPayrCntCd() {
		return this.ppdPayrCntCd;
	}
	
	/**
	 * Column Info
	 * @return rtAplyDt
	 */
	public String getRtAplyDt() {
		return this.rtAplyDt;
	}
	
	/**
	 * Column Info
	 * @return cltOfcCd
	 */
	public String getCltOfcCd() {
		return this.cltOfcCd;
	}
	
	/**
	 * Column Info
	 * @return rtBlTpCd
	 */
	public String getRtBlTpCd() {
		return this.rtBlTpCd;
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
	 * @return prcCmdtHdrSeq
	 */
	public String getPrcCmdtHdrSeq() {
		return this.prcCmdtHdrSeq;
	}
	
	/**
	 * Column Info
	 * @return cltPayrCustSeq
	 */
	public String getCltPayrCustSeq() {
		return this.cltPayrCustSeq;
	}
	
	/**
	 * Column Info
	 * @return cgoRcvDt
	 */
	public String getCgoRcvDt() {
		return this.cgoRcvDt;
	}
	
	/**
	 * Column Info
	 * @return cltPayrCntCd
	 */
	public String getCltPayrCntCd() {
		return this.cltPayrCntCd;
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
	 * @return bkgCtrtTpCd
	 */
	public String getBkgCtrtTpCd() {
		return this.bkgCtrtTpCd;
	}
	
	/**
	 * Column Info
	 * @return prcGenSpclRtTpCd
	 */
	public String getPrcGenSpclRtTpCd() {
		return this.prcGenSpclRtTpCd;
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
	 * @return frtTermCd
	 */
	public String getFrtTermCd() {
		return this.frtTermCd;
	}
	
	/**
	 * Column Info
	 * @return prcRoutSeq
	 */
	public String getPrcRoutSeq() {
		return this.prcRoutSeq;
	}
	
	/**
	 * Column Info
	 * @return trfLnrItmNo
	 */
	public String getTrfLnrItmNo() {
		return this.trfLnrItmNo;
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
	 * @return diffRmk
	 */
	public String getDiffRmk() {
		return this.diffRmk;
	}
	
	/**
	 * Column Info
	 * @return audPrfmFlg
	 */
	public String getAudPrfmFlg() {
		return this.audPrfmFlg;
	}
	
	/**
	 * Column Info
	 * @return prcRtMtchPattCd
	 */
	public String getPrcRtMtchPattCd() {
		return this.prcRtMtchPattCd;
	}
	
	/**
	 * Column Info
	 * @return whfShprRgstNo
	 */
	public String getWhfShprRgstNo() {
		return this.whfShprRgstNo;
	}
	
	/**
	 * Column Info
	 * @return ppdPayrCustSeq
	 */
	public String getPpdPayrCustSeq() {
		return this.ppdPayrCustSeq;
	}
	

	/**
	 * Column Info
	 * @param ppdRcvOfcCd
	 */
	public void setPpdRcvOfcCd(String ppdRcvOfcCd) {
		this.ppdRcvOfcCd = ppdRcvOfcCd;
	}
	
	/**
	 * Column Info
	 * @param revDivCd
	 */
	public void setRevDivCd(String revDivCd) {
		this.revDivCd = revDivCd;
	}
	
	/**
	 * Column Info
	 * @param bkgRtWhfExptCd
	 */
	public void setBkgRtWhfExptCd(String bkgRtWhfExptCd) {
		this.bkgRtWhfExptCd = bkgRtWhfExptCd;
	}
	
	/**
	 * Column Info
	 * @param ppdPayrCntCd
	 */
	public void setPpdPayrCntCd(String ppdPayrCntCd) {
		this.ppdPayrCntCd = ppdPayrCntCd;
	}
	
	/**
	 * Column Info
	 * @param rtAplyDt
	 */
	public void setRtAplyDt(String rtAplyDt) {
		this.rtAplyDt = rtAplyDt;
	}
	
	/**
	 * Column Info
	 * @param cltOfcCd
	 */
	public void setCltOfcCd(String cltOfcCd) {
		this.cltOfcCd = cltOfcCd;
	}
	
	/**
	 * Column Info
	 * @param rtBlTpCd
	 */
	public void setRtBlTpCd(String rtBlTpCd) {
		this.rtBlTpCd = rtBlTpCd;
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
	 * @param prcCmdtHdrSeq
	 */
	public void setPrcCmdtHdrSeq(String prcCmdtHdrSeq) {
		this.prcCmdtHdrSeq = prcCmdtHdrSeq;
	}
	
	/**
	 * Column Info
	 * @param cltPayrCustSeq
	 */
	public void setCltPayrCustSeq(String cltPayrCustSeq) {
		this.cltPayrCustSeq = cltPayrCustSeq;
	}
	
	/**
	 * Column Info
	 * @param cgoRcvDt
	 */
	public void setCgoRcvDt(String cgoRcvDt) {
		this.cgoRcvDt = cgoRcvDt;
	}
	
	/**
	 * Column Info
	 * @param cltPayrCntCd
	 */
	public void setCltPayrCntCd(String cltPayrCntCd) {
		this.cltPayrCntCd = cltPayrCntCd;
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
	 * @param bkgCtrtTpCd
	 */
	public void setBkgCtrtTpCd(String bkgCtrtTpCd) {
		this.bkgCtrtTpCd = bkgCtrtTpCd;
	}
	
	/**
	 * Column Info
	 * @param prcGenSpclRtTpCd
	 */
	public void setPrcGenSpclRtTpCd(String prcGenSpclRtTpCd) {
		this.prcGenSpclRtTpCd = prcGenSpclRtTpCd;
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
	 * @param frtTermCd
	 */
	public void setFrtTermCd(String frtTermCd) {
		this.frtTermCd = frtTermCd;
	}
	
	/**
	 * Column Info
	 * @param prcRoutSeq
	 */
	public void setPrcRoutSeq(String prcRoutSeq) {
		this.prcRoutSeq = prcRoutSeq;
	}
	
	/**
	 * Column Info
	 * @param trfLnrItmNo
	 */
	public void setTrfLnrItmNo(String trfLnrItmNo) {
		this.trfLnrItmNo = trfLnrItmNo;
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
	 * @param diffRmk
	 */
	public void setDiffRmk(String diffRmk) {
		this.diffRmk = diffRmk;
	}
	
	/**
	 * Column Info
	 * @param audPrfmFlg
	 */
	public void setAudPrfmFlg(String audPrfmFlg) {
		this.audPrfmFlg = audPrfmFlg;
	}
	
	/**
	 * Column Info
	 * @param prcRtMtchPattCd
	 */
	public void setPrcRtMtchPattCd(String prcRtMtchPattCd) {
		this.prcRtMtchPattCd = prcRtMtchPattCd;
	}
	
	/**
	 * Column Info
	 * @param whfShprRgstNo
	 */
	public void setWhfShprRgstNo(String whfShprRgstNo) {
		this.whfShprRgstNo = whfShprRgstNo;
	}
	
	/**
	 * Column Info
	 * @param ppdPayrCustSeq
	 */
	public void setPpdPayrCustSeq(String ppdPayrCustSeq) {
		this.ppdPayrCustSeq = ppdPayrCustSeq;
	}
	
	
	/**
	 * @return the docLocCd
	 */
	public String getDocLocCd() {
		return docLocCd;
	}

	/**
	 * @param docLocCd the docLocCd to set
	 */
	public void setDocLocCd(String docLocCd) {
		this.docLocCd = docLocCd;
	}

	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setPpdRcvOfcCd(JSPUtil.getParameter(request, "ppd_rcv_ofc_cd", ""));
		setRevDivCd(JSPUtil.getParameter(request, "rev_div_cd", ""));
		setBkgRtWhfExptCd(JSPUtil.getParameter(request, "bkg_rt_whf_expt_cd", ""));
		setPpdPayrCntCd(JSPUtil.getParameter(request, "ppd_payr_cnt_cd", ""));
		setRtAplyDt(JSPUtil.getParameter(request, "rt_aply_dt", ""));
		setCltOfcCd(JSPUtil.getParameter(request, "clt_ofc_cd", ""));
		setRtBlTpCd(JSPUtil.getParameter(request, "rt_bl_tp_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setPrcCmdtHdrSeq(JSPUtil.getParameter(request, "prc_cmdt_hdr_seq", ""));
		setCltPayrCustSeq(JSPUtil.getParameter(request, "clt_payr_cust_seq", ""));
		setCgoRcvDt(JSPUtil.getParameter(request, "cgo_rcv_dt", ""));
		setCltPayrCntCd(JSPUtil.getParameter(request, "clt_payr_cnt_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setBkgCtrtTpCd(JSPUtil.getParameter(request, "bkg_ctrt_tp_cd", ""));
		setPrcGenSpclRtTpCd(JSPUtil.getParameter(request, "prc_gen_spcl_rt_tp_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setFrtTermCd(JSPUtil.getParameter(request, "frt_term_cd", ""));
		setPrcRoutSeq(JSPUtil.getParameter(request, "prc_rout_seq", ""));
		setTrfLnrItmNo(JSPUtil.getParameter(request, "trf_lnr_itm_no", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setDiffRmk(JSPUtil.getParameter(request, "diff_rmk", ""));
		setAudPrfmFlg(JSPUtil.getParameter(request, "aud_prfm_flg", ""));
		setPrcRtMtchPattCd(JSPUtil.getParameter(request, "prc_rt_mtch_patt_cd", ""));
		setWhfShprRgstNo(JSPUtil.getParameter(request, "whf_shpr_rgst_no", ""));
		setPpdPayrCustSeq(JSPUtil.getParameter(request, "ppd_payr_cust_seq", ""));
		setDocLocCd(JSPUtil.getParameter(request, "doc_loc_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return bkgRateVO[]
	 */
	public BkgRateVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgRateVO[]
	 */
	public BkgRateVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgRateVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] ppdRcvOfcCd = (JSPUtil.getParameter(request, prefix	+ "ppd_rcv_ofc_cd", length));
			String[] revDivCd = (JSPUtil.getParameter(request, prefix	+ "rev_div_cd", length));
			String[] bkgRtWhfExptCd = (JSPUtil.getParameter(request, prefix	+ "bkg_rt_whf_expt_cd", length));
			String[] ppdPayrCntCd = (JSPUtil.getParameter(request, prefix	+ "ppd_payr_cnt_cd", length));
			String[] rtAplyDt = (JSPUtil.getParameter(request, prefix	+ "rt_aply_dt", length));
			String[] cltOfcCd = (JSPUtil.getParameter(request, prefix	+ "clt_ofc_cd", length));
			String[] rtBlTpCd = (JSPUtil.getParameter(request, prefix	+ "rt_bl_tp_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] prcCmdtHdrSeq = (JSPUtil.getParameter(request, prefix	+ "prc_cmdt_hdr_seq", length));
			String[] cltPayrCustSeq = (JSPUtil.getParameter(request, prefix	+ "clt_payr_cust_seq", length));
			String[] cgoRcvDt = (JSPUtil.getParameter(request, prefix	+ "cgo_rcv_dt", length));
			String[] cltPayrCntCd = (JSPUtil.getParameter(request, prefix	+ "clt_payr_cnt_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] bkgCtrtTpCd = (JSPUtil.getParameter(request, prefix	+ "bkg_ctrt_tp_cd", length));
			String[] prcGenSpclRtTpCd = (JSPUtil.getParameter(request, prefix	+ "prc_gen_spcl_rt_tp_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] frtTermCd = (JSPUtil.getParameter(request, prefix	+ "frt_term_cd", length));
			String[] prcRoutSeq = (JSPUtil.getParameter(request, prefix	+ "prc_rout_seq", length));
			String[] trfLnrItmNo = (JSPUtil.getParameter(request, prefix	+ "trf_lnr_itm_no", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] diffRmk = (JSPUtil.getParameter(request, prefix	+ "diff_rmk", length));
			String[] audPrfmFlg = (JSPUtil.getParameter(request, prefix	+ "aud_prfm_flg", length));
			String[] prcRtMtchPattCd = (JSPUtil.getParameter(request, prefix	+ "prc_rt_mtch_patt_cd", length));
			String[] whfShprRgstNo = (JSPUtil.getParameter(request, prefix	+ "whf_shpr_rgst_no", length));
			String[] ppdPayrCustSeq = (JSPUtil.getParameter(request, prefix	+ "ppd_payr_cust_seq", length));
			String[] docLocCd = (JSPUtil.getParameter(request, prefix	+ "doc_loc_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgRateVO();
				if (ppdRcvOfcCd[i] != null)
					model.setPpdRcvOfcCd(ppdRcvOfcCd[i]);
				if (revDivCd[i] != null)
					model.setRevDivCd(revDivCd[i]);
				if (bkgRtWhfExptCd[i] != null)
					model.setBkgRtWhfExptCd(bkgRtWhfExptCd[i]);
				if (ppdPayrCntCd[i] != null)
					model.setPpdPayrCntCd(ppdPayrCntCd[i]);
				if (rtAplyDt[i] != null)
					model.setRtAplyDt(rtAplyDt[i]);
				if (cltOfcCd[i] != null)
					model.setCltOfcCd(cltOfcCd[i]);
				if (rtBlTpCd[i] != null)
					model.setRtBlTpCd(rtBlTpCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (prcCmdtHdrSeq[i] != null)
					model.setPrcCmdtHdrSeq(prcCmdtHdrSeq[i]);
				if (cltPayrCustSeq[i] != null)
					model.setCltPayrCustSeq(cltPayrCustSeq[i]);
				if (cgoRcvDt[i] != null)
					model.setCgoRcvDt(cgoRcvDt[i]);
				if (cltPayrCntCd[i] != null)
					model.setCltPayrCntCd(cltPayrCntCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (bkgCtrtTpCd[i] != null)
					model.setBkgCtrtTpCd(bkgCtrtTpCd[i]);
				if (prcGenSpclRtTpCd[i] != null)
					model.setPrcGenSpclRtTpCd(prcGenSpclRtTpCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (frtTermCd[i] != null)
					model.setFrtTermCd(frtTermCd[i]);
				if (prcRoutSeq[i] != null)
					model.setPrcRoutSeq(prcRoutSeq[i]);
				if (trfLnrItmNo[i] != null)
					model.setTrfLnrItmNo(trfLnrItmNo[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (diffRmk[i] != null)
					model.setDiffRmk(diffRmk[i]);
				if (audPrfmFlg[i] != null)
					model.setAudPrfmFlg(audPrfmFlg[i]);
				if (prcRtMtchPattCd[i] != null)
					model.setPrcRtMtchPattCd(prcRtMtchPattCd[i]);
				if (whfShprRgstNo[i] != null)
					model.setWhfShprRgstNo(whfShprRgstNo[i]);
				if (ppdPayrCustSeq[i] != null)
					model.setPpdPayrCustSeq(ppdPayrCustSeq[i]);
				if (docLocCd[i] != null)
					model.setDocLocCd(docLocCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgRateVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgRateVO[]
	 */
	public BkgRateVO[] getBkgRateVOs(){
		BkgRateVO[] vos = (BkgRateVO[])models.toArray(new BkgRateVO[models.size()]);
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
		this.ppdRcvOfcCd = this.ppdRcvOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.revDivCd = this.revDivCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgRtWhfExptCd = this.bkgRtWhfExptCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ppdPayrCntCd = this.ppdPayrCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rtAplyDt = this.rtAplyDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cltOfcCd = this.cltOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rtBlTpCd = this.rtBlTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prcCmdtHdrSeq = this.prcCmdtHdrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cltPayrCustSeq = this.cltPayrCustSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cgoRcvDt = this.cgoRcvDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cltPayrCntCd = this.cltPayrCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgCtrtTpCd = this.bkgCtrtTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prcGenSpclRtTpCd = this.prcGenSpclRtTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.frtTermCd = this.frtTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prcRoutSeq = this.prcRoutSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trfLnrItmNo = this.trfLnrItmNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.diffRmk = this.diffRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.audPrfmFlg = this.audPrfmFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prcRtMtchPattCd = this.prcRtMtchPattCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.whfShprRgstNo = this.whfShprRgstNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ppdPayrCustSeq = this.ppdPayrCustSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.docLocCd = this.docLocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
