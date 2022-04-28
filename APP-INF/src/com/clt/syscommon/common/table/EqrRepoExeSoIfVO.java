/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : EqrRepoExeSoIfVO.java
*@FileTitle : EqrRepoExeSoIfVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.01
*@LastModifier : 정은호
*@LastVersion : 1.0
* 2009.09.01 정은호 
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
 * @author 정은호
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class EqrRepoExeSoIfVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<EqrRepoExeSoIfVO> models = new ArrayList<EqrRepoExeSoIfVO>();
	
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String soIfDivCd = null;
	/* Column Info */
	private String fmYdCd = null;
	/* Column Info */
	private String woExeDt = null;
	/* Column Info */
	private String eqCtrlOfcCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String refId = null;
	/* Column Info */
	private String plnYrwk = null;
	/* Column Info */
	private String repoCostAmt = null;
	/* Column Info */
	private String trspModCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String toYdCd = null;
	/* Column Info */
	private String vslLaneCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String pastRepoPlnFlg = null;
	/* Column Info */
	private String cntrTpszCd = null;
	/* Column Info */
	private String trnsRqstOfcCd = null;
	/* Column Info */
	private String trspSoStsCd = null;
	/* Column Info */
	private String soRqstDt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String trnsRqstUsrId = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String woExeFlg = null;
	/* Column Info */
	private String coCd = null;
	/* Column Info */
	private String fmDt = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String plnSeq = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Column Info */
	private String repoPlnId = null;
	/* Column Info */
	private String toDt = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String trnsRqstRsn = null;
	/* Column Info */
	private String refSeq = null;
	/* Column Info */
	private String woExeErrRmk = null;
	/* Column Info */
	private String cntrNo = null;
	/* Column Info */
	private String woRqstFlg = null;
	/* Column Info */
	private String repoPurpRmk = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public EqrRepoExeSoIfVO() {}

	public EqrRepoExeSoIfVO(String ibflag, String pagerows, String repoPlnId, String plnYrwk, String plnSeq, String refId, String refSeq, String cntrTpszCd, String coCd, String soIfDivCd, String trspModCd, String fmYdCd, String fmDt, String toYdCd, String toDt, String vslLaneCd, String vslCd, String skdVoyNo, String skdDirCd, String repoPurpRmk, String cntrNo, String woExeFlg, String woExeDt, String repoCostAmt, String eqCtrlOfcCd, String soRqstDt, String woRqstFlg, String woExeErrRmk, String trspSoStsCd, String trnsRqstOfcCd, String trnsRqstUsrId, String trnsRqstRsn, String pastRepoPlnFlg, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.vslCd = vslCd;
		this.soIfDivCd = soIfDivCd;
		this.fmYdCd = fmYdCd;
		this.woExeDt = woExeDt;
		this.eqCtrlOfcCd = eqCtrlOfcCd;
		this.creDt = creDt;
		this.refId = refId;
		this.plnYrwk = plnYrwk;
		this.repoCostAmt = repoCostAmt;
		this.trspModCd = trspModCd;
		this.pagerows = pagerows;
		this.toYdCd = toYdCd;
		this.vslLaneCd = vslLaneCd;
		this.ibflag = ibflag;
		this.pastRepoPlnFlg = pastRepoPlnFlg;
		this.cntrTpszCd = cntrTpszCd;
		this.trnsRqstOfcCd = trnsRqstOfcCd;
		this.trspSoStsCd = trspSoStsCd;
		this.soRqstDt = soRqstDt;
		this.updUsrId = updUsrId;
		this.trnsRqstUsrId = trnsRqstUsrId;
		this.updDt = updDt;
		this.woExeFlg = woExeFlg;
		this.coCd = coCd;
		this.fmDt = fmDt;
		this.skdVoyNo = skdVoyNo;
		this.plnSeq = plnSeq;
		this.skdDirCd = skdDirCd;
		this.repoPlnId = repoPlnId;
		this.toDt = toDt;
		this.creUsrId = creUsrId;
		this.trnsRqstRsn = trnsRqstRsn;
		this.refSeq = refSeq;
		this.woExeErrRmk = woExeErrRmk;
		this.cntrNo = cntrNo;
		this.woRqstFlg = woRqstFlg;
		this.repoPurpRmk = repoPurpRmk;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("so_if_div_cd", getSoIfDivCd());
		this.hashColumns.put("fm_yd_cd", getFmYdCd());
		this.hashColumns.put("wo_exe_dt", getWoExeDt());
		this.hashColumns.put("eq_ctrl_ofc_cd", getEqCtrlOfcCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("ref_id", getRefId());
		this.hashColumns.put("pln_yrwk", getPlnYrwk());
		this.hashColumns.put("repo_cost_amt", getRepoCostAmt());
		this.hashColumns.put("trsp_mod_cd", getTrspModCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("to_yd_cd", getToYdCd());
		this.hashColumns.put("vsl_lane_cd", getVslLaneCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("past_repo_pln_flg", getPastRepoPlnFlg());
		this.hashColumns.put("cntr_tpsz_cd", getCntrTpszCd());
		this.hashColumns.put("trns_rqst_ofc_cd", getTrnsRqstOfcCd());
		this.hashColumns.put("trsp_so_sts_cd", getTrspSoStsCd());
		this.hashColumns.put("so_rqst_dt", getSoRqstDt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("trns_rqst_usr_id", getTrnsRqstUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("wo_exe_flg", getWoExeFlg());
		this.hashColumns.put("co_cd", getCoCd());
		this.hashColumns.put("fm_dt", getFmDt());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("pln_seq", getPlnSeq());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("repo_pln_id", getRepoPlnId());
		this.hashColumns.put("to_dt", getToDt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("trns_rqst_rsn", getTrnsRqstRsn());
		this.hashColumns.put("ref_seq", getRefSeq());
		this.hashColumns.put("wo_exe_err_rmk", getWoExeErrRmk());
		this.hashColumns.put("cntr_no", getCntrNo());
		this.hashColumns.put("wo_rqst_flg", getWoRqstFlg());
		this.hashColumns.put("repo_purp_rmk", getRepoPurpRmk());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("so_if_div_cd", "soIfDivCd");
		this.hashFields.put("fm_yd_cd", "fmYdCd");
		this.hashFields.put("wo_exe_dt", "woExeDt");
		this.hashFields.put("eq_ctrl_ofc_cd", "eqCtrlOfcCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("ref_id", "refId");
		this.hashFields.put("pln_yrwk", "plnYrwk");
		this.hashFields.put("repo_cost_amt", "repoCostAmt");
		this.hashFields.put("trsp_mod_cd", "trspModCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("to_yd_cd", "toYdCd");
		this.hashFields.put("vsl_lane_cd", "vslLaneCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("past_repo_pln_flg", "pastRepoPlnFlg");
		this.hashFields.put("cntr_tpsz_cd", "cntrTpszCd");
		this.hashFields.put("trns_rqst_ofc_cd", "trnsRqstOfcCd");
		this.hashFields.put("trsp_so_sts_cd", "trspSoStsCd");
		this.hashFields.put("so_rqst_dt", "soRqstDt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("trns_rqst_usr_id", "trnsRqstUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("wo_exe_flg", "woExeFlg");
		this.hashFields.put("co_cd", "coCd");
		this.hashFields.put("fm_dt", "fmDt");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("pln_seq", "plnSeq");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("repo_pln_id", "repoPlnId");
		this.hashFields.put("to_dt", "toDt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("trns_rqst_rsn", "trnsRqstRsn");
		this.hashFields.put("ref_seq", "refSeq");
		this.hashFields.put("wo_exe_err_rmk", "woExeErrRmk");
		this.hashFields.put("cntr_no", "cntrNo");
		this.hashFields.put("wo_rqst_flg", "woRqstFlg");
		this.hashFields.put("repo_purp_rmk", "repoPurpRmk");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return vslCd
	 */
	public String getVslCd() {
		return this.vslCd;
	}
	
	/**
	 * Column Info
	 * @return soIfDivCd
	 */
	public String getSoIfDivCd() {
		return this.soIfDivCd;
	}
	
	/**
	 * Column Info
	 * @return fmYdCd
	 */
	public String getFmYdCd() {
		return this.fmYdCd;
	}
	
	/**
	 * Column Info
	 * @return woExeDt
	 */
	public String getWoExeDt() {
		return this.woExeDt;
	}
	
	/**
	 * Column Info
	 * @return eqCtrlOfcCd
	 */
	public String getEqCtrlOfcCd() {
		return this.eqCtrlOfcCd;
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
	 * @return refId
	 */
	public String getRefId() {
		return this.refId;
	}
	
	/**
	 * Column Info
	 * @return plnYrwk
	 */
	public String getPlnYrwk() {
		return this.plnYrwk;
	}
	
	/**
	 * Column Info
	 * @return repoCostAmt
	 */
	public String getRepoCostAmt() {
		return this.repoCostAmt;
	}
	
	/**
	 * Column Info
	 * @return trspModCd
	 */
	public String getTrspModCd() {
		return this.trspModCd;
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
	 * @return toYdCd
	 */
	public String getToYdCd() {
		return this.toYdCd;
	}
	
	/**
	 * Column Info
	 * @return vslLaneCd
	 */
	public String getVslLaneCd() {
		return this.vslLaneCd;
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
	 * @return pastRepoPlnFlg
	 */
	public String getPastRepoPlnFlg() {
		return this.pastRepoPlnFlg;
	}
	
	/**
	 * Column Info
	 * @return cntrTpszCd
	 */
	public String getCntrTpszCd() {
		return this.cntrTpszCd;
	}
	
	/**
	 * Column Info
	 * @return trnsRqstOfcCd
	 */
	public String getTrnsRqstOfcCd() {
		return this.trnsRqstOfcCd;
	}
	
	/**
	 * Column Info
	 * @return trspSoStsCd
	 */
	public String getTrspSoStsCd() {
		return this.trspSoStsCd;
	}
	
	/**
	 * Column Info
	 * @return soRqstDt
	 */
	public String getSoRqstDt() {
		return this.soRqstDt;
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
	 * @return trnsRqstUsrId
	 */
	public String getTrnsRqstUsrId() {
		return this.trnsRqstUsrId;
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
	 * @return woExeFlg
	 */
	public String getWoExeFlg() {
		return this.woExeFlg;
	}
	
	/**
	 * Column Info
	 * @return coCd
	 */
	public String getCoCd() {
		return this.coCd;
	}
	
	/**
	 * Column Info
	 * @return fmDt
	 */
	public String getFmDt() {
		return this.fmDt;
	}
	
	/**
	 * Column Info
	 * @return skdVoyNo
	 */
	public String getSkdVoyNo() {
		return this.skdVoyNo;
	}
	
	/**
	 * Column Info
	 * @return plnSeq
	 */
	public String getPlnSeq() {
		return this.plnSeq;
	}
	
	/**
	 * Column Info
	 * @return skdDirCd
	 */
	public String getSkdDirCd() {
		return this.skdDirCd;
	}
	
	/**
	 * Column Info
	 * @return repoPlnId
	 */
	public String getRepoPlnId() {
		return this.repoPlnId;
	}
	
	/**
	 * Column Info
	 * @return toDt
	 */
	public String getToDt() {
		return this.toDt;
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
	 * @return trnsRqstRsn
	 */
	public String getTrnsRqstRsn() {
		return this.trnsRqstRsn;
	}
	
	/**
	 * Column Info
	 * @return refSeq
	 */
	public String getRefSeq() {
		return this.refSeq;
	}
	
	/**
	 * Column Info
	 * @return woExeErrRmk
	 */
	public String getWoExeErrRmk() {
		return this.woExeErrRmk;
	}
	
	/**
	 * Column Info
	 * @return cntrNo
	 */
	public String getCntrNo() {
		return this.cntrNo;
	}
	
	/**
	 * Column Info
	 * @return woRqstFlg
	 */
	public String getWoRqstFlg() {
		return this.woRqstFlg;
	}
	
	/**
	 * Column Info
	 * @return repoPurpRmk
	 */
	public String getRepoPurpRmk() {
		return this.repoPurpRmk;
	}
	

	/**
	 * Column Info
	 * @param vslCd
	 */
	public void setVslCd(String vslCd) {
		this.vslCd = vslCd;
	}
	
	/**
	 * Column Info
	 * @param soIfDivCd
	 */
	public void setSoIfDivCd(String soIfDivCd) {
		this.soIfDivCd = soIfDivCd;
	}
	
	/**
	 * Column Info
	 * @param fmYdCd
	 */
	public void setFmYdCd(String fmYdCd) {
		this.fmYdCd = fmYdCd;
	}
	
	/**
	 * Column Info
	 * @param woExeDt
	 */
	public void setWoExeDt(String woExeDt) {
		this.woExeDt = woExeDt;
	}
	
	/**
	 * Column Info
	 * @param eqCtrlOfcCd
	 */
	public void setEqCtrlOfcCd(String eqCtrlOfcCd) {
		this.eqCtrlOfcCd = eqCtrlOfcCd;
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
	 * @param refId
	 */
	public void setRefId(String refId) {
		this.refId = refId;
	}
	
	/**
	 * Column Info
	 * @param plnYrwk
	 */
	public void setPlnYrwk(String plnYrwk) {
		this.plnYrwk = plnYrwk;
	}
	
	/**
	 * Column Info
	 * @param repoCostAmt
	 */
	public void setRepoCostAmt(String repoCostAmt) {
		this.repoCostAmt = repoCostAmt;
	}
	
	/**
	 * Column Info
	 * @param trspModCd
	 */
	public void setTrspModCd(String trspModCd) {
		this.trspModCd = trspModCd;
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
	 * @param toYdCd
	 */
	public void setToYdCd(String toYdCd) {
		this.toYdCd = toYdCd;
	}
	
	/**
	 * Column Info
	 * @param vslLaneCd
	 */
	public void setVslLaneCd(String vslLaneCd) {
		this.vslLaneCd = vslLaneCd;
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
	 * @param pastRepoPlnFlg
	 */
	public void setPastRepoPlnFlg(String pastRepoPlnFlg) {
		this.pastRepoPlnFlg = pastRepoPlnFlg;
	}
	
	/**
	 * Column Info
	 * @param cntrTpszCd
	 */
	public void setCntrTpszCd(String cntrTpszCd) {
		this.cntrTpszCd = cntrTpszCd;
	}
	
	/**
	 * Column Info
	 * @param trnsRqstOfcCd
	 */
	public void setTrnsRqstOfcCd(String trnsRqstOfcCd) {
		this.trnsRqstOfcCd = trnsRqstOfcCd;
	}
	
	/**
	 * Column Info
	 * @param trspSoStsCd
	 */
	public void setTrspSoStsCd(String trspSoStsCd) {
		this.trspSoStsCd = trspSoStsCd;
	}
	
	/**
	 * Column Info
	 * @param soRqstDt
	 */
	public void setSoRqstDt(String soRqstDt) {
		this.soRqstDt = soRqstDt;
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
	 * @param trnsRqstUsrId
	 */
	public void setTrnsRqstUsrId(String trnsRqstUsrId) {
		this.trnsRqstUsrId = trnsRqstUsrId;
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
	 * @param woExeFlg
	 */
	public void setWoExeFlg(String woExeFlg) {
		this.woExeFlg = woExeFlg;
	}
	
	/**
	 * Column Info
	 * @param coCd
	 */
	public void setCoCd(String coCd) {
		this.coCd = coCd;
	}
	
	/**
	 * Column Info
	 * @param fmDt
	 */
	public void setFmDt(String fmDt) {
		this.fmDt = fmDt;
	}
	
	/**
	 * Column Info
	 * @param skdVoyNo
	 */
	public void setSkdVoyNo(String skdVoyNo) {
		this.skdVoyNo = skdVoyNo;
	}
	
	/**
	 * Column Info
	 * @param plnSeq
	 */
	public void setPlnSeq(String plnSeq) {
		this.plnSeq = plnSeq;
	}
	
	/**
	 * Column Info
	 * @param skdDirCd
	 */
	public void setSkdDirCd(String skdDirCd) {
		this.skdDirCd = skdDirCd;
	}
	
	/**
	 * Column Info
	 * @param repoPlnId
	 */
	public void setRepoPlnId(String repoPlnId) {
		this.repoPlnId = repoPlnId;
	}
	
	/**
	 * Column Info
	 * @param toDt
	 */
	public void setToDt(String toDt) {
		this.toDt = toDt;
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
	 * @param trnsRqstRsn
	 */
	public void setTrnsRqstRsn(String trnsRqstRsn) {
		this.trnsRqstRsn = trnsRqstRsn;
	}
	
	/**
	 * Column Info
	 * @param refSeq
	 */
	public void setRefSeq(String refSeq) {
		this.refSeq = refSeq;
	}
	
	/**
	 * Column Info
	 * @param woExeErrRmk
	 */
	public void setWoExeErrRmk(String woExeErrRmk) {
		this.woExeErrRmk = woExeErrRmk;
	}
	
	/**
	 * Column Info
	 * @param cntrNo
	 */
	public void setCntrNo(String cntrNo) {
		this.cntrNo = cntrNo;
	}
	
	/**
	 * Column Info
	 * @param woRqstFlg
	 */
	public void setWoRqstFlg(String woRqstFlg) {
		this.woRqstFlg = woRqstFlg;
	}
	
	/**
	 * Column Info
	 * @param repoPurpRmk
	 */
	public void setRepoPurpRmk(String repoPurpRmk) {
		this.repoPurpRmk = repoPurpRmk;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setSoIfDivCd(JSPUtil.getParameter(request, "so_if_div_cd", ""));
		setFmYdCd(JSPUtil.getParameter(request, "fm_yd_cd", ""));
		setWoExeDt(JSPUtil.getParameter(request, "wo_exe_dt", ""));
		setEqCtrlOfcCd(JSPUtil.getParameter(request, "eq_ctrl_ofc_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setRefId(JSPUtil.getParameter(request, "ref_id", ""));
		setPlnYrwk(JSPUtil.getParameter(request, "pln_yrwk", ""));
		setRepoCostAmt(JSPUtil.getParameter(request, "repo_cost_amt", ""));
		setTrspModCd(JSPUtil.getParameter(request, "trsp_mod_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setToYdCd(JSPUtil.getParameter(request, "to_yd_cd", ""));
		setVslLaneCd(JSPUtil.getParameter(request, "vsl_lane_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setPastRepoPlnFlg(JSPUtil.getParameter(request, "past_repo_pln_flg", ""));
		setCntrTpszCd(JSPUtil.getParameter(request, "cntr_tpsz_cd", ""));
		setTrnsRqstOfcCd(JSPUtil.getParameter(request, "trns_rqst_ofc_cd", ""));
		setTrspSoStsCd(JSPUtil.getParameter(request, "trsp_so_sts_cd", ""));
		setSoRqstDt(JSPUtil.getParameter(request, "so_rqst_dt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setTrnsRqstUsrId(JSPUtil.getParameter(request, "trns_rqst_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setWoExeFlg(JSPUtil.getParameter(request, "wo_exe_flg", ""));
		setCoCd(JSPUtil.getParameter(request, "co_cd", ""));
		setFmDt(JSPUtil.getParameter(request, "fm_dt", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, "skd_voy_no", ""));
		setPlnSeq(JSPUtil.getParameter(request, "pln_seq", ""));
		setSkdDirCd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
		setRepoPlnId(JSPUtil.getParameter(request, "repo_pln_id", ""));
		setToDt(JSPUtil.getParameter(request, "to_dt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setTrnsRqstRsn(JSPUtil.getParameter(request, "trns_rqst_rsn", ""));
		setRefSeq(JSPUtil.getParameter(request, "ref_seq", ""));
		setWoExeErrRmk(JSPUtil.getParameter(request, "wo_exe_err_rmk", ""));
		setCntrNo(JSPUtil.getParameter(request, "cntr_no", ""));
		setWoRqstFlg(JSPUtil.getParameter(request, "wo_rqst_flg", ""));
		setRepoPurpRmk(JSPUtil.getParameter(request, "repo_purp_rmk", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return EqrRepoExeSoIfVO[]
	 */
	public EqrRepoExeSoIfVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return EqrRepoExeSoIfVO[]
	 */
	public EqrRepoExeSoIfVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		EqrRepoExeSoIfVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] soIfDivCd = (JSPUtil.getParameter(request, prefix	+ "so_if_div_cd", length));
			String[] fmYdCd = (JSPUtil.getParameter(request, prefix	+ "fm_yd_cd", length));
			String[] woExeDt = (JSPUtil.getParameter(request, prefix	+ "wo_exe_dt", length));
			String[] eqCtrlOfcCd = (JSPUtil.getParameter(request, prefix	+ "eq_ctrl_ofc_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] refId = (JSPUtil.getParameter(request, prefix	+ "ref_id", length));
			String[] plnYrwk = (JSPUtil.getParameter(request, prefix	+ "pln_yrwk", length));
			String[] repoCostAmt = (JSPUtil.getParameter(request, prefix	+ "repo_cost_amt", length));
			String[] trspModCd = (JSPUtil.getParameter(request, prefix	+ "trsp_mod_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] toYdCd = (JSPUtil.getParameter(request, prefix	+ "to_yd_cd", length));
			String[] vslLaneCd = (JSPUtil.getParameter(request, prefix	+ "vsl_lane_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] pastRepoPlnFlg = (JSPUtil.getParameter(request, prefix	+ "past_repo_pln_flg", length));
			String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_cd", length));
			String[] trnsRqstOfcCd = (JSPUtil.getParameter(request, prefix	+ "trns_rqst_ofc_cd", length));
			String[] trspSoStsCd = (JSPUtil.getParameter(request, prefix	+ "trsp_so_sts_cd", length));
			String[] soRqstDt = (JSPUtil.getParameter(request, prefix	+ "so_rqst_dt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] trnsRqstUsrId = (JSPUtil.getParameter(request, prefix	+ "trns_rqst_usr_id", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] woExeFlg = (JSPUtil.getParameter(request, prefix	+ "wo_exe_flg", length));
			String[] coCd = (JSPUtil.getParameter(request, prefix	+ "co_cd", length));
			String[] fmDt = (JSPUtil.getParameter(request, prefix	+ "fm_dt", length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no", length));
			String[] plnSeq = (JSPUtil.getParameter(request, prefix	+ "pln_seq", length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd", length));
			String[] repoPlnId = (JSPUtil.getParameter(request, prefix	+ "repo_pln_id", length));
			String[] toDt = (JSPUtil.getParameter(request, prefix	+ "to_dt", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] trnsRqstRsn = (JSPUtil.getParameter(request, prefix	+ "trns_rqst_rsn", length));
			String[] refSeq = (JSPUtil.getParameter(request, prefix	+ "ref_seq", length));
			String[] woExeErrRmk = (JSPUtil.getParameter(request, prefix	+ "wo_exe_err_rmk", length));
			String[] cntrNo = (JSPUtil.getParameter(request, prefix	+ "cntr_no", length));
			String[] woRqstFlg = (JSPUtil.getParameter(request, prefix	+ "wo_rqst_flg", length));
			String[] repoPurpRmk = (JSPUtil.getParameter(request, prefix	+ "repo_purp_rmk", length));
			
			for (int i = 0; i < length; i++) {
				model = new EqrRepoExeSoIfVO();
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (soIfDivCd[i] != null)
					model.setSoIfDivCd(soIfDivCd[i]);
				if (fmYdCd[i] != null)
					model.setFmYdCd(fmYdCd[i]);
				if (woExeDt[i] != null)
					model.setWoExeDt(woExeDt[i]);
				if (eqCtrlOfcCd[i] != null)
					model.setEqCtrlOfcCd(eqCtrlOfcCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (refId[i] != null)
					model.setRefId(refId[i]);
				if (plnYrwk[i] != null)
					model.setPlnYrwk(plnYrwk[i]);
				if (repoCostAmt[i] != null)
					model.setRepoCostAmt(repoCostAmt[i]);
				if (trspModCd[i] != null)
					model.setTrspModCd(trspModCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (toYdCd[i] != null)
					model.setToYdCd(toYdCd[i]);
				if (vslLaneCd[i] != null)
					model.setVslLaneCd(vslLaneCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (pastRepoPlnFlg[i] != null)
					model.setPastRepoPlnFlg(pastRepoPlnFlg[i]);
				if (cntrTpszCd[i] != null)
					model.setCntrTpszCd(cntrTpszCd[i]);
				if (trnsRqstOfcCd[i] != null)
					model.setTrnsRqstOfcCd(trnsRqstOfcCd[i]);
				if (trspSoStsCd[i] != null)
					model.setTrspSoStsCd(trspSoStsCd[i]);
				if (soRqstDt[i] != null)
					model.setSoRqstDt(soRqstDt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (trnsRqstUsrId[i] != null)
					model.setTrnsRqstUsrId(trnsRqstUsrId[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (woExeFlg[i] != null)
					model.setWoExeFlg(woExeFlg[i]);
				if (coCd[i] != null)
					model.setCoCd(coCd[i]);
				if (fmDt[i] != null)
					model.setFmDt(fmDt[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (plnSeq[i] != null)
					model.setPlnSeq(plnSeq[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (repoPlnId[i] != null)
					model.setRepoPlnId(repoPlnId[i]);
				if (toDt[i] != null)
					model.setToDt(toDt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (trnsRqstRsn[i] != null)
					model.setTrnsRqstRsn(trnsRqstRsn[i]);
				if (refSeq[i] != null)
					model.setRefSeq(refSeq[i]);
				if (woExeErrRmk[i] != null)
					model.setWoExeErrRmk(woExeErrRmk[i]);
				if (cntrNo[i] != null)
					model.setCntrNo(cntrNo[i]);
				if (woRqstFlg[i] != null)
					model.setWoRqstFlg(woRqstFlg[i]);
				if (repoPurpRmk[i] != null)
					model.setRepoPurpRmk(repoPurpRmk[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getEqrRepoExeSoIfVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return EqrRepoExeSoIfVO[]
	 */
	public EqrRepoExeSoIfVO[] getEqrRepoExeSoIfVOs(){
		EqrRepoExeSoIfVO[] vos = (EqrRepoExeSoIfVO[])models.toArray(new EqrRepoExeSoIfVO[models.size()]);
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
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.soIfDivCd = this.soIfDivCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fmYdCd = this.fmYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.woExeDt = this.woExeDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqCtrlOfcCd = this.eqCtrlOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.refId = this.refId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.plnYrwk = this.plnYrwk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.repoCostAmt = this.repoCostAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspModCd = this.trspModCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.toYdCd = this.toYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslLaneCd = this.vslLaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pastRepoPlnFlg = this.pastRepoPlnFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszCd = this.cntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trnsRqstOfcCd = this.trnsRqstOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspSoStsCd = this.trspSoStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.soRqstDt = this.soRqstDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trnsRqstUsrId = this.trnsRqstUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.woExeFlg = this.woExeFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.coCd = this.coCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fmDt = this.fmDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.plnSeq = this.plnSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.repoPlnId = this.repoPlnId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.toDt = this.toDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trnsRqstRsn = this.trnsRqstRsn .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.refSeq = this.refSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.woExeErrRmk = this.woExeErrRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrNo = this.cntrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.woRqstFlg = this.woRqstFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.repoPurpRmk = this.repoPurpRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
