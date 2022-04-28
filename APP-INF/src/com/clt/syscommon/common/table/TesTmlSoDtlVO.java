/*=========================================================
*Copyright(c) 2017 CyberLogitec
*@FileName : TesTmlSoDtlVO.java
*@FileTitle : TesTmlSoDtlVO
*Open Issues :
*Change history :
*@LastModifyDate : 2017.07.04
*@LastModifier : yyy
*@LastVersion : 1.0
* 2017.07.04 yyy 
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
 * @author yyy
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class TesTmlSoDtlVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<TesTmlSoDtlVO> models = new ArrayList<TesTmlSoDtlVO>();
	
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String stkVolQty = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String toTrVolVal = null;
	/* Column Info */
	private String fincVslCd = null;
	/* Column Info */
	private String tmlAgmtVerNo = null;
	/* Column Info */
	private String freeDyXcldDys = null;
	/* Column Info */
	private String volTrUtCd = null;
	/* Column Info */
	private String cntrTpszCd = null;
	/* Column Info */
	private String invXchRt = null;
	/* Column Info */
	private String tmlSoDtlSeq = null;
	/* Column Info */
	private String calcVolQty = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String revYrmon = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String dcgoIndCd = null;
	/* Column Info */
	private String calcAmt = null;
	/* Column Info */
	private String eqTpszCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String fpTeuQty = null;
	/* Column Info */
	private String tmlAgmtSeq = null;
	/* Column Info */
	private String tmlSoSeq = null;
	/* Column Info */
	private String loclUpdDt = null;
	/* Column Info */
	private String rcFlg = null;
	/* Column Info */
	private String ovrDys = null;
	/* Column Info */
	private String subTrdCd = null;
	/* Column Info */
	private String laneCd = null;
	/* Column Info */
	private String ediSoDtlId = null;
	/* Column Info */
	private String tmlTrnsModCd = null;
	/* Column Info */
	private String currCd = null;
	/* Column Info */
	private String fincSkdDirCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String edwUpdDt = null;
	/* Column Info */
	private String tmlCrrCd = null;
	/* Column Info */
	private String calcCostGrpCd = null;
	/* Column Info */
	private String atbDt = null;
	/* Column Info */
	private String calcTpCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String eqNo = null;
	/* Column Info */
	private String stayDys = null;
	/* Column Info */
	private String fpCalcPrdCd = null;
	/* Column Info */
	private String acctCd = null;
	/* Column Info */
	private String invAmt = null;
	/* Column Info */
	private String wrkDt = null;
	/* Column Info */
	private String trStayDys = null;
	/* Column Info */
	private String ovrVolQty = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String n3ptyFlg = null;
	/* Column Info */
	private String iocCd = null;
	/* Column Info */
	private String tmlAgmtOfcCtyCd = null;
	/* Column Info */
	private String rvisVolQty = null;
	/* Column Info */
	private String fincSkdVoyNo = null;
	/* Column Info */
	private String refVndrSeq = null;
	/* Column Info */
	private String ctrtRt = null;
	/* Column Info */
	private String semiAutoCalcFlg = null;
	/* Column Info */
	private String calcRmk = null;
	/* Column Info */
	private String loclCreDt = null;
	/* Column Info */
	private String fmTrVolVal = null;
	/* Column Info */
	private String diffVolQty = null;
	/* Column Info */
	private String eqKndCd = null;
	/* Column Info */
	private String ioBndCd = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Column Info */
	private String payDys = null;
	/* Column Info */
	private String freeDys = null;
	/* Column Info */
	private String cntrStyCd = null;
	/* Column Info */
	private String cntrNo = null;
	/* Column Info */
	private String lgsCostCd = null;
	/* Column Info */
	private String rfMntrDys = null;
	/* Column Info */
	private String invVolQty = null;
	/* Column Info */
	private String tmlWrkDyCd = null;
	/* Column Info */
	private String tmlSoOfcCtyCd = null;
	/* Column Info */
	private String bbCgoFlg = null;
	/* Column Info */
	private String awkCgoFlg = null;
	
	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new LinkedHashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new LinkedHashMap<String, String>();
	
	public TesTmlSoDtlVO() {}

	public TesTmlSoDtlVO(String ibflag, String pagerows, String vslCd, String trStayDys, String stkVolQty, String toTrVolVal, String fincVslCd, String tmlAgmtVerNo, String freeDyXcldDys, String volTrUtCd, String cntrTpszCd, String updUsrId, String calcVolQty, String tmlSoDtlSeq, String invXchRt, String revYrmon, String skdVoyNo, String dcgoIndCd, String calcAmt, String eqTpszCd, String creUsrId, String fpTeuQty, String tmlAgmtSeq, String tmlSoSeq, String loclUpdDt, String rcFlg, String ovrDys, String subTrdCd, String laneCd, String ediSoDtlId, String tmlTrnsModCd, String currCd, String fincSkdDirCd, String creDt, String edwUpdDt, String tmlCrrCd, String calcCostGrpCd, String atbDt, String calcTpCd, String eqNo, String stayDys, String fpCalcPrdCd, String acctCd, String invAmt, String wrkDt, String updDt, String n3ptyFlg, String iocCd, String ovrVolQty, String tmlAgmtOfcCtyCd, String fincSkdVoyNo, String rvisVolQty, String semiAutoCalcFlg, String ctrtRt, String refVndrSeq, String calcRmk, String loclCreDt, String fmTrVolVal, String diffVolQty, String eqKndCd, String ioBndCd, String skdDirCd, String payDys, String cntrStyCd, String freeDys, String cntrNo, String lgsCostCd, String rfMntrDys, String tmlWrkDyCd, String invVolQty, String tmlSoOfcCtyCd, String bbCgoFlg, String awkCgoFlg) {
		this.vslCd = vslCd;
		this.stkVolQty = stkVolQty;
		this.pagerows = pagerows;
		this.toTrVolVal = toTrVolVal;
		this.fincVslCd = fincVslCd;
		this.tmlAgmtVerNo = tmlAgmtVerNo;
		this.freeDyXcldDys = freeDyXcldDys;
		this.volTrUtCd = volTrUtCd;
		this.cntrTpszCd = cntrTpszCd;
		this.invXchRt = invXchRt;
		this.tmlSoDtlSeq = tmlSoDtlSeq;
		this.calcVolQty = calcVolQty;
		this.updUsrId = updUsrId;
		this.revYrmon = revYrmon;
		this.skdVoyNo = skdVoyNo;
		this.dcgoIndCd = dcgoIndCd;
		this.calcAmt = calcAmt;
		this.eqTpszCd = eqTpszCd;
		this.creUsrId = creUsrId;
		this.fpTeuQty = fpTeuQty;
		this.tmlAgmtSeq = tmlAgmtSeq;
		this.tmlSoSeq = tmlSoSeq;
		this.loclUpdDt = loclUpdDt;
		this.rcFlg = rcFlg;
		this.ovrDys = ovrDys;
		this.subTrdCd = subTrdCd;
		this.laneCd = laneCd;
		this.ediSoDtlId = ediSoDtlId;
		this.tmlTrnsModCd = tmlTrnsModCd;
		this.currCd = currCd;
		this.fincSkdDirCd = fincSkdDirCd;
		this.creDt = creDt;
		this.edwUpdDt = edwUpdDt;
		this.tmlCrrCd = tmlCrrCd;
		this.calcCostGrpCd = calcCostGrpCd;
		this.atbDt = atbDt;
		this.calcTpCd = calcTpCd;
		this.ibflag = ibflag;
		this.eqNo = eqNo;
		this.stayDys = stayDys;
		this.fpCalcPrdCd = fpCalcPrdCd;
		this.acctCd = acctCd;
		this.invAmt = invAmt;
		this.wrkDt = wrkDt;
		this.trStayDys = trStayDys;
		this.ovrVolQty = ovrVolQty;
		this.updDt = updDt;
		this.n3ptyFlg = n3ptyFlg;
		this.iocCd = iocCd;
		this.tmlAgmtOfcCtyCd = tmlAgmtOfcCtyCd;
		this.rvisVolQty = rvisVolQty;
		this.fincSkdVoyNo = fincSkdVoyNo;
		this.refVndrSeq = refVndrSeq;
		this.ctrtRt = ctrtRt;
		this.semiAutoCalcFlg = semiAutoCalcFlg;
		this.calcRmk = calcRmk;
		this.loclCreDt = loclCreDt;
		this.fmTrVolVal = fmTrVolVal;
		this.diffVolQty = diffVolQty;
		this.eqKndCd = eqKndCd;
		this.ioBndCd = ioBndCd;
		this.skdDirCd = skdDirCd;
		this.payDys = payDys;
		this.freeDys = freeDys;
		this.cntrStyCd = cntrStyCd;
		this.cntrNo = cntrNo;
		this.lgsCostCd = lgsCostCd;
		this.rfMntrDys = rfMntrDys;
		this.invVolQty = invVolQty;
		this.tmlWrkDyCd = tmlWrkDyCd;
		this.tmlSoOfcCtyCd = tmlSoOfcCtyCd;
		this.bbCgoFlg = bbCgoFlg;
		this.awkCgoFlg = awkCgoFlg;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("stk_vol_qty", getStkVolQty());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("to_tr_vol_val", getToTrVolVal());
		this.hashColumns.put("finc_vsl_cd", getFincVslCd());
		this.hashColumns.put("tml_agmt_ver_no", getTmlAgmtVerNo());
		this.hashColumns.put("free_dy_xcld_dys", getFreeDyXcldDys());
		this.hashColumns.put("vol_tr_ut_cd", getVolTrUtCd());
		this.hashColumns.put("cntr_tpsz_cd", getCntrTpszCd());
		this.hashColumns.put("inv_xch_rt", getInvXchRt());
		this.hashColumns.put("tml_so_dtl_seq", getTmlSoDtlSeq());
		this.hashColumns.put("calc_vol_qty", getCalcVolQty());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("rev_yrmon", getRevYrmon());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("dcgo_ind_cd", getDcgoIndCd());
		this.hashColumns.put("calc_amt", getCalcAmt());
		this.hashColumns.put("eq_tpsz_cd", getEqTpszCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("fp_teu_qty", getFpTeuQty());
		this.hashColumns.put("tml_agmt_seq", getTmlAgmtSeq());
		this.hashColumns.put("tml_so_seq", getTmlSoSeq());
		this.hashColumns.put("locl_upd_dt", getLoclUpdDt());
		this.hashColumns.put("rc_flg", getRcFlg());
		this.hashColumns.put("ovr_dys", getOvrDys());
		this.hashColumns.put("sub_trd_cd", getSubTrdCd());
		this.hashColumns.put("lane_cd", getLaneCd());
		this.hashColumns.put("edi_so_dtl_id", getEdiSoDtlId());
		this.hashColumns.put("tml_trns_mod_cd", getTmlTrnsModCd());
		this.hashColumns.put("curr_cd", getCurrCd());
		this.hashColumns.put("finc_skd_dir_cd", getFincSkdDirCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("edw_upd_dt", getEdwUpdDt());
		this.hashColumns.put("tml_crr_cd", getTmlCrrCd());
		this.hashColumns.put("calc_cost_grp_cd", getCalcCostGrpCd());
		this.hashColumns.put("atb_dt", getAtbDt());
		this.hashColumns.put("calc_tp_cd", getCalcTpCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("eq_no", getEqNo());
		this.hashColumns.put("stay_dys", getStayDys());
		this.hashColumns.put("fp_calc_prd_cd", getFpCalcPrdCd());
		this.hashColumns.put("acct_cd", getAcctCd());
		this.hashColumns.put("inv_amt", getInvAmt());
		this.hashColumns.put("wrk_dt", getWrkDt());
		this.hashColumns.put("tr_stay_dys", getTrStayDys());
		this.hashColumns.put("ovr_vol_qty", getOvrVolQty());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("n3pty_flg", getN3ptyFlg());
		this.hashColumns.put("ioc_cd", getIocCd());
		this.hashColumns.put("tml_agmt_ofc_cty_cd", getTmlAgmtOfcCtyCd());
		this.hashColumns.put("rvis_vol_qty", getRvisVolQty());
		this.hashColumns.put("finc_skd_voy_no", getFincSkdVoyNo());
		this.hashColumns.put("ref_vndr_seq", getRefVndrSeq());
		this.hashColumns.put("ctrt_rt", getCtrtRt());
		this.hashColumns.put("semi_auto_calc_flg", getSemiAutoCalcFlg());
		this.hashColumns.put("calc_rmk", getCalcRmk());
		this.hashColumns.put("locl_cre_dt", getLoclCreDt());
		this.hashColumns.put("fm_tr_vol_val", getFmTrVolVal());
		this.hashColumns.put("diff_vol_qty", getDiffVolQty());
		this.hashColumns.put("eq_knd_cd", getEqKndCd());
		this.hashColumns.put("io_bnd_cd", getIoBndCd());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("pay_dys", getPayDys());
		this.hashColumns.put("free_dys", getFreeDys());
		this.hashColumns.put("cntr_sty_cd", getCntrStyCd());
		this.hashColumns.put("cntr_no", getCntrNo());
		this.hashColumns.put("lgs_cost_cd", getLgsCostCd());
		this.hashColumns.put("rf_mntr_dys", getRfMntrDys());
		this.hashColumns.put("inv_vol_qty", getInvVolQty());
		this.hashColumns.put("tml_wrk_dy_cd", getTmlWrkDyCd());
		this.hashColumns.put("tml_so_ofc_cty_cd", getTmlSoOfcCtyCd());
		this.hashColumns.put("bb_cgo_flg", getBbCgoFlg());
		this.hashColumns.put("awk_cgo_flg", getAwkCgoFlg());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("stk_vol_qty", "stkVolQty");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("to_tr_vol_val", "toTrVolVal");
		this.hashFields.put("finc_vsl_cd", "fincVslCd");
		this.hashFields.put("tml_agmt_ver_no", "tmlAgmtVerNo");
		this.hashFields.put("free_dy_xcld_dys", "freeDyXcldDys");
		this.hashFields.put("vol_tr_ut_cd", "volTrUtCd");
		this.hashFields.put("cntr_tpsz_cd", "cntrTpszCd");
		this.hashFields.put("inv_xch_rt", "invXchRt");
		this.hashFields.put("tml_so_dtl_seq", "tmlSoDtlSeq");
		this.hashFields.put("calc_vol_qty", "calcVolQty");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("rev_yrmon", "revYrmon");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("dcgo_ind_cd", "dcgoIndCd");
		this.hashFields.put("calc_amt", "calcAmt");
		this.hashFields.put("eq_tpsz_cd", "eqTpszCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("fp_teu_qty", "fpTeuQty");
		this.hashFields.put("tml_agmt_seq", "tmlAgmtSeq");
		this.hashFields.put("tml_so_seq", "tmlSoSeq");
		this.hashFields.put("locl_upd_dt", "loclUpdDt");
		this.hashFields.put("rc_flg", "rcFlg");
		this.hashFields.put("ovr_dys", "ovrDys");
		this.hashFields.put("sub_trd_cd", "subTrdCd");
		this.hashFields.put("lane_cd", "laneCd");
		this.hashFields.put("edi_so_dtl_id", "ediSoDtlId");
		this.hashFields.put("tml_trns_mod_cd", "tmlTrnsModCd");
		this.hashFields.put("curr_cd", "currCd");
		this.hashFields.put("finc_skd_dir_cd", "fincSkdDirCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("edw_upd_dt", "edwUpdDt");
		this.hashFields.put("tml_crr_cd", "tmlCrrCd");
		this.hashFields.put("calc_cost_grp_cd", "calcCostGrpCd");
		this.hashFields.put("atb_dt", "atbDt");
		this.hashFields.put("calc_tp_cd", "calcTpCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("eq_no", "eqNo");
		this.hashFields.put("stay_dys", "stayDys");
		this.hashFields.put("fp_calc_prd_cd", "fpCalcPrdCd");
		this.hashFields.put("acct_cd", "acctCd");
		this.hashFields.put("inv_amt", "invAmt");
		this.hashFields.put("wrk_dt", "wrkDt");
		this.hashFields.put("tr_stay_dys", "trStayDys");
		this.hashFields.put("ovr_vol_qty", "ovrVolQty");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("n3pty_flg", "n3ptyFlg");
		this.hashFields.put("ioc_cd", "iocCd");
		this.hashFields.put("tml_agmt_ofc_cty_cd", "tmlAgmtOfcCtyCd");
		this.hashFields.put("rvis_vol_qty", "rvisVolQty");
		this.hashFields.put("finc_skd_voy_no", "fincSkdVoyNo");
		this.hashFields.put("ref_vndr_seq", "refVndrSeq");
		this.hashFields.put("ctrt_rt", "ctrtRt");
		this.hashFields.put("semi_auto_calc_flg", "semiAutoCalcFlg");
		this.hashFields.put("calc_rmk", "calcRmk");
		this.hashFields.put("locl_cre_dt", "loclCreDt");
		this.hashFields.put("fm_tr_vol_val", "fmTrVolVal");
		this.hashFields.put("diff_vol_qty", "diffVolQty");
		this.hashFields.put("eq_knd_cd", "eqKndCd");
		this.hashFields.put("io_bnd_cd", "ioBndCd");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("pay_dys", "payDys");
		this.hashFields.put("free_dys", "freeDys");
		this.hashFields.put("cntr_sty_cd", "cntrStyCd");
		this.hashFields.put("cntr_no", "cntrNo");
		this.hashFields.put("lgs_cost_cd", "lgsCostCd");
		this.hashFields.put("rf_mntr_dys", "rfMntrDys");
		this.hashFields.put("inv_vol_qty", "invVolQty");
		this.hashFields.put("tml_wrk_dy_cd", "tmlWrkDyCd");
		this.hashFields.put("tml_so_ofc_cty_cd", "tmlSoOfcCtyCd");
		this.hashFields.put("bb_cgo_flg", "bbCgoFlg");
		this.hashFields.put("awk_cgo_flg", "awkCgoFlg");
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
	 * @return stkVolQty
	 */
	public String getStkVolQty() {
		return this.stkVolQty;
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
	 * @return toTrVolVal
	 */
	public String getToTrVolVal() {
		return this.toTrVolVal;
	}
	
	/**
	 * Column Info
	 * @return fincVslCd
	 */
	public String getFincVslCd() {
		return this.fincVslCd;
	}
	
	/**
	 * Column Info
	 * @return tmlAgmtVerNo
	 */
	public String getTmlAgmtVerNo() {
		return this.tmlAgmtVerNo;
	}
	
	/**
	 * Column Info
	 * @return freeDyXcldDys
	 */
	public String getFreeDyXcldDys() {
		return this.freeDyXcldDys;
	}
	
	/**
	 * Column Info
	 * @return volTrUtCd
	 */
	public String getVolTrUtCd() {
		return this.volTrUtCd;
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
	 * @return invXchRt
	 */
	public String getInvXchRt() {
		return this.invXchRt;
	}
	
	/**
	 * Column Info
	 * @return tmlSoDtlSeq
	 */
	public String getTmlSoDtlSeq() {
		return this.tmlSoDtlSeq;
	}
	
	/**
	 * Column Info
	 * @return calcVolQty
	 */
	public String getCalcVolQty() {
		return this.calcVolQty;
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
	 * @return revYrmon
	 */
	public String getRevYrmon() {
		return this.revYrmon;
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
	 * @return dcgoIndCd
	 */
	public String getDcgoIndCd() {
		return this.dcgoIndCd;
	}
	
	/**
	 * Column Info
	 * @return calcAmt
	 */
	public String getCalcAmt() {
		return this.calcAmt;
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
	 * @return creUsrId
	 */
	public String getCreUsrId() {
		return this.creUsrId;
	}
	
	/**
	 * Column Info
	 * @return fpTeuQty
	 */
	public String getFpTeuQty() {
		return this.fpTeuQty;
	}
	
	/**
	 * Column Info
	 * @return tmlAgmtSeq
	 */
	public String getTmlAgmtSeq() {
		return this.tmlAgmtSeq;
	}
	
	/**
	 * Column Info
	 * @return tmlSoSeq
	 */
	public String getTmlSoSeq() {
		return this.tmlSoSeq;
	}
	
	/**
	 * Column Info
	 * @return loclUpdDt
	 */
	public String getLoclUpdDt() {
		return this.loclUpdDt;
	}
	
	/**
	 * Column Info
	 * @return rcFlg
	 */
	public String getRcFlg() {
		return this.rcFlg;
	}
	
	/**
	 * Column Info
	 * @return ovrDys
	 */
	public String getOvrDys() {
		return this.ovrDys;
	}
	
	/**
	 * Column Info
	 * @return subTrdCd
	 */
	public String getSubTrdCd() {
		return this.subTrdCd;
	}
	
	/**
	 * Column Info
	 * @return laneCd
	 */
	public String getLaneCd() {
		return this.laneCd;
	}
	
	/**
	 * Column Info
	 * @return ediSoDtlId
	 */
	public String getEdiSoDtlId() {
		return this.ediSoDtlId;
	}
	
	/**
	 * Column Info
	 * @return tmlTrnsModCd
	 */
	public String getTmlTrnsModCd() {
		return this.tmlTrnsModCd;
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
	 * @return fincSkdDirCd
	 */
	public String getFincSkdDirCd() {
		return this.fincSkdDirCd;
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
	 * @return edwUpdDt
	 */
	public String getEdwUpdDt() {
		return this.edwUpdDt;
	}
	
	/**
	 * Column Info
	 * @return tmlCrrCd
	 */
	public String getTmlCrrCd() {
		return this.tmlCrrCd;
	}
	
	/**
	 * Column Info
	 * @return calcCostGrpCd
	 */
	public String getCalcCostGrpCd() {
		return this.calcCostGrpCd;
	}
	
	/**
	 * Column Info
	 * @return atbDt
	 */
	public String getAtbDt() {
		return this.atbDt;
	}
	
	/**
	 * Column Info
	 * @return calcTpCd
	 */
	public String getCalcTpCd() {
		return this.calcTpCd;
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
	 * @return stayDys
	 */
	public String getStayDys() {
		return this.stayDys;
	}
	
	/**
	 * Column Info
	 * @return fpCalcPrdCd
	 */
	public String getFpCalcPrdCd() {
		return this.fpCalcPrdCd;
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
	 * @return invAmt
	 */
	public String getInvAmt() {
		return this.invAmt;
	}
	
	/**
	 * Column Info
	 * @return wrkDt
	 */
	public String getWrkDt() {
		return this.wrkDt;
	}
	
	/**
	 * Column Info
	 * @return trStayDys
	 */
	public String getTrStayDys() {
		return this.trStayDys;
	}
	
	/**
	 * Column Info
	 * @return ovrVolQty
	 */
	public String getOvrVolQty() {
		return this.ovrVolQty;
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
	 * @return n3ptyFlg
	 */
	public String getN3ptyFlg() {
		return this.n3ptyFlg;
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
	 * @return tmlAgmtOfcCtyCd
	 */
	public String getTmlAgmtOfcCtyCd() {
		return this.tmlAgmtOfcCtyCd;
	}
	
	/**
	 * Column Info
	 * @return rvisVolQty
	 */
	public String getRvisVolQty() {
		return this.rvisVolQty;
	}
	
	/**
	 * Column Info
	 * @return fincSkdVoyNo
	 */
	public String getFincSkdVoyNo() {
		return this.fincSkdVoyNo;
	}
	
	/**
	 * Column Info
	 * @return refVndrSeq
	 */
	public String getRefVndrSeq() {
		return this.refVndrSeq;
	}
	
	/**
	 * Column Info
	 * @return ctrtRt
	 */
	public String getCtrtRt() {
		return this.ctrtRt;
	}
	
	/**
	 * Column Info
	 * @return semiAutoCalcFlg
	 */
	public String getSemiAutoCalcFlg() {
		return this.semiAutoCalcFlg;
	}
	
	/**
	 * Column Info
	 * @return calcRmk
	 */
	public String getCalcRmk() {
		return this.calcRmk;
	}
	
	/**
	 * Column Info
	 * @return loclCreDt
	 */
	public String getLoclCreDt() {
		return this.loclCreDt;
	}
	
	/**
	 * Column Info
	 * @return fmTrVolVal
	 */
	public String getFmTrVolVal() {
		return this.fmTrVolVal;
	}
	
	/**
	 * Column Info
	 * @return diffVolQty
	 */
	public String getDiffVolQty() {
		return this.diffVolQty;
	}
	
	/**
	 * Column Info
	 * @return eqKndCd
	 */
	public String getEqKndCd() {
		return this.eqKndCd;
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
	 * @return skdDirCd
	 */
	public String getSkdDirCd() {
		return this.skdDirCd;
	}
	
	/**
	 * Column Info
	 * @return payDys
	 */
	public String getPayDys() {
		return this.payDys;
	}
	
	/**
	 * Column Info
	 * @return freeDys
	 */
	public String getFreeDys() {
		return this.freeDys;
	}
	
	/**
	 * Column Info
	 * @return cntrStyCd
	 */
	public String getCntrStyCd() {
		return this.cntrStyCd;
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
	 * @return lgsCostCd
	 */
	public String getLgsCostCd() {
		return this.lgsCostCd;
	}
	
	/**
	 * Column Info
	 * @return rfMntrDys
	 */
	public String getRfMntrDys() {
		return this.rfMntrDys;
	}
	
	/**
	 * Column Info
	 * @return invVolQty
	 */
	public String getInvVolQty() {
		return this.invVolQty;
	}
	
	/**
	 * Column Info
	 * @return tmlWrkDyCd
	 */
	public String getTmlWrkDyCd() {
		return this.tmlWrkDyCd;
	}
	
	/**
	 * Column Info
	 * @return tmlSoOfcCtyCd
	 */
	public String getTmlSoOfcCtyCd() {
		return this.tmlSoOfcCtyCd;
	}
	
	/**
	 * Column Info
	 * @return bbCgoFlg
	 */
	public String getBbCgoFlg() {
		return this.bbCgoFlg;
	}
	
	/**
	 * Column Info
	 * @return awkCgoFlg
	 */
	public String getAwkCgoFlg() {
		return this.awkCgoFlg;
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
	 * @param stkVolQty
	 */
	public void setStkVolQty(String stkVolQty) {
		this.stkVolQty = stkVolQty;
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
	 * @param toTrVolVal
	 */
	public void setToTrVolVal(String toTrVolVal) {
		this.toTrVolVal = toTrVolVal;
	}
	
	/**
	 * Column Info
	 * @param fincVslCd
	 */
	public void setFincVslCd(String fincVslCd) {
		this.fincVslCd = fincVslCd;
	}
	
	/**
	 * Column Info
	 * @param tmlAgmtVerNo
	 */
	public void setTmlAgmtVerNo(String tmlAgmtVerNo) {
		this.tmlAgmtVerNo = tmlAgmtVerNo;
	}
	
	/**
	 * Column Info
	 * @param freeDyXcldDys
	 */
	public void setFreeDyXcldDys(String freeDyXcldDys) {
		this.freeDyXcldDys = freeDyXcldDys;
	}
	
	/**
	 * Column Info
	 * @param volTrUtCd
	 */
	public void setVolTrUtCd(String volTrUtCd) {
		this.volTrUtCd = volTrUtCd;
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
	 * @param invXchRt
	 */
	public void setInvXchRt(String invXchRt) {
		this.invXchRt = invXchRt;
	}
	
	/**
	 * Column Info
	 * @param tmlSoDtlSeq
	 */
	public void setTmlSoDtlSeq(String tmlSoDtlSeq) {
		this.tmlSoDtlSeq = tmlSoDtlSeq;
	}
	
	/**
	 * Column Info
	 * @param calcVolQty
	 */
	public void setCalcVolQty(String calcVolQty) {
		this.calcVolQty = calcVolQty;
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
	 * @param revYrmon
	 */
	public void setRevYrmon(String revYrmon) {
		this.revYrmon = revYrmon;
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
	 * @param dcgoIndCd
	 */
	public void setDcgoIndCd(String dcgoIndCd) {
		this.dcgoIndCd = dcgoIndCd;
	}
	
	/**
	 * Column Info
	 * @param calcAmt
	 */
	public void setCalcAmt(String calcAmt) {
		this.calcAmt = calcAmt;
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
	 * @param creUsrId
	 */
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
	}
	
	/**
	 * Column Info
	 * @param fpTeuQty
	 */
	public void setFpTeuQty(String fpTeuQty) {
		this.fpTeuQty = fpTeuQty;
	}
	
	/**
	 * Column Info
	 * @param tmlAgmtSeq
	 */
	public void setTmlAgmtSeq(String tmlAgmtSeq) {
		this.tmlAgmtSeq = tmlAgmtSeq;
	}
	
	/**
	 * Column Info
	 * @param tmlSoSeq
	 */
	public void setTmlSoSeq(String tmlSoSeq) {
		this.tmlSoSeq = tmlSoSeq;
	}
	
	/**
	 * Column Info
	 * @param loclUpdDt
	 */
	public void setLoclUpdDt(String loclUpdDt) {
		this.loclUpdDt = loclUpdDt;
	}
	
	/**
	 * Column Info
	 * @param rcFlg
	 */
	public void setRcFlg(String rcFlg) {
		this.rcFlg = rcFlg;
	}
	
	/**
	 * Column Info
	 * @param ovrDys
	 */
	public void setOvrDys(String ovrDys) {
		this.ovrDys = ovrDys;
	}
	
	/**
	 * Column Info
	 * @param subTrdCd
	 */
	public void setSubTrdCd(String subTrdCd) {
		this.subTrdCd = subTrdCd;
	}
	
	/**
	 * Column Info
	 * @param laneCd
	 */
	public void setLaneCd(String laneCd) {
		this.laneCd = laneCd;
	}
	
	/**
	 * Column Info
	 * @param ediSoDtlId
	 */
	public void setEdiSoDtlId(String ediSoDtlId) {
		this.ediSoDtlId = ediSoDtlId;
	}
	
	/**
	 * Column Info
	 * @param tmlTrnsModCd
	 */
	public void setTmlTrnsModCd(String tmlTrnsModCd) {
		this.tmlTrnsModCd = tmlTrnsModCd;
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
	 * @param fincSkdDirCd
	 */
	public void setFincSkdDirCd(String fincSkdDirCd) {
		this.fincSkdDirCd = fincSkdDirCd;
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
	 * @param edwUpdDt
	 */
	public void setEdwUpdDt(String edwUpdDt) {
		this.edwUpdDt = edwUpdDt;
	}
	
	/**
	 * Column Info
	 * @param tmlCrrCd
	 */
	public void setTmlCrrCd(String tmlCrrCd) {
		this.tmlCrrCd = tmlCrrCd;
	}
	
	/**
	 * Column Info
	 * @param calcCostGrpCd
	 */
	public void setCalcCostGrpCd(String calcCostGrpCd) {
		this.calcCostGrpCd = calcCostGrpCd;
	}
	
	/**
	 * Column Info
	 * @param atbDt
	 */
	public void setAtbDt(String atbDt) {
		this.atbDt = atbDt;
	}
	
	/**
	 * Column Info
	 * @param calcTpCd
	 */
	public void setCalcTpCd(String calcTpCd) {
		this.calcTpCd = calcTpCd;
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
	 * @param stayDys
	 */
	public void setStayDys(String stayDys) {
		this.stayDys = stayDys;
	}
	
	/**
	 * Column Info
	 * @param fpCalcPrdCd
	 */
	public void setFpCalcPrdCd(String fpCalcPrdCd) {
		this.fpCalcPrdCd = fpCalcPrdCd;
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
	 * @param invAmt
	 */
	public void setInvAmt(String invAmt) {
		this.invAmt = invAmt;
	}
	
	/**
	 * Column Info
	 * @param wrkDt
	 */
	public void setWrkDt(String wrkDt) {
		this.wrkDt = wrkDt;
	}
	
	/**
	 * Column Info
	 * @param trStayDys
	 */
	public void setTrStayDys(String trStayDys) {
		this.trStayDys = trStayDys;
	}
	
	/**
	 * Column Info
	 * @param ovrVolQty
	 */
	public void setOvrVolQty(String ovrVolQty) {
		this.ovrVolQty = ovrVolQty;
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
	 * @param n3ptyFlg
	 */
	public void setN3ptyFlg(String n3ptyFlg) {
		this.n3ptyFlg = n3ptyFlg;
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
	 * @param tmlAgmtOfcCtyCd
	 */
	public void setTmlAgmtOfcCtyCd(String tmlAgmtOfcCtyCd) {
		this.tmlAgmtOfcCtyCd = tmlAgmtOfcCtyCd;
	}
	
	/**
	 * Column Info
	 * @param rvisVolQty
	 */
	public void setRvisVolQty(String rvisVolQty) {
		this.rvisVolQty = rvisVolQty;
	}
	
	/**
	 * Column Info
	 * @param fincSkdVoyNo
	 */
	public void setFincSkdVoyNo(String fincSkdVoyNo) {
		this.fincSkdVoyNo = fincSkdVoyNo;
	}
	
	/**
	 * Column Info
	 * @param refVndrSeq
	 */
	public void setRefVndrSeq(String refVndrSeq) {
		this.refVndrSeq = refVndrSeq;
	}
	
	/**
	 * Column Info
	 * @param ctrtRt
	 */
	public void setCtrtRt(String ctrtRt) {
		this.ctrtRt = ctrtRt;
	}
	
	/**
	 * Column Info
	 * @param semiAutoCalcFlg
	 */
	public void setSemiAutoCalcFlg(String semiAutoCalcFlg) {
		this.semiAutoCalcFlg = semiAutoCalcFlg;
	}
	
	/**
	 * Column Info
	 * @param calcRmk
	 */
	public void setCalcRmk(String calcRmk) {
		this.calcRmk = calcRmk;
	}
	
	/**
	 * Column Info
	 * @param loclCreDt
	 */
	public void setLoclCreDt(String loclCreDt) {
		this.loclCreDt = loclCreDt;
	}
	
	/**
	 * Column Info
	 * @param fmTrVolVal
	 */
	public void setFmTrVolVal(String fmTrVolVal) {
		this.fmTrVolVal = fmTrVolVal;
	}
	
	/**
	 * Column Info
	 * @param diffVolQty
	 */
	public void setDiffVolQty(String diffVolQty) {
		this.diffVolQty = diffVolQty;
	}
	
	/**
	 * Column Info
	 * @param eqKndCd
	 */
	public void setEqKndCd(String eqKndCd) {
		this.eqKndCd = eqKndCd;
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
	 * @param skdDirCd
	 */
	public void setSkdDirCd(String skdDirCd) {
		this.skdDirCd = skdDirCd;
	}
	
	/**
	 * Column Info
	 * @param payDys
	 */
	public void setPayDys(String payDys) {
		this.payDys = payDys;
	}
	
	/**
	 * Column Info
	 * @param freeDys
	 */
	public void setFreeDys(String freeDys) {
		this.freeDys = freeDys;
	}
	
	/**
	 * Column Info
	 * @param cntrStyCd
	 */
	public void setCntrStyCd(String cntrStyCd) {
		this.cntrStyCd = cntrStyCd;
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
	 * @param lgsCostCd
	 */
	public void setLgsCostCd(String lgsCostCd) {
		this.lgsCostCd = lgsCostCd;
	}
	
	/**
	 * Column Info
	 * @param rfMntrDys
	 */
	public void setRfMntrDys(String rfMntrDys) {
		this.rfMntrDys = rfMntrDys;
	}
	
	/**
	 * Column Info
	 * @param invVolQty
	 */
	public void setInvVolQty(String invVolQty) {
		this.invVolQty = invVolQty;
	}
	
	/**
	 * Column Info
	 * @param tmlWrkDyCd
	 */
	public void setTmlWrkDyCd(String tmlWrkDyCd) {
		this.tmlWrkDyCd = tmlWrkDyCd;
	}
	
	/**
	 * Column Info
	 * @param tmlSoOfcCtyCd
	 */
	public void setTmlSoOfcCtyCd(String tmlSoOfcCtyCd) {
		this.tmlSoOfcCtyCd = tmlSoOfcCtyCd;
	}
	
	/**
	 * Column Info
	 * @param bbCgoFlg
	 */
	public void setBbCgoFlg(String bbCgoFlg) {
		this.bbCgoFlg = bbCgoFlg;
	}
	
	/**
	 * Column Info
	 * @param awkCgoFlg
	 */
	public void setAwkCgoFlg(String awkCgoFlg) {
		this.awkCgoFlg = awkCgoFlg;
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
		setVslCd(JSPUtil.getParameter(request, prefix + "vsl_cd", ""));
		setStkVolQty(JSPUtil.getParameter(request, prefix + "stk_vol_qty", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setToTrVolVal(JSPUtil.getParameter(request, prefix + "to_tr_vol_val", ""));
		setFincVslCd(JSPUtil.getParameter(request, prefix + "finc_vsl_cd", ""));
		setTmlAgmtVerNo(JSPUtil.getParameter(request, prefix + "tml_agmt_ver_no", ""));
		setFreeDyXcldDys(JSPUtil.getParameter(request, prefix + "free_dy_xcld_dys", ""));
		setVolTrUtCd(JSPUtil.getParameter(request, prefix + "vol_tr_ut_cd", ""));
		setCntrTpszCd(JSPUtil.getParameter(request, prefix + "cntr_tpsz_cd", ""));
		setInvXchRt(JSPUtil.getParameter(request, prefix + "inv_xch_rt", ""));
		setTmlSoDtlSeq(JSPUtil.getParameter(request, prefix + "tml_so_dtl_seq", ""));
		setCalcVolQty(JSPUtil.getParameter(request, prefix + "calc_vol_qty", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setRevYrmon(JSPUtil.getParameter(request, prefix + "rev_yrmon", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, prefix + "skd_voy_no", ""));
		setDcgoIndCd(JSPUtil.getParameter(request, prefix + "dcgo_ind_cd", ""));
		setCalcAmt(JSPUtil.getParameter(request, prefix + "calc_amt", ""));
		setEqTpszCd(JSPUtil.getParameter(request, prefix + "eq_tpsz_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setFpTeuQty(JSPUtil.getParameter(request, prefix + "fp_teu_qty", ""));
		setTmlAgmtSeq(JSPUtil.getParameter(request, prefix + "tml_agmt_seq", ""));
		setTmlSoSeq(JSPUtil.getParameter(request, prefix + "tml_so_seq", ""));
		setLoclUpdDt(JSPUtil.getParameter(request, prefix + "locl_upd_dt", ""));
		setRcFlg(JSPUtil.getParameter(request, prefix + "rc_flg", ""));
		setOvrDys(JSPUtil.getParameter(request, prefix + "ovr_dys", ""));
		setSubTrdCd(JSPUtil.getParameter(request, prefix + "sub_trd_cd", ""));
		setLaneCd(JSPUtil.getParameter(request, prefix + "lane_cd", ""));
		setEdiSoDtlId(JSPUtil.getParameter(request, prefix + "edi_so_dtl_id", ""));
		setTmlTrnsModCd(JSPUtil.getParameter(request, prefix + "tml_trns_mod_cd", ""));
		setCurrCd(JSPUtil.getParameter(request, prefix + "curr_cd", ""));
		setFincSkdDirCd(JSPUtil.getParameter(request, prefix + "finc_skd_dir_cd", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setEdwUpdDt(JSPUtil.getParameter(request, prefix + "edw_upd_dt", ""));
		setTmlCrrCd(JSPUtil.getParameter(request, prefix + "tml_crr_cd", ""));
		setCalcCostGrpCd(JSPUtil.getParameter(request, prefix + "calc_cost_grp_cd", ""));
		setAtbDt(JSPUtil.getParameter(request, prefix + "atb_dt", ""));
		setCalcTpCd(JSPUtil.getParameter(request, prefix + "calc_tp_cd", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setEqNo(JSPUtil.getParameter(request, prefix + "eq_no", ""));
		setStayDys(JSPUtil.getParameter(request, prefix + "stay_dys", ""));
		setFpCalcPrdCd(JSPUtil.getParameter(request, prefix + "fp_calc_prd_cd", ""));
		setAcctCd(JSPUtil.getParameter(request, prefix + "acct_cd", ""));
		setInvAmt(JSPUtil.getParameter(request, prefix + "inv_amt", ""));
		setWrkDt(JSPUtil.getParameter(request, prefix + "wrk_dt", ""));
		setTrStayDys(JSPUtil.getParameter(request, prefix + "tr_stay_dys", ""));
		setOvrVolQty(JSPUtil.getParameter(request, prefix + "ovr_vol_qty", ""));
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setN3ptyFlg(JSPUtil.getParameter(request, prefix + "n3pty_flg", ""));
		setIocCd(JSPUtil.getParameter(request, prefix + "ioc_cd", ""));
		setTmlAgmtOfcCtyCd(JSPUtil.getParameter(request, prefix + "tml_agmt_ofc_cty_cd", ""));
		setRvisVolQty(JSPUtil.getParameter(request, prefix + "rvis_vol_qty", ""));
		setFincSkdVoyNo(JSPUtil.getParameter(request, prefix + "finc_skd_voy_no", ""));
		setRefVndrSeq(JSPUtil.getParameter(request, prefix + "ref_vndr_seq", ""));
		setCtrtRt(JSPUtil.getParameter(request, prefix + "ctrt_rt", ""));
		setSemiAutoCalcFlg(JSPUtil.getParameter(request, prefix + "semi_auto_calc_flg", ""));
		setCalcRmk(JSPUtil.getParameter(request, prefix + "calc_rmk", ""));
		setLoclCreDt(JSPUtil.getParameter(request, prefix + "locl_cre_dt", ""));
		setFmTrVolVal(JSPUtil.getParameter(request, prefix + "fm_tr_vol_val", ""));
		setDiffVolQty(JSPUtil.getParameter(request, prefix + "diff_vol_qty", ""));
		setEqKndCd(JSPUtil.getParameter(request, prefix + "eq_knd_cd", ""));
		setIoBndCd(JSPUtil.getParameter(request, prefix + "io_bnd_cd", ""));
		setSkdDirCd(JSPUtil.getParameter(request, prefix + "skd_dir_cd", ""));
		setPayDys(JSPUtil.getParameter(request, prefix + "pay_dys", ""));
		setFreeDys(JSPUtil.getParameter(request, prefix + "free_dys", ""));
		setCntrStyCd(JSPUtil.getParameter(request, prefix + "cntr_sty_cd", ""));
		setCntrNo(JSPUtil.getParameter(request, prefix + "cntr_no", ""));
		setLgsCostCd(JSPUtil.getParameter(request, prefix + "lgs_cost_cd", ""));
		setRfMntrDys(JSPUtil.getParameter(request, prefix + "rf_mntr_dys", ""));
		setInvVolQty(JSPUtil.getParameter(request, prefix + "inv_vol_qty", ""));
		setTmlWrkDyCd(JSPUtil.getParameter(request, prefix + "tml_wrk_dy_cd", ""));
		setTmlSoOfcCtyCd(JSPUtil.getParameter(request, prefix + "tml_so_ofc_cty_cd", ""));
		setBbCgoFlg(JSPUtil.getParameter(request, prefix + "bb_cgo_flg", ""));
		setAwkCgoFlg(JSPUtil.getParameter(request, prefix + "awk_cgo_flg", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return TesTmlSoDtlVO[]
	 */
	public TesTmlSoDtlVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return TesTmlSoDtlVO[]
	 */
	public TesTmlSoDtlVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		TesTmlSoDtlVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] stkVolQty = (JSPUtil.getParameter(request, prefix	+ "stk_vol_qty", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] toTrVolVal = (JSPUtil.getParameter(request, prefix	+ "to_tr_vol_val", length));
			String[] fincVslCd = (JSPUtil.getParameter(request, prefix	+ "finc_vsl_cd", length));
			String[] tmlAgmtVerNo = (JSPUtil.getParameter(request, prefix	+ "tml_agmt_ver_no", length));
			String[] freeDyXcldDys = (JSPUtil.getParameter(request, prefix	+ "free_dy_xcld_dys", length));
			String[] volTrUtCd = (JSPUtil.getParameter(request, prefix	+ "vol_tr_ut_cd", length));
			String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_cd", length));
			String[] invXchRt = (JSPUtil.getParameter(request, prefix	+ "inv_xch_rt", length));
			String[] tmlSoDtlSeq = (JSPUtil.getParameter(request, prefix	+ "tml_so_dtl_seq", length));
			String[] calcVolQty = (JSPUtil.getParameter(request, prefix	+ "calc_vol_qty", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] revYrmon = (JSPUtil.getParameter(request, prefix	+ "rev_yrmon", length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no", length));
			String[] dcgoIndCd = (JSPUtil.getParameter(request, prefix	+ "dcgo_ind_cd", length));
			String[] calcAmt = (JSPUtil.getParameter(request, prefix	+ "calc_amt", length));
			String[] eqTpszCd = (JSPUtil.getParameter(request, prefix	+ "eq_tpsz_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] fpTeuQty = (JSPUtil.getParameter(request, prefix	+ "fp_teu_qty", length));
			String[] tmlAgmtSeq = (JSPUtil.getParameter(request, prefix	+ "tml_agmt_seq", length));
			String[] tmlSoSeq = (JSPUtil.getParameter(request, prefix	+ "tml_so_seq", length));
			String[] loclUpdDt = (JSPUtil.getParameter(request, prefix	+ "locl_upd_dt", length));
			String[] rcFlg = (JSPUtil.getParameter(request, prefix	+ "rc_flg", length));
			String[] ovrDys = (JSPUtil.getParameter(request, prefix	+ "ovr_dys", length));
			String[] subTrdCd = (JSPUtil.getParameter(request, prefix	+ "sub_trd_cd", length));
			String[] laneCd = (JSPUtil.getParameter(request, prefix	+ "lane_cd", length));
			String[] ediSoDtlId = (JSPUtil.getParameter(request, prefix	+ "edi_so_dtl_id", length));
			String[] tmlTrnsModCd = (JSPUtil.getParameter(request, prefix	+ "tml_trns_mod_cd", length));
			String[] currCd = (JSPUtil.getParameter(request, prefix	+ "curr_cd", length));
			String[] fincSkdDirCd = (JSPUtil.getParameter(request, prefix	+ "finc_skd_dir_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] edwUpdDt = (JSPUtil.getParameter(request, prefix	+ "edw_upd_dt", length));
			String[] tmlCrrCd = (JSPUtil.getParameter(request, prefix	+ "tml_crr_cd", length));
			String[] calcCostGrpCd = (JSPUtil.getParameter(request, prefix	+ "calc_cost_grp_cd", length));
			String[] atbDt = (JSPUtil.getParameter(request, prefix	+ "atb_dt", length));
			String[] calcTpCd = (JSPUtil.getParameter(request, prefix	+ "calc_tp_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] eqNo = (JSPUtil.getParameter(request, prefix	+ "eq_no", length));
			String[] stayDys = (JSPUtil.getParameter(request, prefix	+ "stay_dys", length));
			String[] fpCalcPrdCd = (JSPUtil.getParameter(request, prefix	+ "fp_calc_prd_cd", length));
			String[] acctCd = (JSPUtil.getParameter(request, prefix	+ "acct_cd", length));
			String[] invAmt = (JSPUtil.getParameter(request, prefix	+ "inv_amt", length));
			String[] wrkDt = (JSPUtil.getParameter(request, prefix	+ "wrk_dt", length));
			String[] trStayDys = (JSPUtil.getParameter(request, prefix	+ "tr_stay_dys", length));
			String[] ovrVolQty = (JSPUtil.getParameter(request, prefix	+ "ovr_vol_qty", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] n3ptyFlg = (JSPUtil.getParameter(request, prefix	+ "n3pty_flg", length));
			String[] iocCd = (JSPUtil.getParameter(request, prefix	+ "ioc_cd", length));
			String[] tmlAgmtOfcCtyCd = (JSPUtil.getParameter(request, prefix	+ "tml_agmt_ofc_cty_cd", length));
			String[] rvisVolQty = (JSPUtil.getParameter(request, prefix	+ "rvis_vol_qty", length));
			String[] fincSkdVoyNo = (JSPUtil.getParameter(request, prefix	+ "finc_skd_voy_no", length));
			String[] refVndrSeq = (JSPUtil.getParameter(request, prefix	+ "ref_vndr_seq", length));
			String[] ctrtRt = (JSPUtil.getParameter(request, prefix	+ "ctrt_rt", length));
			String[] semiAutoCalcFlg = (JSPUtil.getParameter(request, prefix	+ "semi_auto_calc_flg", length));
			String[] calcRmk = (JSPUtil.getParameter(request, prefix	+ "calc_rmk", length));
			String[] loclCreDt = (JSPUtil.getParameter(request, prefix	+ "locl_cre_dt", length));
			String[] fmTrVolVal = (JSPUtil.getParameter(request, prefix	+ "fm_tr_vol_val", length));
			String[] diffVolQty = (JSPUtil.getParameter(request, prefix	+ "diff_vol_qty", length));
			String[] eqKndCd = (JSPUtil.getParameter(request, prefix	+ "eq_knd_cd", length));
			String[] ioBndCd = (JSPUtil.getParameter(request, prefix	+ "io_bnd_cd", length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd", length));
			String[] payDys = (JSPUtil.getParameter(request, prefix	+ "pay_dys", length));
			String[] freeDys = (JSPUtil.getParameter(request, prefix	+ "free_dys", length));
			String[] cntrStyCd = (JSPUtil.getParameter(request, prefix	+ "cntr_sty_cd", length));
			String[] cntrNo = (JSPUtil.getParameter(request, prefix	+ "cntr_no", length));
			String[] lgsCostCd = (JSPUtil.getParameter(request, prefix	+ "lgs_cost_cd", length));
			String[] rfMntrDys = (JSPUtil.getParameter(request, prefix	+ "rf_mntr_dys", length));
			String[] invVolQty = (JSPUtil.getParameter(request, prefix	+ "inv_vol_qty", length));
			String[] tmlWrkDyCd = (JSPUtil.getParameter(request, prefix	+ "tml_wrk_dy_cd", length));
			String[] tmlSoOfcCtyCd = (JSPUtil.getParameter(request, prefix	+ "tml_so_ofc_cty_cd", length));
			String[] bbCgoFlg = (JSPUtil.getParameter(request, prefix	+ "bb_cgo_flg", length));
			String[] awkCgoFlg = (JSPUtil.getParameter(request, prefix	+ "awk_cgo_flg", length));
			
			for (int i = 0; i < length; i++) {
				model = new TesTmlSoDtlVO();
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (stkVolQty[i] != null)
					model.setStkVolQty(stkVolQty[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (toTrVolVal[i] != null)
					model.setToTrVolVal(toTrVolVal[i]);
				if (fincVslCd[i] != null)
					model.setFincVslCd(fincVslCd[i]);
				if (tmlAgmtVerNo[i] != null)
					model.setTmlAgmtVerNo(tmlAgmtVerNo[i]);
				if (freeDyXcldDys[i] != null)
					model.setFreeDyXcldDys(freeDyXcldDys[i]);
				if (volTrUtCd[i] != null)
					model.setVolTrUtCd(volTrUtCd[i]);
				if (cntrTpszCd[i] != null)
					model.setCntrTpszCd(cntrTpszCd[i]);
				if (invXchRt[i] != null)
					model.setInvXchRt(invXchRt[i]);
				if (tmlSoDtlSeq[i] != null)
					model.setTmlSoDtlSeq(tmlSoDtlSeq[i]);
				if (calcVolQty[i] != null)
					model.setCalcVolQty(calcVolQty[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (revYrmon[i] != null)
					model.setRevYrmon(revYrmon[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (dcgoIndCd[i] != null)
					model.setDcgoIndCd(dcgoIndCd[i]);
				if (calcAmt[i] != null)
					model.setCalcAmt(calcAmt[i]);
				if (eqTpszCd[i] != null)
					model.setEqTpszCd(eqTpszCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (fpTeuQty[i] != null)
					model.setFpTeuQty(fpTeuQty[i]);
				if (tmlAgmtSeq[i] != null)
					model.setTmlAgmtSeq(tmlAgmtSeq[i]);
				if (tmlSoSeq[i] != null)
					model.setTmlSoSeq(tmlSoSeq[i]);
				if (loclUpdDt[i] != null)
					model.setLoclUpdDt(loclUpdDt[i]);
				if (rcFlg[i] != null)
					model.setRcFlg(rcFlg[i]);
				if (ovrDys[i] != null)
					model.setOvrDys(ovrDys[i]);
				if (subTrdCd[i] != null)
					model.setSubTrdCd(subTrdCd[i]);
				if (laneCd[i] != null)
					model.setLaneCd(laneCd[i]);
				if (ediSoDtlId[i] != null)
					model.setEdiSoDtlId(ediSoDtlId[i]);
				if (tmlTrnsModCd[i] != null)
					model.setTmlTrnsModCd(tmlTrnsModCd[i]);
				if (currCd[i] != null)
					model.setCurrCd(currCd[i]);
				if (fincSkdDirCd[i] != null)
					model.setFincSkdDirCd(fincSkdDirCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (edwUpdDt[i] != null)
					model.setEdwUpdDt(edwUpdDt[i]);
				if (tmlCrrCd[i] != null)
					model.setTmlCrrCd(tmlCrrCd[i]);
				if (calcCostGrpCd[i] != null)
					model.setCalcCostGrpCd(calcCostGrpCd[i]);
				if (atbDt[i] != null)
					model.setAtbDt(atbDt[i]);
				if (calcTpCd[i] != null)
					model.setCalcTpCd(calcTpCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (eqNo[i] != null)
					model.setEqNo(eqNo[i]);
				if (stayDys[i] != null)
					model.setStayDys(stayDys[i]);
				if (fpCalcPrdCd[i] != null)
					model.setFpCalcPrdCd(fpCalcPrdCd[i]);
				if (acctCd[i] != null)
					model.setAcctCd(acctCd[i]);
				if (invAmt[i] != null)
					model.setInvAmt(invAmt[i]);
				if (wrkDt[i] != null)
					model.setWrkDt(wrkDt[i]);
				if (trStayDys[i] != null)
					model.setTrStayDys(trStayDys[i]);
				if (ovrVolQty[i] != null)
					model.setOvrVolQty(ovrVolQty[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (n3ptyFlg[i] != null)
					model.setN3ptyFlg(n3ptyFlg[i]);
				if (iocCd[i] != null)
					model.setIocCd(iocCd[i]);
				if (tmlAgmtOfcCtyCd[i] != null)
					model.setTmlAgmtOfcCtyCd(tmlAgmtOfcCtyCd[i]);
				if (rvisVolQty[i] != null)
					model.setRvisVolQty(rvisVolQty[i]);
				if (fincSkdVoyNo[i] != null)
					model.setFincSkdVoyNo(fincSkdVoyNo[i]);
				if (refVndrSeq[i] != null)
					model.setRefVndrSeq(refVndrSeq[i]);
				if (ctrtRt[i] != null)
					model.setCtrtRt(ctrtRt[i]);
				if (semiAutoCalcFlg[i] != null)
					model.setSemiAutoCalcFlg(semiAutoCalcFlg[i]);
				if (calcRmk[i] != null)
					model.setCalcRmk(calcRmk[i]);
				if (loclCreDt[i] != null)
					model.setLoclCreDt(loclCreDt[i]);
				if (fmTrVolVal[i] != null)
					model.setFmTrVolVal(fmTrVolVal[i]);
				if (diffVolQty[i] != null)
					model.setDiffVolQty(diffVolQty[i]);
				if (eqKndCd[i] != null)
					model.setEqKndCd(eqKndCd[i]);
				if (ioBndCd[i] != null)
					model.setIoBndCd(ioBndCd[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (payDys[i] != null)
					model.setPayDys(payDys[i]);
				if (freeDys[i] != null)
					model.setFreeDys(freeDys[i]);
				if (cntrStyCd[i] != null)
					model.setCntrStyCd(cntrStyCd[i]);
				if (cntrNo[i] != null)
					model.setCntrNo(cntrNo[i]);
				if (lgsCostCd[i] != null)
					model.setLgsCostCd(lgsCostCd[i]);
				if (rfMntrDys[i] != null)
					model.setRfMntrDys(rfMntrDys[i]);
				if (invVolQty[i] != null)
					model.setInvVolQty(invVolQty[i]);
				if (tmlWrkDyCd[i] != null)
					model.setTmlWrkDyCd(tmlWrkDyCd[i]);
				if (tmlSoOfcCtyCd[i] != null)
					model.setTmlSoOfcCtyCd(tmlSoOfcCtyCd[i]);
				if (bbCgoFlg[i] != null)
					model.setBbCgoFlg(bbCgoFlg[i]);
				if (awkCgoFlg[i] != null)
					model.setAwkCgoFlg(awkCgoFlg[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getTesTmlSoDtlVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return TesTmlSoDtlVO[]
	 */
	public TesTmlSoDtlVO[] getTesTmlSoDtlVOs(){
		TesTmlSoDtlVO[] vos = (TesTmlSoDtlVO[])models.toArray(new TesTmlSoDtlVO[models.size()]);
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
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stkVolQty = this.stkVolQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.toTrVolVal = this.toTrVolVal .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fincVslCd = this.fincVslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlAgmtVerNo = this.tmlAgmtVerNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.freeDyXcldDys = this.freeDyXcldDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.volTrUtCd = this.volTrUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszCd = this.cntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invXchRt = this.invXchRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlSoDtlSeq = this.tmlSoDtlSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.calcVolQty = this.calcVolQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.revYrmon = this.revYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dcgoIndCd = this.dcgoIndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.calcAmt = this.calcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqTpszCd = this.eqTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fpTeuQty = this.fpTeuQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlAgmtSeq = this.tmlAgmtSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlSoSeq = this.tmlSoSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.loclUpdDt = this.loclUpdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcFlg = this.rcFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ovrDys = this.ovrDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.subTrdCd = this.subTrdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.laneCd = this.laneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediSoDtlId = this.ediSoDtlId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlTrnsModCd = this.tmlTrnsModCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.currCd = this.currCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fincSkdDirCd = this.fincSkdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.edwUpdDt = this.edwUpdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlCrrCd = this.tmlCrrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.calcCostGrpCd = this.calcCostGrpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.atbDt = this.atbDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.calcTpCd = this.calcTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqNo = this.eqNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stayDys = this.stayDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fpCalcPrdCd = this.fpCalcPrdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acctCd = this.acctCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invAmt = this.invAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.wrkDt = this.wrkDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trStayDys = this.trStayDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ovrVolQty = this.ovrVolQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3ptyFlg = this.n3ptyFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.iocCd = this.iocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlAgmtOfcCtyCd = this.tmlAgmtOfcCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rvisVolQty = this.rvisVolQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fincSkdVoyNo = this.fincSkdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.refVndrSeq = this.refVndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ctrtRt = this.ctrtRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.semiAutoCalcFlg = this.semiAutoCalcFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.calcRmk = this.calcRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.loclCreDt = this.loclCreDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fmTrVolVal = this.fmTrVolVal .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.diffVolQty = this.diffVolQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqKndCd = this.eqKndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ioBndCd = this.ioBndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.payDys = this.payDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.freeDys = this.freeDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrStyCd = this.cntrStyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrNo = this.cntrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lgsCostCd = this.lgsCostCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rfMntrDys = this.rfMntrDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invVolQty = this.invVolQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlWrkDyCd = this.tmlWrkDyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlSoOfcCtyCd = this.tmlSoOfcCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bbCgoFlg = this.bbCgoFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.awkCgoFlg = this.awkCgoFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
