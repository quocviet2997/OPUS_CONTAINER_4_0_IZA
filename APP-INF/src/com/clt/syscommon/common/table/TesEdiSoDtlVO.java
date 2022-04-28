/*=========================================================
*Copyright(c) 2012 CyberLogitec
*@FileName : TesEdiSoDtlVO.java
*@FileTitle : TesEdiSoDtlVO
*Open Issues :
*Change history :
*@LastModifyDate : 2012.07.13
*@LastModifier : 
*@LastVersion : 1.0
* 2012.07.13  
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
 * @author 
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class TesEdiSoDtlVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<TesEdiSoDtlVO> models = new ArrayList<TesEdiSoDtlVO>();
	
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String ibVvdCd = null;
	/* Column Info */
	private String stkVolQty = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String mtchModCd = null;
	/* Column Info */
	private String freeDyXcldDys = null;
	/* Column Info */
	private String volTrUtCd = null;
	/* Column Info */
	private String cntrTpszCd = null;
	/* Column Info */
	private String invXchRt = null;
	/* Column Info */
	private String calcVolQty = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String callSgnNo = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String custRefNoCtnt = null;
	/* Column Info */
	private String dcgoIndCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String fpTeuQty = null;
	/* Column Info */
	private String lloydNo = null;
	/* Column Info */
	private String rcFlg = null;
	/* Column Info */
	private String ovrDys = null;
	/* Column Info */
	private String laneCd = null;
	/* Column Info */
	private String tmlTrnsModCd = null;
	/* Column Info */
	private String ediSoDtlId = null;
	/* Column Info */
	private String imoNo = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String tmlCrrCd = null;
	/* Column Info */
	private String atbDt = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String stayDys = null;
	/* Column Info */
	private String trfDesc = null;
	/* Column Info */
	private String invAmt = null;
	/* Column Info */
	private String wrkDt = null;
	/* Column Info */
	private String iocCd = null;
	/* Column Info */
	private String ovrVolQty = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String rvisVolQty = null;
	/* Column Info */
	private String tmlEdiSoOfcCtyCd = null;
	/* Column Info */
	private String ctrtRt = null;
	/* Column Info */
	private String calcRmk = null;
	/* Column Info */
	private String ioBndCd = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Column Info */
	private String freeDys = null;
	/* Column Info */
	private String lgsCostCd = null;
	/* Column Info */
	private String rfMntrDys = null;
	/* Column Info */
	private String obVvdCd = null;
	/* Column Info */
	private String tmlWrkDyCd = null;
	/* Column Info */
	private String invVolQty = null;
	/* Column Info */
	private String tmlEdiSoSeq = null;
	/* Column Info */
	private String tmlEdiSoDtlSeq = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public TesEdiSoDtlVO() {}

	public TesEdiSoDtlVO(String ibflag, String pagerows, String tmlEdiSoOfcCtyCd, String tmlEdiSoSeq, String tmlEdiSoDtlSeq, String lgsCostCd, String cntrTpszCd, String volTrUtCd, String ctrtRt, String invAmt, String invXchRt, String stayDys, String ovrDys, String ovrVolQty, String wrkDt, String invVolQty, String stkVolQty, String fpTeuQty, String dcgoIndCd, String rcFlg, String tmlWrkDyCd, String iocCd, String tmlTrnsModCd, String laneCd, String tmlCrrCd, String calcVolQty, String rvisVolQty, String ioBndCd, String vslCd, String skdVoyNo, String skdDirCd, String ibVvdCd, String obVvdCd, String trfDesc, String calcRmk, String freeDys, String freeDyXcldDys, String rfMntrDys, String ediSoDtlId, String creUsrId, String creDt, String updUsrId, String updDt, String callSgnNo, String lloydNo, String imoNo, String custRefNoCtnt, String mtchModCd, String atbDt) {
		this.vslCd = vslCd;
		this.ibVvdCd = ibVvdCd;
		this.stkVolQty = stkVolQty;
		this.pagerows = pagerows;
		this.mtchModCd = mtchModCd;
		this.freeDyXcldDys = freeDyXcldDys;
		this.volTrUtCd = volTrUtCd;
		this.cntrTpszCd = cntrTpszCd;
		this.invXchRt = invXchRt;
		this.calcVolQty = calcVolQty;
		this.updUsrId = updUsrId;
		this.callSgnNo = callSgnNo;
		this.skdVoyNo = skdVoyNo;
		this.custRefNoCtnt = custRefNoCtnt;
		this.dcgoIndCd = dcgoIndCd;
		this.creUsrId = creUsrId;
		this.fpTeuQty = fpTeuQty;
		this.lloydNo = lloydNo;
		this.rcFlg = rcFlg;
		this.ovrDys = ovrDys;
		this.laneCd = laneCd;
		this.tmlTrnsModCd = tmlTrnsModCd;
		this.ediSoDtlId = ediSoDtlId;
		this.imoNo = imoNo;
		this.creDt = creDt;
		this.tmlCrrCd = tmlCrrCd;
		this.atbDt = atbDt;
		this.ibflag = ibflag;
		this.stayDys = stayDys;
		this.trfDesc = trfDesc;
		this.invAmt = invAmt;
		this.wrkDt = wrkDt;
		this.iocCd = iocCd;
		this.ovrVolQty = ovrVolQty;
		this.updDt = updDt;
		this.rvisVolQty = rvisVolQty;
		this.tmlEdiSoOfcCtyCd = tmlEdiSoOfcCtyCd;
		this.ctrtRt = ctrtRt;
		this.calcRmk = calcRmk;
		this.ioBndCd = ioBndCd;
		this.skdDirCd = skdDirCd;
		this.freeDys = freeDys;
		this.lgsCostCd = lgsCostCd;
		this.rfMntrDys = rfMntrDys;
		this.obVvdCd = obVvdCd;
		this.tmlWrkDyCd = tmlWrkDyCd;
		this.invVolQty = invVolQty;
		this.tmlEdiSoSeq = tmlEdiSoSeq;
		this.tmlEdiSoDtlSeq = tmlEdiSoDtlSeq;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("ib_vvd_cd", getIbVvdCd());
		this.hashColumns.put("stk_vol_qty", getStkVolQty());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("mtch_mod_cd", getMtchModCd());
		this.hashColumns.put("free_dy_xcld_dys", getFreeDyXcldDys());
		this.hashColumns.put("vol_tr_ut_cd", getVolTrUtCd());
		this.hashColumns.put("cntr_tpsz_cd", getCntrTpszCd());
		this.hashColumns.put("inv_xch_rt", getInvXchRt());
		this.hashColumns.put("calc_vol_qty", getCalcVolQty());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("call_sgn_no", getCallSgnNo());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("cust_ref_no_ctnt", getCustRefNoCtnt());
		this.hashColumns.put("dcgo_ind_cd", getDcgoIndCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("fp_teu_qty", getFpTeuQty());
		this.hashColumns.put("lloyd_no", getLloydNo());
		this.hashColumns.put("rc_flg", getRcFlg());
		this.hashColumns.put("ovr_dys", getOvrDys());
		this.hashColumns.put("lane_cd", getLaneCd());
		this.hashColumns.put("tml_trns_mod_cd", getTmlTrnsModCd());
		this.hashColumns.put("edi_so_dtl_id", getEdiSoDtlId());
		this.hashColumns.put("imo_no", getImoNo());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("tml_crr_cd", getTmlCrrCd());
		this.hashColumns.put("atb_dt", getAtbDt());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("stay_dys", getStayDys());
		this.hashColumns.put("trf_desc", getTrfDesc());
		this.hashColumns.put("inv_amt", getInvAmt());
		this.hashColumns.put("wrk_dt", getWrkDt());
		this.hashColumns.put("ioc_cd", getIocCd());
		this.hashColumns.put("ovr_vol_qty", getOvrVolQty());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("rvis_vol_qty", getRvisVolQty());
		this.hashColumns.put("tml_edi_so_ofc_cty_cd", getTmlEdiSoOfcCtyCd());
		this.hashColumns.put("ctrt_rt", getCtrtRt());
		this.hashColumns.put("calc_rmk", getCalcRmk());
		this.hashColumns.put("io_bnd_cd", getIoBndCd());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("free_dys", getFreeDys());
		this.hashColumns.put("lgs_cost_cd", getLgsCostCd());
		this.hashColumns.put("rf_mntr_dys", getRfMntrDys());
		this.hashColumns.put("ob_vvd_cd", getObVvdCd());
		this.hashColumns.put("tml_wrk_dy_cd", getTmlWrkDyCd());
		this.hashColumns.put("inv_vol_qty", getInvVolQty());
		this.hashColumns.put("tml_edi_so_seq", getTmlEdiSoSeq());
		this.hashColumns.put("tml_edi_so_dtl_seq", getTmlEdiSoDtlSeq());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("ib_vvd_cd", "ibVvdCd");
		this.hashFields.put("stk_vol_qty", "stkVolQty");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("mtch_mod_cd", "mtchModCd");
		this.hashFields.put("free_dy_xcld_dys", "freeDyXcldDys");
		this.hashFields.put("vol_tr_ut_cd", "volTrUtCd");
		this.hashFields.put("cntr_tpsz_cd", "cntrTpszCd");
		this.hashFields.put("inv_xch_rt", "invXchRt");
		this.hashFields.put("calc_vol_qty", "calcVolQty");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("call_sgn_no", "callSgnNo");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("cust_ref_no_ctnt", "custRefNoCtnt");
		this.hashFields.put("dcgo_ind_cd", "dcgoIndCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("fp_teu_qty", "fpTeuQty");
		this.hashFields.put("lloyd_no", "lloydNo");
		this.hashFields.put("rc_flg", "rcFlg");
		this.hashFields.put("ovr_dys", "ovrDys");
		this.hashFields.put("lane_cd", "laneCd");
		this.hashFields.put("tml_trns_mod_cd", "tmlTrnsModCd");
		this.hashFields.put("edi_so_dtl_id", "ediSoDtlId");
		this.hashFields.put("imo_no", "imoNo");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("tml_crr_cd", "tmlCrrCd");
		this.hashFields.put("atb_dt", "atbDt");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("stay_dys", "stayDys");
		this.hashFields.put("trf_desc", "trfDesc");
		this.hashFields.put("inv_amt", "invAmt");
		this.hashFields.put("wrk_dt", "wrkDt");
		this.hashFields.put("ioc_cd", "iocCd");
		this.hashFields.put("ovr_vol_qty", "ovrVolQty");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("rvis_vol_qty", "rvisVolQty");
		this.hashFields.put("tml_edi_so_ofc_cty_cd", "tmlEdiSoOfcCtyCd");
		this.hashFields.put("ctrt_rt", "ctrtRt");
		this.hashFields.put("calc_rmk", "calcRmk");
		this.hashFields.put("io_bnd_cd", "ioBndCd");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("free_dys", "freeDys");
		this.hashFields.put("lgs_cost_cd", "lgsCostCd");
		this.hashFields.put("rf_mntr_dys", "rfMntrDys");
		this.hashFields.put("ob_vvd_cd", "obVvdCd");
		this.hashFields.put("tml_wrk_dy_cd", "tmlWrkDyCd");
		this.hashFields.put("inv_vol_qty", "invVolQty");
		this.hashFields.put("tml_edi_so_seq", "tmlEdiSoSeq");
		this.hashFields.put("tml_edi_so_dtl_seq", "tmlEdiSoDtlSeq");
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
	 * @return ibVvdCd
	 */
	public String getIbVvdCd() {
		return this.ibVvdCd;
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
	 * @return mtchModCd
	 */
	public String getMtchModCd() {
		return this.mtchModCd;
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
	 * @return callSgnNo
	 */
	public String getCallSgnNo() {
		return this.callSgnNo;
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
	 * @return custRefNoCtnt
	 */
	public String getCustRefNoCtnt() {
		return this.custRefNoCtnt;
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
	 * @return lloydNo
	 */
	public String getLloydNo() {
		return this.lloydNo;
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
	 * @return laneCd
	 */
	public String getLaneCd() {
		return this.laneCd;
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
	 * @return ediSoDtlId
	 */
	public String getEdiSoDtlId() {
		return this.ediSoDtlId;
	}
	
	/**
	 * Column Info
	 * @return imoNo
	 */
	public String getImoNo() {
		return this.imoNo;
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
	 * @return tmlCrrCd
	 */
	public String getTmlCrrCd() {
		return this.tmlCrrCd;
	}
	
	/**
	 * Column Info
	 * @return atbDt
	 */
	public String getAtbDt() {
		return this.atbDt;
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
	 * @return stayDys
	 */
	public String getStayDys() {
		return this.stayDys;
	}
	
	/**
	 * Column Info
	 * @return trfDesc
	 */
	public String getTrfDesc() {
		return this.trfDesc;
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
	 * @return iocCd
	 */
	public String getIocCd() {
		return this.iocCd;
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
	 * @return rvisVolQty
	 */
	public String getRvisVolQty() {
		return this.rvisVolQty;
	}
	
	/**
	 * Column Info
	 * @return tmlEdiSoOfcCtyCd
	 */
	public String getTmlEdiSoOfcCtyCd() {
		return this.tmlEdiSoOfcCtyCd;
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
	 * @return calcRmk
	 */
	public String getCalcRmk() {
		return this.calcRmk;
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
	 * @return freeDys
	 */
	public String getFreeDys() {
		return this.freeDys;
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
	 * @return obVvdCd
	 */
	public String getObVvdCd() {
		return this.obVvdCd;
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
	 * @return invVolQty
	 */
	public String getInvVolQty() {
		return this.invVolQty;
	}
	
	/**
	 * Column Info
	 * @return tmlEdiSoSeq
	 */
	public String getTmlEdiSoSeq() {
		return this.tmlEdiSoSeq;
	}
	
	/**
	 * Column Info
	 * @return tmlEdiSoDtlSeq
	 */
	public String getTmlEdiSoDtlSeq() {
		return this.tmlEdiSoDtlSeq;
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
	 * @param ibVvdCd
	 */
	public void setIbVvdCd(String ibVvdCd) {
		this.ibVvdCd = ibVvdCd;
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
	 * @param mtchModCd
	 */
	public void setMtchModCd(String mtchModCd) {
		this.mtchModCd = mtchModCd;
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
	 * @param callSgnNo
	 */
	public void setCallSgnNo(String callSgnNo) {
		this.callSgnNo = callSgnNo;
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
	 * @param custRefNoCtnt
	 */
	public void setCustRefNoCtnt(String custRefNoCtnt) {
		this.custRefNoCtnt = custRefNoCtnt;
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
	 * @param lloydNo
	 */
	public void setLloydNo(String lloydNo) {
		this.lloydNo = lloydNo;
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
	 * @param laneCd
	 */
	public void setLaneCd(String laneCd) {
		this.laneCd = laneCd;
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
	 * @param ediSoDtlId
	 */
	public void setEdiSoDtlId(String ediSoDtlId) {
		this.ediSoDtlId = ediSoDtlId;
	}
	
	/**
	 * Column Info
	 * @param imoNo
	 */
	public void setImoNo(String imoNo) {
		this.imoNo = imoNo;
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
	 * @param tmlCrrCd
	 */
	public void setTmlCrrCd(String tmlCrrCd) {
		this.tmlCrrCd = tmlCrrCd;
	}
	
	/**
	 * Column Info
	 * @param atbDt
	 */
	public void setAtbDt(String atbDt) {
		this.atbDt = atbDt;
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
	 * @param stayDys
	 */
	public void setStayDys(String stayDys) {
		this.stayDys = stayDys;
	}
	
	/**
	 * Column Info
	 * @param trfDesc
	 */
	public void setTrfDesc(String trfDesc) {
		this.trfDesc = trfDesc;
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
	 * @param iocCd
	 */
	public void setIocCd(String iocCd) {
		this.iocCd = iocCd;
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
	 * @param rvisVolQty
	 */
	public void setRvisVolQty(String rvisVolQty) {
		this.rvisVolQty = rvisVolQty;
	}
	
	/**
	 * Column Info
	 * @param tmlEdiSoOfcCtyCd
	 */
	public void setTmlEdiSoOfcCtyCd(String tmlEdiSoOfcCtyCd) {
		this.tmlEdiSoOfcCtyCd = tmlEdiSoOfcCtyCd;
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
	 * @param calcRmk
	 */
	public void setCalcRmk(String calcRmk) {
		this.calcRmk = calcRmk;
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
	 * @param freeDys
	 */
	public void setFreeDys(String freeDys) {
		this.freeDys = freeDys;
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
	 * @param obVvdCd
	 */
	public void setObVvdCd(String obVvdCd) {
		this.obVvdCd = obVvdCd;
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
	 * @param invVolQty
	 */
	public void setInvVolQty(String invVolQty) {
		this.invVolQty = invVolQty;
	}
	
	/**
	 * Column Info
	 * @param tmlEdiSoSeq
	 */
	public void setTmlEdiSoSeq(String tmlEdiSoSeq) {
		this.tmlEdiSoSeq = tmlEdiSoSeq;
	}
	
	/**
	 * Column Info
	 * @param tmlEdiSoDtlSeq
	 */
	public void setTmlEdiSoDtlSeq(String tmlEdiSoDtlSeq) {
		this.tmlEdiSoDtlSeq = tmlEdiSoDtlSeq;
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
		setIbVvdCd(JSPUtil.getParameter(request, prefix + "ib_vvd_cd", ""));
		setStkVolQty(JSPUtil.getParameter(request, prefix + "stk_vol_qty", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setMtchModCd(JSPUtil.getParameter(request, prefix + "mtch_mod_cd", ""));
		setFreeDyXcldDys(JSPUtil.getParameter(request, prefix + "free_dy_xcld_dys", ""));
		setVolTrUtCd(JSPUtil.getParameter(request, prefix + "vol_tr_ut_cd", ""));
		setCntrTpszCd(JSPUtil.getParameter(request, prefix + "cntr_tpsz_cd", ""));
		setInvXchRt(JSPUtil.getParameter(request, prefix + "inv_xch_rt", ""));
		setCalcVolQty(JSPUtil.getParameter(request, prefix + "calc_vol_qty", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setCallSgnNo(JSPUtil.getParameter(request, prefix + "call_sgn_no", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, prefix + "skd_voy_no", ""));
		setCustRefNoCtnt(JSPUtil.getParameter(request, prefix + "cust_ref_no_ctnt", ""));
		setDcgoIndCd(JSPUtil.getParameter(request, prefix + "dcgo_ind_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setFpTeuQty(JSPUtil.getParameter(request, prefix + "fp_teu_qty", ""));
		setLloydNo(JSPUtil.getParameter(request, prefix + "lloyd_no", ""));
		setRcFlg(JSPUtil.getParameter(request, prefix + "rc_flg", ""));
		setOvrDys(JSPUtil.getParameter(request, prefix + "ovr_dys", ""));
		setLaneCd(JSPUtil.getParameter(request, prefix + "lane_cd", ""));
		setTmlTrnsModCd(JSPUtil.getParameter(request, prefix + "tml_trns_mod_cd", ""));
		setEdiSoDtlId(JSPUtil.getParameter(request, prefix + "edi_so_dtl_id", ""));
		setImoNo(JSPUtil.getParameter(request, prefix + "imo_no", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setTmlCrrCd(JSPUtil.getParameter(request, prefix + "tml_crr_cd", ""));
		setAtbDt(JSPUtil.getParameter(request, prefix + "atb_dt", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setStayDys(JSPUtil.getParameter(request, prefix + "stay_dys", ""));
		setTrfDesc(JSPUtil.getParameter(request, prefix + "trf_desc", ""));
		setInvAmt(JSPUtil.getParameter(request, prefix + "inv_amt", ""));
		setWrkDt(JSPUtil.getParameter(request, prefix + "wrk_dt", ""));
		setIocCd(JSPUtil.getParameter(request, prefix + "ioc_cd", ""));
		setOvrVolQty(JSPUtil.getParameter(request, prefix + "ovr_vol_qty", ""));
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setRvisVolQty(JSPUtil.getParameter(request, prefix + "rvis_vol_qty", ""));
		setTmlEdiSoOfcCtyCd(JSPUtil.getParameter(request, prefix + "tml_edi_so_ofc_cty_cd", ""));
		setCtrtRt(JSPUtil.getParameter(request, prefix + "ctrt_rt", ""));
		setCalcRmk(JSPUtil.getParameter(request, prefix + "calc_rmk", ""));
		setIoBndCd(JSPUtil.getParameter(request, prefix + "io_bnd_cd", ""));
		setSkdDirCd(JSPUtil.getParameter(request, prefix + "skd_dir_cd", ""));
		setFreeDys(JSPUtil.getParameter(request, prefix + "free_dys", ""));
		setLgsCostCd(JSPUtil.getParameter(request, prefix + "lgs_cost_cd", ""));
		setRfMntrDys(JSPUtil.getParameter(request, prefix + "rf_mntr_dys", ""));
		setObVvdCd(JSPUtil.getParameter(request, prefix + "ob_vvd_cd", ""));
		setTmlWrkDyCd(JSPUtil.getParameter(request, prefix + "tml_wrk_dy_cd", ""));
		setInvVolQty(JSPUtil.getParameter(request, prefix + "inv_vol_qty", ""));
		setTmlEdiSoSeq(JSPUtil.getParameter(request, prefix + "tml_edi_so_seq", ""));
		setTmlEdiSoDtlSeq(JSPUtil.getParameter(request, prefix + "tml_edi_so_dtl_seq", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return TesEdiSoDtlVO[]
	 */
	public TesEdiSoDtlVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return TesEdiSoDtlVO[]
	 */
	public TesEdiSoDtlVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		TesEdiSoDtlVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] ibVvdCd = (JSPUtil.getParameter(request, prefix	+ "ib_vvd_cd", length));
			String[] stkVolQty = (JSPUtil.getParameter(request, prefix	+ "stk_vol_qty", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] mtchModCd = (JSPUtil.getParameter(request, prefix	+ "mtch_mod_cd", length));
			String[] freeDyXcldDys = (JSPUtil.getParameter(request, prefix	+ "free_dy_xcld_dys", length));
			String[] volTrUtCd = (JSPUtil.getParameter(request, prefix	+ "vol_tr_ut_cd", length));
			String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_cd", length));
			String[] invXchRt = (JSPUtil.getParameter(request, prefix	+ "inv_xch_rt", length));
			String[] calcVolQty = (JSPUtil.getParameter(request, prefix	+ "calc_vol_qty", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] callSgnNo = (JSPUtil.getParameter(request, prefix	+ "call_sgn_no", length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no", length));
			String[] custRefNoCtnt = (JSPUtil.getParameter(request, prefix	+ "cust_ref_no_ctnt", length));
			String[] dcgoIndCd = (JSPUtil.getParameter(request, prefix	+ "dcgo_ind_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] fpTeuQty = (JSPUtil.getParameter(request, prefix	+ "fp_teu_qty", length));
			String[] lloydNo = (JSPUtil.getParameter(request, prefix	+ "lloyd_no", length));
			String[] rcFlg = (JSPUtil.getParameter(request, prefix	+ "rc_flg", length));
			String[] ovrDys = (JSPUtil.getParameter(request, prefix	+ "ovr_dys", length));
			String[] laneCd = (JSPUtil.getParameter(request, prefix	+ "lane_cd", length));
			String[] tmlTrnsModCd = (JSPUtil.getParameter(request, prefix	+ "tml_trns_mod_cd", length));
			String[] ediSoDtlId = (JSPUtil.getParameter(request, prefix	+ "edi_so_dtl_id", length));
			String[] imoNo = (JSPUtil.getParameter(request, prefix	+ "imo_no", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] tmlCrrCd = (JSPUtil.getParameter(request, prefix	+ "tml_crr_cd", length));
			String[] atbDt = (JSPUtil.getParameter(request, prefix	+ "atb_dt", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] stayDys = (JSPUtil.getParameter(request, prefix	+ "stay_dys", length));
			String[] trfDesc = (JSPUtil.getParameter(request, prefix	+ "trf_desc", length));
			String[] invAmt = (JSPUtil.getParameter(request, prefix	+ "inv_amt", length));
			String[] wrkDt = (JSPUtil.getParameter(request, prefix	+ "wrk_dt", length));
			String[] iocCd = (JSPUtil.getParameter(request, prefix	+ "ioc_cd", length));
			String[] ovrVolQty = (JSPUtil.getParameter(request, prefix	+ "ovr_vol_qty", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] rvisVolQty = (JSPUtil.getParameter(request, prefix	+ "rvis_vol_qty", length));
			String[] tmlEdiSoOfcCtyCd = (JSPUtil.getParameter(request, prefix	+ "tml_edi_so_ofc_cty_cd", length));
			String[] ctrtRt = (JSPUtil.getParameter(request, prefix	+ "ctrt_rt", length));
			String[] calcRmk = (JSPUtil.getParameter(request, prefix	+ "calc_rmk", length));
			String[] ioBndCd = (JSPUtil.getParameter(request, prefix	+ "io_bnd_cd", length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd", length));
			String[] freeDys = (JSPUtil.getParameter(request, prefix	+ "free_dys", length));
			String[] lgsCostCd = (JSPUtil.getParameter(request, prefix	+ "lgs_cost_cd", length));
			String[] rfMntrDys = (JSPUtil.getParameter(request, prefix	+ "rf_mntr_dys", length));
			String[] obVvdCd = (JSPUtil.getParameter(request, prefix	+ "ob_vvd_cd", length));
			String[] tmlWrkDyCd = (JSPUtil.getParameter(request, prefix	+ "tml_wrk_dy_cd", length));
			String[] invVolQty = (JSPUtil.getParameter(request, prefix	+ "inv_vol_qty", length));
			String[] tmlEdiSoSeq = (JSPUtil.getParameter(request, prefix	+ "tml_edi_so_seq", length));
			String[] tmlEdiSoDtlSeq = (JSPUtil.getParameter(request, prefix	+ "tml_edi_so_dtl_seq", length));
			
			for (int i = 0; i < length; i++) {
				model = new TesEdiSoDtlVO();
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (ibVvdCd[i] != null)
					model.setIbVvdCd(ibVvdCd[i]);
				if (stkVolQty[i] != null)
					model.setStkVolQty(stkVolQty[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (mtchModCd[i] != null)
					model.setMtchModCd(mtchModCd[i]);
				if (freeDyXcldDys[i] != null)
					model.setFreeDyXcldDys(freeDyXcldDys[i]);
				if (volTrUtCd[i] != null)
					model.setVolTrUtCd(volTrUtCd[i]);
				if (cntrTpszCd[i] != null)
					model.setCntrTpszCd(cntrTpszCd[i]);
				if (invXchRt[i] != null)
					model.setInvXchRt(invXchRt[i]);
				if (calcVolQty[i] != null)
					model.setCalcVolQty(calcVolQty[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (callSgnNo[i] != null)
					model.setCallSgnNo(callSgnNo[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (custRefNoCtnt[i] != null)
					model.setCustRefNoCtnt(custRefNoCtnt[i]);
				if (dcgoIndCd[i] != null)
					model.setDcgoIndCd(dcgoIndCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (fpTeuQty[i] != null)
					model.setFpTeuQty(fpTeuQty[i]);
				if (lloydNo[i] != null)
					model.setLloydNo(lloydNo[i]);
				if (rcFlg[i] != null)
					model.setRcFlg(rcFlg[i]);
				if (ovrDys[i] != null)
					model.setOvrDys(ovrDys[i]);
				if (laneCd[i] != null)
					model.setLaneCd(laneCd[i]);
				if (tmlTrnsModCd[i] != null)
					model.setTmlTrnsModCd(tmlTrnsModCd[i]);
				if (ediSoDtlId[i] != null)
					model.setEdiSoDtlId(ediSoDtlId[i]);
				if (imoNo[i] != null)
					model.setImoNo(imoNo[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (tmlCrrCd[i] != null)
					model.setTmlCrrCd(tmlCrrCd[i]);
				if (atbDt[i] != null)
					model.setAtbDt(atbDt[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (stayDys[i] != null)
					model.setStayDys(stayDys[i]);
				if (trfDesc[i] != null)
					model.setTrfDesc(trfDesc[i]);
				if (invAmt[i] != null)
					model.setInvAmt(invAmt[i]);
				if (wrkDt[i] != null)
					model.setWrkDt(wrkDt[i]);
				if (iocCd[i] != null)
					model.setIocCd(iocCd[i]);
				if (ovrVolQty[i] != null)
					model.setOvrVolQty(ovrVolQty[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (rvisVolQty[i] != null)
					model.setRvisVolQty(rvisVolQty[i]);
				if (tmlEdiSoOfcCtyCd[i] != null)
					model.setTmlEdiSoOfcCtyCd(tmlEdiSoOfcCtyCd[i]);
				if (ctrtRt[i] != null)
					model.setCtrtRt(ctrtRt[i]);
				if (calcRmk[i] != null)
					model.setCalcRmk(calcRmk[i]);
				if (ioBndCd[i] != null)
					model.setIoBndCd(ioBndCd[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (freeDys[i] != null)
					model.setFreeDys(freeDys[i]);
				if (lgsCostCd[i] != null)
					model.setLgsCostCd(lgsCostCd[i]);
				if (rfMntrDys[i] != null)
					model.setRfMntrDys(rfMntrDys[i]);
				if (obVvdCd[i] != null)
					model.setObVvdCd(obVvdCd[i]);
				if (tmlWrkDyCd[i] != null)
					model.setTmlWrkDyCd(tmlWrkDyCd[i]);
				if (invVolQty[i] != null)
					model.setInvVolQty(invVolQty[i]);
				if (tmlEdiSoSeq[i] != null)
					model.setTmlEdiSoSeq(tmlEdiSoSeq[i]);
				if (tmlEdiSoDtlSeq[i] != null)
					model.setTmlEdiSoDtlSeq(tmlEdiSoDtlSeq[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getTesEdiSoDtlVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return TesEdiSoDtlVO[]
	 */
	public TesEdiSoDtlVO[] getTesEdiSoDtlVOs(){
		TesEdiSoDtlVO[] vos = (TesEdiSoDtlVO[])models.toArray(new TesEdiSoDtlVO[models.size()]);
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
		this.ibVvdCd = this.ibVvdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stkVolQty = this.stkVolQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mtchModCd = this.mtchModCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.freeDyXcldDys = this.freeDyXcldDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.volTrUtCd = this.volTrUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszCd = this.cntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invXchRt = this.invXchRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.calcVolQty = this.calcVolQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.callSgnNo = this.callSgnNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custRefNoCtnt = this.custRefNoCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dcgoIndCd = this.dcgoIndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fpTeuQty = this.fpTeuQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lloydNo = this.lloydNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcFlg = this.rcFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ovrDys = this.ovrDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.laneCd = this.laneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlTrnsModCd = this.tmlTrnsModCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediSoDtlId = this.ediSoDtlId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imoNo = this.imoNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlCrrCd = this.tmlCrrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.atbDt = this.atbDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stayDys = this.stayDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trfDesc = this.trfDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invAmt = this.invAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.wrkDt = this.wrkDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.iocCd = this.iocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ovrVolQty = this.ovrVolQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rvisVolQty = this.rvisVolQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlEdiSoOfcCtyCd = this.tmlEdiSoOfcCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ctrtRt = this.ctrtRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.calcRmk = this.calcRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ioBndCd = this.ioBndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.freeDys = this.freeDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lgsCostCd = this.lgsCostCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rfMntrDys = this.rfMntrDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.obVvdCd = this.obVvdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlWrkDyCd = this.tmlWrkDyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invVolQty = this.invVolQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlEdiSoSeq = this.tmlEdiSoSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlEdiSoDtlSeq = this.tmlEdiSoDtlSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
