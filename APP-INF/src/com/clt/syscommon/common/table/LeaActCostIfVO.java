/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : LeaActCostIfVO.java
*@FileTitle : LeaActCostIfVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.08.06
*@LastModifier : 전재홍
*@LastVersion : 1.0
* 2009.08.06 전재홍 
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
 * @author 전재홍
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class LeaActCostIfVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<LeaActCostIfVO> models = new ArrayList<LeaActCostIfVO>();
	
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String actCostMapgCd2 = null;
	/* Column Info */
	private String repAcctCd = null;
	/* Column Info */
	private String glDt = null;
	/* Column Info */
	private String invVndrSeq = null;
	/* Column Info */
	private String invCalcAutoCd = null;
	/* Column Info */
	private String copNo = null;
	/* Column Info */
	private String ifSeq = null;
	/* Column Info */
	private String tmlInvTpCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String bkupInterCostCd = null;
	/* Column Info */
	private String cntrTpszCd = null;
	/* Column Info */
	private String trspSoTpCd = null;
	/* Column Info */
	private String csrTpCd = null;
	/* Column Info */
	private String csrNo = null;
	/* Column Info */
	private String revYrmon = null;
	/* Column Info */
	private String exeYrmon = null;
	/* Column Info */
	private String loclCurrCd = null;
	/* Column Info */
	private String n2ndNodCd = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String errCsrNo = null;
	/* Column Info */
	private String invCxlFlg = null;
	/* Column Info */
	private String copCntrNo = null;
	/* Column Info */
	private String costActGrpCd = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String n4thNodCd = null;
	/* Column Info */
	private String ttlInvKnt = null;
	/* Column Info */
	private String invCxlDt = null;
	/* Column Info */
	private String actCostMapgCd = null;
	/* Column Info */
	private String n1stNodCd = null;
	/* Column Info */
	private String n2ndThrpInclCostCd = null;
	/* Column Info */
	private String newRevYrmon = null;
	/* Column Info */
	private String n3rdThrpInclCostCd = null;
	/* Column Info */
	private String actVvdCd = null;
	/* Column Info */
	private String rvisBkgFlg = null;
	/* Column Info */
	private String n3rdNodCd = null;
	/* Column Info */
	private String uplnSoFlg = null;
	/* Column Info */
	private String coaCostSrcCd = null;
	/* Column Info */
	private String soSeq = null;
	/* Column Info */
	private String usdCostAmt = null;
	/* Column Info */
	private String invSysId = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String revVvdCngFlg = null;
	/* Column Info */
	private String tmlCalcIndCd = null;
	/* Column Info */
	private String revDirCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String n1stThrpInclCostCd = null;
	/* Column Info */
	private String otrCrrFlg = null;
	/* Column Info */
	private String cntrMapgExptLog = null;
	/* Column Info */
	private String acctCd = null;
	/* Column Info */
	private String costActGrpTpCd = null;
	/* Column Info */
	private String rvisBkgNo = null;
	/* Column Info */
	private String errVvdAplyFlg = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String newBkgNo = null;
	/* Column Info */
	private String soOfcCtyCd = null;
	/* Column Info */
	private String bkupInterAcctCd = null;
	/* Column Info */
	private String batStDt = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Column Info */
	private String invNo = null;
	/* Column Info */
	private String costActGrpSeq = null;
	/* Column Info */
	private String cntrNo = null;
	/* Column Info */
	private String interPrcAplyFlg = null;
	/* Column Info */
	private String loclCostAmt = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public LeaActCostIfVO() {}

	public LeaActCostIfVO(String ibflag, String pagerows, String exeYrmon, String invSysId, String ifSeq, String coaCostSrcCd, String glDt, String revYrmon, String vslCd, String skdVoyNo, String skdDirCd, String revDirCd, String actVvdCd, String bkgNo, String cntrNo, String cntrTpszCd, String costActGrpCd, String costActGrpSeq, String loclCurrCd, String loclCostAmt, String usdCostAmt, String repAcctCd, String acctCd, String otrCrrFlg, String n1stThrpInclCostCd, String n2ndThrpInclCostCd, String n3rdThrpInclCostCd, String csrNo, String csrTpCd, String ttlInvKnt, String invNo, String invVndrSeq, String invCxlFlg, String invCxlDt, String tmlInvTpCd, String tmlCalcIndCd, String copNo, String costActGrpTpCd, String n1stNodCd, String n2ndNodCd, String n3rdNodCd, String n4thNodCd, String errVvdAplyFlg, String actCostMapgCd, String creDt, String batStDt, String interPrcAplyFlg, String bkupInterCostCd, String bkupInterAcctCd, String cntrMapgExptLog, String updDt, String revVvdCngFlg, String errCsrNo, String soOfcCtyCd, String soSeq, String trspSoTpCd, String actCostMapgCd2, String invCalcAutoCd, String rvisBkgNo, String rvisBkgFlg, String copCntrNo, String newRevYrmon, String newBkgNo, String uplnSoFlg) {
		this.vslCd = vslCd;
		this.actCostMapgCd2 = actCostMapgCd2;
		this.repAcctCd = repAcctCd;
		this.glDt = glDt;
		this.invVndrSeq = invVndrSeq;
		this.invCalcAutoCd = invCalcAutoCd;
		this.copNo = copNo;
		this.ifSeq = ifSeq;
		this.tmlInvTpCd = tmlInvTpCd;
		this.pagerows = pagerows;
		this.bkupInterCostCd = bkupInterCostCd;
		this.cntrTpszCd = cntrTpszCd;
		this.trspSoTpCd = trspSoTpCd;
		this.csrTpCd = csrTpCd;
		this.csrNo = csrNo;
		this.revYrmon = revYrmon;
		this.exeYrmon = exeYrmon;
		this.loclCurrCd = loclCurrCd;
		this.n2ndNodCd = n2ndNodCd;
		this.skdVoyNo = skdVoyNo;
		this.errCsrNo = errCsrNo;
		this.invCxlFlg = invCxlFlg;
		this.copCntrNo = copCntrNo;
		this.costActGrpCd = costActGrpCd;
		this.bkgNo = bkgNo;
		this.n4thNodCd = n4thNodCd;
		this.ttlInvKnt = ttlInvKnt;
		this.invCxlDt = invCxlDt;
		this.actCostMapgCd = actCostMapgCd;
		this.n1stNodCd = n1stNodCd;
		this.n2ndThrpInclCostCd = n2ndThrpInclCostCd;
		this.newRevYrmon = newRevYrmon;
		this.n3rdThrpInclCostCd = n3rdThrpInclCostCd;
		this.actVvdCd = actVvdCd;
		this.rvisBkgFlg = rvisBkgFlg;
		this.n3rdNodCd = n3rdNodCd;
		this.uplnSoFlg = uplnSoFlg;
		this.coaCostSrcCd = coaCostSrcCd;
		this.soSeq = soSeq;
		this.usdCostAmt = usdCostAmt;
		this.invSysId = invSysId;
		this.creDt = creDt;
		this.revVvdCngFlg = revVvdCngFlg;
		this.tmlCalcIndCd = tmlCalcIndCd;
		this.revDirCd = revDirCd;
		this.ibflag = ibflag;
		this.n1stThrpInclCostCd = n1stThrpInclCostCd;
		this.otrCrrFlg = otrCrrFlg;
		this.cntrMapgExptLog = cntrMapgExptLog;
		this.acctCd = acctCd;
		this.costActGrpTpCd = costActGrpTpCd;
		this.rvisBkgNo = rvisBkgNo;
		this.errVvdAplyFlg = errVvdAplyFlg;
		this.updDt = updDt;
		this.newBkgNo = newBkgNo;
		this.soOfcCtyCd = soOfcCtyCd;
		this.bkupInterAcctCd = bkupInterAcctCd;
		this.batStDt = batStDt;
		this.skdDirCd = skdDirCd;
		this.invNo = invNo;
		this.costActGrpSeq = costActGrpSeq;
		this.cntrNo = cntrNo;
		this.interPrcAplyFlg = interPrcAplyFlg;
		this.loclCostAmt = loclCostAmt;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("act_cost_mapg_cd2", getActCostMapgCd2());
		this.hashColumns.put("rep_acct_cd", getRepAcctCd());
		this.hashColumns.put("gl_dt", getGlDt());
		this.hashColumns.put("inv_vndr_seq", getInvVndrSeq());
		this.hashColumns.put("inv_calc_auto_cd", getInvCalcAutoCd());
		this.hashColumns.put("cop_no", getCopNo());
		this.hashColumns.put("if_seq", getIfSeq());
		this.hashColumns.put("tml_inv_tp_cd", getTmlInvTpCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("bkup_inter_cost_cd", getBkupInterCostCd());
		this.hashColumns.put("cntr_tpsz_cd", getCntrTpszCd());
		this.hashColumns.put("trsp_so_tp_cd", getTrspSoTpCd());
		this.hashColumns.put("csr_tp_cd", getCsrTpCd());
		this.hashColumns.put("csr_no", getCsrNo());
		this.hashColumns.put("rev_yrmon", getRevYrmon());
		this.hashColumns.put("exe_yrmon", getExeYrmon());
		this.hashColumns.put("locl_curr_cd", getLoclCurrCd());
		this.hashColumns.put("n2nd_nod_cd", getN2ndNodCd());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("err_csr_no", getErrCsrNo());
		this.hashColumns.put("inv_cxl_flg", getInvCxlFlg());
		this.hashColumns.put("cop_cntr_no", getCopCntrNo());
		this.hashColumns.put("cost_act_grp_cd", getCostActGrpCd());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("n4th_nod_cd", getN4thNodCd());
		this.hashColumns.put("ttl_inv_knt", getTtlInvKnt());
		this.hashColumns.put("inv_cxl_dt", getInvCxlDt());
		this.hashColumns.put("act_cost_mapg_cd", getActCostMapgCd());
		this.hashColumns.put("n1st_nod_cd", getN1stNodCd());
		this.hashColumns.put("n2nd_thrp_incl_cost_cd", getN2ndThrpInclCostCd());
		this.hashColumns.put("new_rev_yrmon", getNewRevYrmon());
		this.hashColumns.put("n3rd_thrp_incl_cost_cd", getN3rdThrpInclCostCd());
		this.hashColumns.put("act_vvd_cd", getActVvdCd());
		this.hashColumns.put("rvis_bkg_flg", getRvisBkgFlg());
		this.hashColumns.put("n3rd_nod_cd", getN3rdNodCd());
		this.hashColumns.put("upln_so_flg", getUplnSoFlg());
		this.hashColumns.put("coa_cost_src_cd", getCoaCostSrcCd());
		this.hashColumns.put("so_seq", getSoSeq());
		this.hashColumns.put("usd_cost_amt", getUsdCostAmt());
		this.hashColumns.put("inv_sys_id", getInvSysId());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("rev_vvd_cng_flg", getRevVvdCngFlg());
		this.hashColumns.put("tml_calc_ind_cd", getTmlCalcIndCd());
		this.hashColumns.put("rev_dir_cd", getRevDirCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("n1st_thrp_incl_cost_cd", getN1stThrpInclCostCd());
		this.hashColumns.put("otr_crr_flg", getOtrCrrFlg());
		this.hashColumns.put("cntr_mapg_expt_log", getCntrMapgExptLog());
		this.hashColumns.put("acct_cd", getAcctCd());
		this.hashColumns.put("cost_act_grp_tp_cd", getCostActGrpTpCd());
		this.hashColumns.put("rvis_bkg_no", getRvisBkgNo());
		this.hashColumns.put("err_vvd_aply_flg", getErrVvdAplyFlg());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("new_bkg_no", getNewBkgNo());
		this.hashColumns.put("so_ofc_cty_cd", getSoOfcCtyCd());
		this.hashColumns.put("bkup_inter_acct_cd", getBkupInterAcctCd());
		this.hashColumns.put("bat_st_dt", getBatStDt());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("inv_no", getInvNo());
		this.hashColumns.put("cost_act_grp_seq", getCostActGrpSeq());
		this.hashColumns.put("cntr_no", getCntrNo());
		this.hashColumns.put("inter_prc_aply_flg", getInterPrcAplyFlg());
		this.hashColumns.put("locl_cost_amt", getLoclCostAmt());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("act_cost_mapg_cd2", "actCostMapgCd2");
		this.hashFields.put("rep_acct_cd", "repAcctCd");
		this.hashFields.put("gl_dt", "glDt");
		this.hashFields.put("inv_vndr_seq", "invVndrSeq");
		this.hashFields.put("inv_calc_auto_cd", "invCalcAutoCd");
		this.hashFields.put("cop_no", "copNo");
		this.hashFields.put("if_seq", "ifSeq");
		this.hashFields.put("tml_inv_tp_cd", "tmlInvTpCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("bkup_inter_cost_cd", "bkupInterCostCd");
		this.hashFields.put("cntr_tpsz_cd", "cntrTpszCd");
		this.hashFields.put("trsp_so_tp_cd", "trspSoTpCd");
		this.hashFields.put("csr_tp_cd", "csrTpCd");
		this.hashFields.put("csr_no", "csrNo");
		this.hashFields.put("rev_yrmon", "revYrmon");
		this.hashFields.put("exe_yrmon", "exeYrmon");
		this.hashFields.put("locl_curr_cd", "loclCurrCd");
		this.hashFields.put("n2nd_nod_cd", "n2ndNodCd");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("err_csr_no", "errCsrNo");
		this.hashFields.put("inv_cxl_flg", "invCxlFlg");
		this.hashFields.put("cop_cntr_no", "copCntrNo");
		this.hashFields.put("cost_act_grp_cd", "costActGrpCd");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("n4th_nod_cd", "n4thNodCd");
		this.hashFields.put("ttl_inv_knt", "ttlInvKnt");
		this.hashFields.put("inv_cxl_dt", "invCxlDt");
		this.hashFields.put("act_cost_mapg_cd", "actCostMapgCd");
		this.hashFields.put("n1st_nod_cd", "n1stNodCd");
		this.hashFields.put("n2nd_thrp_incl_cost_cd", "n2ndThrpInclCostCd");
		this.hashFields.put("new_rev_yrmon", "newRevYrmon");
		this.hashFields.put("n3rd_thrp_incl_cost_cd", "n3rdThrpInclCostCd");
		this.hashFields.put("act_vvd_cd", "actVvdCd");
		this.hashFields.put("rvis_bkg_flg", "rvisBkgFlg");
		this.hashFields.put("n3rd_nod_cd", "n3rdNodCd");
		this.hashFields.put("upln_so_flg", "uplnSoFlg");
		this.hashFields.put("coa_cost_src_cd", "coaCostSrcCd");
		this.hashFields.put("so_seq", "soSeq");
		this.hashFields.put("usd_cost_amt", "usdCostAmt");
		this.hashFields.put("inv_sys_id", "invSysId");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("rev_vvd_cng_flg", "revVvdCngFlg");
		this.hashFields.put("tml_calc_ind_cd", "tmlCalcIndCd");
		this.hashFields.put("rev_dir_cd", "revDirCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("n1st_thrp_incl_cost_cd", "n1stThrpInclCostCd");
		this.hashFields.put("otr_crr_flg", "otrCrrFlg");
		this.hashFields.put("cntr_mapg_expt_log", "cntrMapgExptLog");
		this.hashFields.put("acct_cd", "acctCd");
		this.hashFields.put("cost_act_grp_tp_cd", "costActGrpTpCd");
		this.hashFields.put("rvis_bkg_no", "rvisBkgNo");
		this.hashFields.put("err_vvd_aply_flg", "errVvdAplyFlg");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("new_bkg_no", "newBkgNo");
		this.hashFields.put("so_ofc_cty_cd", "soOfcCtyCd");
		this.hashFields.put("bkup_inter_acct_cd", "bkupInterAcctCd");
		this.hashFields.put("bat_st_dt", "batStDt");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("inv_no", "invNo");
		this.hashFields.put("cost_act_grp_seq", "costActGrpSeq");
		this.hashFields.put("cntr_no", "cntrNo");
		this.hashFields.put("inter_prc_aply_flg", "interPrcAplyFlg");
		this.hashFields.put("locl_cost_amt", "loclCostAmt");
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
	 * @return actCostMapgCd2
	 */
	public String getActCostMapgCd2() {
		return this.actCostMapgCd2;
	}
	
	/**
	 * Column Info
	 * @return repAcctCd
	 */
	public String getRepAcctCd() {
		return this.repAcctCd;
	}
	
	/**
	 * Column Info
	 * @return glDt
	 */
	public String getGlDt() {
		return this.glDt;
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
	 * @return invCalcAutoCd
	 */
	public String getInvCalcAutoCd() {
		return this.invCalcAutoCd;
	}
	
	/**
	 * Column Info
	 * @return copNo
	 */
	public String getCopNo() {
		return this.copNo;
	}
	
	/**
	 * Column Info
	 * @return ifSeq
	 */
	public String getIfSeq() {
		return this.ifSeq;
	}
	
	/**
	 * Column Info
	 * @return tmlInvTpCd
	 */
	public String getTmlInvTpCd() {
		return this.tmlInvTpCd;
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
	 * @return bkupInterCostCd
	 */
	public String getBkupInterCostCd() {
		return this.bkupInterCostCd;
	}
	
	/**
	 * Column Info
	 * @return cntrTpszCd
	 */
	public String getCntrTpszCd() {
		return this.cntrTpszCd;
	}
	
	/**
	 * Column Info
	 * @return trspSoTpCd
	 */
	public String getTrspSoTpCd() {
		return this.trspSoTpCd;
	}
	
	/**
	 * Column Info
	 * @return csrTpCd
	 */
	public String getCsrTpCd() {
		return this.csrTpCd;
	}
	
	/**
	 * Column Info
	 * @return csrNo
	 */
	public String getCsrNo() {
		return this.csrNo;
	}
	
	/**
	 * Column Info
	 * @return revYrmon
	 */
	public String getRevYrmon() {
		return this.revYrmon;
	}
	
	/**
	 * Column Info
	 * @return exeYrmon
	 */
	public String getExeYrmon() {
		return this.exeYrmon;
	}
	
	/**
	 * Column Info
	 * @return loclCurrCd
	 */
	public String getLoclCurrCd() {
		return this.loclCurrCd;
	}
	
	/**
	 * Column Info
	 * @return n2ndNodCd
	 */
	public String getN2ndNodCd() {
		return this.n2ndNodCd;
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
	 * @return errCsrNo
	 */
	public String getErrCsrNo() {
		return this.errCsrNo;
	}
	
	/**
	 * Column Info
	 * @return invCxlFlg
	 */
	public String getInvCxlFlg() {
		return this.invCxlFlg;
	}
	
	/**
	 * Column Info
	 * @return copCntrNo
	 */
	public String getCopCntrNo() {
		return this.copCntrNo;
	}
	
	/**
	 * Column Info
	 * @return costActGrpCd
	 */
	public String getCostActGrpCd() {
		return this.costActGrpCd;
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
	 * @return n4thNodCd
	 */
	public String getN4thNodCd() {
		return this.n4thNodCd;
	}
	
	/**
	 * Column Info
	 * @return ttlInvKnt
	 */
	public String getTtlInvKnt() {
		return this.ttlInvKnt;
	}
	
	/**
	 * Column Info
	 * @return invCxlDt
	 */
	public String getInvCxlDt() {
		return this.invCxlDt;
	}
	
	/**
	 * Column Info
	 * @return actCostMapgCd
	 */
	public String getActCostMapgCd() {
		return this.actCostMapgCd;
	}
	
	/**
	 * Column Info
	 * @return n1stNodCd
	 */
	public String getN1stNodCd() {
		return this.n1stNodCd;
	}
	
	/**
	 * Column Info
	 * @return n2ndThrpInclCostCd
	 */
	public String getN2ndThrpInclCostCd() {
		return this.n2ndThrpInclCostCd;
	}
	
	/**
	 * Column Info
	 * @return newRevYrmon
	 */
	public String getNewRevYrmon() {
		return this.newRevYrmon;
	}
	
	/**
	 * Column Info
	 * @return n3rdThrpInclCostCd
	 */
	public String getN3rdThrpInclCostCd() {
		return this.n3rdThrpInclCostCd;
	}
	
	/**
	 * Column Info
	 * @return actVvdCd
	 */
	public String getActVvdCd() {
		return this.actVvdCd;
	}
	
	/**
	 * Column Info
	 * @return rvisBkgFlg
	 */
	public String getRvisBkgFlg() {
		return this.rvisBkgFlg;
	}
	
	/**
	 * Column Info
	 * @return n3rdNodCd
	 */
	public String getN3rdNodCd() {
		return this.n3rdNodCd;
	}
	
	/**
	 * Column Info
	 * @return uplnSoFlg
	 */
	public String getUplnSoFlg() {
		return this.uplnSoFlg;
	}
	
	/**
	 * Column Info
	 * @return coaCostSrcCd
	 */
	public String getCoaCostSrcCd() {
		return this.coaCostSrcCd;
	}
	
	/**
	 * Column Info
	 * @return soSeq
	 */
	public String getSoSeq() {
		return this.soSeq;
	}
	
	/**
	 * Column Info
	 * @return usdCostAmt
	 */
	public String getUsdCostAmt() {
		return this.usdCostAmt;
	}
	
	/**
	 * Column Info
	 * @return invSysId
	 */
	public String getInvSysId() {
		return this.invSysId;
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
	 * @return revVvdCngFlg
	 */
	public String getRevVvdCngFlg() {
		return this.revVvdCngFlg;
	}
	
	/**
	 * Column Info
	 * @return tmlCalcIndCd
	 */
	public String getTmlCalcIndCd() {
		return this.tmlCalcIndCd;
	}
	
	/**
	 * Column Info
	 * @return revDirCd
	 */
	public String getRevDirCd() {
		return this.revDirCd;
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
	 * @return n1stThrpInclCostCd
	 */
	public String getN1stThrpInclCostCd() {
		return this.n1stThrpInclCostCd;
	}
	
	/**
	 * Column Info
	 * @return otrCrrFlg
	 */
	public String getOtrCrrFlg() {
		return this.otrCrrFlg;
	}
	
	/**
	 * Column Info
	 * @return cntrMapgExptLog
	 */
	public String getCntrMapgExptLog() {
		return this.cntrMapgExptLog;
	}
	
	/**
	 * Column Info
	 * @return acctCd
	 */
	public String getAcctCd() {
		return this.acctCd;
	}
	
	/**
	 * Column Info
	 * @return costActGrpTpCd
	 */
	public String getCostActGrpTpCd() {
		return this.costActGrpTpCd;
	}
	
	/**
	 * Column Info
	 * @return rvisBkgNo
	 */
	public String getRvisBkgNo() {
		return this.rvisBkgNo;
	}
	
	/**
	 * Column Info
	 * @return errVvdAplyFlg
	 */
	public String getErrVvdAplyFlg() {
		return this.errVvdAplyFlg;
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
	 * @return newBkgNo
	 */
	public String getNewBkgNo() {
		return this.newBkgNo;
	}
	
	/**
	 * Column Info
	 * @return soOfcCtyCd
	 */
	public String getSoOfcCtyCd() {
		return this.soOfcCtyCd;
	}
	
	/**
	 * Column Info
	 * @return bkupInterAcctCd
	 */
	public String getBkupInterAcctCd() {
		return this.bkupInterAcctCd;
	}
	
	/**
	 * Column Info
	 * @return batStDt
	 */
	public String getBatStDt() {
		return this.batStDt;
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
	 * @return invNo
	 */
	public String getInvNo() {
		return this.invNo;
	}
	
	/**
	 * Column Info
	 * @return costActGrpSeq
	 */
	public String getCostActGrpSeq() {
		return this.costActGrpSeq;
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
	 * @return interPrcAplyFlg
	 */
	public String getInterPrcAplyFlg() {
		return this.interPrcAplyFlg;
	}
	
	/**
	 * Column Info
	 * @return loclCostAmt
	 */
	public String getLoclCostAmt() {
		return this.loclCostAmt;
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
	 * @param actCostMapgCd2
	 */
	public void setActCostMapgCd2(String actCostMapgCd2) {
		this.actCostMapgCd2 = actCostMapgCd2;
	}
	
	/**
	 * Column Info
	 * @param repAcctCd
	 */
	public void setRepAcctCd(String repAcctCd) {
		this.repAcctCd = repAcctCd;
	}
	
	/**
	 * Column Info
	 * @param glDt
	 */
	public void setGlDt(String glDt) {
		this.glDt = glDt;
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
	 * @param invCalcAutoCd
	 */
	public void setInvCalcAutoCd(String invCalcAutoCd) {
		this.invCalcAutoCd = invCalcAutoCd;
	}
	
	/**
	 * Column Info
	 * @param copNo
	 */
	public void setCopNo(String copNo) {
		this.copNo = copNo;
	}
	
	/**
	 * Column Info
	 * @param ifSeq
	 */
	public void setIfSeq(String ifSeq) {
		this.ifSeq = ifSeq;
	}
	
	/**
	 * Column Info
	 * @param tmlInvTpCd
	 */
	public void setTmlInvTpCd(String tmlInvTpCd) {
		this.tmlInvTpCd = tmlInvTpCd;
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
	 * @param bkupInterCostCd
	 */
	public void setBkupInterCostCd(String bkupInterCostCd) {
		this.bkupInterCostCd = bkupInterCostCd;
	}
	
	/**
	 * Column Info
	 * @param cntrTpszCd
	 */
	public void setCntrTpszCd(String cntrTpszCd) {
		this.cntrTpszCd = cntrTpszCd;
	}
	
	/**
	 * Column Info
	 * @param trspSoTpCd
	 */
	public void setTrspSoTpCd(String trspSoTpCd) {
		this.trspSoTpCd = trspSoTpCd;
	}
	
	/**
	 * Column Info
	 * @param csrTpCd
	 */
	public void setCsrTpCd(String csrTpCd) {
		this.csrTpCd = csrTpCd;
	}
	
	/**
	 * Column Info
	 * @param csrNo
	 */
	public void setCsrNo(String csrNo) {
		this.csrNo = csrNo;
	}
	
	/**
	 * Column Info
	 * @param revYrmon
	 */
	public void setRevYrmon(String revYrmon) {
		this.revYrmon = revYrmon;
	}
	
	/**
	 * Column Info
	 * @param exeYrmon
	 */
	public void setExeYrmon(String exeYrmon) {
		this.exeYrmon = exeYrmon;
	}
	
	/**
	 * Column Info
	 * @param loclCurrCd
	 */
	public void setLoclCurrCd(String loclCurrCd) {
		this.loclCurrCd = loclCurrCd;
	}
	
	/**
	 * Column Info
	 * @param n2ndNodCd
	 */
	public void setN2ndNodCd(String n2ndNodCd) {
		this.n2ndNodCd = n2ndNodCd;
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
	 * @param errCsrNo
	 */
	public void setErrCsrNo(String errCsrNo) {
		this.errCsrNo = errCsrNo;
	}
	
	/**
	 * Column Info
	 * @param invCxlFlg
	 */
	public void setInvCxlFlg(String invCxlFlg) {
		this.invCxlFlg = invCxlFlg;
	}
	
	/**
	 * Column Info
	 * @param copCntrNo
	 */
	public void setCopCntrNo(String copCntrNo) {
		this.copCntrNo = copCntrNo;
	}
	
	/**
	 * Column Info
	 * @param costActGrpCd
	 */
	public void setCostActGrpCd(String costActGrpCd) {
		this.costActGrpCd = costActGrpCd;
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
	 * @param n4thNodCd
	 */
	public void setN4thNodCd(String n4thNodCd) {
		this.n4thNodCd = n4thNodCd;
	}
	
	/**
	 * Column Info
	 * @param ttlInvKnt
	 */
	public void setTtlInvKnt(String ttlInvKnt) {
		this.ttlInvKnt = ttlInvKnt;
	}
	
	/**
	 * Column Info
	 * @param invCxlDt
	 */
	public void setInvCxlDt(String invCxlDt) {
		this.invCxlDt = invCxlDt;
	}
	
	/**
	 * Column Info
	 * @param actCostMapgCd
	 */
	public void setActCostMapgCd(String actCostMapgCd) {
		this.actCostMapgCd = actCostMapgCd;
	}
	
	/**
	 * Column Info
	 * @param n1stNodCd
	 */
	public void setN1stNodCd(String n1stNodCd) {
		this.n1stNodCd = n1stNodCd;
	}
	
	/**
	 * Column Info
	 * @param n2ndThrpInclCostCd
	 */
	public void setN2ndThrpInclCostCd(String n2ndThrpInclCostCd) {
		this.n2ndThrpInclCostCd = n2ndThrpInclCostCd;
	}
	
	/**
	 * Column Info
	 * @param newRevYrmon
	 */
	public void setNewRevYrmon(String newRevYrmon) {
		this.newRevYrmon = newRevYrmon;
	}
	
	/**
	 * Column Info
	 * @param n3rdThrpInclCostCd
	 */
	public void setN3rdThrpInclCostCd(String n3rdThrpInclCostCd) {
		this.n3rdThrpInclCostCd = n3rdThrpInclCostCd;
	}
	
	/**
	 * Column Info
	 * @param actVvdCd
	 */
	public void setActVvdCd(String actVvdCd) {
		this.actVvdCd = actVvdCd;
	}
	
	/**
	 * Column Info
	 * @param rvisBkgFlg
	 */
	public void setRvisBkgFlg(String rvisBkgFlg) {
		this.rvisBkgFlg = rvisBkgFlg;
	}
	
	/**
	 * Column Info
	 * @param n3rdNodCd
	 */
	public void setN3rdNodCd(String n3rdNodCd) {
		this.n3rdNodCd = n3rdNodCd;
	}
	
	/**
	 * Column Info
	 * @param uplnSoFlg
	 */
	public void setUplnSoFlg(String uplnSoFlg) {
		this.uplnSoFlg = uplnSoFlg;
	}
	
	/**
	 * Column Info
	 * @param coaCostSrcCd
	 */
	public void setCoaCostSrcCd(String coaCostSrcCd) {
		this.coaCostSrcCd = coaCostSrcCd;
	}
	
	/**
	 * Column Info
	 * @param soSeq
	 */
	public void setSoSeq(String soSeq) {
		this.soSeq = soSeq;
	}
	
	/**
	 * Column Info
	 * @param usdCostAmt
	 */
	public void setUsdCostAmt(String usdCostAmt) {
		this.usdCostAmt = usdCostAmt;
	}
	
	/**
	 * Column Info
	 * @param invSysId
	 */
	public void setInvSysId(String invSysId) {
		this.invSysId = invSysId;
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
	 * @param revVvdCngFlg
	 */
	public void setRevVvdCngFlg(String revVvdCngFlg) {
		this.revVvdCngFlg = revVvdCngFlg;
	}
	
	/**
	 * Column Info
	 * @param tmlCalcIndCd
	 */
	public void setTmlCalcIndCd(String tmlCalcIndCd) {
		this.tmlCalcIndCd = tmlCalcIndCd;
	}
	
	/**
	 * Column Info
	 * @param revDirCd
	 */
	public void setRevDirCd(String revDirCd) {
		this.revDirCd = revDirCd;
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
	 * @param n1stThrpInclCostCd
	 */
	public void setN1stThrpInclCostCd(String n1stThrpInclCostCd) {
		this.n1stThrpInclCostCd = n1stThrpInclCostCd;
	}
	
	/**
	 * Column Info
	 * @param otrCrrFlg
	 */
	public void setOtrCrrFlg(String otrCrrFlg) {
		this.otrCrrFlg = otrCrrFlg;
	}
	
	/**
	 * Column Info
	 * @param cntrMapgExptLog
	 */
	public void setCntrMapgExptLog(String cntrMapgExptLog) {
		this.cntrMapgExptLog = cntrMapgExptLog;
	}
	
	/**
	 * Column Info
	 * @param acctCd
	 */
	public void setAcctCd(String acctCd) {
		this.acctCd = acctCd;
	}
	
	/**
	 * Column Info
	 * @param costActGrpTpCd
	 */
	public void setCostActGrpTpCd(String costActGrpTpCd) {
		this.costActGrpTpCd = costActGrpTpCd;
	}
	
	/**
	 * Column Info
	 * @param rvisBkgNo
	 */
	public void setRvisBkgNo(String rvisBkgNo) {
		this.rvisBkgNo = rvisBkgNo;
	}
	
	/**
	 * Column Info
	 * @param errVvdAplyFlg
	 */
	public void setErrVvdAplyFlg(String errVvdAplyFlg) {
		this.errVvdAplyFlg = errVvdAplyFlg;
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
	 * @param newBkgNo
	 */
	public void setNewBkgNo(String newBkgNo) {
		this.newBkgNo = newBkgNo;
	}
	
	/**
	 * Column Info
	 * @param soOfcCtyCd
	 */
	public void setSoOfcCtyCd(String soOfcCtyCd) {
		this.soOfcCtyCd = soOfcCtyCd;
	}
	
	/**
	 * Column Info
	 * @param bkupInterAcctCd
	 */
	public void setBkupInterAcctCd(String bkupInterAcctCd) {
		this.bkupInterAcctCd = bkupInterAcctCd;
	}
	
	/**
	 * Column Info
	 * @param batStDt
	 */
	public void setBatStDt(String batStDt) {
		this.batStDt = batStDt;
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
	 * @param invNo
	 */
	public void setInvNo(String invNo) {
		this.invNo = invNo;
	}
	
	/**
	 * Column Info
	 * @param costActGrpSeq
	 */
	public void setCostActGrpSeq(String costActGrpSeq) {
		this.costActGrpSeq = costActGrpSeq;
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
	 * @param interPrcAplyFlg
	 */
	public void setInterPrcAplyFlg(String interPrcAplyFlg) {
		this.interPrcAplyFlg = interPrcAplyFlg;
	}
	
	/**
	 * Column Info
	 * @param loclCostAmt
	 */
	public void setLoclCostAmt(String loclCostAmt) {
		this.loclCostAmt = loclCostAmt;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setActCostMapgCd2(JSPUtil.getParameter(request, "act_cost_mapg_cd2", ""));
		setRepAcctCd(JSPUtil.getParameter(request, "rep_acct_cd", ""));
		setGlDt(JSPUtil.getParameter(request, "gl_dt", ""));
		setInvVndrSeq(JSPUtil.getParameter(request, "inv_vndr_seq", ""));
		setInvCalcAutoCd(JSPUtil.getParameter(request, "inv_calc_auto_cd", ""));
		setCopNo(JSPUtil.getParameter(request, "cop_no", ""));
		setIfSeq(JSPUtil.getParameter(request, "if_seq", ""));
		setTmlInvTpCd(JSPUtil.getParameter(request, "tml_inv_tp_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setBkupInterCostCd(JSPUtil.getParameter(request, "bkup_inter_cost_cd", ""));
		setCntrTpszCd(JSPUtil.getParameter(request, "cntr_tpsz_cd", ""));
		setTrspSoTpCd(JSPUtil.getParameter(request, "trsp_so_tp_cd", ""));
		setCsrTpCd(JSPUtil.getParameter(request, "csr_tp_cd", ""));
		setCsrNo(JSPUtil.getParameter(request, "csr_no", ""));
		setRevYrmon(JSPUtil.getParameter(request, "rev_yrmon", ""));
		setExeYrmon(JSPUtil.getParameter(request, "exe_yrmon", ""));
		setLoclCurrCd(JSPUtil.getParameter(request, "locl_curr_cd", ""));
		setN2ndNodCd(JSPUtil.getParameter(request, "n2nd_nod_cd", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, "skd_voy_no", ""));
		setErrCsrNo(JSPUtil.getParameter(request, "err_csr_no", ""));
		setInvCxlFlg(JSPUtil.getParameter(request, "inv_cxl_flg", ""));
		setCopCntrNo(JSPUtil.getParameter(request, "cop_cntr_no", ""));
		setCostActGrpCd(JSPUtil.getParameter(request, "cost_act_grp_cd", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setN4thNodCd(JSPUtil.getParameter(request, "n4th_nod_cd", ""));
		setTtlInvKnt(JSPUtil.getParameter(request, "ttl_inv_knt", ""));
		setInvCxlDt(JSPUtil.getParameter(request, "inv_cxl_dt", ""));
		setActCostMapgCd(JSPUtil.getParameter(request, "act_cost_mapg_cd", ""));
		setN1stNodCd(JSPUtil.getParameter(request, "n1st_nod_cd", ""));
		setN2ndThrpInclCostCd(JSPUtil.getParameter(request, "n2nd_thrp_incl_cost_cd", ""));
		setNewRevYrmon(JSPUtil.getParameter(request, "new_rev_yrmon", ""));
		setN3rdThrpInclCostCd(JSPUtil.getParameter(request, "n3rd_thrp_incl_cost_cd", ""));
		setActVvdCd(JSPUtil.getParameter(request, "act_vvd_cd", ""));
		setRvisBkgFlg(JSPUtil.getParameter(request, "rvis_bkg_flg", ""));
		setN3rdNodCd(JSPUtil.getParameter(request, "n3rd_nod_cd", ""));
		setUplnSoFlg(JSPUtil.getParameter(request, "upln_so_flg", ""));
		setCoaCostSrcCd(JSPUtil.getParameter(request, "coa_cost_src_cd", ""));
		setSoSeq(JSPUtil.getParameter(request, "so_seq", ""));
		setUsdCostAmt(JSPUtil.getParameter(request, "usd_cost_amt", ""));
		setInvSysId(JSPUtil.getParameter(request, "inv_sys_id", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setRevVvdCngFlg(JSPUtil.getParameter(request, "rev_vvd_cng_flg", ""));
		setTmlCalcIndCd(JSPUtil.getParameter(request, "tml_calc_ind_cd", ""));
		setRevDirCd(JSPUtil.getParameter(request, "rev_dir_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setN1stThrpInclCostCd(JSPUtil.getParameter(request, "n1st_thrp_incl_cost_cd", ""));
		setOtrCrrFlg(JSPUtil.getParameter(request, "otr_crr_flg", ""));
		setCntrMapgExptLog(JSPUtil.getParameter(request, "cntr_mapg_expt_log", ""));
		setAcctCd(JSPUtil.getParameter(request, "acct_cd", ""));
		setCostActGrpTpCd(JSPUtil.getParameter(request, "cost_act_grp_tp_cd", ""));
		setRvisBkgNo(JSPUtil.getParameter(request, "rvis_bkg_no", ""));
		setErrVvdAplyFlg(JSPUtil.getParameter(request, "err_vvd_aply_flg", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setNewBkgNo(JSPUtil.getParameter(request, "new_bkg_no", ""));
		setSoOfcCtyCd(JSPUtil.getParameter(request, "so_ofc_cty_cd", ""));
		setBkupInterAcctCd(JSPUtil.getParameter(request, "bkup_inter_acct_cd", ""));
		setBatStDt(JSPUtil.getParameter(request, "bat_st_dt", ""));
		setSkdDirCd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
		setInvNo(JSPUtil.getParameter(request, "inv_no", ""));
		setCostActGrpSeq(JSPUtil.getParameter(request, "cost_act_grp_seq", ""));
		setCntrNo(JSPUtil.getParameter(request, "cntr_no", ""));
		setInterPrcAplyFlg(JSPUtil.getParameter(request, "inter_prc_aply_flg", ""));
		setLoclCostAmt(JSPUtil.getParameter(request, "locl_cost_amt", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return LeaActCostIfVO[]
	 */
	public LeaActCostIfVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return LeaActCostIfVO[]
	 */
	public LeaActCostIfVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		LeaActCostIfVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] actCostMapgCd2 = (JSPUtil.getParameter(request, prefix	+ "act_cost_mapg_cd2", length));
			String[] repAcctCd = (JSPUtil.getParameter(request, prefix	+ "rep_acct_cd", length));
			String[] glDt = (JSPUtil.getParameter(request, prefix	+ "gl_dt", length));
			String[] invVndrSeq = (JSPUtil.getParameter(request, prefix	+ "inv_vndr_seq", length));
			String[] invCalcAutoCd = (JSPUtil.getParameter(request, prefix	+ "inv_calc_auto_cd", length));
			String[] copNo = (JSPUtil.getParameter(request, prefix	+ "cop_no", length));
			String[] ifSeq = (JSPUtil.getParameter(request, prefix	+ "if_seq", length));
			String[] tmlInvTpCd = (JSPUtil.getParameter(request, prefix	+ "tml_inv_tp_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] bkupInterCostCd = (JSPUtil.getParameter(request, prefix	+ "bkup_inter_cost_cd", length));
			String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_cd", length));
			String[] trspSoTpCd = (JSPUtil.getParameter(request, prefix	+ "trsp_so_tp_cd", length));
			String[] csrTpCd = (JSPUtil.getParameter(request, prefix	+ "csr_tp_cd", length));
			String[] csrNo = (JSPUtil.getParameter(request, prefix	+ "csr_no", length));
			String[] revYrmon = (JSPUtil.getParameter(request, prefix	+ "rev_yrmon", length));
			String[] exeYrmon = (JSPUtil.getParameter(request, prefix	+ "exe_yrmon", length));
			String[] loclCurrCd = (JSPUtil.getParameter(request, prefix	+ "locl_curr_cd", length));
			String[] n2ndNodCd = (JSPUtil.getParameter(request, prefix	+ "n2nd_nod_cd", length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no", length));
			String[] errCsrNo = (JSPUtil.getParameter(request, prefix	+ "err_csr_no", length));
			String[] invCxlFlg = (JSPUtil.getParameter(request, prefix	+ "inv_cxl_flg", length));
			String[] copCntrNo = (JSPUtil.getParameter(request, prefix	+ "cop_cntr_no", length));
			String[] costActGrpCd = (JSPUtil.getParameter(request, prefix	+ "cost_act_grp_cd", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] n4thNodCd = (JSPUtil.getParameter(request, prefix	+ "n4th_nod_cd", length));
			String[] ttlInvKnt = (JSPUtil.getParameter(request, prefix	+ "ttl_inv_knt", length));
			String[] invCxlDt = (JSPUtil.getParameter(request, prefix	+ "inv_cxl_dt", length));
			String[] actCostMapgCd = (JSPUtil.getParameter(request, prefix	+ "act_cost_mapg_cd", length));
			String[] n1stNodCd = (JSPUtil.getParameter(request, prefix	+ "n1st_nod_cd", length));
			String[] n2ndThrpInclCostCd = (JSPUtil.getParameter(request, prefix	+ "n2nd_thrp_incl_cost_cd", length));
			String[] newRevYrmon = (JSPUtil.getParameter(request, prefix	+ "new_rev_yrmon", length));
			String[] n3rdThrpInclCostCd = (JSPUtil.getParameter(request, prefix	+ "n3rd_thrp_incl_cost_cd", length));
			String[] actVvdCd = (JSPUtil.getParameter(request, prefix	+ "act_vvd_cd", length));
			String[] rvisBkgFlg = (JSPUtil.getParameter(request, prefix	+ "rvis_bkg_flg", length));
			String[] n3rdNodCd = (JSPUtil.getParameter(request, prefix	+ "n3rd_nod_cd", length));
			String[] uplnSoFlg = (JSPUtil.getParameter(request, prefix	+ "upln_so_flg", length));
			String[] coaCostSrcCd = (JSPUtil.getParameter(request, prefix	+ "coa_cost_src_cd", length));
			String[] soSeq = (JSPUtil.getParameter(request, prefix	+ "so_seq", length));
			String[] usdCostAmt = (JSPUtil.getParameter(request, prefix	+ "usd_cost_amt", length));
			String[] invSysId = (JSPUtil.getParameter(request, prefix	+ "inv_sys_id", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] revVvdCngFlg = (JSPUtil.getParameter(request, prefix	+ "rev_vvd_cng_flg", length));
			String[] tmlCalcIndCd = (JSPUtil.getParameter(request, prefix	+ "tml_calc_ind_cd", length));
			String[] revDirCd = (JSPUtil.getParameter(request, prefix	+ "rev_dir_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] n1stThrpInclCostCd = (JSPUtil.getParameter(request, prefix	+ "n1st_thrp_incl_cost_cd", length));
			String[] otrCrrFlg = (JSPUtil.getParameter(request, prefix	+ "otr_crr_flg", length));
			String[] cntrMapgExptLog = (JSPUtil.getParameter(request, prefix	+ "cntr_mapg_expt_log", length));
			String[] acctCd = (JSPUtil.getParameter(request, prefix	+ "acct_cd", length));
			String[] costActGrpTpCd = (JSPUtil.getParameter(request, prefix	+ "cost_act_grp_tp_cd", length));
			String[] rvisBkgNo = (JSPUtil.getParameter(request, prefix	+ "rvis_bkg_no", length));
			String[] errVvdAplyFlg = (JSPUtil.getParameter(request, prefix	+ "err_vvd_aply_flg", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] newBkgNo = (JSPUtil.getParameter(request, prefix	+ "new_bkg_no", length));
			String[] soOfcCtyCd = (JSPUtil.getParameter(request, prefix	+ "so_ofc_cty_cd", length));
			String[] bkupInterAcctCd = (JSPUtil.getParameter(request, prefix	+ "bkup_inter_acct_cd", length));
			String[] batStDt = (JSPUtil.getParameter(request, prefix	+ "bat_st_dt", length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd", length));
			String[] invNo = (JSPUtil.getParameter(request, prefix	+ "inv_no", length));
			String[] costActGrpSeq = (JSPUtil.getParameter(request, prefix	+ "cost_act_grp_seq", length));
			String[] cntrNo = (JSPUtil.getParameter(request, prefix	+ "cntr_no", length));
			String[] interPrcAplyFlg = (JSPUtil.getParameter(request, prefix	+ "inter_prc_aply_flg", length));
			String[] loclCostAmt = (JSPUtil.getParameter(request, prefix	+ "locl_cost_amt", length));
			
			for (int i = 0; i < length; i++) {
				model = new LeaActCostIfVO();
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (actCostMapgCd2[i] != null)
					model.setActCostMapgCd2(actCostMapgCd2[i]);
				if (repAcctCd[i] != null)
					model.setRepAcctCd(repAcctCd[i]);
				if (glDt[i] != null)
					model.setGlDt(glDt[i]);
				if (invVndrSeq[i] != null)
					model.setInvVndrSeq(invVndrSeq[i]);
				if (invCalcAutoCd[i] != null)
					model.setInvCalcAutoCd(invCalcAutoCd[i]);
				if (copNo[i] != null)
					model.setCopNo(copNo[i]);
				if (ifSeq[i] != null)
					model.setIfSeq(ifSeq[i]);
				if (tmlInvTpCd[i] != null)
					model.setTmlInvTpCd(tmlInvTpCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (bkupInterCostCd[i] != null)
					model.setBkupInterCostCd(bkupInterCostCd[i]);
				if (cntrTpszCd[i] != null)
					model.setCntrTpszCd(cntrTpszCd[i]);
				if (trspSoTpCd[i] != null)
					model.setTrspSoTpCd(trspSoTpCd[i]);
				if (csrTpCd[i] != null)
					model.setCsrTpCd(csrTpCd[i]);
				if (csrNo[i] != null)
					model.setCsrNo(csrNo[i]);
				if (revYrmon[i] != null)
					model.setRevYrmon(revYrmon[i]);
				if (exeYrmon[i] != null)
					model.setExeYrmon(exeYrmon[i]);
				if (loclCurrCd[i] != null)
					model.setLoclCurrCd(loclCurrCd[i]);
				if (n2ndNodCd[i] != null)
					model.setN2ndNodCd(n2ndNodCd[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (errCsrNo[i] != null)
					model.setErrCsrNo(errCsrNo[i]);
				if (invCxlFlg[i] != null)
					model.setInvCxlFlg(invCxlFlg[i]);
				if (copCntrNo[i] != null)
					model.setCopCntrNo(copCntrNo[i]);
				if (costActGrpCd[i] != null)
					model.setCostActGrpCd(costActGrpCd[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (n4thNodCd[i] != null)
					model.setN4thNodCd(n4thNodCd[i]);
				if (ttlInvKnt[i] != null)
					model.setTtlInvKnt(ttlInvKnt[i]);
				if (invCxlDt[i] != null)
					model.setInvCxlDt(invCxlDt[i]);
				if (actCostMapgCd[i] != null)
					model.setActCostMapgCd(actCostMapgCd[i]);
				if (n1stNodCd[i] != null)
					model.setN1stNodCd(n1stNodCd[i]);
				if (n2ndThrpInclCostCd[i] != null)
					model.setN2ndThrpInclCostCd(n2ndThrpInclCostCd[i]);
				if (newRevYrmon[i] != null)
					model.setNewRevYrmon(newRevYrmon[i]);
				if (n3rdThrpInclCostCd[i] != null)
					model.setN3rdThrpInclCostCd(n3rdThrpInclCostCd[i]);
				if (actVvdCd[i] != null)
					model.setActVvdCd(actVvdCd[i]);
				if (rvisBkgFlg[i] != null)
					model.setRvisBkgFlg(rvisBkgFlg[i]);
				if (n3rdNodCd[i] != null)
					model.setN3rdNodCd(n3rdNodCd[i]);
				if (uplnSoFlg[i] != null)
					model.setUplnSoFlg(uplnSoFlg[i]);
				if (coaCostSrcCd[i] != null)
					model.setCoaCostSrcCd(coaCostSrcCd[i]);
				if (soSeq[i] != null)
					model.setSoSeq(soSeq[i]);
				if (usdCostAmt[i] != null)
					model.setUsdCostAmt(usdCostAmt[i]);
				if (invSysId[i] != null)
					model.setInvSysId(invSysId[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (revVvdCngFlg[i] != null)
					model.setRevVvdCngFlg(revVvdCngFlg[i]);
				if (tmlCalcIndCd[i] != null)
					model.setTmlCalcIndCd(tmlCalcIndCd[i]);
				if (revDirCd[i] != null)
					model.setRevDirCd(revDirCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (n1stThrpInclCostCd[i] != null)
					model.setN1stThrpInclCostCd(n1stThrpInclCostCd[i]);
				if (otrCrrFlg[i] != null)
					model.setOtrCrrFlg(otrCrrFlg[i]);
				if (cntrMapgExptLog[i] != null)
					model.setCntrMapgExptLog(cntrMapgExptLog[i]);
				if (acctCd[i] != null)
					model.setAcctCd(acctCd[i]);
				if (costActGrpTpCd[i] != null)
					model.setCostActGrpTpCd(costActGrpTpCd[i]);
				if (rvisBkgNo[i] != null)
					model.setRvisBkgNo(rvisBkgNo[i]);
				if (errVvdAplyFlg[i] != null)
					model.setErrVvdAplyFlg(errVvdAplyFlg[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (newBkgNo[i] != null)
					model.setNewBkgNo(newBkgNo[i]);
				if (soOfcCtyCd[i] != null)
					model.setSoOfcCtyCd(soOfcCtyCd[i]);
				if (bkupInterAcctCd[i] != null)
					model.setBkupInterAcctCd(bkupInterAcctCd[i]);
				if (batStDt[i] != null)
					model.setBatStDt(batStDt[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (invNo[i] != null)
					model.setInvNo(invNo[i]);
				if (costActGrpSeq[i] != null)
					model.setCostActGrpSeq(costActGrpSeq[i]);
				if (cntrNo[i] != null)
					model.setCntrNo(cntrNo[i]);
				if (interPrcAplyFlg[i] != null)
					model.setInterPrcAplyFlg(interPrcAplyFlg[i]);
				if (loclCostAmt[i] != null)
					model.setLoclCostAmt(loclCostAmt[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getLeaActCostIfVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return LeaActCostIfVO[]
	 */
	public LeaActCostIfVO[] getLeaActCostIfVOs(){
		LeaActCostIfVO[] vos = (LeaActCostIfVO[])models.toArray(new LeaActCostIfVO[models.size()]);
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
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actCostMapgCd2 = this.actCostMapgCd2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.repAcctCd = this.repAcctCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.glDt = this.glDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invVndrSeq = this.invVndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invCalcAutoCd = this.invCalcAutoCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.copNo = this.copNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ifSeq = this.ifSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlInvTpCd = this.tmlInvTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkupInterCostCd = this.bkupInterCostCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszCd = this.cntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspSoTpCd = this.trspSoTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.csrTpCd = this.csrTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.csrNo = this.csrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.revYrmon = this.revYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.exeYrmon = this.exeYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.loclCurrCd = this.loclCurrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndNodCd = this.n2ndNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.errCsrNo = this.errCsrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invCxlFlg = this.invCxlFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.copCntrNo = this.copCntrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costActGrpCd = this.costActGrpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n4thNodCd = this.n4thNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ttlInvKnt = this.ttlInvKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invCxlDt = this.invCxlDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actCostMapgCd = this.actCostMapgCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stNodCd = this.n1stNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndThrpInclCostCd = this.n2ndThrpInclCostCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.newRevYrmon = this.newRevYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdThrpInclCostCd = this.n3rdThrpInclCostCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actVvdCd = this.actVvdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rvisBkgFlg = this.rvisBkgFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdNodCd = this.n3rdNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.uplnSoFlg = this.uplnSoFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.coaCostSrcCd = this.coaCostSrcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.soSeq = this.soSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usdCostAmt = this.usdCostAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invSysId = this.invSysId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.revVvdCngFlg = this.revVvdCngFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlCalcIndCd = this.tmlCalcIndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.revDirCd = this.revDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stThrpInclCostCd = this.n1stThrpInclCostCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.otrCrrFlg = this.otrCrrFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrMapgExptLog = this.cntrMapgExptLog .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acctCd = this.acctCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costActGrpTpCd = this.costActGrpTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rvisBkgNo = this.rvisBkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.errVvdAplyFlg = this.errVvdAplyFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.newBkgNo = this.newBkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.soOfcCtyCd = this.soOfcCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkupInterAcctCd = this.bkupInterAcctCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.batStDt = this.batStDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invNo = this.invNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costActGrpSeq = this.costActGrpSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrNo = this.cntrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.interPrcAplyFlg = this.interPrcAplyFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.loclCostAmt = this.loclCostAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
