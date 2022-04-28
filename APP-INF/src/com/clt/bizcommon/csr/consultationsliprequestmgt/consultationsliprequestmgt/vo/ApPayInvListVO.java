/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ApPayInvListVO.java
*@FileTitle : ApPayInvListVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.12.07
*@LastModifier : 함대성
*@LastVersion : 1.0
* 2009.12.07 함대성 
* 1.0 Creation
=========================================================*/

package com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo;

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
 * @author 함대성
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class ApPayInvListVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<ApPayInvListVO> models = new ArrayList<ApPayInvListVO>();
	
	/* Column Info */
	private String cntInv = null;
	/* Column Info */
	private String costOfcCd = null;
	/* Column Info */
	private String psoTrnsSlpCtnt = null;
	/* Column Info */
	private String genPayTermCd = null;
	/* Column Info */
	private String invCfmDt = null;
	/* Column Info */
	private String genPayTermDesc = null;
	/* Column Info */
	private String totalAmt = null;
	/* Column Info */
	private String invIssDt = null;
	/* Column Info */
	private String invCurrCd = null;
	/* Column Info */
	private String invRcvDt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String paymentDueDt = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String vndrNo = null;
	/* Column Info */
	private String vndrSeqName = null;
	/* Column Info */
	private String vndrSeq = null;
	/* Column Info */
	private String invSubSysCd = null;
	/* Column Info */
	private String payTermTpCd = null;
	/* Column Info */
	private String invOfcCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public ApPayInvListVO() {}

	public ApPayInvListVO(String ibflag, String pagerows, String costOfcCd, String vndrNo, String vndrSeqName, String cntInv, String invCurrCd, String totalAmt, String invIssDt, String invRcvDt, String genPayTermCd, String genPayTermDesc, String paymentDueDt, String payTermTpCd, String invSubSysCd, String psoTrnsSlpCtnt, String invCfmDt, String vndrSeq, String invOfcCd) {
		this.cntInv = cntInv;
		this.costOfcCd = costOfcCd;
		this.psoTrnsSlpCtnt = psoTrnsSlpCtnt;
		this.genPayTermCd = genPayTermCd;
		this.invCfmDt = invCfmDt;
		this.genPayTermDesc = genPayTermDesc;
		this.totalAmt = totalAmt;
		this.invIssDt = invIssDt;
		this.invCurrCd = invCurrCd;
		this.invRcvDt = invRcvDt;
		this.pagerows = pagerows;
		this.paymentDueDt = paymentDueDt;
		this.ibflag = ibflag;
		this.vndrNo = vndrNo;
		this.vndrSeqName = vndrSeqName;
		this.vndrSeq = vndrSeq;
		this.invSubSysCd = invSubSysCd;
		this.payTermTpCd = payTermTpCd;
		this.invOfcCd = invOfcCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("cnt_inv", getCntInv());
		this.hashColumns.put("cost_ofc_cd", getCostOfcCd());
		this.hashColumns.put("pso_trns_slp_ctnt", getPsoTrnsSlpCtnt());
		this.hashColumns.put("gen_pay_term_cd", getGenPayTermCd());
		this.hashColumns.put("inv_cfm_dt", getInvCfmDt());
		this.hashColumns.put("gen_pay_term_desc", getGenPayTermDesc());
		this.hashColumns.put("total_amt", getTotalAmt());
		this.hashColumns.put("inv_iss_dt", getInvIssDt());
		this.hashColumns.put("inv_curr_cd", getInvCurrCd());
		this.hashColumns.put("inv_rcv_dt", getInvRcvDt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("payment_due_dt", getPaymentDueDt());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("vndr_no", getVndrNo());
		this.hashColumns.put("vndr_seq_name", getVndrSeqName());
		this.hashColumns.put("vndr_seq", getVndrSeq());
		this.hashColumns.put("inv_sub_sys_cd", getInvSubSysCd());
		this.hashColumns.put("pay_term_tp_cd", getPayTermTpCd());
		this.hashColumns.put("inv_ofc_cd", getInvOfcCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("cnt_inv", "cntInv");
		this.hashFields.put("cost_ofc_cd", "costOfcCd");
		this.hashFields.put("pso_trns_slp_ctnt", "psoTrnsSlpCtnt");
		this.hashFields.put("gen_pay_term_cd", "genPayTermCd");
		this.hashFields.put("inv_cfm_dt", "invCfmDt");
		this.hashFields.put("gen_pay_term_desc", "genPayTermDesc");
		this.hashFields.put("total_amt", "totalAmt");
		this.hashFields.put("inv_iss_dt", "invIssDt");
		this.hashFields.put("inv_curr_cd", "invCurrCd");
		this.hashFields.put("inv_rcv_dt", "invRcvDt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("payment_due_dt", "paymentDueDt");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("vndr_no", "vndrNo");
		this.hashFields.put("vndr_seq_name", "vndrSeqName");
		this.hashFields.put("vndr_seq", "vndrSeq");
		this.hashFields.put("inv_sub_sys_cd", "invSubSysCd");
		this.hashFields.put("pay_term_tp_cd", "payTermTpCd");
		this.hashFields.put("inv_ofc_cd", "invOfcCd");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return cntInv
	 */
	public String getCntInv() {
		return this.cntInv;
	}
	
	/**
	 * Column Info
	 * @return costOfcCd
	 */
	public String getCostOfcCd() {
		return this.costOfcCd;
	}
	
	/**
	 * Column Info
	 * @return psoTrnsSlpCtnt
	 */
	public String getPsoTrnsSlpCtnt() {
		return this.psoTrnsSlpCtnt;
	}
	
	/**
	 * Column Info
	 * @return genPayTermCd
	 */
	public String getGenPayTermCd() {
		return this.genPayTermCd;
	}
	
	/**
	 * Column Info
	 * @return invCfmDt
	 */
	public String getInvCfmDt() {
		return this.invCfmDt;
	}
	
	/**
	 * Column Info
	 * @return genPayTermDesc
	 */
	public String getGenPayTermDesc() {
		return this.genPayTermDesc;
	}
	
	/**
	 * Column Info
	 * @return totalAmt
	 */
	public String getTotalAmt() {
		return this.totalAmt;
	}
	
	/**
	 * Column Info
	 * @return invIssDt
	 */
	public String getInvIssDt() {
		return this.invIssDt;
	}
	
	/**
	 * Column Info
	 * @return invCurrCd
	 */
	public String getInvCurrCd() {
		return this.invCurrCd;
	}
	
	/**
	 * Column Info
	 * @return invRcvDt
	 */
	public String getInvRcvDt() {
		return this.invRcvDt;
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
	 * @return paymentDueDt
	 */
	public String getPaymentDueDt() {
		return this.paymentDueDt;
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
	 * @return vndrNo
	 */
	public String getVndrNo() {
		return this.vndrNo;
	}
	
	/**
	 * Column Info
	 * @return vndrSeqName
	 */
	public String getVndrSeqName() {
		return this.vndrSeqName;
	}
	
	/**
	 * Column Info
	 * @return vndrSeq
	 */
	public String getVndrSeq() {
		return this.vndrSeq;
	}
	
	/**
	 * Column Info
	 * @return invSubSysCd
	 */
	public String getInvSubSysCd() {
		return this.invSubSysCd;
	}
	
	/**
	 * Column Info
	 * @return payTermTpCd
	 */
	public String getPayTermTpCd() {
		return this.payTermTpCd;
	}
	
	/**
	 * Column Info
	 * @return invOfcCd
	 */
	public String getInvOfcCd() {
		return this.invOfcCd;
	}
	

	/**
	 * Column Info
	 * @param cntInv
	 */
	public void setCntInv(String cntInv) {
		this.cntInv = cntInv;
	}
	
	/**
	 * Column Info
	 * @param costOfcCd
	 */
	public void setCostOfcCd(String costOfcCd) {
		this.costOfcCd = costOfcCd;
	}
	
	/**
	 * Column Info
	 * @param psoTrnsSlpCtnt
	 */
	public void setPsoTrnsSlpCtnt(String psoTrnsSlpCtnt) {
		this.psoTrnsSlpCtnt = psoTrnsSlpCtnt;
	}
	
	/**
	 * Column Info
	 * @param genPayTermCd
	 */
	public void setGenPayTermCd(String genPayTermCd) {
		this.genPayTermCd = genPayTermCd;
	}
	
	/**
	 * Column Info
	 * @param invCfmDt
	 */
	public void setInvCfmDt(String invCfmDt) {
		this.invCfmDt = invCfmDt;
	}
	
	/**
	 * Column Info
	 * @param genPayTermDesc
	 */
	public void setGenPayTermDesc(String genPayTermDesc) {
		this.genPayTermDesc = genPayTermDesc;
	}
	
	/**
	 * Column Info
	 * @param totalAmt
	 */
	public void setTotalAmt(String totalAmt) {
		this.totalAmt = totalAmt;
	}
	
	/**
	 * Column Info
	 * @param invIssDt
	 */
	public void setInvIssDt(String invIssDt) {
		this.invIssDt = invIssDt;
	}
	
	/**
	 * Column Info
	 * @param invCurrCd
	 */
	public void setInvCurrCd(String invCurrCd) {
		this.invCurrCd = invCurrCd;
	}
	
	/**
	 * Column Info
	 * @param invRcvDt
	 */
	public void setInvRcvDt(String invRcvDt) {
		this.invRcvDt = invRcvDt;
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
	 * @param paymentDueDt
	 */
	public void setPaymentDueDt(String paymentDueDt) {
		this.paymentDueDt = paymentDueDt;
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
	 * @param vndrNo
	 */
	public void setVndrNo(String vndrNo) {
		this.vndrNo = vndrNo;
	}
	
	/**
	 * Column Info
	 * @param vndrSeqName
	 */
	public void setVndrSeqName(String vndrSeqName) {
		this.vndrSeqName = vndrSeqName;
	}
	
	/**
	 * Column Info
	 * @param vndrSeq
	 */
	public void setVndrSeq(String vndrSeq) {
		this.vndrSeq = vndrSeq;
	}
	
	/**
	 * Column Info
	 * @param invSubSysCd
	 */
	public void setInvSubSysCd(String invSubSysCd) {
		this.invSubSysCd = invSubSysCd;
	}
	
	/**
	 * Column Info
	 * @param payTermTpCd
	 */
	public void setPayTermTpCd(String payTermTpCd) {
		this.payTermTpCd = payTermTpCd;
	}
	
	/**
	 * Column Info
	 * @param invOfcCd
	 */
	public void setInvOfcCd(String invOfcCd) {
		this.invOfcCd = invOfcCd;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setCntInv(JSPUtil.getParameter(request, "cnt_inv", ""));
		setCostOfcCd(JSPUtil.getParameter(request, "cost_ofc_cd", ""));
		setPsoTrnsSlpCtnt(JSPUtil.getParameter(request, "pso_trns_slp_ctnt", ""));
		setGenPayTermCd(JSPUtil.getParameter(request, "gen_pay_term_cd", ""));
		setInvCfmDt(JSPUtil.getParameter(request, "inv_cfm_dt", ""));
		setGenPayTermDesc(JSPUtil.getParameter(request, "gen_pay_term_desc", ""));
		setTotalAmt(JSPUtil.getParameter(request, "total_amt", ""));
		setInvIssDt(JSPUtil.getParameter(request, "inv_iss_dt", ""));
		setInvCurrCd(JSPUtil.getParameter(request, "inv_curr_cd", ""));
		setInvRcvDt(JSPUtil.getParameter(request, "inv_rcv_dt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setPaymentDueDt(JSPUtil.getParameter(request, "payment_due_dt", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setVndrNo(JSPUtil.getParameter(request, "vndr_no", ""));
		setVndrSeqName(JSPUtil.getParameter(request, "vndr_seq_name", ""));
		setVndrSeq(JSPUtil.getParameter(request, "vndr_seq", ""));
		setInvSubSysCd(JSPUtil.getParameter(request, "inv_sub_sys_cd", ""));
		setPayTermTpCd(JSPUtil.getParameter(request, "pay_term_tp_cd", ""));
		setInvOfcCd(JSPUtil.getParameter(request, "inv_ofc_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return ApPayInvListVO[]
	 */
	public ApPayInvListVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return ApPayInvListVO[]
	 */
	public ApPayInvListVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		ApPayInvListVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] cntInv = (JSPUtil.getParameter(request, prefix	+ "cnt_inv", length));
			String[] costOfcCd = (JSPUtil.getParameter(request, prefix	+ "cost_ofc_cd", length));
			String[] psoTrnsSlpCtnt = (JSPUtil.getParameter(request, prefix	+ "pso_trns_slp_ctnt", length));
			String[] genPayTermCd = (JSPUtil.getParameter(request, prefix	+ "gen_pay_term_cd", length));
			String[] invCfmDt = (JSPUtil.getParameter(request, prefix	+ "inv_cfm_dt", length));
			String[] genPayTermDesc = (JSPUtil.getParameter(request, prefix	+ "gen_pay_term_desc", length));
			String[] totalAmt = (JSPUtil.getParameter(request, prefix	+ "total_amt", length));
			String[] invIssDt = (JSPUtil.getParameter(request, prefix	+ "inv_iss_dt", length));
			String[] invCurrCd = (JSPUtil.getParameter(request, prefix	+ "inv_curr_cd", length));
			String[] invRcvDt = (JSPUtil.getParameter(request, prefix	+ "inv_rcv_dt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] paymentDueDt = (JSPUtil.getParameter(request, prefix	+ "payment_due_dt", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] vndrNo = (JSPUtil.getParameter(request, prefix	+ "vndr_no", length));
			String[] vndrSeqName = (JSPUtil.getParameter(request, prefix	+ "vndr_seq_name", length));
			String[] vndrSeq = (JSPUtil.getParameter(request, prefix	+ "vndr_seq", length));
			String[] invSubSysCd = (JSPUtil.getParameter(request, prefix	+ "inv_sub_sys_cd", length));
			String[] payTermTpCd = (JSPUtil.getParameter(request, prefix	+ "pay_term_tp_cd", length));
			String[] invOfcCd = (JSPUtil.getParameter(request, prefix	+ "inv_ofc_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new ApPayInvListVO();
				if (cntInv[i] != null)
					model.setCntInv(cntInv[i]);
				if (costOfcCd[i] != null)
					model.setCostOfcCd(costOfcCd[i]);
				if (psoTrnsSlpCtnt[i] != null)
					model.setPsoTrnsSlpCtnt(psoTrnsSlpCtnt[i]);
				if (genPayTermCd[i] != null)
					model.setGenPayTermCd(genPayTermCd[i]);
				if (invCfmDt[i] != null)
					model.setInvCfmDt(invCfmDt[i]);
				if (genPayTermDesc[i] != null)
					model.setGenPayTermDesc(genPayTermDesc[i]);
				if (totalAmt[i] != null)
					model.setTotalAmt(totalAmt[i]);
				if (invIssDt[i] != null)
					model.setInvIssDt(invIssDt[i]);
				if (invCurrCd[i] != null)
					model.setInvCurrCd(invCurrCd[i]);
				if (invRcvDt[i] != null)
					model.setInvRcvDt(invRcvDt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (paymentDueDt[i] != null)
					model.setPaymentDueDt(paymentDueDt[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (vndrNo[i] != null)
					model.setVndrNo(vndrNo[i]);
				if (vndrSeqName[i] != null)
					model.setVndrSeqName(vndrSeqName[i]);
				if (vndrSeq[i] != null)
					model.setVndrSeq(vndrSeq[i]);
				if (invSubSysCd[i] != null)
					model.setInvSubSysCd(invSubSysCd[i]);
				if (payTermTpCd[i] != null)
					model.setPayTermTpCd(payTermTpCd[i]);
				if (invOfcCd[i] != null)
					model.setInvOfcCd(invOfcCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getApPayInvListVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return ApPayInvListVO[]
	 */
	public ApPayInvListVO[] getApPayInvListVOs(){
		ApPayInvListVO[] vos = (ApPayInvListVO[])models.toArray(new ApPayInvListVO[models.size()]);
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
		this.cntInv = this.cntInv .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costOfcCd = this.costOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.psoTrnsSlpCtnt = this.psoTrnsSlpCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.genPayTermCd = this.genPayTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invCfmDt = this.invCfmDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.genPayTermDesc = this.genPayTermDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.totalAmt = this.totalAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invIssDt = this.invIssDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invCurrCd = this.invCurrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invRcvDt = this.invRcvDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.paymentDueDt = this.paymentDueDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrNo = this.vndrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrSeqName = this.vndrSeqName .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrSeq = this.vndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invSubSysCd = this.invSubSysCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.payTermTpCd = this.payTermTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invOfcCd = this.invOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
