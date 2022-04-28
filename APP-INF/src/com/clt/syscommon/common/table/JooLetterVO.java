/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : JooLetterVO.java
*@FileTitle : JooLetterVO
*Open Issues :
*Change history :
*@LastModifyDate : 2010.01.13
*@LastModifier : 장강철
*@LastVersion : 1.0
* 2010.01.13 장강철 
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
 * @author 장강철
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class JooLetterVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<JooLetterVO> models = new ArrayList<JooLetterVO>();
	
	/* Column Info */
	private String joLtrNo = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String ccRcvrEmlCtnt = null;
	/* Column Info */
	private String trdCd = null;
	/* Column Info */
	private String n3rdStmtCtnt = null;
	/* Column Info */
	private String sndrEml = null;
	/* Column Info */
	private String sigStmtCtnt = null;
	/* Column Info */
	private String n2ndStmtCtnt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String emlProcStsCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String emlDt = null;
	/* Column Info */
	private String ttlStlAmt = null;
	/* Column Info */
	private String n1stStmtCtnt = null;
	/* Column Info */
	private String faxDt = null;
	/* Column Info */
	private String ofcAddr = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String joLtrTmpltSeq = null;
	/* Column Info */
	private String ltrRcvrCoNm = null;
	/* Column Info */
	private String ltrIssDt = null;
	/* Column Info */
	private String emlSndNo = null;
	/* Column Info */
	private String ltrSndrCoNm = null;
	/* Column Info */
	private String ltrTitCtnt = null;
	/* Column Info */
	private String ofcCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String rcvrEml = null;
	/* Column Info */
	private String bankStmtCtnt = null;
	/* Column Info */
	private String ltrCcRcvrCntcPsonNmCtnt = null;
	/* Column Info */
	private String joLtrTpCd = null;
	/* Column Info */
	private String rcvrInfoCtnt = null;
	/* Column Info */
	private String joLtrSeq = null;
	/* Column Info */
	private String faxProcStsCd = null;
	/* Column Info */
	private String joCntcFaxNoCtnt = null;
	/* Column Info */
	private String sndrNm = null;
	/* Column Info */
	private String faxSndNo = null;
	/* Column Info */
	private String joSndMzdCd = null;
	/* Column Info */
	private String ltrRcvrCntcPsonNm = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public JooLetterVO() {}

	public JooLetterVO(String ibflag, String pagerows, String joLtrSeq, String joLtrTpCd, String trdCd, String ofcCd, String ltrIssDt, String ltrRcvrCoNm, String ltrRcvrCntcPsonNm, String ltrCcRcvrCntcPsonNmCtnt, String ltrSndrCoNm, String sndrNm, String ltrTitCtnt, String ttlStlAmt, String joSndMzdCd, String joLtrNo, String ofcAddr, String n1stStmtCtnt, String n2ndStmtCtnt, String n3rdStmtCtnt, String sigStmtCtnt, String sndrEml, String rcvrEml, String ccRcvrEmlCtnt, String emlProcStsCd, String emlSndNo, String emlDt, String joCntcFaxNoCtnt, String rcvrInfoCtnt, String faxProcStsCd, String faxSndNo, String faxDt, String deltFlg, String creDt, String creUsrId, String updDt, String updUsrId, String joLtrTmpltSeq, String bankStmtCtnt) {
		this.joLtrNo = joLtrNo;
		this.deltFlg = deltFlg;
		this.creDt = creDt;
		this.ccRcvrEmlCtnt = ccRcvrEmlCtnt;
		this.trdCd = trdCd;
		this.n3rdStmtCtnt = n3rdStmtCtnt;
		this.sndrEml = sndrEml;
		this.sigStmtCtnt = sigStmtCtnt;
		this.n2ndStmtCtnt = n2ndStmtCtnt;
		this.pagerows = pagerows;
		this.emlProcStsCd = emlProcStsCd;
		this.ibflag = ibflag;
		this.emlDt = emlDt;
		this.ttlStlAmt = ttlStlAmt;
		this.n1stStmtCtnt = n1stStmtCtnt;
		this.faxDt = faxDt;
		this.ofcAddr = ofcAddr;
		this.updUsrId = updUsrId;
		this.updDt = updDt;
		this.joLtrTmpltSeq = joLtrTmpltSeq;
		this.ltrRcvrCoNm = ltrRcvrCoNm;
		this.ltrIssDt = ltrIssDt;
		this.emlSndNo = emlSndNo;
		this.ltrSndrCoNm = ltrSndrCoNm;
		this.ltrTitCtnt = ltrTitCtnt;
		this.ofcCd = ofcCd;
		this.creUsrId = creUsrId;
		this.rcvrEml = rcvrEml;
		this.bankStmtCtnt = bankStmtCtnt;
		this.ltrCcRcvrCntcPsonNmCtnt = ltrCcRcvrCntcPsonNmCtnt;
		this.joLtrTpCd = joLtrTpCd;
		this.rcvrInfoCtnt = rcvrInfoCtnt;
		this.joLtrSeq = joLtrSeq;
		this.faxProcStsCd = faxProcStsCd;
		this.joCntcFaxNoCtnt = joCntcFaxNoCtnt;
		this.sndrNm = sndrNm;
		this.faxSndNo = faxSndNo;
		this.joSndMzdCd = joSndMzdCd;
		this.ltrRcvrCntcPsonNm = ltrRcvrCntcPsonNm;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("jo_ltr_no", getJoLtrNo());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("cc_rcvr_eml_ctnt", getCcRcvrEmlCtnt());
		this.hashColumns.put("trd_cd", getTrdCd());
		this.hashColumns.put("n3rd_stmt_ctnt", getN3rdStmtCtnt());
		this.hashColumns.put("sndr_eml", getSndrEml());
		this.hashColumns.put("sig_stmt_ctnt", getSigStmtCtnt());
		this.hashColumns.put("n2nd_stmt_ctnt", getN2ndStmtCtnt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("eml_proc_sts_cd", getEmlProcStsCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("eml_dt", getEmlDt());
		this.hashColumns.put("ttl_stl_amt", getTtlStlAmt());
		this.hashColumns.put("n1st_stmt_ctnt", getN1stStmtCtnt());
		this.hashColumns.put("fax_dt", getFaxDt());
		this.hashColumns.put("ofc_addr", getOfcAddr());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("jo_ltr_tmplt_seq", getJoLtrTmpltSeq());
		this.hashColumns.put("ltr_rcvr_co_nm", getLtrRcvrCoNm());
		this.hashColumns.put("ltr_iss_dt", getLtrIssDt());
		this.hashColumns.put("eml_snd_no", getEmlSndNo());
		this.hashColumns.put("ltr_sndr_co_nm", getLtrSndrCoNm());
		this.hashColumns.put("ltr_tit_ctnt", getLtrTitCtnt());
		this.hashColumns.put("ofc_cd", getOfcCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("rcvr_eml", getRcvrEml());
		this.hashColumns.put("bank_stmt_ctnt", getBankStmtCtnt());
		this.hashColumns.put("ltr_cc_rcvr_cntc_pson_nm_ctnt", getLtrCcRcvrCntcPsonNmCtnt());
		this.hashColumns.put("jo_ltr_tp_cd", getJoLtrTpCd());
		this.hashColumns.put("rcvr_info_ctnt", getRcvrInfoCtnt());
		this.hashColumns.put("jo_ltr_seq", getJoLtrSeq());
		this.hashColumns.put("fax_proc_sts_cd", getFaxProcStsCd());
		this.hashColumns.put("jo_cntc_fax_no_ctnt", getJoCntcFaxNoCtnt());
		this.hashColumns.put("sndr_nm", getSndrNm());
		this.hashColumns.put("fax_snd_no", getFaxSndNo());
		this.hashColumns.put("jo_snd_mzd_cd", getJoSndMzdCd());
		this.hashColumns.put("ltr_rcvr_cntc_pson_nm", getLtrRcvrCntcPsonNm());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("jo_ltr_no", "joLtrNo");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("cc_rcvr_eml_ctnt", "ccRcvrEmlCtnt");
		this.hashFields.put("trd_cd", "trdCd");
		this.hashFields.put("n3rd_stmt_ctnt", "n3rdStmtCtnt");
		this.hashFields.put("sndr_eml", "sndrEml");
		this.hashFields.put("sig_stmt_ctnt", "sigStmtCtnt");
		this.hashFields.put("n2nd_stmt_ctnt", "n2ndStmtCtnt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("eml_proc_sts_cd", "emlProcStsCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("eml_dt", "emlDt");
		this.hashFields.put("ttl_stl_amt", "ttlStlAmt");
		this.hashFields.put("n1st_stmt_ctnt", "n1stStmtCtnt");
		this.hashFields.put("fax_dt", "faxDt");
		this.hashFields.put("ofc_addr", "ofcAddr");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("jo_ltr_tmplt_seq", "joLtrTmpltSeq");
		this.hashFields.put("ltr_rcvr_co_nm", "ltrRcvrCoNm");
		this.hashFields.put("ltr_iss_dt", "ltrIssDt");
		this.hashFields.put("eml_snd_no", "emlSndNo");
		this.hashFields.put("ltr_sndr_co_nm", "ltrSndrCoNm");
		this.hashFields.put("ltr_tit_ctnt", "ltrTitCtnt");
		this.hashFields.put("ofc_cd", "ofcCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("rcvr_eml", "rcvrEml");
		this.hashFields.put("bank_stmt_ctnt", "bankStmtCtnt");
		this.hashFields.put("ltr_cc_rcvr_cntc_pson_nm_ctnt", "ltrCcRcvrCntcPsonNmCtnt");
		this.hashFields.put("jo_ltr_tp_cd", "joLtrTpCd");
		this.hashFields.put("rcvr_info_ctnt", "rcvrInfoCtnt");
		this.hashFields.put("jo_ltr_seq", "joLtrSeq");
		this.hashFields.put("fax_proc_sts_cd", "faxProcStsCd");
		this.hashFields.put("jo_cntc_fax_no_ctnt", "joCntcFaxNoCtnt");
		this.hashFields.put("sndr_nm", "sndrNm");
		this.hashFields.put("fax_snd_no", "faxSndNo");
		this.hashFields.put("jo_snd_mzd_cd", "joSndMzdCd");
		this.hashFields.put("ltr_rcvr_cntc_pson_nm", "ltrRcvrCntcPsonNm");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return joLtrNo
	 */
	public String getJoLtrNo() {
		return this.joLtrNo;
	}
	
	/**
	 * Column Info
	 * @return deltFlg
	 */
	public String getDeltFlg() {
		return this.deltFlg;
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
	 * @return ccRcvrEmlCtnt
	 */
	public String getCcRcvrEmlCtnt() {
		return this.ccRcvrEmlCtnt;
	}
	
	/**
	 * Column Info
	 * @return trdCd
	 */
	public String getTrdCd() {
		return this.trdCd;
	}
	
	/**
	 * Column Info
	 * @return n3rdStmtCtnt
	 */
	public String getN3rdStmtCtnt() {
		return this.n3rdStmtCtnt;
	}
	
	/**
	 * Column Info
	 * @return sndrEml
	 */
	public String getSndrEml() {
		return this.sndrEml;
	}
	
	/**
	 * Column Info
	 * @return sigStmtCtnt
	 */
	public String getSigStmtCtnt() {
		return this.sigStmtCtnt;
	}
	
	/**
	 * Column Info
	 * @return n2ndStmtCtnt
	 */
	public String getN2ndStmtCtnt() {
		return this.n2ndStmtCtnt;
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
	 * @return emlProcStsCd
	 */
	public String getEmlProcStsCd() {
		return this.emlProcStsCd;
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
	 * @return emlDt
	 */
	public String getEmlDt() {
		return this.emlDt;
	}
	
	/**
	 * Column Info
	 * @return ttlStlAmt
	 */
	public String getTtlStlAmt() {
		return this.ttlStlAmt;
	}
	
	/**
	 * Column Info
	 * @return n1stStmtCtnt
	 */
	public String getN1stStmtCtnt() {
		return this.n1stStmtCtnt;
	}
	
	/**
	 * Column Info
	 * @return faxDt
	 */
	public String getFaxDt() {
		return this.faxDt;
	}
	
	/**
	 * Column Info
	 * @return ofcAddr
	 */
	public String getOfcAddr() {
		return this.ofcAddr;
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
	 * @return joLtrTmpltSeq
	 */
	public String getJoLtrTmpltSeq() {
		return this.joLtrTmpltSeq;
	}
	
	/**
	 * Column Info
	 * @return ltrRcvrCoNm
	 */
	public String getLtrRcvrCoNm() {
		return this.ltrRcvrCoNm;
	}
	
	/**
	 * Column Info
	 * @return ltrIssDt
	 */
	public String getLtrIssDt() {
		return this.ltrIssDt;
	}
	
	/**
	 * Column Info
	 * @return emlSndNo
	 */
	public String getEmlSndNo() {
		return this.emlSndNo;
	}
	
	/**
	 * Column Info
	 * @return ltrSndrCoNm
	 */
	public String getLtrSndrCoNm() {
		return this.ltrSndrCoNm;
	}
	
	/**
	 * Column Info
	 * @return ltrTitCtnt
	 */
	public String getLtrTitCtnt() {
		return this.ltrTitCtnt;
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
	 * @return rcvrEml
	 */
	public String getRcvrEml() {
		return this.rcvrEml;
	}
	
	/**
	 * Column Info
	 * @return bankStmtCtnt
	 */
	public String getBankStmtCtnt() {
		return this.bankStmtCtnt;
	}
	
	/**
	 * Column Info
	 * @return ltrCcRcvrCntcPsonNmCtnt
	 */
	public String getLtrCcRcvrCntcPsonNmCtnt() {
		return this.ltrCcRcvrCntcPsonNmCtnt;
	}
	
	/**
	 * Column Info
	 * @return joLtrTpCd
	 */
	public String getJoLtrTpCd() {
		return this.joLtrTpCd;
	}
	
	/**
	 * Column Info
	 * @return rcvrInfoCtnt
	 */
	public String getRcvrInfoCtnt() {
		return this.rcvrInfoCtnt;
	}
	
	/**
	 * Column Info
	 * @return joLtrSeq
	 */
	public String getJoLtrSeq() {
		return this.joLtrSeq;
	}
	
	/**
	 * Column Info
	 * @return faxProcStsCd
	 */
	public String getFaxProcStsCd() {
		return this.faxProcStsCd;
	}
	
	/**
	 * Column Info
	 * @return joCntcFaxNoCtnt
	 */
	public String getJoCntcFaxNoCtnt() {
		return this.joCntcFaxNoCtnt;
	}
	
	/**
	 * Column Info
	 * @return sndrNm
	 */
	public String getSndrNm() {
		return this.sndrNm;
	}
	
	/**
	 * Column Info
	 * @return faxSndNo
	 */
	public String getFaxSndNo() {
		return this.faxSndNo;
	}
	
	/**
	 * Column Info
	 * @return joSndMzdCd
	 */
	public String getJoSndMzdCd() {
		return this.joSndMzdCd;
	}
	
	/**
	 * Column Info
	 * @return ltrRcvrCntcPsonNm
	 */
	public String getLtrRcvrCntcPsonNm() {
		return this.ltrRcvrCntcPsonNm;
	}
	

	/**
	 * Column Info
	 * @param joLtrNo
	 */
	public void setJoLtrNo(String joLtrNo) {
		this.joLtrNo = joLtrNo;
	}
	
	/**
	 * Column Info
	 * @param deltFlg
	 */
	public void setDeltFlg(String deltFlg) {
		this.deltFlg = deltFlg;
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
	 * @param ccRcvrEmlCtnt
	 */
	public void setCcRcvrEmlCtnt(String ccRcvrEmlCtnt) {
		this.ccRcvrEmlCtnt = ccRcvrEmlCtnt;
	}
	
	/**
	 * Column Info
	 * @param trdCd
	 */
	public void setTrdCd(String trdCd) {
		this.trdCd = trdCd;
	}
	
	/**
	 * Column Info
	 * @param n3rdStmtCtnt
	 */
	public void setN3rdStmtCtnt(String n3rdStmtCtnt) {
		this.n3rdStmtCtnt = n3rdStmtCtnt;
	}
	
	/**
	 * Column Info
	 * @param sndrEml
	 */
	public void setSndrEml(String sndrEml) {
		this.sndrEml = sndrEml;
	}
	
	/**
	 * Column Info
	 * @param sigStmtCtnt
	 */
	public void setSigStmtCtnt(String sigStmtCtnt) {
		this.sigStmtCtnt = sigStmtCtnt;
	}
	
	/**
	 * Column Info
	 * @param n2ndStmtCtnt
	 */
	public void setN2ndStmtCtnt(String n2ndStmtCtnt) {
		this.n2ndStmtCtnt = n2ndStmtCtnt;
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
	 * @param emlProcStsCd
	 */
	public void setEmlProcStsCd(String emlProcStsCd) {
		this.emlProcStsCd = emlProcStsCd;
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
	 * @param emlDt
	 */
	public void setEmlDt(String emlDt) {
		this.emlDt = emlDt;
	}
	
	/**
	 * Column Info
	 * @param ttlStlAmt
	 */
	public void setTtlStlAmt(String ttlStlAmt) {
		this.ttlStlAmt = ttlStlAmt;
	}
	
	/**
	 * Column Info
	 * @param n1stStmtCtnt
	 */
	public void setN1stStmtCtnt(String n1stStmtCtnt) {
		this.n1stStmtCtnt = n1stStmtCtnt;
	}
	
	/**
	 * Column Info
	 * @param faxDt
	 */
	public void setFaxDt(String faxDt) {
		this.faxDt = faxDt;
	}
	
	/**
	 * Column Info
	 * @param ofcAddr
	 */
	public void setOfcAddr(String ofcAddr) {
		this.ofcAddr = ofcAddr;
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
	 * @param joLtrTmpltSeq
	 */
	public void setJoLtrTmpltSeq(String joLtrTmpltSeq) {
		this.joLtrTmpltSeq = joLtrTmpltSeq;
	}
	
	/**
	 * Column Info
	 * @param ltrRcvrCoNm
	 */
	public void setLtrRcvrCoNm(String ltrRcvrCoNm) {
		this.ltrRcvrCoNm = ltrRcvrCoNm;
	}
	
	/**
	 * Column Info
	 * @param ltrIssDt
	 */
	public void setLtrIssDt(String ltrIssDt) {
		this.ltrIssDt = ltrIssDt;
	}
	
	/**
	 * Column Info
	 * @param emlSndNo
	 */
	public void setEmlSndNo(String emlSndNo) {
		this.emlSndNo = emlSndNo;
	}
	
	/**
	 * Column Info
	 * @param ltrSndrCoNm
	 */
	public void setLtrSndrCoNm(String ltrSndrCoNm) {
		this.ltrSndrCoNm = ltrSndrCoNm;
	}
	
	/**
	 * Column Info
	 * @param ltrTitCtnt
	 */
	public void setLtrTitCtnt(String ltrTitCtnt) {
		this.ltrTitCtnt = ltrTitCtnt;
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
	 * @param rcvrEml
	 */
	public void setRcvrEml(String rcvrEml) {
		this.rcvrEml = rcvrEml;
	}
	
	/**
	 * Column Info
	 * @param bankStmtCtnt
	 */
	public void setBankStmtCtnt(String bankStmtCtnt) {
		this.bankStmtCtnt = bankStmtCtnt;
	}
	
	/**
	 * Column Info
	 * @param ltrCcRcvrCntcPsonNmCtnt
	 */
	public void setLtrCcRcvrCntcPsonNmCtnt(String ltrCcRcvrCntcPsonNmCtnt) {
		this.ltrCcRcvrCntcPsonNmCtnt = ltrCcRcvrCntcPsonNmCtnt;
	}
	
	/**
	 * Column Info
	 * @param joLtrTpCd
	 */
	public void setJoLtrTpCd(String joLtrTpCd) {
		this.joLtrTpCd = joLtrTpCd;
	}
	
	/**
	 * Column Info
	 * @param rcvrInfoCtnt
	 */
	public void setRcvrInfoCtnt(String rcvrInfoCtnt) {
		this.rcvrInfoCtnt = rcvrInfoCtnt;
	}
	
	/**
	 * Column Info
	 * @param joLtrSeq
	 */
	public void setJoLtrSeq(String joLtrSeq) {
		this.joLtrSeq = joLtrSeq;
	}
	
	/**
	 * Column Info
	 * @param faxProcStsCd
	 */
	public void setFaxProcStsCd(String faxProcStsCd) {
		this.faxProcStsCd = faxProcStsCd;
	}
	
	/**
	 * Column Info
	 * @param joCntcFaxNoCtnt
	 */
	public void setJoCntcFaxNoCtnt(String joCntcFaxNoCtnt) {
		this.joCntcFaxNoCtnt = joCntcFaxNoCtnt;
	}
	
	/**
	 * Column Info
	 * @param sndrNm
	 */
	public void setSndrNm(String sndrNm) {
		this.sndrNm = sndrNm;
	}
	
	/**
	 * Column Info
	 * @param faxSndNo
	 */
	public void setFaxSndNo(String faxSndNo) {
		this.faxSndNo = faxSndNo;
	}
	
	/**
	 * Column Info
	 * @param joSndMzdCd
	 */
	public void setJoSndMzdCd(String joSndMzdCd) {
		this.joSndMzdCd = joSndMzdCd;
	}
	
	/**
	 * Column Info
	 * @param ltrRcvrCntcPsonNm
	 */
	public void setLtrRcvrCntcPsonNm(String ltrRcvrCntcPsonNm) {
		this.ltrRcvrCntcPsonNm = ltrRcvrCntcPsonNm;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setJoLtrNo(JSPUtil.getParameter(request, "jo_ltr_no", ""));
		setDeltFlg(JSPUtil.getParameter(request, "delt_flg", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setCcRcvrEmlCtnt(JSPUtil.getParameter(request, "cc_rcvr_eml_ctnt", ""));
		setTrdCd(JSPUtil.getParameter(request, "trd_cd", ""));
		setN3rdStmtCtnt(JSPUtil.getParameter(request, "n3rd_stmt_ctnt", ""));
		setSndrEml(JSPUtil.getParameter(request, "sndr_eml", ""));
		setSigStmtCtnt(JSPUtil.getParameter(request, "sig_stmt_ctnt", ""));
		setN2ndStmtCtnt(JSPUtil.getParameter(request, "n2nd_stmt_ctnt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setEmlProcStsCd(JSPUtil.getParameter(request, "eml_proc_sts_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setEmlDt(JSPUtil.getParameter(request, "eml_dt", ""));
		setTtlStlAmt(JSPUtil.getParameter(request, "ttl_stl_amt", ""));
		setN1stStmtCtnt(JSPUtil.getParameter(request, "n1st_stmt_ctnt", ""));
		setFaxDt(JSPUtil.getParameter(request, "fax_dt", ""));
		setOfcAddr(JSPUtil.getParameter(request, "ofc_addr", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setJoLtrTmpltSeq(JSPUtil.getParameter(request, "jo_ltr_tmplt_seq", ""));
		setLtrRcvrCoNm(JSPUtil.getParameter(request, "ltr_rcvr_co_nm", ""));
		setLtrIssDt(JSPUtil.getParameter(request, "ltr_iss_dt", ""));
		setEmlSndNo(JSPUtil.getParameter(request, "eml_snd_no", ""));
		setLtrSndrCoNm(JSPUtil.getParameter(request, "ltr_sndr_co_nm", ""));
		setLtrTitCtnt(JSPUtil.getParameter(request, "ltr_tit_ctnt", ""));
		setOfcCd(JSPUtil.getParameter(request, "ofc_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setRcvrEml(JSPUtil.getParameter(request, "rcvr_eml", ""));
		setBankStmtCtnt(JSPUtil.getParameter(request, "bank_stmt_ctnt", ""));
		setLtrCcRcvrCntcPsonNmCtnt(JSPUtil.getParameter(request, "ltr_cc_rcvr_cntc_pson_nm_ctnt", ""));
		setJoLtrTpCd(JSPUtil.getParameter(request, "jo_ltr_tp_cd", ""));
		setRcvrInfoCtnt(JSPUtil.getParameter(request, "rcvr_info_ctnt", ""));
		setJoLtrSeq(JSPUtil.getParameter(request, "jo_ltr_seq", ""));
		setFaxProcStsCd(JSPUtil.getParameter(request, "fax_proc_sts_cd", ""));
		setJoCntcFaxNoCtnt(JSPUtil.getParameter(request, "jo_cntc_fax_no_ctnt", ""));
		setSndrNm(JSPUtil.getParameter(request, "sndr_nm", ""));
		setFaxSndNo(JSPUtil.getParameter(request, "fax_snd_no", ""));
		setJoSndMzdCd(JSPUtil.getParameter(request, "jo_snd_mzd_cd", ""));
		setLtrRcvrCntcPsonNm(JSPUtil.getParameter(request, "ltr_rcvr_cntc_pson_nm", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return JooLetterVO[]
	 */
	public JooLetterVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return JooLetterVO[]
	 */
	public JooLetterVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		JooLetterVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] joLtrNo = (JSPUtil.getParameter(request, prefix	+ "jo_ltr_no", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] ccRcvrEmlCtnt = (JSPUtil.getParameter(request, prefix	+ "cc_rcvr_eml_ctnt", length));
			String[] trdCd = (JSPUtil.getParameter(request, prefix	+ "trd_cd", length));
			String[] n3rdStmtCtnt = (JSPUtil.getParameter(request, prefix	+ "n3rd_stmt_ctnt", length));
			String[] sndrEml = (JSPUtil.getParameter(request, prefix	+ "sndr_eml", length));
			String[] sigStmtCtnt = (JSPUtil.getParameter(request, prefix	+ "sig_stmt_ctnt", length));
			String[] n2ndStmtCtnt = (JSPUtil.getParameter(request, prefix	+ "n2nd_stmt_ctnt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] emlProcStsCd = (JSPUtil.getParameter(request, prefix	+ "eml_proc_sts_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] emlDt = (JSPUtil.getParameter(request, prefix	+ "eml_dt", length));
			String[] ttlStlAmt = (JSPUtil.getParameter(request, prefix	+ "ttl_stl_amt", length));
			String[] n1stStmtCtnt = (JSPUtil.getParameter(request, prefix	+ "n1st_stmt_ctnt", length));
			String[] faxDt = (JSPUtil.getParameter(request, prefix	+ "fax_dt", length));
			String[] ofcAddr = (JSPUtil.getParameter(request, prefix	+ "ofc_addr", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] joLtrTmpltSeq = (JSPUtil.getParameter(request, prefix	+ "jo_ltr_tmplt_seq", length));
			String[] ltrRcvrCoNm = (JSPUtil.getParameter(request, prefix	+ "ltr_rcvr_co_nm", length));
			String[] ltrIssDt = (JSPUtil.getParameter(request, prefix	+ "ltr_iss_dt", length));
			String[] emlSndNo = (JSPUtil.getParameter(request, prefix	+ "eml_snd_no", length));
			String[] ltrSndrCoNm = (JSPUtil.getParameter(request, prefix	+ "ltr_sndr_co_nm", length));
			String[] ltrTitCtnt = (JSPUtil.getParameter(request, prefix	+ "ltr_tit_ctnt", length));
			String[] ofcCd = (JSPUtil.getParameter(request, prefix	+ "ofc_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] rcvrEml = (JSPUtil.getParameter(request, prefix	+ "rcvr_eml", length));
			String[] bankStmtCtnt = (JSPUtil.getParameter(request, prefix	+ "bank_stmt_ctnt", length));
			String[] ltrCcRcvrCntcPsonNmCtnt = (JSPUtil.getParameter(request, prefix	+ "ltr_cc_rcvr_cntc_pson_nm_ctnt", length));
			String[] joLtrTpCd = (JSPUtil.getParameter(request, prefix	+ "jo_ltr_tp_cd", length));
			String[] rcvrInfoCtnt = (JSPUtil.getParameter(request, prefix	+ "rcvr_info_ctnt", length));
			String[] joLtrSeq = (JSPUtil.getParameter(request, prefix	+ "jo_ltr_seq", length));
			String[] faxProcStsCd = (JSPUtil.getParameter(request, prefix	+ "fax_proc_sts_cd", length));
			String[] joCntcFaxNoCtnt = (JSPUtil.getParameter(request, prefix	+ "jo_cntc_fax_no_ctnt", length));
			String[] sndrNm = (JSPUtil.getParameter(request, prefix	+ "sndr_nm", length));
			String[] faxSndNo = (JSPUtil.getParameter(request, prefix	+ "fax_snd_no", length));
			String[] joSndMzdCd = (JSPUtil.getParameter(request, prefix	+ "jo_snd_mzd_cd", length));
			String[] ltrRcvrCntcPsonNm = (JSPUtil.getParameter(request, prefix	+ "ltr_rcvr_cntc_pson_nm", length));
			
			for (int i = 0; i < length; i++) {
				model = new JooLetterVO();
				if (joLtrNo[i] != null)
					model.setJoLtrNo(joLtrNo[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (ccRcvrEmlCtnt[i] != null)
					model.setCcRcvrEmlCtnt(ccRcvrEmlCtnt[i]);
				if (trdCd[i] != null)
					model.setTrdCd(trdCd[i]);
				if (n3rdStmtCtnt[i] != null)
					model.setN3rdStmtCtnt(n3rdStmtCtnt[i]);
				if (sndrEml[i] != null)
					model.setSndrEml(sndrEml[i]);
				if (sigStmtCtnt[i] != null)
					model.setSigStmtCtnt(sigStmtCtnt[i]);
				if (n2ndStmtCtnt[i] != null)
					model.setN2ndStmtCtnt(n2ndStmtCtnt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (emlProcStsCd[i] != null)
					model.setEmlProcStsCd(emlProcStsCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (emlDt[i] != null)
					model.setEmlDt(emlDt[i]);
				if (ttlStlAmt[i] != null)
					model.setTtlStlAmt(ttlStlAmt[i]);
				if (n1stStmtCtnt[i] != null)
					model.setN1stStmtCtnt(n1stStmtCtnt[i]);
				if (faxDt[i] != null)
					model.setFaxDt(faxDt[i]);
				if (ofcAddr[i] != null)
					model.setOfcAddr(ofcAddr[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (joLtrTmpltSeq[i] != null)
					model.setJoLtrTmpltSeq(joLtrTmpltSeq[i]);
				if (ltrRcvrCoNm[i] != null)
					model.setLtrRcvrCoNm(ltrRcvrCoNm[i]);
				if (ltrIssDt[i] != null)
					model.setLtrIssDt(ltrIssDt[i]);
				if (emlSndNo[i] != null)
					model.setEmlSndNo(emlSndNo[i]);
				if (ltrSndrCoNm[i] != null)
					model.setLtrSndrCoNm(ltrSndrCoNm[i]);
				if (ltrTitCtnt[i] != null)
					model.setLtrTitCtnt(ltrTitCtnt[i]);
				if (ofcCd[i] != null)
					model.setOfcCd(ofcCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (rcvrEml[i] != null)
					model.setRcvrEml(rcvrEml[i]);
				if (bankStmtCtnt[i] != null)
					model.setBankStmtCtnt(bankStmtCtnt[i]);
				if (ltrCcRcvrCntcPsonNmCtnt[i] != null)
					model.setLtrCcRcvrCntcPsonNmCtnt(ltrCcRcvrCntcPsonNmCtnt[i]);
				if (joLtrTpCd[i] != null)
					model.setJoLtrTpCd(joLtrTpCd[i]);
				if (rcvrInfoCtnt[i] != null)
					model.setRcvrInfoCtnt(rcvrInfoCtnt[i]);
				if (joLtrSeq[i] != null)
					model.setJoLtrSeq(joLtrSeq[i]);
				if (faxProcStsCd[i] != null)
					model.setFaxProcStsCd(faxProcStsCd[i]);
				if (joCntcFaxNoCtnt[i] != null)
					model.setJoCntcFaxNoCtnt(joCntcFaxNoCtnt[i]);
				if (sndrNm[i] != null)
					model.setSndrNm(sndrNm[i]);
				if (faxSndNo[i] != null)
					model.setFaxSndNo(faxSndNo[i]);
				if (joSndMzdCd[i] != null)
					model.setJoSndMzdCd(joSndMzdCd[i]);
				if (ltrRcvrCntcPsonNm[i] != null)
					model.setLtrRcvrCntcPsonNm(ltrRcvrCntcPsonNm[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getJooLetterVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return JooLetterVO[]
	 */
	public JooLetterVO[] getJooLetterVOs(){
		JooLetterVO[] vos = (JooLetterVO[])models.toArray(new JooLetterVO[models.size()]);
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
		this.joLtrNo = this.joLtrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ccRcvrEmlCtnt = this.ccRcvrEmlCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trdCd = this.trdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdStmtCtnt = this.n3rdStmtCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sndrEml = this.sndrEml .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sigStmtCtnt = this.sigStmtCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndStmtCtnt = this.n2ndStmtCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.emlProcStsCd = this.emlProcStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.emlDt = this.emlDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ttlStlAmt = this.ttlStlAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stStmtCtnt = this.n1stStmtCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faxDt = this.faxDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcAddr = this.ofcAddr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.joLtrTmpltSeq = this.joLtrTmpltSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ltrRcvrCoNm = this.ltrRcvrCoNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ltrIssDt = this.ltrIssDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.emlSndNo = this.emlSndNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ltrSndrCoNm = this.ltrSndrCoNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ltrTitCtnt = this.ltrTitCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcCd = this.ofcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcvrEml = this.rcvrEml .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bankStmtCtnt = this.bankStmtCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ltrCcRcvrCntcPsonNmCtnt = this.ltrCcRcvrCntcPsonNmCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.joLtrTpCd = this.joLtrTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcvrInfoCtnt = this.rcvrInfoCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.joLtrSeq = this.joLtrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faxProcStsCd = this.faxProcStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.joCntcFaxNoCtnt = this.joCntcFaxNoCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sndrNm = this.sndrNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faxSndNo = this.faxSndNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.joSndMzdCd = this.joSndMzdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ltrRcvrCntcPsonNm = this.ltrRcvrCntcPsonNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
