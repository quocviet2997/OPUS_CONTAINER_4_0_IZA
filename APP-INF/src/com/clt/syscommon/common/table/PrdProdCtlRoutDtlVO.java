/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : PrdProdCtlRoutDtlVO.java
*@FileTitle : PrdProdCtlRoutDtlVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.29
*@LastModifier : 정선용
*@LastVersion : 1.0
* 2009.07.29 정선용 
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
 * @author 정선용
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class PrdProdCtlRoutDtlVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<PrdProdCtlRoutDtlVO> models = new ArrayList<PrdProdCtlRoutDtlVO>();
	
	/* Column Info */
	private String genAvalSpc = null;
	/* Column Info */
	private String mtyYdFlg = null;
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String railCrrTpCd = null;
	/* Column Info */
	private String destClptIndSeq = null;
	/* Column Info */
	private String orgClptIndSeq = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String pctlSeq = null;
	/* Column Info */
	private String trspAgmtOfcCtyCd = null;
	/* Column Info */
	private String routOrgNodCd = null;
	/* Column Info */
	private String pctlWtrDivCd = null;
	/* Column Info */
	private String depFshDt = null;
	/* Column Info */
	private String vslSlanCd = null;
	/* Column Info */
	private String trspModCd = null;
	/* Column Info */
	private String crrCd = null;
	/* Column Info */
	private String pctlNo = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String tzDwllTmHrs = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String inlndRoutInclSttlFlg = null;
	/* Column Info */
	private String n1stVndrSeq = null;
	/* Column Info */
	private String destNodCd = null;
	/* Column Info */
	private String routDestNodCd = null;
	/* Column Info */
	private String inlndRoutCmbFlg = null;
	/* Column Info */
	private String orgNodTpCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String pctlIoBndCd = null;
	/* Column Info */
	private String n3rdVndrSeq = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String agmtRefNo = null;
	/* Column Info */
	private String n2ndVndrSeq = null;
	/* Column Info */
	private String cnstFlg = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String nodLnkDivCd = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Column Info */
	private String routSeq = null;
	/* Column Info */
	private String inlndRoutInvBilPattCd = null;
	/* Column Info */
	private String destNodTpCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String d7AvalSpc = null;
	/* Column Info */
	private String trspAgmtSeq = null;
	/* Column Info */
	private String orgNodCd = null;
	/* Column Info */
	private String arrStDt = null;
	/* Column Info */
	private String rfAvalSpc = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public PrdProdCtlRoutDtlVO() {}

	public PrdProdCtlRoutDtlVO(String ibflag, String pagerows, String pctlNo, String pctlSeq, String orgNodCd, String destNodCd, String nodLnkDivCd, String pctlIoBndCd, String trspModCd, String pctlWtrDivCd, String orgNodTpCd, String destNodTpCd, String mtyYdFlg, String arrStDt, String depFshDt, String tzDwllTmHrs, String n1stVndrSeq, String n2ndVndrSeq, String n3rdVndrSeq, String vslSlanCd, String crrCd, String vslCd, String skdVoyNo, String skdDirCd, String genAvalSpc, String d7AvalSpc, String rfAvalSpc, String inlndRoutInvBilPattCd, String inlndRoutCmbFlg, String routOrgNodCd, String routDestNodCd, String routSeq, String cnstFlg, String orgClptIndSeq, String destClptIndSeq, String railCrrTpCd, String inlndRoutInclSttlFlg, String trspAgmtOfcCtyCd, String trspAgmtSeq, String agmtRefNo, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.genAvalSpc = genAvalSpc;
		this.mtyYdFlg = mtyYdFlg;
		this.vslCd = vslCd;
		this.railCrrTpCd = railCrrTpCd;
		this.destClptIndSeq = destClptIndSeq;
		this.orgClptIndSeq = orgClptIndSeq;
		this.creDt = creDt;
		this.pctlSeq = pctlSeq;
		this.trspAgmtOfcCtyCd = trspAgmtOfcCtyCd;
		this.routOrgNodCd = routOrgNodCd;
		this.pctlWtrDivCd = pctlWtrDivCd;
		this.depFshDt = depFshDt;
		this.vslSlanCd = vslSlanCd;
		this.trspModCd = trspModCd;
		this.crrCd = crrCd;
		this.pctlNo = pctlNo;
		this.pagerows = pagerows;
		this.tzDwllTmHrs = tzDwllTmHrs;
		this.ibflag = ibflag;
		this.inlndRoutInclSttlFlg = inlndRoutInclSttlFlg;
		this.n1stVndrSeq = n1stVndrSeq;
		this.destNodCd = destNodCd;
		this.routDestNodCd = routDestNodCd;
		this.inlndRoutCmbFlg = inlndRoutCmbFlg;
		this.orgNodTpCd = orgNodTpCd;
		this.updUsrId = updUsrId;
		this.pctlIoBndCd = pctlIoBndCd;
		this.n3rdVndrSeq = n3rdVndrSeq;
		this.updDt = updDt;
		this.agmtRefNo = agmtRefNo;
		this.n2ndVndrSeq = n2ndVndrSeq;
		this.cnstFlg = cnstFlg;
		this.skdVoyNo = skdVoyNo;
		this.nodLnkDivCd = nodLnkDivCd;
		this.skdDirCd = skdDirCd;
		this.routSeq = routSeq;
		this.inlndRoutInvBilPattCd = inlndRoutInvBilPattCd;
		this.destNodTpCd = destNodTpCd;
		this.creUsrId = creUsrId;
		this.d7AvalSpc = d7AvalSpc;
		this.trspAgmtSeq = trspAgmtSeq;
		this.orgNodCd = orgNodCd;
		this.arrStDt = arrStDt;
		this.rfAvalSpc = rfAvalSpc;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("gen_aval_spc", getGenAvalSpc());
		this.hashColumns.put("mty_yd_flg", getMtyYdFlg());
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("rail_crr_tp_cd", getRailCrrTpCd());
		this.hashColumns.put("dest_clpt_ind_seq", getDestClptIndSeq());
		this.hashColumns.put("org_clpt_ind_seq", getOrgClptIndSeq());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("pctl_seq", getPctlSeq());
		this.hashColumns.put("trsp_agmt_ofc_cty_cd", getTrspAgmtOfcCtyCd());
		this.hashColumns.put("rout_org_nod_cd", getRoutOrgNodCd());
		this.hashColumns.put("pctl_wtr_div_cd", getPctlWtrDivCd());
		this.hashColumns.put("dep_fsh_dt", getDepFshDt());
		this.hashColumns.put("vsl_slan_cd", getVslSlanCd());
		this.hashColumns.put("trsp_mod_cd", getTrspModCd());
		this.hashColumns.put("crr_cd", getCrrCd());
		this.hashColumns.put("pctl_no", getPctlNo());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("tz_dwll_tm_hrs", getTzDwllTmHrs());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("inlnd_rout_incl_sttl_flg", getInlndRoutInclSttlFlg());
		this.hashColumns.put("n1st_vndr_seq", getN1stVndrSeq());
		this.hashColumns.put("dest_nod_cd", getDestNodCd());
		this.hashColumns.put("rout_dest_nod_cd", getRoutDestNodCd());
		this.hashColumns.put("inlnd_rout_cmb_flg", getInlndRoutCmbFlg());
		this.hashColumns.put("org_nod_tp_cd", getOrgNodTpCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("pctl_io_bnd_cd", getPctlIoBndCd());
		this.hashColumns.put("n3rd_vndr_seq", getN3rdVndrSeq());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("agmt_ref_no", getAgmtRefNo());
		this.hashColumns.put("n2nd_vndr_seq", getN2ndVndrSeq());
		this.hashColumns.put("cnst_flg", getCnstFlg());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("nod_lnk_div_cd", getNodLnkDivCd());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("rout_seq", getRoutSeq());
		this.hashColumns.put("inlnd_rout_inv_bil_patt_cd", getInlndRoutInvBilPattCd());
		this.hashColumns.put("dest_nod_tp_cd", getDestNodTpCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("d7_aval_spc", getD7AvalSpc());
		this.hashColumns.put("trsp_agmt_seq", getTrspAgmtSeq());
		this.hashColumns.put("org_nod_cd", getOrgNodCd());
		this.hashColumns.put("arr_st_dt", getArrStDt());
		this.hashColumns.put("rf_aval_spc", getRfAvalSpc());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("gen_aval_spc", "genAvalSpc");
		this.hashFields.put("mty_yd_flg", "mtyYdFlg");
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("rail_crr_tp_cd", "railCrrTpCd");
		this.hashFields.put("dest_clpt_ind_seq", "destClptIndSeq");
		this.hashFields.put("org_clpt_ind_seq", "orgClptIndSeq");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("pctl_seq", "pctlSeq");
		this.hashFields.put("trsp_agmt_ofc_cty_cd", "trspAgmtOfcCtyCd");
		this.hashFields.put("rout_org_nod_cd", "routOrgNodCd");
		this.hashFields.put("pctl_wtr_div_cd", "pctlWtrDivCd");
		this.hashFields.put("dep_fsh_dt", "depFshDt");
		this.hashFields.put("vsl_slan_cd", "vslSlanCd");
		this.hashFields.put("trsp_mod_cd", "trspModCd");
		this.hashFields.put("crr_cd", "crrCd");
		this.hashFields.put("pctl_no", "pctlNo");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("tz_dwll_tm_hrs", "tzDwllTmHrs");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("inlnd_rout_incl_sttl_flg", "inlndRoutInclSttlFlg");
		this.hashFields.put("n1st_vndr_seq", "n1stVndrSeq");
		this.hashFields.put("dest_nod_cd", "destNodCd");
		this.hashFields.put("rout_dest_nod_cd", "routDestNodCd");
		this.hashFields.put("inlnd_rout_cmb_flg", "inlndRoutCmbFlg");
		this.hashFields.put("org_nod_tp_cd", "orgNodTpCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("pctl_io_bnd_cd", "pctlIoBndCd");
		this.hashFields.put("n3rd_vndr_seq", "n3rdVndrSeq");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("agmt_ref_no", "agmtRefNo");
		this.hashFields.put("n2nd_vndr_seq", "n2ndVndrSeq");
		this.hashFields.put("cnst_flg", "cnstFlg");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("nod_lnk_div_cd", "nodLnkDivCd");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("rout_seq", "routSeq");
		this.hashFields.put("inlnd_rout_inv_bil_patt_cd", "inlndRoutInvBilPattCd");
		this.hashFields.put("dest_nod_tp_cd", "destNodTpCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("d7_aval_spc", "d7AvalSpc");
		this.hashFields.put("trsp_agmt_seq", "trspAgmtSeq");
		this.hashFields.put("org_nod_cd", "orgNodCd");
		this.hashFields.put("arr_st_dt", "arrStDt");
		this.hashFields.put("rf_aval_spc", "rfAvalSpc");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return genAvalSpc
	 */
	public String getGenAvalSpc() {
		return this.genAvalSpc;
	}
	
	/**
	 * Column Info
	 * @return mtyYdFlg
	 */
	public String getMtyYdFlg() {
		return this.mtyYdFlg;
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
	 * @return railCrrTpCd
	 */
	public String getRailCrrTpCd() {
		return this.railCrrTpCd;
	}
	
	/**
	 * Column Info
	 * @return destClptIndSeq
	 */
	public String getDestClptIndSeq() {
		return this.destClptIndSeq;
	}
	
	/**
	 * Column Info
	 * @return orgClptIndSeq
	 */
	public String getOrgClptIndSeq() {
		return this.orgClptIndSeq;
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
	 * @return pctlSeq
	 */
	public String getPctlSeq() {
		return this.pctlSeq;
	}
	
	/**
	 * Column Info
	 * @return trspAgmtOfcCtyCd
	 */
	public String getTrspAgmtOfcCtyCd() {
		return this.trspAgmtOfcCtyCd;
	}
	
	/**
	 * Column Info
	 * @return routOrgNodCd
	 */
	public String getRoutOrgNodCd() {
		return this.routOrgNodCd;
	}
	
	/**
	 * Column Info
	 * @return pctlWtrDivCd
	 */
	public String getPctlWtrDivCd() {
		return this.pctlWtrDivCd;
	}
	
	/**
	 * Column Info
	 * @return depFshDt
	 */
	public String getDepFshDt() {
		return this.depFshDt;
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
	 * @return trspModCd
	 */
	public String getTrspModCd() {
		return this.trspModCd;
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
	 * @return tzDwllTmHrs
	 */
	public String getTzDwllTmHrs() {
		return this.tzDwllTmHrs;
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
	 * @return inlndRoutInclSttlFlg
	 */
	public String getInlndRoutInclSttlFlg() {
		return this.inlndRoutInclSttlFlg;
	}
	
	/**
	 * Column Info
	 * @return n1stVndrSeq
	 */
	public String getN1stVndrSeq() {
		return this.n1stVndrSeq;
	}
	
	/**
	 * Column Info
	 * @return destNodCd
	 */
	public String getDestNodCd() {
		return this.destNodCd;
	}
	
	/**
	 * Column Info
	 * @return routDestNodCd
	 */
	public String getRoutDestNodCd() {
		return this.routDestNodCd;
	}
	
	/**
	 * Column Info
	 * @return inlndRoutCmbFlg
	 */
	public String getInlndRoutCmbFlg() {
		return this.inlndRoutCmbFlg;
	}
	
	/**
	 * Column Info
	 * @return orgNodTpCd
	 */
	public String getOrgNodTpCd() {
		return this.orgNodTpCd;
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
	 * @return pctlIoBndCd
	 */
	public String getPctlIoBndCd() {
		return this.pctlIoBndCd;
	}
	
	/**
	 * Column Info
	 * @return n3rdVndrSeq
	 */
	public String getN3rdVndrSeq() {
		return this.n3rdVndrSeq;
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
	 * @return agmtRefNo
	 */
	public String getAgmtRefNo() {
		return this.agmtRefNo;
	}
	
	/**
	 * Column Info
	 * @return n2ndVndrSeq
	 */
	public String getN2ndVndrSeq() {
		return this.n2ndVndrSeq;
	}
	
	/**
	 * Column Info
	 * @return cnstFlg
	 */
	public String getCnstFlg() {
		return this.cnstFlg;
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
	 * @return nodLnkDivCd
	 */
	public String getNodLnkDivCd() {
		return this.nodLnkDivCd;
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
	 * @return routSeq
	 */
	public String getRoutSeq() {
		return this.routSeq;
	}
	
	/**
	 * Column Info
	 * @return inlndRoutInvBilPattCd
	 */
	public String getInlndRoutInvBilPattCd() {
		return this.inlndRoutInvBilPattCd;
	}
	
	/**
	 * Column Info
	 * @return destNodTpCd
	 */
	public String getDestNodTpCd() {
		return this.destNodTpCd;
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
	 * @return d7AvalSpc
	 */
	public String getD7AvalSpc() {
		return this.d7AvalSpc;
	}
	
	/**
	 * Column Info
	 * @return trspAgmtSeq
	 */
	public String getTrspAgmtSeq() {
		return this.trspAgmtSeq;
	}
	
	/**
	 * Column Info
	 * @return orgNodCd
	 */
	public String getOrgNodCd() {
		return this.orgNodCd;
	}
	
	/**
	 * Column Info
	 * @return arrStDt
	 */
	public String getArrStDt() {
		return this.arrStDt;
	}
	
	/**
	 * Column Info
	 * @return rfAvalSpc
	 */
	public String getRfAvalSpc() {
		return this.rfAvalSpc;
	}
	

	/**
	 * Column Info
	 * @param genAvalSpc
	 */
	public void setGenAvalSpc(String genAvalSpc) {
		this.genAvalSpc = genAvalSpc;
	}
	
	/**
	 * Column Info
	 * @param mtyYdFlg
	 */
	public void setMtyYdFlg(String mtyYdFlg) {
		this.mtyYdFlg = mtyYdFlg;
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
	 * @param railCrrTpCd
	 */
	public void setRailCrrTpCd(String railCrrTpCd) {
		this.railCrrTpCd = railCrrTpCd;
	}
	
	/**
	 * Column Info
	 * @param destClptIndSeq
	 */
	public void setDestClptIndSeq(String destClptIndSeq) {
		this.destClptIndSeq = destClptIndSeq;
	}
	
	/**
	 * Column Info
	 * @param orgClptIndSeq
	 */
	public void setOrgClptIndSeq(String orgClptIndSeq) {
		this.orgClptIndSeq = orgClptIndSeq;
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
	 * @param pctlSeq
	 */
	public void setPctlSeq(String pctlSeq) {
		this.pctlSeq = pctlSeq;
	}
	
	/**
	 * Column Info
	 * @param trspAgmtOfcCtyCd
	 */
	public void setTrspAgmtOfcCtyCd(String trspAgmtOfcCtyCd) {
		this.trspAgmtOfcCtyCd = trspAgmtOfcCtyCd;
	}
	
	/**
	 * Column Info
	 * @param routOrgNodCd
	 */
	public void setRoutOrgNodCd(String routOrgNodCd) {
		this.routOrgNodCd = routOrgNodCd;
	}
	
	/**
	 * Column Info
	 * @param pctlWtrDivCd
	 */
	public void setPctlWtrDivCd(String pctlWtrDivCd) {
		this.pctlWtrDivCd = pctlWtrDivCd;
	}
	
	/**
	 * Column Info
	 * @param depFshDt
	 */
	public void setDepFshDt(String depFshDt) {
		this.depFshDt = depFshDt;
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
	 * @param trspModCd
	 */
	public void setTrspModCd(String trspModCd) {
		this.trspModCd = trspModCd;
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
	 * @param tzDwllTmHrs
	 */
	public void setTzDwllTmHrs(String tzDwllTmHrs) {
		this.tzDwllTmHrs = tzDwllTmHrs;
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
	 * @param inlndRoutInclSttlFlg
	 */
	public void setInlndRoutInclSttlFlg(String inlndRoutInclSttlFlg) {
		this.inlndRoutInclSttlFlg = inlndRoutInclSttlFlg;
	}
	
	/**
	 * Column Info
	 * @param n1stVndrSeq
	 */
	public void setN1stVndrSeq(String n1stVndrSeq) {
		this.n1stVndrSeq = n1stVndrSeq;
	}
	
	/**
	 * Column Info
	 * @param destNodCd
	 */
	public void setDestNodCd(String destNodCd) {
		this.destNodCd = destNodCd;
	}
	
	/**
	 * Column Info
	 * @param routDestNodCd
	 */
	public void setRoutDestNodCd(String routDestNodCd) {
		this.routDestNodCd = routDestNodCd;
	}
	
	/**
	 * Column Info
	 * @param inlndRoutCmbFlg
	 */
	public void setInlndRoutCmbFlg(String inlndRoutCmbFlg) {
		this.inlndRoutCmbFlg = inlndRoutCmbFlg;
	}
	
	/**
	 * Column Info
	 * @param orgNodTpCd
	 */
	public void setOrgNodTpCd(String orgNodTpCd) {
		this.orgNodTpCd = orgNodTpCd;
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
	 * @param pctlIoBndCd
	 */
	public void setPctlIoBndCd(String pctlIoBndCd) {
		this.pctlIoBndCd = pctlIoBndCd;
	}
	
	/**
	 * Column Info
	 * @param n3rdVndrSeq
	 */
	public void setN3rdVndrSeq(String n3rdVndrSeq) {
		this.n3rdVndrSeq = n3rdVndrSeq;
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
	 * @param agmtRefNo
	 */
	public void setAgmtRefNo(String agmtRefNo) {
		this.agmtRefNo = agmtRefNo;
	}
	
	/**
	 * Column Info
	 * @param n2ndVndrSeq
	 */
	public void setN2ndVndrSeq(String n2ndVndrSeq) {
		this.n2ndVndrSeq = n2ndVndrSeq;
	}
	
	/**
	 * Column Info
	 * @param cnstFlg
	 */
	public void setCnstFlg(String cnstFlg) {
		this.cnstFlg = cnstFlg;
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
	 * @param nodLnkDivCd
	 */
	public void setNodLnkDivCd(String nodLnkDivCd) {
		this.nodLnkDivCd = nodLnkDivCd;
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
	 * @param routSeq
	 */
	public void setRoutSeq(String routSeq) {
		this.routSeq = routSeq;
	}
	
	/**
	 * Column Info
	 * @param inlndRoutInvBilPattCd
	 */
	public void setInlndRoutInvBilPattCd(String inlndRoutInvBilPattCd) {
		this.inlndRoutInvBilPattCd = inlndRoutInvBilPattCd;
	}
	
	/**
	 * Column Info
	 * @param destNodTpCd
	 */
	public void setDestNodTpCd(String destNodTpCd) {
		this.destNodTpCd = destNodTpCd;
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
	 * @param d7AvalSpc
	 */
	public void setD7AvalSpc(String d7AvalSpc) {
		this.d7AvalSpc = d7AvalSpc;
	}
	
	/**
	 * Column Info
	 * @param trspAgmtSeq
	 */
	public void setTrspAgmtSeq(String trspAgmtSeq) {
		this.trspAgmtSeq = trspAgmtSeq;
	}
	
	/**
	 * Column Info
	 * @param orgNodCd
	 */
	public void setOrgNodCd(String orgNodCd) {
		this.orgNodCd = orgNodCd;
	}
	
	/**
	 * Column Info
	 * @param arrStDt
	 */
	public void setArrStDt(String arrStDt) {
		this.arrStDt = arrStDt;
	}
	
	/**
	 * Column Info
	 * @param rfAvalSpc
	 */
	public void setRfAvalSpc(String rfAvalSpc) {
		this.rfAvalSpc = rfAvalSpc;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setGenAvalSpc(JSPUtil.getParameter(request, "gen_aval_spc", ""));
		setMtyYdFlg(JSPUtil.getParameter(request, "mty_yd_flg", ""));
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setRailCrrTpCd(JSPUtil.getParameter(request, "rail_crr_tp_cd", ""));
		setDestClptIndSeq(JSPUtil.getParameter(request, "dest_clpt_ind_seq", ""));
		setOrgClptIndSeq(JSPUtil.getParameter(request, "org_clpt_ind_seq", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setPctlSeq(JSPUtil.getParameter(request, "pctl_seq", ""));
		setTrspAgmtOfcCtyCd(JSPUtil.getParameter(request, "trsp_agmt_ofc_cty_cd", ""));
		setRoutOrgNodCd(JSPUtil.getParameter(request, "rout_org_nod_cd", ""));
		setPctlWtrDivCd(JSPUtil.getParameter(request, "pctl_wtr_div_cd", ""));
		setDepFshDt(JSPUtil.getParameter(request, "dep_fsh_dt", ""));
		setVslSlanCd(JSPUtil.getParameter(request, "vsl_slan_cd", ""));
		setTrspModCd(JSPUtil.getParameter(request, "trsp_mod_cd", ""));
		setCrrCd(JSPUtil.getParameter(request, "crr_cd", ""));
		setPctlNo(JSPUtil.getParameter(request, "pctl_no", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setTzDwllTmHrs(JSPUtil.getParameter(request, "tz_dwll_tm_hrs", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setInlndRoutInclSttlFlg(JSPUtil.getParameter(request, "inlnd_rout_incl_sttl_flg", ""));
		setN1stVndrSeq(JSPUtil.getParameter(request, "n1st_vndr_seq", ""));
		setDestNodCd(JSPUtil.getParameter(request, "dest_nod_cd", ""));
		setRoutDestNodCd(JSPUtil.getParameter(request, "rout_dest_nod_cd", ""));
		setInlndRoutCmbFlg(JSPUtil.getParameter(request, "inlnd_rout_cmb_flg", ""));
		setOrgNodTpCd(JSPUtil.getParameter(request, "org_nod_tp_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setPctlIoBndCd(JSPUtil.getParameter(request, "pctl_io_bnd_cd", ""));
		setN3rdVndrSeq(JSPUtil.getParameter(request, "n3rd_vndr_seq", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setAgmtRefNo(JSPUtil.getParameter(request, "agmt_ref_no", ""));
		setN2ndVndrSeq(JSPUtil.getParameter(request, "n2nd_vndr_seq", ""));
		setCnstFlg(JSPUtil.getParameter(request, "cnst_flg", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, "skd_voy_no", ""));
		setNodLnkDivCd(JSPUtil.getParameter(request, "nod_lnk_div_cd", ""));
		setSkdDirCd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
		setRoutSeq(JSPUtil.getParameter(request, "rout_seq", ""));
		setInlndRoutInvBilPattCd(JSPUtil.getParameter(request, "inlnd_rout_inv_bil_patt_cd", ""));
		setDestNodTpCd(JSPUtil.getParameter(request, "dest_nod_tp_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setD7AvalSpc(JSPUtil.getParameter(request, "d7_aval_spc", ""));
		setTrspAgmtSeq(JSPUtil.getParameter(request, "trsp_agmt_seq", ""));
		setOrgNodCd(JSPUtil.getParameter(request, "org_nod_cd", ""));
		setArrStDt(JSPUtil.getParameter(request, "arr_st_dt", ""));
		setRfAvalSpc(JSPUtil.getParameter(request, "rf_aval_spc", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return PrdProdCtlRoutDtlVO[]
	 */
	public PrdProdCtlRoutDtlVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return PrdProdCtlRoutDtlVO[]
	 */
	public PrdProdCtlRoutDtlVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		PrdProdCtlRoutDtlVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] genAvalSpc = (JSPUtil.getParameter(request, prefix	+ "gen_aval_spc", length));
			String[] mtyYdFlg = (JSPUtil.getParameter(request, prefix	+ "mty_yd_flg", length));
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] railCrrTpCd = (JSPUtil.getParameter(request, prefix	+ "rail_crr_tp_cd", length));
			String[] destClptIndSeq = (JSPUtil.getParameter(request, prefix	+ "dest_clpt_ind_seq", length));
			String[] orgClptIndSeq = (JSPUtil.getParameter(request, prefix	+ "org_clpt_ind_seq", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] pctlSeq = (JSPUtil.getParameter(request, prefix	+ "pctl_seq", length));
			String[] trspAgmtOfcCtyCd = (JSPUtil.getParameter(request, prefix	+ "trsp_agmt_ofc_cty_cd", length));
			String[] routOrgNodCd = (JSPUtil.getParameter(request, prefix	+ "rout_org_nod_cd", length));
			String[] pctlWtrDivCd = (JSPUtil.getParameter(request, prefix	+ "pctl_wtr_div_cd", length));
			String[] depFshDt = (JSPUtil.getParameter(request, prefix	+ "dep_fsh_dt", length));
			String[] vslSlanCd = (JSPUtil.getParameter(request, prefix	+ "vsl_slan_cd", length));
			String[] trspModCd = (JSPUtil.getParameter(request, prefix	+ "trsp_mod_cd", length));
			String[] crrCd = (JSPUtil.getParameter(request, prefix	+ "crr_cd", length));
			String[] pctlNo = (JSPUtil.getParameter(request, prefix	+ "pctl_no", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] tzDwllTmHrs = (JSPUtil.getParameter(request, prefix	+ "tz_dwll_tm_hrs", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] inlndRoutInclSttlFlg = (JSPUtil.getParameter(request, prefix	+ "inlnd_rout_incl_sttl_flg", length));
			String[] n1stVndrSeq = (JSPUtil.getParameter(request, prefix	+ "n1st_vndr_seq", length));
			String[] destNodCd = (JSPUtil.getParameter(request, prefix	+ "dest_nod_cd", length));
			String[] routDestNodCd = (JSPUtil.getParameter(request, prefix	+ "rout_dest_nod_cd", length));
			String[] inlndRoutCmbFlg = (JSPUtil.getParameter(request, prefix	+ "inlnd_rout_cmb_flg", length));
			String[] orgNodTpCd = (JSPUtil.getParameter(request, prefix	+ "org_nod_tp_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] pctlIoBndCd = (JSPUtil.getParameter(request, prefix	+ "pctl_io_bnd_cd", length));
			String[] n3rdVndrSeq = (JSPUtil.getParameter(request, prefix	+ "n3rd_vndr_seq", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] agmtRefNo = (JSPUtil.getParameter(request, prefix	+ "agmt_ref_no", length));
			String[] n2ndVndrSeq = (JSPUtil.getParameter(request, prefix	+ "n2nd_vndr_seq", length));
			String[] cnstFlg = (JSPUtil.getParameter(request, prefix	+ "cnst_flg", length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no", length));
			String[] nodLnkDivCd = (JSPUtil.getParameter(request, prefix	+ "nod_lnk_div_cd", length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd", length));
			String[] routSeq = (JSPUtil.getParameter(request, prefix	+ "rout_seq", length));
			String[] inlndRoutInvBilPattCd = (JSPUtil.getParameter(request, prefix	+ "inlnd_rout_inv_bil_patt_cd", length));
			String[] destNodTpCd = (JSPUtil.getParameter(request, prefix	+ "dest_nod_tp_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] d7AvalSpc = (JSPUtil.getParameter(request, prefix	+ "d7_aval_spc", length));
			String[] trspAgmtSeq = (JSPUtil.getParameter(request, prefix	+ "trsp_agmt_seq", length));
			String[] orgNodCd = (JSPUtil.getParameter(request, prefix	+ "org_nod_cd", length));
			String[] arrStDt = (JSPUtil.getParameter(request, prefix	+ "arr_st_dt", length));
			String[] rfAvalSpc = (JSPUtil.getParameter(request, prefix	+ "rf_aval_spc", length));
			
			for (int i = 0; i < length; i++) {
				model = new PrdProdCtlRoutDtlVO();
				if (genAvalSpc[i] != null)
					model.setGenAvalSpc(genAvalSpc[i]);
				if (mtyYdFlg[i] != null)
					model.setMtyYdFlg(mtyYdFlg[i]);
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (railCrrTpCd[i] != null)
					model.setRailCrrTpCd(railCrrTpCd[i]);
				if (destClptIndSeq[i] != null)
					model.setDestClptIndSeq(destClptIndSeq[i]);
				if (orgClptIndSeq[i] != null)
					model.setOrgClptIndSeq(orgClptIndSeq[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (pctlSeq[i] != null)
					model.setPctlSeq(pctlSeq[i]);
				if (trspAgmtOfcCtyCd[i] != null)
					model.setTrspAgmtOfcCtyCd(trspAgmtOfcCtyCd[i]);
				if (routOrgNodCd[i] != null)
					model.setRoutOrgNodCd(routOrgNodCd[i]);
				if (pctlWtrDivCd[i] != null)
					model.setPctlWtrDivCd(pctlWtrDivCd[i]);
				if (depFshDt[i] != null)
					model.setDepFshDt(depFshDt[i]);
				if (vslSlanCd[i] != null)
					model.setVslSlanCd(vslSlanCd[i]);
				if (trspModCd[i] != null)
					model.setTrspModCd(trspModCd[i]);
				if (crrCd[i] != null)
					model.setCrrCd(crrCd[i]);
				if (pctlNo[i] != null)
					model.setPctlNo(pctlNo[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (tzDwllTmHrs[i] != null)
					model.setTzDwllTmHrs(tzDwllTmHrs[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (inlndRoutInclSttlFlg[i] != null)
					model.setInlndRoutInclSttlFlg(inlndRoutInclSttlFlg[i]);
				if (n1stVndrSeq[i] != null)
					model.setN1stVndrSeq(n1stVndrSeq[i]);
				if (destNodCd[i] != null)
					model.setDestNodCd(destNodCd[i]);
				if (routDestNodCd[i] != null)
					model.setRoutDestNodCd(routDestNodCd[i]);
				if (inlndRoutCmbFlg[i] != null)
					model.setInlndRoutCmbFlg(inlndRoutCmbFlg[i]);
				if (orgNodTpCd[i] != null)
					model.setOrgNodTpCd(orgNodTpCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (pctlIoBndCd[i] != null)
					model.setPctlIoBndCd(pctlIoBndCd[i]);
				if (n3rdVndrSeq[i] != null)
					model.setN3rdVndrSeq(n3rdVndrSeq[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (agmtRefNo[i] != null)
					model.setAgmtRefNo(agmtRefNo[i]);
				if (n2ndVndrSeq[i] != null)
					model.setN2ndVndrSeq(n2ndVndrSeq[i]);
				if (cnstFlg[i] != null)
					model.setCnstFlg(cnstFlg[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (nodLnkDivCd[i] != null)
					model.setNodLnkDivCd(nodLnkDivCd[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (routSeq[i] != null)
					model.setRoutSeq(routSeq[i]);
				if (inlndRoutInvBilPattCd[i] != null)
					model.setInlndRoutInvBilPattCd(inlndRoutInvBilPattCd[i]);
				if (destNodTpCd[i] != null)
					model.setDestNodTpCd(destNodTpCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (d7AvalSpc[i] != null)
					model.setD7AvalSpc(d7AvalSpc[i]);
				if (trspAgmtSeq[i] != null)
					model.setTrspAgmtSeq(trspAgmtSeq[i]);
				if (orgNodCd[i] != null)
					model.setOrgNodCd(orgNodCd[i]);
				if (arrStDt[i] != null)
					model.setArrStDt(arrStDt[i]);
				if (rfAvalSpc[i] != null)
					model.setRfAvalSpc(rfAvalSpc[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getPrdProdCtlRoutDtlVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return PrdProdCtlRoutDtlVO[]
	 */
	public PrdProdCtlRoutDtlVO[] getPrdProdCtlRoutDtlVOs(){
		PrdProdCtlRoutDtlVO[] vos = (PrdProdCtlRoutDtlVO[])models.toArray(new PrdProdCtlRoutDtlVO[models.size()]);
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
		this.genAvalSpc = this.genAvalSpc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mtyYdFlg = this.mtyYdFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.railCrrTpCd = this.railCrrTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.destClptIndSeq = this.destClptIndSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgClptIndSeq = this.orgClptIndSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pctlSeq = this.pctlSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspAgmtOfcCtyCd = this.trspAgmtOfcCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.routOrgNodCd = this.routOrgNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pctlWtrDivCd = this.pctlWtrDivCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.depFshDt = this.depFshDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslSlanCd = this.vslSlanCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspModCd = this.trspModCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.crrCd = this.crrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pctlNo = this.pctlNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tzDwllTmHrs = this.tzDwllTmHrs .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.inlndRoutInclSttlFlg = this.inlndRoutInclSttlFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stVndrSeq = this.n1stVndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.destNodCd = this.destNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.routDestNodCd = this.routDestNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.inlndRoutCmbFlg = this.inlndRoutCmbFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgNodTpCd = this.orgNodTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pctlIoBndCd = this.pctlIoBndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdVndrSeq = this.n3rdVndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtRefNo = this.agmtRefNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndVndrSeq = this.n2ndVndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cnstFlg = this.cnstFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.nodLnkDivCd = this.nodLnkDivCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.routSeq = this.routSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.inlndRoutInvBilPattCd = this.inlndRoutInvBilPattCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.destNodTpCd = this.destNodTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.d7AvalSpc = this.d7AvalSpc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspAgmtSeq = this.trspAgmtSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgNodCd = this.orgNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arrStDt = this.arrStDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rfAvalSpc = this.rfAvalSpc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
