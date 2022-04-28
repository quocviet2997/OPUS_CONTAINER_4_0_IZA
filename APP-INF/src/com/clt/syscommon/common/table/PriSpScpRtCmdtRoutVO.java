/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : PriSpScpRtCmdtRoutVO.java
*@FileTitle : PriSpScpRtCmdtRoutVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.03
*@LastModifier : 박성수
*@LastVersion : 1.0
* 2009.09.03 박성수 
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
 * @author 박성수
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class PriSpScpRtCmdtRoutVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<PriSpScpRtCmdtRoutVO> models = new ArrayList<PriSpScpRtCmdtRoutVO>();
	
	/* Column Info */
	private String prsRmnRespbCmpbAmt = null;
	/* Column Info */
	private String amdtSeq = null;
	/* Column Info */
	private String svcScpCd = null;
	/* Column Info */
	private String prsCrntRespbOpbAmt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String prsPreLodQty = null;
	/* Column Info */
	private String noteDpSeq = null;
	/* Column Info */
	private String prsUpdDt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String prsPreRespbOpbAmt = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String prsRatUtCd = null;
	/* Column Info */
	private String genSpclRtTpCd = null;
	/* Column Info */
	private String prsCrntPfitCmpbAmt = null;
	/* Column Info */
	private String prsEstmRespbOpbAmt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String prsCrntLodQty = null;
	/* Column Info */
	private String prsEstmLodQty = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String cmdtHdrSeq = null;
	/* Column Info */
	private String prsRmnRespbOpbAmt = null;
	/* Column Info */
	private String prsEstmRespbCmpbAmt = null;
	/* Column Info */
	private String prsRmnPfitCmpbAmt = null;
	/* Column Info */
	private String prsRmnLodQty = null;
	/* Column Info */
	private String prsCrntRespbCmpbAmt = null;
	/* Column Info */
	private String routSeq = null;
	/* Column Info */
	private String prsPrePfitCmpbAmt = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String n1stCmncAmdtSeq = null;
	/* Column Info */
	private String propNo = null;
	/* Column Info */
	private String prsCgoTpCd = null;
	/* Column Info */
	private String prsEstmPfitCmpbAmt = null;
	/* Column Info */
	private String prsPreRespbCmpbAmt = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public PriSpScpRtCmdtRoutVO() {}

	public PriSpScpRtCmdtRoutVO(String ibflag, String pagerows, String propNo, String amdtSeq, String svcScpCd, String genSpclRtTpCd, String cmdtHdrSeq, String routSeq, String prsPreLodQty, String prsPreRespbCmpbAmt, String prsPrePfitCmpbAmt, String prsPreRespbOpbAmt, String prsCrntLodQty, String prsCrntRespbCmpbAmt, String prsCrntPfitCmpbAmt, String prsCrntRespbOpbAmt, String prsEstmLodQty, String prsEstmRespbCmpbAmt, String prsEstmPfitCmpbAmt, String prsEstmRespbOpbAmt, String prsRmnLodQty, String prsRmnRespbCmpbAmt, String prsRmnPfitCmpbAmt, String prsRmnRespbOpbAmt, String prsRatUtCd, String prsCgoTpCd, String prsUpdDt, String n1stCmncAmdtSeq, String noteDpSeq, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.prsRmnRespbCmpbAmt = prsRmnRespbCmpbAmt;
		this.amdtSeq = amdtSeq;
		this.svcScpCd = svcScpCd;
		this.prsCrntRespbOpbAmt = prsCrntRespbOpbAmt;
		this.creDt = creDt;
		this.prsPreLodQty = prsPreLodQty;
		this.noteDpSeq = noteDpSeq;
		this.prsUpdDt = prsUpdDt;
		this.pagerows = pagerows;
		this.prsPreRespbOpbAmt = prsPreRespbOpbAmt;
		this.ibflag = ibflag;
		this.prsRatUtCd = prsRatUtCd;
		this.genSpclRtTpCd = genSpclRtTpCd;
		this.prsCrntPfitCmpbAmt = prsCrntPfitCmpbAmt;
		this.prsEstmRespbOpbAmt = prsEstmRespbOpbAmt;
		this.updUsrId = updUsrId;
		this.prsCrntLodQty = prsCrntLodQty;
		this.prsEstmLodQty = prsEstmLodQty;
		this.updDt = updDt;
		this.cmdtHdrSeq = cmdtHdrSeq;
		this.prsRmnRespbOpbAmt = prsRmnRespbOpbAmt;
		this.prsEstmRespbCmpbAmt = prsEstmRespbCmpbAmt;
		this.prsRmnPfitCmpbAmt = prsRmnPfitCmpbAmt;
		this.prsRmnLodQty = prsRmnLodQty;
		this.prsCrntRespbCmpbAmt = prsCrntRespbCmpbAmt;
		this.routSeq = routSeq;
		this.prsPrePfitCmpbAmt = prsPrePfitCmpbAmt;
		this.creUsrId = creUsrId;
		this.n1stCmncAmdtSeq = n1stCmncAmdtSeq;
		this.propNo = propNo;
		this.prsCgoTpCd = prsCgoTpCd;
		this.prsEstmPfitCmpbAmt = prsEstmPfitCmpbAmt;
		this.prsPreRespbCmpbAmt = prsPreRespbCmpbAmt;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("prs_rmn_respb_cmpb_amt", getPrsRmnRespbCmpbAmt());
		this.hashColumns.put("amdt_seq", getAmdtSeq());
		this.hashColumns.put("svc_scp_cd", getSvcScpCd());
		this.hashColumns.put("prs_crnt_respb_opb_amt", getPrsCrntRespbOpbAmt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("prs_pre_lod_qty", getPrsPreLodQty());
		this.hashColumns.put("note_dp_seq", getNoteDpSeq());
		this.hashColumns.put("prs_upd_dt", getPrsUpdDt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("prs_pre_respb_opb_amt", getPrsPreRespbOpbAmt());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("prs_rat_ut_cd", getPrsRatUtCd());
		this.hashColumns.put("gen_spcl_rt_tp_cd", getGenSpclRtTpCd());
		this.hashColumns.put("prs_crnt_pfit_cmpb_amt", getPrsCrntPfitCmpbAmt());
		this.hashColumns.put("prs_estm_respb_opb_amt", getPrsEstmRespbOpbAmt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("prs_crnt_lod_qty", getPrsCrntLodQty());
		this.hashColumns.put("prs_estm_lod_qty", getPrsEstmLodQty());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cmdt_hdr_seq", getCmdtHdrSeq());
		this.hashColumns.put("prs_rmn_respb_opb_amt", getPrsRmnRespbOpbAmt());
		this.hashColumns.put("prs_estm_respb_cmpb_amt", getPrsEstmRespbCmpbAmt());
		this.hashColumns.put("prs_rmn_pfit_cmpb_amt", getPrsRmnPfitCmpbAmt());
		this.hashColumns.put("prs_rmn_lod_qty", getPrsRmnLodQty());
		this.hashColumns.put("prs_crnt_respb_cmpb_amt", getPrsCrntRespbCmpbAmt());
		this.hashColumns.put("rout_seq", getRoutSeq());
		this.hashColumns.put("prs_pre_pfit_cmpb_amt", getPrsPrePfitCmpbAmt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("n1st_cmnc_amdt_seq", getN1stCmncAmdtSeq());
		this.hashColumns.put("prop_no", getPropNo());
		this.hashColumns.put("prs_cgo_tp_cd", getPrsCgoTpCd());
		this.hashColumns.put("prs_estm_pfit_cmpb_amt", getPrsEstmPfitCmpbAmt());
		this.hashColumns.put("prs_pre_respb_cmpb_amt", getPrsPreRespbCmpbAmt());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("prs_rmn_respb_cmpb_amt", "prsRmnRespbCmpbAmt");
		this.hashFields.put("amdt_seq", "amdtSeq");
		this.hashFields.put("svc_scp_cd", "svcScpCd");
		this.hashFields.put("prs_crnt_respb_opb_amt", "prsCrntRespbOpbAmt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("prs_pre_lod_qty", "prsPreLodQty");
		this.hashFields.put("note_dp_seq", "noteDpSeq");
		this.hashFields.put("prs_upd_dt", "prsUpdDt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("prs_pre_respb_opb_amt", "prsPreRespbOpbAmt");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("prs_rat_ut_cd", "prsRatUtCd");
		this.hashFields.put("gen_spcl_rt_tp_cd", "genSpclRtTpCd");
		this.hashFields.put("prs_crnt_pfit_cmpb_amt", "prsCrntPfitCmpbAmt");
		this.hashFields.put("prs_estm_respb_opb_amt", "prsEstmRespbOpbAmt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("prs_crnt_lod_qty", "prsCrntLodQty");
		this.hashFields.put("prs_estm_lod_qty", "prsEstmLodQty");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cmdt_hdr_seq", "cmdtHdrSeq");
		this.hashFields.put("prs_rmn_respb_opb_amt", "prsRmnRespbOpbAmt");
		this.hashFields.put("prs_estm_respb_cmpb_amt", "prsEstmRespbCmpbAmt");
		this.hashFields.put("prs_rmn_pfit_cmpb_amt", "prsRmnPfitCmpbAmt");
		this.hashFields.put("prs_rmn_lod_qty", "prsRmnLodQty");
		this.hashFields.put("prs_crnt_respb_cmpb_amt", "prsCrntRespbCmpbAmt");
		this.hashFields.put("rout_seq", "routSeq");
		this.hashFields.put("prs_pre_pfit_cmpb_amt", "prsPrePfitCmpbAmt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("n1st_cmnc_amdt_seq", "n1stCmncAmdtSeq");
		this.hashFields.put("prop_no", "propNo");
		this.hashFields.put("prs_cgo_tp_cd", "prsCgoTpCd");
		this.hashFields.put("prs_estm_pfit_cmpb_amt", "prsEstmPfitCmpbAmt");
		this.hashFields.put("prs_pre_respb_cmpb_amt", "prsPreRespbCmpbAmt");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return prsRmnRespbCmpbAmt
	 */
	public String getPrsRmnRespbCmpbAmt() {
		return this.prsRmnRespbCmpbAmt;
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
	 * @return svcScpCd
	 */
	public String getSvcScpCd() {
		return this.svcScpCd;
	}
	
	/**
	 * Column Info
	 * @return prsCrntRespbOpbAmt
	 */
	public String getPrsCrntRespbOpbAmt() {
		return this.prsCrntRespbOpbAmt;
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
	 * @return prsPreLodQty
	 */
	public String getPrsPreLodQty() {
		return this.prsPreLodQty;
	}
	
	/**
	 * Column Info
	 * @return noteDpSeq
	 */
	public String getNoteDpSeq() {
		return this.noteDpSeq;
	}
	
	/**
	 * Column Info
	 * @return prsUpdDt
	 */
	public String getPrsUpdDt() {
		return this.prsUpdDt;
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
	 * @return prsPreRespbOpbAmt
	 */
	public String getPrsPreRespbOpbAmt() {
		return this.prsPreRespbOpbAmt;
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
	 * @return prsRatUtCd
	 */
	public String getPrsRatUtCd() {
		return this.prsRatUtCd;
	}
	
	/**
	 * Column Info
	 * @return genSpclRtTpCd
	 */
	public String getGenSpclRtTpCd() {
		return this.genSpclRtTpCd;
	}
	
	/**
	 * Column Info
	 * @return prsCrntPfitCmpbAmt
	 */
	public String getPrsCrntPfitCmpbAmt() {
		return this.prsCrntPfitCmpbAmt;
	}
	
	/**
	 * Column Info
	 * @return prsEstmRespbOpbAmt
	 */
	public String getPrsEstmRespbOpbAmt() {
		return this.prsEstmRespbOpbAmt;
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
	 * @return prsCrntLodQty
	 */
	public String getPrsCrntLodQty() {
		return this.prsCrntLodQty;
	}
	
	/**
	 * Column Info
	 * @return prsEstmLodQty
	 */
	public String getPrsEstmLodQty() {
		return this.prsEstmLodQty;
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
	 * @return cmdtHdrSeq
	 */
	public String getCmdtHdrSeq() {
		return this.cmdtHdrSeq;
	}
	
	/**
	 * Column Info
	 * @return prsRmnRespbOpbAmt
	 */
	public String getPrsRmnRespbOpbAmt() {
		return this.prsRmnRespbOpbAmt;
	}
	
	/**
	 * Column Info
	 * @return prsEstmRespbCmpbAmt
	 */
	public String getPrsEstmRespbCmpbAmt() {
		return this.prsEstmRespbCmpbAmt;
	}
	
	/**
	 * Column Info
	 * @return prsRmnPfitCmpbAmt
	 */
	public String getPrsRmnPfitCmpbAmt() {
		return this.prsRmnPfitCmpbAmt;
	}
	
	/**
	 * Column Info
	 * @return prsRmnLodQty
	 */
	public String getPrsRmnLodQty() {
		return this.prsRmnLodQty;
	}
	
	/**
	 * Column Info
	 * @return prsCrntRespbCmpbAmt
	 */
	public String getPrsCrntRespbCmpbAmt() {
		return this.prsCrntRespbCmpbAmt;
	}
	
	/**
	 * Column Info
	 * @return routSeq
	 */
	public String getRoutSeq() {
		return this.routSeq;
	}
	
	/**
	 * Column Info
	 * @return prsPrePfitCmpbAmt
	 */
	public String getPrsPrePfitCmpbAmt() {
		return this.prsPrePfitCmpbAmt;
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
	 * @return n1stCmncAmdtSeq
	 */
	public String getN1stCmncAmdtSeq() {
		return this.n1stCmncAmdtSeq;
	}
	
	/**
	 * Column Info
	 * @return propNo
	 */
	public String getPropNo() {
		return this.propNo;
	}
	
	/**
	 * Column Info
	 * @return prsCgoTpCd
	 */
	public String getPrsCgoTpCd() {
		return this.prsCgoTpCd;
	}
	
	/**
	 * Column Info
	 * @return prsEstmPfitCmpbAmt
	 */
	public String getPrsEstmPfitCmpbAmt() {
		return this.prsEstmPfitCmpbAmt;
	}
	
	/**
	 * Column Info
	 * @return prsPreRespbCmpbAmt
	 */
	public String getPrsPreRespbCmpbAmt() {
		return this.prsPreRespbCmpbAmt;
	}
	

	/**
	 * Column Info
	 * @param prsRmnRespbCmpbAmt
	 */
	public void setPrsRmnRespbCmpbAmt(String prsRmnRespbCmpbAmt) {
		this.prsRmnRespbCmpbAmt = prsRmnRespbCmpbAmt;
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
	 * @param svcScpCd
	 */
	public void setSvcScpCd(String svcScpCd) {
		this.svcScpCd = svcScpCd;
	}
	
	/**
	 * Column Info
	 * @param prsCrntRespbOpbAmt
	 */
	public void setPrsCrntRespbOpbAmt(String prsCrntRespbOpbAmt) {
		this.prsCrntRespbOpbAmt = prsCrntRespbOpbAmt;
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
	 * @param prsPreLodQty
	 */
	public void setPrsPreLodQty(String prsPreLodQty) {
		this.prsPreLodQty = prsPreLodQty;
	}
	
	/**
	 * Column Info
	 * @param noteDpSeq
	 */
	public void setNoteDpSeq(String noteDpSeq) {
		this.noteDpSeq = noteDpSeq;
	}
	
	/**
	 * Column Info
	 * @param prsUpdDt
	 */
	public void setPrsUpdDt(String prsUpdDt) {
		this.prsUpdDt = prsUpdDt;
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
	 * @param prsPreRespbOpbAmt
	 */
	public void setPrsPreRespbOpbAmt(String prsPreRespbOpbAmt) {
		this.prsPreRespbOpbAmt = prsPreRespbOpbAmt;
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
	 * @param prsRatUtCd
	 */
	public void setPrsRatUtCd(String prsRatUtCd) {
		this.prsRatUtCd = prsRatUtCd;
	}
	
	/**
	 * Column Info
	 * @param genSpclRtTpCd
	 */
	public void setGenSpclRtTpCd(String genSpclRtTpCd) {
		this.genSpclRtTpCd = genSpclRtTpCd;
	}
	
	/**
	 * Column Info
	 * @param prsCrntPfitCmpbAmt
	 */
	public void setPrsCrntPfitCmpbAmt(String prsCrntPfitCmpbAmt) {
		this.prsCrntPfitCmpbAmt = prsCrntPfitCmpbAmt;
	}
	
	/**
	 * Column Info
	 * @param prsEstmRespbOpbAmt
	 */
	public void setPrsEstmRespbOpbAmt(String prsEstmRespbOpbAmt) {
		this.prsEstmRespbOpbAmt = prsEstmRespbOpbAmt;
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
	 * @param prsCrntLodQty
	 */
	public void setPrsCrntLodQty(String prsCrntLodQty) {
		this.prsCrntLodQty = prsCrntLodQty;
	}
	
	/**
	 * Column Info
	 * @param prsEstmLodQty
	 */
	public void setPrsEstmLodQty(String prsEstmLodQty) {
		this.prsEstmLodQty = prsEstmLodQty;
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
	 * @param cmdtHdrSeq
	 */
	public void setCmdtHdrSeq(String cmdtHdrSeq) {
		this.cmdtHdrSeq = cmdtHdrSeq;
	}
	
	/**
	 * Column Info
	 * @param prsRmnRespbOpbAmt
	 */
	public void setPrsRmnRespbOpbAmt(String prsRmnRespbOpbAmt) {
		this.prsRmnRespbOpbAmt = prsRmnRespbOpbAmt;
	}
	
	/**
	 * Column Info
	 * @param prsEstmRespbCmpbAmt
	 */
	public void setPrsEstmRespbCmpbAmt(String prsEstmRespbCmpbAmt) {
		this.prsEstmRespbCmpbAmt = prsEstmRespbCmpbAmt;
	}
	
	/**
	 * Column Info
	 * @param prsRmnPfitCmpbAmt
	 */
	public void setPrsRmnPfitCmpbAmt(String prsRmnPfitCmpbAmt) {
		this.prsRmnPfitCmpbAmt = prsRmnPfitCmpbAmt;
	}
	
	/**
	 * Column Info
	 * @param prsRmnLodQty
	 */
	public void setPrsRmnLodQty(String prsRmnLodQty) {
		this.prsRmnLodQty = prsRmnLodQty;
	}
	
	/**
	 * Column Info
	 * @param prsCrntRespbCmpbAmt
	 */
	public void setPrsCrntRespbCmpbAmt(String prsCrntRespbCmpbAmt) {
		this.prsCrntRespbCmpbAmt = prsCrntRespbCmpbAmt;
	}
	
	/**
	 * Column Info
	 * @param routSeq
	 */
	public void setRoutSeq(String routSeq) {
		this.routSeq = routSeq;
	}
	
	/**
	 * Column Info
	 * @param prsPrePfitCmpbAmt
	 */
	public void setPrsPrePfitCmpbAmt(String prsPrePfitCmpbAmt) {
		this.prsPrePfitCmpbAmt = prsPrePfitCmpbAmt;
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
	 * @param n1stCmncAmdtSeq
	 */
	public void setN1stCmncAmdtSeq(String n1stCmncAmdtSeq) {
		this.n1stCmncAmdtSeq = n1stCmncAmdtSeq;
	}
	
	/**
	 * Column Info
	 * @param propNo
	 */
	public void setPropNo(String propNo) {
		this.propNo = propNo;
	}
	
	/**
	 * Column Info
	 * @param prsCgoTpCd
	 */
	public void setPrsCgoTpCd(String prsCgoTpCd) {
		this.prsCgoTpCd = prsCgoTpCd;
	}
	
	/**
	 * Column Info
	 * @param prsEstmPfitCmpbAmt
	 */
	public void setPrsEstmPfitCmpbAmt(String prsEstmPfitCmpbAmt) {
		this.prsEstmPfitCmpbAmt = prsEstmPfitCmpbAmt;
	}
	
	/**
	 * Column Info
	 * @param prsPreRespbCmpbAmt
	 */
	public void setPrsPreRespbCmpbAmt(String prsPreRespbCmpbAmt) {
		this.prsPreRespbCmpbAmt = prsPreRespbCmpbAmt;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setPrsRmnRespbCmpbAmt(JSPUtil.getParameter(request, "prs_rmn_respb_cmpb_amt", ""));
		setAmdtSeq(JSPUtil.getParameter(request, "amdt_seq", ""));
		setSvcScpCd(JSPUtil.getParameter(request, "svc_scp_cd", ""));
		setPrsCrntRespbOpbAmt(JSPUtil.getParameter(request, "prs_crnt_respb_opb_amt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setPrsPreLodQty(JSPUtil.getParameter(request, "prs_pre_lod_qty", ""));
		setNoteDpSeq(JSPUtil.getParameter(request, "note_dp_seq", ""));
		setPrsUpdDt(JSPUtil.getParameter(request, "prs_upd_dt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setPrsPreRespbOpbAmt(JSPUtil.getParameter(request, "prs_pre_respb_opb_amt", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setPrsRatUtCd(JSPUtil.getParameter(request, "prs_rat_ut_cd", ""));
		setGenSpclRtTpCd(JSPUtil.getParameter(request, "gen_spcl_rt_tp_cd", ""));
		setPrsCrntPfitCmpbAmt(JSPUtil.getParameter(request, "prs_crnt_pfit_cmpb_amt", ""));
		setPrsEstmRespbOpbAmt(JSPUtil.getParameter(request, "prs_estm_respb_opb_amt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setPrsCrntLodQty(JSPUtil.getParameter(request, "prs_crnt_lod_qty", ""));
		setPrsEstmLodQty(JSPUtil.getParameter(request, "prs_estm_lod_qty", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCmdtHdrSeq(JSPUtil.getParameter(request, "cmdt_hdr_seq", ""));
		setPrsRmnRespbOpbAmt(JSPUtil.getParameter(request, "prs_rmn_respb_opb_amt", ""));
		setPrsEstmRespbCmpbAmt(JSPUtil.getParameter(request, "prs_estm_respb_cmpb_amt", ""));
		setPrsRmnPfitCmpbAmt(JSPUtil.getParameter(request, "prs_rmn_pfit_cmpb_amt", ""));
		setPrsRmnLodQty(JSPUtil.getParameter(request, "prs_rmn_lod_qty", ""));
		setPrsCrntRespbCmpbAmt(JSPUtil.getParameter(request, "prs_crnt_respb_cmpb_amt", ""));
		setRoutSeq(JSPUtil.getParameter(request, "rout_seq", ""));
		setPrsPrePfitCmpbAmt(JSPUtil.getParameter(request, "prs_pre_pfit_cmpb_amt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setN1stCmncAmdtSeq(JSPUtil.getParameter(request, "n1st_cmnc_amdt_seq", ""));
		setPropNo(JSPUtil.getParameter(request, "prop_no", ""));
		setPrsCgoTpCd(JSPUtil.getParameter(request, "prs_cgo_tp_cd", ""));
		setPrsEstmPfitCmpbAmt(JSPUtil.getParameter(request, "prs_estm_pfit_cmpb_amt", ""));
		setPrsPreRespbCmpbAmt(JSPUtil.getParameter(request, "prs_pre_respb_cmpb_amt", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return PriSpScpRtCmdtRoutVO[]
	 */
	public PriSpScpRtCmdtRoutVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return PriSpScpRtCmdtRoutVO[]
	 */
	public PriSpScpRtCmdtRoutVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		PriSpScpRtCmdtRoutVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] prsRmnRespbCmpbAmt = (JSPUtil.getParameter(request, prefix	+ "prs_rmn_respb_cmpb_amt", length));
			String[] amdtSeq = (JSPUtil.getParameter(request, prefix	+ "amdt_seq", length));
			String[] svcScpCd = (JSPUtil.getParameter(request, prefix	+ "svc_scp_cd", length));
			String[] prsCrntRespbOpbAmt = (JSPUtil.getParameter(request, prefix	+ "prs_crnt_respb_opb_amt", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] prsPreLodQty = (JSPUtil.getParameter(request, prefix	+ "prs_pre_lod_qty", length));
			String[] noteDpSeq = (JSPUtil.getParameter(request, prefix	+ "note_dp_seq", length));
			String[] prsUpdDt = (JSPUtil.getParameter(request, prefix	+ "prs_upd_dt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] prsPreRespbOpbAmt = (JSPUtil.getParameter(request, prefix	+ "prs_pre_respb_opb_amt", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] prsRatUtCd = (JSPUtil.getParameter(request, prefix	+ "prs_rat_ut_cd", length));
			String[] genSpclRtTpCd = (JSPUtil.getParameter(request, prefix	+ "gen_spcl_rt_tp_cd", length));
			String[] prsCrntPfitCmpbAmt = (JSPUtil.getParameter(request, prefix	+ "prs_crnt_pfit_cmpb_amt", length));
			String[] prsEstmRespbOpbAmt = (JSPUtil.getParameter(request, prefix	+ "prs_estm_respb_opb_amt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] prsCrntLodQty = (JSPUtil.getParameter(request, prefix	+ "prs_crnt_lod_qty", length));
			String[] prsEstmLodQty = (JSPUtil.getParameter(request, prefix	+ "prs_estm_lod_qty", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] cmdtHdrSeq = (JSPUtil.getParameter(request, prefix	+ "cmdt_hdr_seq", length));
			String[] prsRmnRespbOpbAmt = (JSPUtil.getParameter(request, prefix	+ "prs_rmn_respb_opb_amt", length));
			String[] prsEstmRespbCmpbAmt = (JSPUtil.getParameter(request, prefix	+ "prs_estm_respb_cmpb_amt", length));
			String[] prsRmnPfitCmpbAmt = (JSPUtil.getParameter(request, prefix	+ "prs_rmn_pfit_cmpb_amt", length));
			String[] prsRmnLodQty = (JSPUtil.getParameter(request, prefix	+ "prs_rmn_lod_qty", length));
			String[] prsCrntRespbCmpbAmt = (JSPUtil.getParameter(request, prefix	+ "prs_crnt_respb_cmpb_amt", length));
			String[] routSeq = (JSPUtil.getParameter(request, prefix	+ "rout_seq", length));
			String[] prsPrePfitCmpbAmt = (JSPUtil.getParameter(request, prefix	+ "prs_pre_pfit_cmpb_amt", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] n1stCmncAmdtSeq = (JSPUtil.getParameter(request, prefix	+ "n1st_cmnc_amdt_seq", length));
			String[] propNo = (JSPUtil.getParameter(request, prefix	+ "prop_no", length));
			String[] prsCgoTpCd = (JSPUtil.getParameter(request, prefix	+ "prs_cgo_tp_cd", length));
			String[] prsEstmPfitCmpbAmt = (JSPUtil.getParameter(request, prefix	+ "prs_estm_pfit_cmpb_amt", length));
			String[] prsPreRespbCmpbAmt = (JSPUtil.getParameter(request, prefix	+ "prs_pre_respb_cmpb_amt", length));
			
			for (int i = 0; i < length; i++) {
				model = new PriSpScpRtCmdtRoutVO();
				if (prsRmnRespbCmpbAmt[i] != null)
					model.setPrsRmnRespbCmpbAmt(prsRmnRespbCmpbAmt[i]);
				if (amdtSeq[i] != null)
					model.setAmdtSeq(amdtSeq[i]);
				if (svcScpCd[i] != null)
					model.setSvcScpCd(svcScpCd[i]);
				if (prsCrntRespbOpbAmt[i] != null)
					model.setPrsCrntRespbOpbAmt(prsCrntRespbOpbAmt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (prsPreLodQty[i] != null)
					model.setPrsPreLodQty(prsPreLodQty[i]);
				if (noteDpSeq[i] != null)
					model.setNoteDpSeq(noteDpSeq[i]);
				if (prsUpdDt[i] != null)
					model.setPrsUpdDt(prsUpdDt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (prsPreRespbOpbAmt[i] != null)
					model.setPrsPreRespbOpbAmt(prsPreRespbOpbAmt[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (prsRatUtCd[i] != null)
					model.setPrsRatUtCd(prsRatUtCd[i]);
				if (genSpclRtTpCd[i] != null)
					model.setGenSpclRtTpCd(genSpclRtTpCd[i]);
				if (prsCrntPfitCmpbAmt[i] != null)
					model.setPrsCrntPfitCmpbAmt(prsCrntPfitCmpbAmt[i]);
				if (prsEstmRespbOpbAmt[i] != null)
					model.setPrsEstmRespbOpbAmt(prsEstmRespbOpbAmt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (prsCrntLodQty[i] != null)
					model.setPrsCrntLodQty(prsCrntLodQty[i]);
				if (prsEstmLodQty[i] != null)
					model.setPrsEstmLodQty(prsEstmLodQty[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (cmdtHdrSeq[i] != null)
					model.setCmdtHdrSeq(cmdtHdrSeq[i]);
				if (prsRmnRespbOpbAmt[i] != null)
					model.setPrsRmnRespbOpbAmt(prsRmnRespbOpbAmt[i]);
				if (prsEstmRespbCmpbAmt[i] != null)
					model.setPrsEstmRespbCmpbAmt(prsEstmRespbCmpbAmt[i]);
				if (prsRmnPfitCmpbAmt[i] != null)
					model.setPrsRmnPfitCmpbAmt(prsRmnPfitCmpbAmt[i]);
				if (prsRmnLodQty[i] != null)
					model.setPrsRmnLodQty(prsRmnLodQty[i]);
				if (prsCrntRespbCmpbAmt[i] != null)
					model.setPrsCrntRespbCmpbAmt(prsCrntRespbCmpbAmt[i]);
				if (routSeq[i] != null)
					model.setRoutSeq(routSeq[i]);
				if (prsPrePfitCmpbAmt[i] != null)
					model.setPrsPrePfitCmpbAmt(prsPrePfitCmpbAmt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (n1stCmncAmdtSeq[i] != null)
					model.setN1stCmncAmdtSeq(n1stCmncAmdtSeq[i]);
				if (propNo[i] != null)
					model.setPropNo(propNo[i]);
				if (prsCgoTpCd[i] != null)
					model.setPrsCgoTpCd(prsCgoTpCd[i]);
				if (prsEstmPfitCmpbAmt[i] != null)
					model.setPrsEstmPfitCmpbAmt(prsEstmPfitCmpbAmt[i]);
				if (prsPreRespbCmpbAmt[i] != null)
					model.setPrsPreRespbCmpbAmt(prsPreRespbCmpbAmt[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getPriSpScpRtCmdtRoutVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return PriSpScpRtCmdtRoutVO[]
	 */
	public PriSpScpRtCmdtRoutVO[] getPriSpScpRtCmdtRoutVOs(){
		PriSpScpRtCmdtRoutVO[] vos = (PriSpScpRtCmdtRoutVO[])models.toArray(new PriSpScpRtCmdtRoutVO[models.size()]);
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
		this.prsRmnRespbCmpbAmt = this.prsRmnRespbCmpbAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.amdtSeq = this.amdtSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.svcScpCd = this.svcScpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prsCrntRespbOpbAmt = this.prsCrntRespbOpbAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prsPreLodQty = this.prsPreLodQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.noteDpSeq = this.noteDpSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prsUpdDt = this.prsUpdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prsPreRespbOpbAmt = this.prsPreRespbOpbAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prsRatUtCd = this.prsRatUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.genSpclRtTpCd = this.genSpclRtTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prsCrntPfitCmpbAmt = this.prsCrntPfitCmpbAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prsEstmRespbOpbAmt = this.prsEstmRespbOpbAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prsCrntLodQty = this.prsCrntLodQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prsEstmLodQty = this.prsEstmLodQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cmdtHdrSeq = this.cmdtHdrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prsRmnRespbOpbAmt = this.prsRmnRespbOpbAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prsEstmRespbCmpbAmt = this.prsEstmRespbCmpbAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prsRmnPfitCmpbAmt = this.prsRmnPfitCmpbAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prsRmnLodQty = this.prsRmnLodQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prsCrntRespbCmpbAmt = this.prsCrntRespbCmpbAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.routSeq = this.routSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prsPrePfitCmpbAmt = this.prsPrePfitCmpbAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stCmncAmdtSeq = this.n1stCmncAmdtSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.propNo = this.propNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prsCgoTpCd = this.prsCgoTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prsEstmPfitCmpbAmt = this.prsEstmPfitCmpbAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prsPreRespbCmpbAmt = this.prsPreRespbCmpbAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
