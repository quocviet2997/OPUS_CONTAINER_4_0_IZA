/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : InvArPantosChgVO.java
*@FileTitle : InvArPantosChgVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.04.27
*@LastModifier : 김세일
*@LastVersion : 1.0
* 2009.04.27 김세일 
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
 * @author 김세일
 * @since J2EE 1.5
 */

public class InvArPantosChgVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<InvArPantosChgVO> models = new ArrayList<InvArPantosChgVO>();
	
	/* Column Info */
	private String invTaxAmt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String trfRtAmt = null;
	/* Column Info */
	private String chgSeq = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String msgNo = null;
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String drftBilSeq = null;
	/* Column Info */
	private String pantosMeasUtCd1 = null;
	/* Column Info */
	private String chgAmt = null;
	/* Column Info */
	private String pantosMeasUtCd2 = null;
	/* Column Info */
	private String currCd3 = null;
	/* Column Info */
	private String ediSndRmk = null;
	/* Column Info */
	private String currCd4 = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String blSrcNo = null;
	/* Column Info */
	private String perTpCd = null;
	/* Column Info */
	private String chgFullNm = null;
	/* Column Info */
	private String currCd2 = null;
	/* Column Info */
	private String invBilClssCd = null;
	/* Column Info */
	private String currCd1 = null;
	/* Column Info */
	private String lineNo = null;
	/* Column Info */
	private String drftBilNo = null;
	/* Column Info */
	private String arOfcCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String frgnCurrAmt = null;
	/* Column Info */
	private String pantosChgConvCd = null;
	/* Column Info */
	private String ratAsCntrQty = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public InvArPantosChgVO() {}

	public InvArPantosChgVO(String ibflag, String pagerows, String arOfcCd, String msgNo, String lineNo, String blSrcNo, String invBilClssCd, String pantosChgConvCd, String chgSeq, String chgFullNm, String drftBilSeq, String drftBilNo, String perTpCd, String ediSndRmk, String chgAmt, String currCd1, String invTaxAmt, String currCd2, String trfRtAmt, String currCd3, String pantosMeasUtCd1, String pantosMeasUtCd2, String ratAsCntrQty, String frgnCurrAmt, String currCd4, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.invTaxAmt = invTaxAmt;
		this.creDt = creDt;
		this.trfRtAmt = trfRtAmt;
		this.chgSeq = chgSeq;
		this.pagerows = pagerows;
		this.msgNo = msgNo;
		this.ibflag = ibflag;
		this.drftBilSeq = drftBilSeq;
		this.pantosMeasUtCd1 = pantosMeasUtCd1;
		this.chgAmt = chgAmt;
		this.pantosMeasUtCd2 = pantosMeasUtCd2;
		this.currCd3 = currCd3;
		this.ediSndRmk = ediSndRmk;
		this.currCd4 = currCd4;
		this.updUsrId = updUsrId;
		this.updDt = updDt;
		this.blSrcNo = blSrcNo;
		this.perTpCd = perTpCd;
		this.chgFullNm = chgFullNm;
		this.currCd2 = currCd2;
		this.invBilClssCd = invBilClssCd;
		this.currCd1 = currCd1;
		this.lineNo = lineNo;
		this.drftBilNo = drftBilNo;
		this.arOfcCd = arOfcCd;
		this.creUsrId = creUsrId;
		this.frgnCurrAmt = frgnCurrAmt;
		this.pantosChgConvCd = pantosChgConvCd;
		this.ratAsCntrQty = ratAsCntrQty;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("inv_tax_amt", getInvTaxAmt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("trf_rt_amt", getTrfRtAmt());
		this.hashColumns.put("chg_seq", getChgSeq());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("msg_no", getMsgNo());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("drft_bil_seq", getDrftBilSeq());
		this.hashColumns.put("pantos_meas_ut_cd1", getPantosMeasUtCd1());
		this.hashColumns.put("chg_amt", getChgAmt());
		this.hashColumns.put("pantos_meas_ut_cd2", getPantosMeasUtCd2());
		this.hashColumns.put("curr_cd3", getCurrCd3());
		this.hashColumns.put("edi_snd_rmk", getEdiSndRmk());
		this.hashColumns.put("curr_cd4", getCurrCd4());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("bl_src_no", getBlSrcNo());
		this.hashColumns.put("per_tp_cd", getPerTpCd());
		this.hashColumns.put("chg_full_nm", getChgFullNm());
		this.hashColumns.put("curr_cd2", getCurrCd2());
		this.hashColumns.put("inv_bil_clss_cd", getInvBilClssCd());
		this.hashColumns.put("curr_cd1", getCurrCd1());
		this.hashColumns.put("line_no", getLineNo());
		this.hashColumns.put("drft_bil_no", getDrftBilNo());
		this.hashColumns.put("ar_ofc_cd", getArOfcCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("frgn_curr_amt", getFrgnCurrAmt());
		this.hashColumns.put("pantos_chg_conv_cd", getPantosChgConvCd());
		this.hashColumns.put("rat_as_cntr_qty", getRatAsCntrQty());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("inv_tax_amt", "invTaxAmt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("trf_rt_amt", "trfRtAmt");
		this.hashFields.put("chg_seq", "chgSeq");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("msg_no", "msgNo");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("drft_bil_seq", "drftBilSeq");
		this.hashFields.put("pantos_meas_ut_cd1", "pantosMeasUtCd1");
		this.hashFields.put("chg_amt", "chgAmt");
		this.hashFields.put("pantos_meas_ut_cd2", "pantosMeasUtCd2");
		this.hashFields.put("curr_cd3", "currCd3");
		this.hashFields.put("edi_snd_rmk", "ediSndRmk");
		this.hashFields.put("curr_cd4", "currCd4");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("bl_src_no", "blSrcNo");
		this.hashFields.put("per_tp_cd", "perTpCd");
		this.hashFields.put("chg_full_nm", "chgFullNm");
		this.hashFields.put("curr_cd2", "currCd2");
		this.hashFields.put("inv_bil_clss_cd", "invBilClssCd");
		this.hashFields.put("curr_cd1", "currCd1");
		this.hashFields.put("line_no", "lineNo");
		this.hashFields.put("drft_bil_no", "drftBilNo");
		this.hashFields.put("ar_ofc_cd", "arOfcCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("frgn_curr_amt", "frgnCurrAmt");
		this.hashFields.put("pantos_chg_conv_cd", "pantosChgConvCd");
		this.hashFields.put("rat_as_cntr_qty", "ratAsCntrQty");
		return this.hashFields;
	}
	
	public String getInvTaxAmt() {
		return this.invTaxAmt;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getTrfRtAmt() {
		return this.trfRtAmt;
	}
	public String getChgSeq() {
		return this.chgSeq;
	}
	public String getPagerows() {
		return this.pagerows;
	}
	public String getMsgNo() {
		return this.msgNo;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getDrftBilSeq() {
		return this.drftBilSeq;
	}
	public String getPantosMeasUtCd1() {
		return this.pantosMeasUtCd1;
	}
	public String getChgAmt() {
		return this.chgAmt;
	}
	public String getPantosMeasUtCd2() {
		return this.pantosMeasUtCd2;
	}
	public String getCurrCd3() {
		return this.currCd3;
	}
	public String getEdiSndRmk() {
		return this.ediSndRmk;
	}
	public String getCurrCd4() {
		return this.currCd4;
	}
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	public String getUpdDt() {
		return this.updDt;
	}
	public String getBlSrcNo() {
		return this.blSrcNo;
	}
	public String getPerTpCd() {
		return this.perTpCd;
	}
	public String getChgFullNm() {
		return this.chgFullNm;
	}
	public String getCurrCd2() {
		return this.currCd2;
	}
	public String getInvBilClssCd() {
		return this.invBilClssCd;
	}
	public String getCurrCd1() {
		return this.currCd1;
	}
	public String getLineNo() {
		return this.lineNo;
	}
	public String getDrftBilNo() {
		return this.drftBilNo;
	}
	public String getArOfcCd() {
		return this.arOfcCd;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getFrgnCurrAmt() {
		return this.frgnCurrAmt;
	}
	public String getPantosChgConvCd() {
		return this.pantosChgConvCd;
	}
	public String getRatAsCntrQty() {
		return this.ratAsCntrQty;
	}

	public void setInvTaxAmt(String invTaxAmt) {
		this.invTaxAmt = invTaxAmt;
		//this.invTaxAmt=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setTrfRtAmt(String trfRtAmt) {
		this.trfRtAmt = trfRtAmt;
		//this.trfRtAmt=true;
	}
	public void setChgSeq(String chgSeq) {
		this.chgSeq = chgSeq;
		//this.chgSeq=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void setMsgNo(String msgNo) {
		this.msgNo = msgNo;
		//this.msgNo=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setDrftBilSeq(String drftBilSeq) {
		this.drftBilSeq = drftBilSeq;
		//this.drftBilSeq=true;
	}
	public void setPantosMeasUtCd1(String pantosMeasUtCd1) {
		this.pantosMeasUtCd1 = pantosMeasUtCd1;
		//this.pantosMeasUtCd1=true;
	}
	public void setChgAmt(String chgAmt) {
		this.chgAmt = chgAmt;
		//this.chgAmt=true;
	}
	public void setPantosMeasUtCd2(String pantosMeasUtCd2) {
		this.pantosMeasUtCd2 = pantosMeasUtCd2;
		//this.pantosMeasUtCd2=true;
	}
	public void setCurrCd3(String currCd3) {
		this.currCd3 = currCd3;
		//this.currCd3=true;
	}
	public void setEdiSndRmk(String ediSndRmk) {
		this.ediSndRmk = ediSndRmk;
		//this.ediSndRmk=true;
	}
	public void setCurrCd4(String currCd4) {
		this.currCd4 = currCd4;
		//this.currCd4=true;
	}
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setBlSrcNo(String blSrcNo) {
		this.blSrcNo = blSrcNo;
		//this.blSrcNo=true;
	}
	public void setPerTpCd(String perTpCd) {
		this.perTpCd = perTpCd;
		//this.perTpCd=true;
	}
	public void setChgFullNm(String chgFullNm) {
		this.chgFullNm = chgFullNm;
		//this.chgFullNm=true;
	}
	public void setCurrCd2(String currCd2) {
		this.currCd2 = currCd2;
		//this.currCd2=true;
	}
	public void setInvBilClssCd(String invBilClssCd) {
		this.invBilClssCd = invBilClssCd;
		//this.invBilClssCd=true;
	}
	public void setCurrCd1(String currCd1) {
		this.currCd1 = currCd1;
		//this.currCd1=true;
	}
	public void setLineNo(String lineNo) {
		this.lineNo = lineNo;
		//this.lineNo=true;
	}
	public void setDrftBilNo(String drftBilNo) {
		this.drftBilNo = drftBilNo;
		//this.drftBilNo=true;
	}
	public void setArOfcCd(String arOfcCd) {
		this.arOfcCd = arOfcCd;
		//this.arOfcCd=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setFrgnCurrAmt(String frgnCurrAmt) {
		this.frgnCurrAmt = frgnCurrAmt;
		//this.frgnCurrAmt=true;
	}
	public void setPantosChgConvCd(String pantosChgConvCd) {
		this.pantosChgConvCd = pantosChgConvCd;
		//this.pantosChgConvCd=true;
	}
	public void setRatAsCntrQty(String ratAsCntrQty) {
		this.ratAsCntrQty = ratAsCntrQty;
		//this.ratAsCntrQty=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setInvTaxAmt(JSPUtil.getParameter(request, "inv_tax_amt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setTrfRtAmt(JSPUtil.getParameter(request, "trf_rt_amt", ""));
		setChgSeq(JSPUtil.getParameter(request, "chg_seq", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setMsgNo(JSPUtil.getParameter(request, "msg_no", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setDrftBilSeq(JSPUtil.getParameter(request, "drft_bil_seq", ""));
		setPantosMeasUtCd1(JSPUtil.getParameter(request, "pantos_meas_ut_cd1", ""));
		setChgAmt(JSPUtil.getParameter(request, "chg_amt", ""));
		setPantosMeasUtCd2(JSPUtil.getParameter(request, "pantos_meas_ut_cd2", ""));
		setCurrCd3(JSPUtil.getParameter(request, "curr_cd3", ""));
		setEdiSndRmk(JSPUtil.getParameter(request, "edi_snd_rmk", ""));
		setCurrCd4(JSPUtil.getParameter(request, "curr_cd4", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setBlSrcNo(JSPUtil.getParameter(request, "bl_src_no", ""));
		setPerTpCd(JSPUtil.getParameter(request, "per_tp_cd", ""));
		setChgFullNm(JSPUtil.getParameter(request, "chg_full_nm", ""));
		setCurrCd2(JSPUtil.getParameter(request, "curr_cd2", ""));
		setInvBilClssCd(JSPUtil.getParameter(request, "inv_bil_clss_cd", ""));
		setCurrCd1(JSPUtil.getParameter(request, "curr_cd1", ""));
		setLineNo(JSPUtil.getParameter(request, "line_no", ""));
		setDrftBilNo(JSPUtil.getParameter(request, "drft_bil_no", ""));
		setArOfcCd(JSPUtil.getParameter(request, "ar_ofc_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setFrgnCurrAmt(JSPUtil.getParameter(request, "frgn_curr_amt", ""));
		setPantosChgConvCd(JSPUtil.getParameter(request, "pantos_chg_conv_cd", ""));
		setRatAsCntrQty(JSPUtil.getParameter(request, "rat_as_cntr_qty", ""));
	}

	public InvArPantosChgVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public InvArPantosChgVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		InvArPantosChgVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] invTaxAmt = (JSPUtil.getParameter(request, prefix	+ "inv_tax_amt".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] trfRtAmt = (JSPUtil.getParameter(request, prefix	+ "trf_rt_amt".trim(), length));
			String[] chgSeq = (JSPUtil.getParameter(request, prefix	+ "chg_seq".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] msgNo = (JSPUtil.getParameter(request, prefix	+ "msg_no".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] drftBilSeq = (JSPUtil.getParameter(request, prefix	+ "drft_bil_seq".trim(), length));
			String[] pantosMeasUtCd1 = (JSPUtil.getParameter(request, prefix	+ "pantos_meas_ut_cd1".trim(), length));
			String[] chgAmt = (JSPUtil.getParameter(request, prefix	+ "chg_amt".trim(), length));
			String[] pantosMeasUtCd2 = (JSPUtil.getParameter(request, prefix	+ "pantos_meas_ut_cd2".trim(), length));
			String[] currCd3 = (JSPUtil.getParameter(request, prefix	+ "curr_cd3".trim(), length));
			String[] ediSndRmk = (JSPUtil.getParameter(request, prefix	+ "edi_snd_rmk".trim(), length));
			String[] currCd4 = (JSPUtil.getParameter(request, prefix	+ "curr_cd4".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] blSrcNo = (JSPUtil.getParameter(request, prefix	+ "bl_src_no".trim(), length));
			String[] perTpCd = (JSPUtil.getParameter(request, prefix	+ "per_tp_cd".trim(), length));
			String[] chgFullNm = (JSPUtil.getParameter(request, prefix	+ "chg_full_nm".trim(), length));
			String[] currCd2 = (JSPUtil.getParameter(request, prefix	+ "curr_cd2".trim(), length));
			String[] invBilClssCd = (JSPUtil.getParameter(request, prefix	+ "inv_bil_clss_cd".trim(), length));
			String[] currCd1 = (JSPUtil.getParameter(request, prefix	+ "curr_cd1".trim(), length));
			String[] lineNo = (JSPUtil.getParameter(request, prefix	+ "line_no".trim(), length));
			String[] drftBilNo = (JSPUtil.getParameter(request, prefix	+ "drft_bil_no".trim(), length));
			String[] arOfcCd = (JSPUtil.getParameter(request, prefix	+ "ar_ofc_cd".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] frgnCurrAmt = (JSPUtil.getParameter(request, prefix	+ "frgn_curr_amt".trim(), length));
			String[] pantosChgConvCd = (JSPUtil.getParameter(request, prefix	+ "pantos_chg_conv_cd".trim(), length));
			String[] ratAsCntrQty = (JSPUtil.getParameter(request, prefix	+ "rat_as_cntr_qty".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new InvArPantosChgVO();
				if (invTaxAmt[i] != null)
					model.setInvTaxAmt(invTaxAmt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (trfRtAmt[i] != null)
					model.setTrfRtAmt(trfRtAmt[i]);
				if (chgSeq[i] != null)
					model.setChgSeq(chgSeq[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (msgNo[i] != null)
					model.setMsgNo(msgNo[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (drftBilSeq[i] != null)
					model.setDrftBilSeq(drftBilSeq[i]);
				if (pantosMeasUtCd1[i] != null)
					model.setPantosMeasUtCd1(pantosMeasUtCd1[i]);
				if (chgAmt[i] != null)
					model.setChgAmt(chgAmt[i]);
				if (pantosMeasUtCd2[i] != null)
					model.setPantosMeasUtCd2(pantosMeasUtCd2[i]);
				if (currCd3[i] != null)
					model.setCurrCd3(currCd3[i]);
				if (ediSndRmk[i] != null)
					model.setEdiSndRmk(ediSndRmk[i]);
				if (currCd4[i] != null)
					model.setCurrCd4(currCd4[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (blSrcNo[i] != null)
					model.setBlSrcNo(blSrcNo[i]);
				if (perTpCd[i] != null)
					model.setPerTpCd(perTpCd[i]);
				if (chgFullNm[i] != null)
					model.setChgFullNm(chgFullNm[i]);
				if (currCd2[i] != null)
					model.setCurrCd2(currCd2[i]);
				if (invBilClssCd[i] != null)
					model.setInvBilClssCd(invBilClssCd[i]);
				if (currCd1[i] != null)
					model.setCurrCd1(currCd1[i]);
				if (lineNo[i] != null)
					model.setLineNo(lineNo[i]);
				if (drftBilNo[i] != null)
					model.setDrftBilNo(drftBilNo[i]);
				if (arOfcCd[i] != null)
					model.setArOfcCd(arOfcCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (frgnCurrAmt[i] != null)
					model.setFrgnCurrAmt(frgnCurrAmt[i]);
				if (pantosChgConvCd[i] != null)
					model.setPantosChgConvCd(pantosChgConvCd[i]);
				if (ratAsCntrQty[i] != null)
					model.setRatAsCntrQty(ratAsCntrQty[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getInvArPantosChgVOs();
	}

	public InvArPantosChgVO[] getInvArPantosChgVOs(){
		InvArPantosChgVO[] vos = (InvArPantosChgVO[])models.toArray(new InvArPantosChgVO[models.size()]);
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
		this.invTaxAmt = this.invTaxAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trfRtAmt = this.trfRtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chgSeq = this.chgSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.msgNo = this.msgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.drftBilSeq = this.drftBilSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pantosMeasUtCd1 = this.pantosMeasUtCd1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chgAmt = this.chgAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pantosMeasUtCd2 = this.pantosMeasUtCd2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.currCd3 = this.currCd3 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediSndRmk = this.ediSndRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.currCd4 = this.currCd4 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blSrcNo = this.blSrcNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.perTpCd = this.perTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chgFullNm = this.chgFullNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.currCd2 = this.currCd2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invBilClssCd = this.invBilClssCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.currCd1 = this.currCd1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lineNo = this.lineNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.drftBilNo = this.drftBilNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arOfcCd = this.arOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.frgnCurrAmt = this.frgnCurrAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pantosChgConvCd = this.pantosChgConvCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ratAsCntrQty = this.ratAsCntrQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
