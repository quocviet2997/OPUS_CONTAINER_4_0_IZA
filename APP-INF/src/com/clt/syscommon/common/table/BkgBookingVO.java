/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgBookingVO.java
*@FileTitle : BkgBookingVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.10.26
*@LastModifier : 최영희
*@LastVersion : 1.0
* 2009.10.26 최영희 
* 1.0 Creation
 * --------------------------------------------------------
 * History 
 * 2014.09.02 김태균 ESM_BKG_0079_01 화면중 Vendor Remark 개발
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
 * @author 최영희
 * @since J2EE 1.6
 * @see AbstractValueObject
 */
public class BkgBookingVO extends AbstractValueObject {

    private static final long serialVersionUID = 1L;

    private Collection<BkgBookingVO> models = new ArrayList<BkgBookingVO>();

    /* Column Info */
    private String bkgCgoTpCd = null;

    /* Column Info */
    private String orgTrnsModCd = null;

    /* Column Info */
    private String svcScpCd = null;

    /* Column Info */
    private String mtyPkupYdCd = null;

    /* Column Info */
    private String agmtActCntCd = null;

    /* Page Number */
    private String pagerows = null;

    /* Column Info */
    private String obSrepCd = null;

    /* Column Info */
    private String destTrnsSvcModCd = null;

    /* Column Info */
    private String shpBakFlg = null;

    /* Column Info */
    private String ctrtOfcCd = null;

    /* Column Info */
    private String bkgCreDt = null;

    /* Column Info */
    private String stwgRmk = null;

    /* Column Info */
    private String stwgCd = null;

    /* Column Info */
    private String siFlg = null;

    /* Column Info */
    private String chnAgnCd = null;

    /* Column Info */
    private String updUsrId = null;

    /* Column Info */
    private String hcmtCmbFlg = null;

    /* Column Info */
    private String bkgOfcCd = null;

    /* Column Info */
    private String mnlBkgNoFlg = null;

    /* Column Info */
    private String blIssBlckFlg = null;

    /* Column Info */
    private String dblBkgFlg = null;

    /* Column Info */
    private String xterSiRefNo = null;

    /* Column Info */
    private String agmtActCustSeq = null;

    /* Column Info */
    private String orgScontiCd = null;

    /* Column Info */
    private String skdVoyNo = null;

    /* Column Info */
    private String fullRtnYdCd = null;

    /* Column Info */
    private String splitRto = null;

    /* Column Info */
    private String podCd = null;

    /* Column Info */
    private String deDueDt = null;

    /* Column Info */
    private String lodgDueDt = null;

    /* Column Info */
    private String bkgNo = null;

    /* Column Info */
    private String podNodCd = null;

    /* Column Info */
    private String wtRsnHldFlg = null;

    /* Column Info */
    private String mtyPreVvdFlg = null;

    /* Column Info */
    private String toBkgNo = null;

    /* Column Info */
    private String fmBkgNo = null;

    /* Column Info */
    private String ctrtSrepCd = null;

    /* Column Info */
    private String spclHideFlg = null;

    /* Column Info */
    private String rcFlg = null;

    /* Column Info */
    private String splitRsnCd = null;

    /* Column Info */
    private String ibDelDeGdt = null;

    /* Column Info */
    private String destTrnsModCd = null;

    /* Column Info */
    private String stopOffLocCd = null;

    /* Column Info */
    private String rdCgoFlg = null;

    /* Column Info */
    private String bkgStsCd = null;

    /* Column Info */
    private String fdGrdFlg = null;

    /* Column Info */
    private String ovrVoidSltQty = null;

    /* Column Info */
    private String xterSiKnt = null;

    /* Column Info */
    private String mtySplitAvalCd = null;

    /* Column Info */
    private String interRmk = null;

    /* Column Info */
    private String scacCd = null;

    /* Column Info */
    private String cmdtCd = null;

    /* Column Info */
    private String apBrogFlg = null;

    /* Column Info */
    private String fullPkupYdCd = null;

    /* Column Info */
    private String bkgCxlDt = null;

    /* Column Info */
    private String ibSlsOfcCd = null;

    /* Column Info */
    private String altCustCfmFlg = null;

    /* Column Info */
    private String stopOffCntcPsonNm = null;

    /* Column Info */
    private String porNodCd = null;

    /* Column Info */
    private String samCneeNtfyFlg = null;

    /* Column Info */
    private String xterRqstAutoNtcFlg = null;

    /* Column Info */
    private String bkgCreGdt = null;

    /* Column Info */
    private String destScontiCd = null;

    /* Column Info */
    private String mtyDorArrDt = null;

    /* Column Info */
    private String bkgCreTpCd = null;

    /* Column Info */
    private String slanCd = null;

    /* Column Info */
    private String taaNo = null;

    /* Column Info */
    private String flexHgtFlg = null;

    /* Column Info */
    private String bkgCxlGdt = null;

    /* Column Info */
    private String repCmdtCd = null;

    /* Column Info */
    private String vslCd = null;

    /* Column Info */
    private String mtyBkgStsCd = null;

    /* Column Info */
    private String caInspDueDt = null;

    /* Column Info */
    private String ibDelDeDt = null;

    /* Column Info */
    private String ocpCd = null;

    /* Column Info */
    private String interRmkAudFlg = null;

    /* Column Info */
    private String blckStwgCd = null;

    /* Column Info */
    private String blckStwgFlg = null;

    /* Column Info */
    private String polEtdDt = null;

    /* Column Info */
    private String blNo = null;

    /* Column Info */
    private String pctlNo = null;

    /* Column Info */
    private String xterRqstCustRmk = null;

    /* Column Info */
    private String polCd = null;

    /* Column Info */
    private String scNo = null;

    /* Column Info */
    private String prctFlg = null;

    /* Column Info */
    private String myFwrdCd = null;

    /* Column Info */
    private String blNoTp = null;

    /* Column Info */
    private String delNodCd = null;

    /* Column Info */
    private String obSlsOfcCd = null;

    /* Column Info */
    private String custToOrdFlg = null;

    /* Column Info */
    private String wtRsnSpclCgoFlg = null;

    /* Column Info */
    private String xterSiCd = null;

    /* Column Info */
    private String cndCstmsFileCd = null;

    /* Column Info */
    private String mtyPkupDt = null;

    /* Column Info */
    private String xterBkgRqstCd = null;

    /* Column Info */
    private String preRlyPortCd = null;

    /* Column Info */
    private String ctrtCustSeq = null;

    /* Column Info */
    private String portClzDt = null;

    /* Column Info */
    private String awkCgoFlg = null;

    /* Column Info */
    private String stopOffCntcPhnNo = null;

    /* Column Info */
    private String fnlDestCd = null;

    /* Column Info */
    private String delCd = null;

    /* Column Info */
    private String slsRhqCd = null;

    /* Column Info */
    private String creUsrId = null;

    /* Column Info */
    private String xterRmk = null;

    /* Column Info */
    private String xterBkgRqstRefNo = null;

    /* Column Info */
    private String pstRlyPortCd = null;

    /* Column Info */
    private String splitFlg = null;

    /* Column Info */
    private String porCd = null;

    /* Column Info */
    private String ctrtCustCntCd = null;

    /* Column Info */
    private String orgTrnsSvcModCd = null;

    /* Column Info */
    private String docUsrId = null;

    /* Column Info */
    private String eqCtrlOfcCd = null;

    /* Column Info */
    private String creDt = null;

    /* Column Info */
    private String advShtgCd = null;

    /* Column Info */
    private String stopOffDiffRmk = null;

    /* Column Info */
    private String eqSubstFlg = null;

    /* Column Info */
    private String hotDeFlg = null;

    /* Column Info */
    private String splitDt = null;

    /* Column Info */
    private String rfaNo = null;

    /* Column Info */
    private String revDirCd = null;

    /* VO Data Value( C:Creation, U:Update, D:Delete ) */
    private String ibflag = null;

    /* Column Info */
    private String railBlkCd = null;

    /* Column Info */
    private String bbCgoFlg = null;

    /* Column Info */
    private String dcgoFlg = null;

    /* Column Info */
    private String krCstmsCustTpCd = null;

    /* Column Info */
    private String mtyCreSvrCd = null;

    /* Column Info */
    private String rcvTermCd = null;

    /* Column Info */
    private String updDt = null;

    /* Column Info */
    private String splitGdt = null;

    /* Column Info */
    private String mtyPortFlg = null;

    /* Column Info */
    private String mtyPodFlg = null;

    /* Column Info */
    private String allMtrFlg = null;

    /* Column Info */
    private String polNodCd = null;

    /* Column Info */
    private String xterBkgKnt = null;

    /* Column Info */
    private String twnSoNo = null;

    /* Column Info */
    private String podEtaDt = null;

    /* Column Info */
    private String skdDirCd = null;

    /* Column Info */
    private String blTpCd = null;

    /* Column Info */
    private String usaCstmsFileCd = null;

    /* Column Info */
    private String socFlg = null;

    /* Column Info */
    private String deTermCd = null;

    /* Column Info */
    private String hngrFlg = null;

    /* Column Info */
    private String mtyRtnYdCd = null;

    /* Column Info */
    private String myFwrdVslDesc = null;

    /* Column Info */
    private String slsRgnOfcCd = null;

    /* Column Info */
    private String ediHldFlg = null;

    /* Column Info */
    private String vndrRmk = null;

    /* Column Info */
    private String bkgCtrlPtyCustCntCd = null;

    /* Column Info */
    private String bkgCtrlPtyCustSeq = null;

    /* Column Info */
    private String bkgWtChkFlg = null;

    /* Column Info */
    private String irrBlNoFlg = null;

    /* Column Info */
    private String bkgPtyCntCd = null;

    /* Column Info */
    private String bkgPtyCustSeq = null;
    
    /* Column Info */
    private String motNo = null;
    
    /* Column Info */
    private String rqstDt = null;
    
    /* Column Info */
    private String rqstGdt = null;
    
    /* Column Info */
    private String bkgAlocStsCd = null;
    
    /* Column Info */
    private String sbBkgGidCd = null;
    
    /* Column Info */
    private String sbBkgDirRmk = null;
    
    /* Column Info */
    private String cplsFrmFlg = null;
    
    /* Column Info */
    private String fnlGuidCd = null;
    
    /* Column Info */
    private String trCd = null;
    
    /* Column Info */
    private String sbBkgRoleCd = null;
    
    /* Column Info */
    private String sbDt = null;
    
    /* Column Info */
    private String sbFrmDt = null;

    /*	테이블 컬럼의 값을 저장하는 Hashtable */
    private HashMap<String, String> hashColumns = new HashMap<String, String>();

