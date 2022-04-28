/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ArAgnStmtAgmtVO.java
*@FileTitle : ArAgnStmtAgmtVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.10.12
*@LastModifier : 이호진
*@LastVersion : 1.0
* 2009.10.12 이호진 
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
 * @author 이호진
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class ArAgnStmtAgmtVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<ArAgnStmtAgmtVO> models = new ArrayList<ArAgnStmtAgmtVO>();
	
	/* Column Info */
	private String asaClzDt = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String asaCurrCd = null;
	/* Column Info */
	private String remitCrAmt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String revCltCrAmt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String expnDrAmt = null;
	/* Column Info */
	private String bfwrdCrBal = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String asaOfcCd = null;
	/* Column Info */
	private String asaAproDt = null;
	/* Column Info */
	private String revCltEffDt = null;
	/* Column Info */
	private String rfndEffDt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String remitDrAmt = null;
	/* Column Info */
	private String remitEffDt = null;
	/* Column Info */
	private String asaPrprUsrId = null;
	/* Column Info */
	private String acCrAmt = null;
	/* Column Info */
	private String cfwrdDrBal = null;
	/* Column Info */
	private String expnCrAmt = null;
	/* Column Info */
	private String eaiEvntDt = null;
	/* Column Info */
	private String asaRhqCd = null;
	/* Column Info */
	private String asaPrdToDt = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String revCltDrAmt = null;
	/* Column Info */
	private String asaPrdFmDt = null;
	/* Column Info */
	private String rfndDrAmt = null;
	/* Column Info */
	private String rfndCrAmt = null;
	/* Column Info */
	private String bfwrdDrBal = null;
	/* Column Info */
	private String acEffDt = null;
	/* Column Info */
	private String asaAproUsrId = null;
	/* Column Info */
	private String asaNo = null;
	/* Column Info */
	private String expnEffDt = null;
	/* Column Info */
	private String acDrAmt = null;
	/* Column Info */
	private String effYrmon = null;
	/* Column Info */
	private String cfwrdCrBal = null;
	
	private String opCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public ArAgnStmtAgmtVO() {}

	public ArAgnStmtAgmtVO(String ibflag, String pagerows, String asaRhqCd, String asaNo, String asaOfcCd, String asaCurrCd, String asaPrdFmDt, String asaPrdToDt, String bfwrdDrBal, String bfwrdCrBal, String revCltDrAmt, String revCltCrAmt, String revCltEffDt, String rfndDrAmt, String rfndCrAmt, String rfndEffDt, String expnDrAmt, String expnCrAmt, String expnEffDt, String acDrAmt, String acCrAmt, String acEffDt, String remitDrAmt, String remitCrAmt, String remitEffDt, String cfwrdDrBal, String cfwrdCrBal, String effYrmon, String asaClzDt, String asaPrprUsrId, String asaAproUsrId, String asaAproDt, String deltFlg, String creUsrId, String creDt, String updUsrId, String updDt, String eaiEvntDt, String opCd) {
		this.asaClzDt = asaClzDt;
		this.deltFlg = deltFlg;
		this.asaCurrCd = asaCurrCd;
		this.remitCrAmt = remitCrAmt;
		this.creDt = creDt;
		this.revCltCrAmt = revCltCrAmt;
		this.pagerows = pagerows;
		this.expnDrAmt = expnDrAmt;
		this.bfwrdCrBal = bfwrdCrBal;
		this.ibflag = ibflag;
		this.asaOfcCd = asaOfcCd;
		this.asaAproDt = asaAproDt;
		this.revCltEffDt = revCltEffDt;
		this.rfndEffDt = rfndEffDt;
		this.updUsrId = updUsrId;
		this.updDt = updDt;
		this.remitDrAmt = remitDrAmt;
		this.remitEffDt = remitEffDt;
		this.asaPrprUsrId = asaPrprUsrId;
		this.acCrAmt = acCrAmt;
		this.cfwrdDrBal = cfwrdDrBal;
		this.expnCrAmt = expnCrAmt;
		this.eaiEvntDt = eaiEvntDt;
		this.asaRhqCd = asaRhqCd;
		this.asaPrdToDt = asaPrdToDt;
		this.creUsrId = creUsrId;
		this.revCltDrAmt = revCltDrAmt;
		this.asaPrdFmDt = asaPrdFmDt;
		this.rfndDrAmt = rfndDrAmt;
		this.rfndCrAmt = rfndCrAmt;
		this.bfwrdDrBal = bfwrdDrBal;
		this.acEffDt = acEffDt;
		this.asaAproUsrId = asaAproUsrId;
		this.asaNo = asaNo;
		this.expnEffDt = expnEffDt;
		this.acDrAmt = acDrAmt;
		this.effYrmon = effYrmon;
		this.cfwrdCrBal = cfwrdCrBal;
		this.opCd = opCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("asa_clz_dt", getAsaClzDt());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("asa_curr_cd", getAsaCurrCd());
		this.hashColumns.put("remit_cr_amt", getRemitCrAmt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("rev_clt_cr_amt", getRevCltCrAmt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("expn_dr_amt", getExpnDrAmt());
		this.hashColumns.put("bfwrd_cr_bal", getBfwrdCrBal());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("asa_ofc_cd", getAsaOfcCd());
		this.hashColumns.put("asa_apro_dt", getAsaAproDt());
		this.hashColumns.put("rev_clt_eff_dt", getRevCltEffDt());
		this.hashColumns.put("rfnd_eff_dt", getRfndEffDt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("remit_dr_amt", getRemitDrAmt());
		this.hashColumns.put("remit_eff_dt", getRemitEffDt());
		this.hashColumns.put("asa_prpr_usr_id", getAsaPrprUsrId());
		this.hashColumns.put("ac_cr_amt", getAcCrAmt());
		this.hashColumns.put("cfwrd_dr_bal", getCfwrdDrBal());
		this.hashColumns.put("expn_cr_amt", getExpnCrAmt());
		this.hashColumns.put("eai_evnt_dt", getEaiEvntDt());
		this.hashColumns.put("asa_rhq_cd", getAsaRhqCd());
		this.hashColumns.put("asa_prd_to_dt", getAsaPrdToDt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("rev_clt_dr_amt", getRevCltDrAmt());
		this.hashColumns.put("asa_prd_fm_dt", getAsaPrdFmDt());
		this.hashColumns.put("rfnd_dr_amt", getRfndDrAmt());
		this.hashColumns.put("rfnd_cr_amt", getRfndCrAmt());
		this.hashColumns.put("bfwrd_dr_bal", getBfwrdDrBal());
		this.hashColumns.put("ac_eff_dt", getAcEffDt());
		this.hashColumns.put("asa_apro_usr_id", getAsaAproUsrId());
		this.hashColumns.put("asa_no", getAsaNo());
		this.hashColumns.put("expn_eff_dt", getExpnEffDt());
		this.hashColumns.put("ac_dr_amt", getAcDrAmt());
		this.hashColumns.put("eff_yrmon", getEffYrmon());
		this.hashColumns.put("cfwrd_cr_bal", getCfwrdCrBal());
		this.hashColumns.put("op_cd", getOpCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("asa_clz_dt", "asaClzDt");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("asa_curr_cd", "asaCurrCd");
		this.hashFields.put("remit_cr_amt", "remitCrAmt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("rev_clt_cr_amt", "revCltCrAmt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("expn_dr_amt", "expnDrAmt");
		this.hashFields.put("bfwrd_cr_bal", "bfwrdCrBal");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("asa_ofc_cd", "asaOfcCd");
		this.hashFields.put("asa_apro_dt", "asaAproDt");
		this.hashFields.put("rev_clt_eff_dt", "revCltEffDt");
		this.hashFields.put("rfnd_eff_dt", "rfndEffDt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("remit_dr_amt", "remitDrAmt");
		this.hashFields.put("remit_eff_dt", "remitEffDt");
		this.hashFields.put("asa_prpr_usr_id", "asaPrprUsrId");
		this.hashFields.put("ac_cr_amt", "acCrAmt");
		this.hashFields.put("cfwrd_dr_bal", "cfwrdDrBal");
		this.hashFields.put("expn_cr_amt", "expnCrAmt");
		this.hashFields.put("eai_evnt_dt", "eaiEvntDt");
		this.hashFields.put("asa_rhq_cd", "asaRhqCd");
		this.hashFields.put("asa_prd_to_dt", "asaPrdToDt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("rev_clt_dr_amt", "revCltDrAmt");
		this.hashFields.put("asa_prd_fm_dt", "asaPrdFmDt");
		this.hashFields.put("rfnd_dr_amt", "rfndDrAmt");
		this.hashFields.put("rfnd_cr_amt", "rfndCrAmt");
		this.hashFields.put("bfwrd_dr_bal", "bfwrdDrBal");
		this.hashFields.put("ac_eff_dt", "acEffDt");
		this.hashFields.put("asa_apro_usr_id", "asaAproUsrId");
		this.hashFields.put("asa_no", "asaNo");
		this.hashFields.put("expn_eff_dt", "expnEffDt");
		this.hashFields.put("ac_dr_amt", "acDrAmt");
		this.hashFields.put("eff_yrmon", "effYrmon");
		this.hashFields.put("cfwrd_cr_bal", "cfwrdCrBal");
		this.hashFields.put("op_cd", "opCd");
		return this.hashFields;
	}
	
	
	/**
	 * Column Info
	 * @return asaClzDt
	 */
	public String getAsaClzDt() {
		return this.asaClzDt;
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
	 * @return asaCurrCd
	 */
	public String getAsaCurrCd() {
		return this.asaCurrCd;
	}
	
	/**
	 * Column Info
	 * @return remitCrAmt
	 */
	public String getRemitCrAmt() {
		return this.remitCrAmt;
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
	 * @return revCltCrAmt
	 */
	public String getRevCltCrAmt() {
		return this.revCltCrAmt;
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
	 * @return expnDrAmt
	 */
	public String getExpnDrAmt() {
		return this.expnDrAmt;
	}
	
	/**
	 * Column Info
	 * @return bfwrdCrBal
	 */
	public String getBfwrdCrBal() {
		return this.bfwrdCrBal;
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
	 * @return asaOfcCd
	 */
	public String getAsaOfcCd() {
		return this.asaOfcCd;
	}
	
	/**
	 * Column Info
	 * @return asaAproDt
	 */
	public String getAsaAproDt() {
		return this.asaAproDt;
	}
	
	/**
	 * Column Info
	 * @return revCltEffDt
	 */
	public String getRevCltEffDt() {
		return this.revCltEffDt;
	}
	
	/**
	 * Column Info
	 * @return rfndEffDt
	 */
	public String getRfndEffDt() {
		return this.rfndEffDt;
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
	 * @return remitDrAmt
	 */
	public String getRemitDrAmt() {
		return this.remitDrAmt;
	}
	
	/**
	 * Column Info
	 * @return remitEffDt
	 */
	public String getRemitEffDt() {
		return this.remitEffDt;
	}
	
	/**
	 * Column Info
	 * @return asaPrprUsrId
	 */
	public String getAsaPrprUsrId() {
		return this.asaPrprUsrId;
	}
	
	/**
	 * Column Info
	 * @return acCrAmt
	 */
	public String getAcCrAmt() {
		return this.acCrAmt;
	}
	
	/**
	 * Column Info
	 * @return cfwrdDrBal
	 */
	public String getCfwrdDrBal() {
		return this.cfwrdDrBal;
	}
	
	/**
	 * Column Info
	 * @return expnCrAmt
	 */
	public String getExpnCrAmt() {
		return this.expnCrAmt;
	}
	
	/**
	 * Column Info
	 * @return eaiEvntDt
	 */
	public String getEaiEvntDt() {
		return this.eaiEvntDt;
	}
	
	/**
	 * Column Info
	 * @return asaRhqCd
	 */
	public String getAsaRhqCd() {
		return this.asaRhqCd;
	}
	
	/**
	 * Column Info
	 * @return asaPrdToDt
	 */
	public String getAsaPrdToDt() {
		return this.asaPrdToDt;
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
	 * @return revCltDrAmt
	 */
	public String getRevCltDrAmt() {
		return this.revCltDrAmt;
	}
	
	/**
	 * Column Info
	 * @return asaPrdFmDt
	 */
	public String getAsaPrdFmDt() {
		return this.asaPrdFmDt;
	}
	
	/**
	 * Column Info
	 * @return rfndDrAmt
	 */
	public String getRfndDrAmt() {
		return this.rfndDrAmt;
	}
	
	/**
	 * Column Info
	 * @return rfndCrAmt
	 */
	public String getRfndCrAmt() {
		return this.rfndCrAmt;
	}
	
	/**
	 * Column Info
	 * @return bfwrdDrBal
	 */
	public String getBfwrdDrBal() {
		return this.bfwrdDrBal;
	}
	
	/**
	 * Column Info
	 * @return acEffDt
	 */
	public String getAcEffDt() {
		return this.acEffDt;
	}
	
	/**
	 * Column Info
	 * @return asaAproUsrId
	 */
	public String getAsaAproUsrId() {
		return this.asaAproUsrId;
	}
	
	/**
	 * Column Info
	 * @return asaNo
	 */
	public String getAsaNo() {
		return this.asaNo;
	}
	
	/**
	 * Column Info
	 * @return expnEffDt
	 */
	public String getExpnEffDt() {
		return this.expnEffDt;
	}
	
	/**
	 * Column Info
	 * @return acDrAmt
	 */
	public String getAcDrAmt() {
		return this.acDrAmt;
	}
	
	/**
	 * Column Info
	 * @return effYrmon
	 */
	public String getEffYrmon() {
		return this.effYrmon;
	}
	
	/**
	 * Column Info
	 * @return cfwrdCrBal
	 */
	public String getCfwrdCrBal() {
		return this.cfwrdCrBal;
	}
	
	public String getOpCd() {
    	return opCd;
    }

	/**
	 * Column Info
	 * @param asaClzDt
	 */
	public void setAsaClzDt(String asaClzDt) {
		this.asaClzDt = asaClzDt;
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
	 * @param asaCurrCd
	 */
	public void setAsaCurrCd(String asaCurrCd) {
		this.asaCurrCd = asaCurrCd;
	}
	
	/**
	 * Column Info
	 * @param remitCrAmt
	 */
	public void setRemitCrAmt(String remitCrAmt) {
		this.remitCrAmt = remitCrAmt;
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
	 * @param revCltCrAmt
	 */
	public void setRevCltCrAmt(String revCltCrAmt) {
		this.revCltCrAmt = revCltCrAmt;
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
	 * @param expnDrAmt
	 */
	public void setExpnDrAmt(String expnDrAmt) {
		this.expnDrAmt = expnDrAmt;
	}
	
	/**
	 * Column Info
	 * @param bfwrdCrBal
	 */
	public void setBfwrdCrBal(String bfwrdCrBal) {
		this.bfwrdCrBal = bfwrdCrBal;
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
	 * @param asaOfcCd
	 */
	public void setAsaOfcCd(String asaOfcCd) {
		this.asaOfcCd = asaOfcCd;
	}
	
	/**
	 * Column Info
	 * @param asaAproDt
	 */
	public void setAsaAproDt(String asaAproDt) {
		this.asaAproDt = asaAproDt;
	}
	
	/**
	 * Column Info
	 * @param revCltEffDt
	 */
	public void setRevCltEffDt(String revCltEffDt) {
		this.revCltEffDt = revCltEffDt;
	}
	
	/**
	 * Column Info
	 * @param rfndEffDt
	 */
	public void setRfndEffDt(String rfndEffDt) {
		this.rfndEffDt = rfndEffDt;
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
	 * @param remitDrAmt
	 */
	public void setRemitDrAmt(String remitDrAmt) {
		this.remitDrAmt = remitDrAmt;
	}
	
	/**
	 * Column Info
	 * @param remitEffDt
	 */
	public void setRemitEffDt(String remitEffDt) {
		this.remitEffDt = remitEffDt;
	}
	
	/**
	 * Column Info
	 * @param asaPrprUsrId
	 */
	public void setAsaPrprUsrId(String asaPrprUsrId) {
		this.asaPrprUsrId = asaPrprUsrId;
	}
	
	/**
	 * Column Info
	 * @param acCrAmt
	 */
	public void setAcCrAmt(String acCrAmt) {
		this.acCrAmt = acCrAmt;
	}
	
	/**
	 * Column Info
	 * @param cfwrdDrBal
	 */
	public void setCfwrdDrBal(String cfwrdDrBal) {
		this.cfwrdDrBal = cfwrdDrBal;
	}
	
	/**
	 * Column Info
	 * @param expnCrAmt
	 */
	public void setExpnCrAmt(String expnCrAmt) {
		this.expnCrAmt = expnCrAmt;
	}
	
	/**
	 * Column Info
	 * @param eaiEvntDt
	 */
	public void setEaiEvntDt(String eaiEvntDt) {
		this.eaiEvntDt = eaiEvntDt;
	}
	
	/**
	 * Column Info
	 * @param asaRhqCd
	 */
	public void setAsaRhqCd(String asaRhqCd) {
		this.asaRhqCd = asaRhqCd;
	}
	
	/**
	 * Column Info
	 * @param asaPrdToDt
	 */
	public void setAsaPrdToDt(String asaPrdToDt) {
		this.asaPrdToDt = asaPrdToDt;
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
	 * @param revCltDrAmt
	 */
	public void setRevCltDrAmt(String revCltDrAmt) {
		this.revCltDrAmt = revCltDrAmt;
	}
	
	/**
	 * Column Info
	 * @param asaPrdFmDt
	 */
	public void setAsaPrdFmDt(String asaPrdFmDt) {
		this.asaPrdFmDt = asaPrdFmDt;
	}
	
	/**
	 * Column Info
	 * @param rfndDrAmt
	 */
	public void setRfndDrAmt(String rfndDrAmt) {
		this.rfndDrAmt = rfndDrAmt;
	}
	
	/**
	 * Column Info
	 * @param rfndCrAmt
	 */
	public void setRfndCrAmt(String rfndCrAmt) {
		this.rfndCrAmt = rfndCrAmt;
	}
	
	/**
	 * Column Info
	 * @param bfwrdDrBal
	 */
	public void setBfwrdDrBal(String bfwrdDrBal) {
		this.bfwrdDrBal = bfwrdDrBal;
	}
	
	/**
	 * Column Info
	 * @param acEffDt
	 */
	public void setAcEffDt(String acEffDt) {
		this.acEffDt = acEffDt;
	}
	
	/**
	 * Column Info
	 * @param asaAproUsrId
	 */
	public void setAsaAproUsrId(String asaAproUsrId) {
		this.asaAproUsrId = asaAproUsrId;
	}
	
	/**
	 * Column Info
	 * @param asaNo
	 */
	public void setAsaNo(String asaNo) {
		this.asaNo = asaNo;
	}
	
	/**
	 * Column Info
	 * @param expnEffDt
	 */
	public void setExpnEffDt(String expnEffDt) {
		this.expnEffDt = expnEffDt;
	}
	
	/**
	 * Column Info
	 * @param acDrAmt
	 */
	public void setAcDrAmt(String acDrAmt) {
		this.acDrAmt = acDrAmt;
	}
	
	/**
	 * Column Info
	 * @param effYrmon
	 */
	public void setEffYrmon(String effYrmon) {
		this.effYrmon = effYrmon;
	}
	
	/**
	 * Column Info
	 * @param cfwrdCrBal
	 */
	public void setCfwrdCrBal(String cfwrdCrBal) {
		this.cfwrdCrBal = cfwrdCrBal;
	}
	
	public void setOpCd(String opCd) {
    	this.opCd = opCd;
    }
	
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setAsaClzDt(JSPUtil.getParameter(request, "asa_clz_dt", ""));
		setDeltFlg(JSPUtil.getParameter(request, "delt_flg", ""));
		setAsaCurrCd(JSPUtil.getParameter(request, "asa_curr_cd", ""));
		setRemitCrAmt(JSPUtil.getParameter(request, "remit_cr_amt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setRevCltCrAmt(JSPUtil.getParameter(request, "rev_clt_cr_amt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setExpnDrAmt(JSPUtil.getParameter(request, "expn_dr_amt", ""));
		setBfwrdCrBal(JSPUtil.getParameter(request, "bfwrd_cr_bal", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setAsaOfcCd(JSPUtil.getParameter(request, "asa_ofc_cd", ""));
		setAsaAproDt(JSPUtil.getParameter(request, "asa_apro_dt", ""));
		setRevCltEffDt(JSPUtil.getParameter(request, "rev_clt_eff_dt", ""));
		setRfndEffDt(JSPUtil.getParameter(request, "rfnd_eff_dt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setRemitDrAmt(JSPUtil.getParameter(request, "remit_dr_amt", ""));
		setRemitEffDt(JSPUtil.getParameter(request, "remit_eff_dt", ""));
		setAsaPrprUsrId(JSPUtil.getParameter(request, "asa_prpr_usr_id", ""));
		setAcCrAmt(JSPUtil.getParameter(request, "ac_cr_amt", ""));
		setCfwrdDrBal(JSPUtil.getParameter(request, "cfwrd_dr_bal", ""));
		setExpnCrAmt(JSPUtil.getParameter(request, "expn_cr_amt", ""));
		setEaiEvntDt(JSPUtil.getParameter(request, "eai_evnt_dt", ""));
		setAsaRhqCd(JSPUtil.getParameter(request, "asa_rhq_cd", ""));
		setAsaPrdToDt(JSPUtil.getParameter(request, "asa_prd_to_dt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setRevCltDrAmt(JSPUtil.getParameter(request, "rev_clt_dr_amt", ""));
		setAsaPrdFmDt(JSPUtil.getParameter(request, "asa_prd_fm_dt", ""));
		setRfndDrAmt(JSPUtil.getParameter(request, "rfnd_dr_amt", ""));
		setRfndCrAmt(JSPUtil.getParameter(request, "rfnd_cr_amt", ""));
		setBfwrdDrBal(JSPUtil.getParameter(request, "bfwrd_dr_bal", ""));
		setAcEffDt(JSPUtil.getParameter(request, "ac_eff_dt", ""));
		setAsaAproUsrId(JSPUtil.getParameter(request, "asa_apro_usr_id", ""));
		setAsaNo(JSPUtil.getParameter(request, "asa_no", ""));
		setExpnEffDt(JSPUtil.getParameter(request, "expn_eff_dt", ""));
		setAcDrAmt(JSPUtil.getParameter(request, "ac_dr_amt", ""));
		setEffYrmon(JSPUtil.getParameter(request, "eff_yrmon", ""));
		setCfwrdCrBal(JSPUtil.getParameter(request, "cfwrd_cr_bal", ""));
		setOpCd(JSPUtil.getParameter(request, "op_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return ArAgnStmtAgmtVO[]
	 */
	public ArAgnStmtAgmtVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return ArAgnStmtAgmtVO[]
	 */
	public ArAgnStmtAgmtVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		ArAgnStmtAgmtVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] asaClzDt = (JSPUtil.getParameter(request, prefix	+ "asa_clz_dt", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] asaCurrCd = (JSPUtil.getParameter(request, prefix	+ "asa_curr_cd", length));
			String[] remitCrAmt = (JSPUtil.getParameter(request, prefix	+ "remit_cr_amt", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] revCltCrAmt = (JSPUtil.getParameter(request, prefix	+ "rev_clt_cr_amt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] expnDrAmt = (JSPUtil.getParameter(request, prefix	+ "expn_dr_amt", length));
			String[] bfwrdCrBal = (JSPUtil.getParameter(request, prefix	+ "bfwrd_cr_bal", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] asaOfcCd = (JSPUtil.getParameter(request, prefix	+ "asa_ofc_cd", length));
			String[] asaAproDt = (JSPUtil.getParameter(request, prefix	+ "asa_apro_dt", length));
			String[] revCltEffDt = (JSPUtil.getParameter(request, prefix	+ "rev_clt_eff_dt", length));
			String[] rfndEffDt = (JSPUtil.getParameter(request, prefix	+ "rfnd_eff_dt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] remitDrAmt = (JSPUtil.getParameter(request, prefix	+ "remit_dr_amt", length));
			String[] remitEffDt = (JSPUtil.getParameter(request, prefix	+ "remit_eff_dt", length));
			String[] asaPrprUsrId = (JSPUtil.getParameter(request, prefix	+ "asa_prpr_usr_id", length));
			String[] acCrAmt = (JSPUtil.getParameter(request, prefix	+ "ac_cr_amt", length));
			String[] cfwrdDrBal = (JSPUtil.getParameter(request, prefix	+ "cfwrd_dr_bal", length));
			String[] expnCrAmt = (JSPUtil.getParameter(request, prefix	+ "expn_cr_amt", length));
			String[] eaiEvntDt = (JSPUtil.getParameter(request, prefix	+ "eai_evnt_dt", length));
			String[] asaRhqCd = (JSPUtil.getParameter(request, prefix	+ "asa_rhq_cd", length));
			String[] asaPrdToDt = (JSPUtil.getParameter(request, prefix	+ "asa_prd_to_dt", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] revCltDrAmt = (JSPUtil.getParameter(request, prefix	+ "rev_clt_dr_amt", length));
			String[] asaPrdFmDt = (JSPUtil.getParameter(request, prefix	+ "asa_prd_fm_dt", length));
			String[] rfndDrAmt = (JSPUtil.getParameter(request, prefix	+ "rfnd_dr_amt", length));
			String[] rfndCrAmt = (JSPUtil.getParameter(request, prefix	+ "rfnd_cr_amt", length));
			String[] bfwrdDrBal = (JSPUtil.getParameter(request, prefix	+ "bfwrd_dr_bal", length));
			String[] acEffDt = (JSPUtil.getParameter(request, prefix	+ "ac_eff_dt", length));
			String[] asaAproUsrId = (JSPUtil.getParameter(request, prefix	+ "asa_apro_usr_id", length));
			String[] asaNo = (JSPUtil.getParameter(request, prefix	+ "asa_no", length));
			String[] expnEffDt = (JSPUtil.getParameter(request, prefix	+ "expn_eff_dt", length));
			String[] acDrAmt = (JSPUtil.getParameter(request, prefix	+ "ac_dr_amt", length));
			String[] effYrmon = (JSPUtil.getParameter(request, prefix	+ "eff_yrmon", length));
			String[] cfwrdCrBal = (JSPUtil.getParameter(request, prefix	+ "cfwrd_cr_bal", length));
			String[] opCd = (JSPUtil.getParameter(request, prefix	+ "op_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new ArAgnStmtAgmtVO();
				if (asaClzDt[i] != null)
					model.setAsaClzDt(asaClzDt[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (asaCurrCd[i] != null)
					model.setAsaCurrCd(asaCurrCd[i]);
				if (remitCrAmt[i] != null)
					model.setRemitCrAmt(remitCrAmt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (revCltCrAmt[i] != null)
					model.setRevCltCrAmt(revCltCrAmt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (expnDrAmt[i] != null)
					model.setExpnDrAmt(expnDrAmt[i]);
				if (bfwrdCrBal[i] != null)
					model.setBfwrdCrBal(bfwrdCrBal[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (asaOfcCd[i] != null)
					model.setAsaOfcCd(asaOfcCd[i]);
				if (asaAproDt[i] != null)
					model.setAsaAproDt(asaAproDt[i]);
				if (revCltEffDt[i] != null)
					model.setRevCltEffDt(revCltEffDt[i]);
				if (rfndEffDt[i] != null)
					model.setRfndEffDt(rfndEffDt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (remitDrAmt[i] != null)
					model.setRemitDrAmt(remitDrAmt[i]);
				if (remitEffDt[i] != null)
					model.setRemitEffDt(remitEffDt[i]);
				if (asaPrprUsrId[i] != null)
					model.setAsaPrprUsrId(asaPrprUsrId[i]);
				if (acCrAmt[i] != null)
					model.setAcCrAmt(acCrAmt[i]);
				if (cfwrdDrBal[i] != null)
					model.setCfwrdDrBal(cfwrdDrBal[i]);
				if (expnCrAmt[i] != null)
					model.setExpnCrAmt(expnCrAmt[i]);
				if (eaiEvntDt[i] != null)
					model.setEaiEvntDt(eaiEvntDt[i]);
				if (asaRhqCd[i] != null)
					model.setAsaRhqCd(asaRhqCd[i]);
				if (asaPrdToDt[i] != null)
					model.setAsaPrdToDt(asaPrdToDt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (revCltDrAmt[i] != null)
					model.setRevCltDrAmt(revCltDrAmt[i]);
				if (asaPrdFmDt[i] != null)
					model.setAsaPrdFmDt(asaPrdFmDt[i]);
				if (rfndDrAmt[i] != null)
					model.setRfndDrAmt(rfndDrAmt[i]);
				if (rfndCrAmt[i] != null)
					model.setRfndCrAmt(rfndCrAmt[i]);
				if (bfwrdDrBal[i] != null)
					model.setBfwrdDrBal(bfwrdDrBal[i]);
				if (acEffDt[i] != null)
					model.setAcEffDt(acEffDt[i]);
				if (asaAproUsrId[i] != null)
					model.setAsaAproUsrId(asaAproUsrId[i]);
				if (asaNo[i] != null)
					model.setAsaNo(asaNo[i]);
				if (expnEffDt[i] != null)
					model.setExpnEffDt(expnEffDt[i]);
				if (acDrAmt[i] != null)
					model.setAcDrAmt(acDrAmt[i]);
				if (effYrmon[i] != null)
					model.setEffYrmon(effYrmon[i]);
				if (cfwrdCrBal[i] != null)
					model.setCfwrdCrBal(cfwrdCrBal[i]);
				if (opCd[i] != null)
					model.setOpCd(opCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getArAgnStmtAgmtVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return ArAgnStmtAgmtVO[]
	 */
	public ArAgnStmtAgmtVO[] getArAgnStmtAgmtVOs(){
		ArAgnStmtAgmtVO[] vos = (ArAgnStmtAgmtVO[])models.toArray(new ArAgnStmtAgmtVO[models.size()]);
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
		this.asaClzDt = this.asaClzDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.asaCurrCd = this.asaCurrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.remitCrAmt = this.remitCrAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.revCltCrAmt = this.revCltCrAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.expnDrAmt = this.expnDrAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bfwrdCrBal = this.bfwrdCrBal .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.asaOfcCd = this.asaOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.asaAproDt = this.asaAproDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.revCltEffDt = this.revCltEffDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rfndEffDt = this.rfndEffDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.remitDrAmt = this.remitDrAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.remitEffDt = this.remitEffDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.asaPrprUsrId = this.asaPrprUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acCrAmt = this.acCrAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cfwrdDrBal = this.cfwrdDrBal .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.expnCrAmt = this.expnCrAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eaiEvntDt = this.eaiEvntDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.asaRhqCd = this.asaRhqCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.asaPrdToDt = this.asaPrdToDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.revCltDrAmt = this.revCltDrAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.asaPrdFmDt = this.asaPrdFmDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rfndDrAmt = this.rfndDrAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rfndCrAmt = this.rfndCrAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bfwrdDrBal = this.bfwrdDrBal .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acEffDt = this.acEffDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.asaAproUsrId = this.asaAproUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.asaNo = this.asaNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.expnEffDt = this.expnEffDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acDrAmt = this.acDrAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.effYrmon = this.effYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cfwrdCrBal = this.cfwrdCrBal .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.opCd = this.opCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
