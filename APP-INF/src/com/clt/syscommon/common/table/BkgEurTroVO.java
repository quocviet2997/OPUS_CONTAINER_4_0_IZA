/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgEurTroVO.java
*@FileTitle : BkgEurTroVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.12.23
*@LastModifier : 이남경
*@LastVersion : 1.0
* 2009.12.23 이남경 
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
 * @author 이남경
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgEurTroVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgEurTroVO> models = new ArrayList<BkgEurTroVO>();
	
	/* Column Info */
	private String cntrPkupYdCd = null;
	/* Column Info */
	private String eurTrnsTpCd = null;
	/* Column Info */
	private String cxlFlg = null;
	/* Column Info */
	private String dcgoSeq = null;
	/* Column Info */
	private String awkCgoSeq = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String corrFlg = null;
	/* Column Info */
	private String pctlNo = null;
	/* Column Info */
	private String cntrRtnYdCd = null;
	/* Column Info */
	private String cfmCurrCd = null;
	/* Column Info */
	private String cstmsClrNo = null;
	/* Column Info */
	private String cntrTpszCd = null;
	/* Column Info */
	private String cfmUsrId = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String cgoWgt = null;
	/* Column Info */
	private String repCmdtDesc = null;
	/* Column Info */
	private String cfmDt = null;
	/* Column Info */
	private String cfmHlgTpCd = null;
	/* Column Info */
	private String cfmAllInRtCd = null;
	/* Column Info */
	private String troProcCd = null;
	/* Column Info */
	private String cfmVatFlg = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String rqstSubSeq = null;
	/* Column Info */
	private String rcSeq = null;
	/* Column Info */
	private String cfmUpdDt = null;
	/* Column Info */
	private String soSeqNo = null;
	/* Column Info */
	private String currCd = null;
	/* Column Info */
	private String trnsRevAmt = null;
	/* Column Info */
	private String soCtyCd = null;
	/* Column Info */
	private String creDt = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String cmdtCd = null;
	/* Column Info */
	private String allInRtCd = null;
	/* Column Info */
	private String actCntCd = null;
	/* Column Info */
	private String creOfcCd = null;
	/* Column Info */
	private String vatFlg = null;
	/* Column Info */
	private String spclInstrRmk = null;
	/* Column Info */
	private String hlgTpCd = null;
	/* Column Info */
	private String t1DocFlg = null;
	/* Column Info */
	private String cntrRtnDt = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String troSeq = null;
	/* Column Info */
	private String actCustSeq = null;
	/* Column Info */
	private String cfmRevAmt = null;
	/* Column Info */
	private String corrNo = null;
	/* Column Info */
	private String cntrCfmFlg = null;
	/* Column Info */
	private String bkgTrspMzdCd = null;
	/* Column Info */
	private String ioBndCd = null;
	/* Column Info */
	private String cfmFlg = null;
	/* Column Info */
	private String drpOffPkupYdCd = null;
	/* Column Info */
	private String cfmOfcCd = null;
	/* Column Info */
	private String cntrPkupDt = null;
	/* Column Info */
	private String cntrNo = null;
	/* Column Info */
	private String cntrCfmUsrId = null;
	/* Column Info */
	private String repCmdtCd = null;
	/* Column Info */
	private String commOfcCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgEurTroVO() {}

	public BkgEurTroVO(String ibflag, String pagerows, String bkgNo, String ioBndCd, String troSeq, String rqstSubSeq, String cntrNo, String cntrTpszCd, String dcgoSeq, String rcSeq, String awkCgoSeq, String hlgTpCd, String cgoWgt, String cntrPkupYdCd, String cntrPkupDt, String cntrRtnYdCd, String cntrRtnDt, String eurTrnsTpCd, String drpOffPkupYdCd, String cmdtCd, String repCmdtCd, String repCmdtDesc, String bkgTrspMzdCd, String spclInstrRmk, String troProcCd, String cxlFlg, String cstmsClrNo, String allInRtCd, String currCd, String vatFlg, String t1DocFlg, String trnsRevAmt, String soCtyCd, String soSeqNo, String actCntCd, String actCustSeq, String corrNo, String corrFlg, String cfmFlg, String cfmUsrId, String cfmOfcCd, String cfmDt, String cfmUpdDt, String cfmHlgTpCd, String cfmAllInRtCd, String cfmCurrCd, String cfmRevAmt, String cfmVatFlg, String pctlNo, String creOfcCd, String creUsrId, String creDt, String updUsrId, String updDt, String cntrCfmFlg, String cntrCfmUsrId) {
		this.cntrPkupYdCd = cntrPkupYdCd;
		this.eurTrnsTpCd = eurTrnsTpCd;
		this.cxlFlg = cxlFlg;
		this.dcgoSeq = dcgoSeq;
		this.awkCgoSeq = awkCgoSeq;
		this.pagerows = pagerows;
		this.corrFlg = corrFlg;
		this.pctlNo = pctlNo;
		this.cntrRtnYdCd = cntrRtnYdCd;
		this.cfmCurrCd = cfmCurrCd;
		this.cstmsClrNo = cstmsClrNo;
		this.cntrTpszCd = cntrTpszCd;
		this.cfmUsrId = cfmUsrId;
		this.updUsrId = updUsrId;
		this.cgoWgt = cgoWgt;
		this.repCmdtDesc = repCmdtDesc;
		this.cfmDt = cfmDt;
		this.cfmHlgTpCd = cfmHlgTpCd;
		this.cfmAllInRtCd = cfmAllInRtCd;
		this.troProcCd = troProcCd;
		this.cfmVatFlg = cfmVatFlg;
		this.creUsrId = creUsrId;
		this.bkgNo = bkgNo;
		this.rqstSubSeq = rqstSubSeq;
		this.rcSeq = rcSeq;
		this.cfmUpdDt = cfmUpdDt;
		this.soSeqNo = soSeqNo;
		this.currCd = currCd;
		this.trnsRevAmt = trnsRevAmt;
		this.soCtyCd = soCtyCd;
		this.creDt = creDt;
		this.ibflag = ibflag;
		this.cmdtCd = cmdtCd;
		this.allInRtCd = allInRtCd;
		this.actCntCd = actCntCd;
		this.creOfcCd = creOfcCd;
		this.vatFlg = vatFlg;
		this.spclInstrRmk = spclInstrRmk;
		this.hlgTpCd = hlgTpCd;
		this.t1DocFlg = t1DocFlg;
		this.cntrRtnDt = cntrRtnDt;
		this.updDt = updDt;
		this.troSeq = troSeq;
		this.actCustSeq = actCustSeq;
		this.cfmRevAmt = cfmRevAmt;
		this.corrNo = corrNo;
		this.cntrCfmFlg = cntrCfmFlg;
		this.bkgTrspMzdCd = bkgTrspMzdCd;
		this.ioBndCd = ioBndCd;
		this.cfmFlg = cfmFlg;
		this.drpOffPkupYdCd = drpOffPkupYdCd;
		this.cfmOfcCd = cfmOfcCd;
		this.cntrPkupDt = cntrPkupDt;
		this.cntrNo = cntrNo;
		this.cntrCfmUsrId = cntrCfmUsrId;
		this.repCmdtCd = repCmdtCd;
		this.commOfcCd = commOfcCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("cntr_pkup_yd_cd", getCntrPkupYdCd());
		this.hashColumns.put("eur_trns_tp_cd", getEurTrnsTpCd());
		this.hashColumns.put("cxl_flg", getCxlFlg());
		this.hashColumns.put("dcgo_seq", getDcgoSeq());
		this.hashColumns.put("awk_cgo_seq", getAwkCgoSeq());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("corr_flg", getCorrFlg());
		this.hashColumns.put("pctl_no", getPctlNo());
		this.hashColumns.put("cntr_rtn_yd_cd", getCntrRtnYdCd());
		this.hashColumns.put("cfm_curr_cd", getCfmCurrCd());
		this.hashColumns.put("cstms_clr_no", getCstmsClrNo());
		this.hashColumns.put("cntr_tpsz_cd", getCntrTpszCd());
		this.hashColumns.put("cfm_usr_id", getCfmUsrId());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("cgo_wgt", getCgoWgt());
		this.hashColumns.put("rep_cmdt_desc", getRepCmdtDesc());
		this.hashColumns.put("cfm_dt", getCfmDt());
		this.hashColumns.put("cfm_hlg_tp_cd", getCfmHlgTpCd());
		this.hashColumns.put("cfm_all_in_rt_cd", getCfmAllInRtCd());
		this.hashColumns.put("tro_proc_cd", getTroProcCd());
		this.hashColumns.put("cfm_vat_flg", getCfmVatFlg());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("rqst_sub_seq", getRqstSubSeq());
		this.hashColumns.put("rc_seq", getRcSeq());
		this.hashColumns.put("cfm_upd_dt", getCfmUpdDt());
		this.hashColumns.put("so_seq_no", getSoSeqNo());
		this.hashColumns.put("curr_cd", getCurrCd());
		this.hashColumns.put("trns_rev_amt", getTrnsRevAmt());
		this.hashColumns.put("so_cty_cd", getSoCtyCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cmdt_cd", getCmdtCd());
		this.hashColumns.put("all_in_rt_cd", getAllInRtCd());
		this.hashColumns.put("act_cnt_cd", getActCntCd());
		this.hashColumns.put("cre_ofc_cd", getCreOfcCd());
		this.hashColumns.put("vat_flg", getVatFlg());
		this.hashColumns.put("spcl_instr_rmk", getSpclInstrRmk());
		this.hashColumns.put("hlg_tp_cd", getHlgTpCd());
		this.hashColumns.put("t1_doc_flg", getT1DocFlg());
		this.hashColumns.put("cntr_rtn_dt", getCntrRtnDt());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("tro_seq", getTroSeq());
		this.hashColumns.put("act_cust_seq", getActCustSeq());
		this.hashColumns.put("cfm_rev_amt", getCfmRevAmt());
		this.hashColumns.put("corr_no", getCorrNo());
		this.hashColumns.put("cntr_cfm_flg", getCntrCfmFlg());
		this.hashColumns.put("bkg_trsp_mzd_cd", getBkgTrspMzdCd());
		this.hashColumns.put("io_bnd_cd", getIoBndCd());
		this.hashColumns.put("cfm_flg", getCfmFlg());
		this.hashColumns.put("drp_off_pkup_yd_cd", getDrpOffPkupYdCd());
		this.hashColumns.put("cfm_ofc_cd", getCfmOfcCd());
		this.hashColumns.put("cntr_pkup_dt", getCntrPkupDt());
		this.hashColumns.put("cntr_no", getCntrNo());
		this.hashColumns.put("cntr_cfm_usr_id", getCntrCfmUsrId());
		this.hashColumns.put("rep_cmdt_cd", getRepCmdtCd());
		this.hashColumns.put("comm_ofc_cd", getCommOfcCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("cntr_pkup_yd_cd", "cntrPkupYdCd");
		this.hashFields.put("eur_trns_tp_cd", "eurTrnsTpCd");
		this.hashFields.put("cxl_flg", "cxlFlg");
		this.hashFields.put("dcgo_seq", "dcgoSeq");
		this.hashFields.put("awk_cgo_seq", "awkCgoSeq");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("corr_flg", "corrFlg");
		this.hashFields.put("pctl_no", "pctlNo");
		this.hashFields.put("cntr_rtn_yd_cd", "cntrRtnYdCd");
		this.hashFields.put("cfm_curr_cd", "cfmCurrCd");
		this.hashFields.put("cstms_clr_no", "cstmsClrNo");
		this.hashFields.put("cntr_tpsz_cd", "cntrTpszCd");
		this.hashFields.put("cfm_usr_id", "cfmUsrId");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("cgo_wgt", "cgoWgt");
		this.hashFields.put("rep_cmdt_desc", "repCmdtDesc");
		this.hashFields.put("cfm_dt", "cfmDt");
		this.hashFields.put("cfm_hlg_tp_cd", "cfmHlgTpCd");
		this.hashFields.put("cfm_all_in_rt_cd", "cfmAllInRtCd");
		this.hashFields.put("tro_proc_cd", "troProcCd");
		this.hashFields.put("cfm_vat_flg", "cfmVatFlg");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("rqst_sub_seq", "rqstSubSeq");
		this.hashFields.put("rc_seq", "rcSeq");
		this.hashFields.put("cfm_upd_dt", "cfmUpdDt");
		this.hashFields.put("so_seq_no", "soSeqNo");
		this.hashFields.put("curr_cd", "currCd");
		this.hashFields.put("trns_rev_amt", "trnsRevAmt");
		this.hashFields.put("so_cty_cd", "soCtyCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cmdt_cd", "cmdtCd");
		this.hashFields.put("all_in_rt_cd", "allInRtCd");
		this.hashFields.put("act_cnt_cd", "actCntCd");
		this.hashFields.put("cre_ofc_cd", "creOfcCd");
		this.hashFields.put("vat_flg", "vatFlg");
		this.hashFields.put("spcl_instr_rmk", "spclInstrRmk");
		this.hashFields.put("hlg_tp_cd", "hlgTpCd");
		this.hashFields.put("t1_doc_flg", "t1DocFlg");
		this.hashFields.put("cntr_rtn_dt", "cntrRtnDt");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("tro_seq", "troSeq");
		this.hashFields.put("act_cust_seq", "actCustSeq");
		this.hashFields.put("cfm_rev_amt", "cfmRevAmt");
		this.hashFields.put("corr_no", "corrNo");
		this.hashFields.put("cntr_cfm_flg", "cntrCfmFlg");
		this.hashFields.put("bkg_trsp_mzd_cd", "bkgTrspMzdCd");
		this.hashFields.put("io_bnd_cd", "ioBndCd");
		this.hashFields.put("cfm_flg", "cfmFlg");
		this.hashFields.put("drp_off_pkup_yd_cd", "drpOffPkupYdCd");
		this.hashFields.put("cfm_ofc_cd", "cfmOfcCd");
		this.hashFields.put("cntr_pkup_dt", "cntrPkupDt");
		this.hashFields.put("cntr_no", "cntrNo");
		this.hashFields.put("cntr_cfm_usr_id", "cntrCfmUsrId");
		this.hashFields.put("rep_cmdt_cd", "repCmdtCd");
		this.hashFields.put("comm_ofc_cd", "commOfcCd");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return cntrPkupYdCd
	 */
	public String getCntrPkupYdCd() {
		return this.cntrPkupYdCd;
	}
	
	/**
	 * Column Info
	 * @return eurTrnsTpCd
	 */
	public String getEurTrnsTpCd() {
		return this.eurTrnsTpCd;
	}
	
	/**
	 * Column Info
	 * @return cxlFlg
	 */
	public String getCxlFlg() {
		return this.cxlFlg;
	}
	
	/**
	 * Column Info
	 * @return dcgoSeq
	 */
	public String getDcgoSeq() {
		return this.dcgoSeq;
	}
	
	/**
	 * Column Info
	 * @return awkCgoSeq
	 */
	public String getAwkCgoSeq() {
		return this.awkCgoSeq;
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
	 * @return corrFlg
	 */
	public String getCorrFlg() {
		return this.corrFlg;
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
	 * @return cntrRtnYdCd
	 */
	public String getCntrRtnYdCd() {
		return this.cntrRtnYdCd;
	}
	
	/**
	 * Column Info
	 * @return cfmCurrCd
	 */
	public String getCfmCurrCd() {
		return this.cfmCurrCd;
	}
	
	/**
	 * Column Info
	 * @return cstmsClrNo
	 */
	public String getCstmsClrNo() {
		return this.cstmsClrNo;
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
	 * @return cfmUsrId
	 */
	public String getCfmUsrId() {
		return this.cfmUsrId;
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
	 * @return cgoWgt
	 */
	public String getCgoWgt() {
		return this.cgoWgt;
	}
	
	/**
	 * Column Info
	 * @return repCmdtDesc
	 */
	public String getRepCmdtDesc() {
		return this.repCmdtDesc;
	}
	
	/**
	 * Column Info
	 * @return cfmDt
	 */
	public String getCfmDt() {
		return this.cfmDt;
	}
	
	/**
	 * Column Info
	 * @return cfmHlgTpCd
	 */
	public String getCfmHlgTpCd() {
		return this.cfmHlgTpCd;
	}
	
	/**
	 * Column Info
	 * @return cfmAllInRtCd
	 */
	public String getCfmAllInRtCd() {
		return this.cfmAllInRtCd;
	}
	
	/**
	 * Column Info
	 * @return troProcCd
	 */
	public String getTroProcCd() {
		return this.troProcCd;
	}
	
	/**
	 * Column Info
	 * @return cfmVatFlg
	 */
	public String getCfmVatFlg() {
		return this.cfmVatFlg;
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
	 * @return bkgNo
	 */
	public String getBkgNo() {
		return this.bkgNo;
	}
	
	/**
	 * Column Info
	 * @return rqstSubSeq
	 */
	public String getRqstSubSeq() {
		return this.rqstSubSeq;
	}
	
	/**
	 * Column Info
	 * @return rcSeq
	 */
	public String getRcSeq() {
		return this.rcSeq;
	}
	
	/**
	 * Column Info
	 * @return cfmUpdDt
	 */
	public String getCfmUpdDt() {
		return this.cfmUpdDt;
	}
	
	/**
	 * Column Info
	 * @return soSeqNo
	 */
	public String getSoSeqNo() {
		return this.soSeqNo;
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
	 * @return trnsRevAmt
	 */
	public String getTrnsRevAmt() {
		return this.trnsRevAmt;
	}
	
	/**
	 * Column Info
	 * @return soCtyCd
	 */
	public String getSoCtyCd() {
		return this.soCtyCd;
	}
	
	/**
	 * Column Info
	 * @return creDt
	 */
	public String getCreDt() {
		return this.creDt;
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
	 * @return allInRtCd
	 */
	public String getAllInRtCd() {
		return this.allInRtCd;
	}
	
	/**
	 * Column Info
	 * @return actCntCd
	 */
	public String getActCntCd() {
		return this.actCntCd;
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
	 * @return vatFlg
	 */
	public String getVatFlg() {
		return this.vatFlg;
	}
	
	/**
	 * Column Info
	 * @return spclInstrRmk
	 */
	public String getSpclInstrRmk() {
		return this.spclInstrRmk;
	}
	
	/**
	 * Column Info
	 * @return hlgTpCd
	 */
	public String getHlgTpCd() {
		return this.hlgTpCd;
	}
	
	/**
	 * Column Info
	 * @return t1DocFlg
	 */
	public String getT1DocFlg() {
		return this.t1DocFlg;
	}
	
	/**
	 * Column Info
	 * @return cntrRtnDt
	 */
	public String getCntrRtnDt() {
		return this.cntrRtnDt;
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
	 * @return troSeq
	 */
	public String getTroSeq() {
		return this.troSeq;
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
	 * @return cfmRevAmt
	 */
	public String getCfmRevAmt() {
		return this.cfmRevAmt;
	}
	
	/**
	 * Column Info
	 * @return corrNo
	 */
	public String getCorrNo() {
		return this.corrNo;
	}
	
	/**
	 * Column Info
	 * @return cntrCfmFlg
	 */
	public String getCntrCfmFlg() {
		return this.cntrCfmFlg;
	}
	
	/**
	 * Column Info
	 * @return bkgTrspMzdCd
	 */
	public String getBkgTrspMzdCd() {
		return this.bkgTrspMzdCd;
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
	 * @return cfmFlg
	 */
	public String getCfmFlg() {
		return this.cfmFlg;
	}
	
	/**
	 * Column Info
	 * @return drpOffPkupYdCd
	 */
	public String getDrpOffPkupYdCd() {
		return this.drpOffPkupYdCd;
	}
	
	/**
	 * Column Info
	 * @return cfmOfcCd
	 */
	public String getCfmOfcCd() {
		return this.cfmOfcCd;
	}
	
	/**
	 * Column Info
	 * @return cntrPkupDt
	 */
	public String getCntrPkupDt() {
		return this.cntrPkupDt;
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
	 * @return cntrCfmUsrId
	 */
	public String getCntrCfmUsrId() {
		return this.cntrCfmUsrId;
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
	 * @return commOfcCd
	 */
	public String getCommOfcCd() {
		return this.commOfcCd;
	}

	/**
	 * Column Info
	 * @param cntrPkupYdCd
	 */
	public void setCntrPkupYdCd(String cntrPkupYdCd) {
		this.cntrPkupYdCd = cntrPkupYdCd;
	}
	
	/**
	 * Column Info
	 * @param eurTrnsTpCd
	 */
	public void setEurTrnsTpCd(String eurTrnsTpCd) {
		this.eurTrnsTpCd = eurTrnsTpCd;
	}
	
	/**
	 * Column Info
	 * @param cxlFlg
	 */
	public void setCxlFlg(String cxlFlg) {
		this.cxlFlg = cxlFlg;
	}
	
	/**
	 * Column Info
	 * @param dcgoSeq
	 */
	public void setDcgoSeq(String dcgoSeq) {
		this.dcgoSeq = dcgoSeq;
	}
	
	/**
	 * Column Info
	 * @param awkCgoSeq
	 */
	public void setAwkCgoSeq(String awkCgoSeq) {
		this.awkCgoSeq = awkCgoSeq;
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
	 * @param corrFlg
	 */
	public void setCorrFlg(String corrFlg) {
		this.corrFlg = corrFlg;
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
	 * @param cntrRtnYdCd
	 */
	public void setCntrRtnYdCd(String cntrRtnYdCd) {
		this.cntrRtnYdCd = cntrRtnYdCd;
	}
	
	/**
	 * Column Info
	 * @param cfmCurrCd
	 */
	public void setCfmCurrCd(String cfmCurrCd) {
		this.cfmCurrCd = cfmCurrCd;
	}
	
	/**
	 * Column Info
	 * @param cstmsClrNo
	 */
	public void setCstmsClrNo(String cstmsClrNo) {
		this.cstmsClrNo = cstmsClrNo;
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
	 * @param cfmUsrId
	 */
	public void setCfmUsrId(String cfmUsrId) {
		this.cfmUsrId = cfmUsrId;
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
	 * @param cgoWgt
	 */
	public void setCgoWgt(String cgoWgt) {
		this.cgoWgt = cgoWgt;
	}
	
	/**
	 * Column Info
	 * @param repCmdtDesc
	 */
	public void setRepCmdtDesc(String repCmdtDesc) {
		this.repCmdtDesc = repCmdtDesc;
	}
	
	/**
	 * Column Info
	 * @param cfmDt
	 */
	public void setCfmDt(String cfmDt) {
		this.cfmDt = cfmDt;
	}
	
	/**
	 * Column Info
	 * @param cfmHlgTpCd
	 */
	public void setCfmHlgTpCd(String cfmHlgTpCd) {
		this.cfmHlgTpCd = cfmHlgTpCd;
	}
	
	/**
	 * Column Info
	 * @param cfmAllInRtCd
	 */
	public void setCfmAllInRtCd(String cfmAllInRtCd) {
		this.cfmAllInRtCd = cfmAllInRtCd;
	}
	
	/**
	 * Column Info
	 * @param troProcCd
	 */
	public void setTroProcCd(String troProcCd) {
		this.troProcCd = troProcCd;
	}
	
	/**
	 * Column Info
	 * @param cfmVatFlg
	 */
	public void setCfmVatFlg(String cfmVatFlg) {
		this.cfmVatFlg = cfmVatFlg;
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
	 * @param bkgNo
	 */
	public void setBkgNo(String bkgNo) {
		this.bkgNo = bkgNo;
	}
	
	/**
	 * Column Info
	 * @param rqstSubSeq
	 */
	public void setRqstSubSeq(String rqstSubSeq) {
		this.rqstSubSeq = rqstSubSeq;
	}
	
	/**
	 * Column Info
	 * @param rcSeq
	 */
	public void setRcSeq(String rcSeq) {
		this.rcSeq = rcSeq;
	}
	
	/**
	 * Column Info
	 * @param cfmUpdDt
	 */
	public void setCfmUpdDt(String cfmUpdDt) {
		this.cfmUpdDt = cfmUpdDt;
	}
	
	/**
	 * Column Info
	 * @param soSeqNo
	 */
	public void setSoSeqNo(String soSeqNo) {
		this.soSeqNo = soSeqNo;
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
	 * @param trnsRevAmt
	 */
	public void setTrnsRevAmt(String trnsRevAmt) {
		this.trnsRevAmt = trnsRevAmt;
	}
	
	/**
	 * Column Info
	 * @param soCtyCd
	 */
	public void setSoCtyCd(String soCtyCd) {
		this.soCtyCd = soCtyCd;
	}
	
	/**
	 * Column Info
	 * @param creDt
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
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
	 * @param allInRtCd
	 */
	public void setAllInRtCd(String allInRtCd) {
		this.allInRtCd = allInRtCd;
	}
	
	/**
	 * Column Info
	 * @param actCntCd
	 */
	public void setActCntCd(String actCntCd) {
		this.actCntCd = actCntCd;
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
	 * @param vatFlg
	 */
	public void setVatFlg(String vatFlg) {
		this.vatFlg = vatFlg;
	}
	
	/**
	 * Column Info
	 * @param spclInstrRmk
	 */
	public void setSpclInstrRmk(String spclInstrRmk) {
		this.spclInstrRmk = spclInstrRmk;
	}
	
	/**
	 * Column Info
	 * @param hlgTpCd
	 */
	public void setHlgTpCd(String hlgTpCd) {
		this.hlgTpCd = hlgTpCd;
	}
	
	/**
	 * Column Info
	 * @param t1DocFlg
	 */
	public void setT1DocFlg(String t1DocFlg) {
		this.t1DocFlg = t1DocFlg;
	}
	
	/**
	 * Column Info
	 * @param cntrRtnDt
	 */
	public void setCntrRtnDt(String cntrRtnDt) {
		this.cntrRtnDt = cntrRtnDt;
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
	 * @param troSeq
	 */
	public void setTroSeq(String troSeq) {
		this.troSeq = troSeq;
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
	 * @param cfmRevAmt
	 */
	public void setCfmRevAmt(String cfmRevAmt) {
		this.cfmRevAmt = cfmRevAmt;
	}
	
	/**
	 * Column Info
	 * @param corrNo
	 */
	public void setCorrNo(String corrNo) {
		this.corrNo = corrNo;
	}
	
	/**
	 * Column Info
	 * @param cntrCfmFlg
	 */
	public void setCntrCfmFlg(String cntrCfmFlg) {
		this.cntrCfmFlg = cntrCfmFlg;
	}
	
	/**
	 * Column Info
	 * @param bkgTrspMzdCd
	 */
	public void setBkgTrspMzdCd(String bkgTrspMzdCd) {
		this.bkgTrspMzdCd = bkgTrspMzdCd;
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
	 * @param cfmFlg
	 */
	public void setCfmFlg(String cfmFlg) {
		this.cfmFlg = cfmFlg;
	}
	
	/**
	 * Column Info
	 * @param drpOffPkupYdCd
	 */
	public void setDrpOffPkupYdCd(String drpOffPkupYdCd) {
		this.drpOffPkupYdCd = drpOffPkupYdCd;
	}
	
	/**
	 * Column Info
	 * @param cfmOfcCd
	 */
	public void setCfmOfcCd(String cfmOfcCd) {
		this.cfmOfcCd = cfmOfcCd;
	}
	
	/**
	 * Column Info
	 * @param cntrPkupDt
	 */
	public void setCntrPkupDt(String cntrPkupDt) {
		this.cntrPkupDt = cntrPkupDt;
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
	 * @param cntrCfmUsrId
	 */
	public void setCntrCfmUsrId(String cntrCfmUsrId) {
		this.cntrCfmUsrId = cntrCfmUsrId;
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
	 * @param commOfcCd
	 */
	public void setCommOfcCd(String commOfcCd) {
		this.commOfcCd = commOfcCd;
	}
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setCntrPkupYdCd(JSPUtil.getParameter(request, "cntr_pkup_yd_cd", ""));
		setEurTrnsTpCd(JSPUtil.getParameter(request, "eur_trns_tp_cd", ""));
		setCxlFlg(JSPUtil.getParameter(request, "cxl_flg", ""));
		setDcgoSeq(JSPUtil.getParameter(request, "dcgo_seq", ""));
		setAwkCgoSeq(JSPUtil.getParameter(request, "awk_cgo_seq", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setCorrFlg(JSPUtil.getParameter(request, "corr_flg", ""));
		setPctlNo(JSPUtil.getParameter(request, "pctl_no", ""));
		setCntrRtnYdCd(JSPUtil.getParameter(request, "cntr_rtn_yd_cd", ""));
		setCfmCurrCd(JSPUtil.getParameter(request, "cfm_curr_cd", ""));
		setCstmsClrNo(JSPUtil.getParameter(request, "cstms_clr_no", ""));
		setCntrTpszCd(JSPUtil.getParameter(request, "cntr_tpsz_cd", ""));
		setCfmUsrId(JSPUtil.getParameter(request, "cfm_usr_id", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setCgoWgt(JSPUtil.getParameter(request, "cgo_wgt", ""));
		setRepCmdtDesc(JSPUtil.getParameter(request, "rep_cmdt_desc", ""));
		setCfmDt(JSPUtil.getParameter(request, "cfm_dt", ""));
		setCfmHlgTpCd(JSPUtil.getParameter(request, "cfm_hlg_tp_cd", ""));
		setCfmAllInRtCd(JSPUtil.getParameter(request, "cfm_all_in_rt_cd", ""));
		setTroProcCd(JSPUtil.getParameter(request, "tro_proc_cd", ""));
		setCfmVatFlg(JSPUtil.getParameter(request, "cfm_vat_flg", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setRqstSubSeq(JSPUtil.getParameter(request, "rqst_sub_seq", ""));
		setRcSeq(JSPUtil.getParameter(request, "rc_seq", ""));
		setCfmUpdDt(JSPUtil.getParameter(request, "cfm_upd_dt", ""));
		setSoSeqNo(JSPUtil.getParameter(request, "so_seq_no", ""));
		setCurrCd(JSPUtil.getParameter(request, "curr_cd", ""));
		setTrnsRevAmt(JSPUtil.getParameter(request, "trns_rev_amt", ""));
		setSoCtyCd(JSPUtil.getParameter(request, "so_cty_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCmdtCd(JSPUtil.getParameter(request, "cmdt_cd", ""));
		setAllInRtCd(JSPUtil.getParameter(request, "all_in_rt_cd", ""));
		setActCntCd(JSPUtil.getParameter(request, "act_cnt_cd", ""));
		setCreOfcCd(JSPUtil.getParameter(request, "cre_ofc_cd", ""));
		setVatFlg(JSPUtil.getParameter(request, "vat_flg", ""));
		setSpclInstrRmk(JSPUtil.getParameter(request, "spcl_instr_rmk", ""));
		setHlgTpCd(JSPUtil.getParameter(request, "hlg_tp_cd", ""));
		setT1DocFlg(JSPUtil.getParameter(request, "t1_doc_flg", ""));
		setCntrRtnDt(JSPUtil.getParameter(request, "cntr_rtn_dt", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setTroSeq(JSPUtil.getParameter(request, "tro_seq", ""));
		setActCustSeq(JSPUtil.getParameter(request, "act_cust_seq", ""));
		setCfmRevAmt(JSPUtil.getParameter(request, "cfm_rev_amt", ""));
		setCorrNo(JSPUtil.getParameter(request, "corr_no", ""));
		setCntrCfmFlg(JSPUtil.getParameter(request, "cntr_cfm_flg", ""));
		setBkgTrspMzdCd(JSPUtil.getParameter(request, "bkg_trsp_mzd_cd", ""));
		setIoBndCd(JSPUtil.getParameter(request, "io_bnd_cd", ""));
		setCfmFlg(JSPUtil.getParameter(request, "cfm_flg", ""));
		setDrpOffPkupYdCd(JSPUtil.getParameter(request, "drp_off_pkup_yd_cd", ""));
		setCfmOfcCd(JSPUtil.getParameter(request, "cfm_ofc_cd", ""));
		setCntrPkupDt(JSPUtil.getParameter(request, "cntr_pkup_dt", ""));
		setCntrNo(JSPUtil.getParameter(request, "cntr_no", ""));
		setCntrCfmUsrId(JSPUtil.getParameter(request, "cntr_cfm_usr_id", ""));
		setRepCmdtCd(JSPUtil.getParameter(request, "rep_cmdt_cd", ""));
		setCommOfcCd(JSPUtil.getParameter(request, "comm_ofc_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgEurTroVO[]
	 */
	public BkgEurTroVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgEurTroVO[]
	 */
	public BkgEurTroVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgEurTroVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] cntrPkupYdCd = (JSPUtil.getParameter(request, prefix	+ "cntr_pkup_yd_cd", length));
			String[] eurTrnsTpCd = (JSPUtil.getParameter(request, prefix	+ "eur_trns_tp_cd", length));
			String[] cxlFlg = (JSPUtil.getParameter(request, prefix	+ "cxl_flg", length));
			String[] dcgoSeq = (JSPUtil.getParameter(request, prefix	+ "dcgo_seq", length));
			String[] awkCgoSeq = (JSPUtil.getParameter(request, prefix	+ "awk_cgo_seq", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] corrFlg = (JSPUtil.getParameter(request, prefix	+ "corr_flg", length));
			String[] pctlNo = (JSPUtil.getParameter(request, prefix	+ "pctl_no", length));
			String[] cntrRtnYdCd = (JSPUtil.getParameter(request, prefix	+ "cntr_rtn_yd_cd", length));
			String[] cfmCurrCd = (JSPUtil.getParameter(request, prefix	+ "cfm_curr_cd", length));
			String[] cstmsClrNo = (JSPUtil.getParameter(request, prefix	+ "cstms_clr_no", length));
			String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_cd", length));
			String[] cfmUsrId = (JSPUtil.getParameter(request, prefix	+ "cfm_usr_id", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] cgoWgt = (JSPUtil.getParameter(request, prefix	+ "cgo_wgt", length));
			String[] repCmdtDesc = (JSPUtil.getParameter(request, prefix	+ "rep_cmdt_desc", length));
			String[] cfmDt = (JSPUtil.getParameter(request, prefix	+ "cfm_dt", length));
			String[] cfmHlgTpCd = (JSPUtil.getParameter(request, prefix	+ "cfm_hlg_tp_cd", length));
			String[] cfmAllInRtCd = (JSPUtil.getParameter(request, prefix	+ "cfm_all_in_rt_cd", length));
			String[] troProcCd = (JSPUtil.getParameter(request, prefix	+ "tro_proc_cd", length));
			String[] cfmVatFlg = (JSPUtil.getParameter(request, prefix	+ "cfm_vat_flg", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] rqstSubSeq = (JSPUtil.getParameter(request, prefix	+ "rqst_sub_seq", length));
			String[] rcSeq = (JSPUtil.getParameter(request, prefix	+ "rc_seq", length));
			String[] cfmUpdDt = (JSPUtil.getParameter(request, prefix	+ "cfm_upd_dt", length));
			String[] soSeqNo = (JSPUtil.getParameter(request, prefix	+ "so_seq_no", length));
			String[] currCd = (JSPUtil.getParameter(request, prefix	+ "curr_cd", length));
			String[] trnsRevAmt = (JSPUtil.getParameter(request, prefix	+ "trns_rev_amt", length));
			String[] soCtyCd = (JSPUtil.getParameter(request, prefix	+ "so_cty_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] cmdtCd = (JSPUtil.getParameter(request, prefix	+ "cmdt_cd", length));
			String[] allInRtCd = (JSPUtil.getParameter(request, prefix	+ "all_in_rt_cd", length));
			String[] actCntCd = (JSPUtil.getParameter(request, prefix	+ "act_cnt_cd", length));
			String[] creOfcCd = (JSPUtil.getParameter(request, prefix	+ "cre_ofc_cd", length));
			String[] vatFlg = (JSPUtil.getParameter(request, prefix	+ "vat_flg", length));
			String[] spclInstrRmk = (JSPUtil.getParameter(request, prefix	+ "spcl_instr_rmk", length));
			String[] hlgTpCd = (JSPUtil.getParameter(request, prefix	+ "hlg_tp_cd", length));
			String[] t1DocFlg = (JSPUtil.getParameter(request, prefix	+ "t1_doc_flg", length));
			String[] cntrRtnDt = (JSPUtil.getParameter(request, prefix	+ "cntr_rtn_dt", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] troSeq = (JSPUtil.getParameter(request, prefix	+ "tro_seq", length));
			String[] actCustSeq = (JSPUtil.getParameter(request, prefix	+ "act_cust_seq", length));
			String[] cfmRevAmt = (JSPUtil.getParameter(request, prefix	+ "cfm_rev_amt", length));
			String[] corrNo = (JSPUtil.getParameter(request, prefix	+ "corr_no", length));
			String[] cntrCfmFlg = (JSPUtil.getParameter(request, prefix	+ "cntr_cfm_flg", length));
			String[] bkgTrspMzdCd = (JSPUtil.getParameter(request, prefix	+ "bkg_trsp_mzd_cd", length));
			String[] ioBndCd = (JSPUtil.getParameter(request, prefix	+ "io_bnd_cd", length));
			String[] cfmFlg = (JSPUtil.getParameter(request, prefix	+ "cfm_flg", length));
			String[] drpOffPkupYdCd = (JSPUtil.getParameter(request, prefix	+ "drp_off_pkup_yd_cd", length));
			String[] cfmOfcCd = (JSPUtil.getParameter(request, prefix	+ "cfm_ofc_cd", length));
			String[] cntrPkupDt = (JSPUtil.getParameter(request, prefix	+ "cntr_pkup_dt", length));
			String[] cntrNo = (JSPUtil.getParameter(request, prefix	+ "cntr_no", length));
			String[] cntrCfmUsrId = (JSPUtil.getParameter(request, prefix	+ "cntr_cfm_usr_id", length));
			String[] repCmdtCd = (JSPUtil.getParameter(request, prefix	+ "rep_cmdt_cd", length));
			String[] commOfcCd = (JSPUtil.getParameter(request, prefix	+ "comm_ofc_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgEurTroVO();
				if (cntrPkupYdCd[i] != null)
					model.setCntrPkupYdCd(cntrPkupYdCd[i]);
				if (eurTrnsTpCd[i] != null)
					model.setEurTrnsTpCd(eurTrnsTpCd[i]);
				if (cxlFlg[i] != null)
					model.setCxlFlg(cxlFlg[i]);
				if (dcgoSeq[i] != null)
					model.setDcgoSeq(dcgoSeq[i]);
				if (awkCgoSeq[i] != null)
					model.setAwkCgoSeq(awkCgoSeq[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (corrFlg[i] != null)
					model.setCorrFlg(corrFlg[i]);
				if (pctlNo[i] != null)
					model.setPctlNo(pctlNo[i]);
				if (cntrRtnYdCd[i] != null)
					model.setCntrRtnYdCd(cntrRtnYdCd[i]);
				if (cfmCurrCd[i] != null)
					model.setCfmCurrCd(cfmCurrCd[i]);
				if (cstmsClrNo[i] != null)
					model.setCstmsClrNo(cstmsClrNo[i]);
				if (cntrTpszCd[i] != null)
					model.setCntrTpszCd(cntrTpszCd[i]);
				if (cfmUsrId[i] != null)
					model.setCfmUsrId(cfmUsrId[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (cgoWgt[i] != null)
					model.setCgoWgt(cgoWgt[i]);
				if (repCmdtDesc[i] != null)
					model.setRepCmdtDesc(repCmdtDesc[i]);
				if (cfmDt[i] != null)
					model.setCfmDt(cfmDt[i]);
				if (cfmHlgTpCd[i] != null)
					model.setCfmHlgTpCd(cfmHlgTpCd[i]);
				if (cfmAllInRtCd[i] != null)
					model.setCfmAllInRtCd(cfmAllInRtCd[i]);
				if (troProcCd[i] != null)
					model.setTroProcCd(troProcCd[i]);
				if (cfmVatFlg[i] != null)
					model.setCfmVatFlg(cfmVatFlg[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (rqstSubSeq[i] != null)
					model.setRqstSubSeq(rqstSubSeq[i]);
				if (rcSeq[i] != null)
					model.setRcSeq(rcSeq[i]);
				if (cfmUpdDt[i] != null)
					model.setCfmUpdDt(cfmUpdDt[i]);
				if (soSeqNo[i] != null)
					model.setSoSeqNo(soSeqNo[i]);
				if (currCd[i] != null)
					model.setCurrCd(currCd[i]);
				if (trnsRevAmt[i] != null)
					model.setTrnsRevAmt(trnsRevAmt[i]);
				if (soCtyCd[i] != null)
					model.setSoCtyCd(soCtyCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (cmdtCd[i] != null)
					model.setCmdtCd(cmdtCd[i]);
				if (allInRtCd[i] != null)
					model.setAllInRtCd(allInRtCd[i]);
				if (actCntCd[i] != null)
					model.setActCntCd(actCntCd[i]);
				if (creOfcCd[i] != null)
					model.setCreOfcCd(creOfcCd[i]);
				if (vatFlg[i] != null)
					model.setVatFlg(vatFlg[i]);
				if (spclInstrRmk[i] != null)
					model.setSpclInstrRmk(spclInstrRmk[i]);
				if (hlgTpCd[i] != null)
					model.setHlgTpCd(hlgTpCd[i]);
				if (t1DocFlg[i] != null)
					model.setT1DocFlg(t1DocFlg[i]);
				if (cntrRtnDt[i] != null)
					model.setCntrRtnDt(cntrRtnDt[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (troSeq[i] != null)
					model.setTroSeq(troSeq[i]);
				if (actCustSeq[i] != null)
					model.setActCustSeq(actCustSeq[i]);
				if (cfmRevAmt[i] != null)
					model.setCfmRevAmt(cfmRevAmt[i]);
				if (corrNo[i] != null)
					model.setCorrNo(corrNo[i]);
				if (cntrCfmFlg[i] != null)
					model.setCntrCfmFlg(cntrCfmFlg[i]);
				if (bkgTrspMzdCd[i] != null)
					model.setBkgTrspMzdCd(bkgTrspMzdCd[i]);
				if (ioBndCd[i] != null)
					model.setIoBndCd(ioBndCd[i]);
				if (cfmFlg[i] != null)
					model.setCfmFlg(cfmFlg[i]);
				if (drpOffPkupYdCd[i] != null)
					model.setDrpOffPkupYdCd(drpOffPkupYdCd[i]);
				if (cfmOfcCd[i] != null)
					model.setCfmOfcCd(cfmOfcCd[i]);
				if (cntrPkupDt[i] != null)
					model.setCntrPkupDt(cntrPkupDt[i]);
				if (cntrNo[i] != null)
					model.setCntrNo(cntrNo[i]);
				if (cntrCfmUsrId[i] != null)
					model.setCntrCfmUsrId(cntrCfmUsrId[i]);
				if (repCmdtCd[i] != null)
					model.setRepCmdtCd(repCmdtCd[i]);
				if (commOfcCd[i] != null)
					model.setCommOfcCd(commOfcCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgEurTroVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgEurTroVO[]
	 */
	public BkgEurTroVO[] getBkgEurTroVOs(){
		BkgEurTroVO[] vos = (BkgEurTroVO[])models.toArray(new BkgEurTroVO[models.size()]);
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
		this.cntrPkupYdCd = this.cntrPkupYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eurTrnsTpCd = this.eurTrnsTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cxlFlg = this.cxlFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dcgoSeq = this.dcgoSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.awkCgoSeq = this.awkCgoSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.corrFlg = this.corrFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pctlNo = this.pctlNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrRtnYdCd = this.cntrRtnYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cfmCurrCd = this.cfmCurrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cstmsClrNo = this.cstmsClrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszCd = this.cntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cfmUsrId = this.cfmUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cgoWgt = this.cgoWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.repCmdtDesc = this.repCmdtDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cfmDt = this.cfmDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cfmHlgTpCd = this.cfmHlgTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cfmAllInRtCd = this.cfmAllInRtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.troProcCd = this.troProcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cfmVatFlg = this.cfmVatFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rqstSubSeq = this.rqstSubSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcSeq = this.rcSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cfmUpdDt = this.cfmUpdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.soSeqNo = this.soSeqNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.currCd = this.currCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trnsRevAmt = this.trnsRevAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.soCtyCd = this.soCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cmdtCd = this.cmdtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.allInRtCd = this.allInRtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actCntCd = this.actCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creOfcCd = this.creOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vatFlg = this.vatFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spclInstrRmk = this.spclInstrRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hlgTpCd = this.hlgTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.t1DocFlg = this.t1DocFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrRtnDt = this.cntrRtnDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.troSeq = this.troSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actCustSeq = this.actCustSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cfmRevAmt = this.cfmRevAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.corrNo = this.corrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrCfmFlg = this.cntrCfmFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgTrspMzdCd = this.bkgTrspMzdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ioBndCd = this.ioBndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cfmFlg = this.cfmFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.drpOffPkupYdCd = this.drpOffPkupYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cfmOfcCd = this.cfmOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrPkupDt = this.cntrPkupDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrNo = this.cntrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrCfmUsrId = this.cntrCfmUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.repCmdtCd = this.repCmdtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.commOfcCd = this.commOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
