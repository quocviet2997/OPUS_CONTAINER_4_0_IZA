/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : LseAgreementVO.java
*@FileTitle : LseAgreementVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.29
*@LastModifier : 노정용
*@LastVersion : 1.0
* 2009.05.29 노정용 
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
 * @author 노정용
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class LseAgreementVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<LseAgreementVO> models = new ArrayList<LseAgreementVO>();
	
	/* Column Info */
	private String currCd = null;
	/* Column Info */
	private String lseVndrUrl = null;
	/* Column Info */
	private String dpcRto = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String agmtDt = null;
	/* Column Info */
	private String lseFreeDys = null;
	/* Column Info */
	private String lsePayTermDys = null;
	/* Column Info */
	private String lstEffDt = null;
	/* Column Info */
	private String wdpDys = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String wdpTpCd = null;
	/* Column Info */
	private String agmtLstVerSeq = null;
	/* Column Info */
	private String agmtCtyCd = null;
	/* Column Info */
	private String agmtRmk = null;
	/* Column Info */
	private String lstExpDt = null;
	/* Column Info */
	private String bldUpDt = null;
	/* Column Info */
	private String lstmCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String agmtSeq = null;
	/* Column Info */
	private String itchgFeeFlg = null;
	/* Column Info */
	private String cntrDpcLvlCd = null;
	/* Column Info */
	private String dirItchgFeeAmt = null;
	/* Column Info */
	private String ofcCd = null;
	/* Column Info */
	private String lftOnfChgCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String maxDpcRto = null;
	/* Column Info */
	private String vndrSeq = null;
	/* Column Info */
	private String pstWdpRtTpCd = null;
	/* Column Info */
	private String refNo = null;
	/* Column Info */
	private String dppTpCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public LseAgreementVO() {}

	public LseAgreementVO(String ibflag, String pagerows, String agmtCtyCd, String agmtSeq, String agmtLstVerSeq, String lstEffDt, String lstExpDt, String vndrSeq, String lseVndrUrl, String lstmCd, String ofcCd, String currCd, String refNo, String dpcRto, String maxDpcRto, String cntrDpcLvlCd, String pstWdpRtTpCd, String wdpDys, String wdpTpCd, String dppTpCd, String agmtDt, String agmtRmk, String bldUpDt, String lftOnfChgCd, String lsePayTermDys, String lseFreeDys, String itchgFeeFlg, String dirItchgFeeAmt, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.currCd = currCd;
		this.lseVndrUrl = lseVndrUrl;
		this.dpcRto = dpcRto;
		this.creDt = creDt;
		this.agmtDt = agmtDt;
		this.lseFreeDys = lseFreeDys;
		this.lsePayTermDys = lsePayTermDys;
		this.lstEffDt = lstEffDt;
		this.wdpDys = wdpDys;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.wdpTpCd = wdpTpCd;
		this.agmtLstVerSeq = agmtLstVerSeq;
		this.agmtCtyCd = agmtCtyCd;
		this.agmtRmk = agmtRmk;
		this.lstExpDt = lstExpDt;
		this.bldUpDt = bldUpDt;
		this.lstmCd = lstmCd;
		this.updUsrId = updUsrId;
		this.updDt = updDt;
		this.agmtSeq = agmtSeq;
		this.itchgFeeFlg = itchgFeeFlg;
		this.cntrDpcLvlCd = cntrDpcLvlCd;
		this.dirItchgFeeAmt = dirItchgFeeAmt;
		this.ofcCd = ofcCd;
		this.lftOnfChgCd = lftOnfChgCd;
		this.creUsrId = creUsrId;
		this.maxDpcRto = maxDpcRto;
		this.vndrSeq = vndrSeq;
		this.pstWdpRtTpCd = pstWdpRtTpCd;
		this.refNo = refNo;
		this.dppTpCd = dppTpCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("curr_cd", getCurrCd());
		this.hashColumns.put("lse_vndr_url", getLseVndrUrl());
		this.hashColumns.put("dpc_rto", getDpcRto());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("agmt_dt", getAgmtDt());
		this.hashColumns.put("lse_free_dys", getLseFreeDys());
		this.hashColumns.put("lse_pay_term_dys", getLsePayTermDys());
		this.hashColumns.put("lst_eff_dt", getLstEffDt());
		this.hashColumns.put("wdp_dys", getWdpDys());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("wdp_tp_cd", getWdpTpCd());
		this.hashColumns.put("agmt_lst_ver_seq", getAgmtLstVerSeq());
		this.hashColumns.put("agmt_cty_cd", getAgmtCtyCd());
		this.hashColumns.put("agmt_rmk", getAgmtRmk());
		this.hashColumns.put("lst_exp_dt", getLstExpDt());
		this.hashColumns.put("bld_up_dt", getBldUpDt());
		this.hashColumns.put("lstm_cd", getLstmCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("agmt_seq", getAgmtSeq());
		this.hashColumns.put("itchg_fee_flg", getItchgFeeFlg());
		this.hashColumns.put("cntr_dpc_lvl_cd", getCntrDpcLvlCd());
		this.hashColumns.put("dir_itchg_fee_amt", getDirItchgFeeAmt());
		this.hashColumns.put("ofc_cd", getOfcCd());
		this.hashColumns.put("lft_onf_chg_cd", getLftOnfChgCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("max_dpc_rto", getMaxDpcRto());
		this.hashColumns.put("vndr_seq", getVndrSeq());
		this.hashColumns.put("pst_wdp_rt_tp_cd", getPstWdpRtTpCd());
		this.hashColumns.put("ref_no", getRefNo());
		this.hashColumns.put("dpp_tp_cd", getDppTpCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("curr_cd", "currCd");
		this.hashFields.put("lse_vndr_url", "lseVndrUrl");
		this.hashFields.put("dpc_rto", "dpcRto");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("agmt_dt", "agmtDt");
		this.hashFields.put("lse_free_dys", "lseFreeDys");
		this.hashFields.put("lse_pay_term_dys", "lsePayTermDys");
		this.hashFields.put("lst_eff_dt", "lstEffDt");
		this.hashFields.put("wdp_dys", "wdpDys");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("wdp_tp_cd", "wdpTpCd");
		this.hashFields.put("agmt_lst_ver_seq", "agmtLstVerSeq");
		this.hashFields.put("agmt_cty_cd", "agmtCtyCd");
		this.hashFields.put("agmt_rmk", "agmtRmk");
		this.hashFields.put("lst_exp_dt", "lstExpDt");
		this.hashFields.put("bld_up_dt", "bldUpDt");
		this.hashFields.put("lstm_cd", "lstmCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("agmt_seq", "agmtSeq");
		this.hashFields.put("itchg_fee_flg", "itchgFeeFlg");
		this.hashFields.put("cntr_dpc_lvl_cd", "cntrDpcLvlCd");
		this.hashFields.put("dir_itchg_fee_amt", "dirItchgFeeAmt");
		this.hashFields.put("ofc_cd", "ofcCd");
		this.hashFields.put("lft_onf_chg_cd", "lftOnfChgCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("max_dpc_rto", "maxDpcRto");
		this.hashFields.put("vndr_seq", "vndrSeq");
		this.hashFields.put("pst_wdp_rt_tp_cd", "pstWdpRtTpCd");
		this.hashFields.put("ref_no", "refNo");
		this.hashFields.put("dpp_tp_cd", "dppTpCd");
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
	 * @return lseVndrUrl
	 */
	public String getLseVndrUrl() {
		return this.lseVndrUrl;
	}
	
	/**
	 * Column Info
	 * @return dpcRto
	 */
	public String getDpcRto() {
		return this.dpcRto;
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
	 * @return agmtDt
	 */
	public String getAgmtDt() {
		return this.agmtDt;
	}
	
	/**
	 * Column Info
	 * @return lseFreeDys
	 */
	public String getLseFreeDys() {
		return this.lseFreeDys;
	}
	
	/**
	 * Column Info
	 * @return lsePayTermDys
	 */
	public String getLsePayTermDys() {
		return this.lsePayTermDys;
	}
	
	/**
	 * Column Info
	 * @return lstEffDt
	 */
	public String getLstEffDt() {
		return this.lstEffDt;
	}
	
	/**
	 * Column Info
	 * @return wdpDys
	 */
	public String getWdpDys() {
		return this.wdpDys;
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
	 * @return wdpTpCd
	 */
	public String getWdpTpCd() {
		return this.wdpTpCd;
	}
	
	/**
	 * Column Info
	 * @return agmtLstVerSeq
	 */
	public String getAgmtLstVerSeq() {
		return this.agmtLstVerSeq;
	}
	
	/**
	 * Column Info
	 * @return agmtCtyCd
	 */
	public String getAgmtCtyCd() {
		return this.agmtCtyCd;
	}
	
	/**
	 * Column Info
	 * @return agmtRmk
	 */
	public String getAgmtRmk() {
		return this.agmtRmk;
	}
	
	/**
	 * Column Info
	 * @return lstExpDt
	 */
	public String getLstExpDt() {
		return this.lstExpDt;
	}
	
	/**
	 * Column Info
	 * @return bldUpDt
	 */
	public String getBldUpDt() {
		return this.bldUpDt;
	}
	
	/**
	 * Column Info
	 * @return lstmCd
	 */
	public String getLstmCd() {
		return this.lstmCd;
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
	 * @return agmtSeq
	 */
	public String getAgmtSeq() {
		return this.agmtSeq;
	}
	
	/**
	 * Column Info
	 * @return itchgFeeFlg
	 */
	public String getItchgFeeFlg() {
		return this.itchgFeeFlg;
	}
	
	/**
	 * Column Info
	 * @return cntrDpcLvlCd
	 */
	public String getCntrDpcLvlCd() {
		return this.cntrDpcLvlCd;
	}
	
	/**
	 * Column Info
	 * @return dirItchgFeeAmt
	 */
	public String getDirItchgFeeAmt() {
		return this.dirItchgFeeAmt;
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
	 * @return lftOnfChgCd
	 */
	public String getLftOnfChgCd() {
		return this.lftOnfChgCd;
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
	 * @return maxDpcRto
	 */
	public String getMaxDpcRto() {
		return this.maxDpcRto;
	}
	
	/**
	 * Column Info
	 * @return vndrSeq
	 */
	public String getVndrSeq() {
		return this.vndrSeq;
	}
	
	/**
	 * Column Info
	 * @return pstWdpRtTpCd
	 */
	public String getPstWdpRtTpCd() {
		return this.pstWdpRtTpCd;
	}
	
	/**
	 * Column Info
	 * @return refNo
	 */
	public String getRefNo() {
		return this.refNo;
	}
	
	/**
	 * Column Info
	 * @return dppTpCd
	 */
	public String getDppTpCd() {
		return this.dppTpCd;
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
	 * @param lseVndrUrl
	 */
	public void setLseVndrUrl(String lseVndrUrl) {
		this.lseVndrUrl = lseVndrUrl;
	}
	
	/**
	 * Column Info
	 * @param dpcRto
	 */
	public void setDpcRto(String dpcRto) {
		this.dpcRto = dpcRto;
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
	 * @param agmtDt
	 */
	public void setAgmtDt(String agmtDt) {
		this.agmtDt = agmtDt;
	}
	
	/**
	 * Column Info
	 * @param lseFreeDys
	 */
	public void setLseFreeDys(String lseFreeDys) {
		this.lseFreeDys = lseFreeDys;
	}
	
	/**
	 * Column Info
	 * @param lsePayTermDys
	 */
	public void setLsePayTermDys(String lsePayTermDys) {
		this.lsePayTermDys = lsePayTermDys;
	}
	
	/**
	 * Column Info
	 * @param lstEffDt
	 */
	public void setLstEffDt(String lstEffDt) {
		this.lstEffDt = lstEffDt;
	}
	
	/**
	 * Column Info
	 * @param wdpDys
	 */
	public void setWdpDys(String wdpDys) {
		this.wdpDys = wdpDys;
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
	 * @param wdpTpCd
	 */
	public void setWdpTpCd(String wdpTpCd) {
		this.wdpTpCd = wdpTpCd;
	}
	
	/**
	 * Column Info
	 * @param agmtLstVerSeq
	 */
	public void setAgmtLstVerSeq(String agmtLstVerSeq) {
		this.agmtLstVerSeq = agmtLstVerSeq;
	}
	
	/**
	 * Column Info
	 * @param agmtCtyCd
	 */
	public void setAgmtCtyCd(String agmtCtyCd) {
		this.agmtCtyCd = agmtCtyCd;
	}
	
	/**
	 * Column Info
	 * @param agmtRmk
	 */
	public void setAgmtRmk(String agmtRmk) {
		this.agmtRmk = agmtRmk;
	}
	
	/**
	 * Column Info
	 * @param lstExpDt
	 */
	public void setLstExpDt(String lstExpDt) {
		this.lstExpDt = lstExpDt;
	}
	
	/**
	 * Column Info
	 * @param bldUpDt
	 */
	public void setBldUpDt(String bldUpDt) {
		this.bldUpDt = bldUpDt;
	}
	
	/**
	 * Column Info
	 * @param lstmCd
	 */
	public void setLstmCd(String lstmCd) {
		this.lstmCd = lstmCd;
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
	 * @param agmtSeq
	 */
	public void setAgmtSeq(String agmtSeq) {
		this.agmtSeq = agmtSeq;
	}
	
	/**
	 * Column Info
	 * @param itchgFeeFlg
	 */
	public void setItchgFeeFlg(String itchgFeeFlg) {
		this.itchgFeeFlg = itchgFeeFlg;
	}
	
	/**
	 * Column Info
	 * @param cntrDpcLvlCd
	 */
	public void setCntrDpcLvlCd(String cntrDpcLvlCd) {
		this.cntrDpcLvlCd = cntrDpcLvlCd;
	}
	
	/**
	 * Column Info
	 * @param dirItchgFeeAmt
	 */
	public void setDirItchgFeeAmt(String dirItchgFeeAmt) {
		this.dirItchgFeeAmt = dirItchgFeeAmt;
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
	 * @param lftOnfChgCd
	 */
	public void setLftOnfChgCd(String lftOnfChgCd) {
		this.lftOnfChgCd = lftOnfChgCd;
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
	 * @param maxDpcRto
	 */
	public void setMaxDpcRto(String maxDpcRto) {
		this.maxDpcRto = maxDpcRto;
	}
	
	/**
	 * Column Info
	 * @param vndrSeq
	 */
	public void setVndrSeq(String vndrSeq) {
		this.vndrSeq = vndrSeq;
	}
	
	/**
	 * Column Info
	 * @param pstWdpRtTpCd
	 */
	public void setPstWdpRtTpCd(String pstWdpRtTpCd) {
		this.pstWdpRtTpCd = pstWdpRtTpCd;
	}
	
	/**
	 * Column Info
	 * @param refNo
	 */
	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}
	
	/**
	 * Column Info
	 * @param dppTpCd
	 */
	public void setDppTpCd(String dppTpCd) {
		this.dppTpCd = dppTpCd;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setCurrCd(JSPUtil.getParameter(request, "curr_cd", ""));
		setLseVndrUrl(JSPUtil.getParameter(request, "lse_vndr_url", ""));
		setDpcRto(JSPUtil.getParameter(request, "dpc_rto", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setAgmtDt(JSPUtil.getParameter(request, "agmt_dt", ""));
		setLseFreeDys(JSPUtil.getParameter(request, "lse_free_dys", ""));
		setLsePayTermDys(JSPUtil.getParameter(request, "lse_pay_term_dys", ""));
		setLstEffDt(JSPUtil.getParameter(request, "lst_eff_dt", ""));
		setWdpDys(JSPUtil.getParameter(request, "wdp_dys", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setWdpTpCd(JSPUtil.getParameter(request, "wdp_tp_cd", ""));
		setAgmtLstVerSeq(JSPUtil.getParameter(request, "agmt_lst_ver_seq", ""));
		setAgmtCtyCd(JSPUtil.getParameter(request, "agmt_cty_cd", ""));
		setAgmtRmk(JSPUtil.getParameter(request, "agmt_rmk", ""));
		setLstExpDt(JSPUtil.getParameter(request, "lst_exp_dt", ""));
		setBldUpDt(JSPUtil.getParameter(request, "bld_up_dt", ""));
		setLstmCd(JSPUtil.getParameter(request, "lstm_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setAgmtSeq(JSPUtil.getParameter(request, "agmt_seq", ""));
		setItchgFeeFlg(JSPUtil.getParameter(request, "itchg_fee_flg", ""));
		setCntrDpcLvlCd(JSPUtil.getParameter(request, "cntr_dpc_lvl_cd", ""));
		setDirItchgFeeAmt(JSPUtil.getParameter(request, "dir_itchg_fee_amt", ""));
		setOfcCd(JSPUtil.getParameter(request, "ofc_cd", ""));
		setLftOnfChgCd(JSPUtil.getParameter(request, "lft_onf_chg_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setMaxDpcRto(JSPUtil.getParameter(request, "max_dpc_rto", ""));
		setVndrSeq(JSPUtil.getParameter(request, "vndr_seq", ""));
		setPstWdpRtTpCd(JSPUtil.getParameter(request, "pst_wdp_rt_tp_cd", ""));
		setRefNo(JSPUtil.getParameter(request, "ref_no", ""));
		setDppTpCd(JSPUtil.getParameter(request, "dpp_tp_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return LseAgreementVO[]
	 */
	public LseAgreementVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return LseAgreementVO[]
	 */
	public LseAgreementVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		LseAgreementVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] currCd = (JSPUtil.getParameter(request, prefix	+ "curr_cd".trim(), length));
			String[] lseVndrUrl = (JSPUtil.getParameter(request, prefix	+ "lse_vndr_url".trim(), length));
			String[] dpcRto = (JSPUtil.getParameter(request, prefix	+ "dpc_rto".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] agmtDt = (JSPUtil.getParameter(request, prefix	+ "agmt_dt".trim(), length));
			String[] lseFreeDys = (JSPUtil.getParameter(request, prefix	+ "lse_free_dys".trim(), length));
			String[] lsePayTermDys = (JSPUtil.getParameter(request, prefix	+ "lse_pay_term_dys".trim(), length));
			String[] lstEffDt = (JSPUtil.getParameter(request, prefix	+ "lst_eff_dt".trim(), length));
			String[] wdpDys = (JSPUtil.getParameter(request, prefix	+ "wdp_dys".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] wdpTpCd = (JSPUtil.getParameter(request, prefix	+ "wdp_tp_cd".trim(), length));
			String[] agmtLstVerSeq = (JSPUtil.getParameter(request, prefix	+ "agmt_lst_ver_seq".trim(), length));
			String[] agmtCtyCd = (JSPUtil.getParameter(request, prefix	+ "agmt_cty_cd".trim(), length));
			String[] agmtRmk = (JSPUtil.getParameter(request, prefix	+ "agmt_rmk".trim(), length));
			String[] lstExpDt = (JSPUtil.getParameter(request, prefix	+ "lst_exp_dt".trim(), length));
			String[] bldUpDt = (JSPUtil.getParameter(request, prefix	+ "bld_up_dt".trim(), length));
			String[] lstmCd = (JSPUtil.getParameter(request, prefix	+ "lstm_cd".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] agmtSeq = (JSPUtil.getParameter(request, prefix	+ "agmt_seq".trim(), length));
			String[] itchgFeeFlg = (JSPUtil.getParameter(request, prefix	+ "itchg_fee_flg".trim(), length));
			String[] cntrDpcLvlCd = (JSPUtil.getParameter(request, prefix	+ "cntr_dpc_lvl_cd".trim(), length));
			String[] dirItchgFeeAmt = (JSPUtil.getParameter(request, prefix	+ "dir_itchg_fee_amt".trim(), length));
			String[] ofcCd = (JSPUtil.getParameter(request, prefix	+ "ofc_cd".trim(), length));
			String[] lftOnfChgCd = (JSPUtil.getParameter(request, prefix	+ "lft_onf_chg_cd".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] maxDpcRto = (JSPUtil.getParameter(request, prefix	+ "max_dpc_rto".trim(), length));
			String[] vndrSeq = (JSPUtil.getParameter(request, prefix	+ "vndr_seq".trim(), length));
			String[] pstWdpRtTpCd = (JSPUtil.getParameter(request, prefix	+ "pst_wdp_rt_tp_cd".trim(), length));
			String[] refNo = (JSPUtil.getParameter(request, prefix	+ "ref_no".trim(), length));
			String[] dppTpCd = (JSPUtil.getParameter(request, prefix	+ "dpp_tp_cd".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new LseAgreementVO();
				if (currCd[i] != null)
					model.setCurrCd(currCd[i]);
				if (lseVndrUrl[i] != null)
					model.setLseVndrUrl(lseVndrUrl[i]);
				if (dpcRto[i] != null)
					model.setDpcRto(dpcRto[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (agmtDt[i] != null)
					model.setAgmtDt(agmtDt[i]);
				if (lseFreeDys[i] != null)
					model.setLseFreeDys(lseFreeDys[i]);
				if (lsePayTermDys[i] != null)
					model.setLsePayTermDys(lsePayTermDys[i]);
				if (lstEffDt[i] != null)
					model.setLstEffDt(lstEffDt[i]);
				if (wdpDys[i] != null)
					model.setWdpDys(wdpDys[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (wdpTpCd[i] != null)
					model.setWdpTpCd(wdpTpCd[i]);
				if (agmtLstVerSeq[i] != null)
					model.setAgmtLstVerSeq(agmtLstVerSeq[i]);
				if (agmtCtyCd[i] != null)
					model.setAgmtCtyCd(agmtCtyCd[i]);
				if (agmtRmk[i] != null)
					model.setAgmtRmk(agmtRmk[i]);
				if (lstExpDt[i] != null)
					model.setLstExpDt(lstExpDt[i]);
				if (bldUpDt[i] != null)
					model.setBldUpDt(bldUpDt[i]);
				if (lstmCd[i] != null)
					model.setLstmCd(lstmCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (agmtSeq[i] != null)
					model.setAgmtSeq(agmtSeq[i]);
				if (itchgFeeFlg[i] != null)
					model.setItchgFeeFlg(itchgFeeFlg[i]);
				if (cntrDpcLvlCd[i] != null)
					model.setCntrDpcLvlCd(cntrDpcLvlCd[i]);
				if (dirItchgFeeAmt[i] != null)
					model.setDirItchgFeeAmt(dirItchgFeeAmt[i]);
				if (ofcCd[i] != null)
					model.setOfcCd(ofcCd[i]);
				if (lftOnfChgCd[i] != null)
					model.setLftOnfChgCd(lftOnfChgCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (maxDpcRto[i] != null)
					model.setMaxDpcRto(maxDpcRto[i]);
				if (vndrSeq[i] != null)
					model.setVndrSeq(vndrSeq[i]);
				if (pstWdpRtTpCd[i] != null)
					model.setPstWdpRtTpCd(pstWdpRtTpCd[i]);
				if (refNo[i] != null)
					model.setRefNo(refNo[i]);
				if (dppTpCd[i] != null)
					model.setDppTpCd(dppTpCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getLseAgreementVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return LseAgreementVO[]
	 */
	public LseAgreementVO[] getLseAgreementVOs(){
		LseAgreementVO[] vos = (LseAgreementVO[])models.toArray(new LseAgreementVO[models.size()]);
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
		this.currCd = this.currCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lseVndrUrl = this.lseVndrUrl .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dpcRto = this.dpcRto .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtDt = this.agmtDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lseFreeDys = this.lseFreeDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lsePayTermDys = this.lsePayTermDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lstEffDt = this.lstEffDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.wdpDys = this.wdpDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.wdpTpCd = this.wdpTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtLstVerSeq = this.agmtLstVerSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtCtyCd = this.agmtCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtRmk = this.agmtRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lstExpDt = this.lstExpDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bldUpDt = this.bldUpDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lstmCd = this.lstmCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtSeq = this.agmtSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.itchgFeeFlg = this.itchgFeeFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrDpcLvlCd = this.cntrDpcLvlCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dirItchgFeeAmt = this.dirItchgFeeAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcCd = this.ofcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lftOnfChgCd = this.lftOnfChgCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.maxDpcRto = this.maxDpcRto .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrSeq = this.vndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pstWdpRtTpCd = this.pstWdpRtTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.refNo = this.refNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dppTpCd = this.dppTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
