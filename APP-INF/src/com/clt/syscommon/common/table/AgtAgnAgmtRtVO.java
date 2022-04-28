/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : AgtAgnAgmtRtVO.java
*@FileTitle : AgtAgnAgmtRtVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.08.17
*@LastModifier : 이호진
*@LastVersion : 1.0
* 2009.08.17 이호진 
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
 * @author 이호진
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class AgtAgnAgmtRtVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<AgtAgnAgmtRtVO> models = new ArrayList<AgtAgnAgmtRtVO>();
	
	/* Column Info */
	private String vndrCntCd = null;
	/* Column Info */
	private String cntrInpTermCd = null;
	/* Column Info */
	private String currCd = null;
	/* Column Info */
	private String agnSeq = null;
	/* Column Info */
	private String bkgOfcInpTermCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String scOfcInpCd = null;
	/* Column Info */
	private String agmtOfcCd = null;
	/* Column Info */
	private String arOfcTermCd = null;
	/* Column Info */
	private String grsNetDivCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String bkgPpdInpTermCd = null;
	/* Column Info */
	private String agnAgmtSeq = null;
	/* Column Info */
	private String bkgSocFlg = null;
	/* Column Info */
	private String bkgPolInpTermCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String loclChgInpTermCd = null;
	/* Column Info */
	private String bkgPorInpTermCd = null;
	/* Column Info */
	private String vslInpTermCd = null;
	/* Column Info */
	private String acTpCd = null;
	/* Column Info */
	private String commPayTermCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String bkgN3rdInpTermCd = null;
	/* Column Info */
	private String bkgPodInpTermCd = null;
	/* Column Info */
	private String fxCommAmt = null;
	/* Column Info */
	private String fdrgDdctOrgFlg = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String commStndCostCd = null;
	/* Column Info */
	private String bkgCltInpTermCd = null;
	/* Column Info */
	private String fdrgDdctDestFlg = null;
	/* Column Info */
	private String laneInpTermCd = null;
	/* Column Info */
	private String slsOfcInpTermCd = null;
	/* Column Info */
	private String bkgDblFlg = null;
	/* Column Info */
	private String scInpTermCd = null;
	/* Column Info */
	private String custInpTermCd = null;
	/* Column Info */
	private String rfaInpTermCd = null;
	/* Column Info */
	private String ioBndCd = null;
	/* Column Info */
	private String chgDdctInpCd = null;
	/* Column Info */
	private String hlgDdctOrgFlg = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String bkgDelInpTermCd = null;
	/* Column Info */
	private String agnAgmtVerSeq = null;
	/* Column Info */
	private String bkgCommRt = null;
	/* Column Info */
	private String rfaOfcInpCd = null;
	/* Column Info */
	private String vndrSeq = null;
	/* Column Info */
	private String agmtOfcCtyCd = null;
	/* Column Info */
	private String fullMtyCd = null;
	/* Column Info */
	private String hlgDdctDestFlg = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public AgtAgnAgmtRtVO() {}

	public AgtAgnAgmtRtVO(String ibflag, String pagerows, String agmtOfcCd, String agmtOfcCtyCd, String agnAgmtSeq, String vndrCntCd, String vndrSeq, String agnAgmtVerSeq, String ioBndCd, String acTpCd, String agnSeq, String cntrInpTermCd, String fullMtyCd, String commPayTermCd, String grsNetDivCd, String currCd, String chgDdctInpCd, String hlgDdctOrgFlg, String hlgDdctDestFlg, String fdrgDdctOrgFlg, String fdrgDdctDestFlg, String custInpTermCd, String scInpTermCd, String rfaInpTermCd, String bkgOfcInpTermCd, String slsOfcInpTermCd, String bkgPorInpTermCd, String bkgPolInpTermCd, String bkgPodInpTermCd, String bkgDelInpTermCd, String bkgPpdInpTermCd, String bkgCltInpTermCd, String bkgN3rdInpTermCd, String bkgSocFlg, String bkgDblFlg, String scOfcInpCd, String rfaOfcInpCd, String laneInpTermCd, String vslInpTermCd, String loclChgInpTermCd, String commStndCostCd, String fxCommAmt, String bkgCommRt, String arOfcTermCd, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.vndrCntCd = vndrCntCd;
		this.cntrInpTermCd = cntrInpTermCd;
		this.currCd = currCd;
		this.agnSeq = agnSeq;
		this.bkgOfcInpTermCd = bkgOfcInpTermCd;
		this.creDt = creDt;
		this.scOfcInpCd = scOfcInpCd;
		this.agmtOfcCd = agmtOfcCd;
		this.arOfcTermCd = arOfcTermCd;
		this.grsNetDivCd = grsNetDivCd;
		this.pagerows = pagerows;
		this.bkgPpdInpTermCd = bkgPpdInpTermCd;
		this.agnAgmtSeq = agnAgmtSeq;
		this.bkgSocFlg = bkgSocFlg;
		this.bkgPolInpTermCd = bkgPolInpTermCd;
		this.ibflag = ibflag;
		this.loclChgInpTermCd = loclChgInpTermCd;
		this.bkgPorInpTermCd = bkgPorInpTermCd;
		this.vslInpTermCd = vslInpTermCd;
		this.acTpCd = acTpCd;
		this.commPayTermCd = commPayTermCd;
		this.updUsrId = updUsrId;
		this.bkgN3rdInpTermCd = bkgN3rdInpTermCd;
		this.bkgPodInpTermCd = bkgPodInpTermCd;
		this.fxCommAmt = fxCommAmt;
		this.fdrgDdctOrgFlg = fdrgDdctOrgFlg;
		this.updDt = updDt;
		this.commStndCostCd = commStndCostCd;
		this.bkgCltInpTermCd = bkgCltInpTermCd;
		this.fdrgDdctDestFlg = fdrgDdctDestFlg;
		this.laneInpTermCd = laneInpTermCd;
		this.slsOfcInpTermCd = slsOfcInpTermCd;
		this.bkgDblFlg = bkgDblFlg;
		this.scInpTermCd = scInpTermCd;
		this.custInpTermCd = custInpTermCd;
		this.rfaInpTermCd = rfaInpTermCd;
		this.ioBndCd = ioBndCd;
		this.chgDdctInpCd = chgDdctInpCd;
		this.hlgDdctOrgFlg = hlgDdctOrgFlg;
		this.creUsrId = creUsrId;
		this.bkgDelInpTermCd = bkgDelInpTermCd;
		this.agnAgmtVerSeq = agnAgmtVerSeq;
		this.bkgCommRt = bkgCommRt;
		this.rfaOfcInpCd = rfaOfcInpCd;
		this.vndrSeq = vndrSeq;
		this.agmtOfcCtyCd = agmtOfcCtyCd;
		this.fullMtyCd = fullMtyCd;
		this.hlgDdctDestFlg = hlgDdctDestFlg;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("vndr_cnt_cd", getVndrCntCd());
		this.hashColumns.put("cntr_inp_term_cd", getCntrInpTermCd());
		this.hashColumns.put("curr_cd", getCurrCd());
		this.hashColumns.put("agn_seq", getAgnSeq());
		this.hashColumns.put("bkg_ofc_inp_term_cd", getBkgOfcInpTermCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("sc_ofc_inp_cd", getScOfcInpCd());
		this.hashColumns.put("agmt_ofc_cd", getAgmtOfcCd());
		this.hashColumns.put("ar_ofc_term_cd", getArOfcTermCd());
		this.hashColumns.put("grs_net_div_cd", getGrsNetDivCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("bkg_ppd_inp_term_cd", getBkgPpdInpTermCd());
		this.hashColumns.put("agn_agmt_seq", getAgnAgmtSeq());
		this.hashColumns.put("bkg_soc_flg", getBkgSocFlg());
		this.hashColumns.put("bkg_pol_inp_term_cd", getBkgPolInpTermCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("locl_chg_inp_term_cd", getLoclChgInpTermCd());
		this.hashColumns.put("bkg_por_inp_term_cd", getBkgPorInpTermCd());
		this.hashColumns.put("vsl_inp_term_cd", getVslInpTermCd());
		this.hashColumns.put("ac_tp_cd", getAcTpCd());
		this.hashColumns.put("comm_pay_term_cd", getCommPayTermCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("bkg_n3rd_inp_term_cd", getBkgN3rdInpTermCd());
		this.hashColumns.put("bkg_pod_inp_term_cd", getBkgPodInpTermCd());
		this.hashColumns.put("fx_comm_amt", getFxCommAmt());
		this.hashColumns.put("fdrg_ddct_org_flg", getFdrgDdctOrgFlg());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("comm_stnd_cost_cd", getCommStndCostCd());
		this.hashColumns.put("bkg_clt_inp_term_cd", getBkgCltInpTermCd());
		this.hashColumns.put("fdrg_ddct_dest_flg", getFdrgDdctDestFlg());
		this.hashColumns.put("lane_inp_term_cd", getLaneInpTermCd());
		this.hashColumns.put("sls_ofc_inp_term_cd", getSlsOfcInpTermCd());
		this.hashColumns.put("bkg_dbl_flg", getBkgDblFlg());
		this.hashColumns.put("sc_inp_term_cd", getScInpTermCd());
		this.hashColumns.put("cust_inp_term_cd", getCustInpTermCd());
		this.hashColumns.put("rfa_inp_term_cd", getRfaInpTermCd());
		this.hashColumns.put("io_bnd_cd", getIoBndCd());
		this.hashColumns.put("chg_ddct_inp_cd", getChgDdctInpCd());
		this.hashColumns.put("hlg_ddct_org_flg", getHlgDdctOrgFlg());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("bkg_del_inp_term_cd", getBkgDelInpTermCd());
		this.hashColumns.put("agn_agmt_ver_seq", getAgnAgmtVerSeq());
		this.hashColumns.put("bkg_comm_rt", getBkgCommRt());
		this.hashColumns.put("rfa_ofc_inp_cd", getRfaOfcInpCd());
		this.hashColumns.put("vndr_seq", getVndrSeq());
		this.hashColumns.put("agmt_ofc_cty_cd", getAgmtOfcCtyCd());
		this.hashColumns.put("full_mty_cd", getFullMtyCd());
		this.hashColumns.put("hlg_ddct_dest_flg", getHlgDdctDestFlg());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("vndr_cnt_cd", "vndrCntCd");
		this.hashFields.put("cntr_inp_term_cd", "cntrInpTermCd");
		this.hashFields.put("curr_cd", "currCd");
		this.hashFields.put("agn_seq", "agnSeq");
		this.hashFields.put("bkg_ofc_inp_term_cd", "bkgOfcInpTermCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("sc_ofc_inp_cd", "scOfcInpCd");
		this.hashFields.put("agmt_ofc_cd", "agmtOfcCd");
		this.hashFields.put("ar_ofc_term_cd", "arOfcTermCd");
		this.hashFields.put("grs_net_div_cd", "grsNetDivCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("bkg_ppd_inp_term_cd", "bkgPpdInpTermCd");
		this.hashFields.put("agn_agmt_seq", "agnAgmtSeq");
		this.hashFields.put("bkg_soc_flg", "bkgSocFlg");
		this.hashFields.put("bkg_pol_inp_term_cd", "bkgPolInpTermCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("locl_chg_inp_term_cd", "loclChgInpTermCd");
		this.hashFields.put("bkg_por_inp_term_cd", "bkgPorInpTermCd");
		this.hashFields.put("vsl_inp_term_cd", "vslInpTermCd");
		this.hashFields.put("ac_tp_cd", "acTpCd");
		this.hashFields.put("comm_pay_term_cd", "commPayTermCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("bkg_n3rd_inp_term_cd", "bkgN3rdInpTermCd");
		this.hashFields.put("bkg_pod_inp_term_cd", "bkgPodInpTermCd");
		this.hashFields.put("fx_comm_amt", "fxCommAmt");
		this.hashFields.put("fdrg_ddct_org_flg", "fdrgDdctOrgFlg");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("comm_stnd_cost_cd", "commStndCostCd");
		this.hashFields.put("bkg_clt_inp_term_cd", "bkgCltInpTermCd");
		this.hashFields.put("fdrg_ddct_dest_flg", "fdrgDdctDestFlg");
		this.hashFields.put("lane_inp_term_cd", "laneInpTermCd");
		this.hashFields.put("sls_ofc_inp_term_cd", "slsOfcInpTermCd");
		this.hashFields.put("bkg_dbl_flg", "bkgDblFlg");
		this.hashFields.put("sc_inp_term_cd", "scInpTermCd");
		this.hashFields.put("cust_inp_term_cd", "custInpTermCd");
		this.hashFields.put("rfa_inp_term_cd", "rfaInpTermCd");
		this.hashFields.put("io_bnd_cd", "ioBndCd");
		this.hashFields.put("chg_ddct_inp_cd", "chgDdctInpCd");
		this.hashFields.put("hlg_ddct_org_flg", "hlgDdctOrgFlg");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("bkg_del_inp_term_cd", "bkgDelInpTermCd");
		this.hashFields.put("agn_agmt_ver_seq", "agnAgmtVerSeq");
		this.hashFields.put("bkg_comm_rt", "bkgCommRt");
		this.hashFields.put("rfa_ofc_inp_cd", "rfaOfcInpCd");
		this.hashFields.put("vndr_seq", "vndrSeq");
		this.hashFields.put("agmt_ofc_cty_cd", "agmtOfcCtyCd");
		this.hashFields.put("full_mty_cd", "fullMtyCd");
		this.hashFields.put("hlg_ddct_dest_flg", "hlgDdctDestFlg");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return vndrCntCd
	 */
	public String getVndrCntCd() {
		return this.vndrCntCd;
	}
	
	/**
	 * Column Info
	 * @return cntrInpTermCd
	 */
	public String getCntrInpTermCd() {
		return this.cntrInpTermCd;
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
	 * @return agnSeq
	 */
	public String getAgnSeq() {
		return this.agnSeq;
	}
	
	/**
	 * Column Info
	 * @return bkgOfcInpTermCd
	 */
	public String getBkgOfcInpTermCd() {
		return this.bkgOfcInpTermCd;
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
	 * @return scOfcInpCd
	 */
	public String getScOfcInpCd() {
		return this.scOfcInpCd;
	}
	
	/**
	 * Column Info
	 * @return agmtOfcCd
	 */
	public String getAgmtOfcCd() {
		return this.agmtOfcCd;
	}
	
	/**
	 * Column Info
	 * @return arOfcTermCd
	 */
	public String getArOfcTermCd() {
		return this.arOfcTermCd;
	}
	
	/**
	 * Column Info
	 * @return grsNetDivCd
	 */
	public String getGrsNetDivCd() {
		return this.grsNetDivCd;
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
	 * @return bkgPpdInpTermCd
	 */
	public String getBkgPpdInpTermCd() {
		return this.bkgPpdInpTermCd;
	}
	
	/**
	 * Column Info
	 * @return agnAgmtSeq
	 */
	public String getAgnAgmtSeq() {
		return this.agnAgmtSeq;
	}
	
	/**
	 * Column Info
	 * @return bkgSocFlg
	 */
	public String getBkgSocFlg() {
		return this.bkgSocFlg;
	}
	
	/**
	 * Column Info
	 * @return bkgPolInpTermCd
	 */
	public String getBkgPolInpTermCd() {
		return this.bkgPolInpTermCd;
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
	 * @return loclChgInpTermCd
	 */
	public String getLoclChgInpTermCd() {
		return this.loclChgInpTermCd;
	}
	
	/**
	 * Column Info
	 * @return bkgPorInpTermCd
	 */
	public String getBkgPorInpTermCd() {
		return this.bkgPorInpTermCd;
	}
	
	/**
	 * Column Info
	 * @return vslInpTermCd
	 */
	public String getVslInpTermCd() {
		return this.vslInpTermCd;
	}
	
	/**
	 * Column Info
	 * @return acTpCd
	 */
	public String getAcTpCd() {
		return this.acTpCd;
	}
	
	/**
	 * Column Info
	 * @return commPayTermCd
	 */
	public String getCommPayTermCd() {
		return this.commPayTermCd;
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
	 * @return bkgN3rdInpTermCd
	 */
	public String getBkgN3rdInpTermCd() {
		return this.bkgN3rdInpTermCd;
	}
	
	/**
	 * Column Info
	 * @return bkgPodInpTermCd
	 */
	public String getBkgPodInpTermCd() {
		return this.bkgPodInpTermCd;
	}
	
	/**
	 * Column Info
	 * @return fxCommAmt
	 */
	public String getFxCommAmt() {
		return this.fxCommAmt;
	}
	
	/**
	 * Column Info
	 * @return fdrgDdctOrgFlg
	 */
	public String getFdrgDdctOrgFlg() {
		return this.fdrgDdctOrgFlg;
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
	 * @return commStndCostCd
	 */
	public String getCommStndCostCd() {
		return this.commStndCostCd;
	}
	
	/**
	 * Column Info
	 * @return bkgCltInpTermCd
	 */
	public String getBkgCltInpTermCd() {
		return this.bkgCltInpTermCd;
	}
	
	/**
	 * Column Info
	 * @return fdrgDdctDestFlg
	 */
	public String getFdrgDdctDestFlg() {
		return this.fdrgDdctDestFlg;
	}
	
	/**
	 * Column Info
	 * @return laneInpTermCd
	 */
	public String getLaneInpTermCd() {
		return this.laneInpTermCd;
	}
	
	/**
	 * Column Info
	 * @return slsOfcInpTermCd
	 */
	public String getSlsOfcInpTermCd() {
		return this.slsOfcInpTermCd;
	}
	
	/**
	 * Column Info
	 * @return bkgDblFlg
	 */
	public String getBkgDblFlg() {
		return this.bkgDblFlg;
	}
	
	/**
	 * Column Info
	 * @return scInpTermCd
	 */
	public String getScInpTermCd() {
		return this.scInpTermCd;
	}
	
	/**
	 * Column Info
	 * @return custInpTermCd
	 */
	public String getCustInpTermCd() {
		return this.custInpTermCd;
	}
	
	/**
	 * Column Info
	 * @return rfaInpTermCd
	 */
	public String getRfaInpTermCd() {
		return this.rfaInpTermCd;
	}
	
	/**
	 * Column Info
	 * @return ioBndCd
	 */
	public String getIoBndCd() {
		return this.ioBndCd;
	}
	
	/**
	 * Column Info
	 * @return chgDdctInpCd
	 */
	public String getChgDdctInpCd() {
		return this.chgDdctInpCd;
	}
	
	/**
	 * Column Info
	 * @return hlgDdctOrgFlg
	 */
	public String getHlgDdctOrgFlg() {
		return this.hlgDdctOrgFlg;
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
	 * @return bkgDelInpTermCd
	 */
	public String getBkgDelInpTermCd() {
		return this.bkgDelInpTermCd;
	}
	
	/**
	 * Column Info
	 * @return agnAgmtVerSeq
	 */
	public String getAgnAgmtVerSeq() {
		return this.agnAgmtVerSeq;
	}
	
	/**
	 * Column Info
	 * @return bkgCommRt
	 */
	public String getBkgCommRt() {
		return this.bkgCommRt;
	}
	
	/**
	 * Column Info
	 * @return rfaOfcInpCd
	 */
	public String getRfaOfcInpCd() {
		return this.rfaOfcInpCd;
	}
	
	/**
	 * Column Info
	 * @return vndrSeq
	 */
	public String getVndrSeq() {
		return this.vndrSeq;
	}
	
	/**
	 * Column Info
	 * @return agmtOfcCtyCd
	 */
	public String getAgmtOfcCtyCd() {
		return this.agmtOfcCtyCd;
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
	 * @return hlgDdctDestFlg
	 */
	public String getHlgDdctDestFlg() {
		return this.hlgDdctDestFlg;
	}
	

	/**
	 * Column Info
	 * @param vndrCntCd
	 */
	public void setVndrCntCd(String vndrCntCd) {
		this.vndrCntCd = vndrCntCd;
	}
	
	/**
	 * Column Info
	 * @param cntrInpTermCd
	 */
	public void setCntrInpTermCd(String cntrInpTermCd) {
		this.cntrInpTermCd = cntrInpTermCd;
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
	 * @param agnSeq
	 */
	public void setAgnSeq(String agnSeq) {
		this.agnSeq = agnSeq;
	}
	
	/**
	 * Column Info
	 * @param bkgOfcInpTermCd
	 */
	public void setBkgOfcInpTermCd(String bkgOfcInpTermCd) {
		this.bkgOfcInpTermCd = bkgOfcInpTermCd;
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
	 * @param scOfcInpCd
	 */
	public void setScOfcInpCd(String scOfcInpCd) {
		this.scOfcInpCd = scOfcInpCd;
	}
	
	/**
	 * Column Info
	 * @param agmtOfcCd
	 */
	public void setAgmtOfcCd(String agmtOfcCd) {
		this.agmtOfcCd = agmtOfcCd;
	}
	
	/**
	 * Column Info
	 * @param arOfcTermCd
	 */
	public void setArOfcTermCd(String arOfcTermCd) {
		this.arOfcTermCd = arOfcTermCd;
	}
	
	/**
	 * Column Info
	 * @param grsNetDivCd
	 */
	public void setGrsNetDivCd(String grsNetDivCd) {
		this.grsNetDivCd = grsNetDivCd;
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
	 * @param bkgPpdInpTermCd
	 */
	public void setBkgPpdInpTermCd(String bkgPpdInpTermCd) {
		this.bkgPpdInpTermCd = bkgPpdInpTermCd;
	}
	
	/**
	 * Column Info
	 * @param agnAgmtSeq
	 */
	public void setAgnAgmtSeq(String agnAgmtSeq) {
		this.agnAgmtSeq = agnAgmtSeq;
	}
	
	/**
	 * Column Info
	 * @param bkgSocFlg
	 */
	public void setBkgSocFlg(String bkgSocFlg) {
		this.bkgSocFlg = bkgSocFlg;
	}
	
	/**
	 * Column Info
	 * @param bkgPolInpTermCd
	 */
	public void setBkgPolInpTermCd(String bkgPolInpTermCd) {
		this.bkgPolInpTermCd = bkgPolInpTermCd;
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
	 * @param loclChgInpTermCd
	 */
	public void setLoclChgInpTermCd(String loclChgInpTermCd) {
		this.loclChgInpTermCd = loclChgInpTermCd;
	}
	
	/**
	 * Column Info
	 * @param bkgPorInpTermCd
	 */
	public void setBkgPorInpTermCd(String bkgPorInpTermCd) {
		this.bkgPorInpTermCd = bkgPorInpTermCd;
	}
	
	/**
	 * Column Info
	 * @param vslInpTermCd
	 */
	public void setVslInpTermCd(String vslInpTermCd) {
		this.vslInpTermCd = vslInpTermCd;
	}
	
	/**
	 * Column Info
	 * @param acTpCd
	 */
	public void setAcTpCd(String acTpCd) {
		this.acTpCd = acTpCd;
	}
	
	/**
	 * Column Info
	 * @param commPayTermCd
	 */
	public void setCommPayTermCd(String commPayTermCd) {
		this.commPayTermCd = commPayTermCd;
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
	 * @param bkgN3rdInpTermCd
	 */
	public void setBkgN3rdInpTermCd(String bkgN3rdInpTermCd) {
		this.bkgN3rdInpTermCd = bkgN3rdInpTermCd;
	}
	
	/**
	 * Column Info
	 * @param bkgPodInpTermCd
	 */
	public void setBkgPodInpTermCd(String bkgPodInpTermCd) {
		this.bkgPodInpTermCd = bkgPodInpTermCd;
	}
	
	/**
	 * Column Info
	 * @param fxCommAmt
	 */
	public void setFxCommAmt(String fxCommAmt) {
		this.fxCommAmt = fxCommAmt;
	}
	
	/**
	 * Column Info
	 * @param fdrgDdctOrgFlg
	 */
	public void setFdrgDdctOrgFlg(String fdrgDdctOrgFlg) {
		this.fdrgDdctOrgFlg = fdrgDdctOrgFlg;
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
	 * @param commStndCostCd
	 */
	public void setCommStndCostCd(String commStndCostCd) {
		this.commStndCostCd = commStndCostCd;
	}
	
	/**
	 * Column Info
	 * @param bkgCltInpTermCd
	 */
	public void setBkgCltInpTermCd(String bkgCltInpTermCd) {
		this.bkgCltInpTermCd = bkgCltInpTermCd;
	}
	
	/**
	 * Column Info
	 * @param fdrgDdctDestFlg
	 */
	public void setFdrgDdctDestFlg(String fdrgDdctDestFlg) {
		this.fdrgDdctDestFlg = fdrgDdctDestFlg;
	}
	
	/**
	 * Column Info
	 * @param laneInpTermCd
	 */
	public void setLaneInpTermCd(String laneInpTermCd) {
		this.laneInpTermCd = laneInpTermCd;
	}
	
	/**
	 * Column Info
	 * @param slsOfcInpTermCd
	 */
	public void setSlsOfcInpTermCd(String slsOfcInpTermCd) {
		this.slsOfcInpTermCd = slsOfcInpTermCd;
	}
	
	/**
	 * Column Info
	 * @param bkgDblFlg
	 */
	public void setBkgDblFlg(String bkgDblFlg) {
		this.bkgDblFlg = bkgDblFlg;
	}
	
	/**
	 * Column Info
	 * @param scInpTermCd
	 */
	public void setScInpTermCd(String scInpTermCd) {
		this.scInpTermCd = scInpTermCd;
	}
	
	/**
	 * Column Info
	 * @param custInpTermCd
	 */
	public void setCustInpTermCd(String custInpTermCd) {
		this.custInpTermCd = custInpTermCd;
	}
	
	/**
	 * Column Info
	 * @param rfaInpTermCd
	 */
	public void setRfaInpTermCd(String rfaInpTermCd) {
		this.rfaInpTermCd = rfaInpTermCd;
	}
	
	/**
	 * Column Info
	 * @param ioBndCd
	 */
	public void setIoBndCd(String ioBndCd) {
		this.ioBndCd = ioBndCd;
	}
	
	/**
	 * Column Info
	 * @param chgDdctInpCd
	 */
	public void setChgDdctInpCd(String chgDdctInpCd) {
		this.chgDdctInpCd = chgDdctInpCd;
	}
	
	/**
	 * Column Info
	 * @param hlgDdctOrgFlg
	 */
	public void setHlgDdctOrgFlg(String hlgDdctOrgFlg) {
		this.hlgDdctOrgFlg = hlgDdctOrgFlg;
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
	 * @param bkgDelInpTermCd
	 */
	public void setBkgDelInpTermCd(String bkgDelInpTermCd) {
		this.bkgDelInpTermCd = bkgDelInpTermCd;
	}
	
	/**
	 * Column Info
	 * @param agnAgmtVerSeq
	 */
	public void setAgnAgmtVerSeq(String agnAgmtVerSeq) {
		this.agnAgmtVerSeq = agnAgmtVerSeq;
	}
	
	/**
	 * Column Info
	 * @param bkgCommRt
	 */
	public void setBkgCommRt(String bkgCommRt) {
		this.bkgCommRt = bkgCommRt;
	}
	
	/**
	 * Column Info
	 * @param rfaOfcInpCd
	 */
	public void setRfaOfcInpCd(String rfaOfcInpCd) {
		this.rfaOfcInpCd = rfaOfcInpCd;
	}
	
	/**
	 * Column Info
	 * @param vndrSeq
	 */
	public void setVndrSeq(String vndrSeq) {
		this.vndrSeq = vndrSeq;
	}
	
	/**
	 * Column Info
	 * @param agmtOfcCtyCd
	 */
	public void setAgmtOfcCtyCd(String agmtOfcCtyCd) {
		this.agmtOfcCtyCd = agmtOfcCtyCd;
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
	 * @param hlgDdctDestFlg
	 */
	public void setHlgDdctDestFlg(String hlgDdctDestFlg) {
		this.hlgDdctDestFlg = hlgDdctDestFlg;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setVndrCntCd(JSPUtil.getParameter(request, "vndr_cnt_cd", ""));
		setCntrInpTermCd(JSPUtil.getParameter(request, "cntr_inp_term_cd", ""));
		setCurrCd(JSPUtil.getParameter(request, "curr_cd", ""));
		setAgnSeq(JSPUtil.getParameter(request, "agn_seq", ""));
		setBkgOfcInpTermCd(JSPUtil.getParameter(request, "bkg_ofc_inp_term_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setScOfcInpCd(JSPUtil.getParameter(request, "sc_ofc_inp_cd", ""));
		setAgmtOfcCd(JSPUtil.getParameter(request, "agmt_ofc_cd", ""));
		setArOfcTermCd(JSPUtil.getParameter(request, "ar_ofc_term_cd", ""));
		setGrsNetDivCd(JSPUtil.getParameter(request, "grs_net_div_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setBkgPpdInpTermCd(JSPUtil.getParameter(request, "bkg_ppd_inp_term_cd", ""));
		setAgnAgmtSeq(JSPUtil.getParameter(request, "agn_agmt_seq", ""));
		setBkgSocFlg(JSPUtil.getParameter(request, "bkg_soc_flg", ""));
		setBkgPolInpTermCd(JSPUtil.getParameter(request, "bkg_pol_inp_term_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setLoclChgInpTermCd(JSPUtil.getParameter(request, "locl_chg_inp_term_cd", ""));
		setBkgPorInpTermCd(JSPUtil.getParameter(request, "bkg_por_inp_term_cd", ""));
		setVslInpTermCd(JSPUtil.getParameter(request, "vsl_inp_term_cd", ""));
		setAcTpCd(JSPUtil.getParameter(request, "ac_tp_cd", ""));
		setCommPayTermCd(JSPUtil.getParameter(request, "comm_pay_term_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setBkgN3rdInpTermCd(JSPUtil.getParameter(request, "bkg_n3rd_inp_term_cd", ""));
		setBkgPodInpTermCd(JSPUtil.getParameter(request, "bkg_pod_inp_term_cd", ""));
		setFxCommAmt(JSPUtil.getParameter(request, "fx_comm_amt", ""));
		setFdrgDdctOrgFlg(JSPUtil.getParameter(request, "fdrg_ddct_org_flg", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCommStndCostCd(JSPUtil.getParameter(request, "comm_stnd_cost_cd", ""));
		setBkgCltInpTermCd(JSPUtil.getParameter(request, "bkg_clt_inp_term_cd", ""));
		setFdrgDdctDestFlg(JSPUtil.getParameter(request, "fdrg_ddct_dest_flg", ""));
		setLaneInpTermCd(JSPUtil.getParameter(request, "lane_inp_term_cd", ""));
		setSlsOfcInpTermCd(JSPUtil.getParameter(request, "sls_ofc_inp_term_cd", ""));
		setBkgDblFlg(JSPUtil.getParameter(request, "bkg_dbl_flg", ""));
		setScInpTermCd(JSPUtil.getParameter(request, "sc_inp_term_cd", ""));
		setCustInpTermCd(JSPUtil.getParameter(request, "cust_inp_term_cd", ""));
		setRfaInpTermCd(JSPUtil.getParameter(request, "rfa_inp_term_cd", ""));
		setIoBndCd(JSPUtil.getParameter(request, "io_bnd_cd", ""));
		setChgDdctInpCd(JSPUtil.getParameter(request, "chg_ddct_inp_cd", ""));
		setHlgDdctOrgFlg(JSPUtil.getParameter(request, "hlg_ddct_org_flg", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setBkgDelInpTermCd(JSPUtil.getParameter(request, "bkg_del_inp_term_cd", ""));
		setAgnAgmtVerSeq(JSPUtil.getParameter(request, "agn_agmt_ver_seq", ""));
		setBkgCommRt(JSPUtil.getParameter(request, "bkg_comm_rt", ""));
		setRfaOfcInpCd(JSPUtil.getParameter(request, "rfa_ofc_inp_cd", ""));
		setVndrSeq(JSPUtil.getParameter(request, "vndr_seq", ""));
		setAgmtOfcCtyCd(JSPUtil.getParameter(request, "agmt_ofc_cty_cd", ""));
		setFullMtyCd(JSPUtil.getParameter(request, "full_mty_cd", ""));
		setHlgDdctDestFlg(JSPUtil.getParameter(request, "hlg_ddct_dest_flg", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return AgtAgnAgmtRtVO[]
	 */
	public AgtAgnAgmtRtVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return AgtAgnAgmtRtVO[]
	 */
	public AgtAgnAgmtRtVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		AgtAgnAgmtRtVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] vndrCntCd = (JSPUtil.getParameter(request, prefix	+ "vndr_cnt_cd", length));
			String[] cntrInpTermCd = (JSPUtil.getParameter(request, prefix	+ "cntr_inp_term_cd", length));
			String[] currCd = (JSPUtil.getParameter(request, prefix	+ "curr_cd", length));
			String[] agnSeq = (JSPUtil.getParameter(request, prefix	+ "agn_seq", length));
			String[] bkgOfcInpTermCd = (JSPUtil.getParameter(request, prefix	+ "bkg_ofc_inp_term_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] scOfcInpCd = (JSPUtil.getParameter(request, prefix	+ "sc_ofc_inp_cd", length));
			String[] agmtOfcCd = (JSPUtil.getParameter(request, prefix	+ "agmt_ofc_cd", length));
			String[] arOfcTermCd = (JSPUtil.getParameter(request, prefix	+ "ar_ofc_term_cd", length));
			String[] grsNetDivCd = (JSPUtil.getParameter(request, prefix	+ "grs_net_div_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] bkgPpdInpTermCd = (JSPUtil.getParameter(request, prefix	+ "bkg_ppd_inp_term_cd", length));
			String[] agnAgmtSeq = (JSPUtil.getParameter(request, prefix	+ "agn_agmt_seq", length));
			String[] bkgSocFlg = (JSPUtil.getParameter(request, prefix	+ "bkg_soc_flg", length));
			String[] bkgPolInpTermCd = (JSPUtil.getParameter(request, prefix	+ "bkg_pol_inp_term_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] loclChgInpTermCd = (JSPUtil.getParameter(request, prefix	+ "locl_chg_inp_term_cd", length));
			String[] bkgPorInpTermCd = (JSPUtil.getParameter(request, prefix	+ "bkg_por_inp_term_cd", length));
			String[] vslInpTermCd = (JSPUtil.getParameter(request, prefix	+ "vsl_inp_term_cd", length));
			String[] acTpCd = (JSPUtil.getParameter(request, prefix	+ "ac_tp_cd", length));
			String[] commPayTermCd = (JSPUtil.getParameter(request, prefix	+ "comm_pay_term_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] bkgN3rdInpTermCd = (JSPUtil.getParameter(request, prefix	+ "bkg_n3rd_inp_term_cd", length));
			String[] bkgPodInpTermCd = (JSPUtil.getParameter(request, prefix	+ "bkg_pod_inp_term_cd", length));
			String[] fxCommAmt = (JSPUtil.getParameter(request, prefix	+ "fx_comm_amt", length));
			String[] fdrgDdctOrgFlg = (JSPUtil.getParameter(request, prefix	+ "fdrg_ddct_org_flg", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] commStndCostCd = (JSPUtil.getParameter(request, prefix	+ "comm_stnd_cost_cd", length));
			String[] bkgCltInpTermCd = (JSPUtil.getParameter(request, prefix	+ "bkg_clt_inp_term_cd", length));
			String[] fdrgDdctDestFlg = (JSPUtil.getParameter(request, prefix	+ "fdrg_ddct_dest_flg", length));
			String[] laneInpTermCd = (JSPUtil.getParameter(request, prefix	+ "lane_inp_term_cd", length));
			String[] slsOfcInpTermCd = (JSPUtil.getParameter(request, prefix	+ "sls_ofc_inp_term_cd", length));
			String[] bkgDblFlg = (JSPUtil.getParameter(request, prefix	+ "bkg_dbl_flg", length));
			String[] scInpTermCd = (JSPUtil.getParameter(request, prefix	+ "sc_inp_term_cd", length));
			String[] custInpTermCd = (JSPUtil.getParameter(request, prefix	+ "cust_inp_term_cd", length));
			String[] rfaInpTermCd = (JSPUtil.getParameter(request, prefix	+ "rfa_inp_term_cd", length));
			String[] ioBndCd = (JSPUtil.getParameter(request, prefix	+ "io_bnd_cd", length));
			String[] chgDdctInpCd = (JSPUtil.getParameter(request, prefix	+ "chg_ddct_inp_cd", length));
			String[] hlgDdctOrgFlg = (JSPUtil.getParameter(request, prefix	+ "hlg_ddct_org_flg", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] bkgDelInpTermCd = (JSPUtil.getParameter(request, prefix	+ "bkg_del_inp_term_cd", length));
			String[] agnAgmtVerSeq = (JSPUtil.getParameter(request, prefix	+ "agn_agmt_ver_seq", length));
			String[] bkgCommRt = (JSPUtil.getParameter(request, prefix	+ "bkg_comm_rt", length));
			String[] rfaOfcInpCd = (JSPUtil.getParameter(request, prefix	+ "rfa_ofc_inp_cd", length));
			String[] vndrSeq = (JSPUtil.getParameter(request, prefix	+ "vndr_seq", length));
			String[] agmtOfcCtyCd = (JSPUtil.getParameter(request, prefix	+ "agmt_ofc_cty_cd", length));
			String[] fullMtyCd = (JSPUtil.getParameter(request, prefix	+ "full_mty_cd", length));
			String[] hlgDdctDestFlg = (JSPUtil.getParameter(request, prefix	+ "hlg_ddct_dest_flg", length));
			
			for (int i = 0; i < length; i++) {
				model = new AgtAgnAgmtRtVO();
				if (vndrCntCd[i] != null)
					model.setVndrCntCd(vndrCntCd[i]);
				if (cntrInpTermCd[i] != null)
					model.setCntrInpTermCd(cntrInpTermCd[i]);
				if (currCd[i] != null)
					model.setCurrCd(currCd[i]);
				if (agnSeq[i] != null)
					model.setAgnSeq(agnSeq[i]);
				if (bkgOfcInpTermCd[i] != null)
					model.setBkgOfcInpTermCd(bkgOfcInpTermCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (scOfcInpCd[i] != null)
					model.setScOfcInpCd(scOfcInpCd[i]);
				if (agmtOfcCd[i] != null)
					model.setAgmtOfcCd(agmtOfcCd[i]);
				if (arOfcTermCd[i] != null)
					model.setArOfcTermCd(arOfcTermCd[i]);
				if (grsNetDivCd[i] != null)
					model.setGrsNetDivCd(grsNetDivCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (bkgPpdInpTermCd[i] != null)
					model.setBkgPpdInpTermCd(bkgPpdInpTermCd[i]);
				if (agnAgmtSeq[i] != null)
					model.setAgnAgmtSeq(agnAgmtSeq[i]);
				if (bkgSocFlg[i] != null)
					model.setBkgSocFlg(bkgSocFlg[i]);
				if (bkgPolInpTermCd[i] != null)
					model.setBkgPolInpTermCd(bkgPolInpTermCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (loclChgInpTermCd[i] != null)
					model.setLoclChgInpTermCd(loclChgInpTermCd[i]);
				if (bkgPorInpTermCd[i] != null)
					model.setBkgPorInpTermCd(bkgPorInpTermCd[i]);
				if (vslInpTermCd[i] != null)
					model.setVslInpTermCd(vslInpTermCd[i]);
				if (acTpCd[i] != null)
					model.setAcTpCd(acTpCd[i]);
				if (commPayTermCd[i] != null)
					model.setCommPayTermCd(commPayTermCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (bkgN3rdInpTermCd[i] != null)
					model.setBkgN3rdInpTermCd(bkgN3rdInpTermCd[i]);
				if (bkgPodInpTermCd[i] != null)
					model.setBkgPodInpTermCd(bkgPodInpTermCd[i]);
				if (fxCommAmt[i] != null)
					model.setFxCommAmt(fxCommAmt[i]);
				if (fdrgDdctOrgFlg[i] != null)
					model.setFdrgDdctOrgFlg(fdrgDdctOrgFlg[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (commStndCostCd[i] != null)
					model.setCommStndCostCd(commStndCostCd[i]);
				if (bkgCltInpTermCd[i] != null)
					model.setBkgCltInpTermCd(bkgCltInpTermCd[i]);
				if (fdrgDdctDestFlg[i] != null)
					model.setFdrgDdctDestFlg(fdrgDdctDestFlg[i]);
				if (laneInpTermCd[i] != null)
					model.setLaneInpTermCd(laneInpTermCd[i]);
				if (slsOfcInpTermCd[i] != null)
					model.setSlsOfcInpTermCd(slsOfcInpTermCd[i]);
				if (bkgDblFlg[i] != null)
					model.setBkgDblFlg(bkgDblFlg[i]);
				if (scInpTermCd[i] != null)
					model.setScInpTermCd(scInpTermCd[i]);
				if (custInpTermCd[i] != null)
					model.setCustInpTermCd(custInpTermCd[i]);
				if (rfaInpTermCd[i] != null)
					model.setRfaInpTermCd(rfaInpTermCd[i]);
				if (ioBndCd[i] != null)
					model.setIoBndCd(ioBndCd[i]);
				if (chgDdctInpCd[i] != null)
					model.setChgDdctInpCd(chgDdctInpCd[i]);
				if (hlgDdctOrgFlg[i] != null)
					model.setHlgDdctOrgFlg(hlgDdctOrgFlg[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (bkgDelInpTermCd[i] != null)
					model.setBkgDelInpTermCd(bkgDelInpTermCd[i]);
				if (agnAgmtVerSeq[i] != null)
					model.setAgnAgmtVerSeq(agnAgmtVerSeq[i]);
				if (bkgCommRt[i] != null)
					model.setBkgCommRt(bkgCommRt[i]);
				if (rfaOfcInpCd[i] != null)
					model.setRfaOfcInpCd(rfaOfcInpCd[i]);
				if (vndrSeq[i] != null)
					model.setVndrSeq(vndrSeq[i]);
				if (agmtOfcCtyCd[i] != null)
					model.setAgmtOfcCtyCd(agmtOfcCtyCd[i]);
				if (fullMtyCd[i] != null)
					model.setFullMtyCd(fullMtyCd[i]);
				if (hlgDdctDestFlg[i] != null)
					model.setHlgDdctDestFlg(hlgDdctDestFlg[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getAgtAgnAgmtRtVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return AgtAgnAgmtRtVO[]
	 */
	public AgtAgnAgmtRtVO[] getAgtAgnAgmtRtVOs(){
		AgtAgnAgmtRtVO[] vos = (AgtAgnAgmtRtVO[])models.toArray(new AgtAgnAgmtRtVO[models.size()]);
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
		this.vndrCntCd = this.vndrCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrInpTermCd = this.cntrInpTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.currCd = this.currCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agnSeq = this.agnSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgOfcInpTermCd = this.bkgOfcInpTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.scOfcInpCd = this.scOfcInpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtOfcCd = this.agmtOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arOfcTermCd = this.arOfcTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.grsNetDivCd = this.grsNetDivCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgPpdInpTermCd = this.bkgPpdInpTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agnAgmtSeq = this.agnAgmtSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgSocFlg = this.bkgSocFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgPolInpTermCd = this.bkgPolInpTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.loclChgInpTermCd = this.loclChgInpTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgPorInpTermCd = this.bkgPorInpTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslInpTermCd = this.vslInpTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acTpCd = this.acTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.commPayTermCd = this.commPayTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgN3rdInpTermCd = this.bkgN3rdInpTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgPodInpTermCd = this.bkgPodInpTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fxCommAmt = this.fxCommAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fdrgDdctOrgFlg = this.fdrgDdctOrgFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.commStndCostCd = this.commStndCostCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgCltInpTermCd = this.bkgCltInpTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fdrgDdctDestFlg = this.fdrgDdctDestFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.laneInpTermCd = this.laneInpTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slsOfcInpTermCd = this.slsOfcInpTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgDblFlg = this.bkgDblFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.scInpTermCd = this.scInpTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custInpTermCd = this.custInpTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rfaInpTermCd = this.rfaInpTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ioBndCd = this.ioBndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chgDdctInpCd = this.chgDdctInpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hlgDdctOrgFlg = this.hlgDdctOrgFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgDelInpTermCd = this.bkgDelInpTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agnAgmtVerSeq = this.agnAgmtVerSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgCommRt = this.bkgCommRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rfaOfcInpCd = this.rfaOfcInpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrSeq = this.vndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtOfcCtyCd = this.agmtOfcCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fullMtyCd = this.fullMtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hlgDdctDestFlg = this.hlgDdctDestFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
