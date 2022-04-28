/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : BkgCstmsDuBlVO.java
*@FileTitle : BkgCstmsDuBlVO
*Open Issues :
*Change history :
*@LastModifyDate : 2010.03.12
*@LastModifier : 김민정
*@LastVersion : 1.0
* 2010.03.12 김민정 
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
 * @author 김민정
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgCstmsDuBlVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgCstmsDuBlVO> models = new ArrayList<BkgCstmsDuBlVO>();
	
	/* Column Info */
	private String mkNoCtnt = null;
	/* Column Info */
	private String porCd = null;
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String vvdCd = null;
	/* Column Info */
	private String cnslCgoFlg = null;
	/* Column Info */
	private String duMfNo = null;
	/* Column Info */
	private String duPckTpCd = null;
	/* Column Info */
	private String duPckDesc = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String orgPortCd = null;
	/* Column Info */
	private String blNo = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String polCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String measQty = null;
	/* Column Info */
	private String pckQty = null;
	/* Column Info */
	private String pltQty = null;
	/* Column Info */
	private String duVoyAgnId = null;
	/* Column Info */
	private String tareWgt = null;
	/* Column Info */
	private String duCntrSvcTpCd = null;
	/* Column Info */
	private String duTsModCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String orgSkdVoyNo = null;
	/* Column Info */
	private String cgoWgt = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String orgBlNo = null;
	/* Column Info */
	private String duCmdtCd = null;
	/* Column Info */
	private String orgVslCd = null;
	/* Column Info */
	private String duLineId = null;
	/* Column Info */
	private String delCd = null;
	/* Column Info */
	private String duTrdCd = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String vslNm = null;
	/* Column Info */
	private String orgSkdDirCd = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Column Info */
	private String duTtlQty = null;
	/* Column Info */
	private String podCd = null;
	/* Column Info */
	private String duCgoCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String duFrtWgt = null;
	/* Column Info */
	private String orgCntCd = null;
	/* Column Info */
	private String cmdtDesc = null;
	/* Column Info */
	private String cntrNo = null;
	/* Column Info */
	private String duRotnNo = null;
	/* Column Info */
	private String bkgTeuQty = null;
	/* Column Info */
	private String grsWgt = null;
	/* Column Info */
	private String cntrKnt = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgCstmsDuBlVO() {}

	public BkgCstmsDuBlVO(String ibflag, String pagerows, String blNo, String podCd, String vslCd, String vvdCd, String skdVoyNo, String skdDirCd, String duRotnNo, String duLineId, String duVoyAgnId, String orgPortCd, String porCd, String polCd, String delCd, String duMfNo, String duCgoCd, String duCntrSvcTpCd, String duTrdCd, String duTsModCd, String cnslCgoFlg, String orgCntCd, String vslNm, String orgVslCd, String orgSkdVoyNo, String orgSkdDirCd, String orgBlNo, String mkNoCtnt, String duCmdtCd, String cmdtDesc, String pckQty, String duPckDesc, String duPckTpCd, String cntrNo, String cntrKnt, String bkgTeuQty, String tareWgt, String cgoWgt, String grsWgt, String measQty, String duTtlQty, String duFrtWgt, String pltQty, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.mkNoCtnt = mkNoCtnt;
		this.porCd = porCd;
		this.vslCd = vslCd;
		this.vvdCd  = vvdCd;
		this.cnslCgoFlg = cnslCgoFlg;
		this.duMfNo = duMfNo;
		this.duPckTpCd = duPckTpCd;
		this.duPckDesc = duPckDesc;
		this.creDt = creDt;
		this.orgPortCd = orgPortCd;
		this.blNo = blNo;
		this.pagerows = pagerows;
		this.polCd = polCd;
		this.ibflag = ibflag;
		this.measQty = measQty;
		this.pckQty = pckQty;
		this.pltQty = pltQty;
		this.duVoyAgnId = duVoyAgnId;
		this.tareWgt = tareWgt;
		this.duCntrSvcTpCd = duCntrSvcTpCd;
		this.duTsModCd = duTsModCd;
		this.updUsrId = updUsrId;
		this.orgSkdVoyNo = orgSkdVoyNo;
		this.cgoWgt = cgoWgt;
		this.updDt = updDt;
		this.orgBlNo = orgBlNo;
		this.duCmdtCd = duCmdtCd;
		this.orgVslCd = orgVslCd;
		this.duLineId = duLineId;
		this.delCd = delCd;
		this.duTrdCd = duTrdCd;
		this.skdVoyNo = skdVoyNo;
		this.vslNm = vslNm;
		this.orgSkdDirCd = orgSkdDirCd;
		this.skdDirCd = skdDirCd;
		this.duTtlQty = duTtlQty;
		this.podCd = podCd;
		this.duCgoCd = duCgoCd;
		this.creUsrId = creUsrId;
		this.duFrtWgt = duFrtWgt;
		this.orgCntCd = orgCntCd;
		this.cmdtDesc = cmdtDesc;
		this.cntrNo = cntrNo;
		this.duRotnNo = duRotnNo;
		this.bkgTeuQty = bkgTeuQty;
		this.grsWgt = grsWgt;
		this.cntrKnt = cntrKnt;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("mk_no_ctnt", getMkNoCtnt());
		this.hashColumns.put("por_cd", getPorCd());
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("vvd_cd", getVvdCd());
		this.hashColumns.put("cnsl_cgo_flg", getCnslCgoFlg());
		this.hashColumns.put("du_mf_no", getDuMfNo());
		this.hashColumns.put("du_pck_tp_cd", getDuPckTpCd());
		this.hashColumns.put("du_pck_desc", getDuPckDesc());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("org_port_cd", getOrgPortCd());
		this.hashColumns.put("bl_no", getBlNo());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("pol_cd", getPolCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("meas_qty", getMeasQty());
		this.hashColumns.put("pck_qty", getPckQty());
		this.hashColumns.put("plt_qty", getPltQty());
		this.hashColumns.put("du_voy_agn_id", getDuVoyAgnId());
		this.hashColumns.put("tare_wgt", getTareWgt());
		this.hashColumns.put("du_cntr_svc_tp_cd", getDuCntrSvcTpCd());
		this.hashColumns.put("du_ts_mod_cd", getDuTsModCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("org_skd_voy_no", getOrgSkdVoyNo());
		this.hashColumns.put("cgo_wgt", getCgoWgt());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("org_bl_no", getOrgBlNo());
		this.hashColumns.put("du_cmdt_cd", getDuCmdtCd());
		this.hashColumns.put("org_vsl_cd", getOrgVslCd());
		this.hashColumns.put("du_line_id", getDuLineId());
		this.hashColumns.put("del_cd", getDelCd());
		this.hashColumns.put("du_trd_cd", getDuTrdCd());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("vsl_nm", getVslNm());
		this.hashColumns.put("org_skd_dir_cd", getOrgSkdDirCd());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("du_ttl_qty", getDuTtlQty());
		this.hashColumns.put("pod_cd", getPodCd());
		this.hashColumns.put("du_cgo_cd", getDuCgoCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("du_frt_wgt", getDuFrtWgt());
		this.hashColumns.put("org_cnt_cd", getOrgCntCd());
		this.hashColumns.put("cmdt_desc", getCmdtDesc());
		this.hashColumns.put("cntr_no", getCntrNo());
		this.hashColumns.put("du_rotn_no", getDuRotnNo());
		this.hashColumns.put("bkg_teu_qty", getBkgTeuQty());
		this.hashColumns.put("grs_wgt", getGrsWgt());
		this.hashColumns.put("cntr_knt", getCntrKnt());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("mk_no_ctnt", "mkNoCtnt");
		this.hashFields.put("por_cd", "porCd");
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("vvd_cd", "vvdCd");
		this.hashFields.put("cnsl_cgo_flg", "cnslCgoFlg");
		this.hashFields.put("du_mf_no", "duMfNo");
		this.hashFields.put("du_pck_tp_cd", "duPckTpCd");
		this.hashFields.put("du_pck_desc", "duPckDesc");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("org_port_cd", "orgPortCd");
		this.hashFields.put("bl_no", "blNo");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("pol_cd", "polCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("meas_qty", "measQty");
		this.hashFields.put("pck_qty", "pckQty");
		this.hashFields.put("plt_qty", "pltQty");
		this.hashFields.put("du_voy_agn_id", "duVoyAgnId");
		this.hashFields.put("tare_wgt", "tareWgt");
		this.hashFields.put("du_cntr_svc_tp_cd", "duCntrSvcTpCd");
		this.hashFields.put("du_ts_mod_cd", "duTsModCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("org_skd_voy_no", "orgSkdVoyNo");
		this.hashFields.put("cgo_wgt", "cgoWgt");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("org_bl_no", "orgBlNo");
		this.hashFields.put("du_cmdt_cd", "duCmdtCd");
		this.hashFields.put("org_vsl_cd", "orgVslCd");
		this.hashFields.put("du_line_id", "duLineId");
		this.hashFields.put("del_cd", "delCd");
		this.hashFields.put("du_trd_cd", "duTrdCd");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("vsl_nm", "vslNm");
		this.hashFields.put("org_skd_dir_cd", "orgSkdDirCd");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("du_ttl_qty", "duTtlQty");
		this.hashFields.put("pod_cd", "podCd");
		this.hashFields.put("du_cgo_cd", "duCgoCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("du_frt_wgt", "duFrtWgt");
		this.hashFields.put("org_cnt_cd", "orgCntCd");
		this.hashFields.put("cmdt_desc", "cmdtDesc");
		this.hashFields.put("cntr_no", "cntrNo");
		this.hashFields.put("du_rotn_no", "duRotnNo");
		this.hashFields.put("bkg_teu_qty", "bkgTeuQty");
		this.hashFields.put("grs_wgt", "grsWgt");
		this.hashFields.put("cntr_knt", "cntrKnt");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return mkNoCtnt
	 */
	public String getMkNoCtnt() {
		return this.mkNoCtnt;
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
	 * @return vslCd
	 */
	public String getVslCd() {
		return this.vslCd;
	}
	/**
	 * Column Info
	 * @return vvdCd
	 */
	public String getVvdCd() {
		return this.vvdCd;
	}
	
	/**
	 * Column Info
	 * @return cnslCgoFlg
	 */
	public String getCnslCgoFlg() {
		return this.cnslCgoFlg;
	}
	
	/**
	 * Column Info
	 * @return duMfNo
	 */
	public String getDuMfNo() {
		return this.duMfNo;
	}
	
	/**
	 * Column Info
	 * @return duPckTpCd
	 */
	public String getDuPckTpCd() {
		return this.duPckTpCd;
	}
	
	/**
	 * Column Info
	 * @return duPckDesc
	 */
	public String getDuPckDesc() {
		return this.duPckDesc;
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
	 * @return orgPortCd
	 */
	public String getOrgPortCd() {
		return this.orgPortCd;
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
	 * @return measQty
	 */
	public String getMeasQty() {
		return this.measQty;
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
	 * @return pltQty
	 */
	public String getPltQty() {
		return this.pltQty;
	}
	
	/**
	 * Column Info
	 * @return duVoyAgnId
	 */
	public String getDuVoyAgnId() {
		return this.duVoyAgnId;
	}
	
	/**
	 * Column Info
	 * @return tareWgt
	 */
	public String getTareWgt() {
		return this.tareWgt;
	}
	
	/**
	 * Column Info
	 * @return duCntrSvcTpCd
	 */
	public String getDuCntrSvcTpCd() {
		return this.duCntrSvcTpCd;
	}
	
	/**
	 * Column Info
	 * @return duTsModCd
	 */
	public String getDuTsModCd() {
		return this.duTsModCd;
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
	 * @return orgSkdVoyNo
	 */
	public String getOrgSkdVoyNo() {
		return this.orgSkdVoyNo;
	}
	
	/**
	 * Column Info
	 * @return cgoWgt
	 */
	public String getCgoWgt() {
		return this.cgoWgt;
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
	 * @return orgBlNo
	 */
	public String getOrgBlNo() {
		return this.orgBlNo;
	}
	
	/**
	 * Column Info
	 * @return duCmdtCd
	 */
	public String getDuCmdtCd() {
		return this.duCmdtCd;
	}
	
	/**
	 * Column Info
	 * @return orgVslCd
	 */
	public String getOrgVslCd() {
		return this.orgVslCd;
	}
	
	/**
	 * Column Info
	 * @return duLineId
	 */
	public String getDuLineId() {
		return this.duLineId;
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
	 * @return duTrdCd
	 */
	public String getDuTrdCd() {
		return this.duTrdCd;
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
	 * @return vslNm
	 */
	public String getVslNm() {
		return this.vslNm;
	}
	
	/**
	 * Column Info
	 * @return orgSkdDirCd
	 */
	public String getOrgSkdDirCd() {
		return this.orgSkdDirCd;
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
	 * @return duTtlQty
	 */
	public String getDuTtlQty() {
		return this.duTtlQty;
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
	 * @return duCgoCd
	 */
	public String getDuCgoCd() {
		return this.duCgoCd;
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
	 * @return duFrtWgt
	 */
	public String getDuFrtWgt() {
		return this.duFrtWgt;
	}
	
	/**
	 * Column Info
	 * @return orgCntCd
	 */
	public String getOrgCntCd() {
		return this.orgCntCd;
	}
	
	/**
	 * Column Info
	 * @return cmdtDesc
	 */
	public String getCmdtDesc() {
		return this.cmdtDesc;
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
	 * @return duRotnNo
	 */
	public String getDuRotnNo() {
		return this.duRotnNo;
	}
	
	/**
	 * Column Info
	 * @return bkgTeuQty
	 */
	public String getBkgTeuQty() {
		return this.bkgTeuQty;
	}
	
	/**
	 * Column Info
	 * @return grsWgt
	 */
	public String getGrsWgt() {
		return this.grsWgt;
	}
	
	/**
	 * Column Info
	 * @return cntrKnt
	 */
	public String getCntrKnt() {
		return this.cntrKnt;
	}
	

	/**
	 * Column Info
	 * @param mkNoCtnt
	 */
	public void setMkNoCtnt(String mkNoCtnt) {
		this.mkNoCtnt = mkNoCtnt;
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
	 * @param vslCd
	 */
	public void setVslCd(String vslCd) {
		this.vslCd = vslCd;
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
	 * @param cnslCgoFlg
	 */
	public void setCnslCgoFlg(String cnslCgoFlg) {
		this.cnslCgoFlg = cnslCgoFlg;
	}
	
	/**
	 * Column Info
	 * @param duMfNo
	 */
	public void setDuMfNo(String duMfNo) {
		this.duMfNo = duMfNo;
	}
	
	/**
	 * Column Info
	 * @param duPckTpCd
	 */
	public void setDuPckTpCd(String duPckTpCd) {
		this.duPckTpCd = duPckTpCd;
	}
	
	/**
	 * Column Info
	 * @param duPckDesc
	 */
	public void setDuPckDesc(String duPckDesc) {
		this.duPckDesc = duPckDesc;
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
	 * @param orgPortCd
	 */
	public void setOrgPortCd(String orgPortCd) {
		this.orgPortCd = orgPortCd;
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
	 * @param measQty
	 */
	public void setMeasQty(String measQty) {
		this.measQty = measQty;
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
	 * @param pltQty
	 */
	public void setPltQty(String pltQty) {
		this.pltQty = pltQty;
	}
	
	/**
	 * Column Info
	 * @param duVoyAgnId
	 */
	public void setDuVoyAgnId(String duVoyAgnId) {
		this.duVoyAgnId = duVoyAgnId;
	}
	
	/**
	 * Column Info
	 * @param tareWgt
	 */
	public void setTareWgt(String tareWgt) {
		this.tareWgt = tareWgt;
	}
	
	/**
	 * Column Info
	 * @param duCntrSvcTpCd
	 */
	public void setDuCntrSvcTpCd(String duCntrSvcTpCd) {
		this.duCntrSvcTpCd = duCntrSvcTpCd;
	}
	
	/**
	 * Column Info
	 * @param duTsModCd
	 */
	public void setDuTsModCd(String duTsModCd) {
		this.duTsModCd = duTsModCd;
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
	 * @param orgSkdVoyNo
	 */
	public void setOrgSkdVoyNo(String orgSkdVoyNo) {
		this.orgSkdVoyNo = orgSkdVoyNo;
	}
	
	/**
	 * Column Info
	 * @param cgoWgt
	 */
	public void setCgoWgt(String cgoWgt) {
		this.cgoWgt = cgoWgt;
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
	 * @param orgBlNo
	 */
	public void setOrgBlNo(String orgBlNo) {
		this.orgBlNo = orgBlNo;
	}
	
	/**
	 * Column Info
	 * @param duCmdtCd
	 */
	public void setDuCmdtCd(String duCmdtCd) {
		this.duCmdtCd = duCmdtCd;
	}
	
	/**
	 * Column Info
	 * @param orgVslCd
	 */
	public void setOrgVslCd(String orgVslCd) {
		this.orgVslCd = orgVslCd;
	}
	
	/**
	 * Column Info
	 * @param duLineId
	 */
	public void setDuLineId(String duLineId) {
		this.duLineId = duLineId;
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
	 * @param duTrdCd
	 */
	public void setDuTrdCd(String duTrdCd) {
		this.duTrdCd = duTrdCd;
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
	 * @param vslNm
	 */
	public void setVslNm(String vslNm) {
		this.vslNm = vslNm;
	}
	
	/**
	 * Column Info
	 * @param orgSkdDirCd
	 */
	public void setOrgSkdDirCd(String orgSkdDirCd) {
		this.orgSkdDirCd = orgSkdDirCd;
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
	 * @param duTtlQty
	 */
	public void setDuTtlQty(String duTtlQty) {
		this.duTtlQty = duTtlQty;
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
	 * @param duCgoCd
	 */
	public void setDuCgoCd(String duCgoCd) {
		this.duCgoCd = duCgoCd;
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
	 * @param duFrtWgt
	 */
	public void setDuFrtWgt(String duFrtWgt) {
		this.duFrtWgt = duFrtWgt;
	}
	
	/**
	 * Column Info
	 * @param orgCntCd
	 */
	public void setOrgCntCd(String orgCntCd) {
		this.orgCntCd = orgCntCd;
	}
	
	/**
	 * Column Info
	 * @param cmdtDesc
	 */
	public void setCmdtDesc(String cmdtDesc) {
		this.cmdtDesc = cmdtDesc;
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
	 * @param duRotnNo
	 */
	public void setDuRotnNo(String duRotnNo) {
		this.duRotnNo = duRotnNo;
	}
	
	/**
	 * Column Info
	 * @param bkgTeuQty
	 */
	public void setBkgTeuQty(String bkgTeuQty) {
		this.bkgTeuQty = bkgTeuQty;
	}
	
	/**
	 * Column Info
	 * @param grsWgt
	 */
	public void setGrsWgt(String grsWgt) {
		this.grsWgt = grsWgt;
	}
	
	/**
	 * Column Info
	 * @param cntrKnt
	 */
	public void setCntrKnt(String cntrKnt) {
		this.cntrKnt = cntrKnt;
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
		setMkNoCtnt(JSPUtil.getParameter(request, prefix + "mk_no_ctnt", ""));
		setPorCd(JSPUtil.getParameter(request, prefix + "por_cd", ""));
		setVslCd(JSPUtil.getParameter(request, prefix + "vsl_cd", ""));
		setVvdCd(JSPUtil.getParameter(request, prefix + "vvd_cd", ""));
		setCnslCgoFlg(JSPUtil.getParameter(request, prefix + "cnsl_cgo_flg", ""));
		setDuMfNo(JSPUtil.getParameter(request, prefix + "du_mf_no", ""));
		setDuPckTpCd(JSPUtil.getParameter(request, prefix + "du_pck_tp_cd", ""));
		setDuPckDesc(JSPUtil.getParameter(request, prefix + "du_pck_desc", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setOrgPortCd(JSPUtil.getParameter(request, prefix + "org_port_cd", ""));
		setBlNo(JSPUtil.getParameter(request, prefix + "bl_no", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setPolCd(JSPUtil.getParameter(request, prefix + "pol_cd", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setMeasQty(JSPUtil.getParameter(request, prefix + "meas_qty", ""));
		setPckQty(JSPUtil.getParameter(request, prefix + "pck_qty", ""));
		setPltQty(JSPUtil.getParameter(request, prefix + "plt_qty", ""));
		setDuVoyAgnId(JSPUtil.getParameter(request, prefix + "du_voy_agn_id", ""));
		setTareWgt(JSPUtil.getParameter(request, prefix + "tare_wgt", ""));
		setDuCntrSvcTpCd(JSPUtil.getParameter(request, prefix + "du_cntr_svc_tp_cd", ""));
		setDuTsModCd(JSPUtil.getParameter(request, prefix + "du_ts_mod_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setOrgSkdVoyNo(JSPUtil.getParameter(request, prefix + "org_skd_voy_no", ""));
		setCgoWgt(JSPUtil.getParameter(request, prefix + "cgo_wgt", ""));
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setOrgBlNo(JSPUtil.getParameter(request, prefix + "org_bl_no", ""));
		setDuCmdtCd(JSPUtil.getParameter(request, prefix + "du_cmdt_cd", ""));
		setOrgVslCd(JSPUtil.getParameter(request, prefix + "org_vsl_cd", ""));
		setDuLineId(JSPUtil.getParameter(request, prefix + "du_line_id", ""));
		setDelCd(JSPUtil.getParameter(request, prefix + "del_cd", ""));
		setDuTrdCd(JSPUtil.getParameter(request, prefix + "du_trd_cd", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, prefix + "skd_voy_no", ""));
		setVslNm(JSPUtil.getParameter(request, prefix + "vsl_nm", ""));
		setOrgSkdDirCd(JSPUtil.getParameter(request, prefix + "org_skd_dir_cd", ""));
		setSkdDirCd(JSPUtil.getParameter(request, prefix + "skd_dir_cd", ""));
		setDuTtlQty(JSPUtil.getParameter(request, prefix + "du_ttl_qty", ""));
		setPodCd(JSPUtil.getParameter(request, prefix + "pod_cd", ""));
		setDuCgoCd(JSPUtil.getParameter(request, prefix + "du_cgo_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setDuFrtWgt(JSPUtil.getParameter(request, prefix + "du_frt_wgt", ""));
		setOrgCntCd(JSPUtil.getParameter(request, prefix + "org_cnt_cd", ""));
		setCmdtDesc(JSPUtil.getParameter(request, prefix + "cmdt_desc", ""));
		setCntrNo(JSPUtil.getParameter(request, prefix + "cntr_no", ""));
		setDuRotnNo(JSPUtil.getParameter(request, prefix + "du_rotn_no", ""));
		setBkgTeuQty(JSPUtil.getParameter(request, prefix + "bkg_teu_qty", ""));
		setGrsWgt(JSPUtil.getParameter(request, prefix + "grs_wgt", ""));
		setCntrKnt(JSPUtil.getParameter(request, prefix + "cntr_knt", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgCstmsDuBlVO[]
	 */
	public BkgCstmsDuBlVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgCstmsDuBlVO[]
	 */
	public BkgCstmsDuBlVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgCstmsDuBlVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] mkNoCtnt = (JSPUtil.getParameter(request, prefix	+ "mk_no_ctnt", length));
			String[] porCd = (JSPUtil.getParameter(request, prefix	+ "por_cd", length));
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] vvdCd = (JSPUtil.getParameter(request, prefix	+ "vvd_cd", length));
			String[] cnslCgoFlg = (JSPUtil.getParameter(request, prefix	+ "cnsl_cgo_flg", length));
			String[] duMfNo = (JSPUtil.getParameter(request, prefix	+ "du_mf_no", length));
			String[] duPckTpCd = (JSPUtil.getParameter(request, prefix	+ "du_pck_tp_cd", length));
			String[] duPckDesc = (JSPUtil.getParameter(request, prefix	+ "du_pck_desc", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] orgPortCd = (JSPUtil.getParameter(request, prefix	+ "org_port_cd", length));
			String[] blNo = (JSPUtil.getParameter(request, prefix	+ "bl_no", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] polCd = (JSPUtil.getParameter(request, prefix	+ "pol_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] measQty = (JSPUtil.getParameter(request, prefix	+ "meas_qty", length));
			String[] pckQty = (JSPUtil.getParameter(request, prefix	+ "pck_qty", length));
			String[] pltQty = (JSPUtil.getParameter(request, prefix	+ "plt_qty", length));
			String[] duVoyAgnId = (JSPUtil.getParameter(request, prefix	+ "du_voy_agn_id", length));
			String[] tareWgt = (JSPUtil.getParameter(request, prefix	+ "tare_wgt", length));
			String[] duCntrSvcTpCd = (JSPUtil.getParameter(request, prefix	+ "du_cntr_svc_tp_cd", length));
			String[] duTsModCd = (JSPUtil.getParameter(request, prefix	+ "du_ts_mod_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] orgSkdVoyNo = (JSPUtil.getParameter(request, prefix	+ "org_skd_voy_no", length));
			String[] cgoWgt = (JSPUtil.getParameter(request, prefix	+ "cgo_wgt", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] orgBlNo = (JSPUtil.getParameter(request, prefix	+ "org_bl_no", length));
			String[] duCmdtCd = (JSPUtil.getParameter(request, prefix	+ "du_cmdt_cd", length));
			String[] orgVslCd = (JSPUtil.getParameter(request, prefix	+ "org_vsl_cd", length));
			String[] duLineId = (JSPUtil.getParameter(request, prefix	+ "du_line_id", length));
			String[] delCd = (JSPUtil.getParameter(request, prefix	+ "del_cd", length));
			String[] duTrdCd = (JSPUtil.getParameter(request, prefix	+ "du_trd_cd", length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no", length));
			String[] vslNm = (JSPUtil.getParameter(request, prefix	+ "vsl_nm", length));
			String[] orgSkdDirCd = (JSPUtil.getParameter(request, prefix	+ "org_skd_dir_cd", length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd", length));
			String[] duTtlQty = (JSPUtil.getParameter(request, prefix	+ "du_ttl_qty", length));
			String[] podCd = (JSPUtil.getParameter(request, prefix	+ "pod_cd", length));
			String[] duCgoCd = (JSPUtil.getParameter(request, prefix	+ "du_cgo_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] duFrtWgt = (JSPUtil.getParameter(request, prefix	+ "du_frt_wgt", length));
			String[] orgCntCd = (JSPUtil.getParameter(request, prefix	+ "org_cnt_cd", length));
			String[] cmdtDesc = (JSPUtil.getParameter(request, prefix	+ "cmdt_desc", length));
			String[] cntrNo = (JSPUtil.getParameter(request, prefix	+ "cntr_no", length));
			String[] duRotnNo = (JSPUtil.getParameter(request, prefix	+ "du_rotn_no", length));
			String[] bkgTeuQty = (JSPUtil.getParameter(request, prefix	+ "bkg_teu_qty", length));
			String[] grsWgt = (JSPUtil.getParameter(request, prefix	+ "grs_wgt", length));
			String[] cntrKnt = (JSPUtil.getParameter(request, prefix	+ "cntr_knt", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgCstmsDuBlVO();
				if (mkNoCtnt[i] != null)
					model.setMkNoCtnt(mkNoCtnt[i]);
				if (porCd[i] != null)
					model.setPorCd(porCd[i]);
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (vvdCd[i] != null)
					model.setVvdCd(vvdCd[i]);
				if (cnslCgoFlg[i] != null)
					model.setCnslCgoFlg(cnslCgoFlg[i]);
				if (duMfNo[i] != null)
					model.setDuMfNo(duMfNo[i]);
				if (duPckTpCd[i] != null)
					model.setDuPckTpCd(duPckTpCd[i]);
				if (duPckDesc[i] != null)
					model.setDuPckDesc(duPckDesc[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (orgPortCd[i] != null)
					model.setOrgPortCd(orgPortCd[i]);
				if (blNo[i] != null)
					model.setBlNo(blNo[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (polCd[i] != null)
					model.setPolCd(polCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (measQty[i] != null)
					model.setMeasQty(measQty[i]);
				if (pckQty[i] != null)
					model.setPckQty(pckQty[i]);
				if (pltQty[i] != null)
					model.setPltQty(pltQty[i]);
				if (duVoyAgnId[i] != null)
					model.setDuVoyAgnId(duVoyAgnId[i]);
				if (tareWgt[i] != null)
					model.setTareWgt(tareWgt[i]);
				if (duCntrSvcTpCd[i] != null)
					model.setDuCntrSvcTpCd(duCntrSvcTpCd[i]);
				if (duTsModCd[i] != null)
					model.setDuTsModCd(duTsModCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (orgSkdVoyNo[i] != null)
					model.setOrgSkdVoyNo(orgSkdVoyNo[i]);
				if (cgoWgt[i] != null)
					model.setCgoWgt(cgoWgt[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (orgBlNo[i] != null)
					model.setOrgBlNo(orgBlNo[i]);
				if (duCmdtCd[i] != null)
					model.setDuCmdtCd(duCmdtCd[i]);
				if (orgVslCd[i] != null)
					model.setOrgVslCd(orgVslCd[i]);
				if (duLineId[i] != null)
					model.setDuLineId(duLineId[i]);
				if (delCd[i] != null)
					model.setDelCd(delCd[i]);
				if (duTrdCd[i] != null)
					model.setDuTrdCd(duTrdCd[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (vslNm[i] != null)
					model.setVslNm(vslNm[i]);
				if (orgSkdDirCd[i] != null)
					model.setOrgSkdDirCd(orgSkdDirCd[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (duTtlQty[i] != null)
					model.setDuTtlQty(duTtlQty[i]);
				if (podCd[i] != null)
					model.setPodCd(podCd[i]);
				if (duCgoCd[i] != null)
					model.setDuCgoCd(duCgoCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (duFrtWgt[i] != null)
					model.setDuFrtWgt(duFrtWgt[i]);
				if (orgCntCd[i] != null)
					model.setOrgCntCd(orgCntCd[i]);
				if (cmdtDesc[i] != null)
					model.setCmdtDesc(cmdtDesc[i]);
				if (cntrNo[i] != null)
					model.setCntrNo(cntrNo[i]);
				if (duRotnNo[i] != null)
					model.setDuRotnNo(duRotnNo[i]);
				if (bkgTeuQty[i] != null)
					model.setBkgTeuQty(bkgTeuQty[i]);
				if (grsWgt[i] != null)
					model.setGrsWgt(grsWgt[i]);
				if (cntrKnt[i] != null)
					model.setCntrKnt(cntrKnt[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgCstmsDuBlVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgCstmsDuBlVO[]
	 */
	public BkgCstmsDuBlVO[] getBkgCstmsDuBlVOs(){
		BkgCstmsDuBlVO[] vos = (BkgCstmsDuBlVO[])models.toArray(new BkgCstmsDuBlVO[models.size()]);
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
		this.mkNoCtnt = this.mkNoCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.porCd = this.porCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vvdCd = this.vvdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cnslCgoFlg = this.cnslCgoFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.duMfNo = this.duMfNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.duPckTpCd = this.duPckTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.duPckDesc = this.duPckDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgPortCd = this.orgPortCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blNo = this.blNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.polCd = this.polCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.measQty = this.measQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pckQty = this.pckQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pltQty = this.pltQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.duVoyAgnId = this.duVoyAgnId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tareWgt = this.tareWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.duCntrSvcTpCd = this.duCntrSvcTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.duTsModCd = this.duTsModCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgSkdVoyNo = this.orgSkdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cgoWgt = this.cgoWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgBlNo = this.orgBlNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.duCmdtCd = this.duCmdtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgVslCd = this.orgVslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.duLineId = this.duLineId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.delCd = this.delCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.duTrdCd = this.duTrdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslNm = this.vslNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgSkdDirCd = this.orgSkdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.duTtlQty = this.duTtlQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.podCd = this.podCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.duCgoCd = this.duCgoCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.duFrtWgt = this.duFrtWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgCntCd = this.orgCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cmdtDesc = this.cmdtDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrNo = this.cntrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.duRotnNo = this.duRotnNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgTeuQty = this.bkgTeuQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.grsWgt = this.grsWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrKnt = this.cntrKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