    /*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
    private HashMap<String, String> hashFields = new HashMap<String, String>();

    public BkgBookingVO() {
    }

    public BkgBookingVO(String ibflag, String pagerows, String bkgNo, String blNo, String blNoTp, String blTpCd, String bkgStsCd, String bkgCgoTpCd, String slanCd, String svcScpCd, String vslCd, String skdVoyNo, String skdDirCd, String revDirCd, String rcvTermCd, String deTermCd, String porCd, String porNodCd, String polCd, String polNodCd, String podCd, String podNodCd, String ocpCd, String delCd, String delNodCd, String fnlDestCd, String polEtdDt, String podEtaDt, String mtyPkupYdCd, String mtyPkupDt, String fullRtnYdCd, String fullPkupYdCd, String mtyRtnYdCd, String mtyDorArrDt, String lodgDueDt, String deDueDt, String ibDelDeDt, String orgTrnsSvcModCd, String orgTrnsModCd, String orgScontiCd, String destTrnsSvcModCd, String destTrnsModCd, String destScontiCd, String stopOffLocCd, String stopOffCntcPsonNm, String stopOffCntcPhnNo, String stopOffDiffRmk, String slsRhqCd, String slsRgnOfcCd, String bkgOfcCd, String docUsrId, String ctrtOfcCd, String ctrtSrepCd, String ctrtCustCntCd, String ctrtCustSeq, String obSlsOfcCd, String obSrepCd, String ibSlsOfcCd, String eqCtrlOfcCd, String bkgCreDt, String bkgCxlDt, String portClzDt, String cmdtCd, String repCmdtCd, String dcgoFlg, String rcFlg, String awkCgoFlg, String bbCgoFlg, String rdCgoFlg, String hngrFlg, String railBlkCd, String prctFlg, String spclHideFlg, String socFlg, String eqSubstFlg, String fdGrdFlg, String flexHgtFlg, String stwgCd, String stwgRmk, String blckStwgCd, String allMtrFlg, String hotDeFlg, String dblBkgFlg, String apBrogFlg, String custToOrdFlg, String krCstmsCustTpCd, String samCneeNtfyFlg, String altCustCfmFlg, String wtRsnSpclCgoFlg, String wtRsnHldFlg, String shpBakFlg, String mnlBkgNoFlg, String blIssBlckFlg, String caInspDueDt, String scacCd, String chnAgnCd, String usaCstmsFileCd, String cndCstmsFileCd, String twnSoNo, String interRmk, String xterRmk, String interRmkAudFlg, String splitFlg, String hcmtCmbFlg, String bkgCreTpCd, String toBkgNo, String fmBkgNo, String advShtgCd, String splitRsnCd, String splitRto, String splitDt, String scNo, String rfaNo, String agmtActCntCd, String agmtActCustSeq, String mtyCreSvrCd, String mtyBkgStsCd, String mtyPodFlg, String mtyPreVvdFlg, String mtyPortFlg, String mtySplitAvalCd, String xterBkgRqstCd, String xterBkgRqstRefNo, String siFlg, String xterSiCd, String xterSiRefNo, String xterRqstAutoNtcFlg, String xterBkgKnt, String xterSiKnt, String xterRqstCustRmk, String ovrVoidSltQty, String myFwrdCd, String myFwrdVslDesc, String preRlyPortCd, String pstRlyPortCd, String creUsrId, String creDt, String updUsrId, String updDt, String pctlNo, String ibDelDeGdt, String bkgCreGdt, String bkgCxlGdt, String splitGdt, String taaNo, String ediHldFlg, String vndrRmk, String bkgCtrlPtyCustCntCd, String bkgCtrlPtyCustSeq, String blckStwgFlg, String bkgWtChkFlg, String irrBlNoFlg, String bkgPtyCntCd, String bkgPtyCustSeq, String motNo, String rqstDt, String rqstGdt, String bkgAlocStsCd, String sbBkgGidCd, String sbBkgDirRmk, String cplsFrmFlg, String fnlGuidCd, String trCd, String sbBkgRoleCd, String sbDt, String sbFrmDt) {
        this.bkgCgoTpCd = bkgCgoTpCd;
        this.orgTrnsModCd = orgTrnsModCd;
        this.svcScpCd = svcScpCd;
        this.mtyPkupYdCd = mtyPkupYdCd;
        this.agmtActCntCd = agmtActCntCd;
        this.pagerows = pagerows;
        this.obSrepCd = obSrepCd;
        this.destTrnsSvcModCd = destTrnsSvcModCd;
        this.shpBakFlg = shpBakFlg;
        this.ctrtOfcCd = ctrtOfcCd;
        this.bkgCreDt = bkgCreDt;
        this.stwgRmk = stwgRmk;
        this.stwgCd = stwgCd;
        this.siFlg = siFlg;
        this.chnAgnCd = chnAgnCd;
        this.updUsrId = updUsrId;
        this.hcmtCmbFlg = hcmtCmbFlg;
        this.bkgOfcCd = bkgOfcCd;
        this.mnlBkgNoFlg = mnlBkgNoFlg;
        this.blIssBlckFlg = blIssBlckFlg;
        this.dblBkgFlg = dblBkgFlg;
        this.xterSiRefNo = xterSiRefNo;
        this.agmtActCustSeq = agmtActCustSeq;
        this.orgScontiCd = orgScontiCd;
        this.skdVoyNo = skdVoyNo;
        this.fullRtnYdCd = fullRtnYdCd;
        this.splitRto = splitRto;
        this.podCd = podCd;
        this.deDueDt = deDueDt;
        this.lodgDueDt = lodgDueDt;
        this.bkgNo = bkgNo;
        this.podNodCd = podNodCd;
        this.wtRsnHldFlg = wtRsnHldFlg;
        this.mtyPreVvdFlg = mtyPreVvdFlg;
        this.toBkgNo = toBkgNo;
        this.fmBkgNo = fmBkgNo;
        this.ctrtSrepCd = ctrtSrepCd;
        this.spclHideFlg = spclHideFlg;
        this.rcFlg = rcFlg;
        this.splitRsnCd = splitRsnCd;
        this.ibDelDeGdt = ibDelDeGdt;
        this.destTrnsModCd = destTrnsModCd;
        this.stopOffLocCd = stopOffLocCd;
        this.rdCgoFlg = rdCgoFlg;
        this.bkgStsCd = bkgStsCd;
        this.fdGrdFlg = fdGrdFlg;
        this.ovrVoidSltQty = ovrVoidSltQty;
        this.xterSiKnt = xterSiKnt;
        this.mtySplitAvalCd = mtySplitAvalCd;
        this.interRmk = interRmk;
        this.scacCd = scacCd;
        this.cmdtCd = cmdtCd;
        this.apBrogFlg = apBrogFlg;
        this.fullPkupYdCd = fullPkupYdCd;
        this.bkgCxlDt = bkgCxlDt;
        this.ibSlsOfcCd = ibSlsOfcCd;
        this.altCustCfmFlg = altCustCfmFlg;
        this.stopOffCntcPsonNm = stopOffCntcPsonNm;
        this.porNodCd = porNodCd;
        this.samCneeNtfyFlg = samCneeNtfyFlg;
        this.xterRqstAutoNtcFlg = xterRqstAutoNtcFlg;
        this.bkgCreGdt = bkgCreGdt;
        this.destScontiCd = destScontiCd;
        this.mtyDorArrDt = mtyDorArrDt;
        this.bkgCreTpCd = bkgCreTpCd;
        this.slanCd = slanCd;
        this.taaNo = taaNo;
        this.flexHgtFlg = flexHgtFlg;
        this.bkgCxlGdt = bkgCxlGdt;
        this.repCmdtCd = repCmdtCd;
        this.vslCd = vslCd;
        this.mtyBkgStsCd = mtyBkgStsCd;
        this.caInspDueDt = caInspDueDt;
        this.ibDelDeDt = ibDelDeDt;
        this.ocpCd = ocpCd;
        this.interRmkAudFlg = interRmkAudFlg;
        this.blckStwgCd = blckStwgCd;
        this.polEtdDt = polEtdDt;
        this.blNo = blNo;
        this.pctlNo = pctlNo;
        this.xterRqstCustRmk = xterRqstCustRmk;
        this.polCd = polCd;
        this.scNo = scNo;
        this.prctFlg = prctFlg;
        this.myFwrdCd = myFwrdCd;
        this.blNoTp = blNoTp;
        this.delNodCd = delNodCd;
        this.obSlsOfcCd = obSlsOfcCd;
        this.custToOrdFlg = custToOrdFlg;
        this.wtRsnSpclCgoFlg = wtRsnSpclCgoFlg;
        this.xterSiCd = xterSiCd;
        this.cndCstmsFileCd = cndCstmsFileCd;
        this.mtyPkupDt = mtyPkupDt;
        this.xterBkgRqstCd = xterBkgRqstCd;
        this.preRlyPortCd = preRlyPortCd;
        this.ctrtCustSeq = ctrtCustSeq;
        this.portClzDt = portClzDt;
        this.awkCgoFlg = awkCgoFlg;
        this.stopOffCntcPhnNo = stopOffCntcPhnNo;
        this.fnlDestCd = fnlDestCd;
        this.delCd = delCd;
        this.slsRhqCd = slsRhqCd;
        this.creUsrId = creUsrId;
        this.xterRmk = xterRmk;
        this.xterBkgRqstRefNo = xterBkgRqstRefNo;
        this.pstRlyPortCd = pstRlyPortCd;
        this.splitFlg = splitFlg;
        this.porCd = porCd;
        this.ctrtCustCntCd = ctrtCustCntCd;
        this.orgTrnsSvcModCd = orgTrnsSvcModCd;
        this.docUsrId = docUsrId;
        this.eqCtrlOfcCd = eqCtrlOfcCd;
        this.creDt = creDt;
        this.advShtgCd = advShtgCd;
        this.stopOffDiffRmk = stopOffDiffRmk;
        this.eqSubstFlg = eqSubstFlg;
        this.hotDeFlg = hotDeFlg;
        this.splitDt = splitDt;
        this.rfaNo = rfaNo;
        this.revDirCd = revDirCd;
        this.ibflag = ibflag;
        this.railBlkCd = railBlkCd;
        this.bbCgoFlg = bbCgoFlg;
        this.dcgoFlg = dcgoFlg;
        this.krCstmsCustTpCd = krCstmsCustTpCd;
        this.mtyCreSvrCd = mtyCreSvrCd;
        this.rcvTermCd = rcvTermCd;
        this.updDt = updDt;
        this.splitGdt = splitGdt;
        this.mtyPortFlg = mtyPortFlg;
        this.mtyPodFlg = mtyPodFlg;
        this.allMtrFlg = allMtrFlg;
        this.polNodCd = polNodCd;
        this.xterBkgKnt = xterBkgKnt;
        this.twnSoNo = twnSoNo;
        this.podEtaDt = podEtaDt;
        this.skdDirCd = skdDirCd;
        this.blTpCd = blTpCd;
        this.usaCstmsFileCd = usaCstmsFileCd;
        this.socFlg = socFlg;
        this.deTermCd = deTermCd;
        this.hngrFlg = hngrFlg;
        this.mtyRtnYdCd = mtyRtnYdCd;
        this.myFwrdVslDesc = myFwrdVslDesc;
        this.slsRgnOfcCd = slsRgnOfcCd;
        this.ediHldFlg = ediHldFlg;
        this.vndrRmk = vndrRmk;
        this.bkgCtrlPtyCustCntCd = bkgCtrlPtyCustCntCd;
        this.bkgCtrlPtyCustSeq = bkgCtrlPtyCustSeq;
        this.blckStwgFlg = blckStwgFlg;
        this.bkgWtChkFlg = bkgWtChkFlg;
        this.irrBlNoFlg = irrBlNoFlg;
        this.bkgPtyCntCd = bkgPtyCntCd;
        this.bkgPtyCustSeq = bkgPtyCustSeq;
        this.motNo = motNo;
        this.rqstDt = rqstDt;
        this.rqstGdt = rqstGdt;
        this.bkgAlocStsCd = bkgAlocStsCd;
        this.sbBkgGidCd = sbBkgGidCd;
        this.sbBkgDirRmk = sbBkgDirRmk;
        this.cplsFrmFlg = cplsFrmFlg;
        this.fnlGuidCd = fnlGuidCd;
        this.trCd = trCd;
        this.sbBkgRoleCd = sbBkgRoleCd;
        this.sbDt = sbDt;
        this.sbFrmDt = sbFrmDt;
    }

    /**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
    public HashMap<String, String> getColumnValues() {
        this.hashColumns.put("bkg_cgo_tp_cd", getBkgCgoTpCd());
        this.hashColumns.put("org_trns_mod_cd", getOrgTrnsModCd());
        this.hashColumns.put("svc_scp_cd", getSvcScpCd());
        this.hashColumns.put("mty_pkup_yd_cd", getMtyPkupYdCd());
        this.hashColumns.put("agmt_act_cnt_cd", getAgmtActCntCd());
        this.hashColumns.put("pagerows", getPagerows());
        this.hashColumns.put("ob_srep_cd", getObSrepCd());
        this.hashColumns.put("dest_trns_svc_mod_cd", getDestTrnsSvcModCd());
        this.hashColumns.put("shp_bak_flg", getShpBakFlg());
        this.hashColumns.put("ctrt_ofc_cd", getCtrtOfcCd());
        this.hashColumns.put("bkg_cre_dt", getBkgCreDt());
        this.hashColumns.put("stwg_rmk", getStwgRmk());
        this.hashColumns.put("stwg_cd", getStwgCd());
        this.hashColumns.put("si_flg", getSiFlg());
        this.hashColumns.put("chn_agn_cd", getChnAgnCd());
        this.hashColumns.put("upd_usr_id", getUpdUsrId());
        this.hashColumns.put("hcmt_cmb_flg", getHcmtCmbFlg());
        this.hashColumns.put("bkg_ofc_cd", getBkgOfcCd());
        this.hashColumns.put("mnl_bkg_no_flg", getMnlBkgNoFlg());
        this.hashColumns.put("bl_iss_blck_flg", getBlIssBlckFlg());
        this.hashColumns.put("dbl_bkg_flg", getDblBkgFlg());
        this.hashColumns.put("xter_si_ref_no", getXterSiRefNo());
        this.hashColumns.put("agmt_act_cust_seq", getAgmtActCustSeq());
        this.hashColumns.put("org_sconti_cd", getOrgScontiCd());
        this.hashColumns.put("skd_voy_no", getSkdVoyNo());
        this.hashColumns.put("full_rtn_yd_cd", getFullRtnYdCd());
        this.hashColumns.put("split_rto", getSplitRto());
        this.hashColumns.put("pod_cd", getPodCd());
        this.hashColumns.put("de_due_dt", getDeDueDt());
        this.hashColumns.put("lodg_due_dt", getLodgDueDt());
        this.hashColumns.put("bkg_no", getBkgNo());
        this.hashColumns.put("pod_nod_cd", getPodNodCd());
        this.hashColumns.put("wt_rsn_hld_flg", getWtRsnHldFlg());
        this.hashColumns.put("mty_pre_vvd_flg", getMtyPreVvdFlg());
        this.hashColumns.put("to_bkg_no", getToBkgNo());
        this.hashColumns.put("fm_bkg_no", getFmBkgNo());
        this.hashColumns.put("ctrt_srep_cd", getCtrtSrepCd());
        this.hashColumns.put("spcl_hide_flg", getSpclHideFlg());
        this.hashColumns.put("rc_flg", getRcFlg());
        this.hashColumns.put("split_rsn_cd", getSplitRsnCd());
        this.hashColumns.put("ib_del_de_gdt", getIbDelDeGdt());
        this.hashColumns.put("dest_trns_mod_cd", getDestTrnsModCd());
        this.hashColumns.put("stop_off_loc_cd", getStopOffLocCd());
        this.hashColumns.put("rd_cgo_flg", getRdCgoFlg());
        this.hashColumns.put("bkg_sts_cd", getBkgStsCd());
        this.hashColumns.put("fd_grd_flg", getFdGrdFlg());
        this.hashColumns.put("ovr_void_slt_qty", getOvrVoidSltQty());
        this.hashColumns.put("xter_si_knt", getXterSiKnt());
        this.hashColumns.put("mty_split_aval_cd", getMtySplitAvalCd());
        this.hashColumns.put("inter_rmk", getInterRmk());
        this.hashColumns.put("scac_cd", getScacCd());
        this.hashColumns.put("cmdt_cd", getCmdtCd());
        this.hashColumns.put("ap_brog_flg", getApBrogFlg());
        this.hashColumns.put("full_pkup_yd_cd", getFullPkupYdCd());
        this.hashColumns.put("bkg_cxl_dt", getBkgCxlDt());
        this.hashColumns.put("ib_sls_ofc_cd", getIbSlsOfcCd());
        this.hashColumns.put("alt_cust_cfm_flg", getAltCustCfmFlg());
        this.hashColumns.put("stop_off_cntc_pson_nm", getStopOffCntcPsonNm());
        this.hashColumns.put("por_nod_cd", getPorNodCd());
        this.hashColumns.put("sam_cnee_ntfy_flg", getSamCneeNtfyFlg());
        this.hashColumns.put("xter_rqst_auto_ntc_flg", getXterRqstAutoNtcFlg());
        this.hashColumns.put("bkg_cre_gdt", getBkgCreGdt());
        this.hashColumns.put("dest_sconti_cd", getDestScontiCd());
        this.hashColumns.put("mty_dor_arr_dt", getMtyDorArrDt());
        this.hashColumns.put("bkg_cre_tp_cd", getBkgCreTpCd());
        this.hashColumns.put("slan_cd", getSlanCd());
        this.hashColumns.put("taa_no", getTaaNo());
        this.hashColumns.put("flex_hgt_flg", getFlexHgtFlg());
        this.hashColumns.put("bkg_cxl_gdt", getBkgCxlGdt());
        this.hashColumns.put("rep_cmdt_cd", getRepCmdtCd());
        this.hashColumns.put("vsl_cd", getVslCd());
        this.hashColumns.put("mty_bkg_sts_cd", getMtyBkgStsCd());
        this.hashColumns.put("ca_insp_due_dt", getCaInspDueDt());
        this.hashColumns.put("ib_del_de_dt", getIbDelDeDt());
        this.hashColumns.put("ocp_cd", getOcpCd());
        this.hashColumns.put("inter_rmk_aud_flg", getInterRmkAudFlg());
        this.hashColumns.put("blck_stwg_cd", getBlckStwgCd());
        this.hashColumns.put("pol_etd_dt", getPolEtdDt());
        this.hashColumns.put("bl_no", getBlNo());
        this.hashColumns.put("pctl_no", getPctlNo());
        this.hashColumns.put("xter_rqst_cust_rmk", getXterRqstCustRmk());
        this.hashColumns.put("pol_cd", getPolCd());
        this.hashColumns.put("sc_no", getScNo());
        this.hashColumns.put("prct_flg", getPrctFlg());
        this.hashColumns.put("my_fwrd_cd", getMyFwrdCd());
        this.hashColumns.put("bl_no_tp", getBlNoTp());
        this.hashColumns.put("del_nod_cd", getDelNodCd());
        this.hashColumns.put("ob_sls_ofc_cd", getObSlsOfcCd());
        this.hashColumns.put("cust_to_ord_flg", getCustToOrdFlg());
        this.hashColumns.put("wt_rsn_spcl_cgo_flg", getWtRsnSpclCgoFlg());
        this.hashColumns.put("xter_si_cd", getXterSiCd());
        this.hashColumns.put("cnd_cstms_file_cd", getCndCstmsFileCd());
        this.hashColumns.put("mty_pkup_dt", getMtyPkupDt());
        this.hashColumns.put("xter_bkg_rqst_cd", getXterBkgRqstCd());
        this.hashColumns.put("pre_rly_port_cd", getPreRlyPortCd());
        this.hashColumns.put("ctrt_cust_seq", getCtrtCustSeq());
        this.hashColumns.put("port_clz_dt", getPortClzDt());
        this.hashColumns.put("awk_cgo_flg", getAwkCgoFlg());
        this.hashColumns.put("stop_off_cntc_phn_no", getStopOffCntcPhnNo());
        this.hashColumns.put("fnl_dest_cd", getFnlDestCd());
        this.hashColumns.put("del_cd", getDelCd());
        this.hashColumns.put("sls_rhq_cd", getSlsRhqCd());
        this.hashColumns.put("cre_usr_id", getCreUsrId());
        this.hashColumns.put("xter_rmk", getXterRmk());
        this.hashColumns.put("xter_bkg_rqst_ref_no", getXterBkgRqstRefNo());
        this.hashColumns.put("pst_rly_port_cd", getPstRlyPortCd());
        this.hashColumns.put("split_flg", getSplitFlg());
        this.hashColumns.put("por_cd", getPorCd());
        this.hashColumns.put("ctrt_cust_cnt_cd", getCtrtCustCntCd());
        this.hashColumns.put("org_trns_svc_mod_cd", getOrgTrnsSvcModCd());
        this.hashColumns.put("doc_usr_id", getDocUsrId());
        this.hashColumns.put("eq_ctrl_ofc_cd", getEqCtrlOfcCd());
        this.hashColumns.put("cre_dt", getCreDt());
        this.hashColumns.put("adv_shtg_cd", getAdvShtgCd());
        this.hashColumns.put("stop_off_diff_rmk", getStopOffDiffRmk());
        this.hashColumns.put("eq_subst_flg", getEqSubstFlg());
        this.hashColumns.put("hot_de_flg", getHotDeFlg());
        this.hashColumns.put("split_dt", getSplitDt());
        this.hashColumns.put("rfa_no", getRfaNo());
        this.hashColumns.put("rev_dir_cd", getRevDirCd());
        this.hashColumns.put("ibflag", getIbflag());
        this.hashColumns.put("rail_blk_cd", getRailBlkCd());
        this.hashColumns.put("bb_cgo_flg", getBbCgoFlg());
        this.hashColumns.put("dcgo_flg", getDcgoFlg());
        this.hashColumns.put("kr_cstms_cust_tp_cd", getKrCstmsCustTpCd());
        this.hashColumns.put("mty_cre_svr_cd", getMtyCreSvrCd());
        this.hashColumns.put("rcv_term_cd", getRcvTermCd());
        this.hashColumns.put("upd_dt", getUpdDt());
        this.hashColumns.put("split_gdt", getSplitGdt());
        this.hashColumns.put("mty_port_flg", getMtyPortFlg());
        this.hashColumns.put("mty_pod_flg", getMtyPodFlg());
        this.hashColumns.put("all_mtr_flg", getAllMtrFlg());
        this.hashColumns.put("pol_nod_cd", getPolNodCd());
        this.hashColumns.put("xter_bkg_knt", getXterBkgKnt());
        this.hashColumns.put("twn_so_no", getTwnSoNo());
        this.hashColumns.put("pod_eta_dt", getPodEtaDt());
        this.hashColumns.put("skd_dir_cd", getSkdDirCd());
        this.hashColumns.put("bl_tp_cd", getBlTpCd());
        this.hashColumns.put("usa_cstms_file_cd", getUsaCstmsFileCd());
        this.hashColumns.put("soc_flg", getSocFlg());
        this.hashColumns.put("de_term_cd", getDeTermCd());
        this.hashColumns.put("hngr_flg", getHngrFlg());
        this.hashColumns.put("mty_rtn_yd_cd", getMtyRtnYdCd());
        this.hashColumns.put("my_fwrd_vsl_desc", getMyFwrdVslDesc());
        this.hashColumns.put("sls_rgn_ofc_cd", getSlsRgnOfcCd());
        this.hashColumns.put("edi_hld_flg", getEdiHldFlg());
        this.hashColumns.put("vndr_rmk", getVndrRmk());
        this.hashColumns.put("bkg_ctrl_pty_cust_cnt_cd", getBkgCtrlPtyCustCntCd());
        this.hashColumns.put("bkg_ctrl_pty_cust_seq", getBkgCtrlPtyCustSeq());
        this.hashColumns.put("blck_stwg_flg", getBlckStwgFlg());
        this.hashColumns.put("bkg_wt_chk_flg", getBkgWtChkFlg());
        this.hashColumns.put("irr_bl_no_flg", getIrrBlNoFlg());
        this.hashColumns.put("bkg_pty_cnt_cd", getBkgPtyCntCd());
        this.hashColumns.put("bkg_pty_cust_seq", getBkgPtyCustSeq());
        this.hashColumns.put("mot_no", getMotNo());
        this.hashColumns.put("rqst_dt", getRqstDt());
        this.hashColumns.put("rqst_gdt", getRqstGdt());
        this.hashColumns.put("bkg_aloc_sts_cd", getBkgAlocStsCd());
        this.hashColumns.put("sb_bkg_gid_cd", getSbBkgGidCd());
        this.hashColumns.put("sb_bkg_dir_rmk", getSbBkgDirRmk());
        this.hashColumns.put("cpls_frm_flg", getCplsFrmFlg());
        this.hashColumns.put("fnl_guid_cd", getFnlGuidCd());
        this.hashColumns.put("tr_cd", getTrCd());
        this.hashColumns.put("sb_bkg_role_cd", getSbBkgRoleCd());
        this.hashColumns.put("sb_dt", getSbDt());
        this.hashColumns.put("sb_frm_dt", getSbFrmDt());
        return this.hashColumns;
    }

    /**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
    public HashMap<String, String> getFieldNames() {
        this.hashFields.put("bkg_cgo_tp_cd", "bkgCgoTpCd");
        this.hashFields.put("org_trns_mod_cd", "orgTrnsModCd");
        this.hashFields.put("svc_scp_cd", "svcScpCd");
        this.hashFields.put("mty_pkup_yd_cd", "mtyPkupYdCd");
        this.hashFields.put("agmt_act_cnt_cd", "agmtActCntCd");
        this.hashFields.put("pagerows", "pagerows");
        this.hashFields.put("ob_srep_cd", "obSrepCd");
        this.hashFields.put("dest_trns_svc_mod_cd", "destTrnsSvcModCd");
        this.hashFields.put("shp_bak_flg", "shpBakFlg");
        this.hashFields.put("ctrt_ofc_cd", "ctrtOfcCd");
        this.hashFields.put("bkg_cre_dt", "bkgCreDt");
        this.hashFields.put("stwg_rmk", "stwgRmk");
        this.hashFields.put("stwg_cd", "stwgCd");
        this.hashFields.put("si_flg", "siFlg");
        this.hashFields.put("chn_agn_cd", "chnAgnCd");
        this.hashFields.put("upd_usr_id", "updUsrId");
        this.hashFields.put("hcmt_cmb_flg", "hcmtCmbFlg");
        this.hashFields.put("bkg_ofc_cd", "bkgOfcCd");
        this.hashFields.put("mnl_bkg_no_flg", "mnlBkgNoFlg");
        this.hashFields.put("bl_iss_blck_flg", "blIssBlckFlg");
        this.hashFields.put("dbl_bkg_flg", "dblBkgFlg");
        this.hashFields.put("xter_si_ref_no", "xterSiRefNo");
        this.hashFields.put("agmt_act_cust_seq", "agmtActCustSeq");
        this.hashFields.put("org_sconti_cd", "orgScontiCd");
        this.hashFields.put("skd_voy_no", "skdVoyNo");
        this.hashFields.put("full_rtn_yd_cd", "fullRtnYdCd");
        this.hashFields.put("split_rto", "splitRto");
        this.hashFields.put("pod_cd", "podCd");
        this.hashFields.put("de_due_dt", "deDueDt");
        this.hashFields.put("lodg_due_dt", "lodgDueDt");
        this.hashFields.put("bkg_no", "bkgNo");
        this.hashFields.put("pod_nod_cd", "podNodCd");
        this.hashFields.put("wt_rsn_hld_flg", "wtRsnHldFlg");
        this.hashFields.put("mty_pre_vvd_flg", "mtyPreVvdFlg");
        this.hashFields.put("to_bkg_no", "toBkgNo");
        this.hashFields.put("fm_bkg_no", "fmBkgNo");
        this.hashFields.put("ctrt_srep_cd", "ctrtSrepCd");
        this.hashFields.put("spcl_hide_flg", "spclHideFlg");
        this.hashFields.put("rc_flg", "rcFlg");
        this.hashFields.put("split_rsn_cd", "splitRsnCd");
        this.hashFields.put("ib_del_de_gdt", "ibDelDeGdt");
        this.hashFields.put("dest_trns_mod_cd", "destTrnsModCd");
        this.hashFields.put("stop_off_loc_cd", "stopOffLocCd");
        this.hashFields.put("rd_cgo_flg", "rdCgoFlg");
        this.hashFields.put("bkg_sts_cd", "bkgStsCd");
        this.hashFields.put("fd_grd_flg", "fdGrdFlg");
        this.hashFields.put("ovr_void_slt_qty", "ovrVoidSltQty");
        this.hashFields.put("xter_si_knt", "xterSiKnt");
        this.hashFields.put("mty_split_aval_cd", "mtySplitAvalCd");
        this.hashFields.put("inter_rmk", "interRmk");
        this.hashFields.put("scac_cd", "scacCd");
        this.hashFields.put("cmdt_cd", "cmdtCd");
        this.hashFields.put("ap_brog_flg", "apBrogFlg");
        this.hashFields.put("full_pkup_yd_cd", "fullPkupYdCd");
        this.hashFields.put("bkg_cxl_dt", "bkgCxlDt");
        this.hashFields.put("ib_sls_ofc_cd", "ibSlsOfcCd");
        this.hashFields.put("alt_cust_cfm_flg", "altCustCfmFlg");
        this.hashFields.put("stop_off_cntc_pson_nm", "stopOffCntcPsonNm");
        this.hashFields.put("por_nod_cd", "porNodCd");
        this.hashFields.put("sam_cnee_ntfy_flg", "samCneeNtfyFlg");
        this.hashFields.put("xter_rqst_auto_ntc_flg", "xterRqstAutoNtcFlg");
        this.hashFields.put("bkg_cre_gdt", "bkgCreGdt");
        this.hashFields.put("dest_sconti_cd", "destScontiCd");
        this.hashFields.put("mty_dor_arr_dt", "mtyDorArrDt");
        this.hashFields.put("bkg_cre_tp_cd", "bkgCreTpCd");
        this.hashFields.put("slan_cd", "slanCd");
        this.hashFields.put("taa_no", "taaNo");
        this.hashFields.put("flex_hgt_flg", "flexHgtFlg");
        this.hashFields.put("bkg_cxl_gdt", "bkgCxlGdt");
        this.hashFields.put("rep_cmdt_cd", "repCmdtCd");
        this.hashFields.put("vsl_cd", "vslCd");
        this.hashFields.put("mty_bkg_sts_cd", "mtyBkgStsCd");
        this.hashFields.put("ca_insp_due_dt", "caInspDueDt");
        this.hashFields.put("ib_del_de_dt", "ibDelDeDt");
        this.hashFields.put("ocp_cd", "ocpCd");
        this.hashFields.put("inter_rmk_aud_flg", "interRmkAudFlg");
        this.hashFields.put("blck_stwg_cd", "blckStwgCd");
        this.hashFields.put("pol_etd_dt", "polEtdDt");
        this.hashFields.put("bl_no", "blNo");
        this.hashFields.put("pctl_no", "pctlNo");
        this.hashFields.put("xter_rqst_cust_rmk", "xterRqstCustRmk");
        this.hashFields.put("pol_cd", "polCd");
        this.hashFields.put("sc_no", "scNo");
        this.hashFields.put("prct_flg", "prctFlg");
        this.hashFields.put("my_fwrd_cd", "myFwrdCd");
        this.hashFields.put("bl_no_tp", "blNoTp");
        this.hashFields.put("del_nod_cd", "delNodCd");
        this.hashFields.put("ob_sls_ofc_cd", "obSlsOfcCd");
        this.hashFields.put("cust_to_ord_flg", "custToOrdFlg");
        this.hashFields.put("wt_rsn_spcl_cgo_flg", "wtRsnSpclCgoFlg");
        this.hashFields.put("xter_si_cd", "xterSiCd");
        this.hashFields.put("cnd_cstms_file_cd", "cndCstmsFileCd");
        this.hashFields.put("mty_pkup_dt", "mtyPkupDt");
        this.hashFields.put("xter_bkg_rqst_cd", "xterBkgRqstCd");
        this.hashFields.put("pre_rly_port_cd", "preRlyPortCd");
        this.hashFields.put("ctrt_cust_seq", "ctrtCustSeq");
        this.hashFields.put("port_clz_dt", "portClzDt");
        this.hashFields.put("awk_cgo_flg", "awkCgoFlg");
        this.hashFields.put("stop_off_cntc_phn_no", "stopOffCntcPhnNo");
        this.hashFields.put("fnl_dest_cd", "fnlDestCd");
        this.hashFields.put("del_cd", "delCd");
        this.hashFields.put("sls_rhq_cd", "slsRhqCd");
        this.hashFields.put("cre_usr_id", "creUsrId");
        this.hashFields.put("xter_rmk", "xterRmk");
        this.hashFields.put("xter_bkg_rqst_ref_no", "xterBkgRqstRefNo");
        this.hashFields.put("pst_rly_port_cd", "pstRlyPortCd");
        this.hashFields.put("split_flg", "splitFlg");
        this.hashFields.put("por_cd", "porCd");
        this.hashFields.put("ctrt_cust_cnt_cd", "ctrtCustCntCd");
        this.hashFields.put("org_trns_svc_mod_cd", "orgTrnsSvcModCd");
        this.hashFields.put("doc_usr_id", "docUsrId");
        this.hashFields.put("eq_ctrl_ofc_cd", "eqCtrlOfcCd");
        this.hashFields.put("cre_dt", "creDt");
        this.hashFields.put("adv_shtg_cd", "advShtgCd");
        this.hashFields.put("stop_off_diff_rmk", "stopOffDiffRmk");
        this.hashFields.put("eq_subst_flg", "eqSubstFlg");
        this.hashFields.put("hot_de_flg", "hotDeFlg");
        this.hashFields.put("split_dt", "splitDt");
        this.hashFields.put("rfa_no", "rfaNo");
        this.hashFields.put("rev_dir_cd", "revDirCd");
        this.hashFields.put("ibflag", "ibflag");
        this.hashFields.put("rail_blk_cd", "railBlkCd");
        this.hashFields.put("bb_cgo_flg", "bbCgoFlg");
        this.hashFields.put("dcgo_flg", "dcgoFlg");
        this.hashFields.put("kr_cstms_cust_tp_cd", "krCstmsCustTpCd");
        this.hashFields.put("mty_cre_svr_cd", "mtyCreSvrCd");
        this.hashFields.put("rcv_term_cd", "rcvTermCd");
        this.hashFields.put("upd_dt", "updDt");
        this.hashFields.put("split_gdt", "splitGdt");
        this.hashFields.put("mty_port_flg", "mtyPortFlg");
        this.hashFields.put("mty_pod_flg", "mtyPodFlg");
        this.hashFields.put("all_mtr_flg", "allMtrFlg");
        this.hashFields.put("pol_nod_cd", "polNodCd");
        this.hashFields.put("xter_bkg_knt", "xterBkgKnt");
        this.hashFields.put("twn_so_no", "twnSoNo");
        this.hashFields.put("pod_eta_dt", "podEtaDt");
        this.hashFields.put("skd_dir_cd", "skdDirCd");
        this.hashFields.put("bl_tp_cd", "blTpCd");
        this.hashFields.put("usa_cstms_file_cd", "usaCstmsFileCd");
        this.hashFields.put("soc_flg", "socFlg");
        this.hashFields.put("de_term_cd", "deTermCd");
        this.hashFields.put("hngr_flg", "hngrFlg");
        this.hashFields.put("mty_rtn_yd_cd", "mtyRtnYdCd");
        this.hashFields.put("my_fwrd_vsl_desc", "myFwrdVslDesc");
        this.hashFields.put("sls_rgn_ofc_cd", "slsRgnOfcCd");
        this.hashFields.put("edi_hld_flg", "ediHldFlg");
        this.hashFields.put("vndr_rmk", "vndrRmk");
        this.hashFields.put("bkg_ctrl_pty_cust_cnt_cd", "bkgCtrlPtyCustCntCd");
        this.hashFields.put("bkg_ctrl_pty_cust_seq", "bkgCtrlPtyCustSeq");
        this.hashFields.put("blck_stwg_flg", "blckStwgFlg");
        this.hashFields.put("bkg_wt_chk_flg", "bkgWtChkFlg");
        this.hashFields.put("irr_bl_no_flg", "irrBlNoFlg");
        this.hashFields.put("bkg_pty_cnt_cd", "bkgPtyCntCd");
        this.hashFields.put("bkg_pty_cust_seq", "bkgPtyCustSeq");
        this.hashFields.put("mot_no", "motNo");
        this.hashFields.put("rqst_dt", "rqstDt");
        this.hashFields.put("rqst_gdt", "rqstGdt");
        this.hashFields.put("bkg_aloc_sts_cd", "bkgAlocStsCd");
        this.hashFields.put("sb_bkg_gid_cd", "sbBkgGidCd");
        this.hashFields.put("sb_bkg_dir_rmk", "sbBkgDirRmk");
        this.hashFields.put("cpls_frm_flg", "cplsFrmFlg");
        this.hashFields.put("fnl_guid_cd", "fnlGuidCd");
        this.hashFields.put("tr_cd", "trCd");
        this.hashFields.put("sb_bkg_role_cd", "sbBkgRoleCd");
        this.hashFields.put("sb_dt", "sbDt");
        this.hashFields.put("sb_frm_dt", "sbFrmDt");
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
	 * @return orgTrnsModCd
	 */
    public String getOrgTrnsModCd() {
        return this.orgTrnsModCd;
    }

