/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : InvArPantosBlVO.java
*@FileTitle : InvArPantosBlVO
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

public class InvArPantosBlVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<InvArPantosBlVO> models = new ArrayList<InvArPantosBlVO>();
	
	/* Column Info */
	private String xchRtDt = null;
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String taxInvNo = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String sailArrDt = null;
	/* Column Info */
	private String usdTtlAmt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String msgNo = null;
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String acctXchRt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String blSrcNo = null;
	/* Column Info */
	private String frtUsdRtAmt = null;
	/* Column Info */
	private String commUsdRtAmt = null;
	/* Column Info */
	private String invBilClssCd = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String vslNm = null;
	/* Column Info */
	private String lineNo = null;
	/* Column Info */
	private String drftBilNo = null;
	/* Column Info */
	private String loclTtlAmt = null;
	/* Column Info */
	private String arOfcCd = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Column Info */
	private String obrdDt = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String siRefNo = null;
	/* Column Info */
	private String loclChgAmt = null;
	/* Column Info */
	private String xptClrNo = null;
	/* Column Info */
	private String pcfChgAmt = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public InvArPantosBlVO() {}

	public InvArPantosBlVO(String ibflag, String pagerows, String arOfcCd, String msgNo, String lineNo, String blSrcNo, String invBilClssCd, String siRefNo, String obrdDt, String xptClrNo, String taxInvNo, String vslNm, String vslCd, String skdVoyNo, String skdDirCd, String acctXchRt, String xchRtDt, String drftBilNo, String sailArrDt, String frtUsdRtAmt, String commUsdRtAmt, String usdTtlAmt, String loclChgAmt, String pcfChgAmt, String loclTtlAmt, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.xchRtDt = xchRtDt;
		this.vslCd = vslCd;
		this.taxInvNo = taxInvNo;
		this.creDt = creDt;
		this.sailArrDt = sailArrDt;
		this.usdTtlAmt = usdTtlAmt;
		this.pagerows = pagerows;
		this.msgNo = msgNo;
		this.ibflag = ibflag;
		this.acctXchRt = acctXchRt;
		this.updUsrId = updUsrId;
		this.updDt = updDt;
		this.blSrcNo = blSrcNo;
		this.frtUsdRtAmt = frtUsdRtAmt;
		this.commUsdRtAmt = commUsdRtAmt;
		this.invBilClssCd = invBilClssCd;
		this.skdVoyNo = skdVoyNo;
		this.vslNm = vslNm;
		this.lineNo = lineNo;
		this.drftBilNo = drftBilNo;
		this.loclTtlAmt = loclTtlAmt;
		this.arOfcCd = arOfcCd;
		this.skdDirCd = skdDirCd;
		this.obrdDt = obrdDt;
		this.creUsrId = creUsrId;
		this.siRefNo = siRefNo;
		this.loclChgAmt = loclChgAmt;
		this.xptClrNo = xptClrNo;
		this.pcfChgAmt = pcfChgAmt;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("xch_rt_dt", getXchRtDt());
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("tax_inv_no", getTaxInvNo());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("sail_arr_dt", getSailArrDt());
		this.hashColumns.put("usd_ttl_amt", getUsdTtlAmt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("msg_no", getMsgNo());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("acct_xch_rt", getAcctXchRt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("bl_src_no", getBlSrcNo());
		this.hashColumns.put("frt_usd_rt_amt", getFrtUsdRtAmt());
		this.hashColumns.put("comm_usd_rt_amt", getCommUsdRtAmt());
		this.hashColumns.put("inv_bil_clss_cd", getInvBilClssCd());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("vsl_nm", getVslNm());
		this.hashColumns.put("line_no", getLineNo());
		this.hashColumns.put("drft_bil_no", getDrftBilNo());
		this.hashColumns.put("locl_ttl_amt", getLoclTtlAmt());
		this.hashColumns.put("ar_ofc_cd", getArOfcCd());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("obrd_dt", getObrdDt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("si_ref_no", getSiRefNo());
		this.hashColumns.put("locl_chg_amt", getLoclChgAmt());
		this.hashColumns.put("xpt_clr_no", getXptClrNo());
		this.hashColumns.put("pcf_chg_amt", getPcfChgAmt());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("xch_rt_dt", "xchRtDt");
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("tax_inv_no", "taxInvNo");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("sail_arr_dt", "sailArrDt");
		this.hashFields.put("usd_ttl_amt", "usdTtlAmt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("msg_no", "msgNo");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("acct_xch_rt", "acctXchRt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("bl_src_no", "blSrcNo");
		this.hashFields.put("frt_usd_rt_amt", "frtUsdRtAmt");
		this.hashFields.put("comm_usd_rt_amt", "commUsdRtAmt");
		this.hashFields.put("inv_bil_clss_cd", "invBilClssCd");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("vsl_nm", "vslNm");
		this.hashFields.put("line_no", "lineNo");
		this.hashFields.put("drft_bil_no", "drftBilNo");
		this.hashFields.put("locl_ttl_amt", "loclTtlAmt");
		this.hashFields.put("ar_ofc_cd", "arOfcCd");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("obrd_dt", "obrdDt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("si_ref_no", "siRefNo");
		this.hashFields.put("locl_chg_amt", "loclChgAmt");
		this.hashFields.put("xpt_clr_no", "xptClrNo");
		this.hashFields.put("pcf_chg_amt", "pcfChgAmt");
		return this.hashFields;
	}
	
	public String getXchRtDt() {
		return this.xchRtDt;
	}
	public String getVslCd() {
		return this.vslCd;
	}
	public String getTaxInvNo() {
		return this.taxInvNo;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getSailArrDt() {
		return this.sailArrDt;
	}
	public String getUsdTtlAmt() {
		return this.usdTtlAmt;
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
	public String getAcctXchRt() {
		return this.acctXchRt;
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
	public String getFrtUsdRtAmt() {
		return this.frtUsdRtAmt;
	}
	public String getCommUsdRtAmt() {
		return this.commUsdRtAmt;
	}
	public String getInvBilClssCd() {
		return this.invBilClssCd;
	}
	public String getSkdVoyNo() {
		return this.skdVoyNo;
	}
	public String getVslNm() {
		return this.vslNm;
	}
	public String getLineNo() {
		return this.lineNo;
	}
	public String getDrftBilNo() {
		return this.drftBilNo;
	}
	public String getLoclTtlAmt() {
		return this.loclTtlAmt;
	}
	public String getArOfcCd() {
		return this.arOfcCd;
	}
	public String getSkdDirCd() {
		return this.skdDirCd;
	}
	public String getObrdDt() {
		return this.obrdDt;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getSiRefNo() {
		return this.siRefNo;
	}
	public String getLoclChgAmt() {
		return this.loclChgAmt;
	}
	public String getXptClrNo() {
		return this.xptClrNo;
	}
	public String getPcfChgAmt() {
		return this.pcfChgAmt;
	}

	public void setXchRtDt(String xchRtDt) {
		this.xchRtDt = xchRtDt;
		//this.xchRtDt=true;
	}
	public void setVslCd(String vslCd) {
		this.vslCd = vslCd;
		//this.vslCd=true;
	}
	public void setTaxInvNo(String taxInvNo) {
		this.taxInvNo = taxInvNo;
		//this.taxInvNo=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setSailArrDt(String sailArrDt) {
		this.sailArrDt = sailArrDt;
		//this.sailArrDt=true;
	}
	public void setUsdTtlAmt(String usdTtlAmt) {
		this.usdTtlAmt = usdTtlAmt;
		//this.usdTtlAmt=true;
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
	public void setAcctXchRt(String acctXchRt) {
		this.acctXchRt = acctXchRt;
		//this.acctXchRt=true;
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
	public void setFrtUsdRtAmt(String frtUsdRtAmt) {
		this.frtUsdRtAmt = frtUsdRtAmt;
		//this.frtUsdRtAmt=true;
	}
	public void setCommUsdRtAmt(String commUsdRtAmt) {
		this.commUsdRtAmt = commUsdRtAmt;
		//this.commUsdRtAmt=true;
	}
	public void setInvBilClssCd(String invBilClssCd) {
		this.invBilClssCd = invBilClssCd;
		//this.invBilClssCd=true;
	}
	public void setSkdVoyNo(String skdVoyNo) {
		this.skdVoyNo = skdVoyNo;
		//this.skdVoyNo=true;
	}
	public void setVslNm(String vslNm) {
		this.vslNm = vslNm;
		//this.vslNm=true;
	}
	public void setLineNo(String lineNo) {
		this.lineNo = lineNo;
		//this.lineNo=true;
	}
	public void setDrftBilNo(String drftBilNo) {
		this.drftBilNo = drftBilNo;
		//this.drftBilNo=true;
	}
	public void setLoclTtlAmt(String loclTtlAmt) {
		this.loclTtlAmt = loclTtlAmt;
		//this.loclTtlAmt=true;
	}
	public void setArOfcCd(String arOfcCd) {
		this.arOfcCd = arOfcCd;
		//this.arOfcCd=true;
	}
	public void setSkdDirCd(String skdDirCd) {
		this.skdDirCd = skdDirCd;
		//this.skdDirCd=true;
	}
	public void setObrdDt(String obrdDt) {
		this.obrdDt = obrdDt;
		//this.obrdDt=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setSiRefNo(String siRefNo) {
		this.siRefNo = siRefNo;
		//this.siRefNo=true;
	}
	public void setLoclChgAmt(String loclChgAmt) {
		this.loclChgAmt = loclChgAmt;
		//this.loclChgAmt=true;
	}
	public void setXptClrNo(String xptClrNo) {
		this.xptClrNo = xptClrNo;
		//this.xptClrNo=true;
	}
	public void setPcfChgAmt(String pcfChgAmt) {
		this.pcfChgAmt = pcfChgAmt;
		//this.pcfChgAmt=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setXchRtDt(JSPUtil.getParameter(request, "xch_rt_dt", ""));
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setTaxInvNo(JSPUtil.getParameter(request, "tax_inv_no", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setSailArrDt(JSPUtil.getParameter(request, "sail_arr_dt", ""));
		setUsdTtlAmt(JSPUtil.getParameter(request, "usd_ttl_amt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setMsgNo(JSPUtil.getParameter(request, "msg_no", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setAcctXchRt(JSPUtil.getParameter(request, "acct_xch_rt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setBlSrcNo(JSPUtil.getParameter(request, "bl_src_no", ""));
		setFrtUsdRtAmt(JSPUtil.getParameter(request, "frt_usd_rt_amt", ""));
		setCommUsdRtAmt(JSPUtil.getParameter(request, "comm_usd_rt_amt", ""));
		setInvBilClssCd(JSPUtil.getParameter(request, "inv_bil_clss_cd", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, "skd_voy_no", ""));
		setVslNm(JSPUtil.getParameter(request, "vsl_nm", ""));
		setLineNo(JSPUtil.getParameter(request, "line_no", ""));
		setDrftBilNo(JSPUtil.getParameter(request, "drft_bil_no", ""));
		setLoclTtlAmt(JSPUtil.getParameter(request, "locl_ttl_amt", ""));
		setArOfcCd(JSPUtil.getParameter(request, "ar_ofc_cd", ""));
		setSkdDirCd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
		setObrdDt(JSPUtil.getParameter(request, "obrd_dt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setSiRefNo(JSPUtil.getParameter(request, "si_ref_no", ""));
		setLoclChgAmt(JSPUtil.getParameter(request, "locl_chg_amt", ""));
		setXptClrNo(JSPUtil.getParameter(request, "xpt_clr_no", ""));
		setPcfChgAmt(JSPUtil.getParameter(request, "pcf_chg_amt", ""));
	}

	public InvArPantosBlVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public InvArPantosBlVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		InvArPantosBlVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] xchRtDt = (JSPUtil.getParameter(request, prefix	+ "xch_rt_dt".trim(), length));
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd".trim(), length));
			String[] taxInvNo = (JSPUtil.getParameter(request, prefix	+ "tax_inv_no".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] sailArrDt = (JSPUtil.getParameter(request, prefix	+ "sail_arr_dt".trim(), length));
			String[] usdTtlAmt = (JSPUtil.getParameter(request, prefix	+ "usd_ttl_amt".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] msgNo = (JSPUtil.getParameter(request, prefix	+ "msg_no".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] acctXchRt = (JSPUtil.getParameter(request, prefix	+ "acct_xch_rt".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] blSrcNo = (JSPUtil.getParameter(request, prefix	+ "bl_src_no".trim(), length));
			String[] frtUsdRtAmt = (JSPUtil.getParameter(request, prefix	+ "frt_usd_rt_amt".trim(), length));
			String[] commUsdRtAmt = (JSPUtil.getParameter(request, prefix	+ "comm_usd_rt_amt".trim(), length));
			String[] invBilClssCd = (JSPUtil.getParameter(request, prefix	+ "inv_bil_clss_cd".trim(), length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no".trim(), length));
			String[] vslNm = (JSPUtil.getParameter(request, prefix	+ "vsl_nm".trim(), length));
			String[] lineNo = (JSPUtil.getParameter(request, prefix	+ "line_no".trim(), length));
			String[] drftBilNo = (JSPUtil.getParameter(request, prefix	+ "drft_bil_no".trim(), length));
			String[] loclTtlAmt = (JSPUtil.getParameter(request, prefix	+ "locl_ttl_amt".trim(), length));
			String[] arOfcCd = (JSPUtil.getParameter(request, prefix	+ "ar_ofc_cd".trim(), length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd".trim(), length));
			String[] obrdDt = (JSPUtil.getParameter(request, prefix	+ "obrd_dt".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] siRefNo = (JSPUtil.getParameter(request, prefix	+ "si_ref_no".trim(), length));
			String[] loclChgAmt = (JSPUtil.getParameter(request, prefix	+ "locl_chg_amt".trim(), length));
			String[] xptClrNo = (JSPUtil.getParameter(request, prefix	+ "xpt_clr_no".trim(), length));
			String[] pcfChgAmt = (JSPUtil.getParameter(request, prefix	+ "pcf_chg_amt".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new InvArPantosBlVO();
				if (xchRtDt[i] != null)
					model.setXchRtDt(xchRtDt[i]);
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (taxInvNo[i] != null)
					model.setTaxInvNo(taxInvNo[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (sailArrDt[i] != null)
					model.setSailArrDt(sailArrDt[i]);
				if (usdTtlAmt[i] != null)
					model.setUsdTtlAmt(usdTtlAmt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (msgNo[i] != null)
					model.setMsgNo(msgNo[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (acctXchRt[i] != null)
					model.setAcctXchRt(acctXchRt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (blSrcNo[i] != null)
					model.setBlSrcNo(blSrcNo[i]);
				if (frtUsdRtAmt[i] != null)
					model.setFrtUsdRtAmt(frtUsdRtAmt[i]);
				if (commUsdRtAmt[i] != null)
					model.setCommUsdRtAmt(commUsdRtAmt[i]);
				if (invBilClssCd[i] != null)
					model.setInvBilClssCd(invBilClssCd[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (vslNm[i] != null)
					model.setVslNm(vslNm[i]);
				if (lineNo[i] != null)
					model.setLineNo(lineNo[i]);
				if (drftBilNo[i] != null)
					model.setDrftBilNo(drftBilNo[i]);
				if (loclTtlAmt[i] != null)
					model.setLoclTtlAmt(loclTtlAmt[i]);
				if (arOfcCd[i] != null)
					model.setArOfcCd(arOfcCd[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (obrdDt[i] != null)
					model.setObrdDt(obrdDt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (siRefNo[i] != null)
					model.setSiRefNo(siRefNo[i]);
				if (loclChgAmt[i] != null)
					model.setLoclChgAmt(loclChgAmt[i]);
				if (xptClrNo[i] != null)
					model.setXptClrNo(xptClrNo[i]);
				if (pcfChgAmt[i] != null)
					model.setPcfChgAmt(pcfChgAmt[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getInvArPantosBlVOs();
	}

	public InvArPantosBlVO[] getInvArPantosBlVOs(){
		InvArPantosBlVO[] vos = (InvArPantosBlVO[])models.toArray(new InvArPantosBlVO[models.size()]);
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
		this.xchRtDt = this.xchRtDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.taxInvNo = this.taxInvNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sailArrDt = this.sailArrDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usdTtlAmt = this.usdTtlAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.msgNo = this.msgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acctXchRt = this.acctXchRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blSrcNo = this.blSrcNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.frtUsdRtAmt = this.frtUsdRtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.commUsdRtAmt = this.commUsdRtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invBilClssCd = this.invBilClssCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslNm = this.vslNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lineNo = this.lineNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.drftBilNo = this.drftBilNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.loclTtlAmt = this.loclTtlAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arOfcCd = this.arOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.obrdDt = this.obrdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.siRefNo = this.siRefNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.loclChgAmt = this.loclChgAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.xptClrNo = this.xptClrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pcfChgAmt = this.pcfChgAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
