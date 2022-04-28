/*=========================================================
 *Copyright(c) 2015 CyberLogitec
 *@FileName : TrsTrspWrkOrdPrvTmpVO.java
 *@FileTitle : TrsTrspWrkOrdPrvTmpVO
 *Open Issues :
 *Change history :
 *@LastModifyDate : 2015.07.02
 *@LastModifier : 
 *@LastVersion : 1.0
 * 2015.07.02  
 * 1.0 Creation
=========================================================*/

package com.clt.syscommon.common.table;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.clt.framework.component.common.AbstractValueObject;
import com.clt.framework.component.util.JSPUtil;

/**
 * Table Value Ojbect<br>
 * 관련 Event 에서 생성, 서버실행요청시 Data 전달역할을 수행하는 Value Object
 * 
 * @author
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class TrsTrspWrkOrdPrvTmpVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;

	private Collection<TrsTrspWrkOrdPrvTmpVO> models = new ArrayList<TrsTrspWrkOrdPrvTmpVO>();

	/* Column Info */
	private String cntrKgsWgt = null;
	/* Column Info */
	private String toNodCd = null;
	/* Column Info */
	private String dtnUseFlg = null;
	/* Column Info */
	private String woCxlFlg = null;
	/* Column Info */
	private String trspSoSeq = null;
	/* Column Info */
	private String cgoTpCd = null;
	/* Column Info */
	private String fdrSkdVoyNo = null;
	/* Column Info */
	private String usdTtlAmt = null;
	/* Column Info */
	private String trspAgmtRtTpCd = null;
	/* Column Info */
	private String n3ptyDesc = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String n3ptyOfcCd = null;
	/* Column Info */
	private String dorPstCd = null;
	/* Column Info */
	private String cntcPsonFaxNo = null;
	/* Column Info */
	private String n3ptyBilTpCd = null;
	/* Column Info */
	private String fdrVslCd = null;
	/* Column Info */
	private String woIssKnt = null;
	/* Column Info */
	private String trspCostDtlModCd = null;
	/* Column Info */
	private String trspFrstFlg = null;
	/* Column Info */
	private String dorNodPlnDt = null;
	/* Column Info */
	private String woFmtTpCd = null;
	/* Column Info */
	private String woBlNoIssFlg = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String custCntCd = null;
	/* Column Info */
	private String n3ptyVndrSeq = null;
	/* Column Info */
	private String trspSoCmbTpCd = null;
	/* Column Info */
	private String trspWoSeq = null;
	/* Column Info */
	private String trspDfltVndrFlg = null;
	/* Column Info */
	private String cntcPsonPhnNo = null;
	/* Column Info */
	private String cntrLbsWgt = null;
	/* Column Info */
	private String negoAmt = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String fctryNm = null;
	/* Column Info */
	private String trspAgmtSeq = null;
	/* Column Info */
	private String vndrSeq = null;
	/* Column Info */
	private String wgtMeasUtCd = null;
	/* Column Info */
	private String loclUpdDt = null;
	/* Column Info */
	private String currCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String trspAgmtOfcCtyCd = null;
	/* Column Info */
	private String edwUpdDt = null;
	/* Column Info */
	private String n3ptyBilBzcAmt = null;
	/* Column Info */
	private String n3ptyCurrCd = null;
	/* Column Info */
	private String n3ptyCustSeq = null;
	/* Column Info */
	private String fdrSkdDirCd = null;
	/* Column Info */
	private String trspSoOfcCtyCd = null;
	/* Column Info */
	private String woIssStsCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String interRmk = null;
	/* Column Info */
	private String cntcPsonNm = null;
	/* Column Info */
	private String creOfcCd = null;
	/* Column Info */
	private String dorNodCd = null;
	/* Column Info */
	private String trspSoStsCd = null;
	/* Column Info */
	private String n3ptyCustCntCd = null;
	/* Column Info */
	private String spclInstrRmk = null;
	/* Column Info */
	private String trspCrrModCd = null;
	/* Column Info */
	private String ovrWgtScgAmt = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String etcAddAmt = null;
	/* Column Info */
	private String trspAgmtWyTpCd = null;
	/* Column Info */
	private String loclCreDt = null;
	/* Column Info */
	private String trspRjctRsnCd = null;
	/* Column Info */
	private String lstNodPlnDt = null;
	/* Column Info */
	private String bzcAmt = null;
	/* Column Info */
	private String custSeq = null;
	/* Column Info */
	private String woIssNo = null;
	/* Column Info */
	private String trspWoOfcCtyCd = null;
	/* Column Info */
	private String fuelScgAmt = null;
	/* Column Info */
	private String fmNodCd = null;
	/* Column Info */
	private String n3ptyBilFlg = null;
	/* Column Info */
	private String n1stNodPlnDt = null;
	/* Column Info */
	private String viaNodCd = null;
	/* Column Info */
	private String woPrvGrpSeq = null;
	/* Column Info */
	private String custNomiTrkrFlg = null;
	/* Column Info */
	private String cntrPkupNo = null;
	private String scgIndCd = null;

	/* 테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new LinkedHashMap<String, String>();

	/* 테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new LinkedHashMap<String, String>();

	public TrsTrspWrkOrdPrvTmpVO() {
	}

	public TrsTrspWrkOrdPrvTmpVO(String ibflag, String pagerows, String trspSoOfcCtyCd, String trspSoSeq, String woPrvGrpSeq, String trspSoStsCd, String woIssStsCd, String woIssNo, String woCxlFlg, String woFmtTpCd, String trspSoCmbTpCd, String trspCostDtlModCd, String cgoTpCd, String vndrSeq,
			String trspCrrModCd, String fmNodCd, String viaNodCd, String toNodCd, String dorNodCd, String fdrVslCd, String fdrSkdVoyNo, String fdrSkdDirCd, String woBlNoIssFlg, String dtnUseFlg, String trspWoOfcCtyCd, String trspWoSeq, String woIssKnt, String currCd, String bzcAmt,
			String etcAddAmt, String negoAmt, String fuelScgAmt, String ovrWgtScgAmt, String usdTtlAmt, String n3ptyBilFlg, String custNomiTrkrFlg, String n3ptyCustCntCd, String custCntCd, String custSeq, String n3ptyCustSeq, String trspAgmtRtTpCd, String trspAgmtWyTpCd, String trspRjctRsnCd,
			String trspDfltVndrFlg, String trspFrstFlg, String trspAgmtOfcCtyCd, String trspAgmtSeq, String n1stNodPlnDt, String dorNodPlnDt, String lstNodPlnDt, String interRmk, String spclInstrRmk, String creOfcCd, String fctryNm, String dorPstCd, String cntcPsonPhnNo, String cntcPsonFaxNo,
			String cntcPsonNm, String n3ptyVndrSeq, String n3ptyOfcCd, String n3ptyBilBzcAmt, String n3ptyDesc, String n3ptyBilTpCd, String n3ptyCurrCd, String loclCreDt, String loclUpdDt, String creUsrId, String creDt, String updUsrId, String updDt, String edwUpdDt, String wgtMeasUtCd,
			String cntrKgsWgt, String cntrLbsWgt, String cntrPkupNo, String scgIndCd) {
		this.cntrKgsWgt = cntrKgsWgt;
		this.toNodCd = toNodCd;
		this.dtnUseFlg = dtnUseFlg;
		this.woCxlFlg = woCxlFlg;
		this.trspSoSeq = trspSoSeq;
		this.cgoTpCd = cgoTpCd;
		this.fdrSkdVoyNo = fdrSkdVoyNo;
		this.usdTtlAmt = usdTtlAmt;
		this.trspAgmtRtTpCd = trspAgmtRtTpCd;
		this.n3ptyDesc = n3ptyDesc;
		this.pagerows = pagerows;
		this.n3ptyOfcCd = n3ptyOfcCd;
		this.dorPstCd = dorPstCd;
		this.cntcPsonFaxNo = cntcPsonFaxNo;
		this.n3ptyBilTpCd = n3ptyBilTpCd;
		this.fdrVslCd = fdrVslCd;
		this.woIssKnt = woIssKnt;
		this.trspCostDtlModCd = trspCostDtlModCd;
		this.trspFrstFlg = trspFrstFlg;
		this.dorNodPlnDt = dorNodPlnDt;
		this.woFmtTpCd = woFmtTpCd;
		this.woBlNoIssFlg = woBlNoIssFlg;
		this.updUsrId = updUsrId;
		this.custCntCd = custCntCd;
		this.n3ptyVndrSeq = n3ptyVndrSeq;
		this.trspSoCmbTpCd = trspSoCmbTpCd;
		this.trspWoSeq = trspWoSeq;
		this.trspDfltVndrFlg = trspDfltVndrFlg;
		this.cntcPsonPhnNo = cntcPsonPhnNo;
		this.cntrLbsWgt = cntrLbsWgt;
		this.negoAmt = negoAmt;
		this.creUsrId = creUsrId;
		this.fctryNm = fctryNm;
		this.trspAgmtSeq = trspAgmtSeq;
		this.vndrSeq = vndrSeq;
		this.wgtMeasUtCd = wgtMeasUtCd;
		this.loclUpdDt = loclUpdDt;
		this.currCd = currCd;
		this.creDt = creDt;
		this.trspAgmtOfcCtyCd = trspAgmtOfcCtyCd;
		this.edwUpdDt = edwUpdDt;
		this.n3ptyBilBzcAmt = n3ptyBilBzcAmt;
		this.n3ptyCurrCd = n3ptyCurrCd;
		this.n3ptyCustSeq = n3ptyCustSeq;
		this.fdrSkdDirCd = fdrSkdDirCd;
		this.trspSoOfcCtyCd = trspSoOfcCtyCd;
		this.woIssStsCd = woIssStsCd;
		this.ibflag = ibflag;
		this.interRmk = interRmk;
		this.cntcPsonNm = cntcPsonNm;
		this.creOfcCd = creOfcCd;
		this.dorNodCd = dorNodCd;
		this.trspSoStsCd = trspSoStsCd;
		this.n3ptyCustCntCd = n3ptyCustCntCd;
		this.spclInstrRmk = spclInstrRmk;
		this.trspCrrModCd = trspCrrModCd;
		this.ovrWgtScgAmt = ovrWgtScgAmt;
		this.updDt = updDt;
		this.etcAddAmt = etcAddAmt;
		this.trspAgmtWyTpCd = trspAgmtWyTpCd;
		this.loclCreDt = loclCreDt;
		this.trspRjctRsnCd = trspRjctRsnCd;
		this.lstNodPlnDt = lstNodPlnDt;
		this.bzcAmt = bzcAmt;
		this.custSeq = custSeq;
		this.woIssNo = woIssNo;
		this.trspWoOfcCtyCd = trspWoOfcCtyCd;
		this.fuelScgAmt = fuelScgAmt;
		this.fmNodCd = fmNodCd;
		this.n3ptyBilFlg = n3ptyBilFlg;
		this.n1stNodPlnDt = n1stNodPlnDt;
		this.viaNodCd = viaNodCd;
		this.woPrvGrpSeq = woPrvGrpSeq;
		this.custNomiTrkrFlg = custNomiTrkrFlg;
		this.cntrPkupNo = cntrPkupNo;
		this.scgIndCd = scgIndCd;
	}

	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * 
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues() {
		this.hashColumns.put("cntr_kgs_wgt", getCntrKgsWgt());
		this.hashColumns.put("to_nod_cd", getToNodCd());
		this.hashColumns.put("dtn_use_flg", getDtnUseFlg());
		this.hashColumns.put("wo_cxl_flg", getWoCxlFlg());
		this.hashColumns.put("trsp_so_seq", getTrspSoSeq());
		this.hashColumns.put("cgo_tp_cd", getCgoTpCd());
		this.hashColumns.put("fdr_skd_voy_no", getFdrSkdVoyNo());
		this.hashColumns.put("usd_ttl_amt", getUsdTtlAmt());
		this.hashColumns.put("trsp_agmt_rt_tp_cd", getTrspAgmtRtTpCd());
		this.hashColumns.put("n3pty_desc", getN3ptyDesc());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("n3pty_ofc_cd", getN3ptyOfcCd());
		this.hashColumns.put("dor_pst_cd", getDorPstCd());
		this.hashColumns.put("cntc_pson_fax_no", getCntcPsonFaxNo());
		this.hashColumns.put("n3pty_bil_tp_cd", getN3ptyBilTpCd());
		this.hashColumns.put("fdr_vsl_cd", getFdrVslCd());
		this.hashColumns.put("wo_iss_knt", getWoIssKnt());
		this.hashColumns.put("trsp_cost_dtl_mod_cd", getTrspCostDtlModCd());
		this.hashColumns.put("trsp_frst_flg", getTrspFrstFlg());
		this.hashColumns.put("dor_nod_pln_dt", getDorNodPlnDt());
		this.hashColumns.put("wo_fmt_tp_cd", getWoFmtTpCd());
		this.hashColumns.put("wo_bl_no_iss_flg", getWoBlNoIssFlg());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("cust_cnt_cd", getCustCntCd());
		this.hashColumns.put("n3pty_vndr_seq", getN3ptyVndrSeq());
		this.hashColumns.put("trsp_so_cmb_tp_cd", getTrspSoCmbTpCd());
		this.hashColumns.put("trsp_wo_seq", getTrspWoSeq());
		this.hashColumns.put("trsp_dflt_vndr_flg", getTrspDfltVndrFlg());
		this.hashColumns.put("cntc_pson_phn_no", getCntcPsonPhnNo());
		this.hashColumns.put("cntr_lbs_wgt", getCntrLbsWgt());
		this.hashColumns.put("nego_amt", getNegoAmt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("fctry_nm", getFctryNm());
		this.hashColumns.put("trsp_agmt_seq", getTrspAgmtSeq());
		this.hashColumns.put("vndr_seq", getVndrSeq());
		this.hashColumns.put("wgt_meas_ut_cd", getWgtMeasUtCd());
		this.hashColumns.put("locl_upd_dt", getLoclUpdDt());
		this.hashColumns.put("curr_cd", getCurrCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("trsp_agmt_ofc_cty_cd", getTrspAgmtOfcCtyCd());
		this.hashColumns.put("edw_upd_dt", getEdwUpdDt());
		this.hashColumns.put("n3pty_bil_bzc_amt", getN3ptyBilBzcAmt());
		this.hashColumns.put("n3pty_curr_cd", getN3ptyCurrCd());
		this.hashColumns.put("n3pty_cust_seq", getN3ptyCustSeq());
		this.hashColumns.put("fdr_skd_dir_cd", getFdrSkdDirCd());
		this.hashColumns.put("trsp_so_ofc_cty_cd", getTrspSoOfcCtyCd());
		this.hashColumns.put("wo_iss_sts_cd", getWoIssStsCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("inter_rmk", getInterRmk());
		this.hashColumns.put("cntc_pson_nm", getCntcPsonNm());
		this.hashColumns.put("cre_ofc_cd", getCreOfcCd());
		this.hashColumns.put("dor_nod_cd", getDorNodCd());
		this.hashColumns.put("trsp_so_sts_cd", getTrspSoStsCd());
		this.hashColumns.put("n3pty_cust_cnt_cd", getN3ptyCustCntCd());
		this.hashColumns.put("spcl_instr_rmk", getSpclInstrRmk());
		this.hashColumns.put("trsp_crr_mod_cd", getTrspCrrModCd());
		this.hashColumns.put("ovr_wgt_scg_amt", getOvrWgtScgAmt());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("etc_add_amt", getEtcAddAmt());
		this.hashColumns.put("trsp_agmt_wy_tp_cd", getTrspAgmtWyTpCd());
		this.hashColumns.put("locl_cre_dt", getLoclCreDt());
		this.hashColumns.put("trsp_rjct_rsn_cd", getTrspRjctRsnCd());
		this.hashColumns.put("lst_nod_pln_dt", getLstNodPlnDt());
		this.hashColumns.put("bzc_amt", getBzcAmt());
		this.hashColumns.put("cust_seq", getCustSeq());
		this.hashColumns.put("wo_iss_no", getWoIssNo());
		this.hashColumns.put("trsp_wo_ofc_cty_cd", getTrspWoOfcCtyCd());
		this.hashColumns.put("fuel_scg_amt", getFuelScgAmt());
		this.hashColumns.put("fm_nod_cd", getFmNodCd());
		this.hashColumns.put("n3pty_bil_flg", getN3ptyBilFlg());
		this.hashColumns.put("n1st_nod_pln_dt", getN1stNodPlnDt());
		this.hashColumns.put("via_nod_cd", getViaNodCd());
		this.hashColumns.put("wo_prv_grp_seq", getWoPrvGrpSeq());
		this.hashColumns.put("cust_nomi_trkr_flg", getCustNomiTrkrFlg());
		this.hashColumns.put("cntr_pkup_no", getCntrPkupNo());
		this.hashColumns.put("scg_ind_cd", getScgIndCd());
		return this.hashColumns;
	}

	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환
	 * 
	 * @return
	 */
	public HashMap<String, String> getFieldNames() {
		this.hashFields.put("cntr_kgs_wgt", "cntrKgsWgt");
		this.hashFields.put("to_nod_cd", "toNodCd");
		this.hashFields.put("dtn_use_flg", "dtnUseFlg");
		this.hashFields.put("wo_cxl_flg", "woCxlFlg");
		this.hashFields.put("trsp_so_seq", "trspSoSeq");
		this.hashFields.put("cgo_tp_cd", "cgoTpCd");
		this.hashFields.put("fdr_skd_voy_no", "fdrSkdVoyNo");
		this.hashFields.put("usd_ttl_amt", "usdTtlAmt");
		this.hashFields.put("trsp_agmt_rt_tp_cd", "trspAgmtRtTpCd");
		this.hashFields.put("n3pty_desc", "n3ptyDesc");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("n3pty_ofc_cd", "n3ptyOfcCd");
		this.hashFields.put("dor_pst_cd", "dorPstCd");
		this.hashFields.put("cntc_pson_fax_no", "cntcPsonFaxNo");
		this.hashFields.put("n3pty_bil_tp_cd", "n3ptyBilTpCd");
		this.hashFields.put("fdr_vsl_cd", "fdrVslCd");
		this.hashFields.put("wo_iss_knt", "woIssKnt");
		this.hashFields.put("trsp_cost_dtl_mod_cd", "trspCostDtlModCd");
		this.hashFields.put("trsp_frst_flg", "trspFrstFlg");
		this.hashFields.put("dor_nod_pln_dt", "dorNodPlnDt");
		this.hashFields.put("wo_fmt_tp_cd", "woFmtTpCd");
		this.hashFields.put("wo_bl_no_iss_flg", "woBlNoIssFlg");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("cust_cnt_cd", "custCntCd");
		this.hashFields.put("n3pty_vndr_seq", "n3ptyVndrSeq");
		this.hashFields.put("trsp_so_cmb_tp_cd", "trspSoCmbTpCd");
		this.hashFields.put("trsp_wo_seq", "trspWoSeq");
		this.hashFields.put("trsp_dflt_vndr_flg", "trspDfltVndrFlg");
		this.hashFields.put("cntc_pson_phn_no", "cntcPsonPhnNo");
		this.hashFields.put("cntr_lbs_wgt", "cntrLbsWgt");
		this.hashFields.put("nego_amt", "negoAmt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("fctry_nm", "fctryNm");
		this.hashFields.put("trsp_agmt_seq", "trspAgmtSeq");
		this.hashFields.put("vndr_seq", "vndrSeq");
		this.hashFields.put("wgt_meas_ut_cd", "wgtMeasUtCd");
		this.hashFields.put("locl_upd_dt", "loclUpdDt");
		this.hashFields.put("curr_cd", "currCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("trsp_agmt_ofc_cty_cd", "trspAgmtOfcCtyCd");
		this.hashFields.put("edw_upd_dt", "edwUpdDt");
		this.hashFields.put("n3pty_bil_bzc_amt", "n3ptyBilBzcAmt");
		this.hashFields.put("n3pty_curr_cd", "n3ptyCurrCd");
		this.hashFields.put("n3pty_cust_seq", "n3ptyCustSeq");
		this.hashFields.put("fdr_skd_dir_cd", "fdrSkdDirCd");
		this.hashFields.put("trsp_so_ofc_cty_cd", "trspSoOfcCtyCd");
		this.hashFields.put("wo_iss_sts_cd", "woIssStsCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("inter_rmk", "interRmk");
		this.hashFields.put("cntc_pson_nm", "cntcPsonNm");
		this.hashFields.put("cre_ofc_cd", "creOfcCd");
		this.hashFields.put("dor_nod_cd", "dorNodCd");
		this.hashFields.put("trsp_so_sts_cd", "trspSoStsCd");
		this.hashFields.put("n3pty_cust_cnt_cd", "n3ptyCustCntCd");
		this.hashFields.put("spcl_instr_rmk", "spclInstrRmk");
		this.hashFields.put("trsp_crr_mod_cd", "trspCrrModCd");
		this.hashFields.put("ovr_wgt_scg_amt", "ovrWgtScgAmt");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("etc_add_amt", "etcAddAmt");
		this.hashFields.put("trsp_agmt_wy_tp_cd", "trspAgmtWyTpCd");
		this.hashFields.put("locl_cre_dt", "loclCreDt");
		this.hashFields.put("trsp_rjct_rsn_cd", "trspRjctRsnCd");
		this.hashFields.put("lst_nod_pln_dt", "lstNodPlnDt");
		this.hashFields.put("bzc_amt", "bzcAmt");
		this.hashFields.put("cust_seq", "custSeq");
		this.hashFields.put("wo_iss_no", "woIssNo");
		this.hashFields.put("trsp_wo_ofc_cty_cd", "trspWoOfcCtyCd");
		this.hashFields.put("fuel_scg_amt", "fuelScgAmt");
		this.hashFields.put("fm_nod_cd", "fmNodCd");
		this.hashFields.put("n3pty_bil_flg", "n3ptyBilFlg");
		this.hashFields.put("n1st_nod_pln_dt", "n1stNodPlnDt");
		this.hashFields.put("via_nod_cd", "viaNodCd");
		this.hashFields.put("wo_prv_grp_seq", "woPrvGrpSeq");
		this.hashFields.put("cust_nomi_trkr_flg", "custNomiTrkrFlg");
		this.hashFields.put("cntr_pkup_no", "cntrPkupNo");
		this.hashFields.put("scg_ind_cd", "scgIndCd");
		return this.hashFields;
	}

	/**
	 * Column Info
	 * 
	 * @return cntrKgsWgt
	 */
	public String getCntrKgsWgt() {
		return this.cntrKgsWgt;
	}

	/**
	 * Column Info
	 * 
	 * @return toNodCd
	 */
	public String getToNodCd() {
		return this.toNodCd;
	}

	/**
	 * Column Info
	 * 
	 * @return dtnUseFlg
	 */
	public String getDtnUseFlg() {
		return this.dtnUseFlg;
	}

	/**
	 * Column Info
	 * 
	 * @return woCxlFlg
	 */
	public String getWoCxlFlg() {
		return this.woCxlFlg;
	}

	/**
	 * Column Info
	 * 
	 * @return trspSoSeq
	 */
	public String getTrspSoSeq() {
		return this.trspSoSeq;
	}

	/**
	 * Column Info
	 * 
	 * @return cgoTpCd
	 */
	public String getCgoTpCd() {
		return this.cgoTpCd;
	}

	/**
	 * Column Info
	 * 
	 * @return fdrSkdVoyNo
	 */
	public String getFdrSkdVoyNo() {
		return this.fdrSkdVoyNo;
	}

	/**
	 * Column Info
	 * 
	 * @return usdTtlAmt
	 */
	public String getUsdTtlAmt() {
		return this.usdTtlAmt;
	}

	/**
	 * Column Info
	 * 
	 * @return trspAgmtRtTpCd
	 */
	public String getTrspAgmtRtTpCd() {
		return this.trspAgmtRtTpCd;
	}

	/**
	 * Column Info
	 * 
	 * @return n3ptyDesc
	 */
	public String getN3ptyDesc() {
		return this.n3ptyDesc;
	}

	/**
	 * Page Number
	 * 
	 * @return pagerows
	 */
	public String getPagerows() {
		return this.pagerows;
	}

	/**
	 * Column Info
	 * 
	 * @return n3ptyOfcCd
	 */
	public String getN3ptyOfcCd() {
		return this.n3ptyOfcCd;
	}

	/**
	 * Column Info
	 * 
	 * @return dorPstCd
	 */
	public String getDorPstCd() {
		return this.dorPstCd;
	}

	/**
	 * Column Info
	 * 
	 * @return cntcPsonFaxNo
	 */
	public String getCntcPsonFaxNo() {
		return this.cntcPsonFaxNo;
	}

	/**
	 * Column Info
	 * 
	 * @return n3ptyBilTpCd
	 */
	public String getN3ptyBilTpCd() {
		return this.n3ptyBilTpCd;
	}

	/**
	 * Column Info
	 * 
	 * @return fdrVslCd
	 */
	public String getFdrVslCd() {
		return this.fdrVslCd;
	}

	/**
	 * Column Info
	 * 
	 * @return woIssKnt
	 */
	public String getWoIssKnt() {
		return this.woIssKnt;
	}

	/**
	 * Column Info
	 * 
	 * @return trspCostDtlModCd
	 */
	public String getTrspCostDtlModCd() {
		return this.trspCostDtlModCd;
	}

	/**
	 * Column Info
	 * 
	 * @return trspFrstFlg
	 */
	public String getTrspFrstFlg() {
		return this.trspFrstFlg;
	}

	/**
	 * Column Info
	 * 
	 * @return dorNodPlnDt
	 */
	public String getDorNodPlnDt() {
		return this.dorNodPlnDt;
	}

	/**
	 * Column Info
	 * 
	 * @return woFmtTpCd
	 */
	public String getWoFmtTpCd() {
		return this.woFmtTpCd;
	}

	/**
	 * Column Info
	 * 
	 * @return woBlNoIssFlg
	 */
	public String getWoBlNoIssFlg() {
		return this.woBlNoIssFlg;
	}

	/**
	 * Column Info
	 * 
	 * @return updUsrId
	 */
	public String getUpdUsrId() {
		return this.updUsrId;
	}

	/**
	 * Column Info
	 * 
	 * @return custCntCd
	 */
	public String getCustCntCd() {
		return this.custCntCd;
	}

	/**
	 * Column Info
	 * 
	 * @return n3ptyVndrSeq
	 */
	public String getN3ptyVndrSeq() {
		return this.n3ptyVndrSeq;
	}

	/**
	 * Column Info
	 * 
	 * @return trspSoCmbTpCd
	 */
	public String getTrspSoCmbTpCd() {
		return this.trspSoCmbTpCd;
	}

	/**
	 * Column Info
	 * 
	 * @return trspWoSeq
	 */
	public String getTrspWoSeq() {
		return this.trspWoSeq;
	}

	/**
	 * Column Info
	 * 
	 * @return trspDfltVndrFlg
	 */
	public String getTrspDfltVndrFlg() {
		return this.trspDfltVndrFlg;
	}

	/**
	 * Column Info
	 * 
	 * @return cntcPsonPhnNo
	 */
	public String getCntcPsonPhnNo() {
		return this.cntcPsonPhnNo;
	}

	/**
	 * Column Info
	 * 
	 * @return cntrLbsWgt
	 */
	public String getCntrLbsWgt() {
		return this.cntrLbsWgt;
	}

	/**
	 * Column Info
	 * 
	 * @return negoAmt
	 */
	public String getNegoAmt() {
		return this.negoAmt;
	}

	/**
	 * Column Info
	 * 
	 * @return creUsrId
	 */
	public String getCreUsrId() {
		return this.creUsrId;
	}

	/**
	 * Column Info
	 * 
	 * @return fctryNm
	 */
	public String getFctryNm() {
		return this.fctryNm;
	}

	/**
	 * Column Info
	 * 
	 * @return trspAgmtSeq
	 */
	public String getTrspAgmtSeq() {
		return this.trspAgmtSeq;
	}

	/**
	 * Column Info
	 * 
	 * @return vndrSeq
	 */
	public String getVndrSeq() {
		return this.vndrSeq;
	}

	/**
	 * Column Info
	 * 
	 * @return wgtMeasUtCd
	 */
	public String getWgtMeasUtCd() {
		return this.wgtMeasUtCd;
	}

	/**
	 * Column Info
	 * 
	 * @return loclUpdDt
	 */
	public String getLoclUpdDt() {
		return this.loclUpdDt;
	}

	/**
	 * Column Info
	 * 
	 * @return currCd
	 */
	public String getCurrCd() {
		return this.currCd;
	}

	/**
	 * Column Info
	 * 
	 * @return creDt
	 */
	public String getCreDt() {
		return this.creDt;
	}

	/**
	 * Column Info
	 * 
	 * @return trspAgmtOfcCtyCd
	 */
	public String getTrspAgmtOfcCtyCd() {
		return this.trspAgmtOfcCtyCd;
	}

	/**
	 * Column Info
	 * 
	 * @return edwUpdDt
	 */
	public String getEdwUpdDt() {
		return this.edwUpdDt;
	}

	/**
	 * Column Info
	 * 
	 * @return n3ptyBilBzcAmt
	 */
	public String getN3ptyBilBzcAmt() {
		return this.n3ptyBilBzcAmt;
	}

	/**
	 * Column Info
	 * 
	 * @return n3ptyCurrCd
	 */
	public String getN3ptyCurrCd() {
		return this.n3ptyCurrCd;
	}

	/**
	 * Column Info
	 * 
	 * @return n3ptyCustSeq
	 */
	public String getN3ptyCustSeq() {
		return this.n3ptyCustSeq;
	}

	/**
	 * Column Info
	 * 
	 * @return fdrSkdDirCd
	 */
	public String getFdrSkdDirCd() {
		return this.fdrSkdDirCd;
	}

	/**
	 * Column Info
	 * 
	 * @return trspSoOfcCtyCd
	 */
	public String getTrspSoOfcCtyCd() {
		return this.trspSoOfcCtyCd;
	}

	/**
	 * Column Info
	 * 
	 * @return woIssStsCd
	 */
	public String getWoIssStsCd() {
		return this.woIssStsCd;
	}

	/**
	 * VO Data Value( C:Creation, U:Update, D:Delete )
	 * 
	 * @return ibflag
	 */
	public String getIbflag() {
		return this.ibflag;
	}

	/**
	 * Column Info
	 * 
	 * @return interRmk
	 */
	public String getInterRmk() {
		return this.interRmk;
	}

	/**
	 * Column Info
	 * 
	 * @return cntcPsonNm
	 */
	public String getCntcPsonNm() {
		return this.cntcPsonNm;
	}

	/**
	 * Column Info
	 * 
	 * @return creOfcCd
	 */
	public String getCreOfcCd() {
		return this.creOfcCd;
	}

	/**
	 * Column Info
	 * 
	 * @return dorNodCd
	 */
	public String getDorNodCd() {
		return this.dorNodCd;
	}

	/**
	 * Column Info
	 * 
	 * @return trspSoStsCd
	 */
	public String getTrspSoStsCd() {
		return this.trspSoStsCd;
	}

	/**
	 * Column Info
	 * 
	 * @return n3ptyCustCntCd
	 */
	public String getN3ptyCustCntCd() {
		return this.n3ptyCustCntCd;
	}

	/**
	 * Column Info
	 * 
	 * @return spclInstrRmk
	 */
	public String getSpclInstrRmk() {
		return this.spclInstrRmk;
	}

	/**
	 * Column Info
	 * 
	 * @return trspCrrModCd
	 */
	public String getTrspCrrModCd() {
		return this.trspCrrModCd;
	}

	/**
	 * Column Info
	 * 
	 * @return ovrWgtScgAmt
	 */
	public String getOvrWgtScgAmt() {
		return this.ovrWgtScgAmt;
	}

	/**
	 * Column Info
	 * 
	 * @return updDt
	 */
	public String getUpdDt() {
		return this.updDt;
	}

	/**
	 * Column Info
	 * 
	 * @return etcAddAmt
	 */
	public String getEtcAddAmt() {
		return this.etcAddAmt;
	}

	/**
	 * Column Info
	 * 
	 * @return trspAgmtWyTpCd
	 */
	public String getTrspAgmtWyTpCd() {
		return this.trspAgmtWyTpCd;
	}

	/**
	 * Column Info
	 * 
	 * @return loclCreDt
	 */
	public String getLoclCreDt() {
		return this.loclCreDt;
	}

	/**
	 * Column Info
	 * 
	 * @return trspRjctRsnCd
	 */
	public String getTrspRjctRsnCd() {
		return this.trspRjctRsnCd;
	}

	/**
	 * Column Info
	 * 
	 * @return lstNodPlnDt
	 */
	public String getLstNodPlnDt() {
		return this.lstNodPlnDt;
	}

	/**
	 * Column Info
	 * 
	 * @return bzcAmt
	 */
	public String getBzcAmt() {
		return this.bzcAmt;
	}

	/**
	 * Column Info
	 * 
	 * @return custSeq
	 */
	public String getCustSeq() {
		return this.custSeq;
	}

	/**
	 * Column Info
	 * 
	 * @return woIssNo
	 */
	public String getWoIssNo() {
		return this.woIssNo;
	}

	/**
	 * Column Info
	 * 
	 * @return trspWoOfcCtyCd
	 */
	public String getTrspWoOfcCtyCd() {
		return this.trspWoOfcCtyCd;
	}

	/**
	 * Column Info
	 * 
	 * @return fuelScgAmt
	 */
	public String getFuelScgAmt() {
		return this.fuelScgAmt;
	}

	/**
	 * Column Info
	 * 
	 * @return fmNodCd
	 */
	public String getFmNodCd() {
		return this.fmNodCd;
	}

	/**
	 * Column Info
	 * 
	 * @return n3ptyBilFlg
	 */
	public String getN3ptyBilFlg() {
		return this.n3ptyBilFlg;
	}

	/**
	 * Column Info
	 * 
	 * @return n1stNodPlnDt
	 */
	public String getN1stNodPlnDt() {
		return this.n1stNodPlnDt;
	}

	/**
	 * Column Info
	 * 
	 * @return viaNodCd
	 */
	public String getViaNodCd() {
		return this.viaNodCd;
	}

	/**
	 * Column Info
	 * 
	 * @return woPrvGrpSeq
	 */
	public String getWoPrvGrpSeq() {
		return this.woPrvGrpSeq;
	}

	/**
	 * Column Info
	 * 
	 * @return custNomiTrkrFlg
	 */
	public String getCustNomiTrkrFlg() {
		return this.custNomiTrkrFlg;
	}

	/**
	 * Column Info
	 * 
	 * @param cntrKgsWgt
	 */
	public void setCntrKgsWgt(String cntrKgsWgt) {
		this.cntrKgsWgt = cntrKgsWgt;
	}

	/**
	 * Column Info
	 * 
	 * @param toNodCd
	 */
	public void setToNodCd(String toNodCd) {
		this.toNodCd = toNodCd;
	}

	/**
	 * Column Info
	 * 
	 * @param dtnUseFlg
	 */
	public void setDtnUseFlg(String dtnUseFlg) {
		this.dtnUseFlg = dtnUseFlg;
	}

	/**
	 * Column Info
	 * 
	 * @param woCxlFlg
	 */
	public void setWoCxlFlg(String woCxlFlg) {
		this.woCxlFlg = woCxlFlg;
	}

	/**
	 * Column Info
	 * 
	 * @param trspSoSeq
	 */
	public void setTrspSoSeq(String trspSoSeq) {
		this.trspSoSeq = trspSoSeq;
	}

	/**
	 * Column Info
	 * 
	 * @param cgoTpCd
	 */
	public void setCgoTpCd(String cgoTpCd) {
		this.cgoTpCd = cgoTpCd;
	}

	/**
	 * Column Info
	 * 
	 * @param fdrSkdVoyNo
	 */
	public void setFdrSkdVoyNo(String fdrSkdVoyNo) {
		this.fdrSkdVoyNo = fdrSkdVoyNo;
	}

	/**
	 * Column Info
	 * 
	 * @param usdTtlAmt
	 */
	public void setUsdTtlAmt(String usdTtlAmt) {
		this.usdTtlAmt = usdTtlAmt;
	}

	/**
	 * Column Info
	 * 
	 * @param trspAgmtRtTpCd
	 */
	public void setTrspAgmtRtTpCd(String trspAgmtRtTpCd) {
		this.trspAgmtRtTpCd = trspAgmtRtTpCd;
	}

	/**
	 * Column Info
	 * 
	 * @param n3ptyDesc
	 */
	public void setN3ptyDesc(String n3ptyDesc) {
		this.n3ptyDesc = n3ptyDesc;
	}

	/**
	 * Page Number
	 * 
	 * @param pagerows
	 */
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
	}

	/**
	 * Column Info
	 * 
	 * @param n3ptyOfcCd
	 */
	public void setN3ptyOfcCd(String n3ptyOfcCd) {
		this.n3ptyOfcCd = n3ptyOfcCd;
	}

	/**
	 * Column Info
	 * 
	 * @param dorPstCd
	 */
	public void setDorPstCd(String dorPstCd) {
		this.dorPstCd = dorPstCd;
	}

	/**
	 * Column Info
	 * 
	 * @param cntcPsonFaxNo
	 */
	public void setCntcPsonFaxNo(String cntcPsonFaxNo) {
		this.cntcPsonFaxNo = cntcPsonFaxNo;
	}

	/**
	 * Column Info
	 * 
	 * @param n3ptyBilTpCd
	 */
	public void setN3ptyBilTpCd(String n3ptyBilTpCd) {
		this.n3ptyBilTpCd = n3ptyBilTpCd;
	}

	/**
	 * Column Info
	 * 
	 * @param fdrVslCd
	 */
	public void setFdrVslCd(String fdrVslCd) {
		this.fdrVslCd = fdrVslCd;
	}

	/**
	 * Column Info
	 * 
	 * @param woIssKnt
	 */
	public void setWoIssKnt(String woIssKnt) {
		this.woIssKnt = woIssKnt;
	}

	/**
	 * Column Info
	 * 
	 * @param trspCostDtlModCd
	 */
	public void setTrspCostDtlModCd(String trspCostDtlModCd) {
		this.trspCostDtlModCd = trspCostDtlModCd;
	}

	/**
	 * Column Info
	 * 
	 * @param trspFrstFlg
	 */
	public void setTrspFrstFlg(String trspFrstFlg) {
		this.trspFrstFlg = trspFrstFlg;
	}

	/**
	 * Column Info
	 * 
	 * @param dorNodPlnDt
	 */
	public void setDorNodPlnDt(String dorNodPlnDt) {
		this.dorNodPlnDt = dorNodPlnDt;
	}

	/**
	 * Column Info
	 * 
	 * @param woFmtTpCd
	 */
	public void setWoFmtTpCd(String woFmtTpCd) {
		this.woFmtTpCd = woFmtTpCd;
	}

	/**
	 * Column Info
	 * 
	 * @param woBlNoIssFlg
	 */
	public void setWoBlNoIssFlg(String woBlNoIssFlg) {
		this.woBlNoIssFlg = woBlNoIssFlg;
	}

	/**
	 * Column Info
	 * 
	 * @param updUsrId
	 */
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
	}

	/**
	 * Column Info
	 * 
	 * @param custCntCd
	 */
	public void setCustCntCd(String custCntCd) {
		this.custCntCd = custCntCd;
	}

	/**
	 * Column Info
	 * 
	 * @param n3ptyVndrSeq
	 */
	public void setN3ptyVndrSeq(String n3ptyVndrSeq) {
		this.n3ptyVndrSeq = n3ptyVndrSeq;
	}

	/**
	 * Column Info
	 * 
	 * @param trspSoCmbTpCd
	 */
	public void setTrspSoCmbTpCd(String trspSoCmbTpCd) {
		this.trspSoCmbTpCd = trspSoCmbTpCd;
	}

	/**
	 * Column Info
	 * 
	 * @param trspWoSeq
	 */
	public void setTrspWoSeq(String trspWoSeq) {
		this.trspWoSeq = trspWoSeq;
	}

	/**
	 * Column Info
	 * 
	 * @param trspDfltVndrFlg
	 */
	public void setTrspDfltVndrFlg(String trspDfltVndrFlg) {
		this.trspDfltVndrFlg = trspDfltVndrFlg;
	}

	/**
	 * Column Info
	 * 
	 * @param cntcPsonPhnNo
	 */
	public void setCntcPsonPhnNo(String cntcPsonPhnNo) {
		this.cntcPsonPhnNo = cntcPsonPhnNo;
	}

	/**
	 * Column Info
	 * 
	 * @param cntrLbsWgt
	 */
	public void setCntrLbsWgt(String cntrLbsWgt) {
		this.cntrLbsWgt = cntrLbsWgt;
	}

	/**
	 * Column Info
	 * 
	 * @param negoAmt
	 */
	public void setNegoAmt(String negoAmt) {
		this.negoAmt = negoAmt;
	}

	/**
	 * Column Info
	 * 
	 * @param creUsrId
	 */
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
	}

	/**
	 * Column Info
	 * 
	 * @param fctryNm
	 */
	public void setFctryNm(String fctryNm) {
		this.fctryNm = fctryNm;
	}

	/**
	 * Column Info
	 * 
	 * @param trspAgmtSeq
	 */
	public void setTrspAgmtSeq(String trspAgmtSeq) {
		this.trspAgmtSeq = trspAgmtSeq;
	}

	/**
	 * Column Info
	 * 
	 * @param vndrSeq
	 */
	public void setVndrSeq(String vndrSeq) {
		this.vndrSeq = vndrSeq;
	}

	/**
	 * Column Info
	 * 
	 * @param wgtMeasUtCd
	 */
	public void setWgtMeasUtCd(String wgtMeasUtCd) {
		this.wgtMeasUtCd = wgtMeasUtCd;
	}

	/**
	 * Column Info
	 * 
	 * @param loclUpdDt
	 */
	public void setLoclUpdDt(String loclUpdDt) {
		this.loclUpdDt = loclUpdDt;
	}

	/**
	 * Column Info
	 * 
	 * @param currCd
	 */
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}

	/**
	 * Column Info
	 * 
	 * @param creDt
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
	}

	/**
	 * Column Info
	 * 
	 * @param trspAgmtOfcCtyCd
	 */
	public void setTrspAgmtOfcCtyCd(String trspAgmtOfcCtyCd) {
		this.trspAgmtOfcCtyCd = trspAgmtOfcCtyCd;
	}

	/**
	 * Column Info
	 * 
	 * @param edwUpdDt
	 */
	public void setEdwUpdDt(String edwUpdDt) {
		this.edwUpdDt = edwUpdDt;
	}

	/**
	 * Column Info
	 * 
	 * @param n3ptyBilBzcAmt
	 */
	public void setN3ptyBilBzcAmt(String n3ptyBilBzcAmt) {
		this.n3ptyBilBzcAmt = n3ptyBilBzcAmt;
	}

	/**
	 * Column Info
	 * 
	 * @param n3ptyCurrCd
	 */
	public void setN3ptyCurrCd(String n3ptyCurrCd) {
		this.n3ptyCurrCd = n3ptyCurrCd;
	}

	/**
	 * Column Info
	 * 
	 * @param n3ptyCustSeq
	 */
	public void setN3ptyCustSeq(String n3ptyCustSeq) {
		this.n3ptyCustSeq = n3ptyCustSeq;
	}

	/**
	 * Column Info
	 * 
	 * @param fdrSkdDirCd
	 */
	public void setFdrSkdDirCd(String fdrSkdDirCd) {
		this.fdrSkdDirCd = fdrSkdDirCd;
	}

	/**
	 * Column Info
	 * 
	 * @param trspSoOfcCtyCd
	 */
	public void setTrspSoOfcCtyCd(String trspSoOfcCtyCd) {
		this.trspSoOfcCtyCd = trspSoOfcCtyCd;
	}

	/**
	 * Column Info
	 * 
	 * @param woIssStsCd
	 */
	public void setWoIssStsCd(String woIssStsCd) {
		this.woIssStsCd = woIssStsCd;
	}

	/**
	 * VO Data Value( C:Creation, U:Update, D:Delete )
	 * 
	 * @param ibflag
	 */
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
	}

	/**
	 * Column Info
	 * 
	 * @param interRmk
	 */
	public void setInterRmk(String interRmk) {
		this.interRmk = interRmk;
	}

	/**
	 * Column Info
	 * 
	 * @param cntcPsonNm
	 */
	public void setCntcPsonNm(String cntcPsonNm) {
		this.cntcPsonNm = cntcPsonNm;
	}

	/**
	 * Column Info
	 * 
	 * @param creOfcCd
	 */
	public void setCreOfcCd(String creOfcCd) {
		this.creOfcCd = creOfcCd;
	}

	/**
	 * Column Info
	 * 
	 * @param dorNodCd
	 */
	public void setDorNodCd(String dorNodCd) {
		this.dorNodCd = dorNodCd;
	}

	/**
	 * Column Info
	 * 
	 * @param trspSoStsCd
	 */
	public void setTrspSoStsCd(String trspSoStsCd) {
		this.trspSoStsCd = trspSoStsCd;
	}

	/**
	 * Column Info
	 * 
	 * @param n3ptyCustCntCd
	 */
	public void setN3ptyCustCntCd(String n3ptyCustCntCd) {
		this.n3ptyCustCntCd = n3ptyCustCntCd;
	}

	/**
	 * Column Info
	 * 
	 * @param spclInstrRmk
	 */
	public void setSpclInstrRmk(String spclInstrRmk) {
		this.spclInstrRmk = spclInstrRmk;
	}

	/**
	 * Column Info
	 * 
	 * @param trspCrrModCd
	 */
	public void setTrspCrrModCd(String trspCrrModCd) {
		this.trspCrrModCd = trspCrrModCd;
	}

	/**
	 * Column Info
	 * 
	 * @param ovrWgtScgAmt
	 */
	public void setOvrWgtScgAmt(String ovrWgtScgAmt) {
		this.ovrWgtScgAmt = ovrWgtScgAmt;
	}

	/**
	 * Column Info
	 * 
	 * @param updDt
	 */
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
	}

	/**
	 * Column Info
	 * 
	 * @param etcAddAmt
	 */
	public void setEtcAddAmt(String etcAddAmt) {
		this.etcAddAmt = etcAddAmt;
	}

	/**
	 * Column Info
	 * 
	 * @param trspAgmtWyTpCd
	 */
	public void setTrspAgmtWyTpCd(String trspAgmtWyTpCd) {
		this.trspAgmtWyTpCd = trspAgmtWyTpCd;
	}

	/**
	 * Column Info
	 * 
	 * @param loclCreDt
	 */
	public void setLoclCreDt(String loclCreDt) {
		this.loclCreDt = loclCreDt;
	}

	/**
	 * Column Info
	 * 
	 * @param trspRjctRsnCd
	 */
	public void setTrspRjctRsnCd(String trspRjctRsnCd) {
		this.trspRjctRsnCd = trspRjctRsnCd;
	}

	/**
	 * Column Info
	 * 
	 * @param lstNodPlnDt
	 */
	public void setLstNodPlnDt(String lstNodPlnDt) {
		this.lstNodPlnDt = lstNodPlnDt;
	}

	/**
	 * Column Info
	 * 
	 * @param bzcAmt
	 */
	public void setBzcAmt(String bzcAmt) {
		this.bzcAmt = bzcAmt;
	}

	/**
	 * Column Info
	 * 
	 * @param custSeq
	 */
	public void setCustSeq(String custSeq) {
		this.custSeq = custSeq;
	}

	/**
	 * Column Info
	 * 
	 * @param woIssNo
	 */
	public void setWoIssNo(String woIssNo) {
		this.woIssNo = woIssNo;
	}

	/**
	 * Column Info
	 * 
	 * @param trspWoOfcCtyCd
	 */
	public void setTrspWoOfcCtyCd(String trspWoOfcCtyCd) {
		this.trspWoOfcCtyCd = trspWoOfcCtyCd;
	}

	/**
	 * Column Info
	 * 
	 * @param fuelScgAmt
	 */
	public void setFuelScgAmt(String fuelScgAmt) {
		this.fuelScgAmt = fuelScgAmt;
	}

	/**
	 * Column Info
	 * 
	 * @param fmNodCd
	 */
	public void setFmNodCd(String fmNodCd) {
		this.fmNodCd = fmNodCd;
	}

	/**
	 * Column Info
	 * 
	 * @param n3ptyBilFlg
	 */
	public void setN3ptyBilFlg(String n3ptyBilFlg) {
		this.n3ptyBilFlg = n3ptyBilFlg;
	}

	/**
	 * Column Info
	 * 
	 * @param n1stNodPlnDt
	 */
	public void setN1stNodPlnDt(String n1stNodPlnDt) {
		this.n1stNodPlnDt = n1stNodPlnDt;
	}

	/**
	 * Column Info
	 * 
	 * @param viaNodCd
	 */
	public void setViaNodCd(String viaNodCd) {
		this.viaNodCd = viaNodCd;
	}

	/**
	 * Column Info
	 * 
	 * @param woPrvGrpSeq
	 */
	public void setWoPrvGrpSeq(String woPrvGrpSeq) {
		this.woPrvGrpSeq = woPrvGrpSeq;
	}

	/**
	 * Column Info
	 * 
	 * @param custNomiTrkrFlg
	 */
	public void setCustNomiTrkrFlg(String custNomiTrkrFlg) {
		this.custNomiTrkrFlg = custNomiTrkrFlg;
	}

	/**
	 * 
	 * @return
	 */
	public String getCntrPkupNo() {
		return cntrPkupNo;
	}

	/**
	 * 
	 * @param cntrPkupNo
	 */
	public void setCntrPkupNo(String cntrPkupNo) {
		this.cntrPkupNo = cntrPkupNo;
	}

	public String getScgIndCd() {
		return scgIndCd;
	}

	public void setScgIndCd(String scgIndCd) {
		this.scgIndCd = scgIndCd;
	}

	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * 
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		fromRequest(request, "");
	}

	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * 
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request, String prefix) {
		setCntrKgsWgt(JSPUtil.getParameter(request, prefix + "cntr_kgs_wgt", ""));
		setToNodCd(JSPUtil.getParameter(request, prefix + "to_nod_cd", ""));
		setDtnUseFlg(JSPUtil.getParameter(request, prefix + "dtn_use_flg", ""));
		setWoCxlFlg(JSPUtil.getParameter(request, prefix + "wo_cxl_flg", ""));
		setTrspSoSeq(JSPUtil.getParameter(request, prefix + "trsp_so_seq", ""));
		setCgoTpCd(JSPUtil.getParameter(request, prefix + "cgo_tp_cd", ""));
		setFdrSkdVoyNo(JSPUtil.getParameter(request, prefix + "fdr_skd_voy_no", ""));
		setUsdTtlAmt(JSPUtil.getParameter(request, prefix + "usd_ttl_amt", ""));
		setTrspAgmtRtTpCd(JSPUtil.getParameter(request, prefix + "trsp_agmt_rt_tp_cd", ""));
		setN3ptyDesc(JSPUtil.getParameter(request, prefix + "n3pty_desc", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setN3ptyOfcCd(JSPUtil.getParameter(request, prefix + "n3pty_ofc_cd", ""));
		setDorPstCd(JSPUtil.getParameter(request, prefix + "dor_pst_cd", ""));
		setCntcPsonFaxNo(JSPUtil.getParameter(request, prefix + "cntc_pson_fax_no", ""));
		setN3ptyBilTpCd(JSPUtil.getParameter(request, prefix + "n3pty_bil_tp_cd", ""));
		setFdrVslCd(JSPUtil.getParameter(request, prefix + "fdr_vsl_cd", ""));
		setWoIssKnt(JSPUtil.getParameter(request, prefix + "wo_iss_knt", ""));
		setTrspCostDtlModCd(JSPUtil.getParameter(request, prefix + "trsp_cost_dtl_mod_cd", ""));
		setTrspFrstFlg(JSPUtil.getParameter(request, prefix + "trsp_frst_flg", ""));
		setDorNodPlnDt(JSPUtil.getParameter(request, prefix + "dor_nod_pln_dt", ""));
		setWoFmtTpCd(JSPUtil.getParameter(request, prefix + "wo_fmt_tp_cd", ""));
		setWoBlNoIssFlg(JSPUtil.getParameter(request, prefix + "wo_bl_no_iss_flg", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setCustCntCd(JSPUtil.getParameter(request, prefix + "cust_cnt_cd", ""));
		setN3ptyVndrSeq(JSPUtil.getParameter(request, prefix + "n3pty_vndr_seq", ""));
		setTrspSoCmbTpCd(JSPUtil.getParameter(request, prefix + "trsp_so_cmb_tp_cd", ""));
		setTrspWoSeq(JSPUtil.getParameter(request, prefix + "trsp_wo_seq", ""));
		setTrspDfltVndrFlg(JSPUtil.getParameter(request, prefix + "trsp_dflt_vndr_flg", ""));
		setCntcPsonPhnNo(JSPUtil.getParameter(request, prefix + "cntc_pson_phn_no", ""));
		setCntrLbsWgt(JSPUtil.getParameter(request, prefix + "cntr_lbs_wgt", ""));
		setNegoAmt(JSPUtil.getParameter(request, prefix + "nego_amt", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setFctryNm(JSPUtil.getParameter(request, prefix + "fctry_nm", ""));
		setTrspAgmtSeq(JSPUtil.getParameter(request, prefix + "trsp_agmt_seq", ""));
		setVndrSeq(JSPUtil.getParameter(request, prefix + "vndr_seq", ""));
		setWgtMeasUtCd(JSPUtil.getParameter(request, prefix + "wgt_meas_ut_cd", ""));
		setLoclUpdDt(JSPUtil.getParameter(request, prefix + "locl_upd_dt", ""));
		setCurrCd(JSPUtil.getParameter(request, prefix + "curr_cd", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setTrspAgmtOfcCtyCd(JSPUtil.getParameter(request, prefix + "trsp_agmt_ofc_cty_cd", ""));
		setEdwUpdDt(JSPUtil.getParameter(request, prefix + "edw_upd_dt", ""));
		setN3ptyBilBzcAmt(JSPUtil.getParameter(request, prefix + "n3pty_bil_bzc_amt", ""));
		setN3ptyCurrCd(JSPUtil.getParameter(request, prefix + "n3pty_curr_cd", ""));
		setN3ptyCustSeq(JSPUtil.getParameter(request, prefix + "n3pty_cust_seq", ""));
		setFdrSkdDirCd(JSPUtil.getParameter(request, prefix + "fdr_skd_dir_cd", ""));
		setTrspSoOfcCtyCd(JSPUtil.getParameter(request, prefix + "trsp_so_ofc_cty_cd", ""));
		setWoIssStsCd(JSPUtil.getParameter(request, prefix + "wo_iss_sts_cd", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setInterRmk(JSPUtil.getParameter(request, prefix + "inter_rmk", ""));
		setCntcPsonNm(JSPUtil.getParameter(request, prefix + "cntc_pson_nm", ""));
		setCreOfcCd(JSPUtil.getParameter(request, prefix + "cre_ofc_cd", ""));
		setDorNodCd(JSPUtil.getParameter(request, prefix + "dor_nod_cd", ""));
		setTrspSoStsCd(JSPUtil.getParameter(request, prefix + "trsp_so_sts_cd", ""));
		setN3ptyCustCntCd(JSPUtil.getParameter(request, prefix + "n3pty_cust_cnt_cd", ""));
		setSpclInstrRmk(JSPUtil.getParameter(request, prefix + "spcl_instr_rmk", ""));
		setTrspCrrModCd(JSPUtil.getParameter(request, prefix + "trsp_crr_mod_cd", ""));
		setOvrWgtScgAmt(JSPUtil.getParameter(request, prefix + "ovr_wgt_scg_amt", ""));
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setEtcAddAmt(JSPUtil.getParameter(request, prefix + "etc_add_amt", ""));
		setTrspAgmtWyTpCd(JSPUtil.getParameter(request, prefix + "trsp_agmt_wy_tp_cd", ""));
		setLoclCreDt(JSPUtil.getParameter(request, prefix + "locl_cre_dt", ""));
		setTrspRjctRsnCd(JSPUtil.getParameter(request, prefix + "trsp_rjct_rsn_cd", ""));
		setLstNodPlnDt(JSPUtil.getParameter(request, prefix + "lst_nod_pln_dt", ""));
		setBzcAmt(JSPUtil.getParameter(request, prefix + "bzc_amt", ""));
		setCustSeq(JSPUtil.getParameter(request, prefix + "cust_seq", ""));
		setWoIssNo(JSPUtil.getParameter(request, prefix + "wo_iss_no", ""));
		setTrspWoOfcCtyCd(JSPUtil.getParameter(request, prefix + "trsp_wo_ofc_cty_cd", ""));
		setFuelScgAmt(JSPUtil.getParameter(request, prefix + "fuel_scg_amt", ""));
		setFmNodCd(JSPUtil.getParameter(request, prefix + "fm_nod_cd", ""));
		setN3ptyBilFlg(JSPUtil.getParameter(request, prefix + "n3pty_bil_flg", ""));
		setN1stNodPlnDt(JSPUtil.getParameter(request, prefix + "n1st_nod_pln_dt", ""));
		setViaNodCd(JSPUtil.getParameter(request, prefix + "via_nod_cd", ""));
		setWoPrvGrpSeq(JSPUtil.getParameter(request, prefix + "wo_prv_grp_seq", ""));
		setCustNomiTrkrFlg(JSPUtil.getParameter(request, prefix + "cust_nomi_trkr_flg", ""));
		setCntrPkupNo(JSPUtil.getParameter(request, prefix + "cntr_pkup_no", ""));
		setScgIndCd(JSPUtil.getParameter(request, prefix + "scg_ind_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * 
	 * @param request
	 * @return TrsTrspWrkOrdPrvTmpVO[]
	 */
	public TrsTrspWrkOrdPrvTmpVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다.
	 * 
	 * @param request
	 * @param prefix
	 * @return TrsTrspWrkOrdPrvTmpVO[]
	 */
	public TrsTrspWrkOrdPrvTmpVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		TrsTrspWrkOrdPrvTmpVO model = null;

		String[] tmp = request.getParameterValues(prefix + "ibflag");
		if (tmp == null)
			return null;

		int length = request.getParameterValues(prefix + "ibflag").length;

		try {
			String[] cntrKgsWgt = (JSPUtil.getParameter(request, prefix + "cntr_kgs_wgt", length));
			String[] toNodCd = (JSPUtil.getParameter(request, prefix + "to_nod_cd", length));
			String[] dtnUseFlg = (JSPUtil.getParameter(request, prefix + "dtn_use_flg", length));
			String[] woCxlFlg = (JSPUtil.getParameter(request, prefix + "wo_cxl_flg", length));
			String[] trspSoSeq = (JSPUtil.getParameter(request, prefix + "trsp_so_seq", length));
			String[] cgoTpCd = (JSPUtil.getParameter(request, prefix + "cgo_tp_cd", length));
			String[] fdrSkdVoyNo = (JSPUtil.getParameter(request, prefix + "fdr_skd_voy_no", length));
			String[] usdTtlAmt = (JSPUtil.getParameter(request, prefix + "usd_ttl_amt", length));
			String[] trspAgmtRtTpCd = (JSPUtil.getParameter(request, prefix + "trsp_agmt_rt_tp_cd", length));
			String[] n3ptyDesc = (JSPUtil.getParameter(request, prefix + "n3pty_desc", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix + "pagerows", length));
			String[] n3ptyOfcCd = (JSPUtil.getParameter(request, prefix + "n3pty_ofc_cd", length));
			String[] dorPstCd = (JSPUtil.getParameter(request, prefix + "dor_pst_cd", length));
			String[] cntcPsonFaxNo = (JSPUtil.getParameter(request, prefix + "cntc_pson_fax_no", length));
			String[] n3ptyBilTpCd = (JSPUtil.getParameter(request, prefix + "n3pty_bil_tp_cd", length));
			String[] fdrVslCd = (JSPUtil.getParameter(request, prefix + "fdr_vsl_cd", length));
			String[] woIssKnt = (JSPUtil.getParameter(request, prefix + "wo_iss_knt", length));
			String[] trspCostDtlModCd = (JSPUtil.getParameter(request, prefix + "trsp_cost_dtl_mod_cd", length));
			String[] trspFrstFlg = (JSPUtil.getParameter(request, prefix + "trsp_frst_flg", length));
			String[] dorNodPlnDt = (JSPUtil.getParameter(request, prefix + "dor_nod_pln_dt", length));
			String[] woFmtTpCd = (JSPUtil.getParameter(request, prefix + "wo_fmt_tp_cd", length));
			String[] woBlNoIssFlg = (JSPUtil.getParameter(request, prefix + "wo_bl_no_iss_flg", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix + "upd_usr_id", length));
			String[] custCntCd = (JSPUtil.getParameter(request, prefix + "cust_cnt_cd", length));
			String[] n3ptyVndrSeq = (JSPUtil.getParameter(request, prefix + "n3pty_vndr_seq", length));
			String[] trspSoCmbTpCd = (JSPUtil.getParameter(request, prefix + "trsp_so_cmb_tp_cd", length));
			String[] trspWoSeq = (JSPUtil.getParameter(request, prefix + "trsp_wo_seq", length));
			String[] trspDfltVndrFlg = (JSPUtil.getParameter(request, prefix + "trsp_dflt_vndr_flg", length));
			String[] cntcPsonPhnNo = (JSPUtil.getParameter(request, prefix + "cntc_pson_phn_no", length));
			String[] cntrLbsWgt = (JSPUtil.getParameter(request, prefix + "cntr_lbs_wgt", length));
			String[] negoAmt = (JSPUtil.getParameter(request, prefix + "nego_amt", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix + "cre_usr_id", length));
			String[] fctryNm = (JSPUtil.getParameter(request, prefix + "fctry_nm", length));
			String[] trspAgmtSeq = (JSPUtil.getParameter(request, prefix + "trsp_agmt_seq", length));
			String[] vndrSeq = (JSPUtil.getParameter(request, prefix + "vndr_seq", length));
			String[] wgtMeasUtCd = (JSPUtil.getParameter(request, prefix + "wgt_meas_ut_cd", length));
			String[] loclUpdDt = (JSPUtil.getParameter(request, prefix + "locl_upd_dt", length));
			String[] currCd = (JSPUtil.getParameter(request, prefix + "curr_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix + "cre_dt", length));
			String[] trspAgmtOfcCtyCd = (JSPUtil.getParameter(request, prefix + "trsp_agmt_ofc_cty_cd", length));
			String[] edwUpdDt = (JSPUtil.getParameter(request, prefix + "edw_upd_dt", length));
			String[] n3ptyBilBzcAmt = (JSPUtil.getParameter(request, prefix + "n3pty_bil_bzc_amt", length));
			String[] n3ptyCurrCd = (JSPUtil.getParameter(request, prefix + "n3pty_curr_cd", length));
			String[] n3ptyCustSeq = (JSPUtil.getParameter(request, prefix + "n3pty_cust_seq", length));
			String[] fdrSkdDirCd = (JSPUtil.getParameter(request, prefix + "fdr_skd_dir_cd", length));
			String[] trspSoOfcCtyCd = (JSPUtil.getParameter(request, prefix + "trsp_so_ofc_cty_cd", length));
			String[] woIssStsCd = (JSPUtil.getParameter(request, prefix + "wo_iss_sts_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix + "ibflag", length));
			String[] interRmk = (JSPUtil.getParameter(request, prefix + "inter_rmk", length));
			String[] cntcPsonNm = (JSPUtil.getParameter(request, prefix + "cntc_pson_nm", length));
			String[] creOfcCd = (JSPUtil.getParameter(request, prefix + "cre_ofc_cd", length));
			String[] dorNodCd = (JSPUtil.getParameter(request, prefix + "dor_nod_cd", length));
			String[] trspSoStsCd = (JSPUtil.getParameter(request, prefix + "trsp_so_sts_cd", length));
			String[] n3ptyCustCntCd = (JSPUtil.getParameter(request, prefix + "n3pty_cust_cnt_cd", length));
			String[] spclInstrRmk = (JSPUtil.getParameter(request, prefix + "spcl_instr_rmk", length));
			String[] trspCrrModCd = (JSPUtil.getParameter(request, prefix + "trsp_crr_mod_cd", length));
			String[] ovrWgtScgAmt = (JSPUtil.getParameter(request, prefix + "ovr_wgt_scg_amt", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix + "upd_dt", length));
			String[] etcAddAmt = (JSPUtil.getParameter(request, prefix + "etc_add_amt", length));
			String[] trspAgmtWyTpCd = (JSPUtil.getParameter(request, prefix + "trsp_agmt_wy_tp_cd", length));
			String[] loclCreDt = (JSPUtil.getParameter(request, prefix + "locl_cre_dt", length));
			String[] trspRjctRsnCd = (JSPUtil.getParameter(request, prefix + "trsp_rjct_rsn_cd", length));
			String[] lstNodPlnDt = (JSPUtil.getParameter(request, prefix + "lst_nod_pln_dt", length));
			String[] bzcAmt = (JSPUtil.getParameter(request, prefix + "bzc_amt", length));
			String[] custSeq = (JSPUtil.getParameter(request, prefix + "cust_seq", length));
			String[] woIssNo = (JSPUtil.getParameter(request, prefix + "wo_iss_no", length));
			String[] trspWoOfcCtyCd = (JSPUtil.getParameter(request, prefix + "trsp_wo_ofc_cty_cd", length));
			String[] fuelScgAmt = (JSPUtil.getParameter(request, prefix + "fuel_scg_amt", length));
			String[] fmNodCd = (JSPUtil.getParameter(request, prefix + "fm_nod_cd", length));
			String[] n3ptyBilFlg = (JSPUtil.getParameter(request, prefix + "n3pty_bil_flg", length));
			String[] n1stNodPlnDt = (JSPUtil.getParameter(request, prefix + "n1st_nod_pln_dt", length));
			String[] viaNodCd = (JSPUtil.getParameter(request, prefix + "via_nod_cd", length));
			String[] woPrvGrpSeq = (JSPUtil.getParameter(request, prefix + "wo_prv_grp_seq", length));
			String[] custNomiTrkrFlg = (JSPUtil.getParameter(request, prefix + "cust_nomi_trkr_flg", length));
			String[] cntrPkupNo = (JSPUtil.getParameter(request, prefix + "cntr_pkup_no", length));
			String[] scgIndCd = (JSPUtil.getParameter(request, prefix + "scg_ind_cd", length));

			for (int i = 0; i < length; i++) {
				model = new TrsTrspWrkOrdPrvTmpVO();
				if (cntrKgsWgt[i] != null)
					model.setCntrKgsWgt(cntrKgsWgt[i]);
				if (toNodCd[i] != null)
					model.setToNodCd(toNodCd[i]);
				if (dtnUseFlg[i] != null)
					model.setDtnUseFlg(dtnUseFlg[i]);
				if (woCxlFlg[i] != null)
					model.setWoCxlFlg(woCxlFlg[i]);
				if (trspSoSeq[i] != null)
					model.setTrspSoSeq(trspSoSeq[i]);
				if (cgoTpCd[i] != null)
					model.setCgoTpCd(cgoTpCd[i]);
				if (fdrSkdVoyNo[i] != null)
					model.setFdrSkdVoyNo(fdrSkdVoyNo[i]);
				if (usdTtlAmt[i] != null)
					model.setUsdTtlAmt(usdTtlAmt[i]);
				if (trspAgmtRtTpCd[i] != null)
					model.setTrspAgmtRtTpCd(trspAgmtRtTpCd[i]);
				if (n3ptyDesc[i] != null)
					model.setN3ptyDesc(n3ptyDesc[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (n3ptyOfcCd[i] != null)
					model.setN3ptyOfcCd(n3ptyOfcCd[i]);
				if (dorPstCd[i] != null)
					model.setDorPstCd(dorPstCd[i]);
				if (cntcPsonFaxNo[i] != null)
					model.setCntcPsonFaxNo(cntcPsonFaxNo[i]);
				if (n3ptyBilTpCd[i] != null)
					model.setN3ptyBilTpCd(n3ptyBilTpCd[i]);
				if (fdrVslCd[i] != null)
					model.setFdrVslCd(fdrVslCd[i]);
				if (woIssKnt[i] != null)
					model.setWoIssKnt(woIssKnt[i]);
				if (trspCostDtlModCd[i] != null)
					model.setTrspCostDtlModCd(trspCostDtlModCd[i]);
				if (trspFrstFlg[i] != null)
					model.setTrspFrstFlg(trspFrstFlg[i]);
				if (dorNodPlnDt[i] != null)
					model.setDorNodPlnDt(dorNodPlnDt[i]);
				if (woFmtTpCd[i] != null)
					model.setWoFmtTpCd(woFmtTpCd[i]);
				if (woBlNoIssFlg[i] != null)
					model.setWoBlNoIssFlg(woBlNoIssFlg[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (custCntCd[i] != null)
					model.setCustCntCd(custCntCd[i]);
				if (n3ptyVndrSeq[i] != null)
					model.setN3ptyVndrSeq(n3ptyVndrSeq[i]);
				if (trspSoCmbTpCd[i] != null)
					model.setTrspSoCmbTpCd(trspSoCmbTpCd[i]);
				if (trspWoSeq[i] != null)
					model.setTrspWoSeq(trspWoSeq[i]);
				if (trspDfltVndrFlg[i] != null)
					model.setTrspDfltVndrFlg(trspDfltVndrFlg[i]);
				if (cntcPsonPhnNo[i] != null)
					model.setCntcPsonPhnNo(cntcPsonPhnNo[i]);
				if (cntrLbsWgt[i] != null)
					model.setCntrLbsWgt(cntrLbsWgt[i]);
				if (negoAmt[i] != null)
					model.setNegoAmt(negoAmt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (fctryNm[i] != null)
					model.setFctryNm(fctryNm[i]);
				if (trspAgmtSeq[i] != null)
					model.setTrspAgmtSeq(trspAgmtSeq[i]);
				if (vndrSeq[i] != null)
					model.setVndrSeq(vndrSeq[i]);
				if (wgtMeasUtCd[i] != null)
					model.setWgtMeasUtCd(wgtMeasUtCd[i]);
				if (loclUpdDt[i] != null)
					model.setLoclUpdDt(loclUpdDt[i]);
				if (currCd[i] != null)
					model.setCurrCd(currCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (trspAgmtOfcCtyCd[i] != null)
					model.setTrspAgmtOfcCtyCd(trspAgmtOfcCtyCd[i]);
				if (edwUpdDt[i] != null)
					model.setEdwUpdDt(edwUpdDt[i]);
				if (n3ptyBilBzcAmt[i] != null)
					model.setN3ptyBilBzcAmt(n3ptyBilBzcAmt[i]);
				if (n3ptyCurrCd[i] != null)
					model.setN3ptyCurrCd(n3ptyCurrCd[i]);
				if (n3ptyCustSeq[i] != null)
					model.setN3ptyCustSeq(n3ptyCustSeq[i]);
				if (fdrSkdDirCd[i] != null)
					model.setFdrSkdDirCd(fdrSkdDirCd[i]);
				if (trspSoOfcCtyCd[i] != null)
					model.setTrspSoOfcCtyCd(trspSoOfcCtyCd[i]);
				if (woIssStsCd[i] != null)
					model.setWoIssStsCd(woIssStsCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (interRmk[i] != null)
					model.setInterRmk(interRmk[i]);
				if (cntcPsonNm[i] != null)
					model.setCntcPsonNm(cntcPsonNm[i]);
				if (creOfcCd[i] != null)
					model.setCreOfcCd(creOfcCd[i]);
				if (dorNodCd[i] != null)
					model.setDorNodCd(dorNodCd[i]);
				if (trspSoStsCd[i] != null)
					model.setTrspSoStsCd(trspSoStsCd[i]);
				if (n3ptyCustCntCd[i] != null)
					model.setN3ptyCustCntCd(n3ptyCustCntCd[i]);
				if (spclInstrRmk[i] != null)
					model.setSpclInstrRmk(spclInstrRmk[i]);
				if (trspCrrModCd[i] != null)
					model.setTrspCrrModCd(trspCrrModCd[i]);
				if (ovrWgtScgAmt[i] != null)
					model.setOvrWgtScgAmt(ovrWgtScgAmt[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (etcAddAmt[i] != null)
					model.setEtcAddAmt(etcAddAmt[i]);
				if (trspAgmtWyTpCd[i] != null)
					model.setTrspAgmtWyTpCd(trspAgmtWyTpCd[i]);
				if (loclCreDt[i] != null)
					model.setLoclCreDt(loclCreDt[i]);
				if (trspRjctRsnCd[i] != null)
					model.setTrspRjctRsnCd(trspRjctRsnCd[i]);
				if (lstNodPlnDt[i] != null)
					model.setLstNodPlnDt(lstNodPlnDt[i]);
				if (bzcAmt[i] != null)
					model.setBzcAmt(bzcAmt[i]);
				if (custSeq[i] != null)
					model.setCustSeq(custSeq[i]);
				if (woIssNo[i] != null)
					model.setWoIssNo(woIssNo[i]);
				if (trspWoOfcCtyCd[i] != null)
					model.setTrspWoOfcCtyCd(trspWoOfcCtyCd[i]);
				if (fuelScgAmt[i] != null)
					model.setFuelScgAmt(fuelScgAmt[i]);
				if (fmNodCd[i] != null)
					model.setFmNodCd(fmNodCd[i]);
				if (n3ptyBilFlg[i] != null)
					model.setN3ptyBilFlg(n3ptyBilFlg[i]);
				if (n1stNodPlnDt[i] != null)
					model.setN1stNodPlnDt(n1stNodPlnDt[i]);
				if (viaNodCd[i] != null)
					model.setViaNodCd(viaNodCd[i]);
				if (woPrvGrpSeq[i] != null)
					model.setWoPrvGrpSeq(woPrvGrpSeq[i]);
				if (custNomiTrkrFlg[i] != null)
					model.setCustNomiTrkrFlg(custNomiTrkrFlg[i]);
				if (cntrPkupNo[i] != null)
					model.setCntrPkupNo(cntrPkupNo[i]);
				if (scgIndCd[i] != null)
					model.setScgIndCd(scgIndCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getTrsTrspWrkOrdPrvTmpVOs();
	}

	/**
	 * VO 배열을 반환
	 * 
	 * @return TrsTrspWrkOrdPrvTmpVO[]
	 */
	public TrsTrspWrkOrdPrvTmpVO[] getTrsTrspWrkOrdPrvTmpVOs() {
		TrsTrspWrkOrdPrvTmpVO[] vos = (TrsTrspWrkOrdPrvTmpVO[]) models.toArray(new TrsTrspWrkOrdPrvTmpVO[models.size()]);
		return vos;
	}

	/**
	 * VO Class의 내용을 String으로 변환
	 */
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}

	/**
	 * 포맷팅된 문자열에서 특수문자 제거("-","/",",",":")
	 */
	public void unDataFormat() {
		this.cntrKgsWgt = this.cntrKgsWgt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.toNodCd = this.toNodCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dtnUseFlg = this.dtnUseFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.woCxlFlg = this.woCxlFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspSoSeq = this.trspSoSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cgoTpCd = this.cgoTpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fdrSkdVoyNo = this.fdrSkdVoyNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usdTtlAmt = this.usdTtlAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspAgmtRtTpCd = this.trspAgmtRtTpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3ptyDesc = this.n3ptyDesc.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3ptyOfcCd = this.n3ptyOfcCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dorPstCd = this.dorPstCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntcPsonFaxNo = this.cntcPsonFaxNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3ptyBilTpCd = this.n3ptyBilTpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fdrVslCd = this.fdrVslCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.woIssKnt = this.woIssKnt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspCostDtlModCd = this.trspCostDtlModCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspFrstFlg = this.trspFrstFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dorNodPlnDt = this.dorNodPlnDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.woFmtTpCd = this.woFmtTpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.woBlNoIssFlg = this.woBlNoIssFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custCntCd = this.custCntCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3ptyVndrSeq = this.n3ptyVndrSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspSoCmbTpCd = this.trspSoCmbTpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspWoSeq = this.trspWoSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspDfltVndrFlg = this.trspDfltVndrFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntcPsonPhnNo = this.cntcPsonPhnNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrLbsWgt = this.cntrLbsWgt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.negoAmt = this.negoAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fctryNm = this.fctryNm.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspAgmtSeq = this.trspAgmtSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrSeq = this.vndrSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.wgtMeasUtCd = this.wgtMeasUtCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.loclUpdDt = this.loclUpdDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.currCd = this.currCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspAgmtOfcCtyCd = this.trspAgmtOfcCtyCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.edwUpdDt = this.edwUpdDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3ptyBilBzcAmt = this.n3ptyBilBzcAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3ptyCurrCd = this.n3ptyCurrCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3ptyCustSeq = this.n3ptyCustSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fdrSkdDirCd = this.fdrSkdDirCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspSoOfcCtyCd = this.trspSoOfcCtyCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.woIssStsCd = this.woIssStsCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.interRmk = this.interRmk.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntcPsonNm = this.cntcPsonNm.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creOfcCd = this.creOfcCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dorNodCd = this.dorNodCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspSoStsCd = this.trspSoStsCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3ptyCustCntCd = this.n3ptyCustCntCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spclInstrRmk = this.spclInstrRmk.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspCrrModCd = this.trspCrrModCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ovrWgtScgAmt = this.ovrWgtScgAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.etcAddAmt = this.etcAddAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspAgmtWyTpCd = this.trspAgmtWyTpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.loclCreDt = this.loclCreDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspRjctRsnCd = this.trspRjctRsnCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lstNodPlnDt = this.lstNodPlnDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bzcAmt = this.bzcAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custSeq = this.custSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.woIssNo = this.woIssNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspWoOfcCtyCd = this.trspWoOfcCtyCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fuelScgAmt = this.fuelScgAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fmNodCd = this.fmNodCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3ptyBilFlg = this.n3ptyBilFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stNodPlnDt = this.n1stNodPlnDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.viaNodCd = this.viaNodCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.woPrvGrpSeq = this.woPrvGrpSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custNomiTrkrFlg = this.custNomiTrkrFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrPkupNo = this.cntrPkupNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.scgIndCd = this.scgIndCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
