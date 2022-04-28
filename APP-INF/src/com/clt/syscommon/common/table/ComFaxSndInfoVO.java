/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ComFaxSndInfoVO.java
*@FileTitle : ComFaxSndInfoVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.17
*@LastModifier : 김정훈
*@LastVersion : 1.0
* 2009.07.17 김정훈 
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
 * @author 김정훈
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class ComFaxSndInfoVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<ComFaxSndInfoVO> models = new ArrayList<ComFaxSndInfoVO>();
	
	/* Column Info */
	private String rptFileNm = null;
	/* Column Info */
	private String xptRsltCd = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String faxTitNm = null;
	/* Column Info */
	private String ftpDt = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String faxRsltCd = null;
	/* Column Info */
	private String ftpRsltCd = null;
	/* Column Info */
	private String paraInfoCtnt = null;
	/* Column Info */
	private String batFlg = null;
	/* Column Info */
	private String rdApplCd = null;
	/* Column Info */
	private String faxDt = null;
	/* Column Info */
	private String xptErrDtlMsg = null;
	/* Column Info */
	private String xptDt = null;
	/* Column Info */
	private String faxErrMsg = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String faxIp = null;
	/* Column Info */
	private String xptErrMsg = null;
	/* Column Info */
	private String ofcCd = null;
	/* Column Info */
	private String thdId = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String rdSubSysCd = null;
	/* Column Info */
	private String rcvrInfoCtnt = null;
	/* Column Info */
	private String faxProcStsCd = null;
	/* Column Info */
	private String ttlPgKnt = null;
	/* Column Info */
	private String ftpErrMsg = null;
	/* Column Info */
	private String rdParaTpCd = null;
	/* Column Info */
	private String faxSndNo = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public ComFaxSndInfoVO() {}

	public ComFaxSndInfoVO(String ibflag, String pagerows, String faxSndNo, String rdSubSysCd, String rdApplCd, String batFlg, String faxTitNm, String faxProcStsCd, String paraInfoCtnt, String rdParaTpCd, String rcvrInfoCtnt, String ofcCd, String faxIp, String rptFileNm, String ttlPgKnt, String xptRsltCd, String xptDt, String xptErrMsg, String ftpRsltCd, String ftpDt, String ftpErrMsg, String faxRsltCd, String faxDt, String faxErrMsg, String deltFlg, String xptErrDtlMsg, String creUsrId, String creDt, String updUsrId, String updDt, String thdId) {
		this.rptFileNm = rptFileNm;
		this.xptRsltCd = xptRsltCd;
		this.deltFlg = deltFlg;
		this.creDt = creDt;
		this.faxTitNm = faxTitNm;
		this.ftpDt = ftpDt;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.faxRsltCd = faxRsltCd;
		this.ftpRsltCd = ftpRsltCd;
		this.paraInfoCtnt = paraInfoCtnt;
		this.batFlg = batFlg;
		this.rdApplCd = rdApplCd;
		this.faxDt = faxDt;
		this.xptErrDtlMsg = xptErrDtlMsg;
		this.xptDt = xptDt;
		this.faxErrMsg = faxErrMsg;
		this.updUsrId = updUsrId;
		this.updDt = updDt;
		this.faxIp = faxIp;
		this.xptErrMsg = xptErrMsg;
		this.ofcCd = ofcCd;
		this.thdId = thdId;
		this.creUsrId = creUsrId;
		this.rdSubSysCd = rdSubSysCd;
		this.rcvrInfoCtnt = rcvrInfoCtnt;
		this.faxProcStsCd = faxProcStsCd;
		this.ttlPgKnt = ttlPgKnt;
		this.ftpErrMsg = ftpErrMsg;
		this.rdParaTpCd = rdParaTpCd;
		this.faxSndNo = faxSndNo;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("rpt_file_nm", getRptFileNm());
		this.hashColumns.put("xpt_rslt_cd", getXptRsltCd());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("fax_tit_nm", getFaxTitNm());
		this.hashColumns.put("ftp_dt", getFtpDt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("fax_rslt_cd", getFaxRsltCd());
		this.hashColumns.put("ftp_rslt_cd", getFtpRsltCd());
		this.hashColumns.put("para_info_ctnt", getParaInfoCtnt());
		this.hashColumns.put("bat_flg", getBatFlg());
		this.hashColumns.put("rd_appl_cd", getRdApplCd());
		this.hashColumns.put("fax_dt", getFaxDt());
		this.hashColumns.put("xpt_err_dtl_msg", getXptErrDtlMsg());
		this.hashColumns.put("xpt_dt", getXptDt());
		this.hashColumns.put("fax_err_msg", getFaxErrMsg());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("fax_ip", getFaxIp());
		this.hashColumns.put("xpt_err_msg", getXptErrMsg());
		this.hashColumns.put("ofc_cd", getOfcCd());
		this.hashColumns.put("thd_id", getThdId());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("rd_sub_sys_cd", getRdSubSysCd());
		this.hashColumns.put("rcvr_info_ctnt", getRcvrInfoCtnt());
		this.hashColumns.put("fax_proc_sts_cd", getFaxProcStsCd());
		this.hashColumns.put("ttl_pg_knt", getTtlPgKnt());
		this.hashColumns.put("ftp_err_msg", getFtpErrMsg());
		this.hashColumns.put("rd_para_tp_cd", getRdParaTpCd());
		this.hashColumns.put("fax_snd_no", getFaxSndNo());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("rpt_file_nm", "rptFileNm");
		this.hashFields.put("xpt_rslt_cd", "xptRsltCd");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("fax_tit_nm", "faxTitNm");
		this.hashFields.put("ftp_dt", "ftpDt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("fax_rslt_cd", "faxRsltCd");
		this.hashFields.put("ftp_rslt_cd", "ftpRsltCd");
		this.hashFields.put("para_info_ctnt", "paraInfoCtnt");
		this.hashFields.put("bat_flg", "batFlg");
		this.hashFields.put("rd_appl_cd", "rdApplCd");
		this.hashFields.put("fax_dt", "faxDt");
		this.hashFields.put("xpt_err_dtl_msg", "xptErrDtlMsg");
		this.hashFields.put("xpt_dt", "xptDt");
		this.hashFields.put("fax_err_msg", "faxErrMsg");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("fax_ip", "faxIp");
		this.hashFields.put("xpt_err_msg", "xptErrMsg");
		this.hashFields.put("ofc_cd", "ofcCd");
		this.hashFields.put("thd_id", "thdId");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("rd_sub_sys_cd", "rdSubSysCd");
		this.hashFields.put("rcvr_info_ctnt", "rcvrInfoCtnt");
		this.hashFields.put("fax_proc_sts_cd", "faxProcStsCd");
		this.hashFields.put("ttl_pg_knt", "ttlPgKnt");
		this.hashFields.put("ftp_err_msg", "ftpErrMsg");
		this.hashFields.put("rd_para_tp_cd", "rdParaTpCd");
		this.hashFields.put("fax_snd_no", "faxSndNo");
		return this.hashFields;
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
	 * @return creDt
	 */
	public String getCreDt() {
		return this.creDt;
	}
	
	/**
	 * Column Info
	 * @return faxTitNm
	 */
	public String getFaxTitNm() {
		return this.faxTitNm;
	}
	
	/**
	 * Column Info
	 * @return ftpDt
	 */
	public String getFtpDt() {
		return this.ftpDt;
	}
	
	/**
	 * Page Number
	 * @return pagerows
	 */
	public String getPagerows() {
		return this.pagerows;
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
	 * @return faxRsltCd
	 */
	public String getFaxRsltCd() {
		return this.faxRsltCd;
	}
	
	/**
	 * Column Info
	 * @return ftpRsltCd
	 */
	public String getFtpRsltCd() {
		return this.ftpRsltCd;
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
	 * @return faxDt
	 */
	public String getFaxDt() {
		return this.faxDt;
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
	 * @return faxErrMsg
	 */
	public String getFaxErrMsg() {
		return this.faxErrMsg;
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
	 * @return faxIp
	 */
	public String getFaxIp() {
		return this.faxIp;
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
	 * @return ofcCd
	 */
	public String getOfcCd() {
		return this.ofcCd;
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
	 * @return rcvrInfoCtnt
	 */
	public String getRcvrInfoCtnt() {
		return this.rcvrInfoCtnt;
	}
	
	/**
	 * Column Info
	 * @return faxProcStsCd
	 */
	public String getFaxProcStsCd() {
		return this.faxProcStsCd;
	}
	
	/**
	 * Column Info
	 * @return ttlPgKnt
	 */
	public String getTtlPgKnt() {
		return this.ttlPgKnt;
	}
	
	/**
	 * Column Info
	 * @return ftpErrMsg
	 */
	public String getFtpErrMsg() {
		return this.ftpErrMsg;
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
	 * @return faxSndNo
	 */
	public String getFaxSndNo() {
		return this.faxSndNo;
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
	 * @param creDt
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
	}
	
	/**
	 * Column Info
	 * @param faxTitNm
	 */
	public void setFaxTitNm(String faxTitNm) {
		this.faxTitNm = faxTitNm;
	}
	
	/**
	 * Column Info
	 * @param ftpDt
	 */
	public void setFtpDt(String ftpDt) {
		this.ftpDt = ftpDt;
	}
	
	/**
	 * Page Number
	 * @param pagerows
	 */
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
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
	 * @param faxRsltCd
	 */
	public void setFaxRsltCd(String faxRsltCd) {
		this.faxRsltCd = faxRsltCd;
	}
	
	/**
	 * Column Info
	 * @param ftpRsltCd
	 */
	public void setFtpRsltCd(String ftpRsltCd) {
		this.ftpRsltCd = ftpRsltCd;
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
	 * @param faxDt
	 */
	public void setFaxDt(String faxDt) {
		this.faxDt = faxDt;
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
	 * @param faxErrMsg
	 */
	public void setFaxErrMsg(String faxErrMsg) {
		this.faxErrMsg = faxErrMsg;
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
	 * @param faxIp
	 */
	public void setFaxIp(String faxIp) {
		this.faxIp = faxIp;
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
	 * @param ofcCd
	 */
	public void setOfcCd(String ofcCd) {
		this.ofcCd = ofcCd;
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
	 * @param rcvrInfoCtnt
	 */
	public void setRcvrInfoCtnt(String rcvrInfoCtnt) {
		this.rcvrInfoCtnt = rcvrInfoCtnt;
	}
	
	/**
	 * Column Info
	 * @param faxProcStsCd
	 */
	public void setFaxProcStsCd(String faxProcStsCd) {
		this.faxProcStsCd = faxProcStsCd;
	}
	
	/**
	 * Column Info
	 * @param ttlPgKnt
	 */
	public void setTtlPgKnt(String ttlPgKnt) {
		this.ttlPgKnt = ttlPgKnt;
	}
	
	/**
	 * Column Info
	 * @param ftpErrMsg
	 */
	public void setFtpErrMsg(String ftpErrMsg) {
		this.ftpErrMsg = ftpErrMsg;
	}
	
	/**
	 * Column Info
	 * @param rdParaTpCd
	 */
	public void setRdParaTpCd(String rdParaTpCd) {
		this.rdParaTpCd = rdParaTpCd;
	}
	
	/**
	 * Column Info
	 * @param faxSndNo
	 */
	public void setFaxSndNo(String faxSndNo) {
		this.faxSndNo = faxSndNo;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setRptFileNm(JSPUtil.getParameter(request, "rpt_file_nm", ""));
		setXptRsltCd(JSPUtil.getParameter(request, "xpt_rslt_cd", ""));
		setDeltFlg(JSPUtil.getParameter(request, "delt_flg", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setFaxTitNm(JSPUtil.getParameter(request, "fax_tit_nm", ""));
		setFtpDt(JSPUtil.getParameter(request, "ftp_dt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setFaxRsltCd(JSPUtil.getParameter(request, "fax_rslt_cd", ""));
		setFtpRsltCd(JSPUtil.getParameter(request, "ftp_rslt_cd", ""));
		setParaInfoCtnt(JSPUtil.getParameter(request, "para_info_ctnt", ""));
		setBatFlg(JSPUtil.getParameter(request, "bat_flg", ""));
		setRdApplCd(JSPUtil.getParameter(request, "rd_appl_cd", ""));
		setFaxDt(JSPUtil.getParameter(request, "fax_dt", ""));
		setXptErrDtlMsg(JSPUtil.getParameter(request, "xpt_err_dtl_msg", ""));
		setXptDt(JSPUtil.getParameter(request, "xpt_dt", ""));
		setFaxErrMsg(JSPUtil.getParameter(request, "fax_err_msg", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setFaxIp(JSPUtil.getParameter(request, "fax_ip", ""));
		setXptErrMsg(JSPUtil.getParameter(request, "xpt_err_msg", ""));
		setOfcCd(JSPUtil.getParameter(request, "ofc_cd", ""));
		setThdId(JSPUtil.getParameter(request, "thd_id", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setRdSubSysCd(JSPUtil.getParameter(request, "rd_sub_sys_cd", ""));
		setRcvrInfoCtnt(JSPUtil.getParameter(request, "rcvr_info_ctnt", ""));
		setFaxProcStsCd(JSPUtil.getParameter(request, "fax_proc_sts_cd", ""));
		setTtlPgKnt(JSPUtil.getParameter(request, "ttl_pg_knt", ""));
		setFtpErrMsg(JSPUtil.getParameter(request, "ftp_err_msg", ""));
		setRdParaTpCd(JSPUtil.getParameter(request, "rd_para_tp_cd", ""));
		setFaxSndNo(JSPUtil.getParameter(request, "fax_snd_no", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return ComFaxSndInfoVO[]
	 */
	public ComFaxSndInfoVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return ComFaxSndInfoVO[]
	 */
	public ComFaxSndInfoVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		ComFaxSndInfoVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] rptFileNm = (JSPUtil.getParameter(request, prefix	+ "rpt_file_nm", length));
			String[] xptRsltCd = (JSPUtil.getParameter(request, prefix	+ "xpt_rslt_cd", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] faxTitNm = (JSPUtil.getParameter(request, prefix	+ "fax_tit_nm", length));
			String[] ftpDt = (JSPUtil.getParameter(request, prefix	+ "ftp_dt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] faxRsltCd = (JSPUtil.getParameter(request, prefix	+ "fax_rslt_cd", length));
			String[] ftpRsltCd = (JSPUtil.getParameter(request, prefix	+ "ftp_rslt_cd", length));
			String[] paraInfoCtnt = (JSPUtil.getParameter(request, prefix	+ "para_info_ctnt", length));
			String[] batFlg = (JSPUtil.getParameter(request, prefix	+ "bat_flg", length));
			String[] rdApplCd = (JSPUtil.getParameter(request, prefix	+ "rd_appl_cd", length));
			String[] faxDt = (JSPUtil.getParameter(request, prefix	+ "fax_dt", length));
			String[] xptErrDtlMsg = (JSPUtil.getParameter(request, prefix	+ "xpt_err_dtl_msg", length));
			String[] xptDt = (JSPUtil.getParameter(request, prefix	+ "xpt_dt", length));
			String[] faxErrMsg = (JSPUtil.getParameter(request, prefix	+ "fax_err_msg", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] faxIp = (JSPUtil.getParameter(request, prefix	+ "fax_ip", length));
			String[] xptErrMsg = (JSPUtil.getParameter(request, prefix	+ "xpt_err_msg", length));
			String[] ofcCd = (JSPUtil.getParameter(request, prefix	+ "ofc_cd", length));
			String[] thdId = (JSPUtil.getParameter(request, prefix	+ "thd_id", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] rdSubSysCd = (JSPUtil.getParameter(request, prefix	+ "rd_sub_sys_cd", length));
			String[] rcvrInfoCtnt = (JSPUtil.getParameter(request, prefix	+ "rcvr_info_ctnt", length));
			String[] faxProcStsCd = (JSPUtil.getParameter(request, prefix	+ "fax_proc_sts_cd", length));
			String[] ttlPgKnt = (JSPUtil.getParameter(request, prefix	+ "ttl_pg_knt", length));
			String[] ftpErrMsg = (JSPUtil.getParameter(request, prefix	+ "ftp_err_msg", length));
			String[] rdParaTpCd = (JSPUtil.getParameter(request, prefix	+ "rd_para_tp_cd", length));
			String[] faxSndNo = (JSPUtil.getParameter(request, prefix	+ "fax_snd_no", length));
			
			for (int i = 0; i < length; i++) {
				model = new ComFaxSndInfoVO();
				if (rptFileNm[i] != null)
					model.setRptFileNm(rptFileNm[i]);
				if (xptRsltCd[i] != null)
					model.setXptRsltCd(xptRsltCd[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (faxTitNm[i] != null)
					model.setFaxTitNm(faxTitNm[i]);
				if (ftpDt[i] != null)
					model.setFtpDt(ftpDt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (faxRsltCd[i] != null)
					model.setFaxRsltCd(faxRsltCd[i]);
				if (ftpRsltCd[i] != null)
					model.setFtpRsltCd(ftpRsltCd[i]);
				if (paraInfoCtnt[i] != null)
					model.setParaInfoCtnt(paraInfoCtnt[i]);
				if (batFlg[i] != null)
					model.setBatFlg(batFlg[i]);
				if (rdApplCd[i] != null)
					model.setRdApplCd(rdApplCd[i]);
				if (faxDt[i] != null)
					model.setFaxDt(faxDt[i]);
				if (xptErrDtlMsg[i] != null)
					model.setXptErrDtlMsg(xptErrDtlMsg[i]);
				if (xptDt[i] != null)
					model.setXptDt(xptDt[i]);
				if (faxErrMsg[i] != null)
					model.setFaxErrMsg(faxErrMsg[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (faxIp[i] != null)
					model.setFaxIp(faxIp[i]);
				if (xptErrMsg[i] != null)
					model.setXptErrMsg(xptErrMsg[i]);
				if (ofcCd[i] != null)
					model.setOfcCd(ofcCd[i]);
				if (thdId[i] != null)
					model.setThdId(thdId[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (rdSubSysCd[i] != null)
					model.setRdSubSysCd(rdSubSysCd[i]);
				if (rcvrInfoCtnt[i] != null)
					model.setRcvrInfoCtnt(rcvrInfoCtnt[i]);
				if (faxProcStsCd[i] != null)
					model.setFaxProcStsCd(faxProcStsCd[i]);
				if (ttlPgKnt[i] != null)
					model.setTtlPgKnt(ttlPgKnt[i]);
				if (ftpErrMsg[i] != null)
					model.setFtpErrMsg(ftpErrMsg[i]);
				if (rdParaTpCd[i] != null)
					model.setRdParaTpCd(rdParaTpCd[i]);
				if (faxSndNo[i] != null)
					model.setFaxSndNo(faxSndNo[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getComFaxSndInfoVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return ComFaxSndInfoVO[]
	 */
	public ComFaxSndInfoVO[] getComFaxSndInfoVOs(){
		ComFaxSndInfoVO[] vos = (ComFaxSndInfoVO[])models.toArray(new ComFaxSndInfoVO[models.size()]);
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
		this.rptFileNm = this.rptFileNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.xptRsltCd = this.xptRsltCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faxTitNm = this.faxTitNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ftpDt = this.ftpDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faxRsltCd = this.faxRsltCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ftpRsltCd = this.ftpRsltCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.paraInfoCtnt = this.paraInfoCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.batFlg = this.batFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rdApplCd = this.rdApplCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faxDt = this.faxDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.xptErrDtlMsg = this.xptErrDtlMsg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.xptDt = this.xptDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faxErrMsg = this.faxErrMsg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faxIp = this.faxIp .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.xptErrMsg = this.xptErrMsg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcCd = this.ofcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.thdId = this.thdId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rdSubSysCd = this.rdSubSysCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcvrInfoCtnt = this.rcvrInfoCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faxProcStsCd = this.faxProcStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ttlPgKnt = this.ttlPgKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ftpErrMsg = this.ftpErrMsg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rdParaTpCd = this.rdParaTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faxSndNo = this.faxSndNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
