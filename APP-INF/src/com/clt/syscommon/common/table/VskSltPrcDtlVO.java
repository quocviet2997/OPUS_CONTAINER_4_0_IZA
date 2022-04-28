/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : VskSltPrcDtlVO.java
*@FileTitle : VskSltPrcDtlVO
*Open Issues :
*Change history :
*@LastModifyDate : 2010.01.25
*@LastModifier : 서창열
*@LastVersion : 1.0
* 2010.01.25 서창열 
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
 * @author 서창열
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class VskSltPrcDtlVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<VskSltPrcDtlVO> models = new ArrayList<VskSltPrcDtlVO>();
	
	/* Column Info */
	private String mtxFoilPortTtlQty = null;
	/* Column Info */
	private String mtxFoilSeaTtlQty = null;
	/* Column Info */
	private String mtxFoilMnvrTtlQty = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String vslOwnrFlg = null;
	/* Column Info */
	private String dlyBnkCsmQty = null;
	/* Column Info */
	private String vslSlanCd = null;
	/* Column Info */
	private String sltPrcTtlAmt = null;
	/* Column Info */
	private String sltPrcOneWyAmt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String bseQtrCd = null;
	/* Column Info */
	private String vslClssCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String pfSvcTpCd = null;
	/* Column Info */
	private String mtxFoilMnvrDyQty = null;
	/* Column Info */
	private String mtxFoilPortDyQty = null;
	/* Column Info */
	private String chrgHirTtlAmt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String chrgHirTeuAmt = null;
	/* Column Info */
	private String vslClssKnt = null;
	/* Column Info */
	private String ownrHirTtlAmt = null;
	/* Column Info */
	private String mtxFoilTtlQty = null;
	/* Column Info */
	private String ownrHirTeuAmt = null;
	/* Column Info */
	private String sltPrcWrkYr = null;
	/* Column Info */
	private String peAmt = null;
	/* Column Info */
	private String cntrDznCapa = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String bnkExpnAmt = null;
	/* Column Info */
	private String mtxFoilSeaDyQty = null;
	/* Column Info */
	private String sltPrcRndAmt = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public VskSltPrcDtlVO() {}

	public VskSltPrcDtlVO(String ibflag, String pagerows, String vslSlanCd, String pfSvcTpCd, String sltPrcWrkYr, String bseQtrCd, String vslClssCd, String vslClssKnt, String cntrDznCapa, String peAmt, String dlyBnkCsmQty, String mtxFoilSeaDyQty, String mtxFoilSeaTtlQty, String mtxFoilMnvrDyQty, String mtxFoilMnvrTtlQty, String mtxFoilPortDyQty, String mtxFoilPortTtlQty, String mtxFoilTtlQty, String bnkExpnAmt, String vslOwnrFlg, String ownrHirTeuAmt, String ownrHirTtlAmt, String chrgHirTeuAmt, String chrgHirTtlAmt, String sltPrcTtlAmt, String sltPrcRndAmt, String sltPrcOneWyAmt, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.mtxFoilPortTtlQty = mtxFoilPortTtlQty;
		this.mtxFoilSeaTtlQty = mtxFoilSeaTtlQty;
		this.mtxFoilMnvrTtlQty = mtxFoilMnvrTtlQty;
		this.creDt = creDt;
		this.vslOwnrFlg = vslOwnrFlg;
		this.dlyBnkCsmQty = dlyBnkCsmQty;
		this.vslSlanCd = vslSlanCd;
		this.sltPrcTtlAmt = sltPrcTtlAmt;
		this.sltPrcOneWyAmt = sltPrcOneWyAmt;
		this.pagerows = pagerows;
		this.bseQtrCd = bseQtrCd;
		this.vslClssCd = vslClssCd;
		this.ibflag = ibflag;
		this.pfSvcTpCd = pfSvcTpCd;
		this.mtxFoilMnvrDyQty = mtxFoilMnvrDyQty;
		this.mtxFoilPortDyQty = mtxFoilPortDyQty;
		this.chrgHirTtlAmt = chrgHirTtlAmt;
		this.updUsrId = updUsrId;
		this.updDt = updDt;
		this.chrgHirTeuAmt = chrgHirTeuAmt;
		this.vslClssKnt = vslClssKnt;
		this.ownrHirTtlAmt = ownrHirTtlAmt;
		this.mtxFoilTtlQty = mtxFoilTtlQty;
		this.ownrHirTeuAmt = ownrHirTeuAmt;
		this.sltPrcWrkYr = sltPrcWrkYr;
		this.peAmt = peAmt;
		this.cntrDznCapa = cntrDznCapa;
		this.creUsrId = creUsrId;
		this.bnkExpnAmt = bnkExpnAmt;
		this.mtxFoilSeaDyQty = mtxFoilSeaDyQty;
		this.sltPrcRndAmt = sltPrcRndAmt;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("mtx_foil_port_ttl_qty", getMtxFoilPortTtlQty());
		this.hashColumns.put("mtx_foil_sea_ttl_qty", getMtxFoilSeaTtlQty());
		this.hashColumns.put("mtx_foil_mnvr_ttl_qty", getMtxFoilMnvrTtlQty());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("vsl_ownr_flg", getVslOwnrFlg());
		this.hashColumns.put("dly_bnk_csm_qty", getDlyBnkCsmQty());
		this.hashColumns.put("vsl_slan_cd", getVslSlanCd());
		this.hashColumns.put("slt_prc_ttl_amt", getSltPrcTtlAmt());
		this.hashColumns.put("slt_prc_one_wy_amt", getSltPrcOneWyAmt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("bse_qtr_cd", getBseQtrCd());
		this.hashColumns.put("vsl_clss_cd", getVslClssCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("pf_svc_tp_cd", getPfSvcTpCd());
		this.hashColumns.put("mtx_foil_mnvr_dy_qty", getMtxFoilMnvrDyQty());
		this.hashColumns.put("mtx_foil_port_dy_qty", getMtxFoilPortDyQty());
		this.hashColumns.put("chrg_hir_ttl_amt", getChrgHirTtlAmt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("chrg_hir_teu_amt", getChrgHirTeuAmt());
		this.hashColumns.put("vsl_clss_knt", getVslClssKnt());
		this.hashColumns.put("ownr_hir_ttl_amt", getOwnrHirTtlAmt());
		this.hashColumns.put("mtx_foil_ttl_qty", getMtxFoilTtlQty());
		this.hashColumns.put("ownr_hir_teu_amt", getOwnrHirTeuAmt());
		this.hashColumns.put("slt_prc_wrk_yr", getSltPrcWrkYr());
		this.hashColumns.put("pe_amt", getPeAmt());
		this.hashColumns.put("cntr_dzn_capa", getCntrDznCapa());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("bnk_expn_amt", getBnkExpnAmt());
		this.hashColumns.put("mtx_foil_sea_dy_qty", getMtxFoilSeaDyQty());
		this.hashColumns.put("slt_prc_rnd_amt", getSltPrcRndAmt());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("mtx_foil_port_ttl_qty", "mtxFoilPortTtlQty");
		this.hashFields.put("mtx_foil_sea_ttl_qty", "mtxFoilSeaTtlQty");
		this.hashFields.put("mtx_foil_mnvr_ttl_qty", "mtxFoilMnvrTtlQty");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("vsl_ownr_flg", "vslOwnrFlg");
		this.hashFields.put("dly_bnk_csm_qty", "dlyBnkCsmQty");
		this.hashFields.put("vsl_slan_cd", "vslSlanCd");
		this.hashFields.put("slt_prc_ttl_amt", "sltPrcTtlAmt");
		this.hashFields.put("slt_prc_one_wy_amt", "sltPrcOneWyAmt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("bse_qtr_cd", "bseQtrCd");
		this.hashFields.put("vsl_clss_cd", "vslClssCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("pf_svc_tp_cd", "pfSvcTpCd");
		this.hashFields.put("mtx_foil_mnvr_dy_qty", "mtxFoilMnvrDyQty");
		this.hashFields.put("mtx_foil_port_dy_qty", "mtxFoilPortDyQty");
		this.hashFields.put("chrg_hir_ttl_amt", "chrgHirTtlAmt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("chrg_hir_teu_amt", "chrgHirTeuAmt");
		this.hashFields.put("vsl_clss_knt", "vslClssKnt");
		this.hashFields.put("ownr_hir_ttl_amt", "ownrHirTtlAmt");
		this.hashFields.put("mtx_foil_ttl_qty", "mtxFoilTtlQty");
		this.hashFields.put("ownr_hir_teu_amt", "ownrHirTeuAmt");
		this.hashFields.put("slt_prc_wrk_yr", "sltPrcWrkYr");
		this.hashFields.put("pe_amt", "peAmt");
		this.hashFields.put("cntr_dzn_capa", "cntrDznCapa");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("bnk_expn_amt", "bnkExpnAmt");
		this.hashFields.put("mtx_foil_sea_dy_qty", "mtxFoilSeaDyQty");
		this.hashFields.put("slt_prc_rnd_amt", "sltPrcRndAmt");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return mtxFoilPortTtlQty
	 */
	public String getMtxFoilPortTtlQty() {
		return this.mtxFoilPortTtlQty;
	}
	
	/**
	 * Column Info
	 * @return mtxFoilSeaTtlQty
	 */
	public String getMtxFoilSeaTtlQty() {
		return this.mtxFoilSeaTtlQty;
	}
	
	/**
	 * Column Info
	 * @return mtxFoilMnvrTtlQty
	 */
	public String getMtxFoilMnvrTtlQty() {
		return this.mtxFoilMnvrTtlQty;
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
	 * @return vslOwnrFlg
	 */
	public String getVslOwnrFlg() {
		return this.vslOwnrFlg;
	}
	
	/**
	 * Column Info
	 * @return dlyBnkCsmQty
	 */
	public String getDlyBnkCsmQty() {
		return this.dlyBnkCsmQty;
	}
	
	/**
	 * Column Info
	 * @return vslSlanCd
	 */
	public String getVslSlanCd() {
		return this.vslSlanCd;
	}
	
	/**
	 * Column Info
	 * @return sltPrcTtlAmt
	 */
	public String getSltPrcTtlAmt() {
		return this.sltPrcTtlAmt;
	}
	
	/**
	 * Column Info
	 * @return sltPrcOneWyAmt
	 */
	public String getSltPrcOneWyAmt() {
		return this.sltPrcOneWyAmt;
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
	 * @return bseQtrCd
	 */
	public String getBseQtrCd() {
		return this.bseQtrCd;
	}
	
	/**
	 * Column Info
	 * @return vslClssCd
	 */
	public String getVslClssCd() {
		return this.vslClssCd;
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
	 * @return pfSvcTpCd
	 */
	public String getPfSvcTpCd() {
		return this.pfSvcTpCd;
	}
	
	/**
	 * Column Info
	 * @return mtxFoilMnvrDyQty
	 */
	public String getMtxFoilMnvrDyQty() {
		return this.mtxFoilMnvrDyQty;
	}
	
	/**
	 * Column Info
	 * @return mtxFoilPortDyQty
	 */
	public String getMtxFoilPortDyQty() {
		return this.mtxFoilPortDyQty;
	}
	
	/**
	 * Column Info
	 * @return chrgHirTtlAmt
	 */
	public String getChrgHirTtlAmt() {
		return this.chrgHirTtlAmt;
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
	 * @return chrgHirTeuAmt
	 */
	public String getChrgHirTeuAmt() {
		return this.chrgHirTeuAmt;
	}
	
	/**
	 * Column Info
	 * @return vslClssKnt
	 */
	public String getVslClssKnt() {
		return this.vslClssKnt;
	}
	
	/**
	 * Column Info
	 * @return ownrHirTtlAmt
	 */
	public String getOwnrHirTtlAmt() {
		return this.ownrHirTtlAmt;
	}
	
	/**
	 * Column Info
	 * @return mtxFoilTtlQty
	 */
	public String getMtxFoilTtlQty() {
		return this.mtxFoilTtlQty;
	}
	
	/**
	 * Column Info
	 * @return ownrHirTeuAmt
	 */
	public String getOwnrHirTeuAmt() {
		return this.ownrHirTeuAmt;
	}
	
	/**
	 * Column Info
	 * @return sltPrcWrkYr
	 */
	public String getSltPrcWrkYr() {
		return this.sltPrcWrkYr;
	}
	
	/**
	 * Column Info
	 * @return peAmt
	 */
	public String getPeAmt() {
		return this.peAmt;
	}
	
	/**
	 * Column Info
	 * @return cntrDznCapa
	 */
	public String getCntrDznCapa() {
		return this.cntrDznCapa;
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
	 * @return bnkExpnAmt
	 */
	public String getBnkExpnAmt() {
		return this.bnkExpnAmt;
	}
	
	/**
	 * Column Info
	 * @return mtxFoilSeaDyQty
	 */
	public String getMtxFoilSeaDyQty() {
		return this.mtxFoilSeaDyQty;
	}
	
	/**
	 * Column Info
	 * @return sltPrcRndAmt
	 */
	public String getSltPrcRndAmt() {
		return this.sltPrcRndAmt;
	}
	

	/**
	 * Column Info
	 * @param mtxFoilPortTtlQty
	 */
	public void setMtxFoilPortTtlQty(String mtxFoilPortTtlQty) {
		this.mtxFoilPortTtlQty = mtxFoilPortTtlQty;
	}
	
	/**
	 * Column Info
	 * @param mtxFoilSeaTtlQty
	 */
	public void setMtxFoilSeaTtlQty(String mtxFoilSeaTtlQty) {
		this.mtxFoilSeaTtlQty = mtxFoilSeaTtlQty;
	}
	
	/**
	 * Column Info
	 * @param mtxFoilMnvrTtlQty
	 */
	public void setMtxFoilMnvrTtlQty(String mtxFoilMnvrTtlQty) {
		this.mtxFoilMnvrTtlQty = mtxFoilMnvrTtlQty;
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
	 * @param vslOwnrFlg
	 */
	public void setVslOwnrFlg(String vslOwnrFlg) {
		this.vslOwnrFlg = vslOwnrFlg;
	}
	
	/**
	 * Column Info
	 * @param dlyBnkCsmQty
	 */
	public void setDlyBnkCsmQty(String dlyBnkCsmQty) {
		this.dlyBnkCsmQty = dlyBnkCsmQty;
	}
	
	/**
	 * Column Info
	 * @param vslSlanCd
	 */
	public void setVslSlanCd(String vslSlanCd) {
		this.vslSlanCd = vslSlanCd;
	}
	
	/**
	 * Column Info
	 * @param sltPrcTtlAmt
	 */
	public void setSltPrcTtlAmt(String sltPrcTtlAmt) {
		this.sltPrcTtlAmt = sltPrcTtlAmt;
	}
	
	/**
	 * Column Info
	 * @param sltPrcOneWyAmt
	 */
	public void setSltPrcOneWyAmt(String sltPrcOneWyAmt) {
		this.sltPrcOneWyAmt = sltPrcOneWyAmt;
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
	 * @param bseQtrCd
	 */
	public void setBseQtrCd(String bseQtrCd) {
		this.bseQtrCd = bseQtrCd;
	}
	
	/**
	 * Column Info
	 * @param vslClssCd
	 */
	public void setVslClssCd(String vslClssCd) {
		this.vslClssCd = vslClssCd;
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
	 * @param pfSvcTpCd
	 */
	public void setPfSvcTpCd(String pfSvcTpCd) {
		this.pfSvcTpCd = pfSvcTpCd;
	}
	
	/**
	 * Column Info
	 * @param mtxFoilMnvrDyQty
	 */
	public void setMtxFoilMnvrDyQty(String mtxFoilMnvrDyQty) {
		this.mtxFoilMnvrDyQty = mtxFoilMnvrDyQty;
	}
	
	/**
	 * Column Info
	 * @param mtxFoilPortDyQty
	 */
	public void setMtxFoilPortDyQty(String mtxFoilPortDyQty) {
		this.mtxFoilPortDyQty = mtxFoilPortDyQty;
	}
	
	/**
	 * Column Info
	 * @param chrgHirTtlAmt
	 */
	public void setChrgHirTtlAmt(String chrgHirTtlAmt) {
		this.chrgHirTtlAmt = chrgHirTtlAmt;
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
	 * @param chrgHirTeuAmt
	 */
	public void setChrgHirTeuAmt(String chrgHirTeuAmt) {
		this.chrgHirTeuAmt = chrgHirTeuAmt;
	}
	
	/**
	 * Column Info
	 * @param vslClssKnt
	 */
	public void setVslClssKnt(String vslClssKnt) {
		this.vslClssKnt = vslClssKnt;
	}
	
	/**
	 * Column Info
	 * @param ownrHirTtlAmt
	 */
	public void setOwnrHirTtlAmt(String ownrHirTtlAmt) {
		this.ownrHirTtlAmt = ownrHirTtlAmt;
	}
	
	/**
	 * Column Info
	 * @param mtxFoilTtlQty
	 */
	public void setMtxFoilTtlQty(String mtxFoilTtlQty) {
		this.mtxFoilTtlQty = mtxFoilTtlQty;
	}
	
	/**
	 * Column Info
	 * @param ownrHirTeuAmt
	 */
	public void setOwnrHirTeuAmt(String ownrHirTeuAmt) {
		this.ownrHirTeuAmt = ownrHirTeuAmt;
	}
	
	/**
	 * Column Info
	 * @param sltPrcWrkYr
	 */
	public void setSltPrcWrkYr(String sltPrcWrkYr) {
		this.sltPrcWrkYr = sltPrcWrkYr;
	}
	
	/**
	 * Column Info
	 * @param peAmt
	 */
	public void setPeAmt(String peAmt) {
		this.peAmt = peAmt;
	}
	
	/**
	 * Column Info
	 * @param cntrDznCapa
	 */
	public void setCntrDznCapa(String cntrDznCapa) {
		this.cntrDznCapa = cntrDznCapa;
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
	 * @param bnkExpnAmt
	 */
	public void setBnkExpnAmt(String bnkExpnAmt) {
		this.bnkExpnAmt = bnkExpnAmt;
	}
	
	/**
	 * Column Info
	 * @param mtxFoilSeaDyQty
	 */
	public void setMtxFoilSeaDyQty(String mtxFoilSeaDyQty) {
		this.mtxFoilSeaDyQty = mtxFoilSeaDyQty;
	}
	
	/**
	 * Column Info
	 * @param sltPrcRndAmt
	 */
	public void setSltPrcRndAmt(String sltPrcRndAmt) {
		this.sltPrcRndAmt = sltPrcRndAmt;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setMtxFoilPortTtlQty(JSPUtil.getParameter(request, "mtx_foil_port_ttl_qty", ""));
		setMtxFoilSeaTtlQty(JSPUtil.getParameter(request, "mtx_foil_sea_ttl_qty", ""));
		setMtxFoilMnvrTtlQty(JSPUtil.getParameter(request, "mtx_foil_mnvr_ttl_qty", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setVslOwnrFlg(JSPUtil.getParameter(request, "vsl_ownr_flg", ""));
		setDlyBnkCsmQty(JSPUtil.getParameter(request, "dly_bnk_csm_qty", ""));
		setVslSlanCd(JSPUtil.getParameter(request, "vsl_slan_cd", ""));
		setSltPrcTtlAmt(JSPUtil.getParameter(request, "slt_prc_ttl_amt", ""));
		setSltPrcOneWyAmt(JSPUtil.getParameter(request, "slt_prc_one_wy_amt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setBseQtrCd(JSPUtil.getParameter(request, "bse_qtr_cd", ""));
		setVslClssCd(JSPUtil.getParameter(request, "vsl_clss_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setPfSvcTpCd(JSPUtil.getParameter(request, "pf_svc_tp_cd", ""));
		setMtxFoilMnvrDyQty(JSPUtil.getParameter(request, "mtx_foil_mnvr_dy_qty", ""));
		setMtxFoilPortDyQty(JSPUtil.getParameter(request, "mtx_foil_port_dy_qty", ""));
		setChrgHirTtlAmt(JSPUtil.getParameter(request, "chrg_hir_ttl_amt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setChrgHirTeuAmt(JSPUtil.getParameter(request, "chrg_hir_teu_amt", ""));
		setVslClssKnt(JSPUtil.getParameter(request, "vsl_clss_knt", ""));
		setOwnrHirTtlAmt(JSPUtil.getParameter(request, "ownr_hir_ttl_amt", ""));
		setMtxFoilTtlQty(JSPUtil.getParameter(request, "mtx_foil_ttl_qty", ""));
		setOwnrHirTeuAmt(JSPUtil.getParameter(request, "ownr_hir_teu_amt", ""));
		setSltPrcWrkYr(JSPUtil.getParameter(request, "slt_prc_wrk_yr", ""));
		setPeAmt(JSPUtil.getParameter(request, "pe_amt", ""));
		setCntrDznCapa(JSPUtil.getParameter(request, "cntr_dzn_capa", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setBnkExpnAmt(JSPUtil.getParameter(request, "bnk_expn_amt", ""));
		setMtxFoilSeaDyQty(JSPUtil.getParameter(request, "mtx_foil_sea_dy_qty", ""));
		setSltPrcRndAmt(JSPUtil.getParameter(request, "slt_prc_rnd_amt", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return VskSltPrcDtlVO[]
	 */
	public VskSltPrcDtlVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return VskSltPrcDtlVO[]
	 */
	public VskSltPrcDtlVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		VskSltPrcDtlVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] mtxFoilPortTtlQty = (JSPUtil.getParameter(request, prefix	+ "mtx_foil_port_ttl_qty", length));
			String[] mtxFoilSeaTtlQty = (JSPUtil.getParameter(request, prefix	+ "mtx_foil_sea_ttl_qty", length));
			String[] mtxFoilMnvrTtlQty = (JSPUtil.getParameter(request, prefix	+ "mtx_foil_mnvr_ttl_qty", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] vslOwnrFlg = (JSPUtil.getParameter(request, prefix	+ "vsl_ownr_flg", length));
			String[] dlyBnkCsmQty = (JSPUtil.getParameter(request, prefix	+ "dly_bnk_csm_qty", length));
			String[] vslSlanCd = (JSPUtil.getParameter(request, prefix	+ "vsl_slan_cd", length));
			String[] sltPrcTtlAmt = (JSPUtil.getParameter(request, prefix	+ "slt_prc_ttl_amt", length));
			String[] sltPrcOneWyAmt = (JSPUtil.getParameter(request, prefix	+ "slt_prc_one_wy_amt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] bseQtrCd = (JSPUtil.getParameter(request, prefix	+ "bse_qtr_cd", length));
			String[] vslClssCd = (JSPUtil.getParameter(request, prefix	+ "vsl_clss_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] pfSvcTpCd = (JSPUtil.getParameter(request, prefix	+ "pf_svc_tp_cd", length));
			String[] mtxFoilMnvrDyQty = (JSPUtil.getParameter(request, prefix	+ "mtx_foil_mnvr_dy_qty", length));
			String[] mtxFoilPortDyQty = (JSPUtil.getParameter(request, prefix	+ "mtx_foil_port_dy_qty", length));
			String[] chrgHirTtlAmt = (JSPUtil.getParameter(request, prefix	+ "chrg_hir_ttl_amt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] chrgHirTeuAmt = (JSPUtil.getParameter(request, prefix	+ "chrg_hir_teu_amt", length));
			String[] vslClssKnt = (JSPUtil.getParameter(request, prefix	+ "vsl_clss_knt", length));
			String[] ownrHirTtlAmt = (JSPUtil.getParameter(request, prefix	+ "ownr_hir_ttl_amt", length));
			String[] mtxFoilTtlQty = (JSPUtil.getParameter(request, prefix	+ "mtx_foil_ttl_qty", length));
			String[] ownrHirTeuAmt = (JSPUtil.getParameter(request, prefix	+ "ownr_hir_teu_amt", length));
			String[] sltPrcWrkYr = (JSPUtil.getParameter(request, prefix	+ "slt_prc_wrk_yr", length));
			String[] peAmt = (JSPUtil.getParameter(request, prefix	+ "pe_amt", length));
			String[] cntrDznCapa = (JSPUtil.getParameter(request, prefix	+ "cntr_dzn_capa", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] bnkExpnAmt = (JSPUtil.getParameter(request, prefix	+ "bnk_expn_amt", length));
			String[] mtxFoilSeaDyQty = (JSPUtil.getParameter(request, prefix	+ "mtx_foil_sea_dy_qty", length));
			String[] sltPrcRndAmt = (JSPUtil.getParameter(request, prefix	+ "slt_prc_rnd_amt", length));
			
			for (int i = 0; i < length; i++) {
				model = new VskSltPrcDtlVO();
				if (mtxFoilPortTtlQty[i] != null)
					model.setMtxFoilPortTtlQty(mtxFoilPortTtlQty[i]);
				if (mtxFoilSeaTtlQty[i] != null)
					model.setMtxFoilSeaTtlQty(mtxFoilSeaTtlQty[i]);
				if (mtxFoilMnvrTtlQty[i] != null)
					model.setMtxFoilMnvrTtlQty(mtxFoilMnvrTtlQty[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (vslOwnrFlg[i] != null)
					model.setVslOwnrFlg(vslOwnrFlg[i]);
				if (dlyBnkCsmQty[i] != null)
					model.setDlyBnkCsmQty(dlyBnkCsmQty[i]);
				if (vslSlanCd[i] != null)
					model.setVslSlanCd(vslSlanCd[i]);
				if (sltPrcTtlAmt[i] != null)
					model.setSltPrcTtlAmt(sltPrcTtlAmt[i]);
				if (sltPrcOneWyAmt[i] != null)
					model.setSltPrcOneWyAmt(sltPrcOneWyAmt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (bseQtrCd[i] != null)
					model.setBseQtrCd(bseQtrCd[i]);
				if (vslClssCd[i] != null)
					model.setVslClssCd(vslClssCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (pfSvcTpCd[i] != null)
					model.setPfSvcTpCd(pfSvcTpCd[i]);
				if (mtxFoilMnvrDyQty[i] != null)
					model.setMtxFoilMnvrDyQty(mtxFoilMnvrDyQty[i]);
				if (mtxFoilPortDyQty[i] != null)
					model.setMtxFoilPortDyQty(mtxFoilPortDyQty[i]);
				if (chrgHirTtlAmt[i] != null)
					model.setChrgHirTtlAmt(chrgHirTtlAmt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (chrgHirTeuAmt[i] != null)
					model.setChrgHirTeuAmt(chrgHirTeuAmt[i]);
				if (vslClssKnt[i] != null)
					model.setVslClssKnt(vslClssKnt[i]);
				if (ownrHirTtlAmt[i] != null)
					model.setOwnrHirTtlAmt(ownrHirTtlAmt[i]);
				if (mtxFoilTtlQty[i] != null)
					model.setMtxFoilTtlQty(mtxFoilTtlQty[i]);
				if (ownrHirTeuAmt[i] != null)
					model.setOwnrHirTeuAmt(ownrHirTeuAmt[i]);
				if (sltPrcWrkYr[i] != null)
					model.setSltPrcWrkYr(sltPrcWrkYr[i]);
				if (peAmt[i] != null)
					model.setPeAmt(peAmt[i]);
				if (cntrDznCapa[i] != null)
					model.setCntrDznCapa(cntrDznCapa[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (bnkExpnAmt[i] != null)
					model.setBnkExpnAmt(bnkExpnAmt[i]);
				if (mtxFoilSeaDyQty[i] != null)
					model.setMtxFoilSeaDyQty(mtxFoilSeaDyQty[i]);
				if (sltPrcRndAmt[i] != null)
					model.setSltPrcRndAmt(sltPrcRndAmt[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getVskSltPrcDtlVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return VskSltPrcDtlVO[]
	 */
	public VskSltPrcDtlVO[] getVskSltPrcDtlVOs(){
		VskSltPrcDtlVO[] vos = (VskSltPrcDtlVO[])models.toArray(new VskSltPrcDtlVO[models.size()]);
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
		this.mtxFoilPortTtlQty = this.mtxFoilPortTtlQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mtxFoilSeaTtlQty = this.mtxFoilSeaTtlQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mtxFoilMnvrTtlQty = this.mtxFoilMnvrTtlQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslOwnrFlg = this.vslOwnrFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dlyBnkCsmQty = this.dlyBnkCsmQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslSlanCd = this.vslSlanCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sltPrcTtlAmt = this.sltPrcTtlAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sltPrcOneWyAmt = this.sltPrcOneWyAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bseQtrCd = this.bseQtrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslClssCd = this.vslClssCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pfSvcTpCd = this.pfSvcTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mtxFoilMnvrDyQty = this.mtxFoilMnvrDyQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mtxFoilPortDyQty = this.mtxFoilPortDyQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chrgHirTtlAmt = this.chrgHirTtlAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chrgHirTeuAmt = this.chrgHirTeuAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslClssKnt = this.vslClssKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ownrHirTtlAmt = this.ownrHirTtlAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mtxFoilTtlQty = this.mtxFoilTtlQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ownrHirTeuAmt = this.ownrHirTeuAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sltPrcWrkYr = this.sltPrcWrkYr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.peAmt = this.peAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrDznCapa = this.cntrDznCapa .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bnkExpnAmt = this.bnkExpnAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mtxFoilSeaDyQty = this.mtxFoilSeaDyQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sltPrcRndAmt = this.sltPrcRndAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
