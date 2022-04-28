/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : MstCntrLotVO.java
*@FileTitle : MstCntrLotVO
*Open Issues :
*Change history :
*@LastModifyDate : 2010.10.22
*@LastModifier : 남궁진호
*@LastVersion : 1.0
* 2010.10.22 남궁진호 
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
 * @author 남궁진호
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class MstCntrLotVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<MstCntrLotVO> models = new ArrayList<MstCntrLotVO>();
	
	/* Column Info */
	private String cntrAqzAmt = null;
	/* Column Info */
	private String cntrSpecNo = null;
	/* Column Info */
	private String fmSerNo = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String lotPlnYr = null;
	/* Column Info */
	private String lotSeq = null;
	/* Column Info */
	private String minTemp = null;
	/* Column Info */
	private String lotLocCd = null;
	/* Column Info */
	private String rfMdlNm = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String lotCntrPfxCd = null;
	/* Column Info */
	private String certiNo = null;
	/* Column Info */
	private String cntrTpszCd = null;
	/* Column Info */
	private String agmtCtyCd = null;
	/* Column Info */
	private String aproTirNo = null;
	/* Column Info */
	private String aproUicNo = null;
	/* Column Info */
	private String toSerNo = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String mftVndrSeq = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String acctQtyMzdCd = null;
	/* Column Info */
	private String agmtSeq = null;
	/* Column Info */
	private String faIfGrpSeqNo = null;
	/* Column Info */
	private String aproTctNo = null;
	/* Column Info */
	private String plstFlrFlg = null;
	/* Column Info */
	private String deYrmon = null;
	/* Column Info */
	private String maxTemp = null;
	/* Column Info */
	private String faIfGrpStsCd = null;
	/* Column Info */
	private String cntrInvstNo = null;
	/* Column Info */
	private String cntrCurrCd = null;
	/* Column Info */
	private String mftDt = null;
	/* Column Info */
	private String rfMkrSeq = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String diffRmk = null;
	/* Column Info */
	private String fctrySpecNo = null;
	/* Column Info */
	private String aproCscNo = null;
	/* Column Info */
	private String faIfDt = null;
	/* Column Info */
	private String rfRfrNo = null;
	/* Column Info */
	private String rfTpCd = null;
	/* Column Info */
	private String cntrHngrRckCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public MstCntrLotVO() {}

	public MstCntrLotVO(String ibflag, String pagerows, String lotPlnYr, String lotLocCd, String cntrTpszCd, String lotSeq, String mftVndrSeq, String cntrSpecNo, String fctrySpecNo, String mftDt, String lotCntrPfxCd, String fmSerNo, String toSerNo, String deYrmon, String certiNo, String aproCscNo, String aproTirNo, String aproUicNo, String aproTctNo, String plstFlrFlg, String cntrHngrRckCd, String rfTpCd, String agmtCtyCd, String agmtSeq, String diffRmk, String cntrCurrCd, String cntrAqzAmt, String cntrInvstNo, String acctQtyMzdCd, String faIfGrpSeqNo, String faIfGrpStsCd, String faIfDt, String creUsrId, String creDt, String updUsrId, String updDt, String rfMkrSeq, String rfMdlNm, String rfRfrNo, String minTemp, String maxTemp) {
		this.cntrAqzAmt = cntrAqzAmt;
		this.cntrSpecNo = cntrSpecNo;
		this.fmSerNo = fmSerNo;
		this.creDt = creDt;
		this.lotPlnYr = lotPlnYr;
		this.lotSeq = lotSeq;
		this.minTemp = minTemp;
		this.lotLocCd = lotLocCd;
		this.rfMdlNm = rfMdlNm;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.lotCntrPfxCd = lotCntrPfxCd;
		this.certiNo = certiNo;
		this.cntrTpszCd = cntrTpszCd;
		this.agmtCtyCd = agmtCtyCd;
		this.aproTirNo = aproTirNo;
		this.aproUicNo = aproUicNo;
		this.toSerNo = toSerNo;
		this.updUsrId = updUsrId;
		this.mftVndrSeq = mftVndrSeq;
		this.updDt = updDt;
		this.acctQtyMzdCd = acctQtyMzdCd;
		this.agmtSeq = agmtSeq;
		this.faIfGrpSeqNo = faIfGrpSeqNo;
		this.aproTctNo = aproTctNo;
		this.plstFlrFlg = plstFlrFlg;
		this.deYrmon = deYrmon;
		this.maxTemp = maxTemp;
		this.faIfGrpStsCd = faIfGrpStsCd;
		this.cntrInvstNo = cntrInvstNo;
		this.cntrCurrCd = cntrCurrCd;
		this.mftDt = mftDt;
		this.rfMkrSeq = rfMkrSeq;
		this.creUsrId = creUsrId;
		this.diffRmk = diffRmk;
		this.fctrySpecNo = fctrySpecNo;
		this.aproCscNo = aproCscNo;
		this.faIfDt = faIfDt;
		this.rfRfrNo = rfRfrNo;
		this.rfTpCd = rfTpCd;
		this.cntrHngrRckCd = cntrHngrRckCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("cntr_aqz_amt", getCntrAqzAmt());
		this.hashColumns.put("cntr_spec_no", getCntrSpecNo());
		this.hashColumns.put("fm_ser_no", getFmSerNo());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("lot_pln_yr", getLotPlnYr());
		this.hashColumns.put("lot_seq", getLotSeq());
		this.hashColumns.put("min_temp", getMinTemp());
		this.hashColumns.put("lot_loc_cd", getLotLocCd());
		this.hashColumns.put("rf_mdl_nm", getRfMdlNm());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("lot_cntr_pfx_cd", getLotCntrPfxCd());
		this.hashColumns.put("certi_no", getCertiNo());
		this.hashColumns.put("cntr_tpsz_cd", getCntrTpszCd());
		this.hashColumns.put("agmt_cty_cd", getAgmtCtyCd());
		this.hashColumns.put("apro_tir_no", getAproTirNo());
		this.hashColumns.put("apro_uic_no", getAproUicNo());
		this.hashColumns.put("to_ser_no", getToSerNo());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("mft_vndr_seq", getMftVndrSeq());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("acct_qty_mzd_cd", getAcctQtyMzdCd());
		this.hashColumns.put("agmt_seq", getAgmtSeq());
		this.hashColumns.put("fa_if_grp_seq_no", getFaIfGrpSeqNo());
		this.hashColumns.put("apro_tct_no", getAproTctNo());
		this.hashColumns.put("plst_flr_flg", getPlstFlrFlg());
		this.hashColumns.put("de_yrmon", getDeYrmon());
		this.hashColumns.put("max_temp", getMaxTemp());
		this.hashColumns.put("fa_if_grp_sts_cd", getFaIfGrpStsCd());
		this.hashColumns.put("cntr_invst_no", getCntrInvstNo());
		this.hashColumns.put("cntr_curr_cd", getCntrCurrCd());
		this.hashColumns.put("mft_dt", getMftDt());
		this.hashColumns.put("rf_mkr_seq", getRfMkrSeq());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("diff_rmk", getDiffRmk());
		this.hashColumns.put("fctry_spec_no", getFctrySpecNo());
		this.hashColumns.put("apro_csc_no", getAproCscNo());
		this.hashColumns.put("fa_if_dt", getFaIfDt());
		this.hashColumns.put("rf_rfr_no", getRfRfrNo());
		this.hashColumns.put("rf_tp_cd", getRfTpCd());
		this.hashColumns.put("cntr_hngr_rck_cd", getCntrHngrRckCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("cntr_aqz_amt", "cntrAqzAmt");
		this.hashFields.put("cntr_spec_no", "cntrSpecNo");
		this.hashFields.put("fm_ser_no", "fmSerNo");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("lot_pln_yr", "lotPlnYr");
		this.hashFields.put("lot_seq", "lotSeq");
		this.hashFields.put("min_temp", "minTemp");
		this.hashFields.put("lot_loc_cd", "lotLocCd");
		this.hashFields.put("rf_mdl_nm", "rfMdlNm");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("lot_cntr_pfx_cd", "lotCntrPfxCd");
		this.hashFields.put("certi_no", "certiNo");
		this.hashFields.put("cntr_tpsz_cd", "cntrTpszCd");
		this.hashFields.put("agmt_cty_cd", "agmtCtyCd");
		this.hashFields.put("apro_tir_no", "aproTirNo");
		this.hashFields.put("apro_uic_no", "aproUicNo");
		this.hashFields.put("to_ser_no", "toSerNo");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("mft_vndr_seq", "mftVndrSeq");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("acct_qty_mzd_cd", "acctQtyMzdCd");
		this.hashFields.put("agmt_seq", "agmtSeq");
		this.hashFields.put("fa_if_grp_seq_no", "faIfGrpSeqNo");
		this.hashFields.put("apro_tct_no", "aproTctNo");
		this.hashFields.put("plst_flr_flg", "plstFlrFlg");
		this.hashFields.put("de_yrmon", "deYrmon");
		this.hashFields.put("max_temp", "maxTemp");
		this.hashFields.put("fa_if_grp_sts_cd", "faIfGrpStsCd");
		this.hashFields.put("cntr_invst_no", "cntrInvstNo");
		this.hashFields.put("cntr_curr_cd", "cntrCurrCd");
		this.hashFields.put("mft_dt", "mftDt");
		this.hashFields.put("rf_mkr_seq", "rfMkrSeq");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("diff_rmk", "diffRmk");
		this.hashFields.put("fctry_spec_no", "fctrySpecNo");
		this.hashFields.put("apro_csc_no", "aproCscNo");
		this.hashFields.put("fa_if_dt", "faIfDt");
		this.hashFields.put("rf_rfr_no", "rfRfrNo");
		this.hashFields.put("rf_tp_cd", "rfTpCd");
		this.hashFields.put("cntr_hngr_rck_cd", "cntrHngrRckCd");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return cntrAqzAmt
	 */
	public String getCntrAqzAmt() {
		return this.cntrAqzAmt;
	}
	
	/**
	 * Column Info
	 * @return cntrSpecNo
	 */
	public String getCntrSpecNo() {
		return this.cntrSpecNo;
	}
	
	/**
	 * Column Info
	 * @return fmSerNo
	 */
	public String getFmSerNo() {
		return this.fmSerNo;
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
	 * @return lotPlnYr
	 */
	public String getLotPlnYr() {
		return this.lotPlnYr;
	}
	
	/**
	 * Column Info
	 * @return lotSeq
	 */
	public String getLotSeq() {
		return this.lotSeq;
	}
	
	/**
	 * Column Info
	 * @return minTemp
	 */
	public String getMinTemp() {
		return this.minTemp;
	}
	
	/**
	 * Column Info
	 * @return lotLocCd
	 */
	public String getLotLocCd() {
		return this.lotLocCd;
	}
	
	/**
	 * Column Info
	 * @return rfMdlNm
	 */
	public String getRfMdlNm() {
		return this.rfMdlNm;
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
	 * @return lotCntrPfxCd
	 */
	public String getLotCntrPfxCd() {
		return this.lotCntrPfxCd;
	}
	
	/**
	 * Column Info
	 * @return certiNo
	 */
	public String getCertiNo() {
		return this.certiNo;
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
	 * @return agmtCtyCd
	 */
	public String getAgmtCtyCd() {
		return this.agmtCtyCd;
	}
	
	/**
	 * Column Info
	 * @return aproTirNo
	 */
	public String getAproTirNo() {
		return this.aproTirNo;
	}
	
	/**
	 * Column Info
	 * @return aproUicNo
	 */
	public String getAproUicNo() {
		return this.aproUicNo;
	}
	
	/**
	 * Column Info
	 * @return toSerNo
	 */
	public String getToSerNo() {
		return this.toSerNo;
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
	 * @return mftVndrSeq
	 */
	public String getMftVndrSeq() {
		return this.mftVndrSeq;
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
	 * @return acctQtyMzdCd
	 */
	public String getAcctQtyMzdCd() {
		return this.acctQtyMzdCd;
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
	 * @return faIfGrpSeqNo
	 */
	public String getFaIfGrpSeqNo() {
		return this.faIfGrpSeqNo;
	}
	
	/**
	 * Column Info
	 * @return aproTctNo
	 */
	public String getAproTctNo() {
		return this.aproTctNo;
	}
	
	/**
	 * Column Info
	 * @return plstFlrFlg
	 */
	public String getPlstFlrFlg() {
		return this.plstFlrFlg;
	}
	
	/**
	 * Column Info
	 * @return deYrmon
	 */
	public String getDeYrmon() {
		return this.deYrmon;
	}
	
	/**
	 * Column Info
	 * @return maxTemp
	 */
	public String getMaxTemp() {
		return this.maxTemp;
	}
	
	/**
	 * Column Info
	 * @return faIfGrpStsCd
	 */
	public String getFaIfGrpStsCd() {
		return this.faIfGrpStsCd;
	}
	
	/**
	 * Column Info
	 * @return cntrInvstNo
	 */
	public String getCntrInvstNo() {
		return this.cntrInvstNo;
	}
	
	/**
	 * Column Info
	 * @return cntrCurrCd
	 */
	public String getCntrCurrCd() {
		return this.cntrCurrCd;
	}
	
	/**
	 * Column Info
	 * @return mftDt
	 */
	public String getMftDt() {
		return this.mftDt;
	}
	
	/**
	 * Column Info
	 * @return rfMkrSeq
	 */
	public String getRfMkrSeq() {
		return this.rfMkrSeq;
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
	 * @return fctrySpecNo
	 */
	public String getFctrySpecNo() {
		return this.fctrySpecNo;
	}
	
	/**
	 * Column Info
	 * @return aproCscNo
	 */
	public String getAproCscNo() {
		return this.aproCscNo;
	}
	
	/**
	 * Column Info
	 * @return faIfDt
	 */
	public String getFaIfDt() {
		return this.faIfDt;
	}
	
	/**
	 * Column Info
	 * @return rfRfrNo
	 */
	public String getRfRfrNo() {
		return this.rfRfrNo;
	}
	
	/**
	 * Column Info
	 * @return rfTpCd
	 */
	public String getRfTpCd() {
		return this.rfTpCd;
	}
	
	/**
	 * Column Info
	 * @return cntrHngrRckCd
	 */
	public String getCntrHngrRckCd() {
		return this.cntrHngrRckCd;
	}
	

	/**
	 * Column Info
	 * @param cntrAqzAmt
	 */
	public void setCntrAqzAmt(String cntrAqzAmt) {
		this.cntrAqzAmt = cntrAqzAmt;
	}
	
	/**
	 * Column Info
	 * @param cntrSpecNo
	 */
	public void setCntrSpecNo(String cntrSpecNo) {
		this.cntrSpecNo = cntrSpecNo;
	}
	
	/**
	 * Column Info
	 * @param fmSerNo
	 */
	public void setFmSerNo(String fmSerNo) {
		this.fmSerNo = fmSerNo;
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
	 * @param lotPlnYr
	 */
	public void setLotPlnYr(String lotPlnYr) {
		this.lotPlnYr = lotPlnYr;
	}
	
	/**
	 * Column Info
	 * @param lotSeq
	 */
	public void setLotSeq(String lotSeq) {
		this.lotSeq = lotSeq;
	}
	
	/**
	 * Column Info
	 * @param minTemp
	 */
	public void setMinTemp(String minTemp) {
		this.minTemp = minTemp;
	}
	
	/**
	 * Column Info
	 * @param lotLocCd
	 */
	public void setLotLocCd(String lotLocCd) {
		this.lotLocCd = lotLocCd;
	}
	
	/**
	 * Column Info
	 * @param rfMdlNm
	 */
	public void setRfMdlNm(String rfMdlNm) {
		this.rfMdlNm = rfMdlNm;
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
	 * @param lotCntrPfxCd
	 */
	public void setLotCntrPfxCd(String lotCntrPfxCd) {
		this.lotCntrPfxCd = lotCntrPfxCd;
	}
	
	/**
	 * Column Info
	 * @param certiNo
	 */
	public void setCertiNo(String certiNo) {
		this.certiNo = certiNo;
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
	 * @param agmtCtyCd
	 */
	public void setAgmtCtyCd(String agmtCtyCd) {
		this.agmtCtyCd = agmtCtyCd;
	}
	
	/**
	 * Column Info
	 * @param aproTirNo
	 */
	public void setAproTirNo(String aproTirNo) {
		this.aproTirNo = aproTirNo;
	}
	
	/**
	 * Column Info
	 * @param aproUicNo
	 */
	public void setAproUicNo(String aproUicNo) {
		this.aproUicNo = aproUicNo;
	}
	
	/**
	 * Column Info
	 * @param toSerNo
	 */
	public void setToSerNo(String toSerNo) {
		this.toSerNo = toSerNo;
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
	 * @param mftVndrSeq
	 */
	public void setMftVndrSeq(String mftVndrSeq) {
		this.mftVndrSeq = mftVndrSeq;
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
	 * @param acctQtyMzdCd
	 */
	public void setAcctQtyMzdCd(String acctQtyMzdCd) {
		this.acctQtyMzdCd = acctQtyMzdCd;
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
	 * @param faIfGrpSeqNo
	 */
	public void setFaIfGrpSeqNo(String faIfGrpSeqNo) {
		this.faIfGrpSeqNo = faIfGrpSeqNo;
	}
	
	/**
	 * Column Info
	 * @param aproTctNo
	 */
	public void setAproTctNo(String aproTctNo) {
		this.aproTctNo = aproTctNo;
	}
	
	/**
	 * Column Info
	 * @param plstFlrFlg
	 */
	public void setPlstFlrFlg(String plstFlrFlg) {
		this.plstFlrFlg = plstFlrFlg;
	}
	
	/**
	 * Column Info
	 * @param deYrmon
	 */
	public void setDeYrmon(String deYrmon) {
		this.deYrmon = deYrmon;
	}
	
	/**
	 * Column Info
	 * @param maxTemp
	 */
	public void setMaxTemp(String maxTemp) {
		this.maxTemp = maxTemp;
	}
	
	/**
	 * Column Info
	 * @param faIfGrpStsCd
	 */
	public void setFaIfGrpStsCd(String faIfGrpStsCd) {
		this.faIfGrpStsCd = faIfGrpStsCd;
	}
	
	/**
	 * Column Info
	 * @param cntrInvstNo
	 */
	public void setCntrInvstNo(String cntrInvstNo) {
		this.cntrInvstNo = cntrInvstNo;
	}
	
	/**
	 * Column Info
	 * @param cntrCurrCd
	 */
	public void setCntrCurrCd(String cntrCurrCd) {
		this.cntrCurrCd = cntrCurrCd;
	}
	
	/**
	 * Column Info
	 * @param mftDt
	 */
	public void setMftDt(String mftDt) {
		this.mftDt = mftDt;
	}
	
	/**
	 * Column Info
	 * @param rfMkrSeq
	 */
	public void setRfMkrSeq(String rfMkrSeq) {
		this.rfMkrSeq = rfMkrSeq;
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
	 * @param fctrySpecNo
	 */
	public void setFctrySpecNo(String fctrySpecNo) {
		this.fctrySpecNo = fctrySpecNo;
	}
	
	/**
	 * Column Info
	 * @param aproCscNo
	 */
	public void setAproCscNo(String aproCscNo) {
		this.aproCscNo = aproCscNo;
	}
	
	/**
	 * Column Info
	 * @param faIfDt
	 */
	public void setFaIfDt(String faIfDt) {
		this.faIfDt = faIfDt;
	}
	
	/**
	 * Column Info
	 * @param rfRfrNo
	 */
	public void setRfRfrNo(String rfRfrNo) {
		this.rfRfrNo = rfRfrNo;
	}
	
	/**
	 * Column Info
	 * @param rfTpCd
	 */
	public void setRfTpCd(String rfTpCd) {
		this.rfTpCd = rfTpCd;
	}
	
	/**
	 * Column Info
	 * @param cntrHngrRckCd
	 */
	public void setCntrHngrRckCd(String cntrHngrRckCd) {
		this.cntrHngrRckCd = cntrHngrRckCd;
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
		setCntrAqzAmt(JSPUtil.getParameter(request, prefix + "cntr_aqz_amt", ""));
		setCntrSpecNo(JSPUtil.getParameter(request, prefix + "cntr_spec_no", ""));
		setFmSerNo(JSPUtil.getParameter(request, prefix + "fm_ser_no", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setLotPlnYr(JSPUtil.getParameter(request, prefix + "lot_pln_yr", ""));
		setLotSeq(JSPUtil.getParameter(request, prefix + "lot_seq", ""));
		setMinTemp(JSPUtil.getParameter(request, prefix + "min_temp", ""));
		setLotLocCd(JSPUtil.getParameter(request, prefix + "lot_loc_cd", ""));
		setRfMdlNm(JSPUtil.getParameter(request, prefix + "rf_mdl_nm", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setLotCntrPfxCd(JSPUtil.getParameter(request, prefix + "lot_cntr_pfx_cd", ""));
		setCertiNo(JSPUtil.getParameter(request, prefix + "certi_no", ""));
		setCntrTpszCd(JSPUtil.getParameter(request, prefix + "cntr_tpsz_cd", ""));
		setAgmtCtyCd(JSPUtil.getParameter(request, prefix + "agmt_cty_cd", ""));
		setAproTirNo(JSPUtil.getParameter(request, prefix + "apro_tir_no", ""));
		setAproUicNo(JSPUtil.getParameter(request, prefix + "apro_uic_no", ""));
		setToSerNo(JSPUtil.getParameter(request, prefix + "to_ser_no", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setMftVndrSeq(JSPUtil.getParameter(request, prefix + "mft_vndr_seq", ""));
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setAcctQtyMzdCd(JSPUtil.getParameter(request, prefix + "acct_qty_mzd_cd", ""));
		setAgmtSeq(JSPUtil.getParameter(request, prefix + "agmt_seq", ""));
		setFaIfGrpSeqNo(JSPUtil.getParameter(request, prefix + "fa_if_grp_seq_no", ""));
		setAproTctNo(JSPUtil.getParameter(request, prefix + "apro_tct_no", ""));
		setPlstFlrFlg(JSPUtil.getParameter(request, prefix + "plst_flr_flg", ""));
		setDeYrmon(JSPUtil.getParameter(request, prefix + "de_yrmon", ""));
		setMaxTemp(JSPUtil.getParameter(request, prefix + "max_temp", ""));
		setFaIfGrpStsCd(JSPUtil.getParameter(request, prefix + "fa_if_grp_sts_cd", ""));
		setCntrInvstNo(JSPUtil.getParameter(request, prefix + "cntr_invst_no", ""));
		setCntrCurrCd(JSPUtil.getParameter(request, prefix + "cntr_curr_cd", ""));
		setMftDt(JSPUtil.getParameter(request, prefix + "mft_dt", ""));
		setRfMkrSeq(JSPUtil.getParameter(request, prefix + "rf_mkr_seq", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setDiffRmk(JSPUtil.getParameter(request, prefix + "diff_rmk", ""));
		setFctrySpecNo(JSPUtil.getParameter(request, prefix + "fctry_spec_no", ""));
		setAproCscNo(JSPUtil.getParameter(request, prefix + "apro_csc_no", ""));
		setFaIfDt(JSPUtil.getParameter(request, prefix + "fa_if_dt", ""));
		setRfRfrNo(JSPUtil.getParameter(request, prefix + "rf_rfr_no", ""));
		setRfTpCd(JSPUtil.getParameter(request, prefix + "rf_tp_cd", ""));
		setCntrHngrRckCd(JSPUtil.getParameter(request, prefix + "cntr_hngr_rck_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return MstCntrLotVO[]
	 */
	public MstCntrLotVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return MstCntrLotVO[]
	 */
	public MstCntrLotVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		MstCntrLotVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] cntrAqzAmt = (JSPUtil.getParameter(request, prefix	+ "cntr_aqz_amt", length));
			String[] cntrSpecNo = (JSPUtil.getParameter(request, prefix	+ "cntr_spec_no", length));
			String[] fmSerNo = (JSPUtil.getParameter(request, prefix	+ "fm_ser_no", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] lotPlnYr = (JSPUtil.getParameter(request, prefix	+ "lot_pln_yr", length));
			String[] lotSeq = (JSPUtil.getParameter(request, prefix	+ "lot_seq", length));
			String[] minTemp = (JSPUtil.getParameter(request, prefix	+ "min_temp", length));
			String[] lotLocCd = (JSPUtil.getParameter(request, prefix	+ "lot_loc_cd", length));
			String[] rfMdlNm = (JSPUtil.getParameter(request, prefix	+ "rf_mdl_nm", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] lotCntrPfxCd = (JSPUtil.getParameter(request, prefix	+ "lot_cntr_pfx_cd", length));
			String[] certiNo = (JSPUtil.getParameter(request, prefix	+ "certi_no", length));
			String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_cd", length));
			String[] agmtCtyCd = (JSPUtil.getParameter(request, prefix	+ "agmt_cty_cd", length));
			String[] aproTirNo = (JSPUtil.getParameter(request, prefix	+ "apro_tir_no", length));
			String[] aproUicNo = (JSPUtil.getParameter(request, prefix	+ "apro_uic_no", length));
			String[] toSerNo = (JSPUtil.getParameter(request, prefix	+ "to_ser_no", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] mftVndrSeq = (JSPUtil.getParameter(request, prefix	+ "mft_vndr_seq", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] acctQtyMzdCd = (JSPUtil.getParameter(request, prefix	+ "acct_qty_mzd_cd", length));
			String[] agmtSeq = (JSPUtil.getParameter(request, prefix	+ "agmt_seq", length));
			String[] faIfGrpSeqNo = (JSPUtil.getParameter(request, prefix	+ "fa_if_grp_seq_no", length));
			String[] aproTctNo = (JSPUtil.getParameter(request, prefix	+ "apro_tct_no", length));
			String[] plstFlrFlg = (JSPUtil.getParameter(request, prefix	+ "plst_flr_flg", length));
			String[] deYrmon = (JSPUtil.getParameter(request, prefix	+ "de_yrmon", length));
			String[] maxTemp = (JSPUtil.getParameter(request, prefix	+ "max_temp", length));
			String[] faIfGrpStsCd = (JSPUtil.getParameter(request, prefix	+ "fa_if_grp_sts_cd", length));
			String[] cntrInvstNo = (JSPUtil.getParameter(request, prefix	+ "cntr_invst_no", length));
			String[] cntrCurrCd = (JSPUtil.getParameter(request, prefix	+ "cntr_curr_cd", length));
			String[] mftDt = (JSPUtil.getParameter(request, prefix	+ "mft_dt", length));
			String[] rfMkrSeq = (JSPUtil.getParameter(request, prefix	+ "rf_mkr_seq", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] diffRmk = (JSPUtil.getParameter(request, prefix	+ "diff_rmk", length));
			String[] fctrySpecNo = (JSPUtil.getParameter(request, prefix	+ "fctry_spec_no", length));
			String[] aproCscNo = (JSPUtil.getParameter(request, prefix	+ "apro_csc_no", length));
			String[] faIfDt = (JSPUtil.getParameter(request, prefix	+ "fa_if_dt", length));
			String[] rfRfrNo = (JSPUtil.getParameter(request, prefix	+ "rf_rfr_no", length));
			String[] rfTpCd = (JSPUtil.getParameter(request, prefix	+ "rf_tp_cd", length));
			String[] cntrHngrRckCd = (JSPUtil.getParameter(request, prefix	+ "cntr_hngr_rck_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new MstCntrLotVO();
				if (cntrAqzAmt[i] != null)
					model.setCntrAqzAmt(cntrAqzAmt[i]);
				if (cntrSpecNo[i] != null)
					model.setCntrSpecNo(cntrSpecNo[i]);
				if (fmSerNo[i] != null)
					model.setFmSerNo(fmSerNo[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (lotPlnYr[i] != null)
					model.setLotPlnYr(lotPlnYr[i]);
				if (lotSeq[i] != null)
					model.setLotSeq(lotSeq[i]);
				if (minTemp[i] != null)
					model.setMinTemp(minTemp[i]);
				if (lotLocCd[i] != null)
					model.setLotLocCd(lotLocCd[i]);
				if (rfMdlNm[i] != null)
					model.setRfMdlNm(rfMdlNm[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (lotCntrPfxCd[i] != null)
					model.setLotCntrPfxCd(lotCntrPfxCd[i]);
				if (certiNo[i] != null)
					model.setCertiNo(certiNo[i]);
				if (cntrTpszCd[i] != null)
					model.setCntrTpszCd(cntrTpszCd[i]);
				if (agmtCtyCd[i] != null)
					model.setAgmtCtyCd(agmtCtyCd[i]);
				if (aproTirNo[i] != null)
					model.setAproTirNo(aproTirNo[i]);
				if (aproUicNo[i] != null)
					model.setAproUicNo(aproUicNo[i]);
				if (toSerNo[i] != null)
					model.setToSerNo(toSerNo[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (mftVndrSeq[i] != null)
					model.setMftVndrSeq(mftVndrSeq[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (acctQtyMzdCd[i] != null)
					model.setAcctQtyMzdCd(acctQtyMzdCd[i]);
				if (agmtSeq[i] != null)
					model.setAgmtSeq(agmtSeq[i]);
				if (faIfGrpSeqNo[i] != null)
					model.setFaIfGrpSeqNo(faIfGrpSeqNo[i]);
				if (aproTctNo[i] != null)
					model.setAproTctNo(aproTctNo[i]);
				if (plstFlrFlg[i] != null)
					model.setPlstFlrFlg(plstFlrFlg[i]);
				if (deYrmon[i] != null)
					model.setDeYrmon(deYrmon[i]);
				if (maxTemp[i] != null)
					model.setMaxTemp(maxTemp[i]);
				if (faIfGrpStsCd[i] != null)
					model.setFaIfGrpStsCd(faIfGrpStsCd[i]);
				if (cntrInvstNo[i] != null)
					model.setCntrInvstNo(cntrInvstNo[i]);
				if (cntrCurrCd[i] != null)
					model.setCntrCurrCd(cntrCurrCd[i]);
				if (mftDt[i] != null)
					model.setMftDt(mftDt[i]);
				if (rfMkrSeq[i] != null)
					model.setRfMkrSeq(rfMkrSeq[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (diffRmk[i] != null)
					model.setDiffRmk(diffRmk[i]);
				if (fctrySpecNo[i] != null)
					model.setFctrySpecNo(fctrySpecNo[i]);
				if (aproCscNo[i] != null)
					model.setAproCscNo(aproCscNo[i]);
				if (faIfDt[i] != null)
					model.setFaIfDt(faIfDt[i]);
				if (rfRfrNo[i] != null)
					model.setRfRfrNo(rfRfrNo[i]);
				if (rfTpCd[i] != null)
					model.setRfTpCd(rfTpCd[i]);
				if (cntrHngrRckCd[i] != null)
					model.setCntrHngrRckCd(cntrHngrRckCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getMstCntrLotVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return MstCntrLotVO[]
	 */
	public MstCntrLotVO[] getMstCntrLotVOs(){
		MstCntrLotVO[] vos = (MstCntrLotVO[])models.toArray(new MstCntrLotVO[models.size()]);
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
		this.cntrAqzAmt = this.cntrAqzAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrSpecNo = this.cntrSpecNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fmSerNo = this.fmSerNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lotPlnYr = this.lotPlnYr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lotSeq = this.lotSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.minTemp = this.minTemp .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lotLocCd = this.lotLocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rfMdlNm = this.rfMdlNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lotCntrPfxCd = this.lotCntrPfxCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.certiNo = this.certiNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszCd = this.cntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtCtyCd = this.agmtCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aproTirNo = this.aproTirNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aproUicNo = this.aproUicNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.toSerNo = this.toSerNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mftVndrSeq = this.mftVndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acctQtyMzdCd = this.acctQtyMzdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtSeq = this.agmtSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faIfGrpSeqNo = this.faIfGrpSeqNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aproTctNo = this.aproTctNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.plstFlrFlg = this.plstFlrFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deYrmon = this.deYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.maxTemp = this.maxTemp .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faIfGrpStsCd = this.faIfGrpStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrInvstNo = this.cntrInvstNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrCurrCd = this.cntrCurrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mftDt = this.mftDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rfMkrSeq = this.rfMkrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.diffRmk = this.diffRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fctrySpecNo = this.fctrySpecNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aproCscNo = this.aproCscNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faIfDt = this.faIfDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rfRfrNo = this.rfRfrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rfTpCd = this.rfTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrHngrRckCd = this.cntrHngrRckCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
