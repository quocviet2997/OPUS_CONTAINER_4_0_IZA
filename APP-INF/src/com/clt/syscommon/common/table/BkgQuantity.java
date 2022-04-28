/*=========================================================
*Copyright(c) 2008 CyberLogitec
*@FileName : BkgQuantity.java
*@FileTitle : Bkg Booking
*Open Issues :
*Change history :
*@LastModifyDate : 2008.12.29
*@LastModifier : 정윤태
*@LastVersion : 1.0
* 2008.12.29 정윤태
* 1.0 최초 생성
=========================================================*/

package com.clt.syscommon.common.table;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import com.clt.framework.component.util.JSPUtil;

/**
 * Table Value Ojbect<br>
 * - PDTO(Data Transfer Object including Parameters)<br>
 * - 관련 Event에서 작성, 서버실행요청시 PDTO의 역할을 수행하는 Value Object<br>
 *
 * @author 정윤태
 * @see BkgCre079HTMLAction 참조
 * @since J2EE 1.5
 */

public class BkgQuantity implements Serializable {

	private static final long serialVersionUID = 1L;
	/* 컬럼 설명	*/
	private String dcgoQty = null;
	/* 컬럼 설명	*/
	private String crrHngrSglBarQty = null;
	/* 컬럼 설명	*/
	private String eqSubstCgoQty = null;
	/* 컬럼 설명	*/
	private String obTroQty = null;
	/* 컬럼 설명	*/
	private String awkCgoQty = null;
	/* 컬럼 설명	*/
	private String creDt = null;
	/* 컬럼 설명	*/
	private String actCntrQty = null;
	/* 컬럼 설명	*/
	private String pagerows = null;
	/* 컬럼 설명	*/
	private String shprCntrQty = null;
	/* 컬럼 설명	*/
	private String crrHngrDblBarQty = null;
	/* 컬럼 설명	*/
	private String ibflag = null;
	/* 컬럼 설명	*/
	private String rcQty = null;
	/* 컬럼 설명	*/
	private String cntrTpszCd = null;
	/* 컬럼 설명	*/
	private String destCntrQty = null;
	/* 컬럼 설명	*/
	private String shprCntrTpszCd = null;
	/* 컬럼 설명	*/
	private String updUsrId = null;
	/* 컬럼 설명	*/
	private String merHngrQty = null;
	/* 컬럼 설명	*/
	private String updDt = null;
	/* 컬럼 설명	*/
	private String bkgNoSplit = null;
	/* 컬럼 설명	*/
	private String crrHngrQty = null;
	/* 컬럼 설명	*/
	private String orgCntrQty = null;
	/* 컬럼 설명	*/
	private String eqSubstCntrTpszCd = null;
	/* 컬럼 설명	*/
	private String bkgNo = null;
	/* 컬럼 설명	*/
	private String creUsrId = null;
	/* 컬럼 설명	*/
	private String bbCgoQty = null;
	/* 컬럼 설명	*/
	private String ibTroQty = null;
	/* 컬럼 설명	*/
	private String opCntrQty = null;
	/* 컬럼 설명	*/
	private String socQty = null;
	/* 컬럼 설명	*/
	private String bkgOfcCd = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumn = new HashMap<String, String>();

	public BkgQuantity() {}

