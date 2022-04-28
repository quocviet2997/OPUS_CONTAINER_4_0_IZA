/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : PriScgRtVO.java
*@FileTitle : PriScgRtVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.28
*@LastModifier : 김재연
*@LastVersion : 1.0
* 2009.07.28 김재연 
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
 * @author 김재연
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class PriScgRtVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<PriScgRtVO> models = new ArrayList<PriScgRtVO>();
	
	/* Column Info */
	private String scgRmk = null;
	/* Column Info */
	private String currCd = null;
	/* Column Info */
	private String prcCgoTpCd = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String scgImdgClssCd = null;
	/* Column Info */
	private String payTermCd = null;
	/* Column Info */
	private String svcScpCd = null;
	/* Column Info */
	private String orgTrspModCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String wdrFlg = null;
	/* Column Info */
	private String vslSlanCd = null;
	/* Column Info */
	private String tmlCd = null;
	/* Column Info */
	private String chgCd = null;
	/* Column Info */
	private String polDefCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String delDefCd = null;
	/* Column Info */
	private String usaSvcModCd = null;
	/* Column Info */
	private String effDt = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String cmdtCd = null;
	/* Column Info */
	private String destTrspModCd = null;
	/* Column Info */
	private String expDt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String maxCgoWgt = null;
	/* Column Info */
	private String delTpCd = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String dirCallFlg = null;
	/* Column Info */
	private String tsPortCd = null;
	/* Column Info */
	private String prcDeTermCd = null;
	/* Column Info */
	private String podTpCd = null;
	/* Column Info */
	private String scgSeq = null;
	/* Column Info */
	private String ioGaCd = null;
	/* Column Info */
	private String ratUtCd = null;
	/* Column Info */
	private String porDefCd = null;
	/* Column Info */
	private String scgGrpCmdtCd = null;
	/* Column Info */
	private String socFlg = null;
	/* Column Info */
	private String prcRcvTermCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String podDefCd = null;
	/* Column Info */
	private String prcHngrBarTpCd = null;
	/* Column Info */
	private String minCgoWgt = null;
	/* Column Info */
	private String scgAmt = null;
	/* Column Info */
	private String porTpCd = null;
	/* Column Info */
	private String polTpCd = null;
	/* Column Info */
	private String subTrdCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public PriScgRtVO() {}

	public PriScgRtVO(String ibflag, String pagerows, String svcScpCd, String chgCd, String scgSeq, String effDt, String expDt, String subTrdCd, String vslSlanCd, String porTpCd, String porDefCd, String polTpCd, String polDefCd, String podTpCd, String podDefCd, String delTpCd, String delDefCd, String tsPortCd, String tmlCd, String orgTrspModCd, String destTrspModCd, String usaSvcModCd, String prcRcvTermCd, String prcDeTermCd, String prcHngrBarTpCd, String dirCallFlg, String minCgoWgt, String maxCgoWgt, String cmdtCd, String scgGrpCmdtCd, String prcCgoTpCd, String scgImdgClssCd, String ratUtCd, String currCd, String scgAmt, String payTermCd, String wdrFlg, String socFlg, String ioGaCd, String deltFlg, String scgRmk, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.scgRmk = scgRmk;
		this.currCd = currCd;
		this.prcCgoTpCd = prcCgoTpCd;
		this.deltFlg = deltFlg;
		this.scgImdgClssCd = scgImdgClssCd;
		this.payTermCd = payTermCd;
		this.svcScpCd = svcScpCd;
		this.orgTrspModCd = orgTrspModCd;
		this.creDt = creDt;
		this.wdrFlg = wdrFlg;
		this.vslSlanCd = vslSlanCd;
		this.tmlCd = tmlCd;
		this.chgCd = chgCd;
		this.polDefCd = polDefCd;
		this.pagerows = pagerows;
		this.delDefCd = delDefCd;
		this.usaSvcModCd = usaSvcModCd;
		this.effDt = effDt;
		this.ibflag = ibflag;
		this.cmdtCd = cmdtCd;
		this.destTrspModCd = destTrspModCd;
		this.expDt = expDt;
		this.updUsrId = updUsrId;
		this.maxCgoWgt = maxCgoWgt;
		this.delTpCd = delTpCd;
		this.updDt = updDt;
		this.dirCallFlg = dirCallFlg;
		this.tsPortCd = tsPortCd;
		this.prcDeTermCd = prcDeTermCd;
		this.podTpCd = podTpCd;
		this.scgSeq = scgSeq;
		this.ioGaCd = ioGaCd;
		this.ratUtCd = ratUtCd;
		this.porDefCd = porDefCd;
		this.scgGrpCmdtCd = scgGrpCmdtCd;
		this.socFlg = socFlg;
		this.prcRcvTermCd = prcRcvTermCd;
		this.creUsrId = creUsrId;
		this.podDefCd = podDefCd;
		this.prcHngrBarTpCd = prcHngrBarTpCd;
		this.minCgoWgt = minCgoWgt;
		this.scgAmt = scgAmt;
		this.porTpCd = porTpCd;
		this.polTpCd = polTpCd;
		this.subTrdCd = subTrdCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("scg_rmk", getScgRmk());
		this.hashColumns.put("curr_cd", getCurrCd());
		this.hashColumns.put("prc_cgo_tp_cd", getPrcCgoTpCd());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("scg_imdg_clss_cd", getScgImdgClssCd());
		this.hashColumns.put("pay_term_cd", getPayTermCd());
		this.hashColumns.put("svc_scp_cd", getSvcScpCd());
		this.hashColumns.put("org_trsp_mod_cd", getOrgTrspModCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("wdr_flg", getWdrFlg());
		this.hashColumns.put("vsl_slan_cd", getVslSlanCd());
		this.hashColumns.put("tml_cd", getTmlCd());
		this.hashColumns.put("chg_cd", getChgCd());
		this.hashColumns.put("pol_def_cd", getPolDefCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("del_def_cd", getDelDefCd());
		this.hashColumns.put("usa_svc_mod_cd", getUsaSvcModCd());
		this.hashColumns.put("eff_dt", getEffDt());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cmdt_cd", getCmdtCd());
		this.hashColumns.put("dest_trsp_mod_cd", getDestTrspModCd());
		this.hashColumns.put("exp_dt", getExpDt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("max_cgo_wgt", getMaxCgoWgt());
		this.hashColumns.put("del_tp_cd", getDelTpCd());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("dir_call_flg", getDirCallFlg());
		this.hashColumns.put("ts_port_cd", getTsPortCd());
		this.hashColumns.put("prc_de_term_cd", getPrcDeTermCd());
		this.hashColumns.put("pod_tp_cd", getPodTpCd());
		this.hashColumns.put("scg_seq", getScgSeq());
		this.hashColumns.put("io_ga_cd", getIoGaCd());
		this.hashColumns.put("rat_ut_cd", getRatUtCd());
		this.hashColumns.put("por_def_cd", getPorDefCd());
		this.hashColumns.put("scg_grp_cmdt_cd", getScgGrpCmdtCd());
		this.hashColumns.put("soc_flg", getSocFlg());
		this.hashColumns.put("prc_rcv_term_cd", getPrcRcvTermCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("pod_def_cd", getPodDefCd());
		this.hashColumns.put("prc_hngr_bar_tp_cd", getPrcHngrBarTpCd());
		this.hashColumns.put("min_cgo_wgt", getMinCgoWgt());
		this.hashColumns.put("scg_amt", getScgAmt());
		this.hashColumns.put("por_tp_cd", getPorTpCd());
		this.hashColumns.put("pol_tp_cd", getPolTpCd());
		this.hashColumns.put("sub_trd_cd", getSubTrdCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("scg_rmk", "scgRmk");
		this.hashFields.put("curr_cd", "currCd");
		this.hashFields.put("prc_cgo_tp_cd", "prcCgoTpCd");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("scg_imdg_clss_cd", "scgImdgClssCd");
		this.hashFields.put("pay_term_cd", "payTermCd");
		this.hashFields.put("svc_scp_cd", "svcScpCd");
		this.hashFields.put("org_trsp_mod_cd", "orgTrspModCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("wdr_flg", "wdrFlg");
		this.hashFields.put("vsl_slan_cd", "vslSlanCd");
		this.hashFields.put("tml_cd", "tmlCd");
		this.hashFields.put("chg_cd", "chgCd");
		this.hashFields.put("pol_def_cd", "polDefCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("del_def_cd", "delDefCd");
		this.hashFields.put("usa_svc_mod_cd", "usaSvcModCd");
		this.hashFields.put("eff_dt", "effDt");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cmdt_cd", "cmdtCd");
		this.hashFields.put("dest_trsp_mod_cd", "destTrspModCd");
		this.hashFields.put("exp_dt", "expDt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("max_cgo_wgt", "maxCgoWgt");
		this.hashFields.put("del_tp_cd", "delTpCd");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("dir_call_flg", "dirCallFlg");
		this.hashFields.put("ts_port_cd", "tsPortCd");
		this.hashFields.put("prc_de_term_cd", "prcDeTermCd");
		this.hashFields.put("pod_tp_cd", "podTpCd");
		this.hashFields.put("scg_seq", "scgSeq");
		this.hashFields.put("io_ga_cd", "ioGaCd");
		this.hashFields.put("rat_ut_cd", "ratUtCd");
		this.hashFields.put("por_def_cd", "porDefCd");
		this.hashFields.put("scg_grp_cmdt_cd", "scgGrpCmdtCd");
		this.hashFields.put("soc_flg", "socFlg");
		this.hashFields.put("prc_rcv_term_cd", "prcRcvTermCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("pod_def_cd", "podDefCd");
		this.hashFields.put("prc_hngr_bar_tp_cd", "prcHngrBarTpCd");
		this.hashFields.put("min_cgo_wgt", "minCgoWgt");
		this.hashFields.put("scg_amt", "scgAmt");
		this.hashFields.put("por_tp_cd", "porTpCd");
		this.hashFields.put("pol_tp_cd", "polTpCd");
		this.hashFields.put("sub_trd_cd", "subTrdCd");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return scgRmk
	 */
	public String getScgRmk() {
		return this.scgRmk;
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
	 * @return prcCgoTpCd
	 */
	public String getPrcCgoTpCd() {
		return this.prcCgoTpCd;
	}
	
	/**
	 * Column Info
	 * @return deltFlg
	 */
	public String getDeltFlg() {
		return this.deltFlg;
	}
	
	/**
	 * Column Info
	 * @return scgImdgClssCd
	 */
	public String getScgImdgClssCd() {
		return this.scgImdgClssCd;
	}
	
	/**
	 * Column Info
	 * @return payTermCd
	 */
	public String getPayTermCd() {
		return this.payTermCd;
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
	 * @return orgTrspModCd
	 */
	public String getOrgTrspModCd() {
		return this.orgTrspModCd;
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
	 * @return wdrFlg
	 */
	public String getWdrFlg() {
		return this.wdrFlg;
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
	 * @return tmlCd
	 */
	public String getTmlCd() {
		return this.tmlCd;
	}
	
	/**
	 * Column Info
	 * @return chgCd
	 */
	public String getChgCd() {
		return this.chgCd;
	}
	
	/**
	 * Column Info
	 * @return polDefCd
	 */
	public String getPolDefCd() {
		return this.polDefCd;
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
	 * @return delDefCd
	 */
	public String getDelDefCd() {
		return this.delDefCd;
	}
	
	/**
	 * Column Info
	 * @return usaSvcModCd
	 */
	public String getUsaSvcModCd() {
		return this.usaSvcModCd;
	}
	
	/**
	 * Column Info
	 * @return effDt
	 */
	public String getEffDt() {
		return this.effDt;
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
	 * @return destTrspModCd
	 */
	public String getDestTrspModCd() {
		return this.destTrspModCd;
	}
	
	/**
	 * Column Info
	 * @return expDt
	 */
	public String getExpDt() {
		return this.expDt;
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
	 * @return maxCgoWgt
	 */
	public String getMaxCgoWgt() {
		return this.maxCgoWgt;
	}
	
	/**
	 * Column Info
	 * @return delTpCd
	 */
	public String getDelTpCd() {
		return this.delTpCd;
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
	 * @return dirCallFlg
	 */
	public String getDirCallFlg() {
		return this.dirCallFlg;
	}
	
	/**
	 * Column Info
	 * @return tsPortCd
	 */
	public String getTsPortCd() {
		return this.tsPortCd;
	}
	
	/**
	 * Column Info
	 * @return prcDeTermCd
	 */
	public String getPrcDeTermCd() {
		return this.prcDeTermCd;
	}
	
	/**
	 * Column Info
	 * @return podTpCd
	 */
	public String getPodTpCd() {
		return this.podTpCd;
	}
	
	/**
	 * Column Info
	 * @return scgSeq
	 */
	public String getScgSeq() {
		return this.scgSeq;
	}
	
	/**
	 * Column Info
	 * @return ioGaCd
	 */
	public String getIoGaCd() {
		return this.ioGaCd;
	}
	
	/**
	 * Column Info
	 * @return ratUtCd
	 */
	public String getRatUtCd() {
		return this.ratUtCd;
	}
	
	/**
	 * Column Info
	 * @return porDefCd
	 */
	public String getPorDefCd() {
		return this.porDefCd;
	}
	
	/**
	 * Column Info
	 * @return scgGrpCmdtCd
	 */
	public String getScgGrpCmdtCd() {
		return this.scgGrpCmdtCd;
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
	 * @return prcRcvTermCd
	 */
	public String getPrcRcvTermCd() {
		return this.prcRcvTermCd;
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
	 * @return podDefCd
	 */
	public String getPodDefCd() {
		return this.podDefCd;
	}
	
	/**
	 * Column Info
	 * @return prcHngrBarTpCd
	 */
	public String getPrcHngrBarTpCd() {
		return this.prcHngrBarTpCd;
	}
	
	/**
	 * Column Info
	 * @return minCgoWgt
	 */
	public String getMinCgoWgt() {
		return this.minCgoWgt;
	}
	
	/**
	 * Column Info
	 * @return scgAmt
	 */
	public String getScgAmt() {
		return this.scgAmt;
	}
	
	/**
	 * Column Info
	 * @return porTpCd
	 */
	public String getPorTpCd() {
		return this.porTpCd;
	}
	
	/**
	 * Column Info
	 * @return polTpCd
	 */
	public String getPolTpCd() {
		return this.polTpCd;
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
	 * @param scgRmk
	 */
	public void setScgRmk(String scgRmk) {
		this.scgRmk = scgRmk;
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
	 * @param prcCgoTpCd
	 */
	public void setPrcCgoTpCd(String prcCgoTpCd) {
		this.prcCgoTpCd = prcCgoTpCd;
	}
	
	/**
	 * Column Info
	 * @param deltFlg
	 */
	public void setDeltFlg(String deltFlg) {
		this.deltFlg = deltFlg;
	}
	
	/**
	 * Column Info
	 * @param scgImdgClssCd
	 */
	public void setScgImdgClssCd(String scgImdgClssCd) {
		this.scgImdgClssCd = scgImdgClssCd;
	}
	
	/**
	 * Column Info
	 * @param payTermCd
	 */
	public void setPayTermCd(String payTermCd) {
		this.payTermCd = payTermCd;
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
	 * @param orgTrspModCd
	 */
	public void setOrgTrspModCd(String orgTrspModCd) {
		this.orgTrspModCd = orgTrspModCd;
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
	 * @param wdrFlg
	 */
	public void setWdrFlg(String wdrFlg) {
		this.wdrFlg = wdrFlg;
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
	 * @param tmlCd
	 */
	public void setTmlCd(String tmlCd) {
		this.tmlCd = tmlCd;
	}
	
	/**
	 * Column Info
	 * @param chgCd
	 */
	public void setChgCd(String chgCd) {
		this.chgCd = chgCd;
	}
	
	/**
	 * Column Info
	 * @param polDefCd
	 */
	public void setPolDefCd(String polDefCd) {
		this.polDefCd = polDefCd;
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
	 * @param delDefCd
	 */
	public void setDelDefCd(String delDefCd) {
		this.delDefCd = delDefCd;
	}
	
	/**
	 * Column Info
	 * @param usaSvcModCd
	 */
	public void setUsaSvcModCd(String usaSvcModCd) {
		this.usaSvcModCd = usaSvcModCd;
	}
	
	/**
	 * Column Info
	 * @param effDt
	 */
	public void setEffDt(String effDt) {
		this.effDt = effDt;
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
	 * @param destTrspModCd
	 */
	public void setDestTrspModCd(String destTrspModCd) {
		this.destTrspModCd = destTrspModCd;
	}
	
	/**
	 * Column Info
	 * @param expDt
	 */
	public void setExpDt(String expDt) {
		this.expDt = expDt;
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
	 * @param maxCgoWgt
	 */
	public void setMaxCgoWgt(String maxCgoWgt) {
		this.maxCgoWgt = maxCgoWgt;
	}
	
	/**
	 * Column Info
	 * @param delTpCd
	 */
	public void setDelTpCd(String delTpCd) {
		this.delTpCd = delTpCd;
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
	 * @param dirCallFlg
	 */
	public void setDirCallFlg(String dirCallFlg) {
		this.dirCallFlg = dirCallFlg;
	}
	
	/**
	 * Column Info
	 * @param tsPortCd
	 */
	public void setTsPortCd(String tsPortCd) {
		this.tsPortCd = tsPortCd;
	}
	
	/**
	 * Column Info
	 * @param prcDeTermCd
	 */
	public void setPrcDeTermCd(String prcDeTermCd) {
		this.prcDeTermCd = prcDeTermCd;
	}
	
	/**
	 * Column Info
	 * @param podTpCd
	 */
	public void setPodTpCd(String podTpCd) {
		this.podTpCd = podTpCd;
	}
	
	/**
	 * Column Info
	 * @param scgSeq
	 */
	public void setScgSeq(String scgSeq) {
		this.scgSeq = scgSeq;
	}
	
	/**
	 * Column Info
	 * @param ioGaCd
	 */
	public void setIoGaCd(String ioGaCd) {
		this.ioGaCd = ioGaCd;
	}
	
	/**
	 * Column Info
	 * @param ratUtCd
	 */
	public void setRatUtCd(String ratUtCd) {
		this.ratUtCd = ratUtCd;
	}
	
	/**
	 * Column Info
	 * @param porDefCd
	 */
	public void setPorDefCd(String porDefCd) {
		this.porDefCd = porDefCd;
	}
	
	/**
	 * Column Info
	 * @param scgGrpCmdtCd
	 */
	public void setScgGrpCmdtCd(String scgGrpCmdtCd) {
		this.scgGrpCmdtCd = scgGrpCmdtCd;
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
	 * @param prcRcvTermCd
	 */
	public void setPrcRcvTermCd(String prcRcvTermCd) {
		this.prcRcvTermCd = prcRcvTermCd;
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
	 * @param podDefCd
	 */
	public void setPodDefCd(String podDefCd) {
		this.podDefCd = podDefCd;
	}
	
	/**
	 * Column Info
	 * @param prcHngrBarTpCd
	 */
	public void setPrcHngrBarTpCd(String prcHngrBarTpCd) {
		this.prcHngrBarTpCd = prcHngrBarTpCd;
	}
	
	/**
	 * Column Info
	 * @param minCgoWgt
	 */
	public void setMinCgoWgt(String minCgoWgt) {
		this.minCgoWgt = minCgoWgt;
	}
	
	/**
	 * Column Info
	 * @param scgAmt
	 */
	public void setScgAmt(String scgAmt) {
		this.scgAmt = scgAmt;
	}
	
	/**
	 * Column Info
	 * @param porTpCd
	 */
	public void setPorTpCd(String porTpCd) {
		this.porTpCd = porTpCd;
	}
	
	/**
	 * Column Info
	 * @param polTpCd
	 */
	public void setPolTpCd(String polTpCd) {
		this.polTpCd = polTpCd;
	}
	
	/**
	 * Column Info
	 * @param subTrdCd
	 */
	public void setSubTrdCd(String subTrdCd) {
		this.subTrdCd = subTrdCd;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setScgRmk(JSPUtil.getParameter(request, "scg_rmk", ""));
		setCurrCd(JSPUtil.getParameter(request, "curr_cd", ""));
		setPrcCgoTpCd(JSPUtil.getParameter(request, "prc_cgo_tp_cd", ""));
		setDeltFlg(JSPUtil.getParameter(request, "delt_flg", ""));
		setScgImdgClssCd(JSPUtil.getParameter(request, "scg_imdg_clss_cd", ""));
		setPayTermCd(JSPUtil.getParameter(request, "pay_term_cd", ""));
		setSvcScpCd(JSPUtil.getParameter(request, "svc_scp_cd", ""));
		setOrgTrspModCd(JSPUtil.getParameter(request, "org_trsp_mod_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setWdrFlg(JSPUtil.getParameter(request, "wdr_flg", ""));
		setVslSlanCd(JSPUtil.getParameter(request, "vsl_slan_cd", ""));
		setTmlCd(JSPUtil.getParameter(request, "tml_cd", ""));
		setChgCd(JSPUtil.getParameter(request, "chg_cd", ""));
		setPolDefCd(JSPUtil.getParameter(request, "pol_def_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setDelDefCd(JSPUtil.getParameter(request, "del_def_cd", ""));
		setUsaSvcModCd(JSPUtil.getParameter(request, "usa_svc_mod_cd", ""));
		setEffDt(JSPUtil.getParameter(request, "eff_dt", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCmdtCd(JSPUtil.getParameter(request, "cmdt_cd", ""));
		setDestTrspModCd(JSPUtil.getParameter(request, "dest_trsp_mod_cd", ""));
		setExpDt(JSPUtil.getParameter(request, "exp_dt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setMaxCgoWgt(JSPUtil.getParameter(request, "max_cgo_wgt", ""));
		setDelTpCd(JSPUtil.getParameter(request, "del_tp_cd", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setDirCallFlg(JSPUtil.getParameter(request, "dir_call_flg", ""));
		setTsPortCd(JSPUtil.getParameter(request, "ts_port_cd", ""));
		setPrcDeTermCd(JSPUtil.getParameter(request, "prc_de_term_cd", ""));
		setPodTpCd(JSPUtil.getParameter(request, "pod_tp_cd", ""));
		setScgSeq(JSPUtil.getParameter(request, "scg_seq", ""));
		setIoGaCd(JSPUtil.getParameter(request, "io_ga_cd", ""));
		setRatUtCd(JSPUtil.getParameter(request, "rat_ut_cd", ""));
		setPorDefCd(JSPUtil.getParameter(request, "por_def_cd", ""));
		setScgGrpCmdtCd(JSPUtil.getParameter(request, "scg_grp_cmdt_cd", ""));
		setSocFlg(JSPUtil.getParameter(request, "soc_flg", ""));
		setPrcRcvTermCd(JSPUtil.getParameter(request, "prc_rcv_term_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setPodDefCd(JSPUtil.getParameter(request, "pod_def_cd", ""));
		setPrcHngrBarTpCd(JSPUtil.getParameter(request, "prc_hngr_bar_tp_cd", ""));
		setMinCgoWgt(JSPUtil.getParameter(request, "min_cgo_wgt", ""));
		setScgAmt(JSPUtil.getParameter(request, "scg_amt", ""));
		setPorTpCd(JSPUtil.getParameter(request, "por_tp_cd", ""));
		setPolTpCd(JSPUtil.getParameter(request, "pol_tp_cd", ""));
		setSubTrdCd(JSPUtil.getParameter(request, "sub_trd_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return PriScgRtVO[]
	 */
	public PriScgRtVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return PriScgRtVO[]
	 */
	public PriScgRtVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		PriScgRtVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] scgRmk = (JSPUtil.getParameter(request, prefix	+ "scg_rmk", length));
			String[] currCd = (JSPUtil.getParameter(request, prefix	+ "curr_cd", length));
			String[] prcCgoTpCd = (JSPUtil.getParameter(request, prefix	+ "prc_cgo_tp_cd", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] scgImdgClssCd = (JSPUtil.getParameter(request, prefix	+ "scg_imdg_clss_cd", length));
			String[] payTermCd = (JSPUtil.getParameter(request, prefix	+ "pay_term_cd", length));
			String[] svcScpCd = (JSPUtil.getParameter(request, prefix	+ "svc_scp_cd", length));
			String[] orgTrspModCd = (JSPUtil.getParameter(request, prefix	+ "org_trsp_mod_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] wdrFlg = (JSPUtil.getParameter(request, prefix	+ "wdr_flg", length));
			String[] vslSlanCd = (JSPUtil.getParameter(request, prefix	+ "vsl_slan_cd", length));
			String[] tmlCd = (JSPUtil.getParameter(request, prefix	+ "tml_cd", length));
			String[] chgCd = (JSPUtil.getParameter(request, prefix	+ "chg_cd", length));
			String[] polDefCd = (JSPUtil.getParameter(request, prefix	+ "pol_def_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] delDefCd = (JSPUtil.getParameter(request, prefix	+ "del_def_cd", length));
			String[] usaSvcModCd = (JSPUtil.getParameter(request, prefix	+ "usa_svc_mod_cd", length));
			String[] effDt = (JSPUtil.getParameter(request, prefix	+ "eff_dt", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] cmdtCd = (JSPUtil.getParameter(request, prefix	+ "cmdt_cd", length));
			String[] destTrspModCd = (JSPUtil.getParameter(request, prefix	+ "dest_trsp_mod_cd", length));
			String[] expDt = (JSPUtil.getParameter(request, prefix	+ "exp_dt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] maxCgoWgt = (JSPUtil.getParameter(request, prefix	+ "max_cgo_wgt", length));
			String[] delTpCd = (JSPUtil.getParameter(request, prefix	+ "del_tp_cd", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] dirCallFlg = (JSPUtil.getParameter(request, prefix	+ "dir_call_flg", length));
			String[] tsPortCd = (JSPUtil.getParameter(request, prefix	+ "ts_port_cd", length));
			String[] prcDeTermCd = (JSPUtil.getParameter(request, prefix	+ "prc_de_term_cd", length));
			String[] podTpCd = (JSPUtil.getParameter(request, prefix	+ "pod_tp_cd", length));
			String[] scgSeq = (JSPUtil.getParameter(request, prefix	+ "scg_seq", length));
			String[] ioGaCd = (JSPUtil.getParameter(request, prefix	+ "io_ga_cd", length));
			String[] ratUtCd = (JSPUtil.getParameter(request, prefix	+ "rat_ut_cd", length));
			String[] porDefCd = (JSPUtil.getParameter(request, prefix	+ "por_def_cd", length));
			String[] scgGrpCmdtCd = (JSPUtil.getParameter(request, prefix	+ "scg_grp_cmdt_cd", length));
			String[] socFlg = (JSPUtil.getParameter(request, prefix	+ "soc_flg", length));
			String[] prcRcvTermCd = (JSPUtil.getParameter(request, prefix	+ "prc_rcv_term_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] podDefCd = (JSPUtil.getParameter(request, prefix	+ "pod_def_cd", length));
			String[] prcHngrBarTpCd = (JSPUtil.getParameter(request, prefix	+ "prc_hngr_bar_tp_cd", length));
			String[] minCgoWgt = (JSPUtil.getParameter(request, prefix	+ "min_cgo_wgt", length));
			String[] scgAmt = (JSPUtil.getParameter(request, prefix	+ "scg_amt", length));
			String[] porTpCd = (JSPUtil.getParameter(request, prefix	+ "por_tp_cd", length));
			String[] polTpCd = (JSPUtil.getParameter(request, prefix	+ "pol_tp_cd", length));
			String[] subTrdCd = (JSPUtil.getParameter(request, prefix	+ "sub_trd_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new PriScgRtVO();
				if (scgRmk[i] != null)
					model.setScgRmk(scgRmk[i]);
				if (currCd[i] != null)
					model.setCurrCd(currCd[i]);
				if (prcCgoTpCd[i] != null)
					model.setPrcCgoTpCd(prcCgoTpCd[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (scgImdgClssCd[i] != null)
					model.setScgImdgClssCd(scgImdgClssCd[i]);
				if (payTermCd[i] != null)
					model.setPayTermCd(payTermCd[i]);
				if (svcScpCd[i] != null)
					model.setSvcScpCd(svcScpCd[i]);
				if (orgTrspModCd[i] != null)
					model.setOrgTrspModCd(orgTrspModCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (wdrFlg[i] != null)
					model.setWdrFlg(wdrFlg[i]);
				if (vslSlanCd[i] != null)
					model.setVslSlanCd(vslSlanCd[i]);
				if (tmlCd[i] != null)
					model.setTmlCd(tmlCd[i]);
				if (chgCd[i] != null)
					model.setChgCd(chgCd[i]);
				if (polDefCd[i] != null)
					model.setPolDefCd(polDefCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (delDefCd[i] != null)
					model.setDelDefCd(delDefCd[i]);
				if (usaSvcModCd[i] != null)
					model.setUsaSvcModCd(usaSvcModCd[i]);
				if (effDt[i] != null)
					model.setEffDt(effDt[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (cmdtCd[i] != null)
					model.setCmdtCd(cmdtCd[i]);
				if (destTrspModCd[i] != null)
					model.setDestTrspModCd(destTrspModCd[i]);
				if (expDt[i] != null)
					model.setExpDt(expDt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (maxCgoWgt[i] != null)
					model.setMaxCgoWgt(maxCgoWgt[i]);
				if (delTpCd[i] != null)
					model.setDelTpCd(delTpCd[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (dirCallFlg[i] != null)
					model.setDirCallFlg(dirCallFlg[i]);
				if (tsPortCd[i] != null)
					model.setTsPortCd(tsPortCd[i]);
				if (prcDeTermCd[i] != null)
					model.setPrcDeTermCd(prcDeTermCd[i]);
				if (podTpCd[i] != null)
					model.setPodTpCd(podTpCd[i]);
				if (scgSeq[i] != null)
					model.setScgSeq(scgSeq[i]);
				if (ioGaCd[i] != null)
					model.setIoGaCd(ioGaCd[i]);
				if (ratUtCd[i] != null)
					model.setRatUtCd(ratUtCd[i]);
				if (porDefCd[i] != null)
					model.setPorDefCd(porDefCd[i]);
				if (scgGrpCmdtCd[i] != null)
					model.setScgGrpCmdtCd(scgGrpCmdtCd[i]);
				if (socFlg[i] != null)
					model.setSocFlg(socFlg[i]);
				if (prcRcvTermCd[i] != null)
					model.setPrcRcvTermCd(prcRcvTermCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (podDefCd[i] != null)
					model.setPodDefCd(podDefCd[i]);
				if (prcHngrBarTpCd[i] != null)
					model.setPrcHngrBarTpCd(prcHngrBarTpCd[i]);
				if (minCgoWgt[i] != null)
					model.setMinCgoWgt(minCgoWgt[i]);
				if (scgAmt[i] != null)
					model.setScgAmt(scgAmt[i]);
				if (porTpCd[i] != null)
					model.setPorTpCd(porTpCd[i]);
				if (polTpCd[i] != null)
					model.setPolTpCd(polTpCd[i]);
				if (subTrdCd[i] != null)
					model.setSubTrdCd(subTrdCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getPriScgRtVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return PriScgRtVO[]
	 */
	public PriScgRtVO[] getPriScgRtVOs(){
		PriScgRtVO[] vos = (PriScgRtVO[])models.toArray(new PriScgRtVO[models.size()]);
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
		this.scgRmk = this.scgRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.currCd = this.currCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prcCgoTpCd = this.prcCgoTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.scgImdgClssCd = this.scgImdgClssCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.payTermCd = this.payTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.svcScpCd = this.svcScpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgTrspModCd = this.orgTrspModCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.wdrFlg = this.wdrFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslSlanCd = this.vslSlanCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlCd = this.tmlCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chgCd = this.chgCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.polDefCd = this.polDefCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.delDefCd = this.delDefCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usaSvcModCd = this.usaSvcModCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.effDt = this.effDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cmdtCd = this.cmdtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.destTrspModCd = this.destTrspModCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.expDt = this.expDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.maxCgoWgt = this.maxCgoWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.delTpCd = this.delTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dirCallFlg = this.dirCallFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tsPortCd = this.tsPortCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prcDeTermCd = this.prcDeTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.podTpCd = this.podTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.scgSeq = this.scgSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ioGaCd = this.ioGaCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ratUtCd = this.ratUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.porDefCd = this.porDefCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.scgGrpCmdtCd = this.scgGrpCmdtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.socFlg = this.socFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prcRcvTermCd = this.prcRcvTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.podDefCd = this.podDefCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prcHngrBarTpCd = this.prcHngrBarTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.minCgoWgt = this.minCgoWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.scgAmt = this.scgAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.porTpCd = this.porTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.polTpCd = this.polTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.subTrdCd = this.subTrdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
