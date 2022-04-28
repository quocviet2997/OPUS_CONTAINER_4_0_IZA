/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : HdrVO.java
*@FileTitle : HdrVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.10.30
*@LastModifier : 함대성
*@LastVersion : 1.0
* 2009.10.30 함대성 
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

public class HdrVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<HdrVO> models = new ArrayList<HdrVO>();
	
	/* Column Info */
	private String aproStep = null;
	/* Column Info */
	private String prePayAmt = null;
	/* Column Info */
	private String preInvDt = null;
	/* Column Info */
	private String preCurrCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String chkSteCd = null;
	/* Column Info */
	private String preEviTp = null;
	/* Column Info */
	private String prePayGroup = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String preAmt = null;
	/* Column Info */
	private String chkAddr1 = null;
	/* Column Info */
	private String chkAddr2 = null;
	/* Column Info */
	private String preOffice = null;
	/* Column Info */
	private String chkAddr3 = null;
	/* Column Info */
	private String preCsrNo = null;
	/* Column Info */
	private String preDueDate = null;
	/* Column Info */
	private String preAsaNo = null;
	/* Column Info */
	private String prePayTo = null;
	/* Column Info */
	private String chkCtyNm = null;
	/* Column Info */
	private String chkCntCd = null;
	/* Column Info */
	private String preDesc = null;
	/* Column Info */
	private String prePrpdDy = null;
	/* Column Info */
	private String chkZipCd = null;
	/* Column Info */
	private String preCsrType = null;
	/* Column Info */
	private String chkAddr = null;
	/* Column Info */
	private String prePayCurrCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public HdrVO() {}

	public HdrVO(String ibflag, String pagerows, String preCsrNo, String preOffice, String prePrpdDy, String prePayTo, String preCsrType, String preDesc, String prePayGroup, String preEviTp, String preDueDate, String preAsaNo, String preInvDt, String preCurrCd, String preAmt, String prePayCurrCd, String prePayAmt, String aproStep, String chkAddr, String chkAddr1, String chkAddr2, String chkAddr3, String chkCtyNm, String chkSteCd, String chkZipCd, String chkCntCd) {
		this.aproStep = aproStep;
		this.prePayAmt = prePayAmt;
		this.preInvDt = preInvDt;
		this.preCurrCd = preCurrCd;
		this.pagerows = pagerows;
		this.chkSteCd = chkSteCd;
		this.preEviTp = preEviTp;
		this.prePayGroup = prePayGroup;
		this.ibflag = ibflag;
		this.preAmt = preAmt;
		this.chkAddr1 = chkAddr1;
		this.chkAddr2 = chkAddr2;
		this.preOffice = preOffice;
		this.chkAddr3 = chkAddr3;
		this.preCsrNo = preCsrNo;
		this.preDueDate = preDueDate;
		this.preAsaNo = preAsaNo;
		this.prePayTo = prePayTo;
		this.chkCtyNm = chkCtyNm;
		this.chkCntCd = chkCntCd;
		this.preDesc = preDesc;
		this.prePrpdDy = prePrpdDy;
		this.chkZipCd = chkZipCd;
		this.preCsrType = preCsrType;
		this.chkAddr = chkAddr;
		this.prePayCurrCd = prePayCurrCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("apro_step", getAproStep());
		this.hashColumns.put("pre_pay_amt", getPrePayAmt());
		this.hashColumns.put("pre_inv_dt", getPreInvDt());
		this.hashColumns.put("pre_curr_cd", getPreCurrCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("chk_ste_cd", getChkSteCd());
		this.hashColumns.put("pre_evi_tp", getPreEviTp());
		this.hashColumns.put("pre_pay_group", getPrePayGroup());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("pre_amt", getPreAmt());
		this.hashColumns.put("chk_addr1", getChkAddr1());
		this.hashColumns.put("chk_addr2", getChkAddr2());
		this.hashColumns.put("pre_office", getPreOffice());
		this.hashColumns.put("chk_addr3", getChkAddr3());
		this.hashColumns.put("pre_csr_no", getPreCsrNo());
		this.hashColumns.put("pre_due_date", getPreDueDate());
		this.hashColumns.put("pre_asa_no", getPreAsaNo());
		this.hashColumns.put("pre_pay_to", getPrePayTo());
		this.hashColumns.put("chk_cty_nm", getChkCtyNm());
		this.hashColumns.put("chk_cnt_cd", getChkCntCd());
		this.hashColumns.put("pre_desc", getPreDesc());
		this.hashColumns.put("pre_prpd_dy", getPrePrpdDy());
		this.hashColumns.put("chk_zip_cd", getChkZipCd());
		this.hashColumns.put("pre_csr_type", getPreCsrType());
		this.hashColumns.put("chk_addr", getChkAddr());
		this.hashColumns.put("pre_pay_curr_cd", getPrePayCurrCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("apro_step", "aproStep");
		this.hashFields.put("pre_pay_amt", "prePayAmt");
		this.hashFields.put("pre_inv_dt", "preInvDt");
		this.hashFields.put("pre_curr_cd", "preCurrCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("chk_ste_cd", "chkSteCd");
		this.hashFields.put("pre_evi_tp", "preEviTp");
		this.hashFields.put("pre_pay_group", "prePayGroup");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("pre_amt", "preAmt");
		this.hashFields.put("chk_addr1", "chkAddr1");
		this.hashFields.put("chk_addr2", "chkAddr2");
		this.hashFields.put("pre_office", "preOffice");
		this.hashFields.put("chk_addr3", "chkAddr3");
		this.hashFields.put("pre_csr_no", "preCsrNo");
		this.hashFields.put("pre_due_date", "preDueDate");
		this.hashFields.put("pre_asa_no", "preAsaNo");
		this.hashFields.put("pre_pay_to", "prePayTo");
		this.hashFields.put("chk_cty_nm", "chkCtyNm");
		this.hashFields.put("chk_cnt_cd", "chkCntCd");
		this.hashFields.put("pre_desc", "preDesc");
		this.hashFields.put("pre_prpd_dy", "prePrpdDy");
		this.hashFields.put("chk_zip_cd", "chkZipCd");
		this.hashFields.put("pre_csr_type", "preCsrType");
		this.hashFields.put("chk_addr", "chkAddr");
		this.hashFields.put("pre_pay_curr_cd", "prePayCurrCd");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return aproStep
	 */
	public String getAproStep() {
		return this.aproStep;
	}
	
	/**
	 * Column Info
	 * @return prePayAmt
	 */
	public String getPrePayAmt() {
		return this.prePayAmt;
	}
	
	/**
	 * Column Info
	 * @return preInvDt
	 */
	public String getPreInvDt() {
		return this.preInvDt;
	}
	
	/**
	 * Column Info
	 * @return preCurrCd
	 */
	public String getPreCurrCd() {
		return this.preCurrCd;
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
	 * @return chkSteCd
	 */
	public String getChkSteCd() {
		return this.chkSteCd;
	}
	
	/**
	 * Column Info
	 * @return preEviTp
	 */
	public String getPreEviTp() {
		return this.preEviTp;
	}
	
	/**
	 * Column Info
	 * @return prePayGroup
	 */
	public String getPrePayGroup() {
		return this.prePayGroup;
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
	 * @return preAmt
	 */
	public String getPreAmt() {
		return this.preAmt;
	}
	
	/**
	 * Column Info
	 * @return chkAddr1
	 */
	public String getChkAddr1() {
		return this.chkAddr1;
	}
	
	/**
	 * Column Info
	 * @return chkAddr2
	 */
	public String getChkAddr2() {
		return this.chkAddr2;
	}
	
	/**
	 * Column Info
	 * @return preOffice
	 */
	public String getPreOffice() {
		return this.preOffice;
	}
	
	/**
	 * Column Info
	 * @return chkAddr3
	 */
	public String getChkAddr3() {
		return this.chkAddr3;
	}
	
	/**
	 * Column Info
	 * @return preCsrNo
	 */
	public String getPreCsrNo() {
		return this.preCsrNo;
	}
	
	/**
	 * Column Info
	 * @return preDueDate
	 */
	public String getPreDueDate() {
		return this.preDueDate;
	}
	
	/**
	 * Column Info
	 * @return preAsaNo
	 */
	public String getPreAsaNo() {
		return this.preAsaNo;
	}
	
	/**
	 * Column Info
	 * @return prePayTo
	 */
	public String getPrePayTo() {
		return this.prePayTo;
	}
	
	/**
	 * Column Info
	 * @return chkCtyNm
	 */
	public String getChkCtyNm() {
		return this.chkCtyNm;
	}
	
	/**
	 * Column Info
	 * @return chkCntCd
	 */
	public String getChkCntCd() {
		return this.chkCntCd;
	}
	
	/**
	 * Column Info
	 * @return preDesc
	 */
	public String getPreDesc() {
		return this.preDesc;
	}
	
	/**
	 * Column Info
	 * @return prePrpdDy
	 */
	public String getPrePrpdDy() {
		return this.prePrpdDy;
	}
	
	/**
	 * Column Info
	 * @return chkZipCd
	 */
	public String getChkZipCd() {
		return this.chkZipCd;
	}
	
	/**
	 * Column Info
	 * @return preCsrType
	 */
	public String getPreCsrType() {
		return this.preCsrType;
	}
	
	/**
	 * Column Info
	 * @return chkAddr
	 */
	public String getChkAddr() {
		return this.chkAddr;
	}
	
	/**
	 * Column Info
	 * @return prePayCurrCd
	 */
	public String getPrePayCurrCd() {
		return this.prePayCurrCd;
	}
	

	/**
	 * Column Info
	 * @param aproStep
	 */
	public void setAproStep(String aproStep) {
		this.aproStep = aproStep;
	}
	
	/**
	 * Column Info
	 * @param prePayAmt
	 */
	public void setPrePayAmt(String prePayAmt) {
		this.prePayAmt = prePayAmt;
	}
	
	/**
	 * Column Info
	 * @param preInvDt
	 */
	public void setPreInvDt(String preInvDt) {
		this.preInvDt = preInvDt;
	}
	
	/**
	 * Column Info
	 * @param preCurrCd
	 */
	public void setPreCurrCd(String preCurrCd) {
		this.preCurrCd = preCurrCd;
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
	 * @param chkSteCd
	 */
	public void setChkSteCd(String chkSteCd) {
		this.chkSteCd = chkSteCd;
	}
	
	/**
	 * Column Info
	 * @param preEviTp
	 */
	public void setPreEviTp(String preEviTp) {
		this.preEviTp = preEviTp;
	}
	
	/**
	 * Column Info
	 * @param prePayGroup
	 */
	public void setPrePayGroup(String prePayGroup) {
		this.prePayGroup = prePayGroup;
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
	 * @param preAmt
	 */
	public void setPreAmt(String preAmt) {
		this.preAmt = preAmt;
	}
	
	/**
	 * Column Info
	 * @param chkAddr1
	 */
	public void setChkAddr1(String chkAddr1) {
		this.chkAddr1 = chkAddr1;
	}
	
	/**
	 * Column Info
	 * @param chkAddr2
	 */
	public void setChkAddr2(String chkAddr2) {
		this.chkAddr2 = chkAddr2;
	}
	
	/**
	 * Column Info
	 * @param preOffice
	 */
	public void setPreOffice(String preOffice) {
		this.preOffice = preOffice;
	}
	
	/**
	 * Column Info
	 * @param chkAddr3
	 */
	public void setChkAddr3(String chkAddr3) {
		this.chkAddr3 = chkAddr3;
	}
	
	/**
	 * Column Info
	 * @param preCsrNo
	 */
	public void setPreCsrNo(String preCsrNo) {
		this.preCsrNo = preCsrNo;
	}
	
	/**
	 * Column Info
	 * @param preDueDate
	 */
	public void setPreDueDate(String preDueDate) {
		this.preDueDate = preDueDate;
	}
	
	/**
	 * Column Info
	 * @param preAsaNo
	 */
	public void setPreAsaNo(String preAsaNo) {
		this.preAsaNo = preAsaNo;
	}
	
	/**
	 * Column Info
	 * @param prePayTo
	 */
	public void setPrePayTo(String prePayTo) {
		this.prePayTo = prePayTo;
	}
	
	/**
	 * Column Info
	 * @param chkCtyNm
	 */
	public void setChkCtyNm(String chkCtyNm) {
		this.chkCtyNm = chkCtyNm;
	}
	
	/**
	 * Column Info
	 * @param chkCntCd
	 */
	public void setChkCntCd(String chkCntCd) {
		this.chkCntCd = chkCntCd;
	}
	
	/**
	 * Column Info
	 * @param preDesc
	 */
	public void setPreDesc(String preDesc) {
		this.preDesc = preDesc;
	}
	
	/**
	 * Column Info
	 * @param prePrpdDy
	 */
	public void setPrePrpdDy(String prePrpdDy) {
		this.prePrpdDy = prePrpdDy;
	}
	
	/**
	 * Column Info
	 * @param chkZipCd
	 */
	public void setChkZipCd(String chkZipCd) {
		this.chkZipCd = chkZipCd;
	}
	
	/**
	 * Column Info
	 * @param preCsrType
	 */
	public void setPreCsrType(String preCsrType) {
		this.preCsrType = preCsrType;
	}
	
	/**
	 * Column Info
	 * @param chkAddr
	 */
	public void setChkAddr(String chkAddr) {
		this.chkAddr = chkAddr;
	}
	
	/**
	 * Column Info
	 * @param prePayCurrCd
	 */
	public void setPrePayCurrCd(String prePayCurrCd) {
		this.prePayCurrCd = prePayCurrCd;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setAproStep(JSPUtil.getParameter(request, "apro_step", ""));
		setPrePayAmt(JSPUtil.getParameter(request, "pre_pay_amt", ""));
		setPreInvDt(JSPUtil.getParameter(request, "pre_inv_dt", ""));
		setPreCurrCd(JSPUtil.getParameter(request, "pre_curr_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setChkSteCd(JSPUtil.getParameter(request, "chk_ste_cd", ""));
		setPreEviTp(JSPUtil.getParameter(request, "pre_evi_tp", ""));
		setPrePayGroup(JSPUtil.getParameter(request, "pre_pay_group", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setPreAmt(JSPUtil.getParameter(request, "pre_amt", ""));
		setChkAddr1(JSPUtil.getParameter(request, "chk_addr1", ""));
		setChkAddr2(JSPUtil.getParameter(request, "chk_addr2", ""));
		setPreOffice(JSPUtil.getParameter(request, "pre_office", ""));
		setChkAddr3(JSPUtil.getParameter(request, "chk_addr3", ""));
		setPreCsrNo(JSPUtil.getParameter(request, "pre_csr_no", ""));
		setPreDueDate(JSPUtil.getParameter(request, "pre_due_date", ""));
		setPreAsaNo(JSPUtil.getParameter(request, "pre_asa_no", ""));
		setPrePayTo(JSPUtil.getParameter(request, "pre_pay_to", ""));
		setChkCtyNm(JSPUtil.getParameter(request, "chk_cty_nm", ""));
		setChkCntCd(JSPUtil.getParameter(request, "chk_cnt_cd", ""));
		setPreDesc(JSPUtil.getParameter(request, "pre_desc", ""));
		setPrePrpdDy(JSPUtil.getParameter(request, "pre_prpd_dy", ""));
		setChkZipCd(JSPUtil.getParameter(request, "chk_zip_cd", ""));
		setPreCsrType(JSPUtil.getParameter(request, "pre_csr_type", ""));
		setChkAddr(JSPUtil.getParameter(request, "chk_addr", ""));
		setPrePayCurrCd(JSPUtil.getParameter(request, "pre_pay_curr_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return HdrVO[]
	 */
	public HdrVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return HdrVO[]
	 */
	public HdrVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		HdrVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] aproStep = (JSPUtil.getParameter(request, prefix	+ "apro_step", length));
			String[] prePayAmt = (JSPUtil.getParameter(request, prefix	+ "pre_pay_amt", length));
			String[] preInvDt = (JSPUtil.getParameter(request, prefix	+ "pre_inv_dt", length));
			String[] preCurrCd = (JSPUtil.getParameter(request, prefix	+ "pre_curr_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] chkSteCd = (JSPUtil.getParameter(request, prefix	+ "chk_ste_cd", length));
			String[] preEviTp = (JSPUtil.getParameter(request, prefix	+ "pre_evi_tp", length));
			String[] prePayGroup = (JSPUtil.getParameter(request, prefix	+ "pre_pay_group", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] preAmt = (JSPUtil.getParameter(request, prefix	+ "pre_amt", length));
			String[] chkAddr1 = (JSPUtil.getParameter(request, prefix	+ "chk_addr1", length));
			String[] chkAddr2 = (JSPUtil.getParameter(request, prefix	+ "chk_addr2", length));
			String[] preOffice = (JSPUtil.getParameter(request, prefix	+ "pre_office", length));
			String[] chkAddr3 = (JSPUtil.getParameter(request, prefix	+ "chk_addr3", length));
			String[] preCsrNo = (JSPUtil.getParameter(request, prefix	+ "pre_csr_no", length));
			String[] preDueDate = (JSPUtil.getParameter(request, prefix	+ "pre_due_date", length));
			String[] preAsaNo = (JSPUtil.getParameter(request, prefix	+ "pre_asa_no", length));
			String[] prePayTo = (JSPUtil.getParameter(request, prefix	+ "pre_pay_to", length));
			String[] chkCtyNm = (JSPUtil.getParameter(request, prefix	+ "chk_cty_nm", length));
			String[] chkCntCd = (JSPUtil.getParameter(request, prefix	+ "chk_cnt_cd", length));
			String[] preDesc = (JSPUtil.getParameter(request, prefix	+ "pre_desc", length));
			String[] prePrpdDy = (JSPUtil.getParameter(request, prefix	+ "pre_prpd_dy", length));
			String[] chkZipCd = (JSPUtil.getParameter(request, prefix	+ "chk_zip_cd", length));
			String[] preCsrType = (JSPUtil.getParameter(request, prefix	+ "pre_csr_type", length));
			String[] chkAddr = (JSPUtil.getParameter(request, prefix	+ "chk_addr", length));
			String[] prePayCurrCd = (JSPUtil.getParameter(request, prefix	+ "pre_pay_curr_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new HdrVO();
				if (aproStep[i] != null)
					model.setAproStep(aproStep[i]);
				if (prePayAmt[i] != null)
					model.setPrePayAmt(prePayAmt[i]);
				if (preInvDt[i] != null)
					model.setPreInvDt(preInvDt[i]);
				if (preCurrCd[i] != null)
					model.setPreCurrCd(preCurrCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (chkSteCd[i] != null)
					model.setChkSteCd(chkSteCd[i]);
				if (preEviTp[i] != null)
					model.setPreEviTp(preEviTp[i]);
				if (prePayGroup[i] != null)
					model.setPrePayGroup(prePayGroup[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (preAmt[i] != null)
					model.setPreAmt(preAmt[i]);
				if (chkAddr1[i] != null)
					model.setChkAddr1(chkAddr1[i]);
				if (chkAddr2[i] != null)
					model.setChkAddr2(chkAddr2[i]);
				if (preOffice[i] != null)
					model.setPreOffice(preOffice[i]);
				if (chkAddr3[i] != null)
					model.setChkAddr3(chkAddr3[i]);
				if (preCsrNo[i] != null)
					model.setPreCsrNo(preCsrNo[i]);
				if (preDueDate[i] != null)
					model.setPreDueDate(preDueDate[i]);
				if (preAsaNo[i] != null)
					model.setPreAsaNo(preAsaNo[i]);
				if (prePayTo[i] != null)
					model.setPrePayTo(prePayTo[i]);
				if (chkCtyNm[i] != null)
					model.setChkCtyNm(chkCtyNm[i]);
				if (chkCntCd[i] != null)
					model.setChkCntCd(chkCntCd[i]);
				if (preDesc[i] != null)
					model.setPreDesc(preDesc[i]);
				if (prePrpdDy[i] != null)
					model.setPrePrpdDy(prePrpdDy[i]);
				if (chkZipCd[i] != null)
					model.setChkZipCd(chkZipCd[i]);
				if (preCsrType[i] != null)
					model.setPreCsrType(preCsrType[i]);
				if (chkAddr[i] != null)
					model.setChkAddr(chkAddr[i]);
				if (prePayCurrCd[i] != null)
					model.setPrePayCurrCd(prePayCurrCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getHdrVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return HdrVO[]
	 */
	public HdrVO[] getHdrVOs(){
		HdrVO[] vos = (HdrVO[])models.toArray(new HdrVO[models.size()]);
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
		this.aproStep = this.aproStep .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prePayAmt = this.prePayAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.preInvDt = this.preInvDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.preCurrCd = this.preCurrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chkSteCd = this.chkSteCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.preEviTp = this.preEviTp .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prePayGroup = this.prePayGroup .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.preAmt = this.preAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chkAddr1 = this.chkAddr1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chkAddr2 = this.chkAddr2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.preOffice = this.preOffice .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chkAddr3 = this.chkAddr3 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.preCsrNo = this.preCsrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.preDueDate = this.preDueDate .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.preAsaNo = this.preAsaNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prePayTo = this.prePayTo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chkCtyNm = this.chkCtyNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chkCntCd = this.chkCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.preDesc = this.preDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prePrpdDy = this.prePrpdDy .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chkZipCd = this.chkZipCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.preCsrType = this.preCsrType .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chkAddr = this.chkAddr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prePayCurrCd = this.prePayCurrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
