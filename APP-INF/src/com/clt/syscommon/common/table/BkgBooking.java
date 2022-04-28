/*=========================================================
*Copyright(c) 2008 CyberLogitec
*@FileName : BkgBooking.java
*@FileTitle : BkgBooking
*Open Issues :
*Change history :
*@LastModifyDate : 2008.12.29
*@LastModifier : 정윤태
*@LastVersion : 1.0
* 2008.12.29 정윤태
* 1.0 최초 생성
=========================================================*/

package com.clt.syscommon.common.table;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import com.clt.framework.component.util.JSPUtil;

/**
 * Table Value Ojbect<br>
 * - PDTO(Data Transfer Object including Parameters)<br>
 * - 관련 Event에서 작성, 서버실행요청시 PDTO의 역할을 수행하는 Value Object<br>
 *
 * @author 정윤태
 * @see BkgCre079HTMLAction 참조
 * @since J2EE 1.5
 */

public class BkgBooking implements Serializable {

	private static final long serialVersionUID = 1L;
	/* 컬럼 설명	*/
	private String bkgCgoTpCd = null;
	/* 컬럼 설명	*/
	private String orgTrnsModCd = null;
	/* 컬럼 설명	*/
	private String mtyPkupYdCd = null;
	/* 컬럼 설명	*/
	private String pagerows = null;
	/* 컬럼 설명	*/
	private String obSrepCd = null;
	/* 컬럼 설명	*/
	private String ctrtOfcCd = null;
	/* 컬럼 설명	*/
	private String bkgCreDt = null;
	/* 컬럼 설명	*/
	private String stwgRmk = null;
	/* 컬럼 설명	*/
	private String stwgCd = null;
	/* 컬럼 설명	*/
	private String shprOwnrCntrFlg = null;
	/* 컬럼 설명	*/
	private String siFlg = null;
	/* 컬럼 설명	*/
	private String chnAgnCd = null;
	/* 컬럼 설명	*/
	private String updUsrId = null;
	/* 컬럼 설명	*/
	private String shprXptDeclCd = null;
	/* 컬럼 설명	*/
	private String blIssBlckFlg = null;
	/* 컬럼 설명	*/
	private String bkgOfcCd = null;
	/* 컬럼 설명	*/
	private String mnlBkgNoFlg = null;
	/* 컬럼 설명	*/
	private String dblBkgFlg = null;
	/* 컬럼 설명	*/
	private String rhqCd = null;
	/* 컬럼 설명	*/
	private String xterSiRefNo = null;
	/* 컬럼 설명	*/
	private String destSvcModCd = null;
	/* 컬럼 설명	*/
	private String skdVoyNo = null;
	/* 컬럼 설명	*/
	private String fullRtnYdCd = null;
	/* 컬럼 설명	*/
	private String splitRto = null;
	/* 컬럼 설명	*/
	private String podCd = null;
	/* 컬럼 설명	*/
	private String deDueDt = null;
	/* 컬럼 설명	*/
	private String lodgDueDt = null;
	/* 컬럼 설명	*/
	private String bkgNo = null;
	/* 컬럼 설명	*/
	private String podNodCd = null;
	/* 컬럼 설명	*/
	private String wtRsnHldFlg = null;
	/* 컬럼 설명	*/
	private String mtyPreVvdFlg = null;
	/* 컬럼 설명	*/
	private String ctrtSrepCd = null;
	/* 컬럼 설명	*/
	private String spclHideFlg = null;
	/* 컬럼 설명	*/
	private String stwgFlg = null;
	/* 컬럼 설명	*/
	private String frtFwrdFlg = null;
	/* 컬럼 설명	*/
	private String rcFlg = null;
	/* 컬럼 설명	*/
	private String splitRsnCd = null;
	/* 컬럼 설명	*/
	private String destTrnsModCd = null;
	/* 컬럼 설명	*/
	private String estmBkgWgtUtCd = null;
	/* 컬럼 설명	*/
	private String stopOffLocCd = null;
	/* 컬럼 설명	*/
	private String rdCgoFlg = null;
	/* 컬럼 설명	*/
	private String bkgStsCd = null;
	/* 컬럼 설명	*/
	private String fdGrdFlg = null;
	/* 컬럼 설명	*/
	private String orgSvcModCd = null;
	/* 컬럼 설명	*/
	private String mstBkgNoSplit = null;
	/* 컬럼 설명	*/
	private String bkgCreCd = null;
	/* 컬럼 설명	*/
	private String scActCntCd = null;
	/* 컬럼 설명	*/
	private String mtySplitAvalCd = null;
	/* 컬럼 설명	*/
	private String interRmk = null;
	/* 컬럼 설명	*/
	private String scacCd = null;
	/* 컬럼 설명	*/
	private String cmdtCd = null;
	/* 컬럼 설명	*/
	private String apBrogFlg = null;
	/* 컬럼 설명	*/
	private String bkgSplitCd = null;
	/* 컬럼 설명	*/
	private String fullPkupYdCd = null;
	/* 컬럼 설명	*/
	private String bkgCxlDt = null;
	/* 컬럼 설명	*/
	private String rgnOfcCd = null;
	/* 컬럼 설명	*/
	private String creTpCd = null;
	/* 컬럼 설명	*/
	private String ibSlsOfcCd = null;
	/* 컬럼 설명	*/
	private String altCustCfmFlg = null;
	/* 컬럼 설명	*/
	private String stopOffCntcPsonNm = null;
	/* 컬럼 설명	*/
	private String porNodCd = null;
	/* 컬럼 설명	*/
	private String bkgNoSplit = null;
	/* 컬럼 설명	*/
	private String xterRqstAutoNtcFlg = null;
	/* 컬럼 설명	*/
	private String mtyDorArrDt = null;
	/* 컬럼 설명	*/
	private String slanCd = null;
	/* 컬럼 설명	*/
	private String cmbBkgNo = null;
	/* 컬럼 설명	*/
	private String blNoAutoAsgnFlg = null;
	/* 컬럼 설명	*/
	private String flexHgtFlg = null;
	/* 컬럼 설명	*/
	private String repCmdtCd = null;
	/* 컬럼 설명	*/
	private String destRoutCd = null;
	/* 컬럼 설명	*/
	private String vslCd = null;
	/* 컬럼 설명	*/
	private String mtyBkgStsCd = null;
	/* 컬럼 설명	*/
	private String caInspDueDt = null;
	/* 컬럼 설명	*/
	private String ibDelDeDt = null;
	/* 컬럼 설명	*/
	private String ocpCd = null;
	/* 컬럼 설명	*/
	private String mstBkgNo = null;
	/* 컬럼 설명	*/
	private String interRmkAudFlg = null;
	/* 컬럼 설명	*/
	private String blckStwgCd = null;
	/* 컬럼 설명	*/
	private String orgTzModCd = null;
	/* 컬럼 설명	*/
	private String polEtdDt = null;
	/* 컬럼 설명	*/
	private String blNo = null;
	/* 컬럼 설명	*/
	private String cmbBkgNoSplit = null;
	/* 컬럼 설명	*/
	private String blNoChk = null;
	/* 컬럼 설명	*/
	private String polCd = null;
	/* 컬럼 설명	*/
	private String scActCustSeq = null;
	/* 컬럼 설명	*/
	private String scNo = null;
	/* 컬럼 설명	*/
	private String prctFlg = null;
	/* 컬럼 설명	*/
	private String blNoTp = null;
	/* 컬럼 설명	*/
	private String delNodCd = null;
	/* 컬럼 설명	*/
	private String obSlsOfcCd = null;
	/* 컬럼 설명	*/
	private String custToOrdFlg = null;
	/* 컬럼 설명	*/
	private String wtRsnSpclCgoFlg = null;
	/* 컬럼 설명	*/
	private String xterSiCd = null;
	/* 컬럼 설명	*/
	private String cndCstmsFileCd = null;
	/* 컬럼 설명	*/
	private String mtyPkupDt = null;
	/* 컬럼 설명	*/
	private String xterBkgRqstCd = null;
	/* 컬럼 설명	*/
	private String preRlyPortCd = null;
	/* 컬럼 설명	*/
	private String portClzDt = null;
	/* 컬럼 설명	*/
	private String awkCgoFlg = null;
	/* 컬럼 설명	*/
	private String fnlDestCd = null;
	/* 컬럼 설명	*/
	private String delCd = null;
	/* 컬럼 설명	*/
	private String stopOffCntcPhnNo = null;
	/* 컬럼 설명	*/
	private String creUsrId = null;
	/* 컬럼 설명	*/
	private String xterRmk = null;
	/* 컬럼 설명	*/
	private String orgRoutCd = null;
	/* 컬럼 설명	*/
	private String xterBkgRqstRefNo = null;
	/* 컬럼 설명	*/
	private String pstRlyPortCd = null;
	/* 컬럼 설명	*/
	private String destTzModCd = null;
	/* 컬럼 설명	*/
	private String porCd = null;
	/* 컬럼 설명	*/
	private String docUsrId = null;
	/* 컬럼 설명	*/
	private String eqCtrlOfcCd = null;
	/* 컬럼 설명	*/
	private String creDt = null;
	/* 컬럼 설명	*/
	private String advShtgCd = null;
	/* 컬럼 설명	*/
	private String stopOffDiffRmk = null;
	/* 컬럼 설명	*/
	private String eqSubstFlg = null;
	/* 컬럼 설명	*/
	private String hotDeFlg = null;
	/* 컬럼 설명	*/
	private String splitDt = null;
	/* 컬럼 설명	*/
	private String rfaNo = null;
	/* 컬럼 설명	*/
	private String revDirCd = null;
	/* 컬럼 설명	*/
	private String ibflag = null;
	/* 컬럼 설명	*/
	private String railBlkCd = null;
	/* 컬럼 설명	*/
	private String bbCgoFlg = null;
	/* 컬럼 설명	*/
	private String dcgoFlg = null;
	/* 컬럼 설명	*/
	private String mtyCreSvrCd = null;
	/* 컬럼 설명	*/
	private String rcvTermCd = null;
	/* 컬럼 설명	*/
	private String updDt = null;
	/* 컬럼 설명	*/
	private String mtyPortFlg = null;
	/* 컬럼 설명	*/
	private String mtyPodFlg = null;
	/* 컬럼 설명	*/
	private String allMtrFlg = null;
	/* 컬럼 설명	*/
	private String trfLnrItmNo = null;
	/* 컬럼 설명	*/
	private String polNodCd = null;
	/* 컬럼 설명	*/
	private String twnSoNo = null;
	/* 컬럼 설명	*/
	private String podEtaDt = null;
	/* 컬럼 설명	*/
	private String skdDirCd = null;
	/* 컬럼 설명	*/
	private String usaCstmsFileCd = null;
	/* 컬럼 설명	*/
	private String blTpCd = null;
	/* 컬럼 설명	*/
	private String deTermCd = null;
	/* 컬럼 설명	*/
	private String allMtrChgFlg = null;
	/* 컬럼 설명	*/
	private String hngrFlg = null;
	/* 컬럼 설명	*/
	private String mtyRtnYdCd = null;
	/* 컬럼 설명	*/
	private String estmBkgWgt = null;
	/* 컬럼 설명	*/
	private String manual = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumn = new HashMap<String, String>();

	public BkgBooking() {}

