/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CoaBkgSvcTrnsPrcVO.java
*@FileTitle : CoaBkgSvcTrnsPrcVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.25
*@LastModifier : 임옥영
*@LastVersion : 1.0
* 2009.09.25 임옥영 
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
 * @author 임옥영
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class CoaBkgSvcTrnsPrcVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CoaBkgSvcTrnsPrcVO> models = new ArrayList<CoaBkgSvcTrnsPrcVO>();
	
	/* Column Info */
	private String coaCostSrcCd = null;
	/* Column Info */
	private String comFlg = null;
	/* Column Info */
	private String vslDys = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String raAcctCd = null;
	/* Column Info */
	private String bkgRoutSeq = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String cntrBxKnt = null;
	/* Column Info */
	private String locCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String slsActCd = null;
	/* Column Info */
	private String bkgKnt = null;
	/* Column Info */
	private String divMeasCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String stndCostCd = null;
	/* Column Info */
	private String cntrTeuQty = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String costAssBseCd = null;
	/* Column Info */
	private String svcTrnsPrcAmt = null;
	/* Column Info */
	private String ofcClssCd = null;
	/* Column Info */
	private String actUcAmt = null;
	/* Column Info */
	private String acclRtAmt = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String estmUcAmt = null;
	/* Column Info */
	private String bkgSplitRto = null;
	/* Column Info */
	private String cntAvgUcAmt = null;
	/* Column Info */
	private String condOfcCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CoaBkgSvcTrnsPrcVO() {}

	public CoaBkgSvcTrnsPrcVO(String ibflag, String pagerows, String bkgNo, String coaCostSrcCd, String bkgRoutSeq, String locCd, String condOfcCd, String divMeasCd, String ofcClssCd, String slsActCd, String raAcctCd, String stndCostCd, String costAssBseCd, String svcTrnsPrcAmt, String estmUcAmt, String bkgKnt, String actUcAmt, String acclRtAmt, String cntrBxKnt, String cntrTeuQty, String vslDys, String comFlg, String cntAvgUcAmt, String bkgSplitRto, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.coaCostSrcCd = coaCostSrcCd;
		this.comFlg = comFlg;
		this.vslDys = vslDys;
		this.creDt = creDt;
		this.raAcctCd = raAcctCd;
		this.bkgRoutSeq = bkgRoutSeq;
		this.pagerows = pagerows;
		this.cntrBxKnt = cntrBxKnt;
		this.locCd = locCd;
		this.ibflag = ibflag;
		this.slsActCd = slsActCd;
		this.bkgKnt = bkgKnt;
		this.divMeasCd = divMeasCd;
		this.updUsrId = updUsrId;
		this.stndCostCd = stndCostCd;
		this.cntrTeuQty = cntrTeuQty;
		this.updDt = updDt;
		this.costAssBseCd = costAssBseCd;
		this.svcTrnsPrcAmt = svcTrnsPrcAmt;
		this.ofcClssCd = ofcClssCd;
		this.actUcAmt = actUcAmt;
		this.acclRtAmt = acclRtAmt;
		this.bkgNo = bkgNo;
		this.creUsrId = creUsrId;
		this.estmUcAmt = estmUcAmt;
		this.bkgSplitRto = bkgSplitRto;
		this.cntAvgUcAmt = cntAvgUcAmt;
		this.condOfcCd = condOfcCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("coa_cost_src_cd", getCoaCostSrcCd());
		this.hashColumns.put("com_flg", getComFlg());
		this.hashColumns.put("vsl_dys", getVslDys());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("ra_acct_cd", getRaAcctCd());
		this.hashColumns.put("bkg_rout_seq", getBkgRoutSeq());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("cntr_bx_knt", getCntrBxKnt());
		this.hashColumns.put("loc_cd", getLocCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("sls_act_cd", getSlsActCd());
		this.hashColumns.put("bkg_knt", getBkgKnt());
		this.hashColumns.put("div_meas_cd", getDivMeasCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("stnd_cost_cd", getStndCostCd());
		this.hashColumns.put("cntr_teu_qty", getCntrTeuQty());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cost_ass_bse_cd", getCostAssBseCd());
		this.hashColumns.put("svc_trns_prc_amt", getSvcTrnsPrcAmt());
		this.hashColumns.put("ofc_clss_cd", getOfcClssCd());
		this.hashColumns.put("act_uc_amt", getActUcAmt());
		this.hashColumns.put("accl_rt_amt", getAcclRtAmt());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("estm_uc_amt", getEstmUcAmt());
		this.hashColumns.put("bkg_split_rto", getBkgSplitRto());
		this.hashColumns.put("cnt_avg_uc_amt", getCntAvgUcAmt());
		this.hashColumns.put("cond_ofc_cd", getCondOfcCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("coa_cost_src_cd", "coaCostSrcCd");
		this.hashFields.put("com_flg", "comFlg");
		this.hashFields.put("vsl_dys", "vslDys");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("ra_acct_cd", "raAcctCd");
		this.hashFields.put("bkg_rout_seq", "bkgRoutSeq");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("cntr_bx_knt", "cntrBxKnt");
		this.hashFields.put("loc_cd", "locCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("sls_act_cd", "slsActCd");
		this.hashFields.put("bkg_knt", "bkgKnt");
		this.hashFields.put("div_meas_cd", "divMeasCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("stnd_cost_cd", "stndCostCd");
		this.hashFields.put("cntr_teu_qty", "cntrTeuQty");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cost_ass_bse_cd", "costAssBseCd");
		this.hashFields.put("svc_trns_prc_amt", "svcTrnsPrcAmt");
		this.hashFields.put("ofc_clss_cd", "ofcClssCd");
		this.hashFields.put("act_uc_amt", "actUcAmt");
		this.hashFields.put("accl_rt_amt", "acclRtAmt");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("estm_uc_amt", "estmUcAmt");
		this.hashFields.put("bkg_split_rto", "bkgSplitRto");
		this.hashFields.put("cnt_avg_uc_amt", "cntAvgUcAmt");
		this.hashFields.put("cond_ofc_cd", "condOfcCd");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return coaCostSrcCd
	 */
	public String getCoaCostSrcCd() {
		return this.coaCostSrcCd;
	}
	
	/**
	 * Column Info
	 * @return comFlg
	 */
	public String getComFlg() {
		return this.comFlg;
	}
	
	/**
	 * Column Info
	 * @return vslDys
	 */
	public String getVslDys() {
		return this.vslDys;
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
	 * @return raAcctCd
	 */
	public String getRaAcctCd() {
		return this.raAcctCd;
	}
	
	/**
	 * Column Info
	 * @return bkgRoutSeq
	 */
	public String getBkgRoutSeq() {
		return this.bkgRoutSeq;
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
	 * @return cntrBxKnt
	 */
	public String getCntrBxKnt() {
		return this.cntrBxKnt;
	}
	
	/**
	 * Column Info
	 * @return locCd
	 */
	public String getLocCd() {
		return this.locCd;
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
	 * @return slsActCd
	 */
	public String getSlsActCd() {
		return this.slsActCd;
	}
	
	/**
	 * Column Info
	 * @return bkgKnt
	 */
	public String getBkgKnt() {
		return this.bkgKnt;
	}
	
	/**
	 * Column Info
	 * @return divMeasCd
	 */
	public String getDivMeasCd() {
		return this.divMeasCd;
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
	 * @return stndCostCd
	 */
	public String getStndCostCd() {
		return this.stndCostCd;
	}
	
	/**
	 * Column Info
	 * @return cntrTeuQty
	 */
	public String getCntrTeuQty() {
		return this.cntrTeuQty;
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
	 * @return costAssBseCd
	 */
	public String getCostAssBseCd() {
		return this.costAssBseCd;
	}
	
	/**
	 * Column Info
	 * @return svcTrnsPrcAmt
	 */
	public String getSvcTrnsPrcAmt() {
		return this.svcTrnsPrcAmt;
	}
	
	/**
	 * Column Info
	 * @return ofcClssCd
	 */
	public String getOfcClssCd() {
		return this.ofcClssCd;
	}
	
	/**
	 * Column Info
	 * @return actUcAmt
	 */
	public String getActUcAmt() {
		return this.actUcAmt;
	}
	
	/**
	 * Column Info
	 * @return acclRtAmt
	 */
	public String getAcclRtAmt() {
		return this.acclRtAmt;
	}
	
	/**
	 * Column Info
	 * @return bkgNo
	 */
	public String getBkgNo() {
		return this.bkgNo;
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
	 * @return estmUcAmt
	 */
	public String getEstmUcAmt() {
		return this.estmUcAmt;
	}
	
	/**
	 * Column Info
	 * @return bkgSplitRto
	 */
	public String getBkgSplitRto() {
		return this.bkgSplitRto;
	}
	
	/**
	 * Column Info
	 * @return cntAvgUcAmt
	 */
	public String getCntAvgUcAmt() {
		return this.cntAvgUcAmt;
	}
	
	/**
	 * Column Info
	 * @return condOfcCd
	 */
	public String getCondOfcCd() {
		return this.condOfcCd;
	}
	

	/**
	 * Column Info
	 * @param coaCostSrcCd
	 */
	public void setCoaCostSrcCd(String coaCostSrcCd) {
		this.coaCostSrcCd = coaCostSrcCd;
	}
	
	/**
	 * Column Info
	 * @param comFlg
	 */
	public void setComFlg(String comFlg) {
		this.comFlg = comFlg;
	}
	
	/**
	 * Column Info
	 * @param vslDys
	 */
	public void setVslDys(String vslDys) {
		this.vslDys = vslDys;
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
	 * @param raAcctCd
	 */
	public void setRaAcctCd(String raAcctCd) {
		this.raAcctCd = raAcctCd;
	}
	
	/**
	 * Column Info
	 * @param bkgRoutSeq
	 */
	public void setBkgRoutSeq(String bkgRoutSeq) {
		this.bkgRoutSeq = bkgRoutSeq;
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
	 * @param cntrBxKnt
	 */
	public void setCntrBxKnt(String cntrBxKnt) {
		this.cntrBxKnt = cntrBxKnt;
	}
	
	/**
	 * Column Info
	 * @param locCd
	 */
	public void setLocCd(String locCd) {
		this.locCd = locCd;
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
	 * @param slsActCd
	 */
	public void setSlsActCd(String slsActCd) {
		this.slsActCd = slsActCd;
	}
	
	/**
	 * Column Info
	 * @param bkgKnt
	 */
	public void setBkgKnt(String bkgKnt) {
		this.bkgKnt = bkgKnt;
	}
	
	/**
	 * Column Info
	 * @param divMeasCd
	 */
	public void setDivMeasCd(String divMeasCd) {
		this.divMeasCd = divMeasCd;
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
	 * @param stndCostCd
	 */
	public void setStndCostCd(String stndCostCd) {
		this.stndCostCd = stndCostCd;
	}
	
	/**
	 * Column Info
	 * @param cntrTeuQty
	 */
	public void setCntrTeuQty(String cntrTeuQty) {
		this.cntrTeuQty = cntrTeuQty;
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
	 * @param costAssBseCd
	 */
	public void setCostAssBseCd(String costAssBseCd) {
		this.costAssBseCd = costAssBseCd;
	}
	
	/**
	 * Column Info
	 * @param svcTrnsPrcAmt
	 */
	public void setSvcTrnsPrcAmt(String svcTrnsPrcAmt) {
		this.svcTrnsPrcAmt = svcTrnsPrcAmt;
	}
	
	/**
	 * Column Info
	 * @param ofcClssCd
	 */
	public void setOfcClssCd(String ofcClssCd) {
		this.ofcClssCd = ofcClssCd;
	}
	
	/**
	 * Column Info
	 * @param actUcAmt
	 */
	public void setActUcAmt(String actUcAmt) {
		this.actUcAmt = actUcAmt;
	}
	
	/**
	 * Column Info
	 * @param acclRtAmt
	 */
	public void setAcclRtAmt(String acclRtAmt) {
		this.acclRtAmt = acclRtAmt;
	}
	
	/**
	 * Column Info
	 * @param bkgNo
	 */
	public void setBkgNo(String bkgNo) {
		this.bkgNo = bkgNo;
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
	 * @param estmUcAmt
	 */
	public void setEstmUcAmt(String estmUcAmt) {
		this.estmUcAmt = estmUcAmt;
	}
	
	/**
	 * Column Info
	 * @param bkgSplitRto
	 */
	public void setBkgSplitRto(String bkgSplitRto) {
		this.bkgSplitRto = bkgSplitRto;
	}
	
	/**
	 * Column Info
	 * @param cntAvgUcAmt
	 */
	public void setCntAvgUcAmt(String cntAvgUcAmt) {
		this.cntAvgUcAmt = cntAvgUcAmt;
	}
	
	/**
	 * Column Info
	 * @param condOfcCd
	 */
	public void setCondOfcCd(String condOfcCd) {
		this.condOfcCd = condOfcCd;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setCoaCostSrcCd(JSPUtil.getParameter(request, "coa_cost_src_cd", ""));
		setComFlg(JSPUtil.getParameter(request, "com_flg", ""));
		setVslDys(JSPUtil.getParameter(request, "vsl_dys", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setRaAcctCd(JSPUtil.getParameter(request, "ra_acct_cd", ""));
		setBkgRoutSeq(JSPUtil.getParameter(request, "bkg_rout_seq", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setCntrBxKnt(JSPUtil.getParameter(request, "cntr_bx_knt", ""));
		setLocCd(JSPUtil.getParameter(request, "loc_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setSlsActCd(JSPUtil.getParameter(request, "sls_act_cd", ""));
		setBkgKnt(JSPUtil.getParameter(request, "bkg_knt", ""));
		setDivMeasCd(JSPUtil.getParameter(request, "div_meas_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setStndCostCd(JSPUtil.getParameter(request, "stnd_cost_cd", ""));
		setCntrTeuQty(JSPUtil.getParameter(request, "cntr_teu_qty", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCostAssBseCd(JSPUtil.getParameter(request, "cost_ass_bse_cd", ""));
		setSvcTrnsPrcAmt(JSPUtil.getParameter(request, "svc_trns_prc_amt", ""));
		setOfcClssCd(JSPUtil.getParameter(request, "ofc_clss_cd", ""));
		setActUcAmt(JSPUtil.getParameter(request, "act_uc_amt", ""));
		setAcclRtAmt(JSPUtil.getParameter(request, "accl_rt_amt", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setEstmUcAmt(JSPUtil.getParameter(request, "estm_uc_amt", ""));
		setBkgSplitRto(JSPUtil.getParameter(request, "bkg_split_rto", ""));
		setCntAvgUcAmt(JSPUtil.getParameter(request, "cnt_avg_uc_amt", ""));
		setCondOfcCd(JSPUtil.getParameter(request, "cond_ofc_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return CoaBkgSvcTrnsPrcVO[]
	 */
	public CoaBkgSvcTrnsPrcVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return CoaBkgSvcTrnsPrcVO[]
	 */
	public CoaBkgSvcTrnsPrcVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CoaBkgSvcTrnsPrcVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] coaCostSrcCd = (JSPUtil.getParameter(request, prefix	+ "coa_cost_src_cd", length));
			String[] comFlg = (JSPUtil.getParameter(request, prefix	+ "com_flg", length));
			String[] vslDys = (JSPUtil.getParameter(request, prefix	+ "vsl_dys", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] raAcctCd = (JSPUtil.getParameter(request, prefix	+ "ra_acct_cd", length));
			String[] bkgRoutSeq = (JSPUtil.getParameter(request, prefix	+ "bkg_rout_seq", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] cntrBxKnt = (JSPUtil.getParameter(request, prefix	+ "cntr_bx_knt", length));
			String[] locCd = (JSPUtil.getParameter(request, prefix	+ "loc_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] slsActCd = (JSPUtil.getParameter(request, prefix	+ "sls_act_cd", length));
			String[] bkgKnt = (JSPUtil.getParameter(request, prefix	+ "bkg_knt", length));
			String[] divMeasCd = (JSPUtil.getParameter(request, prefix	+ "div_meas_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] stndCostCd = (JSPUtil.getParameter(request, prefix	+ "stnd_cost_cd", length));
			String[] cntrTeuQty = (JSPUtil.getParameter(request, prefix	+ "cntr_teu_qty", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] costAssBseCd = (JSPUtil.getParameter(request, prefix	+ "cost_ass_bse_cd", length));
			String[] svcTrnsPrcAmt = (JSPUtil.getParameter(request, prefix	+ "svc_trns_prc_amt", length));
			String[] ofcClssCd = (JSPUtil.getParameter(request, prefix	+ "ofc_clss_cd", length));
			String[] actUcAmt = (JSPUtil.getParameter(request, prefix	+ "act_uc_amt", length));
			String[] acclRtAmt = (JSPUtil.getParameter(request, prefix	+ "accl_rt_amt", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] estmUcAmt = (JSPUtil.getParameter(request, prefix	+ "estm_uc_amt", length));
			String[] bkgSplitRto = (JSPUtil.getParameter(request, prefix	+ "bkg_split_rto", length));
			String[] cntAvgUcAmt = (JSPUtil.getParameter(request, prefix	+ "cnt_avg_uc_amt", length));
			String[] condOfcCd = (JSPUtil.getParameter(request, prefix	+ "cond_ofc_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new CoaBkgSvcTrnsPrcVO();
				if (coaCostSrcCd[i] != null)
					model.setCoaCostSrcCd(coaCostSrcCd[i]);
				if (comFlg[i] != null)
					model.setComFlg(comFlg[i]);
				if (vslDys[i] != null)
					model.setVslDys(vslDys[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (raAcctCd[i] != null)
					model.setRaAcctCd(raAcctCd[i]);
				if (bkgRoutSeq[i] != null)
					model.setBkgRoutSeq(bkgRoutSeq[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (cntrBxKnt[i] != null)
					model.setCntrBxKnt(cntrBxKnt[i]);
				if (locCd[i] != null)
					model.setLocCd(locCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (slsActCd[i] != null)
					model.setSlsActCd(slsActCd[i]);
				if (bkgKnt[i] != null)
					model.setBkgKnt(bkgKnt[i]);
				if (divMeasCd[i] != null)
					model.setDivMeasCd(divMeasCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (stndCostCd[i] != null)
					model.setStndCostCd(stndCostCd[i]);
				if (cntrTeuQty[i] != null)
					model.setCntrTeuQty(cntrTeuQty[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (costAssBseCd[i] != null)
					model.setCostAssBseCd(costAssBseCd[i]);
				if (svcTrnsPrcAmt[i] != null)
					model.setSvcTrnsPrcAmt(svcTrnsPrcAmt[i]);
				if (ofcClssCd[i] != null)
					model.setOfcClssCd(ofcClssCd[i]);
				if (actUcAmt[i] != null)
					model.setActUcAmt(actUcAmt[i]);
				if (acclRtAmt[i] != null)
					model.setAcclRtAmt(acclRtAmt[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (estmUcAmt[i] != null)
					model.setEstmUcAmt(estmUcAmt[i]);
				if (bkgSplitRto[i] != null)
					model.setBkgSplitRto(bkgSplitRto[i]);
				if (cntAvgUcAmt[i] != null)
					model.setCntAvgUcAmt(cntAvgUcAmt[i]);
				if (condOfcCd[i] != null)
					model.setCondOfcCd(condOfcCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getCoaBkgSvcTrnsPrcVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return CoaBkgSvcTrnsPrcVO[]
	 */
	public CoaBkgSvcTrnsPrcVO[] getCoaBkgSvcTrnsPrcVOs(){
		CoaBkgSvcTrnsPrcVO[] vos = (CoaBkgSvcTrnsPrcVO[])models.toArray(new CoaBkgSvcTrnsPrcVO[models.size()]);
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
		this.coaCostSrcCd = this.coaCostSrcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.comFlg = this.comFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslDys = this.vslDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.raAcctCd = this.raAcctCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgRoutSeq = this.bkgRoutSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrBxKnt = this.cntrBxKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.locCd = this.locCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slsActCd = this.slsActCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgKnt = this.bkgKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.divMeasCd = this.divMeasCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stndCostCd = this.stndCostCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTeuQty = this.cntrTeuQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costAssBseCd = this.costAssBseCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.svcTrnsPrcAmt = this.svcTrnsPrcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcClssCd = this.ofcClssCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actUcAmt = this.actUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acclRtAmt = this.acclRtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.estmUcAmt = this.estmUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgSplitRto = this.bkgSplitRto .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntAvgUcAmt = this.cntAvgUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.condOfcCd = this.condOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
