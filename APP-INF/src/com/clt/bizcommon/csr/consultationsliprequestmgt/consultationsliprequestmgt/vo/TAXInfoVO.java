/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : TAXInfoVO.java
*@FileTitle : TAXInfoVO
*Open Issues :
*Change history :
*@LastModifyDate : 2010.06.17
*@LastModifier : 함대성
*@LastVersion : 1.0
* 2010.06.17 함대성 
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

public class TAXInfoVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<TAXInfoVO> models = new ArrayList<TAXInfoVO>();
	
	/* Column Info */
	private String vndrAddr = null;
	/* Column Info */
	private String taxNo1 = null;
	/* Column Info */
	private String bzctNm = null;
	/* Column Info */
	private String taxNo3 = null;
	/* Column Info */
	private String compNo = null;
	/* Column Info */
	private String taxNo2 = null;
	/* Column Info */
	private String apTaxNm = null;
	/* Column Info */
	private String bztpNm = null;
	/* Column Info */
	private String taxNslFlg = null;
	/* Column Info */
	private String vndrSeqHdr = null;
	/* Column Info */
	private String taxCode = null;
	/* Column Info */
	private String faFlg = null;
	/* Column Info */
	private String wkplcNmstring = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String vndrNm = null;
	/* Column Info */
	private String ofcCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String ceoNm = null;
	/* Column Info */
	private String vndrSeq = null;
	/* Column Info */
	private String taxType = null;
	/* Column Info */
	private String taxNaidFlg = null;
	/* Column Info */
	private String gsFlg = null;
	/* Column Info */
	private String rgstNo = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public TAXInfoVO() {}

	public TAXInfoVO(String ibflag, String pagerows, String vndrNm, String bzctNm, String bztpNm, String vndrAddr, String vndrSeq, String ceoNm, String wkplcNmstring, String taxNo3, String ofcCd, String creUsrId, String taxNo1, String taxNo2, String vndrSeqHdr, String compNo, String rgstNo, String taxType, String apTaxNm, String faFlg, String taxNaidFlg, String taxNslFlg, String taxCode, String gsFlg) {
		this.vndrAddr = vndrAddr;
		this.taxNo1 = taxNo1;
		this.bzctNm = bzctNm;
		this.taxNo3 = taxNo3;
		this.compNo = compNo;
		this.taxNo2 = taxNo2;
		this.apTaxNm = apTaxNm;
		this.bztpNm = bztpNm;
		this.taxNslFlg = taxNslFlg;
		this.vndrSeqHdr = vndrSeqHdr;
		this.taxCode = taxCode;
		this.faFlg = faFlg;
		this.wkplcNmstring = wkplcNmstring;
		this.pagerows = pagerows;
		this.vndrNm = vndrNm;
		this.ofcCd = ofcCd;
		this.ibflag = ibflag;
		this.creUsrId = creUsrId;
		this.ceoNm = ceoNm;
		this.vndrSeq = vndrSeq;
		this.taxType = taxType;
		this.taxNaidFlg = taxNaidFlg;
		this.gsFlg = gsFlg;
		this.rgstNo = rgstNo;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("vndr_addr", getVndrAddr());
		this.hashColumns.put("tax_no1", getTaxNo1());
		this.hashColumns.put("bzct_nm", getBzctNm());
		this.hashColumns.put("tax_no3", getTaxNo3());
		this.hashColumns.put("comp_no", getCompNo());
		this.hashColumns.put("tax_no2", getTaxNo2());
		this.hashColumns.put("ap_tax_nm", getApTaxNm());
		this.hashColumns.put("bztp_nm", getBztpNm());
		this.hashColumns.put("tax_nsl_flg", getTaxNslFlg());
		this.hashColumns.put("vndr_seq_hdr", getVndrSeqHdr());
		this.hashColumns.put("tax_code", getTaxCode());
		this.hashColumns.put("fa_flg", getFaFlg());
		this.hashColumns.put("wkplc_nmstring", getWkplcNmstring());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("vndr_nm", getVndrNm());
		this.hashColumns.put("ofc_cd", getOfcCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ceo_nm", getCeoNm());
		this.hashColumns.put("vndr_seq", getVndrSeq());
		this.hashColumns.put("tax_type", getTaxType());
		this.hashColumns.put("tax_naid_flg", getTaxNaidFlg());
		this.hashColumns.put("gs_flg", getGsFlg());
		this.hashColumns.put("rgst_no", getRgstNo());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("vndr_addr", "vndrAddr");
		this.hashFields.put("tax_no1", "taxNo1");
		this.hashFields.put("bzct_nm", "bzctNm");
		this.hashFields.put("tax_no3", "taxNo3");
		this.hashFields.put("comp_no", "compNo");
		this.hashFields.put("tax_no2", "taxNo2");
		this.hashFields.put("ap_tax_nm", "apTaxNm");
		this.hashFields.put("bztp_nm", "bztpNm");
		this.hashFields.put("tax_nsl_flg", "taxNslFlg");
		this.hashFields.put("vndr_seq_hdr", "vndrSeqHdr");
		this.hashFields.put("tax_code", "taxCode");
		this.hashFields.put("fa_flg", "faFlg");
		this.hashFields.put("wkplc_nmstring", "wkplcNmstring");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("vndr_nm", "vndrNm");
		this.hashFields.put("ofc_cd", "ofcCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ceo_nm", "ceoNm");
		this.hashFields.put("vndr_seq", "vndrSeq");
		this.hashFields.put("tax_type", "taxType");
		this.hashFields.put("tax_naid_flg", "taxNaidFlg");
		this.hashFields.put("gs_flg", "gsFlg");
		this.hashFields.put("rgst_no", "rgstNo");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return vndrAddr
	 */
	public String getVndrAddr() {
		return this.vndrAddr;
	}
	
	/**
	 * Column Info
	 * @return taxNo1
	 */
	public String getTaxNo1() {
		return this.taxNo1;
	}
	
	/**
	 * Column Info
	 * @return bzctNm
	 */
	public String getBzctNm() {
		return this.bzctNm;
	}
	
	/**
	 * Column Info
	 * @return taxNo3
	 */
	public String getTaxNo3() {
		return this.taxNo3;
	}
	
	/**
	 * Column Info
	 * @return compNo
	 */
	public String getCompNo() {
		return this.compNo;
	}
	
	/**
	 * Column Info
	 * @return taxNo2
	 */
	public String getTaxNo2() {
		return this.taxNo2;
	}
	
	/**
	 * Column Info
	 * @return apTaxNm
	 */
	public String getApTaxNm() {
		return this.apTaxNm;
	}
	
	/**
	 * Column Info
	 * @return bztpNm
	 */
	public String getBztpNm() {
		return this.bztpNm;
	}
	
	/**
	 * Column Info
	 * @return taxNslFlg
	 */
	public String getTaxNslFlg() {
		return this.taxNslFlg;
	}
	
	/**
	 * Column Info
	 * @return vndrSeqHdr
	 */
	public String getVndrSeqHdr() {
		return this.vndrSeqHdr;
	}
	
	/**
	 * Column Info
	 * @return taxCode
	 */
	public String getTaxCode() {
		return this.taxCode;
	}
	
	/**
	 * Column Info
	 * @return faFlg
	 */
	public String getFaFlg() {
		return this.faFlg;
	}
	
	/**
	 * Column Info
	 * @return wkplcNmstring
	 */
	public String getWkplcNmstring() {
		return this.wkplcNmstring;
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
	 * @return vndrNm
	 */
	public String getVndrNm() {
		return this.vndrNm;
	}
	
	/**
	 * Column Info
	 * @return ofcCd
	 */
	public String getOfcCd() {
		return this.ofcCd;
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
	 * @return creUsrId
	 */
	public String getCreUsrId() {
		return this.creUsrId;
	}
	
	/**
	 * Column Info
	 * @return ceoNm
	 */
	public String getCeoNm() {
		return this.ceoNm;
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
	 * @return taxType
	 */
	public String getTaxType() {
		return this.taxType;
	}
	
	/**
	 * Column Info
	 * @return taxNaidFlg
	 */
	public String getTaxNaidFlg() {
		return this.taxNaidFlg;
	}
	
	/**
	 * Column Info
	 * @return gsFlg
	 */
	public String getGsFlg() {
		return this.gsFlg;
	}
	
	/**
	 * Column Info
	 * @return rgstNo
	 */
	public String getRgstNo() {
		return this.rgstNo;
	}
	

	/**
	 * Column Info
	 * @param vndrAddr
	 */
	public void setVndrAddr(String vndrAddr) {
		this.vndrAddr = vndrAddr;
	}
	
	/**
	 * Column Info
	 * @param taxNo1
	 */
	public void setTaxNo1(String taxNo1) {
		this.taxNo1 = taxNo1;
	}
	
	/**
	 * Column Info
	 * @param bzctNm
	 */
	public void setBzctNm(String bzctNm) {
		this.bzctNm = bzctNm;
	}
	
	/**
	 * Column Info
	 * @param taxNo3
	 */
	public void setTaxNo3(String taxNo3) {
		this.taxNo3 = taxNo3;
	}
	
	/**
	 * Column Info
	 * @param compNo
	 */
	public void setCompNo(String compNo) {
		this.compNo = compNo;
	}
	
	/**
	 * Column Info
	 * @param taxNo2
	 */
	public void setTaxNo2(String taxNo2) {
		this.taxNo2 = taxNo2;
	}
	
	/**
	 * Column Info
	 * @param apTaxNm
	 */
	public void setApTaxNm(String apTaxNm) {
		this.apTaxNm = apTaxNm;
	}
	
	/**
	 * Column Info
	 * @param bztpNm
	 */
	public void setBztpNm(String bztpNm) {
		this.bztpNm = bztpNm;
	}
	
	/**
	 * Column Info
	 * @param taxNslFlg
	 */
	public void setTaxNslFlg(String taxNslFlg) {
		this.taxNslFlg = taxNslFlg;
	}
	
	/**
	 * Column Info
	 * @param vndrSeqHdr
	 */
	public void setVndrSeqHdr(String vndrSeqHdr) {
		this.vndrSeqHdr = vndrSeqHdr;
	}
	
	/**
	 * Column Info
	 * @param taxCode
	 */
	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}
	
	/**
	 * Column Info
	 * @param faFlg
	 */
	public void setFaFlg(String faFlg) {
		this.faFlg = faFlg;
	}
	
	/**
	 * Column Info
	 * @param wkplcNmstring
	 */
	public void setWkplcNmstring(String wkplcNmstring) {
		this.wkplcNmstring = wkplcNmstring;
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
	 * @param vndrNm
	 */
	public void setVndrNm(String vndrNm) {
		this.vndrNm = vndrNm;
	}
	
	/**
	 * Column Info
	 * @param ofcCd
	 */
	public void setOfcCd(String ofcCd) {
		this.ofcCd = ofcCd;
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
	 * @param creUsrId
	 */
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
	}
	
	/**
	 * Column Info
	 * @param ceoNm
	 */
	public void setCeoNm(String ceoNm) {
		this.ceoNm = ceoNm;
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
	 * @param taxType
	 */
	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}
	
	/**
	 * Column Info
	 * @param taxNaidFlg
	 */
	public void setTaxNaidFlg(String taxNaidFlg) {
		this.taxNaidFlg = taxNaidFlg;
	}
	
	/**
	 * Column Info
	 * @param gsFlg
	 */
	public void setGsFlg(String gsFlg) {
		this.gsFlg = gsFlg;
	}
	
	/**
	 * Column Info
	 * @param rgstNo
	 */
	public void setRgstNo(String rgstNo) {
		this.rgstNo = rgstNo;
	}
	
/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		fromRequest(request,"");
	}

	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request, String prefix) {
		setVndrAddr(JSPUtil.getParameter(request, prefix + "vndr_addr", ""));
		setTaxNo1(JSPUtil.getParameter(request, prefix + "tax_no1", ""));
		setBzctNm(JSPUtil.getParameter(request, prefix + "bzct_nm", ""));
		setTaxNo3(JSPUtil.getParameter(request, prefix + "tax_no3", ""));
		setCompNo(JSPUtil.getParameter(request, prefix + "comp_no", ""));
		setTaxNo2(JSPUtil.getParameter(request, prefix + "tax_no2", ""));
		setApTaxNm(JSPUtil.getParameter(request, prefix + "ap_tax_nm", ""));
		setBztpNm(JSPUtil.getParameter(request, prefix + "bztp_nm", ""));
		setTaxNslFlg(JSPUtil.getParameter(request, prefix + "tax_nsl_flg", ""));
		setVndrSeqHdr(JSPUtil.getParameter(request, prefix + "vndr_seq_hdr", ""));
		setTaxCode(JSPUtil.getParameter(request, prefix + "tax_code", ""));
		setFaFlg(JSPUtil.getParameter(request, prefix + "fa_flg", ""));
		setWkplcNmstring(JSPUtil.getParameter(request, prefix + "wkplc_nmstring", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setVndrNm(JSPUtil.getParameter(request, prefix + "vndr_nm", ""));
		setOfcCd(JSPUtil.getParameter(request, prefix + "ofc_cd", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setCeoNm(JSPUtil.getParameter(request, prefix + "ceo_nm", ""));
		setVndrSeq(JSPUtil.getParameter(request, prefix + "vndr_seq", ""));
		setTaxType(JSPUtil.getParameter(request, prefix + "tax_type", ""));
		setTaxNaidFlg(JSPUtil.getParameter(request, prefix + "tax_naid_flg", ""));
		setGsFlg(JSPUtil.getParameter(request, prefix + "gs_flg", ""));
		setRgstNo(JSPUtil.getParameter(request, prefix + "rgst_no", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return TAXInfoVO[]
	 */
	public TAXInfoVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return TAXInfoVO[]
	 */
	public TAXInfoVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		TAXInfoVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] vndrAddr = (JSPUtil.getParameter(request, prefix	+ "vndr_addr", length));
			String[] taxNo1 = (JSPUtil.getParameter(request, prefix	+ "tax_no1", length));
			String[] bzctNm = (JSPUtil.getParameter(request, prefix	+ "bzct_nm", length));
			String[] taxNo3 = (JSPUtil.getParameter(request, prefix	+ "tax_no3", length));
			String[] compNo = (JSPUtil.getParameter(request, prefix	+ "comp_no", length));
			String[] taxNo2 = (JSPUtil.getParameter(request, prefix	+ "tax_no2", length));
			String[] apTaxNm = (JSPUtil.getParameter(request, prefix	+ "ap_tax_nm", length));
			String[] bztpNm = (JSPUtil.getParameter(request, prefix	+ "bztp_nm", length));
			String[] taxNslFlg = (JSPUtil.getParameter(request, prefix	+ "tax_nsl_flg", length));
			String[] vndrSeqHdr = (JSPUtil.getParameter(request, prefix	+ "vndr_seq_hdr", length));
			String[] taxCode = (JSPUtil.getParameter(request, prefix	+ "tax_code", length));
			String[] faFlg = (JSPUtil.getParameter(request, prefix	+ "fa_flg", length));
			String[] wkplcNmstring = (JSPUtil.getParameter(request, prefix	+ "wkplc_nmstring", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] vndrNm = (JSPUtil.getParameter(request, prefix	+ "vndr_nm", length));
			String[] ofcCd = (JSPUtil.getParameter(request, prefix	+ "ofc_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ceoNm = (JSPUtil.getParameter(request, prefix	+ "ceo_nm", length));
			String[] vndrSeq = (JSPUtil.getParameter(request, prefix	+ "vndr_seq", length));
			String[] taxType = (JSPUtil.getParameter(request, prefix	+ "tax_type", length));
			String[] taxNaidFlg = (JSPUtil.getParameter(request, prefix	+ "tax_naid_flg", length));
			String[] gsFlg = (JSPUtil.getParameter(request, prefix	+ "gs_flg", length));
			String[] rgstNo = (JSPUtil.getParameter(request, prefix	+ "rgst_no", length));
			
			for (int i = 0; i < length; i++) {
				model = new TAXInfoVO();
				if (vndrAddr[i] != null)
					model.setVndrAddr(vndrAddr[i]);
				if (taxNo1[i] != null)
					model.setTaxNo1(taxNo1[i]);
				if (bzctNm[i] != null)
					model.setBzctNm(bzctNm[i]);
				if (taxNo3[i] != null)
					model.setTaxNo3(taxNo3[i]);
				if (compNo[i] != null)
					model.setCompNo(compNo[i]);
				if (taxNo2[i] != null)
					model.setTaxNo2(taxNo2[i]);
				if (apTaxNm[i] != null)
					model.setApTaxNm(apTaxNm[i]);
				if (bztpNm[i] != null)
					model.setBztpNm(bztpNm[i]);
				if (taxNslFlg[i] != null)
					model.setTaxNslFlg(taxNslFlg[i]);
				if (vndrSeqHdr[i] != null)
					model.setVndrSeqHdr(vndrSeqHdr[i]);
				if (taxCode[i] != null)
					model.setTaxCode(taxCode[i]);
				if (faFlg[i] != null)
					model.setFaFlg(faFlg[i]);
				if (wkplcNmstring[i] != null)
					model.setWkplcNmstring(wkplcNmstring[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (vndrNm[i] != null)
					model.setVndrNm(vndrNm[i]);
				if (ofcCd[i] != null)
					model.setOfcCd(ofcCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ceoNm[i] != null)
					model.setCeoNm(ceoNm[i]);
				if (vndrSeq[i] != null)
					model.setVndrSeq(vndrSeq[i]);
				if (taxType[i] != null)
					model.setTaxType(taxType[i]);
				if (taxNaidFlg[i] != null)
					model.setTaxNaidFlg(taxNaidFlg[i]);
				if (gsFlg[i] != null)
					model.setGsFlg(gsFlg[i]);
				if (rgstNo[i] != null)
					model.setRgstNo(rgstNo[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getTAXInfoVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return TAXInfoVO[]
	 */
	public TAXInfoVO[] getTAXInfoVOs(){
		TAXInfoVO[] vos = (TAXInfoVO[])models.toArray(new TAXInfoVO[models.size()]);
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
		this.vndrAddr = this.vndrAddr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.taxNo1 = this.taxNo1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bzctNm = this.bzctNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.taxNo3 = this.taxNo3 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.compNo = this.compNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.taxNo2 = this.taxNo2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.apTaxNm = this.apTaxNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bztpNm = this.bztpNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.taxNslFlg = this.taxNslFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrSeqHdr = this.vndrSeqHdr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.taxCode = this.taxCode .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faFlg = this.faFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.wkplcNmstring = this.wkplcNmstring .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrNm = this.vndrNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcCd = this.ofcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ceoNm = this.ceoNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrSeq = this.vndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.taxType = this.taxType .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.taxNaidFlg = this.taxNaidFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.gsFlg = this.gsFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rgstNo = this.rgstNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
