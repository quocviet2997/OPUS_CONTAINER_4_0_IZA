/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgKrWhfBlVO.java
*@FileTitle : BkgKrWhfBlVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.11.18
*@LastModifier : 정재엽
*@LastVersion : 1.0
* 2009.11.18 정재엽 
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
 * @author 정재엽
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgKrWhfBlVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgKrWhfBlVO> models = new ArrayList<BkgKrWhfBlVO>();
	
	/* Column Info */
	private String porCd = null;
	/* Column Info */
	private String wfgExptCd = null;
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String whfBlThruTsFlg = null;
	/* Column Info */
	private String whfBndCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String rtonWgt = null;
	/* Column Info */
	private String rlaneCd = null;
	/* Column Info */
	private String custRgstNo = null;
	/* Column Info */
	private String blNo = null;
	/* Column Info */
	private String whfAmt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String whfBlCgoTpCd = null;
	/* Column Info */
	private String whfPolCd = null;
	/* Column Info */
	private String polCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String cstmsDeclTpCd = null;
	/* Column Info */
	private String cmdtCd = null;
	/* Column Info */
	private String whfBlAddRsnCd = null;
	/* Column Info */
	private String wgtUtCd = null;
	/* Column Info */
	private String measQty = null;
	/* Column Info */
	private String slsOfcCd = null;
	/* Column Info */
	private String pckQty = null;
	/* Column Info */
	private String rcvTermCd = null;
	/* Column Info */
	private String pckTpCd = null;
	/* Column Info */
	private String measUtCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String delCd = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Column Info */
	private String podCd = null;
	/* Column Info */
	private String deTermCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String whfBlStsCd = null;
	/* Column Info */
	private String whfPodCd = null;
	/* Column Info */
	private String wgtQty = null;

	private String custRgstNo2 = null;

	
	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgKrWhfBlVO() {}

	public BkgKrWhfBlVO(String ibflag, String pagerows, String vslCd, String skdVoyNo, String skdDirCd, String whfBndCd, 
			String blNo, String bkgNo, String porCd, String polCd, String podCd, String delCd, String whfPolCd, 
			String whfPodCd, String pckQty, String wgtQty, String wgtUtCd, String measQty, String measUtCd, 
			String rcvTermCd, String deTermCd, String cmdtCd, String wfgExptCd, String slsOfcCd, String rlaneCd, 
			String rtonWgt, String whfAmt, String whfBlStsCd, String whfBlAddRsnCd, String whfBlThruTsFlg, String whfBlCgoTpCd, 
			String cstmsDeclTpCd, String pckTpCd, String creUsrId, String creDt, String updUsrId, String updDt, String custRgstNo, String custRgstNo2) {
		this.porCd = porCd;
		this.wfgExptCd = wfgExptCd;
		this.vslCd = vslCd;
		this.whfBlThruTsFlg = whfBlThruTsFlg;
		this.whfBndCd = whfBndCd;
		this.creDt = creDt;
		this.rtonWgt = rtonWgt;
		this.rlaneCd = rlaneCd;
		this.custRgstNo = custRgstNo;
		this.blNo = blNo;
		this.whfAmt = whfAmt;
		this.pagerows = pagerows;
		this.whfBlCgoTpCd = whfBlCgoTpCd;
		this.whfPolCd = whfPolCd;
		this.polCd = polCd;
		this.ibflag = ibflag;
		this.cstmsDeclTpCd = cstmsDeclTpCd;
		this.cmdtCd = cmdtCd;
		this.whfBlAddRsnCd = whfBlAddRsnCd;
		this.wgtUtCd = wgtUtCd;
		this.measQty = measQty;
		this.slsOfcCd = slsOfcCd;
		this.pckQty = pckQty;
		this.rcvTermCd = rcvTermCd;
		this.pckTpCd = pckTpCd;
		this.measUtCd = measUtCd;
		this.updUsrId = updUsrId;
		this.updDt = updDt;
		this.delCd = delCd;
		this.skdVoyNo = skdVoyNo;
		this.skdDirCd = skdDirCd;
		this.podCd = podCd;
		this.deTermCd = deTermCd;
		this.creUsrId = creUsrId;
		this.bkgNo = bkgNo;
		this.whfBlStsCd = whfBlStsCd;
		this.whfPodCd = whfPodCd;
		this.wgtQty = wgtQty;
		this.custRgstNo2 = custRgstNo2;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("por_cd", getPorCd());
		this.hashColumns.put("wfg_expt_cd", getWfgExptCd());
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("whf_bl_thru_ts_flg", getWhfBlThruTsFlg());
		this.hashColumns.put("whf_bnd_cd", getWhfBndCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("rton_wgt", getRtonWgt());
		this.hashColumns.put("rlane_cd", getRlaneCd());
		this.hashColumns.put("cust_rgst_no", getCustRgstNo());
		this.hashColumns.put("bl_no", getBlNo());
		this.hashColumns.put("whf_amt", getWhfAmt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("whf_bl_cgo_tp_cd", getWhfBlCgoTpCd());
		this.hashColumns.put("whf_pol_cd", getWhfPolCd());
		this.hashColumns.put("pol_cd", getPolCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cstms_decl_tp_cd", getCstmsDeclTpCd());
		this.hashColumns.put("cmdt_cd", getCmdtCd());
		this.hashColumns.put("whf_bl_add_rsn_cd", getWhfBlAddRsnCd());
		this.hashColumns.put("wgt_ut_cd", getWgtUtCd());
		this.hashColumns.put("meas_qty", getMeasQty());
		this.hashColumns.put("sls_ofc_cd", getSlsOfcCd());
		this.hashColumns.put("pck_qty", getPckQty());
		this.hashColumns.put("rcv_term_cd", getRcvTermCd());
		this.hashColumns.put("pck_tp_cd", getPckTpCd());
		this.hashColumns.put("meas_ut_cd", getMeasUtCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("del_cd", getDelCd());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("pod_cd", getPodCd());
		this.hashColumns.put("de_term_cd", getDeTermCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("whf_bl_sts_cd", getWhfBlStsCd());
		this.hashColumns.put("whf_pod_cd", getWhfPodCd());
		this.hashColumns.put("wgt_qty", getWgtQty());
		this.hashColumns.put("cust_rgst_no2", getCustRgstNo2());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("por_cd", "porCd");
		this.hashFields.put("wfg_expt_cd", "wfgExptCd");
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("whf_bl_thru_ts_flg", "whfBlThruTsFlg");
		this.hashFields.put("whf_bnd_cd", "whfBndCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("rton_wgt", "rtonWgt");
		this.hashFields.put("rlane_cd", "rlaneCd");
		this.hashFields.put("cust_rgst_no", "custRgstNo");
		this.hashFields.put("bl_no", "blNo");
		this.hashFields.put("whf_amt", "whfAmt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("whf_bl_cgo_tp_cd", "whfBlCgoTpCd");
		this.hashFields.put("whf_pol_cd", "whfPolCd");
		this.hashFields.put("pol_cd", "polCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cstms_decl_tp_cd", "cstmsDeclTpCd");
		this.hashFields.put("cmdt_cd", "cmdtCd");
		this.hashFields.put("whf_bl_add_rsn_cd", "whfBlAddRsnCd");
		this.hashFields.put("wgt_ut_cd", "wgtUtCd");
		this.hashFields.put("meas_qty", "measQty");
		this.hashFields.put("sls_ofc_cd", "slsOfcCd");
		this.hashFields.put("pck_qty", "pckQty");
		this.hashFields.put("rcv_term_cd", "rcvTermCd");
		this.hashFields.put("pck_tp_cd", "pckTpCd");
		this.hashFields.put("meas_ut_cd", "measUtCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("del_cd", "delCd");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("pod_cd", "podCd");
		this.hashFields.put("de_term_cd", "deTermCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("whf_bl_sts_cd", "whfBlStsCd");
		this.hashFields.put("whf_pod_cd", "whfPodCd");
		this.hashFields.put("wgt_qty", "wgtQty");
		this.hashFields.put("cust_rgst_no2", "custRgstNo2");
		return this.hashFields;
	}
	
	
	
	public String getCustRgstNo2() {
		return custRgstNo2;
	}

	public void setCustRgstNo2(String custRgstNo2) {
		this.custRgstNo2 = custRgstNo2;
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
	 * @return wfgExptCd
	 */
	public String getWfgExptCd() {
		return this.wfgExptCd;
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
	 * @return whfBlThruTsFlg
	 */
	public String getWhfBlThruTsFlg() {
		return this.whfBlThruTsFlg;
	}
	
	/**
	 * Column Info
	 * @return whfBndCd
	 */
	public String getWhfBndCd() {
		return this.whfBndCd;
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
	 * @return rtonWgt
	 */
	public String getRtonWgt() {
		return this.rtonWgt;
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
	 * @return custRgstNo
	 */
	public String getCustRgstNo() {
		return this.custRgstNo;
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
	 * @return whfAmt
	 */
	public String getWhfAmt() {
		return this.whfAmt;
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
	 * @return whfBlCgoTpCd
	 */
	public String getWhfBlCgoTpCd() {
		return this.whfBlCgoTpCd;
	}
	
	/**
	 * Column Info
	 * @return whfPolCd
	 */
	public String getWhfPolCd() {
		return this.whfPolCd;
	}
	
	/**
	 * Column Info
	 * @return polCd
	 */
	public String getPolCd() {
		return this.polCd;
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
	 * @return cstmsDeclTpCd
	 */
	public String getCstmsDeclTpCd() {
		return this.cstmsDeclTpCd;
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
	 * @return whfBlAddRsnCd
	 */
	public String getWhfBlAddRsnCd() {
		return this.whfBlAddRsnCd;
	}
	
	/**
	 * Column Info
	 * @return wgtUtCd
	 */
	public String getWgtUtCd() {
		return this.wgtUtCd;
	}
	
	/**
	 * Column Info
	 * @return measQty
	 */
	public String getMeasQty() {
		return this.measQty;
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
	 * @return pckQty
	 */
	public String getPckQty() {
		return this.pckQty;
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
	 * @return pckTpCd
	 */
	public String getPckTpCd() {
		return this.pckTpCd;
	}
	
	/**
	 * Column Info
	 * @return measUtCd
	 */
	public String getMeasUtCd() {
		return this.measUtCd;
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
	 * @return skdDirCd
	 */
	public String getSkdDirCd() {
		return this.skdDirCd;
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
	 * @return whfBlStsCd
	 */
	public String getWhfBlStsCd() {
		return this.whfBlStsCd;
	}
	
	/**
	 * Column Info
	 * @return whfPodCd
	 */
	public String getWhfPodCd() {
		return this.whfPodCd;
	}
	
	/**
	 * Column Info
	 * @return wgtQty
	 */
	public String getWgtQty() {
		return this.wgtQty;
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
	 * @param wfgExptCd
	 */
	public void setWfgExptCd(String wfgExptCd) {
		this.wfgExptCd = wfgExptCd;
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
	 * @param whfBlThruTsFlg
	 */
	public void setWhfBlThruTsFlg(String whfBlThruTsFlg) {
		this.whfBlThruTsFlg = whfBlThruTsFlg;
	}
	
	/**
	 * Column Info
	 * @param whfBndCd
	 */
	public void setWhfBndCd(String whfBndCd) {
		this.whfBndCd = whfBndCd;
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
	 * @param rtonWgt
	 */
	public void setRtonWgt(String rtonWgt) {
		this.rtonWgt = rtonWgt;
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
	 * @param custRgstNo
	 */
	public void setCustRgstNo(String custRgstNo) {
		this.custRgstNo = custRgstNo;
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
	 * @param whfAmt
	 */
	public void setWhfAmt(String whfAmt) {
		this.whfAmt = whfAmt;
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
	 * @param whfBlCgoTpCd
	 */
	public void setWhfBlCgoTpCd(String whfBlCgoTpCd) {
		this.whfBlCgoTpCd = whfBlCgoTpCd;
	}
	
	/**
	 * Column Info
	 * @param whfPolCd
	 */
	public void setWhfPolCd(String whfPolCd) {
		this.whfPolCd = whfPolCd;
	}
	
	/**
	 * Column Info
	 * @param polCd
	 */
	public void setPolCd(String polCd) {
		this.polCd = polCd;
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
	 * @param cstmsDeclTpCd
	 */
	public void setCstmsDeclTpCd(String cstmsDeclTpCd) {
		this.cstmsDeclTpCd = cstmsDeclTpCd;
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
	 * @param whfBlAddRsnCd
	 */
	public void setWhfBlAddRsnCd(String whfBlAddRsnCd) {
		this.whfBlAddRsnCd = whfBlAddRsnCd;
	}
	
	/**
	 * Column Info
	 * @param wgtUtCd
	 */
	public void setWgtUtCd(String wgtUtCd) {
		this.wgtUtCd = wgtUtCd;
	}
	
	/**
	 * Column Info
	 * @param measQty
	 */
	public void setMeasQty(String measQty) {
		this.measQty = measQty;
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
	 * @param pckQty
	 */
	public void setPckQty(String pckQty) {
		this.pckQty = pckQty;
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
	 * @param pckTpCd
	 */
	public void setPckTpCd(String pckTpCd) {
		this.pckTpCd = pckTpCd;
	}
	
	/**
	 * Column Info
	 * @param measUtCd
	 */
	public void setMeasUtCd(String measUtCd) {
		this.measUtCd = measUtCd;
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
	 * @param skdDirCd
	 */
	public void setSkdDirCd(String skdDirCd) {
		this.skdDirCd = skdDirCd;
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
	 * @param whfBlStsCd
	 */
	public void setWhfBlStsCd(String whfBlStsCd) {
		this.whfBlStsCd = whfBlStsCd;
	}
	
	/**
	 * Column Info
	 * @param whfPodCd
	 */
	public void setWhfPodCd(String whfPodCd) {
		this.whfPodCd = whfPodCd;
	}
	
	/**
	 * Column Info
	 * @param wgtQty
	 */
	public void setWgtQty(String wgtQty) {
		this.wgtQty = wgtQty;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setPorCd(JSPUtil.getParameter(request, "por_cd", ""));
		setWfgExptCd(JSPUtil.getParameter(request, "wfg_expt_cd", ""));
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setWhfBlThruTsFlg(JSPUtil.getParameter(request, "whf_bl_thru_ts_flg", ""));
		setWhfBndCd(JSPUtil.getParameter(request, "whf_bnd_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setRtonWgt(JSPUtil.getParameter(request, "rton_wgt", ""));
		setRlaneCd(JSPUtil.getParameter(request, "rlane_cd", ""));
		setCustRgstNo(JSPUtil.getParameter(request, "cust_rgst_no", ""));
		setBlNo(JSPUtil.getParameter(request, "bl_no", ""));
		setWhfAmt(JSPUtil.getParameter(request, "whf_amt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setWhfBlCgoTpCd(JSPUtil.getParameter(request, "whf_bl_cgo_tp_cd", ""));
		setWhfPolCd(JSPUtil.getParameter(request, "whf_pol_cd", ""));
		setPolCd(JSPUtil.getParameter(request, "pol_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCstmsDeclTpCd(JSPUtil.getParameter(request, "cstms_decl_tp_cd", ""));
		setCmdtCd(JSPUtil.getParameter(request, "cmdt_cd", ""));
		setWhfBlAddRsnCd(JSPUtil.getParameter(request, "whf_bl_add_rsn_cd", ""));
		setWgtUtCd(JSPUtil.getParameter(request, "wgt_ut_cd", ""));
		setMeasQty(JSPUtil.getParameter(request, "meas_qty", ""));
		setSlsOfcCd(JSPUtil.getParameter(request, "sls_ofc_cd", ""));
		setPckQty(JSPUtil.getParameter(request, "pck_qty", ""));
		setRcvTermCd(JSPUtil.getParameter(request, "rcv_term_cd", ""));
		setPckTpCd(JSPUtil.getParameter(request, "pck_tp_cd", ""));
		setMeasUtCd(JSPUtil.getParameter(request, "meas_ut_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setDelCd(JSPUtil.getParameter(request, "del_cd", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, "skd_voy_no", ""));
		setSkdDirCd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
		setPodCd(JSPUtil.getParameter(request, "pod_cd", ""));
		setDeTermCd(JSPUtil.getParameter(request, "de_term_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setWhfBlStsCd(JSPUtil.getParameter(request, "whf_bl_sts_cd", ""));
		setWhfPodCd(JSPUtil.getParameter(request, "whf_pod_cd", ""));
		setWgtQty(JSPUtil.getParameter(request, "wgt_qty", ""));
		setCustRgstNo2(JSPUtil.getParameter(request, "cust_rgst_no2", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgKrWhfBlVO[]
	 */
	public BkgKrWhfBlVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgKrWhfBlVO[]
	 */
	public BkgKrWhfBlVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgKrWhfBlVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] porCd = (JSPUtil.getParameter(request, prefix	+ "por_cd", length));
			String[] wfgExptCd = (JSPUtil.getParameter(request, prefix	+ "wfg_expt_cd", length));
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] whfBlThruTsFlg = (JSPUtil.getParameter(request, prefix	+ "whf_bl_thru_ts_flg", length));
			String[] whfBndCd = (JSPUtil.getParameter(request, prefix	+ "whf_bnd_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] rtonWgt = (JSPUtil.getParameter(request, prefix	+ "rton_wgt", length));
			String[] rlaneCd = (JSPUtil.getParameter(request, prefix	+ "rlane_cd", length));
			String[] custRgstNo = (JSPUtil.getParameter(request, prefix	+ "cust_rgst_no", length));
			String[] blNo = (JSPUtil.getParameter(request, prefix	+ "bl_no", length));
			String[] whfAmt = (JSPUtil.getParameter(request, prefix	+ "whf_amt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] whfBlCgoTpCd = (JSPUtil.getParameter(request, prefix	+ "whf_bl_cgo_tp_cd", length));
			String[] whfPolCd = (JSPUtil.getParameter(request, prefix	+ "whf_pol_cd", length));
			String[] polCd = (JSPUtil.getParameter(request, prefix	+ "pol_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] cstmsDeclTpCd = (JSPUtil.getParameter(request, prefix	+ "cstms_decl_tp_cd", length));
			String[] cmdtCd = (JSPUtil.getParameter(request, prefix	+ "cmdt_cd", length));
			String[] whfBlAddRsnCd = (JSPUtil.getParameter(request, prefix	+ "whf_bl_add_rsn_cd", length));
			String[] wgtUtCd = (JSPUtil.getParameter(request, prefix	+ "wgt_ut_cd", length));
			String[] measQty = (JSPUtil.getParameter(request, prefix	+ "meas_qty", length));
			String[] slsOfcCd = (JSPUtil.getParameter(request, prefix	+ "sls_ofc_cd", length));
			String[] pckQty = (JSPUtil.getParameter(request, prefix	+ "pck_qty", length));
			String[] rcvTermCd = (JSPUtil.getParameter(request, prefix	+ "rcv_term_cd", length));
			String[] pckTpCd = (JSPUtil.getParameter(request, prefix	+ "pck_tp_cd", length));
			String[] measUtCd = (JSPUtil.getParameter(request, prefix	+ "meas_ut_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] delCd = (JSPUtil.getParameter(request, prefix	+ "del_cd", length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no", length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd", length));
			String[] podCd = (JSPUtil.getParameter(request, prefix	+ "pod_cd", length));
			String[] deTermCd = (JSPUtil.getParameter(request, prefix	+ "de_term_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] whfBlStsCd = (JSPUtil.getParameter(request, prefix	+ "whf_bl_sts_cd", length));
			String[] whfPodCd = (JSPUtil.getParameter(request, prefix	+ "whf_pod_cd", length));
			String[] wgtQty = (JSPUtil.getParameter(request, prefix	+ "wgt_qty", length));
			String[] custRgstNo2 = (JSPUtil.getParameter(request, prefix	+ "cust_rgst_no2", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgKrWhfBlVO();
				if (porCd[i] != null)
					model.setPorCd(porCd[i]);
				if (wfgExptCd[i] != null)
					model.setWfgExptCd(wfgExptCd[i]);
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (whfBlThruTsFlg[i] != null)
					model.setWhfBlThruTsFlg(whfBlThruTsFlg[i]);
				if (whfBndCd[i] != null)
					model.setWhfBndCd(whfBndCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (rtonWgt[i] != null)
					model.setRtonWgt(rtonWgt[i]);
				if (rlaneCd[i] != null)
					model.setRlaneCd(rlaneCd[i]);
				if (custRgstNo[i] != null)
					model.setCustRgstNo(custRgstNo[i]);
				if (blNo[i] != null)
					model.setBlNo(blNo[i]);
				if (whfAmt[i] != null)
					model.setWhfAmt(whfAmt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (whfBlCgoTpCd[i] != null)
					model.setWhfBlCgoTpCd(whfBlCgoTpCd[i]);
				if (whfPolCd[i] != null)
					model.setWhfPolCd(whfPolCd[i]);
				if (polCd[i] != null)
					model.setPolCd(polCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (cstmsDeclTpCd[i] != null)
					model.setCstmsDeclTpCd(cstmsDeclTpCd[i]);
				if (cmdtCd[i] != null)
					model.setCmdtCd(cmdtCd[i]);
				if (whfBlAddRsnCd[i] != null)
					model.setWhfBlAddRsnCd(whfBlAddRsnCd[i]);
				if (wgtUtCd[i] != null)
					model.setWgtUtCd(wgtUtCd[i]);
				if (measQty[i] != null)
					model.setMeasQty(measQty[i]);
				if (slsOfcCd[i] != null)
					model.setSlsOfcCd(slsOfcCd[i]);
				if (pckQty[i] != null)
					model.setPckQty(pckQty[i]);
				if (rcvTermCd[i] != null)
					model.setRcvTermCd(rcvTermCd[i]);
				if (pckTpCd[i] != null)
					model.setPckTpCd(pckTpCd[i]);
				if (measUtCd[i] != null)
					model.setMeasUtCd(measUtCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (delCd[i] != null)
					model.setDelCd(delCd[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (podCd[i] != null)
					model.setPodCd(podCd[i]);
				if (deTermCd[i] != null)
					model.setDeTermCd(deTermCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (whfBlStsCd[i] != null)
					model.setWhfBlStsCd(whfBlStsCd[i]);
				if (whfPodCd[i] != null)
					model.setWhfPodCd(whfPodCd[i]);
				if (wgtQty[i] != null)
					model.setWgtQty(wgtQty[i]);
				if (custRgstNo2[i] != null)
					model.setCustRgstNo2(custRgstNo2[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgKrWhfBlVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgKrWhfBlVO[]
	 */
	public BkgKrWhfBlVO[] getBkgKrWhfBlVOs(){
		BkgKrWhfBlVO[] vos = (BkgKrWhfBlVO[])models.toArray(new BkgKrWhfBlVO[models.size()]);
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
		this.porCd = this.porCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.wfgExptCd = this.wfgExptCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.whfBlThruTsFlg = this.whfBlThruTsFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.whfBndCd = this.whfBndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rtonWgt = this.rtonWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rlaneCd = this.rlaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custRgstNo = this.custRgstNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blNo = this.blNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.whfAmt = this.whfAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.whfBlCgoTpCd = this.whfBlCgoTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.whfPolCd = this.whfPolCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.polCd = this.polCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cstmsDeclTpCd = this.cstmsDeclTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cmdtCd = this.cmdtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.whfBlAddRsnCd = this.whfBlAddRsnCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.wgtUtCd = this.wgtUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.measQty = this.measQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slsOfcCd = this.slsOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pckQty = this.pckQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcvTermCd = this.rcvTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pckTpCd = this.pckTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.measUtCd = this.measUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.delCd = this.delCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.podCd = this.podCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deTermCd = this.deTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.whfBlStsCd = this.whfBlStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.whfPodCd = this.whfPodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.wgtQty = this.wgtQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custRgstNo2 = this.custRgstNo2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
