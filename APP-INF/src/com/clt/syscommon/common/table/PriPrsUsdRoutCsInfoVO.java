/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : PriPrsUsdRoutCsInfoVO.java
*@FileTitle : PriPrsUsdRoutCsInfoVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.12.10
*@LastModifier : 송민석
*@LastVersion : 1.0
* 2009.12.10 송민석 
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
 * @author 송민석
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class PriPrsUsdRoutCsInfoVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<PriPrsUsdRoutCsInfoVO> models = new ArrayList<PriPrsUsdRoutCsInfoVO>();
	
	/* Column Info */
	private String ttlExpnAmt = null;
	/* Column Info */
	private String bkgCgoTpCd = null;
	/* Column Info */
	private String costRoutNo = null;
	/* Column Info */
	private String n3rdFincVvdCd = null;
	/* Column Info */
	private String prodRev = null;
	/* Column Info */
	private String cltOfcCd = null;
	/* Column Info */
	private String mtyPkupYdCd = null;
	/* Column Info */
	private String n1stTsPortCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String pctlNo = null;
	/* Column Info */
	private String cneeCntCd = null;
	/* Column Info */
	private String obItchgCtnt = null;
	/* Column Info */
	private String n2ndTrdCd = null;
	/* Column Info */
	private String polCd = null;
	/* Column Info */
	private String n4thTrdCd = null;
	/* Column Info */
	private String hngrSpclFlg = null;
	/* Column Info */
	private String scNo = null;
	/* Column Info */
	private String slsOfcCd = null;
	/* Column Info */
	private String n1stTrdCd = null;
	/* Column Info */
	private String n1stRlaneCd = null;
	/* Column Info */
	private String delNodCd = null;
	/* Column Info */
	private String bbSpclFlg = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String paraRoutNo = null;
	/* Column Info */
	private String bkgOfcCd = null;
	/* Column Info */
	private String cnstFlg = null;
	/* Column Info */
	private String delCd = null;
	/* Column Info */
	private String shprCntCd = null;
	/* Column Info */
	private String n4thRlaneCd = null;
	/* Column Info */
	private String slsRhqCd = null;
	/* Column Info */
	private String ppdOfcCd = null;
	/* Column Info */
	private String podCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String n3rdRlaneCd = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String rfaOfcCd = null;
	/* Column Info */
	private String scOfcCd = null;
	/* Column Info */
	private String trnkVslCd = null;
	/* Column Info */
	private String shprSeq = null;
	/* Column Info */
	private String slsHoCd = null;
	/* Column Info */
	private String trnkSkdVoyNo = null;
	/* Column Info */
	private String n3rdTsPortCd = null;
	/* Column Info */
	private String porCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String n2ndRlaneCd = null;
	/* Column Info */
	private String bkgRcvTermCd = null;
	/* Column Info */
	private String n2ndTsPortCd = null;
	/* Column Info */
	private String ibItchgCtnt = null;
	/* Column Info */
	private String n4thFincVvdCd = null;
	/* Column Info */
	private String dgClssCd = null;
	/* Column Info */
	private String eqSubstFlg = null;
	/* Column Info */
	private String trnkAvalSpc = null;
	/* Column Info */
	private String trnkSkdDirCd = null;
	/* Column Info */
	private String rfaNo = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String cmdtCd = null;
	/* Column Info */
	private String creOfcCd = null;
	/* Column Info */
	private String routCsSrcDt = null;
	/* Column Info */
	private String dgSpclFlg = null;
	/* Column Info */
	private String n3rdTrdCd = null;
	/* Column Info */
	private String spclAwkCgoFlg = null;
	/* Column Info */
	private String routCsNo = null;
	/* Column Info */
	private String rfSpclFlg = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String copCreFlg = null;
	/* Column Info */
	private String n1stFincVvdCd = null;
	/* Column Info */
	private String porNodCd = null;
	/* Column Info */
	private String cmAmt = null;
	/* Column Info */
	private String rdSpclFlg = null;
	/* Column Info */
	private String bkgWgt = null;
	/* Column Info */
	private String socFlg = null;
	/* Column Info */
	private String ttlTztmHrs = null;
	/* Column Info */
	private String cneeSeq = null;
	/* Column Info */
	private String n2ndFincVvdCd = null;
	/* Column Info */
	private String mtyRtnYdCd = null;
	/* Column Info */
	private String bkgSelFlg = null;
	/* Column Info */
	private String bkgDeTermCd = null;
	/* Column Info */
	private String repCmdtCd = null;
	/* Column Info */
	private String bkgWgtUtCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public PriPrsUsdRoutCsInfoVO() {}

	public PriPrsUsdRoutCsInfoVO(String ibflag, String pagerows, String routCsNo, String routCsSrcDt, String pctlNo, String bkgNo, String mtyPkupYdCd, String porCd, String porNodCd, String polCd, String n1stTsPortCd, String n2ndTsPortCd, String n3rdTsPortCd, String podCd, String delCd, String delNodCd, String mtyRtnYdCd, String ttlTztmHrs, String prodRev, String ttlExpnAmt, String cmAmt, String trnkAvalSpc, String bkgSelFlg, String copCreFlg, String obItchgCtnt, String ibItchgCtnt, String trnkVslCd, String trnkSkdVoyNo, String trnkSkdDirCd, String cnstFlg, String bkgCgoTpCd, String bkgRcvTermCd, String cmdtCd, String bkgDeTermCd, String repCmdtCd, String shprCntCd, String shprSeq, String cneeCntCd, String cneeSeq, String scNo, String rfaNo, String dgClssCd, String dgSpclFlg, String rfSpclFlg, String spclAwkCgoFlg, String bbSpclFlg, String rdSpclFlg, String hngrSpclFlg, String socFlg, String eqSubstFlg, String bkgWgt, String bkgWgtUtCd, String slsOfcCd, String slsRhqCd, String slsHoCd, String bkgOfcCd, String creOfcCd, String n1stFincVvdCd, String n2ndFincVvdCd, String n3rdFincVvdCd, String n4thFincVvdCd, String n1stRlaneCd, String n2ndRlaneCd, String n3rdRlaneCd, String n4thRlaneCd, String n1stTrdCd, String n2ndTrdCd, String n3rdTrdCd, String n4thTrdCd, String scOfcCd, String rfaOfcCd, String costRoutNo, String paraRoutNo, String ppdOfcCd, String cltOfcCd, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.ttlExpnAmt = ttlExpnAmt;
		this.bkgCgoTpCd = bkgCgoTpCd;
		this.costRoutNo = costRoutNo;
		this.n3rdFincVvdCd = n3rdFincVvdCd;
		this.prodRev = prodRev;
		this.cltOfcCd = cltOfcCd;
		this.mtyPkupYdCd = mtyPkupYdCd;
		this.n1stTsPortCd = n1stTsPortCd;
		this.pagerows = pagerows;
		this.pctlNo = pctlNo;
		this.cneeCntCd = cneeCntCd;
		this.obItchgCtnt = obItchgCtnt;
		this.n2ndTrdCd = n2ndTrdCd;
		this.polCd = polCd;
		this.n4thTrdCd = n4thTrdCd;
		this.hngrSpclFlg = hngrSpclFlg;
		this.scNo = scNo;
		this.slsOfcCd = slsOfcCd;
		this.n1stTrdCd = n1stTrdCd;
		this.n1stRlaneCd = n1stRlaneCd;
		this.delNodCd = delNodCd;
		this.bbSpclFlg = bbSpclFlg;
		this.updUsrId = updUsrId;
		this.paraRoutNo = paraRoutNo;
		this.bkgOfcCd = bkgOfcCd;
		this.cnstFlg = cnstFlg;
		this.delCd = delCd;
		this.shprCntCd = shprCntCd;
		this.n4thRlaneCd = n4thRlaneCd;
		this.slsRhqCd = slsRhqCd;
		this.ppdOfcCd = ppdOfcCd;
		this.podCd = podCd;
		this.creUsrId = creUsrId;
		this.n3rdRlaneCd = n3rdRlaneCd;
		this.bkgNo = bkgNo;
		this.rfaOfcCd = rfaOfcCd;
		this.scOfcCd = scOfcCd;
		this.trnkVslCd = trnkVslCd;
		this.shprSeq = shprSeq;
		this.slsHoCd = slsHoCd;
		this.trnkSkdVoyNo = trnkSkdVoyNo;
		this.n3rdTsPortCd = n3rdTsPortCd;
		this.porCd = porCd;
		this.creDt = creDt;
		this.n2ndRlaneCd = n2ndRlaneCd;
		this.bkgRcvTermCd = bkgRcvTermCd;
		this.n2ndTsPortCd = n2ndTsPortCd;
		this.ibItchgCtnt = ibItchgCtnt;
		this.n4thFincVvdCd = n4thFincVvdCd;
		this.dgClssCd = dgClssCd;
		this.eqSubstFlg = eqSubstFlg;
		this.trnkAvalSpc = trnkAvalSpc;
		this.trnkSkdDirCd = trnkSkdDirCd;
		this.rfaNo = rfaNo;
		this.ibflag = ibflag;
		this.cmdtCd = cmdtCd;
		this.creOfcCd = creOfcCd;
		this.routCsSrcDt = routCsSrcDt;
		this.dgSpclFlg = dgSpclFlg;
		this.n3rdTrdCd = n3rdTrdCd;
		this.spclAwkCgoFlg = spclAwkCgoFlg;
		this.routCsNo = routCsNo;
		this.rfSpclFlg = rfSpclFlg;
		this.updDt = updDt;
		this.copCreFlg = copCreFlg;
		this.n1stFincVvdCd = n1stFincVvdCd;
		this.porNodCd = porNodCd;
		this.cmAmt = cmAmt;
		this.rdSpclFlg = rdSpclFlg;
		this.bkgWgt = bkgWgt;
		this.socFlg = socFlg;
		this.ttlTztmHrs = ttlTztmHrs;
		this.cneeSeq = cneeSeq;
		this.n2ndFincVvdCd = n2ndFincVvdCd;
		this.mtyRtnYdCd = mtyRtnYdCd;
		this.bkgSelFlg = bkgSelFlg;
		this.bkgDeTermCd = bkgDeTermCd;
		this.repCmdtCd = repCmdtCd;
		this.bkgWgtUtCd = bkgWgtUtCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("ttl_expn_amt", getTtlExpnAmt());
		this.hashColumns.put("bkg_cgo_tp_cd", getBkgCgoTpCd());
		this.hashColumns.put("cost_rout_no", getCostRoutNo());
		this.hashColumns.put("n3rd_finc_vvd_cd", getN3rdFincVvdCd());
		this.hashColumns.put("prod_rev", getProdRev());
		this.hashColumns.put("clt_ofc_cd", getCltOfcCd());
		this.hashColumns.put("mty_pkup_yd_cd", getMtyPkupYdCd());
		this.hashColumns.put("n1st_ts_port_cd", getN1stTsPortCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("pctl_no", getPctlNo());
		this.hashColumns.put("cnee_cnt_cd", getCneeCntCd());
		this.hashColumns.put("ob_itchg_ctnt", getObItchgCtnt());
		this.hashColumns.put("n2nd_trd_cd", getN2ndTrdCd());
		this.hashColumns.put("pol_cd", getPolCd());
		this.hashColumns.put("n4th_trd_cd", getN4thTrdCd());
		this.hashColumns.put("hngr_spcl_flg", getHngrSpclFlg());
		this.hashColumns.put("sc_no", getScNo());
		this.hashColumns.put("sls_ofc_cd", getSlsOfcCd());
		this.hashColumns.put("n1st_trd_cd", getN1stTrdCd());
		this.hashColumns.put("n1st_rlane_cd", getN1stRlaneCd());
		this.hashColumns.put("del_nod_cd", getDelNodCd());
		this.hashColumns.put("bb_spcl_flg", getBbSpclFlg());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("para_rout_no", getParaRoutNo());
		this.hashColumns.put("bkg_ofc_cd", getBkgOfcCd());
		this.hashColumns.put("cnst_flg", getCnstFlg());
		this.hashColumns.put("del_cd", getDelCd());
		this.hashColumns.put("shpr_cnt_cd", getShprCntCd());
		this.hashColumns.put("n4th_rlane_cd", getN4thRlaneCd());
		this.hashColumns.put("sls_rhq_cd", getSlsRhqCd());
		this.hashColumns.put("ppd_ofc_cd", getPpdOfcCd());
		this.hashColumns.put("pod_cd", getPodCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("n3rd_rlane_cd", getN3rdRlaneCd());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("rfa_ofc_cd", getRfaOfcCd());
		this.hashColumns.put("sc_ofc_cd", getScOfcCd());
		this.hashColumns.put("trnk_vsl_cd", getTrnkVslCd());
		this.hashColumns.put("shpr_seq", getShprSeq());
		this.hashColumns.put("sls_ho_cd", getSlsHoCd());
		this.hashColumns.put("trnk_skd_voy_no", getTrnkSkdVoyNo());
		this.hashColumns.put("n3rd_ts_port_cd", getN3rdTsPortCd());
		this.hashColumns.put("por_cd", getPorCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("n2nd_rlane_cd", getN2ndRlaneCd());
		this.hashColumns.put("bkg_rcv_term_cd", getBkgRcvTermCd());
		this.hashColumns.put("n2nd_ts_port_cd", getN2ndTsPortCd());
		this.hashColumns.put("ib_itchg_ctnt", getIbItchgCtnt());
		this.hashColumns.put("n4th_finc_vvd_cd", getN4thFincVvdCd());
		this.hashColumns.put("dg_clss_cd", getDgClssCd());
		this.hashColumns.put("eq_subst_flg", getEqSubstFlg());
		this.hashColumns.put("trnk_aval_spc", getTrnkAvalSpc());
		this.hashColumns.put("trnk_skd_dir_cd", getTrnkSkdDirCd());
		this.hashColumns.put("rfa_no", getRfaNo());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cmdt_cd", getCmdtCd());
		this.hashColumns.put("cre_ofc_cd", getCreOfcCd());
		this.hashColumns.put("rout_cs_src_dt", getRoutCsSrcDt());
		this.hashColumns.put("dg_spcl_flg", getDgSpclFlg());
		this.hashColumns.put("n3rd_trd_cd", getN3rdTrdCd());
		this.hashColumns.put("spcl_awk_cgo_flg", getSpclAwkCgoFlg());
		this.hashColumns.put("rout_cs_no", getRoutCsNo());
		this.hashColumns.put("rf_spcl_flg", getRfSpclFlg());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cop_cre_flg", getCopCreFlg());
		this.hashColumns.put("n1st_finc_vvd_cd", getN1stFincVvdCd());
		this.hashColumns.put("por_nod_cd", getPorNodCd());
		this.hashColumns.put("cm_amt", getCmAmt());
		this.hashColumns.put("rd_spcl_flg", getRdSpclFlg());
		this.hashColumns.put("bkg_wgt", getBkgWgt());
		this.hashColumns.put("soc_flg", getSocFlg());
		this.hashColumns.put("ttl_tztm_hrs", getTtlTztmHrs());
		this.hashColumns.put("cnee_seq", getCneeSeq());
		this.hashColumns.put("n2nd_finc_vvd_cd", getN2ndFincVvdCd());
		this.hashColumns.put("mty_rtn_yd_cd", getMtyRtnYdCd());
		this.hashColumns.put("bkg_sel_flg", getBkgSelFlg());
		this.hashColumns.put("bkg_de_term_cd", getBkgDeTermCd());
		this.hashColumns.put("rep_cmdt_cd", getRepCmdtCd());
		this.hashColumns.put("bkg_wgt_ut_cd", getBkgWgtUtCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("ttl_expn_amt", "ttlExpnAmt");
		this.hashFields.put("bkg_cgo_tp_cd", "bkgCgoTpCd");
		this.hashFields.put("cost_rout_no", "costRoutNo");
		this.hashFields.put("n3rd_finc_vvd_cd", "n3rdFincVvdCd");
		this.hashFields.put("prod_rev", "prodRev");
		this.hashFields.put("clt_ofc_cd", "cltOfcCd");
		this.hashFields.put("mty_pkup_yd_cd", "mtyPkupYdCd");
		this.hashFields.put("n1st_ts_port_cd", "n1stTsPortCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("pctl_no", "pctlNo");
		this.hashFields.put("cnee_cnt_cd", "cneeCntCd");
		this.hashFields.put("ob_itchg_ctnt", "obItchgCtnt");
		this.hashFields.put("n2nd_trd_cd", "n2ndTrdCd");
		this.hashFields.put("pol_cd", "polCd");
		this.hashFields.put("n4th_trd_cd", "n4thTrdCd");
		this.hashFields.put("hngr_spcl_flg", "hngrSpclFlg");
		this.hashFields.put("sc_no", "scNo");
		this.hashFields.put("sls_ofc_cd", "slsOfcCd");
		this.hashFields.put("n1st_trd_cd", "n1stTrdCd");
		this.hashFields.put("n1st_rlane_cd", "n1stRlaneCd");
		this.hashFields.put("del_nod_cd", "delNodCd");
		this.hashFields.put("bb_spcl_flg", "bbSpclFlg");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("para_rout_no", "paraRoutNo");
		this.hashFields.put("bkg_ofc_cd", "bkgOfcCd");
		this.hashFields.put("cnst_flg", "cnstFlg");
		this.hashFields.put("del_cd", "delCd");
		this.hashFields.put("shpr_cnt_cd", "shprCntCd");
		this.hashFields.put("n4th_rlane_cd", "n4thRlaneCd");
		this.hashFields.put("sls_rhq_cd", "slsRhqCd");
		this.hashFields.put("ppd_ofc_cd", "ppdOfcCd");
		this.hashFields.put("pod_cd", "podCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("n3rd_rlane_cd", "n3rdRlaneCd");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("rfa_ofc_cd", "rfaOfcCd");
		this.hashFields.put("sc_ofc_cd", "scOfcCd");
		this.hashFields.put("trnk_vsl_cd", "trnkVslCd");
		this.hashFields.put("shpr_seq", "shprSeq");
		this.hashFields.put("sls_ho_cd", "slsHoCd");
		this.hashFields.put("trnk_skd_voy_no", "trnkSkdVoyNo");
		this.hashFields.put("n3rd_ts_port_cd", "n3rdTsPortCd");
		this.hashFields.put("por_cd", "porCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("n2nd_rlane_cd", "n2ndRlaneCd");
		this.hashFields.put("bkg_rcv_term_cd", "bkgRcvTermCd");
		this.hashFields.put("n2nd_ts_port_cd", "n2ndTsPortCd");
		this.hashFields.put("ib_itchg_ctnt", "ibItchgCtnt");
		this.hashFields.put("n4th_finc_vvd_cd", "n4thFincVvdCd");
		this.hashFields.put("dg_clss_cd", "dgClssCd");
		this.hashFields.put("eq_subst_flg", "eqSubstFlg");
		this.hashFields.put("trnk_aval_spc", "trnkAvalSpc");
		this.hashFields.put("trnk_skd_dir_cd", "trnkSkdDirCd");
		this.hashFields.put("rfa_no", "rfaNo");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cmdt_cd", "cmdtCd");
		this.hashFields.put("cre_ofc_cd", "creOfcCd");
		this.hashFields.put("rout_cs_src_dt", "routCsSrcDt");
		this.hashFields.put("dg_spcl_flg", "dgSpclFlg");
		this.hashFields.put("n3rd_trd_cd", "n3rdTrdCd");
		this.hashFields.put("spcl_awk_cgo_flg", "spclAwkCgoFlg");
		this.hashFields.put("rout_cs_no", "routCsNo");
		this.hashFields.put("rf_spcl_flg", "rfSpclFlg");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cop_cre_flg", "copCreFlg");
		this.hashFields.put("n1st_finc_vvd_cd", "n1stFincVvdCd");
		this.hashFields.put("por_nod_cd", "porNodCd");
		this.hashFields.put("cm_amt", "cmAmt");
		this.hashFields.put("rd_spcl_flg", "rdSpclFlg");
		this.hashFields.put("bkg_wgt", "bkgWgt");
		this.hashFields.put("soc_flg", "socFlg");
		this.hashFields.put("ttl_tztm_hrs", "ttlTztmHrs");
		this.hashFields.put("cnee_seq", "cneeSeq");
		this.hashFields.put("n2nd_finc_vvd_cd", "n2ndFincVvdCd");
		this.hashFields.put("mty_rtn_yd_cd", "mtyRtnYdCd");
		this.hashFields.put("bkg_sel_flg", "bkgSelFlg");
		this.hashFields.put("bkg_de_term_cd", "bkgDeTermCd");
		this.hashFields.put("rep_cmdt_cd", "repCmdtCd");
		this.hashFields.put("bkg_wgt_ut_cd", "bkgWgtUtCd");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return ttlExpnAmt
	 */
	public String getTtlExpnAmt() {
		return this.ttlExpnAmt;
	}
	
	/**
	 * Column Info
	 * @return bkgCgoTpCd
	 */
	public String getBkgCgoTpCd() {
		return this.bkgCgoTpCd;
	}
	
	/**
	 * Column Info
	 * @return costRoutNo
	 */
	public String getCostRoutNo() {
		return this.costRoutNo;
	}
	
	/**
	 * Column Info
	 * @return n3rdFincVvdCd
	 */
	public String getN3rdFincVvdCd() {
		return this.n3rdFincVvdCd;
	}
	
	/**
	 * Column Info
	 * @return prodRev
	 */
	public String getProdRev() {
		return this.prodRev;
	}
	
	/**
	 * Column Info
	 * @return cltOfcCd
	 */
	public String getCltOfcCd() {
		return this.cltOfcCd;
	}
	
	/**
	 * Column Info
	 * @return mtyPkupYdCd
	 */
	public String getMtyPkupYdCd() {
		return this.mtyPkupYdCd;
	}
	
	/**
	 * Column Info
	 * @return n1stTsPortCd
	 */
	public String getN1stTsPortCd() {
		return this.n1stTsPortCd;
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
	 * @return pctlNo
	 */
	public String getPctlNo() {
		return this.pctlNo;
	}
	
	/**
	 * Column Info
	 * @return cneeCntCd
	 */
	public String getCneeCntCd() {
		return this.cneeCntCd;
	}
	
	/**
	 * Column Info
	 * @return obItchgCtnt
	 */
	public String getObItchgCtnt() {
		return this.obItchgCtnt;
	}
	
	/**
	 * Column Info
	 * @return n2ndTrdCd
	 */
	public String getN2ndTrdCd() {
		return this.n2ndTrdCd;
	}
	
	/**
	 * Column Info
	 * @return polCd
	 */
	public String getPolCd() {
		return this.polCd;
	}
	
	/**
	 * Column Info
	 * @return n4thTrdCd
	 */
	public String getN4thTrdCd() {
		return this.n4thTrdCd;
	}
	
	/**
	 * Column Info
	 * @return hngrSpclFlg
	 */
	public String getHngrSpclFlg() {
		return this.hngrSpclFlg;
	}
	
	/**
	 * Column Info
	 * @return scNo
	 */
	public String getScNo() {
		return this.scNo;
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
	 * @return n1stTrdCd
	 */
	public String getN1stTrdCd() {
		return this.n1stTrdCd;
	}
	
	/**
	 * Column Info
	 * @return n1stRlaneCd
	 */
	public String getN1stRlaneCd() {
		return this.n1stRlaneCd;
	}
	
	/**
	 * Column Info
	 * @return delNodCd
	 */
	public String getDelNodCd() {
		return this.delNodCd;
	}
	
	/**
	 * Column Info
	 * @return bbSpclFlg
	 */
	public String getBbSpclFlg() {
		return this.bbSpclFlg;
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
	 * @return paraRoutNo
	 */
	public String getParaRoutNo() {
		return this.paraRoutNo;
	}
	
	/**
	 * Column Info
	 * @return bkgOfcCd
	 */
	public String getBkgOfcCd() {
		return this.bkgOfcCd;
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
	 * @return delCd
	 */
	public String getDelCd() {
		return this.delCd;
	}
	
	/**
	 * Column Info
	 * @return shprCntCd
	 */
	public String getShprCntCd() {
		return this.shprCntCd;
	}
	
	/**
	 * Column Info
	 * @return n4thRlaneCd
	 */
	public String getN4thRlaneCd() {
		return this.n4thRlaneCd;
	}
	
	/**
	 * Column Info
	 * @return slsRhqCd
	 */
	public String getSlsRhqCd() {
		return this.slsRhqCd;
	}
	
	/**
	 * Column Info
	 * @return ppdOfcCd
	 */
	public String getPpdOfcCd() {
		return this.ppdOfcCd;
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
	 * @return creUsrId
	 */
	public String getCreUsrId() {
		return this.creUsrId;
	}
	
	/**
	 * Column Info
	 * @return n3rdRlaneCd
	 */
	public String getN3rdRlaneCd() {
		return this.n3rdRlaneCd;
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
	 * @return rfaOfcCd
	 */
	public String getRfaOfcCd() {
		return this.rfaOfcCd;
	}
	
	/**
	 * Column Info
	 * @return scOfcCd
	 */
	public String getScOfcCd() {
		return this.scOfcCd;
	}
	
	/**
	 * Column Info
	 * @return trnkVslCd
	 */
	public String getTrnkVslCd() {
		return this.trnkVslCd;
	}
	
	/**
	 * Column Info
	 * @return shprSeq
	 */
	public String getShprSeq() {
		return this.shprSeq;
	}
	
	/**
	 * Column Info
	 * @return slsHoCd
	 */
	public String getSlsHoCd() {
		return this.slsHoCd;
	}
	
	/**
	 * Column Info
	 * @return trnkSkdVoyNo
	 */
	public String getTrnkSkdVoyNo() {
		return this.trnkSkdVoyNo;
	}
	
	/**
	 * Column Info
	 * @return n3rdTsPortCd
	 */
	public String getN3rdTsPortCd() {
		return this.n3rdTsPortCd;
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
	 * @return creDt
	 */
	public String getCreDt() {
		return this.creDt;
	}
	
	/**
	 * Column Info
	 * @return n2ndRlaneCd
	 */
	public String getN2ndRlaneCd() {
		return this.n2ndRlaneCd;
	}
	
	/**
	 * Column Info
	 * @return bkgRcvTermCd
	 */
	public String getBkgRcvTermCd() {
		return this.bkgRcvTermCd;
	}
	
	/**
	 * Column Info
	 * @return n2ndTsPortCd
	 */
	public String getN2ndTsPortCd() {
		return this.n2ndTsPortCd;
	}
	
	/**
	 * Column Info
	 * @return ibItchgCtnt
	 */
	public String getIbItchgCtnt() {
		return this.ibItchgCtnt;
	}
	
	/**
	 * Column Info
	 * @return n4thFincVvdCd
	 */
	public String getN4thFincVvdCd() {
		return this.n4thFincVvdCd;
	}
	
	/**
	 * Column Info
	 * @return dgClssCd
	 */
	public String getDgClssCd() {
		return this.dgClssCd;
	}
	
	/**
	 * Column Info
	 * @return eqSubstFlg
	 */
	public String getEqSubstFlg() {
		return this.eqSubstFlg;
	}
	
	/**
	 * Column Info
	 * @return trnkAvalSpc
	 */
	public String getTrnkAvalSpc() {
		return this.trnkAvalSpc;
	}
	
	/**
	 * Column Info
	 * @return trnkSkdDirCd
	 */
	public String getTrnkSkdDirCd() {
		return this.trnkSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @return rfaNo
	 */
	public String getRfaNo() {
		return this.rfaNo;
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
	 * @return cmdtCd
	 */
	public String getCmdtCd() {
		return this.cmdtCd;
	}
	
	/**
	 * Column Info
	 * @return creOfcCd
	 */
	public String getCreOfcCd() {
		return this.creOfcCd;
	}
	
	/**
	 * Column Info
	 * @return routCsSrcDt
	 */
	public String getRoutCsSrcDt() {
		return this.routCsSrcDt;
	}
	
	/**
	 * Column Info
	 * @return dgSpclFlg
	 */
	public String getDgSpclFlg() {
		return this.dgSpclFlg;
	}
	
	/**
	 * Column Info
	 * @return n3rdTrdCd
	 */
	public String getN3rdTrdCd() {
		return this.n3rdTrdCd;
	}
	
	/**
	 * Column Info
	 * @return spclAwkCgoFlg
	 */
	public String getSpclAwkCgoFlg() {
		return this.spclAwkCgoFlg;
	}
	
	/**
	 * Column Info
	 * @return routCsNo
	 */
	public String getRoutCsNo() {
		return this.routCsNo;
	}
	
	/**
	 * Column Info
	 * @return rfSpclFlg
	 */
	public String getRfSpclFlg() {
		return this.rfSpclFlg;
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
	 * @return copCreFlg
	 */
	public String getCopCreFlg() {
		return this.copCreFlg;
	}
	
	/**
	 * Column Info
	 * @return n1stFincVvdCd
	 */
	public String getN1stFincVvdCd() {
		return this.n1stFincVvdCd;
	}
	
	/**
	 * Column Info
	 * @return porNodCd
	 */
	public String getPorNodCd() {
		return this.porNodCd;
	}
	
	/**
	 * Column Info
	 * @return cmAmt
	 */
	public String getCmAmt() {
		return this.cmAmt;
	}
	
	/**
	 * Column Info
	 * @return rdSpclFlg
	 */
	public String getRdSpclFlg() {
		return this.rdSpclFlg;
	}
	
	/**
	 * Column Info
	 * @return bkgWgt
	 */
	public String getBkgWgt() {
		return this.bkgWgt;
	}
	
	/**
	 * Column Info
	 * @return socFlg
	 */
	public String getSocFlg() {
		return this.socFlg;
	}
	
	/**
	 * Column Info
	 * @return ttlTztmHrs
	 */
	public String getTtlTztmHrs() {
		return this.ttlTztmHrs;
	}
	
	/**
	 * Column Info
	 * @return cneeSeq
	 */
	public String getCneeSeq() {
		return this.cneeSeq;
	}
	
	/**
	 * Column Info
	 * @return n2ndFincVvdCd
	 */
	public String getN2ndFincVvdCd() {
		return this.n2ndFincVvdCd;
	}
	
	/**
	 * Column Info
	 * @return mtyRtnYdCd
	 */
	public String getMtyRtnYdCd() {
		return this.mtyRtnYdCd;
	}
	
	/**
	 * Column Info
	 * @return bkgSelFlg
	 */
	public String getBkgSelFlg() {
		return this.bkgSelFlg;
	}
	
	/**
	 * Column Info
	 * @return bkgDeTermCd
	 */
	public String getBkgDeTermCd() {
		return this.bkgDeTermCd;
	}
	
	/**
	 * Column Info
	 * @return repCmdtCd
	 */
	public String getRepCmdtCd() {
		return this.repCmdtCd;
	}
	
	/**
	 * Column Info
	 * @return bkgWgtUtCd
	 */
	public String getBkgWgtUtCd() {
		return this.bkgWgtUtCd;
	}
	

	/**
	 * Column Info
	 * @param ttlExpnAmt
	 */
	public void setTtlExpnAmt(String ttlExpnAmt) {
		this.ttlExpnAmt = ttlExpnAmt;
	}
	
	/**
	 * Column Info
	 * @param bkgCgoTpCd
	 */
	public void setBkgCgoTpCd(String bkgCgoTpCd) {
		this.bkgCgoTpCd = bkgCgoTpCd;
	}
	
	/**
	 * Column Info
	 * @param costRoutNo
	 */
	public void setCostRoutNo(String costRoutNo) {
		this.costRoutNo = costRoutNo;
	}
	
	/**
	 * Column Info
	 * @param n3rdFincVvdCd
	 */
	public void setN3rdFincVvdCd(String n3rdFincVvdCd) {
		this.n3rdFincVvdCd = n3rdFincVvdCd;
	}
	
	/**
	 * Column Info
	 * @param prodRev
	 */
	public void setProdRev(String prodRev) {
		this.prodRev = prodRev;
	}
	
	/**
	 * Column Info
	 * @param cltOfcCd
	 */
	public void setCltOfcCd(String cltOfcCd) {
		this.cltOfcCd = cltOfcCd;
	}
	
	/**
	 * Column Info
	 * @param mtyPkupYdCd
	 */
	public void setMtyPkupYdCd(String mtyPkupYdCd) {
		this.mtyPkupYdCd = mtyPkupYdCd;
	}
	
	/**
	 * Column Info
	 * @param n1stTsPortCd
	 */
	public void setN1stTsPortCd(String n1stTsPortCd) {
		this.n1stTsPortCd = n1stTsPortCd;
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
	 * @param pctlNo
	 */
	public void setPctlNo(String pctlNo) {
		this.pctlNo = pctlNo;
	}
	
	/**
	 * Column Info
	 * @param cneeCntCd
	 */
	public void setCneeCntCd(String cneeCntCd) {
		this.cneeCntCd = cneeCntCd;
	}
	
	/**
	 * Column Info
	 * @param obItchgCtnt
	 */
	public void setObItchgCtnt(String obItchgCtnt) {
		this.obItchgCtnt = obItchgCtnt;
	}
	
	/**
	 * Column Info
	 * @param n2ndTrdCd
	 */
	public void setN2ndTrdCd(String n2ndTrdCd) {
		this.n2ndTrdCd = n2ndTrdCd;
	}
	
	/**
	 * Column Info
	 * @param polCd
	 */
	public void setPolCd(String polCd) {
		this.polCd = polCd;
	}
	
	/**
	 * Column Info
	 * @param n4thTrdCd
	 */
	public void setN4thTrdCd(String n4thTrdCd) {
		this.n4thTrdCd = n4thTrdCd;
	}
	
	/**
	 * Column Info
	 * @param hngrSpclFlg
	 */
	public void setHngrSpclFlg(String hngrSpclFlg) {
		this.hngrSpclFlg = hngrSpclFlg;
	}
	
	/**
	 * Column Info
	 * @param scNo
	 */
	public void setScNo(String scNo) {
		this.scNo = scNo;
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
	 * @param n1stTrdCd
	 */
	public void setN1stTrdCd(String n1stTrdCd) {
		this.n1stTrdCd = n1stTrdCd;
	}
	
	/**
	 * Column Info
	 * @param n1stRlaneCd
	 */
	public void setN1stRlaneCd(String n1stRlaneCd) {
		this.n1stRlaneCd = n1stRlaneCd;
	}
	
	/**
	 * Column Info
	 * @param delNodCd
	 */
	public void setDelNodCd(String delNodCd) {
		this.delNodCd = delNodCd;
	}
	
	/**
	 * Column Info
	 * @param bbSpclFlg
	 */
	public void setBbSpclFlg(String bbSpclFlg) {
		this.bbSpclFlg = bbSpclFlg;
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
	 * @param paraRoutNo
	 */
	public void setParaRoutNo(String paraRoutNo) {
		this.paraRoutNo = paraRoutNo;
	}
	
	/**
	 * Column Info
	 * @param bkgOfcCd
	 */
	public void setBkgOfcCd(String bkgOfcCd) {
		this.bkgOfcCd = bkgOfcCd;
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
	 * @param delCd
	 */
	public void setDelCd(String delCd) {
		this.delCd = delCd;
	}
	
	/**
	 * Column Info
	 * @param shprCntCd
	 */
	public void setShprCntCd(String shprCntCd) {
		this.shprCntCd = shprCntCd;
	}
	
	/**
	 * Column Info
	 * @param n4thRlaneCd
	 */
	public void setN4thRlaneCd(String n4thRlaneCd) {
		this.n4thRlaneCd = n4thRlaneCd;
	}
	
	/**
	 * Column Info
	 * @param slsRhqCd
	 */
	public void setSlsRhqCd(String slsRhqCd) {
		this.slsRhqCd = slsRhqCd;
	}
	
	/**
	 * Column Info
	 * @param ppdOfcCd
	 */
	public void setPpdOfcCd(String ppdOfcCd) {
		this.ppdOfcCd = ppdOfcCd;
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
	 * @param creUsrId
	 */
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
	}
	
	/**
	 * Column Info
	 * @param n3rdRlaneCd
	 */
	public void setN3rdRlaneCd(String n3rdRlaneCd) {
		this.n3rdRlaneCd = n3rdRlaneCd;
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
	 * @param rfaOfcCd
	 */
	public void setRfaOfcCd(String rfaOfcCd) {
		this.rfaOfcCd = rfaOfcCd;
	}
	
	/**
	 * Column Info
	 * @param scOfcCd
	 */
	public void setScOfcCd(String scOfcCd) {
		this.scOfcCd = scOfcCd;
	}
	
	/**
	 * Column Info
	 * @param trnkVslCd
	 */
	public void setTrnkVslCd(String trnkVslCd) {
		this.trnkVslCd = trnkVslCd;
	}
	
	/**
	 * Column Info
	 * @param shprSeq
	 */
	public void setShprSeq(String shprSeq) {
		this.shprSeq = shprSeq;
	}
	
	/**
	 * Column Info
	 * @param slsHoCd
	 */
	public void setSlsHoCd(String slsHoCd) {
		this.slsHoCd = slsHoCd;
	}
	
	/**
	 * Column Info
	 * @param trnkSkdVoyNo
	 */
	public void setTrnkSkdVoyNo(String trnkSkdVoyNo) {
		this.trnkSkdVoyNo = trnkSkdVoyNo;
	}
	
	/**
	 * Column Info
	 * @param n3rdTsPortCd
	 */
	public void setN3rdTsPortCd(String n3rdTsPortCd) {
		this.n3rdTsPortCd = n3rdTsPortCd;
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
	 * @param creDt
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
	}
	
	/**
	 * Column Info
	 * @param n2ndRlaneCd
	 */
	public void setN2ndRlaneCd(String n2ndRlaneCd) {
		this.n2ndRlaneCd = n2ndRlaneCd;
	}
	
	/**
	 * Column Info
	 * @param bkgRcvTermCd
	 */
	public void setBkgRcvTermCd(String bkgRcvTermCd) {
		this.bkgRcvTermCd = bkgRcvTermCd;
	}
	
	/**
	 * Column Info
	 * @param n2ndTsPortCd
	 */
	public void setN2ndTsPortCd(String n2ndTsPortCd) {
		this.n2ndTsPortCd = n2ndTsPortCd;
	}
	
	/**
	 * Column Info
	 * @param ibItchgCtnt
	 */
	public void setIbItchgCtnt(String ibItchgCtnt) {
		this.ibItchgCtnt = ibItchgCtnt;
	}
	
	/**
	 * Column Info
	 * @param n4thFincVvdCd
	 */
	public void setN4thFincVvdCd(String n4thFincVvdCd) {
		this.n4thFincVvdCd = n4thFincVvdCd;
	}
	
	/**
	 * Column Info
	 * @param dgClssCd
	 */
	public void setDgClssCd(String dgClssCd) {
		this.dgClssCd = dgClssCd;
	}
	
	/**
	 * Column Info
	 * @param eqSubstFlg
	 */
	public void setEqSubstFlg(String eqSubstFlg) {
		this.eqSubstFlg = eqSubstFlg;
	}
	
	/**
	 * Column Info
	 * @param trnkAvalSpc
	 */
	public void setTrnkAvalSpc(String trnkAvalSpc) {
		this.trnkAvalSpc = trnkAvalSpc;
	}
	
	/**
	 * Column Info
	 * @param trnkSkdDirCd
	 */
	public void setTrnkSkdDirCd(String trnkSkdDirCd) {
		this.trnkSkdDirCd = trnkSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @param rfaNo
	 */
	public void setRfaNo(String rfaNo) {
		this.rfaNo = rfaNo;
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
	 * @param cmdtCd
	 */
	public void setCmdtCd(String cmdtCd) {
		this.cmdtCd = cmdtCd;
	}
	
	/**
	 * Column Info
	 * @param creOfcCd
	 */
	public void setCreOfcCd(String creOfcCd) {
		this.creOfcCd = creOfcCd;
	}
	
	/**
	 * Column Info
	 * @param routCsSrcDt
	 */
	public void setRoutCsSrcDt(String routCsSrcDt) {
		this.routCsSrcDt = routCsSrcDt;
	}
	
	/**
	 * Column Info
	 * @param dgSpclFlg
	 */
	public void setDgSpclFlg(String dgSpclFlg) {
		this.dgSpclFlg = dgSpclFlg;
	}
	
	/**
	 * Column Info
	 * @param n3rdTrdCd
	 */
	public void setN3rdTrdCd(String n3rdTrdCd) {
		this.n3rdTrdCd = n3rdTrdCd;
	}
	
	/**
	 * Column Info
	 * @param spclAwkCgoFlg
	 */
	public void setSpclAwkCgoFlg(String spclAwkCgoFlg) {
		this.spclAwkCgoFlg = spclAwkCgoFlg;
	}
	
	/**
	 * Column Info
	 * @param routCsNo
	 */
	public void setRoutCsNo(String routCsNo) {
		this.routCsNo = routCsNo;
	}
	
	/**
	 * Column Info
	 * @param rfSpclFlg
	 */
	public void setRfSpclFlg(String rfSpclFlg) {
		this.rfSpclFlg = rfSpclFlg;
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
	 * @param copCreFlg
	 */
	public void setCopCreFlg(String copCreFlg) {
		this.copCreFlg = copCreFlg;
	}
	
	/**
	 * Column Info
	 * @param n1stFincVvdCd
	 */
	public void setN1stFincVvdCd(String n1stFincVvdCd) {
		this.n1stFincVvdCd = n1stFincVvdCd;
	}
	
	/**
	 * Column Info
	 * @param porNodCd
	 */
	public void setPorNodCd(String porNodCd) {
		this.porNodCd = porNodCd;
	}
	
	/**
	 * Column Info
	 * @param cmAmt
	 */
	public void setCmAmt(String cmAmt) {
		this.cmAmt = cmAmt;
	}
	
	/**
	 * Column Info
	 * @param rdSpclFlg
	 */
	public void setRdSpclFlg(String rdSpclFlg) {
		this.rdSpclFlg = rdSpclFlg;
	}
	
	/**
	 * Column Info
	 * @param bkgWgt
	 */
	public void setBkgWgt(String bkgWgt) {
		this.bkgWgt = bkgWgt;
	}
	
	/**
	 * Column Info
	 * @param socFlg
	 */
	public void setSocFlg(String socFlg) {
		this.socFlg = socFlg;
	}
	
	/**
	 * Column Info
	 * @param ttlTztmHrs
	 */
	public void setTtlTztmHrs(String ttlTztmHrs) {
		this.ttlTztmHrs = ttlTztmHrs;
	}
	
	/**
	 * Column Info
	 * @param cneeSeq
	 */
	public void setCneeSeq(String cneeSeq) {
		this.cneeSeq = cneeSeq;
	}
	
	/**
	 * Column Info
	 * @param n2ndFincVvdCd
	 */
	public void setN2ndFincVvdCd(String n2ndFincVvdCd) {
		this.n2ndFincVvdCd = n2ndFincVvdCd;
	}
	
	/**
	 * Column Info
	 * @param mtyRtnYdCd
	 */
	public void setMtyRtnYdCd(String mtyRtnYdCd) {
		this.mtyRtnYdCd = mtyRtnYdCd;
	}
	
	/**
	 * Column Info
	 * @param bkgSelFlg
	 */
	public void setBkgSelFlg(String bkgSelFlg) {
		this.bkgSelFlg = bkgSelFlg;
	}
	
	/**
	 * Column Info
	 * @param bkgDeTermCd
	 */
	public void setBkgDeTermCd(String bkgDeTermCd) {
		this.bkgDeTermCd = bkgDeTermCd;
	}
	
	/**
	 * Column Info
	 * @param repCmdtCd
	 */
	public void setRepCmdtCd(String repCmdtCd) {
		this.repCmdtCd = repCmdtCd;
	}
	
	/**
	 * Column Info
	 * @param bkgWgtUtCd
	 */
	public void setBkgWgtUtCd(String bkgWgtUtCd) {
		this.bkgWgtUtCd = bkgWgtUtCd;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setTtlExpnAmt(JSPUtil.getParameter(request, "ttl_expn_amt", ""));
		setBkgCgoTpCd(JSPUtil.getParameter(request, "bkg_cgo_tp_cd", ""));
		setCostRoutNo(JSPUtil.getParameter(request, "cost_rout_no", ""));
		setN3rdFincVvdCd(JSPUtil.getParameter(request, "n3rd_finc_vvd_cd", ""));
		setProdRev(JSPUtil.getParameter(request, "prod_rev", ""));
		setCltOfcCd(JSPUtil.getParameter(request, "clt_ofc_cd", ""));
		setMtyPkupYdCd(JSPUtil.getParameter(request, "mty_pkup_yd_cd", ""));
		setN1stTsPortCd(JSPUtil.getParameter(request, "n1st_ts_port_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setPctlNo(JSPUtil.getParameter(request, "pctl_no", ""));
		setCneeCntCd(JSPUtil.getParameter(request, "cnee_cnt_cd", ""));
		setObItchgCtnt(JSPUtil.getParameter(request, "ob_itchg_ctnt", ""));
		setN2ndTrdCd(JSPUtil.getParameter(request, "n2nd_trd_cd", ""));
		setPolCd(JSPUtil.getParameter(request, "pol_cd", ""));
		setN4thTrdCd(JSPUtil.getParameter(request, "n4th_trd_cd", ""));
		setHngrSpclFlg(JSPUtil.getParameter(request, "hngr_spcl_flg", ""));
		setScNo(JSPUtil.getParameter(request, "sc_no", ""));
		setSlsOfcCd(JSPUtil.getParameter(request, "sls_ofc_cd", ""));
		setN1stTrdCd(JSPUtil.getParameter(request, "n1st_trd_cd", ""));
		setN1stRlaneCd(JSPUtil.getParameter(request, "n1st_rlane_cd", ""));
		setDelNodCd(JSPUtil.getParameter(request, "del_nod_cd", ""));
		setBbSpclFlg(JSPUtil.getParameter(request, "bb_spcl_flg", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setParaRoutNo(JSPUtil.getParameter(request, "para_rout_no", ""));
		setBkgOfcCd(JSPUtil.getParameter(request, "bkg_ofc_cd", ""));
		setCnstFlg(JSPUtil.getParameter(request, "cnst_flg", ""));
		setDelCd(JSPUtil.getParameter(request, "del_cd", ""));
		setShprCntCd(JSPUtil.getParameter(request, "shpr_cnt_cd", ""));
		setN4thRlaneCd(JSPUtil.getParameter(request, "n4th_rlane_cd", ""));
		setSlsRhqCd(JSPUtil.getParameter(request, "sls_rhq_cd", ""));
		setPpdOfcCd(JSPUtil.getParameter(request, "ppd_ofc_cd", ""));
		setPodCd(JSPUtil.getParameter(request, "pod_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setN3rdRlaneCd(JSPUtil.getParameter(request, "n3rd_rlane_cd", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setRfaOfcCd(JSPUtil.getParameter(request, "rfa_ofc_cd", ""));
		setScOfcCd(JSPUtil.getParameter(request, "sc_ofc_cd", ""));
		setTrnkVslCd(JSPUtil.getParameter(request, "trnk_vsl_cd", ""));
		setShprSeq(JSPUtil.getParameter(request, "shpr_seq", ""));
		setSlsHoCd(JSPUtil.getParameter(request, "sls_ho_cd", ""));
		setTrnkSkdVoyNo(JSPUtil.getParameter(request, "trnk_skd_voy_no", ""));
		setN3rdTsPortCd(JSPUtil.getParameter(request, "n3rd_ts_port_cd", ""));
		setPorCd(JSPUtil.getParameter(request, "por_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setN2ndRlaneCd(JSPUtil.getParameter(request, "n2nd_rlane_cd", ""));
		setBkgRcvTermCd(JSPUtil.getParameter(request, "bkg_rcv_term_cd", ""));
		setN2ndTsPortCd(JSPUtil.getParameter(request, "n2nd_ts_port_cd", ""));
		setIbItchgCtnt(JSPUtil.getParameter(request, "ib_itchg_ctnt", ""));
		setN4thFincVvdCd(JSPUtil.getParameter(request, "n4th_finc_vvd_cd", ""));
		setDgClssCd(JSPUtil.getParameter(request, "dg_clss_cd", ""));
		setEqSubstFlg(JSPUtil.getParameter(request, "eq_subst_flg", ""));
		setTrnkAvalSpc(JSPUtil.getParameter(request, "trnk_aval_spc", ""));
		setTrnkSkdDirCd(JSPUtil.getParameter(request, "trnk_skd_dir_cd", ""));
		setRfaNo(JSPUtil.getParameter(request, "rfa_no", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCmdtCd(JSPUtil.getParameter(request, "cmdt_cd", ""));
		setCreOfcCd(JSPUtil.getParameter(request, "cre_ofc_cd", ""));
		setRoutCsSrcDt(JSPUtil.getParameter(request, "rout_cs_src_dt", ""));
		setDgSpclFlg(JSPUtil.getParameter(request, "dg_spcl_flg", ""));
		setN3rdTrdCd(JSPUtil.getParameter(request, "n3rd_trd_cd", ""));
		setSpclAwkCgoFlg(JSPUtil.getParameter(request, "spcl_awk_cgo_flg", ""));
		setRoutCsNo(JSPUtil.getParameter(request, "rout_cs_no", ""));
		setRfSpclFlg(JSPUtil.getParameter(request, "rf_spcl_flg", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCopCreFlg(JSPUtil.getParameter(request, "cop_cre_flg", ""));
		setN1stFincVvdCd(JSPUtil.getParameter(request, "n1st_finc_vvd_cd", ""));
		setPorNodCd(JSPUtil.getParameter(request, "por_nod_cd", ""));
		setCmAmt(JSPUtil.getParameter(request, "cm_amt", ""));
		setRdSpclFlg(JSPUtil.getParameter(request, "rd_spcl_flg", ""));
		setBkgWgt(JSPUtil.getParameter(request, "bkg_wgt", ""));
		setSocFlg(JSPUtil.getParameter(request, "soc_flg", ""));
		setTtlTztmHrs(JSPUtil.getParameter(request, "ttl_tztm_hrs", ""));
		setCneeSeq(JSPUtil.getParameter(request, "cnee_seq", ""));
		setN2ndFincVvdCd(JSPUtil.getParameter(request, "n2nd_finc_vvd_cd", ""));
		setMtyRtnYdCd(JSPUtil.getParameter(request, "mty_rtn_yd_cd", ""));
		setBkgSelFlg(JSPUtil.getParameter(request, "bkg_sel_flg", ""));
		setBkgDeTermCd(JSPUtil.getParameter(request, "bkg_de_term_cd", ""));
		setRepCmdtCd(JSPUtil.getParameter(request, "rep_cmdt_cd", ""));
		setBkgWgtUtCd(JSPUtil.getParameter(request, "bkg_wgt_ut_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return PriPrsUsdRoutCsInfoVO[]
	 */
	public PriPrsUsdRoutCsInfoVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return PriPrsUsdRoutCsInfoVO[]
	 */
	public PriPrsUsdRoutCsInfoVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		PriPrsUsdRoutCsInfoVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] ttlExpnAmt = (JSPUtil.getParameter(request, prefix	+ "ttl_expn_amt", length));
			String[] bkgCgoTpCd = (JSPUtil.getParameter(request, prefix	+ "bkg_cgo_tp_cd", length));
			String[] costRoutNo = (JSPUtil.getParameter(request, prefix	+ "cost_rout_no", length));
			String[] n3rdFincVvdCd = (JSPUtil.getParameter(request, prefix	+ "n3rd_finc_vvd_cd", length));
			String[] prodRev = (JSPUtil.getParameter(request, prefix	+ "prod_rev", length));
			String[] cltOfcCd = (JSPUtil.getParameter(request, prefix	+ "clt_ofc_cd", length));
			String[] mtyPkupYdCd = (JSPUtil.getParameter(request, prefix	+ "mty_pkup_yd_cd", length));
			String[] n1stTsPortCd = (JSPUtil.getParameter(request, prefix	+ "n1st_ts_port_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] pctlNo = (JSPUtil.getParameter(request, prefix	+ "pctl_no", length));
			String[] cneeCntCd = (JSPUtil.getParameter(request, prefix	+ "cnee_cnt_cd", length));
			String[] obItchgCtnt = (JSPUtil.getParameter(request, prefix	+ "ob_itchg_ctnt", length));
			String[] n2ndTrdCd = (JSPUtil.getParameter(request, prefix	+ "n2nd_trd_cd", length));
			String[] polCd = (JSPUtil.getParameter(request, prefix	+ "pol_cd", length));
			String[] n4thTrdCd = (JSPUtil.getParameter(request, prefix	+ "n4th_trd_cd", length));
			String[] hngrSpclFlg = (JSPUtil.getParameter(request, prefix	+ "hngr_spcl_flg", length));
			String[] scNo = (JSPUtil.getParameter(request, prefix	+ "sc_no", length));
			String[] slsOfcCd = (JSPUtil.getParameter(request, prefix	+ "sls_ofc_cd", length));
			String[] n1stTrdCd = (JSPUtil.getParameter(request, prefix	+ "n1st_trd_cd", length));
			String[] n1stRlaneCd = (JSPUtil.getParameter(request, prefix	+ "n1st_rlane_cd", length));
			String[] delNodCd = (JSPUtil.getParameter(request, prefix	+ "del_nod_cd", length));
			String[] bbSpclFlg = (JSPUtil.getParameter(request, prefix	+ "bb_spcl_flg", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] paraRoutNo = (JSPUtil.getParameter(request, prefix	+ "para_rout_no", length));
			String[] bkgOfcCd = (JSPUtil.getParameter(request, prefix	+ "bkg_ofc_cd", length));
			String[] cnstFlg = (JSPUtil.getParameter(request, prefix	+ "cnst_flg", length));
			String[] delCd = (JSPUtil.getParameter(request, prefix	+ "del_cd", length));
			String[] shprCntCd = (JSPUtil.getParameter(request, prefix	+ "shpr_cnt_cd", length));
			String[] n4thRlaneCd = (JSPUtil.getParameter(request, prefix	+ "n4th_rlane_cd", length));
			String[] slsRhqCd = (JSPUtil.getParameter(request, prefix	+ "sls_rhq_cd", length));
			String[] ppdOfcCd = (JSPUtil.getParameter(request, prefix	+ "ppd_ofc_cd", length));
			String[] podCd = (JSPUtil.getParameter(request, prefix	+ "pod_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] n3rdRlaneCd = (JSPUtil.getParameter(request, prefix	+ "n3rd_rlane_cd", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] rfaOfcCd = (JSPUtil.getParameter(request, prefix	+ "rfa_ofc_cd", length));
			String[] scOfcCd = (JSPUtil.getParameter(request, prefix	+ "sc_ofc_cd", length));
			String[] trnkVslCd = (JSPUtil.getParameter(request, prefix	+ "trnk_vsl_cd", length));
			String[] shprSeq = (JSPUtil.getParameter(request, prefix	+ "shpr_seq", length));
			String[] slsHoCd = (JSPUtil.getParameter(request, prefix	+ "sls_ho_cd", length));
			String[] trnkSkdVoyNo = (JSPUtil.getParameter(request, prefix	+ "trnk_skd_voy_no", length));
			String[] n3rdTsPortCd = (JSPUtil.getParameter(request, prefix	+ "n3rd_ts_port_cd", length));
			String[] porCd = (JSPUtil.getParameter(request, prefix	+ "por_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] n2ndRlaneCd = (JSPUtil.getParameter(request, prefix	+ "n2nd_rlane_cd", length));
			String[] bkgRcvTermCd = (JSPUtil.getParameter(request, prefix	+ "bkg_rcv_term_cd", length));
			String[] n2ndTsPortCd = (JSPUtil.getParameter(request, prefix	+ "n2nd_ts_port_cd", length));
			String[] ibItchgCtnt = (JSPUtil.getParameter(request, prefix	+ "ib_itchg_ctnt", length));
			String[] n4thFincVvdCd = (JSPUtil.getParameter(request, prefix	+ "n4th_finc_vvd_cd", length));
			String[] dgClssCd = (JSPUtil.getParameter(request, prefix	+ "dg_clss_cd", length));
			String[] eqSubstFlg = (JSPUtil.getParameter(request, prefix	+ "eq_subst_flg", length));
			String[] trnkAvalSpc = (JSPUtil.getParameter(request, prefix	+ "trnk_aval_spc", length));
			String[] trnkSkdDirCd = (JSPUtil.getParameter(request, prefix	+ "trnk_skd_dir_cd", length));
			String[] rfaNo = (JSPUtil.getParameter(request, prefix	+ "rfa_no", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] cmdtCd = (JSPUtil.getParameter(request, prefix	+ "cmdt_cd", length));
			String[] creOfcCd = (JSPUtil.getParameter(request, prefix	+ "cre_ofc_cd", length));
			String[] routCsSrcDt = (JSPUtil.getParameter(request, prefix	+ "rout_cs_src_dt", length));
			String[] dgSpclFlg = (JSPUtil.getParameter(request, prefix	+ "dg_spcl_flg", length));
			String[] n3rdTrdCd = (JSPUtil.getParameter(request, prefix	+ "n3rd_trd_cd", length));
			String[] spclAwkCgoFlg = (JSPUtil.getParameter(request, prefix	+ "spcl_awk_cgo_flg", length));
			String[] routCsNo = (JSPUtil.getParameter(request, prefix	+ "rout_cs_no", length));
			String[] rfSpclFlg = (JSPUtil.getParameter(request, prefix	+ "rf_spcl_flg", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] copCreFlg = (JSPUtil.getParameter(request, prefix	+ "cop_cre_flg", length));
			String[] n1stFincVvdCd = (JSPUtil.getParameter(request, prefix	+ "n1st_finc_vvd_cd", length));
			String[] porNodCd = (JSPUtil.getParameter(request, prefix	+ "por_nod_cd", length));
			String[] cmAmt = (JSPUtil.getParameter(request, prefix	+ "cm_amt", length));
			String[] rdSpclFlg = (JSPUtil.getParameter(request, prefix	+ "rd_spcl_flg", length));
			String[] bkgWgt = (JSPUtil.getParameter(request, prefix	+ "bkg_wgt", length));
			String[] socFlg = (JSPUtil.getParameter(request, prefix	+ "soc_flg", length));
			String[] ttlTztmHrs = (JSPUtil.getParameter(request, prefix	+ "ttl_tztm_hrs", length));
			String[] cneeSeq = (JSPUtil.getParameter(request, prefix	+ "cnee_seq", length));
			String[] n2ndFincVvdCd = (JSPUtil.getParameter(request, prefix	+ "n2nd_finc_vvd_cd", length));
			String[] mtyRtnYdCd = (JSPUtil.getParameter(request, prefix	+ "mty_rtn_yd_cd", length));
			String[] bkgSelFlg = (JSPUtil.getParameter(request, prefix	+ "bkg_sel_flg", length));
			String[] bkgDeTermCd = (JSPUtil.getParameter(request, prefix	+ "bkg_de_term_cd", length));
			String[] repCmdtCd = (JSPUtil.getParameter(request, prefix	+ "rep_cmdt_cd", length));
			String[] bkgWgtUtCd = (JSPUtil.getParameter(request, prefix	+ "bkg_wgt_ut_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new PriPrsUsdRoutCsInfoVO();
				if (ttlExpnAmt[i] != null)
					model.setTtlExpnAmt(ttlExpnAmt[i]);
				if (bkgCgoTpCd[i] != null)
					model.setBkgCgoTpCd(bkgCgoTpCd[i]);
				if (costRoutNo[i] != null)
					model.setCostRoutNo(costRoutNo[i]);
				if (n3rdFincVvdCd[i] != null)
					model.setN3rdFincVvdCd(n3rdFincVvdCd[i]);
				if (prodRev[i] != null)
					model.setProdRev(prodRev[i]);
				if (cltOfcCd[i] != null)
					model.setCltOfcCd(cltOfcCd[i]);
				if (mtyPkupYdCd[i] != null)
					model.setMtyPkupYdCd(mtyPkupYdCd[i]);
				if (n1stTsPortCd[i] != null)
					model.setN1stTsPortCd(n1stTsPortCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (pctlNo[i] != null)
					model.setPctlNo(pctlNo[i]);
				if (cneeCntCd[i] != null)
					model.setCneeCntCd(cneeCntCd[i]);
				if (obItchgCtnt[i] != null)
					model.setObItchgCtnt(obItchgCtnt[i]);
				if (n2ndTrdCd[i] != null)
					model.setN2ndTrdCd(n2ndTrdCd[i]);
				if (polCd[i] != null)
					model.setPolCd(polCd[i]);
				if (n4thTrdCd[i] != null)
					model.setN4thTrdCd(n4thTrdCd[i]);
				if (hngrSpclFlg[i] != null)
					model.setHngrSpclFlg(hngrSpclFlg[i]);
				if (scNo[i] != null)
					model.setScNo(scNo[i]);
				if (slsOfcCd[i] != null)
					model.setSlsOfcCd(slsOfcCd[i]);
				if (n1stTrdCd[i] != null)
					model.setN1stTrdCd(n1stTrdCd[i]);
				if (n1stRlaneCd[i] != null)
					model.setN1stRlaneCd(n1stRlaneCd[i]);
				if (delNodCd[i] != null)
					model.setDelNodCd(delNodCd[i]);
				if (bbSpclFlg[i] != null)
					model.setBbSpclFlg(bbSpclFlg[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (paraRoutNo[i] != null)
					model.setParaRoutNo(paraRoutNo[i]);
				if (bkgOfcCd[i] != null)
					model.setBkgOfcCd(bkgOfcCd[i]);
				if (cnstFlg[i] != null)
					model.setCnstFlg(cnstFlg[i]);
				if (delCd[i] != null)
					model.setDelCd(delCd[i]);
				if (shprCntCd[i] != null)
					model.setShprCntCd(shprCntCd[i]);
				if (n4thRlaneCd[i] != null)
					model.setN4thRlaneCd(n4thRlaneCd[i]);
				if (slsRhqCd[i] != null)
					model.setSlsRhqCd(slsRhqCd[i]);
				if (ppdOfcCd[i] != null)
					model.setPpdOfcCd(ppdOfcCd[i]);
				if (podCd[i] != null)
					model.setPodCd(podCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (n3rdRlaneCd[i] != null)
					model.setN3rdRlaneCd(n3rdRlaneCd[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (rfaOfcCd[i] != null)
					model.setRfaOfcCd(rfaOfcCd[i]);
				if (scOfcCd[i] != null)
					model.setScOfcCd(scOfcCd[i]);
				if (trnkVslCd[i] != null)
					model.setTrnkVslCd(trnkVslCd[i]);
				if (shprSeq[i] != null)
					model.setShprSeq(shprSeq[i]);
				if (slsHoCd[i] != null)
					model.setSlsHoCd(slsHoCd[i]);
				if (trnkSkdVoyNo[i] != null)
					model.setTrnkSkdVoyNo(trnkSkdVoyNo[i]);
				if (n3rdTsPortCd[i] != null)
					model.setN3rdTsPortCd(n3rdTsPortCd[i]);
				if (porCd[i] != null)
					model.setPorCd(porCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (n2ndRlaneCd[i] != null)
					model.setN2ndRlaneCd(n2ndRlaneCd[i]);
				if (bkgRcvTermCd[i] != null)
					model.setBkgRcvTermCd(bkgRcvTermCd[i]);
				if (n2ndTsPortCd[i] != null)
					model.setN2ndTsPortCd(n2ndTsPortCd[i]);
				if (ibItchgCtnt[i] != null)
					model.setIbItchgCtnt(ibItchgCtnt[i]);
				if (n4thFincVvdCd[i] != null)
					model.setN4thFincVvdCd(n4thFincVvdCd[i]);
				if (dgClssCd[i] != null)
					model.setDgClssCd(dgClssCd[i]);
				if (eqSubstFlg[i] != null)
					model.setEqSubstFlg(eqSubstFlg[i]);
				if (trnkAvalSpc[i] != null)
					model.setTrnkAvalSpc(trnkAvalSpc[i]);
				if (trnkSkdDirCd[i] != null)
					model.setTrnkSkdDirCd(trnkSkdDirCd[i]);
				if (rfaNo[i] != null)
					model.setRfaNo(rfaNo[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (cmdtCd[i] != null)
					model.setCmdtCd(cmdtCd[i]);
				if (creOfcCd[i] != null)
					model.setCreOfcCd(creOfcCd[i]);
				if (routCsSrcDt[i] != null)
					model.setRoutCsSrcDt(routCsSrcDt[i]);
				if (dgSpclFlg[i] != null)
					model.setDgSpclFlg(dgSpclFlg[i]);
				if (n3rdTrdCd[i] != null)
					model.setN3rdTrdCd(n3rdTrdCd[i]);
				if (spclAwkCgoFlg[i] != null)
					model.setSpclAwkCgoFlg(spclAwkCgoFlg[i]);
				if (routCsNo[i] != null)
					model.setRoutCsNo(routCsNo[i]);
				if (rfSpclFlg[i] != null)
					model.setRfSpclFlg(rfSpclFlg[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (copCreFlg[i] != null)
					model.setCopCreFlg(copCreFlg[i]);
				if (n1stFincVvdCd[i] != null)
					model.setN1stFincVvdCd(n1stFincVvdCd[i]);
				if (porNodCd[i] != null)
					model.setPorNodCd(porNodCd[i]);
				if (cmAmt[i] != null)
					model.setCmAmt(cmAmt[i]);
				if (rdSpclFlg[i] != null)
					model.setRdSpclFlg(rdSpclFlg[i]);
				if (bkgWgt[i] != null)
					model.setBkgWgt(bkgWgt[i]);
				if (socFlg[i] != null)
					model.setSocFlg(socFlg[i]);
				if (ttlTztmHrs[i] != null)
					model.setTtlTztmHrs(ttlTztmHrs[i]);
				if (cneeSeq[i] != null)
					model.setCneeSeq(cneeSeq[i]);
				if (n2ndFincVvdCd[i] != null)
					model.setN2ndFincVvdCd(n2ndFincVvdCd[i]);
				if (mtyRtnYdCd[i] != null)
					model.setMtyRtnYdCd(mtyRtnYdCd[i]);
				if (bkgSelFlg[i] != null)
					model.setBkgSelFlg(bkgSelFlg[i]);
				if (bkgDeTermCd[i] != null)
					model.setBkgDeTermCd(bkgDeTermCd[i]);
				if (repCmdtCd[i] != null)
					model.setRepCmdtCd(repCmdtCd[i]);
				if (bkgWgtUtCd[i] != null)
					model.setBkgWgtUtCd(bkgWgtUtCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getPriPrsUsdRoutCsInfoVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return PriPrsUsdRoutCsInfoVO[]
	 */
	public PriPrsUsdRoutCsInfoVO[] getPriPrsUsdRoutCsInfoVOs(){
		PriPrsUsdRoutCsInfoVO[] vos = (PriPrsUsdRoutCsInfoVO[])models.toArray(new PriPrsUsdRoutCsInfoVO[models.size()]);
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
		this.ttlExpnAmt = this.ttlExpnAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgCgoTpCd = this.bkgCgoTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costRoutNo = this.costRoutNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdFincVvdCd = this.n3rdFincVvdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prodRev = this.prodRev .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cltOfcCd = this.cltOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mtyPkupYdCd = this.mtyPkupYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stTsPortCd = this.n1stTsPortCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pctlNo = this.pctlNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cneeCntCd = this.cneeCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.obItchgCtnt = this.obItchgCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndTrdCd = this.n2ndTrdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.polCd = this.polCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n4thTrdCd = this.n4thTrdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hngrSpclFlg = this.hngrSpclFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.scNo = this.scNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slsOfcCd = this.slsOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stTrdCd = this.n1stTrdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stRlaneCd = this.n1stRlaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.delNodCd = this.delNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bbSpclFlg = this.bbSpclFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.paraRoutNo = this.paraRoutNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgOfcCd = this.bkgOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cnstFlg = this.cnstFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.delCd = this.delCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.shprCntCd = this.shprCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n4thRlaneCd = this.n4thRlaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slsRhqCd = this.slsRhqCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ppdOfcCd = this.ppdOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.podCd = this.podCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdRlaneCd = this.n3rdRlaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rfaOfcCd = this.rfaOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.scOfcCd = this.scOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trnkVslCd = this.trnkVslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.shprSeq = this.shprSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slsHoCd = this.slsHoCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trnkSkdVoyNo = this.trnkSkdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdTsPortCd = this.n3rdTsPortCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.porCd = this.porCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndRlaneCd = this.n2ndRlaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgRcvTermCd = this.bkgRcvTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndTsPortCd = this.n2ndTsPortCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibItchgCtnt = this.ibItchgCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n4thFincVvdCd = this.n4thFincVvdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dgClssCd = this.dgClssCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqSubstFlg = this.eqSubstFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trnkAvalSpc = this.trnkAvalSpc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trnkSkdDirCd = this.trnkSkdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rfaNo = this.rfaNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cmdtCd = this.cmdtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creOfcCd = this.creOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.routCsSrcDt = this.routCsSrcDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dgSpclFlg = this.dgSpclFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdTrdCd = this.n3rdTrdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spclAwkCgoFlg = this.spclAwkCgoFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.routCsNo = this.routCsNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rfSpclFlg = this.rfSpclFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.copCreFlg = this.copCreFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stFincVvdCd = this.n1stFincVvdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.porNodCd = this.porNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cmAmt = this.cmAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rdSpclFlg = this.rdSpclFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgWgt = this.bkgWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.socFlg = this.socFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ttlTztmHrs = this.ttlTztmHrs .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cneeSeq = this.cneeSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndFincVvdCd = this.n2ndFincVvdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mtyRtnYdCd = this.mtyRtnYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgSelFlg = this.bkgSelFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgDeTermCd = this.bkgDeTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.repCmdtCd = this.repCmdtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgWgtUtCd = this.bkgWgtUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
