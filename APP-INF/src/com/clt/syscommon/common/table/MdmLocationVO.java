/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : MdmLocationVO.java
*@FileTitle : MdmLocationVO
*Open Issues :
*Change history :
*@LastModifyDate : 2010.04.28
*@LastModifier : 
*@LastVersion : 1.0
* 2010.04.28  
* 1.0 Creation
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
 * @author 
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class MdmLocationVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<MdmLocationVO> models = new ArrayList<MdmLocationVO>();
	
	/* Column Info */
	private String rgnCd = null;
	/* Column Info */
	private String bfrEqCtrlOfcCd = null;
	/* Column Info */
	private String unLocCd = null;
	/* Column Info */
	private String portInlndCd = null;
	/* Column Info */
	private String cstmsCd = null;
	/* Column Info */
	private String mtyPkupYdCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String locCd = null;
	/* Column Info */
	private String vopLocUrl = null;
	/* Column Info */
	private String slsOfcCd = null;
	/* Column Info */
	private String cntCd = null;
	/* Column Info */
	private String locChrCd = null;
	/* Column Info */
	private String bfrOfcCngDt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String repZnCd = null;
	/* Column Info */
	private String locNm = null;
	/* Column Info */
	private String vskdPortRhqCd = null;
	/* Column Info */
	private String latUtCd = null;
	/* Column Info */
	private String locGrdNo = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String eqRtnYdCd = null;
	/* Column Info */
	private String locLon = null;
	/* Column Info */
	private String zipCd = null;
	/* Column Info */
	private String fincCtrlOfcCd = null;
	/* Column Info */
	private String senEqOfcCd = null;
	/* Column Info */
	private String locTpCd = null;
	/* Column Info */
	private String lonUtCd = null;
	/* Column Info */
	private String contiCd = null;
	/* Column Info */
	private String vopBnkPortFlg = null;
	/* Column Info */
	private String gmtHrs = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String eqCtrlOfcCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String cmlZnFlg = null;
	/* Column Info */
	private String exptCustSvcOfcCd = null;
	/* Column Info */
	private String locAmsPortCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String bfrFincCtrlOfcCd = null;
	/* Column Info */
	private String vopPortRhqCd = null;
	/* Column Info */
	private String bkgBlPfxCd = null;
	/* Column Info */
	private String vopPortMntrFlg = null;
	/* Column Info */
	private String locLoclLangNm = null;
	/* Column Info */
	private String vopPortFlg = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String callPortFlg = null;
	/* Column Info */
	private String unLocIndCd = null;
	/* Column Info */
	private String eaiEvntDt = null;
	/* Column Info */
	private String eaiIfId = null;
	/* Column Info */
	private String exptLgsOfcCd = null;
	/* Column Info */
	private String vopPortCtrlOfcCd = null;
	/* Column Info */
	private String sccCd = null;
	/* Column Info */
	private String blkPortFlg = null;
	/* Column Info */
	private String locLat = null;
	/* Column Info */
	private String steCd = null;
	/* Column Info */
	private String hubLocCd = null;
	/* Column Info */
	private String bfrSlsOfcCd = null;
	/* Column Info */
	private String scontiCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public MdmLocationVO() {}

	public MdmLocationVO(String ibflag, String pagerows, String locCd, String sccCd, String locNm, String rgnCd, String cntCd, String steCd, String contiCd, String portInlndCd, String locChrCd, String blkPortFlg, String hubLocCd, String slsOfcCd, String locGrdNo, String gmtHrs, String bkgBlPfxCd, String callPortFlg, String locAmsPortCd, String fincCtrlOfcCd, String eqCtrlOfcCd, String mtyPkupYdCd, String senEqOfcCd, String eqRtnYdCd, String unLocIndCd, String unLocCd, String cmlZnFlg, String cstmsCd, String locTpCd, String bfrFincCtrlOfcCd, String bfrEqCtrlOfcCd, String bfrSlsOfcCd, String bfrOfcCngDt, String repZnCd, String zipCd, String scontiCd, String exptLgsOfcCd, String exptCustSvcOfcCd, String vopPortRhqCd, String vopPortCtrlOfcCd, String vopPortMntrFlg, String vopLocUrl, String vopPortFlg, String vopBnkPortFlg, String locLoclLangNm, String creUsrId, String creDt, String updUsrId, String updDt, String deltFlg, String eaiEvntDt, String eaiIfId, String vskdPortRhqCd, String locLat, String latUtCd, String locLon, String lonUtCd) {
		this.rgnCd = rgnCd;
		this.bfrEqCtrlOfcCd = bfrEqCtrlOfcCd;
		this.unLocCd = unLocCd;
		this.portInlndCd = portInlndCd;
		this.cstmsCd = cstmsCd;
		this.mtyPkupYdCd = mtyPkupYdCd;
		this.pagerows = pagerows;
		this.locCd = locCd;
		this.vopLocUrl = vopLocUrl;
		this.slsOfcCd = slsOfcCd;
		this.cntCd = cntCd;
		this.locChrCd = locChrCd;
		this.bfrOfcCngDt = bfrOfcCngDt;
		this.updUsrId = updUsrId;
		this.repZnCd = repZnCd;
		this.locNm = locNm;
		this.vskdPortRhqCd = vskdPortRhqCd;
		this.latUtCd = latUtCd;
		this.locGrdNo = locGrdNo;
		this.creUsrId = creUsrId;
		this.eqRtnYdCd = eqRtnYdCd;
		this.locLon = locLon;
		this.zipCd = zipCd;
		this.fincCtrlOfcCd = fincCtrlOfcCd;
		this.senEqOfcCd = senEqOfcCd;
		this.locTpCd = locTpCd;
		this.lonUtCd = lonUtCd;
		this.contiCd = contiCd;
		this.vopBnkPortFlg = vopBnkPortFlg;
		this.gmtHrs = gmtHrs;
		this.deltFlg = deltFlg;
		this.eqCtrlOfcCd = eqCtrlOfcCd;
		this.creDt = creDt;
		this.cmlZnFlg = cmlZnFlg;
		this.exptCustSvcOfcCd = exptCustSvcOfcCd;
		this.locAmsPortCd = locAmsPortCd;
		this.ibflag = ibflag;
		this.bfrFincCtrlOfcCd = bfrFincCtrlOfcCd;
		this.vopPortRhqCd = vopPortRhqCd;
		this.bkgBlPfxCd = bkgBlPfxCd;
		this.vopPortMntrFlg = vopPortMntrFlg;
		this.locLoclLangNm = locLoclLangNm;
		this.vopPortFlg = vopPortFlg;
		this.updDt = updDt;
		this.callPortFlg = callPortFlg;
		this.unLocIndCd = unLocIndCd;
		this.eaiEvntDt = eaiEvntDt;
		this.eaiIfId = eaiIfId;
		this.exptLgsOfcCd = exptLgsOfcCd;
		this.vopPortCtrlOfcCd = vopPortCtrlOfcCd;
		this.sccCd = sccCd;
		this.blkPortFlg = blkPortFlg;
		this.locLat = locLat;
		this.steCd = steCd;
		this.hubLocCd = hubLocCd;
		this.bfrSlsOfcCd = bfrSlsOfcCd;
		this.scontiCd = scontiCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("rgn_cd", getRgnCd());
		this.hashColumns.put("bfr_eq_ctrl_ofc_cd", getBfrEqCtrlOfcCd());
		this.hashColumns.put("un_loc_cd", getUnLocCd());
		this.hashColumns.put("port_inlnd_cd", getPortInlndCd());
		this.hashColumns.put("cstms_cd", getCstmsCd());
		this.hashColumns.put("mty_pkup_yd_cd", getMtyPkupYdCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("loc_cd", getLocCd());
		this.hashColumns.put("vop_loc_url", getVopLocUrl());
		this.hashColumns.put("sls_ofc_cd", getSlsOfcCd());
		this.hashColumns.put("cnt_cd", getCntCd());
		this.hashColumns.put("loc_chr_cd", getLocChrCd());
		this.hashColumns.put("bfr_ofc_cng_dt", getBfrOfcCngDt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("rep_zn_cd", getRepZnCd());
		this.hashColumns.put("loc_nm", getLocNm());
		this.hashColumns.put("vskd_port_rhq_cd", getVskdPortRhqCd());
		this.hashColumns.put("lat_ut_cd", getLatUtCd());
		this.hashColumns.put("loc_grd_no", getLocGrdNo());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("eq_rtn_yd_cd", getEqRtnYdCd());
		this.hashColumns.put("loc_lon", getLocLon());
		this.hashColumns.put("zip_cd", getZipCd());
		this.hashColumns.put("finc_ctrl_ofc_cd", getFincCtrlOfcCd());
		this.hashColumns.put("sen_eq_ofc_cd", getSenEqOfcCd());
		this.hashColumns.put("loc_tp_cd", getLocTpCd());
		this.hashColumns.put("lon_ut_cd", getLonUtCd());
		this.hashColumns.put("conti_cd", getContiCd());
		this.hashColumns.put("vop_bnk_port_flg", getVopBnkPortFlg());
		this.hashColumns.put("gmt_hrs", getGmtHrs());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("eq_ctrl_ofc_cd", getEqCtrlOfcCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("cml_zn_flg", getCmlZnFlg());
		this.hashColumns.put("expt_cust_svc_ofc_cd", getExptCustSvcOfcCd());
		this.hashColumns.put("loc_ams_port_cd", getLocAmsPortCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("bfr_finc_ctrl_ofc_cd", getBfrFincCtrlOfcCd());
		this.hashColumns.put("vop_port_rhq_cd", getVopPortRhqCd());
		this.hashColumns.put("bkg_bl_pfx_cd", getBkgBlPfxCd());
		this.hashColumns.put("vop_port_mntr_flg", getVopPortMntrFlg());
		this.hashColumns.put("loc_locl_lang_nm", getLocLoclLangNm());
		this.hashColumns.put("vop_port_flg", getVopPortFlg());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("call_port_flg", getCallPortFlg());
		this.hashColumns.put("un_loc_ind_cd", getUnLocIndCd());
		this.hashColumns.put("eai_evnt_dt", getEaiEvntDt());
		this.hashColumns.put("eai_if_id", getEaiIfId());
		this.hashColumns.put("expt_lgs_ofc_cd", getExptLgsOfcCd());
		this.hashColumns.put("vop_port_ctrl_ofc_cd", getVopPortCtrlOfcCd());
		this.hashColumns.put("scc_cd", getSccCd());
		this.hashColumns.put("blk_port_flg", getBlkPortFlg());
		this.hashColumns.put("loc_lat", getLocLat());
		this.hashColumns.put("ste_cd", getSteCd());
		this.hashColumns.put("hub_loc_cd", getHubLocCd());
		this.hashColumns.put("bfr_sls_ofc_cd", getBfrSlsOfcCd());
		this.hashColumns.put("sconti_cd", getScontiCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("rgn_cd", "rgnCd");
		this.hashFields.put("bfr_eq_ctrl_ofc_cd", "bfrEqCtrlOfcCd");
		this.hashFields.put("un_loc_cd", "unLocCd");
		this.hashFields.put("port_inlnd_cd", "portInlndCd");
		this.hashFields.put("cstms_cd", "cstmsCd");
		this.hashFields.put("mty_pkup_yd_cd", "mtyPkupYdCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("loc_cd", "locCd");
		this.hashFields.put("vop_loc_url", "vopLocUrl");
		this.hashFields.put("sls_ofc_cd", "slsOfcCd");
		this.hashFields.put("cnt_cd", "cntCd");
		this.hashFields.put("loc_chr_cd", "locChrCd");
		this.hashFields.put("bfr_ofc_cng_dt", "bfrOfcCngDt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("rep_zn_cd", "repZnCd");
		this.hashFields.put("loc_nm", "locNm");
		this.hashFields.put("vskd_port_rhq_cd", "vskdPortRhqCd");
		this.hashFields.put("lat_ut_cd", "latUtCd");
		this.hashFields.put("loc_grd_no", "locGrdNo");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("eq_rtn_yd_cd", "eqRtnYdCd");
		this.hashFields.put("loc_lon", "locLon");
		this.hashFields.put("zip_cd", "zipCd");
		this.hashFields.put("finc_ctrl_ofc_cd", "fincCtrlOfcCd");
		this.hashFields.put("sen_eq_ofc_cd", "senEqOfcCd");
		this.hashFields.put("loc_tp_cd", "locTpCd");
		this.hashFields.put("lon_ut_cd", "lonUtCd");
		this.hashFields.put("conti_cd", "contiCd");
		this.hashFields.put("vop_bnk_port_flg", "vopBnkPortFlg");
		this.hashFields.put("gmt_hrs", "gmtHrs");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("eq_ctrl_ofc_cd", "eqCtrlOfcCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("cml_zn_flg", "cmlZnFlg");
		this.hashFields.put("expt_cust_svc_ofc_cd", "exptCustSvcOfcCd");
		this.hashFields.put("loc_ams_port_cd", "locAmsPortCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("bfr_finc_ctrl_ofc_cd", "bfrFincCtrlOfcCd");
		this.hashFields.put("vop_port_rhq_cd", "vopPortRhqCd");
		this.hashFields.put("bkg_bl_pfx_cd", "bkgBlPfxCd");
		this.hashFields.put("vop_port_mntr_flg", "vopPortMntrFlg");
		this.hashFields.put("loc_locl_lang_nm", "locLoclLangNm");
		this.hashFields.put("vop_port_flg", "vopPortFlg");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("call_port_flg", "callPortFlg");
		this.hashFields.put("un_loc_ind_cd", "unLocIndCd");
		this.hashFields.put("eai_evnt_dt", "eaiEvntDt");
		this.hashFields.put("eai_if_id", "eaiIfId");
		this.hashFields.put("expt_lgs_ofc_cd", "exptLgsOfcCd");
		this.hashFields.put("vop_port_ctrl_ofc_cd", "vopPortCtrlOfcCd");
		this.hashFields.put("scc_cd", "sccCd");
		this.hashFields.put("blk_port_flg", "blkPortFlg");
		this.hashFields.put("loc_lat", "locLat");
		this.hashFields.put("ste_cd", "steCd");
		this.hashFields.put("hub_loc_cd", "hubLocCd");
		this.hashFields.put("bfr_sls_ofc_cd", "bfrSlsOfcCd");
		this.hashFields.put("sconti_cd", "scontiCd");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return rgnCd
	 */
	public String getRgnCd() {
		return this.rgnCd;
	}
	
	/**
	 * Column Info
	 * @return bfrEqCtrlOfcCd
	 */
	public String getBfrEqCtrlOfcCd() {
		return this.bfrEqCtrlOfcCd;
	}
	
	/**
	 * Column Info
	 * @return unLocCd
	 */
	public String getUnLocCd() {
		return this.unLocCd;
	}
	
	/**
	 * Column Info
	 * @return portInlndCd
	 */
	public String getPortInlndCd() {
		return this.portInlndCd;
	}
	
	/**
	 * Column Info
	 * @return cstmsCd
	 */
	public String getCstmsCd() {
		return this.cstmsCd;
	}
	
	/**
	 * Column Info
	 * @return mtyPkupYdCd
	 */
	public String getMtyPkupYdCd() {
		return this.mtyPkupYdCd;
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
	 * @return locCd
	 */
	public String getLocCd() {
		return this.locCd;
	}
	
	/**
	 * Column Info
	 * @return vopLocUrl
	 */
	public String getVopLocUrl() {
		return this.vopLocUrl;
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
	 * @return cntCd
	 */
	public String getCntCd() {
		return this.cntCd;
	}
	
	/**
	 * Column Info
	 * @return locChrCd
	 */
	public String getLocChrCd() {
		return this.locChrCd;
	}
	
	/**
	 * Column Info
	 * @return bfrOfcCngDt
	 */
	public String getBfrOfcCngDt() {
		return this.bfrOfcCngDt;
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
	 * @return repZnCd
	 */
	public String getRepZnCd() {
		return this.repZnCd;
	}
	
	/**
	 * Column Info
	 * @return locNm
	 */
	public String getLocNm() {
		return this.locNm;
	}
	
	/**
	 * Column Info
	 * @return vskdPortRhqCd
	 */
	public String getVskdPortRhqCd() {
		return this.vskdPortRhqCd;
	}
	
	/**
	 * Column Info
	 * @return latUtCd
	 */
	public String getLatUtCd() {
		return this.latUtCd;
	}
	
	/**
	 * Column Info
	 * @return locGrdNo
	 */
	public String getLocGrdNo() {
		return this.locGrdNo;
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
	 * @return eqRtnYdCd
	 */
	public String getEqRtnYdCd() {
		return this.eqRtnYdCd;
	}
	
	/**
	 * Column Info
	 * @return locLon
	 */
	public String getLocLon() {
		return this.locLon;
	}
	
	/**
	 * Column Info
	 * @return zipCd
	 */
	public String getZipCd() {
		return this.zipCd;
	}
	
	/**
	 * Column Info
	 * @return fincCtrlOfcCd
	 */
	public String getFincCtrlOfcCd() {
		return this.fincCtrlOfcCd;
	}
	
	/**
	 * Column Info
	 * @return senEqOfcCd
	 */
	public String getSenEqOfcCd() {
		return this.senEqOfcCd;
	}
	
	/**
	 * Column Info
	 * @return locTpCd
	 */
	public String getLocTpCd() {
		return this.locTpCd;
	}
	
	/**
	 * Column Info
	 * @return lonUtCd
	 */
	public String getLonUtCd() {
		return this.lonUtCd;
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
	 * @return vopBnkPortFlg
	 */
	public String getVopBnkPortFlg() {
		return this.vopBnkPortFlg;
	}
	
	/**
	 * Column Info
	 * @return gmtHrs
	 */
	public String getGmtHrs() {
		return this.gmtHrs;
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
	 * @return cmlZnFlg
	 */
	public String getCmlZnFlg() {
		return this.cmlZnFlg;
	}
	
	/**
	 * Column Info
	 * @return exptCustSvcOfcCd
	 */
	public String getExptCustSvcOfcCd() {
		return this.exptCustSvcOfcCd;
	}
	
	/**
	 * Column Info
	 * @return locAmsPortCd
	 */
	public String getLocAmsPortCd() {
		return this.locAmsPortCd;
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
	 * @return bfrFincCtrlOfcCd
	 */
	public String getBfrFincCtrlOfcCd() {
		return this.bfrFincCtrlOfcCd;
	}
	
	/**
	 * Column Info
	 * @return vopPortRhqCd
	 */
	public String getVopPortRhqCd() {
		return this.vopPortRhqCd;
	}
	
	/**
	 * Column Info
	 * @return bkgBlPfxCd
	 */
	public String getBkgBlPfxCd() {
		return this.bkgBlPfxCd;
	}
	
	/**
	 * Column Info
	 * @return vopPortMntrFlg
	 */
	public String getVopPortMntrFlg() {
		return this.vopPortMntrFlg;
	}
	
	/**
	 * Column Info
	 * @return locLoclLangNm
	 */
	public String getLocLoclLangNm() {
		return this.locLoclLangNm;
	}
	
	/**
	 * Column Info
	 * @return vopPortFlg
	 */
	public String getVopPortFlg() {
		return this.vopPortFlg;
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
	 * @return callPortFlg
	 */
	public String getCallPortFlg() {
		return this.callPortFlg;
	}
	
	/**
	 * Column Info
	 * @return unLocIndCd
	 */
	public String getUnLocIndCd() {
		return this.unLocIndCd;
	}
	
	/**
	 * Column Info
	 * @return eaiEvntDt
	 */
	public String getEaiEvntDt() {
		return this.eaiEvntDt;
	}
	
	/**
	 * Column Info
	 * @return eaiIfId
	 */
	public String getEaiIfId() {
		return this.eaiIfId;
	}
	
	/**
	 * Column Info
	 * @return exptLgsOfcCd
	 */
	public String getExptLgsOfcCd() {
		return this.exptLgsOfcCd;
	}
	
	/**
	 * Column Info
	 * @return vopPortCtrlOfcCd
	 */
	public String getVopPortCtrlOfcCd() {
		return this.vopPortCtrlOfcCd;
	}
	
	/**
	 * Column Info
	 * @return sccCd
	 */
	public String getSccCd() {
		return this.sccCd;
	}
	
	/**
	 * Column Info
	 * @return blkPortFlg
	 */
	public String getBlkPortFlg() {
		return this.blkPortFlg;
	}
	
	/**
	 * Column Info
	 * @return locLat
	 */
	public String getLocLat() {
		return this.locLat;
	}
	
	/**
	 * Column Info
	 * @return steCd
	 */
	public String getSteCd() {
		return this.steCd;
	}
	
	/**
	 * Column Info
	 * @return hubLocCd
	 */
	public String getHubLocCd() {
		return this.hubLocCd;
	}
	
	/**
	 * Column Info
	 * @return bfrSlsOfcCd
	 */
	public String getBfrSlsOfcCd() {
		return this.bfrSlsOfcCd;
	}
	
	/**
	 * Column Info
	 * @return scontiCd
	 */
	public String getScontiCd() {
		return this.scontiCd;
	}
	

	/**
	 * Column Info
	 * @param rgnCd
	 */
	public void setRgnCd(String rgnCd) {
		this.rgnCd = rgnCd;
	}
	
	/**
	 * Column Info
	 * @param bfrEqCtrlOfcCd
	 */
	public void setBfrEqCtrlOfcCd(String bfrEqCtrlOfcCd) {
		this.bfrEqCtrlOfcCd = bfrEqCtrlOfcCd;
	}
	
	/**
	 * Column Info
	 * @param unLocCd
	 */
	public void setUnLocCd(String unLocCd) {
		this.unLocCd = unLocCd;
	}
	
	/**
	 * Column Info
	 * @param portInlndCd
	 */
	public void setPortInlndCd(String portInlndCd) {
		this.portInlndCd = portInlndCd;
	}
	
	/**
	 * Column Info
	 * @param cstmsCd
	 */
	public void setCstmsCd(String cstmsCd) {
		this.cstmsCd = cstmsCd;
	}
	
	/**
	 * Column Info
	 * @param mtyPkupYdCd
	 */
	public void setMtyPkupYdCd(String mtyPkupYdCd) {
		this.mtyPkupYdCd = mtyPkupYdCd;
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
	 * @param locCd
	 */
	public void setLocCd(String locCd) {
		this.locCd = locCd;
	}
	
	/**
	 * Column Info
	 * @param vopLocUrl
	 */
	public void setVopLocUrl(String vopLocUrl) {
		this.vopLocUrl = vopLocUrl;
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
	 * @param cntCd
	 */
	public void setCntCd(String cntCd) {
		this.cntCd = cntCd;
	}
	
	/**
	 * Column Info
	 * @param locChrCd
	 */
	public void setLocChrCd(String locChrCd) {
		this.locChrCd = locChrCd;
	}
	
	/**
	 * Column Info
	 * @param bfrOfcCngDt
	 */
	public void setBfrOfcCngDt(String bfrOfcCngDt) {
		this.bfrOfcCngDt = bfrOfcCngDt;
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
	 * @param repZnCd
	 */
	public void setRepZnCd(String repZnCd) {
		this.repZnCd = repZnCd;
	}
	
	/**
	 * Column Info
	 * @param locNm
	 */
	public void setLocNm(String locNm) {
		this.locNm = locNm;
	}
	
	/**
	 * Column Info
	 * @param vskdPortRhqCd
	 */
	public void setVskdPortRhqCd(String vskdPortRhqCd) {
		this.vskdPortRhqCd = vskdPortRhqCd;
	}
	
	/**
	 * Column Info
	 * @param latUtCd
	 */
	public void setLatUtCd(String latUtCd) {
		this.latUtCd = latUtCd;
	}
	
	/**
	 * Column Info
	 * @param locGrdNo
	 */
	public void setLocGrdNo(String locGrdNo) {
		this.locGrdNo = locGrdNo;
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
	 * @param eqRtnYdCd
	 */
	public void setEqRtnYdCd(String eqRtnYdCd) {
		this.eqRtnYdCd = eqRtnYdCd;
	}
	
	/**
	 * Column Info
	 * @param locLon
	 */
	public void setLocLon(String locLon) {
		this.locLon = locLon;
	}
	
	/**
	 * Column Info
	 * @param zipCd
	 */
	public void setZipCd(String zipCd) {
		this.zipCd = zipCd;
	}
	
	/**
	 * Column Info
	 * @param fincCtrlOfcCd
	 */
	public void setFincCtrlOfcCd(String fincCtrlOfcCd) {
		this.fincCtrlOfcCd = fincCtrlOfcCd;
	}
	
	/**
	 * Column Info
	 * @param senEqOfcCd
	 */
	public void setSenEqOfcCd(String senEqOfcCd) {
		this.senEqOfcCd = senEqOfcCd;
	}
	
	/**
	 * Column Info
	 * @param locTpCd
	 */
	public void setLocTpCd(String locTpCd) {
		this.locTpCd = locTpCd;
	}
	
	/**
	 * Column Info
	 * @param lonUtCd
	 */
	public void setLonUtCd(String lonUtCd) {
		this.lonUtCd = lonUtCd;
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
	 * @param vopBnkPortFlg
	 */
	public void setVopBnkPortFlg(String vopBnkPortFlg) {
		this.vopBnkPortFlg = vopBnkPortFlg;
	}
	
	/**
	 * Column Info
	 * @param gmtHrs
	 */
	public void setGmtHrs(String gmtHrs) {
		this.gmtHrs = gmtHrs;
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
	 * @param cmlZnFlg
	 */
	public void setCmlZnFlg(String cmlZnFlg) {
		this.cmlZnFlg = cmlZnFlg;
	}
	
	/**
	 * Column Info
	 * @param exptCustSvcOfcCd
	 */
	public void setExptCustSvcOfcCd(String exptCustSvcOfcCd) {
		this.exptCustSvcOfcCd = exptCustSvcOfcCd;
	}
	
	/**
	 * Column Info
	 * @param locAmsPortCd
	 */
	public void setLocAmsPortCd(String locAmsPortCd) {
		this.locAmsPortCd = locAmsPortCd;
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
	 * @param bfrFincCtrlOfcCd
	 */
	public void setBfrFincCtrlOfcCd(String bfrFincCtrlOfcCd) {
		this.bfrFincCtrlOfcCd = bfrFincCtrlOfcCd;
	}
	
	/**
	 * Column Info
	 * @param vopPortRhqCd
	 */
	public void setVopPortRhqCd(String vopPortRhqCd) {
		this.vopPortRhqCd = vopPortRhqCd;
	}
	
	/**
	 * Column Info
	 * @param bkgBlPfxCd
	 */
	public void setBkgBlPfxCd(String bkgBlPfxCd) {
		this.bkgBlPfxCd = bkgBlPfxCd;
	}
	
	/**
	 * Column Info
	 * @param vopPortMntrFlg
	 */
	public void setVopPortMntrFlg(String vopPortMntrFlg) {
		this.vopPortMntrFlg = vopPortMntrFlg;
	}
	
	/**
	 * Column Info
	 * @param locLoclLangNm
	 */
	public void setLocLoclLangNm(String locLoclLangNm) {
		this.locLoclLangNm = locLoclLangNm;
	}
	
	/**
	 * Column Info
	 * @param vopPortFlg
	 */
	public void setVopPortFlg(String vopPortFlg) {
		this.vopPortFlg = vopPortFlg;
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
	 * @param callPortFlg
	 */
	public void setCallPortFlg(String callPortFlg) {
		this.callPortFlg = callPortFlg;
	}
	
	/**
	 * Column Info
	 * @param unLocIndCd
	 */
	public void setUnLocIndCd(String unLocIndCd) {
		this.unLocIndCd = unLocIndCd;
	}
	
	/**
	 * Column Info
	 * @param eaiEvntDt
	 */
	public void setEaiEvntDt(String eaiEvntDt) {
		this.eaiEvntDt = eaiEvntDt;
	}
	
	/**
	 * Column Info
	 * @param eaiIfId
	 */
	public void setEaiIfId(String eaiIfId) {
		this.eaiIfId = eaiIfId;
	}
	
	/**
	 * Column Info
	 * @param exptLgsOfcCd
	 */
	public void setExptLgsOfcCd(String exptLgsOfcCd) {
		this.exptLgsOfcCd = exptLgsOfcCd;
	}
	
	/**
	 * Column Info
	 * @param vopPortCtrlOfcCd
	 */
	public void setVopPortCtrlOfcCd(String vopPortCtrlOfcCd) {
		this.vopPortCtrlOfcCd = vopPortCtrlOfcCd;
	}
	
	/**
	 * Column Info
	 * @param sccCd
	 */
	public void setSccCd(String sccCd) {
		this.sccCd = sccCd;
	}
	
	/**
	 * Column Info
	 * @param blkPortFlg
	 */
	public void setBlkPortFlg(String blkPortFlg) {
		this.blkPortFlg = blkPortFlg;
	}
	
	/**
	 * Column Info
	 * @param locLat
	 */
	public void setLocLat(String locLat) {
		this.locLat = locLat;
	}
	
	/**
	 * Column Info
	 * @param steCd
	 */
	public void setSteCd(String steCd) {
		this.steCd = steCd;
	}
	
	/**
	 * Column Info
	 * @param hubLocCd
	 */
	public void setHubLocCd(String hubLocCd) {
		this.hubLocCd = hubLocCd;
	}
	
	/**
	 * Column Info
	 * @param bfrSlsOfcCd
	 */
	public void setBfrSlsOfcCd(String bfrSlsOfcCd) {
		this.bfrSlsOfcCd = bfrSlsOfcCd;
	}
	
	/**
	 * Column Info
	 * @param scontiCd
	 */
	public void setScontiCd(String scontiCd) {
		this.scontiCd = scontiCd;
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
		setRgnCd(JSPUtil.getParameter(request, prefix + "rgn_cd", ""));
		setBfrEqCtrlOfcCd(JSPUtil.getParameter(request, prefix + "bfr_eq_ctrl_ofc_cd", ""));
		setUnLocCd(JSPUtil.getParameter(request, prefix + "un_loc_cd", ""));
		setPortInlndCd(JSPUtil.getParameter(request, prefix + "port_inlnd_cd", ""));
		setCstmsCd(JSPUtil.getParameter(request, prefix + "cstms_cd", ""));
		setMtyPkupYdCd(JSPUtil.getParameter(request, prefix + "mty_pkup_yd_cd", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setLocCd(JSPUtil.getParameter(request, prefix + "loc_cd", ""));
		setVopLocUrl(JSPUtil.getParameter(request, prefix + "vop_loc_url", ""));
		setSlsOfcCd(JSPUtil.getParameter(request, prefix + "sls_ofc_cd", ""));
		setCntCd(JSPUtil.getParameter(request, prefix + "cnt_cd", ""));
		setLocChrCd(JSPUtil.getParameter(request, prefix + "loc_chr_cd", ""));
		setBfrOfcCngDt(JSPUtil.getParameter(request, prefix + "bfr_ofc_cng_dt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setRepZnCd(JSPUtil.getParameter(request, prefix + "rep_zn_cd", ""));
		setLocNm(JSPUtil.getParameter(request, prefix + "loc_nm", ""));
		setVskdPortRhqCd(JSPUtil.getParameter(request, prefix + "vskd_port_rhq_cd", ""));
		setLatUtCd(JSPUtil.getParameter(request, prefix + "lat_ut_cd", ""));
		setLocGrdNo(JSPUtil.getParameter(request, prefix + "loc_grd_no", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setEqRtnYdCd(JSPUtil.getParameter(request, prefix + "eq_rtn_yd_cd", ""));
		setLocLon(JSPUtil.getParameter(request, prefix + "loc_lon", ""));
		setZipCd(JSPUtil.getParameter(request, prefix + "zip_cd", ""));
		setFincCtrlOfcCd(JSPUtil.getParameter(request, prefix + "finc_ctrl_ofc_cd", ""));
		setSenEqOfcCd(JSPUtil.getParameter(request, prefix + "sen_eq_ofc_cd", ""));
		setLocTpCd(JSPUtil.getParameter(request, prefix + "loc_tp_cd", ""));
		setLonUtCd(JSPUtil.getParameter(request, prefix + "lon_ut_cd", ""));
		setContiCd(JSPUtil.getParameter(request, prefix + "conti_cd", ""));
		setVopBnkPortFlg(JSPUtil.getParameter(request, prefix + "vop_bnk_port_flg", ""));
		setGmtHrs(JSPUtil.getParameter(request, prefix + "gmt_hrs", ""));
		setDeltFlg(JSPUtil.getParameter(request, prefix + "delt_flg", ""));
		setEqCtrlOfcCd(JSPUtil.getParameter(request, prefix + "eq_ctrl_ofc_cd", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setCmlZnFlg(JSPUtil.getParameter(request, prefix + "cml_zn_flg", ""));
		setExptCustSvcOfcCd(JSPUtil.getParameter(request, prefix + "expt_cust_svc_ofc_cd", ""));
		setLocAmsPortCd(JSPUtil.getParameter(request, prefix + "loc_ams_port_cd", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setBfrFincCtrlOfcCd(JSPUtil.getParameter(request, prefix + "bfr_finc_ctrl_ofc_cd", ""));
		setVopPortRhqCd(JSPUtil.getParameter(request, prefix + "vop_port_rhq_cd", ""));
		setBkgBlPfxCd(JSPUtil.getParameter(request, prefix + "bkg_bl_pfx_cd", ""));
		setVopPortMntrFlg(JSPUtil.getParameter(request, prefix + "vop_port_mntr_flg", ""));
		setLocLoclLangNm(JSPUtil.getParameter(request, prefix + "loc_locl_lang_nm", ""));
		setVopPortFlg(JSPUtil.getParameter(request, prefix + "vop_port_flg", ""));
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setCallPortFlg(JSPUtil.getParameter(request, prefix + "call_port_flg", ""));
		setUnLocIndCd(JSPUtil.getParameter(request, prefix + "un_loc_ind_cd", ""));
		setEaiEvntDt(JSPUtil.getParameter(request, prefix + "eai_evnt_dt", ""));
		setEaiIfId(JSPUtil.getParameter(request, prefix + "eai_if_id", ""));
		setExptLgsOfcCd(JSPUtil.getParameter(request, prefix + "expt_lgs_ofc_cd", ""));
		setVopPortCtrlOfcCd(JSPUtil.getParameter(request, prefix + "vop_port_ctrl_ofc_cd", ""));
		setSccCd(JSPUtil.getParameter(request, prefix + "scc_cd", ""));
		setBlkPortFlg(JSPUtil.getParameter(request, prefix + "blk_port_flg", ""));
		setLocLat(JSPUtil.getParameter(request, prefix + "loc_lat", ""));
		setSteCd(JSPUtil.getParameter(request, prefix + "ste_cd", ""));
		setHubLocCd(JSPUtil.getParameter(request, prefix + "hub_loc_cd", ""));
		setBfrSlsOfcCd(JSPUtil.getParameter(request, prefix + "bfr_sls_ofc_cd", ""));
		setScontiCd(JSPUtil.getParameter(request, prefix + "sconti_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return MdmLocationVO[]
	 */
	public MdmLocationVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return MdmLocationVO[]
	 */
	public MdmLocationVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		MdmLocationVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] rgnCd = (JSPUtil.getParameter(request, prefix	+ "rgn_cd", length));
			String[] bfrEqCtrlOfcCd = (JSPUtil.getParameter(request, prefix	+ "bfr_eq_ctrl_ofc_cd", length));
			String[] unLocCd = (JSPUtil.getParameter(request, prefix	+ "un_loc_cd", length));
			String[] portInlndCd = (JSPUtil.getParameter(request, prefix	+ "port_inlnd_cd", length));
			String[] cstmsCd = (JSPUtil.getParameter(request, prefix	+ "cstms_cd", length));
			String[] mtyPkupYdCd = (JSPUtil.getParameter(request, prefix	+ "mty_pkup_yd_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] locCd = (JSPUtil.getParameter(request, prefix	+ "loc_cd", length));
			String[] vopLocUrl = (JSPUtil.getParameter(request, prefix	+ "vop_loc_url", length));
			String[] slsOfcCd = (JSPUtil.getParameter(request, prefix	+ "sls_ofc_cd", length));
			String[] cntCd = (JSPUtil.getParameter(request, prefix	+ "cnt_cd", length));
			String[] locChrCd = (JSPUtil.getParameter(request, prefix	+ "loc_chr_cd", length));
			String[] bfrOfcCngDt = (JSPUtil.getParameter(request, prefix	+ "bfr_ofc_cng_dt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] repZnCd = (JSPUtil.getParameter(request, prefix	+ "rep_zn_cd", length));
			String[] locNm = (JSPUtil.getParameter(request, prefix	+ "loc_nm", length));
			String[] vskdPortRhqCd = (JSPUtil.getParameter(request, prefix	+ "vskd_port_rhq_cd", length));
			String[] latUtCd = (JSPUtil.getParameter(request, prefix	+ "lat_ut_cd", length));
			String[] locGrdNo = (JSPUtil.getParameter(request, prefix	+ "loc_grd_no", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] eqRtnYdCd = (JSPUtil.getParameter(request, prefix	+ "eq_rtn_yd_cd", length));
			String[] locLon = (JSPUtil.getParameter(request, prefix	+ "loc_lon", length));
			String[] zipCd = (JSPUtil.getParameter(request, prefix	+ "zip_cd", length));
			String[] fincCtrlOfcCd = (JSPUtil.getParameter(request, prefix	+ "finc_ctrl_ofc_cd", length));
			String[] senEqOfcCd = (JSPUtil.getParameter(request, prefix	+ "sen_eq_ofc_cd", length));
			String[] locTpCd = (JSPUtil.getParameter(request, prefix	+ "loc_tp_cd", length));
			String[] lonUtCd = (JSPUtil.getParameter(request, prefix	+ "lon_ut_cd", length));
			String[] contiCd = (JSPUtil.getParameter(request, prefix	+ "conti_cd", length));
			String[] vopBnkPortFlg = (JSPUtil.getParameter(request, prefix	+ "vop_bnk_port_flg", length));
			String[] gmtHrs = (JSPUtil.getParameter(request, prefix	+ "gmt_hrs", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] eqCtrlOfcCd = (JSPUtil.getParameter(request, prefix	+ "eq_ctrl_ofc_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] cmlZnFlg = (JSPUtil.getParameter(request, prefix	+ "cml_zn_flg", length));
			String[] exptCustSvcOfcCd = (JSPUtil.getParameter(request, prefix	+ "expt_cust_svc_ofc_cd", length));
			String[] locAmsPortCd = (JSPUtil.getParameter(request, prefix	+ "loc_ams_port_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] bfrFincCtrlOfcCd = (JSPUtil.getParameter(request, prefix	+ "bfr_finc_ctrl_ofc_cd", length));
			String[] vopPortRhqCd = (JSPUtil.getParameter(request, prefix	+ "vop_port_rhq_cd", length));
			String[] bkgBlPfxCd = (JSPUtil.getParameter(request, prefix	+ "bkg_bl_pfx_cd", length));
			String[] vopPortMntrFlg = (JSPUtil.getParameter(request, prefix	+ "vop_port_mntr_flg", length));
			String[] locLoclLangNm = (JSPUtil.getParameter(request, prefix	+ "loc_locl_lang_nm", length));
			String[] vopPortFlg = (JSPUtil.getParameter(request, prefix	+ "vop_port_flg", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] callPortFlg = (JSPUtil.getParameter(request, prefix	+ "call_port_flg", length));
			String[] unLocIndCd = (JSPUtil.getParameter(request, prefix	+ "un_loc_ind_cd", length));
			String[] eaiEvntDt = (JSPUtil.getParameter(request, prefix	+ "eai_evnt_dt", length));
			String[] eaiIfId = (JSPUtil.getParameter(request, prefix	+ "eai_if_id", length));
			String[] exptLgsOfcCd = (JSPUtil.getParameter(request, prefix	+ "expt_lgs_ofc_cd", length));
			String[] vopPortCtrlOfcCd = (JSPUtil.getParameter(request, prefix	+ "vop_port_ctrl_ofc_cd", length));
			String[] sccCd = (JSPUtil.getParameter(request, prefix	+ "scc_cd", length));
			String[] blkPortFlg = (JSPUtil.getParameter(request, prefix	+ "blk_port_flg", length));
			String[] locLat = (JSPUtil.getParameter(request, prefix	+ "loc_lat", length));
			String[] steCd = (JSPUtil.getParameter(request, prefix	+ "ste_cd", length));
			String[] hubLocCd = (JSPUtil.getParameter(request, prefix	+ "hub_loc_cd", length));
			String[] bfrSlsOfcCd = (JSPUtil.getParameter(request, prefix	+ "bfr_sls_ofc_cd", length));
			String[] scontiCd = (JSPUtil.getParameter(request, prefix	+ "sconti_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new MdmLocationVO();
				if (rgnCd[i] != null)
					model.setRgnCd(rgnCd[i]);
				if (bfrEqCtrlOfcCd[i] != null)
					model.setBfrEqCtrlOfcCd(bfrEqCtrlOfcCd[i]);
				if (unLocCd[i] != null)
					model.setUnLocCd(unLocCd[i]);
				if (portInlndCd[i] != null)
					model.setPortInlndCd(portInlndCd[i]);
				if (cstmsCd[i] != null)
					model.setCstmsCd(cstmsCd[i]);
				if (mtyPkupYdCd[i] != null)
					model.setMtyPkupYdCd(mtyPkupYdCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (locCd[i] != null)
					model.setLocCd(locCd[i]);
				if (vopLocUrl[i] != null)
					model.setVopLocUrl(vopLocUrl[i]);
				if (slsOfcCd[i] != null)
					model.setSlsOfcCd(slsOfcCd[i]);
				if (cntCd[i] != null)
					model.setCntCd(cntCd[i]);
				if (locChrCd[i] != null)
					model.setLocChrCd(locChrCd[i]);
				if (bfrOfcCngDt[i] != null)
					model.setBfrOfcCngDt(bfrOfcCngDt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (repZnCd[i] != null)
					model.setRepZnCd(repZnCd[i]);
				if (locNm[i] != null)
					model.setLocNm(locNm[i]);
				if (vskdPortRhqCd[i] != null)
					model.setVskdPortRhqCd(vskdPortRhqCd[i]);
				if (latUtCd[i] != null)
					model.setLatUtCd(latUtCd[i]);
				if (locGrdNo[i] != null)
					model.setLocGrdNo(locGrdNo[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (eqRtnYdCd[i] != null)
					model.setEqRtnYdCd(eqRtnYdCd[i]);
				if (locLon[i] != null)
					model.setLocLon(locLon[i]);
				if (zipCd[i] != null)
					model.setZipCd(zipCd[i]);
				if (fincCtrlOfcCd[i] != null)
					model.setFincCtrlOfcCd(fincCtrlOfcCd[i]);
				if (senEqOfcCd[i] != null)
					model.setSenEqOfcCd(senEqOfcCd[i]);
				if (locTpCd[i] != null)
					model.setLocTpCd(locTpCd[i]);
				if (lonUtCd[i] != null)
					model.setLonUtCd(lonUtCd[i]);
				if (contiCd[i] != null)
					model.setContiCd(contiCd[i]);
				if (vopBnkPortFlg[i] != null)
					model.setVopBnkPortFlg(vopBnkPortFlg[i]);
				if (gmtHrs[i] != null)
					model.setGmtHrs(gmtHrs[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (eqCtrlOfcCd[i] != null)
					model.setEqCtrlOfcCd(eqCtrlOfcCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (cmlZnFlg[i] != null)
					model.setCmlZnFlg(cmlZnFlg[i]);
				if (exptCustSvcOfcCd[i] != null)
					model.setExptCustSvcOfcCd(exptCustSvcOfcCd[i]);
				if (locAmsPortCd[i] != null)
					model.setLocAmsPortCd(locAmsPortCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (bfrFincCtrlOfcCd[i] != null)
					model.setBfrFincCtrlOfcCd(bfrFincCtrlOfcCd[i]);
				if (vopPortRhqCd[i] != null)
					model.setVopPortRhqCd(vopPortRhqCd[i]);
				if (bkgBlPfxCd[i] != null)
					model.setBkgBlPfxCd(bkgBlPfxCd[i]);
				if (vopPortMntrFlg[i] != null)
					model.setVopPortMntrFlg(vopPortMntrFlg[i]);
				if (locLoclLangNm[i] != null)
					model.setLocLoclLangNm(locLoclLangNm[i]);
				if (vopPortFlg[i] != null)
					model.setVopPortFlg(vopPortFlg[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (callPortFlg[i] != null)
					model.setCallPortFlg(callPortFlg[i]);
				if (unLocIndCd[i] != null)
					model.setUnLocIndCd(unLocIndCd[i]);
				if (eaiEvntDt[i] != null)
					model.setEaiEvntDt(eaiEvntDt[i]);
				if (eaiIfId[i] != null)
					model.setEaiIfId(eaiIfId[i]);
				if (exptLgsOfcCd[i] != null)
					model.setExptLgsOfcCd(exptLgsOfcCd[i]);
				if (vopPortCtrlOfcCd[i] != null)
					model.setVopPortCtrlOfcCd(vopPortCtrlOfcCd[i]);
				if (sccCd[i] != null)
					model.setSccCd(sccCd[i]);
				if (blkPortFlg[i] != null)
					model.setBlkPortFlg(blkPortFlg[i]);
				if (locLat[i] != null)
					model.setLocLat(locLat[i]);
				if (steCd[i] != null)
					model.setSteCd(steCd[i]);
				if (hubLocCd[i] != null)
					model.setHubLocCd(hubLocCd[i]);
				if (bfrSlsOfcCd[i] != null)
					model.setBfrSlsOfcCd(bfrSlsOfcCd[i]);
				if (scontiCd[i] != null)
					model.setScontiCd(scontiCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getMdmLocationVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return MdmLocationVO[]
	 */
	public MdmLocationVO[] getMdmLocationVOs(){
		MdmLocationVO[] vos = (MdmLocationVO[])models.toArray(new MdmLocationVO[models.size()]);
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
		this.rgnCd = this.rgnCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bfrEqCtrlOfcCd = this.bfrEqCtrlOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.unLocCd = this.unLocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.portInlndCd = this.portInlndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cstmsCd = this.cstmsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mtyPkupYdCd = this.mtyPkupYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.locCd = this.locCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vopLocUrl = this.vopLocUrl .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slsOfcCd = this.slsOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntCd = this.cntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.locChrCd = this.locChrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bfrOfcCngDt = this.bfrOfcCngDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.repZnCd = this.repZnCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.locNm = this.locNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vskdPortRhqCd = this.vskdPortRhqCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.latUtCd = this.latUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.locGrdNo = this.locGrdNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqRtnYdCd = this.eqRtnYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.locLon = this.locLon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.zipCd = this.zipCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fincCtrlOfcCd = this.fincCtrlOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.senEqOfcCd = this.senEqOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.locTpCd = this.locTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lonUtCd = this.lonUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.contiCd = this.contiCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vopBnkPortFlg = this.vopBnkPortFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.gmtHrs = this.gmtHrs .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqCtrlOfcCd = this.eqCtrlOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cmlZnFlg = this.cmlZnFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.exptCustSvcOfcCd = this.exptCustSvcOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.locAmsPortCd = this.locAmsPortCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bfrFincCtrlOfcCd = this.bfrFincCtrlOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vopPortRhqCd = this.vopPortRhqCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgBlPfxCd = this.bkgBlPfxCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vopPortMntrFlg = this.vopPortMntrFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.locLoclLangNm = this.locLoclLangNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vopPortFlg = this.vopPortFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.callPortFlg = this.callPortFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.unLocIndCd = this.unLocIndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eaiEvntDt = this.eaiEvntDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eaiIfId = this.eaiIfId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.exptLgsOfcCd = this.exptLgsOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vopPortCtrlOfcCd = this.vopPortCtrlOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sccCd = this.sccCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blkPortFlg = this.blkPortFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.locLat = this.locLat .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.steCd = this.steCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hubLocCd = this.hubLocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bfrSlsOfcCd = this.bfrSlsOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.scontiCd = this.scontiCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
