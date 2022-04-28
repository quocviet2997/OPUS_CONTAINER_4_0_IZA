/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : SaqMonQtaRfVO.java
*@FileTitle : SaqMonQtaRfVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.23
*@LastModifier : 김민아
*@LastVersion : 1.0
* 2009.07.23 김민아 
* 1.0 Creation
* 2010.09.17 이상용  [CHM-201005683] 특수화물 판매목표 수립  rhqCd,from_mon,to_mon추가 
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
 * @author 김민아
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class SaqMonQtaRfVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SaqMonQtaRfVO> models = new ArrayList<SaqMonQtaRfVO>();
	
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String actType = null;
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String cmUcAmt = null;
	/* Column Info */
	private String qtaTgtCd = null;
	/* Column Info */
	private String saqMiscRevAmt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String trdCd = null;
	/* Column Info */
	private String rlaneCd = null;
	/* Column Info */
	private String stpUcAmt = null;
	/* Column Info */
	private String mtyTrspUcAmt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String eqRepoUcAmt = null;
	/* Column Info */
	private String bseMon = null;
	/* Column Info */
	private String bseQtrCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String convDirCd = null;
	/* Column Info */
	private String mtyStvgUcAmt = null;
	/* Column Info */
	private String mqtaStepCd = null;
	/* Column Info */
	private String cntrFxUcAmt = null;
	/* Column Info */
	private String grsRpbRev = null;
	/* Column Info */
	private String dirCd = null;
	/* Column Info */
	private String eqHldUcAmt = null;
	/* Column Info */
	private String bizActUcAmt = null;
	/* Column Info */
	private String keyAcctMgrUsrId = null;
	/* Column Info */
	private String mqtaVerNo = null;
	/* Column Info */
	private String rgnOfcCd = null;
	/* Column Info */
	private String aqCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String fullTrspUcAmt = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String lodQty = null;
	/* Column Info */
	private String sltMgmtUcAmt = null;
	/* Column Info */
	private String custGrpId = null;
	/* Column Info */
	private String raOpfitUcAmt = null;
	/* Column Info */
	private String rhqCd = null;
	/* Column Info */
	private String opfitUcAmt = null;
	/* Column Info */
	private String ofcAddFlg = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String bseYr = null;
	/* Column Info */
	private String agnCommUtAmt = null;
	/* Column Info */
	private String chssFxUcAmt = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String raCmUcAmt = null;
	/* Column Info */
	private String ownVolActUcAmt = null;
	/* Column Info */
	private String eqSimUcAmt = null;
	/* Column Info */
	private String fullStvgUcAmt = null;
	/* Column Info */
	private String vvdCd = null;
	/* Column Info */
	private String subTrdCd = null;
	/* Column Info */
	private String from_mon = null;
	/* Column Info */
	private String to_mon = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public SaqMonQtaRfVO() {}

	public SaqMonQtaRfVO(String ibflag, String pagerows, String mqtaStepCd, String bseYr, String bseQtrCd, String qtaTgtCd, String mqtaVerNo, String keyAcctMgrUsrId, String bseMon, String trdCd, String rlaneCd, String dirCd, String vslCd, String skdVoyNo, String skdDirCd, String rgnOfcCd, String custGrpId, String rhqCd, String aqCd, String lodQty, String grsRpbRev, String cmUcAmt, String opfitUcAmt, String raCmUcAmt, String raOpfitUcAmt, String fullStvgUcAmt, String fullTrspUcAmt, String mtyStvgUcAmt, String mtyTrspUcAmt, String cntrFxUcAmt, String chssFxUcAmt, String agnCommUtAmt, String bizActUcAmt, String sltMgmtUcAmt, String ownVolActUcAmt, String stpUcAmt, String eqHldUcAmt, String eqRepoUcAmt, String eqSimUcAmt, String convDirCd, String saqMiscRevAmt, String ofcAddFlg, String creUsrId, String creDt, String updUsrId, String updDt, String vvdCd, String deltFlg, String actType, String subTrdCd, String from_mon, String to_mon) {
		this.vslCd = vslCd;
		this.cmUcAmt = cmUcAmt;
		this.qtaTgtCd = qtaTgtCd;
		this.saqMiscRevAmt = saqMiscRevAmt;
		this.creDt = creDt;
		this.trdCd = trdCd;
		this.rlaneCd = rlaneCd;
		this.stpUcAmt = stpUcAmt;
		this.mtyTrspUcAmt = mtyTrspUcAmt;
		this.pagerows = pagerows;
		this.eqRepoUcAmt = eqRepoUcAmt;
		this.bseMon = bseMon;
		this.bseQtrCd = bseQtrCd;
		this.ibflag = ibflag;
		this.convDirCd = convDirCd;
		this.mtyStvgUcAmt = mtyStvgUcAmt;
		this.mqtaStepCd = mqtaStepCd;
		this.cntrFxUcAmt = cntrFxUcAmt;
		this.grsRpbRev = grsRpbRev;
		this.dirCd = dirCd;
		this.eqHldUcAmt = eqHldUcAmt;
		this.bizActUcAmt = bizActUcAmt;
		this.keyAcctMgrUsrId = keyAcctMgrUsrId;
		this.mqtaVerNo = mqtaVerNo;
		this.rgnOfcCd = rgnOfcCd;
		this.aqCd = aqCd;
		this.updUsrId = updUsrId;
		this.fullTrspUcAmt = fullTrspUcAmt;
		this.updDt = updDt;
		this.lodQty = lodQty;
		this.sltMgmtUcAmt = sltMgmtUcAmt;
		this.custGrpId = custGrpId;
		this.raOpfitUcAmt = raOpfitUcAmt;
		this.rhqCd = rhqCd;
		this.opfitUcAmt = opfitUcAmt;
		this.ofcAddFlg = ofcAddFlg;
		this.skdVoyNo = skdVoyNo;
		this.bseYr = bseYr;
		this.agnCommUtAmt = agnCommUtAmt;
		this.chssFxUcAmt = chssFxUcAmt;
		this.skdDirCd = skdDirCd;
		this.creUsrId = creUsrId;
		this.raCmUcAmt = raCmUcAmt;
		this.ownVolActUcAmt = ownVolActUcAmt;
		this.eqSimUcAmt = eqSimUcAmt;
		this.fullStvgUcAmt = fullStvgUcAmt;
		this.vvdCd = vvdCd;
		this.deltFlg = deltFlg;
		this.actType = actType;
		this.subTrdCd = subTrdCd;
		this.from_mon = from_mon;
		this.to_mon = to_mon;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("cm_uc_amt", getCmUcAmt());
		this.hashColumns.put("qta_tgt_cd", getQtaTgtCd());
		this.hashColumns.put("saq_misc_rev_amt", getSaqMiscRevAmt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("trd_cd", getTrdCd());
		this.hashColumns.put("rlane_cd", getRlaneCd());
		this.hashColumns.put("stp_uc_amt", getStpUcAmt());
		this.hashColumns.put("mty_trsp_uc_amt", getMtyTrspUcAmt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("eq_repo_uc_amt", getEqRepoUcAmt());
		this.hashColumns.put("bse_mon", getBseMon());
		this.hashColumns.put("bse_qtr_cd", getBseQtrCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("conv_dir_cd", getConvDirCd());
		this.hashColumns.put("mty_stvg_uc_amt", getMtyStvgUcAmt());
		this.hashColumns.put("mqta_step_cd", getMqtaStepCd());
		this.hashColumns.put("cntr_fx_uc_amt", getCntrFxUcAmt());
		this.hashColumns.put("grs_rpb_rev", getGrsRpbRev());
		this.hashColumns.put("dir_cd", getDirCd());
		this.hashColumns.put("eq_hld_uc_amt", getEqHldUcAmt());
		this.hashColumns.put("biz_act_uc_amt", getBizActUcAmt());
		this.hashColumns.put("key_acct_mgr_usr_id", getKeyAcctMgrUsrId());
		this.hashColumns.put("mqta_ver_no", getMqtaVerNo());
		this.hashColumns.put("rgn_ofc_cd", getRgnOfcCd());
		this.hashColumns.put("aq_cd", getAqCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("full_trsp_uc_amt", getFullTrspUcAmt());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("lod_qty", getLodQty());
		this.hashColumns.put("slt_mgmt_uc_amt", getSltMgmtUcAmt());
		this.hashColumns.put("cust_grp_id", getCustGrpId());
		this.hashColumns.put("ra_opfit_uc_amt", getRaOpfitUcAmt());
		this.hashColumns.put("rhq_cd", getRhqCd());
		this.hashColumns.put("opfit_uc_amt", getOpfitUcAmt());
		this.hashColumns.put("ofc_add_flg", getOfcAddFlg());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("bse_yr", getBseYr());
		this.hashColumns.put("agn_comm_ut_amt", getAgnCommUtAmt());
		this.hashColumns.put("chss_fx_uc_amt", getChssFxUcAmt());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ra_cm_uc_amt", getRaCmUcAmt());
		this.hashColumns.put("own_vol_act_uc_amt", getOwnVolActUcAmt());
		this.hashColumns.put("eq_sim_uc_amt", getEqSimUcAmt());
		this.hashColumns.put("full_stvg_uc_amt", getFullStvgUcAmt());
		this.hashColumns.put("vvd_cd", getVvdCd());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("act_type", getActType());
		this.hashColumns.put("sub_trd_cd", getSubTrdCd());
		this.hashColumns.put("from_mon", getFrom_mon());
		this.hashColumns.put("to_mon", getTo_mon());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("cm_uc_amt", "cmUcAmt");
		this.hashFields.put("qta_tgt_cd", "qtaTgtCd");
		this.hashFields.put("saq_misc_rev_amt", "saqMiscRevAmt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("trd_cd", "trdCd");
		this.hashFields.put("rlane_cd", "rlaneCd");
		this.hashFields.put("stp_uc_amt", "stpUcAmt");
		this.hashFields.put("mty_trsp_uc_amt", "mtyTrspUcAmt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("eq_repo_uc_amt", "eqRepoUcAmt");
		this.hashFields.put("bse_mon", "bseMon");
		this.hashFields.put("bse_qtr_cd", "bseQtrCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("conv_dir_cd", "convDirCd");
		this.hashFields.put("mty_stvg_uc_amt", "mtyStvgUcAmt");
		this.hashFields.put("mqta_step_cd", "mqtaStepCd");
		this.hashFields.put("cntr_fx_uc_amt", "cntrFxUcAmt");
		this.hashFields.put("grs_rpb_rev", "grsRpbRev");
		this.hashFields.put("dir_cd", "dirCd");
		this.hashFields.put("eq_hld_uc_amt", "eqHldUcAmt");
		this.hashFields.put("biz_act_uc_amt", "bizActUcAmt");
		this.hashFields.put("key_acct_mgr_usr_id", "keyAcctMgrUsrId");
		this.hashFields.put("mqta_ver_no", "mqtaVerNo");
		this.hashFields.put("rgn_ofc_cd", "rgnOfcCd");
		this.hashFields.put("aq_cd", "aqCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("full_trsp_uc_amt", "fullTrspUcAmt");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("lod_qty", "lodQty");
		this.hashFields.put("slt_mgmt_uc_amt", "sltMgmtUcAmt");
		this.hashFields.put("cust_grp_id", "custGrpId");
		this.hashFields.put("ra_opfit_uc_amt", "raOpfitUcAmt");
		this.hashFields.put("rhq_cd", "rhqCd");
		this.hashFields.put("opfit_uc_amt", "opfitUcAmt");
		this.hashFields.put("ofc_add_flg", "ofcAddFlg");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("bse_yr", "bseYr");
		this.hashFields.put("agn_comm_ut_amt", "agnCommUtAmt");
		this.hashFields.put("chss_fx_uc_amt", "chssFxUcAmt");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ra_cm_uc_amt", "raCmUcAmt");
		this.hashFields.put("own_vol_act_uc_amt", "ownVolActUcAmt");
		this.hashFields.put("eq_sim_uc_amt", "eqSimUcAmt");
		this.hashFields.put("full_stvg_uc_amt", "fullStvgUcAmt");
		this.hashFields.put("vvd_cd", "vvdCd");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("act_type", "actType");
		this.hashFields.put("act_type", "actType");
		this.hashFields.put("sub_trd_cd", "subTrdCd");
		this.hashFields.put("from_mon", "fromMon");
		this.hashFields.put("to_mon", "toMon");
		return this.hashFields;
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
	 * @return cmUcAmt
	 */
	public String getCmUcAmt() {
		return this.cmUcAmt;
	}
	
	/**
	 * Column Info
	 * @return qtaTgtCd
	 */
	public String getQtaTgtCd() {
		return this.qtaTgtCd;
	}
	
	/**
	 * Column Info
	 * @return saqMiscRevAmt
	 */
	public String getSaqMiscRevAmt() {
		return this.saqMiscRevAmt;
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
	 * @return stpUcAmt
	 */
	public String getStpUcAmt() {
		return this.stpUcAmt;
	}
	
	/**
	 * Column Info
	 * @return mtyTrspUcAmt
	 */
	public String getMtyTrspUcAmt() {
		return this.mtyTrspUcAmt;
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
	 * @return eqRepoUcAmt
	 */
	public String getEqRepoUcAmt() {
		return this.eqRepoUcAmt;
	}
	
	/**
	 * Column Info
	 * @return bseMon
	 */
	public String getBseMon() {
		return this.bseMon;
	}
	
	/**
	 * Column Info
	 * @return bseQtrCd
	 */
	public String getBseQtrCd() {
		return this.bseQtrCd;
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
	 * @return convDirCd
	 */
	public String getConvDirCd() {
		return this.convDirCd;
	}
	
	/**
	 * Column Info
	 * @return mtyStvgUcAmt
	 */
	public String getMtyStvgUcAmt() {
		return this.mtyStvgUcAmt;
	}
	
	/**
	 * Column Info
	 * @return mqtaStepCd
	 */
	public String getMqtaStepCd() {
		return this.mqtaStepCd;
	}
	
	/**
	 * Column Info
	 * @return cntrFxUcAmt
	 */
	public String getCntrFxUcAmt() {
		return this.cntrFxUcAmt;
	}
	
	/**
	 * Column Info
	 * @return grsRpbRev
	 */
	public String getGrsRpbRev() {
		return this.grsRpbRev;
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
	 * @return eqHldUcAmt
	 */
	public String getEqHldUcAmt() {
		return this.eqHldUcAmt;
	}
	
	/**
	 * Column Info
	 * @return bizActUcAmt
	 */
	public String getBizActUcAmt() {
		return this.bizActUcAmt;
	}
	
	/**
	 * Column Info
	 * @return keyAcctMgrUsrId
	 */
	public String getKeyAcctMgrUsrId() {
		return this.keyAcctMgrUsrId;
	}
	
	/**
	 * Column Info
	 * @return mqtaVerNo
	 */
	public String getMqtaVerNo() {
		return this.mqtaVerNo;
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
	 * @return aqCd
	 */
	public String getAqCd() {
		return this.aqCd;
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
	 * @return fullTrspUcAmt
	 */
	public String getFullTrspUcAmt() {
		return this.fullTrspUcAmt;
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
	 * @return lodQty
	 */
	public String getLodQty() {
		return this.lodQty;
	}
	
	/**
	 * Column Info
	 * @return sltMgmtUcAmt
	 */
	public String getSltMgmtUcAmt() {
		return this.sltMgmtUcAmt;
	}
	
	/**
	 * Column Info
	 * @return custGrpId
	 */
	public String getCustGrpId() {
		return this.custGrpId;
	}
	
	/**
	 * Column Info
	 * @return raOpfitUcAmt
	 */
	public String getRaOpfitUcAmt() {
		return this.raOpfitUcAmt;
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
	 * @return opfitUcAmt
	 */
	public String getOpfitUcAmt() {
		return this.opfitUcAmt;
	}
	
	/**
	 * Column Info
	 * @return ofcAddFlg
	 */
	public String getOfcAddFlg() {
		return this.ofcAddFlg;
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
	 * @return bseYr
	 */
	public String getBseYr() {
		return this.bseYr;
	}
	
	/**
	 * Column Info
	 * @return agnCommUtAmt
	 */
	public String getAgnCommUtAmt() {
		return this.agnCommUtAmt;
	}
	
	/**
	 * Column Info
	 * @return chssFxUcAmt
	 */
	public String getChssFxUcAmt() {
		return this.chssFxUcAmt;
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
	 * @return creUsrId
	 */
	public String getCreUsrId() {
		return this.creUsrId;
	}
	
	/**
	 * Column Info
	 * @return raCmUcAmt
	 */
	public String getRaCmUcAmt() {
		return this.raCmUcAmt;
	}
	
	/**
	 * Column Info
	 * @return ownVolActUcAmt
	 */
	public String getOwnVolActUcAmt() {
		return this.ownVolActUcAmt;
	}
	
	/**
	 * Column Info
	 * @return eqSimUcAmt
	 */
	public String getEqSimUcAmt() {
		return this.eqSimUcAmt;
	}
	
	/**
	 * Column Info
	 * @return fullStvgUcAmt
	 */
	public String getFullStvgUcAmt() {
		return this.fullStvgUcAmt;
	}
	
	/**
	 * Column Info
	 * @return vvdCd
	 */
	public String getVvdCd() {
		return vvdCd;
	}
	
	/**
	 * Column Info
	 * @return deltFlg
	 */
	public String getDeltFlg() {
		return deltFlg;
	}
	
	/**
	 * Column Info
	 * @return actType
	 */
	public String getActType() {
		return actType;
	}
	
	/**
	 * Column Info
	 * @return subTrdCd
	 */
	public String getSubTrdCd() {
		return subTrdCd;
	}
	
	/**
	 * Column Info
	 * @return from_mon
	 */
	public String getFrom_mon() {
		return from_mon;
	}
	
	/**
	 * Column Info
	 * @return to_mon
	 */
	public String getTo_mon() {
		return to_mon;
	}

	/**
	 * Column Info
	 * @param vvdCd
	 */
	public void setVvdCd(String vvdCd) {
		this.vvdCd = vvdCd;
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
	 * @param cmUcAmt
	 */
	public void setCmUcAmt(String cmUcAmt) {
		this.cmUcAmt = cmUcAmt;
	}
	
	/**
	 * Column Info
	 * @param qtaTgtCd
	 */
	public void setQtaTgtCd(String qtaTgtCd) {
		this.qtaTgtCd = qtaTgtCd;
	}
	
	/**
	 * Column Info
	 * @param saqMiscRevAmt
	 */
	public void setSaqMiscRevAmt(String saqMiscRevAmt) {
		this.saqMiscRevAmt = saqMiscRevAmt;
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
	 * @param stpUcAmt
	 */
	public void setStpUcAmt(String stpUcAmt) {
		this.stpUcAmt = stpUcAmt;
	}
	
	/**
	 * Column Info
	 * @param mtyTrspUcAmt
	 */
	public void setMtyTrspUcAmt(String mtyTrspUcAmt) {
		this.mtyTrspUcAmt = mtyTrspUcAmt;
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
	 * @param eqRepoUcAmt
	 */
	public void setEqRepoUcAmt(String eqRepoUcAmt) {
		this.eqRepoUcAmt = eqRepoUcAmt;
	}
	
	/**
	 * Column Info
	 * @param bseMon
	 */
	public void setBseMon(String bseMon) {
		this.bseMon = bseMon;
	}
	
	/**
	 * Column Info
	 * @param bseQtrCd
	 */
	public void setBseQtrCd(String bseQtrCd) {
		this.bseQtrCd = bseQtrCd;
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
	 * @param convDirCd
	 */
	public void setConvDirCd(String convDirCd) {
		this.convDirCd = convDirCd;
	}
	
	/**
	 * Column Info
	 * @param mtyStvgUcAmt
	 */
	public void setMtyStvgUcAmt(String mtyStvgUcAmt) {
		this.mtyStvgUcAmt = mtyStvgUcAmt;
	}
	
	/**
	 * Column Info
	 * @param mqtaStepCd
	 */
	public void setMqtaStepCd(String mqtaStepCd) {
		this.mqtaStepCd = mqtaStepCd;
	}
	
	/**
	 * Column Info
	 * @param cntrFxUcAmt
	 */
	public void setCntrFxUcAmt(String cntrFxUcAmt) {
		this.cntrFxUcAmt = cntrFxUcAmt;
	}
	
	/**
	 * Column Info
	 * @param grsRpbRev
	 */
	public void setGrsRpbRev(String grsRpbRev) {
		this.grsRpbRev = grsRpbRev;
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
	 * @param eqHldUcAmt
	 */
	public void setEqHldUcAmt(String eqHldUcAmt) {
		this.eqHldUcAmt = eqHldUcAmt;
	}
	
	/**
	 * Column Info
	 * @param bizActUcAmt
	 */
	public void setBizActUcAmt(String bizActUcAmt) {
		this.bizActUcAmt = bizActUcAmt;
	}
	
	/**
	 * Column Info
	 * @param keyAcctMgrUsrId
	 */
	public void setKeyAcctMgrUsrId(String keyAcctMgrUsrId) {
		this.keyAcctMgrUsrId = keyAcctMgrUsrId;
	}
	
	/**
	 * Column Info
	 * @param mqtaVerNo
	 */
	public void setMqtaVerNo(String mqtaVerNo) {
		this.mqtaVerNo = mqtaVerNo;
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
	 * @param aqCd
	 */
	public void setAqCd(String aqCd) {
		this.aqCd = aqCd;
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
	 * @param fullTrspUcAmt
	 */
	public void setFullTrspUcAmt(String fullTrspUcAmt) {
		this.fullTrspUcAmt = fullTrspUcAmt;
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
	 * @param lodQty
	 */
	public void setLodQty(String lodQty) {
		this.lodQty = lodQty;
	}
	
	/**
	 * Column Info
	 * @param sltMgmtUcAmt
	 */
	public void setSltMgmtUcAmt(String sltMgmtUcAmt) {
		this.sltMgmtUcAmt = sltMgmtUcAmt;
	}
	
	/**
	 * Column Info
	 * @param custGrpId
	 */
	public void setCustGrpId(String custGrpId) {
		this.custGrpId = custGrpId;
	}
	
	/**
	 * Column Info
	 * @param raOpfitUcAmt
	 */
	public void setRaOpfitUcAmt(String raOpfitUcAmt) {
		this.raOpfitUcAmt = raOpfitUcAmt;
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
	 * @param opfitUcAmt
	 */
	public void setOpfitUcAmt(String opfitUcAmt) {
		this.opfitUcAmt = opfitUcAmt;
	}
	
	/**
	 * Column Info
	 * @param ofcAddFlg
	 */
	public void setOfcAddFlg(String ofcAddFlg) {
		this.ofcAddFlg = ofcAddFlg;
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
	 * @param bseYr
	 */
	public void setBseYr(String bseYr) {
		this.bseYr = bseYr;
	}
	
	/**
	 * Column Info
	 * @param agnCommUtAmt
	 */
	public void setAgnCommUtAmt(String agnCommUtAmt) {
		this.agnCommUtAmt = agnCommUtAmt;
	}
	
	/**
	 * Column Info
	 * @param chssFxUcAmt
	 */
	public void setChssFxUcAmt(String chssFxUcAmt) {
		this.chssFxUcAmt = chssFxUcAmt;
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
	 * @param creUsrId
	 */
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
	}
	
	/**
	 * Column Info
	 * @param raCmUcAmt
	 */
	public void setRaCmUcAmt(String raCmUcAmt) {
		this.raCmUcAmt = raCmUcAmt;
	}
	
	/**
	 * Column Info
	 * @param ownVolActUcAmt
	 */
	public void setOwnVolActUcAmt(String ownVolActUcAmt) {
		this.ownVolActUcAmt = ownVolActUcAmt;
	}
	
	/**
	 * Column Info
	 * @param eqSimUcAmt
	 */
	public void setEqSimUcAmt(String eqSimUcAmt) {
		this.eqSimUcAmt = eqSimUcAmt;
	}
	
	/**
	 * Column Info
	 * @param fullStvgUcAmt
	 */
	public void setFullStvgUcAmt(String fullStvgUcAmt) {
		this.fullStvgUcAmt = fullStvgUcAmt;
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
	 * @param actType
	 */
	public void setActType(String actType) {
		this.actType = actType;
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
	 * @param actType
	 */
	public void setFrom_mon(String from_mon) {
		this.from_mon = from_mon;
	}
	
	/**
	 * Column Info
	 * @param subTrdCd
	 */
	public void setTo_mon(String to_mon) {
		this.to_mon = to_mon;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setCmUcAmt(JSPUtil.getParameter(request, "cm_uc_amt", ""));
		setQtaTgtCd(JSPUtil.getParameter(request, "qta_tgt_cd", ""));
		setSaqMiscRevAmt(JSPUtil.getParameter(request, "saq_misc_rev_amt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setTrdCd(JSPUtil.getParameter(request, "trd_cd", ""));
		setRlaneCd(JSPUtil.getParameter(request, "rlane_cd", ""));
		setStpUcAmt(JSPUtil.getParameter(request, "stp_uc_amt", ""));
		setMtyTrspUcAmt(JSPUtil.getParameter(request, "mty_trsp_uc_amt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setEqRepoUcAmt(JSPUtil.getParameter(request, "eq_repo_uc_amt", ""));
		setBseMon(JSPUtil.getParameter(request, "bse_mon", ""));
		setBseQtrCd(JSPUtil.getParameter(request, "bse_qtr_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setConvDirCd(JSPUtil.getParameter(request, "conv_dir_cd", ""));
		setMtyStvgUcAmt(JSPUtil.getParameter(request, "mty_stvg_uc_amt", ""));
		setMqtaStepCd(JSPUtil.getParameter(request, "mqta_step_cd", ""));
		setCntrFxUcAmt(JSPUtil.getParameter(request, "cntr_fx_uc_amt", ""));
		setGrsRpbRev(JSPUtil.getParameter(request, "grs_rpb_rev", ""));
		setDirCd(JSPUtil.getParameter(request, "dir_cd", ""));
		setEqHldUcAmt(JSPUtil.getParameter(request, "eq_hld_uc_amt", ""));
		setBizActUcAmt(JSPUtil.getParameter(request, "biz_act_uc_amt", ""));
		setKeyAcctMgrUsrId(JSPUtil.getParameter(request, "key_acct_mgr_usr_id", ""));
		setMqtaVerNo(JSPUtil.getParameter(request, "mqta_ver_no", ""));
		setRgnOfcCd(JSPUtil.getParameter(request, "rgn_ofc_cd", ""));
		setAqCd(JSPUtil.getParameter(request, "aq_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setFullTrspUcAmt(JSPUtil.getParameter(request, "full_trsp_uc_amt", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setLodQty(JSPUtil.getParameter(request, "lod_qty", ""));
		setSltMgmtUcAmt(JSPUtil.getParameter(request, "slt_mgmt_uc_amt", ""));
		setCustGrpId(JSPUtil.getParameter(request, "cust_grp_id", ""));
		setRaOpfitUcAmt(JSPUtil.getParameter(request, "ra_opfit_uc_amt", ""));
		setRhqCd(JSPUtil.getParameter(request, "rhq_cd", ""));
		setOpfitUcAmt(JSPUtil.getParameter(request, "opfit_uc_amt", ""));
		setOfcAddFlg(JSPUtil.getParameter(request, "ofc_add_flg", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, "skd_voy_no", ""));
		setBseYr(JSPUtil.getParameter(request, "bse_yr", ""));
		setAgnCommUtAmt(JSPUtil.getParameter(request, "agn_comm_ut_amt", ""));
		setChssFxUcAmt(JSPUtil.getParameter(request, "chss_fx_uc_amt", ""));
		setSkdDirCd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setRaCmUcAmt(JSPUtil.getParameter(request, "ra_cm_uc_amt", ""));
		setOwnVolActUcAmt(JSPUtil.getParameter(request, "own_vol_act_uc_amt", ""));
		setEqSimUcAmt(JSPUtil.getParameter(request, "eq_sim_uc_amt", ""));
		setFullStvgUcAmt(JSPUtil.getParameter(request, "full_stvg_uc_amt", ""));
		setVvdCd(JSPUtil.getParameter(request, "vvd_cd", ""));
		setDeltFlg(JSPUtil.getParameter(request, "delt_flg", ""));
		setActType(JSPUtil.getParameter(request, "act_type", ""));
		setSubTrdCd(JSPUtil.getParameter(request, "sub_trd_cd", ""));
		setFrom_mon(JSPUtil.getParameter(request, "from_mon", ""));
		setTo_mon(JSPUtil.getParameter(request, "to_mon", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return SaqMonQtaRfVO[]
	 */
	public SaqMonQtaRfVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SaqMonQtaRfVO[]
	 */
	public SaqMonQtaRfVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SaqMonQtaRfVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] cmUcAmt = (JSPUtil.getParameter(request, prefix	+ "cm_uc_amt", length));
			String[] qtaTgtCd = (JSPUtil.getParameter(request, prefix	+ "qta_tgt_cd", length));
			String[] saqMiscRevAmt = (JSPUtil.getParameter(request, prefix	+ "saq_misc_rev_amt", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] trdCd = (JSPUtil.getParameter(request, prefix	+ "trd_cd", length));
			String[] rlaneCd = (JSPUtil.getParameter(request, prefix	+ "rlane_cd", length));
			String[] stpUcAmt = (JSPUtil.getParameter(request, prefix	+ "stp_uc_amt", length));
			String[] mtyTrspUcAmt = (JSPUtil.getParameter(request, prefix	+ "mty_trsp_uc_amt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] eqRepoUcAmt = (JSPUtil.getParameter(request, prefix	+ "eq_repo_uc_amt", length));
			String[] bseMon = (JSPUtil.getParameter(request, prefix	+ "bse_mon", length));
			String[] bseQtrCd = (JSPUtil.getParameter(request, prefix	+ "bse_qtr_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] convDirCd = (JSPUtil.getParameter(request, prefix	+ "conv_dir_cd", length));
			String[] mtyStvgUcAmt = (JSPUtil.getParameter(request, prefix	+ "mty_stvg_uc_amt", length));
			String[] mqtaStepCd = (JSPUtil.getParameter(request, prefix	+ "mqta_step_cd", length));
			String[] cntrFxUcAmt = (JSPUtil.getParameter(request, prefix	+ "cntr_fx_uc_amt", length));
			String[] grsRpbRev = (JSPUtil.getParameter(request, prefix	+ "grs_rpb_rev", length));
			String[] dirCd = (JSPUtil.getParameter(request, prefix	+ "dir_cd", length));
			String[] eqHldUcAmt = (JSPUtil.getParameter(request, prefix	+ "eq_hld_uc_amt", length));
			String[] bizActUcAmt = (JSPUtil.getParameter(request, prefix	+ "biz_act_uc_amt", length));
			String[] keyAcctMgrUsrId = (JSPUtil.getParameter(request, prefix	+ "key_acct_mgr_usr_id", length));
			String[] mqtaVerNo = (JSPUtil.getParameter(request, prefix	+ "mqta_ver_no", length));
			String[] rgnOfcCd = (JSPUtil.getParameter(request, prefix	+ "rgn_ofc_cd", length));
			String[] aqCd = (JSPUtil.getParameter(request, prefix	+ "aq_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] fullTrspUcAmt = (JSPUtil.getParameter(request, prefix	+ "full_trsp_uc_amt", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] lodQty = (JSPUtil.getParameter(request, prefix	+ "lod_qty", length));
			String[] sltMgmtUcAmt = (JSPUtil.getParameter(request, prefix	+ "slt_mgmt_uc_amt", length));
			String[] custGrpId = (JSPUtil.getParameter(request, prefix	+ "cust_grp_id", length));
			String[] raOpfitUcAmt = (JSPUtil.getParameter(request, prefix	+ "ra_opfit_uc_amt", length));
			String[] rhqCd = (JSPUtil.getParameter(request, prefix	+ "rhq_cd", length));
			String[] opfitUcAmt = (JSPUtil.getParameter(request, prefix	+ "opfit_uc_amt", length));
			String[] ofcAddFlg = (JSPUtil.getParameter(request, prefix	+ "ofc_add_flg", length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no", length));
			String[] bseYr = (JSPUtil.getParameter(request, prefix	+ "bse_yr", length));
			String[] agnCommUtAmt = (JSPUtil.getParameter(request, prefix	+ "agn_comm_ut_amt", length));
			String[] chssFxUcAmt = (JSPUtil.getParameter(request, prefix	+ "chss_fx_uc_amt", length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] raCmUcAmt = (JSPUtil.getParameter(request, prefix	+ "ra_cm_uc_amt", length));
			String[] ownVolActUcAmt = (JSPUtil.getParameter(request, prefix	+ "own_vol_act_uc_amt", length));
			String[] eqSimUcAmt = (JSPUtil.getParameter(request, prefix	+ "eq_sim_uc_amt", length));
			String[] fullStvgUcAmt = (JSPUtil.getParameter(request, prefix	+ "full_stvg_uc_amt", length));
			String[] vvdCd = (JSPUtil.getParameter(request, prefix	+ "vvd_cd", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] actType = (JSPUtil.getParameter(request, prefix	+ "act_type", length));
			String[] subTrdCd = (JSPUtil.getParameter(request, prefix	+ "sub_trd_cd", length));
			String[] from_mon = (JSPUtil.getParameter(request, prefix	+ "from_mon", length));
			String[] to_mon = (JSPUtil.getParameter(request, prefix	+ "to_mon", length));
			
			for (int i = 0; i < length; i++) {
				model = new SaqMonQtaRfVO();
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (cmUcAmt[i] != null)
					model.setCmUcAmt(cmUcAmt[i]);
				if (qtaTgtCd[i] != null)
					model.setQtaTgtCd(qtaTgtCd[i]);
				if (saqMiscRevAmt[i] != null)
					model.setSaqMiscRevAmt(saqMiscRevAmt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (trdCd[i] != null)
					model.setTrdCd(trdCd[i]);
				if (rlaneCd[i] != null)
					model.setRlaneCd(rlaneCd[i]);
				if (stpUcAmt[i] != null)
					model.setStpUcAmt(stpUcAmt[i]);
				if (mtyTrspUcAmt[i] != null)
					model.setMtyTrspUcAmt(mtyTrspUcAmt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (eqRepoUcAmt[i] != null)
					model.setEqRepoUcAmt(eqRepoUcAmt[i]);
				if (bseMon[i] != null)
					model.setBseMon(bseMon[i]);
				if (bseQtrCd[i] != null)
					model.setBseQtrCd(bseQtrCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (convDirCd[i] != null)
					model.setConvDirCd(convDirCd[i]);
				if (mtyStvgUcAmt[i] != null)
					model.setMtyStvgUcAmt(mtyStvgUcAmt[i]);
				if (mqtaStepCd[i] != null)
					model.setMqtaStepCd(mqtaStepCd[i]);
				if (cntrFxUcAmt[i] != null)
					model.setCntrFxUcAmt(cntrFxUcAmt[i]);
				if (grsRpbRev[i] != null)
					model.setGrsRpbRev(grsRpbRev[i]);
				if (dirCd[i] != null)
					model.setDirCd(dirCd[i]);
				if (eqHldUcAmt[i] != null)
					model.setEqHldUcAmt(eqHldUcAmt[i]);
				if (bizActUcAmt[i] != null)
					model.setBizActUcAmt(bizActUcAmt[i]);
				if (keyAcctMgrUsrId[i] != null)
					model.setKeyAcctMgrUsrId(keyAcctMgrUsrId[i]);
				if (mqtaVerNo[i] != null)
					model.setMqtaVerNo(mqtaVerNo[i]);
				if (rgnOfcCd[i] != null)
					model.setRgnOfcCd(rgnOfcCd[i]);
				if (aqCd[i] != null)
					model.setAqCd(aqCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (fullTrspUcAmt[i] != null)
					model.setFullTrspUcAmt(fullTrspUcAmt[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (lodQty[i] != null)
					model.setLodQty(lodQty[i]);
				if (sltMgmtUcAmt[i] != null)
					model.setSltMgmtUcAmt(sltMgmtUcAmt[i]);
				if (custGrpId[i] != null)
					model.setCustGrpId(custGrpId[i]);
				if (raOpfitUcAmt[i] != null)
					model.setRaOpfitUcAmt(raOpfitUcAmt[i]);
				if (rhqCd[i] != null)
					model.setRhqCd(rhqCd[i]);
				if (opfitUcAmt[i] != null)
					model.setOpfitUcAmt(opfitUcAmt[i]);
				if (ofcAddFlg[i] != null)
					model.setOfcAddFlg(ofcAddFlg[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (bseYr[i] != null)
					model.setBseYr(bseYr[i]);
				if (agnCommUtAmt[i] != null)
					model.setAgnCommUtAmt(agnCommUtAmt[i]);
				if (chssFxUcAmt[i] != null)
					model.setChssFxUcAmt(chssFxUcAmt[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (raCmUcAmt[i] != null)
					model.setRaCmUcAmt(raCmUcAmt[i]);
				if (ownVolActUcAmt[i] != null)
					model.setOwnVolActUcAmt(ownVolActUcAmt[i]);
				if (eqSimUcAmt[i] != null)
					model.setEqSimUcAmt(eqSimUcAmt[i]);
				if (fullStvgUcAmt[i] != null)
					model.setFullStvgUcAmt(fullStvgUcAmt[i]);
				if (vvdCd[i] != null)
					model.setVvdCd(vvdCd[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (actType[i] != null)
					model.setActType(actType[i]);
				if (subTrdCd[i] != null)
					model.setSubTrdCd(subTrdCd[i]);
				if (from_mon[i] != null)
					model.setFrom_mon(from_mon[i]);
				if (to_mon[i] != null)
					model.setTo_mon(to_mon[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSaqMonQtaRfVOs();
	}

	/**
	 * (ESM_SAQ_0171)에 사용한 Parameter 로 재구성.
	 * @param request
	 * @param conVo
	 * @return SaqMonQtaRfVO[]
	 */
//	public SaqMonQtaRfVO[] fromRequestGrid(HttpServletRequest request, QuotaConditionVO conVo) {
//		SaqMonQtaRfVO model = null;
//		
//		String[] tmp = request.getParameterValues("mqta_step_cd");
//  		if(tmp == null)
//   			return null;
//
//  		int length = request.getParameterValues("mqta_step_cd").length;
//  		
//		try {
//			
//			String[] ibflag     = (JSPUtil.getParameter(request, "ibflag".trim(), length));
//			String[] mqtaStepCd = (JSPUtil.getParameter(request, "mqta_step_cd".trim(), length));
//			String[] bseYr      = (JSPUtil.getParameter(request, "bse_yr".trim(), length));
//			String[] bseQtrCd   = (JSPUtil.getParameter(request, "bse_qtr_cd".trim(), length));
//			String[] qtaTgtCd   = (JSPUtil.getParameter(request, "qta_tgt_cd".trim(), length));
//			String[] mqtaVerNo  = (JSPUtil.getParameter(request, "mqta_ver_no".trim(), length));
//			String[] bseMon     = (JSPUtil.getParameter(request, "bse_mon".trim(), length));
//			String[] trdCd      = (JSPUtil.getParameter(request, "trd_cd".trim(), length));
//			String[] rlaneCd    = (JSPUtil.getParameter(request, "rlane_cd".trim(), length));
//			String[] dirCd      = (JSPUtil.getParameter(request, "dir_cd".trim(), length));
//			String[] vslCd      = (JSPUtil.getParameter(request, "vsl_cd".trim(), length));
//			String[] skdVoyNo   = (JSPUtil.getParameter(request, "skd_voy_no".trim(), length));
//			String[] skdDirCd   = (JSPUtil.getParameter(request, "skd_dir_cd".trim(), length));
//			String[] vvdCd      = (JSPUtil.getParameter(request, "vvd_cd".trim(), length));
//			String[] rgnOfcCd   = (JSPUtil.getParameter(request, "rgn_ofc_cd".trim(), length));
//			String[] lodQty     = (JSPUtil.getParameter(request, "lod_qty".trim(), length));
//			String[] grsRpbRev  = (JSPUtil.getParameter(request, "grs_rpb_rev".trim(), length));
//			String[] creUsrId   = (JSPUtil.getParameter(request, "cre_usr_id".trim(), length));
//			String[] updUsrId   = (JSPUtil.getParameter(request, "upd_usr_id".trim(), length));
//			String[] rhqCd   = (JSPUtil.getParameter(request, "rhq_cd".trim(), length));
//			String[] deltFlg = (JSPUtil.getParameter(request, "delt_flg", length));
//			String[] actType = (JSPUtil.getParameter(request, "act_type", length));
//			String[] subTrdCd = (JSPUtil.getParameter(request, "sub_trd_cd", length));
//			String[] aqCd = (JSPUtil.getParameter(request, "aq_cd", length));
//			String[] from_mon = (JSPUtil.getParameter(request, "from_mon", length));
//			String[] to_mon = (JSPUtil.getParameter(request, "to_mon", length));
//			
//			for(int i=0 ; i<length ; i++){
//				model = new SaqMonQtaRfVO();
//				if (ibflag[i] != null)
//					model.setIbflag(ibflag[i]);
//				if (mqtaStepCd[i] != null)
//					model.setMqtaStepCd(mqtaStepCd[i]);
//				if (bseYr[i] != null)
//					model.setBseYr(bseYr[i]);
//				if (bseQtrCd[i] != null)
//					model.setBseQtrCd(bseQtrCd[i]);
//				if (qtaTgtCd[i] != null)
//					model.setQtaTgtCd(qtaTgtCd[i]);
//				if (mqtaVerNo[i] != null)
//					model.setMqtaVerNo(mqtaVerNo[i]);
//				if (bseMon[i] != null)
//					model.setBseMon(bseMon[i]);
//				if (trdCd[i] != null)
//					model.setTrdCd(trdCd[i]);
//				if (rlaneCd[i] != null)
//					model.setRlaneCd(rlaneCd[i]);
//				if (dirCd[i] != null)
//					model.setDirCd(dirCd[i]);
//				if (vslCd[i] != null)
//					model.setVslCd(vslCd[i]);
//				if (skdVoyNo[i] != null)
//					model.setSkdVoyNo(skdVoyNo[i]);
//				if (skdDirCd[i] != null)
//					model.setSkdDirCd(skdDirCd[i]);
//				if (vvdCd[i] != null)
//					model.setVvdCd(vvdCd[i]);
//				if (rgnOfcCd[i] != null)
//					model.setRgnOfcCd(rgnOfcCd[i]);
//				if (lodQty[i] != null)
//					model.setLodQty(lodQty[i]);
//				if (grsRpbRev[i] != null)
//					model.setGrsRpbRev(grsRpbRev[i]);
//				if (creUsrId[i] != null)
//					model.setCreUsrId(creUsrId[i]);
//				if (updUsrId[i] != null)
//					model.setUpdUsrId(updUsrId[i]);
//				if (rhqCd[i] != null)
//					model.setRhqCd(rhqCd[i]);
//				if (deltFlg[i] != null)
//					model.setDeltFlg(deltFlg[i]);
//				if (actType[i] != null)
//					model.setActType(actType[i]);
//				if (subTrdCd[i] != null)
//					model.setSubTrdCd(subTrdCd[i]);
//				if (aqCd[i] != null)
//					model.setAqCd(aqCd[i]);
//				if (from_mon[i] != null)
//					model.setFrom_mon(from_mon[i]);
//				if (to_mon[i] != null)
//					model.setTo_mon(to_mon[i]);
//				models.add(model);
//				
//			}
//
//		} catch (Exception e) {
//			return null;
//		}
//		return getSaqMonQtaRfVOs();
//	}
	
	/**
	 * VO 배열을 반환
	 * @return SaqMonQtaRfVO[]
	 */
	public SaqMonQtaRfVO[] getSaqMonQtaRfVOs(){
		SaqMonQtaRfVO[] vos = (SaqMonQtaRfVO[])models.toArray(new SaqMonQtaRfVO[models.size()]);
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
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cmUcAmt = this.cmUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.qtaTgtCd = this.qtaTgtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.saqMiscRevAmt = this.saqMiscRevAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trdCd = this.trdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rlaneCd = this.rlaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stpUcAmt = this.stpUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mtyTrspUcAmt = this.mtyTrspUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqRepoUcAmt = this.eqRepoUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bseMon = this.bseMon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bseQtrCd = this.bseQtrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.convDirCd = this.convDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mtyStvgUcAmt = this.mtyStvgUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mqtaStepCd = this.mqtaStepCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrFxUcAmt = this.cntrFxUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.grsRpbRev = this.grsRpbRev .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dirCd = this.dirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqHldUcAmt = this.eqHldUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bizActUcAmt = this.bizActUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.keyAcctMgrUsrId = this.keyAcctMgrUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mqtaVerNo = this.mqtaVerNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rgnOfcCd = this.rgnOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aqCd = this.aqCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fullTrspUcAmt = this.fullTrspUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lodQty = this.lodQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sltMgmtUcAmt = this.sltMgmtUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custGrpId = this.custGrpId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.raOpfitUcAmt = this.raOpfitUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rhqCd = this.rhqCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.opfitUcAmt = this.opfitUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcAddFlg = this.ofcAddFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bseYr = this.bseYr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agnCommUtAmt = this.agnCommUtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssFxUcAmt = this.chssFxUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.raCmUcAmt = this.raCmUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ownVolActUcAmt = this.ownVolActUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqSimUcAmt = this.eqSimUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fullStvgUcAmt = this.fullStvgUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vvdCd = this.vvdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actType = this.actType .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.subTrdCd = this.subTrdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.from_mon = this.from_mon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.to_mon = this.to_mon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
