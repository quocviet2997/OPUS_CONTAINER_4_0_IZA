/*=========================================================
 *Copyright(c) 2009 CyberLogitec
 *@FileName : TrsTrspEdiRailOrdVO.java
 *@FileTitle : TrsTrspEdiRailOrdVO
 *Open Issues :
 *Change history :
 *@LastModifyDate : 2009.09.30
 *@LastModifier : 박준용
 *@LastVersion : 1.0
 * 2009.09.30 박준용 
 * 1.0 Creation
=========================================================*/

package com.clt.syscommon.common.table;

import java.lang.reflect.Field;
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

public class TrsTrspEdiRailOrdVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<TrsTrspEdiRailOrdVO> models = new ArrayList<TrsTrspEdiRailOrdVO>();
	
	/* Column Info */
	private String bkgCgoTpCd = null;
	/* Column Info */
	private String stccCd = null;
	/* Column Info */
	private String subRailSeq = null;
	/* Column Info */
	private String cgoTpCd = null;
	/* Column Info */
	private String provVndrSeq = null;
	/* Column Info */
	private String railOrdRjctFlg = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String popImg = null;
	/* Column Info */
	private String bilEdiRcvRsltFlg = null;
	/* Column Info */
	private String trspFrstFlg = null;
	/* Column Info */
	private String ibdCstmsClrLocCd = null;
	/* Column Info */
	private String railCmbThruTpNm = null;
	/* Column Info */
	private String bilEdiRsndDt = null;
	/* Column Info */
	private String cxlRqstRsn = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String dwUpdDt = null;
	/* Column Info */
	private String cntrWgt = null;
	/* Column Info */
	private String hzdMtrlScgAmt = null;
	/* Column Info */
	private String cfmMsgSntDt = null;
	/* Column Info */
	private String eqTpszCd = null;
	/* Column Info */
	private String podNodCd = null;
	/* Column Info */
	private String invFlg = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String bilEdiRcvRsltDt = null;
	/* Column Info */
	private String cndCstmsClrFlg = null;
	/* Column Info */
	private String usaEdiCd = null;
	/* Column Info */
	private String vndrAbbrNm = null;
	/* Column Info */
	private String bkgSpe = null;
	/* Column Info */
	private String loclUpdDt = null;
	/* Column Info */
	private String cmdtName = null;
	/* Column Info */
	private String bilEdiRcvRsltCd = null;
	/* Column Info */
	private String totAmt = null;
	/* Column Info */
	private String uplnSoFlg = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String toNodYard = null;
	/* Column Info */
	private String plnYrwk = null;
	/* Column Info */
	private String fmNodYard = null;
	/* Column Info */
	private String bilEdiRsntDt = null;
	/* Column Info */
	private String cxlRqstRjctDtHms = null;
	/* Column Info */
	private String woRjctRsn = null;
	/* Column Info */
	private String interRmk = null;
	/* Column Info */
	private String trspSoStsCd = null;
	/* Column Info */
	private String mtcEdiRcvRsltDtHms = null;
	/* Column Info */
	private String shprCustNm = null;
	/* Column Info */
	private String bilEdiSntDtHms = null;
	/* Column Info */
	private String porNodCd = null;
	/* Column Info */
	private String trspSoStsCdNm = null;
	/* Column Info */
	private String autoXptSysCd = null;
	/* Column Info */
	private String loclCreDt = null;
	/* Column Info */
	private String bzcAmt = null;
	/* Column Info */
	private String fuelScgAmt = null;
	/* Column Info */
	private String fmNodCd = null;
	/* Column Info */
	private String invNo = null;
	/* Column Info */
	private String slanCd = null;
	/* Column Info */
	private String autoXptSysNo = null;
	/* Column Info */
	private String cxlRqstDt = null;
	/* Column Info */
	private String cneeCustNm = null;
	/* Column Info */
	private String costActGrpSeq = null;
	/* Column Info */
	private String scgAmt = null;
	/* Column Info */
	private String refNo = null;
	/* Column Info */
	private String mtcEdiIndCd = null;
	/* Column Info */
	private String stccDesc = null;
	/* Column Info */
	private String toNodCd = null;
	/* Column Info */
	private String trspSoSrcCd = null;
	/* Column Info */
	private String trspSoSeq = null;
	/* Column Info */
	private String copNo = null;
	/* Column Info */
	private String blNo = null;
	/* Column Info */
	private String spclCgoCntrTpCd = null;
	/* Column Info */
	private String mtcEdiRcvRsltFlg = null;
	/* Column Info */
	private String delNodCd = null;
	/* Column Info */
	private String bilIssStsCd = null;
	/* Column Info */
	private String tareWgt = null;
	/* Column Info */
	private String bilEdiRsndRcvRsltCd = null;
	/* Column Info */
	private String trunkvvd = null;
	/* Column Info */
	private String railCrrRefNo = null;
	/* Column Info */
	private String bilEdiCtrlSeq = null;
	/* Column Info */
	private String cxlRqstRjctDt = null;
	/* Column Info */
	private String delSccCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String lastchk = null;
	/* Column Info */
	private String bilEdiRsntDtHms = null;
	/* Column Info */
	private String ydChrCd = null;
	/* Column Info */
	private String grossWgt = null;
	/* Column Info */
	private String trspAgmtSeq = null;
	/* Column Info */
	private String vndrSeq = null;
	/* Column Info */
	private String ibdNo = null;
	/* Column Info */
	private String exptAckVndrFlg = null;
	/* Column Info */
	private String currCd = null;
	/* Column Info */
	private String waybillNo = null;
	/* Column Info */
	private String cfmMsgSntDtHms = null;
	/* Column Info */
	private String refId = null;
	/* Column Info */
	private String bilIssKnt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String trspAgmtOfcCtyCd = null;
	/* Column Info */
	private String vgmWgt = null;
	/* Column Info */
	private String trspSoOfcCtyCd = null;
	/* Column Info */
	private String creDtHms = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String railBlkCd = null;
	/* Column Info */
	private String eqNo = null;
	/* Column Info */
	private String creOfcCd = null;
	/* Column Info */
	private String cxlRqstRjctRsn = null;
	/* Column Info */
	private String trspRailBilTpCd = null;
	/* Column Info */
	private String interchange1Loc = null;
	/* Column Info */
	private String spclInstrRmk = null;
	/* Column Info */
	private String ovrWgtScgAmt = null;
	/* Column Info */
	private String railCmbThruTpCd = null;
	/* Column Info */
	private String etcAddAmt = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String chk2 = null;
	/* Column Info */
	private String interchange1Nod = null;
	/* Column Info */
	private String chk3 = null;
	/* Column Info */
	private String chk4 = null;
	/* Column Info */
	private String trspBndCd = null;
	/* Column Info */
	private String chk5 = null;
	/* Column Info */
	private String bkgCntrAttached = null;
	/* Column Info */
	private String chk1 = null;
	/* Column Info */
	private String polNodCd = null;
	/* Column Info */
	private String cxlRqstFlg = null;
	/* Column Info */
	private String interchange2Loc = null;
	/* Column Info */
	private String repoPlnId = null;
	/* Column Info */
	private String refSeq = null;
	/* Column Info */
	private String bilEdiSntDt = null;
	/* Column Info */
	private String ccredt = null;
	/* Column Info */
	private String bilEdiRsndRcvRsltDt = null;
	/* Column Info */
	private String bilEdiRcvRsltDtHms = null;
	/* Column Info */
	private String ediUsrId = null;
	/* Column Info */
	private String cxlRqstDtHms = null;
	/* Column Info */
	private String cntrSealNo = null;
	/* Column Info */
	private String interchange2Nod = null;
	/* Column Info */
	private String mtcEdiRcvRsltDt = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new LinkedHashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new LinkedHashMap<String, String>();
	
	public TrsTrspEdiRailOrdVO() {}

	public TrsTrspEdiRailOrdVO(String ibflag, String pagerows, String bilEdiRcvRsltCd, String toNodCd, String bkgCgoTpCd, String deltFlg, String trspSoSeq, String creDt, String bilIssKnt, String railOrdRjctFlg, String blNo, String trspSoOfcCtyCd, String woRjctRsn, String eqNo, String bilEdiRcvRsltFlg, String mtcEdiRcvRsltFlg, String interRmk, String creOfcCd, String cxlRqstRjctRsn, String bilIssStsCd, String bilEdiRsndDt, String spclInstrRmk, String updUsrId, String updDt, String dwUpdDt, String bilEdiRsndRcvRsltCd, String loclCreDt, String bilEdiCtrlSeq, String cfmMsgSntDt, String eqTpszCd, String fmNodCd, String creUsrId, String bkgNo, String bilEdiSntDt, String cxlRqstDt, String bilEdiRcvRsltDt, String bilEdiRsndRcvRsltDt, String vndrSeq, String mtcEdiIndCd, String loclUpdDt, String mtcEdiRcvRsltDt, String copNo, String cgoTpCd, String repoPlnId, String plnYrwk, String refId, String refSeq, String costActGrpSeq, String railCmbThruTpCd, String fmNodYard, String toNodYard, String trspSoStsCd, String trspBndCd, String cndCstmsClrFlg, String uplnSoFlg, String trspFrstFlg, String invNo, String lastchk, String subRailSeq, String usaEdiCd, String exptAckVndrFlg, String chk1, String chk2, String chk3, String chk4, String chk5, String cxlRqstFlg, String railCmbThruTpNm, String trspSoStsCdNm, String trspRailBilTpCd, String creDtHms, String vndrAbbrNm, String bilEdiSntDtHms, String bilEdiRsntDt, String bilEdiRsntDtHms, String bilEdiRcvRsltDtHms, String waybillNo, String bkgSpe, String spclCgoCntrTpCd, String mtcEdiRcvRsltDtHms, String cfmMsgSntDtHms, String provVndrSeq, String cxlRqstDtHms, String cxlRqstRsn, String cxlRqstRjctDt, String cxlRqstRjctDtHms, String popImg, String ccredt, String slanCd, String trunkvvd, String cntrWgt, String tareWgt, String grossWgt, String vgmWgt, String ibdNo, String railCrrRefNo, String shprCustNm, String cneeCustNm, String ediUsrId, String cmdtName, String refNo, String autoXptSysCd, String autoXptSysNo, String bkgCntrAttached, String ibdCstmsClrLocCd, String currCd, String totAmt, String bzcAmt, String scgAmt, String fuelScgAmt, String ovrWgtScgAmt, String hzdMtrlScgAmt, String etcAddAmt, String trspAgmtOfcCtyCd, String trspAgmtSeq, String invFlg, String railBlkCd, String porNodCd, String polNodCd, String podNodCd, String delNodCd, String delSccCd, String stccCd, String stccDesc, String cntrSealNo, String interchange1Loc, String interchange1Nod, String interchange2Loc, String interchange2Nod, String ydChrCd, String trspSoSrcCd) {
		this.bkgCgoTpCd = bkgCgoTpCd;
		this.stccCd = stccCd;
		this.subRailSeq = subRailSeq;
		this.cgoTpCd = cgoTpCd;
		this.provVndrSeq = provVndrSeq;
		this.railOrdRjctFlg = railOrdRjctFlg;
		this.pagerows = pagerows;
		this.popImg = popImg;
		this.bilEdiRcvRsltFlg = bilEdiRcvRsltFlg;
		this.trspFrstFlg = trspFrstFlg;
		this.ibdCstmsClrLocCd = ibdCstmsClrLocCd;
		this.railCmbThruTpNm = railCmbThruTpNm;
		this.bilEdiRsndDt = bilEdiRsndDt;
		this.cxlRqstRsn = cxlRqstRsn;
		this.updUsrId = updUsrId;
		this.dwUpdDt = dwUpdDt;
		this.cntrWgt = cntrWgt;
		this.hzdMtrlScgAmt = hzdMtrlScgAmt;
		this.cfmMsgSntDt = cfmMsgSntDt;
		this.eqTpszCd = eqTpszCd;
		this.podNodCd = podNodCd;
		this.invFlg = invFlg;
		this.bkgNo = bkgNo;
		this.bilEdiRcvRsltDt = bilEdiRcvRsltDt;
		this.cndCstmsClrFlg = cndCstmsClrFlg;
		this.usaEdiCd = usaEdiCd;
		this.vndrAbbrNm = vndrAbbrNm;
		this.bkgSpe = bkgSpe;
		this.loclUpdDt = loclUpdDt;
		this.cmdtName = cmdtName;
		this.bilEdiRcvRsltCd = bilEdiRcvRsltCd;
		this.totAmt = totAmt;
		this.uplnSoFlg = uplnSoFlg;
		this.deltFlg = deltFlg;
		this.toNodYard = toNodYard;
		this.plnYrwk = plnYrwk;
		this.fmNodYard = fmNodYard;
		this.bilEdiRsntDt = bilEdiRsntDt;
		this.cxlRqstRjctDtHms = cxlRqstRjctDtHms;
		this.woRjctRsn = woRjctRsn;
		this.interRmk = interRmk;
		this.trspSoStsCd = trspSoStsCd;
		this.mtcEdiRcvRsltDtHms = mtcEdiRcvRsltDtHms;
		this.shprCustNm = shprCustNm;
		this.bilEdiSntDtHms = bilEdiSntDtHms;
		this.porNodCd = porNodCd;
		this.trspSoStsCdNm = trspSoStsCdNm;
		this.autoXptSysCd = autoXptSysCd;
		this.loclCreDt = loclCreDt;
		this.bzcAmt = bzcAmt;
		this.fuelScgAmt = fuelScgAmt;
		this.fmNodCd = fmNodCd;
		this.invNo = invNo;
		this.slanCd = slanCd;
		this.autoXptSysNo = autoXptSysNo;
		this.cxlRqstDt = cxlRqstDt;
		this.cneeCustNm = cneeCustNm;
		this.costActGrpSeq = costActGrpSeq;
		this.scgAmt = scgAmt;
		this.refNo = refNo;
		this.mtcEdiIndCd = mtcEdiIndCd;
		this.stccDesc = stccDesc;
		this.toNodCd = toNodCd;
		this.trspSoSrcCd = trspSoSrcCd;
		this.trspSoSeq = trspSoSeq;
		this.copNo = copNo;
		this.blNo = blNo;
		this.spclCgoCntrTpCd = spclCgoCntrTpCd;
		this.mtcEdiRcvRsltFlg = mtcEdiRcvRsltFlg;
		this.delNodCd = delNodCd;
		this.bilIssStsCd = bilIssStsCd;
		this.tareWgt = tareWgt;
		this.bilEdiRsndRcvRsltCd = bilEdiRsndRcvRsltCd;
		this.trunkvvd = trunkvvd;
		this.railCrrRefNo = railCrrRefNo;
		this.bilEdiCtrlSeq = bilEdiCtrlSeq;
		this.cxlRqstRjctDt = cxlRqstRjctDt;
		this.delSccCd = delSccCd;
		this.creUsrId = creUsrId;
		this.lastchk = lastchk;
		this.bilEdiRsntDtHms = bilEdiRsntDtHms;
		this.ydChrCd = ydChrCd;
		this.grossWgt = grossWgt;
		this.trspAgmtSeq = trspAgmtSeq;
		this.vndrSeq = vndrSeq;
		this.ibdNo = ibdNo;
		this.exptAckVndrFlg = exptAckVndrFlg;
		this.currCd = currCd;
		this.waybillNo = waybillNo;
		this.cfmMsgSntDtHms = cfmMsgSntDtHms;
		this.refId = refId;
		this.bilIssKnt = bilIssKnt;
		this.creDt = creDt;
		this.trspAgmtOfcCtyCd = trspAgmtOfcCtyCd;
		this.vgmWgt = vgmWgt;
		this.trspSoOfcCtyCd = trspSoOfcCtyCd;
		this.creDtHms = creDtHms;
		this.ibflag = ibflag;
		this.railBlkCd = railBlkCd;
		this.eqNo = eqNo;
		this.creOfcCd = creOfcCd;
		this.cxlRqstRjctRsn = cxlRqstRjctRsn;
		this.trspRailBilTpCd = trspRailBilTpCd;
		this.interchange1Loc = interchange1Loc;
		this.spclInstrRmk = spclInstrRmk;
		this.ovrWgtScgAmt = ovrWgtScgAmt;
		this.railCmbThruTpCd = railCmbThruTpCd;
		this.etcAddAmt = etcAddAmt;
		this.updDt = updDt;
		this.chk2 = chk2;
		this.interchange1Nod = interchange1Nod;
		this.chk3 = chk3;
		this.chk4 = chk4;
		this.trspBndCd = trspBndCd;
		this.chk5 = chk5;
		this.bkgCntrAttached = bkgCntrAttached;
		this.chk1 = chk1;
		this.polNodCd = polNodCd;
		this.cxlRqstFlg = cxlRqstFlg;
		this.interchange2Loc = interchange2Loc;
		this.repoPlnId = repoPlnId;
		this.refSeq = refSeq;
		this.bilEdiSntDt = bilEdiSntDt;
		this.ccredt = ccredt;
		this.bilEdiRsndRcvRsltDt = bilEdiRsndRcvRsltDt;
		this.bilEdiRcvRsltDtHms = bilEdiRcvRsltDtHms;
		this.ediUsrId = ediUsrId;
		this.cxlRqstDtHms = cxlRqstDtHms;
		this.cntrSealNo = cntrSealNo;
		this.interchange2Nod = interchange2Nod;
		this.mtcEdiRcvRsltDt = mtcEdiRcvRsltDt;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("bkg_cgo_tp_cd", getBkgCgoTpCd());
		this.hashColumns.put("stcc_cd", getStccCd());
		this.hashColumns.put("sub_rail_seq", getSubRailSeq());
		this.hashColumns.put("cgo_tp_cd", getCgoTpCd());
		this.hashColumns.put("prov_vndr_seq", getProvVndrSeq());
		this.hashColumns.put("rail_ord_rjct_flg", getRailOrdRjctFlg());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("pop_img", getPopImg());
		this.hashColumns.put("bil_edi_rcv_rslt_flg", getBilEdiRcvRsltFlg());
		this.hashColumns.put("trsp_frst_flg", getTrspFrstFlg());
		this.hashColumns.put("ibd_cstms_clr_loc_cd", getIbdCstmsClrLocCd());
		this.hashColumns.put("rail_cmb_thru_tp_nm", getRailCmbThruTpNm());
		this.hashColumns.put("bil_edi_rsnd_dt", getBilEdiRsndDt());
		this.hashColumns.put("cxl_rqst_rsn", getCxlRqstRsn());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("dw_upd_dt", getDwUpdDt());
		this.hashColumns.put("cntr_wgt", getCntrWgt());
		this.hashColumns.put("hzd_mtrl_scg_amt", getHzdMtrlScgAmt());
		this.hashColumns.put("cfm_msg_snt_dt", getCfmMsgSntDt());
		this.hashColumns.put("eq_tpsz_cd", getEqTpszCd());
		this.hashColumns.put("pod_nod_cd", getPodNodCd());
		this.hashColumns.put("inv_flg", getInvFlg());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("bil_edi_rcv_rslt_dt", getBilEdiRcvRsltDt());
		this.hashColumns.put("cnd_cstms_clr_flg", getCndCstmsClrFlg());
		this.hashColumns.put("usa_edi_cd", getUsaEdiCd());
		this.hashColumns.put("vndr_abbr_nm", getVndrAbbrNm());
		this.hashColumns.put("bkg_spe", getBkgSpe());
		this.hashColumns.put("locl_upd_dt", getLoclUpdDt());
		this.hashColumns.put("cmdt_name", getCmdtName());
		this.hashColumns.put("bil_edi_rcv_rslt_cd", getBilEdiRcvRsltCd());
		this.hashColumns.put("tot_amt", getTotAmt());
		this.hashColumns.put("upln_so_flg", getUplnSoFlg());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("to_nod_yard", getToNodYard());
		this.hashColumns.put("pln_yrwk", getPlnYrwk());
		this.hashColumns.put("fm_nod_yard", getFmNodYard());
		this.hashColumns.put("bil_edi_rsnt_dt", getBilEdiRsntDt());
		this.hashColumns.put("cxl_rqst_rjct_dt_hms", getCxlRqstRjctDtHms());
		this.hashColumns.put("wo_rjct_rsn", getWoRjctRsn());
		this.hashColumns.put("inter_rmk", getInterRmk());
		this.hashColumns.put("trsp_so_sts_cd", getTrspSoStsCd());
		this.hashColumns.put("mtc_edi_rcv_rslt_dt_hms", getMtcEdiRcvRsltDtHms());
		this.hashColumns.put("shpr_cust_nm", getShprCustNm());
		this.hashColumns.put("bil_edi_snt_dt_hms", getBilEdiSntDtHms());
		this.hashColumns.put("por_nod_cd", getPorNodCd());
		this.hashColumns.put("trsp_so_sts_cd_nm", getTrspSoStsCdNm());
		this.hashColumns.put("auto_xpt_sys_cd", getAutoXptSysCd());
		this.hashColumns.put("locl_cre_dt", getLoclCreDt());
		this.hashColumns.put("bzc_amt", getBzcAmt());
		this.hashColumns.put("fuel_scg_amt", getFuelScgAmt());
		this.hashColumns.put("fm_nod_cd", getFmNodCd());
		this.hashColumns.put("inv_no", getInvNo());
		this.hashColumns.put("slan_cd", getSlanCd());
		this.hashColumns.put("auto_xpt_sys_no", getAutoXptSysNo());
		this.hashColumns.put("cxl_rqst_dt", getCxlRqstDt());
		this.hashColumns.put("cnee_cust_nm", getCneeCustNm());
		this.hashColumns.put("cost_act_grp_seq", getCostActGrpSeq());
		this.hashColumns.put("scg_amt", getScgAmt());
		this.hashColumns.put("ref_no", getRefNo());
		this.hashColumns.put("mtc_edi_ind_cd", getMtcEdiIndCd());
		this.hashColumns.put("stcc_desc", getStccDesc());
		this.hashColumns.put("to_nod_cd", getToNodCd());
		this.hashColumns.put("trsp_so_src_cd", getTrspSoSrcCd());
		this.hashColumns.put("trsp_so_seq", getTrspSoSeq());
		this.hashColumns.put("cop_no", getCopNo());
		this.hashColumns.put("bl_no", getBlNo());
		this.hashColumns.put("spcl_cgo_cntr_tp_cd", getSpclCgoCntrTpCd());
		this.hashColumns.put("mtc_edi_rcv_rslt_flg", getMtcEdiRcvRsltFlg());
		this.hashColumns.put("del_nod_cd", getDelNodCd());
		this.hashColumns.put("bil_iss_sts_cd", getBilIssStsCd());
		this.hashColumns.put("tare_wgt", getTareWgt());
		this.hashColumns.put("bil_edi_rsnd_rcv_rslt_cd", getBilEdiRsndRcvRsltCd());
		this.hashColumns.put("trunkvvd", getTrunkvvd());
		this.hashColumns.put("rail_crr_ref_no", getRailCrrRefNo());
		this.hashColumns.put("bil_edi_ctrl_seq", getBilEdiCtrlSeq());
		this.hashColumns.put("cxl_rqst_rjct_dt", getCxlRqstRjctDt());
		this.hashColumns.put("del_scc_cd", getDelSccCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("lastchk", getLastchk());
		this.hashColumns.put("bil_edi_rsnt_dt_hms", getBilEdiRsntDtHms());
		this.hashColumns.put("yd_chr_cd", getYdChrCd());
		this.hashColumns.put("gross_wgt", getGrossWgt());
		this.hashColumns.put("trsp_agmt_seq", getTrspAgmtSeq());
		this.hashColumns.put("vndr_seq", getVndrSeq());
		this.hashColumns.put("ibd_no", getIbdNo());
		this.hashColumns.put("expt_ack_vndr_flg", getExptAckVndrFlg());
		this.hashColumns.put("curr_cd", getCurrCd());
		this.hashColumns.put("waybill_no", getWaybillNo());
		this.hashColumns.put("cfm_msg_snt_dt_hms", getCfmMsgSntDtHms());
		this.hashColumns.put("ref_id", getRefId());
		this.hashColumns.put("bil_iss_knt", getBilIssKnt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("trsp_agmt_ofc_cty_cd", getTrspAgmtOfcCtyCd());
		this.hashColumns.put("vgm_wgt", getVgmWgt());
		this.hashColumns.put("trsp_so_ofc_cty_cd", getTrspSoOfcCtyCd());
		this.hashColumns.put("cre_dt_hms", getCreDtHms());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("rail_blk_cd", getRailBlkCd());
		this.hashColumns.put("eq_no", getEqNo());
		this.hashColumns.put("cre_ofc_cd", getCreOfcCd());
		this.hashColumns.put("cxl_rqst_rjct_rsn", getCxlRqstRjctRsn());
		this.hashColumns.put("trsp_rail_bil_tp_cd", getTrspRailBilTpCd());
		this.hashColumns.put("interchange1_loc", getInterchange1Loc());
		this.hashColumns.put("spcl_instr_rmk", getSpclInstrRmk());
		this.hashColumns.put("ovr_wgt_scg_amt", getOvrWgtScgAmt());
		this.hashColumns.put("rail_cmb_thru_tp_cd", getRailCmbThruTpCd());
		this.hashColumns.put("etc_add_amt", getEtcAddAmt());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("chk2", getChk2());
		this.hashColumns.put("interchange1_nod", getInterchange1Nod());
		this.hashColumns.put("chk3", getChk3());
		this.hashColumns.put("chk4", getChk4());
		this.hashColumns.put("trsp_bnd_cd", getTrspBndCd());
		this.hashColumns.put("chk5", getChk5());
		this.hashColumns.put("bkg_cntr_attached", getBkgCntrAttached());
		this.hashColumns.put("chk1", getChk1());
		this.hashColumns.put("pol_nod_cd", getPolNodCd());
		this.hashColumns.put("cxl_rqst_flg", getCxlRqstFlg());
		this.hashColumns.put("interchange2_loc", getInterchange2Loc());
		this.hashColumns.put("repo_pln_id", getRepoPlnId());
		this.hashColumns.put("ref_seq", getRefSeq());
		this.hashColumns.put("bil_edi_snt_dt", getBilEdiSntDt());
		this.hashColumns.put("ccredt", getCcredt());
		this.hashColumns.put("bil_edi_rsnd_rcv_rslt_dt", getBilEdiRsndRcvRsltDt());
		this.hashColumns.put("bil_edi_rcv_rslt_dt_hms", getBilEdiRcvRsltDtHms());
		this.hashColumns.put("edi_usr_id", getEdiUsrId());
		this.hashColumns.put("cxl_rqst_dt_hms", getCxlRqstDtHms());
		this.hashColumns.put("cntr_seal_no", getCntrSealNo());
		this.hashColumns.put("interchange2_nod", getInterchange2Nod());
		this.hashColumns.put("mtc_edi_rcv_rslt_dt", getMtcEdiRcvRsltDt());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("bkg_cgo_tp_cd", "bkgCgoTpCd");
		this.hashFields.put("stcc_cd", "stccCd");
		this.hashFields.put("sub_rail_seq", "subRailSeq");
		this.hashFields.put("cgo_tp_cd", "cgoTpCd");
		this.hashFields.put("prov_vndr_seq", "provVndrSeq");
		this.hashFields.put("rail_ord_rjct_flg", "railOrdRjctFlg");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("pop_img", "popImg");
		this.hashFields.put("bil_edi_rcv_rslt_flg", "bilEdiRcvRsltFlg");
		this.hashFields.put("trsp_frst_flg", "trspFrstFlg");
		this.hashFields.put("ibd_cstms_clr_loc_cd", "ibdCstmsClrLocCd");
		this.hashFields.put("rail_cmb_thru_tp_nm", "railCmbThruTpNm");
		this.hashFields.put("bil_edi_rsnd_dt", "bilEdiRsndDt");
		this.hashFields.put("cxl_rqst_rsn", "cxlRqstRsn");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("dw_upd_dt", "dwUpdDt");
		this.hashFields.put("cntr_wgt", "cntrWgt");
		this.hashFields.put("hzd_mtrl_scg_amt", "hzdMtrlScgAmt");
		this.hashFields.put("cfm_msg_snt_dt", "cfmMsgSntDt");
		this.hashFields.put("eq_tpsz_cd", "eqTpszCd");
		this.hashFields.put("pod_nod_cd", "podNodCd");
		this.hashFields.put("inv_flg", "invFlg");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("bil_edi_rcv_rslt_dt", "bilEdiRcvRsltDt");
		this.hashFields.put("cnd_cstms_clr_flg", "cndCstmsClrFlg");
		this.hashFields.put("usa_edi_cd", "usaEdiCd");
		this.hashFields.put("vndr_abbr_nm", "vndrAbbrNm");
		this.hashFields.put("bkg_spe", "bkgSpe");
		this.hashFields.put("locl_upd_dt", "loclUpdDt");
		this.hashFields.put("cmdt_name", "cmdtName");
		this.hashFields.put("bil_edi_rcv_rslt_cd", "bilEdiRcvRsltCd");
		this.hashFields.put("tot_amt", "totAmt");
		this.hashFields.put("upln_so_flg", "uplnSoFlg");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("to_nod_yard", "toNodYard");
		this.hashFields.put("pln_yrwk", "plnYrwk");
		this.hashFields.put("fm_nod_yard", "fmNodYard");
		this.hashFields.put("bil_edi_rsnt_dt", "bilEdiRsntDt");
		this.hashFields.put("cxl_rqst_rjct_dt_hms", "cxlRqstRjctDtHms");
		this.hashFields.put("wo_rjct_rsn", "woRjctRsn");
		this.hashFields.put("inter_rmk", "interRmk");
		this.hashFields.put("trsp_so_sts_cd", "trspSoStsCd");
		this.hashFields.put("mtc_edi_rcv_rslt_dt_hms", "mtcEdiRcvRsltDtHms");
		this.hashFields.put("shpr_cust_nm", "shprCustNm");
		this.hashFields.put("bil_edi_snt_dt_hms", "bilEdiSntDtHms");
		this.hashFields.put("por_nod_cd", "porNodCd");
		this.hashFields.put("trsp_so_sts_cd_nm", "trspSoStsCdNm");
		this.hashFields.put("auto_xpt_sys_cd", "autoXptSysCd");
		this.hashFields.put("locl_cre_dt", "loclCreDt");
		this.hashFields.put("bzc_amt", "bzcAmt");
		this.hashFields.put("fuel_scg_amt", "fuelScgAmt");
		this.hashFields.put("fm_nod_cd", "fmNodCd");
		this.hashFields.put("inv_no", "invNo");
		this.hashFields.put("slan_cd", "slanCd");
		this.hashFields.put("auto_xpt_sys_no", "autoXptSysNo");
		this.hashFields.put("cxl_rqst_dt", "cxlRqstDt");
		this.hashFields.put("cnee_cust_nm", "cneeCustNm");
		this.hashFields.put("cost_act_grp_seq", "costActGrpSeq");
		this.hashFields.put("scg_amt", "scgAmt");
		this.hashFields.put("ref_no", "refNo");
		this.hashFields.put("mtc_edi_ind_cd", "mtcEdiIndCd");
		this.hashFields.put("stcc_desc", "stccDesc");
		this.hashFields.put("to_nod_cd", "toNodCd");
		this.hashFields.put("trsp_so_src_cd", "trspSoSrcCd");
		this.hashFields.put("trsp_so_seq", "trspSoSeq");
		this.hashFields.put("cop_no", "copNo");
		this.hashFields.put("bl_no", "blNo");
		this.hashFields.put("spcl_cgo_cntr_tp_cd", "spclCgoCntrTpCd");
		this.hashFields.put("mtc_edi_rcv_rslt_flg", "mtcEdiRcvRsltFlg");
		this.hashFields.put("del_nod_cd", "delNodCd");
		this.hashFields.put("bil_iss_sts_cd", "bilIssStsCd");
		this.hashFields.put("tare_wgt", "tareWgt");
		this.hashFields.put("bil_edi_rsnd_rcv_rslt_cd", "bilEdiRsndRcvRsltCd");
		this.hashFields.put("trunkvvd", "trunkvvd");
		this.hashFields.put("rail_crr_ref_no", "railCrrRefNo");
		this.hashFields.put("bil_edi_ctrl_seq", "bilEdiCtrlSeq");
		this.hashFields.put("cxl_rqst_rjct_dt", "cxlRqstRjctDt");
		this.hashFields.put("del_scc_cd", "delSccCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("lastchk", "lastchk");
		this.hashFields.put("bil_edi_rsnt_dt_hms", "bilEdiRsntDtHms");
		this.hashFields.put("yd_chr_cd", "ydChrCd");
		this.hashFields.put("gross_wgt", "grossWgt");
		this.hashFields.put("trsp_agmt_seq", "trspAgmtSeq");
		this.hashFields.put("vndr_seq", "vndrSeq");
		this.hashFields.put("ibd_no", "ibdNo");
		this.hashFields.put("expt_ack_vndr_flg", "exptAckVndrFlg");
		this.hashFields.put("curr_cd", "currCd");
		this.hashFields.put("waybill_no", "waybillNo");
		this.hashFields.put("cfm_msg_snt_dt_hms", "cfmMsgSntDtHms");
		this.hashFields.put("ref_id", "refId");
		this.hashFields.put("bil_iss_knt", "bilIssKnt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("trsp_agmt_ofc_cty_cd", "trspAgmtOfcCtyCd");
		this.hashFields.put("vgm_wgt", "vgmWgt");
		this.hashFields.put("trsp_so_ofc_cty_cd", "trspSoOfcCtyCd");
		this.hashFields.put("cre_dt_hms", "creDtHms");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("rail_blk_cd", "railBlkCd");
		this.hashFields.put("eq_no", "eqNo");
		this.hashFields.put("cre_ofc_cd", "creOfcCd");
		this.hashFields.put("cxl_rqst_rjct_rsn", "cxlRqstRjctRsn");
		this.hashFields.put("trsp_rail_bil_tp_cd", "trspRailBilTpCd");
		this.hashFields.put("interchange1_loc", "interchange1Loc");
		this.hashFields.put("spcl_instr_rmk", "spclInstrRmk");
		this.hashFields.put("ovr_wgt_scg_amt", "ovrWgtScgAmt");
		this.hashFields.put("rail_cmb_thru_tp_cd", "railCmbThruTpCd");
		this.hashFields.put("etc_add_amt", "etcAddAmt");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("chk2", "chk2");
		this.hashFields.put("interchange1_nod", "interchange1Nod");
		this.hashFields.put("chk3", "chk3");
		this.hashFields.put("chk4", "chk4");
		this.hashFields.put("trsp_bnd_cd", "trspBndCd");
		this.hashFields.put("chk5", "chk5");
		this.hashFields.put("bkg_cntr_attached", "bkgCntrAttached");
		this.hashFields.put("chk1", "chk1");
		this.hashFields.put("pol_nod_cd", "polNodCd");
		this.hashFields.put("cxl_rqst_flg", "cxlRqstFlg");
		this.hashFields.put("interchange2_loc", "interchange2Loc");
		this.hashFields.put("repo_pln_id", "repoPlnId");
		this.hashFields.put("ref_seq", "refSeq");
		this.hashFields.put("bil_edi_snt_dt", "bilEdiSntDt");
		this.hashFields.put("ccredt", "ccredt");
		this.hashFields.put("bil_edi_rsnd_rcv_rslt_dt", "bilEdiRsndRcvRsltDt");
		this.hashFields.put("bil_edi_rcv_rslt_dt_hms", "bilEdiRcvRsltDtHms");
		this.hashFields.put("edi_usr_id", "ediUsrId");
		this.hashFields.put("cxl_rqst_dt_hms", "cxlRqstDtHms");
		this.hashFields.put("cntr_seal_no", "cntrSealNo");
		this.hashFields.put("interchange2_nod", "interchange2Nod");
		this.hashFields.put("mtc_edi_rcv_rslt_dt", "mtcEdiRcvRsltDt");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return bkgCgoTpCd
	 */
	public String getBkgCgoTpCd() {
		return this.bkgCgoTpCd;
	}
	
	/**
	 * Column Info
	 * @return stccCd
	 */
	public String getStccCd() {
		return this.stccCd;
	}
	
	/**
	 * Column Info
	 * @return subRailSeq
	 */
	public String getSubRailSeq() {
		return this.subRailSeq;
	}
	
	/**
	 * Column Info
	 * @return cgoTpCd
	 */
	public String getCgoTpCd() {
		return this.cgoTpCd;
	}
	
	/**
	 * Column Info
	 * @return provVndrSeq
	 */
	public String getProvVndrSeq() {
		return this.provVndrSeq;
	}
	
	/**
	 * Column Info
	 * @return railOrdRjctFlg
	 */
	public String getRailOrdRjctFlg() {
		return this.railOrdRjctFlg;
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
	 * @return popImg
	 */
	public String getPopImg() {
		return this.popImg;
	}
	
	/**
	 * Column Info
	 * @return bilEdiRcvRsltFlg
	 */
	public String getBilEdiRcvRsltFlg() {
		return this.bilEdiRcvRsltFlg;
	}
	
	/**
	 * Column Info
	 * @return trspFrstFlg
	 */
	public String getTrspFrstFlg() {
		return this.trspFrstFlg;
	}
	
	/**
	 * Column Info
	 * @return ibdCstmsClrLocCd
	 */
	public String getIbdCstmsClrLocCd() {
		return this.ibdCstmsClrLocCd;
	}
	
	/**
	 * Column Info
	 * @return railCmbThruTpNm
	 */
	public String getRailCmbThruTpNm() {
		return this.railCmbThruTpNm;
	}
	
	/**
	 * Column Info
	 * @return bilEdiRsndDt
	 */
	public String getBilEdiRsndDt() {
		return this.bilEdiRsndDt;
	}
	
	/**
	 * Column Info
	 * @return cxlRqstRsn
	 */
	public String getCxlRqstRsn() {
		return this.cxlRqstRsn;
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
	 * @return dwUpdDt
	 */
	public String getDwUpdDt() {
		return this.dwUpdDt;
	}
	
	/**
	 * Column Info
	 * @return cntrWgt
	 */
	public String getCntrWgt() {
		return this.cntrWgt;
	}
	
	/**
	 * Column Info
	 * @return hzdMtrlScgAmt
	 */
	public String getHzdMtrlScgAmt() {
		return this.hzdMtrlScgAmt;
	}
	
	/**
	 * Column Info
	 * @return cfmMsgSntDt
	 */
	public String getCfmMsgSntDt() {
		return this.cfmMsgSntDt;
	}
	
	/**
	 * Column Info
	 * @return eqTpszCd
	 */
	public String getEqTpszCd() {
		return this.eqTpszCd;
	}
	
	/**
	 * Column Info
	 * @return podNodCd
	 */
	public String getPodNodCd() {
		return this.podNodCd;
	}
	
	/**
	 * Column Info
	 * @return invFlg
	 */
	public String getInvFlg() {
		return this.invFlg;
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
	 * @return bilEdiRcvRsltDt
	 */
	public String getBilEdiRcvRsltDt() {
		return this.bilEdiRcvRsltDt;
	}
	
	/**
	 * Column Info
	 * @return cndCstmsClrFlg
	 */
	public String getCndCstmsClrFlg() {
		return this.cndCstmsClrFlg;
	}
	
	/**
	 * Column Info
	 * @return usaEdiCd
	 */
	public String getUsaEdiCd() {
		return this.usaEdiCd;
	}
	
	/**
	 * Column Info
	 * @return vndrAbbrNm
	 */
	public String getVndrAbbrNm() {
		return this.vndrAbbrNm;
	}
	
	/**
	 * Column Info
	 * @return bkgSpe
	 */
	public String getBkgSpe() {
		return this.bkgSpe;
	}
	
	/**
	 * Column Info
	 * @return loclUpdDt
	 */
	public String getLoclUpdDt() {
		return this.loclUpdDt;
	}
	
	/**
	 * Column Info
	 * @return cmdtName
	 */
	public String getCmdtName() {
		return this.cmdtName;
	}
	
	/**
	 * Column Info
	 * @return bilEdiRcvRsltCd
	 */
	public String getBilEdiRcvRsltCd() {
		return this.bilEdiRcvRsltCd;
	}
	
	/**
	 * Column Info
	 * @return totAmt
	 */
	public String getTotAmt() {
		return this.totAmt;
	}
	
	/**
	 * Column Info
	 * @return uplnSoFlg
	 */
	public String getUplnSoFlg() {
		return this.uplnSoFlg;
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
	 * @return toNodYard
	 */
	public String getToNodYard() {
		return this.toNodYard;
	}
	
	/**
	 * Column Info
	 * @return plnYrwk
	 */
	public String getPlnYrwk() {
		return this.plnYrwk;
	}
	
	/**
	 * Column Info
	 * @return fmNodYard
	 */
	public String getFmNodYard() {
		return this.fmNodYard;
	}
	
	/**
	 * Column Info
	 * @return bilEdiRsntDt
	 */
	public String getBilEdiRsntDt() {
		return this.bilEdiRsntDt;
	}
	
	/**
	 * Column Info
	 * @return cxlRqstRjctDtHms
	 */
	public String getCxlRqstRjctDtHms() {
		return this.cxlRqstRjctDtHms;
	}
	
	/**
	 * Column Info
	 * @return woRjctRsn
	 */
	public String getWoRjctRsn() {
		return this.woRjctRsn;
	}
	
	/**
	 * Column Info
	 * @return interRmk
	 */
	public String getInterRmk() {
		return this.interRmk;
	}
	
	/**
	 * Column Info
	 * @return trspSoStsCd
	 */
	public String getTrspSoStsCd() {
		return this.trspSoStsCd;
	}
	
	/**
	 * Column Info
	 * @return mtcEdiRcvRsltDtHms
	 */
	public String getMtcEdiRcvRsltDtHms() {
		return this.mtcEdiRcvRsltDtHms;
	}
	
	/**
	 * Column Info
	 * @return shprCustNm
	 */
	public String getShprCustNm() {
		return this.shprCustNm;
	}
	
	/**
	 * Column Info
	 * @return bilEdiSntDtHms
	 */
	public String getBilEdiSntDtHms() {
		return this.bilEdiSntDtHms;
	}
	
	/**
	 * Column Info
	 * @return porNodCd
	 */
	public String getPorNodCd() {
		return this.porNodCd;
	}
	
	/**
	 * Column Info
	 * @return trspSoStsCdNm
	 */
	public String getTrspSoStsCdNm() {
		return this.trspSoStsCdNm;
	}
	
	/**
	 * Column Info
	 * @return autoXptSysCd
	 */
	public String getAutoXptSysCd() {
		return this.autoXptSysCd;
	}
	
	/**
	 * Column Info
	 * @return loclCreDt
	 */
	public String getLoclCreDt() {
		return this.loclCreDt;
	}
	
	/**
	 * Column Info
	 * @return bzcAmt
	 */
	public String getBzcAmt() {
		return this.bzcAmt;
	}
	
	/**
	 * Column Info
	 * @return fuelScgAmt
	 */
	public String getFuelScgAmt() {
		return this.fuelScgAmt;
	}
	
	/**
	 * Column Info
	 * @return fmNodCd
	 */
	public String getFmNodCd() {
		return this.fmNodCd;
	}
	
	/**
	 * Column Info
	 * @return invNo
	 */
	public String getInvNo() {
		return this.invNo;
	}
	
	/**
	 * Column Info
	 * @return slanCd
	 */
	public String getSlanCd() {
		return this.slanCd;
	}
	
	/**
	 * Column Info
	 * @return autoXptSysNo
	 */
	public String getAutoXptSysNo() {
		return this.autoXptSysNo;
	}
	
	/**
	 * Column Info
	 * @return cxlRqstDt
	 */
	public String getCxlRqstDt() {
		return this.cxlRqstDt;
	}
	
	/**
	 * Column Info
	 * @return cneeCustNm
	 */
	public String getCneeCustNm() {
		return this.cneeCustNm;
	}
	
	/**
	 * Column Info
	 * @return costActGrpSeq
	 */
	public String getCostActGrpSeq() {
		return this.costActGrpSeq;
	}
	
	/**
	 * Column Info
	 * @return scgAmt
	 */
	public String getScgAmt() {
		return this.scgAmt;
	}
	
	/**
	 * Column Info
	 * @return refNo
	 */
	public String getRefNo() {
		return this.refNo;
	}
	
	/**
	 * Column Info
	 * @return mtcEdiIndCd
	 */
	public String getMtcEdiIndCd() {
		return this.mtcEdiIndCd;
	}
	
	/**
	 * Column Info
	 * @return stccDesc
	 */
	public String getStccDesc() {
		return this.stccDesc;
	}
	
	/**
	 * Column Info
	 * @return toNodCd
	 */
	public String getToNodCd() {
		return this.toNodCd;
	}
	
	/**
	 * Column Info
	 * @return trspSoSrcCd
	 */
	public String getTrspSoSrcCd() {
		return this.trspSoSrcCd;
	}
	
	/**
	 * Column Info
	 * @return trspSoSeq
	 */
	public String getTrspSoSeq() {
		return this.trspSoSeq;
	}
	
	/**
	 * Column Info
	 * @return copNo
	 */
	public String getCopNo() {
		return this.copNo;
	}
	
	/**
	 * Column Info
	 * @return blNo
	 */
	public String getBlNo() {
		return this.blNo;
	}
	
	/**
	 * Column Info
	 * @return spclCgoCntrTpCd
	 */
	public String getSpclCgoCntrTpCd() {
		return this.spclCgoCntrTpCd;
	}
	
	/**
	 * Column Info
	 * @return mtcEdiRcvRsltFlg
	 */
	public String getMtcEdiRcvRsltFlg() {
		return this.mtcEdiRcvRsltFlg;
	}
	
	/**
	 * Column Info
	 * @return delNodCd
	 */
	public String getDelNodCd() {
		return this.delNodCd;
	}
	
	/**
	 * Column Info
	 * @return bilIssStsCd
	 */
	public String getBilIssStsCd() {
		return this.bilIssStsCd;
	}
	
	/**
	 * Column Info
	 * @return tareWgt
	 */
	public String getTareWgt() {
		return this.tareWgt;
	}
	
	/**
	 * Column Info
	 * @return bilEdiRsndRcvRsltCd
	 */
	public String getBilEdiRsndRcvRsltCd() {
		return this.bilEdiRsndRcvRsltCd;
	}
	
	/**
	 * Column Info
	 * @return trunkvvd
	 */
	public String getTrunkvvd() {
		return this.trunkvvd;
	}
	
	/**
	 * Column Info
	 * @return railCrrRefNo
	 */
	public String getRailCrrRefNo() {
		return this.railCrrRefNo;
	}
	
	/**
	 * Column Info
	 * @return bilEdiCtrlSeq
	 */
	public String getBilEdiCtrlSeq() {
		return this.bilEdiCtrlSeq;
	}
	
	/**
	 * Column Info
	 * @return cxlRqstRjctDt
	 */
	public String getCxlRqstRjctDt() {
		return this.cxlRqstRjctDt;
	}
	
	/**
	 * Column Info
	 * @return delSccCd
	 */
	public String getDelSccCd() {
		return this.delSccCd;
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
	 * @return lastchk
	 */
	public String getLastchk() {
		return this.lastchk;
	}
	
	/**
	 * Column Info
	 * @return bilEdiRsntDtHms
	 */
	public String getBilEdiRsntDtHms() {
		return this.bilEdiRsntDtHms;
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
	 * @return grossWgt
	 */
	public String getGrossWgt() {
		return this.grossWgt;
	}
	
	/**
	 * Column Info
	 * @return trspAgmtSeq
	 */
	public String getTrspAgmtSeq() {
		return this.trspAgmtSeq;
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
	 * @return ibdNo
	 */
	public String getIbdNo() {
		return this.ibdNo;
	}
	
	/**
	 * Column Info
	 * @return exptAckVndrFlg
	 */
	public String getExptAckVndrFlg() {
		return this.exptAckVndrFlg;
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
	 * @return waybillNo
	 */
	public String getWaybillNo() {
		return this.waybillNo;
	}
	
	/**
	 * Column Info
	 * @return cfmMsgSntDtHms
	 */
	public String getCfmMsgSntDtHms() {
		return this.cfmMsgSntDtHms;
	}
	
	/**
	 * Column Info
	 * @return refId
	 */
	public String getRefId() {
		return this.refId;
	}
	
	/**
	 * Column Info
	 * @return bilIssKnt
	 */
	public String getBilIssKnt() {
		return this.bilIssKnt;
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
	 * @return trspAgmtOfcCtyCd
	 */
	public String getTrspAgmtOfcCtyCd() {
		return this.trspAgmtOfcCtyCd;
	}
	
	/**
	 * Column Info
	 * @return vgmWgt
	 */
	public String getVgmWgt() {
		return this.vgmWgt;
	}
	
	/**
	 * Column Info
	 * @return trspSoOfcCtyCd
	 */
	public String getTrspSoOfcCtyCd() {
		return this.trspSoOfcCtyCd;
	}
	
	/**
	 * Column Info
	 * @return creDtHms
	 */
	public String getCreDtHms() {
		return this.creDtHms;
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
	 * @return railBlkCd
	 */
	public String getRailBlkCd() {
		return this.railBlkCd;
	}
	
	/**
	 * Column Info
	 * @return eqNo
	 */
	public String getEqNo() {
		return this.eqNo;
	}
	
	/**
	 * Column Info
	 * @return creOfcCd
	 */
	public String getCreOfcCd() {
		return this.creOfcCd;
	}
	
	/**
	 * Column Info
	 * @return cxlRqstRjctRsn
	 */
	public String getCxlRqstRjctRsn() {
		return this.cxlRqstRjctRsn;
	}
	
	/**
	 * Column Info
	 * @return trspRailBilTpCd
	 */
	public String getTrspRailBilTpCd() {
		return this.trspRailBilTpCd;
	}
	
	/**
	 * Column Info
	 * @return interchange1Loc
	 */
	public String getInterchange1Loc() {
		return this.interchange1Loc;
	}
	
	/**
	 * Column Info
	 * @return spclInstrRmk
	 */
	public String getSpclInstrRmk() {
		return this.spclInstrRmk;
	}
	
	/**
	 * Column Info
	 * @return ovrWgtScgAmt
	 */
	public String getOvrWgtScgAmt() {
		return this.ovrWgtScgAmt;
	}
	
	/**
	 * Column Info
	 * @return railCmbThruTpCd
	 */
	public String getRailCmbThruTpCd() {
		return this.railCmbThruTpCd;
	}
	
	/**
	 * Column Info
	 * @return etcAddAmt
	 */
	public String getEtcAddAmt() {
		return this.etcAddAmt;
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
	 * @return chk2
	 */
	public String getChk2() {
		return this.chk2;
	}
	
	/**
	 * Column Info
	 * @return interchange1Nod
	 */
	public String getInterchange1Nod() {
		return this.interchange1Nod;
	}
	
	/**
	 * Column Info
	 * @return chk3
	 */
	public String getChk3() {
		return this.chk3;
	}
	
	/**
	 * Column Info
	 * @return chk4
	 */
	public String getChk4() {
		return this.chk4;
	}
	
	/**
	 * Column Info
	 * @return trspBndCd
	 */
	public String getTrspBndCd() {
		return this.trspBndCd;
	}
	
	/**
	 * Column Info
	 * @return chk5
	 */
	public String getChk5() {
		return this.chk5;
	}
	
	/**
	 * Column Info
	 * @return bkgCntrAttached
	 */
	public String getBkgCntrAttached() {
		return this.bkgCntrAttached;
	}
	
	/**
	 * Column Info
	 * @return chk1
	 */
	public String getChk1() {
		return this.chk1;
	}
	
	/**
	 * Column Info
	 * @return polNodCd
	 */
	public String getPolNodCd() {
		return this.polNodCd;
	}
	
	/**
	 * Column Info
	 * @return cxlRqstFlg
	 */
	public String getCxlRqstFlg() {
		return this.cxlRqstFlg;
	}
	
	/**
	 * Column Info
	 * @return interchange2Loc
	 */
	public String getInterchange2Loc() {
		return this.interchange2Loc;
	}
	
	/**
	 * Column Info
	 * @return repoPlnId
	 */
	public String getRepoPlnId() {
		return this.repoPlnId;
	}
	
	/**
	 * Column Info
	 * @return refSeq
	 */
	public String getRefSeq() {
		return this.refSeq;
	}
	
	/**
	 * Column Info
	 * @return bilEdiSntDt
	 */
	public String getBilEdiSntDt() {
		return this.bilEdiSntDt;
	}
	
	/**
	 * Column Info
	 * @return ccredt
	 */
	public String getCcredt() {
		return this.ccredt;
	}
	
	/**
	 * Column Info
	 * @return bilEdiRsndRcvRsltDt
	 */
	public String getBilEdiRsndRcvRsltDt() {
		return this.bilEdiRsndRcvRsltDt;
	}
	
	/**
	 * Column Info
	 * @return bilEdiRcvRsltDtHms
	 */
	public String getBilEdiRcvRsltDtHms() {
		return this.bilEdiRcvRsltDtHms;
	}
	
	/**
	 * Column Info
	 * @return ediUsrId
	 */
	public String getEdiUsrId() {
		return this.ediUsrId;
	}
	
	/**
	 * Column Info
	 * @return cxlRqstDtHms
	 */
	public String getCxlRqstDtHms() {
		return this.cxlRqstDtHms;
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
	 * @return interchange2Nod
	 */
	public String getInterchange2Nod() {
		return this.interchange2Nod;
	}
	
	/**
	 * Column Info
	 * @return mtcEdiRcvRsltDt
	 */
	public String getMtcEdiRcvRsltDt() {
		return this.mtcEdiRcvRsltDt;
	}
	

	/**
	 * Column Info
	 * @param bkgCgoTpCd
	 */
	public void setBkgCgoTpCd(String bkgCgoTpCd) {
		this.bkgCgoTpCd = bkgCgoTpCd;
	}
	
	/**
	 * Column Info
	 * @param stccCd
	 */
	public void setStccCd(String stccCd) {
		this.stccCd = stccCd;
	}
	
	/**
	 * Column Info
	 * @param subRailSeq
	 */
	public void setSubRailSeq(String subRailSeq) {
		this.subRailSeq = subRailSeq;
	}
	
	/**
	 * Column Info
	 * @param cgoTpCd
	 */
	public void setCgoTpCd(String cgoTpCd) {
		this.cgoTpCd = cgoTpCd;
	}
	
	/**
	 * Column Info
	 * @param provVndrSeq
	 */
	public void setProvVndrSeq(String provVndrSeq) {
		this.provVndrSeq = provVndrSeq;
	}
	
	/**
	 * Column Info
	 * @param railOrdRjctFlg
	 */
	public void setRailOrdRjctFlg(String railOrdRjctFlg) {
		this.railOrdRjctFlg = railOrdRjctFlg;
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
	 * @param popImg
	 */
	public void setPopImg(String popImg) {
		this.popImg = popImg;
	}
	
	/**
	 * Column Info
	 * @param bilEdiRcvRsltFlg
	 */
	public void setBilEdiRcvRsltFlg(String bilEdiRcvRsltFlg) {
		this.bilEdiRcvRsltFlg = bilEdiRcvRsltFlg;
	}
	
	/**
	 * Column Info
	 * @param trspFrstFlg
	 */
	public void setTrspFrstFlg(String trspFrstFlg) {
		this.trspFrstFlg = trspFrstFlg;
	}
	
	/**
	 * Column Info
	 * @param ibdCstmsClrLocCd
	 */
	public void setIbdCstmsClrLocCd(String ibdCstmsClrLocCd) {
		this.ibdCstmsClrLocCd = ibdCstmsClrLocCd;
	}
	
	/**
	 * Column Info
	 * @param railCmbThruTpNm
	 */
	public void setRailCmbThruTpNm(String railCmbThruTpNm) {
		this.railCmbThruTpNm = railCmbThruTpNm;
	}
	
	/**
	 * Column Info
	 * @param bilEdiRsndDt
	 */
	public void setBilEdiRsndDt(String bilEdiRsndDt) {
		this.bilEdiRsndDt = bilEdiRsndDt;
	}
	
	/**
	 * Column Info
	 * @param cxlRqstRsn
	 */
	public void setCxlRqstRsn(String cxlRqstRsn) {
		this.cxlRqstRsn = cxlRqstRsn;
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
	 * @param dwUpdDt
	 */
	public void setDwUpdDt(String dwUpdDt) {
		this.dwUpdDt = dwUpdDt;
	}
	
	/**
	 * Column Info
	 * @param cntrWgt
	 */
	public void setCntrWgt(String cntrWgt) {
		this.cntrWgt = cntrWgt;
	}
	
	/**
	 * Column Info
	 * @param hzdMtrlScgAmt
	 */
	public void setHzdMtrlScgAmt(String hzdMtrlScgAmt) {
		this.hzdMtrlScgAmt = hzdMtrlScgAmt;
	}
	
	/**
	 * Column Info
	 * @param cfmMsgSntDt
	 */
	public void setCfmMsgSntDt(String cfmMsgSntDt) {
		this.cfmMsgSntDt = cfmMsgSntDt;
	}
	
	/**
	 * Column Info
	 * @param eqTpszCd
	 */
	public void setEqTpszCd(String eqTpszCd) {
		this.eqTpszCd = eqTpszCd;
	}
	
	/**
	 * Column Info
	 * @param podNodCd
	 */
	public void setPodNodCd(String podNodCd) {
		this.podNodCd = podNodCd;
	}
	
	/**
	 * Column Info
	 * @param invFlg
	 */
	public void setInvFlg(String invFlg) {
		this.invFlg = invFlg;
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
	 * @param bilEdiRcvRsltDt
	 */
	public void setBilEdiRcvRsltDt(String bilEdiRcvRsltDt) {
		this.bilEdiRcvRsltDt = bilEdiRcvRsltDt;
	}
	
	/**
	 * Column Info
	 * @param cndCstmsClrFlg
	 */
	public void setCndCstmsClrFlg(String cndCstmsClrFlg) {
		this.cndCstmsClrFlg = cndCstmsClrFlg;
	}
	
	/**
	 * Column Info
	 * @param usaEdiCd
	 */
	public void setUsaEdiCd(String usaEdiCd) {
		this.usaEdiCd = usaEdiCd;
	}
	
	/**
	 * Column Info
	 * @param vndrAbbrNm
	 */
	public void setVndrAbbrNm(String vndrAbbrNm) {
		this.vndrAbbrNm = vndrAbbrNm;
	}
	
	/**
	 * Column Info
	 * @param bkgSpe
	 */
	public void setBkgSpe(String bkgSpe) {
		this.bkgSpe = bkgSpe;
	}
	
	/**
	 * Column Info
	 * @param loclUpdDt
	 */
	public void setLoclUpdDt(String loclUpdDt) {
		this.loclUpdDt = loclUpdDt;
	}
	
	/**
	 * Column Info
	 * @param cmdtName
	 */
	public void setCmdtName(String cmdtName) {
		this.cmdtName = cmdtName;
	}
	
	/**
	 * Column Info
	 * @param bilEdiRcvRsltCd
	 */
	public void setBilEdiRcvRsltCd(String bilEdiRcvRsltCd) {
		this.bilEdiRcvRsltCd = bilEdiRcvRsltCd;
	}
	
	/**
	 * Column Info
	 * @param totAmt
	 */
	public void setTotAmt(String totAmt) {
		this.totAmt = totAmt;
	}
	
	/**
	 * Column Info
	 * @param uplnSoFlg
	 */
	public void setUplnSoFlg(String uplnSoFlg) {
		this.uplnSoFlg = uplnSoFlg;
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
	 * @param toNodYard
	 */
	public void setToNodYard(String toNodYard) {
		this.toNodYard = toNodYard;
	}
	
	/**
	 * Column Info
	 * @param plnYrwk
	 */
	public void setPlnYrwk(String plnYrwk) {
		this.plnYrwk = plnYrwk;
	}
	
	/**
	 * Column Info
	 * @param fmNodYard
	 */
	public void setFmNodYard(String fmNodYard) {
		this.fmNodYard = fmNodYard;
	}
	
	/**
	 * Column Info
	 * @param bilEdiRsntDt
	 */
	public void setBilEdiRsntDt(String bilEdiRsntDt) {
		this.bilEdiRsntDt = bilEdiRsntDt;
	}
	
	/**
	 * Column Info
	 * @param cxlRqstRjctDtHms
	 */
	public void setCxlRqstRjctDtHms(String cxlRqstRjctDtHms) {
		this.cxlRqstRjctDtHms = cxlRqstRjctDtHms;
	}
	
	/**
	 * Column Info
	 * @param woRjctRsn
	 */
	public void setWoRjctRsn(String woRjctRsn) {
		this.woRjctRsn = woRjctRsn;
	}
	
	/**
	 * Column Info
	 * @param interRmk
	 */
	public void setInterRmk(String interRmk) {
		this.interRmk = interRmk;
	}
	
	/**
	 * Column Info
	 * @param trspSoStsCd
	 */
	public void setTrspSoStsCd(String trspSoStsCd) {
		this.trspSoStsCd = trspSoStsCd;
	}
	
	/**
	 * Column Info
	 * @param mtcEdiRcvRsltDtHms
	 */
	public void setMtcEdiRcvRsltDtHms(String mtcEdiRcvRsltDtHms) {
		this.mtcEdiRcvRsltDtHms = mtcEdiRcvRsltDtHms;
	}
	
	/**
	 * Column Info
	 * @param shprCustNm
	 */
	public void setShprCustNm(String shprCustNm) {
		this.shprCustNm = shprCustNm;
	}
	
	/**
	 * Column Info
	 * @param bilEdiSntDtHms
	 */
	public void setBilEdiSntDtHms(String bilEdiSntDtHms) {
		this.bilEdiSntDtHms = bilEdiSntDtHms;
	}
	
	/**
	 * Column Info
	 * @param porNodCd
	 */
	public void setPorNodCd(String porNodCd) {
		this.porNodCd = porNodCd;
	}
	
	/**
	 * Column Info
	 * @param trspSoStsCdNm
	 */
	public void setTrspSoStsCdNm(String trspSoStsCdNm) {
		this.trspSoStsCdNm = trspSoStsCdNm;
	}
	
	/**
	 * Column Info
	 * @param autoXptSysCd
	 */
	public void setAutoXptSysCd(String autoXptSysCd) {
		this.autoXptSysCd = autoXptSysCd;
	}
	
	/**
	 * Column Info
	 * @param loclCreDt
	 */
	public void setLoclCreDt(String loclCreDt) {
		this.loclCreDt = loclCreDt;
	}
	
	/**
	 * Column Info
	 * @param bzcAmt
	 */
	public void setBzcAmt(String bzcAmt) {
		this.bzcAmt = bzcAmt;
	}
	
	/**
	 * Column Info
	 * @param fuelScgAmt
	 */
	public void setFuelScgAmt(String fuelScgAmt) {
		this.fuelScgAmt = fuelScgAmt;
	}
	
	/**
	 * Column Info
	 * @param fmNodCd
	 */
	public void setFmNodCd(String fmNodCd) {
		this.fmNodCd = fmNodCd;
	}
	
	/**
	 * Column Info
	 * @param invNo
	 */
	public void setInvNo(String invNo) {
		this.invNo = invNo;
	}
	
	/**
	 * Column Info
	 * @param slanCd
	 */
	public void setSlanCd(String slanCd) {
		this.slanCd = slanCd;
	}
	
	/**
	 * Column Info
	 * @param autoXptSysNo
	 */
	public void setAutoXptSysNo(String autoXptSysNo) {
		this.autoXptSysNo = autoXptSysNo;
	}
	
	/**
	 * Column Info
	 * @param cxlRqstDt
	 */
	public void setCxlRqstDt(String cxlRqstDt) {
		this.cxlRqstDt = cxlRqstDt;
	}
	
	/**
	 * Column Info
	 * @param cneeCustNm
	 */
	public void setCneeCustNm(String cneeCustNm) {
		this.cneeCustNm = cneeCustNm;
	}
	
	/**
	 * Column Info
	 * @param costActGrpSeq
	 */
	public void setCostActGrpSeq(String costActGrpSeq) {
		this.costActGrpSeq = costActGrpSeq;
	}
	
	/**
	 * Column Info
	 * @param scgAmt
	 */
	public void setScgAmt(String scgAmt) {
		this.scgAmt = scgAmt;
	}
	
	/**
	 * Column Info
	 * @param refNo
	 */
	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}
	
	/**
	 * Column Info
	 * @param mtcEdiIndCd
	 */
	public void setMtcEdiIndCd(String mtcEdiIndCd) {
		this.mtcEdiIndCd = mtcEdiIndCd;
	}
	
	/**
	 * Column Info
	 * @param stccDesc
	 */
	public void setStccDesc(String stccDesc) {
		this.stccDesc = stccDesc;
	}
	
	/**
	 * Column Info
	 * @param toNodCd
	 */
	public void setToNodCd(String toNodCd) {
		this.toNodCd = toNodCd;
	}
	
	/**
	 * Column Info
	 * @param trspSoSrcCd
	 */
	public void setTrspSoSrcCd(String trspSoSrcCd) {
		this.trspSoSrcCd = trspSoSrcCd;
	}
	
	/**
	 * Column Info
	 * @param trspSoSeq
	 */
	public void setTrspSoSeq(String trspSoSeq) {
		this.trspSoSeq = trspSoSeq;
	}
	
	/**
	 * Column Info
	 * @param copNo
	 */
	public void setCopNo(String copNo) {
		this.copNo = copNo;
	}
	
	/**
	 * Column Info
	 * @param blNo
	 */
	public void setBlNo(String blNo) {
		this.blNo = blNo;
	}
	
	/**
	 * Column Info
	 * @param spclCgoCntrTpCd
	 */
	public void setSpclCgoCntrTpCd(String spclCgoCntrTpCd) {
		this.spclCgoCntrTpCd = spclCgoCntrTpCd;
	}
	
	/**
	 * Column Info
	 * @param mtcEdiRcvRsltFlg
	 */
	public void setMtcEdiRcvRsltFlg(String mtcEdiRcvRsltFlg) {
		this.mtcEdiRcvRsltFlg = mtcEdiRcvRsltFlg;
	}
	
	/**
	 * Column Info
	 * @param delNodCd
	 */
	public void setDelNodCd(String delNodCd) {
		this.delNodCd = delNodCd;
	}
	
	/**
	 * Column Info
	 * @param bilIssStsCd
	 */
	public void setBilIssStsCd(String bilIssStsCd) {
		this.bilIssStsCd = bilIssStsCd;
	}
	
	/**
	 * Column Info
	 * @param tareWgt
	 */
	public void setTareWgt(String tareWgt) {
		this.tareWgt = tareWgt;
	}
	
	/**
	 * Column Info
	 * @param bilEdiRsndRcvRsltCd
	 */
	public void setBilEdiRsndRcvRsltCd(String bilEdiRsndRcvRsltCd) {
		this.bilEdiRsndRcvRsltCd = bilEdiRsndRcvRsltCd;
	}
	
	/**
	 * Column Info
	 * @param trunkvvd
	 */
	public void setTrunkvvd(String trunkvvd) {
		this.trunkvvd = trunkvvd;
	}
	
	/**
	 * Column Info
	 * @param railCrrRefNo
	 */
	public void setRailCrrRefNo(String railCrrRefNo) {
		this.railCrrRefNo = railCrrRefNo;
	}
	
	/**
	 * Column Info
	 * @param bilEdiCtrlSeq
	 */
	public void setBilEdiCtrlSeq(String bilEdiCtrlSeq) {
		this.bilEdiCtrlSeq = bilEdiCtrlSeq;
	}
	
	/**
	 * Column Info
	 * @param cxlRqstRjctDt
	 */
	public void setCxlRqstRjctDt(String cxlRqstRjctDt) {
		this.cxlRqstRjctDt = cxlRqstRjctDt;
	}
	
	/**
	 * Column Info
	 * @param delSccCd
	 */
	public void setDelSccCd(String delSccCd) {
		this.delSccCd = delSccCd;
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
	 * @param lastchk
	 */
	public void setLastchk(String lastchk) {
		this.lastchk = lastchk;
	}
	
	/**
	 * Column Info
	 * @param bilEdiRsntDtHms
	 */
	public void setBilEdiRsntDtHms(String bilEdiRsntDtHms) {
		this.bilEdiRsntDtHms = bilEdiRsntDtHms;
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
	 * @param grossWgt
	 */
	public void setGrossWgt(String grossWgt) {
		this.grossWgt = grossWgt;
	}
	
	/**
	 * Column Info
	 * @param trspAgmtSeq
	 */
	public void setTrspAgmtSeq(String trspAgmtSeq) {
		this.trspAgmtSeq = trspAgmtSeq;
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
	 * @param ibdNo
	 */
	public void setIbdNo(String ibdNo) {
		this.ibdNo = ibdNo;
	}
	
	/**
	 * Column Info
	 * @param exptAckVndrFlg
	 */
	public void setExptAckVndrFlg(String exptAckVndrFlg) {
		this.exptAckVndrFlg = exptAckVndrFlg;
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
	 * @param waybillNo
	 */
	public void setWaybillNo(String waybillNo) {
		this.waybillNo = waybillNo;
	}
	
	/**
	 * Column Info
	 * @param cfmMsgSntDtHms
	 */
	public void setCfmMsgSntDtHms(String cfmMsgSntDtHms) {
		this.cfmMsgSntDtHms = cfmMsgSntDtHms;
	}
	
	/**
	 * Column Info
	 * @param refId
	 */
	public void setRefId(String refId) {
		this.refId = refId;
	}
	
	/**
	 * Column Info
	 * @param bilIssKnt
	 */
	public void setBilIssKnt(String bilIssKnt) {
		this.bilIssKnt = bilIssKnt;
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
	 * @param trspAgmtOfcCtyCd
	 */
	public void setTrspAgmtOfcCtyCd(String trspAgmtOfcCtyCd) {
		this.trspAgmtOfcCtyCd = trspAgmtOfcCtyCd;
	}
	
	/**
	 * Column Info
	 * @param vgmWgt
	 */
	public void setVgmWgt(String vgmWgt) {
		this.vgmWgt = vgmWgt;
	}
	
	/**
	 * Column Info
	 * @param trspSoOfcCtyCd
	 */
	public void setTrspSoOfcCtyCd(String trspSoOfcCtyCd) {
		this.trspSoOfcCtyCd = trspSoOfcCtyCd;
	}
	
	/**
	 * Column Info
	 * @param creDtHms
	 */
	public void setCreDtHms(String creDtHms) {
		this.creDtHms = creDtHms;
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
	 * @param railBlkCd
	 */
	public void setRailBlkCd(String railBlkCd) {
		this.railBlkCd = railBlkCd;
	}
	
	/**
	 * Column Info
	 * @param eqNo
	 */
	public void setEqNo(String eqNo) {
		this.eqNo = eqNo;
	}
	
	/**
	 * Column Info
	 * @param creOfcCd
	 */
	public void setCreOfcCd(String creOfcCd) {
		this.creOfcCd = creOfcCd;
	}
	
	/**
	 * Column Info
	 * @param cxlRqstRjctRsn
	 */
	public void setCxlRqstRjctRsn(String cxlRqstRjctRsn) {
		this.cxlRqstRjctRsn = cxlRqstRjctRsn;
	}
	
	/**
	 * Column Info
	 * @param trspRailBilTpCd
	 */
	public void setTrspRailBilTpCd(String trspRailBilTpCd) {
		this.trspRailBilTpCd = trspRailBilTpCd;
	}
	
	/**
	 * Column Info
	 * @param interchange1Loc
	 */
	public void setInterchange1Loc(String interchange1Loc) {
		this.interchange1Loc = interchange1Loc;
	}
	
	/**
	 * Column Info
	 * @param spclInstrRmk
	 */
	public void setSpclInstrRmk(String spclInstrRmk) {
		this.spclInstrRmk = spclInstrRmk;
	}
	
	/**
	 * Column Info
	 * @param ovrWgtScgAmt
	 */
	public void setOvrWgtScgAmt(String ovrWgtScgAmt) {
		this.ovrWgtScgAmt = ovrWgtScgAmt;
	}
	
	/**
	 * Column Info
	 * @param railCmbThruTpCd
	 */
	public void setRailCmbThruTpCd(String railCmbThruTpCd) {
		this.railCmbThruTpCd = railCmbThruTpCd;
	}
	
	/**
	 * Column Info
	 * @param etcAddAmt
	 */
	public void setEtcAddAmt(String etcAddAmt) {
		this.etcAddAmt = etcAddAmt;
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
	 * @param chk2
	 */
	public void setChk2(String chk2) {
		this.chk2 = chk2;
	}
	
	/**
	 * Column Info
	 * @param interchange1Nod
	 */
	public void setInterchange1Nod(String interchange1Nod) {
		this.interchange1Nod = interchange1Nod;
	}
	
	/**
	 * Column Info
	 * @param chk3
	 */
	public void setChk3(String chk3) {
		this.chk3 = chk3;
	}
	
	/**
	 * Column Info
	 * @param chk4
	 */
	public void setChk4(String chk4) {
		this.chk4 = chk4;
	}
	
	/**
	 * Column Info
	 * @param trspBndCd
	 */
	public void setTrspBndCd(String trspBndCd) {
		this.trspBndCd = trspBndCd;
	}
	
	/**
	 * Column Info
	 * @param chk5
	 */
	public void setChk5(String chk5) {
		this.chk5 = chk5;
	}
	
	/**
	 * Column Info
	 * @param bkgCntrAttached
	 */
	public void setBkgCntrAttached(String bkgCntrAttached) {
		this.bkgCntrAttached = bkgCntrAttached;
	}
	
	/**
	 * Column Info
	 * @param chk1
	 */
	public void setChk1(String chk1) {
		this.chk1 = chk1;
	}
	
	/**
	 * Column Info
	 * @param polNodCd
	 */
	public void setPolNodCd(String polNodCd) {
		this.polNodCd = polNodCd;
	}
	
	/**
	 * Column Info
	 * @param cxlRqstFlg
	 */
	public void setCxlRqstFlg(String cxlRqstFlg) {
		this.cxlRqstFlg = cxlRqstFlg;
	}
	
	/**
	 * Column Info
	 * @param interchange2Loc
	 */
	public void setInterchange2Loc(String interchange2Loc) {
		this.interchange2Loc = interchange2Loc;
	}
	
	/**
	 * Column Info
	 * @param repoPlnId
	 */
	public void setRepoPlnId(String repoPlnId) {
		this.repoPlnId = repoPlnId;
	}
	
	/**
	 * Column Info
	 * @param refSeq
	 */
	public void setRefSeq(String refSeq) {
		this.refSeq = refSeq;
	}
	
	/**
	 * Column Info
	 * @param bilEdiSntDt
	 */
	public void setBilEdiSntDt(String bilEdiSntDt) {
		this.bilEdiSntDt = bilEdiSntDt;
	}
	
	/**
	 * Column Info
	 * @param ccredt
	 */
	public void setCcredt(String ccredt) {
		this.ccredt = ccredt;
	}
	
	/**
	 * Column Info
	 * @param bilEdiRsndRcvRsltDt
	 */
	public void setBilEdiRsndRcvRsltDt(String bilEdiRsndRcvRsltDt) {
		this.bilEdiRsndRcvRsltDt = bilEdiRsndRcvRsltDt;
	}
	
	/**
	 * Column Info
	 * @param bilEdiRcvRsltDtHms
	 */
	public void setBilEdiRcvRsltDtHms(String bilEdiRcvRsltDtHms) {
		this.bilEdiRcvRsltDtHms = bilEdiRcvRsltDtHms;
	}
	
	/**
	 * Column Info
	 * @param ediUsrId
	 */
	public void setEdiUsrId(String ediUsrId) {
		this.ediUsrId = ediUsrId;
	}
	
	/**
	 * Column Info
	 * @param cxlRqstDtHms
	 */
	public void setCxlRqstDtHms(String cxlRqstDtHms) {
		this.cxlRqstDtHms = cxlRqstDtHms;
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
	 * @param interchange2Nod
	 */
	public void setInterchange2Nod(String interchange2Nod) {
		this.interchange2Nod = interchange2Nod;
	}
	
	/**
	 * Column Info
	 * @param mtcEdiRcvRsltDt
	 */
	public void setMtcEdiRcvRsltDt(String mtcEdiRcvRsltDt) {
		this.mtcEdiRcvRsltDt = mtcEdiRcvRsltDt;
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
		setBkgCgoTpCd(JSPUtil.getParameter(request, prefix + "bkg_cgo_tp_cd", ""));
		setStccCd(JSPUtil.getParameter(request, prefix + "stcc_cd", ""));
		setSubRailSeq(JSPUtil.getParameter(request, prefix + "sub_rail_seq", ""));
		setCgoTpCd(JSPUtil.getParameter(request, prefix + "cgo_tp_cd", ""));
		setProvVndrSeq(JSPUtil.getParameter(request, prefix + "prov_vndr_seq", ""));
		setRailOrdRjctFlg(JSPUtil.getParameter(request, prefix + "rail_ord_rjct_flg", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setPopImg(JSPUtil.getParameter(request, prefix + "pop_img", ""));
		setBilEdiRcvRsltFlg(JSPUtil.getParameter(request, prefix + "bil_edi_rcv_rslt_flg", ""));
		setTrspFrstFlg(JSPUtil.getParameter(request, prefix + "trsp_frst_flg", ""));
		setIbdCstmsClrLocCd(JSPUtil.getParameter(request, prefix + "ibd_cstms_clr_loc_cd", ""));
		setRailCmbThruTpNm(JSPUtil.getParameter(request, prefix + "rail_cmb_thru_tp_nm", ""));
		setBilEdiRsndDt(JSPUtil.getParameter(request, prefix + "bil_edi_rsnd_dt", ""));
		setCxlRqstRsn(JSPUtil.getParameter(request, prefix + "cxl_rqst_rsn", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setDwUpdDt(JSPUtil.getParameter(request, prefix + "dw_upd_dt", ""));
		setCntrWgt(JSPUtil.getParameter(request, prefix + "cntr_wgt", ""));
		setHzdMtrlScgAmt(JSPUtil.getParameter(request, prefix + "hzd_mtrl_scg_amt", ""));
		setCfmMsgSntDt(JSPUtil.getParameter(request, prefix + "cfm_msg_snt_dt", ""));
		setEqTpszCd(JSPUtil.getParameter(request, prefix + "eq_tpsz_cd", ""));
		setPodNodCd(JSPUtil.getParameter(request, prefix + "pod_nod_cd", ""));
		setInvFlg(JSPUtil.getParameter(request, prefix + "inv_flg", ""));
		setBkgNo(JSPUtil.getParameter(request, prefix + "bkg_no", ""));
		setBilEdiRcvRsltDt(JSPUtil.getParameter(request, prefix + "bil_edi_rcv_rslt_dt", ""));
		setCndCstmsClrFlg(JSPUtil.getParameter(request, prefix + "cnd_cstms_clr_flg", ""));
		setUsaEdiCd(JSPUtil.getParameter(request, prefix + "usa_edi_cd", ""));
		setVndrAbbrNm(JSPUtil.getParameter(request, prefix + "vndr_abbr_nm", ""));
		setBkgSpe(JSPUtil.getParameter(request, prefix + "bkg_spe", ""));
		setLoclUpdDt(JSPUtil.getParameter(request, prefix + "locl_upd_dt", ""));
		setCmdtName(JSPUtil.getParameter(request, prefix + "cmdt_name", ""));
		setBilEdiRcvRsltCd(JSPUtil.getParameter(request, prefix + "bil_edi_rcv_rslt_cd", ""));
		setTotAmt(JSPUtil.getParameter(request, prefix + "tot_amt", ""));
		setUplnSoFlg(JSPUtil.getParameter(request, prefix + "upln_so_flg", ""));
		setDeltFlg(JSPUtil.getParameter(request, prefix + "delt_flg", ""));
		setToNodYard(JSPUtil.getParameter(request, prefix + "to_nod_yard", ""));
		setPlnYrwk(JSPUtil.getParameter(request, prefix + "pln_yrwk", ""));
		setFmNodYard(JSPUtil.getParameter(request, prefix + "fm_nod_yard", ""));
		setBilEdiRsntDt(JSPUtil.getParameter(request, prefix + "bil_edi_rsnt_dt", ""));
		setCxlRqstRjctDtHms(JSPUtil.getParameter(request, prefix + "cxl_rqst_rjct_dt_hms", ""));
		setWoRjctRsn(JSPUtil.getParameter(request, prefix + "wo_rjct_rsn", ""));
		setInterRmk(JSPUtil.getParameter(request, prefix + "inter_rmk", ""));
		setTrspSoStsCd(JSPUtil.getParameter(request, prefix + "trsp_so_sts_cd", ""));
		setMtcEdiRcvRsltDtHms(JSPUtil.getParameter(request, prefix + "mtc_edi_rcv_rslt_dt_hms", ""));
		setShprCustNm(JSPUtil.getParameter(request, prefix + "shpr_cust_nm", ""));
		setBilEdiSntDtHms(JSPUtil.getParameter(request, prefix + "bil_edi_snt_dt_hms", ""));
		setPorNodCd(JSPUtil.getParameter(request, prefix + "por_nod_cd", ""));
		setTrspSoStsCdNm(JSPUtil.getParameter(request, prefix + "trsp_so_sts_cd_nm", ""));
		setAutoXptSysCd(JSPUtil.getParameter(request, prefix + "auto_xpt_sys_cd", ""));
		setLoclCreDt(JSPUtil.getParameter(request, prefix + "locl_cre_dt", ""));
		setBzcAmt(JSPUtil.getParameter(request, prefix + "bzc_amt", ""));
		setFuelScgAmt(JSPUtil.getParameter(request, prefix + "fuel_scg_amt", ""));
		setFmNodCd(JSPUtil.getParameter(request, prefix + "fm_nod_cd", ""));
		setInvNo(JSPUtil.getParameter(request, prefix + "inv_no", ""));
		setSlanCd(JSPUtil.getParameter(request, prefix + "slan_cd", ""));
		setAutoXptSysNo(JSPUtil.getParameter(request, prefix + "auto_xpt_sys_no", ""));
		setCxlRqstDt(JSPUtil.getParameter(request, prefix + "cxl_rqst_dt", ""));
		setCneeCustNm(JSPUtil.getParameter(request, prefix + "cnee_cust_nm", ""));
		setCostActGrpSeq(JSPUtil.getParameter(request, prefix + "cost_act_grp_seq", ""));
		setScgAmt(JSPUtil.getParameter(request, prefix + "scg_amt", ""));
		setRefNo(JSPUtil.getParameter(request, prefix + "ref_no", ""));
		setMtcEdiIndCd(JSPUtil.getParameter(request, prefix + "mtc_edi_ind_cd", ""));
		setStccDesc(JSPUtil.getParameter(request, prefix + "stcc_desc", ""));
		setToNodCd(JSPUtil.getParameter(request, prefix + "to_nod_cd", ""));
		setTrspSoSrcCd(JSPUtil.getParameter(request, prefix + "trsp_so_src_cd", ""));
		setTrspSoSeq(JSPUtil.getParameter(request, prefix + "trsp_so_seq", ""));
		setCopNo(JSPUtil.getParameter(request, prefix + "cop_no", ""));
		setBlNo(JSPUtil.getParameter(request, prefix + "bl_no", ""));
		setSpclCgoCntrTpCd(JSPUtil.getParameter(request, prefix + "spcl_cgo_cntr_tp_cd", ""));
		setMtcEdiRcvRsltFlg(JSPUtil.getParameter(request, prefix + "mtc_edi_rcv_rslt_flg", ""));
		setDelNodCd(JSPUtil.getParameter(request, prefix + "del_nod_cd", ""));
		setBilIssStsCd(JSPUtil.getParameter(request, prefix + "bil_iss_sts_cd", ""));
		setTareWgt(JSPUtil.getParameter(request, prefix + "tare_wgt", ""));
		setBilEdiRsndRcvRsltCd(JSPUtil.getParameter(request, prefix + "bil_edi_rsnd_rcv_rslt_cd", ""));
		setTrunkvvd(JSPUtil.getParameter(request, prefix + "trunkvvd", ""));
		setRailCrrRefNo(JSPUtil.getParameter(request, prefix + "rail_crr_ref_no", ""));
		setBilEdiCtrlSeq(JSPUtil.getParameter(request, prefix + "bil_edi_ctrl_seq", ""));
		setCxlRqstRjctDt(JSPUtil.getParameter(request, prefix + "cxl_rqst_rjct_dt", ""));
		setDelSccCd(JSPUtil.getParameter(request, prefix + "del_scc_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setLastchk(JSPUtil.getParameter(request, prefix + "lastchk", ""));
		setBilEdiRsntDtHms(JSPUtil.getParameter(request, prefix + "bil_edi_rsnt_dt_hms", ""));
		setYdChrCd(JSPUtil.getParameter(request, prefix + "yd_chr_cd", ""));
		setGrossWgt(JSPUtil.getParameter(request, prefix + "gross_wgt", ""));
		setTrspAgmtSeq(JSPUtil.getParameter(request, prefix + "trsp_agmt_seq", ""));
		setVndrSeq(JSPUtil.getParameter(request, prefix + "vndr_seq", ""));
		setIbdNo(JSPUtil.getParameter(request, prefix + "ibd_no", ""));
		setExptAckVndrFlg(JSPUtil.getParameter(request, prefix + "expt_ack_vndr_flg", ""));
		setCurrCd(JSPUtil.getParameter(request, prefix + "curr_cd", ""));
		setWaybillNo(JSPUtil.getParameter(request, prefix + "waybill_no", ""));
		setCfmMsgSntDtHms(JSPUtil.getParameter(request, prefix + "cfm_msg_snt_dt_hms", ""));
		setRefId(JSPUtil.getParameter(request, prefix + "ref_id", ""));
		setBilIssKnt(JSPUtil.getParameter(request, prefix + "bil_iss_knt", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setTrspAgmtOfcCtyCd(JSPUtil.getParameter(request, prefix + "trsp_agmt_ofc_cty_cd", ""));
		setVgmWgt(JSPUtil.getParameter(request, prefix + "vgm_wgt", ""));
		setTrspSoOfcCtyCd(JSPUtil.getParameter(request, prefix + "trsp_so_ofc_cty_cd", ""));
		setCreDtHms(JSPUtil.getParameter(request, prefix + "cre_dt_hms", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setRailBlkCd(JSPUtil.getParameter(request, prefix + "rail_blk_cd", ""));
		setEqNo(JSPUtil.getParameter(request, prefix + "eq_no", ""));
		setCreOfcCd(JSPUtil.getParameter(request, prefix + "cre_ofc_cd", ""));
		setCxlRqstRjctRsn(JSPUtil.getParameter(request, prefix + "cxl_rqst_rjct_rsn", ""));
		setTrspRailBilTpCd(JSPUtil.getParameter(request, prefix + "trsp_rail_bil_tp_cd", ""));
		setInterchange1Loc(JSPUtil.getParameter(request, prefix + "interchange1_loc", ""));
		setSpclInstrRmk(JSPUtil.getParameter(request, prefix + "spcl_instr_rmk", ""));
		setOvrWgtScgAmt(JSPUtil.getParameter(request, prefix + "ovr_wgt_scg_amt", ""));
		setRailCmbThruTpCd(JSPUtil.getParameter(request, prefix + "rail_cmb_thru_tp_cd", ""));
		setEtcAddAmt(JSPUtil.getParameter(request, prefix + "etc_add_amt", ""));
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setChk2(JSPUtil.getParameter(request, prefix + "chk2", ""));
		setInterchange1Nod(JSPUtil.getParameter(request, prefix + "interchange1_nod", ""));
		setChk3(JSPUtil.getParameter(request, prefix + "chk3", ""));
		setChk4(JSPUtil.getParameter(request, prefix + "chk4", ""));
		setTrspBndCd(JSPUtil.getParameter(request, prefix + "trsp_bnd_cd", ""));
		setChk5(JSPUtil.getParameter(request, prefix + "chk5", ""));
		setBkgCntrAttached(JSPUtil.getParameter(request, prefix + "bkg_cntr_attached", ""));
		setChk1(JSPUtil.getParameter(request, prefix + "chk1", ""));
		setPolNodCd(JSPUtil.getParameter(request, prefix + "pol_nod_cd", ""));
		setCxlRqstFlg(JSPUtil.getParameter(request, prefix + "cxl_rqst_flg", ""));
		setInterchange2Loc(JSPUtil.getParameter(request, prefix + "interchange2_loc", ""));
		setRepoPlnId(JSPUtil.getParameter(request, prefix + "repo_pln_id", ""));
		setRefSeq(JSPUtil.getParameter(request, prefix + "ref_seq", ""));
		setBilEdiSntDt(JSPUtil.getParameter(request, prefix + "bil_edi_snt_dt", ""));
		setCcredt(JSPUtil.getParameter(request, prefix + "ccredt", ""));
		setBilEdiRsndRcvRsltDt(JSPUtil.getParameter(request, prefix + "bil_edi_rsnd_rcv_rslt_dt", ""));
		setBilEdiRcvRsltDtHms(JSPUtil.getParameter(request, prefix + "bil_edi_rcv_rslt_dt_hms", ""));
		setEdiUsrId(JSPUtil.getParameter(request, prefix + "edi_usr_id", ""));
		setCxlRqstDtHms(JSPUtil.getParameter(request, prefix + "cxl_rqst_dt_hms", ""));
		setCntrSealNo(JSPUtil.getParameter(request, prefix + "cntr_seal_no", ""));
		setInterchange2Nod(JSPUtil.getParameter(request, prefix + "interchange2_nod", ""));
		setMtcEdiRcvRsltDt(JSPUtil.getParameter(request, prefix + "mtc_edi_rcv_rslt_dt", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return TrsTrspEdiRailOrdVO[]
	 */
	public TrsTrspEdiRailOrdVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return TrsTrspEdiRailOrdVO[]
	 */
	public TrsTrspEdiRailOrdVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		TrsTrspEdiRailOrdVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] bkgCgoTpCd = (JSPUtil.getParameter(request, prefix	+ "bkg_cgo_tp_cd", length));
			String[] stccCd = (JSPUtil.getParameter(request, prefix	+ "stcc_cd", length));
			String[] subRailSeq = (JSPUtil.getParameter(request, prefix	+ "sub_rail_seq", length));
			String[] cgoTpCd = (JSPUtil.getParameter(request, prefix	+ "cgo_tp_cd", length));
			String[] provVndrSeq = (JSPUtil.getParameter(request, prefix	+ "prov_vndr_seq", length));
			String[] railOrdRjctFlg = (JSPUtil.getParameter(request, prefix	+ "rail_ord_rjct_flg", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] popImg = (JSPUtil.getParameter(request, prefix	+ "pop_img", length));
			String[] bilEdiRcvRsltFlg = (JSPUtil.getParameter(request, prefix	+ "bil_edi_rcv_rslt_flg", length));
			String[] trspFrstFlg = (JSPUtil.getParameter(request, prefix	+ "trsp_frst_flg", length));
			String[] ibdCstmsClrLocCd = (JSPUtil.getParameter(request, prefix	+ "ibd_cstms_clr_loc_cd", length));
			String[] railCmbThruTpNm = (JSPUtil.getParameter(request, prefix	+ "rail_cmb_thru_tp_nm", length));
			String[] bilEdiRsndDt = (JSPUtil.getParameter(request, prefix	+ "bil_edi_rsnd_dt", length));
			String[] cxlRqstRsn = (JSPUtil.getParameter(request, prefix	+ "cxl_rqst_rsn", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] dwUpdDt = (JSPUtil.getParameter(request, prefix	+ "dw_upd_dt", length));
			String[] cntrWgt = (JSPUtil.getParameter(request, prefix	+ "cntr_wgt", length));
			String[] hzdMtrlScgAmt = (JSPUtil.getParameter(request, prefix	+ "hzd_mtrl_scg_amt", length));
			String[] cfmMsgSntDt = (JSPUtil.getParameter(request, prefix	+ "cfm_msg_snt_dt", length));
			String[] eqTpszCd = (JSPUtil.getParameter(request, prefix	+ "eq_tpsz_cd", length));
			String[] podNodCd = (JSPUtil.getParameter(request, prefix	+ "pod_nod_cd", length));
			String[] invFlg = (JSPUtil.getParameter(request, prefix	+ "inv_flg", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] bilEdiRcvRsltDt = (JSPUtil.getParameter(request, prefix	+ "bil_edi_rcv_rslt_dt", length));
			String[] cndCstmsClrFlg = (JSPUtil.getParameter(request, prefix	+ "cnd_cstms_clr_flg", length));
			String[] usaEdiCd = (JSPUtil.getParameter(request, prefix	+ "usa_edi_cd", length));
			String[] vndrAbbrNm = (JSPUtil.getParameter(request, prefix	+ "vndr_abbr_nm", length));
			String[] bkgSpe = (JSPUtil.getParameter(request, prefix	+ "bkg_spe", length));
			String[] loclUpdDt = (JSPUtil.getParameter(request, prefix	+ "locl_upd_dt", length));
			String[] cmdtName = (JSPUtil.getParameter(request, prefix	+ "cmdt_name", length));
			String[] bilEdiRcvRsltCd = (JSPUtil.getParameter(request, prefix	+ "bil_edi_rcv_rslt_cd", length));
			String[] totAmt = (JSPUtil.getParameter(request, prefix	+ "tot_amt", length));
			String[] uplnSoFlg = (JSPUtil.getParameter(request, prefix	+ "upln_so_flg", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] toNodYard = (JSPUtil.getParameter(request, prefix	+ "to_nod_yard", length));
			String[] plnYrwk = (JSPUtil.getParameter(request, prefix	+ "pln_yrwk", length));
			String[] fmNodYard = (JSPUtil.getParameter(request, prefix	+ "fm_nod_yard", length));
			String[] bilEdiRsntDt = (JSPUtil.getParameter(request, prefix	+ "bil_edi_rsnt_dt", length));
			String[] cxlRqstRjctDtHms = (JSPUtil.getParameter(request, prefix	+ "cxl_rqst_rjct_dt_hms", length));
			String[] woRjctRsn = (JSPUtil.getParameter(request, prefix	+ "wo_rjct_rsn", length));
			String[] interRmk = (JSPUtil.getParameter(request, prefix	+ "inter_rmk", length));
			String[] trspSoStsCd = (JSPUtil.getParameter(request, prefix	+ "trsp_so_sts_cd", length));
			String[] mtcEdiRcvRsltDtHms = (JSPUtil.getParameter(request, prefix	+ "mtc_edi_rcv_rslt_dt_hms", length));
			String[] shprCustNm = (JSPUtil.getParameter(request, prefix	+ "shpr_cust_nm", length));
			String[] bilEdiSntDtHms = (JSPUtil.getParameter(request, prefix	+ "bil_edi_snt_dt_hms", length));
			String[] porNodCd = (JSPUtil.getParameter(request, prefix	+ "por_nod_cd", length));
			String[] trspSoStsCdNm = (JSPUtil.getParameter(request, prefix	+ "trsp_so_sts_cd_nm", length));
			String[] autoXptSysCd = (JSPUtil.getParameter(request, prefix	+ "auto_xpt_sys_cd", length));
			String[] loclCreDt = (JSPUtil.getParameter(request, prefix	+ "locl_cre_dt", length));
			String[] bzcAmt = (JSPUtil.getParameter(request, prefix	+ "bzc_amt", length));
			String[] fuelScgAmt = (JSPUtil.getParameter(request, prefix	+ "fuel_scg_amt", length));
			String[] fmNodCd = (JSPUtil.getParameter(request, prefix	+ "fm_nod_cd", length));
			String[] invNo = (JSPUtil.getParameter(request, prefix	+ "inv_no", length));
			String[] slanCd = (JSPUtil.getParameter(request, prefix	+ "slan_cd", length));
			String[] autoXptSysNo = (JSPUtil.getParameter(request, prefix	+ "auto_xpt_sys_no", length));
			String[] cxlRqstDt = (JSPUtil.getParameter(request, prefix	+ "cxl_rqst_dt", length));
			String[] cneeCustNm = (JSPUtil.getParameter(request, prefix	+ "cnee_cust_nm", length));
			String[] costActGrpSeq = (JSPUtil.getParameter(request, prefix	+ "cost_act_grp_seq", length));
			String[] scgAmt = (JSPUtil.getParameter(request, prefix	+ "scg_amt", length));
			String[] refNo = (JSPUtil.getParameter(request, prefix	+ "ref_no", length));
			String[] mtcEdiIndCd = (JSPUtil.getParameter(request, prefix	+ "mtc_edi_ind_cd", length));
			String[] stccDesc = (JSPUtil.getParameter(request, prefix	+ "stcc_desc", length));
			String[] toNodCd = (JSPUtil.getParameter(request, prefix	+ "to_nod_cd", length));
			String[] trspSoSrcCd = (JSPUtil.getParameter(request, prefix	+ "trsp_so_src_cd", length));
			String[] trspSoSeq = (JSPUtil.getParameter(request, prefix	+ "trsp_so_seq", length));
			String[] copNo = (JSPUtil.getParameter(request, prefix	+ "cop_no", length));
			String[] blNo = (JSPUtil.getParameter(request, prefix	+ "bl_no", length));
			String[] spclCgoCntrTpCd = (JSPUtil.getParameter(request, prefix	+ "spcl_cgo_cntr_tp_cd", length));
			String[] mtcEdiRcvRsltFlg = (JSPUtil.getParameter(request, prefix	+ "mtc_edi_rcv_rslt_flg", length));
			String[] delNodCd = (JSPUtil.getParameter(request, prefix	+ "del_nod_cd", length));
			String[] bilIssStsCd = (JSPUtil.getParameter(request, prefix	+ "bil_iss_sts_cd", length));
			String[] tareWgt = (JSPUtil.getParameter(request, prefix	+ "tare_wgt", length));
			String[] bilEdiRsndRcvRsltCd = (JSPUtil.getParameter(request, prefix	+ "bil_edi_rsnd_rcv_rslt_cd", length));
			String[] trunkvvd = (JSPUtil.getParameter(request, prefix	+ "trunkvvd", length));
			String[] railCrrRefNo = (JSPUtil.getParameter(request, prefix	+ "rail_crr_ref_no", length));
			String[] bilEdiCtrlSeq = (JSPUtil.getParameter(request, prefix	+ "bil_edi_ctrl_seq", length));
			String[] cxlRqstRjctDt = (JSPUtil.getParameter(request, prefix	+ "cxl_rqst_rjct_dt", length));
			String[] delSccCd = (JSPUtil.getParameter(request, prefix	+ "del_scc_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] lastchk = (JSPUtil.getParameter(request, prefix	+ "lastchk", length));
			String[] bilEdiRsntDtHms = (JSPUtil.getParameter(request, prefix	+ "bil_edi_rsnt_dt_hms", length));
			String[] ydChrCd = (JSPUtil.getParameter(request, prefix	+ "yd_chr_cd", length));
			String[] grossWgt = (JSPUtil.getParameter(request, prefix	+ "gross_wgt", length));
			String[] trspAgmtSeq = (JSPUtil.getParameter(request, prefix	+ "trsp_agmt_seq", length));
			String[] vndrSeq = (JSPUtil.getParameter(request, prefix	+ "vndr_seq", length));
			String[] ibdNo = (JSPUtil.getParameter(request, prefix	+ "ibd_no", length));
			String[] exptAckVndrFlg = (JSPUtil.getParameter(request, prefix	+ "expt_ack_vndr_flg", length));
			String[] currCd = (JSPUtil.getParameter(request, prefix	+ "curr_cd", length));
			String[] waybillNo = (JSPUtil.getParameter(request, prefix	+ "waybill_no", length));
			String[] cfmMsgSntDtHms = (JSPUtil.getParameter(request, prefix	+ "cfm_msg_snt_dt_hms", length));
			String[] refId = (JSPUtil.getParameter(request, prefix	+ "ref_id", length));
			String[] bilIssKnt = (JSPUtil.getParameter(request, prefix	+ "bil_iss_knt", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] trspAgmtOfcCtyCd = (JSPUtil.getParameter(request, prefix	+ "trsp_agmt_ofc_cty_cd", length));
			String[] vgmWgt = (JSPUtil.getParameter(request, prefix	+ "vgm_wgt", length));
			String[] trspSoOfcCtyCd = (JSPUtil.getParameter(request, prefix	+ "trsp_so_ofc_cty_cd", length));
			String[] creDtHms = (JSPUtil.getParameter(request, prefix	+ "cre_dt_hms", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] railBlkCd = (JSPUtil.getParameter(request, prefix	+ "rail_blk_cd", length));
			String[] eqNo = (JSPUtil.getParameter(request, prefix	+ "eq_no", length));
			String[] creOfcCd = (JSPUtil.getParameter(request, prefix	+ "cre_ofc_cd", length));
			String[] cxlRqstRjctRsn = (JSPUtil.getParameter(request, prefix	+ "cxl_rqst_rjct_rsn", length));
			String[] trspRailBilTpCd = (JSPUtil.getParameter(request, prefix	+ "trsp_rail_bil_tp_cd", length));
			String[] interchange1Loc = (JSPUtil.getParameter(request, prefix	+ "interchange1_loc", length));
			String[] spclInstrRmk = (JSPUtil.getParameter(request, prefix	+ "spcl_instr_rmk", length));
			String[] ovrWgtScgAmt = (JSPUtil.getParameter(request, prefix	+ "ovr_wgt_scg_amt", length));
			String[] railCmbThruTpCd = (JSPUtil.getParameter(request, prefix	+ "rail_cmb_thru_tp_cd", length));
			String[] etcAddAmt = (JSPUtil.getParameter(request, prefix	+ "etc_add_amt", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] chk2 = (JSPUtil.getParameter(request, prefix	+ "chk2", length));
			String[] interchange1Nod = (JSPUtil.getParameter(request, prefix	+ "interchange1_nod", length));
			String[] chk3 = (JSPUtil.getParameter(request, prefix	+ "chk3", length));
			String[] chk4 = (JSPUtil.getParameter(request, prefix	+ "chk4", length));
			String[] trspBndCd = (JSPUtil.getParameter(request, prefix	+ "trsp_bnd_cd", length));
			String[] chk5 = (JSPUtil.getParameter(request, prefix	+ "chk5", length));
			String[] bkgCntrAttached = (JSPUtil.getParameter(request, prefix	+ "bkg_cntr_attached", length));
			String[] chk1 = (JSPUtil.getParameter(request, prefix	+ "chk1", length));
			String[] polNodCd = (JSPUtil.getParameter(request, prefix	+ "pol_nod_cd", length));
			String[] cxlRqstFlg = (JSPUtil.getParameter(request, prefix	+ "cxl_rqst_flg", length));
			String[] interchange2Loc = (JSPUtil.getParameter(request, prefix	+ "interchange2_loc", length));
			String[] repoPlnId = (JSPUtil.getParameter(request, prefix	+ "repo_pln_id", length));
			String[] refSeq = (JSPUtil.getParameter(request, prefix	+ "ref_seq", length));
			String[] bilEdiSntDt = (JSPUtil.getParameter(request, prefix	+ "bil_edi_snt_dt", length));
			String[] ccredt = (JSPUtil.getParameter(request, prefix	+ "ccredt", length));
			String[] bilEdiRsndRcvRsltDt = (JSPUtil.getParameter(request, prefix	+ "bil_edi_rsnd_rcv_rslt_dt", length));
			String[] bilEdiRcvRsltDtHms = (JSPUtil.getParameter(request, prefix	+ "bil_edi_rcv_rslt_dt_hms", length));
			String[] ediUsrId = (JSPUtil.getParameter(request, prefix	+ "edi_usr_id", length));
			String[] cxlRqstDtHms = (JSPUtil.getParameter(request, prefix	+ "cxl_rqst_dt_hms", length));
			String[] cntrSealNo = (JSPUtil.getParameter(request, prefix	+ "cntr_seal_no", length));
			String[] interchange2Nod = (JSPUtil.getParameter(request, prefix	+ "interchange2_nod", length));
			String[] mtcEdiRcvRsltDt = (JSPUtil.getParameter(request, prefix	+ "mtc_edi_rcv_rslt_dt", length));
			
			for (int i = 0; i < length; i++) {
				model = new TrsTrspEdiRailOrdVO();
				if (bkgCgoTpCd[i] != null)
					model.setBkgCgoTpCd(bkgCgoTpCd[i]);
				if (stccCd[i] != null)
					model.setStccCd(stccCd[i]);
				if (subRailSeq[i] != null)
					model.setSubRailSeq(subRailSeq[i]);
				if (cgoTpCd[i] != null)
					model.setCgoTpCd(cgoTpCd[i]);
				if (provVndrSeq[i] != null)
					model.setProvVndrSeq(provVndrSeq[i]);
				if (railOrdRjctFlg[i] != null)
					model.setRailOrdRjctFlg(railOrdRjctFlg[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (popImg[i] != null)
					model.setPopImg(popImg[i]);
				if (bilEdiRcvRsltFlg[i] != null)
					model.setBilEdiRcvRsltFlg(bilEdiRcvRsltFlg[i]);
				if (trspFrstFlg[i] != null)
					model.setTrspFrstFlg(trspFrstFlg[i]);
				if (ibdCstmsClrLocCd[i] != null)
					model.setIbdCstmsClrLocCd(ibdCstmsClrLocCd[i]);
				if (railCmbThruTpNm[i] != null)
					model.setRailCmbThruTpNm(railCmbThruTpNm[i]);
				if (bilEdiRsndDt[i] != null)
					model.setBilEdiRsndDt(bilEdiRsndDt[i]);
				if (cxlRqstRsn[i] != null)
					model.setCxlRqstRsn(cxlRqstRsn[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (dwUpdDt[i] != null)
					model.setDwUpdDt(dwUpdDt[i]);
				if (cntrWgt[i] != null)
					model.setCntrWgt(cntrWgt[i]);
				if (hzdMtrlScgAmt[i] != null)
					model.setHzdMtrlScgAmt(hzdMtrlScgAmt[i]);
				if (cfmMsgSntDt[i] != null)
					model.setCfmMsgSntDt(cfmMsgSntDt[i]);
				if (eqTpszCd[i] != null)
					model.setEqTpszCd(eqTpszCd[i]);
				if (podNodCd[i] != null)
					model.setPodNodCd(podNodCd[i]);
				if (invFlg[i] != null)
					model.setInvFlg(invFlg[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (bilEdiRcvRsltDt[i] != null)
					model.setBilEdiRcvRsltDt(bilEdiRcvRsltDt[i]);
				if (cndCstmsClrFlg[i] != null)
					model.setCndCstmsClrFlg(cndCstmsClrFlg[i]);
				if (usaEdiCd[i] != null)
					model.setUsaEdiCd(usaEdiCd[i]);
				if (vndrAbbrNm[i] != null)
					model.setVndrAbbrNm(vndrAbbrNm[i]);
				if (bkgSpe[i] != null)
					model.setBkgSpe(bkgSpe[i]);
				if (loclUpdDt[i] != null)
					model.setLoclUpdDt(loclUpdDt[i]);
				if (cmdtName[i] != null)
					model.setCmdtName(cmdtName[i]);
				if (bilEdiRcvRsltCd[i] != null)
					model.setBilEdiRcvRsltCd(bilEdiRcvRsltCd[i]);
				if (totAmt[i] != null)
					model.setTotAmt(totAmt[i]);
				if (uplnSoFlg[i] != null)
					model.setUplnSoFlg(uplnSoFlg[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (toNodYard[i] != null)
					model.setToNodYard(toNodYard[i]);
				if (plnYrwk[i] != null)
					model.setPlnYrwk(plnYrwk[i]);
				if (fmNodYard[i] != null)
					model.setFmNodYard(fmNodYard[i]);
				if (bilEdiRsntDt[i] != null)
					model.setBilEdiRsntDt(bilEdiRsntDt[i]);
				if (cxlRqstRjctDtHms[i] != null)
					model.setCxlRqstRjctDtHms(cxlRqstRjctDtHms[i]);
				if (woRjctRsn[i] != null)
					model.setWoRjctRsn(woRjctRsn[i]);
				if (interRmk[i] != null)
					model.setInterRmk(interRmk[i]);
				if (trspSoStsCd[i] != null)
					model.setTrspSoStsCd(trspSoStsCd[i]);
				if (mtcEdiRcvRsltDtHms[i] != null)
					model.setMtcEdiRcvRsltDtHms(mtcEdiRcvRsltDtHms[i]);
				if (shprCustNm[i] != null)
					model.setShprCustNm(shprCustNm[i]);
				if (bilEdiSntDtHms[i] != null)
					model.setBilEdiSntDtHms(bilEdiSntDtHms[i]);
				if (porNodCd[i] != null)
					model.setPorNodCd(porNodCd[i]);
				if (trspSoStsCdNm[i] != null)
					model.setTrspSoStsCdNm(trspSoStsCdNm[i]);
				if (autoXptSysCd[i] != null)
					model.setAutoXptSysCd(autoXptSysCd[i]);
				if (loclCreDt[i] != null)
					model.setLoclCreDt(loclCreDt[i]);
				if (bzcAmt[i] != null)
					model.setBzcAmt(bzcAmt[i]);
				if (fuelScgAmt[i] != null)
					model.setFuelScgAmt(fuelScgAmt[i]);
				if (fmNodCd[i] != null)
					model.setFmNodCd(fmNodCd[i]);
				if (invNo[i] != null)
					model.setInvNo(invNo[i]);
				if (slanCd[i] != null)
					model.setSlanCd(slanCd[i]);
				if (autoXptSysNo[i] != null)
					model.setAutoXptSysNo(autoXptSysNo[i]);
				if (cxlRqstDt[i] != null)
					model.setCxlRqstDt(cxlRqstDt[i]);
				if (cneeCustNm[i] != null)
					model.setCneeCustNm(cneeCustNm[i]);
				if (costActGrpSeq[i] != null)
					model.setCostActGrpSeq(costActGrpSeq[i]);
				if (scgAmt[i] != null)
					model.setScgAmt(scgAmt[i]);
				if (refNo[i] != null)
					model.setRefNo(refNo[i]);
				if (mtcEdiIndCd[i] != null)
					model.setMtcEdiIndCd(mtcEdiIndCd[i]);
				if (stccDesc[i] != null)
					model.setStccDesc(stccDesc[i]);
				if (toNodCd[i] != null)
					model.setToNodCd(toNodCd[i]);
				if (trspSoSrcCd[i] != null)
					model.setTrspSoSrcCd(trspSoSrcCd[i]);
				if (trspSoSeq[i] != null)
					model.setTrspSoSeq(trspSoSeq[i]);
				if (copNo[i] != null)
					model.setCopNo(copNo[i]);
				if (blNo[i] != null)
					model.setBlNo(blNo[i]);
				if (spclCgoCntrTpCd[i] != null)
					model.setSpclCgoCntrTpCd(spclCgoCntrTpCd[i]);
				if (mtcEdiRcvRsltFlg[i] != null)
					model.setMtcEdiRcvRsltFlg(mtcEdiRcvRsltFlg[i]);
				if (delNodCd[i] != null)
					model.setDelNodCd(delNodCd[i]);
				if (bilIssStsCd[i] != null)
					model.setBilIssStsCd(bilIssStsCd[i]);
				if (tareWgt[i] != null)
					model.setTareWgt(tareWgt[i]);
				if (bilEdiRsndRcvRsltCd[i] != null)
					model.setBilEdiRsndRcvRsltCd(bilEdiRsndRcvRsltCd[i]);
				if (trunkvvd[i] != null)
					model.setTrunkvvd(trunkvvd[i]);
				if (railCrrRefNo[i] != null)
					model.setRailCrrRefNo(railCrrRefNo[i]);
				if (bilEdiCtrlSeq[i] != null)
					model.setBilEdiCtrlSeq(bilEdiCtrlSeq[i]);
				if (cxlRqstRjctDt[i] != null)
					model.setCxlRqstRjctDt(cxlRqstRjctDt[i]);
				if (delSccCd[i] != null)
					model.setDelSccCd(delSccCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (lastchk[i] != null)
					model.setLastchk(lastchk[i]);
				if (bilEdiRsntDtHms[i] != null)
					model.setBilEdiRsntDtHms(bilEdiRsntDtHms[i]);
				if (ydChrCd[i] != null)
					model.setYdChrCd(ydChrCd[i]);
				if (grossWgt[i] != null)
					model.setGrossWgt(grossWgt[i]);
				if (trspAgmtSeq[i] != null)
					model.setTrspAgmtSeq(trspAgmtSeq[i]);
				if (vndrSeq[i] != null)
					model.setVndrSeq(vndrSeq[i]);
				if (ibdNo[i] != null)
					model.setIbdNo(ibdNo[i]);
				if (exptAckVndrFlg[i] != null)
					model.setExptAckVndrFlg(exptAckVndrFlg[i]);
				if (currCd[i] != null)
					model.setCurrCd(currCd[i]);
				if (waybillNo[i] != null)
					model.setWaybillNo(waybillNo[i]);
				if (cfmMsgSntDtHms[i] != null)
					model.setCfmMsgSntDtHms(cfmMsgSntDtHms[i]);
				if (refId[i] != null)
					model.setRefId(refId[i]);
				if (bilIssKnt[i] != null)
					model.setBilIssKnt(bilIssKnt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (trspAgmtOfcCtyCd[i] != null)
					model.setTrspAgmtOfcCtyCd(trspAgmtOfcCtyCd[i]);
				if (vgmWgt[i] != null)
					model.setVgmWgt(vgmWgt[i]);
				if (trspSoOfcCtyCd[i] != null)
					model.setTrspSoOfcCtyCd(trspSoOfcCtyCd[i]);
				if (creDtHms[i] != null)
					model.setCreDtHms(creDtHms[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (railBlkCd[i] != null)
					model.setRailBlkCd(railBlkCd[i]);
				if (eqNo[i] != null)
					model.setEqNo(eqNo[i]);
				if (creOfcCd[i] != null)
					model.setCreOfcCd(creOfcCd[i]);
				if (cxlRqstRjctRsn[i] != null)
					model.setCxlRqstRjctRsn(cxlRqstRjctRsn[i]);
				if (trspRailBilTpCd[i] != null)
					model.setTrspRailBilTpCd(trspRailBilTpCd[i]);
				if (interchange1Loc[i] != null)
					model.setInterchange1Loc(interchange1Loc[i]);
				if (spclInstrRmk[i] != null)
					model.setSpclInstrRmk(spclInstrRmk[i]);
				if (ovrWgtScgAmt[i] != null)
					model.setOvrWgtScgAmt(ovrWgtScgAmt[i]);
				if (railCmbThruTpCd[i] != null)
					model.setRailCmbThruTpCd(railCmbThruTpCd[i]);
				if (etcAddAmt[i] != null)
					model.setEtcAddAmt(etcAddAmt[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (chk2[i] != null)
					model.setChk2(chk2[i]);
				if (interchange1Nod[i] != null)
					model.setInterchange1Nod(interchange1Nod[i]);
				if (chk3[i] != null)
					model.setChk3(chk3[i]);
				if (chk4[i] != null)
					model.setChk4(chk4[i]);
				if (trspBndCd[i] != null)
					model.setTrspBndCd(trspBndCd[i]);
				if (chk5[i] != null)
					model.setChk5(chk5[i]);
				if (bkgCntrAttached[i] != null)
					model.setBkgCntrAttached(bkgCntrAttached[i]);
				if (chk1[i] != null)
					model.setChk1(chk1[i]);
				if (polNodCd[i] != null)
					model.setPolNodCd(polNodCd[i]);
				if (cxlRqstFlg[i] != null)
					model.setCxlRqstFlg(cxlRqstFlg[i]);
				if (interchange2Loc[i] != null)
					model.setInterchange2Loc(interchange2Loc[i]);
				if (repoPlnId[i] != null)
					model.setRepoPlnId(repoPlnId[i]);
				if (refSeq[i] != null)
					model.setRefSeq(refSeq[i]);
				if (bilEdiSntDt[i] != null)
					model.setBilEdiSntDt(bilEdiSntDt[i]);
				if (ccredt[i] != null)
					model.setCcredt(ccredt[i]);
				if (bilEdiRsndRcvRsltDt[i] != null)
					model.setBilEdiRsndRcvRsltDt(bilEdiRsndRcvRsltDt[i]);
				if (bilEdiRcvRsltDtHms[i] != null)
					model.setBilEdiRcvRsltDtHms(bilEdiRcvRsltDtHms[i]);
				if (ediUsrId[i] != null)
					model.setEdiUsrId(ediUsrId[i]);
				if (cxlRqstDtHms[i] != null)
					model.setCxlRqstDtHms(cxlRqstDtHms[i]);
				if (cntrSealNo[i] != null)
					model.setCntrSealNo(cntrSealNo[i]);
				if (interchange2Nod[i] != null)
					model.setInterchange2Nod(interchange2Nod[i]);
				if (mtcEdiRcvRsltDt[i] != null)
					model.setMtcEdiRcvRsltDt(mtcEdiRcvRsltDt[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getTrsTrspEdiRailOrdVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return TrsTrspEdiRailOrdVO[]
	 */
	public TrsTrspEdiRailOrdVO[] getTrsTrspEdiRailOrdVOs(){
		TrsTrspEdiRailOrdVO[] vos = (TrsTrspEdiRailOrdVO[])models.toArray(new TrsTrspEdiRailOrdVO[models.size()]);
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
		this.bkgCgoTpCd = this.bkgCgoTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stccCd = this.stccCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.subRailSeq = this.subRailSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cgoTpCd = this.cgoTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.provVndrSeq = this.provVndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.railOrdRjctFlg = this.railOrdRjctFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.popImg = this.popImg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bilEdiRcvRsltFlg = this.bilEdiRcvRsltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspFrstFlg = this.trspFrstFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibdCstmsClrLocCd = this.ibdCstmsClrLocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.railCmbThruTpNm = this.railCmbThruTpNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bilEdiRsndDt = this.bilEdiRsndDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cxlRqstRsn = this.cxlRqstRsn .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dwUpdDt = this.dwUpdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrWgt = this.cntrWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hzdMtrlScgAmt = this.hzdMtrlScgAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cfmMsgSntDt = this.cfmMsgSntDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqTpszCd = this.eqTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.podNodCd = this.podNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invFlg = this.invFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bilEdiRcvRsltDt = this.bilEdiRcvRsltDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cndCstmsClrFlg = this.cndCstmsClrFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usaEdiCd = this.usaEdiCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrAbbrNm = this.vndrAbbrNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgSpe = this.bkgSpe .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.loclUpdDt = this.loclUpdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cmdtName = this.cmdtName .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bilEdiRcvRsltCd = this.bilEdiRcvRsltCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.totAmt = this.totAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.uplnSoFlg = this.uplnSoFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.toNodYard = this.toNodYard .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.plnYrwk = this.plnYrwk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fmNodYard = this.fmNodYard .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bilEdiRsntDt = this.bilEdiRsntDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cxlRqstRjctDtHms = this.cxlRqstRjctDtHms .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.woRjctRsn = this.woRjctRsn .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.interRmk = this.interRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspSoStsCd = this.trspSoStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mtcEdiRcvRsltDtHms = this.mtcEdiRcvRsltDtHms .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.shprCustNm = this.shprCustNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bilEdiSntDtHms = this.bilEdiSntDtHms .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.porNodCd = this.porNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspSoStsCdNm = this.trspSoStsCdNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.autoXptSysCd = this.autoXptSysCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.loclCreDt = this.loclCreDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bzcAmt = this.bzcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fuelScgAmt = this.fuelScgAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fmNodCd = this.fmNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invNo = this.invNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slanCd = this.slanCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.autoXptSysNo = this.autoXptSysNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cxlRqstDt = this.cxlRqstDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cneeCustNm = this.cneeCustNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costActGrpSeq = this.costActGrpSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.scgAmt = this.scgAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.refNo = this.refNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mtcEdiIndCd = this.mtcEdiIndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stccDesc = this.stccDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.toNodCd = this.toNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspSoSrcCd = this.trspSoSrcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspSoSeq = this.trspSoSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.copNo = this.copNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blNo = this.blNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spclCgoCntrTpCd = this.spclCgoCntrTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mtcEdiRcvRsltFlg = this.mtcEdiRcvRsltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.delNodCd = this.delNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bilIssStsCd = this.bilIssStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tareWgt = this.tareWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bilEdiRsndRcvRsltCd = this.bilEdiRsndRcvRsltCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trunkvvd = this.trunkvvd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.railCrrRefNo = this.railCrrRefNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bilEdiCtrlSeq = this.bilEdiCtrlSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cxlRqstRjctDt = this.cxlRqstRjctDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.delSccCd = this.delSccCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lastchk = this.lastchk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bilEdiRsntDtHms = this.bilEdiRsntDtHms .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydChrCd = this.ydChrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.grossWgt = this.grossWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspAgmtSeq = this.trspAgmtSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrSeq = this.vndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibdNo = this.ibdNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.exptAckVndrFlg = this.exptAckVndrFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.currCd = this.currCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.waybillNo = this.waybillNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cfmMsgSntDtHms = this.cfmMsgSntDtHms .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.refId = this.refId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bilIssKnt = this.bilIssKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspAgmtOfcCtyCd = this.trspAgmtOfcCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vgmWgt = this.vgmWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspSoOfcCtyCd = this.trspSoOfcCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDtHms = this.creDtHms .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.railBlkCd = this.railBlkCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqNo = this.eqNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creOfcCd = this.creOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cxlRqstRjctRsn = this.cxlRqstRjctRsn .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspRailBilTpCd = this.trspRailBilTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.interchange1Loc = this.interchange1Loc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spclInstrRmk = this.spclInstrRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ovrWgtScgAmt = this.ovrWgtScgAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.railCmbThruTpCd = this.railCmbThruTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.etcAddAmt = this.etcAddAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chk2 = this.chk2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.interchange1Nod = this.interchange1Nod .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chk3 = this.chk3 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chk4 = this.chk4 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspBndCd = this.trspBndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chk5 = this.chk5 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgCntrAttached = this.bkgCntrAttached .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chk1 = this.chk1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.polNodCd = this.polNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cxlRqstFlg = this.cxlRqstFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.interchange2Loc = this.interchange2Loc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.repoPlnId = this.repoPlnId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.refSeq = this.refSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bilEdiSntDt = this.bilEdiSntDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ccredt = this.ccredt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bilEdiRsndRcvRsltDt = this.bilEdiRsndRcvRsltDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bilEdiRcvRsltDtHms = this.bilEdiRcvRsltDtHms .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediUsrId = this.ediUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cxlRqstDtHms = this.cxlRqstDtHms .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrSealNo = this.cntrSealNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.interchange2Nod = this.interchange2Nod .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mtcEdiRcvRsltDt = this.mtcEdiRcvRsltDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
