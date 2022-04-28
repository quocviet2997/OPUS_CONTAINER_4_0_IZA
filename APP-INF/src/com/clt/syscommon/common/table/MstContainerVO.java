/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : MstContainerVO.java
*@FileTitle : MstContainerVO
*Open Issues :
*Change history :
*@LastModifyDate : 2010.10.22
*@LastModifier : 남궁진호
*@LastVersion : 1.0
* 2010.10.22 남궁진호 
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.common.table;

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
 * @author 남궁진호
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class MstContainerVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<MstContainerVO> models = new ArrayList<MstContainerVO>();
	
	/* Column Info */
	private String onhYdCd = null;
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String cntrAqzAmt = null;
	/* Column Info */
	private String faEqNo = null;
	/* Column Info */
	private String cntrStsCd = null;
	/* Column Info */
	private String cnmvSeq = null;
	/* Column Info */
	private String ifSeq = null;
	/* Column Info */
	private String destYdCd = null;
	/* Column Info */
	private String minTemp = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String onhCntrStsCd = null;
	/* Column Info */
	private String locCd = null;
	/* Column Info */
	private String cntrTpszCd = null;
	/* Column Info */
	private String mnrHngrBarTpCd = null;
	/* Column Info */
	private String cntrHngrBarAtchKnt = null;
	/* Column Info */
	private String lstmCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String acctQtyMzdCd = null;
	/* Column Info */
	private String ownrCoCd = null;
	/* Column Info */
	private String uclmFreeDys = null;
	/* Column Info */
	private String agmtSeq = null;
	/* Column Info */
	private String cnmvDt = null;
	/* Column Info */
	private String faIfGrpSeqNo = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String hjsCreFlg = null;
	/* Column Info */
	private String aciacDivCd = null;
	/* Column Info */
	private String cnmvIdNo = null;
	/* Column Info */
	private String cntrInvstNo = null;
	/* Column Info */
	private String minOnhDys = null;
	/* Column Info */
	private String dispFlg = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String uclmEndDt = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String uclmLsDivCd = null;
	/* Column Info */
	private String uclmRsn = null;
	/* Column Info */
	private String vndrSeq = null;
	/* Column Info */
	private String fullFlg = null;
	/* Column Info */
	private String rfRfrNo = null;
	/* Column Info */
	private String cnmvGdt = null;
	/* Column Info */
	private String cntrHngrRckCd = null;
	/* Column Info */
	private String ifTtlRowKnt = null;
	/* Column Info */
	private String cntrSpecNo = null;
	/* Column Info */
	private String cnmvCycNo = null;
	/* Column Info */
	private String retAproNo = null;
	/* Column Info */
	private String cntrUseCoCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String crntYdCd = null;
	/* Column Info */
	private String dmgFlg = null;
	/* Column Info */
	private String rfMdlNm = null;
	/* Column Info */
	private String onhDt = null;
	/* Column Info */
	private String rfubDt = null;
	/* Column Info */
	private String cntrAuthNo = null;
	/* Column Info */
	private String cnmvSplitNo = null;
	/* Column Info */
	private String faIfStsCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String cnmvStsCd = null;
	/* Column Info */
	private String rfubFlg = null;
	/* Column Info */
	private String bkgKnt = null;
	/* Column Info */
	private String agmtCtyCd = null;
	/* Column Info */
	private String onhStsSeq = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String uclmDt = null;
	/* Column Info */
	private String mftrVndrSeq = null;
	/* Column Info */
	private String lstStsSeq = null;
	/* Column Info */
	private String eccCd = null;
	/* Column Info */
	private String d2PayldFlg = null;
	/* Column Info */
	private String faIfTpCd = null;
	/* Column Info */
	private String rccCd = null;
	/* Column Info */
	private String sysAreaGrpId = null;
	/* Column Info */
	private String preStsFlg = null;
	/* Column Info */
	private String plstFlrFlg = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Column Info */
	private String eaiIfNo = null;
	/* Column Info */
	private String uclmCntcPntNm = null;
	/* Column Info */
	private String maxTemp = null;
	/* Column Info */
	private String faIfGrpStsCd = null;
	/* Column Info */
	private String cntrCurrCd = null;
	/* Column Info */
	private String mftDt = null;
	/* Column Info */
	private String rfMkrSeq = null;
	/* Column Info */
	private String lccCd = null;
	/* Column Info */
	private String sccCd = null;
	/* Column Info */
	private String termCngSeq = null;
	/* Column Info */
	private String lstStsYdCd = null;
	/* Column Info */
	private String uclmPlnRmk = null;
	/* Column Info */
	private String cntrNo = null;
	/* Column Info */
	private String faIfDt = null;
	/* Column Info */
	private String imdtExtFlg = null;
	/* Column Info */
	private String cntrMtrlCd = null;
	/* Column Info */
	private String cnmvYr = null;
	/* Column Info */
	private String cntrRmk = null;
	/* Column Info */
	private String onhFreeDys = null;
	/* Column Info */
	private String faIfErrMsg = null;
	/* Column Info */
	private String rfTpCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public MstContainerVO() {}

	public MstContainerVO(String ibflag, String pagerows, String cntrNo, String cntrTpszCd, String cnmvStsCd, String aciacDivCd, String cntrStsCd, String lstmCd, String agmtCtyCd, String agmtSeq, String vndrSeq, String onhCntrStsCd, String onhDt, String onhYdCd, String onhFreeDys, String onhStsSeq, String minOnhDys, String cntrAuthNo, String cntrMtrlCd, String cntrSpecNo, String mftrVndrSeq, String mftDt, String lstStsYdCd, String lstStsSeq, String sysAreaGrpId, String cnmvYr, String cnmvIdNo, String cnmvSeq, String cnmvSplitNo, String cnmvCycNo, String cnmvDt, String cnmvGdt, String preStsFlg, String bkgNo, String bkgKnt, String fullFlg, String crntYdCd, String locCd, String sccCd, String lccCd, String eccCd, String rccCd, String destYdCd, String vslCd, String skdVoyNo, String skdDirCd, String mnrHngrBarTpCd, String cntrHngrBarAtchKnt, String cntrHngrRckCd, String dmgFlg, String rfubFlg, String rfubDt, String dispFlg, String imdtExtFlg, String d2PayldFlg, String termCngSeq, String plstFlrFlg, String hjsCreFlg, String ownrCoCd, String cntrUseCoCd, String rfTpCd, String cntrRmk, String cntrCurrCd, String cntrAqzAmt, String cntrInvstNo, String acctQtyMzdCd, String uclmLsDivCd, String uclmDt, String uclmFreeDys, String uclmEndDt, String uclmRsn, String uclmPlnRmk, String uclmCntcPntNm, String eaiIfNo, String ifTtlRowKnt, String ifSeq, String faIfGrpSeqNo, String faIfGrpStsCd, String faIfTpCd, String faIfStsCd, String faIfErrMsg, String faIfDt, String faEqNo, String retAproNo, String creUsrId, String creDt, String updUsrId, String updDt, String rfMkrSeq, String rfMdlNm, String rfRfrNo, String minTemp, String maxTemp) {
		this.onhYdCd = onhYdCd;
		this.vslCd = vslCd;
		this.cntrAqzAmt = cntrAqzAmt;
		this.faEqNo = faEqNo;
		this.cntrStsCd = cntrStsCd;
		this.cnmvSeq = cnmvSeq;
		this.ifSeq = ifSeq;
		this.destYdCd = destYdCd;
		this.minTemp = minTemp;
		this.pagerows = pagerows;
		this.onhCntrStsCd = onhCntrStsCd;
		this.locCd = locCd;
		this.cntrTpszCd = cntrTpszCd;
		this.mnrHngrBarTpCd = mnrHngrBarTpCd;
		this.cntrHngrBarAtchKnt = cntrHngrBarAtchKnt;
		this.lstmCd = lstmCd;
		this.updUsrId = updUsrId;
		this.acctQtyMzdCd = acctQtyMzdCd;
		this.ownrCoCd = ownrCoCd;
		this.uclmFreeDys = uclmFreeDys;
		this.agmtSeq = agmtSeq;
		this.cnmvDt = cnmvDt;
		this.faIfGrpSeqNo = faIfGrpSeqNo;
		this.skdVoyNo = skdVoyNo;
		this.hjsCreFlg = hjsCreFlg;
		this.aciacDivCd = aciacDivCd;
		this.cnmvIdNo = cnmvIdNo;
		this.cntrInvstNo = cntrInvstNo;
		this.minOnhDys = minOnhDys;
		this.dispFlg = dispFlg;
		this.creUsrId = creUsrId;
		this.uclmEndDt = uclmEndDt;
		this.bkgNo = bkgNo;
		this.uclmLsDivCd = uclmLsDivCd;
		this.uclmRsn = uclmRsn;
		this.vndrSeq = vndrSeq;
		this.fullFlg = fullFlg;
		this.rfRfrNo = rfRfrNo;
		this.cnmvGdt = cnmvGdt;
		this.cntrHngrRckCd = cntrHngrRckCd;
		this.ifTtlRowKnt = ifTtlRowKnt;
		this.cntrSpecNo = cntrSpecNo;
		this.cnmvCycNo = cnmvCycNo;
		this.retAproNo = retAproNo;
		this.cntrUseCoCd = cntrUseCoCd;
		this.creDt = creDt;
		this.crntYdCd = crntYdCd;
		this.dmgFlg = dmgFlg;
		this.rfMdlNm = rfMdlNm;
		this.onhDt = onhDt;
		this.rfubDt = rfubDt;
		this.cntrAuthNo = cntrAuthNo;
		this.cnmvSplitNo = cnmvSplitNo;
		this.faIfStsCd = faIfStsCd;
		this.ibflag = ibflag;
		this.cnmvStsCd = cnmvStsCd;
		this.rfubFlg = rfubFlg;
		this.bkgKnt = bkgKnt;
		this.agmtCtyCd = agmtCtyCd;
		this.onhStsSeq = onhStsSeq;
		this.updDt = updDt;
		this.uclmDt = uclmDt;
		this.mftrVndrSeq = mftrVndrSeq;
		this.lstStsSeq = lstStsSeq;
		this.eccCd = eccCd;
		this.d2PayldFlg = d2PayldFlg;
		this.faIfTpCd = faIfTpCd;
		this.rccCd = rccCd;
		this.sysAreaGrpId = sysAreaGrpId;
		this.preStsFlg = preStsFlg;
		this.plstFlrFlg = plstFlrFlg;
		this.skdDirCd = skdDirCd;
		this.eaiIfNo = eaiIfNo;
		this.uclmCntcPntNm = uclmCntcPntNm;
		this.maxTemp = maxTemp;
		this.faIfGrpStsCd = faIfGrpStsCd;
		this.cntrCurrCd = cntrCurrCd;
		this.mftDt = mftDt;
		this.rfMkrSeq = rfMkrSeq;
		this.lccCd = lccCd;
		this.sccCd = sccCd;
		this.termCngSeq = termCngSeq;
		this.lstStsYdCd = lstStsYdCd;
		this.uclmPlnRmk = uclmPlnRmk;
		this.cntrNo = cntrNo;
		this.faIfDt = faIfDt;
		this.imdtExtFlg = imdtExtFlg;
		this.cntrMtrlCd = cntrMtrlCd;
		this.cnmvYr = cnmvYr;
		this.cntrRmk = cntrRmk;
		this.onhFreeDys = onhFreeDys;
		this.faIfErrMsg = faIfErrMsg;
		this.rfTpCd = rfTpCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("onh_yd_cd", getOnhYdCd());
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("cntr_aqz_amt", getCntrAqzAmt());
		this.hashColumns.put("fa_eq_no", getFaEqNo());
		this.hashColumns.put("cntr_sts_cd", getCntrStsCd());
		this.hashColumns.put("cnmv_seq", getCnmvSeq());
		this.hashColumns.put("if_seq", getIfSeq());
		this.hashColumns.put("dest_yd_cd", getDestYdCd());
		this.hashColumns.put("min_temp", getMinTemp());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("onh_cntr_sts_cd", getOnhCntrStsCd());
		this.hashColumns.put("loc_cd", getLocCd());
		this.hashColumns.put("cntr_tpsz_cd", getCntrTpszCd());
		this.hashColumns.put("mnr_hngr_bar_tp_cd", getMnrHngrBarTpCd());
		this.hashColumns.put("cntr_hngr_bar_atch_knt", getCntrHngrBarAtchKnt());
		this.hashColumns.put("lstm_cd", getLstmCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("acct_qty_mzd_cd", getAcctQtyMzdCd());
		this.hashColumns.put("ownr_co_cd", getOwnrCoCd());
		this.hashColumns.put("uclm_free_dys", getUclmFreeDys());
		this.hashColumns.put("agmt_seq", getAgmtSeq());
		this.hashColumns.put("cnmv_dt", getCnmvDt());
		this.hashColumns.put("fa_if_grp_seq_no", getFaIfGrpSeqNo());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("hjs_cre_flg", getHjsCreFlg());
		this.hashColumns.put("aciac_div_cd", getAciacDivCd());
		this.hashColumns.put("cnmv_id_no", getCnmvIdNo());
		this.hashColumns.put("cntr_invst_no", getCntrInvstNo());
		this.hashColumns.put("min_onh_dys", getMinOnhDys());
		this.hashColumns.put("disp_flg", getDispFlg());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("uclm_end_dt", getUclmEndDt());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("uclm_ls_div_cd", getUclmLsDivCd());
		this.hashColumns.put("uclm_rsn", getUclmRsn());
		this.hashColumns.put("vndr_seq", getVndrSeq());
		this.hashColumns.put("full_flg", getFullFlg());
		this.hashColumns.put("rf_rfr_no", getRfRfrNo());
		this.hashColumns.put("cnmv_gdt", getCnmvGdt());
		this.hashColumns.put("cntr_hngr_rck_cd", getCntrHngrRckCd());
		this.hashColumns.put("if_ttl_row_knt", getIfTtlRowKnt());
		this.hashColumns.put("cntr_spec_no", getCntrSpecNo());
		this.hashColumns.put("cnmv_cyc_no", getCnmvCycNo());
		this.hashColumns.put("ret_apro_no", getRetAproNo());
		this.hashColumns.put("cntr_use_co_cd", getCntrUseCoCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("crnt_yd_cd", getCrntYdCd());
		this.hashColumns.put("dmg_flg", getDmgFlg());
		this.hashColumns.put("rf_mdl_nm", getRfMdlNm());
		this.hashColumns.put("onh_dt", getOnhDt());
		this.hashColumns.put("rfub_dt", getRfubDt());
		this.hashColumns.put("cntr_auth_no", getCntrAuthNo());
		this.hashColumns.put("cnmv_split_no", getCnmvSplitNo());
		this.hashColumns.put("fa_if_sts_cd", getFaIfStsCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cnmv_sts_cd", getCnmvStsCd());
		this.hashColumns.put("rfub_flg", getRfubFlg());
		this.hashColumns.put("bkg_knt", getBkgKnt());
		this.hashColumns.put("agmt_cty_cd", getAgmtCtyCd());
		this.hashColumns.put("onh_sts_seq", getOnhStsSeq());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("uclm_dt", getUclmDt());
		this.hashColumns.put("mftr_vndr_seq", getMftrVndrSeq());
		this.hashColumns.put("lst_sts_seq", getLstStsSeq());
		this.hashColumns.put("ecc_cd", getEccCd());
		this.hashColumns.put("d2_payld_flg", getD2PayldFlg());
		this.hashColumns.put("fa_if_tp_cd", getFaIfTpCd());
		this.hashColumns.put("rcc_cd", getRccCd());
		this.hashColumns.put("sys_area_grp_id", getSysAreaGrpId());
		this.hashColumns.put("pre_sts_flg", getPreStsFlg());
		this.hashColumns.put("plst_flr_flg", getPlstFlrFlg());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("eai_if_no", getEaiIfNo());
		this.hashColumns.put("uclm_cntc_pnt_nm", getUclmCntcPntNm());
		this.hashColumns.put("max_temp", getMaxTemp());
		this.hashColumns.put("fa_if_grp_sts_cd", getFaIfGrpStsCd());
		this.hashColumns.put("cntr_curr_cd", getCntrCurrCd());
		this.hashColumns.put("mft_dt", getMftDt());
		this.hashColumns.put("rf_mkr_seq", getRfMkrSeq());
		this.hashColumns.put("lcc_cd", getLccCd());
		this.hashColumns.put("scc_cd", getSccCd());
		this.hashColumns.put("term_cng_seq", getTermCngSeq());
		this.hashColumns.put("lst_sts_yd_cd", getLstStsYdCd());
		this.hashColumns.put("uclm_pln_rmk", getUclmPlnRmk());
		this.hashColumns.put("cntr_no", getCntrNo());
		this.hashColumns.put("fa_if_dt", getFaIfDt());
		this.hashColumns.put("imdt_ext_flg", getImdtExtFlg());
		this.hashColumns.put("cntr_mtrl_cd", getCntrMtrlCd());
		this.hashColumns.put("cnmv_yr", getCnmvYr());
		this.hashColumns.put("cntr_rmk", getCntrRmk());
		this.hashColumns.put("onh_free_dys", getOnhFreeDys());
		this.hashColumns.put("fa_if_err_msg", getFaIfErrMsg());
		this.hashColumns.put("rf_tp_cd", getRfTpCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("onh_yd_cd", "onhYdCd");
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("cntr_aqz_amt", "cntrAqzAmt");
		this.hashFields.put("fa_eq_no", "faEqNo");
		this.hashFields.put("cntr_sts_cd", "cntrStsCd");
		this.hashFields.put("cnmv_seq", "cnmvSeq");
		this.hashFields.put("if_seq", "ifSeq");
		this.hashFields.put("dest_yd_cd", "destYdCd");
		this.hashFields.put("min_temp", "minTemp");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("onh_cntr_sts_cd", "onhCntrStsCd");
		this.hashFields.put("loc_cd", "locCd");
		this.hashFields.put("cntr_tpsz_cd", "cntrTpszCd");
		this.hashFields.put("mnr_hngr_bar_tp_cd", "mnrHngrBarTpCd");
		this.hashFields.put("cntr_hngr_bar_atch_knt", "cntrHngrBarAtchKnt");
		this.hashFields.put("lstm_cd", "lstmCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("acct_qty_mzd_cd", "acctQtyMzdCd");
		this.hashFields.put("ownr_co_cd", "ownrCoCd");
		this.hashFields.put("uclm_free_dys", "uclmFreeDys");
		this.hashFields.put("agmt_seq", "agmtSeq");
		this.hashFields.put("cnmv_dt", "cnmvDt");
		this.hashFields.put("fa_if_grp_seq_no", "faIfGrpSeqNo");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("hjs_cre_flg", "hjsCreFlg");
		this.hashFields.put("aciac_div_cd", "aciacDivCd");
		this.hashFields.put("cnmv_id_no", "cnmvIdNo");
		this.hashFields.put("cntr_invst_no", "cntrInvstNo");
		this.hashFields.put("min_onh_dys", "minOnhDys");
		this.hashFields.put("disp_flg", "dispFlg");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("uclm_end_dt", "uclmEndDt");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("uclm_ls_div_cd", "uclmLsDivCd");
		this.hashFields.put("uclm_rsn", "uclmRsn");
		this.hashFields.put("vndr_seq", "vndrSeq");
		this.hashFields.put("full_flg", "fullFlg");
		this.hashFields.put("rf_rfr_no", "rfRfrNo");
		this.hashFields.put("cnmv_gdt", "cnmvGdt");
		this.hashFields.put("cntr_hngr_rck_cd", "cntrHngrRckCd");
		this.hashFields.put("if_ttl_row_knt", "ifTtlRowKnt");
		this.hashFields.put("cntr_spec_no", "cntrSpecNo");
		this.hashFields.put("cnmv_cyc_no", "cnmvCycNo");
		this.hashFields.put("ret_apro_no", "retAproNo");
		this.hashFields.put("cntr_use_co_cd", "cntrUseCoCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("crnt_yd_cd", "crntYdCd");
		this.hashFields.put("dmg_flg", "dmgFlg");
		this.hashFields.put("rf_mdl_nm", "rfMdlNm");
		this.hashFields.put("onh_dt", "onhDt");
		this.hashFields.put("rfub_dt", "rfubDt");
		this.hashFields.put("cntr_auth_no", "cntrAuthNo");
		this.hashFields.put("cnmv_split_no", "cnmvSplitNo");
		this.hashFields.put("fa_if_sts_cd", "faIfStsCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cnmv_sts_cd", "cnmvStsCd");
		this.hashFields.put("rfub_flg", "rfubFlg");
		this.hashFields.put("bkg_knt", "bkgKnt");
		this.hashFields.put("agmt_cty_cd", "agmtCtyCd");
		this.hashFields.put("onh_sts_seq", "onhStsSeq");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("uclm_dt", "uclmDt");
		this.hashFields.put("mftr_vndr_seq", "mftrVndrSeq");
		this.hashFields.put("lst_sts_seq", "lstStsSeq");
		this.hashFields.put("ecc_cd", "eccCd");
		this.hashFields.put("d2_payld_flg", "d2PayldFlg");
		this.hashFields.put("fa_if_tp_cd", "faIfTpCd");
		this.hashFields.put("rcc_cd", "rccCd");
		this.hashFields.put("sys_area_grp_id", "sysAreaGrpId");
		this.hashFields.put("pre_sts_flg", "preStsFlg");
		this.hashFields.put("plst_flr_flg", "plstFlrFlg");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("eai_if_no", "eaiIfNo");
		this.hashFields.put("uclm_cntc_pnt_nm", "uclmCntcPntNm");
		this.hashFields.put("max_temp", "maxTemp");
		this.hashFields.put("fa_if_grp_sts_cd", "faIfGrpStsCd");
		this.hashFields.put("cntr_curr_cd", "cntrCurrCd");
		this.hashFields.put("mft_dt", "mftDt");
		this.hashFields.put("rf_mkr_seq", "rfMkrSeq");
		this.hashFields.put("lcc_cd", "lccCd");
		this.hashFields.put("scc_cd", "sccCd");
		this.hashFields.put("term_cng_seq", "termCngSeq");
		this.hashFields.put("lst_sts_yd_cd", "lstStsYdCd");
		this.hashFields.put("uclm_pln_rmk", "uclmPlnRmk");
		this.hashFields.put("cntr_no", "cntrNo");
		this.hashFields.put("fa_if_dt", "faIfDt");
		this.hashFields.put("imdt_ext_flg", "imdtExtFlg");
		this.hashFields.put("cntr_mtrl_cd", "cntrMtrlCd");
		this.hashFields.put("cnmv_yr", "cnmvYr");
		this.hashFields.put("cntr_rmk", "cntrRmk");
		this.hashFields.put("onh_free_dys", "onhFreeDys");
		this.hashFields.put("fa_if_err_msg", "faIfErrMsg");
		this.hashFields.put("rf_tp_cd", "rfTpCd");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return onhYdCd
	 */
	public String getOnhYdCd() {
		return this.onhYdCd;
	}
	
	/**
	 * Column Info
	 * @return vslCd
	 */
	public String getVslCd() {
		return this.vslCd;
	}
	
	/**
	 * Column Info
	 * @return cntrAqzAmt
	 */
	public String getCntrAqzAmt() {
		return this.cntrAqzAmt;
	}
	
	/**
	 * Column Info
	 * @return faEqNo
	 */
	public String getFaEqNo() {
		return this.faEqNo;
	}
	
	/**
	 * Column Info
	 * @return cntrStsCd
	 */
	public String getCntrStsCd() {
		return this.cntrStsCd;
	}
	
	/**
	 * Column Info
	 * @return cnmvSeq
	 */
	public String getCnmvSeq() {
		return this.cnmvSeq;
	}
	
	/**
	 * Column Info
	 * @return ifSeq
	 */
	public String getIfSeq() {
		return this.ifSeq;
	}
	
	/**
	 * Column Info
	 * @return destYdCd
	 */
	public String getDestYdCd() {
		return this.destYdCd;
	}
	
	/**
	 * Column Info
	 * @return minTemp
	 */
	public String getMinTemp() {
		return this.minTemp;
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
	 * @return onhCntrStsCd
	 */
	public String getOnhCntrStsCd() {
		return this.onhCntrStsCd;
	}
	
	/**
	 * Column Info
	 * @return locCd
	 */
	public String getLocCd() {
		return this.locCd;
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
	 * @return mnrHngrBarTpCd
	 */
	public String getMnrHngrBarTpCd() {
		return this.mnrHngrBarTpCd;
	}
	
	/**
	 * Column Info
	 * @return cntrHngrBarAtchKnt
	 */
	public String getCntrHngrBarAtchKnt() {
		return this.cntrHngrBarAtchKnt;
	}
	
	/**
	 * Column Info
	 * @return lstmCd
	 */
	public String getLstmCd() {
		return this.lstmCd;
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
	 * @return acctQtyMzdCd
	 */
	public String getAcctQtyMzdCd() {
		return this.acctQtyMzdCd;
	}
	
	/**
	 * Column Info
	 * @return ownrCoCd
	 */
	public String getOwnrCoCd() {
		return this.ownrCoCd;
	}
	
	/**
	 * Column Info
	 * @return uclmFreeDys
	 */
	public String getUclmFreeDys() {
		return this.uclmFreeDys;
	}
	
	/**
	 * Column Info
	 * @return agmtSeq
	 */
	public String getAgmtSeq() {
		return this.agmtSeq;
	}
	
	/**
	 * Column Info
	 * @return cnmvDt
	 */
	public String getCnmvDt() {
		return this.cnmvDt;
	}
	
	/**
	 * Column Info
	 * @return faIfGrpSeqNo
	 */
	public String getFaIfGrpSeqNo() {
		return this.faIfGrpSeqNo;
	}
	
	/**
	 * Column Info
	 * @return skdVoyNo
	 */
	public String getSkdVoyNo() {
		return this.skdVoyNo;
	}
	
	/**
	 * Column Info
	 * @return hjsCreFlg
	 */
	public String getHjsCreFlg() {
		return this.hjsCreFlg;
	}
	
	/**
	 * Column Info
	 * @return aciacDivCd
	 */
	public String getAciacDivCd() {
		return this.aciacDivCd;
	}
	
	/**
	 * Column Info
	 * @return cnmvIdNo
	 */
	public String getCnmvIdNo() {
		return this.cnmvIdNo;
	}
	
	/**
	 * Column Info
	 * @return cntrInvstNo
	 */
	public String getCntrInvstNo() {
		return this.cntrInvstNo;
	}
	
	/**
	 * Column Info
	 * @return minOnhDys
	 */
	public String getMinOnhDys() {
		return this.minOnhDys;
	}
	
	/**
	 * Column Info
	 * @return dispFlg
	 */
	public String getDispFlg() {
		return this.dispFlg;
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
	 * @return uclmEndDt
	 */
	public String getUclmEndDt() {
		return this.uclmEndDt;
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
	 * @return uclmLsDivCd
	 */
	public String getUclmLsDivCd() {
		return this.uclmLsDivCd;
	}
	
	/**
	 * Column Info
	 * @return uclmRsn
	 */
	public String getUclmRsn() {
		return this.uclmRsn;
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
	 * @return fullFlg
	 */
	public String getFullFlg() {
		return this.fullFlg;
	}
	
	/**
	 * Column Info
	 * @return rfRfrNo
	 */
	public String getRfRfrNo() {
		return this.rfRfrNo;
	}
	
	/**
	 * Column Info
	 * @return cnmvGdt
	 */
	public String getCnmvGdt() {
		return this.cnmvGdt;
	}
	
	/**
	 * Column Info
	 * @return cntrHngrRckCd
	 */
	public String getCntrHngrRckCd() {
		return this.cntrHngrRckCd;
	}
	
	/**
	 * Column Info
	 * @return ifTtlRowKnt
	 */
	public String getIfTtlRowKnt() {
		return this.ifTtlRowKnt;
	}
	
	/**
	 * Column Info
	 * @return cntrSpecNo
	 */
	public String getCntrSpecNo() {
		return this.cntrSpecNo;
	}
	
	/**
	 * Column Info
	 * @return cnmvCycNo
	 */
	public String getCnmvCycNo() {
		return this.cnmvCycNo;
	}
	
	/**
	 * Column Info
	 * @return retAproNo
	 */
	public String getRetAproNo() {
		return this.retAproNo;
	}
	
	/**
	 * Column Info
	 * @return cntrUseCoCd
	 */
	public String getCntrUseCoCd() {
		return this.cntrUseCoCd;
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
	 * @return crntYdCd
	 */
	public String getCrntYdCd() {
		return this.crntYdCd;
	}
	
	/**
	 * Column Info
	 * @return dmgFlg
	 */
	public String getDmgFlg() {
		return this.dmgFlg;
	}
	
	/**
	 * Column Info
	 * @return rfMdlNm
	 */
	public String getRfMdlNm() {
		return this.rfMdlNm;
	}
	
	/**
	 * Column Info
	 * @return onhDt
	 */
	public String getOnhDt() {
		return this.onhDt;
	}
	
	/**
	 * Column Info
	 * @return rfubDt
	 */
	public String getRfubDt() {
		return this.rfubDt;
	}
	
	/**
	 * Column Info
	 * @return cntrAuthNo
	 */
	public String getCntrAuthNo() {
		return this.cntrAuthNo;
	}
	
	/**
	 * Column Info
	 * @return cnmvSplitNo
	 */
	public String getCnmvSplitNo() {
		return this.cnmvSplitNo;
	}
	
	/**
	 * Column Info
	 * @return faIfStsCd
	 */
	public String getFaIfStsCd() {
		return this.faIfStsCd;
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
	 * @return cnmvStsCd
	 */
	public String getCnmvStsCd() {
		return this.cnmvStsCd;
	}
	
	/**
	 * Column Info
	 * @return rfubFlg
	 */
	public String getRfubFlg() {
		return this.rfubFlg;
	}
	
	/**
	 * Column Info
	 * @return bkgKnt
	 */
	public String getBkgKnt() {
		return this.bkgKnt;
	}
	
	/**
	 * Column Info
	 * @return agmtCtyCd
	 */
	public String getAgmtCtyCd() {
		return this.agmtCtyCd;
	}
	
	/**
	 * Column Info
	 * @return onhStsSeq
	 */
	public String getOnhStsSeq() {
		return this.onhStsSeq;
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
	 * @return uclmDt
	 */
	public String getUclmDt() {
		return this.uclmDt;
	}
	
	/**
	 * Column Info
	 * @return mftrVndrSeq
	 */
	public String getMftrVndrSeq() {
		return this.mftrVndrSeq;
	}
	
	/**
	 * Column Info
	 * @return lstStsSeq
	 */
	public String getLstStsSeq() {
		return this.lstStsSeq;
	}
	
	/**
	 * Column Info
	 * @return eccCd
	 */
	public String getEccCd() {
		return this.eccCd;
	}
	
	/**
	 * Column Info
	 * @return d2PayldFlg
	 */
	public String getD2PayldFlg() {
		return this.d2PayldFlg;
	}
	
	/**
	 * Column Info
	 * @return faIfTpCd
	 */
	public String getFaIfTpCd() {
		return this.faIfTpCd;
	}
	
	/**
	 * Column Info
	 * @return rccCd
	 */
	public String getRccCd() {
		return this.rccCd;
	}
	
	/**
	 * Column Info
	 * @return sysAreaGrpId
	 */
	public String getSysAreaGrpId() {
		return this.sysAreaGrpId;
	}
	
	/**
	 * Column Info
	 * @return preStsFlg
	 */
	public String getPreStsFlg() {
		return this.preStsFlg;
	}
	
	/**
	 * Column Info
	 * @return plstFlrFlg
	 */
	public String getPlstFlrFlg() {
		return this.plstFlrFlg;
	}
	
	/**
	 * Column Info
	 * @return skdDirCd
	 */
	public String getSkdDirCd() {
		return this.skdDirCd;
	}
	
	/**
	 * Column Info
	 * @return eaiIfNo
	 */
	public String getEaiIfNo() {
		return this.eaiIfNo;
	}
	
	/**
	 * Column Info
	 * @return uclmCntcPntNm
	 */
	public String getUclmCntcPntNm() {
		return this.uclmCntcPntNm;
	}
	
	/**
	 * Column Info
	 * @return maxTemp
	 */
	public String getMaxTemp() {
		return this.maxTemp;
	}
	
	/**
	 * Column Info
	 * @return faIfGrpStsCd
	 */
	public String getFaIfGrpStsCd() {
		return this.faIfGrpStsCd;
	}
	
	/**
	 * Column Info
	 * @return cntrCurrCd
	 */
	public String getCntrCurrCd() {
		return this.cntrCurrCd;
	}
	
	/**
	 * Column Info
	 * @return mftDt
	 */
	public String getMftDt() {
		return this.mftDt;
	}
	
	/**
	 * Column Info
	 * @return rfMkrSeq
	 */
	public String getRfMkrSeq() {
		return this.rfMkrSeq;
	}
	
	/**
	 * Column Info
	 * @return lccCd
	 */
	public String getLccCd() {
		return this.lccCd;
	}
	
	/**
	 * Column Info
	 * @return sccCd
	 */
	public String getSccCd() {
		return this.sccCd;
	}
	
	/**
	 * Column Info
	 * @return termCngSeq
	 */
	public String getTermCngSeq() {
		return this.termCngSeq;
	}
	
	/**
	 * Column Info
	 * @return lstStsYdCd
	 */
	public String getLstStsYdCd() {
		return this.lstStsYdCd;
	}
	
	/**
	 * Column Info
	 * @return uclmPlnRmk
	 */
	public String getUclmPlnRmk() {
		return this.uclmPlnRmk;
	}
	
	/**
	 * Column Info
	 * @return cntrNo
	 */
	public String getCntrNo() {
		return this.cntrNo;
	}
	
	/**
	 * Column Info
	 * @return faIfDt
	 */
	public String getFaIfDt() {
		return this.faIfDt;
	}
	
	/**
	 * Column Info
	 * @return imdtExtFlg
	 */
	public String getImdtExtFlg() {
		return this.imdtExtFlg;
	}
	
	/**
	 * Column Info
	 * @return cntrMtrlCd
	 */
	public String getCntrMtrlCd() {
		return this.cntrMtrlCd;
	}
	
	/**
	 * Column Info
	 * @return cnmvYr
	 */
	public String getCnmvYr() {
		return this.cnmvYr;
	}
	
	/**
	 * Column Info
	 * @return cntrRmk
	 */
	public String getCntrRmk() {
		return this.cntrRmk;
	}
	
	/**
	 * Column Info
	 * @return onhFreeDys
	 */
	public String getOnhFreeDys() {
		return this.onhFreeDys;
	}
	
	/**
	 * Column Info
	 * @return faIfErrMsg
	 */
	public String getFaIfErrMsg() {
		return this.faIfErrMsg;
	}
	
	/**
	 * Column Info
	 * @return rfTpCd
	 */
	public String getRfTpCd() {
		return this.rfTpCd;
	}
	

	/**
	 * Column Info
	 * @param onhYdCd
	 */
	public void setOnhYdCd(String onhYdCd) {
		this.onhYdCd = onhYdCd;
	}
	
	/**
	 * Column Info
	 * @param vslCd
	 */
	public void setVslCd(String vslCd) {
		this.vslCd = vslCd;
	}
	
	/**
	 * Column Info
	 * @param cntrAqzAmt
	 */
	public void setCntrAqzAmt(String cntrAqzAmt) {
		this.cntrAqzAmt = cntrAqzAmt;
	}
	
	/**
	 * Column Info
	 * @param faEqNo
	 */
	public void setFaEqNo(String faEqNo) {
		this.faEqNo = faEqNo;
	}
	
	/**
	 * Column Info
	 * @param cntrStsCd
	 */
	public void setCntrStsCd(String cntrStsCd) {
		this.cntrStsCd = cntrStsCd;
	}
	
	/**
	 * Column Info
	 * @param cnmvSeq
	 */
	public void setCnmvSeq(String cnmvSeq) {
		this.cnmvSeq = cnmvSeq;
	}
	
	/**
	 * Column Info
	 * @param ifSeq
	 */
	public void setIfSeq(String ifSeq) {
		this.ifSeq = ifSeq;
	}
	
	/**
	 * Column Info
	 * @param destYdCd
	 */
	public void setDestYdCd(String destYdCd) {
		this.destYdCd = destYdCd;
	}
	
	/**
	 * Column Info
	 * @param minTemp
	 */
	public void setMinTemp(String minTemp) {
		this.minTemp = minTemp;
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
	 * @param onhCntrStsCd
	 */
	public void setOnhCntrStsCd(String onhCntrStsCd) {
		this.onhCntrStsCd = onhCntrStsCd;
	}
	
	/**
	 * Column Info
	 * @param locCd
	 */
	public void setLocCd(String locCd) {
		this.locCd = locCd;
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
	 * @param mnrHngrBarTpCd
	 */
	public void setMnrHngrBarTpCd(String mnrHngrBarTpCd) {
		this.mnrHngrBarTpCd = mnrHngrBarTpCd;
	}
	
	/**
	 * Column Info
	 * @param cntrHngrBarAtchKnt
	 */
	public void setCntrHngrBarAtchKnt(String cntrHngrBarAtchKnt) {
		this.cntrHngrBarAtchKnt = cntrHngrBarAtchKnt;
	}
	
	/**
	 * Column Info
	 * @param lstmCd
	 */
	public void setLstmCd(String lstmCd) {
		this.lstmCd = lstmCd;
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
	 * @param acctQtyMzdCd
	 */
	public void setAcctQtyMzdCd(String acctQtyMzdCd) {
		this.acctQtyMzdCd = acctQtyMzdCd;
	}
	
	/**
	 * Column Info
	 * @param ownrCoCd
	 */
	public void setOwnrCoCd(String ownrCoCd) {
		this.ownrCoCd = ownrCoCd;
	}
	
	/**
	 * Column Info
	 * @param uclmFreeDys
	 */
	public void setUclmFreeDys(String uclmFreeDys) {
		this.uclmFreeDys = uclmFreeDys;
	}
	
	/**
	 * Column Info
	 * @param agmtSeq
	 */
	public void setAgmtSeq(String agmtSeq) {
		this.agmtSeq = agmtSeq;
	}
	
	/**
	 * Column Info
	 * @param cnmvDt
	 */
	public void setCnmvDt(String cnmvDt) {
		this.cnmvDt = cnmvDt;
	}
	
	/**
	 * Column Info
	 * @param faIfGrpSeqNo
	 */
	public void setFaIfGrpSeqNo(String faIfGrpSeqNo) {
		this.faIfGrpSeqNo = faIfGrpSeqNo;
	}
	
	/**
	 * Column Info
	 * @param skdVoyNo
	 */
	public void setSkdVoyNo(String skdVoyNo) {
		this.skdVoyNo = skdVoyNo;
	}
	
	/**
	 * Column Info
	 * @param hjsCreFlg
	 */
	public void setHjsCreFlg(String hjsCreFlg) {
		this.hjsCreFlg = hjsCreFlg;
	}
	
	/**
	 * Column Info
	 * @param aciacDivCd
	 */
	public void setAciacDivCd(String aciacDivCd) {
		this.aciacDivCd = aciacDivCd;
	}
	
	/**
	 * Column Info
	 * @param cnmvIdNo
	 */
	public void setCnmvIdNo(String cnmvIdNo) {
		this.cnmvIdNo = cnmvIdNo;
	}
	
	/**
	 * Column Info
	 * @param cntrInvstNo
	 */
	public void setCntrInvstNo(String cntrInvstNo) {
		this.cntrInvstNo = cntrInvstNo;
	}
	
	/**
	 * Column Info
	 * @param minOnhDys
	 */
	public void setMinOnhDys(String minOnhDys) {
		this.minOnhDys = minOnhDys;
	}
	
	/**
	 * Column Info
	 * @param dispFlg
	 */
	public void setDispFlg(String dispFlg) {
		this.dispFlg = dispFlg;
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
	 * @param uclmEndDt
	 */
	public void setUclmEndDt(String uclmEndDt) {
		this.uclmEndDt = uclmEndDt;
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
	 * @param uclmLsDivCd
	 */
	public void setUclmLsDivCd(String uclmLsDivCd) {
		this.uclmLsDivCd = uclmLsDivCd;
	}
	
	/**
	 * Column Info
	 * @param uclmRsn
	 */
	public void setUclmRsn(String uclmRsn) {
		this.uclmRsn = uclmRsn;
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
	 * @param fullFlg
	 */
	public void setFullFlg(String fullFlg) {
		this.fullFlg = fullFlg;
	}
	
	/**
	 * Column Info
	 * @param rfRfrNo
	 */
	public void setRfRfrNo(String rfRfrNo) {
		this.rfRfrNo = rfRfrNo;
	}
	
	/**
	 * Column Info
	 * @param cnmvGdt
	 */
	public void setCnmvGdt(String cnmvGdt) {
		this.cnmvGdt = cnmvGdt;
	}
	
	/**
	 * Column Info
	 * @param cntrHngrRckCd
	 */
	public void setCntrHngrRckCd(String cntrHngrRckCd) {
		this.cntrHngrRckCd = cntrHngrRckCd;
	}
	
	/**
	 * Column Info
	 * @param ifTtlRowKnt
	 */
	public void setIfTtlRowKnt(String ifTtlRowKnt) {
		this.ifTtlRowKnt = ifTtlRowKnt;
	}
	
	/**
	 * Column Info
	 * @param cntrSpecNo
	 */
	public void setCntrSpecNo(String cntrSpecNo) {
		this.cntrSpecNo = cntrSpecNo;
	}
	
	/**
	 * Column Info
	 * @param cnmvCycNo
	 */
	public void setCnmvCycNo(String cnmvCycNo) {
		this.cnmvCycNo = cnmvCycNo;
	}
	
	/**
	 * Column Info
	 * @param retAproNo
	 */
	public void setRetAproNo(String retAproNo) {
		this.retAproNo = retAproNo;
	}
	
	/**
	 * Column Info
	 * @param cntrUseCoCd
	 */
	public void setCntrUseCoCd(String cntrUseCoCd) {
		this.cntrUseCoCd = cntrUseCoCd;
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
	 * @param crntYdCd
	 */
	public void setCrntYdCd(String crntYdCd) {
		this.crntYdCd = crntYdCd;
	}
	
	/**
	 * Column Info
	 * @param dmgFlg
	 */
	public void setDmgFlg(String dmgFlg) {
		this.dmgFlg = dmgFlg;
	}
	
	/**
	 * Column Info
	 * @param rfMdlNm
	 */
	public void setRfMdlNm(String rfMdlNm) {
		this.rfMdlNm = rfMdlNm;
	}
	
	/**
	 * Column Info
	 * @param onhDt
	 */
	public void setOnhDt(String onhDt) {
		this.onhDt = onhDt;
	}
	
	/**
	 * Column Info
	 * @param rfubDt
	 */
	public void setRfubDt(String rfubDt) {
		this.rfubDt = rfubDt;
	}
	
	/**
	 * Column Info
	 * @param cntrAuthNo
	 */
	public void setCntrAuthNo(String cntrAuthNo) {
		this.cntrAuthNo = cntrAuthNo;
	}
	
	/**
	 * Column Info
	 * @param cnmvSplitNo
	 */
	public void setCnmvSplitNo(String cnmvSplitNo) {
		this.cnmvSplitNo = cnmvSplitNo;
	}
	
	/**
	 * Column Info
	 * @param faIfStsCd
	 */
	public void setFaIfStsCd(String faIfStsCd) {
		this.faIfStsCd = faIfStsCd;
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
	 * @param cnmvStsCd
	 */
	public void setCnmvStsCd(String cnmvStsCd) {
		this.cnmvStsCd = cnmvStsCd;
	}
	
	/**
	 * Column Info
	 * @param rfubFlg
	 */
	public void setRfubFlg(String rfubFlg) {
		this.rfubFlg = rfubFlg;
	}
	
	/**
	 * Column Info
	 * @param bkgKnt
	 */
	public void setBkgKnt(String bkgKnt) {
		this.bkgKnt = bkgKnt;
	}
	
	/**
	 * Column Info
	 * @param agmtCtyCd
	 */
	public void setAgmtCtyCd(String agmtCtyCd) {
		this.agmtCtyCd = agmtCtyCd;
	}
	
	/**
	 * Column Info
	 * @param onhStsSeq
	 */
	public void setOnhStsSeq(String onhStsSeq) {
		this.onhStsSeq = onhStsSeq;
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
	 * @param uclmDt
	 */
	public void setUclmDt(String uclmDt) {
		this.uclmDt = uclmDt;
	}
	
	/**
	 * Column Info
	 * @param mftrVndrSeq
	 */
	public void setMftrVndrSeq(String mftrVndrSeq) {
		this.mftrVndrSeq = mftrVndrSeq;
	}
	
	/**
	 * Column Info
	 * @param lstStsSeq
	 */
	public void setLstStsSeq(String lstStsSeq) {
		this.lstStsSeq = lstStsSeq;
	}
	
	/**
	 * Column Info
	 * @param eccCd
	 */
	public void setEccCd(String eccCd) {
		this.eccCd = eccCd;
	}
	
	/**
	 * Column Info
	 * @param d2PayldFlg
	 */
	public void setD2PayldFlg(String d2PayldFlg) {
		this.d2PayldFlg = d2PayldFlg;
	}
	
	/**
	 * Column Info
	 * @param faIfTpCd
	 */
	public void setFaIfTpCd(String faIfTpCd) {
		this.faIfTpCd = faIfTpCd;
	}
	
	/**
	 * Column Info
	 * @param rccCd
	 */
	public void setRccCd(String rccCd) {
		this.rccCd = rccCd;
	}
	
	/**
	 * Column Info
	 * @param sysAreaGrpId
	 */
	public void setSysAreaGrpId(String sysAreaGrpId) {
		this.sysAreaGrpId = sysAreaGrpId;
	}
	
	/**
	 * Column Info
	 * @param preStsFlg
	 */
	public void setPreStsFlg(String preStsFlg) {
		this.preStsFlg = preStsFlg;
	}
	
	/**
	 * Column Info
	 * @param plstFlrFlg
	 */
	public void setPlstFlrFlg(String plstFlrFlg) {
		this.plstFlrFlg = plstFlrFlg;
	}
	
	/**
	 * Column Info
	 * @param skdDirCd
	 */
	public void setSkdDirCd(String skdDirCd) {
		this.skdDirCd = skdDirCd;
	}
	
	/**
	 * Column Info
	 * @param eaiIfNo
	 */
	public void setEaiIfNo(String eaiIfNo) {
		this.eaiIfNo = eaiIfNo;
	}
	
	/**
	 * Column Info
	 * @param uclmCntcPntNm
	 */
	public void setUclmCntcPntNm(String uclmCntcPntNm) {
		this.uclmCntcPntNm = uclmCntcPntNm;
	}
	
	/**
	 * Column Info
	 * @param maxTemp
	 */
	public void setMaxTemp(String maxTemp) {
		this.maxTemp = maxTemp;
	}
	
	/**
	 * Column Info
	 * @param faIfGrpStsCd
	 */
	public void setFaIfGrpStsCd(String faIfGrpStsCd) {
		this.faIfGrpStsCd = faIfGrpStsCd;
	}
	
	/**
	 * Column Info
	 * @param cntrCurrCd
	 */
	public void setCntrCurrCd(String cntrCurrCd) {
		this.cntrCurrCd = cntrCurrCd;
	}
	
	/**
	 * Column Info
	 * @param mftDt
	 */
	public void setMftDt(String mftDt) {
		this.mftDt = mftDt;
	}
	
	/**
	 * Column Info
	 * @param rfMkrSeq
	 */
	public void setRfMkrSeq(String rfMkrSeq) {
		this.rfMkrSeq = rfMkrSeq;
	}
	
	/**
	 * Column Info
	 * @param lccCd
	 */
	public void setLccCd(String lccCd) {
		this.lccCd = lccCd;
	}
	
	/**
	 * Column Info
	 * @param sccCd
	 */
	public void setSccCd(String sccCd) {
		this.sccCd = sccCd;
	}
	
	/**
	 * Column Info
	 * @param termCngSeq
	 */
	public void setTermCngSeq(String termCngSeq) {
		this.termCngSeq = termCngSeq;
	}
	
	/**
	 * Column Info
	 * @param lstStsYdCd
	 */
	public void setLstStsYdCd(String lstStsYdCd) {
		this.lstStsYdCd = lstStsYdCd;
	}
	
	/**
	 * Column Info
	 * @param uclmPlnRmk
	 */
	public void setUclmPlnRmk(String uclmPlnRmk) {
		this.uclmPlnRmk = uclmPlnRmk;
	}
	
	/**
	 * Column Info
	 * @param cntrNo
	 */
	public void setCntrNo(String cntrNo) {
		this.cntrNo = cntrNo;
	}
	
	/**
	 * Column Info
	 * @param faIfDt
	 */
	public void setFaIfDt(String faIfDt) {
		this.faIfDt = faIfDt;
	}
	
	/**
	 * Column Info
	 * @param imdtExtFlg
	 */
	public void setImdtExtFlg(String imdtExtFlg) {
		this.imdtExtFlg = imdtExtFlg;
	}
	
	/**
	 * Column Info
	 * @param cntrMtrlCd
	 */
	public void setCntrMtrlCd(String cntrMtrlCd) {
		this.cntrMtrlCd = cntrMtrlCd;
	}
	
	/**
	 * Column Info
	 * @param cnmvYr
	 */
	public void setCnmvYr(String cnmvYr) {
		this.cnmvYr = cnmvYr;
	}
	
	/**
	 * Column Info
	 * @param cntrRmk
	 */
	public void setCntrRmk(String cntrRmk) {
		this.cntrRmk = cntrRmk;
	}
	
	/**
	 * Column Info
	 * @param onhFreeDys
	 */
	public void setOnhFreeDys(String onhFreeDys) {
		this.onhFreeDys = onhFreeDys;
	}
	
	/**
	 * Column Info
	 * @param faIfErrMsg
	 */
	public void setFaIfErrMsg(String faIfErrMsg) {
		this.faIfErrMsg = faIfErrMsg;
	}
	
	/**
	 * Column Info
	 * @param rfTpCd
	 */
	public void setRfTpCd(String rfTpCd) {
		this.rfTpCd = rfTpCd;
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
		setOnhYdCd(JSPUtil.getParameter(request, prefix + "onh_yd_cd", ""));
		setVslCd(JSPUtil.getParameter(request, prefix + "vsl_cd", ""));
		setCntrAqzAmt(JSPUtil.getParameter(request, prefix + "cntr_aqz_amt", ""));
		setFaEqNo(JSPUtil.getParameter(request, prefix + "fa_eq_no", ""));
		setCntrStsCd(JSPUtil.getParameter(request, prefix + "cntr_sts_cd", ""));
		setCnmvSeq(JSPUtil.getParameter(request, prefix + "cnmv_seq", ""));
		setIfSeq(JSPUtil.getParameter(request, prefix + "if_seq", ""));
		setDestYdCd(JSPUtil.getParameter(request, prefix + "dest_yd_cd", ""));
		setMinTemp(JSPUtil.getParameter(request, prefix + "min_temp", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setOnhCntrStsCd(JSPUtil.getParameter(request, prefix + "onh_cntr_sts_cd", ""));
		setLocCd(JSPUtil.getParameter(request, prefix + "loc_cd", ""));
		setCntrTpszCd(JSPUtil.getParameter(request, prefix + "cntr_tpsz_cd", ""));
		setMnrHngrBarTpCd(JSPUtil.getParameter(request, prefix + "mnr_hngr_bar_tp_cd", ""));
		setCntrHngrBarAtchKnt(JSPUtil.getParameter(request, prefix + "cntr_hngr_bar_atch_knt", ""));
		setLstmCd(JSPUtil.getParameter(request, prefix + "lstm_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setAcctQtyMzdCd(JSPUtil.getParameter(request, prefix + "acct_qty_mzd_cd", ""));
		setOwnrCoCd(JSPUtil.getParameter(request, prefix + "ownr_co_cd", ""));
		setUclmFreeDys(JSPUtil.getParameter(request, prefix + "uclm_free_dys", ""));
		setAgmtSeq(JSPUtil.getParameter(request, prefix + "agmt_seq", ""));
		setCnmvDt(JSPUtil.getParameter(request, prefix + "cnmv_dt", ""));
		setFaIfGrpSeqNo(JSPUtil.getParameter(request, prefix + "fa_if_grp_seq_no", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, prefix + "skd_voy_no", ""));
		setHjsCreFlg(JSPUtil.getParameter(request, prefix + "hjs_cre_flg", ""));
		setAciacDivCd(JSPUtil.getParameter(request, prefix + "aciac_div_cd", ""));
		setCnmvIdNo(JSPUtil.getParameter(request, prefix + "cnmv_id_no", ""));
		setCntrInvstNo(JSPUtil.getParameter(request, prefix + "cntr_invst_no", ""));
		setMinOnhDys(JSPUtil.getParameter(request, prefix + "min_onh_dys", ""));
		setDispFlg(JSPUtil.getParameter(request, prefix + "disp_flg", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setUclmEndDt(JSPUtil.getParameter(request, prefix + "uclm_end_dt", ""));
		setBkgNo(JSPUtil.getParameter(request, prefix + "bkg_no", ""));
		setUclmLsDivCd(JSPUtil.getParameter(request, prefix + "uclm_ls_div_cd", ""));
		setUclmRsn(JSPUtil.getParameter(request, prefix + "uclm_rsn", ""));
		setVndrSeq(JSPUtil.getParameter(request, prefix + "vndr_seq", ""));
		setFullFlg(JSPUtil.getParameter(request, prefix + "full_flg", ""));
		setRfRfrNo(JSPUtil.getParameter(request, prefix + "rf_rfr_no", ""));
		setCnmvGdt(JSPUtil.getParameter(request, prefix + "cnmv_gdt", ""));
		setCntrHngrRckCd(JSPUtil.getParameter(request, prefix + "cntr_hngr_rck_cd", ""));
		setIfTtlRowKnt(JSPUtil.getParameter(request, prefix + "if_ttl_row_knt", ""));
		setCntrSpecNo(JSPUtil.getParameter(request, prefix + "cntr_spec_no", ""));
		setCnmvCycNo(JSPUtil.getParameter(request, prefix + "cnmv_cyc_no", ""));
		setRetAproNo(JSPUtil.getParameter(request, prefix + "ret_apro_no", ""));
		setCntrUseCoCd(JSPUtil.getParameter(request, prefix + "cntr_use_co_cd", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setCrntYdCd(JSPUtil.getParameter(request, prefix + "crnt_yd_cd", ""));
		setDmgFlg(JSPUtil.getParameter(request, prefix + "dmg_flg", ""));
		setRfMdlNm(JSPUtil.getParameter(request, prefix + "rf_mdl_nm", ""));
		setOnhDt(JSPUtil.getParameter(request, prefix + "onh_dt", ""));
		setRfubDt(JSPUtil.getParameter(request, prefix + "rfub_dt", ""));
		setCntrAuthNo(JSPUtil.getParameter(request, prefix + "cntr_auth_no", ""));
		setCnmvSplitNo(JSPUtil.getParameter(request, prefix + "cnmv_split_no", ""));
		setFaIfStsCd(JSPUtil.getParameter(request, prefix + "fa_if_sts_cd", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setCnmvStsCd(JSPUtil.getParameter(request, prefix + "cnmv_sts_cd", ""));
		setRfubFlg(JSPUtil.getParameter(request, prefix + "rfub_flg", ""));
		setBkgKnt(JSPUtil.getParameter(request, prefix + "bkg_knt", ""));
		setAgmtCtyCd(JSPUtil.getParameter(request, prefix + "agmt_cty_cd", ""));
		setOnhStsSeq(JSPUtil.getParameter(request, prefix + "onh_sts_seq", ""));
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setUclmDt(JSPUtil.getParameter(request, prefix + "uclm_dt", ""));
		setMftrVndrSeq(JSPUtil.getParameter(request, prefix + "mftr_vndr_seq", ""));
		setLstStsSeq(JSPUtil.getParameter(request, prefix + "lst_sts_seq", ""));
		setEccCd(JSPUtil.getParameter(request, prefix + "ecc_cd", ""));
		setD2PayldFlg(JSPUtil.getParameter(request, prefix + "d2_payld_flg", ""));
		setFaIfTpCd(JSPUtil.getParameter(request, prefix + "fa_if_tp_cd", ""));
		setRccCd(JSPUtil.getParameter(request, prefix + "rcc_cd", ""));
		setSysAreaGrpId(JSPUtil.getParameter(request, prefix + "sys_area_grp_id", ""));
		setPreStsFlg(JSPUtil.getParameter(request, prefix + "pre_sts_flg", ""));
		setPlstFlrFlg(JSPUtil.getParameter(request, prefix + "plst_flr_flg", ""));
		setSkdDirCd(JSPUtil.getParameter(request, prefix + "skd_dir_cd", ""));
		setEaiIfNo(JSPUtil.getParameter(request, prefix + "eai_if_no", ""));
		setUclmCntcPntNm(JSPUtil.getParameter(request, prefix + "uclm_cntc_pnt_nm", ""));
		setMaxTemp(JSPUtil.getParameter(request, prefix + "max_temp", ""));
		setFaIfGrpStsCd(JSPUtil.getParameter(request, prefix + "fa_if_grp_sts_cd", ""));
		setCntrCurrCd(JSPUtil.getParameter(request, prefix + "cntr_curr_cd", ""));
		setMftDt(JSPUtil.getParameter(request, prefix + "mft_dt", ""));
		setRfMkrSeq(JSPUtil.getParameter(request, prefix + "rf_mkr_seq", ""));
		setLccCd(JSPUtil.getParameter(request, prefix + "lcc_cd", ""));
		setSccCd(JSPUtil.getParameter(request, prefix + "scc_cd", ""));
		setTermCngSeq(JSPUtil.getParameter(request, prefix + "term_cng_seq", ""));
		setLstStsYdCd(JSPUtil.getParameter(request, prefix + "lst_sts_yd_cd", ""));
		setUclmPlnRmk(JSPUtil.getParameter(request, prefix + "uclm_pln_rmk", ""));
		setCntrNo(JSPUtil.getParameter(request, prefix + "cntr_no", ""));
		setFaIfDt(JSPUtil.getParameter(request, prefix + "fa_if_dt", ""));
		setImdtExtFlg(JSPUtil.getParameter(request, prefix + "imdt_ext_flg", ""));
		setCntrMtrlCd(JSPUtil.getParameter(request, prefix + "cntr_mtrl_cd", ""));
		setCnmvYr(JSPUtil.getParameter(request, prefix + "cnmv_yr", ""));
		setCntrRmk(JSPUtil.getParameter(request, prefix + "cntr_rmk", ""));
		setOnhFreeDys(JSPUtil.getParameter(request, prefix + "onh_free_dys", ""));
		setFaIfErrMsg(JSPUtil.getParameter(request, prefix + "fa_if_err_msg", ""));
		setRfTpCd(JSPUtil.getParameter(request, prefix + "rf_tp_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return MstContainerVO[]
	 */
	public MstContainerVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return MstContainerVO[]
	 */
	public MstContainerVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		MstContainerVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] onhYdCd = (JSPUtil.getParameter(request, prefix	+ "onh_yd_cd", length));
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] cntrAqzAmt = (JSPUtil.getParameter(request, prefix	+ "cntr_aqz_amt", length));
			String[] faEqNo = (JSPUtil.getParameter(request, prefix	+ "fa_eq_no", length));
			String[] cntrStsCd = (JSPUtil.getParameter(request, prefix	+ "cntr_sts_cd", length));
			String[] cnmvSeq = (JSPUtil.getParameter(request, prefix	+ "cnmv_seq", length));
			String[] ifSeq = (JSPUtil.getParameter(request, prefix	+ "if_seq", length));
			String[] destYdCd = (JSPUtil.getParameter(request, prefix	+ "dest_yd_cd", length));
			String[] minTemp = (JSPUtil.getParameter(request, prefix	+ "min_temp", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] onhCntrStsCd = (JSPUtil.getParameter(request, prefix	+ "onh_cntr_sts_cd", length));
			String[] locCd = (JSPUtil.getParameter(request, prefix	+ "loc_cd", length));
			String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_cd", length));
			String[] mnrHngrBarTpCd = (JSPUtil.getParameter(request, prefix	+ "mnr_hngr_bar_tp_cd", length));
			String[] cntrHngrBarAtchKnt = (JSPUtil.getParameter(request, prefix	+ "cntr_hngr_bar_atch_knt", length));
			String[] lstmCd = (JSPUtil.getParameter(request, prefix	+ "lstm_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] acctQtyMzdCd = (JSPUtil.getParameter(request, prefix	+ "acct_qty_mzd_cd", length));
			String[] ownrCoCd = (JSPUtil.getParameter(request, prefix	+ "ownr_co_cd", length));
			String[] uclmFreeDys = (JSPUtil.getParameter(request, prefix	+ "uclm_free_dys", length));
			String[] agmtSeq = (JSPUtil.getParameter(request, prefix	+ "agmt_seq", length));
			String[] cnmvDt = (JSPUtil.getParameter(request, prefix	+ "cnmv_dt", length));
			String[] faIfGrpSeqNo = (JSPUtil.getParameter(request, prefix	+ "fa_if_grp_seq_no", length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no", length));
			String[] hjsCreFlg = (JSPUtil.getParameter(request, prefix	+ "hjs_cre_flg", length));
			String[] aciacDivCd = (JSPUtil.getParameter(request, prefix	+ "aciac_div_cd", length));
			String[] cnmvIdNo = (JSPUtil.getParameter(request, prefix	+ "cnmv_id_no", length));
			String[] cntrInvstNo = (JSPUtil.getParameter(request, prefix	+ "cntr_invst_no", length));
			String[] minOnhDys = (JSPUtil.getParameter(request, prefix	+ "min_onh_dys", length));
			String[] dispFlg = (JSPUtil.getParameter(request, prefix	+ "disp_flg", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] uclmEndDt = (JSPUtil.getParameter(request, prefix	+ "uclm_end_dt", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] uclmLsDivCd = (JSPUtil.getParameter(request, prefix	+ "uclm_ls_div_cd", length));
			String[] uclmRsn = (JSPUtil.getParameter(request, prefix	+ "uclm_rsn", length));
			String[] vndrSeq = (JSPUtil.getParameter(request, prefix	+ "vndr_seq", length));
			String[] fullFlg = (JSPUtil.getParameter(request, prefix	+ "full_flg", length));
			String[] rfRfrNo = (JSPUtil.getParameter(request, prefix	+ "rf_rfr_no", length));
			String[] cnmvGdt = (JSPUtil.getParameter(request, prefix	+ "cnmv_gdt", length));
			String[] cntrHngrRckCd = (JSPUtil.getParameter(request, prefix	+ "cntr_hngr_rck_cd", length));
			String[] ifTtlRowKnt = (JSPUtil.getParameter(request, prefix	+ "if_ttl_row_knt", length));
			String[] cntrSpecNo = (JSPUtil.getParameter(request, prefix	+ "cntr_spec_no", length));
			String[] cnmvCycNo = (JSPUtil.getParameter(request, prefix	+ "cnmv_cyc_no", length));
			String[] retAproNo = (JSPUtil.getParameter(request, prefix	+ "ret_apro_no", length));
			String[] cntrUseCoCd = (JSPUtil.getParameter(request, prefix	+ "cntr_use_co_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] crntYdCd = (JSPUtil.getParameter(request, prefix	+ "crnt_yd_cd", length));
			String[] dmgFlg = (JSPUtil.getParameter(request, prefix	+ "dmg_flg", length));
			String[] rfMdlNm = (JSPUtil.getParameter(request, prefix	+ "rf_mdl_nm", length));
			String[] onhDt = (JSPUtil.getParameter(request, prefix	+ "onh_dt", length));
			String[] rfubDt = (JSPUtil.getParameter(request, prefix	+ "rfub_dt", length));
			String[] cntrAuthNo = (JSPUtil.getParameter(request, prefix	+ "cntr_auth_no", length));
			String[] cnmvSplitNo = (JSPUtil.getParameter(request, prefix	+ "cnmv_split_no", length));
			String[] faIfStsCd = (JSPUtil.getParameter(request, prefix	+ "fa_if_sts_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] cnmvStsCd = (JSPUtil.getParameter(request, prefix	+ "cnmv_sts_cd", length));
			String[] rfubFlg = (JSPUtil.getParameter(request, prefix	+ "rfub_flg", length));
			String[] bkgKnt = (JSPUtil.getParameter(request, prefix	+ "bkg_knt", length));
			String[] agmtCtyCd = (JSPUtil.getParameter(request, prefix	+ "agmt_cty_cd", length));
			String[] onhStsSeq = (JSPUtil.getParameter(request, prefix	+ "onh_sts_seq", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] uclmDt = (JSPUtil.getParameter(request, prefix	+ "uclm_dt", length));
			String[] mftrVndrSeq = (JSPUtil.getParameter(request, prefix	+ "mftr_vndr_seq", length));
			String[] lstStsSeq = (JSPUtil.getParameter(request, prefix	+ "lst_sts_seq", length));
			String[] eccCd = (JSPUtil.getParameter(request, prefix	+ "ecc_cd", length));
			String[] d2PayldFlg = (JSPUtil.getParameter(request, prefix	+ "d2_payld_flg", length));
			String[] faIfTpCd = (JSPUtil.getParameter(request, prefix	+ "fa_if_tp_cd", length));
			String[] rccCd = (JSPUtil.getParameter(request, prefix	+ "rcc_cd", length));
			String[] sysAreaGrpId = (JSPUtil.getParameter(request, prefix	+ "sys_area_grp_id", length));
			String[] preStsFlg = (JSPUtil.getParameter(request, prefix	+ "pre_sts_flg", length));
			String[] plstFlrFlg = (JSPUtil.getParameter(request, prefix	+ "plst_flr_flg", length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd", length));
			String[] eaiIfNo = (JSPUtil.getParameter(request, prefix	+ "eai_if_no", length));
			String[] uclmCntcPntNm = (JSPUtil.getParameter(request, prefix	+ "uclm_cntc_pnt_nm", length));
			String[] maxTemp = (JSPUtil.getParameter(request, prefix	+ "max_temp", length));
			String[] faIfGrpStsCd = (JSPUtil.getParameter(request, prefix	+ "fa_if_grp_sts_cd", length));
			String[] cntrCurrCd = (JSPUtil.getParameter(request, prefix	+ "cntr_curr_cd", length));
			String[] mftDt = (JSPUtil.getParameter(request, prefix	+ "mft_dt", length));
			String[] rfMkrSeq = (JSPUtil.getParameter(request, prefix	+ "rf_mkr_seq", length));
			String[] lccCd = (JSPUtil.getParameter(request, prefix	+ "lcc_cd", length));
			String[] sccCd = (JSPUtil.getParameter(request, prefix	+ "scc_cd", length));
			String[] termCngSeq = (JSPUtil.getParameter(request, prefix	+ "term_cng_seq", length));
			String[] lstStsYdCd = (JSPUtil.getParameter(request, prefix	+ "lst_sts_yd_cd", length));
			String[] uclmPlnRmk = (JSPUtil.getParameter(request, prefix	+ "uclm_pln_rmk", length));
			String[] cntrNo = (JSPUtil.getParameter(request, prefix	+ "cntr_no", length));
			String[] faIfDt = (JSPUtil.getParameter(request, prefix	+ "fa_if_dt", length));
			String[] imdtExtFlg = (JSPUtil.getParameter(request, prefix	+ "imdt_ext_flg", length));
			String[] cntrMtrlCd = (JSPUtil.getParameter(request, prefix	+ "cntr_mtrl_cd", length));
			String[] cnmvYr = (JSPUtil.getParameter(request, prefix	+ "cnmv_yr", length));
			String[] cntrRmk = (JSPUtil.getParameter(request, prefix	+ "cntr_rmk", length));
			String[] onhFreeDys = (JSPUtil.getParameter(request, prefix	+ "onh_free_dys", length));
			String[] faIfErrMsg = (JSPUtil.getParameter(request, prefix	+ "fa_if_err_msg", length));
			String[] rfTpCd = (JSPUtil.getParameter(request, prefix	+ "rf_tp_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new MstContainerVO();
				if (onhYdCd[i] != null)
					model.setOnhYdCd(onhYdCd[i]);
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (cntrAqzAmt[i] != null)
					model.setCntrAqzAmt(cntrAqzAmt[i]);
				if (faEqNo[i] != null)
					model.setFaEqNo(faEqNo[i]);
				if (cntrStsCd[i] != null)
					model.setCntrStsCd(cntrStsCd[i]);
				if (cnmvSeq[i] != null)
					model.setCnmvSeq(cnmvSeq[i]);
				if (ifSeq[i] != null)
					model.setIfSeq(ifSeq[i]);
				if (destYdCd[i] != null)
					model.setDestYdCd(destYdCd[i]);
				if (minTemp[i] != null)
					model.setMinTemp(minTemp[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (onhCntrStsCd[i] != null)
					model.setOnhCntrStsCd(onhCntrStsCd[i]);
				if (locCd[i] != null)
					model.setLocCd(locCd[i]);
				if (cntrTpszCd[i] != null)
					model.setCntrTpszCd(cntrTpszCd[i]);
				if (mnrHngrBarTpCd[i] != null)
					model.setMnrHngrBarTpCd(mnrHngrBarTpCd[i]);
				if (cntrHngrBarAtchKnt[i] != null)
					model.setCntrHngrBarAtchKnt(cntrHngrBarAtchKnt[i]);
				if (lstmCd[i] != null)
					model.setLstmCd(lstmCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (acctQtyMzdCd[i] != null)
					model.setAcctQtyMzdCd(acctQtyMzdCd[i]);
				if (ownrCoCd[i] != null)
					model.setOwnrCoCd(ownrCoCd[i]);
				if (uclmFreeDys[i] != null)
					model.setUclmFreeDys(uclmFreeDys[i]);
				if (agmtSeq[i] != null)
					model.setAgmtSeq(agmtSeq[i]);
				if (cnmvDt[i] != null)
					model.setCnmvDt(cnmvDt[i]);
				if (faIfGrpSeqNo[i] != null)
					model.setFaIfGrpSeqNo(faIfGrpSeqNo[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (hjsCreFlg[i] != null)
					model.setHjsCreFlg(hjsCreFlg[i]);
				if (aciacDivCd[i] != null)
					model.setAciacDivCd(aciacDivCd[i]);
				if (cnmvIdNo[i] != null)
					model.setCnmvIdNo(cnmvIdNo[i]);
				if (cntrInvstNo[i] != null)
					model.setCntrInvstNo(cntrInvstNo[i]);
				if (minOnhDys[i] != null)
					model.setMinOnhDys(minOnhDys[i]);
				if (dispFlg[i] != null)
					model.setDispFlg(dispFlg[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (uclmEndDt[i] != null)
					model.setUclmEndDt(uclmEndDt[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (uclmLsDivCd[i] != null)
					model.setUclmLsDivCd(uclmLsDivCd[i]);
				if (uclmRsn[i] != null)
					model.setUclmRsn(uclmRsn[i]);
				if (vndrSeq[i] != null)
					model.setVndrSeq(vndrSeq[i]);
				if (fullFlg[i] != null)
					model.setFullFlg(fullFlg[i]);
				if (rfRfrNo[i] != null)
					model.setRfRfrNo(rfRfrNo[i]);
				if (cnmvGdt[i] != null)
					model.setCnmvGdt(cnmvGdt[i]);
				if (cntrHngrRckCd[i] != null)
					model.setCntrHngrRckCd(cntrHngrRckCd[i]);
				if (ifTtlRowKnt[i] != null)
					model.setIfTtlRowKnt(ifTtlRowKnt[i]);
				if (cntrSpecNo[i] != null)
					model.setCntrSpecNo(cntrSpecNo[i]);
				if (cnmvCycNo[i] != null)
					model.setCnmvCycNo(cnmvCycNo[i]);
				if (retAproNo[i] != null)
					model.setRetAproNo(retAproNo[i]);
				if (cntrUseCoCd[i] != null)
					model.setCntrUseCoCd(cntrUseCoCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (crntYdCd[i] != null)
					model.setCrntYdCd(crntYdCd[i]);
				if (dmgFlg[i] != null)
					model.setDmgFlg(dmgFlg[i]);
				if (rfMdlNm[i] != null)
					model.setRfMdlNm(rfMdlNm[i]);
				if (onhDt[i] != null)
					model.setOnhDt(onhDt[i]);
				if (rfubDt[i] != null)
					model.setRfubDt(rfubDt[i]);
				if (cntrAuthNo[i] != null)
					model.setCntrAuthNo(cntrAuthNo[i]);
				if (cnmvSplitNo[i] != null)
					model.setCnmvSplitNo(cnmvSplitNo[i]);
				if (faIfStsCd[i] != null)
					model.setFaIfStsCd(faIfStsCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (cnmvStsCd[i] != null)
					model.setCnmvStsCd(cnmvStsCd[i]);
				if (rfubFlg[i] != null)
					model.setRfubFlg(rfubFlg[i]);
				if (bkgKnt[i] != null)
					model.setBkgKnt(bkgKnt[i]);
				if (agmtCtyCd[i] != null)
					model.setAgmtCtyCd(agmtCtyCd[i]);
				if (onhStsSeq[i] != null)
					model.setOnhStsSeq(onhStsSeq[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (uclmDt[i] != null)
					model.setUclmDt(uclmDt[i]);
				if (mftrVndrSeq[i] != null)
					model.setMftrVndrSeq(mftrVndrSeq[i]);
				if (lstStsSeq[i] != null)
					model.setLstStsSeq(lstStsSeq[i]);
				if (eccCd[i] != null)
					model.setEccCd(eccCd[i]);
				if (d2PayldFlg[i] != null)
					model.setD2PayldFlg(d2PayldFlg[i]);
				if (faIfTpCd[i] != null)
					model.setFaIfTpCd(faIfTpCd[i]);
				if (rccCd[i] != null)
					model.setRccCd(rccCd[i]);
				if (sysAreaGrpId[i] != null)
					model.setSysAreaGrpId(sysAreaGrpId[i]);
				if (preStsFlg[i] != null)
					model.setPreStsFlg(preStsFlg[i]);
				if (plstFlrFlg[i] != null)
					model.setPlstFlrFlg(plstFlrFlg[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (eaiIfNo[i] != null)
					model.setEaiIfNo(eaiIfNo[i]);
				if (uclmCntcPntNm[i] != null)
					model.setUclmCntcPntNm(uclmCntcPntNm[i]);
				if (maxTemp[i] != null)
					model.setMaxTemp(maxTemp[i]);
				if (faIfGrpStsCd[i] != null)
					model.setFaIfGrpStsCd(faIfGrpStsCd[i]);
				if (cntrCurrCd[i] != null)
					model.setCntrCurrCd(cntrCurrCd[i]);
				if (mftDt[i] != null)
					model.setMftDt(mftDt[i]);
				if (rfMkrSeq[i] != null)
					model.setRfMkrSeq(rfMkrSeq[i]);
				if (lccCd[i] != null)
					model.setLccCd(lccCd[i]);
				if (sccCd[i] != null)
					model.setSccCd(sccCd[i]);
				if (termCngSeq[i] != null)
					model.setTermCngSeq(termCngSeq[i]);
				if (lstStsYdCd[i] != null)
					model.setLstStsYdCd(lstStsYdCd[i]);
				if (uclmPlnRmk[i] != null)
					model.setUclmPlnRmk(uclmPlnRmk[i]);
				if (cntrNo[i] != null)
					model.setCntrNo(cntrNo[i]);
				if (faIfDt[i] != null)
					model.setFaIfDt(faIfDt[i]);
				if (imdtExtFlg[i] != null)
					model.setImdtExtFlg(imdtExtFlg[i]);
				if (cntrMtrlCd[i] != null)
					model.setCntrMtrlCd(cntrMtrlCd[i]);
				if (cnmvYr[i] != null)
					model.setCnmvYr(cnmvYr[i]);
				if (cntrRmk[i] != null)
					model.setCntrRmk(cntrRmk[i]);
				if (onhFreeDys[i] != null)
					model.setOnhFreeDys(onhFreeDys[i]);
				if (faIfErrMsg[i] != null)
					model.setFaIfErrMsg(faIfErrMsg[i]);
				if (rfTpCd[i] != null)
					model.setRfTpCd(rfTpCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getMstContainerVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return MstContainerVO[]
	 */
	public MstContainerVO[] getMstContainerVOs(){
		MstContainerVO[] vos = (MstContainerVO[])models.toArray(new MstContainerVO[models.size()]);
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
		this.onhYdCd = this.onhYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrAqzAmt = this.cntrAqzAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faEqNo = this.faEqNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrStsCd = this.cntrStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cnmvSeq = this.cnmvSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ifSeq = this.ifSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.destYdCd = this.destYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.minTemp = this.minTemp .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.onhCntrStsCd = this.onhCntrStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.locCd = this.locCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszCd = this.cntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mnrHngrBarTpCd = this.mnrHngrBarTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrHngrBarAtchKnt = this.cntrHngrBarAtchKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lstmCd = this.lstmCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acctQtyMzdCd = this.acctQtyMzdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ownrCoCd = this.ownrCoCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.uclmFreeDys = this.uclmFreeDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtSeq = this.agmtSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cnmvDt = this.cnmvDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faIfGrpSeqNo = this.faIfGrpSeqNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hjsCreFlg = this.hjsCreFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aciacDivCd = this.aciacDivCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cnmvIdNo = this.cnmvIdNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrInvstNo = this.cntrInvstNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.minOnhDys = this.minOnhDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dispFlg = this.dispFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.uclmEndDt = this.uclmEndDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.uclmLsDivCd = this.uclmLsDivCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.uclmRsn = this.uclmRsn .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrSeq = this.vndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fullFlg = this.fullFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rfRfrNo = this.rfRfrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cnmvGdt = this.cnmvGdt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrHngrRckCd = this.cntrHngrRckCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ifTtlRowKnt = this.ifTtlRowKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrSpecNo = this.cntrSpecNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cnmvCycNo = this.cnmvCycNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.retAproNo = this.retAproNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrUseCoCd = this.cntrUseCoCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.crntYdCd = this.crntYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dmgFlg = this.dmgFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rfMdlNm = this.rfMdlNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.onhDt = this.onhDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rfubDt = this.rfubDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrAuthNo = this.cntrAuthNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cnmvSplitNo = this.cnmvSplitNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faIfStsCd = this.faIfStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cnmvStsCd = this.cnmvStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rfubFlg = this.rfubFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgKnt = this.bkgKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtCtyCd = this.agmtCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.onhStsSeq = this.onhStsSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.uclmDt = this.uclmDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mftrVndrSeq = this.mftrVndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lstStsSeq = this.lstStsSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eccCd = this.eccCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.d2PayldFlg = this.d2PayldFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faIfTpCd = this.faIfTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rccCd = this.rccCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sysAreaGrpId = this.sysAreaGrpId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.preStsFlg = this.preStsFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.plstFlrFlg = this.plstFlrFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eaiIfNo = this.eaiIfNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.uclmCntcPntNm = this.uclmCntcPntNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.maxTemp = this.maxTemp .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faIfGrpStsCd = this.faIfGrpStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrCurrCd = this.cntrCurrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mftDt = this.mftDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rfMkrSeq = this.rfMkrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lccCd = this.lccCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sccCd = this.sccCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.termCngSeq = this.termCngSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lstStsYdCd = this.lstStsYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.uclmPlnRmk = this.uclmPlnRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrNo = this.cntrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faIfDt = this.faIfDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imdtExtFlg = this.imdtExtFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrMtrlCd = this.cntrMtrlCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cnmvYr = this.cnmvYr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrRmk = this.cntrRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.onhFreeDys = this.onhFreeDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faIfErrMsg = this.faIfErrMsg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rfTpCd = this.rfTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
