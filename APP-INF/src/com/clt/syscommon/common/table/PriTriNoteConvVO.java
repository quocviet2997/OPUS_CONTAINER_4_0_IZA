/*=========================================================
 *Copyright(c) 2014 CyberLogitec
 *@FileName : PriTriNoteConvVO.java
 *@FileTitle : PriTriNoteConvVO
 *Open Issues :
 *Change history :
 *@LastModifyDate : 2015.11.25
 *@LastModifier : jaewonLee
 *@LastVersion : 1.0
 * 2015.11.25 jaewonLee 
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
 * - PDTO(Data Transfer	Object including Parameters)<br>
 * - 관련	Event에서	작성,	서버실행요청시	PDTO의 역할을 수행하는 Value Object<br>
 * 
 * @author jaewonLee
 * @since J2EE 1.6
 * @see	..
 */
public class PriTriNoteConvVO	extends	 AbstractValueObject {

	private	 static final long serialVersionUID = 1L;

	private	 Collection<PriTriNoteConvVO>  models =	new	ArrayList<PriTriNoteConvVO>();
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Page Number */
	private String pagerows = null;
	/*	Column Info	*/
	private String amdtSeq = null;
	/*	Column Info	*/
	private String payTermCd = null;
	/*	Column Info	*/
	private String noteConvSeq = null;
	/*	Column Info	*/
	private String rtApplTpCd = null;
	/*	Column Info	*/
	private String convRatUtCd = null;
	/*	Column Info	*/
	private String bkgDelTpCd = null;
	/*	Column Info	*/
	private String effDt = null;
	/*	Column Info	*/
	private String bkgSocFlg = null;
	/*	Column Info	*/
	private String bkgHngrBarTpCd = null;
	/*	Column Info	*/
	private String bkgMaxCgoWgt = null;
	/*	Column Info	*/
	private String bkgTsPortTpCd = null;
	/*	Column Info	*/
	private String bkgTsPortDefCd = null;
	/*	Column Info	*/
	private String bkgCmdtDefCd = null;
	/*	Column Info	*/
	private String bkgPodTpCd = null;
	/*	Column Info	*/
	private String trfPfxCd = null;
	/*	Column Info	*/
	private String bkgCmdtTpCd = null;
	/*	Column Info	*/
	private String updUsrId = null;
	/*	Column Info	*/
	private String rtOpCd = null;
	/*	Column Info	*/
	private String bkgMinCgoWgt = null;
	/*	Column Info	*/
	private String noteConvMapgId = null;
	/*	Column Info	*/
	private String bkgPolDefCd = null;
	/*	Column Info	*/
	private String chgRuleTpCd = null;
	/*	Column Info	*/
	private String convPrcCgoTpCd = null;
	/*	Column Info	*/
	private String creUsrId = null;
	/*	Column Info	*/
	private String trfNo = null;
	/*	Column Info	*/
	private String bkgRatUtCd = null;
	/*	Column Info	*/
	private String bkgDelDefCd = null;
	/*	Column Info	*/
	private String bkgUsaSvcModCd = null;
	/*	Column Info	*/
	private String bkgImdgClssCd = null;
	/*	Column Info	*/
	private String currCd = null;
	/*	Column Info	*/
	private String bkgPrcCgoTpCd = null;
	/*	Column Info	*/
	private String triPropNo = null;
	/*	Column Info	*/
	private String creDt = null;
	/*	Column Info	*/
	private String bkgRcvTermCd = null;
	/*	Column Info	*/
	private String bkgDirCallFlg = null;
	/*	Column Info	*/
	private String expDt = null;
	/*	Column Info	*/
	private String noteConvTpCd = null;
	/*	Column Info	*/
	private String bkgPolTpCd = null;
	/*	Column Info	*/
	private String ruleApplChgTpCd = null;
	/*	Column Info	*/
	private String updDt = null;
	/*	Column Info	*/
	private String noteConvRuleCd = null;
	/*	Column Info	*/
	private String bkgPorTpCd = null;
	/*	Column Info	*/
	private String bkgPodDefCd = null;
	/*	Column Info	*/
	private String noteConvChgCd = null;
	/*	Column Info	*/
	private String bkgPorDefCd = null;
	/*	Column Info	*/
	private String frtRtAmt = null;
	/*	Column Info	*/
	private String bkgDeTermCd = null;
	/*	Column Info	*/
	private String bkgEsvcTpCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private	 HashMap<String , String>	hashColumns	= new LinkedHashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private	 HashMap<String , String>	hashFields = new LinkedHashMap<String, String>();


	/**	Constructor	*/
	public PriTriNoteConvVO(){}