	public BkgBooking(String ibflag, String pagerows, String bkgNo, String bkgNoSplit, String blNo, String blNoTp, String blNoChk, String blTpCd, String bkgStsCd, String bkgCgoTpCd, String slanCd, String vslCd, String skdVoyNo, String skdDirCd, String revDirCd, String rcvTermCd, String deTermCd, String porCd, String porNodCd, String polCd, String polNodCd, String podCd, String podNodCd, String ocpCd, String delCd, String delNodCd, String fnlDestCd, String preRlyPortCd, String pstRlyPortCd, String polEtdDt, String podEtaDt, String mtyPkupYdCd, String mtyPkupDt, String fullRtnYdCd, String fullPkupYdCd, String mtyRtnYdCd, String mtyDorArrDt, String lodgDueDt, String deDueDt, String ibDelDeDt, String orgTzModCd, String destTzModCd, String orgRoutCd, String destRoutCd, String orgTrnsModCd, String destTrnsModCd, String orgSvcModCd, String destSvcModCd, String stopOffLocCd, String stopOffCntcPsonNm, String stopOffCntcPhnNo, String stopOffDiffRmk, String rhqCd, String rgnOfcCd, String bkgOfcCd, String docUsrId, String ctrtOfcCd, String ctrtSrepCd, String obSlsOfcCd, String obSrepCd, String ibSlsOfcCd, String eqCtrlOfcCd, String bkgCreDt, String bkgCxlDt, String portClzDt, String estmBkgWgt, String estmBkgWgtUtCd, String cmdtCd, String repCmdtCd, String dcgoFlg, String rcFlg, String awkCgoFlg, String bbCgoFlg, String rdCgoFlg, String hngrFlg, String railBlkCd, String prctFlg, String spclHideFlg, String shprOwnrCntrFlg, String eqSubstFlg, String fdGrdFlg, String flexHgtFlg, String stwgFlg, String stwgCd, String stwgRmk, String blckStwgCd, String allMtrFlg, String allMtrChgFlg, String hotDeFlg, String dblBkgFlg, String apBrogFlg, String custToOrdFlg, String frtFwrdFlg, String altCustCfmFlg, String wtRsnSpclCgoFlg, String wtRsnHldFlg, String mnlBkgNoFlg, String blNoAutoAsgnFlg, String blIssBlckFlg, String caInspDueDt, String scacCd, String shprXptDeclCd, String chnAgnCd, String usaCstmsFileCd, String cndCstmsFileCd, String twnSoNo, String interRmk, String xterRmk, String interRmkAudFlg, String creTpCd, String bkgCreCd, String bkgSplitCd, String advShtgCd, String splitRsnCd, String splitRto, String splitDt, String mstBkgNo, String mstBkgNoSplit, String cmbBkgNo, String cmbBkgNoSplit, String scNo, String rfaNo, String trfLnrItmNo, String scActCntCd, String scActCustSeq, String mtyCreSvrCd, String mtyBkgStsCd, String mtyPodFlg, String mtyPreVvdFlg, String mtyPortFlg, String mtySplitAvalCd, String xterBkgRqstCd, String xterBkgRqstRefNo, String siFlg, String xterSiCd, String xterSiRefNo, String xterRqstAutoNtcFlg, String creUsrId, String creDt, String updUsrId, String updDt, String manual) {
		this.bkgCgoTpCd = bkgCgoTpCd;
		this.orgTrnsModCd = orgTrnsModCd;
		this.mtyPkupYdCd = mtyPkupYdCd;
		this.pagerows = pagerows;
		this.obSrepCd = obSrepCd;
		this.ctrtOfcCd = ctrtOfcCd;
		this.bkgCreDt = bkgCreDt;
		this.stwgRmk = stwgRmk;
		this.stwgCd = stwgCd;
		this.shprOwnrCntrFlg = shprOwnrCntrFlg;
		this.siFlg = siFlg;
		this.chnAgnCd = chnAgnCd;
		this.updUsrId = updUsrId;
		this.shprXptDeclCd = shprXptDeclCd;
		this.blIssBlckFlg = blIssBlckFlg;
		this.bkgOfcCd = bkgOfcCd;
		this.mnlBkgNoFlg = mnlBkgNoFlg;
		this.dblBkgFlg = dblBkgFlg;
		this.rhqCd = rhqCd;
		this.xterSiRefNo = xterSiRefNo;
		this.destSvcModCd = destSvcModCd;
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
		this.ctrtSrepCd = ctrtSrepCd;
		this.spclHideFlg = spclHideFlg;
		this.stwgFlg = stwgFlg;
		this.frtFwrdFlg = frtFwrdFlg;
		this.rcFlg = rcFlg;
		this.splitRsnCd = splitRsnCd;
		this.destTrnsModCd = destTrnsModCd;
		this.estmBkgWgtUtCd = estmBkgWgtUtCd;
		this.stopOffLocCd = stopOffLocCd;
		this.rdCgoFlg = rdCgoFlg;
		this.bkgStsCd = bkgStsCd;
		this.fdGrdFlg = fdGrdFlg;
		this.orgSvcModCd = orgSvcModCd;
		this.mstBkgNoSplit = mstBkgNoSplit;
		this.bkgCreCd = bkgCreCd;
		this.scActCntCd = scActCntCd;
		this.mtySplitAvalCd = mtySplitAvalCd;
		this.interRmk = interRmk;
		this.scacCd = scacCd;
		this.cmdtCd = cmdtCd;
		this.apBrogFlg = apBrogFlg;
		this.bkgSplitCd = bkgSplitCd;
		this.fullPkupYdCd = fullPkupYdCd;
		this.bkgCxlDt = bkgCxlDt;
		this.rgnOfcCd = rgnOfcCd;
		this.creTpCd = creTpCd;
		this.ibSlsOfcCd = ibSlsOfcCd;
		this.altCustCfmFlg = altCustCfmFlg;
		this.stopOffCntcPsonNm = stopOffCntcPsonNm;
		this.porNodCd = porNodCd;
		this.bkgNoSplit = bkgNoSplit;
		this.xterRqstAutoNtcFlg = xterRqstAutoNtcFlg;
		this.mtyDorArrDt = mtyDorArrDt;
		this.slanCd = slanCd;
		this.cmbBkgNo = cmbBkgNo;
		this.blNoAutoAsgnFlg = blNoAutoAsgnFlg;
		this.flexHgtFlg = flexHgtFlg;
		this.repCmdtCd = repCmdtCd;
		this.destRoutCd = destRoutCd;
		this.vslCd = vslCd;
		this.mtyBkgStsCd = mtyBkgStsCd;
		this.caInspDueDt = caInspDueDt;
		this.ibDelDeDt = ibDelDeDt;
		this.ocpCd = ocpCd;
		this.mstBkgNo = mstBkgNo;
		this.interRmkAudFlg = interRmkAudFlg;
		this.blckStwgCd = blckStwgCd;
		this.orgTzModCd = orgTzModCd;
		this.polEtdDt = polEtdDt;
		this.blNo = blNo;
		this.cmbBkgNoSplit = cmbBkgNoSplit;
		this.blNoChk = blNoChk;
		this.polCd = polCd;
		this.scActCustSeq = scActCustSeq;
		this.scNo = scNo;
		this.prctFlg = prctFlg;
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
		this.portClzDt = portClzDt;
		this.awkCgoFlg = awkCgoFlg;
		this.fnlDestCd = fnlDestCd;
		this.delCd = delCd;
		this.stopOffCntcPhnNo = stopOffCntcPhnNo;
		this.creUsrId = creUsrId;
		this.xterRmk = xterRmk;
		this.orgRoutCd = orgRoutCd;
		this.xterBkgRqstRefNo = xterBkgRqstRefNo;
		this.pstRlyPortCd = pstRlyPortCd;
		this.destTzModCd = destTzModCd;
		this.porCd = porCd;
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
		this.mtyCreSvrCd = mtyCreSvrCd;
		this.rcvTermCd = rcvTermCd;
		this.updDt = updDt;
		this.mtyPortFlg = mtyPortFlg;
		this.mtyPodFlg = mtyPodFlg;
		this.allMtrFlg = allMtrFlg;
		this.trfLnrItmNo = trfLnrItmNo;
		this.polNodCd = polNodCd;
		this.twnSoNo = twnSoNo;
		this.podEtaDt = podEtaDt;
		this.skdDirCd = skdDirCd;
		this.usaCstmsFileCd = usaCstmsFileCd;
		this.blTpCd = blTpCd;
		this.deTermCd = deTermCd;
		this.allMtrChgFlg = allMtrChgFlg;
		this.hngrFlg = hngrFlg;
		this.mtyRtnYdCd = mtyRtnYdCd;
		this.estmBkgWgt = estmBkgWgt;
		this.manual = manual;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValue(){
		this.hashColumn.put("bkg_cgo_tp_cd", getBkgCgoTpCd());
		this.hashColumn.put("org_trns_mod_cd", getOrgTrnsModCd());
		this.hashColumn.put("mty_pkup_yd_cd", getMtyPkupYdCd());
		this.hashColumn.put("pagerows", getPage_rows());
		this.hashColumn.put("ob_srep_cd", getObSrepCd());
		this.hashColumn.put("ctrt_ofc_cd", getCtrtOfcCd());
		this.hashColumn.put("bkg_cre_dt", getBkgCreDt());
		this.hashColumn.put("stwg_rmk", getStwgRmk());
		this.hashColumn.put("stwg_cd", getStwgCd());
		this.hashColumn.put("shpr_ownr_cntr_flg", getShprOwnrCntrFlg());
		this.hashColumn.put("si_flg", getSiFlg());
		this.hashColumn.put("chn_agn_cd", getChnAgnCd());
		this.hashColumn.put("upd_usr_id", getUpdUsrId());
		this.hashColumn.put("shpr_xpt_decl_cd", getShprXptDeclCd());
		this.hashColumn.put("bl_iss_blck_flg", getBlIssBlckFlg());
		this.hashColumn.put("bkg_ofc_cd", getBkgOfcCd());
		this.hashColumn.put("mnl_bkg_no_flg", getMnlBkgNoFlg());
		this.hashColumn.put("dbl_bkg_flg", getDblBkgFlg());
		this.hashColumn.put("rhq_cd", getRhqCd());
		this.hashColumn.put("xter_si_ref_no", getXterSiRefNo());
		this.hashColumn.put("dest_svc_mod_cd", getDestSvcModCd());
		this.hashColumn.put("skd_voy_no", getSkdVoyNo());
		this.hashColumn.put("full_rtn_yd_cd", getFullRtnYdCd());
		this.hashColumn.put("split_rto", getSplitRto());
		this.hashColumn.put("pod_cd", getPodCd());
		this.hashColumn.put("de_due_dt", getDeDueDt());
		this.hashColumn.put("lodg_due_dt", getLodgDueDt());
		this.hashColumn.put("bkg_no", getBkgNo());
		this.hashColumn.put("pod_nod_cd", getPodNodCd());
		this.hashColumn.put("wt_rsn_hld_flg", getWtRsnHldFlg());
		this.hashColumn.put("mty_pre_vvd_flg", getMtyPreVvdFlg());
		this.hashColumn.put("ctrt_srep_cd", getCtrtSrepCd());
		this.hashColumn.put("spcl_hide_flg", getSpclHideFlg());
		this.hashColumn.put("stwg_flg", getStwgFlg());
		this.hashColumn.put("frt_fwrd_flg", getFrtFwrdFlg());
		this.hashColumn.put("rc_flg", getRcFlg());
		this.hashColumn.put("split_rsn_cd", getSplitRsnCd());
		this.hashColumn.put("dest_trns_mod_cd", getDestTrnsModCd());
		this.hashColumn.put("estm_bkg_wgt_ut_cd", getEstmBkgWgtUtCd());
		this.hashColumn.put("stop_off_loc_cd", getStopOffLocCd());
		this.hashColumn.put("rd_cgo_flg", getRdCgoFlg());
		this.hashColumn.put("bkg_sts_cd", getBkgStsCd());
		this.hashColumn.put("fd_grd_flg", getFdGrdFlg());
		this.hashColumn.put("org_svc_mod_cd", getOrgSvcModCd());
		this.hashColumn.put("mst_bkg_no_split", getMstBkgNoSplit());
		this.hashColumn.put("bkg_cre_cd", getBkgCreCd());
		this.hashColumn.put("sc_act_cnt_cd", getScActCntCd());
		this.hashColumn.put("mty_split_aval_cd", getMtySplitAvalCd());
		this.hashColumn.put("inter_rmk", getInterRmk());
		this.hashColumn.put("scac_cd", getScacCd());
		this.hashColumn.put("cmdt_cd", getCmdtCd());
		this.hashColumn.put("ap_brog_flg", getApBrogFlg());
		this.hashColumn.put("bkg_split_cd", getBkgSplitCd());
		this.hashColumn.put("full_pkup_yd_cd", getFullPkupYdCd());
		this.hashColumn.put("bkg_cxl_dt", getBkgCxlDt());
		this.hashColumn.put("rgn_ofc_cd", getRgnOfcCd());
		this.hashColumn.put("cre_tp_cd", getCreTpCd());
		this.hashColumn.put("ib_sls_ofc_cd", getIbSlsOfcCd());
		this.hashColumn.put("alt_cust_cfm_flg", getAltCustCfmFlg());
		this.hashColumn.put("stop_off_cntc_pson_nm", getStopOffCntcPsonNm());
		this.hashColumn.put("por_nod_cd", getPorNodCd());
		this.hashColumn.put("bkg_no_split", getBkgNoSplit());
		this.hashColumn.put("xter_rqst_auto_ntc_flg", getXterRqstAutoNtcFlg());
		this.hashColumn.put("mty_dor_arr_dt", getMtyDorArrDt());
		this.hashColumn.put("slan_cd", getSlanCd());
		this.hashColumn.put("cmb_bkg_no", getCmbBkgNo());
		this.hashColumn.put("bl_no_auto_asgn_flg", getBlNoAutoAsgnFlg());
		this.hashColumn.put("flex_hgt_flg", getFlexHgtFlg());
		this.hashColumn.put("rep_cmdt_cd", getRepCmdtCd());
		this.hashColumn.put("dest_rout_cd", getDestRoutCd());
		this.hashColumn.put("vsl_cd", getVslCd());
		this.hashColumn.put("mty_bkg_sts_cd", getMtyBkgStsCd());
		this.hashColumn.put("ca_insp_due_dt", getCaInspDueDt());
		this.hashColumn.put("ib_del_de_dt", getIbDelDeDt());
		this.hashColumn.put("ocp_cd", getOcpCd());
		this.hashColumn.put("mst_bkg_no", getMstBkgNo());
		this.hashColumn.put("inter_rmk_aud_flg", getInterRmkAudFlg());
		this.hashColumn.put("blck_stwg_cd", getBlckStwgCd());
		this.hashColumn.put("org_tz_mod_cd", getOrgTzModCd());
		this.hashColumn.put("pol_etd_dt", getPolEtdDt());
		this.hashColumn.put("bl_no", getBlNo());
		this.hashColumn.put("cmb_bkg_no_split", getCmbBkgNoSplit());
		this.hashColumn.put("bl_no_chk", getBlNoChk());
		this.hashColumn.put("pol_cd", getPolCd());
		this.hashColumn.put("sc_act_cust_seq", getScActCustSeq());
		this.hashColumn.put("sc_no", getScNo());
		this.hashColumn.put("prct_flg", getPrctFlg());
		this.hashColumn.put("bl_no_tp", getBlNoTp());
		this.hashColumn.put("del_nod_cd", getDelNodCd());
		this.hashColumn.put("ob_sls_ofc_cd", getObSlsOfcCd());
		this.hashColumn.put("cust_to_ord_flg", getCustToOrdFlg());
		this.hashColumn.put("wt_rsn_spcl_cgo_flg", getWtRsnSpclCgoFlg());
		this.hashColumn.put("xter_si_cd", getXterSiCd());
		this.hashColumn.put("cnd_cstms_file_cd", getCndCstmsFileCd());
		this.hashColumn.put("mty_pkup_dt", getMtyPkupDt());
		this.hashColumn.put("xter_bkg_rqst_cd", getXterBkgRqstCd());
		this.hashColumn.put("pre_rly_port_cd", getPreRlyPortCd());
		this.hashColumn.put("port_clz_dt", getPortClzDt());
		this.hashColumn.put("awk_cgo_flg", getAwkCgoFlg());
		this.hashColumn.put("fnl_dest_cd", getFnlDestCd());
		this.hashColumn.put("del_cd", getDelCd());
		this.hashColumn.put("stop_off_cntc_phn_no", getStopOffCntcPhnNo());
		this.hashColumn.put("cre_usr_id", getCreUsrId());
		this.hashColumn.put("xter_rmk", getXterRmk());
		this.hashColumn.put("org_rout_cd", getOrgRoutCd());
		this.hashColumn.put("xter_bkg_rqst_ref_no", getXterBkgRqstRefNo());
		this.hashColumn.put("pst_rly_port_cd", getPstRlyPortCd());
		this.hashColumn.put("dest_tz_mod_cd", getDestTzModCd());
		this.hashColumn.put("por_cd", getPorCd());
		this.hashColumn.put("doc_usr_id", getDocUsrId());
		this.hashColumn.put("eq_ctrl_ofc_cd", getEqCtrlOfcCd());
		this.hashColumn.put("cre_dt", getCreDt());
		this.hashColumn.put("adv_shtg_cd", getAdvShtgCd());
		this.hashColumn.put("stop_off_diff_rmk", getStopOffDiffRmk());
		this.hashColumn.put("eq_subst_flg", getEqSubstFlg());
		this.hashColumn.put("hot_de_flg", getHotDeFlg());
		this.hashColumn.put("split_dt", getSplitDt());
		this.hashColumn.put("rfa_no", getRfaNo());
		this.hashColumn.put("rev_dir_cd", getRevDirCd());
		this.hashColumn.put("ibflag", getIbflag());
		this.hashColumn.put("rail_blk_cd", getRailBlkCd());
		this.hashColumn.put("bb_cgo_flg", getBbCgoFlg());
		this.hashColumn.put("dcgo_flg", getDcgoFlg());
		this.hashColumn.put("mty_cre_svr_cd", getMtyCreSvrCd());
		this.hashColumn.put("rcv_term_cd", getRcvTermCd());
		this.hashColumn.put("upd_dt", getUpdDt());
		this.hashColumn.put("mty_port_flg", getMtyPortFlg());
		this.hashColumn.put("mty_pod_flg", getMtyPodFlg());
		this.hashColumn.put("all_mtr_flg", getAllMtrFlg());
		this.hashColumn.put("trf_lnr_itm_no", getTrfLnrItmNo());
		this.hashColumn.put("pol_nod_cd", getPolNodCd());
		this.hashColumn.put("twn_so_no", getTwnSoNo());
		this.hashColumn.put("pod_eta_dt", getPodEtaDt());
		this.hashColumn.put("skd_dir_cd", getSkdDirCd());
		this.hashColumn.put("usa_cstms_file_cd", getUsaCstmsFileCd());
		this.hashColumn.put("bl_tp_cd", getBlTpCd());
		this.hashColumn.put("de_term_cd", getDeTermCd());
		this.hashColumn.put("all_mtr_chg_flg", getAllMtrChgFlg());
		this.hashColumn.put("hngr_flg", getHngrFlg());
		this.hashColumn.put("mty_rtn_yd_cd", getMtyRtnYdCd());
		this.hashColumn.put("estm_bkg_wgt", getEstmBkgWgt());
		this.hashColumn.put("manual", getManual());
		return this.hashColumn;
	}
	
	public String getBkgCgoTpCd() {
		return this.bkgCgoTpCd;
	}
	public String getOrgTrnsModCd() {
		return this.orgTrnsModCd;
	}
	public String getMtyPkupYdCd() {
		return this.mtyPkupYdCd;
	}
	public String getPage_rows() {
		return this.pagerows;
	}
	public String getObSrepCd() {
		return this.obSrepCd;
	}
	public String getCtrtOfcCd() {
		return this.ctrtOfcCd;
	}
	public String getBkgCreDt() {
		return this.bkgCreDt;
	}
	public String getStwgRmk() {
		return this.stwgRmk;
	}
	public String getStwgCd() {
		return this.stwgCd;
	}
	public String getShprOwnrCntrFlg() {
		return this.shprOwnrCntrFlg;
	}
	public String getSiFlg() {
		return this.siFlg;
	}
	public String getChnAgnCd() {
		return this.chnAgnCd;
	}
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	public String getShprXptDeclCd() {
		return this.shprXptDeclCd;
	}
	public String getBlIssBlckFlg() {
		return this.blIssBlckFlg;
	}
	public String getBkgOfcCd() {
		return this.bkgOfcCd;
	}
	public String getMnlBkgNoFlg() {
		return this.mnlBkgNoFlg;
	}
	public String getDblBkgFlg() {
		return this.dblBkgFlg;
	}
	public String getRhqCd() {
		return this.rhqCd;
	}
	public String getXterSiRefNo() {
		return this.xterSiRefNo;
	}
	public String getDestSvcModCd() {
		return this.destSvcModCd;
	}
	public String getSkdVoyNo() {
		return this.skdVoyNo;
	}
	public String getFullRtnYdCd() {
		return this.fullRtnYdCd;
	}
	public String getSplitRto() {
		return this.splitRto;
	}
	public String getPodCd() {
		return this.podCd;
	}
	public String getDeDueDt() {
		return this.deDueDt;
	}
	public String getLodgDueDt() {
		return this.lodgDueDt;
	}
	public String getBkgNo() {
		return this.bkgNo;
	}
	public String getPodNodCd() {
		return this.podNodCd;
	}
	public String getWtRsnHldFlg() {
		return this.wtRsnHldFlg;
	}
	public String getMtyPreVvdFlg() {
		return this.mtyPreVvdFlg;
	}
	public String getCtrtSrepCd() {
		return this.ctrtSrepCd;
	}
	public String getSpclHideFlg() {
		return this.spclHideFlg;
	}
	public String getStwgFlg() {
		return this.stwgFlg;
	}
	public String getFrtFwrdFlg() {
		return this.frtFwrdFlg;
	}
	public String getRcFlg() {
		return this.rcFlg;
	}
	public String getSplitRsnCd() {
		return this.splitRsnCd;
	}
	public String getDestTrnsModCd() {
		return this.destTrnsModCd;
	}
	public String getEstmBkgWgtUtCd() {
		return this.estmBkgWgtUtCd;
	}
	public String getStopOffLocCd() {
		return this.stopOffLocCd;
	}
	public String getRdCgoFlg() {
		return this.rdCgoFlg;
	}
	public String getBkgStsCd() {
		return this.bkgStsCd;
	}
	public String getFdGrdFlg() {
		return this.fdGrdFlg;
	}
	public String getOrgSvcModCd() {
		return this.orgSvcModCd;
	}
	public String getMstBkgNoSplit() {
		return this.mstBkgNoSplit;
	}
	public String getBkgCreCd() {
		return this.bkgCreCd;
	}
	public String getScActCntCd() {
		return this.scActCntCd;
	}
	public String getMtySplitAvalCd() {
		return this.mtySplitAvalCd;
	}
	public String getInterRmk() {
		return this.interRmk;
	}
	public String getScacCd() {
		return this.scacCd;
	}
	public String getCmdtCd() {
		return this.cmdtCd;
	}
	public String getApBrogFlg() {
		return this.apBrogFlg;
	}
	public String getBkgSplitCd() {
		return this.bkgSplitCd;
	}
	public String getFullPkupYdCd() {
		return this.fullPkupYdCd;
	}
	public String getBkgCxlDt() {
		return this.bkgCxlDt;
	}
	public String getRgnOfcCd() {
		return this.rgnOfcCd;
	}
	public String getCreTpCd() {
		return this.creTpCd;
	}
	public String getIbSlsOfcCd() {
		return this.ibSlsOfcCd;
	}
	public String getAltCustCfmFlg() {
		return this.altCustCfmFlg;
	}
	public String getStopOffCntcPsonNm() {
		return this.stopOffCntcPsonNm;
	}
	public String getPorNodCd() {
		return this.porNodCd;
	}
	public String getBkgNoSplit() {
		return this.bkgNoSplit;
	}
	public String getXterRqstAutoNtcFlg() {
		return this.xterRqstAutoNtcFlg;
	}
	public String getMtyDorArrDt() {
		return this.mtyDorArrDt;
	}
	public String getSlanCd() {
		return this.slanCd;
	}
	public String getCmbBkgNo() {
		return this.cmbBkgNo;
	}
	public String getBlNoAutoAsgnFlg() {
		return this.blNoAutoAsgnFlg;
	}
	public String getFlexHgtFlg() {
		return this.flexHgtFlg;
	}
	public String getRepCmdtCd() {
		return this.repCmdtCd;
	}
	public String getDestRoutCd() {
		return this.destRoutCd;
	}
	public String getVslCd() {
		return this.vslCd;
	}
	public String getMtyBkgStsCd() {
		return this.mtyBkgStsCd;
	}
	public String getCaInspDueDt() {
		return this.caInspDueDt;
	}
	public String getIbDelDeDt() {
		return this.ibDelDeDt;
	}
	public String getOcpCd() {
		return this.ocpCd;
	}
	public String getMstBkgNo() {
		return this.mstBkgNo;
	}
	public String getInterRmkAudFlg() {
		return this.interRmkAudFlg;
	}
	public String getBlckStwgCd() {
		return this.blckStwgCd;
	}
	public String getOrgTzModCd() {
		return this.orgTzModCd;
	}
	public String getPolEtdDt() {
		return this.polEtdDt;
	}
	public String getBlNo() {
		return this.blNo;
	}
	public String getCmbBkgNoSplit() {
		return this.cmbBkgNoSplit;
	}
	public String getBlNoChk() {
		return this.blNoChk;
	}
	public String getPolCd() {
		return this.polCd;
	}
	public String getScActCustSeq() {
		return this.scActCustSeq;
	}
	public String getScNo() {
		return this.scNo;
	}
	public String getPrctFlg() {
		return this.prctFlg;
	}
	public String getBlNoTp() {
		return this.blNoTp;
	}
	public String getDelNodCd() {
		return this.delNodCd;
	}
	public String getObSlsOfcCd() {
		return this.obSlsOfcCd;
	}
	public String getCustToOrdFlg() {
		return this.custToOrdFlg;
	}
	public String getWtRsnSpclCgoFlg() {
		return this.wtRsnSpclCgoFlg;
	}
	public String getXterSiCd() {
		return this.xterSiCd;
	}
	public String getCndCstmsFileCd() {
		return this.cndCstmsFileCd;
	}
	public String getMtyPkupDt() {
		return this.mtyPkupDt;
	}
	public String getXterBkgRqstCd() {
		return this.xterBkgRqstCd;
	}
	public String getPreRlyPortCd() {
		return this.preRlyPortCd;
	}
	public String getPortClzDt() {
		return this.portClzDt;
	}
	public String getAwkCgoFlg() {
		return this.awkCgoFlg;
	}
	public String getFnlDestCd() {
		return this.fnlDestCd;
	}
	public String getDelCd() {
		return this.delCd;
	}
	public String getStopOffCntcPhnNo() {
		return this.stopOffCntcPhnNo;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getXterRmk() {
		return this.xterRmk;
	}
	public String getOrgRoutCd() {
		return this.orgRoutCd;
	}
	public String getXterBkgRqstRefNo() {
		return this.xterBkgRqstRefNo;
	}
	public String getPstRlyPortCd() {
		return this.pstRlyPortCd;
	}
	public String getDestTzModCd() {
		return this.destTzModCd;
	}
	public String getPorCd() {
		return this.porCd;
	}
	public String getDocUsrId() {
		return this.docUsrId;
	}
	public String getEqCtrlOfcCd() {
		return this.eqCtrlOfcCd;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getAdvShtgCd() {
		return this.advShtgCd;
	}
	public String getStopOffDiffRmk() {
		return this.stopOffDiffRmk;
	}
	public String getEqSubstFlg() {
		return this.eqSubstFlg;
	}
	public String getHotDeFlg() {
		return this.hotDeFlg;
	}
	public String getSplitDt() {
		return this.splitDt;
	}
	public String getRfaNo() {
		return this.rfaNo;
	}
	public String getRevDirCd() {
		return this.revDirCd;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getRailBlkCd() {
		return this.railBlkCd;
	}
	public String getBbCgoFlg() {
		return this.bbCgoFlg;
	}
	public String getDcgoFlg() {
		return this.dcgoFlg;
	}
	public String getMtyCreSvrCd() {
		return this.mtyCreSvrCd;
	}
	public String getRcvTermCd() {
		return this.rcvTermCd;
	}
	public String getUpdDt() {
		return this.updDt;
	}
	public String getMtyPortFlg() {
		return this.mtyPortFlg;
	}
	public String getMtyPodFlg() {
		return this.mtyPodFlg;
	}
	public String getAllMtrFlg() {
		return this.allMtrFlg;
	}
	public String getTrfLnrItmNo() {
		return this.trfLnrItmNo;
	}
	public String getPolNodCd() {
		return this.polNodCd;
	}
	public String getTwnSoNo() {
		return this.twnSoNo;
	}
	public String getPodEtaDt() {
		return this.podEtaDt;
	}
	public String getSkdDirCd() {
		return this.skdDirCd;
	}
	public String getUsaCstmsFileCd() {
		return this.usaCstmsFileCd;
	}
	public String getBlTpCd() {
		return this.blTpCd;
	}
	public String getDeTermCd() {
		return this.deTermCd;
	}
	public String getAllMtrChgFlg() {
		return this.allMtrChgFlg;
	}
	public String getHngrFlg() {
		return this.hngrFlg;
	}
	public String getMtyRtnYdCd() {
		return this.mtyRtnYdCd;
	}
	public String getEstmBkgWgt() {
		return this.estmBkgWgt;
	}
	public String getManual() {
		return this.manual;
	}

	public void setBkgCgoTpCd(String bkgCgoTpCd) {
		this.bkgCgoTpCd = bkgCgoTpCd;
		//this.bkgCgoTpCd=true;
	}
	public void setOrgTrnsModCd(String orgTrnsModCd) {
		this.orgTrnsModCd = orgTrnsModCd;
		//this.orgTrnsModCd=true;
	}
	public void setMtyPkupYdCd(String mtyPkupYdCd) {
		this.mtyPkupYdCd = mtyPkupYdCd;
		//this.mtyPkupYdCd=true;
	}
	public void setPage_rows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void setObSrepCd(String obSrepCd) {
		this.obSrepCd = obSrepCd;
		//this.obSrepCd=true;
	}
	public void setCtrtOfcCd(String ctrtOfcCd) {
		this.ctrtOfcCd = ctrtOfcCd;
		//this.ctrtOfcCd=true;
	}
	public void setBkgCreDt(String bkgCreDt) {
		this.bkgCreDt = bkgCreDt;
		//this.bkgCreDt=true;
	}
	public void setStwgRmk(String stwgRmk) {
		this.stwgRmk = stwgRmk;
		//this.stwgRmk=true;
	}
	public void setStwgCd(String stwgCd) {
		this.stwgCd = stwgCd;
		//this.stwgCd=true;
	}
	public void setShprOwnrCntrFlg(String shprOwnrCntrFlg) {
		this.shprOwnrCntrFlg = shprOwnrCntrFlg;
		//this.shprOwnrCntrFlg=true;
	}
	public void setSiFlg(String siFlg) {
		this.siFlg = siFlg;
		//this.siFlg=true;
	}
	public void setChnAgnCd(String chnAgnCd) {
		this.chnAgnCd = chnAgnCd;
		//this.chnAgnCd=true;
	}
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void setShprXptDeclCd(String shprXptDeclCd) {
		this.shprXptDeclCd = shprXptDeclCd;
		//this.shprXptDeclCd=true;
	}
	public void setBlIssBlckFlg(String blIssBlckFlg) {
		this.blIssBlckFlg = blIssBlckFlg;
		//this.blIssBlckFlg=true;
	}
	public void setBkgOfcCd(String bkgOfcCd) {
		this.bkgOfcCd = bkgOfcCd;
		//this.bkgOfcCd=true;
	}
	public void setMnlBkgNoFlg(String mnlBkgNoFlg) {
		this.mnlBkgNoFlg = mnlBkgNoFlg;
		//this.mnlBkgNoFlg=true;
	}
	public void setDblBkgFlg(String dblBkgFlg) {
		this.dblBkgFlg = dblBkgFlg;
		//this.dblBkgFlg=true;
	}
	public void setRhqCd(String rhqCd) {
		this.rhqCd = rhqCd;
		//this.rhqCd=true;
	}
	public void setXterSiRefNo(String xterSiRefNo) {
		this.xterSiRefNo = xterSiRefNo;
		//this.xterSiRefNo=true;
	}
	public void setDestSvcModCd(String destSvcModCd) {
		this.destSvcModCd = destSvcModCd;
		//this.destSvcModCd=true;
	}
	public void setSkdVoyNo(String skdVoyNo) {
		this.skdVoyNo = skdVoyNo;
		//this.skdVoyNo=true;
	}
	public void setFullRtnYdCd(String fullRtnYdCd) {
		this.fullRtnYdCd = fullRtnYdCd;
		//this.fullRtnYdCd=true;
	}
	public void setSplitRto(String splitRto) {
		this.splitRto = splitRto;
		//this.splitRto=true;
	}
	public void setPodCd(String podCd) {
		this.podCd = podCd;
		//this.podCd=true;
	}
	public void setDeDueDt(String deDueDt) {
		this.deDueDt = deDueDt;
		//this.deDueDt=true;
	}
	public void setLodgDueDt(String lodgDueDt) {
		this.lodgDueDt = lodgDueDt;
		//this.lodgDueDt=true;
	}
	public void setBkgNo(String bkgNo) {
		this.bkgNo = bkgNo;
		//this.bkgNo=true;
	}
	public void setPodNodCd(String podNodCd) {
		this.podNodCd = podNodCd;
		//this.podNodCd=true;
	}
	public void setWtRsnHldFlg(String wtRsnHldFlg) {
		this.wtRsnHldFlg = wtRsnHldFlg;
		//this.wtRsnHldFlg=true;
	}
	public void setMtyPreVvdFlg(String mtyPreVvdFlg) {
		this.mtyPreVvdFlg = mtyPreVvdFlg;
		//this.mtyPreVvdFlg=true;
	}
	public void setCtrtSrepCd(String ctrtSrepCd) {
		this.ctrtSrepCd = ctrtSrepCd;
		//this.ctrtSrepCd=true;
	}
	public void setSpclHideFlg(String spclHideFlg) {
		this.spclHideFlg = spclHideFlg;
		//this.spclHideFlg=true;
	}
	public void setStwgFlg(String stwgFlg) {
		this.stwgFlg = stwgFlg;
		//this.stwgFlg=true;
	}
	public void setFrtFwrdFlg(String frtFwrdFlg) {
		this.frtFwrdFlg = frtFwrdFlg;
		//this.frtFwrdFlg=true;
	}
	public void setRcFlg(String rcFlg) {
		this.rcFlg = rcFlg;
		//this.rcFlg=true;
	}
	public void setSplitRsnCd(String splitRsnCd) {
		this.splitRsnCd = splitRsnCd;
		//this.splitRsnCd=true;
	}
	public void setDestTrnsModCd(String destTrnsModCd) {
		this.destTrnsModCd = destTrnsModCd;
		//this.destTrnsModCd=true;
	}
	public void setEstmBkgWgtUtCd(String estmBkgWgtUtCd) {
		this.estmBkgWgtUtCd = estmBkgWgtUtCd;
		//this.estmBkgWgtUtCd=true;
	}
	public void setStopOffLocCd(String stopOffLocCd) {
		this.stopOffLocCd = stopOffLocCd;
		//this.stopOffLocCd=true;
	}
	public void setRdCgoFlg(String rdCgoFlg) {
		this.rdCgoFlg = rdCgoFlg;
		//this.rdCgoFlg=true;
	}
	public void setBkgStsCd(String bkgStsCd) {
		this.bkgStsCd = bkgStsCd;
		//this.bkgStsCd=true;
	}
	public void setFdGrdFlg(String fdGrdFlg) {
		this.fdGrdFlg = fdGrdFlg;
		//this.fdGrdFlg=true;
	}
	public void setOrgSvcModCd(String orgSvcModCd) {
		this.orgSvcModCd = orgSvcModCd;
		//this.orgSvcModCd=true;
	}
	public void setMstBkgNoSplit(String mstBkgNoSplit) {
		this.mstBkgNoSplit = mstBkgNoSplit;
		//this.mstBkgNoSplit=true;
	}
	public void setBkgCreCd(String bkgCreCd) {
		this.bkgCreCd = bkgCreCd;
		//this.bkgCreCd=true;
	}
	public void setScActCntCd(String scActCntCd) {
		this.scActCntCd = scActCntCd;
		//this.scActCntCd=true;
	}
	public void setMtySplitAvalCd(String mtySplitAvalCd) {
		this.mtySplitAvalCd = mtySplitAvalCd;
		//this.mtySplitAvalCd=true;
	}
	public void setInterRmk(String interRmk) {
		this.interRmk = interRmk;
		//this.interRmk=true;
	}
	public void setScacCd(String scacCd) {
		this.scacCd = scacCd;
		//this.scacCd=true;
	}
	public void setCmdtCd(String cmdtCd) {
		this.cmdtCd = cmdtCd;
		//this.cmdtCd=true;
	}
	public void setApBrogFlg(String apBrogFlg) {
		this.apBrogFlg = apBrogFlg;
		//this.apBrogFlg=true;
	}
	public void setBkgSplitCd(String bkgSplitCd) {
		this.bkgSplitCd = bkgSplitCd;
		//this.bkgSplitCd=true;
	}
	public void setFullPkupYdCd(String fullPkupYdCd) {
		this.fullPkupYdCd = fullPkupYdCd;
		//this.fullPkupYdCd=true;
	}
	public void setBkgCxlDt(String bkgCxlDt) {
		this.bkgCxlDt = bkgCxlDt;
		//this.bkgCxlDt=true;
	}
	public void setRgnOfcCd(String rgnOfcCd) {
		this.rgnOfcCd = rgnOfcCd;
		//this.rgnOfcCd=true;
	}
	public void setCreTpCd(String creTpCd) {
		this.creTpCd = creTpCd;
		//this.creTpCd=true;
	}
	public void setIbSlsOfcCd(String ibSlsOfcCd) {
		this.ibSlsOfcCd = ibSlsOfcCd;
		//this.ibSlsOfcCd=true;
	}
	public void setAltCustCfmFlg(String altCustCfmFlg) {
		this.altCustCfmFlg = altCustCfmFlg;
		//this.altCustCfmFlg=true;
	}
	public void setStopOffCntcPsonNm(String stopOffCntcPsonNm) {
		this.stopOffCntcPsonNm = stopOffCntcPsonNm;
		//this.stopOffCntcPsonNm=true;
	}
	public void setPorNodCd(String porNodCd) {
		this.porNodCd = porNodCd;
		//this.porNodCd=true;
	}
	public void setBkgNoSplit(String bkgNoSplit) {
		this.bkgNoSplit = bkgNoSplit;
		//this.bkgNoSplit=true;
	}
	public void setXterRqstAutoNtcFlg(String xterRqstAutoNtcFlg) {
		this.xterRqstAutoNtcFlg = xterRqstAutoNtcFlg;
		//this.xterRqstAutoNtcFlg=true;
	}
	public void setMtyDorArrDt(String mtyDorArrDt) {
		this.mtyDorArrDt = mtyDorArrDt;
		//this.mtyDorArrDt=true;
	}
	public void setSlanCd(String slanCd) {
		this.slanCd = slanCd;
		//this.slanCd=true;
	}
	public void setCmbBkgNo(String cmbBkgNo) {
		this.cmbBkgNo = cmbBkgNo;
		//this.cmbBkgNo=true;
	}
	public void setBlNoAutoAsgnFlg(String blNoAutoAsgnFlg) {
		this.blNoAutoAsgnFlg = blNoAutoAsgnFlg;
		//this.blNoAutoAsgnFlg=true;
	}
	public void setFlexHgtFlg(String flexHgtFlg) {
		this.flexHgtFlg = flexHgtFlg;
		//this.flexHgtFlg=true;
	}
	public void setRepCmdtCd(String repCmdtCd) {
		this.repCmdtCd = repCmdtCd;
		//this.repCmdtCd=true;
	}
	public void setDestRoutCd(String destRoutCd) {
		this.destRoutCd = destRoutCd;
		//this.destRoutCd=true;
	}
	public void setVslCd(String vslCd) {
		this.vslCd = vslCd;
		//this.vslCd=true;
	}
	public void setMtyBkgStsCd(String mtyBkgStsCd) {
		this.mtyBkgStsCd = mtyBkgStsCd;
		//this.mtyBkgStsCd=true;
	}
	public void setCaInspDueDt(String caInspDueDt) {
		this.caInspDueDt = caInspDueDt;
		//this.caInspDueDt=true;
	}
	public void setIbDelDeDt(String ibDelDeDt) {
		this.ibDelDeDt = ibDelDeDt;
		//this.ibDelDeDt=true;
	}
	public void setOcpCd(String ocpCd) {
		this.ocpCd = ocpCd;
		//this.ocpCd=true;
	}
	public void setMstBkgNo(String mstBkgNo) {
		this.mstBkgNo = mstBkgNo;
		//this.mstBkgNo=true;
	}
	public void setInterRmkAudFlg(String interRmkAudFlg) {
		this.interRmkAudFlg = interRmkAudFlg;
		//this.interRmkAudFlg=true;
	}
	public void setBlckStwgCd(String blckStwgCd) {
		this.blckStwgCd = blckStwgCd;
		//this.blckStwgCd=true;
	}
	public void setOrgTzModCd(String orgTzModCd) {
		this.orgTzModCd = orgTzModCd;
		//this.orgTzModCd=true;
	}
	public void setPolEtdDt(String polEtdDt) {
		this.polEtdDt = polEtdDt;
		//this.polEtdDt=true;
	}
	public void setBlNo(String blNo) {
		this.blNo = blNo;
		//this.blNo=true;
	}
	public void setCmbBkgNoSplit(String cmbBkgNoSplit) {
		this.cmbBkgNoSplit = cmbBkgNoSplit;
		//this.cmbBkgNoSplit=true;
	}
	public void setBlNoChk(String blNoChk) {
		this.blNoChk = blNoChk;
		//this.blNoChk=true;
	}
	public void setPolCd(String polCd) {
		this.polCd = polCd;
		//this.polCd=true;
	}
	public void setScActCustSeq(String scActCustSeq) {
		this.scActCustSeq = scActCustSeq;
		//this.scActCustSeq=true;
	}
	public void setScNo(String scNo) {
		this.scNo = scNo;
		//this.scNo=true;
	}
	public void setPrctFlg(String prctFlg) {
		this.prctFlg = prctFlg;
		//this.prctFlg=true;
	}
	public void setBlNoTp(String blNoTp) {
		this.blNoTp = blNoTp;
		//this.blNoTp=true;
	}
	public void setDelNodCd(String delNodCd) {
		this.delNodCd = delNodCd;
		//this.delNodCd=true;
	}
	public void setObSlsOfcCd(String obSlsOfcCd) {
		this.obSlsOfcCd = obSlsOfcCd;
		//this.obSlsOfcCd=true;
	}
	public void setCustToOrdFlg(String custToOrdFlg) {
		this.custToOrdFlg = custToOrdFlg;
		//this.custToOrdFlg=true;
	}
	public void setWtRsnSpclCgoFlg(String wtRsnSpclCgoFlg) {
		this.wtRsnSpclCgoFlg = wtRsnSpclCgoFlg;
		//this.wtRsnSpclCgoFlg=true;
	}
	public void setXterSiCd(String xterSiCd) {
		this.xterSiCd = xterSiCd;
		//this.xterSiCd=true;
	}
	public void setCndCstmsFileCd(String cndCstmsFileCd) {
		this.cndCstmsFileCd = cndCstmsFileCd;
		//this.cndCstmsFileCd=true;
	}
	public void setMtyPkupDt(String mtyPkupDt) {
		this.mtyPkupDt = mtyPkupDt;
		//this.mtyPkupDt=true;
	}
	public void setXterBkgRqstCd(String xterBkgRqstCd) {
		this.xterBkgRqstCd = xterBkgRqstCd;
		//this.xterBkgRqstCd=true;
	}
	public void setPreRlyPortCd(String preRlyPortCd) {
		this.preRlyPortCd = preRlyPortCd;
		//this.preRlyPortCd=true;
	}
	public void setPortClzDt(String portClzDt) {
		this.portClzDt = portClzDt;
		//this.portClzDt=true;
	}
	public void setAwkCgoFlg(String awkCgoFlg) {
		this.awkCgoFlg = awkCgoFlg;
		//this.awkCgoFlg=true;
	}
	public void setFnlDestCd(String fnlDestCd) {
		this.fnlDestCd = fnlDestCd;
		//this.fnlDestCd=true;
	}
	public void setDelCd(String delCd) {
		this.delCd = delCd;
		//this.delCd=true;
	}
	public void setStopOffCntcPhnNo(String stopOffCntcPhnNo) {
		this.stopOffCntcPhnNo = stopOffCntcPhnNo;
		//this.stopOffCntcPhnNo=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setXterRmk(String xterRmk) {
		this.xterRmk = xterRmk;
		//this.xterRmk=true;
	}
	public void setOrgRoutCd(String orgRoutCd) {
		this.orgRoutCd = orgRoutCd;
		//this.orgRoutCd=true;
	}
	public void setXterBkgRqstRefNo(String xterBkgRqstRefNo) {
		this.xterBkgRqstRefNo = xterBkgRqstRefNo;
		//this.xterBkgRqstRefNo=true;
	}
	public void setPstRlyPortCd(String pstRlyPortCd) {
		this.pstRlyPortCd = pstRlyPortCd;
		//this.pstRlyPortCd=true;
	}
	public void setDestTzModCd(String destTzModCd) {
		this.destTzModCd = destTzModCd;
		//this.destTzModCd=true;
	}
	public void setPorCd(String porCd) {
		this.porCd = porCd;
		//this.porCd=true;
	}
	public void setDocUsrId(String docUsrId) {
		this.docUsrId = docUsrId;
		//this.docUsrId=true;
	}
	public void setEqCtrlOfcCd(String eqCtrlOfcCd) {
		this.eqCtrlOfcCd = eqCtrlOfcCd;
		//this.eqCtrlOfcCd=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setAdvShtgCd(String advShtgCd) {
		this.advShtgCd = advShtgCd;
		//this.advShtgCd=true;
	}
	public void setStopOffDiffRmk(String stopOffDiffRmk) {
		this.stopOffDiffRmk = stopOffDiffRmk;
		//this.stopOffDiffRmk=true;
	}
	public void setEqSubstFlg(String eqSubstFlg) {
		this.eqSubstFlg = eqSubstFlg;
		//this.eqSubstFlg=true;
	}
	public void setHotDeFlg(String hotDeFlg) {
		this.hotDeFlg = hotDeFlg;
		//this.hotDeFlg=true;
	}
	public void setSplitDt(String splitDt) {
		this.splitDt = splitDt;
		//this.splitDt=true;
	}
	public void setRfaNo(String rfaNo) {
		this.rfaNo = rfaNo;
		//this.rfaNo=true;
	}
	public void setRevDirCd(String revDirCd) {
		this.revDirCd = revDirCd;
		//this.revDirCd=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setRailBlkCd(String railBlkCd) {
		this.railBlkCd = railBlkCd;
		//this.railBlkCd=true;
	}
	public void setBbCgoFlg(String bbCgoFlg) {
		this.bbCgoFlg = bbCgoFlg;
		//this.bbCgoFlg=true;
	}
	public void setDcgoFlg(String dcgoFlg) {
		this.dcgoFlg = dcgoFlg;
		//this.dcgoFlg=true;
	}
	public void setMtyCreSvrCd(String mtyCreSvrCd) {
		this.mtyCreSvrCd = mtyCreSvrCd;
		//this.mtyCreSvrCd=true;
	}
	public void setRcvTermCd(String rcvTermCd) {
		this.rcvTermCd = rcvTermCd;
		//this.rcvTermCd=true;
	}
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setMtyPortFlg(String mtyPortFlg) {
		this.mtyPortFlg = mtyPortFlg;
		//this.mtyPortFlg=true;
	}
	public void setMtyPodFlg(String mtyPodFlg) {
		this.mtyPodFlg = mtyPodFlg;
		//this.mtyPodFlg=true;
	}
	public void setAllMtrFlg(String allMtrFlg) {
		this.allMtrFlg = allMtrFlg;
		//this.allMtrFlg=true;
	}
	public void setTrfLnrItmNo(String trfLnrItmNo) {
		this.trfLnrItmNo = trfLnrItmNo;
		//this.trfLnrItmNo=true;
	}
	public void setPolNodCd(String polNodCd) {
		this.polNodCd = polNodCd;
		//this.polNodCd=true;
	}
	public void setTwnSoNo(String twnSoNo) {
		this.twnSoNo = twnSoNo;
		//this.twnSoNo=true;
	}
	public void setPodEtaDt(String podEtaDt) {
		this.podEtaDt = podEtaDt;
		//this.podEtaDt=true;
	}
	public void setSkdDirCd(String skdDirCd) {
		this.skdDirCd = skdDirCd;
		//this.skdDirCd=true;
	}
	public void setUsaCstmsFileCd(String usaCstmsFileCd) {
		this.usaCstmsFileCd = usaCstmsFileCd;
		//this.usaCstmsFileCd=true;
	}
	public void setBlTpCd(String blTpCd) {
		this.blTpCd = blTpCd;
		//this.blTpCd=true;
	}
	public void setDeTermCd(String deTermCd) {
		this.deTermCd = deTermCd;
		//this.deTermCd=true;
	}
	public void setAllMtrChgFlg(String allMtrChgFlg) {
		this.allMtrChgFlg = allMtrChgFlg;
		//this.allMtrChgFlg=true;
	}
	public void setHngrFlg(String hngrFlg) {
		this.hngrFlg = hngrFlg;
		//this.hngrFlg=true;
	}
	public void setMtyRtnYdCd(String mtyRtnYdCd) {
		this.mtyRtnYdCd = mtyRtnYdCd;
		//this.mtyRtnYdCd=true;
	}
	public void setEstmBkgWgt(String estmBkgWgt) {
		this.estmBkgWgt = estmBkgWgt;
		//this.estmBkgWgt=true;
	}
	public void setManual(String manual) {
		this.manual = manual;
		//this.rfa_no=true;
	}
	
	public static BkgBooking fromRequest(HttpServletRequest request) {
		BkgBooking model = new BkgBooking();
		try {
			model.setBkgCgoTpCd(JSPUtil.getParameter(request, "bkg_cgo_tp_cd", ""));
			model.setOrgTrnsModCd(JSPUtil.getParameter(request, "org_trns_mod_cd", ""));
			model.setMtyPkupYdCd(JSPUtil.getParameter(request, "mty_pkup_yd_cd", ""));
			model.setPage_rows(JSPUtil.getParameter(request, "pagerows", ""));
			model.setObSrepCd(JSPUtil.getParameter(request, "ob_srep_cd", ""));
			model.setCtrtOfcCd(JSPUtil.getParameter(request, "ctrt_ofc_cd", ""));
			model.setBkgCreDt(JSPUtil.getParameter(request, "bkg_cre_dt", ""));
			model.setStwgRmk(JSPUtil.getParameter(request, "stwg_rmk", ""));
			model.setStwgCd(JSPUtil.getParameter(request, "stwg_cd", ""));
			model.setShprOwnrCntrFlg(JSPUtil.getParameter(request, "shpr_ownr_cntr_flg", ""));
			model.setSiFlg(JSPUtil.getParameter(request, "si_flg", ""));
			model.setChnAgnCd(JSPUtil.getParameter(request, "chn_agn_cd", ""));
			model.setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
			model.setShprXptDeclCd(JSPUtil.getParameter(request, "shpr_xpt_decl_cd", ""));
			model.setBlIssBlckFlg(JSPUtil.getParameter(request, "bl_iss_blck_flg", ""));
			model.setBkgOfcCd(JSPUtil.getParameter(request, "bkg_ofc_cd", ""));
			model.setMnlBkgNoFlg(JSPUtil.getParameter(request, "mnl_bkg_no_flg", ""));
			model.setDblBkgFlg(JSPUtil.getParameter(request, "dbl_bkg_flg", ""));
			model.setRhqCd(JSPUtil.getParameter(request, "rhq_cd", ""));
			model.setXterSiRefNo(JSPUtil.getParameter(request, "xter_si_ref_no", ""));
			model.setDestSvcModCd(JSPUtil.getParameter(request, "dest_svc_mod_cd", ""));
			model.setSkdVoyNo(JSPUtil.getParameter(request, "skd_voy_no", ""));
			model.setFullRtnYdCd(JSPUtil.getParameter(request, "full_rtn_yd_cd", ""));
			model.setSplitRto(JSPUtil.getParameter(request, "split_rto", ""));
			model.setPodCd(JSPUtil.getParameter(request, "pod_cd", ""));
			model.setDeDueDt(JSPUtil.getParameter(request, "de_due_dt", ""));
			model.setLodgDueDt(JSPUtil.getParameter(request, "lodg_due_dt", ""));
			model.setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
			model.setPodNodCd(JSPUtil.getParameter(request, "pod_nod_cd", ""));
			model.setWtRsnHldFlg(JSPUtil.getParameter(request, "wt_rsn_hld_flg", ""));
			model.setMtyPreVvdFlg(JSPUtil.getParameter(request, "mty_pre_vvd_flg", ""));
			model.setCtrtSrepCd(JSPUtil.getParameter(request, "ctrt_srep_cd", ""));
			model.setSpclHideFlg(JSPUtil.getParameter(request, "spcl_hide_flg", ""));
			model.setStwgFlg(JSPUtil.getParameter(request, "stwg_flg", ""));
			model.setFrtFwrdFlg(JSPUtil.getParameter(request, "frt_fwrd_flg", ""));
			model.setRcFlg(JSPUtil.getParameter(request, "rc_flg", ""));
			model.setSplitRsnCd(JSPUtil.getParameter(request, "split_rsn_cd", ""));
			model.setDestTrnsModCd(JSPUtil.getParameter(request, "dest_trns_mod_cd", ""));
			model.setEstmBkgWgtUtCd(JSPUtil.getParameter(request, "estm_bkg_wgt_ut_cd", ""));
			model.setStopOffLocCd(JSPUtil.getParameter(request, "stop_off_loc_cd", ""));
			model.setRdCgoFlg(JSPUtil.getParameter(request, "rd_cgo_flg", ""));
			model.setBkgStsCd(JSPUtil.getParameter(request, "bkg_sts_cd", ""));
			model.setFdGrdFlg(JSPUtil.getParameter(request, "fd_grd_flg", ""));
			model.setOrgSvcModCd(JSPUtil.getParameter(request, "org_svc_mod_cd", ""));
			model.setMstBkgNoSplit(JSPUtil.getParameter(request, "mst_bkg_no_split", ""));
			model.setBkgCreCd(JSPUtil.getParameter(request, "bkg_cre_cd", ""));
			model.setScActCntCd(JSPUtil.getParameter(request, "sc_act_cnt_cd", ""));
			model.setMtySplitAvalCd(JSPUtil.getParameter(request, "mty_split_aval_cd", ""));
			model.setInterRmk(JSPUtil.getParameter(request, "inter_rmk", ""));
			model.setScacCd(JSPUtil.getParameter(request, "scac_cd", ""));
			model.setCmdtCd(JSPUtil.getParameter(request, "cmdt_cd", ""));
			model.setApBrogFlg(JSPUtil.getParameter(request, "ap_brog_flg", ""));
			model.setBkgSplitCd(JSPUtil.getParameter(request, "bkg_split_cd", ""));
			model.setFullPkupYdCd(JSPUtil.getParameter(request, "full_pkup_yd_cd", ""));
			model.setBkgCxlDt(JSPUtil.getParameter(request, "bkg_cxl_dt", ""));
			model.setRgnOfcCd(JSPUtil.getParameter(request, "rgn_ofc_cd", ""));
			model.setCreTpCd(JSPUtil.getParameter(request, "cre_tp_cd", ""));
			model.setIbSlsOfcCd(JSPUtil.getParameter(request, "ib_sls_ofc_cd", ""));
			model.setAltCustCfmFlg(JSPUtil.getParameter(request, "alt_cust_cfm_flg", ""));
			model.setStopOffCntcPsonNm(JSPUtil.getParameter(request, "stop_off_cntc_pson_nm", ""));
			model.setPorNodCd(JSPUtil.getParameter(request, "por_nod_cd", ""));
			model.setBkgNoSplit(JSPUtil.getParameter(request, "bkg_no_split", ""));
			model.setXterRqstAutoNtcFlg(JSPUtil.getParameter(request, "xter_rqst_auto_ntc_flg", ""));
			model.setMtyDorArrDt(JSPUtil.getParameter(request, "mty_dor_arr_dt", ""));
			model.setSlanCd(JSPUtil.getParameter(request, "slan_cd", ""));
			model.setCmbBkgNo(JSPUtil.getParameter(request, "cmb_bkg_no", ""));
			model.setBlNoAutoAsgnFlg(JSPUtil.getParameter(request, "bl_no_auto_asgn_flg", ""));
			model.setFlexHgtFlg(JSPUtil.getParameter(request, "flex_hgt_flg", ""));
			model.setRepCmdtCd(JSPUtil.getParameter(request, "rep_cmdt_cd", ""));
			model.setDestRoutCd(JSPUtil.getParameter(request, "dest_rout_cd", ""));
			model.setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
			model.setMtyBkgStsCd(JSPUtil.getParameter(request, "mty_bkg_sts_cd", ""));
			model.setCaInspDueDt(JSPUtil.getParameter(request, "ca_insp_due_dt", ""));
			model.setIbDelDeDt(JSPUtil.getParameter(request, "ib_del_de_dt", ""));
			model.setOcpCd(JSPUtil.getParameter(request, "ocp_cd", ""));
			model.setMstBkgNo(JSPUtil.getParameter(request, "mst_bkg_no", ""));
			model.setInterRmkAudFlg(JSPUtil.getParameter(request, "inter_rmk_aud_flg", ""));
			model.setBlckStwgCd(JSPUtil.getParameter(request, "blck_stwg_cd", ""));
			model.setOrgTzModCd(JSPUtil.getParameter(request, "org_tz_mod_cd", ""));
			model.setPolEtdDt(JSPUtil.getParameter(request, "pol_etd_dt", ""));
			model.setBlNo(JSPUtil.getParameter(request, "bl_no", ""));
			model.setCmbBkgNoSplit(JSPUtil.getParameter(request, "cmb_bkg_no_split", ""));
			model.setBlNoChk(JSPUtil.getParameter(request, "bl_no_chk", ""));
			model.setPolCd(JSPUtil.getParameter(request, "pol_cd", ""));
			model.setScActCustSeq(JSPUtil.getParameter(request, "sc_act_cust_seq", ""));
			model.setScNo(JSPUtil.getParameter(request, "sc_no", ""));
			model.setPrctFlg(JSPUtil.getParameter(request, "prct_flg", ""));
			model.setBlNoTp(JSPUtil.getParameter(request, "bl_no_tp", ""));
			model.setDelNodCd(JSPUtil.getParameter(request, "del_nod_cd", ""));
			model.setObSlsOfcCd(JSPUtil.getParameter(request, "ob_sls_ofc_cd", ""));
			model.setCustToOrdFlg(JSPUtil.getParameter(request, "cust_to_ord_flg", ""));
			model.setWtRsnSpclCgoFlg(JSPUtil.getParameter(request, "wt_rsn_spcl_cgo_flg", ""));
			model.setXterSiCd(JSPUtil.getParameter(request, "xter_si_cd", ""));
			model.setCndCstmsFileCd(JSPUtil.getParameter(request, "cnd_cstms_file_cd", ""));
			model.setMtyPkupDt(JSPUtil.getParameter(request, "mty_pkup_dt", ""));
			model.setXterBkgRqstCd(JSPUtil.getParameter(request, "xter_bkg_rqst_cd", ""));
			model.setPreRlyPortCd(JSPUtil.getParameter(request, "pre_rly_port_cd", ""));
			model.setPortClzDt(JSPUtil.getParameter(request, "port_clz_dt", ""));
			model.setAwkCgoFlg(JSPUtil.getParameter(request, "awk_cgo_flg", ""));
			model.setFnlDestCd(JSPUtil.getParameter(request, "fnl_dest_cd", ""));
			model.setDelCd(JSPUtil.getParameter(request, "del_cd", ""));
			model.setStopOffCntcPhnNo(JSPUtil.getParameter(request, "stop_off_cntc_phn_no", ""));
			model.setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
			model.setXterRmk(JSPUtil.getParameter(request, "xter_rmk", ""));
			model.setOrgRoutCd(JSPUtil.getParameter(request, "org_rout_cd", ""));
			model.setXterBkgRqstRefNo(JSPUtil.getParameter(request, "xter_bkg_rqst_ref_no", ""));
			model.setPstRlyPortCd(JSPUtil.getParameter(request, "pst_rly_port_cd", ""));
			model.setDestTzModCd(JSPUtil.getParameter(request, "dest_tz_mod_cd", ""));
			model.setPorCd(JSPUtil.getParameter(request, "por_cd", ""));
			model.setDocUsrId(JSPUtil.getParameter(request, "doc_usr_id", ""));
			model.setEqCtrlOfcCd(JSPUtil.getParameter(request, "eq_ctrl_ofc_cd", ""));
			model.setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
			model.setAdvShtgCd(JSPUtil.getParameter(request, "adv_shtg_cd", ""));
			model.setStopOffDiffRmk(JSPUtil.getParameter(request, "stop_off_diff_rmk", ""));
			model.setEqSubstFlg(JSPUtil.getParameter(request, "eq_subst_flg", ""));
			model.setHotDeFlg(JSPUtil.getParameter(request, "hot_de_flg", ""));
			model.setSplitDt(JSPUtil.getParameter(request, "split_dt", ""));
			model.setRfaNo(JSPUtil.getParameter(request, "rfa_no", ""));
			model.setRevDirCd(JSPUtil.getParameter(request, "rev_dir_cd", ""));
			model.setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
			model.setRailBlkCd(JSPUtil.getParameter(request, "rail_blk_cd", ""));
			model.setBbCgoFlg(JSPUtil.getParameter(request, "bb_cgo_flg", ""));
			model.setDcgoFlg(JSPUtil.getParameter(request, "dcgo_flg", ""));
			model.setMtyCreSvrCd(JSPUtil.getParameter(request, "mty_cre_svr_cd", ""));
			model.setRcvTermCd(JSPUtil.getParameter(request, "rcv_term_cd", ""));
			model.setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
			model.setMtyPortFlg(JSPUtil.getParameter(request, "mty_port_flg", ""));
			model.setMtyPodFlg(JSPUtil.getParameter(request, "mty_pod_flg", ""));
			model.setAllMtrFlg(JSPUtil.getParameter(request, "all_mtr_flg", ""));
			model.setTrfLnrItmNo(JSPUtil.getParameter(request, "trf_lnr_itm_no", ""));
			model.setPolNodCd(JSPUtil.getParameter(request, "pol_nod_cd", ""));
			model.setTwnSoNo(JSPUtil.getParameter(request, "twn_so_no", ""));
			model.setPodEtaDt(JSPUtil.getParameter(request, "pod_eta_dt", ""));
			model.setSkdDirCd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
			model.setUsaCstmsFileCd(JSPUtil.getParameter(request, "usa_cstms_file_cd", ""));
			model.setBlTpCd(JSPUtil.getParameter(request, "bl_tp_cd", ""));
			model.setDeTermCd(JSPUtil.getParameter(request, "de_term_cd", ""));
			model.setAllMtrChgFlg(JSPUtil.getParameter(request, "all_mtr_chg_flg", ""));
			model.setHngrFlg(JSPUtil.getParameter(request, "hngr_flg", ""));
			model.setMtyRtnYdCd(JSPUtil.getParameter(request, "mty_rtn_yd_cd", ""));
			model.setEstmBkgWgt(JSPUtil.getParameter(request, "estm_bkg_wgt", ""));
			model.setManual(JSPUtil.getParameter(request, "manual", ""));
		} catch (Exception e) {}
		return model;
	}

	public static Collection<BkgBooking> fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public static Collection<BkgBooking> fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgBooking model = null;
		Collection<BkgBooking> models = new ArrayList<BkgBooking>();

		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp==null)
   			return models;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] bkgCgoTpCd = (JSPUtil.getParameter(request, prefix	+ "bkg_cgo_tp_cd".trim(), length));
			String[] orgTrnsModCd = (JSPUtil.getParameter(request, prefix	+ "org_trns_mod_cd".trim(), length));
			String[] mtyPkupYdCd = (JSPUtil.getParameter(request, prefix	+ "mty_pkup_yd_cd".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] obSrepCd = (JSPUtil.getParameter(request, prefix	+ "ob_srep_cd".trim(), length));
			String[] ctrtOfcCd = (JSPUtil.getParameter(request, prefix	+ "ctrt_ofc_cd".trim(), length));
			String[] bkgCreDt = (JSPUtil.getParameter(request, prefix	+ "bkg_cre_dt".trim(), length));
			String[] stwgRmk = (JSPUtil.getParameter(request, prefix	+ "stwg_rmk".trim(), length));
			String[] stwgCd = (JSPUtil.getParameter(request, prefix	+ "stwg_cd".trim(), length));
			String[] shprOwnrCntrFlg = (JSPUtil.getParameter(request, prefix	+ "shpr_ownr_cntr_flg".trim(), length));
			String[] siFlg = (JSPUtil.getParameter(request, prefix	+ "si_flg".trim(), length));
			String[] chnAgnCd = (JSPUtil.getParameter(request, prefix	+ "chn_agn_cd".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] shprXptDeclCd = (JSPUtil.getParameter(request, prefix	+ "shpr_xpt_decl_cd".trim(), length));
			String[] blIssBlckFlg = (JSPUtil.getParameter(request, prefix	+ "bl_iss_blck_flg".trim(), length));
			String[] bkgOfcCd = (JSPUtil.getParameter(request, prefix	+ "bkg_ofc_cd".trim(), length));
			String[] mnlBkgNoFlg = (JSPUtil.getParameter(request, prefix	+ "mnl_bkg_no_flg".trim(), length));
			String[] dblBkgFlg = (JSPUtil.getParameter(request, prefix	+ "dbl_bkg_flg".trim(), length));
			String[] rhqCd = (JSPUtil.getParameter(request, prefix	+ "rhq_cd".trim(), length));
			String[] xterSiRefNo = (JSPUtil.getParameter(request, prefix	+ "xter_si_ref_no".trim(), length));
			String[] destSvcModCd = (JSPUtil.getParameter(request, prefix	+ "dest_svc_mod_cd".trim(), length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no".trim(), length));
			String[] fullRtnYdCd = (JSPUtil.getParameter(request, prefix	+ "full_rtn_yd_cd".trim(), length));
			String[] splitRto = (JSPUtil.getParameter(request, prefix	+ "split_rto".trim(), length));
			String[] podCd = (JSPUtil.getParameter(request, prefix	+ "pod_cd".trim(), length));
			String[] deDueDt = (JSPUtil.getParameter(request, prefix	+ "de_due_dt".trim(), length));
			String[] lodgDueDt = (JSPUtil.getParameter(request, prefix	+ "lodg_due_dt".trim(), length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no".trim(), length));
			String[] podNodCd = (JSPUtil.getParameter(request, prefix	+ "pod_nod_cd".trim(), length));
			String[] wtRsnHldFlg = (JSPUtil.getParameter(request, prefix	+ "wt_rsn_hld_flg".trim(), length));
			String[] mtyPreVvdFlg = (JSPUtil.getParameter(request, prefix	+ "mty_pre_vvd_flg".trim(), length));
			String[] ctrtSrepCd = (JSPUtil.getParameter(request, prefix	+ "ctrt_srep_cd".trim(), length));
			String[] spclHideFlg = (JSPUtil.getParameter(request, prefix	+ "spcl_hide_flg".trim(), length));
			String[] stwgFlg = (JSPUtil.getParameter(request, prefix	+ "stwg_flg".trim(), length));
			String[] frtFwrdFlg = (JSPUtil.getParameter(request, prefix	+ "frt_fwrd_flg".trim(), length));
			String[] rcFlg = (JSPUtil.getParameter(request, prefix	+ "rc_flg".trim(), length));
			String[] splitRsnCd = (JSPUtil.getParameter(request, prefix	+ "split_rsn_cd".trim(), length));
			String[] destTrnsModCd = (JSPUtil.getParameter(request, prefix	+ "dest_trns_mod_cd".trim(), length));
			String[] estmBkgWgtUtCd = (JSPUtil.getParameter(request, prefix	+ "estm_bkg_wgt_ut_cd".trim(), length));
			String[] stopOffLocCd = (JSPUtil.getParameter(request, prefix	+ "stop_off_loc_cd".trim(), length));
			String[] rdCgoFlg = (JSPUtil.getParameter(request, prefix	+ "rd_cgo_flg".trim(), length));
			String[] bkgStsCd = (JSPUtil.getParameter(request, prefix	+ "bkg_sts_cd".trim(), length));
			String[] fdGrdFlg = (JSPUtil.getParameter(request, prefix	+ "fd_grd_flg".trim(), length));
			String[] orgSvcModCd = (JSPUtil.getParameter(request, prefix	+ "org_svc_mod_cd".trim(), length));
			String[] mstBkgNoSplit = (JSPUtil.getParameter(request, prefix	+ "mst_bkg_no_split".trim(), length));
			String[] bkgCreCd = (JSPUtil.getParameter(request, prefix	+ "bkg_cre_cd".trim(), length));
			String[] scActCntCd = (JSPUtil.getParameter(request, prefix	+ "sc_act_cnt_cd".trim(), length));
			String[] mtySplitAvalCd = (JSPUtil.getParameter(request, prefix	+ "mty_split_aval_cd".trim(), length));
			String[] interRmk = (JSPUtil.getParameter(request, prefix	+ "inter_rmk".trim(), length));
			String[] scacCd = (JSPUtil.getParameter(request, prefix	+ "scac_cd".trim(), length));
			String[] cmdtCd = (JSPUtil.getParameter(request, prefix	+ "cmdt_cd".trim(), length));
			String[] apBrogFlg = (JSPUtil.getParameter(request, prefix	+ "ap_brog_flg".trim(), length));
			String[] bkgSplitCd = (JSPUtil.getParameter(request, prefix	+ "bkg_split_cd".trim(), length));
			String[] fullPkupYdCd = (JSPUtil.getParameter(request, prefix	+ "full_pkup_yd_cd".trim(), length));
			String[] bkgCxlDt = (JSPUtil.getParameter(request, prefix	+ "bkg_cxl_dt".trim(), length));
			String[] rgnOfcCd = (JSPUtil.getParameter(request, prefix	+ "rgn_ofc_cd".trim(), length));
			String[] creTpCd = (JSPUtil.getParameter(request, prefix	+ "cre_tp_cd".trim(), length));
			String[] ibSlsOfcCd = (JSPUtil.getParameter(request, prefix	+ "ib_sls_ofc_cd".trim(), length));
			String[] altCustCfmFlg = (JSPUtil.getParameter(request, prefix	+ "alt_cust_cfm_flg".trim(), length));
			String[] stopOffCntcPsonNm = (JSPUtil.getParameter(request, prefix	+ "stop_off_cntc_pson_nm".trim(), length));
			String[] porNodCd = (JSPUtil.getParameter(request, prefix	+ "por_nod_cd".trim(), length));
			String[] bkgNoSplit = (JSPUtil.getParameter(request, prefix	+ "bkg_no_split".trim(), length));
			String[] xterRqstAutoNtcFlg = (JSPUtil.getParameter(request, prefix	+ "xter_rqst_auto_ntc_flg".trim(), length));
			String[] mtyDorArrDt = (JSPUtil.getParameter(request, prefix	+ "mty_dor_arr_dt".trim(), length));
			String[] slanCd = (JSPUtil.getParameter(request, prefix	+ "slan_cd".trim(), length));
			String[] cmbBkgNo = (JSPUtil.getParameter(request, prefix	+ "cmb_bkg_no".trim(), length));
			String[] blNoAutoAsgnFlg = (JSPUtil.getParameter(request, prefix	+ "bl_no_auto_asgn_flg".trim(), length));
			String[] flexHgtFlg = (JSPUtil.getParameter(request, prefix	+ "flex_hgt_flg".trim(), length));
			String[] repCmdtCd = (JSPUtil.getParameter(request, prefix	+ "rep_cmdt_cd".trim(), length));
			String[] destRoutCd = (JSPUtil.getParameter(request, prefix	+ "dest_rout_cd".trim(), length));
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd".trim(), length));
			String[] mtyBkgStsCd = (JSPUtil.getParameter(request, prefix	+ "mty_bkg_sts_cd".trim(), length));
			String[] caInspDueDt = (JSPUtil.getParameter(request, prefix	+ "ca_insp_due_dt".trim(), length));
			String[] ibDelDeDt = (JSPUtil.getParameter(request, prefix	+ "ib_del_de_dt".trim(), length));
			String[] ocpCd = (JSPUtil.getParameter(request, prefix	+ "ocp_cd".trim(), length));
			String[] mstBkgNo = (JSPUtil.getParameter(request, prefix	+ "mst_bkg_no".trim(), length));
			String[] interRmkAudFlg = (JSPUtil.getParameter(request, prefix	+ "inter_rmk_aud_flg".trim(), length));
			String[] blckStwgCd = (JSPUtil.getParameter(request, prefix	+ "blck_stwg_cd".trim(), length));
			String[] orgTzModCd = (JSPUtil.getParameter(request, prefix	+ "org_tz_mod_cd".trim(), length));
			String[] polEtdDt = (JSPUtil.getParameter(request, prefix	+ "pol_etd_dt".trim(), length));
			String[] blNo = (JSPUtil.getParameter(request, prefix	+ "bl_no".trim(), length));
			String[] cmbBkgNoSplit = (JSPUtil.getParameter(request, prefix	+ "cmb_bkg_no_split".trim(), length));
			String[] blNoChk = (JSPUtil.getParameter(request, prefix	+ "bl_no_chk".trim(), length));
			String[] polCd = (JSPUtil.getParameter(request, prefix	+ "pol_cd".trim(), length));
			String[] scActCustSeq = (JSPUtil.getParameter(request, prefix	+ "sc_act_cust_seq".trim(), length));
			String[] scNo = (JSPUtil.getParameter(request, prefix	+ "sc_no".trim(), length));
			String[] prctFlg = (JSPUtil.getParameter(request, prefix	+ "prct_flg".trim(), length));
			String[] blNoTp = (JSPUtil.getParameter(request, prefix	+ "bl_no_tp".trim(), length));
			String[] delNodCd = (JSPUtil.getParameter(request, prefix	+ "del_nod_cd".trim(), length));
			String[] obSlsOfcCd = (JSPUtil.getParameter(request, prefix	+ "ob_sls_ofc_cd".trim(), length));
			String[] custToOrdFlg = (JSPUtil.getParameter(request, prefix	+ "cust_to_ord_flg".trim(), length));
			String[] wtRsnSpclCgoFlg = (JSPUtil.getParameter(request, prefix	+ "wt_rsn_spcl_cgo_flg".trim(), length));
			String[] xterSiCd = (JSPUtil.getParameter(request, prefix	+ "xter_si_cd".trim(), length));
			String[] cndCstmsFileCd = (JSPUtil.getParameter(request, prefix	+ "cnd_cstms_file_cd".trim(), length));
			String[] mtyPkupDt = (JSPUtil.getParameter(request, prefix	+ "mty_pkup_dt".trim(), length));
			String[] xterBkgRqstCd = (JSPUtil.getParameter(request, prefix	+ "xter_bkg_rqst_cd".trim(), length));
			String[] preRlyPortCd = (JSPUtil.getParameter(request, prefix	+ "pre_rly_port_cd".trim(), length));
			String[] portClzDt = (JSPUtil.getParameter(request, prefix	+ "port_clz_dt".trim(), length));
			String[] awkCgoFlg = (JSPUtil.getParameter(request, prefix	+ "awk_cgo_flg".trim(), length));
			String[] fnlDestCd = (JSPUtil.getParameter(request, prefix	+ "fnl_dest_cd".trim(), length));
			String[] delCd = (JSPUtil.getParameter(request, prefix	+ "del_cd".trim(), length));
			String[] stopOffCntcPhnNo = (JSPUtil.getParameter(request, prefix	+ "stop_off_cntc_phn_no".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] xterRmk = (JSPUtil.getParameter(request, prefix	+ "xter_rmk".trim(), length));
			String[] orgRoutCd = (JSPUtil.getParameter(request, prefix	+ "org_rout_cd".trim(), length));
			String[] xterBkgRqstRefNo = (JSPUtil.getParameter(request, prefix	+ "xter_bkg_rqst_ref_no".trim(), length));
			String[] pstRlyPortCd = (JSPUtil.getParameter(request, prefix	+ "pst_rly_port_cd".trim(), length));
			String[] destTzModCd = (JSPUtil.getParameter(request, prefix	+ "dest_tz_mod_cd".trim(), length));
			String[] porCd = (JSPUtil.getParameter(request, prefix	+ "por_cd".trim(), length));
			String[] docUsrId = (JSPUtil.getParameter(request, prefix	+ "doc_usr_id".trim(), length));
			String[] eqCtrlOfcCd = (JSPUtil.getParameter(request, prefix	+ "eq_ctrl_ofc_cd".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] advShtgCd = (JSPUtil.getParameter(request, prefix	+ "adv_shtg_cd".trim(), length));
			String[] stopOffDiffRmk = (JSPUtil.getParameter(request, prefix	+ "stop_off_diff_rmk".trim(), length));
			String[] eqSubstFlg = (JSPUtil.getParameter(request, prefix	+ "eq_subst_flg".trim(), length));
			String[] hotDeFlg = (JSPUtil.getParameter(request, prefix	+ "hot_de_flg".trim(), length));
			String[] splitDt = (JSPUtil.getParameter(request, prefix	+ "split_dt".trim(), length));
			String[] rfaNo = (JSPUtil.getParameter(request, prefix	+ "rfa_no".trim(), length));
			String[] revDirCd = (JSPUtil.getParameter(request, prefix	+ "rev_dir_cd".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] railBlkCd = (JSPUtil.getParameter(request, prefix	+ "rail_blk_cd".trim(), length));
			String[] bbCgoFlg = (JSPUtil.getParameter(request, prefix	+ "bb_cgo_flg".trim(), length));
			String[] dcgoFlg = (JSPUtil.getParameter(request, prefix	+ "dcgo_flg".trim(), length));
			String[] mtyCreSvrCd = (JSPUtil.getParameter(request, prefix	+ "mty_cre_svr_cd".trim(), length));
			String[] rcvTermCd = (JSPUtil.getParameter(request, prefix	+ "rcv_term_cd".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] mtyPortFlg = (JSPUtil.getParameter(request, prefix	+ "mty_port_flg".trim(), length));
			String[] mtyPodFlg = (JSPUtil.getParameter(request, prefix	+ "mty_pod_flg".trim(), length));
			String[] allMtrFlg = (JSPUtil.getParameter(request, prefix	+ "all_mtr_flg".trim(), length));
			String[] trfLnrItmNo = (JSPUtil.getParameter(request, prefix	+ "trf_lnr_itm_no".trim(), length));
			String[] polNodCd = (JSPUtil.getParameter(request, prefix	+ "pol_nod_cd".trim(), length));
			String[] twnSoNo = (JSPUtil.getParameter(request, prefix	+ "twn_so_no".trim(), length));
			String[] podEtaDt = (JSPUtil.getParameter(request, prefix	+ "pod_eta_dt".trim(), length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd".trim(), length));
			String[] usaCstmsFileCd = (JSPUtil.getParameter(request, prefix	+ "usa_cstms_file_cd".trim(), length));
			String[] blTpCd = (JSPUtil.getParameter(request, prefix	+ "bl_tp_cd".trim(), length));
			String[] deTermCd = (JSPUtil.getParameter(request, prefix	+ "de_term_cd".trim(), length));
			String[] allMtrChgFlg = (JSPUtil.getParameter(request, prefix	+ "all_mtr_chg_flg".trim(), length));
			String[] hngrFlg = (JSPUtil.getParameter(request, prefix	+ "hngr_flg".trim(), length));
			String[] mtyRtnYdCd = (JSPUtil.getParameter(request, prefix	+ "mty_rtn_yd_cd".trim(), length));
			String[] estmBkgWgt = (JSPUtil.getParameter(request, prefix	+ "estm_bkg_wgt".trim(), length));
			String[] manual = (JSPUtil.getParameter(request, prefix	+ "manual".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgBooking();
				if (bkgCgoTpCd[i] != null)
					model.setBkgCgoTpCd(bkgCgoTpCd[i]);
				if (orgTrnsModCd[i] != null)
					model.setOrgTrnsModCd(orgTrnsModCd[i]);
				if (mtyPkupYdCd[i] != null)
					model.setMtyPkupYdCd(mtyPkupYdCd[i]);
				if (pagerows[i] != null)
					model.setPage_rows(pagerows[i]);
				if (obSrepCd[i] != null)
					model.setObSrepCd(obSrepCd[i]);
				if (ctrtOfcCd[i] != null)
					model.setCtrtOfcCd(ctrtOfcCd[i]);
				if (bkgCreDt[i] != null)
					model.setBkgCreDt(bkgCreDt[i]);
				if (stwgRmk[i] != null)
					model.setStwgRmk(stwgRmk[i]);
				if (stwgCd[i] != null)
					model.setStwgCd(stwgCd[i]);
				if (shprOwnrCntrFlg[i] != null)
					model.setShprOwnrCntrFlg(shprOwnrCntrFlg[i]);
				if (siFlg[i] != null)
					model.setSiFlg(siFlg[i]);
				if (chnAgnCd[i] != null)
					model.setChnAgnCd(chnAgnCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (shprXptDeclCd[i] != null)
					model.setShprXptDeclCd(shprXptDeclCd[i]);
				if (blIssBlckFlg[i] != null)
					model.setBlIssBlckFlg(blIssBlckFlg[i]);
				if (bkgOfcCd[i] != null)
					model.setBkgOfcCd(bkgOfcCd[i]);
				if (mnlBkgNoFlg[i] != null)
					model.setMnlBkgNoFlg(mnlBkgNoFlg[i]);
				if (dblBkgFlg[i] != null)
					model.setDblBkgFlg(dblBkgFlg[i]);
				if (rhqCd[i] != null)
					model.setRhqCd(rhqCd[i]);
				if (xterSiRefNo[i] != null)
					model.setXterSiRefNo(xterSiRefNo[i]);
				if (destSvcModCd[i] != null)
					model.setDestSvcModCd(destSvcModCd[i]);
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
				if (ctrtSrepCd[i] != null)
					model.setCtrtSrepCd(ctrtSrepCd[i]);
				if (spclHideFlg[i] != null)
					model.setSpclHideFlg(spclHideFlg[i]);
				if (stwgFlg[i] != null)
					model.setStwgFlg(stwgFlg[i]);
				if (frtFwrdFlg[i] != null)
					model.setFrtFwrdFlg(frtFwrdFlg[i]);
				if (rcFlg[i] != null)
					model.setRcFlg(rcFlg[i]);
				if (splitRsnCd[i] != null)
					model.setSplitRsnCd(splitRsnCd[i]);
				if (destTrnsModCd[i] != null)
					model.setDestTrnsModCd(destTrnsModCd[i]);
				if (estmBkgWgtUtCd[i] != null)
					model.setEstmBkgWgtUtCd(estmBkgWgtUtCd[i]);
				if (stopOffLocCd[i] != null)
					model.setStopOffLocCd(stopOffLocCd[i]);
				if (rdCgoFlg[i] != null)
					model.setRdCgoFlg(rdCgoFlg[i]);
				if (bkgStsCd[i] != null)
					model.setBkgStsCd(bkgStsCd[i]);
				if (fdGrdFlg[i] != null)
					model.setFdGrdFlg(fdGrdFlg[i]);
				if (orgSvcModCd[i] != null)
					model.setOrgSvcModCd(orgSvcModCd[i]);
				if (mstBkgNoSplit[i] != null)
					model.setMstBkgNoSplit(mstBkgNoSplit[i]);
				if (bkgCreCd[i] != null)
					model.setBkgCreCd(bkgCreCd[i]);
				if (scActCntCd[i] != null)
					model.setScActCntCd(scActCntCd[i]);
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
				if (bkgSplitCd[i] != null)
					model.setBkgSplitCd(bkgSplitCd[i]);
				if (fullPkupYdCd[i] != null)
					model.setFullPkupYdCd(fullPkupYdCd[i]);
				if (bkgCxlDt[i] != null)
					model.setBkgCxlDt(bkgCxlDt[i]);
				if (rgnOfcCd[i] != null)
					model.setRgnOfcCd(rgnOfcCd[i]);
				if (creTpCd[i] != null)
					model.setCreTpCd(creTpCd[i]);
				if (ibSlsOfcCd[i] != null)
					model.setIbSlsOfcCd(ibSlsOfcCd[i]);
				if (altCustCfmFlg[i] != null)
					model.setAltCustCfmFlg(altCustCfmFlg[i]);
				if (stopOffCntcPsonNm[i] != null)
					model.setStopOffCntcPsonNm(stopOffCntcPsonNm[i]);
				if (porNodCd[i] != null)
					model.setPorNodCd(porNodCd[i]);
				if (bkgNoSplit[i] != null)
					model.setBkgNoSplit(bkgNoSplit[i]);
				if (xterRqstAutoNtcFlg[i] != null)
					model.setXterRqstAutoNtcFlg(xterRqstAutoNtcFlg[i]);
				if (mtyDorArrDt[i] != null)
					model.setMtyDorArrDt(mtyDorArrDt[i]);
				if (slanCd[i] != null)
					model.setSlanCd(slanCd[i]);
				if (cmbBkgNo[i] != null)
					model.setCmbBkgNo(cmbBkgNo[i]);
				if (blNoAutoAsgnFlg[i] != null)
					model.setBlNoAutoAsgnFlg(blNoAutoAsgnFlg[i]);
				if (flexHgtFlg[i] != null)
					model.setFlexHgtFlg(flexHgtFlg[i]);
				if (repCmdtCd[i] != null)
					model.setRepCmdtCd(repCmdtCd[i]);
				if (destRoutCd[i] != null)
					model.setDestRoutCd(destRoutCd[i]);
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
				if (mstBkgNo[i] != null)
					model.setMstBkgNo(mstBkgNo[i]);
				if (interRmkAudFlg[i] != null)
					model.setInterRmkAudFlg(interRmkAudFlg[i]);
				if (blckStwgCd[i] != null)
					model.setBlckStwgCd(blckStwgCd[i]);
				if (orgTzModCd[i] != null)
					model.setOrgTzModCd(orgTzModCd[i]);
				if (polEtdDt[i] != null)
					model.setPolEtdDt(polEtdDt[i]);
				if (blNo[i] != null)
					model.setBlNo(blNo[i]);
				if (cmbBkgNoSplit[i] != null)
					model.setCmbBkgNoSplit(cmbBkgNoSplit[i]);
				if (blNoChk[i] != null)
					model.setBlNoChk(blNoChk[i]);
				if (polCd[i] != null)
					model.setPolCd(polCd[i]);
				if (scActCustSeq[i] != null)
					model.setScActCustSeq(scActCustSeq[i]);
				if (scNo[i] != null)
					model.setScNo(scNo[i]);
				if (prctFlg[i] != null)
					model.setPrctFlg(prctFlg[i]);
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
				if (portClzDt[i] != null)
					model.setPortClzDt(portClzDt[i]);
				if (awkCgoFlg[i] != null)
					model.setAwkCgoFlg(awkCgoFlg[i]);
				if (fnlDestCd[i] != null)
					model.setFnlDestCd(fnlDestCd[i]);
				if (delCd[i] != null)
					model.setDelCd(delCd[i]);
				if (stopOffCntcPhnNo[i] != null)
					model.setStopOffCntcPhnNo(stopOffCntcPhnNo[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (xterRmk[i] != null)
					model.setXterRmk(xterRmk[i]);
				if (orgRoutCd[i] != null)
					model.setOrgRoutCd(orgRoutCd[i]);
				if (xterBkgRqstRefNo[i] != null)
					model.setXterBkgRqstRefNo(xterBkgRqstRefNo[i]);
				if (pstRlyPortCd[i] != null)
					model.setPstRlyPortCd(pstRlyPortCd[i]);
				if (destTzModCd[i] != null)
					model.setDestTzModCd(destTzModCd[i]);
				if (porCd[i] != null)
					model.setPorCd(porCd[i]);
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
				if (mtyCreSvrCd[i] != null)
					model.setMtyCreSvrCd(mtyCreSvrCd[i]);
				if (rcvTermCd[i] != null)
					model.setRcvTermCd(rcvTermCd[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (mtyPortFlg[i] != null)
					model.setMtyPortFlg(mtyPortFlg[i]);
				if (mtyPodFlg[i] != null)
					model.setMtyPodFlg(mtyPodFlg[i]);
				if (allMtrFlg[i] != null)
					model.setAllMtrFlg(allMtrFlg[i]);
				if (trfLnrItmNo[i] != null)
					model.setTrfLnrItmNo(trfLnrItmNo[i]);
				if (polNodCd[i] != null)
					model.setPolNodCd(polNodCd[i]);
				if (twnSoNo[i] != null)
					model.setTwnSoNo(twnSoNo[i]);
				if (podEtaDt[i] != null)
					model.setPodEtaDt(podEtaDt[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (usaCstmsFileCd[i] != null)
					model.setUsaCstmsFileCd(usaCstmsFileCd[i]);
				if (blTpCd[i] != null)
					model.setBlTpCd(blTpCd[i]);
				if (deTermCd[i] != null)
					model.setDeTermCd(deTermCd[i]);
				if (allMtrChgFlg[i] != null)
					model.setAllMtrChgFlg(allMtrChgFlg[i]);
				if (hngrFlg[i] != null)
					model.setHngrFlg(hngrFlg[i]);
				if (mtyRtnYdCd[i] != null)
					model.setMtyRtnYdCd(mtyRtnYdCd[i]);
				if (estmBkgWgt[i] != null)
					model.setEstmBkgWgt(estmBkgWgt[i]);
				if (manual[i] != null)
					model.setManual(manual[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return models;
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

}
