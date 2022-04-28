/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : InvArPantosHdrVO.java
*@FileTitle : InvArPantosHdrVO
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

public class InvArPantosHdrVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<InvArPantosHdrVO> models = new ArrayList<InvArPantosHdrVO>();
	
	/* Column Info */
	private String pantosXptImpClssCd = null;
	/* Column Info */
	private String taxInvNo = null;
	/* Column Info */
	private String invOrgDivCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String ttlAmt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String sndSeqNo = null;
	/* Column Info */
	private String msgNo = null;
	/* Column Info */
	private String issDt = null;
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String rctRqstDivCd = null;
	/* Column Info */
	private String currCd3 = null;
	/* Column Info */
	private String aproFlg = null;
	/* Column Info */
	private String msgSndrCd = null;
	/* Column Info */
	private String ediSndFlg = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String currCd2 = null;
	/* Column Info */
	private String invCoClssCd = null;
	/* Column Info */
	private String invBilClssCd = null;
	/* Column Info */
	private String currCd1 = null;
	/* Column Info */
	private String ediRsndDt = null;
	/* Column Info */
	private String arOfcCd = null;
	/* Column Info */
	private String taxInvClssCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String frgnCurrAmt = null;
	/* Column Info */
	private String pantosTaxClssCd = null;
	/* Column Info */
	private String ttlTaxAmt = null;
	/* Column Info */
	private String ediSndDt = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public InvArPantosHdrVO() {}

	public InvArPantosHdrVO(String ibflag, String pagerows, String arOfcCd, String msgNo, String invBilClssCd, String invOrgDivCd, String sndSeqNo, String msgSndrCd, String invCoClssCd, String pantosTaxClssCd, String pantosXptImpClssCd, String taxInvClssCd, String rctRqstDivCd, String issDt, String ttlAmt, String currCd1, String ttlTaxAmt, String currCd2, String frgnCurrAmt, String currCd3, String ediSndFlg, String ediSndDt, String ediRsndDt, String taxInvNo, String aproFlg, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.pantosXptImpClssCd = pantosXptImpClssCd;
		this.taxInvNo = taxInvNo;
		this.invOrgDivCd = invOrgDivCd;
		this.creDt = creDt;
		this.ttlAmt = ttlAmt;
		this.pagerows = pagerows;
		this.sndSeqNo = sndSeqNo;
		this.msgNo = msgNo;
		this.issDt = issDt;
		this.ibflag = ibflag;
		this.rctRqstDivCd = rctRqstDivCd;
		this.currCd3 = currCd3;
		this.aproFlg = aproFlg;
		this.msgSndrCd = msgSndrCd;
		this.ediSndFlg = ediSndFlg;
		this.updUsrId = updUsrId;
		this.updDt = updDt;
		this.currCd2 = currCd2;
		this.invCoClssCd = invCoClssCd;
		this.invBilClssCd = invBilClssCd;
		this.currCd1 = currCd1;
		this.ediRsndDt = ediRsndDt;
		this.arOfcCd = arOfcCd;
		this.taxInvClssCd = taxInvClssCd;
		this.creUsrId = creUsrId;
		this.frgnCurrAmt = frgnCurrAmt;
		this.pantosTaxClssCd = pantosTaxClssCd;
		this.ttlTaxAmt = ttlTaxAmt;
		this.ediSndDt = ediSndDt;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("pantos_xpt_imp_clss_cd", getPantosXptImpClssCd());
		this.hashColumns.put("tax_inv_no", getTaxInvNo());
		this.hashColumns.put("inv_org_div_cd", getInvOrgDivCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("ttl_amt", getTtlAmt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("snd_seq_no", getSndSeqNo());
		this.hashColumns.put("msg_no", getMsgNo());
		this.hashColumns.put("iss_dt", getIssDt());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("rct_rqst_div_cd", getRctRqstDivCd());
		this.hashColumns.put("curr_cd3", getCurrCd3());
		this.hashColumns.put("apro_flg", getAproFlg());
		this.hashColumns.put("msg_sndr_cd", getMsgSndrCd());
		this.hashColumns.put("edi_snd_flg", getEdiSndFlg());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("curr_cd2", getCurrCd2());
		this.hashColumns.put("inv_co_clss_cd", getInvCoClssCd());
		this.hashColumns.put("inv_bil_clss_cd", getInvBilClssCd());
		this.hashColumns.put("curr_cd1", getCurrCd1());
		this.hashColumns.put("edi_rsnd_dt", getEdiRsndDt());
		this.hashColumns.put("ar_ofc_cd", getArOfcCd());
		this.hashColumns.put("tax_inv_clss_cd", getTaxInvClssCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("frgn_curr_amt", getFrgnCurrAmt());
		this.hashColumns.put("pantos_tax_clss_cd", getPantosTaxClssCd());
		this.hashColumns.put("ttl_tax_amt", getTtlTaxAmt());
		this.hashColumns.put("edi_snd_dt", getEdiSndDt());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("pantos_xpt_imp_clss_cd", "pantosXptImpClssCd");
		this.hashFields.put("tax_inv_no", "taxInvNo");
		this.hashFields.put("inv_org_div_cd", "invOrgDivCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("ttl_amt", "ttlAmt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("snd_seq_no", "sndSeqNo");
		this.hashFields.put("msg_no", "msgNo");
		this.hashFields.put("iss_dt", "issDt");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("rct_rqst_div_cd", "rctRqstDivCd");
		this.hashFields.put("curr_cd3", "currCd3");
		this.hashFields.put("apro_flg", "aproFlg");
		this.hashFields.put("msg_sndr_cd", "msgSndrCd");
		this.hashFields.put("edi_snd_flg", "ediSndFlg");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("curr_cd2", "currCd2");
		this.hashFields.put("inv_co_clss_cd", "invCoClssCd");
		this.hashFields.put("inv_bil_clss_cd", "invBilClssCd");
		this.hashFields.put("curr_cd1", "currCd1");
		this.hashFields.put("edi_rsnd_dt", "ediRsndDt");
		this.hashFields.put("ar_ofc_cd", "arOfcCd");
		this.hashFields.put("tax_inv_clss_cd", "taxInvClssCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("frgn_curr_amt", "frgnCurrAmt");
		this.hashFields.put("pantos_tax_clss_cd", "pantosTaxClssCd");
		this.hashFields.put("ttl_tax_amt", "ttlTaxAmt");
		this.hashFields.put("edi_snd_dt", "ediSndDt");
		return this.hashFields;
	}
	
	public String getPantosXptImpClssCd() {
		return this.pantosXptImpClssCd;
	}
	public String getTaxInvNo() {
		return this.taxInvNo;
	}
	public String getInvOrgDivCd() {
		return this.invOrgDivCd;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getTtlAmt() {
		return this.ttlAmt;
	}
	public String getPagerows() {
		return this.pagerows;
	}
	public String getSndSeqNo() {
		return this.sndSeqNo;
	}
	public String getMsgNo() {
		return this.msgNo;
	}
	public String getIssDt() {
		return this.issDt;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getRctRqstDivCd() {
		return this.rctRqstDivCd;
	}
	public String getCurrCd3() {
		return this.currCd3;
	}
	public String getAproFlg() {
		return this.aproFlg;
	}
	public String getMsgSndrCd() {
		return this.msgSndrCd;
	}
	public String getEdiSndFlg() {
		return this.ediSndFlg;
	}
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	public String getUpdDt() {
		return this.updDt;
	}
	public String getCurrCd2() {
		return this.currCd2;
	}
	public String getInvCoClssCd() {
		return this.invCoClssCd;
	}
	public String getInvBilClssCd() {
		return this.invBilClssCd;
	}
	public String getCurrCd1() {
		return this.currCd1;
	}
	public String getEdiRsndDt() {
		return this.ediRsndDt;
	}
	public String getArOfcCd() {
		return this.arOfcCd;
	}
	public String getTaxInvClssCd() {
		return this.taxInvClssCd;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getFrgnCurrAmt() {
		return this.frgnCurrAmt;
	}
	public String getPantosTaxClssCd() {
		return this.pantosTaxClssCd;
	}
	public String getTtlTaxAmt() {
		return this.ttlTaxAmt;
	}
	public String getEdiSndDt() {
		return this.ediSndDt;
	}

	public void setPantosXptImpClssCd(String pantosXptImpClssCd) {
		this.pantosXptImpClssCd = pantosXptImpClssCd;
		//this.pantosXptImpClssCd=true;
	}
	public void setTaxInvNo(String taxInvNo) {
		this.taxInvNo = taxInvNo;
		//this.taxInvNo=true;
	}
	public void setInvOrgDivCd(String invOrgDivCd) {
		this.invOrgDivCd = invOrgDivCd;
		//this.invOrgDivCd=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setTtlAmt(String ttlAmt) {
		this.ttlAmt = ttlAmt;
		//this.ttlAmt=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void setSndSeqNo(String sndSeqNo) {
		this.sndSeqNo = sndSeqNo;
		//this.sndSeqNo=true;
	}
	public void setMsgNo(String msgNo) {
		this.msgNo = msgNo;
		//this.msgNo=true;
	}
	public void setIssDt(String issDt) {
		this.issDt = issDt;
		//this.issDt=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setRctRqstDivCd(String rctRqstDivCd) {
		this.rctRqstDivCd = rctRqstDivCd;
		//this.rctRqstDivCd=true;
	}
	public void setCurrCd3(String currCd3) {
		this.currCd3 = currCd3;
		//this.currCd3=true;
	}
	public void setAproFlg(String aproFlg) {
		this.aproFlg = aproFlg;
		//this.aproFlg=true;
	}
	public void setMsgSndrCd(String msgSndrCd) {
		this.msgSndrCd = msgSndrCd;
		//this.msgSndrCd=true;
	}
	public void setEdiSndFlg(String ediSndFlg) {
		this.ediSndFlg = ediSndFlg;
		//this.ediSndFlg=true;
	}
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setCurrCd2(String currCd2) {
		this.currCd2 = currCd2;
		//this.currCd2=true;
	}
	public void setInvCoClssCd(String invCoClssCd) {
		this.invCoClssCd = invCoClssCd;
		//this.invCoClssCd=true;
	}
	public void setInvBilClssCd(String invBilClssCd) {
		this.invBilClssCd = invBilClssCd;
		//this.invBilClssCd=true;
	}
	public void setCurrCd1(String currCd1) {
		this.currCd1 = currCd1;
		//this.currCd1=true;
	}
	public void setEdiRsndDt(String ediRsndDt) {
		this.ediRsndDt = ediRsndDt;
		//this.ediRsndDt=true;
	}
	public void setArOfcCd(String arOfcCd) {
		this.arOfcCd = arOfcCd;
		//this.arOfcCd=true;
	}
	public void setTaxInvClssCd(String taxInvClssCd) {
		this.taxInvClssCd = taxInvClssCd;
		//this.taxInvClssCd=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setFrgnCurrAmt(String frgnCurrAmt) {
		this.frgnCurrAmt = frgnCurrAmt;
		//this.frgnCurrAmt=true;
	}
	public void setPantosTaxClssCd(String pantosTaxClssCd) {
		this.pantosTaxClssCd = pantosTaxClssCd;
		//this.pantosTaxClssCd=true;
	}
	public void setTtlTaxAmt(String ttlTaxAmt) {
		this.ttlTaxAmt = ttlTaxAmt;
		//this.ttlTaxAmt=true;
	}
	public void setEdiSndDt(String ediSndDt) {
		this.ediSndDt = ediSndDt;
		//this.ediSndDt=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setPantosXptImpClssCd(JSPUtil.getParameter(request, "pantos_xpt_imp_clss_cd", ""));
		setTaxInvNo(JSPUtil.getParameter(request, "tax_inv_no", ""));
		setInvOrgDivCd(JSPUtil.getParameter(request, "inv_org_div_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setTtlAmt(JSPUtil.getParameter(request, "ttl_amt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setSndSeqNo(JSPUtil.getParameter(request, "snd_seq_no", ""));
		setMsgNo(JSPUtil.getParameter(request, "msg_no", ""));
		setIssDt(JSPUtil.getParameter(request, "iss_dt", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setRctRqstDivCd(JSPUtil.getParameter(request, "rct_rqst_div_cd", ""));
		setCurrCd3(JSPUtil.getParameter(request, "curr_cd3", ""));
		setAproFlg(JSPUtil.getParameter(request, "apro_flg", ""));
		setMsgSndrCd(JSPUtil.getParameter(request, "msg_sndr_cd", ""));
		setEdiSndFlg(JSPUtil.getParameter(request, "edi_snd_flg", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCurrCd2(JSPUtil.getParameter(request, "curr_cd2", ""));
		setInvCoClssCd(JSPUtil.getParameter(request, "inv_co_clss_cd", ""));
		setInvBilClssCd(JSPUtil.getParameter(request, "inv_bil_clss_cd", ""));
		setCurrCd1(JSPUtil.getParameter(request, "curr_cd1", ""));
		setEdiRsndDt(JSPUtil.getParameter(request, "edi_rsnd_dt", ""));
		setArOfcCd(JSPUtil.getParameter(request, "ar_ofc_cd", ""));
		setTaxInvClssCd(JSPUtil.getParameter(request, "tax_inv_clss_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setFrgnCurrAmt(JSPUtil.getParameter(request, "frgn_curr_amt", ""));
		setPantosTaxClssCd(JSPUtil.getParameter(request, "pantos_tax_clss_cd", ""));
		setTtlTaxAmt(JSPUtil.getParameter(request, "ttl_tax_amt", ""));
		setEdiSndDt(JSPUtil.getParameter(request, "edi_snd_dt", ""));
	}

	public InvArPantosHdrVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public InvArPantosHdrVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		InvArPantosHdrVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] pantosXptImpClssCd = (JSPUtil.getParameter(request, prefix	+ "pantos_xpt_imp_clss_cd".trim(), length));
			String[] taxInvNo = (JSPUtil.getParameter(request, prefix	+ "tax_inv_no".trim(), length));
			String[] invOrgDivCd = (JSPUtil.getParameter(request, prefix	+ "inv_org_div_cd".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] ttlAmt = (JSPUtil.getParameter(request, prefix	+ "ttl_amt".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] sndSeqNo = (JSPUtil.getParameter(request, prefix	+ "snd_seq_no".trim(), length));
			String[] msgNo = (JSPUtil.getParameter(request, prefix	+ "msg_no".trim(), length));
			String[] issDt = (JSPUtil.getParameter(request, prefix	+ "iss_dt".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] rctRqstDivCd = (JSPUtil.getParameter(request, prefix	+ "rct_rqst_div_cd".trim(), length));
			String[] currCd3 = (JSPUtil.getParameter(request, prefix	+ "curr_cd3".trim(), length));
			String[] aproFlg = (JSPUtil.getParameter(request, prefix	+ "apro_flg".trim(), length));
			String[] msgSndrCd = (JSPUtil.getParameter(request, prefix	+ "msg_sndr_cd".trim(), length));
			String[] ediSndFlg = (JSPUtil.getParameter(request, prefix	+ "edi_snd_flg".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] currCd2 = (JSPUtil.getParameter(request, prefix	+ "curr_cd2".trim(), length));
			String[] invCoClssCd = (JSPUtil.getParameter(request, prefix	+ "inv_co_clss_cd".trim(), length));
			String[] invBilClssCd = (JSPUtil.getParameter(request, prefix	+ "inv_bil_clss_cd".trim(), length));
			String[] currCd1 = (JSPUtil.getParameter(request, prefix	+ "curr_cd1".trim(), length));
			String[] ediRsndDt = (JSPUtil.getParameter(request, prefix	+ "edi_rsnd_dt".trim(), length));
			String[] arOfcCd = (JSPUtil.getParameter(request, prefix	+ "ar_ofc_cd".trim(), length));
			String[] taxInvClssCd = (JSPUtil.getParameter(request, prefix	+ "tax_inv_clss_cd".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] frgnCurrAmt = (JSPUtil.getParameter(request, prefix	+ "frgn_curr_amt".trim(), length));
			String[] pantosTaxClssCd = (JSPUtil.getParameter(request, prefix	+ "pantos_tax_clss_cd".trim(), length));
			String[] ttlTaxAmt = (JSPUtil.getParameter(request, prefix	+ "ttl_tax_amt".trim(), length));
			String[] ediSndDt = (JSPUtil.getParameter(request, prefix	+ "edi_snd_dt".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new InvArPantosHdrVO();
				if (pantosXptImpClssCd[i] != null)
					model.setPantosXptImpClssCd(pantosXptImpClssCd[i]);
				if (taxInvNo[i] != null)
					model.setTaxInvNo(taxInvNo[i]);
				if (invOrgDivCd[i] != null)
					model.setInvOrgDivCd(invOrgDivCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (ttlAmt[i] != null)
					model.setTtlAmt(ttlAmt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (sndSeqNo[i] != null)
					model.setSndSeqNo(sndSeqNo[i]);
				if (msgNo[i] != null)
					model.setMsgNo(msgNo[i]);
				if (issDt[i] != null)
					model.setIssDt(issDt[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (rctRqstDivCd[i] != null)
					model.setRctRqstDivCd(rctRqstDivCd[i]);
				if (currCd3[i] != null)
					model.setCurrCd3(currCd3[i]);
				if (aproFlg[i] != null)
					model.setAproFlg(aproFlg[i]);
				if (msgSndrCd[i] != null)
					model.setMsgSndrCd(msgSndrCd[i]);
				if (ediSndFlg[i] != null)
					model.setEdiSndFlg(ediSndFlg[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (currCd2[i] != null)
					model.setCurrCd2(currCd2[i]);
				if (invCoClssCd[i] != null)
					model.setInvCoClssCd(invCoClssCd[i]);
				if (invBilClssCd[i] != null)
					model.setInvBilClssCd(invBilClssCd[i]);
				if (currCd1[i] != null)
					model.setCurrCd1(currCd1[i]);
				if (ediRsndDt[i] != null)
					model.setEdiRsndDt(ediRsndDt[i]);
				if (arOfcCd[i] != null)
					model.setArOfcCd(arOfcCd[i]);
				if (taxInvClssCd[i] != null)
					model.setTaxInvClssCd(taxInvClssCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (frgnCurrAmt[i] != null)
					model.setFrgnCurrAmt(frgnCurrAmt[i]);
				if (pantosTaxClssCd[i] != null)
					model.setPantosTaxClssCd(pantosTaxClssCd[i]);
				if (ttlTaxAmt[i] != null)
					model.setTtlTaxAmt(ttlTaxAmt[i]);
				if (ediSndDt[i] != null)
					model.setEdiSndDt(ediSndDt[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getInvArPantosHdrVOs();
	}

	public InvArPantosHdrVO[] getInvArPantosHdrVOs(){
		InvArPantosHdrVO[] vos = (InvArPantosHdrVO[])models.toArray(new InvArPantosHdrVO[models.size()]);
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
		this.pantosXptImpClssCd = this.pantosXptImpClssCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.taxInvNo = this.taxInvNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invOrgDivCd = this.invOrgDivCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ttlAmt = this.ttlAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sndSeqNo = this.sndSeqNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.msgNo = this.msgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.issDt = this.issDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rctRqstDivCd = this.rctRqstDivCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.currCd3 = this.currCd3 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aproFlg = this.aproFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.msgSndrCd = this.msgSndrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediSndFlg = this.ediSndFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.currCd2 = this.currCd2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invCoClssCd = this.invCoClssCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invBilClssCd = this.invBilClssCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.currCd1 = this.currCd1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediRsndDt = this.ediRsndDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arOfcCd = this.arOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.taxInvClssCd = this.taxInvClssCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.frgnCurrAmt = this.frgnCurrAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pantosTaxClssCd = this.pantosTaxClssCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ttlTaxAmt = this.ttlTaxAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediSndDt = this.ediSndDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