	public PriTriNoteConvVO(String ibflag,String pagerows,String amdtSeq,String payTermCd,String noteConvSeq,String rtApplTpCd,String convRatUtCd,String bkgDelTpCd,String effDt,String bkgSocFlg,String bkgHngrBarTpCd,String bkgMaxCgoWgt,String bkgTsPortTpCd,String bkgTsPortDefCd,String bkgCmdtDefCd,String bkgPodTpCd,String trfPfxCd,String bkgCmdtTpCd,String updUsrId,String rtOpCd,String bkgMinCgoWgt,String noteConvMapgId,String bkgPolDefCd,String chgRuleTpCd,String convPrcCgoTpCd,String creUsrId,String trfNo,String bkgRatUtCd,String bkgDelDefCd,String bkgUsaSvcModCd,String bkgImdgClssCd,String currCd,String bkgPrcCgoTpCd,String triPropNo,String creDt,String bkgRcvTermCd,String bkgDirCallFlg,String expDt,String noteConvTpCd,String bkgPolTpCd,String ruleApplChgTpCd,String updDt,String noteConvRuleCd,String bkgPorTpCd,String bkgPodDefCd,String noteConvChgCd,String bkgPorDefCd,String frtRtAmt,String bkgDeTermCd,String bkgEsvcTpCd)	{
		this.ibflag = ibflag;
		this.pagerows = pagerows;
		this.amdtSeq = amdtSeq;
		this.payTermCd = payTermCd;
		this.noteConvSeq = noteConvSeq;
		this.rtApplTpCd = rtApplTpCd;
		this.convRatUtCd = convRatUtCd;
		this.bkgDelTpCd = bkgDelTpCd;
		this.effDt = effDt;
		this.bkgSocFlg = bkgSocFlg;
		this.bkgHngrBarTpCd = bkgHngrBarTpCd;
		this.bkgMaxCgoWgt = bkgMaxCgoWgt;
		this.bkgTsPortTpCd = bkgTsPortTpCd;
		this.bkgTsPortDefCd = bkgTsPortDefCd;
		this.bkgCmdtDefCd = bkgCmdtDefCd;
		this.bkgPodTpCd = bkgPodTpCd;
		this.trfPfxCd = trfPfxCd;
		this.bkgCmdtTpCd = bkgCmdtTpCd;
		this.updUsrId = updUsrId;
		this.rtOpCd = rtOpCd;
		this.bkgMinCgoWgt = bkgMinCgoWgt;
		this.noteConvMapgId = noteConvMapgId;
		this.bkgPolDefCd = bkgPolDefCd;
		this.chgRuleTpCd = chgRuleTpCd;
		this.convPrcCgoTpCd = convPrcCgoTpCd;
		this.creUsrId = creUsrId;
		this.trfNo = trfNo;
		this.bkgRatUtCd = bkgRatUtCd;
		this.bkgDelDefCd = bkgDelDefCd;
		this.bkgUsaSvcModCd = bkgUsaSvcModCd;
		this.bkgImdgClssCd = bkgImdgClssCd;
		this.currCd = currCd;
		this.bkgPrcCgoTpCd = bkgPrcCgoTpCd;
		this.triPropNo = triPropNo;
		this.creDt = creDt;
		this.bkgRcvTermCd = bkgRcvTermCd;
		this.bkgDirCallFlg = bkgDirCallFlg;
		this.expDt = expDt;
		this.noteConvTpCd = noteConvTpCd;
		this.bkgPolTpCd = bkgPolTpCd;
		this.ruleApplChgTpCd = ruleApplChgTpCd;
		this.updDt = updDt;
		this.noteConvRuleCd = noteConvRuleCd;
		this.bkgPorTpCd = bkgPorTpCd;
		this.bkgPodDefCd = bkgPodDefCd;
		this.noteConvChgCd = noteConvChgCd;
		this.bkgPorDefCd = bkgPorDefCd;
		this.frtRtAmt = frtRtAmt;
		this.bkgDeTermCd = bkgDeTermCd;
		this.bkgEsvcTpCd = bkgEsvcTpCd;
	}


	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value">	로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("amdt_seq", getAmdtSeq());
		this.hashColumns.put("pay_term_cd", getPayTermCd());
		this.hashColumns.put("note_conv_seq", getNoteConvSeq());
		this.hashColumns.put("rt_appl_tp_cd", getRtApplTpCd());
		this.hashColumns.put("conv_rat_ut_cd", getConvRatUtCd());
		this.hashColumns.put("bkg_del_tp_cd", getBkgDelTpCd());
		this.hashColumns.put("eff_dt", getEffDt());
		this.hashColumns.put("bkg_soc_flg", getBkgSocFlg());
		this.hashColumns.put("bkg_hngr_bar_tp_cd", getBkgHngrBarTpCd());
		this.hashColumns.put("bkg_max_cgo_wgt", getBkgMaxCgoWgt());
		this.hashColumns.put("bkg_ts_port_tp_cd", getBkgTsPortTpCd());
		this.hashColumns.put("bkg_ts_port_def_cd", getBkgTsPortDefCd());
		this.hashColumns.put("bkg_cmdt_def_cd", getBkgCmdtDefCd());
		this.hashColumns.put("bkg_pod_tp_cd", getBkgPodTpCd());
		this.hashColumns.put("trf_pfx_cd", getTrfPfxCd());
		this.hashColumns.put("bkg_cmdt_tp_cd", getBkgCmdtTpCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("rt_op_cd", getRtOpCd());
		this.hashColumns.put("bkg_min_cgo_wgt", getBkgMinCgoWgt());
		this.hashColumns.put("note_conv_mapg_id", getNoteConvMapgId());
		this.hashColumns.put("bkg_pol_def_cd", getBkgPolDefCd());
		this.hashColumns.put("chg_rule_tp_cd", getChgRuleTpCd());
		this.hashColumns.put("conv_prc_cgo_tp_cd", getConvPrcCgoTpCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("trf_no", getTrfNo());
		this.hashColumns.put("bkg_rat_ut_cd", getBkgRatUtCd());
		this.hashColumns.put("bkg_del_def_cd", getBkgDelDefCd());
		this.hashColumns.put("bkg_usa_svc_mod_cd", getBkgUsaSvcModCd());
		this.hashColumns.put("bkg_imdg_clss_cd", getBkgImdgClssCd());
		this.hashColumns.put("curr_cd", getCurrCd());
		this.hashColumns.put("bkg_prc_cgo_tp_cd", getBkgPrcCgoTpCd());
		this.hashColumns.put("tri_prop_no", getTriPropNo());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("bkg_rcv_term_cd", getBkgRcvTermCd());
		this.hashColumns.put("bkg_dir_call_flg", getBkgDirCallFlg());
		this.hashColumns.put("exp_dt", getExpDt());
		this.hashColumns.put("note_conv_tp_cd", getNoteConvTpCd());
		this.hashColumns.put("bkg_pol_tp_cd", getBkgPolTpCd());
		this.hashColumns.put("rule_appl_chg_tp_cd", getRuleApplChgTpCd());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("note_conv_rule_cd", getNoteConvRuleCd());
		this.hashColumns.put("bkg_por_tp_cd", getBkgPorTpCd());
		this.hashColumns.put("bkg_pod_def_cd", getBkgPodDefCd());
		this.hashColumns.put("note_conv_chg_cd", getNoteConvChgCd());
		this.hashColumns.put("bkg_por_def_cd", getBkgPorDefCd());
		this.hashColumns.put("frt_rt_amt", getFrtRtAmt());
		this.hashColumns.put("bkg_de_term_cd", getBkgDeTermCd());
		this.hashColumns.put("bkg_esvc_tp_cd", getBkgEsvcTpCd());
		return this.hashColumns;
	}

	/**
	 * 컬럼명에	대응되는 멤버변수명을	저장하여 Hashtable<"column_name", "variable"> 로 반환
	 * @return
	 */
	public  HashMap<String, String>  getFieldNames(){
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("amdt_seq", "amdtSeq");
		this.hashFields.put("pay_term_cd", "payTermCd");
		this.hashFields.put("note_conv_seq", "noteConvSeq");
		this.hashFields.put("rt_appl_tp_cd", "rtApplTpCd");
		this.hashFields.put("conv_rat_ut_cd", "convRatUtCd");
		this.hashFields.put("bkg_del_tp_cd", "bkgDelTpCd");
		this.hashFields.put("eff_dt", "effDt");
		this.hashFields.put("bkg_soc_flg", "bkgSocFlg");
		this.hashFields.put("bkg_hngr_bar_tp_cd", "bkgHngrBarTpCd");
		this.hashFields.put("bkg_max_cgo_wgt", "bkgMaxCgoWgt");
		this.hashFields.put("bkg_ts_port_tp_cd", "bkgTsPortTpCd");
		this.hashFields.put("bkg_ts_port_def_cd", "bkgTsPortDefCd");
		this.hashFields.put("bkg_cmdt_def_cd", "bkgCmdtDefCd");
		this.hashFields.put("bkg_pod_tp_cd", "bkgPodTpCd");
		this.hashFields.put("trf_pfx_cd", "trfPfxCd");
		this.hashFields.put("bkg_cmdt_tp_cd", "bkgCmdtTpCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("rt_op_cd", "rtOpCd");
		this.hashFields.put("bkg_min_cgo_wgt", "bkgMinCgoWgt");
		this.hashFields.put("note_conv_mapg_id", "noteConvMapgId");
		this.hashFields.put("bkg_pol_def_cd", "bkgPolDefCd");
		this.hashFields.put("chg_rule_tp_cd", "chgRuleTpCd");
		this.hashFields.put("conv_prc_cgo_tp_cd", "convPrcCgoTpCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("trf_no", "trfNo");
		this.hashFields.put("bkg_rat_ut_cd", "bkgRatUtCd");
		this.hashFields.put("bkg_del_def_cd", "bkgDelDefCd");
		this.hashFields.put("bkg_usa_svc_mod_cd", "bkgUsaSvcModCd");
		this.hashFields.put("bkg_imdg_clss_cd", "bkgImdgClssCd");
		this.hashFields.put("curr_cd", "currCd");
		this.hashFields.put("bkg_prc_cgo_tp_cd", "bkgPrcCgoTpCd");
		this.hashFields.put("tri_prop_no", "triPropNo");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("bkg_rcv_term_cd", "bkgRcvTermCd");
		this.hashFields.put("bkg_dir_call_flg", "bkgDirCallFlg");
		this.hashFields.put("exp_dt", "expDt");
		this.hashFields.put("note_conv_tp_cd", "noteConvTpCd");
		this.hashFields.put("bkg_pol_tp_cd", "bkgPolTpCd");
		this.hashFields.put("rule_appl_chg_tp_cd", "ruleApplChgTpCd");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("note_conv_rule_cd", "noteConvRuleCd");
		this.hashFields.put("bkg_por_tp_cd", "bkgPorTpCd");
		this.hashFields.put("bkg_pod_def_cd", "bkgPodDefCd");
		this.hashFields.put("note_conv_chg_cd", "noteConvChgCd");
		this.hashFields.put("bkg_por_def_cd", "bkgPorDefCd");
		this.hashFields.put("frt_rt_amt", "frtRtAmt");
		this.hashFields.put("bkg_de_term_cd", "bkgDeTermCd");
		this.hashFields.put("bkg_esvc_tp_cd", "bkgEsvcTpCd");
		return this.hashFields;
	}

	//	Getters	and	Setters

	/**
	 * VO Data Value( C:Creation, U:Update, D:Delete )
	 * @return ibflag
	 */
	public	String getIbflag() {
		return	this.ibflag;
	}

	/**
	 * Page Number
	 * @return pagerows
	 */
	public	String getPagerows() {
		return	this.pagerows;
	}

	/**
	 * Column Info
	 * @return amdtSeq
	 */
	public	String getAmdtSeq() {
		return	this.amdtSeq;
	}

	/**
	 * Column Info
	 * @return payTermCd
	 */
	public	String getPayTermCd() {
		return	this.payTermCd;
	}

	/**
	 * Column Info
	 * @return noteConvSeq
	 */
	public	String getNoteConvSeq() {
		return	this.noteConvSeq;
	}

	/**
	 * Column Info
	 * @return rtApplTpCd
	 */
	public	String getRtApplTpCd() {
		return	this.rtApplTpCd;
	}

	/**
	 * Column Info
	 * @return convRatUtCd
	 */
	public	String getConvRatUtCd() {
		return	this.convRatUtCd;
	}

	/**
	 * Column Info
	 * @return bkgDelTpCd
	 */
	public	String getBkgDelTpCd() {
		return	this.bkgDelTpCd;
	}

	/**
	 * Column Info
	 * @return effDt
	 */
	public	String getEffDt() {
		return	this.effDt;
	}

	/**
	 * Column Info
	 * @return bkgSocFlg
	 */
	public	String getBkgSocFlg() {
		return	this.bkgSocFlg;
	}

	/**
	 * Column Info
	 * @return bkgHngrBarTpCd
	 */
	public	String getBkgHngrBarTpCd() {
		return	this.bkgHngrBarTpCd;
	}

	/**
	 * Column Info
	 * @return bkgMaxCgoWgt
	 */
	public	String getBkgMaxCgoWgt() {
		return	this.bkgMaxCgoWgt;
	}

	/**
	 * Column Info
	 * @return bkgTsPortTpCd
	 */
	public	String getBkgTsPortTpCd() {
		return	this.bkgTsPortTpCd;
	}

	/**
	 * Column Info
	 * @return bkgTsPortDefCd
	 */
	public	String getBkgTsPortDefCd() {
		return	this.bkgTsPortDefCd;
	}

	/**
	 * Column Info
	 * @return bkgCmdtDefCd
	 */
	public	String getBkgCmdtDefCd() {
		return	this.bkgCmdtDefCd;
	}

	/**
	 * Column Info
	 * @return bkgPodTpCd
	 */
	public	String getBkgPodTpCd() {
		return	this.bkgPodTpCd;
	}

	/**
	 * Column Info
	 * @return trfPfxCd
	 */
	public	String getTrfPfxCd() {
		return	this.trfPfxCd;
	}

	/**
	 * Column Info
	 * @return bkgCmdtTpCd
	 */
	public	String getBkgCmdtTpCd() {
		return	this.bkgCmdtTpCd;
	}

	/**
	 * Column Info
	 * @return updUsrId
	 */
	public	String getUpdUsrId() {
		return	this.updUsrId;
	}

	/**
	 * Column Info
	 * @return rtOpCd
	 */
	public	String getRtOpCd() {
		return	this.rtOpCd;
	}

	/**
	 * Column Info
	 * @return bkgMinCgoWgt
	 */
	public	String getBkgMinCgoWgt() {
		return	this.bkgMinCgoWgt;
	}

	/**
	 * Column Info
	 * @return noteConvMapgId
	 */
	public	String getNoteConvMapgId() {
		return	this.noteConvMapgId;
	}

	/**
	 * Column Info
	 * @return bkgPolDefCd
	 */
	public	String getBkgPolDefCd() {
		return	this.bkgPolDefCd;
	}

	/**
	 * Column Info
	 * @return chgRuleTpCd
	 */
	public	String getChgRuleTpCd() {
		return	this.chgRuleTpCd;
	}

	/**
	 * Column Info
	 * @return convPrcCgoTpCd
	 */
	public	String getConvPrcCgoTpCd() {
		return	this.convPrcCgoTpCd;
	}

	/**
	 * Column Info
	 * @return creUsrId
	 */
	public	String getCreUsrId() {
		return	this.creUsrId;
	}

	/**
	 * Column Info
	 * @return trfNo
	 */
	public	String getTrfNo() {
		return	this.trfNo;
	}

	/**
	 * Column Info
	 * @return bkgRatUtCd
	 */
	public	String getBkgRatUtCd() {
		return	this.bkgRatUtCd;
	}

	/**
	 * Column Info
	 * @return bkgDelDefCd
	 */
	public	String getBkgDelDefCd() {
		return	this.bkgDelDefCd;
	}

	/**
	 * Column Info
	 * @return bkgUsaSvcModCd
	 */
	public	String getBkgUsaSvcModCd() {
		return	this.bkgUsaSvcModCd;
	}

	/**
	 * Column Info
	 * @return bkgImdgClssCd
	 */
	public	String getBkgImdgClssCd() {
		return	this.bkgImdgClssCd;
	}

	/**
	 * Column Info
	 * @return currCd
	 */
	public	String getCurrCd() {
		return	this.currCd;
	}

	/**
	 * Column Info
	 * @return bkgPrcCgoTpCd
	 */
	public	String getBkgPrcCgoTpCd() {
		return	this.bkgPrcCgoTpCd;
	}

	/**
	 * Column Info
	 * @return triPropNo
	 */
	public	String getTriPropNo() {
		return	this.triPropNo;
	}

	/**
	 * Column Info
	 * @return creDt
	 */
	public	String getCreDt() {
		return	this.creDt;
	}

	/**
	 * Column Info
	 * @return bkgRcvTermCd
	 */
	public	String getBkgRcvTermCd() {
		return	this.bkgRcvTermCd;
	}

	/**
	 * Column Info
	 * @return bkgDirCallFlg
	 */
	public	String getBkgDirCallFlg() {
		return	this.bkgDirCallFlg;
	}

	/**
	 * Column Info
	 * @return expDt
	 */
	public	String getExpDt() {
		return	this.expDt;
	}

	/**
	 * Column Info
	 * @return noteConvTpCd
	 */
	public	String getNoteConvTpCd() {
		return	this.noteConvTpCd;
	}

	/**
	 * Column Info
	 * @return bkgPolTpCd
	 */
	public	String getBkgPolTpCd() {
		return	this.bkgPolTpCd;
	}

	/**
	 * Column Info
	 * @return ruleApplChgTpCd
	 */
	public	String getRuleApplChgTpCd() {
		return	this.ruleApplChgTpCd;
	}

	/**
	 * Column Info
	 * @return updDt
	 */
	public	String getUpdDt() {
		return	this.updDt;
	}

	/**
	 * Column Info
	 * @return noteConvRuleCd
	 */
	public	String getNoteConvRuleCd() {
		return	this.noteConvRuleCd;
	}

	/**
	 * Column Info
	 * @return bkgPorTpCd
	 */
	public	String getBkgPorTpCd() {
		return	this.bkgPorTpCd;
	}

	/**
	 * Column Info
	 * @return bkgPodDefCd
	 */
	public	String getBkgPodDefCd() {
		return	this.bkgPodDefCd;
	}

	/**
	 * Column Info
	 * @return noteConvChgCd
	 */
	public	String getNoteConvChgCd() {
		return	this.noteConvChgCd;
	}

	/**
	 * Column Info
	 * @return bkgPorDefCd
	 */
	public	String getBkgPorDefCd() {
		return	this.bkgPorDefCd;
	}

	/**
	 * Column Info
	 * @return frtRtAmt
	 */
	public	String getFrtRtAmt() {
		return	this.frtRtAmt;
	}

	/**
	 * Column Info
	 * @return bkgDeTermCd
	 */
	public	String getBkgDeTermCd() {
		return	this.bkgDeTermCd;
	}

	/**
	 * Column Info
	 * @return bkgEsvcTpCd
	 */
	public	String getBkgEsvcTpCd() {
		return	this.bkgEsvcTpCd;
	}

 	/**
	 * VO Data Value( C:Creation, U:Update, D:Delete )
	 * @param  ibflag
 	 */
	public void	setIbflag(String ibflag ) {
		this.ibflag =	ibflag;
	}
 	/**
	 * Page Number
	 * @param  pagerows
 	 */
	public void	setPagerows(String pagerows ) {
		this.pagerows =	pagerows;
	}
 	/**
	 * Column Info
	 * @param  amdtSeq
 	 */
	public void	setAmdtSeq(String amdtSeq ) {
		this.amdtSeq =	amdtSeq;
	}
 	/**
	 * Column Info
	 * @param  payTermCd
 	 */
	public void	setPayTermCd(String payTermCd ) {
		this.payTermCd =	payTermCd;
	}
 	/**
	 * Column Info
	 * @param  noteConvSeq
 	 */
	public void	setNoteConvSeq(String noteConvSeq ) {
		this.noteConvSeq =	noteConvSeq;
	}
 	/**
	 * Column Info
	 * @param  rtApplTpCd
 	 */
	public void	setRtApplTpCd(String rtApplTpCd ) {
		this.rtApplTpCd =	rtApplTpCd;
	}
 	/**
	 * Column Info
	 * @param  convRatUtCd
 	 */
	public void	setConvRatUtCd(String convRatUtCd ) {
		this.convRatUtCd =	convRatUtCd;
	}
 	/**
	 * Column Info
	 * @param  bkgDelTpCd
 	 */
	public void	setBkgDelTpCd(String bkgDelTpCd ) {
		this.bkgDelTpCd =	bkgDelTpCd;
	}
 	/**
	 * Column Info
	 * @param  effDt
 	 */
	public void	setEffDt(String effDt ) {
		this.effDt =	effDt;
	}
 	/**
	 * Column Info
	 * @param  bkgSocFlg
 	 */
	public void	setBkgSocFlg(String bkgSocFlg ) {
		this.bkgSocFlg =	bkgSocFlg;
	}
 	/**
	 * Column Info
	 * @param  bkgHngrBarTpCd
 	 */
	public void	setBkgHngrBarTpCd(String bkgHngrBarTpCd ) {
		this.bkgHngrBarTpCd =	bkgHngrBarTpCd;
	}
 	/**
	 * Column Info
	 * @param  bkgMaxCgoWgt
 	 */
	public void	setBkgMaxCgoWgt(String bkgMaxCgoWgt ) {
		this.bkgMaxCgoWgt =	bkgMaxCgoWgt;
	}
 	/**
	 * Column Info
	 * @param  bkgTsPortTpCd
 	 */
	public void	setBkgTsPortTpCd(String bkgTsPortTpCd ) {
		this.bkgTsPortTpCd =	bkgTsPortTpCd;
	}
 	/**
	 * Column Info
	 * @param  bkgTsPortDefCd
 	 */
	public void	setBkgTsPortDefCd(String bkgTsPortDefCd ) {
		this.bkgTsPortDefCd =	bkgTsPortDefCd;
	}
 	/**
	 * Column Info
	 * @param  bkgCmdtDefCd
 	 */
	public void	setBkgCmdtDefCd(String bkgCmdtDefCd ) {
		this.bkgCmdtDefCd =	bkgCmdtDefCd;
	}
 	/**
	 * Column Info
	 * @param  bkgPodTpCd
 	 */
	public void	setBkgPodTpCd(String bkgPodTpCd ) {
		this.bkgPodTpCd =	bkgPodTpCd;
	}
 	/**
	 * Column Info
	 * @param  trfPfxCd
 	 */
	public void	setTrfPfxCd(String trfPfxCd ) {
		this.trfPfxCd =	trfPfxCd;
	}
 	/**
	 * Column Info
	 * @param  bkgCmdtTpCd
 	 */
	public void	setBkgCmdtTpCd(String bkgCmdtTpCd ) {
		this.bkgCmdtTpCd =	bkgCmdtTpCd;
	}
 	/**
	 * Column Info
	 * @param  updUsrId
 	 */
	public void	setUpdUsrId(String updUsrId ) {
		this.updUsrId =	updUsrId;
	}
 	/**
	 * Column Info
	 * @param  rtOpCd
 	 */
	public void	setRtOpCd(String rtOpCd ) {
		this.rtOpCd =	rtOpCd;
	}
 	/**
	 * Column Info
	 * @param  bkgMinCgoWgt
 	 */
	public void	setBkgMinCgoWgt(String bkgMinCgoWgt ) {
		this.bkgMinCgoWgt =	bkgMinCgoWgt;
	}
 	/**
	 * Column Info
	 * @param  noteConvMapgId
 	 */
	public void	setNoteConvMapgId(String noteConvMapgId ) {
		this.noteConvMapgId =	noteConvMapgId;
	}
 	/**
	 * Column Info
	 * @param  bkgPolDefCd
 	 */
	public void	setBkgPolDefCd(String bkgPolDefCd ) {
		this.bkgPolDefCd =	bkgPolDefCd;
	}
 	/**
	 * Column Info
	 * @param  chgRuleTpCd
 	 */
	public void	setChgRuleTpCd(String chgRuleTpCd ) {
		this.chgRuleTpCd =	chgRuleTpCd;
	}
 	/**
	 * Column Info
	 * @param  convPrcCgoTpCd
 	 */
	public void	setConvPrcCgoTpCd(String convPrcCgoTpCd ) {
		this.convPrcCgoTpCd =	convPrcCgoTpCd;
	}
 	/**
	 * Column Info
	 * @param  creUsrId
 	 */
	public void	setCreUsrId(String creUsrId ) {
		this.creUsrId =	creUsrId;
	}
 	/**
	 * Column Info
	 * @param  trfNo
 	 */
	public void	setTrfNo(String trfNo ) {
		this.trfNo =	trfNo;
	}
 	/**
	 * Column Info
	 * @param  bkgRatUtCd
 	 */
	public void	setBkgRatUtCd(String bkgRatUtCd ) {
		this.bkgRatUtCd =	bkgRatUtCd;
	}
 	/**
	 * Column Info
	 * @param  bkgDelDefCd
 	 */
	public void	setBkgDelDefCd(String bkgDelDefCd ) {
		this.bkgDelDefCd =	bkgDelDefCd;
	}
 	/**
	 * Column Info
	 * @param  bkgUsaSvcModCd
 	 */
	public void	setBkgUsaSvcModCd(String bkgUsaSvcModCd ) {
		this.bkgUsaSvcModCd =	bkgUsaSvcModCd;
	}
 	/**
	 * Column Info
	 * @param  bkgImdgClssCd
 	 */
	public void	setBkgImdgClssCd(String bkgImdgClssCd ) {
		this.bkgImdgClssCd =	bkgImdgClssCd;
	}
 	/**
	 * Column Info
	 * @param  currCd
 	 */
	public void	setCurrCd(String currCd ) {
		this.currCd =	currCd;
	}
 	/**
	 * Column Info
	 * @param  bkgPrcCgoTpCd
 	 */
	public void	setBkgPrcCgoTpCd(String bkgPrcCgoTpCd ) {
		this.bkgPrcCgoTpCd =	bkgPrcCgoTpCd;
	}
 	/**
	 * Column Info
	 * @param  triPropNo
 	 */
	public void	setTriPropNo(String triPropNo ) {
		this.triPropNo =	triPropNo;
	}
 	/**
	 * Column Info
	 * @param  creDt
 	 */
	public void	setCreDt(String creDt ) {
		this.creDt =	creDt;
	}
 	/**
	 * Column Info
	 * @param  bkgRcvTermCd
 	 */
	public void	setBkgRcvTermCd(String bkgRcvTermCd ) {
		this.bkgRcvTermCd =	bkgRcvTermCd;
	}
 	/**
	 * Column Info
	 * @param  bkgDirCallFlg
 	 */
	public void	setBkgDirCallFlg(String bkgDirCallFlg ) {
		this.bkgDirCallFlg =	bkgDirCallFlg;
	}
 	/**
	 * Column Info
	 * @param  expDt
 	 */
	public void	setExpDt(String expDt ) {
		this.expDt =	expDt;
	}
 	/**
	 * Column Info
	 * @param  noteConvTpCd
 	 */
	public void	setNoteConvTpCd(String noteConvTpCd ) {
		this.noteConvTpCd =	noteConvTpCd;
	}
 	/**
	 * Column Info
	 * @param  bkgPolTpCd
 	 */
	public void	setBkgPolTpCd(String bkgPolTpCd ) {
		this.bkgPolTpCd =	bkgPolTpCd;
	}
 	/**
	 * Column Info
	 * @param  ruleApplChgTpCd
 	 */
	public void	setRuleApplChgTpCd(String ruleApplChgTpCd ) {
		this.ruleApplChgTpCd =	ruleApplChgTpCd;
	}
 	/**
	 * Column Info
	 * @param  updDt
 	 */
	public void	setUpdDt(String updDt ) {
		this.updDt =	updDt;
	}
 	/**
	 * Column Info
	 * @param  noteConvRuleCd
 	 */
	public void	setNoteConvRuleCd(String noteConvRuleCd ) {
		this.noteConvRuleCd =	noteConvRuleCd;
	}
 	/**
	 * Column Info
	 * @param  bkgPorTpCd
 	 */
	public void	setBkgPorTpCd(String bkgPorTpCd ) {
		this.bkgPorTpCd =	bkgPorTpCd;
	}
 	/**
	 * Column Info
	 * @param  bkgPodDefCd
 	 */
	public void	setBkgPodDefCd(String bkgPodDefCd ) {
		this.bkgPodDefCd =	bkgPodDefCd;
	}
 	/**
	 * Column Info
	 * @param  noteConvChgCd
 	 */
	public void	setNoteConvChgCd(String noteConvChgCd ) {
		this.noteConvChgCd =	noteConvChgCd;
	}
 	/**
	 * Column Info
	 * @param  bkgPorDefCd
 	 */
	public void	setBkgPorDefCd(String bkgPorDefCd ) {
		this.bkgPorDefCd =	bkgPorDefCd;
	}
 	/**
	 * Column Info
	 * @param  frtRtAmt
 	 */
	public void	setFrtRtAmt(String frtRtAmt ) {
		this.frtRtAmt =	frtRtAmt;
	}
 	/**
	 * Column Info
	 * @param  bkgDeTermCd
 	 */
	public void	setBkgDeTermCd(String bkgDeTermCd ) {
		this.bkgDeTermCd =	bkgDeTermCd;
	}
 	/**
	 * Column Info
	 * @param  bkgEsvcTpCd
 	 */
	public void	setBkgEsvcTpCd(String bkgEsvcTpCd ) {
		this.bkgEsvcTpCd =	bkgEsvcTpCd;
	}

	/**
	 * Request 의 데이터를 추출하여 VO 의	멤버변수에 설정.
	 * @param request
	 */
	public void	fromRequest(HttpServletRequest request)	{
		fromRequest(request,"");
	}

	/**
	 * Request 의 데이터를 추출하여 VO 의	멤버변수에 설정.
	 * @param request
	 */
	public void	fromRequest(HttpServletRequest request,	String prefix) {
		setIbflag(JSPUtil.getParameter(request,	prefix + "ibflag", ""));
		setPagerows(JSPUtil.getParameter(request,	prefix + "pagerows", ""));
		setAmdtSeq(JSPUtil.getParameter(request,	prefix + "amdt_seq", ""));
		setPayTermCd(JSPUtil.getParameter(request,	prefix + "pay_term_cd", ""));
		setNoteConvSeq(JSPUtil.getParameter(request,	prefix + "note_conv_seq", ""));
		setRtApplTpCd(JSPUtil.getParameter(request,	prefix + "rt_appl_tp_cd", ""));
		setConvRatUtCd(JSPUtil.getParameter(request,	prefix + "conv_rat_ut_cd", ""));
		setBkgDelTpCd(JSPUtil.getParameter(request,	prefix + "bkg_del_tp_cd", ""));
		setEffDt(JSPUtil.getParameter(request,	prefix + "eff_dt", ""));
		setBkgSocFlg(JSPUtil.getParameter(request,	prefix + "bkg_soc_flg", ""));
		setBkgHngrBarTpCd(JSPUtil.getParameter(request,	prefix + "bkg_hngr_bar_tp_cd", ""));
		setBkgMaxCgoWgt(JSPUtil.getParameter(request,	prefix + "bkg_max_cgo_wgt", ""));
		setBkgTsPortTpCd(JSPUtil.getParameter(request,	prefix + "bkg_ts_port_tp_cd", ""));
		setBkgTsPortDefCd(JSPUtil.getParameter(request,	prefix + "bkg_ts_port_def_cd", ""));
		setBkgCmdtDefCd(JSPUtil.getParameter(request,	prefix + "bkg_cmdt_def_cd", ""));
		setBkgPodTpCd(JSPUtil.getParameter(request,	prefix + "bkg_pod_tp_cd", ""));
		setTrfPfxCd(JSPUtil.getParameter(request,	prefix + "trf_pfx_cd", ""));
		setBkgCmdtTpCd(JSPUtil.getParameter(request,	prefix + "bkg_cmdt_tp_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request,	prefix + "upd_usr_id", ""));
		setRtOpCd(JSPUtil.getParameter(request,	prefix + "rt_op_cd", ""));
		setBkgMinCgoWgt(JSPUtil.getParameter(request,	prefix + "bkg_min_cgo_wgt", ""));
		setNoteConvMapgId(JSPUtil.getParameter(request,	prefix + "note_conv_mapg_id", ""));
		setBkgPolDefCd(JSPUtil.getParameter(request,	prefix + "bkg_pol_def_cd", ""));
		setChgRuleTpCd(JSPUtil.getParameter(request,	prefix + "chg_rule_tp_cd", ""));
		setConvPrcCgoTpCd(JSPUtil.getParameter(request,	prefix + "conv_prc_cgo_tp_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request,	prefix + "cre_usr_id", ""));
		setTrfNo(JSPUtil.getParameter(request,	prefix + "trf_no", ""));
		setBkgRatUtCd(JSPUtil.getParameter(request,	prefix + "bkg_rat_ut_cd", ""));
		setBkgDelDefCd(JSPUtil.getParameter(request,	prefix + "bkg_del_def_cd", ""));
		setBkgUsaSvcModCd(JSPUtil.getParameter(request,	prefix + "bkg_usa_svc_mod_cd", ""));
		setBkgImdgClssCd(JSPUtil.getParameter(request,	prefix + "bkg_imdg_clss_cd", ""));
		setCurrCd(JSPUtil.getParameter(request,	prefix + "curr_cd", ""));
		setBkgPrcCgoTpCd(JSPUtil.getParameter(request,	prefix + "bkg_prc_cgo_tp_cd", ""));
		setTriPropNo(JSPUtil.getParameter(request,	prefix + "tri_prop_no", ""));
		setCreDt(JSPUtil.getParameter(request,	prefix + "cre_dt", ""));
		setBkgRcvTermCd(JSPUtil.getParameter(request,	prefix + "bkg_rcv_term_cd", ""));
		setBkgDirCallFlg(JSPUtil.getParameter(request,	prefix + "bkg_dir_call_flg", ""));
		setExpDt(JSPUtil.getParameter(request,	prefix + "exp_dt", ""));
		setNoteConvTpCd(JSPUtil.getParameter(request,	prefix + "note_conv_tp_cd", ""));
		setBkgPolTpCd(JSPUtil.getParameter(request,	prefix + "bkg_pol_tp_cd", ""));
		setRuleApplChgTpCd(JSPUtil.getParameter(request,	prefix + "rule_appl_chg_tp_cd", ""));
		setUpdDt(JSPUtil.getParameter(request,	prefix + "upd_dt", ""));
		setNoteConvRuleCd(JSPUtil.getParameter(request,	prefix + "note_conv_rule_cd", ""));
		setBkgPorTpCd(JSPUtil.getParameter(request,	prefix + "bkg_por_tp_cd", ""));
		setBkgPodDefCd(JSPUtil.getParameter(request,	prefix + "bkg_pod_def_cd", ""));
		setNoteConvChgCd(JSPUtil.getParameter(request,	prefix + "note_conv_chg_cd", ""));
		setBkgPorDefCd(JSPUtil.getParameter(request,	prefix + "bkg_por_def_cd", ""));
		setFrtRtAmt(JSPUtil.getParameter(request,	prefix + "frt_rt_amt", ""));
		setBkgDeTermCd(JSPUtil.getParameter(request,	prefix + "bkg_de_term_cd", ""));
		setBkgEsvcTpCd(JSPUtil.getParameter(request,	prefix + "bkg_esvc_tp_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return PriTriNoteConvVO[]
	 */
	public PriTriNoteConvVO[]	fromRequestGrid(HttpServletRequest request)	{
		return fromRequestGrid(request,	"");
	}

	/**
	 * Request 넘어온 여러 건	DATA를 VO Class 에 담는다.
	 * @param request
	 * @param prefix
	 * @return PriTriNoteConvVO[]
	 */
	public PriTriNoteConvVO[]	fromRequestGrid(HttpServletRequest request,	String prefix) {
		PriTriNoteConvVO model = null;

		String[] tmp = request.getParameterValues(prefix + "ibflag");
		if (tmp	== null)
			return null;

		int	length = request.getParameterValues(prefix + "ibflag").length;

		try	{
			String[] ibflag =	(JSPUtil.getParameter(request, prefix +	"ibflag",	length));
			String[] pagerows =	(JSPUtil.getParameter(request, prefix +	"pagerows",	length));
			String[] amdtSeq =	(JSPUtil.getParameter(request, prefix +	"amdt_seq",	length));
			String[] payTermCd =	(JSPUtil.getParameter(request, prefix +	"pay_term_cd",	length));
			String[] noteConvSeq =	(JSPUtil.getParameter(request, prefix +	"note_conv_seq",	length));
			String[] rtApplTpCd =	(JSPUtil.getParameter(request, prefix +	"rt_appl_tp_cd",	length));
			String[] convRatUtCd =	(JSPUtil.getParameter(request, prefix +	"conv_rat_ut_cd",	length));
			String[] bkgDelTpCd =	(JSPUtil.getParameter(request, prefix +	"bkg_del_tp_cd",	length));
			String[] effDt =	(JSPUtil.getParameter(request, prefix +	"eff_dt",	length));
			String[] bkgSocFlg =	(JSPUtil.getParameter(request, prefix +	"bkg_soc_flg",	length));
			String[] bkgHngrBarTpCd =	(JSPUtil.getParameter(request, prefix +	"bkg_hngr_bar_tp_cd",	length));
			String[] bkgMaxCgoWgt =	(JSPUtil.getParameter(request, prefix +	"bkg_max_cgo_wgt",	length));
			String[] bkgTsPortTpCd =	(JSPUtil.getParameter(request, prefix +	"bkg_ts_port_tp_cd",	length));
			String[] bkgTsPortDefCd =	(JSPUtil.getParameter(request, prefix +	"bkg_ts_port_def_cd",	length));
			String[] bkgCmdtDefCd =	(JSPUtil.getParameter(request, prefix +	"bkg_cmdt_def_cd",	length));
			String[] bkgPodTpCd =	(JSPUtil.getParameter(request, prefix +	"bkg_pod_tp_cd",	length));
			String[] trfPfxCd =	(JSPUtil.getParameter(request, prefix +	"trf_pfx_cd",	length));
			String[] bkgCmdtTpCd =	(JSPUtil.getParameter(request, prefix +	"bkg_cmdt_tp_cd",	length));
			String[] updUsrId =	(JSPUtil.getParameter(request, prefix +	"upd_usr_id",	length));
			String[] rtOpCd =	(JSPUtil.getParameter(request, prefix +	"rt_op_cd",	length));
			String[] bkgMinCgoWgt =	(JSPUtil.getParameter(request, prefix +	"bkg_min_cgo_wgt",	length));
			String[] noteConvMapgId =	(JSPUtil.getParameter(request, prefix +	"note_conv_mapg_id",	length));
			String[] bkgPolDefCd =	(JSPUtil.getParameter(request, prefix +	"bkg_pol_def_cd",	length));
			String[] chgRuleTpCd =	(JSPUtil.getParameter(request, prefix +	"chg_rule_tp_cd",	length));
			String[] convPrcCgoTpCd =	(JSPUtil.getParameter(request, prefix +	"conv_prc_cgo_tp_cd",	length));
			String[] creUsrId =	(JSPUtil.getParameter(request, prefix +	"cre_usr_id",	length));
			String[] trfNo =	(JSPUtil.getParameter(request, prefix +	"trf_no",	length));
			String[] bkgRatUtCd =	(JSPUtil.getParameter(request, prefix +	"bkg_rat_ut_cd",	length));
			String[] bkgDelDefCd =	(JSPUtil.getParameter(request, prefix +	"bkg_del_def_cd",	length));
			String[] bkgUsaSvcModCd =	(JSPUtil.getParameter(request, prefix +	"bkg_usa_svc_mod_cd",	length));
			String[] bkgImdgClssCd =	(JSPUtil.getParameter(request, prefix +	"bkg_imdg_clss_cd",	length));
			String[] currCd =	(JSPUtil.getParameter(request, prefix +	"curr_cd",	length));
			String[] bkgPrcCgoTpCd =	(JSPUtil.getParameter(request, prefix +	"bkg_prc_cgo_tp_cd",	length));
			String[] triPropNo =	(JSPUtil.getParameter(request, prefix +	"tri_prop_no",	length));
			String[] creDt =	(JSPUtil.getParameter(request, prefix +	"cre_dt",	length));
			String[] bkgRcvTermCd =	(JSPUtil.getParameter(request, prefix +	"bkg_rcv_term_cd",	length));
			String[] bkgDirCallFlg =	(JSPUtil.getParameter(request, prefix +	"bkg_dir_call_flg",	length));
			String[] expDt =	(JSPUtil.getParameter(request, prefix +	"exp_dt",	length));
			String[] noteConvTpCd =	(JSPUtil.getParameter(request, prefix +	"note_conv_tp_cd",	length));
			String[] bkgPolTpCd =	(JSPUtil.getParameter(request, prefix +	"bkg_pol_tp_cd",	length));
			String[] ruleApplChgTpCd =	(JSPUtil.getParameter(request, prefix +	"rule_appl_chg_tp_cd",	length));
			String[] updDt =	(JSPUtil.getParameter(request, prefix +	"upd_dt",	length));
			String[] noteConvRuleCd =	(JSPUtil.getParameter(request, prefix +	"note_conv_rule_cd",	length));
			String[] bkgPorTpCd =	(JSPUtil.getParameter(request, prefix +	"bkg_por_tp_cd",	length));
			String[] bkgPodDefCd =	(JSPUtil.getParameter(request, prefix +	"bkg_pod_def_cd",	length));
			String[] noteConvChgCd =	(JSPUtil.getParameter(request, prefix +	"note_conv_chg_cd",	length));
			String[] bkgPorDefCd =	(JSPUtil.getParameter(request, prefix +	"bkg_por_def_cd",	length));
			String[] frtRtAmt =	(JSPUtil.getParameter(request, prefix +	"frt_rt_amt",	length));
			String[] bkgDeTermCd =	(JSPUtil.getParameter(request, prefix +	"bkg_de_term_cd",	length));
			String[] bkgEsvcTpCd =	(JSPUtil.getParameter(request, prefix +	"bkg_esvc_tp_cd",	length));
			for	(int i = 0;	i <	length;	i++) {
				model =	new	PriTriNoteConvVO();
				if ( ibflag[i] !=	null)
					model.setIbflag( ibflag[i]);
				if ( pagerows[i] !=	null)
					model.setPagerows( pagerows[i]);
				if ( amdtSeq[i] !=	null)
					model.setAmdtSeq( amdtSeq[i]);
				if ( payTermCd[i] !=	null)
					model.setPayTermCd( payTermCd[i]);
				if ( noteConvSeq[i] !=	null)
					model.setNoteConvSeq( noteConvSeq[i]);
				if ( rtApplTpCd[i] !=	null)
					model.setRtApplTpCd( rtApplTpCd[i]);
				if ( convRatUtCd[i] !=	null)
					model.setConvRatUtCd( convRatUtCd[i]);
				if ( bkgDelTpCd[i] !=	null)
					model.setBkgDelTpCd( bkgDelTpCd[i]);
				if ( effDt[i] !=	null)
					model.setEffDt( effDt[i]);
				if ( bkgSocFlg[i] !=	null)
					model.setBkgSocFlg( bkgSocFlg[i]);
				if ( bkgHngrBarTpCd[i] !=	null)
					model.setBkgHngrBarTpCd( bkgHngrBarTpCd[i]);
				if ( bkgMaxCgoWgt[i] !=	null)
					model.setBkgMaxCgoWgt( bkgMaxCgoWgt[i]);
				if ( bkgTsPortTpCd[i] !=	null)
					model.setBkgTsPortTpCd( bkgTsPortTpCd[i]);
				if ( bkgTsPortDefCd[i] !=	null)
					model.setBkgTsPortDefCd( bkgTsPortDefCd[i]);
				if ( bkgCmdtDefCd[i] !=	null)
					model.setBkgCmdtDefCd( bkgCmdtDefCd[i]);
				if ( bkgPodTpCd[i] !=	null)
					model.setBkgPodTpCd( bkgPodTpCd[i]);
				if ( trfPfxCd[i] !=	null)
					model.setTrfPfxCd( trfPfxCd[i]);
				if ( bkgCmdtTpCd[i] !=	null)
					model.setBkgCmdtTpCd( bkgCmdtTpCd[i]);
				if ( updUsrId[i] !=	null)
					model.setUpdUsrId( updUsrId[i]);
				if ( rtOpCd[i] !=	null)
					model.setRtOpCd( rtOpCd[i]);
				if ( bkgMinCgoWgt[i] !=	null)
					model.setBkgMinCgoWgt( bkgMinCgoWgt[i]);
				if ( noteConvMapgId[i] !=	null)
					model.setNoteConvMapgId( noteConvMapgId[i]);
				if ( bkgPolDefCd[i] !=	null)
					model.setBkgPolDefCd( bkgPolDefCd[i]);
				if ( chgRuleTpCd[i] !=	null)
					model.setChgRuleTpCd( chgRuleTpCd[i]);
				if ( convPrcCgoTpCd[i] !=	null)
					model.setConvPrcCgoTpCd( convPrcCgoTpCd[i]);
				if ( creUsrId[i] !=	null)
					model.setCreUsrId( creUsrId[i]);
				if ( trfNo[i] !=	null)
					model.setTrfNo( trfNo[i]);
				if ( bkgRatUtCd[i] !=	null)
					model.setBkgRatUtCd( bkgRatUtCd[i]);
				if ( bkgDelDefCd[i] !=	null)
					model.setBkgDelDefCd( bkgDelDefCd[i]);
				if ( bkgUsaSvcModCd[i] !=	null)
					model.setBkgUsaSvcModCd( bkgUsaSvcModCd[i]);
				if ( bkgImdgClssCd[i] !=	null)
					model.setBkgImdgClssCd( bkgImdgClssCd[i]);
				if ( currCd[i] !=	null)
					model.setCurrCd( currCd[i]);
				if ( bkgPrcCgoTpCd[i] !=	null)
					model.setBkgPrcCgoTpCd( bkgPrcCgoTpCd[i]);
				if ( triPropNo[i] !=	null)
					model.setTriPropNo( triPropNo[i]);
				if ( creDt[i] !=	null)
					model.setCreDt( creDt[i]);
				if ( bkgRcvTermCd[i] !=	null)
					model.setBkgRcvTermCd( bkgRcvTermCd[i]);
				if ( bkgDirCallFlg[i] !=	null)
					model.setBkgDirCallFlg( bkgDirCallFlg[i]);
				if ( expDt[i] !=	null)
					model.setExpDt( expDt[i]);
				if ( noteConvTpCd[i] !=	null)
					model.setNoteConvTpCd( noteConvTpCd[i]);
				if ( bkgPolTpCd[i] !=	null)
					model.setBkgPolTpCd( bkgPolTpCd[i]);
				if ( ruleApplChgTpCd[i] !=	null)
					model.setRuleApplChgTpCd( ruleApplChgTpCd[i]);
				if ( updDt[i] !=	null)
					model.setUpdDt( updDt[i]);
				if ( noteConvRuleCd[i] !=	null)
					model.setNoteConvRuleCd( noteConvRuleCd[i]);
				if ( bkgPorTpCd[i] !=	null)
					model.setBkgPorTpCd( bkgPorTpCd[i]);
				if ( bkgPodDefCd[i] !=	null)
					model.setBkgPodDefCd( bkgPodDefCd[i]);
				if ( noteConvChgCd[i] !=	null)
					model.setNoteConvChgCd( noteConvChgCd[i]);
				if ( bkgPorDefCd[i] !=	null)
					model.setBkgPorDefCd( bkgPorDefCd[i]);
				if ( frtRtAmt[i] !=	null)
					model.setFrtRtAmt( frtRtAmt[i]);
				if ( bkgDeTermCd[i] !=	null)
					model.setBkgDeTermCd( bkgDeTermCd[i]);
				if ( bkgEsvcTpCd[i] !=	null)
					model.setBkgEsvcTpCd( bkgEsvcTpCd[i]);
				models.add(model);
			}

		} catch	(Exception e) {
			return null;
		}
		return getPriTriNoteConvVOs();
	}

	/**
	 *  VO 배열을 반환
	 * @return PriTriNoteConvVO[]
	 */
	public PriTriNoteConvVO[]	 getPriTriNoteConvVOs(){
		PriTriNoteConvVO[] vos = (PriTriNoteConvVO[])models.toArray(new	PriTriNoteConvVO[models.size()]);
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
	public void	unDataFormat(){
		this.ibflag =	this.ibflag.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows =	this.pagerows.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.amdtSeq =	this.amdtSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.payTermCd =	this.payTermCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.noteConvSeq =	this.noteConvSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rtApplTpCd =	this.rtApplTpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.convRatUtCd =	this.convRatUtCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgDelTpCd =	this.bkgDelTpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.effDt =	this.effDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgSocFlg =	this.bkgSocFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgHngrBarTpCd =	this.bkgHngrBarTpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgMaxCgoWgt =	this.bkgMaxCgoWgt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgTsPortTpCd =	this.bkgTsPortTpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgTsPortDefCd =	this.bkgTsPortDefCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgCmdtDefCd =	this.bkgCmdtDefCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgPodTpCd =	this.bkgPodTpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trfPfxCd =	this.trfPfxCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgCmdtTpCd =	this.bkgCmdtTpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId =	this.updUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rtOpCd =	this.rtOpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgMinCgoWgt =	this.bkgMinCgoWgt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.noteConvMapgId =	this.noteConvMapgId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgPolDefCd =	this.bkgPolDefCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chgRuleTpCd =	this.chgRuleTpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.convPrcCgoTpCd =	this.convPrcCgoTpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId =	this.creUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trfNo =	this.trfNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgRatUtCd =	this.bkgRatUtCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgDelDefCd =	this.bkgDelDefCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgUsaSvcModCd =	this.bkgUsaSvcModCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgImdgClssCd =	this.bkgImdgClssCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.currCd =	this.currCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgPrcCgoTpCd =	this.bkgPrcCgoTpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.triPropNo =	this.triPropNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt =	this.creDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgRcvTermCd =	this.bkgRcvTermCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgDirCallFlg =	this.bkgDirCallFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.expDt =	this.expDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.noteConvTpCd =	this.noteConvTpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgPolTpCd =	this.bkgPolTpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ruleApplChgTpCd =	this.ruleApplChgTpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt =	this.updDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.noteConvRuleCd =	this.noteConvRuleCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgPorTpCd =	this.bkgPorTpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgPodDefCd =	this.bkgPodDefCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.noteConvChgCd =	this.noteConvChgCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgPorDefCd =	this.bkgPorDefCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.frtRtAmt =	this.frtRtAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgDeTermCd =	this.bkgDeTermCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgEsvcTpCd =	this.bkgEsvcTpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}