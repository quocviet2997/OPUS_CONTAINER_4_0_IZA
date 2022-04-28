/*=========================================================
 *Copyright(c) 2014 CyberLogitec
 *@FileName : PriSpScpTrspAddChgVO.java
 *@FileTitle : PriSpScpTrspAddChgVO
 *Open Issues :
 *Change history :
 *@LastModifyDate : 2015.11.16
 *@LastModifier : jaewonLee
 *@LastVersion : 1.0
 * 2015.11.16 jaewonLee 
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
public class PriSpScpTrspAddChgVO	extends	 AbstractValueObject {

	private	 static final long serialVersionUID = 1L;

	private	 Collection<PriSpScpTrspAddChgVO>  models =	new	ArrayList<PriSpScpTrspAddChgVO>();
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Page Number */
	private String pagerows = null;
	/*	Column Info	*/
	private String addChgSeq = null;
	/*	Column Info	*/
	private String currCd = null;
	/*	Column Info	*/
	private String prcCgoTpCd = null;
	/*	Column Info	*/
	private String griApplAmt = null;
	/*	Column Info	*/
	private String amdtSeq = null;
	/*	Column Info	*/
	private String svcScpCd = null;
	/*	Column Info	*/
	private String creDt = null;
	/*	Column Info	*/
	private String routPntLocDefCd = null;
	/*	Column Info	*/
	private String coffrFrtRtAmt = null;
	/*	Column Info	*/
	private String noteDpSeq = null;
	/*	Column Info	*/
	private String fnlFrtRtAmt = null;
	/*	Column Info	*/
	private String prcProgStsCd = null;
	/*	Column Info	*/
	private String bsePortTpCd = null;
	/*	Column Info	*/
	private String addChgNoteCtnt = null;
	/*	Column Info	*/
	private String rcvDeTermCd = null;
	/*	Column Info	*/
	private String updUsrId = null;
	/*	Column Info	*/
	private String locGrdCntCd = null;
	/*	Column Info	*/
	private String routPntLocTpCd = null;
	/*	Column Info	*/
	private String prcCmdtDefCd = null;
	/*	Column Info	*/
	private String updDt = null;
	/*	Column Info	*/
	private String dirCallFlg = null;
	/*	Column Info	*/
	private String addChgTpCd = null;
	/*	Column Info	*/
	private String viaPortTpCd = null;
	/*	Column Info	*/
	private String acptDt = null;
	/*	Column Info	*/
	private String acptOfcCd = null;
	/*	Column Info	*/
	private String griApplTpCd = null;
	/*	Column Info	*/
	private String acptUsrId = null;
	/*	Column Info	*/
	private String srcInfoCd = null;
	/*	Column Info	*/
	private String orgDestTpCd = null;
	/*	Column Info	*/
	private String ratUtCd = null;
	/*	Column Info	*/
	private String propFrtRtAmt = null;
	/*	Column Info	*/
	private String bsePortDefCd = null;
	/*	Column Info	*/
	private String viaPortDefCd = null;
	/*	Column Info	*/
	private String creUsrId = null;
	/*	Column Info	*/
	private String n1stCmncAmdtSeq = null;
	/*	Column Info	*/
	private String locGrdCd = null;
	/*	Column Info	*/
	private String propNo = null;
	/*	Column Info	*/
	private String prcTrspModCd = null;
	/*	Column Info	*/
	private String prcCmdtTpCd = null;
	/*	Column Info	*/
	private String n1stCmncDt = null;
	/*	Column Info	*/
	private String minCgoWgt = null;
	/*	Column Info	*/
	private String maxCgoWgt = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private	 HashMap<String , String>	hashColumns	= new LinkedHashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private	 HashMap<String , String>	hashFields = new LinkedHashMap<String, String>();


	/**	Constructor	*/
	public PriSpScpTrspAddChgVO(){}

	public PriSpScpTrspAddChgVO(String ibflag,String pagerows,String addChgSeq,String currCd,String prcCgoTpCd,String griApplAmt,String amdtSeq,String svcScpCd,String creDt,String routPntLocDefCd,String coffrFrtRtAmt,String noteDpSeq,String fnlFrtRtAmt,String prcProgStsCd,String bsePortTpCd,String addChgNoteCtnt,String rcvDeTermCd,String updUsrId,String locGrdCntCd,String routPntLocTpCd,String prcCmdtDefCd,String updDt,String dirCallFlg,String addChgTpCd,String viaPortTpCd,String acptDt,String acptOfcCd,String griApplTpCd,String acptUsrId,String srcInfoCd,String orgDestTpCd,String ratUtCd,String propFrtRtAmt,String bsePortDefCd,String viaPortDefCd,String creUsrId,String n1stCmncAmdtSeq,String locGrdCd,String propNo,String prcTrspModCd,String prcCmdtTpCd,String n1stCmncDt,String minCgoWgt,String maxCgoWgt)	{
		this.ibflag = ibflag;
		this.pagerows = pagerows;
		this.addChgSeq = addChgSeq;
		this.currCd = currCd;
		this.prcCgoTpCd = prcCgoTpCd;
		this.griApplAmt = griApplAmt;
		this.amdtSeq = amdtSeq;
		this.svcScpCd = svcScpCd;
		this.creDt = creDt;
		this.routPntLocDefCd = routPntLocDefCd;
		this.coffrFrtRtAmt = coffrFrtRtAmt;
		this.noteDpSeq = noteDpSeq;
		this.fnlFrtRtAmt = fnlFrtRtAmt;
		this.prcProgStsCd = prcProgStsCd;
		this.bsePortTpCd = bsePortTpCd;
		this.addChgNoteCtnt = addChgNoteCtnt;
		this.rcvDeTermCd = rcvDeTermCd;
		this.updUsrId = updUsrId;
		this.locGrdCntCd = locGrdCntCd;
		this.routPntLocTpCd = routPntLocTpCd;
		this.prcCmdtDefCd = prcCmdtDefCd;
		this.updDt = updDt;
		this.dirCallFlg = dirCallFlg;
		this.addChgTpCd = addChgTpCd;
		this.viaPortTpCd = viaPortTpCd;
		this.acptDt = acptDt;
		this.acptOfcCd = acptOfcCd;
		this.griApplTpCd = griApplTpCd;
		this.acptUsrId = acptUsrId;
		this.srcInfoCd = srcInfoCd;
		this.orgDestTpCd = orgDestTpCd;
		this.ratUtCd = ratUtCd;
		this.propFrtRtAmt = propFrtRtAmt;
		this.bsePortDefCd = bsePortDefCd;
		this.viaPortDefCd = viaPortDefCd;
		this.creUsrId = creUsrId;
		this.n1stCmncAmdtSeq = n1stCmncAmdtSeq;
		this.locGrdCd = locGrdCd;
		this.propNo = propNo;
		this.prcTrspModCd = prcTrspModCd;
		this.prcCmdtTpCd = prcCmdtTpCd;
		this.n1stCmncDt = n1stCmncDt;
		this.minCgoWgt = minCgoWgt;
		this.maxCgoWgt = maxCgoWgt;
	}


	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value">	로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("add_chg_seq", getAddChgSeq());
		this.hashColumns.put("curr_cd", getCurrCd());
		this.hashColumns.put("prc_cgo_tp_cd", getPrcCgoTpCd());
		this.hashColumns.put("gri_appl_amt", getGriApplAmt());
		this.hashColumns.put("amdt_seq", getAmdtSeq());
		this.hashColumns.put("svc_scp_cd", getSvcScpCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("rout_pnt_loc_def_cd", getRoutPntLocDefCd());
		this.hashColumns.put("coffr_frt_rt_amt", getCoffrFrtRtAmt());
		this.hashColumns.put("note_dp_seq", getNoteDpSeq());
		this.hashColumns.put("fnl_frt_rt_amt", getFnlFrtRtAmt());
		this.hashColumns.put("prc_prog_sts_cd", getPrcProgStsCd());
		this.hashColumns.put("bse_port_tp_cd", getBsePortTpCd());
		this.hashColumns.put("add_chg_note_ctnt", getAddChgNoteCtnt());
		this.hashColumns.put("rcv_de_term_cd", getRcvDeTermCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("loc_grd_cnt_cd", getLocGrdCntCd());
		this.hashColumns.put("rout_pnt_loc_tp_cd", getRoutPntLocTpCd());
		this.hashColumns.put("prc_cmdt_def_cd", getPrcCmdtDefCd());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("dir_call_flg", getDirCallFlg());
		this.hashColumns.put("add_chg_tp_cd", getAddChgTpCd());
		this.hashColumns.put("via_port_tp_cd", getViaPortTpCd());
		this.hashColumns.put("acpt_dt", getAcptDt());
		this.hashColumns.put("acpt_ofc_cd", getAcptOfcCd());
		this.hashColumns.put("gri_appl_tp_cd", getGriApplTpCd());
		this.hashColumns.put("acpt_usr_id", getAcptUsrId());
		this.hashColumns.put("src_info_cd", getSrcInfoCd());
		this.hashColumns.put("org_dest_tp_cd", getOrgDestTpCd());
		this.hashColumns.put("rat_ut_cd", getRatUtCd());
		this.hashColumns.put("prop_frt_rt_amt", getPropFrtRtAmt());
		this.hashColumns.put("bse_port_def_cd", getBsePortDefCd());
		this.hashColumns.put("via_port_def_cd", getViaPortDefCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("n1st_cmnc_amdt_seq", getN1stCmncAmdtSeq());
		this.hashColumns.put("loc_grd_cd", getLocGrdCd());
		this.hashColumns.put("prop_no", getPropNo());
		this.hashColumns.put("prc_trsp_mod_cd", getPrcTrspModCd());
		this.hashColumns.put("prc_cmdt_tp_cd", getPrcCmdtTpCd());
		this.hashColumns.put("n1st_cmnc_dt", getN1stCmncDt());
		this.hashColumns.put("min_cgo_wgt", getMinCgoWgt());
		this.hashColumns.put("max_cgo_wgt", getMaxCgoWgt());
		return this.hashColumns;
	}

	/**
	 * 컬럼명에	대응되는 멤버변수명을	저장하여 Hashtable<"column_name", "variable"> 로 반환
	 * @return
	 */
	public  HashMap<String, String>  getFieldNames(){
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("add_chg_seq", "addChgSeq");
		this.hashFields.put("curr_cd", "currCd");
		this.hashFields.put("prc_cgo_tp_cd", "prcCgoTpCd");
		this.hashFields.put("gri_appl_amt", "griApplAmt");
		this.hashFields.put("amdt_seq", "amdtSeq");
		this.hashFields.put("svc_scp_cd", "svcScpCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("rout_pnt_loc_def_cd", "routPntLocDefCd");
		this.hashFields.put("coffr_frt_rt_amt", "coffrFrtRtAmt");
		this.hashFields.put("note_dp_seq", "noteDpSeq");
		this.hashFields.put("fnl_frt_rt_amt", "fnlFrtRtAmt");
		this.hashFields.put("prc_prog_sts_cd", "prcProgStsCd");
		this.hashFields.put("bse_port_tp_cd", "bsePortTpCd");
		this.hashFields.put("add_chg_note_ctnt", "addChgNoteCtnt");
		this.hashFields.put("rcv_de_term_cd", "rcvDeTermCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("loc_grd_cnt_cd", "locGrdCntCd");
		this.hashFields.put("rout_pnt_loc_tp_cd", "routPntLocTpCd");
		this.hashFields.put("prc_cmdt_def_cd", "prcCmdtDefCd");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("dir_call_flg", "dirCallFlg");
		this.hashFields.put("add_chg_tp_cd", "addChgTpCd");
		this.hashFields.put("via_port_tp_cd", "viaPortTpCd");
		this.hashFields.put("acpt_dt", "acptDt");
		this.hashFields.put("acpt_ofc_cd", "acptOfcCd");
		this.hashFields.put("gri_appl_tp_cd", "griApplTpCd");
		this.hashFields.put("acpt_usr_id", "acptUsrId");
		this.hashFields.put("src_info_cd", "srcInfoCd");
		this.hashFields.put("org_dest_tp_cd", "orgDestTpCd");
		this.hashFields.put("rat_ut_cd", "ratUtCd");
		this.hashFields.put("prop_frt_rt_amt", "propFrtRtAmt");
		this.hashFields.put("bse_port_def_cd", "bsePortDefCd");
		this.hashFields.put("via_port_def_cd", "viaPortDefCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("n1st_cmnc_amdt_seq", "n1stCmncAmdtSeq");
		this.hashFields.put("loc_grd_cd", "locGrdCd");
		this.hashFields.put("prop_no", "propNo");
		this.hashFields.put("prc_trsp_mod_cd", "prcTrspModCd");
		this.hashFields.put("prc_cmdt_tp_cd", "prcCmdtTpCd");
		this.hashFields.put("n1st_cmnc_dt", "n1stCmncDt");
		this.hashFields.put("min_cgo_wgt", "minCgoWgt");
		this.hashFields.put("max_cgo_wgt", "maxCgoWgt");
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
	 * @return addChgSeq
	 */
	public	String getAddChgSeq() {
		return	this.addChgSeq;
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
	 * @return prcCgoTpCd
	 */
	public	String getPrcCgoTpCd() {
		return	this.prcCgoTpCd;
	}

	/**
	 * Column Info
	 * @return griApplAmt
	 */
	public	String getGriApplAmt() {
		return	this.griApplAmt;
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
	 * @return svcScpCd
	 */
	public	String getSvcScpCd() {
		return	this.svcScpCd;
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
	 * @return routPntLocDefCd
	 */
	public	String getRoutPntLocDefCd() {
		return	this.routPntLocDefCd;
	}

	/**
	 * Column Info
	 * @return coffrFrtRtAmt
	 */
	public	String getCoffrFrtRtAmt() {
		return	this.coffrFrtRtAmt;
	}

	/**
	 * Column Info
	 * @return noteDpSeq
	 */
	public	String getNoteDpSeq() {
		return	this.noteDpSeq;
	}

	/**
	 * Column Info
	 * @return fnlFrtRtAmt
	 */
	public	String getFnlFrtRtAmt() {
		return	this.fnlFrtRtAmt;
	}

	/**
	 * Column Info
	 * @return prcProgStsCd
	 */
	public	String getPrcProgStsCd() {
		return	this.prcProgStsCd;
	}

	/**
	 * Column Info
	 * @return bsePortTpCd
	 */
	public	String getBsePortTpCd() {
		return	this.bsePortTpCd;
	}

	/**
	 * Column Info
	 * @return addChgNoteCtnt
	 */
	public	String getAddChgNoteCtnt() {
		return	this.addChgNoteCtnt;
	}

	/**
	 * Column Info
	 * @return rcvDeTermCd
	 */
	public	String getRcvDeTermCd() {
		return	this.rcvDeTermCd;
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
	 * @return locGrdCntCd
	 */
	public	String getLocGrdCntCd() {
		return	this.locGrdCntCd;
	}

	/**
	 * Column Info
	 * @return routPntLocTpCd
	 */
	public	String getRoutPntLocTpCd() {
		return	this.routPntLocTpCd;
	}

	/**
	 * Column Info
	 * @return prcCmdtDefCd
	 */
	public	String getPrcCmdtDefCd() {
		return	this.prcCmdtDefCd;
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
	 * @return dirCallFlg
	 */
	public	String getDirCallFlg() {
		return	this.dirCallFlg;
	}

	/**
	 * Column Info
	 * @return addChgTpCd
	 */
	public	String getAddChgTpCd() {
		return	this.addChgTpCd;
	}

	/**
	 * Column Info
	 * @return viaPortTpCd
	 */
	public	String getViaPortTpCd() {
		return	this.viaPortTpCd;
	}

	/**
	 * Column Info
	 * @return acptDt
	 */
	public	String getAcptDt() {
		return	this.acptDt;
	}

	/**
	 * Column Info
	 * @return acptOfcCd
	 */
	public	String getAcptOfcCd() {
		return	this.acptOfcCd;
	}

	/**
	 * Column Info
	 * @return griApplTpCd
	 */
	public	String getGriApplTpCd() {
		return	this.griApplTpCd;
	}

	/**
	 * Column Info
	 * @return acptUsrId
	 */
	public	String getAcptUsrId() {
		return	this.acptUsrId;
	}

	/**
	 * Column Info
	 * @return srcInfoCd
	 */
	public	String getSrcInfoCd() {
		return	this.srcInfoCd;
	}

	/**
	 * Column Info
	 * @return orgDestTpCd
	 */
	public	String getOrgDestTpCd() {
		return	this.orgDestTpCd;
	}

	/**
	 * Column Info
	 * @return ratUtCd
	 */
	public	String getRatUtCd() {
		return	this.ratUtCd;
	}

	/**
	 * Column Info
	 * @return propFrtRtAmt
	 */
	public	String getPropFrtRtAmt() {
		return	this.propFrtRtAmt;
	}

	/**
	 * Column Info
	 * @return bsePortDefCd
	 */
	public	String getBsePortDefCd() {
		return	this.bsePortDefCd;
	}

	/**
	 * Column Info
	 * @return viaPortDefCd
	 */
	public	String getViaPortDefCd() {
		return	this.viaPortDefCd;
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
	 * @return n1stCmncAmdtSeq
	 */
	public	String getN1stCmncAmdtSeq() {
		return	this.n1stCmncAmdtSeq;
	}

	/**
	 * Column Info
	 * @return locGrdCd
	 */
	public	String getLocGrdCd() {
		return	this.locGrdCd;
	}

	/**
	 * Column Info
	 * @return propNo
	 */
	public	String getPropNo() {
		return	this.propNo;
	}

	/**
	 * Column Info
	 * @return prcTrspModCd
	 */
	public	String getPrcTrspModCd() {
		return	this.prcTrspModCd;
	}

	/**
	 * Column Info
	 * @return prcCmdtTpCd
	 */
	public	String getPrcCmdtTpCd() {
		return	this.prcCmdtTpCd;
	}

	/**
	 * Column Info
	 * @return n1stCmncDt
	 */
	public	String getN1stCmncDt() {
		return	this.n1stCmncDt;
	}

	/**
	 * Column Info
	 * @return minCgoWgt
	 */
	public	String getMinCgoWgt() {
		return	this.minCgoWgt;
	}

	/**
	 * Column Info
	 * @return maxCgoWgt
	 */
	public	String getMaxCgoWgt() {
		return	this.maxCgoWgt;
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
	 * @param  addChgSeq
 	 */
	public void	setAddChgSeq(String addChgSeq ) {
		this.addChgSeq =	addChgSeq;
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
	 * @param  prcCgoTpCd
 	 */
	public void	setPrcCgoTpCd(String prcCgoTpCd ) {
		this.prcCgoTpCd =	prcCgoTpCd;
	}
 	/**
	 * Column Info
	 * @param  griApplAmt
 	 */
	public void	setGriApplAmt(String griApplAmt ) {
		this.griApplAmt =	griApplAmt;
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
	 * @param  svcScpCd
 	 */
	public void	setSvcScpCd(String svcScpCd ) {
		this.svcScpCd =	svcScpCd;
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
	 * @param  routPntLocDefCd
 	 */
	public void	setRoutPntLocDefCd(String routPntLocDefCd ) {
		this.routPntLocDefCd =	routPntLocDefCd;
	}
 	/**
	 * Column Info
	 * @param  coffrFrtRtAmt
 	 */
	public void	setCoffrFrtRtAmt(String coffrFrtRtAmt ) {
		this.coffrFrtRtAmt =	coffrFrtRtAmt;
	}
 	/**
	 * Column Info
	 * @param  noteDpSeq
 	 */
	public void	setNoteDpSeq(String noteDpSeq ) {
		this.noteDpSeq =	noteDpSeq;
	}
 	/**
	 * Column Info
	 * @param  fnlFrtRtAmt
 	 */
	public void	setFnlFrtRtAmt(String fnlFrtRtAmt ) {
		this.fnlFrtRtAmt =	fnlFrtRtAmt;
	}
 	/**
	 * Column Info
	 * @param  prcProgStsCd
 	 */
	public void	setPrcProgStsCd(String prcProgStsCd ) {
		this.prcProgStsCd =	prcProgStsCd;
	}
 	/**
	 * Column Info
	 * @param  bsePortTpCd
 	 */
	public void	setBsePortTpCd(String bsePortTpCd ) {
		this.bsePortTpCd =	bsePortTpCd;
	}
 	/**
	 * Column Info
	 * @param  addChgNoteCtnt
 	 */
	public void	setAddChgNoteCtnt(String addChgNoteCtnt ) {
		this.addChgNoteCtnt =	addChgNoteCtnt;
	}
 	/**
	 * Column Info
	 * @param  rcvDeTermCd
 	 */
	public void	setRcvDeTermCd(String rcvDeTermCd ) {
		this.rcvDeTermCd =	rcvDeTermCd;
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
	 * @param  locGrdCntCd
 	 */
	public void	setLocGrdCntCd(String locGrdCntCd ) {
		this.locGrdCntCd =	locGrdCntCd;
	}
 	/**
	 * Column Info
	 * @param  routPntLocTpCd
 	 */
	public void	setRoutPntLocTpCd(String routPntLocTpCd ) {
		this.routPntLocTpCd =	routPntLocTpCd;
	}
 	/**
	 * Column Info
	 * @param  prcCmdtDefCd
 	 */
	public void	setPrcCmdtDefCd(String prcCmdtDefCd ) {
		this.prcCmdtDefCd =	prcCmdtDefCd;
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
	 * @param  dirCallFlg
 	 */
	public void	setDirCallFlg(String dirCallFlg ) {
		this.dirCallFlg =	dirCallFlg;
	}
 	/**
	 * Column Info
	 * @param  addChgTpCd
 	 */
	public void	setAddChgTpCd(String addChgTpCd ) {
		this.addChgTpCd =	addChgTpCd;
	}
 	/**
	 * Column Info
	 * @param  viaPortTpCd
 	 */
	public void	setViaPortTpCd(String viaPortTpCd ) {
		this.viaPortTpCd =	viaPortTpCd;
	}
 	/**
	 * Column Info
	 * @param  acptDt
 	 */
	public void	setAcptDt(String acptDt ) {
		this.acptDt =	acptDt;
	}
 	/**
	 * Column Info
	 * @param  acptOfcCd
 	 */
	public void	setAcptOfcCd(String acptOfcCd ) {
		this.acptOfcCd =	acptOfcCd;
	}
 	/**
	 * Column Info
	 * @param  griApplTpCd
 	 */
	public void	setGriApplTpCd(String griApplTpCd ) {
		this.griApplTpCd =	griApplTpCd;
	}
 	/**
	 * Column Info
	 * @param  acptUsrId
 	 */
	public void	setAcptUsrId(String acptUsrId ) {
		this.acptUsrId =	acptUsrId;
	}
 	/**
	 * Column Info
	 * @param  srcInfoCd
 	 */
	public void	setSrcInfoCd(String srcInfoCd ) {
		this.srcInfoCd =	srcInfoCd;
	}
 	/**
	 * Column Info
	 * @param  orgDestTpCd
 	 */
	public void	setOrgDestTpCd(String orgDestTpCd ) {
		this.orgDestTpCd =	orgDestTpCd;
	}
 	/**
	 * Column Info
	 * @param  ratUtCd
 	 */
	public void	setRatUtCd(String ratUtCd ) {
		this.ratUtCd =	ratUtCd;
	}
 	/**
	 * Column Info
	 * @param  propFrtRtAmt
 	 */
	public void	setPropFrtRtAmt(String propFrtRtAmt ) {
		this.propFrtRtAmt =	propFrtRtAmt;
	}
 	/**
	 * Column Info
	 * @param  bsePortDefCd
 	 */
	public void	setBsePortDefCd(String bsePortDefCd ) {
		this.bsePortDefCd =	bsePortDefCd;
	}
 	/**
	 * Column Info
	 * @param  viaPortDefCd
 	 */
	public void	setViaPortDefCd(String viaPortDefCd ) {
		this.viaPortDefCd =	viaPortDefCd;
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
	 * @param  n1stCmncAmdtSeq
 	 */
	public void	setN1stCmncAmdtSeq(String n1stCmncAmdtSeq ) {
		this.n1stCmncAmdtSeq =	n1stCmncAmdtSeq;
	}
 	/**
	 * Column Info
	 * @param  locGrdCd
 	 */
	public void	setLocGrdCd(String locGrdCd ) {
		this.locGrdCd =	locGrdCd;
	}
 	/**
	 * Column Info
	 * @param  propNo
 	 */
	public void	setPropNo(String propNo ) {
		this.propNo =	propNo;
	}
 	/**
	 * Column Info
	 * @param  prcTrspModCd
 	 */
	public void	setPrcTrspModCd(String prcTrspModCd ) {
		this.prcTrspModCd =	prcTrspModCd;
	}
 	/**
	 * Column Info
	 * @param  prcCmdtTpCd
 	 */
	public void	setPrcCmdtTpCd(String prcCmdtTpCd ) {
		this.prcCmdtTpCd =	prcCmdtTpCd;
	}
 	/**
	 * Column Info
	 * @param  n1stCmncDt
 	 */
	public void	setN1stCmncDt(String n1stCmncDt ) {
		this.n1stCmncDt =	n1stCmncDt;
	}
 	/**
	 * Column Info
	 * @param  minCgoWgt
 	 */
	public void	setMinCgoWgt(String minCgoWgt ) {
		this.minCgoWgt =	minCgoWgt;
	}
 	/**
	 * Column Info
	 * @param  maxCgoWgt
 	 */
	public void	setMaxCgoWgt(String maxCgoWgt ) {
		this.maxCgoWgt =	maxCgoWgt;
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
		setAddChgSeq(JSPUtil.getParameter(request,	prefix + "add_chg_seq", ""));
		setCurrCd(JSPUtil.getParameter(request,	prefix + "curr_cd", ""));
		setPrcCgoTpCd(JSPUtil.getParameter(request,	prefix + "prc_cgo_tp_cd", ""));
		setGriApplAmt(JSPUtil.getParameter(request,	prefix + "gri_appl_amt", ""));
		setAmdtSeq(JSPUtil.getParameter(request,	prefix + "amdt_seq", ""));
		setSvcScpCd(JSPUtil.getParameter(request,	prefix + "svc_scp_cd", ""));
		setCreDt(JSPUtil.getParameter(request,	prefix + "cre_dt", ""));
		setRoutPntLocDefCd(JSPUtil.getParameter(request,	prefix + "rout_pnt_loc_def_cd", ""));
		setCoffrFrtRtAmt(JSPUtil.getParameter(request,	prefix + "coffr_frt_rt_amt", ""));
		setNoteDpSeq(JSPUtil.getParameter(request,	prefix + "note_dp_seq", ""));
		setFnlFrtRtAmt(JSPUtil.getParameter(request,	prefix + "fnl_frt_rt_amt", ""));
		setPrcProgStsCd(JSPUtil.getParameter(request,	prefix + "prc_prog_sts_cd", ""));
		setBsePortTpCd(JSPUtil.getParameter(request,	prefix + "bse_port_tp_cd", ""));
		setAddChgNoteCtnt(JSPUtil.getParameter(request,	prefix + "add_chg_note_ctnt", ""));
		setRcvDeTermCd(JSPUtil.getParameter(request,	prefix + "rcv_de_term_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request,	prefix + "upd_usr_id", ""));
		setLocGrdCntCd(JSPUtil.getParameter(request,	prefix + "loc_grd_cnt_cd", ""));
		setRoutPntLocTpCd(JSPUtil.getParameter(request,	prefix + "rout_pnt_loc_tp_cd", ""));
		setPrcCmdtDefCd(JSPUtil.getParameter(request,	prefix + "prc_cmdt_def_cd", ""));
		setUpdDt(JSPUtil.getParameter(request,	prefix + "upd_dt", ""));
		setDirCallFlg(JSPUtil.getParameter(request,	prefix + "dir_call_flg", ""));
		setAddChgTpCd(JSPUtil.getParameter(request,	prefix + "add_chg_tp_cd", ""));
		setViaPortTpCd(JSPUtil.getParameter(request,	prefix + "via_port_tp_cd", ""));
		setAcptDt(JSPUtil.getParameter(request,	prefix + "acpt_dt", ""));
		setAcptOfcCd(JSPUtil.getParameter(request,	prefix + "acpt_ofc_cd", ""));
		setGriApplTpCd(JSPUtil.getParameter(request,	prefix + "gri_appl_tp_cd", ""));
		setAcptUsrId(JSPUtil.getParameter(request,	prefix + "acpt_usr_id", ""));
		setSrcInfoCd(JSPUtil.getParameter(request,	prefix + "src_info_cd", ""));
		setOrgDestTpCd(JSPUtil.getParameter(request,	prefix + "org_dest_tp_cd", ""));
		setRatUtCd(JSPUtil.getParameter(request,	prefix + "rat_ut_cd", ""));
		setPropFrtRtAmt(JSPUtil.getParameter(request,	prefix + "prop_frt_rt_amt", ""));
		setBsePortDefCd(JSPUtil.getParameter(request,	prefix + "bse_port_def_cd", ""));
		setViaPortDefCd(JSPUtil.getParameter(request,	prefix + "via_port_def_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request,	prefix + "cre_usr_id", ""));
		setN1stCmncAmdtSeq(JSPUtil.getParameter(request,	prefix + "n1st_cmnc_amdt_seq", ""));
		setLocGrdCd(JSPUtil.getParameter(request,	prefix + "loc_grd_cd", ""));
		setPropNo(JSPUtil.getParameter(request,	prefix + "prop_no", ""));
		setPrcTrspModCd(JSPUtil.getParameter(request,	prefix + "prc_trsp_mod_cd", ""));
		setPrcCmdtTpCd(JSPUtil.getParameter(request,	prefix + "prc_cmdt_tp_cd", ""));
		setN1stCmncDt(JSPUtil.getParameter(request,	prefix + "n1st_cmnc_dt", ""));
		setMinCgoWgt(JSPUtil.getParameter(request,	prefix + "min_cgo_wgt", ""));
		setMaxCgoWgt(JSPUtil.getParameter(request,	prefix + "max_cgo_wgt", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return PriSpScpTrspAddChgVO[]
	 */
	public PriSpScpTrspAddChgVO[]	fromRequestGrid(HttpServletRequest request)	{
		return fromRequestGrid(request,	"");
	}

	/**
	 * Request 넘어온 여러 건	DATA를 VO Class 에 담는다.
	 * @param request
	 * @param prefix
	 * @return PriSpScpTrspAddChgVO[]
	 */
	public PriSpScpTrspAddChgVO[]	fromRequestGrid(HttpServletRequest request,	String prefix) {
		PriSpScpTrspAddChgVO model = null;

		String[] tmp = request.getParameterValues(prefix + "ibflag");
		if (tmp	== null)
			return null;

		int	length = request.getParameterValues(prefix + "ibflag").length;

		try	{
			String[] ibflag =	(JSPUtil.getParameter(request, prefix +	"ibflag",	length));
			String[] pagerows =	(JSPUtil.getParameter(request, prefix +	"pagerows",	length));
			String[] addChgSeq =	(JSPUtil.getParameter(request, prefix +	"add_chg_seq",	length));
			String[] currCd =	(JSPUtil.getParameter(request, prefix +	"curr_cd",	length));
			String[] prcCgoTpCd =	(JSPUtil.getParameter(request, prefix +	"prc_cgo_tp_cd",	length));
			String[] griApplAmt =	(JSPUtil.getParameter(request, prefix +	"gri_appl_amt",	length));
			String[] amdtSeq =	(JSPUtil.getParameter(request, prefix +	"amdt_seq",	length));
			String[] svcScpCd =	(JSPUtil.getParameter(request, prefix +	"svc_scp_cd",	length));
			String[] creDt =	(JSPUtil.getParameter(request, prefix +	"cre_dt",	length));
			String[] routPntLocDefCd =	(JSPUtil.getParameter(request, prefix +	"rout_pnt_loc_def_cd",	length));
			String[] coffrFrtRtAmt =	(JSPUtil.getParameter(request, prefix +	"coffr_frt_rt_amt",	length));
			String[] noteDpSeq =	(JSPUtil.getParameter(request, prefix +	"note_dp_seq",	length));
			String[] fnlFrtRtAmt =	(JSPUtil.getParameter(request, prefix +	"fnl_frt_rt_amt",	length));
			String[] prcProgStsCd =	(JSPUtil.getParameter(request, prefix +	"prc_prog_sts_cd",	length));
			String[] bsePortTpCd =	(JSPUtil.getParameter(request, prefix +	"bse_port_tp_cd",	length));
			String[] addChgNoteCtnt =	(JSPUtil.getParameter(request, prefix +	"add_chg_note_ctnt",	length));
			String[] rcvDeTermCd =	(JSPUtil.getParameter(request, prefix +	"rcv_de_term_cd",	length));
			String[] updUsrId =	(JSPUtil.getParameter(request, prefix +	"upd_usr_id",	length));
			String[] locGrdCntCd =	(JSPUtil.getParameter(request, prefix +	"loc_grd_cnt_cd",	length));
			String[] routPntLocTpCd =	(JSPUtil.getParameter(request, prefix +	"rout_pnt_loc_tp_cd",	length));
			String[] prcCmdtDefCd =	(JSPUtil.getParameter(request, prefix +	"prc_cmdt_def_cd",	length));
			String[] updDt =	(JSPUtil.getParameter(request, prefix +	"upd_dt",	length));
			String[] dirCallFlg =	(JSPUtil.getParameter(request, prefix +	"dir_call_flg",	length));
			String[] addChgTpCd =	(JSPUtil.getParameter(request, prefix +	"add_chg_tp_cd",	length));
			String[] viaPortTpCd =	(JSPUtil.getParameter(request, prefix +	"via_port_tp_cd",	length));
			String[] acptDt =	(JSPUtil.getParameter(request, prefix +	"acpt_dt",	length));
			String[] acptOfcCd =	(JSPUtil.getParameter(request, prefix +	"acpt_ofc_cd",	length));
			String[] griApplTpCd =	(JSPUtil.getParameter(request, prefix +	"gri_appl_tp_cd",	length));
			String[] acptUsrId =	(JSPUtil.getParameter(request, prefix +	"acpt_usr_id",	length));
			String[] srcInfoCd =	(JSPUtil.getParameter(request, prefix +	"src_info_cd",	length));
			String[] orgDestTpCd =	(JSPUtil.getParameter(request, prefix +	"org_dest_tp_cd",	length));
			String[] ratUtCd =	(JSPUtil.getParameter(request, prefix +	"rat_ut_cd",	length));
			String[] propFrtRtAmt =	(JSPUtil.getParameter(request, prefix +	"prop_frt_rt_amt",	length));
			String[] bsePortDefCd =	(JSPUtil.getParameter(request, prefix +	"bse_port_def_cd",	length));
			String[] viaPortDefCd =	(JSPUtil.getParameter(request, prefix +	"via_port_def_cd",	length));
			String[] creUsrId =	(JSPUtil.getParameter(request, prefix +	"cre_usr_id",	length));
			String[] n1stCmncAmdtSeq =	(JSPUtil.getParameter(request, prefix +	"n1st_cmnc_amdt_seq",	length));
			String[] locGrdCd =	(JSPUtil.getParameter(request, prefix +	"loc_grd_cd",	length));
			String[] propNo =	(JSPUtil.getParameter(request, prefix +	"prop_no",	length));
			String[] prcTrspModCd =	(JSPUtil.getParameter(request, prefix +	"prc_trsp_mod_cd",	length));
			String[] prcCmdtTpCd =	(JSPUtil.getParameter(request, prefix +	"prc_cmdt_tp_cd",	length));
			String[] n1stCmncDt =	(JSPUtil.getParameter(request, prefix +	"n1st_cmnc_dt",	length));
			String[] minCgoWgt =	(JSPUtil.getParameter(request, prefix +	"min_cgo_wgt",	length));
			String[] maxCgoWgt =	(JSPUtil.getParameter(request, prefix +	"max_cgo_wgt",	length));
			for	(int i = 0;	i <	length;	i++) {
				model =	new	PriSpScpTrspAddChgVO();
				if ( ibflag[i] !=	null)
					model.setIbflag( ibflag[i]);
				if ( pagerows[i] !=	null)
					model.setPagerows( pagerows[i]);
				if ( addChgSeq[i] !=	null)
					model.setAddChgSeq( addChgSeq[i]);
				if ( currCd[i] !=	null)
					model.setCurrCd( currCd[i]);
				if ( prcCgoTpCd[i] !=	null)
					model.setPrcCgoTpCd( prcCgoTpCd[i]);
				if ( griApplAmt[i] !=	null)
					model.setGriApplAmt( griApplAmt[i]);
				if ( amdtSeq[i] !=	null)
					model.setAmdtSeq( amdtSeq[i]);
				if ( svcScpCd[i] !=	null)
					model.setSvcScpCd( svcScpCd[i]);
				if ( creDt[i] !=	null)
					model.setCreDt( creDt[i]);
				if ( routPntLocDefCd[i] !=	null)
					model.setRoutPntLocDefCd( routPntLocDefCd[i]);
				if ( coffrFrtRtAmt[i] !=	null)
					model.setCoffrFrtRtAmt( coffrFrtRtAmt[i]);
				if ( noteDpSeq[i] !=	null)
					model.setNoteDpSeq( noteDpSeq[i]);
				if ( fnlFrtRtAmt[i] !=	null)
					model.setFnlFrtRtAmt( fnlFrtRtAmt[i]);
				if ( prcProgStsCd[i] !=	null)
					model.setPrcProgStsCd( prcProgStsCd[i]);
				if ( bsePortTpCd[i] !=	null)
					model.setBsePortTpCd( bsePortTpCd[i]);
				if ( addChgNoteCtnt[i] !=	null)
					model.setAddChgNoteCtnt( addChgNoteCtnt[i]);
				if ( rcvDeTermCd[i] !=	null)
					model.setRcvDeTermCd( rcvDeTermCd[i]);
				if ( updUsrId[i] !=	null)
					model.setUpdUsrId( updUsrId[i]);
				if ( locGrdCntCd[i] !=	null)
					model.setLocGrdCntCd( locGrdCntCd[i]);
				if ( routPntLocTpCd[i] !=	null)
					model.setRoutPntLocTpCd( routPntLocTpCd[i]);
				if ( prcCmdtDefCd[i] !=	null)
					model.setPrcCmdtDefCd( prcCmdtDefCd[i]);
				if ( updDt[i] !=	null)
					model.setUpdDt( updDt[i]);
				if ( dirCallFlg[i] !=	null)
					model.setDirCallFlg( dirCallFlg[i]);
				if ( addChgTpCd[i] !=	null)
					model.setAddChgTpCd( addChgTpCd[i]);
				if ( viaPortTpCd[i] !=	null)
					model.setViaPortTpCd( viaPortTpCd[i]);
				if ( acptDt[i] !=	null)
					model.setAcptDt( acptDt[i]);
				if ( acptOfcCd[i] !=	null)
					model.setAcptOfcCd( acptOfcCd[i]);
				if ( griApplTpCd[i] !=	null)
					model.setGriApplTpCd( griApplTpCd[i]);
				if ( acptUsrId[i] !=	null)
					model.setAcptUsrId( acptUsrId[i]);
				if ( srcInfoCd[i] !=	null)
					model.setSrcInfoCd( srcInfoCd[i]);
				if ( orgDestTpCd[i] !=	null)
					model.setOrgDestTpCd( orgDestTpCd[i]);
				if ( ratUtCd[i] !=	null)
					model.setRatUtCd( ratUtCd[i]);
				if ( propFrtRtAmt[i] !=	null)
					model.setPropFrtRtAmt( propFrtRtAmt[i]);
				if ( bsePortDefCd[i] !=	null)
					model.setBsePortDefCd( bsePortDefCd[i]);
				if ( viaPortDefCd[i] !=	null)
					model.setViaPortDefCd( viaPortDefCd[i]);
				if ( creUsrId[i] !=	null)
					model.setCreUsrId( creUsrId[i]);
				if ( n1stCmncAmdtSeq[i] !=	null)
					model.setN1stCmncAmdtSeq( n1stCmncAmdtSeq[i]);
				if ( locGrdCd[i] !=	null)
					model.setLocGrdCd( locGrdCd[i]);
				if ( propNo[i] !=	null)
					model.setPropNo( propNo[i]);
				if ( prcTrspModCd[i] !=	null)
					model.setPrcTrspModCd( prcTrspModCd[i]);
				if ( prcCmdtTpCd[i] !=	null)
					model.setPrcCmdtTpCd( prcCmdtTpCd[i]);
				if ( n1stCmncDt[i] !=	null)
					model.setN1stCmncDt( n1stCmncDt[i]);
				if ( minCgoWgt[i] !=	null)
					model.setMinCgoWgt( minCgoWgt[i]);
				if ( maxCgoWgt[i] !=	null)
					model.setMaxCgoWgt( maxCgoWgt[i]);
				models.add(model);
			}

		} catch	(Exception e) {
			return null;
		}
		return getPriSpScpTrspAddChgVOs();
	}

	/**
	 *  VO 배열을 반환
	 * @return PriSpScpTrspAddChgVO[]
	 */
	public PriSpScpTrspAddChgVO[]	 getPriSpScpTrspAddChgVOs(){
		PriSpScpTrspAddChgVO[] vos = (PriSpScpTrspAddChgVO[])models.toArray(new	PriSpScpTrspAddChgVO[models.size()]);
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
		this.addChgSeq =	this.addChgSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.currCd =	this.currCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prcCgoTpCd =	this.prcCgoTpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.griApplAmt =	this.griApplAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.amdtSeq =	this.amdtSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.svcScpCd =	this.svcScpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt =	this.creDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.routPntLocDefCd =	this.routPntLocDefCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.coffrFrtRtAmt =	this.coffrFrtRtAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.noteDpSeq =	this.noteDpSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fnlFrtRtAmt =	this.fnlFrtRtAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prcProgStsCd =	this.prcProgStsCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bsePortTpCd =	this.bsePortTpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.addChgNoteCtnt =	this.addChgNoteCtnt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcvDeTermCd =	this.rcvDeTermCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId =	this.updUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.locGrdCntCd =	this.locGrdCntCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.routPntLocTpCd =	this.routPntLocTpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prcCmdtDefCd =	this.prcCmdtDefCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt =	this.updDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dirCallFlg =	this.dirCallFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.addChgTpCd =	this.addChgTpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.viaPortTpCd =	this.viaPortTpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acptDt =	this.acptDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acptOfcCd =	this.acptOfcCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.griApplTpCd =	this.griApplTpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acptUsrId =	this.acptUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.srcInfoCd =	this.srcInfoCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgDestTpCd =	this.orgDestTpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ratUtCd =	this.ratUtCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.propFrtRtAmt =	this.propFrtRtAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bsePortDefCd =	this.bsePortDefCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.viaPortDefCd =	this.viaPortDefCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId =	this.creUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stCmncAmdtSeq =	this.n1stCmncAmdtSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.locGrdCd =	this.locGrdCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.propNo =	this.propNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prcTrspModCd =	this.prcTrspModCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prcCmdtTpCd =	this.prcCmdtTpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stCmncDt =	this.n1stCmncDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.minCgoWgt =	this.minCgoWgt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.maxCgoWgt =	this.maxCgoWgt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}