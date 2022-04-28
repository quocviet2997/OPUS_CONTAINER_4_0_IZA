/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : SceExptMstVO.java
*@FileTitle : SceExptMstVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.02
*@LastModifier : 신한성
*@LastVersion : 1.0
* 2009.07.02 신한성 
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
 * @author 신한성
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class SceExptMstVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SceExptMstVO> models = new ArrayList<SceExptMstVO>();
	
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String fmActDt = null;
	/* Column Info */
	private String copExptRsn = null;
	/* Column Info */
	private String initPlnDt = null;
	/* Column Info */
	private String copNo = null;
	/* Column Info */
	private String fmEstmDt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String cneeCntCd = null;
	/* Column Info */
	private String initActDt = null;
	/* Column Info */
	private String vpsPortCd = null;
	/* Column Info */
	private String initEstmDt = null;
	/* Column Info */
	private String polCd = null;
	/* Column Info */
	private String copExptCfmDt = null;
	/* Column Info */
	private String scNo = null;
	/* Column Info */
	private String copExptCfmFlg = null;
	/* Column Info */
	private String occrNodCd = null;
	/* Column Info */
	private String mstBlNo = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String updOfcCd = null;
	/* Column Info */
	private String toActCd = null;
	/* Column Info */
	private String lodgPortCd = null;
	/* Column Info */
	private String ntfyCntCd = null;
	/* Column Info */
	private String trnkVvdCd = null;
	/* Column Info */
	private String shprCntCd = null;
	/* Column Info */
	private String delCd = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String lstBkgDt = null;
	/* Column Info */
	private String podCd = null;
	/* Column Info */
	private String fmActCd = null;
	/* Column Info */
	private String fmUpdDt = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String toEstmDt = null;
	/* Column Info */
	private String copExptCfmUsrId = null;
	/* Column Info */
	private String exptCd = null;
	/* Column Info */
	private String shprSeq = null;
	/* Column Info */
	private String porCd = null;
	/* Column Info */
	private String exptClrTpCd = null;
	/* Column Info */
	private String ntfdFlg = null;
	/* Column Info */
	private String ntfySeq = null;
	/* Column Info */
	private String copGrpSeq = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String bkgRcvTermCd = null;
	/* Column Info */
	private String copExptRsnCd = null;
	/* Column Info */
	private String actStsMapgCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String copExptNo = null;
	/* Column Info */
	private String creOfcCd = null;
	/* Column Info */
	private String copExptTpCd = null;
	/* Column Info */
	private String toUpdDt = null;
	/* Column Info */
	private String toActDt = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String copExptTpDtlCd = null;
	/* Column Info */
	private String exptRsolvDt = null;
	/* Column Info */
	private String occrDt = null;
	/* Column Info */
	private String copDtlSeq = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Column Info */
	private String cneeSeq = null;
	/* Column Info */
	private String cntrNo = null;
	/* Column Info */
	private String clptIndSeq = null;
	/* Column Info */
	private String bkgDeTermCd = null;
	/* Column Info */
	private String copExptStsCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public SceExptMstVO() {}

	public SceExptMstVO(String ibflag, String pagerows, String copExptNo, String copExptTpCd, String copExptTpDtlCd, String initPlnDt, String initEstmDt, String initActDt, String occrDt, String occrNodCd, String creOfcCd, String updOfcCd, String copExptStsCd, String vslCd, String skdVoyNo, String skdDirCd, String vpsPortCd, String actStsMapgCd, String clptIndSeq, String exptRsolvDt, String exptClrTpCd, String copExptRsnCd, String copExptCfmFlg, String copExptCfmUsrId, String copExptCfmDt, String copGrpSeq, String copDtlSeq, String bkgNo, String cntrNo, String bkgRcvTermCd, String bkgDeTermCd, String shprCntCd, String shprSeq, String cneeCntCd, String cneeSeq, String ntfyCntCd, String ntfySeq, String porCd, String polCd, String podCd, String delCd, String trnkVvdCd, String lodgPortCd, String lstBkgDt, String fmActCd, String fmEstmDt, String fmActDt, String fmUpdDt, String toActCd, String toEstmDt, String toActDt, String toUpdDt, String mstBlNo, String scNo, String ntfdFlg, String exptCd, String copExptRsn, String copNo, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.vslCd = vslCd;
		this.fmActDt = fmActDt;
		this.copExptRsn = copExptRsn;
		this.initPlnDt = initPlnDt;
		this.copNo = copNo;
		this.fmEstmDt = fmEstmDt;
		this.pagerows = pagerows;
		this.cneeCntCd = cneeCntCd;
		this.initActDt = initActDt;
		this.vpsPortCd = vpsPortCd;
		this.initEstmDt = initEstmDt;
		this.polCd = polCd;
		this.copExptCfmDt = copExptCfmDt;
		this.scNo = scNo;
		this.copExptCfmFlg = copExptCfmFlg;
		this.occrNodCd = occrNodCd;
		this.mstBlNo = mstBlNo;
		this.updUsrId = updUsrId;
		this.updOfcCd = updOfcCd;
		this.toActCd = toActCd;
		this.lodgPortCd = lodgPortCd;
		this.ntfyCntCd = ntfyCntCd;
		this.trnkVvdCd = trnkVvdCd;
		this.shprCntCd = shprCntCd;
		this.delCd = delCd;
		this.skdVoyNo = skdVoyNo;
		this.lstBkgDt = lstBkgDt;
		this.podCd = podCd;
		this.fmActCd = fmActCd;
		this.fmUpdDt = fmUpdDt;
		this.creUsrId = creUsrId;
		this.bkgNo = bkgNo;
		this.toEstmDt = toEstmDt;
		this.copExptCfmUsrId = copExptCfmUsrId;
		this.exptCd = exptCd;
		this.shprSeq = shprSeq;
		this.porCd = porCd;
		this.exptClrTpCd = exptClrTpCd;
		this.ntfdFlg = ntfdFlg;
		this.ntfySeq = ntfySeq;
		this.copGrpSeq = copGrpSeq;
		this.creDt = creDt;
		this.bkgRcvTermCd = bkgRcvTermCd;
		this.copExptRsnCd = copExptRsnCd;
		this.actStsMapgCd = actStsMapgCd;
		this.ibflag = ibflag;
		this.copExptNo = copExptNo;
		this.creOfcCd = creOfcCd;
		this.copExptTpCd = copExptTpCd;
		this.toUpdDt = toUpdDt;
		this.toActDt = toActDt;
		this.updDt = updDt;
		this.copExptTpDtlCd = copExptTpDtlCd;
		this.exptRsolvDt = exptRsolvDt;
		this.occrDt = occrDt;
		this.copDtlSeq = copDtlSeq;
		this.skdDirCd = skdDirCd;
		this.cneeSeq = cneeSeq;
		this.cntrNo = cntrNo;
		this.clptIndSeq = clptIndSeq;
		this.bkgDeTermCd = bkgDeTermCd;
		this.copExptStsCd = copExptStsCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("fm_act_dt", getFmActDt());
		this.hashColumns.put("cop_expt_rsn", getCopExptRsn());
		this.hashColumns.put("init_pln_dt", getInitPlnDt());
		this.hashColumns.put("cop_no", getCopNo());
		this.hashColumns.put("fm_estm_dt", getFmEstmDt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("cnee_cnt_cd", getCneeCntCd());
		this.hashColumns.put("init_act_dt", getInitActDt());
		this.hashColumns.put("vps_port_cd", getVpsPortCd());
		this.hashColumns.put("init_estm_dt", getInitEstmDt());
		this.hashColumns.put("pol_cd", getPolCd());
		this.hashColumns.put("cop_expt_cfm_dt", getCopExptCfmDt());
		this.hashColumns.put("sc_no", getScNo());
		this.hashColumns.put("cop_expt_cfm_flg", getCopExptCfmFlg());
		this.hashColumns.put("occr_nod_cd", getOccrNodCd());
		this.hashColumns.put("mst_bl_no", getMstBlNo());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_ofc_cd", getUpdOfcCd());
		this.hashColumns.put("to_act_cd", getToActCd());
		this.hashColumns.put("lodg_port_cd", getLodgPortCd());
		this.hashColumns.put("ntfy_cnt_cd", getNtfyCntCd());
		this.hashColumns.put("trnk_vvd_cd", getTrnkVvdCd());
		this.hashColumns.put("shpr_cnt_cd", getShprCntCd());
		this.hashColumns.put("del_cd", getDelCd());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("lst_bkg_dt", getLstBkgDt());
		this.hashColumns.put("pod_cd", getPodCd());
		this.hashColumns.put("fm_act_cd", getFmActCd());
		this.hashColumns.put("fm_upd_dt", getFmUpdDt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("to_estm_dt", getToEstmDt());
		this.hashColumns.put("cop_expt_cfm_usr_id", getCopExptCfmUsrId());
		this.hashColumns.put("expt_cd", getExptCd());
		this.hashColumns.put("shpr_seq", getShprSeq());
		this.hashColumns.put("por_cd", getPorCd());
		this.hashColumns.put("expt_clr_tp_cd", getExptClrTpCd());
		this.hashColumns.put("ntfd_flg", getNtfdFlg());
		this.hashColumns.put("ntfy_seq", getNtfySeq());
		this.hashColumns.put("cop_grp_seq", getCopGrpSeq());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("bkg_rcv_term_cd", getBkgRcvTermCd());
		this.hashColumns.put("cop_expt_rsn_cd", getCopExptRsnCd());
		this.hashColumns.put("act_sts_mapg_cd", getActStsMapgCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cop_expt_no", getCopExptNo());
		this.hashColumns.put("cre_ofc_cd", getCreOfcCd());
		this.hashColumns.put("cop_expt_tp_cd", getCopExptTpCd());
		this.hashColumns.put("to_upd_dt", getToUpdDt());
		this.hashColumns.put("to_act_dt", getToActDt());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cop_expt_tp_dtl_cd", getCopExptTpDtlCd());
		this.hashColumns.put("expt_rsolv_dt", getExptRsolvDt());
		this.hashColumns.put("occr_dt", getOccrDt());
		this.hashColumns.put("cop_dtl_seq", getCopDtlSeq());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("cnee_seq", getCneeSeq());
		this.hashColumns.put("cntr_no", getCntrNo());
		this.hashColumns.put("clpt_ind_seq", getClptIndSeq());
		this.hashColumns.put("bkg_de_term_cd", getBkgDeTermCd());
		this.hashColumns.put("cop_expt_sts_cd", getCopExptStsCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("fm_act_dt", "fmActDt");
		this.hashFields.put("cop_expt_rsn", "copExptRsn");
		this.hashFields.put("init_pln_dt", "initPlnDt");
		this.hashFields.put("cop_no", "copNo");
		this.hashFields.put("fm_estm_dt", "fmEstmDt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("cnee_cnt_cd", "cneeCntCd");
		this.hashFields.put("init_act_dt", "initActDt");
		this.hashFields.put("vps_port_cd", "vpsPortCd");
		this.hashFields.put("init_estm_dt", "initEstmDt");
		this.hashFields.put("pol_cd", "polCd");
		this.hashFields.put("cop_expt_cfm_dt", "copExptCfmDt");
		this.hashFields.put("sc_no", "scNo");
		this.hashFields.put("cop_expt_cfm_flg", "copExptCfmFlg");
		this.hashFields.put("occr_nod_cd", "occrNodCd");
		this.hashFields.put("mst_bl_no", "mstBlNo");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_ofc_cd", "updOfcCd");
		this.hashFields.put("to_act_cd", "toActCd");
		this.hashFields.put("lodg_port_cd", "lodgPortCd");
		this.hashFields.put("ntfy_cnt_cd", "ntfyCntCd");
		this.hashFields.put("trnk_vvd_cd", "trnkVvdCd");
		this.hashFields.put("shpr_cnt_cd", "shprCntCd");
		this.hashFields.put("del_cd", "delCd");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("lst_bkg_dt", "lstBkgDt");
		this.hashFields.put("pod_cd", "podCd");
		this.hashFields.put("fm_act_cd", "fmActCd");
		this.hashFields.put("fm_upd_dt", "fmUpdDt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("to_estm_dt", "toEstmDt");
		this.hashFields.put("cop_expt_cfm_usr_id", "copExptCfmUsrId");
		this.hashFields.put("expt_cd", "exptCd");
		this.hashFields.put("shpr_seq", "shprSeq");
		this.hashFields.put("por_cd", "porCd");
		this.hashFields.put("expt_clr_tp_cd", "exptClrTpCd");
		this.hashFields.put("ntfd_flg", "ntfdFlg");
		this.hashFields.put("ntfy_seq", "ntfySeq");
		this.hashFields.put("cop_grp_seq", "copGrpSeq");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("bkg_rcv_term_cd", "bkgRcvTermCd");
		this.hashFields.put("cop_expt_rsn_cd", "copExptRsnCd");
		this.hashFields.put("act_sts_mapg_cd", "actStsMapgCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cop_expt_no", "copExptNo");
		this.hashFields.put("cre_ofc_cd", "creOfcCd");
		this.hashFields.put("cop_expt_tp_cd", "copExptTpCd");
		this.hashFields.put("to_upd_dt", "toUpdDt");
		this.hashFields.put("to_act_dt", "toActDt");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cop_expt_tp_dtl_cd", "copExptTpDtlCd");
		this.hashFields.put("expt_rsolv_dt", "exptRsolvDt");
		this.hashFields.put("occr_dt", "occrDt");
		this.hashFields.put("cop_dtl_seq", "copDtlSeq");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("cnee_seq", "cneeSeq");
		this.hashFields.put("cntr_no", "cntrNo");
		this.hashFields.put("clpt_ind_seq", "clptIndSeq");
		this.hashFields.put("bkg_de_term_cd", "bkgDeTermCd");
		this.hashFields.put("cop_expt_sts_cd", "copExptStsCd");
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
	 * @return fmActDt
	 */
	public String getFmActDt() {
		return this.fmActDt;
	}
	
	/**
	 * Column Info
	 * @return copExptRsn
	 */
	public String getCopExptRsn() {
		return this.copExptRsn;
	}
	
	/**
	 * Column Info
	 * @return initPlnDt
	 */
	public String getInitPlnDt() {
		return this.initPlnDt;
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
	 * @return fmEstmDt
	 */
	public String getFmEstmDt() {
		return this.fmEstmDt;
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
	 * @return cneeCntCd
	 */
	public String getCneeCntCd() {
		return this.cneeCntCd;
	}
	
	/**
	 * Column Info
	 * @return initActDt
	 */
	public String getInitActDt() {
		return this.initActDt;
	}
	
	/**
	 * Column Info
	 * @return vpsPortCd
	 */
	public String getVpsPortCd() {
		return this.vpsPortCd;
	}
	
	/**
	 * Column Info
	 * @return initEstmDt
	 */
	public String getInitEstmDt() {
		return this.initEstmDt;
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
	 * @return copExptCfmDt
	 */
	public String getCopExptCfmDt() {
		return this.copExptCfmDt;
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
	 * @return copExptCfmFlg
	 */
	public String getCopExptCfmFlg() {
		return this.copExptCfmFlg;
	}
	
	/**
	 * Column Info
	 * @return occrNodCd
	 */
	public String getOccrNodCd() {
		return this.occrNodCd;
	}
	
	/**
	 * Column Info
	 * @return mstBlNo
	 */
	public String getMstBlNo() {
		return this.mstBlNo;
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
	 * @return updOfcCd
	 */
	public String getUpdOfcCd() {
		return this.updOfcCd;
	}
	
	/**
	 * Column Info
	 * @return toActCd
	 */
	public String getToActCd() {
		return this.toActCd;
	}
	
	/**
	 * Column Info
	 * @return lodgPortCd
	 */
	public String getLodgPortCd() {
		return this.lodgPortCd;
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
	 * @return trnkVvdCd
	 */
	public String getTrnkVvdCd() {
		return this.trnkVvdCd;
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
	 * @return lstBkgDt
	 */
	public String getLstBkgDt() {
		return this.lstBkgDt;
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
	 * @return fmActCd
	 */
	public String getFmActCd() {
		return this.fmActCd;
	}
	
	/**
	 * Column Info
	 * @return fmUpdDt
	 */
	public String getFmUpdDt() {
		return this.fmUpdDt;
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
	 * @return toEstmDt
	 */
	public String getToEstmDt() {
		return this.toEstmDt;
	}
	
	/**
	 * Column Info
	 * @return copExptCfmUsrId
	 */
	public String getCopExptCfmUsrId() {
		return this.copExptCfmUsrId;
	}
	
	/**
	 * Column Info
	 * @return exptCd
	 */
	public String getExptCd() {
		return this.exptCd;
	}
	
	/**
	 * Column Info
	 * @return shprSeq
	 */
	public String getShprSeq() {
		return this.shprSeq;
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
	 * @return exptClrTpCd
	 */
	public String getExptClrTpCd() {
		return this.exptClrTpCd;
	}
	
	/**
	 * Column Info
	 * @return ntfdFlg
	 */
	public String getNtfdFlg() {
		return this.ntfdFlg;
	}
	
	/**
	 * Column Info
	 * @return ntfySeq
	 */
	public String getNtfySeq() {
		return this.ntfySeq;
	}
	
	/**
	 * Column Info
	 * @return copGrpSeq
	 */
	public String getCopGrpSeq() {
		return this.copGrpSeq;
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
	 * @return bkgRcvTermCd
	 */
	public String getBkgRcvTermCd() {
		return this.bkgRcvTermCd;
	}
	
	/**
	 * Column Info
	 * @return copExptRsnCd
	 */
	public String getCopExptRsnCd() {
		return this.copExptRsnCd;
	}
	
	/**
	 * Column Info
	 * @return actStsMapgCd
	 */
	public String getActStsMapgCd() {
		return this.actStsMapgCd;
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
	 * @return copExptNo
	 */
	public String getCopExptNo() {
		return this.copExptNo;
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
	 * @return copExptTpCd
	 */
	public String getCopExptTpCd() {
		return this.copExptTpCd;
	}
	
	/**
	 * Column Info
	 * @return toUpdDt
	 */
	public String getToUpdDt() {
		return this.toUpdDt;
	}
	
	/**
	 * Column Info
	 * @return toActDt
	 */
	public String getToActDt() {
		return this.toActDt;
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
	 * @return copExptTpDtlCd
	 */
	public String getCopExptTpDtlCd() {
		return this.copExptTpDtlCd;
	}
	
	/**
	 * Column Info
	 * @return exptRsolvDt
	 */
	public String getExptRsolvDt() {
		return this.exptRsolvDt;
	}
	
	/**
	 * Column Info
	 * @return occrDt
	 */
	public String getOccrDt() {
		return this.occrDt;
	}
	
	/**
	 * Column Info
	 * @return copDtlSeq
	 */
	public String getCopDtlSeq() {
		return this.copDtlSeq;
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
	 * @return cneeSeq
	 */
	public String getCneeSeq() {
		return this.cneeSeq;
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
	 * @return clptIndSeq
	 */
	public String getClptIndSeq() {
		return this.clptIndSeq;
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
	 * @return copExptStsCd
	 */
	public String getCopExptStsCd() {
		return this.copExptStsCd;
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
	 * @param fmActDt
	 */
	public void setFmActDt(String fmActDt) {
		this.fmActDt = fmActDt;
	}
	
	/**
	 * Column Info
	 * @param copExptRsn
	 */
	public void setCopExptRsn(String copExptRsn) {
		this.copExptRsn = copExptRsn;
	}
	
	/**
	 * Column Info
	 * @param initPlnDt
	 */
	public void setInitPlnDt(String initPlnDt) {
		this.initPlnDt = initPlnDt;
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
	 * @param fmEstmDt
	 */
	public void setFmEstmDt(String fmEstmDt) {
		this.fmEstmDt = fmEstmDt;
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
	 * @param cneeCntCd
	 */
	public void setCneeCntCd(String cneeCntCd) {
		this.cneeCntCd = cneeCntCd;
	}
	
	/**
	 * Column Info
	 * @param initActDt
	 */
	public void setInitActDt(String initActDt) {
		this.initActDt = initActDt;
	}
	
	/**
	 * Column Info
	 * @param vpsPortCd
	 */
	public void setVpsPortCd(String vpsPortCd) {
		this.vpsPortCd = vpsPortCd;
	}
	
	/**
	 * Column Info
	 * @param initEstmDt
	 */
	public void setInitEstmDt(String initEstmDt) {
		this.initEstmDt = initEstmDt;
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
	 * @param copExptCfmDt
	 */
	public void setCopExptCfmDt(String copExptCfmDt) {
		this.copExptCfmDt = copExptCfmDt;
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
	 * @param copExptCfmFlg
	 */
	public void setCopExptCfmFlg(String copExptCfmFlg) {
		this.copExptCfmFlg = copExptCfmFlg;
	}
	
	/**
	 * Column Info
	 * @param occrNodCd
	 */
	public void setOccrNodCd(String occrNodCd) {
		this.occrNodCd = occrNodCd;
	}
	
	/**
	 * Column Info
	 * @param mstBlNo
	 */
	public void setMstBlNo(String mstBlNo) {
		this.mstBlNo = mstBlNo;
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
	 * @param updOfcCd
	 */
	public void setUpdOfcCd(String updOfcCd) {
		this.updOfcCd = updOfcCd;
	}
	
	/**
	 * Column Info
	 * @param toActCd
	 */
	public void setToActCd(String toActCd) {
		this.toActCd = toActCd;
	}
	
	/**
	 * Column Info
	 * @param lodgPortCd
	 */
	public void setLodgPortCd(String lodgPortCd) {
		this.lodgPortCd = lodgPortCd;
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
	 * @param trnkVvdCd
	 */
	public void setTrnkVvdCd(String trnkVvdCd) {
		this.trnkVvdCd = trnkVvdCd;
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
	 * @param lstBkgDt
	 */
	public void setLstBkgDt(String lstBkgDt) {
		this.lstBkgDt = lstBkgDt;
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
	 * @param fmActCd
	 */
	public void setFmActCd(String fmActCd) {
		this.fmActCd = fmActCd;
	}
	
	/**
	 * Column Info
	 * @param fmUpdDt
	 */
	public void setFmUpdDt(String fmUpdDt) {
		this.fmUpdDt = fmUpdDt;
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
	 * @param toEstmDt
	 */
	public void setToEstmDt(String toEstmDt) {
		this.toEstmDt = toEstmDt;
	}
	
	/**
	 * Column Info
	 * @param copExptCfmUsrId
	 */
	public void setCopExptCfmUsrId(String copExptCfmUsrId) {
		this.copExptCfmUsrId = copExptCfmUsrId;
	}
	
	/**
	 * Column Info
	 * @param exptCd
	 */
	public void setExptCd(String exptCd) {
		this.exptCd = exptCd;
	}
	
	/**
	 * Column Info
	 * @param shprSeq
	 */
	public void setShprSeq(String shprSeq) {
		this.shprSeq = shprSeq;
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
	 * @param exptClrTpCd
	 */
	public void setExptClrTpCd(String exptClrTpCd) {
		this.exptClrTpCd = exptClrTpCd;
	}
	
	/**
	 * Column Info
	 * @param ntfdFlg
	 */
	public void setNtfdFlg(String ntfdFlg) {
		this.ntfdFlg = ntfdFlg;
	}
	
	/**
	 * Column Info
	 * @param ntfySeq
	 */
	public void setNtfySeq(String ntfySeq) {
		this.ntfySeq = ntfySeq;
	}
	
	/**
	 * Column Info
	 * @param copGrpSeq
	 */
	public void setCopGrpSeq(String copGrpSeq) {
		this.copGrpSeq = copGrpSeq;
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
	 * @param bkgRcvTermCd
	 */
	public void setBkgRcvTermCd(String bkgRcvTermCd) {
		this.bkgRcvTermCd = bkgRcvTermCd;
	}
	
	/**
	 * Column Info
	 * @param copExptRsnCd
	 */
	public void setCopExptRsnCd(String copExptRsnCd) {
		this.copExptRsnCd = copExptRsnCd;
	}
	
	/**
	 * Column Info
	 * @param actStsMapgCd
	 */
	public void setActStsMapgCd(String actStsMapgCd) {
		this.actStsMapgCd = actStsMapgCd;
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
	 * @param copExptNo
	 */
	public void setCopExptNo(String copExptNo) {
		this.copExptNo = copExptNo;
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
	 * @param copExptTpCd
	 */
	public void setCopExptTpCd(String copExptTpCd) {
		this.copExptTpCd = copExptTpCd;
	}
	
	/**
	 * Column Info
	 * @param toUpdDt
	 */
	public void setToUpdDt(String toUpdDt) {
		this.toUpdDt = toUpdDt;
	}
	
	/**
	 * Column Info
	 * @param toActDt
	 */
	public void setToActDt(String toActDt) {
		this.toActDt = toActDt;
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
	 * @param copExptTpDtlCd
	 */
	public void setCopExptTpDtlCd(String copExptTpDtlCd) {
		this.copExptTpDtlCd = copExptTpDtlCd;
	}
	
	/**
	 * Column Info
	 * @param exptRsolvDt
	 */
	public void setExptRsolvDt(String exptRsolvDt) {
		this.exptRsolvDt = exptRsolvDt;
	}
	
	/**
	 * Column Info
	 * @param occrDt
	 */
	public void setOccrDt(String occrDt) {
		this.occrDt = occrDt;
	}
	
	/**
	 * Column Info
	 * @param copDtlSeq
	 */
	public void setCopDtlSeq(String copDtlSeq) {
		this.copDtlSeq = copDtlSeq;
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
	 * @param cneeSeq
	 */
	public void setCneeSeq(String cneeSeq) {
		this.cneeSeq = cneeSeq;
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
	 * @param clptIndSeq
	 */
	public void setClptIndSeq(String clptIndSeq) {
		this.clptIndSeq = clptIndSeq;
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
	 * @param copExptStsCd
	 */
	public void setCopExptStsCd(String copExptStsCd) {
		this.copExptStsCd = copExptStsCd;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setFmActDt(JSPUtil.getParameter(request, "fm_act_dt", ""));
		setCopExptRsn(JSPUtil.getParameter(request, "cop_expt_rsn", ""));
		setInitPlnDt(JSPUtil.getParameter(request, "init_pln_dt", ""));
		setCopNo(JSPUtil.getParameter(request, "cop_no", ""));
		setFmEstmDt(JSPUtil.getParameter(request, "fm_estm_dt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setCneeCntCd(JSPUtil.getParameter(request, "cnee_cnt_cd", ""));
		setInitActDt(JSPUtil.getParameter(request, "init_act_dt", ""));
		setVpsPortCd(JSPUtil.getParameter(request, "vps_port_cd", ""));
		setInitEstmDt(JSPUtil.getParameter(request, "init_estm_dt", ""));
		setPolCd(JSPUtil.getParameter(request, "pol_cd", ""));
		setCopExptCfmDt(JSPUtil.getParameter(request, "cop_expt_cfm_dt", ""));
		setScNo(JSPUtil.getParameter(request, "sc_no", ""));
		setCopExptCfmFlg(JSPUtil.getParameter(request, "cop_expt_cfm_flg", ""));
		setOccrNodCd(JSPUtil.getParameter(request, "occr_nod_cd", ""));
		setMstBlNo(JSPUtil.getParameter(request, "mst_bl_no", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setUpdOfcCd(JSPUtil.getParameter(request, "upd_ofc_cd", ""));
		setToActCd(JSPUtil.getParameter(request, "to_act_cd", ""));
		setLodgPortCd(JSPUtil.getParameter(request, "lodg_port_cd", ""));
		setNtfyCntCd(JSPUtil.getParameter(request, "ntfy_cnt_cd", ""));
		setTrnkVvdCd(JSPUtil.getParameter(request, "trnk_vvd_cd", ""));
		setShprCntCd(JSPUtil.getParameter(request, "shpr_cnt_cd", ""));
		setDelCd(JSPUtil.getParameter(request, "del_cd", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, "skd_voy_no", ""));
		setLstBkgDt(JSPUtil.getParameter(request, "lst_bkg_dt", ""));
		setPodCd(JSPUtil.getParameter(request, "pod_cd", ""));
		setFmActCd(JSPUtil.getParameter(request, "fm_act_cd", ""));
		setFmUpdDt(JSPUtil.getParameter(request, "fm_upd_dt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setToEstmDt(JSPUtil.getParameter(request, "to_estm_dt", ""));
		setCopExptCfmUsrId(JSPUtil.getParameter(request, "cop_expt_cfm_usr_id", ""));
		setExptCd(JSPUtil.getParameter(request, "expt_cd", ""));
		setShprSeq(JSPUtil.getParameter(request, "shpr_seq", ""));
		setPorCd(JSPUtil.getParameter(request, "por_cd", ""));
		setExptClrTpCd(JSPUtil.getParameter(request, "expt_clr_tp_cd", ""));
		setNtfdFlg(JSPUtil.getParameter(request, "ntfd_flg", ""));
		setNtfySeq(JSPUtil.getParameter(request, "ntfy_seq", ""));
		setCopGrpSeq(JSPUtil.getParameter(request, "cop_grp_seq", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setBkgRcvTermCd(JSPUtil.getParameter(request, "bkg_rcv_term_cd", ""));
		setCopExptRsnCd(JSPUtil.getParameter(request, "cop_expt_rsn_cd", ""));
		setActStsMapgCd(JSPUtil.getParameter(request, "act_sts_mapg_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCopExptNo(JSPUtil.getParameter(request, "cop_expt_no", ""));
		setCreOfcCd(JSPUtil.getParameter(request, "cre_ofc_cd", ""));
		setCopExptTpCd(JSPUtil.getParameter(request, "cop_expt_tp_cd", ""));
		setToUpdDt(JSPUtil.getParameter(request, "to_upd_dt", ""));
		setToActDt(JSPUtil.getParameter(request, "to_act_dt", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCopExptTpDtlCd(JSPUtil.getParameter(request, "cop_expt_tp_dtl_cd", ""));
		setExptRsolvDt(JSPUtil.getParameter(request, "expt_rsolv_dt", ""));
		setOccrDt(JSPUtil.getParameter(request, "occr_dt", ""));
		setCopDtlSeq(JSPUtil.getParameter(request, "cop_dtl_seq", ""));
		setSkdDirCd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
		setCneeSeq(JSPUtil.getParameter(request, "cnee_seq", ""));
		setCntrNo(JSPUtil.getParameter(request, "cntr_no", ""));
		setClptIndSeq(JSPUtil.getParameter(request, "clpt_ind_seq", ""));
		setBkgDeTermCd(JSPUtil.getParameter(request, "bkg_de_term_cd", ""));
		setCopExptStsCd(JSPUtil.getParameter(request, "cop_expt_sts_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return SceExptMstVO[]
	 */
	public SceExptMstVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SceExptMstVO[]
	 */
	public SceExptMstVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SceExptMstVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] fmActDt = (JSPUtil.getParameter(request, prefix	+ "fm_act_dt", length));
			String[] copExptRsn = (JSPUtil.getParameter(request, prefix	+ "cop_expt_rsn", length));
			String[] initPlnDt = (JSPUtil.getParameter(request, prefix	+ "init_pln_dt", length));
			String[] copNo = (JSPUtil.getParameter(request, prefix	+ "cop_no", length));
			String[] fmEstmDt = (JSPUtil.getParameter(request, prefix	+ "fm_estm_dt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] cneeCntCd = (JSPUtil.getParameter(request, prefix	+ "cnee_cnt_cd", length));
			String[] initActDt = (JSPUtil.getParameter(request, prefix	+ "init_act_dt", length));
			String[] vpsPortCd = (JSPUtil.getParameter(request, prefix	+ "vps_port_cd", length));
			String[] initEstmDt = (JSPUtil.getParameter(request, prefix	+ "init_estm_dt", length));
			String[] polCd = (JSPUtil.getParameter(request, prefix	+ "pol_cd", length));
			String[] copExptCfmDt = (JSPUtil.getParameter(request, prefix	+ "cop_expt_cfm_dt", length));
			String[] scNo = (JSPUtil.getParameter(request, prefix	+ "sc_no", length));
			String[] copExptCfmFlg = (JSPUtil.getParameter(request, prefix	+ "cop_expt_cfm_flg", length));
			String[] occrNodCd = (JSPUtil.getParameter(request, prefix	+ "occr_nod_cd", length));
			String[] mstBlNo = (JSPUtil.getParameter(request, prefix	+ "mst_bl_no", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] updOfcCd = (JSPUtil.getParameter(request, prefix	+ "upd_ofc_cd", length));
			String[] toActCd = (JSPUtil.getParameter(request, prefix	+ "to_act_cd", length));
			String[] lodgPortCd = (JSPUtil.getParameter(request, prefix	+ "lodg_port_cd", length));
			String[] ntfyCntCd = (JSPUtil.getParameter(request, prefix	+ "ntfy_cnt_cd", length));
			String[] trnkVvdCd = (JSPUtil.getParameter(request, prefix	+ "trnk_vvd_cd", length));
			String[] shprCntCd = (JSPUtil.getParameter(request, prefix	+ "shpr_cnt_cd", length));
			String[] delCd = (JSPUtil.getParameter(request, prefix	+ "del_cd", length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no", length));
			String[] lstBkgDt = (JSPUtil.getParameter(request, prefix	+ "lst_bkg_dt", length));
			String[] podCd = (JSPUtil.getParameter(request, prefix	+ "pod_cd", length));
			String[] fmActCd = (JSPUtil.getParameter(request, prefix	+ "fm_act_cd", length));
			String[] fmUpdDt = (JSPUtil.getParameter(request, prefix	+ "fm_upd_dt", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] toEstmDt = (JSPUtil.getParameter(request, prefix	+ "to_estm_dt", length));
			String[] copExptCfmUsrId = (JSPUtil.getParameter(request, prefix	+ "cop_expt_cfm_usr_id", length));
			String[] exptCd = (JSPUtil.getParameter(request, prefix	+ "expt_cd", length));
			String[] shprSeq = (JSPUtil.getParameter(request, prefix	+ "shpr_seq", length));
			String[] porCd = (JSPUtil.getParameter(request, prefix	+ "por_cd", length));
			String[] exptClrTpCd = (JSPUtil.getParameter(request, prefix	+ "expt_clr_tp_cd", length));
			String[] ntfdFlg = (JSPUtil.getParameter(request, prefix	+ "ntfd_flg", length));
			String[] ntfySeq = (JSPUtil.getParameter(request, prefix	+ "ntfy_seq", length));
			String[] copGrpSeq = (JSPUtil.getParameter(request, prefix	+ "cop_grp_seq", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] bkgRcvTermCd = (JSPUtil.getParameter(request, prefix	+ "bkg_rcv_term_cd", length));
			String[] copExptRsnCd = (JSPUtil.getParameter(request, prefix	+ "cop_expt_rsn_cd", length));
			String[] actStsMapgCd = (JSPUtil.getParameter(request, prefix	+ "act_sts_mapg_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] copExptNo = (JSPUtil.getParameter(request, prefix	+ "cop_expt_no", length));
			String[] creOfcCd = (JSPUtil.getParameter(request, prefix	+ "cre_ofc_cd", length));
			String[] copExptTpCd = (JSPUtil.getParameter(request, prefix	+ "cop_expt_tp_cd", length));
			String[] toUpdDt = (JSPUtil.getParameter(request, prefix	+ "to_upd_dt", length));
			String[] toActDt = (JSPUtil.getParameter(request, prefix	+ "to_act_dt", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] copExptTpDtlCd = (JSPUtil.getParameter(request, prefix	+ "cop_expt_tp_dtl_cd", length));
			String[] exptRsolvDt = (JSPUtil.getParameter(request, prefix	+ "expt_rsolv_dt", length));
			String[] occrDt = (JSPUtil.getParameter(request, prefix	+ "occr_dt", length));
			String[] copDtlSeq = (JSPUtil.getParameter(request, prefix	+ "cop_dtl_seq", length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd", length));
			String[] cneeSeq = (JSPUtil.getParameter(request, prefix	+ "cnee_seq", length));
			String[] cntrNo = (JSPUtil.getParameter(request, prefix	+ "cntr_no", length));
			String[] clptIndSeq = (JSPUtil.getParameter(request, prefix	+ "clpt_ind_seq", length));
			String[] bkgDeTermCd = (JSPUtil.getParameter(request, prefix	+ "bkg_de_term_cd", length));
			String[] copExptStsCd = (JSPUtil.getParameter(request, prefix	+ "cop_expt_sts_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new SceExptMstVO();
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (fmActDt[i] != null)
					model.setFmActDt(fmActDt[i]);
				if (copExptRsn[i] != null)
					model.setCopExptRsn(copExptRsn[i]);
				if (initPlnDt[i] != null)
					model.setInitPlnDt(initPlnDt[i]);
				if (copNo[i] != null)
					model.setCopNo(copNo[i]);
				if (fmEstmDt[i] != null)
					model.setFmEstmDt(fmEstmDt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (cneeCntCd[i] != null)
					model.setCneeCntCd(cneeCntCd[i]);
				if (initActDt[i] != null)
					model.setInitActDt(initActDt[i]);
				if (vpsPortCd[i] != null)
					model.setVpsPortCd(vpsPortCd[i]);
				if (initEstmDt[i] != null)
					model.setInitEstmDt(initEstmDt[i]);
				if (polCd[i] != null)
					model.setPolCd(polCd[i]);
				if (copExptCfmDt[i] != null)
					model.setCopExptCfmDt(copExptCfmDt[i]);
				if (scNo[i] != null)
					model.setScNo(scNo[i]);
				if (copExptCfmFlg[i] != null)
					model.setCopExptCfmFlg(copExptCfmFlg[i]);
				if (occrNodCd[i] != null)
					model.setOccrNodCd(occrNodCd[i]);
				if (mstBlNo[i] != null)
					model.setMstBlNo(mstBlNo[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (updOfcCd[i] != null)
					model.setUpdOfcCd(updOfcCd[i]);
				if (toActCd[i] != null)
					model.setToActCd(toActCd[i]);
				if (lodgPortCd[i] != null)
					model.setLodgPortCd(lodgPortCd[i]);
				if (ntfyCntCd[i] != null)
					model.setNtfyCntCd(ntfyCntCd[i]);
				if (trnkVvdCd[i] != null)
					model.setTrnkVvdCd(trnkVvdCd[i]);
				if (shprCntCd[i] != null)
					model.setShprCntCd(shprCntCd[i]);
				if (delCd[i] != null)
					model.setDelCd(delCd[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (lstBkgDt[i] != null)
					model.setLstBkgDt(lstBkgDt[i]);
				if (podCd[i] != null)
					model.setPodCd(podCd[i]);
				if (fmActCd[i] != null)
					model.setFmActCd(fmActCd[i]);
				if (fmUpdDt[i] != null)
					model.setFmUpdDt(fmUpdDt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (toEstmDt[i] != null)
					model.setToEstmDt(toEstmDt[i]);
				if (copExptCfmUsrId[i] != null)
					model.setCopExptCfmUsrId(copExptCfmUsrId[i]);
				if (exptCd[i] != null)
					model.setExptCd(exptCd[i]);
				if (shprSeq[i] != null)
					model.setShprSeq(shprSeq[i]);
				if (porCd[i] != null)
					model.setPorCd(porCd[i]);
				if (exptClrTpCd[i] != null)
					model.setExptClrTpCd(exptClrTpCd[i]);
				if (ntfdFlg[i] != null)
					model.setNtfdFlg(ntfdFlg[i]);
				if (ntfySeq[i] != null)
					model.setNtfySeq(ntfySeq[i]);
				if (copGrpSeq[i] != null)
					model.setCopGrpSeq(copGrpSeq[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (bkgRcvTermCd[i] != null)
					model.setBkgRcvTermCd(bkgRcvTermCd[i]);
				if (copExptRsnCd[i] != null)
					model.setCopExptRsnCd(copExptRsnCd[i]);
				if (actStsMapgCd[i] != null)
					model.setActStsMapgCd(actStsMapgCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (copExptNo[i] != null)
					model.setCopExptNo(copExptNo[i]);
				if (creOfcCd[i] != null)
					model.setCreOfcCd(creOfcCd[i]);
				if (copExptTpCd[i] != null)
					model.setCopExptTpCd(copExptTpCd[i]);
				if (toUpdDt[i] != null)
					model.setToUpdDt(toUpdDt[i]);
				if (toActDt[i] != null)
					model.setToActDt(toActDt[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (copExptTpDtlCd[i] != null)
					model.setCopExptTpDtlCd(copExptTpDtlCd[i]);
				if (exptRsolvDt[i] != null)
					model.setExptRsolvDt(exptRsolvDt[i]);
				if (occrDt[i] != null)
					model.setOccrDt(occrDt[i]);
				if (copDtlSeq[i] != null)
					model.setCopDtlSeq(copDtlSeq[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (cneeSeq[i] != null)
					model.setCneeSeq(cneeSeq[i]);
				if (cntrNo[i] != null)
					model.setCntrNo(cntrNo[i]);
				if (clptIndSeq[i] != null)
					model.setClptIndSeq(clptIndSeq[i]);
				if (bkgDeTermCd[i] != null)
					model.setBkgDeTermCd(bkgDeTermCd[i]);
				if (copExptStsCd[i] != null)
					model.setCopExptStsCd(copExptStsCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSceExptMstVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return SceExptMstVO[]
	 */
	public SceExptMstVO[] getSceExptMstVOs(){
		SceExptMstVO[] vos = (SceExptMstVO[])models.toArray(new SceExptMstVO[models.size()]);
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
		this.fmActDt = this.fmActDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.copExptRsn = this.copExptRsn .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.initPlnDt = this.initPlnDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.copNo = this.copNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fmEstmDt = this.fmEstmDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cneeCntCd = this.cneeCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.initActDt = this.initActDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vpsPortCd = this.vpsPortCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.initEstmDt = this.initEstmDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.polCd = this.polCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.copExptCfmDt = this.copExptCfmDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.scNo = this.scNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.copExptCfmFlg = this.copExptCfmFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.occrNodCd = this.occrNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mstBlNo = this.mstBlNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updOfcCd = this.updOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.toActCd = this.toActCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lodgPortCd = this.lodgPortCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ntfyCntCd = this.ntfyCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trnkVvdCd = this.trnkVvdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.shprCntCd = this.shprCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.delCd = this.delCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lstBkgDt = this.lstBkgDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.podCd = this.podCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fmActCd = this.fmActCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fmUpdDt = this.fmUpdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.toEstmDt = this.toEstmDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.copExptCfmUsrId = this.copExptCfmUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.exptCd = this.exptCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.shprSeq = this.shprSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.porCd = this.porCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.exptClrTpCd = this.exptClrTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ntfdFlg = this.ntfdFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ntfySeq = this.ntfySeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.copGrpSeq = this.copGrpSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgRcvTermCd = this.bkgRcvTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.copExptRsnCd = this.copExptRsnCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actStsMapgCd = this.actStsMapgCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.copExptNo = this.copExptNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creOfcCd = this.creOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.copExptTpCd = this.copExptTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.toUpdDt = this.toUpdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.toActDt = this.toActDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.copExptTpDtlCd = this.copExptTpDtlCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.exptRsolvDt = this.exptRsolvDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.occrDt = this.occrDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.copDtlSeq = this.copDtlSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cneeSeq = this.cneeSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrNo = this.cntrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.clptIndSeq = this.clptIndSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgDeTermCd = this.bkgDeTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.copExptStsCd = this.copExptStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
