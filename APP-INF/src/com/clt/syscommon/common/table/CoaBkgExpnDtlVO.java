/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CoaBkgExpnDtlVO.java
*@FileTitle : CoaBkgExpnDtlVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.25
*@LastModifier : 임옥영
*@LastVersion : 1.0
* 2009.09.25 임옥영 
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
 * @author 임옥영
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class CoaBkgExpnDtlVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CoaBkgExpnDtlVO> models = new ArrayList<CoaBkgExpnDtlVO>();
	
	/* Column Info */
	private String bkgCgoTpCd = null;
	/* Column Info */
	private String costRoutNo = null;
	/* Column Info */
	private String cneeCustSeq = null;
	/* Column Info */
	private String scRfaHldCustSeq = null;
	/* Column Info */
	private String n2ndPodCd = null;
	/* Column Info */
	private String ownVolActAmt = null;
	/* Column Info */
	private String cneeCntCd = null;
	/* Column Info */
	private String fullTrkDirComAmt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String ctrtHqOfcCd = null;
	/* Column Info */
	private String n2ndTrdCd = null;
	/* Column Info */
	private String bkgPodCd = null;
	/* Column Info */
	private String tmlComAmt = null;
	/* Column Info */
	private String ctrtOfcCd = null;
	/* Column Info */
	private String raCmCostTtlAmt = null;
	/* Column Info */
	private String slsOfcCd = null;
	/* Column Info */
	private String cntrTpszCd = null;
	/* Column Info */
	private String spclDgCgoFlg = null;
	/* Column Info */
	private String opInterSltRntlBseAmt = null;
	/* Column Info */
	private String fullWtrRailComAmt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String bkgOfcCd = null;
	/* Column Info */
	private String rhqCd = null;
	/* Column Info */
	private String bkgMiscRev = null;
	/* Column Info */
	private String fullWtrTrkComAmt = null;
	/* Column Info */
	private String shprCntCd = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String n4thRlaneCd = null;
	/* Column Info */
	private String fullWtrDirComAmt = null;
	/* Column Info */
	private String bkgCgoWgt = null;
	/* Column Info */
	private String bkgWgtTpCd = null;
	/* Column Info */
	private String paCmCostTtlAmt = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String n3rdRlaneCd = null;
	/* Column Info */
	private String spclBbCgoFlg = null;
	/* Column Info */
	private String cntrDpcPaAmt = null;
	/* Column Info */
	private String n2ndIocContiCd = null;
	/* Column Info */
	private String costWk = null;
	/* Column Info */
	private String ctrtSrepCd = null;
	/* Column Info */
	private String raCmAmt = null;
	/* Column Info */
	private String revPolCd = null;
	/* Column Info */
	private String chssInsurPaAmt = null;
	/* Column Info */
	private String cntrRcvDt = null;
	/* Column Info */
	private String mtyStvgPaAmt = null;
	/* Column Info */
	private String chssDpcPaAmt = null;
	/* Column Info */
	private String scrChgRev = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String n3rdIocContiCd = null;
	/* Column Info */
	private String otrCyHndlComAmt = null;
	/* Column Info */
	private String paCmAmt = null;
	/* Column Info */
	private String bkgStsCd = null;
	/* Column Info */
	private String rdFlg = null;
	/* Column Info */
	private String agmtCustSeq = null;
	/* Column Info */
	private String raOpPreBxAmt = null;
	/* Column Info */
	private String miscCgoHndlComAmt = null;
	/* Column Info */
	private String n4thIocContiCd = null;
	/* Column Info */
	private String cmdtCd = null;
	/* Column Info */
	private String n3rdPolCd = null;
	/* Column Info */
	private String bkgQty = null;
	/* Column Info */
	private String revPodCd = null;
	/* Column Info */
	private String dirCd = null;
	/* Column Info */
	private String spclAwkCgoFlg = null;
	/* Column Info */
	private String rgnOfcCd = null;
	/* Column Info */
	private String chssStermPaAmt = null;
	/* Column Info */
	private String interEqRntlBseAmt = null;
	/* Column Info */
	private String cgoVarVolDcAmt = null;
	/* Column Info */
	private String n1stFincVvdCd = null;
	/* Column Info */
	private String fullRailDirComAmt = null;
	/* Column Info */
	private String cntrInsurPaAmt = null;
	/* Column Info */
	private String tsStvgComAmt = null;
	/* Column Info */
	private String agmtCustTpCd = null;
	/* Column Info */
	private String bizActPaAmt = null;
	/* Column Info */
	private String n4thPolCd = null;
	/* Column Info */
	private String ntfyNm = null;
	/* Column Info */
	private String raMcgoTzDys = null;
	/* Column Info */
	private String bkgRev = null;
	/* Column Info */
	private String ntfyCustSeq = null;
	/* Column Info */
	private String n3rdPodCd = null;
	/* Column Info */
	private String slsYrmon = null;
	/* Column Info */
	private String bkgOftRev = null;
	/* Column Info */
	private String cneeNm = null;
	/* Column Info */
	private String slanCd = null;
	/* Column Info */
	private String n2ndPolCd = null;
	/* Column Info */
	private String agmtCntCd = null;
	/* Column Info */
	private String shprCustSeq = null;
	/* Column Info */
	private String repCmdtCd = null;
	/* Column Info */
	private String raOpCostTtlAmt = null;
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String n3rdFincVvdCd = null;
	/* Column Info */
	private String bkgRmk = null;
	/* Column Info */
	private String n1stPolCd = null;
	/* Column Info */
	private String chssMnrChgPaAmt = null;
	/* Column Info */
	private String trdCd = null;
	/* Column Info */
	private String rlaneCd = null;
	/* Column Info */
	private String fullTrspComAmt = null;
	/* Column Info */
	private String blNo = null;
	/* Column Info */
	private String srepCd = null;
	/* Column Info */
	private String n4thPodCd = null;
	/* Column Info */
	private String blNoChk = null;
	/* Column Info */
	private String costYrmon = null;
	/* Column Info */
	private String chssLtermPaAmt = null;
	/* Column Info */
	private String n4thTrdCd = null;
	/* Column Info */
	private String scNo = null;
	/* Column Info */
	private String blNoTp = null;
	/* Column Info */
	private String n1stTrdCd = null;
	/* Column Info */
	private String n1stRlaneCd = null;
	/* Column Info */
	private String n1stPodCd = null;
	/* Column Info */
	private String bkgPorCd = null;
	/* Column Info */
	private String ntfyCntCd = null;
	/* Column Info */
	private String chssFxAmt = null;
	/* Column Info */
	private String stpIncmAmt = null;
	/* Column Info */
	private String cntrMnrChgPaAmt = null;
	/* Column Info */
	private String chssDrygPaAmt = null;
	/* Column Info */
	private String otrVolActAmt = null;
	/* Column Info */
	private String acComAmt = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String dmdtComAmt = null;
	/* Column Info */
	private String cntrLtermPaAmt = null;
	/* Column Info */
	private String cntrFxAmt = null;
	/* Column Info */
	private String raCmPreBxAmt = null;
	/* Column Info */
	private String custKeyAgmtMgrFlg = null;
	/* Column Info */
	private String subTrdCd = null;
	/* Column Info */
	private String bzcStvgComAmt = null;
	/* Column Info */
	private String scRfaHldCntCd = null;
	/* Column Info */
	private String dckCyHndlComAmt = null;
	/* Column Info */
	private String cgoHndlComAmt = null;
	/* Column Info */
	private String agmtSgnOfcCd = null;
	/* Column Info */
	private String usaBkgModCd = null;
	/* Column Info */
	private String spclRcFlg = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String n2ndRlaneCd = null;
	/* Column Info */
	private String bkgRcvTermCd = null;
	/* Column Info */
	private String fullRailTrkComAmt = null;
	/* Column Info */
	private String n4thFincVvdCd = null;
	/* Column Info */
	private String stpCostAmt = null;
	/* Column Info */
	private String rfaNo = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String bkgDelCd = null;
	/* Column Info */
	private String revContiCd = null;
	/* Column Info */
	private String n3rdTrdCd = null;
	/* Column Info */
	private String shprNm = null;
	/* Column Info */
	private String custTpCd = null;
	/* Column Info */
	private String cntrStermPaAmt = null;
	/* Column Info */
	private String mtySimAmt = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String iocCd = null;
	/* Column Info */
	private String bkgPolCd = null;
	/* Column Info */
	private String sltMgmtUtComAmt = null;
	/* Column Info */
	private String fcntrStoComAmt = null;
	/* Column Info */
	private String raFcgoTzDys = null;
	/* Column Info */
	private String ctrtRgnOfcCd = null;
	/* Column Info */
	private String raOpAmt = null;
	/* Column Info */
	private String mtyTrspPaAmt = null;
	/* Column Info */
	private String n1stIocContiCd = null;
	/* Column Info */
	private String obrdDt = null;
	/* Column Info */
	private String socFlg = null;
	/* Column Info */
	private String oftTpCd = null;
	/* Column Info */
	private String paCmPreBxAmt = null;
	/* Column Info */
	private String n2ndFincVvdCd = null;
	/* Column Info */
	private String spclCntrTpszCd = null;
	/* Column Info */
	private String bkgDeTermCd = null;
	/* Column Info */
	private String bzcSpclFlg = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CoaBkgExpnDtlVO() {}

	public CoaBkgExpnDtlVO(String ibflag, String pagerows, String bkgNo, String cntrTpszCd, String costRoutNo, String costYrmon, String slsYrmon, String costWk, String trdCd, String subTrdCd, String rlaneCd, String iocCd, String vslCd, String skdVoyNo, String dirCd, String n1stTrdCd, String n2ndTrdCd, String n3rdTrdCd, String n4thTrdCd, String n1stRlaneCd, String n2ndRlaneCd, String n3rdRlaneCd, String n4thRlaneCd, String n1stIocContiCd, String n2ndIocContiCd, String n3rdIocContiCd, String n4thIocContiCd, String n1stFincVvdCd, String n2ndFincVvdCd, String n3rdFincVvdCd, String n4thFincVvdCd, String bkgPorCd, String bkgPolCd, String bkgPodCd, String bkgDelCd, String revPolCd, String revPodCd, String n1stPolCd, String n2ndPolCd, String n3rdPolCd, String n4thPolCd, String n1stPodCd, String n2ndPodCd, String n3rdPodCd, String n4thPodCd, String agmtSgnOfcCd, String rhqCd, String rgnOfcCd, String slsOfcCd, String ctrtHqOfcCd, String ctrtRgnOfcCd, String ctrtOfcCd, String ctrtSrepCd, String scNo, String rfaNo, String custTpCd, String blNo, String bkgRcvTermCd, String cmdtCd, String bkgDeTermCd, String bkgStsCd, String bkgCgoTpCd, String usaBkgModCd, String repCmdtCd, String spclRcFlg, String spclDgCgoFlg, String spclBbCgoFlg, String spclAwkCgoFlg, String rdFlg, String socFlg, String shprCntCd, String shprCustSeq, String shprNm, String cneeNm, String ntfyNm, String oftTpCd, String obrdDt, String cntrRcvDt, String srepCd, String revContiCd, String bkgOfcCd, String agmtCustTpCd, String agmtCntCd, String agmtCustSeq, String custKeyAgmtMgrFlg, String bkgQty, String raFcgoTzDys, String raMcgoTzDys, String bkgRev, String bkgOftRev, String bkgMiscRev, String scrChgRev, String dmdtComAmt, String sltMgmtUtComAmt, String bzcStvgComAmt, String otrCyHndlComAmt, String tsStvgComAmt, String dckCyHndlComAmt, String cgoHndlComAmt, String fcntrStoComAmt, String miscCgoHndlComAmt, String tmlComAmt, String fullRailDirComAmt, String fullRailTrkComAmt, String fullTrkDirComAmt, String fullWtrDirComAmt, String fullWtrRailComAmt, String fullWtrTrkComAmt, String fullTrspComAmt, String mtyStvgPaAmt, String mtyTrspPaAmt, String cgoVarVolDcAmt, String acComAmt, String cntrStermPaAmt, String cntrLtermPaAmt, String cntrMnrChgPaAmt, String cntrDpcPaAmt, String cntrInsurPaAmt, String chssStermPaAmt, String chssLtermPaAmt, String chssMnrChgPaAmt, String chssDpcPaAmt, String chssDrygPaAmt, String chssInsurPaAmt, String bizActPaAmt, String ownVolActAmt, String otrVolActAmt, String stpIncmAmt, String stpCostAmt, String opInterSltRntlBseAmt, String mtySimAmt, String interEqRntlBseAmt, String paCmCostTtlAmt, String paCmAmt, String paCmPreBxAmt, String raCmCostTtlAmt, String raCmAmt, String raCmPreBxAmt, String raOpCostTtlAmt, String raOpAmt, String raOpPreBxAmt, String bkgRmk, String spclCntrTpszCd, String bkgCgoWgt, String bzcSpclFlg, String bkgWgtTpCd, String chssFxAmt, String cneeCntCd, String cntrFxAmt, String cneeCustSeq, String ntfyCntCd, String ntfyCustSeq, String scRfaHldCntCd, String scRfaHldCustSeq, String creUsrId, String creDt, String updUsrId, String updDt, String blNoTp, String blNoChk, String slanCd, String deltFlg) {
		this.bkgCgoTpCd = bkgCgoTpCd;
		this.costRoutNo = costRoutNo;
		this.cneeCustSeq = cneeCustSeq;
		this.scRfaHldCustSeq = scRfaHldCustSeq;
		this.n2ndPodCd = n2ndPodCd;
		this.ownVolActAmt = ownVolActAmt;
		this.cneeCntCd = cneeCntCd;
		this.fullTrkDirComAmt = fullTrkDirComAmt;
		this.pagerows = pagerows;
		this.ctrtHqOfcCd = ctrtHqOfcCd;
		this.n2ndTrdCd = n2ndTrdCd;
		this.bkgPodCd = bkgPodCd;
		this.tmlComAmt = tmlComAmt;
		this.ctrtOfcCd = ctrtOfcCd;
		this.raCmCostTtlAmt = raCmCostTtlAmt;
		this.slsOfcCd = slsOfcCd;
		this.cntrTpszCd = cntrTpszCd;
		this.spclDgCgoFlg = spclDgCgoFlg;
		this.opInterSltRntlBseAmt = opInterSltRntlBseAmt;
		this.fullWtrRailComAmt = fullWtrRailComAmt;
		this.updUsrId = updUsrId;
		this.bkgOfcCd = bkgOfcCd;
		this.rhqCd = rhqCd;
		this.bkgMiscRev = bkgMiscRev;
		this.fullWtrTrkComAmt = fullWtrTrkComAmt;
		this.shprCntCd = shprCntCd;
		this.skdVoyNo = skdVoyNo;
		this.n4thRlaneCd = n4thRlaneCd;
		this.fullWtrDirComAmt = fullWtrDirComAmt;
		this.bkgCgoWgt = bkgCgoWgt;
		this.bkgWgtTpCd = bkgWgtTpCd;
		this.paCmCostTtlAmt = paCmCostTtlAmt;
		this.bkgNo = bkgNo;
		this.n3rdRlaneCd = n3rdRlaneCd;
		this.spclBbCgoFlg = spclBbCgoFlg;
		this.cntrDpcPaAmt = cntrDpcPaAmt;
		this.n2ndIocContiCd = n2ndIocContiCd;
		this.costWk = costWk;
		this.ctrtSrepCd = ctrtSrepCd;
		this.raCmAmt = raCmAmt;
		this.revPolCd = revPolCd;
		this.chssInsurPaAmt = chssInsurPaAmt;
		this.cntrRcvDt = cntrRcvDt;
		this.mtyStvgPaAmt = mtyStvgPaAmt;
		this.chssDpcPaAmt = chssDpcPaAmt;
		this.scrChgRev = scrChgRev;
		this.deltFlg = deltFlg;
		this.n3rdIocContiCd = n3rdIocContiCd;
		this.otrCyHndlComAmt = otrCyHndlComAmt;
		this.paCmAmt = paCmAmt;
		this.bkgStsCd = bkgStsCd;
		this.rdFlg = rdFlg;
		this.agmtCustSeq = agmtCustSeq;
		this.raOpPreBxAmt = raOpPreBxAmt;
		this.miscCgoHndlComAmt = miscCgoHndlComAmt;
		this.n4thIocContiCd = n4thIocContiCd;
		this.cmdtCd = cmdtCd;
		this.n3rdPolCd = n3rdPolCd;
		this.bkgQty = bkgQty;
		this.revPodCd = revPodCd;
		this.dirCd = dirCd;
		this.spclAwkCgoFlg = spclAwkCgoFlg;
		this.rgnOfcCd = rgnOfcCd;
		this.chssStermPaAmt = chssStermPaAmt;
		this.interEqRntlBseAmt = interEqRntlBseAmt;
		this.cgoVarVolDcAmt = cgoVarVolDcAmt;
		this.n1stFincVvdCd = n1stFincVvdCd;
		this.fullRailDirComAmt = fullRailDirComAmt;
		this.cntrInsurPaAmt = cntrInsurPaAmt;
		this.tsStvgComAmt = tsStvgComAmt;
		this.agmtCustTpCd = agmtCustTpCd;
		this.bizActPaAmt = bizActPaAmt;
		this.n4thPolCd = n4thPolCd;
		this.ntfyNm = ntfyNm;
		this.raMcgoTzDys = raMcgoTzDys;
		this.bkgRev = bkgRev;
		this.ntfyCustSeq = ntfyCustSeq;
		this.n3rdPodCd = n3rdPodCd;
		this.slsYrmon = slsYrmon;
		this.bkgOftRev = bkgOftRev;
		this.cneeNm = cneeNm;
		this.slanCd = slanCd;
		this.n2ndPolCd = n2ndPolCd;
		this.agmtCntCd = agmtCntCd;
		this.shprCustSeq = shprCustSeq;
		this.repCmdtCd = repCmdtCd;
		this.raOpCostTtlAmt = raOpCostTtlAmt;
		this.vslCd = vslCd;
		this.n3rdFincVvdCd = n3rdFincVvdCd;
		this.bkgRmk = bkgRmk;
		this.n1stPolCd = n1stPolCd;
		this.chssMnrChgPaAmt = chssMnrChgPaAmt;
		this.trdCd = trdCd;
		this.rlaneCd = rlaneCd;
		this.fullTrspComAmt = fullTrspComAmt;
		this.blNo = blNo;
		this.srepCd = srepCd;
		this.n4thPodCd = n4thPodCd;
		this.blNoChk = blNoChk;
		this.costYrmon = costYrmon;
		this.chssLtermPaAmt = chssLtermPaAmt;
		this.n4thTrdCd = n4thTrdCd;
		this.scNo = scNo;
		this.blNoTp = blNoTp;
		this.n1stTrdCd = n1stTrdCd;
		this.n1stRlaneCd = n1stRlaneCd;
		this.n1stPodCd = n1stPodCd;
		this.bkgPorCd = bkgPorCd;
		this.ntfyCntCd = ntfyCntCd;
		this.chssFxAmt = chssFxAmt;
		this.stpIncmAmt = stpIncmAmt;
		this.cntrMnrChgPaAmt = cntrMnrChgPaAmt;
		this.chssDrygPaAmt = chssDrygPaAmt;
		this.otrVolActAmt = otrVolActAmt;
		this.acComAmt = acComAmt;
		this.creUsrId = creUsrId;
		this.dmdtComAmt = dmdtComAmt;
		this.cntrLtermPaAmt = cntrLtermPaAmt;
		this.cntrFxAmt = cntrFxAmt;
		this.raCmPreBxAmt = raCmPreBxAmt;
		this.custKeyAgmtMgrFlg = custKeyAgmtMgrFlg;
		this.subTrdCd = subTrdCd;
		this.bzcStvgComAmt = bzcStvgComAmt;
		this.scRfaHldCntCd = scRfaHldCntCd;
		this.dckCyHndlComAmt = dckCyHndlComAmt;
		this.cgoHndlComAmt = cgoHndlComAmt;
		this.agmtSgnOfcCd = agmtSgnOfcCd;
		this.usaBkgModCd = usaBkgModCd;
		this.spclRcFlg = spclRcFlg;
		this.creDt = creDt;
		this.n2ndRlaneCd = n2ndRlaneCd;
		this.bkgRcvTermCd = bkgRcvTermCd;
		this.fullRailTrkComAmt = fullRailTrkComAmt;
		this.n4thFincVvdCd = n4thFincVvdCd;
		this.stpCostAmt = stpCostAmt;
		this.rfaNo = rfaNo;
		this.ibflag = ibflag;
		this.bkgDelCd = bkgDelCd;
		this.revContiCd = revContiCd;
		this.n3rdTrdCd = n3rdTrdCd;
		this.shprNm = shprNm;
		this.custTpCd = custTpCd;
		this.cntrStermPaAmt = cntrStermPaAmt;
		this.mtySimAmt = mtySimAmt;
		this.updDt = updDt;
		this.iocCd = iocCd;
		this.bkgPolCd = bkgPolCd;
		this.sltMgmtUtComAmt = sltMgmtUtComAmt;
		this.fcntrStoComAmt = fcntrStoComAmt;
		this.raFcgoTzDys = raFcgoTzDys;
		this.ctrtRgnOfcCd = ctrtRgnOfcCd;
		this.raOpAmt = raOpAmt;
		this.mtyTrspPaAmt = mtyTrspPaAmt;
		this.n1stIocContiCd = n1stIocContiCd;
		this.obrdDt = obrdDt;
		this.socFlg = socFlg;
		this.oftTpCd = oftTpCd;
		this.paCmPreBxAmt = paCmPreBxAmt;
		this.n2ndFincVvdCd = n2ndFincVvdCd;
		this.spclCntrTpszCd = spclCntrTpszCd;
		this.bkgDeTermCd = bkgDeTermCd;
		this.bzcSpclFlg = bzcSpclFlg;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("bkg_cgo_tp_cd", getBkgCgoTpCd());
		this.hashColumns.put("cost_rout_no", getCostRoutNo());
		this.hashColumns.put("cnee_cust_seq", getCneeCustSeq());
		this.hashColumns.put("sc_rfa_hld_cust_seq", getScRfaHldCustSeq());
		this.hashColumns.put("n2nd_pod_cd", getN2ndPodCd());
		this.hashColumns.put("own_vol_act_amt", getOwnVolActAmt());
		this.hashColumns.put("cnee_cnt_cd", getCneeCntCd());
		this.hashColumns.put("full_trk_dir_com_amt", getFullTrkDirComAmt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ctrt_hq_ofc_cd", getCtrtHqOfcCd());
		this.hashColumns.put("n2nd_trd_cd", getN2ndTrdCd());
		this.hashColumns.put("bkg_pod_cd", getBkgPodCd());
		this.hashColumns.put("tml_com_amt", getTmlComAmt());
		this.hashColumns.put("ctrt_ofc_cd", getCtrtOfcCd());
		this.hashColumns.put("ra_cm_cost_ttl_amt", getRaCmCostTtlAmt());
		this.hashColumns.put("sls_ofc_cd", getSlsOfcCd());
		this.hashColumns.put("cntr_tpsz_cd", getCntrTpszCd());
		this.hashColumns.put("spcl_dg_cgo_flg", getSpclDgCgoFlg());
		this.hashColumns.put("op_inter_slt_rntl_bse_amt", getOpInterSltRntlBseAmt());
		this.hashColumns.put("full_wtr_rail_com_amt", getFullWtrRailComAmt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("bkg_ofc_cd", getBkgOfcCd());
		this.hashColumns.put("rhq_cd", getRhqCd());
		this.hashColumns.put("bkg_misc_rev", getBkgMiscRev());
		this.hashColumns.put("full_wtr_trk_com_amt", getFullWtrTrkComAmt());
		this.hashColumns.put("shpr_cnt_cd", getShprCntCd());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("n4th_rlane_cd", getN4thRlaneCd());
		this.hashColumns.put("full_wtr_dir_com_amt", getFullWtrDirComAmt());
		this.hashColumns.put("bkg_cgo_wgt", getBkgCgoWgt());
		this.hashColumns.put("bkg_wgt_tp_cd", getBkgWgtTpCd());
		this.hashColumns.put("pa_cm_cost_ttl_amt", getPaCmCostTtlAmt());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("n3rd_rlane_cd", getN3rdRlaneCd());
		this.hashColumns.put("spcl_bb_cgo_flg", getSpclBbCgoFlg());
		this.hashColumns.put("cntr_dpc_pa_amt", getCntrDpcPaAmt());
		this.hashColumns.put("n2nd_ioc_conti_cd", getN2ndIocContiCd());
		this.hashColumns.put("cost_wk", getCostWk());
		this.hashColumns.put("ctrt_srep_cd", getCtrtSrepCd());
		this.hashColumns.put("ra_cm_amt", getRaCmAmt());
		this.hashColumns.put("rev_pol_cd", getRevPolCd());
		this.hashColumns.put("chss_insur_pa_amt", getChssInsurPaAmt());
		this.hashColumns.put("cntr_rcv_dt", getCntrRcvDt());
		this.hashColumns.put("mty_stvg_pa_amt", getMtyStvgPaAmt());
		this.hashColumns.put("chss_dpc_pa_amt", getChssDpcPaAmt());
		this.hashColumns.put("scr_chg_rev", getScrChgRev());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("n3rd_ioc_conti_cd", getN3rdIocContiCd());
		this.hashColumns.put("otr_cy_hndl_com_amt", getOtrCyHndlComAmt());
		this.hashColumns.put("pa_cm_amt", getPaCmAmt());
		this.hashColumns.put("bkg_sts_cd", getBkgStsCd());
		this.hashColumns.put("rd_flg", getRdFlg());
		this.hashColumns.put("agmt_cust_seq", getAgmtCustSeq());
		this.hashColumns.put("ra_op_pre_bx_amt", getRaOpPreBxAmt());
		this.hashColumns.put("misc_cgo_hndl_com_amt", getMiscCgoHndlComAmt());
		this.hashColumns.put("n4th_ioc_conti_cd", getN4thIocContiCd());
		this.hashColumns.put("cmdt_cd", getCmdtCd());
		this.hashColumns.put("n3rd_pol_cd", getN3rdPolCd());
		this.hashColumns.put("bkg_qty", getBkgQty());
		this.hashColumns.put("rev_pod_cd", getRevPodCd());
		this.hashColumns.put("dir_cd", getDirCd());
		this.hashColumns.put("spcl_awk_cgo_flg", getSpclAwkCgoFlg());
		this.hashColumns.put("rgn_ofc_cd", getRgnOfcCd());
		this.hashColumns.put("chss_sterm_pa_amt", getChssStermPaAmt());
		this.hashColumns.put("inter_eq_rntl_bse_amt", getInterEqRntlBseAmt());
		this.hashColumns.put("cgo_var_vol_dc_amt", getCgoVarVolDcAmt());
		this.hashColumns.put("n1st_finc_vvd_cd", getN1stFincVvdCd());
		this.hashColumns.put("full_rail_dir_com_amt", getFullRailDirComAmt());
		this.hashColumns.put("cntr_insur_pa_amt", getCntrInsurPaAmt());
		this.hashColumns.put("ts_stvg_com_amt", getTsStvgComAmt());
		this.hashColumns.put("agmt_cust_tp_cd", getAgmtCustTpCd());
		this.hashColumns.put("biz_act_pa_amt", getBizActPaAmt());
		this.hashColumns.put("n4th_pol_cd", getN4thPolCd());
		this.hashColumns.put("ntfy_nm", getNtfyNm());
		this.hashColumns.put("ra_mcgo_tz_dys", getRaMcgoTzDys());
		this.hashColumns.put("bkg_rev", getBkgRev());
		this.hashColumns.put("ntfy_cust_seq", getNtfyCustSeq());
		this.hashColumns.put("n3rd_pod_cd", getN3rdPodCd());
		this.hashColumns.put("sls_yrmon", getSlsYrmon());
		this.hashColumns.put("bkg_oft_rev", getBkgOftRev());
		this.hashColumns.put("cnee_nm", getCneeNm());
		this.hashColumns.put("slan_cd", getSlanCd());
		this.hashColumns.put("n2nd_pol_cd", getN2ndPolCd());
		this.hashColumns.put("agmt_cnt_cd", getAgmtCntCd());
		this.hashColumns.put("shpr_cust_seq", getShprCustSeq());
		this.hashColumns.put("rep_cmdt_cd", getRepCmdtCd());
		this.hashColumns.put("ra_op_cost_ttl_amt", getRaOpCostTtlAmt());
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("n3rd_finc_vvd_cd", getN3rdFincVvdCd());
		this.hashColumns.put("bkg_rmk", getBkgRmk());
		this.hashColumns.put("n1st_pol_cd", getN1stPolCd());
		this.hashColumns.put("chss_mnr_chg_pa_amt", getChssMnrChgPaAmt());
		this.hashColumns.put("trd_cd", getTrdCd());
		this.hashColumns.put("rlane_cd", getRlaneCd());
		this.hashColumns.put("full_trsp_com_amt", getFullTrspComAmt());
		this.hashColumns.put("bl_no", getBlNo());
		this.hashColumns.put("srep_cd", getSrepCd());
		this.hashColumns.put("n4th_pod_cd", getN4thPodCd());
		this.hashColumns.put("bl_no_chk", getBlNoChk());
		this.hashColumns.put("cost_yrmon", getCostYrmon());
		this.hashColumns.put("chss_lterm_pa_amt", getChssLtermPaAmt());
		this.hashColumns.put("n4th_trd_cd", getN4thTrdCd());
		this.hashColumns.put("sc_no", getScNo());
		this.hashColumns.put("bl_no_tp", getBlNoTp());
		this.hashColumns.put("n1st_trd_cd", getN1stTrdCd());
		this.hashColumns.put("n1st_rlane_cd", getN1stRlaneCd());
		this.hashColumns.put("n1st_pod_cd", getN1stPodCd());
		this.hashColumns.put("bkg_por_cd", getBkgPorCd());
		this.hashColumns.put("ntfy_cnt_cd", getNtfyCntCd());
		this.hashColumns.put("chss_fx_amt", getChssFxAmt());
		this.hashColumns.put("stp_incm_amt", getStpIncmAmt());
		this.hashColumns.put("cntr_mnr_chg_pa_amt", getCntrMnrChgPaAmt());
		this.hashColumns.put("chss_dryg_pa_amt", getChssDrygPaAmt());
		this.hashColumns.put("otr_vol_act_amt", getOtrVolActAmt());
		this.hashColumns.put("ac_com_amt", getAcComAmt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("dmdt_com_amt", getDmdtComAmt());
		this.hashColumns.put("cntr_lterm_pa_amt", getCntrLtermPaAmt());
		this.hashColumns.put("cntr_fx_amt", getCntrFxAmt());
		this.hashColumns.put("ra_cm_pre_bx_amt", getRaCmPreBxAmt());
		this.hashColumns.put("cust_key_agmt_mgr_flg", getCustKeyAgmtMgrFlg());
		this.hashColumns.put("sub_trd_cd", getSubTrdCd());
		this.hashColumns.put("bzc_stvg_com_amt", getBzcStvgComAmt());
		this.hashColumns.put("sc_rfa_hld_cnt_cd", getScRfaHldCntCd());
		this.hashColumns.put("dck_cy_hndl_com_amt", getDckCyHndlComAmt());
		this.hashColumns.put("cgo_hndl_com_amt", getCgoHndlComAmt());
		this.hashColumns.put("agmt_sgn_ofc_cd", getAgmtSgnOfcCd());
		this.hashColumns.put("usa_bkg_mod_cd", getUsaBkgModCd());
		this.hashColumns.put("spcl_rc_flg", getSpclRcFlg());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("n2nd_rlane_cd", getN2ndRlaneCd());
		this.hashColumns.put("bkg_rcv_term_cd", getBkgRcvTermCd());
		this.hashColumns.put("full_rail_trk_com_amt", getFullRailTrkComAmt());
		this.hashColumns.put("n4th_finc_vvd_cd", getN4thFincVvdCd());
		this.hashColumns.put("stp_cost_amt", getStpCostAmt());
		this.hashColumns.put("rfa_no", getRfaNo());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("bkg_del_cd", getBkgDelCd());
		this.hashColumns.put("rev_conti_cd", getRevContiCd());
		this.hashColumns.put("n3rd_trd_cd", getN3rdTrdCd());
		this.hashColumns.put("shpr_nm", getShprNm());
		this.hashColumns.put("cust_tp_cd", getCustTpCd());
		this.hashColumns.put("cntr_sterm_pa_amt", getCntrStermPaAmt());
		this.hashColumns.put("mty_sim_amt", getMtySimAmt());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("ioc_cd", getIocCd());
		this.hashColumns.put("bkg_pol_cd", getBkgPolCd());
		this.hashColumns.put("slt_mgmt_ut_com_amt", getSltMgmtUtComAmt());
		this.hashColumns.put("fcntr_sto_com_amt", getFcntrStoComAmt());
		this.hashColumns.put("ra_fcgo_tz_dys", getRaFcgoTzDys());
		this.hashColumns.put("ctrt_rgn_ofc_cd", getCtrtRgnOfcCd());
		this.hashColumns.put("ra_op_amt", getRaOpAmt());
		this.hashColumns.put("mty_trsp_pa_amt", getMtyTrspPaAmt());
		this.hashColumns.put("n1st_ioc_conti_cd", getN1stIocContiCd());
		this.hashColumns.put("obrd_dt", getObrdDt());
		this.hashColumns.put("soc_flg", getSocFlg());
		this.hashColumns.put("oft_tp_cd", getOftTpCd());
		this.hashColumns.put("pa_cm_pre_bx_amt", getPaCmPreBxAmt());
		this.hashColumns.put("n2nd_finc_vvd_cd", getN2ndFincVvdCd());
		this.hashColumns.put("spcl_cntr_tpsz_cd", getSpclCntrTpszCd());
		this.hashColumns.put("bkg_de_term_cd", getBkgDeTermCd());
		this.hashColumns.put("bzc_spcl_flg", getBzcSpclFlg());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("bkg_cgo_tp_cd", "bkgCgoTpCd");
		this.hashFields.put("cost_rout_no", "costRoutNo");
		this.hashFields.put("cnee_cust_seq", "cneeCustSeq");
		this.hashFields.put("sc_rfa_hld_cust_seq", "scRfaHldCustSeq");
		this.hashFields.put("n2nd_pod_cd", "n2ndPodCd");
		this.hashFields.put("own_vol_act_amt", "ownVolActAmt");
		this.hashFields.put("cnee_cnt_cd", "cneeCntCd");
		this.hashFields.put("full_trk_dir_com_amt", "fullTrkDirComAmt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ctrt_hq_ofc_cd", "ctrtHqOfcCd");
		this.hashFields.put("n2nd_trd_cd", "n2ndTrdCd");
		this.hashFields.put("bkg_pod_cd", "bkgPodCd");
		this.hashFields.put("tml_com_amt", "tmlComAmt");
		this.hashFields.put("ctrt_ofc_cd", "ctrtOfcCd");
		this.hashFields.put("ra_cm_cost_ttl_amt", "raCmCostTtlAmt");
		this.hashFields.put("sls_ofc_cd", "slsOfcCd");
		this.hashFields.put("cntr_tpsz_cd", "cntrTpszCd");
		this.hashFields.put("spcl_dg_cgo_flg", "spclDgCgoFlg");
		this.hashFields.put("op_inter_slt_rntl_bse_amt", "opInterSltRntlBseAmt");
		this.hashFields.put("full_wtr_rail_com_amt", "fullWtrRailComAmt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("bkg_ofc_cd", "bkgOfcCd");
		this.hashFields.put("rhq_cd", "rhqCd");
		this.hashFields.put("bkg_misc_rev", "bkgMiscRev");
		this.hashFields.put("full_wtr_trk_com_amt", "fullWtrTrkComAmt");
		this.hashFields.put("shpr_cnt_cd", "shprCntCd");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("n4th_rlane_cd", "n4thRlaneCd");
		this.hashFields.put("full_wtr_dir_com_amt", "fullWtrDirComAmt");
		this.hashFields.put("bkg_cgo_wgt", "bkgCgoWgt");
		this.hashFields.put("bkg_wgt_tp_cd", "bkgWgtTpCd");
		this.hashFields.put("pa_cm_cost_ttl_amt", "paCmCostTtlAmt");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("n3rd_rlane_cd", "n3rdRlaneCd");
		this.hashFields.put("spcl_bb_cgo_flg", "spclBbCgoFlg");
		this.hashFields.put("cntr_dpc_pa_amt", "cntrDpcPaAmt");
		this.hashFields.put("n2nd_ioc_conti_cd", "n2ndIocContiCd");
		this.hashFields.put("cost_wk", "costWk");
		this.hashFields.put("ctrt_srep_cd", "ctrtSrepCd");
		this.hashFields.put("ra_cm_amt", "raCmAmt");
		this.hashFields.put("rev_pol_cd", "revPolCd");
		this.hashFields.put("chss_insur_pa_amt", "chssInsurPaAmt");
		this.hashFields.put("cntr_rcv_dt", "cntrRcvDt");
		this.hashFields.put("mty_stvg_pa_amt", "mtyStvgPaAmt");
		this.hashFields.put("chss_dpc_pa_amt", "chssDpcPaAmt");
		this.hashFields.put("scr_chg_rev", "scrChgRev");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("n3rd_ioc_conti_cd", "n3rdIocContiCd");
		this.hashFields.put("otr_cy_hndl_com_amt", "otrCyHndlComAmt");
		this.hashFields.put("pa_cm_amt", "paCmAmt");
		this.hashFields.put("bkg_sts_cd", "bkgStsCd");
		this.hashFields.put("rd_flg", "rdFlg");
		this.hashFields.put("agmt_cust_seq", "agmtCustSeq");
		this.hashFields.put("ra_op_pre_bx_amt", "raOpPreBxAmt");
		this.hashFields.put("misc_cgo_hndl_com_amt", "miscCgoHndlComAmt");
		this.hashFields.put("n4th_ioc_conti_cd", "n4thIocContiCd");
		this.hashFields.put("cmdt_cd", "cmdtCd");
		this.hashFields.put("n3rd_pol_cd", "n3rdPolCd");
		this.hashFields.put("bkg_qty", "bkgQty");
		this.hashFields.put("rev_pod_cd", "revPodCd");
		this.hashFields.put("dir_cd", "dirCd");
		this.hashFields.put("spcl_awk_cgo_flg", "spclAwkCgoFlg");
		this.hashFields.put("rgn_ofc_cd", "rgnOfcCd");
		this.hashFields.put("chss_sterm_pa_amt", "chssStermPaAmt");
		this.hashFields.put("inter_eq_rntl_bse_amt", "interEqRntlBseAmt");
		this.hashFields.put("cgo_var_vol_dc_amt", "cgoVarVolDcAmt");
		this.hashFields.put("n1st_finc_vvd_cd", "n1stFincVvdCd");
		this.hashFields.put("full_rail_dir_com_amt", "fullRailDirComAmt");
		this.hashFields.put("cntr_insur_pa_amt", "cntrInsurPaAmt");
		this.hashFields.put("ts_stvg_com_amt", "tsStvgComAmt");
		this.hashFields.put("agmt_cust_tp_cd", "agmtCustTpCd");
		this.hashFields.put("biz_act_pa_amt", "bizActPaAmt");
		this.hashFields.put("n4th_pol_cd", "n4thPolCd");
		this.hashFields.put("ntfy_nm", "ntfyNm");
		this.hashFields.put("ra_mcgo_tz_dys", "raMcgoTzDys");
		this.hashFields.put("bkg_rev", "bkgRev");
		this.hashFields.put("ntfy_cust_seq", "ntfyCustSeq");
		this.hashFields.put("n3rd_pod_cd", "n3rdPodCd");
		this.hashFields.put("sls_yrmon", "slsYrmon");
		this.hashFields.put("bkg_oft_rev", "bkgOftRev");
		this.hashFields.put("cnee_nm", "cneeNm");
		this.hashFields.put("slan_cd", "slanCd");
		this.hashFields.put("n2nd_pol_cd", "n2ndPolCd");
		this.hashFields.put("agmt_cnt_cd", "agmtCntCd");
		this.hashFields.put("shpr_cust_seq", "shprCustSeq");
		this.hashFields.put("rep_cmdt_cd", "repCmdtCd");
		this.hashFields.put("ra_op_cost_ttl_amt", "raOpCostTtlAmt");
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("n3rd_finc_vvd_cd", "n3rdFincVvdCd");
		this.hashFields.put("bkg_rmk", "bkgRmk");
		this.hashFields.put("n1st_pol_cd", "n1stPolCd");
		this.hashFields.put("chss_mnr_chg_pa_amt", "chssMnrChgPaAmt");
		this.hashFields.put("trd_cd", "trdCd");
		this.hashFields.put("rlane_cd", "rlaneCd");
		this.hashFields.put("full_trsp_com_amt", "fullTrspComAmt");
		this.hashFields.put("bl_no", "blNo");
		this.hashFields.put("srep_cd", "srepCd");
		this.hashFields.put("n4th_pod_cd", "n4thPodCd");
		this.hashFields.put("bl_no_chk", "blNoChk");
		this.hashFields.put("cost_yrmon", "costYrmon");
		this.hashFields.put("chss_lterm_pa_amt", "chssLtermPaAmt");
		this.hashFields.put("n4th_trd_cd", "n4thTrdCd");
		this.hashFields.put("sc_no", "scNo");
		this.hashFields.put("bl_no_tp", "blNoTp");
		this.hashFields.put("n1st_trd_cd", "n1stTrdCd");
		this.hashFields.put("n1st_rlane_cd", "n1stRlaneCd");
		this.hashFields.put("n1st_pod_cd", "n1stPodCd");
		this.hashFields.put("bkg_por_cd", "bkgPorCd");
		this.hashFields.put("ntfy_cnt_cd", "ntfyCntCd");
		this.hashFields.put("chss_fx_amt", "chssFxAmt");
		this.hashFields.put("stp_incm_amt", "stpIncmAmt");
		this.hashFields.put("cntr_mnr_chg_pa_amt", "cntrMnrChgPaAmt");
		this.hashFields.put("chss_dryg_pa_amt", "chssDrygPaAmt");
		this.hashFields.put("otr_vol_act_amt", "otrVolActAmt");
		this.hashFields.put("ac_com_amt", "acComAmt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("dmdt_com_amt", "dmdtComAmt");
		this.hashFields.put("cntr_lterm_pa_amt", "cntrLtermPaAmt");
		this.hashFields.put("cntr_fx_amt", "cntrFxAmt");
		this.hashFields.put("ra_cm_pre_bx_amt", "raCmPreBxAmt");
		this.hashFields.put("cust_key_agmt_mgr_flg", "custKeyAgmtMgrFlg");
		this.hashFields.put("sub_trd_cd", "subTrdCd");
		this.hashFields.put("bzc_stvg_com_amt", "bzcStvgComAmt");
		this.hashFields.put("sc_rfa_hld_cnt_cd", "scRfaHldCntCd");
		this.hashFields.put("dck_cy_hndl_com_amt", "dckCyHndlComAmt");
		this.hashFields.put("cgo_hndl_com_amt", "cgoHndlComAmt");
		this.hashFields.put("agmt_sgn_ofc_cd", "agmtSgnOfcCd");
		this.hashFields.put("usa_bkg_mod_cd", "usaBkgModCd");
		this.hashFields.put("spcl_rc_flg", "spclRcFlg");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("n2nd_rlane_cd", "n2ndRlaneCd");
		this.hashFields.put("bkg_rcv_term_cd", "bkgRcvTermCd");
		this.hashFields.put("full_rail_trk_com_amt", "fullRailTrkComAmt");
		this.hashFields.put("n4th_finc_vvd_cd", "n4thFincVvdCd");
		this.hashFields.put("stp_cost_amt", "stpCostAmt");
		this.hashFields.put("rfa_no", "rfaNo");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("bkg_del_cd", "bkgDelCd");
		this.hashFields.put("rev_conti_cd", "revContiCd");
		this.hashFields.put("n3rd_trd_cd", "n3rdTrdCd");
		this.hashFields.put("shpr_nm", "shprNm");
		this.hashFields.put("cust_tp_cd", "custTpCd");
		this.hashFields.put("cntr_sterm_pa_amt", "cntrStermPaAmt");
		this.hashFields.put("mty_sim_amt", "mtySimAmt");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("ioc_cd", "iocCd");
		this.hashFields.put("bkg_pol_cd", "bkgPolCd");
		this.hashFields.put("slt_mgmt_ut_com_amt", "sltMgmtUtComAmt");
		this.hashFields.put("fcntr_sto_com_amt", "fcntrStoComAmt");
		this.hashFields.put("ra_fcgo_tz_dys", "raFcgoTzDys");
		this.hashFields.put("ctrt_rgn_ofc_cd", "ctrtRgnOfcCd");
		this.hashFields.put("ra_op_amt", "raOpAmt");
		this.hashFields.put("mty_trsp_pa_amt", "mtyTrspPaAmt");
		this.hashFields.put("n1st_ioc_conti_cd", "n1stIocContiCd");
		this.hashFields.put("obrd_dt", "obrdDt");
		this.hashFields.put("soc_flg", "socFlg");
		this.hashFields.put("oft_tp_cd", "oftTpCd");
		this.hashFields.put("pa_cm_pre_bx_amt", "paCmPreBxAmt");
		this.hashFields.put("n2nd_finc_vvd_cd", "n2ndFincVvdCd");
		this.hashFields.put("spcl_cntr_tpsz_cd", "spclCntrTpszCd");
		this.hashFields.put("bkg_de_term_cd", "bkgDeTermCd");
		this.hashFields.put("bzc_spcl_flg", "bzcSpclFlg");
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
	 * @return costRoutNo
	 */
	public String getCostRoutNo() {
		return this.costRoutNo;
	}
	
	/**
	 * Column Info
	 * @return cneeCustSeq
	 */
	public String getCneeCustSeq() {
		return this.cneeCustSeq;
	}
	
	/**
	 * Column Info
	 * @return scRfaHldCustSeq
	 */
	public String getScRfaHldCustSeq() {
		return this.scRfaHldCustSeq;
	}
	
	/**
	 * Column Info
	 * @return n2ndPodCd
	 */
	public String getN2ndPodCd() {
		return this.n2ndPodCd;
	}
	
	/**
	 * Column Info
	 * @return ownVolActAmt
	 */
	public String getOwnVolActAmt() {
		return this.ownVolActAmt;
	}
	
	/**
	 * Column Info
	 * @return cneeCntCd
	 */
	public String getCneeCntCd() {
		return this.cneeCntCd;
	}
	
	/**
	 * Column Info
	 * @return fullTrkDirComAmt
	 */
	public String getFullTrkDirComAmt() {
		return this.fullTrkDirComAmt;
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
	 * @return ctrtHqOfcCd
	 */
	public String getCtrtHqOfcCd() {
		return this.ctrtHqOfcCd;
	}
	
	/**
	 * Column Info
	 * @return n2ndTrdCd
	 */
	public String getN2ndTrdCd() {
		return this.n2ndTrdCd;
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
	 * @return tmlComAmt
	 */
	public String getTmlComAmt() {
		return this.tmlComAmt;
	}
	
	/**
	 * Column Info
	 * @return ctrtOfcCd
	 */
	public String getCtrtOfcCd() {
		return this.ctrtOfcCd;
	}
	
	/**
	 * Column Info
	 * @return raCmCostTtlAmt
	 */
	public String getRaCmCostTtlAmt() {
		return this.raCmCostTtlAmt;
	}
	
	/**
	 * Column Info
	 * @return slsOfcCd
	 */
	public String getSlsOfcCd() {
		return this.slsOfcCd;
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
	 * @return spclDgCgoFlg
	 */
	public String getSpclDgCgoFlg() {
		return this.spclDgCgoFlg;
	}
	
	/**
	 * Column Info
	 * @return opInterSltRntlBseAmt
	 */
	public String getOpInterSltRntlBseAmt() {
		return this.opInterSltRntlBseAmt;
	}
	
	/**
	 * Column Info
	 * @return fullWtrRailComAmt
	 */
	public String getFullWtrRailComAmt() {
		return this.fullWtrRailComAmt;
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
	 * @return bkgOfcCd
	 */
	public String getBkgOfcCd() {
		return this.bkgOfcCd;
	}
	
	/**
	 * Column Info
	 * @return rhqCd
	 */
	public String getRhqCd() {
		return this.rhqCd;
	}
	
	/**
	 * Column Info
	 * @return bkgMiscRev
	 */
	public String getBkgMiscRev() {
		return this.bkgMiscRev;
	}
	
	/**
	 * Column Info
	 * @return fullWtrTrkComAmt
	 */
	public String getFullWtrTrkComAmt() {
		return this.fullWtrTrkComAmt;
	}
	
	/**
	 * Column Info
	 * @return shprCntCd
	 */
	public String getShprCntCd() {
		return this.shprCntCd;
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
	 * @return n4thRlaneCd
	 */
	public String getN4thRlaneCd() {
		return this.n4thRlaneCd;
	}
	
	/**
	 * Column Info
	 * @return fullWtrDirComAmt
	 */
	public String getFullWtrDirComAmt() {
		return this.fullWtrDirComAmt;
	}
	
	/**
	 * Column Info
	 * @return bkgCgoWgt
	 */
	public String getBkgCgoWgt() {
		return this.bkgCgoWgt;
	}
	
	/**
	 * Column Info
	 * @return bkgWgtTpCd
	 */
	public String getBkgWgtTpCd() {
		return this.bkgWgtTpCd;
	}
	
	/**
	 * Column Info
	 * @return paCmCostTtlAmt
	 */
	public String getPaCmCostTtlAmt() {
		return this.paCmCostTtlAmt;
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
	 * @return n3rdRlaneCd
	 */
	public String getN3rdRlaneCd() {
		return this.n3rdRlaneCd;
	}
	
	/**
	 * Column Info
	 * @return spclBbCgoFlg
	 */
	public String getSpclBbCgoFlg() {
		return this.spclBbCgoFlg;
	}
	
	/**
	 * Column Info
	 * @return cntrDpcPaAmt
	 */
	public String getCntrDpcPaAmt() {
		return this.cntrDpcPaAmt;
	}
	
	/**
	 * Column Info
	 * @return n2ndIocContiCd
	 */
	public String getN2ndIocContiCd() {
		return this.n2ndIocContiCd;
	}
	
	/**
	 * Column Info
	 * @return costWk
	 */
	public String getCostWk() {
		return this.costWk;
	}
	
	/**
	 * Column Info
	 * @return ctrtSrepCd
	 */
	public String getCtrtSrepCd() {
		return this.ctrtSrepCd;
	}
	
	/**
	 * Column Info
	 * @return raCmAmt
	 */
	public String getRaCmAmt() {
		return this.raCmAmt;
	}
	
	/**
	 * Column Info
	 * @return revPolCd
	 */
	public String getRevPolCd() {
		return this.revPolCd;
	}
	
	/**
	 * Column Info
	 * @return chssInsurPaAmt
	 */
	public String getChssInsurPaAmt() {
		return this.chssInsurPaAmt;
	}
	
	/**
	 * Column Info
	 * @return cntrRcvDt
	 */
	public String getCntrRcvDt() {
		return this.cntrRcvDt;
	}
	
	/**
	 * Column Info
	 * @return mtyStvgPaAmt
	 */
	public String getMtyStvgPaAmt() {
		return this.mtyStvgPaAmt;
	}
	
	/**
	 * Column Info
	 * @return chssDpcPaAmt
	 */
	public String getChssDpcPaAmt() {
		return this.chssDpcPaAmt;
	}
	
	/**
	 * Column Info
	 * @return scrChgRev
	 */
	public String getScrChgRev() {
		return this.scrChgRev;
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
	 * @return n3rdIocContiCd
	 */
	public String getN3rdIocContiCd() {
		return this.n3rdIocContiCd;
	}
	
	/**
	 * Column Info
	 * @return otrCyHndlComAmt
	 */
	public String getOtrCyHndlComAmt() {
		return this.otrCyHndlComAmt;
	}
	
	/**
	 * Column Info
	 * @return paCmAmt
	 */
	public String getPaCmAmt() {
		return this.paCmAmt;
	}
	
	/**
	 * Column Info
	 * @return bkgStsCd
	 */
	public String getBkgStsCd() {
		return this.bkgStsCd;
	}
	
	/**
	 * Column Info
	 * @return rdFlg
	 */
	public String getRdFlg() {
		return this.rdFlg;
	}
	
	/**
	 * Column Info
	 * @return agmtCustSeq
	 */
	public String getAgmtCustSeq() {
		return this.agmtCustSeq;
	}
	
	/**
	 * Column Info
	 * @return raOpPreBxAmt
	 */
	public String getRaOpPreBxAmt() {
		return this.raOpPreBxAmt;
	}
	
	/**
	 * Column Info
	 * @return miscCgoHndlComAmt
	 */
	public String getMiscCgoHndlComAmt() {
		return this.miscCgoHndlComAmt;
	}
	
	/**
	 * Column Info
	 * @return n4thIocContiCd
	 */
	public String getN4thIocContiCd() {
		return this.n4thIocContiCd;
	}
	
	/**
	 * Column Info
	 * @return cmdtCd
	 */
	public String getCmdtCd() {
		return this.cmdtCd;
	}
	
	/**
	 * Column Info
	 * @return n3rdPolCd
	 */
	public String getN3rdPolCd() {
		return this.n3rdPolCd;
	}
	
	/**
	 * Column Info
	 * @return bkgQty
	 */
	public String getBkgQty() {
		return this.bkgQty;
	}
	
	/**
	 * Column Info
	 * @return revPodCd
	 */
	public String getRevPodCd() {
		return this.revPodCd;
	}
	
	/**
	 * Column Info
	 * @return dirCd
	 */
	public String getDirCd() {
		return this.dirCd;
	}
	
	/**
	 * Column Info
	 * @return spclAwkCgoFlg
	 */
	public String getSpclAwkCgoFlg() {
		return this.spclAwkCgoFlg;
	}
	
	/**
	 * Column Info
	 * @return rgnOfcCd
	 */
	public String getRgnOfcCd() {
		return this.rgnOfcCd;
	}
	
	/**
	 * Column Info
	 * @return chssStermPaAmt
	 */
	public String getChssStermPaAmt() {
		return this.chssStermPaAmt;
	}
	
	/**
	 * Column Info
	 * @return interEqRntlBseAmt
	 */
	public String getInterEqRntlBseAmt() {
		return this.interEqRntlBseAmt;
	}
	
	/**
	 * Column Info
	 * @return cgoVarVolDcAmt
	 */
	public String getCgoVarVolDcAmt() {
		return this.cgoVarVolDcAmt;
	}
	
	/**
	 * Column Info
	 * @return n1stFincVvdCd
	 */
	public String getN1stFincVvdCd() {
		return this.n1stFincVvdCd;
	}
	
	/**
	 * Column Info
	 * @return fullRailDirComAmt
	 */
	public String getFullRailDirComAmt() {
		return this.fullRailDirComAmt;
	}
	
	/**
	 * Column Info
	 * @return cntrInsurPaAmt
	 */
	public String getCntrInsurPaAmt() {
		return this.cntrInsurPaAmt;
	}
	
	/**
	 * Column Info
	 * @return tsStvgComAmt
	 */
	public String getTsStvgComAmt() {
		return this.tsStvgComAmt;
	}
	
	/**
	 * Column Info
	 * @return agmtCustTpCd
	 */
	public String getAgmtCustTpCd() {
		return this.agmtCustTpCd;
	}
	
	/**
	 * Column Info
	 * @return bizActPaAmt
	 */
	public String getBizActPaAmt() {
		return this.bizActPaAmt;
	}
	
	/**
	 * Column Info
	 * @return n4thPolCd
	 */
	public String getN4thPolCd() {
		return this.n4thPolCd;
	}
	
	/**
	 * Column Info
	 * @return ntfyNm
	 */
	public String getNtfyNm() {
		return this.ntfyNm;
	}
	
	/**
	 * Column Info
	 * @return raMcgoTzDys
	 */
	public String getRaMcgoTzDys() {
		return this.raMcgoTzDys;
	}
	
	/**
	 * Column Info
	 * @return bkgRev
	 */
	public String getBkgRev() {
		return this.bkgRev;
	}
	
	/**
	 * Column Info
	 * @return ntfyCustSeq
	 */
	public String getNtfyCustSeq() {
		return this.ntfyCustSeq;
	}
	
	/**
	 * Column Info
	 * @return n3rdPodCd
	 */
	public String getN3rdPodCd() {
		return this.n3rdPodCd;
	}
	
	/**
	 * Column Info
	 * @return slsYrmon
	 */
	public String getSlsYrmon() {
		return this.slsYrmon;
	}
	
	/**
	 * Column Info
	 * @return bkgOftRev
	 */
	public String getBkgOftRev() {
		return this.bkgOftRev;
	}
	
	/**
	 * Column Info
	 * @return cneeNm
	 */
	public String getCneeNm() {
		return this.cneeNm;
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
	 * @return n2ndPolCd
	 */
	public String getN2ndPolCd() {
		return this.n2ndPolCd;
	}
	
	/**
	 * Column Info
	 * @return agmtCntCd
	 */
	public String getAgmtCntCd() {
		return this.agmtCntCd;
	}
	
	/**
	 * Column Info
	 * @return shprCustSeq
	 */
	public String getShprCustSeq() {
		return this.shprCustSeq;
	}
	
	/**
	 * Column Info
	 * @return repCmdtCd
	 */
	public String getRepCmdtCd() {
		return this.repCmdtCd;
	}
	
	/**
	 * Column Info
	 * @return raOpCostTtlAmt
	 */
	public String getRaOpCostTtlAmt() {
		return this.raOpCostTtlAmt;
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
	 * @return n3rdFincVvdCd
	 */
	public String getN3rdFincVvdCd() {
		return this.n3rdFincVvdCd;
	}
	
	/**
	 * Column Info
	 * @return bkgRmk
	 */
	public String getBkgRmk() {
		return this.bkgRmk;
	}
	
	/**
	 * Column Info
	 * @return n1stPolCd
	 */
	public String getN1stPolCd() {
		return this.n1stPolCd;
	}
	
	/**
	 * Column Info
	 * @return chssMnrChgPaAmt
	 */
	public String getChssMnrChgPaAmt() {
		return this.chssMnrChgPaAmt;
	}
	
	/**
	 * Column Info
	 * @return trdCd
	 */
	public String getTrdCd() {
		return this.trdCd;
	}
	
	/**
	 * Column Info
	 * @return rlaneCd
	 */
	public String getRlaneCd() {
		return this.rlaneCd;
	}
	
	/**
	 * Column Info
	 * @return fullTrspComAmt
	 */
	public String getFullTrspComAmt() {
		return this.fullTrspComAmt;
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
	 * @return srepCd
	 */
	public String getSrepCd() {
		return this.srepCd;
	}
	
	/**
	 * Column Info
	 * @return n4thPodCd
	 */
	public String getN4thPodCd() {
		return this.n4thPodCd;
	}
	
	/**
	 * Column Info
	 * @return blNoChk
	 */
	public String getBlNoChk() {
		return this.blNoChk;
	}
	
	/**
	 * Column Info
	 * @return costYrmon
	 */
	public String getCostYrmon() {
		return this.costYrmon;
	}
	
	/**
	 * Column Info
	 * @return chssLtermPaAmt
	 */
	public String getChssLtermPaAmt() {
		return this.chssLtermPaAmt;
	}
	
	/**
	 * Column Info
	 * @return n4thTrdCd
	 */
	public String getN4thTrdCd() {
		return this.n4thTrdCd;
	}
	
	/**
	 * Column Info
	 * @return scNo
	 */
	public String getScNo() {
		return this.scNo;
	}
	
	/**
	 * Column Info
	 * @return blNoTp
	 */
	public String getBlNoTp() {
		return this.blNoTp;
	}
	
	/**
	 * Column Info
	 * @return n1stTrdCd
	 */
	public String getN1stTrdCd() {
		return this.n1stTrdCd;
	}
	
	/**
	 * Column Info
	 * @return n1stRlaneCd
	 */
	public String getN1stRlaneCd() {
		return this.n1stRlaneCd;
	}
	
	/**
	 * Column Info
	 * @return n1stPodCd
	 */
	public String getN1stPodCd() {
		return this.n1stPodCd;
	}
	
	/**
	 * Column Info
	 * @return bkgPorCd
	 */
	public String getBkgPorCd() {
		return this.bkgPorCd;
	}
	
	/**
	 * Column Info
	 * @return ntfyCntCd
	 */
	public String getNtfyCntCd() {
		return this.ntfyCntCd;
	}
	
	/**
	 * Column Info
	 * @return chssFxAmt
	 */
	public String getChssFxAmt() {
		return this.chssFxAmt;
	}
	
	/**
	 * Column Info
	 * @return stpIncmAmt
	 */
	public String getStpIncmAmt() {
		return this.stpIncmAmt;
	}
	
	/**
	 * Column Info
	 * @return cntrMnrChgPaAmt
	 */
	public String getCntrMnrChgPaAmt() {
		return this.cntrMnrChgPaAmt;
	}
	
	/**
	 * Column Info
	 * @return chssDrygPaAmt
	 */
	public String getChssDrygPaAmt() {
		return this.chssDrygPaAmt;
	}
	
	/**
	 * Column Info
	 * @return otrVolActAmt
	 */
	public String getOtrVolActAmt() {
		return this.otrVolActAmt;
	}
	
	/**
	 * Column Info
	 * @return acComAmt
	 */
	public String getAcComAmt() {
		return this.acComAmt;
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
	 * @return dmdtComAmt
	 */
	public String getDmdtComAmt() {
		return this.dmdtComAmt;
	}
	
	/**
	 * Column Info
	 * @return cntrLtermPaAmt
	 */
	public String getCntrLtermPaAmt() {
		return this.cntrLtermPaAmt;
	}
	
	/**
	 * Column Info
	 * @return cntrFxAmt
	 */
	public String getCntrFxAmt() {
		return this.cntrFxAmt;
	}
	
	/**
	 * Column Info
	 * @return raCmPreBxAmt
	 */
	public String getRaCmPreBxAmt() {
		return this.raCmPreBxAmt;
	}
	
	/**
	 * Column Info
	 * @return custKeyAgmtMgrFlg
	 */
	public String getCustKeyAgmtMgrFlg() {
		return this.custKeyAgmtMgrFlg;
	}
	
	/**
	 * Column Info
	 * @return subTrdCd
	 */
	public String getSubTrdCd() {
		return this.subTrdCd;
	}
	
	/**
	 * Column Info
	 * @return bzcStvgComAmt
	 */
	public String getBzcStvgComAmt() {
		return this.bzcStvgComAmt;
	}
	
	/**
	 * Column Info
	 * @return scRfaHldCntCd
	 */
	public String getScRfaHldCntCd() {
		return this.scRfaHldCntCd;
	}
	
	/**
	 * Column Info
	 * @return dckCyHndlComAmt
	 */
	public String getDckCyHndlComAmt() {
		return this.dckCyHndlComAmt;
	}
	
	/**
	 * Column Info
	 * @return cgoHndlComAmt
	 */
	public String getCgoHndlComAmt() {
		return this.cgoHndlComAmt;
	}
	
	/**
	 * Column Info
	 * @return agmtSgnOfcCd
	 */
	public String getAgmtSgnOfcCd() {
		return this.agmtSgnOfcCd;
	}
	
	/**
	 * Column Info
	 * @return usaBkgModCd
	 */
	public String getUsaBkgModCd() {
		return this.usaBkgModCd;
	}
	
	/**
	 * Column Info
	 * @return spclRcFlg
	 */
	public String getSpclRcFlg() {
		return this.spclRcFlg;
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
	 * @return n2ndRlaneCd
	 */
	public String getN2ndRlaneCd() {
		return this.n2ndRlaneCd;
	}
	
	/**
	 * Column Info
	 * @return bkgRcvTermCd
	 */
	public String getBkgRcvTermCd() {
		return this.bkgRcvTermCd;
	}
	
	/**
	 * Column Info
	 * @return fullRailTrkComAmt
	 */
	public String getFullRailTrkComAmt() {
		return this.fullRailTrkComAmt;
	}
	
	/**
	 * Column Info
	 * @return n4thFincVvdCd
	 */
	public String getN4thFincVvdCd() {
		return this.n4thFincVvdCd;
	}
	
	/**
	 * Column Info
	 * @return stpCostAmt
	 */
	public String getStpCostAmt() {
		return this.stpCostAmt;
	}
	
	/**
	 * Column Info
	 * @return rfaNo
	 */
	public String getRfaNo() {
		return this.rfaNo;
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
	 * @return bkgDelCd
	 */
	public String getBkgDelCd() {
		return this.bkgDelCd;
	}
	
	/**
	 * Column Info
	 * @return revContiCd
	 */
	public String getRevContiCd() {
		return this.revContiCd;
	}
	
	/**
	 * Column Info
	 * @return n3rdTrdCd
	 */
	public String getN3rdTrdCd() {
		return this.n3rdTrdCd;
	}
	
	/**
	 * Column Info
	 * @return shprNm
	 */
	public String getShprNm() {
		return this.shprNm;
	}
	
	/**
	 * Column Info
	 * @return custTpCd
	 */
	public String getCustTpCd() {
		return this.custTpCd;
	}
	
	/**
	 * Column Info
	 * @return cntrStermPaAmt
	 */
	public String getCntrStermPaAmt() {
		return this.cntrStermPaAmt;
	}
	
	/**
	 * Column Info
	 * @return mtySimAmt
	 */
	public String getMtySimAmt() {
		return this.mtySimAmt;
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
	 * @return iocCd
	 */
	public String getIocCd() {
		return this.iocCd;
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
	 * @return sltMgmtUtComAmt
	 */
	public String getSltMgmtUtComAmt() {
		return this.sltMgmtUtComAmt;
	}
	
	/**
	 * Column Info
	 * @return fcntrStoComAmt
	 */
	public String getFcntrStoComAmt() {
		return this.fcntrStoComAmt;
	}
	
	/**
	 * Column Info
	 * @return raFcgoTzDys
	 */
	public String getRaFcgoTzDys() {
		return this.raFcgoTzDys;
	}
	
	/**
	 * Column Info
	 * @return ctrtRgnOfcCd
	 */
	public String getCtrtRgnOfcCd() {
		return this.ctrtRgnOfcCd;
	}
	
	/**
	 * Column Info
	 * @return raOpAmt
	 */
	public String getRaOpAmt() {
		return this.raOpAmt;
	}
	
	/**
	 * Column Info
	 * @return mtyTrspPaAmt
	 */
	public String getMtyTrspPaAmt() {
		return this.mtyTrspPaAmt;
	}
	
	/**
	 * Column Info
	 * @return n1stIocContiCd
	 */
	public String getN1stIocContiCd() {
		return this.n1stIocContiCd;
	}
	
	/**
	 * Column Info
	 * @return obrdDt
	 */
	public String getObrdDt() {
		return this.obrdDt;
	}
	
	/**
	 * Column Info
	 * @return socFlg
	 */
	public String getSocFlg() {
		return this.socFlg;
	}
	
	/**
	 * Column Info
	 * @return oftTpCd
	 */
	public String getOftTpCd() {
		return this.oftTpCd;
	}
	
	/**
	 * Column Info
	 * @return paCmPreBxAmt
	 */
	public String getPaCmPreBxAmt() {
		return this.paCmPreBxAmt;
	}
	
	/**
	 * Column Info
	 * @return n2ndFincVvdCd
	 */
	public String getN2ndFincVvdCd() {
		return this.n2ndFincVvdCd;
	}
	
	/**
	 * Column Info
	 * @return spclCntrTpszCd
	 */
	public String getSpclCntrTpszCd() {
		return this.spclCntrTpszCd;
	}
	
	/**
	 * Column Info
	 * @return bkgDeTermCd
	 */
	public String getBkgDeTermCd() {
		return this.bkgDeTermCd;
	}
	
	/**
	 * Column Info
	 * @return bzcSpclFlg
	 */
	public String getBzcSpclFlg() {
		return this.bzcSpclFlg;
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
	 * @param costRoutNo
	 */
	public void setCostRoutNo(String costRoutNo) {
		this.costRoutNo = costRoutNo;
	}
	
	/**
	 * Column Info
	 * @param cneeCustSeq
	 */
	public void setCneeCustSeq(String cneeCustSeq) {
		this.cneeCustSeq = cneeCustSeq;
	}
	
	/**
	 * Column Info
	 * @param scRfaHldCustSeq
	 */
	public void setScRfaHldCustSeq(String scRfaHldCustSeq) {
		this.scRfaHldCustSeq = scRfaHldCustSeq;
	}
	
	/**
	 * Column Info
	 * @param n2ndPodCd
	 */
	public void setN2ndPodCd(String n2ndPodCd) {
		this.n2ndPodCd = n2ndPodCd;
	}
	
	/**
	 * Column Info
	 * @param ownVolActAmt
	 */
	public void setOwnVolActAmt(String ownVolActAmt) {
		this.ownVolActAmt = ownVolActAmt;
	}
	
	/**
	 * Column Info
	 * @param cneeCntCd
	 */
	public void setCneeCntCd(String cneeCntCd) {
		this.cneeCntCd = cneeCntCd;
	}
	
	/**
	 * Column Info
	 * @param fullTrkDirComAmt
	 */
	public void setFullTrkDirComAmt(String fullTrkDirComAmt) {
		this.fullTrkDirComAmt = fullTrkDirComAmt;
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
	 * @param ctrtHqOfcCd
	 */
	public void setCtrtHqOfcCd(String ctrtHqOfcCd) {
		this.ctrtHqOfcCd = ctrtHqOfcCd;
	}
	
	/**
	 * Column Info
	 * @param n2ndTrdCd
	 */
	public void setN2ndTrdCd(String n2ndTrdCd) {
		this.n2ndTrdCd = n2ndTrdCd;
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
	 * @param tmlComAmt
	 */
	public void setTmlComAmt(String tmlComAmt) {
		this.tmlComAmt = tmlComAmt;
	}
	
	/**
	 * Column Info
	 * @param ctrtOfcCd
	 */
	public void setCtrtOfcCd(String ctrtOfcCd) {
		this.ctrtOfcCd = ctrtOfcCd;
	}
	
	/**
	 * Column Info
	 * @param raCmCostTtlAmt
	 */
	public void setRaCmCostTtlAmt(String raCmCostTtlAmt) {
		this.raCmCostTtlAmt = raCmCostTtlAmt;
	}
	
	/**
	 * Column Info
	 * @param slsOfcCd
	 */
	public void setSlsOfcCd(String slsOfcCd) {
		this.slsOfcCd = slsOfcCd;
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
	 * @param spclDgCgoFlg
	 */
	public void setSpclDgCgoFlg(String spclDgCgoFlg) {
		this.spclDgCgoFlg = spclDgCgoFlg;
	}
	
	/**
	 * Column Info
	 * @param opInterSltRntlBseAmt
	 */
	public void setOpInterSltRntlBseAmt(String opInterSltRntlBseAmt) {
		this.opInterSltRntlBseAmt = opInterSltRntlBseAmt;
	}
	
	/**
	 * Column Info
	 * @param fullWtrRailComAmt
	 */
	public void setFullWtrRailComAmt(String fullWtrRailComAmt) {
		this.fullWtrRailComAmt = fullWtrRailComAmt;
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
	 * @param bkgOfcCd
	 */
	public void setBkgOfcCd(String bkgOfcCd) {
		this.bkgOfcCd = bkgOfcCd;
	}
	
	/**
	 * Column Info
	 * @param rhqCd
	 */
	public void setRhqCd(String rhqCd) {
		this.rhqCd = rhqCd;
	}
	
	/**
	 * Column Info
	 * @param bkgMiscRev
	 */
	public void setBkgMiscRev(String bkgMiscRev) {
		this.bkgMiscRev = bkgMiscRev;
	}
	
	/**
	 * Column Info
	 * @param fullWtrTrkComAmt
	 */
	public void setFullWtrTrkComAmt(String fullWtrTrkComAmt) {
		this.fullWtrTrkComAmt = fullWtrTrkComAmt;
	}
	
	/**
	 * Column Info
	 * @param shprCntCd
	 */
	public void setShprCntCd(String shprCntCd) {
		this.shprCntCd = shprCntCd;
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
	 * @param n4thRlaneCd
	 */
	public void setN4thRlaneCd(String n4thRlaneCd) {
		this.n4thRlaneCd = n4thRlaneCd;
	}
	
	/**
	 * Column Info
	 * @param fullWtrDirComAmt
	 */
	public void setFullWtrDirComAmt(String fullWtrDirComAmt) {
		this.fullWtrDirComAmt = fullWtrDirComAmt;
	}
	
	/**
	 * Column Info
	 * @param bkgCgoWgt
	 */
	public void setBkgCgoWgt(String bkgCgoWgt) {
		this.bkgCgoWgt = bkgCgoWgt;
	}
	
	/**
	 * Column Info
	 * @param bkgWgtTpCd
	 */
	public void setBkgWgtTpCd(String bkgWgtTpCd) {
		this.bkgWgtTpCd = bkgWgtTpCd;
	}
	
	/**
	 * Column Info
	 * @param paCmCostTtlAmt
	 */
	public void setPaCmCostTtlAmt(String paCmCostTtlAmt) {
		this.paCmCostTtlAmt = paCmCostTtlAmt;
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
	 * @param n3rdRlaneCd
	 */
	public void setN3rdRlaneCd(String n3rdRlaneCd) {
		this.n3rdRlaneCd = n3rdRlaneCd;
	}
	
	/**
	 * Column Info
	 * @param spclBbCgoFlg
	 */
	public void setSpclBbCgoFlg(String spclBbCgoFlg) {
		this.spclBbCgoFlg = spclBbCgoFlg;
	}
	
	/**
	 * Column Info
	 * @param cntrDpcPaAmt
	 */
	public void setCntrDpcPaAmt(String cntrDpcPaAmt) {
		this.cntrDpcPaAmt = cntrDpcPaAmt;
	}
	
	/**
	 * Column Info
	 * @param n2ndIocContiCd
	 */
	public void setN2ndIocContiCd(String n2ndIocContiCd) {
		this.n2ndIocContiCd = n2ndIocContiCd;
	}
	
	/**
	 * Column Info
	 * @param costWk
	 */
	public void setCostWk(String costWk) {
		this.costWk = costWk;
	}
	
	/**
	 * Column Info
	 * @param ctrtSrepCd
	 */
	public void setCtrtSrepCd(String ctrtSrepCd) {
		this.ctrtSrepCd = ctrtSrepCd;
	}
	
	/**
	 * Column Info
	 * @param raCmAmt
	 */
	public void setRaCmAmt(String raCmAmt) {
		this.raCmAmt = raCmAmt;
	}
	
	/**
	 * Column Info
	 * @param revPolCd
	 */
	public void setRevPolCd(String revPolCd) {
		this.revPolCd = revPolCd;
	}
	
	/**
	 * Column Info
	 * @param chssInsurPaAmt
	 */
	public void setChssInsurPaAmt(String chssInsurPaAmt) {
		this.chssInsurPaAmt = chssInsurPaAmt;
	}
	
	/**
	 * Column Info
	 * @param cntrRcvDt
	 */
	public void setCntrRcvDt(String cntrRcvDt) {
		this.cntrRcvDt = cntrRcvDt;
	}
	
	/**
	 * Column Info
	 * @param mtyStvgPaAmt
	 */
	public void setMtyStvgPaAmt(String mtyStvgPaAmt) {
		this.mtyStvgPaAmt = mtyStvgPaAmt;
	}
	
	/**
	 * Column Info
	 * @param chssDpcPaAmt
	 */
	public void setChssDpcPaAmt(String chssDpcPaAmt) {
		this.chssDpcPaAmt = chssDpcPaAmt;
	}
	
	/**
	 * Column Info
	 * @param scrChgRev
	 */
	public void setScrChgRev(String scrChgRev) {
		this.scrChgRev = scrChgRev;
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
	 * @param n3rdIocContiCd
	 */
	public void setN3rdIocContiCd(String n3rdIocContiCd) {
		this.n3rdIocContiCd = n3rdIocContiCd;
	}
	
	/**
	 * Column Info
	 * @param otrCyHndlComAmt
	 */
	public void setOtrCyHndlComAmt(String otrCyHndlComAmt) {
		this.otrCyHndlComAmt = otrCyHndlComAmt;
	}
	
	/**
	 * Column Info
	 * @param paCmAmt
	 */
	public void setPaCmAmt(String paCmAmt) {
		this.paCmAmt = paCmAmt;
	}
	
	/**
	 * Column Info
	 * @param bkgStsCd
	 */
	public void setBkgStsCd(String bkgStsCd) {
		this.bkgStsCd = bkgStsCd;
	}
	
	/**
	 * Column Info
	 * @param rdFlg
	 */
	public void setRdFlg(String rdFlg) {
		this.rdFlg = rdFlg;
	}
	
	/**
	 * Column Info
	 * @param agmtCustSeq
	 */
	public void setAgmtCustSeq(String agmtCustSeq) {
		this.agmtCustSeq = agmtCustSeq;
	}
	
	/**
	 * Column Info
	 * @param raOpPreBxAmt
	 */
	public void setRaOpPreBxAmt(String raOpPreBxAmt) {
		this.raOpPreBxAmt = raOpPreBxAmt;
	}
	
	/**
	 * Column Info
	 * @param miscCgoHndlComAmt
	 */
	public void setMiscCgoHndlComAmt(String miscCgoHndlComAmt) {
		this.miscCgoHndlComAmt = miscCgoHndlComAmt;
	}
	
	/**
	 * Column Info
	 * @param n4thIocContiCd
	 */
	public void setN4thIocContiCd(String n4thIocContiCd) {
		this.n4thIocContiCd = n4thIocContiCd;
	}
	
	/**
	 * Column Info
	 * @param cmdtCd
	 */
	public void setCmdtCd(String cmdtCd) {
		this.cmdtCd = cmdtCd;
	}
	
	/**
	 * Column Info
	 * @param n3rdPolCd
	 */
	public void setN3rdPolCd(String n3rdPolCd) {
		this.n3rdPolCd = n3rdPolCd;
	}
	
	/**
	 * Column Info
	 * @param bkgQty
	 */
	public void setBkgQty(String bkgQty) {
		this.bkgQty = bkgQty;
	}
	
	/**
	 * Column Info
	 * @param revPodCd
	 */
	public void setRevPodCd(String revPodCd) {
		this.revPodCd = revPodCd;
	}
	
	/**
	 * Column Info
	 * @param dirCd
	 */
	public void setDirCd(String dirCd) {
		this.dirCd = dirCd;
	}
	
	/**
	 * Column Info
	 * @param spclAwkCgoFlg
	 */
	public void setSpclAwkCgoFlg(String spclAwkCgoFlg) {
		this.spclAwkCgoFlg = spclAwkCgoFlg;
	}
	
	/**
	 * Column Info
	 * @param rgnOfcCd
	 */
	public void setRgnOfcCd(String rgnOfcCd) {
		this.rgnOfcCd = rgnOfcCd;
	}
	
	/**
	 * Column Info
	 * @param chssStermPaAmt
	 */
	public void setChssStermPaAmt(String chssStermPaAmt) {
		this.chssStermPaAmt = chssStermPaAmt;
	}
	
	/**
	 * Column Info
	 * @param interEqRntlBseAmt
	 */
	public void setInterEqRntlBseAmt(String interEqRntlBseAmt) {
		this.interEqRntlBseAmt = interEqRntlBseAmt;
	}
	
	/**
	 * Column Info
	 * @param cgoVarVolDcAmt
	 */
	public void setCgoVarVolDcAmt(String cgoVarVolDcAmt) {
		this.cgoVarVolDcAmt = cgoVarVolDcAmt;
	}
	
	/**
	 * Column Info
	 * @param n1stFincVvdCd
	 */
	public void setN1stFincVvdCd(String n1stFincVvdCd) {
		this.n1stFincVvdCd = n1stFincVvdCd;
	}
	
	/**
	 * Column Info
	 * @param fullRailDirComAmt
	 */
	public void setFullRailDirComAmt(String fullRailDirComAmt) {
		this.fullRailDirComAmt = fullRailDirComAmt;
	}
	
	/**
	 * Column Info
	 * @param cntrInsurPaAmt
	 */
	public void setCntrInsurPaAmt(String cntrInsurPaAmt) {
		this.cntrInsurPaAmt = cntrInsurPaAmt;
	}
	
	/**
	 * Column Info
	 * @param tsStvgComAmt
	 */
	public void setTsStvgComAmt(String tsStvgComAmt) {
		this.tsStvgComAmt = tsStvgComAmt;
	}
	
	/**
	 * Column Info
	 * @param agmtCustTpCd
	 */
	public void setAgmtCustTpCd(String agmtCustTpCd) {
		this.agmtCustTpCd = agmtCustTpCd;
	}
	
	/**
	 * Column Info
	 * @param bizActPaAmt
	 */
	public void setBizActPaAmt(String bizActPaAmt) {
		this.bizActPaAmt = bizActPaAmt;
	}
	
	/**
	 * Column Info
	 * @param n4thPolCd
	 */
	public void setN4thPolCd(String n4thPolCd) {
		this.n4thPolCd = n4thPolCd;
	}
	
	/**
	 * Column Info
	 * @param ntfyNm
	 */
	public void setNtfyNm(String ntfyNm) {
		this.ntfyNm = ntfyNm;
	}
	
	/**
	 * Column Info
	 * @param raMcgoTzDys
	 */
	public void setRaMcgoTzDys(String raMcgoTzDys) {
		this.raMcgoTzDys = raMcgoTzDys;
	}
	
	/**
	 * Column Info
	 * @param bkgRev
	 */
	public void setBkgRev(String bkgRev) {
		this.bkgRev = bkgRev;
	}
	
	/**
	 * Column Info
	 * @param ntfyCustSeq
	 */
	public void setNtfyCustSeq(String ntfyCustSeq) {
		this.ntfyCustSeq = ntfyCustSeq;
	}
	
	/**
	 * Column Info
	 * @param n3rdPodCd
	 */
	public void setN3rdPodCd(String n3rdPodCd) {
		this.n3rdPodCd = n3rdPodCd;
	}
	
	/**
	 * Column Info
	 * @param slsYrmon
	 */
	public void setSlsYrmon(String slsYrmon) {
		this.slsYrmon = slsYrmon;
	}
	
	/**
	 * Column Info
	 * @param bkgOftRev
	 */
	public void setBkgOftRev(String bkgOftRev) {
		this.bkgOftRev = bkgOftRev;
	}
	
	/**
	 * Column Info
	 * @param cneeNm
	 */
	public void setCneeNm(String cneeNm) {
		this.cneeNm = cneeNm;
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
	 * @param n2ndPolCd
	 */
	public void setN2ndPolCd(String n2ndPolCd) {
		this.n2ndPolCd = n2ndPolCd;
	}
	
	/**
	 * Column Info
	 * @param agmtCntCd
	 */
	public void setAgmtCntCd(String agmtCntCd) {
		this.agmtCntCd = agmtCntCd;
	}
	
	/**
	 * Column Info
	 * @param shprCustSeq
	 */
	public void setShprCustSeq(String shprCustSeq) {
		this.shprCustSeq = shprCustSeq;
	}
	
	/**
	 * Column Info
	 * @param repCmdtCd
	 */
	public void setRepCmdtCd(String repCmdtCd) {
		this.repCmdtCd = repCmdtCd;
	}
	
	/**
	 * Column Info
	 * @param raOpCostTtlAmt
	 */
	public void setRaOpCostTtlAmt(String raOpCostTtlAmt) {
		this.raOpCostTtlAmt = raOpCostTtlAmt;
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
	 * @param n3rdFincVvdCd
	 */
	public void setN3rdFincVvdCd(String n3rdFincVvdCd) {
		this.n3rdFincVvdCd = n3rdFincVvdCd;
	}
	
	/**
	 * Column Info
	 * @param bkgRmk
	 */
	public void setBkgRmk(String bkgRmk) {
		this.bkgRmk = bkgRmk;
	}
	
	/**
	 * Column Info
	 * @param n1stPolCd
	 */
	public void setN1stPolCd(String n1stPolCd) {
		this.n1stPolCd = n1stPolCd;
	}
	
	/**
	 * Column Info
	 * @param chssMnrChgPaAmt
	 */
	public void setChssMnrChgPaAmt(String chssMnrChgPaAmt) {
		this.chssMnrChgPaAmt = chssMnrChgPaAmt;
	}
	
	/**
	 * Column Info
	 * @param trdCd
	 */
	public void setTrdCd(String trdCd) {
		this.trdCd = trdCd;
	}
	
	/**
	 * Column Info
	 * @param rlaneCd
	 */
	public void setRlaneCd(String rlaneCd) {
		this.rlaneCd = rlaneCd;
	}
	
	/**
	 * Column Info
	 * @param fullTrspComAmt
	 */
	public void setFullTrspComAmt(String fullTrspComAmt) {
		this.fullTrspComAmt = fullTrspComAmt;
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
	 * @param srepCd
	 */
	public void setSrepCd(String srepCd) {
		this.srepCd = srepCd;
	}
	
	/**
	 * Column Info
	 * @param n4thPodCd
	 */
	public void setN4thPodCd(String n4thPodCd) {
		this.n4thPodCd = n4thPodCd;
	}
	
	/**
	 * Column Info
	 * @param blNoChk
	 */
	public void setBlNoChk(String blNoChk) {
		this.blNoChk = blNoChk;
	}
	
	/**
	 * Column Info
	 * @param costYrmon
	 */
	public void setCostYrmon(String costYrmon) {
		this.costYrmon = costYrmon;
	}
	
	/**
	 * Column Info
	 * @param chssLtermPaAmt
	 */
	public void setChssLtermPaAmt(String chssLtermPaAmt) {
		this.chssLtermPaAmt = chssLtermPaAmt;
	}
	
	/**
	 * Column Info
	 * @param n4thTrdCd
	 */
	public void setN4thTrdCd(String n4thTrdCd) {
		this.n4thTrdCd = n4thTrdCd;
	}
	
	/**
	 * Column Info
	 * @param scNo
	 */
	public void setScNo(String scNo) {
		this.scNo = scNo;
	}
	
	/**
	 * Column Info
	 * @param blNoTp
	 */
	public void setBlNoTp(String blNoTp) {
		this.blNoTp = blNoTp;
	}
	
	/**
	 * Column Info
	 * @param n1stTrdCd
	 */
	public void setN1stTrdCd(String n1stTrdCd) {
		this.n1stTrdCd = n1stTrdCd;
	}
	
	/**
	 * Column Info
	 * @param n1stRlaneCd
	 */
	public void setN1stRlaneCd(String n1stRlaneCd) {
		this.n1stRlaneCd = n1stRlaneCd;
	}
	
	/**
	 * Column Info
	 * @param n1stPodCd
	 */
	public void setN1stPodCd(String n1stPodCd) {
		this.n1stPodCd = n1stPodCd;
	}
	
	/**
	 * Column Info
	 * @param bkgPorCd
	 */
	public void setBkgPorCd(String bkgPorCd) {
		this.bkgPorCd = bkgPorCd;
	}
	
	/**
	 * Column Info
	 * @param ntfyCntCd
	 */
	public void setNtfyCntCd(String ntfyCntCd) {
		this.ntfyCntCd = ntfyCntCd;
	}
	
	/**
	 * Column Info
	 * @param chssFxAmt
	 */
	public void setChssFxAmt(String chssFxAmt) {
		this.chssFxAmt = chssFxAmt;
	}
	
	/**
	 * Column Info
	 * @param stpIncmAmt
	 */
	public void setStpIncmAmt(String stpIncmAmt) {
		this.stpIncmAmt = stpIncmAmt;
	}
	
	/**
	 * Column Info
	 * @param cntrMnrChgPaAmt
	 */
	public void setCntrMnrChgPaAmt(String cntrMnrChgPaAmt) {
		this.cntrMnrChgPaAmt = cntrMnrChgPaAmt;
	}
	
	/**
	 * Column Info
	 * @param chssDrygPaAmt
	 */
	public void setChssDrygPaAmt(String chssDrygPaAmt) {
		this.chssDrygPaAmt = chssDrygPaAmt;
	}
	
	/**
	 * Column Info
	 * @param otrVolActAmt
	 */
	public void setOtrVolActAmt(String otrVolActAmt) {
		this.otrVolActAmt = otrVolActAmt;
	}
	
	/**
	 * Column Info
	 * @param acComAmt
	 */
	public void setAcComAmt(String acComAmt) {
		this.acComAmt = acComAmt;
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
	 * @param dmdtComAmt
	 */
	public void setDmdtComAmt(String dmdtComAmt) {
		this.dmdtComAmt = dmdtComAmt;
	}
	
	/**
	 * Column Info
	 * @param cntrLtermPaAmt
	 */
	public void setCntrLtermPaAmt(String cntrLtermPaAmt) {
		this.cntrLtermPaAmt = cntrLtermPaAmt;
	}
	
	/**
	 * Column Info
	 * @param cntrFxAmt
	 */
	public void setCntrFxAmt(String cntrFxAmt) {
		this.cntrFxAmt = cntrFxAmt;
	}
	
	/**
	 * Column Info
	 * @param raCmPreBxAmt
	 */
	public void setRaCmPreBxAmt(String raCmPreBxAmt) {
		this.raCmPreBxAmt = raCmPreBxAmt;
	}
	
	/**
	 * Column Info
	 * @param custKeyAgmtMgrFlg
	 */
	public void setCustKeyAgmtMgrFlg(String custKeyAgmtMgrFlg) {
		this.custKeyAgmtMgrFlg = custKeyAgmtMgrFlg;
	}
	
	/**
	 * Column Info
	 * @param subTrdCd
	 */
	public void setSubTrdCd(String subTrdCd) {
		this.subTrdCd = subTrdCd;
	}
	
	/**
	 * Column Info
	 * @param bzcStvgComAmt
	 */
	public void setBzcStvgComAmt(String bzcStvgComAmt) {
		this.bzcStvgComAmt = bzcStvgComAmt;
	}
	
	/**
	 * Column Info
	 * @param scRfaHldCntCd
	 */
	public void setScRfaHldCntCd(String scRfaHldCntCd) {
		this.scRfaHldCntCd = scRfaHldCntCd;
	}
	
	/**
	 * Column Info
	 * @param dckCyHndlComAmt
	 */
	public void setDckCyHndlComAmt(String dckCyHndlComAmt) {
		this.dckCyHndlComAmt = dckCyHndlComAmt;
	}
	
	/**
	 * Column Info
	 * @param cgoHndlComAmt
	 */
	public void setCgoHndlComAmt(String cgoHndlComAmt) {
		this.cgoHndlComAmt = cgoHndlComAmt;
	}
	
	/**
	 * Column Info
	 * @param agmtSgnOfcCd
	 */
	public void setAgmtSgnOfcCd(String agmtSgnOfcCd) {
		this.agmtSgnOfcCd = agmtSgnOfcCd;
	}
	
	/**
	 * Column Info
	 * @param usaBkgModCd
	 */
	public void setUsaBkgModCd(String usaBkgModCd) {
		this.usaBkgModCd = usaBkgModCd;
	}
	
	/**
	 * Column Info
	 * @param spclRcFlg
	 */
	public void setSpclRcFlg(String spclRcFlg) {
		this.spclRcFlg = spclRcFlg;
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
	 * @param n2ndRlaneCd
	 */
	public void setN2ndRlaneCd(String n2ndRlaneCd) {
		this.n2ndRlaneCd = n2ndRlaneCd;
	}
	
	/**
	 * Column Info
	 * @param bkgRcvTermCd
	 */
	public void setBkgRcvTermCd(String bkgRcvTermCd) {
		this.bkgRcvTermCd = bkgRcvTermCd;
	}
	
	/**
	 * Column Info
	 * @param fullRailTrkComAmt
	 */
	public void setFullRailTrkComAmt(String fullRailTrkComAmt) {
		this.fullRailTrkComAmt = fullRailTrkComAmt;
	}
	
	/**
	 * Column Info
	 * @param n4thFincVvdCd
	 */
	public void setN4thFincVvdCd(String n4thFincVvdCd) {
		this.n4thFincVvdCd = n4thFincVvdCd;
	}
	
	/**
	 * Column Info
	 * @param stpCostAmt
	 */
	public void setStpCostAmt(String stpCostAmt) {
		this.stpCostAmt = stpCostAmt;
	}
	
	/**
	 * Column Info
	 * @param rfaNo
	 */
	public void setRfaNo(String rfaNo) {
		this.rfaNo = rfaNo;
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
	 * @param bkgDelCd
	 */
	public void setBkgDelCd(String bkgDelCd) {
		this.bkgDelCd = bkgDelCd;
	}
	
	/**
	 * Column Info
	 * @param revContiCd
	 */
	public void setRevContiCd(String revContiCd) {
		this.revContiCd = revContiCd;
	}
	
	/**
	 * Column Info
	 * @param n3rdTrdCd
	 */
	public void setN3rdTrdCd(String n3rdTrdCd) {
		this.n3rdTrdCd = n3rdTrdCd;
	}
	
	/**
	 * Column Info
	 * @param shprNm
	 */
	public void setShprNm(String shprNm) {
		this.shprNm = shprNm;
	}
	
	/**
	 * Column Info
	 * @param custTpCd
	 */
	public void setCustTpCd(String custTpCd) {
		this.custTpCd = custTpCd;
	}
	
	/**
	 * Column Info
	 * @param cntrStermPaAmt
	 */
	public void setCntrStermPaAmt(String cntrStermPaAmt) {
		this.cntrStermPaAmt = cntrStermPaAmt;
	}
	
	/**
	 * Column Info
	 * @param mtySimAmt
	 */
	public void setMtySimAmt(String mtySimAmt) {
		this.mtySimAmt = mtySimAmt;
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
	 * @param iocCd
	 */
	public void setIocCd(String iocCd) {
		this.iocCd = iocCd;
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
	 * @param sltMgmtUtComAmt
	 */
	public void setSltMgmtUtComAmt(String sltMgmtUtComAmt) {
		this.sltMgmtUtComAmt = sltMgmtUtComAmt;
	}
	
	/**
	 * Column Info
	 * @param fcntrStoComAmt
	 */
	public void setFcntrStoComAmt(String fcntrStoComAmt) {
		this.fcntrStoComAmt = fcntrStoComAmt;
	}
	
	/**
	 * Column Info
	 * @param raFcgoTzDys
	 */
	public void setRaFcgoTzDys(String raFcgoTzDys) {
		this.raFcgoTzDys = raFcgoTzDys;
	}
	
	/**
	 * Column Info
	 * @param ctrtRgnOfcCd
	 */
	public void setCtrtRgnOfcCd(String ctrtRgnOfcCd) {
		this.ctrtRgnOfcCd = ctrtRgnOfcCd;
	}
	
	/**
	 * Column Info
	 * @param raOpAmt
	 */
	public void setRaOpAmt(String raOpAmt) {
		this.raOpAmt = raOpAmt;
	}
	
	/**
	 * Column Info
	 * @param mtyTrspPaAmt
	 */
	public void setMtyTrspPaAmt(String mtyTrspPaAmt) {
		this.mtyTrspPaAmt = mtyTrspPaAmt;
	}
	
	/**
	 * Column Info
	 * @param n1stIocContiCd
	 */
	public void setN1stIocContiCd(String n1stIocContiCd) {
		this.n1stIocContiCd = n1stIocContiCd;
	}
	
	/**
	 * Column Info
	 * @param obrdDt
	 */
	public void setObrdDt(String obrdDt) {
		this.obrdDt = obrdDt;
	}
	
	/**
	 * Column Info
	 * @param socFlg
	 */
	public void setSocFlg(String socFlg) {
		this.socFlg = socFlg;
	}
	
	/**
	 * Column Info
	 * @param oftTpCd
	 */
	public void setOftTpCd(String oftTpCd) {
		this.oftTpCd = oftTpCd;
	}
	
	/**
	 * Column Info
	 * @param paCmPreBxAmt
	 */
	public void setPaCmPreBxAmt(String paCmPreBxAmt) {
		this.paCmPreBxAmt = paCmPreBxAmt;
	}
	
	/**
	 * Column Info
	 * @param n2ndFincVvdCd
	 */
	public void setN2ndFincVvdCd(String n2ndFincVvdCd) {
		this.n2ndFincVvdCd = n2ndFincVvdCd;
	}
	
	/**
	 * Column Info
	 * @param spclCntrTpszCd
	 */
	public void setSpclCntrTpszCd(String spclCntrTpszCd) {
		this.spclCntrTpszCd = spclCntrTpszCd;
	}
	
	/**
	 * Column Info
	 * @param bkgDeTermCd
	 */
	public void setBkgDeTermCd(String bkgDeTermCd) {
		this.bkgDeTermCd = bkgDeTermCd;
	}
	
	/**
	 * Column Info
	 * @param bzcSpclFlg
	 */
	public void setBzcSpclFlg(String bzcSpclFlg) {
		this.bzcSpclFlg = bzcSpclFlg;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setBkgCgoTpCd(JSPUtil.getParameter(request, "bkg_cgo_tp_cd", ""));
		setCostRoutNo(JSPUtil.getParameter(request, "cost_rout_no", ""));
		setCneeCustSeq(JSPUtil.getParameter(request, "cnee_cust_seq", ""));
		setScRfaHldCustSeq(JSPUtil.getParameter(request, "sc_rfa_hld_cust_seq", ""));
		setN2ndPodCd(JSPUtil.getParameter(request, "n2nd_pod_cd", ""));
		setOwnVolActAmt(JSPUtil.getParameter(request, "own_vol_act_amt", ""));
		setCneeCntCd(JSPUtil.getParameter(request, "cnee_cnt_cd", ""));
		setFullTrkDirComAmt(JSPUtil.getParameter(request, "full_trk_dir_com_amt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setCtrtHqOfcCd(JSPUtil.getParameter(request, "ctrt_hq_ofc_cd", ""));
		setN2ndTrdCd(JSPUtil.getParameter(request, "n2nd_trd_cd", ""));
		setBkgPodCd(JSPUtil.getParameter(request, "bkg_pod_cd", ""));
		setTmlComAmt(JSPUtil.getParameter(request, "tml_com_amt", ""));
		setCtrtOfcCd(JSPUtil.getParameter(request, "ctrt_ofc_cd", ""));
		setRaCmCostTtlAmt(JSPUtil.getParameter(request, "ra_cm_cost_ttl_amt", ""));
		setSlsOfcCd(JSPUtil.getParameter(request, "sls_ofc_cd", ""));
		setCntrTpszCd(JSPUtil.getParameter(request, "cntr_tpsz_cd", ""));
		setSpclDgCgoFlg(JSPUtil.getParameter(request, "spcl_dg_cgo_flg", ""));
		setOpInterSltRntlBseAmt(JSPUtil.getParameter(request, "op_inter_slt_rntl_bse_amt", ""));
		setFullWtrRailComAmt(JSPUtil.getParameter(request, "full_wtr_rail_com_amt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setBkgOfcCd(JSPUtil.getParameter(request, "bkg_ofc_cd", ""));
		setRhqCd(JSPUtil.getParameter(request, "rhq_cd", ""));
		setBkgMiscRev(JSPUtil.getParameter(request, "bkg_misc_rev", ""));
		setFullWtrTrkComAmt(JSPUtil.getParameter(request, "full_wtr_trk_com_amt", ""));
		setShprCntCd(JSPUtil.getParameter(request, "shpr_cnt_cd", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, "skd_voy_no", ""));
		setN4thRlaneCd(JSPUtil.getParameter(request, "n4th_rlane_cd", ""));
		setFullWtrDirComAmt(JSPUtil.getParameter(request, "full_wtr_dir_com_amt", ""));
		setBkgCgoWgt(JSPUtil.getParameter(request, "bkg_cgo_wgt", ""));
		setBkgWgtTpCd(JSPUtil.getParameter(request, "bkg_wgt_tp_cd", ""));
		setPaCmCostTtlAmt(JSPUtil.getParameter(request, "pa_cm_cost_ttl_amt", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setN3rdRlaneCd(JSPUtil.getParameter(request, "n3rd_rlane_cd", ""));
		setSpclBbCgoFlg(JSPUtil.getParameter(request, "spcl_bb_cgo_flg", ""));
		setCntrDpcPaAmt(JSPUtil.getParameter(request, "cntr_dpc_pa_amt", ""));
		setN2ndIocContiCd(JSPUtil.getParameter(request, "n2nd_ioc_conti_cd", ""));
		setCostWk(JSPUtil.getParameter(request, "cost_wk", ""));
		setCtrtSrepCd(JSPUtil.getParameter(request, "ctrt_srep_cd", ""));
		setRaCmAmt(JSPUtil.getParameter(request, "ra_cm_amt", ""));
		setRevPolCd(JSPUtil.getParameter(request, "rev_pol_cd", ""));
		setChssInsurPaAmt(JSPUtil.getParameter(request, "chss_insur_pa_amt", ""));
		setCntrRcvDt(JSPUtil.getParameter(request, "cntr_rcv_dt", ""));
		setMtyStvgPaAmt(JSPUtil.getParameter(request, "mty_stvg_pa_amt", ""));
		setChssDpcPaAmt(JSPUtil.getParameter(request, "chss_dpc_pa_amt", ""));
		setScrChgRev(JSPUtil.getParameter(request, "scr_chg_rev", ""));
		setDeltFlg(JSPUtil.getParameter(request, "delt_flg", ""));
		setN3rdIocContiCd(JSPUtil.getParameter(request, "n3rd_ioc_conti_cd", ""));
		setOtrCyHndlComAmt(JSPUtil.getParameter(request, "otr_cy_hndl_com_amt", ""));
		setPaCmAmt(JSPUtil.getParameter(request, "pa_cm_amt", ""));
		setBkgStsCd(JSPUtil.getParameter(request, "bkg_sts_cd", ""));
		setRdFlg(JSPUtil.getParameter(request, "rd_flg", ""));
		setAgmtCustSeq(JSPUtil.getParameter(request, "agmt_cust_seq", ""));
		setRaOpPreBxAmt(JSPUtil.getParameter(request, "ra_op_pre_bx_amt", ""));
		setMiscCgoHndlComAmt(JSPUtil.getParameter(request, "misc_cgo_hndl_com_amt", ""));
		setN4thIocContiCd(JSPUtil.getParameter(request, "n4th_ioc_conti_cd", ""));
		setCmdtCd(JSPUtil.getParameter(request, "cmdt_cd", ""));
		setN3rdPolCd(JSPUtil.getParameter(request, "n3rd_pol_cd", ""));
		setBkgQty(JSPUtil.getParameter(request, "bkg_qty", ""));
		setRevPodCd(JSPUtil.getParameter(request, "rev_pod_cd", ""));
		setDirCd(JSPUtil.getParameter(request, "dir_cd", ""));
		setSpclAwkCgoFlg(JSPUtil.getParameter(request, "spcl_awk_cgo_flg", ""));
		setRgnOfcCd(JSPUtil.getParameter(request, "rgn_ofc_cd", ""));
		setChssStermPaAmt(JSPUtil.getParameter(request, "chss_sterm_pa_amt", ""));
		setInterEqRntlBseAmt(JSPUtil.getParameter(request, "inter_eq_rntl_bse_amt", ""));
		setCgoVarVolDcAmt(JSPUtil.getParameter(request, "cgo_var_vol_dc_amt", ""));
		setN1stFincVvdCd(JSPUtil.getParameter(request, "n1st_finc_vvd_cd", ""));
		setFullRailDirComAmt(JSPUtil.getParameter(request, "full_rail_dir_com_amt", ""));
		setCntrInsurPaAmt(JSPUtil.getParameter(request, "cntr_insur_pa_amt", ""));
		setTsStvgComAmt(JSPUtil.getParameter(request, "ts_stvg_com_amt", ""));
		setAgmtCustTpCd(JSPUtil.getParameter(request, "agmt_cust_tp_cd", ""));
		setBizActPaAmt(JSPUtil.getParameter(request, "biz_act_pa_amt", ""));
		setN4thPolCd(JSPUtil.getParameter(request, "n4th_pol_cd", ""));
		setNtfyNm(JSPUtil.getParameter(request, "ntfy_nm", ""));
		setRaMcgoTzDys(JSPUtil.getParameter(request, "ra_mcgo_tz_dys", ""));
		setBkgRev(JSPUtil.getParameter(request, "bkg_rev", ""));
		setNtfyCustSeq(JSPUtil.getParameter(request, "ntfy_cust_seq", ""));
		setN3rdPodCd(JSPUtil.getParameter(request, "n3rd_pod_cd", ""));
		setSlsYrmon(JSPUtil.getParameter(request, "sls_yrmon", ""));
		setBkgOftRev(JSPUtil.getParameter(request, "bkg_oft_rev", ""));
		setCneeNm(JSPUtil.getParameter(request, "cnee_nm", ""));
		setSlanCd(JSPUtil.getParameter(request, "slan_cd", ""));
		setN2ndPolCd(JSPUtil.getParameter(request, "n2nd_pol_cd", ""));
		setAgmtCntCd(JSPUtil.getParameter(request, "agmt_cnt_cd", ""));
		setShprCustSeq(JSPUtil.getParameter(request, "shpr_cust_seq", ""));
		setRepCmdtCd(JSPUtil.getParameter(request, "rep_cmdt_cd", ""));
		setRaOpCostTtlAmt(JSPUtil.getParameter(request, "ra_op_cost_ttl_amt", ""));
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setN3rdFincVvdCd(JSPUtil.getParameter(request, "n3rd_finc_vvd_cd", ""));
		setBkgRmk(JSPUtil.getParameter(request, "bkg_rmk", ""));
		setN1stPolCd(JSPUtil.getParameter(request, "n1st_pol_cd", ""));
		setChssMnrChgPaAmt(JSPUtil.getParameter(request, "chss_mnr_chg_pa_amt", ""));
		setTrdCd(JSPUtil.getParameter(request, "trd_cd", ""));
		setRlaneCd(JSPUtil.getParameter(request, "rlane_cd", ""));
		setFullTrspComAmt(JSPUtil.getParameter(request, "full_trsp_com_amt", ""));
		setBlNo(JSPUtil.getParameter(request, "bl_no", ""));
		setSrepCd(JSPUtil.getParameter(request, "srep_cd", ""));
		setN4thPodCd(JSPUtil.getParameter(request, "n4th_pod_cd", ""));
		setBlNoChk(JSPUtil.getParameter(request, "bl_no_chk", ""));
		setCostYrmon(JSPUtil.getParameter(request, "cost_yrmon", ""));
		setChssLtermPaAmt(JSPUtil.getParameter(request, "chss_lterm_pa_amt", ""));
		setN4thTrdCd(JSPUtil.getParameter(request, "n4th_trd_cd", ""));
		setScNo(JSPUtil.getParameter(request, "sc_no", ""));
		setBlNoTp(JSPUtil.getParameter(request, "bl_no_tp", ""));
		setN1stTrdCd(JSPUtil.getParameter(request, "n1st_trd_cd", ""));
		setN1stRlaneCd(JSPUtil.getParameter(request, "n1st_rlane_cd", ""));
		setN1stPodCd(JSPUtil.getParameter(request, "n1st_pod_cd", ""));
		setBkgPorCd(JSPUtil.getParameter(request, "bkg_por_cd", ""));
		setNtfyCntCd(JSPUtil.getParameter(request, "ntfy_cnt_cd", ""));
		setChssFxAmt(JSPUtil.getParameter(request, "chss_fx_amt", ""));
		setStpIncmAmt(JSPUtil.getParameter(request, "stp_incm_amt", ""));
		setCntrMnrChgPaAmt(JSPUtil.getParameter(request, "cntr_mnr_chg_pa_amt", ""));
		setChssDrygPaAmt(JSPUtil.getParameter(request, "chss_dryg_pa_amt", ""));
		setOtrVolActAmt(JSPUtil.getParameter(request, "otr_vol_act_amt", ""));
		setAcComAmt(JSPUtil.getParameter(request, "ac_com_amt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setDmdtComAmt(JSPUtil.getParameter(request, "dmdt_com_amt", ""));
		setCntrLtermPaAmt(JSPUtil.getParameter(request, "cntr_lterm_pa_amt", ""));
		setCntrFxAmt(JSPUtil.getParameter(request, "cntr_fx_amt", ""));
		setRaCmPreBxAmt(JSPUtil.getParameter(request, "ra_cm_pre_bx_amt", ""));
		setCustKeyAgmtMgrFlg(JSPUtil.getParameter(request, "cust_key_agmt_mgr_flg", ""));
		setSubTrdCd(JSPUtil.getParameter(request, "sub_trd_cd", ""));
		setBzcStvgComAmt(JSPUtil.getParameter(request, "bzc_stvg_com_amt", ""));
		setScRfaHldCntCd(JSPUtil.getParameter(request, "sc_rfa_hld_cnt_cd", ""));
		setDckCyHndlComAmt(JSPUtil.getParameter(request, "dck_cy_hndl_com_amt", ""));
		setCgoHndlComAmt(JSPUtil.getParameter(request, "cgo_hndl_com_amt", ""));
		setAgmtSgnOfcCd(JSPUtil.getParameter(request, "agmt_sgn_ofc_cd", ""));
		setUsaBkgModCd(JSPUtil.getParameter(request, "usa_bkg_mod_cd", ""));
		setSpclRcFlg(JSPUtil.getParameter(request, "spcl_rc_flg", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setN2ndRlaneCd(JSPUtil.getParameter(request, "n2nd_rlane_cd", ""));
		setBkgRcvTermCd(JSPUtil.getParameter(request, "bkg_rcv_term_cd", ""));
		setFullRailTrkComAmt(JSPUtil.getParameter(request, "full_rail_trk_com_amt", ""));
		setN4thFincVvdCd(JSPUtil.getParameter(request, "n4th_finc_vvd_cd", ""));
		setStpCostAmt(JSPUtil.getParameter(request, "stp_cost_amt", ""));
		setRfaNo(JSPUtil.getParameter(request, "rfa_no", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setBkgDelCd(JSPUtil.getParameter(request, "bkg_del_cd", ""));
		setRevContiCd(JSPUtil.getParameter(request, "rev_conti_cd", ""));
		setN3rdTrdCd(JSPUtil.getParameter(request, "n3rd_trd_cd", ""));
		setShprNm(JSPUtil.getParameter(request, "shpr_nm", ""));
		setCustTpCd(JSPUtil.getParameter(request, "cust_tp_cd", ""));
		setCntrStermPaAmt(JSPUtil.getParameter(request, "cntr_sterm_pa_amt", ""));
		setMtySimAmt(JSPUtil.getParameter(request, "mty_sim_amt", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setIocCd(JSPUtil.getParameter(request, "ioc_cd", ""));
		setBkgPolCd(JSPUtil.getParameter(request, "bkg_pol_cd", ""));
		setSltMgmtUtComAmt(JSPUtil.getParameter(request, "slt_mgmt_ut_com_amt", ""));
		setFcntrStoComAmt(JSPUtil.getParameter(request, "fcntr_sto_com_amt", ""));
		setRaFcgoTzDys(JSPUtil.getParameter(request, "ra_fcgo_tz_dys", ""));
		setCtrtRgnOfcCd(JSPUtil.getParameter(request, "ctrt_rgn_ofc_cd", ""));
		setRaOpAmt(JSPUtil.getParameter(request, "ra_op_amt", ""));
		setMtyTrspPaAmt(JSPUtil.getParameter(request, "mty_trsp_pa_amt", ""));
		setN1stIocContiCd(JSPUtil.getParameter(request, "n1st_ioc_conti_cd", ""));
		setObrdDt(JSPUtil.getParameter(request, "obrd_dt", ""));
		setSocFlg(JSPUtil.getParameter(request, "soc_flg", ""));
		setOftTpCd(JSPUtil.getParameter(request, "oft_tp_cd", ""));
		setPaCmPreBxAmt(JSPUtil.getParameter(request, "pa_cm_pre_bx_amt", ""));
		setN2ndFincVvdCd(JSPUtil.getParameter(request, "n2nd_finc_vvd_cd", ""));
		setSpclCntrTpszCd(JSPUtil.getParameter(request, "spcl_cntr_tpsz_cd", ""));
		setBkgDeTermCd(JSPUtil.getParameter(request, "bkg_de_term_cd", ""));
		setBzcSpclFlg(JSPUtil.getParameter(request, "bzc_spcl_flg", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return CoaBkgExpnDtlVO[]
	 */
	public CoaBkgExpnDtlVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return CoaBkgExpnDtlVO[]
	 */
	public CoaBkgExpnDtlVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CoaBkgExpnDtlVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] bkgCgoTpCd = (JSPUtil.getParameter(request, prefix	+ "bkg_cgo_tp_cd", length));
			String[] costRoutNo = (JSPUtil.getParameter(request, prefix	+ "cost_rout_no", length));
			String[] cneeCustSeq = (JSPUtil.getParameter(request, prefix	+ "cnee_cust_seq", length));
			String[] scRfaHldCustSeq = (JSPUtil.getParameter(request, prefix	+ "sc_rfa_hld_cust_seq", length));
			String[] n2ndPodCd = (JSPUtil.getParameter(request, prefix	+ "n2nd_pod_cd", length));
			String[] ownVolActAmt = (JSPUtil.getParameter(request, prefix	+ "own_vol_act_amt", length));
			String[] cneeCntCd = (JSPUtil.getParameter(request, prefix	+ "cnee_cnt_cd", length));
			String[] fullTrkDirComAmt = (JSPUtil.getParameter(request, prefix	+ "full_trk_dir_com_amt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ctrtHqOfcCd = (JSPUtil.getParameter(request, prefix	+ "ctrt_hq_ofc_cd", length));
			String[] n2ndTrdCd = (JSPUtil.getParameter(request, prefix	+ "n2nd_trd_cd", length));
			String[] bkgPodCd = (JSPUtil.getParameter(request, prefix	+ "bkg_pod_cd", length));
			String[] tmlComAmt = (JSPUtil.getParameter(request, prefix	+ "tml_com_amt", length));
			String[] ctrtOfcCd = (JSPUtil.getParameter(request, prefix	+ "ctrt_ofc_cd", length));
			String[] raCmCostTtlAmt = (JSPUtil.getParameter(request, prefix	+ "ra_cm_cost_ttl_amt", length));
			String[] slsOfcCd = (JSPUtil.getParameter(request, prefix	+ "sls_ofc_cd", length));
			String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_cd", length));
			String[] spclDgCgoFlg = (JSPUtil.getParameter(request, prefix	+ "spcl_dg_cgo_flg", length));
			String[] opInterSltRntlBseAmt = (JSPUtil.getParameter(request, prefix	+ "op_inter_slt_rntl_bse_amt", length));
			String[] fullWtrRailComAmt = (JSPUtil.getParameter(request, prefix	+ "full_wtr_rail_com_amt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] bkgOfcCd = (JSPUtil.getParameter(request, prefix	+ "bkg_ofc_cd", length));
			String[] rhqCd = (JSPUtil.getParameter(request, prefix	+ "rhq_cd", length));
			String[] bkgMiscRev = (JSPUtil.getParameter(request, prefix	+ "bkg_misc_rev", length));
			String[] fullWtrTrkComAmt = (JSPUtil.getParameter(request, prefix	+ "full_wtr_trk_com_amt", length));
			String[] shprCntCd = (JSPUtil.getParameter(request, prefix	+ "shpr_cnt_cd", length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no", length));
			String[] n4thRlaneCd = (JSPUtil.getParameter(request, prefix	+ "n4th_rlane_cd", length));
			String[] fullWtrDirComAmt = (JSPUtil.getParameter(request, prefix	+ "full_wtr_dir_com_amt", length));
			String[] bkgCgoWgt = (JSPUtil.getParameter(request, prefix	+ "bkg_cgo_wgt", length));
			String[] bkgWgtTpCd = (JSPUtil.getParameter(request, prefix	+ "bkg_wgt_tp_cd", length));
			String[] paCmCostTtlAmt = (JSPUtil.getParameter(request, prefix	+ "pa_cm_cost_ttl_amt", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] n3rdRlaneCd = (JSPUtil.getParameter(request, prefix	+ "n3rd_rlane_cd", length));
			String[] spclBbCgoFlg = (JSPUtil.getParameter(request, prefix	+ "spcl_bb_cgo_flg", length));
			String[] cntrDpcPaAmt = (JSPUtil.getParameter(request, prefix	+ "cntr_dpc_pa_amt", length));
			String[] n2ndIocContiCd = (JSPUtil.getParameter(request, prefix	+ "n2nd_ioc_conti_cd", length));
			String[] costWk = (JSPUtil.getParameter(request, prefix	+ "cost_wk", length));
			String[] ctrtSrepCd = (JSPUtil.getParameter(request, prefix	+ "ctrt_srep_cd", length));
			String[] raCmAmt = (JSPUtil.getParameter(request, prefix	+ "ra_cm_amt", length));
			String[] revPolCd = (JSPUtil.getParameter(request, prefix	+ "rev_pol_cd", length));
			String[] chssInsurPaAmt = (JSPUtil.getParameter(request, prefix	+ "chss_insur_pa_amt", length));
			String[] cntrRcvDt = (JSPUtil.getParameter(request, prefix	+ "cntr_rcv_dt", length));
			String[] mtyStvgPaAmt = (JSPUtil.getParameter(request, prefix	+ "mty_stvg_pa_amt", length));
			String[] chssDpcPaAmt = (JSPUtil.getParameter(request, prefix	+ "chss_dpc_pa_amt", length));
			String[] scrChgRev = (JSPUtil.getParameter(request, prefix	+ "scr_chg_rev", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] n3rdIocContiCd = (JSPUtil.getParameter(request, prefix	+ "n3rd_ioc_conti_cd", length));
			String[] otrCyHndlComAmt = (JSPUtil.getParameter(request, prefix	+ "otr_cy_hndl_com_amt", length));
			String[] paCmAmt = (JSPUtil.getParameter(request, prefix	+ "pa_cm_amt", length));
			String[] bkgStsCd = (JSPUtil.getParameter(request, prefix	+ "bkg_sts_cd", length));
			String[] rdFlg = (JSPUtil.getParameter(request, prefix	+ "rd_flg", length));
			String[] agmtCustSeq = (JSPUtil.getParameter(request, prefix	+ "agmt_cust_seq", length));
			String[] raOpPreBxAmt = (JSPUtil.getParameter(request, prefix	+ "ra_op_pre_bx_amt", length));
			String[] miscCgoHndlComAmt = (JSPUtil.getParameter(request, prefix	+ "misc_cgo_hndl_com_amt", length));
			String[] n4thIocContiCd = (JSPUtil.getParameter(request, prefix	+ "n4th_ioc_conti_cd", length));
			String[] cmdtCd = (JSPUtil.getParameter(request, prefix	+ "cmdt_cd", length));
			String[] n3rdPolCd = (JSPUtil.getParameter(request, prefix	+ "n3rd_pol_cd", length));
			String[] bkgQty = (JSPUtil.getParameter(request, prefix	+ "bkg_qty", length));
			String[] revPodCd = (JSPUtil.getParameter(request, prefix	+ "rev_pod_cd", length));
			String[] dirCd = (JSPUtil.getParameter(request, prefix	+ "dir_cd", length));
			String[] spclAwkCgoFlg = (JSPUtil.getParameter(request, prefix	+ "spcl_awk_cgo_flg", length));
			String[] rgnOfcCd = (JSPUtil.getParameter(request, prefix	+ "rgn_ofc_cd", length));
			String[] chssStermPaAmt = (JSPUtil.getParameter(request, prefix	+ "chss_sterm_pa_amt", length));
			String[] interEqRntlBseAmt = (JSPUtil.getParameter(request, prefix	+ "inter_eq_rntl_bse_amt", length));
			String[] cgoVarVolDcAmt = (JSPUtil.getParameter(request, prefix	+ "cgo_var_vol_dc_amt", length));
			String[] n1stFincVvdCd = (JSPUtil.getParameter(request, prefix	+ "n1st_finc_vvd_cd", length));
			String[] fullRailDirComAmt = (JSPUtil.getParameter(request, prefix	+ "full_rail_dir_com_amt", length));
			String[] cntrInsurPaAmt = (JSPUtil.getParameter(request, prefix	+ "cntr_insur_pa_amt", length));
			String[] tsStvgComAmt = (JSPUtil.getParameter(request, prefix	+ "ts_stvg_com_amt", length));
			String[] agmtCustTpCd = (JSPUtil.getParameter(request, prefix	+ "agmt_cust_tp_cd", length));
			String[] bizActPaAmt = (JSPUtil.getParameter(request, prefix	+ "biz_act_pa_amt", length));
			String[] n4thPolCd = (JSPUtil.getParameter(request, prefix	+ "n4th_pol_cd", length));
			String[] ntfyNm = (JSPUtil.getParameter(request, prefix	+ "ntfy_nm", length));
			String[] raMcgoTzDys = (JSPUtil.getParameter(request, prefix	+ "ra_mcgo_tz_dys", length));
			String[] bkgRev = (JSPUtil.getParameter(request, prefix	+ "bkg_rev", length));
			String[] ntfyCustSeq = (JSPUtil.getParameter(request, prefix	+ "ntfy_cust_seq", length));
			String[] n3rdPodCd = (JSPUtil.getParameter(request, prefix	+ "n3rd_pod_cd", length));
			String[] slsYrmon = (JSPUtil.getParameter(request, prefix	+ "sls_yrmon", length));
			String[] bkgOftRev = (JSPUtil.getParameter(request, prefix	+ "bkg_oft_rev", length));
			String[] cneeNm = (JSPUtil.getParameter(request, prefix	+ "cnee_nm", length));
			String[] slanCd = (JSPUtil.getParameter(request, prefix	+ "slan_cd", length));
			String[] n2ndPolCd = (JSPUtil.getParameter(request, prefix	+ "n2nd_pol_cd", length));
			String[] agmtCntCd = (JSPUtil.getParameter(request, prefix	+ "agmt_cnt_cd", length));
			String[] shprCustSeq = (JSPUtil.getParameter(request, prefix	+ "shpr_cust_seq", length));
			String[] repCmdtCd = (JSPUtil.getParameter(request, prefix	+ "rep_cmdt_cd", length));
			String[] raOpCostTtlAmt = (JSPUtil.getParameter(request, prefix	+ "ra_op_cost_ttl_amt", length));
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] n3rdFincVvdCd = (JSPUtil.getParameter(request, prefix	+ "n3rd_finc_vvd_cd", length));
			String[] bkgRmk = (JSPUtil.getParameter(request, prefix	+ "bkg_rmk", length));
			String[] n1stPolCd = (JSPUtil.getParameter(request, prefix	+ "n1st_pol_cd", length));
			String[] chssMnrChgPaAmt = (JSPUtil.getParameter(request, prefix	+ "chss_mnr_chg_pa_amt", length));
			String[] trdCd = (JSPUtil.getParameter(request, prefix	+ "trd_cd", length));
			String[] rlaneCd = (JSPUtil.getParameter(request, prefix	+ "rlane_cd", length));
			String[] fullTrspComAmt = (JSPUtil.getParameter(request, prefix	+ "full_trsp_com_amt", length));
			String[] blNo = (JSPUtil.getParameter(request, prefix	+ "bl_no", length));
			String[] srepCd = (JSPUtil.getParameter(request, prefix	+ "srep_cd", length));
			String[] n4thPodCd = (JSPUtil.getParameter(request, prefix	+ "n4th_pod_cd", length));
			String[] blNoChk = (JSPUtil.getParameter(request, prefix	+ "bl_no_chk", length));
			String[] costYrmon = (JSPUtil.getParameter(request, prefix	+ "cost_yrmon", length));
			String[] chssLtermPaAmt = (JSPUtil.getParameter(request, prefix	+ "chss_lterm_pa_amt", length));
			String[] n4thTrdCd = (JSPUtil.getParameter(request, prefix	+ "n4th_trd_cd", length));
			String[] scNo = (JSPUtil.getParameter(request, prefix	+ "sc_no", length));
			String[] blNoTp = (JSPUtil.getParameter(request, prefix	+ "bl_no_tp", length));
			String[] n1stTrdCd = (JSPUtil.getParameter(request, prefix	+ "n1st_trd_cd", length));
			String[] n1stRlaneCd = (JSPUtil.getParameter(request, prefix	+ "n1st_rlane_cd", length));
			String[] n1stPodCd = (JSPUtil.getParameter(request, prefix	+ "n1st_pod_cd", length));
			String[] bkgPorCd = (JSPUtil.getParameter(request, prefix	+ "bkg_por_cd", length));
			String[] ntfyCntCd = (JSPUtil.getParameter(request, prefix	+ "ntfy_cnt_cd", length));
			String[] chssFxAmt = (JSPUtil.getParameter(request, prefix	+ "chss_fx_amt", length));
			String[] stpIncmAmt = (JSPUtil.getParameter(request, prefix	+ "stp_incm_amt", length));
			String[] cntrMnrChgPaAmt = (JSPUtil.getParameter(request, prefix	+ "cntr_mnr_chg_pa_amt", length));
			String[] chssDrygPaAmt = (JSPUtil.getParameter(request, prefix	+ "chss_dryg_pa_amt", length));
			String[] otrVolActAmt = (JSPUtil.getParameter(request, prefix	+ "otr_vol_act_amt", length));
			String[] acComAmt = (JSPUtil.getParameter(request, prefix	+ "ac_com_amt", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] dmdtComAmt = (JSPUtil.getParameter(request, prefix	+ "dmdt_com_amt", length));
			String[] cntrLtermPaAmt = (JSPUtil.getParameter(request, prefix	+ "cntr_lterm_pa_amt", length));
			String[] cntrFxAmt = (JSPUtil.getParameter(request, prefix	+ "cntr_fx_amt", length));
			String[] raCmPreBxAmt = (JSPUtil.getParameter(request, prefix	+ "ra_cm_pre_bx_amt", length));
			String[] custKeyAgmtMgrFlg = (JSPUtil.getParameter(request, prefix	+ "cust_key_agmt_mgr_flg", length));
			String[] subTrdCd = (JSPUtil.getParameter(request, prefix	+ "sub_trd_cd", length));
			String[] bzcStvgComAmt = (JSPUtil.getParameter(request, prefix	+ "bzc_stvg_com_amt", length));
			String[] scRfaHldCntCd = (JSPUtil.getParameter(request, prefix	+ "sc_rfa_hld_cnt_cd", length));
			String[] dckCyHndlComAmt = (JSPUtil.getParameter(request, prefix	+ "dck_cy_hndl_com_amt", length));
			String[] cgoHndlComAmt = (JSPUtil.getParameter(request, prefix	+ "cgo_hndl_com_amt", length));
			String[] agmtSgnOfcCd = (JSPUtil.getParameter(request, prefix	+ "agmt_sgn_ofc_cd", length));
			String[] usaBkgModCd = (JSPUtil.getParameter(request, prefix	+ "usa_bkg_mod_cd", length));
			String[] spclRcFlg = (JSPUtil.getParameter(request, prefix	+ "spcl_rc_flg", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] n2ndRlaneCd = (JSPUtil.getParameter(request, prefix	+ "n2nd_rlane_cd", length));
			String[] bkgRcvTermCd = (JSPUtil.getParameter(request, prefix	+ "bkg_rcv_term_cd", length));
			String[] fullRailTrkComAmt = (JSPUtil.getParameter(request, prefix	+ "full_rail_trk_com_amt", length));
			String[] n4thFincVvdCd = (JSPUtil.getParameter(request, prefix	+ "n4th_finc_vvd_cd", length));
			String[] stpCostAmt = (JSPUtil.getParameter(request, prefix	+ "stp_cost_amt", length));
			String[] rfaNo = (JSPUtil.getParameter(request, prefix	+ "rfa_no", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] bkgDelCd = (JSPUtil.getParameter(request, prefix	+ "bkg_del_cd", length));
			String[] revContiCd = (JSPUtil.getParameter(request, prefix	+ "rev_conti_cd", length));
			String[] n3rdTrdCd = (JSPUtil.getParameter(request, prefix	+ "n3rd_trd_cd", length));
			String[] shprNm = (JSPUtil.getParameter(request, prefix	+ "shpr_nm", length));
			String[] custTpCd = (JSPUtil.getParameter(request, prefix	+ "cust_tp_cd", length));
			String[] cntrStermPaAmt = (JSPUtil.getParameter(request, prefix	+ "cntr_sterm_pa_amt", length));
			String[] mtySimAmt = (JSPUtil.getParameter(request, prefix	+ "mty_sim_amt", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] iocCd = (JSPUtil.getParameter(request, prefix	+ "ioc_cd", length));
			String[] bkgPolCd = (JSPUtil.getParameter(request, prefix	+ "bkg_pol_cd", length));
			String[] sltMgmtUtComAmt = (JSPUtil.getParameter(request, prefix	+ "slt_mgmt_ut_com_amt", length));
			String[] fcntrStoComAmt = (JSPUtil.getParameter(request, prefix	+ "fcntr_sto_com_amt", length));
			String[] raFcgoTzDys = (JSPUtil.getParameter(request, prefix	+ "ra_fcgo_tz_dys", length));
			String[] ctrtRgnOfcCd = (JSPUtil.getParameter(request, prefix	+ "ctrt_rgn_ofc_cd", length));
			String[] raOpAmt = (JSPUtil.getParameter(request, prefix	+ "ra_op_amt", length));
			String[] mtyTrspPaAmt = (JSPUtil.getParameter(request, prefix	+ "mty_trsp_pa_amt", length));
			String[] n1stIocContiCd = (JSPUtil.getParameter(request, prefix	+ "n1st_ioc_conti_cd", length));
			String[] obrdDt = (JSPUtil.getParameter(request, prefix	+ "obrd_dt", length));
			String[] socFlg = (JSPUtil.getParameter(request, prefix	+ "soc_flg", length));
			String[] oftTpCd = (JSPUtil.getParameter(request, prefix	+ "oft_tp_cd", length));
			String[] paCmPreBxAmt = (JSPUtil.getParameter(request, prefix	+ "pa_cm_pre_bx_amt", length));
			String[] n2ndFincVvdCd = (JSPUtil.getParameter(request, prefix	+ "n2nd_finc_vvd_cd", length));
			String[] spclCntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "spcl_cntr_tpsz_cd", length));
			String[] bkgDeTermCd = (JSPUtil.getParameter(request, prefix	+ "bkg_de_term_cd", length));
			String[] bzcSpclFlg = (JSPUtil.getParameter(request, prefix	+ "bzc_spcl_flg", length));
			
			for (int i = 0; i < length; i++) {
				model = new CoaBkgExpnDtlVO();
				if (bkgCgoTpCd[i] != null)
					model.setBkgCgoTpCd(bkgCgoTpCd[i]);
				if (costRoutNo[i] != null)
					model.setCostRoutNo(costRoutNo[i]);
				if (cneeCustSeq[i] != null)
					model.setCneeCustSeq(cneeCustSeq[i]);
				if (scRfaHldCustSeq[i] != null)
					model.setScRfaHldCustSeq(scRfaHldCustSeq[i]);
				if (n2ndPodCd[i] != null)
					model.setN2ndPodCd(n2ndPodCd[i]);
				if (ownVolActAmt[i] != null)
					model.setOwnVolActAmt(ownVolActAmt[i]);
				if (cneeCntCd[i] != null)
					model.setCneeCntCd(cneeCntCd[i]);
				if (fullTrkDirComAmt[i] != null)
					model.setFullTrkDirComAmt(fullTrkDirComAmt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ctrtHqOfcCd[i] != null)
					model.setCtrtHqOfcCd(ctrtHqOfcCd[i]);
				if (n2ndTrdCd[i] != null)
					model.setN2ndTrdCd(n2ndTrdCd[i]);
				if (bkgPodCd[i] != null)
					model.setBkgPodCd(bkgPodCd[i]);
				if (tmlComAmt[i] != null)
					model.setTmlComAmt(tmlComAmt[i]);
				if (ctrtOfcCd[i] != null)
					model.setCtrtOfcCd(ctrtOfcCd[i]);
				if (raCmCostTtlAmt[i] != null)
					model.setRaCmCostTtlAmt(raCmCostTtlAmt[i]);
				if (slsOfcCd[i] != null)
					model.setSlsOfcCd(slsOfcCd[i]);
				if (cntrTpszCd[i] != null)
					model.setCntrTpszCd(cntrTpszCd[i]);
				if (spclDgCgoFlg[i] != null)
					model.setSpclDgCgoFlg(spclDgCgoFlg[i]);
				if (opInterSltRntlBseAmt[i] != null)
					model.setOpInterSltRntlBseAmt(opInterSltRntlBseAmt[i]);
				if (fullWtrRailComAmt[i] != null)
					model.setFullWtrRailComAmt(fullWtrRailComAmt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (bkgOfcCd[i] != null)
					model.setBkgOfcCd(bkgOfcCd[i]);
				if (rhqCd[i] != null)
					model.setRhqCd(rhqCd[i]);
				if (bkgMiscRev[i] != null)
					model.setBkgMiscRev(bkgMiscRev[i]);
				if (fullWtrTrkComAmt[i] != null)
					model.setFullWtrTrkComAmt(fullWtrTrkComAmt[i]);
				if (shprCntCd[i] != null)
					model.setShprCntCd(shprCntCd[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (n4thRlaneCd[i] != null)
					model.setN4thRlaneCd(n4thRlaneCd[i]);
				if (fullWtrDirComAmt[i] != null)
					model.setFullWtrDirComAmt(fullWtrDirComAmt[i]);
				if (bkgCgoWgt[i] != null)
					model.setBkgCgoWgt(bkgCgoWgt[i]);
				if (bkgWgtTpCd[i] != null)
					model.setBkgWgtTpCd(bkgWgtTpCd[i]);
				if (paCmCostTtlAmt[i] != null)
					model.setPaCmCostTtlAmt(paCmCostTtlAmt[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (n3rdRlaneCd[i] != null)
					model.setN3rdRlaneCd(n3rdRlaneCd[i]);
				if (spclBbCgoFlg[i] != null)
					model.setSpclBbCgoFlg(spclBbCgoFlg[i]);
				if (cntrDpcPaAmt[i] != null)
					model.setCntrDpcPaAmt(cntrDpcPaAmt[i]);
				if (n2ndIocContiCd[i] != null)
					model.setN2ndIocContiCd(n2ndIocContiCd[i]);
				if (costWk[i] != null)
					model.setCostWk(costWk[i]);
				if (ctrtSrepCd[i] != null)
					model.setCtrtSrepCd(ctrtSrepCd[i]);
				if (raCmAmt[i] != null)
					model.setRaCmAmt(raCmAmt[i]);
				if (revPolCd[i] != null)
					model.setRevPolCd(revPolCd[i]);
				if (chssInsurPaAmt[i] != null)
					model.setChssInsurPaAmt(chssInsurPaAmt[i]);
				if (cntrRcvDt[i] != null)
					model.setCntrRcvDt(cntrRcvDt[i]);
				if (mtyStvgPaAmt[i] != null)
					model.setMtyStvgPaAmt(mtyStvgPaAmt[i]);
				if (chssDpcPaAmt[i] != null)
					model.setChssDpcPaAmt(chssDpcPaAmt[i]);
				if (scrChgRev[i] != null)
					model.setScrChgRev(scrChgRev[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (n3rdIocContiCd[i] != null)
					model.setN3rdIocContiCd(n3rdIocContiCd[i]);
				if (otrCyHndlComAmt[i] != null)
					model.setOtrCyHndlComAmt(otrCyHndlComAmt[i]);
				if (paCmAmt[i] != null)
					model.setPaCmAmt(paCmAmt[i]);
				if (bkgStsCd[i] != null)
					model.setBkgStsCd(bkgStsCd[i]);
				if (rdFlg[i] != null)
					model.setRdFlg(rdFlg[i]);
				if (agmtCustSeq[i] != null)
					model.setAgmtCustSeq(agmtCustSeq[i]);
				if (raOpPreBxAmt[i] != null)
					model.setRaOpPreBxAmt(raOpPreBxAmt[i]);
				if (miscCgoHndlComAmt[i] != null)
					model.setMiscCgoHndlComAmt(miscCgoHndlComAmt[i]);
				if (n4thIocContiCd[i] != null)
					model.setN4thIocContiCd(n4thIocContiCd[i]);
				if (cmdtCd[i] != null)
					model.setCmdtCd(cmdtCd[i]);
				if (n3rdPolCd[i] != null)
					model.setN3rdPolCd(n3rdPolCd[i]);
				if (bkgQty[i] != null)
					model.setBkgQty(bkgQty[i]);
				if (revPodCd[i] != null)
					model.setRevPodCd(revPodCd[i]);
				if (dirCd[i] != null)
					model.setDirCd(dirCd[i]);
				if (spclAwkCgoFlg[i] != null)
					model.setSpclAwkCgoFlg(spclAwkCgoFlg[i]);
				if (rgnOfcCd[i] != null)
					model.setRgnOfcCd(rgnOfcCd[i]);
				if (chssStermPaAmt[i] != null)
					model.setChssStermPaAmt(chssStermPaAmt[i]);
				if (interEqRntlBseAmt[i] != null)
					model.setInterEqRntlBseAmt(interEqRntlBseAmt[i]);
				if (cgoVarVolDcAmt[i] != null)
					model.setCgoVarVolDcAmt(cgoVarVolDcAmt[i]);
				if (n1stFincVvdCd[i] != null)
					model.setN1stFincVvdCd(n1stFincVvdCd[i]);
				if (fullRailDirComAmt[i] != null)
					model.setFullRailDirComAmt(fullRailDirComAmt[i]);
				if (cntrInsurPaAmt[i] != null)
					model.setCntrInsurPaAmt(cntrInsurPaAmt[i]);
				if (tsStvgComAmt[i] != null)
					model.setTsStvgComAmt(tsStvgComAmt[i]);
				if (agmtCustTpCd[i] != null)
					model.setAgmtCustTpCd(agmtCustTpCd[i]);
				if (bizActPaAmt[i] != null)
					model.setBizActPaAmt(bizActPaAmt[i]);
				if (n4thPolCd[i] != null)
					model.setN4thPolCd(n4thPolCd[i]);
				if (ntfyNm[i] != null)
					model.setNtfyNm(ntfyNm[i]);
				if (raMcgoTzDys[i] != null)
					model.setRaMcgoTzDys(raMcgoTzDys[i]);
				if (bkgRev[i] != null)
					model.setBkgRev(bkgRev[i]);
				if (ntfyCustSeq[i] != null)
					model.setNtfyCustSeq(ntfyCustSeq[i]);
				if (n3rdPodCd[i] != null)
					model.setN3rdPodCd(n3rdPodCd[i]);
				if (slsYrmon[i] != null)
					model.setSlsYrmon(slsYrmon[i]);
				if (bkgOftRev[i] != null)
					model.setBkgOftRev(bkgOftRev[i]);
				if (cneeNm[i] != null)
					model.setCneeNm(cneeNm[i]);
				if (slanCd[i] != null)
					model.setSlanCd(slanCd[i]);
				if (n2ndPolCd[i] != null)
					model.setN2ndPolCd(n2ndPolCd[i]);
				if (agmtCntCd[i] != null)
					model.setAgmtCntCd(agmtCntCd[i]);
				if (shprCustSeq[i] != null)
					model.setShprCustSeq(shprCustSeq[i]);
				if (repCmdtCd[i] != null)
					model.setRepCmdtCd(repCmdtCd[i]);
				if (raOpCostTtlAmt[i] != null)
					model.setRaOpCostTtlAmt(raOpCostTtlAmt[i]);
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (n3rdFincVvdCd[i] != null)
					model.setN3rdFincVvdCd(n3rdFincVvdCd[i]);
				if (bkgRmk[i] != null)
					model.setBkgRmk(bkgRmk[i]);
				if (n1stPolCd[i] != null)
					model.setN1stPolCd(n1stPolCd[i]);
				if (chssMnrChgPaAmt[i] != null)
					model.setChssMnrChgPaAmt(chssMnrChgPaAmt[i]);
				if (trdCd[i] != null)
					model.setTrdCd(trdCd[i]);
				if (rlaneCd[i] != null)
					model.setRlaneCd(rlaneCd[i]);
				if (fullTrspComAmt[i] != null)
					model.setFullTrspComAmt(fullTrspComAmt[i]);
				if (blNo[i] != null)
					model.setBlNo(blNo[i]);
				if (srepCd[i] != null)
					model.setSrepCd(srepCd[i]);
				if (n4thPodCd[i] != null)
					model.setN4thPodCd(n4thPodCd[i]);
				if (blNoChk[i] != null)
					model.setBlNoChk(blNoChk[i]);
				if (costYrmon[i] != null)
					model.setCostYrmon(costYrmon[i]);
				if (chssLtermPaAmt[i] != null)
					model.setChssLtermPaAmt(chssLtermPaAmt[i]);
				if (n4thTrdCd[i] != null)
					model.setN4thTrdCd(n4thTrdCd[i]);
				if (scNo[i] != null)
					model.setScNo(scNo[i]);
				if (blNoTp[i] != null)
					model.setBlNoTp(blNoTp[i]);
				if (n1stTrdCd[i] != null)
					model.setN1stTrdCd(n1stTrdCd[i]);
				if (n1stRlaneCd[i] != null)
					model.setN1stRlaneCd(n1stRlaneCd[i]);
				if (n1stPodCd[i] != null)
					model.setN1stPodCd(n1stPodCd[i]);
				if (bkgPorCd[i] != null)
					model.setBkgPorCd(bkgPorCd[i]);
				if (ntfyCntCd[i] != null)
					model.setNtfyCntCd(ntfyCntCd[i]);
				if (chssFxAmt[i] != null)
					model.setChssFxAmt(chssFxAmt[i]);
				if (stpIncmAmt[i] != null)
					model.setStpIncmAmt(stpIncmAmt[i]);
				if (cntrMnrChgPaAmt[i] != null)
					model.setCntrMnrChgPaAmt(cntrMnrChgPaAmt[i]);
				if (chssDrygPaAmt[i] != null)
					model.setChssDrygPaAmt(chssDrygPaAmt[i]);
				if (otrVolActAmt[i] != null)
					model.setOtrVolActAmt(otrVolActAmt[i]);
				if (acComAmt[i] != null)
					model.setAcComAmt(acComAmt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (dmdtComAmt[i] != null)
					model.setDmdtComAmt(dmdtComAmt[i]);
				if (cntrLtermPaAmt[i] != null)
					model.setCntrLtermPaAmt(cntrLtermPaAmt[i]);
				if (cntrFxAmt[i] != null)
					model.setCntrFxAmt(cntrFxAmt[i]);
				if (raCmPreBxAmt[i] != null)
					model.setRaCmPreBxAmt(raCmPreBxAmt[i]);
				if (custKeyAgmtMgrFlg[i] != null)
					model.setCustKeyAgmtMgrFlg(custKeyAgmtMgrFlg[i]);
				if (subTrdCd[i] != null)
					model.setSubTrdCd(subTrdCd[i]);
				if (bzcStvgComAmt[i] != null)
					model.setBzcStvgComAmt(bzcStvgComAmt[i]);
				if (scRfaHldCntCd[i] != null)
					model.setScRfaHldCntCd(scRfaHldCntCd[i]);
				if (dckCyHndlComAmt[i] != null)
					model.setDckCyHndlComAmt(dckCyHndlComAmt[i]);
				if (cgoHndlComAmt[i] != null)
					model.setCgoHndlComAmt(cgoHndlComAmt[i]);
				if (agmtSgnOfcCd[i] != null)
					model.setAgmtSgnOfcCd(agmtSgnOfcCd[i]);
				if (usaBkgModCd[i] != null)
					model.setUsaBkgModCd(usaBkgModCd[i]);
				if (spclRcFlg[i] != null)
					model.setSpclRcFlg(spclRcFlg[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (n2ndRlaneCd[i] != null)
					model.setN2ndRlaneCd(n2ndRlaneCd[i]);
				if (bkgRcvTermCd[i] != null)
					model.setBkgRcvTermCd(bkgRcvTermCd[i]);
				if (fullRailTrkComAmt[i] != null)
					model.setFullRailTrkComAmt(fullRailTrkComAmt[i]);
				if (n4thFincVvdCd[i] != null)
					model.setN4thFincVvdCd(n4thFincVvdCd[i]);
				if (stpCostAmt[i] != null)
					model.setStpCostAmt(stpCostAmt[i]);
				if (rfaNo[i] != null)
					model.setRfaNo(rfaNo[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (bkgDelCd[i] != null)
					model.setBkgDelCd(bkgDelCd[i]);
				if (revContiCd[i] != null)
					model.setRevContiCd(revContiCd[i]);
				if (n3rdTrdCd[i] != null)
					model.setN3rdTrdCd(n3rdTrdCd[i]);
				if (shprNm[i] != null)
					model.setShprNm(shprNm[i]);
				if (custTpCd[i] != null)
					model.setCustTpCd(custTpCd[i]);
				if (cntrStermPaAmt[i] != null)
					model.setCntrStermPaAmt(cntrStermPaAmt[i]);
				if (mtySimAmt[i] != null)
					model.setMtySimAmt(mtySimAmt[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (iocCd[i] != null)
					model.setIocCd(iocCd[i]);
				if (bkgPolCd[i] != null)
					model.setBkgPolCd(bkgPolCd[i]);
				if (sltMgmtUtComAmt[i] != null)
					model.setSltMgmtUtComAmt(sltMgmtUtComAmt[i]);
				if (fcntrStoComAmt[i] != null)
					model.setFcntrStoComAmt(fcntrStoComAmt[i]);
				if (raFcgoTzDys[i] != null)
					model.setRaFcgoTzDys(raFcgoTzDys[i]);
				if (ctrtRgnOfcCd[i] != null)
					model.setCtrtRgnOfcCd(ctrtRgnOfcCd[i]);
				if (raOpAmt[i] != null)
					model.setRaOpAmt(raOpAmt[i]);
				if (mtyTrspPaAmt[i] != null)
					model.setMtyTrspPaAmt(mtyTrspPaAmt[i]);
				if (n1stIocContiCd[i] != null)
					model.setN1stIocContiCd(n1stIocContiCd[i]);
				if (obrdDt[i] != null)
					model.setObrdDt(obrdDt[i]);
				if (socFlg[i] != null)
					model.setSocFlg(socFlg[i]);
				if (oftTpCd[i] != null)
					model.setOftTpCd(oftTpCd[i]);
				if (paCmPreBxAmt[i] != null)
					model.setPaCmPreBxAmt(paCmPreBxAmt[i]);
				if (n2ndFincVvdCd[i] != null)
					model.setN2ndFincVvdCd(n2ndFincVvdCd[i]);
				if (spclCntrTpszCd[i] != null)
					model.setSpclCntrTpszCd(spclCntrTpszCd[i]);
				if (bkgDeTermCd[i] != null)
					model.setBkgDeTermCd(bkgDeTermCd[i]);
				if (bzcSpclFlg[i] != null)
					model.setBzcSpclFlg(bzcSpclFlg[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getCoaBkgExpnDtlVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return CoaBkgExpnDtlVO[]
	 */
	public CoaBkgExpnDtlVO[] getCoaBkgExpnDtlVOs(){
		CoaBkgExpnDtlVO[] vos = (CoaBkgExpnDtlVO[])models.toArray(new CoaBkgExpnDtlVO[models.size()]);
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
		this.bkgCgoTpCd = this.bkgCgoTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costRoutNo = this.costRoutNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cneeCustSeq = this.cneeCustSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.scRfaHldCustSeq = this.scRfaHldCustSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndPodCd = this.n2ndPodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ownVolActAmt = this.ownVolActAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cneeCntCd = this.cneeCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fullTrkDirComAmt = this.fullTrkDirComAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ctrtHqOfcCd = this.ctrtHqOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndTrdCd = this.n2ndTrdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgPodCd = this.bkgPodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlComAmt = this.tmlComAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ctrtOfcCd = this.ctrtOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.raCmCostTtlAmt = this.raCmCostTtlAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slsOfcCd = this.slsOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszCd = this.cntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spclDgCgoFlg = this.spclDgCgoFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.opInterSltRntlBseAmt = this.opInterSltRntlBseAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fullWtrRailComAmt = this.fullWtrRailComAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgOfcCd = this.bkgOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rhqCd = this.rhqCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgMiscRev = this.bkgMiscRev .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fullWtrTrkComAmt = this.fullWtrTrkComAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.shprCntCd = this.shprCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n4thRlaneCd = this.n4thRlaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fullWtrDirComAmt = this.fullWtrDirComAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgCgoWgt = this.bkgCgoWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgWgtTpCd = this.bkgWgtTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.paCmCostTtlAmt = this.paCmCostTtlAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdRlaneCd = this.n3rdRlaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spclBbCgoFlg = this.spclBbCgoFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrDpcPaAmt = this.cntrDpcPaAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndIocContiCd = this.n2ndIocContiCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costWk = this.costWk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ctrtSrepCd = this.ctrtSrepCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.raCmAmt = this.raCmAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.revPolCd = this.revPolCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssInsurPaAmt = this.chssInsurPaAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrRcvDt = this.cntrRcvDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mtyStvgPaAmt = this.mtyStvgPaAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssDpcPaAmt = this.chssDpcPaAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.scrChgRev = this.scrChgRev .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdIocContiCd = this.n3rdIocContiCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.otrCyHndlComAmt = this.otrCyHndlComAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.paCmAmt = this.paCmAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgStsCd = this.bkgStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rdFlg = this.rdFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtCustSeq = this.agmtCustSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.raOpPreBxAmt = this.raOpPreBxAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.miscCgoHndlComAmt = this.miscCgoHndlComAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n4thIocContiCd = this.n4thIocContiCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cmdtCd = this.cmdtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdPolCd = this.n3rdPolCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgQty = this.bkgQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.revPodCd = this.revPodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dirCd = this.dirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spclAwkCgoFlg = this.spclAwkCgoFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rgnOfcCd = this.rgnOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssStermPaAmt = this.chssStermPaAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.interEqRntlBseAmt = this.interEqRntlBseAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cgoVarVolDcAmt = this.cgoVarVolDcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stFincVvdCd = this.n1stFincVvdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fullRailDirComAmt = this.fullRailDirComAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrInsurPaAmt = this.cntrInsurPaAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tsStvgComAmt = this.tsStvgComAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtCustTpCd = this.agmtCustTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bizActPaAmt = this.bizActPaAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n4thPolCd = this.n4thPolCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ntfyNm = this.ntfyNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.raMcgoTzDys = this.raMcgoTzDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgRev = this.bkgRev .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ntfyCustSeq = this.ntfyCustSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdPodCd = this.n3rdPodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slsYrmon = this.slsYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgOftRev = this.bkgOftRev .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cneeNm = this.cneeNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slanCd = this.slanCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndPolCd = this.n2ndPolCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtCntCd = this.agmtCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.shprCustSeq = this.shprCustSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.repCmdtCd = this.repCmdtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.raOpCostTtlAmt = this.raOpCostTtlAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdFincVvdCd = this.n3rdFincVvdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgRmk = this.bkgRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stPolCd = this.n1stPolCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssMnrChgPaAmt = this.chssMnrChgPaAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trdCd = this.trdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rlaneCd = this.rlaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fullTrspComAmt = this.fullTrspComAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blNo = this.blNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.srepCd = this.srepCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n4thPodCd = this.n4thPodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blNoChk = this.blNoChk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costYrmon = this.costYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssLtermPaAmt = this.chssLtermPaAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n4thTrdCd = this.n4thTrdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.scNo = this.scNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blNoTp = this.blNoTp .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stTrdCd = this.n1stTrdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stRlaneCd = this.n1stRlaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stPodCd = this.n1stPodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgPorCd = this.bkgPorCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ntfyCntCd = this.ntfyCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssFxAmt = this.chssFxAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stpIncmAmt = this.stpIncmAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrMnrChgPaAmt = this.cntrMnrChgPaAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssDrygPaAmt = this.chssDrygPaAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.otrVolActAmt = this.otrVolActAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acComAmt = this.acComAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dmdtComAmt = this.dmdtComAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrLtermPaAmt = this.cntrLtermPaAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrFxAmt = this.cntrFxAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.raCmPreBxAmt = this.raCmPreBxAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custKeyAgmtMgrFlg = this.custKeyAgmtMgrFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.subTrdCd = this.subTrdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bzcStvgComAmt = this.bzcStvgComAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.scRfaHldCntCd = this.scRfaHldCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dckCyHndlComAmt = this.dckCyHndlComAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cgoHndlComAmt = this.cgoHndlComAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtSgnOfcCd = this.agmtSgnOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usaBkgModCd = this.usaBkgModCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spclRcFlg = this.spclRcFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndRlaneCd = this.n2ndRlaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgRcvTermCd = this.bkgRcvTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fullRailTrkComAmt = this.fullRailTrkComAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n4thFincVvdCd = this.n4thFincVvdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stpCostAmt = this.stpCostAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rfaNo = this.rfaNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgDelCd = this.bkgDelCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.revContiCd = this.revContiCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdTrdCd = this.n3rdTrdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.shprNm = this.shprNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custTpCd = this.custTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrStermPaAmt = this.cntrStermPaAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mtySimAmt = this.mtySimAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.iocCd = this.iocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgPolCd = this.bkgPolCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sltMgmtUtComAmt = this.sltMgmtUtComAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fcntrStoComAmt = this.fcntrStoComAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.raFcgoTzDys = this.raFcgoTzDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ctrtRgnOfcCd = this.ctrtRgnOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.raOpAmt = this.raOpAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mtyTrspPaAmt = this.mtyTrspPaAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stIocContiCd = this.n1stIocContiCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.obrdDt = this.obrdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.socFlg = this.socFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.oftTpCd = this.oftTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.paCmPreBxAmt = this.paCmPreBxAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndFincVvdCd = this.n2ndFincVvdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spclCntrTpszCd = this.spclCntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgDeTermCd = this.bkgDeTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bzcSpclFlg = this.bzcSpclFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
