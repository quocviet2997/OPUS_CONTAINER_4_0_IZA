/*=========================================================
*Copyright(c) 2016 CyberLogitec
*@FileName : InfoVO.java
*@FileTitle : InfoVO
*Open Issues :
*Change history :
*@LastModifyDate : 2016.03.21
*@LastModifier : 
*@LastVersion : 1.0
* 2016.03.21  
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.management.opus.mailmonitoring.vo;

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

public class InfoVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<InfoVO> models = new ArrayList<InfoVO>();
	
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String rptSplitCapa = null;
	/* Column Info */
	private String emlSndNo = null;
	/* Column Info */
	private String batFlg = null;
	/* Column Info */
	private String sndrEml = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String emlSplitCapa = null;
	/* Column Info */
	private String rptMrgFileNm = null;
	/* Column Info */
	private String applSvrNm = null;
	/* Column Info */
	private String rptMrgFlg = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String emlTitNm = null;
	/* Column Info */
	private String toEmlCtnt = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String rptSplitQty = null;
	/* Column Info */
	private String smtpIp = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String rdSubSysCd = null;
	/* Column Info */
	private String ccEmlCtnt = null;
	/* Column Info */
	private String bccEmlCtnt = null;
	/* Column Info */
	private String sndrNm = null;
	/* Column Info */
	private String emlDt = null;
	/* Column Info */
	private String thdId = null;
	/* Column Info */
	private String emlErrMsg = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String emlProcStsCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new LinkedHashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new LinkedHashMap<String, String>();
	
	public InfoVO() {}

	public InfoVO(String ibflag, String pagerows, String emlSndNo, String rdSubSysCd, String batFlg, String emlTitNm, String emlProcStsCd, String sndrNm, String sndrEml, String toEmlCtnt, String smtpIp, String emlDt, String emlErrMsg, String deltFlg, String thdId, String ccEmlCtnt, String bccEmlCtnt, String rptMrgFlg, String rptMrgFileNm, String rptSplitCapa, String rptSplitQty, String emlSplitCapa, String creUsrId, String creDt, String updUsrId, String updDt, String applSvrNm) {
		this.ibflag = ibflag;
		this.rptSplitCapa = rptSplitCapa;
		this.emlSndNo = emlSndNo;
		this.batFlg = batFlg;
		this.sndrEml = sndrEml;
		this.updUsrId = updUsrId;
		this.creUsrId = creUsrId;
		this.emlSplitCapa = emlSplitCapa;
		this.rptMrgFileNm = rptMrgFileNm;
		this.applSvrNm = applSvrNm;
		this.rptMrgFlg = rptMrgFlg;
		this.pagerows = pagerows;
		this.emlTitNm = emlTitNm;
		this.toEmlCtnt = toEmlCtnt;
		this.deltFlg = deltFlg;
		this.rptSplitQty = rptSplitQty;
		this.smtpIp = smtpIp;
		this.creDt = creDt;
		this.rdSubSysCd = rdSubSysCd;
		this.ccEmlCtnt = ccEmlCtnt;
		this.bccEmlCtnt = bccEmlCtnt;
		this.sndrNm = sndrNm;
		this.emlDt = emlDt;
		this.thdId = thdId;
		this.emlErrMsg = emlErrMsg;
		this.updDt = updDt;
		this.emlProcStsCd = emlProcStsCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("rpt_split_capa", getRptSplitCapa());
		this.hashColumns.put("eml_snd_no", getEmlSndNo());
		this.hashColumns.put("bat_flg", getBatFlg());
		this.hashColumns.put("sndr_eml", getSndrEml());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("eml_split_capa", getEmlSplitCapa());
		this.hashColumns.put("rpt_mrg_file_nm", getRptMrgFileNm());
		this.hashColumns.put("appl_svr_nm", getApplSvrNm());
		this.hashColumns.put("rpt_mrg_flg", getRptMrgFlg());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("eml_tit_nm", getEmlTitNm());
		this.hashColumns.put("to_eml_ctnt", getToEmlCtnt());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("rpt_split_qty", getRptSplitQty());
		this.hashColumns.put("smtp_ip", getSmtpIp());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("rd_sub_sys_cd", getRdSubSysCd());
		this.hashColumns.put("cc_eml_ctnt", getCcEmlCtnt());
		this.hashColumns.put("bcc_eml_ctnt", getBccEmlCtnt());
		this.hashColumns.put("sndr_nm", getSndrNm());
		this.hashColumns.put("eml_dt", getEmlDt());
		this.hashColumns.put("thd_id", getThdId());
		this.hashColumns.put("eml_err_msg", getEmlErrMsg());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("eml_proc_sts_cd", getEmlProcStsCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("rpt_split_capa", "rptSplitCapa");
		this.hashFields.put("eml_snd_no", "emlSndNo");
		this.hashFields.put("bat_flg", "batFlg");
		this.hashFields.put("sndr_eml", "sndrEml");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("eml_split_capa", "emlSplitCapa");
		this.hashFields.put("rpt_mrg_file_nm", "rptMrgFileNm");
		this.hashFields.put("appl_svr_nm", "applSvrNm");
		this.hashFields.put("rpt_mrg_flg", "rptMrgFlg");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("eml_tit_nm", "emlTitNm");
		this.hashFields.put("to_eml_ctnt", "toEmlCtnt");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("rpt_split_qty", "rptSplitQty");
		this.hashFields.put("smtp_ip", "smtpIp");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("rd_sub_sys_cd", "rdSubSysCd");
		this.hashFields.put("cc_eml_ctnt", "ccEmlCtnt");
		this.hashFields.put("bcc_eml_ctnt", "bccEmlCtnt");
		this.hashFields.put("sndr_nm", "sndrNm");
		this.hashFields.put("eml_dt", "emlDt");
		this.hashFields.put("thd_id", "thdId");
		this.hashFields.put("eml_err_msg", "emlErrMsg");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("eml_proc_sts_cd", "emlProcStsCd");
		return this.hashFields;
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
	 * @return rptSplitCapa
	 */
	public String getRptSplitCapa() {
		return this.rptSplitCapa;
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
	 * @return batFlg
	 */
	public String getBatFlg() {
		return this.batFlg;
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
	 * @return updUsrId
	 */
	public String getUpdUsrId() {
		return this.updUsrId;
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
	 * @return emlSplitCapa
	 */
	public String getEmlSplitCapa() {
		return this.emlSplitCapa;
	}
	
	/**
	 * Column Info
	 * @return rptMrgFileNm
	 */
	public String getRptMrgFileNm() {
		return this.rptMrgFileNm;
	}
	
	/**
	 * Column Info
	 * @return applSvrNm
	 */
	public String getApplSvrNm() {
		return this.applSvrNm;
	}
	
	/**
	 * Column Info
	 * @return rptMrgFlg
	 */
	public String getRptMrgFlg() {
		return this.rptMrgFlg;
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
	 * @return emlTitNm
	 */
	public String getEmlTitNm() {
		return this.emlTitNm;
	}
	
	/**
	 * Column Info
	 * @return toEmlCtnt
	 */
	public String getToEmlCtnt() {
		return this.toEmlCtnt;
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
	 * @return rptSplitQty
	 */
	public String getRptSplitQty() {
		return this.rptSplitQty;
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
	 * @return creDt
	 */
	public String getCreDt() {
		return this.creDt;
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
	 * @return ccEmlCtnt
	 */
	public String getCcEmlCtnt() {
		return this.ccEmlCtnt;
	}
	
	/**
	 * Column Info
	 * @return bccEmlCtnt
	 */
	public String getBccEmlCtnt() {
		return this.bccEmlCtnt;
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
	 * @return emlDt
	 */
	public String getEmlDt() {
		return this.emlDt;
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
	 * @return emlErrMsg
	 */
	public String getEmlErrMsg() {
		return this.emlErrMsg;
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
	 * @return emlProcStsCd
	 */
	public String getEmlProcStsCd() {
		return this.emlProcStsCd;
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
	 * @param rptSplitCapa
	 */
	public void setRptSplitCapa(String rptSplitCapa) {
		this.rptSplitCapa = rptSplitCapa;
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
	 * @param batFlg
	 */
	public void setBatFlg(String batFlg) {
		this.batFlg = batFlg;
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
	 * @param updUsrId
	 */
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
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
	 * @param emlSplitCapa
	 */
	public void setEmlSplitCapa(String emlSplitCapa) {
		this.emlSplitCapa = emlSplitCapa;
	}
	
	/**
	 * Column Info
	 * @param rptMrgFileNm
	 */
	public void setRptMrgFileNm(String rptMrgFileNm) {
		this.rptMrgFileNm = rptMrgFileNm;
	}
	
	/**
	 * Column Info
	 * @param applSvrNm
	 */
	public void setApplSvrNm(String applSvrNm) {
		this.applSvrNm = applSvrNm;
	}
	
	/**
	 * Column Info
	 * @param rptMrgFlg
	 */
	public void setRptMrgFlg(String rptMrgFlg) {
		this.rptMrgFlg = rptMrgFlg;
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
	 * @param emlTitNm
	 */
	public void setEmlTitNm(String emlTitNm) {
		this.emlTitNm = emlTitNm;
	}
	
	/**
	 * Column Info
	 * @param toEmlCtnt
	 */
	public void setToEmlCtnt(String toEmlCtnt) {
		this.toEmlCtnt = toEmlCtnt;
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
	 * @param rptSplitQty
	 */
	public void setRptSplitQty(String rptSplitQty) {
		this.rptSplitQty = rptSplitQty;
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
	 * @param creDt
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
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
	 * @param ccEmlCtnt
	 */
	public void setCcEmlCtnt(String ccEmlCtnt) {
		this.ccEmlCtnt = ccEmlCtnt;
	}
	
	/**
	 * Column Info
	 * @param bccEmlCtnt
	 */
	public void setBccEmlCtnt(String bccEmlCtnt) {
		this.bccEmlCtnt = bccEmlCtnt;
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
	 * @param emlDt
	 */
	public void setEmlDt(String emlDt) {
		this.emlDt = emlDt;
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
	 * @param emlErrMsg
	 */
	public void setEmlErrMsg(String emlErrMsg) {
		this.emlErrMsg = emlErrMsg;
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
	 * @param emlProcStsCd
	 */
	public void setEmlProcStsCd(String emlProcStsCd) {
		this.emlProcStsCd = emlProcStsCd;
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
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setRptSplitCapa(JSPUtil.getParameter(request, prefix + "rpt_split_capa", ""));
		setEmlSndNo(JSPUtil.getParameter(request, prefix + "eml_snd_no", ""));
		setBatFlg(JSPUtil.getParameter(request, prefix + "bat_flg", ""));
		setSndrEml(JSPUtil.getParameter(request, prefix + "sndr_eml", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setEmlSplitCapa(JSPUtil.getParameter(request, prefix + "eml_split_capa", ""));
		setRptMrgFileNm(JSPUtil.getParameter(request, prefix + "rpt_mrg_file_nm", ""));
		setApplSvrNm(JSPUtil.getParameter(request, prefix + "appl_svr_nm", ""));
		setRptMrgFlg(JSPUtil.getParameter(request, prefix + "rpt_mrg_flg", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setEmlTitNm(JSPUtil.getParameter(request, prefix + "eml_tit_nm", ""));
		setToEmlCtnt(JSPUtil.getParameter(request, prefix + "to_eml_ctnt", ""));
		setDeltFlg(JSPUtil.getParameter(request, prefix + "delt_flg", ""));
		setRptSplitQty(JSPUtil.getParameter(request, prefix + "rpt_split_qty", ""));
		setSmtpIp(JSPUtil.getParameter(request, prefix + "smtp_ip", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setRdSubSysCd(JSPUtil.getParameter(request, prefix + "rd_sub_sys_cd", ""));
		setCcEmlCtnt(JSPUtil.getParameter(request, prefix + "cc_eml_ctnt", ""));
		setBccEmlCtnt(JSPUtil.getParameter(request, prefix + "bcc_eml_ctnt", ""));
		setSndrNm(JSPUtil.getParameter(request, prefix + "sndr_nm", ""));
		setEmlDt(JSPUtil.getParameter(request, prefix + "eml_dt", ""));
		setThdId(JSPUtil.getParameter(request, prefix + "thd_id", ""));
		setEmlErrMsg(JSPUtil.getParameter(request, prefix + "eml_err_msg", ""));
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setEmlProcStsCd(JSPUtil.getParameter(request, prefix + "eml_proc_sts_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return InfoVO[]
	 */
	public InfoVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return InfoVO[]
	 */
	public InfoVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		InfoVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] rptSplitCapa = (JSPUtil.getParameter(request, prefix	+ "rpt_split_capa", length));
			String[] emlSndNo = (JSPUtil.getParameter(request, prefix	+ "eml_snd_no", length));
			String[] batFlg = (JSPUtil.getParameter(request, prefix	+ "bat_flg", length));
			String[] sndrEml = (JSPUtil.getParameter(request, prefix	+ "sndr_eml", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] emlSplitCapa = (JSPUtil.getParameter(request, prefix	+ "eml_split_capa", length));
			String[] rptMrgFileNm = (JSPUtil.getParameter(request, prefix	+ "rpt_mrg_file_nm", length));
			String[] applSvrNm = (JSPUtil.getParameter(request, prefix	+ "appl_svr_nm", length));
			String[] rptMrgFlg = (JSPUtil.getParameter(request, prefix	+ "rpt_mrg_flg", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] emlTitNm = (JSPUtil.getParameter(request, prefix	+ "eml_tit_nm", length));
			String[] toEmlCtnt = (JSPUtil.getParameter(request, prefix	+ "to_eml_ctnt", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] rptSplitQty = (JSPUtil.getParameter(request, prefix	+ "rpt_split_qty", length));
			String[] smtpIp = (JSPUtil.getParameter(request, prefix	+ "smtp_ip", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] rdSubSysCd = (JSPUtil.getParameter(request, prefix	+ "rd_sub_sys_cd", length));
			String[] ccEmlCtnt = (JSPUtil.getParameter(request, prefix	+ "cc_eml_ctnt", length));
			String[] bccEmlCtnt = (JSPUtil.getParameter(request, prefix	+ "bcc_eml_ctnt", length));
			String[] sndrNm = (JSPUtil.getParameter(request, prefix	+ "sndr_nm", length));
			String[] emlDt = (JSPUtil.getParameter(request, prefix	+ "eml_dt", length));
			String[] thdId = (JSPUtil.getParameter(request, prefix	+ "thd_id", length));
			String[] emlErrMsg = (JSPUtil.getParameter(request, prefix	+ "eml_err_msg", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] emlProcStsCd = (JSPUtil.getParameter(request, prefix	+ "eml_proc_sts_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new InfoVO();
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (rptSplitCapa[i] != null)
					model.setRptSplitCapa(rptSplitCapa[i]);
				if (emlSndNo[i] != null)
					model.setEmlSndNo(emlSndNo[i]);
				if (batFlg[i] != null)
					model.setBatFlg(batFlg[i]);
				if (sndrEml[i] != null)
					model.setSndrEml(sndrEml[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (emlSplitCapa[i] != null)
					model.setEmlSplitCapa(emlSplitCapa[i]);
				if (rptMrgFileNm[i] != null)
					model.setRptMrgFileNm(rptMrgFileNm[i]);
				if (applSvrNm[i] != null)
					model.setApplSvrNm(applSvrNm[i]);
				if (rptMrgFlg[i] != null)
					model.setRptMrgFlg(rptMrgFlg[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (emlTitNm[i] != null)
					model.setEmlTitNm(emlTitNm[i]);
				if (toEmlCtnt[i] != null)
					model.setToEmlCtnt(toEmlCtnt[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (rptSplitQty[i] != null)
					model.setRptSplitQty(rptSplitQty[i]);
				if (smtpIp[i] != null)
					model.setSmtpIp(smtpIp[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (rdSubSysCd[i] != null)
					model.setRdSubSysCd(rdSubSysCd[i]);
				if (ccEmlCtnt[i] != null)
					model.setCcEmlCtnt(ccEmlCtnt[i]);
				if (bccEmlCtnt[i] != null)
					model.setBccEmlCtnt(bccEmlCtnt[i]);
				if (sndrNm[i] != null)
					model.setSndrNm(sndrNm[i]);
				if (emlDt[i] != null)
					model.setEmlDt(emlDt[i]);
				if (thdId[i] != null)
					model.setThdId(thdId[i]);
				if (emlErrMsg[i] != null)
					model.setEmlErrMsg(emlErrMsg[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (emlProcStsCd[i] != null)
					model.setEmlProcStsCd(emlProcStsCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getInfoVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return InfoVO[]
	 */
	public InfoVO[] getInfoVOs(){
		InfoVO[] vos = (InfoVO[])models.toArray(new InfoVO[models.size()]);
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
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rptSplitCapa = this.rptSplitCapa .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.emlSndNo = this.emlSndNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.batFlg = this.batFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sndrEml = this.sndrEml .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.emlSplitCapa = this.emlSplitCapa .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rptMrgFileNm = this.rptMrgFileNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.applSvrNm = this.applSvrNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rptMrgFlg = this.rptMrgFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.emlTitNm = this.emlTitNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.toEmlCtnt = this.toEmlCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rptSplitQty = this.rptSplitQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.smtpIp = this.smtpIp .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rdSubSysCd = this.rdSubSysCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ccEmlCtnt = this.ccEmlCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bccEmlCtnt = this.bccEmlCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sndrNm = this.sndrNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.emlDt = this.emlDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.thdId = this.thdId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.emlErrMsg = this.emlErrMsg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.emlProcStsCd = this.emlProcStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
