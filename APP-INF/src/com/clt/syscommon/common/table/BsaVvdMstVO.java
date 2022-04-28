/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BsaVvdMstVO.java
*@FileTitle : BsaVvdMstVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.03
*@LastModifier : 남궁진호
*@LastVersion : 1.0
* 2009.09.03 남궁진호 
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
 * @author 남궁진호
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BsaVvdMstVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BsaVvdMstVO> models = new ArrayList<BsaVvdMstVO>();
	
	/* Column Info */
	private String incmSubChtrAmt = null;
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String iocRuleDesc = null;
	/* Column Info */
	private String incmCrsChtrAmt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String spcOtrSwapFlg = null;
	/* Column Info */
	private String trdCd = null;
	/* Column Info */
	private String rlaneCd = null;
	/* Column Info */
	private String expnSubChtrAmt = null;
	/* Column Info */
	private String n1stPortEtdDt = null;
	/* Column Info */
	private String revPortCd = null;
	/* Column Info */
	private String crrCd = null;
	/* Column Info */
	private String freeAddWgt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String coBsaBfrSubCapa = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String expnBzcChtrAmt = null;
	/* Column Info */
	private String freeAddTeuCapa = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String n2ndFnlCoBsaCapa = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String iocCd = null;
	/* Column Info */
	private String coBsaRto = null;
	/* Column Info */
	private String revPortEtdDt = null;
	/* Column Info */
	private String vopCd = null;
	/* Column Info */
	private String coBsaCapa = null;
	/* Column Info */
	private String chtrBsaRto = null;
	/* Column Info */
	private String incmBzcChtrAmt = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String joEvntDt = null;
	/* Column Info */
	private String portBsaCfmFlg = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Column Info */
	private String vslCapa = null;
	/* Column Info */
	private String bsaCapa = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String expnCrsChtrAmt = null;
	/* Column Info */
	private String bsaOpCd = null;
	/* Column Info */
	private String fnlCoBsaCapa = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BsaVvdMstVO() {}

	public BsaVvdMstVO(String ibflag, String pagerows, String trdCd, String rlaneCd, String vslCd, String skdVoyNo, String skdDirCd, String bsaOpCd, String iocCd, String vopCd, String crrCd, String vslCapa, String bsaCapa, String fnlCoBsaCapa, String n2ndFnlCoBsaCapa, String coBsaCapa, String coBsaRto, String chtrBsaRto, String coBsaBfrSubCapa, String revPortCd, String revPortEtdDt, String n1stPortEtdDt, String iocRuleDesc, String expnBzcChtrAmt, String expnSubChtrAmt, String expnCrsChtrAmt, String incmBzcChtrAmt, String incmSubChtrAmt, String incmCrsChtrAmt, String freeAddTeuCapa, String freeAddWgt, String spcOtrSwapFlg, String portBsaCfmFlg, String joEvntDt, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.incmSubChtrAmt = incmSubChtrAmt;
		this.vslCd = vslCd;
		this.iocRuleDesc = iocRuleDesc;
		this.incmCrsChtrAmt = incmCrsChtrAmt;
		this.creDt = creDt;
		this.spcOtrSwapFlg = spcOtrSwapFlg;
		this.trdCd = trdCd;
		this.rlaneCd = rlaneCd;
		this.expnSubChtrAmt = expnSubChtrAmt;
		this.n1stPortEtdDt = n1stPortEtdDt;
		this.revPortCd = revPortCd;
		this.crrCd = crrCd;
		this.freeAddWgt = freeAddWgt;
		this.pagerows = pagerows;
		this.coBsaBfrSubCapa = coBsaBfrSubCapa;
		this.ibflag = ibflag;
		this.expnBzcChtrAmt = expnBzcChtrAmt;
		this.freeAddTeuCapa = freeAddTeuCapa;
		this.updUsrId = updUsrId;
		this.n2ndFnlCoBsaCapa = n2ndFnlCoBsaCapa;
		this.updDt = updDt;
		this.iocCd = iocCd;
		this.coBsaRto = coBsaRto;
		this.revPortEtdDt = revPortEtdDt;
		this.vopCd = vopCd;
		this.coBsaCapa = coBsaCapa;
		this.chtrBsaRto = chtrBsaRto;
		this.incmBzcChtrAmt = incmBzcChtrAmt;
		this.skdVoyNo = skdVoyNo;
		this.joEvntDt = joEvntDt;
		this.portBsaCfmFlg = portBsaCfmFlg;
		this.skdDirCd = skdDirCd;
		this.vslCapa = vslCapa;
		this.bsaCapa = bsaCapa;
		this.creUsrId = creUsrId;
		this.expnCrsChtrAmt = expnCrsChtrAmt;
		this.bsaOpCd = bsaOpCd;
		this.fnlCoBsaCapa = fnlCoBsaCapa;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("incm_sub_chtr_amt", getIncmSubChtrAmt());
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("ioc_rule_desc", getIocRuleDesc());
		this.hashColumns.put("incm_crs_chtr_amt", getIncmCrsChtrAmt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("spc_otr_swap_flg", getSpcOtrSwapFlg());
		this.hashColumns.put("trd_cd", getTrdCd());
		this.hashColumns.put("rlane_cd", getRlaneCd());
		this.hashColumns.put("expn_sub_chtr_amt", getExpnSubChtrAmt());
		this.hashColumns.put("n1st_port_etd_dt", getN1stPortEtdDt());
		this.hashColumns.put("rev_port_cd", getRevPortCd());
		this.hashColumns.put("crr_cd", getCrrCd());
		this.hashColumns.put("free_add_wgt", getFreeAddWgt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("co_bsa_bfr_sub_capa", getCoBsaBfrSubCapa());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("expn_bzc_chtr_amt", getExpnBzcChtrAmt());
		this.hashColumns.put("free_add_teu_capa", getFreeAddTeuCapa());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("n2nd_fnl_co_bsa_capa", getN2ndFnlCoBsaCapa());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("ioc_cd", getIocCd());
		this.hashColumns.put("co_bsa_rto", getCoBsaRto());
		this.hashColumns.put("rev_port_etd_dt", getRevPortEtdDt());
		this.hashColumns.put("vop_cd", getVopCd());
		this.hashColumns.put("co_bsa_capa", getCoBsaCapa());
		this.hashColumns.put("chtr_bsa_rto", getChtrBsaRto());
		this.hashColumns.put("incm_bzc_chtr_amt", getIncmBzcChtrAmt());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("jo_evnt_dt", getJoEvntDt());
		this.hashColumns.put("port_bsa_cfm_flg", getPortBsaCfmFlg());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("vsl_capa", getVslCapa());
		this.hashColumns.put("bsa_capa", getBsaCapa());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("expn_crs_chtr_amt", getExpnCrsChtrAmt());
		this.hashColumns.put("bsa_op_cd", getBsaOpCd());
		this.hashColumns.put("fnl_co_bsa_capa", getFnlCoBsaCapa());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("incm_sub_chtr_amt", "incmSubChtrAmt");
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("ioc_rule_desc", "iocRuleDesc");
		this.hashFields.put("incm_crs_chtr_amt", "incmCrsChtrAmt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("spc_otr_swap_flg", "spcOtrSwapFlg");
		this.hashFields.put("trd_cd", "trdCd");
		this.hashFields.put("rlane_cd", "rlaneCd");
		this.hashFields.put("expn_sub_chtr_amt", "expnSubChtrAmt");
		this.hashFields.put("n1st_port_etd_dt", "n1stPortEtdDt");
		this.hashFields.put("rev_port_cd", "revPortCd");
		this.hashFields.put("crr_cd", "crrCd");
		this.hashFields.put("free_add_wgt", "freeAddWgt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("co_bsa_bfr_sub_capa", "coBsaBfrSubCapa");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("expn_bzc_chtr_amt", "expnBzcChtrAmt");
		this.hashFields.put("free_add_teu_capa", "freeAddTeuCapa");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("n2nd_fnl_co_bsa_capa", "n2ndFnlCoBsaCapa");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("ioc_cd", "iocCd");
		this.hashFields.put("co_bsa_rto", "coBsaRto");
		this.hashFields.put("rev_port_etd_dt", "revPortEtdDt");
		this.hashFields.put("vop_cd", "vopCd");
		this.hashFields.put("co_bsa_capa", "coBsaCapa");
		this.hashFields.put("chtr_bsa_rto", "chtrBsaRto");
		this.hashFields.put("incm_bzc_chtr_amt", "incmBzcChtrAmt");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("jo_evnt_dt", "joEvntDt");
		this.hashFields.put("port_bsa_cfm_flg", "portBsaCfmFlg");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("vsl_capa", "vslCapa");
		this.hashFields.put("bsa_capa", "bsaCapa");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("expn_crs_chtr_amt", "expnCrsChtrAmt");
		this.hashFields.put("bsa_op_cd", "bsaOpCd");
		this.hashFields.put("fnl_co_bsa_capa", "fnlCoBsaCapa");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return incmSubChtrAmt
	 */
	public String getIncmSubChtrAmt() {
		return this.incmSubChtrAmt;
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
	 * @return iocRuleDesc
	 */
	public String getIocRuleDesc() {
		return this.iocRuleDesc;
	}
	
	/**
	 * Column Info
	 * @return incmCrsChtrAmt
	 */
	public String getIncmCrsChtrAmt() {
		return this.incmCrsChtrAmt;
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
	 * @return spcOtrSwapFlg
	 */
	public String getSpcOtrSwapFlg() {
		return this.spcOtrSwapFlg;
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
	 * @return expnSubChtrAmt
	 */
	public String getExpnSubChtrAmt() {
		return this.expnSubChtrAmt;
	}
	
	/**
	 * Column Info
	 * @return n1stPortEtdDt
	 */
	public String getN1stPortEtdDt() {
		return this.n1stPortEtdDt;
	}
	
	/**
	 * Column Info
	 * @return revPortCd
	 */
	public String getRevPortCd() {
		return this.revPortCd;
	}
	
	/**
	 * Column Info
	 * @return crrCd
	 */
	public String getCrrCd() {
		return this.crrCd;
	}
	
	/**
	 * Column Info
	 * @return freeAddWgt
	 */
	public String getFreeAddWgt() {
		return this.freeAddWgt;
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
	 * @return coBsaBfrSubCapa
	 */
	public String getCoBsaBfrSubCapa() {
		return this.coBsaBfrSubCapa;
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
	 * @return expnBzcChtrAmt
	 */
	public String getExpnBzcChtrAmt() {
		return this.expnBzcChtrAmt;
	}
	
	/**
	 * Column Info
	 * @return freeAddTeuCapa
	 */
	public String getFreeAddTeuCapa() {
		return this.freeAddTeuCapa;
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
	 * @return n2ndFnlCoBsaCapa
	 */
	public String getN2ndFnlCoBsaCapa() {
		return this.n2ndFnlCoBsaCapa;
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
	 * @return coBsaRto
	 */
	public String getCoBsaRto() {
		return this.coBsaRto;
	}
	
	/**
	 * Column Info
	 * @return revPortEtdDt
	 */
	public String getRevPortEtdDt() {
		return this.revPortEtdDt;
	}
	
	/**
	 * Column Info
	 * @return vopCd
	 */
	public String getVopCd() {
		return this.vopCd;
	}
	
	/**
	 * Column Info
	 * @return coBsaCapa
	 */
	public String getCoBsaCapa() {
		return this.coBsaCapa;
	}
	
	/**
	 * Column Info
	 * @return chtrBsaRto
	 */
	public String getChtrBsaRto() {
		return this.chtrBsaRto;
	}
	
	/**
	 * Column Info
	 * @return incmBzcChtrAmt
	 */
	public String getIncmBzcChtrAmt() {
		return this.incmBzcChtrAmt;
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
	 * @return joEvntDt
	 */
	public String getJoEvntDt() {
		return this.joEvntDt;
	}
	
	/**
	 * Column Info
	 * @return portBsaCfmFlg
	 */
	public String getPortBsaCfmFlg() {
		return this.portBsaCfmFlg;
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
	 * @return vslCapa
	 */
	public String getVslCapa() {
		return this.vslCapa;
	}
	
	/**
	 * Column Info
	 * @return bsaCapa
	 */
	public String getBsaCapa() {
		return this.bsaCapa;
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
	 * @return expnCrsChtrAmt
	 */
	public String getExpnCrsChtrAmt() {
		return this.expnCrsChtrAmt;
	}
	
	/**
	 * Column Info
	 * @return bsaOpCd
	 */
	public String getBsaOpCd() {
		return this.bsaOpCd;
	}
	
	/**
	 * Column Info
	 * @return fnlCoBsaCapa
	 */
	public String getFnlCoBsaCapa() {
		return this.fnlCoBsaCapa;
	}
	

	/**
	 * Column Info
	 * @param incmSubChtrAmt
	 */
	public void setIncmSubChtrAmt(String incmSubChtrAmt) {
		this.incmSubChtrAmt = incmSubChtrAmt;
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
	 * @param iocRuleDesc
	 */
	public void setIocRuleDesc(String iocRuleDesc) {
		this.iocRuleDesc = iocRuleDesc;
	}
	
	/**
	 * Column Info
	 * @param incmCrsChtrAmt
	 */
	public void setIncmCrsChtrAmt(String incmCrsChtrAmt) {
		this.incmCrsChtrAmt = incmCrsChtrAmt;
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
	 * @param spcOtrSwapFlg
	 */
	public void setSpcOtrSwapFlg(String spcOtrSwapFlg) {
		this.spcOtrSwapFlg = spcOtrSwapFlg;
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
	 * @param expnSubChtrAmt
	 */
	public void setExpnSubChtrAmt(String expnSubChtrAmt) {
		this.expnSubChtrAmt = expnSubChtrAmt;
	}
	
	/**
	 * Column Info
	 * @param n1stPortEtdDt
	 */
	public void setN1stPortEtdDt(String n1stPortEtdDt) {
		this.n1stPortEtdDt = n1stPortEtdDt;
	}
	
	/**
	 * Column Info
	 * @param revPortCd
	 */
	public void setRevPortCd(String revPortCd) {
		this.revPortCd = revPortCd;
	}
	
	/**
	 * Column Info
	 * @param crrCd
	 */
	public void setCrrCd(String crrCd) {
		this.crrCd = crrCd;
	}
	
	/**
	 * Column Info
	 * @param freeAddWgt
	 */
	public void setFreeAddWgt(String freeAddWgt) {
		this.freeAddWgt = freeAddWgt;
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
	 * @param coBsaBfrSubCapa
	 */
	public void setCoBsaBfrSubCapa(String coBsaBfrSubCapa) {
		this.coBsaBfrSubCapa = coBsaBfrSubCapa;
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
	 * @param expnBzcChtrAmt
	 */
	public void setExpnBzcChtrAmt(String expnBzcChtrAmt) {
		this.expnBzcChtrAmt = expnBzcChtrAmt;
	}
	
	/**
	 * Column Info
	 * @param freeAddTeuCapa
	 */
	public void setFreeAddTeuCapa(String freeAddTeuCapa) {
		this.freeAddTeuCapa = freeAddTeuCapa;
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
	 * @param n2ndFnlCoBsaCapa
	 */
	public void setN2ndFnlCoBsaCapa(String n2ndFnlCoBsaCapa) {
		this.n2ndFnlCoBsaCapa = n2ndFnlCoBsaCapa;
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
	 * @param coBsaRto
	 */
	public void setCoBsaRto(String coBsaRto) {
		this.coBsaRto = coBsaRto;
	}
	
	/**
	 * Column Info
	 * @param revPortEtdDt
	 */
	public void setRevPortEtdDt(String revPortEtdDt) {
		this.revPortEtdDt = revPortEtdDt;
	}
	
	/**
	 * Column Info
	 * @param vopCd
	 */
	public void setVopCd(String vopCd) {
		this.vopCd = vopCd;
	}
	
	/**
	 * Column Info
	 * @param coBsaCapa
	 */
	public void setCoBsaCapa(String coBsaCapa) {
		this.coBsaCapa = coBsaCapa;
	}
	
	/**
	 * Column Info
	 * @param chtrBsaRto
	 */
	public void setChtrBsaRto(String chtrBsaRto) {
		this.chtrBsaRto = chtrBsaRto;
	}
	
	/**
	 * Column Info
	 * @param incmBzcChtrAmt
	 */
	public void setIncmBzcChtrAmt(String incmBzcChtrAmt) {
		this.incmBzcChtrAmt = incmBzcChtrAmt;
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
	 * @param joEvntDt
	 */
	public void setJoEvntDt(String joEvntDt) {
		this.joEvntDt = joEvntDt;
	}
	
	/**
	 * Column Info
	 * @param portBsaCfmFlg
	 */
	public void setPortBsaCfmFlg(String portBsaCfmFlg) {
		this.portBsaCfmFlg = portBsaCfmFlg;
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
	 * @param vslCapa
	 */
	public void setVslCapa(String vslCapa) {
		this.vslCapa = vslCapa;
	}
	
	/**
	 * Column Info
	 * @param bsaCapa
	 */
	public void setBsaCapa(String bsaCapa) {
		this.bsaCapa = bsaCapa;
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
	 * @param expnCrsChtrAmt
	 */
	public void setExpnCrsChtrAmt(String expnCrsChtrAmt) {
		this.expnCrsChtrAmt = expnCrsChtrAmt;
	}
	
	/**
	 * Column Info
	 * @param bsaOpCd
	 */
	public void setBsaOpCd(String bsaOpCd) {
		this.bsaOpCd = bsaOpCd;
	}
	
	/**
	 * Column Info
	 * @param fnlCoBsaCapa
	 */
	public void setFnlCoBsaCapa(String fnlCoBsaCapa) {
		this.fnlCoBsaCapa = fnlCoBsaCapa;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setIncmSubChtrAmt(JSPUtil.getParameter(request, "incm_sub_chtr_amt", ""));
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setIocRuleDesc(JSPUtil.getParameter(request, "ioc_rule_desc", ""));
		setIncmCrsChtrAmt(JSPUtil.getParameter(request, "incm_crs_chtr_amt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setSpcOtrSwapFlg(JSPUtil.getParameter(request, "spc_otr_swap_flg", ""));
		setTrdCd(JSPUtil.getParameter(request, "trd_cd", ""));
		setRlaneCd(JSPUtil.getParameter(request, "rlane_cd", ""));
		setExpnSubChtrAmt(JSPUtil.getParameter(request, "expn_sub_chtr_amt", ""));
		setN1stPortEtdDt(JSPUtil.getParameter(request, "n1st_port_etd_dt", ""));
		setRevPortCd(JSPUtil.getParameter(request, "rev_port_cd", ""));
		setCrrCd(JSPUtil.getParameter(request, "crr_cd", ""));
		setFreeAddWgt(JSPUtil.getParameter(request, "free_add_wgt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setCoBsaBfrSubCapa(JSPUtil.getParameter(request, "co_bsa_bfr_sub_capa", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setExpnBzcChtrAmt(JSPUtil.getParameter(request, "expn_bzc_chtr_amt", ""));
		setFreeAddTeuCapa(JSPUtil.getParameter(request, "free_add_teu_capa", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setN2ndFnlCoBsaCapa(JSPUtil.getParameter(request, "n2nd_fnl_co_bsa_capa", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setIocCd(JSPUtil.getParameter(request, "ioc_cd", ""));
		setCoBsaRto(JSPUtil.getParameter(request, "co_bsa_rto", ""));
		setRevPortEtdDt(JSPUtil.getParameter(request, "rev_port_etd_dt", ""));
		setVopCd(JSPUtil.getParameter(request, "vop_cd", ""));
		setCoBsaCapa(JSPUtil.getParameter(request, "co_bsa_capa", ""));
		setChtrBsaRto(JSPUtil.getParameter(request, "chtr_bsa_rto", ""));
		setIncmBzcChtrAmt(JSPUtil.getParameter(request, "incm_bzc_chtr_amt", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, "skd_voy_no", ""));
		setJoEvntDt(JSPUtil.getParameter(request, "jo_evnt_dt", ""));
		setPortBsaCfmFlg(JSPUtil.getParameter(request, "port_bsa_cfm_flg", ""));
		setSkdDirCd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
		setVslCapa(JSPUtil.getParameter(request, "vsl_capa", ""));
		setBsaCapa(JSPUtil.getParameter(request, "bsa_capa", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setExpnCrsChtrAmt(JSPUtil.getParameter(request, "expn_crs_chtr_amt", ""));
		setBsaOpCd(JSPUtil.getParameter(request, "bsa_op_cd", ""));
		setFnlCoBsaCapa(JSPUtil.getParameter(request, "fnl_co_bsa_capa", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BsaVvdMstVO[]
	 */
	public BsaVvdMstVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BsaVvdMstVO[]
	 */
	public BsaVvdMstVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BsaVvdMstVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] incmSubChtrAmt = (JSPUtil.getParameter(request, prefix	+ "incm_sub_chtr_amt", length));
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] iocRuleDesc = (JSPUtil.getParameter(request, prefix	+ "ioc_rule_desc", length));
			String[] incmCrsChtrAmt = (JSPUtil.getParameter(request, prefix	+ "incm_crs_chtr_amt", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] spcOtrSwapFlg = (JSPUtil.getParameter(request, prefix	+ "spc_otr_swap_flg", length));
			String[] trdCd = (JSPUtil.getParameter(request, prefix	+ "trd_cd", length));
			String[] rlaneCd = (JSPUtil.getParameter(request, prefix	+ "rlane_cd", length));
			String[] expnSubChtrAmt = (JSPUtil.getParameter(request, prefix	+ "expn_sub_chtr_amt", length));
			String[] n1stPortEtdDt = (JSPUtil.getParameter(request, prefix	+ "n1st_port_etd_dt", length));
			String[] revPortCd = (JSPUtil.getParameter(request, prefix	+ "rev_port_cd", length));
			String[] crrCd = (JSPUtil.getParameter(request, prefix	+ "crr_cd", length));
			String[] freeAddWgt = (JSPUtil.getParameter(request, prefix	+ "free_add_wgt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] coBsaBfrSubCapa = (JSPUtil.getParameter(request, prefix	+ "co_bsa_bfr_sub_capa", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] expnBzcChtrAmt = (JSPUtil.getParameter(request, prefix	+ "expn_bzc_chtr_amt", length));
			String[] freeAddTeuCapa = (JSPUtil.getParameter(request, prefix	+ "free_add_teu_capa", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] n2ndFnlCoBsaCapa = (JSPUtil.getParameter(request, prefix	+ "n2nd_fnl_co_bsa_capa", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] iocCd = (JSPUtil.getParameter(request, prefix	+ "ioc_cd", length));
			String[] coBsaRto = (JSPUtil.getParameter(request, prefix	+ "co_bsa_rto", length));
			String[] revPortEtdDt = (JSPUtil.getParameter(request, prefix	+ "rev_port_etd_dt", length));
			String[] vopCd = (JSPUtil.getParameter(request, prefix	+ "vop_cd", length));
			String[] coBsaCapa = (JSPUtil.getParameter(request, prefix	+ "co_bsa_capa", length));
			String[] chtrBsaRto = (JSPUtil.getParameter(request, prefix	+ "chtr_bsa_rto", length));
			String[] incmBzcChtrAmt = (JSPUtil.getParameter(request, prefix	+ "incm_bzc_chtr_amt", length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no", length));
			String[] joEvntDt = (JSPUtil.getParameter(request, prefix	+ "jo_evnt_dt", length));
			String[] portBsaCfmFlg = (JSPUtil.getParameter(request, prefix	+ "port_bsa_cfm_flg", length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd", length));
			String[] vslCapa = (JSPUtil.getParameter(request, prefix	+ "vsl_capa", length));
			String[] bsaCapa = (JSPUtil.getParameter(request, prefix	+ "bsa_capa", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] expnCrsChtrAmt = (JSPUtil.getParameter(request, prefix	+ "expn_crs_chtr_amt", length));
			String[] bsaOpCd = (JSPUtil.getParameter(request, prefix	+ "bsa_op_cd", length));
			String[] fnlCoBsaCapa = (JSPUtil.getParameter(request, prefix	+ "fnl_co_bsa_capa", length));
			
			for (int i = 0; i < length; i++) {
				model = new BsaVvdMstVO();
				if (incmSubChtrAmt[i] != null)
					model.setIncmSubChtrAmt(incmSubChtrAmt[i]);
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (iocRuleDesc[i] != null)
					model.setIocRuleDesc(iocRuleDesc[i]);
				if (incmCrsChtrAmt[i] != null)
					model.setIncmCrsChtrAmt(incmCrsChtrAmt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (spcOtrSwapFlg[i] != null)
					model.setSpcOtrSwapFlg(spcOtrSwapFlg[i]);
				if (trdCd[i] != null)
					model.setTrdCd(trdCd[i]);
				if (rlaneCd[i] != null)
					model.setRlaneCd(rlaneCd[i]);
				if (expnSubChtrAmt[i] != null)
					model.setExpnSubChtrAmt(expnSubChtrAmt[i]);
				if (n1stPortEtdDt[i] != null)
					model.setN1stPortEtdDt(n1stPortEtdDt[i]);
				if (revPortCd[i] != null)
					model.setRevPortCd(revPortCd[i]);
				if (crrCd[i] != null)
					model.setCrrCd(crrCd[i]);
				if (freeAddWgt[i] != null)
					model.setFreeAddWgt(freeAddWgt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (coBsaBfrSubCapa[i] != null)
					model.setCoBsaBfrSubCapa(coBsaBfrSubCapa[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (expnBzcChtrAmt[i] != null)
					model.setExpnBzcChtrAmt(expnBzcChtrAmt[i]);
				if (freeAddTeuCapa[i] != null)
					model.setFreeAddTeuCapa(freeAddTeuCapa[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (n2ndFnlCoBsaCapa[i] != null)
					model.setN2ndFnlCoBsaCapa(n2ndFnlCoBsaCapa[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (iocCd[i] != null)
					model.setIocCd(iocCd[i]);
				if (coBsaRto[i] != null)
					model.setCoBsaRto(coBsaRto[i]);
				if (revPortEtdDt[i] != null)
					model.setRevPortEtdDt(revPortEtdDt[i]);
				if (vopCd[i] != null)
					model.setVopCd(vopCd[i]);
				if (coBsaCapa[i] != null)
					model.setCoBsaCapa(coBsaCapa[i]);
				if (chtrBsaRto[i] != null)
					model.setChtrBsaRto(chtrBsaRto[i]);
				if (incmBzcChtrAmt[i] != null)
					model.setIncmBzcChtrAmt(incmBzcChtrAmt[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (joEvntDt[i] != null)
					model.setJoEvntDt(joEvntDt[i]);
				if (portBsaCfmFlg[i] != null)
					model.setPortBsaCfmFlg(portBsaCfmFlg[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (vslCapa[i] != null)
					model.setVslCapa(vslCapa[i]);
				if (bsaCapa[i] != null)
					model.setBsaCapa(bsaCapa[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (expnCrsChtrAmt[i] != null)
					model.setExpnCrsChtrAmt(expnCrsChtrAmt[i]);
				if (bsaOpCd[i] != null)
					model.setBsaOpCd(bsaOpCd[i]);
				if (fnlCoBsaCapa[i] != null)
					model.setFnlCoBsaCapa(fnlCoBsaCapa[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBsaVvdMstVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BsaVvdMstVO[]
	 */
	public BsaVvdMstVO[] getBsaVvdMstVOs(){
		BsaVvdMstVO[] vos = (BsaVvdMstVO[])models.toArray(new BsaVvdMstVO[models.size()]);
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
		this.incmSubChtrAmt = this.incmSubChtrAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.iocRuleDesc = this.iocRuleDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.incmCrsChtrAmt = this.incmCrsChtrAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spcOtrSwapFlg = this.spcOtrSwapFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trdCd = this.trdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rlaneCd = this.rlaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.expnSubChtrAmt = this.expnSubChtrAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stPortEtdDt = this.n1stPortEtdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.revPortCd = this.revPortCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.crrCd = this.crrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.freeAddWgt = this.freeAddWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.coBsaBfrSubCapa = this.coBsaBfrSubCapa .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.expnBzcChtrAmt = this.expnBzcChtrAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.freeAddTeuCapa = this.freeAddTeuCapa .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndFnlCoBsaCapa = this.n2ndFnlCoBsaCapa .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.iocCd = this.iocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.coBsaRto = this.coBsaRto .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.revPortEtdDt = this.revPortEtdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vopCd = this.vopCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.coBsaCapa = this.coBsaCapa .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chtrBsaRto = this.chtrBsaRto .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.incmBzcChtrAmt = this.incmBzcChtrAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.joEvntDt = this.joEvntDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.portBsaCfmFlg = this.portBsaCfmFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslCapa = this.vslCapa .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bsaCapa = this.bsaCapa .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.expnCrsChtrAmt = this.expnCrsChtrAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bsaOpCd = this.bsaOpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fnlCoBsaCapa = this.fnlCoBsaCapa .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
