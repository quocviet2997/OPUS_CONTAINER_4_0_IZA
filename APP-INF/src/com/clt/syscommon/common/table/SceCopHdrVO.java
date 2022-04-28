/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : SceCopHdrVO.java
*@FileTitle : SceCopHdrVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.11.05
*@LastModifier : 김인수
*@LastVersion : 1.0
* 2009.11.05 김인수 
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
 * @author 김인수
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class SceCopHdrVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SceCopHdrVO> models = new ArrayList<SceCopHdrVO>();
	
	/* Column Info */
	private String provCntrTpszCd = null;
	/* Column Info */
	private String copNo = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String copUpdRmk = null;
	/* Column Info */
	private String obTroFlg = null;
	/* Column Info */
	private String cfmApntDt = null;
	/* Column Info */
	private String cfmObDorArrDt = null;
	/* Column Info */
	private String pctlNo = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String mstCopNo = null;
	/* Column Info */
	private String trnkSkdDirCd = null;
	/* Column Info */
	private String railRcvCoffToDt = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String railRcvCoffDtSrcTpCd = null;
	/* Column Info */
	private String cntrTpszCd = null;
	/* Column Info */
	private String copSubStsCd = null;
	/* Column Info */
	private String copStsCd = null;
	/* Column Info */
	private String delNodCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String copFshDt = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String porNodCd = null;
	/* Column Info */
	private String railRcvCoffFmDt = null;
	/* Column Info */
	private String umchStsCd = null;
	/* Column Info */
	private String polNodCd = null;
	/* Column Info */
	private String copRailChkCd = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String podNodCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String cntrNo = null;
	/* Column Info */
	private String ibTroFlg = null;
	/* Column Info */
	private String trnkVslCd = null;
	/* Column Info */
	private String provCntrNo = null;
	/* Column Info */
	private String cnmvYr = null;
	/* Column Info */
	private String trnkSkdVoyNo = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public SceCopHdrVO() {}

	public SceCopHdrVO(String ibflag, String pagerows, String copNo, String bkgNo, String cntrNo, String cntrTpszCd, String cnmvYr, String copStsCd, String pctlNo, String mstCopNo, String copFshDt, String trnkVslCd, String trnkSkdVoyNo, String trnkSkdDirCd, String porNodCd, String polNodCd, String podNodCd, String delNodCd, String copRailChkCd, String ibTroFlg, String obTroFlg, String railRcvCoffDtSrcTpCd, String railRcvCoffFmDt, String creUsrId, String creDt, String updUsrId, String updDt, String copSubStsCd, String railRcvCoffToDt, String umchStsCd, String provCntrNo, String provCntrTpszCd, String cfmObDorArrDt, String cfmApntDt, String copUpdRmk) {
		this.provCntrTpszCd = provCntrTpszCd;
		this.copNo = copNo;
		this.creDt = creDt;
		this.copUpdRmk = copUpdRmk;
		this.obTroFlg = obTroFlg;
		this.cfmApntDt = cfmApntDt;
		this.cfmObDorArrDt = cfmObDorArrDt;
		this.pctlNo = pctlNo;
		this.pagerows = pagerows;
		this.mstCopNo = mstCopNo;
		this.trnkSkdDirCd = trnkSkdDirCd;
		this.railRcvCoffToDt = railRcvCoffToDt;
		this.ibflag = ibflag;
		this.railRcvCoffDtSrcTpCd = railRcvCoffDtSrcTpCd;
		this.cntrTpszCd = cntrTpszCd;
		this.copSubStsCd = copSubStsCd;
		this.copStsCd = copStsCd;
		this.delNodCd = delNodCd;
		this.updUsrId = updUsrId;
		this.copFshDt = copFshDt;
		this.updDt = updDt;
		this.porNodCd = porNodCd;
		this.railRcvCoffFmDt = railRcvCoffFmDt;
		this.umchStsCd = umchStsCd;
		this.polNodCd = polNodCd;
		this.copRailChkCd = copRailChkCd;
		this.bkgNo = bkgNo;
		this.podNodCd = podNodCd;
		this.creUsrId = creUsrId;
		this.cntrNo = cntrNo;
		this.ibTroFlg = ibTroFlg;
		this.trnkVslCd = trnkVslCd;
		this.provCntrNo = provCntrNo;
		this.cnmvYr = cnmvYr;
		this.trnkSkdVoyNo = trnkSkdVoyNo;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("prov_cntr_tpsz_cd", getProvCntrTpszCd());
		this.hashColumns.put("cop_no", getCopNo());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("cop_upd_rmk", getCopUpdRmk());
		this.hashColumns.put("ob_tro_flg", getObTroFlg());
		this.hashColumns.put("cfm_apnt_dt", getCfmApntDt());
		this.hashColumns.put("cfm_ob_dor_arr_dt", getCfmObDorArrDt());
		this.hashColumns.put("pctl_no", getPctlNo());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("mst_cop_no", getMstCopNo());
		this.hashColumns.put("trnk_skd_dir_cd", getTrnkSkdDirCd());
		this.hashColumns.put("rail_rcv_coff_to_dt", getRailRcvCoffToDt());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("rail_rcv_coff_dt_src_tp_cd", getRailRcvCoffDtSrcTpCd());
		this.hashColumns.put("cntr_tpsz_cd", getCntrTpszCd());
		this.hashColumns.put("cop_sub_sts_cd", getCopSubStsCd());
		this.hashColumns.put("cop_sts_cd", getCopStsCd());
		this.hashColumns.put("del_nod_cd", getDelNodCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("cop_fsh_dt", getCopFshDt());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("por_nod_cd", getPorNodCd());
		this.hashColumns.put("rail_rcv_coff_fm_dt", getRailRcvCoffFmDt());
		this.hashColumns.put("umch_sts_cd", getUmchStsCd());
		this.hashColumns.put("pol_nod_cd", getPolNodCd());
		this.hashColumns.put("cop_rail_chk_cd", getCopRailChkCd());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("pod_nod_cd", getPodNodCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("cntr_no", getCntrNo());
		this.hashColumns.put("ib_tro_flg", getIbTroFlg());
		this.hashColumns.put("trnk_vsl_cd", getTrnkVslCd());
		this.hashColumns.put("prov_cntr_no", getProvCntrNo());
		this.hashColumns.put("cnmv_yr", getCnmvYr());
		this.hashColumns.put("trnk_skd_voy_no", getTrnkSkdVoyNo());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("prov_cntr_tpsz_cd", "provCntrTpszCd");
		this.hashFields.put("cop_no", "copNo");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("cop_upd_rmk", "copUpdRmk");
		this.hashFields.put("ob_tro_flg", "obTroFlg");
		this.hashFields.put("cfm_apnt_dt", "cfmApntDt");
		this.hashFields.put("cfm_ob_dor_arr_dt", "cfmObDorArrDt");
		this.hashFields.put("pctl_no", "pctlNo");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("mst_cop_no", "mstCopNo");
		this.hashFields.put("trnk_skd_dir_cd", "trnkSkdDirCd");
		this.hashFields.put("rail_rcv_coff_to_dt", "railRcvCoffToDt");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("rail_rcv_coff_dt_src_tp_cd", "railRcvCoffDtSrcTpCd");
		this.hashFields.put("cntr_tpsz_cd", "cntrTpszCd");
		this.hashFields.put("cop_sub_sts_cd", "copSubStsCd");
		this.hashFields.put("cop_sts_cd", "copStsCd");
		this.hashFields.put("del_nod_cd", "delNodCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("cop_fsh_dt", "copFshDt");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("por_nod_cd", "porNodCd");
		this.hashFields.put("rail_rcv_coff_fm_dt", "railRcvCoffFmDt");
		this.hashFields.put("umch_sts_cd", "umchStsCd");
		this.hashFields.put("pol_nod_cd", "polNodCd");
		this.hashFields.put("cop_rail_chk_cd", "copRailChkCd");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("pod_nod_cd", "podNodCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("cntr_no", "cntrNo");
		this.hashFields.put("ib_tro_flg", "ibTroFlg");
		this.hashFields.put("trnk_vsl_cd", "trnkVslCd");
		this.hashFields.put("prov_cntr_no", "provCntrNo");
		this.hashFields.put("cnmv_yr", "cnmvYr");
		this.hashFields.put("trnk_skd_voy_no", "trnkSkdVoyNo");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return provCntrTpszCd
	 */
	public String getProvCntrTpszCd() {
		return this.provCntrTpszCd;
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
	 * @return creDt
	 */
	public String getCreDt() {
		return this.creDt;
	}
	
	/**
	 * Column Info
	 * @return copUpdRmk
	 */
	public String getCopUpdRmk() {
		return this.copUpdRmk;
	}
	
	/**
	 * Column Info
	 * @return obTroFlg
	 */
	public String getObTroFlg() {
		return this.obTroFlg;
	}
	
	/**
	 * Column Info
	 * @return cfmApntDt
	 */
	public String getCfmApntDt() {
		return this.cfmApntDt;
	}
	
	/**
	 * Column Info
	 * @return cfmObDorArrDt
	 */
	public String getCfmObDorArrDt() {
		return this.cfmObDorArrDt;
	}
	
	/**
	 * Column Info
	 * @return pctlNo
	 */
	public String getPctlNo() {
		return this.pctlNo;
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
	 * @return mstCopNo
	 */
	public String getMstCopNo() {
		return this.mstCopNo;
	}
	
	/**
	 * Column Info
	 * @return trnkSkdDirCd
	 */
	public String getTrnkSkdDirCd() {
		return this.trnkSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @return railRcvCoffToDt
	 */
	public String getRailRcvCoffToDt() {
		return this.railRcvCoffToDt;
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
	 * @return railRcvCoffDtSrcTpCd
	 */
	public String getRailRcvCoffDtSrcTpCd() {
		return this.railRcvCoffDtSrcTpCd;
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
	 * @return copSubStsCd
	 */
	public String getCopSubStsCd() {
		return this.copSubStsCd;
	}
	
	/**
	 * Column Info
	 * @return copStsCd
	 */
	public String getCopStsCd() {
		return this.copStsCd;
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
	 * @return updUsrId
	 */
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	
	/**
	 * Column Info
	 * @return copFshDt
	 */
	public String getCopFshDt() {
		return this.copFshDt;
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
	 * @return porNodCd
	 */
	public String getPorNodCd() {
		return this.porNodCd;
	}
	
	/**
	 * Column Info
	 * @return railRcvCoffFmDt
	 */
	public String getRailRcvCoffFmDt() {
		return this.railRcvCoffFmDt;
	}
	
	/**
	 * Column Info
	 * @return umchStsCd
	 */
	public String getUmchStsCd() {
		return this.umchStsCd;
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
	 * @return copRailChkCd
	 */
	public String getCopRailChkCd() {
		return this.copRailChkCd;
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
	 * @return creUsrId
	 */
	public String getCreUsrId() {
		return this.creUsrId;
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
	 * @return ibTroFlg
	 */
	public String getIbTroFlg() {
		return this.ibTroFlg;
	}
	
	/**
	 * Column Info
	 * @return trnkVslCd
	 */
	public String getTrnkVslCd() {
		return this.trnkVslCd;
	}
	
	/**
	 * Column Info
	 * @return provCntrNo
	 */
	public String getProvCntrNo() {
		return this.provCntrNo;
	}
	
	/**
	 * Column Info
	 * @return cnmvYr
	 */
	public String getCnmvYr() {
		return this.cnmvYr;
	}
	
	/**
	 * Column Info
	 * @return trnkSkdVoyNo
	 */
	public String getTrnkSkdVoyNo() {
		return this.trnkSkdVoyNo;
	}
	

	/**
	 * Column Info
	 * @param provCntrTpszCd
	 */
	public void setProvCntrTpszCd(String provCntrTpszCd) {
		this.provCntrTpszCd = provCntrTpszCd;
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
	 * @param creDt
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
	}
	
	/**
	 * Column Info
	 * @param copUpdRmk
	 */
	public void setCopUpdRmk(String copUpdRmk) {
		this.copUpdRmk = copUpdRmk;
	}
	
	/**
	 * Column Info
	 * @param obTroFlg
	 */
	public void setObTroFlg(String obTroFlg) {
		this.obTroFlg = obTroFlg;
	}
	
	/**
	 * Column Info
	 * @param cfmApntDt
	 */
	public void setCfmApntDt(String cfmApntDt) {
		this.cfmApntDt = cfmApntDt;
	}
	
	/**
	 * Column Info
	 * @param cfmObDorArrDt
	 */
	public void setCfmObDorArrDt(String cfmObDorArrDt) {
		this.cfmObDorArrDt = cfmObDorArrDt;
	}
	
	/**
	 * Column Info
	 * @param pctlNo
	 */
	public void setPctlNo(String pctlNo) {
		this.pctlNo = pctlNo;
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
	 * @param mstCopNo
	 */
	public void setMstCopNo(String mstCopNo) {
		this.mstCopNo = mstCopNo;
	}
	
	/**
	 * Column Info
	 * @param trnkSkdDirCd
	 */
	public void setTrnkSkdDirCd(String trnkSkdDirCd) {
		this.trnkSkdDirCd = trnkSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @param railRcvCoffToDt
	 */
	public void setRailRcvCoffToDt(String railRcvCoffToDt) {
		this.railRcvCoffToDt = railRcvCoffToDt;
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
	 * @param railRcvCoffDtSrcTpCd
	 */
	public void setRailRcvCoffDtSrcTpCd(String railRcvCoffDtSrcTpCd) {
		this.railRcvCoffDtSrcTpCd = railRcvCoffDtSrcTpCd;
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
	 * @param copSubStsCd
	 */
	public void setCopSubStsCd(String copSubStsCd) {
		this.copSubStsCd = copSubStsCd;
	}
	
	/**
	 * Column Info
	 * @param copStsCd
	 */
	public void setCopStsCd(String copStsCd) {
		this.copStsCd = copStsCd;
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
	 * @param updUsrId
	 */
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
	}
	
	/**
	 * Column Info
	 * @param copFshDt
	 */
	public void setCopFshDt(String copFshDt) {
		this.copFshDt = copFshDt;
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
	 * @param porNodCd
	 */
	public void setPorNodCd(String porNodCd) {
		this.porNodCd = porNodCd;
	}
	
	/**
	 * Column Info
	 * @param railRcvCoffFmDt
	 */
	public void setRailRcvCoffFmDt(String railRcvCoffFmDt) {
		this.railRcvCoffFmDt = railRcvCoffFmDt;
	}
	
	/**
	 * Column Info
	 * @param umchStsCd
	 */
	public void setUmchStsCd(String umchStsCd) {
		this.umchStsCd = umchStsCd;
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
	 * @param copRailChkCd
	 */
	public void setCopRailChkCd(String copRailChkCd) {
		this.copRailChkCd = copRailChkCd;
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
	 * @param creUsrId
	 */
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
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
	 * @param ibTroFlg
	 */
	public void setIbTroFlg(String ibTroFlg) {
		this.ibTroFlg = ibTroFlg;
	}
	
	/**
	 * Column Info
	 * @param trnkVslCd
	 */
	public void setTrnkVslCd(String trnkVslCd) {
		this.trnkVslCd = trnkVslCd;
	}
	
	/**
	 * Column Info
	 * @param provCntrNo
	 */
	public void setProvCntrNo(String provCntrNo) {
		this.provCntrNo = provCntrNo;
	}
	
	/**
	 * Column Info
	 * @param cnmvYr
	 */
	public void setCnmvYr(String cnmvYr) {
		this.cnmvYr = cnmvYr;
	}
	
	/**
	 * Column Info
	 * @param trnkSkdVoyNo
	 */
	public void setTrnkSkdVoyNo(String trnkSkdVoyNo) {
		this.trnkSkdVoyNo = trnkSkdVoyNo;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setProvCntrTpszCd(JSPUtil.getParameter(request, "prov_cntr_tpsz_cd", ""));
		setCopNo(JSPUtil.getParameter(request, "cop_no", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setCopUpdRmk(JSPUtil.getParameter(request, "cop_upd_rmk", ""));
		setObTroFlg(JSPUtil.getParameter(request, "ob_tro_flg", ""));
		setCfmApntDt(JSPUtil.getParameter(request, "cfm_apnt_dt", ""));
		setCfmObDorArrDt(JSPUtil.getParameter(request, "cfm_ob_dor_arr_dt", ""));
		setPctlNo(JSPUtil.getParameter(request, "pctl_no", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setMstCopNo(JSPUtil.getParameter(request, "mst_cop_no", ""));
		setTrnkSkdDirCd(JSPUtil.getParameter(request, "trnk_skd_dir_cd", ""));
		setRailRcvCoffToDt(JSPUtil.getParameter(request, "rail_rcv_coff_to_dt", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setRailRcvCoffDtSrcTpCd(JSPUtil.getParameter(request, "rail_rcv_coff_dt_src_tp_cd", ""));
		setCntrTpszCd(JSPUtil.getParameter(request, "cntr_tpsz_cd", ""));
		setCopSubStsCd(JSPUtil.getParameter(request, "cop_sub_sts_cd", ""));
		setCopStsCd(JSPUtil.getParameter(request, "cop_sts_cd", ""));
		setDelNodCd(JSPUtil.getParameter(request, "del_nod_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setCopFshDt(JSPUtil.getParameter(request, "cop_fsh_dt", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setPorNodCd(JSPUtil.getParameter(request, "por_nod_cd", ""));
		setRailRcvCoffFmDt(JSPUtil.getParameter(request, "rail_rcv_coff_fm_dt", ""));
		setUmchStsCd(JSPUtil.getParameter(request, "umch_sts_cd", ""));
		setPolNodCd(JSPUtil.getParameter(request, "pol_nod_cd", ""));
		setCopRailChkCd(JSPUtil.getParameter(request, "cop_rail_chk_cd", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setPodNodCd(JSPUtil.getParameter(request, "pod_nod_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setCntrNo(JSPUtil.getParameter(request, "cntr_no", ""));
		setIbTroFlg(JSPUtil.getParameter(request, "ib_tro_flg", ""));
		setTrnkVslCd(JSPUtil.getParameter(request, "trnk_vsl_cd", ""));
		setProvCntrNo(JSPUtil.getParameter(request, "prov_cntr_no", ""));
		setCnmvYr(JSPUtil.getParameter(request, "cnmv_yr", ""));
		setTrnkSkdVoyNo(JSPUtil.getParameter(request, "trnk_skd_voy_no", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return SceCopHdrVO[]
	 */
	public SceCopHdrVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SceCopHdrVO[]
	 */
	public SceCopHdrVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SceCopHdrVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] provCntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "prov_cntr_tpsz_cd", length));
			String[] copNo = (JSPUtil.getParameter(request, prefix	+ "cop_no", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] copUpdRmk = (JSPUtil.getParameter(request, prefix	+ "cop_upd_rmk", length));
			String[] obTroFlg = (JSPUtil.getParameter(request, prefix	+ "ob_tro_flg", length));
			String[] cfmApntDt = (JSPUtil.getParameter(request, prefix	+ "cfm_apnt_dt", length));
			String[] cfmObDorArrDt = (JSPUtil.getParameter(request, prefix	+ "cfm_ob_dor_arr_dt", length));
			String[] pctlNo = (JSPUtil.getParameter(request, prefix	+ "pctl_no", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] mstCopNo = (JSPUtil.getParameter(request, prefix	+ "mst_cop_no", length));
			String[] trnkSkdDirCd = (JSPUtil.getParameter(request, prefix	+ "trnk_skd_dir_cd", length));
			String[] railRcvCoffToDt = (JSPUtil.getParameter(request, prefix	+ "rail_rcv_coff_to_dt", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] railRcvCoffDtSrcTpCd = (JSPUtil.getParameter(request, prefix	+ "rail_rcv_coff_dt_src_tp_cd", length));
			String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_cd", length));
			String[] copSubStsCd = (JSPUtil.getParameter(request, prefix	+ "cop_sub_sts_cd", length));
			String[] copStsCd = (JSPUtil.getParameter(request, prefix	+ "cop_sts_cd", length));
			String[] delNodCd = (JSPUtil.getParameter(request, prefix	+ "del_nod_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] copFshDt = (JSPUtil.getParameter(request, prefix	+ "cop_fsh_dt", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] porNodCd = (JSPUtil.getParameter(request, prefix	+ "por_nod_cd", length));
			String[] railRcvCoffFmDt = (JSPUtil.getParameter(request, prefix	+ "rail_rcv_coff_fm_dt", length));
			String[] umchStsCd = (JSPUtil.getParameter(request, prefix	+ "umch_sts_cd", length));
			String[] polNodCd = (JSPUtil.getParameter(request, prefix	+ "pol_nod_cd", length));
			String[] copRailChkCd = (JSPUtil.getParameter(request, prefix	+ "cop_rail_chk_cd", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] podNodCd = (JSPUtil.getParameter(request, prefix	+ "pod_nod_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] cntrNo = (JSPUtil.getParameter(request, prefix	+ "cntr_no", length));
			String[] ibTroFlg = (JSPUtil.getParameter(request, prefix	+ "ib_tro_flg", length));
			String[] trnkVslCd = (JSPUtil.getParameter(request, prefix	+ "trnk_vsl_cd", length));
			String[] provCntrNo = (JSPUtil.getParameter(request, prefix	+ "prov_cntr_no", length));
			String[] cnmvYr = (JSPUtil.getParameter(request, prefix	+ "cnmv_yr", length));
			String[] trnkSkdVoyNo = (JSPUtil.getParameter(request, prefix	+ "trnk_skd_voy_no", length));
			
			for (int i = 0; i < length; i++) {
				model = new SceCopHdrVO();
				if (provCntrTpszCd[i] != null)
					model.setProvCntrTpszCd(provCntrTpszCd[i]);
				if (copNo[i] != null)
					model.setCopNo(copNo[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (copUpdRmk[i] != null)
					model.setCopUpdRmk(copUpdRmk[i]);
				if (obTroFlg[i] != null)
					model.setObTroFlg(obTroFlg[i]);
				if (cfmApntDt[i] != null)
					model.setCfmApntDt(cfmApntDt[i]);
				if (cfmObDorArrDt[i] != null)
					model.setCfmObDorArrDt(cfmObDorArrDt[i]);
				if (pctlNo[i] != null)
					model.setPctlNo(pctlNo[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (mstCopNo[i] != null)
					model.setMstCopNo(mstCopNo[i]);
				if (trnkSkdDirCd[i] != null)
					model.setTrnkSkdDirCd(trnkSkdDirCd[i]);
				if (railRcvCoffToDt[i] != null)
					model.setRailRcvCoffToDt(railRcvCoffToDt[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (railRcvCoffDtSrcTpCd[i] != null)
					model.setRailRcvCoffDtSrcTpCd(railRcvCoffDtSrcTpCd[i]);
				if (cntrTpszCd[i] != null)
					model.setCntrTpszCd(cntrTpszCd[i]);
				if (copSubStsCd[i] != null)
					model.setCopSubStsCd(copSubStsCd[i]);
				if (copStsCd[i] != null)
					model.setCopStsCd(copStsCd[i]);
				if (delNodCd[i] != null)
					model.setDelNodCd(delNodCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (copFshDt[i] != null)
					model.setCopFshDt(copFshDt[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (porNodCd[i] != null)
					model.setPorNodCd(porNodCd[i]);
				if (railRcvCoffFmDt[i] != null)
					model.setRailRcvCoffFmDt(railRcvCoffFmDt[i]);
				if (umchStsCd[i] != null)
					model.setUmchStsCd(umchStsCd[i]);
				if (polNodCd[i] != null)
					model.setPolNodCd(polNodCd[i]);
				if (copRailChkCd[i] != null)
					model.setCopRailChkCd(copRailChkCd[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (podNodCd[i] != null)
					model.setPodNodCd(podNodCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (cntrNo[i] != null)
					model.setCntrNo(cntrNo[i]);
				if (ibTroFlg[i] != null)
					model.setIbTroFlg(ibTroFlg[i]);
				if (trnkVslCd[i] != null)
					model.setTrnkVslCd(trnkVslCd[i]);
				if (provCntrNo[i] != null)
					model.setProvCntrNo(provCntrNo[i]);
				if (cnmvYr[i] != null)
					model.setCnmvYr(cnmvYr[i]);
				if (trnkSkdVoyNo[i] != null)
					model.setTrnkSkdVoyNo(trnkSkdVoyNo[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSceCopHdrVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return SceCopHdrVO[]
	 */
	public SceCopHdrVO[] getSceCopHdrVOs(){
		SceCopHdrVO[] vos = (SceCopHdrVO[])models.toArray(new SceCopHdrVO[models.size()]);
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
		this.provCntrTpszCd = this.provCntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.copNo = this.copNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.copUpdRmk = this.copUpdRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.obTroFlg = this.obTroFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cfmApntDt = this.cfmApntDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cfmObDorArrDt = this.cfmObDorArrDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pctlNo = this.pctlNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mstCopNo = this.mstCopNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trnkSkdDirCd = this.trnkSkdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.railRcvCoffToDt = this.railRcvCoffToDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.railRcvCoffDtSrcTpCd = this.railRcvCoffDtSrcTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszCd = this.cntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.copSubStsCd = this.copSubStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.copStsCd = this.copStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.delNodCd = this.delNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.copFshDt = this.copFshDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.porNodCd = this.porNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.railRcvCoffFmDt = this.railRcvCoffFmDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.umchStsCd = this.umchStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.polNodCd = this.polNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.copRailChkCd = this.copRailChkCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.podNodCd = this.podNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrNo = this.cntrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibTroFlg = this.ibTroFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trnkVslCd = this.trnkVslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.provCntrNo = this.provCntrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cnmvYr = this.cnmvYr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trnkSkdVoyNo = this.trnkSkdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
