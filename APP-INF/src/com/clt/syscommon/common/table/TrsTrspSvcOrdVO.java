/*=========================================================
*Copyright(c) 2016 CyberLogitec
*@FileName : TrsTrspSvcOrdVO.java
*@FileTitle : TrsTrspSvcOrdVO
*Open Issues :
*Change history :
*@LastModifyDate : 2016.06.21
*@LastModifier : 
*@LastVersion : 1.0
* 2016.06.21  
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

public class TrsTrspSvcOrdVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<TrsTrspSvcOrdVO> models = new ArrayList<TrsTrspSvcOrdVO>();
	
	/* Column Info */
	private String ibVvdCd = null;
	/* Column Info */
	private String dorPkupCntrNo = null;
	/* Column Info */
	private String fincVslCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String trspInvActStsCd = null;
	/* Column Info */
	private String n3ptyOfcCd = null;
	/* Column Info */
	private String fdrVslCd = null;
	/* Column Info */
	private String ibdCstmsClrLocCd = null;
	/* Column Info */
	private String cntrTpszCd = null;
	/* Column Info */
	private String actCustAddrSeq = null;
	/* Column Info */
	private String cntrWgt = null;
	/* Column Info */
	private String n3ptyVndrSeq = null;
	/* Column Info */
	private String ediCtrlSeq = null;
	/* Column Info */
	private String troCfmUsrId = null;
	/* Column Info */
	private String troLodRefNo = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String eqTpszCd = null;
	/* Column Info */
	private String negoAmt = null;
	/* Column Info */
	private String ediRcvMsgTpCd = null;
	/* Column Info */
	private String fctryNm = null;
	/* Column Info */
	private String ediSndDt = null;
	/* Column Info */
	private String uplnSoFlg = null;
	/* Column Info */
	private String fincSkdDirCd = null;
	/* Column Info */
	private String deDt = null;
	/* Column Info */
	private String plnYrwk = null;
	/* Column Info */
	private String cntrSltNo = null;
	/* Column Info */
	private String n3ptyBilBzcAmt = null;
	/* Column Info */
	private String interRmk = null;
	/* Column Info */
	private String acctCd = null;
	/* Column Info */
	private String ediRcvPurpCd = null;
	/* Column Info */
	private String dorNodCd = null;
	/* Column Info */
	private String actCustCntCd = null;
	/* Column Info */
	private String trspRqstOrdRevAmt = null;
	/* Column Info */
	private String lstFreeDt = null;
	/* Column Info */
	private String trspCrrModCd = null;
	/* Column Info */
	private String trspOtrCostMonDt = null;
	/* Column Info */
	private String trspAgmtWyTpCd = null;
	/* Column Info */
	private String dorLocCd = null;
	/* Column Info */
	private String trspRjctRsnCd = null;
	/* Column Info */
	private String loclCreDt = null;
	/* Column Info */
	private String lstNodPlnDt = null;
	/* Column Info */
	private String eqKndCd = null;
	/* Column Info */
	private String refInvNo = null;
	/* Column Info */
	private String cntrAvalNtcUpdFlg = null;
	/* Column Info */
	private String lseCntrFlg = null;
	/* Column Info */
	private String fuelScgAmt = null;
	/* Column Info */
	private String n3ptyBilFlg = null;
	/* Column Info */
	private String costActGrpSeq = null;
	/* Column Info */
	private String n1stNodPlnDt = null;
	/* Column Info */
	private String cntrNo = null;
	/* Column Info */
	private String lgsCostCd = null;
	/* Column Info */
	private String viaNodCd = null;
	/* Column Info */
	private String cmbSoRltStsFlg = null;
	/* Column Info */
	private String repCmdtCd = null;
	/* Column Info */
	private String toNodCd = null;
	/* Column Info */
	private String cntrKgsWgt = null;
	/* Column Info */
	private String invVndrSeq = null;
	/* Column Info */
	private String trspSoSeq = null;
	/* Column Info */
	private String copNo = null;
	/* Column Info */
	private String trspAgmtRtTpSerNo = null;
	/* Column Info */
	private String spclCgoCntrTpCd = null;
	/* Column Info */
	private String trspAgmtRtTpCd = null;
	/* Column Info */
	private String rplnUmchFlg = null;
	/* Column Info */
	private String dorNodPlnDt = null;
	/* Column Info */
	private String cstmsClrNo = null;
	/* Column Info */
	private String triAxlReqFlg = null;
	/* Column Info */
	private String csrBzcCorrAmt = null;
	/* Column Info */
	private String woBlNoIssFlg = null;
	/* Column Info */
	private String mtyRdeOrdIssFlg = null;
	/* Column Info */
	private String trspWoSeq = null;
	/* Column Info */
	private String trspMtyRqstDt = null;
	/* Column Info */
	private String mtyRroIssUsrId = null;
	/* Column Info */
	private String costActGrpCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String trspAgmtSeq = null;
	/* Column Info */
	private String wgtMeasUtCd = null;
	/* Column Info */
	private String invBzcAmt = null;
	/* Column Info */
	private String troCfmOfcCd = null;
	/* Column Info */
	private String porCd = null;
	/* Column Info */
	private String contiCd = null;
	/* Column Info */
	private String splIssRsn = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String trspAgmtOfcCtyCd = null;
	/* Column Info */
	private String edwUpdDt = null;
	/* Column Info */
	private String fdrSkdDirCd = null;
	/* Column Info */
	private String loclDeltDt = null;
	/* Column Info */
	private String trspMtyCostModCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String cgoClzDt = null;
	/* Column Info */
	private String apntDt = null;
	/* Column Info */
	private String cntcPsonNm = null;
	/* Column Info */
	private String csrScgCorrAmt = null;
	/* Column Info */
	private String trspSoCmbSrtNo = null;
	/* Column Info */
	private String n3ptyCustCntCd = null;
	/* Column Info */
	private String etcAddAmt = null;
	/* Column Info */
	private String trspBndCd = null;
	/* Column Info */
	private String troSeq = null;
	/* Column Info */
	private String plnSeq = null;
	/* Column Info */
	private String custSeq = null;
	/* Column Info */
	private String invCurrCd = null;
	/* Column Info */
	private String trspNxtPortCd = null;
	/* Column Info */
	private String trspSplSoTpCd = null;
	/* Column Info */
	private String refSeq = null;
	/* Column Info */
	private String orgCostActGrpSeq = null;
	/* Column Info */
	private String obVvdCd = null;
	/* Column Info */
	private String scgIndCd = null;
	/* Column Info */
	private String chssMgstTrspTpCd = null;
	/* Column Info */
	private String trspSoCmbSeq = null;
	/* Column Info */
	private String ediRcvRsltDt = null;
	/* Column Info */
	private String cgoTpCd = null;
	/* Column Info */
	private String n3ptyDesc = null;
	/* Column Info */
	private String dorPstCd = null;
	/* Column Info */
	private String trspFrstFlg = null;
	/* Column Info */
	private String subEqTpszCd = null;
	/* Column Info */
	private String bkgRcvdeTermCd = null;
	/* Column Info */
	private String ediSndMsgTpCd = null;
	/* Column Info */
	private String refBlNo = null;
	/* Column Info */
	private String invXchRt = null;
	/* Column Info */
	private String custCntCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String troSubSeq = null;
	/* Column Info */
	private String trspSoCmbTpCd = null;
	/* Column Info */
	private String ediRjctRsnCd = null;
	/* Column Info */
	private String orgCopNo = null;
	/* Column Info */
	private String refBkgNo = null;
	/* Column Info */
	private String invAdjBzcAmt = null;
	/* Column Info */
	private String cntrPkupNo = null;
	/* Column Info */
	private String podCd = null;
	/* Column Info */
	private String ediRcvRsltCd = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String orgGateOutDt = null;
	/* Column Info */
	private String loclUpdDt = null;
	/* Column Info */
	private String rgstNo = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String dorArrDt = null;
	/* Column Info */
	private String orgBkgNo = null;
	/* Column Info */
	private String n3ptyCustSeq = null;
	/* Column Info */
	private String cmdtCd = null;
	/* Column Info */
	private String dorSvcTpCd = null;
	/* Column Info */
	private String trspSoStsCd = null;
	/* Column Info */
	private String cntrSubFlg = null;
	/* Column Info */
	private String troCfmRevAmt = null;
	/* Column Info */
	private String costOfcCd = null;
	/* Column Info */
	private String actCustSeq = null;
	/* Column Info */
	private String bzcAmt = null;
	/* Column Info */
	private String trspWoOfcCtyCd = null;
	/* Column Info */
	private String invEtcAddAmt = null;
	/* Column Info */
	private String invNo = null;
	/* Column Info */
	private String fmNodCd = null;
	/* Column Info */
	private String slanCd = null;
	/* Column Info */
	private String invRmk = null;
	/* Column Info */
	private String troRepCmdtCd = null;
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String trspAgmtNodSeq = null;
	/* Column Info */
	private String dtnUseFlg = null;
	/* Column Info */
	private String lstLocCd = null;
	/* Column Info */
	private String cntrPkupYdCd = null;
	/* Column Info */
	private String woExeDt = null;
	/* Column Info */
	private String trsSubStsCd = null;
	/* Column Info */
	private String dorDeAddr = null;
	/* Column Info */
	private String trspInvCalcLgcTpCd = null;
	/* Column Info */
	private String blNo = null;
	/* Column Info */
	private String fdrSkdVoyNo = null;
	/* Column Info */
	private String cntcPsonFaxNo = null;
	/* Column Info */
	private String polCd = null;
	/* Column Info */
	private String n3ptyBilTpCd = null;
	/* Column Info */
	private String trspCostDtlModCd = null;
	/* Column Info */
	private String mltStopDeFlg = null;
	/* Column Info */
	private String trspAgmtRtSeq = null;
	/* Column Info */
	private String woRjctFlg = null;
	/* Column Info */
	private String trspSoTpCd = null;
	/* Column Info */
	private String revCurrCd = null;
	/* Column Info */
	private String ownrCoCd = null;
	/* Column Info */
	private String trspDfltVndrFlg = null;
	/* Column Info */
	private String prntTrspSoOfcCtyCd = null;
	/* Column Info */
	private String delCd = null;
	/* Column Info */
	private String mtyRdeOrdIssDt = null;
	/* Column Info */
	private String cntcPsonPhnNo = null;
	/* Column Info */
	private String cntrLbsWgt = null;
	/* Column Info */
	private String orgEqTpszCd = null;
	/* Column Info */
	private String eqAtchDt = null;
	/* Column Info */
	private String vndrSeq = null;
	/* Column Info */
	private String currCd = null;
	/* Column Info */
	private String refId = null;
	/* Column Info */
	private String ediRcvRsndRqstDt = null;
	/* Column Info */
	private String n3ptyCurrCd = null;
	/* Column Info */
	private String trspRqstBkgFlg = null;
	/* Column Info */
	private String trspSoOfcCtyCd = null;
	/* Column Info */
	private String mtyRroIssDt = null;
	/* Column Info */
	private String eqNo = null;
	/* Column Info */
	private String prntTrspSoSeq = null;
	/* Column Info */
	private String creOfcCd = null;
	/* Column Info */
	private String mtyRdeOrdIssUsrId = null;
	/* Column Info */
	private String spclInstrRmk = null;
	/* Column Info */
	private String ediRcvRsltMsg = null;
	/* Column Info */
	private String ovrWgtScgAmt = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String fincSkdVoyNo = null;
	/* Column Info */
	private String trspPurpRsn = null;
	/* Column Info */
	private String mtyRroIssFlg = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Column Info */
	private String repoPlnId = null;
	/* Column Info */
	private String troCfmUpdDt = null;
	/* Column Info */
	private String avalDt = null;
	/* Column Info */
	private String destGateInDt = null;
	/* Column Info */
	private String fincVvdCd = null;
	/* Column Info */
	private String custNomiTrkrFlg = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new LinkedHashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new LinkedHashMap<String, String>();
	
	public TrsTrspSvcOrdVO() {}

	public TrsTrspSvcOrdVO(String ibflag, String pagerows, String trspSoOfcCtyCd, String trspSoSeq, String invNo, String invVndrSeq, String trspWoOfcCtyCd, String trspWoSeq, String trspSoStsCd, String trspSoTpCd, String costActGrpCd, String fmNodCd, String toNodCd, String viaNodCd, String dorNodCd, String vslCd, String skdVoyNo, String skdDirCd, String slanCd, String fincVslCd, String fincSkdVoyNo, String fincSkdDirCd, String fdrVslCd, String fdrSkdVoyNo, String fdrSkdDirCd, String eqTpszCd, String trspBndCd, String eqNo, String bkgNo, String blNo, String custCntCd, String custSeq, String vndrSeq, String custNomiTrkrFlg, String lgsCostCd, String acctCd, String trspCostDtlModCd, String trspCrrModCd, String n3ptyBilFlg, String currCd, String bzcAmt, String etcAddAmt, String fuelScgAmt, String negoAmt, String invCurrCd, String invBzcAmt, String invEtcAddAmt, String trspInvActStsCd, String invRmk, String cntrWgt, String wgtMeasUtCd, String cgoTpCd, String cmdtCd, String dorSvcTpCd, String dorDeAddr, String woBlNoIssFlg, String dtnUseFlg, String mltStopDeFlg, String splIssRsn, String trspPurpRsn, String cmbSoRltStsFlg, String trspMtyRqstDt, String trspSoCmbTpCd, String trspSoCmbSeq, String trspSoCmbSrtNo, String prntTrspSoSeq, String prntTrspSoOfcCtyCd, String trspSplSoTpCd, String chssMgstTrspTpCd, String spclInstrRmk, String n1stNodPlnDt, String dorNodPlnDt, String lstNodPlnDt, String copNo, String costActGrpSeq, String lstLocCd, String bkgRcvdeTermCd, String porCd, String polCd, String podCd, String delCd, String spclCgoCntrTpCd, String ownrCoCd, String cntrPkupNo, String cntrPkupYdCd, String avalDt, String lstFreeDt, String apntDt, String deDt, String rgstNo, String woRjctFlg, String cntrAvalNtcUpdFlg, String ibdCstmsClrLocCd, String trspInvCalcLgcTpCd, String invXchRt, String interRmk, String deltFlg, String creOfcCd, String repoPlnId, String plnYrwk, String plnSeq, String refId, String refSeq, String trspMtyCostModCd, String mtyRroIssFlg, String mtyRroIssDt, String mtyRroIssUsrId, String fctryNm, String cntcPsonNm, String cntcPsonPhnNo, String cntcPsonFaxNo, String mtyRdeOrdIssFlg, String mtyRdeOrdIssDt, String mtyRdeOrdIssUsrId, String trspNxtPortCd, String ediRcvRsltMsg, String ediRcvRsltCd, String ediRcvRsltDt, String trspAgmtRtTpCd, String trspAgmtWyTpCd, String troSeq, String troSubSeq, String trspDfltVndrFlg, String trspFrstFlg, String trspRqstBkgFlg, String ibVvdCd, String obVvdCd, String trspAgmtOfcCtyCd, String trspAgmtSeq, String actCustCntCd, String actCustSeq, String actCustAddrSeq, String trspOtrCostMonDt, String uplnSoFlg, String ediRcvPurpCd, String cstmsClrNo, String trspRqstOrdRevAmt, String revCurrCd, String repCmdtCd, String dorArrDt, String dorLocCd, String csrBzcCorrAmt, String csrScgCorrAmt, String subEqTpszCd, String cntrSubFlg, String cntrNo, String cntrTpszCd, String refBkgNo, String refBlNo, String orgGateOutDt, String destGateInDt, String ovrWgtScgAmt, String trspRjctRsnCd, String fincVvdCd, String cntrKgsWgt, String cntrLbsWgt, String contiCd, String troCfmOfcCd, String troCfmUsrId, String troCfmUpdDt, String troCfmRevAmt, String troRepCmdtCd, String dorPstCd, String troLodRefNo, String orgCopNo, String orgCostActGrpSeq, String orgBkgNo, String orgEqTpszCd, String dorPkupCntrNo, String n3ptyBilBzcAmt, String n3ptyVndrSeq, String n3ptyOfcCd, String n3ptyDesc, String n3ptyCustSeq, String n3ptyCustCntCd, String n3ptyBilTpCd, String n3ptyCurrCd, String ediCtrlSeq, String ediSndMsgTpCd, String ediSndDt, String ediRcvMsgTpCd, String ediRcvRsndRqstDt, String costOfcCd, String lseCntrFlg, String eqKndCd, String woExeDt, String loclCreDt, String loclUpdDt, String creUsrId, String creDt, String updUsrId, String updDt, String rplnUmchFlg, String loclDeltDt, String trsSubStsCd, String refInvNo, String ediRjctRsnCd, String edwUpdDt, String trspAgmtRtTpSerNo, String cgoClzDt, String trspAgmtNodSeq, String trspAgmtRtSeq, String triAxlReqFlg, String cntrSltNo, String scgIndCd, String eqAtchDt, String invAdjBzcAmt) {
		this.ibVvdCd = ibVvdCd;
		this.dorPkupCntrNo = dorPkupCntrNo;
		this.fincVslCd = fincVslCd;
		this.pagerows = pagerows;
		this.trspInvActStsCd = trspInvActStsCd;
		this.n3ptyOfcCd = n3ptyOfcCd;
		this.fdrVslCd = fdrVslCd;
		this.ibdCstmsClrLocCd = ibdCstmsClrLocCd;
		this.cntrTpszCd = cntrTpszCd;
		this.actCustAddrSeq = actCustAddrSeq;
		this.cntrWgt = cntrWgt;
		this.n3ptyVndrSeq = n3ptyVndrSeq;
		this.ediCtrlSeq = ediCtrlSeq;
		this.troCfmUsrId = troCfmUsrId;
		this.troLodRefNo = troLodRefNo;
		this.skdVoyNo = skdVoyNo;
		this.eqTpszCd = eqTpszCd;
		this.negoAmt = negoAmt;
		this.ediRcvMsgTpCd = ediRcvMsgTpCd;
		this.fctryNm = fctryNm;
		this.ediSndDt = ediSndDt;
		this.uplnSoFlg = uplnSoFlg;
		this.fincSkdDirCd = fincSkdDirCd;
		this.deDt = deDt;
		this.plnYrwk = plnYrwk;
		this.cntrSltNo = cntrSltNo;
		this.n3ptyBilBzcAmt = n3ptyBilBzcAmt;
		this.interRmk = interRmk;
		this.acctCd = acctCd;
		this.ediRcvPurpCd = ediRcvPurpCd;
		this.dorNodCd = dorNodCd;
		this.actCustCntCd = actCustCntCd;
		this.trspRqstOrdRevAmt = trspRqstOrdRevAmt;
		this.lstFreeDt = lstFreeDt;
		this.trspCrrModCd = trspCrrModCd;
		this.trspOtrCostMonDt = trspOtrCostMonDt;
		this.trspAgmtWyTpCd = trspAgmtWyTpCd;
		this.dorLocCd = dorLocCd;
		this.trspRjctRsnCd = trspRjctRsnCd;
		this.loclCreDt = loclCreDt;
		this.lstNodPlnDt = lstNodPlnDt;
		this.eqKndCd = eqKndCd;
		this.refInvNo = refInvNo;
		this.cntrAvalNtcUpdFlg = cntrAvalNtcUpdFlg;
		this.lseCntrFlg = lseCntrFlg;
		this.fuelScgAmt = fuelScgAmt;
		this.n3ptyBilFlg = n3ptyBilFlg;
		this.costActGrpSeq = costActGrpSeq;
		this.n1stNodPlnDt = n1stNodPlnDt;
		this.cntrNo = cntrNo;
		this.lgsCostCd = lgsCostCd;
		this.viaNodCd = viaNodCd;
		this.cmbSoRltStsFlg = cmbSoRltStsFlg;
		this.repCmdtCd = repCmdtCd;
		this.toNodCd = toNodCd;
		this.cntrKgsWgt = cntrKgsWgt;
		this.invVndrSeq = invVndrSeq;
		this.trspSoSeq = trspSoSeq;
		this.copNo = copNo;
		this.trspAgmtRtTpSerNo = trspAgmtRtTpSerNo;
		this.spclCgoCntrTpCd = spclCgoCntrTpCd;
		this.trspAgmtRtTpCd = trspAgmtRtTpCd;
		this.rplnUmchFlg = rplnUmchFlg;
		this.dorNodPlnDt = dorNodPlnDt;
		this.cstmsClrNo = cstmsClrNo;
		this.triAxlReqFlg = triAxlReqFlg;
		this.csrBzcCorrAmt = csrBzcCorrAmt;
		this.woBlNoIssFlg = woBlNoIssFlg;
		this.mtyRdeOrdIssFlg = mtyRdeOrdIssFlg;
		this.trspWoSeq = trspWoSeq;
		this.trspMtyRqstDt = trspMtyRqstDt;
		this.mtyRroIssUsrId = mtyRroIssUsrId;
		this.costActGrpCd = costActGrpCd;
		this.creUsrId = creUsrId;
		this.trspAgmtSeq = trspAgmtSeq;
		this.wgtMeasUtCd = wgtMeasUtCd;
		this.invBzcAmt = invBzcAmt;
		this.troCfmOfcCd = troCfmOfcCd;
		this.porCd = porCd;
		this.contiCd = contiCd;
		this.splIssRsn = splIssRsn;
		this.creDt = creDt;
		this.trspAgmtOfcCtyCd = trspAgmtOfcCtyCd;
		this.edwUpdDt = edwUpdDt;
		this.fdrSkdDirCd = fdrSkdDirCd;
		this.loclDeltDt = loclDeltDt;
		this.trspMtyCostModCd = trspMtyCostModCd;
		this.ibflag = ibflag;
		this.cgoClzDt = cgoClzDt;
		this.apntDt = apntDt;
		this.cntcPsonNm = cntcPsonNm;
		this.csrScgCorrAmt = csrScgCorrAmt;
		this.trspSoCmbSrtNo = trspSoCmbSrtNo;
		this.n3ptyCustCntCd = n3ptyCustCntCd;
		this.etcAddAmt = etcAddAmt;
		this.trspBndCd = trspBndCd;
		this.troSeq = troSeq;
		this.plnSeq = plnSeq;
		this.custSeq = custSeq;
		this.invCurrCd = invCurrCd;
		this.trspNxtPortCd = trspNxtPortCd;
		this.trspSplSoTpCd = trspSplSoTpCd;
		this.refSeq = refSeq;
		this.orgCostActGrpSeq = orgCostActGrpSeq;
		this.obVvdCd = obVvdCd;
		this.scgIndCd = scgIndCd;
		this.chssMgstTrspTpCd = chssMgstTrspTpCd;
		this.trspSoCmbSeq = trspSoCmbSeq;
		this.ediRcvRsltDt = ediRcvRsltDt;
		this.cgoTpCd = cgoTpCd;
		this.n3ptyDesc = n3ptyDesc;
		this.dorPstCd = dorPstCd;
		this.trspFrstFlg = trspFrstFlg;
		this.subEqTpszCd = subEqTpszCd;
		this.bkgRcvdeTermCd = bkgRcvdeTermCd;
		this.ediSndMsgTpCd = ediSndMsgTpCd;
		this.refBlNo = refBlNo;
		this.invXchRt = invXchRt;
		this.custCntCd = custCntCd;
		this.updUsrId = updUsrId;
		this.troSubSeq = troSubSeq;
		this.trspSoCmbTpCd = trspSoCmbTpCd;
		this.ediRjctRsnCd = ediRjctRsnCd;
		this.orgCopNo = orgCopNo;
		this.refBkgNo = refBkgNo;
		this.invAdjBzcAmt = invAdjBzcAmt;
		this.cntrPkupNo = cntrPkupNo;
		this.podCd = podCd;
		this.ediRcvRsltCd = ediRcvRsltCd;
		this.bkgNo = bkgNo;
		this.orgGateOutDt = orgGateOutDt;
		this.loclUpdDt = loclUpdDt;
		this.rgstNo = rgstNo;
		this.deltFlg = deltFlg;
		this.dorArrDt = dorArrDt;
		this.orgBkgNo = orgBkgNo;
		this.n3ptyCustSeq = n3ptyCustSeq;
		this.cmdtCd = cmdtCd;
		this.dorSvcTpCd = dorSvcTpCd;
		this.trspSoStsCd = trspSoStsCd;
		this.cntrSubFlg = cntrSubFlg;
		this.troCfmRevAmt = troCfmRevAmt;
		this.costOfcCd = costOfcCd;
		this.actCustSeq = actCustSeq;
		this.bzcAmt = bzcAmt;
		this.trspWoOfcCtyCd = trspWoOfcCtyCd;
		this.invEtcAddAmt = invEtcAddAmt;
		this.invNo = invNo;
		this.fmNodCd = fmNodCd;
		this.slanCd = slanCd;
		this.invRmk = invRmk;
		this.troRepCmdtCd = troRepCmdtCd;
		this.vslCd = vslCd;
		this.trspAgmtNodSeq = trspAgmtNodSeq;
		this.dtnUseFlg = dtnUseFlg;
		this.lstLocCd = lstLocCd;
		this.cntrPkupYdCd = cntrPkupYdCd;
		this.woExeDt = woExeDt;
		this.trsSubStsCd = trsSubStsCd;
		this.dorDeAddr = dorDeAddr;
		this.trspInvCalcLgcTpCd = trspInvCalcLgcTpCd;
		this.blNo = blNo;
		this.fdrSkdVoyNo = fdrSkdVoyNo;
		this.cntcPsonFaxNo = cntcPsonFaxNo;
		this.polCd = polCd;
		this.n3ptyBilTpCd = n3ptyBilTpCd;
		this.trspCostDtlModCd = trspCostDtlModCd;
		this.mltStopDeFlg = mltStopDeFlg;
		this.trspAgmtRtSeq = trspAgmtRtSeq;
		this.woRjctFlg = woRjctFlg;
		this.trspSoTpCd = trspSoTpCd;
		this.revCurrCd = revCurrCd;
		this.ownrCoCd = ownrCoCd;
		this.trspDfltVndrFlg = trspDfltVndrFlg;
		this.prntTrspSoOfcCtyCd = prntTrspSoOfcCtyCd;
		this.delCd = delCd;
		this.mtyRdeOrdIssDt = mtyRdeOrdIssDt;
		this.cntcPsonPhnNo = cntcPsonPhnNo;
		this.cntrLbsWgt = cntrLbsWgt;
		this.orgEqTpszCd = orgEqTpszCd;
		this.eqAtchDt = eqAtchDt;
		this.vndrSeq = vndrSeq;
		this.currCd = currCd;
		this.refId = refId;
		this.ediRcvRsndRqstDt = ediRcvRsndRqstDt;
		this.n3ptyCurrCd = n3ptyCurrCd;
		this.trspRqstBkgFlg = trspRqstBkgFlg;
		this.trspSoOfcCtyCd = trspSoOfcCtyCd;
		this.mtyRroIssDt = mtyRroIssDt;
		this.eqNo = eqNo;
		this.prntTrspSoSeq = prntTrspSoSeq;
		this.creOfcCd = creOfcCd;
		this.mtyRdeOrdIssUsrId = mtyRdeOrdIssUsrId;
		this.spclInstrRmk = spclInstrRmk;
		this.ediRcvRsltMsg = ediRcvRsltMsg;
		this.ovrWgtScgAmt = ovrWgtScgAmt;
		this.updDt = updDt;
		this.fincSkdVoyNo = fincSkdVoyNo;
		this.trspPurpRsn = trspPurpRsn;
		this.mtyRroIssFlg = mtyRroIssFlg;
		this.skdDirCd = skdDirCd;
		this.repoPlnId = repoPlnId;
		this.troCfmUpdDt = troCfmUpdDt;
		this.avalDt = avalDt;
		this.destGateInDt = destGateInDt;
		this.fincVvdCd = fincVvdCd;
		this.custNomiTrkrFlg = custNomiTrkrFlg;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("ib_vvd_cd", getIbVvdCd());
		this.hashColumns.put("dor_pkup_cntr_no", getDorPkupCntrNo());
		this.hashColumns.put("finc_vsl_cd", getFincVslCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("trsp_inv_act_sts_cd", getTrspInvActStsCd());
		this.hashColumns.put("n3pty_ofc_cd", getN3ptyOfcCd());
		this.hashColumns.put("fdr_vsl_cd", getFdrVslCd());
		this.hashColumns.put("ibd_cstms_clr_loc_cd", getIbdCstmsClrLocCd());
		this.hashColumns.put("cntr_tpsz_cd", getCntrTpszCd());
		this.hashColumns.put("act_cust_addr_seq", getActCustAddrSeq());
		this.hashColumns.put("cntr_wgt", getCntrWgt());
		this.hashColumns.put("n3pty_vndr_seq", getN3ptyVndrSeq());
		this.hashColumns.put("edi_ctrl_seq", getEdiCtrlSeq());
		this.hashColumns.put("tro_cfm_usr_id", getTroCfmUsrId());
		this.hashColumns.put("tro_lod_ref_no", getTroLodRefNo());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("eq_tpsz_cd", getEqTpszCd());
		this.hashColumns.put("nego_amt", getNegoAmt());
		this.hashColumns.put("edi_rcv_msg_tp_cd", getEdiRcvMsgTpCd());
		this.hashColumns.put("fctry_nm", getFctryNm());
		this.hashColumns.put("edi_snd_dt", getEdiSndDt());
		this.hashColumns.put("upln_so_flg", getUplnSoFlg());
		this.hashColumns.put("finc_skd_dir_cd", getFincSkdDirCd());
		this.hashColumns.put("de_dt", getDeDt());
		this.hashColumns.put("pln_yrwk", getPlnYrwk());
		this.hashColumns.put("cntr_slt_no", getCntrSltNo());
		this.hashColumns.put("n3pty_bil_bzc_amt", getN3ptyBilBzcAmt());
		this.hashColumns.put("inter_rmk", getInterRmk());
		this.hashColumns.put("acct_cd", getAcctCd());
		this.hashColumns.put("edi_rcv_purp_cd", getEdiRcvPurpCd());
		this.hashColumns.put("dor_nod_cd", getDorNodCd());
		this.hashColumns.put("act_cust_cnt_cd", getActCustCntCd());
		this.hashColumns.put("trsp_rqst_ord_rev_amt", getTrspRqstOrdRevAmt());
		this.hashColumns.put("lst_free_dt", getLstFreeDt());
		this.hashColumns.put("trsp_crr_mod_cd", getTrspCrrModCd());
		this.hashColumns.put("trsp_otr_cost_mon_dt", getTrspOtrCostMonDt());
		this.hashColumns.put("trsp_agmt_wy_tp_cd", getTrspAgmtWyTpCd());
		this.hashColumns.put("dor_loc_cd", getDorLocCd());
		this.hashColumns.put("trsp_rjct_rsn_cd", getTrspRjctRsnCd());
		this.hashColumns.put("locl_cre_dt", getLoclCreDt());
		this.hashColumns.put("lst_nod_pln_dt", getLstNodPlnDt());
		this.hashColumns.put("eq_knd_cd", getEqKndCd());
		this.hashColumns.put("ref_inv_no", getRefInvNo());
		this.hashColumns.put("cntr_aval_ntc_upd_flg", getCntrAvalNtcUpdFlg());
		this.hashColumns.put("lse_cntr_flg", getLseCntrFlg());
		this.hashColumns.put("fuel_scg_amt", getFuelScgAmt());
		this.hashColumns.put("n3pty_bil_flg", getN3ptyBilFlg());
		this.hashColumns.put("cost_act_grp_seq", getCostActGrpSeq());
		this.hashColumns.put("n1st_nod_pln_dt", getN1stNodPlnDt());
		this.hashColumns.put("cntr_no", getCntrNo());
		this.hashColumns.put("lgs_cost_cd", getLgsCostCd());
		this.hashColumns.put("via_nod_cd", getViaNodCd());
		this.hashColumns.put("cmb_so_rlt_sts_flg", getCmbSoRltStsFlg());
		this.hashColumns.put("rep_cmdt_cd", getRepCmdtCd());
		this.hashColumns.put("to_nod_cd", getToNodCd());
		this.hashColumns.put("cntr_kgs_wgt", getCntrKgsWgt());
		this.hashColumns.put("inv_vndr_seq", getInvVndrSeq());
		this.hashColumns.put("trsp_so_seq", getTrspSoSeq());
		this.hashColumns.put("cop_no", getCopNo());
		this.hashColumns.put("trsp_agmt_rt_tp_ser_no", getTrspAgmtRtTpSerNo());
		this.hashColumns.put("spcl_cgo_cntr_tp_cd", getSpclCgoCntrTpCd());
		this.hashColumns.put("trsp_agmt_rt_tp_cd", getTrspAgmtRtTpCd());
		this.hashColumns.put("rpln_umch_flg", getRplnUmchFlg());
		this.hashColumns.put("dor_nod_pln_dt", getDorNodPlnDt());
		this.hashColumns.put("cstms_clr_no", getCstmsClrNo());
		this.hashColumns.put("tri_axl_req_flg", getTriAxlReqFlg());
		this.hashColumns.put("csr_bzc_corr_amt", getCsrBzcCorrAmt());
		this.hashColumns.put("wo_bl_no_iss_flg", getWoBlNoIssFlg());
		this.hashColumns.put("mty_rde_ord_iss_flg", getMtyRdeOrdIssFlg());
		this.hashColumns.put("trsp_wo_seq", getTrspWoSeq());
		this.hashColumns.put("trsp_mty_rqst_dt", getTrspMtyRqstDt());
		this.hashColumns.put("mty_rro_iss_usr_id", getMtyRroIssUsrId());
		this.hashColumns.put("cost_act_grp_cd", getCostActGrpCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("trsp_agmt_seq", getTrspAgmtSeq());
		this.hashColumns.put("wgt_meas_ut_cd", getWgtMeasUtCd());
		this.hashColumns.put("inv_bzc_amt", getInvBzcAmt());
		this.hashColumns.put("tro_cfm_ofc_cd", getTroCfmOfcCd());
		this.hashColumns.put("por_cd", getPorCd());
		this.hashColumns.put("conti_cd", getContiCd());
		this.hashColumns.put("spl_iss_rsn", getSplIssRsn());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("trsp_agmt_ofc_cty_cd", getTrspAgmtOfcCtyCd());
		this.hashColumns.put("edw_upd_dt", getEdwUpdDt());
		this.hashColumns.put("fdr_skd_dir_cd", getFdrSkdDirCd());
		this.hashColumns.put("locl_delt_dt", getLoclDeltDt());
		this.hashColumns.put("trsp_mty_cost_mod_cd", getTrspMtyCostModCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cgo_clz_dt", getCgoClzDt());
		this.hashColumns.put("apnt_dt", getApntDt());
		this.hashColumns.put("cntc_pson_nm", getCntcPsonNm());
		this.hashColumns.put("csr_scg_corr_amt", getCsrScgCorrAmt());
		this.hashColumns.put("trsp_so_cmb_srt_no", getTrspSoCmbSrtNo());
		this.hashColumns.put("n3pty_cust_cnt_cd", getN3ptyCustCntCd());
		this.hashColumns.put("etc_add_amt", getEtcAddAmt());
		this.hashColumns.put("trsp_bnd_cd", getTrspBndCd());
		this.hashColumns.put("tro_seq", getTroSeq());
		this.hashColumns.put("pln_seq", getPlnSeq());
		this.hashColumns.put("cust_seq", getCustSeq());
		this.hashColumns.put("inv_curr_cd", getInvCurrCd());
		this.hashColumns.put("trsp_nxt_port_cd", getTrspNxtPortCd());
		this.hashColumns.put("trsp_spl_so_tp_cd", getTrspSplSoTpCd());
		this.hashColumns.put("ref_seq", getRefSeq());
		this.hashColumns.put("org_cost_act_grp_seq", getOrgCostActGrpSeq());
		this.hashColumns.put("ob_vvd_cd", getObVvdCd());
		this.hashColumns.put("scg_ind_cd", getScgIndCd());
		this.hashColumns.put("chss_mgst_trsp_tp_cd", getChssMgstTrspTpCd());
		this.hashColumns.put("trsp_so_cmb_seq", getTrspSoCmbSeq());
		this.hashColumns.put("edi_rcv_rslt_dt", getEdiRcvRsltDt());
		this.hashColumns.put("cgo_tp_cd", getCgoTpCd());
		this.hashColumns.put("n3pty_desc", getN3ptyDesc());
		this.hashColumns.put("dor_pst_cd", getDorPstCd());
		this.hashColumns.put("trsp_frst_flg", getTrspFrstFlg());
		this.hashColumns.put("sub_eq_tpsz_cd", getSubEqTpszCd());
		this.hashColumns.put("bkg_rcvde_term_cd", getBkgRcvdeTermCd());
		this.hashColumns.put("edi_snd_msg_tp_cd", getEdiSndMsgTpCd());
		this.hashColumns.put("ref_bl_no", getRefBlNo());
		this.hashColumns.put("inv_xch_rt", getInvXchRt());
		this.hashColumns.put("cust_cnt_cd", getCustCntCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("tro_sub_seq", getTroSubSeq());
		this.hashColumns.put("trsp_so_cmb_tp_cd", getTrspSoCmbTpCd());
		this.hashColumns.put("edi_rjct_rsn_cd", getEdiRjctRsnCd());
		this.hashColumns.put("org_cop_no", getOrgCopNo());
		this.hashColumns.put("ref_bkg_no", getRefBkgNo());
		this.hashColumns.put("inv_adj_bzc_amt", getInvAdjBzcAmt());
		this.hashColumns.put("cntr_pkup_no", getCntrPkupNo());
		this.hashColumns.put("pod_cd", getPodCd());
		this.hashColumns.put("edi_rcv_rslt_cd", getEdiRcvRsltCd());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("org_gate_out_dt", getOrgGateOutDt());
		this.hashColumns.put("locl_upd_dt", getLoclUpdDt());
		this.hashColumns.put("rgst_no", getRgstNo());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("dor_arr_dt", getDorArrDt());
		this.hashColumns.put("org_bkg_no", getOrgBkgNo());
		this.hashColumns.put("n3pty_cust_seq", getN3ptyCustSeq());
		this.hashColumns.put("cmdt_cd", getCmdtCd());
		this.hashColumns.put("dor_svc_tp_cd", getDorSvcTpCd());
		this.hashColumns.put("trsp_so_sts_cd", getTrspSoStsCd());
		this.hashColumns.put("cntr_sub_flg", getCntrSubFlg());
		this.hashColumns.put("tro_cfm_rev_amt", getTroCfmRevAmt());
		this.hashColumns.put("cost_ofc_cd", getCostOfcCd());
		this.hashColumns.put("act_cust_seq", getActCustSeq());
		this.hashColumns.put("bzc_amt", getBzcAmt());
		this.hashColumns.put("trsp_wo_ofc_cty_cd", getTrspWoOfcCtyCd());
		this.hashColumns.put("inv_etc_add_amt", getInvEtcAddAmt());
		this.hashColumns.put("inv_no", getInvNo());
		this.hashColumns.put("fm_nod_cd", getFmNodCd());
		this.hashColumns.put("slan_cd", getSlanCd());
		this.hashColumns.put("inv_rmk", getInvRmk());
		this.hashColumns.put("tro_rep_cmdt_cd", getTroRepCmdtCd());
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("trsp_agmt_nod_seq", getTrspAgmtNodSeq());
		this.hashColumns.put("dtn_use_flg", getDtnUseFlg());
		this.hashColumns.put("lst_loc_cd", getLstLocCd());
		this.hashColumns.put("cntr_pkup_yd_cd", getCntrPkupYdCd());
		this.hashColumns.put("wo_exe_dt", getWoExeDt());
		this.hashColumns.put("trs_sub_sts_cd", getTrsSubStsCd());
		this.hashColumns.put("dor_de_addr", getDorDeAddr());
		this.hashColumns.put("trsp_inv_calc_lgc_tp_cd", getTrspInvCalcLgcTpCd());
		this.hashColumns.put("bl_no", getBlNo());
		this.hashColumns.put("fdr_skd_voy_no", getFdrSkdVoyNo());
		this.hashColumns.put("cntc_pson_fax_no", getCntcPsonFaxNo());
		this.hashColumns.put("pol_cd", getPolCd());
		this.hashColumns.put("n3pty_bil_tp_cd", getN3ptyBilTpCd());
		this.hashColumns.put("trsp_cost_dtl_mod_cd", getTrspCostDtlModCd());
		this.hashColumns.put("mlt_stop_de_flg", getMltStopDeFlg());
		this.hashColumns.put("trsp_agmt_rt_seq", getTrspAgmtRtSeq());
		this.hashColumns.put("wo_rjct_flg", getWoRjctFlg());
		this.hashColumns.put("trsp_so_tp_cd", getTrspSoTpCd());
		this.hashColumns.put("rev_curr_cd", getRevCurrCd());
		this.hashColumns.put("ownr_co_cd", getOwnrCoCd());
		this.hashColumns.put("trsp_dflt_vndr_flg", getTrspDfltVndrFlg());
		this.hashColumns.put("prnt_trsp_so_ofc_cty_cd", getPrntTrspSoOfcCtyCd());
		this.hashColumns.put("del_cd", getDelCd());
		this.hashColumns.put("mty_rde_ord_iss_dt", getMtyRdeOrdIssDt());
		this.hashColumns.put("cntc_pson_phn_no", getCntcPsonPhnNo());
		this.hashColumns.put("cntr_lbs_wgt", getCntrLbsWgt());
		this.hashColumns.put("org_eq_tpsz_cd", getOrgEqTpszCd());
		this.hashColumns.put("eq_atch_dt", getEqAtchDt());
		this.hashColumns.put("vndr_seq", getVndrSeq());
		this.hashColumns.put("curr_cd", getCurrCd());
		this.hashColumns.put("ref_id", getRefId());
		this.hashColumns.put("edi_rcv_rsnd_rqst_dt", getEdiRcvRsndRqstDt());
		this.hashColumns.put("n3pty_curr_cd", getN3ptyCurrCd());
		this.hashColumns.put("trsp_rqst_bkg_flg", getTrspRqstBkgFlg());
		this.hashColumns.put("trsp_so_ofc_cty_cd", getTrspSoOfcCtyCd());
		this.hashColumns.put("mty_rro_iss_dt", getMtyRroIssDt());
		this.hashColumns.put("eq_no", getEqNo());
		this.hashColumns.put("prnt_trsp_so_seq", getPrntTrspSoSeq());
		this.hashColumns.put("cre_ofc_cd", getCreOfcCd());
		this.hashColumns.put("mty_rde_ord_iss_usr_id", getMtyRdeOrdIssUsrId());
		this.hashColumns.put("spcl_instr_rmk", getSpclInstrRmk());
		this.hashColumns.put("edi_rcv_rslt_msg", getEdiRcvRsltMsg());
		this.hashColumns.put("ovr_wgt_scg_amt", getOvrWgtScgAmt());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("finc_skd_voy_no", getFincSkdVoyNo());
		this.hashColumns.put("trsp_purp_rsn", getTrspPurpRsn());
		this.hashColumns.put("mty_rro_iss_flg", getMtyRroIssFlg());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("repo_pln_id", getRepoPlnId());
		this.hashColumns.put("tro_cfm_upd_dt", getTroCfmUpdDt());
		this.hashColumns.put("aval_dt", getAvalDt());
		this.hashColumns.put("dest_gate_in_dt", getDestGateInDt());
		this.hashColumns.put("finc_vvd_cd", getFincVvdCd());
		this.hashColumns.put("cust_nomi_trkr_flg", getCustNomiTrkrFlg());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("ib_vvd_cd", "ibVvdCd");
		this.hashFields.put("dor_pkup_cntr_no", "dorPkupCntrNo");
		this.hashFields.put("finc_vsl_cd", "fincVslCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("trsp_inv_act_sts_cd", "trspInvActStsCd");
		this.hashFields.put("n3pty_ofc_cd", "n3ptyOfcCd");
		this.hashFields.put("fdr_vsl_cd", "fdrVslCd");
		this.hashFields.put("ibd_cstms_clr_loc_cd", "ibdCstmsClrLocCd");
		this.hashFields.put("cntr_tpsz_cd", "cntrTpszCd");
		this.hashFields.put("act_cust_addr_seq", "actCustAddrSeq");
		this.hashFields.put("cntr_wgt", "cntrWgt");
		this.hashFields.put("n3pty_vndr_seq", "n3ptyVndrSeq");
		this.hashFields.put("edi_ctrl_seq", "ediCtrlSeq");
		this.hashFields.put("tro_cfm_usr_id", "troCfmUsrId");
		this.hashFields.put("tro_lod_ref_no", "troLodRefNo");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("eq_tpsz_cd", "eqTpszCd");
		this.hashFields.put("nego_amt", "negoAmt");
		this.hashFields.put("edi_rcv_msg_tp_cd", "ediRcvMsgTpCd");
		this.hashFields.put("fctry_nm", "fctryNm");
		this.hashFields.put("edi_snd_dt", "ediSndDt");
		this.hashFields.put("upln_so_flg", "uplnSoFlg");
		this.hashFields.put("finc_skd_dir_cd", "fincSkdDirCd");
		this.hashFields.put("de_dt", "deDt");
		this.hashFields.put("pln_yrwk", "plnYrwk");
		this.hashFields.put("cntr_slt_no", "cntrSltNo");
		this.hashFields.put("n3pty_bil_bzc_amt", "n3ptyBilBzcAmt");
		this.hashFields.put("inter_rmk", "interRmk");
		this.hashFields.put("acct_cd", "acctCd");
		this.hashFields.put("edi_rcv_purp_cd", "ediRcvPurpCd");
		this.hashFields.put("dor_nod_cd", "dorNodCd");
		this.hashFields.put("act_cust_cnt_cd", "actCustCntCd");
		this.hashFields.put("trsp_rqst_ord_rev_amt", "trspRqstOrdRevAmt");
		this.hashFields.put("lst_free_dt", "lstFreeDt");
		this.hashFields.put("trsp_crr_mod_cd", "trspCrrModCd");
		this.hashFields.put("trsp_otr_cost_mon_dt", "trspOtrCostMonDt");
		this.hashFields.put("trsp_agmt_wy_tp_cd", "trspAgmtWyTpCd");
		this.hashFields.put("dor_loc_cd", "dorLocCd");
		this.hashFields.put("trsp_rjct_rsn_cd", "trspRjctRsnCd");
		this.hashFields.put("locl_cre_dt", "loclCreDt");
		this.hashFields.put("lst_nod_pln_dt", "lstNodPlnDt");
		this.hashFields.put("eq_knd_cd", "eqKndCd");
		this.hashFields.put("ref_inv_no", "refInvNo");
		this.hashFields.put("cntr_aval_ntc_upd_flg", "cntrAvalNtcUpdFlg");
		this.hashFields.put("lse_cntr_flg", "lseCntrFlg");
		this.hashFields.put("fuel_scg_amt", "fuelScgAmt");
		this.hashFields.put("n3pty_bil_flg", "n3ptyBilFlg");
		this.hashFields.put("cost_act_grp_seq", "costActGrpSeq");
		this.hashFields.put("n1st_nod_pln_dt", "n1stNodPlnDt");
		this.hashFields.put("cntr_no", "cntrNo");
		this.hashFields.put("lgs_cost_cd", "lgsCostCd");
		this.hashFields.put("via_nod_cd", "viaNodCd");
		this.hashFields.put("cmb_so_rlt_sts_flg", "cmbSoRltStsFlg");
		this.hashFields.put("rep_cmdt_cd", "repCmdtCd");
		this.hashFields.put("to_nod_cd", "toNodCd");
		this.hashFields.put("cntr_kgs_wgt", "cntrKgsWgt");
		this.hashFields.put("inv_vndr_seq", "invVndrSeq");
		this.hashFields.put("trsp_so_seq", "trspSoSeq");
		this.hashFields.put("cop_no", "copNo");
		this.hashFields.put("trsp_agmt_rt_tp_ser_no", "trspAgmtRtTpSerNo");
		this.hashFields.put("spcl_cgo_cntr_tp_cd", "spclCgoCntrTpCd");
		this.hashFields.put("trsp_agmt_rt_tp_cd", "trspAgmtRtTpCd");
		this.hashFields.put("rpln_umch_flg", "rplnUmchFlg");
		this.hashFields.put("dor_nod_pln_dt", "dorNodPlnDt");
		this.hashFields.put("cstms_clr_no", "cstmsClrNo");
		this.hashFields.put("tri_axl_req_flg", "triAxlReqFlg");
		this.hashFields.put("csr_bzc_corr_amt", "csrBzcCorrAmt");
		this.hashFields.put("wo_bl_no_iss_flg", "woBlNoIssFlg");
		this.hashFields.put("mty_rde_ord_iss_flg", "mtyRdeOrdIssFlg");
		this.hashFields.put("trsp_wo_seq", "trspWoSeq");
		this.hashFields.put("trsp_mty_rqst_dt", "trspMtyRqstDt");
		this.hashFields.put("mty_rro_iss_usr_id", "mtyRroIssUsrId");
		this.hashFields.put("cost_act_grp_cd", "costActGrpCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("trsp_agmt_seq", "trspAgmtSeq");
		this.hashFields.put("wgt_meas_ut_cd", "wgtMeasUtCd");
		this.hashFields.put("inv_bzc_amt", "invBzcAmt");
		this.hashFields.put("tro_cfm_ofc_cd", "troCfmOfcCd");
		this.hashFields.put("por_cd", "porCd");
		this.hashFields.put("conti_cd", "contiCd");
		this.hashFields.put("spl_iss_rsn", "splIssRsn");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("trsp_agmt_ofc_cty_cd", "trspAgmtOfcCtyCd");
		this.hashFields.put("edw_upd_dt", "edwUpdDt");
		this.hashFields.put("fdr_skd_dir_cd", "fdrSkdDirCd");
		this.hashFields.put("locl_delt_dt", "loclDeltDt");
		this.hashFields.put("trsp_mty_cost_mod_cd", "trspMtyCostModCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cgo_clz_dt", "cgoClzDt");
		this.hashFields.put("apnt_dt", "apntDt");
		this.hashFields.put("cntc_pson_nm", "cntcPsonNm");
		this.hashFields.put("csr_scg_corr_amt", "csrScgCorrAmt");
		this.hashFields.put("trsp_so_cmb_srt_no", "trspSoCmbSrtNo");
		this.hashFields.put("n3pty_cust_cnt_cd", "n3ptyCustCntCd");
		this.hashFields.put("etc_add_amt", "etcAddAmt");
		this.hashFields.put("trsp_bnd_cd", "trspBndCd");
		this.hashFields.put("tro_seq", "troSeq");
		this.hashFields.put("pln_seq", "plnSeq");
		this.hashFields.put("cust_seq", "custSeq");
		this.hashFields.put("inv_curr_cd", "invCurrCd");
		this.hashFields.put("trsp_nxt_port_cd", "trspNxtPortCd");
		this.hashFields.put("trsp_spl_so_tp_cd", "trspSplSoTpCd");
		this.hashFields.put("ref_seq", "refSeq");
		this.hashFields.put("org_cost_act_grp_seq", "orgCostActGrpSeq");
		this.hashFields.put("ob_vvd_cd", "obVvdCd");
		this.hashFields.put("scg_ind_cd", "scgIndCd");
		this.hashFields.put("chss_mgst_trsp_tp_cd", "chssMgstTrspTpCd");
		this.hashFields.put("trsp_so_cmb_seq", "trspSoCmbSeq");
		this.hashFields.put("edi_rcv_rslt_dt", "ediRcvRsltDt");
		this.hashFields.put("cgo_tp_cd", "cgoTpCd");
		this.hashFields.put("n3pty_desc", "n3ptyDesc");
		this.hashFields.put("dor_pst_cd", "dorPstCd");
		this.hashFields.put("trsp_frst_flg", "trspFrstFlg");
		this.hashFields.put("sub_eq_tpsz_cd", "subEqTpszCd");
		this.hashFields.put("bkg_rcvde_term_cd", "bkgRcvdeTermCd");
		this.hashFields.put("edi_snd_msg_tp_cd", "ediSndMsgTpCd");
		this.hashFields.put("ref_bl_no", "refBlNo");
		this.hashFields.put("inv_xch_rt", "invXchRt");
		this.hashFields.put("cust_cnt_cd", "custCntCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("tro_sub_seq", "troSubSeq");
		this.hashFields.put("trsp_so_cmb_tp_cd", "trspSoCmbTpCd");
		this.hashFields.put("edi_rjct_rsn_cd", "ediRjctRsnCd");
		this.hashFields.put("org_cop_no", "orgCopNo");
		this.hashFields.put("ref_bkg_no", "refBkgNo");
		this.hashFields.put("inv_adj_bzc_amt", "invAdjBzcAmt");
		this.hashFields.put("cntr_pkup_no", "cntrPkupNo");
		this.hashFields.put("pod_cd", "podCd");
		this.hashFields.put("edi_rcv_rslt_cd", "ediRcvRsltCd");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("org_gate_out_dt", "orgGateOutDt");
		this.hashFields.put("locl_upd_dt", "loclUpdDt");
		this.hashFields.put("rgst_no", "rgstNo");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("dor_arr_dt", "dorArrDt");
		this.hashFields.put("org_bkg_no", "orgBkgNo");
		this.hashFields.put("n3pty_cust_seq", "n3ptyCustSeq");
		this.hashFields.put("cmdt_cd", "cmdtCd");
		this.hashFields.put("dor_svc_tp_cd", "dorSvcTpCd");
		this.hashFields.put("trsp_so_sts_cd", "trspSoStsCd");
		this.hashFields.put("cntr_sub_flg", "cntrSubFlg");
		this.hashFields.put("tro_cfm_rev_amt", "troCfmRevAmt");
		this.hashFields.put("cost_ofc_cd", "costOfcCd");
		this.hashFields.put("act_cust_seq", "actCustSeq");
		this.hashFields.put("bzc_amt", "bzcAmt");
		this.hashFields.put("trsp_wo_ofc_cty_cd", "trspWoOfcCtyCd");
		this.hashFields.put("inv_etc_add_amt", "invEtcAddAmt");
		this.hashFields.put("inv_no", "invNo");
		this.hashFields.put("fm_nod_cd", "fmNodCd");
		this.hashFields.put("slan_cd", "slanCd");
		this.hashFields.put("inv_rmk", "invRmk");
		this.hashFields.put("tro_rep_cmdt_cd", "troRepCmdtCd");
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("trsp_agmt_nod_seq", "trspAgmtNodSeq");
		this.hashFields.put("dtn_use_flg", "dtnUseFlg");
		this.hashFields.put("lst_loc_cd", "lstLocCd");
		this.hashFields.put("cntr_pkup_yd_cd", "cntrPkupYdCd");
		this.hashFields.put("wo_exe_dt", "woExeDt");
		this.hashFields.put("trs_sub_sts_cd", "trsSubStsCd");
		this.hashFields.put("dor_de_addr", "dorDeAddr");
		this.hashFields.put("trsp_inv_calc_lgc_tp_cd", "trspInvCalcLgcTpCd");
		this.hashFields.put("bl_no", "blNo");
		this.hashFields.put("fdr_skd_voy_no", "fdrSkdVoyNo");
		this.hashFields.put("cntc_pson_fax_no", "cntcPsonFaxNo");
		this.hashFields.put("pol_cd", "polCd");
		this.hashFields.put("n3pty_bil_tp_cd", "n3ptyBilTpCd");
		this.hashFields.put("trsp_cost_dtl_mod_cd", "trspCostDtlModCd");
		this.hashFields.put("mlt_stop_de_flg", "mltStopDeFlg");
		this.hashFields.put("trsp_agmt_rt_seq", "trspAgmtRtSeq");
		this.hashFields.put("wo_rjct_flg", "woRjctFlg");
		this.hashFields.put("trsp_so_tp_cd", "trspSoTpCd");
		this.hashFields.put("rev_curr_cd", "revCurrCd");
		this.hashFields.put("ownr_co_cd", "ownrCoCd");
		this.hashFields.put("trsp_dflt_vndr_flg", "trspDfltVndrFlg");
		this.hashFields.put("prnt_trsp_so_ofc_cty_cd", "prntTrspSoOfcCtyCd");
		this.hashFields.put("del_cd", "delCd");
		this.hashFields.put("mty_rde_ord_iss_dt", "mtyRdeOrdIssDt");
		this.hashFields.put("cntc_pson_phn_no", "cntcPsonPhnNo");
		this.hashFields.put("cntr_lbs_wgt", "cntrLbsWgt");
		this.hashFields.put("org_eq_tpsz_cd", "orgEqTpszCd");
		this.hashFields.put("eq_atch_dt", "eqAtchDt");
		this.hashFields.put("vndr_seq", "vndrSeq");
		this.hashFields.put("curr_cd", "currCd");
		this.hashFields.put("ref_id", "refId");
		this.hashFields.put("edi_rcv_rsnd_rqst_dt", "ediRcvRsndRqstDt");
		this.hashFields.put("n3pty_curr_cd", "n3ptyCurrCd");
		this.hashFields.put("trsp_rqst_bkg_flg", "trspRqstBkgFlg");
		this.hashFields.put("trsp_so_ofc_cty_cd", "trspSoOfcCtyCd");
		this.hashFields.put("mty_rro_iss_dt", "mtyRroIssDt");
		this.hashFields.put("eq_no", "eqNo");
		this.hashFields.put("prnt_trsp_so_seq", "prntTrspSoSeq");
		this.hashFields.put("cre_ofc_cd", "creOfcCd");
		this.hashFields.put("mty_rde_ord_iss_usr_id", "mtyRdeOrdIssUsrId");
		this.hashFields.put("spcl_instr_rmk", "spclInstrRmk");
		this.hashFields.put("edi_rcv_rslt_msg", "ediRcvRsltMsg");
		this.hashFields.put("ovr_wgt_scg_amt", "ovrWgtScgAmt");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("finc_skd_voy_no", "fincSkdVoyNo");
		this.hashFields.put("trsp_purp_rsn", "trspPurpRsn");
		this.hashFields.put("mty_rro_iss_flg", "mtyRroIssFlg");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("repo_pln_id", "repoPlnId");
		this.hashFields.put("tro_cfm_upd_dt", "troCfmUpdDt");
		this.hashFields.put("aval_dt", "avalDt");
		this.hashFields.put("dest_gate_in_dt", "destGateInDt");
		this.hashFields.put("finc_vvd_cd", "fincVvdCd");
		this.hashFields.put("cust_nomi_trkr_flg", "custNomiTrkrFlg");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return ibVvdCd
	 */
	public String getIbVvdCd() {
		return this.ibVvdCd;
	}
	
	/**
	 * Column Info
	 * @return dorPkupCntrNo
	 */
	public String getDorPkupCntrNo() {
		return this.dorPkupCntrNo;
	}
	
	/**
	 * Column Info
	 * @return fincVslCd
	 */
	public String getFincVslCd() {
		return this.fincVslCd;
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
	 * @return trspInvActStsCd
	 */
	public String getTrspInvActStsCd() {
		return this.trspInvActStsCd;
	}
	
	/**
	 * Column Info
	 * @return n3ptyOfcCd
	 */
	public String getN3ptyOfcCd() {
		return this.n3ptyOfcCd;
	}
	
	/**
	 * Column Info
	 * @return fdrVslCd
	 */
	public String getFdrVslCd() {
		return this.fdrVslCd;
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
	 * @return cntrTpszCd
	 */
	public String getCntrTpszCd() {
		return this.cntrTpszCd;
	}
	
	/**
	 * Column Info
	 * @return actCustAddrSeq
	 */
	public String getActCustAddrSeq() {
		return this.actCustAddrSeq;
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
	 * @return n3ptyVndrSeq
	 */
	public String getN3ptyVndrSeq() {
		return this.n3ptyVndrSeq;
	}
	
	/**
	 * Column Info
	 * @return ediCtrlSeq
	 */
	public String getEdiCtrlSeq() {
		return this.ediCtrlSeq;
	}
	
	/**
	 * Column Info
	 * @return troCfmUsrId
	 */
	public String getTroCfmUsrId() {
		return this.troCfmUsrId;
	}
	
	/**
	 * Column Info
	 * @return troLodRefNo
	 */
	public String getTroLodRefNo() {
		return this.troLodRefNo;
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
	 * @return eqTpszCd
	 */
	public String getEqTpszCd() {
		return this.eqTpszCd;
	}
	
	/**
	 * Column Info
	 * @return negoAmt
	 */
	public String getNegoAmt() {
		return this.negoAmt;
	}
	
	/**
	 * Column Info
	 * @return ediRcvMsgTpCd
	 */
	public String getEdiRcvMsgTpCd() {
		return this.ediRcvMsgTpCd;
	}
	
	/**
	 * Column Info
	 * @return fctryNm
	 */
	public String getFctryNm() {
		return this.fctryNm;
	}
	
	/**
	 * Column Info
	 * @return ediSndDt
	 */
	public String getEdiSndDt() {
		return this.ediSndDt;
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
	 * @return fincSkdDirCd
	 */
	public String getFincSkdDirCd() {
		return this.fincSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @return deDt
	 */
	public String getDeDt() {
		return this.deDt;
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
	 * @return cntrSltNo
	 */
	public String getCntrSltNo() {
		return this.cntrSltNo;
	}
	
	/**
	 * Column Info
	 * @return n3ptyBilBzcAmt
	 */
	public String getN3ptyBilBzcAmt() {
		return this.n3ptyBilBzcAmt;
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
	 * @return acctCd
	 */
	public String getAcctCd() {
		return this.acctCd;
	}
	
	/**
	 * Column Info
	 * @return ediRcvPurpCd
	 */
	public String getEdiRcvPurpCd() {
		return this.ediRcvPurpCd;
	}
	
	/**
	 * Column Info
	 * @return dorNodCd
	 */
	public String getDorNodCd() {
		return this.dorNodCd;
	}
	
	/**
	 * Column Info
	 * @return actCustCntCd
	 */
	public String getActCustCntCd() {
		return this.actCustCntCd;
	}
	
	/**
	 * Column Info
	 * @return trspRqstOrdRevAmt
	 */
	public String getTrspRqstOrdRevAmt() {
		return this.trspRqstOrdRevAmt;
	}
	
	/**
	 * Column Info
	 * @return lstFreeDt
	 */
	public String getLstFreeDt() {
		return this.lstFreeDt;
	}
	
	/**
	 * Column Info
	 * @return trspCrrModCd
	 */
	public String getTrspCrrModCd() {
		return this.trspCrrModCd;
	}
	
	/**
	 * Column Info
	 * @return trspOtrCostMonDt
	 */
	public String getTrspOtrCostMonDt() {
		return this.trspOtrCostMonDt;
	}
	
	/**
	 * Column Info
	 * @return trspAgmtWyTpCd
	 */
	public String getTrspAgmtWyTpCd() {
		return this.trspAgmtWyTpCd;
	}
	
	/**
	 * Column Info
	 * @return dorLocCd
	 */
	public String getDorLocCd() {
		return this.dorLocCd;
	}
	
	/**
	 * Column Info
	 * @return trspRjctRsnCd
	 */
	public String getTrspRjctRsnCd() {
		return this.trspRjctRsnCd;
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
	 * @return lstNodPlnDt
	 */
	public String getLstNodPlnDt() {
		return this.lstNodPlnDt;
	}
	
	/**
	 * Column Info
	 * @return eqKndCd
	 */
	public String getEqKndCd() {
		return this.eqKndCd;
	}
	
	/**
	 * Column Info
	 * @return refInvNo
	 */
	public String getRefInvNo() {
		return this.refInvNo;
	}
	
	/**
	 * Column Info
	 * @return cntrAvalNtcUpdFlg
	 */
	public String getCntrAvalNtcUpdFlg() {
		return this.cntrAvalNtcUpdFlg;
	}
	
	/**
	 * Column Info
	 * @return lseCntrFlg
	 */
	public String getLseCntrFlg() {
		return this.lseCntrFlg;
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
	 * @return n3ptyBilFlg
	 */
	public String getN3ptyBilFlg() {
		return this.n3ptyBilFlg;
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
	 * @return n1stNodPlnDt
	 */
	public String getN1stNodPlnDt() {
		return this.n1stNodPlnDt;
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
	 * @return lgsCostCd
	 */
	public String getLgsCostCd() {
		return this.lgsCostCd;
	}
	
	/**
	 * Column Info
	 * @return viaNodCd
	 */
	public String getViaNodCd() {
		return this.viaNodCd;
	}
	
	/**
	 * Column Info
	 * @return cmbSoRltStsFlg
	 */
	public String getCmbSoRltStsFlg() {
		return this.cmbSoRltStsFlg;
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
	 * @return toNodCd
	 */
	public String getToNodCd() {
		return this.toNodCd;
	}
	
	/**
	 * Column Info
	 * @return cntrKgsWgt
	 */
	public String getCntrKgsWgt() {
		return this.cntrKgsWgt;
	}
	
	/**
	 * Column Info
	 * @return invVndrSeq
	 */
	public String getInvVndrSeq() {
		return this.invVndrSeq;
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
	 * @return trspAgmtRtTpSerNo
	 */
	public String getTrspAgmtRtTpSerNo() {
		return this.trspAgmtRtTpSerNo;
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
	 * @return trspAgmtRtTpCd
	 */
	public String getTrspAgmtRtTpCd() {
		return this.trspAgmtRtTpCd;
	}
	
	/**
	 * Column Info
	 * @return rplnUmchFlg
	 */
	public String getRplnUmchFlg() {
		return this.rplnUmchFlg;
	}
	
	/**
	 * Column Info
	 * @return dorNodPlnDt
	 */
	public String getDorNodPlnDt() {
		return this.dorNodPlnDt;
	}
	
	/**
	 * Column Info
	 * @return cstmsClrNo
	 */
	public String getCstmsClrNo() {
		return this.cstmsClrNo;
	}
	
	/**
	 * Column Info
	 * @return triAxlReqFlg
	 */
	public String getTriAxlReqFlg() {
		return this.triAxlReqFlg;
	}
	
	/**
	 * Column Info
	 * @return csrBzcCorrAmt
	 */
	public String getCsrBzcCorrAmt() {
		return this.csrBzcCorrAmt;
	}
	
	/**
	 * Column Info
	 * @return woBlNoIssFlg
	 */
	public String getWoBlNoIssFlg() {
		return this.woBlNoIssFlg;
	}
	
	/**
	 * Column Info
	 * @return mtyRdeOrdIssFlg
	 */
	public String getMtyRdeOrdIssFlg() {
		return this.mtyRdeOrdIssFlg;
	}
	
	/**
	 * Column Info
	 * @return trspWoSeq
	 */
	public String getTrspWoSeq() {
		return this.trspWoSeq;
	}
	
	/**
	 * Column Info
	 * @return trspMtyRqstDt
	 */
	public String getTrspMtyRqstDt() {
		return this.trspMtyRqstDt;
	}
	
	/**
	 * Column Info
	 * @return mtyRroIssUsrId
	 */
	public String getMtyRroIssUsrId() {
		return this.mtyRroIssUsrId;
	}
	
	/**
	 * Column Info
	 * @return costActGrpCd
	 */
	public String getCostActGrpCd() {
		return this.costActGrpCd;
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
	 * @return trspAgmtSeq
	 */
	public String getTrspAgmtSeq() {
		return this.trspAgmtSeq;
	}
	
	/**
	 * Column Info
	 * @return wgtMeasUtCd
	 */
	public String getWgtMeasUtCd() {
		return this.wgtMeasUtCd;
	}
	
	/**
	 * Column Info
	 * @return invBzcAmt
	 */
	public String getInvBzcAmt() {
		return this.invBzcAmt;
	}
	
	/**
	 * Column Info
	 * @return troCfmOfcCd
	 */
	public String getTroCfmOfcCd() {
		return this.troCfmOfcCd;
	}
	
	/**
	 * Column Info
	 * @return porCd
	 */
	public String getPorCd() {
		return this.porCd;
	}
	
	/**
	 * Column Info
	 * @return contiCd
	 */
	public String getContiCd() {
		return this.contiCd;
	}
	
	/**
	 * Column Info
	 * @return splIssRsn
	 */
	public String getSplIssRsn() {
		return this.splIssRsn;
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
	 * @return edwUpdDt
	 */
	public String getEdwUpdDt() {
		return this.edwUpdDt;
	}
	
	/**
	 * Column Info
	 * @return fdrSkdDirCd
	 */
	public String getFdrSkdDirCd() {
		return this.fdrSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @return loclDeltDt
	 */
	public String getLoclDeltDt() {
		return this.loclDeltDt;
	}
	
	/**
	 * Column Info
	 * @return trspMtyCostModCd
	 */
	public String getTrspMtyCostModCd() {
		return this.trspMtyCostModCd;
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
	 * @return cgoClzDt
	 */
	public String getCgoClzDt() {
		return this.cgoClzDt;
	}
	
	/**
	 * Column Info
	 * @return apntDt
	 */
	public String getApntDt() {
		return this.apntDt;
	}
	
	/**
	 * Column Info
	 * @return cntcPsonNm
	 */
	public String getCntcPsonNm() {
		return this.cntcPsonNm;
	}
	
	/**
	 * Column Info
	 * @return csrScgCorrAmt
	 */
	public String getCsrScgCorrAmt() {
		return this.csrScgCorrAmt;
	}
	
	/**
	 * Column Info
	 * @return trspSoCmbSrtNo
	 */
	public String getTrspSoCmbSrtNo() {
		return this.trspSoCmbSrtNo;
	}
	
	/**
	 * Column Info
	 * @return n3ptyCustCntCd
	 */
	public String getN3ptyCustCntCd() {
		return this.n3ptyCustCntCd;
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
	 * @return trspBndCd
	 */
	public String getTrspBndCd() {
		return this.trspBndCd;
	}
	
	/**
	 * Column Info
	 * @return troSeq
	 */
	public String getTroSeq() {
		return this.troSeq;
	}
	
	/**
	 * Column Info
	 * @return plnSeq
	 */
	public String getPlnSeq() {
		return this.plnSeq;
	}
	
	/**
	 * Column Info
	 * @return custSeq
	 */
	public String getCustSeq() {
		return this.custSeq;
	}
	
	/**
	 * Column Info
	 * @return invCurrCd
	 */
	public String getInvCurrCd() {
		return this.invCurrCd;
	}
	
	/**
	 * Column Info
	 * @return trspNxtPortCd
	 */
	public String getTrspNxtPortCd() {
		return this.trspNxtPortCd;
	}
	
	/**
	 * Column Info
	 * @return trspSplSoTpCd
	 */
	public String getTrspSplSoTpCd() {
		return this.trspSplSoTpCd;
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
	 * @return orgCostActGrpSeq
	 */
	public String getOrgCostActGrpSeq() {
		return this.orgCostActGrpSeq;
	}
	
	/**
	 * Column Info
	 * @return obVvdCd
	 */
	public String getObVvdCd() {
		return this.obVvdCd;
	}
	
	/**
	 * Column Info
	 * @return scgIndCd
	 */
	public String getScgIndCd() {
		return this.scgIndCd;
	}
	
	/**
	 * Column Info
	 * @return chssMgstTrspTpCd
	 */
	public String getChssMgstTrspTpCd() {
		return this.chssMgstTrspTpCd;
	}
	
	/**
	 * Column Info
	 * @return trspSoCmbSeq
	 */
	public String getTrspSoCmbSeq() {
		return this.trspSoCmbSeq;
	}
	
	/**
	 * Column Info
	 * @return ediRcvRsltDt
	 */
	public String getEdiRcvRsltDt() {
		return this.ediRcvRsltDt;
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
	 * @return n3ptyDesc
	 */
	public String getN3ptyDesc() {
		return this.n3ptyDesc;
	}
	
	/**
	 * Column Info
	 * @return dorPstCd
	 */
	public String getDorPstCd() {
		return this.dorPstCd;
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
	 * @return subEqTpszCd
	 */
	public String getSubEqTpszCd() {
		return this.subEqTpszCd;
	}
	
	/**
	 * Column Info
	 * @return bkgRcvdeTermCd
	 */
	public String getBkgRcvdeTermCd() {
		return this.bkgRcvdeTermCd;
	}
	
	/**
	 * Column Info
	 * @return ediSndMsgTpCd
	 */
	public String getEdiSndMsgTpCd() {
		return this.ediSndMsgTpCd;
	}
	
	/**
	 * Column Info
	 * @return refBlNo
	 */
	public String getRefBlNo() {
		return this.refBlNo;
	}
	
	/**
	 * Column Info
	 * @return invXchRt
	 */
	public String getInvXchRt() {
		return this.invXchRt;
	}
	
	/**
	 * Column Info
	 * @return custCntCd
	 */
	public String getCustCntCd() {
		return this.custCntCd;
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
	 * @return troSubSeq
	 */
	public String getTroSubSeq() {
		return this.troSubSeq;
	}
	
	/**
	 * Column Info
	 * @return trspSoCmbTpCd
	 */
	public String getTrspSoCmbTpCd() {
		return this.trspSoCmbTpCd;
	}
	
	/**
	 * Column Info
	 * @return ediRjctRsnCd
	 */
	public String getEdiRjctRsnCd() {
		return this.ediRjctRsnCd;
	}
	
	/**
	 * Column Info
	 * @return orgCopNo
	 */
	public String getOrgCopNo() {
		return this.orgCopNo;
	}
	
	/**
	 * Column Info
	 * @return refBkgNo
	 */
	public String getRefBkgNo() {
		return this.refBkgNo;
	}
	
	/**
	 * Column Info
	 * @return invAdjBzcAmt
	 */
	public String getInvAdjBzcAmt() {
		return this.invAdjBzcAmt;
	}
	
	/**
	 * Column Info
	 * @return cntrPkupNo
	 */
	public String getCntrPkupNo() {
		return this.cntrPkupNo;
	}
	
	/**
	 * Column Info
	 * @return podCd
	 */
	public String getPodCd() {
		return this.podCd;
	}
	
	/**
	 * Column Info
	 * @return ediRcvRsltCd
	 */
	public String getEdiRcvRsltCd() {
		return this.ediRcvRsltCd;
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
	 * @return orgGateOutDt
	 */
	public String getOrgGateOutDt() {
		return this.orgGateOutDt;
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
	 * @return rgstNo
	 */
	public String getRgstNo() {
		return this.rgstNo;
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
	 * @return dorArrDt
	 */
	public String getDorArrDt() {
		return this.dorArrDt;
	}
	
	/**
	 * Column Info
	 * @return orgBkgNo
	 */
	public String getOrgBkgNo() {
		return this.orgBkgNo;
	}
	
	/**
	 * Column Info
	 * @return n3ptyCustSeq
	 */
	public String getN3ptyCustSeq() {
		return this.n3ptyCustSeq;
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
	 * @return dorSvcTpCd
	 */
	public String getDorSvcTpCd() {
		return this.dorSvcTpCd;
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
	 * @return cntrSubFlg
	 */
	public String getCntrSubFlg() {
		return this.cntrSubFlg;
	}
	
	/**
	 * Column Info
	 * @return troCfmRevAmt
	 */
	public String getTroCfmRevAmt() {
		return this.troCfmRevAmt;
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
	 * @return actCustSeq
	 */
	public String getActCustSeq() {
		return this.actCustSeq;
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
	 * @return trspWoOfcCtyCd
	 */
	public String getTrspWoOfcCtyCd() {
		return this.trspWoOfcCtyCd;
	}
	
	/**
	 * Column Info
	 * @return invEtcAddAmt
	 */
	public String getInvEtcAddAmt() {
		return this.invEtcAddAmt;
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
	 * @return fmNodCd
	 */
	public String getFmNodCd() {
		return this.fmNodCd;
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
	 * @return invRmk
	 */
	public String getInvRmk() {
		return this.invRmk;
	}
	
	/**
	 * Column Info
	 * @return troRepCmdtCd
	 */
	public String getTroRepCmdtCd() {
		return this.troRepCmdtCd;
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
	 * @return trspAgmtNodSeq
	 */
	public String getTrspAgmtNodSeq() {
		return this.trspAgmtNodSeq;
	}
	
	/**
	 * Column Info
	 * @return dtnUseFlg
	 */
	public String getDtnUseFlg() {
		return this.dtnUseFlg;
	}
	
	/**
	 * Column Info
	 * @return lstLocCd
	 */
	public String getLstLocCd() {
		return this.lstLocCd;
	}
	
	/**
	 * Column Info
	 * @return cntrPkupYdCd
	 */
	public String getCntrPkupYdCd() {
		return this.cntrPkupYdCd;
	}
	
	/**
	 * Column Info
	 * @return woExeDt
	 */
	public String getWoExeDt() {
		return this.woExeDt;
	}
	
	/**
	 * Column Info
	 * @return trsSubStsCd
	 */
	public String getTrsSubStsCd() {
		return this.trsSubStsCd;
	}
	
	/**
	 * Column Info
	 * @return dorDeAddr
	 */
	public String getDorDeAddr() {
		return this.dorDeAddr;
	}
	
	/**
	 * Column Info
	 * @return trspInvCalcLgcTpCd
	 */
	public String getTrspInvCalcLgcTpCd() {
		return this.trspInvCalcLgcTpCd;
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
	 * @return fdrSkdVoyNo
	 */
	public String getFdrSkdVoyNo() {
		return this.fdrSkdVoyNo;
	}
	
	/**
	 * Column Info
	 * @return cntcPsonFaxNo
	 */
	public String getCntcPsonFaxNo() {
		return this.cntcPsonFaxNo;
	}
	
	/**
	 * Column Info
	 * @return polCd
	 */
	public String getPolCd() {
		return this.polCd;
	}
	
	/**
	 * Column Info
	 * @return n3ptyBilTpCd
	 */
	public String getN3ptyBilTpCd() {
		return this.n3ptyBilTpCd;
	}
	
	/**
	 * Column Info
	 * @return trspCostDtlModCd
	 */
	public String getTrspCostDtlModCd() {
		return this.trspCostDtlModCd;
	}
	
	/**
	 * Column Info
	 * @return mltStopDeFlg
	 */
	public String getMltStopDeFlg() {
		return this.mltStopDeFlg;
	}
	
	/**
	 * Column Info
	 * @return trspAgmtRtSeq
	 */
	public String getTrspAgmtRtSeq() {
		return this.trspAgmtRtSeq;
	}
	
	/**
	 * Column Info
	 * @return woRjctFlg
	 */
	public String getWoRjctFlg() {
		return this.woRjctFlg;
	}
	
	/**
	 * Column Info
	 * @return trspSoTpCd
	 */
	public String getTrspSoTpCd() {
		return this.trspSoTpCd;
	}
	
	/**
	 * Column Info
	 * @return revCurrCd
	 */
	public String getRevCurrCd() {
		return this.revCurrCd;
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
	 * @return trspDfltVndrFlg
	 */
	public String getTrspDfltVndrFlg() {
		return this.trspDfltVndrFlg;
	}
	
	/**
	 * Column Info
	 * @return prntTrspSoOfcCtyCd
	 */
	public String getPrntTrspSoOfcCtyCd() {
		return this.prntTrspSoOfcCtyCd;
	}
	
	/**
	 * Column Info
	 * @return delCd
	 */
	public String getDelCd() {
		return this.delCd;
	}
	
	/**
	 * Column Info
	 * @return mtyRdeOrdIssDt
	 */
	public String getMtyRdeOrdIssDt() {
		return this.mtyRdeOrdIssDt;
	}
	
	/**
	 * Column Info
	 * @return cntcPsonPhnNo
	 */
	public String getCntcPsonPhnNo() {
		return this.cntcPsonPhnNo;
	}
	
	/**
	 * Column Info
	 * @return cntrLbsWgt
	 */
	public String getCntrLbsWgt() {
		return this.cntrLbsWgt;
	}
	
	/**
	 * Column Info
	 * @return orgEqTpszCd
	 */
	public String getOrgEqTpszCd() {
		return this.orgEqTpszCd;
	}
	
	/**
	 * Column Info
	 * @return eqAtchDt
	 */
	public String getEqAtchDt() {
		return this.eqAtchDt;
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
	 * @return currCd
	 */
	public String getCurrCd() {
		return this.currCd;
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
	 * @return ediRcvRsndRqstDt
	 */
	public String getEdiRcvRsndRqstDt() {
		return this.ediRcvRsndRqstDt;
	}
	
	/**
	 * Column Info
	 * @return n3ptyCurrCd
	 */
	public String getN3ptyCurrCd() {
		return this.n3ptyCurrCd;
	}
	
	/**
	 * Column Info
	 * @return trspRqstBkgFlg
	 */
	public String getTrspRqstBkgFlg() {
		return this.trspRqstBkgFlg;
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
	 * @return mtyRroIssDt
	 */
	public String getMtyRroIssDt() {
		return this.mtyRroIssDt;
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
	 * @return prntTrspSoSeq
	 */
	public String getPrntTrspSoSeq() {
		return this.prntTrspSoSeq;
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
	 * @return mtyRdeOrdIssUsrId
	 */
	public String getMtyRdeOrdIssUsrId() {
		return this.mtyRdeOrdIssUsrId;
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
	 * @return ediRcvRsltMsg
	 */
	public String getEdiRcvRsltMsg() {
		return this.ediRcvRsltMsg;
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
	 * @return updDt
	 */
	public String getUpdDt() {
		return this.updDt;
	}
	
	/**
	 * Column Info
	 * @return fincSkdVoyNo
	 */
	public String getFincSkdVoyNo() {
		return this.fincSkdVoyNo;
	}
	
	/**
	 * Column Info
	 * @return trspPurpRsn
	 */
	public String getTrspPurpRsn() {
		return this.trspPurpRsn;
	}
	
	/**
	 * Column Info
	 * @return mtyRroIssFlg
	 */
	public String getMtyRroIssFlg() {
		return this.mtyRroIssFlg;
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
	 * @return repoPlnId
	 */
	public String getRepoPlnId() {
		return this.repoPlnId;
	}
	
	/**
	 * Column Info
	 * @return troCfmUpdDt
	 */
	public String getTroCfmUpdDt() {
		return this.troCfmUpdDt;
	}
	
	/**
	 * Column Info
	 * @return avalDt
	 */
	public String getAvalDt() {
		return this.avalDt;
	}
	
	/**
	 * Column Info
	 * @return destGateInDt
	 */
	public String getDestGateInDt() {
		return this.destGateInDt;
	}
	
	/**
	 * Column Info
	 * @return fincVvdCd
	 */
	public String getFincVvdCd() {
		return this.fincVvdCd;
	}
	
	/**
	 * Column Info
	 * @return custNomiTrkrFlg
	 */
	public String getCustNomiTrkrFlg() {
		return this.custNomiTrkrFlg;
	}
	

	/**
	 * Column Info
	 * @param ibVvdCd
	 */
	public void setIbVvdCd(String ibVvdCd) {
		this.ibVvdCd = ibVvdCd;
	}
	
	/**
	 * Column Info
	 * @param dorPkupCntrNo
	 */
	public void setDorPkupCntrNo(String dorPkupCntrNo) {
		this.dorPkupCntrNo = dorPkupCntrNo;
	}
	
	/**
	 * Column Info
	 * @param fincVslCd
	 */
	public void setFincVslCd(String fincVslCd) {
		this.fincVslCd = fincVslCd;
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
	 * @param trspInvActStsCd
	 */
	public void setTrspInvActStsCd(String trspInvActStsCd) {
		this.trspInvActStsCd = trspInvActStsCd;
	}
	
	/**
	 * Column Info
	 * @param n3ptyOfcCd
	 */
	public void setN3ptyOfcCd(String n3ptyOfcCd) {
		this.n3ptyOfcCd = n3ptyOfcCd;
	}
	
	/**
	 * Column Info
	 * @param fdrVslCd
	 */
	public void setFdrVslCd(String fdrVslCd) {
		this.fdrVslCd = fdrVslCd;
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
	 * @param cntrTpszCd
	 */
	public void setCntrTpszCd(String cntrTpszCd) {
		this.cntrTpszCd = cntrTpszCd;
	}
	
	/**
	 * Column Info
	 * @param actCustAddrSeq
	 */
	public void setActCustAddrSeq(String actCustAddrSeq) {
		this.actCustAddrSeq = actCustAddrSeq;
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
	 * @param n3ptyVndrSeq
	 */
	public void setN3ptyVndrSeq(String n3ptyVndrSeq) {
		this.n3ptyVndrSeq = n3ptyVndrSeq;
	}
	
	/**
	 * Column Info
	 * @param ediCtrlSeq
	 */
	public void setEdiCtrlSeq(String ediCtrlSeq) {
		this.ediCtrlSeq = ediCtrlSeq;
	}
	
	/**
	 * Column Info
	 * @param troCfmUsrId
	 */
	public void setTroCfmUsrId(String troCfmUsrId) {
		this.troCfmUsrId = troCfmUsrId;
	}
	
	/**
	 * Column Info
	 * @param troLodRefNo
	 */
	public void setTroLodRefNo(String troLodRefNo) {
		this.troLodRefNo = troLodRefNo;
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
	 * @param eqTpszCd
	 */
	public void setEqTpszCd(String eqTpszCd) {
		this.eqTpszCd = eqTpszCd;
	}
	
	/**
	 * Column Info
	 * @param negoAmt
	 */
	public void setNegoAmt(String negoAmt) {
		this.negoAmt = negoAmt;
	}
	
	/**
	 * Column Info
	 * @param ediRcvMsgTpCd
	 */
	public void setEdiRcvMsgTpCd(String ediRcvMsgTpCd) {
		this.ediRcvMsgTpCd = ediRcvMsgTpCd;
	}
	
	/**
	 * Column Info
	 * @param fctryNm
	 */
	public void setFctryNm(String fctryNm) {
		this.fctryNm = fctryNm;
	}
	
	/**
	 * Column Info
	 * @param ediSndDt
	 */
	public void setEdiSndDt(String ediSndDt) {
		this.ediSndDt = ediSndDt;
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
	 * @param fincSkdDirCd
	 */
	public void setFincSkdDirCd(String fincSkdDirCd) {
		this.fincSkdDirCd = fincSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @param deDt
	 */
	public void setDeDt(String deDt) {
		this.deDt = deDt;
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
	 * @param cntrSltNo
	 */
	public void setCntrSltNo(String cntrSltNo) {
		this.cntrSltNo = cntrSltNo;
	}
	
	/**
	 * Column Info
	 * @param n3ptyBilBzcAmt
	 */
	public void setN3ptyBilBzcAmt(String n3ptyBilBzcAmt) {
		this.n3ptyBilBzcAmt = n3ptyBilBzcAmt;
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
	 * @param acctCd
	 */
	public void setAcctCd(String acctCd) {
		this.acctCd = acctCd;
	}
	
	/**
	 * Column Info
	 * @param ediRcvPurpCd
	 */
	public void setEdiRcvPurpCd(String ediRcvPurpCd) {
		this.ediRcvPurpCd = ediRcvPurpCd;
	}
	
	/**
	 * Column Info
	 * @param dorNodCd
	 */
	public void setDorNodCd(String dorNodCd) {
		this.dorNodCd = dorNodCd;
	}
	
	/**
	 * Column Info
	 * @param actCustCntCd
	 */
	public void setActCustCntCd(String actCustCntCd) {
		this.actCustCntCd = actCustCntCd;
	}
	
	/**
	 * Column Info
	 * @param trspRqstOrdRevAmt
	 */
	public void setTrspRqstOrdRevAmt(String trspRqstOrdRevAmt) {
		this.trspRqstOrdRevAmt = trspRqstOrdRevAmt;
	}
	
	/**
	 * Column Info
	 * @param lstFreeDt
	 */
	public void setLstFreeDt(String lstFreeDt) {
		this.lstFreeDt = lstFreeDt;
	}
	
	/**
	 * Column Info
	 * @param trspCrrModCd
	 */
	public void setTrspCrrModCd(String trspCrrModCd) {
		this.trspCrrModCd = trspCrrModCd;
	}
	
	/**
	 * Column Info
	 * @param trspOtrCostMonDt
	 */
	public void setTrspOtrCostMonDt(String trspOtrCostMonDt) {
		this.trspOtrCostMonDt = trspOtrCostMonDt;
	}
	
	/**
	 * Column Info
	 * @param trspAgmtWyTpCd
	 */
	public void setTrspAgmtWyTpCd(String trspAgmtWyTpCd) {
		this.trspAgmtWyTpCd = trspAgmtWyTpCd;
	}
	
	/**
	 * Column Info
	 * @param dorLocCd
	 */
	public void setDorLocCd(String dorLocCd) {
		this.dorLocCd = dorLocCd;
	}
	
	/**
	 * Column Info
	 * @param trspRjctRsnCd
	 */
	public void setTrspRjctRsnCd(String trspRjctRsnCd) {
		this.trspRjctRsnCd = trspRjctRsnCd;
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
	 * @param lstNodPlnDt
	 */
	public void setLstNodPlnDt(String lstNodPlnDt) {
		this.lstNodPlnDt = lstNodPlnDt;
	}
	
	/**
	 * Column Info
	 * @param eqKndCd
	 */
	public void setEqKndCd(String eqKndCd) {
		this.eqKndCd = eqKndCd;
	}
	
	/**
	 * Column Info
	 * @param refInvNo
	 */
	public void setRefInvNo(String refInvNo) {
		this.refInvNo = refInvNo;
	}
	
	/**
	 * Column Info
	 * @param cntrAvalNtcUpdFlg
	 */
	public void setCntrAvalNtcUpdFlg(String cntrAvalNtcUpdFlg) {
		this.cntrAvalNtcUpdFlg = cntrAvalNtcUpdFlg;
	}
	
	/**
	 * Column Info
	 * @param lseCntrFlg
	 */
	public void setLseCntrFlg(String lseCntrFlg) {
		this.lseCntrFlg = lseCntrFlg;
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
	 * @param n3ptyBilFlg
	 */
	public void setN3ptyBilFlg(String n3ptyBilFlg) {
		this.n3ptyBilFlg = n3ptyBilFlg;
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
	 * @param n1stNodPlnDt
	 */
	public void setN1stNodPlnDt(String n1stNodPlnDt) {
		this.n1stNodPlnDt = n1stNodPlnDt;
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
	 * @param lgsCostCd
	 */
	public void setLgsCostCd(String lgsCostCd) {
		this.lgsCostCd = lgsCostCd;
	}
	
	/**
	 * Column Info
	 * @param viaNodCd
	 */
	public void setViaNodCd(String viaNodCd) {
		this.viaNodCd = viaNodCd;
	}
	
	/**
	 * Column Info
	 * @param cmbSoRltStsFlg
	 */
	public void setCmbSoRltStsFlg(String cmbSoRltStsFlg) {
		this.cmbSoRltStsFlg = cmbSoRltStsFlg;
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
	 * @param toNodCd
	 */
	public void setToNodCd(String toNodCd) {
		this.toNodCd = toNodCd;
	}
	
	/**
	 * Column Info
	 * @param cntrKgsWgt
	 */
	public void setCntrKgsWgt(String cntrKgsWgt) {
		this.cntrKgsWgt = cntrKgsWgt;
	}
	
	/**
	 * Column Info
	 * @param invVndrSeq
	 */
	public void setInvVndrSeq(String invVndrSeq) {
		this.invVndrSeq = invVndrSeq;
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
	 * @param trspAgmtRtTpSerNo
	 */
	public void setTrspAgmtRtTpSerNo(String trspAgmtRtTpSerNo) {
		this.trspAgmtRtTpSerNo = trspAgmtRtTpSerNo;
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
	 * @param trspAgmtRtTpCd
	 */
	public void setTrspAgmtRtTpCd(String trspAgmtRtTpCd) {
		this.trspAgmtRtTpCd = trspAgmtRtTpCd;
	}
	
	/**
	 * Column Info
	 * @param rplnUmchFlg
	 */
	public void setRplnUmchFlg(String rplnUmchFlg) {
		this.rplnUmchFlg = rplnUmchFlg;
	}
	
	/**
	 * Column Info
	 * @param dorNodPlnDt
	 */
	public void setDorNodPlnDt(String dorNodPlnDt) {
		this.dorNodPlnDt = dorNodPlnDt;
	}
	
	/**
	 * Column Info
	 * @param cstmsClrNo
	 */
	public void setCstmsClrNo(String cstmsClrNo) {
		this.cstmsClrNo = cstmsClrNo;
	}
	
	/**
	 * Column Info
	 * @param triAxlReqFlg
	 */
	public void setTriAxlReqFlg(String triAxlReqFlg) {
		this.triAxlReqFlg = triAxlReqFlg;
	}
	
	/**
	 * Column Info
	 * @param csrBzcCorrAmt
	 */
	public void setCsrBzcCorrAmt(String csrBzcCorrAmt) {
		this.csrBzcCorrAmt = csrBzcCorrAmt;
	}
	
	/**
	 * Column Info
	 * @param woBlNoIssFlg
	 */
	public void setWoBlNoIssFlg(String woBlNoIssFlg) {
		this.woBlNoIssFlg = woBlNoIssFlg;
	}
	
	/**
	 * Column Info
	 * @param mtyRdeOrdIssFlg
	 */
	public void setMtyRdeOrdIssFlg(String mtyRdeOrdIssFlg) {
		this.mtyRdeOrdIssFlg = mtyRdeOrdIssFlg;
	}
	
	/**
	 * Column Info
	 * @param trspWoSeq
	 */
	public void setTrspWoSeq(String trspWoSeq) {
		this.trspWoSeq = trspWoSeq;
	}
	
	/**
	 * Column Info
	 * @param trspMtyRqstDt
	 */
	public void setTrspMtyRqstDt(String trspMtyRqstDt) {
		this.trspMtyRqstDt = trspMtyRqstDt;
	}
	
	/**
	 * Column Info
	 * @param mtyRroIssUsrId
	 */
	public void setMtyRroIssUsrId(String mtyRroIssUsrId) {
		this.mtyRroIssUsrId = mtyRroIssUsrId;
	}
	
	/**
	 * Column Info
	 * @param costActGrpCd
	 */
	public void setCostActGrpCd(String costActGrpCd) {
		this.costActGrpCd = costActGrpCd;
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
	 * @param trspAgmtSeq
	 */
	public void setTrspAgmtSeq(String trspAgmtSeq) {
		this.trspAgmtSeq = trspAgmtSeq;
	}
	
	/**
	 * Column Info
	 * @param wgtMeasUtCd
	 */
	public void setWgtMeasUtCd(String wgtMeasUtCd) {
		this.wgtMeasUtCd = wgtMeasUtCd;
	}
	
	/**
	 * Column Info
	 * @param invBzcAmt
	 */
	public void setInvBzcAmt(String invBzcAmt) {
		this.invBzcAmt = invBzcAmt;
	}
	
	/**
	 * Column Info
	 * @param troCfmOfcCd
	 */
	public void setTroCfmOfcCd(String troCfmOfcCd) {
		this.troCfmOfcCd = troCfmOfcCd;
	}
	
	/**
	 * Column Info
	 * @param porCd
	 */
	public void setPorCd(String porCd) {
		this.porCd = porCd;
	}
	
	/**
	 * Column Info
	 * @param contiCd
	 */
	public void setContiCd(String contiCd) {
		this.contiCd = contiCd;
	}
	
	/**
	 * Column Info
	 * @param splIssRsn
	 */
	public void setSplIssRsn(String splIssRsn) {
		this.splIssRsn = splIssRsn;
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
	 * @param edwUpdDt
	 */
	public void setEdwUpdDt(String edwUpdDt) {
		this.edwUpdDt = edwUpdDt;
	}
	
	/**
	 * Column Info
	 * @param fdrSkdDirCd
	 */
	public void setFdrSkdDirCd(String fdrSkdDirCd) {
		this.fdrSkdDirCd = fdrSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @param loclDeltDt
	 */
	public void setLoclDeltDt(String loclDeltDt) {
		this.loclDeltDt = loclDeltDt;
	}
	
	/**
	 * Column Info
	 * @param trspMtyCostModCd
	 */
	public void setTrspMtyCostModCd(String trspMtyCostModCd) {
		this.trspMtyCostModCd = trspMtyCostModCd;
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
	 * @param cgoClzDt
	 */
	public void setCgoClzDt(String cgoClzDt) {
		this.cgoClzDt = cgoClzDt;
	}
	
	/**
	 * Column Info
	 * @param apntDt
	 */
	public void setApntDt(String apntDt) {
		this.apntDt = apntDt;
	}
	
	/**
	 * Column Info
	 * @param cntcPsonNm
	 */
	public void setCntcPsonNm(String cntcPsonNm) {
		this.cntcPsonNm = cntcPsonNm;
	}
	
	/**
	 * Column Info
	 * @param csrScgCorrAmt
	 */
	public void setCsrScgCorrAmt(String csrScgCorrAmt) {
		this.csrScgCorrAmt = csrScgCorrAmt;
	}
	
	/**
	 * Column Info
	 * @param trspSoCmbSrtNo
	 */
	public void setTrspSoCmbSrtNo(String trspSoCmbSrtNo) {
		this.trspSoCmbSrtNo = trspSoCmbSrtNo;
	}
	
	/**
	 * Column Info
	 * @param n3ptyCustCntCd
	 */
	public void setN3ptyCustCntCd(String n3ptyCustCntCd) {
		this.n3ptyCustCntCd = n3ptyCustCntCd;
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
	 * @param trspBndCd
	 */
	public void setTrspBndCd(String trspBndCd) {
		this.trspBndCd = trspBndCd;
	}
	
	/**
	 * Column Info
	 * @param troSeq
	 */
	public void setTroSeq(String troSeq) {
		this.troSeq = troSeq;
	}
	
	/**
	 * Column Info
	 * @param plnSeq
	 */
	public void setPlnSeq(String plnSeq) {
		this.plnSeq = plnSeq;
	}
	
	/**
	 * Column Info
	 * @param custSeq
	 */
	public void setCustSeq(String custSeq) {
		this.custSeq = custSeq;
	}
	
	/**
	 * Column Info
	 * @param invCurrCd
	 */
	public void setInvCurrCd(String invCurrCd) {
		this.invCurrCd = invCurrCd;
	}
	
	/**
	 * Column Info
	 * @param trspNxtPortCd
	 */
	public void setTrspNxtPortCd(String trspNxtPortCd) {
		this.trspNxtPortCd = trspNxtPortCd;
	}
	
	/**
	 * Column Info
	 * @param trspSplSoTpCd
	 */
	public void setTrspSplSoTpCd(String trspSplSoTpCd) {
		this.trspSplSoTpCd = trspSplSoTpCd;
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
	 * @param orgCostActGrpSeq
	 */
	public void setOrgCostActGrpSeq(String orgCostActGrpSeq) {
		this.orgCostActGrpSeq = orgCostActGrpSeq;
	}
	
	/**
	 * Column Info
	 * @param obVvdCd
	 */
	public void setObVvdCd(String obVvdCd) {
		this.obVvdCd = obVvdCd;
	}
	
	/**
	 * Column Info
	 * @param scgIndCd
	 */
	public void setScgIndCd(String scgIndCd) {
		this.scgIndCd = scgIndCd;
	}
	
	/**
	 * Column Info
	 * @param chssMgstTrspTpCd
	 */
	public void setChssMgstTrspTpCd(String chssMgstTrspTpCd) {
		this.chssMgstTrspTpCd = chssMgstTrspTpCd;
	}
	
	/**
	 * Column Info
	 * @param trspSoCmbSeq
	 */
	public void setTrspSoCmbSeq(String trspSoCmbSeq) {
		this.trspSoCmbSeq = trspSoCmbSeq;
	}
	
	/**
	 * Column Info
	 * @param ediRcvRsltDt
	 */
	public void setEdiRcvRsltDt(String ediRcvRsltDt) {
		this.ediRcvRsltDt = ediRcvRsltDt;
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
	 * @param n3ptyDesc
	 */
	public void setN3ptyDesc(String n3ptyDesc) {
		this.n3ptyDesc = n3ptyDesc;
	}
	
	/**
	 * Column Info
	 * @param dorPstCd
	 */
	public void setDorPstCd(String dorPstCd) {
		this.dorPstCd = dorPstCd;
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
	 * @param subEqTpszCd
	 */
	public void setSubEqTpszCd(String subEqTpszCd) {
		this.subEqTpszCd = subEqTpszCd;
	}
	
	/**
	 * Column Info
	 * @param bkgRcvdeTermCd
	 */
	public void setBkgRcvdeTermCd(String bkgRcvdeTermCd) {
		this.bkgRcvdeTermCd = bkgRcvdeTermCd;
	}
	
	/**
	 * Column Info
	 * @param ediSndMsgTpCd
	 */
	public void setEdiSndMsgTpCd(String ediSndMsgTpCd) {
		this.ediSndMsgTpCd = ediSndMsgTpCd;
	}
	
	/**
	 * Column Info
	 * @param refBlNo
	 */
	public void setRefBlNo(String refBlNo) {
		this.refBlNo = refBlNo;
	}
	
	/**
	 * Column Info
	 * @param invXchRt
	 */
	public void setInvXchRt(String invXchRt) {
		this.invXchRt = invXchRt;
	}
	
	/**
	 * Column Info
	 * @param custCntCd
	 */
	public void setCustCntCd(String custCntCd) {
		this.custCntCd = custCntCd;
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
	 * @param troSubSeq
	 */
	public void setTroSubSeq(String troSubSeq) {
		this.troSubSeq = troSubSeq;
	}
	
	/**
	 * Column Info
	 * @param trspSoCmbTpCd
	 */
	public void setTrspSoCmbTpCd(String trspSoCmbTpCd) {
		this.trspSoCmbTpCd = trspSoCmbTpCd;
	}
	
	/**
	 * Column Info
	 * @param ediRjctRsnCd
	 */
	public void setEdiRjctRsnCd(String ediRjctRsnCd) {
		this.ediRjctRsnCd = ediRjctRsnCd;
	}
	
	/**
	 * Column Info
	 * @param orgCopNo
	 */
	public void setOrgCopNo(String orgCopNo) {
		this.orgCopNo = orgCopNo;
	}
	
	/**
	 * Column Info
	 * @param refBkgNo
	 */
	public void setRefBkgNo(String refBkgNo) {
		this.refBkgNo = refBkgNo;
	}
	
	/**
	 * Column Info
	 * @param invAdjBzcAmt
	 */
	public void setInvAdjBzcAmt(String invAdjBzcAmt) {
		this.invAdjBzcAmt = invAdjBzcAmt;
	}
	
	/**
	 * Column Info
	 * @param cntrPkupNo
	 */
	public void setCntrPkupNo(String cntrPkupNo) {
		this.cntrPkupNo = cntrPkupNo;
	}
	
	/**
	 * Column Info
	 * @param podCd
	 */
	public void setPodCd(String podCd) {
		this.podCd = podCd;
	}
	
	/**
	 * Column Info
	 * @param ediRcvRsltCd
	 */
	public void setEdiRcvRsltCd(String ediRcvRsltCd) {
		this.ediRcvRsltCd = ediRcvRsltCd;
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
	 * @param orgGateOutDt
	 */
	public void setOrgGateOutDt(String orgGateOutDt) {
		this.orgGateOutDt = orgGateOutDt;
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
	 * @param rgstNo
	 */
	public void setRgstNo(String rgstNo) {
		this.rgstNo = rgstNo;
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
	 * @param dorArrDt
	 */
	public void setDorArrDt(String dorArrDt) {
		this.dorArrDt = dorArrDt;
	}
	
	/**
	 * Column Info
	 * @param orgBkgNo
	 */
	public void setOrgBkgNo(String orgBkgNo) {
		this.orgBkgNo = orgBkgNo;
	}
	
	/**
	 * Column Info
	 * @param n3ptyCustSeq
	 */
	public void setN3ptyCustSeq(String n3ptyCustSeq) {
		this.n3ptyCustSeq = n3ptyCustSeq;
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
	 * @param dorSvcTpCd
	 */
	public void setDorSvcTpCd(String dorSvcTpCd) {
		this.dorSvcTpCd = dorSvcTpCd;
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
	 * @param cntrSubFlg
	 */
	public void setCntrSubFlg(String cntrSubFlg) {
		this.cntrSubFlg = cntrSubFlg;
	}
	
	/**
	 * Column Info
	 * @param troCfmRevAmt
	 */
	public void setTroCfmRevAmt(String troCfmRevAmt) {
		this.troCfmRevAmt = troCfmRevAmt;
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
	 * @param actCustSeq
	 */
	public void setActCustSeq(String actCustSeq) {
		this.actCustSeq = actCustSeq;
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
	 * @param trspWoOfcCtyCd
	 */
	public void setTrspWoOfcCtyCd(String trspWoOfcCtyCd) {
		this.trspWoOfcCtyCd = trspWoOfcCtyCd;
	}
	
	/**
	 * Column Info
	 * @param invEtcAddAmt
	 */
	public void setInvEtcAddAmt(String invEtcAddAmt) {
		this.invEtcAddAmt = invEtcAddAmt;
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
	 * @param fmNodCd
	 */
	public void setFmNodCd(String fmNodCd) {
		this.fmNodCd = fmNodCd;
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
	 * @param invRmk
	 */
	public void setInvRmk(String invRmk) {
		this.invRmk = invRmk;
	}
	
	/**
	 * Column Info
	 * @param troRepCmdtCd
	 */
	public void setTroRepCmdtCd(String troRepCmdtCd) {
		this.troRepCmdtCd = troRepCmdtCd;
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
	 * @param trspAgmtNodSeq
	 */
	public void setTrspAgmtNodSeq(String trspAgmtNodSeq) {
		this.trspAgmtNodSeq = trspAgmtNodSeq;
	}
	
	/**
	 * Column Info
	 * @param dtnUseFlg
	 */
	public void setDtnUseFlg(String dtnUseFlg) {
		this.dtnUseFlg = dtnUseFlg;
	}
	
	/**
	 * Column Info
	 * @param lstLocCd
	 */
	public void setLstLocCd(String lstLocCd) {
		this.lstLocCd = lstLocCd;
	}
	
	/**
	 * Column Info
	 * @param cntrPkupYdCd
	 */
	public void setCntrPkupYdCd(String cntrPkupYdCd) {
		this.cntrPkupYdCd = cntrPkupYdCd;
	}
	
	/**
	 * Column Info
	 * @param woExeDt
	 */
	public void setWoExeDt(String woExeDt) {
		this.woExeDt = woExeDt;
	}
	
	/**
	 * Column Info
	 * @param trsSubStsCd
	 */
	public void setTrsSubStsCd(String trsSubStsCd) {
		this.trsSubStsCd = trsSubStsCd;
	}
	
	/**
	 * Column Info
	 * @param dorDeAddr
	 */
	public void setDorDeAddr(String dorDeAddr) {
		this.dorDeAddr = dorDeAddr;
	}
	
	/**
	 * Column Info
	 * @param trspInvCalcLgcTpCd
	 */
	public void setTrspInvCalcLgcTpCd(String trspInvCalcLgcTpCd) {
		this.trspInvCalcLgcTpCd = trspInvCalcLgcTpCd;
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
	 * @param fdrSkdVoyNo
	 */
	public void setFdrSkdVoyNo(String fdrSkdVoyNo) {
		this.fdrSkdVoyNo = fdrSkdVoyNo;
	}
	
	/**
	 * Column Info
	 * @param cntcPsonFaxNo
	 */
	public void setCntcPsonFaxNo(String cntcPsonFaxNo) {
		this.cntcPsonFaxNo = cntcPsonFaxNo;
	}
	
	/**
	 * Column Info
	 * @param polCd
	 */
	public void setPolCd(String polCd) {
		this.polCd = polCd;
	}
	
	/**
	 * Column Info
	 * @param n3ptyBilTpCd
	 */
	public void setN3ptyBilTpCd(String n3ptyBilTpCd) {
		this.n3ptyBilTpCd = n3ptyBilTpCd;
	}
	
	/**
	 * Column Info
	 * @param trspCostDtlModCd
	 */
	public void setTrspCostDtlModCd(String trspCostDtlModCd) {
		this.trspCostDtlModCd = trspCostDtlModCd;
	}
	
	/**
	 * Column Info
	 * @param mltStopDeFlg
	 */
	public void setMltStopDeFlg(String mltStopDeFlg) {
		this.mltStopDeFlg = mltStopDeFlg;
	}
	
	/**
	 * Column Info
	 * @param trspAgmtRtSeq
	 */
	public void setTrspAgmtRtSeq(String trspAgmtRtSeq) {
		this.trspAgmtRtSeq = trspAgmtRtSeq;
	}
	
	/**
	 * Column Info
	 * @param woRjctFlg
	 */
	public void setWoRjctFlg(String woRjctFlg) {
		this.woRjctFlg = woRjctFlg;
	}
	
	/**
	 * Column Info
	 * @param trspSoTpCd
	 */
	public void setTrspSoTpCd(String trspSoTpCd) {
		this.trspSoTpCd = trspSoTpCd;
	}
	
	/**
	 * Column Info
	 * @param revCurrCd
	 */
	public void setRevCurrCd(String revCurrCd) {
		this.revCurrCd = revCurrCd;
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
	 * @param trspDfltVndrFlg
	 */
	public void setTrspDfltVndrFlg(String trspDfltVndrFlg) {
		this.trspDfltVndrFlg = trspDfltVndrFlg;
	}
	
	/**
	 * Column Info
	 * @param prntTrspSoOfcCtyCd
	 */
	public void setPrntTrspSoOfcCtyCd(String prntTrspSoOfcCtyCd) {
		this.prntTrspSoOfcCtyCd = prntTrspSoOfcCtyCd;
	}
	
	/**
	 * Column Info
	 * @param delCd
	 */
	public void setDelCd(String delCd) {
		this.delCd = delCd;
	}
	
	/**
	 * Column Info
	 * @param mtyRdeOrdIssDt
	 */
	public void setMtyRdeOrdIssDt(String mtyRdeOrdIssDt) {
		this.mtyRdeOrdIssDt = mtyRdeOrdIssDt;
	}
	
	/**
	 * Column Info
	 * @param cntcPsonPhnNo
	 */
	public void setCntcPsonPhnNo(String cntcPsonPhnNo) {
		this.cntcPsonPhnNo = cntcPsonPhnNo;
	}
	
	/**
	 * Column Info
	 * @param cntrLbsWgt
	 */
	public void setCntrLbsWgt(String cntrLbsWgt) {
		this.cntrLbsWgt = cntrLbsWgt;
	}
	
	/**
	 * Column Info
	 * @param orgEqTpszCd
	 */
	public void setOrgEqTpszCd(String orgEqTpszCd) {
		this.orgEqTpszCd = orgEqTpszCd;
	}
	
	/**
	 * Column Info
	 * @param eqAtchDt
	 */
	public void setEqAtchDt(String eqAtchDt) {
		this.eqAtchDt = eqAtchDt;
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
	 * @param currCd
	 */
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
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
	 * @param ediRcvRsndRqstDt
	 */
	public void setEdiRcvRsndRqstDt(String ediRcvRsndRqstDt) {
		this.ediRcvRsndRqstDt = ediRcvRsndRqstDt;
	}
	
	/**
	 * Column Info
	 * @param n3ptyCurrCd
	 */
	public void setN3ptyCurrCd(String n3ptyCurrCd) {
		this.n3ptyCurrCd = n3ptyCurrCd;
	}
	
	/**
	 * Column Info
	 * @param trspRqstBkgFlg
	 */
	public void setTrspRqstBkgFlg(String trspRqstBkgFlg) {
		this.trspRqstBkgFlg = trspRqstBkgFlg;
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
	 * @param mtyRroIssDt
	 */
	public void setMtyRroIssDt(String mtyRroIssDt) {
		this.mtyRroIssDt = mtyRroIssDt;
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
	 * @param prntTrspSoSeq
	 */
	public void setPrntTrspSoSeq(String prntTrspSoSeq) {
		this.prntTrspSoSeq = prntTrspSoSeq;
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
	 * @param mtyRdeOrdIssUsrId
	 */
	public void setMtyRdeOrdIssUsrId(String mtyRdeOrdIssUsrId) {
		this.mtyRdeOrdIssUsrId = mtyRdeOrdIssUsrId;
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
	 * @param ediRcvRsltMsg
	 */
	public void setEdiRcvRsltMsg(String ediRcvRsltMsg) {
		this.ediRcvRsltMsg = ediRcvRsltMsg;
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
	 * @param updDt
	 */
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
	}
	
	/**
	 * Column Info
	 * @param fincSkdVoyNo
	 */
	public void setFincSkdVoyNo(String fincSkdVoyNo) {
		this.fincSkdVoyNo = fincSkdVoyNo;
	}
	
	/**
	 * Column Info
	 * @param trspPurpRsn
	 */
	public void setTrspPurpRsn(String trspPurpRsn) {
		this.trspPurpRsn = trspPurpRsn;
	}
	
	/**
	 * Column Info
	 * @param mtyRroIssFlg
	 */
	public void setMtyRroIssFlg(String mtyRroIssFlg) {
		this.mtyRroIssFlg = mtyRroIssFlg;
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
	 * @param repoPlnId
	 */
	public void setRepoPlnId(String repoPlnId) {
		this.repoPlnId = repoPlnId;
	}
	
	/**
	 * Column Info
	 * @param troCfmUpdDt
	 */
	public void setTroCfmUpdDt(String troCfmUpdDt) {
		this.troCfmUpdDt = troCfmUpdDt;
	}
	
	/**
	 * Column Info
	 * @param avalDt
	 */
	public void setAvalDt(String avalDt) {
		this.avalDt = avalDt;
	}
	
	/**
	 * Column Info
	 * @param destGateInDt
	 */
	public void setDestGateInDt(String destGateInDt) {
		this.destGateInDt = destGateInDt;
	}
	
	/**
	 * Column Info
	 * @param fincVvdCd
	 */
	public void setFincVvdCd(String fincVvdCd) {
		this.fincVvdCd = fincVvdCd;
	}
	
	/**
	 * Column Info
	 * @param custNomiTrkrFlg
	 */
	public void setCustNomiTrkrFlg(String custNomiTrkrFlg) {
		this.custNomiTrkrFlg = custNomiTrkrFlg;
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
		setIbVvdCd(JSPUtil.getParameter(request, prefix + "ib_vvd_cd", ""));
		setDorPkupCntrNo(JSPUtil.getParameter(request, prefix + "dor_pkup_cntr_no", ""));
		setFincVslCd(JSPUtil.getParameter(request, prefix + "finc_vsl_cd", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setTrspInvActStsCd(JSPUtil.getParameter(request, prefix + "trsp_inv_act_sts_cd", ""));
		setN3ptyOfcCd(JSPUtil.getParameter(request, prefix + "n3pty_ofc_cd", ""));
		setFdrVslCd(JSPUtil.getParameter(request, prefix + "fdr_vsl_cd", ""));
		setIbdCstmsClrLocCd(JSPUtil.getParameter(request, prefix + "ibd_cstms_clr_loc_cd", ""));
		setCntrTpszCd(JSPUtil.getParameter(request, prefix + "cntr_tpsz_cd", ""));
		setActCustAddrSeq(JSPUtil.getParameter(request, prefix + "act_cust_addr_seq", ""));
		setCntrWgt(JSPUtil.getParameter(request, prefix + "cntr_wgt", ""));
		setN3ptyVndrSeq(JSPUtil.getParameter(request, prefix + "n3pty_vndr_seq", ""));
		setEdiCtrlSeq(JSPUtil.getParameter(request, prefix + "edi_ctrl_seq", ""));
		setTroCfmUsrId(JSPUtil.getParameter(request, prefix + "tro_cfm_usr_id", ""));
		setTroLodRefNo(JSPUtil.getParameter(request, prefix + "tro_lod_ref_no", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, prefix + "skd_voy_no", ""));
		setEqTpszCd(JSPUtil.getParameter(request, prefix + "eq_tpsz_cd", ""));
		setNegoAmt(JSPUtil.getParameter(request, prefix + "nego_amt", ""));
		setEdiRcvMsgTpCd(JSPUtil.getParameter(request, prefix + "edi_rcv_msg_tp_cd", ""));
		setFctryNm(JSPUtil.getParameter(request, prefix + "fctry_nm", ""));
		setEdiSndDt(JSPUtil.getParameter(request, prefix + "edi_snd_dt", ""));
		setUplnSoFlg(JSPUtil.getParameter(request, prefix + "upln_so_flg", ""));
		setFincSkdDirCd(JSPUtil.getParameter(request, prefix + "finc_skd_dir_cd", ""));
		setDeDt(JSPUtil.getParameter(request, prefix + "de_dt", ""));
		setPlnYrwk(JSPUtil.getParameter(request, prefix + "pln_yrwk", ""));
		setCntrSltNo(JSPUtil.getParameter(request, prefix + "cntr_slt_no", ""));
		setN3ptyBilBzcAmt(JSPUtil.getParameter(request, prefix + "n3pty_bil_bzc_amt", ""));
		setInterRmk(JSPUtil.getParameter(request, prefix + "inter_rmk", ""));
		setAcctCd(JSPUtil.getParameter(request, prefix + "acct_cd", ""));
		setEdiRcvPurpCd(JSPUtil.getParameter(request, prefix + "edi_rcv_purp_cd", ""));
		setDorNodCd(JSPUtil.getParameter(request, prefix + "dor_nod_cd", ""));
		setActCustCntCd(JSPUtil.getParameter(request, prefix + "act_cust_cnt_cd", ""));
		setTrspRqstOrdRevAmt(JSPUtil.getParameter(request, prefix + "trsp_rqst_ord_rev_amt", ""));
		setLstFreeDt(JSPUtil.getParameter(request, prefix + "lst_free_dt", ""));
		setTrspCrrModCd(JSPUtil.getParameter(request, prefix + "trsp_crr_mod_cd", ""));
		setTrspOtrCostMonDt(JSPUtil.getParameter(request, prefix + "trsp_otr_cost_mon_dt", ""));
		setTrspAgmtWyTpCd(JSPUtil.getParameter(request, prefix + "trsp_agmt_wy_tp_cd", ""));
		setDorLocCd(JSPUtil.getParameter(request, prefix + "dor_loc_cd", ""));
		setTrspRjctRsnCd(JSPUtil.getParameter(request, prefix + "trsp_rjct_rsn_cd", ""));
		setLoclCreDt(JSPUtil.getParameter(request, prefix + "locl_cre_dt", ""));
		setLstNodPlnDt(JSPUtil.getParameter(request, prefix + "lst_nod_pln_dt", ""));
		setEqKndCd(JSPUtil.getParameter(request, prefix + "eq_knd_cd", ""));
		setRefInvNo(JSPUtil.getParameter(request, prefix + "ref_inv_no", ""));
		setCntrAvalNtcUpdFlg(JSPUtil.getParameter(request, prefix + "cntr_aval_ntc_upd_flg", ""));
		setLseCntrFlg(JSPUtil.getParameter(request, prefix + "lse_cntr_flg", ""));
		setFuelScgAmt(JSPUtil.getParameter(request, prefix + "fuel_scg_amt", ""));
		setN3ptyBilFlg(JSPUtil.getParameter(request, prefix + "n3pty_bil_flg", ""));
		setCostActGrpSeq(JSPUtil.getParameter(request, prefix + "cost_act_grp_seq", ""));
		setN1stNodPlnDt(JSPUtil.getParameter(request, prefix + "n1st_nod_pln_dt", ""));
		setCntrNo(JSPUtil.getParameter(request, prefix + "cntr_no", ""));
		setLgsCostCd(JSPUtil.getParameter(request, prefix + "lgs_cost_cd", ""));
		setViaNodCd(JSPUtil.getParameter(request, prefix + "via_nod_cd", ""));
		setCmbSoRltStsFlg(JSPUtil.getParameter(request, prefix + "cmb_so_rlt_sts_flg", ""));
		setRepCmdtCd(JSPUtil.getParameter(request, prefix + "rep_cmdt_cd", ""));
		setToNodCd(JSPUtil.getParameter(request, prefix + "to_nod_cd", ""));
		setCntrKgsWgt(JSPUtil.getParameter(request, prefix + "cntr_kgs_wgt", ""));
		setInvVndrSeq(JSPUtil.getParameter(request, prefix + "inv_vndr_seq", ""));
		setTrspSoSeq(JSPUtil.getParameter(request, prefix + "trsp_so_seq", ""));
		setCopNo(JSPUtil.getParameter(request, prefix + "cop_no", ""));
		setTrspAgmtRtTpSerNo(JSPUtil.getParameter(request, prefix + "trsp_agmt_rt_tp_ser_no", ""));
		setSpclCgoCntrTpCd(JSPUtil.getParameter(request, prefix + "spcl_cgo_cntr_tp_cd", ""));
		setTrspAgmtRtTpCd(JSPUtil.getParameter(request, prefix + "trsp_agmt_rt_tp_cd", ""));
		setRplnUmchFlg(JSPUtil.getParameter(request, prefix + "rpln_umch_flg", ""));
		setDorNodPlnDt(JSPUtil.getParameter(request, prefix + "dor_nod_pln_dt", ""));
		setCstmsClrNo(JSPUtil.getParameter(request, prefix + "cstms_clr_no", ""));
		setTriAxlReqFlg(JSPUtil.getParameter(request, prefix + "tri_axl_req_flg", ""));
		setCsrBzcCorrAmt(JSPUtil.getParameter(request, prefix + "csr_bzc_corr_amt", ""));
		setWoBlNoIssFlg(JSPUtil.getParameter(request, prefix + "wo_bl_no_iss_flg", ""));
		setMtyRdeOrdIssFlg(JSPUtil.getParameter(request, prefix + "mty_rde_ord_iss_flg", ""));
		setTrspWoSeq(JSPUtil.getParameter(request, prefix + "trsp_wo_seq", ""));
		setTrspMtyRqstDt(JSPUtil.getParameter(request, prefix + "trsp_mty_rqst_dt", ""));
		setMtyRroIssUsrId(JSPUtil.getParameter(request, prefix + "mty_rro_iss_usr_id", ""));
		setCostActGrpCd(JSPUtil.getParameter(request, prefix + "cost_act_grp_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setTrspAgmtSeq(JSPUtil.getParameter(request, prefix + "trsp_agmt_seq", ""));
		setWgtMeasUtCd(JSPUtil.getParameter(request, prefix + "wgt_meas_ut_cd", ""));
		setInvBzcAmt(JSPUtil.getParameter(request, prefix + "inv_bzc_amt", ""));
		setTroCfmOfcCd(JSPUtil.getParameter(request, prefix + "tro_cfm_ofc_cd", ""));
		setPorCd(JSPUtil.getParameter(request, prefix + "por_cd", ""));
		setContiCd(JSPUtil.getParameter(request, prefix + "conti_cd", ""));
		setSplIssRsn(JSPUtil.getParameter(request, prefix + "spl_iss_rsn", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setTrspAgmtOfcCtyCd(JSPUtil.getParameter(request, prefix + "trsp_agmt_ofc_cty_cd", ""));
		setEdwUpdDt(JSPUtil.getParameter(request, prefix + "edw_upd_dt", ""));
		setFdrSkdDirCd(JSPUtil.getParameter(request, prefix + "fdr_skd_dir_cd", ""));
		setLoclDeltDt(JSPUtil.getParameter(request, prefix + "locl_delt_dt", ""));
		setTrspMtyCostModCd(JSPUtil.getParameter(request, prefix + "trsp_mty_cost_mod_cd", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setCgoClzDt(JSPUtil.getParameter(request, prefix + "cgo_clz_dt", ""));
		setApntDt(JSPUtil.getParameter(request, prefix + "apnt_dt", ""));
		setCntcPsonNm(JSPUtil.getParameter(request, prefix + "cntc_pson_nm", ""));
		setCsrScgCorrAmt(JSPUtil.getParameter(request, prefix + "csr_scg_corr_amt", ""));
		setTrspSoCmbSrtNo(JSPUtil.getParameter(request, prefix + "trsp_so_cmb_srt_no", ""));
		setN3ptyCustCntCd(JSPUtil.getParameter(request, prefix + "n3pty_cust_cnt_cd", ""));
		setEtcAddAmt(JSPUtil.getParameter(request, prefix + "etc_add_amt", ""));
		setTrspBndCd(JSPUtil.getParameter(request, prefix + "trsp_bnd_cd", ""));
		setTroSeq(JSPUtil.getParameter(request, prefix + "tro_seq", ""));
		setPlnSeq(JSPUtil.getParameter(request, prefix + "pln_seq", ""));
		setCustSeq(JSPUtil.getParameter(request, prefix + "cust_seq", ""));
		setInvCurrCd(JSPUtil.getParameter(request, prefix + "inv_curr_cd", ""));
		setTrspNxtPortCd(JSPUtil.getParameter(request, prefix + "trsp_nxt_port_cd", ""));
		setTrspSplSoTpCd(JSPUtil.getParameter(request, prefix + "trsp_spl_so_tp_cd", ""));
		setRefSeq(JSPUtil.getParameter(request, prefix + "ref_seq", ""));
		setOrgCostActGrpSeq(JSPUtil.getParameter(request, prefix + "org_cost_act_grp_seq", ""));
		setObVvdCd(JSPUtil.getParameter(request, prefix + "ob_vvd_cd", ""));
		setScgIndCd(JSPUtil.getParameter(request, prefix + "scg_ind_cd", ""));
		setChssMgstTrspTpCd(JSPUtil.getParameter(request, prefix + "chss_mgst_trsp_tp_cd", ""));
		setTrspSoCmbSeq(JSPUtil.getParameter(request, prefix + "trsp_so_cmb_seq", ""));
		setEdiRcvRsltDt(JSPUtil.getParameter(request, prefix + "edi_rcv_rslt_dt", ""));
		setCgoTpCd(JSPUtil.getParameter(request, prefix + "cgo_tp_cd", ""));
		setN3ptyDesc(JSPUtil.getParameter(request, prefix + "n3pty_desc", ""));
		setDorPstCd(JSPUtil.getParameter(request, prefix + "dor_pst_cd", ""));
		setTrspFrstFlg(JSPUtil.getParameter(request, prefix + "trsp_frst_flg", ""));
		setSubEqTpszCd(JSPUtil.getParameter(request, prefix + "sub_eq_tpsz_cd", ""));
		setBkgRcvdeTermCd(JSPUtil.getParameter(request, prefix + "bkg_rcvde_term_cd", ""));
		setEdiSndMsgTpCd(JSPUtil.getParameter(request, prefix + "edi_snd_msg_tp_cd", ""));
		setRefBlNo(JSPUtil.getParameter(request, prefix + "ref_bl_no", ""));
		setInvXchRt(JSPUtil.getParameter(request, prefix + "inv_xch_rt", ""));
		setCustCntCd(JSPUtil.getParameter(request, prefix + "cust_cnt_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setTroSubSeq(JSPUtil.getParameter(request, prefix + "tro_sub_seq", ""));
		setTrspSoCmbTpCd(JSPUtil.getParameter(request, prefix + "trsp_so_cmb_tp_cd", ""));
		setEdiRjctRsnCd(JSPUtil.getParameter(request, prefix + "edi_rjct_rsn_cd", ""));
		setOrgCopNo(JSPUtil.getParameter(request, prefix + "org_cop_no", ""));
		setRefBkgNo(JSPUtil.getParameter(request, prefix + "ref_bkg_no", ""));
		setInvAdjBzcAmt(JSPUtil.getParameter(request, prefix + "inv_adj_bzc_amt", ""));
		setCntrPkupNo(JSPUtil.getParameter(request, prefix + "cntr_pkup_no", ""));
		setPodCd(JSPUtil.getParameter(request, prefix + "pod_cd", ""));
		setEdiRcvRsltCd(JSPUtil.getParameter(request, prefix + "edi_rcv_rslt_cd", ""));
		setBkgNo(JSPUtil.getParameter(request, prefix + "bkg_no", ""));
		setOrgGateOutDt(JSPUtil.getParameter(request, prefix + "org_gate_out_dt", ""));
		setLoclUpdDt(JSPUtil.getParameter(request, prefix + "locl_upd_dt", ""));
		setRgstNo(JSPUtil.getParameter(request, prefix + "rgst_no", ""));
		setDeltFlg(JSPUtil.getParameter(request, prefix + "delt_flg", ""));
		setDorArrDt(JSPUtil.getParameter(request, prefix + "dor_arr_dt", ""));
		setOrgBkgNo(JSPUtil.getParameter(request, prefix + "org_bkg_no", ""));
		setN3ptyCustSeq(JSPUtil.getParameter(request, prefix + "n3pty_cust_seq", ""));
		setCmdtCd(JSPUtil.getParameter(request, prefix + "cmdt_cd", ""));
		setDorSvcTpCd(JSPUtil.getParameter(request, prefix + "dor_svc_tp_cd", ""));
		setTrspSoStsCd(JSPUtil.getParameter(request, prefix + "trsp_so_sts_cd", ""));
		setCntrSubFlg(JSPUtil.getParameter(request, prefix + "cntr_sub_flg", ""));
		setTroCfmRevAmt(JSPUtil.getParameter(request, prefix + "tro_cfm_rev_amt", ""));
		setCostOfcCd(JSPUtil.getParameter(request, prefix + "cost_ofc_cd", ""));
		setActCustSeq(JSPUtil.getParameter(request, prefix + "act_cust_seq", ""));
		setBzcAmt(JSPUtil.getParameter(request, prefix + "bzc_amt", ""));
		setTrspWoOfcCtyCd(JSPUtil.getParameter(request, prefix + "trsp_wo_ofc_cty_cd", ""));
		setInvEtcAddAmt(JSPUtil.getParameter(request, prefix + "inv_etc_add_amt", ""));
		setInvNo(JSPUtil.getParameter(request, prefix + "inv_no", ""));
		setFmNodCd(JSPUtil.getParameter(request, prefix + "fm_nod_cd", ""));
		setSlanCd(JSPUtil.getParameter(request, prefix + "slan_cd", ""));
		setInvRmk(JSPUtil.getParameter(request, prefix + "inv_rmk", ""));
		setTroRepCmdtCd(JSPUtil.getParameter(request, prefix + "tro_rep_cmdt_cd", ""));
		setVslCd(JSPUtil.getParameter(request, prefix + "vsl_cd", ""));
		setTrspAgmtNodSeq(JSPUtil.getParameter(request, prefix + "trsp_agmt_nod_seq", ""));
		setDtnUseFlg(JSPUtil.getParameter(request, prefix + "dtn_use_flg", ""));
		setLstLocCd(JSPUtil.getParameter(request, prefix + "lst_loc_cd", ""));
		setCntrPkupYdCd(JSPUtil.getParameter(request, prefix + "cntr_pkup_yd_cd", ""));
		setWoExeDt(JSPUtil.getParameter(request, prefix + "wo_exe_dt", ""));
		setTrsSubStsCd(JSPUtil.getParameter(request, prefix + "trs_sub_sts_cd", ""));
		setDorDeAddr(JSPUtil.getParameter(request, prefix + "dor_de_addr", ""));
		setTrspInvCalcLgcTpCd(JSPUtil.getParameter(request, prefix + "trsp_inv_calc_lgc_tp_cd", ""));
		setBlNo(JSPUtil.getParameter(request, prefix + "bl_no", ""));
		setFdrSkdVoyNo(JSPUtil.getParameter(request, prefix + "fdr_skd_voy_no", ""));
		setCntcPsonFaxNo(JSPUtil.getParameter(request, prefix + "cntc_pson_fax_no", ""));
		setPolCd(JSPUtil.getParameter(request, prefix + "pol_cd", ""));
		setN3ptyBilTpCd(JSPUtil.getParameter(request, prefix + "n3pty_bil_tp_cd", ""));
		setTrspCostDtlModCd(JSPUtil.getParameter(request, prefix + "trsp_cost_dtl_mod_cd", ""));
		setMltStopDeFlg(JSPUtil.getParameter(request, prefix + "mlt_stop_de_flg", ""));
		setTrspAgmtRtSeq(JSPUtil.getParameter(request, prefix + "trsp_agmt_rt_seq", ""));
		setWoRjctFlg(JSPUtil.getParameter(request, prefix + "wo_rjct_flg", ""));
		setTrspSoTpCd(JSPUtil.getParameter(request, prefix + "trsp_so_tp_cd", ""));
		setRevCurrCd(JSPUtil.getParameter(request, prefix + "rev_curr_cd", ""));
		setOwnrCoCd(JSPUtil.getParameter(request, prefix + "ownr_co_cd", ""));
		setTrspDfltVndrFlg(JSPUtil.getParameter(request, prefix + "trsp_dflt_vndr_flg", ""));
		setPrntTrspSoOfcCtyCd(JSPUtil.getParameter(request, prefix + "prnt_trsp_so_ofc_cty_cd", ""));
		setDelCd(JSPUtil.getParameter(request, prefix + "del_cd", ""));
		setMtyRdeOrdIssDt(JSPUtil.getParameter(request, prefix + "mty_rde_ord_iss_dt", ""));
		setCntcPsonPhnNo(JSPUtil.getParameter(request, prefix + "cntc_pson_phn_no", ""));
		setCntrLbsWgt(JSPUtil.getParameter(request, prefix + "cntr_lbs_wgt", ""));
		setOrgEqTpszCd(JSPUtil.getParameter(request, prefix + "org_eq_tpsz_cd", ""));
		setEqAtchDt(JSPUtil.getParameter(request, prefix + "eq_atch_dt", ""));
		setVndrSeq(JSPUtil.getParameter(request, prefix + "vndr_seq", ""));
		setCurrCd(JSPUtil.getParameter(request, prefix + "curr_cd", ""));
		setRefId(JSPUtil.getParameter(request, prefix + "ref_id", ""));
		setEdiRcvRsndRqstDt(JSPUtil.getParameter(request, prefix + "edi_rcv_rsnd_rqst_dt", ""));
		setN3ptyCurrCd(JSPUtil.getParameter(request, prefix + "n3pty_curr_cd", ""));
		setTrspRqstBkgFlg(JSPUtil.getParameter(request, prefix + "trsp_rqst_bkg_flg", ""));
		setTrspSoOfcCtyCd(JSPUtil.getParameter(request, prefix + "trsp_so_ofc_cty_cd", ""));
		setMtyRroIssDt(JSPUtil.getParameter(request, prefix + "mty_rro_iss_dt", ""));
		setEqNo(JSPUtil.getParameter(request, prefix + "eq_no", ""));
		setPrntTrspSoSeq(JSPUtil.getParameter(request, prefix + "prnt_trsp_so_seq", ""));
		setCreOfcCd(JSPUtil.getParameter(request, prefix + "cre_ofc_cd", ""));
		setMtyRdeOrdIssUsrId(JSPUtil.getParameter(request, prefix + "mty_rde_ord_iss_usr_id", ""));
		setSpclInstrRmk(JSPUtil.getParameter(request, prefix + "spcl_instr_rmk", ""));
		setEdiRcvRsltMsg(JSPUtil.getParameter(request, prefix + "edi_rcv_rslt_msg", ""));
		setOvrWgtScgAmt(JSPUtil.getParameter(request, prefix + "ovr_wgt_scg_amt", ""));
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setFincSkdVoyNo(JSPUtil.getParameter(request, prefix + "finc_skd_voy_no", ""));
		setTrspPurpRsn(JSPUtil.getParameter(request, prefix + "trsp_purp_rsn", ""));
		setMtyRroIssFlg(JSPUtil.getParameter(request, prefix + "mty_rro_iss_flg", ""));
		setSkdDirCd(JSPUtil.getParameter(request, prefix + "skd_dir_cd", ""));
		setRepoPlnId(JSPUtil.getParameter(request, prefix + "repo_pln_id", ""));
		setTroCfmUpdDt(JSPUtil.getParameter(request, prefix + "tro_cfm_upd_dt", ""));
		setAvalDt(JSPUtil.getParameter(request, prefix + "aval_dt", ""));
		setDestGateInDt(JSPUtil.getParameter(request, prefix + "dest_gate_in_dt", ""));
		setFincVvdCd(JSPUtil.getParameter(request, prefix + "finc_vvd_cd", ""));
		setCustNomiTrkrFlg(JSPUtil.getParameter(request, prefix + "cust_nomi_trkr_flg", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return TrsTrspSvcOrdVO[]
	 */
	public TrsTrspSvcOrdVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return TrsTrspSvcOrdVO[]
	 */
	public TrsTrspSvcOrdVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		TrsTrspSvcOrdVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] ibVvdCd = (JSPUtil.getParameter(request, prefix	+ "ib_vvd_cd", length));
			String[] dorPkupCntrNo = (JSPUtil.getParameter(request, prefix	+ "dor_pkup_cntr_no", length));
			String[] fincVslCd = (JSPUtil.getParameter(request, prefix	+ "finc_vsl_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] trspInvActStsCd = (JSPUtil.getParameter(request, prefix	+ "trsp_inv_act_sts_cd", length));
			String[] n3ptyOfcCd = (JSPUtil.getParameter(request, prefix	+ "n3pty_ofc_cd", length));
			String[] fdrVslCd = (JSPUtil.getParameter(request, prefix	+ "fdr_vsl_cd", length));
			String[] ibdCstmsClrLocCd = (JSPUtil.getParameter(request, prefix	+ "ibd_cstms_clr_loc_cd", length));
			String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_cd", length));
			String[] actCustAddrSeq = (JSPUtil.getParameter(request, prefix	+ "act_cust_addr_seq", length));
			String[] cntrWgt = (JSPUtil.getParameter(request, prefix	+ "cntr_wgt", length));
			String[] n3ptyVndrSeq = (JSPUtil.getParameter(request, prefix	+ "n3pty_vndr_seq", length));
			String[] ediCtrlSeq = (JSPUtil.getParameter(request, prefix	+ "edi_ctrl_seq", length));
			String[] troCfmUsrId = (JSPUtil.getParameter(request, prefix	+ "tro_cfm_usr_id", length));
			String[] troLodRefNo = (JSPUtil.getParameter(request, prefix	+ "tro_lod_ref_no", length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no", length));
			String[] eqTpszCd = (JSPUtil.getParameter(request, prefix	+ "eq_tpsz_cd", length));
			String[] negoAmt = (JSPUtil.getParameter(request, prefix	+ "nego_amt", length));
			String[] ediRcvMsgTpCd = (JSPUtil.getParameter(request, prefix	+ "edi_rcv_msg_tp_cd", length));
			String[] fctryNm = (JSPUtil.getParameter(request, prefix	+ "fctry_nm", length));
			String[] ediSndDt = (JSPUtil.getParameter(request, prefix	+ "edi_snd_dt", length));
			String[] uplnSoFlg = (JSPUtil.getParameter(request, prefix	+ "upln_so_flg", length));
			String[] fincSkdDirCd = (JSPUtil.getParameter(request, prefix	+ "finc_skd_dir_cd", length));
			String[] deDt = (JSPUtil.getParameter(request, prefix	+ "de_dt", length));
			String[] plnYrwk = (JSPUtil.getParameter(request, prefix	+ "pln_yrwk", length));
			String[] cntrSltNo = (JSPUtil.getParameter(request, prefix	+ "cntr_slt_no", length));
			String[] n3ptyBilBzcAmt = (JSPUtil.getParameter(request, prefix	+ "n3pty_bil_bzc_amt", length));
			String[] interRmk = (JSPUtil.getParameter(request, prefix	+ "inter_rmk", length));
			String[] acctCd = (JSPUtil.getParameter(request, prefix	+ "acct_cd", length));
			String[] ediRcvPurpCd = (JSPUtil.getParameter(request, prefix	+ "edi_rcv_purp_cd", length));
			String[] dorNodCd = (JSPUtil.getParameter(request, prefix	+ "dor_nod_cd", length));
			String[] actCustCntCd = (JSPUtil.getParameter(request, prefix	+ "act_cust_cnt_cd", length));
			String[] trspRqstOrdRevAmt = (JSPUtil.getParameter(request, prefix	+ "trsp_rqst_ord_rev_amt", length));
			String[] lstFreeDt = (JSPUtil.getParameter(request, prefix	+ "lst_free_dt", length));
			String[] trspCrrModCd = (JSPUtil.getParameter(request, prefix	+ "trsp_crr_mod_cd", length));
			String[] trspOtrCostMonDt = (JSPUtil.getParameter(request, prefix	+ "trsp_otr_cost_mon_dt", length));
			String[] trspAgmtWyTpCd = (JSPUtil.getParameter(request, prefix	+ "trsp_agmt_wy_tp_cd", length));
			String[] dorLocCd = (JSPUtil.getParameter(request, prefix	+ "dor_loc_cd", length));
			String[] trspRjctRsnCd = (JSPUtil.getParameter(request, prefix	+ "trsp_rjct_rsn_cd", length));
			String[] loclCreDt = (JSPUtil.getParameter(request, prefix	+ "locl_cre_dt", length));
			String[] lstNodPlnDt = (JSPUtil.getParameter(request, prefix	+ "lst_nod_pln_dt", length));
			String[] eqKndCd = (JSPUtil.getParameter(request, prefix	+ "eq_knd_cd", length));
			String[] refInvNo = (JSPUtil.getParameter(request, prefix	+ "ref_inv_no", length));
			String[] cntrAvalNtcUpdFlg = (JSPUtil.getParameter(request, prefix	+ "cntr_aval_ntc_upd_flg", length));
			String[] lseCntrFlg = (JSPUtil.getParameter(request, prefix	+ "lse_cntr_flg", length));
			String[] fuelScgAmt = (JSPUtil.getParameter(request, prefix	+ "fuel_scg_amt", length));
			String[] n3ptyBilFlg = (JSPUtil.getParameter(request, prefix	+ "n3pty_bil_flg", length));
			String[] costActGrpSeq = (JSPUtil.getParameter(request, prefix	+ "cost_act_grp_seq", length));
			String[] n1stNodPlnDt = (JSPUtil.getParameter(request, prefix	+ "n1st_nod_pln_dt", length));
			String[] cntrNo = (JSPUtil.getParameter(request, prefix	+ "cntr_no", length));
			String[] lgsCostCd = (JSPUtil.getParameter(request, prefix	+ "lgs_cost_cd", length));
			String[] viaNodCd = (JSPUtil.getParameter(request, prefix	+ "via_nod_cd", length));
			String[] cmbSoRltStsFlg = (JSPUtil.getParameter(request, prefix	+ "cmb_so_rlt_sts_flg", length));
			String[] repCmdtCd = (JSPUtil.getParameter(request, prefix	+ "rep_cmdt_cd", length));
			String[] toNodCd = (JSPUtil.getParameter(request, prefix	+ "to_nod_cd", length));
			String[] cntrKgsWgt = (JSPUtil.getParameter(request, prefix	+ "cntr_kgs_wgt", length));
			String[] invVndrSeq = (JSPUtil.getParameter(request, prefix	+ "inv_vndr_seq", length));
			String[] trspSoSeq = (JSPUtil.getParameter(request, prefix	+ "trsp_so_seq", length));
			String[] copNo = (JSPUtil.getParameter(request, prefix	+ "cop_no", length));
			String[] trspAgmtRtTpSerNo = (JSPUtil.getParameter(request, prefix	+ "trsp_agmt_rt_tp_ser_no", length));
			String[] spclCgoCntrTpCd = (JSPUtil.getParameter(request, prefix	+ "spcl_cgo_cntr_tp_cd", length));
			String[] trspAgmtRtTpCd = (JSPUtil.getParameter(request, prefix	+ "trsp_agmt_rt_tp_cd", length));
			String[] rplnUmchFlg = (JSPUtil.getParameter(request, prefix	+ "rpln_umch_flg", length));
			String[] dorNodPlnDt = (JSPUtil.getParameter(request, prefix	+ "dor_nod_pln_dt", length));
			String[] cstmsClrNo = (JSPUtil.getParameter(request, prefix	+ "cstms_clr_no", length));
			String[] triAxlReqFlg = (JSPUtil.getParameter(request, prefix	+ "tri_axl_req_flg", length));
			String[] csrBzcCorrAmt = (JSPUtil.getParameter(request, prefix	+ "csr_bzc_corr_amt", length));
			String[] woBlNoIssFlg = (JSPUtil.getParameter(request, prefix	+ "wo_bl_no_iss_flg", length));
			String[] mtyRdeOrdIssFlg = (JSPUtil.getParameter(request, prefix	+ "mty_rde_ord_iss_flg", length));
			String[] trspWoSeq = (JSPUtil.getParameter(request, prefix	+ "trsp_wo_seq", length));
			String[] trspMtyRqstDt = (JSPUtil.getParameter(request, prefix	+ "trsp_mty_rqst_dt", length));
			String[] mtyRroIssUsrId = (JSPUtil.getParameter(request, prefix	+ "mty_rro_iss_usr_id", length));
			String[] costActGrpCd = (JSPUtil.getParameter(request, prefix	+ "cost_act_grp_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] trspAgmtSeq = (JSPUtil.getParameter(request, prefix	+ "trsp_agmt_seq", length));
			String[] wgtMeasUtCd = (JSPUtil.getParameter(request, prefix	+ "wgt_meas_ut_cd", length));
			String[] invBzcAmt = (JSPUtil.getParameter(request, prefix	+ "inv_bzc_amt", length));
			String[] troCfmOfcCd = (JSPUtil.getParameter(request, prefix	+ "tro_cfm_ofc_cd", length));
			String[] porCd = (JSPUtil.getParameter(request, prefix	+ "por_cd", length));
			String[] contiCd = (JSPUtil.getParameter(request, prefix	+ "conti_cd", length));
			String[] splIssRsn = (JSPUtil.getParameter(request, prefix	+ "spl_iss_rsn", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] trspAgmtOfcCtyCd = (JSPUtil.getParameter(request, prefix	+ "trsp_agmt_ofc_cty_cd", length));
			String[] edwUpdDt = (JSPUtil.getParameter(request, prefix	+ "edw_upd_dt", length));
			String[] fdrSkdDirCd = (JSPUtil.getParameter(request, prefix	+ "fdr_skd_dir_cd", length));
			String[] loclDeltDt = (JSPUtil.getParameter(request, prefix	+ "locl_delt_dt", length));
			String[] trspMtyCostModCd = (JSPUtil.getParameter(request, prefix	+ "trsp_mty_cost_mod_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] cgoClzDt = (JSPUtil.getParameter(request, prefix	+ "cgo_clz_dt", length));
			String[] apntDt = (JSPUtil.getParameter(request, prefix	+ "apnt_dt", length));
			String[] cntcPsonNm = (JSPUtil.getParameter(request, prefix	+ "cntc_pson_nm", length));
			String[] csrScgCorrAmt = (JSPUtil.getParameter(request, prefix	+ "csr_scg_corr_amt", length));
			String[] trspSoCmbSrtNo = (JSPUtil.getParameter(request, prefix	+ "trsp_so_cmb_srt_no", length));
			String[] n3ptyCustCntCd = (JSPUtil.getParameter(request, prefix	+ "n3pty_cust_cnt_cd", length));
			String[] etcAddAmt = (JSPUtil.getParameter(request, prefix	+ "etc_add_amt", length));
			String[] trspBndCd = (JSPUtil.getParameter(request, prefix	+ "trsp_bnd_cd", length));
			String[] troSeq = (JSPUtil.getParameter(request, prefix	+ "tro_seq", length));
			String[] plnSeq = (JSPUtil.getParameter(request, prefix	+ "pln_seq", length));
			String[] custSeq = (JSPUtil.getParameter(request, prefix	+ "cust_seq", length));
			String[] invCurrCd = (JSPUtil.getParameter(request, prefix	+ "inv_curr_cd", length));
			String[] trspNxtPortCd = (JSPUtil.getParameter(request, prefix	+ "trsp_nxt_port_cd", length));
			String[] trspSplSoTpCd = (JSPUtil.getParameter(request, prefix	+ "trsp_spl_so_tp_cd", length));
			String[] refSeq = (JSPUtil.getParameter(request, prefix	+ "ref_seq", length));
			String[] orgCostActGrpSeq = (JSPUtil.getParameter(request, prefix	+ "org_cost_act_grp_seq", length));
			String[] obVvdCd = (JSPUtil.getParameter(request, prefix	+ "ob_vvd_cd", length));
			String[] scgIndCd = (JSPUtil.getParameter(request, prefix	+ "scg_ind_cd", length));
			String[] chssMgstTrspTpCd = (JSPUtil.getParameter(request, prefix	+ "chss_mgst_trsp_tp_cd", length));
			String[] trspSoCmbSeq = (JSPUtil.getParameter(request, prefix	+ "trsp_so_cmb_seq", length));
			String[] ediRcvRsltDt = (JSPUtil.getParameter(request, prefix	+ "edi_rcv_rslt_dt", length));
			String[] cgoTpCd = (JSPUtil.getParameter(request, prefix	+ "cgo_tp_cd", length));
			String[] n3ptyDesc = (JSPUtil.getParameter(request, prefix	+ "n3pty_desc", length));
			String[] dorPstCd = (JSPUtil.getParameter(request, prefix	+ "dor_pst_cd", length));
			String[] trspFrstFlg = (JSPUtil.getParameter(request, prefix	+ "trsp_frst_flg", length));
			String[] subEqTpszCd = (JSPUtil.getParameter(request, prefix	+ "sub_eq_tpsz_cd", length));
			String[] bkgRcvdeTermCd = (JSPUtil.getParameter(request, prefix	+ "bkg_rcvde_term_cd", length));
			String[] ediSndMsgTpCd = (JSPUtil.getParameter(request, prefix	+ "edi_snd_msg_tp_cd", length));
			String[] refBlNo = (JSPUtil.getParameter(request, prefix	+ "ref_bl_no", length));
			String[] invXchRt = (JSPUtil.getParameter(request, prefix	+ "inv_xch_rt", length));
			String[] custCntCd = (JSPUtil.getParameter(request, prefix	+ "cust_cnt_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] troSubSeq = (JSPUtil.getParameter(request, prefix	+ "tro_sub_seq", length));
			String[] trspSoCmbTpCd = (JSPUtil.getParameter(request, prefix	+ "trsp_so_cmb_tp_cd", length));
			String[] ediRjctRsnCd = (JSPUtil.getParameter(request, prefix	+ "edi_rjct_rsn_cd", length));
			String[] orgCopNo = (JSPUtil.getParameter(request, prefix	+ "org_cop_no", length));
			String[] refBkgNo = (JSPUtil.getParameter(request, prefix	+ "ref_bkg_no", length));
			String[] invAdjBzcAmt = (JSPUtil.getParameter(request, prefix	+ "inv_adj_bzc_amt", length));
			String[] cntrPkupNo = (JSPUtil.getParameter(request, prefix	+ "cntr_pkup_no", length));
			String[] podCd = (JSPUtil.getParameter(request, prefix	+ "pod_cd", length));
			String[] ediRcvRsltCd = (JSPUtil.getParameter(request, prefix	+ "edi_rcv_rslt_cd", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] orgGateOutDt = (JSPUtil.getParameter(request, prefix	+ "org_gate_out_dt", length));
			String[] loclUpdDt = (JSPUtil.getParameter(request, prefix	+ "locl_upd_dt", length));
			String[] rgstNo = (JSPUtil.getParameter(request, prefix	+ "rgst_no", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] dorArrDt = (JSPUtil.getParameter(request, prefix	+ "dor_arr_dt", length));
			String[] orgBkgNo = (JSPUtil.getParameter(request, prefix	+ "org_bkg_no", length));
			String[] n3ptyCustSeq = (JSPUtil.getParameter(request, prefix	+ "n3pty_cust_seq", length));
			String[] cmdtCd = (JSPUtil.getParameter(request, prefix	+ "cmdt_cd", length));
			String[] dorSvcTpCd = (JSPUtil.getParameter(request, prefix	+ "dor_svc_tp_cd", length));
			String[] trspSoStsCd = (JSPUtil.getParameter(request, prefix	+ "trsp_so_sts_cd", length));
			String[] cntrSubFlg = (JSPUtil.getParameter(request, prefix	+ "cntr_sub_flg", length));
			String[] troCfmRevAmt = (JSPUtil.getParameter(request, prefix	+ "tro_cfm_rev_amt", length));
			String[] costOfcCd = (JSPUtil.getParameter(request, prefix	+ "cost_ofc_cd", length));
			String[] actCustSeq = (JSPUtil.getParameter(request, prefix	+ "act_cust_seq", length));
			String[] bzcAmt = (JSPUtil.getParameter(request, prefix	+ "bzc_amt", length));
			String[] trspWoOfcCtyCd = (JSPUtil.getParameter(request, prefix	+ "trsp_wo_ofc_cty_cd", length));
			String[] invEtcAddAmt = (JSPUtil.getParameter(request, prefix	+ "inv_etc_add_amt", length));
			String[] invNo = (JSPUtil.getParameter(request, prefix	+ "inv_no", length));
			String[] fmNodCd = (JSPUtil.getParameter(request, prefix	+ "fm_nod_cd", length));
			String[] slanCd = (JSPUtil.getParameter(request, prefix	+ "slan_cd", length));
			String[] invRmk = (JSPUtil.getParameter(request, prefix	+ "inv_rmk", length));
			String[] troRepCmdtCd = (JSPUtil.getParameter(request, prefix	+ "tro_rep_cmdt_cd", length));
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] trspAgmtNodSeq = (JSPUtil.getParameter(request, prefix	+ "trsp_agmt_nod_seq", length));
			String[] dtnUseFlg = (JSPUtil.getParameter(request, prefix	+ "dtn_use_flg", length));
			String[] lstLocCd = (JSPUtil.getParameter(request, prefix	+ "lst_loc_cd", length));
			String[] cntrPkupYdCd = (JSPUtil.getParameter(request, prefix	+ "cntr_pkup_yd_cd", length));
			String[] woExeDt = (JSPUtil.getParameter(request, prefix	+ "wo_exe_dt", length));
			String[] trsSubStsCd = (JSPUtil.getParameter(request, prefix	+ "trs_sub_sts_cd", length));
			String[] dorDeAddr = (JSPUtil.getParameter(request, prefix	+ "dor_de_addr", length));
			String[] trspInvCalcLgcTpCd = (JSPUtil.getParameter(request, prefix	+ "trsp_inv_calc_lgc_tp_cd", length));
			String[] blNo = (JSPUtil.getParameter(request, prefix	+ "bl_no", length));
			String[] fdrSkdVoyNo = (JSPUtil.getParameter(request, prefix	+ "fdr_skd_voy_no", length));
			String[] cntcPsonFaxNo = (JSPUtil.getParameter(request, prefix	+ "cntc_pson_fax_no", length));
			String[] polCd = (JSPUtil.getParameter(request, prefix	+ "pol_cd", length));
			String[] n3ptyBilTpCd = (JSPUtil.getParameter(request, prefix	+ "n3pty_bil_tp_cd", length));
			String[] trspCostDtlModCd = (JSPUtil.getParameter(request, prefix	+ "trsp_cost_dtl_mod_cd", length));
			String[] mltStopDeFlg = (JSPUtil.getParameter(request, prefix	+ "mlt_stop_de_flg", length));
			String[] trspAgmtRtSeq = (JSPUtil.getParameter(request, prefix	+ "trsp_agmt_rt_seq", length));
			String[] woRjctFlg = (JSPUtil.getParameter(request, prefix	+ "wo_rjct_flg", length));
			String[] trspSoTpCd = (JSPUtil.getParameter(request, prefix	+ "trsp_so_tp_cd", length));
			String[] revCurrCd = (JSPUtil.getParameter(request, prefix	+ "rev_curr_cd", length));
			String[] ownrCoCd = (JSPUtil.getParameter(request, prefix	+ "ownr_co_cd", length));
			String[] trspDfltVndrFlg = (JSPUtil.getParameter(request, prefix	+ "trsp_dflt_vndr_flg", length));
			String[] prntTrspSoOfcCtyCd = (JSPUtil.getParameter(request, prefix	+ "prnt_trsp_so_ofc_cty_cd", length));
			String[] delCd = (JSPUtil.getParameter(request, prefix	+ "del_cd", length));
			String[] mtyRdeOrdIssDt = (JSPUtil.getParameter(request, prefix	+ "mty_rde_ord_iss_dt", length));
			String[] cntcPsonPhnNo = (JSPUtil.getParameter(request, prefix	+ "cntc_pson_phn_no", length));
			String[] cntrLbsWgt = (JSPUtil.getParameter(request, prefix	+ "cntr_lbs_wgt", length));
			String[] orgEqTpszCd = (JSPUtil.getParameter(request, prefix	+ "org_eq_tpsz_cd", length));
			String[] eqAtchDt = (JSPUtil.getParameter(request, prefix	+ "eq_atch_dt", length));
			String[] vndrSeq = (JSPUtil.getParameter(request, prefix	+ "vndr_seq", length));
			String[] currCd = (JSPUtil.getParameter(request, prefix	+ "curr_cd", length));
			String[] refId = (JSPUtil.getParameter(request, prefix	+ "ref_id", length));
			String[] ediRcvRsndRqstDt = (JSPUtil.getParameter(request, prefix	+ "edi_rcv_rsnd_rqst_dt", length));
			String[] n3ptyCurrCd = (JSPUtil.getParameter(request, prefix	+ "n3pty_curr_cd", length));
			String[] trspRqstBkgFlg = (JSPUtil.getParameter(request, prefix	+ "trsp_rqst_bkg_flg", length));
			String[] trspSoOfcCtyCd = (JSPUtil.getParameter(request, prefix	+ "trsp_so_ofc_cty_cd", length));
			String[] mtyRroIssDt = (JSPUtil.getParameter(request, prefix	+ "mty_rro_iss_dt", length));
			String[] eqNo = (JSPUtil.getParameter(request, prefix	+ "eq_no", length));
			String[] prntTrspSoSeq = (JSPUtil.getParameter(request, prefix	+ "prnt_trsp_so_seq", length));
			String[] creOfcCd = (JSPUtil.getParameter(request, prefix	+ "cre_ofc_cd", length));
			String[] mtyRdeOrdIssUsrId = (JSPUtil.getParameter(request, prefix	+ "mty_rde_ord_iss_usr_id", length));
			String[] spclInstrRmk = (JSPUtil.getParameter(request, prefix	+ "spcl_instr_rmk", length));
			String[] ediRcvRsltMsg = (JSPUtil.getParameter(request, prefix	+ "edi_rcv_rslt_msg", length));
			String[] ovrWgtScgAmt = (JSPUtil.getParameter(request, prefix	+ "ovr_wgt_scg_amt", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] fincSkdVoyNo = (JSPUtil.getParameter(request, prefix	+ "finc_skd_voy_no", length));
			String[] trspPurpRsn = (JSPUtil.getParameter(request, prefix	+ "trsp_purp_rsn", length));
			String[] mtyRroIssFlg = (JSPUtil.getParameter(request, prefix	+ "mty_rro_iss_flg", length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd", length));
			String[] repoPlnId = (JSPUtil.getParameter(request, prefix	+ "repo_pln_id", length));
			String[] troCfmUpdDt = (JSPUtil.getParameter(request, prefix	+ "tro_cfm_upd_dt", length));
			String[] avalDt = (JSPUtil.getParameter(request, prefix	+ "aval_dt", length));
			String[] destGateInDt = (JSPUtil.getParameter(request, prefix	+ "dest_gate_in_dt", length));
			String[] fincVvdCd = (JSPUtil.getParameter(request, prefix	+ "finc_vvd_cd", length));
			String[] custNomiTrkrFlg = (JSPUtil.getParameter(request, prefix	+ "cust_nomi_trkr_flg", length));
			
			for (int i = 0; i < length; i++) {
				model = new TrsTrspSvcOrdVO();
				if (ibVvdCd[i] != null)
					model.setIbVvdCd(ibVvdCd[i]);
				if (dorPkupCntrNo[i] != null)
					model.setDorPkupCntrNo(dorPkupCntrNo[i]);
				if (fincVslCd[i] != null)
					model.setFincVslCd(fincVslCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (trspInvActStsCd[i] != null)
					model.setTrspInvActStsCd(trspInvActStsCd[i]);
				if (n3ptyOfcCd[i] != null)
					model.setN3ptyOfcCd(n3ptyOfcCd[i]);
				if (fdrVslCd[i] != null)
					model.setFdrVslCd(fdrVslCd[i]);
				if (ibdCstmsClrLocCd[i] != null)
					model.setIbdCstmsClrLocCd(ibdCstmsClrLocCd[i]);
				if (cntrTpszCd[i] != null)
					model.setCntrTpszCd(cntrTpszCd[i]);
				if (actCustAddrSeq[i] != null)
					model.setActCustAddrSeq(actCustAddrSeq[i]);
				if (cntrWgt[i] != null)
					model.setCntrWgt(cntrWgt[i]);
				if (n3ptyVndrSeq[i] != null)
					model.setN3ptyVndrSeq(n3ptyVndrSeq[i]);
				if (ediCtrlSeq[i] != null)
					model.setEdiCtrlSeq(ediCtrlSeq[i]);
				if (troCfmUsrId[i] != null)
					model.setTroCfmUsrId(troCfmUsrId[i]);
				if (troLodRefNo[i] != null)
					model.setTroLodRefNo(troLodRefNo[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (eqTpszCd[i] != null)
					model.setEqTpszCd(eqTpszCd[i]);
				if (negoAmt[i] != null)
					model.setNegoAmt(negoAmt[i]);
				if (ediRcvMsgTpCd[i] != null)
					model.setEdiRcvMsgTpCd(ediRcvMsgTpCd[i]);
				if (fctryNm[i] != null)
					model.setFctryNm(fctryNm[i]);
				if (ediSndDt[i] != null)
					model.setEdiSndDt(ediSndDt[i]);
				if (uplnSoFlg[i] != null)
					model.setUplnSoFlg(uplnSoFlg[i]);
				if (fincSkdDirCd[i] != null)
					model.setFincSkdDirCd(fincSkdDirCd[i]);
				if (deDt[i] != null)
					model.setDeDt(deDt[i]);
				if (plnYrwk[i] != null)
					model.setPlnYrwk(plnYrwk[i]);
				if (cntrSltNo[i] != null)
					model.setCntrSltNo(cntrSltNo[i]);
				if (n3ptyBilBzcAmt[i] != null)
					model.setN3ptyBilBzcAmt(n3ptyBilBzcAmt[i]);
				if (interRmk[i] != null)
					model.setInterRmk(interRmk[i]);
				if (acctCd[i] != null)
					model.setAcctCd(acctCd[i]);
				if (ediRcvPurpCd[i] != null)
					model.setEdiRcvPurpCd(ediRcvPurpCd[i]);
				if (dorNodCd[i] != null)
					model.setDorNodCd(dorNodCd[i]);
				if (actCustCntCd[i] != null)
					model.setActCustCntCd(actCustCntCd[i]);
				if (trspRqstOrdRevAmt[i] != null)
					model.setTrspRqstOrdRevAmt(trspRqstOrdRevAmt[i]);
				if (lstFreeDt[i] != null)
					model.setLstFreeDt(lstFreeDt[i]);
				if (trspCrrModCd[i] != null)
					model.setTrspCrrModCd(trspCrrModCd[i]);
				if (trspOtrCostMonDt[i] != null)
					model.setTrspOtrCostMonDt(trspOtrCostMonDt[i]);
				if (trspAgmtWyTpCd[i] != null)
					model.setTrspAgmtWyTpCd(trspAgmtWyTpCd[i]);
				if (dorLocCd[i] != null)
					model.setDorLocCd(dorLocCd[i]);
				if (trspRjctRsnCd[i] != null)
					model.setTrspRjctRsnCd(trspRjctRsnCd[i]);
				if (loclCreDt[i] != null)
					model.setLoclCreDt(loclCreDt[i]);
				if (lstNodPlnDt[i] != null)
					model.setLstNodPlnDt(lstNodPlnDt[i]);
				if (eqKndCd[i] != null)
					model.setEqKndCd(eqKndCd[i]);
				if (refInvNo[i] != null)
					model.setRefInvNo(refInvNo[i]);
				if (cntrAvalNtcUpdFlg[i] != null)
					model.setCntrAvalNtcUpdFlg(cntrAvalNtcUpdFlg[i]);
				if (lseCntrFlg[i] != null)
					model.setLseCntrFlg(lseCntrFlg[i]);
				if (fuelScgAmt[i] != null)
					model.setFuelScgAmt(fuelScgAmt[i]);
				if (n3ptyBilFlg[i] != null)
					model.setN3ptyBilFlg(n3ptyBilFlg[i]);
				if (costActGrpSeq[i] != null)
					model.setCostActGrpSeq(costActGrpSeq[i]);
				if (n1stNodPlnDt[i] != null)
					model.setN1stNodPlnDt(n1stNodPlnDt[i]);
				if (cntrNo[i] != null)
					model.setCntrNo(cntrNo[i]);
				if (lgsCostCd[i] != null)
					model.setLgsCostCd(lgsCostCd[i]);
				if (viaNodCd[i] != null)
					model.setViaNodCd(viaNodCd[i]);
				if (cmbSoRltStsFlg[i] != null)
					model.setCmbSoRltStsFlg(cmbSoRltStsFlg[i]);
				if (repCmdtCd[i] != null)
					model.setRepCmdtCd(repCmdtCd[i]);
				if (toNodCd[i] != null)
					model.setToNodCd(toNodCd[i]);
				if (cntrKgsWgt[i] != null)
					model.setCntrKgsWgt(cntrKgsWgt[i]);
				if (invVndrSeq[i] != null)
					model.setInvVndrSeq(invVndrSeq[i]);
				if (trspSoSeq[i] != null)
					model.setTrspSoSeq(trspSoSeq[i]);
				if (copNo[i] != null)
					model.setCopNo(copNo[i]);
				if (trspAgmtRtTpSerNo[i] != null)
					model.setTrspAgmtRtTpSerNo(trspAgmtRtTpSerNo[i]);
				if (spclCgoCntrTpCd[i] != null)
					model.setSpclCgoCntrTpCd(spclCgoCntrTpCd[i]);
				if (trspAgmtRtTpCd[i] != null)
					model.setTrspAgmtRtTpCd(trspAgmtRtTpCd[i]);
				if (rplnUmchFlg[i] != null)
					model.setRplnUmchFlg(rplnUmchFlg[i]);
				if (dorNodPlnDt[i] != null)
					model.setDorNodPlnDt(dorNodPlnDt[i]);
				if (cstmsClrNo[i] != null)
					model.setCstmsClrNo(cstmsClrNo[i]);
				if (triAxlReqFlg[i] != null)
					model.setTriAxlReqFlg(triAxlReqFlg[i]);
				if (csrBzcCorrAmt[i] != null)
					model.setCsrBzcCorrAmt(csrBzcCorrAmt[i]);
				if (woBlNoIssFlg[i] != null)
					model.setWoBlNoIssFlg(woBlNoIssFlg[i]);
				if (mtyRdeOrdIssFlg[i] != null)
					model.setMtyRdeOrdIssFlg(mtyRdeOrdIssFlg[i]);
				if (trspWoSeq[i] != null)
					model.setTrspWoSeq(trspWoSeq[i]);
				if (trspMtyRqstDt[i] != null)
					model.setTrspMtyRqstDt(trspMtyRqstDt[i]);
				if (mtyRroIssUsrId[i] != null)
					model.setMtyRroIssUsrId(mtyRroIssUsrId[i]);
				if (costActGrpCd[i] != null)
					model.setCostActGrpCd(costActGrpCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (trspAgmtSeq[i] != null)
					model.setTrspAgmtSeq(trspAgmtSeq[i]);
				if (wgtMeasUtCd[i] != null)
					model.setWgtMeasUtCd(wgtMeasUtCd[i]);
				if (invBzcAmt[i] != null)
					model.setInvBzcAmt(invBzcAmt[i]);
				if (troCfmOfcCd[i] != null)
					model.setTroCfmOfcCd(troCfmOfcCd[i]);
				if (porCd[i] != null)
					model.setPorCd(porCd[i]);
				if (contiCd[i] != null)
					model.setContiCd(contiCd[i]);
				if (splIssRsn[i] != null)
					model.setSplIssRsn(splIssRsn[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (trspAgmtOfcCtyCd[i] != null)
					model.setTrspAgmtOfcCtyCd(trspAgmtOfcCtyCd[i]);
				if (edwUpdDt[i] != null)
					model.setEdwUpdDt(edwUpdDt[i]);
				if (fdrSkdDirCd[i] != null)
					model.setFdrSkdDirCd(fdrSkdDirCd[i]);
				if (loclDeltDt[i] != null)
					model.setLoclDeltDt(loclDeltDt[i]);
				if (trspMtyCostModCd[i] != null)
					model.setTrspMtyCostModCd(trspMtyCostModCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (cgoClzDt[i] != null)
					model.setCgoClzDt(cgoClzDt[i]);
				if (apntDt[i] != null)
					model.setApntDt(apntDt[i]);
				if (cntcPsonNm[i] != null)
					model.setCntcPsonNm(cntcPsonNm[i]);
				if (csrScgCorrAmt[i] != null)
					model.setCsrScgCorrAmt(csrScgCorrAmt[i]);
				if (trspSoCmbSrtNo[i] != null)
					model.setTrspSoCmbSrtNo(trspSoCmbSrtNo[i]);
				if (n3ptyCustCntCd[i] != null)
					model.setN3ptyCustCntCd(n3ptyCustCntCd[i]);
				if (etcAddAmt[i] != null)
					model.setEtcAddAmt(etcAddAmt[i]);
				if (trspBndCd[i] != null)
					model.setTrspBndCd(trspBndCd[i]);
				if (troSeq[i] != null)
					model.setTroSeq(troSeq[i]);
				if (plnSeq[i] != null)
					model.setPlnSeq(plnSeq[i]);
				if (custSeq[i] != null)
					model.setCustSeq(custSeq[i]);
				if (invCurrCd[i] != null)
					model.setInvCurrCd(invCurrCd[i]);
				if (trspNxtPortCd[i] != null)
					model.setTrspNxtPortCd(trspNxtPortCd[i]);
				if (trspSplSoTpCd[i] != null)
					model.setTrspSplSoTpCd(trspSplSoTpCd[i]);
				if (refSeq[i] != null)
					model.setRefSeq(refSeq[i]);
				if (orgCostActGrpSeq[i] != null)
					model.setOrgCostActGrpSeq(orgCostActGrpSeq[i]);
				if (obVvdCd[i] != null)
					model.setObVvdCd(obVvdCd[i]);
				if (scgIndCd[i] != null)
					model.setScgIndCd(scgIndCd[i]);
				if (chssMgstTrspTpCd[i] != null)
					model.setChssMgstTrspTpCd(chssMgstTrspTpCd[i]);
				if (trspSoCmbSeq[i] != null)
					model.setTrspSoCmbSeq(trspSoCmbSeq[i]);
				if (ediRcvRsltDt[i] != null)
					model.setEdiRcvRsltDt(ediRcvRsltDt[i]);
				if (cgoTpCd[i] != null)
					model.setCgoTpCd(cgoTpCd[i]);
				if (n3ptyDesc[i] != null)
					model.setN3ptyDesc(n3ptyDesc[i]);
				if (dorPstCd[i] != null)
					model.setDorPstCd(dorPstCd[i]);
				if (trspFrstFlg[i] != null)
					model.setTrspFrstFlg(trspFrstFlg[i]);
				if (subEqTpszCd[i] != null)
					model.setSubEqTpszCd(subEqTpszCd[i]);
				if (bkgRcvdeTermCd[i] != null)
					model.setBkgRcvdeTermCd(bkgRcvdeTermCd[i]);
				if (ediSndMsgTpCd[i] != null)
					model.setEdiSndMsgTpCd(ediSndMsgTpCd[i]);
				if (refBlNo[i] != null)
					model.setRefBlNo(refBlNo[i]);
				if (invXchRt[i] != null)
					model.setInvXchRt(invXchRt[i]);
				if (custCntCd[i] != null)
					model.setCustCntCd(custCntCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (troSubSeq[i] != null)
					model.setTroSubSeq(troSubSeq[i]);
				if (trspSoCmbTpCd[i] != null)
					model.setTrspSoCmbTpCd(trspSoCmbTpCd[i]);
				if (ediRjctRsnCd[i] != null)
					model.setEdiRjctRsnCd(ediRjctRsnCd[i]);
				if (orgCopNo[i] != null)
					model.setOrgCopNo(orgCopNo[i]);
				if (refBkgNo[i] != null)
					model.setRefBkgNo(refBkgNo[i]);
				if (invAdjBzcAmt[i] != null)
					model.setInvAdjBzcAmt(invAdjBzcAmt[i]);
				if (cntrPkupNo[i] != null)
					model.setCntrPkupNo(cntrPkupNo[i]);
				if (podCd[i] != null)
					model.setPodCd(podCd[i]);
				if (ediRcvRsltCd[i] != null)
					model.setEdiRcvRsltCd(ediRcvRsltCd[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (orgGateOutDt[i] != null)
					model.setOrgGateOutDt(orgGateOutDt[i]);
				if (loclUpdDt[i] != null)
					model.setLoclUpdDt(loclUpdDt[i]);
				if (rgstNo[i] != null)
					model.setRgstNo(rgstNo[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (dorArrDt[i] != null)
					model.setDorArrDt(dorArrDt[i]);
				if (orgBkgNo[i] != null)
					model.setOrgBkgNo(orgBkgNo[i]);
				if (n3ptyCustSeq[i] != null)
					model.setN3ptyCustSeq(n3ptyCustSeq[i]);
				if (cmdtCd[i] != null)
					model.setCmdtCd(cmdtCd[i]);
				if (dorSvcTpCd[i] != null)
					model.setDorSvcTpCd(dorSvcTpCd[i]);
				if (trspSoStsCd[i] != null)
					model.setTrspSoStsCd(trspSoStsCd[i]);
				if (cntrSubFlg[i] != null)
					model.setCntrSubFlg(cntrSubFlg[i]);
				if (troCfmRevAmt[i] != null)
					model.setTroCfmRevAmt(troCfmRevAmt[i]);
				if (costOfcCd[i] != null)
					model.setCostOfcCd(costOfcCd[i]);
				if (actCustSeq[i] != null)
					model.setActCustSeq(actCustSeq[i]);
				if (bzcAmt[i] != null)
					model.setBzcAmt(bzcAmt[i]);
				if (trspWoOfcCtyCd[i] != null)
					model.setTrspWoOfcCtyCd(trspWoOfcCtyCd[i]);
				if (invEtcAddAmt[i] != null)
					model.setInvEtcAddAmt(invEtcAddAmt[i]);
				if (invNo[i] != null)
					model.setInvNo(invNo[i]);
				if (fmNodCd[i] != null)
					model.setFmNodCd(fmNodCd[i]);
				if (slanCd[i] != null)
					model.setSlanCd(slanCd[i]);
				if (invRmk[i] != null)
					model.setInvRmk(invRmk[i]);
				if (troRepCmdtCd[i] != null)
					model.setTroRepCmdtCd(troRepCmdtCd[i]);
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (trspAgmtNodSeq[i] != null)
					model.setTrspAgmtNodSeq(trspAgmtNodSeq[i]);
				if (dtnUseFlg[i] != null)
					model.setDtnUseFlg(dtnUseFlg[i]);
				if (lstLocCd[i] != null)
					model.setLstLocCd(lstLocCd[i]);
				if (cntrPkupYdCd[i] != null)
					model.setCntrPkupYdCd(cntrPkupYdCd[i]);
				if (woExeDt[i] != null)
					model.setWoExeDt(woExeDt[i]);
				if (trsSubStsCd[i] != null)
					model.setTrsSubStsCd(trsSubStsCd[i]);
				if (dorDeAddr[i] != null)
					model.setDorDeAddr(dorDeAddr[i]);
				if (trspInvCalcLgcTpCd[i] != null)
					model.setTrspInvCalcLgcTpCd(trspInvCalcLgcTpCd[i]);
				if (blNo[i] != null)
					model.setBlNo(blNo[i]);
				if (fdrSkdVoyNo[i] != null)
					model.setFdrSkdVoyNo(fdrSkdVoyNo[i]);
				if (cntcPsonFaxNo[i] != null)
					model.setCntcPsonFaxNo(cntcPsonFaxNo[i]);
				if (polCd[i] != null)
					model.setPolCd(polCd[i]);
				if (n3ptyBilTpCd[i] != null)
					model.setN3ptyBilTpCd(n3ptyBilTpCd[i]);
				if (trspCostDtlModCd[i] != null)
					model.setTrspCostDtlModCd(trspCostDtlModCd[i]);
				if (mltStopDeFlg[i] != null)
					model.setMltStopDeFlg(mltStopDeFlg[i]);
				if (trspAgmtRtSeq[i] != null)
					model.setTrspAgmtRtSeq(trspAgmtRtSeq[i]);
				if (woRjctFlg[i] != null)
					model.setWoRjctFlg(woRjctFlg[i]);
				if (trspSoTpCd[i] != null)
					model.setTrspSoTpCd(trspSoTpCd[i]);
				if (revCurrCd[i] != null)
					model.setRevCurrCd(revCurrCd[i]);
				if (ownrCoCd[i] != null)
					model.setOwnrCoCd(ownrCoCd[i]);
				if (trspDfltVndrFlg[i] != null)
					model.setTrspDfltVndrFlg(trspDfltVndrFlg[i]);
				if (prntTrspSoOfcCtyCd[i] != null)
					model.setPrntTrspSoOfcCtyCd(prntTrspSoOfcCtyCd[i]);
				if (delCd[i] != null)
					model.setDelCd(delCd[i]);
				if (mtyRdeOrdIssDt[i] != null)
					model.setMtyRdeOrdIssDt(mtyRdeOrdIssDt[i]);
				if (cntcPsonPhnNo[i] != null)
					model.setCntcPsonPhnNo(cntcPsonPhnNo[i]);
				if (cntrLbsWgt[i] != null)
					model.setCntrLbsWgt(cntrLbsWgt[i]);
				if (orgEqTpszCd[i] != null)
					model.setOrgEqTpszCd(orgEqTpszCd[i]);
				if (eqAtchDt[i] != null)
					model.setEqAtchDt(eqAtchDt[i]);
				if (vndrSeq[i] != null)
					model.setVndrSeq(vndrSeq[i]);
				if (currCd[i] != null)
					model.setCurrCd(currCd[i]);
				if (refId[i] != null)
					model.setRefId(refId[i]);
				if (ediRcvRsndRqstDt[i] != null)
					model.setEdiRcvRsndRqstDt(ediRcvRsndRqstDt[i]);
				if (n3ptyCurrCd[i] != null)
					model.setN3ptyCurrCd(n3ptyCurrCd[i]);
				if (trspRqstBkgFlg[i] != null)
					model.setTrspRqstBkgFlg(trspRqstBkgFlg[i]);
				if (trspSoOfcCtyCd[i] != null)
					model.setTrspSoOfcCtyCd(trspSoOfcCtyCd[i]);
				if (mtyRroIssDt[i] != null)
					model.setMtyRroIssDt(mtyRroIssDt[i]);
				if (eqNo[i] != null)
					model.setEqNo(eqNo[i]);
				if (prntTrspSoSeq[i] != null)
					model.setPrntTrspSoSeq(prntTrspSoSeq[i]);
				if (creOfcCd[i] != null)
					model.setCreOfcCd(creOfcCd[i]);
				if (mtyRdeOrdIssUsrId[i] != null)
					model.setMtyRdeOrdIssUsrId(mtyRdeOrdIssUsrId[i]);
				if (spclInstrRmk[i] != null)
					model.setSpclInstrRmk(spclInstrRmk[i]);
				if (ediRcvRsltMsg[i] != null)
					model.setEdiRcvRsltMsg(ediRcvRsltMsg[i]);
				if (ovrWgtScgAmt[i] != null)
					model.setOvrWgtScgAmt(ovrWgtScgAmt[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (fincSkdVoyNo[i] != null)
					model.setFincSkdVoyNo(fincSkdVoyNo[i]);
				if (trspPurpRsn[i] != null)
					model.setTrspPurpRsn(trspPurpRsn[i]);
				if (mtyRroIssFlg[i] != null)
					model.setMtyRroIssFlg(mtyRroIssFlg[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (repoPlnId[i] != null)
					model.setRepoPlnId(repoPlnId[i]);
				if (troCfmUpdDt[i] != null)
					model.setTroCfmUpdDt(troCfmUpdDt[i]);
				if (avalDt[i] != null)
					model.setAvalDt(avalDt[i]);
				if (destGateInDt[i] != null)
					model.setDestGateInDt(destGateInDt[i]);
				if (fincVvdCd[i] != null)
					model.setFincVvdCd(fincVvdCd[i]);
				if (custNomiTrkrFlg[i] != null)
					model.setCustNomiTrkrFlg(custNomiTrkrFlg[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getTrsTrspSvcOrdVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return TrsTrspSvcOrdVO[]
	 */
	public TrsTrspSvcOrdVO[] getTrsTrspSvcOrdVOs(){
		TrsTrspSvcOrdVO[] vos = (TrsTrspSvcOrdVO[])models.toArray(new TrsTrspSvcOrdVO[models.size()]);
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
		this.ibVvdCd = this.ibVvdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dorPkupCntrNo = this.dorPkupCntrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fincVslCd = this.fincVslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspInvActStsCd = this.trspInvActStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3ptyOfcCd = this.n3ptyOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fdrVslCd = this.fdrVslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibdCstmsClrLocCd = this.ibdCstmsClrLocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszCd = this.cntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actCustAddrSeq = this.actCustAddrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrWgt = this.cntrWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3ptyVndrSeq = this.n3ptyVndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediCtrlSeq = this.ediCtrlSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.troCfmUsrId = this.troCfmUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.troLodRefNo = this.troLodRefNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqTpszCd = this.eqTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.negoAmt = this.negoAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediRcvMsgTpCd = this.ediRcvMsgTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fctryNm = this.fctryNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediSndDt = this.ediSndDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.uplnSoFlg = this.uplnSoFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fincSkdDirCd = this.fincSkdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deDt = this.deDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.plnYrwk = this.plnYrwk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrSltNo = this.cntrSltNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3ptyBilBzcAmt = this.n3ptyBilBzcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.interRmk = this.interRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acctCd = this.acctCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediRcvPurpCd = this.ediRcvPurpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dorNodCd = this.dorNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actCustCntCd = this.actCustCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspRqstOrdRevAmt = this.trspRqstOrdRevAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lstFreeDt = this.lstFreeDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspCrrModCd = this.trspCrrModCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspOtrCostMonDt = this.trspOtrCostMonDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspAgmtWyTpCd = this.trspAgmtWyTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dorLocCd = this.dorLocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspRjctRsnCd = this.trspRjctRsnCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.loclCreDt = this.loclCreDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lstNodPlnDt = this.lstNodPlnDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqKndCd = this.eqKndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.refInvNo = this.refInvNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrAvalNtcUpdFlg = this.cntrAvalNtcUpdFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lseCntrFlg = this.lseCntrFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fuelScgAmt = this.fuelScgAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3ptyBilFlg = this.n3ptyBilFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costActGrpSeq = this.costActGrpSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stNodPlnDt = this.n1stNodPlnDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrNo = this.cntrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lgsCostCd = this.lgsCostCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.viaNodCd = this.viaNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cmbSoRltStsFlg = this.cmbSoRltStsFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.repCmdtCd = this.repCmdtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.toNodCd = this.toNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrKgsWgt = this.cntrKgsWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invVndrSeq = this.invVndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspSoSeq = this.trspSoSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.copNo = this.copNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspAgmtRtTpSerNo = this.trspAgmtRtTpSerNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spclCgoCntrTpCd = this.spclCgoCntrTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspAgmtRtTpCd = this.trspAgmtRtTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rplnUmchFlg = this.rplnUmchFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dorNodPlnDt = this.dorNodPlnDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cstmsClrNo = this.cstmsClrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.triAxlReqFlg = this.triAxlReqFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.csrBzcCorrAmt = this.csrBzcCorrAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.woBlNoIssFlg = this.woBlNoIssFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mtyRdeOrdIssFlg = this.mtyRdeOrdIssFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspWoSeq = this.trspWoSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspMtyRqstDt = this.trspMtyRqstDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mtyRroIssUsrId = this.mtyRroIssUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costActGrpCd = this.costActGrpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspAgmtSeq = this.trspAgmtSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.wgtMeasUtCd = this.wgtMeasUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invBzcAmt = this.invBzcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.troCfmOfcCd = this.troCfmOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.porCd = this.porCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.contiCd = this.contiCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.splIssRsn = this.splIssRsn .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspAgmtOfcCtyCd = this.trspAgmtOfcCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.edwUpdDt = this.edwUpdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fdrSkdDirCd = this.fdrSkdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.loclDeltDt = this.loclDeltDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspMtyCostModCd = this.trspMtyCostModCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cgoClzDt = this.cgoClzDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.apntDt = this.apntDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntcPsonNm = this.cntcPsonNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.csrScgCorrAmt = this.csrScgCorrAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspSoCmbSrtNo = this.trspSoCmbSrtNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3ptyCustCntCd = this.n3ptyCustCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.etcAddAmt = this.etcAddAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspBndCd = this.trspBndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.troSeq = this.troSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.plnSeq = this.plnSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custSeq = this.custSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invCurrCd = this.invCurrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspNxtPortCd = this.trspNxtPortCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspSplSoTpCd = this.trspSplSoTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.refSeq = this.refSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgCostActGrpSeq = this.orgCostActGrpSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.obVvdCd = this.obVvdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.scgIndCd = this.scgIndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssMgstTrspTpCd = this.chssMgstTrspTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspSoCmbSeq = this.trspSoCmbSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediRcvRsltDt = this.ediRcvRsltDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cgoTpCd = this.cgoTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3ptyDesc = this.n3ptyDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dorPstCd = this.dorPstCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspFrstFlg = this.trspFrstFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.subEqTpszCd = this.subEqTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgRcvdeTermCd = this.bkgRcvdeTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediSndMsgTpCd = this.ediSndMsgTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.refBlNo = this.refBlNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invXchRt = this.invXchRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custCntCd = this.custCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.troSubSeq = this.troSubSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspSoCmbTpCd = this.trspSoCmbTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediRjctRsnCd = this.ediRjctRsnCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgCopNo = this.orgCopNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.refBkgNo = this.refBkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invAdjBzcAmt = this.invAdjBzcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrPkupNo = this.cntrPkupNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.podCd = this.podCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediRcvRsltCd = this.ediRcvRsltCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgGateOutDt = this.orgGateOutDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.loclUpdDt = this.loclUpdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rgstNo = this.rgstNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dorArrDt = this.dorArrDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgBkgNo = this.orgBkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3ptyCustSeq = this.n3ptyCustSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cmdtCd = this.cmdtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dorSvcTpCd = this.dorSvcTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspSoStsCd = this.trspSoStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrSubFlg = this.cntrSubFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.troCfmRevAmt = this.troCfmRevAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costOfcCd = this.costOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actCustSeq = this.actCustSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bzcAmt = this.bzcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspWoOfcCtyCd = this.trspWoOfcCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invEtcAddAmt = this.invEtcAddAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invNo = this.invNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fmNodCd = this.fmNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slanCd = this.slanCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invRmk = this.invRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.troRepCmdtCd = this.troRepCmdtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspAgmtNodSeq = this.trspAgmtNodSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dtnUseFlg = this.dtnUseFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lstLocCd = this.lstLocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrPkupYdCd = this.cntrPkupYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.woExeDt = this.woExeDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trsSubStsCd = this.trsSubStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dorDeAddr = this.dorDeAddr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspInvCalcLgcTpCd = this.trspInvCalcLgcTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blNo = this.blNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fdrSkdVoyNo = this.fdrSkdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntcPsonFaxNo = this.cntcPsonFaxNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.polCd = this.polCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3ptyBilTpCd = this.n3ptyBilTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspCostDtlModCd = this.trspCostDtlModCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mltStopDeFlg = this.mltStopDeFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspAgmtRtSeq = this.trspAgmtRtSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.woRjctFlg = this.woRjctFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspSoTpCd = this.trspSoTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.revCurrCd = this.revCurrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ownrCoCd = this.ownrCoCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspDfltVndrFlg = this.trspDfltVndrFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prntTrspSoOfcCtyCd = this.prntTrspSoOfcCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.delCd = this.delCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mtyRdeOrdIssDt = this.mtyRdeOrdIssDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntcPsonPhnNo = this.cntcPsonPhnNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrLbsWgt = this.cntrLbsWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgEqTpszCd = this.orgEqTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqAtchDt = this.eqAtchDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrSeq = this.vndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.currCd = this.currCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.refId = this.refId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediRcvRsndRqstDt = this.ediRcvRsndRqstDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3ptyCurrCd = this.n3ptyCurrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspRqstBkgFlg = this.trspRqstBkgFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspSoOfcCtyCd = this.trspSoOfcCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mtyRroIssDt = this.mtyRroIssDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqNo = this.eqNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prntTrspSoSeq = this.prntTrspSoSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creOfcCd = this.creOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mtyRdeOrdIssUsrId = this.mtyRdeOrdIssUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spclInstrRmk = this.spclInstrRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediRcvRsltMsg = this.ediRcvRsltMsg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ovrWgtScgAmt = this.ovrWgtScgAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fincSkdVoyNo = this.fincSkdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspPurpRsn = this.trspPurpRsn .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mtyRroIssFlg = this.mtyRroIssFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.repoPlnId = this.repoPlnId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.troCfmUpdDt = this.troCfmUpdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.avalDt = this.avalDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.destGateInDt = this.destGateInDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fincVvdCd = this.fincVvdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custNomiTrkrFlg = this.custNomiTrkrFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