	public BkgQuantity(String ibflag, String pagerows, String bkgNo, String bkgNoSplit, String cntrTpszCd, String opCntrQty, String actCntrQty, String dcgoQty, String awkCgoQty, String rcQty, String bbCgoQty, String socQty, String obTroQty, String ibTroQty, String eqSubstCntrTpszCd, String eqSubstCgoQty, String shprCntrTpszCd, String shprCntrQty, String merHngrQty, String crrHngrQty, String crrHngrSglBarQty, String crrHngrDblBarQty, String orgCntrQty, String destCntrQty, String creUsrId, String creDt, String updUsrId, String updDt, String bkgOfcCd) {
		this.dcgoQty = dcgoQty;
		this.crrHngrSglBarQty = crrHngrSglBarQty;
		this.eqSubstCgoQty = eqSubstCgoQty;
		this.obTroQty = obTroQty;
		this.awkCgoQty = awkCgoQty;
		this.creDt = creDt;
		this.actCntrQty = actCntrQty;
		this.pagerows = pagerows;
		this.shprCntrQty = shprCntrQty;
		this.crrHngrDblBarQty = crrHngrDblBarQty;
		this.ibflag = ibflag;
		this.rcQty = rcQty;
		this.cntrTpszCd = cntrTpszCd;
		this.destCntrQty = destCntrQty;
		this.shprCntrTpszCd = shprCntrTpszCd;
		this.updUsrId = updUsrId;
		this.merHngrQty = merHngrQty;
		this.updDt = updDt;
		this.bkgNoSplit = bkgNoSplit;
		this.crrHngrQty = crrHngrQty;
		this.orgCntrQty = orgCntrQty;
		this.eqSubstCntrTpszCd = eqSubstCntrTpszCd;
		this.bkgNo = bkgNo;
		this.creUsrId = creUsrId;
		this.bbCgoQty = bbCgoQty;
		this.ibTroQty = ibTroQty;
		this.opCntrQty = opCntrQty;
		this.socQty = socQty;
		this.bkgOfcCd = bkgOfcCd;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValue(){
		this.hashColumn.put("dcgo_qty", getDcgoQty());
		this.hashColumn.put("crr_hngr_sgl_bar_qty", getCrrHngrSglBarQty());
		this.hashColumn.put("eq_subst_cgo_qty", getEqSubstCgoQty());
		this.hashColumn.put("ob_tro_qty", getObTroQty());
		this.hashColumn.put("awk_cgo_qty", getAwkCgoQty());
		this.hashColumn.put("cre_dt", getCreDt());
		this.hashColumn.put("act_cntr_qty", getActCntrQty());
		this.hashColumn.put("pagerows", getPage_rows());
		this.hashColumn.put("shpr_cntr_qty", getShprCntrQty());
		this.hashColumn.put("crr_hngr_dbl_bar_qty", getCrrHngrDblBarQty());
		this.hashColumn.put("ibflag", getIbflag());
		this.hashColumn.put("rc_qty", getRcQty());
		this.hashColumn.put("cntr_tpsz_cd", getCntrTpszCd());
		this.hashColumn.put("dest_cntr_qty", getDestCntrQty());
		this.hashColumn.put("shpr_cntr_tpsz_cd", getShprCntrTpszCd());
		this.hashColumn.put("upd_usr_id", getUpdUsrId());
		this.hashColumn.put("mer_hngr_qty", getMerHngrQty());
		this.hashColumn.put("upd_dt", getUpdDt());
		this.hashColumn.put("bkg_no_split", getBkgNoSplit());
		this.hashColumn.put("crr_hngr_qty", getCrrHngrQty());
		this.hashColumn.put("org_cntr_qty", getOrgCntrQty());
		this.hashColumn.put("eq_subst_cntr_tpsz_cd", getEqSubstCntrTpszCd());
		this.hashColumn.put("bkg_no", getBkgNo());
		this.hashColumn.put("cre_usr_id", getCreUsrId());
		this.hashColumn.put("bb_cgo_qty", getBbCgoQty());
		this.hashColumn.put("ib_tro_qty", getIbTroQty());
		this.hashColumn.put("op_cntr_qty", getOpCntrQty());
		this.hashColumn.put("soc_qty", getSocQty());
		this.hashColumn.put("bkg_ofc_cd", getBkgOfcCd());
		return this.hashColumn;
	}
	
	public String getDcgoQty() {
		return this.dcgoQty;
	}
	public String getCrrHngrSglBarQty() {
		return this.crrHngrSglBarQty;
	}
	public String getEqSubstCgoQty() {
		return this.eqSubstCgoQty;
	}
	public String getObTroQty() {
		return this.obTroQty;
	}
	public String getAwkCgoQty() {
		return this.awkCgoQty;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getActCntrQty() {
		return this.actCntrQty;
	}
	public String getPage_rows() {
		return this.pagerows;
	}
	public String getShprCntrQty() {
		return this.shprCntrQty;
	}
	public String getCrrHngrDblBarQty() {
		return this.crrHngrDblBarQty;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getRcQty() {
		return this.rcQty;
	}
	public String getCntrTpszCd() {
		return this.cntrTpszCd;
	}
	public String getDestCntrQty() {
		return this.destCntrQty;
	}
	public String getShprCntrTpszCd() {
		return this.shprCntrTpszCd;
	}
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	public String getMerHngrQty() {
		return this.merHngrQty;
	}
	public String getUpdDt() {
		return this.updDt;
	}
	public String getBkgNoSplit() {
		return this.bkgNoSplit;
	}
	public String getCrrHngrQty() {
		return this.crrHngrQty;
	}
	public String getOrgCntrQty() {
		return this.orgCntrQty;
	}
	public String getEqSubstCntrTpszCd() {
		return this.eqSubstCntrTpszCd;
	}
	public String getBkgNo() {
		return this.bkgNo;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getBbCgoQty() {
		return this.bbCgoQty;
	}
	public String getIbTroQty() {
		return this.ibTroQty;
	}
	public String getOpCntrQty() {
		return this.opCntrQty;
	}
	public String getSocQty() {
		return this.socQty;
	}
	public String getBkgOfcCd() {
		return this.bkgOfcCd;
	}

	public void setDcgoQty(String dcgoQty) {
		this.dcgoQty = dcgoQty;
		//this.dcgoQty=true;
	}
	public void setCrrHngrSglBarQty(String crrHngrSglBarQty) {
		this.crrHngrSglBarQty = crrHngrSglBarQty;
		//this.crrHngrSglBarQty=true;
	}
	public void setEqSubstCgoQty(String eqSubstCgoQty) {
		this.eqSubstCgoQty = eqSubstCgoQty;
		//this.eqSubstCgoQty=true;
	}
	public void setObTroQty(String obTroQty) {
		this.obTroQty = obTroQty;
		//this.obTroQty=true;
	}
	public void setAwkCgoQty(String awkCgoQty) {
		this.awkCgoQty = awkCgoQty;
		//this.awkCgoQty=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setActCntrQty(String actCntrQty) {
		this.actCntrQty = actCntrQty;
		//this.actCntrQty=true;
	}
	public void setPage_rows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void setShprCntrQty(String shprCntrQty) {
		this.shprCntrQty = shprCntrQty;
		//this.shprCntrQty=true;
	}
	public void setCrrHngrDblBarQty(String crrHngrDblBarQty) {
		this.crrHngrDblBarQty = crrHngrDblBarQty;
		//this.crrHngrDblBarQty=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setRcQty(String rcQty) {
		this.rcQty = rcQty;
		//this.rcQty=true;
	}
	public void setCntrTpszCd(String cntrTpszCd) {
		this.cntrTpszCd = cntrTpszCd;
		//this.cntrTpszCd=true;
	}
	public void setDestCntrQty(String destCntrQty) {
		this.destCntrQty = destCntrQty;
		//this.destCntrQty=true;
	}
	public void setShprCntrTpszCd(String shprCntrTpszCd) {
		this.shprCntrTpszCd = shprCntrTpszCd;
		//this.shprCntrTpszCd=true;
	}
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void setMerHngrQty(String merHngrQty) {
		this.merHngrQty = merHngrQty;
		//this.merHngrQty=true;
	}
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setBkgNoSplit(String bkgNoSplit) {
		this.bkgNoSplit = bkgNoSplit;
		//this.bkgNoSplit=true;
	}
	public void setCrrHngrQty(String crrHngrQty) {
		this.crrHngrQty = crrHngrQty;
		//this.crrHngrQty=true;
	}
	public void setOrgCntrQty(String orgCntrQty) {
		this.orgCntrQty = orgCntrQty;
		//this.orgCntrQty=true;
	}
	public void setEqSubstCntrTpszCd(String eqSubstCntrTpszCd) {
		this.eqSubstCntrTpszCd = eqSubstCntrTpszCd;
		//this.eqSubstCntrTpszCd=true;
	}
	public void setBkgNo(String bkgNo) {
		this.bkgNo = bkgNo;
		//this.bkgNo=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setBbCgoQty(String bbCgoQty) {
		this.bbCgoQty = bbCgoQty;
		//this.bbCgoQty=true;
	}
	public void setIbTroQty(String ibTroQty) {
		this.ibTroQty = ibTroQty;
		//this.ibTroQty=true;
	}
	public void setOpCntrQty(String opCntrQty) {
		this.opCntrQty = opCntrQty;
		//this.opCntrQty=true;
	}
	public void setSocQty(String socQty) {
		this.socQty = socQty;
		//this.socQty=true;
	}
	public void setBkgOfcCd(String bkgOfcCd) {
		this.bkgOfcCd = bkgOfcCd;
		//this.cust_cnt_cd=true;
	}
	
	public static BkgQuantity fromRequest(HttpServletRequest request) {
		BkgQuantity model = new BkgQuantity();
		try {
			model.setDcgoQty(JSPUtil.getParameter(request, "dcgo_qty", ""));
			model.setCrrHngrSglBarQty(JSPUtil.getParameter(request, "crr_hngr_sgl_bar_qty", ""));
			model.setEqSubstCgoQty(JSPUtil.getParameter(request, "eq_subst_cgo_qty", ""));
			model.setObTroQty(JSPUtil.getParameter(request, "ob_tro_qty", ""));
			model.setAwkCgoQty(JSPUtil.getParameter(request, "awk_cgo_qty", ""));
			model.setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
			model.setActCntrQty(JSPUtil.getParameter(request, "act_cntr_qty", ""));
			model.setPage_rows(JSPUtil.getParameter(request, "pagerows", ""));
			model.setShprCntrQty(JSPUtil.getParameter(request, "shpr_cntr_qty", ""));
			model.setCrrHngrDblBarQty(JSPUtil.getParameter(request, "crr_hngr_dbl_bar_qty", ""));
			model.setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
			model.setRcQty(JSPUtil.getParameter(request, "rc_qty", ""));
			model.setCntrTpszCd(JSPUtil.getParameter(request, "cntr_tpsz_cd", ""));
			model.setDestCntrQty(JSPUtil.getParameter(request, "dest_cntr_qty", ""));
			model.setShprCntrTpszCd(JSPUtil.getParameter(request, "shpr_cntr_tpsz_cd", ""));
			model.setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
			model.setMerHngrQty(JSPUtil.getParameter(request, "mer_hngr_qty", ""));
			model.setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
			model.setBkgNoSplit(JSPUtil.getParameter(request, "bkg_no_split", ""));
			model.setCrrHngrQty(JSPUtil.getParameter(request, "crr_hngr_qty", ""));
			model.setOrgCntrQty(JSPUtil.getParameter(request, "org_cntr_qty", ""));
			model.setEqSubstCntrTpszCd(JSPUtil.getParameter(request, "eq_subst_cntr_tpsz_cd", ""));
			model.setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
			model.setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
			model.setBbCgoQty(JSPUtil.getParameter(request, "bb_cgo_qty", ""));
			model.setIbTroQty(JSPUtil.getParameter(request, "ib_tro_qty", ""));
			model.setOpCntrQty(JSPUtil.getParameter(request, "op_cntr_qty", ""));
			model.setSocQty(JSPUtil.getParameter(request, "soc_qty", ""));
			model.setBkgOfcCd(JSPUtil.getParameter(request, "bkg_ofc_cd", ""));
		} catch (Exception e) {}
		return model;
	}

	public static Collection<BkgQuantity> fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public static Collection<BkgQuantity> fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgQuantity model = null;
		Collection<BkgQuantity> models = new ArrayList<BkgQuantity>();

		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp==null)
   			return models;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] dcgoQty = (JSPUtil.getParameter(request, prefix	+ "dcgo_qty".trim(), length));
			String[] crrHngrSglBarQty = (JSPUtil.getParameter(request, prefix	+ "crr_hngr_sgl_bar_qty".trim(), length));
			String[] eqSubstCgoQty = (JSPUtil.getParameter(request, prefix	+ "eq_subst_cgo_qty".trim(), length));
			String[] obTroQty = (JSPUtil.getParameter(request, prefix	+ "ob_tro_qty".trim(), length));
			String[] awkCgoQty = (JSPUtil.getParameter(request, prefix	+ "awk_cgo_qty".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] actCntrQty = (JSPUtil.getParameter(request, prefix	+ "act_cntr_qty".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] shprCntrQty = (JSPUtil.getParameter(request, prefix	+ "shpr_cntr_qty".trim(), length));
			String[] crrHngrDblBarQty = (JSPUtil.getParameter(request, prefix	+ "crr_hngr_dbl_bar_qty".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] rcQty = (JSPUtil.getParameter(request, prefix	+ "rc_qty".trim(), length));
			String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_cd".trim(), length));
			String[] destCntrQty = (JSPUtil.getParameter(request, prefix	+ "dest_cntr_qty".trim(), length));
			String[] shprCntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "shpr_cntr_tpsz_cd".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] merHngrQty = (JSPUtil.getParameter(request, prefix	+ "mer_hngr_qty".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] bkgNoSplit = (JSPUtil.getParameter(request, prefix	+ "bkg_no_split".trim(), length));
			String[] crrHngrQty = (JSPUtil.getParameter(request, prefix	+ "crr_hngr_qty".trim(), length));
			String[] orgCntrQty = (JSPUtil.getParameter(request, prefix	+ "org_cntr_qty".trim(), length));
			String[] eqSubstCntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "eq_subst_cntr_tpsz_cd".trim(), length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] bbCgoQty = (JSPUtil.getParameter(request, prefix	+ "bb_cgo_qty".trim(), length));
			String[] ibTroQty = (JSPUtil.getParameter(request, prefix	+ "ib_tro_qty".trim(), length));
			String[] opCntrQty = (JSPUtil.getParameter(request, prefix	+ "op_cntr_qty".trim(), length));
			String[] socQty = (JSPUtil.getParameter(request, prefix	+ "soc_qty".trim(), length));
			String[] bkgOfcCd = (JSPUtil.getParameter(request, prefix	+ "bkg_ofc_cd".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgQuantity();
				if (dcgoQty[i] != null)
					model.setDcgoQty(dcgoQty[i]);
				if (crrHngrSglBarQty[i] != null)
					model.setCrrHngrSglBarQty(crrHngrSglBarQty[i]);
				if (eqSubstCgoQty[i] != null)
					model.setEqSubstCgoQty(eqSubstCgoQty[i]);
				if (obTroQty[i] != null)
					model.setObTroQty(obTroQty[i]);
				if (awkCgoQty[i] != null)
					model.setAwkCgoQty(awkCgoQty[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (actCntrQty[i] != null)
					model.setActCntrQty(actCntrQty[i]);
				if (pagerows[i] != null)
					model.setPage_rows(pagerows[i]);
				if (shprCntrQty[i] != null)
					model.setShprCntrQty(shprCntrQty[i]);
				if (crrHngrDblBarQty[i] != null)
					model.setCrrHngrDblBarQty(crrHngrDblBarQty[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (rcQty[i] != null)
					model.setRcQty(rcQty[i]);
				if (cntrTpszCd[i] != null)
					model.setCntrTpszCd(cntrTpszCd[i]);
				if (destCntrQty[i] != null)
					model.setDestCntrQty(destCntrQty[i]);
				if (shprCntrTpszCd[i] != null)
					model.setShprCntrTpszCd(shprCntrTpszCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (merHngrQty[i] != null)
					model.setMerHngrQty(merHngrQty[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (bkgNoSplit[i] != null)
					model.setBkgNoSplit(bkgNoSplit[i]);
				if (crrHngrQty[i] != null)
					model.setCrrHngrQty(crrHngrQty[i]);
				if (orgCntrQty[i] != null)
					model.setOrgCntrQty(orgCntrQty[i]);
				if (eqSubstCntrTpszCd[i] != null)
					model.setEqSubstCntrTpszCd(eqSubstCntrTpszCd[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (bbCgoQty[i] != null)
					model.setBbCgoQty(bbCgoQty[i]);
				if (ibTroQty[i] != null)
					model.setIbTroQty(ibTroQty[i]);
				if (opCntrQty[i] != null)
					model.setOpCntrQty(opCntrQty[i]);
				if (socQty[i] != null)
					model.setSocQty(socQty[i]);
				if (bkgOfcCd[i] != null)
					model.setBkgOfcCd(bkgOfcCd[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return models;
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

}
