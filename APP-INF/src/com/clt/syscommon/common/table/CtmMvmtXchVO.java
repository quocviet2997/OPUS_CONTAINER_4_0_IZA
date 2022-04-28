/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CtmMvmtXchVO.java
*@FileTitle : CtmMvmtXchVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.04.27
*@LastModifier : 우경민
*@LastVersion : 1.0
* 2009.04.27 우경민 
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
 * - PDTO(Data Transfer Object including Parameters)<br>
 * - 관련 Event에서 작성, 서버실행요청시 PDTO의 역할을 수행하는 Value Object<br>
 *
 * @author 우경민
 * @since J2EE 1.5
 */

public class CtmMvmtXchVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CtmMvmtXchVO> models = new ArrayList<CtmMvmtXchVO>();
	
	/* Column Info */
	private String cntrXchRefYr = null;
	/* Column Info */
	private String xchCntrTpszCd = null;
	/* Column Info */
	private String xchCntrCycNo = null;
	/* Column Info */
	private String orgYdCd = null;
	/* Column Info */
	private String cnmvCycNo = null;
	/* Column Info */
	private String preCnmvStsCd = null;
	/* Column Info */
	private String creLoclDt = null;
	/* Column Info */
	private String cnmvYr = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String xchCntrYr = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String xchCnmvIdNo = null;
	/* Column Info */
	private String cntrNo = null;
	/* Column Info */
	private String cnmvIdNo = null;
	/* Column Info */
	private String cntrTpszCd = null;
	/* Column Info */
	private String cntrXchRefMon = null;
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String cntrXchSeq = null;
	/* Column Info */
	private String updLoclDt = null;
	/* Column Info */
	private String xchOfcCd = null;
	/* Column Info */
	private String xchCntrNo = null;
	/* Column Info */
	private String cnmvStsCd = null;
	/* Column Info */
	private String cntrXchRefSeq = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String xchRmk = null;
	/* Page Number */
	private String pagerows = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CtmMvmtXchVO() {}

	public CtmMvmtXchVO(String ibflag, String pagerows, String cntrNo, String cnmvYr, String cnmvIdNo, String cntrXchRefSeq, String cntrXchSeq, String cntrTpszCd, String cnmvCycNo, String cnmvStsCd, String xchCntrNo, String xchCntrYr, String xchCnmvIdNo, String xchCntrTpszCd, String xchCntrCycNo, String preCnmvStsCd, String xchRmk, String xchOfcCd, String cntrXchRefYr, String cntrXchRefMon, String orgYdCd, String creUsrId, String creDt, String creLoclDt, String updUsrId, String updDt, String updLoclDt) {
		this.cntrXchRefYr = cntrXchRefYr;
		this.xchCntrTpszCd = xchCntrTpszCd;
		this.xchCntrCycNo = xchCntrCycNo;
		this.orgYdCd = orgYdCd;
		this.cnmvCycNo = cnmvCycNo;
		this.preCnmvStsCd = preCnmvStsCd;
		this.creLoclDt = creLoclDt;
		this.cnmvYr = cnmvYr;
		this.updUsrId = updUsrId;
		this.xchCntrYr = xchCntrYr;
		this.updDt = updDt;
		this.xchCnmvIdNo = xchCnmvIdNo;
		this.cntrNo = cntrNo;
		this.cnmvIdNo = cnmvIdNo;
		this.cntrTpszCd = cntrTpszCd;
		this.cntrXchRefMon = cntrXchRefMon;
		this.ibflag = ibflag;
		this.cntrXchSeq = cntrXchSeq;
		this.updLoclDt = updLoclDt;
		this.xchOfcCd = xchOfcCd;
		this.xchCntrNo = xchCntrNo;
		this.cnmvStsCd = cnmvStsCd;
		this.cntrXchRefSeq = cntrXchRefSeq;
		this.creDt = creDt;
		this.creUsrId = creUsrId;
		this.xchRmk = xchRmk;
		this.pagerows = pagerows;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("cntr_xch_ref_yr", getCntrXchRefYr());
		this.hashColumns.put("xch_cntr_tpsz_cd", getXchCntrTpszCd());
		this.hashColumns.put("xch_cntr_cyc_no", getXchCntrCycNo());
		this.hashColumns.put("org_yd_cd", getOrgYdCd());
		this.hashColumns.put("cnmv_cyc_no", getCnmvCycNo());
		this.hashColumns.put("pre_cnmv_sts_cd", getPreCnmvStsCd());
		this.hashColumns.put("cre_locl_dt", getCreLoclDt());
		this.hashColumns.put("cnmv_yr", getCnmvYr());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("xch_cntr_yr", getXchCntrYr());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("xch_cnmv_id_no", getXchCnmvIdNo());
		this.hashColumns.put("cntr_no", getCntrNo());
		this.hashColumns.put("cnmv_id_no", getCnmvIdNo());
		this.hashColumns.put("cntr_tpsz_cd", getCntrTpszCd());
		this.hashColumns.put("cntr_xch_ref_mon", getCntrXchRefMon());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cntr_xch_seq", getCntrXchSeq());
		this.hashColumns.put("upd_locl_dt", getUpdLoclDt());
		this.hashColumns.put("xch_ofc_cd", getXchOfcCd());
		this.hashColumns.put("xch_cntr_no", getXchCntrNo());
		this.hashColumns.put("cnmv_sts_cd", getCnmvStsCd());
		this.hashColumns.put("cntr_xch_ref_seq", getCntrXchRefSeq());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("xch_rmk", getXchRmk());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("cntr_xch_ref_yr", "cntrXchRefYr");
		this.hashFields.put("xch_cntr_tpsz_cd", "xchCntrTpszCd");
		this.hashFields.put("xch_cntr_cyc_no", "xchCntrCycNo");
		this.hashFields.put("org_yd_cd", "orgYdCd");
		this.hashFields.put("cnmv_cyc_no", "cnmvCycNo");
		this.hashFields.put("pre_cnmv_sts_cd", "preCnmvStsCd");
		this.hashFields.put("cre_locl_dt", "creLoclDt");
		this.hashFields.put("cnmv_yr", "cnmvYr");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("xch_cntr_yr", "xchCntrYr");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("xch_cnmv_id_no", "xchCnmvIdNo");
		this.hashFields.put("cntr_no", "cntrNo");
		this.hashFields.put("cnmv_id_no", "cnmvIdNo");
		this.hashFields.put("cntr_tpsz_cd", "cntrTpszCd");
		this.hashFields.put("cntr_xch_ref_mon", "cntrXchRefMon");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cntr_xch_seq", "cntrXchSeq");
		this.hashFields.put("upd_locl_dt", "updLoclDt");
		this.hashFields.put("xch_ofc_cd", "xchOfcCd");
		this.hashFields.put("xch_cntr_no", "xchCntrNo");
		this.hashFields.put("cnmv_sts_cd", "cnmvStsCd");
		this.hashFields.put("cntr_xch_ref_seq", "cntrXchRefSeq");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("xch_rmk", "xchRmk");
		this.hashFields.put("pagerows", "pagerows");
		return this.hashFields;
	}
	
	public String getCntrXchRefYr() {
		return this.cntrXchRefYr;
	}
	public String getXchCntrTpszCd() {
		return this.xchCntrTpszCd;
	}
	public String getXchCntrCycNo() {
		return this.xchCntrCycNo;
	}
	public String getOrgYdCd() {
		return this.orgYdCd;
	}
	public String getCnmvCycNo() {
		return this.cnmvCycNo;
	}
	public String getPreCnmvStsCd() {
		return this.preCnmvStsCd;
	}
	public String getCreLoclDt() {
		return this.creLoclDt;
	}
	public String getCnmvYr() {
		return this.cnmvYr;
	}
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	public String getXchCntrYr() {
		return this.xchCntrYr;
	}
	public String getUpdDt() {
		return this.updDt;
	}
	public String getXchCnmvIdNo() {
		return this.xchCnmvIdNo;
	}
	public String getCntrNo() {
		return this.cntrNo;
	}
	public String getCnmvIdNo() {
		return this.cnmvIdNo;
	}
	public String getCntrTpszCd() {
		return this.cntrTpszCd;
	}
	public String getCntrXchRefMon() {
		return this.cntrXchRefMon;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getCntrXchSeq() {
		return this.cntrXchSeq;
	}
	public String getUpdLoclDt() {
		return this.updLoclDt;
	}
	public String getXchOfcCd() {
		return this.xchOfcCd;
	}
	public String getXchCntrNo() {
		return this.xchCntrNo;
	}
	public String getCnmvStsCd() {
		return this.cnmvStsCd;
	}
	public String getCntrXchRefSeq() {
		return this.cntrXchRefSeq;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getXchRmk() {
		return this.xchRmk;
	}
	public String getPagerows() {
		return this.pagerows;
	}

	public void setCntrXchRefYr(String cntrXchRefYr) {
		this.cntrXchRefYr = cntrXchRefYr;
		//this.cntrXchRefYr=true;
	}
	public void setXchCntrTpszCd(String xchCntrTpszCd) {
		this.xchCntrTpszCd = xchCntrTpszCd;
		//this.xchCntrTpszCd=true;
	}
	public void setXchCntrCycNo(String xchCntrCycNo) {
		this.xchCntrCycNo = xchCntrCycNo;
		//this.xchCntrCycNo=true;
	}
	public void setOrgYdCd(String orgYdCd) {
		this.orgYdCd = orgYdCd;
		//this.orgYdCd=true;
	}
	public void setCnmvCycNo(String cnmvCycNo) {
		this.cnmvCycNo = cnmvCycNo;
		//this.cnmvCycNo=true;
	}
	public void setPreCnmvStsCd(String preCnmvStsCd) {
		this.preCnmvStsCd = preCnmvStsCd;
		//this.preCnmvStsCd=true;
	}
	public void setCreLoclDt(String creLoclDt) {
		this.creLoclDt = creLoclDt;
		//this.creLoclDt=true;
	}
	public void setCnmvYr(String cnmvYr) {
		this.cnmvYr = cnmvYr;
		//this.cnmvYr=true;
	}
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void setXchCntrYr(String xchCntrYr) {
		this.xchCntrYr = xchCntrYr;
		//this.xchCntrYr=true;
	}
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setXchCnmvIdNo(String xchCnmvIdNo) {
		this.xchCnmvIdNo = xchCnmvIdNo;
		//this.xchCnmvIdNo=true;
	}
	public void setCntrNo(String cntrNo) {
		this.cntrNo = cntrNo;
		//this.cntrNo=true;
	}
	public void setCnmvIdNo(String cnmvIdNo) {
		this.cnmvIdNo = cnmvIdNo;
		//this.cnmvIdNo=true;
	}
	public void setCntrTpszCd(String cntrTpszCd) {
		this.cntrTpszCd = cntrTpszCd;
		//this.cntrTpszCd=true;
	}
	public void setCntrXchRefMon(String cntrXchRefMon) {
		this.cntrXchRefMon = cntrXchRefMon;
		//this.cntrXchRefMon=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setCntrXchSeq(String cntrXchSeq) {
		this.cntrXchSeq = cntrXchSeq;
		//this.cntrXchSeq=true;
	}
	public void setUpdLoclDt(String updLoclDt) {
		this.updLoclDt = updLoclDt;
		//this.updLoclDt=true;
	}
	public void setXchOfcCd(String xchOfcCd) {
		this.xchOfcCd = xchOfcCd;
		//this.xchOfcCd=true;
	}
	public void setXchCntrNo(String xchCntrNo) {
		this.xchCntrNo = xchCntrNo;
		//this.xchCntrNo=true;
	}
	public void setCnmvStsCd(String cnmvStsCd) {
		this.cnmvStsCd = cnmvStsCd;
		//this.cnmvStsCd=true;
	}
	public void setCntrXchRefSeq(String cntrXchRefSeq) {
		this.cntrXchRefSeq = cntrXchRefSeq;
		//this.cntrXchRefSeq=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setXchRmk(String xchRmk) {
		this.xchRmk = xchRmk;
		//this.xchRmk=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setCntrXchRefYr(JSPUtil.getParameter(request, "cntr_xch_ref_yr", ""));
		setXchCntrTpszCd(JSPUtil.getParameter(request, "xch_cntr_tpsz_cd", ""));
		setXchCntrCycNo(JSPUtil.getParameter(request, "xch_cntr_cyc_no", ""));
		setOrgYdCd(JSPUtil.getParameter(request, "org_yd_cd", ""));
		setCnmvCycNo(JSPUtil.getParameter(request, "cnmv_cyc_no", ""));
		setPreCnmvStsCd(JSPUtil.getParameter(request, "pre_cnmv_sts_cd", ""));
		setCreLoclDt(JSPUtil.getParameter(request, "cre_locl_dt", ""));
		setCnmvYr(JSPUtil.getParameter(request, "cnmv_yr", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setXchCntrYr(JSPUtil.getParameter(request, "xch_cntr_yr", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setXchCnmvIdNo(JSPUtil.getParameter(request, "xch_cnmv_id_no", ""));
		setCntrNo(JSPUtil.getParameter(request, "cntr_no", ""));
		setCnmvIdNo(JSPUtil.getParameter(request, "cnmv_id_no", ""));
		setCntrTpszCd(JSPUtil.getParameter(request, "cntr_tpsz_cd", ""));
		setCntrXchRefMon(JSPUtil.getParameter(request, "cntr_xch_ref_mon", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCntrXchSeq(JSPUtil.getParameter(request, "cntr_xch_seq", ""));
		setUpdLoclDt(JSPUtil.getParameter(request, "upd_locl_dt", ""));
		setXchOfcCd(JSPUtil.getParameter(request, "xch_ofc_cd", ""));
		setXchCntrNo(JSPUtil.getParameter(request, "xch_cntr_no", ""));
		setCnmvStsCd(JSPUtil.getParameter(request, "cnmv_sts_cd", ""));
		setCntrXchRefSeq(JSPUtil.getParameter(request, "cntr_xch_ref_seq", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setXchRmk(JSPUtil.getParameter(request, "xch_rmk", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	public CtmMvmtXchVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public CtmMvmtXchVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CtmMvmtXchVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] cntrXchRefYr = (JSPUtil.getParameter(request, prefix	+ "cntr_xch_ref_yr".trim(), length));
			String[] xchCntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "xch_cntr_tpsz_cd".trim(), length));
			String[] xchCntrCycNo = (JSPUtil.getParameter(request, prefix	+ "xch_cntr_cyc_no".trim(), length));
			String[] orgYdCd = (JSPUtil.getParameter(request, prefix	+ "org_yd_cd".trim(), length));
			String[] cnmvCycNo = (JSPUtil.getParameter(request, prefix	+ "cnmv_cyc_no".trim(), length));
			String[] preCnmvStsCd = (JSPUtil.getParameter(request, prefix	+ "pre_cnmv_sts_cd".trim(), length));
			String[] creLoclDt = (JSPUtil.getParameter(request, prefix	+ "cre_locl_dt".trim(), length));
			String[] cnmvYr = (JSPUtil.getParameter(request, prefix	+ "cnmv_yr".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] xchCntrYr = (JSPUtil.getParameter(request, prefix	+ "xch_cntr_yr".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] xchCnmvIdNo = (JSPUtil.getParameter(request, prefix	+ "xch_cnmv_id_no".trim(), length));
			String[] cntrNo = (JSPUtil.getParameter(request, prefix	+ "cntr_no".trim(), length));
			String[] cnmvIdNo = (JSPUtil.getParameter(request, prefix	+ "cnmv_id_no".trim(), length));
			String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_cd".trim(), length));
			String[] cntrXchRefMon = (JSPUtil.getParameter(request, prefix	+ "cntr_xch_ref_mon".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] cntrXchSeq = (JSPUtil.getParameter(request, prefix	+ "cntr_xch_seq".trim(), length));
			String[] updLoclDt = (JSPUtil.getParameter(request, prefix	+ "upd_locl_dt".trim(), length));
			String[] xchOfcCd = (JSPUtil.getParameter(request, prefix	+ "xch_ofc_cd".trim(), length));
			String[] xchCntrNo = (JSPUtil.getParameter(request, prefix	+ "xch_cntr_no".trim(), length));
			String[] cnmvStsCd = (JSPUtil.getParameter(request, prefix	+ "cnmv_sts_cd".trim(), length));
			String[] cntrXchRefSeq = (JSPUtil.getParameter(request, prefix	+ "cntr_xch_ref_seq".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] xchRmk = (JSPUtil.getParameter(request, prefix	+ "xch_rmk".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new CtmMvmtXchVO();
				if (cntrXchRefYr[i] != null)
					model.setCntrXchRefYr(cntrXchRefYr[i]);
				if (xchCntrTpszCd[i] != null)
					model.setXchCntrTpszCd(xchCntrTpszCd[i]);
				if (xchCntrCycNo[i] != null)
					model.setXchCntrCycNo(xchCntrCycNo[i]);
				if (orgYdCd[i] != null)
					model.setOrgYdCd(orgYdCd[i]);
				if (cnmvCycNo[i] != null)
					model.setCnmvCycNo(cnmvCycNo[i]);
				if (preCnmvStsCd[i] != null)
					model.setPreCnmvStsCd(preCnmvStsCd[i]);
				if (creLoclDt[i] != null)
					model.setCreLoclDt(creLoclDt[i]);
				if (cnmvYr[i] != null)
					model.setCnmvYr(cnmvYr[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (xchCntrYr[i] != null)
					model.setXchCntrYr(xchCntrYr[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (xchCnmvIdNo[i] != null)
					model.setXchCnmvIdNo(xchCnmvIdNo[i]);
				if (cntrNo[i] != null)
					model.setCntrNo(cntrNo[i]);
				if (cnmvIdNo[i] != null)
					model.setCnmvIdNo(cnmvIdNo[i]);
				if (cntrTpszCd[i] != null)
					model.setCntrTpszCd(cntrTpszCd[i]);
				if (cntrXchRefMon[i] != null)
					model.setCntrXchRefMon(cntrXchRefMon[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (cntrXchSeq[i] != null)
					model.setCntrXchSeq(cntrXchSeq[i]);
				if (updLoclDt[i] != null)
					model.setUpdLoclDt(updLoclDt[i]);
				if (xchOfcCd[i] != null)
					model.setXchOfcCd(xchOfcCd[i]);
				if (xchCntrNo[i] != null)
					model.setXchCntrNo(xchCntrNo[i]);
				if (cnmvStsCd[i] != null)
					model.setCnmvStsCd(cnmvStsCd[i]);
				if (cntrXchRefSeq[i] != null)
					model.setCntrXchRefSeq(cntrXchRefSeq[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (xchRmk[i] != null)
					model.setXchRmk(xchRmk[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getCtmMvmtXchVOs();
	}

	public CtmMvmtXchVO[] getCtmMvmtXchVOs(){
		CtmMvmtXchVO[] vos = (CtmMvmtXchVO[])models.toArray(new CtmMvmtXchVO[models.size()]);
		return vos;
	}
	
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
		} catch (Exception ex) {}
		return ret.toString();
	}
	
	/**
	 * 각 클래스 해당하는 필드 정보를 배열에 담는다 
	 * @param field
	 * @param i
	 * @return String[]
	 * @throws IllegalAccessException
	 */
	private String[] getField(Field[] field, int i) throws IllegalAccessException {
		String[] arr;
		try{
			arr = (String[]) field[i].get(this);
		}catch(Exception ex){
			arr = new String[1];
			arr[0] = String.valueOf(field[i].get(this));
		}
		return arr;
	}
	
	/**
	* DataFormat 설정
	*/
	public void onDataFormat(){
		this.cntrXchRefYr = this.cntrXchRefYr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.xchCntrTpszCd = this.xchCntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.xchCntrCycNo = this.xchCntrCycNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgYdCd = this.orgYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cnmvCycNo = this.cnmvCycNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.preCnmvStsCd = this.preCnmvStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creLoclDt = this.creLoclDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cnmvYr = this.cnmvYr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.xchCntrYr = this.xchCntrYr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.xchCnmvIdNo = this.xchCnmvIdNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrNo = this.cntrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cnmvIdNo = this.cnmvIdNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszCd = this.cntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrXchRefMon = this.cntrXchRefMon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrXchSeq = this.cntrXchSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updLoclDt = this.updLoclDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.xchOfcCd = this.xchOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.xchCntrNo = this.xchCntrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cnmvStsCd = this.cnmvStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrXchRefSeq = this.cntrXchRefSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.xchRmk = this.xchRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
