/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : CsrParmVO.java
*@FileTitle : CsrParmVO
*Open Issues :
*Change history :
*@LastModifyDate : 2010.05.13
*@LastModifier : 함대성
*@LastVersion : 1.0
* 2010.05.13 함대성 
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

public class CsrParmVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CsrParmVO> models = new ArrayList<CsrParmVO>();
	
	/* Column Info */
	private String cntInv = null;
	/* Column Info */
	private String sEviCtnt8 = null;
	/* Column Info */
	private String sEviCtnt9 = null;
	/* Column Info */
	private String sEviTaxNo2 = null;
	/* Column Info */
	private String apopen = null;
	/* Column Info */
	private String sEviCtnt4 = null;
	/* Column Info */
	private String eviCtnt12 = null;
	/* Column Info */
	private String sEviCtnt5 = null;
	/* Column Info */
	private String sEviCtnt6 = null;
	/* Column Info */
	private String sEviCtnt7 = null;
	/* Column Info */
	private String payGroupCd = null;
	/* Column Info */
	private String sEviCtnt1 = null;
	/* Column Info */
	private String maxIssDt = null;
	/* Column Info */
	private String sEviCtnt2 = null;
	/* Column Info */
	private String sEviCtnt3 = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String sEviInvDt = null;
	/* Column Info */
	private String eviInvDt = null;
	/* Column Info */
	private String sEviinputflg = null;
	/* Column Info */
	private String asanogb = null;
	/* Column Info */
	private String rcvDt = null;
	/* Column Info */
	private String cntCd = null;
	/* Column Info */
	private String maxRcvDt = null;
	/* Column Info */
	private String usrEml = null;
	/* Column Info */
	private String invKnt = null;
	/* Column Info */
	private String eviCtnt11 = null;
	/* Column Info */
	private String taxNaidFlg = null;
	/* Column Info */
	private String eviCtnt10 = null;
	/* Column Info */
	private String csrTpCd = null;
	/* Column Info */
	private String key = null;
	/* Column Info */
	private String csrNo = null;
	/* Column Info */
	private String apOfcCd = null;
	/* Column Info */
	private String ifStatus = null;
	/* Column Info */
	private String sTaxNslFlg = null;
	/* Column Info */
	private String eviCtnt9 = null;
	/* Column Info */
	private String sTaxNaidFlg = null;
	/* Column Info */
	private String eviCtnt8 = null;
	/* Column Info */
	private String eviGb = null;
	/* Column Info */
	private String eviCtnt7 = null;
	/* Column Info */
	private String eviCtnt6 = null;
	/* Column Info */
	private String taxNslFlg = null;
	/* Column Info */
	private String eviCtnt5 = null;
	/* Column Info */
	private String eviCtnt4 = null;
	/* Column Info */
	private String eviCtnt3 = null;
	/* Column Info */
	private String eviCtnt2 = null;
	/* Column Info */
	private String faFlg = null;
	/* Column Info */
	private String eviCtnt1 = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String vndrSeq = null;
	/* Column Info */
	private String invSubSysCd = null;
	/* Column Info */
	private String sEviTotalTaxAmt = null;
	/* Column Info */
	private String payTermTpCd = null;
	/* Column Info */
	private String eviTaxNo2 = null;
	/* Column Info */
	private String aproStep = null;
	/* Column Info */
	private String currCd = null;
	/* Column Info */
	private String sFinanceFlg = null;
	/* Column Info */
	private String asaNoS = null;
	/* Column Info */
	private String psoTrnsSlpCtnt = null;
	/* Column Info */
	private String eviTotalNetAmt = null;
	/* Column Info */
	private String eviTaxNo = null;
	/* Column Info */
	private String attrCtnt8 = null;
	/* Column Info */
	private String aproseqkey = null;
	/* Column Info */
	private String eviinputflg = null;
	/* Column Info */
	private String totalAmt = null;
	/* Column Info */
	private String sEviCtnt10 = null;
	/* Column Info */
	private String issDt = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String sEviCompNo = null;
	/* Column Info */
	private String usrNm = null;
	/* Column Info */
	private String sEviCtnt12 = null;
	/* Column Info */
	private String sEviCtnt11 = null;
	/* Column Info */
	private String sEviTaxCode = null;
	/* Column Info */
	private String financeFlg = null;
	/* Column Info */
	private String invOfcCd = null;
	/* Column Info */
	private String invRgstNo = null;
	/* Column Info */
	private String costOfcCd = null;
	/* Column Info */
	private String genPayTermCd = null;
	/* Column Info */
	private String sTaxType = null;
	/* Column Info */
	private String invCfmDt = null;
	/* Column Info */
	private String genPayTermDesc = null;
	/* Column Info */
	private String tempPaymentDueDt = null;
	/* Column Info */
	private String paymentDueDt = null;
	/* Column Info */
	private String ofcCd = null;
	/* Column Info */
	private String eviTotalTaxAmt = null;
	/* Column Info */
	private String eviTaxCode = null;
	/* Column Info */
	private String ttlLssDivCd = null;
	/* Column Info */
	private String comMrdpath = null;
	/* Column Info */
	private String taxType = null;
	/* Column Info */
	private String csrAmt = null;
	/* Column Info */
	private String sFaFlg = null;
	/* Column Info */
	private String sEviTaxNo = null;
	/* Column Info */
	private String comMrdarguments = null;
	/* Column Info */
	private String sEviTotalNetAmt = null;
	/* Column Info */
	private String eviCompNo = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CsrParmVO() {}

	public CsrParmVO(String ibflag, String pagerows, String ofcCd, String invSubSysCd, String invOfcCd, String cntCd, String asanogb, String payGroupCd, String csrAmt, String issDt, String rcvDt, String genPayTermCd, String tempPaymentDueDt, String payTermTpCd, String apOfcCd, String usrEml, String usrNm, String creUsrId, String csrTpCd, String eviGb, String invKnt, String invCfmDt, String psoTrnsSlpCtnt, String taxNaidFlg, String financeFlg, String faFlg, String taxType, String taxNslFlg, String eviInvDt, String eviCompNo, String eviTotalNetAmt, String eviTaxNo2, String eviTotalTaxAmt, String eviCtnt1, String eviCtnt2, String eviCtnt3, String eviCtnt4, String eviCtnt5, String eviCtnt6, String eviCtnt7, String eviCtnt8, String eviCtnt9, String eviCtnt10, String eviCtnt11, String eviCtnt12, String eviTaxNo, String eviTaxCode, String sTaxNaidFlg, String sFinanceFlg, String sFaFlg, String sTaxType, String sTaxNslFlg, String sEviInvDt, String sEviCompNo, String sEviTotalNetAmt, String sEviTaxNo2, String sEviTotalTaxAmt, String sEviCtnt1, String sEviCtnt2, String sEviCtnt3, String sEviCtnt4, String sEviCtnt5, String sEviCtnt6, String sEviCtnt7, String sEviCtnt8, String sEviCtnt9, String sEviCtnt10, String sEviCtnt11, String sEviCtnt12, String sEviTaxNo, String sEviTaxCode, String ttlLssDivCd, String invRgstNo, String eviinputflg, String sEviinputflg, String apopen, String comMrdpath, String comMrdarguments, String asaNoS, String aproseqkey, String key, String costOfcCd, String vndrSeq, String cntInv, String currCd, String totalAmt, String maxIssDt, String maxRcvDt, String genPayTermDesc, String paymentDueDt, String aproStep, String csrNo, String ifStatus, String attrCtnt8) {
		this.cntInv = cntInv;
		this.sEviCtnt8 = sEviCtnt8;
		this.sEviCtnt9 = sEviCtnt9;
		this.sEviTaxNo2 = sEviTaxNo2;
		this.apopen = apopen;
		this.sEviCtnt4 = sEviCtnt4;
		this.eviCtnt12 = eviCtnt12;
		this.sEviCtnt5 = sEviCtnt5;
		this.sEviCtnt6 = sEviCtnt6;
		this.sEviCtnt7 = sEviCtnt7;
		this.payGroupCd = payGroupCd;
		this.sEviCtnt1 = sEviCtnt1;
		this.maxIssDt = maxIssDt;
		this.sEviCtnt2 = sEviCtnt2;
		this.sEviCtnt3 = sEviCtnt3;
		this.pagerows = pagerows;
		this.sEviInvDt = sEviInvDt;
		this.eviInvDt = eviInvDt;
		this.sEviinputflg = sEviinputflg;
		this.asanogb = asanogb;
		this.rcvDt = rcvDt;
		this.cntCd = cntCd;
		this.maxRcvDt = maxRcvDt;
		this.usrEml = usrEml;
		this.invKnt = invKnt;
		this.eviCtnt11 = eviCtnt11;
		this.taxNaidFlg = taxNaidFlg;
		this.eviCtnt10 = eviCtnt10;
		this.csrTpCd = csrTpCd;
		this.key = key;
		this.csrNo = csrNo;
		this.apOfcCd = apOfcCd;
		this.ifStatus = ifStatus;
		this.sTaxNslFlg = sTaxNslFlg;
		this.eviCtnt9 = eviCtnt9;
		this.sTaxNaidFlg = sTaxNaidFlg;
		this.eviCtnt8 = eviCtnt8;
		this.eviGb = eviGb;
		this.eviCtnt7 = eviCtnt7;
		this.eviCtnt6 = eviCtnt6;
		this.taxNslFlg = taxNslFlg;
		this.eviCtnt5 = eviCtnt5;
		this.eviCtnt4 = eviCtnt4;
		this.eviCtnt3 = eviCtnt3;
		this.eviCtnt2 = eviCtnt2;
		this.faFlg = faFlg;
		this.eviCtnt1 = eviCtnt1;
		this.creUsrId = creUsrId;
		this.vndrSeq = vndrSeq;
		this.invSubSysCd = invSubSysCd;
		this.sEviTotalTaxAmt = sEviTotalTaxAmt;
		this.payTermTpCd = payTermTpCd;
		this.eviTaxNo2 = eviTaxNo2;
		this.aproStep = aproStep;
		this.currCd = currCd;
		this.sFinanceFlg = sFinanceFlg;
		this.asaNoS = asaNoS;
		this.psoTrnsSlpCtnt = psoTrnsSlpCtnt;
		this.eviTotalNetAmt = eviTotalNetAmt;
		this.eviTaxNo = eviTaxNo;
		this.attrCtnt8 = attrCtnt8;
		this.aproseqkey = aproseqkey;
		this.eviinputflg = eviinputflg;
		this.totalAmt = totalAmt;
		this.sEviCtnt10 = sEviCtnt10;
		this.issDt = issDt;
		this.ibflag = ibflag;
		this.sEviCompNo = sEviCompNo;
		this.usrNm = usrNm;
		this.sEviCtnt12 = sEviCtnt12;
		this.sEviCtnt11 = sEviCtnt11;
		this.sEviTaxCode = sEviTaxCode;
		this.financeFlg = financeFlg;
		this.invOfcCd = invOfcCd;
		this.invRgstNo = invRgstNo;
		this.costOfcCd = costOfcCd;
		this.genPayTermCd = genPayTermCd;
		this.sTaxType = sTaxType;
		this.invCfmDt = invCfmDt;
		this.genPayTermDesc = genPayTermDesc;
		this.tempPaymentDueDt = tempPaymentDueDt;
		this.paymentDueDt = paymentDueDt;
		this.ofcCd = ofcCd;
		this.eviTotalTaxAmt = eviTotalTaxAmt;
		this.eviTaxCode = eviTaxCode;
		this.ttlLssDivCd = ttlLssDivCd;
		this.comMrdpath = comMrdpath;
		this.taxType = taxType;
		this.csrAmt = csrAmt;
		this.sFaFlg = sFaFlg;
		this.sEviTaxNo = sEviTaxNo;
		this.comMrdarguments = comMrdarguments;
		this.sEviTotalNetAmt = sEviTotalNetAmt;
		this.eviCompNo = eviCompNo;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("cnt_inv", getCntInv());
		this.hashColumns.put("s_evi_ctnt8", getSEviCtnt8());
		this.hashColumns.put("s_evi_ctnt9", getSEviCtnt9());
		this.hashColumns.put("s_evi_tax_no2", getSEviTaxNo2());
		this.hashColumns.put("apopen", getApopen());
		this.hashColumns.put("s_evi_ctnt4", getSEviCtnt4());
		this.hashColumns.put("evi_ctnt12", getEviCtnt12());
		this.hashColumns.put("s_evi_ctnt5", getSEviCtnt5());
		this.hashColumns.put("s_evi_ctnt6", getSEviCtnt6());
		this.hashColumns.put("s_evi_ctnt7", getSEviCtnt7());
		this.hashColumns.put("pay_group_cd", getPayGroupCd());
		this.hashColumns.put("s_evi_ctnt1", getSEviCtnt1());
		this.hashColumns.put("max_iss_dt", getMaxIssDt());
		this.hashColumns.put("s_evi_ctnt2", getSEviCtnt2());
		this.hashColumns.put("s_evi_ctnt3", getSEviCtnt3());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("s_evi_inv_dt", getSEviInvDt());
		this.hashColumns.put("evi_inv_dt", getEviInvDt());
		this.hashColumns.put("s_eviinputflg", getSEviinputflg());
		this.hashColumns.put("asanogb", getAsanogb());
		this.hashColumns.put("rcv_dt", getRcvDt());
		this.hashColumns.put("cnt_cd", getCntCd());
		this.hashColumns.put("max_rcv_dt", getMaxRcvDt());
		this.hashColumns.put("usr_eml", getUsrEml());
		this.hashColumns.put("inv_knt", getInvKnt());
		this.hashColumns.put("evi_ctnt11", getEviCtnt11());
		this.hashColumns.put("tax_naid_flg", getTaxNaidFlg());
		this.hashColumns.put("evi_ctnt10", getEviCtnt10());
		this.hashColumns.put("csr_tp_cd", getCsrTpCd());
		this.hashColumns.put("key", getKey());
		this.hashColumns.put("csr_no", getCsrNo());
		this.hashColumns.put("ap_ofc_cd", getApOfcCd());
		this.hashColumns.put("if_status", getIfStatus());
		this.hashColumns.put("s_tax_nsl_flg", getSTaxNslFlg());
		this.hashColumns.put("evi_ctnt9", getEviCtnt9());
		this.hashColumns.put("s_tax_naid_flg", getSTaxNaidFlg());
		this.hashColumns.put("evi_ctnt8", getEviCtnt8());
		this.hashColumns.put("evi_gb", getEviGb());
		this.hashColumns.put("evi_ctnt7", getEviCtnt7());
		this.hashColumns.put("evi_ctnt6", getEviCtnt6());
		this.hashColumns.put("tax_nsl_flg", getTaxNslFlg());
		this.hashColumns.put("evi_ctnt5", getEviCtnt5());
		this.hashColumns.put("evi_ctnt4", getEviCtnt4());
		this.hashColumns.put("evi_ctnt3", getEviCtnt3());
		this.hashColumns.put("evi_ctnt2", getEviCtnt2());
		this.hashColumns.put("fa_flg", getFaFlg());
		this.hashColumns.put("evi_ctnt1", getEviCtnt1());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("vndr_seq", getVndrSeq());
		this.hashColumns.put("inv_sub_sys_cd", getInvSubSysCd());
		this.hashColumns.put("s_evi_total_tax_amt", getSEviTotalTaxAmt());
		this.hashColumns.put("pay_term_tp_cd", getPayTermTpCd());
		this.hashColumns.put("evi_tax_no2", getEviTaxNo2());
		this.hashColumns.put("apro_step", getAproStep());
		this.hashColumns.put("curr_cd", getCurrCd());
		this.hashColumns.put("s_finance_flg", getSFinanceFlg());
		this.hashColumns.put("asa_no_s", getAsaNoS());
		this.hashColumns.put("pso_trns_slp_ctnt", getPsoTrnsSlpCtnt());
		this.hashColumns.put("evi_total_net_amt", getEviTotalNetAmt());
		this.hashColumns.put("evi_tax_no", getEviTaxNo());
		this.hashColumns.put("attr_ctnt8", getAttrCtnt8());
		this.hashColumns.put("aproseqkey", getAproseqkey());
		this.hashColumns.put("eviinputflg", getEviinputflg());
		this.hashColumns.put("total_amt", getTotalAmt());
		this.hashColumns.put("s_evi_ctnt10", getSEviCtnt10());
		this.hashColumns.put("iss_dt", getIssDt());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("s_evi_comp_no", getSEviCompNo());
		this.hashColumns.put("usr_nm", getUsrNm());
		this.hashColumns.put("s_evi_ctnt12", getSEviCtnt12());
		this.hashColumns.put("s_evi_ctnt11", getSEviCtnt11());
		this.hashColumns.put("s_evi_tax_code", getSEviTaxCode());
		this.hashColumns.put("finance_flg", getFinanceFlg());
		this.hashColumns.put("inv_ofc_cd", getInvOfcCd());
		this.hashColumns.put("inv_rgst_no", getInvRgstNo());
		this.hashColumns.put("cost_ofc_cd", getCostOfcCd());
		this.hashColumns.put("gen_pay_term_cd", getGenPayTermCd());
		this.hashColumns.put("s_tax_type", getSTaxType());
		this.hashColumns.put("inv_cfm_dt", getInvCfmDt());
		this.hashColumns.put("gen_pay_term_desc", getGenPayTermDesc());
		this.hashColumns.put("temp_payment_due_dt", getTempPaymentDueDt());
		this.hashColumns.put("payment_due_dt", getPaymentDueDt());
		this.hashColumns.put("ofc_cd", getOfcCd());
		this.hashColumns.put("evi_total_tax_amt", getEviTotalTaxAmt());
		this.hashColumns.put("evi_tax_code", getEviTaxCode());
		this.hashColumns.put("ttl_lss_div_cd", getTtlLssDivCd());
		this.hashColumns.put("com_mrdpath", getComMrdpath());
		this.hashColumns.put("tax_type", getTaxType());
		this.hashColumns.put("csr_amt", getCsrAmt());
		this.hashColumns.put("s_fa_flg", getSFaFlg());
		this.hashColumns.put("s_evi_tax_no", getSEviTaxNo());
		this.hashColumns.put("com_mrdarguments", getComMrdarguments());
		this.hashColumns.put("s_evi_total_net_amt", getSEviTotalNetAmt());
		this.hashColumns.put("evi_comp_no", getEviCompNo());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("cnt_inv", "cntInv");
		this.hashFields.put("s_evi_ctnt8", "sEviCtnt8");
		this.hashFields.put("s_evi_ctnt9", "sEviCtnt9");
		this.hashFields.put("s_evi_tax_no2", "sEviTaxNo2");
		this.hashFields.put("apopen", "apopen");
		this.hashFields.put("s_evi_ctnt4", "sEviCtnt4");
		this.hashFields.put("evi_ctnt12", "eviCtnt12");
		this.hashFields.put("s_evi_ctnt5", "sEviCtnt5");
		this.hashFields.put("s_evi_ctnt6", "sEviCtnt6");
		this.hashFields.put("s_evi_ctnt7", "sEviCtnt7");
		this.hashFields.put("pay_group_cd", "payGroupCd");
		this.hashFields.put("s_evi_ctnt1", "sEviCtnt1");
		this.hashFields.put("max_iss_dt", "maxIssDt");
		this.hashFields.put("s_evi_ctnt2", "sEviCtnt2");
		this.hashFields.put("s_evi_ctnt3", "sEviCtnt3");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("s_evi_inv_dt", "sEviInvDt");
		this.hashFields.put("evi_inv_dt", "eviInvDt");
		this.hashFields.put("s_eviinputflg", "sEviinputflg");
		this.hashFields.put("asanogb", "asanogb");
		this.hashFields.put("rcv_dt", "rcvDt");
		this.hashFields.put("cnt_cd", "cntCd");
		this.hashFields.put("max_rcv_dt", "maxRcvDt");
		this.hashFields.put("usr_eml", "usrEml");
		this.hashFields.put("inv_knt", "invKnt");
		this.hashFields.put("evi_ctnt11", "eviCtnt11");
		this.hashFields.put("tax_naid_flg", "taxNaidFlg");
		this.hashFields.put("evi_ctnt10", "eviCtnt10");
		this.hashFields.put("csr_tp_cd", "csrTpCd");
		this.hashFields.put("key", "key");
		this.hashFields.put("csr_no", "csrNo");
		this.hashFields.put("ap_ofc_cd", "apOfcCd");
		this.hashFields.put("if_status", "ifStatus");
		this.hashFields.put("s_tax_nsl_flg", "sTaxNslFlg");
		this.hashFields.put("evi_ctnt9", "eviCtnt9");
		this.hashFields.put("s_tax_naid_flg", "sTaxNaidFlg");
		this.hashFields.put("evi_ctnt8", "eviCtnt8");
		this.hashFields.put("evi_gb", "eviGb");
		this.hashFields.put("evi_ctnt7", "eviCtnt7");
		this.hashFields.put("evi_ctnt6", "eviCtnt6");
		this.hashFields.put("tax_nsl_flg", "taxNslFlg");
		this.hashFields.put("evi_ctnt5", "eviCtnt5");
		this.hashFields.put("evi_ctnt4", "eviCtnt4");
		this.hashFields.put("evi_ctnt3", "eviCtnt3");
		this.hashFields.put("evi_ctnt2", "eviCtnt2");
		this.hashFields.put("fa_flg", "faFlg");
		this.hashFields.put("evi_ctnt1", "eviCtnt1");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("vndr_seq", "vndrSeq");
		this.hashFields.put("inv_sub_sys_cd", "invSubSysCd");
		this.hashFields.put("s_evi_total_tax_amt", "sEviTotalTaxAmt");
		this.hashFields.put("pay_term_tp_cd", "payTermTpCd");
		this.hashFields.put("evi_tax_no2", "eviTaxNo2");
		this.hashFields.put("apro_step", "aproStep");
		this.hashFields.put("curr_cd", "currCd");
		this.hashFields.put("s_finance_flg", "sFinanceFlg");
		this.hashFields.put("asa_no_s", "asaNoS");
		this.hashFields.put("pso_trns_slp_ctnt", "psoTrnsSlpCtnt");
		this.hashFields.put("evi_total_net_amt", "eviTotalNetAmt");
		this.hashFields.put("evi_tax_no", "eviTaxNo");
		this.hashFields.put("attr_ctnt8", "attrCtnt8");
		this.hashFields.put("aproseqkey", "aproseqkey");
		this.hashFields.put("eviinputflg", "eviinputflg");
		this.hashFields.put("total_amt", "totalAmt");
		this.hashFields.put("s_evi_ctnt10", "sEviCtnt10");
		this.hashFields.put("iss_dt", "issDt");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("s_evi_comp_no", "sEviCompNo");
		this.hashFields.put("usr_nm", "usrNm");
		this.hashFields.put("s_evi_ctnt12", "sEviCtnt12");
		this.hashFields.put("s_evi_ctnt11", "sEviCtnt11");
		this.hashFields.put("s_evi_tax_code", "sEviTaxCode");
		this.hashFields.put("finance_flg", "financeFlg");
		this.hashFields.put("inv_ofc_cd", "invOfcCd");
		this.hashFields.put("inv_rgst_no", "invRgstNo");
		this.hashFields.put("cost_ofc_cd", "costOfcCd");
		this.hashFields.put("gen_pay_term_cd", "genPayTermCd");
		this.hashFields.put("s_tax_type", "sTaxType");
		this.hashFields.put("inv_cfm_dt", "invCfmDt");
		this.hashFields.put("gen_pay_term_desc", "genPayTermDesc");
		this.hashFields.put("temp_payment_due_dt", "tempPaymentDueDt");
		this.hashFields.put("payment_due_dt", "paymentDueDt");
		this.hashFields.put("ofc_cd", "ofcCd");
		this.hashFields.put("evi_total_tax_amt", "eviTotalTaxAmt");
		this.hashFields.put("evi_tax_code", "eviTaxCode");
		this.hashFields.put("ttl_lss_div_cd", "ttlLssDivCd");
		this.hashFields.put("com_mrdpath", "comMrdpath");
		this.hashFields.put("tax_type", "taxType");
		this.hashFields.put("csr_amt", "csrAmt");
		this.hashFields.put("s_fa_flg", "sFaFlg");
		this.hashFields.put("s_evi_tax_no", "sEviTaxNo");
		this.hashFields.put("com_mrdarguments", "comMrdarguments");
		this.hashFields.put("s_evi_total_net_amt", "sEviTotalNetAmt");
		this.hashFields.put("evi_comp_no", "eviCompNo");
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
	 * @return sEviCtnt8
	 */
	public String getSEviCtnt8() {
		return this.sEviCtnt8;
	}
	
	/**
	 * Column Info
	 * @return sEviCtnt9
	 */
	public String getSEviCtnt9() {
		return this.sEviCtnt9;
	}
	
	/**
	 * Column Info
	 * @return sEviTaxNo2
	 */
	public String getSEviTaxNo2() {
		return this.sEviTaxNo2;
	}
	
	/**
	 * Column Info
	 * @return apopen
	 */
	public String getApopen() {
		return this.apopen;
	}
	
	/**
	 * Column Info
	 * @return sEviCtnt4
	 */
	public String getSEviCtnt4() {
		return this.sEviCtnt4;
	}
	
	/**
	 * Column Info
	 * @return eviCtnt12
	 */
	public String getEviCtnt12() {
		return this.eviCtnt12;
	}
	
	/**
	 * Column Info
	 * @return sEviCtnt5
	 */
	public String getSEviCtnt5() {
		return this.sEviCtnt5;
	}
	
	/**
	 * Column Info
	 * @return sEviCtnt6
	 */
	public String getSEviCtnt6() {
		return this.sEviCtnt6;
	}
	
	/**
	 * Column Info
	 * @return sEviCtnt7
	 */
	public String getSEviCtnt7() {
		return this.sEviCtnt7;
	}
	
	/**
	 * Column Info
	 * @return payGroupCd
	 */
	public String getPayGroupCd() {
		return this.payGroupCd;
	}
	
	/**
	 * Column Info
	 * @return sEviCtnt1
	 */
	public String getSEviCtnt1() {
		return this.sEviCtnt1;
	}
	
	/**
	 * Column Info
	 * @return maxIssDt
	 */
	public String getMaxIssDt() {
		return this.maxIssDt;
	}
	
	/**
	 * Column Info
	 * @return sEviCtnt2
	 */
	public String getSEviCtnt2() {
		return this.sEviCtnt2;
	}
	
	/**
	 * Column Info
	 * @return sEviCtnt3
	 */
	public String getSEviCtnt3() {
		return this.sEviCtnt3;
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
	 * @return sEviInvDt
	 */
	public String getSEviInvDt() {
		return this.sEviInvDt;
	}
	
	/**
	 * Column Info
	 * @return eviInvDt
	 */
	public String getEviInvDt() {
		return this.eviInvDt;
	}
	
	/**
	 * Column Info
	 * @return sEviinputflg
	 */
	public String getSEviinputflg() {
		return this.sEviinputflg;
	}
	
	/**
	 * Column Info
	 * @return asanogb
	 */
	public String getAsanogb() {
		return this.asanogb;
	}
	
	/**
	 * Column Info
	 * @return rcvDt
	 */
	public String getRcvDt() {
		return this.rcvDt;
	}
	
	/**
	 * Column Info
	 * @return cntCd
	 */
	public String getCntCd() {
		return this.cntCd;
	}
	
	/**
	 * Column Info
	 * @return maxRcvDt
	 */
	public String getMaxRcvDt() {
		return this.maxRcvDt;
	}
	
	/**
	 * Column Info
	 * @return usrEml
	 */
	public String getUsrEml() {
		return this.usrEml;
	}
	
	/**
	 * Column Info
	 * @return invKnt
	 */
	public String getInvKnt() {
		return this.invKnt;
	}
	
	/**
	 * Column Info
	 * @return eviCtnt11
	 */
	public String getEviCtnt11() {
		return this.eviCtnt11;
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
	 * @return eviCtnt10
	 */
	public String getEviCtnt10() {
		return this.eviCtnt10;
	}
	
	/**
	 * Column Info
	 * @return csrTpCd
	 */
	public String getCsrTpCd() {
		return this.csrTpCd;
	}
	
	/**
	 * Column Info
	 * @return key
	 */
	public String getKey() {
		return this.key;
	}
	
	/**
	 * Column Info
	 * @return csrNo
	 */
	public String getCsrNo() {
		return this.csrNo;
	}
	
	/**
	 * Column Info
	 * @return apOfcCd
	 */
	public String getApOfcCd() {
		return this.apOfcCd;
	}
	
	/**
	 * Column Info
	 * @return ifStatus
	 */
	public String getIfStatus() {
		return this.ifStatus;
	}
	
	/**
	 * Column Info
	 * @return sTaxNslFlg
	 */
	public String getSTaxNslFlg() {
		return this.sTaxNslFlg;
	}
	
	/**
	 * Column Info
	 * @return eviCtnt9
	 */
	public String getEviCtnt9() {
		return this.eviCtnt9;
	}
	
	/**
	 * Column Info
	 * @return sTaxNaidFlg
	 */
	public String getSTaxNaidFlg() {
		return this.sTaxNaidFlg;
	}
	
	/**
	 * Column Info
	 * @return eviCtnt8
	 */
	public String getEviCtnt8() {
		return this.eviCtnt8;
	}
	
	/**
	 * Column Info
	 * @return eviGb
	 */
	public String getEviGb() {
		return this.eviGb;
	}
	
	/**
	 * Column Info
	 * @return eviCtnt7
	 */
	public String getEviCtnt7() {
		return this.eviCtnt7;
	}
	
	/**
	 * Column Info
	 * @return eviCtnt6
	 */
	public String getEviCtnt6() {
		return this.eviCtnt6;
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
	 * @return eviCtnt5
	 */
	public String getEviCtnt5() {
		return this.eviCtnt5;
	}
	
	/**
	 * Column Info
	 * @return eviCtnt4
	 */
	public String getEviCtnt4() {
		return this.eviCtnt4;
	}
	
	/**
	 * Column Info
	 * @return eviCtnt3
	 */
	public String getEviCtnt3() {
		return this.eviCtnt3;
	}
	
	/**
	 * Column Info
	 * @return eviCtnt2
	 */
	public String getEviCtnt2() {
		return this.eviCtnt2;
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
	 * @return eviCtnt1
	 */
	public String getEviCtnt1() {
		return this.eviCtnt1;
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
	 * @return sEviTotalTaxAmt
	 */
	public String getSEviTotalTaxAmt() {
		return this.sEviTotalTaxAmt;
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
	 * @return eviTaxNo2
	 */
	public String getEviTaxNo2() {
		return this.eviTaxNo2;
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
	 * @return currCd
	 */
	public String getCurrCd() {
		return this.currCd;
	}
	
	/**
	 * Column Info
	 * @return sFinanceFlg
	 */
	public String getSFinanceFlg() {
		return this.sFinanceFlg;
	}
	
	/**
	 * Column Info
	 * @return asaNoS
	 */
	public String getAsaNoS() {
		return this.asaNoS;
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
	 * @return eviTotalNetAmt
	 */
	public String getEviTotalNetAmt() {
		return this.eviTotalNetAmt;
	}
	
	/**
	 * Column Info
	 * @return eviTaxNo
	 */
	public String getEviTaxNo() {
		return this.eviTaxNo;
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
	 * @return aproseqkey
	 */
	public String getAproseqkey() {
		return this.aproseqkey;
	}
	
	/**
	 * Column Info
	 * @return eviinputflg
	 */
	public String getEviinputflg() {
		return this.eviinputflg;
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
	 * @return sEviCtnt10
	 */
	public String getSEviCtnt10() {
		return this.sEviCtnt10;
	}
	
	/**
	 * Column Info
	 * @return issDt
	 */
	public String getIssDt() {
		return this.issDt;
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
	 * @return sEviCompNo
	 */
	public String getSEviCompNo() {
		return this.sEviCompNo;
	}
	
	/**
	 * Column Info
	 * @return usrNm
	 */
	public String getUsrNm() {
		return this.usrNm;
	}
	
	/**
	 * Column Info
	 * @return sEviCtnt12
	 */
	public String getSEviCtnt12() {
		return this.sEviCtnt12;
	}
	
	/**
	 * Column Info
	 * @return sEviCtnt11
	 */
	public String getSEviCtnt11() {
		return this.sEviCtnt11;
	}
	
	/**
	 * Column Info
	 * @return sEviTaxCode
	 */
	public String getSEviTaxCode() {
		return this.sEviTaxCode;
	}
	
	/**
	 * Column Info
	 * @return financeFlg
	 */
	public String getFinanceFlg() {
		return this.financeFlg;
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
	 * @return invRgstNo
	 */
	public String getInvRgstNo() {
		return this.invRgstNo;
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
	 * @return genPayTermCd
	 */
	public String getGenPayTermCd() {
		return this.genPayTermCd;
	}
	
	/**
	 * Column Info
	 * @return sTaxType
	 */
	public String getSTaxType() {
		return this.sTaxType;
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
	 * @return tempPaymentDueDt
	 */
	public String getTempPaymentDueDt() {
		return this.tempPaymentDueDt;
	}
	
	/**
	 * Column Info
	 * @return paymentDueDt
	 */
	public String getPaymentDueDt() {
		return this.paymentDueDt;
	}
	
	/**
	 * Column Info
	 * @return ofcCd
	 */
	public String getOfcCd() {
		return this.ofcCd;
	}
	
	/**
	 * Column Info
	 * @return eviTotalTaxAmt
	 */
	public String getEviTotalTaxAmt() {
		return this.eviTotalTaxAmt;
	}
	
	/**
	 * Column Info
	 * @return eviTaxCode
	 */
	public String getEviTaxCode() {
		return this.eviTaxCode;
	}
	
	/**
	 * Column Info
	 * @return ttlLssDivCd
	 */
	public String getTtlLssDivCd() {
		return this.ttlLssDivCd;
	}
	
	/**
	 * Column Info
	 * @return comMrdpath
	 */
	public String getComMrdpath() {
		return this.comMrdpath;
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
	 * @return csrAmt
	 */
	public String getCsrAmt() {
		return this.csrAmt;
	}
	
	/**
	 * Column Info
	 * @return sFaFlg
	 */
	public String getSFaFlg() {
		return this.sFaFlg;
	}
	
	/**
	 * Column Info
	 * @return sEviTaxNo
	 */
	public String getSEviTaxNo() {
		return this.sEviTaxNo;
	}
	
	/**
	 * Column Info
	 * @return comMrdarguments
	 */
	public String getComMrdarguments() {
		return this.comMrdarguments;
	}
	
	/**
	 * Column Info
	 * @return sEviTotalNetAmt
	 */
	public String getSEviTotalNetAmt() {
		return this.sEviTotalNetAmt;
	}
	
	/**
	 * Column Info
	 * @return eviCompNo
	 */
	public String getEviCompNo() {
		return this.eviCompNo;
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
	 * @param sEviCtnt8
	 */
	public void setSEviCtnt8(String sEviCtnt8) {
		this.sEviCtnt8 = sEviCtnt8;
	}
	
	/**
	 * Column Info
	 * @param sEviCtnt9
	 */
	public void setSEviCtnt9(String sEviCtnt9) {
		this.sEviCtnt9 = sEviCtnt9;
	}
	
	/**
	 * Column Info
	 * @param sEviTaxNo2
	 */
	public void setSEviTaxNo2(String sEviTaxNo2) {
		this.sEviTaxNo2 = sEviTaxNo2;
	}
	
	/**
	 * Column Info
	 * @param apopen
	 */
	public void setApopen(String apopen) {
		this.apopen = apopen;
	}
	
	/**
	 * Column Info
	 * @param sEviCtnt4
	 */
	public void setSEviCtnt4(String sEviCtnt4) {
		this.sEviCtnt4 = sEviCtnt4;
	}
	
	/**
	 * Column Info
	 * @param eviCtnt12
	 */
	public void setEviCtnt12(String eviCtnt12) {
		this.eviCtnt12 = eviCtnt12;
	}
	
	/**
	 * Column Info
	 * @param sEviCtnt5
	 */
	public void setSEviCtnt5(String sEviCtnt5) {
		this.sEviCtnt5 = sEviCtnt5;
	}
	
	/**
	 * Column Info
	 * @param sEviCtnt6
	 */
	public void setSEviCtnt6(String sEviCtnt6) {
		this.sEviCtnt6 = sEviCtnt6;
	}
	
	/**
	 * Column Info
	 * @param sEviCtnt7
	 */
	public void setSEviCtnt7(String sEviCtnt7) {
		this.sEviCtnt7 = sEviCtnt7;
	}
	
	/**
	 * Column Info
	 * @param payGroupCd
	 */
	public void setPayGroupCd(String payGroupCd) {
		this.payGroupCd = payGroupCd;
	}
	
	/**
	 * Column Info
	 * @param sEviCtnt1
	 */
	public void setSEviCtnt1(String sEviCtnt1) {
		this.sEviCtnt1 = sEviCtnt1;
	}
	
	/**
	 * Column Info
	 * @param maxIssDt
	 */
	public void setMaxIssDt(String maxIssDt) {
		this.maxIssDt = maxIssDt;
	}
	
	/**
	 * Column Info
	 * @param sEviCtnt2
	 */
	public void setSEviCtnt2(String sEviCtnt2) {
		this.sEviCtnt2 = sEviCtnt2;
	}
	
	/**
	 * Column Info
	 * @param sEviCtnt3
	 */
	public void setSEviCtnt3(String sEviCtnt3) {
		this.sEviCtnt3 = sEviCtnt3;
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
	 * @param sEviInvDt
	 */
	public void setSEviInvDt(String sEviInvDt) {
		this.sEviInvDt = sEviInvDt;
	}
	
	/**
	 * Column Info
	 * @param eviInvDt
	 */
	public void setEviInvDt(String eviInvDt) {
		this.eviInvDt = eviInvDt;
	}
	
	/**
	 * Column Info
	 * @param sEviinputflg
	 */
	public void setSEviinputflg(String sEviinputflg) {
		this.sEviinputflg = sEviinputflg;
	}
	
	/**
	 * Column Info
	 * @param asanogb
	 */
	public void setAsanogb(String asanogb) {
		this.asanogb = asanogb;
	}
	
	/**
	 * Column Info
	 * @param rcvDt
	 */
	public void setRcvDt(String rcvDt) {
		this.rcvDt = rcvDt;
	}
	
	/**
	 * Column Info
	 * @param cntCd
	 */
	public void setCntCd(String cntCd) {
		this.cntCd = cntCd;
	}
	
	/**
	 * Column Info
	 * @param maxRcvDt
	 */
	public void setMaxRcvDt(String maxRcvDt) {
		this.maxRcvDt = maxRcvDt;
	}
	
	/**
	 * Column Info
	 * @param usrEml
	 */
	public void setUsrEml(String usrEml) {
		this.usrEml = usrEml;
	}
	
	/**
	 * Column Info
	 * @param invKnt
	 */
	public void setInvKnt(String invKnt) {
		this.invKnt = invKnt;
	}
	
	/**
	 * Column Info
	 * @param eviCtnt11
	 */
	public void setEviCtnt11(String eviCtnt11) {
		this.eviCtnt11 = eviCtnt11;
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
	 * @param eviCtnt10
	 */
	public void setEviCtnt10(String eviCtnt10) {
		this.eviCtnt10 = eviCtnt10;
	}
	
	/**
	 * Column Info
	 * @param csrTpCd
	 */
	public void setCsrTpCd(String csrTpCd) {
		this.csrTpCd = csrTpCd;
	}
	
	/**
	 * Column Info
	 * @param key
	 */
	public void setKey(String key) {
		this.key = key;
	}
	
	/**
	 * Column Info
	 * @param csrNo
	 */
	public void setCsrNo(String csrNo) {
		this.csrNo = csrNo;
	}
	
	/**
	 * Column Info
	 * @param apOfcCd
	 */
	public void setApOfcCd(String apOfcCd) {
		this.apOfcCd = apOfcCd;
	}
	
	/**
	 * Column Info
	 * @param ifStatus
	 */
	public void setIfStatus(String ifStatus) {
		this.ifStatus = ifStatus;
	}
	
	/**
	 * Column Info
	 * @param sTaxNslFlg
	 */
	public void setSTaxNslFlg(String sTaxNslFlg) {
		this.sTaxNslFlg = sTaxNslFlg;
	}
	
	/**
	 * Column Info
	 * @param eviCtnt9
	 */
	public void setEviCtnt9(String eviCtnt9) {
		this.eviCtnt9 = eviCtnt9;
	}
	
	/**
	 * Column Info
	 * @param sTaxNaidFlg
	 */
	public void setSTaxNaidFlg(String sTaxNaidFlg) {
		this.sTaxNaidFlg = sTaxNaidFlg;
	}
	
	/**
	 * Column Info
	 * @param eviCtnt8
	 */
	public void setEviCtnt8(String eviCtnt8) {
		this.eviCtnt8 = eviCtnt8;
	}
	
	/**
	 * Column Info
	 * @param eviGb
	 */
	public void setEviGb(String eviGb) {
		this.eviGb = eviGb;
	}
	
	/**
	 * Column Info
	 * @param eviCtnt7
	 */
	public void setEviCtnt7(String eviCtnt7) {
		this.eviCtnt7 = eviCtnt7;
	}
	
	/**
	 * Column Info
	 * @param eviCtnt6
	 */
	public void setEviCtnt6(String eviCtnt6) {
		this.eviCtnt6 = eviCtnt6;
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
	 * @param eviCtnt5
	 */
	public void setEviCtnt5(String eviCtnt5) {
		this.eviCtnt5 = eviCtnt5;
	}
	
	/**
	 * Column Info
	 * @param eviCtnt4
	 */
	public void setEviCtnt4(String eviCtnt4) {
		this.eviCtnt4 = eviCtnt4;
	}
	
	/**
	 * Column Info
	 * @param eviCtnt3
	 */
	public void setEviCtnt3(String eviCtnt3) {
		this.eviCtnt3 = eviCtnt3;
	}
	
	/**
	 * Column Info
	 * @param eviCtnt2
	 */
	public void setEviCtnt2(String eviCtnt2) {
		this.eviCtnt2 = eviCtnt2;
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
	 * @param eviCtnt1
	 */
	public void setEviCtnt1(String eviCtnt1) {
		this.eviCtnt1 = eviCtnt1;
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
	 * @param sEviTotalTaxAmt
	 */
	public void setSEviTotalTaxAmt(String sEviTotalTaxAmt) {
		this.sEviTotalTaxAmt = sEviTotalTaxAmt;
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
	 * @param eviTaxNo2
	 */
	public void setEviTaxNo2(String eviTaxNo2) {
		this.eviTaxNo2 = eviTaxNo2;
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
	 * @param currCd
	 */
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	
	/**
	 * Column Info
	 * @param sFinanceFlg
	 */
	public void setSFinanceFlg(String sFinanceFlg) {
		this.sFinanceFlg = sFinanceFlg;
	}
	
	/**
	 * Column Info
	 * @param asaNoS
	 */
	public void setAsaNoS(String asaNoS) {
		this.asaNoS = asaNoS;
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
	 * @param eviTotalNetAmt
	 */
	public void setEviTotalNetAmt(String eviTotalNetAmt) {
		this.eviTotalNetAmt = eviTotalNetAmt;
	}
	
	/**
	 * Column Info
	 * @param eviTaxNo
	 */
	public void setEviTaxNo(String eviTaxNo) {
		this.eviTaxNo = eviTaxNo;
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
	 * @param aproseqkey
	 */
	public void setAproseqkey(String aproseqkey) {
		this.aproseqkey = aproseqkey;
	}
	
	/**
	 * Column Info
	 * @param eviinputflg
	 */
	public void setEviinputflg(String eviinputflg) {
		this.eviinputflg = eviinputflg;
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
	 * @param sEviCtnt10
	 */
	public void setSEviCtnt10(String sEviCtnt10) {
		this.sEviCtnt10 = sEviCtnt10;
	}
	
	/**
	 * Column Info
	 * @param issDt
	 */
	public void setIssDt(String issDt) {
		this.issDt = issDt;
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
	 * @param sEviCompNo
	 */
	public void setSEviCompNo(String sEviCompNo) {
		this.sEviCompNo = sEviCompNo;
	}
	
	/**
	 * Column Info
	 * @param usrNm
	 */
	public void setUsrNm(String usrNm) {
		this.usrNm = usrNm;
	}
	
	/**
	 * Column Info
	 * @param sEviCtnt12
	 */
	public void setSEviCtnt12(String sEviCtnt12) {
		this.sEviCtnt12 = sEviCtnt12;
	}
	
	/**
	 * Column Info
	 * @param sEviCtnt11
	 */
	public void setSEviCtnt11(String sEviCtnt11) {
		this.sEviCtnt11 = sEviCtnt11;
	}
	
	/**
	 * Column Info
	 * @param sEviTaxCode
	 */
	public void setSEviTaxCode(String sEviTaxCode) {
		this.sEviTaxCode = sEviTaxCode;
	}
	
	/**
	 * Column Info
	 * @param financeFlg
	 */
	public void setFinanceFlg(String financeFlg) {
		this.financeFlg = financeFlg;
	}
	
	/**
	 * Column Info
	 * @param invOfcCd
	 */
	public void setInvOfcCd(String invOfcCd) {
		this.invOfcCd = invOfcCd;
	}
	
	/**
	 * Column Info
	 * @param invRgstNo
	 */
	public void setInvRgstNo(String invRgstNo) {
		this.invRgstNo = invRgstNo;
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
	 * @param genPayTermCd
	 */
	public void setGenPayTermCd(String genPayTermCd) {
		this.genPayTermCd = genPayTermCd;
	}
	
	/**
	 * Column Info
	 * @param sTaxType
	 */
	public void setSTaxType(String sTaxType) {
		this.sTaxType = sTaxType;
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
	 * @param tempPaymentDueDt
	 */
	public void setTempPaymentDueDt(String tempPaymentDueDt) {
		this.tempPaymentDueDt = tempPaymentDueDt;
	}
	
	/**
	 * Column Info
	 * @param paymentDueDt
	 */
	public void setPaymentDueDt(String paymentDueDt) {
		this.paymentDueDt = paymentDueDt;
	}
	
	/**
	 * Column Info
	 * @param ofcCd
	 */
	public void setOfcCd(String ofcCd) {
		this.ofcCd = ofcCd;
	}
	
	/**
	 * Column Info
	 * @param eviTotalTaxAmt
	 */
	public void setEviTotalTaxAmt(String eviTotalTaxAmt) {
		this.eviTotalTaxAmt = eviTotalTaxAmt;
	}
	
	/**
	 * Column Info
	 * @param eviTaxCode
	 */
	public void setEviTaxCode(String eviTaxCode) {
		this.eviTaxCode = eviTaxCode;
	}
	
	/**
	 * Column Info
	 * @param ttlLssDivCd
	 */
	public void setTtlLssDivCd(String ttlLssDivCd) {
		this.ttlLssDivCd = ttlLssDivCd;
	}
	
	/**
	 * Column Info
	 * @param comMrdpath
	 */
	public void setComMrdpath(String comMrdpath) {
		this.comMrdpath = comMrdpath;
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
	 * @param csrAmt
	 */
	public void setCsrAmt(String csrAmt) {
		this.csrAmt = csrAmt;
	}
	
	/**
	 * Column Info
	 * @param sFaFlg
	 */
	public void setSFaFlg(String sFaFlg) {
		this.sFaFlg = sFaFlg;
	}
	
	/**
	 * Column Info
	 * @param sEviTaxNo
	 */
	public void setSEviTaxNo(String sEviTaxNo) {
		this.sEviTaxNo = sEviTaxNo;
	}
	
	/**
	 * Column Info
	 * @param comMrdarguments
	 */
	public void setComMrdarguments(String comMrdarguments) {
		this.comMrdarguments = comMrdarguments;
	}
	
	/**
	 * Column Info
	 * @param sEviTotalNetAmt
	 */
	public void setSEviTotalNetAmt(String sEviTotalNetAmt) {
		this.sEviTotalNetAmt = sEviTotalNetAmt;
	}
	
	/**
	 * Column Info
	 * @param eviCompNo
	 */
	public void setEviCompNo(String eviCompNo) {
		this.eviCompNo = eviCompNo;
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
	public static CsrParmVO fromRequest(HttpServletRequest request, String prefix) {
		CsrParmVO model = new CsrParmVO();
		try{
			model.setCntInv(JSPUtil.getParameter(request, prefix + "cnt_inv", ""));
			model.setSEviCtnt8(JSPUtil.getParameter(request, prefix + "s_evi_ctnt8", ""));
			model.setSEviCtnt9(JSPUtil.getParameter(request, prefix + "s_evi_ctnt9", ""));
			model.setSEviTaxNo2(JSPUtil.getParameter(request, prefix + "s_evi_tax_no2", ""));
			model.setApopen(JSPUtil.getParameter(request, prefix + "apopen", ""));
			model.setSEviCtnt4(JSPUtil.getParameter(request, prefix + "s_evi_ctnt4", ""));
			model.setEviCtnt12(JSPUtil.getParameter(request, prefix + "evi_ctnt12", ""));
			model.setSEviCtnt5(JSPUtil.getParameter(request, prefix + "s_evi_ctnt5", ""));
			model.setSEviCtnt6(JSPUtil.getParameter(request, prefix + "s_evi_ctnt6", ""));
			model.setSEviCtnt7(JSPUtil.getParameter(request, prefix + "s_evi_ctnt7", ""));
			model.setPayGroupCd(JSPUtil.getParameter(request, prefix + "pay_group_cd", ""));
			model.setSEviCtnt1(JSPUtil.getParameter(request, prefix + "s_evi_ctnt1", ""));
			model.setMaxIssDt(JSPUtil.getParameter(request, prefix + "max_iss_dt", ""));
			model.setSEviCtnt2(JSPUtil.getParameter(request, prefix + "s_evi_ctnt2", ""));
			model.setSEviCtnt3(JSPUtil.getParameter(request, prefix + "s_evi_ctnt3", ""));
			model.setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
			model.setSEviInvDt(JSPUtil.getParameter(request, prefix + "s_evi_inv_dt", ""));
			model.setEviInvDt(JSPUtil.getParameter(request, prefix + "evi_inv_dt", ""));
			model.setSEviinputflg(JSPUtil.getParameter(request, prefix + "s_eviinputflg", ""));
			model.setAsanogb(JSPUtil.getParameter(request, prefix + "asanogb", ""));
			model.setRcvDt(JSPUtil.getParameter(request, prefix + "rcv_dt", ""));
			model.setCntCd(JSPUtil.getParameter(request, prefix + "cnt_cd", ""));
			model.setMaxRcvDt(JSPUtil.getParameter(request, prefix + "max_rcv_dt", ""));
			model.setUsrEml(JSPUtil.getParameter(request, prefix + "usr_eml", ""));
			model.setInvKnt(JSPUtil.getParameter(request, prefix + "inv_knt", ""));
			model.setEviCtnt11(JSPUtil.getParameter(request, prefix + "evi_ctnt11", ""));
			model.setTaxNaidFlg(JSPUtil.getParameter(request, prefix + "tax_naid_flg", ""));
			model.setEviCtnt10(JSPUtil.getParameter(request, prefix + "evi_ctnt10", ""));
			model.setCsrTpCd(JSPUtil.getParameter(request, prefix + "csr_tp_cd", ""));
			model.setKey(JSPUtil.getParameter(request, prefix + "key", ""));
			model.setCsrNo(JSPUtil.getParameter(request, prefix + "csr_no", ""));
			model.setApOfcCd(JSPUtil.getParameter(request, prefix + "ap_ofc_cd", ""));
			model.setSTaxNslFlg(JSPUtil.getParameter(request, prefix + "s_tax_nsl_flg", ""));
			model.setEviCtnt9(JSPUtil.getParameter(request, prefix + "evi_ctnt9", ""));
			model.setSTaxNaidFlg(JSPUtil.getParameter(request, prefix + "s_tax_naid_flg", ""));
			model.setEviCtnt8(JSPUtil.getParameter(request, prefix + "evi_ctnt8", ""));
			model.setEviGb(JSPUtil.getParameter(request, prefix + "evi_gb", ""));
			model.setEviCtnt7(JSPUtil.getParameter(request, prefix + "evi_ctnt7", ""));
			model.setEviCtnt6(JSPUtil.getParameter(request, prefix + "evi_ctnt6", ""));
			model.setTaxNslFlg(JSPUtil.getParameter(request, prefix + "tax_nsl_flg", ""));
			model.setEviCtnt5(JSPUtil.getParameter(request, prefix + "evi_ctnt5", ""));
			model.setEviCtnt4(JSPUtil.getParameter(request, prefix + "evi_ctnt4", ""));
			model.setEviCtnt3(JSPUtil.getParameter(request, prefix + "evi_ctnt3", ""));
			model.setEviCtnt2(JSPUtil.getParameter(request, prefix + "evi_ctnt2", ""));
			model.setFaFlg(JSPUtil.getParameter(request, prefix + "fa_flg", ""));
			model.setEviCtnt1(JSPUtil.getParameter(request, prefix + "evi_ctnt1", ""));
			model.setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
			model.setVndrSeq(JSPUtil.getParameter(request, prefix + "vndr_seq", ""));
			model.setInvSubSysCd(JSPUtil.getParameter(request, prefix + "inv_sub_sys_cd", ""));
			model.setSEviTotalTaxAmt(JSPUtil.getParameter(request, prefix + "s_evi_total_tax_amt", ""));
			model.setPayTermTpCd(JSPUtil.getParameter(request, prefix + "pay_term_tp_cd", ""));
			model.setEviTaxNo2(JSPUtil.getParameter(request, prefix + "evi_tax_no2", ""));
			model.setAproStep(JSPUtil.getParameter(request, prefix + "apro_step", ""));
			model.setCurrCd(JSPUtil.getParameter(request, prefix + "curr_cd", ""));
			model.setSFinanceFlg(JSPUtil.getParameter(request, prefix + "s_finance_flg", ""));
			model.setAsaNoS(JSPUtil.getParameter(request, prefix + "asa_no_s", ""));
			model.setPsoTrnsSlpCtnt(JSPUtil.getParameter(request, prefix + "pso_trns_slp_ctnt", ""));
			model.setEviTotalNetAmt(JSPUtil.getParameter(request, prefix + "evi_total_net_amt", ""));
			model.setEviTaxNo(JSPUtil.getParameter(request, prefix + "evi_tax_no", ""));
			model.setAproseqkey(JSPUtil.getParameter(request, prefix + "aproSeqKey", ""));
			model.setEviinputflg(JSPUtil.getParameter(request, prefix + "eviinputflg", ""));
			model.setTotalAmt(JSPUtil.getParameter(request, prefix + "total_amt", ""));
			model.setSEviCtnt10(JSPUtil.getParameter(request, prefix + "s_evi_ctnt10", ""));
			model.setIssDt(JSPUtil.getParameter(request, prefix + "iss_dt", ""));
			model.setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
			model.setSEviCompNo(JSPUtil.getParameter(request, prefix + "s_evi_comp_no", ""));
			model.setUsrNm(JSPUtil.getParameter(request, prefix + "usr_nm", ""));
			model.setSEviCtnt12(JSPUtil.getParameter(request, prefix + "s_evi_ctnt12", ""));
			model.setSEviCtnt11(JSPUtil.getParameter(request, prefix + "s_evi_ctnt11", ""));
			model.setSEviTaxCode(JSPUtil.getParameter(request, prefix + "s_evi_tax_code", ""));
			model.setFinanceFlg(JSPUtil.getParameter(request, prefix + "finance_flg", ""));
			model.setInvOfcCd(JSPUtil.getParameter(request, prefix + "inv_ofc_cd", ""));
			model.setInvRgstNo(JSPUtil.getParameter(request, prefix + "inv_rgst_no", ""));
			model.setCostOfcCd(JSPUtil.getParameter(request, prefix + "cost_ofc_cd", ""));
			model.setGenPayTermCd(JSPUtil.getParameter(request, prefix + "gen_pay_term_cd", ""));
			model.setSTaxType(JSPUtil.getParameter(request, prefix + "s_tax_type", ""));
			model.setInvCfmDt(JSPUtil.getParameter(request, prefix + "inv_cfm_dt", ""));
			model.setGenPayTermDesc(JSPUtil.getParameter(request, prefix + "gen_pay_term_desc", ""));
			model.setTempPaymentDueDt(JSPUtil.getParameter(request, prefix + "temp_payment_due_dt", ""));
			model.setPaymentDueDt(JSPUtil.getParameter(request, prefix + "payment_due_dt", ""));
			model.setOfcCd(JSPUtil.getParameter(request, prefix + "ofc_cd", ""));
			model.setEviTotalTaxAmt(JSPUtil.getParameter(request, prefix + "evi_total_tax_amt", ""));
			model.setEviTaxCode(JSPUtil.getParameter(request, prefix + "evi_tax_code", ""));
			model.setTtlLssDivCd(JSPUtil.getParameter(request, prefix + "ttl_lss_div_cd", ""));
			model.setComMrdpath(JSPUtil.getParameter(request, prefix + "com_mrdpath", ""));
			model.setTaxType(JSPUtil.getParameter(request, prefix + "tax_type", ""));
			model.setCsrAmt(JSPUtil.getParameter(request, prefix + "csr_amt", ""));
			model.setSFaFlg(JSPUtil.getParameter(request, prefix + "s_fa_flg", ""));
			model.setSEviTaxNo(JSPUtil.getParameter(request, prefix + "s_evi_tax_no", ""));
			model.setComMrdarguments(JSPUtil.getParameter(request, prefix + "com_mrdarguments", ""));
			model.setSEviTotalNetAmt(JSPUtil.getParameter(request, prefix + "s_evi_total_net_amt", ""));
			model.setEviCompNo(JSPUtil.getParameter(request, prefix + "evi_comp_no", ""));
			model.setIfStatus(JSPUtil.getParameter(request, prefix + "if_status", ""));
			model.setAttrCtnt8(JSPUtil.getParameter(request, prefix + "attr_ctnt8", ""));
		}catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return CsrParmVO[]
	 */
	public CsrParmVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return CsrParmVO[]
	 */
	public CsrParmVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CsrParmVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] cntInv = (JSPUtil.getParameter(request, prefix	+ "cnt_inv", length));
			String[] sEviCtnt8 = (JSPUtil.getParameter(request, prefix	+ "s_evi_ctnt8", length));
			String[] sEviCtnt9 = (JSPUtil.getParameter(request, prefix	+ "s_evi_ctnt9", length));
			String[] sEviTaxNo2 = (JSPUtil.getParameter(request, prefix	+ "s_evi_tax_no2", length));
			String[] apopen = (JSPUtil.getParameter(request, prefix	+ "apopen", length));
			String[] sEviCtnt4 = (JSPUtil.getParameter(request, prefix	+ "s_evi_ctnt4", length));
			String[] eviCtnt12 = (JSPUtil.getParameter(request, prefix	+ "evi_ctnt12", length));
			String[] sEviCtnt5 = (JSPUtil.getParameter(request, prefix	+ "s_evi_ctnt5", length));
			String[] sEviCtnt6 = (JSPUtil.getParameter(request, prefix	+ "s_evi_ctnt6", length));
			String[] sEviCtnt7 = (JSPUtil.getParameter(request, prefix	+ "s_evi_ctnt7", length));
			String[] payGroupCd = (JSPUtil.getParameter(request, prefix	+ "pay_group_cd", length));
			String[] sEviCtnt1 = (JSPUtil.getParameter(request, prefix	+ "s_evi_ctnt1", length));
			String[] maxIssDt = (JSPUtil.getParameter(request, prefix	+ "max_iss_dt", length));
			String[] sEviCtnt2 = (JSPUtil.getParameter(request, prefix	+ "s_evi_ctnt2", length));
			String[] sEviCtnt3 = (JSPUtil.getParameter(request, prefix	+ "s_evi_ctnt3", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] sEviInvDt = (JSPUtil.getParameter(request, prefix	+ "s_evi_inv_dt", length));
			String[] eviInvDt = (JSPUtil.getParameter(request, prefix	+ "evi_inv_dt", length));
			String[] sEviinputflg = (JSPUtil.getParameter(request, prefix	+ "s_eviinputflg", length));
			String[] asanogb = (JSPUtil.getParameter(request, prefix	+ "asanogb", length));
			String[] rcvDt = (JSPUtil.getParameter(request, prefix	+ "rcv_dt", length));
			String[] cntCd = (JSPUtil.getParameter(request, prefix	+ "cnt_cd", length));
			String[] maxRcvDt = (JSPUtil.getParameter(request, prefix	+ "max_rcv_dt", length));
			String[] usrEml = (JSPUtil.getParameter(request, prefix	+ "usr_eml", length));
			String[] invKnt = (JSPUtil.getParameter(request, prefix	+ "inv_knt", length));
			String[] eviCtnt11 = (JSPUtil.getParameter(request, prefix	+ "evi_ctnt11", length));
			String[] taxNaidFlg = (JSPUtil.getParameter(request, prefix	+ "tax_naid_flg", length));
			String[] eviCtnt10 = (JSPUtil.getParameter(request, prefix	+ "evi_ctnt10", length));
			String[] csrTpCd = (JSPUtil.getParameter(request, prefix	+ "csr_tp_cd", length));
			String[] key = (JSPUtil.getParameter(request, prefix	+ "key", length));
			String[] csrNo = (JSPUtil.getParameter(request, prefix	+ "csr_no", length));
			String[] apOfcCd = (JSPUtil.getParameter(request, prefix	+ "ap_ofc_cd", length));
			String[] ifStatus = (JSPUtil.getParameter(request, prefix	+ "if_status", length));
			String[] sTaxNslFlg = (JSPUtil.getParameter(request, prefix	+ "s_tax_nsl_flg", length));
			String[] eviCtnt9 = (JSPUtil.getParameter(request, prefix	+ "evi_ctnt9", length));
			String[] sTaxNaidFlg = (JSPUtil.getParameter(request, prefix	+ "s_tax_naid_flg", length));
			String[] eviCtnt8 = (JSPUtil.getParameter(request, prefix	+ "evi_ctnt8", length));
			String[] eviGb = (JSPUtil.getParameter(request, prefix	+ "evi_gb", length));
			String[] eviCtnt7 = (JSPUtil.getParameter(request, prefix	+ "evi_ctnt7", length));
			String[] eviCtnt6 = (JSPUtil.getParameter(request, prefix	+ "evi_ctnt6", length));
			String[] taxNslFlg = (JSPUtil.getParameter(request, prefix	+ "tax_nsl_flg", length));
			String[] eviCtnt5 = (JSPUtil.getParameter(request, prefix	+ "evi_ctnt5", length));
			String[] eviCtnt4 = (JSPUtil.getParameter(request, prefix	+ "evi_ctnt4", length));
			String[] eviCtnt3 = (JSPUtil.getParameter(request, prefix	+ "evi_ctnt3", length));
			String[] eviCtnt2 = (JSPUtil.getParameter(request, prefix	+ "evi_ctnt2", length));
			String[] faFlg = (JSPUtil.getParameter(request, prefix	+ "fa_flg", length));
			String[] eviCtnt1 = (JSPUtil.getParameter(request, prefix	+ "evi_ctnt1", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] vndrSeq = (JSPUtil.getParameter(request, prefix	+ "vndr_seq", length));
			String[] invSubSysCd = (JSPUtil.getParameter(request, prefix	+ "inv_sub_sys_cd", length));
			String[] sEviTotalTaxAmt = (JSPUtil.getParameter(request, prefix	+ "s_evi_total_tax_amt", length));
			String[] payTermTpCd = (JSPUtil.getParameter(request, prefix	+ "pay_term_tp_cd", length));
			String[] eviTaxNo2 = (JSPUtil.getParameter(request, prefix	+ "evi_tax_no2", length));
			String[] aproStep = (JSPUtil.getParameter(request, prefix	+ "apro_step", length));
			String[] currCd = (JSPUtil.getParameter(request, prefix	+ "curr_cd", length));
			String[] sFinanceFlg = (JSPUtil.getParameter(request, prefix	+ "s_finance_flg", length));
			String[] asaNoS = (JSPUtil.getParameter(request, prefix	+ "asa_no_s", length));
			String[] psoTrnsSlpCtnt = (JSPUtil.getParameter(request, prefix	+ "pso_trns_slp_ctnt", length));
			String[] eviTotalNetAmt = (JSPUtil.getParameter(request, prefix	+ "evi_total_net_amt", length));
			String[] eviTaxNo = (JSPUtil.getParameter(request, prefix	+ "evi_tax_no", length));
			String[] attrCtnt8 = (JSPUtil.getParameter(request, prefix	+ "attr_ctnt8", length));
			String[] aproseqkey = (JSPUtil.getParameter(request, prefix	+ "aproseqkey", length));
			String[] eviinputflg = (JSPUtil.getParameter(request, prefix	+ "eviinputflg", length));
			String[] totalAmt = (JSPUtil.getParameter(request, prefix	+ "total_amt", length));
			String[] sEviCtnt10 = (JSPUtil.getParameter(request, prefix	+ "s_evi_ctnt10", length));
			String[] issDt = (JSPUtil.getParameter(request, prefix	+ "iss_dt", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] sEviCompNo = (JSPUtil.getParameter(request, prefix	+ "s_evi_comp_no", length));
			String[] usrNm = (JSPUtil.getParameter(request, prefix	+ "usr_nm", length));
			String[] sEviCtnt12 = (JSPUtil.getParameter(request, prefix	+ "s_evi_ctnt12", length));
			String[] sEviCtnt11 = (JSPUtil.getParameter(request, prefix	+ "s_evi_ctnt11", length));
			String[] sEviTaxCode = (JSPUtil.getParameter(request, prefix	+ "s_evi_tax_code", length));
			String[] financeFlg = (JSPUtil.getParameter(request, prefix	+ "finance_flg", length));
			String[] invOfcCd = (JSPUtil.getParameter(request, prefix	+ "inv_ofc_cd", length));
			String[] invRgstNo = (JSPUtil.getParameter(request, prefix	+ "inv_rgst_no", length));
			String[] costOfcCd = (JSPUtil.getParameter(request, prefix	+ "cost_ofc_cd", length));
			String[] genPayTermCd = (JSPUtil.getParameter(request, prefix	+ "gen_pay_term_cd", length));
			String[] sTaxType = (JSPUtil.getParameter(request, prefix	+ "s_tax_type", length));
			String[] invCfmDt = (JSPUtil.getParameter(request, prefix	+ "inv_cfm_dt", length));
			String[] genPayTermDesc = (JSPUtil.getParameter(request, prefix	+ "gen_pay_term_desc", length));
			String[] tempPaymentDueDt = (JSPUtil.getParameter(request, prefix	+ "temp_payment_due_dt", length));
			String[] paymentDueDt = (JSPUtil.getParameter(request, prefix	+ "payment_due_dt", length));
			String[] ofcCd = (JSPUtil.getParameter(request, prefix	+ "ofc_cd", length));
			String[] eviTotalTaxAmt = (JSPUtil.getParameter(request, prefix	+ "evi_total_tax_amt", length));
			String[] eviTaxCode = (JSPUtil.getParameter(request, prefix	+ "evi_tax_code", length));
			String[] ttlLssDivCd = (JSPUtil.getParameter(request, prefix	+ "ttl_lss_div_cd", length));
			String[] comMrdpath = (JSPUtil.getParameter(request, prefix	+ "com_mrdpath", length));
			String[] taxType = (JSPUtil.getParameter(request, prefix	+ "tax_type", length));
			String[] csrAmt = (JSPUtil.getParameter(request, prefix	+ "csr_amt", length));
			String[] sFaFlg = (JSPUtil.getParameter(request, prefix	+ "s_fa_flg", length));
			String[] sEviTaxNo = (JSPUtil.getParameter(request, prefix	+ "s_evi_tax_no", length));
			String[] comMrdarguments = (JSPUtil.getParameter(request, prefix	+ "com_mrdarguments", length));
			String[] sEviTotalNetAmt = (JSPUtil.getParameter(request, prefix	+ "s_evi_total_net_amt", length));
			String[] eviCompNo = (JSPUtil.getParameter(request, prefix	+ "evi_comp_no", length));
			
			for (int i = 0; i < length; i++) {
				model = new CsrParmVO();
				if (cntInv[i] != null)
					model.setCntInv(cntInv[i]);
				if (sEviCtnt8[i] != null)
					model.setSEviCtnt8(sEviCtnt8[i]);
				if (sEviCtnt9[i] != null)
					model.setSEviCtnt9(sEviCtnt9[i]);
				if (sEviTaxNo2[i] != null)
					model.setSEviTaxNo2(sEviTaxNo2[i]);
				if (apopen[i] != null)
					model.setApopen(apopen[i]);
				if (sEviCtnt4[i] != null)
					model.setSEviCtnt4(sEviCtnt4[i]);
				if (eviCtnt12[i] != null)
					model.setEviCtnt12(eviCtnt12[i]);
				if (sEviCtnt5[i] != null)
					model.setSEviCtnt5(sEviCtnt5[i]);
				if (sEviCtnt6[i] != null)
					model.setSEviCtnt6(sEviCtnt6[i]);
				if (sEviCtnt7[i] != null)
					model.setSEviCtnt7(sEviCtnt7[i]);
				if (payGroupCd[i] != null)
					model.setPayGroupCd(payGroupCd[i]);
				if (sEviCtnt1[i] != null)
					model.setSEviCtnt1(sEviCtnt1[i]);
				if (maxIssDt[i] != null)
					model.setMaxIssDt(maxIssDt[i]);
				if (sEviCtnt2[i] != null)
					model.setSEviCtnt2(sEviCtnt2[i]);
				if (sEviCtnt3[i] != null)
					model.setSEviCtnt3(sEviCtnt3[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (sEviInvDt[i] != null)
					model.setSEviInvDt(sEviInvDt[i]);
				if (eviInvDt[i] != null)
					model.setEviInvDt(eviInvDt[i]);
				if (sEviinputflg[i] != null)
					model.setSEviinputflg(sEviinputflg[i]);
				if (asanogb[i] != null)
					model.setAsanogb(asanogb[i]);
				if (rcvDt[i] != null)
					model.setRcvDt(rcvDt[i]);
				if (cntCd[i] != null)
					model.setCntCd(cntCd[i]);
				if (maxRcvDt[i] != null)
					model.setMaxRcvDt(maxRcvDt[i]);
				if (usrEml[i] != null)
					model.setUsrEml(usrEml[i]);
				if (invKnt[i] != null)
					model.setInvKnt(invKnt[i]);
				if (eviCtnt11[i] != null)
					model.setEviCtnt11(eviCtnt11[i]);
				if (taxNaidFlg[i] != null)
					model.setTaxNaidFlg(taxNaidFlg[i]);
				if (eviCtnt10[i] != null)
					model.setEviCtnt10(eviCtnt10[i]);
				if (csrTpCd[i] != null)
					model.setCsrTpCd(csrTpCd[i]);
				if (key[i] != null)
					model.setKey(key[i]);
				if (csrNo[i] != null)
					model.setCsrNo(csrNo[i]);
				if (apOfcCd[i] != null)
					model.setApOfcCd(apOfcCd[i]);
				if (ifStatus[i] != null)
					model.setIfStatus(ifStatus[i]);
				if (sTaxNslFlg[i] != null)
					model.setSTaxNslFlg(sTaxNslFlg[i]);
				if (eviCtnt9[i] != null)
					model.setEviCtnt9(eviCtnt9[i]);
				if (sTaxNaidFlg[i] != null)
					model.setSTaxNaidFlg(sTaxNaidFlg[i]);
				if (eviCtnt8[i] != null)
					model.setEviCtnt8(eviCtnt8[i]);
				if (eviGb[i] != null)
					model.setEviGb(eviGb[i]);
				if (eviCtnt7[i] != null)
					model.setEviCtnt7(eviCtnt7[i]);
				if (eviCtnt6[i] != null)
					model.setEviCtnt6(eviCtnt6[i]);
				if (taxNslFlg[i] != null)
					model.setTaxNslFlg(taxNslFlg[i]);
				if (eviCtnt5[i] != null)
					model.setEviCtnt5(eviCtnt5[i]);
				if (eviCtnt4[i] != null)
					model.setEviCtnt4(eviCtnt4[i]);
				if (eviCtnt3[i] != null)
					model.setEviCtnt3(eviCtnt3[i]);
				if (eviCtnt2[i] != null)
					model.setEviCtnt2(eviCtnt2[i]);
				if (faFlg[i] != null)
					model.setFaFlg(faFlg[i]);
				if (eviCtnt1[i] != null)
					model.setEviCtnt1(eviCtnt1[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (vndrSeq[i] != null)
					model.setVndrSeq(vndrSeq[i]);
				if (invSubSysCd[i] != null)
					model.setInvSubSysCd(invSubSysCd[i]);
				if (sEviTotalTaxAmt[i] != null)
					model.setSEviTotalTaxAmt(sEviTotalTaxAmt[i]);
				if (payTermTpCd[i] != null)
					model.setPayTermTpCd(payTermTpCd[i]);
				if (eviTaxNo2[i] != null)
					model.setEviTaxNo2(eviTaxNo2[i]);
				if (aproStep[i] != null)
					model.setAproStep(aproStep[i]);
				if (currCd[i] != null)
					model.setCurrCd(currCd[i]);
				if (sFinanceFlg[i] != null)
					model.setSFinanceFlg(sFinanceFlg[i]);
				if (asaNoS[i] != null)
					model.setAsaNoS(asaNoS[i]);
				if (psoTrnsSlpCtnt[i] != null)
					model.setPsoTrnsSlpCtnt(psoTrnsSlpCtnt[i]);
				if (eviTotalNetAmt[i] != null)
					model.setEviTotalNetAmt(eviTotalNetAmt[i]);
				if (eviTaxNo[i] != null)
					model.setEviTaxNo(eviTaxNo[i]);
				if (attrCtnt8[i] != null)
					model.setAttrCtnt8(attrCtnt8[i]);
				if (aproseqkey[i] != null)
					model.setAproseqkey(aproseqkey[i]);
				if (eviinputflg[i] != null)
					model.setEviinputflg(eviinputflg[i]);
				if (totalAmt[i] != null)
					model.setTotalAmt(totalAmt[i]);
				if (sEviCtnt10[i] != null)
					model.setSEviCtnt10(sEviCtnt10[i]);
				if (issDt[i] != null)
					model.setIssDt(issDt[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (sEviCompNo[i] != null)
					model.setSEviCompNo(sEviCompNo[i]);
				if (usrNm[i] != null)
					model.setUsrNm(usrNm[i]);
				if (sEviCtnt12[i] != null)
					model.setSEviCtnt12(sEviCtnt12[i]);
				if (sEviCtnt11[i] != null)
					model.setSEviCtnt11(sEviCtnt11[i]);
				if (sEviTaxCode[i] != null)
					model.setSEviTaxCode(sEviTaxCode[i]);
				if (financeFlg[i] != null)
					model.setFinanceFlg(financeFlg[i]);
				if (invOfcCd[i] != null)
					model.setInvOfcCd(invOfcCd[i]);
				if (invRgstNo[i] != null)
					model.setInvRgstNo(invRgstNo[i]);
				if (costOfcCd[i] != null)
					model.setCostOfcCd(costOfcCd[i]);
				if (genPayTermCd[i] != null)
					model.setGenPayTermCd(genPayTermCd[i]);
				if (sTaxType[i] != null)
					model.setSTaxType(sTaxType[i]);
				if (invCfmDt[i] != null)
					model.setInvCfmDt(invCfmDt[i]);
				if (genPayTermDesc[i] != null)
					model.setGenPayTermDesc(genPayTermDesc[i]);
				if (tempPaymentDueDt[i] != null)
					model.setTempPaymentDueDt(tempPaymentDueDt[i]);
				if (paymentDueDt[i] != null)
					model.setPaymentDueDt(paymentDueDt[i]);
				if (ofcCd[i] != null)
					model.setOfcCd(ofcCd[i]);
				if (eviTotalTaxAmt[i] != null)
					model.setEviTotalTaxAmt(eviTotalTaxAmt[i]);
				if (eviTaxCode[i] != null)
					model.setEviTaxCode(eviTaxCode[i]);
				if (ttlLssDivCd[i] != null)
					model.setTtlLssDivCd(ttlLssDivCd[i]);
				if (comMrdpath[i] != null)
					model.setComMrdpath(comMrdpath[i]);
				if (taxType[i] != null)
					model.setTaxType(taxType[i]);
				if (csrAmt[i] != null)
					model.setCsrAmt(csrAmt[i]);
				if (sFaFlg[i] != null)
					model.setSFaFlg(sFaFlg[i]);
				if (sEviTaxNo[i] != null)
					model.setSEviTaxNo(sEviTaxNo[i]);
				if (comMrdarguments[i] != null)
					model.setComMrdarguments(comMrdarguments[i]);
				if (sEviTotalNetAmt[i] != null)
					model.setSEviTotalNetAmt(sEviTotalNetAmt[i]);
				if (eviCompNo[i] != null)
					model.setEviCompNo(eviCompNo[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getCsrParmVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return CsrParmVO[]
	 */
	public CsrParmVO[] getCsrParmVOs(){
		CsrParmVO[] vos = (CsrParmVO[])models.toArray(new CsrParmVO[models.size()]);
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
		this.sEviCtnt8 = this.sEviCtnt8 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sEviCtnt9 = this.sEviCtnt9 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sEviTaxNo2 = this.sEviTaxNo2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.apopen = this.apopen .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sEviCtnt4 = this.sEviCtnt4 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eviCtnt12 = this.eviCtnt12 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sEviCtnt5 = this.sEviCtnt5 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sEviCtnt6 = this.sEviCtnt6 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sEviCtnt7 = this.sEviCtnt7 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.payGroupCd = this.payGroupCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sEviCtnt1 = this.sEviCtnt1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.maxIssDt = this.maxIssDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sEviCtnt2 = this.sEviCtnt2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sEviCtnt3 = this.sEviCtnt3 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sEviInvDt = this.sEviInvDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eviInvDt = this.eviInvDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sEviinputflg = this.sEviinputflg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.asanogb = this.asanogb .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcvDt = this.rcvDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntCd = this.cntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.maxRcvDt = this.maxRcvDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usrEml = this.usrEml .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invKnt = this.invKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eviCtnt11 = this.eviCtnt11 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.taxNaidFlg = this.taxNaidFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eviCtnt10 = this.eviCtnt10 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.csrTpCd = this.csrTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.key = this.key .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.csrNo = this.csrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.apOfcCd = this.apOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ifStatus = this.ifStatus .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sTaxNslFlg = this.sTaxNslFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eviCtnt9 = this.eviCtnt9 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sTaxNaidFlg = this.sTaxNaidFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eviCtnt8 = this.eviCtnt8 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eviGb = this.eviGb .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eviCtnt7 = this.eviCtnt7 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eviCtnt6 = this.eviCtnt6 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.taxNslFlg = this.taxNslFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eviCtnt5 = this.eviCtnt5 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eviCtnt4 = this.eviCtnt4 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eviCtnt3 = this.eviCtnt3 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eviCtnt2 = this.eviCtnt2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faFlg = this.faFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eviCtnt1 = this.eviCtnt1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrSeq = this.vndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invSubSysCd = this.invSubSysCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sEviTotalTaxAmt = this.sEviTotalTaxAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.payTermTpCd = this.payTermTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eviTaxNo2 = this.eviTaxNo2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aproStep = this.aproStep .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.currCd = this.currCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sFinanceFlg = this.sFinanceFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.asaNoS = this.asaNoS .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.psoTrnsSlpCtnt = this.psoTrnsSlpCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eviTotalNetAmt = this.eviTotalNetAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eviTaxNo = this.eviTaxNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.attrCtnt8 = this.attrCtnt8 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aproseqkey = this.aproseqkey .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eviinputflg = this.eviinputflg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.totalAmt = this.totalAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sEviCtnt10 = this.sEviCtnt10 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.issDt = this.issDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sEviCompNo = this.sEviCompNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usrNm = this.usrNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sEviCtnt12 = this.sEviCtnt12 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sEviCtnt11 = this.sEviCtnt11 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sEviTaxCode = this.sEviTaxCode .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.financeFlg = this.financeFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invOfcCd = this.invOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invRgstNo = this.invRgstNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costOfcCd = this.costOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.genPayTermCd = this.genPayTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sTaxType = this.sTaxType .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invCfmDt = this.invCfmDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.genPayTermDesc = this.genPayTermDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tempPaymentDueDt = this.tempPaymentDueDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.paymentDueDt = this.paymentDueDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcCd = this.ofcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eviTotalTaxAmt = this.eviTotalTaxAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eviTaxCode = this.eviTaxCode .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ttlLssDivCd = this.ttlLssDivCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.comMrdpath = this.comMrdpath .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.taxType = this.taxType .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.csrAmt = this.csrAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sFaFlg = this.sFaFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sEviTaxNo = this.sEviTaxNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.comMrdarguments = this.comMrdarguments .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sEviTotalNetAmt = this.sEviTotalNetAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eviCompNo = this.eviCompNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
