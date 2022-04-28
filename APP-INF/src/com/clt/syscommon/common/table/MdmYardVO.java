/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : MdmYardVO.java
*@FileTitle : MdmYardVO
*Open Issues :
*Change history :
*@LastModifyDate : 2010.02.23
*@LastModifier : 김준호
*@LastVersion : 1.0
* 2010.02.23 김준호 
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.common.table;

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
 * @author 김준호
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class MdmYardVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<MdmYardVO> models = new ArrayList<MdmYardVO>();
	
	/* Column Info */
	private String ydActSpc = null;
	/* Column Info */
	private String holGateClzHrmnt = null;
	/* Column Info */
	private String holGateOpnHrmnt = null;
	/* Column Info */
	private String ydFctyTpBrgRmpFlg = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String locCd = null;
	/* Column Info */
	private String ydRmk = null;
	/* Column Info */
	private String ydTtlVolBxKnt = null;
	/* Column Info */
	private String ydCtrlOfcZipCd = null;
	/* Column Info */
	private String brthNo = null;
	/* Column Info */
	private String n3rdVndrCntCd = null;
	/* Column Info */
	private String bfrOfcCngDt = null;
	/* Column Info */
	private String ydLocCtyNm = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String ydFctyTpCyFlg = null;
	/* Column Info */
	private String sunGateOpnHrmnt = null;
	/* Column Info */
	private String ydCeoNm = null;
	/* Column Info */
	private String rfAvgDwllHrs = null;
	/* Column Info */
	private String rfYdFtHrs = null;
	/* Column Info */
	private String tmlProdKnt = null;
	/* Column Info */
	private String n1stVndrCntCd = null;
	/* Column Info */
	private String zipCd = null;
	/* Column Info */
	private String n2ndVndrCntCd = null;
	/* Column Info */
	private String sunGateClzHrmnt = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String ydStrdlCrrKnt = null;
	/* Column Info */
	private String ydFctyTpPsdoYdFlg = null;
	/* Column Info */
	private String repYdTpCd = null;
	/* Column Info */
	private String ydTopLftKnt = null;
	/* Column Info */
	private String ydPstPgcKnt = null;
	/* Column Info */
	private String ydInrlFlg = null;
	/* Column Info */
	private String ydHjsSpc = null;
	/* Column Info */
	private String ydFctyTpCfsFlg = null;
	/* Column Info */
	private String ydTtlVolTeuKnt = null;
	/* Column Info */
	private String gateClzHrmnt = null;
	/* Column Info */
	private String demIbCltFlg = null;
	/* Column Info */
	private String bfrOfcCd = null;
	/* Column Info */
	private String ydBrthAlngSdDesc = null;
	/* Column Info */
	private String ydFctyTpRailRmpFlg = null;
	/* Column Info */
	private String ydFctyTpMrnTmlFlg = null;
	/* Column Info */
	private String ydLoclLangNm = null;
	/* Column Info */
	private String ydRfRcpt440vKnt = null;
	/* Column Info */
	private String eirSvcFlg = null;
	/* Column Info */
	private String ofcCd = null;
	/* Column Info */
	private String tmlChssKnt = null;
	/* Column Info */
	private String satGateClzHrmnt = null;
	/* Column Info */
	private String ydCd = null;
	/* Column Info */
	private String frkKnt = null;
	/* Column Info */
	private String ydAddr = null;
	/* Column Info */
	private String ydOpSysCd = null;
	/* Column Info */
	private String ydCtrlOfcSteCd = null;
	/* Column Info */
	private String ydCgoClzHrmntMsg = null;
	/* Column Info */
	private String ydTrctKnt = null;
	/* Column Info */
	private String ydRfRcpt220vKnt = null;
	/* Column Info */
	private String ydBrthDpthChnlKnt = null;
	/* Column Info */
	private String demObCltFlg = null;
	/* Column Info */
	private String ydLoclLangAddr = null;
	/* Column Info */
	private String dryYdFtHrs = null;
	/* Column Info */
	private String repZnCd = null;
	/* Column Info */
	private String ydHjsVolTeuKnt = null;
	/* Column Info */
	private String phnNo = null;
	/* Column Info */
	private String trstrKnt = null;
	/* Column Info */
	private String n2ndVndrSeq = null;
	/* Column Info */
	private String ydPicNm = null;
	/* Column Info */
	private String ydHndlYr = null;
	/* Column Info */
	private String rfMinDwllHrs = null;
	/* Column Info */
	private String ydCfsSpc = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String ydChrCd = null;
	/* Column Info */
	private String ydNm = null;
	/* Column Info */
	private String faxNo = null;
	/* Column Info */
	private String ydLocSteCd = null;
	/* Column Info */
	private String ydOshpCd = null;
	/* Column Info */
	private String hubYdFlg = null;
	/* Column Info */
	private String ydRfRcptDulKnt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String dryAvgDwllHrs = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String ydPgcKnt = null;
	/* Column Info */
	private String modiYdCd = null;
	/* Column Info */
	private String ydHjsVolBxKnt = null;
	/* Column Info */
	private String n1stVndrSeq = null;
	/* Column Info */
	private String satGateOpnHrmnt = null;
	/* Column Info */
	private String n3rdVndrSeq = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String ydCstmsNo = null;
	/* Column Info */
	private String ydCtrlOfcCtyNm = null;
	/* Column Info */
	private String ydTtlSpc = null;
	/* Column Info */
	private String dmdtOfcCd = null;
	/* Column Info */
	private String gateOpnHrmnt = null;
	/* Column Info */
	private String dryMinDwllHrs = null;
	/* Column Info */
	private String ydHndlCapa = null;
	/* Column Info */
	private String onfHirYdFlg = null;
	/* Column Info */
	private String eaiEvntDt = null;
	/* Column Info */
	private String mnrShopFlg = null;
	/* Column Info */
	private String ydBrthLen = null;
	/* Column Info */
	private String ydCtrlOfcAddr = null;
	/* Column Info */
	private String bdYdFlg = null;
	/* Column Info */
	private String ydEml = null;
	/* Column Info */
	private String intlPhnNo = null;
	/* Column Info */
	private String bkgPodYdFlg = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public MdmYardVO() {}

	public MdmYardVO(String ibflag, String pagerows, String ydCd, String ydNm, String locCd, String n1stVndrCntCd, String n1stVndrSeq, String ofcCd, String ydChrCd, String ydFctyTpMrnTmlFlg, String ydFctyTpCyFlg, String ydFctyTpCfsFlg, String ydFctyTpRailRmpFlg, String ydOshpCd, String bdYdFlg, String onfHirYdFlg, String repZnCd, String ydAddr, String zipCd, String intlPhnNo, String phnNo, String faxNo, String ydPicNm, String ydCeoNm, String gateOpnHrmnt, String gateClzHrmnt, String holGateOpnHrmnt, String holGateClzHrmnt, String sunGateOpnHrmnt, String sunGateClzHrmnt, String satGateOpnHrmnt, String satGateClzHrmnt, String ydCgoClzHrmntMsg, String ydRmk, String brthNo, String ydBrthLen, String ydBrthAlngSdDesc, String ydBrthDpthChnlKnt, String ydTtlSpc, String ydActSpc, String ydHjsSpc, String ydHndlCapa, String ydRfRcpt440vKnt, String ydRfRcpt220vKnt, String ydRfRcptDulKnt, String ydOpSysCd, String ydInrlFlg, String ydCfsSpc, String mnrShopFlg, String ydHndlYr, String ydTtlVolTeuKnt, String ydTtlVolBxKnt, String ydHjsVolTeuKnt, String ydHjsVolBxKnt, String ydPstPgcKnt, String ydPgcKnt, String trstrKnt, String frkKnt, String ydStrdlCrrKnt, String ydTrctKnt, String ydTopLftKnt, String tmlChssKnt, String eirSvcFlg, String tmlProdKnt, String ydCstmsNo, String ydFctyTpPsdoYdFlg, String ydEml, String demIbCltFlg, String demObCltFlg, String bkgPodYdFlg, String n2ndVndrCntCd, String n2ndVndrSeq, String n3rdVndrCntCd, String n3rdVndrSeq, String dmdtOfcCd, String ydFctyTpBrgRmpFlg, String bfrOfcCd, String rfAvgDwllHrs, String bfrOfcCngDt, String modiYdCd, String repYdTpCd, String rfMinDwllHrs, String rfYdFtHrs, String dryAvgDwllHrs, String dryMinDwllHrs, String dryYdFtHrs, String ydCtrlOfcAddr, String ydCtrlOfcCtyNm, String ydCtrlOfcSteCd, String ydCtrlOfcZipCd, String ydLocCtyNm, String ydLocSteCd, String hubYdFlg, String ydLoclLangNm, String ydLoclLangAddr, String creUsrId, String creDt, String updUsrId, String updDt, String deltFlg, String eaiEvntDt) {
		this.ydActSpc = ydActSpc;
		this.holGateClzHrmnt = holGateClzHrmnt;
		this.holGateOpnHrmnt = holGateOpnHrmnt;
		this.ydFctyTpBrgRmpFlg = ydFctyTpBrgRmpFlg;
		this.pagerows = pagerows;
		this.locCd = locCd;
		this.ydRmk = ydRmk;
		this.ydTtlVolBxKnt = ydTtlVolBxKnt;
		this.ydCtrlOfcZipCd = ydCtrlOfcZipCd;
		this.brthNo = brthNo;
		this.n3rdVndrCntCd = n3rdVndrCntCd;
		this.bfrOfcCngDt = bfrOfcCngDt;
		this.ydLocCtyNm = ydLocCtyNm;
		this.updUsrId = updUsrId;
		this.ydFctyTpCyFlg = ydFctyTpCyFlg;
		this.sunGateOpnHrmnt = sunGateOpnHrmnt;
		this.ydCeoNm = ydCeoNm;
		this.rfAvgDwllHrs = rfAvgDwllHrs;
		this.rfYdFtHrs = rfYdFtHrs;
		this.tmlProdKnt = tmlProdKnt;
		this.n1stVndrCntCd = n1stVndrCntCd;
		this.zipCd = zipCd;
		this.n2ndVndrCntCd = n2ndVndrCntCd;
		this.sunGateClzHrmnt = sunGateClzHrmnt;
		this.deltFlg = deltFlg;
		this.ydStrdlCrrKnt = ydStrdlCrrKnt;
		this.ydFctyTpPsdoYdFlg = ydFctyTpPsdoYdFlg;
		this.repYdTpCd = repYdTpCd;
		this.ydTopLftKnt = ydTopLftKnt;
		this.ydPstPgcKnt = ydPstPgcKnt;
		this.ydInrlFlg = ydInrlFlg;
		this.ydHjsSpc = ydHjsSpc;
		this.ydFctyTpCfsFlg = ydFctyTpCfsFlg;
		this.ydTtlVolTeuKnt = ydTtlVolTeuKnt;
		this.gateClzHrmnt = gateClzHrmnt;
		this.demIbCltFlg = demIbCltFlg;
		this.bfrOfcCd = bfrOfcCd;
		this.ydBrthAlngSdDesc = ydBrthAlngSdDesc;
		this.ydFctyTpRailRmpFlg = ydFctyTpRailRmpFlg;
		this.ydFctyTpMrnTmlFlg = ydFctyTpMrnTmlFlg;
		this.ydLoclLangNm = ydLoclLangNm;
		this.ydRfRcpt440vKnt = ydRfRcpt440vKnt;
		this.eirSvcFlg = eirSvcFlg;
		this.ofcCd = ofcCd;
		this.tmlChssKnt = tmlChssKnt;
		this.satGateClzHrmnt = satGateClzHrmnt;
		this.ydCd = ydCd;
		this.frkKnt = frkKnt;
		this.ydAddr = ydAddr;
		this.ydOpSysCd = ydOpSysCd;
		this.ydCtrlOfcSteCd = ydCtrlOfcSteCd;
		this.ydCgoClzHrmntMsg = ydCgoClzHrmntMsg;
		this.ydTrctKnt = ydTrctKnt;
		this.ydRfRcpt220vKnt = ydRfRcpt220vKnt;
		this.ydBrthDpthChnlKnt = ydBrthDpthChnlKnt;
		this.demObCltFlg = demObCltFlg;
		this.ydLoclLangAddr = ydLoclLangAddr;
		this.dryYdFtHrs = dryYdFtHrs;
		this.repZnCd = repZnCd;
		this.ydHjsVolTeuKnt = ydHjsVolTeuKnt;
		this.phnNo = phnNo;
		this.trstrKnt = trstrKnt;
		this.n2ndVndrSeq = n2ndVndrSeq;
		this.ydPicNm = ydPicNm;
		this.ydHndlYr = ydHndlYr;
		this.rfMinDwllHrs = rfMinDwllHrs;
		this.ydCfsSpc = ydCfsSpc;
		this.creUsrId = creUsrId;
		this.ydChrCd = ydChrCd;
		this.ydNm = ydNm;
		this.faxNo = faxNo;
		this.ydLocSteCd = ydLocSteCd;
		this.ydOshpCd = ydOshpCd;
		this.hubYdFlg = hubYdFlg;
		this.ydRfRcptDulKnt = ydRfRcptDulKnt;
		this.creDt = creDt;
		this.dryAvgDwllHrs = dryAvgDwllHrs;
		this.ibflag = ibflag;
		this.ydPgcKnt = ydPgcKnt;
		this.modiYdCd = modiYdCd;
		this.ydHjsVolBxKnt = ydHjsVolBxKnt;
		this.n1stVndrSeq = n1stVndrSeq;
		this.satGateOpnHrmnt = satGateOpnHrmnt;
		this.n3rdVndrSeq = n3rdVndrSeq;
		this.updDt = updDt;
		this.ydCstmsNo = ydCstmsNo;
		this.ydCtrlOfcCtyNm = ydCtrlOfcCtyNm;
		this.ydTtlSpc = ydTtlSpc;
		this.dmdtOfcCd = dmdtOfcCd;
		this.gateOpnHrmnt = gateOpnHrmnt;
		this.dryMinDwllHrs = dryMinDwllHrs;
		this.ydHndlCapa = ydHndlCapa;
		this.onfHirYdFlg = onfHirYdFlg;
		this.eaiEvntDt = eaiEvntDt;
		this.mnrShopFlg = mnrShopFlg;
		this.ydBrthLen = ydBrthLen;
		this.ydCtrlOfcAddr = ydCtrlOfcAddr;
		this.bdYdFlg = bdYdFlg;
		this.ydEml = ydEml;
		this.intlPhnNo = intlPhnNo;
		this.bkgPodYdFlg = bkgPodYdFlg;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("yd_act_spc", getYdActSpc());
		this.hashColumns.put("hol_gate_clz_hrmnt", getHolGateClzHrmnt());
		this.hashColumns.put("hol_gate_opn_hrmnt", getHolGateOpnHrmnt());
		this.hashColumns.put("yd_fcty_tp_brg_rmp_flg", getYdFctyTpBrgRmpFlg());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("loc_cd", getLocCd());
		this.hashColumns.put("yd_rmk", getYdRmk());
		this.hashColumns.put("yd_ttl_vol_bx_knt", getYdTtlVolBxKnt());
		this.hashColumns.put("yd_ctrl_ofc_zip_cd", getYdCtrlOfcZipCd());
		this.hashColumns.put("brth_no", getBrthNo());
		this.hashColumns.put("n3rd_vndr_cnt_cd", getN3rdVndrCntCd());
		this.hashColumns.put("bfr_ofc_cng_dt", getBfrOfcCngDt());
		this.hashColumns.put("yd_loc_cty_nm", getYdLocCtyNm());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("yd_fcty_tp_cy_flg", getYdFctyTpCyFlg());
		this.hashColumns.put("sun_gate_opn_hrmnt", getSunGateOpnHrmnt());
		this.hashColumns.put("yd_ceo_nm", getYdCeoNm());
		this.hashColumns.put("rf_avg_dwll_hrs", getRfAvgDwllHrs());
		this.hashColumns.put("rf_yd_ft_hrs", getRfYdFtHrs());
		this.hashColumns.put("tml_prod_knt", getTmlProdKnt());
		this.hashColumns.put("n1st_vndr_cnt_cd", getN1stVndrCntCd());
		this.hashColumns.put("zip_cd", getZipCd());
		this.hashColumns.put("n2nd_vndr_cnt_cd", getN2ndVndrCntCd());
		this.hashColumns.put("sun_gate_clz_hrmnt", getSunGateClzHrmnt());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("yd_strdl_crr_knt", getYdStrdlCrrKnt());
		this.hashColumns.put("yd_fcty_tp_psdo_yd_flg", getYdFctyTpPsdoYdFlg());
		this.hashColumns.put("rep_yd_tp_cd", getRepYdTpCd());
		this.hashColumns.put("yd_top_lft_knt", getYdTopLftKnt());
		this.hashColumns.put("yd_pst_pgc_knt", getYdPstPgcKnt());
		this.hashColumns.put("yd_inrl_flg", getYdInrlFlg());
		this.hashColumns.put("yd_hjs_spc", getYdHjsSpc());
		this.hashColumns.put("yd_fcty_tp_cfs_flg", getYdFctyTpCfsFlg());
		this.hashColumns.put("yd_ttl_vol_teu_knt", getYdTtlVolTeuKnt());
		this.hashColumns.put("gate_clz_hrmnt", getGateClzHrmnt());
		this.hashColumns.put("dem_ib_clt_flg", getDemIbCltFlg());
		this.hashColumns.put("bfr_ofc_cd", getBfrOfcCd());
		this.hashColumns.put("yd_brth_alng_sd_desc", getYdBrthAlngSdDesc());
		this.hashColumns.put("yd_fcty_tp_rail_rmp_flg", getYdFctyTpRailRmpFlg());
		this.hashColumns.put("yd_fcty_tp_mrn_tml_flg", getYdFctyTpMrnTmlFlg());
		this.hashColumns.put("yd_locl_lang_nm", getYdLoclLangNm());
		this.hashColumns.put("yd_rf_rcpt_440v_knt", getYdRfRcpt440vKnt());
		this.hashColumns.put("eir_svc_flg", getEirSvcFlg());
		this.hashColumns.put("ofc_cd", getOfcCd());
		this.hashColumns.put("tml_chss_knt", getTmlChssKnt());
		this.hashColumns.put("sat_gate_clz_hrmnt", getSatGateClzHrmnt());
		this.hashColumns.put("yd_cd", getYdCd());
		this.hashColumns.put("frk_knt", getFrkKnt());
		this.hashColumns.put("yd_addr", getYdAddr());
		this.hashColumns.put("yd_op_sys_cd", getYdOpSysCd());
		this.hashColumns.put("yd_ctrl_ofc_ste_cd", getYdCtrlOfcSteCd());
		this.hashColumns.put("yd_cgo_clz_hrmnt_msg", getYdCgoClzHrmntMsg());
		this.hashColumns.put("yd_trct_knt", getYdTrctKnt());
		this.hashColumns.put("yd_rf_rcpt_220v_knt", getYdRfRcpt220vKnt());
		this.hashColumns.put("yd_brth_dpth_chnl_knt", getYdBrthDpthChnlKnt());
		this.hashColumns.put("dem_ob_clt_flg", getDemObCltFlg());
		this.hashColumns.put("yd_locl_lang_addr", getYdLoclLangAddr());
		this.hashColumns.put("dry_yd_ft_hrs", getDryYdFtHrs());
		this.hashColumns.put("rep_zn_cd", getRepZnCd());
		this.hashColumns.put("yd_hjs_vol_teu_knt", getYdHjsVolTeuKnt());
		this.hashColumns.put("phn_no", getPhnNo());
		this.hashColumns.put("trstr_knt", getTrstrKnt());
		this.hashColumns.put("n2nd_vndr_seq", getN2ndVndrSeq());
		this.hashColumns.put("yd_pic_nm", getYdPicNm());
		this.hashColumns.put("yd_hndl_yr", getYdHndlYr());
		this.hashColumns.put("rf_min_dwll_hrs", getRfMinDwllHrs());
		this.hashColumns.put("yd_cfs_spc", getYdCfsSpc());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("yd_chr_cd", getYdChrCd());
		this.hashColumns.put("yd_nm", getYdNm());
		this.hashColumns.put("fax_no", getFaxNo());
		this.hashColumns.put("yd_loc_ste_cd", getYdLocSteCd());
		this.hashColumns.put("yd_oshp_cd", getYdOshpCd());
		this.hashColumns.put("hub_yd_flg", getHubYdFlg());
		this.hashColumns.put("yd_rf_rcpt_dul_knt", getYdRfRcptDulKnt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("dry_avg_dwll_hrs", getDryAvgDwllHrs());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("yd_pgc_knt", getYdPgcKnt());
		this.hashColumns.put("modi_yd_cd", getModiYdCd());
		this.hashColumns.put("yd_hjs_vol_bx_knt", getYdHjsVolBxKnt());
		this.hashColumns.put("n1st_vndr_seq", getN1stVndrSeq());
		this.hashColumns.put("sat_gate_opn_hrmnt", getSatGateOpnHrmnt());
		this.hashColumns.put("n3rd_vndr_seq", getN3rdVndrSeq());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("yd_cstms_no", getYdCstmsNo());
		this.hashColumns.put("yd_ctrl_ofc_cty_nm", getYdCtrlOfcCtyNm());
		this.hashColumns.put("yd_ttl_spc", getYdTtlSpc());
		this.hashColumns.put("dmdt_ofc_cd", getDmdtOfcCd());
		this.hashColumns.put("gate_opn_hrmnt", getGateOpnHrmnt());
		this.hashColumns.put("dry_min_dwll_hrs", getDryMinDwllHrs());
		this.hashColumns.put("yd_hndl_capa", getYdHndlCapa());
		this.hashColumns.put("onf_hir_yd_flg", getOnfHirYdFlg());
		this.hashColumns.put("eai_evnt_dt", getEaiEvntDt());
		this.hashColumns.put("mnr_shop_flg", getMnrShopFlg());
		this.hashColumns.put("yd_brth_len", getYdBrthLen());
		this.hashColumns.put("yd_ctrl_ofc_addr", getYdCtrlOfcAddr());
		this.hashColumns.put("bd_yd_flg", getBdYdFlg());
		this.hashColumns.put("yd_eml", getYdEml());
		this.hashColumns.put("intl_phn_no", getIntlPhnNo());
		this.hashColumns.put("bkg_pod_yd_flg", getBkgPodYdFlg());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("yd_act_spc", "ydActSpc");
		this.hashFields.put("hol_gate_clz_hrmnt", "holGateClzHrmnt");
		this.hashFields.put("hol_gate_opn_hrmnt", "holGateOpnHrmnt");
		this.hashFields.put("yd_fcty_tp_brg_rmp_flg", "ydFctyTpBrgRmpFlg");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("loc_cd", "locCd");
		this.hashFields.put("yd_rmk", "ydRmk");
		this.hashFields.put("yd_ttl_vol_bx_knt", "ydTtlVolBxKnt");
		this.hashFields.put("yd_ctrl_ofc_zip_cd", "ydCtrlOfcZipCd");
		this.hashFields.put("brth_no", "brthNo");
		this.hashFields.put("n3rd_vndr_cnt_cd", "n3rdVndrCntCd");
		this.hashFields.put("bfr_ofc_cng_dt", "bfrOfcCngDt");
		this.hashFields.put("yd_loc_cty_nm", "ydLocCtyNm");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("yd_fcty_tp_cy_flg", "ydFctyTpCyFlg");
		this.hashFields.put("sun_gate_opn_hrmnt", "sunGateOpnHrmnt");
		this.hashFields.put("yd_ceo_nm", "ydCeoNm");
		this.hashFields.put("rf_avg_dwll_hrs", "rfAvgDwllHrs");
		this.hashFields.put("rf_yd_ft_hrs", "rfYdFtHrs");
		this.hashFields.put("tml_prod_knt", "tmlProdKnt");
		this.hashFields.put("n1st_vndr_cnt_cd", "n1stVndrCntCd");
		this.hashFields.put("zip_cd", "zipCd");
		this.hashFields.put("n2nd_vndr_cnt_cd", "n2ndVndrCntCd");
		this.hashFields.put("sun_gate_clz_hrmnt", "sunGateClzHrmnt");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("yd_strdl_crr_knt", "ydStrdlCrrKnt");
		this.hashFields.put("yd_fcty_tp_psdo_yd_flg", "ydFctyTpPsdoYdFlg");
		this.hashFields.put("rep_yd_tp_cd", "repYdTpCd");
		this.hashFields.put("yd_top_lft_knt", "ydTopLftKnt");
		this.hashFields.put("yd_pst_pgc_knt", "ydPstPgcKnt");
		this.hashFields.put("yd_inrl_flg", "ydInrlFlg");
		this.hashFields.put("yd_hjs_spc", "ydHjsSpc");
		this.hashFields.put("yd_fcty_tp_cfs_flg", "ydFctyTpCfsFlg");
		this.hashFields.put("yd_ttl_vol_teu_knt", "ydTtlVolTeuKnt");
		this.hashFields.put("gate_clz_hrmnt", "gateClzHrmnt");
		this.hashFields.put("dem_ib_clt_flg", "demIbCltFlg");
		this.hashFields.put("bfr_ofc_cd", "bfrOfcCd");
		this.hashFields.put("yd_brth_alng_sd_desc", "ydBrthAlngSdDesc");
		this.hashFields.put("yd_fcty_tp_rail_rmp_flg", "ydFctyTpRailRmpFlg");
		this.hashFields.put("yd_fcty_tp_mrn_tml_flg", "ydFctyTpMrnTmlFlg");
		this.hashFields.put("yd_locl_lang_nm", "ydLoclLangNm");
		this.hashFields.put("yd_rf_rcpt_440v_knt", "ydRfRcpt440vKnt");
		this.hashFields.put("eir_svc_flg", "eirSvcFlg");
		this.hashFields.put("ofc_cd", "ofcCd");
		this.hashFields.put("tml_chss_knt", "tmlChssKnt");
		this.hashFields.put("sat_gate_clz_hrmnt", "satGateClzHrmnt");
		this.hashFields.put("yd_cd", "ydCd");
		this.hashFields.put("frk_knt", "frkKnt");
		this.hashFields.put("yd_addr", "ydAddr");
		this.hashFields.put("yd_op_sys_cd", "ydOpSysCd");
		this.hashFields.put("yd_ctrl_ofc_ste_cd", "ydCtrlOfcSteCd");
		this.hashFields.put("yd_cgo_clz_hrmnt_msg", "ydCgoClzHrmntMsg");
		this.hashFields.put("yd_trct_knt", "ydTrctKnt");
		this.hashFields.put("yd_rf_rcpt_220v_knt", "ydRfRcpt220vKnt");
		this.hashFields.put("yd_brth_dpth_chnl_knt", "ydBrthDpthChnlKnt");
		this.hashFields.put("dem_ob_clt_flg", "demObCltFlg");
		this.hashFields.put("yd_locl_lang_addr", "ydLoclLangAddr");
		this.hashFields.put("dry_yd_ft_hrs", "dryYdFtHrs");
		this.hashFields.put("rep_zn_cd", "repZnCd");
		this.hashFields.put("yd_hjs_vol_teu_knt", "ydHjsVolTeuKnt");
		this.hashFields.put("phn_no", "phnNo");
		this.hashFields.put("trstr_knt", "trstrKnt");
		this.hashFields.put("n2nd_vndr_seq", "n2ndVndrSeq");
		this.hashFields.put("yd_pic_nm", "ydPicNm");
		this.hashFields.put("yd_hndl_yr", "ydHndlYr");
		this.hashFields.put("rf_min_dwll_hrs", "rfMinDwllHrs");
		this.hashFields.put("yd_cfs_spc", "ydCfsSpc");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("yd_chr_cd", "ydChrCd");
		this.hashFields.put("yd_nm", "ydNm");
		this.hashFields.put("fax_no", "faxNo");
		this.hashFields.put("yd_loc_ste_cd", "ydLocSteCd");
		this.hashFields.put("yd_oshp_cd", "ydOshpCd");
		this.hashFields.put("hub_yd_flg", "hubYdFlg");
		this.hashFields.put("yd_rf_rcpt_dul_knt", "ydRfRcptDulKnt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("dry_avg_dwll_hrs", "dryAvgDwllHrs");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("yd_pgc_knt", "ydPgcKnt");
		this.hashFields.put("modi_yd_cd", "modiYdCd");
		this.hashFields.put("yd_hjs_vol_bx_knt", "ydHjsVolBxKnt");
		this.hashFields.put("n1st_vndr_seq", "n1stVndrSeq");
		this.hashFields.put("sat_gate_opn_hrmnt", "satGateOpnHrmnt");
		this.hashFields.put("n3rd_vndr_seq", "n3rdVndrSeq");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("yd_cstms_no", "ydCstmsNo");
		this.hashFields.put("yd_ctrl_ofc_cty_nm", "ydCtrlOfcCtyNm");
		this.hashFields.put("yd_ttl_spc", "ydTtlSpc");
		this.hashFields.put("dmdt_ofc_cd", "dmdtOfcCd");
		this.hashFields.put("gate_opn_hrmnt", "gateOpnHrmnt");
		this.hashFields.put("dry_min_dwll_hrs", "dryMinDwllHrs");
		this.hashFields.put("yd_hndl_capa", "ydHndlCapa");
		this.hashFields.put("onf_hir_yd_flg", "onfHirYdFlg");
		this.hashFields.put("eai_evnt_dt", "eaiEvntDt");
		this.hashFields.put("mnr_shop_flg", "mnrShopFlg");
		this.hashFields.put("yd_brth_len", "ydBrthLen");
		this.hashFields.put("yd_ctrl_ofc_addr", "ydCtrlOfcAddr");
		this.hashFields.put("bd_yd_flg", "bdYdFlg");
		this.hashFields.put("yd_eml", "ydEml");
		this.hashFields.put("intl_phn_no", "intlPhnNo");
		this.hashFields.put("bkg_pod_yd_flg", "bkgPodYdFlg");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return ydActSpc
	 */
	public String getYdActSpc() {
		return this.ydActSpc;
	}
	
	/**
	 * Column Info
	 * @return holGateClzHrmnt
	 */
	public String getHolGateClzHrmnt() {
		return this.holGateClzHrmnt;
	}
	
	/**
	 * Column Info
	 * @return holGateOpnHrmnt
	 */
	public String getHolGateOpnHrmnt() {
		return this.holGateOpnHrmnt;
	}
	
	/**
	 * Column Info
	 * @return ydFctyTpBrgRmpFlg
	 */
	public String getYdFctyTpBrgRmpFlg() {
		return this.ydFctyTpBrgRmpFlg;
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
	 * @return locCd
	 */
	public String getLocCd() {
		return this.locCd;
	}
	
	/**
	 * Column Info
	 * @return ydRmk
	 */
	public String getYdRmk() {
		return this.ydRmk;
	}
	
	/**
	 * Column Info
	 * @return ydTtlVolBxKnt
	 */
	public String getYdTtlVolBxKnt() {
		return this.ydTtlVolBxKnt;
	}
	
	/**
	 * Column Info
	 * @return ydCtrlOfcZipCd
	 */
	public String getYdCtrlOfcZipCd() {
		return this.ydCtrlOfcZipCd;
	}
	
	/**
	 * Column Info
	 * @return brthNo
	 */
	public String getBrthNo() {
		return this.brthNo;
	}
	
	/**
	 * Column Info
	 * @return n3rdVndrCntCd
	 */
	public String getN3rdVndrCntCd() {
		return this.n3rdVndrCntCd;
	}
	
	/**
	 * Column Info
	 * @return bfrOfcCngDt
	 */
	public String getBfrOfcCngDt() {
		return this.bfrOfcCngDt;
	}
	
	/**
	 * Column Info
	 * @return ydLocCtyNm
	 */
	public String getYdLocCtyNm() {
		return this.ydLocCtyNm;
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
	 * @return ydFctyTpCyFlg
	 */
	public String getYdFctyTpCyFlg() {
		return this.ydFctyTpCyFlg;
	}
	
	/**
	 * Column Info
	 * @return sunGateOpnHrmnt
	 */
	public String getSunGateOpnHrmnt() {
		return this.sunGateOpnHrmnt;
	}
	
	/**
	 * Column Info
	 * @return ydCeoNm
	 */
	public String getYdCeoNm() {
		return this.ydCeoNm;
	}
	
	/**
	 * Column Info
	 * @return rfAvgDwllHrs
	 */
	public String getRfAvgDwllHrs() {
		return this.rfAvgDwllHrs;
	}
	
	/**
	 * Column Info
	 * @return rfYdFtHrs
	 */
	public String getRfYdFtHrs() {
		return this.rfYdFtHrs;
	}
	
	/**
	 * Column Info
	 * @return tmlProdKnt
	 */
	public String getTmlProdKnt() {
		return this.tmlProdKnt;
	}
	
	/**
	 * Column Info
	 * @return n1stVndrCntCd
	 */
	public String getN1stVndrCntCd() {
		return this.n1stVndrCntCd;
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
	 * @return n2ndVndrCntCd
	 */
	public String getN2ndVndrCntCd() {
		return this.n2ndVndrCntCd;
	}
	
	/**
	 * Column Info
	 * @return sunGateClzHrmnt
	 */
	public String getSunGateClzHrmnt() {
		return this.sunGateClzHrmnt;
	}
	
	/**
	 * Column Info
	 * @return deltFlg
	 */
	public String getDeltFlg() {
		return this.deltFlg;
	}
	
	/**
	 * Column Info
	 * @return ydStrdlCrrKnt
	 */
	public String getYdStrdlCrrKnt() {
		return this.ydStrdlCrrKnt;
	}
	
	/**
	 * Column Info
	 * @return ydFctyTpPsdoYdFlg
	 */
	public String getYdFctyTpPsdoYdFlg() {
		return this.ydFctyTpPsdoYdFlg;
	}
	
	/**
	 * Column Info
	 * @return repYdTpCd
	 */
	public String getRepYdTpCd() {
		return this.repYdTpCd;
	}
	
	/**
	 * Column Info
	 * @return ydTopLftKnt
	 */
	public String getYdTopLftKnt() {
		return this.ydTopLftKnt;
	}
	
	/**
	 * Column Info
	 * @return ydPstPgcKnt
	 */
	public String getYdPstPgcKnt() {
		return this.ydPstPgcKnt;
	}
	
	/**
	 * Column Info
	 * @return ydInrlFlg
	 */
	public String getYdInrlFlg() {
		return this.ydInrlFlg;
	}
	
	/**
	 * Column Info
	 * @return ydHjsSpc
	 */
	public String getYdHjsSpc() {
		return this.ydHjsSpc;
	}
	
	/**
	 * Column Info
	 * @return ydFctyTpCfsFlg
	 */
	public String getYdFctyTpCfsFlg() {
		return this.ydFctyTpCfsFlg;
	}
	
	/**
	 * Column Info
	 * @return ydTtlVolTeuKnt
	 */
	public String getYdTtlVolTeuKnt() {
		return this.ydTtlVolTeuKnt;
	}
	
	/**
	 * Column Info
	 * @return gateClzHrmnt
	 */
	public String getGateClzHrmnt() {
		return this.gateClzHrmnt;
	}
	
	/**
	 * Column Info
	 * @return demIbCltFlg
	 */
	public String getDemIbCltFlg() {
		return this.demIbCltFlg;
	}
	
	/**
	 * Column Info
	 * @return bfrOfcCd
	 */
	public String getBfrOfcCd() {
		return this.bfrOfcCd;
	}
	
	/**
	 * Column Info
	 * @return ydBrthAlngSdDesc
	 */
	public String getYdBrthAlngSdDesc() {
		return this.ydBrthAlngSdDesc;
	}
	
	/**
	 * Column Info
	 * @return ydFctyTpRailRmpFlg
	 */
	public String getYdFctyTpRailRmpFlg() {
		return this.ydFctyTpRailRmpFlg;
	}
	
	/**
	 * Column Info
	 * @return ydFctyTpMrnTmlFlg
	 */
	public String getYdFctyTpMrnTmlFlg() {
		return this.ydFctyTpMrnTmlFlg;
	}
	
	/**
	 * Column Info
	 * @return ydLoclLangNm
	 */
	public String getYdLoclLangNm() {
		return this.ydLoclLangNm;
	}
	
	/**
	 * Column Info
	 * @return ydRfRcpt440vKnt
	 */
	public String getYdRfRcpt440vKnt() {
		return this.ydRfRcpt440vKnt;
	}
	
	/**
	 * Column Info
	 * @return eirSvcFlg
	 */
	public String getEirSvcFlg() {
		return this.eirSvcFlg;
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
	 * @return tmlChssKnt
	 */
	public String getTmlChssKnt() {
		return this.tmlChssKnt;
	}
	
	/**
	 * Column Info
	 * @return satGateClzHrmnt
	 */
	public String getSatGateClzHrmnt() {
		return this.satGateClzHrmnt;
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
	 * @return frkKnt
	 */
	public String getFrkKnt() {
		return this.frkKnt;
	}
	
	/**
	 * Column Info
	 * @return ydAddr
	 */
	public String getYdAddr() {
		return this.ydAddr;
	}
	
	/**
	 * Column Info
	 * @return ydOpSysCd
	 */
	public String getYdOpSysCd() {
		return this.ydOpSysCd;
	}
	
	/**
	 * Column Info
	 * @return ydCtrlOfcSteCd
	 */
	public String getYdCtrlOfcSteCd() {
		return this.ydCtrlOfcSteCd;
	}
	
	/**
	 * Column Info
	 * @return ydCgoClzHrmntMsg
	 */
	public String getYdCgoClzHrmntMsg() {
		return this.ydCgoClzHrmntMsg;
	}
	
	/**
	 * Column Info
	 * @return ydTrctKnt
	 */
	public String getYdTrctKnt() {
		return this.ydTrctKnt;
	}
	
	/**
	 * Column Info
	 * @return ydRfRcpt220vKnt
	 */
	public String getYdRfRcpt220vKnt() {
		return this.ydRfRcpt220vKnt;
	}
	
	/**
	 * Column Info
	 * @return ydBrthDpthChnlKnt
	 */
	public String getYdBrthDpthChnlKnt() {
		return this.ydBrthDpthChnlKnt;
	}
	
	/**
	 * Column Info
	 * @return demObCltFlg
	 */
	public String getDemObCltFlg() {
		return this.demObCltFlg;
	}
	
	/**
	 * Column Info
	 * @return ydLoclLangAddr
	 */
	public String getYdLoclLangAddr() {
		return this.ydLoclLangAddr;
	}
	
	/**
	 * Column Info
	 * @return dryYdFtHrs
	 */
	public String getDryYdFtHrs() {
		return this.dryYdFtHrs;
	}
	
	/**
	 * Column Info
	 * @return repZnCd
	 */
	public String getRepZnCd() {
		return this.repZnCd;
	}
	
	/**
	 * Column Info
	 * @return ydHjsVolTeuKnt
	 */
	public String getYdHjsVolTeuKnt() {
		return this.ydHjsVolTeuKnt;
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
	 * @return trstrKnt
	 */
	public String getTrstrKnt() {
		return this.trstrKnt;
	}
	
	/**
	 * Column Info
	 * @return n2ndVndrSeq
	 */
	public String getN2ndVndrSeq() {
		return this.n2ndVndrSeq;
	}
	
	/**
	 * Column Info
	 * @return ydPicNm
	 */
	public String getYdPicNm() {
		return this.ydPicNm;
	}
	
	/**
	 * Column Info
	 * @return ydHndlYr
	 */
	public String getYdHndlYr() {
		return this.ydHndlYr;
	}
	
	/**
	 * Column Info
	 * @return rfMinDwllHrs
	 */
	public String getRfMinDwllHrs() {
		return this.rfMinDwllHrs;
	}
	
	/**
	 * Column Info
	 * @return ydCfsSpc
	 */
	public String getYdCfsSpc() {
		return this.ydCfsSpc;
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
	 * @return ydChrCd
	 */
	public String getYdChrCd() {
		return this.ydChrCd;
	}
	
	/**
	 * Column Info
	 * @return ydNm
	 */
	public String getYdNm() {
		return this.ydNm;
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
	 * @return ydLocSteCd
	 */
	public String getYdLocSteCd() {
		return this.ydLocSteCd;
	}
	
	/**
	 * Column Info
	 * @return ydOshpCd
	 */
	public String getYdOshpCd() {
		return this.ydOshpCd;
	}
	
	/**
	 * Column Info
	 * @return hubYdFlg
	 */
	public String getHubYdFlg() {
		return this.hubYdFlg;
	}
	
	/**
	 * Column Info
	 * @return ydRfRcptDulKnt
	 */
	public String getYdRfRcptDulKnt() {
		return this.ydRfRcptDulKnt;
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
	 * @return dryAvgDwllHrs
	 */
	public String getDryAvgDwllHrs() {
		return this.dryAvgDwllHrs;
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
	 * @return ydPgcKnt
	 */
	public String getYdPgcKnt() {
		return this.ydPgcKnt;
	}
	
	/**
	 * Column Info
	 * @return modiYdCd
	 */
	public String getModiYdCd() {
		return this.modiYdCd;
	}
	
	/**
	 * Column Info
	 * @return ydHjsVolBxKnt
	 */
	public String getYdHjsVolBxKnt() {
		return this.ydHjsVolBxKnt;
	}
	
	/**
	 * Column Info
	 * @return n1stVndrSeq
	 */
	public String getN1stVndrSeq() {
		return this.n1stVndrSeq;
	}
	
	/**
	 * Column Info
	 * @return satGateOpnHrmnt
	 */
	public String getSatGateOpnHrmnt() {
		return this.satGateOpnHrmnt;
	}
	
	/**
	 * Column Info
	 * @return n3rdVndrSeq
	 */
	public String getN3rdVndrSeq() {
		return this.n3rdVndrSeq;
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
	 * @return ydCstmsNo
	 */
	public String getYdCstmsNo() {
		return this.ydCstmsNo;
	}
	
	/**
	 * Column Info
	 * @return ydCtrlOfcCtyNm
	 */
	public String getYdCtrlOfcCtyNm() {
		return this.ydCtrlOfcCtyNm;
	}
	
	/**
	 * Column Info
	 * @return ydTtlSpc
	 */
	public String getYdTtlSpc() {
		return this.ydTtlSpc;
	}
	
	/**
	 * Column Info
	 * @return dmdtOfcCd
	 */
	public String getDmdtOfcCd() {
		return this.dmdtOfcCd;
	}
	
	/**
	 * Column Info
	 * @return gateOpnHrmnt
	 */
	public String getGateOpnHrmnt() {
		return this.gateOpnHrmnt;
	}
	
	/**
	 * Column Info
	 * @return dryMinDwllHrs
	 */
	public String getDryMinDwllHrs() {
		return this.dryMinDwllHrs;
	}
	
	/**
	 * Column Info
	 * @return ydHndlCapa
	 */
	public String getYdHndlCapa() {
		return this.ydHndlCapa;
	}
	
	/**
	 * Column Info
	 * @return onfHirYdFlg
	 */
	public String getOnfHirYdFlg() {
		return this.onfHirYdFlg;
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
	 * @return mnrShopFlg
	 */
	public String getMnrShopFlg() {
		return this.mnrShopFlg;
	}
	
	/**
	 * Column Info
	 * @return ydBrthLen
	 */
	public String getYdBrthLen() {
		return this.ydBrthLen;
	}
	
	/**
	 * Column Info
	 * @return ydCtrlOfcAddr
	 */
	public String getYdCtrlOfcAddr() {
		return this.ydCtrlOfcAddr;
	}
	
	/**
	 * Column Info
	 * @return bdYdFlg
	 */
	public String getBdYdFlg() {
		return this.bdYdFlg;
	}
	
	/**
	 * Column Info
	 * @return ydEml
	 */
	public String getYdEml() {
		return this.ydEml;
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
	 * @return bkgPodYdFlg
	 */
	public String getBkgPodYdFlg() {
		return this.bkgPodYdFlg;
	}
	

	/**
	 * Column Info
	 * @param ydActSpc
	 */
	public void setYdActSpc(String ydActSpc) {
		this.ydActSpc = ydActSpc;
	}
	
	/**
	 * Column Info
	 * @param holGateClzHrmnt
	 */
	public void setHolGateClzHrmnt(String holGateClzHrmnt) {
		this.holGateClzHrmnt = holGateClzHrmnt;
	}
	
	/**
	 * Column Info
	 * @param holGateOpnHrmnt
	 */
	public void setHolGateOpnHrmnt(String holGateOpnHrmnt) {
		this.holGateOpnHrmnt = holGateOpnHrmnt;
	}
	
	/**
	 * Column Info
	 * @param ydFctyTpBrgRmpFlg
	 */
	public void setYdFctyTpBrgRmpFlg(String ydFctyTpBrgRmpFlg) {
		this.ydFctyTpBrgRmpFlg = ydFctyTpBrgRmpFlg;
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
	 * @param locCd
	 */
	public void setLocCd(String locCd) {
		this.locCd = locCd;
	}
	
	/**
	 * Column Info
	 * @param ydRmk
	 */
	public void setYdRmk(String ydRmk) {
		this.ydRmk = ydRmk;
	}
	
	/**
	 * Column Info
	 * @param ydTtlVolBxKnt
	 */
	public void setYdTtlVolBxKnt(String ydTtlVolBxKnt) {
		this.ydTtlVolBxKnt = ydTtlVolBxKnt;
	}
	
	/**
	 * Column Info
	 * @param ydCtrlOfcZipCd
	 */
	public void setYdCtrlOfcZipCd(String ydCtrlOfcZipCd) {
		this.ydCtrlOfcZipCd = ydCtrlOfcZipCd;
	}
	
	/**
	 * Column Info
	 * @param brthNo
	 */
	public void setBrthNo(String brthNo) {
		this.brthNo = brthNo;
	}
	
	/**
	 * Column Info
	 * @param n3rdVndrCntCd
	 */
	public void setN3rdVndrCntCd(String n3rdVndrCntCd) {
		this.n3rdVndrCntCd = n3rdVndrCntCd;
	}
	
	/**
	 * Column Info
	 * @param bfrOfcCngDt
	 */
	public void setBfrOfcCngDt(String bfrOfcCngDt) {
		this.bfrOfcCngDt = bfrOfcCngDt;
	}
	
	/**
	 * Column Info
	 * @param ydLocCtyNm
	 */
	public void setYdLocCtyNm(String ydLocCtyNm) {
		this.ydLocCtyNm = ydLocCtyNm;
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
	 * @param ydFctyTpCyFlg
	 */
	public void setYdFctyTpCyFlg(String ydFctyTpCyFlg) {
		this.ydFctyTpCyFlg = ydFctyTpCyFlg;
	}
	
	/**
	 * Column Info
	 * @param sunGateOpnHrmnt
	 */
	public void setSunGateOpnHrmnt(String sunGateOpnHrmnt) {
		this.sunGateOpnHrmnt = sunGateOpnHrmnt;
	}
	
	/**
	 * Column Info
	 * @param ydCeoNm
	 */
	public void setYdCeoNm(String ydCeoNm) {
		this.ydCeoNm = ydCeoNm;
	}
	
	/**
	 * Column Info
	 * @param rfAvgDwllHrs
	 */
	public void setRfAvgDwllHrs(String rfAvgDwllHrs) {
		this.rfAvgDwllHrs = rfAvgDwllHrs;
	}
	
	/**
	 * Column Info
	 * @param rfYdFtHrs
	 */
	public void setRfYdFtHrs(String rfYdFtHrs) {
		this.rfYdFtHrs = rfYdFtHrs;
	}
	
	/**
	 * Column Info
	 * @param tmlProdKnt
	 */
	public void setTmlProdKnt(String tmlProdKnt) {
		this.tmlProdKnt = tmlProdKnt;
	}
	
	/**
	 * Column Info
	 * @param n1stVndrCntCd
	 */
	public void setN1stVndrCntCd(String n1stVndrCntCd) {
		this.n1stVndrCntCd = n1stVndrCntCd;
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
	 * @param n2ndVndrCntCd
	 */
	public void setN2ndVndrCntCd(String n2ndVndrCntCd) {
		this.n2ndVndrCntCd = n2ndVndrCntCd;
	}
	
	/**
	 * Column Info
	 * @param sunGateClzHrmnt
	 */
	public void setSunGateClzHrmnt(String sunGateClzHrmnt) {
		this.sunGateClzHrmnt = sunGateClzHrmnt;
	}
	
	/**
	 * Column Info
	 * @param deltFlg
	 */
	public void setDeltFlg(String deltFlg) {
		this.deltFlg = deltFlg;
	}
	
	/**
	 * Column Info
	 * @param ydStrdlCrrKnt
	 */
	public void setYdStrdlCrrKnt(String ydStrdlCrrKnt) {
		this.ydStrdlCrrKnt = ydStrdlCrrKnt;
	}
	
	/**
	 * Column Info
	 * @param ydFctyTpPsdoYdFlg
	 */
	public void setYdFctyTpPsdoYdFlg(String ydFctyTpPsdoYdFlg) {
		this.ydFctyTpPsdoYdFlg = ydFctyTpPsdoYdFlg;
	}
	
	/**
	 * Column Info
	 * @param repYdTpCd
	 */
	public void setRepYdTpCd(String repYdTpCd) {
		this.repYdTpCd = repYdTpCd;
	}
	
	/**
	 * Column Info
	 * @param ydTopLftKnt
	 */
	public void setYdTopLftKnt(String ydTopLftKnt) {
		this.ydTopLftKnt = ydTopLftKnt;
	}
	
	/**
	 * Column Info
	 * @param ydPstPgcKnt
	 */
	public void setYdPstPgcKnt(String ydPstPgcKnt) {
		this.ydPstPgcKnt = ydPstPgcKnt;
	}
	
	/**
	 * Column Info
	 * @param ydInrlFlg
	 */
	public void setYdInrlFlg(String ydInrlFlg) {
		this.ydInrlFlg = ydInrlFlg;
	}
	
	/**
	 * Column Info
	 * @param ydHjsSpc
	 */
	public void setYdHjsSpc(String ydHjsSpc) {
		this.ydHjsSpc = ydHjsSpc;
	}
	
	/**
	 * Column Info
	 * @param ydFctyTpCfsFlg
	 */
	public void setYdFctyTpCfsFlg(String ydFctyTpCfsFlg) {
		this.ydFctyTpCfsFlg = ydFctyTpCfsFlg;
	}
	
	/**
	 * Column Info
	 * @param ydTtlVolTeuKnt
	 */
	public void setYdTtlVolTeuKnt(String ydTtlVolTeuKnt) {
		this.ydTtlVolTeuKnt = ydTtlVolTeuKnt;
	}
	
	/**
	 * Column Info
	 * @param gateClzHrmnt
	 */
	public void setGateClzHrmnt(String gateClzHrmnt) {
		this.gateClzHrmnt = gateClzHrmnt;
	}
	
	/**
	 * Column Info
	 * @param demIbCltFlg
	 */
	public void setDemIbCltFlg(String demIbCltFlg) {
		this.demIbCltFlg = demIbCltFlg;
	}
	
	/**
	 * Column Info
	 * @param bfrOfcCd
	 */
	public void setBfrOfcCd(String bfrOfcCd) {
		this.bfrOfcCd = bfrOfcCd;
	}
	
	/**
	 * Column Info
	 * @param ydBrthAlngSdDesc
	 */
	public void setYdBrthAlngSdDesc(String ydBrthAlngSdDesc) {
		this.ydBrthAlngSdDesc = ydBrthAlngSdDesc;
	}
	
	/**
	 * Column Info
	 * @param ydFctyTpRailRmpFlg
	 */
	public void setYdFctyTpRailRmpFlg(String ydFctyTpRailRmpFlg) {
		this.ydFctyTpRailRmpFlg = ydFctyTpRailRmpFlg;
	}
	
	/**
	 * Column Info
	 * @param ydFctyTpMrnTmlFlg
	 */
	public void setYdFctyTpMrnTmlFlg(String ydFctyTpMrnTmlFlg) {
		this.ydFctyTpMrnTmlFlg = ydFctyTpMrnTmlFlg;
	}
	
	/**
	 * Column Info
	 * @param ydLoclLangNm
	 */
	public void setYdLoclLangNm(String ydLoclLangNm) {
		this.ydLoclLangNm = ydLoclLangNm;
	}
	
	/**
	 * Column Info
	 * @param ydRfRcpt440vKnt
	 */
	public void setYdRfRcpt440vKnt(String ydRfRcpt440vKnt) {
		this.ydRfRcpt440vKnt = ydRfRcpt440vKnt;
	}
	
	/**
	 * Column Info
	 * @param eirSvcFlg
	 */
	public void setEirSvcFlg(String eirSvcFlg) {
		this.eirSvcFlg = eirSvcFlg;
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
	 * @param tmlChssKnt
	 */
	public void setTmlChssKnt(String tmlChssKnt) {
		this.tmlChssKnt = tmlChssKnt;
	}
	
	/**
	 * Column Info
	 * @param satGateClzHrmnt
	 */
	public void setSatGateClzHrmnt(String satGateClzHrmnt) {
		this.satGateClzHrmnt = satGateClzHrmnt;
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
	 * @param frkKnt
	 */
	public void setFrkKnt(String frkKnt) {
		this.frkKnt = frkKnt;
	}
	
	/**
	 * Column Info
	 * @param ydAddr
	 */
	public void setYdAddr(String ydAddr) {
		this.ydAddr = ydAddr;
	}
	
	/**
	 * Column Info
	 * @param ydOpSysCd
	 */
	public void setYdOpSysCd(String ydOpSysCd) {
		this.ydOpSysCd = ydOpSysCd;
	}
	
	/**
	 * Column Info
	 * @param ydCtrlOfcSteCd
	 */
	public void setYdCtrlOfcSteCd(String ydCtrlOfcSteCd) {
		this.ydCtrlOfcSteCd = ydCtrlOfcSteCd;
	}
	
	/**
	 * Column Info
	 * @param ydCgoClzHrmntMsg
	 */
	public void setYdCgoClzHrmntMsg(String ydCgoClzHrmntMsg) {
		this.ydCgoClzHrmntMsg = ydCgoClzHrmntMsg;
	}
	
	/**
	 * Column Info
	 * @param ydTrctKnt
	 */
	public void setYdTrctKnt(String ydTrctKnt) {
		this.ydTrctKnt = ydTrctKnt;
	}
	
	/**
	 * Column Info
	 * @param ydRfRcpt220vKnt
	 */
	public void setYdRfRcpt220vKnt(String ydRfRcpt220vKnt) {
		this.ydRfRcpt220vKnt = ydRfRcpt220vKnt;
	}
	
	/**
	 * Column Info
	 * @param ydBrthDpthChnlKnt
	 */
	public void setYdBrthDpthChnlKnt(String ydBrthDpthChnlKnt) {
		this.ydBrthDpthChnlKnt = ydBrthDpthChnlKnt;
	}
	
	/**
	 * Column Info
	 * @param demObCltFlg
	 */
	public void setDemObCltFlg(String demObCltFlg) {
		this.demObCltFlg = demObCltFlg;
	}
	
	/**
	 * Column Info
	 * @param ydLoclLangAddr
	 */
	public void setYdLoclLangAddr(String ydLoclLangAddr) {
		this.ydLoclLangAddr = ydLoclLangAddr;
	}
	
	/**
	 * Column Info
	 * @param dryYdFtHrs
	 */
	public void setDryYdFtHrs(String dryYdFtHrs) {
		this.dryYdFtHrs = dryYdFtHrs;
	}
	
	/**
	 * Column Info
	 * @param repZnCd
	 */
	public void setRepZnCd(String repZnCd) {
		this.repZnCd = repZnCd;
	}
	
	/**
	 * Column Info
	 * @param ydHjsVolTeuKnt
	 */
	public void setYdHjsVolTeuKnt(String ydHjsVolTeuKnt) {
		this.ydHjsVolTeuKnt = ydHjsVolTeuKnt;
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
	 * @param trstrKnt
	 */
	public void setTrstrKnt(String trstrKnt) {
		this.trstrKnt = trstrKnt;
	}
	
	/**
	 * Column Info
	 * @param n2ndVndrSeq
	 */
	public void setN2ndVndrSeq(String n2ndVndrSeq) {
		this.n2ndVndrSeq = n2ndVndrSeq;
	}
	
	/**
	 * Column Info
	 * @param ydPicNm
	 */
	public void setYdPicNm(String ydPicNm) {
		this.ydPicNm = ydPicNm;
	}
	
	/**
	 * Column Info
	 * @param ydHndlYr
	 */
	public void setYdHndlYr(String ydHndlYr) {
		this.ydHndlYr = ydHndlYr;
	}
	
	/**
	 * Column Info
	 * @param rfMinDwllHrs
	 */
	public void setRfMinDwllHrs(String rfMinDwllHrs) {
		this.rfMinDwllHrs = rfMinDwllHrs;
	}
	
	/**
	 * Column Info
	 * @param ydCfsSpc
	 */
	public void setYdCfsSpc(String ydCfsSpc) {
		this.ydCfsSpc = ydCfsSpc;
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
	 * @param ydChrCd
	 */
	public void setYdChrCd(String ydChrCd) {
		this.ydChrCd = ydChrCd;
	}
	
	/**
	 * Column Info
	 * @param ydNm
	 */
	public void setYdNm(String ydNm) {
		this.ydNm = ydNm;
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
	 * @param ydLocSteCd
	 */
	public void setYdLocSteCd(String ydLocSteCd) {
		this.ydLocSteCd = ydLocSteCd;
	}
	
	/**
	 * Column Info
	 * @param ydOshpCd
	 */
	public void setYdOshpCd(String ydOshpCd) {
		this.ydOshpCd = ydOshpCd;
	}
	
	/**
	 * Column Info
	 * @param hubYdFlg
	 */
	public void setHubYdFlg(String hubYdFlg) {
		this.hubYdFlg = hubYdFlg;
	}
	
	/**
	 * Column Info
	 * @param ydRfRcptDulKnt
	 */
	public void setYdRfRcptDulKnt(String ydRfRcptDulKnt) {
		this.ydRfRcptDulKnt = ydRfRcptDulKnt;
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
	 * @param dryAvgDwllHrs
	 */
	public void setDryAvgDwllHrs(String dryAvgDwllHrs) {
		this.dryAvgDwllHrs = dryAvgDwllHrs;
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
	 * @param ydPgcKnt
	 */
	public void setYdPgcKnt(String ydPgcKnt) {
		this.ydPgcKnt = ydPgcKnt;
	}
	
	/**
	 * Column Info
	 * @param modiYdCd
	 */
	public void setModiYdCd(String modiYdCd) {
		this.modiYdCd = modiYdCd;
	}
	
	/**
	 * Column Info
	 * @param ydHjsVolBxKnt
	 */
	public void setYdHjsVolBxKnt(String ydHjsVolBxKnt) {
		this.ydHjsVolBxKnt = ydHjsVolBxKnt;
	}
	
	/**
	 * Column Info
	 * @param n1stVndrSeq
	 */
	public void setN1stVndrSeq(String n1stVndrSeq) {
		this.n1stVndrSeq = n1stVndrSeq;
	}
	
	/**
	 * Column Info
	 * @param satGateOpnHrmnt
	 */
	public void setSatGateOpnHrmnt(String satGateOpnHrmnt) {
		this.satGateOpnHrmnt = satGateOpnHrmnt;
	}
	
	/**
	 * Column Info
	 * @param n3rdVndrSeq
	 */
	public void setN3rdVndrSeq(String n3rdVndrSeq) {
		this.n3rdVndrSeq = n3rdVndrSeq;
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
	 * @param ydCstmsNo
	 */
	public void setYdCstmsNo(String ydCstmsNo) {
		this.ydCstmsNo = ydCstmsNo;
	}
	
	/**
	 * Column Info
	 * @param ydCtrlOfcCtyNm
	 */
	public void setYdCtrlOfcCtyNm(String ydCtrlOfcCtyNm) {
		this.ydCtrlOfcCtyNm = ydCtrlOfcCtyNm;
	}
	
	/**
	 * Column Info
	 * @param ydTtlSpc
	 */
	public void setYdTtlSpc(String ydTtlSpc) {
		this.ydTtlSpc = ydTtlSpc;
	}
	
	/**
	 * Column Info
	 * @param dmdtOfcCd
	 */
	public void setDmdtOfcCd(String dmdtOfcCd) {
		this.dmdtOfcCd = dmdtOfcCd;
	}
	
	/**
	 * Column Info
	 * @param gateOpnHrmnt
	 */
	public void setGateOpnHrmnt(String gateOpnHrmnt) {
		this.gateOpnHrmnt = gateOpnHrmnt;
	}
	
	/**
	 * Column Info
	 * @param dryMinDwllHrs
	 */
	public void setDryMinDwllHrs(String dryMinDwllHrs) {
		this.dryMinDwllHrs = dryMinDwllHrs;
	}
	
	/**
	 * Column Info
	 * @param ydHndlCapa
	 */
	public void setYdHndlCapa(String ydHndlCapa) {
		this.ydHndlCapa = ydHndlCapa;
	}
	
	/**
	 * Column Info
	 * @param onfHirYdFlg
	 */
	public void setOnfHirYdFlg(String onfHirYdFlg) {
		this.onfHirYdFlg = onfHirYdFlg;
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
	 * @param mnrShopFlg
	 */
	public void setMnrShopFlg(String mnrShopFlg) {
		this.mnrShopFlg = mnrShopFlg;
	}
	
	/**
	 * Column Info
	 * @param ydBrthLen
	 */
	public void setYdBrthLen(String ydBrthLen) {
		this.ydBrthLen = ydBrthLen;
	}
	
	/**
	 * Column Info
	 * @param ydCtrlOfcAddr
	 */
	public void setYdCtrlOfcAddr(String ydCtrlOfcAddr) {
		this.ydCtrlOfcAddr = ydCtrlOfcAddr;
	}
	
	/**
	 * Column Info
	 * @param bdYdFlg
	 */
	public void setBdYdFlg(String bdYdFlg) {
		this.bdYdFlg = bdYdFlg;
	}
	
	/**
	 * Column Info
	 * @param ydEml
	 */
	public void setYdEml(String ydEml) {
		this.ydEml = ydEml;
	}
	
	/**
	 * Column Info
	 * @param intlPhnNo
	 */
	public void setIntlPhnNo(String intlPhnNo) {
		this.intlPhnNo = intlPhnNo;
	}
	
	/**
	 * Column Info
	 * @param bkgPodYdFlg
	 */
	public void setBkgPodYdFlg(String bkgPodYdFlg) {
		this.bkgPodYdFlg = bkgPodYdFlg;
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
		setYdActSpc(JSPUtil.getParameter(request, prefix + "yd_act_spc", ""));
		setHolGateClzHrmnt(JSPUtil.getParameter(request, prefix + "hol_gate_clz_hrmnt", ""));
		setHolGateOpnHrmnt(JSPUtil.getParameter(request, prefix + "hol_gate_opn_hrmnt", ""));
		setYdFctyTpBrgRmpFlg(JSPUtil.getParameter(request, prefix + "yd_fcty_tp_brg_rmp_flg", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setLocCd(JSPUtil.getParameter(request, prefix + "loc_cd", ""));
		setYdRmk(JSPUtil.getParameter(request, prefix + "yd_rmk", ""));
		setYdTtlVolBxKnt(JSPUtil.getParameter(request, prefix + "yd_ttl_vol_bx_knt", ""));
		setYdCtrlOfcZipCd(JSPUtil.getParameter(request, prefix + "yd_ctrl_ofc_zip_cd", ""));
		setBrthNo(JSPUtil.getParameter(request, prefix + "brth_no", ""));
		setN3rdVndrCntCd(JSPUtil.getParameter(request, prefix + "n3rd_vndr_cnt_cd", ""));
		setBfrOfcCngDt(JSPUtil.getParameter(request, prefix + "bfr_ofc_cng_dt", ""));
		setYdLocCtyNm(JSPUtil.getParameter(request, prefix + "yd_loc_cty_nm", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setYdFctyTpCyFlg(JSPUtil.getParameter(request, prefix + "yd_fcty_tp_cy_flg", ""));
		setSunGateOpnHrmnt(JSPUtil.getParameter(request, prefix + "sun_gate_opn_hrmnt", ""));
		setYdCeoNm(JSPUtil.getParameter(request, prefix + "yd_ceo_nm", ""));
		setRfAvgDwllHrs(JSPUtil.getParameter(request, prefix + "rf_avg_dwll_hrs", ""));
		setRfYdFtHrs(JSPUtil.getParameter(request, prefix + "rf_yd_ft_hrs", ""));
		setTmlProdKnt(JSPUtil.getParameter(request, prefix + "tml_prod_knt", ""));
		setN1stVndrCntCd(JSPUtil.getParameter(request, prefix + "n1st_vndr_cnt_cd", ""));
		setZipCd(JSPUtil.getParameter(request, prefix + "zip_cd", ""));
		setN2ndVndrCntCd(JSPUtil.getParameter(request, prefix + "n2nd_vndr_cnt_cd", ""));
		setSunGateClzHrmnt(JSPUtil.getParameter(request, prefix + "sun_gate_clz_hrmnt", ""));
		setDeltFlg(JSPUtil.getParameter(request, prefix + "delt_flg", ""));
		setYdStrdlCrrKnt(JSPUtil.getParameter(request, prefix + "yd_strdl_crr_knt", ""));
		setYdFctyTpPsdoYdFlg(JSPUtil.getParameter(request, prefix + "yd_fcty_tp_psdo_yd_flg", ""));
		setRepYdTpCd(JSPUtil.getParameter(request, prefix + "rep_yd_tp_cd", ""));
		setYdTopLftKnt(JSPUtil.getParameter(request, prefix + "yd_top_lft_knt", ""));
		setYdPstPgcKnt(JSPUtil.getParameter(request, prefix + "yd_pst_pgc_knt", ""));
		setYdInrlFlg(JSPUtil.getParameter(request, prefix + "yd_inrl_flg", ""));
		setYdHjsSpc(JSPUtil.getParameter(request, prefix + "yd_hjs_spc", ""));
		setYdFctyTpCfsFlg(JSPUtil.getParameter(request, prefix + "yd_fcty_tp_cfs_flg", ""));
		setYdTtlVolTeuKnt(JSPUtil.getParameter(request, prefix + "yd_ttl_vol_teu_knt", ""));
		setGateClzHrmnt(JSPUtil.getParameter(request, prefix + "gate_clz_hrmnt", ""));
		setDemIbCltFlg(JSPUtil.getParameter(request, prefix + "dem_ib_clt_flg", ""));
		setBfrOfcCd(JSPUtil.getParameter(request, prefix + "bfr_ofc_cd", ""));
		setYdBrthAlngSdDesc(JSPUtil.getParameter(request, prefix + "yd_brth_alng_sd_desc", ""));
		setYdFctyTpRailRmpFlg(JSPUtil.getParameter(request, prefix + "yd_fcty_tp_rail_rmp_flg", ""));
		setYdFctyTpMrnTmlFlg(JSPUtil.getParameter(request, prefix + "yd_fcty_tp_mrn_tml_flg", ""));
		setYdLoclLangNm(JSPUtil.getParameter(request, prefix + "yd_locl_lang_nm", ""));
		setYdRfRcpt440vKnt(JSPUtil.getParameter(request, prefix + "yd_rf_rcpt_440v_knt", ""));
		setEirSvcFlg(JSPUtil.getParameter(request, prefix + "eir_svc_flg", ""));
		setOfcCd(JSPUtil.getParameter(request, prefix + "ofc_cd", ""));
		setTmlChssKnt(JSPUtil.getParameter(request, prefix + "tml_chss_knt", ""));
		setSatGateClzHrmnt(JSPUtil.getParameter(request, prefix + "sat_gate_clz_hrmnt", ""));
		setYdCd(JSPUtil.getParameter(request, prefix + "yd_cd", ""));
		setFrkKnt(JSPUtil.getParameter(request, prefix + "frk_knt", ""));
		setYdAddr(JSPUtil.getParameter(request, prefix + "yd_addr", ""));
		setYdOpSysCd(JSPUtil.getParameter(request, prefix + "yd_op_sys_cd", ""));
		setYdCtrlOfcSteCd(JSPUtil.getParameter(request, prefix + "yd_ctrl_ofc_ste_cd", ""));
		setYdCgoClzHrmntMsg(JSPUtil.getParameter(request, prefix + "yd_cgo_clz_hrmnt_msg", ""));
		setYdTrctKnt(JSPUtil.getParameter(request, prefix + "yd_trct_knt", ""));
		setYdRfRcpt220vKnt(JSPUtil.getParameter(request, prefix + "yd_rf_rcpt_220v_knt", ""));
		setYdBrthDpthChnlKnt(JSPUtil.getParameter(request, prefix + "yd_brth_dpth_chnl_knt", ""));
		setDemObCltFlg(JSPUtil.getParameter(request, prefix + "dem_ob_clt_flg", ""));
		setYdLoclLangAddr(JSPUtil.getParameter(request, prefix + "yd_locl_lang_addr", ""));
		setDryYdFtHrs(JSPUtil.getParameter(request, prefix + "dry_yd_ft_hrs", ""));
		setRepZnCd(JSPUtil.getParameter(request, prefix + "rep_zn_cd", ""));
		setYdHjsVolTeuKnt(JSPUtil.getParameter(request, prefix + "yd_hjs_vol_teu_knt", ""));
		setPhnNo(JSPUtil.getParameter(request, prefix + "phn_no", ""));
		setTrstrKnt(JSPUtil.getParameter(request, prefix + "trstr_knt", ""));
		setN2ndVndrSeq(JSPUtil.getParameter(request, prefix + "n2nd_vndr_seq", ""));
		setYdPicNm(JSPUtil.getParameter(request, prefix + "yd_pic_nm", ""));
		setYdHndlYr(JSPUtil.getParameter(request, prefix + "yd_hndl_yr", ""));
		setRfMinDwllHrs(JSPUtil.getParameter(request, prefix + "rf_min_dwll_hrs", ""));
		setYdCfsSpc(JSPUtil.getParameter(request, prefix + "yd_cfs_spc", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setYdChrCd(JSPUtil.getParameter(request, prefix + "yd_chr_cd", ""));
		setYdNm(JSPUtil.getParameter(request, prefix + "yd_nm", ""));
		setFaxNo(JSPUtil.getParameter(request, prefix + "fax_no", ""));
		setYdLocSteCd(JSPUtil.getParameter(request, prefix + "yd_loc_ste_cd", ""));
		setYdOshpCd(JSPUtil.getParameter(request, prefix + "yd_oshp_cd", ""));
		setHubYdFlg(JSPUtil.getParameter(request, prefix + "hub_yd_flg", ""));
		setYdRfRcptDulKnt(JSPUtil.getParameter(request, prefix + "yd_rf_rcpt_dul_knt", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setDryAvgDwllHrs(JSPUtil.getParameter(request, prefix + "dry_avg_dwll_hrs", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setYdPgcKnt(JSPUtil.getParameter(request, prefix + "yd_pgc_knt", ""));
		setModiYdCd(JSPUtil.getParameter(request, prefix + "modi_yd_cd", ""));
		setYdHjsVolBxKnt(JSPUtil.getParameter(request, prefix + "yd_hjs_vol_bx_knt", ""));
		setN1stVndrSeq(JSPUtil.getParameter(request, prefix + "n1st_vndr_seq", ""));
		setSatGateOpnHrmnt(JSPUtil.getParameter(request, prefix + "sat_gate_opn_hrmnt", ""));
		setN3rdVndrSeq(JSPUtil.getParameter(request, prefix + "n3rd_vndr_seq", ""));
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setYdCstmsNo(JSPUtil.getParameter(request, prefix + "yd_cstms_no", ""));
		setYdCtrlOfcCtyNm(JSPUtil.getParameter(request, prefix + "yd_ctrl_ofc_cty_nm", ""));
		setYdTtlSpc(JSPUtil.getParameter(request, prefix + "yd_ttl_spc", ""));
		setDmdtOfcCd(JSPUtil.getParameter(request, prefix + "dmdt_ofc_cd", ""));
		setGateOpnHrmnt(JSPUtil.getParameter(request, prefix + "gate_opn_hrmnt", ""));
		setDryMinDwllHrs(JSPUtil.getParameter(request, prefix + "dry_min_dwll_hrs", ""));
		setYdHndlCapa(JSPUtil.getParameter(request, prefix + "yd_hndl_capa", ""));
		setOnfHirYdFlg(JSPUtil.getParameter(request, prefix + "onf_hir_yd_flg", ""));
		setEaiEvntDt(JSPUtil.getParameter(request, prefix + "eai_evnt_dt", ""));
		setMnrShopFlg(JSPUtil.getParameter(request, prefix + "mnr_shop_flg", ""));
		setYdBrthLen(JSPUtil.getParameter(request, prefix + "yd_brth_len", ""));
		setYdCtrlOfcAddr(JSPUtil.getParameter(request, prefix + "yd_ctrl_ofc_addr", ""));
		setBdYdFlg(JSPUtil.getParameter(request, prefix + "bd_yd_flg", ""));
		setYdEml(JSPUtil.getParameter(request, prefix + "yd_eml", ""));
		setIntlPhnNo(JSPUtil.getParameter(request, prefix + "intl_phn_no", ""));
		setBkgPodYdFlg(JSPUtil.getParameter(request, prefix + "bkg_pod_yd_flg", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return MdmYardVO[]
	 */
	public MdmYardVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return MdmYardVO[]
	 */
	public MdmYardVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		MdmYardVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] ydActSpc = (JSPUtil.getParameter(request, prefix	+ "yd_act_spc", length));
			String[] holGateClzHrmnt = (JSPUtil.getParameter(request, prefix	+ "hol_gate_clz_hrmnt", length));
			String[] holGateOpnHrmnt = (JSPUtil.getParameter(request, prefix	+ "hol_gate_opn_hrmnt", length));
			String[] ydFctyTpBrgRmpFlg = (JSPUtil.getParameter(request, prefix	+ "yd_fcty_tp_brg_rmp_flg", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] locCd = (JSPUtil.getParameter(request, prefix	+ "loc_cd", length));
			String[] ydRmk = (JSPUtil.getParameter(request, prefix	+ "yd_rmk", length));
			String[] ydTtlVolBxKnt = (JSPUtil.getParameter(request, prefix	+ "yd_ttl_vol_bx_knt", length));
			String[] ydCtrlOfcZipCd = (JSPUtil.getParameter(request, prefix	+ "yd_ctrl_ofc_zip_cd", length));
			String[] brthNo = (JSPUtil.getParameter(request, prefix	+ "brth_no", length));
			String[] n3rdVndrCntCd = (JSPUtil.getParameter(request, prefix	+ "n3rd_vndr_cnt_cd", length));
			String[] bfrOfcCngDt = (JSPUtil.getParameter(request, prefix	+ "bfr_ofc_cng_dt", length));
			String[] ydLocCtyNm = (JSPUtil.getParameter(request, prefix	+ "yd_loc_cty_nm", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] ydFctyTpCyFlg = (JSPUtil.getParameter(request, prefix	+ "yd_fcty_tp_cy_flg", length));
			String[] sunGateOpnHrmnt = (JSPUtil.getParameter(request, prefix	+ "sun_gate_opn_hrmnt", length));
			String[] ydCeoNm = (JSPUtil.getParameter(request, prefix	+ "yd_ceo_nm", length));
			String[] rfAvgDwllHrs = (JSPUtil.getParameter(request, prefix	+ "rf_avg_dwll_hrs", length));
			String[] rfYdFtHrs = (JSPUtil.getParameter(request, prefix	+ "rf_yd_ft_hrs", length));
			String[] tmlProdKnt = (JSPUtil.getParameter(request, prefix	+ "tml_prod_knt", length));
			String[] n1stVndrCntCd = (JSPUtil.getParameter(request, prefix	+ "n1st_vndr_cnt_cd", length));
			String[] zipCd = (JSPUtil.getParameter(request, prefix	+ "zip_cd", length));
			String[] n2ndVndrCntCd = (JSPUtil.getParameter(request, prefix	+ "n2nd_vndr_cnt_cd", length));
			String[] sunGateClzHrmnt = (JSPUtil.getParameter(request, prefix	+ "sun_gate_clz_hrmnt", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] ydStrdlCrrKnt = (JSPUtil.getParameter(request, prefix	+ "yd_strdl_crr_knt", length));
			String[] ydFctyTpPsdoYdFlg = (JSPUtil.getParameter(request, prefix	+ "yd_fcty_tp_psdo_yd_flg", length));
			String[] repYdTpCd = (JSPUtil.getParameter(request, prefix	+ "rep_yd_tp_cd", length));
			String[] ydTopLftKnt = (JSPUtil.getParameter(request, prefix	+ "yd_top_lft_knt", length));
			String[] ydPstPgcKnt = (JSPUtil.getParameter(request, prefix	+ "yd_pst_pgc_knt", length));
			String[] ydInrlFlg = (JSPUtil.getParameter(request, prefix	+ "yd_inrl_flg", length));
			String[] ydHjsSpc = (JSPUtil.getParameter(request, prefix	+ "yd_hjs_spc", length));
			String[] ydFctyTpCfsFlg = (JSPUtil.getParameter(request, prefix	+ "yd_fcty_tp_cfs_flg", length));
			String[] ydTtlVolTeuKnt = (JSPUtil.getParameter(request, prefix	+ "yd_ttl_vol_teu_knt", length));
			String[] gateClzHrmnt = (JSPUtil.getParameter(request, prefix	+ "gate_clz_hrmnt", length));
			String[] demIbCltFlg = (JSPUtil.getParameter(request, prefix	+ "dem_ib_clt_flg", length));
			String[] bfrOfcCd = (JSPUtil.getParameter(request, prefix	+ "bfr_ofc_cd", length));
			String[] ydBrthAlngSdDesc = (JSPUtil.getParameter(request, prefix	+ "yd_brth_alng_sd_desc", length));
			String[] ydFctyTpRailRmpFlg = (JSPUtil.getParameter(request, prefix	+ "yd_fcty_tp_rail_rmp_flg", length));
			String[] ydFctyTpMrnTmlFlg = (JSPUtil.getParameter(request, prefix	+ "yd_fcty_tp_mrn_tml_flg", length));
			String[] ydLoclLangNm = (JSPUtil.getParameter(request, prefix	+ "yd_locl_lang_nm", length));
			String[] ydRfRcpt440vKnt = (JSPUtil.getParameter(request, prefix	+ "yd_rf_rcpt_440v_knt", length));
			String[] eirSvcFlg = (JSPUtil.getParameter(request, prefix	+ "eir_svc_flg", length));
			String[] ofcCd = (JSPUtil.getParameter(request, prefix	+ "ofc_cd", length));
			String[] tmlChssKnt = (JSPUtil.getParameter(request, prefix	+ "tml_chss_knt", length));
			String[] satGateClzHrmnt = (JSPUtil.getParameter(request, prefix	+ "sat_gate_clz_hrmnt", length));
			String[] ydCd = (JSPUtil.getParameter(request, prefix	+ "yd_cd", length));
			String[] frkKnt = (JSPUtil.getParameter(request, prefix	+ "frk_knt", length));
			String[] ydAddr = (JSPUtil.getParameter(request, prefix	+ "yd_addr", length));
			String[] ydOpSysCd = (JSPUtil.getParameter(request, prefix	+ "yd_op_sys_cd", length));
			String[] ydCtrlOfcSteCd = (JSPUtil.getParameter(request, prefix	+ "yd_ctrl_ofc_ste_cd", length));
			String[] ydCgoClzHrmntMsg = (JSPUtil.getParameter(request, prefix	+ "yd_cgo_clz_hrmnt_msg", length));
			String[] ydTrctKnt = (JSPUtil.getParameter(request, prefix	+ "yd_trct_knt", length));
			String[] ydRfRcpt220vKnt = (JSPUtil.getParameter(request, prefix	+ "yd_rf_rcpt_220v_knt", length));
			String[] ydBrthDpthChnlKnt = (JSPUtil.getParameter(request, prefix	+ "yd_brth_dpth_chnl_knt", length));
			String[] demObCltFlg = (JSPUtil.getParameter(request, prefix	+ "dem_ob_clt_flg", length));
			String[] ydLoclLangAddr = (JSPUtil.getParameter(request, prefix	+ "yd_locl_lang_addr", length));
			String[] dryYdFtHrs = (JSPUtil.getParameter(request, prefix	+ "dry_yd_ft_hrs", length));
			String[] repZnCd = (JSPUtil.getParameter(request, prefix	+ "rep_zn_cd", length));
			String[] ydHjsVolTeuKnt = (JSPUtil.getParameter(request, prefix	+ "yd_hjs_vol_teu_knt", length));
			String[] phnNo = (JSPUtil.getParameter(request, prefix	+ "phn_no", length));
			String[] trstrKnt = (JSPUtil.getParameter(request, prefix	+ "trstr_knt", length));
			String[] n2ndVndrSeq = (JSPUtil.getParameter(request, prefix	+ "n2nd_vndr_seq", length));
			String[] ydPicNm = (JSPUtil.getParameter(request, prefix	+ "yd_pic_nm", length));
			String[] ydHndlYr = (JSPUtil.getParameter(request, prefix	+ "yd_hndl_yr", length));
			String[] rfMinDwllHrs = (JSPUtil.getParameter(request, prefix	+ "rf_min_dwll_hrs", length));
			String[] ydCfsSpc = (JSPUtil.getParameter(request, prefix	+ "yd_cfs_spc", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ydChrCd = (JSPUtil.getParameter(request, prefix	+ "yd_chr_cd", length));
			String[] ydNm = (JSPUtil.getParameter(request, prefix	+ "yd_nm", length));
			String[] faxNo = (JSPUtil.getParameter(request, prefix	+ "fax_no", length));
			String[] ydLocSteCd = (JSPUtil.getParameter(request, prefix	+ "yd_loc_ste_cd", length));
			String[] ydOshpCd = (JSPUtil.getParameter(request, prefix	+ "yd_oshp_cd", length));
			String[] hubYdFlg = (JSPUtil.getParameter(request, prefix	+ "hub_yd_flg", length));
			String[] ydRfRcptDulKnt = (JSPUtil.getParameter(request, prefix	+ "yd_rf_rcpt_dul_knt", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] dryAvgDwllHrs = (JSPUtil.getParameter(request, prefix	+ "dry_avg_dwll_hrs", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] ydPgcKnt = (JSPUtil.getParameter(request, prefix	+ "yd_pgc_knt", length));
			String[] modiYdCd = (JSPUtil.getParameter(request, prefix	+ "modi_yd_cd", length));
			String[] ydHjsVolBxKnt = (JSPUtil.getParameter(request, prefix	+ "yd_hjs_vol_bx_knt", length));
			String[] n1stVndrSeq = (JSPUtil.getParameter(request, prefix	+ "n1st_vndr_seq", length));
			String[] satGateOpnHrmnt = (JSPUtil.getParameter(request, prefix	+ "sat_gate_opn_hrmnt", length));
			String[] n3rdVndrSeq = (JSPUtil.getParameter(request, prefix	+ "n3rd_vndr_seq", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] ydCstmsNo = (JSPUtil.getParameter(request, prefix	+ "yd_cstms_no", length));
			String[] ydCtrlOfcCtyNm = (JSPUtil.getParameter(request, prefix	+ "yd_ctrl_ofc_cty_nm", length));
			String[] ydTtlSpc = (JSPUtil.getParameter(request, prefix	+ "yd_ttl_spc", length));
			String[] dmdtOfcCd = (JSPUtil.getParameter(request, prefix	+ "dmdt_ofc_cd", length));
			String[] gateOpnHrmnt = (JSPUtil.getParameter(request, prefix	+ "gate_opn_hrmnt", length));
			String[] dryMinDwllHrs = (JSPUtil.getParameter(request, prefix	+ "dry_min_dwll_hrs", length));
			String[] ydHndlCapa = (JSPUtil.getParameter(request, prefix	+ "yd_hndl_capa", length));
			String[] onfHirYdFlg = (JSPUtil.getParameter(request, prefix	+ "onf_hir_yd_flg", length));
			String[] eaiEvntDt = (JSPUtil.getParameter(request, prefix	+ "eai_evnt_dt", length));
			String[] mnrShopFlg = (JSPUtil.getParameter(request, prefix	+ "mnr_shop_flg", length));
			String[] ydBrthLen = (JSPUtil.getParameter(request, prefix	+ "yd_brth_len", length));
			String[] ydCtrlOfcAddr = (JSPUtil.getParameter(request, prefix	+ "yd_ctrl_ofc_addr", length));
			String[] bdYdFlg = (JSPUtil.getParameter(request, prefix	+ "bd_yd_flg", length));
			String[] ydEml = (JSPUtil.getParameter(request, prefix	+ "yd_eml", length));
			String[] intlPhnNo = (JSPUtil.getParameter(request, prefix	+ "intl_phn_no", length));
			String[] bkgPodYdFlg = (JSPUtil.getParameter(request, prefix	+ "bkg_pod_yd_flg", length));
			
			for (int i = 0; i < length; i++) {
				model = new MdmYardVO();
				if (ydActSpc[i] != null)
					model.setYdActSpc(ydActSpc[i]);
				if (holGateClzHrmnt[i] != null)
					model.setHolGateClzHrmnt(holGateClzHrmnt[i]);
				if (holGateOpnHrmnt[i] != null)
					model.setHolGateOpnHrmnt(holGateOpnHrmnt[i]);
				if (ydFctyTpBrgRmpFlg[i] != null)
					model.setYdFctyTpBrgRmpFlg(ydFctyTpBrgRmpFlg[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (locCd[i] != null)
					model.setLocCd(locCd[i]);
				if (ydRmk[i] != null)
					model.setYdRmk(ydRmk[i]);
				if (ydTtlVolBxKnt[i] != null)
					model.setYdTtlVolBxKnt(ydTtlVolBxKnt[i]);
				if (ydCtrlOfcZipCd[i] != null)
					model.setYdCtrlOfcZipCd(ydCtrlOfcZipCd[i]);
				if (brthNo[i] != null)
					model.setBrthNo(brthNo[i]);
				if (n3rdVndrCntCd[i] != null)
					model.setN3rdVndrCntCd(n3rdVndrCntCd[i]);
				if (bfrOfcCngDt[i] != null)
					model.setBfrOfcCngDt(bfrOfcCngDt[i]);
				if (ydLocCtyNm[i] != null)
					model.setYdLocCtyNm(ydLocCtyNm[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (ydFctyTpCyFlg[i] != null)
					model.setYdFctyTpCyFlg(ydFctyTpCyFlg[i]);
				if (sunGateOpnHrmnt[i] != null)
					model.setSunGateOpnHrmnt(sunGateOpnHrmnt[i]);
				if (ydCeoNm[i] != null)
					model.setYdCeoNm(ydCeoNm[i]);
				if (rfAvgDwllHrs[i] != null)
					model.setRfAvgDwllHrs(rfAvgDwllHrs[i]);
				if (rfYdFtHrs[i] != null)
					model.setRfYdFtHrs(rfYdFtHrs[i]);
				if (tmlProdKnt[i] != null)
					model.setTmlProdKnt(tmlProdKnt[i]);
				if (n1stVndrCntCd[i] != null)
					model.setN1stVndrCntCd(n1stVndrCntCd[i]);
				if (zipCd[i] != null)
					model.setZipCd(zipCd[i]);
				if (n2ndVndrCntCd[i] != null)
					model.setN2ndVndrCntCd(n2ndVndrCntCd[i]);
				if (sunGateClzHrmnt[i] != null)
					model.setSunGateClzHrmnt(sunGateClzHrmnt[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (ydStrdlCrrKnt[i] != null)
					model.setYdStrdlCrrKnt(ydStrdlCrrKnt[i]);
				if (ydFctyTpPsdoYdFlg[i] != null)
					model.setYdFctyTpPsdoYdFlg(ydFctyTpPsdoYdFlg[i]);
				if (repYdTpCd[i] != null)
					model.setRepYdTpCd(repYdTpCd[i]);
				if (ydTopLftKnt[i] != null)
					model.setYdTopLftKnt(ydTopLftKnt[i]);
				if (ydPstPgcKnt[i] != null)
					model.setYdPstPgcKnt(ydPstPgcKnt[i]);
				if (ydInrlFlg[i] != null)
					model.setYdInrlFlg(ydInrlFlg[i]);
				if (ydHjsSpc[i] != null)
					model.setYdHjsSpc(ydHjsSpc[i]);
				if (ydFctyTpCfsFlg[i] != null)
					model.setYdFctyTpCfsFlg(ydFctyTpCfsFlg[i]);
				if (ydTtlVolTeuKnt[i] != null)
					model.setYdTtlVolTeuKnt(ydTtlVolTeuKnt[i]);
				if (gateClzHrmnt[i] != null)
					model.setGateClzHrmnt(gateClzHrmnt[i]);
				if (demIbCltFlg[i] != null)
					model.setDemIbCltFlg(demIbCltFlg[i]);
				if (bfrOfcCd[i] != null)
					model.setBfrOfcCd(bfrOfcCd[i]);
				if (ydBrthAlngSdDesc[i] != null)
					model.setYdBrthAlngSdDesc(ydBrthAlngSdDesc[i]);
				if (ydFctyTpRailRmpFlg[i] != null)
					model.setYdFctyTpRailRmpFlg(ydFctyTpRailRmpFlg[i]);
				if (ydFctyTpMrnTmlFlg[i] != null)
					model.setYdFctyTpMrnTmlFlg(ydFctyTpMrnTmlFlg[i]);
				if (ydLoclLangNm[i] != null)
					model.setYdLoclLangNm(ydLoclLangNm[i]);
				if (ydRfRcpt440vKnt[i] != null)
					model.setYdRfRcpt440vKnt(ydRfRcpt440vKnt[i]);
				if (eirSvcFlg[i] != null)
					model.setEirSvcFlg(eirSvcFlg[i]);
				if (ofcCd[i] != null)
					model.setOfcCd(ofcCd[i]);
				if (tmlChssKnt[i] != null)
					model.setTmlChssKnt(tmlChssKnt[i]);
				if (satGateClzHrmnt[i] != null)
					model.setSatGateClzHrmnt(satGateClzHrmnt[i]);
				if (ydCd[i] != null)
					model.setYdCd(ydCd[i]);
				if (frkKnt[i] != null)
					model.setFrkKnt(frkKnt[i]);
				if (ydAddr[i] != null)
					model.setYdAddr(ydAddr[i]);
				if (ydOpSysCd[i] != null)
					model.setYdOpSysCd(ydOpSysCd[i]);
				if (ydCtrlOfcSteCd[i] != null)
					model.setYdCtrlOfcSteCd(ydCtrlOfcSteCd[i]);
				if (ydCgoClzHrmntMsg[i] != null)
					model.setYdCgoClzHrmntMsg(ydCgoClzHrmntMsg[i]);
				if (ydTrctKnt[i] != null)
					model.setYdTrctKnt(ydTrctKnt[i]);
				if (ydRfRcpt220vKnt[i] != null)
					model.setYdRfRcpt220vKnt(ydRfRcpt220vKnt[i]);
				if (ydBrthDpthChnlKnt[i] != null)
					model.setYdBrthDpthChnlKnt(ydBrthDpthChnlKnt[i]);
				if (demObCltFlg[i] != null)
					model.setDemObCltFlg(demObCltFlg[i]);
				if (ydLoclLangAddr[i] != null)
					model.setYdLoclLangAddr(ydLoclLangAddr[i]);
				if (dryYdFtHrs[i] != null)
					model.setDryYdFtHrs(dryYdFtHrs[i]);
				if (repZnCd[i] != null)
					model.setRepZnCd(repZnCd[i]);
				if (ydHjsVolTeuKnt[i] != null)
					model.setYdHjsVolTeuKnt(ydHjsVolTeuKnt[i]);
				if (phnNo[i] != null)
					model.setPhnNo(phnNo[i]);
				if (trstrKnt[i] != null)
					model.setTrstrKnt(trstrKnt[i]);
				if (n2ndVndrSeq[i] != null)
					model.setN2ndVndrSeq(n2ndVndrSeq[i]);
				if (ydPicNm[i] != null)
					model.setYdPicNm(ydPicNm[i]);
				if (ydHndlYr[i] != null)
					model.setYdHndlYr(ydHndlYr[i]);
				if (rfMinDwllHrs[i] != null)
					model.setRfMinDwllHrs(rfMinDwllHrs[i]);
				if (ydCfsSpc[i] != null)
					model.setYdCfsSpc(ydCfsSpc[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ydChrCd[i] != null)
					model.setYdChrCd(ydChrCd[i]);
				if (ydNm[i] != null)
					model.setYdNm(ydNm[i]);
				if (faxNo[i] != null)
					model.setFaxNo(faxNo[i]);
				if (ydLocSteCd[i] != null)
					model.setYdLocSteCd(ydLocSteCd[i]);
				if (ydOshpCd[i] != null)
					model.setYdOshpCd(ydOshpCd[i]);
				if (hubYdFlg[i] != null)
					model.setHubYdFlg(hubYdFlg[i]);
				if (ydRfRcptDulKnt[i] != null)
					model.setYdRfRcptDulKnt(ydRfRcptDulKnt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (dryAvgDwllHrs[i] != null)
					model.setDryAvgDwllHrs(dryAvgDwllHrs[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (ydPgcKnt[i] != null)
					model.setYdPgcKnt(ydPgcKnt[i]);
				if (modiYdCd[i] != null)
					model.setModiYdCd(modiYdCd[i]);
				if (ydHjsVolBxKnt[i] != null)
					model.setYdHjsVolBxKnt(ydHjsVolBxKnt[i]);
				if (n1stVndrSeq[i] != null)
					model.setN1stVndrSeq(n1stVndrSeq[i]);
				if (satGateOpnHrmnt[i] != null)
					model.setSatGateOpnHrmnt(satGateOpnHrmnt[i]);
				if (n3rdVndrSeq[i] != null)
					model.setN3rdVndrSeq(n3rdVndrSeq[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (ydCstmsNo[i] != null)
					model.setYdCstmsNo(ydCstmsNo[i]);
				if (ydCtrlOfcCtyNm[i] != null)
					model.setYdCtrlOfcCtyNm(ydCtrlOfcCtyNm[i]);
				if (ydTtlSpc[i] != null)
					model.setYdTtlSpc(ydTtlSpc[i]);
				if (dmdtOfcCd[i] != null)
					model.setDmdtOfcCd(dmdtOfcCd[i]);
				if (gateOpnHrmnt[i] != null)
					model.setGateOpnHrmnt(gateOpnHrmnt[i]);
				if (dryMinDwllHrs[i] != null)
					model.setDryMinDwllHrs(dryMinDwllHrs[i]);
				if (ydHndlCapa[i] != null)
					model.setYdHndlCapa(ydHndlCapa[i]);
				if (onfHirYdFlg[i] != null)
					model.setOnfHirYdFlg(onfHirYdFlg[i]);
				if (eaiEvntDt[i] != null)
					model.setEaiEvntDt(eaiEvntDt[i]);
				if (mnrShopFlg[i] != null)
					model.setMnrShopFlg(mnrShopFlg[i]);
				if (ydBrthLen[i] != null)
					model.setYdBrthLen(ydBrthLen[i]);
				if (ydCtrlOfcAddr[i] != null)
					model.setYdCtrlOfcAddr(ydCtrlOfcAddr[i]);
				if (bdYdFlg[i] != null)
					model.setBdYdFlg(bdYdFlg[i]);
				if (ydEml[i] != null)
					model.setYdEml(ydEml[i]);
				if (intlPhnNo[i] != null)
					model.setIntlPhnNo(intlPhnNo[i]);
				if (bkgPodYdFlg[i] != null)
					model.setBkgPodYdFlg(bkgPodYdFlg[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getMdmYardVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return MdmYardVO[]
	 */
	public MdmYardVO[] getMdmYardVOs(){
		MdmYardVO[] vos = (MdmYardVO[])models.toArray(new MdmYardVO[models.size()]);
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
		this.ydActSpc = this.ydActSpc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.holGateClzHrmnt = this.holGateClzHrmnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.holGateOpnHrmnt = this.holGateOpnHrmnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydFctyTpBrgRmpFlg = this.ydFctyTpBrgRmpFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.locCd = this.locCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydRmk = this.ydRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydTtlVolBxKnt = this.ydTtlVolBxKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydCtrlOfcZipCd = this.ydCtrlOfcZipCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.brthNo = this.brthNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdVndrCntCd = this.n3rdVndrCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bfrOfcCngDt = this.bfrOfcCngDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydLocCtyNm = this.ydLocCtyNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydFctyTpCyFlg = this.ydFctyTpCyFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sunGateOpnHrmnt = this.sunGateOpnHrmnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydCeoNm = this.ydCeoNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rfAvgDwllHrs = this.rfAvgDwllHrs .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rfYdFtHrs = this.rfYdFtHrs .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlProdKnt = this.tmlProdKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stVndrCntCd = this.n1stVndrCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.zipCd = this.zipCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndVndrCntCd = this.n2ndVndrCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sunGateClzHrmnt = this.sunGateClzHrmnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydStrdlCrrKnt = this.ydStrdlCrrKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydFctyTpPsdoYdFlg = this.ydFctyTpPsdoYdFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.repYdTpCd = this.repYdTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydTopLftKnt = this.ydTopLftKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydPstPgcKnt = this.ydPstPgcKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydInrlFlg = this.ydInrlFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydHjsSpc = this.ydHjsSpc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydFctyTpCfsFlg = this.ydFctyTpCfsFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydTtlVolTeuKnt = this.ydTtlVolTeuKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.gateClzHrmnt = this.gateClzHrmnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.demIbCltFlg = this.demIbCltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bfrOfcCd = this.bfrOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydBrthAlngSdDesc = this.ydBrthAlngSdDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydFctyTpRailRmpFlg = this.ydFctyTpRailRmpFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydFctyTpMrnTmlFlg = this.ydFctyTpMrnTmlFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydLoclLangNm = this.ydLoclLangNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydRfRcpt440vKnt = this.ydRfRcpt440vKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eirSvcFlg = this.eirSvcFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcCd = this.ofcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlChssKnt = this.tmlChssKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.satGateClzHrmnt = this.satGateClzHrmnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydCd = this.ydCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.frkKnt = this.frkKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydAddr = this.ydAddr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydOpSysCd = this.ydOpSysCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydCtrlOfcSteCd = this.ydCtrlOfcSteCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydCgoClzHrmntMsg = this.ydCgoClzHrmntMsg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydTrctKnt = this.ydTrctKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydRfRcpt220vKnt = this.ydRfRcpt220vKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydBrthDpthChnlKnt = this.ydBrthDpthChnlKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.demObCltFlg = this.demObCltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydLoclLangAddr = this.ydLoclLangAddr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dryYdFtHrs = this.dryYdFtHrs .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.repZnCd = this.repZnCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydHjsVolTeuKnt = this.ydHjsVolTeuKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.phnNo = this.phnNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trstrKnt = this.trstrKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndVndrSeq = this.n2ndVndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydPicNm = this.ydPicNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydHndlYr = this.ydHndlYr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rfMinDwllHrs = this.rfMinDwllHrs .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydCfsSpc = this.ydCfsSpc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydChrCd = this.ydChrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydNm = this.ydNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faxNo = this.faxNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydLocSteCd = this.ydLocSteCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydOshpCd = this.ydOshpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hubYdFlg = this.hubYdFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydRfRcptDulKnt = this.ydRfRcptDulKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dryAvgDwllHrs = this.dryAvgDwllHrs .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydPgcKnt = this.ydPgcKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.modiYdCd = this.modiYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydHjsVolBxKnt = this.ydHjsVolBxKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stVndrSeq = this.n1stVndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.satGateOpnHrmnt = this.satGateOpnHrmnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdVndrSeq = this.n3rdVndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydCstmsNo = this.ydCstmsNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydCtrlOfcCtyNm = this.ydCtrlOfcCtyNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydTtlSpc = this.ydTtlSpc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dmdtOfcCd = this.dmdtOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.gateOpnHrmnt = this.gateOpnHrmnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dryMinDwllHrs = this.dryMinDwllHrs .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydHndlCapa = this.ydHndlCapa .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.onfHirYdFlg = this.onfHirYdFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eaiEvntDt = this.eaiEvntDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mnrShopFlg = this.mnrShopFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydBrthLen = this.ydBrthLen .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydCtrlOfcAddr = this.ydCtrlOfcAddr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bdYdFlg = this.bdYdFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydEml = this.ydEml .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.intlPhnNo = this.intlPhnNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgPodYdFlg = this.bkgPodYdFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
