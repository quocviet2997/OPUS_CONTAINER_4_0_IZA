/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : PriPrsUsdRoutEstmCostVO.java
*@FileTitle : PriPrsUsdRoutEstmCostVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.12.10
*@LastModifier : 송민석
*@LastVersion : 1.0
* 2009.12.10 송민석 
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
 * @author 송민석
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class PriPrsUsdRoutEstmCostVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<PriPrsUsdRoutEstmCostVO> models = new ArrayList<PriPrsUsdRoutEstmCostVO>();
	
	/* Column Info */
	private String coaCostSrcCd = null;
	/* Column Info */
	private String comFlg = null;
	/* Column Info */
	private String vslDys = null;
	/* Column Info */
	private String raAcctCd = null;
	/* Column Info */
	private String creDt = null;
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
	private String routCsSrcDt = null;
	/* Column Info */
	private String divMeasCd = null;
	/* Column Info */
	private String comRoutSeq = null;
	/* Column Info */
	private String routCsNo = null;
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
	private String creUsrId = null;
	/* Column Info */
	private String condOfcCd = null;
	/* Column Info */
	private String costCalcRmk = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public PriPrsUsdRoutEstmCostVO() {}

	public PriPrsUsdRoutEstmCostVO(String ibflag, String pagerows, String routCsNo, String coaCostSrcCd, String comRoutSeq, String routCsSrcDt, String locCd, String condOfcCd, String divMeasCd, String ofcClssCd, String slsActCd, String raAcctCd, String stndCostCd, String costAssBseCd, String svcTrnsPrcAmt, String bkgKnt, String cntrBxKnt, String cntrTeuQty, String vslDys, String comFlg, String costCalcRmk, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.coaCostSrcCd = coaCostSrcCd;
		this.comFlg = comFlg;
		this.vslDys = vslDys;
		this.raAcctCd = raAcctCd;
		this.creDt = creDt;
		this.pagerows = pagerows;
		this.cntrBxKnt = cntrBxKnt;
		this.locCd = locCd;
		this.ibflag = ibflag;
		this.slsActCd = slsActCd;
		this.bkgKnt = bkgKnt;
		this.routCsSrcDt = routCsSrcDt;
		this.divMeasCd = divMeasCd;
		this.comRoutSeq = comRoutSeq;
		this.routCsNo = routCsNo;
		this.updUsrId = updUsrId;
		this.stndCostCd = stndCostCd;
		this.cntrTeuQty = cntrTeuQty;
		this.updDt = updDt;
		this.costAssBseCd = costAssBseCd;
		this.svcTrnsPrcAmt = svcTrnsPrcAmt;
		this.ofcClssCd = ofcClssCd;
		this.creUsrId = creUsrId;
		this.condOfcCd = condOfcCd;
		this.costCalcRmk = costCalcRmk;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("coa_cost_src_cd", getCoaCostSrcCd());
		this.hashColumns.put("com_flg", getComFlg());
		this.hashColumns.put("vsl_dys", getVslDys());
		this.hashColumns.put("ra_acct_cd", getRaAcctCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("cntr_bx_knt", getCntrBxKnt());
		this.hashColumns.put("loc_cd", getLocCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("sls_act_cd", getSlsActCd());
		this.hashColumns.put("bkg_knt", getBkgKnt());
		this.hashColumns.put("rout_cs_src_dt", getRoutCsSrcDt());
		this.hashColumns.put("div_meas_cd", getDivMeasCd());
		this.hashColumns.put("com_rout_seq", getComRoutSeq());
		this.hashColumns.put("rout_cs_no", getRoutCsNo());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("stnd_cost_cd", getStndCostCd());
		this.hashColumns.put("cntr_teu_qty", getCntrTeuQty());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cost_ass_bse_cd", getCostAssBseCd());
		this.hashColumns.put("svc_trns_prc_amt", getSvcTrnsPrcAmt());
		this.hashColumns.put("ofc_clss_cd", getOfcClssCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("cond_ofc_cd", getCondOfcCd());
		this.hashColumns.put("cost_calc_rmk", getCostCalcRmk());
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
		this.hashFields.put("ra_acct_cd", "raAcctCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("cntr_bx_knt", "cntrBxKnt");
		this.hashFields.put("loc_cd", "locCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("sls_act_cd", "slsActCd");
		this.hashFields.put("bkg_knt", "bkgKnt");
		this.hashFields.put("rout_cs_src_dt", "routCsSrcDt");
		this.hashFields.put("div_meas_cd", "divMeasCd");
		this.hashFields.put("com_rout_seq", "comRoutSeq");
		this.hashFields.put("rout_cs_no", "routCsNo");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("stnd_cost_cd", "stndCostCd");
		this.hashFields.put("cntr_teu_qty", "cntrTeuQty");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cost_ass_bse_cd", "costAssBseCd");
		this.hashFields.put("svc_trns_prc_amt", "svcTrnsPrcAmt");
		this.hashFields.put("ofc_clss_cd", "ofcClssCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("cond_ofc_cd", "condOfcCd");
		this.hashFields.put("cost_calc_rmk", "costCalcRmk");
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
	 * @return raAcctCd
	 */
	public String getRaAcctCd() {
		return this.raAcctCd;
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
	 * @return routCsSrcDt
	 */
	public String getRoutCsSrcDt() {
		return this.routCsSrcDt;
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
	 * @return comRoutSeq
	 */
	public String getComRoutSeq() {
		return this.comRoutSeq;
	}
	
	/**
	 * Column Info
	 * @return routCsNo
	 */
	public String getRoutCsNo() {
		return this.routCsNo;
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
	 * @return creUsrId
	 */
	public String getCreUsrId() {
		return this.creUsrId;
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
	 * @return costCalcRmk
	 */
	public String getCostCalcRmk() {
		return this.costCalcRmk;
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
	 * @param raAcctCd
	 */
	public void setRaAcctCd(String raAcctCd) {
		this.raAcctCd = raAcctCd;
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
	 * @param routCsSrcDt
	 */
	public void setRoutCsSrcDt(String routCsSrcDt) {
		this.routCsSrcDt = routCsSrcDt;
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
	 * @param comRoutSeq
	 */
	public void setComRoutSeq(String comRoutSeq) {
		this.comRoutSeq = comRoutSeq;
	}
	
	/**
	 * Column Info
	 * @param routCsNo
	 */
	public void setRoutCsNo(String routCsNo) {
		this.routCsNo = routCsNo;
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
	 * @param creUsrId
	 */
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
	}
	
	/**
	 * Column Info
	 * @param condOfcCd
	 */
	public void setCondOfcCd(String condOfcCd) {
		this.condOfcCd = condOfcCd;
	}
	
	/**
	 * Column Info
	 * @param costCalcRmk
	 */
	public void setCostCalcRmk(String costCalcRmk) {
		this.costCalcRmk = costCalcRmk;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setCoaCostSrcCd(JSPUtil.getParameter(request, "coa_cost_src_cd", ""));
		setComFlg(JSPUtil.getParameter(request, "com_flg", ""));
		setVslDys(JSPUtil.getParameter(request, "vsl_dys", ""));
		setRaAcctCd(JSPUtil.getParameter(request, "ra_acct_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setCntrBxKnt(JSPUtil.getParameter(request, "cntr_bx_knt", ""));
		setLocCd(JSPUtil.getParameter(request, "loc_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setSlsActCd(JSPUtil.getParameter(request, "sls_act_cd", ""));
		setBkgKnt(JSPUtil.getParameter(request, "bkg_knt", ""));
		setRoutCsSrcDt(JSPUtil.getParameter(request, "rout_cs_src_dt", ""));
		setDivMeasCd(JSPUtil.getParameter(request, "div_meas_cd", ""));
		setComRoutSeq(JSPUtil.getParameter(request, "com_rout_seq", ""));
		setRoutCsNo(JSPUtil.getParameter(request, "rout_cs_no", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setStndCostCd(JSPUtil.getParameter(request, "stnd_cost_cd", ""));
		setCntrTeuQty(JSPUtil.getParameter(request, "cntr_teu_qty", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCostAssBseCd(JSPUtil.getParameter(request, "cost_ass_bse_cd", ""));
		setSvcTrnsPrcAmt(JSPUtil.getParameter(request, "svc_trns_prc_amt", ""));
		setOfcClssCd(JSPUtil.getParameter(request, "ofc_clss_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setCondOfcCd(JSPUtil.getParameter(request, "cond_ofc_cd", ""));
		setCostCalcRmk(JSPUtil.getParameter(request, "cost_calc_rmk", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return PriPrsUsdRoutEstmCostVO[]
	 */
	public PriPrsUsdRoutEstmCostVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return PriPrsUsdRoutEstmCostVO[]
	 */
	public PriPrsUsdRoutEstmCostVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		PriPrsUsdRoutEstmCostVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] coaCostSrcCd = (JSPUtil.getParameter(request, prefix	+ "coa_cost_src_cd", length));
			String[] comFlg = (JSPUtil.getParameter(request, prefix	+ "com_flg", length));
			String[] vslDys = (JSPUtil.getParameter(request, prefix	+ "vsl_dys", length));
			String[] raAcctCd = (JSPUtil.getParameter(request, prefix	+ "ra_acct_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] cntrBxKnt = (JSPUtil.getParameter(request, prefix	+ "cntr_bx_knt", length));
			String[] locCd = (JSPUtil.getParameter(request, prefix	+ "loc_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] slsActCd = (JSPUtil.getParameter(request, prefix	+ "sls_act_cd", length));
			String[] bkgKnt = (JSPUtil.getParameter(request, prefix	+ "bkg_knt", length));
			String[] routCsSrcDt = (JSPUtil.getParameter(request, prefix	+ "rout_cs_src_dt", length));
			String[] divMeasCd = (JSPUtil.getParameter(request, prefix	+ "div_meas_cd", length));
			String[] comRoutSeq = (JSPUtil.getParameter(request, prefix	+ "com_rout_seq", length));
			String[] routCsNo = (JSPUtil.getParameter(request, prefix	+ "rout_cs_no", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] stndCostCd = (JSPUtil.getParameter(request, prefix	+ "stnd_cost_cd", length));
			String[] cntrTeuQty = (JSPUtil.getParameter(request, prefix	+ "cntr_teu_qty", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] costAssBseCd = (JSPUtil.getParameter(request, prefix	+ "cost_ass_bse_cd", length));
			String[] svcTrnsPrcAmt = (JSPUtil.getParameter(request, prefix	+ "svc_trns_prc_amt", length));
			String[] ofcClssCd = (JSPUtil.getParameter(request, prefix	+ "ofc_clss_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] condOfcCd = (JSPUtil.getParameter(request, prefix	+ "cond_ofc_cd", length));
			String[] costCalcRmk = (JSPUtil.getParameter(request, prefix	+ "cost_calc_rmk", length));
			
			for (int i = 0; i < length; i++) {
				model = new PriPrsUsdRoutEstmCostVO();
				if (coaCostSrcCd[i] != null)
					model.setCoaCostSrcCd(coaCostSrcCd[i]);
				if (comFlg[i] != null)
					model.setComFlg(comFlg[i]);
				if (vslDys[i] != null)
					model.setVslDys(vslDys[i]);
				if (raAcctCd[i] != null)
					model.setRaAcctCd(raAcctCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
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
				if (routCsSrcDt[i] != null)
					model.setRoutCsSrcDt(routCsSrcDt[i]);
				if (divMeasCd[i] != null)
					model.setDivMeasCd(divMeasCd[i]);
				if (comRoutSeq[i] != null)
					model.setComRoutSeq(comRoutSeq[i]);
				if (routCsNo[i] != null)
					model.setRoutCsNo(routCsNo[i]);
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
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (condOfcCd[i] != null)
					model.setCondOfcCd(condOfcCd[i]);
				if (costCalcRmk[i] != null)
					model.setCostCalcRmk(costCalcRmk[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getPriPrsUsdRoutEstmCostVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return PriPrsUsdRoutEstmCostVO[]
	 */
	public PriPrsUsdRoutEstmCostVO[] getPriPrsUsdRoutEstmCostVOs(){
		PriPrsUsdRoutEstmCostVO[] vos = (PriPrsUsdRoutEstmCostVO[])models.toArray(new PriPrsUsdRoutEstmCostVO[models.size()]);
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
		this.coaCostSrcCd = this.coaCostSrcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.comFlg = this.comFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslDys = this.vslDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.raAcctCd = this.raAcctCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrBxKnt = this.cntrBxKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.locCd = this.locCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slsActCd = this.slsActCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgKnt = this.bkgKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.routCsSrcDt = this.routCsSrcDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.divMeasCd = this.divMeasCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.comRoutSeq = this.comRoutSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.routCsNo = this.routCsNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stndCostCd = this.stndCostCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTeuQty = this.cntrTeuQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costAssBseCd = this.costAssBseCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.svcTrnsPrcAmt = this.svcTrnsPrcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcClssCd = this.ofcClssCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.condOfcCd = this.condOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costCalcRmk = this.costCalcRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
