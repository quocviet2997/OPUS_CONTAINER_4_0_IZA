/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CtmMvmtEdiMsgVO.java
*@FileTitle : CtmMvmtEdiMsgVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.06.22
*@LastModifier : 김상수
*@LastVersion : 1.0
* 2009.06.22 김상수 
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
 * @author 김상수
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class CtmMvmtEdiMsgVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CtmMvmtEdiMsgVO> models = new ArrayList<CtmMvmtEdiMsgVO>();
	
	/* Column Info */
	private String clmArrLocCd = null;
	/* Column Info */
	private String crntSkdVoyNo = null;
	/* Column Info */
	private String mvmtEdiMsgTpId = null;
	/* Column Info */
	private String fnlLocSplcCd = null;
	/* Column Info */
	private String chssNo = null;
	/* Column Info */
	private String mvmtTrspModCd = null;
	/* Column Info */
	private String mvmtEdiMsgSeq = null;
	/* Column Info */
	private String destYdCd = null;
	/* Column Info */
	private String blNo = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String mvmtEdiRmk = null;
	/* Column Info */
	private String substRuleCd = null;
	/* Column Info */
	private String fcarNo = null;
	/* Column Info */
	private String bkgPodCd = null;
	/* Column Info */
	private String evntYdCd = null;
	/* Column Info */
	private String mvmtEdiTpCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String evntDt = null;
	/* Column Info */
	private String hjsDepYdCd = null;
	/* Column Info */
	private String mvmtEdiMsgAreaCd = null;
	/* Column Info */
	private String hjsDestLocId = null;
	/* Column Info */
	private String ediMvmtStsCd = null;
	/* Column Info */
	private String callSgnNo = null;
	/* Column Info */
	private String clmArrDt = null;
	/* Column Info */
	private String mvmtEdiRsltCd = null;
	/* Column Info */
	private String updLoclDt = null;
	/* Column Info */
	private String wblNo = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String lloydNo = null;
	/* Column Info */
	private String creLoclDt = null;
	/* Column Info */
	private String mvmtEdiMsgYrmondy = null;
	/* Column Info */
	private String vndrSeq = null;
	/* Column Info */
	private String hjsPkupRqstDt = null;
	/* Column Info */
	private String crntLocSplcCd = null;
	/* Column Info */
	private String pkupNo = null;
	/* Column Info */
	private String tmlNm = null;
	/* Column Info */
	private String hjsArrYdCd = null;
	/* Column Info */
	private String ediGateIoCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String fltFileRefNo = null;
	/* Column Info */
	private String hjsActDt = null;
	/* Column Info */
	private String cntrDmgFlg = null;
	/* Column Info */
	private String hjsCustNm = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String bkgKnt = null;
	/* Column Info */
	private String rtyKnt = null;
	/* Column Info */
	private String clmSghtCd = null;
	/* Column Info */
	private String mvmtEdiSghtCd = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String bkgPolCd = null;
	/* Column Info */
	private String hjsSoNo = null;
	/* Column Info */
	private String mvmtEdiStsTpFlg = null;
	/* Column Info */
	private String crntSkdDirCd = null;
	/* Column Info */
	private String hjsPorCd = null;
	/* Column Info */
	private String mgstNo = null;
	/* Column Info */
	private String cntrHngrRckFlg = null;
	/* Column Info */
	private String hjsPodCd = null;
	/* Column Info */
	private String ofcCd = null;
	/* Column Info */
	private String trnNo = null;
	/* Column Info */
	private String cntrNo = null;
	/* Column Info */
	private String cntrFullStsCd = null;
	/* Column Info */
	private String cntrSealNo = null;
	/* Column Info */
	private String cnmvCoCd = null;
	/* Column Info */
	private String crntVslCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CtmMvmtEdiMsgVO() {}

	public CtmMvmtEdiMsgVO(String ibflag, String pagerows, String mvmtEdiTpCd, String mvmtEdiMsgTpId, String mvmtEdiMsgAreaCd, String mvmtEdiMsgYrmondy, String mvmtEdiMsgSeq, String tmlNm, String cntrNo, String evntYdCd, String evntDt, String ediGateIoCd, String cntrFullStsCd, String chssNo, String crntVslCd, String crntSkdVoyNo, String crntSkdDirCd, String blNo, String bkgKnt, String bkgNo, String bkgPolCd, String bkgPodCd, String destYdCd, String cntrSealNo, String mgstNo, String substRuleCd, String vndrSeq, String mvmtTrspModCd, String fcarNo, String ediMvmtStsCd, String cntrHngrRckFlg, String wblNo, String pkupNo, String clmArrDt, String clmArrLocCd, String clmSghtCd, String hjsActDt, String hjsPorCd, String hjsPodCd, String hjsDepYdCd, String hjsDestLocId, String hjsArrYdCd, String hjsSoNo, String hjsCustNm, String hjsPkupRqstDt, String mvmtEdiRsltCd, String mvmtEdiRmk, String rtyKnt, String trnNo, String crntLocSplcCd, String fnlLocSplcCd, String mvmtEdiSghtCd, String cntrDmgFlg, String callSgnNo, String lloydNo, String mvmtEdiStsTpFlg, String ofcCd, String cnmvCoCd, String fltFileRefNo, String creLoclDt, String updLoclDt, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.clmArrLocCd = clmArrLocCd;
		this.crntSkdVoyNo = crntSkdVoyNo;
		this.mvmtEdiMsgTpId = mvmtEdiMsgTpId;
		this.fnlLocSplcCd = fnlLocSplcCd;
		this.chssNo = chssNo;
		this.mvmtTrspModCd = mvmtTrspModCd;
		this.mvmtEdiMsgSeq = mvmtEdiMsgSeq;
		this.destYdCd = destYdCd;
		this.blNo = blNo;
		this.pagerows = pagerows;
		this.mvmtEdiRmk = mvmtEdiRmk;
		this.substRuleCd = substRuleCd;
		this.fcarNo = fcarNo;
		this.bkgPodCd = bkgPodCd;
		this.evntYdCd = evntYdCd;
		this.mvmtEdiTpCd = mvmtEdiTpCd;
		this.updUsrId = updUsrId;
		this.evntDt = evntDt;
		this.hjsDepYdCd = hjsDepYdCd;
		this.mvmtEdiMsgAreaCd = mvmtEdiMsgAreaCd;
		this.hjsDestLocId = hjsDestLocId;
		this.ediMvmtStsCd = ediMvmtStsCd;
		this.callSgnNo = callSgnNo;
		this.clmArrDt = clmArrDt;
		this.mvmtEdiRsltCd = mvmtEdiRsltCd;
		this.updLoclDt = updLoclDt;
		this.wblNo = wblNo;
		this.creUsrId = creUsrId;
		this.bkgNo = bkgNo;
		this.lloydNo = lloydNo;
		this.creLoclDt = creLoclDt;
		this.mvmtEdiMsgYrmondy = mvmtEdiMsgYrmondy;
		this.vndrSeq = vndrSeq;
		this.hjsPkupRqstDt = hjsPkupRqstDt;
		this.crntLocSplcCd = crntLocSplcCd;
		this.pkupNo = pkupNo;
		this.tmlNm = tmlNm;
		this.hjsArrYdCd = hjsArrYdCd;
		this.ediGateIoCd = ediGateIoCd;
		this.creDt = creDt;
		this.fltFileRefNo = fltFileRefNo;
		this.hjsActDt = hjsActDt;
		this.cntrDmgFlg = cntrDmgFlg;
		this.hjsCustNm = hjsCustNm;
		this.ibflag = ibflag;
		this.bkgKnt = bkgKnt;
		this.rtyKnt = rtyKnt;
		this.clmSghtCd = clmSghtCd;
		this.mvmtEdiSghtCd = mvmtEdiSghtCd;
		this.updDt = updDt;
		this.bkgPolCd = bkgPolCd;
		this.hjsSoNo = hjsSoNo;
		this.mvmtEdiStsTpFlg = mvmtEdiStsTpFlg;
		this.crntSkdDirCd = crntSkdDirCd;
		this.hjsPorCd = hjsPorCd;
		this.mgstNo = mgstNo;
		this.cntrHngrRckFlg = cntrHngrRckFlg;
		this.hjsPodCd = hjsPodCd;
		this.ofcCd = ofcCd;
		this.trnNo = trnNo;
		this.cntrNo = cntrNo;
		this.cntrFullStsCd = cntrFullStsCd;
		this.cntrSealNo = cntrSealNo;
		this.cnmvCoCd = cnmvCoCd;
		this.crntVslCd = crntVslCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("clm_arr_loc_cd", getClmArrLocCd());
		this.hashColumns.put("crnt_skd_voy_no", getCrntSkdVoyNo());
		this.hashColumns.put("mvmt_edi_msg_tp_id", getMvmtEdiMsgTpId());
		this.hashColumns.put("fnl_loc_splc_cd", getFnlLocSplcCd());
		this.hashColumns.put("chss_no", getChssNo());
		this.hashColumns.put("mvmt_trsp_mod_cd", getMvmtTrspModCd());
		this.hashColumns.put("mvmt_edi_msg_seq", getMvmtEdiMsgSeq());
		this.hashColumns.put("dest_yd_cd", getDestYdCd());
		this.hashColumns.put("bl_no", getBlNo());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("mvmt_edi_rmk", getMvmtEdiRmk());
		this.hashColumns.put("subst_rule_cd", getSubstRuleCd());
		this.hashColumns.put("fcar_no", getFcarNo());
		this.hashColumns.put("bkg_pod_cd", getBkgPodCd());
		this.hashColumns.put("evnt_yd_cd", getEvntYdCd());
		this.hashColumns.put("mvmt_edi_tp_cd", getMvmtEdiTpCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("evnt_dt", getEvntDt());
		this.hashColumns.put("hjs_dep_yd_cd", getHjsDepYdCd());
		this.hashColumns.put("mvmt_edi_msg_area_cd", getMvmtEdiMsgAreaCd());
		this.hashColumns.put("hjs_dest_loc_id", getHjsDestLocId());
		this.hashColumns.put("edi_mvmt_sts_cd", getEdiMvmtStsCd());
		this.hashColumns.put("call_sgn_no", getCallSgnNo());
		this.hashColumns.put("clm_arr_dt", getClmArrDt());
		this.hashColumns.put("mvmt_edi_rslt_cd", getMvmtEdiRsltCd());
		this.hashColumns.put("upd_locl_dt", getUpdLoclDt());
		this.hashColumns.put("wbl_no", getWblNo());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("lloyd_no", getLloydNo());
		this.hashColumns.put("cre_locl_dt", getCreLoclDt());
		this.hashColumns.put("mvmt_edi_msg_yrmondy", getMvmtEdiMsgYrmondy());
		this.hashColumns.put("vndr_seq", getVndrSeq());
		this.hashColumns.put("hjs_pkup_rqst_dt", getHjsPkupRqstDt());
		this.hashColumns.put("crnt_loc_splc_cd", getCrntLocSplcCd());
		this.hashColumns.put("pkup_no", getPkupNo());
		this.hashColumns.put("tml_nm", getTmlNm());
		this.hashColumns.put("hjs_arr_yd_cd", getHjsArrYdCd());
		this.hashColumns.put("edi_gate_io_cd", getEdiGateIoCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("flt_file_ref_no", getFltFileRefNo());
		this.hashColumns.put("hjs_act_dt", getHjsActDt());
		this.hashColumns.put("cntr_dmg_flg", getCntrDmgFlg());
		this.hashColumns.put("hjs_cust_nm", getHjsCustNm());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("bkg_knt", getBkgKnt());
		this.hashColumns.put("rty_knt", getRtyKnt());
		this.hashColumns.put("clm_sght_cd", getClmSghtCd());
		this.hashColumns.put("mvmt_edi_sght_cd", getMvmtEdiSghtCd());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("bkg_pol_cd", getBkgPolCd());
		this.hashColumns.put("hjs_so_no", getHjsSoNo());
		this.hashColumns.put("mvmt_edi_sts_tp_flg", getMvmtEdiStsTpFlg());
		this.hashColumns.put("crnt_skd_dir_cd", getCrntSkdDirCd());
		this.hashColumns.put("hjs_por_cd", getHjsPorCd());
		this.hashColumns.put("mgst_no", getMgstNo());
		this.hashColumns.put("cntr_hngr_rck_flg", getCntrHngrRckFlg());
		this.hashColumns.put("hjs_pod_cd", getHjsPodCd());
		this.hashColumns.put("ofc_cd", getOfcCd());
		this.hashColumns.put("trn_no", getTrnNo());
		this.hashColumns.put("cntr_no", getCntrNo());
		this.hashColumns.put("cntr_full_sts_cd", getCntrFullStsCd());
		this.hashColumns.put("cntr_seal_no", getCntrSealNo());
		this.hashColumns.put("cnmv_co_cd", getCnmvCoCd());
		this.hashColumns.put("crnt_vsl_cd", getCrntVslCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("clm_arr_loc_cd", "clmArrLocCd");
		this.hashFields.put("crnt_skd_voy_no", "crntSkdVoyNo");
		this.hashFields.put("mvmt_edi_msg_tp_id", "mvmtEdiMsgTpId");
		this.hashFields.put("fnl_loc_splc_cd", "fnlLocSplcCd");
		this.hashFields.put("chss_no", "chssNo");
		this.hashFields.put("mvmt_trsp_mod_cd", "mvmtTrspModCd");
		this.hashFields.put("mvmt_edi_msg_seq", "mvmtEdiMsgSeq");
		this.hashFields.put("dest_yd_cd", "destYdCd");
		this.hashFields.put("bl_no", "blNo");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("mvmt_edi_rmk", "mvmtEdiRmk");
		this.hashFields.put("subst_rule_cd", "substRuleCd");
		this.hashFields.put("fcar_no", "fcarNo");
		this.hashFields.put("bkg_pod_cd", "bkgPodCd");
		this.hashFields.put("evnt_yd_cd", "evntYdCd");
		this.hashFields.put("mvmt_edi_tp_cd", "mvmtEdiTpCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("evnt_dt", "evntDt");
		this.hashFields.put("hjs_dep_yd_cd", "hjsDepYdCd");
		this.hashFields.put("mvmt_edi_msg_area_cd", "mvmtEdiMsgAreaCd");
		this.hashFields.put("hjs_dest_loc_id", "hjsDestLocId");
		this.hashFields.put("edi_mvmt_sts_cd", "ediMvmtStsCd");
		this.hashFields.put("call_sgn_no", "callSgnNo");
		this.hashFields.put("clm_arr_dt", "clmArrDt");
		this.hashFields.put("mvmt_edi_rslt_cd", "mvmtEdiRsltCd");
		this.hashFields.put("upd_locl_dt", "updLoclDt");
		this.hashFields.put("wbl_no", "wblNo");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("lloyd_no", "lloydNo");
		this.hashFields.put("cre_locl_dt", "creLoclDt");
		this.hashFields.put("mvmt_edi_msg_yrmondy", "mvmtEdiMsgYrmondy");
		this.hashFields.put("vndr_seq", "vndrSeq");
		this.hashFields.put("hjs_pkup_rqst_dt", "hjsPkupRqstDt");
		this.hashFields.put("crnt_loc_splc_cd", "crntLocSplcCd");
		this.hashFields.put("pkup_no", "pkupNo");
		this.hashFields.put("tml_nm", "tmlNm");
		this.hashFields.put("hjs_arr_yd_cd", "hjsArrYdCd");
		this.hashFields.put("edi_gate_io_cd", "ediGateIoCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("flt_file_ref_no", "fltFileRefNo");
		this.hashFields.put("hjs_act_dt", "hjsActDt");
		this.hashFields.put("cntr_dmg_flg", "cntrDmgFlg");
		this.hashFields.put("hjs_cust_nm", "hjsCustNm");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("bkg_knt", "bkgKnt");
		this.hashFields.put("rty_knt", "rtyKnt");
		this.hashFields.put("clm_sght_cd", "clmSghtCd");
		this.hashFields.put("mvmt_edi_sght_cd", "mvmtEdiSghtCd");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("bkg_pol_cd", "bkgPolCd");
		this.hashFields.put("hjs_so_no", "hjsSoNo");
		this.hashFields.put("mvmt_edi_sts_tp_flg", "mvmtEdiStsTpFlg");
		this.hashFields.put("crnt_skd_dir_cd", "crntSkdDirCd");
		this.hashFields.put("hjs_por_cd", "hjsPorCd");
		this.hashFields.put("mgst_no", "mgstNo");
		this.hashFields.put("cntr_hngr_rck_flg", "cntrHngrRckFlg");
		this.hashFields.put("hjs_pod_cd", "hjsPodCd");
		this.hashFields.put("ofc_cd", "ofcCd");
		this.hashFields.put("trn_no", "trnNo");
		this.hashFields.put("cntr_no", "cntrNo");
		this.hashFields.put("cntr_full_sts_cd", "cntrFullStsCd");
		this.hashFields.put("cntr_seal_no", "cntrSealNo");
		this.hashFields.put("cnmv_co_cd", "cnmvCoCd");
		this.hashFields.put("crnt_vsl_cd", "crntVslCd");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return clmArrLocCd
	 */
	public String getClmArrLocCd() {
		return this.clmArrLocCd;
	}
	
	/**
	 * Column Info
	 * @return crntSkdVoyNo
	 */
	public String getCrntSkdVoyNo() {
		return this.crntSkdVoyNo;
	}
	
	/**
	 * Column Info
	 * @return mvmtEdiMsgTpId
	 */
	public String getMvmtEdiMsgTpId() {
		return this.mvmtEdiMsgTpId;
	}
	
	/**
	 * Column Info
	 * @return fnlLocSplcCd
	 */
	public String getFnlLocSplcCd() {
		return this.fnlLocSplcCd;
	}
	
	/**
	 * Column Info
	 * @return chssNo
	 */
	public String getChssNo() {
		return this.chssNo;
	}
	
	/**
	 * Column Info
	 * @return mvmtTrspModCd
	 */
	public String getMvmtTrspModCd() {
		return this.mvmtTrspModCd;
	}
	
	/**
	 * Column Info
	 * @return mvmtEdiMsgSeq
	 */
	public String getMvmtEdiMsgSeq() {
		return this.mvmtEdiMsgSeq;
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
	 * @return blNo
	 */
	public String getBlNo() {
		return this.blNo;
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
	 * @return mvmtEdiRmk
	 */
	public String getMvmtEdiRmk() {
		return this.mvmtEdiRmk;
	}
	
	/**
	 * Column Info
	 * @return substRuleCd
	 */
	public String getSubstRuleCd() {
		return this.substRuleCd;
	}
	
	/**
	 * Column Info
	 * @return fcarNo
	 */
	public String getFcarNo() {
		return this.fcarNo;
	}
	
	/**
	 * Column Info
	 * @return bkgPodCd
	 */
	public String getBkgPodCd() {
		return this.bkgPodCd;
	}
	
	/**
	 * Column Info
	 * @return evntYdCd
	 */
	public String getEvntYdCd() {
		return this.evntYdCd;
	}
	
	/**
	 * Column Info
	 * @return mvmtEdiTpCd
	 */
	public String getMvmtEdiTpCd() {
		return this.mvmtEdiTpCd;
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
	 * @return evntDt
	 */
	public String getEvntDt() {
		return this.evntDt;
	}
	
	/**
	 * Column Info
	 * @return hjsDepYdCd
	 */
	public String getHjsDepYdCd() {
		return this.hjsDepYdCd;
	}
	
	/**
	 * Column Info
	 * @return mvmtEdiMsgAreaCd
	 */
	public String getMvmtEdiMsgAreaCd() {
		return this.mvmtEdiMsgAreaCd;
	}
	
	/**
	 * Column Info
	 * @return hjsDestLocId
	 */
	public String getHjsDestLocId() {
		return this.hjsDestLocId;
	}
	
	/**
	 * Column Info
	 * @return ediMvmtStsCd
	 */
	public String getEdiMvmtStsCd() {
		return this.ediMvmtStsCd;
	}
	
	/**
	 * Column Info
	 * @return callSgnNo
	 */
	public String getCallSgnNo() {
		return this.callSgnNo;
	}
	
	/**
	 * Column Info
	 * @return clmArrDt
	 */
	public String getClmArrDt() {
		return this.clmArrDt;
	}
	
	/**
	 * Column Info
	 * @return mvmtEdiRsltCd
	 */
	public String getMvmtEdiRsltCd() {
		return this.mvmtEdiRsltCd;
	}
	
	/**
	 * Column Info
	 * @return updLoclDt
	 */
	public String getUpdLoclDt() {
		return this.updLoclDt;
	}
	
	/**
	 * Column Info
	 * @return wblNo
	 */
	public String getWblNo() {
		return this.wblNo;
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
	 * @return lloydNo
	 */
	public String getLloydNo() {
		return this.lloydNo;
	}
	
	/**
	 * Column Info
	 * @return creLoclDt
	 */
	public String getCreLoclDt() {
		return this.creLoclDt;
	}
	
	/**
	 * Column Info
	 * @return mvmtEdiMsgYrmondy
	 */
	public String getMvmtEdiMsgYrmondy() {
		return this.mvmtEdiMsgYrmondy;
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
	 * @return hjsPkupRqstDt
	 */
	public String getHjsPkupRqstDt() {
		return this.hjsPkupRqstDt;
	}
	
	/**
	 * Column Info
	 * @return crntLocSplcCd
	 */
	public String getCrntLocSplcCd() {
		return this.crntLocSplcCd;
	}
	
	/**
	 * Column Info
	 * @return pkupNo
	 */
	public String getPkupNo() {
		return this.pkupNo;
	}
	
	/**
	 * Column Info
	 * @return tmlNm
	 */
	public String getTmlNm() {
		return this.tmlNm;
	}
	
	/**
	 * Column Info
	 * @return hjsArrYdCd
	 */
	public String getHjsArrYdCd() {
		return this.hjsArrYdCd;
	}
	
	/**
	 * Column Info
	 * @return ediGateIoCd
	 */
	public String getEdiGateIoCd() {
		return this.ediGateIoCd;
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
	 * @return fltFileRefNo
	 */
	public String getFltFileRefNo() {
		return this.fltFileRefNo;
	}
	
	/**
	 * Column Info
	 * @return hjsActDt
	 */
	public String getHjsActDt() {
		return this.hjsActDt;
	}
	
	/**
	 * Column Info
	 * @return cntrDmgFlg
	 */
	public String getCntrDmgFlg() {
		return this.cntrDmgFlg;
	}
	
	/**
	 * Column Info
	 * @return hjsCustNm
	 */
	public String getHjsCustNm() {
		return this.hjsCustNm;
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
	 * @return bkgKnt
	 */
	public String getBkgKnt() {
		return this.bkgKnt;
	}
	
	/**
	 * Column Info
	 * @return rtyKnt
	 */
	public String getRtyKnt() {
		return this.rtyKnt;
	}
	
	/**
	 * Column Info
	 * @return clmSghtCd
	 */
	public String getClmSghtCd() {
		return this.clmSghtCd;
	}
	
	/**
	 * Column Info
	 * @return mvmtEdiSghtCd
	 */
	public String getMvmtEdiSghtCd() {
		return this.mvmtEdiSghtCd;
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
	 * @return bkgPolCd
	 */
	public String getBkgPolCd() {
		return this.bkgPolCd;
	}
	
	/**
	 * Column Info
	 * @return hjsSoNo
	 */
	public String getHjsSoNo() {
		return this.hjsSoNo;
	}
	
	/**
	 * Column Info
	 * @return mvmtEdiStsTpFlg
	 */
	public String getMvmtEdiStsTpFlg() {
		return this.mvmtEdiStsTpFlg;
	}
	
	/**
	 * Column Info
	 * @return crntSkdDirCd
	 */
	public String getCrntSkdDirCd() {
		return this.crntSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @return hjsPorCd
	 */
	public String getHjsPorCd() {
		return this.hjsPorCd;
	}
	
	/**
	 * Column Info
	 * @return mgstNo
	 */
	public String getMgstNo() {
		return this.mgstNo;
	}
	
	/**
	 * Column Info
	 * @return cntrHngrRckFlg
	 */
	public String getCntrHngrRckFlg() {
		return this.cntrHngrRckFlg;
	}
	
	/**
	 * Column Info
	 * @return hjsPodCd
	 */
	public String getHjsPodCd() {
		return this.hjsPodCd;
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
	 * @return trnNo
	 */
	public String getTrnNo() {
		return this.trnNo;
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
	 * @return cntrFullStsCd
	 */
	public String getCntrFullStsCd() {
		return this.cntrFullStsCd;
	}
	
	/**
	 * Column Info
	 * @return cntrSealNo
	 */
	public String getCntrSealNo() {
		return this.cntrSealNo;
	}
	
	/**
	 * Column Info
	 * @return cnmvCoCd
	 */
	public String getCnmvCoCd() {
		return this.cnmvCoCd;
	}
	
	/**
	 * Column Info
	 * @return crntVslCd
	 */
	public String getCrntVslCd() {
		return this.crntVslCd;
	}
	

	/**
	 * Column Info
	 * @param clmArrLocCd
	 */
	public void setClmArrLocCd(String clmArrLocCd) {
		this.clmArrLocCd = clmArrLocCd;
	}
	
	/**
	 * Column Info
	 * @param crntSkdVoyNo
	 */
	public void setCrntSkdVoyNo(String crntSkdVoyNo) {
		this.crntSkdVoyNo = crntSkdVoyNo;
	}
	
	/**
	 * Column Info
	 * @param mvmtEdiMsgTpId
	 */
	public void setMvmtEdiMsgTpId(String mvmtEdiMsgTpId) {
		this.mvmtEdiMsgTpId = mvmtEdiMsgTpId;
	}
	
	/**
	 * Column Info
	 * @param fnlLocSplcCd
	 */
	public void setFnlLocSplcCd(String fnlLocSplcCd) {
		this.fnlLocSplcCd = fnlLocSplcCd;
	}
	
	/**
	 * Column Info
	 * @param chssNo
	 */
	public void setChssNo(String chssNo) {
		this.chssNo = chssNo;
	}
	
	/**
	 * Column Info
	 * @param mvmtTrspModCd
	 */
	public void setMvmtTrspModCd(String mvmtTrspModCd) {
		this.mvmtTrspModCd = mvmtTrspModCd;
	}
	
	/**
	 * Column Info
	 * @param mvmtEdiMsgSeq
	 */
	public void setMvmtEdiMsgSeq(String mvmtEdiMsgSeq) {
		this.mvmtEdiMsgSeq = mvmtEdiMsgSeq;
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
	 * @param blNo
	 */
	public void setBlNo(String blNo) {
		this.blNo = blNo;
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
	 * @param mvmtEdiRmk
	 */
	public void setMvmtEdiRmk(String mvmtEdiRmk) {
		this.mvmtEdiRmk = mvmtEdiRmk;
	}
	
	/**
	 * Column Info
	 * @param substRuleCd
	 */
	public void setSubstRuleCd(String substRuleCd) {
		this.substRuleCd = substRuleCd;
	}
	
	/**
	 * Column Info
	 * @param fcarNo
	 */
	public void setFcarNo(String fcarNo) {
		this.fcarNo = fcarNo;
	}
	
	/**
	 * Column Info
	 * @param bkgPodCd
	 */
	public void setBkgPodCd(String bkgPodCd) {
		this.bkgPodCd = bkgPodCd;
	}
	
	/**
	 * Column Info
	 * @param evntYdCd
	 */
	public void setEvntYdCd(String evntYdCd) {
		this.evntYdCd = evntYdCd;
	}
	
	/**
	 * Column Info
	 * @param mvmtEdiTpCd
	 */
	public void setMvmtEdiTpCd(String mvmtEdiTpCd) {
		this.mvmtEdiTpCd = mvmtEdiTpCd;
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
	 * @param evntDt
	 */
	public void setEvntDt(String evntDt) {
		this.evntDt = evntDt;
	}
	
	/**
	 * Column Info
	 * @param hjsDepYdCd
	 */
	public void setHjsDepYdCd(String hjsDepYdCd) {
		this.hjsDepYdCd = hjsDepYdCd;
	}
	
	/**
	 * Column Info
	 * @param mvmtEdiMsgAreaCd
	 */
	public void setMvmtEdiMsgAreaCd(String mvmtEdiMsgAreaCd) {
		this.mvmtEdiMsgAreaCd = mvmtEdiMsgAreaCd;
	}
	
	/**
	 * Column Info
	 * @param hjsDestLocId
	 */
	public void setHjsDestLocId(String hjsDestLocId) {
		this.hjsDestLocId = hjsDestLocId;
	}
	
	/**
	 * Column Info
	 * @param ediMvmtStsCd
	 */
	public void setEdiMvmtStsCd(String ediMvmtStsCd) {
		this.ediMvmtStsCd = ediMvmtStsCd;
	}
	
	/**
	 * Column Info
	 * @param callSgnNo
	 */
	public void setCallSgnNo(String callSgnNo) {
		this.callSgnNo = callSgnNo;
	}
	
	/**
	 * Column Info
	 * @param clmArrDt
	 */
	public void setClmArrDt(String clmArrDt) {
		this.clmArrDt = clmArrDt;
	}
	
	/**
	 * Column Info
	 * @param mvmtEdiRsltCd
	 */
	public void setMvmtEdiRsltCd(String mvmtEdiRsltCd) {
		this.mvmtEdiRsltCd = mvmtEdiRsltCd;
	}
	
	/**
	 * Column Info
	 * @param updLoclDt
	 */
	public void setUpdLoclDt(String updLoclDt) {
		this.updLoclDt = updLoclDt;
	}
	
	/**
	 * Column Info
	 * @param wblNo
	 */
	public void setWblNo(String wblNo) {
		this.wblNo = wblNo;
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
	 * @param lloydNo
	 */
	public void setLloydNo(String lloydNo) {
		this.lloydNo = lloydNo;
	}
	
	/**
	 * Column Info
	 * @param creLoclDt
	 */
	public void setCreLoclDt(String creLoclDt) {
		this.creLoclDt = creLoclDt;
	}
	
	/**
	 * Column Info
	 * @param mvmtEdiMsgYrmondy
	 */
	public void setMvmtEdiMsgYrmondy(String mvmtEdiMsgYrmondy) {
		this.mvmtEdiMsgYrmondy = mvmtEdiMsgYrmondy;
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
	 * @param hjsPkupRqstDt
	 */
	public void setHjsPkupRqstDt(String hjsPkupRqstDt) {
		this.hjsPkupRqstDt = hjsPkupRqstDt;
	}
	
	/**
	 * Column Info
	 * @param crntLocSplcCd
	 */
	public void setCrntLocSplcCd(String crntLocSplcCd) {
		this.crntLocSplcCd = crntLocSplcCd;
	}
	
	/**
	 * Column Info
	 * @param pkupNo
	 */
	public void setPkupNo(String pkupNo) {
		this.pkupNo = pkupNo;
	}
	
	/**
	 * Column Info
	 * @param tmlNm
	 */
	public void setTmlNm(String tmlNm) {
		this.tmlNm = tmlNm;
	}
	
	/**
	 * Column Info
	 * @param hjsArrYdCd
	 */
	public void setHjsArrYdCd(String hjsArrYdCd) {
		this.hjsArrYdCd = hjsArrYdCd;
	}
	
	/**
	 * Column Info
	 * @param ediGateIoCd
	 */
	public void setEdiGateIoCd(String ediGateIoCd) {
		this.ediGateIoCd = ediGateIoCd;
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
	 * @param fltFileRefNo
	 */
	public void setFltFileRefNo(String fltFileRefNo) {
		this.fltFileRefNo = fltFileRefNo;
	}
	
	/**
	 * Column Info
	 * @param hjsActDt
	 */
	public void setHjsActDt(String hjsActDt) {
		this.hjsActDt = hjsActDt;
	}
	
	/**
	 * Column Info
	 * @param cntrDmgFlg
	 */
	public void setCntrDmgFlg(String cntrDmgFlg) {
		this.cntrDmgFlg = cntrDmgFlg;
	}
	
	/**
	 * Column Info
	 * @param hjsCustNm
	 */
	public void setHjsCustNm(String hjsCustNm) {
		this.hjsCustNm = hjsCustNm;
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
	 * @param bkgKnt
	 */
	public void setBkgKnt(String bkgKnt) {
		this.bkgKnt = bkgKnt;
	}
	
	/**
	 * Column Info
	 * @param rtyKnt
	 */
	public void setRtyKnt(String rtyKnt) {
		this.rtyKnt = rtyKnt;
	}
	
	/**
	 * Column Info
	 * @param clmSghtCd
	 */
	public void setClmSghtCd(String clmSghtCd) {
		this.clmSghtCd = clmSghtCd;
	}
	
	/**
	 * Column Info
	 * @param mvmtEdiSghtCd
	 */
	public void setMvmtEdiSghtCd(String mvmtEdiSghtCd) {
		this.mvmtEdiSghtCd = mvmtEdiSghtCd;
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
	 * @param bkgPolCd
	 */
	public void setBkgPolCd(String bkgPolCd) {
		this.bkgPolCd = bkgPolCd;
	}
	
	/**
	 * Column Info
	 * @param hjsSoNo
	 */
	public void setHjsSoNo(String hjsSoNo) {
		this.hjsSoNo = hjsSoNo;
	}
	
	/**
	 * Column Info
	 * @param mvmtEdiStsTpFlg
	 */
	public void setMvmtEdiStsTpFlg(String mvmtEdiStsTpFlg) {
		this.mvmtEdiStsTpFlg = mvmtEdiStsTpFlg;
	}
	
	/**
	 * Column Info
	 * @param crntSkdDirCd
	 */
	public void setCrntSkdDirCd(String crntSkdDirCd) {
		this.crntSkdDirCd = crntSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @param hjsPorCd
	 */
	public void setHjsPorCd(String hjsPorCd) {
		this.hjsPorCd = hjsPorCd;
	}
	
	/**
	 * Column Info
	 * @param mgstNo
	 */
	public void setMgstNo(String mgstNo) {
		this.mgstNo = mgstNo;
	}
	
	/**
	 * Column Info
	 * @param cntrHngrRckFlg
	 */
	public void setCntrHngrRckFlg(String cntrHngrRckFlg) {
		this.cntrHngrRckFlg = cntrHngrRckFlg;
	}
	
	/**
	 * Column Info
	 * @param hjsPodCd
	 */
	public void setHjsPodCd(String hjsPodCd) {
		this.hjsPodCd = hjsPodCd;
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
	 * @param trnNo
	 */
	public void setTrnNo(String trnNo) {
		this.trnNo = trnNo;
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
	 * @param cntrFullStsCd
	 */
	public void setCntrFullStsCd(String cntrFullStsCd) {
		this.cntrFullStsCd = cntrFullStsCd;
	}
	
	/**
	 * Column Info
	 * @param cntrSealNo
	 */
	public void setCntrSealNo(String cntrSealNo) {
		this.cntrSealNo = cntrSealNo;
	}
	
	/**
	 * Column Info
	 * @param cnmvCoCd
	 */
	public void setCnmvCoCd(String cnmvCoCd) {
		this.cnmvCoCd = cnmvCoCd;
	}
	
	/**
	 * Column Info
	 * @param crntVslCd
	 */
	public void setCrntVslCd(String crntVslCd) {
		this.crntVslCd = crntVslCd;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setClmArrLocCd(JSPUtil.getParameter(request, "clm_arr_loc_cd", ""));
		setCrntSkdVoyNo(JSPUtil.getParameter(request, "crnt_skd_voy_no", ""));
		setMvmtEdiMsgTpId(JSPUtil.getParameter(request, "mvmt_edi_msg_tp_id", ""));
		setFnlLocSplcCd(JSPUtil.getParameter(request, "fnl_loc_splc_cd", ""));
		setChssNo(JSPUtil.getParameter(request, "chss_no", ""));
		setMvmtTrspModCd(JSPUtil.getParameter(request, "mvmt_trsp_mod_cd", ""));
		setMvmtEdiMsgSeq(JSPUtil.getParameter(request, "mvmt_edi_msg_seq", ""));
		setDestYdCd(JSPUtil.getParameter(request, "dest_yd_cd", ""));
		setBlNo(JSPUtil.getParameter(request, "bl_no", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setMvmtEdiRmk(JSPUtil.getParameter(request, "mvmt_edi_rmk", ""));
		setSubstRuleCd(JSPUtil.getParameter(request, "subst_rule_cd", ""));
		setFcarNo(JSPUtil.getParameter(request, "fcar_no", ""));
		setBkgPodCd(JSPUtil.getParameter(request, "bkg_pod_cd", ""));
		setEvntYdCd(JSPUtil.getParameter(request, "evnt_yd_cd", ""));
		setMvmtEdiTpCd(JSPUtil.getParameter(request, "mvmt_edi_tp_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setEvntDt(JSPUtil.getParameter(request, "evnt_dt", ""));
		setHjsDepYdCd(JSPUtil.getParameter(request, "hjs_dep_yd_cd", ""));
		setMvmtEdiMsgAreaCd(JSPUtil.getParameter(request, "mvmt_edi_msg_area_cd", ""));
		setHjsDestLocId(JSPUtil.getParameter(request, "hjs_dest_loc_id", ""));
		setEdiMvmtStsCd(JSPUtil.getParameter(request, "edi_mvmt_sts_cd", ""));
		setCallSgnNo(JSPUtil.getParameter(request, "call_sgn_no", ""));
		setClmArrDt(JSPUtil.getParameter(request, "clm_arr_dt", ""));
		setMvmtEdiRsltCd(JSPUtil.getParameter(request, "mvmt_edi_rslt_cd", ""));
		setUpdLoclDt(JSPUtil.getParameter(request, "upd_locl_dt", ""));
		setWblNo(JSPUtil.getParameter(request, "wbl_no", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setLloydNo(JSPUtil.getParameter(request, "lloyd_no", ""));
		setCreLoclDt(JSPUtil.getParameter(request, "cre_locl_dt", ""));
		setMvmtEdiMsgYrmondy(JSPUtil.getParameter(request, "mvmt_edi_msg_yrmondy", ""));
		setVndrSeq(JSPUtil.getParameter(request, "vndr_seq", ""));
		setHjsPkupRqstDt(JSPUtil.getParameter(request, "hjs_pkup_rqst_dt", ""));
		setCrntLocSplcCd(JSPUtil.getParameter(request, "crnt_loc_splc_cd", ""));
		setPkupNo(JSPUtil.getParameter(request, "pkup_no", ""));
		setTmlNm(JSPUtil.getParameter(request, "tml_nm", ""));
		setHjsArrYdCd(JSPUtil.getParameter(request, "hjs_arr_yd_cd", ""));
		setEdiGateIoCd(JSPUtil.getParameter(request, "edi_gate_io_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setFltFileRefNo(JSPUtil.getParameter(request, "flt_file_ref_no", ""));
		setHjsActDt(JSPUtil.getParameter(request, "hjs_act_dt", ""));
		setCntrDmgFlg(JSPUtil.getParameter(request, "cntr_dmg_flg", ""));
		setHjsCustNm(JSPUtil.getParameter(request, "hjs_cust_nm", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setBkgKnt(JSPUtil.getParameter(request, "bkg_knt", ""));
		setRtyKnt(JSPUtil.getParameter(request, "rty_knt", ""));
		setClmSghtCd(JSPUtil.getParameter(request, "clm_sght_cd", ""));
		setMvmtEdiSghtCd(JSPUtil.getParameter(request, "mvmt_edi_sght_cd", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setBkgPolCd(JSPUtil.getParameter(request, "bkg_pol_cd", ""));
		setHjsSoNo(JSPUtil.getParameter(request, "hjs_so_no", ""));
		setMvmtEdiStsTpFlg(JSPUtil.getParameter(request, "mvmt_edi_sts_tp_flg", ""));
		setCrntSkdDirCd(JSPUtil.getParameter(request, "crnt_skd_dir_cd", ""));
		setHjsPorCd(JSPUtil.getParameter(request, "hjs_por_cd", ""));
		setMgstNo(JSPUtil.getParameter(request, "mgst_no", ""));
		setCntrHngrRckFlg(JSPUtil.getParameter(request, "cntr_hngr_rck_flg", ""));
		setHjsPodCd(JSPUtil.getParameter(request, "hjs_pod_cd", ""));
		setOfcCd(JSPUtil.getParameter(request, "ofc_cd", ""));
		setTrnNo(JSPUtil.getParameter(request, "trn_no", ""));
		setCntrNo(JSPUtil.getParameter(request, "cntr_no", ""));
		setCntrFullStsCd(JSPUtil.getParameter(request, "cntr_full_sts_cd", ""));
		setCntrSealNo(JSPUtil.getParameter(request, "cntr_seal_no", ""));
		setCnmvCoCd(JSPUtil.getParameter(request, "cnmv_co_cd", ""));
		setCrntVslCd(JSPUtil.getParameter(request, "crnt_vsl_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return CtmMvmtEdiMsgVO[]
	 */
	public CtmMvmtEdiMsgVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return CtmMvmtEdiMsgVO[]
	 */
	public CtmMvmtEdiMsgVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CtmMvmtEdiMsgVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] clmArrLocCd = (JSPUtil.getParameter(request, prefix	+ "clm_arr_loc_cd", length));
			String[] crntSkdVoyNo = (JSPUtil.getParameter(request, prefix	+ "crnt_skd_voy_no", length));
			String[] mvmtEdiMsgTpId = (JSPUtil.getParameter(request, prefix	+ "mvmt_edi_msg_tp_id", length));
			String[] fnlLocSplcCd = (JSPUtil.getParameter(request, prefix	+ "fnl_loc_splc_cd", length));
			String[] chssNo = (JSPUtil.getParameter(request, prefix	+ "chss_no", length));
			String[] mvmtTrspModCd = (JSPUtil.getParameter(request, prefix	+ "mvmt_trsp_mod_cd", length));
			String[] mvmtEdiMsgSeq = (JSPUtil.getParameter(request, prefix	+ "mvmt_edi_msg_seq", length));
			String[] destYdCd = (JSPUtil.getParameter(request, prefix	+ "dest_yd_cd", length));
			String[] blNo = (JSPUtil.getParameter(request, prefix	+ "bl_no", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] mvmtEdiRmk = (JSPUtil.getParameter(request, prefix	+ "mvmt_edi_rmk", length));
			String[] substRuleCd = (JSPUtil.getParameter(request, prefix	+ "subst_rule_cd", length));
			String[] fcarNo = (JSPUtil.getParameter(request, prefix	+ "fcar_no", length));
			String[] bkgPodCd = (JSPUtil.getParameter(request, prefix	+ "bkg_pod_cd", length));
			String[] evntYdCd = (JSPUtil.getParameter(request, prefix	+ "evnt_yd_cd", length));
			String[] mvmtEdiTpCd = (JSPUtil.getParameter(request, prefix	+ "mvmt_edi_tp_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] evntDt = (JSPUtil.getParameter(request, prefix	+ "evnt_dt", length));
			String[] hjsDepYdCd = (JSPUtil.getParameter(request, prefix	+ "hjs_dep_yd_cd", length));
			String[] mvmtEdiMsgAreaCd = (JSPUtil.getParameter(request, prefix	+ "mvmt_edi_msg_area_cd", length));
			String[] hjsDestLocId = (JSPUtil.getParameter(request, prefix	+ "hjs_dest_loc_id", length));
			String[] ediMvmtStsCd = (JSPUtil.getParameter(request, prefix	+ "edi_mvmt_sts_cd", length));
			String[] callSgnNo = (JSPUtil.getParameter(request, prefix	+ "call_sgn_no", length));
			String[] clmArrDt = (JSPUtil.getParameter(request, prefix	+ "clm_arr_dt", length));
			String[] mvmtEdiRsltCd = (JSPUtil.getParameter(request, prefix	+ "mvmt_edi_rslt_cd", length));
			String[] updLoclDt = (JSPUtil.getParameter(request, prefix	+ "upd_locl_dt", length));
			String[] wblNo = (JSPUtil.getParameter(request, prefix	+ "wbl_no", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] lloydNo = (JSPUtil.getParameter(request, prefix	+ "lloyd_no", length));
			String[] creLoclDt = (JSPUtil.getParameter(request, prefix	+ "cre_locl_dt", length));
			String[] mvmtEdiMsgYrmondy = (JSPUtil.getParameter(request, prefix	+ "mvmt_edi_msg_yrmondy", length));
			String[] vndrSeq = (JSPUtil.getParameter(request, prefix	+ "vndr_seq", length));
			String[] hjsPkupRqstDt = (JSPUtil.getParameter(request, prefix	+ "hjs_pkup_rqst_dt", length));
			String[] crntLocSplcCd = (JSPUtil.getParameter(request, prefix	+ "crnt_loc_splc_cd", length));
			String[] pkupNo = (JSPUtil.getParameter(request, prefix	+ "pkup_no", length));
			String[] tmlNm = (JSPUtil.getParameter(request, prefix	+ "tml_nm", length));
			String[] hjsArrYdCd = (JSPUtil.getParameter(request, prefix	+ "hjs_arr_yd_cd", length));
			String[] ediGateIoCd = (JSPUtil.getParameter(request, prefix	+ "edi_gate_io_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] fltFileRefNo = (JSPUtil.getParameter(request, prefix	+ "flt_file_ref_no", length));
			String[] hjsActDt = (JSPUtil.getParameter(request, prefix	+ "hjs_act_dt", length));
			String[] cntrDmgFlg = (JSPUtil.getParameter(request, prefix	+ "cntr_dmg_flg", length));
			String[] hjsCustNm = (JSPUtil.getParameter(request, prefix	+ "hjs_cust_nm", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] bkgKnt = (JSPUtil.getParameter(request, prefix	+ "bkg_knt", length));
			String[] rtyKnt = (JSPUtil.getParameter(request, prefix	+ "rty_knt", length));
			String[] clmSghtCd = (JSPUtil.getParameter(request, prefix	+ "clm_sght_cd", length));
			String[] mvmtEdiSghtCd = (JSPUtil.getParameter(request, prefix	+ "mvmt_edi_sght_cd", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] bkgPolCd = (JSPUtil.getParameter(request, prefix	+ "bkg_pol_cd", length));
			String[] hjsSoNo = (JSPUtil.getParameter(request, prefix	+ "hjs_so_no", length));
			String[] mvmtEdiStsTpFlg = (JSPUtil.getParameter(request, prefix	+ "mvmt_edi_sts_tp_flg", length));
			String[] crntSkdDirCd = (JSPUtil.getParameter(request, prefix	+ "crnt_skd_dir_cd", length));
			String[] hjsPorCd = (JSPUtil.getParameter(request, prefix	+ "hjs_por_cd", length));
			String[] mgstNo = (JSPUtil.getParameter(request, prefix	+ "mgst_no", length));
			String[] cntrHngrRckFlg = (JSPUtil.getParameter(request, prefix	+ "cntr_hngr_rck_flg", length));
			String[] hjsPodCd = (JSPUtil.getParameter(request, prefix	+ "hjs_pod_cd", length));
			String[] ofcCd = (JSPUtil.getParameter(request, prefix	+ "ofc_cd", length));
			String[] trnNo = (JSPUtil.getParameter(request, prefix	+ "trn_no", length));
			String[] cntrNo = (JSPUtil.getParameter(request, prefix	+ "cntr_no", length));
			String[] cntrFullStsCd = (JSPUtil.getParameter(request, prefix	+ "cntr_full_sts_cd", length));
			String[] cntrSealNo = (JSPUtil.getParameter(request, prefix	+ "cntr_seal_no", length));
			String[] cnmvCoCd = (JSPUtil.getParameter(request, prefix	+ "cnmv_co_cd", length));
			String[] crntVslCd = (JSPUtil.getParameter(request, prefix	+ "crnt_vsl_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new CtmMvmtEdiMsgVO();
				if (clmArrLocCd[i] != null)
					model.setClmArrLocCd(clmArrLocCd[i]);
				if (crntSkdVoyNo[i] != null)
					model.setCrntSkdVoyNo(crntSkdVoyNo[i]);
				if (mvmtEdiMsgTpId[i] != null)
					model.setMvmtEdiMsgTpId(mvmtEdiMsgTpId[i]);
				if (fnlLocSplcCd[i] != null)
					model.setFnlLocSplcCd(fnlLocSplcCd[i]);
				if (chssNo[i] != null)
					model.setChssNo(chssNo[i]);
				if (mvmtTrspModCd[i] != null)
					model.setMvmtTrspModCd(mvmtTrspModCd[i]);
				if (mvmtEdiMsgSeq[i] != null)
					model.setMvmtEdiMsgSeq(mvmtEdiMsgSeq[i]);
				if (destYdCd[i] != null)
					model.setDestYdCd(destYdCd[i]);
				if (blNo[i] != null)
					model.setBlNo(blNo[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (mvmtEdiRmk[i] != null)
					model.setMvmtEdiRmk(mvmtEdiRmk[i]);
				if (substRuleCd[i] != null)
					model.setSubstRuleCd(substRuleCd[i]);
				if (fcarNo[i] != null)
					model.setFcarNo(fcarNo[i]);
				if (bkgPodCd[i] != null)
					model.setBkgPodCd(bkgPodCd[i]);
				if (evntYdCd[i] != null)
					model.setEvntYdCd(evntYdCd[i]);
				if (mvmtEdiTpCd[i] != null)
					model.setMvmtEdiTpCd(mvmtEdiTpCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (evntDt[i] != null)
					model.setEvntDt(evntDt[i]);
				if (hjsDepYdCd[i] != null)
					model.setHjsDepYdCd(hjsDepYdCd[i]);
				if (mvmtEdiMsgAreaCd[i] != null)
					model.setMvmtEdiMsgAreaCd(mvmtEdiMsgAreaCd[i]);
				if (hjsDestLocId[i] != null)
					model.setHjsDestLocId(hjsDestLocId[i]);
				if (ediMvmtStsCd[i] != null)
					model.setEdiMvmtStsCd(ediMvmtStsCd[i]);
				if (callSgnNo[i] != null)
					model.setCallSgnNo(callSgnNo[i]);
				if (clmArrDt[i] != null)
					model.setClmArrDt(clmArrDt[i]);
				if (mvmtEdiRsltCd[i] != null)
					model.setMvmtEdiRsltCd(mvmtEdiRsltCd[i]);
				if (updLoclDt[i] != null)
					model.setUpdLoclDt(updLoclDt[i]);
				if (wblNo[i] != null)
					model.setWblNo(wblNo[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (lloydNo[i] != null)
					model.setLloydNo(lloydNo[i]);
				if (creLoclDt[i] != null)
					model.setCreLoclDt(creLoclDt[i]);
				if (mvmtEdiMsgYrmondy[i] != null)
					model.setMvmtEdiMsgYrmondy(mvmtEdiMsgYrmondy[i]);
				if (vndrSeq[i] != null)
					model.setVndrSeq(vndrSeq[i]);
				if (hjsPkupRqstDt[i] != null)
					model.setHjsPkupRqstDt(hjsPkupRqstDt[i]);
				if (crntLocSplcCd[i] != null)
					model.setCrntLocSplcCd(crntLocSplcCd[i]);
				if (pkupNo[i] != null)
					model.setPkupNo(pkupNo[i]);
				if (tmlNm[i] != null)
					model.setTmlNm(tmlNm[i]);
				if (hjsArrYdCd[i] != null)
					model.setHjsArrYdCd(hjsArrYdCd[i]);
				if (ediGateIoCd[i] != null)
					model.setEdiGateIoCd(ediGateIoCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (fltFileRefNo[i] != null)
					model.setFltFileRefNo(fltFileRefNo[i]);
				if (hjsActDt[i] != null)
					model.setHjsActDt(hjsActDt[i]);
				if (cntrDmgFlg[i] != null)
					model.setCntrDmgFlg(cntrDmgFlg[i]);
				if (hjsCustNm[i] != null)
					model.setHjsCustNm(hjsCustNm[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (bkgKnt[i] != null)
					model.setBkgKnt(bkgKnt[i]);
				if (rtyKnt[i] != null)
					model.setRtyKnt(rtyKnt[i]);
				if (clmSghtCd[i] != null)
					model.setClmSghtCd(clmSghtCd[i]);
				if (mvmtEdiSghtCd[i] != null)
					model.setMvmtEdiSghtCd(mvmtEdiSghtCd[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (bkgPolCd[i] != null)
					model.setBkgPolCd(bkgPolCd[i]);
				if (hjsSoNo[i] != null)
					model.setHjsSoNo(hjsSoNo[i]);
				if (mvmtEdiStsTpFlg[i] != null)
					model.setMvmtEdiStsTpFlg(mvmtEdiStsTpFlg[i]);
				if (crntSkdDirCd[i] != null)
					model.setCrntSkdDirCd(crntSkdDirCd[i]);
				if (hjsPorCd[i] != null)
					model.setHjsPorCd(hjsPorCd[i]);
				if (mgstNo[i] != null)
					model.setMgstNo(mgstNo[i]);
				if (cntrHngrRckFlg[i] != null)
					model.setCntrHngrRckFlg(cntrHngrRckFlg[i]);
				if (hjsPodCd[i] != null)
					model.setHjsPodCd(hjsPodCd[i]);
				if (ofcCd[i] != null)
					model.setOfcCd(ofcCd[i]);
				if (trnNo[i] != null)
					model.setTrnNo(trnNo[i]);
				if (cntrNo[i] != null)
					model.setCntrNo(cntrNo[i]);
				if (cntrFullStsCd[i] != null)
					model.setCntrFullStsCd(cntrFullStsCd[i]);
				if (cntrSealNo[i] != null)
					model.setCntrSealNo(cntrSealNo[i]);
				if (cnmvCoCd[i] != null)
					model.setCnmvCoCd(cnmvCoCd[i]);
				if (crntVslCd[i] != null)
					model.setCrntVslCd(crntVslCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getCtmMvmtEdiMsgVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return CtmMvmtEdiMsgVO[]
	 */
	public CtmMvmtEdiMsgVO[] getCtmMvmtEdiMsgVOs(){
		CtmMvmtEdiMsgVO[] vos = (CtmMvmtEdiMsgVO[])models.toArray(new CtmMvmtEdiMsgVO[models.size()]);
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
		this.clmArrLocCd = this.clmArrLocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.crntSkdVoyNo = this.crntSkdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mvmtEdiMsgTpId = this.mvmtEdiMsgTpId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fnlLocSplcCd = this.fnlLocSplcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssNo = this.chssNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mvmtTrspModCd = this.mvmtTrspModCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mvmtEdiMsgSeq = this.mvmtEdiMsgSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.destYdCd = this.destYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blNo = this.blNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mvmtEdiRmk = this.mvmtEdiRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.substRuleCd = this.substRuleCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fcarNo = this.fcarNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgPodCd = this.bkgPodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.evntYdCd = this.evntYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mvmtEdiTpCd = this.mvmtEdiTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.evntDt = this.evntDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hjsDepYdCd = this.hjsDepYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mvmtEdiMsgAreaCd = this.mvmtEdiMsgAreaCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hjsDestLocId = this.hjsDestLocId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediMvmtStsCd = this.ediMvmtStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.callSgnNo = this.callSgnNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.clmArrDt = this.clmArrDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mvmtEdiRsltCd = this.mvmtEdiRsltCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updLoclDt = this.updLoclDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.wblNo = this.wblNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lloydNo = this.lloydNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creLoclDt = this.creLoclDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mvmtEdiMsgYrmondy = this.mvmtEdiMsgYrmondy .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrSeq = this.vndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hjsPkupRqstDt = this.hjsPkupRqstDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.crntLocSplcCd = this.crntLocSplcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pkupNo = this.pkupNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlNm = this.tmlNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hjsArrYdCd = this.hjsArrYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediGateIoCd = this.ediGateIoCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fltFileRefNo = this.fltFileRefNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hjsActDt = this.hjsActDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrDmgFlg = this.cntrDmgFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hjsCustNm = this.hjsCustNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgKnt = this.bkgKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rtyKnt = this.rtyKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.clmSghtCd = this.clmSghtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mvmtEdiSghtCd = this.mvmtEdiSghtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgPolCd = this.bkgPolCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hjsSoNo = this.hjsSoNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mvmtEdiStsTpFlg = this.mvmtEdiStsTpFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.crntSkdDirCd = this.crntSkdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hjsPorCd = this.hjsPorCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mgstNo = this.mgstNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrHngrRckFlg = this.cntrHngrRckFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hjsPodCd = this.hjsPodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcCd = this.ofcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trnNo = this.trnNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrNo = this.cntrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrFullStsCd = this.cntrFullStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrSealNo = this.cntrSealNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cnmvCoCd = this.cnmvCoCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.crntVslCd = this.crntVslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
