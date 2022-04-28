/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : MnrPartnerVO.java
*@FileTitle : MnrPartnerVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.08.13
*@LastModifier : 안준상
*@LastVersion : 1.0
* 2009.08.13 안준상 
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
 * @author 안준상
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class MnrPartnerVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<MnrPartnerVO> models = new ArrayList<MnrPartnerVO>();
	
	/* Column Info */
	private String bzctNm = null;
	/* Column Info */
	private String mnrGrpTpCd = null;
	/* Column Info */
	private String spPtalId = null;
	/* Column Info */
	private String bztpNm = null;
	/* Column Info */
	private String mnrPayrCntCd = null;
	/* Column Info */
	private String bzetAddr = null;
	/* Column Info */
	private String mnrPrnrLoclLangNm = null;
	/* Column Info */
	private String mnrPrnrAbbrNm = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String mnrPrnrSeq = null;
	/* Column Info */
	private String effDt = null;
	/* Column Info */
	private String mnrPrnrRmk = null;
	/* Column Info */
	private String mnrPayrSeq = null;
	/* Column Info */
	private String bankNm = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String phnNo = null;
	/* Column Info */
	private String payMzdCd = null;
	/* Column Info */
	private String ctrlOfcCd = null;
	/* Column Info */
	private String mnrPrnrTpCd = null;
	/* Column Info */
	private String payTermDys = null;
	/* Column Info */
	private String ediId = null;
	/* Column Info */
	private String trsmModCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String bizRgstNo = null;
	/* Column Info */
	private String mnrPrnrKndDtlCd = null;
	/* Column Info */
	private String zipCd = null;
	/* Column Info */
	private String mnrPrnrEml = null;
	/* Column Info */
	private String dptDesc = null;
	/* Column Info */
	private String faxNo = null;
	/* Column Info */
	private String fileSeq = null;
	/* Column Info */
	private String ownrNm = null;
	/* Column Info */
	private String mnrBilToNm = null;
	/* Column Info */
	private String bankAcctNo = null;
	/* Column Info */
	private String mnrPrnrCntCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String mnrPrnrAddr = null;
	/* Column Info */
	private String mnrPrnrCreSeq = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String intlFaxNo = null;
	/* Column Info */
	private String expDt = null;
	/* Column Info */
	private String mnrPrnrCapiAmt = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String mnrPrnrKndCd = null;
	/* Column Info */
	private String mnrPrnrStsCd = null;
	/* Column Info */
	private String mnrPrnrLglEngNm = null;
	/* Column Info */
	private String mnrShopFlg = null;
	/* Column Info */
	private String spPtalPwd = null;
	/* Column Info */
	private String empeKnt = null;
	/* Column Info */
	private String intlPhnNo = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public MnrPartnerVO() {}

	public MnrPartnerVO(String ibflag, String pagerows, String mnrPrnrCreSeq, String ctrlOfcCd, String mnrGrpTpCd, String mnrPrnrTpCd, String mnrPrnrKndCd, String mnrPrnrKndDtlCd, String mnrPrnrStsCd, String mnrPrnrCntCd, String mnrPrnrSeq, String ediId, String spPtalId, String spPtalPwd, String mnrPrnrLglEngNm, String mnrPrnrLoclLangNm, String mnrPrnrAddr, String bzetAddr, String mnrBilToNm, String effDt, String expDt, String bankNm, String bankAcctNo, String payMzdCd, String payTermDys, String zipCd, String ownrNm, String bzctNm, String bztpNm, String bizRgstNo, String mnrShopFlg, String mnrPayrCntCd, String mnrPayrSeq, String mnrPrnrCapiAmt, String empeKnt, String dptDesc, String mnrPrnrAbbrNm, String intlPhnNo, String phnNo, String intlFaxNo, String faxNo, String mnrPrnrEml, String mnrPrnrRmk, String trsmModCd, String fileSeq, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.bzctNm = bzctNm;
		this.mnrGrpTpCd = mnrGrpTpCd;
		this.spPtalId = spPtalId;
		this.bztpNm = bztpNm;
		this.mnrPayrCntCd = mnrPayrCntCd;
		this.bzetAddr = bzetAddr;
		this.mnrPrnrLoclLangNm = mnrPrnrLoclLangNm;
		this.mnrPrnrAbbrNm = mnrPrnrAbbrNm;
		this.pagerows = pagerows;
		this.mnrPrnrSeq = mnrPrnrSeq;
		this.effDt = effDt;
		this.mnrPrnrRmk = mnrPrnrRmk;
		this.mnrPayrSeq = mnrPayrSeq;
		this.bankNm = bankNm;
		this.updUsrId = updUsrId;
		this.phnNo = phnNo;
		this.payMzdCd = payMzdCd;
		this.ctrlOfcCd = ctrlOfcCd;
		this.mnrPrnrTpCd = mnrPrnrTpCd;
		this.payTermDys = payTermDys;
		this.ediId = ediId;
		this.trsmModCd = trsmModCd;
		this.creUsrId = creUsrId;
		this.bizRgstNo = bizRgstNo;
		this.mnrPrnrKndDtlCd = mnrPrnrKndDtlCd;
		this.zipCd = zipCd;
		this.mnrPrnrEml = mnrPrnrEml;
		this.dptDesc = dptDesc;
		this.faxNo = faxNo;
		this.fileSeq = fileSeq;
		this.ownrNm = ownrNm;
		this.mnrBilToNm = mnrBilToNm;
		this.bankAcctNo = bankAcctNo;
		this.mnrPrnrCntCd = mnrPrnrCntCd;
		this.creDt = creDt;
		this.mnrPrnrAddr = mnrPrnrAddr;
		this.mnrPrnrCreSeq = mnrPrnrCreSeq;
		this.ibflag = ibflag;
		this.intlFaxNo = intlFaxNo;
		this.expDt = expDt;
		this.mnrPrnrCapiAmt = mnrPrnrCapiAmt;
		this.updDt = updDt;
		this.mnrPrnrKndCd = mnrPrnrKndCd;
		this.mnrPrnrStsCd = mnrPrnrStsCd;
		this.mnrPrnrLglEngNm = mnrPrnrLglEngNm;
		this.mnrShopFlg = mnrShopFlg;
		this.spPtalPwd = spPtalPwd;
		this.empeKnt = empeKnt;
		this.intlPhnNo = intlPhnNo;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("bzct_nm", getBzctNm());
		this.hashColumns.put("mnr_grp_tp_cd", getMnrGrpTpCd());
		this.hashColumns.put("sp_ptal_id", getSpPtalId());
		this.hashColumns.put("bztp_nm", getBztpNm());
		this.hashColumns.put("mnr_payr_cnt_cd", getMnrPayrCntCd());
		this.hashColumns.put("bzet_addr", getBzetAddr());
		this.hashColumns.put("mnr_prnr_locl_lang_nm", getMnrPrnrLoclLangNm());
		this.hashColumns.put("mnr_prnr_abbr_nm", getMnrPrnrAbbrNm());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("mnr_prnr_seq", getMnrPrnrSeq());
		this.hashColumns.put("eff_dt", getEffDt());
		this.hashColumns.put("mnr_prnr_rmk", getMnrPrnrRmk());
		this.hashColumns.put("mnr_payr_seq", getMnrPayrSeq());
		this.hashColumns.put("bank_nm", getBankNm());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("phn_no", getPhnNo());
		this.hashColumns.put("pay_mzd_cd", getPayMzdCd());
		this.hashColumns.put("ctrl_ofc_cd", getCtrlOfcCd());
		this.hashColumns.put("mnr_prnr_tp_cd", getMnrPrnrTpCd());
		this.hashColumns.put("pay_term_dys", getPayTermDys());
		this.hashColumns.put("edi_id", getEdiId());
		this.hashColumns.put("trsm_mod_cd", getTrsmModCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("biz_rgst_no", getBizRgstNo());
		this.hashColumns.put("mnr_prnr_knd_dtl_cd", getMnrPrnrKndDtlCd());
		this.hashColumns.put("zip_cd", getZipCd());
		this.hashColumns.put("mnr_prnr_eml", getMnrPrnrEml());
		this.hashColumns.put("dpt_desc", getDptDesc());
		this.hashColumns.put("fax_no", getFaxNo());
		this.hashColumns.put("file_seq", getFileSeq());
		this.hashColumns.put("ownr_nm", getOwnrNm());
		this.hashColumns.put("mnr_bil_to_nm", getMnrBilToNm());
		this.hashColumns.put("bank_acct_no", getBankAcctNo());
		this.hashColumns.put("mnr_prnr_cnt_cd", getMnrPrnrCntCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("mnr_prnr_addr", getMnrPrnrAddr());
		this.hashColumns.put("mnr_prnr_cre_seq", getMnrPrnrCreSeq());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("intl_fax_no", getIntlFaxNo());
		this.hashColumns.put("exp_dt", getExpDt());
		this.hashColumns.put("mnr_prnr_capi_amt", getMnrPrnrCapiAmt());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("mnr_prnr_knd_cd", getMnrPrnrKndCd());
		this.hashColumns.put("mnr_prnr_sts_cd", getMnrPrnrStsCd());
		this.hashColumns.put("mnr_prnr_lgl_eng_nm", getMnrPrnrLglEngNm());
		this.hashColumns.put("mnr_shop_flg", getMnrShopFlg());
		this.hashColumns.put("sp_ptal_pwd", getSpPtalPwd());
		this.hashColumns.put("empe_knt", getEmpeKnt());
		this.hashColumns.put("intl_phn_no", getIntlPhnNo());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("bzct_nm", "bzctNm");
		this.hashFields.put("mnr_grp_tp_cd", "mnrGrpTpCd");
		this.hashFields.put("sp_ptal_id", "spPtalId");
		this.hashFields.put("bztp_nm", "bztpNm");
		this.hashFields.put("mnr_payr_cnt_cd", "mnrPayrCntCd");
		this.hashFields.put("bzet_addr", "bzetAddr");
		this.hashFields.put("mnr_prnr_locl_lang_nm", "mnrPrnrLoclLangNm");
		this.hashFields.put("mnr_prnr_abbr_nm", "mnrPrnrAbbrNm");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("mnr_prnr_seq", "mnrPrnrSeq");
		this.hashFields.put("eff_dt", "effDt");
		this.hashFields.put("mnr_prnr_rmk", "mnrPrnrRmk");
		this.hashFields.put("mnr_payr_seq", "mnrPayrSeq");
		this.hashFields.put("bank_nm", "bankNm");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("phn_no", "phnNo");
		this.hashFields.put("pay_mzd_cd", "payMzdCd");
		this.hashFields.put("ctrl_ofc_cd", "ctrlOfcCd");
		this.hashFields.put("mnr_prnr_tp_cd", "mnrPrnrTpCd");
		this.hashFields.put("pay_term_dys", "payTermDys");
		this.hashFields.put("edi_id", "ediId");
		this.hashFields.put("trsm_mod_cd", "trsmModCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("biz_rgst_no", "bizRgstNo");
		this.hashFields.put("mnr_prnr_knd_dtl_cd", "mnrPrnrKndDtlCd");
		this.hashFields.put("zip_cd", "zipCd");
		this.hashFields.put("mnr_prnr_eml", "mnrPrnrEml");
		this.hashFields.put("dpt_desc", "dptDesc");
		this.hashFields.put("fax_no", "faxNo");
		this.hashFields.put("file_seq", "fileSeq");
		this.hashFields.put("ownr_nm", "ownrNm");
		this.hashFields.put("mnr_bil_to_nm", "mnrBilToNm");
		this.hashFields.put("bank_acct_no", "bankAcctNo");
		this.hashFields.put("mnr_prnr_cnt_cd", "mnrPrnrCntCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("mnr_prnr_addr", "mnrPrnrAddr");
		this.hashFields.put("mnr_prnr_cre_seq", "mnrPrnrCreSeq");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("intl_fax_no", "intlFaxNo");
		this.hashFields.put("exp_dt", "expDt");
		this.hashFields.put("mnr_prnr_capi_amt", "mnrPrnrCapiAmt");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("mnr_prnr_knd_cd", "mnrPrnrKndCd");
		this.hashFields.put("mnr_prnr_sts_cd", "mnrPrnrStsCd");
		this.hashFields.put("mnr_prnr_lgl_eng_nm", "mnrPrnrLglEngNm");
		this.hashFields.put("mnr_shop_flg", "mnrShopFlg");
		this.hashFields.put("sp_ptal_pwd", "spPtalPwd");
		this.hashFields.put("empe_knt", "empeKnt");
		this.hashFields.put("intl_phn_no", "intlPhnNo");
		return this.hashFields;
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
	 * @return mnrGrpTpCd
	 */
	public String getMnrGrpTpCd() {
		return this.mnrGrpTpCd;
	}
	
	/**
	 * Column Info
	 * @return spPtalId
	 */
	public String getSpPtalId() {
		return this.spPtalId;
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
	 * @return mnrPayrCntCd
	 */
	public String getMnrPayrCntCd() {
		return this.mnrPayrCntCd;
	}
	
	/**
	 * Column Info
	 * @return bzetAddr
	 */
	public String getBzetAddr() {
		return this.bzetAddr;
	}
	
	/**
	 * Column Info
	 * @return mnrPrnrLoclLangNm
	 */
	public String getMnrPrnrLoclLangNm() {
		return this.mnrPrnrLoclLangNm;
	}
	
	/**
	 * Column Info
	 * @return mnrPrnrAbbrNm
	 */
	public String getMnrPrnrAbbrNm() {
		return this.mnrPrnrAbbrNm;
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
	 * @return mnrPrnrSeq
	 */
	public String getMnrPrnrSeq() {
		return this.mnrPrnrSeq;
	}
	
	/**
	 * Column Info
	 * @return effDt
	 */
	public String getEffDt() {
		return this.effDt;
	}
	
	/**
	 * Column Info
	 * @return mnrPrnrRmk
	 */
	public String getMnrPrnrRmk() {
		return this.mnrPrnrRmk;
	}
	
	/**
	 * Column Info
	 * @return mnrPayrSeq
	 */
	public String getMnrPayrSeq() {
		return this.mnrPayrSeq;
	}
	
	/**
	 * Column Info
	 * @return bankNm
	 */
	public String getBankNm() {
		return this.bankNm;
	}
	
	/**
	 * Column Info
	 * @return updUsrId
	 */
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	
	/**
	 * Column Info
	 * @return phnNo
	 */
	public String getPhnNo() {
		return this.phnNo;
	}
	
	/**
	 * Column Info
	 * @return payMzdCd
	 */
	public String getPayMzdCd() {
		return this.payMzdCd;
	}
	
	/**
	 * Column Info
	 * @return ctrlOfcCd
	 */
	public String getCtrlOfcCd() {
		return this.ctrlOfcCd;
	}
	
	/**
	 * Column Info
	 * @return mnrPrnrTpCd
	 */
	public String getMnrPrnrTpCd() {
		return this.mnrPrnrTpCd;
	}
	
	/**
	 * Column Info
	 * @return payTermDys
	 */
	public String getPayTermDys() {
		return this.payTermDys;
	}
	
	/**
	 * Column Info
	 * @return ediId
	 */
	public String getEdiId() {
		return this.ediId;
	}
	
	/**
	 * Column Info
	 * @return trsmModCd
	 */
	public String getTrsmModCd() {
		return this.trsmModCd;
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
	 * @return bizRgstNo
	 */
	public String getBizRgstNo() {
		return this.bizRgstNo;
	}
	
	/**
	 * Column Info
	 * @return mnrPrnrKndDtlCd
	 */
	public String getMnrPrnrKndDtlCd() {
		return this.mnrPrnrKndDtlCd;
	}
	
	/**
	 * Column Info
	 * @return zipCd
	 */
	public String getZipCd() {
		return this.zipCd;
	}
	
	/**
	 * Column Info
	 * @return mnrPrnrEml
	 */
	public String getMnrPrnrEml() {
		return this.mnrPrnrEml;
	}
	
	/**
	 * Column Info
	 * @return dptDesc
	 */
	public String getDptDesc() {
		return this.dptDesc;
	}
	
	/**
	 * Column Info
	 * @return faxNo
	 */
	public String getFaxNo() {
		return this.faxNo;
	}
	
	/**
	 * Column Info
	 * @return fileSeq
	 */
	public String getFileSeq() {
		return this.fileSeq;
	}
	
	/**
	 * Column Info
	 * @return ownrNm
	 */
	public String getOwnrNm() {
		return this.ownrNm;
	}
	
	/**
	 * Column Info
	 * @return mnrBilToNm
	 */
	public String getMnrBilToNm() {
		return this.mnrBilToNm;
	}
	
	/**
	 * Column Info
	 * @return bankAcctNo
	 */
	public String getBankAcctNo() {
		return this.bankAcctNo;
	}
	
	/**
	 * Column Info
	 * @return mnrPrnrCntCd
	 */
	public String getMnrPrnrCntCd() {
		return this.mnrPrnrCntCd;
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
	 * @return mnrPrnrAddr
	 */
	public String getMnrPrnrAddr() {
		return this.mnrPrnrAddr;
	}
	
	/**
	 * Column Info
	 * @return mnrPrnrCreSeq
	 */
	public String getMnrPrnrCreSeq() {
		return this.mnrPrnrCreSeq;
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
	 * @return intlFaxNo
	 */
	public String getIntlFaxNo() {
		return this.intlFaxNo;
	}
	
	/**
	 * Column Info
	 * @return expDt
	 */
	public String getExpDt() {
		return this.expDt;
	}
	
	/**
	 * Column Info
	 * @return mnrPrnrCapiAmt
	 */
	public String getMnrPrnrCapiAmt() {
		return this.mnrPrnrCapiAmt;
	}
	
	/**
	 * Column Info
	 * @return updDt
	 */
	public String getUpdDt() {
		return this.updDt;
	}
	
	/**
	 * Column Info
	 * @return mnrPrnrKndCd
	 */
	public String getMnrPrnrKndCd() {
		return this.mnrPrnrKndCd;
	}
	
	/**
	 * Column Info
	 * @return mnrPrnrStsCd
	 */
	public String getMnrPrnrStsCd() {
		return this.mnrPrnrStsCd;
	}
	
	/**
	 * Column Info
	 * @return mnrPrnrLglEngNm
	 */
	public String getMnrPrnrLglEngNm() {
		return this.mnrPrnrLglEngNm;
	}
	
	/**
	 * Column Info
	 * @return mnrShopFlg
	 */
	public String getMnrShopFlg() {
		return this.mnrShopFlg;
	}
	
	/**
	 * Column Info
	 * @return spPtalPwd
	 */
	public String getSpPtalPwd() {
		return this.spPtalPwd;
	}
	
	/**
	 * Column Info
	 * @return empeKnt
	 */
	public String getEmpeKnt() {
		return this.empeKnt;
	}
	
	/**
	 * Column Info
	 * @return intlPhnNo
	 */
	public String getIntlPhnNo() {
		return this.intlPhnNo;
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
	 * @param mnrGrpTpCd
	 */
	public void setMnrGrpTpCd(String mnrGrpTpCd) {
		this.mnrGrpTpCd = mnrGrpTpCd;
	}
	
	/**
	 * Column Info
	 * @param spPtalId
	 */
	public void setSpPtalId(String spPtalId) {
		this.spPtalId = spPtalId;
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
	 * @param mnrPayrCntCd
	 */
	public void setMnrPayrCntCd(String mnrPayrCntCd) {
		this.mnrPayrCntCd = mnrPayrCntCd;
	}
	
	/**
	 * Column Info
	 * @param bzetAddr
	 */
	public void setBzetAddr(String bzetAddr) {
		this.bzetAddr = bzetAddr;
	}
	
	/**
	 * Column Info
	 * @param mnrPrnrLoclLangNm
	 */
	public void setMnrPrnrLoclLangNm(String mnrPrnrLoclLangNm) {
		this.mnrPrnrLoclLangNm = mnrPrnrLoclLangNm;
	}
	
	/**
	 * Column Info
	 * @param mnrPrnrAbbrNm
	 */
	public void setMnrPrnrAbbrNm(String mnrPrnrAbbrNm) {
		this.mnrPrnrAbbrNm = mnrPrnrAbbrNm;
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
	 * @param mnrPrnrSeq
	 */
	public void setMnrPrnrSeq(String mnrPrnrSeq) {
		this.mnrPrnrSeq = mnrPrnrSeq;
	}
	
	/**
	 * Column Info
	 * @param effDt
	 */
	public void setEffDt(String effDt) {
		this.effDt = effDt;
	}
	
	/**
	 * Column Info
	 * @param mnrPrnrRmk
	 */
	public void setMnrPrnrRmk(String mnrPrnrRmk) {
		this.mnrPrnrRmk = mnrPrnrRmk;
	}
	
	/**
	 * Column Info
	 * @param mnrPayrSeq
	 */
	public void setMnrPayrSeq(String mnrPayrSeq) {
		this.mnrPayrSeq = mnrPayrSeq;
	}
	
	/**
	 * Column Info
	 * @param bankNm
	 */
	public void setBankNm(String bankNm) {
		this.bankNm = bankNm;
	}
	
	/**
	 * Column Info
	 * @param updUsrId
	 */
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
	}
	
	/**
	 * Column Info
	 * @param phnNo
	 */
	public void setPhnNo(String phnNo) {
		this.phnNo = phnNo;
	}
	
	/**
	 * Column Info
	 * @param payMzdCd
	 */
	public void setPayMzdCd(String payMzdCd) {
		this.payMzdCd = payMzdCd;
	}
	
	/**
	 * Column Info
	 * @param ctrlOfcCd
	 */
	public void setCtrlOfcCd(String ctrlOfcCd) {
		this.ctrlOfcCd = ctrlOfcCd;
	}
	
	/**
	 * Column Info
	 * @param mnrPrnrTpCd
	 */
	public void setMnrPrnrTpCd(String mnrPrnrTpCd) {
		this.mnrPrnrTpCd = mnrPrnrTpCd;
	}
	
	/**
	 * Column Info
	 * @param payTermDys
	 */
	public void setPayTermDys(String payTermDys) {
		this.payTermDys = payTermDys;
	}
	
	/**
	 * Column Info
	 * @param ediId
	 */
	public void setEdiId(String ediId) {
		this.ediId = ediId;
	}
	
	/**
	 * Column Info
	 * @param trsmModCd
	 */
	public void setTrsmModCd(String trsmModCd) {
		this.trsmModCd = trsmModCd;
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
	 * @param bizRgstNo
	 */
	public void setBizRgstNo(String bizRgstNo) {
		this.bizRgstNo = bizRgstNo;
	}
	
	/**
	 * Column Info
	 * @param mnrPrnrKndDtlCd
	 */
	public void setMnrPrnrKndDtlCd(String mnrPrnrKndDtlCd) {
		this.mnrPrnrKndDtlCd = mnrPrnrKndDtlCd;
	}
	
	/**
	 * Column Info
	 * @param zipCd
	 */
	public void setZipCd(String zipCd) {
		this.zipCd = zipCd;
	}
	
	/**
	 * Column Info
	 * @param mnrPrnrEml
	 */
	public void setMnrPrnrEml(String mnrPrnrEml) {
		this.mnrPrnrEml = mnrPrnrEml;
	}
	
	/**
	 * Column Info
	 * @param dptDesc
	 */
	public void setDptDesc(String dptDesc) {
		this.dptDesc = dptDesc;
	}
	
	/**
	 * Column Info
	 * @param faxNo
	 */
	public void setFaxNo(String faxNo) {
		this.faxNo = faxNo;
	}
	
	/**
	 * Column Info
	 * @param fileSeq
	 */
	public void setFileSeq(String fileSeq) {
		this.fileSeq = fileSeq;
	}
	
	/**
	 * Column Info
	 * @param ownrNm
	 */
	public void setOwnrNm(String ownrNm) {
		this.ownrNm = ownrNm;
	}
	
	/**
	 * Column Info
	 * @param mnrBilToNm
	 */
	public void setMnrBilToNm(String mnrBilToNm) {
		this.mnrBilToNm = mnrBilToNm;
	}
	
	/**
	 * Column Info
	 * @param bankAcctNo
	 */
	public void setBankAcctNo(String bankAcctNo) {
		this.bankAcctNo = bankAcctNo;
	}
	
	/**
	 * Column Info
	 * @param mnrPrnrCntCd
	 */
	public void setMnrPrnrCntCd(String mnrPrnrCntCd) {
		this.mnrPrnrCntCd = mnrPrnrCntCd;
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
	 * @param mnrPrnrAddr
	 */
	public void setMnrPrnrAddr(String mnrPrnrAddr) {
		this.mnrPrnrAddr = mnrPrnrAddr;
	}
	
	/**
	 * Column Info
	 * @param mnrPrnrCreSeq
	 */
	public void setMnrPrnrCreSeq(String mnrPrnrCreSeq) {
		this.mnrPrnrCreSeq = mnrPrnrCreSeq;
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
	 * @param intlFaxNo
	 */
	public void setIntlFaxNo(String intlFaxNo) {
		this.intlFaxNo = intlFaxNo;
	}
	
	/**
	 * Column Info
	 * @param expDt
	 */
	public void setExpDt(String expDt) {
		this.expDt = expDt;
	}
	
	/**
	 * Column Info
	 * @param mnrPrnrCapiAmt
	 */
	public void setMnrPrnrCapiAmt(String mnrPrnrCapiAmt) {
		this.mnrPrnrCapiAmt = mnrPrnrCapiAmt;
	}
	
	/**
	 * Column Info
	 * @param updDt
	 */
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
	}
	
	/**
	 * Column Info
	 * @param mnrPrnrKndCd
	 */
	public void setMnrPrnrKndCd(String mnrPrnrKndCd) {
		this.mnrPrnrKndCd = mnrPrnrKndCd;
	}
	
	/**
	 * Column Info
	 * @param mnrPrnrStsCd
	 */
	public void setMnrPrnrStsCd(String mnrPrnrStsCd) {
		this.mnrPrnrStsCd = mnrPrnrStsCd;
	}
	
	/**
	 * Column Info
	 * @param mnrPrnrLglEngNm
	 */
	public void setMnrPrnrLglEngNm(String mnrPrnrLglEngNm) {
		this.mnrPrnrLglEngNm = mnrPrnrLglEngNm;
	}
	
	/**
	 * Column Info
	 * @param mnrShopFlg
	 */
	public void setMnrShopFlg(String mnrShopFlg) {
		this.mnrShopFlg = mnrShopFlg;
	}
	
	/**
	 * Column Info
	 * @param spPtalPwd
	 */
	public void setSpPtalPwd(String spPtalPwd) {
		this.spPtalPwd = spPtalPwd;
	}
	
	/**
	 * Column Info
	 * @param empeKnt
	 */
	public void setEmpeKnt(String empeKnt) {
		this.empeKnt = empeKnt;
	}
	
	/**
	 * Column Info
	 * @param intlPhnNo
	 */
	public void setIntlPhnNo(String intlPhnNo) {
		this.intlPhnNo = intlPhnNo;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setBzctNm(JSPUtil.getParameter(request, "bzct_nm", ""));
		setMnrGrpTpCd(JSPUtil.getParameter(request, "mnr_grp_tp_cd", ""));
		setSpPtalId(JSPUtil.getParameter(request, "sp_ptal_id", ""));
		setBztpNm(JSPUtil.getParameter(request, "bztp_nm", ""));
		setMnrPayrCntCd(JSPUtil.getParameter(request, "mnr_payr_cnt_cd", ""));
		setBzetAddr(JSPUtil.getParameter(request, "bzet_addr", ""));
		setMnrPrnrLoclLangNm(JSPUtil.getParameter(request, "mnr_prnr_locl_lang_nm", ""));
		setMnrPrnrAbbrNm(JSPUtil.getParameter(request, "mnr_prnr_abbr_nm", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setMnrPrnrSeq(JSPUtil.getParameter(request, "mnr_prnr_seq", ""));
		setEffDt(JSPUtil.getParameter(request, "eff_dt", ""));
		setMnrPrnrRmk(JSPUtil.getParameter(request, "mnr_prnr_rmk", ""));
		setMnrPayrSeq(JSPUtil.getParameter(request, "mnr_payr_seq", ""));
		setBankNm(JSPUtil.getParameter(request, "bank_nm", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setPhnNo(JSPUtil.getParameter(request, "phn_no", ""));
		setPayMzdCd(JSPUtil.getParameter(request, "pay_mzd_cd", ""));
		setCtrlOfcCd(JSPUtil.getParameter(request, "ctrl_ofc_cd", ""));
		setMnrPrnrTpCd(JSPUtil.getParameter(request, "mnr_prnr_tp_cd", ""));
		setPayTermDys(JSPUtil.getParameter(request, "pay_term_dys", ""));
		setEdiId(JSPUtil.getParameter(request, "edi_id", ""));
		setTrsmModCd(JSPUtil.getParameter(request, "trsm_mod_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setBizRgstNo(JSPUtil.getParameter(request, "biz_rgst_no", ""));
		setMnrPrnrKndDtlCd(JSPUtil.getParameter(request, "mnr_prnr_knd_dtl_cd", ""));
		setZipCd(JSPUtil.getParameter(request, "zip_cd", ""));
		setMnrPrnrEml(JSPUtil.getParameter(request, "mnr_prnr_eml", ""));
		setDptDesc(JSPUtil.getParameter(request, "dpt_desc", ""));
		setFaxNo(JSPUtil.getParameter(request, "fax_no", ""));
		setFileSeq(JSPUtil.getParameter(request, "file_seq", ""));
		setOwnrNm(JSPUtil.getParameter(request, "ownr_nm", ""));
		setMnrBilToNm(JSPUtil.getParameter(request, "mnr_bil_to_nm", ""));
		setBankAcctNo(JSPUtil.getParameter(request, "bank_acct_no", ""));
		setMnrPrnrCntCd(JSPUtil.getParameter(request, "mnr_prnr_cnt_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setMnrPrnrAddr(JSPUtil.getParameter(request, "mnr_prnr_addr", ""));
		setMnrPrnrCreSeq(JSPUtil.getParameter(request, "mnr_prnr_cre_seq", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setIntlFaxNo(JSPUtil.getParameter(request, "intl_fax_no", ""));
		setExpDt(JSPUtil.getParameter(request, "exp_dt", ""));
		setMnrPrnrCapiAmt(JSPUtil.getParameter(request, "mnr_prnr_capi_amt", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setMnrPrnrKndCd(JSPUtil.getParameter(request, "mnr_prnr_knd_cd", ""));
		setMnrPrnrStsCd(JSPUtil.getParameter(request, "mnr_prnr_sts_cd", ""));
		setMnrPrnrLglEngNm(JSPUtil.getParameter(request, "mnr_prnr_lgl_eng_nm", ""));
		setMnrShopFlg(JSPUtil.getParameter(request, "mnr_shop_flg", ""));
		setSpPtalPwd(JSPUtil.getParameter(request, "sp_ptal_pwd", ""));
		setEmpeKnt(JSPUtil.getParameter(request, "empe_knt", ""));
		setIntlPhnNo(JSPUtil.getParameter(request, "intl_phn_no", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return MnrPartnerVO[]
	 */
	public MnrPartnerVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return MnrPartnerVO[]
	 */
	public MnrPartnerVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		MnrPartnerVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] bzctNm = (JSPUtil.getParameter(request, prefix	+ "bzct_nm", length));
			String[] mnrGrpTpCd = (JSPUtil.getParameter(request, prefix	+ "mnr_grp_tp_cd", length));
			String[] spPtalId = (JSPUtil.getParameter(request, prefix	+ "sp_ptal_id", length));
			String[] bztpNm = (JSPUtil.getParameter(request, prefix	+ "bztp_nm", length));
			String[] mnrPayrCntCd = (JSPUtil.getParameter(request, prefix	+ "mnr_payr_cnt_cd", length));
			String[] bzetAddr = (JSPUtil.getParameter(request, prefix	+ "bzet_addr", length));
			String[] mnrPrnrLoclLangNm = (JSPUtil.getParameter(request, prefix	+ "mnr_prnr_locl_lang_nm", length));
			String[] mnrPrnrAbbrNm = (JSPUtil.getParameter(request, prefix	+ "mnr_prnr_abbr_nm", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] mnrPrnrSeq = (JSPUtil.getParameter(request, prefix	+ "mnr_prnr_seq", length));
			String[] effDt = (JSPUtil.getParameter(request, prefix	+ "eff_dt", length));
			String[] mnrPrnrRmk = (JSPUtil.getParameter(request, prefix	+ "mnr_prnr_rmk", length));
			String[] mnrPayrSeq = (JSPUtil.getParameter(request, prefix	+ "mnr_payr_seq", length));
			String[] bankNm = (JSPUtil.getParameter(request, prefix	+ "bank_nm", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] phnNo = (JSPUtil.getParameter(request, prefix	+ "phn_no", length));
			String[] payMzdCd = (JSPUtil.getParameter(request, prefix	+ "pay_mzd_cd", length));
			String[] ctrlOfcCd = (JSPUtil.getParameter(request, prefix	+ "ctrl_ofc_cd", length));
			String[] mnrPrnrTpCd = (JSPUtil.getParameter(request, prefix	+ "mnr_prnr_tp_cd", length));
			String[] payTermDys = (JSPUtil.getParameter(request, prefix	+ "pay_term_dys", length));
			String[] ediId = (JSPUtil.getParameter(request, prefix	+ "edi_id", length));
			String[] trsmModCd = (JSPUtil.getParameter(request, prefix	+ "trsm_mod_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] bizRgstNo = (JSPUtil.getParameter(request, prefix	+ "biz_rgst_no", length));
			String[] mnrPrnrKndDtlCd = (JSPUtil.getParameter(request, prefix	+ "mnr_prnr_knd_dtl_cd", length));
			String[] zipCd = (JSPUtil.getParameter(request, prefix	+ "zip_cd", length));
			String[] mnrPrnrEml = (JSPUtil.getParameter(request, prefix	+ "mnr_prnr_eml", length));
			String[] dptDesc = (JSPUtil.getParameter(request, prefix	+ "dpt_desc", length));
			String[] faxNo = (JSPUtil.getParameter(request, prefix	+ "fax_no", length));
			String[] fileSeq = (JSPUtil.getParameter(request, prefix	+ "file_seq", length));
			String[] ownrNm = (JSPUtil.getParameter(request, prefix	+ "ownr_nm", length));
			String[] mnrBilToNm = (JSPUtil.getParameter(request, prefix	+ "mnr_bil_to_nm", length));
			String[] bankAcctNo = (JSPUtil.getParameter(request, prefix	+ "bank_acct_no", length));
			String[] mnrPrnrCntCd = (JSPUtil.getParameter(request, prefix	+ "mnr_prnr_cnt_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] mnrPrnrAddr = (JSPUtil.getParameter(request, prefix	+ "mnr_prnr_addr", length));
			String[] mnrPrnrCreSeq = (JSPUtil.getParameter(request, prefix	+ "mnr_prnr_cre_seq", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] intlFaxNo = (JSPUtil.getParameter(request, prefix	+ "intl_fax_no", length));
			String[] expDt = (JSPUtil.getParameter(request, prefix	+ "exp_dt", length));
			String[] mnrPrnrCapiAmt = (JSPUtil.getParameter(request, prefix	+ "mnr_prnr_capi_amt", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] mnrPrnrKndCd = (JSPUtil.getParameter(request, prefix	+ "mnr_prnr_knd_cd", length));
			String[] mnrPrnrStsCd = (JSPUtil.getParameter(request, prefix	+ "mnr_prnr_sts_cd", length));
			String[] mnrPrnrLglEngNm = (JSPUtil.getParameter(request, prefix	+ "mnr_prnr_lgl_eng_nm", length));
			String[] mnrShopFlg = (JSPUtil.getParameter(request, prefix	+ "mnr_shop_flg", length));
			String[] spPtalPwd = (JSPUtil.getParameter(request, prefix	+ "sp_ptal_pwd", length));
			String[] empeKnt = (JSPUtil.getParameter(request, prefix	+ "empe_knt", length));
			String[] intlPhnNo = (JSPUtil.getParameter(request, prefix	+ "intl_phn_no", length));
			
			for (int i = 0; i < length; i++) {
				model = new MnrPartnerVO();
				if (bzctNm[i] != null)
					model.setBzctNm(bzctNm[i]);
				if (mnrGrpTpCd[i] != null)
					model.setMnrGrpTpCd(mnrGrpTpCd[i]);
				if (spPtalId[i] != null)
					model.setSpPtalId(spPtalId[i]);
				if (bztpNm[i] != null)
					model.setBztpNm(bztpNm[i]);
				if (mnrPayrCntCd[i] != null)
					model.setMnrPayrCntCd(mnrPayrCntCd[i]);
				if (bzetAddr[i] != null)
					model.setBzetAddr(bzetAddr[i]);
				if (mnrPrnrLoclLangNm[i] != null)
					model.setMnrPrnrLoclLangNm(mnrPrnrLoclLangNm[i]);
				if (mnrPrnrAbbrNm[i] != null)
					model.setMnrPrnrAbbrNm(mnrPrnrAbbrNm[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (mnrPrnrSeq[i] != null)
					model.setMnrPrnrSeq(mnrPrnrSeq[i]);
				if (effDt[i] != null)
					model.setEffDt(effDt[i]);
				if (mnrPrnrRmk[i] != null)
					model.setMnrPrnrRmk(mnrPrnrRmk[i]);
				if (mnrPayrSeq[i] != null)
					model.setMnrPayrSeq(mnrPayrSeq[i]);
				if (bankNm[i] != null)
					model.setBankNm(bankNm[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (phnNo[i] != null)
					model.setPhnNo(phnNo[i]);
				if (payMzdCd[i] != null)
					model.setPayMzdCd(payMzdCd[i]);
				if (ctrlOfcCd[i] != null)
					model.setCtrlOfcCd(ctrlOfcCd[i]);
				if (mnrPrnrTpCd[i] != null)
					model.setMnrPrnrTpCd(mnrPrnrTpCd[i]);
				if (payTermDys[i] != null)
					model.setPayTermDys(payTermDys[i]);
				if (ediId[i] != null)
					model.setEdiId(ediId[i]);
				if (trsmModCd[i] != null)
					model.setTrsmModCd(trsmModCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (bizRgstNo[i] != null)
					model.setBizRgstNo(bizRgstNo[i]);
				if (mnrPrnrKndDtlCd[i] != null)
					model.setMnrPrnrKndDtlCd(mnrPrnrKndDtlCd[i]);
				if (zipCd[i] != null)
					model.setZipCd(zipCd[i]);
				if (mnrPrnrEml[i] != null)
					model.setMnrPrnrEml(mnrPrnrEml[i]);
				if (dptDesc[i] != null)
					model.setDptDesc(dptDesc[i]);
				if (faxNo[i] != null)
					model.setFaxNo(faxNo[i]);
				if (fileSeq[i] != null)
					model.setFileSeq(fileSeq[i]);
				if (ownrNm[i] != null)
					model.setOwnrNm(ownrNm[i]);
				if (mnrBilToNm[i] != null)
					model.setMnrBilToNm(mnrBilToNm[i]);
				if (bankAcctNo[i] != null)
					model.setBankAcctNo(bankAcctNo[i]);
				if (mnrPrnrCntCd[i] != null)
					model.setMnrPrnrCntCd(mnrPrnrCntCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (mnrPrnrAddr[i] != null)
					model.setMnrPrnrAddr(mnrPrnrAddr[i]);
				if (mnrPrnrCreSeq[i] != null)
					model.setMnrPrnrCreSeq(mnrPrnrCreSeq[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (intlFaxNo[i] != null)
					model.setIntlFaxNo(intlFaxNo[i]);
				if (expDt[i] != null)
					model.setExpDt(expDt[i]);
				if (mnrPrnrCapiAmt[i] != null)
					model.setMnrPrnrCapiAmt(mnrPrnrCapiAmt[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (mnrPrnrKndCd[i] != null)
					model.setMnrPrnrKndCd(mnrPrnrKndCd[i]);
				if (mnrPrnrStsCd[i] != null)
					model.setMnrPrnrStsCd(mnrPrnrStsCd[i]);
				if (mnrPrnrLglEngNm[i] != null)
					model.setMnrPrnrLglEngNm(mnrPrnrLglEngNm[i]);
				if (mnrShopFlg[i] != null)
					model.setMnrShopFlg(mnrShopFlg[i]);
				if (spPtalPwd[i] != null)
					model.setSpPtalPwd(spPtalPwd[i]);
				if (empeKnt[i] != null)
					model.setEmpeKnt(empeKnt[i]);
				if (intlPhnNo[i] != null)
					model.setIntlPhnNo(intlPhnNo[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getMnrPartnerVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return MnrPartnerVO[]
	 */
	public MnrPartnerVO[] getMnrPartnerVOs(){
		MnrPartnerVO[] vos = (MnrPartnerVO[])models.toArray(new MnrPartnerVO[models.size()]);
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
		this.bzctNm = this.bzctNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mnrGrpTpCd = this.mnrGrpTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spPtalId = this.spPtalId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bztpNm = this.bztpNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mnrPayrCntCd = this.mnrPayrCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bzetAddr = this.bzetAddr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mnrPrnrLoclLangNm = this.mnrPrnrLoclLangNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mnrPrnrAbbrNm = this.mnrPrnrAbbrNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mnrPrnrSeq = this.mnrPrnrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.effDt = this.effDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mnrPrnrRmk = this.mnrPrnrRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mnrPayrSeq = this.mnrPayrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bankNm = this.bankNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.phnNo = this.phnNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.payMzdCd = this.payMzdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ctrlOfcCd = this.ctrlOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mnrPrnrTpCd = this.mnrPrnrTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.payTermDys = this.payTermDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediId = this.ediId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trsmModCd = this.trsmModCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bizRgstNo = this.bizRgstNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mnrPrnrKndDtlCd = this.mnrPrnrKndDtlCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.zipCd = this.zipCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mnrPrnrEml = this.mnrPrnrEml .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dptDesc = this.dptDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faxNo = this.faxNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fileSeq = this.fileSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ownrNm = this.ownrNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mnrBilToNm = this.mnrBilToNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bankAcctNo = this.bankAcctNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mnrPrnrCntCd = this.mnrPrnrCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mnrPrnrAddr = this.mnrPrnrAddr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mnrPrnrCreSeq = this.mnrPrnrCreSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.intlFaxNo = this.intlFaxNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.expDt = this.expDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mnrPrnrCapiAmt = this.mnrPrnrCapiAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mnrPrnrKndCd = this.mnrPrnrKndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mnrPrnrStsCd = this.mnrPrnrStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mnrPrnrLglEngNm = this.mnrPrnrLglEngNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mnrShopFlg = this.mnrShopFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spPtalPwd = this.spPtalPwd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.empeKnt = this.empeKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.intlPhnNo = this.intlPhnNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
