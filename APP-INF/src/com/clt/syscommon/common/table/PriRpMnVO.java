/*=========================================================
 *Copyright(c) 2014 CyberLogitec
 *@FileName : PriRpMnVO.java
 *@FileTitle : PriRpMnVO
 *Open Issues :
 *Change history :
 *@LastModifyDate : 2015.07.24
 *@LastModifier : jaewonLee
 *@LastVersion : 1.0
 * 2015.07.24 jaewonLee 
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
public class PriRpMnVO	extends	 AbstractValueObject {

	private	 static final long serialVersionUID = 1L;

	private	 Collection<PriRpMnVO>  models =	new	ArrayList<PriRpMnVO>();
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Page Number */
	private String pagerows = null;
	/*	Column Info	*/
	private String propAproDt = null;
	/*	Column Info	*/
	private String ctrtCustCntCd = null;
	/*	Column Info	*/
	private String amdtSeq = null;
	/*	Column Info	*/
	private String creDt = null;
	/*	Column Info	*/
	private String respbSlsOfcCd = null;
	/*	Column Info	*/
	private String effDt = null;
	/*	Column Info	*/
	private String propStsCd = null;
	/*	Column Info	*/
	private String expDt = null;
	/*	Column Info	*/
	private String tgtMvcQty = null;
	/*	Column Info	*/
	private String slsLdNo = null;
	/*	Column Info	*/
	private String updUsrId = null;
	/*	Column Info	*/
	private String updDt = null;
	/*	Column Info	*/
	private String propSrepCd = null;
	/*	Column Info	*/
	private String ctrtCustSeq = null;
	/*	Column Info	*/
	private String fileDt = null;
	/*	Column Info	*/
	private String respbSrepCd = null;
	/*	Column Info	*/
	private String cntrLodUtCd = null;
	/*	Column Info	*/
	private String prcCtrtCustTpCd = null;
	/*	Column Info	*/
	private String creUsrId = null;
	/*	Column Info	*/
	private String propOfcCd = null;
	/*	Column Info	*/
	private String propAproOfcCd = null;
	/*	Column Info	*/
	private String propNo = null;
	/*	Column Info	*/
	private String ctrtCustValSgmCd = null;
	/*	Column Info	*/
	private String trfCtrtFlg = null;
	/*	Column Info	*/ 
	private String ctrtDurTpCd = null;
	/*	Column Info	*/ 
	private String prnTpCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private	 HashMap<String , String>	hashColumns	= new LinkedHashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private	 HashMap<String , String>	hashFields = new LinkedHashMap<String, String>();


	/**	Constructor	*/
	public PriRpMnVO(){}

	public PriRpMnVO(String ibflag,String pagerows,String propAproDt,String ctrtCustCntCd,String amdtSeq,String creDt,String respbSlsOfcCd,String effDt,String propStsCd,String expDt,String tgtMvcQty,String slsLdNo,String updUsrId,String updDt,String propSrepCd,String ctrtCustSeq,String fileDt,String respbSrepCd,String cntrLodUtCd,String prcCtrtCustTpCd,String creUsrId,String propOfcCd,String propAproOfcCd,String propNo,String ctrtCustValSgmCd,String trfCtrtFlg,String ctrtDurTpCd, String prnTpCd)	{
		this.ibflag = ibflag;
		this.pagerows = pagerows;
		this.propAproDt = propAproDt;
		this.ctrtCustCntCd = ctrtCustCntCd;
		this.amdtSeq = amdtSeq;
		this.creDt = creDt;
		this.respbSlsOfcCd = respbSlsOfcCd;
		this.effDt = effDt;
		this.propStsCd = propStsCd;
		this.expDt = expDt;
		this.tgtMvcQty = tgtMvcQty;
		this.slsLdNo = slsLdNo;
		this.updUsrId = updUsrId;
		this.updDt = updDt;
		this.propSrepCd = propSrepCd;
		this.ctrtCustSeq = ctrtCustSeq;
		this.fileDt = fileDt;
		this.respbSrepCd = respbSrepCd;
		this.cntrLodUtCd = cntrLodUtCd;
		this.prcCtrtCustTpCd = prcCtrtCustTpCd;
		this.creUsrId = creUsrId;
		this.propOfcCd = propOfcCd;
		this.propAproOfcCd = propAproOfcCd;
		this.propNo = propNo;
		this.ctrtCustValSgmCd = ctrtCustValSgmCd;
		this.trfCtrtFlg = trfCtrtFlg;
		this.ctrtDurTpCd = ctrtDurTpCd;
		this.prnTpCd = prnTpCd;
	}


	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value">	로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("prop_apro_dt", getPropAproDt());
		this.hashColumns.put("ctrt_cust_cnt_cd", getCtrtCustCntCd());
		this.hashColumns.put("amdt_seq", getAmdtSeq());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("respb_sls_ofc_cd", getRespbSlsOfcCd());
		this.hashColumns.put("eff_dt", getEffDt());
		this.hashColumns.put("prop_sts_cd", getPropStsCd());
		this.hashColumns.put("exp_dt", getExpDt());
		this.hashColumns.put("tgt_mvc_qty", getTgtMvcQty());
		this.hashColumns.put("sls_ld_no", getSlsLdNo());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("prop_srep_cd", getPropSrepCd());
		this.hashColumns.put("ctrt_cust_seq", getCtrtCustSeq());
		this.hashColumns.put("file_dt", getFileDt());
		this.hashColumns.put("respb_srep_cd", getRespbSrepCd());
		this.hashColumns.put("cntr_lod_ut_cd", getCntrLodUtCd());
		this.hashColumns.put("prc_ctrt_cust_tp_cd", getPrcCtrtCustTpCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("prop_ofc_cd", getPropOfcCd());
		this.hashColumns.put("prop_apro_ofc_cd", getPropAproOfcCd());
		this.hashColumns.put("prop_no", getPropNo());
		this.hashColumns.put("ctrt_cust_val_sgm_cd", getCtrtCustValSgmCd());
		this.hashColumns.put("trf_ctrt_flg", getTrfCtrtFlg());
		this.hashColumns.put("ctrt_dur_tp_cd", getCtrtDurTpCd());
		this.hashColumns.put("prn_tp_cd", getPrnTpCd());
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
		this.hashFields.put("ctrt_cust_cnt_cd", "ctrtCustCntCd");
		this.hashFields.put("amdt_seq", "amdtSeq");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("respb_sls_ofc_cd", "respbSlsOfcCd");
		this.hashFields.put("eff_dt", "effDt");
		this.hashFields.put("prop_sts_cd", "propStsCd");
		this.hashFields.put("exp_dt", "expDt");
		this.hashFields.put("tgt_mvc_qty", "tgtMvcQty");
		this.hashFields.put("sls_ld_no", "slsLdNo");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("prop_srep_cd", "propSrepCd");
		this.hashFields.put("ctrt_cust_seq", "ctrtCustSeq");
		this.hashFields.put("file_dt", "fileDt");
		this.hashFields.put("respb_srep_cd", "respbSrepCd");
		this.hashFields.put("cntr_lod_ut_cd", "cntrLodUtCd");
		this.hashFields.put("prc_ctrt_cust_tp_cd", "prcCtrtCustTpCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("prop_ofc_cd", "propOfcCd");
		this.hashFields.put("prop_apro_ofc_cd", "propAproOfcCd");
		this.hashFields.put("prop_no", "propNo");
		this.hashFields.put("ctrt_cust_val_sgm_cd", "ctrtCustValSgmCd");
		this.hashFields.put("trf_ctrt_flg", "trfCtrtFlg");
		this.hashFields.put("ctrt_dur_tp_cd", "ctrtDurTpCd");
		this.hashFields.put("prn_tp_cd", "prnTpCd");
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
	 * @return ctrtCustCntCd
	 */
	public	String getCtrtCustCntCd() {
		return	this.ctrtCustCntCd;
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
	 * @return expDt
	 */
	public	String getExpDt() {
		return	this.expDt;
	}

	/**
	 * Column Info
	 * @return tgtMvcQty
	 */
	public	String getTgtMvcQty() {
		return	this.tgtMvcQty;
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
	 * @return ctrtCustSeq
	 */
	public	String getCtrtCustSeq() {
		return	this.ctrtCustSeq;
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
	 * @return cntrLodUtCd
	 */
	public	String getCntrLodUtCd() {
		return	this.cntrLodUtCd;
	}

	/**
	 * Column Info
	 * @return prcCtrtCustTpCd
	 */
	public	String getPrcCtrtCustTpCd() {
		return	this.prcCtrtCustTpCd;
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
	 * @return ctrtCustValSgmCd
	 */
	public	String getCtrtCustValSgmCd() {
		return	this.ctrtCustValSgmCd;
	}

	/**
	 * Column Info
	 * @return trfCtrtFlg
	 */
	public	String getTrfCtrtFlg() {
		return	this.trfCtrtFlg;
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
	 * @return prnTpCd
	 */
	public	String getPrnTpCd() {
		return	this.prnTpCd;
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
	 * @param  ctrtCustCntCd
 	 */
	public void	setCtrtCustCntCd(String ctrtCustCntCd ) {
		this.ctrtCustCntCd =	ctrtCustCntCd;
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
	 * @param  expDt
 	 */
	public void	setExpDt(String expDt ) {
		this.expDt =	expDt;
	}
 	/**
	 * Column Info
	 * @param  tgtMvcQty
 	 */
	public void	setTgtMvcQty(String tgtMvcQty ) {
		this.tgtMvcQty =	tgtMvcQty;
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
	 * @param  ctrtCustSeq
 	 */
	public void	setCtrtCustSeq(String ctrtCustSeq ) {
		this.ctrtCustSeq =	ctrtCustSeq;
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
	 * @param  cntrLodUtCd
 	 */
	public void	setCntrLodUtCd(String cntrLodUtCd ) {
		this.cntrLodUtCd =	cntrLodUtCd;
	}
 	/**
	 * Column Info
	 * @param  prcCtrtCustTpCd
 	 */
	public void	setPrcCtrtCustTpCd(String prcCtrtCustTpCd ) {
		this.prcCtrtCustTpCd =	prcCtrtCustTpCd;
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
	 * @param  ctrtCustValSgmCd
 	 */
	public void	setCtrtCustValSgmCd(String ctrtCustValSgmCd ) {
		this.ctrtCustValSgmCd =	ctrtCustValSgmCd;
	}
 	/**
	 * Column Info
	 * @param  trfCtrtFlg
 	 */
	public void	setTrfCtrtFlg(String trfCtrtFlg ) {
		this.trfCtrtFlg =	trfCtrtFlg;
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
	 * @param  prnTpCd
	 */
	public void	setPrnTpCd(String prnTpCd ) {
		this.prnTpCd =	prnTpCd;
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
		setCtrtCustCntCd(JSPUtil.getParameter(request,	prefix + "ctrt_cust_cnt_cd", ""));
		setAmdtSeq(JSPUtil.getParameter(request,	prefix + "amdt_seq", ""));
		setCreDt(JSPUtil.getParameter(request,	prefix + "cre_dt", ""));
		setRespbSlsOfcCd(JSPUtil.getParameter(request,	prefix + "respb_sls_ofc_cd", ""));
		setEffDt(JSPUtil.getParameter(request,	prefix + "eff_dt", ""));
		setPropStsCd(JSPUtil.getParameter(request,	prefix + "prop_sts_cd", ""));
		setExpDt(JSPUtil.getParameter(request,	prefix + "exp_dt", ""));
		setTgtMvcQty(JSPUtil.getParameter(request,	prefix + "tgt_mvc_qty", ""));
		setSlsLdNo(JSPUtil.getParameter(request,	prefix + "sls_ld_no", ""));
		setUpdUsrId(JSPUtil.getParameter(request,	prefix + "upd_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request,	prefix + "upd_dt", ""));
		setPropSrepCd(JSPUtil.getParameter(request,	prefix + "prop_srep_cd", ""));
		setCtrtCustSeq(JSPUtil.getParameter(request,	prefix + "ctrt_cust_seq", ""));
		setFileDt(JSPUtil.getParameter(request,	prefix + "file_dt", ""));
		setRespbSrepCd(JSPUtil.getParameter(request,	prefix + "respb_srep_cd", ""));
		setCntrLodUtCd(JSPUtil.getParameter(request,	prefix + "cntr_lod_ut_cd", ""));
		setPrcCtrtCustTpCd(JSPUtil.getParameter(request,	prefix + "prc_ctrt_cust_tp_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request,	prefix + "cre_usr_id", ""));
		setPropOfcCd(JSPUtil.getParameter(request,	prefix + "prop_ofc_cd", ""));
		setPropAproOfcCd(JSPUtil.getParameter(request,	prefix + "prop_apro_ofc_cd", ""));
		setPropNo(JSPUtil.getParameter(request,	prefix + "prop_no", ""));
		setCtrtCustValSgmCd(JSPUtil.getParameter(request,	prefix + "ctrt_cust_val_sgm_cd", ""));
		setTrfCtrtFlg(JSPUtil.getParameter(request,	prefix + "trf_ctrt_flg", ""));
		setCtrtDurTpCd(JSPUtil.getParameter(request,	prefix + "ctrt_dur_tp_cd", ""));
		setPrnTpCd(JSPUtil.getParameter(request,	prefix + "prn_tp_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return PriRpMnVO[]
	 */
	public PriRpMnVO[]	fromRequestGrid(HttpServletRequest request)	{
		return fromRequestGrid(request,	"");
	}

	/**
	 * Request 넘어온 여러 건	DATA를 VO Class 에 담는다.
	 * @param request
	 * @param prefix
	 * @return PriRpMnVO[]
	 */
	public PriRpMnVO[]	fromRequestGrid(HttpServletRequest request,	String prefix) {
		PriRpMnVO model = null;

		String[] tmp = request.getParameterValues(prefix + "ibflag");
		if (tmp	== null)
			return null;

		int	length = request.getParameterValues(prefix + "ibflag").length;

		try	{
			String[] ibflag =	(JSPUtil.getParameter(request, prefix +	"ibflag",	length));
			String[] pagerows =	(JSPUtil.getParameter(request, prefix +	"pagerows",	length));
			String[] propAproDt =	(JSPUtil.getParameter(request, prefix +	"prop_apro_dt",	length));
			String[] ctrtCustCntCd =	(JSPUtil.getParameter(request, prefix +	"ctrt_cust_cnt_cd",	length));
			String[] amdtSeq =	(JSPUtil.getParameter(request, prefix +	"amdt_seq",	length));
			String[] creDt =	(JSPUtil.getParameter(request, prefix +	"cre_dt",	length));
			String[] respbSlsOfcCd =	(JSPUtil.getParameter(request, prefix +	"respb_sls_ofc_cd",	length));
			String[] effDt =	(JSPUtil.getParameter(request, prefix +	"eff_dt",	length));
			String[] propStsCd =	(JSPUtil.getParameter(request, prefix +	"prop_sts_cd",	length));
			String[] expDt =	(JSPUtil.getParameter(request, prefix +	"exp_dt",	length));
			String[] tgtMvcQty =	(JSPUtil.getParameter(request, prefix +	"tgt_mvc_qty",	length));
			String[] slsLdNo =	(JSPUtil.getParameter(request, prefix +	"sls_ld_no",	length));
			String[] updUsrId =	(JSPUtil.getParameter(request, prefix +	"upd_usr_id",	length));
			String[] updDt =	(JSPUtil.getParameter(request, prefix +	"upd_dt",	length));
			String[] propSrepCd =	(JSPUtil.getParameter(request, prefix +	"prop_srep_cd",	length));
			String[] ctrtCustSeq =	(JSPUtil.getParameter(request, prefix +	"ctrt_cust_seq",	length));
			String[] fileDt =	(JSPUtil.getParameter(request, prefix +	"file_dt",	length));
			String[] respbSrepCd =	(JSPUtil.getParameter(request, prefix +	"respb_srep_cd",	length));
			String[] cntrLodUtCd =	(JSPUtil.getParameter(request, prefix +	"cntr_lod_ut_cd",	length));
			String[] prcCtrtCustTpCd =	(JSPUtil.getParameter(request, prefix +	"prc_ctrt_cust_tp_cd",	length));
			String[] creUsrId =	(JSPUtil.getParameter(request, prefix +	"cre_usr_id",	length));
			String[] propOfcCd =	(JSPUtil.getParameter(request, prefix +	"prop_ofc_cd",	length));
			String[] propAproOfcCd =	(JSPUtil.getParameter(request, prefix +	"prop_apro_ofc_cd",	length));
			String[] propNo =	(JSPUtil.getParameter(request, prefix +	"prop_no",	length));
			String[] ctrtCustValSgmCd =	(JSPUtil.getParameter(request, prefix +	"ctrt_cust_val_sgm_cd",	length));
			String[] trfCtrtFlg =	(JSPUtil.getParameter(request, prefix +	"trf_ctrt_flg",	length));
			String[] ctrtDurTpCd =	(JSPUtil.getParameter(request, prefix +	"ctrt_dur_tp_cd",	length));
			String[] prnTpCd =	(JSPUtil.getParameter(request, prefix +	"prn_tp_cd",	length));
			for	(int i = 0;	i <	length;	i++) {
				model =	new	PriRpMnVO();
				if ( ibflag[i] !=	null)
					model.setIbflag( ibflag[i]);
				if ( pagerows[i] !=	null)
					model.setPagerows( pagerows[i]);
				if ( propAproDt[i] !=	null)
					model.setPropAproDt( propAproDt[i]);
				if ( ctrtCustCntCd[i] !=	null)
					model.setCtrtCustCntCd( ctrtCustCntCd[i]);
				if ( amdtSeq[i] !=	null)
					model.setAmdtSeq( amdtSeq[i]);
				if ( creDt[i] !=	null)
					model.setCreDt( creDt[i]);
				if ( respbSlsOfcCd[i] !=	null)
					model.setRespbSlsOfcCd( respbSlsOfcCd[i]);
				if ( effDt[i] !=	null)
					model.setEffDt( effDt[i]);
				if ( propStsCd[i] !=	null)
					model.setPropStsCd( propStsCd[i]);
				if ( expDt[i] !=	null)
					model.setExpDt( expDt[i]);
				if ( tgtMvcQty[i] !=	null)
					model.setTgtMvcQty( tgtMvcQty[i]);
				if ( slsLdNo[i] !=	null)
					model.setSlsLdNo( slsLdNo[i]);
				if ( updUsrId[i] !=	null)
					model.setUpdUsrId( updUsrId[i]);
				if ( updDt[i] !=	null)
					model.setUpdDt( updDt[i]);
				if ( propSrepCd[i] !=	null)
					model.setPropSrepCd( propSrepCd[i]);
				if ( ctrtCustSeq[i] !=	null)
					model.setCtrtCustSeq( ctrtCustSeq[i]);
				if ( fileDt[i] !=	null)
					model.setFileDt( fileDt[i]);
				if ( respbSrepCd[i] !=	null)
					model.setRespbSrepCd( respbSrepCd[i]);
				if ( cntrLodUtCd[i] !=	null)
					model.setCntrLodUtCd( cntrLodUtCd[i]);
				if ( prcCtrtCustTpCd[i] !=	null)
					model.setPrcCtrtCustTpCd( prcCtrtCustTpCd[i]);
				if ( creUsrId[i] !=	null)
					model.setCreUsrId( creUsrId[i]);
				if ( propOfcCd[i] !=	null)
					model.setPropOfcCd( propOfcCd[i]);
				if ( propAproOfcCd[i] !=	null)
					model.setPropAproOfcCd( propAproOfcCd[i]);
				if ( propNo[i] !=	null)
					model.setPropNo( propNo[i]);
				if ( ctrtCustValSgmCd[i] !=	null)
					model.setCtrtCustValSgmCd( ctrtCustValSgmCd[i]);
				if ( trfCtrtFlg[i] !=	null)
					model.setTrfCtrtFlg( trfCtrtFlg[i]);
				if ( ctrtDurTpCd[i] !=	null)
					model.setCtrtDurTpCd( ctrtDurTpCd[i]);
				if ( prnTpCd[i] !=	null)
					model.setPrnTpCd( prnTpCd[i]);
				models.add(model);
			}

		} catch	(Exception e) {
			return null;
		}
		return getPriRpMnVOs();
	}

	/**
	 *  VO 배열을 반환
	 * @return PriRpMnVO[]
	 */
	public PriRpMnVO[]	 getPriRpMnVOs(){
		PriRpMnVO[] vos = (PriRpMnVO[])models.toArray(new	PriRpMnVO[models.size()]);
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
		this.ctrtCustCntCd =	this.ctrtCustCntCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.amdtSeq =	this.amdtSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt =	this.creDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.respbSlsOfcCd =	this.respbSlsOfcCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.effDt =	this.effDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.propStsCd =	this.propStsCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.expDt =	this.expDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tgtMvcQty =	this.tgtMvcQty.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slsLdNo =	this.slsLdNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId =	this.updUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt =	this.updDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.propSrepCd =	this.propSrepCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ctrtCustSeq =	this.ctrtCustSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fileDt =	this.fileDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.respbSrepCd =	this.respbSrepCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrLodUtCd =	this.cntrLodUtCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prcCtrtCustTpCd =	this.prcCtrtCustTpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId =	this.creUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.propOfcCd =	this.propOfcCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.propAproOfcCd =	this.propAproOfcCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.propNo =	this.propNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ctrtCustValSgmCd =	this.ctrtCustValSgmCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trfCtrtFlg =	this.trfCtrtFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ctrtDurTpCd =	this.ctrtDurTpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prnTpCd =	this.prnTpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}