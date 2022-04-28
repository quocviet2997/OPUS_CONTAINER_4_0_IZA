/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ComEmlSndInfoVO.java
*@FileTitle : ComEmlSndInfoVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.20
*@LastModifier : 
*@LastVersion : 1.0
* 2009.05.20  
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
 * - PDTO(Data Transfer Object including Parameters)<br>
 * - 관련 Event에서 작성, 서버실행요청시 PDTO의 역할을 수행하는 Value Object<br>
 *
 * @author 
 * @since J2EE 1.5
 * @see AbstractValueObject
 */

public class ComEmlSndInfoVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<ComEmlSndInfoVO> models = new ArrayList<ComEmlSndInfoVO>();
	
	/* Column Info */
	private String xptTpCd = null;
	/* Column Info */
	private String rptFileNm = null;
	/* Column Info */
	private String emlTitNm = null;
	/* Column Info */
	private String xptRsltCd = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String ccRcvrEml = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String sndrEml = null;
	/* Column Info */
	private String emlErrMsg = null;
	/* Column Info */
	private String emlCtnt = null;
	/* Column Info */
	private String bccRcvrEml = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String emlFilePathUrl = null;
	/* Column Info */
	private String emlProcStsCd = null;
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String tmpltFileNm = null;
	/* Column Info */
	private String paraInfoCtnt = null;
	/* Column Info */
	private String batFlg = null;
	/* Column Info */
	private String rdApplCd = null;
	/* Column Info */
	private String emlDt = null;
	/* Column Info */
	private String emlRsltCd = null;
	/* Column Info */
	private String xptErrDtlMsg = null;
	/* Column Info */
	private String xptDt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String emlSndNo = null;
	/* Column Info */
	private String emlTpCd = null;
	/* Column Info */
	private String xptErrMsg = null;
	/* Column Info */
	private String thdId = null;
	/* Column Info */
	private String rcvrEml = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String rdSubSysCd = null;
	/* Column Info */
	private String smtpIp = null;
	/* Column Info */
	private String sndrNm = null;
	/* Column Info */
	private String rdParaTpCd = null;

	/*	Table Column name으로 맴버변수 value 담는다*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	Table Column name으로 맴버변수 name 	담는다*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public ComEmlSndInfoVO() {}

	public ComEmlSndInfoVO(String ibflag, String pagerows, String emlSndNo, String rdSubSysCd, String rdApplCd, String batFlg, String emlTitNm, String emlCtnt, String emlProcStsCd, String paraInfoCtnt, String sndrNm, String sndrEml, String rcvrEml, String smtpIp, String rptFileNm, String xptRsltCd, String xptDt, String xptErrMsg, String emlRsltCd, String emlDt, String emlErrMsg, String deltFlg, String creUsrId, String creDt, String updUsrId, String updDt, String rdParaTpCd, String xptErrDtlMsg, String emlFilePathUrl, String thdId, String emlTpCd, String tmpltFileNm, String ccRcvrEml, String bccRcvrEml, String xptTpCd) {
		this.xptTpCd = xptTpCd;
		this.rptFileNm = rptFileNm;
		this.emlTitNm = emlTitNm;
		this.xptRsltCd = xptRsltCd;
		this.deltFlg = deltFlg;
		this.ccRcvrEml = ccRcvrEml;
		this.creDt = creDt;
		this.sndrEml = sndrEml;
		this.emlErrMsg = emlErrMsg;
		this.emlCtnt = emlCtnt;
		this.bccRcvrEml = bccRcvrEml;
		this.pagerows = pagerows;
		this.emlFilePathUrl = emlFilePathUrl;
		this.emlProcStsCd = emlProcStsCd;
		this.ibflag = ibflag;
		this.tmpltFileNm = tmpltFileNm;
		this.paraInfoCtnt = paraInfoCtnt;
		this.batFlg = batFlg;
		this.rdApplCd = rdApplCd;
		this.emlDt = emlDt;
		this.emlRsltCd = emlRsltCd;
		this.xptErrDtlMsg = xptErrDtlMsg;
		this.xptDt = xptDt;
		this.updUsrId = updUsrId;
		this.updDt = updDt;
		this.emlSndNo = emlSndNo;
		this.emlTpCd = emlTpCd;
		this.xptErrMsg = xptErrMsg;
		this.thdId = thdId;
		this.rcvrEml = rcvrEml;
		this.creUsrId = creUsrId;
		this.rdSubSysCd = rdSubSysCd;
		this.smtpIp = smtpIp;
		this.sndrNm = sndrNm;
		this.rdParaTpCd = rdParaTpCd;
	}
	
	/**
	 * Table Column name 으로 맴버변수에 value를 리턴한다.
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("xpt_tp_cd", getXptTpCd());
		this.hashColumns.put("rpt_file_nm", getRptFileNm());
		this.hashColumns.put("eml_tit_nm", getEmlTitNm());
		this.hashColumns.put("xpt_rslt_cd", getXptRsltCd());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("cc_rcvr_eml", getCcRcvrEml());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("sndr_eml", getSndrEml());
		this.hashColumns.put("eml_err_msg", getEmlErrMsg());
		this.hashColumns.put("eml_ctnt", getEmlCtnt());
		this.hashColumns.put("bcc_rcvr_eml", getBccRcvrEml());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("eml_file_path_url", getEmlFilePathUrl());
		this.hashColumns.put("eml_proc_sts_cd", getEmlProcStsCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("tmplt_file_nm", getTmpltFileNm());
		this.hashColumns.put("para_info_ctnt", getParaInfoCtnt());
		this.hashColumns.put("bat_flg", getBatFlg());
		this.hashColumns.put("rd_appl_cd", getRdApplCd());
		this.hashColumns.put("eml_dt", getEmlDt());
		this.hashColumns.put("eml_rslt_cd", getEmlRsltCd());
		this.hashColumns.put("xpt_err_dtl_msg", getXptErrDtlMsg());
		this.hashColumns.put("xpt_dt", getXptDt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("eml_snd_no", getEmlSndNo());
		this.hashColumns.put("eml_tp_cd", getEmlTpCd());
		this.hashColumns.put("xpt_err_msg", getXptErrMsg());
		this.hashColumns.put("thd_id", getThdId());
		this.hashColumns.put("rcvr_eml", getRcvrEml());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("rd_sub_sys_cd", getRdSubSysCd());
		this.hashColumns.put("smtp_ip", getSmtpIp());
		this.hashColumns.put("sndr_nm", getSndrNm());
		this.hashColumns.put("rd_para_tp_cd", getRdParaTpCd());
		return this.hashColumns;
	}
	
	/**
	 * Table Column name 으로 맴버변수를 호출한다
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("xpt_tp_cd", "xptTpCd");
		this.hashFields.put("rpt_file_nm", "rptFileNm");
		this.hashFields.put("eml_tit_nm", "emlTitNm");
		this.hashFields.put("xpt_rslt_cd", "xptRsltCd");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("cc_rcvr_eml", "ccRcvrEml");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("sndr_eml", "sndrEml");
		this.hashFields.put("eml_err_msg", "emlErrMsg");
		this.hashFields.put("eml_ctnt", "emlCtnt");
		this.hashFields.put("bcc_rcvr_eml", "bccRcvrEml");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("eml_file_path_url", "emlFilePathUrl");
		this.hashFields.put("eml_proc_sts_cd", "emlProcStsCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("tmplt_file_nm", "tmpltFileNm");
		this.hashFields.put("para_info_ctnt", "paraInfoCtnt");
		this.hashFields.put("bat_flg", "batFlg");
		this.hashFields.put("rd_appl_cd", "rdApplCd");
		this.hashFields.put("eml_dt", "emlDt");
		this.hashFields.put("eml_rslt_cd", "emlRsltCd");
		this.hashFields.put("xpt_err_dtl_msg", "xptErrDtlMsg");
		this.hashFields.put("xpt_dt", "xptDt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("eml_snd_no", "emlSndNo");
		this.hashFields.put("eml_tp_cd", "emlTpCd");
		this.hashFields.put("xpt_err_msg", "xptErrMsg");
		this.hashFields.put("thd_id", "thdId");
		this.hashFields.put("rcvr_eml", "rcvrEml");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("rd_sub_sys_cd", "rdSubSysCd");
		this.hashFields.put("smtp_ip", "smtpIp");
		this.hashFields.put("sndr_nm", "sndrNm");
		this.hashFields.put("rd_para_tp_cd", "rdParaTpCd");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return xptTpCd
	 */
	public String getXptTpCd() {
		return this.xptTpCd;
	}
	
	/**
	 * Column Info
	 * @return rptFileNm
	 */
	public String getRptFileNm() {
		return this.rptFileNm;
	}
	
	/**
	 * Column Info
	 * @return emlTitNm
	 */
	public String getEmlTitNm() {
		return this.emlTitNm;
	}
	
	/**
	 * Column Info
	 * @return xptRsltCd
	 */
	public String getXptRsltCd() {
		return this.xptRsltCd;
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
	 * @return ccRcvrEml
	 */
	public String getCcRcvrEml() {
		return this.ccRcvrEml;
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
	 * @return sndrEml
	 */
	public String getSndrEml() {
		return this.sndrEml;
	}
	
	/**
	 * Column Info
	 * @return emlErrMsg
	 */
	public String getEmlErrMsg() {
		return this.emlErrMsg;
	}
	
	/**
	 * Column Info
	 * @return emlCtnt
	 */
	public String getEmlCtnt() {
		return this.emlCtnt;
	}
	
	/**
	 * Column Info
	 * @return bccRcvrEml
	 */
	public String getBccRcvrEml() {
		return this.bccRcvrEml;
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
	 * @return emlFilePathUrl
	 */
	public String getEmlFilePathUrl() {
		return this.emlFilePathUrl;
	}
	
	/**
	 * Column Info
	 * @return emlProcStsCd
	 */
	public String getEmlProcStsCd() {
		return this.emlProcStsCd;
	}
	
	/**
	 * Status
	 * @return ibflag
	 */
	public String getIbflag() {
		return this.ibflag;
	}
	
	/**
	 * Column Info
	 * @return tmpltFileNm
	 */
	public String getTmpltFileNm() {
		return this.tmpltFileNm;
	}
	
	/**
	 * Column Info
	 * @return paraInfoCtnt
	 */
	public String getParaInfoCtnt() {
		return this.paraInfoCtnt;
	}
	
	/**
	 * Column Info
	 * @return batFlg
	 */
	public String getBatFlg() {
		return this.batFlg;
	}
	
	/**
	 * Column Info
	 * @return rdApplCd
	 */
	public String getRdApplCd() {
		return this.rdApplCd;
	}
	
	/**
	 * Column Info
	 * @return emlDt
	 */
	public String getEmlDt() {
		return this.emlDt;
	}
	
	/**
	 * Column Info
	 * @return emlRsltCd
	 */
	public String getEmlRsltCd() {
		return this.emlRsltCd;
	}
	
	/**
	 * Column Info
	 * @return xptErrDtlMsg
	 */
	public String getXptErrDtlMsg() {
		return this.xptErrDtlMsg;
	}
	
	/**
	 * Column Info
	 * @return xptDt
	 */
	public String getXptDt() {
		return this.xptDt;
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
	 * @return updDt
	 */
	public String getUpdDt() {
		return this.updDt;
	}
	
	/**
	 * Column Info
	 * @return emlSndNo
	 */
	public String getEmlSndNo() {
		return this.emlSndNo;
	}
	
	/**
	 * Column Info
	 * @return emlTpCd
	 */
	public String getEmlTpCd() {
		return this.emlTpCd;
	}
	
	/**
	 * Column Info
	 * @return xptErrMsg
	 */
	public String getXptErrMsg() {
		return this.xptErrMsg;
	}
	
	/**
	 * Column Info
	 * @return thdId
	 */
	public String getThdId() {
		return this.thdId;
	}
	
	/**
	 * Column Info
	 * @return rcvrEml
	 */
	public String getRcvrEml() {
		return this.rcvrEml;
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
	 * @return rdSubSysCd
	 */
	public String getRdSubSysCd() {
		return this.rdSubSysCd;
	}
	
	/**
	 * Column Info
	 * @return smtpIp
	 */
	public String getSmtpIp() {
		return this.smtpIp;
	}
	
	/**
	 * Column Info
	 * @return sndrNm
	 */
	public String getSndrNm() {
		return this.sndrNm;
	}
	
	/**
	 * Column Info
	 * @return rdParaTpCd
	 */
	public String getRdParaTpCd() {
		return this.rdParaTpCd;
	}
	

	/**
	 * Column Info
	 * @param xptTpCd
	 */
	public void setXptTpCd(String xptTpCd) {
		this.xptTpCd = xptTpCd;
	}
	
	/**
	 * Column Info
	 * @param rptFileNm
	 */
	public void setRptFileNm(String rptFileNm) {
		this.rptFileNm = rptFileNm;
	}
	
	/**
	 * Column Info
	 * @param emlTitNm
	 */
	public void setEmlTitNm(String emlTitNm) {
		this.emlTitNm = emlTitNm;
	}
	
	/**
	 * Column Info
	 * @param xptRsltCd
	 */
	public void setXptRsltCd(String xptRsltCd) {
		this.xptRsltCd = xptRsltCd;
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
	 * @param ccRcvrEml
	 */
	public void setCcRcvrEml(String ccRcvrEml) {
		this.ccRcvrEml = ccRcvrEml;
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
	 * @param sndrEml
	 */
	public void setSndrEml(String sndrEml) {
		this.sndrEml = sndrEml;
	}
	
	/**
	 * Column Info
	 * @param emlErrMsg
	 */
	public void setEmlErrMsg(String emlErrMsg) {
		this.emlErrMsg = emlErrMsg;
	}
	
	/**
	 * Column Info
	 * @param emlCtnt
	 */
	public void setEmlCtnt(String emlCtnt) {
		this.emlCtnt = emlCtnt;
	}
	
	/**
	 * Column Info
	 * @param bccRcvrEml
	 */
	public void setBccRcvrEml(String bccRcvrEml) {
		this.bccRcvrEml = bccRcvrEml;
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
	 * @param emlFilePathUrl
	 */
	public void setEmlFilePathUrl(String emlFilePathUrl) {
		this.emlFilePathUrl = emlFilePathUrl;
	}
	
	/**
	 * Column Info
	 * @param emlProcStsCd
	 */
	public void setEmlProcStsCd(String emlProcStsCd) {
		this.emlProcStsCd = emlProcStsCd;
	}
	
	/**
	 * Status
	 * @param ibflag
	 */
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
	}
	
	/**
	 * Column Info
	 * @param tmpltFileNm
	 */
	public void setTmpltFileNm(String tmpltFileNm) {
		this.tmpltFileNm = tmpltFileNm;
	}
	
	/**
	 * Column Info
	 * @param paraInfoCtnt
	 */
	public void setParaInfoCtnt(String paraInfoCtnt) {
		this.paraInfoCtnt = paraInfoCtnt;
	}
	
	/**
	 * Column Info
	 * @param batFlg
	 */
	public void setBatFlg(String batFlg) {
		this.batFlg = batFlg;
	}
	
	/**
	 * Column Info
	 * @param rdApplCd
	 */
	public void setRdApplCd(String rdApplCd) {
		this.rdApplCd = rdApplCd;
	}
	
	/**
	 * Column Info
	 * @param emlDt
	 */
	public void setEmlDt(String emlDt) {
		this.emlDt = emlDt;
	}
	
	/**
	 * Column Info
	 * @param emlRsltCd
	 */
	public void setEmlRsltCd(String emlRsltCd) {
		this.emlRsltCd = emlRsltCd;
	}
	
	/**
	 * Column Info
	 * @param xptErrDtlMsg
	 */
	public void setXptErrDtlMsg(String xptErrDtlMsg) {
		this.xptErrDtlMsg = xptErrDtlMsg;
	}
	
	/**
	 * Column Info
	 * @param xptDt
	 */
	public void setXptDt(String xptDt) {
		this.xptDt = xptDt;
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
	 * @param updDt
	 */
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
	}
	
	/**
	 * Column Info
	 * @param emlSndNo
	 */
	public void setEmlSndNo(String emlSndNo) {
		this.emlSndNo = emlSndNo;
	}
	
	/**
	 * Column Info
	 * @param emlTpCd
	 */
	public void setEmlTpCd(String emlTpCd) {
		this.emlTpCd = emlTpCd;
	}
	
	/**
	 * Column Info
	 * @param xptErrMsg
	 */
	public void setXptErrMsg(String xptErrMsg) {
		this.xptErrMsg = xptErrMsg;
	}
	
	/**
	 * Column Info
	 * @param thdId
	 */
	public void setThdId(String thdId) {
		this.thdId = thdId;
	}
	
	/**
	 * Column Info
	 * @param rcvrEml
	 */
	public void setRcvrEml(String rcvrEml) {
		this.rcvrEml = rcvrEml;
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
	 * @param rdSubSysCd
	 */
	public void setRdSubSysCd(String rdSubSysCd) {
		this.rdSubSysCd = rdSubSysCd;
	}
	
	/**
	 * Column Info
	 * @param smtpIp
	 */
	public void setSmtpIp(String smtpIp) {
		this.smtpIp = smtpIp;
	}
	
	/**
	 * Column Info
	 * @param sndrNm
	 */
	public void setSndrNm(String sndrNm) {
		this.sndrNm = sndrNm;
	}
	
	/**
	 * Column Info
	 * @param rdParaTpCd
	 */
	public void setRdParaTpCd(String rdParaTpCd) {
		this.rdParaTpCd = rdParaTpCd;
	}
	
	/**
	 * Request 넘어온 단건 DATA를 VO Class 에 담는다. 
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setXptTpCd(JSPUtil.getParameter(request, "xpt_tp_cd", ""));
		setRptFileNm(JSPUtil.getParameter(request, "rpt_file_nm", ""));
		setEmlTitNm(JSPUtil.getParameter(request, "eml_tit_nm", ""));
		setXptRsltCd(JSPUtil.getParameter(request, "xpt_rslt_cd", ""));
		setDeltFlg(JSPUtil.getParameter(request, "delt_flg", ""));
		setCcRcvrEml(JSPUtil.getParameter(request, "cc_rcvr_eml", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setSndrEml(JSPUtil.getParameter(request, "sndr_eml", ""));
		setEmlErrMsg(JSPUtil.getParameter(request, "eml_err_msg", ""));
		setEmlCtnt(JSPUtil.getParameter(request, "eml_ctnt", ""));
		setBccRcvrEml(JSPUtil.getParameter(request, "bcc_rcvr_eml", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setEmlFilePathUrl(JSPUtil.getParameter(request, "eml_file_path_url", ""));
		setEmlProcStsCd(JSPUtil.getParameter(request, "eml_proc_sts_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setTmpltFileNm(JSPUtil.getParameter(request, "tmplt_file_nm", ""));
		setParaInfoCtnt(JSPUtil.getParameter(request, "para_info_ctnt", ""));
		setBatFlg(JSPUtil.getParameter(request, "bat_flg", ""));
		setRdApplCd(JSPUtil.getParameter(request, "rd_appl_cd", ""));
		setEmlDt(JSPUtil.getParameter(request, "eml_dt", ""));
		setEmlRsltCd(JSPUtil.getParameter(request, "eml_rslt_cd", ""));
		setXptErrDtlMsg(JSPUtil.getParameter(request, "xpt_err_dtl_msg", ""));
		setXptDt(JSPUtil.getParameter(request, "xpt_dt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setEmlSndNo(JSPUtil.getParameter(request, "eml_snd_no", ""));
		setEmlTpCd(JSPUtil.getParameter(request, "eml_tp_cd", ""));
		setXptErrMsg(JSPUtil.getParameter(request, "xpt_err_msg", ""));
		setThdId(JSPUtil.getParameter(request, "thd_id", ""));
		setRcvrEml(JSPUtil.getParameter(request, "rcvr_eml", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setRdSubSysCd(JSPUtil.getParameter(request, "rd_sub_sys_cd", ""));
		setSmtpIp(JSPUtil.getParameter(request, "smtp_ip", ""));
		setSndrNm(JSPUtil.getParameter(request, "sndr_nm", ""));
		setRdParaTpCd(JSPUtil.getParameter(request, "rd_para_tp_cd", ""));
	}

	/**
	 * Request를 VO Class를 담는다.
	 * @param request
	 * @return ComEmlSndInfoVO[]
	 */
	public ComEmlSndInfoVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return ComEmlSndInfoVO[]
	 */
	public ComEmlSndInfoVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		ComEmlSndInfoVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] xptTpCd = (JSPUtil.getParameter(request, prefix	+ "xpt_tp_cd".trim(), length));
			String[] rptFileNm = (JSPUtil.getParameter(request, prefix	+ "rpt_file_nm".trim(), length));
			String[] emlTitNm = (JSPUtil.getParameter(request, prefix	+ "eml_tit_nm".trim(), length));
			String[] xptRsltCd = (JSPUtil.getParameter(request, prefix	+ "xpt_rslt_cd".trim(), length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg".trim(), length));
			String[] ccRcvrEml = (JSPUtil.getParameter(request, prefix	+ "cc_rcvr_eml".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] sndrEml = (JSPUtil.getParameter(request, prefix	+ "sndr_eml".trim(), length));
			String[] emlErrMsg = (JSPUtil.getParameter(request, prefix	+ "eml_err_msg".trim(), length));
			String[] emlCtnt = (JSPUtil.getParameter(request, prefix	+ "eml_ctnt".trim(), length));
			String[] bccRcvrEml = (JSPUtil.getParameter(request, prefix	+ "bcc_rcvr_eml".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] emlFilePathUrl = (JSPUtil.getParameter(request, prefix	+ "eml_file_path_url".trim(), length));
			String[] emlProcStsCd = (JSPUtil.getParameter(request, prefix	+ "eml_proc_sts_cd".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] tmpltFileNm = (JSPUtil.getParameter(request, prefix	+ "tmplt_file_nm".trim(), length));
			String[] paraInfoCtnt = (JSPUtil.getParameter(request, prefix	+ "para_info_ctnt".trim(), length));
			String[] batFlg = (JSPUtil.getParameter(request, prefix	+ "bat_flg".trim(), length));
			String[] rdApplCd = (JSPUtil.getParameter(request, prefix	+ "rd_appl_cd".trim(), length));
			String[] emlDt = (JSPUtil.getParameter(request, prefix	+ "eml_dt".trim(), length));
			String[] emlRsltCd = (JSPUtil.getParameter(request, prefix	+ "eml_rslt_cd".trim(), length));
			String[] xptErrDtlMsg = (JSPUtil.getParameter(request, prefix	+ "xpt_err_dtl_msg".trim(), length));
			String[] xptDt = (JSPUtil.getParameter(request, prefix	+ "xpt_dt".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] emlSndNo = (JSPUtil.getParameter(request, prefix	+ "eml_snd_no".trim(), length));
			String[] emlTpCd = (JSPUtil.getParameter(request, prefix	+ "eml_tp_cd".trim(), length));
			String[] xptErrMsg = (JSPUtil.getParameter(request, prefix	+ "xpt_err_msg".trim(), length));
			String[] thdId = (JSPUtil.getParameter(request, prefix	+ "thd_id".trim(), length));
			String[] rcvrEml = (JSPUtil.getParameter(request, prefix	+ "rcvr_eml".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] rdSubSysCd = (JSPUtil.getParameter(request, prefix	+ "rd_sub_sys_cd".trim(), length));
			String[] smtpIp = (JSPUtil.getParameter(request, prefix	+ "smtp_ip".trim(), length));
			String[] sndrNm = (JSPUtil.getParameter(request, prefix	+ "sndr_nm".trim(), length));
			String[] rdParaTpCd = (JSPUtil.getParameter(request, prefix	+ "rd_para_tp_cd".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new ComEmlSndInfoVO();
				if (xptTpCd[i] != null)
					model.setXptTpCd(xptTpCd[i]);
				if (rptFileNm[i] != null)
					model.setRptFileNm(rptFileNm[i]);
				if (emlTitNm[i] != null)
					model.setEmlTitNm(emlTitNm[i]);
				if (xptRsltCd[i] != null)
					model.setXptRsltCd(xptRsltCd[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (ccRcvrEml[i] != null)
					model.setCcRcvrEml(ccRcvrEml[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (sndrEml[i] != null)
					model.setSndrEml(sndrEml[i]);
				if (emlErrMsg[i] != null)
					model.setEmlErrMsg(emlErrMsg[i]);
				if (emlCtnt[i] != null)
					model.setEmlCtnt(emlCtnt[i]);
				if (bccRcvrEml[i] != null)
					model.setBccRcvrEml(bccRcvrEml[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (emlFilePathUrl[i] != null)
					model.setEmlFilePathUrl(emlFilePathUrl[i]);
				if (emlProcStsCd[i] != null)
					model.setEmlProcStsCd(emlProcStsCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (tmpltFileNm[i] != null)
					model.setTmpltFileNm(tmpltFileNm[i]);
				if (paraInfoCtnt[i] != null)
					model.setParaInfoCtnt(paraInfoCtnt[i]);
				if (batFlg[i] != null)
					model.setBatFlg(batFlg[i]);
				if (rdApplCd[i] != null)
					model.setRdApplCd(rdApplCd[i]);
				if (emlDt[i] != null)
					model.setEmlDt(emlDt[i]);
				if (emlRsltCd[i] != null)
					model.setEmlRsltCd(emlRsltCd[i]);
				if (xptErrDtlMsg[i] != null)
					model.setXptErrDtlMsg(xptErrDtlMsg[i]);
				if (xptDt[i] != null)
					model.setXptDt(xptDt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (emlSndNo[i] != null)
					model.setEmlSndNo(emlSndNo[i]);
				if (emlTpCd[i] != null)
					model.setEmlTpCd(emlTpCd[i]);
				if (xptErrMsg[i] != null)
					model.setXptErrMsg(xptErrMsg[i]);
				if (thdId[i] != null)
					model.setThdId(thdId[i]);
				if (rcvrEml[i] != null)
					model.setRcvrEml(rcvrEml[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (rdSubSysCd[i] != null)
					model.setRdSubSysCd(rdSubSysCd[i]);
				if (smtpIp[i] != null)
					model.setSmtpIp(smtpIp[i]);
				if (sndrNm[i] != null)
					model.setSndrNm(sndrNm[i]);
				if (rdParaTpCd[i] != null)
					model.setRdParaTpCd(rdParaTpCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getComEmlSndInfoVOs();
	}

	/**
	 * 여러 VO Calss를 배열화 한다 
	 * @return ComEmlSndInfoVO[]
	 */
	public ComEmlSndInfoVO[] getComEmlSndInfoVOs(){
		ComEmlSndInfoVO[] vos = (ComEmlSndInfoVO[])models.toArray(new ComEmlSndInfoVO[models.size()]);
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
	 * 각 클래스 해당하는 필드 정보를 배열에 담는다 
	 * @param field
	 * @param i
	 * @return String[]
	 */
	private String[] getField(Field[] field, int i) {
		String[] arr = null;
		try{
			arr = (String[]) field[i].get(this);
		}catch(Exception ex){
			arr = getFieldCatct(field, i, arr);
		}
		return arr;
	}
	
	/**
	 * getField 에서 catch문에 대한 로직
	 * @param field
	 * @param i
	 * @param arr
	 * @return arr
	 */
	private String[] getFieldCatct(Field[] field, int i, String[] arr) {
		try {
			arr = new String[1];
			arr[0] = String.valueOf(field[i].get(this));
		} catch (IllegalAccessException e) {
			return null;
		}
		return arr;
	}
	
	/**
	* DataFormat 설정
	*/
	public void unDataFormat(){
		this.xptTpCd = this.xptTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rptFileNm = this.rptFileNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.emlTitNm = this.emlTitNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.xptRsltCd = this.xptRsltCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ccRcvrEml = this.ccRcvrEml .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sndrEml = this.sndrEml .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.emlErrMsg = this.emlErrMsg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.emlCtnt = this.emlCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bccRcvrEml = this.bccRcvrEml .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.emlFilePathUrl = this.emlFilePathUrl .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.emlProcStsCd = this.emlProcStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmpltFileNm = this.tmpltFileNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.paraInfoCtnt = this.paraInfoCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.batFlg = this.batFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rdApplCd = this.rdApplCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.emlDt = this.emlDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.emlRsltCd = this.emlRsltCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.xptErrDtlMsg = this.xptErrDtlMsg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.xptDt = this.xptDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.emlSndNo = this.emlSndNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.emlTpCd = this.emlTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.xptErrMsg = this.xptErrMsg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.thdId = this.thdId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcvrEml = this.rcvrEml .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rdSubSysCd = this.rdSubSysCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.smtpIp = this.smtpIp .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sndrNm = this.sndrNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rdParaTpCd = this.rdParaTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
