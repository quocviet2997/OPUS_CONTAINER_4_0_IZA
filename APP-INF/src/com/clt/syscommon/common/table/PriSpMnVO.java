/*=========================================================
 *Copyright(c) 2014 CyberLogitec
 *@FileName : PriSpMnVO.java
 *@FileTitle : PriSpMnVO
 *Open Issues :
 *Change history :
 *@LastModifyDate : 2015.07.23
 *@LastModifier : jaewonLee
 *@LastVersion : 1.0
 * 2015.07.23 jaewonLee 
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
 * - PDTO(Data Transfer	Object including Parameters)<br>
 * - 관련	Event에서	작성,	서버실행요청시	PDTO의 역할을 수행하는 Value Object<br>
 * 
 * @author jaewonLee
 * @since J2EE 1.6
 * @see	..
 */
public class PriSpMnVO	extends	 AbstractValueObject {

	private	 static final long serialVersionUID = 1L;

	private	 Collection<PriSpMnVO>  models =	new	ArrayList<PriSpMnVO>();
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Page Number */
	private String pagerows = null;
	/*	Column Info	*/
	private String propAproDt = null;
	/*	Column Info	*/
	private String realCustValSgmCd = null;
	/*	Column Info	*/
	private String rfFlg = null;
	/*	Column Info	*/
	private String amdtSeq = null;
	/*	Column Info	*/
	private String creDt = null;
	/*	Column Info	*/
	private String realCustCntCd = null;
	/*	Column Info	*/
	private String respbSlsOfcCd = null;
	/*	Column Info	*/
	private String effDt = null;
	/*	Column Info	*/
	private String propStsCd = null;
	/*	Column Info	*/
	private String realCustSeq = null;
	/*	Column Info	*/
	private String expDt = null;
	/*	Column Info	*/
	private String slsLdNo = null;
	/*	Column Info	*/
	private String updUsrId = null;
	/*	Column Info	*/
	private String updDt = null;
	/*	Column Info	*/
	private String propSrepCd = null;
	/*	Column Info	*/
	private String fileDt = null;
	/*	Column Info	*/
	private String respbSrepCd = null;
	/*	Column Info	*/
	private String realCustSlsOfcCd = null;
	/*	Column Info	*/
	private String blplHdrSeq = null;
	/*	Column Info	*/
	private String gamtFlg = null;
	/*	Column Info	*/
	private String creUsrId = null;
	/*	Column Info	*/
	private String propOfcCd = null;
	/*	Column Info	*/
	private String propAproOfcCd = null;
	/*	Column Info	*/
	private String propNo = null;
	/*	Column Info	*/
	private String realCustTpCd = null;
	/*	Column Info	*/
	private String realCustSrepCd = null;
	/*	Column Info	*/
	private String prxyFlg = null;
	/*	Column Info	*/
	private String ctrtDurTpCd = null;
	/*	Column Info	*/
	private String lgcyAmdtSeq = null;
	/*	Column Info	*/
	private String prnTpCd = null;
	/*	Column Info	*/
	private String fomTpCd = null;
	

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private	 HashMap<String , String>	hashColumns	= new LinkedHashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private	 HashMap<String , String>	hashFields = new LinkedHashMap<String, String>();


	/**	Constructor	*/
	public PriSpMnVO(){}