    /**
	 * Column Info
	 * @return svcScpCd
	 */
    public String getSvcScpCd() {
        return this.svcScpCd;
    }

    /**
	 * Column Info
	 * @return mtyPkupYdCd
	 */
    public String getMtyPkupYdCd() {
        return this.mtyPkupYdCd;
    }

    /**
	 * Column Info
	 * @return agmtActCntCd
	 */
    public String getAgmtActCntCd() {
        return this.agmtActCntCd;
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
	 * @return obSrepCd
	 */
    public String getObSrepCd() {
        return this.obSrepCd;
    }

    /**
	 * Column Info
	 * @return destTrnsSvcModCd
	 */
    public String getDestTrnsSvcModCd() {
        return this.destTrnsSvcModCd;
    }

    /**
	 * Column Info
	 * @return shpBakFlg
	 */
    public String getShpBakFlg() {
        return this.shpBakFlg;
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
	 * @return bkgCreDt
	 */
    public String getBkgCreDt() {
        return this.bkgCreDt;
    }

    /**
	 * Column Info
	 * @return stwgRmk
	 */
    public String getStwgRmk() {
        return this.stwgRmk;
    }

    /**
	 * Column Info
	 * @return stwgCd
	 */
    public String getStwgCd() {
        return this.stwgCd;
    }

    /**
	 * Column Info
	 * @return siFlg
	 */
    public String getSiFlg() {
        return this.siFlg;
    }

    /**
	 * Column Info
	 * @return chnAgnCd
	 */
    public String getChnAgnCd() {
        return this.chnAgnCd;
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
	 * @return hcmtCmbFlg
	 */
    public String getHcmtCmbFlg() {
        return this.hcmtCmbFlg;
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
	 * @return mnlBkgNoFlg
	 */
    public String getMnlBkgNoFlg() {
        return this.mnlBkgNoFlg;
    }

    /**
	 * Column Info
	 * @return blIssBlckFlg
	 */
    public String getBlIssBlckFlg() {
        return this.blIssBlckFlg;
    }

    /**
	 * Column Info
	 * @return dblBkgFlg
	 */
    public String getDblBkgFlg() {
        return this.dblBkgFlg;
    }

    /**
	 * Column Info
	 * @return xterSiRefNo
	 */
    public String getXterSiRefNo() {
        return this.xterSiRefNo;
    }

    /**
	 * Column Info
	 * @return agmtActCustSeq
	 */
    public String getAgmtActCustSeq() {
        return this.agmtActCustSeq;
    }

    /**
	 * Column Info
	 * @return orgScontiCd
	 */
    public String getOrgScontiCd() {
        return this.orgScontiCd;
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
	 * @return fullRtnYdCd
	 */
    public String getFullRtnYdCd() {
        return this.fullRtnYdCd;
    }

    /**
	 * Column Info
	 * @return splitRto
	 */
    public String getSplitRto() {
        return this.splitRto;
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
	 * @return deDueDt
	 */
    public String getDeDueDt() {
        return this.deDueDt;
    }

    /**
	 * Column Info
	 * @return lodgDueDt
	 */
    public String getLodgDueDt() {
        return this.lodgDueDt;
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
	 * @return podNodCd
	 */
    public String getPodNodCd() {
        return this.podNodCd;
    }

    /**
	 * Column Info
	 * @return wtRsnHldFlg
	 */
    public String getWtRsnHldFlg() {
        return this.wtRsnHldFlg;
    }

    /**
	 * Column Info
	 * @return mtyPreVvdFlg
	 */
    public String getMtyPreVvdFlg() {
        return this.mtyPreVvdFlg;
    }

    /**
	 * Column Info
	 * @return toBkgNo
	 */
    public String getToBkgNo() {
        return this.toBkgNo;
    }

    /**
	 * Column Info
	 * @return fmBkgNo
	 */
    public String getFmBkgNo() {
        return this.fmBkgNo;
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
	 * @return spclHideFlg
	 */
    public String getSpclHideFlg() {
        return this.spclHideFlg;
    }

    /**
	 * Column Info
	 * @return rcFlg
	 */
    public String getRcFlg() {
        return this.rcFlg;
    }

    /**
	 * Column Info
	 * @return splitRsnCd
	 */
    public String getSplitRsnCd() {
        return this.splitRsnCd;
    }

    /**
	 * Column Info
	 * @return ibDelDeGdt
	 */
    public String getIbDelDeGdt() {
        return this.ibDelDeGdt;
    }

    /**
	 * Column Info
	 * @return destTrnsModCd
	 */
    public String getDestTrnsModCd() {
        return this.destTrnsModCd;
    }

    /**
	 * Column Info
	 * @return stopOffLocCd
	 */
    public String getStopOffLocCd() {
        return this.stopOffLocCd;
    }

    /**
	 * Column Info
	 * @return rdCgoFlg
	 */
    public String getRdCgoFlg() {
        return this.rdCgoFlg;
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
	 * @return fdGrdFlg
	 */
    public String getFdGrdFlg() {
        return this.fdGrdFlg;
    }

    /**
	 * Column Info
	 * @return ovrVoidSltQty
	 */
    public String getOvrVoidSltQty() {
        return this.ovrVoidSltQty;
    }

    /**
	 * Column Info
	 * @return xterSiKnt
	 */
    public String getXterSiKnt() {
        return this.xterSiKnt;
    }

    /**
	 * Column Info
	 * @return mtySplitAvalCd
	 */
    public String getMtySplitAvalCd() {
        return this.mtySplitAvalCd;
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
	 * @return scacCd
	 */
    public String getScacCd() {
        return this.scacCd;
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
	 * @return apBrogFlg
	 */
    public String getApBrogFlg() {
        return this.apBrogFlg;
    }

    /**
	 * Column Info
	 * @return fullPkupYdCd
	 */
    public String getFullPkupYdCd() {
        return this.fullPkupYdCd;
    }

    /**
	 * Column Info
	 * @return bkgCxlDt
	 */
    public String getBkgCxlDt() {
        return this.bkgCxlDt;
    }

    /**
	 * Column Info
	 * @return ibSlsOfcCd
	 */
    public String getIbSlsOfcCd() {
        return this.ibSlsOfcCd;
    }

    /**
	 * Column Info
	 * @return altCustCfmFlg
	 */
    public String getAltCustCfmFlg() {
        return this.altCustCfmFlg;
    }

    /**
	 * Column Info
	 * @return stopOffCntcPsonNm
	 */
    public String getStopOffCntcPsonNm() {
        return this.stopOffCntcPsonNm;
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
	 * @return samCneeNtfyFlg
	 */
    public String getSamCneeNtfyFlg() {
        return this.samCneeNtfyFlg;
    }

    /**
	 * Column Info
	 * @return xterRqstAutoNtcFlg
	 */
    public String getXterRqstAutoNtcFlg() {
        return this.xterRqstAutoNtcFlg;
    }

    /**
	 * Column Info
	 * @return bkgCreGdt
	 */
    public String getBkgCreGdt() {
        return this.bkgCreGdt;
    }

    /**
	 * Column Info
	 * @return destScontiCd
	 */
    public String getDestScontiCd() {
        return this.destScontiCd;
    }

    /**
	 * Column Info
	 * @return mtyDorArrDt
	 */
    public String getMtyDorArrDt() {
        return this.mtyDorArrDt;
    }

    /**
	 * Column Info
	 * @return bkgCreTpCd
	 */
    public String getBkgCreTpCd() {
        return this.bkgCreTpCd;
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
	 * @return taaNo
	 */
    public String getTaaNo() {
        return this.taaNo;
    }

    /**
	 * Column Info
	 * @return flexHgtFlg
	 */
    public String getFlexHgtFlg() {
        return this.flexHgtFlg;
    }

    /**
	 * Column Info
	 * @return bkgCxlGdt
	 */
    public String getBkgCxlGdt() {
        return this.bkgCxlGdt;
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
	 * @return vslCd
	 */
    public String getVslCd() {
        return this.vslCd;
    }

    /**
	 * Column Info
	 * @return mtyBkgStsCd
	 */
    public String getMtyBkgStsCd() {
        return this.mtyBkgStsCd;
    }

    /**
	 * Column Info
	 * @return caInspDueDt
	 */
    public String getCaInspDueDt() {
        return this.caInspDueDt;
    }

    /**
	 * Column Info
	 * @return ibDelDeDt
	 */
    public String getIbDelDeDt() {
        return this.ibDelDeDt;
    }

    /**
	 * Column Info
	 * @return ocpCd
	 */
    public String getOcpCd() {
        return this.ocpCd;
    }

    /**
	 * Column Info
	 * @return interRmkAudFlg
	 */
    public String getInterRmkAudFlg() {
        return this.interRmkAudFlg;
    }

    /**
	 * Column Info
	 * @return blckStwgCd
	 */
    public String getBlckStwgCd() {
        return this.blckStwgCd;
    }

    /**
	 * Column Info
	 * @return polEtdDt
	 */
    public String getPolEtdDt() {
        return this.polEtdDt;
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
	 * @return pctlNo
	 */
    public String getPctlNo() {
        return this.pctlNo;
    }

    /**
	 * Column Info
	 * @return xterRqstCustRmk
	 */
    public String getXterRqstCustRmk() {
        return this.xterRqstCustRmk;
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
	 * @return scNo
	 */
    public String getScNo() {
        return this.scNo;
    }

    /**
	 * Column Info
	 * @return prctFlg
	 */
    public String getPrctFlg() {
        return this.prctFlg;
    }

    /**
	 * Column Info
	 * @return myFwrdCd
	 */
    public String getMyFwrdCd() {
        return this.myFwrdCd;
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
	 * @return delNodCd
	 */
    public String getDelNodCd() {
        return this.delNodCd;
    }

    /**
	 * Column Info
	 * @return obSlsOfcCd
	 */
    public String getObSlsOfcCd() {
        return this.obSlsOfcCd;
    }

    /**
	 * Column Info
	 * @return custToOrdFlg
	 */
    public String getCustToOrdFlg() {
        return this.custToOrdFlg;
    }

    /**
	 * Column Info
	 * @return wtRsnSpclCgoFlg
	 */
    public String getWtRsnSpclCgoFlg() {
        return this.wtRsnSpclCgoFlg;
    }

    /**
	 * Column Info
	 * @return xterSiCd
	 */
    public String getXterSiCd() {
        return this.xterSiCd;
    }

    /**
	 * Column Info
	 * @return cndCstmsFileCd
	 */
    public String getCndCstmsFileCd() {
        return this.cndCstmsFileCd;
    }

    /**
	 * Column Info
	 * @return mtyPkupDt
	 */
    public String getMtyPkupDt() {
        return this.mtyPkupDt;
    }

    /**
	 * Column Info
	 * @return xterBkgRqstCd
	 */
    public String getXterBkgRqstCd() {
        return this.xterBkgRqstCd;
    }

    /**
	 * Column Info
	 * @return preRlyPortCd
	 */
    public String getPreRlyPortCd() {
        return this.preRlyPortCd;
    }

    /**
	 * Column Info
	 * @return ctrtCustSeq
	 */
    public String getCtrtCustSeq() {
        return this.ctrtCustSeq;
    }

    /**
	 * Column Info
	 * @return portClzDt
	 */
    public String getPortClzDt() {
        return this.portClzDt;
    }

    /**
	 * Column Info
	 * @return awkCgoFlg
	 */
    public String getAwkCgoFlg() {
        return this.awkCgoFlg;
    }

    /**
	 * Column Info
	 * @return stopOffCntcPhnNo
	 */
    public String getStopOffCntcPhnNo() {
        return this.stopOffCntcPhnNo;
    }

    /**
	 * Column Info
	 * @return fnlDestCd
	 */
    public String getFnlDestCd() {
        return this.fnlDestCd;
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
	 * @return slsRhqCd
	 */
    public String getSlsRhqCd() {
        return this.slsRhqCd;
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
	 * @return xterRmk
	 */
    public String getXterRmk() {
        return this.xterRmk;
    }

    /**
	 * Column Info
	 * @return xterBkgRqstRefNo
	 */
    public String getXterBkgRqstRefNo() {
        return this.xterBkgRqstRefNo;
    }

    /**
	 * Column Info
	 * @return pstRlyPortCd
	 */
    public String getPstRlyPortCd() {
        return this.pstRlyPortCd;
    }

    /**
	 * Column Info
	 * @return splitFlg
	 */
    public String getSplitFlg() {
        return this.splitFlg;
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
	 * @return ctrtCustCntCd
	 */
    public String getCtrtCustCntCd() {
        return this.ctrtCustCntCd;
    }

    /**
	 * Column Info
	 * @return orgTrnsSvcModCd
	 */
    public String getOrgTrnsSvcModCd() {
        return this.orgTrnsSvcModCd;
    }

    /**
	 * Column Info
	 * @return docUsrId
	 */
    public String getDocUsrId() {
        return this.docUsrId;
    }

    /**
	 * Column Info
	 * @return eqCtrlOfcCd
	 */
    public String getEqCtrlOfcCd() {
        return this.eqCtrlOfcCd;
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
	 * @return advShtgCd
	 */
    public String getAdvShtgCd() {
        return this.advShtgCd;
    }

    /**
	 * Column Info
	 * @return stopOffDiffRmk
	 */
    public String getStopOffDiffRmk() {
        return this.stopOffDiffRmk;
    }

    /**
	 * Column Info
	 * @return eqSubstFlg
	 */
    public String getEqSubstFlg() {
        return this.eqSubstFlg;
    }

    /**
	 * Column Info
	 * @return hotDeFlg
	 */
    public String getHotDeFlg() {
        return this.hotDeFlg;
    }

    /**
	 * Column Info
	 * @return splitDt
	 */
    public String getSplitDt() {
        return this.splitDt;
    }

    /**
	 * Column Info
	 * @return rfaNo
	 */
    public String getRfaNo() {
        return this.rfaNo;
    }

    /**
	 * Column Info
	 * @return revDirCd
	 */
    public String getRevDirCd() {
        return this.revDirCd;
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
	 * @return bbCgoFlg
	 */
    public String getBbCgoFlg() {
        return this.bbCgoFlg;
    }

    /**
	 * Column Info
	 * @return dcgoFlg
	 */
    public String getDcgoFlg() {
        return this.dcgoFlg;
    }

    /**
	 * Column Info
	 * @return krCstmsCustTpCd
	 */
    public String getKrCstmsCustTpCd() {
        return this.krCstmsCustTpCd;
    }

    /**
	 * Column Info
	 * @return mtyCreSvrCd
	 */
    public String getMtyCreSvrCd() {
        return this.mtyCreSvrCd;
    }

    /**
	 * Column Info
	 * @return rcvTermCd
	 */
    public String getRcvTermCd() {
        return this.rcvTermCd;
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
	 * @return splitGdt
	 */
    public String getSplitGdt() {
        return this.splitGdt;
    }

    /**
	 * Column Info
	 * @return mtyPortFlg
	 */
    public String getMtyPortFlg() {
        return this.mtyPortFlg;
    }

    /**
	 * Column Info
	 * @return mtyPodFlg
	 */
    public String getMtyPodFlg() {
        return this.mtyPodFlg;
    }

    /**
	 * Column Info
	 * @return allMtrFlg
	 */
    public String getAllMtrFlg() {
        return this.allMtrFlg;
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
	 * @return xterBkgKnt
	 */
    public String getXterBkgKnt() {
        return this.xterBkgKnt;
    }

    /**
	 * Column Info
	 * @return twnSoNo
	 */
    public String getTwnSoNo() {
        return this.twnSoNo;
    }

    /**
	 * Column Info
	 * @return podEtaDt
	 */
    public String getPodEtaDt() {
        return this.podEtaDt;
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
	 * @return blTpCd
	 */
    public String getBlTpCd() {
        return this.blTpCd;
    }

    /**
	 * Column Info
	 * @return usaCstmsFileCd
	 */
    public String getUsaCstmsFileCd() {
        return this.usaCstmsFileCd;
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
	 * @return deTermCd
	 */
    public String getDeTermCd() {
        return this.deTermCd;
    }

    /**
	 * Column Info
	 * @return hngrFlg
	 */
    public String getHngrFlg() {
        return this.hngrFlg;
    }

    /**
	 * Column Info
	 * @return mtyRtnYdCd
	 */
    public String getMtyRtnYdCd() {
        return this.mtyRtnYdCd;
    }

    /**
	 * Column Info
	 * @return myFwrdVslDesc
	 */
    public String getMyFwrdVslDesc() {
        return this.myFwrdVslDesc;
    }

    /**
	 * Column Info
	 * @return slsRgnOfcCd
	 */
    public String getSlsRgnOfcCd() {
        return this.slsRgnOfcCd;
    }

    /**
	 * Column Info
	 * @return ediHldFlg
	 */
    public String getEdiHldFlg() {
        return this.ediHldFlg;
    }

    /**
	 * Column Info
	 * @return vndrRmk
	 */
    public String getVndrRmk() {
        return this.vndrRmk;
    }

    /**
	 * Column Info
	 * @return bkgCtrlPtyCustCntCd
	 */
    public String getBkgCtrlPtyCustCntCd() {
        return this.bkgCtrlPtyCustCntCd;
    }

    /**
	 * Column Info
	 * @return bkgCtrlPtyCustSeq
	 */
    public String getBkgCtrlPtyCustSeq() {
        return this.bkgCtrlPtyCustSeq;
    }
    
    /**
	 * Column Info
	 * @return motNo
	 */
    public String getMotNo() {
        return this.motNo;
    }
    
    /**
	 * Column Info
	 * @return rqstDt
	 */
    public String getRqstDt() {
        return this.rqstDt;
    }
    
    /**
	 * Column Info
	 * @return rqstGdt
	 */
    public String getRqstGdt() {
        return this.rqstGdt;
    }
    
    /**
	 * Column Info
	 * @return bkgAlocStsCd
	 */
    public String getBkgAlocStsCd() {
        return this.bkgAlocStsCd;
    }
    
    /**
	 * Column Info
	 * @return sbBkgGidCd
	 */
    public String getSbBkgGidCd() {
        return this.sbBkgGidCd;
    }
    
    /**
	 * Column Info
	 * @return sbBkgDirRmk
	 */
    public String getSbBkgDirRmk() {
        return this.sbBkgDirRmk;
    }
    
    /**
	 * Column Info
	 * @return cplsFrmFlg
	 */
    public String getCplsFrmFlg() {
        return this.cplsFrmFlg;
    }
    
    /**
	 * Column Info
	 * @return fnlGuidCd
	 */
    public String getFnlGuidCd() {
        return this.fnlGuidCd;
    }
    
    /**
	 * Column Info
	 * @return trCd
	 */
    public String getTrCd() {
        return this.trCd;
    }
    
    /**
	 * Column Info
	 * @return sbBkgRoleCd
	 */
    public String getSbBkgRoleCd() {
        return this.sbBkgRoleCd;
    }
    
    /**
	 * Column Info
	 * @return sbDt
	 */
    public String getSbDt() {
        return this.sbDt;
    }
    
    /**
	 * Column Info
	 * @return sbFrmDt
	 */
    public String getSbFrmDt() {
        return this.sbFrmDt;
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
	 * @param orgTrnsModCd
	 */
    public void setOrgTrnsModCd(String orgTrnsModCd) {
        this.orgTrnsModCd = orgTrnsModCd;
    }

    /**
	 * Column Info
	 * @param svcScpCd
	 */
    public void setSvcScpCd(String svcScpCd) {
        this.svcScpCd = svcScpCd;
    }

    /**
	 * Column Info
	 * @param mtyPkupYdCd
	 */
    public void setMtyPkupYdCd(String mtyPkupYdCd) {
        this.mtyPkupYdCd = mtyPkupYdCd;
    }

    /**
	 * Column Info
	 * @param agmtActCntCd
	 */
    public void setAgmtActCntCd(String agmtActCntCd) {
        this.agmtActCntCd = agmtActCntCd;
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
	 * @param obSrepCd
	 */
    public void setObSrepCd(String obSrepCd) {
        this.obSrepCd = obSrepCd;
    }

    /**
	 * Column Info
	 * @param destTrnsSvcModCd
	 */
    public void setDestTrnsSvcModCd(String destTrnsSvcModCd) {
        this.destTrnsSvcModCd = destTrnsSvcModCd;
    }

    /**
	 * Column Info
	 * @param shpBakFlg
	 */
    public void setShpBakFlg(String shpBakFlg) {
        this.shpBakFlg = shpBakFlg;
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
	 * @param bkgCreDt
	 */
    public void setBkgCreDt(String bkgCreDt) {
        this.bkgCreDt = bkgCreDt;
    }

    /**
	 * Column Info
	 * @param stwgRmk
	 */
    public void setStwgRmk(String stwgRmk) {
        this.stwgRmk = stwgRmk;
    }

    /**
	 * Column Info
	 * @param stwgCd
	 */
    public void setStwgCd(String stwgCd) {
        this.stwgCd = stwgCd;
    }

    /**
	 * Column Info
	 * @param siFlg
	 */
    public void setSiFlg(String siFlg) {
        this.siFlg = siFlg;
    }

    /**
	 * Column Info
	 * @param chnAgnCd
	 */
    public void setChnAgnCd(String chnAgnCd) {
        this.chnAgnCd = chnAgnCd;
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
	 * @param hcmtCmbFlg
	 */
    public void setHcmtCmbFlg(String hcmtCmbFlg) {
        this.hcmtCmbFlg = hcmtCmbFlg;
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
	 * @param mnlBkgNoFlg
	 */
    public void setMnlBkgNoFlg(String mnlBkgNoFlg) {
        this.mnlBkgNoFlg = mnlBkgNoFlg;
    }

    /**
	 * Column Info
	 * @param blIssBlckFlg
	 */
    public void setBlIssBlckFlg(String blIssBlckFlg) {
        this.blIssBlckFlg = blIssBlckFlg;
    }

    /**
	 * Column Info
	 * @param dblBkgFlg
	 */
    public void setDblBkgFlg(String dblBkgFlg) {
        this.dblBkgFlg = dblBkgFlg;
    }

    /**
	 * Column Info
	 * @param xterSiRefNo
	 */
    public void setXterSiRefNo(String xterSiRefNo) {
        this.xterSiRefNo = xterSiRefNo;
    }

    /**
	 * Column Info
	 * @param agmtActCustSeq
	 */
    public void setAgmtActCustSeq(String agmtActCustSeq) {
        this.agmtActCustSeq = agmtActCustSeq;
    }

    /**
	 * Column Info
	 * @param orgScontiCd
	 */
    public void setOrgScontiCd(String orgScontiCd) {
        this.orgScontiCd = orgScontiCd;
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
	 * @param fullRtnYdCd
	 */
    public void setFullRtnYdCd(String fullRtnYdCd) {
        this.fullRtnYdCd = fullRtnYdCd;
    }

    /**
	 * Column Info
	 * @param splitRto
	 */
    public void setSplitRto(String splitRto) {
        this.splitRto = splitRto;
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
	 * @param deDueDt
	 */
    public void setDeDueDt(String deDueDt) {
        this.deDueDt = deDueDt;
    }

    /**
	 * Column Info
	 * @param lodgDueDt
	 */
    public void setLodgDueDt(String lodgDueDt) {
        this.lodgDueDt = lodgDueDt;
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
	 * @param podNodCd
	 */
    public void setPodNodCd(String podNodCd) {
        this.podNodCd = podNodCd;
    }

    /**
	 * Column Info
	 * @param wtRsnHldFlg
	 */
    public void setWtRsnHldFlg(String wtRsnHldFlg) {
        this.wtRsnHldFlg = wtRsnHldFlg;
    }

    /**
	 * Column Info
	 * @param mtyPreVvdFlg
	 */
    public void setMtyPreVvdFlg(String mtyPreVvdFlg) {
        this.mtyPreVvdFlg = mtyPreVvdFlg;
    }

    /**
	 * Column Info
	 * @param toBkgNo
	 */
    public void setToBkgNo(String toBkgNo) {
        this.toBkgNo = toBkgNo;
    }

    /**
	 * Column Info
	 * @param fmBkgNo
	 */
    public void setFmBkgNo(String fmBkgNo) {
        this.fmBkgNo = fmBkgNo;
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
	 * @param spclHideFlg
	 */
    public void setSpclHideFlg(String spclHideFlg) {
        this.spclHideFlg = spclHideFlg;
    }

    /**
	 * Column Info
	 * @param rcFlg
	 */
    public void setRcFlg(String rcFlg) {
        this.rcFlg = rcFlg;
    }

    /**
	 * Column Info
	 * @param splitRsnCd
	 */
    public void setSplitRsnCd(String splitRsnCd) {
        this.splitRsnCd = splitRsnCd;
    }

    /**
	 * Column Info
	 * @param ibDelDeGdt
	 */
    public void setIbDelDeGdt(String ibDelDeGdt) {
        this.ibDelDeGdt = ibDelDeGdt;
    }

    /**
	 * Column Info
	 * @param destTrnsModCd
	 */
    public void setDestTrnsModCd(String destTrnsModCd) {
        this.destTrnsModCd = destTrnsModCd;
    }

    /**
	 * Column Info
	 * @param stopOffLocCd
	 */
    public void setStopOffLocCd(String stopOffLocCd) {
        this.stopOffLocCd = stopOffLocCd;
    }

    /**
	 * Column Info
	 * @param rdCgoFlg
	 */
    public void setRdCgoFlg(String rdCgoFlg) {
        this.rdCgoFlg = rdCgoFlg;
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
	 * @param fdGrdFlg
	 */
    public void setFdGrdFlg(String fdGrdFlg) {
        this.fdGrdFlg = fdGrdFlg;
    }

    /**
	 * Column Info
	 * @param ovrVoidSltQty
	 */
    public void setOvrVoidSltQty(String ovrVoidSltQty) {
        this.ovrVoidSltQty = ovrVoidSltQty;
    }

    /**
	 * Column Info
	 * @param xterSiKnt
	 */
    public void setXterSiKnt(String xterSiKnt) {
        this.xterSiKnt = xterSiKnt;
    }

    /**
	 * Column Info
	 * @param mtySplitAvalCd
	 */
    public void setMtySplitAvalCd(String mtySplitAvalCd) {
        this.mtySplitAvalCd = mtySplitAvalCd;
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
	 * @param scacCd
	 */
    public void setScacCd(String scacCd) {
        this.scacCd = scacCd;
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
	 * @param apBrogFlg
	 */
    public void setApBrogFlg(String apBrogFlg) {
        this.apBrogFlg = apBrogFlg;
    }

    /**
	 * Column Info
	 * @param fullPkupYdCd
	 */
    public void setFullPkupYdCd(String fullPkupYdCd) {
        this.fullPkupYdCd = fullPkupYdCd;
    }

    /**
	 * Column Info
	 * @param bkgCxlDt
	 */
    public void setBkgCxlDt(String bkgCxlDt) {
        this.bkgCxlDt = bkgCxlDt;
    }

    /**
	 * Column Info
	 * @param ibSlsOfcCd
	 */
    public void setIbSlsOfcCd(String ibSlsOfcCd) {
        this.ibSlsOfcCd = ibSlsOfcCd;
    }

    /**
	 * Column Info
	 * @param altCustCfmFlg
	 */
    public void setAltCustCfmFlg(String altCustCfmFlg) {
        this.altCustCfmFlg = altCustCfmFlg;
    }

    /**
	 * Column Info
	 * @param stopOffCntcPsonNm
	 */
    public void setStopOffCntcPsonNm(String stopOffCntcPsonNm) {
        this.stopOffCntcPsonNm = stopOffCntcPsonNm;
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
	 * @param samCneeNtfyFlg
	 */
    public void setSamCneeNtfyFlg(String samCneeNtfyFlg) {
        this.samCneeNtfyFlg = samCneeNtfyFlg;
    }

    /**
	 * Column Info
	 * @param xterRqstAutoNtcFlg
	 */
    public void setXterRqstAutoNtcFlg(String xterRqstAutoNtcFlg) {
        this.xterRqstAutoNtcFlg = xterRqstAutoNtcFlg;
    }

    /**
	 * Column Info
	 * @param bkgCreGdt
	 */
    public void setBkgCreGdt(String bkgCreGdt) {
        this.bkgCreGdt = bkgCreGdt;
    }

    /**
	 * Column Info
	 * @param destScontiCd
	 */
    public void setDestScontiCd(String destScontiCd) {
        this.destScontiCd = destScontiCd;
    }

    /**
	 * Column Info
	 * @param mtyDorArrDt
	 */
    public void setMtyDorArrDt(String mtyDorArrDt) {
        this.mtyDorArrDt = mtyDorArrDt;
    }

    /**
	 * Column Info
	 * @param bkgCreTpCd
	 */
    public void setBkgCreTpCd(String bkgCreTpCd) {
        this.bkgCreTpCd = bkgCreTpCd;
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
	 * @param taaNo
	 */
    public void setTaaNo(String taaNo) {
        this.taaNo = taaNo;
    }

    /**
	 * Column Info
	 * @param flexHgtFlg
	 */
    public void setFlexHgtFlg(String flexHgtFlg) {
        this.flexHgtFlg = flexHgtFlg;
    }

    /**
	 * Column Info
	 * @param bkgCxlGdt
	 */
    public void setBkgCxlGdt(String bkgCxlGdt) {
        this.bkgCxlGdt = bkgCxlGdt;
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
	 * @param vslCd
	 */
    public void setVslCd(String vslCd) {
        this.vslCd = vslCd;
    }

    /**
	 * Column Info
	 * @param mtyBkgStsCd
	 */
    public void setMtyBkgStsCd(String mtyBkgStsCd) {
        this.mtyBkgStsCd = mtyBkgStsCd;
    }

    /**
	 * Column Info
	 * @param caInspDueDt
	 */
    public void setCaInspDueDt(String caInspDueDt) {
        this.caInspDueDt = caInspDueDt;
    }

    /**
	 * Column Info
	 * @param ibDelDeDt
	 */
    public void setIbDelDeDt(String ibDelDeDt) {
        this.ibDelDeDt = ibDelDeDt;
    }

    /**
	 * Column Info
	 * @param ocpCd
	 */
    public void setOcpCd(String ocpCd) {
        this.ocpCd = ocpCd;
    }

    /**
	 * Column Info
	 * @param interRmkAudFlg
	 */
    public void setInterRmkAudFlg(String interRmkAudFlg) {
        this.interRmkAudFlg = interRmkAudFlg;
    }

    /**
	 * Column Info
	 * @param blckStwgCd
	 */
    public void setBlckStwgCd(String blckStwgCd) {
        this.blckStwgCd = blckStwgCd;
    }

    /**
	 * Column Info
	 * @param polEtdDt
	 */
    public void setPolEtdDt(String polEtdDt) {
        this.polEtdDt = polEtdDt;
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
	 * @param pctlNo
	 */
    public void setPctlNo(String pctlNo) {
        this.pctlNo = pctlNo;
    }

    /**
	 * Column Info
	 * @param xterRqstCustRmk
	 */
    public void setXterRqstCustRmk(String xterRqstCustRmk) {
        this.xterRqstCustRmk = xterRqstCustRmk;
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
	 * @param scNo
	 */
    public void setScNo(String scNo) {
        this.scNo = scNo;
    }

    /**
	 * Column Info
	 * @param prctFlg
	 */
    public void setPrctFlg(String prctFlg) {
        this.prctFlg = prctFlg;
    }

    /**
	 * Column Info
	 * @param myFwrdCd
	 */
    public void setMyFwrdCd(String myFwrdCd) {
        this.myFwrdCd = myFwrdCd;
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
	 * @param delNodCd
	 */
    public void setDelNodCd(String delNodCd) {
        this.delNodCd = delNodCd;
    }

    /**
	 * Column Info
	 * @param obSlsOfcCd
	 */
    public void setObSlsOfcCd(String obSlsOfcCd) {
        this.obSlsOfcCd = obSlsOfcCd;
    }

    /**
	 * Column Info
	 * @param custToOrdFlg
	 */
    public void setCustToOrdFlg(String custToOrdFlg) {
        this.custToOrdFlg = custToOrdFlg;
    }

    /**
	 * Column Info
	 * @param wtRsnSpclCgoFlg
	 */
    public void setWtRsnSpclCgoFlg(String wtRsnSpclCgoFlg) {
        this.wtRsnSpclCgoFlg = wtRsnSpclCgoFlg;
    }

    /**
	 * Column Info
	 * @param xterSiCd
	 */
    public void setXterSiCd(String xterSiCd) {
        this.xterSiCd = xterSiCd;
    }

    /**
	 * Column Info
	 * @param cndCstmsFileCd
	 */
    public void setCndCstmsFileCd(String cndCstmsFileCd) {
        this.cndCstmsFileCd = cndCstmsFileCd;
    }

    /**
	 * Column Info
	 * @param mtyPkupDt
	 */
    public void setMtyPkupDt(String mtyPkupDt) {
        this.mtyPkupDt = mtyPkupDt;
    }

    /**
	 * Column Info
	 * @param xterBkgRqstCd
	 */
    public void setXterBkgRqstCd(String xterBkgRqstCd) {
        this.xterBkgRqstCd = xterBkgRqstCd;
    }

    /**
	 * Column Info
	 * @param preRlyPortCd
	 */
    public void setPreRlyPortCd(String preRlyPortCd) {
        this.preRlyPortCd = preRlyPortCd;
    }

    /**
	 * Column Info
	 * @param ctrtCustSeq
	 */
    public void setCtrtCustSeq(String ctrtCustSeq) {
        this.ctrtCustSeq = ctrtCustSeq;
    }

    /**
	 * Column Info
	 * @param portClzDt
	 */
    public void setPortClzDt(String portClzDt) {
        this.portClzDt = portClzDt;
    }

    /**
	 * Column Info
	 * @param awkCgoFlg
	 */
    public void setAwkCgoFlg(String awkCgoFlg) {
        this.awkCgoFlg = awkCgoFlg;
    }

    /**
	 * Column Info
	 * @param stopOffCntcPhnNo
	 */
    public void setStopOffCntcPhnNo(String stopOffCntcPhnNo) {
        this.stopOffCntcPhnNo = stopOffCntcPhnNo;
    }

    /**
	 * Column Info
	 * @param fnlDestCd
	 */
    public void setFnlDestCd(String fnlDestCd) {
        this.fnlDestCd = fnlDestCd;
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
	 * @param slsRhqCd
	 */
    public void setSlsRhqCd(String slsRhqCd) {
        this.slsRhqCd = slsRhqCd;
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
	 * @param xterRmk
	 */
    public void setXterRmk(String xterRmk) {
        this.xterRmk = xterRmk;
    }

    /**
	 * Column Info
	 * @param xterBkgRqstRefNo
	 */
    public void setXterBkgRqstRefNo(String xterBkgRqstRefNo) {
        this.xterBkgRqstRefNo = xterBkgRqstRefNo;
    }

    /**
	 * Column Info
	 * @param pstRlyPortCd
	 */
    public void setPstRlyPortCd(String pstRlyPortCd) {
        this.pstRlyPortCd = pstRlyPortCd;
    }

    /**
	 * Column Info
	 * @param splitFlg
	 */
    public void setSplitFlg(String splitFlg) {
        this.splitFlg = splitFlg;
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
	 * @param ctrtCustCntCd
	 */
    public void setCtrtCustCntCd(String ctrtCustCntCd) {
        this.ctrtCustCntCd = ctrtCustCntCd;
    }

    /**
	 * Column Info
	 * @param orgTrnsSvcModCd
	 */
    public void setOrgTrnsSvcModCd(String orgTrnsSvcModCd) {
        this.orgTrnsSvcModCd = orgTrnsSvcModCd;
    }

    /**
	 * Column Info
	 * @param docUsrId
	 */
    public void setDocUsrId(String docUsrId) {
        this.docUsrId = docUsrId;
    }

    /**
	 * Column Info
	 * @param eqCtrlOfcCd
	 */
    public void setEqCtrlOfcCd(String eqCtrlOfcCd) {
        this.eqCtrlOfcCd = eqCtrlOfcCd;
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
	 * @param advShtgCd
	 */
    public void setAdvShtgCd(String advShtgCd) {
        this.advShtgCd = advShtgCd;
    }

    /**
	 * Column Info
	 * @param stopOffDiffRmk
	 */
    public void setStopOffDiffRmk(String stopOffDiffRmk) {
        this.stopOffDiffRmk = stopOffDiffRmk;
    }

    /**
	 * Column Info
	 * @param eqSubstFlg
	 */
    public void setEqSubstFlg(String eqSubstFlg) {
        this.eqSubstFlg = eqSubstFlg;
    }

    /**
	 * Column Info
	 * @param hotDeFlg
	 */
    public void setHotDeFlg(String hotDeFlg) {
        this.hotDeFlg = hotDeFlg;
    }

    /**
	 * Column Info
	 * @param splitDt
	 */
    public void setSplitDt(String splitDt) {
        this.splitDt = splitDt;
    }

    /**
	 * Column Info
	 * @param rfaNo
	 */
    public void setRfaNo(String rfaNo) {
        this.rfaNo = rfaNo;
    }

    /**
	 * Column Info
	 * @param revDirCd
	 */
    public void setRevDirCd(String revDirCd) {
        this.revDirCd = revDirCd;
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
	 * @param bbCgoFlg
	 */
    public void setBbCgoFlg(String bbCgoFlg) {
        this.bbCgoFlg = bbCgoFlg;
    }

    /**
	 * Column Info
	 * @param dcgoFlg
	 */
    public void setDcgoFlg(String dcgoFlg) {
        this.dcgoFlg = dcgoFlg;
    }

    /**
	 * Column Info
	 * @param krCstmsCustTpCd
	 */
    public void setKrCstmsCustTpCd(String krCstmsCustTpCd) {
        this.krCstmsCustTpCd = krCstmsCustTpCd;
    }

    /**
	 * Column Info
	 * @param mtyCreSvrCd
	 */
    public void setMtyCreSvrCd(String mtyCreSvrCd) {
        this.mtyCreSvrCd = mtyCreSvrCd;
    }

    /**
	 * Column Info
	 * @param rcvTermCd
	 */
    public void setRcvTermCd(String rcvTermCd) {
        this.rcvTermCd = rcvTermCd;
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
	 * @param splitGdt
	 */
    public void setSplitGdt(String splitGdt) {
        this.splitGdt = splitGdt;
    }

    /**
	 * Column Info
	 * @param mtyPortFlg
	 */
    public void setMtyPortFlg(String mtyPortFlg) {
        this.mtyPortFlg = mtyPortFlg;
    }

    /**
	 * Column Info
	 * @param mtyPodFlg
	 */
    public void setMtyPodFlg(String mtyPodFlg) {
        this.mtyPodFlg = mtyPodFlg;
    }

    /**
	 * Column Info
	 * @param allMtrFlg
	 */
    public void setAllMtrFlg(String allMtrFlg) {
        this.allMtrFlg = allMtrFlg;
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
	 * @param xterBkgKnt
	 */
    public void setXterBkgKnt(String xterBkgKnt) {
        this.xterBkgKnt = xterBkgKnt;
    }

    /**
	 * Column Info
	 * @param twnSoNo
	 */
    public void setTwnSoNo(String twnSoNo) {
        this.twnSoNo = twnSoNo;
    }

    /**
	 * Column Info
	 * @param podEtaDt
	 */
    public void setPodEtaDt(String podEtaDt) {
        this.podEtaDt = podEtaDt;
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
	 * @param blTpCd
	 */
    public void setBlTpCd(String blTpCd) {
        this.blTpCd = blTpCd;
    }

    /**
	 * Column Info
	 * @param usaCstmsFileCd
	 */
    public void setUsaCstmsFileCd(String usaCstmsFileCd) {
        this.usaCstmsFileCd = usaCstmsFileCd;
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
	 * @param deTermCd
	 */
    public void setDeTermCd(String deTermCd) {
        this.deTermCd = deTermCd;
    }

    /**
	 * Column Info
	 * @param hngrFlg
	 */
    public void setHngrFlg(String hngrFlg) {
        this.hngrFlg = hngrFlg;
    }

    /**
	 * Column Info
	 * @param mtyRtnYdCd
	 */
    public void setMtyRtnYdCd(String mtyRtnYdCd) {
        this.mtyRtnYdCd = mtyRtnYdCd;
    }

    /**
	 * Column Info
	 * @param myFwrdVslDesc
	 */
    public void setMyFwrdVslDesc(String myFwrdVslDesc) {
        this.myFwrdVslDesc = myFwrdVslDesc;
    }

    /**
	 * Column Info
	 * @param slsRgnOfcCd
	 */
    public void setSlsRgnOfcCd(String slsRgnOfcCd) {
        this.slsRgnOfcCd = slsRgnOfcCd;
    }

    /**
	 * Column Info
	 * @param ediHldFlg
	 */
    public void setEdiHldFlg(String ediHldFlg) {
        this.ediHldFlg = ediHldFlg;
    }

    /**
	 * Column Info
	 * @param vndrRmk
	 */
    public void setVndrRmk(String vndrRmk) {
        this.vndrRmk = vndrRmk;
    }
    
    /**
	 * Column Info
	 * @param motNo
	 */
    public void setMotNo(String motNo) {
        this.motNo = motNo;
    }
    
    /**
	 * Column Info
	 * @param rqstDt
	 */
    public void setRqstDt(String rqstDt) {
        this.rqstDt = rqstDt;
    }
    
    /**
	 * Column Info
	 * @param rqstGdt
	 */
    public void setRqstGdt(String rqstGdt) {
        this.rqstGdt = rqstGdt;
    }
    
    /**
	 * Column Info
	 * @param bkgAlocStsCd
	 */
    public void setBkgAlocStsCd(String bkgAlocStsCd) {
        this.bkgAlocStsCd = bkgAlocStsCd;
    }
    
    /**
	 * Column Info
	 * @param sbBkgGidCd
	 */
    public void setSbBkgGidCd(String sbBkgGidCd) {
        this.sbBkgGidCd = sbBkgGidCd;
    }
    
    /**
	 * Column Info
	 * @param sbBkgDirRmk
	 */
    public void setSbBkgDirRmk(String sbBkgDirRmk) {
        this.sbBkgDirRmk = sbBkgDirRmk;
    }
    
    /**
	 * Column Info
	 * @param cplsFrmFlg
	 */
    public void setCplsFrmFlg(String cplsFrmFlg) {
        this.cplsFrmFlg = cplsFrmFlg;
    }
    
    /**
	 * Column Info
	 * @param fnlGuidCd
	 */
    public void setFnlGuidCd(String fnlGuidCd) {
        this.fnlGuidCd = fnlGuidCd;
    }
    
    /**
	 * Column Info
	 * @param trCd
	 */
    public void setTrCd(String trCd) {
        this.trCd = trCd;
    }
    
    /**
	 * Column Info
	 * @param sbBkgRoleCd
	 */
    public void setSbBkgRoleCd(String sbBkgRoleCd) {
        this.sbBkgRoleCd = sbBkgRoleCd;
    }
    
    /**
	 * Column Info
	 * @param sbDt
	 */
    public void setSbDt(String sbDt) {
        this.sbDt = sbDt;
    }
    
    /**
	 * Column Info
	 * @param sbFrmDt
	 */
    public void setSbFrmDt(String sbFrmDt) {
        this.sbFrmDt = sbFrmDt;
    }

    /**
	 * Column Info
	 * @param bkgCtrlPtyCustCntCd
	 */
    public void setBkgCtrlPtyCustCntCd(String bkgCtrlPtyCustCntCd) {
        this.bkgCtrlPtyCustCntCd = bkgCtrlPtyCustCntCd;
    }

    /**
	 * Column Info
	 * @param bkgCtrlPtyCustSeq
	 */
    public void setBkgCtrlPtyCustSeq(String bkgCtrlPtyCustSeq) {
        this.bkgCtrlPtyCustSeq = bkgCtrlPtyCustSeq;
    }

    /**
	 * @return the blckStwgFlg
	 */
    public String getBlckStwgFlg() {
        return blckStwgFlg;
    }

    /**
	 * @param blckStwgFlg the blckStwgFlg to set
	 */
    public void setBlckStwgFlg(String blckStwgFlg) {
        this.blckStwgFlg = blckStwgFlg;
    }

    public void setBkgWtChkFlg(String bkgWtChkFlg) {
        this.bkgWtChkFlg = bkgWtChkFlg;
    }

    public String getBkgWtChkFlg() {
        return this.bkgWtChkFlg;
    }

    public void setIrrBlNoFlg(String irrBlNoFlg) {
        this.irrBlNoFlg = irrBlNoFlg;
    }

    public String getIrrBlNoFlg() {
        return this.irrBlNoFlg;
    }

    public void setBkgPtyCntCd(String bkgPtyCntCd) {
        this.bkgPtyCntCd = bkgPtyCntCd;
    }

    public String getBkgPtyCntCd() {
        return this.bkgPtyCntCd;
    }

    public void setBkgPtyCustSeq(String bkgPtyCustSeq) {
        this.bkgPtyCustSeq = bkgPtyCustSeq;
    }

    public String getBkgPtyCustSeq() {
        return this.bkgPtyCustSeq;
    }

    /**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
    public void fromRequest(HttpServletRequest request) {
        setBkgCgoTpCd(JSPUtil.getParameter(request, "bkg_cgo_tp_cd", ""));
        setOrgTrnsModCd(JSPUtil.getParameter(request, "org_trns_mod_cd", ""));
        setSvcScpCd(JSPUtil.getParameter(request, "svc_scp_cd", ""));
        setMtyPkupYdCd(JSPUtil.getParameter(request, "mty_pkup_yd_cd", ""));
        setAgmtActCntCd(JSPUtil.getParameter(request, "agmt_act_cnt_cd", ""));
        setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
        setObSrepCd(JSPUtil.getParameter(request, "ob_srep_cd", ""));
        setDestTrnsSvcModCd(JSPUtil.getParameter(request, "dest_trns_svc_mod_cd", ""));
        setShpBakFlg(JSPUtil.getParameter(request, "shp_bak_flg", ""));
        setCtrtOfcCd(JSPUtil.getParameter(request, "ctrt_ofc_cd", ""));
        setBkgCreDt(JSPUtil.getParameter(request, "bkg_cre_dt", ""));
        setStwgRmk(JSPUtil.getParameter(request, "stwg_rmk", ""));
        setStwgCd(JSPUtil.getParameter(request, "stwg_cd", ""));
        setSiFlg(JSPUtil.getParameter(request, "si_flg", ""));
        setChnAgnCd(JSPUtil.getParameter(request, "chn_agn_cd", ""));
        setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
        setHcmtCmbFlg(JSPUtil.getParameter(request, "hcmt_cmb_flg", ""));
        setBkgOfcCd(JSPUtil.getParameter(request, "bkg_ofc_cd", ""));
        setMnlBkgNoFlg(JSPUtil.getParameter(request, "mnl_bkg_no_flg", ""));
        setBlIssBlckFlg(JSPUtil.getParameter(request, "bl_iss_blck_flg", ""));
        setDblBkgFlg(JSPUtil.getParameter(request, "dbl_bkg_flg", ""));
        setXterSiRefNo(JSPUtil.getParameter(request, "xter_si_ref_no", ""));
        setAgmtActCustSeq(JSPUtil.getParameter(request, "agmt_act_cust_seq", ""));
        setOrgScontiCd(JSPUtil.getParameter(request, "org_sconti_cd", ""));
        setSkdVoyNo(JSPUtil.getParameter(request, "skd_voy_no", ""));
        setFullRtnYdCd(JSPUtil.getParameter(request, "full_rtn_yd_cd", ""));
        setSplitRto(JSPUtil.getParameter(request, "split_rto", ""));
        setPodCd(JSPUtil.getParameter(request, "pod_cd", ""));
        setDeDueDt(JSPUtil.getParameter(request, "de_due_dt", ""));
        setLodgDueDt(JSPUtil.getParameter(request, "lodg_due_dt", ""));
        setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
        setPodNodCd(JSPUtil.getParameter(request, "pod_nod_cd", ""));
        setWtRsnHldFlg(JSPUtil.getParameter(request, "wt_rsn_hld_flg", ""));
        setMtyPreVvdFlg(JSPUtil.getParameter(request, "mty_pre_vvd_flg", ""));
        setToBkgNo(JSPUtil.getParameter(request, "to_bkg_no", ""));
        setFmBkgNo(JSPUtil.getParameter(request, "fm_bkg_no", ""));
        setCtrtSrepCd(JSPUtil.getParameter(request, "ctrt_srep_cd", ""));
        setSpclHideFlg(JSPUtil.getParameter(request, "spcl_hide_flg", ""));
        setRcFlg(JSPUtil.getParameter(request, "rc_flg", ""));
        setSplitRsnCd(JSPUtil.getParameter(request, "split_rsn_cd", ""));
        setIbDelDeGdt(JSPUtil.getParameter(request, "ib_del_de_gdt", ""));
        setDestTrnsModCd(JSPUtil.getParameter(request, "dest_trns_mod_cd", ""));
        setStopOffLocCd(JSPUtil.getParameter(request, "stop_off_loc_cd", ""));
        setRdCgoFlg(JSPUtil.getParameter(request, "rd_cgo_flg", ""));
        setBkgStsCd(JSPUtil.getParameter(request, "bkg_sts_cd", ""));
        setFdGrdFlg(JSPUtil.getParameter(request, "fd_grd_flg", ""));
        setOvrVoidSltQty(JSPUtil.getParameter(request, "ovr_void_slt_qty", ""));
        setXterSiKnt(JSPUtil.getParameter(request, "xter_si_knt", ""));
        setMtySplitAvalCd(JSPUtil.getParameter(request, "mty_split_aval_cd", ""));
        setInterRmk(JSPUtil.getParameter(request, "inter_rmk", ""));
        setScacCd(JSPUtil.getParameter(request, "scac_cd", ""));
        setCmdtCd(JSPUtil.getParameter(request, "cmdt_cd", ""));
        setApBrogFlg(JSPUtil.getParameter(request, "ap_brog_flg", ""));
        setFullPkupYdCd(JSPUtil.getParameter(request, "full_pkup_yd_cd", ""));
        setBkgCxlDt(JSPUtil.getParameter(request, "bkg_cxl_dt", ""));
        setIbSlsOfcCd(JSPUtil.getParameter(request, "ib_sls_ofc_cd", ""));
        setAltCustCfmFlg(JSPUtil.getParameter(request, "alt_cust_cfm_flg", ""));
        setStopOffCntcPsonNm(JSPUtil.getParameter(request, "stop_off_cntc_pson_nm", ""));
        setPorNodCd(JSPUtil.getParameter(request, "por_nod_cd", ""));
        setSamCneeNtfyFlg(JSPUtil.getParameter(request, "sam_cnee_ntfy_flg", ""));
        setXterRqstAutoNtcFlg(JSPUtil.getParameter(request, "xter_rqst_auto_ntc_flg", ""));
        setBkgCreGdt(JSPUtil.getParameter(request, "bkg_cre_gdt", ""));
        setDestScontiCd(JSPUtil.getParameter(request, "dest_sconti_cd", ""));
        setMtyDorArrDt(JSPUtil.getParameter(request, "mty_dor_arr_dt", ""));
        setBkgCreTpCd(JSPUtil.getParameter(request, "bkg_cre_tp_cd", ""));
        setSlanCd(JSPUtil.getParameter(request, "slan_cd", ""));
        setTaaNo(JSPUtil.getParameter(request, "taa_no", ""));
        setFlexHgtFlg(JSPUtil.getParameter(request, "flex_hgt_flg", ""));
        setBkgCxlGdt(JSPUtil.getParameter(request, "bkg_cxl_gdt", ""));
        setRepCmdtCd(JSPUtil.getParameter(request, "rep_cmdt_cd", ""));
        setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
        setMtyBkgStsCd(JSPUtil.getParameter(request, "mty_bkg_sts_cd", ""));
        setCaInspDueDt(JSPUtil.getParameter(request, "ca_insp_due_dt", ""));
        setIbDelDeDt(JSPUtil.getParameter(request, "ib_del_de_dt", ""));
        setOcpCd(JSPUtil.getParameter(request, "ocp_cd", ""));
        setInterRmkAudFlg(JSPUtil.getParameter(request, "inter_rmk_aud_flg", ""));
        setBlckStwgCd(JSPUtil.getParameter(request, "blck_stwg_cd", ""));
        setPolEtdDt(JSPUtil.getParameter(request, "pol_etd_dt", ""));
        setBlNo(JSPUtil.getParameter(request, "bl_no", ""));
        setPctlNo(JSPUtil.getParameter(request, "pctl_no", ""));
        setXterRqstCustRmk(JSPUtil.getParameter(request, "xter_rqst_cust_rmk", ""));
        setPolCd(JSPUtil.getParameter(request, "pol_cd", ""));
        setScNo(JSPUtil.getParameter(request, "sc_no", ""));
        setPrctFlg(JSPUtil.getParameter(request, "prct_flg", ""));
        setMyFwrdCd(JSPUtil.getParameter(request, "my_fwrd_cd", ""));
        setBlNoTp(JSPUtil.getParameter(request, "bl_no_tp", ""));
        setDelNodCd(JSPUtil.getParameter(request, "del_nod_cd", ""));
        setObSlsOfcCd(JSPUtil.getParameter(request, "ob_sls_ofc_cd", ""));
        setCustToOrdFlg(JSPUtil.getParameter(request, "cust_to_ord_flg", ""));
        setWtRsnSpclCgoFlg(JSPUtil.getParameter(request, "wt_rsn_spcl_cgo_flg", ""));
        setXterSiCd(JSPUtil.getParameter(request, "xter_si_cd", ""));
        setCndCstmsFileCd(JSPUtil.getParameter(request, "cnd_cstms_file_cd", ""));
        setMtyPkupDt(JSPUtil.getParameter(request, "mty_pkup_dt", ""));
        setXterBkgRqstCd(JSPUtil.getParameter(request, "xter_bkg_rqst_cd", ""));
        setPreRlyPortCd(JSPUtil.getParameter(request, "pre_rly_port_cd", ""));
        setCtrtCustSeq(JSPUtil.getParameter(request, "ctrt_cust_seq", ""));
        setPortClzDt(JSPUtil.getParameter(request, "port_clz_dt", ""));
        setAwkCgoFlg(JSPUtil.getParameter(request, "awk_cgo_flg", ""));
        setStopOffCntcPhnNo(JSPUtil.getParameter(request, "stop_off_cntc_phn_no", ""));
        setFnlDestCd(JSPUtil.getParameter(request, "fnl_dest_cd", ""));
        setDelCd(JSPUtil.getParameter(request, "del_cd", ""));
        setSlsRhqCd(JSPUtil.getParameter(request, "sls_rhq_cd", ""));
        setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
        setXterRmk(JSPUtil.getParameter(request, "xter_rmk", ""));
        setXterBkgRqstRefNo(JSPUtil.getParameter(request, "xter_bkg_rqst_ref_no", ""));
        setPstRlyPortCd(JSPUtil.getParameter(request, "pst_rly_port_cd", ""));
        setSplitFlg(JSPUtil.getParameter(request, "split_flg", ""));
        setPorCd(JSPUtil.getParameter(request, "por_cd", ""));
        setCtrtCustCntCd(JSPUtil.getParameter(request, "ctrt_cust_cnt_cd", ""));
        setOrgTrnsSvcModCd(JSPUtil.getParameter(request, "org_trns_svc_mod_cd", ""));
        setDocUsrId(JSPUtil.getParameter(request, "doc_usr_id", ""));
        setEqCtrlOfcCd(JSPUtil.getParameter(request, "eq_ctrl_ofc_cd", ""));
        setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
        setAdvShtgCd(JSPUtil.getParameter(request, "adv_shtg_cd", ""));
        setStopOffDiffRmk(JSPUtil.getParameter(request, "stop_off_diff_rmk", ""));
        setEqSubstFlg(JSPUtil.getParameter(request, "eq_subst_flg", ""));
        setHotDeFlg(JSPUtil.getParameter(request, "hot_de_flg", ""));
        setSplitDt(JSPUtil.getParameter(request, "split_dt", ""));
        setRfaNo(JSPUtil.getParameter(request, "rfa_no", ""));
        setRevDirCd(JSPUtil.getParameter(request, "rev_dir_cd", ""));
        setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
        setRailBlkCd(JSPUtil.getParameter(request, "rail_blk_cd", ""));
        setBbCgoFlg(JSPUtil.getParameter(request, "bb_cgo_flg", ""));
        setDcgoFlg(JSPUtil.getParameter(request, "dcgo_flg", ""));
        setKrCstmsCustTpCd(JSPUtil.getParameter(request, "kr_cstms_cust_tp_cd", ""));
        setMtyCreSvrCd(JSPUtil.getParameter(request, "mty_cre_svr_cd", ""));
        setRcvTermCd(JSPUtil.getParameter(request, "rcv_term_cd", ""));
        setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
        setSplitGdt(JSPUtil.getParameter(request, "split_gdt", ""));
        setMtyPortFlg(JSPUtil.getParameter(request, "mty_port_flg", ""));
        setMtyPodFlg(JSPUtil.getParameter(request, "mty_pod_flg", ""));
        setAllMtrFlg(JSPUtil.getParameter(request, "all_mtr_flg", ""));
        setPolNodCd(JSPUtil.getParameter(request, "pol_nod_cd", ""));
        setXterBkgKnt(JSPUtil.getParameter(request, "xter_bkg_knt", ""));
        setTwnSoNo(JSPUtil.getParameter(request, "twn_so_no", ""));
        setPodEtaDt(JSPUtil.getParameter(request, "pod_eta_dt", ""));
        setSkdDirCd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
        setBlTpCd(JSPUtil.getParameter(request, "bl_tp_cd", ""));
        setUsaCstmsFileCd(JSPUtil.getParameter(request, "usa_cstms_file_cd", ""));
        setSocFlg(JSPUtil.getParameter(request, "soc_flg", ""));
        setDeTermCd(JSPUtil.getParameter(request, "de_term_cd", ""));
        setHngrFlg(JSPUtil.getParameter(request, "hngr_flg", ""));
        setMtyRtnYdCd(JSPUtil.getParameter(request, "mty_rtn_yd_cd", ""));
        setMyFwrdVslDesc(JSPUtil.getParameter(request, "my_fwrd_vsl_desc", ""));
        setSlsRgnOfcCd(JSPUtil.getParameter(request, "sls_rgn_ofc_cd", ""));
        setEdiHldFlg(JSPUtil.getParameter(request, "edi_hld_flg", ""));
        setVndrRmk(JSPUtil.getParameter(request, "vndr_rmk", ""));
        setBkgCtrlPtyCustCntCd(JSPUtil.getParameter(request, "bkg_ctrl_pty_cust_cnt_cd", ""));
        setBkgCtrlPtyCustSeq(JSPUtil.getParameter(request, "bkg_ctrl_pty_cust_seq", ""));
        setBlckStwgFlg(JSPUtil.getParameter(request, "blck_stwg_flg", ""));
        setMotNo(JSPUtil.getParameter(request, "mot_no", ""));
        setRqstDt(JSPUtil.getParameter(request, "rqst_dt", ""));
        setRqstGdt(JSPUtil.getParameter(request, "rqst_gdt", ""));
        setBkgAlocStsCd(JSPUtil.getParameter(request, "bkg_aloc_sts_cd", ""));
        setSbBkgGidCd(JSPUtil.getParameter(request, "sb_bkg_gid_cd", ""));
        setSbBkgDirRmk(JSPUtil.getParameter(request, "sb_bkg_dir_rmk", ""));
        setCplsFrmFlg(JSPUtil.getParameter(request, "cpls_frm_flg", ""));
        setFnlGuidCd(JSPUtil.getParameter(request, "fnl_guid_cd", ""));
        setTrCd(JSPUtil.getParameter(request, "tr_cd", ""));
        setSbBkgRoleCd(JSPUtil.getParameter(request, "sb_bkg_role_cd", ""));
        setSbDt(JSPUtil.getParameter(request, "sb_dt", ""));
        setSbFrmDt(JSPUtil.getParameter(request, "sb_frm_dt", ""));
    }

    /**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgBookingVO[]
	 */
    public BkgBookingVO[] fromRequestGrid(HttpServletRequest request) {
        return fromRequestGrid(request, "");
    }

    /**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgBookingVO[]
	 */
    public BkgBookingVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
        BkgBookingVO model = null;
        String[] tmp = request.getParameterValues(prefix + "ibflag");
        if (tmp == null)
            return null;
        int length = request.getParameterValues(prefix + "ibflag").length;
        try {
            String[] bkgCgoTpCd = (JSPUtil.getParameter(request, prefix + "bkg_cgo_tp_cd", length));
            String[] orgTrnsModCd = (JSPUtil.getParameter(request, prefix + "org_trns_mod_cd", length));
            String[] svcScpCd = (JSPUtil.getParameter(request, prefix + "svc_scp_cd", length));
            String[] mtyPkupYdCd = (JSPUtil.getParameter(request, prefix + "mty_pkup_yd_cd", length));
            String[] agmtActCntCd = (JSPUtil.getParameter(request, prefix + "agmt_act_cnt_cd", length));
            String[] pagerows = (JSPUtil.getParameter(request, prefix + "pagerows", length));
            String[] obSrepCd = (JSPUtil.getParameter(request, prefix + "ob_srep_cd", length));
            String[] destTrnsSvcModCd = (JSPUtil.getParameter(request, prefix + "dest_trns_svc_mod_cd", length));
            String[] shpBakFlg = (JSPUtil.getParameter(request, prefix + "shp_bak_flg", length));
            String[] ctrtOfcCd = (JSPUtil.getParameter(request, prefix + "ctrt_ofc_cd", length));
            String[] bkgCreDt = (JSPUtil.getParameter(request, prefix + "bkg_cre_dt", length));
            String[] stwgRmk = (JSPUtil.getParameter(request, prefix + "stwg_rmk", length));
            String[] stwgCd = (JSPUtil.getParameter(request, prefix + "stwg_cd", length));
            String[] siFlg = (JSPUtil.getParameter(request, prefix + "si_flg", length));
            String[] chnAgnCd = (JSPUtil.getParameter(request, prefix + "chn_agn_cd", length));
            String[] updUsrId = (JSPUtil.getParameter(request, prefix + "upd_usr_id", length));
            String[] hcmtCmbFlg = (JSPUtil.getParameter(request, prefix + "hcmt_cmb_flg", length));
            String[] bkgOfcCd = (JSPUtil.getParameter(request, prefix + "bkg_ofc_cd", length));
            String[] mnlBkgNoFlg = (JSPUtil.getParameter(request, prefix + "mnl_bkg_no_flg", length));
            String[] blIssBlckFlg = (JSPUtil.getParameter(request, prefix + "bl_iss_blck_flg", length));
            String[] dblBkgFlg = (JSPUtil.getParameter(request, prefix + "dbl_bkg_flg", length));
            String[] xterSiRefNo = (JSPUtil.getParameter(request, prefix + "xter_si_ref_no", length));
            String[] agmtActCustSeq = (JSPUtil.getParameter(request, prefix + "agmt_act_cust_seq", length));
            String[] orgScontiCd = (JSPUtil.getParameter(request, prefix + "org_sconti_cd", length));
            String[] skdVoyNo = (JSPUtil.getParameter(request, prefix + "skd_voy_no", length));
            String[] fullRtnYdCd = (JSPUtil.getParameter(request, prefix + "full_rtn_yd_cd", length));
            String[] splitRto = (JSPUtil.getParameter(request, prefix + "split_rto", length));
            String[] podCd = (JSPUtil.getParameter(request, prefix + "pod_cd", length));
            String[] deDueDt = (JSPUtil.getParameter(request, prefix + "de_due_dt", length));
            String[] lodgDueDt = (JSPUtil.getParameter(request, prefix + "lodg_due_dt", length));
            String[] bkgNo = (JSPUtil.getParameter(request, prefix + "bkg_no", length));
            String[] podNodCd = (JSPUtil.getParameter(request, prefix + "pod_nod_cd", length));
            String[] wtRsnHldFlg = (JSPUtil.getParameter(request, prefix + "wt_rsn_hld_flg", length));
            String[] mtyPreVvdFlg = (JSPUtil.getParameter(request, prefix + "mty_pre_vvd_flg", length));
            String[] toBkgNo = (JSPUtil.getParameter(request, prefix + "to_bkg_no", length));
            String[] fmBkgNo = (JSPUtil.getParameter(request, prefix + "fm_bkg_no", length));
            String[] ctrtSrepCd = (JSPUtil.getParameter(request, prefix + "ctrt_srep_cd", length));
            String[] spclHideFlg = (JSPUtil.getParameter(request, prefix + "spcl_hide_flg", length));
            String[] rcFlg = (JSPUtil.getParameter(request, prefix + "rc_flg", length));
            String[] splitRsnCd = (JSPUtil.getParameter(request, prefix + "split_rsn_cd", length));
            String[] ibDelDeGdt = (JSPUtil.getParameter(request, prefix + "ib_del_de_gdt", length));
            String[] destTrnsModCd = (JSPUtil.getParameter(request, prefix + "dest_trns_mod_cd", length));
            String[] stopOffLocCd = (JSPUtil.getParameter(request, prefix + "stop_off_loc_cd", length));
            String[] rdCgoFlg = (JSPUtil.getParameter(request, prefix + "rd_cgo_flg", length));
            String[] bkgStsCd = (JSPUtil.getParameter(request, prefix + "bkg_sts_cd", length));
            String[] fdGrdFlg = (JSPUtil.getParameter(request, prefix + "fd_grd_flg", length));
            String[] ovrVoidSltQty = (JSPUtil.getParameter(request, prefix + "ovr_void_slt_qty", length));
            String[] xterSiKnt = (JSPUtil.getParameter(request, prefix + "xter_si_knt", length));
            String[] mtySplitAvalCd = (JSPUtil.getParameter(request, prefix + "mty_split_aval_cd", length));
            String[] interRmk = (JSPUtil.getParameter(request, prefix + "inter_rmk", length));
            String[] scacCd = (JSPUtil.getParameter(request, prefix + "scac_cd", length));
            String[] cmdtCd = (JSPUtil.getParameter(request, prefix + "cmdt_cd", length));
            String[] apBrogFlg = (JSPUtil.getParameter(request, prefix + "ap_brog_flg", length));
            String[] fullPkupYdCd = (JSPUtil.getParameter(request, prefix + "full_pkup_yd_cd", length));
            String[] bkgCxlDt = (JSPUtil.getParameter(request, prefix + "bkg_cxl_dt", length));
            String[] ibSlsOfcCd = (JSPUtil.getParameter(request, prefix + "ib_sls_ofc_cd", length));
            String[] altCustCfmFlg = (JSPUtil.getParameter(request, prefix + "alt_cust_cfm_flg", length));
            String[] stopOffCntcPsonNm = (JSPUtil.getParameter(request, prefix + "stop_off_cntc_pson_nm", length));
            String[] porNodCd = (JSPUtil.getParameter(request, prefix + "por_nod_cd", length));
            String[] samCneeNtfyFlg = (JSPUtil.getParameter(request, prefix + "sam_cnee_ntfy_flg", length));
            String[] xterRqstAutoNtcFlg = (JSPUtil.getParameter(request, prefix + "xter_rqst_auto_ntc_flg", length));
            String[] bkgCreGdt = (JSPUtil.getParameter(request, prefix + "bkg_cre_gdt", length));
            String[] destScontiCd = (JSPUtil.getParameter(request, prefix + "dest_sconti_cd", length));
            String[] mtyDorArrDt = (JSPUtil.getParameter(request, prefix + "mty_dor_arr_dt", length));
            String[] bkgCreTpCd = (JSPUtil.getParameter(request, prefix + "bkg_cre_tp_cd", length));
            String[] slanCd = (JSPUtil.getParameter(request, prefix + "slan_cd", length));
            String[] taaNo = (JSPUtil.getParameter(request, prefix + "taa_no", length));
            String[] flexHgtFlg = (JSPUtil.getParameter(request, prefix + "flex_hgt_flg", length));
            String[] bkgCxlGdt = (JSPUtil.getParameter(request, prefix + "bkg_cxl_gdt", length));
            String[] repCmdtCd = (JSPUtil.getParameter(request, prefix + "rep_cmdt_cd", length));
            String[] vslCd = (JSPUtil.getParameter(request, prefix + "vsl_cd", length));
            String[] mtyBkgStsCd = (JSPUtil.getParameter(request, prefix + "mty_bkg_sts_cd", length));
            String[] caInspDueDt = (JSPUtil.getParameter(request, prefix + "ca_insp_due_dt", length));
            String[] ibDelDeDt = (JSPUtil.getParameter(request, prefix + "ib_del_de_dt", length));
            String[] ocpCd = (JSPUtil.getParameter(request, prefix + "ocp_cd", length));
            String[] interRmkAudFlg = (JSPUtil.getParameter(request, prefix + "inter_rmk_aud_flg", length));
            String[] blckStwgCd = (JSPUtil.getParameter(request, prefix + "blck_stwg_cd", length));
            String[] polEtdDt = (JSPUtil.getParameter(request, prefix + "pol_etd_dt", length));
            String[] blNo = (JSPUtil.getParameter(request, prefix + "bl_no", length));
            String[] pctlNo = (JSPUtil.getParameter(request, prefix + "pctl_no", length));
            String[] xterRqstCustRmk = (JSPUtil.getParameter(request, prefix + "xter_rqst_cust_rmk", length));
            String[] polCd = (JSPUtil.getParameter(request, prefix + "pol_cd", length));
            String[] scNo = (JSPUtil.getParameter(request, prefix + "sc_no", length));
            String[] prctFlg = (JSPUtil.getParameter(request, prefix + "prct_flg", length));
            String[] myFwrdCd = (JSPUtil.getParameter(request, prefix + "my_fwrd_cd", length));
            String[] blNoTp = (JSPUtil.getParameter(request, prefix + "bl_no_tp", length));
            String[] delNodCd = (JSPUtil.getParameter(request, prefix + "del_nod_cd", length));
            String[] obSlsOfcCd = (JSPUtil.getParameter(request, prefix + "ob_sls_ofc_cd", length));
            String[] custToOrdFlg = (JSPUtil.getParameter(request, prefix + "cust_to_ord_flg", length));
            String[] wtRsnSpclCgoFlg = (JSPUtil.getParameter(request, prefix + "wt_rsn_spcl_cgo_flg", length));
            String[] xterSiCd = (JSPUtil.getParameter(request, prefix + "xter_si_cd", length));
            String[] cndCstmsFileCd = (JSPUtil.getParameter(request, prefix + "cnd_cstms_file_cd", length));
            String[] mtyPkupDt = (JSPUtil.getParameter(request, prefix + "mty_pkup_dt", length));
            String[] xterBkgRqstCd = (JSPUtil.getParameter(request, prefix + "xter_bkg_rqst_cd", length));
            String[] preRlyPortCd = (JSPUtil.getParameter(request, prefix + "pre_rly_port_cd", length));
            String[] ctrtCustSeq = (JSPUtil.getParameter(request, prefix + "ctrt_cust_seq", length));
            String[] portClzDt = (JSPUtil.getParameter(request, prefix + "port_clz_dt", length));
            String[] awkCgoFlg = (JSPUtil.getParameter(request, prefix + "awk_cgo_flg", length));
            String[] stopOffCntcPhnNo = (JSPUtil.getParameter(request, prefix + "stop_off_cntc_phn_no", length));
            String[] fnlDestCd = (JSPUtil.getParameter(request, prefix + "fnl_dest_cd", length));
            String[] delCd = (JSPUtil.getParameter(request, prefix + "del_cd", length));
            String[] slsRhqCd = (JSPUtil.getParameter(request, prefix + "sls_rhq_cd", length));
            String[] creUsrId = (JSPUtil.getParameter(request, prefix + "cre_usr_id", length));
            String[] xterRmk = (JSPUtil.getParameter(request, prefix + "xter_rmk", length));
            String[] xterBkgRqstRefNo = (JSPUtil.getParameter(request, prefix + "xter_bkg_rqst_ref_no", length));
            String[] pstRlyPortCd = (JSPUtil.getParameter(request, prefix + "pst_rly_port_cd", length));
            String[] splitFlg = (JSPUtil.getParameter(request, prefix + "split_flg", length));
            String[] porCd = (JSPUtil.getParameter(request, prefix + "por_cd", length));
            String[] ctrtCustCntCd = (JSPUtil.getParameter(request, prefix + "ctrt_cust_cnt_cd", length));
            String[] orgTrnsSvcModCd = (JSPUtil.getParameter(request, prefix + "org_trns_svc_mod_cd", length));
            String[] docUsrId = (JSPUtil.getParameter(request, prefix + "doc_usr_id", length));
            String[] eqCtrlOfcCd = (JSPUtil.getParameter(request, prefix + "eq_ctrl_ofc_cd", length));
            String[] creDt = (JSPUtil.getParameter(request, prefix + "cre_dt", length));
            String[] advShtgCd = (JSPUtil.getParameter(request, prefix + "adv_shtg_cd", length));
            String[] stopOffDiffRmk = (JSPUtil.getParameter(request, prefix + "stop_off_diff_rmk", length));
            String[] eqSubstFlg = (JSPUtil.getParameter(request, prefix + "eq_subst_flg", length));
            String[] hotDeFlg = (JSPUtil.getParameter(request, prefix + "hot_de_flg", length));
            String[] splitDt = (JSPUtil.getParameter(request, prefix + "split_dt", length));
            String[] rfaNo = (JSPUtil.getParameter(request, prefix + "rfa_no", length));
            String[] revDirCd = (JSPUtil.getParameter(request, prefix + "rev_dir_cd", length));
            String[] ibflag = (JSPUtil.getParameter(request, prefix + "ibflag", length));
            String[] railBlkCd = (JSPUtil.getParameter(request, prefix + "rail_blk_cd", length));
            String[] bbCgoFlg = (JSPUtil.getParameter(request, prefix + "bb_cgo_flg", length));
            String[] dcgoFlg = (JSPUtil.getParameter(request, prefix + "dcgo_flg", length));
            String[] krCstmsCustTpCd = (JSPUtil.getParameter(request, prefix + "kr_cstms_cust_tp_cd", length));
            String[] mtyCreSvrCd = (JSPUtil.getParameter(request, prefix + "mty_cre_svr_cd", length));
            String[] rcvTermCd = (JSPUtil.getParameter(request, prefix + "rcv_term_cd", length));
            String[] updDt = (JSPUtil.getParameter(request, prefix + "upd_dt", length));
            String[] splitGdt = (JSPUtil.getParameter(request, prefix + "split_gdt", length));
            String[] mtyPortFlg = (JSPUtil.getParameter(request, prefix + "mty_port_flg", length));
            String[] mtyPodFlg = (JSPUtil.getParameter(request, prefix + "mty_pod_flg", length));
            String[] allMtrFlg = (JSPUtil.getParameter(request, prefix + "all_mtr_flg", length));
            String[] polNodCd = (JSPUtil.getParameter(request, prefix + "pol_nod_cd", length));
            String[] xterBkgKnt = (JSPUtil.getParameter(request, prefix + "xter_bkg_knt", length));
            String[] twnSoNo = (JSPUtil.getParameter(request, prefix + "twn_so_no", length));
            String[] podEtaDt = (JSPUtil.getParameter(request, prefix + "pod_eta_dt", length));
            String[] skdDirCd = (JSPUtil.getParameter(request, prefix + "skd_dir_cd", length));
            String[] blTpCd = (JSPUtil.getParameter(request, prefix + "bl_tp_cd", length));
            String[] usaCstmsFileCd = (JSPUtil.getParameter(request, prefix + "usa_cstms_file_cd", length));
            String[] socFlg = (JSPUtil.getParameter(request, prefix + "soc_flg", length));
            String[] deTermCd = (JSPUtil.getParameter(request, prefix + "de_term_cd", length));
            String[] hngrFlg = (JSPUtil.getParameter(request, prefix + "hngr_flg", length));
            String[] mtyRtnYdCd = (JSPUtil.getParameter(request, prefix + "mty_rtn_yd_cd", length));
            String[] myFwrdVslDesc = (JSPUtil.getParameter(request, prefix + "my_fwrd_vsl_desc", length));
            String[] slsRgnOfcCd = (JSPUtil.getParameter(request, prefix + "sls_rgn_ofc_cd", length));
            String[] ediHldFlg = (JSPUtil.getParameter(request, prefix + "edi_hld_flg", length));
            String[] vndrRmk = (JSPUtil.getParameter(request, prefix + "vndr_rmk", length));
            String[] bkgCtrlPtyCustCntCd = (JSPUtil.getParameter(request, prefix + "bkg_ctrl_pty_cust_cnt_cd", length));
            String[] bkgCtrlPtyCustSeq = (JSPUtil.getParameter(request, prefix + "bkg_ctrl_pty_cust_seq", length));
            String[] blckStwgFlg = (JSPUtil.getParameter(request, prefix + "blck_stwg_flg", length));
            String[] bkgWtChkFlg = (JSPUtil.getParameter(request, prefix + "bkg_wt_chk_flg", length));
            String[] irrBlNoFlg = (JSPUtil.getParameter(request, prefix + "irr_bl_no_flg", length));
            String[] bkgPtyCntCd = (JSPUtil.getParameter(request, prefix + "bkg_pty_cnt_cd", length));
	    	String[] bkgPtyCustSeq = (JSPUtil.getParameter(request, prefix + "bkg_pty_cust_seq", length));
	    	String[] motNo = (JSPUtil.getParameter(request, prefix + "mot_no", length));
	    	String[] rqstDt = (JSPUtil.getParameter(request, prefix + "rqst_dt", length));
	    	String[] rqstGdt = (JSPUtil.getParameter(request, prefix + "rqst_gdt", length));
	    	String[] bkgAlocStsCd = (JSPUtil.getParameter(request, prefix + "bkg_aloc_sts_cd", length));
	    	String[] sbBkgGidCd = (JSPUtil.getParameter(request, prefix + "sb_bkg_gid_cd", length));
	    	String[] sbBkgDirRmk = (JSPUtil.getParameter(request, prefix + "sb_bkg_dir_rmk", length));
	    	String[] cplsFrmFlg = (JSPUtil.getParameter(request, prefix + "cpls_frm_flg", length));
	    	String[] fnlGuidCd = (JSPUtil.getParameter(request, prefix + "fnl_guid_cd", length));
	    	String[] trCd = (JSPUtil.getParameter(request, prefix + "tr_cd", length));
	    	String[] sbBkgRoleCd = (JSPUtil.getParameter(request, prefix + "sb_bkg_role_cd", length));
	    	String[] sbDt = (JSPUtil.getParameter(request, prefix + "sb_dt", length));
	    	String[] sbFrmDt = (JSPUtil.getParameter(request, prefix + "sb_frm_dt", length));
	    	/* Add a field line, do not delete */
            for (int i = 0; i < length; i++) {
                model = new BkgBookingVO();
                if (bkgCgoTpCd[i] != null)
                    model.setBkgCgoTpCd(bkgCgoTpCd[i]);
                if (orgTrnsModCd[i] != null)
                    model.setOrgTrnsModCd(orgTrnsModCd[i]);
                if (svcScpCd[i] != null)
                    model.setSvcScpCd(svcScpCd[i]);
                if (mtyPkupYdCd[i] != null)
                    model.setMtyPkupYdCd(mtyPkupYdCd[i]);
                if (agmtActCntCd[i] != null)
                    model.setAgmtActCntCd(agmtActCntCd[i]);
                if (pagerows[i] != null)
                    model.setPagerows(pagerows[i]);
                if (obSrepCd[i] != null)
                    model.setObSrepCd(obSrepCd[i]);
                if (destTrnsSvcModCd[i] != null)
                    model.setDestTrnsSvcModCd(destTrnsSvcModCd[i]);
                if (shpBakFlg[i] != null)
                    model.setShpBakFlg(shpBakFlg[i]);
                if (ctrtOfcCd[i] != null)
                    model.setCtrtOfcCd(ctrtOfcCd[i]);
                if (bkgCreDt[i] != null)
                    model.setBkgCreDt(bkgCreDt[i]);
                if (stwgRmk[i] != null)
                    model.setStwgRmk(stwgRmk[i]);
                if (stwgCd[i] != null)
                    model.setStwgCd(stwgCd[i]);
                if (siFlg[i] != null)
                    model.setSiFlg(siFlg[i]);
                if (chnAgnCd[i] != null)
                    model.setChnAgnCd(chnAgnCd[i]);
                if (updUsrId[i] != null)
                    model.setUpdUsrId(updUsrId[i]);
                if (hcmtCmbFlg[i] != null)
                    model.setHcmtCmbFlg(hcmtCmbFlg[i]);
                if (bkgOfcCd[i] != null)
                    model.setBkgOfcCd(bkgOfcCd[i]);
                if (mnlBkgNoFlg[i] != null)
                    model.setMnlBkgNoFlg(mnlBkgNoFlg[i]);
                if (blIssBlckFlg[i] != null)
                    model.setBlIssBlckFlg(blIssBlckFlg[i]);
                if (dblBkgFlg[i] != null)
                    model.setDblBkgFlg(dblBkgFlg[i]);
                if (xterSiRefNo[i] != null)
                    model.setXterSiRefNo(xterSiRefNo[i]);
                if (agmtActCustSeq[i] != null)
                    model.setAgmtActCustSeq(agmtActCustSeq[i]);
                if (orgScontiCd[i] != null)
                    model.setOrgScontiCd(orgScontiCd[i]);
                if (skdVoyNo[i] != null)
                    model.setSkdVoyNo(skdVoyNo[i]);
                if (fullRtnYdCd[i] != null)
                    model.setFullRtnYdCd(fullRtnYdCd[i]);
                if (splitRto[i] != null)
                    model.setSplitRto(splitRto[i]);
                if (podCd[i] != null)
                    model.setPodCd(podCd[i]);
                if (deDueDt[i] != null)
                    model.setDeDueDt(deDueDt[i]);
                if (lodgDueDt[i] != null)
                    model.setLodgDueDt(lodgDueDt[i]);
                if (bkgNo[i] != null)
                    model.setBkgNo(bkgNo[i]);
                if (podNodCd[i] != null)
                    model.setPodNodCd(podNodCd[i]);
                if (wtRsnHldFlg[i] != null)
                    model.setWtRsnHldFlg(wtRsnHldFlg[i]);
                if (mtyPreVvdFlg[i] != null)
                    model.setMtyPreVvdFlg(mtyPreVvdFlg[i]);
                if (toBkgNo[i] != null)
                    model.setToBkgNo(toBkgNo[i]);
                if (fmBkgNo[i] != null)
                    model.setFmBkgNo(fmBkgNo[i]);
                if (ctrtSrepCd[i] != null)
                    model.setCtrtSrepCd(ctrtSrepCd[i]);
                if (spclHideFlg[i] != null)
                    model.setSpclHideFlg(spclHideFlg[i]);
                if (rcFlg[i] != null)
                    model.setRcFlg(rcFlg[i]);
                if (splitRsnCd[i] != null)
                    model.setSplitRsnCd(splitRsnCd[i]);
                if (ibDelDeGdt[i] != null)
                    model.setIbDelDeGdt(ibDelDeGdt[i]);
                if (destTrnsModCd[i] != null)
                    model.setDestTrnsModCd(destTrnsModCd[i]);
                if (stopOffLocCd[i] != null)
                    model.setStopOffLocCd(stopOffLocCd[i]);
                if (rdCgoFlg[i] != null)
                    model.setRdCgoFlg(rdCgoFlg[i]);
                if (bkgStsCd[i] != null)
                    model.setBkgStsCd(bkgStsCd[i]);
                if (fdGrdFlg[i] != null)
                    model.setFdGrdFlg(fdGrdFlg[i]);
                if (ovrVoidSltQty[i] != null)
                    model.setOvrVoidSltQty(ovrVoidSltQty[i]);
                if (xterSiKnt[i] != null)
                    model.setXterSiKnt(xterSiKnt[i]);
                if (mtySplitAvalCd[i] != null)
                    model.setMtySplitAvalCd(mtySplitAvalCd[i]);
                if (interRmk[i] != null)
                    model.setInterRmk(interRmk[i]);
                if (scacCd[i] != null)
                    model.setScacCd(scacCd[i]);
                if (cmdtCd[i] != null)
                    model.setCmdtCd(cmdtCd[i]);
                if (apBrogFlg[i] != null)
                    model.setApBrogFlg(apBrogFlg[i]);
                if (fullPkupYdCd[i] != null)
                    model.setFullPkupYdCd(fullPkupYdCd[i]);
                if (bkgCxlDt[i] != null)
                    model.setBkgCxlDt(bkgCxlDt[i]);
                if (ibSlsOfcCd[i] != null)
                    model.setIbSlsOfcCd(ibSlsOfcCd[i]);
                if (altCustCfmFlg[i] != null)
                    model.setAltCustCfmFlg(altCustCfmFlg[i]);
                if (stopOffCntcPsonNm[i] != null)
                    model.setStopOffCntcPsonNm(stopOffCntcPsonNm[i]);
                if (porNodCd[i] != null)
                    model.setPorNodCd(porNodCd[i]);
                if (samCneeNtfyFlg[i] != null)
                    model.setSamCneeNtfyFlg(samCneeNtfyFlg[i]);
                if (xterRqstAutoNtcFlg[i] != null)
                    model.setXterRqstAutoNtcFlg(xterRqstAutoNtcFlg[i]);
                if (bkgCreGdt[i] != null)
                    model.setBkgCreGdt(bkgCreGdt[i]);
                if (destScontiCd[i] != null)
                    model.setDestScontiCd(destScontiCd[i]);
                if (mtyDorArrDt[i] != null)
                    model.setMtyDorArrDt(mtyDorArrDt[i]);
                if (bkgCreTpCd[i] != null)
                    model.setBkgCreTpCd(bkgCreTpCd[i]);
                if (slanCd[i] != null)
                    model.setSlanCd(slanCd[i]);
                if (taaNo[i] != null)
                    model.setTaaNo(taaNo[i]);
                if (flexHgtFlg[i] != null)
                    model.setFlexHgtFlg(flexHgtFlg[i]);
                if (bkgCxlGdt[i] != null)
                    model.setBkgCxlGdt(bkgCxlGdt[i]);
                if (repCmdtCd[i] != null)
                    model.setRepCmdtCd(repCmdtCd[i]);
                if (vslCd[i] != null)
                    model.setVslCd(vslCd[i]);
                if (mtyBkgStsCd[i] != null)
                    model.setMtyBkgStsCd(mtyBkgStsCd[i]);
                if (caInspDueDt[i] != null)
                    model.setCaInspDueDt(caInspDueDt[i]);
                if (ibDelDeDt[i] != null)
                    model.setIbDelDeDt(ibDelDeDt[i]);
                if (ocpCd[i] != null)
                    model.setOcpCd(ocpCd[i]);
                if (interRmkAudFlg[i] != null)
                    model.setInterRmkAudFlg(interRmkAudFlg[i]);
                if (blckStwgCd[i] != null)
                    model.setBlckStwgCd(blckStwgCd[i]);
                if (polEtdDt[i] != null)
                    model.setPolEtdDt(polEtdDt[i]);
                if (blNo[i] != null)
                    model.setBlNo(blNo[i]);
                if (pctlNo[i] != null)
                    model.setPctlNo(pctlNo[i]);
                if (xterRqstCustRmk[i] != null)
                    model.setXterRqstCustRmk(xterRqstCustRmk[i]);
                if (polCd[i] != null)
                    model.setPolCd(polCd[i]);
                if (scNo[i] != null)
                    model.setScNo(scNo[i]);
                if (prctFlg[i] != null)
                    model.setPrctFlg(prctFlg[i]);
                if (myFwrdCd[i] != null)
                    model.setMyFwrdCd(myFwrdCd[i]);
                if (blNoTp[i] != null)
                    model.setBlNoTp(blNoTp[i]);
                if (delNodCd[i] != null)
                    model.setDelNodCd(delNodCd[i]);
                if (obSlsOfcCd[i] != null)
                    model.setObSlsOfcCd(obSlsOfcCd[i]);
                if (custToOrdFlg[i] != null)
                    model.setCustToOrdFlg(custToOrdFlg[i]);
                if (wtRsnSpclCgoFlg[i] != null)
                    model.setWtRsnSpclCgoFlg(wtRsnSpclCgoFlg[i]);
                if (xterSiCd[i] != null)
                    model.setXterSiCd(xterSiCd[i]);
                if (cndCstmsFileCd[i] != null)
                    model.setCndCstmsFileCd(cndCstmsFileCd[i]);
                if (mtyPkupDt[i] != null)
                    model.setMtyPkupDt(mtyPkupDt[i]);
                if (xterBkgRqstCd[i] != null)
                    model.setXterBkgRqstCd(xterBkgRqstCd[i]);
                if (preRlyPortCd[i] != null)
                    model.setPreRlyPortCd(preRlyPortCd[i]);
                if (ctrtCustSeq[i] != null)
                    model.setCtrtCustSeq(ctrtCustSeq[i]);
                if (portClzDt[i] != null)
                    model.setPortClzDt(portClzDt[i]);
                if (awkCgoFlg[i] != null)
                    model.setAwkCgoFlg(awkCgoFlg[i]);
                if (stopOffCntcPhnNo[i] != null)
                    model.setStopOffCntcPhnNo(stopOffCntcPhnNo[i]);
                if (fnlDestCd[i] != null)
                    model.setFnlDestCd(fnlDestCd[i]);
                if (delCd[i] != null)
                    model.setDelCd(delCd[i]);
                if (slsRhqCd[i] != null)
                    model.setSlsRhqCd(slsRhqCd[i]);
                if (creUsrId[i] != null)
                    model.setCreUsrId(creUsrId[i]);
                if (xterRmk[i] != null)
                    model.setXterRmk(xterRmk[i]);
                if (xterBkgRqstRefNo[i] != null)
                    model.setXterBkgRqstRefNo(xterBkgRqstRefNo[i]);
                if (pstRlyPortCd[i] != null)
                    model.setPstRlyPortCd(pstRlyPortCd[i]);
                if (splitFlg[i] != null)
                    model.setSplitFlg(splitFlg[i]);
                if (porCd[i] != null)
                    model.setPorCd(porCd[i]);
                if (ctrtCustCntCd[i] != null)
                    model.setCtrtCustCntCd(ctrtCustCntCd[i]);
                if (orgTrnsSvcModCd[i] != null)
                    model.setOrgTrnsSvcModCd(orgTrnsSvcModCd[i]);
                if (docUsrId[i] != null)
                    model.setDocUsrId(docUsrId[i]);
                if (eqCtrlOfcCd[i] != null)
                    model.setEqCtrlOfcCd(eqCtrlOfcCd[i]);
                if (creDt[i] != null)
                    model.setCreDt(creDt[i]);
                if (advShtgCd[i] != null)
                    model.setAdvShtgCd(advShtgCd[i]);
                if (stopOffDiffRmk[i] != null)
                    model.setStopOffDiffRmk(stopOffDiffRmk[i]);
                if (eqSubstFlg[i] != null)
                    model.setEqSubstFlg(eqSubstFlg[i]);
                if (hotDeFlg[i] != null)
                    model.setHotDeFlg(hotDeFlg[i]);
                if (splitDt[i] != null)
                    model.setSplitDt(splitDt[i]);
                if (rfaNo[i] != null)
                    model.setRfaNo(rfaNo[i]);
                if (revDirCd[i] != null)
                    model.setRevDirCd(revDirCd[i]);
                if (ibflag[i] != null)
                    model.setIbflag(ibflag[i]);
                if (railBlkCd[i] != null)
                    model.setRailBlkCd(railBlkCd[i]);
                if (bbCgoFlg[i] != null)
                    model.setBbCgoFlg(bbCgoFlg[i]);
                if (dcgoFlg[i] != null)
                    model.setDcgoFlg(dcgoFlg[i]);
                if (krCstmsCustTpCd[i] != null)
                    model.setKrCstmsCustTpCd(krCstmsCustTpCd[i]);
                if (mtyCreSvrCd[i] != null)
                    model.setMtyCreSvrCd(mtyCreSvrCd[i]);
                if (rcvTermCd[i] != null)
                    model.setRcvTermCd(rcvTermCd[i]);
                if (updDt[i] != null)
                    model.setUpdDt(updDt[i]);
                if (splitGdt[i] != null)
                    model.setSplitGdt(splitGdt[i]);
                if (mtyPortFlg[i] != null)
                    model.setMtyPortFlg(mtyPortFlg[i]);
                if (mtyPodFlg[i] != null)
                    model.setMtyPodFlg(mtyPodFlg[i]);
                if (allMtrFlg[i] != null)
                    model.setAllMtrFlg(allMtrFlg[i]);
                if (polNodCd[i] != null)
                    model.setPolNodCd(polNodCd[i]);
                if (xterBkgKnt[i] != null)
                    model.setXterBkgKnt(xterBkgKnt[i]);
                if (twnSoNo[i] != null)
                    model.setTwnSoNo(twnSoNo[i]);
                if (podEtaDt[i] != null)
                    model.setPodEtaDt(podEtaDt[i]);
                if (skdDirCd[i] != null)
                    model.setSkdDirCd(skdDirCd[i]);
                if (blTpCd[i] != null)
                    model.setBlTpCd(blTpCd[i]);
                if (usaCstmsFileCd[i] != null)
                    model.setUsaCstmsFileCd(usaCstmsFileCd[i]);
                if (socFlg[i] != null)
                    model.setSocFlg(socFlg[i]);
                if (deTermCd[i] != null)
                    model.setDeTermCd(deTermCd[i]);
                if (hngrFlg[i] != null)
                    model.setHngrFlg(hngrFlg[i]);
                if (mtyRtnYdCd[i] != null)
                    model.setMtyRtnYdCd(mtyRtnYdCd[i]);
                if (myFwrdVslDesc[i] != null)
                    model.setMyFwrdVslDesc(myFwrdVslDesc[i]);
                if (slsRgnOfcCd[i] != null)
                    model.setSlsRgnOfcCd(slsRgnOfcCd[i]);
                if (ediHldFlg[i] != null)
                    model.setEdiHldFlg(ediHldFlg[i]);
                if (vndrRmk[i] != null)
                    model.setVndrRmk(vndrRmk[i]);
                if (bkgCtrlPtyCustCntCd[i] != null)
                    model.setBkgCtrlPtyCustCntCd(bkgCtrlPtyCustCntCd[i]);
                if (bkgCtrlPtyCustSeq[i] != null)
                    model.setBkgCtrlPtyCustSeq(bkgCtrlPtyCustSeq[i]);
                if (blckStwgFlg[i] != null)
                    model.setBlckStwgFlg(blckStwgFlg[i]);
                if (bkgWtChkFlg[i] != null)
                    model.setBkgWtChkFlg(bkgWtChkFlg[i]);
                if (irrBlNoFlg[i] != null)
                    model.setIrrBlNoFlg(irrBlNoFlg[i]);
                if (bkgPtyCntCd[i] != null) 
		    		model.setBkgPtyCntCd(bkgPtyCntCd[i]);
				if (bkgPtyCustSeq[i] != null) 
		    		model.setBkgPtyCustSeq(bkgPtyCustSeq[i]);
				if (motNo[i] != null) 
		    		model.setMotNo(motNo[i]);
				if (rqstDt[i] != null) 
		    		model.setRqstDt(rqstDt[i]);
				if (rqstGdt[i] != null) 
		    		model.setRqstGdt(rqstGdt[i]);
				if (bkgAlocStsCd[i] != null) 
		    		model.setBkgAlocStsCd(bkgAlocStsCd[i]);
				if (sbBkgGidCd[i] != null) 
		    		model.setSbBkgGidCd(sbBkgGidCd[i]);
				if (sbBkgDirRmk[i] != null) 
		    		model.setSbBkgDirRmk(sbBkgDirRmk[i]);
				if (cplsFrmFlg[i] != null) 
		    		model.setCplsFrmFlg(cplsFrmFlg[i]);
				if (fnlGuidCd[i] != null) 
		    		model.setFnlGuidCd(fnlGuidCd[i]);
				if (trCd[i] != null) 
		    		model.setTrCd(trCd[i]);
				if (sbBkgRoleCd[i] != null) 
		    		model.setSbBkgRoleCd(sbBkgRoleCd[i]);
				if (sbDt[i] != null) 
		    		model.setSbDt(sbDt[i]);
				if (sbFrmDt[i] != null) 
		    		model.setSbFrmDt(sbFrmDt[i]);
				/* Add a Method line, do not delete */
                models.add(model);
            }
        } catch (Exception e) {
            return null;
        }
        return getBkgBookingVOs();
    }

    /**
	 * VO 배열을 반환
	 * @return BkgBookingVO[]
	 */
    public BkgBookingVO[] getBkgBookingVOs() {
        BkgBookingVO[] vos = (BkgBookingVO[]) models.toArray(new BkgBookingVO[models.size()]);
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
        this.bkgCgoTpCd = this.bkgCgoTpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.orgTrnsModCd = this.orgTrnsModCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.svcScpCd = this.svcScpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.mtyPkupYdCd = this.mtyPkupYdCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.agmtActCntCd = this.agmtActCntCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.pagerows = this.pagerows.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.obSrepCd = this.obSrepCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.destTrnsSvcModCd = this.destTrnsSvcModCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.shpBakFlg = this.shpBakFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ctrtOfcCd = this.ctrtOfcCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.bkgCreDt = this.bkgCreDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.stwgRmk = this.stwgRmk.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.stwgCd = this.stwgCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.siFlg = this.siFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.chnAgnCd = this.chnAgnCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.updUsrId = this.updUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.hcmtCmbFlg = this.hcmtCmbFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.bkgOfcCd = this.bkgOfcCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.mnlBkgNoFlg = this.mnlBkgNoFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.blIssBlckFlg = this.blIssBlckFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.dblBkgFlg = this.dblBkgFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.xterSiRefNo = this.xterSiRefNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.agmtActCustSeq = this.agmtActCustSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.orgScontiCd = this.orgScontiCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.skdVoyNo = this.skdVoyNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.fullRtnYdCd = this.fullRtnYdCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.splitRto = this.splitRto.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.podCd = this.podCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.deDueDt = this.deDueDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.lodgDueDt = this.lodgDueDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.bkgNo = this.bkgNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.podNodCd = this.podNodCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.wtRsnHldFlg = this.wtRsnHldFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.mtyPreVvdFlg = this.mtyPreVvdFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.toBkgNo = this.toBkgNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.fmBkgNo = this.fmBkgNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ctrtSrepCd = this.ctrtSrepCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.spclHideFlg = this.spclHideFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.rcFlg = this.rcFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.splitRsnCd = this.splitRsnCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ibDelDeGdt = this.ibDelDeGdt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.destTrnsModCd = this.destTrnsModCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.stopOffLocCd = this.stopOffLocCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.rdCgoFlg = this.rdCgoFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.bkgStsCd = this.bkgStsCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.fdGrdFlg = this.fdGrdFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ovrVoidSltQty = this.ovrVoidSltQty.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.xterSiKnt = this.xterSiKnt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.mtySplitAvalCd = this.mtySplitAvalCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.interRmk = this.interRmk.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.scacCd = this.scacCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.cmdtCd = this.cmdtCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.apBrogFlg = this.apBrogFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.fullPkupYdCd = this.fullPkupYdCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.bkgCxlDt = this.bkgCxlDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ibSlsOfcCd = this.ibSlsOfcCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.altCustCfmFlg = this.altCustCfmFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.stopOffCntcPsonNm = this.stopOffCntcPsonNm.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.porNodCd = this.porNodCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.samCneeNtfyFlg = this.samCneeNtfyFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.xterRqstAutoNtcFlg = this.xterRqstAutoNtcFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.bkgCreGdt = this.bkgCreGdt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.destScontiCd = this.destScontiCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.mtyDorArrDt = this.mtyDorArrDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.bkgCreTpCd = this.bkgCreTpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.slanCd = this.slanCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.taaNo = this.taaNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.flexHgtFlg = this.flexHgtFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.bkgCxlGdt = this.bkgCxlGdt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.repCmdtCd = this.repCmdtCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.vslCd = this.vslCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.mtyBkgStsCd = this.mtyBkgStsCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.caInspDueDt = this.caInspDueDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ibDelDeDt = this.ibDelDeDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ocpCd = this.ocpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.interRmkAudFlg = this.interRmkAudFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.blckStwgCd = this.blckStwgCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.polEtdDt = this.polEtdDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.blNo = this.blNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.pctlNo = this.pctlNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.xterRqstCustRmk = this.xterRqstCustRmk.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.polCd = this.polCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.scNo = this.scNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.prctFlg = this.prctFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.myFwrdCd = this.myFwrdCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.blNoTp = this.blNoTp.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.delNodCd = this.delNodCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.obSlsOfcCd = this.obSlsOfcCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.custToOrdFlg = this.custToOrdFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.wtRsnSpclCgoFlg = this.wtRsnSpclCgoFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.xterSiCd = this.xterSiCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.cndCstmsFileCd = this.cndCstmsFileCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.mtyPkupDt = this.mtyPkupDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.xterBkgRqstCd = this.xterBkgRqstCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.preRlyPortCd = this.preRlyPortCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ctrtCustSeq = this.ctrtCustSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.portClzDt = this.portClzDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.awkCgoFlg = this.awkCgoFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.stopOffCntcPhnNo = this.stopOffCntcPhnNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.fnlDestCd = this.fnlDestCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.delCd = this.delCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.slsRhqCd = this.slsRhqCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.creUsrId = this.creUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.xterRmk = this.xterRmk.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.xterBkgRqstRefNo = this.xterBkgRqstRefNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.pstRlyPortCd = this.pstRlyPortCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.splitFlg = this.splitFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.porCd = this.porCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ctrtCustCntCd = this.ctrtCustCntCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.orgTrnsSvcModCd = this.orgTrnsSvcModCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.docUsrId = this.docUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.eqCtrlOfcCd = this.eqCtrlOfcCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.creDt = this.creDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.advShtgCd = this.advShtgCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.stopOffDiffRmk = this.stopOffDiffRmk.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.eqSubstFlg = this.eqSubstFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.hotDeFlg = this.hotDeFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.splitDt = this.splitDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.rfaNo = this.rfaNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.revDirCd = this.revDirCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ibflag = this.ibflag.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.railBlkCd = this.railBlkCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.bbCgoFlg = this.bbCgoFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.dcgoFlg = this.dcgoFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.krCstmsCustTpCd = this.krCstmsCustTpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.mtyCreSvrCd = this.mtyCreSvrCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.rcvTermCd = this.rcvTermCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.updDt = this.updDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.splitGdt = this.splitGdt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.mtyPortFlg = this.mtyPortFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.mtyPodFlg = this.mtyPodFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.allMtrFlg = this.allMtrFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.polNodCd = this.polNodCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.xterBkgKnt = this.xterBkgKnt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.twnSoNo = this.twnSoNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.podEtaDt = this.podEtaDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.skdDirCd = this.skdDirCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.blTpCd = this.blTpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.usaCstmsFileCd = this.usaCstmsFileCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.socFlg = this.socFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.deTermCd = this.deTermCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.hngrFlg = this.hngrFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.mtyRtnYdCd = this.mtyRtnYdCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.myFwrdVslDesc = this.myFwrdVslDesc.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.slsRgnOfcCd = this.slsRgnOfcCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ediHldFlg = this.ediHldFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.vndrRmk = this.vndrRmk.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.bkgCtrlPtyCustCntCd = this.bkgCtrlPtyCustCntCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.bkgCtrlPtyCustSeq = this.bkgCtrlPtyCustSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.blckStwgFlg = this.blckStwgFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.bkgWtChkFlg = this.bkgWtChkFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.irrBlNoFlg = this.irrBlNoFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.bkgPtyCntCd = this.bkgPtyCntCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.bkgPtyCustSeq = this.bkgPtyCustSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.motNo = this.motNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.rqstDt = this.rqstDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.rqstGdt = this.rqstGdt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.bkgAlocStsCd = this.bkgAlocStsCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.sbBkgGidCd = this.sbBkgGidCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.sbBkgDirRmk = this.sbBkgDirRmk.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.cplsFrmFlg = this.cplsFrmFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.fnlGuidCd = this.fnlGuidCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.trCd = this.trCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.sbBkgRoleCd = this.sbBkgRoleCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.sbDt = this.sbDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.sbFrmDt = this.sbFrmDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
    }
}
