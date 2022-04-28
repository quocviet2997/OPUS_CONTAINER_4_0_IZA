/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : PriTrfInlndRtVO.java
*@FileTitle : PriTrfInlndRtVO
*Open Issues :
*Change history :
*@LastModifyDate : 2010.12.14
*@LastModifier : 최성민
*@LastVersion : 1.0
* 2010.12.14 최성민 
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
 * @author 최성민
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class PriTrfInlndRtVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<PriTrfInlndRtVO> models = new ArrayList<PriTrfInlndRtVO>();
	
	/* Column Info */
	private String trfInlndSeq = null;
	/* Column Info */
	private String currCd = null;
	/* Column Info */
	private String prcCgoTpCd = null;
	/* Column Info */
	private String amdtSeq = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String inlnd20ftRtAmt = null;
	/* Column Info */
	private String inlndOneWy45ftRtAmt = null;
	/* Column Info */
	private String prcInlndRtTrspModCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String inlndRtBseLocCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String inlndRtLmtWgt = null;
	/* Column Info */
	private String inlndRtViaLocCd = null;
	/* Column Info */
	private String inlndRtLmtWgtUtCd = null;
	/* Column Info */
	private String inlndBxRtAmt = null;
	/* Column Info */
	private String trfPfxCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String inlndOneWy40ftHcRtAmt = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String trfInlndRtSeq = null;
	/* Column Info */
	private String inlndOneWy40ftRtAmt = null;
	/* Column Info */
	private String srcInfoCd = null;
	/* Column Info */
	private String inlndRtMinLmtWgt = null;
	/* Column Info */
	private String inlndOneWy20ftRtAmt = null;
	/* Column Info */
	private String inlnd40ftHcRtAmt = null;
	/* Column Info */
	private String inlnd40ftRtAmt = null;
	/* Column Info */
	private String inlndRtTermCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String inlndRtRmk = null;
	/* Column Info */
	private String n1stCmncAmdtSeq = null;
	/* Column Info */
	private String trfNo = null;
	/* Column Info */
	private String inlndRtBseLocZipCd = null;
	/* Column Info */
	private String inlnd45ftRtAmt = null;
	/* Column Info */
	private String inlndOneWyBxRtAmt = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public PriTrfInlndRtVO() {}

	public PriTrfInlndRtVO(String ibflag, String pagerows, String trfPfxCd, String trfNo, String trfInlndSeq, String amdtSeq, String trfInlndRtSeq, String inlndRtBseLocCd, String inlndRtBseLocZipCd, String inlndRtTermCd, String inlndRtViaLocCd, String prcInlndRtTrspModCd, String inlndRtLmtWgt, String inlndRtLmtWgtUtCd, String prcCgoTpCd, String currCd, String inlndBxRtAmt, String inlnd20ftRtAmt, String inlnd40ftRtAmt, String inlnd40ftHcRtAmt, String inlnd45ftRtAmt, String inlndOneWyBxRtAmt, String inlndOneWy20ftRtAmt, String inlndOneWy40ftRtAmt, String inlndOneWy40ftHcRtAmt, String inlndOneWy45ftRtAmt, String inlndRtRmk, String n1stCmncAmdtSeq, String srcInfoCd, String creUsrId, String creDt, String updUsrId, String updDt, String inlndRtMinLmtWgt) {
		this.trfInlndSeq = trfInlndSeq;
		this.currCd = currCd;
		this.prcCgoTpCd = prcCgoTpCd;
		this.amdtSeq = amdtSeq;
		this.creDt = creDt;
		this.inlnd20ftRtAmt = inlnd20ftRtAmt;
		this.inlndOneWy45ftRtAmt = inlndOneWy45ftRtAmt;
		this.prcInlndRtTrspModCd = prcInlndRtTrspModCd;
		this.pagerows = pagerows;
		this.inlndRtBseLocCd = inlndRtBseLocCd;
		this.ibflag = ibflag;
		this.inlndRtLmtWgt = inlndRtLmtWgt;
		this.inlndRtViaLocCd = inlndRtViaLocCd;
		this.inlndRtLmtWgtUtCd = inlndRtLmtWgtUtCd;
		this.inlndBxRtAmt = inlndBxRtAmt;
		this.trfPfxCd = trfPfxCd;
		this.updUsrId = updUsrId;
		this.inlndOneWy40ftHcRtAmt = inlndOneWy40ftHcRtAmt;
		this.updDt = updDt;
		this.trfInlndRtSeq = trfInlndRtSeq;
		this.inlndOneWy40ftRtAmt = inlndOneWy40ftRtAmt;
		this.srcInfoCd = srcInfoCd;
		this.inlndRtMinLmtWgt = inlndRtMinLmtWgt;
		this.inlndOneWy20ftRtAmt = inlndOneWy20ftRtAmt;
		this.inlnd40ftHcRtAmt = inlnd40ftHcRtAmt;
		this.inlnd40ftRtAmt = inlnd40ftRtAmt;
		this.inlndRtTermCd = inlndRtTermCd;
		this.creUsrId = creUsrId;
		this.inlndRtRmk = inlndRtRmk;
		this.n1stCmncAmdtSeq = n1stCmncAmdtSeq;
		this.trfNo = trfNo;
		this.inlndRtBseLocZipCd = inlndRtBseLocZipCd;
		this.inlnd45ftRtAmt = inlnd45ftRtAmt;
		this.inlndOneWyBxRtAmt = inlndOneWyBxRtAmt;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("trf_inlnd_seq", getTrfInlndSeq());
		this.hashColumns.put("curr_cd", getCurrCd());
		this.hashColumns.put("prc_cgo_tp_cd", getPrcCgoTpCd());
		this.hashColumns.put("amdt_seq", getAmdtSeq());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("inlnd_20ft_rt_amt", getInlnd20ftRtAmt());
		this.hashColumns.put("inlnd_one_wy_45ft_rt_amt", getInlndOneWy45ftRtAmt());
		this.hashColumns.put("prc_inlnd_rt_trsp_mod_cd", getPrcInlndRtTrspModCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("inlnd_rt_bse_loc_cd", getInlndRtBseLocCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("inlnd_rt_lmt_wgt", getInlndRtLmtWgt());
		this.hashColumns.put("inlnd_rt_via_loc_cd", getInlndRtViaLocCd());
		this.hashColumns.put("inlnd_rt_lmt_wgt_ut_cd", getInlndRtLmtWgtUtCd());
		this.hashColumns.put("inlnd_bx_rt_amt", getInlndBxRtAmt());
		this.hashColumns.put("trf_pfx_cd", getTrfPfxCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("inlnd_one_wy_40ft_hc_rt_amt", getInlndOneWy40ftHcRtAmt());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("trf_inlnd_rt_seq", getTrfInlndRtSeq());
		this.hashColumns.put("inlnd_one_wy_40ft_rt_amt", getInlndOneWy40ftRtAmt());
		this.hashColumns.put("src_info_cd", getSrcInfoCd());
		this.hashColumns.put("inlnd_rt_min_lmt_wgt", getInlndRtMinLmtWgt());
		this.hashColumns.put("inlnd_one_wy_20ft_rt_amt", getInlndOneWy20ftRtAmt());
		this.hashColumns.put("inlnd_40ft_hc_rt_amt", getInlnd40ftHcRtAmt());
		this.hashColumns.put("inlnd_40ft_rt_amt", getInlnd40ftRtAmt());
		this.hashColumns.put("inlnd_rt_term_cd", getInlndRtTermCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("inlnd_rt_rmk", getInlndRtRmk());
		this.hashColumns.put("n1st_cmnc_amdt_seq", getN1stCmncAmdtSeq());
		this.hashColumns.put("trf_no", getTrfNo());
		this.hashColumns.put("inlnd_rt_bse_loc_zip_cd", getInlndRtBseLocZipCd());
		this.hashColumns.put("inlnd_45ft_rt_amt", getInlnd45ftRtAmt());
		this.hashColumns.put("inlnd_one_wy_bx_rt_amt", getInlndOneWyBxRtAmt());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("trf_inlnd_seq", "trfInlndSeq");
		this.hashFields.put("curr_cd", "currCd");
		this.hashFields.put("prc_cgo_tp_cd", "prcCgoTpCd");
		this.hashFields.put("amdt_seq", "amdtSeq");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("inlnd_20ft_rt_amt", "inlnd20ftRtAmt");
		this.hashFields.put("inlnd_one_wy_45ft_rt_amt", "inlndOneWy45ftRtAmt");
		this.hashFields.put("prc_inlnd_rt_trsp_mod_cd", "prcInlndRtTrspModCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("inlnd_rt_bse_loc_cd", "inlndRtBseLocCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("inlnd_rt_lmt_wgt", "inlndRtLmtWgt");
		this.hashFields.put("inlnd_rt_via_loc_cd", "inlndRtViaLocCd");
		this.hashFields.put("inlnd_rt_lmt_wgt_ut_cd", "inlndRtLmtWgtUtCd");
		this.hashFields.put("inlnd_bx_rt_amt", "inlndBxRtAmt");
		this.hashFields.put("trf_pfx_cd", "trfPfxCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("inlnd_one_wy_40ft_hc_rt_amt", "inlndOneWy40ftHcRtAmt");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("trf_inlnd_rt_seq", "trfInlndRtSeq");
		this.hashFields.put("inlnd_one_wy_40ft_rt_amt", "inlndOneWy40ftRtAmt");
		this.hashFields.put("src_info_cd", "srcInfoCd");
		this.hashFields.put("inlnd_rt_min_lmt_wgt", "inlndRtMinLmtWgt");
		this.hashFields.put("inlnd_one_wy_20ft_rt_amt", "inlndOneWy20ftRtAmt");
		this.hashFields.put("inlnd_40ft_hc_rt_amt", "inlnd40ftHcRtAmt");
		this.hashFields.put("inlnd_40ft_rt_amt", "inlnd40ftRtAmt");
		this.hashFields.put("inlnd_rt_term_cd", "inlndRtTermCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("inlnd_rt_rmk", "inlndRtRmk");
		this.hashFields.put("n1st_cmnc_amdt_seq", "n1stCmncAmdtSeq");
		this.hashFields.put("trf_no", "trfNo");
		this.hashFields.put("inlnd_rt_bse_loc_zip_cd", "inlndRtBseLocZipCd");
		this.hashFields.put("inlnd_45ft_rt_amt", "inlnd45ftRtAmt");
		this.hashFields.put("inlnd_one_wy_bx_rt_amt", "inlndOneWyBxRtAmt");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return trfInlndSeq
	 */
	public String getTrfInlndSeq() {
		return this.trfInlndSeq;
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
	 * @return prcCgoTpCd
	 */
	public String getPrcCgoTpCd() {
		return this.prcCgoTpCd;
	}
	
	/**
	 * Column Info
	 * @return amdtSeq
	 */
	public String getAmdtSeq() {
		return this.amdtSeq;
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
	 * @return inlnd20ftRtAmt
	 */
	public String getInlnd20ftRtAmt() {
		return this.inlnd20ftRtAmt;
	}
	
	/**
	 * Column Info
	 * @return inlndOneWy45ftRtAmt
	 */
	public String getInlndOneWy45ftRtAmt() {
		return this.inlndOneWy45ftRtAmt;
	}
	
	/**
	 * Column Info
	 * @return prcInlndRtTrspModCd
	 */
	public String getPrcInlndRtTrspModCd() {
		return this.prcInlndRtTrspModCd;
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
	 * @return inlndRtBseLocCd
	 */
	public String getInlndRtBseLocCd() {
		return this.inlndRtBseLocCd;
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
	 * @return inlndRtLmtWgt
	 */
	public String getInlndRtLmtWgt() {
		return this.inlndRtLmtWgt;
	}
	
	/**
	 * Column Info
	 * @return inlndRtViaLocCd
	 */
	public String getInlndRtViaLocCd() {
		return this.inlndRtViaLocCd;
	}
	
	/**
	 * Column Info
	 * @return inlndRtLmtWgtUtCd
	 */
	public String getInlndRtLmtWgtUtCd() {
		return this.inlndRtLmtWgtUtCd;
	}
	
	/**
	 * Column Info
	 * @return inlndBxRtAmt
	 */
	public String getInlndBxRtAmt() {
		return this.inlndBxRtAmt;
	}
	
	/**
	 * Column Info
	 * @return trfPfxCd
	 */
	public String getTrfPfxCd() {
		return this.trfPfxCd;
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
	 * @return inlndOneWy40ftHcRtAmt
	 */
	public String getInlndOneWy40ftHcRtAmt() {
		return this.inlndOneWy40ftHcRtAmt;
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
	 * @return trfInlndRtSeq
	 */
	public String getTrfInlndRtSeq() {
		return this.trfInlndRtSeq;
	}
	
	/**
	 * Column Info
	 * @return inlndOneWy40ftRtAmt
	 */
	public String getInlndOneWy40ftRtAmt() {
		return this.inlndOneWy40ftRtAmt;
	}
	
	/**
	 * Column Info
	 * @return srcInfoCd
	 */
	public String getSrcInfoCd() {
		return this.srcInfoCd;
	}
	
	/**
	 * Column Info
	 * @return inlndRtMinLmtWgt
	 */
	public String getInlndRtMinLmtWgt() {
		return this.inlndRtMinLmtWgt;
	}
	
	/**
	 * Column Info
	 * @return inlndOneWy20ftRtAmt
	 */
	public String getInlndOneWy20ftRtAmt() {
		return this.inlndOneWy20ftRtAmt;
	}
	
	/**
	 * Column Info
	 * @return inlnd40ftHcRtAmt
	 */
	public String getInlnd40ftHcRtAmt() {
		return this.inlnd40ftHcRtAmt;
	}
	
	/**
	 * Column Info
	 * @return inlnd40ftRtAmt
	 */
	public String getInlnd40ftRtAmt() {
		return this.inlnd40ftRtAmt;
	}
	
	/**
	 * Column Info
	 * @return inlndRtTermCd
	 */
	public String getInlndRtTermCd() {
		return this.inlndRtTermCd;
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
	 * @return inlndRtRmk
	 */
	public String getInlndRtRmk() {
		return this.inlndRtRmk;
	}
	
	/**
	 * Column Info
	 * @return n1stCmncAmdtSeq
	 */
	public String getN1stCmncAmdtSeq() {
		return this.n1stCmncAmdtSeq;
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
	 * @return inlndRtBseLocZipCd
	 */
	public String getInlndRtBseLocZipCd() {
		return this.inlndRtBseLocZipCd;
	}
	
	/**
	 * Column Info
	 * @return inlnd45ftRtAmt
	 */
	public String getInlnd45ftRtAmt() {
		return this.inlnd45ftRtAmt;
	}
	
	/**
	 * Column Info
	 * @return inlndOneWyBxRtAmt
	 */
	public String getInlndOneWyBxRtAmt() {
		return this.inlndOneWyBxRtAmt;
	}
	

	/**
	 * Column Info
	 * @param trfInlndSeq
	 */
	public void setTrfInlndSeq(String trfInlndSeq) {
		this.trfInlndSeq = trfInlndSeq;
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
	 * @param prcCgoTpCd
	 */
	public void setPrcCgoTpCd(String prcCgoTpCd) {
		this.prcCgoTpCd = prcCgoTpCd;
	}
	
	/**
	 * Column Info
	 * @param amdtSeq
	 */
	public void setAmdtSeq(String amdtSeq) {
		this.amdtSeq = amdtSeq;
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
	 * @param inlnd20ftRtAmt
	 */
	public void setInlnd20ftRtAmt(String inlnd20ftRtAmt) {
		this.inlnd20ftRtAmt = inlnd20ftRtAmt;
	}
	
	/**
	 * Column Info
	 * @param inlndOneWy45ftRtAmt
	 */
	public void setInlndOneWy45ftRtAmt(String inlndOneWy45ftRtAmt) {
		this.inlndOneWy45ftRtAmt = inlndOneWy45ftRtAmt;
	}
	
	/**
	 * Column Info
	 * @param prcInlndRtTrspModCd
	 */
	public void setPrcInlndRtTrspModCd(String prcInlndRtTrspModCd) {
		this.prcInlndRtTrspModCd = prcInlndRtTrspModCd;
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
	 * @param inlndRtBseLocCd
	 */
	public void setInlndRtBseLocCd(String inlndRtBseLocCd) {
		this.inlndRtBseLocCd = inlndRtBseLocCd;
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
	 * @param inlndRtLmtWgt
	 */
	public void setInlndRtLmtWgt(String inlndRtLmtWgt) {
		this.inlndRtLmtWgt = inlndRtLmtWgt;
	}
	
	/**
	 * Column Info
	 * @param inlndRtViaLocCd
	 */
	public void setInlndRtViaLocCd(String inlndRtViaLocCd) {
		this.inlndRtViaLocCd = inlndRtViaLocCd;
	}
	
	/**
	 * Column Info
	 * @param inlndRtLmtWgtUtCd
	 */
	public void setInlndRtLmtWgtUtCd(String inlndRtLmtWgtUtCd) {
		this.inlndRtLmtWgtUtCd = inlndRtLmtWgtUtCd;
	}
	
	/**
	 * Column Info
	 * @param inlndBxRtAmt
	 */
	public void setInlndBxRtAmt(String inlndBxRtAmt) {
		this.inlndBxRtAmt = inlndBxRtAmt;
	}
	
	/**
	 * Column Info
	 * @param trfPfxCd
	 */
	public void setTrfPfxCd(String trfPfxCd) {
		this.trfPfxCd = trfPfxCd;
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
	 * @param inlndOneWy40ftHcRtAmt
	 */
	public void setInlndOneWy40ftHcRtAmt(String inlndOneWy40ftHcRtAmt) {
		this.inlndOneWy40ftHcRtAmt = inlndOneWy40ftHcRtAmt;
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
	 * @param trfInlndRtSeq
	 */
	public void setTrfInlndRtSeq(String trfInlndRtSeq) {
		this.trfInlndRtSeq = trfInlndRtSeq;
	}
	
	/**
	 * Column Info
	 * @param inlndOneWy40ftRtAmt
	 */
	public void setInlndOneWy40ftRtAmt(String inlndOneWy40ftRtAmt) {
		this.inlndOneWy40ftRtAmt = inlndOneWy40ftRtAmt;
	}
	
	/**
	 * Column Info
	 * @param srcInfoCd
	 */
	public void setSrcInfoCd(String srcInfoCd) {
		this.srcInfoCd = srcInfoCd;
	}
	
	/**
	 * Column Info
	 * @param inlndRtMinLmtWgt
	 */
	public void setInlndRtMinLmtWgt(String inlndRtMinLmtWgt) {
		this.inlndRtMinLmtWgt = inlndRtMinLmtWgt;
	}
	
	/**
	 * Column Info
	 * @param inlndOneWy20ftRtAmt
	 */
	public void setInlndOneWy20ftRtAmt(String inlndOneWy20ftRtAmt) {
		this.inlndOneWy20ftRtAmt = inlndOneWy20ftRtAmt;
	}
	
	/**
	 * Column Info
	 * @param inlnd40ftHcRtAmt
	 */
	public void setInlnd40ftHcRtAmt(String inlnd40ftHcRtAmt) {
		this.inlnd40ftHcRtAmt = inlnd40ftHcRtAmt;
	}
	
	/**
	 * Column Info
	 * @param inlnd40ftRtAmt
	 */
	public void setInlnd40ftRtAmt(String inlnd40ftRtAmt) {
		this.inlnd40ftRtAmt = inlnd40ftRtAmt;
	}
	
	/**
	 * Column Info
	 * @param inlndRtTermCd
	 */
	public void setInlndRtTermCd(String inlndRtTermCd) {
		this.inlndRtTermCd = inlndRtTermCd;
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
	 * @param inlndRtRmk
	 */
	public void setInlndRtRmk(String inlndRtRmk) {
		this.inlndRtRmk = inlndRtRmk;
	}
	
	/**
	 * Column Info
	 * @param n1stCmncAmdtSeq
	 */
	public void setN1stCmncAmdtSeq(String n1stCmncAmdtSeq) {
		this.n1stCmncAmdtSeq = n1stCmncAmdtSeq;
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
	 * @param inlndRtBseLocZipCd
	 */
	public void setInlndRtBseLocZipCd(String inlndRtBseLocZipCd) {
		this.inlndRtBseLocZipCd = inlndRtBseLocZipCd;
	}
	
	/**
	 * Column Info
	 * @param inlnd45ftRtAmt
	 */
	public void setInlnd45ftRtAmt(String inlnd45ftRtAmt) {
		this.inlnd45ftRtAmt = inlnd45ftRtAmt;
	}
	
	/**
	 * Column Info
	 * @param inlndOneWyBxRtAmt
	 */
	public void setInlndOneWyBxRtAmt(String inlndOneWyBxRtAmt) {
		this.inlndOneWyBxRtAmt = inlndOneWyBxRtAmt;
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
		setTrfInlndSeq(JSPUtil.getParameter(request, prefix + "trf_inlnd_seq", ""));
		setCurrCd(JSPUtil.getParameter(request, prefix + "curr_cd", ""));
		setPrcCgoTpCd(JSPUtil.getParameter(request, prefix + "prc_cgo_tp_cd", ""));
		setAmdtSeq(JSPUtil.getParameter(request, prefix + "amdt_seq", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setInlnd20ftRtAmt(JSPUtil.getParameter(request, prefix + "inlnd_20ft_rt_amt", ""));
		setInlndOneWy45ftRtAmt(JSPUtil.getParameter(request, prefix + "inlnd_one_wy_45ft_rt_amt", ""));
		setPrcInlndRtTrspModCd(JSPUtil.getParameter(request, prefix + "prc_inlnd_rt_trsp_mod_cd", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setInlndRtBseLocCd(JSPUtil.getParameter(request, prefix + "inlnd_rt_bse_loc_cd", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setInlndRtLmtWgt(JSPUtil.getParameter(request, prefix + "inlnd_rt_lmt_wgt", ""));
		setInlndRtViaLocCd(JSPUtil.getParameter(request, prefix + "inlnd_rt_via_loc_cd", ""));
		setInlndRtLmtWgtUtCd(JSPUtil.getParameter(request, prefix + "inlnd_rt_lmt_wgt_ut_cd", ""));
		setInlndBxRtAmt(JSPUtil.getParameter(request, prefix + "inlnd_bx_rt_amt", ""));
		setTrfPfxCd(JSPUtil.getParameter(request, prefix + "trf_pfx_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setInlndOneWy40ftHcRtAmt(JSPUtil.getParameter(request, prefix + "inlnd_one_wy_40ft_hc_rt_amt", ""));
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setTrfInlndRtSeq(JSPUtil.getParameter(request, prefix + "trf_inlnd_rt_seq", ""));
		setInlndOneWy40ftRtAmt(JSPUtil.getParameter(request, prefix + "inlnd_one_wy_40ft_rt_amt", ""));
		setSrcInfoCd(JSPUtil.getParameter(request, prefix + "src_info_cd", ""));
		setInlndRtMinLmtWgt(JSPUtil.getParameter(request, prefix + "inlnd_rt_min_lmt_wgt", ""));
		setInlndOneWy20ftRtAmt(JSPUtil.getParameter(request, prefix + "inlnd_one_wy_20ft_rt_amt", ""));
		setInlnd40ftHcRtAmt(JSPUtil.getParameter(request, prefix + "inlnd_40ft_hc_rt_amt", ""));
		setInlnd40ftRtAmt(JSPUtil.getParameter(request, prefix + "inlnd_40ft_rt_amt", ""));
		setInlndRtTermCd(JSPUtil.getParameter(request, prefix + "inlnd_rt_term_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setInlndRtRmk(JSPUtil.getParameter(request, prefix + "inlnd_rt_rmk", ""));
		setN1stCmncAmdtSeq(JSPUtil.getParameter(request, prefix + "n1st_cmnc_amdt_seq", ""));
		setTrfNo(JSPUtil.getParameter(request, prefix + "trf_no", ""));
		setInlndRtBseLocZipCd(JSPUtil.getParameter(request, prefix + "inlnd_rt_bse_loc_zip_cd", ""));
		setInlnd45ftRtAmt(JSPUtil.getParameter(request, prefix + "inlnd_45ft_rt_amt", ""));
		setInlndOneWyBxRtAmt(JSPUtil.getParameter(request, prefix + "inlnd_one_wy_bx_rt_amt", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return PriTrfInlndRtVO[]
	 */
	public PriTrfInlndRtVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return PriTrfInlndRtVO[]
	 */
	public PriTrfInlndRtVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		PriTrfInlndRtVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] trfInlndSeq = (JSPUtil.getParameter(request, prefix	+ "trf_inlnd_seq", length));
			String[] currCd = (JSPUtil.getParameter(request, prefix	+ "curr_cd", length));
			String[] prcCgoTpCd = (JSPUtil.getParameter(request, prefix	+ "prc_cgo_tp_cd", length));
			String[] amdtSeq = (JSPUtil.getParameter(request, prefix	+ "amdt_seq", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] inlnd20ftRtAmt = (JSPUtil.getParameter(request, prefix	+ "inlnd_20ft_rt_amt", length));
			String[] inlndOneWy45ftRtAmt = (JSPUtil.getParameter(request, prefix	+ "inlnd_one_wy_45ft_rt_amt", length));
			String[] prcInlndRtTrspModCd = (JSPUtil.getParameter(request, prefix	+ "prc_inlnd_rt_trsp_mod_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] inlndRtBseLocCd = (JSPUtil.getParameter(request, prefix	+ "inlnd_rt_bse_loc_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] inlndRtLmtWgt = (JSPUtil.getParameter(request, prefix	+ "inlnd_rt_lmt_wgt", length));
			String[] inlndRtViaLocCd = (JSPUtil.getParameter(request, prefix	+ "inlnd_rt_via_loc_cd", length));
			String[] inlndRtLmtWgtUtCd = (JSPUtil.getParameter(request, prefix	+ "inlnd_rt_lmt_wgt_ut_cd", length));
			String[] inlndBxRtAmt = (JSPUtil.getParameter(request, prefix	+ "inlnd_bx_rt_amt", length));
			String[] trfPfxCd = (JSPUtil.getParameter(request, prefix	+ "trf_pfx_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] inlndOneWy40ftHcRtAmt = (JSPUtil.getParameter(request, prefix	+ "inlnd_one_wy_40ft_hc_rt_amt", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] trfInlndRtSeq = (JSPUtil.getParameter(request, prefix	+ "trf_inlnd_rt_seq", length));
			String[] inlndOneWy40ftRtAmt = (JSPUtil.getParameter(request, prefix	+ "inlnd_one_wy_40ft_rt_amt", length));
			String[] srcInfoCd = (JSPUtil.getParameter(request, prefix	+ "src_info_cd", length));
			String[] inlndRtMinLmtWgt = (JSPUtil.getParameter(request, prefix	+ "inlnd_rt_min_lmt_wgt", length));
			String[] inlndOneWy20ftRtAmt = (JSPUtil.getParameter(request, prefix	+ "inlnd_one_wy_20ft_rt_amt", length));
			String[] inlnd40ftHcRtAmt = (JSPUtil.getParameter(request, prefix	+ "inlnd_40ft_hc_rt_amt", length));
			String[] inlnd40ftRtAmt = (JSPUtil.getParameter(request, prefix	+ "inlnd_40ft_rt_amt", length));
			String[] inlndRtTermCd = (JSPUtil.getParameter(request, prefix	+ "inlnd_rt_term_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] inlndRtRmk = (JSPUtil.getParameter(request, prefix	+ "inlnd_rt_rmk", length));
			String[] n1stCmncAmdtSeq = (JSPUtil.getParameter(request, prefix	+ "n1st_cmnc_amdt_seq", length));
			String[] trfNo = (JSPUtil.getParameter(request, prefix	+ "trf_no", length));
			String[] inlndRtBseLocZipCd = (JSPUtil.getParameter(request, prefix	+ "inlnd_rt_bse_loc_zip_cd", length));
			String[] inlnd45ftRtAmt = (JSPUtil.getParameter(request, prefix	+ "inlnd_45ft_rt_amt", length));
			String[] inlndOneWyBxRtAmt = (JSPUtil.getParameter(request, prefix	+ "inlnd_one_wy_bx_rt_amt", length));
			
			for (int i = 0; i < length; i++) {
				model = new PriTrfInlndRtVO();
				if (trfInlndSeq[i] != null)
					model.setTrfInlndSeq(trfInlndSeq[i]);
				if (currCd[i] != null)
					model.setCurrCd(currCd[i]);
				if (prcCgoTpCd[i] != null)
					model.setPrcCgoTpCd(prcCgoTpCd[i]);
				if (amdtSeq[i] != null)
					model.setAmdtSeq(amdtSeq[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (inlnd20ftRtAmt[i] != null)
					model.setInlnd20ftRtAmt(inlnd20ftRtAmt[i]);
				if (inlndOneWy45ftRtAmt[i] != null)
					model.setInlndOneWy45ftRtAmt(inlndOneWy45ftRtAmt[i]);
				if (prcInlndRtTrspModCd[i] != null)
					model.setPrcInlndRtTrspModCd(prcInlndRtTrspModCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (inlndRtBseLocCd[i] != null)
					model.setInlndRtBseLocCd(inlndRtBseLocCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (inlndRtLmtWgt[i] != null)
					model.setInlndRtLmtWgt(inlndRtLmtWgt[i]);
				if (inlndRtViaLocCd[i] != null)
					model.setInlndRtViaLocCd(inlndRtViaLocCd[i]);
				if (inlndRtLmtWgtUtCd[i] != null)
					model.setInlndRtLmtWgtUtCd(inlndRtLmtWgtUtCd[i]);
				if (inlndBxRtAmt[i] != null)
					model.setInlndBxRtAmt(inlndBxRtAmt[i]);
				if (trfPfxCd[i] != null)
					model.setTrfPfxCd(trfPfxCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (inlndOneWy40ftHcRtAmt[i] != null)
					model.setInlndOneWy40ftHcRtAmt(inlndOneWy40ftHcRtAmt[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (trfInlndRtSeq[i] != null)
					model.setTrfInlndRtSeq(trfInlndRtSeq[i]);
				if (inlndOneWy40ftRtAmt[i] != null)
					model.setInlndOneWy40ftRtAmt(inlndOneWy40ftRtAmt[i]);
				if (srcInfoCd[i] != null)
					model.setSrcInfoCd(srcInfoCd[i]);
				if (inlndRtMinLmtWgt[i] != null)
					model.setInlndRtMinLmtWgt(inlndRtMinLmtWgt[i]);
				if (inlndOneWy20ftRtAmt[i] != null)
					model.setInlndOneWy20ftRtAmt(inlndOneWy20ftRtAmt[i]);
				if (inlnd40ftHcRtAmt[i] != null)
					model.setInlnd40ftHcRtAmt(inlnd40ftHcRtAmt[i]);
				if (inlnd40ftRtAmt[i] != null)
					model.setInlnd40ftRtAmt(inlnd40ftRtAmt[i]);
				if (inlndRtTermCd[i] != null)
					model.setInlndRtTermCd(inlndRtTermCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (inlndRtRmk[i] != null)
					model.setInlndRtRmk(inlndRtRmk[i]);
				if (n1stCmncAmdtSeq[i] != null)
					model.setN1stCmncAmdtSeq(n1stCmncAmdtSeq[i]);
				if (trfNo[i] != null)
					model.setTrfNo(trfNo[i]);
				if (inlndRtBseLocZipCd[i] != null)
					model.setInlndRtBseLocZipCd(inlndRtBseLocZipCd[i]);
				if (inlnd45ftRtAmt[i] != null)
					model.setInlnd45ftRtAmt(inlnd45ftRtAmt[i]);
				if (inlndOneWyBxRtAmt[i] != null)
					model.setInlndOneWyBxRtAmt(inlndOneWyBxRtAmt[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getPriTrfInlndRtVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return PriTrfInlndRtVO[]
	 */
	public PriTrfInlndRtVO[] getPriTrfInlndRtVOs(){
		PriTrfInlndRtVO[] vos = (PriTrfInlndRtVO[])models.toArray(new PriTrfInlndRtVO[models.size()]);
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
		this.trfInlndSeq = this.trfInlndSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.currCd = this.currCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prcCgoTpCd = this.prcCgoTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.amdtSeq = this.amdtSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.inlnd20ftRtAmt = this.inlnd20ftRtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.inlndOneWy45ftRtAmt = this.inlndOneWy45ftRtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prcInlndRtTrspModCd = this.prcInlndRtTrspModCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.inlndRtBseLocCd = this.inlndRtBseLocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.inlndRtLmtWgt = this.inlndRtLmtWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.inlndRtViaLocCd = this.inlndRtViaLocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.inlndRtLmtWgtUtCd = this.inlndRtLmtWgtUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.inlndBxRtAmt = this.inlndBxRtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trfPfxCd = this.trfPfxCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.inlndOneWy40ftHcRtAmt = this.inlndOneWy40ftHcRtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trfInlndRtSeq = this.trfInlndRtSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.inlndOneWy40ftRtAmt = this.inlndOneWy40ftRtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.srcInfoCd = this.srcInfoCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.inlndRtMinLmtWgt = this.inlndRtMinLmtWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.inlndOneWy20ftRtAmt = this.inlndOneWy20ftRtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.inlnd40ftHcRtAmt = this.inlnd40ftHcRtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.inlnd40ftRtAmt = this.inlnd40ftRtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.inlndRtTermCd = this.inlndRtTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.inlndRtRmk = this.inlndRtRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stCmncAmdtSeq = this.n1stCmncAmdtSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trfNo = this.trfNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.inlndRtBseLocZipCd = this.inlndRtBseLocZipCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.inlnd45ftRtAmt = this.inlnd45ftRtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.inlndOneWyBxRtAmt = this.inlndOneWyBxRtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
