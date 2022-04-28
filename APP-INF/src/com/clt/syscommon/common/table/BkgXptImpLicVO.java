/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgXptImpLicVO.java
*@FileTitle : BkgXptImpLicVO
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

public class BkgXptImpLicVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgXptImpLicVO> models = new ArrayList<BkgXptImpLicVO>();
	
	/* Column Info */
	private String ndrRefId = null;
	/* Column Info */
	private String tsRefNo = null;
	/* Column Info */
	private String idaIecNo = null;
	/* Column Info */
	private String aesPtuDt = null;
	/* Column Info */
	private String shprTaxNo = null;
	/* Column Info */
	private String xptLicNo = null;
	/* Column Info */
	private String aesExptCtnt = null;
	/* Column Info */
	private String aesExptId = null;
	/* Column Info */
	private String ausMfRefNo = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String divdPckQty = null;
	/* Column Info */
	private String b13aXptDt = null;
	/* Column Info */
	private String caedNo1 = null;
	/* Column Info */
	private String samPckTpCd = null;
	/* Column Info */
	private String caedNo3 = null;
	/* Column Info */
	private String caedNo2 = null;
	/* Column Info */
	private String cntCd = null;
	/* Column Info */
	private String wgtUtCd = null;
	/* Column Info */
	private String aesPtuPfxCtnt = null;
	/* Column Info */
	private String b13aXptNo2 = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String b13aXptNo1 = null;
	/* Column Info */
	private String ndrRefCtnt = null;
	/* Column Info */
	private String aesPtaDt = null;
	/* Column Info */
	private String aesDwnDt = null;
	/* Column Info */
	private String aesPtaPfxCtnt = null;
	/* Column Info */
	private String cneeTaxNo = null;
	/* Column Info */
	private String mfSmryRptNo = null;
	/* Column Info */
	private String cneeTaxCpyDescFlg = null;
	/* Column Info */
	private String aesTpCd = null;
	/* Column Info */
	private String divdPckTpCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String shprTaxCpyDescFlg = null;
	/* Column Info */
	private String aesPtuNo = null;
	/* Column Info */
	private String divdWgt = null;
	/* Column Info */
	private String ntfyTaxNo = null;
	/* Column Info */
	private String samPckSeq = null;
	/* Column Info */
	private String divdWgtUtCd = null;
	/* Column Info */
	private String g7EdiNo2 = null;
	/* Column Info */
	private String g7EdiNo1 = null;
	/* Column Info */
	private String aesPtaNo1 = null;
	/* Column Info */
	private String aesPtaNo2 = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String aesDwnPfxCtnt = null;
	/* Column Info */
	private String xptImpSeq = null;
	/* Column Info */
	private String samPckQty = null;
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String idXptNo = null;
	/* Column Info */
	private String idaIecCpyDescFlg = null;
	/* Column Info */
	private String pckQty = null;
	/* Column Info */
	private String ntfyTaxCpyDescFlg = null;
	/* Column Info */
	private String divdSeq = null;
	/* Column Info */
	private String pckTpCd = null;
	/* Column Info */
	private String brzDeclCpyDescFlg = null;
	/* Column Info */
	private String idDeclCd = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String brzCmdtCd = null;
	/* Column Info */
	private String bkgNoSplit = null;
	/* Column Info */
	private String aesDwnNo = null;
	/* Column Info */
	private String brzDeclNo = null;
	/* Column Info */
	private String ioBndCd = null;
	/* Column Info */
	private String mfWgt = null;
	/* Column Info */
	private String idOfcCd = null;
	/* Column Info */
	private String ucrNo = null;
	/* Column Info */
	private String divdFlg = null;
	/* Column Info */
	private String cgoCtrlNo = null;
	/* Column Info */
	private String aesInlndTrnsNo = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgXptImpLicVO() {}

	public BkgXptImpLicVO(String ibflag, String pagerows, String bkgNo, String bkgNoSplit, String ioBndCd, String xptImpSeq, String cntCd, String xptLicNo, String tsRefNo, String pckQty, String pckTpCd, String mfWgt, String wgtUtCd, String divdFlg, String divdSeq, String divdPckQty, String divdPckTpCd, String divdWgt, String divdWgtUtCd, String samPckSeq, String samPckQty, String samPckTpCd, String ucrNo, String ausMfRefNo, String aesTpCd, String aesInlndTrnsNo, String aesPtaPfxCtnt, String aesPtaNo1, String aesPtaNo2, String aesPtaDt, String aesPtuPfxCtnt, String aesPtuNo, String aesPtuDt, String aesDwnPfxCtnt, String aesDwnNo, String aesDwnDt, String aesExptId, String aesExptCtnt, String shprTaxNo, String shprTaxCpyDescFlg, String cneeTaxNo, String cneeTaxCpyDescFlg, String ntfyTaxNo, String ntfyTaxCpyDescFlg, String brzDeclNo, String brzDeclCpyDescFlg, String brzCmdtCd, String idDeclCd, String idXptNo, String idOfcCd, String idaIecNo, String idaIecCpyDescFlg, String caedNo1, String caedNo2, String caedNo3, String g7EdiNo1, String g7EdiNo2, String b13aXptDt, String b13aXptNo1, String b13aXptNo2, String mfSmryRptNo, String cgoCtrlNo, String ndrRefId, String ndrRefCtnt, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.ndrRefId = ndrRefId;
		this.tsRefNo = tsRefNo;
		this.idaIecNo = idaIecNo;
		this.aesPtuDt = aesPtuDt;
		this.shprTaxNo = shprTaxNo;
		this.xptLicNo = xptLicNo;
		this.aesExptCtnt = aesExptCtnt;
		this.aesExptId = aesExptId;
		this.ausMfRefNo = ausMfRefNo;
		this.pagerows = pagerows;
		this.divdPckQty = divdPckQty;
		this.b13aXptDt = b13aXptDt;
		this.caedNo1 = caedNo1;
		this.samPckTpCd = samPckTpCd;
		this.caedNo3 = caedNo3;
		this.caedNo2 = caedNo2;
		this.cntCd = cntCd;
		this.wgtUtCd = wgtUtCd;
		this.aesPtuPfxCtnt = aesPtuPfxCtnt;
		this.b13aXptNo2 = b13aXptNo2;
		this.updUsrId = updUsrId;
		this.b13aXptNo1 = b13aXptNo1;
		this.ndrRefCtnt = ndrRefCtnt;
		this.aesPtaDt = aesPtaDt;
		this.aesDwnDt = aesDwnDt;
		this.aesPtaPfxCtnt = aesPtaPfxCtnt;
		this.cneeTaxNo = cneeTaxNo;
		this.mfSmryRptNo = mfSmryRptNo;
		this.cneeTaxCpyDescFlg = cneeTaxCpyDescFlg;
		this.aesTpCd = aesTpCd;
		this.divdPckTpCd = divdPckTpCd;
		this.creUsrId = creUsrId;
		this.bkgNo = bkgNo;
		this.shprTaxCpyDescFlg = shprTaxCpyDescFlg;
		this.aesPtuNo = aesPtuNo;
		this.divdWgt = divdWgt;
		this.ntfyTaxNo = ntfyTaxNo;
		this.samPckSeq = samPckSeq;
		this.divdWgtUtCd = divdWgtUtCd;
		this.g7EdiNo2 = g7EdiNo2;
		this.g7EdiNo1 = g7EdiNo1;
		this.aesPtaNo1 = aesPtaNo1;
		this.aesPtaNo2 = aesPtaNo2;
		this.creDt = creDt;
		this.aesDwnPfxCtnt = aesDwnPfxCtnt;
		this.xptImpSeq = xptImpSeq;
		this.samPckQty = samPckQty;
		this.ibflag = ibflag;
		this.idXptNo = idXptNo;
		this.idaIecCpyDescFlg = idaIecCpyDescFlg;
		this.pckQty = pckQty;
		this.ntfyTaxCpyDescFlg = ntfyTaxCpyDescFlg;
		this.divdSeq = divdSeq;
		this.pckTpCd = pckTpCd;
		this.brzDeclCpyDescFlg = brzDeclCpyDescFlg;
		this.idDeclCd = idDeclCd;
		this.updDt = updDt;
		this.brzCmdtCd = brzCmdtCd;
		this.bkgNoSplit = bkgNoSplit;
		this.aesDwnNo = aesDwnNo;
		this.brzDeclNo = brzDeclNo;
		this.ioBndCd = ioBndCd;
		this.mfWgt = mfWgt;
		this.idOfcCd = idOfcCd;
		this.ucrNo = ucrNo;
		this.divdFlg = divdFlg;
		this.cgoCtrlNo = cgoCtrlNo;
		this.aesInlndTrnsNo = aesInlndTrnsNo;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("ndr_ref_id", getNdrRefId());
		this.hashColumns.put("ts_ref_no", getTsRefNo());
		this.hashColumns.put("ida_iec_no", getIdaIecNo());
		this.hashColumns.put("aes_ptu_dt", getAesPtuDt());
		this.hashColumns.put("shpr_tax_no", getShprTaxNo());
		this.hashColumns.put("xpt_lic_no", getXptLicNo());
		this.hashColumns.put("aes_expt_ctnt", getAesExptCtnt());
		this.hashColumns.put("aes_expt_id", getAesExptId());
		this.hashColumns.put("aus_mf_ref_no", getAusMfRefNo());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("divd_pck_qty", getDivdPckQty());
		this.hashColumns.put("b13a_xpt_dt", getB13aXptDt());
		this.hashColumns.put("caed_no1", getCaedNo1());
		this.hashColumns.put("sam_pck_tp_cd", getSamPckTpCd());
		this.hashColumns.put("caed_no3", getCaedNo3());
		this.hashColumns.put("caed_no2", getCaedNo2());
		this.hashColumns.put("cnt_cd", getCntCd());
		this.hashColumns.put("wgt_ut_cd", getWgtUtCd());
		this.hashColumns.put("aes_ptu_pfx_ctnt", getAesPtuPfxCtnt());
		this.hashColumns.put("b13a_xpt_no2", getB13aXptNo2());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("b13a_xpt_no1", getB13aXptNo1());
		this.hashColumns.put("ndr_ref_ctnt", getNdrRefCtnt());
		this.hashColumns.put("aes_pta_dt", getAesPtaDt());
		this.hashColumns.put("aes_dwn_dt", getAesDwnDt());
		this.hashColumns.put("aes_pta_pfx_ctnt", getAesPtaPfxCtnt());
		this.hashColumns.put("cnee_tax_no", getCneeTaxNo());
		this.hashColumns.put("mf_smry_rpt_no", getMfSmryRptNo());
		this.hashColumns.put("cnee_tax_cpy_desc_flg", getCneeTaxCpyDescFlg());
		this.hashColumns.put("aes_tp_cd", getAesTpCd());
		this.hashColumns.put("divd_pck_tp_cd", getDivdPckTpCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("shpr_tax_cpy_desc_flg", getShprTaxCpyDescFlg());
		this.hashColumns.put("aes_ptu_no", getAesPtuNo());
		this.hashColumns.put("divd_wgt", getDivdWgt());
		this.hashColumns.put("ntfy_tax_no", getNtfyTaxNo());
		this.hashColumns.put("sam_pck_seq", getSamPckSeq());
		this.hashColumns.put("divd_wgt_ut_cd", getDivdWgtUtCd());
		this.hashColumns.put("g7_edi_no2", getG7EdiNo2());
		this.hashColumns.put("g7_edi_no1", getG7EdiNo1());
		this.hashColumns.put("aes_pta_no1", getAesPtaNo1());
		this.hashColumns.put("aes_pta_no2", getAesPtaNo2());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("aes_dwn_pfx_ctnt", getAesDwnPfxCtnt());
		this.hashColumns.put("xpt_imp_seq", getXptImpSeq());
		this.hashColumns.put("sam_pck_qty", getSamPckQty());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("id_xpt_no", getIdXptNo());
		this.hashColumns.put("ida_iec_cpy_desc_flg", getIdaIecCpyDescFlg());
		this.hashColumns.put("pck_qty", getPckQty());
		this.hashColumns.put("ntfy_tax_cpy_desc_flg", getNtfyTaxCpyDescFlg());
		this.hashColumns.put("divd_seq", getDivdSeq());
		this.hashColumns.put("pck_tp_cd", getPckTpCd());
		this.hashColumns.put("brz_decl_cpy_desc_flg", getBrzDeclCpyDescFlg());
		this.hashColumns.put("id_decl_cd", getIdDeclCd());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("brz_cmdt_cd", getBrzCmdtCd());
		this.hashColumns.put("bkg_no_split", getBkgNoSplit());
		this.hashColumns.put("aes_dwn_no", getAesDwnNo());
		this.hashColumns.put("brz_decl_no", getBrzDeclNo());
		this.hashColumns.put("io_bnd_cd", getIoBndCd());
		this.hashColumns.put("mf_wgt", getMfWgt());
		this.hashColumns.put("id_ofc_cd", getIdOfcCd());
		this.hashColumns.put("ucr_no", getUcrNo());
		this.hashColumns.put("divd_flg", getDivdFlg());
		this.hashColumns.put("cgo_ctrl_no", getCgoCtrlNo());
		this.hashColumns.put("aes_inlnd_trns_no", getAesInlndTrnsNo());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("ndr_ref_id", "ndrRefId");
		this.hashFields.put("ts_ref_no", "tsRefNo");
		this.hashFields.put("ida_iec_no", "idaIecNo");
		this.hashFields.put("aes_ptu_dt", "aesPtuDt");
		this.hashFields.put("shpr_tax_no", "shprTaxNo");
		this.hashFields.put("xpt_lic_no", "xptLicNo");
		this.hashFields.put("aes_expt_ctnt", "aesExptCtnt");
		this.hashFields.put("aes_expt_id", "aesExptId");
		this.hashFields.put("aus_mf_ref_no", "ausMfRefNo");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("divd_pck_qty", "divdPckQty");
		this.hashFields.put("b13a_xpt_dt", "b13aXptDt");
		this.hashFields.put("caed_no1", "caedNo1");
		this.hashFields.put("sam_pck_tp_cd", "samPckTpCd");
		this.hashFields.put("caed_no3", "caedNo3");
		this.hashFields.put("caed_no2", "caedNo2");
		this.hashFields.put("cnt_cd", "cntCd");
		this.hashFields.put("wgt_ut_cd", "wgtUtCd");
		this.hashFields.put("aes_ptu_pfx_ctnt", "aesPtuPfxCtnt");
		this.hashFields.put("b13a_xpt_no2", "b13aXptNo2");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("b13a_xpt_no1", "b13aXptNo1");
		this.hashFields.put("ndr_ref_ctnt", "ndrRefCtnt");
		this.hashFields.put("aes_pta_dt", "aesPtaDt");
		this.hashFields.put("aes_dwn_dt", "aesDwnDt");
		this.hashFields.put("aes_pta_pfx_ctnt", "aesPtaPfxCtnt");
		this.hashFields.put("cnee_tax_no", "cneeTaxNo");
		this.hashFields.put("mf_smry_rpt_no", "mfSmryRptNo");
		this.hashFields.put("cnee_tax_cpy_desc_flg", "cneeTaxCpyDescFlg");
		this.hashFields.put("aes_tp_cd", "aesTpCd");
		this.hashFields.put("divd_pck_tp_cd", "divdPckTpCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("shpr_tax_cpy_desc_flg", "shprTaxCpyDescFlg");
		this.hashFields.put("aes_ptu_no", "aesPtuNo");
		this.hashFields.put("divd_wgt", "divdWgt");
		this.hashFields.put("ntfy_tax_no", "ntfyTaxNo");
		this.hashFields.put("sam_pck_seq", "samPckSeq");
		this.hashFields.put("divd_wgt_ut_cd", "divdWgtUtCd");
		this.hashFields.put("g7_edi_no2", "g7EdiNo2");
		this.hashFields.put("g7_edi_no1", "g7EdiNo1");
		this.hashFields.put("aes_pta_no1", "aesPtaNo1");
		this.hashFields.put("aes_pta_no2", "aesPtaNo2");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("aes_dwn_pfx_ctnt", "aesDwnPfxCtnt");
		this.hashFields.put("xpt_imp_seq", "xptImpSeq");
		this.hashFields.put("sam_pck_qty", "samPckQty");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("id_xpt_no", "idXptNo");
		this.hashFields.put("ida_iec_cpy_desc_flg", "idaIecCpyDescFlg");
		this.hashFields.put("pck_qty", "pckQty");
		this.hashFields.put("ntfy_tax_cpy_desc_flg", "ntfyTaxCpyDescFlg");
		this.hashFields.put("divd_seq", "divdSeq");
		this.hashFields.put("pck_tp_cd", "pckTpCd");
		this.hashFields.put("brz_decl_cpy_desc_flg", "brzDeclCpyDescFlg");
		this.hashFields.put("id_decl_cd", "idDeclCd");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("brz_cmdt_cd", "brzCmdtCd");
		this.hashFields.put("bkg_no_split", "bkgNoSplit");
		this.hashFields.put("aes_dwn_no", "aesDwnNo");
		this.hashFields.put("brz_decl_no", "brzDeclNo");
		this.hashFields.put("io_bnd_cd", "ioBndCd");
		this.hashFields.put("mf_wgt", "mfWgt");
		this.hashFields.put("id_ofc_cd", "idOfcCd");
		this.hashFields.put("ucr_no", "ucrNo");
		this.hashFields.put("divd_flg", "divdFlg");
		this.hashFields.put("cgo_ctrl_no", "cgoCtrlNo");
		this.hashFields.put("aes_inlnd_trns_no", "aesInlndTrnsNo");
		return this.hashFields;
	}
	
	public String getNdrRefId() {
		return this.ndrRefId;
	}
	public String getTsRefNo() {
		return this.tsRefNo;
	}
	public String getIdaIecNo() {
		return this.idaIecNo;
	}
	public String getAesPtuDt() {
		return this.aesPtuDt;
	}
	public String getShprTaxNo() {
		return this.shprTaxNo;
	}
	public String getXptLicNo() {
		return this.xptLicNo;
	}
	public String getAesExptCtnt() {
		return this.aesExptCtnt;
	}
	public String getAesExptId() {
		return this.aesExptId;
	}
	public String getAusMfRefNo() {
		return this.ausMfRefNo;
	}
	public String getPagerows() {
		return this.pagerows;
	}
	public String getDivdPckQty() {
		return this.divdPckQty;
	}
	public String getB13aXptDt() {
		return this.b13aXptDt;
	}
	public String getCaedNo1() {
		return this.caedNo1;
	}
	public String getSamPckTpCd() {
		return this.samPckTpCd;
	}
	public String getCaedNo3() {
		return this.caedNo3;
	}
	public String getCaedNo2() {
		return this.caedNo2;
	}
	public String getCntCd() {
		return this.cntCd;
	}
	public String getWgtUtCd() {
		return this.wgtUtCd;
	}
	public String getAesPtuPfxCtnt() {
		return this.aesPtuPfxCtnt;
	}
	public String getB13aXptNo2() {
		return this.b13aXptNo2;
	}
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	public String getB13aXptNo1() {
		return this.b13aXptNo1;
	}
	public String getNdrRefCtnt() {
		return this.ndrRefCtnt;
	}
	public String getAesPtaDt() {
		return this.aesPtaDt;
	}
	public String getAesDwnDt() {
		return this.aesDwnDt;
	}
	public String getAesPtaPfxCtnt() {
		return this.aesPtaPfxCtnt;
	}
	public String getCneeTaxNo() {
		return this.cneeTaxNo;
	}
	public String getMfSmryRptNo() {
		return this.mfSmryRptNo;
	}
	public String getCneeTaxCpyDescFlg() {
		return this.cneeTaxCpyDescFlg;
	}
	public String getAesTpCd() {
		return this.aesTpCd;
	}
	public String getDivdPckTpCd() {
		return this.divdPckTpCd;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getBkgNo() {
		return this.bkgNo;
	}
	public String getShprTaxCpyDescFlg() {
		return this.shprTaxCpyDescFlg;
	}
	public String getAesPtuNo() {
		return this.aesPtuNo;
	}
	public String getDivdWgt() {
		return this.divdWgt;
	}
	public String getNtfyTaxNo() {
		return this.ntfyTaxNo;
	}
	public String getSamPckSeq() {
		return this.samPckSeq;
	}
	public String getDivdWgtUtCd() {
		return this.divdWgtUtCd;
	}
	public String getG7EdiNo2() {
		return this.g7EdiNo2;
	}
	public String getG7EdiNo1() {
		return this.g7EdiNo1;
	}
	public String getAesPtaNo1() {
		return this.aesPtaNo1;
	}
	public String getAesPtaNo2() {
		return this.aesPtaNo2;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getAesDwnPfxCtnt() {
		return this.aesDwnPfxCtnt;
	}
	public String getXptImpSeq() {
		return this.xptImpSeq;
	}
	public String getSamPckQty() {
		return this.samPckQty;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getIdXptNo() {
		return this.idXptNo;
	}
	public String getIdaIecCpyDescFlg() {
		return this.idaIecCpyDescFlg;
	}
	public String getPckQty() {
		return this.pckQty;
	}
	public String getNtfyTaxCpyDescFlg() {
		return this.ntfyTaxCpyDescFlg;
	}
	public String getDivdSeq() {
		return this.divdSeq;
	}
	public String getPckTpCd() {
		return this.pckTpCd;
	}
	public String getBrzDeclCpyDescFlg() {
		return this.brzDeclCpyDescFlg;
	}
	public String getIdDeclCd() {
		return this.idDeclCd;
	}
	public String getUpdDt() {
		return this.updDt;
	}
	public String getBrzCmdtCd() {
		return this.brzCmdtCd;
	}
	public String getBkgNoSplit() {
		return this.bkgNoSplit;
	}
	public String getAesDwnNo() {
		return this.aesDwnNo;
	}
	public String getBrzDeclNo() {
		return this.brzDeclNo;
	}
	public String getIoBndCd() {
		return this.ioBndCd;
	}
	public String getMfWgt() {
		return this.mfWgt;
	}
	public String getIdOfcCd() {
		return this.idOfcCd;
	}
	public String getUcrNo() {
		return this.ucrNo;
	}
	public String getDivdFlg() {
		return this.divdFlg;
	}
	public String getCgoCtrlNo() {
		return this.cgoCtrlNo;
	}
	public String getAesInlndTrnsNo() {
		return this.aesInlndTrnsNo;
	}

	public void setNdrRefId(String ndrRefId) {
		this.ndrRefId = ndrRefId;
		//this.ndrRefId=true;
	}
	public void setTsRefNo(String tsRefNo) {
		this.tsRefNo = tsRefNo;
		//this.tsRefNo=true;
	}
	public void setIdaIecNo(String idaIecNo) {
		this.idaIecNo = idaIecNo;
		//this.idaIecNo=true;
	}
	public void setAesPtuDt(String aesPtuDt) {
		this.aesPtuDt = aesPtuDt;
		//this.aesPtuDt=true;
	}
	public void setShprTaxNo(String shprTaxNo) {
		this.shprTaxNo = shprTaxNo;
		//this.shprTaxNo=true;
	}
	public void setXptLicNo(String xptLicNo) {
		this.xptLicNo = xptLicNo;
		//this.xptLicNo=true;
	}
	public void setAesExptCtnt(String aesExptCtnt) {
		this.aesExptCtnt = aesExptCtnt;
		//this.aesExptCtnt=true;
	}
	public void setAesExptId(String aesExptId) {
		this.aesExptId = aesExptId;
		//this.aesExptId=true;
	}
	public void setAusMfRefNo(String ausMfRefNo) {
		this.ausMfRefNo = ausMfRefNo;
		//this.ausMfRefNo=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void setDivdPckQty(String divdPckQty) {
		this.divdPckQty = divdPckQty;
		//this.divdPckQty=true;
	}
	public void setB13aXptDt(String b13aXptDt) {
		this.b13aXptDt = b13aXptDt;
		//this.b13aXptDt=true;
	}
	public void setCaedNo1(String caedNo1) {
		this.caedNo1 = caedNo1;
		//this.caedNo1=true;
	}
	public void setSamPckTpCd(String samPckTpCd) {
		this.samPckTpCd = samPckTpCd;
		//this.samPckTpCd=true;
	}
	public void setCaedNo3(String caedNo3) {
		this.caedNo3 = caedNo3;
		//this.caedNo3=true;
	}
	public void setCaedNo2(String caedNo2) {
		this.caedNo2 = caedNo2;
		//this.caedNo2=true;
	}
	public void setCntCd(String cntCd) {
		this.cntCd = cntCd;
		//this.cntCd=true;
	}
	public void setWgtUtCd(String wgtUtCd) {
		this.wgtUtCd = wgtUtCd;
		//this.wgtUtCd=true;
	}
	public void setAesPtuPfxCtnt(String aesPtuPfxCtnt) {
		this.aesPtuPfxCtnt = aesPtuPfxCtnt;
		//this.aesPtuPfxCtnt=true;
	}
	public void setB13aXptNo2(String b13aXptNo2) {
		this.b13aXptNo2 = b13aXptNo2;
		//this.b13aXptNo2=true;
	}
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void setB13aXptNo1(String b13aXptNo1) {
		this.b13aXptNo1 = b13aXptNo1;
		//this.b13aXptNo1=true;
	}
	public void setNdrRefCtnt(String ndrRefCtnt) {
		this.ndrRefCtnt = ndrRefCtnt;
		//this.ndrRefCtnt=true;
	}
	public void setAesPtaDt(String aesPtaDt) {
		this.aesPtaDt = aesPtaDt;
		//this.aesPtaDt=true;
	}
	public void setAesDwnDt(String aesDwnDt) {
		this.aesDwnDt = aesDwnDt;
		//this.aesDwnDt=true;
	}
	public void setAesPtaPfxCtnt(String aesPtaPfxCtnt) {
		this.aesPtaPfxCtnt = aesPtaPfxCtnt;
		//this.aesPtaPfxCtnt=true;
	}
	public void setCneeTaxNo(String cneeTaxNo) {
		this.cneeTaxNo = cneeTaxNo;
		//this.cneeTaxNo=true;
	}
	public void setMfSmryRptNo(String mfSmryRptNo) {
		this.mfSmryRptNo = mfSmryRptNo;
		//this.mfSmryRptNo=true;
	}
	public void setCneeTaxCpyDescFlg(String cneeTaxCpyDescFlg) {
		this.cneeTaxCpyDescFlg = cneeTaxCpyDescFlg;
		//this.cneeTaxCpyDescFlg=true;
	}
	public void setAesTpCd(String aesTpCd) {
		this.aesTpCd = aesTpCd;
		//this.aesTpCd=true;
	}
	public void setDivdPckTpCd(String divdPckTpCd) {
		this.divdPckTpCd = divdPckTpCd;
		//this.divdPckTpCd=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setBkgNo(String bkgNo) {
		this.bkgNo = bkgNo;
		//this.bkgNo=true;
	}
	public void setShprTaxCpyDescFlg(String shprTaxCpyDescFlg) {
		this.shprTaxCpyDescFlg = shprTaxCpyDescFlg;
		//this.shprTaxCpyDescFlg=true;
	}
	public void setAesPtuNo(String aesPtuNo) {
		this.aesPtuNo = aesPtuNo;
		//this.aesPtuNo=true;
	}
	public void setDivdWgt(String divdWgt) {
		this.divdWgt = divdWgt;
		//this.divdWgt=true;
	}
	public void setNtfyTaxNo(String ntfyTaxNo) {
		this.ntfyTaxNo = ntfyTaxNo;
		//this.ntfyTaxNo=true;
	}
	public void setSamPckSeq(String samPckSeq) {
		this.samPckSeq = samPckSeq;
		//this.samPckSeq=true;
	}
	public void setDivdWgtUtCd(String divdWgtUtCd) {
		this.divdWgtUtCd = divdWgtUtCd;
		//this.divdWgtUtCd=true;
	}
	public void setG7EdiNo2(String g7EdiNo2) {
		this.g7EdiNo2 = g7EdiNo2;
		//this.g7EdiNo2=true;
	}
	public void setG7EdiNo1(String g7EdiNo1) {
		this.g7EdiNo1 = g7EdiNo1;
		//this.g7EdiNo1=true;
	}
	public void setAesPtaNo1(String aesPtaNo1) {
		this.aesPtaNo1 = aesPtaNo1;
		//this.aesPtaNo1=true;
	}
	public void setAesPtaNo2(String aesPtaNo2) {
		this.aesPtaNo2 = aesPtaNo2;
		//this.aesPtaNo2=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setAesDwnPfxCtnt(String aesDwnPfxCtnt) {
		this.aesDwnPfxCtnt = aesDwnPfxCtnt;
		//this.aesDwnPfxCtnt=true;
	}
	public void setXptImpSeq(String xptImpSeq) {
		this.xptImpSeq = xptImpSeq;
		//this.xptImpSeq=true;
	}
	public void setSamPckQty(String samPckQty) {
		this.samPckQty = samPckQty;
		//this.samPckQty=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setIdXptNo(String idXptNo) {
		this.idXptNo = idXptNo;
		//this.idXptNo=true;
	}
	public void setIdaIecCpyDescFlg(String idaIecCpyDescFlg) {
		this.idaIecCpyDescFlg = idaIecCpyDescFlg;
		//this.idaIecCpyDescFlg=true;
	}
	public void setPckQty(String pckQty) {
		this.pckQty = pckQty;
		//this.pckQty=true;
	}
	public void setNtfyTaxCpyDescFlg(String ntfyTaxCpyDescFlg) {
		this.ntfyTaxCpyDescFlg = ntfyTaxCpyDescFlg;
		//this.ntfyTaxCpyDescFlg=true;
	}
	public void setDivdSeq(String divdSeq) {
		this.divdSeq = divdSeq;
		//this.divdSeq=true;
	}
	public void setPckTpCd(String pckTpCd) {
		this.pckTpCd = pckTpCd;
		//this.pckTpCd=true;
	}
	public void setBrzDeclCpyDescFlg(String brzDeclCpyDescFlg) {
		this.brzDeclCpyDescFlg = brzDeclCpyDescFlg;
		//this.brzDeclCpyDescFlg=true;
	}
	public void setIdDeclCd(String idDeclCd) {
		this.idDeclCd = idDeclCd;
		//this.idDeclCd=true;
	}
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setBrzCmdtCd(String brzCmdtCd) {
		this.brzCmdtCd = brzCmdtCd;
		//this.brzCmdtCd=true;
	}
	public void setBkgNoSplit(String bkgNoSplit) {
		this.bkgNoSplit = bkgNoSplit;
		//this.bkgNoSplit=true;
	}
	public void setAesDwnNo(String aesDwnNo) {
		this.aesDwnNo = aesDwnNo;
		//this.aesDwnNo=true;
	}
	public void setBrzDeclNo(String brzDeclNo) {
		this.brzDeclNo = brzDeclNo;
		//this.brzDeclNo=true;
	}
	public void setIoBndCd(String ioBndCd) {
		this.ioBndCd = ioBndCd;
		//this.ioBndCd=true;
	}
	public void setMfWgt(String mfWgt) {
		this.mfWgt = mfWgt;
		//this.mfWgt=true;
	}
	public void setIdOfcCd(String idOfcCd) {
		this.idOfcCd = idOfcCd;
		//this.idOfcCd=true;
	}
	public void setUcrNo(String ucrNo) {
		this.ucrNo = ucrNo;
		//this.ucrNo=true;
	}
	public void setDivdFlg(String divdFlg) {
		this.divdFlg = divdFlg;
		//this.divdFlg=true;
	}
	public void setCgoCtrlNo(String cgoCtrlNo) {
		this.cgoCtrlNo = cgoCtrlNo;
		//this.cgoCtrlNo=true;
	}
	public void setAesInlndTrnsNo(String aesInlndTrnsNo) {
		this.aesInlndTrnsNo = aesInlndTrnsNo;
		//this.aesInlndTrnsNo=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setNdrRefId(JSPUtil.getParameter(request, "ndr_ref_id", ""));
		setTsRefNo(JSPUtil.getParameter(request, "ts_ref_no", ""));
		setIdaIecNo(JSPUtil.getParameter(request, "ida_iec_no", ""));
		setAesPtuDt(JSPUtil.getParameter(request, "aes_ptu_dt", ""));
		setShprTaxNo(JSPUtil.getParameter(request, "shpr_tax_no", ""));
		setXptLicNo(JSPUtil.getParameter(request, "xpt_lic_no", ""));
		setAesExptCtnt(JSPUtil.getParameter(request, "aes_expt_ctnt", ""));
		setAesExptId(JSPUtil.getParameter(request, "aes_expt_id", ""));
		setAusMfRefNo(JSPUtil.getParameter(request, "aus_mf_ref_no", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setDivdPckQty(JSPUtil.getParameter(request, "divd_pck_qty", ""));
		setB13aXptDt(JSPUtil.getParameter(request, "b13a_xpt_dt", ""));
		setCaedNo1(JSPUtil.getParameter(request, "caed_no1", ""));
		setSamPckTpCd(JSPUtil.getParameter(request, "sam_pck_tp_cd", ""));
		setCaedNo3(JSPUtil.getParameter(request, "caed_no3", ""));
		setCaedNo2(JSPUtil.getParameter(request, "caed_no2", ""));
		setCntCd(JSPUtil.getParameter(request, "cnt_cd", ""));
		setWgtUtCd(JSPUtil.getParameter(request, "wgt_ut_cd", ""));
		setAesPtuPfxCtnt(JSPUtil.getParameter(request, "aes_ptu_pfx_ctnt", ""));
		setB13aXptNo2(JSPUtil.getParameter(request, "b13a_xpt_no2", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setB13aXptNo1(JSPUtil.getParameter(request, "b13a_xpt_no1", ""));
		setNdrRefCtnt(JSPUtil.getParameter(request, "ndr_ref_ctnt", ""));
		setAesPtaDt(JSPUtil.getParameter(request, "aes_pta_dt", ""));
		setAesDwnDt(JSPUtil.getParameter(request, "aes_dwn_dt", ""));
		setAesPtaPfxCtnt(JSPUtil.getParameter(request, "aes_pta_pfx_ctnt", ""));
		setCneeTaxNo(JSPUtil.getParameter(request, "cnee_tax_no", ""));
		setMfSmryRptNo(JSPUtil.getParameter(request, "mf_smry_rpt_no", ""));
		setCneeTaxCpyDescFlg(JSPUtil.getParameter(request, "cnee_tax_cpy_desc_flg", ""));
		setAesTpCd(JSPUtil.getParameter(request, "aes_tp_cd", ""));
		setDivdPckTpCd(JSPUtil.getParameter(request, "divd_pck_tp_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setShprTaxCpyDescFlg(JSPUtil.getParameter(request, "shpr_tax_cpy_desc_flg", ""));
		setAesPtuNo(JSPUtil.getParameter(request, "aes_ptu_no", ""));
		setDivdWgt(JSPUtil.getParameter(request, "divd_wgt", ""));
		setNtfyTaxNo(JSPUtil.getParameter(request, "ntfy_tax_no", ""));
		setSamPckSeq(JSPUtil.getParameter(request, "sam_pck_seq", ""));
		setDivdWgtUtCd(JSPUtil.getParameter(request, "divd_wgt_ut_cd", ""));
		setG7EdiNo2(JSPUtil.getParameter(request, "g7_edi_no2", ""));
		setG7EdiNo1(JSPUtil.getParameter(request, "g7_edi_no1", ""));
		setAesPtaNo1(JSPUtil.getParameter(request, "aes_pta_no1", ""));
		setAesPtaNo2(JSPUtil.getParameter(request, "aes_pta_no2", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setAesDwnPfxCtnt(JSPUtil.getParameter(request, "aes_dwn_pfx_ctnt", ""));
		setXptImpSeq(JSPUtil.getParameter(request, "xpt_imp_seq", ""));
		setSamPckQty(JSPUtil.getParameter(request, "sam_pck_qty", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setIdXptNo(JSPUtil.getParameter(request, "id_xpt_no", ""));
		setIdaIecCpyDescFlg(JSPUtil.getParameter(request, "ida_iec_cpy_desc_flg", ""));
		setPckQty(JSPUtil.getParameter(request, "pck_qty", ""));
		setNtfyTaxCpyDescFlg(JSPUtil.getParameter(request, "ntfy_tax_cpy_desc_flg", ""));
		setDivdSeq(JSPUtil.getParameter(request, "divd_seq", ""));
		setPckTpCd(JSPUtil.getParameter(request, "pck_tp_cd", ""));
		setBrzDeclCpyDescFlg(JSPUtil.getParameter(request, "brz_decl_cpy_desc_flg", ""));
		setIdDeclCd(JSPUtil.getParameter(request, "id_decl_cd", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setBrzCmdtCd(JSPUtil.getParameter(request, "brz_cmdt_cd", ""));
		setBkgNoSplit(JSPUtil.getParameter(request, "bkg_no_split", ""));
		setAesDwnNo(JSPUtil.getParameter(request, "aes_dwn_no", ""));
		setBrzDeclNo(JSPUtil.getParameter(request, "brz_decl_no", ""));
		setIoBndCd(JSPUtil.getParameter(request, "io_bnd_cd", ""));
		setMfWgt(JSPUtil.getParameter(request, "mf_wgt", ""));
		setIdOfcCd(JSPUtil.getParameter(request, "id_ofc_cd", ""));
		setUcrNo(JSPUtil.getParameter(request, "ucr_no", ""));
		setDivdFlg(JSPUtil.getParameter(request, "divd_flg", ""));
		setCgoCtrlNo(JSPUtil.getParameter(request, "cgo_ctrl_no", ""));
		setAesInlndTrnsNo(JSPUtil.getParameter(request, "aes_inlnd_trns_no", ""));
	}

	public BkgXptImpLicVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public BkgXptImpLicVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgXptImpLicVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] ndrRefId = (JSPUtil.getParameter(request, prefix	+ "ndr_ref_id".trim(), length));
			String[] tsRefNo = (JSPUtil.getParameter(request, prefix	+ "ts_ref_no".trim(), length));
			String[] idaIecNo = (JSPUtil.getParameter(request, prefix	+ "ida_iec_no".trim(), length));
			String[] aesPtuDt = (JSPUtil.getParameter(request, prefix	+ "aes_ptu_dt".trim(), length));
			String[] shprTaxNo = (JSPUtil.getParameter(request, prefix	+ "shpr_tax_no".trim(), length));
			String[] xptLicNo = (JSPUtil.getParameter(request, prefix	+ "xpt_lic_no".trim(), length));
			String[] aesExptCtnt = (JSPUtil.getParameter(request, prefix	+ "aes_expt_ctnt".trim(), length));
			String[] aesExptId = (JSPUtil.getParameter(request, prefix	+ "aes_expt_id".trim(), length));
			String[] ausMfRefNo = (JSPUtil.getParameter(request, prefix	+ "aus_mf_ref_no".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] divdPckQty = (JSPUtil.getParameter(request, prefix	+ "divd_pck_qty".trim(), length));
			String[] b13aXptDt = (JSPUtil.getParameter(request, prefix	+ "b13a_xpt_dt".trim(), length));
			String[] caedNo1 = (JSPUtil.getParameter(request, prefix	+ "caed_no1".trim(), length));
			String[] samPckTpCd = (JSPUtil.getParameter(request, prefix	+ "sam_pck_tp_cd".trim(), length));
			String[] caedNo3 = (JSPUtil.getParameter(request, prefix	+ "caed_no3".trim(), length));
			String[] caedNo2 = (JSPUtil.getParameter(request, prefix	+ "caed_no2".trim(), length));
			String[] cntCd = (JSPUtil.getParameter(request, prefix	+ "cnt_cd".trim(), length));
			String[] wgtUtCd = (JSPUtil.getParameter(request, prefix	+ "wgt_ut_cd".trim(), length));
			String[] aesPtuPfxCtnt = (JSPUtil.getParameter(request, prefix	+ "aes_ptu_pfx_ctnt".trim(), length));
			String[] b13aXptNo2 = (JSPUtil.getParameter(request, prefix	+ "b13a_xpt_no2".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] b13aXptNo1 = (JSPUtil.getParameter(request, prefix	+ "b13a_xpt_no1".trim(), length));
			String[] ndrRefCtnt = (JSPUtil.getParameter(request, prefix	+ "ndr_ref_ctnt".trim(), length));
			String[] aesPtaDt = (JSPUtil.getParameter(request, prefix	+ "aes_pta_dt".trim(), length));
			String[] aesDwnDt = (JSPUtil.getParameter(request, prefix	+ "aes_dwn_dt".trim(), length));
			String[] aesPtaPfxCtnt = (JSPUtil.getParameter(request, prefix	+ "aes_pta_pfx_ctnt".trim(), length));
			String[] cneeTaxNo = (JSPUtil.getParameter(request, prefix	+ "cnee_tax_no".trim(), length));
			String[] mfSmryRptNo = (JSPUtil.getParameter(request, prefix	+ "mf_smry_rpt_no".trim(), length));
			String[] cneeTaxCpyDescFlg = (JSPUtil.getParameter(request, prefix	+ "cnee_tax_cpy_desc_flg".trim(), length));
			String[] aesTpCd = (JSPUtil.getParameter(request, prefix	+ "aes_tp_cd".trim(), length));
			String[] divdPckTpCd = (JSPUtil.getParameter(request, prefix	+ "divd_pck_tp_cd".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no".trim(), length));
			String[] shprTaxCpyDescFlg = (JSPUtil.getParameter(request, prefix	+ "shpr_tax_cpy_desc_flg".trim(), length));
			String[] aesPtuNo = (JSPUtil.getParameter(request, prefix	+ "aes_ptu_no".trim(), length));
			String[] divdWgt = (JSPUtil.getParameter(request, prefix	+ "divd_wgt".trim(), length));
			String[] ntfyTaxNo = (JSPUtil.getParameter(request, prefix	+ "ntfy_tax_no".trim(), length));
			String[] samPckSeq = (JSPUtil.getParameter(request, prefix	+ "sam_pck_seq".trim(), length));
			String[] divdWgtUtCd = (JSPUtil.getParameter(request, prefix	+ "divd_wgt_ut_cd".trim(), length));
			String[] g7EdiNo2 = (JSPUtil.getParameter(request, prefix	+ "g7_edi_no2".trim(), length));
			String[] g7EdiNo1 = (JSPUtil.getParameter(request, prefix	+ "g7_edi_no1".trim(), length));
			String[] aesPtaNo1 = (JSPUtil.getParameter(request, prefix	+ "aes_pta_no1".trim(), length));
			String[] aesPtaNo2 = (JSPUtil.getParameter(request, prefix	+ "aes_pta_no2".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] aesDwnPfxCtnt = (JSPUtil.getParameter(request, prefix	+ "aes_dwn_pfx_ctnt".trim(), length));
			String[] xptImpSeq = (JSPUtil.getParameter(request, prefix	+ "xpt_imp_seq".trim(), length));
			String[] samPckQty = (JSPUtil.getParameter(request, prefix	+ "sam_pck_qty".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] idXptNo = (JSPUtil.getParameter(request, prefix	+ "id_xpt_no".trim(), length));
			String[] idaIecCpyDescFlg = (JSPUtil.getParameter(request, prefix	+ "ida_iec_cpy_desc_flg".trim(), length));
			String[] pckQty = (JSPUtil.getParameter(request, prefix	+ "pck_qty".trim(), length));
			String[] ntfyTaxCpyDescFlg = (JSPUtil.getParameter(request, prefix	+ "ntfy_tax_cpy_desc_flg".trim(), length));
			String[] divdSeq = (JSPUtil.getParameter(request, prefix	+ "divd_seq".trim(), length));
			String[] pckTpCd = (JSPUtil.getParameter(request, prefix	+ "pck_tp_cd".trim(), length));
			String[] brzDeclCpyDescFlg = (JSPUtil.getParameter(request, prefix	+ "brz_decl_cpy_desc_flg".trim(), length));
			String[] idDeclCd = (JSPUtil.getParameter(request, prefix	+ "id_decl_cd".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] brzCmdtCd = (JSPUtil.getParameter(request, prefix	+ "brz_cmdt_cd".trim(), length));
			String[] bkgNoSplit = (JSPUtil.getParameter(request, prefix	+ "bkg_no_split".trim(), length));
			String[] aesDwnNo = (JSPUtil.getParameter(request, prefix	+ "aes_dwn_no".trim(), length));
			String[] brzDeclNo = (JSPUtil.getParameter(request, prefix	+ "brz_decl_no".trim(), length));
			String[] ioBndCd = (JSPUtil.getParameter(request, prefix	+ "io_bnd_cd".trim(), length));
			String[] mfWgt = (JSPUtil.getParameter(request, prefix	+ "mf_wgt".trim(), length));
			String[] idOfcCd = (JSPUtil.getParameter(request, prefix	+ "id_ofc_cd".trim(), length));
			String[] ucrNo = (JSPUtil.getParameter(request, prefix	+ "ucr_no".trim(), length));
			String[] divdFlg = (JSPUtil.getParameter(request, prefix	+ "divd_flg".trim(), length));
			String[] cgoCtrlNo = (JSPUtil.getParameter(request, prefix	+ "cgo_ctrl_no".trim(), length));
			String[] aesInlndTrnsNo = (JSPUtil.getParameter(request, prefix	+ "aes_inlnd_trns_no".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgXptImpLicVO();
				if (ndrRefId[i] != null)
					model.setNdrRefId(ndrRefId[i]);
				if (tsRefNo[i] != null)
					model.setTsRefNo(tsRefNo[i]);
				if (idaIecNo[i] != null)
					model.setIdaIecNo(idaIecNo[i]);
				if (aesPtuDt[i] != null)
					model.setAesPtuDt(aesPtuDt[i]);
				if (shprTaxNo[i] != null)
					model.setShprTaxNo(shprTaxNo[i]);
				if (xptLicNo[i] != null)
					model.setXptLicNo(xptLicNo[i]);
				if (aesExptCtnt[i] != null)
					model.setAesExptCtnt(aesExptCtnt[i]);
				if (aesExptId[i] != null)
					model.setAesExptId(aesExptId[i]);
				if (ausMfRefNo[i] != null)
					model.setAusMfRefNo(ausMfRefNo[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (divdPckQty[i] != null)
					model.setDivdPckQty(divdPckQty[i]);
				if (b13aXptDt[i] != null)
					model.setB13aXptDt(b13aXptDt[i]);
				if (caedNo1[i] != null)
					model.setCaedNo1(caedNo1[i]);
				if (samPckTpCd[i] != null)
					model.setSamPckTpCd(samPckTpCd[i]);
				if (caedNo3[i] != null)
					model.setCaedNo3(caedNo3[i]);
				if (caedNo2[i] != null)
					model.setCaedNo2(caedNo2[i]);
				if (cntCd[i] != null)
					model.setCntCd(cntCd[i]);
				if (wgtUtCd[i] != null)
					model.setWgtUtCd(wgtUtCd[i]);
				if (aesPtuPfxCtnt[i] != null)
					model.setAesPtuPfxCtnt(aesPtuPfxCtnt[i]);
				if (b13aXptNo2[i] != null)
					model.setB13aXptNo2(b13aXptNo2[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (b13aXptNo1[i] != null)
					model.setB13aXptNo1(b13aXptNo1[i]);
				if (ndrRefCtnt[i] != null)
					model.setNdrRefCtnt(ndrRefCtnt[i]);
				if (aesPtaDt[i] != null)
					model.setAesPtaDt(aesPtaDt[i]);
				if (aesDwnDt[i] != null)
					model.setAesDwnDt(aesDwnDt[i]);
				if (aesPtaPfxCtnt[i] != null)
					model.setAesPtaPfxCtnt(aesPtaPfxCtnt[i]);
				if (cneeTaxNo[i] != null)
					model.setCneeTaxNo(cneeTaxNo[i]);
				if (mfSmryRptNo[i] != null)
					model.setMfSmryRptNo(mfSmryRptNo[i]);
				if (cneeTaxCpyDescFlg[i] != null)
					model.setCneeTaxCpyDescFlg(cneeTaxCpyDescFlg[i]);
				if (aesTpCd[i] != null)
					model.setAesTpCd(aesTpCd[i]);
				if (divdPckTpCd[i] != null)
					model.setDivdPckTpCd(divdPckTpCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (shprTaxCpyDescFlg[i] != null)
					model.setShprTaxCpyDescFlg(shprTaxCpyDescFlg[i]);
				if (aesPtuNo[i] != null)
					model.setAesPtuNo(aesPtuNo[i]);
				if (divdWgt[i] != null)
					model.setDivdWgt(divdWgt[i]);
				if (ntfyTaxNo[i] != null)
					model.setNtfyTaxNo(ntfyTaxNo[i]);
				if (samPckSeq[i] != null)
					model.setSamPckSeq(samPckSeq[i]);
				if (divdWgtUtCd[i] != null)
					model.setDivdWgtUtCd(divdWgtUtCd[i]);
				if (g7EdiNo2[i] != null)
					model.setG7EdiNo2(g7EdiNo2[i]);
				if (g7EdiNo1[i] != null)
					model.setG7EdiNo1(g7EdiNo1[i]);
				if (aesPtaNo1[i] != null)
					model.setAesPtaNo1(aesPtaNo1[i]);
				if (aesPtaNo2[i] != null)
					model.setAesPtaNo2(aesPtaNo2[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (aesDwnPfxCtnt[i] != null)
					model.setAesDwnPfxCtnt(aesDwnPfxCtnt[i]);
				if (xptImpSeq[i] != null)
					model.setXptImpSeq(xptImpSeq[i]);
				if (samPckQty[i] != null)
					model.setSamPckQty(samPckQty[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (idXptNo[i] != null)
					model.setIdXptNo(idXptNo[i]);
				if (idaIecCpyDescFlg[i] != null)
					model.setIdaIecCpyDescFlg(idaIecCpyDescFlg[i]);
				if (pckQty[i] != null)
					model.setPckQty(pckQty[i]);
				if (ntfyTaxCpyDescFlg[i] != null)
					model.setNtfyTaxCpyDescFlg(ntfyTaxCpyDescFlg[i]);
				if (divdSeq[i] != null)
					model.setDivdSeq(divdSeq[i]);
				if (pckTpCd[i] != null)
					model.setPckTpCd(pckTpCd[i]);
				if (brzDeclCpyDescFlg[i] != null)
					model.setBrzDeclCpyDescFlg(brzDeclCpyDescFlg[i]);
				if (idDeclCd[i] != null)
					model.setIdDeclCd(idDeclCd[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (brzCmdtCd[i] != null)
					model.setBrzCmdtCd(brzCmdtCd[i]);
				if (bkgNoSplit[i] != null)
					model.setBkgNoSplit(bkgNoSplit[i]);
				if (aesDwnNo[i] != null)
					model.setAesDwnNo(aesDwnNo[i]);
				if (brzDeclNo[i] != null)
					model.setBrzDeclNo(brzDeclNo[i]);
				if (ioBndCd[i] != null)
					model.setIoBndCd(ioBndCd[i]);
				if (mfWgt[i] != null)
					model.setMfWgt(mfWgt[i]);
				if (idOfcCd[i] != null)
					model.setIdOfcCd(idOfcCd[i]);
				if (ucrNo[i] != null)
					model.setUcrNo(ucrNo[i]);
				if (divdFlg[i] != null)
					model.setDivdFlg(divdFlg[i]);
				if (cgoCtrlNo[i] != null)
					model.setCgoCtrlNo(cgoCtrlNo[i]);
				if (aesInlndTrnsNo[i] != null)
					model.setAesInlndTrnsNo(aesInlndTrnsNo[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getBkgXptImpLicVOs();
	}

	public BkgXptImpLicVO[] getBkgXptImpLicVOs(){
		BkgXptImpLicVO[] vos = (BkgXptImpLicVO[])models.toArray(new BkgXptImpLicVO[models.size()]);
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
		this.ndrRefId = this.ndrRefId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tsRefNo = this.tsRefNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.idaIecNo = this.idaIecNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aesPtuDt = this.aesPtuDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.shprTaxNo = this.shprTaxNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.xptLicNo = this.xptLicNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aesExptCtnt = this.aesExptCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aesExptId = this.aesExptId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ausMfRefNo = this.ausMfRefNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.divdPckQty = this.divdPckQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.b13aXptDt = this.b13aXptDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.caedNo1 = this.caedNo1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.samPckTpCd = this.samPckTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.caedNo3 = this.caedNo3 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.caedNo2 = this.caedNo2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntCd = this.cntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.wgtUtCd = this.wgtUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aesPtuPfxCtnt = this.aesPtuPfxCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.b13aXptNo2 = this.b13aXptNo2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.b13aXptNo1 = this.b13aXptNo1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ndrRefCtnt = this.ndrRefCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aesPtaDt = this.aesPtaDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aesDwnDt = this.aesDwnDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aesPtaPfxCtnt = this.aesPtaPfxCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cneeTaxNo = this.cneeTaxNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mfSmryRptNo = this.mfSmryRptNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cneeTaxCpyDescFlg = this.cneeTaxCpyDescFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aesTpCd = this.aesTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.divdPckTpCd = this.divdPckTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.shprTaxCpyDescFlg = this.shprTaxCpyDescFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aesPtuNo = this.aesPtuNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.divdWgt = this.divdWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ntfyTaxNo = this.ntfyTaxNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.samPckSeq = this.samPckSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.divdWgtUtCd = this.divdWgtUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.g7EdiNo2 = this.g7EdiNo2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.g7EdiNo1 = this.g7EdiNo1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aesPtaNo1 = this.aesPtaNo1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aesPtaNo2 = this.aesPtaNo2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aesDwnPfxCtnt = this.aesDwnPfxCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.xptImpSeq = this.xptImpSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.samPckQty = this.samPckQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.idXptNo = this.idXptNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.idaIecCpyDescFlg = this.idaIecCpyDescFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pckQty = this.pckQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ntfyTaxCpyDescFlg = this.ntfyTaxCpyDescFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.divdSeq = this.divdSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pckTpCd = this.pckTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.brzDeclCpyDescFlg = this.brzDeclCpyDescFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.idDeclCd = this.idDeclCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.brzCmdtCd = this.brzCmdtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNoSplit = this.bkgNoSplit .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aesDwnNo = this.aesDwnNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.brzDeclNo = this.brzDeclNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ioBndCd = this.ioBndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mfWgt = this.mfWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.idOfcCd = this.idOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ucrNo = this.ucrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.divdFlg = this.divdFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cgoCtrlNo = this.cgoCtrlNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aesInlndTrnsNo = this.aesInlndTrnsNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