	public PriSpMnVO(String ibflag,String pagerows,String propAproDt,String realCustValSgmCd,String rfFlg,String amdtSeq,String creDt,String realCustCntCd,String respbSlsOfcCd,String effDt,String propStsCd,String realCustSeq,String expDt,String slsLdNo,String updUsrId,String updDt,String propSrepCd,String fileDt,String respbSrepCd,String realCustSlsOfcCd,String blplHdrSeq,String gamtFlg,String creUsrId,String propOfcCd,String propAproOfcCd,String propNo,String realCustTpCd,String realCustSrepCd,String prxyFlg,String ctrtDurTpCd, String lgcyAmdtSeq, String prnTpCd, String fomTpCd)	{
		this.ibflag = ibflag;
		this.pagerows = pagerows;
		this.propAproDt = propAproDt;
		this.realCustValSgmCd = realCustValSgmCd;
		this.rfFlg = rfFlg;
		this.amdtSeq = amdtSeq;
		this.creDt = creDt;
		this.realCustCntCd = realCustCntCd;
		this.respbSlsOfcCd = respbSlsOfcCd;
		this.effDt = effDt;
		this.propStsCd = propStsCd;
		this.realCustSeq = realCustSeq;
		this.expDt = expDt;
		this.slsLdNo = slsLdNo;
		this.updUsrId = updUsrId;
		this.updDt = updDt;
		this.propSrepCd = propSrepCd;
		this.fileDt = fileDt;
		this.respbSrepCd = respbSrepCd;
		this.realCustSlsOfcCd = realCustSlsOfcCd;
		this.blplHdrSeq = blplHdrSeq;
		this.gamtFlg = gamtFlg;
		this.creUsrId = creUsrId;
		this.propOfcCd = propOfcCd;
		this.propAproOfcCd = propAproOfcCd;
		this.propNo = propNo;
		this.realCustTpCd = realCustTpCd;
		this.realCustSrepCd = realCustSrepCd;
		this.prxyFlg = prxyFlg;
		this.ctrtDurTpCd = ctrtDurTpCd;
		this.lgcyAmdtSeq = lgcyAmdtSeq;
		this.prnTpCd = prnTpCd;
		this.fomTpCd = fomTpCd;
	}


	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value">	로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("prop_apro_dt", getPropAproDt());
		this.hashColumns.put("real_cust_val_sgm_cd", getRealCustValSgmCd());
		this.hashColumns.put("rf_flg", getRfFlg());
		this.hashColumns.put("amdt_seq", getAmdtSeq());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("real_cust_cnt_cd", getRealCustCntCd());
		this.hashColumns.put("respb_sls_ofc_cd", getRespbSlsOfcCd());
		this.hashColumns.put("eff_dt", getEffDt());
		this.hashColumns.put("prop_sts_cd", getPropStsCd());
		this.hashColumns.put("real_cust_seq", getRealCustSeq());
		this.hashColumns.put("exp_dt", getExpDt());
		this.hashColumns.put("sls_ld_no", getSlsLdNo());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("prop_srep_cd", getPropSrepCd());
		this.hashColumns.put("file_dt", getFileDt());
		this.hashColumns.put("respb_srep_cd", getRespbSrepCd());
		this.hashColumns.put("real_cust_sls_ofc_cd", getRealCustSlsOfcCd());
		this.hashColumns.put("blpl_hdr_seq", getBlplHdrSeq());
		this.hashColumns.put("gamt_flg", getGamtFlg());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("prop_ofc_cd", getPropOfcCd());
		this.hashColumns.put("prop_apro_ofc_cd", getPropAproOfcCd());
		this.hashColumns.put("prop_no", getPropNo());
		this.hashColumns.put("real_cust_tp_cd", getRealCustTpCd());
		this.hashColumns.put("real_cust_srep_cd", getRealCustSrepCd());
		this.hashColumns.put("prxy_flg", getPrxyFlg());
		this.hashColumns.put("ctrt_dur_tp_cd", getCtrtDurTpCd());
		this.hashColumns.put("lgcy_amdt_seq", getLgcyAmdtSeq());
		this.hashColumns.put("prn_tp_cd", getPrnTpCd());
		this.hashColumns.put("fom_tp_cd", getFomTpCd());
		return this.hashColumns;
	}

	/**
	 * 컬럼명에	대응되는 멤버변수명을	저장하여 Hashtable<"column_name", "variable"> 로 반환
	 * @return
	 */
	public  HashMap<String, String>  getFieldNames(){
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("prop_apro_dt", "propAproDt");
		this.hashFields.put("real_cust_val_sgm_cd", "realCustValSgmCd");
		this.hashFields.put("rf_flg", "rfFlg");
		this.hashFields.put("amdt_seq", "amdtSeq");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("real_cust_cnt_cd", "realCustCntCd");
		this.hashFields.put("respb_sls_ofc_cd", "respbSlsOfcCd");
		this.hashFields.put("eff_dt", "effDt");
		this.hashFields.put("prop_sts_cd", "propStsCd");
		this.hashFields.put("real_cust_seq", "realCustSeq");
		this.hashFields.put("exp_dt", "expDt");
		this.hashFields.put("sls_ld_no", "slsLdNo");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("prop_srep_cd", "propSrepCd");
		this.hashFields.put("file_dt", "fileDt");
		this.hashFields.put("respb_srep_cd", "respbSrepCd");
		this.hashFields.put("real_cust_sls_ofc_cd", "realCustSlsOfcCd");
		this.hashFields.put("blpl_hdr_seq", "blplHdrSeq");
		this.hashFields.put("gamt_flg", "gamtFlg");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("prop_ofc_cd", "propOfcCd");
		this.hashFields.put("prop_apro_ofc_cd", "propAproOfcCd");
		this.hashFields.put("prop_no", "propNo");
		this.hashFields.put("real_cust_tp_cd", "realCustTpCd");
		this.hashFields.put("real_cust_srep_cd", "realCustSrepCd");
		this.hashFields.put("prxy_flg", "prxyFlg");
		this.hashFields.put("ctrt_dur_tp_cd", "ctrtDurTpCd");
		this.hashFields.put("lgcy_amdt_seq", "lgcyAmdtSeq");
		this.hashFields.put("prn_tp_cd", "prnTpCd");
		this.hashFields.put("fom_tp_cd", "fomTpCd");
		return this.hashFields;
	}

	//	Getters	and	Setters

	/**
	 * VO Data Value( C:Creation, U:Update, D:Delete )
	 * @return ibflag
	 */
	public	String getIbflag() {
		return	this.ibflag;
	}

	/**
	 * Page Number
	 * @return pagerows
	 */
	public	String getPagerows() {
		return	this.pagerows;
	}

	/**
	 * Column Info
	 * @return propAproDt
	 */
	public	String getPropAproDt() {
		return	this.propAproDt;
	}

	/**
	 * Column Info
	 * @return realCustValSgmCd
	 */
	public	String getRealCustValSgmCd() {
		return	this.realCustValSgmCd;
	}

	/**
	 * Column Info
	 * @return rfFlg
	 */
	public	String getRfFlg() {
		return	this.rfFlg;
	}

	/**
	 * Column Info
	 * @return amdtSeq
	 */
	public	String getAmdtSeq() {
		return	this.amdtSeq;
	}

	/**
	 * Column Info
	 * @return creDt
	 */
	public	String getCreDt() {
		return	this.creDt;
	}

	/**
	 * Column Info
	 * @return realCustCntCd
	 */
	public	String getRealCustCntCd() {
		return	this.realCustCntCd;
	}

	/**
	 * Column Info
	 * @return respbSlsOfcCd
	 */
	public	String getRespbSlsOfcCd() {
		return	this.respbSlsOfcCd;
	}

	/**
	 * Column Info
	 * @return effDt
	 */
	public	String getEffDt() {
		return	this.effDt;
	}

	/**
	 * Column Info
	 * @return propStsCd
	 */
	public	String getPropStsCd() {
		return	this.propStsCd;
	}

	/**
	 * Column Info
	 * @return realCustSeq
	 */
	public	String getRealCustSeq() {
		return	this.realCustSeq;
	}

	/**
	 * Column Info
	 * @return expDt
	 */
	public	String getExpDt() {
		return	this.expDt;
	}

	/**
	 * Column Info
	 * @return slsLdNo
	 */
	public	String getSlsLdNo() {
		return	this.slsLdNo;
	}

	/**
	 * Column Info
	 * @return updUsrId
	 */
	public	String getUpdUsrId() {
		return	this.updUsrId;
	}

	/**
	 * Column Info
	 * @return updDt
	 */
	public	String getUpdDt() {
		return	this.updDt;
	}

	/**
	 * Column Info
	 * @return propSrepCd
	 */
	public	String getPropSrepCd() {
		return	this.propSrepCd;
	}

	/**
	 * Column Info
	 * @return fileDt
	 */
	public	String getFileDt() {
		return	this.fileDt;
	}

	/**
	 * Column Info
	 * @return respbSrepCd
	 */
	public	String getRespbSrepCd() {
		return	this.respbSrepCd;
	}

	/**
	 * Column Info
	 * @return realCustSlsOfcCd
	 */
	public	String getRealCustSlsOfcCd() {
		return	this.realCustSlsOfcCd;
	}

	/**
	 * Column Info
	 * @return blplHdrSeq
	 */
	public	String getBlplHdrSeq() {
		return	this.blplHdrSeq;
	}

	/**
	 * Column Info
	 * @return gamtFlg
	 */
	public	String getGamtFlg() {
		return	this.gamtFlg;
	}

	/**
	 * Column Info
	 * @return creUsrId
	 */
	public	String getCreUsrId() {
		return	this.creUsrId;
	}

	/**
	 * Column Info
	 * @return propOfcCd
	 */
	public	String getPropOfcCd() {
		return	this.propOfcCd;
	}

	/**
	 * Column Info
	 * @return propAproOfcCd
	 */
	public	String getPropAproOfcCd() {
		return	this.propAproOfcCd;
	}

	/**
	 * Column Info
	 * @return propNo
	 */
	public	String getPropNo() {
		return	this.propNo;
	}

	/**
	 * Column Info
	 * @return realCustTpCd
	 */
	public	String getRealCustTpCd() {
		return	this.realCustTpCd;
	}

	/**
	 * Column Info
	 * @return realCustSrepCd
	 */
	public	String getRealCustSrepCd() {
		return	this.realCustSrepCd;
	}

	/**
	 * Column Info
	 * @return prxyFlg
	 */
	public	String getPrxyFlg() {
		return	this.prxyFlg;
	}

	/**
	 * Column Info
	 * @return ctrtDurTpCd
	 */
	public	String getCtrtDurTpCd() {
		return	this.ctrtDurTpCd;
	}
	/**
	 * Column Info
	 * @return lgcyAmdtSeq
	 */
	public	String getLgcyAmdtSeq() {
		return	this.lgcyAmdtSeq;
	}
	
	/**
	 * Column Info
	 * @return prnTpCd
	 */
	public	String getPrnTpCd() {
		return	this.prnTpCd;
	}
	
	/**
	 * Column Info
	 * @return fomTpCd
	 */
	public	String getFomTpCd() {
		return	this.fomTpCd;
	}

 	/**
	 * VO Data Value( C:Creation, U:Update, D:Delete )
	 * @param  ibflag
 	 */
	public void	setIbflag(String ibflag ) {
		this.ibflag =	ibflag;
	}
 	/**
	 * Page Number
	 * @param  pagerows
 	 */
	public void	setPagerows(String pagerows ) {
		this.pagerows =	pagerows;
	}
 	/**
	 * Column Info
	 * @param  propAproDt
 	 */
	public void	setPropAproDt(String propAproDt ) {
		this.propAproDt =	propAproDt;
	}
 	/**
	 * Column Info
	 * @param  realCustValSgmCd
 	 */
	public void	setRealCustValSgmCd(String realCustValSgmCd ) {
		this.realCustValSgmCd =	realCustValSgmCd;
	}
 	/**
	 * Column Info
	 * @param  rfFlg
 	 */
	public void	setRfFlg(String rfFlg ) {
		this.rfFlg =	rfFlg;
	}
 	/**
	 * Column Info
	 * @param  amdtSeq
 	 */
	public void	setAmdtSeq(String amdtSeq ) {
		this.amdtSeq =	amdtSeq;
	}
 	/**
	 * Column Info
	 * @param  creDt
 	 */
	public void	setCreDt(String creDt ) {
		this.creDt =	creDt;
	}
 	/**
	 * Column Info
	 * @param  realCustCntCd
 	 */
	public void	setRealCustCntCd(String realCustCntCd ) {
		this.realCustCntCd =	realCustCntCd;
	}
 	/**
	 * Column Info
	 * @param  respbSlsOfcCd
 	 */
	public void	setRespbSlsOfcCd(String respbSlsOfcCd ) {
		this.respbSlsOfcCd =	respbSlsOfcCd;
	}
 	/**
	 * Column Info
	 * @param  effDt
 	 */
	public void	setEffDt(String effDt ) {
		this.effDt =	effDt;
	}
 	/**
	 * Column Info
	 * @param  propStsCd
 	 */
	public void	setPropStsCd(String propStsCd ) {
		this.propStsCd =	propStsCd;
	}
 	/**
	 * Column Info
	 * @param  realCustSeq
 	 */
	public void	setRealCustSeq(String realCustSeq ) {
		this.realCustSeq =	realCustSeq;
	}
 	/**
	 * Column Info
	 * @param  expDt
 	 */
	public void	setExpDt(String expDt ) {
		this.expDt =	expDt;
	}
 	/**
	 * Column Info
	 * @param  slsLdNo
 	 */
	public void	setSlsLdNo(String slsLdNo ) {
		this.slsLdNo =	slsLdNo;
	}
 	/**
	 * Column Info
	 * @param  updUsrId
 	 */
	public void	setUpdUsrId(String updUsrId ) {
		this.updUsrId =	updUsrId;
	}
 	/**
	 * Column Info
	 * @param  updDt
 	 */
	public void	setUpdDt(String updDt ) {
		this.updDt =	updDt;
	}
 	/**
	 * Column Info
	 * @param  propSrepCd
 	 */
	public void	setPropSrepCd(String propSrepCd ) {
		this.propSrepCd =	propSrepCd;
	}
 	/**
	 * Column Info
	 * @param  fileDt
 	 */
	public void	setFileDt(String fileDt ) {
		this.fileDt =	fileDt;
	}
 	/**
	 * Column Info
	 * @param  respbSrepCd
 	 */
	public void	setRespbSrepCd(String respbSrepCd ) {
		this.respbSrepCd =	respbSrepCd;
	}
 	/**
	 * Column Info
	 * @param  realCustSlsOfcCd
 	 */
	public void	setRealCustSlsOfcCd(String realCustSlsOfcCd ) {
		this.realCustSlsOfcCd =	realCustSlsOfcCd;
	}
 	/**
	 * Column Info
	 * @param  blplHdrSeq
 	 */
	public void	setBlplHdrSeq(String blplHdrSeq ) {
		this.blplHdrSeq =	blplHdrSeq;
	}
 	/**
	 * Column Info
	 * @param  gamtFlg
 	 */
	public void	setGamtFlg(String gamtFlg ) {
		this.gamtFlg =	gamtFlg;
	}
 	/**
	 * Column Info
	 * @param  creUsrId
 	 */
	public void	setCreUsrId(String creUsrId ) {
		this.creUsrId =	creUsrId;
	}
 	/**
	 * Column Info
	 * @param  propOfcCd
 	 */
	public void	setPropOfcCd(String propOfcCd ) {
		this.propOfcCd =	propOfcCd;
	}
 	/**
	 * Column Info
	 * @param  propAproOfcCd
 	 */
	public void	setPropAproOfcCd(String propAproOfcCd ) {
		this.propAproOfcCd =	propAproOfcCd;
	}
 	/**
	 * Column Info
	 * @param  propNo
 	 */
	public void	setPropNo(String propNo ) {
		this.propNo =	propNo;
	}
 	/**
	 * Column Info
	 * @param  realCustTpCd
 	 */
	public void	setRealCustTpCd(String realCustTpCd ) {
		this.realCustTpCd =	realCustTpCd;
	}
 	/**
	 * Column Info
	 * @param  realCustSrepCd
 	 */
	public void	setRealCustSrepCd(String realCustSrepCd ) {
		this.realCustSrepCd =	realCustSrepCd;
	}
 	/**
	 * Column Info
	 * @param  prxyFlg
 	 */
	public void	setPrxyFlg(String prxyFlg ) {
		this.prxyFlg =	prxyFlg;
	}
 	/**
	 * Column Info
	 * @param  ctrtDurTpCd
 	 */
	public void	setCtrtDurTpCd(String ctrtDurTpCd ) {
		this.ctrtDurTpCd =	ctrtDurTpCd;
	}
	/**
	 * Column Info
	 * @param  lgcyAmdtSeq
	 */
	public void	setLgcyAmdtSeq(String lgcyAmdtSeq ) {
		this.lgcyAmdtSeq =	lgcyAmdtSeq;
	}
	
	/**
	 * Column Info
	 * @param  prnTpCd
	 */
	public void	setPrnTpCd(String prnTpCd ) {
		this.prnTpCd =	prnTpCd;
	}
	
	/**
	 * Column Info
	 * @param  fomTpCd
	 */
	public void	setFomTpCd(String fomTpCd ) {
		this.fomTpCd =	fomTpCd;
	}

	/**
	 * Request 의 데이터를 추출하여 VO 의	멤버변수에 설정.
	 * @param request
	 */
	public void	fromRequest(HttpServletRequest request)	{
		fromRequest(request,"");
	}

	/**
	 * Request 의 데이터를 추출하여 VO 의	멤버변수에 설정.
	 * @param request
	 */
	public void	fromRequest(HttpServletRequest request,	String prefix) {
		setIbflag(JSPUtil.getParameter(request,	prefix + "ibflag", ""));
		setPagerows(JSPUtil.getParameter(request,	prefix + "pagerows", ""));
		setPropAproDt(JSPUtil.getParameter(request,	prefix + "prop_apro_dt", ""));
		setRealCustValSgmCd(JSPUtil.getParameter(request,	prefix + "real_cust_val_sgm_cd", ""));
		setRfFlg(JSPUtil.getParameter(request,	prefix + "rf_flg", ""));
		setAmdtSeq(JSPUtil.getParameter(request,	prefix + "amdt_seq", ""));
		setCreDt(JSPUtil.getParameter(request,	prefix + "cre_dt", ""));
		setRealCustCntCd(JSPUtil.getParameter(request,	prefix + "real_cust_cnt_cd", ""));
		setRespbSlsOfcCd(JSPUtil.getParameter(request,	prefix + "respb_sls_ofc_cd", ""));
		setEffDt(JSPUtil.getParameter(request,	prefix + "eff_dt", ""));
		setPropStsCd(JSPUtil.getParameter(request,	prefix + "prop_sts_cd", ""));
		setRealCustSeq(JSPUtil.getParameter(request,	prefix + "real_cust_seq", ""));
		setExpDt(JSPUtil.getParameter(request,	prefix + "exp_dt", ""));
		setSlsLdNo(JSPUtil.getParameter(request,	prefix + "sls_ld_no", ""));
		setUpdUsrId(JSPUtil.getParameter(request,	prefix + "upd_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request,	prefix + "upd_dt", ""));
		setPropSrepCd(JSPUtil.getParameter(request,	prefix + "prop_srep_cd", ""));
		setFileDt(JSPUtil.getParameter(request,	prefix + "file_dt", ""));
		setRespbSrepCd(JSPUtil.getParameter(request,	prefix + "respb_srep_cd", ""));
		setRealCustSlsOfcCd(JSPUtil.getParameter(request,	prefix + "real_cust_sls_ofc_cd", ""));
		setBlplHdrSeq(JSPUtil.getParameter(request,	prefix + "blpl_hdr_seq", ""));
		setGamtFlg(JSPUtil.getParameter(request,	prefix + "gamt_flg", ""));
		setCreUsrId(JSPUtil.getParameter(request,	prefix + "cre_usr_id", ""));
		setPropOfcCd(JSPUtil.getParameter(request,	prefix + "prop_ofc_cd", ""));
		setPropAproOfcCd(JSPUtil.getParameter(request,	prefix + "prop_apro_ofc_cd", ""));
		setPropNo(JSPUtil.getParameter(request,	prefix + "prop_no", ""));
		setRealCustTpCd(JSPUtil.getParameter(request,	prefix + "real_cust_tp_cd", ""));
		setRealCustSrepCd(JSPUtil.getParameter(request,	prefix + "real_cust_srep_cd", ""));
		setPrxyFlg(JSPUtil.getParameter(request,	prefix + "prxy_flg", ""));
		setCtrtDurTpCd(JSPUtil.getParameter(request,	prefix + "ctrt_dur_tp_cd", ""));
		setLgcyAmdtSeq(JSPUtil.getParameter(request,	prefix + "lgcy_amdt_seq", ""));
		setPrnTpCd(JSPUtil.getParameter(request,	prefix + "prn_tp_cd", ""));
		setFomTpCd(JSPUtil.getParameter(request,	prefix + "fom_tp_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return PriSpMnVO[]
	 */
	public PriSpMnVO[]	fromRequestGrid(HttpServletRequest request)	{
		return fromRequestGrid(request,	"");
	}

	/**
	 * Request 넘어온 여러 건	DATA를 VO Class 에 담는다.
	 * @param request
	 * @param prefix
	 * @return PriSpMnVO[]
	 */
	public PriSpMnVO[]	fromRequestGrid(HttpServletRequest request,	String prefix) {
		PriSpMnVO model = null;

		String[] tmp = request.getParameterValues(prefix + "ibflag");
		if (tmp	== null)
			return null;

		int	length = request.getParameterValues(prefix + "ibflag").length;

		try	{
			String[] ibflag =	(JSPUtil.getParameter(request, prefix +	"ibflag",	length));
			String[] pagerows =	(JSPUtil.getParameter(request, prefix +	"pagerows",	length));
			String[] propAproDt =	(JSPUtil.getParameter(request, prefix +	"prop_apro_dt",	length));
			String[] realCustValSgmCd =	(JSPUtil.getParameter(request, prefix +	"real_cust_val_sgm_cd",	length));
			String[] rfFlg =	(JSPUtil.getParameter(request, prefix +	"rf_flg",	length));
			String[] amdtSeq =	(JSPUtil.getParameter(request, prefix +	"amdt_seq",	length));
			String[] creDt =	(JSPUtil.getParameter(request, prefix +	"cre_dt",	length));
			String[] realCustCntCd =	(JSPUtil.getParameter(request, prefix +	"real_cust_cnt_cd",	length));
			String[] respbSlsOfcCd =	(JSPUtil.getParameter(request, prefix +	"respb_sls_ofc_cd",	length));
			String[] effDt =	(JSPUtil.getParameter(request, prefix +	"eff_dt",	length));
			String[] propStsCd =	(JSPUtil.getParameter(request, prefix +	"prop_sts_cd",	length));
			String[] realCustSeq =	(JSPUtil.getParameter(request, prefix +	"real_cust_seq",	length));
			String[] expDt =	(JSPUtil.getParameter(request, prefix +	"exp_dt",	length));
			String[] slsLdNo =	(JSPUtil.getParameter(request, prefix +	"sls_ld_no",	length));
			String[] updUsrId =	(JSPUtil.getParameter(request, prefix +	"upd_usr_id",	length));
			String[] updDt =	(JSPUtil.getParameter(request, prefix +	"upd_dt",	length));
			String[] propSrepCd =	(JSPUtil.getParameter(request, prefix +	"prop_srep_cd",	length));
			String[] fileDt =	(JSPUtil.getParameter(request, prefix +	"file_dt",	length));
			String[] respbSrepCd =	(JSPUtil.getParameter(request, prefix +	"respb_srep_cd",	length));
			String[] realCustSlsOfcCd =	(JSPUtil.getParameter(request, prefix +	"real_cust_sls_ofc_cd",	length));
			String[] blplHdrSeq =	(JSPUtil.getParameter(request, prefix +	"blpl_hdr_seq",	length));
			String[] gamtFlg =	(JSPUtil.getParameter(request, prefix +	"gamt_flg",	length));
			String[] creUsrId =	(JSPUtil.getParameter(request, prefix +	"cre_usr_id",	length));
			String[] propOfcCd =	(JSPUtil.getParameter(request, prefix +	"prop_ofc_cd",	length));
			String[] propAproOfcCd =	(JSPUtil.getParameter(request, prefix +	"prop_apro_ofc_cd",	length));
			String[] propNo =	(JSPUtil.getParameter(request, prefix +	"prop_no",	length));
			String[] realCustTpCd =	(JSPUtil.getParameter(request, prefix +	"real_cust_tp_cd",	length));
			String[] realCustSrepCd =	(JSPUtil.getParameter(request, prefix +	"real_cust_srep_cd",	length));
			String[] prxyFlg =	(JSPUtil.getParameter(request, prefix +	"prxy_flg",	length));
			String[] ctrtDurTpCd =	(JSPUtil.getParameter(request, prefix +	"ctrt_dur_tp_cd",	length));
			String[] lgcyAmdtSeq =	(JSPUtil.getParameter(request, prefix +	"lgcy_amdt_seq",	length));
			String[] prnTpCd =	(JSPUtil.getParameter(request, prefix +	"prn_tp_cd",	length));
			String[] fomTpCd =	(JSPUtil.getParameter(request, prefix +	"fom_tp_cd",	length));
			for	(int i = 0;	i <	length;	i++) {
				model =	new	PriSpMnVO();
				if ( ibflag[i] !=	null)
					model.setIbflag( ibflag[i]);
				if ( pagerows[i] !=	null)
					model.setPagerows( pagerows[i]);
				if ( propAproDt[i] !=	null)
					model.setPropAproDt( propAproDt[i]);
				if ( realCustValSgmCd[i] !=	null)
					model.setRealCustValSgmCd( realCustValSgmCd[i]);
				if ( rfFlg[i] !=	null)
					model.setRfFlg( rfFlg[i]);
				if ( amdtSeq[i] !=	null)
					model.setAmdtSeq( amdtSeq[i]);
				if ( creDt[i] !=	null)
					model.setCreDt( creDt[i]);
				if ( realCustCntCd[i] !=	null)
					model.setRealCustCntCd( realCustCntCd[i]);
				if ( respbSlsOfcCd[i] !=	null)
					model.setRespbSlsOfcCd( respbSlsOfcCd[i]);
				if ( effDt[i] !=	null)
					model.setEffDt( effDt[i]);
				if ( propStsCd[i] !=	null)
					model.setPropStsCd( propStsCd[i]);
				if ( realCustSeq[i] !=	null)
					model.setRealCustSeq( realCustSeq[i]);
				if ( expDt[i] !=	null)
					model.setExpDt( expDt[i]);
				if ( slsLdNo[i] !=	null)
					model.setSlsLdNo( slsLdNo[i]);
				if ( updUsrId[i] !=	null)
					model.setUpdUsrId( updUsrId[i]);
				if ( updDt[i] !=	null)
					model.setUpdDt( updDt[i]);
				if ( propSrepCd[i] !=	null)
					model.setPropSrepCd( propSrepCd[i]);
				if ( fileDt[i] !=	null)
					model.setFileDt( fileDt[i]);
				if ( respbSrepCd[i] !=	null)
					model.setRespbSrepCd( respbSrepCd[i]);
				if ( realCustSlsOfcCd[i] !=	null)
					model.setRealCustSlsOfcCd( realCustSlsOfcCd[i]);
				if ( blplHdrSeq[i] !=	null)
					model.setBlplHdrSeq( blplHdrSeq[i]);
				if ( gamtFlg[i] !=	null)
					model.setGamtFlg( gamtFlg[i]);
				if ( creUsrId[i] !=	null)
					model.setCreUsrId( creUsrId[i]);
				if ( propOfcCd[i] !=	null)
					model.setPropOfcCd( propOfcCd[i]);
				if ( propAproOfcCd[i] !=	null)
					model.setPropAproOfcCd( propAproOfcCd[i]);
				if ( propNo[i] !=	null)
					model.setPropNo( propNo[i]);
				if ( realCustTpCd[i] !=	null)
					model.setRealCustTpCd( realCustTpCd[i]);
				if ( realCustSrepCd[i] !=	null)
					model.setRealCustSrepCd( realCustSrepCd[i]);
				if ( prxyFlg[i] !=	null)
					model.setPrxyFlg( prxyFlg[i]);
				if ( ctrtDurTpCd[i] !=	null)
					model.setCtrtDurTpCd( ctrtDurTpCd[i]);
				if ( lgcyAmdtSeq[i] !=	null)
					model.setLgcyAmdtSeq( lgcyAmdtSeq[i]);
				if ( prnTpCd[i] !=	null)
					model.setPrnTpCd( prnTpCd[i]);
				if ( fomTpCd[i] !=	null)
					model.setFomTpCd( fomTpCd[i]);
				models.add(model);
			}

		} catch	(Exception e) {
			return null;
		}
		return getPriSpMnVOs();
	}

	/**
	 *  VO 배열을 반환
	 * @return PriSpMnVO[]
	 */
	public PriSpMnVO[]	 getPriSpMnVOs(){
		PriSpMnVO[] vos = (PriSpMnVO[])models.toArray(new	PriSpMnVO[models.size()]);
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
	public void	unDataFormat(){
		this.ibflag =	this.ibflag.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows =	this.pagerows.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.propAproDt =	this.propAproDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.realCustValSgmCd =	this.realCustValSgmCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rfFlg =	this.rfFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.amdtSeq =	this.amdtSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt =	this.creDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.realCustCntCd =	this.realCustCntCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.respbSlsOfcCd =	this.respbSlsOfcCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.effDt =	this.effDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.propStsCd =	this.propStsCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.realCustSeq =	this.realCustSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.expDt =	this.expDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slsLdNo =	this.slsLdNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId =	this.updUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt =	this.updDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.propSrepCd =	this.propSrepCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fileDt =	this.fileDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.respbSrepCd =	this.respbSrepCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.realCustSlsOfcCd =	this.realCustSlsOfcCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blplHdrSeq =	this.blplHdrSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.gamtFlg =	this.gamtFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId =	this.creUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.propOfcCd =	this.propOfcCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.propAproOfcCd =	this.propAproOfcCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.propNo =	this.propNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.realCustTpCd =	this.realCustTpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.realCustSrepCd =	this.realCustSrepCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prxyFlg =	this.prxyFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ctrtDurTpCd =	this.ctrtDurTpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lgcyAmdtSeq =	this.lgcyAmdtSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prnTpCd =	this.prnTpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fomTpCd =	this.fomTpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}