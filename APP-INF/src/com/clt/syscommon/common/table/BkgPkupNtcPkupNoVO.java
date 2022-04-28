/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : BkgPkupNtcPkupNoVO.java
*@FileTitle : BkgPkupNtcPkupNoVO
*Open Issues :
*Change history :
*@LastModifyDate : 2010.02.10
*@LastModifier : 박미옥
*@LastVersion : 1.0
* 2010.02.10 박미옥 
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
 * @author 박미옥
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgPkupNtcPkupNoVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgPkupNtcPkupNoVO> models = new ArrayList<BkgPkupNtcPkupNoVO>();
	
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String railDepDt = null;
	/* Column Info */
	private String pkupDeltDt = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String railDestLocCd = null;
	/* Column Info */
	private String canPcfIndFlg = null;
	/* Column Info */
	private String pkupUpdUsrId = null;
	/* Column Info */
	private String stopUsrId = null;
	/* Column Info */
	private String railOrgLocCd = null;
	/* Column Info */
	private String pkupUpdDt = null;
	/* Column Info */
	private String blNo = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String pkupCreUsrId = null;
	/* Column Info */
	private String pkupNtcIndCd = null;
	/* Column Info */
	private String pkupYdCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String pkupAvalDt = null;
	/* Column Info */
	private String railArrDt = null;
	/* Column Info */
	private String pkupDeltUsrId = null;
	/* Column Info */
	private String lstFreeDt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String delCd = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String rtnYdCd = null;
	/* Column Info */
	private String ibdTrspHubCd = null;
	/* Column Info */
	private String pkupNtcSndKnt = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Column Info */
	private String stopDt = null;
	/* Column Info */
	private String podCd = null;
	/* Column Info */
	private String deTermCd = null;
	/* Column Info */
	private String ofcCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String uniPcfIndFlg = null;
	/* Column Info */
	private String pkupMnlUpldFlg = null;
	/* Column Info */
	private String cntrNo = null;
	/* Column Info */
	private String pkupCreDt = null;
	/* Column Info */
	private String pkupNo = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgPkupNtcPkupNoVO() {}

	public BkgPkupNtcPkupNoVO(String ibflag, String pagerows, String bkgNo, String cntrNo, String ofcCd, String blNo, String vslCd, String skdVoyNo, String skdDirCd, String podCd, String delCd, String deTermCd, String railOrgLocCd, String railDestLocCd, String ibdTrspHubCd, String pkupYdCd, String pkupNo, String pkupAvalDt, String lstFreeDt, String rtnYdCd, String uniPcfIndFlg, String canPcfIndFlg, String pkupNtcIndCd, String pkupNtcSndKnt, String stopUsrId, String stopDt, String pkupCreDt, String pkupCreUsrId, String pkupUpdDt, String pkupUpdUsrId, String deltFlg, String pkupDeltDt, String pkupDeltUsrId, String creUsrId, String creDt, String updUsrId, String updDt, String railArrDt, String railDepDt, String pkupMnlUpldFlg) {
		this.vslCd = vslCd;
		this.railDepDt = railDepDt;
		this.pkupDeltDt = pkupDeltDt;
		this.deltFlg = deltFlg;
		this.creDt = creDt;
		this.railDestLocCd = railDestLocCd;
		this.canPcfIndFlg = canPcfIndFlg;
		this.pkupUpdUsrId = pkupUpdUsrId;
		this.stopUsrId = stopUsrId;
		this.railOrgLocCd = railOrgLocCd;
		this.pkupUpdDt = pkupUpdDt;
		this.blNo = blNo;
		this.pagerows = pagerows;
		this.pkupCreUsrId = pkupCreUsrId;
		this.pkupNtcIndCd = pkupNtcIndCd;
		this.pkupYdCd = pkupYdCd;
		this.ibflag = ibflag;
		this.pkupAvalDt = pkupAvalDt;
		this.railArrDt = railArrDt;
		this.pkupDeltUsrId = pkupDeltUsrId;
		this.lstFreeDt = lstFreeDt;
		this.updUsrId = updUsrId;
		this.updDt = updDt;
		this.delCd = delCd;
		this.skdVoyNo = skdVoyNo;
		this.rtnYdCd = rtnYdCd;
		this.ibdTrspHubCd = ibdTrspHubCd;
		this.pkupNtcSndKnt = pkupNtcSndKnt;
		this.skdDirCd = skdDirCd;
		this.stopDt = stopDt;
		this.podCd = podCd;
		this.deTermCd = deTermCd;
		this.ofcCd = ofcCd;
		this.creUsrId = creUsrId;
		this.bkgNo = bkgNo;
		this.uniPcfIndFlg = uniPcfIndFlg;
		this.pkupMnlUpldFlg = pkupMnlUpldFlg;
		this.cntrNo = cntrNo;
		this.pkupCreDt = pkupCreDt;
		this.pkupNo = pkupNo;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("rail_dep_dt", getRailDepDt());
		this.hashColumns.put("pkup_delt_dt", getPkupDeltDt());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("rail_dest_loc_cd", getRailDestLocCd());
		this.hashColumns.put("can_pcf_ind_flg", getCanPcfIndFlg());
		this.hashColumns.put("pkup_upd_usr_id", getPkupUpdUsrId());
		this.hashColumns.put("stop_usr_id", getStopUsrId());
		this.hashColumns.put("rail_org_loc_cd", getRailOrgLocCd());
		this.hashColumns.put("pkup_upd_dt", getPkupUpdDt());
		this.hashColumns.put("bl_no", getBlNo());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("pkup_cre_usr_id", getPkupCreUsrId());
		this.hashColumns.put("pkup_ntc_ind_cd", getPkupNtcIndCd());
		this.hashColumns.put("pkup_yd_cd", getPkupYdCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("pkup_aval_dt", getPkupAvalDt());
		this.hashColumns.put("rail_arr_dt", getRailArrDt());
		this.hashColumns.put("pkup_delt_usr_id", getPkupDeltUsrId());
		this.hashColumns.put("lst_free_dt", getLstFreeDt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("del_cd", getDelCd());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("rtn_yd_cd", getRtnYdCd());
		this.hashColumns.put("ibd_trsp_hub_cd", getIbdTrspHubCd());
		this.hashColumns.put("pkup_ntc_snd_knt", getPkupNtcSndKnt());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("stop_dt", getStopDt());
		this.hashColumns.put("pod_cd", getPodCd());
		this.hashColumns.put("de_term_cd", getDeTermCd());
		this.hashColumns.put("ofc_cd", getOfcCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("uni_pcf_ind_flg", getUniPcfIndFlg());
		this.hashColumns.put("pkup_mnl_upld_flg", getPkupMnlUpldFlg());
		this.hashColumns.put("cntr_no", getCntrNo());
		this.hashColumns.put("pkup_cre_dt", getPkupCreDt());
		this.hashColumns.put("pkup_no", getPkupNo());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("rail_dep_dt", "railDepDt");
		this.hashFields.put("pkup_delt_dt", "pkupDeltDt");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("rail_dest_loc_cd", "railDestLocCd");
		this.hashFields.put("can_pcf_ind_flg", "canPcfIndFlg");
		this.hashFields.put("pkup_upd_usr_id", "pkupUpdUsrId");
		this.hashFields.put("stop_usr_id", "stopUsrId");
		this.hashFields.put("rail_org_loc_cd", "railOrgLocCd");
		this.hashFields.put("pkup_upd_dt", "pkupUpdDt");
		this.hashFields.put("bl_no", "blNo");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("pkup_cre_usr_id", "pkupCreUsrId");
		this.hashFields.put("pkup_ntc_ind_cd", "pkupNtcIndCd");
		this.hashFields.put("pkup_yd_cd", "pkupYdCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("pkup_aval_dt", "pkupAvalDt");
		this.hashFields.put("rail_arr_dt", "railArrDt");
		this.hashFields.put("pkup_delt_usr_id", "pkupDeltUsrId");
		this.hashFields.put("lst_free_dt", "lstFreeDt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("del_cd", "delCd");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("rtn_yd_cd", "rtnYdCd");
		this.hashFields.put("ibd_trsp_hub_cd", "ibdTrspHubCd");
		this.hashFields.put("pkup_ntc_snd_knt", "pkupNtcSndKnt");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("stop_dt", "stopDt");
		this.hashFields.put("pod_cd", "podCd");
		this.hashFields.put("de_term_cd", "deTermCd");
		this.hashFields.put("ofc_cd", "ofcCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("uni_pcf_ind_flg", "uniPcfIndFlg");
		this.hashFields.put("pkup_mnl_upld_flg", "pkupMnlUpldFlg");
		this.hashFields.put("cntr_no", "cntrNo");
		this.hashFields.put("pkup_cre_dt", "pkupCreDt");
		this.hashFields.put("pkup_no", "pkupNo");
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
	 * @return railDepDt
	 */
	public String getRailDepDt() {
		return this.railDepDt;
	}
	
	/**
	 * Column Info
	 * @return pkupDeltDt
	 */
	public String getPkupDeltDt() {
		return this.pkupDeltDt;
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
	 * @return creDt
	 */
	public String getCreDt() {
		return this.creDt;
	}
	
	/**
	 * Column Info
	 * @return railDestLocCd
	 */
	public String getRailDestLocCd() {
		return this.railDestLocCd;
	}
	
	/**
	 * Column Info
	 * @return canPcfIndFlg
	 */
	public String getCanPcfIndFlg() {
		return this.canPcfIndFlg;
	}
	
	/**
	 * Column Info
	 * @return pkupUpdUsrId
	 */
	public String getPkupUpdUsrId() {
		return this.pkupUpdUsrId;
	}
	
	/**
	 * Column Info
	 * @return stopUsrId
	 */
	public String getStopUsrId() {
		return this.stopUsrId;
	}
	
	/**
	 * Column Info
	 * @return railOrgLocCd
	 */
	public String getRailOrgLocCd() {
		return this.railOrgLocCd;
	}
	
	/**
	 * Column Info
	 * @return pkupUpdDt
	 */
	public String getPkupUpdDt() {
		return this.pkupUpdDt;
	}
	
	/**
	 * Column Info
	 * @return blNo
	 */
	public String getBlNo() {
		return this.blNo;
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
	 * @return pkupCreUsrId
	 */
	public String getPkupCreUsrId() {
		return this.pkupCreUsrId;
	}
	
	/**
	 * Column Info
	 * @return pkupNtcIndCd
	 */
	public String getPkupNtcIndCd() {
		return this.pkupNtcIndCd;
	}
	
	/**
	 * Column Info
	 * @return pkupYdCd
	 */
	public String getPkupYdCd() {
		return this.pkupYdCd;
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
	 * @return pkupAvalDt
	 */
	public String getPkupAvalDt() {
		return this.pkupAvalDt;
	}
	
	/**
	 * Column Info
	 * @return railArrDt
	 */
	public String getRailArrDt() {
		return this.railArrDt;
	}
	
	/**
	 * Column Info
	 * @return pkupDeltUsrId
	 */
	public String getPkupDeltUsrId() {
		return this.pkupDeltUsrId;
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
	 * @return updUsrId
	 */
	public String getUpdUsrId() {
		return this.updUsrId;
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
	 * @return rtnYdCd
	 */
	public String getRtnYdCd() {
		return this.rtnYdCd;
	}
	
	/**
	 * Column Info
	 * @return ibdTrspHubCd
	 */
	public String getIbdTrspHubCd() {
		return this.ibdTrspHubCd;
	}
	
	/**
	 * Column Info
	 * @return pkupNtcSndKnt
	 */
	public String getPkupNtcSndKnt() {
		return this.pkupNtcSndKnt;
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
	 * @return stopDt
	 */
	public String getStopDt() {
		return this.stopDt;
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
	 * @return deTermCd
	 */
	public String getDeTermCd() {
		return this.deTermCd;
	}
	
	/**
	 * Column Info
	 * @return ofcCd
	 */
	public String getOfcCd() {
		return this.ofcCd;
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
	 * @return uniPcfIndFlg
	 */
	public String getUniPcfIndFlg() {
		return this.uniPcfIndFlg;
	}
	
	/**
	 * Column Info
	 * @return pkupMnlUpldFlg
	 */
	public String getPkupMnlUpldFlg() {
		return this.pkupMnlUpldFlg;
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
	 * @return pkupCreDt
	 */
	public String getPkupCreDt() {
		return this.pkupCreDt;
	}
	
	/**
	 * Column Info
	 * @return pkupNo
	 */
	public String getPkupNo() {
		return this.pkupNo;
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
	 * @param railDepDt
	 */
	public void setRailDepDt(String railDepDt) {
		this.railDepDt = railDepDt;
	}
	
	/**
	 * Column Info
	 * @param pkupDeltDt
	 */
	public void setPkupDeltDt(String pkupDeltDt) {
		this.pkupDeltDt = pkupDeltDt;
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
	 * @param creDt
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
	}
	
	/**
	 * Column Info
	 * @param railDestLocCd
	 */
	public void setRailDestLocCd(String railDestLocCd) {
		this.railDestLocCd = railDestLocCd;
	}
	
	/**
	 * Column Info
	 * @param canPcfIndFlg
	 */
	public void setCanPcfIndFlg(String canPcfIndFlg) {
		this.canPcfIndFlg = canPcfIndFlg;
	}
	
	/**
	 * Column Info
	 * @param pkupUpdUsrId
	 */
	public void setPkupUpdUsrId(String pkupUpdUsrId) {
		this.pkupUpdUsrId = pkupUpdUsrId;
	}
	
	/**
	 * Column Info
	 * @param stopUsrId
	 */
	public void setStopUsrId(String stopUsrId) {
		this.stopUsrId = stopUsrId;
	}
	
	/**
	 * Column Info
	 * @param railOrgLocCd
	 */
	public void setRailOrgLocCd(String railOrgLocCd) {
		this.railOrgLocCd = railOrgLocCd;
	}
	
	/**
	 * Column Info
	 * @param pkupUpdDt
	 */
	public void setPkupUpdDt(String pkupUpdDt) {
		this.pkupUpdDt = pkupUpdDt;
	}
	
	/**
	 * Column Info
	 * @param blNo
	 */
	public void setBlNo(String blNo) {
		this.blNo = blNo;
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
	 * @param pkupCreUsrId
	 */
	public void setPkupCreUsrId(String pkupCreUsrId) {
		this.pkupCreUsrId = pkupCreUsrId;
	}
	
	/**
	 * Column Info
	 * @param pkupNtcIndCd
	 */
	public void setPkupNtcIndCd(String pkupNtcIndCd) {
		this.pkupNtcIndCd = pkupNtcIndCd;
	}
	
	/**
	 * Column Info
	 * @param pkupYdCd
	 */
	public void setPkupYdCd(String pkupYdCd) {
		this.pkupYdCd = pkupYdCd;
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
	 * @param pkupAvalDt
	 */
	public void setPkupAvalDt(String pkupAvalDt) {
		this.pkupAvalDt = pkupAvalDt;
	}
	
	/**
	 * Column Info
	 * @param railArrDt
	 */
	public void setRailArrDt(String railArrDt) {
		this.railArrDt = railArrDt;
	}
	
	/**
	 * Column Info
	 * @param pkupDeltUsrId
	 */
	public void setPkupDeltUsrId(String pkupDeltUsrId) {
		this.pkupDeltUsrId = pkupDeltUsrId;
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
	 * @param updUsrId
	 */
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
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
	 * @param rtnYdCd
	 */
	public void setRtnYdCd(String rtnYdCd) {
		this.rtnYdCd = rtnYdCd;
	}
	
	/**
	 * Column Info
	 * @param ibdTrspHubCd
	 */
	public void setIbdTrspHubCd(String ibdTrspHubCd) {
		this.ibdTrspHubCd = ibdTrspHubCd;
	}
	
	/**
	 * Column Info
	 * @param pkupNtcSndKnt
	 */
	public void setPkupNtcSndKnt(String pkupNtcSndKnt) {
		this.pkupNtcSndKnt = pkupNtcSndKnt;
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
	 * @param stopDt
	 */
	public void setStopDt(String stopDt) {
		this.stopDt = stopDt;
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
	 * @param deTermCd
	 */
	public void setDeTermCd(String deTermCd) {
		this.deTermCd = deTermCd;
	}
	
	/**
	 * Column Info
	 * @param ofcCd
	 */
	public void setOfcCd(String ofcCd) {
		this.ofcCd = ofcCd;
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
	 * @param uniPcfIndFlg
	 */
	public void setUniPcfIndFlg(String uniPcfIndFlg) {
		this.uniPcfIndFlg = uniPcfIndFlg;
	}
	
	/**
	 * Column Info
	 * @param pkupMnlUpldFlg
	 */
	public void setPkupMnlUpldFlg(String pkupMnlUpldFlg) {
		this.pkupMnlUpldFlg = pkupMnlUpldFlg;
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
	 * @param pkupCreDt
	 */
	public void setPkupCreDt(String pkupCreDt) {
		this.pkupCreDt = pkupCreDt;
	}
	
	/**
	 * Column Info
	 * @param pkupNo
	 */
	public void setPkupNo(String pkupNo) {
		this.pkupNo = pkupNo;
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
		setVslCd(JSPUtil.getParameter(request, prefix + "vsl_cd", ""));
		setRailDepDt(JSPUtil.getParameter(request, prefix + "rail_dep_dt", ""));
		setPkupDeltDt(JSPUtil.getParameter(request, prefix + "pkup_delt_dt", ""));
		setDeltFlg(JSPUtil.getParameter(request, prefix + "delt_flg", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setRailDestLocCd(JSPUtil.getParameter(request, prefix + "rail_dest_loc_cd", ""));
		setCanPcfIndFlg(JSPUtil.getParameter(request, prefix + "can_pcf_ind_flg", ""));
		setPkupUpdUsrId(JSPUtil.getParameter(request, prefix + "pkup_upd_usr_id", ""));
		setStopUsrId(JSPUtil.getParameter(request, prefix + "stop_usr_id", ""));
		setRailOrgLocCd(JSPUtil.getParameter(request, prefix + "rail_org_loc_cd", ""));
		setPkupUpdDt(JSPUtil.getParameter(request, prefix + "pkup_upd_dt", ""));
		setBlNo(JSPUtil.getParameter(request, prefix + "bl_no", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setPkupCreUsrId(JSPUtil.getParameter(request, prefix + "pkup_cre_usr_id", ""));
		setPkupNtcIndCd(JSPUtil.getParameter(request, prefix + "pkup_ntc_ind_cd", ""));
		setPkupYdCd(JSPUtil.getParameter(request, prefix + "pkup_yd_cd", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setPkupAvalDt(JSPUtil.getParameter(request, prefix + "pkup_aval_dt", ""));
		setRailArrDt(JSPUtil.getParameter(request, prefix + "rail_arr_dt", ""));
		setPkupDeltUsrId(JSPUtil.getParameter(request, prefix + "pkup_delt_usr_id", ""));
		setLstFreeDt(JSPUtil.getParameter(request, prefix + "lst_free_dt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setDelCd(JSPUtil.getParameter(request, prefix + "del_cd", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, prefix + "skd_voy_no", ""));
		setRtnYdCd(JSPUtil.getParameter(request, prefix + "rtn_yd_cd", ""));
		setIbdTrspHubCd(JSPUtil.getParameter(request, prefix + "ibd_trsp_hub_cd", ""));
		setPkupNtcSndKnt(JSPUtil.getParameter(request, prefix + "pkup_ntc_snd_knt", ""));
		setSkdDirCd(JSPUtil.getParameter(request, prefix + "skd_dir_cd", ""));
		setStopDt(JSPUtil.getParameter(request, prefix + "stop_dt", ""));
		setPodCd(JSPUtil.getParameter(request, prefix + "pod_cd", ""));
		setDeTermCd(JSPUtil.getParameter(request, prefix + "de_term_cd", ""));
		setOfcCd(JSPUtil.getParameter(request, prefix + "ofc_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setBkgNo(JSPUtil.getParameter(request, prefix + "bkg_no", ""));
		setUniPcfIndFlg(JSPUtil.getParameter(request, prefix + "uni_pcf_ind_flg", ""));
		setPkupMnlUpldFlg(JSPUtil.getParameter(request, prefix + "pkup_mnl_upld_flg", ""));
		setCntrNo(JSPUtil.getParameter(request, prefix + "cntr_no", ""));
		setPkupCreDt(JSPUtil.getParameter(request, prefix + "pkup_cre_dt", ""));
		setPkupNo(JSPUtil.getParameter(request, prefix + "pkup_no", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgPkupNtcPkupNoVO[]
	 */
	public BkgPkupNtcPkupNoVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgPkupNtcPkupNoVO[]
	 */
	public BkgPkupNtcPkupNoVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgPkupNtcPkupNoVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] railDepDt = (JSPUtil.getParameter(request, prefix	+ "rail_dep_dt", length));
			String[] pkupDeltDt = (JSPUtil.getParameter(request, prefix	+ "pkup_delt_dt", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] railDestLocCd = (JSPUtil.getParameter(request, prefix	+ "rail_dest_loc_cd", length));
			String[] canPcfIndFlg = (JSPUtil.getParameter(request, prefix	+ "can_pcf_ind_flg", length));
			String[] pkupUpdUsrId = (JSPUtil.getParameter(request, prefix	+ "pkup_upd_usr_id", length));
			String[] stopUsrId = (JSPUtil.getParameter(request, prefix	+ "stop_usr_id", length));
			String[] railOrgLocCd = (JSPUtil.getParameter(request, prefix	+ "rail_org_loc_cd", length));
			String[] pkupUpdDt = (JSPUtil.getParameter(request, prefix	+ "pkup_upd_dt", length));
			String[] blNo = (JSPUtil.getParameter(request, prefix	+ "bl_no", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] pkupCreUsrId = (JSPUtil.getParameter(request, prefix	+ "pkup_cre_usr_id", length));
			String[] pkupNtcIndCd = (JSPUtil.getParameter(request, prefix	+ "pkup_ntc_ind_cd", length));
			String[] pkupYdCd = (JSPUtil.getParameter(request, prefix	+ "pkup_yd_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] pkupAvalDt = (JSPUtil.getParameter(request, prefix	+ "pkup_aval_dt", length));
			String[] railArrDt = (JSPUtil.getParameter(request, prefix	+ "rail_arr_dt", length));
			String[] pkupDeltUsrId = (JSPUtil.getParameter(request, prefix	+ "pkup_delt_usr_id", length));
			String[] lstFreeDt = (JSPUtil.getParameter(request, prefix	+ "lst_free_dt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] delCd = (JSPUtil.getParameter(request, prefix	+ "del_cd", length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no", length));
			String[] rtnYdCd = (JSPUtil.getParameter(request, prefix	+ "rtn_yd_cd", length));
			String[] ibdTrspHubCd = (JSPUtil.getParameter(request, prefix	+ "ibd_trsp_hub_cd", length));
			String[] pkupNtcSndKnt = (JSPUtil.getParameter(request, prefix	+ "pkup_ntc_snd_knt", length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd", length));
			String[] stopDt = (JSPUtil.getParameter(request, prefix	+ "stop_dt", length));
			String[] podCd = (JSPUtil.getParameter(request, prefix	+ "pod_cd", length));
			String[] deTermCd = (JSPUtil.getParameter(request, prefix	+ "de_term_cd", length));
			String[] ofcCd = (JSPUtil.getParameter(request, prefix	+ "ofc_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] uniPcfIndFlg = (JSPUtil.getParameter(request, prefix	+ "uni_pcf_ind_flg", length));
			String[] pkupMnlUpldFlg = (JSPUtil.getParameter(request, prefix	+ "pkup_mnl_upld_flg", length));
			String[] cntrNo = (JSPUtil.getParameter(request, prefix	+ "cntr_no", length));
			String[] pkupCreDt = (JSPUtil.getParameter(request, prefix	+ "pkup_cre_dt", length));
			String[] pkupNo = (JSPUtil.getParameter(request, prefix	+ "pkup_no", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgPkupNtcPkupNoVO();
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (railDepDt[i] != null)
					model.setRailDepDt(railDepDt[i]);
				if (pkupDeltDt[i] != null)
					model.setPkupDeltDt(pkupDeltDt[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (railDestLocCd[i] != null)
					model.setRailDestLocCd(railDestLocCd[i]);
				if (canPcfIndFlg[i] != null)
					model.setCanPcfIndFlg(canPcfIndFlg[i]);
				if (pkupUpdUsrId[i] != null)
					model.setPkupUpdUsrId(pkupUpdUsrId[i]);
				if (stopUsrId[i] != null)
					model.setStopUsrId(stopUsrId[i]);
				if (railOrgLocCd[i] != null)
					model.setRailOrgLocCd(railOrgLocCd[i]);
				if (pkupUpdDt[i] != null)
					model.setPkupUpdDt(pkupUpdDt[i]);
				if (blNo[i] != null)
					model.setBlNo(blNo[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (pkupCreUsrId[i] != null)
					model.setPkupCreUsrId(pkupCreUsrId[i]);
				if (pkupNtcIndCd[i] != null)
					model.setPkupNtcIndCd(pkupNtcIndCd[i]);
				if (pkupYdCd[i] != null)
					model.setPkupYdCd(pkupYdCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (pkupAvalDt[i] != null)
					model.setPkupAvalDt(pkupAvalDt[i]);
				if (railArrDt[i] != null)
					model.setRailArrDt(railArrDt[i]);
				if (pkupDeltUsrId[i] != null)
					model.setPkupDeltUsrId(pkupDeltUsrId[i]);
				if (lstFreeDt[i] != null)
					model.setLstFreeDt(lstFreeDt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (delCd[i] != null)
					model.setDelCd(delCd[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (rtnYdCd[i] != null)
					model.setRtnYdCd(rtnYdCd[i]);
				if (ibdTrspHubCd[i] != null)
					model.setIbdTrspHubCd(ibdTrspHubCd[i]);
				if (pkupNtcSndKnt[i] != null)
					model.setPkupNtcSndKnt(pkupNtcSndKnt[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (stopDt[i] != null)
					model.setStopDt(stopDt[i]);
				if (podCd[i] != null)
					model.setPodCd(podCd[i]);
				if (deTermCd[i] != null)
					model.setDeTermCd(deTermCd[i]);
				if (ofcCd[i] != null)
					model.setOfcCd(ofcCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (uniPcfIndFlg[i] != null)
					model.setUniPcfIndFlg(uniPcfIndFlg[i]);
				if (pkupMnlUpldFlg[i] != null)
					model.setPkupMnlUpldFlg(pkupMnlUpldFlg[i]);
				if (cntrNo[i] != null)
					model.setCntrNo(cntrNo[i]);
				if (pkupCreDt[i] != null)
					model.setPkupCreDt(pkupCreDt[i]);
				if (pkupNo[i] != null)
					model.setPkupNo(pkupNo[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgPkupNtcPkupNoVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgPkupNtcPkupNoVO[]
	 */
	public BkgPkupNtcPkupNoVO[] getBkgPkupNtcPkupNoVOs(){
		BkgPkupNtcPkupNoVO[] vos = (BkgPkupNtcPkupNoVO[])models.toArray(new BkgPkupNtcPkupNoVO[models.size()]);
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
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.railDepDt = this.railDepDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pkupDeltDt = this.pkupDeltDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.railDestLocCd = this.railDestLocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.canPcfIndFlg = this.canPcfIndFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pkupUpdUsrId = this.pkupUpdUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stopUsrId = this.stopUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.railOrgLocCd = this.railOrgLocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pkupUpdDt = this.pkupUpdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blNo = this.blNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pkupCreUsrId = this.pkupCreUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pkupNtcIndCd = this.pkupNtcIndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pkupYdCd = this.pkupYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pkupAvalDt = this.pkupAvalDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.railArrDt = this.railArrDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pkupDeltUsrId = this.pkupDeltUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lstFreeDt = this.lstFreeDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.delCd = this.delCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rtnYdCd = this.rtnYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibdTrspHubCd = this.ibdTrspHubCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pkupNtcSndKnt = this.pkupNtcSndKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stopDt = this.stopDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.podCd = this.podCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deTermCd = this.deTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcCd = this.ofcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.uniPcfIndFlg = this.uniPcfIndFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pkupMnlUpldFlg = this.pkupMnlUpldFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrNo = this.cntrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pkupCreDt = this.pkupCreDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pkupNo = this.pkupNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
