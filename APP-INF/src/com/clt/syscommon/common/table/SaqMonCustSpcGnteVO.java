/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : SaqMonCustSpcGnteVO.java
*@FileTitle : SaqMonCustSpcGnteVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.23
*@LastModifier : 김민아
*@LastVersion : 1.0
* 2009.07.23 김민아 
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
 * @author 김민아
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class SaqMonCustSpcGnteVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SaqMonCustSpcGnteVO> models = new ArrayList<SaqMonCustSpcGnteVO>();
	
	/* Column Info */
	private String rqstUsrId = null;
	/* Column Info */
	private String cfmGdt = null;
	/* Column Info */
	private String crnt40ftHcRqstQty = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String rlaneCd = null;
	/* Column Info */
	private String preTtlRqstQty = null;
	/* Column Info */
	private String repTrdCd = null;
	/* Column Info */
	private String rqstGdt = null;
	/* Column Info */
	private String preTtlCfmQty = null;
	/* Column Info */
	private String crnt45ftHcCfmQty = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String polCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String ctrtOfcCd = null;
	/* Column Info */
	private String preRfCfmQty = null;
	/* Column Info */
	private String pre45ftHcCfmQty = null;
	/* Column Info */
	private String slsOfcCd = null;
	/* Column Info */
	private String cfmUsrId = null;
	/* Column Info */
	private String pre40ftHcRqstQty = null;
	/* Column Info */
	private String dirCd = null;
	/* Column Info */
	private String crntTtlRqstQty = null;
	/* Column Info */
	private String pre40ftHcCfmQty = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String custCntCd = null;
	/* Column Info */
	private String crnt40ftHcCfmQty = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String spcRqstStsCd = null;
	/* Column Info */
	private String crntRfRqstQty = null;
	/* Column Info */
	private String preRfRqstQty = null;
	/* Column Info */
	private String newRfRqstQty = null;
	/* Column Info */
	private String crnt45ftHcRqstQty = null;
	/* Column Info */
	private String bseYr = null;
	/* Column Info */
	private String bseWk = null;
	/* Column Info */
	private String custSeq = null;
	/* Column Info */
	private String newTtlRqstQty = null;
	/* Column Info */
	private String new45ftHcRqstQty = null;
	/* Column Info */
	private String scRfaAgmtNo = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String bkgAgmtTpCd = null;
	/* Column Info */
	private String new40ftHcRqstQty = null;
	/* Column Info */
	private String repSubTrdCd = null;
	/* Column Info */
	private String crntTtlCfmQty = null;
	/* Column Info */
	private String pre45ftHcRqstQty = null;
	/* Column Info */
	private String crntRfCfmQty = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public SaqMonCustSpcGnteVO() {}

	public SaqMonCustSpcGnteVO(String ibflag, String pagerows, String bseYr, String bseWk, String ctrtOfcCd, String custCntCd, String custSeq, String rlaneCd, String dirCd, String slsOfcCd, String polCd, String scRfaAgmtNo, String bkgAgmtTpCd, String repTrdCd, String repSubTrdCd, String newTtlRqstQty, String new40ftHcRqstQty, String new45ftHcRqstQty, String newRfRqstQty, String crntTtlRqstQty, String crnt40ftHcRqstQty, String crnt45ftHcRqstQty, String crntRfRqstQty, String crntTtlCfmQty, String crnt40ftHcCfmQty, String crnt45ftHcCfmQty, String crntRfCfmQty, String preTtlRqstQty, String pre40ftHcRqstQty, String pre45ftHcRqstQty, String preRfRqstQty, String preTtlCfmQty, String pre40ftHcCfmQty, String pre45ftHcCfmQty, String preRfCfmQty, String spcRqstStsCd, String rqstUsrId, String rqstGdt, String cfmUsrId, String cfmGdt, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.rqstUsrId = rqstUsrId;
		this.cfmGdt = cfmGdt;
		this.crnt40ftHcRqstQty = crnt40ftHcRqstQty;
		this.creDt = creDt;
		this.rlaneCd = rlaneCd;
		this.preTtlRqstQty = preTtlRqstQty;
		this.repTrdCd = repTrdCd;
		this.rqstGdt = rqstGdt;
		this.preTtlCfmQty = preTtlCfmQty;
		this.crnt45ftHcCfmQty = crnt45ftHcCfmQty;
		this.pagerows = pagerows;
		this.polCd = polCd;
		this.ibflag = ibflag;
		this.ctrtOfcCd = ctrtOfcCd;
		this.preRfCfmQty = preRfCfmQty;
		this.pre45ftHcCfmQty = pre45ftHcCfmQty;
		this.slsOfcCd = slsOfcCd;
		this.cfmUsrId = cfmUsrId;
		this.pre40ftHcRqstQty = pre40ftHcRqstQty;
		this.dirCd = dirCd;
		this.crntTtlRqstQty = crntTtlRqstQty;
		this.pre40ftHcCfmQty = pre40ftHcCfmQty;
		this.updUsrId = updUsrId;
		this.custCntCd = custCntCd;
		this.crnt40ftHcCfmQty = crnt40ftHcCfmQty;
		this.updDt = updDt;
		this.spcRqstStsCd = spcRqstStsCd;
		this.crntRfRqstQty = crntRfRqstQty;
		this.preRfRqstQty = preRfRqstQty;
		this.newRfRqstQty = newRfRqstQty;
		this.crnt45ftHcRqstQty = crnt45ftHcRqstQty;
		this.bseYr = bseYr;
		this.bseWk = bseWk;
		this.custSeq = custSeq;
		this.newTtlRqstQty = newTtlRqstQty;
		this.new45ftHcRqstQty = new45ftHcRqstQty;
		this.scRfaAgmtNo = scRfaAgmtNo;
		this.creUsrId = creUsrId;
		this.bkgAgmtTpCd = bkgAgmtTpCd;
		this.new40ftHcRqstQty = new40ftHcRqstQty;
		this.repSubTrdCd = repSubTrdCd;
		this.crntTtlCfmQty = crntTtlCfmQty;
		this.pre45ftHcRqstQty = pre45ftHcRqstQty;
		this.crntRfCfmQty = crntRfCfmQty;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("rqst_usr_id", getRqstUsrId());
		this.hashColumns.put("cfm_gdt", getCfmGdt());
		this.hashColumns.put("crnt_40ft_hc_rqst_qty", getCrnt40ftHcRqstQty());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("rlane_cd", getRlaneCd());
		this.hashColumns.put("pre_ttl_rqst_qty", getPreTtlRqstQty());
		this.hashColumns.put("rep_trd_cd", getRepTrdCd());
		this.hashColumns.put("rqst_gdt", getRqstGdt());
		this.hashColumns.put("pre_ttl_cfm_qty", getPreTtlCfmQty());
		this.hashColumns.put("crnt_45ft_hc_cfm_qty", getCrnt45ftHcCfmQty());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("pol_cd", getPolCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("ctrt_ofc_cd", getCtrtOfcCd());
		this.hashColumns.put("pre_rf_cfm_qty", getPreRfCfmQty());
		this.hashColumns.put("pre_45ft_hc_cfm_qty", getPre45ftHcCfmQty());
		this.hashColumns.put("sls_ofc_cd", getSlsOfcCd());
		this.hashColumns.put("cfm_usr_id", getCfmUsrId());
		this.hashColumns.put("pre_40ft_hc_rqst_qty", getPre40ftHcRqstQty());
		this.hashColumns.put("dir_cd", getDirCd());
		this.hashColumns.put("crnt_ttl_rqst_qty", getCrntTtlRqstQty());
		this.hashColumns.put("pre_40ft_hc_cfm_qty", getPre40ftHcCfmQty());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("cust_cnt_cd", getCustCntCd());
		this.hashColumns.put("crnt_40ft_hc_cfm_qty", getCrnt40ftHcCfmQty());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("spc_rqst_sts_cd", getSpcRqstStsCd());
		this.hashColumns.put("crnt_rf_rqst_qty", getCrntRfRqstQty());
		this.hashColumns.put("pre_rf_rqst_qty", getPreRfRqstQty());
		this.hashColumns.put("new_rf_rqst_qty", getNewRfRqstQty());
		this.hashColumns.put("crnt_45ft_hc_rqst_qty", getCrnt45ftHcRqstQty());
		this.hashColumns.put("bse_yr", getBseYr());
		this.hashColumns.put("bse_wk", getBseWk());
		this.hashColumns.put("cust_seq", getCustSeq());
		this.hashColumns.put("new_ttl_rqst_qty", getNewTtlRqstQty());
		this.hashColumns.put("new_45ft_hc_rqst_qty", getNew45ftHcRqstQty());
		this.hashColumns.put("sc_rfa_agmt_no", getScRfaAgmtNo());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("bkg_agmt_tp_cd", getBkgAgmtTpCd());
		this.hashColumns.put("new_40ft_hc_rqst_qty", getNew40ftHcRqstQty());
		this.hashColumns.put("rep_sub_trd_cd", getRepSubTrdCd());
		this.hashColumns.put("crnt_ttl_cfm_qty", getCrntTtlCfmQty());
		this.hashColumns.put("pre_45ft_hc_rqst_qty", getPre45ftHcRqstQty());
		this.hashColumns.put("crnt_rf_cfm_qty", getCrntRfCfmQty());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("rqst_usr_id", "rqstUsrId");
		this.hashFields.put("cfm_gdt", "cfmGdt");
		this.hashFields.put("crnt_40ft_hc_rqst_qty", "crnt40ftHcRqstQty");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("rlane_cd", "rlaneCd");
		this.hashFields.put("pre_ttl_rqst_qty", "preTtlRqstQty");
		this.hashFields.put("rep_trd_cd", "repTrdCd");
		this.hashFields.put("rqst_gdt", "rqstGdt");
		this.hashFields.put("pre_ttl_cfm_qty", "preTtlCfmQty");
		this.hashFields.put("crnt_45ft_hc_cfm_qty", "crnt45ftHcCfmQty");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("pol_cd", "polCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("ctrt_ofc_cd", "ctrtOfcCd");
		this.hashFields.put("pre_rf_cfm_qty", "preRfCfmQty");
		this.hashFields.put("pre_45ft_hc_cfm_qty", "pre45ftHcCfmQty");
		this.hashFields.put("sls_ofc_cd", "slsOfcCd");
		this.hashFields.put("cfm_usr_id", "cfmUsrId");
		this.hashFields.put("pre_40ft_hc_rqst_qty", "pre40ftHcRqstQty");
		this.hashFields.put("dir_cd", "dirCd");
		this.hashFields.put("crnt_ttl_rqst_qty", "crntTtlRqstQty");
		this.hashFields.put("pre_40ft_hc_cfm_qty", "pre40ftHcCfmQty");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("cust_cnt_cd", "custCntCd");
		this.hashFields.put("crnt_40ft_hc_cfm_qty", "crnt40ftHcCfmQty");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("spc_rqst_sts_cd", "spcRqstStsCd");
		this.hashFields.put("crnt_rf_rqst_qty", "crntRfRqstQty");
		this.hashFields.put("pre_rf_rqst_qty", "preRfRqstQty");
		this.hashFields.put("new_rf_rqst_qty", "newRfRqstQty");
		this.hashFields.put("crnt_45ft_hc_rqst_qty", "crnt45ftHcRqstQty");
		this.hashFields.put("bse_yr", "bseYr");
		this.hashFields.put("bse_wk", "bseWk");
		this.hashFields.put("cust_seq", "custSeq");
		this.hashFields.put("new_ttl_rqst_qty", "newTtlRqstQty");
		this.hashFields.put("new_45ft_hc_rqst_qty", "new45ftHcRqstQty");
		this.hashFields.put("sc_rfa_agmt_no", "scRfaAgmtNo");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("bkg_agmt_tp_cd", "bkgAgmtTpCd");
		this.hashFields.put("new_40ft_hc_rqst_qty", "new40ftHcRqstQty");
		this.hashFields.put("rep_sub_trd_cd", "repSubTrdCd");
		this.hashFields.put("crnt_ttl_cfm_qty", "crntTtlCfmQty");
		this.hashFields.put("pre_45ft_hc_rqst_qty", "pre45ftHcRqstQty");
		this.hashFields.put("crnt_rf_cfm_qty", "crntRfCfmQty");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return rqstUsrId
	 */
	public String getRqstUsrId() {
		return this.rqstUsrId;
	}
	
	/**
	 * Column Info
	 * @return cfmGdt
	 */
	public String getCfmGdt() {
		return this.cfmGdt;
	}
	
	/**
	 * Column Info
	 * @return crnt40ftHcRqstQty
	 */
	public String getCrnt40ftHcRqstQty() {
		return this.crnt40ftHcRqstQty;
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
	 * @return rlaneCd
	 */
	public String getRlaneCd() {
		return this.rlaneCd;
	}
	
	/**
	 * Column Info
	 * @return preTtlRqstQty
	 */
	public String getPreTtlRqstQty() {
		return this.preTtlRqstQty;
	}
	
	/**
	 * Column Info
	 * @return repTrdCd
	 */
	public String getRepTrdCd() {
		return this.repTrdCd;
	}
	
	/**
	 * Column Info
	 * @return rqstGdt
	 */
	public String getRqstGdt() {
		return this.rqstGdt;
	}
	
	/**
	 * Column Info
	 * @return preTtlCfmQty
	 */
	public String getPreTtlCfmQty() {
		return this.preTtlCfmQty;
	}
	
	/**
	 * Column Info
	 * @return crnt45ftHcCfmQty
	 */
	public String getCrnt45ftHcCfmQty() {
		return this.crnt45ftHcCfmQty;
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
	 * @return polCd
	 */
	public String getPolCd() {
		return this.polCd;
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
	 * @return ctrtOfcCd
	 */
	public String getCtrtOfcCd() {
		return this.ctrtOfcCd;
	}
	
	/**
	 * Column Info
	 * @return preRfCfmQty
	 */
	public String getPreRfCfmQty() {
		return this.preRfCfmQty;
	}
	
	/**
	 * Column Info
	 * @return pre45ftHcCfmQty
	 */
	public String getPre45ftHcCfmQty() {
		return this.pre45ftHcCfmQty;
	}
	
	/**
	 * Column Info
	 * @return slsOfcCd
	 */
	public String getSlsOfcCd() {
		return this.slsOfcCd;
	}
	
	/**
	 * Column Info
	 * @return cfmUsrId
	 */
	public String getCfmUsrId() {
		return this.cfmUsrId;
	}
	
	/**
	 * Column Info
	 * @return pre40ftHcRqstQty
	 */
	public String getPre40ftHcRqstQty() {
		return this.pre40ftHcRqstQty;
	}
	
	/**
	 * Column Info
	 * @return dirCd
	 */
	public String getDirCd() {
		return this.dirCd;
	}
	
	/**
	 * Column Info
	 * @return crntTtlRqstQty
	 */
	public String getCrntTtlRqstQty() {
		return this.crntTtlRqstQty;
	}
	
	/**
	 * Column Info
	 * @return pre40ftHcCfmQty
	 */
	public String getPre40ftHcCfmQty() {
		return this.pre40ftHcCfmQty;
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
	 * @return custCntCd
	 */
	public String getCustCntCd() {
		return this.custCntCd;
	}
	
	/**
	 * Column Info
	 * @return crnt40ftHcCfmQty
	 */
	public String getCrnt40ftHcCfmQty() {
		return this.crnt40ftHcCfmQty;
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
	 * @return spcRqstStsCd
	 */
	public String getSpcRqstStsCd() {
		return this.spcRqstStsCd;
	}
	
	/**
	 * Column Info
	 * @return crntRfRqstQty
	 */
	public String getCrntRfRqstQty() {
		return this.crntRfRqstQty;
	}
	
	/**
	 * Column Info
	 * @return preRfRqstQty
	 */
	public String getPreRfRqstQty() {
		return this.preRfRqstQty;
	}
	
	/**
	 * Column Info
	 * @return newRfRqstQty
	 */
	public String getNewRfRqstQty() {
		return this.newRfRqstQty;
	}
	
	/**
	 * Column Info
	 * @return crnt45ftHcRqstQty
	 */
	public String getCrnt45ftHcRqstQty() {
		return this.crnt45ftHcRqstQty;
	}
	
	/**
	 * Column Info
	 * @return bseYr
	 */
	public String getBseYr() {
		return this.bseYr;
	}
	
	/**
	 * Column Info
	 * @return bseWk
	 */
	public String getBseWk() {
		return this.bseWk;
	}
	
	/**
	 * Column Info
	 * @return custSeq
	 */
	public String getCustSeq() {
		return this.custSeq;
	}
	
	/**
	 * Column Info
	 * @return newTtlRqstQty
	 */
	public String getNewTtlRqstQty() {
		return this.newTtlRqstQty;
	}
	
	/**
	 * Column Info
	 * @return new45ftHcRqstQty
	 */
	public String getNew45ftHcRqstQty() {
		return this.new45ftHcRqstQty;
	}
	
	/**
	 * Column Info
	 * @return scRfaAgmtNo
	 */
	public String getScRfaAgmtNo() {
		return this.scRfaAgmtNo;
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
	 * @return bkgAgmtTpCd
	 */
	public String getBkgAgmtTpCd() {
		return this.bkgAgmtTpCd;
	}
	
	/**
	 * Column Info
	 * @return new40ftHcRqstQty
	 */
	public String getNew40ftHcRqstQty() {
		return this.new40ftHcRqstQty;
	}
	
	/**
	 * Column Info
	 * @return repSubTrdCd
	 */
	public String getRepSubTrdCd() {
		return this.repSubTrdCd;
	}
	
	/**
	 * Column Info
	 * @return crntTtlCfmQty
	 */
	public String getCrntTtlCfmQty() {
		return this.crntTtlCfmQty;
	}
	
	/**
	 * Column Info
	 * @return pre45ftHcRqstQty
	 */
	public String getPre45ftHcRqstQty() {
		return this.pre45ftHcRqstQty;
	}
	
	/**
	 * Column Info
	 * @return crntRfCfmQty
	 */
	public String getCrntRfCfmQty() {
		return this.crntRfCfmQty;
	}
	

	/**
	 * Column Info
	 * @param rqstUsrId
	 */
	public void setRqstUsrId(String rqstUsrId) {
		this.rqstUsrId = rqstUsrId;
	}
	
	/**
	 * Column Info
	 * @param cfmGdt
	 */
	public void setCfmGdt(String cfmGdt) {
		this.cfmGdt = cfmGdt;
	}
	
	/**
	 * Column Info
	 * @param crnt40ftHcRqstQty
	 */
	public void setCrnt40ftHcRqstQty(String crnt40ftHcRqstQty) {
		this.crnt40ftHcRqstQty = crnt40ftHcRqstQty;
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
	 * @param rlaneCd
	 */
	public void setRlaneCd(String rlaneCd) {
		this.rlaneCd = rlaneCd;
	}
	
	/**
	 * Column Info
	 * @param preTtlRqstQty
	 */
	public void setPreTtlRqstQty(String preTtlRqstQty) {
		this.preTtlRqstQty = preTtlRqstQty;
	}
	
	/**
	 * Column Info
	 * @param repTrdCd
	 */
	public void setRepTrdCd(String repTrdCd) {
		this.repTrdCd = repTrdCd;
	}
	
	/**
	 * Column Info
	 * @param rqstGdt
	 */
	public void setRqstGdt(String rqstGdt) {
		this.rqstGdt = rqstGdt;
	}
	
	/**
	 * Column Info
	 * @param preTtlCfmQty
	 */
	public void setPreTtlCfmQty(String preTtlCfmQty) {
		this.preTtlCfmQty = preTtlCfmQty;
	}
	
	/**
	 * Column Info
	 * @param crnt45ftHcCfmQty
	 */
	public void setCrnt45ftHcCfmQty(String crnt45ftHcCfmQty) {
		this.crnt45ftHcCfmQty = crnt45ftHcCfmQty;
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
	 * @param polCd
	 */
	public void setPolCd(String polCd) {
		this.polCd = polCd;
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
	 * @param ctrtOfcCd
	 */
	public void setCtrtOfcCd(String ctrtOfcCd) {
		this.ctrtOfcCd = ctrtOfcCd;
	}
	
	/**
	 * Column Info
	 * @param preRfCfmQty
	 */
	public void setPreRfCfmQty(String preRfCfmQty) {
		this.preRfCfmQty = preRfCfmQty;
	}
	
	/**
	 * Column Info
	 * @param pre45ftHcCfmQty
	 */
	public void setPre45ftHcCfmQty(String pre45ftHcCfmQty) {
		this.pre45ftHcCfmQty = pre45ftHcCfmQty;
	}
	
	/**
	 * Column Info
	 * @param slsOfcCd
	 */
	public void setSlsOfcCd(String slsOfcCd) {
		this.slsOfcCd = slsOfcCd;
	}
	
	/**
	 * Column Info
	 * @param cfmUsrId
	 */
	public void setCfmUsrId(String cfmUsrId) {
		this.cfmUsrId = cfmUsrId;
	}
	
	/**
	 * Column Info
	 * @param pre40ftHcRqstQty
	 */
	public void setPre40ftHcRqstQty(String pre40ftHcRqstQty) {
		this.pre40ftHcRqstQty = pre40ftHcRqstQty;
	}
	
	/**
	 * Column Info
	 * @param dirCd
	 */
	public void setDirCd(String dirCd) {
		this.dirCd = dirCd;
	}
	
	/**
	 * Column Info
	 * @param crntTtlRqstQty
	 */
	public void setCrntTtlRqstQty(String crntTtlRqstQty) {
		this.crntTtlRqstQty = crntTtlRqstQty;
	}
	
	/**
	 * Column Info
	 * @param pre40ftHcCfmQty
	 */
	public void setPre40ftHcCfmQty(String pre40ftHcCfmQty) {
		this.pre40ftHcCfmQty = pre40ftHcCfmQty;
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
	 * @param custCntCd
	 */
	public void setCustCntCd(String custCntCd) {
		this.custCntCd = custCntCd;
	}
	
	/**
	 * Column Info
	 * @param crnt40ftHcCfmQty
	 */
	public void setCrnt40ftHcCfmQty(String crnt40ftHcCfmQty) {
		this.crnt40ftHcCfmQty = crnt40ftHcCfmQty;
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
	 * @param spcRqstStsCd
	 */
	public void setSpcRqstStsCd(String spcRqstStsCd) {
		this.spcRqstStsCd = spcRqstStsCd;
	}
	
	/**
	 * Column Info
	 * @param crntRfRqstQty
	 */
	public void setCrntRfRqstQty(String crntRfRqstQty) {
		this.crntRfRqstQty = crntRfRqstQty;
	}
	
	/**
	 * Column Info
	 * @param preRfRqstQty
	 */
	public void setPreRfRqstQty(String preRfRqstQty) {
		this.preRfRqstQty = preRfRqstQty;
	}
	
	/**
	 * Column Info
	 * @param newRfRqstQty
	 */
	public void setNewRfRqstQty(String newRfRqstQty) {
		this.newRfRqstQty = newRfRqstQty;
	}
	
	/**
	 * Column Info
	 * @param crnt45ftHcRqstQty
	 */
	public void setCrnt45ftHcRqstQty(String crnt45ftHcRqstQty) {
		this.crnt45ftHcRqstQty = crnt45ftHcRqstQty;
	}
	
	/**
	 * Column Info
	 * @param bseYr
	 */
	public void setBseYr(String bseYr) {
		this.bseYr = bseYr;
	}
	
	/**
	 * Column Info
	 * @param bseWk
	 */
	public void setBseWk(String bseWk) {
		this.bseWk = bseWk;
	}
	
	/**
	 * Column Info
	 * @param custSeq
	 */
	public void setCustSeq(String custSeq) {
		this.custSeq = custSeq;
	}
	
	/**
	 * Column Info
	 * @param newTtlRqstQty
	 */
	public void setNewTtlRqstQty(String newTtlRqstQty) {
		this.newTtlRqstQty = newTtlRqstQty;
	}
	
	/**
	 * Column Info
	 * @param new45ftHcRqstQty
	 */
	public void setNew45ftHcRqstQty(String new45ftHcRqstQty) {
		this.new45ftHcRqstQty = new45ftHcRqstQty;
	}
	
	/**
	 * Column Info
	 * @param scRfaAgmtNo
	 */
	public void setScRfaAgmtNo(String scRfaAgmtNo) {
		this.scRfaAgmtNo = scRfaAgmtNo;
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
	 * @param bkgAgmtTpCd
	 */
	public void setBkgAgmtTpCd(String bkgAgmtTpCd) {
		this.bkgAgmtTpCd = bkgAgmtTpCd;
	}
	
	/**
	 * Column Info
	 * @param new40ftHcRqstQty
	 */
	public void setNew40ftHcRqstQty(String new40ftHcRqstQty) {
		this.new40ftHcRqstQty = new40ftHcRqstQty;
	}
	
	/**
	 * Column Info
	 * @param repSubTrdCd
	 */
	public void setRepSubTrdCd(String repSubTrdCd) {
		this.repSubTrdCd = repSubTrdCd;
	}
	
	/**
	 * Column Info
	 * @param crntTtlCfmQty
	 */
	public void setCrntTtlCfmQty(String crntTtlCfmQty) {
		this.crntTtlCfmQty = crntTtlCfmQty;
	}
	
	/**
	 * Column Info
	 * @param pre45ftHcRqstQty
	 */
	public void setPre45ftHcRqstQty(String pre45ftHcRqstQty) {
		this.pre45ftHcRqstQty = pre45ftHcRqstQty;
	}
	
	/**
	 * Column Info
	 * @param crntRfCfmQty
	 */
	public void setCrntRfCfmQty(String crntRfCfmQty) {
		this.crntRfCfmQty = crntRfCfmQty;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setRqstUsrId(JSPUtil.getParameter(request, "rqst_usr_id", ""));
		setCfmGdt(JSPUtil.getParameter(request, "cfm_gdt", ""));
		setCrnt40ftHcRqstQty(JSPUtil.getParameter(request, "crnt_40ft_hc_rqst_qty", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setRlaneCd(JSPUtil.getParameter(request, "rlane_cd", ""));
		setPreTtlRqstQty(JSPUtil.getParameter(request, "pre_ttl_rqst_qty", ""));
		setRepTrdCd(JSPUtil.getParameter(request, "rep_trd_cd", ""));
		setRqstGdt(JSPUtil.getParameter(request, "rqst_gdt", ""));
		setPreTtlCfmQty(JSPUtil.getParameter(request, "pre_ttl_cfm_qty", ""));
		setCrnt45ftHcCfmQty(JSPUtil.getParameter(request, "crnt_45ft_hc_cfm_qty", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setPolCd(JSPUtil.getParameter(request, "pol_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCtrtOfcCd(JSPUtil.getParameter(request, "ctrt_ofc_cd", ""));
		setPreRfCfmQty(JSPUtil.getParameter(request, "pre_rf_cfm_qty", ""));
		setPre45ftHcCfmQty(JSPUtil.getParameter(request, "pre_45ft_hc_cfm_qty", ""));
		setSlsOfcCd(JSPUtil.getParameter(request, "sls_ofc_cd", ""));
		setCfmUsrId(JSPUtil.getParameter(request, "cfm_usr_id", ""));
		setPre40ftHcRqstQty(JSPUtil.getParameter(request, "pre_40ft_hc_rqst_qty", ""));
		setDirCd(JSPUtil.getParameter(request, "dir_cd", ""));
		setCrntTtlRqstQty(JSPUtil.getParameter(request, "crnt_ttl_rqst_qty", ""));
		setPre40ftHcCfmQty(JSPUtil.getParameter(request, "pre_40ft_hc_cfm_qty", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setCustCntCd(JSPUtil.getParameter(request, "cust_cnt_cd", ""));
		setCrnt40ftHcCfmQty(JSPUtil.getParameter(request, "crnt_40ft_hc_cfm_qty", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setSpcRqstStsCd(JSPUtil.getParameter(request, "spc_rqst_sts_cd", ""));
		setCrntRfRqstQty(JSPUtil.getParameter(request, "crnt_rf_rqst_qty", ""));
		setPreRfRqstQty(JSPUtil.getParameter(request, "pre_rf_rqst_qty", ""));
		setNewRfRqstQty(JSPUtil.getParameter(request, "new_rf_rqst_qty", ""));
		setCrnt45ftHcRqstQty(JSPUtil.getParameter(request, "crnt_45ft_hc_rqst_qty", ""));
		setBseYr(JSPUtil.getParameter(request, "bse_yr", ""));
		setBseWk(JSPUtil.getParameter(request, "bse_wk", ""));
		setCustSeq(JSPUtil.getParameter(request, "cust_seq", ""));
		setNewTtlRqstQty(JSPUtil.getParameter(request, "new_ttl_rqst_qty", ""));
		setNew45ftHcRqstQty(JSPUtil.getParameter(request, "new_45ft_hc_rqst_qty", ""));
		setScRfaAgmtNo(JSPUtil.getParameter(request, "sc_rfa_agmt_no", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setBkgAgmtTpCd(JSPUtil.getParameter(request, "bkg_agmt_tp_cd", ""));
		setNew40ftHcRqstQty(JSPUtil.getParameter(request, "new_40ft_hc_rqst_qty", ""));
		setRepSubTrdCd(JSPUtil.getParameter(request, "rep_sub_trd_cd", ""));
		setCrntTtlCfmQty(JSPUtil.getParameter(request, "crnt_ttl_cfm_qty", ""));
		setPre45ftHcRqstQty(JSPUtil.getParameter(request, "pre_45ft_hc_rqst_qty", ""));
		setCrntRfCfmQty(JSPUtil.getParameter(request, "crnt_rf_cfm_qty", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return SaqMonCustSpcGnteVO[]
	 */
	public SaqMonCustSpcGnteVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SaqMonCustSpcGnteVO[]
	 */
	public SaqMonCustSpcGnteVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SaqMonCustSpcGnteVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "bse_yr");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "bse_yr").length;
  
		try {
			String[] rqstUsrId = (JSPUtil.getParameter(request, prefix	+ "rqst_usr_id", length));
			String[] cfmGdt = (JSPUtil.getParameter(request, prefix	+ "cfm_gdt", length));
			String[] crnt40ftHcRqstQty = (JSPUtil.getParameter(request, prefix	+ "crnt_40ft_hc_rqst_qty", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] rlaneCd = (JSPUtil.getParameter(request, prefix	+ "rlane_cd", length));
			String[] preTtlRqstQty = (JSPUtil.getParameter(request, prefix	+ "pre_ttl_rqst_qty", length));
			String[] repTrdCd = (JSPUtil.getParameter(request, prefix	+ "rep_trd_cd", length));
			String[] rqstGdt = (JSPUtil.getParameter(request, prefix	+ "rqst_gdt", length));
			String[] preTtlCfmQty = (JSPUtil.getParameter(request, prefix	+ "pre_ttl_cfm_qty", length));
			String[] crnt45ftHcCfmQty = (JSPUtil.getParameter(request, prefix	+ "crnt_45ft_hc_cfm_qty", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] polCd = (JSPUtil.getParameter(request, prefix	+ "pol_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] ctrtOfcCd = (JSPUtil.getParameter(request, prefix	+ "ctrt_ofc_cd", length));
			String[] preRfCfmQty = (JSPUtil.getParameter(request, prefix	+ "pre_rf_cfm_qty", length));
			String[] pre45ftHcCfmQty = (JSPUtil.getParameter(request, prefix	+ "pre_45ft_hc_cfm_qty", length));
			String[] slsOfcCd = (JSPUtil.getParameter(request, prefix	+ "sls_ofc_cd", length));
			String[] cfmUsrId = (JSPUtil.getParameter(request, prefix	+ "cfm_usr_id", length));
			String[] pre40ftHcRqstQty = (JSPUtil.getParameter(request, prefix	+ "pre_40ft_hc_rqst_qty", length));
			String[] dirCd = (JSPUtil.getParameter(request, prefix	+ "dir_cd", length));
			String[] crntTtlRqstQty = (JSPUtil.getParameter(request, prefix	+ "crnt_ttl_rqst_qty", length));
			String[] pre40ftHcCfmQty = (JSPUtil.getParameter(request, prefix	+ "pre_40ft_hc_cfm_qty", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] custCntCd = (JSPUtil.getParameter(request, prefix	+ "cust_cnt_cd", length));
			String[] crnt40ftHcCfmQty = (JSPUtil.getParameter(request, prefix	+ "crnt_40ft_hc_cfm_qty", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] spcRqstStsCd = (JSPUtil.getParameter(request, prefix	+ "spc_rqst_sts_cd", length));
			String[] crntRfRqstQty = (JSPUtil.getParameter(request, prefix	+ "crnt_rf_rqst_qty", length));
			String[] preRfRqstQty = (JSPUtil.getParameter(request, prefix	+ "pre_rf_rqst_qty", length));
			String[] newRfRqstQty = (JSPUtil.getParameter(request, prefix	+ "new_rf_rqst_qty", length));
			String[] crnt45ftHcRqstQty = (JSPUtil.getParameter(request, prefix	+ "crnt_45ft_hc_rqst_qty", length));
			String[] bseYr = (JSPUtil.getParameter(request, prefix	+ "bse_yr", length));
			String[] bseWk = (JSPUtil.getParameter(request, prefix	+ "bse_wk", length));
			String[] custSeq = (JSPUtil.getParameter(request, prefix	+ "cust_seq", length));
			String[] newTtlRqstQty = (JSPUtil.getParameter(request, prefix	+ "new_ttl_rqst_qty", length));
			String[] new45ftHcRqstQty = (JSPUtil.getParameter(request, prefix	+ "new_45ft_hc_rqst_qty", length));
			String[] scRfaAgmtNo = (JSPUtil.getParameter(request, prefix	+ "sc_rfa_agmt_no", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] bkgAgmtTpCd = (JSPUtil.getParameter(request, prefix	+ "bkg_agmt_tp_cd", length));
			String[] new40ftHcRqstQty = (JSPUtil.getParameter(request, prefix	+ "new_40ft_hc_rqst_qty", length));
			String[] repSubTrdCd = (JSPUtil.getParameter(request, prefix	+ "rep_sub_trd_cd", length));
			String[] crntTtlCfmQty = (JSPUtil.getParameter(request, prefix	+ "crnt_ttl_cfm_qty", length));
			String[] pre45ftHcRqstQty = (JSPUtil.getParameter(request, prefix	+ "pre_45ft_hc_rqst_qty", length));
			String[] crntRfCfmQty = (JSPUtil.getParameter(request, prefix	+ "crnt_rf_cfm_qty", length));
			
			for (int i = 0; i < length; i++) {
				model = new SaqMonCustSpcGnteVO();
				if (rqstUsrId[i] != null)
					model.setRqstUsrId(rqstUsrId[i]);
				if (cfmGdt[i] != null)
					model.setCfmGdt(cfmGdt[i]);
				if (crnt40ftHcRqstQty[i] != null)
					model.setCrnt40ftHcRqstQty(crnt40ftHcRqstQty[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (rlaneCd[i] != null)
					model.setRlaneCd(rlaneCd[i]);
				if (preTtlRqstQty[i] != null)
					model.setPreTtlRqstQty(preTtlRqstQty[i]);
				if (repTrdCd[i] != null)
					model.setRepTrdCd(repTrdCd[i]);
				if (rqstGdt[i] != null)
					model.setRqstGdt(rqstGdt[i]);
				if (preTtlCfmQty[i] != null)
					model.setPreTtlCfmQty(preTtlCfmQty[i]);
				if (crnt45ftHcCfmQty[i] != null)
					model.setCrnt45ftHcCfmQty(crnt45ftHcCfmQty[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (polCd[i] != null)
					model.setPolCd(polCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (ctrtOfcCd[i] != null)
					model.setCtrtOfcCd(ctrtOfcCd[i]);
				if (preRfCfmQty[i] != null)
					model.setPreRfCfmQty(preRfCfmQty[i]);
				if (pre45ftHcCfmQty[i] != null)
					model.setPre45ftHcCfmQty(pre45ftHcCfmQty[i]);
				if (slsOfcCd[i] != null)
					model.setSlsOfcCd(slsOfcCd[i]);
				if (cfmUsrId[i] != null)
					model.setCfmUsrId(cfmUsrId[i]);
				if (pre40ftHcRqstQty[i] != null)
					model.setPre40ftHcRqstQty(pre40ftHcRqstQty[i]);
				if (dirCd[i] != null)
					model.setDirCd(dirCd[i]);
				if (crntTtlRqstQty[i] != null)
					model.setCrntTtlRqstQty(crntTtlRqstQty[i]);
				if (pre40ftHcCfmQty[i] != null)
					model.setPre40ftHcCfmQty(pre40ftHcCfmQty[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (custCntCd[i] != null)
					model.setCustCntCd(custCntCd[i]);
				if (crnt40ftHcCfmQty[i] != null)
					model.setCrnt40ftHcCfmQty(crnt40ftHcCfmQty[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (spcRqstStsCd[i] != null)
					model.setSpcRqstStsCd(spcRqstStsCd[i]);
				if (crntRfRqstQty[i] != null)
					model.setCrntRfRqstQty(crntRfRqstQty[i]);
				if (preRfRqstQty[i] != null)
					model.setPreRfRqstQty(preRfRqstQty[i]);
				if (newRfRqstQty[i] != null)
					model.setNewRfRqstQty(newRfRqstQty[i]);
				if (crnt45ftHcRqstQty[i] != null)
					model.setCrnt45ftHcRqstQty(crnt45ftHcRqstQty[i]);
				if (bseYr[i] != null)
					model.setBseYr(bseYr[i]);
				if (bseWk[i] != null)
					model.setBseWk(bseWk[i]);
				if (custSeq[i] != null)
					model.setCustSeq(custSeq[i]);
				if (newTtlRqstQty[i] != null)
					model.setNewTtlRqstQty(newTtlRqstQty[i]);
				if (new45ftHcRqstQty[i] != null)
					model.setNew45ftHcRqstQty(new45ftHcRqstQty[i]);
				if (scRfaAgmtNo[i] != null)
					model.setScRfaAgmtNo(scRfaAgmtNo[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (bkgAgmtTpCd[i] != null)
					model.setBkgAgmtTpCd(bkgAgmtTpCd[i]);
				if (new40ftHcRqstQty[i] != null)
					model.setNew40ftHcRqstQty(new40ftHcRqstQty[i]);
				if (repSubTrdCd[i] != null)
					model.setRepSubTrdCd(repSubTrdCd[i]);
				if (crntTtlCfmQty[i] != null)
					model.setCrntTtlCfmQty(crntTtlCfmQty[i]);
				if (pre45ftHcRqstQty[i] != null)
					model.setPre45ftHcRqstQty(pre45ftHcRqstQty[i]);
				if (crntRfCfmQty[i] != null)
					model.setCrntRfCfmQty(crntRfCfmQty[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSaqMonCustSpcGnteVOs();
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다.(0027)
	 * @param request
	 * @param prefix
	 * @return SaqMonCustSpcGnteVO[]
	 */
	public SaqMonCustSpcGnteVO[] fromRequestGrid2(HttpServletRequest request, String prefix) {
		SaqMonCustSpcGnteVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "bse_yr");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "bse_yr").length;
  
		try {			
			String[] ibflag = (JSPUtil.getParameter(request, prefix + "ibflag".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix + "page_rows".trim(), length));
			String[] bseYr = (JSPUtil.getParameter(request, prefix + "bse_yr".trim(), length));
			String[] bseWk = (JSPUtil.getParameter(request, prefix + "bse_wk".trim(), length));
			String[] ctrtOfcCd = (JSPUtil.getParameter(request, prefix + "ctrt_ofc_cd".trim(), length));
			String[] slsOfcCd = (JSPUtil.getParameter(request, prefix + "sls_ofc_cd".trim(), length));
			String[] custCntCd = (JSPUtil.getParameter(request, prefix + "cust_cnt_cd".trim(), length));
			String[] custSeq = (JSPUtil.getParameter(request, prefix + "cust_seq".trim(), length));
			String[] rlaneCd = (JSPUtil.getParameter(request, prefix + "rlane_cd".trim(), length));
			String[] dirCd = (JSPUtil.getParameter(request, prefix + "dir_cd".trim(), length));
			String[] polCd = (JSPUtil.getParameter(request, prefix + "pol_cd".trim(), length));			
			String[] scRfaAgmtNo = (JSPUtil.getParameter(request, prefix + "sc_rfa_agmt_no".trim(), length));
			String[] bkgAgmtTpCd = (JSPUtil.getParameter(request, prefix + "bkg_agmt_tp_cd".trim(), length));
			String[] repTrdCd = (JSPUtil.getParameter(request, prefix + "rep_trd_cd".trim(), length));
			String[] repSubTrdCd = (JSPUtil.getParameter(request, prefix + "rep_sub_trd_cd".trim(), length));
			String[] newTtlRqstQty = (JSPUtil.getParameter(request, prefix + "new_ttl_rqst_qty".trim(),length));
			String[] new40ftHcRqstQty = (JSPUtil.getParameter(request, prefix + "new_40ft_hc_rqst_qty".trim(), length));
			String[] new45ftHcRqstQty = (JSPUtil.getParameter(request, prefix + "new_45ft_hc_rqst_qty".trim(), length));
			String[] newRfRqstQty = (JSPUtil.getParameter(request, prefix + "new_rf_rqst_qty".trim(), length));
			String[] compareSpcRqstStsCd = (JSPUtil.getParameter(request, prefix + "compare_spc_rqst_sts_cd".trim(), length));
			String[] spcRqstStsCd = (JSPUtil.getParameter(request, prefix + "spc_rqst_sts_cd".trim(), length));
			String[] cancelcheck = (JSPUtil.getParameter(request, prefix + "cancelcheck".trim(), length));
			String[] rqstUsrId = (JSPUtil.getParameter(request, prefix + "rqst_usr_id", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix + "upd_usr_id", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix + "cre_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new SaqMonCustSpcGnteVO();
				if("1".equals(cancelcheck[i])){
					//"Initial|Requested|Confirmed|Re-Requested"
					if("2".equals(compareSpcRqstStsCd[i])){
						newTtlRqstQty[i] = "0";
						new40ftHcRqstQty[i] = "0";
						new45ftHcRqstQty[i] = "0";
						newRfRqstQty[i] = "0";
						spcRqstStsCd[i] = "1";
					}else if("3".equals(compareSpcRqstStsCd[i])){
						newTtlRqstQty[i] = "0";
						new40ftHcRqstQty[i] = "0";
						new45ftHcRqstQty[i] = "0";
						newRfRqstQty[i] = "0";
						spcRqstStsCd[i] = "4";			
					}else if("4".equals(compareSpcRqstStsCd[i])){
						newTtlRqstQty[i] = "0";
						new40ftHcRqstQty[i] = "0";
						new45ftHcRqstQty[i] = "0";
						newRfRqstQty[i] = "0";
						spcRqstStsCd[i] = "3";										
					}
				}
				
				if (rlaneCd[i] != null)
					model.setRlaneCd(rlaneCd[i]);
				if (repTrdCd[i] != null)
					model.setRepTrdCd(repTrdCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (polCd[i] != null)
					model.setPolCd(polCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (ctrtOfcCd[i] != null)
					model.setCtrtOfcCd(ctrtOfcCd[i]);
				if (slsOfcCd[i] != null)
					model.setSlsOfcCd(slsOfcCd[i]);
				if (dirCd[i] != null)
					model.setDirCd(dirCd[i]);
				if (custCntCd[i] != null)
					model.setCustCntCd(custCntCd[i]);
				if (spcRqstStsCd[i] != null)
					model.setSpcRqstStsCd(spcRqstStsCd[i]);
				if (bseYr[i] != null)
					model.setBseYr(bseYr[i]);
				if (bseWk[i] != null)
					model.setBseWk(bseWk[i]);
				if (custSeq[i] != null)
					model.setCustSeq(custSeq[i]);
				if (scRfaAgmtNo[i] != null)
					model.setScRfaAgmtNo(scRfaAgmtNo[i]);
				if (bkgAgmtTpCd[i] != null)
					model.setBkgAgmtTpCd(bkgAgmtTpCd[i]);				
				if (repSubTrdCd[i] != null)
					model.setRepSubTrdCd(repSubTrdCd[i]);
				
				model.setNewTtlRqstQty(newTtlRqstQty[i]);
				model.setNew45ftHcRqstQty(new45ftHcRqstQty[i]);
				model.setNew40ftHcRqstQty(new40ftHcRqstQty[i]);
				model.setNewRfRqstQty(newRfRqstQty[i]);	 

				if (rqstUsrId[i] != null)
					model.setRqstUsrId(rqstUsrId[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
						
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSaqMonCustSpcGnteVOs();
	}
	
	/**
	 * VO 배열을 반환
	 * @return SaqMonCustSpcGnteVO[]
	 */
	public SaqMonCustSpcGnteVO[] getSaqMonCustSpcGnteVOs(){
		SaqMonCustSpcGnteVO[] vos = (SaqMonCustSpcGnteVO[])models.toArray(new SaqMonCustSpcGnteVO[models.size()]);
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
		this.rqstUsrId = this.rqstUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cfmGdt = this.cfmGdt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.crnt40ftHcRqstQty = this.crnt40ftHcRqstQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rlaneCd = this.rlaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.preTtlRqstQty = this.preTtlRqstQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.repTrdCd = this.repTrdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rqstGdt = this.rqstGdt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.preTtlCfmQty = this.preTtlCfmQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.crnt45ftHcCfmQty = this.crnt45ftHcCfmQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.polCd = this.polCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ctrtOfcCd = this.ctrtOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.preRfCfmQty = this.preRfCfmQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pre45ftHcCfmQty = this.pre45ftHcCfmQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slsOfcCd = this.slsOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cfmUsrId = this.cfmUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pre40ftHcRqstQty = this.pre40ftHcRqstQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dirCd = this.dirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.crntTtlRqstQty = this.crntTtlRqstQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pre40ftHcCfmQty = this.pre40ftHcCfmQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custCntCd = this.custCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.crnt40ftHcCfmQty = this.crnt40ftHcCfmQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spcRqstStsCd = this.spcRqstStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.crntRfRqstQty = this.crntRfRqstQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.preRfRqstQty = this.preRfRqstQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.newRfRqstQty = this.newRfRqstQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.crnt45ftHcRqstQty = this.crnt45ftHcRqstQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bseYr = this.bseYr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bseWk = this.bseWk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custSeq = this.custSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.newTtlRqstQty = this.newTtlRqstQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.new45ftHcRqstQty = this.new45ftHcRqstQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.scRfaAgmtNo = this.scRfaAgmtNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgAgmtTpCd = this.bkgAgmtTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.new40ftHcRqstQty = this.new40ftHcRqstQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.repSubTrdCd = this.repSubTrdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.crntTtlCfmQty = this.crntTtlCfmQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pre45ftHcRqstQty = this.pre45ftHcRqstQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.crntRfCfmQty = this.crntRfCfmQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
