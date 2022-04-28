/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : TrsTrspRailSoIfVO.java
*@FileTitle : TrsTrspRailSoIfVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.05
*@LastModifier : 양봉준
*@LastVersion : 1.0
* 2009.07.05 양봉준 
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
 * @author 양봉준
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class TrsTrspRailSoIfVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<TrsTrspRailSoIfVO> models = new ArrayList<TrsTrspRailSoIfVO>();
	
	/* Column Info */
	private String toNodCd = null;
	/* Column Info */
	private String ediRcvVndrSeq = null;
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String currCd = null;
	/* Column Info */
	private String invVndrSeq = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String railIrgSubSeq = null;
	/* Column Info */
	private String trspSoSeq = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String invStyCd = null;
	/* Column Info */
	private String invRqstVndrSeq = null;
	/* Column Info */
	private String railSeq = null;
	/* Column Info */
	private String trspSoOfcCtyCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String trspCoIndCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String eqNo = null;
	/* Column Info */
	private String destToNodCd = null;
	/* Column Info */
	private String ediBilStyCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String actTrspVndrSeq = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String etcAddAmt = null;
	/* Column Info */
	private String trspBndCd = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String eaiEvntDt = null;
	/* Column Info */
	private String bzcAmt = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Column Info */
	private String eqTpszCd = null;
	/* Column Info */
	private String invNo = null;
	/* Column Info */
	private String fmNodCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String slanCd = null;
	/* Column Info */
	private String railBilDt = null;
	/* Column Info */
	private String lgsCostCd = null;
	/* Column Info */
	private String fullMtyCd = null;
	/* Column Info */
	private String orgFmNodCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public TrsTrspRailSoIfVO() {}

	public TrsTrspRailSoIfVO(String ibflag, String pagerows, String trspSoOfcCtyCd, String trspSoSeq, String eqNo, String railIrgSubSeq, String railSeq, String invNo, String invVndrSeq, String trspCoIndCd, String fullMtyCd, String lgsCostCd, String trspBndCd, String eqTpszCd, String bkgNo, String vslCd, String skdVoyNo, String skdDirCd, String slanCd, String orgFmNodCd, String destToNodCd, String fmNodCd, String toNodCd, String currCd, String invStyCd, String ediBilStyCd, String ediRcvVndrSeq, String invRqstVndrSeq, String actTrspVndrSeq, String bzcAmt, String etcAddAmt, String railBilDt, String deltFlg, String eaiEvntDt, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.toNodCd = toNodCd;
		this.ediRcvVndrSeq = ediRcvVndrSeq;
		this.vslCd = vslCd;
		this.currCd = currCd;
		this.invVndrSeq = invVndrSeq;
		this.deltFlg = deltFlg;
		this.railIrgSubSeq = railIrgSubSeq;
		this.trspSoSeq = trspSoSeq;
		this.creDt = creDt;
		this.invStyCd = invStyCd;
		this.invRqstVndrSeq = invRqstVndrSeq;
		this.railSeq = railSeq;
		this.trspSoOfcCtyCd = trspSoOfcCtyCd;
		this.pagerows = pagerows;
		this.trspCoIndCd = trspCoIndCd;
		this.ibflag = ibflag;
		this.eqNo = eqNo;
		this.destToNodCd = destToNodCd;
		this.ediBilStyCd = ediBilStyCd;
		this.updUsrId = updUsrId;
		this.actTrspVndrSeq = actTrspVndrSeq;
		this.updDt = updDt;
		this.etcAddAmt = etcAddAmt;
		this.trspBndCd = trspBndCd;
		this.skdVoyNo = skdVoyNo;
		this.eaiEvntDt = eaiEvntDt;
		this.bzcAmt = bzcAmt;
		this.skdDirCd = skdDirCd;
		this.eqTpszCd = eqTpszCd;
		this.invNo = invNo;
		this.fmNodCd = fmNodCd;
		this.creUsrId = creUsrId;
		this.bkgNo = bkgNo;
		this.slanCd = slanCd;
		this.railBilDt = railBilDt;
		this.lgsCostCd = lgsCostCd;
		this.fullMtyCd = fullMtyCd;
		this.orgFmNodCd = orgFmNodCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("to_nod_cd", getToNodCd());
		this.hashColumns.put("edi_rcv_vndr_seq", getEdiRcvVndrSeq());
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("curr_cd", getCurrCd());
		this.hashColumns.put("inv_vndr_seq", getInvVndrSeq());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("rail_irg_sub_seq", getRailIrgSubSeq());
		this.hashColumns.put("trsp_so_seq", getTrspSoSeq());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("inv_sty_cd", getInvStyCd());
		this.hashColumns.put("inv_rqst_vndr_seq", getInvRqstVndrSeq());
		this.hashColumns.put("rail_seq", getRailSeq());
		this.hashColumns.put("trsp_so_ofc_cty_cd", getTrspSoOfcCtyCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("trsp_co_ind_cd", getTrspCoIndCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("eq_no", getEqNo());
		this.hashColumns.put("dest_to_nod_cd", getDestToNodCd());
		this.hashColumns.put("edi_bil_sty_cd", getEdiBilStyCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("act_trsp_vndr_seq", getActTrspVndrSeq());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("etc_add_amt", getEtcAddAmt());
		this.hashColumns.put("trsp_bnd_cd", getTrspBndCd());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("eai_evnt_dt", getEaiEvntDt());
		this.hashColumns.put("bzc_amt", getBzcAmt());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("eq_tpsz_cd", getEqTpszCd());
		this.hashColumns.put("inv_no", getInvNo());
		this.hashColumns.put("fm_nod_cd", getFmNodCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("slan_cd", getSlanCd());
		this.hashColumns.put("rail_bil_dt", getRailBilDt());
		this.hashColumns.put("lgs_cost_cd", getLgsCostCd());
		this.hashColumns.put("full_mty_cd", getFullMtyCd());
		this.hashColumns.put("org_fm_nod_cd", getOrgFmNodCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("to_nod_cd", "toNodCd");
		this.hashFields.put("edi_rcv_vndr_seq", "ediRcvVndrSeq");
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("curr_cd", "currCd");
		this.hashFields.put("inv_vndr_seq", "invVndrSeq");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("rail_irg_sub_seq", "railIrgSubSeq");
		this.hashFields.put("trsp_so_seq", "trspSoSeq");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("inv_sty_cd", "invStyCd");
		this.hashFields.put("inv_rqst_vndr_seq", "invRqstVndrSeq");
		this.hashFields.put("rail_seq", "railSeq");
		this.hashFields.put("trsp_so_ofc_cty_cd", "trspSoOfcCtyCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("trsp_co_ind_cd", "trspCoIndCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("eq_no", "eqNo");
		this.hashFields.put("dest_to_nod_cd", "destToNodCd");
		this.hashFields.put("edi_bil_sty_cd", "ediBilStyCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("act_trsp_vndr_seq", "actTrspVndrSeq");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("etc_add_amt", "etcAddAmt");
		this.hashFields.put("trsp_bnd_cd", "trspBndCd");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("eai_evnt_dt", "eaiEvntDt");
		this.hashFields.put("bzc_amt", "bzcAmt");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("eq_tpsz_cd", "eqTpszCd");
		this.hashFields.put("inv_no", "invNo");
		this.hashFields.put("fm_nod_cd", "fmNodCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("slan_cd", "slanCd");
		this.hashFields.put("rail_bil_dt", "railBilDt");
		this.hashFields.put("lgs_cost_cd", "lgsCostCd");
		this.hashFields.put("full_mty_cd", "fullMtyCd");
		this.hashFields.put("org_fm_nod_cd", "orgFmNodCd");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return toNodCd
	 */
	public String getToNodCd() {
		return this.toNodCd;
	}
	
	/**
	 * Column Info
	 * @return ediRcvVndrSeq
	 */
	public String getEdiRcvVndrSeq() {
		return this.ediRcvVndrSeq;
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
	 * @return currCd
	 */
	public String getCurrCd() {
		return this.currCd;
	}
	
	/**
	 * Column Info
	 * @return invVndrSeq
	 */
	public String getInvVndrSeq() {
		return this.invVndrSeq;
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
	 * @return railIrgSubSeq
	 */
	public String getRailIrgSubSeq() {
		return this.railIrgSubSeq;
	}
	
	/**
	 * Column Info
	 * @return trspSoSeq
	 */
	public String getTrspSoSeq() {
		return this.trspSoSeq;
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
	 * @return invStyCd
	 */
	public String getInvStyCd() {
		return this.invStyCd;
	}
	
	/**
	 * Column Info
	 * @return invRqstVndrSeq
	 */
	public String getInvRqstVndrSeq() {
		return this.invRqstVndrSeq;
	}
	
	/**
	 * Column Info
	 * @return railSeq
	 */
	public String getRailSeq() {
		return this.railSeq;
	}
	
	/**
	 * Column Info
	 * @return trspSoOfcCtyCd
	 */
	public String getTrspSoOfcCtyCd() {
		return this.trspSoOfcCtyCd;
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
	 * @return trspCoIndCd
	 */
	public String getTrspCoIndCd() {
		return this.trspCoIndCd;
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
	 * @return eqNo
	 */
	public String getEqNo() {
		return this.eqNo;
	}
	
	/**
	 * Column Info
	 * @return destToNodCd
	 */
	public String getDestToNodCd() {
		return this.destToNodCd;
	}
	
	/**
	 * Column Info
	 * @return ediBilStyCd
	 */
	public String getEdiBilStyCd() {
		return this.ediBilStyCd;
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
	 * @return actTrspVndrSeq
	 */
	public String getActTrspVndrSeq() {
		return this.actTrspVndrSeq;
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
	 * @return etcAddAmt
	 */
	public String getEtcAddAmt() {
		return this.etcAddAmt;
	}
	
	/**
	 * Column Info
	 * @return trspBndCd
	 */
	public String getTrspBndCd() {
		return this.trspBndCd;
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
	 * @return eaiEvntDt
	 */
	public String getEaiEvntDt() {
		return this.eaiEvntDt;
	}
	
	/**
	 * Column Info
	 * @return bzcAmt
	 */
	public String getBzcAmt() {
		return this.bzcAmt;
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
	 * @return eqTpszCd
	 */
	public String getEqTpszCd() {
		return this.eqTpszCd;
	}
	
	/**
	 * Column Info
	 * @return invNo
	 */
	public String getInvNo() {
		return this.invNo;
	}
	
	/**
	 * Column Info
	 * @return fmNodCd
	 */
	public String getFmNodCd() {
		return this.fmNodCd;
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
	 * @return slanCd
	 */
	public String getSlanCd() {
		return this.slanCd;
	}
	
	/**
	 * Column Info
	 * @return railBilDt
	 */
	public String getRailBilDt() {
		return this.railBilDt;
	}
	
	/**
	 * Column Info
	 * @return lgsCostCd
	 */
	public String getLgsCostCd() {
		return this.lgsCostCd;
	}
	
	/**
	 * Column Info
	 * @return fullMtyCd
	 */
	public String getFullMtyCd() {
		return this.fullMtyCd;
	}
	
	/**
	 * Column Info
	 * @return orgFmNodCd
	 */
	public String getOrgFmNodCd() {
		return this.orgFmNodCd;
	}
	

	/**
	 * Column Info
	 * @param toNodCd
	 */
	public void setToNodCd(String toNodCd) {
		this.toNodCd = toNodCd;
	}
	
	/**
	 * Column Info
	 * @param ediRcvVndrSeq
	 */
	public void setEdiRcvVndrSeq(String ediRcvVndrSeq) {
		this.ediRcvVndrSeq = ediRcvVndrSeq;
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
	 * @param currCd
	 */
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	
	/**
	 * Column Info
	 * @param invVndrSeq
	 */
	public void setInvVndrSeq(String invVndrSeq) {
		this.invVndrSeq = invVndrSeq;
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
	 * @param railIrgSubSeq
	 */
	public void setRailIrgSubSeq(String railIrgSubSeq) {
		this.railIrgSubSeq = railIrgSubSeq;
	}
	
	/**
	 * Column Info
	 * @param trspSoSeq
	 */
	public void setTrspSoSeq(String trspSoSeq) {
		this.trspSoSeq = trspSoSeq;
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
	 * @param invStyCd
	 */
	public void setInvStyCd(String invStyCd) {
		this.invStyCd = invStyCd;
	}
	
	/**
	 * Column Info
	 * @param invRqstVndrSeq
	 */
	public void setInvRqstVndrSeq(String invRqstVndrSeq) {
		this.invRqstVndrSeq = invRqstVndrSeq;
	}
	
	/**
	 * Column Info
	 * @param railSeq
	 */
	public void setRailSeq(String railSeq) {
		this.railSeq = railSeq;
	}
	
	/**
	 * Column Info
	 * @param trspSoOfcCtyCd
	 */
	public void setTrspSoOfcCtyCd(String trspSoOfcCtyCd) {
		this.trspSoOfcCtyCd = trspSoOfcCtyCd;
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
	 * @param trspCoIndCd
	 */
	public void setTrspCoIndCd(String trspCoIndCd) {
		this.trspCoIndCd = trspCoIndCd;
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
	 * @param eqNo
	 */
	public void setEqNo(String eqNo) {
		this.eqNo = eqNo;
	}
	
	/**
	 * Column Info
	 * @param destToNodCd
	 */
	public void setDestToNodCd(String destToNodCd) {
		this.destToNodCd = destToNodCd;
	}
	
	/**
	 * Column Info
	 * @param ediBilStyCd
	 */
	public void setEdiBilStyCd(String ediBilStyCd) {
		this.ediBilStyCd = ediBilStyCd;
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
	 * @param actTrspVndrSeq
	 */
	public void setActTrspVndrSeq(String actTrspVndrSeq) {
		this.actTrspVndrSeq = actTrspVndrSeq;
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
	 * @param etcAddAmt
	 */
	public void setEtcAddAmt(String etcAddAmt) {
		this.etcAddAmt = etcAddAmt;
	}
	
	/**
	 * Column Info
	 * @param trspBndCd
	 */
	public void setTrspBndCd(String trspBndCd) {
		this.trspBndCd = trspBndCd;
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
	 * @param eaiEvntDt
	 */
	public void setEaiEvntDt(String eaiEvntDt) {
		this.eaiEvntDt = eaiEvntDt;
	}
	
	/**
	 * Column Info
	 * @param bzcAmt
	 */
	public void setBzcAmt(String bzcAmt) {
		this.bzcAmt = bzcAmt;
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
	 * @param eqTpszCd
	 */
	public void setEqTpszCd(String eqTpszCd) {
		this.eqTpszCd = eqTpszCd;
	}
	
	/**
	 * Column Info
	 * @param invNo
	 */
	public void setInvNo(String invNo) {
		this.invNo = invNo;
	}
	
	/**
	 * Column Info
	 * @param fmNodCd
	 */
	public void setFmNodCd(String fmNodCd) {
		this.fmNodCd = fmNodCd;
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
	 * @param slanCd
	 */
	public void setSlanCd(String slanCd) {
		this.slanCd = slanCd;
	}
	
	/**
	 * Column Info
	 * @param railBilDt
	 */
	public void setRailBilDt(String railBilDt) {
		this.railBilDt = railBilDt;
	}
	
	/**
	 * Column Info
	 * @param lgsCostCd
	 */
	public void setLgsCostCd(String lgsCostCd) {
		this.lgsCostCd = lgsCostCd;
	}
	
	/**
	 * Column Info
	 * @param fullMtyCd
	 */
	public void setFullMtyCd(String fullMtyCd) {
		this.fullMtyCd = fullMtyCd;
	}
	
	/**
	 * Column Info
	 * @param orgFmNodCd
	 */
	public void setOrgFmNodCd(String orgFmNodCd) {
		this.orgFmNodCd = orgFmNodCd;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setToNodCd(JSPUtil.getParameter(request, "to_nod_cd", ""));
		setEdiRcvVndrSeq(JSPUtil.getParameter(request, "edi_rcv_vndr_seq", ""));
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setCurrCd(JSPUtil.getParameter(request, "curr_cd", ""));
		setInvVndrSeq(JSPUtil.getParameter(request, "inv_vndr_seq", ""));
		setDeltFlg(JSPUtil.getParameter(request, "delt_flg", ""));
		setRailIrgSubSeq(JSPUtil.getParameter(request, "rail_irg_sub_seq", ""));
		setTrspSoSeq(JSPUtil.getParameter(request, "trsp_so_seq", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setInvStyCd(JSPUtil.getParameter(request, "inv_sty_cd", ""));
		setInvRqstVndrSeq(JSPUtil.getParameter(request, "inv_rqst_vndr_seq", ""));
		setRailSeq(JSPUtil.getParameter(request, "rail_seq", ""));
		setTrspSoOfcCtyCd(JSPUtil.getParameter(request, "trsp_so_ofc_cty_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setTrspCoIndCd(JSPUtil.getParameter(request, "trsp_co_ind_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setEqNo(JSPUtil.getParameter(request, "eq_no", ""));
		setDestToNodCd(JSPUtil.getParameter(request, "dest_to_nod_cd", ""));
		setEdiBilStyCd(JSPUtil.getParameter(request, "edi_bil_sty_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setActTrspVndrSeq(JSPUtil.getParameter(request, "act_trsp_vndr_seq", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setEtcAddAmt(JSPUtil.getParameter(request, "etc_add_amt", ""));
		setTrspBndCd(JSPUtil.getParameter(request, "trsp_bnd_cd", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, "skd_voy_no", ""));
		setEaiEvntDt(JSPUtil.getParameter(request, "eai_evnt_dt", ""));
		setBzcAmt(JSPUtil.getParameter(request, "bzc_amt", ""));
		setSkdDirCd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
		setEqTpszCd(JSPUtil.getParameter(request, "eq_tpsz_cd", ""));
		setInvNo(JSPUtil.getParameter(request, "inv_no", ""));
		setFmNodCd(JSPUtil.getParameter(request, "fm_nod_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setSlanCd(JSPUtil.getParameter(request, "slan_cd", ""));
		setRailBilDt(JSPUtil.getParameter(request, "rail_bil_dt", ""));
		setLgsCostCd(JSPUtil.getParameter(request, "lgs_cost_cd", ""));
		setFullMtyCd(JSPUtil.getParameter(request, "full_mty_cd", ""));
		setOrgFmNodCd(JSPUtil.getParameter(request, "org_fm_nod_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return TrsTrspRailSoIfVO[]
	 */
	public TrsTrspRailSoIfVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return TrsTrspRailSoIfVO[]
	 */
	public TrsTrspRailSoIfVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		TrsTrspRailSoIfVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] toNodCd = (JSPUtil.getParameter(request, prefix	+ "to_nod_cd", length));
			String[] ediRcvVndrSeq = (JSPUtil.getParameter(request, prefix	+ "edi_rcv_vndr_seq", length));
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] currCd = (JSPUtil.getParameter(request, prefix	+ "curr_cd", length));
			String[] invVndrSeq = (JSPUtil.getParameter(request, prefix	+ "inv_vndr_seq", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] railIrgSubSeq = (JSPUtil.getParameter(request, prefix	+ "rail_irg_sub_seq", length));
			String[] trspSoSeq = (JSPUtil.getParameter(request, prefix	+ "trsp_so_seq", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] invStyCd = (JSPUtil.getParameter(request, prefix	+ "inv_sty_cd", length));
			String[] invRqstVndrSeq = (JSPUtil.getParameter(request, prefix	+ "inv_rqst_vndr_seq", length));
			String[] railSeq = (JSPUtil.getParameter(request, prefix	+ "rail_seq", length));
			String[] trspSoOfcCtyCd = (JSPUtil.getParameter(request, prefix	+ "trsp_so_ofc_cty_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] trspCoIndCd = (JSPUtil.getParameter(request, prefix	+ "trsp_co_ind_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] eqNo = (JSPUtil.getParameter(request, prefix	+ "eq_no", length));
			String[] destToNodCd = (JSPUtil.getParameter(request, prefix	+ "dest_to_nod_cd", length));
			String[] ediBilStyCd = (JSPUtil.getParameter(request, prefix	+ "edi_bil_sty_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] actTrspVndrSeq = (JSPUtil.getParameter(request, prefix	+ "act_trsp_vndr_seq", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] etcAddAmt = (JSPUtil.getParameter(request, prefix	+ "etc_add_amt", length));
			String[] trspBndCd = (JSPUtil.getParameter(request, prefix	+ "trsp_bnd_cd", length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no", length));
			String[] eaiEvntDt = (JSPUtil.getParameter(request, prefix	+ "eai_evnt_dt", length));
			String[] bzcAmt = (JSPUtil.getParameter(request, prefix	+ "bzc_amt", length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd", length));
			String[] eqTpszCd = (JSPUtil.getParameter(request, prefix	+ "eq_tpsz_cd", length));
			String[] invNo = (JSPUtil.getParameter(request, prefix	+ "inv_no", length));
			String[] fmNodCd = (JSPUtil.getParameter(request, prefix	+ "fm_nod_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] slanCd = (JSPUtil.getParameter(request, prefix	+ "slan_cd", length));
			String[] railBilDt = (JSPUtil.getParameter(request, prefix	+ "rail_bil_dt", length));
			String[] lgsCostCd = (JSPUtil.getParameter(request, prefix	+ "lgs_cost_cd", length));
			String[] fullMtyCd = (JSPUtil.getParameter(request, prefix	+ "full_mty_cd", length));
			String[] orgFmNodCd = (JSPUtil.getParameter(request, prefix	+ "org_fm_nod_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new TrsTrspRailSoIfVO();
				if (toNodCd[i] != null)
					model.setToNodCd(toNodCd[i]);
				if (ediRcvVndrSeq[i] != null)
					model.setEdiRcvVndrSeq(ediRcvVndrSeq[i]);
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (currCd[i] != null)
					model.setCurrCd(currCd[i]);
				if (invVndrSeq[i] != null)
					model.setInvVndrSeq(invVndrSeq[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (railIrgSubSeq[i] != null)
					model.setRailIrgSubSeq(railIrgSubSeq[i]);
				if (trspSoSeq[i] != null)
					model.setTrspSoSeq(trspSoSeq[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (invStyCd[i] != null)
					model.setInvStyCd(invStyCd[i]);
				if (invRqstVndrSeq[i] != null)
					model.setInvRqstVndrSeq(invRqstVndrSeq[i]);
				if (railSeq[i] != null)
					model.setRailSeq(railSeq[i]);
				if (trspSoOfcCtyCd[i] != null)
					model.setTrspSoOfcCtyCd(trspSoOfcCtyCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (trspCoIndCd[i] != null)
					model.setTrspCoIndCd(trspCoIndCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (eqNo[i] != null)
					model.setEqNo(eqNo[i]);
				if (destToNodCd[i] != null)
					model.setDestToNodCd(destToNodCd[i]);
				if (ediBilStyCd[i] != null)
					model.setEdiBilStyCd(ediBilStyCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (actTrspVndrSeq[i] != null)
					model.setActTrspVndrSeq(actTrspVndrSeq[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (etcAddAmt[i] != null)
					model.setEtcAddAmt(etcAddAmt[i]);
				if (trspBndCd[i] != null)
					model.setTrspBndCd(trspBndCd[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (eaiEvntDt[i] != null)
					model.setEaiEvntDt(eaiEvntDt[i]);
				if (bzcAmt[i] != null)
					model.setBzcAmt(bzcAmt[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (eqTpszCd[i] != null)
					model.setEqTpszCd(eqTpszCd[i]);
				if (invNo[i] != null)
					model.setInvNo(invNo[i]);
				if (fmNodCd[i] != null)
					model.setFmNodCd(fmNodCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (slanCd[i] != null)
					model.setSlanCd(slanCd[i]);
				if (railBilDt[i] != null)
					model.setRailBilDt(railBilDt[i]);
				if (lgsCostCd[i] != null)
					model.setLgsCostCd(lgsCostCd[i]);
				if (fullMtyCd[i] != null)
					model.setFullMtyCd(fullMtyCd[i]);
				if (orgFmNodCd[i] != null)
					model.setOrgFmNodCd(orgFmNodCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getTrsTrspRailSoIfVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return TrsTrspRailSoIfVO[]
	 */
	public TrsTrspRailSoIfVO[] getTrsTrspRailSoIfVOs(){
		TrsTrspRailSoIfVO[] vos = (TrsTrspRailSoIfVO[])models.toArray(new TrsTrspRailSoIfVO[models.size()]);
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
		this.toNodCd = this.toNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediRcvVndrSeq = this.ediRcvVndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.currCd = this.currCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invVndrSeq = this.invVndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.railIrgSubSeq = this.railIrgSubSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspSoSeq = this.trspSoSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invStyCd = this.invStyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invRqstVndrSeq = this.invRqstVndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.railSeq = this.railSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspSoOfcCtyCd = this.trspSoOfcCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspCoIndCd = this.trspCoIndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqNo = this.eqNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.destToNodCd = this.destToNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediBilStyCd = this.ediBilStyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actTrspVndrSeq = this.actTrspVndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.etcAddAmt = this.etcAddAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspBndCd = this.trspBndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eaiEvntDt = this.eaiEvntDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bzcAmt = this.bzcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqTpszCd = this.eqTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invNo = this.invNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fmNodCd = this.fmNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slanCd = this.slanCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.railBilDt = this.railBilDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lgsCostCd = this.lgsCostCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fullMtyCd = this.fullMtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgFmNodCd = this.orgFmNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
