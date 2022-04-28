/*=========================================================
 *Copyright(c) 2009 CyberLogitec
 *@FileName : ScePlnSoListVO.java
 *@FileTitle : ScePlnSoListVO
 *Open Issues :
 *Change history :
 *@LastModifyDate : 2009.09.30
 *@LastModifier : 김인수
 *@LastVersion : 1.0
 * 2009.09.30 김인수 
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
 * @author 김인수
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class ScePlnSoListVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;

	private Collection<ScePlnSoListVO> models = new ArrayList<ScePlnSoListVO>();

	/* Column Info */
	private String dorArrDt = null;
	/* Column Info */
	private String pctlCostModCd = null;
	/* Column Info */
	private String copNo = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String trspModCd = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String n1stVndrSeq = null;
	/* Column Info */
	private String trnsRqstOfcCd = null;
	/* Column Info */
	private String trspSoStsCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String pctlIoBndCd = null;
	/* Column Info */
	private String custCntCd = null;
	/* Column Info */
	private String trnsRqstUsrId = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String n2ndNodCd = null;
	/* Column Info */
	private String invBilPattDivFlg = null;
	/* Column Info */
	private String lstNodPlnDt = null;
	/* Column Info */
	private String deltDt = null;
	/* Column Info */
	private String ctrlOfcCd = null;
	/* Column Info */
	private String custSeq = null;
	/* Column Info */
	private String inlndRoutInvBilPattCd = null;
	/* Column Info */
	private String costActGrpCd = null;
	/* Column Info */
	private String trnsRqstRsn = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String n4thNodCd = null;
	/* Column Info */
	private String n1stNodCd = null;
	/* Column Info */
	private String costActGrpSeq = null;
	/* Column Info */
	private String n1stNodPlnDt = null;
	/* Column Info */
	private String deltUsrId = null;
	/* Column Info */
	private String n3rdNodCd = null;
	/* Column Info */
	private String rvisIndFlg = null;

	/* 테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/* 테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();

	public ScePlnSoListVO() {
	}

	public ScePlnSoListVO(String ibflag, String pagerows, String copNo, String costActGrpSeq, String costActGrpCd, String ctrlOfcCd, String n1stNodPlnDt, String n1stNodCd, String n2ndNodCd, String n3rdNodCd, String n4thNodCd, String pctlIoBndCd, String pctlCostModCd, String custCntCd,
			String custSeq, String n1stVndrSeq, String trspSoStsCd, String trnsRqstOfcCd, String trnsRqstUsrId, String trnsRqstRsn, String trspModCd, String inlndRoutInvBilPattCd, String invBilPattDivFlg, String creUsrId, String creDt, String updUsrId, String updDt, String deltUsrId, String deltDt,
			String dorArrDt, String lstNodPlnDt, String rvisIndFlg) {
		this.dorArrDt = dorArrDt;
		this.pctlCostModCd = pctlCostModCd;
		this.copNo = copNo;
		this.creDt = creDt;
		this.trspModCd = trspModCd;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.n1stVndrSeq = n1stVndrSeq;
		this.trnsRqstOfcCd = trnsRqstOfcCd;
		this.trspSoStsCd = trspSoStsCd;
		this.updUsrId = updUsrId;
		this.pctlIoBndCd = pctlIoBndCd;
		this.custCntCd = custCntCd;
		this.trnsRqstUsrId = trnsRqstUsrId;
		this.updDt = updDt;
		this.n2ndNodCd = n2ndNodCd;
		this.invBilPattDivFlg = invBilPattDivFlg;
		this.lstNodPlnDt = lstNodPlnDt;
		this.deltDt = deltDt;
		this.ctrlOfcCd = ctrlOfcCd;
		this.custSeq = custSeq;
		this.inlndRoutInvBilPattCd = inlndRoutInvBilPattCd;
		this.costActGrpCd = costActGrpCd;
		this.trnsRqstRsn = trnsRqstRsn;
		this.creUsrId = creUsrId;
		this.n4thNodCd = n4thNodCd;
		this.n1stNodCd = n1stNodCd;
		this.costActGrpSeq = costActGrpSeq;
		this.n1stNodPlnDt = n1stNodPlnDt;
		this.deltUsrId = deltUsrId;
		this.n3rdNodCd = n3rdNodCd;
		this.rvisIndFlg = rvisIndFlg;
	}

	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * 
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues() {
		this.hashColumns.put("dor_arr_dt", getDorArrDt());
		this.hashColumns.put("pctl_cost_mod_cd", getPctlCostModCd());
		this.hashColumns.put("cop_no", getCopNo());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("trsp_mod_cd", getTrspModCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("n1st_vndr_seq", getN1stVndrSeq());
		this.hashColumns.put("trns_rqst_ofc_cd", getTrnsRqstOfcCd());
		this.hashColumns.put("trsp_so_sts_cd", getTrspSoStsCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("pctl_io_bnd_cd", getPctlIoBndCd());
		this.hashColumns.put("cust_cnt_cd", getCustCntCd());
		this.hashColumns.put("trns_rqst_usr_id", getTrnsRqstUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("n2nd_nod_cd", getN2ndNodCd());
		this.hashColumns.put("inv_bil_patt_div_flg", getInvBilPattDivFlg());
		this.hashColumns.put("lst_nod_pln_dt", getLstNodPlnDt());
		this.hashColumns.put("delt_dt", getDeltDt());
		this.hashColumns.put("ctrl_ofc_cd", getCtrlOfcCd());
		this.hashColumns.put("cust_seq", getCustSeq());
		this.hashColumns.put("inlnd_rout_inv_bil_patt_cd", getInlndRoutInvBilPattCd());
		this.hashColumns.put("cost_act_grp_cd", getCostActGrpCd());
		this.hashColumns.put("trns_rqst_rsn", getTrnsRqstRsn());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("n4th_nod_cd", getN4thNodCd());
		this.hashColumns.put("n1st_nod_cd", getN1stNodCd());
		this.hashColumns.put("cost_act_grp_seq", getCostActGrpSeq());
		this.hashColumns.put("n1st_nod_pln_dt", getN1stNodPlnDt());
		this.hashColumns.put("delt_usr_id", getDeltUsrId());
		this.hashColumns.put("n3rd_nod_cd", getN3rdNodCd());
		this.hashColumns.put("rvis_ind_flg", getRvisIndFlg());
		return this.hashColumns;
	}

	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환
	 * 
	 * @return
	 */
	public HashMap<String, String> getFieldNames() {
		this.hashFields.put("dor_arr_dt", "dorArrDt");
		this.hashFields.put("pctl_cost_mod_cd", "pctlCostModCd");
		this.hashFields.put("cop_no", "copNo");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("trsp_mod_cd", "trspModCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("n1st_vndr_seq", "n1stVndrSeq");
		this.hashFields.put("trns_rqst_ofc_cd", "trnsRqstOfcCd");
		this.hashFields.put("trsp_so_sts_cd", "trspSoStsCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("pctl_io_bnd_cd", "pctlIoBndCd");
		this.hashFields.put("cust_cnt_cd", "custCntCd");
		this.hashFields.put("trns_rqst_usr_id", "trnsRqstUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("n2nd_nod_cd", "n2ndNodCd");
		this.hashFields.put("inv_bil_patt_div_flg", "invBilPattDivFlg");
		this.hashFields.put("lst_nod_pln_dt", "lstNodPlnDt");
		this.hashFields.put("delt_dt", "deltDt");
		this.hashFields.put("ctrl_ofc_cd", "ctrlOfcCd");
		this.hashFields.put("cust_seq", "custSeq");
		this.hashFields.put("inlnd_rout_inv_bil_patt_cd", "inlndRoutInvBilPattCd");
		this.hashFields.put("cost_act_grp_cd", "costActGrpCd");
		this.hashFields.put("trns_rqst_rsn", "trnsRqstRsn");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("n4th_nod_cd", "n4thNodCd");
		this.hashFields.put("n1st_nod_cd", "n1stNodCd");
		this.hashFields.put("cost_act_grp_seq", "costActGrpSeq");
		this.hashFields.put("n1st_nod_pln_dt", "n1stNodPlnDt");
		this.hashFields.put("delt_usr_id", "deltUsrId");
		this.hashFields.put("n3rd_nod_cd", "n3rdNodCd");
		this.hashFields.put("rvis_ind_flg", "rvisIndFlg");
		return this.hashFields;
	}

	/**
	 * Column Info
	 * 
	 * @return dorArrDt
	 */
	public String getDorArrDt() {
		return this.dorArrDt;
	}

	/**
	 * Column Info
	 * 
	 * @return pctlCostModCd
	 */
	public String getPctlCostModCd() {
		return this.pctlCostModCd;
	}

	/**
	 * Column Info
	 * 
	 * @return copNo
	 */
	public String getCopNo() {
		return this.copNo;
	}

	/**
	 * Column Info
	 * 
	 * @return creDt
	 */
	public String getCreDt() {
		return this.creDt;
	}

	/**
	 * Column Info
	 * 
	 * @return trspModCd
	 */
	public String getTrspModCd() {
		return this.trspModCd;
	}

	/**
	 * Page Number
	 * 
	 * @return pagerows
	 */
	public String getPagerows() {
		return this.pagerows;
	}

	/**
	 * VO Data Value( C:Creation, U:Update, D:Delete )
	 * 
	 * @return ibflag
	 */
	public String getIbflag() {
		return this.ibflag;
	}

	/**
	 * Column Info
	 * 
	 * @return n1stVndrSeq
	 */
	public String getN1stVndrSeq() {
		return this.n1stVndrSeq;
	}

	/**
	 * Column Info
	 * 
	 * @return trnsRqstOfcCd
	 */
	public String getTrnsRqstOfcCd() {
		return this.trnsRqstOfcCd;
	}

	/**
	 * Column Info
	 * 
	 * @return trspSoStsCd
	 */
	public String getTrspSoStsCd() {
		return this.trspSoStsCd;
	}

	/**
	 * Column Info
	 * 
	 * @return updUsrId
	 */
	public String getUpdUsrId() {
		return this.updUsrId;
	}

	/**
	 * Column Info
	 * 
	 * @return pctlIoBndCd
	 */
	public String getPctlIoBndCd() {
		return this.pctlIoBndCd;
	}

	/**
	 * Column Info
	 * 
	 * @return custCntCd
	 */
	public String getCustCntCd() {
		return this.custCntCd;
	}

	/**
	 * Column Info
	 * 
	 * @return trnsRqstUsrId
	 */
	public String getTrnsRqstUsrId() {
		return this.trnsRqstUsrId;
	}

	/**
	 * Column Info
	 * 
	 * @return updDt
	 */
	public String getUpdDt() {
		return this.updDt;
	}

	/**
	 * Column Info
	 * 
	 * @return n2ndNodCd
	 */
	public String getN2ndNodCd() {
		return this.n2ndNodCd;
	}

	/**
	 * Column Info
	 * 
	 * @return invBilPattDivFlg
	 */
	public String getInvBilPattDivFlg() {
		return this.invBilPattDivFlg;
	}

	/**
	 * Column Info
	 * 
	 * @return lstNodPlnDt
	 */
	public String getLstNodPlnDt() {
		return this.lstNodPlnDt;
	}

	/**
	 * Column Info
	 * 
	 * @return deltDt
	 */
	public String getDeltDt() {
		return this.deltDt;
	}

	/**
	 * Column Info
	 * 
	 * @return ctrlOfcCd
	 */
	public String getCtrlOfcCd() {
		return this.ctrlOfcCd;
	}

	/**
	 * Column Info
	 * 
	 * @return custSeq
	 */
	public String getCustSeq() {
		return this.custSeq;
	}

	/**
	 * Column Info
	 * 
	 * @return inlndRoutInvBilPattCd
	 */
	public String getInlndRoutInvBilPattCd() {
		return this.inlndRoutInvBilPattCd;
	}

	/**
	 * Column Info
	 * 
	 * @return costActGrpCd
	 */
	public String getCostActGrpCd() {
		return this.costActGrpCd;
	}

	/**
	 * Column Info
	 * 
	 * @return trnsRqstRsn
	 */
	public String getTrnsRqstRsn() {
		return this.trnsRqstRsn;
	}

	/**
	 * Column Info
	 * 
	 * @return creUsrId
	 */
	public String getCreUsrId() {
		return this.creUsrId;
	}

	/**
	 * Column Info
	 * 
	 * @return n4thNodCd
	 */
	public String getN4thNodCd() {
		return this.n4thNodCd;
	}

	/**
	 * Column Info
	 * 
	 * @return n1stNodCd
	 */
	public String getN1stNodCd() {
		return this.n1stNodCd;
	}

	/**
	 * Column Info
	 * 
	 * @return costActGrpSeq
	 */
	public String getCostActGrpSeq() {
		return this.costActGrpSeq;
	}

	/**
	 * Column Info
	 * 
	 * @return n1stNodPlnDt
	 */
	public String getN1stNodPlnDt() {
		return this.n1stNodPlnDt;
	}

	/**
	 * Column Info
	 * 
	 * @return deltUsrId
	 */
	public String getDeltUsrId() {
		return this.deltUsrId;
	}

	/**
	 * Column Info
	 * 
	 * @return n3rdNodCd
	 */
	public String getN3rdNodCd() {
		return this.n3rdNodCd;
	}

	/**
	 * Column Info
	 * 
	 * @param dorArrDt
	 */
	public void setDorArrDt(String dorArrDt) {
		this.dorArrDt = dorArrDt;
	}

	/**
	 * Column Info
	 * 
	 * @param pctlCostModCd
	 */
	public void setPctlCostModCd(String pctlCostModCd) {
		this.pctlCostModCd = pctlCostModCd;
	}

	/**
	 * Column Info
	 * 
	 * @param copNo
	 */
	public void setCopNo(String copNo) {
		this.copNo = copNo;
	}

	/**
	 * Column Info
	 * 
	 * @param creDt
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
	}

	/**
	 * Column Info
	 * 
	 * @param trspModCd
	 */
	public void setTrspModCd(String trspModCd) {
		this.trspModCd = trspModCd;
	}

	/**
	 * Page Number
	 * 
	 * @param pagerows
	 */
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
	}

	/**
	 * VO Data Value( C:Creation, U:Update, D:Delete )
	 * 
	 * @param ibflag
	 */
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
	}

	/**
	 * Column Info
	 * 
	 * @param n1stVndrSeq
	 */
	public void setN1stVndrSeq(String n1stVndrSeq) {
		this.n1stVndrSeq = n1stVndrSeq;
	}

	/**
	 * Column Info
	 * 
	 * @param trnsRqstOfcCd
	 */
	public void setTrnsRqstOfcCd(String trnsRqstOfcCd) {
		this.trnsRqstOfcCd = trnsRqstOfcCd;
	}

	/**
	 * Column Info
	 * 
	 * @param trspSoStsCd
	 */
	public void setTrspSoStsCd(String trspSoStsCd) {
		this.trspSoStsCd = trspSoStsCd;
	}

	/**
	 * Column Info
	 * 
	 * @param updUsrId
	 */
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
	}

	/**
	 * Column Info
	 * 
	 * @param pctlIoBndCd
	 */
	public void setPctlIoBndCd(String pctlIoBndCd) {
		this.pctlIoBndCd = pctlIoBndCd;
	}

	/**
	 * Column Info
	 * 
	 * @param custCntCd
	 */
	public void setCustCntCd(String custCntCd) {
		this.custCntCd = custCntCd;
	}

	/**
	 * Column Info
	 * 
	 * @param trnsRqstUsrId
	 */
	public void setTrnsRqstUsrId(String trnsRqstUsrId) {
		this.trnsRqstUsrId = trnsRqstUsrId;
	}

	/**
	 * Column Info
	 * 
	 * @param updDt
	 */
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
	}

	/**
	 * Column Info
	 * 
	 * @param n2ndNodCd
	 */
	public void setN2ndNodCd(String n2ndNodCd) {
		this.n2ndNodCd = n2ndNodCd;
	}

	/**
	 * Column Info
	 * 
	 * @param invBilPattDivFlg
	 */
	public void setInvBilPattDivFlg(String invBilPattDivFlg) {
		this.invBilPattDivFlg = invBilPattDivFlg;
	}

	/**
	 * Column Info
	 * 
	 * @param lstNodPlnDt
	 */
	public void setLstNodPlnDt(String lstNodPlnDt) {
		this.lstNodPlnDt = lstNodPlnDt;
	}

	/**
	 * Column Info
	 * 
	 * @param deltDt
	 */
	public void setDeltDt(String deltDt) {
		this.deltDt = deltDt;
	}

	/**
	 * Column Info
	 * 
	 * @param ctrlOfcCd
	 */
	public void setCtrlOfcCd(String ctrlOfcCd) {
		this.ctrlOfcCd = ctrlOfcCd;
	}

	/**
	 * Column Info
	 * 
	 * @param custSeq
	 */
	public void setCustSeq(String custSeq) {
		this.custSeq = custSeq;
	}

	/**
	 * Column Info
	 * 
	 * @param inlndRoutInvBilPattCd
	 */
	public void setInlndRoutInvBilPattCd(String inlndRoutInvBilPattCd) {
		this.inlndRoutInvBilPattCd = inlndRoutInvBilPattCd;
	}

	/**
	 * Column Info
	 * 
	 * @param costActGrpCd
	 */
	public void setCostActGrpCd(String costActGrpCd) {
		this.costActGrpCd = costActGrpCd;
	}

	/**
	 * Column Info
	 * 
	 * @param trnsRqstRsn
	 */
	public void setTrnsRqstRsn(String trnsRqstRsn) {
		this.trnsRqstRsn = trnsRqstRsn;
	}

	/**
	 * Column Info
	 * 
	 * @param creUsrId
	 */
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
	}

	/**
	 * Column Info
	 * 
	 * @param n4thNodCd
	 */
	public void setN4thNodCd(String n4thNodCd) {
		this.n4thNodCd = n4thNodCd;
	}

	/**
	 * Column Info
	 * 
	 * @param n1stNodCd
	 */
	public void setN1stNodCd(String n1stNodCd) {
		this.n1stNodCd = n1stNodCd;
	}

	/**
	 * Column Info
	 * 
	 * @param costActGrpSeq
	 */
	public void setCostActGrpSeq(String costActGrpSeq) {
		this.costActGrpSeq = costActGrpSeq;
	}

	/**
	 * Column Info
	 * 
	 * @param n1stNodPlnDt
	 */
	public void setN1stNodPlnDt(String n1stNodPlnDt) {
		this.n1stNodPlnDt = n1stNodPlnDt;
	}

	/**
	 * Column Info
	 * 
	 * @param deltUsrId
	 */
	public void setDeltUsrId(String deltUsrId) {
		this.deltUsrId = deltUsrId;
	}

	/**
	 * Column Info
	 * 
	 * @param n3rdNodCd
	 */
	public void setN3rdNodCd(String n3rdNodCd) {
		this.n3rdNodCd = n3rdNodCd;
	}

	/**
	 * 
	 * @return
	 */
	public String getRvisIndFlg() {
		return rvisIndFlg;
	}

	/**
	 * 
	 * @param rvisIndFlg
	 */
	public void setRvisIndFlg(String rvisIndFlg) {
		this.rvisIndFlg = rvisIndFlg;
	}

	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * 
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setDorArrDt(JSPUtil.getParameter(request, "dor_arr_dt", ""));
		setPctlCostModCd(JSPUtil.getParameter(request, "pctl_cost_mod_cd", ""));
		setCopNo(JSPUtil.getParameter(request, "cop_no", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setTrspModCd(JSPUtil.getParameter(request, "trsp_mod_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setN1stVndrSeq(JSPUtil.getParameter(request, "n1st_vndr_seq", ""));
		setTrnsRqstOfcCd(JSPUtil.getParameter(request, "trns_rqst_ofc_cd", ""));
		setTrspSoStsCd(JSPUtil.getParameter(request, "trsp_so_sts_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setPctlIoBndCd(JSPUtil.getParameter(request, "pctl_io_bnd_cd", ""));
		setCustCntCd(JSPUtil.getParameter(request, "cust_cnt_cd", ""));
		setTrnsRqstUsrId(JSPUtil.getParameter(request, "trns_rqst_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setN2ndNodCd(JSPUtil.getParameter(request, "n2nd_nod_cd", ""));
		setInvBilPattDivFlg(JSPUtil.getParameter(request, "inv_bil_patt_div_flg", ""));
		setLstNodPlnDt(JSPUtil.getParameter(request, "lst_nod_pln_dt", ""));
		setDeltDt(JSPUtil.getParameter(request, "delt_dt", ""));
		setCtrlOfcCd(JSPUtil.getParameter(request, "ctrl_ofc_cd", ""));
		setCustSeq(JSPUtil.getParameter(request, "cust_seq", ""));
		setInlndRoutInvBilPattCd(JSPUtil.getParameter(request, "inlnd_rout_inv_bil_patt_cd", ""));
		setCostActGrpCd(JSPUtil.getParameter(request, "cost_act_grp_cd", ""));
		setTrnsRqstRsn(JSPUtil.getParameter(request, "trns_rqst_rsn", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setN4thNodCd(JSPUtil.getParameter(request, "n4th_nod_cd", ""));
		setN1stNodCd(JSPUtil.getParameter(request, "n1st_nod_cd", ""));
		setCostActGrpSeq(JSPUtil.getParameter(request, "cost_act_grp_seq", ""));
		setN1stNodPlnDt(JSPUtil.getParameter(request, "n1st_nod_pln_dt", ""));
		setDeltUsrId(JSPUtil.getParameter(request, "delt_usr_id", ""));
		setN3rdNodCd(JSPUtil.getParameter(request, "n3rd_nod_cd", ""));
		setRvisIndFlg(JSPUtil.getParameter(request, "rvis_ind_flg", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * 
	 * @param request
	 * @return ScePlnSoListVO[]
	 */
	public ScePlnSoListVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다.
	 * 
	 * @param request
	 * @param prefix
	 * @return ScePlnSoListVO[]
	 */
	public ScePlnSoListVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		ScePlnSoListVO model = null;

		String[] tmp = request.getParameterValues(prefix + "ibflag");
		if (tmp == null)
			return null;

		int length = request.getParameterValues(prefix + "ibflag").length;

		try {
			String[] dorArrDt = (JSPUtil.getParameter(request, prefix + "dor_arr_dt", length));
			String[] pctlCostModCd = (JSPUtil.getParameter(request, prefix + "pctl_cost_mod_cd", length));
			String[] copNo = (JSPUtil.getParameter(request, prefix + "cop_no", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix + "cre_dt", length));
			String[] trspModCd = (JSPUtil.getParameter(request, prefix + "trsp_mod_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix + "pagerows", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix + "ibflag", length));
			String[] n1stVndrSeq = (JSPUtil.getParameter(request, prefix + "n1st_vndr_seq", length));
			String[] trnsRqstOfcCd = (JSPUtil.getParameter(request, prefix + "trns_rqst_ofc_cd", length));
			String[] trspSoStsCd = (JSPUtil.getParameter(request, prefix + "trsp_so_sts_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix + "upd_usr_id", length));
			String[] pctlIoBndCd = (JSPUtil.getParameter(request, prefix + "pctl_io_bnd_cd", length));
			String[] custCntCd = (JSPUtil.getParameter(request, prefix + "cust_cnt_cd", length));
			String[] trnsRqstUsrId = (JSPUtil.getParameter(request, prefix + "trns_rqst_usr_id", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix + "upd_dt", length));
			String[] n2ndNodCd = (JSPUtil.getParameter(request, prefix + "n2nd_nod_cd", length));
			String[] invBilPattDivFlg = (JSPUtil.getParameter(request, prefix + "inv_bil_patt_div_flg", length));
			String[] lstNodPlnDt = (JSPUtil.getParameter(request, prefix + "lst_nod_pln_dt", length));
			String[] deltDt = (JSPUtil.getParameter(request, prefix + "delt_dt", length));
			String[] ctrlOfcCd = (JSPUtil.getParameter(request, prefix + "ctrl_ofc_cd", length));
			String[] custSeq = (JSPUtil.getParameter(request, prefix + "cust_seq", length));
			String[] inlndRoutInvBilPattCd = (JSPUtil.getParameter(request, prefix + "inlnd_rout_inv_bil_patt_cd", length));
			String[] costActGrpCd = (JSPUtil.getParameter(request, prefix + "cost_act_grp_cd", length));
			String[] trnsRqstRsn = (JSPUtil.getParameter(request, prefix + "trns_rqst_rsn", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix + "cre_usr_id", length));
			String[] n4thNodCd = (JSPUtil.getParameter(request, prefix + "n4th_nod_cd", length));
			String[] n1stNodCd = (JSPUtil.getParameter(request, prefix + "n1st_nod_cd", length));
			String[] costActGrpSeq = (JSPUtil.getParameter(request, prefix + "cost_act_grp_seq", length));
			String[] n1stNodPlnDt = (JSPUtil.getParameter(request, prefix + "n1st_nod_pln_dt", length));
			String[] deltUsrId = (JSPUtil.getParameter(request, prefix + "delt_usr_id", length));
			String[] n3rdNodCd = (JSPUtil.getParameter(request, prefix + "n3rd_nod_cd", length));
			String[] rvisIndFlg = (JSPUtil.getParameter(request, prefix + "rvis_ind_flg", length));

			for (int i = 0; i < length; i++) {
				model = new ScePlnSoListVO();
				if (dorArrDt[i] != null)
					model.setDorArrDt(dorArrDt[i]);
				if (pctlCostModCd[i] != null)
					model.setPctlCostModCd(pctlCostModCd[i]);
				if (copNo[i] != null)
					model.setCopNo(copNo[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (trspModCd[i] != null)
					model.setTrspModCd(trspModCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (n1stVndrSeq[i] != null)
					model.setN1stVndrSeq(n1stVndrSeq[i]);
				if (trnsRqstOfcCd[i] != null)
					model.setTrnsRqstOfcCd(trnsRqstOfcCd[i]);
				if (trspSoStsCd[i] != null)
					model.setTrspSoStsCd(trspSoStsCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (pctlIoBndCd[i] != null)
					model.setPctlIoBndCd(pctlIoBndCd[i]);
				if (custCntCd[i] != null)
					model.setCustCntCd(custCntCd[i]);
				if (trnsRqstUsrId[i] != null)
					model.setTrnsRqstUsrId(trnsRqstUsrId[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (n2ndNodCd[i] != null)
					model.setN2ndNodCd(n2ndNodCd[i]);
				if (invBilPattDivFlg[i] != null)
					model.setInvBilPattDivFlg(invBilPattDivFlg[i]);
				if (lstNodPlnDt[i] != null)
					model.setLstNodPlnDt(lstNodPlnDt[i]);
				if (deltDt[i] != null)
					model.setDeltDt(deltDt[i]);
				if (ctrlOfcCd[i] != null)
					model.setCtrlOfcCd(ctrlOfcCd[i]);
				if (custSeq[i] != null)
					model.setCustSeq(custSeq[i]);
				if (inlndRoutInvBilPattCd[i] != null)
					model.setInlndRoutInvBilPattCd(inlndRoutInvBilPattCd[i]);
				if (costActGrpCd[i] != null)
					model.setCostActGrpCd(costActGrpCd[i]);
				if (trnsRqstRsn[i] != null)
					model.setTrnsRqstRsn(trnsRqstRsn[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (n4thNodCd[i] != null)
					model.setN4thNodCd(n4thNodCd[i]);
				if (n1stNodCd[i] != null)
					model.setN1stNodCd(n1stNodCd[i]);
				if (costActGrpSeq[i] != null)
					model.setCostActGrpSeq(costActGrpSeq[i]);
				if (n1stNodPlnDt[i] != null)
					model.setN1stNodPlnDt(n1stNodPlnDt[i]);
				if (deltUsrId[i] != null)
					model.setDeltUsrId(deltUsrId[i]);
				if (n3rdNodCd[i] != null)
					model.setN3rdNodCd(n3rdNodCd[i]);
				if (rvisIndFlg[i] != null)
					model.setRvisIndFlg(rvisIndFlg[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getScePlnSoListVOs();
	}

	/**
	 * VO 배열을 반환
	 * 
	 * @return ScePlnSoListVO[]
	 */
	public ScePlnSoListVO[] getScePlnSoListVOs() {
		ScePlnSoListVO[] vos = (ScePlnSoListVO[]) models.toArray(new ScePlnSoListVO[models.size()]);
		return vos;
	}

	/**
	 * VO Class의 내용을 String으로 변환
	 */
	public String toString() {
		StringBuffer ret = new StringBuffer();
		Field[] field = this.getClass().getDeclaredFields();
		String space = "";
		try {
			for (int i = 0; i < field.length; i++) {
				String[] arr = null;
				arr = getField(field, i);
				if (arr != null) {
					for (int j = 0; j < arr.length; j++) {
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
	 * 
	 * @param field
	 * @param i
	 * @return String[]
	 */
	private String[] getField(Field[] field, int i) {
		String[] arr = null;
		try {
			arr = (String[]) field[i].get(this);
		} catch (Exception ex) {
			arr = null;
		}
		return arr;
	}

	/**
	 * 포맷팅된 문자열에서 특수문자 제거("-","/",",",":")
	 */
	public void unDataFormat() {
		this.dorArrDt = this.dorArrDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pctlCostModCd = this.pctlCostModCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.copNo = this.copNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspModCd = this.trspModCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stVndrSeq = this.n1stVndrSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trnsRqstOfcCd = this.trnsRqstOfcCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspSoStsCd = this.trspSoStsCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pctlIoBndCd = this.pctlIoBndCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custCntCd = this.custCntCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trnsRqstUsrId = this.trnsRqstUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndNodCd = this.n2ndNodCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invBilPattDivFlg = this.invBilPattDivFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lstNodPlnDt = this.lstNodPlnDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltDt = this.deltDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ctrlOfcCd = this.ctrlOfcCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custSeq = this.custSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.inlndRoutInvBilPattCd = this.inlndRoutInvBilPattCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costActGrpCd = this.costActGrpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trnsRqstRsn = this.trnsRqstRsn.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n4thNodCd = this.n4thNodCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stNodCd = this.n1stNodCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costActGrpSeq = this.costActGrpSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stNodPlnDt = this.n1stNodPlnDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltUsrId = this.deltUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdNodCd = this.n3rdNodCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rvisIndFlg = this.rvisIndFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
