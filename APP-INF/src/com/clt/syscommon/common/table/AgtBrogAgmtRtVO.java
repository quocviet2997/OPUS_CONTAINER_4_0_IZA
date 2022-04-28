/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : AgtBrogAgmtRtVO.java
*@FileTitle : AgtBrogAgmtRtVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.08.31
*@LastModifier : 추경원
*@LastVersion : 1.0
* 2009.08.31 추경원 
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
 * @author 추경원
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class AgtBrogAgmtRtVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<AgtBrogAgmtRtVO> models = new ArrayList<AgtBrogAgmtRtVO>();
	
	/* Column Info */
	private String porGrpTpCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String brogTeuRt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String brogTpCd = null;
	/* Column Info */
	private String podRoutCd = null;
	/* Column Info */
	private String rfaNo = null;
	/* Column Info */
	private String brogDivCd = null;
	/* Column Info */
	private String brogHusBroNo = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String cmdtCd = null;
	/* Column Info */
	private String brogCntCustSeq = null;
	/* Column Info */
	private String scNo = null;
	/* Column Info */
	private String fmEffDt = null;
	/* Column Info */
	private String porRoutCd = null;
	/* Column Info */
	private String brogCntCd = null;
	/* Column Info */
	private String shprCntNm = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String polRoutCd = null;
	/* Column Info */
	private String brogRfRt = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String polGrpTpCd = null;
	/* Column Info */
	private String brogFeuRt = null;
	/* Column Info */
	private String bkgBrogRt = null;
	/* Column Info */
	private String shprCntCd = null;
	/* Column Info */
	private String brogCntCustNm = null;
	/* Column Info */
	private String brogChgCtnt = null;
	/* Column Info */
	private String toEffDt = null;
	/* Column Info */
	private String cmdtNm = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String brogBxRt = null;
	/* Column Info */
	private String cmdtTpCd = null;
	/* Column Info */
	private String brogCustSeq = null;
	/* Column Info */
	private String shprSeq = null;
	/* Column Info */
	private String interMdalFlg = null;
	/* Column Info */
	private String brogKndCd = null;
	/* Column Info */
	private String podGrpTpCd = null;
	/* Column Info */
	private String brogRtSeq = null;
	/* Column Info */
	private String shprCntSeq = null;

	/* Column Info */
	private String searchBrogCntCustSeq = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public AgtBrogAgmtRtVO() {}

	public AgtBrogAgmtRtVO(String ibflag, String pagerows, String brogCntCd, String brogCustSeq, String brogRtSeq, String shprCntCd, String shprSeq, String porGrpTpCd, String porRoutCd, String polGrpTpCd, String polRoutCd, String podGrpTpCd, String podRoutCd, String fmEffDt, String toEffDt, String scNo, String rfaNo, String cmdtTpCd, String cmdtCd, String cmdtNm, String brogCntCustSeq, String brogCntCustNm, String shprCntSeq, String shprCntNm, String brogDivCd, String brogTpCd, String bkgBrogRt, String brogChgCtnt, String brogBxRt, String brogTeuRt, String brogFeuRt, String brogRfRt, String brogKndCd, String brogHusBroNo, String interMdalFlg, String creUsrId, String creDt, String updUsrId, String updDt, String searchBrogCustSeq) {
		this.porGrpTpCd = porGrpTpCd;
		this.creDt = creDt;
		this.brogTeuRt = brogTeuRt;
		this.pagerows = pagerows;
		this.brogTpCd = brogTpCd;
		this.podRoutCd = podRoutCd;
		this.rfaNo = rfaNo;
		this.brogDivCd = brogDivCd;
		this.brogHusBroNo = brogHusBroNo;
		this.ibflag = ibflag;
		this.cmdtCd = cmdtCd;
		this.brogCntCustSeq = brogCntCustSeq;
		this.scNo = scNo;
		this.fmEffDt = fmEffDt;
		this.porRoutCd = porRoutCd;
		this.brogCntCd = brogCntCd;
		this.shprCntNm = shprCntNm;
		this.updUsrId = updUsrId;
		this.polRoutCd = polRoutCd;
		this.brogRfRt = brogRfRt;
		this.updDt = updDt;
		this.polGrpTpCd = polGrpTpCd;
		this.brogFeuRt = brogFeuRt;
		this.bkgBrogRt = bkgBrogRt;
		this.shprCntCd = shprCntCd;
		this.brogCntCustNm = brogCntCustNm;
		this.brogChgCtnt = brogChgCtnt;
		this.toEffDt = toEffDt;
		this.cmdtNm = cmdtNm;
		this.creUsrId = creUsrId;
		this.brogBxRt = brogBxRt;
		this.cmdtTpCd = cmdtTpCd;
		this.brogCustSeq = brogCustSeq;
		this.shprSeq = shprSeq;
		this.interMdalFlg = interMdalFlg;
		this.brogKndCd = brogKndCd;
		this.podGrpTpCd = podGrpTpCd;
		this.brogRtSeq = brogRtSeq;
		this.shprCntSeq = shprCntSeq;
		this.searchBrogCntCustSeq = searchBrogCntCustSeq;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("por_grp_tp_cd", getPorGrpTpCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("brog_teu_rt", getBrogTeuRt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("brog_tp_cd", getBrogTpCd());
		this.hashColumns.put("pod_rout_cd", getPodRoutCd());
		this.hashColumns.put("rfa_no", getRfaNo());
		this.hashColumns.put("brog_div_cd", getBrogDivCd());
		this.hashColumns.put("brog_hus_bro_no", getBrogHusBroNo());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cmdt_cd", getCmdtCd());
		this.hashColumns.put("brog_cnt_cust_seq", getBrogCntCustSeq());
		this.hashColumns.put("sc_no", getScNo());
		this.hashColumns.put("fm_eff_dt", getFmEffDt());
		this.hashColumns.put("por_rout_cd", getPorRoutCd());
		this.hashColumns.put("brog_cnt_cd", getBrogCntCd());
		this.hashColumns.put("shpr_cnt_nm", getShprCntNm());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("pol_rout_cd", getPolRoutCd());
		this.hashColumns.put("brog_rf_rt", getBrogRfRt());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("pol_grp_tp_cd", getPolGrpTpCd());
		this.hashColumns.put("brog_feu_rt", getBrogFeuRt());
		this.hashColumns.put("bkg_brog_rt", getBkgBrogRt());
		this.hashColumns.put("shpr_cnt_cd", getShprCntCd());
		this.hashColumns.put("brog_cnt_cust_nm", getBrogCntCustNm());
		this.hashColumns.put("brog_chg_ctnt", getBrogChgCtnt());
		this.hashColumns.put("to_eff_dt", getToEffDt());
		this.hashColumns.put("cmdt_nm", getCmdtNm());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("brog_bx_rt", getBrogBxRt());
		this.hashColumns.put("cmdt_tp_cd", getCmdtTpCd());
		this.hashColumns.put("brog_cust_seq", getBrogCustSeq());
		this.hashColumns.put("shpr_seq", getShprSeq());
		this.hashColumns.put("inter_mdal_flg", getInterMdalFlg());
		this.hashColumns.put("brog_knd_cd", getBrogKndCd());
		this.hashColumns.put("pod_grp_tp_cd", getPodGrpTpCd());
		this.hashColumns.put("brog_rt_seq", getBrogRtSeq());
		this.hashColumns.put("shpr_cnt_seq", getShprCntSeq());
		this.hashColumns.put("search_brog_cnt_cust_seq", getSearchBrogCntCustSeq());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("por_grp_tp_cd", "porGrpTpCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("brog_teu_rt", "brogTeuRt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("brog_tp_cd", "brogTpCd");
		this.hashFields.put("pod_rout_cd", "podRoutCd");
		this.hashFields.put("rfa_no", "rfaNo");
		this.hashFields.put("brog_div_cd", "brogDivCd");
		this.hashFields.put("brog_hus_bro_no", "brogHusBroNo");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cmdt_cd", "cmdtCd");
		this.hashFields.put("brog_cnt_cust_seq", "brogCntCustSeq");
		this.hashFields.put("sc_no", "scNo");
		this.hashFields.put("fm_eff_dt", "fmEffDt");
		this.hashFields.put("por_rout_cd", "porRoutCd");
		this.hashFields.put("brog_cnt_cd", "brogCntCd");
		this.hashFields.put("shpr_cnt_nm", "shprCntNm");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("pol_rout_cd", "polRoutCd");
		this.hashFields.put("brog_rf_rt", "brogRfRt");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("pol_grp_tp_cd", "polGrpTpCd");
		this.hashFields.put("brog_feu_rt", "brogFeuRt");
		this.hashFields.put("bkg_brog_rt", "bkgBrogRt");
		this.hashFields.put("shpr_cnt_cd", "shprCntCd");
		this.hashFields.put("brog_cnt_cust_nm", "brogCntCustNm");
		this.hashFields.put("brog_chg_ctnt", "brogChgCtnt");
		this.hashFields.put("to_eff_dt", "toEffDt");
		this.hashFields.put("cmdt_nm", "cmdtNm");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("brog_bx_rt", "brogBxRt");
		this.hashFields.put("cmdt_tp_cd", "cmdtTpCd");
		this.hashFields.put("brog_cust_seq", "brogCustSeq");
		this.hashFields.put("shpr_seq", "shprSeq");
		this.hashFields.put("inter_mdal_flg", "interMdalFlg");
		this.hashFields.put("brog_knd_cd", "brogKndCd");
		this.hashFields.put("pod_grp_tp_cd", "podGrpTpCd");
		this.hashFields.put("brog_rt_seq", "brogRtSeq");
		this.hashFields.put("shpr_cnt_seq", "shprCntSeq");
		this.hashFields.put("search_brog_cnt_cust_seq", "searchBrogCntCustSeq");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return porGrpTpCd
	 */
	public String getPorGrpTpCd() {
		return this.porGrpTpCd;
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
	 * @return brogTeuRt
	 */
	public String getBrogTeuRt() {
		return this.brogTeuRt;
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
	 * @return brogTpCd
	 */
	public String getBrogTpCd() {
		return this.brogTpCd;
	}
	
	/**
	 * Column Info
	 * @return podRoutCd
	 */
	public String getPodRoutCd() {
		return this.podRoutCd;
	}
	
	/**
	 * Column Info
	 * @return rfaNo
	 */
	public String getRfaNo() {
		return this.rfaNo;
	}
	
	/**
	 * Column Info
	 * @return brogDivCd
	 */
	public String getBrogDivCd() {
		return this.brogDivCd;
	}
	
	/**
	 * Column Info
	 * @return brogHusBroNo
	 */
	public String getBrogHusBroNo() {
		return this.brogHusBroNo;
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
	 * @return cmdtCd
	 */
	public String getCmdtCd() {
		return this.cmdtCd;
	}
	
	/**
	 * Column Info
	 * @return brogCntCustSeq
	 */
	public String getBrogCntCustSeq() {
		return this.brogCntCustSeq;
	}
	
	/**
	 * Column Info
	 * @return scNo
	 */
	public String getScNo() {
		return this.scNo;
	}
	
	/**
	 * Column Info
	 * @return fmEffDt
	 */
	public String getFmEffDt() {
		return this.fmEffDt;
	}
	
	/**
	 * Column Info
	 * @return porRoutCd
	 */
	public String getPorRoutCd() {
		return this.porRoutCd;
	}
	
	/**
	 * Column Info
	 * @return brogCntCd
	 */
	public String getBrogCntCd() {
		return this.brogCntCd;
	}
	
	/**
	 * Column Info
	 * @return shprCntNm
	 */
	public String getShprCntNm() {
		return this.shprCntNm;
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
	 * @return polRoutCd
	 */
	public String getPolRoutCd() {
		return this.polRoutCd;
	}
	
	/**
	 * Column Info
	 * @return brogRfRt
	 */
	public String getBrogRfRt() {
		return this.brogRfRt;
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
	 * @return polGrpTpCd
	 */
	public String getPolGrpTpCd() {
		return this.polGrpTpCd;
	}
	
	/**
	 * Column Info
	 * @return brogFeuRt
	 */
	public String getBrogFeuRt() {
		return this.brogFeuRt;
	}
	
	/**
	 * Column Info
	 * @return bkgBrogRt
	 */
	public String getBkgBrogRt() {
		return this.bkgBrogRt;
	}
	
	/**
	 * Column Info
	 * @return shprCntCd
	 */
	public String getShprCntCd() {
		return this.shprCntCd;
	}
	
	/**
	 * Column Info
	 * @return brogCntCustNm
	 */
	public String getBrogCntCustNm() {
		return this.brogCntCustNm;
	}
	
	/**
	 * Column Info
	 * @return brogChgCtnt
	 */
	public String getBrogChgCtnt() {
		return this.brogChgCtnt;
	}
	
	/**
	 * Column Info
	 * @return toEffDt
	 */
	public String getToEffDt() {
		return this.toEffDt;
	}
	
	/**
	 * Column Info
	 * @return cmdtNm
	 */
	public String getCmdtNm() {
		return this.cmdtNm;
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
	 * @return brogBxRt
	 */
	public String getBrogBxRt() {
		return this.brogBxRt;
	}
	
	/**
	 * Column Info
	 * @return cmdtTpCd
	 */
	public String getCmdtTpCd() {
		return this.cmdtTpCd;
	}
	
	/**
	 * Column Info
	 * @return brogCustSeq
	 */
	public String getBrogCustSeq() {
		return this.brogCustSeq;
	}
	
	/**
	 * Column Info
	 * @return shprSeq
	 */
	public String getShprSeq() {
		return this.shprSeq;
	}
	
	/**
	 * Column Info
	 * @return interMdalFlg
	 */
	public String getInterMdalFlg() {
		return this.interMdalFlg;
	}
	
	/**
	 * Column Info
	 * @return brogKndCd
	 */
	public String getBrogKndCd() {
		return this.brogKndCd;
	}
	
	/**
	 * Column Info
	 * @return podGrpTpCd
	 */
	public String getPodGrpTpCd() {
		return this.podGrpTpCd;
	}
	
	/**
	 * Column Info
	 * @return brogRtSeq
	 */
	public String getBrogRtSeq() {
		return this.brogRtSeq;
	}
	
	/**
	 * Column Info
	 * @return shprCntSeq
	 */
	public String getShprCntSeq() {
		return this.shprCntSeq;
	}
	
	/**
	 * Column Info
	 * @return searchBrogCntCustSeq
	 */
	public String getSearchBrogCntCustSeq() {
		return this.searchBrogCntCustSeq;
	}
	
	

	/**
	 * Column Info
	 * @param porGrpTpCd
	 */
	public void setPorGrpTpCd(String porGrpTpCd) {
		this.porGrpTpCd = porGrpTpCd;
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
	 * @param brogTeuRt
	 */
	public void setBrogTeuRt(String brogTeuRt) {
		this.brogTeuRt = brogTeuRt;
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
	 * @param brogTpCd
	 */
	public void setBrogTpCd(String brogTpCd) {
		this.brogTpCd = brogTpCd;
	}
	
	/**
	 * Column Info
	 * @param podRoutCd
	 */
	public void setPodRoutCd(String podRoutCd) {
		this.podRoutCd = podRoutCd;
	}
	
	/**
	 * Column Info
	 * @param rfaNo
	 */
	public void setRfaNo(String rfaNo) {
		this.rfaNo = rfaNo;
	}
	
	/**
	 * Column Info
	 * @param brogDivCd
	 */
	public void setBrogDivCd(String brogDivCd) {
		this.brogDivCd = brogDivCd;
	}
	
	/**
	 * Column Info
	 * @param brogHusBroNo
	 */
	public void setBrogHusBroNo(String brogHusBroNo) {
		this.brogHusBroNo = brogHusBroNo;
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
	 * @param cmdtCd
	 */
	public void setCmdtCd(String cmdtCd) {
		this.cmdtCd = cmdtCd;
	}
	
	/**
	 * Column Info
	 * @param brogCntCustSeq
	 */
	public void setBrogCntCustSeq(String brogCntCustSeq) {
		this.brogCntCustSeq = brogCntCustSeq;
	}
	
	/**
	 * Column Info
	 * @param scNo
	 */
	public void setScNo(String scNo) {
		this.scNo = scNo;
	}
	
	/**
	 * Column Info
	 * @param fmEffDt
	 */
	public void setFmEffDt(String fmEffDt) {
		this.fmEffDt = fmEffDt;
	}
	
	/**
	 * Column Info
	 * @param porRoutCd
	 */
	public void setPorRoutCd(String porRoutCd) {
		this.porRoutCd = porRoutCd;
	}
	
	/**
	 * Column Info
	 * @param brogCntCd
	 */
	public void setBrogCntCd(String brogCntCd) {
		this.brogCntCd = brogCntCd;
	}
	
	/**
	 * Column Info
	 * @param shprCntNm
	 */
	public void setShprCntNm(String shprCntNm) {
		this.shprCntNm = shprCntNm;
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
	 * @param polRoutCd
	 */
	public void setPolRoutCd(String polRoutCd) {
		this.polRoutCd = polRoutCd;
	}
	
	/**
	 * Column Info
	 * @param brogRfRt
	 */
	public void setBrogRfRt(String brogRfRt) {
		this.brogRfRt = brogRfRt;
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
	 * @param polGrpTpCd
	 */
	public void setPolGrpTpCd(String polGrpTpCd) {
		this.polGrpTpCd = polGrpTpCd;
	}
	
	/**
	 * Column Info
	 * @param brogFeuRt
	 */
	public void setBrogFeuRt(String brogFeuRt) {
		this.brogFeuRt = brogFeuRt;
	}
	
	/**
	 * Column Info
	 * @param bkgBrogRt
	 */
	public void setBkgBrogRt(String bkgBrogRt) {
		this.bkgBrogRt = bkgBrogRt;
	}
	
	/**
	 * Column Info
	 * @param shprCntCd
	 */
	public void setShprCntCd(String shprCntCd) {
		this.shprCntCd = shprCntCd;
	}
	
	/**
	 * Column Info
	 * @param brogCntCustNm
	 */
	public void setBrogCntCustNm(String brogCntCustNm) {
		this.brogCntCustNm = brogCntCustNm;
	}
	
	/**
	 * Column Info
	 * @param brogChgCtnt
	 */
	public void setBrogChgCtnt(String brogChgCtnt) {
		this.brogChgCtnt = brogChgCtnt;
	}
	
	/**
	 * Column Info
	 * @param toEffDt
	 */
	public void setToEffDt(String toEffDt) {
		this.toEffDt = toEffDt;
	}
	
	/**
	 * Column Info
	 * @param cmdtNm
	 */
	public void setCmdtNm(String cmdtNm) {
		this.cmdtNm = cmdtNm;
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
	 * @param brogBxRt
	 */
	public void setBrogBxRt(String brogBxRt) {
		this.brogBxRt = brogBxRt;
	}
	
	/**
	 * Column Info
	 * @param cmdtTpCd
	 */
	public void setCmdtTpCd(String cmdtTpCd) {
		this.cmdtTpCd = cmdtTpCd;
	}
	
	/**
	 * Column Info
	 * @param brogCustSeq
	 */
	public void setBrogCustSeq(String brogCustSeq) {
		this.brogCustSeq = brogCustSeq;
	}
	
	/**
	 * Column Info
	 * @param shprSeq
	 */
	public void setShprSeq(String shprSeq) {
		this.shprSeq = shprSeq;
	}
	
	/**
	 * Column Info
	 * @param interMdalFlg
	 */
	public void setInterMdalFlg(String interMdalFlg) {
		this.interMdalFlg = interMdalFlg;
	}
	
	/**
	 * Column Info
	 * @param brogKndCd
	 */
	public void setBrogKndCd(String brogKndCd) {
		this.brogKndCd = brogKndCd;
	}
	
	/**
	 * Column Info
	 * @param podGrpTpCd
	 */
	public void setPodGrpTpCd(String podGrpTpCd) {
		this.podGrpTpCd = podGrpTpCd;
	}
	
	/**
	 * Column Info
	 * @param brogRtSeq
	 */
	public void setBrogRtSeq(String brogRtSeq) {
		this.brogRtSeq = brogRtSeq;
	}
	
	/**
	 * Column Info
	 * @param shprCntSeq
	 */
	public void setShprCntSeq(String shprCntSeq) {
		this.shprCntSeq = shprCntSeq;
	}
	
	/**
	 * Column Info
	 * @param brogCntCustSeq
	 */
	public void setSearchBrogCntCustSeq(String searchBrogCntCustSeq) {
		this.searchBrogCntCustSeq = searchBrogCntCustSeq;
	}
	
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setPorGrpTpCd(JSPUtil.getParameter(request, "por_grp_tp_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setBrogTeuRt(JSPUtil.getParameter(request, "brog_teu_rt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setBrogTpCd(JSPUtil.getParameter(request, "brog_tp_cd", ""));
		setPodRoutCd(JSPUtil.getParameter(request, "pod_rout_cd", ""));
		setRfaNo(JSPUtil.getParameter(request, "rfa_no", ""));
		setBrogDivCd(JSPUtil.getParameter(request, "brog_div_cd", ""));
		setBrogHusBroNo(JSPUtil.getParameter(request, "brog_hus_bro_no", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCmdtCd(JSPUtil.getParameter(request, "cmdt_cd", ""));
		setBrogCntCustSeq(JSPUtil.getParameter(request, "brog_cnt_cust_seq", ""));
		setScNo(JSPUtil.getParameter(request, "sc_no", ""));
		setFmEffDt(JSPUtil.getParameter(request, "fm_eff_dt", ""));
		setPorRoutCd(JSPUtil.getParameter(request, "por_rout_cd", ""));
		setBrogCntCd(JSPUtil.getParameter(request, "brog_cnt_cd", ""));
		setShprCntNm(JSPUtil.getParameter(request, "shpr_cnt_nm", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setPolRoutCd(JSPUtil.getParameter(request, "pol_rout_cd", ""));
		setBrogRfRt(JSPUtil.getParameter(request, "brog_rf_rt", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setPolGrpTpCd(JSPUtil.getParameter(request, "pol_grp_tp_cd", ""));
		setBrogFeuRt(JSPUtil.getParameter(request, "brog_feu_rt", ""));
		setBkgBrogRt(JSPUtil.getParameter(request, "bkg_brog_rt", ""));
		setShprCntCd(JSPUtil.getParameter(request, "shpr_cnt_cd", ""));
		setBrogCntCustNm(JSPUtil.getParameter(request, "brog_cnt_cust_nm", ""));
		setBrogChgCtnt(JSPUtil.getParameter(request, "brog_chg_ctnt", ""));
		setToEffDt(JSPUtil.getParameter(request, "to_eff_dt", ""));
		setCmdtNm(JSPUtil.getParameter(request, "cmdt_nm", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setBrogBxRt(JSPUtil.getParameter(request, "brog_bx_rt", ""));
		setCmdtTpCd(JSPUtil.getParameter(request, "cmdt_tp_cd", ""));
		setBrogCustSeq(JSPUtil.getParameter(request, "brog_cust_seq", ""));
		setShprSeq(JSPUtil.getParameter(request, "shpr_seq", ""));
		setInterMdalFlg(JSPUtil.getParameter(request, "inter_mdal_flg", ""));
		setBrogKndCd(JSPUtil.getParameter(request, "brog_knd_cd", ""));
		setPodGrpTpCd(JSPUtil.getParameter(request, "pod_grp_tp_cd", ""));
		setBrogRtSeq(JSPUtil.getParameter(request, "brog_rt_seq", ""));
		setShprCntSeq(JSPUtil.getParameter(request, "shpr_cnt_seq", ""));
		setSearchBrogCntCustSeq(JSPUtil.getParameter(request, "search_brog_cnt_cust_seq", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return AgtBrogAgmtRtVO[]
	 */
	public AgtBrogAgmtRtVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return AgtBrogAgmtRtVO[]
	 */
	public AgtBrogAgmtRtVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		AgtBrogAgmtRtVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] porGrpTpCd = (JSPUtil.getParameter(request, prefix	+ "por_grp_tp_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] brogTeuRt = (JSPUtil.getParameter(request, prefix	+ "brog_teu_rt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] brogTpCd = (JSPUtil.getParameter(request, prefix	+ "brog_tp_cd", length));
			String[] podRoutCd = (JSPUtil.getParameter(request, prefix	+ "pod_rout_cd", length));
			String[] rfaNo = (JSPUtil.getParameter(request, prefix	+ "rfa_no", length));
			String[] brogDivCd = (JSPUtil.getParameter(request, prefix	+ "brog_div_cd", length));
			String[] brogHusBroNo = (JSPUtil.getParameter(request, prefix	+ "brog_hus_bro_no", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] cmdtCd = (JSPUtil.getParameter(request, prefix	+ "cmdt_cd", length));
			String[] brogCntCustSeq = (JSPUtil.getParameter(request, prefix	+ "brog_cnt_cust_seq", length));
			String[] scNo = (JSPUtil.getParameter(request, prefix	+ "sc_no", length));
			String[] fmEffDt = (JSPUtil.getParameter(request, prefix	+ "fm_eff_dt", length));
			String[] porRoutCd = (JSPUtil.getParameter(request, prefix	+ "por_rout_cd", length));
			String[] brogCntCd = (JSPUtil.getParameter(request, prefix	+ "brog_cnt_cd", length));
			String[] shprCntNm = (JSPUtil.getParameter(request, prefix	+ "shpr_cnt_nm", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] polRoutCd = (JSPUtil.getParameter(request, prefix	+ "pol_rout_cd", length));
			String[] brogRfRt = (JSPUtil.getParameter(request, prefix	+ "brog_rf_rt", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] polGrpTpCd = (JSPUtil.getParameter(request, prefix	+ "pol_grp_tp_cd", length));
			String[] brogFeuRt = (JSPUtil.getParameter(request, prefix	+ "brog_feu_rt", length));
			String[] bkgBrogRt = (JSPUtil.getParameter(request, prefix	+ "bkg_brog_rt", length));
			String[] shprCntCd = (JSPUtil.getParameter(request, prefix	+ "shpr_cnt_cd", length));
			String[] brogCntCustNm = (JSPUtil.getParameter(request, prefix	+ "brog_cnt_cust_nm", length));
			String[] brogChgCtnt = (JSPUtil.getParameter(request, prefix	+ "brog_chg_ctnt", length));
			String[] toEffDt = (JSPUtil.getParameter(request, prefix	+ "to_eff_dt", length));
			String[] cmdtNm = (JSPUtil.getParameter(request, prefix	+ "cmdt_nm", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] brogBxRt = (JSPUtil.getParameter(request, prefix	+ "brog_bx_rt", length));
			String[] cmdtTpCd = (JSPUtil.getParameter(request, prefix	+ "cmdt_tp_cd", length));
			String[] brogCustSeq = (JSPUtil.getParameter(request, prefix	+ "brog_cust_seq", length));
			String[] shprSeq = (JSPUtil.getParameter(request, prefix	+ "shpr_seq", length));
			String[] interMdalFlg = (JSPUtil.getParameter(request, prefix	+ "inter_mdal_flg", length));
			String[] brogKndCd = (JSPUtil.getParameter(request, prefix	+ "brog_knd_cd", length));
			String[] podGrpTpCd = (JSPUtil.getParameter(request, prefix	+ "pod_grp_tp_cd", length));
			String[] brogRtSeq = (JSPUtil.getParameter(request, prefix	+ "brog_rt_seq", length));
			String[] shprCntSeq = (JSPUtil.getParameter(request, prefix	+ "shpr_cnt_seq", length));
			String[] searchBrogCntCustSeq = (JSPUtil.getParameter(request, prefix	+ "search_brog_cnt_cust_seq", length));
			
			for (int i = 0; i < length; i++) {
				model = new AgtBrogAgmtRtVO();
				if (porGrpTpCd[i] != null)
					model.setPorGrpTpCd(porGrpTpCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (brogTeuRt[i] != null)
					model.setBrogTeuRt(brogTeuRt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (brogTpCd[i] != null)
					model.setBrogTpCd(brogTpCd[i]);
				if (podRoutCd[i] != null)
					model.setPodRoutCd(podRoutCd[i]);
				if (rfaNo[i] != null)
					model.setRfaNo(rfaNo[i]);
				if (brogDivCd[i] != null)
					model.setBrogDivCd(brogDivCd[i]);
				if (brogHusBroNo[i] != null)
					model.setBrogHusBroNo(brogHusBroNo[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (cmdtCd[i] != null)
					model.setCmdtCd(cmdtCd[i]);
				if (brogCntCustSeq[i] != null)
					model.setBrogCntCustSeq(brogCntCustSeq[i]);
				if (scNo[i] != null)
					model.setScNo(scNo[i]);
				if (fmEffDt[i] != null)
					model.setFmEffDt(fmEffDt[i]);
				if (porRoutCd[i] != null)
					model.setPorRoutCd(porRoutCd[i]);
				if (brogCntCd[i] != null)
					model.setBrogCntCd(brogCntCd[i]);
				if (shprCntNm[i] != null)
					model.setShprCntNm(shprCntNm[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (polRoutCd[i] != null)
					model.setPolRoutCd(polRoutCd[i]);
				if (brogRfRt[i] != null)
					model.setBrogRfRt(brogRfRt[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (polGrpTpCd[i] != null)
					model.setPolGrpTpCd(polGrpTpCd[i]);
				if (brogFeuRt[i] != null)
					model.setBrogFeuRt(brogFeuRt[i]);
				if (bkgBrogRt[i] != null)
					model.setBkgBrogRt(bkgBrogRt[i]);
				if (shprCntCd[i] != null)
					model.setShprCntCd(shprCntCd[i]);
				if (brogCntCustNm[i] != null)
					model.setBrogCntCustNm(brogCntCustNm[i]);
				if (brogChgCtnt[i] != null)
					model.setBrogChgCtnt(brogChgCtnt[i]);
				if (toEffDt[i] != null)
					model.setToEffDt(toEffDt[i]);
				if (cmdtNm[i] != null)
					model.setCmdtNm(cmdtNm[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (brogBxRt[i] != null)
					model.setBrogBxRt(brogBxRt[i]);
				if (cmdtTpCd[i] != null)
					model.setCmdtTpCd(cmdtTpCd[i]);
				if (brogCustSeq[i] != null)
					model.setBrogCustSeq(brogCustSeq[i]);
				if (shprSeq[i] != null)
					model.setShprSeq(shprSeq[i]);
				if (interMdalFlg[i] != null)
					model.setInterMdalFlg(interMdalFlg[i]);
				if (brogKndCd[i] != null)
					model.setBrogKndCd(brogKndCd[i]);
				if (podGrpTpCd[i] != null)
					model.setPodGrpTpCd(podGrpTpCd[i]);
				if (brogRtSeq[i] != null)
					model.setBrogRtSeq(brogRtSeq[i]);
				if (shprCntSeq[i] != null)
					model.setShprCntSeq(shprCntSeq[i]);
				if (searchBrogCntCustSeq[i] != null)
					model.setSearchBrogCntCustSeq(searchBrogCntCustSeq[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getAgtBrogAgmtRtVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return AgtBrogAgmtRtVO[]
	 */
	public AgtBrogAgmtRtVO[] getAgtBrogAgmtRtVOs(){
		AgtBrogAgmtRtVO[] vos = (AgtBrogAgmtRtVO[])models.toArray(new AgtBrogAgmtRtVO[models.size()]);
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
		this.porGrpTpCd = this.porGrpTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.brogTeuRt = this.brogTeuRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.brogTpCd = this.brogTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.podRoutCd = this.podRoutCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rfaNo = this.rfaNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.brogDivCd = this.brogDivCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.brogHusBroNo = this.brogHusBroNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cmdtCd = this.cmdtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.brogCntCustSeq = this.brogCntCustSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.scNo = this.scNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fmEffDt = this.fmEffDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.porRoutCd = this.porRoutCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.brogCntCd = this.brogCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.shprCntNm = this.shprCntNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.polRoutCd = this.polRoutCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.brogRfRt = this.brogRfRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.polGrpTpCd = this.polGrpTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.brogFeuRt = this.brogFeuRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgBrogRt = this.bkgBrogRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.shprCntCd = this.shprCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.brogCntCustNm = this.brogCntCustNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.brogChgCtnt = this.brogChgCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.toEffDt = this.toEffDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cmdtNm = this.cmdtNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.brogBxRt = this.brogBxRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cmdtTpCd = this.cmdtTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.brogCustSeq = this.brogCustSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.shprSeq = this.shprSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.interMdalFlg = this.interMdalFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.brogKndCd = this.brogKndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.podGrpTpCd = this.podGrpTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.brogRtSeq = this.brogRtSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.shprCntSeq = this.shprCntSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.searchBrogCntCustSeq = this.searchBrogCntCustSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}

