/*=========================================================
*Copyright(c) 2015 CyberLogitec
*@FileName : PrdProdCtlMstVO.java
*@FileTitle : PrdProdCtlMstVO
*Open Issues :
*Change history :
*@LastModifyDate : 2015.07.02
*@LastModifier : 
*@LastVersion : 1.0
* 2015.07.02  
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.common.table;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;

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

public class PrdProdCtlMstVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<PrdProdCtlMstVO> models = new ArrayList<PrdProdCtlMstVO>();
	
	/* Column Info */
	private String cmlInlndTztmHrs = null;
	/* Column Info */
	private String ttlExpnAmt = null;
	/* Column Info */
	private String bkgCgoTpCd = null;
	/* Column Info */
	private String svcScpCd = null;
	/* Column Info */
	private String cmlOcnTztmHrs = null;
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
	private String bkgHngrBarTpCd = null;
	/* Column Info */
	private String polCd = null;
	/* Column Info */
	private String hngrSpclFlg = null;
	/* Column Info */
	private String scNo = null;
	/* Column Info */
	private String slsOfcCd = null;
	/* Column Info */
	private String delNodCd = null;
	/* Column Info */
	private String bbSpclFlg = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String bkgOfcCd = null;
	/* Column Info */
	private String cnstFlg = null;
	/* Column Info */
	private String delCd = null;
	/* Column Info */
	private String shprCntCd = null;
	/* Column Info */
	private String fullRtnYdCd = null;
	/* Column Info */
	private String podCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String podNodCd = null;
	/* Column Info */
	private String rfaOfcCd = null;
	/* Column Info */
	private String scOfcCd = null;
	/* Column Info */
	private String trnkVslCd = null;
	/* Column Info */
	private String n1stVslLodgDueDt = null;
	/* Column Info */
	private String shprSeq = null;
	/* Column Info */
	private String prmCustFlg = null;
	/* Column Info */
	private String trnkSkdVoyNo = null;
	/* Column Info */
	private String n3rdTsPortCd = null;
	/* Column Info */
	private String porCd = null;
	/* Column Info */
	private String prcCgoTpCd = null;
	/* Column Info */
	private String cmlTtlTztmHrs = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String bkgRcvTermCd = null;
	/* Column Info */
	private String ibItchgCtnt = null;
	/* Column Info */
	private String n2ndTsPortCd = null;
	/* Column Info */
	private String edwUpdDt = null;
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
	private String actCustCntCd = null;
	/* Column Info */
	private String fullPkupYdCd = null;
	/* Column Info */
	private String dgSpclFlg = null;
	/* Column Info */
	private String spclAwkCgoFlg = null;
	/* Column Info */
	private String rfSpclFlg = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String porNodCd = null;
	/* Column Info */
	private String mcntrDorArrDueDt = null;
	/* Column Info */
	private String actCustSeq = null;
	/* Column Info */
	private String polNodCd = null;
	/* Column Info */
	private String rdSpclFlg = null;
	/* Column Info */
	private String routCnstSeq = null;
	/* Column Info */
	private String bkgWgt = null;
	/* Column Info */
	private String socFlg = null;
	/* Column Info */
	private String ttlTztmHrs = null;
	/* Column Info */
	private String cneeSeq = null;
	/* Column Info */
	private String taaNo = null;
	/* Column Info */
	private String mtyRtnYdCd = null;
	/* Column Info */
	private String eqTpCd = null;
	/* Column Info */
	private String bkgDeTermCd = null;
	/* Column Info */
	private String repCmdtCd = null;
	/* Column Info */
	private String bkgWgtUtCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new LinkedHashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new LinkedHashMap<String, String>();
	
	public PrdProdCtlMstVO() {}

	public PrdProdCtlMstVO(String ibflag, String pagerows, String pctlNo, String mtyPkupYdCd, String porCd, String porNodCd, String fullRtnYdCd, String fullPkupYdCd, String polCd, String polNodCd, String n1stTsPortCd, String n2ndTsPortCd, String n3rdTsPortCd, String podCd, String podNodCd, String delCd, String delNodCd, String mtyRtnYdCd, String ttlTztmHrs, String ttlExpnAmt, String trnkAvalSpc, String obItchgCtnt, String ibItchgCtnt, String trnkVslCd, String trnkSkdVoyNo, String trnkSkdDirCd, String n1stVslLodgDueDt, String mcntrDorArrDueDt, String cnstFlg, String bkgCgoTpCd, String bkgRcvTermCd, String bkgDeTermCd, String shprCntCd, String shprSeq, String cneeCntCd, String cneeSeq, String scNo, String rfaNo, String repCmdtCd, String cmdtCd, String dgClssCd, String dgSpclFlg, String rfSpclFlg, String spclAwkCgoFlg, String bbSpclFlg, String rdSpclFlg, String hngrSpclFlg, String socFlg, String eqSubstFlg, String bkgWgt, String bkgWgtUtCd, String slsOfcCd, String bkgOfcCd, String scOfcCd, String rfaOfcCd, String prmCustFlg, String routCnstSeq, String creUsrId, String creDt, String updUsrId, String updDt, String cmlTtlTztmHrs, String cmlOcnTztmHrs, String cmlInlndTztmHrs, String edwUpdDt, String prcCgoTpCd, String eqTpCd, String svcScpCd, String bkgHngrBarTpCd, String actCustCntCd, String actCustSeq, String taaNo) {
		this.cmlInlndTztmHrs = cmlInlndTztmHrs;
		this.ttlExpnAmt = ttlExpnAmt;
		this.bkgCgoTpCd = bkgCgoTpCd;
		this.svcScpCd = svcScpCd;
		this.cmlOcnTztmHrs = cmlOcnTztmHrs;
		this.mtyPkupYdCd = mtyPkupYdCd;
		this.n1stTsPortCd = n1stTsPortCd;
		this.pagerows = pagerows;
		this.pctlNo = pctlNo;
		this.cneeCntCd = cneeCntCd;
		this.obItchgCtnt = obItchgCtnt;
		this.bkgHngrBarTpCd = bkgHngrBarTpCd;
		this.polCd = polCd;
		this.hngrSpclFlg = hngrSpclFlg;
		this.scNo = scNo;
		this.slsOfcCd = slsOfcCd;
		this.delNodCd = delNodCd;
		this.bbSpclFlg = bbSpclFlg;
		this.updUsrId = updUsrId;
		this.bkgOfcCd = bkgOfcCd;
		this.cnstFlg = cnstFlg;
		this.delCd = delCd;
		this.shprCntCd = shprCntCd;
		this.fullRtnYdCd = fullRtnYdCd;
		this.podCd = podCd;
		this.creUsrId = creUsrId;
		this.podNodCd = podNodCd;
		this.rfaOfcCd = rfaOfcCd;
		this.scOfcCd = scOfcCd;
		this.trnkVslCd = trnkVslCd;
		this.n1stVslLodgDueDt = n1stVslLodgDueDt;
		this.shprSeq = shprSeq;
		this.prmCustFlg = prmCustFlg;
		this.trnkSkdVoyNo = trnkSkdVoyNo;
		this.n3rdTsPortCd = n3rdTsPortCd;
		this.porCd = porCd;
		this.prcCgoTpCd = prcCgoTpCd;
		this.cmlTtlTztmHrs = cmlTtlTztmHrs;
		this.creDt = creDt;
		this.bkgRcvTermCd = bkgRcvTermCd;
		this.ibItchgCtnt = ibItchgCtnt;
		this.n2ndTsPortCd = n2ndTsPortCd;
		this.edwUpdDt = edwUpdDt;
		this.dgClssCd = dgClssCd;
		this.eqSubstFlg = eqSubstFlg;
		this.trnkAvalSpc = trnkAvalSpc;
		this.trnkSkdDirCd = trnkSkdDirCd;
		this.rfaNo = rfaNo;
		this.ibflag = ibflag;
		this.cmdtCd = cmdtCd;
		this.actCustCntCd = actCustCntCd;
		this.fullPkupYdCd = fullPkupYdCd;
		this.dgSpclFlg = dgSpclFlg;
		this.spclAwkCgoFlg = spclAwkCgoFlg;
		this.rfSpclFlg = rfSpclFlg;
		this.updDt = updDt;
		this.porNodCd = porNodCd;
		this.mcntrDorArrDueDt = mcntrDorArrDueDt;
		this.actCustSeq = actCustSeq;
		this.polNodCd = polNodCd;
		this.rdSpclFlg = rdSpclFlg;
		this.routCnstSeq = routCnstSeq;
		this.bkgWgt = bkgWgt;
		this.socFlg = socFlg;
		this.ttlTztmHrs = ttlTztmHrs;
		this.cneeSeq = cneeSeq;
		this.taaNo = taaNo;
		this.mtyRtnYdCd = mtyRtnYdCd;
		this.eqTpCd = eqTpCd;
		this.bkgDeTermCd = bkgDeTermCd;
		this.repCmdtCd = repCmdtCd;
		this.bkgWgtUtCd = bkgWgtUtCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("cml_inlnd_tztm_hrs", getCmlInlndTztmHrs());
		this.hashColumns.put("ttl_expn_amt", getTtlExpnAmt());
		this.hashColumns.put("bkg_cgo_tp_cd", getBkgCgoTpCd());
		this.hashColumns.put("svc_scp_cd", getSvcScpCd());
		this.hashColumns.put("cml_ocn_tztm_hrs", getCmlOcnTztmHrs());
		this.hashColumns.put("mty_pkup_yd_cd", getMtyPkupYdCd());
		this.hashColumns.put("n1st_ts_port_cd", getN1stTsPortCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("pctl_no", getPctlNo());
		this.hashColumns.put("cnee_cnt_cd", getCneeCntCd());
		this.hashColumns.put("ob_itchg_ctnt", getObItchgCtnt());
		this.hashColumns.put("bkg_hngr_bar_tp_cd", getBkgHngrBarTpCd());
		this.hashColumns.put("pol_cd", getPolCd());
		this.hashColumns.put("hngr_spcl_flg", getHngrSpclFlg());
		this.hashColumns.put("sc_no", getScNo());
		this.hashColumns.put("sls_ofc_cd", getSlsOfcCd());
		this.hashColumns.put("del_nod_cd", getDelNodCd());
		this.hashColumns.put("bb_spcl_flg", getBbSpclFlg());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("bkg_ofc_cd", getBkgOfcCd());
		this.hashColumns.put("cnst_flg", getCnstFlg());
		this.hashColumns.put("del_cd", getDelCd());
		this.hashColumns.put("shpr_cnt_cd", getShprCntCd());
		this.hashColumns.put("full_rtn_yd_cd", getFullRtnYdCd());
		this.hashColumns.put("pod_cd", getPodCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("pod_nod_cd", getPodNodCd());
		this.hashColumns.put("rfa_ofc_cd", getRfaOfcCd());
		this.hashColumns.put("sc_ofc_cd", getScOfcCd());
		this.hashColumns.put("trnk_vsl_cd", getTrnkVslCd());
		this.hashColumns.put("n1st_vsl_lodg_due_dt", getN1stVslLodgDueDt());
		this.hashColumns.put("shpr_seq", getShprSeq());
		this.hashColumns.put("prm_cust_flg", getPrmCustFlg());
		this.hashColumns.put("trnk_skd_voy_no", getTrnkSkdVoyNo());
		this.hashColumns.put("n3rd_ts_port_cd", getN3rdTsPortCd());
		this.hashColumns.put("por_cd", getPorCd());
		this.hashColumns.put("prc_cgo_tp_cd", getPrcCgoTpCd());
		this.hashColumns.put("cml_ttl_tztm_hrs", getCmlTtlTztmHrs());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("bkg_rcv_term_cd", getBkgRcvTermCd());
		this.hashColumns.put("ib_itchg_ctnt", getIbItchgCtnt());
		this.hashColumns.put("n2nd_ts_port_cd", getN2ndTsPortCd());
		this.hashColumns.put("edw_upd_dt", getEdwUpdDt());
		this.hashColumns.put("dg_clss_cd", getDgClssCd());
		this.hashColumns.put("eq_subst_flg", getEqSubstFlg());
		this.hashColumns.put("trnk_aval_spc", getTrnkAvalSpc());
		this.hashColumns.put("trnk_skd_dir_cd", getTrnkSkdDirCd());
		this.hashColumns.put("rfa_no", getRfaNo());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cmdt_cd", getCmdtCd());
		this.hashColumns.put("act_cust_cnt_cd", getActCustCntCd());
		this.hashColumns.put("full_pkup_yd_cd", getFullPkupYdCd());
		this.hashColumns.put("dg_spcl_flg", getDgSpclFlg());
		this.hashColumns.put("spcl_awk_cgo_flg", getSpclAwkCgoFlg());
		this.hashColumns.put("rf_spcl_flg", getRfSpclFlg());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("por_nod_cd", getPorNodCd());
		this.hashColumns.put("mcntr_dor_arr_due_dt", getMcntrDorArrDueDt());
		this.hashColumns.put("act_cust_seq", getActCustSeq());
		this.hashColumns.put("pol_nod_cd", getPolNodCd());
		this.hashColumns.put("rd_spcl_flg", getRdSpclFlg());
		this.hashColumns.put("rout_cnst_seq", getRoutCnstSeq());
		this.hashColumns.put("bkg_wgt", getBkgWgt());
		this.hashColumns.put("soc_flg", getSocFlg());
		this.hashColumns.put("ttl_tztm_hrs", getTtlTztmHrs());
		this.hashColumns.put("cnee_seq", getCneeSeq());
		this.hashColumns.put("taa_no", getTaaNo());
		this.hashColumns.put("mty_rtn_yd_cd", getMtyRtnYdCd());
		this.hashColumns.put("eq_tp_cd", getEqTpCd());
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
		this.hashFields.put("cml_inlnd_tztm_hrs", "cmlInlndTztmHrs");
		this.hashFields.put("ttl_expn_amt", "ttlExpnAmt");
		this.hashFields.put("bkg_cgo_tp_cd", "bkgCgoTpCd");
		this.hashFields.put("svc_scp_cd", "svcScpCd");
		this.hashFields.put("cml_ocn_tztm_hrs", "cmlOcnTztmHrs");
		this.hashFields.put("mty_pkup_yd_cd", "mtyPkupYdCd");
		this.hashFields.put("n1st_ts_port_cd", "n1stTsPortCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("pctl_no", "pctlNo");
		this.hashFields.put("cnee_cnt_cd", "cneeCntCd");
		this.hashFields.put("ob_itchg_ctnt", "obItchgCtnt");
		this.hashFields.put("bkg_hngr_bar_tp_cd", "bkgHngrBarTpCd");
		this.hashFields.put("pol_cd", "polCd");
		this.hashFields.put("hngr_spcl_flg", "hngrSpclFlg");
		this.hashFields.put("sc_no", "scNo");
		this.hashFields.put("sls_ofc_cd", "slsOfcCd");
		this.hashFields.put("del_nod_cd", "delNodCd");
		this.hashFields.put("bb_spcl_flg", "bbSpclFlg");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("bkg_ofc_cd", "bkgOfcCd");
		this.hashFields.put("cnst_flg", "cnstFlg");
		this.hashFields.put("del_cd", "delCd");
		this.hashFields.put("shpr_cnt_cd", "shprCntCd");
		this.hashFields.put("full_rtn_yd_cd", "fullRtnYdCd");
		this.hashFields.put("pod_cd", "podCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("pod_nod_cd", "podNodCd");
		this.hashFields.put("rfa_ofc_cd", "rfaOfcCd");
		this.hashFields.put("sc_ofc_cd", "scOfcCd");
		this.hashFields.put("trnk_vsl_cd", "trnkVslCd");
		this.hashFields.put("n1st_vsl_lodg_due_dt", "n1stVslLodgDueDt");
		this.hashFields.put("shpr_seq", "shprSeq");
		this.hashFields.put("prm_cust_flg", "prmCustFlg");
		this.hashFields.put("trnk_skd_voy_no", "trnkSkdVoyNo");
		this.hashFields.put("n3rd_ts_port_cd", "n3rdTsPortCd");
		this.hashFields.put("por_cd", "porCd");
		this.hashFields.put("prc_cgo_tp_cd", "prcCgoTpCd");
		this.hashFields.put("cml_ttl_tztm_hrs", "cmlTtlTztmHrs");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("bkg_rcv_term_cd", "bkgRcvTermCd");
		this.hashFields.put("ib_itchg_ctnt", "ibItchgCtnt");
		this.hashFields.put("n2nd_ts_port_cd", "n2ndTsPortCd");
		this.hashFields.put("edw_upd_dt", "edwUpdDt");
		this.hashFields.put("dg_clss_cd", "dgClssCd");
		this.hashFields.put("eq_subst_flg", "eqSubstFlg");
		this.hashFields.put("trnk_aval_spc", "trnkAvalSpc");
		this.hashFields.put("trnk_skd_dir_cd", "trnkSkdDirCd");
		this.hashFields.put("rfa_no", "rfaNo");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cmdt_cd", "cmdtCd");
		this.hashFields.put("act_cust_cnt_cd", "actCustCntCd");
		this.hashFields.put("full_pkup_yd_cd", "fullPkupYdCd");
		this.hashFields.put("dg_spcl_flg", "dgSpclFlg");
		this.hashFields.put("spcl_awk_cgo_flg", "spclAwkCgoFlg");
		this.hashFields.put("rf_spcl_flg", "rfSpclFlg");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("por_nod_cd", "porNodCd");
		this.hashFields.put("mcntr_dor_arr_due_dt", "mcntrDorArrDueDt");
		this.hashFields.put("act_cust_seq", "actCustSeq");
		this.hashFields.put("pol_nod_cd", "polNodCd");
		this.hashFields.put("rd_spcl_flg", "rdSpclFlg");
		this.hashFields.put("rout_cnst_seq", "routCnstSeq");
		this.hashFields.put("bkg_wgt", "bkgWgt");
		this.hashFields.put("soc_flg", "socFlg");
		this.hashFields.put("ttl_tztm_hrs", "ttlTztmHrs");
		this.hashFields.put("cnee_seq", "cneeSeq");
		this.hashFields.put("taa_no", "taaNo");
		this.hashFields.put("mty_rtn_yd_cd", "mtyRtnYdCd");
		this.hashFields.put("eq_tp_cd", "eqTpCd");
		this.hashFields.put("bkg_de_term_cd", "bkgDeTermCd");
		this.hashFields.put("rep_cmdt_cd", "repCmdtCd");
		this.hashFields.put("bkg_wgt_ut_cd", "bkgWgtUtCd");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return cmlInlndTztmHrs
	 */
	public String getCmlInlndTztmHrs() {
		return this.cmlInlndTztmHrs;
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
	 * @return svcScpCd
	 */
	public String getSvcScpCd() {
		return this.svcScpCd;
	}
	
	/**
	 * Column Info
	 * @return cmlOcnTztmHrs
	 */
	public String getCmlOcnTztmHrs() {
		return this.cmlOcnTztmHrs;
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
	 * @return bkgHngrBarTpCd
	 */
	public String getBkgHngrBarTpCd() {
		return this.bkgHngrBarTpCd;
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
	 * @return fullRtnYdCd
	 */
	public String getFullRtnYdCd() {
		return this.fullRtnYdCd;
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
	 * @return podNodCd
	 */
	public String getPodNodCd() {
		return this.podNodCd;
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
	 * @return n1stVslLodgDueDt
	 */
	public String getN1stVslLodgDueDt() {
		return this.n1stVslLodgDueDt;
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
	 * @return prmCustFlg
	 */
	public String getPrmCustFlg() {
		return this.prmCustFlg;
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
	 * @return prcCgoTpCd
	 */
	public String getPrcCgoTpCd() {
		return this.prcCgoTpCd;
	}
	
	/**
	 * Column Info
	 * @return cmlTtlTztmHrs
	 */
	public String getCmlTtlTztmHrs() {
		return this.cmlTtlTztmHrs;
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
	 * @return bkgRcvTermCd
	 */
	public String getBkgRcvTermCd() {
		return this.bkgRcvTermCd;
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
	 * @return n2ndTsPortCd
	 */
	public String getN2ndTsPortCd() {
		return this.n2ndTsPortCd;
	}
	
	/**
	 * Column Info
	 * @return edwUpdDt
	 */
	public String getEdwUpdDt() {
		return this.edwUpdDt;
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
	 * @return actCustCntCd
	 */
	public String getActCustCntCd() {
		return this.actCustCntCd;
	}
	
	/**
	 * Column Info
	 * @return fullPkupYdCd
	 */
	public String getFullPkupYdCd() {
		return this.fullPkupYdCd;
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
	 * @return spclAwkCgoFlg
	 */
	public String getSpclAwkCgoFlg() {
		return this.spclAwkCgoFlg;
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
	 * @return porNodCd
	 */
	public String getPorNodCd() {
		return this.porNodCd;
	}
	
	/**
	 * Column Info
	 * @return mcntrDorArrDueDt
	 */
	public String getMcntrDorArrDueDt() {
		return this.mcntrDorArrDueDt;
	}
	
	/**
	 * Column Info
	 * @return actCustSeq
	 */
	public String getActCustSeq() {
		return this.actCustSeq;
	}
	
	/**
	 * Column Info
	 * @return polNodCd
	 */
	public String getPolNodCd() {
		return this.polNodCd;
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
	 * @return routCnstSeq
	 */
	public String getRoutCnstSeq() {
		return this.routCnstSeq;
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
	 * @return taaNo
	 */
	public String getTaaNo() {
		return this.taaNo;
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
	 * @return eqTpCd
	 */
	public String getEqTpCd() {
		return this.eqTpCd;
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
	 * @param cmlInlndTztmHrs
	 */
	public void setCmlInlndTztmHrs(String cmlInlndTztmHrs) {
		this.cmlInlndTztmHrs = cmlInlndTztmHrs;
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
	 * @param svcScpCd
	 */
	public void setSvcScpCd(String svcScpCd) {
		this.svcScpCd = svcScpCd;
	}
	
	/**
	 * Column Info
	 * @param cmlOcnTztmHrs
	 */
	public void setCmlOcnTztmHrs(String cmlOcnTztmHrs) {
		this.cmlOcnTztmHrs = cmlOcnTztmHrs;
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
	 * @param bkgHngrBarTpCd
	 */
	public void setBkgHngrBarTpCd(String bkgHngrBarTpCd) {
		this.bkgHngrBarTpCd = bkgHngrBarTpCd;
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
	 * @param fullRtnYdCd
	 */
	public void setFullRtnYdCd(String fullRtnYdCd) {
		this.fullRtnYdCd = fullRtnYdCd;
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
	 * @param podNodCd
	 */
	public void setPodNodCd(String podNodCd) {
		this.podNodCd = podNodCd;
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
	 * @param n1stVslLodgDueDt
	 */
	public void setN1stVslLodgDueDt(String n1stVslLodgDueDt) {
		this.n1stVslLodgDueDt = n1stVslLodgDueDt;
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
	 * @param prmCustFlg
	 */
	public void setPrmCustFlg(String prmCustFlg) {
		this.prmCustFlg = prmCustFlg;
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
	 * @param prcCgoTpCd
	 */
	public void setPrcCgoTpCd(String prcCgoTpCd) {
		this.prcCgoTpCd = prcCgoTpCd;
	}
	
	/**
	 * Column Info
	 * @param cmlTtlTztmHrs
	 */
	public void setCmlTtlTztmHrs(String cmlTtlTztmHrs) {
		this.cmlTtlTztmHrs = cmlTtlTztmHrs;
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
	 * @param bkgRcvTermCd
	 */
	public void setBkgRcvTermCd(String bkgRcvTermCd) {
		this.bkgRcvTermCd = bkgRcvTermCd;
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
	 * @param n2ndTsPortCd
	 */
	public void setN2ndTsPortCd(String n2ndTsPortCd) {
		this.n2ndTsPortCd = n2ndTsPortCd;
	}
	
	/**
	 * Column Info
	 * @param edwUpdDt
	 */
	public void setEdwUpdDt(String edwUpdDt) {
		this.edwUpdDt = edwUpdDt;
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
	 * @param actCustCntCd
	 */
	public void setActCustCntCd(String actCustCntCd) {
		this.actCustCntCd = actCustCntCd;
	}
	
	/**
	 * Column Info
	 * @param fullPkupYdCd
	 */
	public void setFullPkupYdCd(String fullPkupYdCd) {
		this.fullPkupYdCd = fullPkupYdCd;
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
	 * @param spclAwkCgoFlg
	 */
	public void setSpclAwkCgoFlg(String spclAwkCgoFlg) {
		this.spclAwkCgoFlg = spclAwkCgoFlg;
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
	 * @param porNodCd
	 */
	public void setPorNodCd(String porNodCd) {
		this.porNodCd = porNodCd;
	}
	
	/**
	 * Column Info
	 * @param mcntrDorArrDueDt
	 */
	public void setMcntrDorArrDueDt(String mcntrDorArrDueDt) {
		this.mcntrDorArrDueDt = mcntrDorArrDueDt;
	}
	
	/**
	 * Column Info
	 * @param actCustSeq
	 */
	public void setActCustSeq(String actCustSeq) {
		this.actCustSeq = actCustSeq;
	}
	
	/**
	 * Column Info
	 * @param polNodCd
	 */
	public void setPolNodCd(String polNodCd) {
		this.polNodCd = polNodCd;
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
	 * @param routCnstSeq
	 */
	public void setRoutCnstSeq(String routCnstSeq) {
		this.routCnstSeq = routCnstSeq;
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
	 * @param taaNo
	 */
	public void setTaaNo(String taaNo) {
		this.taaNo = taaNo;
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
	 * @param eqTpCd
	 */
	public void setEqTpCd(String eqTpCd) {
		this.eqTpCd = eqTpCd;
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
		fromRequest(request,"");
	}

	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request, String prefix) {
		setCmlInlndTztmHrs(JSPUtil.getParameter(request, prefix + "cml_inlnd_tztm_hrs", ""));
		setTtlExpnAmt(JSPUtil.getParameter(request, prefix + "ttl_expn_amt", ""));
		setBkgCgoTpCd(JSPUtil.getParameter(request, prefix + "bkg_cgo_tp_cd", ""));
		setSvcScpCd(JSPUtil.getParameter(request, prefix + "svc_scp_cd", ""));
		setCmlOcnTztmHrs(JSPUtil.getParameter(request, prefix + "cml_ocn_tztm_hrs", ""));
		setMtyPkupYdCd(JSPUtil.getParameter(request, prefix + "mty_pkup_yd_cd", ""));
		setN1stTsPortCd(JSPUtil.getParameter(request, prefix + "n1st_ts_port_cd", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setPctlNo(JSPUtil.getParameter(request, prefix + "pctl_no", ""));
		setCneeCntCd(JSPUtil.getParameter(request, prefix + "cnee_cnt_cd", ""));
		setObItchgCtnt(JSPUtil.getParameter(request, prefix + "ob_itchg_ctnt", ""));
		setBkgHngrBarTpCd(JSPUtil.getParameter(request, prefix + "bkg_hngr_bar_tp_cd", ""));
		setPolCd(JSPUtil.getParameter(request, prefix + "pol_cd", ""));
		setHngrSpclFlg(JSPUtil.getParameter(request, prefix + "hngr_spcl_flg", ""));
		setScNo(JSPUtil.getParameter(request, prefix + "sc_no", ""));
		setSlsOfcCd(JSPUtil.getParameter(request, prefix + "sls_ofc_cd", ""));
		setDelNodCd(JSPUtil.getParameter(request, prefix + "del_nod_cd", ""));
		setBbSpclFlg(JSPUtil.getParameter(request, prefix + "bb_spcl_flg", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setBkgOfcCd(JSPUtil.getParameter(request, prefix + "bkg_ofc_cd", ""));
		setCnstFlg(JSPUtil.getParameter(request, prefix + "cnst_flg", ""));
		setDelCd(JSPUtil.getParameter(request, prefix + "del_cd", ""));
		setShprCntCd(JSPUtil.getParameter(request, prefix + "shpr_cnt_cd", ""));
		setFullRtnYdCd(JSPUtil.getParameter(request, prefix + "full_rtn_yd_cd", ""));
		setPodCd(JSPUtil.getParameter(request, prefix + "pod_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setPodNodCd(JSPUtil.getParameter(request, prefix + "pod_nod_cd", ""));
		setRfaOfcCd(JSPUtil.getParameter(request, prefix + "rfa_ofc_cd", ""));
		setScOfcCd(JSPUtil.getParameter(request, prefix + "sc_ofc_cd", ""));
		setTrnkVslCd(JSPUtil.getParameter(request, prefix + "trnk_vsl_cd", ""));
		setN1stVslLodgDueDt(JSPUtil.getParameter(request, prefix + "n1st_vsl_lodg_due_dt", ""));
		setShprSeq(JSPUtil.getParameter(request, prefix + "shpr_seq", ""));
		setPrmCustFlg(JSPUtil.getParameter(request, prefix + "prm_cust_flg", ""));
		setTrnkSkdVoyNo(JSPUtil.getParameter(request, prefix + "trnk_skd_voy_no", ""));
		setN3rdTsPortCd(JSPUtil.getParameter(request, prefix + "n3rd_ts_port_cd", ""));
		setPorCd(JSPUtil.getParameter(request, prefix + "por_cd", ""));
		setPrcCgoTpCd(JSPUtil.getParameter(request, prefix + "prc_cgo_tp_cd", ""));
		setCmlTtlTztmHrs(JSPUtil.getParameter(request, prefix + "cml_ttl_tztm_hrs", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setBkgRcvTermCd(JSPUtil.getParameter(request, prefix + "bkg_rcv_term_cd", ""));
		setIbItchgCtnt(JSPUtil.getParameter(request, prefix + "ib_itchg_ctnt", ""));
		setN2ndTsPortCd(JSPUtil.getParameter(request, prefix + "n2nd_ts_port_cd", ""));
		setEdwUpdDt(JSPUtil.getParameter(request, prefix + "edw_upd_dt", ""));
		setDgClssCd(JSPUtil.getParameter(request, prefix + "dg_clss_cd", ""));
		setEqSubstFlg(JSPUtil.getParameter(request, prefix + "eq_subst_flg", ""));
		setTrnkAvalSpc(JSPUtil.getParameter(request, prefix + "trnk_aval_spc", ""));
		setTrnkSkdDirCd(JSPUtil.getParameter(request, prefix + "trnk_skd_dir_cd", ""));
		setRfaNo(JSPUtil.getParameter(request, prefix + "rfa_no", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setCmdtCd(JSPUtil.getParameter(request, prefix + "cmdt_cd", ""));
		setActCustCntCd(JSPUtil.getParameter(request, prefix + "act_cust_cnt_cd", ""));
		setFullPkupYdCd(JSPUtil.getParameter(request, prefix + "full_pkup_yd_cd", ""));
		setDgSpclFlg(JSPUtil.getParameter(request, prefix + "dg_spcl_flg", ""));
		setSpclAwkCgoFlg(JSPUtil.getParameter(request, prefix + "spcl_awk_cgo_flg", ""));
		setRfSpclFlg(JSPUtil.getParameter(request, prefix + "rf_spcl_flg", ""));
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setPorNodCd(JSPUtil.getParameter(request, prefix + "por_nod_cd", ""));
		setMcntrDorArrDueDt(JSPUtil.getParameter(request, prefix + "mcntr_dor_arr_due_dt", ""));
		setActCustSeq(JSPUtil.getParameter(request, prefix + "act_cust_seq", ""));
		setPolNodCd(JSPUtil.getParameter(request, prefix + "pol_nod_cd", ""));
		setRdSpclFlg(JSPUtil.getParameter(request, prefix + "rd_spcl_flg", ""));
		setRoutCnstSeq(JSPUtil.getParameter(request, prefix + "rout_cnst_seq", ""));
		setBkgWgt(JSPUtil.getParameter(request, prefix + "bkg_wgt", ""));
		setSocFlg(JSPUtil.getParameter(request, prefix + "soc_flg", ""));
		setTtlTztmHrs(JSPUtil.getParameter(request, prefix + "ttl_tztm_hrs", ""));
		setCneeSeq(JSPUtil.getParameter(request, prefix + "cnee_seq", ""));
		setTaaNo(JSPUtil.getParameter(request, prefix + "taa_no", ""));
		setMtyRtnYdCd(JSPUtil.getParameter(request, prefix + "mty_rtn_yd_cd", ""));
		setEqTpCd(JSPUtil.getParameter(request, prefix + "eq_tp_cd", ""));
		setBkgDeTermCd(JSPUtil.getParameter(request, prefix + "bkg_de_term_cd", ""));
		setRepCmdtCd(JSPUtil.getParameter(request, prefix + "rep_cmdt_cd", ""));
		setBkgWgtUtCd(JSPUtil.getParameter(request, prefix + "bkg_wgt_ut_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return PrdProdCtlMstVO[]
	 */
	public PrdProdCtlMstVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return PrdProdCtlMstVO[]
	 */
	public PrdProdCtlMstVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		PrdProdCtlMstVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] cmlInlndTztmHrs = (JSPUtil.getParameter(request, prefix	+ "cml_inlnd_tztm_hrs", length));
			String[] ttlExpnAmt = (JSPUtil.getParameter(request, prefix	+ "ttl_expn_amt", length));
			String[] bkgCgoTpCd = (JSPUtil.getParameter(request, prefix	+ "bkg_cgo_tp_cd", length));
			String[] svcScpCd = (JSPUtil.getParameter(request, prefix	+ "svc_scp_cd", length));
			String[] cmlOcnTztmHrs = (JSPUtil.getParameter(request, prefix	+ "cml_ocn_tztm_hrs", length));
			String[] mtyPkupYdCd = (JSPUtil.getParameter(request, prefix	+ "mty_pkup_yd_cd", length));
			String[] n1stTsPortCd = (JSPUtil.getParameter(request, prefix	+ "n1st_ts_port_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] pctlNo = (JSPUtil.getParameter(request, prefix	+ "pctl_no", length));
			String[] cneeCntCd = (JSPUtil.getParameter(request, prefix	+ "cnee_cnt_cd", length));
			String[] obItchgCtnt = (JSPUtil.getParameter(request, prefix	+ "ob_itchg_ctnt", length));
			String[] bkgHngrBarTpCd = (JSPUtil.getParameter(request, prefix	+ "bkg_hngr_bar_tp_cd", length));
			String[] polCd = (JSPUtil.getParameter(request, prefix	+ "pol_cd", length));
			String[] hngrSpclFlg = (JSPUtil.getParameter(request, prefix	+ "hngr_spcl_flg", length));
			String[] scNo = (JSPUtil.getParameter(request, prefix	+ "sc_no", length));
			String[] slsOfcCd = (JSPUtil.getParameter(request, prefix	+ "sls_ofc_cd", length));
			String[] delNodCd = (JSPUtil.getParameter(request, prefix	+ "del_nod_cd", length));
			String[] bbSpclFlg = (JSPUtil.getParameter(request, prefix	+ "bb_spcl_flg", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] bkgOfcCd = (JSPUtil.getParameter(request, prefix	+ "bkg_ofc_cd", length));
			String[] cnstFlg = (JSPUtil.getParameter(request, prefix	+ "cnst_flg", length));
			String[] delCd = (JSPUtil.getParameter(request, prefix	+ "del_cd", length));
			String[] shprCntCd = (JSPUtil.getParameter(request, prefix	+ "shpr_cnt_cd", length));
			String[] fullRtnYdCd = (JSPUtil.getParameter(request, prefix	+ "full_rtn_yd_cd", length));
			String[] podCd = (JSPUtil.getParameter(request, prefix	+ "pod_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] podNodCd = (JSPUtil.getParameter(request, prefix	+ "pod_nod_cd", length));
			String[] rfaOfcCd = (JSPUtil.getParameter(request, prefix	+ "rfa_ofc_cd", length));
			String[] scOfcCd = (JSPUtil.getParameter(request, prefix	+ "sc_ofc_cd", length));
			String[] trnkVslCd = (JSPUtil.getParameter(request, prefix	+ "trnk_vsl_cd", length));
			String[] n1stVslLodgDueDt = (JSPUtil.getParameter(request, prefix	+ "n1st_vsl_lodg_due_dt", length));
			String[] shprSeq = (JSPUtil.getParameter(request, prefix	+ "shpr_seq", length));
			String[] prmCustFlg = (JSPUtil.getParameter(request, prefix	+ "prm_cust_flg", length));
			String[] trnkSkdVoyNo = (JSPUtil.getParameter(request, prefix	+ "trnk_skd_voy_no", length));
			String[] n3rdTsPortCd = (JSPUtil.getParameter(request, prefix	+ "n3rd_ts_port_cd", length));
			String[] porCd = (JSPUtil.getParameter(request, prefix	+ "por_cd", length));
			String[] prcCgoTpCd = (JSPUtil.getParameter(request, prefix	+ "prc_cgo_tp_cd", length));
			String[] cmlTtlTztmHrs = (JSPUtil.getParameter(request, prefix	+ "cml_ttl_tztm_hrs", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] bkgRcvTermCd = (JSPUtil.getParameter(request, prefix	+ "bkg_rcv_term_cd", length));
			String[] ibItchgCtnt = (JSPUtil.getParameter(request, prefix	+ "ib_itchg_ctnt", length));
			String[] n2ndTsPortCd = (JSPUtil.getParameter(request, prefix	+ "n2nd_ts_port_cd", length));
			String[] edwUpdDt = (JSPUtil.getParameter(request, prefix	+ "edw_upd_dt", length));
			String[] dgClssCd = (JSPUtil.getParameter(request, prefix	+ "dg_clss_cd", length));
			String[] eqSubstFlg = (JSPUtil.getParameter(request, prefix	+ "eq_subst_flg", length));
			String[] trnkAvalSpc = (JSPUtil.getParameter(request, prefix	+ "trnk_aval_spc", length));
			String[] trnkSkdDirCd = (JSPUtil.getParameter(request, prefix	+ "trnk_skd_dir_cd", length));
			String[] rfaNo = (JSPUtil.getParameter(request, prefix	+ "rfa_no", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] cmdtCd = (JSPUtil.getParameter(request, prefix	+ "cmdt_cd", length));
			String[] actCustCntCd = (JSPUtil.getParameter(request, prefix	+ "act_cust_cnt_cd", length));
			String[] fullPkupYdCd = (JSPUtil.getParameter(request, prefix	+ "full_pkup_yd_cd", length));
			String[] dgSpclFlg = (JSPUtil.getParameter(request, prefix	+ "dg_spcl_flg", length));
			String[] spclAwkCgoFlg = (JSPUtil.getParameter(request, prefix	+ "spcl_awk_cgo_flg", length));
			String[] rfSpclFlg = (JSPUtil.getParameter(request, prefix	+ "rf_spcl_flg", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] porNodCd = (JSPUtil.getParameter(request, prefix	+ "por_nod_cd", length));
			String[] mcntrDorArrDueDt = (JSPUtil.getParameter(request, prefix	+ "mcntr_dor_arr_due_dt", length));
			String[] actCustSeq = (JSPUtil.getParameter(request, prefix	+ "act_cust_seq", length));
			String[] polNodCd = (JSPUtil.getParameter(request, prefix	+ "pol_nod_cd", length));
			String[] rdSpclFlg = (JSPUtil.getParameter(request, prefix	+ "rd_spcl_flg", length));
			String[] routCnstSeq = (JSPUtil.getParameter(request, prefix	+ "rout_cnst_seq", length));
			String[] bkgWgt = (JSPUtil.getParameter(request, prefix	+ "bkg_wgt", length));
			String[] socFlg = (JSPUtil.getParameter(request, prefix	+ "soc_flg", length));
			String[] ttlTztmHrs = (JSPUtil.getParameter(request, prefix	+ "ttl_tztm_hrs", length));
			String[] cneeSeq = (JSPUtil.getParameter(request, prefix	+ "cnee_seq", length));
			String[] taaNo = (JSPUtil.getParameter(request, prefix	+ "taa_no", length));
			String[] mtyRtnYdCd = (JSPUtil.getParameter(request, prefix	+ "mty_rtn_yd_cd", length));
			String[] eqTpCd = (JSPUtil.getParameter(request, prefix	+ "eq_tp_cd", length));
			String[] bkgDeTermCd = (JSPUtil.getParameter(request, prefix	+ "bkg_de_term_cd", length));
			String[] repCmdtCd = (JSPUtil.getParameter(request, prefix	+ "rep_cmdt_cd", length));
			String[] bkgWgtUtCd = (JSPUtil.getParameter(request, prefix	+ "bkg_wgt_ut_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new PrdProdCtlMstVO();
				if (cmlInlndTztmHrs[i] != null)
					model.setCmlInlndTztmHrs(cmlInlndTztmHrs[i]);
				if (ttlExpnAmt[i] != null)
					model.setTtlExpnAmt(ttlExpnAmt[i]);
				if (bkgCgoTpCd[i] != null)
					model.setBkgCgoTpCd(bkgCgoTpCd[i]);
				if (svcScpCd[i] != null)
					model.setSvcScpCd(svcScpCd[i]);
				if (cmlOcnTztmHrs[i] != null)
					model.setCmlOcnTztmHrs(cmlOcnTztmHrs[i]);
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
				if (bkgHngrBarTpCd[i] != null)
					model.setBkgHngrBarTpCd(bkgHngrBarTpCd[i]);
				if (polCd[i] != null)
					model.setPolCd(polCd[i]);
				if (hngrSpclFlg[i] != null)
					model.setHngrSpclFlg(hngrSpclFlg[i]);
				if (scNo[i] != null)
					model.setScNo(scNo[i]);
				if (slsOfcCd[i] != null)
					model.setSlsOfcCd(slsOfcCd[i]);
				if (delNodCd[i] != null)
					model.setDelNodCd(delNodCd[i]);
				if (bbSpclFlg[i] != null)
					model.setBbSpclFlg(bbSpclFlg[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (bkgOfcCd[i] != null)
					model.setBkgOfcCd(bkgOfcCd[i]);
				if (cnstFlg[i] != null)
					model.setCnstFlg(cnstFlg[i]);
				if (delCd[i] != null)
					model.setDelCd(delCd[i]);
				if (shprCntCd[i] != null)
					model.setShprCntCd(shprCntCd[i]);
				if (fullRtnYdCd[i] != null)
					model.setFullRtnYdCd(fullRtnYdCd[i]);
				if (podCd[i] != null)
					model.setPodCd(podCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (podNodCd[i] != null)
					model.setPodNodCd(podNodCd[i]);
				if (rfaOfcCd[i] != null)
					model.setRfaOfcCd(rfaOfcCd[i]);
				if (scOfcCd[i] != null)
					model.setScOfcCd(scOfcCd[i]);
				if (trnkVslCd[i] != null)
					model.setTrnkVslCd(trnkVslCd[i]);
				if (n1stVslLodgDueDt[i] != null)
					model.setN1stVslLodgDueDt(n1stVslLodgDueDt[i]);
				if (shprSeq[i] != null)
					model.setShprSeq(shprSeq[i]);
				if (prmCustFlg[i] != null)
					model.setPrmCustFlg(prmCustFlg[i]);
				if (trnkSkdVoyNo[i] != null)
					model.setTrnkSkdVoyNo(trnkSkdVoyNo[i]);
				if (n3rdTsPortCd[i] != null)
					model.setN3rdTsPortCd(n3rdTsPortCd[i]);
				if (porCd[i] != null)
					model.setPorCd(porCd[i]);
				if (prcCgoTpCd[i] != null)
					model.setPrcCgoTpCd(prcCgoTpCd[i]);
				if (cmlTtlTztmHrs[i] != null)
					model.setCmlTtlTztmHrs(cmlTtlTztmHrs[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (bkgRcvTermCd[i] != null)
					model.setBkgRcvTermCd(bkgRcvTermCd[i]);
				if (ibItchgCtnt[i] != null)
					model.setIbItchgCtnt(ibItchgCtnt[i]);
				if (n2ndTsPortCd[i] != null)
					model.setN2ndTsPortCd(n2ndTsPortCd[i]);
				if (edwUpdDt[i] != null)
					model.setEdwUpdDt(edwUpdDt[i]);
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
				if (actCustCntCd[i] != null)
					model.setActCustCntCd(actCustCntCd[i]);
				if (fullPkupYdCd[i] != null)
					model.setFullPkupYdCd(fullPkupYdCd[i]);
				if (dgSpclFlg[i] != null)
					model.setDgSpclFlg(dgSpclFlg[i]);
				if (spclAwkCgoFlg[i] != null)
					model.setSpclAwkCgoFlg(spclAwkCgoFlg[i]);
				if (rfSpclFlg[i] != null)
					model.setRfSpclFlg(rfSpclFlg[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (porNodCd[i] != null)
					model.setPorNodCd(porNodCd[i]);
				if (mcntrDorArrDueDt[i] != null)
					model.setMcntrDorArrDueDt(mcntrDorArrDueDt[i]);
				if (actCustSeq[i] != null)
					model.setActCustSeq(actCustSeq[i]);
				if (polNodCd[i] != null)
					model.setPolNodCd(polNodCd[i]);
				if (rdSpclFlg[i] != null)
					model.setRdSpclFlg(rdSpclFlg[i]);
				if (routCnstSeq[i] != null)
					model.setRoutCnstSeq(routCnstSeq[i]);
				if (bkgWgt[i] != null)
					model.setBkgWgt(bkgWgt[i]);
				if (socFlg[i] != null)
					model.setSocFlg(socFlg[i]);
				if (ttlTztmHrs[i] != null)
					model.setTtlTztmHrs(ttlTztmHrs[i]);
				if (cneeSeq[i] != null)
					model.setCneeSeq(cneeSeq[i]);
				if (taaNo[i] != null)
					model.setTaaNo(taaNo[i]);
				if (mtyRtnYdCd[i] != null)
					model.setMtyRtnYdCd(mtyRtnYdCd[i]);
				if (eqTpCd[i] != null)
					model.setEqTpCd(eqTpCd[i]);
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
		return getPrdProdCtlMstVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return PrdProdCtlMstVO[]
	 */
	public PrdProdCtlMstVO[] getPrdProdCtlMstVOs(){
		PrdProdCtlMstVO[] vos = (PrdProdCtlMstVO[])models.toArray(new PrdProdCtlMstVO[models.size()]);
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
		this.cmlInlndTztmHrs = this.cmlInlndTztmHrs .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ttlExpnAmt = this.ttlExpnAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgCgoTpCd = this.bkgCgoTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.svcScpCd = this.svcScpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cmlOcnTztmHrs = this.cmlOcnTztmHrs .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mtyPkupYdCd = this.mtyPkupYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stTsPortCd = this.n1stTsPortCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pctlNo = this.pctlNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cneeCntCd = this.cneeCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.obItchgCtnt = this.obItchgCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgHngrBarTpCd = this.bkgHngrBarTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.polCd = this.polCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hngrSpclFlg = this.hngrSpclFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.scNo = this.scNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slsOfcCd = this.slsOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.delNodCd = this.delNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bbSpclFlg = this.bbSpclFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgOfcCd = this.bkgOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cnstFlg = this.cnstFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.delCd = this.delCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.shprCntCd = this.shprCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fullRtnYdCd = this.fullRtnYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.podCd = this.podCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.podNodCd = this.podNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rfaOfcCd = this.rfaOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.scOfcCd = this.scOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trnkVslCd = this.trnkVslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stVslLodgDueDt = this.n1stVslLodgDueDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.shprSeq = this.shprSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prmCustFlg = this.prmCustFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trnkSkdVoyNo = this.trnkSkdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdTsPortCd = this.n3rdTsPortCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.porCd = this.porCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prcCgoTpCd = this.prcCgoTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cmlTtlTztmHrs = this.cmlTtlTztmHrs .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgRcvTermCd = this.bkgRcvTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibItchgCtnt = this.ibItchgCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndTsPortCd = this.n2ndTsPortCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.edwUpdDt = this.edwUpdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dgClssCd = this.dgClssCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqSubstFlg = this.eqSubstFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trnkAvalSpc = this.trnkAvalSpc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trnkSkdDirCd = this.trnkSkdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rfaNo = this.rfaNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cmdtCd = this.cmdtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actCustCntCd = this.actCustCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fullPkupYdCd = this.fullPkupYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dgSpclFlg = this.dgSpclFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spclAwkCgoFlg = this.spclAwkCgoFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rfSpclFlg = this.rfSpclFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.porNodCd = this.porNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mcntrDorArrDueDt = this.mcntrDorArrDueDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actCustSeq = this.actCustSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.polNodCd = this.polNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rdSpclFlg = this.rdSpclFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.routCnstSeq = this.routCnstSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgWgt = this.bkgWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.socFlg = this.socFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ttlTztmHrs = this.ttlTztmHrs .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cneeSeq = this.cneeSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.taaNo = this.taaNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mtyRtnYdCd = this.mtyRtnYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqTpCd = this.eqTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgDeTermCd = this.bkgDeTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.repCmdtCd = this.repCmdtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgWgtUtCd = this.bkgWgtUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
