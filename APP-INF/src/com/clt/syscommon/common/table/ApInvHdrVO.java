/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ApInvHdrVO.java
*@FileTitle : ApInvHdrVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.10
*@LastModifier : 함대성
*@LastVersion : 1.0
* 2009.07.10 함대성 
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
 * 관련 Event 에서 생성, 서버실행요청시 Data 전달역할을 수행하는 Value Object
 *
 * @author 함대성
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class ApInvHdrVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<ApInvHdrVO> models = new ArrayList<ApInvHdrVO>();
	
	/* Column Info */
	private String impErrFlg = null;
	/* Column Info */
	private String ifDt = null;
	/* Column Info */
	private String payDt = null;
	/* Column Info */
	private String rcvErrRsn = null;
	/* Column Info */
	private String glDt = null;
	/* Column Info */
	private String attrCtnt10 = null;
	/* Column Info */
	private String csrCurrCd = null;
	/* Column Info */
	private String attrCtnt14 = null;
	/* Column Info */
	private String coaRgnCd = null;
	/* Column Info */
	private String attrCtnt13 = null;
	/* Column Info */
	private String ppdNo = null;
	/* Column Info */
	private String attrCtnt12 = null;
	/* Column Info */
	private String attrCtnt11 = null;
	/* Column Info */
	private String ppdDtrbNo = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String attrCtnt15 = null;
	/* Column Info */
	private String invDesc = null;
	/* Column Info */
	private String vndrNo = null;
	/* Column Info */
	private String payAmt = null;
	/* Column Info */
	private String ppdGlDt = null;
	/* Column Info */
	private String ftuUseCtnt2 = null;
	/* Column Info */
	private String ftuUseCtnt1 = null;
	/* Column Info */
	private String usrEml = null;
	/* Column Info */
	private String estmErrRsn = null;
	/* Column Info */
	private String aproFlg = null;
	/* Column Info */
	private String ftuUseCtnt5 = null;
	/* Column Info */
	private String attrCateNm = null;
	/* Column Info */
	private String csrTpCd = null;
	/* Column Info */
	private String ftuUseCtnt4 = null;
	/* Column Info */
	private String ftuUseCtnt3 = null;
	/* Column Info */
	private String invDt = null;
	/* Column Info */
	private String rcvErrFlg = null;
	/* Column Info */
	private String csrNo = null;
	/* Column Info */
	private String payGrpLuCd = null;
	/* Column Info */
	private String ifFlg = null;
	/* Column Info */
	private String ppayAplyFlg = null;
	/* Column Info */
	private String coaCoCd = null;
	/* Column Info */
	private String errCsrNo = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String payMzdLuCd = null;
	/* Column Info */
	private String invTermDt = null;
	/* Column Info */
	private String taxDeclFlg = null;
	/* Column Info */
	private String aftActFlg = null;
	/* Column Info */
	private String coaInterCoCd = null;
	/* Column Info */
	private String coaAcctCd = null;
	/* Column Info */
	private String gloAttrCtnt17 = null;
	/* Column Info */
	private String gloAttrCtnt18 = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String attrCtnt9 = null;
	/* Column Info */
	private String gloAttrCtnt15 = null;
	/* Column Info */
	private String attrCtnt8 = null;
	/* Column Info */
	private String gloAttrCtnt16 = null;
	/* Column Info */
	private String gloAttrCtnt13 = null;
	/* Column Info */
	private String gloAttrCtnt14 = null;
	/* Column Info */
	private String gloAttrCtnt11 = null;
	/* Column Info */
	private String ifErrRsn = null;
	/* Column Info */
	private String gloAttrCtnt12 = null;
	/* Column Info */
	private String gloAttrCtnt10 = null;
	/* Column Info */
	private String attrCtnt1 = null;
	/* Column Info */
	private String taxCurrXchFlg = null;
	/* Column Info */
	private String coaFtuN1stCd = null;
	/* Column Info */
	private String attrCtnt2 = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String attrCtnt3 = null;
	/* Column Info */
	private String attrCtnt4 = null;
	/* Column Info */
	private String attrCtnt5 = null;
	/* Column Info */
	private String tjOfcCd = null;
	/* Column Info */
	private String attrCtnt6 = null;
	/* Column Info */
	private String attrCtnt7 = null;
	/* Column Info */
	private String gloAttrCtnt2 = null;
	/* Column Info */
	private String gloAttrCtnt3 = null;
	/* Column Info */
	private String gloAttrCtnt4 = null;
	/* Column Info */
	private String gloAttrCtnt5 = null;
	/* Column Info */
	private String actXchRt = null;
	/* Column Info */
	private String gloAttrCtnt6 = null;
	/* Column Info */
	private String ppdAplyAmt = null;
	/* Column Info */
	private String gloAttrCtnt7 = null;
	/* Column Info */
	private String gloAttrCtnt8 = null;
	/* Column Info */
	private String gloAttrCtnt9 = null;
	/* Column Info */
	private String vndrTermNm = null;
	/* Column Info */
	private String gloAttrCtnt1 = null;
	/* Column Info */
	private String coaCtrCd = null;
	/* Column Info */
	private String eaiEvntDt = null;
	/* Column Info */
	private String coaVvdCd = null;
	/* Column Info */
	private String coaFtuN2ndCd = null;
	/* Column Info */
	private String impErrRsn = null;
	/* Column Info */
	private String csrAmt = null;
	/* Column Info */
	private String srcCtnt = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public ApInvHdrVO() {}

	public ApInvHdrVO(String ibflag, String pagerows, String csrNo, String csrTpCd, String invDt, String invTermDt, String glDt, String vndrNo, String csrAmt, String payAmt, String payDt, String csrCurrCd, String vndrTermNm, String invDesc, String attrCateNm, String attrCtnt1, String attrCtnt2, String attrCtnt3, String attrCtnt4, String attrCtnt5, String attrCtnt6, String attrCtnt7, String attrCtnt8, String attrCtnt9, String attrCtnt10, String attrCtnt11, String attrCtnt12, String attrCtnt13, String attrCtnt14, String attrCtnt15, String gloAttrCtnt1, String gloAttrCtnt2, String gloAttrCtnt3, String gloAttrCtnt4, String gloAttrCtnt5, String gloAttrCtnt6, String gloAttrCtnt7, String gloAttrCtnt8, String gloAttrCtnt9, String gloAttrCtnt10, String gloAttrCtnt11, String gloAttrCtnt12, String gloAttrCtnt13, String gloAttrCtnt14, String gloAttrCtnt15, String gloAttrCtnt16, String gloAttrCtnt17, String gloAttrCtnt18, String srcCtnt, String payMzdLuCd, String payGrpLuCd, String coaCoCd, String coaRgnCd, String coaCtrCd, String coaAcctCd, String coaVvdCd, String coaInterCoCd, String coaFtuN1stCd, String coaFtuN2ndCd, String ppdNo, String ppdDtrbNo, String ppdAplyAmt, String ppdGlDt, String aproFlg, String taxDeclFlg, String errCsrNo, String ifFlg, String ifDt, String ifErrRsn, String ppayAplyFlg, String tjOfcCd, String actXchRt, String impErrFlg, String rcvErrFlg, String taxCurrXchFlg, String usrEml, String impErrRsn, String rcvErrRsn, String ftuUseCtnt1, String ftuUseCtnt2, String ftuUseCtnt3, String ftuUseCtnt4, String ftuUseCtnt5, String creDt, String creUsrId, String eaiEvntDt, String aftActFlg, String estmErrRsn) {
		this.impErrFlg = impErrFlg;
		this.ifDt = ifDt;
		this.payDt = payDt;
		this.rcvErrRsn = rcvErrRsn;
		this.glDt = glDt;
		this.attrCtnt10 = attrCtnt10;
		this.csrCurrCd = csrCurrCd;
		this.attrCtnt14 = attrCtnt14;
		this.coaRgnCd = coaRgnCd;
		this.attrCtnt13 = attrCtnt13;
		this.ppdNo = ppdNo;
		this.attrCtnt12 = attrCtnt12;
		this.attrCtnt11 = attrCtnt11;
		this.ppdDtrbNo = ppdDtrbNo;
		this.pagerows = pagerows;
		this.attrCtnt15 = attrCtnt15;
		this.invDesc = invDesc;
		this.vndrNo = vndrNo;
		this.payAmt = payAmt;
		this.ppdGlDt = ppdGlDt;
		this.ftuUseCtnt2 = ftuUseCtnt2;
		this.ftuUseCtnt1 = ftuUseCtnt1;
		this.usrEml = usrEml;
		this.estmErrRsn = estmErrRsn;
		this.aproFlg = aproFlg;
		this.ftuUseCtnt5 = ftuUseCtnt5;
		this.attrCateNm = attrCateNm;
		this.csrTpCd = csrTpCd;
		this.ftuUseCtnt4 = ftuUseCtnt4;
		this.ftuUseCtnt3 = ftuUseCtnt3;
		this.invDt = invDt;
		this.rcvErrFlg = rcvErrFlg;
		this.csrNo = csrNo;
		this.payGrpLuCd = payGrpLuCd;
		this.ifFlg = ifFlg;
		this.ppayAplyFlg = ppayAplyFlg;
		this.coaCoCd = coaCoCd;
		this.errCsrNo = errCsrNo;
		this.creUsrId = creUsrId;
		this.payMzdLuCd = payMzdLuCd;
		this.invTermDt = invTermDt;
		this.taxDeclFlg = taxDeclFlg;
		this.aftActFlg = aftActFlg;
		this.coaInterCoCd = coaInterCoCd;
		this.coaAcctCd = coaAcctCd;
		this.gloAttrCtnt17 = gloAttrCtnt17;
		this.gloAttrCtnt18 = gloAttrCtnt18;
		this.creDt = creDt;
		this.attrCtnt9 = attrCtnt9;
		this.gloAttrCtnt15 = gloAttrCtnt15;
		this.attrCtnt8 = attrCtnt8;
		this.gloAttrCtnt16 = gloAttrCtnt16;
		this.gloAttrCtnt13 = gloAttrCtnt13;
		this.gloAttrCtnt14 = gloAttrCtnt14;
		this.gloAttrCtnt11 = gloAttrCtnt11;
		this.ifErrRsn = ifErrRsn;
		this.gloAttrCtnt12 = gloAttrCtnt12;
		this.gloAttrCtnt10 = gloAttrCtnt10;
		this.attrCtnt1 = attrCtnt1;
		this.taxCurrXchFlg = taxCurrXchFlg;
		this.coaFtuN1stCd = coaFtuN1stCd;
		this.attrCtnt2 = attrCtnt2;
		this.ibflag = ibflag;
		this.attrCtnt3 = attrCtnt3;
		this.attrCtnt4 = attrCtnt4;
		this.attrCtnt5 = attrCtnt5;
		this.tjOfcCd = tjOfcCd;
		this.attrCtnt6 = attrCtnt6;
		this.attrCtnt7 = attrCtnt7;
		this.gloAttrCtnt2 = gloAttrCtnt2;
		this.gloAttrCtnt3 = gloAttrCtnt3;
		this.gloAttrCtnt4 = gloAttrCtnt4;
		this.gloAttrCtnt5 = gloAttrCtnt5;
		this.actXchRt = actXchRt;
		this.gloAttrCtnt6 = gloAttrCtnt6;
		this.ppdAplyAmt = ppdAplyAmt;
		this.gloAttrCtnt7 = gloAttrCtnt7;
		this.gloAttrCtnt8 = gloAttrCtnt8;
		this.gloAttrCtnt9 = gloAttrCtnt9;
		this.vndrTermNm = vndrTermNm;
		this.gloAttrCtnt1 = gloAttrCtnt1;
		this.coaCtrCd = coaCtrCd;
		this.eaiEvntDt = eaiEvntDt;
		this.coaVvdCd = coaVvdCd;
		this.coaFtuN2ndCd = coaFtuN2ndCd;
		this.impErrRsn = impErrRsn;
		this.csrAmt = csrAmt;
		this.srcCtnt = srcCtnt;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("imp_err_flg", getImpErrFlg());
		this.hashColumns.put("if_dt", getIfDt());
		this.hashColumns.put("pay_dt", getPayDt());
		this.hashColumns.put("rcv_err_rsn", getRcvErrRsn());
		this.hashColumns.put("gl_dt", getGlDt());
		this.hashColumns.put("attr_ctnt10", getAttrCtnt10());
		this.hashColumns.put("csr_curr_cd", getCsrCurrCd());
		this.hashColumns.put("attr_ctnt14", getAttrCtnt14());
		this.hashColumns.put("coa_rgn_cd", getCoaRgnCd());
		this.hashColumns.put("attr_ctnt13", getAttrCtnt13());
		this.hashColumns.put("ppd_no", getPpdNo());
		this.hashColumns.put("attr_ctnt12", getAttrCtnt12());
		this.hashColumns.put("attr_ctnt11", getAttrCtnt11());
		this.hashColumns.put("ppd_dtrb_no", getPpdDtrbNo());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("attr_ctnt15", getAttrCtnt15());
		this.hashColumns.put("inv_desc", getInvDesc());
		this.hashColumns.put("vndr_no", getVndrNo());
		this.hashColumns.put("pay_amt", getPayAmt());
		this.hashColumns.put("ppd_gl_dt", getPpdGlDt());
		this.hashColumns.put("ftu_use_ctnt2", getFtuUseCtnt2());
		this.hashColumns.put("ftu_use_ctnt1", getFtuUseCtnt1());
		this.hashColumns.put("usr_eml", getUsrEml());
		this.hashColumns.put("estm_err_rsn", getEstmErrRsn());
		this.hashColumns.put("apro_flg", getAproFlg());
		this.hashColumns.put("ftu_use_ctnt5", getFtuUseCtnt5());
		this.hashColumns.put("attr_cate_nm", getAttrCateNm());
		this.hashColumns.put("csr_tp_cd", getCsrTpCd());
		this.hashColumns.put("ftu_use_ctnt4", getFtuUseCtnt4());
		this.hashColumns.put("ftu_use_ctnt3", getFtuUseCtnt3());
		this.hashColumns.put("inv_dt", getInvDt());
		this.hashColumns.put("rcv_err_flg", getRcvErrFlg());
		this.hashColumns.put("csr_no", getCsrNo());
		this.hashColumns.put("pay_grp_lu_cd", getPayGrpLuCd());
		this.hashColumns.put("if_flg", getIfFlg());
		this.hashColumns.put("ppay_aply_flg", getPpayAplyFlg());
		this.hashColumns.put("coa_co_cd", getCoaCoCd());
		this.hashColumns.put("err_csr_no", getErrCsrNo());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("pay_mzd_lu_cd", getPayMzdLuCd());
		this.hashColumns.put("inv_term_dt", getInvTermDt());
		this.hashColumns.put("tax_decl_flg", getTaxDeclFlg());
		this.hashColumns.put("aft_act_flg", getAftActFlg());
		this.hashColumns.put("coa_inter_co_cd", getCoaInterCoCd());
		this.hashColumns.put("coa_acct_cd", getCoaAcctCd());
		this.hashColumns.put("glo_attr_ctnt17", getGloAttrCtnt17());
		this.hashColumns.put("glo_attr_ctnt18", getGloAttrCtnt18());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("attr_ctnt9", getAttrCtnt9());
		this.hashColumns.put("glo_attr_ctnt15", getGloAttrCtnt15());
		this.hashColumns.put("attr_ctnt8", getAttrCtnt8());
		this.hashColumns.put("glo_attr_ctnt16", getGloAttrCtnt16());
		this.hashColumns.put("glo_attr_ctnt13", getGloAttrCtnt13());
		this.hashColumns.put("glo_attr_ctnt14", getGloAttrCtnt14());
		this.hashColumns.put("glo_attr_ctnt11", getGloAttrCtnt11());
		this.hashColumns.put("if_err_rsn", getIfErrRsn());
		this.hashColumns.put("glo_attr_ctnt12", getGloAttrCtnt12());
		this.hashColumns.put("glo_attr_ctnt10", getGloAttrCtnt10());
		this.hashColumns.put("attr_ctnt1", getAttrCtnt1());
		this.hashColumns.put("tax_curr_xch_flg", getTaxCurrXchFlg());
		this.hashColumns.put("coa_ftu_n1st_cd", getCoaFtuN1stCd());
		this.hashColumns.put("attr_ctnt2", getAttrCtnt2());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("attr_ctnt3", getAttrCtnt3());
		this.hashColumns.put("attr_ctnt4", getAttrCtnt4());
		this.hashColumns.put("attr_ctnt5", getAttrCtnt5());
		this.hashColumns.put("tj_ofc_cd", getTjOfcCd());
		this.hashColumns.put("attr_ctnt6", getAttrCtnt6());
		this.hashColumns.put("attr_ctnt7", getAttrCtnt7());
		this.hashColumns.put("glo_attr_ctnt2", getGloAttrCtnt2());
		this.hashColumns.put("glo_attr_ctnt3", getGloAttrCtnt3());
		this.hashColumns.put("glo_attr_ctnt4", getGloAttrCtnt4());
		this.hashColumns.put("glo_attr_ctnt5", getGloAttrCtnt5());
		this.hashColumns.put("act_xch_rt", getActXchRt());
		this.hashColumns.put("glo_attr_ctnt6", getGloAttrCtnt6());
		this.hashColumns.put("ppd_aply_amt", getPpdAplyAmt());
		this.hashColumns.put("glo_attr_ctnt7", getGloAttrCtnt7());
		this.hashColumns.put("glo_attr_ctnt8", getGloAttrCtnt8());
		this.hashColumns.put("glo_attr_ctnt9", getGloAttrCtnt9());
		this.hashColumns.put("vndr_term_nm", getVndrTermNm());
		this.hashColumns.put("glo_attr_ctnt1", getGloAttrCtnt1());
		this.hashColumns.put("coa_ctr_cd", getCoaCtrCd());
		this.hashColumns.put("eai_evnt_dt", getEaiEvntDt());
		this.hashColumns.put("coa_vvd_cd", getCoaVvdCd());
		this.hashColumns.put("coa_ftu_n2nd_cd", getCoaFtuN2ndCd());
		this.hashColumns.put("imp_err_rsn", getImpErrRsn());
		this.hashColumns.put("csr_amt", getCsrAmt());
		this.hashColumns.put("src_ctnt", getSrcCtnt());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("imp_err_flg", "impErrFlg");
		this.hashFields.put("if_dt", "ifDt");
		this.hashFields.put("pay_dt", "payDt");
		this.hashFields.put("rcv_err_rsn", "rcvErrRsn");
		this.hashFields.put("gl_dt", "glDt");
		this.hashFields.put("attr_ctnt10", "attrCtnt10");
		this.hashFields.put("csr_curr_cd", "csrCurrCd");
		this.hashFields.put("attr_ctnt14", "attrCtnt14");
		this.hashFields.put("coa_rgn_cd", "coaRgnCd");
		this.hashFields.put("attr_ctnt13", "attrCtnt13");
		this.hashFields.put("ppd_no", "ppdNo");
		this.hashFields.put("attr_ctnt12", "attrCtnt12");
		this.hashFields.put("attr_ctnt11", "attrCtnt11");
		this.hashFields.put("ppd_dtrb_no", "ppdDtrbNo");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("attr_ctnt15", "attrCtnt15");
		this.hashFields.put("inv_desc", "invDesc");
		this.hashFields.put("vndr_no", "vndrNo");
		this.hashFields.put("pay_amt", "payAmt");
		this.hashFields.put("ppd_gl_dt", "ppdGlDt");
		this.hashFields.put("ftu_use_ctnt2", "ftuUseCtnt2");
		this.hashFields.put("ftu_use_ctnt1", "ftuUseCtnt1");
		this.hashFields.put("usr_eml", "usrEml");
		this.hashFields.put("estm_err_rsn", "estmErrRsn");
		this.hashFields.put("apro_flg", "aproFlg");
		this.hashFields.put("ftu_use_ctnt5", "ftuUseCtnt5");
		this.hashFields.put("attr_cate_nm", "attrCateNm");
		this.hashFields.put("csr_tp_cd", "csrTpCd");
		this.hashFields.put("ftu_use_ctnt4", "ftuUseCtnt4");
		this.hashFields.put("ftu_use_ctnt3", "ftuUseCtnt3");
		this.hashFields.put("inv_dt", "invDt");
		this.hashFields.put("rcv_err_flg", "rcvErrFlg");
		this.hashFields.put("csr_no", "csrNo");
		this.hashFields.put("pay_grp_lu_cd", "payGrpLuCd");
		this.hashFields.put("if_flg", "ifFlg");
		this.hashFields.put("ppay_aply_flg", "ppayAplyFlg");
		this.hashFields.put("coa_co_cd", "coaCoCd");
		this.hashFields.put("err_csr_no", "errCsrNo");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("pay_mzd_lu_cd", "payMzdLuCd");
		this.hashFields.put("inv_term_dt", "invTermDt");
		this.hashFields.put("tax_decl_flg", "taxDeclFlg");
		this.hashFields.put("aft_act_flg", "aftActFlg");
		this.hashFields.put("coa_inter_co_cd", "coaInterCoCd");
		this.hashFields.put("coa_acct_cd", "coaAcctCd");
		this.hashFields.put("glo_attr_ctnt17", "gloAttrCtnt17");
		this.hashFields.put("glo_attr_ctnt18", "gloAttrCtnt18");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("attr_ctnt9", "attrCtnt9");
		this.hashFields.put("glo_attr_ctnt15", "gloAttrCtnt15");
		this.hashFields.put("attr_ctnt8", "attrCtnt8");
		this.hashFields.put("glo_attr_ctnt16", "gloAttrCtnt16");
		this.hashFields.put("glo_attr_ctnt13", "gloAttrCtnt13");
		this.hashFields.put("glo_attr_ctnt14", "gloAttrCtnt14");
		this.hashFields.put("glo_attr_ctnt11", "gloAttrCtnt11");
		this.hashFields.put("if_err_rsn", "ifErrRsn");
		this.hashFields.put("glo_attr_ctnt12", "gloAttrCtnt12");
		this.hashFields.put("glo_attr_ctnt10", "gloAttrCtnt10");
		this.hashFields.put("attr_ctnt1", "attrCtnt1");
		this.hashFields.put("tax_curr_xch_flg", "taxCurrXchFlg");
		this.hashFields.put("coa_ftu_n1st_cd", "coaFtuN1stCd");
		this.hashFields.put("attr_ctnt2", "attrCtnt2");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("attr_ctnt3", "attrCtnt3");
		this.hashFields.put("attr_ctnt4", "attrCtnt4");
		this.hashFields.put("attr_ctnt5", "attrCtnt5");
		this.hashFields.put("tj_ofc_cd", "tjOfcCd");
		this.hashFields.put("attr_ctnt6", "attrCtnt6");
		this.hashFields.put("attr_ctnt7", "attrCtnt7");
		this.hashFields.put("glo_attr_ctnt2", "gloAttrCtnt2");
		this.hashFields.put("glo_attr_ctnt3", "gloAttrCtnt3");
		this.hashFields.put("glo_attr_ctnt4", "gloAttrCtnt4");
		this.hashFields.put("glo_attr_ctnt5", "gloAttrCtnt5");
		this.hashFields.put("act_xch_rt", "actXchRt");
		this.hashFields.put("glo_attr_ctnt6", "gloAttrCtnt6");
		this.hashFields.put("ppd_aply_amt", "ppdAplyAmt");
		this.hashFields.put("glo_attr_ctnt7", "gloAttrCtnt7");
		this.hashFields.put("glo_attr_ctnt8", "gloAttrCtnt8");
		this.hashFields.put("glo_attr_ctnt9", "gloAttrCtnt9");
		this.hashFields.put("vndr_term_nm", "vndrTermNm");
		this.hashFields.put("glo_attr_ctnt1", "gloAttrCtnt1");
		this.hashFields.put("coa_ctr_cd", "coaCtrCd");
		this.hashFields.put("eai_evnt_dt", "eaiEvntDt");
		this.hashFields.put("coa_vvd_cd", "coaVvdCd");
		this.hashFields.put("coa_ftu_n2nd_cd", "coaFtuN2ndCd");
		this.hashFields.put("imp_err_rsn", "impErrRsn");
		this.hashFields.put("csr_amt", "csrAmt");
		this.hashFields.put("src_ctnt", "srcCtnt");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return impErrFlg
	 */
	public String getImpErrFlg() {
		return this.impErrFlg;
	}
	
	/**
	 * Column Info
	 * @return ifDt
	 */
	public String getIfDt() {
		return this.ifDt;
	}
	
	/**
	 * Column Info
	 * @return payDt
	 */
	public String getPayDt() {
		return this.payDt;
	}
	
	/**
	 * Column Info
	 * @return rcvErrRsn
	 */
	public String getRcvErrRsn() {
		return this.rcvErrRsn;
	}
	
	/**
	 * Column Info
	 * @return glDt
	 */
	public String getGlDt() {
		return this.glDt;
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
	 * @return csrCurrCd
	 */
	public String getCsrCurrCd() {
		return this.csrCurrCd;
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
	 * @return coaRgnCd
	 */
	public String getCoaRgnCd() {
		return this.coaRgnCd;
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
	 * @return ppdNo
	 */
	public String getPpdNo() {
		return this.ppdNo;
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
	 * @return ppdDtrbNo
	 */
	public String getPpdDtrbNo() {
		return this.ppdDtrbNo;
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
	 * @return attrCtnt15
	 */
	public String getAttrCtnt15() {
		return this.attrCtnt15;
	}
	
	/**
	 * Column Info
	 * @return invDesc
	 */
	public String getInvDesc() {
		return this.invDesc;
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
	 * @return payAmt
	 */
	public String getPayAmt() {
		return this.payAmt;
	}
	
	/**
	 * Column Info
	 * @return ppdGlDt
	 */
	public String getPpdGlDt() {
		return this.ppdGlDt;
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
	 * @return usrEml
	 */
	public String getUsrEml() {
		return this.usrEml;
	}
	
	/**
	 * Column Info
	 * @return estmErrRsn
	 */
	public String getEstmErrRsn() {
		return this.estmErrRsn;
	}
	
	/**
	 * Column Info
	 * @return aproFlg
	 */
	public String getAproFlg() {
		return this.aproFlg;
	}
	
	/**
	 * Column Info
	 * @return ftuUseCtnt5
	 */
	public String getFtuUseCtnt5() {
		return this.ftuUseCtnt5;
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
	 * @return csrTpCd
	 */
	public String getCsrTpCd() {
		return this.csrTpCd;
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
	 * @return invDt
	 */
	public String getInvDt() {
		return this.invDt;
	}
	
	/**
	 * Column Info
	 * @return rcvErrFlg
	 */
	public String getRcvErrFlg() {
		return this.rcvErrFlg;
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
	 * @return payGrpLuCd
	 */
	public String getPayGrpLuCd() {
		return this.payGrpLuCd;
	}
	
	/**
	 * Column Info
	 * @return ifFlg
	 */
	public String getIfFlg() {
		return this.ifFlg;
	}
	
	/**
	 * Column Info
	 * @return ppayAplyFlg
	 */
	public String getPpayAplyFlg() {
		return this.ppayAplyFlg;
	}
	
	/**
	 * Column Info
	 * @return coaCoCd
	 */
	public String getCoaCoCd() {
		return this.coaCoCd;
	}
	
	/**
	 * Column Info
	 * @return errCsrNo
	 */
	public String getErrCsrNo() {
		return this.errCsrNo;
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
	 * @return payMzdLuCd
	 */
	public String getPayMzdLuCd() {
		return this.payMzdLuCd;
	}
	
	/**
	 * Column Info
	 * @return invTermDt
	 */
	public String getInvTermDt() {
		return this.invTermDt;
	}
	
	/**
	 * Column Info
	 * @return taxDeclFlg
	 */
	public String getTaxDeclFlg() {
		return this.taxDeclFlg;
	}
	
	/**
	 * Column Info
	 * @return aftActFlg
	 */
	public String getAftActFlg() {
		return this.aftActFlg;
	}
	
	/**
	 * Column Info
	 * @return coaInterCoCd
	 */
	public String getCoaInterCoCd() {
		return this.coaInterCoCd;
	}
	
	/**
	 * Column Info
	 * @return coaAcctCd
	 */
	public String getCoaAcctCd() {
		return this.coaAcctCd;
	}
	
	/**
	 * Column Info
	 * @return gloAttrCtnt17
	 */
	public String getGloAttrCtnt17() {
		return this.gloAttrCtnt17;
	}
	
	/**
	 * Column Info
	 * @return gloAttrCtnt18
	 */
	public String getGloAttrCtnt18() {
		return this.gloAttrCtnt18;
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
	 * @return attrCtnt9
	 */
	public String getAttrCtnt9() {
		return this.attrCtnt9;
	}
	
	/**
	 * Column Info
	 * @return gloAttrCtnt15
	 */
	public String getGloAttrCtnt15() {
		return this.gloAttrCtnt15;
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
	 * @return gloAttrCtnt16
	 */
	public String getGloAttrCtnt16() {
		return this.gloAttrCtnt16;
	}
	
	/**
	 * Column Info
	 * @return gloAttrCtnt13
	 */
	public String getGloAttrCtnt13() {
		return this.gloAttrCtnt13;
	}
	
	/**
	 * Column Info
	 * @return gloAttrCtnt14
	 */
	public String getGloAttrCtnt14() {
		return this.gloAttrCtnt14;
	}
	
	/**
	 * Column Info
	 * @return gloAttrCtnt11
	 */
	public String getGloAttrCtnt11() {
		return this.gloAttrCtnt11;
	}
	
	/**
	 * Column Info
	 * @return ifErrRsn
	 */
	public String getIfErrRsn() {
		return this.ifErrRsn;
	}
	
	/**
	 * Column Info
	 * @return gloAttrCtnt12
	 */
	public String getGloAttrCtnt12() {
		return this.gloAttrCtnt12;
	}
	
	/**
	 * Column Info
	 * @return gloAttrCtnt10
	 */
	public String getGloAttrCtnt10() {
		return this.gloAttrCtnt10;
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
	 * @return taxCurrXchFlg
	 */
	public String getTaxCurrXchFlg() {
		return this.taxCurrXchFlg;
	}
	
	/**
	 * Column Info
	 * @return coaFtuN1stCd
	 */
	public String getCoaFtuN1stCd() {
		return this.coaFtuN1stCd;
	}
	
	/**
	 * Column Info
	 * @return attrCtnt2
	 */
	public String getAttrCtnt2() {
		return this.attrCtnt2;
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
	 * @return tjOfcCd
	 */
	public String getTjOfcCd() {
		return this.tjOfcCd;
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
	 * @return attrCtnt7
	 */
	public String getAttrCtnt7() {
		return this.attrCtnt7;
	}
	
	/**
	 * Column Info
	 * @return gloAttrCtnt2
	 */
	public String getGloAttrCtnt2() {
		return this.gloAttrCtnt2;
	}
	
	/**
	 * Column Info
	 * @return gloAttrCtnt3
	 */
	public String getGloAttrCtnt3() {
		return this.gloAttrCtnt3;
	}
	
	/**
	 * Column Info
	 * @return gloAttrCtnt4
	 */
	public String getGloAttrCtnt4() {
		return this.gloAttrCtnt4;
	}
	
	/**
	 * Column Info
	 * @return gloAttrCtnt5
	 */
	public String getGloAttrCtnt5() {
		return this.gloAttrCtnt5;
	}
	
	/**
	 * Column Info
	 * @return actXchRt
	 */
	public String getActXchRt() {
		return this.actXchRt;
	}
	
	/**
	 * Column Info
	 * @return gloAttrCtnt6
	 */
	public String getGloAttrCtnt6() {
		return this.gloAttrCtnt6;
	}
	
	/**
	 * Column Info
	 * @return ppdAplyAmt
	 */
	public String getPpdAplyAmt() {
		return this.ppdAplyAmt;
	}
	
	/**
	 * Column Info
	 * @return gloAttrCtnt7
	 */
	public String getGloAttrCtnt7() {
		return this.gloAttrCtnt7;
	}
	
	/**
	 * Column Info
	 * @return gloAttrCtnt8
	 */
	public String getGloAttrCtnt8() {
		return this.gloAttrCtnt8;
	}
	
	/**
	 * Column Info
	 * @return gloAttrCtnt9
	 */
	public String getGloAttrCtnt9() {
		return this.gloAttrCtnt9;
	}
	
	/**
	 * Column Info
	 * @return vndrTermNm
	 */
	public String getVndrTermNm() {
		return this.vndrTermNm;
	}
	
	/**
	 * Column Info
	 * @return gloAttrCtnt1
	 */
	public String getGloAttrCtnt1() {
		return this.gloAttrCtnt1;
	}
	
	/**
	 * Column Info
	 * @return coaCtrCd
	 */
	public String getCoaCtrCd() {
		return this.coaCtrCd;
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
	 * @return coaVvdCd
	 */
	public String getCoaVvdCd() {
		return this.coaVvdCd;
	}
	
	/**
	 * Column Info
	 * @return coaFtuN2ndCd
	 */
	public String getCoaFtuN2ndCd() {
		return this.coaFtuN2ndCd;
	}
	
	/**
	 * Column Info
	 * @return impErrRsn
	 */
	public String getImpErrRsn() {
		return this.impErrRsn;
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
	 * @return srcCtnt
	 */
	public String getSrcCtnt() {
		return this.srcCtnt;
	}
	

	/**
	 * Column Info
	 * @param impErrFlg
	 */
	public void setImpErrFlg(String impErrFlg) {
		this.impErrFlg = impErrFlg;
	}
	
	/**
	 * Column Info
	 * @param ifDt
	 */
	public void setIfDt(String ifDt) {
		this.ifDt = ifDt;
	}
	
	/**
	 * Column Info
	 * @param payDt
	 */
	public void setPayDt(String payDt) {
		this.payDt = payDt;
	}
	
	/**
	 * Column Info
	 * @param rcvErrRsn
	 */
	public void setRcvErrRsn(String rcvErrRsn) {
		this.rcvErrRsn = rcvErrRsn;
	}
	
	/**
	 * Column Info
	 * @param glDt
	 */
	public void setGlDt(String glDt) {
		this.glDt = glDt;
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
	 * @param csrCurrCd
	 */
	public void setCsrCurrCd(String csrCurrCd) {
		this.csrCurrCd = csrCurrCd;
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
	 * @param coaRgnCd
	 */
	public void setCoaRgnCd(String coaRgnCd) {
		this.coaRgnCd = coaRgnCd;
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
	 * @param ppdNo
	 */
	public void setPpdNo(String ppdNo) {
		this.ppdNo = ppdNo;
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
	 * @param ppdDtrbNo
	 */
	public void setPpdDtrbNo(String ppdDtrbNo) {
		this.ppdDtrbNo = ppdDtrbNo;
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
	 * @param attrCtnt15
	 */
	public void setAttrCtnt15(String attrCtnt15) {
		this.attrCtnt15 = attrCtnt15;
	}
	
	/**
	 * Column Info
	 * @param invDesc
	 */
	public void setInvDesc(String invDesc) {
		this.invDesc = invDesc;
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
	 * @param payAmt
	 */
	public void setPayAmt(String payAmt) {
		this.payAmt = payAmt;
	}
	
	/**
	 * Column Info
	 * @param ppdGlDt
	 */
	public void setPpdGlDt(String ppdGlDt) {
		this.ppdGlDt = ppdGlDt;
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
	 * @param usrEml
	 */
	public void setUsrEml(String usrEml) {
		this.usrEml = usrEml;
	}
	
	/**
	 * Column Info
	 * @param estmErrRsn
	 */
	public void setEstmErrRsn(String estmErrRsn) {
		this.estmErrRsn = estmErrRsn;
	}
	
	/**
	 * Column Info
	 * @param aproFlg
	 */
	public void setAproFlg(String aproFlg) {
		this.aproFlg = aproFlg;
	}
	
	/**
	 * Column Info
	 * @param ftuUseCtnt5
	 */
	public void setFtuUseCtnt5(String ftuUseCtnt5) {
		this.ftuUseCtnt5 = ftuUseCtnt5;
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
	 * @param csrTpCd
	 */
	public void setCsrTpCd(String csrTpCd) {
		this.csrTpCd = csrTpCd;
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
	 * @param invDt
	 */
	public void setInvDt(String invDt) {
		this.invDt = invDt;
	}
	
	/**
	 * Column Info
	 * @param rcvErrFlg
	 */
	public void setRcvErrFlg(String rcvErrFlg) {
		this.rcvErrFlg = rcvErrFlg;
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
	 * @param payGrpLuCd
	 */
	public void setPayGrpLuCd(String payGrpLuCd) {
		this.payGrpLuCd = payGrpLuCd;
	}
	
	/**
	 * Column Info
	 * @param ifFlg
	 */
	public void setIfFlg(String ifFlg) {
		this.ifFlg = ifFlg;
	}
	
	/**
	 * Column Info
	 * @param ppayAplyFlg
	 */
	public void setPpayAplyFlg(String ppayAplyFlg) {
		this.ppayAplyFlg = ppayAplyFlg;
	}
	
	/**
	 * Column Info
	 * @param coaCoCd
	 */
	public void setCoaCoCd(String coaCoCd) {
		this.coaCoCd = coaCoCd;
	}
	
	/**
	 * Column Info
	 * @param errCsrNo
	 */
	public void setErrCsrNo(String errCsrNo) {
		this.errCsrNo = errCsrNo;
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
	 * @param payMzdLuCd
	 */
	public void setPayMzdLuCd(String payMzdLuCd) {
		this.payMzdLuCd = payMzdLuCd;
	}
	
	/**
	 * Column Info
	 * @param invTermDt
	 */
	public void setInvTermDt(String invTermDt) {
		this.invTermDt = invTermDt;
	}
	
	/**
	 * Column Info
	 * @param taxDeclFlg
	 */
	public void setTaxDeclFlg(String taxDeclFlg) {
		this.taxDeclFlg = taxDeclFlg;
	}
	
	/**
	 * Column Info
	 * @param aftActFlg
	 */
	public void setAftActFlg(String aftActFlg) {
		this.aftActFlg = aftActFlg;
	}
	
	/**
	 * Column Info
	 * @param coaInterCoCd
	 */
	public void setCoaInterCoCd(String coaInterCoCd) {
		this.coaInterCoCd = coaInterCoCd;
	}
	
	/**
	 * Column Info
	 * @param coaAcctCd
	 */
	public void setCoaAcctCd(String coaAcctCd) {
		this.coaAcctCd = coaAcctCd;
	}
	
	/**
	 * Column Info
	 * @param gloAttrCtnt17
	 */
	public void setGloAttrCtnt17(String gloAttrCtnt17) {
		this.gloAttrCtnt17 = gloAttrCtnt17;
	}
	
	/**
	 * Column Info
	 * @param gloAttrCtnt18
	 */
	public void setGloAttrCtnt18(String gloAttrCtnt18) {
		this.gloAttrCtnt18 = gloAttrCtnt18;
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
	 * @param attrCtnt9
	 */
	public void setAttrCtnt9(String attrCtnt9) {
		this.attrCtnt9 = attrCtnt9;
	}
	
	/**
	 * Column Info
	 * @param gloAttrCtnt15
	 */
	public void setGloAttrCtnt15(String gloAttrCtnt15) {
		this.gloAttrCtnt15 = gloAttrCtnt15;
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
	 * @param gloAttrCtnt16
	 */
	public void setGloAttrCtnt16(String gloAttrCtnt16) {
		this.gloAttrCtnt16 = gloAttrCtnt16;
	}
	
	/**
	 * Column Info
	 * @param gloAttrCtnt13
	 */
	public void setGloAttrCtnt13(String gloAttrCtnt13) {
		this.gloAttrCtnt13 = gloAttrCtnt13;
	}
	
	/**
	 * Column Info
	 * @param gloAttrCtnt14
	 */
	public void setGloAttrCtnt14(String gloAttrCtnt14) {
		this.gloAttrCtnt14 = gloAttrCtnt14;
	}
	
	/**
	 * Column Info
	 * @param gloAttrCtnt11
	 */
	public void setGloAttrCtnt11(String gloAttrCtnt11) {
		this.gloAttrCtnt11 = gloAttrCtnt11;
	}
	
	/**
	 * Column Info
	 * @param ifErrRsn
	 */
	public void setIfErrRsn(String ifErrRsn) {
		this.ifErrRsn = ifErrRsn;
	}
	
	/**
	 * Column Info
	 * @param gloAttrCtnt12
	 */
	public void setGloAttrCtnt12(String gloAttrCtnt12) {
		this.gloAttrCtnt12 = gloAttrCtnt12;
	}
	
	/**
	 * Column Info
	 * @param gloAttrCtnt10
	 */
	public void setGloAttrCtnt10(String gloAttrCtnt10) {
		this.gloAttrCtnt10 = gloAttrCtnt10;
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
	 * @param taxCurrXchFlg
	 */
	public void setTaxCurrXchFlg(String taxCurrXchFlg) {
		this.taxCurrXchFlg = taxCurrXchFlg;
	}
	
	/**
	 * Column Info
	 * @param coaFtuN1stCd
	 */
	public void setCoaFtuN1stCd(String coaFtuN1stCd) {
		this.coaFtuN1stCd = coaFtuN1stCd;
	}
	
	/**
	 * Column Info
	 * @param attrCtnt2
	 */
	public void setAttrCtnt2(String attrCtnt2) {
		this.attrCtnt2 = attrCtnt2;
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
	 * @param tjOfcCd
	 */
	public void setTjOfcCd(String tjOfcCd) {
		this.tjOfcCd = tjOfcCd;
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
	 * @param attrCtnt7
	 */
	public void setAttrCtnt7(String attrCtnt7) {
		this.attrCtnt7 = attrCtnt7;
	}
	
	/**
	 * Column Info
	 * @param gloAttrCtnt2
	 */
	public void setGloAttrCtnt2(String gloAttrCtnt2) {
		this.gloAttrCtnt2 = gloAttrCtnt2;
	}
	
	/**
	 * Column Info
	 * @param gloAttrCtnt3
	 */
	public void setGloAttrCtnt3(String gloAttrCtnt3) {
		this.gloAttrCtnt3 = gloAttrCtnt3;
	}
	
	/**
	 * Column Info
	 * @param gloAttrCtnt4
	 */
	public void setGloAttrCtnt4(String gloAttrCtnt4) {
		this.gloAttrCtnt4 = gloAttrCtnt4;
	}
	
	/**
	 * Column Info
	 * @param gloAttrCtnt5
	 */
	public void setGloAttrCtnt5(String gloAttrCtnt5) {
		this.gloAttrCtnt5 = gloAttrCtnt5;
	}
	
	/**
	 * Column Info
	 * @param actXchRt
	 */
	public void setActXchRt(String actXchRt) {
		this.actXchRt = actXchRt;
	}
	
	/**
	 * Column Info
	 * @param gloAttrCtnt6
	 */
	public void setGloAttrCtnt6(String gloAttrCtnt6) {
		this.gloAttrCtnt6 = gloAttrCtnt6;
	}
	
	/**
	 * Column Info
	 * @param ppdAplyAmt
	 */
	public void setPpdAplyAmt(String ppdAplyAmt) {
		this.ppdAplyAmt = ppdAplyAmt;
	}
	
	/**
	 * Column Info
	 * @param gloAttrCtnt7
	 */
	public void setGloAttrCtnt7(String gloAttrCtnt7) {
		this.gloAttrCtnt7 = gloAttrCtnt7;
	}
	
	/**
	 * Column Info
	 * @param gloAttrCtnt8
	 */
	public void setGloAttrCtnt8(String gloAttrCtnt8) {
		this.gloAttrCtnt8 = gloAttrCtnt8;
	}
	
	/**
	 * Column Info
	 * @param gloAttrCtnt9
	 */
	public void setGloAttrCtnt9(String gloAttrCtnt9) {
		this.gloAttrCtnt9 = gloAttrCtnt9;
	}
	
	/**
	 * Column Info
	 * @param vndrTermNm
	 */
	public void setVndrTermNm(String vndrTermNm) {
		this.vndrTermNm = vndrTermNm;
	}
	
	/**
	 * Column Info
	 * @param gloAttrCtnt1
	 */
	public void setGloAttrCtnt1(String gloAttrCtnt1) {
		this.gloAttrCtnt1 = gloAttrCtnt1;
	}
	
	/**
	 * Column Info
	 * @param coaCtrCd
	 */
	public void setCoaCtrCd(String coaCtrCd) {
		this.coaCtrCd = coaCtrCd;
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
	 * @param coaVvdCd
	 */
	public void setCoaVvdCd(String coaVvdCd) {
		this.coaVvdCd = coaVvdCd;
	}
	
	/**
	 * Column Info
	 * @param coaFtuN2ndCd
	 */
	public void setCoaFtuN2ndCd(String coaFtuN2ndCd) {
		this.coaFtuN2ndCd = coaFtuN2ndCd;
	}
	
	/**
	 * Column Info
	 * @param impErrRsn
	 */
	public void setImpErrRsn(String impErrRsn) {
		this.impErrRsn = impErrRsn;
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
	 * @param srcCtnt
	 */
	public void setSrcCtnt(String srcCtnt) {
		this.srcCtnt = srcCtnt;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setImpErrFlg(JSPUtil.getParameter(request, "imp_err_flg", ""));
		setIfDt(JSPUtil.getParameter(request, "if_dt", ""));
		setPayDt(JSPUtil.getParameter(request, "pay_dt", ""));
		setRcvErrRsn(JSPUtil.getParameter(request, "rcv_err_rsn", ""));
		setGlDt(JSPUtil.getParameter(request, "gl_dt", ""));
		setAttrCtnt10(JSPUtil.getParameter(request, "attr_ctnt10", ""));
		setCsrCurrCd(JSPUtil.getParameter(request, "csr_curr_cd", ""));
		setAttrCtnt14(JSPUtil.getParameter(request, "attr_ctnt14", ""));
		setCoaRgnCd(JSPUtil.getParameter(request, "coa_rgn_cd", ""));
		setAttrCtnt13(JSPUtil.getParameter(request, "attr_ctnt13", ""));
		setPpdNo(JSPUtil.getParameter(request, "ppd_no", ""));
		setAttrCtnt12(JSPUtil.getParameter(request, "attr_ctnt12", ""));
		setAttrCtnt11(JSPUtil.getParameter(request, "attr_ctnt11", ""));
		setPpdDtrbNo(JSPUtil.getParameter(request, "ppd_dtrb_no", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setAttrCtnt15(JSPUtil.getParameter(request, "attr_ctnt15", ""));
		setInvDesc(JSPUtil.getParameter(request, "inv_desc", ""));
		setVndrNo(JSPUtil.getParameter(request, "vndr_no", ""));
		setPayAmt(JSPUtil.getParameter(request, "pay_amt", ""));
		setPpdGlDt(JSPUtil.getParameter(request, "ppd_gl_dt", ""));
		setFtuUseCtnt2(JSPUtil.getParameter(request, "ftu_use_ctnt2", ""));
		setFtuUseCtnt1(JSPUtil.getParameter(request, "ftu_use_ctnt1", ""));
		setUsrEml(JSPUtil.getParameter(request, "usr_eml", ""));
		setEstmErrRsn(JSPUtil.getParameter(request, "estm_err_rsn", ""));
		setAproFlg(JSPUtil.getParameter(request, "apro_flg", ""));
		setFtuUseCtnt5(JSPUtil.getParameter(request, "ftu_use_ctnt5", ""));
		setAttrCateNm(JSPUtil.getParameter(request, "attr_cate_nm", ""));
		setCsrTpCd(JSPUtil.getParameter(request, "csr_tp_cd", ""));
		setFtuUseCtnt4(JSPUtil.getParameter(request, "ftu_use_ctnt4", ""));
		setFtuUseCtnt3(JSPUtil.getParameter(request, "ftu_use_ctnt3", ""));
		setInvDt(JSPUtil.getParameter(request, "inv_dt", ""));
		setRcvErrFlg(JSPUtil.getParameter(request, "rcv_err_flg", ""));
		setCsrNo(JSPUtil.getParameter(request, "csr_no", ""));
		setPayGrpLuCd(JSPUtil.getParameter(request, "pay_grp_lu_cd", ""));
		setIfFlg(JSPUtil.getParameter(request, "if_flg", ""));
		setPpayAplyFlg(JSPUtil.getParameter(request, "ppay_aply_flg", ""));
		setCoaCoCd(JSPUtil.getParameter(request, "coa_co_cd", ""));
		setErrCsrNo(JSPUtil.getParameter(request, "err_csr_no", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setPayMzdLuCd(JSPUtil.getParameter(request, "pay_mzd_lu_cd", ""));
		setInvTermDt(JSPUtil.getParameter(request, "inv_term_dt", ""));
		setTaxDeclFlg(JSPUtil.getParameter(request, "tax_decl_flg", ""));
		setAftActFlg(JSPUtil.getParameter(request, "aft_act_flg", ""));
		setCoaInterCoCd(JSPUtil.getParameter(request, "coa_inter_co_cd", ""));
		setCoaAcctCd(JSPUtil.getParameter(request, "coa_acct_cd", ""));
		setGloAttrCtnt17(JSPUtil.getParameter(request, "glo_attr_ctnt17", ""));
		setGloAttrCtnt18(JSPUtil.getParameter(request, "glo_attr_ctnt18", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setAttrCtnt9(JSPUtil.getParameter(request, "attr_ctnt9", ""));
		setGloAttrCtnt15(JSPUtil.getParameter(request, "glo_attr_ctnt15", ""));
		setAttrCtnt8(JSPUtil.getParameter(request, "attr_ctnt8", ""));
		setGloAttrCtnt16(JSPUtil.getParameter(request, "glo_attr_ctnt16", ""));
		setGloAttrCtnt13(JSPUtil.getParameter(request, "glo_attr_ctnt13", ""));
		setGloAttrCtnt14(JSPUtil.getParameter(request, "glo_attr_ctnt14", ""));
		setGloAttrCtnt11(JSPUtil.getParameter(request, "glo_attr_ctnt11", ""));
		setIfErrRsn(JSPUtil.getParameter(request, "if_err_rsn", ""));
		setGloAttrCtnt12(JSPUtil.getParameter(request, "glo_attr_ctnt12", ""));
		setGloAttrCtnt10(JSPUtil.getParameter(request, "glo_attr_ctnt10", ""));
		setAttrCtnt1(JSPUtil.getParameter(request, "attr_ctnt1", ""));
		setTaxCurrXchFlg(JSPUtil.getParameter(request, "tax_curr_xch_flg", ""));
		setCoaFtuN1stCd(JSPUtil.getParameter(request, "coa_ftu_n1st_cd", ""));
		setAttrCtnt2(JSPUtil.getParameter(request, "attr_ctnt2", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setAttrCtnt3(JSPUtil.getParameter(request, "attr_ctnt3", ""));
		setAttrCtnt4(JSPUtil.getParameter(request, "attr_ctnt4", ""));
		setAttrCtnt5(JSPUtil.getParameter(request, "attr_ctnt5", ""));
		setTjOfcCd(JSPUtil.getParameter(request, "tj_ofc_cd", ""));
		setAttrCtnt6(JSPUtil.getParameter(request, "attr_ctnt6", ""));
		setAttrCtnt7(JSPUtil.getParameter(request, "attr_ctnt7", ""));
		setGloAttrCtnt2(JSPUtil.getParameter(request, "glo_attr_ctnt2", ""));
		setGloAttrCtnt3(JSPUtil.getParameter(request, "glo_attr_ctnt3", ""));
		setGloAttrCtnt4(JSPUtil.getParameter(request, "glo_attr_ctnt4", ""));
		setGloAttrCtnt5(JSPUtil.getParameter(request, "glo_attr_ctnt5", ""));
		setActXchRt(JSPUtil.getParameter(request, "act_xch_rt", ""));
		setGloAttrCtnt6(JSPUtil.getParameter(request, "glo_attr_ctnt6", ""));
		setPpdAplyAmt(JSPUtil.getParameter(request, "ppd_aply_amt", ""));
		setGloAttrCtnt7(JSPUtil.getParameter(request, "glo_attr_ctnt7", ""));
		setGloAttrCtnt8(JSPUtil.getParameter(request, "glo_attr_ctnt8", ""));
		setGloAttrCtnt9(JSPUtil.getParameter(request, "glo_attr_ctnt9", ""));
		setVndrTermNm(JSPUtil.getParameter(request, "vndr_term_nm", ""));
		setGloAttrCtnt1(JSPUtil.getParameter(request, "glo_attr_ctnt1", ""));
		setCoaCtrCd(JSPUtil.getParameter(request, "coa_ctr_cd", ""));
		setEaiEvntDt(JSPUtil.getParameter(request, "eai_evnt_dt", ""));
		setCoaVvdCd(JSPUtil.getParameter(request, "coa_vvd_cd", ""));
		setCoaFtuN2ndCd(JSPUtil.getParameter(request, "coa_ftu_n2nd_cd", ""));
		setImpErrRsn(JSPUtil.getParameter(request, "imp_err_rsn", ""));
		setCsrAmt(JSPUtil.getParameter(request, "csr_amt", ""));
		setSrcCtnt(JSPUtil.getParameter(request, "src_ctnt", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return ApInvHdrVO[]
	 */
	public ApInvHdrVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return ApInvHdrVO[]
	 */
	public ApInvHdrVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		ApInvHdrVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] impErrFlg = (JSPUtil.getParameter(request, prefix	+ "imp_err_flg", length));
			String[] ifDt = (JSPUtil.getParameter(request, prefix	+ "if_dt", length));
			String[] payDt = (JSPUtil.getParameter(request, prefix	+ "pay_dt", length));
			String[] rcvErrRsn = (JSPUtil.getParameter(request, prefix	+ "rcv_err_rsn", length));
			String[] glDt = (JSPUtil.getParameter(request, prefix	+ "gl_dt", length));
			String[] attrCtnt10 = (JSPUtil.getParameter(request, prefix	+ "attr_ctnt10", length));
			String[] csrCurrCd = (JSPUtil.getParameter(request, prefix	+ "csr_curr_cd", length));
			String[] attrCtnt14 = (JSPUtil.getParameter(request, prefix	+ "attr_ctnt14", length));
			String[] coaRgnCd = (JSPUtil.getParameter(request, prefix	+ "coa_rgn_cd", length));
			String[] attrCtnt13 = (JSPUtil.getParameter(request, prefix	+ "attr_ctnt13", length));
			String[] ppdNo = (JSPUtil.getParameter(request, prefix	+ "ppd_no", length));
			String[] attrCtnt12 = (JSPUtil.getParameter(request, prefix	+ "attr_ctnt12", length));
			String[] attrCtnt11 = (JSPUtil.getParameter(request, prefix	+ "attr_ctnt11", length));
			String[] ppdDtrbNo = (JSPUtil.getParameter(request, prefix	+ "ppd_dtrb_no", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] attrCtnt15 = (JSPUtil.getParameter(request, prefix	+ "attr_ctnt15", length));
			String[] invDesc = (JSPUtil.getParameter(request, prefix	+ "inv_desc", length));
			String[] vndrNo = (JSPUtil.getParameter(request, prefix	+ "vndr_no", length));
			String[] payAmt = (JSPUtil.getParameter(request, prefix	+ "pay_amt", length));
			String[] ppdGlDt = (JSPUtil.getParameter(request, prefix	+ "ppd_gl_dt", length));
			String[] ftuUseCtnt2 = (JSPUtil.getParameter(request, prefix	+ "ftu_use_ctnt2", length));
			String[] ftuUseCtnt1 = (JSPUtil.getParameter(request, prefix	+ "ftu_use_ctnt1", length));
			String[] usrEml = (JSPUtil.getParameter(request, prefix	+ "usr_eml", length));
			String[] estmErrRsn = (JSPUtil.getParameter(request, prefix	+ "estm_err_rsn", length));
			String[] aproFlg = (JSPUtil.getParameter(request, prefix	+ "apro_flg", length));
			String[] ftuUseCtnt5 = (JSPUtil.getParameter(request, prefix	+ "ftu_use_ctnt5", length));
			String[] attrCateNm = (JSPUtil.getParameter(request, prefix	+ "attr_cate_nm", length));
			String[] csrTpCd = (JSPUtil.getParameter(request, prefix	+ "csr_tp_cd", length));
			String[] ftuUseCtnt4 = (JSPUtil.getParameter(request, prefix	+ "ftu_use_ctnt4", length));
			String[] ftuUseCtnt3 = (JSPUtil.getParameter(request, prefix	+ "ftu_use_ctnt3", length));
			String[] invDt = (JSPUtil.getParameter(request, prefix	+ "inv_dt", length));
			String[] rcvErrFlg = (JSPUtil.getParameter(request, prefix	+ "rcv_err_flg", length));
			String[] csrNo = (JSPUtil.getParameter(request, prefix	+ "csr_no", length));
			String[] payGrpLuCd = (JSPUtil.getParameter(request, prefix	+ "pay_grp_lu_cd", length));
			String[] ifFlg = (JSPUtil.getParameter(request, prefix	+ "if_flg", length));
			String[] ppayAplyFlg = (JSPUtil.getParameter(request, prefix	+ "ppay_aply_flg", length));
			String[] coaCoCd = (JSPUtil.getParameter(request, prefix	+ "coa_co_cd", length));
			String[] errCsrNo = (JSPUtil.getParameter(request, prefix	+ "err_csr_no", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] payMzdLuCd = (JSPUtil.getParameter(request, prefix	+ "pay_mzd_lu_cd", length));
			String[] invTermDt = (JSPUtil.getParameter(request, prefix	+ "inv_term_dt", length));
			String[] taxDeclFlg = (JSPUtil.getParameter(request, prefix	+ "tax_decl_flg", length));
			String[] aftActFlg = (JSPUtil.getParameter(request, prefix	+ "aft_act_flg", length));
			String[] coaInterCoCd = (JSPUtil.getParameter(request, prefix	+ "coa_inter_co_cd", length));
			String[] coaAcctCd = (JSPUtil.getParameter(request, prefix	+ "coa_acct_cd", length));
			String[] gloAttrCtnt17 = (JSPUtil.getParameter(request, prefix	+ "glo_attr_ctnt17", length));
			String[] gloAttrCtnt18 = (JSPUtil.getParameter(request, prefix	+ "glo_attr_ctnt18", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] attrCtnt9 = (JSPUtil.getParameter(request, prefix	+ "attr_ctnt9", length));
			String[] gloAttrCtnt15 = (JSPUtil.getParameter(request, prefix	+ "glo_attr_ctnt15", length));
			String[] attrCtnt8 = (JSPUtil.getParameter(request, prefix	+ "attr_ctnt8", length));
			String[] gloAttrCtnt16 = (JSPUtil.getParameter(request, prefix	+ "glo_attr_ctnt16", length));
			String[] gloAttrCtnt13 = (JSPUtil.getParameter(request, prefix	+ "glo_attr_ctnt13", length));
			String[] gloAttrCtnt14 = (JSPUtil.getParameter(request, prefix	+ "glo_attr_ctnt14", length));
			String[] gloAttrCtnt11 = (JSPUtil.getParameter(request, prefix	+ "glo_attr_ctnt11", length));
			String[] ifErrRsn = (JSPUtil.getParameter(request, prefix	+ "if_err_rsn", length));
			String[] gloAttrCtnt12 = (JSPUtil.getParameter(request, prefix	+ "glo_attr_ctnt12", length));
			String[] gloAttrCtnt10 = (JSPUtil.getParameter(request, prefix	+ "glo_attr_ctnt10", length));
			String[] attrCtnt1 = (JSPUtil.getParameter(request, prefix	+ "attr_ctnt1", length));
			String[] taxCurrXchFlg = (JSPUtil.getParameter(request, prefix	+ "tax_curr_xch_flg", length));
			String[] coaFtuN1stCd = (JSPUtil.getParameter(request, prefix	+ "coa_ftu_n1st_cd", length));
			String[] attrCtnt2 = (JSPUtil.getParameter(request, prefix	+ "attr_ctnt2", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] attrCtnt3 = (JSPUtil.getParameter(request, prefix	+ "attr_ctnt3", length));
			String[] attrCtnt4 = (JSPUtil.getParameter(request, prefix	+ "attr_ctnt4", length));
			String[] attrCtnt5 = (JSPUtil.getParameter(request, prefix	+ "attr_ctnt5", length));
			String[] tjOfcCd = (JSPUtil.getParameter(request, prefix	+ "tj_ofc_cd", length));
			String[] attrCtnt6 = (JSPUtil.getParameter(request, prefix	+ "attr_ctnt6", length));
			String[] attrCtnt7 = (JSPUtil.getParameter(request, prefix	+ "attr_ctnt7", length));
			String[] gloAttrCtnt2 = (JSPUtil.getParameter(request, prefix	+ "glo_attr_ctnt2", length));
			String[] gloAttrCtnt3 = (JSPUtil.getParameter(request, prefix	+ "glo_attr_ctnt3", length));
			String[] gloAttrCtnt4 = (JSPUtil.getParameter(request, prefix	+ "glo_attr_ctnt4", length));
			String[] gloAttrCtnt5 = (JSPUtil.getParameter(request, prefix	+ "glo_attr_ctnt5", length));
			String[] actXchRt = (JSPUtil.getParameter(request, prefix	+ "act_xch_rt", length));
			String[] gloAttrCtnt6 = (JSPUtil.getParameter(request, prefix	+ "glo_attr_ctnt6", length));
			String[] ppdAplyAmt = (JSPUtil.getParameter(request, prefix	+ "ppd_aply_amt", length));
			String[] gloAttrCtnt7 = (JSPUtil.getParameter(request, prefix	+ "glo_attr_ctnt7", length));
			String[] gloAttrCtnt8 = (JSPUtil.getParameter(request, prefix	+ "glo_attr_ctnt8", length));
			String[] gloAttrCtnt9 = (JSPUtil.getParameter(request, prefix	+ "glo_attr_ctnt9", length));
			String[] vndrTermNm = (JSPUtil.getParameter(request, prefix	+ "vndr_term_nm", length));
			String[] gloAttrCtnt1 = (JSPUtil.getParameter(request, prefix	+ "glo_attr_ctnt1", length));
			String[] coaCtrCd = (JSPUtil.getParameter(request, prefix	+ "coa_ctr_cd", length));
			String[] eaiEvntDt = (JSPUtil.getParameter(request, prefix	+ "eai_evnt_dt", length));
			String[] coaVvdCd = (JSPUtil.getParameter(request, prefix	+ "coa_vvd_cd", length));
			String[] coaFtuN2ndCd = (JSPUtil.getParameter(request, prefix	+ "coa_ftu_n2nd_cd", length));
			String[] impErrRsn = (JSPUtil.getParameter(request, prefix	+ "imp_err_rsn", length));
			String[] csrAmt = (JSPUtil.getParameter(request, prefix	+ "csr_amt", length));
			String[] srcCtnt = (JSPUtil.getParameter(request, prefix	+ "src_ctnt", length));
			
			for (int i = 0; i < length; i++) {
				model = new ApInvHdrVO();
				if (impErrFlg[i] != null)
					model.setImpErrFlg(impErrFlg[i]);
				if (ifDt[i] != null)
					model.setIfDt(ifDt[i]);
				if (payDt[i] != null)
					model.setPayDt(payDt[i]);
				if (rcvErrRsn[i] != null)
					model.setRcvErrRsn(rcvErrRsn[i]);
				if (glDt[i] != null)
					model.setGlDt(glDt[i]);
				if (attrCtnt10[i] != null)
					model.setAttrCtnt10(attrCtnt10[i]);
				if (csrCurrCd[i] != null)
					model.setCsrCurrCd(csrCurrCd[i]);
				if (attrCtnt14[i] != null)
					model.setAttrCtnt14(attrCtnt14[i]);
				if (coaRgnCd[i] != null)
					model.setCoaRgnCd(coaRgnCd[i]);
				if (attrCtnt13[i] != null)
					model.setAttrCtnt13(attrCtnt13[i]);
				if (ppdNo[i] != null)
					model.setPpdNo(ppdNo[i]);
				if (attrCtnt12[i] != null)
					model.setAttrCtnt12(attrCtnt12[i]);
				if (attrCtnt11[i] != null)
					model.setAttrCtnt11(attrCtnt11[i]);
				if (ppdDtrbNo[i] != null)
					model.setPpdDtrbNo(ppdDtrbNo[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (attrCtnt15[i] != null)
					model.setAttrCtnt15(attrCtnt15[i]);
				if (invDesc[i] != null)
					model.setInvDesc(invDesc[i]);
				if (vndrNo[i] != null)
					model.setVndrNo(vndrNo[i]);
				if (payAmt[i] != null)
					model.setPayAmt(payAmt[i]);
				if (ppdGlDt[i] != null)
					model.setPpdGlDt(ppdGlDt[i]);
				if (ftuUseCtnt2[i] != null)
					model.setFtuUseCtnt2(ftuUseCtnt2[i]);
				if (ftuUseCtnt1[i] != null)
					model.setFtuUseCtnt1(ftuUseCtnt1[i]);
				if (usrEml[i] != null)
					model.setUsrEml(usrEml[i]);
				if (estmErrRsn[i] != null)
					model.setEstmErrRsn(estmErrRsn[i]);
				if (aproFlg[i] != null)
					model.setAproFlg(aproFlg[i]);
				if (ftuUseCtnt5[i] != null)
					model.setFtuUseCtnt5(ftuUseCtnt5[i]);
				if (attrCateNm[i] != null)
					model.setAttrCateNm(attrCateNm[i]);
				if (csrTpCd[i] != null)
					model.setCsrTpCd(csrTpCd[i]);
				if (ftuUseCtnt4[i] != null)
					model.setFtuUseCtnt4(ftuUseCtnt4[i]);
				if (ftuUseCtnt3[i] != null)
					model.setFtuUseCtnt3(ftuUseCtnt3[i]);
				if (invDt[i] != null)
					model.setInvDt(invDt[i]);
				if (rcvErrFlg[i] != null)
					model.setRcvErrFlg(rcvErrFlg[i]);
				if (csrNo[i] != null)
					model.setCsrNo(csrNo[i]);
				if (payGrpLuCd[i] != null)
					model.setPayGrpLuCd(payGrpLuCd[i]);
				if (ifFlg[i] != null)
					model.setIfFlg(ifFlg[i]);
				if (ppayAplyFlg[i] != null)
					model.setPpayAplyFlg(ppayAplyFlg[i]);
				if (coaCoCd[i] != null)
					model.setCoaCoCd(coaCoCd[i]);
				if (errCsrNo[i] != null)
					model.setErrCsrNo(errCsrNo[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (payMzdLuCd[i] != null)
					model.setPayMzdLuCd(payMzdLuCd[i]);
				if (invTermDt[i] != null)
					model.setInvTermDt(invTermDt[i]);
				if (taxDeclFlg[i] != null)
					model.setTaxDeclFlg(taxDeclFlg[i]);
				if (aftActFlg[i] != null)
					model.setAftActFlg(aftActFlg[i]);
				if (coaInterCoCd[i] != null)
					model.setCoaInterCoCd(coaInterCoCd[i]);
				if (coaAcctCd[i] != null)
					model.setCoaAcctCd(coaAcctCd[i]);
				if (gloAttrCtnt17[i] != null)
					model.setGloAttrCtnt17(gloAttrCtnt17[i]);
				if (gloAttrCtnt18[i] != null)
					model.setGloAttrCtnt18(gloAttrCtnt18[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (attrCtnt9[i] != null)
					model.setAttrCtnt9(attrCtnt9[i]);
				if (gloAttrCtnt15[i] != null)
					model.setGloAttrCtnt15(gloAttrCtnt15[i]);
				if (attrCtnt8[i] != null)
					model.setAttrCtnt8(attrCtnt8[i]);
				if (gloAttrCtnt16[i] != null)
					model.setGloAttrCtnt16(gloAttrCtnt16[i]);
				if (gloAttrCtnt13[i] != null)
					model.setGloAttrCtnt13(gloAttrCtnt13[i]);
				if (gloAttrCtnt14[i] != null)
					model.setGloAttrCtnt14(gloAttrCtnt14[i]);
				if (gloAttrCtnt11[i] != null)
					model.setGloAttrCtnt11(gloAttrCtnt11[i]);
				if (ifErrRsn[i] != null)
					model.setIfErrRsn(ifErrRsn[i]);
				if (gloAttrCtnt12[i] != null)
					model.setGloAttrCtnt12(gloAttrCtnt12[i]);
				if (gloAttrCtnt10[i] != null)
					model.setGloAttrCtnt10(gloAttrCtnt10[i]);
				if (attrCtnt1[i] != null)
					model.setAttrCtnt1(attrCtnt1[i]);
				if (taxCurrXchFlg[i] != null)
					model.setTaxCurrXchFlg(taxCurrXchFlg[i]);
				if (coaFtuN1stCd[i] != null)
					model.setCoaFtuN1stCd(coaFtuN1stCd[i]);
				if (attrCtnt2[i] != null)
					model.setAttrCtnt2(attrCtnt2[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (attrCtnt3[i] != null)
					model.setAttrCtnt3(attrCtnt3[i]);
				if (attrCtnt4[i] != null)
					model.setAttrCtnt4(attrCtnt4[i]);
				if (attrCtnt5[i] != null)
					model.setAttrCtnt5(attrCtnt5[i]);
				if (tjOfcCd[i] != null)
					model.setTjOfcCd(tjOfcCd[i]);
				if (attrCtnt6[i] != null)
					model.setAttrCtnt6(attrCtnt6[i]);
				if (attrCtnt7[i] != null)
					model.setAttrCtnt7(attrCtnt7[i]);
				if (gloAttrCtnt2[i] != null)
					model.setGloAttrCtnt2(gloAttrCtnt2[i]);
				if (gloAttrCtnt3[i] != null)
					model.setGloAttrCtnt3(gloAttrCtnt3[i]);
				if (gloAttrCtnt4[i] != null)
					model.setGloAttrCtnt4(gloAttrCtnt4[i]);
				if (gloAttrCtnt5[i] != null)
					model.setGloAttrCtnt5(gloAttrCtnt5[i]);
				if (actXchRt[i] != null)
					model.setActXchRt(actXchRt[i]);
				if (gloAttrCtnt6[i] != null)
					model.setGloAttrCtnt6(gloAttrCtnt6[i]);
				if (ppdAplyAmt[i] != null)
					model.setPpdAplyAmt(ppdAplyAmt[i]);
				if (gloAttrCtnt7[i] != null)
					model.setGloAttrCtnt7(gloAttrCtnt7[i]);
				if (gloAttrCtnt8[i] != null)
					model.setGloAttrCtnt8(gloAttrCtnt8[i]);
				if (gloAttrCtnt9[i] != null)
					model.setGloAttrCtnt9(gloAttrCtnt9[i]);
				if (vndrTermNm[i] != null)
					model.setVndrTermNm(vndrTermNm[i]);
				if (gloAttrCtnt1[i] != null)
					model.setGloAttrCtnt1(gloAttrCtnt1[i]);
				if (coaCtrCd[i] != null)
					model.setCoaCtrCd(coaCtrCd[i]);
				if (eaiEvntDt[i] != null)
					model.setEaiEvntDt(eaiEvntDt[i]);
				if (coaVvdCd[i] != null)
					model.setCoaVvdCd(coaVvdCd[i]);
				if (coaFtuN2ndCd[i] != null)
					model.setCoaFtuN2ndCd(coaFtuN2ndCd[i]);
				if (impErrRsn[i] != null)
					model.setImpErrRsn(impErrRsn[i]);
				if (csrAmt[i] != null)
					model.setCsrAmt(csrAmt[i]);
				if (srcCtnt[i] != null)
					model.setSrcCtnt(srcCtnt[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getApInvHdrVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return ApInvHdrVO[]
	 */
	public ApInvHdrVO[] getApInvHdrVOs(){
		ApInvHdrVO[] vos = (ApInvHdrVO[])models.toArray(new ApInvHdrVO[models.size()]);
		return vos;
	}
	
	/**
	 * VO Class의 내용을 String으로 변환
	 */
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
		} catch (Exception ex) {
			return null;
		}
		return ret.toString();
	}
	
	/**
	 * 필드에 있는 값을 스트링 배열로 반환.
	 * @param field
	 * @param i
	 * @return String[]
	 */
	private String[] getField(Field[] field, int i) {
		String[] arr = null;
		try{
			arr = (String[]) field[i].get(this);
		}catch(Exception ex){
			arr = null;
		}
		return arr;
	}

	/**
	* 포맷팅된 문자열에서 특수문자 제거("-","/",",",":")
	*/
	public void unDataFormat(){
		this.impErrFlg = this.impErrFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ifDt = this.ifDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.payDt = this.payDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcvErrRsn = this.rcvErrRsn .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.glDt = this.glDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.attrCtnt10 = this.attrCtnt10 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.csrCurrCd = this.csrCurrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.attrCtnt14 = this.attrCtnt14 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.coaRgnCd = this.coaRgnCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.attrCtnt13 = this.attrCtnt13 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ppdNo = this.ppdNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.attrCtnt12 = this.attrCtnt12 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.attrCtnt11 = this.attrCtnt11 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ppdDtrbNo = this.ppdDtrbNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.attrCtnt15 = this.attrCtnt15 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invDesc = this.invDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrNo = this.vndrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.payAmt = this.payAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ppdGlDt = this.ppdGlDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ftuUseCtnt2 = this.ftuUseCtnt2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ftuUseCtnt1 = this.ftuUseCtnt1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usrEml = this.usrEml .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.estmErrRsn = this.estmErrRsn .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aproFlg = this.aproFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ftuUseCtnt5 = this.ftuUseCtnt5 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.attrCateNm = this.attrCateNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.csrTpCd = this.csrTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ftuUseCtnt4 = this.ftuUseCtnt4 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ftuUseCtnt3 = this.ftuUseCtnt3 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invDt = this.invDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcvErrFlg = this.rcvErrFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.csrNo = this.csrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.payGrpLuCd = this.payGrpLuCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ifFlg = this.ifFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ppayAplyFlg = this.ppayAplyFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.coaCoCd = this.coaCoCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.errCsrNo = this.errCsrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.payMzdLuCd = this.payMzdLuCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invTermDt = this.invTermDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.taxDeclFlg = this.taxDeclFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aftActFlg = this.aftActFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.coaInterCoCd = this.coaInterCoCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.coaAcctCd = this.coaAcctCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.gloAttrCtnt17 = this.gloAttrCtnt17 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.gloAttrCtnt18 = this.gloAttrCtnt18 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.attrCtnt9 = this.attrCtnt9 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.gloAttrCtnt15 = this.gloAttrCtnt15 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.attrCtnt8 = this.attrCtnt8 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.gloAttrCtnt16 = this.gloAttrCtnt16 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.gloAttrCtnt13 = this.gloAttrCtnt13 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.gloAttrCtnt14 = this.gloAttrCtnt14 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.gloAttrCtnt11 = this.gloAttrCtnt11 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ifErrRsn = this.ifErrRsn .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.gloAttrCtnt12 = this.gloAttrCtnt12 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.gloAttrCtnt10 = this.gloAttrCtnt10 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.attrCtnt1 = this.attrCtnt1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.taxCurrXchFlg = this.taxCurrXchFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.coaFtuN1stCd = this.coaFtuN1stCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.attrCtnt2 = this.attrCtnt2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.attrCtnt3 = this.attrCtnt3 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.attrCtnt4 = this.attrCtnt4 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.attrCtnt5 = this.attrCtnt5 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tjOfcCd = this.tjOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.attrCtnt6 = this.attrCtnt6 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.attrCtnt7 = this.attrCtnt7 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.gloAttrCtnt2 = this.gloAttrCtnt2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.gloAttrCtnt3 = this.gloAttrCtnt3 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.gloAttrCtnt4 = this.gloAttrCtnt4 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.gloAttrCtnt5 = this.gloAttrCtnt5 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actXchRt = this.actXchRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.gloAttrCtnt6 = this.gloAttrCtnt6 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ppdAplyAmt = this.ppdAplyAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.gloAttrCtnt7 = this.gloAttrCtnt7 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.gloAttrCtnt8 = this.gloAttrCtnt8 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.gloAttrCtnt9 = this.gloAttrCtnt9 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrTermNm = this.vndrTermNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.gloAttrCtnt1 = this.gloAttrCtnt1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.coaCtrCd = this.coaCtrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eaiEvntDt = this.eaiEvntDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.coaVvdCd = this.coaVvdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.coaFtuN2ndCd = this.coaFtuN2ndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.impErrRsn = this.impErrRsn .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.csrAmt = this.csrAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.srcCtnt = this.srcCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
