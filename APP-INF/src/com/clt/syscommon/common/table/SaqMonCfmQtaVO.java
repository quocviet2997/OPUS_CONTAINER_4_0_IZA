/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : SaqMonCfmQtaVO.java
*@FileTitle : SaqMonCfmQtaVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.23
*@LastModifier : 김민아
*@LastVersion : 1.0
* 2009.07.23 김민아 
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
 * @author 김민아
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class SaqMonCfmQtaVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SaqMonCfmQtaVO> models = new ArrayList<SaqMonCfmQtaVO>();
	
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String saqMiscRevAmt = null;
	/* Column Info */
	private String trdCd = null;
	/* Column Info */
	private String rlaneCd = null;
	/* Column Info */
	private String addTpCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String mtyTrspUcAmt = null;
	/* Column Info */
	private String bseQtrCd = null;
	/* Column Info */
	private String polCd = null;
	/* Column Info */
	private String convDirCd = null;
	/* Column Info */
	private String cntrFxUcAmt = null;
	/* Column Info */
	private String bizActUcAmt = null;
	/* Column Info */
	private String eqHldUcAmt = null;
	/* Column Info */
	private String custCntCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String fullTrspUcAmt = null;
	/* Column Info */
	private String costUpdFlg = null;
	/* Column Info */
	private String lodQty = null;
	/* Column Info */
	private String custGrpId = null;
	/* Column Info */
	private String raOpfitUcAmt = null;
	/* Column Info */
	private String rhqCd = null;
	/* Column Info */
	private String opfitUcAmt = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String agnCommUtAmt = null;
	/* Column Info */
	private String chssFxUcAmt = null;
	/* Column Info */
	private String podCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String eqSimUcAmt = null;
	/* Column Info */
	private String cmUcAmt = null;
	/* Column Info */
	private String qtaTgtCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String stpUcAmt = null;
	/* Column Info */
	private String mqtaRlseVerNo = null;
	/* Column Info */
	private String bseMon = null;
	/* Column Info */
	private String eqRepoUcAmt = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String mtyStvgUcAmt = null;
	/* Column Info */
	private String grsRpbRev = null;
	/* Column Info */
	private String dirCd = null;
	/* Column Info */
	private String rgnOfcCd = null;
	/* Column Info */
	private String aqCd = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String sltMgmtUcAmt = null;
	/* Column Info */
	private String bseYr = null;
	/* Column Info */
	private String custSeq = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Column Info */
	private String raCmUcAmt = null;
	/* Column Info */
	private String ownVolActUcAmt = null;
	/* Column Info */
	private String fullStvgUcAmt = null;
	/* Column Info */
	private String vvdCd = null; // ESM_SAQ_0165

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public SaqMonCfmQtaVO() {}

	public SaqMonCfmQtaVO(String ibflag, String pagerows, String mqtaRlseVerNo, String bseYr, String bseQtrCd, String qtaTgtCd, String bseMon, String trdCd, String rlaneCd, String dirCd, String vslCd, String skdVoyNo, String skdDirCd, String rgnOfcCd, String custGrpId, String custCntCd, String custSeq, String polCd, String podCd, String rhqCd, String convDirCd, String aqCd, String lodQty, String grsRpbRev, String cmUcAmt, String opfitUcAmt, String raCmUcAmt, String raOpfitUcAmt, String fullStvgUcAmt, String fullTrspUcAmt, String mtyStvgUcAmt, String mtyTrspUcAmt, String cntrFxUcAmt, String chssFxUcAmt, String agnCommUtAmt, String bizActUcAmt, String sltMgmtUcAmt, String ownVolActUcAmt, String stpUcAmt, String eqHldUcAmt, String eqRepoUcAmt, String eqSimUcAmt, String saqMiscRevAmt, String addTpCd, String costUpdFlg, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.vslCd = vslCd;
		this.saqMiscRevAmt = saqMiscRevAmt;
		this.trdCd = trdCd;
		this.rlaneCd = rlaneCd;
		this.addTpCd = addTpCd;
		this.pagerows = pagerows;
		this.mtyTrspUcAmt = mtyTrspUcAmt;
		this.bseQtrCd = bseQtrCd;
		this.polCd = polCd;
		this.convDirCd = convDirCd;
		this.cntrFxUcAmt = cntrFxUcAmt;
		this.bizActUcAmt = bizActUcAmt;
		this.eqHldUcAmt = eqHldUcAmt;
		this.custCntCd = custCntCd;
		this.updUsrId = updUsrId;
		this.fullTrspUcAmt = fullTrspUcAmt;
		this.costUpdFlg = costUpdFlg;
		this.lodQty = lodQty;
		this.custGrpId = custGrpId;
		this.raOpfitUcAmt = raOpfitUcAmt;
		this.rhqCd = rhqCd;
		this.opfitUcAmt = opfitUcAmt;
		this.skdVoyNo = skdVoyNo;
		this.agnCommUtAmt = agnCommUtAmt;
		this.chssFxUcAmt = chssFxUcAmt;
		this.podCd = podCd;
		this.creUsrId = creUsrId;
		this.eqSimUcAmt = eqSimUcAmt;
		this.cmUcAmt = cmUcAmt;
		this.qtaTgtCd = qtaTgtCd;
		this.creDt = creDt;
		this.stpUcAmt = stpUcAmt;
		this.mqtaRlseVerNo = mqtaRlseVerNo;
		this.bseMon = bseMon;
		this.eqRepoUcAmt = eqRepoUcAmt;
		this.ibflag = ibflag;
		this.mtyStvgUcAmt = mtyStvgUcAmt;
		this.grsRpbRev = grsRpbRev;
		this.dirCd = dirCd;
		this.rgnOfcCd = rgnOfcCd;
		this.aqCd = aqCd;
		this.updDt = updDt;
		this.sltMgmtUcAmt = sltMgmtUcAmt;
		this.bseYr = bseYr;
		this.custSeq = custSeq;
		this.skdDirCd = skdDirCd;
		this.raCmUcAmt = raCmUcAmt;
		this.ownVolActUcAmt = ownVolActUcAmt;
		this.fullStvgUcAmt = fullStvgUcAmt;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("saq_misc_rev_amt", getSaqMiscRevAmt());
		this.hashColumns.put("trd_cd", getTrdCd());
		this.hashColumns.put("rlane_cd", getRlaneCd());
		this.hashColumns.put("add_tp_cd", getAddTpCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("mty_trsp_uc_amt", getMtyTrspUcAmt());
		this.hashColumns.put("bse_qtr_cd", getBseQtrCd());
		this.hashColumns.put("pol_cd", getPolCd());
		this.hashColumns.put("conv_dir_cd", getConvDirCd());
		this.hashColumns.put("cntr_fx_uc_amt", getCntrFxUcAmt());
		this.hashColumns.put("biz_act_uc_amt", getBizActUcAmt());
		this.hashColumns.put("eq_hld_uc_amt", getEqHldUcAmt());
		this.hashColumns.put("cust_cnt_cd", getCustCntCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("full_trsp_uc_amt", getFullTrspUcAmt());
		this.hashColumns.put("cost_upd_flg", getCostUpdFlg());
		this.hashColumns.put("lod_qty", getLodQty());
		this.hashColumns.put("cust_grp_id", getCustGrpId());
		this.hashColumns.put("ra_opfit_uc_amt", getRaOpfitUcAmt());
		this.hashColumns.put("rhq_cd", getRhqCd());
		this.hashColumns.put("opfit_uc_amt", getOpfitUcAmt());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("agn_comm_ut_amt", getAgnCommUtAmt());
		this.hashColumns.put("chss_fx_uc_amt", getChssFxUcAmt());
		this.hashColumns.put("pod_cd", getPodCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("eq_sim_uc_amt", getEqSimUcAmt());
		this.hashColumns.put("cm_uc_amt", getCmUcAmt());
		this.hashColumns.put("qta_tgt_cd", getQtaTgtCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("stp_uc_amt", getStpUcAmt());
		this.hashColumns.put("mqta_rlse_ver_no", getMqtaRlseVerNo());
		this.hashColumns.put("bse_mon", getBseMon());
		this.hashColumns.put("eq_repo_uc_amt", getEqRepoUcAmt());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("mty_stvg_uc_amt", getMtyStvgUcAmt());
		this.hashColumns.put("grs_rpb_rev", getGrsRpbRev());
		this.hashColumns.put("dir_cd", getDirCd());
		this.hashColumns.put("rgn_ofc_cd", getRgnOfcCd());
		this.hashColumns.put("aq_cd", getAqCd());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("slt_mgmt_uc_amt", getSltMgmtUcAmt());
		this.hashColumns.put("bse_yr", getBseYr());
		this.hashColumns.put("cust_seq", getCustSeq());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("ra_cm_uc_amt", getRaCmUcAmt());
		this.hashColumns.put("own_vol_act_uc_amt", getOwnVolActUcAmt());
		this.hashColumns.put("full_stvg_uc_amt", getFullStvgUcAmt());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("saq_misc_rev_amt", "saqMiscRevAmt");
		this.hashFields.put("trd_cd", "trdCd");
		this.hashFields.put("rlane_cd", "rlaneCd");
		this.hashFields.put("add_tp_cd", "addTpCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("mty_trsp_uc_amt", "mtyTrspUcAmt");
		this.hashFields.put("bse_qtr_cd", "bseQtrCd");
		this.hashFields.put("pol_cd", "polCd");
		this.hashFields.put("conv_dir_cd", "convDirCd");
		this.hashFields.put("cntr_fx_uc_amt", "cntrFxUcAmt");
		this.hashFields.put("biz_act_uc_amt", "bizActUcAmt");
		this.hashFields.put("eq_hld_uc_amt", "eqHldUcAmt");
		this.hashFields.put("cust_cnt_cd", "custCntCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("full_trsp_uc_amt", "fullTrspUcAmt");
		this.hashFields.put("cost_upd_flg", "costUpdFlg");
		this.hashFields.put("lod_qty", "lodQty");
		this.hashFields.put("cust_grp_id", "custGrpId");
		this.hashFields.put("ra_opfit_uc_amt", "raOpfitUcAmt");
		this.hashFields.put("rhq_cd", "rhqCd");
		this.hashFields.put("opfit_uc_amt", "opfitUcAmt");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("agn_comm_ut_amt", "agnCommUtAmt");
		this.hashFields.put("chss_fx_uc_amt", "chssFxUcAmt");
		this.hashFields.put("pod_cd", "podCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("eq_sim_uc_amt", "eqSimUcAmt");
		this.hashFields.put("cm_uc_amt", "cmUcAmt");
		this.hashFields.put("qta_tgt_cd", "qtaTgtCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("stp_uc_amt", "stpUcAmt");
		this.hashFields.put("mqta_rlse_ver_no", "mqtaRlseVerNo");
		this.hashFields.put("bse_mon", "bseMon");
		this.hashFields.put("eq_repo_uc_amt", "eqRepoUcAmt");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("mty_stvg_uc_amt", "mtyStvgUcAmt");
		this.hashFields.put("grs_rpb_rev", "grsRpbRev");
		this.hashFields.put("dir_cd", "dirCd");
		this.hashFields.put("rgn_ofc_cd", "rgnOfcCd");
		this.hashFields.put("aq_cd", "aqCd");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("slt_mgmt_uc_amt", "sltMgmtUcAmt");
		this.hashFields.put("bse_yr", "bseYr");
		this.hashFields.put("cust_seq", "custSeq");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("ra_cm_uc_amt", "raCmUcAmt");
		this.hashFields.put("own_vol_act_uc_amt", "ownVolActUcAmt");
		this.hashFields.put("full_stvg_uc_amt", "fullStvgUcAmt");
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
	 * @return saqMiscRevAmt
	 */
	public String getSaqMiscRevAmt() {
		return this.saqMiscRevAmt;
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
	 * @return addTpCd
	 */
	public String getAddTpCd() {
		return this.addTpCd;
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
	 * @return mtyTrspUcAmt
	 */
	public String getMtyTrspUcAmt() {
		return this.mtyTrspUcAmt;
	}
	
	/**
	 * Column Info
	 * @return bseQtrCd
	 */
	public String getBseQtrCd() {
		return this.bseQtrCd;
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
	 * @return convDirCd
	 */
	public String getConvDirCd() {
		return this.convDirCd;
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
	 * @return bizActUcAmt
	 */
	public String getBizActUcAmt() {
		return this.bizActUcAmt;
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
	 * @return fullTrspUcAmt
	 */
	public String getFullTrspUcAmt() {
		return this.fullTrspUcAmt;
	}
	
	/**
	 * Column Info
	 * @return costUpdFlg
	 */
	public String getCostUpdFlg() {
		return this.costUpdFlg;
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
	 * @return skdVoyNo
	 */
	public String getSkdVoyNo() {
		return this.skdVoyNo;
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
	 * @return podCd
	 */
	public String getPodCd() {
		return this.podCd;
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
	 * @return eqSimUcAmt
	 */
	public String getEqSimUcAmt() {
		return this.eqSimUcAmt;
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
	 * @return creDt
	 */
	public String getCreDt() {
		return this.creDt;
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
	 * @return mqtaRlseVerNo
	 */
	public String getMqtaRlseVerNo() {
		return this.mqtaRlseVerNo;
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
	 * @return eqRepoUcAmt
	 */
	public String getEqRepoUcAmt() {
		return this.eqRepoUcAmt;
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
	 * @return mtyStvgUcAmt
	 */
	public String getMtyStvgUcAmt() {
		return this.mtyStvgUcAmt;
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
	 * @return updDt
	 */
	public String getUpdDt() {
		return this.updDt;
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
	 * @return bseYr
	 */
	public String getBseYr() {
		return this.bseYr;
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
	 * @return skdDirCd
	 */
	public String getSkdDirCd() {
		return this.skdDirCd;
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
	 * @return fullStvgUcAmt
	 */
	public String getFullStvgUcAmt() {
		return this.fullStvgUcAmt;
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
	 * @param saqMiscRevAmt
	 */
	public void setSaqMiscRevAmt(String saqMiscRevAmt) {
		this.saqMiscRevAmt = saqMiscRevAmt;
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
	 * @param addTpCd
	 */
	public void setAddTpCd(String addTpCd) {
		this.addTpCd = addTpCd;
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
	 * @param mtyTrspUcAmt
	 */
	public void setMtyTrspUcAmt(String mtyTrspUcAmt) {
		this.mtyTrspUcAmt = mtyTrspUcAmt;
	}
	
	/**
	 * Column Info
	 * @param bseQtrCd
	 */
	public void setBseQtrCd(String bseQtrCd) {
		this.bseQtrCd = bseQtrCd;
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
	 * @param convDirCd
	 */
	public void setConvDirCd(String convDirCd) {
		this.convDirCd = convDirCd;
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
	 * @param bizActUcAmt
	 */
	public void setBizActUcAmt(String bizActUcAmt) {
		this.bizActUcAmt = bizActUcAmt;
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
	 * @param fullTrspUcAmt
	 */
	public void setFullTrspUcAmt(String fullTrspUcAmt) {
		this.fullTrspUcAmt = fullTrspUcAmt;
	}
	
	/**
	 * Column Info
	 * @param costUpdFlg
	 */
	public void setCostUpdFlg(String costUpdFlg) {
		this.costUpdFlg = costUpdFlg;
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
	 * @param skdVoyNo
	 */
	public void setSkdVoyNo(String skdVoyNo) {
		this.skdVoyNo = skdVoyNo;
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
	 * @param podCd
	 */
	public void setPodCd(String podCd) {
		this.podCd = podCd;
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
	 * @param eqSimUcAmt
	 */
	public void setEqSimUcAmt(String eqSimUcAmt) {
		this.eqSimUcAmt = eqSimUcAmt;
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
	 * @param creDt
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
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
	 * @param mqtaRlseVerNo
	 */
	public void setMqtaRlseVerNo(String mqtaRlseVerNo) {
		this.mqtaRlseVerNo = mqtaRlseVerNo;
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
	 * @param eqRepoUcAmt
	 */
	public void setEqRepoUcAmt(String eqRepoUcAmt) {
		this.eqRepoUcAmt = eqRepoUcAmt;
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
	 * @param mtyStvgUcAmt
	 */
	public void setMtyStvgUcAmt(String mtyStvgUcAmt) {
		this.mtyStvgUcAmt = mtyStvgUcAmt;
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
	 * @param updDt
	 */
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
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
	 * @param bseYr
	 */
	public void setBseYr(String bseYr) {
		this.bseYr = bseYr;
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
	 * @param skdDirCd
	 */
	public void setSkdDirCd(String skdDirCd) {
		this.skdDirCd = skdDirCd;
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
	 * @param fullStvgUcAmt
	 */
	public void setFullStvgUcAmt(String fullStvgUcAmt) {
		this.fullStvgUcAmt = fullStvgUcAmt;
	}
	
	public String getVvdCd() {
		return vvdCd;
	}

	public void setVvdCd(String vvdCd) {
		this.vvdCd = vvdCd;
	}

	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setSaqMiscRevAmt(JSPUtil.getParameter(request, "saq_misc_rev_amt", ""));
		setTrdCd(JSPUtil.getParameter(request, "trd_cd", ""));
		setRlaneCd(JSPUtil.getParameter(request, "rlane_cd", ""));
		setAddTpCd(JSPUtil.getParameter(request, "add_tp_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setMtyTrspUcAmt(JSPUtil.getParameter(request, "mty_trsp_uc_amt", ""));
		setBseQtrCd(JSPUtil.getParameter(request, "bse_qtr_cd", ""));
		setPolCd(JSPUtil.getParameter(request, "pol_cd", ""));
		setConvDirCd(JSPUtil.getParameter(request, "conv_dir_cd", ""));
		setCntrFxUcAmt(JSPUtil.getParameter(request, "cntr_fx_uc_amt", ""));
		setBizActUcAmt(JSPUtil.getParameter(request, "biz_act_uc_amt", ""));
		setEqHldUcAmt(JSPUtil.getParameter(request, "eq_hld_uc_amt", ""));
		setCustCntCd(JSPUtil.getParameter(request, "cust_cnt_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setFullTrspUcAmt(JSPUtil.getParameter(request, "full_trsp_uc_amt", ""));
		setCostUpdFlg(JSPUtil.getParameter(request, "cost_upd_flg", ""));
		setLodQty(JSPUtil.getParameter(request, "lod_qty", ""));
		setCustGrpId(JSPUtil.getParameter(request, "cust_grp_id", ""));
		setRaOpfitUcAmt(JSPUtil.getParameter(request, "ra_opfit_uc_amt", ""));
		setRhqCd(JSPUtil.getParameter(request, "rhq_cd", ""));
		setOpfitUcAmt(JSPUtil.getParameter(request, "opfit_uc_amt", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, "skd_voy_no", ""));
		setAgnCommUtAmt(JSPUtil.getParameter(request, "agn_comm_ut_amt", ""));
		setChssFxUcAmt(JSPUtil.getParameter(request, "chss_fx_uc_amt", ""));
		setPodCd(JSPUtil.getParameter(request, "pod_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setEqSimUcAmt(JSPUtil.getParameter(request, "eq_sim_uc_amt", ""));
		setCmUcAmt(JSPUtil.getParameter(request, "cm_uc_amt", ""));
		setQtaTgtCd(JSPUtil.getParameter(request, "qta_tgt_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setStpUcAmt(JSPUtil.getParameter(request, "stp_uc_amt", ""));
		setMqtaRlseVerNo(JSPUtil.getParameter(request, "mqta_rlse_ver_no", ""));
		setBseMon(JSPUtil.getParameter(request, "bse_mon", ""));
		setEqRepoUcAmt(JSPUtil.getParameter(request, "eq_repo_uc_amt", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setMtyStvgUcAmt(JSPUtil.getParameter(request, "mty_stvg_uc_amt", ""));
		setGrsRpbRev(JSPUtil.getParameter(request, "grs_rpb_rev", ""));
		setDirCd(JSPUtil.getParameter(request, "dir_cd", ""));
		setRgnOfcCd(JSPUtil.getParameter(request, "rgn_ofc_cd", ""));
		setAqCd(JSPUtil.getParameter(request, "aq_cd", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setSltMgmtUcAmt(JSPUtil.getParameter(request, "slt_mgmt_uc_amt", ""));
		setBseYr(JSPUtil.getParameter(request, "bse_yr", ""));
		setCustSeq(JSPUtil.getParameter(request, "cust_seq", ""));
		setSkdDirCd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
		setRaCmUcAmt(JSPUtil.getParameter(request, "ra_cm_uc_amt", ""));
		setOwnVolActUcAmt(JSPUtil.getParameter(request, "own_vol_act_uc_amt", ""));
		setFullStvgUcAmt(JSPUtil.getParameter(request, "full_stvg_uc_amt", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return SaqMonCfmQtaVO[]
	 */
	public SaqMonCfmQtaVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SaqMonCfmQtaVO[]
	 */
	public SaqMonCfmQtaVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SaqMonCfmQtaVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "mqta_rlse_ver_no");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "mqta_rlse_ver_no").length;
  
		try {
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] saqMiscRevAmt = (JSPUtil.getParameter(request, prefix	+ "saq_misc_rev_amt", length));
			String[] trdCd = (JSPUtil.getParameter(request, prefix	+ "trd_cd", length));
			String[] rlaneCd = (JSPUtil.getParameter(request, prefix	+ "rlane_cd", length));
			String[] addTpCd = (JSPUtil.getParameter(request, prefix	+ "add_tp_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] mtyTrspUcAmt = (JSPUtil.getParameter(request, prefix	+ "mty_trsp_uc_amt", length));
			String[] bseQtrCd = (JSPUtil.getParameter(request, prefix	+ "bse_qtr_cd", length));
			String[] polCd = (JSPUtil.getParameter(request, prefix	+ "pol_cd", length));
			String[] convDirCd = (JSPUtil.getParameter(request, prefix	+ "conv_dir_cd", length));
			String[] cntrFxUcAmt = (JSPUtil.getParameter(request, prefix	+ "cntr_fx_uc_amt", length));
			String[] bizActUcAmt = (JSPUtil.getParameter(request, prefix	+ "biz_act_uc_amt", length));
			String[] eqHldUcAmt = (JSPUtil.getParameter(request, prefix	+ "eq_hld_uc_amt", length));
			String[] custCntCd = (JSPUtil.getParameter(request, prefix	+ "cust_cnt_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] fullTrspUcAmt = (JSPUtil.getParameter(request, prefix	+ "full_trsp_uc_amt", length));
			String[] costUpdFlg = (JSPUtil.getParameter(request, prefix	+ "cost_upd_flg", length));
			String[] lodQty = (JSPUtil.getParameter(request, prefix	+ "lod_qty", length));
			String[] custGrpId = (JSPUtil.getParameter(request, prefix	+ "cust_grp_id", length));
			String[] raOpfitUcAmt = (JSPUtil.getParameter(request, prefix	+ "ra_opfit_uc_amt", length));
			String[] rhqCd = (JSPUtil.getParameter(request, prefix	+ "rhq_cd", length));
			String[] opfitUcAmt = (JSPUtil.getParameter(request, prefix	+ "opfit_uc_amt", length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no", length));
			String[] agnCommUtAmt = (JSPUtil.getParameter(request, prefix	+ "agn_comm_ut_amt", length));
			String[] chssFxUcAmt = (JSPUtil.getParameter(request, prefix	+ "chss_fx_uc_amt", length));
			String[] podCd = (JSPUtil.getParameter(request, prefix	+ "pod_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] eqSimUcAmt = (JSPUtil.getParameter(request, prefix	+ "eq_sim_uc_amt", length));
			String[] cmUcAmt = (JSPUtil.getParameter(request, prefix	+ "cm_uc_amt", length));
			String[] qtaTgtCd = (JSPUtil.getParameter(request, prefix	+ "qta_tgt_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] stpUcAmt = (JSPUtil.getParameter(request, prefix	+ "stp_uc_amt", length));
			String[] mqtaRlseVerNo = (JSPUtil.getParameter(request, prefix	+ "mqta_rlse_ver_no", length));
			String[] bseMon = (JSPUtil.getParameter(request, prefix	+ "bse_mon", length));
			String[] eqRepoUcAmt = (JSPUtil.getParameter(request, prefix	+ "eq_repo_uc_amt", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] mtyStvgUcAmt = (JSPUtil.getParameter(request, prefix	+ "mty_stvg_uc_amt", length));
			String[] grsRpbRev = (JSPUtil.getParameter(request, prefix	+ "grs_rpb_rev", length));
			String[] dirCd = (JSPUtil.getParameter(request, prefix	+ "dir_cd", length));
			String[] rgnOfcCd = (JSPUtil.getParameter(request, prefix	+ "rgn_ofc_cd", length));
			String[] aqCd = (JSPUtil.getParameter(request, prefix	+ "aq_cd", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] sltMgmtUcAmt = (JSPUtil.getParameter(request, prefix	+ "slt_mgmt_uc_amt", length));
			String[] bseYr = (JSPUtil.getParameter(request, prefix	+ "bse_yr", length));
			String[] custSeq = (JSPUtil.getParameter(request, prefix	+ "cust_seq", length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd", length));
			String[] raCmUcAmt = (JSPUtil.getParameter(request, prefix	+ "ra_cm_uc_amt", length));
			String[] ownVolActUcAmt = (JSPUtil.getParameter(request, prefix	+ "own_vol_act_uc_amt", length));
			String[] fullStvgUcAmt = (JSPUtil.getParameter(request, prefix	+ "full_stvg_uc_amt", length));
			
			for (int i = 0; i < length; i++) {
				model = new SaqMonCfmQtaVO();
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (saqMiscRevAmt[i] != null)
					model.setSaqMiscRevAmt(saqMiscRevAmt[i]);
				if (trdCd[i] != null)
					model.setTrdCd(trdCd[i]);
				if (rlaneCd[i] != null)
					model.setRlaneCd(rlaneCd[i]);
				if (addTpCd[i] != null)
					model.setAddTpCd(addTpCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (mtyTrspUcAmt[i] != null)
					model.setMtyTrspUcAmt(mtyTrspUcAmt[i]);
				if (bseQtrCd[i] != null)
					model.setBseQtrCd(bseQtrCd[i]);
				if (polCd[i] != null)
					model.setPolCd(polCd[i]);
				if (convDirCd[i] != null)
					model.setConvDirCd(convDirCd[i]);
				if (cntrFxUcAmt[i] != null)
					model.setCntrFxUcAmt(cntrFxUcAmt[i]);
				if (bizActUcAmt[i] != null)
					model.setBizActUcAmt(bizActUcAmt[i]);
				if (eqHldUcAmt[i] != null)
					model.setEqHldUcAmt(eqHldUcAmt[i]);
				if (custCntCd[i] != null)
					model.setCustCntCd(custCntCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (fullTrspUcAmt[i] != null)
					model.setFullTrspUcAmt(fullTrspUcAmt[i]);
				if (costUpdFlg[i] != null)
					model.setCostUpdFlg(costUpdFlg[i]);
				if (lodQty[i] != null)
					model.setLodQty(lodQty[i]);
				if (custGrpId[i] != null)
					model.setCustGrpId(custGrpId[i]);
				if (raOpfitUcAmt[i] != null)
					model.setRaOpfitUcAmt(raOpfitUcAmt[i]);
				if (rhqCd[i] != null)
					model.setRhqCd(rhqCd[i]);
				if (opfitUcAmt[i] != null)
					model.setOpfitUcAmt(opfitUcAmt[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (agnCommUtAmt[i] != null)
					model.setAgnCommUtAmt(agnCommUtAmt[i]);
				if (chssFxUcAmt[i] != null)
					model.setChssFxUcAmt(chssFxUcAmt[i]);
				if (podCd[i] != null)
					model.setPodCd(podCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (eqSimUcAmt[i] != null)
					model.setEqSimUcAmt(eqSimUcAmt[i]);
				if (cmUcAmt[i] != null)
					model.setCmUcAmt(cmUcAmt[i]);
				if (qtaTgtCd[i] != null)
					model.setQtaTgtCd(qtaTgtCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (stpUcAmt[i] != null)
					model.setStpUcAmt(stpUcAmt[i]);
				if (mqtaRlseVerNo[i] != null)
					model.setMqtaRlseVerNo(mqtaRlseVerNo[i]);
				if (bseMon[i] != null)
					model.setBseMon(bseMon[i]);
				if (eqRepoUcAmt[i] != null)
					model.setEqRepoUcAmt(eqRepoUcAmt[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (mtyStvgUcAmt[i] != null)
					model.setMtyStvgUcAmt(mtyStvgUcAmt[i]);
				if (grsRpbRev[i] != null)
					model.setGrsRpbRev(grsRpbRev[i]);
				if (dirCd[i] != null)
					model.setDirCd(dirCd[i]);
				if (rgnOfcCd[i] != null)
					model.setRgnOfcCd(rgnOfcCd[i]);
				if (aqCd[i] != null)
					model.setAqCd(aqCd[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (sltMgmtUcAmt[i] != null)
					model.setSltMgmtUcAmt(sltMgmtUcAmt[i]);
				if (bseYr[i] != null)
					model.setBseYr(bseYr[i]);
				if (custSeq[i] != null)
					model.setCustSeq(custSeq[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (raCmUcAmt[i] != null)
					model.setRaCmUcAmt(raCmUcAmt[i]);
				if (ownVolActUcAmt[i] != null)
					model.setOwnVolActUcAmt(ownVolActUcAmt[i]);
				if (fullStvgUcAmt[i] != null)
					model.setFullStvgUcAmt(fullStvgUcAmt[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSaqMonCfmQtaVOs();
	}

	/**
	 * (ESM_SAQ_0165)에 사용한 Parameter 로 재구성.
	 * @param request
	 * @param conVo
	 * @return SaqMonCfmQtaVO[]
	 */
//	public SaqMonCfmQtaVO[] fromRequestGrid(HttpServletRequest request, QuotaConditionVO conVo) {
//		SaqMonCfmQtaVO model = null;
//		
//		String[] tmp = request.getParameterValues("mqta_rlse_ver_no");
//  		if(tmp == null)
//   			return null;
//
//  		int length = request.getParameterValues("mqta_rlse_ver_no").length;
//  		
//		try {
//			
//			String[] ibflag = (JSPUtil.getParameter(request, "ibflag".trim(), length));
//			String[] mqtaRlseVerNo = (JSPUtil.getParameter(request, "mqta_rlse_ver_no".trim(), length));
//			String[] bseYr = (JSPUtil.getParameter(request, "bse_yr".trim(), length));
//			String[] bseQtrCd = (JSPUtil.getParameter(request, "bse_qtr_cd".trim(), length));
//			String[] qtaTgtCd = (JSPUtil.getParameter(request, "qta_tgt_cd".trim(), length));			
//			String[] trdCd = (JSPUtil.getParameter(request, "trd_cd".trim(), length));
//			String[] dirCd = (JSPUtil.getParameter(request, "dir_cd".trim(), length));
//			String[] rlaneCd = (JSPUtil.getParameter(request, "rlane_cd".trim(), length));
//			String[] vslCd = (JSPUtil.getParameter(request, "vsl_cd".trim(), length));
//			String[] skdVoyNo = (JSPUtil.getParameter(request, "skd_voy_no".trim(), length));
//			String[] skdDirCd = (JSPUtil.getParameter(request, "skd_dir_cd".trim(), length));
//			String[] rgnOfcCd = (JSPUtil.getParameter(request, "rgn_ofc_cd".trim(), length));
//			String[] bseMon = (JSPUtil.getParameter(request, "bse_mon".trim(), length));
//			String[] lodQty = (JSPUtil.getParameter(request, "lod_qty".trim(), length));
//			String[] grsRpbRev = (JSPUtil.getParameter(request, "grs_rpb_rev".trim(), length));
//			String[] cmUcAmt = (JSPUtil.getParameter(request, "cm_uc_amt".trim(), length));
//			String[] raCmUcAmt = (JSPUtil.getParameter(request, "ra_cm_uc_amt".trim(), length));
//			String[] raOpfitUcAmt = (JSPUtil.getParameter(request, "ra_opfit_uc_amt".trim(), length));
//			String[] addTpCd = (JSPUtil.getParameter(request, "add_tp_cd".trim(), length));
//			String[] creUsrId = (JSPUtil.getParameter(request, "cre_usr_id".trim(), length));
//			String[] updUsrId = (JSPUtil.getParameter(request, "upd_usr_id".trim(), length));
//			String[] vvdCd = (JSPUtil.getParameter(request, "vvd_cd".trim(), length));
//			// 2010.04.27 추가 
//			String[] custGrpId = (JSPUtil.getParameter(request, "cust_grp_id".trim(), length));
//			String[] rhqCd = (JSPUtil.getParameter(request, "rhq_cd".trim(), length));			
//			
//			for (int i = 0; i < length; i++) {
//				model = new SaqMonCfmQtaVO();
//				if (vslCd[i] != null)
//					model.setVslCd(vvdCd[i].substring(0, 4)); //vsl_cd
//				if (skdVoyNo[i] != null)
//					model.setSkdVoyNo(vvdCd[i].substring(4, 8)); //skd_voy_no
//				if (skdDirCd[i] != null)
//					model.setSkdDirCd(vvdCd[i].substring(8, 9)); //skd_dir_cd
//				if (trdCd[i] != null)
//					model.setTrdCd(trdCd[i]);
//				if (rlaneCd[i] != null)
//					model.setRlaneCd(rlaneCd[i]);
//				if (addTpCd[i] != null)
//					model.setAddTpCd(addTpCd[i]);
//				if (bseQtrCd[i] != null)
//					model.setBseQtrCd(bseQtrCd[i]);;
//				if (updUsrId[i] != null)
//					model.setUpdUsrId(updUsrId[i]);
//				if (lodQty[i] != null)
//					model.setLodQty(lodQty[i]);
//				if (raOpfitUcAmt[i] != null)
//					model.setRaOpfitUcAmt(raOpfitUcAmt[i]);
//				if (creUsrId[i] != null)
//					model.setCreUsrId(creUsrId[i]);
//				if (cmUcAmt[i] != null)
//					model.setCmUcAmt(cmUcAmt[i]);
//				if (qtaTgtCd[i] != null)
//					model.setQtaTgtCd(qtaTgtCd[i]);
//				if (mqtaRlseVerNo[i] != null)
//					model.setMqtaRlseVerNo(mqtaRlseVerNo[i]);
//				if (bseMon[i] != null)
//					model.setBseMon(bseMon[i]);
//				if (ibflag[i] != null)
//					model.setIbflag(ibflag[i]);
//				if (grsRpbRev[i] != null)
//					model.setGrsRpbRev(grsRpbRev[i]);
//				if (dirCd[i] != null)
//					model.setDirCd(dirCd[i]);
//				if (rgnOfcCd[i] != null)
//					model.setRgnOfcCd(rgnOfcCd[i]);
//				if (bseYr[i] != null)
//					model.setBseYr(bseYr[i]);
//				if (raCmUcAmt[i] != null)
//					model.setRaCmUcAmt(raCmUcAmt[i]);
//				if (custGrpId[i] != null)
//					model.setCustGrpId(custGrpId[i]);
//				if (rhqCd[i] != null)
//					model.setRhqCd(rhqCd[i]);				
//				
//				models.add(model);
//			}
//
//		} catch (Exception e) {
//			return null;
//		}
//		return getSaqMonCfmQtaVOs();
//	}
	
	/**
	 * VO 배열을 반환
	 * @return SaqMonCfmQtaVO[]
	 */
	public SaqMonCfmQtaVO[] getSaqMonCfmQtaVOs(){
		SaqMonCfmQtaVO[] vos = (SaqMonCfmQtaVO[])models.toArray(new SaqMonCfmQtaVO[models.size()]);
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
		this.saqMiscRevAmt = this.saqMiscRevAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trdCd = this.trdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rlaneCd = this.rlaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.addTpCd = this.addTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mtyTrspUcAmt = this.mtyTrspUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bseQtrCd = this.bseQtrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.polCd = this.polCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.convDirCd = this.convDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrFxUcAmt = this.cntrFxUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bizActUcAmt = this.bizActUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqHldUcAmt = this.eqHldUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custCntCd = this.custCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fullTrspUcAmt = this.fullTrspUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costUpdFlg = this.costUpdFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lodQty = this.lodQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custGrpId = this.custGrpId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.raOpfitUcAmt = this.raOpfitUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rhqCd = this.rhqCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.opfitUcAmt = this.opfitUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agnCommUtAmt = this.agnCommUtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssFxUcAmt = this.chssFxUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.podCd = this.podCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqSimUcAmt = this.eqSimUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cmUcAmt = this.cmUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.qtaTgtCd = this.qtaTgtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stpUcAmt = this.stpUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mqtaRlseVerNo = this.mqtaRlseVerNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bseMon = this.bseMon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqRepoUcAmt = this.eqRepoUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mtyStvgUcAmt = this.mtyStvgUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.grsRpbRev = this.grsRpbRev .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dirCd = this.dirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rgnOfcCd = this.rgnOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aqCd = this.aqCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sltMgmtUcAmt = this.sltMgmtUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bseYr = this.bseYr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custSeq = this.custSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.raCmUcAmt = this.raCmUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ownVolActUcAmt = this.ownVolActUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fullStvgUcAmt = this.fullStvgUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
