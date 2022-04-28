/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ApInvDTRBOutVO.java
*@FileTitle : ApInvDTRBOutVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.11.23
*@LastModifier : 함대성
*@LastVersion : 1.0
* 2009.11.23 함대성 
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

public class ApInvDTRBOutVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<ApInvDTRBOutVO> models = new ArrayList<ApInvDTRBOutVO>();
	
	/* Column Info */
	private String lineSeq = null;
	/* Column Info */
	private String attrCtnt10 = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String ftuUseCntr5 = null;
	/* Column Info */
	private String attrCtnt14 = null;
	/* Column Info */
	private String attrCtnt9 = null;
	/* Column Info */
	private String attrCtnt13 = null;
	/* Column Info */
	private String attrCtnt8 = null;
	/* Column Info */
	private String attrCtnt12 = null;
	/* Column Info */
	private String attrCtnt11 = null;
	/* Column Info */
	private String attrCtnt15 = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String dtrbCoaInterCoCd = null;
	/* Column Info */
	private String attrCtnt1 = null;
	/* Column Info */
	private String invDesc = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String attrCtnt2 = null;
	/* Column Info */
	private String attrCtnt3 = null;
	/* Column Info */
	private String attrCtnt4 = null;
	/* Column Info */
	private String attrCtnt5 = null;
	/* Column Info */
	private String attrCtnt6 = null;
	/* Column Info */
	private String cntrTpszCd = null;
	/* Column Info */
	private String attrCtnt7 = null;
	/* Column Info */
	private String ftuUseCtnt2 = null;
	/* Column Info */
	private String ftuUseCtnt1 = null;
	/* Column Info */
	private String lineTpLuCd = null;
	/* Column Info */
	private String attrCateNm = null;
	/* Column Info */
	private String ftuUseCtnt4 = null;
	/* Column Info */
	private String ftuUseCtnt3 = null;
	/* Column Info */
	private String dtrbCoaAcctCd = null;
	/* Column Info */
	private String dtrbCoaFtuN1stCd = null;
	/* Column Info */
	private String dtrbCoaCoCd = null;
	/* Column Info */
	private String soCrrCd = null;
	/* Column Info */
	private String dtrbCoaCtrCd = null;
	/* Column Info */
	private String invTaxCd = null;
	/* Column Info */
	private String plnSctrDivCd = null;
	/* Column Info */
	private String lineNo = null;
	/* Column Info */
	private String eaiEvntDt = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String ydCd = null;
	/* Column Info */
	private String dtrbCoaVvdCd = null;
	/* Column Info */
	private String csrAmt = null;
	/* Column Info */
	private String actVvdCd = null;
	/* Column Info */
	private String dtrbCoaFtuN2ndCd = null;
	/* Column Info */
	private String dtrbCoaRgnCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public ApInvDTRBOutVO() {}

	public ApInvDTRBOutVO(String ibflag, String pagerows, String lineSeq, String lineNo, String lineTpLuCd, String csrAmt, String invDesc, String invTaxCd, String dtrbCoaCoCd, String dtrbCoaRgnCd, String dtrbCoaCtrCd, String dtrbCoaAcctCd, String dtrbCoaVvdCd, String dtrbCoaInterCoCd, String dtrbCoaFtuN1stCd, String dtrbCoaFtuN2ndCd, String attrCateNm, String attrCtnt1, String attrCtnt2, String attrCtnt3, String attrCtnt4, String attrCtnt5, String attrCtnt6, String attrCtnt7, String attrCtnt8, String attrCtnt9, String attrCtnt10, String attrCtnt11, String attrCtnt12, String attrCtnt13, String attrCtnt14, String attrCtnt15, String bkgNo, String cntrTpszCd, String actVvdCd, String plnSctrDivCd, String soCrrCd, String ydCd, String ftuUseCtnt1, String ftuUseCtnt2, String ftuUseCtnt3, String ftuUseCtnt4, String ftuUseCntr5, String creDt, String creUsrId, String eaiEvntDt) {
		this.lineSeq = lineSeq;
		this.attrCtnt10 = attrCtnt10;
		this.creDt = creDt;
		this.ftuUseCntr5 = ftuUseCntr5;
		this.attrCtnt14 = attrCtnt14;
		this.attrCtnt9 = attrCtnt9;
		this.attrCtnt13 = attrCtnt13;
		this.attrCtnt8 = attrCtnt8;
		this.attrCtnt12 = attrCtnt12;
		this.attrCtnt11 = attrCtnt11;
		this.attrCtnt15 = attrCtnt15;
		this.pagerows = pagerows;
		this.dtrbCoaInterCoCd = dtrbCoaInterCoCd;
		this.attrCtnt1 = attrCtnt1;
		this.invDesc = invDesc;
		this.ibflag = ibflag;
		this.attrCtnt2 = attrCtnt2;
		this.attrCtnt3 = attrCtnt3;
		this.attrCtnt4 = attrCtnt4;
		this.attrCtnt5 = attrCtnt5;
		this.attrCtnt6 = attrCtnt6;
		this.cntrTpszCd = cntrTpszCd;
		this.attrCtnt7 = attrCtnt7;
		this.ftuUseCtnt2 = ftuUseCtnt2;
		this.ftuUseCtnt1 = ftuUseCtnt1;
		this.lineTpLuCd = lineTpLuCd;
		this.attrCateNm = attrCateNm;
		this.ftuUseCtnt4 = ftuUseCtnt4;
		this.ftuUseCtnt3 = ftuUseCtnt3;
		this.dtrbCoaAcctCd = dtrbCoaAcctCd;
		this.dtrbCoaFtuN1stCd = dtrbCoaFtuN1stCd;
		this.dtrbCoaCoCd = dtrbCoaCoCd;
		this.soCrrCd = soCrrCd;
		this.dtrbCoaCtrCd = dtrbCoaCtrCd;
		this.invTaxCd = invTaxCd;
		this.plnSctrDivCd = plnSctrDivCd;
		this.lineNo = lineNo;
		this.eaiEvntDt = eaiEvntDt;
		this.creUsrId = creUsrId;
		this.bkgNo = bkgNo;
		this.ydCd = ydCd;
		this.dtrbCoaVvdCd = dtrbCoaVvdCd;
		this.csrAmt = csrAmt;
		this.actVvdCd = actVvdCd;
		this.dtrbCoaFtuN2ndCd = dtrbCoaFtuN2ndCd;
		this.dtrbCoaRgnCd = dtrbCoaRgnCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("line_seq", getLineSeq());
		this.hashColumns.put("attr_ctnt10", getAttrCtnt10());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("ftu_use_cntr5", getFtuUseCntr5());
		this.hashColumns.put("attr_ctnt14", getAttrCtnt14());
		this.hashColumns.put("attr_ctnt9", getAttrCtnt9());
		this.hashColumns.put("attr_ctnt13", getAttrCtnt13());
		this.hashColumns.put("attr_ctnt8", getAttrCtnt8());
		this.hashColumns.put("attr_ctnt12", getAttrCtnt12());
		this.hashColumns.put("attr_ctnt11", getAttrCtnt11());
		this.hashColumns.put("attr_ctnt15", getAttrCtnt15());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("dtrb_coa_inter_co_cd", getDtrbCoaInterCoCd());
		this.hashColumns.put("attr_ctnt1", getAttrCtnt1());
		this.hashColumns.put("inv_desc", getInvDesc());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("attr_ctnt2", getAttrCtnt2());
		this.hashColumns.put("attr_ctnt3", getAttrCtnt3());
		this.hashColumns.put("attr_ctnt4", getAttrCtnt4());
		this.hashColumns.put("attr_ctnt5", getAttrCtnt5());
		this.hashColumns.put("attr_ctnt6", getAttrCtnt6());
		this.hashColumns.put("cntr_tpsz_cd", getCntrTpszCd());
		this.hashColumns.put("attr_ctnt7", getAttrCtnt7());
		this.hashColumns.put("ftu_use_ctnt2", getFtuUseCtnt2());
		this.hashColumns.put("ftu_use_ctnt1", getFtuUseCtnt1());
		this.hashColumns.put("line_tp_lu_cd", getLineTpLuCd());
		this.hashColumns.put("attr_cate_nm", getAttrCateNm());
		this.hashColumns.put("ftu_use_ctnt4", getFtuUseCtnt4());
		this.hashColumns.put("ftu_use_ctnt3", getFtuUseCtnt3());
		this.hashColumns.put("dtrb_coa_acct_cd", getDtrbCoaAcctCd());
		this.hashColumns.put("dtrb_coa_ftu_n1st_cd", getDtrbCoaFtuN1stCd());
		this.hashColumns.put("dtrb_coa_co_cd", getDtrbCoaCoCd());
		this.hashColumns.put("so_crr_cd", getSoCrrCd());
		this.hashColumns.put("dtrb_coa_ctr_cd", getDtrbCoaCtrCd());
		this.hashColumns.put("inv_tax_cd", getInvTaxCd());
		this.hashColumns.put("pln_sctr_div_cd", getPlnSctrDivCd());
		this.hashColumns.put("line_no", getLineNo());
		this.hashColumns.put("eai_evnt_dt", getEaiEvntDt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("yd_cd", getYdCd());
		this.hashColumns.put("dtrb_coa_vvd_cd", getDtrbCoaVvdCd());
		this.hashColumns.put("csr_amt", getCsrAmt());
		this.hashColumns.put("act_vvd_cd", getActVvdCd());
		this.hashColumns.put("dtrb_coa_ftu_n2nd_cd", getDtrbCoaFtuN2ndCd());
		this.hashColumns.put("dtrb_coa_rgn_cd", getDtrbCoaRgnCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("line_seq", "lineSeq");
		this.hashFields.put("attr_ctnt10", "attrCtnt10");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("ftu_use_cntr5", "ftuUseCntr5");
		this.hashFields.put("attr_ctnt14", "attrCtnt14");
		this.hashFields.put("attr_ctnt9", "attrCtnt9");
		this.hashFields.put("attr_ctnt13", "attrCtnt13");
		this.hashFields.put("attr_ctnt8", "attrCtnt8");
		this.hashFields.put("attr_ctnt12", "attrCtnt12");
		this.hashFields.put("attr_ctnt11", "attrCtnt11");
		this.hashFields.put("attr_ctnt15", "attrCtnt15");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("dtrb_coa_inter_co_cd", "dtrbCoaInterCoCd");
		this.hashFields.put("attr_ctnt1", "attrCtnt1");
		this.hashFields.put("inv_desc", "invDesc");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("attr_ctnt2", "attrCtnt2");
		this.hashFields.put("attr_ctnt3", "attrCtnt3");
		this.hashFields.put("attr_ctnt4", "attrCtnt4");
		this.hashFields.put("attr_ctnt5", "attrCtnt5");
		this.hashFields.put("attr_ctnt6", "attrCtnt6");
		this.hashFields.put("cntr_tpsz_cd", "cntrTpszCd");
		this.hashFields.put("attr_ctnt7", "attrCtnt7");
		this.hashFields.put("ftu_use_ctnt2", "ftuUseCtnt2");
		this.hashFields.put("ftu_use_ctnt1", "ftuUseCtnt1");
		this.hashFields.put("line_tp_lu_cd", "lineTpLuCd");
		this.hashFields.put("attr_cate_nm", "attrCateNm");
		this.hashFields.put("ftu_use_ctnt4", "ftuUseCtnt4");
		this.hashFields.put("ftu_use_ctnt3", "ftuUseCtnt3");
		this.hashFields.put("dtrb_coa_acct_cd", "dtrbCoaAcctCd");
		this.hashFields.put("dtrb_coa_ftu_n1st_cd", "dtrbCoaFtuN1stCd");
		this.hashFields.put("dtrb_coa_co_cd", "dtrbCoaCoCd");
		this.hashFields.put("so_crr_cd", "soCrrCd");
		this.hashFields.put("dtrb_coa_ctr_cd", "dtrbCoaCtrCd");
		this.hashFields.put("inv_tax_cd", "invTaxCd");
		this.hashFields.put("pln_sctr_div_cd", "plnSctrDivCd");
		this.hashFields.put("line_no", "lineNo");
		this.hashFields.put("eai_evnt_dt", "eaiEvntDt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("yd_cd", "ydCd");
		this.hashFields.put("dtrb_coa_vvd_cd", "dtrbCoaVvdCd");
		this.hashFields.put("csr_amt", "csrAmt");
		this.hashFields.put("act_vvd_cd", "actVvdCd");
		this.hashFields.put("dtrb_coa_ftu_n2nd_cd", "dtrbCoaFtuN2ndCd");
		this.hashFields.put("dtrb_coa_rgn_cd", "dtrbCoaRgnCd");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return lineSeq
	 */
	public String getLineSeq() {
		return this.lineSeq;
	}
	
	/**
	 * Column Info
	 * @return attrCtnt10
	 */
	public String getAttrCtnt10() {
		return this.attrCtnt10;
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
	 * @return ftuUseCntr5
	 */
	public String getFtuUseCntr5() {
		return this.ftuUseCntr5;
	}
	
	/**
	 * Column Info
	 * @return attrCtnt14
	 */
	public String getAttrCtnt14() {
		return this.attrCtnt14;
	}
	
	/**
	 * Column Info
	 * @return attrCtnt9
	 */
	public String getAttrCtnt9() {
		return this.attrCtnt9;
	}
	
	/**
	 * Column Info
	 * @return attrCtnt13
	 */
	public String getAttrCtnt13() {
		return this.attrCtnt13;
	}
	
	/**
	 * Column Info
	 * @return attrCtnt8
	 */
	public String getAttrCtnt8() {
		return this.attrCtnt8;
	}
	
	/**
	 * Column Info
	 * @return attrCtnt12
	 */
	public String getAttrCtnt12() {
		return this.attrCtnt12;
	}
	
	/**
	 * Column Info
	 * @return attrCtnt11
	 */
	public String getAttrCtnt11() {
		return this.attrCtnt11;
	}
	
	/**
	 * Column Info
	 * @return attrCtnt15
	 */
	public String getAttrCtnt15() {
		return this.attrCtnt15;
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
	 * @return dtrbCoaInterCoCd
	 */
	public String getDtrbCoaInterCoCd() {
		return this.dtrbCoaInterCoCd;
	}
	
	/**
	 * Column Info
	 * @return attrCtnt1
	 */
	public String getAttrCtnt1() {
		return this.attrCtnt1;
	}
	
	/**
	 * Column Info
	 * @return invDesc
	 */
	public String getInvDesc() {
		return this.invDesc;
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
	 * @return attrCtnt2
	 */
	public String getAttrCtnt2() {
		return this.attrCtnt2;
	}
	
	/**
	 * Column Info
	 * @return attrCtnt3
	 */
	public String getAttrCtnt3() {
		return this.attrCtnt3;
	}
	
	/**
	 * Column Info
	 * @return attrCtnt4
	 */
	public String getAttrCtnt4() {
		return this.attrCtnt4;
	}
	
	/**
	 * Column Info
	 * @return attrCtnt5
	 */
	public String getAttrCtnt5() {
		return this.attrCtnt5;
	}
	
	/**
	 * Column Info
	 * @return attrCtnt6
	 */
	public String getAttrCtnt6() {
		return this.attrCtnt6;
	}
	
	/**
	 * Column Info
	 * @return cntrTpszCd
	 */
	public String getCntrTpszCd() {
		return this.cntrTpszCd;
	}
	
	/**
	 * Column Info
	 * @return attrCtnt7
	 */
	public String getAttrCtnt7() {
		return this.attrCtnt7;
	}
	
	/**
	 * Column Info
	 * @return ftuUseCtnt2
	 */
	public String getFtuUseCtnt2() {
		return this.ftuUseCtnt2;
	}
	
	/**
	 * Column Info
	 * @return ftuUseCtnt1
	 */
	public String getFtuUseCtnt1() {
		return this.ftuUseCtnt1;
	}
	
	/**
	 * Column Info
	 * @return lineTpLuCd
	 */
	public String getLineTpLuCd() {
		return this.lineTpLuCd;
	}
	
	/**
	 * Column Info
	 * @return attrCateNm
	 */
	public String getAttrCateNm() {
		return this.attrCateNm;
	}
	
	/**
	 * Column Info
	 * @return ftuUseCtnt4
	 */
	public String getFtuUseCtnt4() {
		return this.ftuUseCtnt4;
	}
	
	/**
	 * Column Info
	 * @return ftuUseCtnt3
	 */
	public String getFtuUseCtnt3() {
		return this.ftuUseCtnt3;
	}
	
	/**
	 * Column Info
	 * @return dtrbCoaAcctCd
	 */
	public String getDtrbCoaAcctCd() {
		return this.dtrbCoaAcctCd;
	}
	
	/**
	 * Column Info
	 * @return dtrbCoaFtuN1stCd
	 */
	public String getDtrbCoaFtuN1stCd() {
		return this.dtrbCoaFtuN1stCd;
	}
	
	/**
	 * Column Info
	 * @return dtrbCoaCoCd
	 */
	public String getDtrbCoaCoCd() {
		return this.dtrbCoaCoCd;
	}
	
	/**
	 * Column Info
	 * @return soCrrCd
	 */
	public String getSoCrrCd() {
		return this.soCrrCd;
	}
	
	/**
	 * Column Info
	 * @return dtrbCoaCtrCd
	 */
	public String getDtrbCoaCtrCd() {
		return this.dtrbCoaCtrCd;
	}
	
	/**
	 * Column Info
	 * @return invTaxCd
	 */
	public String getInvTaxCd() {
		return this.invTaxCd;
	}
	
	/**
	 * Column Info
	 * @return plnSctrDivCd
	 */
	public String getPlnSctrDivCd() {
		return this.plnSctrDivCd;
	}
	
	/**
	 * Column Info
	 * @return lineNo
	 */
	public String getLineNo() {
		return this.lineNo;
	}
	
	/**
	 * Column Info
	 * @return eaiEvntDt
	 */
	public String getEaiEvntDt() {
		return this.eaiEvntDt;
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
	 * @return bkgNo
	 */
	public String getBkgNo() {
		return this.bkgNo;
	}
	
	/**
	 * Column Info
	 * @return ydCd
	 */
	public String getYdCd() {
		return this.ydCd;
	}
	
	/**
	 * Column Info
	 * @return dtrbCoaVvdCd
	 */
	public String getDtrbCoaVvdCd() {
		return this.dtrbCoaVvdCd;
	}
	
	/**
	 * Column Info
	 * @return csrAmt
	 */
	public String getCsrAmt() {
		return this.csrAmt;
	}
	
	/**
	 * Column Info
	 * @return actVvdCd
	 */
	public String getActVvdCd() {
		return this.actVvdCd;
	}
	
	/**
	 * Column Info
	 * @return dtrbCoaFtuN2ndCd
	 */
	public String getDtrbCoaFtuN2ndCd() {
		return this.dtrbCoaFtuN2ndCd;
	}
	
	/**
	 * Column Info
	 * @return dtrbCoaRgnCd
	 */
	public String getDtrbCoaRgnCd() {
		return this.dtrbCoaRgnCd;
	}
	

	/**
	 * Column Info
	 * @param lineSeq
	 */
	public void setLineSeq(String lineSeq) {
		this.lineSeq = lineSeq;
	}
	
	/**
	 * Column Info
	 * @param attrCtnt10
	 */
	public void setAttrCtnt10(String attrCtnt10) {
		this.attrCtnt10 = attrCtnt10;
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
	 * @param ftuUseCntr5
	 */
	public void setFtuUseCntr5(String ftuUseCntr5) {
		this.ftuUseCntr5 = ftuUseCntr5;
	}
	
	/**
	 * Column Info
	 * @param attrCtnt14
	 */
	public void setAttrCtnt14(String attrCtnt14) {
		this.attrCtnt14 = attrCtnt14;
	}
	
	/**
	 * Column Info
	 * @param attrCtnt9
	 */
	public void setAttrCtnt9(String attrCtnt9) {
		this.attrCtnt9 = attrCtnt9;
	}
	
	/**
	 * Column Info
	 * @param attrCtnt13
	 */
	public void setAttrCtnt13(String attrCtnt13) {
		this.attrCtnt13 = attrCtnt13;
	}
	
	/**
	 * Column Info
	 * @param attrCtnt8
	 */
	public void setAttrCtnt8(String attrCtnt8) {
		this.attrCtnt8 = attrCtnt8;
	}
	
	/**
	 * Column Info
	 * @param attrCtnt12
	 */
	public void setAttrCtnt12(String attrCtnt12) {
		this.attrCtnt12 = attrCtnt12;
	}
	
	/**
	 * Column Info
	 * @param attrCtnt11
	 */
	public void setAttrCtnt11(String attrCtnt11) {
		this.attrCtnt11 = attrCtnt11;
	}
	
	/**
	 * Column Info
	 * @param attrCtnt15
	 */
	public void setAttrCtnt15(String attrCtnt15) {
		this.attrCtnt15 = attrCtnt15;
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
	 * @param dtrbCoaInterCoCd
	 */
	public void setDtrbCoaInterCoCd(String dtrbCoaInterCoCd) {
		this.dtrbCoaInterCoCd = dtrbCoaInterCoCd;
	}
	
	/**
	 * Column Info
	 * @param attrCtnt1
	 */
	public void setAttrCtnt1(String attrCtnt1) {
		this.attrCtnt1 = attrCtnt1;
	}
	
	/**
	 * Column Info
	 * @param invDesc
	 */
	public void setInvDesc(String invDesc) {
		this.invDesc = invDesc;
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
	 * @param attrCtnt2
	 */
	public void setAttrCtnt2(String attrCtnt2) {
		this.attrCtnt2 = attrCtnt2;
	}
	
	/**
	 * Column Info
	 * @param attrCtnt3
	 */
	public void setAttrCtnt3(String attrCtnt3) {
		this.attrCtnt3 = attrCtnt3;
	}
	
	/**
	 * Column Info
	 * @param attrCtnt4
	 */
	public void setAttrCtnt4(String attrCtnt4) {
		this.attrCtnt4 = attrCtnt4;
	}
	
	/**
	 * Column Info
	 * @param attrCtnt5
	 */
	public void setAttrCtnt5(String attrCtnt5) {
		this.attrCtnt5 = attrCtnt5;
	}
	
	/**
	 * Column Info
	 * @param attrCtnt6
	 */
	public void setAttrCtnt6(String attrCtnt6) {
		this.attrCtnt6 = attrCtnt6;
	}
	
	/**
	 * Column Info
	 * @param cntrTpszCd
	 */
	public void setCntrTpszCd(String cntrTpszCd) {
		this.cntrTpszCd = cntrTpszCd;
	}
	
	/**
	 * Column Info
	 * @param attrCtnt7
	 */
	public void setAttrCtnt7(String attrCtnt7) {
		this.attrCtnt7 = attrCtnt7;
	}
	
	/**
	 * Column Info
	 * @param ftuUseCtnt2
	 */
	public void setFtuUseCtnt2(String ftuUseCtnt2) {
		this.ftuUseCtnt2 = ftuUseCtnt2;
	}
	
	/**
	 * Column Info
	 * @param ftuUseCtnt1
	 */
	public void setFtuUseCtnt1(String ftuUseCtnt1) {
		this.ftuUseCtnt1 = ftuUseCtnt1;
	}
	
	/**
	 * Column Info
	 * @param lineTpLuCd
	 */
	public void setLineTpLuCd(String lineTpLuCd) {
		this.lineTpLuCd = lineTpLuCd;
	}
	
	/**
	 * Column Info
	 * @param attrCateNm
	 */
	public void setAttrCateNm(String attrCateNm) {
		this.attrCateNm = attrCateNm;
	}
	
	/**
	 * Column Info
	 * @param ftuUseCtnt4
	 */
	public void setFtuUseCtnt4(String ftuUseCtnt4) {
		this.ftuUseCtnt4 = ftuUseCtnt4;
	}
	
	/**
	 * Column Info
	 * @param ftuUseCtnt3
	 */
	public void setFtuUseCtnt3(String ftuUseCtnt3) {
		this.ftuUseCtnt3 = ftuUseCtnt3;
	}
	
	/**
	 * Column Info
	 * @param dtrbCoaAcctCd
	 */
	public void setDtrbCoaAcctCd(String dtrbCoaAcctCd) {
		this.dtrbCoaAcctCd = dtrbCoaAcctCd;
	}
	
	/**
	 * Column Info
	 * @param dtrbCoaFtuN1stCd
	 */
	public void setDtrbCoaFtuN1stCd(String dtrbCoaFtuN1stCd) {
		this.dtrbCoaFtuN1stCd = dtrbCoaFtuN1stCd;
	}
	
	/**
	 * Column Info
	 * @param dtrbCoaCoCd
	 */
	public void setDtrbCoaCoCd(String dtrbCoaCoCd) {
		this.dtrbCoaCoCd = dtrbCoaCoCd;
	}
	
	/**
	 * Column Info
	 * @param soCrrCd
	 */
	public void setSoCrrCd(String soCrrCd) {
		this.soCrrCd = soCrrCd;
	}
	
	/**
	 * Column Info
	 * @param dtrbCoaCtrCd
	 */
	public void setDtrbCoaCtrCd(String dtrbCoaCtrCd) {
		this.dtrbCoaCtrCd = dtrbCoaCtrCd;
	}
	
	/**
	 * Column Info
	 * @param invTaxCd
	 */
	public void setInvTaxCd(String invTaxCd) {
		this.invTaxCd = invTaxCd;
	}
	
	/**
	 * Column Info
	 * @param plnSctrDivCd
	 */
	public void setPlnSctrDivCd(String plnSctrDivCd) {
		this.plnSctrDivCd = plnSctrDivCd;
	}
	
	/**
	 * Column Info
	 * @param lineNo
	 */
	public void setLineNo(String lineNo) {
		this.lineNo = lineNo;
	}
	
	/**
	 * Column Info
	 * @param eaiEvntDt
	 */
	public void setEaiEvntDt(String eaiEvntDt) {
		this.eaiEvntDt = eaiEvntDt;
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
	 * @param bkgNo
	 */
	public void setBkgNo(String bkgNo) {
		this.bkgNo = bkgNo;
	}
	
	/**
	 * Column Info
	 * @param ydCd
	 */
	public void setYdCd(String ydCd) {
		this.ydCd = ydCd;
	}
	
	/**
	 * Column Info
	 * @param dtrbCoaVvdCd
	 */
	public void setDtrbCoaVvdCd(String dtrbCoaVvdCd) {
		this.dtrbCoaVvdCd = dtrbCoaVvdCd;
	}
	
	/**
	 * Column Info
	 * @param csrAmt
	 */
	public void setCsrAmt(String csrAmt) {
		this.csrAmt = csrAmt;
	}
	
	/**
	 * Column Info
	 * @param actVvdCd
	 */
	public void setActVvdCd(String actVvdCd) {
		this.actVvdCd = actVvdCd;
	}
	
	/**
	 * Column Info
	 * @param dtrbCoaFtuN2ndCd
	 */
	public void setDtrbCoaFtuN2ndCd(String dtrbCoaFtuN2ndCd) {
		this.dtrbCoaFtuN2ndCd = dtrbCoaFtuN2ndCd;
	}
	
	/**
	 * Column Info
	 * @param dtrbCoaRgnCd
	 */
	public void setDtrbCoaRgnCd(String dtrbCoaRgnCd) {
		this.dtrbCoaRgnCd = dtrbCoaRgnCd;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setLineSeq(JSPUtil.getParameter(request, "line_seq", ""));
		setAttrCtnt10(JSPUtil.getParameter(request, "attr_ctnt10", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setFtuUseCntr5(JSPUtil.getParameter(request, "ftu_use_cntr5", ""));
		setAttrCtnt14(JSPUtil.getParameter(request, "attr_ctnt14", ""));
		setAttrCtnt9(JSPUtil.getParameter(request, "attr_ctnt9", ""));
		setAttrCtnt13(JSPUtil.getParameter(request, "attr_ctnt13", ""));
		setAttrCtnt8(JSPUtil.getParameter(request, "attr_ctnt8", ""));
		setAttrCtnt12(JSPUtil.getParameter(request, "attr_ctnt12", ""));
		setAttrCtnt11(JSPUtil.getParameter(request, "attr_ctnt11", ""));
		setAttrCtnt15(JSPUtil.getParameter(request, "attr_ctnt15", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setDtrbCoaInterCoCd(JSPUtil.getParameter(request, "dtrb_coa_inter_co_cd", ""));
		setAttrCtnt1(JSPUtil.getParameter(request, "attr_ctnt1", ""));
		setInvDesc(JSPUtil.getParameter(request, "inv_desc", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setAttrCtnt2(JSPUtil.getParameter(request, "attr_ctnt2", ""));
		setAttrCtnt3(JSPUtil.getParameter(request, "attr_ctnt3", ""));
		setAttrCtnt4(JSPUtil.getParameter(request, "attr_ctnt4", ""));
		setAttrCtnt5(JSPUtil.getParameter(request, "attr_ctnt5", ""));
		setAttrCtnt6(JSPUtil.getParameter(request, "attr_ctnt6", ""));
		setCntrTpszCd(JSPUtil.getParameter(request, "cntr_tpsz_cd", ""));
		setAttrCtnt7(JSPUtil.getParameter(request, "attr_ctnt7", ""));
		setFtuUseCtnt2(JSPUtil.getParameter(request, "ftu_use_ctnt2", ""));
		setFtuUseCtnt1(JSPUtil.getParameter(request, "ftu_use_ctnt1", ""));
		setLineTpLuCd(JSPUtil.getParameter(request, "line_tp_lu_cd", ""));
		setAttrCateNm(JSPUtil.getParameter(request, "attr_cate_nm", ""));
		setFtuUseCtnt4(JSPUtil.getParameter(request, "ftu_use_ctnt4", ""));
		setFtuUseCtnt3(JSPUtil.getParameter(request, "ftu_use_ctnt3", ""));
		setDtrbCoaAcctCd(JSPUtil.getParameter(request, "dtrb_coa_acct_cd", ""));
		setDtrbCoaFtuN1stCd(JSPUtil.getParameter(request, "dtrb_coa_ftu_n1st_cd", ""));
		setDtrbCoaCoCd(JSPUtil.getParameter(request, "dtrb_coa_co_cd", ""));
		setSoCrrCd(JSPUtil.getParameter(request, "so_crr_cd", ""));
		setDtrbCoaCtrCd(JSPUtil.getParameter(request, "dtrb_coa_ctr_cd", ""));
		setInvTaxCd(JSPUtil.getParameter(request, "inv_tax_cd", ""));
		setPlnSctrDivCd(JSPUtil.getParameter(request, "pln_sctr_div_cd", ""));
		setLineNo(JSPUtil.getParameter(request, "line_no", ""));
		setEaiEvntDt(JSPUtil.getParameter(request, "eai_evnt_dt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setYdCd(JSPUtil.getParameter(request, "yd_cd", ""));
		setDtrbCoaVvdCd(JSPUtil.getParameter(request, "dtrb_coa_vvd_cd", ""));
		setCsrAmt(JSPUtil.getParameter(request, "csr_amt", ""));
		setActVvdCd(JSPUtil.getParameter(request, "act_vvd_cd", ""));
		setDtrbCoaFtuN2ndCd(JSPUtil.getParameter(request, "dtrb_coa_ftu_n2nd_cd", ""));
		setDtrbCoaRgnCd(JSPUtil.getParameter(request, "dtrb_coa_rgn_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return ApInvDTRBOutVO[]
	 */
	public ApInvDTRBOutVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return ApInvDTRBOutVO[]
	 */
	public ApInvDTRBOutVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		ApInvDTRBOutVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] lineSeq = (JSPUtil.getParameter(request, prefix	+ "line_seq", length));
			String[] attrCtnt10 = (JSPUtil.getParameter(request, prefix	+ "attr_ctnt10", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] ftuUseCntr5 = (JSPUtil.getParameter(request, prefix	+ "ftu_use_cntr5", length));
			String[] attrCtnt14 = (JSPUtil.getParameter(request, prefix	+ "attr_ctnt14", length));
			String[] attrCtnt9 = (JSPUtil.getParameter(request, prefix	+ "attr_ctnt9", length));
			String[] attrCtnt13 = (JSPUtil.getParameter(request, prefix	+ "attr_ctnt13", length));
			String[] attrCtnt8 = (JSPUtil.getParameter(request, prefix	+ "attr_ctnt8", length));
			String[] attrCtnt12 = (JSPUtil.getParameter(request, prefix	+ "attr_ctnt12", length));
			String[] attrCtnt11 = (JSPUtil.getParameter(request, prefix	+ "attr_ctnt11", length));
			String[] attrCtnt15 = (JSPUtil.getParameter(request, prefix	+ "attr_ctnt15", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] dtrbCoaInterCoCd = (JSPUtil.getParameter(request, prefix	+ "dtrb_coa_inter_co_cd", length));
			String[] attrCtnt1 = (JSPUtil.getParameter(request, prefix	+ "attr_ctnt1", length));
			String[] invDesc = (JSPUtil.getParameter(request, prefix	+ "inv_desc", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] attrCtnt2 = (JSPUtil.getParameter(request, prefix	+ "attr_ctnt2", length));
			String[] attrCtnt3 = (JSPUtil.getParameter(request, prefix	+ "attr_ctnt3", length));
			String[] attrCtnt4 = (JSPUtil.getParameter(request, prefix	+ "attr_ctnt4", length));
			String[] attrCtnt5 = (JSPUtil.getParameter(request, prefix	+ "attr_ctnt5", length));
			String[] attrCtnt6 = (JSPUtil.getParameter(request, prefix	+ "attr_ctnt6", length));
			String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_cd", length));
			String[] attrCtnt7 = (JSPUtil.getParameter(request, prefix	+ "attr_ctnt7", length));
			String[] ftuUseCtnt2 = (JSPUtil.getParameter(request, prefix	+ "ftu_use_ctnt2", length));
			String[] ftuUseCtnt1 = (JSPUtil.getParameter(request, prefix	+ "ftu_use_ctnt1", length));
			String[] lineTpLuCd = (JSPUtil.getParameter(request, prefix	+ "line_tp_lu_cd", length));
			String[] attrCateNm = (JSPUtil.getParameter(request, prefix	+ "attr_cate_nm", length));
			String[] ftuUseCtnt4 = (JSPUtil.getParameter(request, prefix	+ "ftu_use_ctnt4", length));
			String[] ftuUseCtnt3 = (JSPUtil.getParameter(request, prefix	+ "ftu_use_ctnt3", length));
			String[] dtrbCoaAcctCd = (JSPUtil.getParameter(request, prefix	+ "dtrb_coa_acct_cd", length));
			String[] dtrbCoaFtuN1stCd = (JSPUtil.getParameter(request, prefix	+ "dtrb_coa_ftu_n1st_cd", length));
			String[] dtrbCoaCoCd = (JSPUtil.getParameter(request, prefix	+ "dtrb_coa_co_cd", length));
			String[] soCrrCd = (JSPUtil.getParameter(request, prefix	+ "so_crr_cd", length));
			String[] dtrbCoaCtrCd = (JSPUtil.getParameter(request, prefix	+ "dtrb_coa_ctr_cd", length));
			String[] invTaxCd = (JSPUtil.getParameter(request, prefix	+ "inv_tax_cd", length));
			String[] plnSctrDivCd = (JSPUtil.getParameter(request, prefix	+ "pln_sctr_div_cd", length));
			String[] lineNo = (JSPUtil.getParameter(request, prefix	+ "line_no", length));
			String[] eaiEvntDt = (JSPUtil.getParameter(request, prefix	+ "eai_evnt_dt", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] ydCd = (JSPUtil.getParameter(request, prefix	+ "yd_cd", length));
			String[] dtrbCoaVvdCd = (JSPUtil.getParameter(request, prefix	+ "dtrb_coa_vvd_cd", length));
			String[] csrAmt = (JSPUtil.getParameter(request, prefix	+ "csr_amt", length));
			String[] actVvdCd = (JSPUtil.getParameter(request, prefix	+ "act_vvd_cd", length));
			String[] dtrbCoaFtuN2ndCd = (JSPUtil.getParameter(request, prefix	+ "dtrb_coa_ftu_n2nd_cd", length));
			String[] dtrbCoaRgnCd = (JSPUtil.getParameter(request, prefix	+ "dtrb_coa_rgn_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new ApInvDTRBOutVO();
				if (lineSeq[i] != null)
					model.setLineSeq(lineSeq[i]);
				if (attrCtnt10[i] != null)
					model.setAttrCtnt10(attrCtnt10[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (ftuUseCntr5[i] != null)
					model.setFtuUseCntr5(ftuUseCntr5[i]);
				if (attrCtnt14[i] != null)
					model.setAttrCtnt14(attrCtnt14[i]);
				if (attrCtnt9[i] != null)
					model.setAttrCtnt9(attrCtnt9[i]);
				if (attrCtnt13[i] != null)
					model.setAttrCtnt13(attrCtnt13[i]);
				if (attrCtnt8[i] != null)
					model.setAttrCtnt8(attrCtnt8[i]);
				if (attrCtnt12[i] != null)
					model.setAttrCtnt12(attrCtnt12[i]);
				if (attrCtnt11[i] != null)
					model.setAttrCtnt11(attrCtnt11[i]);
				if (attrCtnt15[i] != null)
					model.setAttrCtnt15(attrCtnt15[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (dtrbCoaInterCoCd[i] != null)
					model.setDtrbCoaInterCoCd(dtrbCoaInterCoCd[i]);
				if (attrCtnt1[i] != null)
					model.setAttrCtnt1(attrCtnt1[i]);
				if (invDesc[i] != null)
					model.setInvDesc(invDesc[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (attrCtnt2[i] != null)
					model.setAttrCtnt2(attrCtnt2[i]);
				if (attrCtnt3[i] != null)
					model.setAttrCtnt3(attrCtnt3[i]);
				if (attrCtnt4[i] != null)
					model.setAttrCtnt4(attrCtnt4[i]);
				if (attrCtnt5[i] != null)
					model.setAttrCtnt5(attrCtnt5[i]);
				if (attrCtnt6[i] != null)
					model.setAttrCtnt6(attrCtnt6[i]);
				if (cntrTpszCd[i] != null)
					model.setCntrTpszCd(cntrTpszCd[i]);
				if (attrCtnt7[i] != null)
					model.setAttrCtnt7(attrCtnt7[i]);
				if (ftuUseCtnt2[i] != null)
					model.setFtuUseCtnt2(ftuUseCtnt2[i]);
				if (ftuUseCtnt1[i] != null)
					model.setFtuUseCtnt1(ftuUseCtnt1[i]);
				if (lineTpLuCd[i] != null)
					model.setLineTpLuCd(lineTpLuCd[i]);
				if (attrCateNm[i] != null)
					model.setAttrCateNm(attrCateNm[i]);
				if (ftuUseCtnt4[i] != null)
					model.setFtuUseCtnt4(ftuUseCtnt4[i]);
				if (ftuUseCtnt3[i] != null)
					model.setFtuUseCtnt3(ftuUseCtnt3[i]);
				if (dtrbCoaAcctCd[i] != null)
					model.setDtrbCoaAcctCd(dtrbCoaAcctCd[i]);
				if (dtrbCoaFtuN1stCd[i] != null)
					model.setDtrbCoaFtuN1stCd(dtrbCoaFtuN1stCd[i]);
				if (dtrbCoaCoCd[i] != null)
					model.setDtrbCoaCoCd(dtrbCoaCoCd[i]);
				if (soCrrCd[i] != null)
					model.setSoCrrCd(soCrrCd[i]);
				if (dtrbCoaCtrCd[i] != null)
					model.setDtrbCoaCtrCd(dtrbCoaCtrCd[i]);
				if (invTaxCd[i] != null)
					model.setInvTaxCd(invTaxCd[i]);
				if (plnSctrDivCd[i] != null)
					model.setPlnSctrDivCd(plnSctrDivCd[i]);
				if (lineNo[i] != null)
					model.setLineNo(lineNo[i]);
				if (eaiEvntDt[i] != null)
					model.setEaiEvntDt(eaiEvntDt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (ydCd[i] != null)
					model.setYdCd(ydCd[i]);
				if (dtrbCoaVvdCd[i] != null)
					model.setDtrbCoaVvdCd(dtrbCoaVvdCd[i]);
				if (csrAmt[i] != null)
					model.setCsrAmt(csrAmt[i]);
				if (actVvdCd[i] != null)
					model.setActVvdCd(actVvdCd[i]);
				if (dtrbCoaFtuN2ndCd[i] != null)
					model.setDtrbCoaFtuN2ndCd(dtrbCoaFtuN2ndCd[i]);
				if (dtrbCoaRgnCd[i] != null)
					model.setDtrbCoaRgnCd(dtrbCoaRgnCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getApInvDTRBOutVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return ApInvDTRBOutVO[]
	 */
	public ApInvDTRBOutVO[] getApInvDTRBOutVOs(){
		ApInvDTRBOutVO[] vos = (ApInvDTRBOutVO[])models.toArray(new ApInvDTRBOutVO[models.size()]);
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
		this.lineSeq = this.lineSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.attrCtnt10 = this.attrCtnt10 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ftuUseCntr5 = this.ftuUseCntr5 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.attrCtnt14 = this.attrCtnt14 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.attrCtnt9 = this.attrCtnt9 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.attrCtnt13 = this.attrCtnt13 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.attrCtnt8 = this.attrCtnt8 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.attrCtnt12 = this.attrCtnt12 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.attrCtnt11 = this.attrCtnt11 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.attrCtnt15 = this.attrCtnt15 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dtrbCoaInterCoCd = this.dtrbCoaInterCoCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.attrCtnt1 = this.attrCtnt1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invDesc = this.invDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.attrCtnt2 = this.attrCtnt2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.attrCtnt3 = this.attrCtnt3 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.attrCtnt4 = this.attrCtnt4 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.attrCtnt5 = this.attrCtnt5 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.attrCtnt6 = this.attrCtnt6 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszCd = this.cntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.attrCtnt7 = this.attrCtnt7 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ftuUseCtnt2 = this.ftuUseCtnt2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ftuUseCtnt1 = this.ftuUseCtnt1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lineTpLuCd = this.lineTpLuCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.attrCateNm = this.attrCateNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ftuUseCtnt4 = this.ftuUseCtnt4 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ftuUseCtnt3 = this.ftuUseCtnt3 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dtrbCoaAcctCd = this.dtrbCoaAcctCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dtrbCoaFtuN1stCd = this.dtrbCoaFtuN1stCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dtrbCoaCoCd = this.dtrbCoaCoCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.soCrrCd = this.soCrrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dtrbCoaCtrCd = this.dtrbCoaCtrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invTaxCd = this.invTaxCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.plnSctrDivCd = this.plnSctrDivCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lineNo = this.lineNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eaiEvntDt = this.eaiEvntDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydCd = this.ydCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dtrbCoaVvdCd = this.dtrbCoaVvdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.csrAmt = this.csrAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actVvdCd = this.actVvdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dtrbCoaFtuN2ndCd = this.dtrbCoaFtuN2ndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dtrbCoaRgnCd = this.dtrbCoaRgnCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
