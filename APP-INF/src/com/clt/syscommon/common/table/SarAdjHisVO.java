/*=========================================================
*Copyright(c) 2015 CyberLogitec
*@FileName : SarAdjHisVO.java
*@FileTitle : SarAdjHisVO
*Open Issues :
*Change history :
*@LastModifyDate : 2015.05.13
*@LastModifier : 
*@LastVersion : 1.0
* 2015.05.13  
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

public class SarAdjHisVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SarAdjHisVO> models = new ArrayList<SarAdjHisVO>();
	
	/* Column Info */
	private String chgTpCd = null;
	/* Column Info */
	private String adjKeyNo = null;
	/* Column Info */
	private String creDt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String adjCdCmbSeq = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String adjHisSeq = null;
	/* Column Info */
	private String glTrnsSeq = null;
	/* Column Info */
	private String adjNo = null;
	/* Column Info */
	private String otsHisSeq = null;
	/* Column Info */
	private String adjTpCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String adjGlDt = null;
	/* Column Info */
	private String adjRmk = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String glCrsCurrAmt = null;
	/* Column Info */
	private String acctMtxSeq = null;
	/* Column Info */
	private String glTrnsDt = null;
	/* Column Info */
	private String adjCrsCurrAmt = null;
	/* Column Info */
	private String adjAmt = null;
	/* Column Info */
	private String adjStsCd = null;
	/* Column Info */
	private String orzSeq = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String adjCrsCurrCd = null;
	/* Column Info */
	private String adjOfcCd = null;
	/* Column Info */
	private String glCrsExRate = null;
	/* Column Info */
	private String adjAcctAmt = null;
	/* Column Info */
	private String apRmk = null;
	/* Column Info */
	private String acctgEvntSeq = null;
	/* Column Info */
	private String glCrsCurrCd = null;
	/* Column Info */
	private String adjAplyDt = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new LinkedHashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new LinkedHashMap<String, String>();
	
	public SarAdjHisVO() {}

	public SarAdjHisVO(String ibflag, String pagerows, String chgTpCd, String adjKeyNo, String creDt, String adjCdCmbSeq, String adjHisSeq, String glTrnsSeq, String adjNo, String adjTpCd, String otsHisSeq, String updUsrId, String adjGlDt, String adjRmk, String updDt, String acctMtxSeq, String glTrnsDt, String adjCrsCurrAmt, String adjAmt, String adjStsCd, String orzSeq, String creUsrId, String adjCrsCurrCd, String adjOfcCd, String adjAcctAmt, String apRmk, String acctgEvntSeq, String adjAplyDt, String glCrsCurrAmt, String glCrsCurrCd, String glCrsExRate) {
		this.chgTpCd = chgTpCd;
		this.adjKeyNo = adjKeyNo;
		this.creDt = creDt;
		this.pagerows = pagerows;
		this.adjCdCmbSeq = adjCdCmbSeq;
		this.ibflag = ibflag;
		this.adjHisSeq = adjHisSeq;
		this.glTrnsSeq = glTrnsSeq;
		this.adjNo = adjNo;
		this.otsHisSeq = otsHisSeq;
		this.adjTpCd = adjTpCd;
		this.updUsrId = updUsrId;
		this.adjGlDt = adjGlDt;
		this.adjRmk = adjRmk;
		this.updDt = updDt;
		this.glCrsCurrAmt = glCrsCurrAmt;
		this.acctMtxSeq = acctMtxSeq;
		this.glTrnsDt = glTrnsDt;
		this.adjCrsCurrAmt = adjCrsCurrAmt;
		this.adjAmt = adjAmt;
		this.adjStsCd = adjStsCd;
		this.orzSeq = orzSeq;
		this.creUsrId = creUsrId;
		this.adjCrsCurrCd = adjCrsCurrCd;
		this.adjOfcCd = adjOfcCd;
		this.glCrsExRate = glCrsExRate;
		this.adjAcctAmt = adjAcctAmt;
		this.apRmk = apRmk;
		this.acctgEvntSeq = acctgEvntSeq;
		this.glCrsCurrCd = glCrsCurrCd;
		this.adjAplyDt = adjAplyDt;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("chg_tp_cd", getChgTpCd());
		this.hashColumns.put("adj_key_no", getAdjKeyNo());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("adj_cd_cmb_seq", getAdjCdCmbSeq());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("adj_his_seq", getAdjHisSeq());
		this.hashColumns.put("gl_trns_seq", getGlTrnsSeq());
		this.hashColumns.put("adj_no", getAdjNo());
		this.hashColumns.put("ots_his_seq", getOtsHisSeq());
		this.hashColumns.put("adj_tp_cd", getAdjTpCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("adj_gl_dt", getAdjGlDt());
		this.hashColumns.put("adj_rmk", getAdjRmk());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("gl_crs_curr_amt", getGlCrsCurrAmt());
		this.hashColumns.put("acct_mtx_seq", getAcctMtxSeq());
		this.hashColumns.put("gl_trns_dt", getGlTrnsDt());
		this.hashColumns.put("adj_crs_curr_amt", getAdjCrsCurrAmt());
		this.hashColumns.put("adj_amt", getAdjAmt());
		this.hashColumns.put("adj_sts_cd", getAdjStsCd());
		this.hashColumns.put("orz_seq", getOrzSeq());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("adj_crs_curr_cd", getAdjCrsCurrCd());
		this.hashColumns.put("adj_ofc_cd", getAdjOfcCd());
		this.hashColumns.put("gl_crs_ex_rate", getGlCrsExRate());
		this.hashColumns.put("adj_acct_amt", getAdjAcctAmt());
		this.hashColumns.put("ap_rmk", getApRmk());
		this.hashColumns.put("acctg_evnt_seq", getAcctgEvntSeq());
		this.hashColumns.put("gl_crs_curr_cd", getGlCrsCurrCd());
		this.hashColumns.put("adj_aply_dt", getAdjAplyDt());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("chg_tp_cd", "chgTpCd");
		this.hashFields.put("adj_key_no", "adjKeyNo");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("adj_cd_cmb_seq", "adjCdCmbSeq");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("adj_his_seq", "adjHisSeq");
		this.hashFields.put("gl_trns_seq", "glTrnsSeq");
		this.hashFields.put("adj_no", "adjNo");
		this.hashFields.put("ots_his_seq", "otsHisSeq");
		this.hashFields.put("adj_tp_cd", "adjTpCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("adj_gl_dt", "adjGlDt");
		this.hashFields.put("adj_rmk", "adjRmk");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("gl_crs_curr_amt", "glCrsCurrAmt");
		this.hashFields.put("acct_mtx_seq", "acctMtxSeq");
		this.hashFields.put("gl_trns_dt", "glTrnsDt");
		this.hashFields.put("adj_crs_curr_amt", "adjCrsCurrAmt");
		this.hashFields.put("adj_amt", "adjAmt");
		this.hashFields.put("adj_sts_cd", "adjStsCd");
		this.hashFields.put("orz_seq", "orzSeq");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("adj_crs_curr_cd", "adjCrsCurrCd");
		this.hashFields.put("adj_ofc_cd", "adjOfcCd");
		this.hashFields.put("gl_crs_ex_rate", "glCrsExRate");
		this.hashFields.put("adj_acct_amt", "adjAcctAmt");
		this.hashFields.put("ap_rmk", "apRmk");
		this.hashFields.put("acctg_evnt_seq", "acctgEvntSeq");
		this.hashFields.put("gl_crs_curr_cd", "glCrsCurrCd");
		this.hashFields.put("adj_aply_dt", "adjAplyDt");
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
	 * @return adjKeyNo
	 */
	public String getAdjKeyNo() {
		return this.adjKeyNo;
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
	 * Column Info
	 * @return adjCdCmbSeq
	 */
	public String getAdjCdCmbSeq() {
		return this.adjCdCmbSeq;
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
	 * @return adjHisSeq
	 */
	public String getAdjHisSeq() {
		return this.adjHisSeq;
	}
	
	/**
	 * Column Info
	 * @return glTrnsSeq
	 */
	public String getGlTrnsSeq() {
		return this.glTrnsSeq;
	}
	
	/**
	 * Column Info
	 * @return adjNo
	 */
	public String getAdjNo() {
		return this.adjNo;
	}
	
	/**
	 * Column Info
	 * @return otsHisSeq
	 */
	public String getOtsHisSeq() {
		return this.otsHisSeq;
	}
	
	/**
	 * Column Info
	 * @return adjTpCd
	 */
	public String getAdjTpCd() {
		return this.adjTpCd;
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
	 * @return adjGlDt
	 */
	public String getAdjGlDt() {
		return this.adjGlDt;
	}
	
	/**
	 * Column Info
	 * @return adjRmk
	 */
	public String getAdjRmk() {
		return this.adjRmk;
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
	 * @return glCrsCurrAmt
	 */
	public String getGlCrsCurrAmt() {
		return this.glCrsCurrAmt;
	}
	
	/**
	 * Column Info
	 * @return acctMtxSeq
	 */
	public String getAcctMtxSeq() {
		return this.acctMtxSeq;
	}
	
	/**
	 * Column Info
	 * @return glTrnsDt
	 */
	public String getGlTrnsDt() {
		return this.glTrnsDt;
	}
	
	/**
	 * Column Info
	 * @return adjCrsCurrAmt
	 */
	public String getAdjCrsCurrAmt() {
		return this.adjCrsCurrAmt;
	}
	
	/**
	 * Column Info
	 * @return adjAmt
	 */
	public String getAdjAmt() {
		return this.adjAmt;
	}
	
	/**
	 * Column Info
	 * @return adjStsCd
	 */
	public String getAdjStsCd() {
		return this.adjStsCd;
	}
	
	/**
	 * Column Info
	 * @return orzSeq
	 */
	public String getOrzSeq() {
		return this.orzSeq;
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
	 * @return adjCrsCurrCd
	 */
	public String getAdjCrsCurrCd() {
		return this.adjCrsCurrCd;
	}
	
	/**
	 * Column Info
	 * @return adjOfcCd
	 */
	public String getAdjOfcCd() {
		return this.adjOfcCd;
	}
	
	/**
	 * Column Info
	 * @return glCrsExRate
	 */
	public String getGlCrsExRate() {
		return this.glCrsExRate;
	}
	
	/**
	 * Column Info
	 * @return adjAcctAmt
	 */
	public String getAdjAcctAmt() {
		return this.adjAcctAmt;
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
	 * @return acctgEvntSeq
	 */
	public String getAcctgEvntSeq() {
		return this.acctgEvntSeq;
	}
	
	/**
	 * Column Info
	 * @return glCrsCurrCd
	 */
	public String getGlCrsCurrCd() {
		return this.glCrsCurrCd;
	}
	
	/**
	 * Column Info
	 * @return adjAplyDt
	 */
	public String getAdjAplyDt() {
		return this.adjAplyDt;
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
	 * @param adjKeyNo
	 */
	public void setAdjKeyNo(String adjKeyNo) {
		this.adjKeyNo = adjKeyNo;
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
	 * Column Info
	 * @param adjCdCmbSeq
	 */
	public void setAdjCdCmbSeq(String adjCdCmbSeq) {
		this.adjCdCmbSeq = adjCdCmbSeq;
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
	 * @param adjHisSeq
	 */
	public void setAdjHisSeq(String adjHisSeq) {
		this.adjHisSeq = adjHisSeq;
	}
	
	/**
	 * Column Info
	 * @param glTrnsSeq
	 */
	public void setGlTrnsSeq(String glTrnsSeq) {
		this.glTrnsSeq = glTrnsSeq;
	}
	
	/**
	 * Column Info
	 * @param adjNo
	 */
	public void setAdjNo(String adjNo) {
		this.adjNo = adjNo;
	}
	
	/**
	 * Column Info
	 * @param otsHisSeq
	 */
	public void setOtsHisSeq(String otsHisSeq) {
		this.otsHisSeq = otsHisSeq;
	}
	
	/**
	 * Column Info
	 * @param adjTpCd
	 */
	public void setAdjTpCd(String adjTpCd) {
		this.adjTpCd = adjTpCd;
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
	 * @param adjGlDt
	 */
	public void setAdjGlDt(String adjGlDt) {
		this.adjGlDt = adjGlDt;
	}
	
	/**
	 * Column Info
	 * @param adjRmk
	 */
	public void setAdjRmk(String adjRmk) {
		this.adjRmk = adjRmk;
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
	 * @param glCrsCurrAmt
	 */
	public void setGlCrsCurrAmt(String glCrsCurrAmt) {
		this.glCrsCurrAmt = glCrsCurrAmt;
	}
	
	/**
	 * Column Info
	 * @param acctMtxSeq
	 */
	public void setAcctMtxSeq(String acctMtxSeq) {
		this.acctMtxSeq = acctMtxSeq;
	}
	
	/**
	 * Column Info
	 * @param glTrnsDt
	 */
	public void setGlTrnsDt(String glTrnsDt) {
		this.glTrnsDt = glTrnsDt;
	}
	
	/**
	 * Column Info
	 * @param adjCrsCurrAmt
	 */
	public void setAdjCrsCurrAmt(String adjCrsCurrAmt) {
		this.adjCrsCurrAmt = adjCrsCurrAmt;
	}
	
	/**
	 * Column Info
	 * @param adjAmt
	 */
	public void setAdjAmt(String adjAmt) {
		this.adjAmt = adjAmt;
	}
	
	/**
	 * Column Info
	 * @param adjStsCd
	 */
	public void setAdjStsCd(String adjStsCd) {
		this.adjStsCd = adjStsCd;
	}
	
	/**
	 * Column Info
	 * @param orzSeq
	 */
	public void setOrzSeq(String orzSeq) {
		this.orzSeq = orzSeq;
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
	 * @param adjCrsCurrCd
	 */
	public void setAdjCrsCurrCd(String adjCrsCurrCd) {
		this.adjCrsCurrCd = adjCrsCurrCd;
	}
	
	/**
	 * Column Info
	 * @param adjOfcCd
	 */
	public void setAdjOfcCd(String adjOfcCd) {
		this.adjOfcCd = adjOfcCd;
	}
	
	/**
	 * Column Info
	 * @param glCrsExRate
	 */
	public void setGlCrsExRate(String glCrsExRate) {
		this.glCrsExRate = glCrsExRate;
	}
	
	/**
	 * Column Info
	 * @param adjAcctAmt
	 */
	public void setAdjAcctAmt(String adjAcctAmt) {
		this.adjAcctAmt = adjAcctAmt;
	}
	
	/**
	 * Column Info
	 * @param apRmk
	 */
	public void setApRmk(String apRmk) {
		this.apRmk = apRmk;
	}
	
	/**
	 * Column Info
	 * @param acctgEvntSeq
	 */
	public void setAcctgEvntSeq(String acctgEvntSeq) {
		this.acctgEvntSeq = acctgEvntSeq;
	}
	
	/**
	 * Column Info
	 * @param glCrsCurrCd
	 */
	public void setGlCrsCurrCd(String glCrsCurrCd) {
		this.glCrsCurrCd = glCrsCurrCd;
	}
	
	/**
	 * Column Info
	 * @param adjAplyDt
	 */
	public void setAdjAplyDt(String adjAplyDt) {
		this.adjAplyDt = adjAplyDt;
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
		setAdjKeyNo(JSPUtil.getParameter(request, prefix + "adj_key_no", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setAdjCdCmbSeq(JSPUtil.getParameter(request, prefix + "adj_cd_cmb_seq", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setAdjHisSeq(JSPUtil.getParameter(request, prefix + "adj_his_seq", ""));
		setGlTrnsSeq(JSPUtil.getParameter(request, prefix + "gl_trns_seq", ""));
		setAdjNo(JSPUtil.getParameter(request, prefix + "adj_no", ""));
		setOtsHisSeq(JSPUtil.getParameter(request, prefix + "ots_his_seq", ""));
		setAdjTpCd(JSPUtil.getParameter(request, prefix + "adj_tp_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setAdjGlDt(JSPUtil.getParameter(request, prefix + "adj_gl_dt", ""));
		setAdjRmk(JSPUtil.getParameter(request, prefix + "adj_rmk", ""));
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setGlCrsCurrAmt(JSPUtil.getParameter(request, prefix + "gl_crs_curr_amt", ""));
		setAcctMtxSeq(JSPUtil.getParameter(request, prefix + "acct_mtx_seq", ""));
		setGlTrnsDt(JSPUtil.getParameter(request, prefix + "gl_trns_dt", ""));
		setAdjCrsCurrAmt(JSPUtil.getParameter(request, prefix + "adj_crs_curr_amt", ""));
		setAdjAmt(JSPUtil.getParameter(request, prefix + "adj_amt", ""));
		setAdjStsCd(JSPUtil.getParameter(request, prefix + "adj_sts_cd", ""));
		setOrzSeq(JSPUtil.getParameter(request, prefix + "orz_seq", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setAdjCrsCurrCd(JSPUtil.getParameter(request, prefix + "adj_crs_curr_cd", ""));
		setAdjOfcCd(JSPUtil.getParameter(request, prefix + "adj_ofc_cd", ""));
		setGlCrsExRate(JSPUtil.getParameter(request, prefix + "gl_crs_ex_rate", ""));
		setAdjAcctAmt(JSPUtil.getParameter(request, prefix + "adj_acct_amt", ""));
		setApRmk(JSPUtil.getParameter(request, prefix + "ap_rmk", ""));
		setAcctgEvntSeq(JSPUtil.getParameter(request, prefix + "acctg_evnt_seq", ""));
		setGlCrsCurrCd(JSPUtil.getParameter(request, prefix + "gl_crs_curr_cd", ""));
		setAdjAplyDt(JSPUtil.getParameter(request, prefix + "adj_aply_dt", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return SarAdjHisVO[]
	 */
	public SarAdjHisVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SarAdjHisVO[]
	 */
	public SarAdjHisVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SarAdjHisVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] chgTpCd = (JSPUtil.getParameter(request, prefix	+ "chg_tp_cd", length));
			String[] adjKeyNo = (JSPUtil.getParameter(request, prefix	+ "adj_key_no", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] adjCdCmbSeq = (JSPUtil.getParameter(request, prefix	+ "adj_cd_cmb_seq", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] adjHisSeq = (JSPUtil.getParameter(request, prefix	+ "adj_his_seq", length));
			String[] glTrnsSeq = (JSPUtil.getParameter(request, prefix	+ "gl_trns_seq", length));
			String[] adjNo = (JSPUtil.getParameter(request, prefix	+ "adj_no", length));
			String[] otsHisSeq = (JSPUtil.getParameter(request, prefix	+ "ots_his_seq", length));
			String[] adjTpCd = (JSPUtil.getParameter(request, prefix	+ "adj_tp_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] adjGlDt = (JSPUtil.getParameter(request, prefix	+ "adj_gl_dt", length));
			String[] adjRmk = (JSPUtil.getParameter(request, prefix	+ "adj_rmk", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] glCrsCurrAmt = (JSPUtil.getParameter(request, prefix	+ "gl_crs_curr_amt", length));
			String[] acctMtxSeq = (JSPUtil.getParameter(request, prefix	+ "acct_mtx_seq", length));
			String[] glTrnsDt = (JSPUtil.getParameter(request, prefix	+ "gl_trns_dt", length));
			String[] adjCrsCurrAmt = (JSPUtil.getParameter(request, prefix	+ "adj_crs_curr_amt", length));
			String[] adjAmt = (JSPUtil.getParameter(request, prefix	+ "adj_amt", length));
			String[] adjStsCd = (JSPUtil.getParameter(request, prefix	+ "adj_sts_cd", length));
			String[] orzSeq = (JSPUtil.getParameter(request, prefix	+ "orz_seq", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] adjCrsCurrCd = (JSPUtil.getParameter(request, prefix	+ "adj_crs_curr_cd", length));
			String[] adjOfcCd = (JSPUtil.getParameter(request, prefix	+ "adj_ofc_cd", length));
			String[] glCrsExRate = (JSPUtil.getParameter(request, prefix	+ "gl_crs_ex_rate", length));
			String[] adjAcctAmt = (JSPUtil.getParameter(request, prefix	+ "adj_acct_amt", length));
			String[] apRmk = (JSPUtil.getParameter(request, prefix	+ "ap_rmk", length));
			String[] acctgEvntSeq = (JSPUtil.getParameter(request, prefix	+ "acctg_evnt_seq", length));
			String[] glCrsCurrCd = (JSPUtil.getParameter(request, prefix	+ "gl_crs_curr_cd", length));
			String[] adjAplyDt = (JSPUtil.getParameter(request, prefix	+ "adj_aply_dt", length));
			
			for (int i = 0; i < length; i++) {
				model = new SarAdjHisVO();
				if (chgTpCd[i] != null)
					model.setChgTpCd(chgTpCd[i]);
				if (adjKeyNo[i] != null)
					model.setAdjKeyNo(adjKeyNo[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (adjCdCmbSeq[i] != null)
					model.setAdjCdCmbSeq(adjCdCmbSeq[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (adjHisSeq[i] != null)
					model.setAdjHisSeq(adjHisSeq[i]);
				if (glTrnsSeq[i] != null)
					model.setGlTrnsSeq(glTrnsSeq[i]);
				if (adjNo[i] != null)
					model.setAdjNo(adjNo[i]);
				if (otsHisSeq[i] != null)
					model.setOtsHisSeq(otsHisSeq[i]);
				if (adjTpCd[i] != null)
					model.setAdjTpCd(adjTpCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (adjGlDt[i] != null)
					model.setAdjGlDt(adjGlDt[i]);
				if (adjRmk[i] != null)
					model.setAdjRmk(adjRmk[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (glCrsCurrAmt[i] != null)
					model.setGlCrsCurrAmt(glCrsCurrAmt[i]);
				if (acctMtxSeq[i] != null)
					model.setAcctMtxSeq(acctMtxSeq[i]);
				if (glTrnsDt[i] != null)
					model.setGlTrnsDt(glTrnsDt[i]);
				if (adjCrsCurrAmt[i] != null)
					model.setAdjCrsCurrAmt(adjCrsCurrAmt[i]);
				if (adjAmt[i] != null)
					model.setAdjAmt(adjAmt[i]);
				if (adjStsCd[i] != null)
					model.setAdjStsCd(adjStsCd[i]);
				if (orzSeq[i] != null)
					model.setOrzSeq(orzSeq[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (adjCrsCurrCd[i] != null)
					model.setAdjCrsCurrCd(adjCrsCurrCd[i]);
				if (adjOfcCd[i] != null)
					model.setAdjOfcCd(adjOfcCd[i]);
				if (glCrsExRate[i] != null)
					model.setGlCrsExRate(glCrsExRate[i]);
				if (adjAcctAmt[i] != null)
					model.setAdjAcctAmt(adjAcctAmt[i]);
				if (apRmk[i] != null)
					model.setApRmk(apRmk[i]);
				if (acctgEvntSeq[i] != null)
					model.setAcctgEvntSeq(acctgEvntSeq[i]);
				if (glCrsCurrCd[i] != null)
					model.setGlCrsCurrCd(glCrsCurrCd[i]);
				if (adjAplyDt[i] != null)
					model.setAdjAplyDt(adjAplyDt[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSarAdjHisVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return SarAdjHisVO[]
	 */
	public SarAdjHisVO[] getSarAdjHisVOs(){
		SarAdjHisVO[] vos = (SarAdjHisVO[])models.toArray(new SarAdjHisVO[models.size()]);
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
		this.adjKeyNo = this.adjKeyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.adjCdCmbSeq = this.adjCdCmbSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.adjHisSeq = this.adjHisSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.glTrnsSeq = this.glTrnsSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.adjNo = this.adjNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.otsHisSeq = this.otsHisSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.adjTpCd = this.adjTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.adjGlDt = this.adjGlDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.adjRmk = this.adjRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.glCrsCurrAmt = this.glCrsCurrAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acctMtxSeq = this.acctMtxSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.glTrnsDt = this.glTrnsDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.adjCrsCurrAmt = this.adjCrsCurrAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.adjAmt = this.adjAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.adjStsCd = this.adjStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orzSeq = this.orzSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.adjCrsCurrCd = this.adjCrsCurrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.adjOfcCd = this.adjOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.glCrsExRate = this.glCrsExRate .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.adjAcctAmt = this.adjAcctAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.apRmk = this.apRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acctgEvntSeq = this.acctgEvntSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.glCrsCurrCd = this.glCrsCurrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.adjAplyDt = this.adjAplyDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
