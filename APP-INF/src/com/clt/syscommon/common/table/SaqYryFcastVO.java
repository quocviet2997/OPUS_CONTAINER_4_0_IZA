/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : SaqYryFcastVO.java
*@FileTitle : SaqYryFcastVO
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

public class SaqYryFcastVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SaqYryFcastVO> models = new ArrayList<SaqYryFcastVO>();
	
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String oldVvdCd = null;
	/* Column Info */
	private String n1stPolCd = null;
	/* Column Info */
	private String saqMiscRevAmt = null;
	/* Column Info */
	private String trnkPodCd = null;
	/* Column Info */
	private String trdCd = null;
	/* Column Info */
	private String rlaneCd = null;
	/* Column Info */
	private String repTrdCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String mtyTrspUcAmt = null;
	/* Column Info */
	private String svcModCd = null;
	/* Column Info */
	private String ctrtOfcCd = null;
	/* Column Info */
	private String slsOfcCd = null;
	/* Column Info */
	private String cntrFxUcAmt = null;
	/* Column Info */
	private String fcastCntrTpszCd = null;
	/* Column Info */
	private String bizActUcAmt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String custCntCd = null;
	/* Column Info */
	private String fullTrspUcAmt = null;
	/* Column Info */
	private String lodQty = null;
	/* Column Info */
	private String cntrWgt = null;
	/* Column Info */
	private String custGrpId = null;
	/* Column Info */
	private String raOpfitUcAmt = null;
	/* Column Info */
	private String slsAqCd = null;
	/* Column Info */
	private String opfitUcAmt = null;
	/* Column Info */
	private String delCd = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String agnCommUtAmt = null;
	/* Column Info */
	private String chssFxUcAmt = null;
	/* Column Info */
	private String slsRhqCd = null;
	/* Column Info */
	private String trnkPolCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String slsFcastPubNo = null;
	/* Column Info */
	private String lstPodCd = null;
	/* Column Info */
	private String raStpPfitUtAmt = null;
	/* Column Info */
	private String dmdtUtAmt = null;
	/* Column Info */
	private String subTrdCd = null;
	/* Column Info */
	private String porCd = null;
	/* Column Info */
	private String cmUcAmt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String oldRlaneCd = null;
	/* Column Info */
	private String saqSvcModCd = null;
	/* Column Info */
	private String ctrtRhqCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String mtyStvgUcAmt = null;
	/* Column Info */
	private String grsRpbRev = null;
	/* Column Info */
	private String lgsCostAsgnStepCd = null;
	/* Column Info */
	private String dirCd = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String iocCd = null;
	/* Column Info */
	private String ctrtAqCd = null;
	/* Column Info */
	private String tmlVolIncntAmt = null;
	/* Column Info */
	private String ctrtRgnOfcCd = null;
	/* Column Info */
	private String oldTrdCd = null;
	/* Column Info */
	private String custSeq = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Column Info */
	private String raCmUcAmt = null;
	/* Column Info */
	private String slsRgnOfcCd = null;
	/* Column Info */
	private String costAsgnStepCd = null;
	/* Column Info */
	private String fullStvgUcAmt = null;
	/* Column Info */
	private String repSubTrdCd = null;
	/* Column Info */
	private String slsFcastNo = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public SaqYryFcastVO() {}

	public SaqYryFcastVO(String ibflag, String pagerows, String slsFcastPubNo, String slsFcastNo, String rlaneCd, String dirCd, String vslCd, String skdVoyNo, String skdDirCd, String custCntCd, String custSeq, String ctrtOfcCd, String slsOfcCd, String porCd, String delCd, String n1stPolCd, String lstPodCd, String trnkPolCd, String trnkPodCd, String fcastCntrTpszCd, String lodQty, String cntrWgt, String grsRpbRev, String cmUcAmt, String opfitUcAmt, String raCmUcAmt, String raStpPfitUtAmt, String raOpfitUcAmt, String repTrdCd, String repSubTrdCd, String trdCd, String subTrdCd, String iocCd, String ctrtRhqCd, String ctrtAqCd, String ctrtRgnOfcCd, String slsRhqCd, String slsAqCd, String slsRgnOfcCd, String costAsgnStepCd, String lgsCostAsgnStepCd, String svcModCd, String saqSvcModCd, String fullStvgUcAmt, String fullTrspUcAmt, String mtyStvgUcAmt, String mtyTrspUcAmt, String cntrFxUcAmt, String chssFxUcAmt, String agnCommUtAmt, String bizActUcAmt, String dmdtUtAmt, String tmlVolIncntAmt, String saqMiscRevAmt, String oldTrdCd, String oldRlaneCd, String oldVvdCd, String custGrpId, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.vslCd = vslCd;
		this.oldVvdCd = oldVvdCd;
		this.n1stPolCd = n1stPolCd;
		this.saqMiscRevAmt = saqMiscRevAmt;
		this.trnkPodCd = trnkPodCd;
		this.trdCd = trdCd;
		this.rlaneCd = rlaneCd;
		this.repTrdCd = repTrdCd;
		this.pagerows = pagerows;
		this.mtyTrspUcAmt = mtyTrspUcAmt;
		this.svcModCd = svcModCd;
		this.ctrtOfcCd = ctrtOfcCd;
		this.slsOfcCd = slsOfcCd;
		this.cntrFxUcAmt = cntrFxUcAmt;
		this.fcastCntrTpszCd = fcastCntrTpszCd;
		this.bizActUcAmt = bizActUcAmt;
		this.updUsrId = updUsrId;
		this.custCntCd = custCntCd;
		this.fullTrspUcAmt = fullTrspUcAmt;
		this.lodQty = lodQty;
		this.cntrWgt = cntrWgt;
		this.custGrpId = custGrpId;
		this.raOpfitUcAmt = raOpfitUcAmt;
		this.slsAqCd = slsAqCd;
		this.opfitUcAmt = opfitUcAmt;
		this.delCd = delCd;
		this.skdVoyNo = skdVoyNo;
		this.agnCommUtAmt = agnCommUtAmt;
		this.chssFxUcAmt = chssFxUcAmt;
		this.slsRhqCd = slsRhqCd;
		this.trnkPolCd = trnkPolCd;
		this.creUsrId = creUsrId;
		this.slsFcastPubNo = slsFcastPubNo;
		this.lstPodCd = lstPodCd;
		this.raStpPfitUtAmt = raStpPfitUtAmt;
		this.dmdtUtAmt = dmdtUtAmt;
		this.subTrdCd = subTrdCd;
		this.porCd = porCd;
		this.cmUcAmt = cmUcAmt;
		this.creDt = creDt;
		this.oldRlaneCd = oldRlaneCd;
		this.saqSvcModCd = saqSvcModCd;
		this.ctrtRhqCd = ctrtRhqCd;
		this.ibflag = ibflag;
		this.mtyStvgUcAmt = mtyStvgUcAmt;
		this.grsRpbRev = grsRpbRev;
		this.lgsCostAsgnStepCd = lgsCostAsgnStepCd;
		this.dirCd = dirCd;
		this.updDt = updDt;
		this.iocCd = iocCd;
		this.ctrtAqCd = ctrtAqCd;
		this.tmlVolIncntAmt = tmlVolIncntAmt;
		this.ctrtRgnOfcCd = ctrtRgnOfcCd;
		this.oldTrdCd = oldTrdCd;
		this.custSeq = custSeq;
		this.skdDirCd = skdDirCd;
		this.raCmUcAmt = raCmUcAmt;
		this.slsRgnOfcCd = slsRgnOfcCd;
		this.costAsgnStepCd = costAsgnStepCd;
		this.fullStvgUcAmt = fullStvgUcAmt;
		this.repSubTrdCd = repSubTrdCd;
		this.slsFcastNo = slsFcastNo;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("old_vvd_cd", getOldVvdCd());
		this.hashColumns.put("n1st_pol_cd", getN1stPolCd());
		this.hashColumns.put("saq_misc_rev_amt", getSaqMiscRevAmt());
		this.hashColumns.put("trnk_pod_cd", getTrnkPodCd());
		this.hashColumns.put("trd_cd", getTrdCd());
		this.hashColumns.put("rlane_cd", getRlaneCd());
		this.hashColumns.put("rep_trd_cd", getRepTrdCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("mty_trsp_uc_amt", getMtyTrspUcAmt());
		this.hashColumns.put("svc_mod_cd", getSvcModCd());
		this.hashColumns.put("ctrt_ofc_cd", getCtrtOfcCd());
		this.hashColumns.put("sls_ofc_cd", getSlsOfcCd());
		this.hashColumns.put("cntr_fx_uc_amt", getCntrFxUcAmt());
		this.hashColumns.put("fcast_cntr_tpsz_cd", getFcastCntrTpszCd());
		this.hashColumns.put("biz_act_uc_amt", getBizActUcAmt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("cust_cnt_cd", getCustCntCd());
		this.hashColumns.put("full_trsp_uc_amt", getFullTrspUcAmt());
		this.hashColumns.put("lod_qty", getLodQty());
		this.hashColumns.put("cntr_wgt", getCntrWgt());
		this.hashColumns.put("cust_grp_id", getCustGrpId());
		this.hashColumns.put("ra_opfit_uc_amt", getRaOpfitUcAmt());
		this.hashColumns.put("sls_aq_cd", getSlsAqCd());
		this.hashColumns.put("opfit_uc_amt", getOpfitUcAmt());
		this.hashColumns.put("del_cd", getDelCd());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("agn_comm_ut_amt", getAgnCommUtAmt());
		this.hashColumns.put("chss_fx_uc_amt", getChssFxUcAmt());
		this.hashColumns.put("sls_rhq_cd", getSlsRhqCd());
		this.hashColumns.put("trnk_pol_cd", getTrnkPolCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("sls_fcast_pub_no", getSlsFcastPubNo());
		this.hashColumns.put("lst_pod_cd", getLstPodCd());
		this.hashColumns.put("ra_stp_pfit_ut_amt", getRaStpPfitUtAmt());
		this.hashColumns.put("dmdt_ut_amt", getDmdtUtAmt());
		this.hashColumns.put("sub_trd_cd", getSubTrdCd());
		this.hashColumns.put("por_cd", getPorCd());
		this.hashColumns.put("cm_uc_amt", getCmUcAmt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("old_rlane_cd", getOldRlaneCd());
		this.hashColumns.put("saq_svc_mod_cd", getSaqSvcModCd());
		this.hashColumns.put("ctrt_rhq_cd", getCtrtRhqCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("mty_stvg_uc_amt", getMtyStvgUcAmt());
		this.hashColumns.put("grs_rpb_rev", getGrsRpbRev());
		this.hashColumns.put("lgs_cost_asgn_step_cd", getLgsCostAsgnStepCd());
		this.hashColumns.put("dir_cd", getDirCd());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("ioc_cd", getIocCd());
		this.hashColumns.put("ctrt_aq_cd", getCtrtAqCd());
		this.hashColumns.put("tml_vol_incnt_amt", getTmlVolIncntAmt());
		this.hashColumns.put("ctrt_rgn_ofc_cd", getCtrtRgnOfcCd());
		this.hashColumns.put("old_trd_cd", getOldTrdCd());
		this.hashColumns.put("cust_seq", getCustSeq());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("ra_cm_uc_amt", getRaCmUcAmt());
		this.hashColumns.put("sls_rgn_ofc_cd", getSlsRgnOfcCd());
		this.hashColumns.put("cost_asgn_step_cd", getCostAsgnStepCd());
		this.hashColumns.put("full_stvg_uc_amt", getFullStvgUcAmt());
		this.hashColumns.put("rep_sub_trd_cd", getRepSubTrdCd());
		this.hashColumns.put("sls_fcast_no", getSlsFcastNo());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("old_vvd_cd", "oldVvdCd");
		this.hashFields.put("n1st_pol_cd", "n1stPolCd");
		this.hashFields.put("saq_misc_rev_amt", "saqMiscRevAmt");
		this.hashFields.put("trnk_pod_cd", "trnkPodCd");
		this.hashFields.put("trd_cd", "trdCd");
		this.hashFields.put("rlane_cd", "rlaneCd");
		this.hashFields.put("rep_trd_cd", "repTrdCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("mty_trsp_uc_amt", "mtyTrspUcAmt");
		this.hashFields.put("svc_mod_cd", "svcModCd");
		this.hashFields.put("ctrt_ofc_cd", "ctrtOfcCd");
		this.hashFields.put("sls_ofc_cd", "slsOfcCd");
		this.hashFields.put("cntr_fx_uc_amt", "cntrFxUcAmt");
		this.hashFields.put("fcast_cntr_tpsz_cd", "fcastCntrTpszCd");
		this.hashFields.put("biz_act_uc_amt", "bizActUcAmt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("cust_cnt_cd", "custCntCd");
		this.hashFields.put("full_trsp_uc_amt", "fullTrspUcAmt");
		this.hashFields.put("lod_qty", "lodQty");
		this.hashFields.put("cntr_wgt", "cntrWgt");
		this.hashFields.put("cust_grp_id", "custGrpId");
		this.hashFields.put("ra_opfit_uc_amt", "raOpfitUcAmt");
		this.hashFields.put("sls_aq_cd", "slsAqCd");
		this.hashFields.put("opfit_uc_amt", "opfitUcAmt");
		this.hashFields.put("del_cd", "delCd");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("agn_comm_ut_amt", "agnCommUtAmt");
		this.hashFields.put("chss_fx_uc_amt", "chssFxUcAmt");
		this.hashFields.put("sls_rhq_cd", "slsRhqCd");
		this.hashFields.put("trnk_pol_cd", "trnkPolCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("sls_fcast_pub_no", "slsFcastPubNo");
		this.hashFields.put("lst_pod_cd", "lstPodCd");
		this.hashFields.put("ra_stp_pfit_ut_amt", "raStpPfitUtAmt");
		this.hashFields.put("dmdt_ut_amt", "dmdtUtAmt");
		this.hashFields.put("sub_trd_cd", "subTrdCd");
		this.hashFields.put("por_cd", "porCd");
		this.hashFields.put("cm_uc_amt", "cmUcAmt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("old_rlane_cd", "oldRlaneCd");
		this.hashFields.put("saq_svc_mod_cd", "saqSvcModCd");
		this.hashFields.put("ctrt_rhq_cd", "ctrtRhqCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("mty_stvg_uc_amt", "mtyStvgUcAmt");
		this.hashFields.put("grs_rpb_rev", "grsRpbRev");
		this.hashFields.put("lgs_cost_asgn_step_cd", "lgsCostAsgnStepCd");
		this.hashFields.put("dir_cd", "dirCd");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("ioc_cd", "iocCd");
		this.hashFields.put("ctrt_aq_cd", "ctrtAqCd");
		this.hashFields.put("tml_vol_incnt_amt", "tmlVolIncntAmt");
		this.hashFields.put("ctrt_rgn_ofc_cd", "ctrtRgnOfcCd");
		this.hashFields.put("old_trd_cd", "oldTrdCd");
		this.hashFields.put("cust_seq", "custSeq");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("ra_cm_uc_amt", "raCmUcAmt");
		this.hashFields.put("sls_rgn_ofc_cd", "slsRgnOfcCd");
		this.hashFields.put("cost_asgn_step_cd", "costAsgnStepCd");
		this.hashFields.put("full_stvg_uc_amt", "fullStvgUcAmt");
		this.hashFields.put("rep_sub_trd_cd", "repSubTrdCd");
		this.hashFields.put("sls_fcast_no", "slsFcastNo");
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
	 * @return oldVvdCd
	 */
	public String getOldVvdCd() {
		return this.oldVvdCd;
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
	 * @return saqMiscRevAmt
	 */
	public String getSaqMiscRevAmt() {
		return this.saqMiscRevAmt;
	}
	
	/**
	 * Column Info
	 * @return trnkPodCd
	 */
	public String getTrnkPodCd() {
		return this.trnkPodCd;
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
	 * @return repTrdCd
	 */
	public String getRepTrdCd() {
		return this.repTrdCd;
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
	 * @return svcModCd
	 */
	public String getSvcModCd() {
		return this.svcModCd;
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
	 * @return slsOfcCd
	 */
	public String getSlsOfcCd() {
		return this.slsOfcCd;
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
	 * @return fcastCntrTpszCd
	 */
	public String getFcastCntrTpszCd() {
		return this.fcastCntrTpszCd;
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
	 * @return updUsrId
	 */
	public String getUpdUsrId() {
		return this.updUsrId;
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
	 * @return fullTrspUcAmt
	 */
	public String getFullTrspUcAmt() {
		return this.fullTrspUcAmt;
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
	 * @return cntrWgt
	 */
	public String getCntrWgt() {
		return this.cntrWgt;
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
	 * @return slsAqCd
	 */
	public String getSlsAqCd() {
		return this.slsAqCd;
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
	 * @return delCd
	 */
	public String getDelCd() {
		return this.delCd;
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
	 * @return slsRhqCd
	 */
	public String getSlsRhqCd() {
		return this.slsRhqCd;
	}
	
	/**
	 * Column Info
	 * @return trnkPolCd
	 */
	public String getTrnkPolCd() {
		return this.trnkPolCd;
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
	 * @return slsFcastPubNo
	 */
	public String getSlsFcastPubNo() {
		return this.slsFcastPubNo;
	}
	
	/**
	 * Column Info
	 * @return lstPodCd
	 */
	public String getLstPodCd() {
		return this.lstPodCd;
	}
	
	/**
	 * Column Info
	 * @return raStpPfitUtAmt
	 */
	public String getRaStpPfitUtAmt() {
		return this.raStpPfitUtAmt;
	}
	
	/**
	 * Column Info
	 * @return dmdtUtAmt
	 */
	public String getDmdtUtAmt() {
		return this.dmdtUtAmt;
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
	 * @return porCd
	 */
	public String getPorCd() {
		return this.porCd;
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
	 * @return creDt
	 */
	public String getCreDt() {
		return this.creDt;
	}
	
	/**
	 * Column Info
	 * @return oldRlaneCd
	 */
	public String getOldRlaneCd() {
		return this.oldRlaneCd;
	}
	
	/**
	 * Column Info
	 * @return saqSvcModCd
	 */
	public String getSaqSvcModCd() {
		return this.saqSvcModCd;
	}
	
	/**
	 * Column Info
	 * @return ctrtRhqCd
	 */
	public String getCtrtRhqCd() {
		return this.ctrtRhqCd;
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
	 * @return lgsCostAsgnStepCd
	 */
	public String getLgsCostAsgnStepCd() {
		return this.lgsCostAsgnStepCd;
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
	 * @return ctrtAqCd
	 */
	public String getCtrtAqCd() {
		return this.ctrtAqCd;
	}
	
	/**
	 * Column Info
	 * @return tmlVolIncntAmt
	 */
	public String getTmlVolIncntAmt() {
		return this.tmlVolIncntAmt;
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
	 * @return oldTrdCd
	 */
	public String getOldTrdCd() {
		return this.oldTrdCd;
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
	 * @return slsRgnOfcCd
	 */
	public String getSlsRgnOfcCd() {
		return this.slsRgnOfcCd;
	}
	
	/**
	 * Column Info
	 * @return costAsgnStepCd
	 */
	public String getCostAsgnStepCd() {
		return this.costAsgnStepCd;
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
	 * @return repSubTrdCd
	 */
	public String getRepSubTrdCd() {
		return this.repSubTrdCd;
	}
	
	/**
	 * Column Info
	 * @return slsFcastNo
	 */
	public String getSlsFcastNo() {
		return this.slsFcastNo;
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
	 * @param oldVvdCd
	 */
	public void setOldVvdCd(String oldVvdCd) {
		this.oldVvdCd = oldVvdCd;
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
	 * @param saqMiscRevAmt
	 */
	public void setSaqMiscRevAmt(String saqMiscRevAmt) {
		this.saqMiscRevAmt = saqMiscRevAmt;
	}
	
	/**
	 * Column Info
	 * @param trnkPodCd
	 */
	public void setTrnkPodCd(String trnkPodCd) {
		this.trnkPodCd = trnkPodCd;
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
	 * @param repTrdCd
	 */
	public void setRepTrdCd(String repTrdCd) {
		this.repTrdCd = repTrdCd;
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
	 * @param svcModCd
	 */
	public void setSvcModCd(String svcModCd) {
		this.svcModCd = svcModCd;
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
	 * @param slsOfcCd
	 */
	public void setSlsOfcCd(String slsOfcCd) {
		this.slsOfcCd = slsOfcCd;
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
	 * @param fcastCntrTpszCd
	 */
	public void setFcastCntrTpszCd(String fcastCntrTpszCd) {
		this.fcastCntrTpszCd = fcastCntrTpszCd;
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
	 * @param updUsrId
	 */
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
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
	 * @param fullTrspUcAmt
	 */
	public void setFullTrspUcAmt(String fullTrspUcAmt) {
		this.fullTrspUcAmt = fullTrspUcAmt;
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
	 * @param cntrWgt
	 */
	public void setCntrWgt(String cntrWgt) {
		this.cntrWgt = cntrWgt;
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
	 * @param slsAqCd
	 */
	public void setSlsAqCd(String slsAqCd) {
		this.slsAqCd = slsAqCd;
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
	 * @param delCd
	 */
	public void setDelCd(String delCd) {
		this.delCd = delCd;
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
	 * @param slsRhqCd
	 */
	public void setSlsRhqCd(String slsRhqCd) {
		this.slsRhqCd = slsRhqCd;
	}
	
	/**
	 * Column Info
	 * @param trnkPolCd
	 */
	public void setTrnkPolCd(String trnkPolCd) {
		this.trnkPolCd = trnkPolCd;
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
	 * @param slsFcastPubNo
	 */
	public void setSlsFcastPubNo(String slsFcastPubNo) {
		this.slsFcastPubNo = slsFcastPubNo;
	}
	
	/**
	 * Column Info
	 * @param lstPodCd
	 */
	public void setLstPodCd(String lstPodCd) {
		this.lstPodCd = lstPodCd;
	}
	
	/**
	 * Column Info
	 * @param raStpPfitUtAmt
	 */
	public void setRaStpPfitUtAmt(String raStpPfitUtAmt) {
		this.raStpPfitUtAmt = raStpPfitUtAmt;
	}
	
	/**
	 * Column Info
	 * @param dmdtUtAmt
	 */
	public void setDmdtUtAmt(String dmdtUtAmt) {
		this.dmdtUtAmt = dmdtUtAmt;
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
	 * @param porCd
	 */
	public void setPorCd(String porCd) {
		this.porCd = porCd;
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
	 * @param creDt
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
	}
	
	/**
	 * Column Info
	 * @param oldRlaneCd
	 */
	public void setOldRlaneCd(String oldRlaneCd) {
		this.oldRlaneCd = oldRlaneCd;
	}
	
	/**
	 * Column Info
	 * @param saqSvcModCd
	 */
	public void setSaqSvcModCd(String saqSvcModCd) {
		this.saqSvcModCd = saqSvcModCd;
	}
	
	/**
	 * Column Info
	 * @param ctrtRhqCd
	 */
	public void setCtrtRhqCd(String ctrtRhqCd) {
		this.ctrtRhqCd = ctrtRhqCd;
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
	 * @param lgsCostAsgnStepCd
	 */
	public void setLgsCostAsgnStepCd(String lgsCostAsgnStepCd) {
		this.lgsCostAsgnStepCd = lgsCostAsgnStepCd;
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
	 * @param ctrtAqCd
	 */
	public void setCtrtAqCd(String ctrtAqCd) {
		this.ctrtAqCd = ctrtAqCd;
	}
	
	/**
	 * Column Info
	 * @param tmlVolIncntAmt
	 */
	public void setTmlVolIncntAmt(String tmlVolIncntAmt) {
		this.tmlVolIncntAmt = tmlVolIncntAmt;
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
	 * @param oldTrdCd
	 */
	public void setOldTrdCd(String oldTrdCd) {
		this.oldTrdCd = oldTrdCd;
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
	 * @param slsRgnOfcCd
	 */
	public void setSlsRgnOfcCd(String slsRgnOfcCd) {
		this.slsRgnOfcCd = slsRgnOfcCd;
	}
	
	/**
	 * Column Info
	 * @param costAsgnStepCd
	 */
	public void setCostAsgnStepCd(String costAsgnStepCd) {
		this.costAsgnStepCd = costAsgnStepCd;
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
	 * @param repSubTrdCd
	 */
	public void setRepSubTrdCd(String repSubTrdCd) {
		this.repSubTrdCd = repSubTrdCd;
	}
	
	/**
	 * Column Info
	 * @param slsFcastNo
	 */
	public void setSlsFcastNo(String slsFcastNo) {
		this.slsFcastNo = slsFcastNo;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setOldVvdCd(JSPUtil.getParameter(request, "old_vvd_cd", ""));
		setN1stPolCd(JSPUtil.getParameter(request, "n1st_pol_cd", ""));
		setSaqMiscRevAmt(JSPUtil.getParameter(request, "saq_misc_rev_amt", ""));
		setTrnkPodCd(JSPUtil.getParameter(request, "trnk_pod_cd", ""));
		setTrdCd(JSPUtil.getParameter(request, "trd_cd", ""));
		setRlaneCd(JSPUtil.getParameter(request, "rlane_cd", ""));
		setRepTrdCd(JSPUtil.getParameter(request, "rep_trd_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setMtyTrspUcAmt(JSPUtil.getParameter(request, "mty_trsp_uc_amt", ""));
		setSvcModCd(JSPUtil.getParameter(request, "svc_mod_cd", ""));
		setCtrtOfcCd(JSPUtil.getParameter(request, "ctrt_ofc_cd", ""));
		setSlsOfcCd(JSPUtil.getParameter(request, "sls_ofc_cd", ""));
		setCntrFxUcAmt(JSPUtil.getParameter(request, "cntr_fx_uc_amt", ""));
		setFcastCntrTpszCd(JSPUtil.getParameter(request, "fcast_cntr_tpsz_cd", ""));
		setBizActUcAmt(JSPUtil.getParameter(request, "biz_act_uc_amt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setCustCntCd(JSPUtil.getParameter(request, "cust_cnt_cd", ""));
		setFullTrspUcAmt(JSPUtil.getParameter(request, "full_trsp_uc_amt", ""));
		setLodQty(JSPUtil.getParameter(request, "lod_qty", ""));
		setCntrWgt(JSPUtil.getParameter(request, "cntr_wgt", ""));
		setCustGrpId(JSPUtil.getParameter(request, "cust_grp_id", ""));
		setRaOpfitUcAmt(JSPUtil.getParameter(request, "ra_opfit_uc_amt", ""));
		setSlsAqCd(JSPUtil.getParameter(request, "sls_aq_cd", ""));
		setOpfitUcAmt(JSPUtil.getParameter(request, "opfit_uc_amt", ""));
		setDelCd(JSPUtil.getParameter(request, "del_cd", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, "skd_voy_no", ""));
		setAgnCommUtAmt(JSPUtil.getParameter(request, "agn_comm_ut_amt", ""));
		setChssFxUcAmt(JSPUtil.getParameter(request, "chss_fx_uc_amt", ""));
		setSlsRhqCd(JSPUtil.getParameter(request, "sls_rhq_cd", ""));
		setTrnkPolCd(JSPUtil.getParameter(request, "trnk_pol_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setSlsFcastPubNo(JSPUtil.getParameter(request, "sls_fcast_pub_no", ""));
		setLstPodCd(JSPUtil.getParameter(request, "lst_pod_cd", ""));
		setRaStpPfitUtAmt(JSPUtil.getParameter(request, "ra_stp_pfit_ut_amt", ""));
		setDmdtUtAmt(JSPUtil.getParameter(request, "dmdt_ut_amt", ""));
		setSubTrdCd(JSPUtil.getParameter(request, "sub_trd_cd", ""));
		setPorCd(JSPUtil.getParameter(request, "por_cd", ""));
		setCmUcAmt(JSPUtil.getParameter(request, "cm_uc_amt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setOldRlaneCd(JSPUtil.getParameter(request, "old_rlane_cd", ""));
		setSaqSvcModCd(JSPUtil.getParameter(request, "saq_svc_mod_cd", ""));
		setCtrtRhqCd(JSPUtil.getParameter(request, "ctrt_rhq_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setMtyStvgUcAmt(JSPUtil.getParameter(request, "mty_stvg_uc_amt", ""));
		setGrsRpbRev(JSPUtil.getParameter(request, "grs_rpb_rev", ""));
		setLgsCostAsgnStepCd(JSPUtil.getParameter(request, "lgs_cost_asgn_step_cd", ""));
		setDirCd(JSPUtil.getParameter(request, "dir_cd", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setIocCd(JSPUtil.getParameter(request, "ioc_cd", ""));
		setCtrtAqCd(JSPUtil.getParameter(request, "ctrt_aq_cd", ""));
		setTmlVolIncntAmt(JSPUtil.getParameter(request, "tml_vol_incnt_amt", ""));
		setCtrtRgnOfcCd(JSPUtil.getParameter(request, "ctrt_rgn_ofc_cd", ""));
		setOldTrdCd(JSPUtil.getParameter(request, "old_trd_cd", ""));
		setCustSeq(JSPUtil.getParameter(request, "cust_seq", ""));
		setSkdDirCd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
		setRaCmUcAmt(JSPUtil.getParameter(request, "ra_cm_uc_amt", ""));
		setSlsRgnOfcCd(JSPUtil.getParameter(request, "sls_rgn_ofc_cd", ""));
		setCostAsgnStepCd(JSPUtil.getParameter(request, "cost_asgn_step_cd", ""));
		setFullStvgUcAmt(JSPUtil.getParameter(request, "full_stvg_uc_amt", ""));
		setRepSubTrdCd(JSPUtil.getParameter(request, "rep_sub_trd_cd", ""));
		setSlsFcastNo(JSPUtil.getParameter(request, "sls_fcast_no", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return SaqYryFcastVO[]
	 */
	public SaqYryFcastVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SaqYryFcastVO[]
	 */
	public SaqYryFcastVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SaqYryFcastVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] oldVvdCd = (JSPUtil.getParameter(request, prefix	+ "old_vvd_cd", length));
			String[] n1stPolCd = (JSPUtil.getParameter(request, prefix	+ "n1st_pol_cd", length));
			String[] saqMiscRevAmt = (JSPUtil.getParameter(request, prefix	+ "saq_misc_rev_amt", length));
			String[] trnkPodCd = (JSPUtil.getParameter(request, prefix	+ "trnk_pod_cd", length));
			String[] trdCd = (JSPUtil.getParameter(request, prefix	+ "trd_cd", length));
			String[] rlaneCd = (JSPUtil.getParameter(request, prefix	+ "rlane_cd", length));
			String[] repTrdCd = (JSPUtil.getParameter(request, prefix	+ "rep_trd_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] mtyTrspUcAmt = (JSPUtil.getParameter(request, prefix	+ "mty_trsp_uc_amt", length));
			String[] svcModCd = (JSPUtil.getParameter(request, prefix	+ "svc_mod_cd", length));
			String[] ctrtOfcCd = (JSPUtil.getParameter(request, prefix	+ "ctrt_ofc_cd", length));
			String[] slsOfcCd = (JSPUtil.getParameter(request, prefix	+ "sls_ofc_cd", length));
			String[] cntrFxUcAmt = (JSPUtil.getParameter(request, prefix	+ "cntr_fx_uc_amt", length));
			String[] fcastCntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "fcast_cntr_tpsz_cd", length));
			String[] bizActUcAmt = (JSPUtil.getParameter(request, prefix	+ "biz_act_uc_amt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] custCntCd = (JSPUtil.getParameter(request, prefix	+ "cust_cnt_cd", length));
			String[] fullTrspUcAmt = (JSPUtil.getParameter(request, prefix	+ "full_trsp_uc_amt", length));
			String[] lodQty = (JSPUtil.getParameter(request, prefix	+ "lod_qty", length));
			String[] cntrWgt = (JSPUtil.getParameter(request, prefix	+ "cntr_wgt", length));
			String[] custGrpId = (JSPUtil.getParameter(request, prefix	+ "cust_grp_id", length));
			String[] raOpfitUcAmt = (JSPUtil.getParameter(request, prefix	+ "ra_opfit_uc_amt", length));
			String[] slsAqCd = (JSPUtil.getParameter(request, prefix	+ "sls_aq_cd", length));
			String[] opfitUcAmt = (JSPUtil.getParameter(request, prefix	+ "opfit_uc_amt", length));
			String[] delCd = (JSPUtil.getParameter(request, prefix	+ "del_cd", length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no", length));
			String[] agnCommUtAmt = (JSPUtil.getParameter(request, prefix	+ "agn_comm_ut_amt", length));
			String[] chssFxUcAmt = (JSPUtil.getParameter(request, prefix	+ "chss_fx_uc_amt", length));
			String[] slsRhqCd = (JSPUtil.getParameter(request, prefix	+ "sls_rhq_cd", length));
			String[] trnkPolCd = (JSPUtil.getParameter(request, prefix	+ "trnk_pol_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] slsFcastPubNo = (JSPUtil.getParameter(request, prefix	+ "sls_fcast_pub_no", length));
			String[] lstPodCd = (JSPUtil.getParameter(request, prefix	+ "lst_pod_cd", length));
			String[] raStpPfitUtAmt = (JSPUtil.getParameter(request, prefix	+ "ra_stp_pfit_ut_amt", length));
			String[] dmdtUtAmt = (JSPUtil.getParameter(request, prefix	+ "dmdt_ut_amt", length));
			String[] subTrdCd = (JSPUtil.getParameter(request, prefix	+ "sub_trd_cd", length));
			String[] porCd = (JSPUtil.getParameter(request, prefix	+ "por_cd", length));
			String[] cmUcAmt = (JSPUtil.getParameter(request, prefix	+ "cm_uc_amt", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] oldRlaneCd = (JSPUtil.getParameter(request, prefix	+ "old_rlane_cd", length));
			String[] saqSvcModCd = (JSPUtil.getParameter(request, prefix	+ "saq_svc_mod_cd", length));
			String[] ctrtRhqCd = (JSPUtil.getParameter(request, prefix	+ "ctrt_rhq_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] mtyStvgUcAmt = (JSPUtil.getParameter(request, prefix	+ "mty_stvg_uc_amt", length));
			String[] grsRpbRev = (JSPUtil.getParameter(request, prefix	+ "grs_rpb_rev", length));
			String[] lgsCostAsgnStepCd = (JSPUtil.getParameter(request, prefix	+ "lgs_cost_asgn_step_cd", length));
			String[] dirCd = (JSPUtil.getParameter(request, prefix	+ "dir_cd", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] iocCd = (JSPUtil.getParameter(request, prefix	+ "ioc_cd", length));
			String[] ctrtAqCd = (JSPUtil.getParameter(request, prefix	+ "ctrt_aq_cd", length));
			String[] tmlVolIncntAmt = (JSPUtil.getParameter(request, prefix	+ "tml_vol_incnt_amt", length));
			String[] ctrtRgnOfcCd = (JSPUtil.getParameter(request, prefix	+ "ctrt_rgn_ofc_cd", length));
			String[] oldTrdCd = (JSPUtil.getParameter(request, prefix	+ "old_trd_cd", length));
			String[] custSeq = (JSPUtil.getParameter(request, prefix	+ "cust_seq", length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd", length));
			String[] raCmUcAmt = (JSPUtil.getParameter(request, prefix	+ "ra_cm_uc_amt", length));
			String[] slsRgnOfcCd = (JSPUtil.getParameter(request, prefix	+ "sls_rgn_ofc_cd", length));
			String[] costAsgnStepCd = (JSPUtil.getParameter(request, prefix	+ "cost_asgn_step_cd", length));
			String[] fullStvgUcAmt = (JSPUtil.getParameter(request, prefix	+ "full_stvg_uc_amt", length));
			String[] repSubTrdCd = (JSPUtil.getParameter(request, prefix	+ "rep_sub_trd_cd", length));
			String[] slsFcastNo = (JSPUtil.getParameter(request, prefix	+ "sls_fcast_no", length));
			
			for (int i = 0; i < length; i++) {
				model = new SaqYryFcastVO();
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (oldVvdCd[i] != null)
					model.setOldVvdCd(oldVvdCd[i]);
				if (n1stPolCd[i] != null)
					model.setN1stPolCd(n1stPolCd[i]);
				if (saqMiscRevAmt[i] != null)
					model.setSaqMiscRevAmt(saqMiscRevAmt[i]);
				if (trnkPodCd[i] != null)
					model.setTrnkPodCd(trnkPodCd[i]);
				if (trdCd[i] != null)
					model.setTrdCd(trdCd[i]);
				if (rlaneCd[i] != null)
					model.setRlaneCd(rlaneCd[i]);
				if (repTrdCd[i] != null)
					model.setRepTrdCd(repTrdCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (mtyTrspUcAmt[i] != null)
					model.setMtyTrspUcAmt(mtyTrspUcAmt[i]);
				if (svcModCd[i] != null)
					model.setSvcModCd(svcModCd[i]);
				if (ctrtOfcCd[i] != null)
					model.setCtrtOfcCd(ctrtOfcCd[i]);
				if (slsOfcCd[i] != null)
					model.setSlsOfcCd(slsOfcCd[i]);
				if (cntrFxUcAmt[i] != null)
					model.setCntrFxUcAmt(cntrFxUcAmt[i]);
				if (fcastCntrTpszCd[i] != null)
					model.setFcastCntrTpszCd(fcastCntrTpszCd[i]);
				if (bizActUcAmt[i] != null)
					model.setBizActUcAmt(bizActUcAmt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (custCntCd[i] != null)
					model.setCustCntCd(custCntCd[i]);
				if (fullTrspUcAmt[i] != null)
					model.setFullTrspUcAmt(fullTrspUcAmt[i]);
				if (lodQty[i] != null)
					model.setLodQty(lodQty[i]);
				if (cntrWgt[i] != null)
					model.setCntrWgt(cntrWgt[i]);
				if (custGrpId[i] != null)
					model.setCustGrpId(custGrpId[i]);
				if (raOpfitUcAmt[i] != null)
					model.setRaOpfitUcAmt(raOpfitUcAmt[i]);
				if (slsAqCd[i] != null)
					model.setSlsAqCd(slsAqCd[i]);
				if (opfitUcAmt[i] != null)
					model.setOpfitUcAmt(opfitUcAmt[i]);
				if (delCd[i] != null)
					model.setDelCd(delCd[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (agnCommUtAmt[i] != null)
					model.setAgnCommUtAmt(agnCommUtAmt[i]);
				if (chssFxUcAmt[i] != null)
					model.setChssFxUcAmt(chssFxUcAmt[i]);
				if (slsRhqCd[i] != null)
					model.setSlsRhqCd(slsRhqCd[i]);
				if (trnkPolCd[i] != null)
					model.setTrnkPolCd(trnkPolCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (slsFcastPubNo[i] != null)
					model.setSlsFcastPubNo(slsFcastPubNo[i]);
				if (lstPodCd[i] != null)
					model.setLstPodCd(lstPodCd[i]);
				if (raStpPfitUtAmt[i] != null)
					model.setRaStpPfitUtAmt(raStpPfitUtAmt[i]);
				if (dmdtUtAmt[i] != null)
					model.setDmdtUtAmt(dmdtUtAmt[i]);
				if (subTrdCd[i] != null)
					model.setSubTrdCd(subTrdCd[i]);
				if (porCd[i] != null)
					model.setPorCd(porCd[i]);
				if (cmUcAmt[i] != null)
					model.setCmUcAmt(cmUcAmt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (oldRlaneCd[i] != null)
					model.setOldRlaneCd(oldRlaneCd[i]);
				if (saqSvcModCd[i] != null)
					model.setSaqSvcModCd(saqSvcModCd[i]);
				if (ctrtRhqCd[i] != null)
					model.setCtrtRhqCd(ctrtRhqCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (mtyStvgUcAmt[i] != null)
					model.setMtyStvgUcAmt(mtyStvgUcAmt[i]);
				if (grsRpbRev[i] != null)
					model.setGrsRpbRev(grsRpbRev[i]);
				if (lgsCostAsgnStepCd[i] != null)
					model.setLgsCostAsgnStepCd(lgsCostAsgnStepCd[i]);
				if (dirCd[i] != null)
					model.setDirCd(dirCd[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (iocCd[i] != null)
					model.setIocCd(iocCd[i]);
				if (ctrtAqCd[i] != null)
					model.setCtrtAqCd(ctrtAqCd[i]);
				if (tmlVolIncntAmt[i] != null)
					model.setTmlVolIncntAmt(tmlVolIncntAmt[i]);
				if (ctrtRgnOfcCd[i] != null)
					model.setCtrtRgnOfcCd(ctrtRgnOfcCd[i]);
				if (oldTrdCd[i] != null)
					model.setOldTrdCd(oldTrdCd[i]);
				if (custSeq[i] != null)
					model.setCustSeq(custSeq[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (raCmUcAmt[i] != null)
					model.setRaCmUcAmt(raCmUcAmt[i]);
				if (slsRgnOfcCd[i] != null)
					model.setSlsRgnOfcCd(slsRgnOfcCd[i]);
				if (costAsgnStepCd[i] != null)
					model.setCostAsgnStepCd(costAsgnStepCd[i]);
				if (fullStvgUcAmt[i] != null)
					model.setFullStvgUcAmt(fullStvgUcAmt[i]);
				if (repSubTrdCd[i] != null)
					model.setRepSubTrdCd(repSubTrdCd[i]);
				if (slsFcastNo[i] != null)
					model.setSlsFcastNo(slsFcastNo[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSaqYryFcastVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return SaqYryFcastVO[]
	 */
	public SaqYryFcastVO[] getSaqYryFcastVOs(){
		SaqYryFcastVO[] vos = (SaqYryFcastVO[])models.toArray(new SaqYryFcastVO[models.size()]);
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
		this.oldVvdCd = this.oldVvdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stPolCd = this.n1stPolCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.saqMiscRevAmt = this.saqMiscRevAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trnkPodCd = this.trnkPodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trdCd = this.trdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rlaneCd = this.rlaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.repTrdCd = this.repTrdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mtyTrspUcAmt = this.mtyTrspUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.svcModCd = this.svcModCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ctrtOfcCd = this.ctrtOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slsOfcCd = this.slsOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrFxUcAmt = this.cntrFxUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fcastCntrTpszCd = this.fcastCntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bizActUcAmt = this.bizActUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custCntCd = this.custCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fullTrspUcAmt = this.fullTrspUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lodQty = this.lodQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrWgt = this.cntrWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custGrpId = this.custGrpId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.raOpfitUcAmt = this.raOpfitUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slsAqCd = this.slsAqCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.opfitUcAmt = this.opfitUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.delCd = this.delCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agnCommUtAmt = this.agnCommUtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssFxUcAmt = this.chssFxUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slsRhqCd = this.slsRhqCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trnkPolCd = this.trnkPolCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slsFcastPubNo = this.slsFcastPubNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lstPodCd = this.lstPodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.raStpPfitUtAmt = this.raStpPfitUtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dmdtUtAmt = this.dmdtUtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.subTrdCd = this.subTrdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.porCd = this.porCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cmUcAmt = this.cmUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.oldRlaneCd = this.oldRlaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.saqSvcModCd = this.saqSvcModCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ctrtRhqCd = this.ctrtRhqCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mtyStvgUcAmt = this.mtyStvgUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.grsRpbRev = this.grsRpbRev .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lgsCostAsgnStepCd = this.lgsCostAsgnStepCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dirCd = this.dirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.iocCd = this.iocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ctrtAqCd = this.ctrtAqCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlVolIncntAmt = this.tmlVolIncntAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ctrtRgnOfcCd = this.ctrtRgnOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.oldTrdCd = this.oldTrdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custSeq = this.custSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.raCmUcAmt = this.raCmUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slsRgnOfcCd = this.slsRgnOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costAsgnStepCd = this.costAsgnStepCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fullStvgUcAmt = this.fullStvgUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.repSubTrdCd = this.repSubTrdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slsFcastNo = this.slsFcastNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
