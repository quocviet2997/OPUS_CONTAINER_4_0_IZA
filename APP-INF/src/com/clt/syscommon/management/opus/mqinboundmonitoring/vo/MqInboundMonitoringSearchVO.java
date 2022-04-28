/*=========================================================
*Copyright(c) 2015 CyberLogitec
*@FileName : MqInboundMonitoringSearchVO.java
*@FileTitle : MqInboundMonitoringSearchVO
*Open Issues :
*Change history :
*@LastModifyDate : 2015.03.18
*@LastModifier : Jeong-Hoon, KIM
*@LastVersion : 1.0
* 2015.03.18 Jeong-Hoon, KIM 
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.management.opus.mqinboundmonitoring.vo;

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
 * @author Jeong-Hoon, KIM
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class MqInboundMonitoringSearchVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<MqInboundMonitoringSearchVO> models = new ArrayList<MqInboundMonitoringSearchVO>();
	
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String flatfileDownload = null;
	/* Column Info */
	private String refNo = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String subSysCd = null;
	/* Column Info */
	private String msgProcErrCtnt = null;
	/* Column Info */
	private String ediSndrId = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String ediMsgTpId = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String msgTjDt = null;
	/* Column Info */
	private String msgQuNm = null;
	/* Column Info */
	private String atfcMsgId = null;
	/* Column Info */
	private String msgProcStsCd = null;
	/* Column Info */
	private String updDt = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new LinkedHashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new LinkedHashMap<String, String>();
	
	public MqInboundMonitoringSearchVO() {}

	public MqInboundMonitoringSearchVO(String ibflag, String pagerows, String atfcMsgId, String refNo, String subSysCd, String ediMsgTpId, String ediSndrId, String msgQuNm, String msgProcStsCd, String msgProcErrCtnt, String msgTjDt, String creUsrId, String creDt, String updUsrId, String updDt, String flatfileDownload) {
		this.pagerows = pagerows;
		this.flatfileDownload = flatfileDownload;
		this.refNo = refNo;
		this.ibflag = ibflag;
		this.subSysCd = subSysCd;
		this.msgProcErrCtnt = msgProcErrCtnt;
		this.ediSndrId = ediSndrId;
		this.updUsrId = updUsrId;
		this.ediMsgTpId = ediMsgTpId;
		this.creUsrId = creUsrId;
		this.creDt = creDt;
		this.msgTjDt = msgTjDt;
		this.msgQuNm = msgQuNm;
		this.atfcMsgId = atfcMsgId;
		this.msgProcStsCd = msgProcStsCd;
		this.updDt = updDt;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("flatfile_download", getFlatfileDownload());
		this.hashColumns.put("ref_no", getRefNo());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("sub_sys_cd", getSubSysCd());
		this.hashColumns.put("msg_proc_err_ctnt", getMsgProcErrCtnt());
		this.hashColumns.put("edi_sndr_id", getEdiSndrId());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("edi_msg_tp_id", getEdiMsgTpId());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("msg_tj_dt", getMsgTjDt());
		this.hashColumns.put("msg_qu_nm", getMsgQuNm());
		this.hashColumns.put("atfc_msg_id", getAtfcMsgId());
		this.hashColumns.put("msg_proc_sts_cd", getMsgProcStsCd());
		this.hashColumns.put("upd_dt", getUpdDt());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("flatfile_download", "flatfileDownload");
		this.hashFields.put("ref_no", "refNo");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("sub_sys_cd", "subSysCd");
		this.hashFields.put("msg_proc_err_ctnt", "msgProcErrCtnt");
		this.hashFields.put("edi_sndr_id", "ediSndrId");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("edi_msg_tp_id", "ediMsgTpId");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("msg_tj_dt", "msgTjDt");
		this.hashFields.put("msg_qu_nm", "msgQuNm");
		this.hashFields.put("atfc_msg_id", "atfcMsgId");
		this.hashFields.put("msg_proc_sts_cd", "msgProcStsCd");
		this.hashFields.put("upd_dt", "updDt");
		return this.hashFields;
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
	 * @return flatfileDownload
	 */
	public String getFlatfileDownload() {
		return this.flatfileDownload;
	}
	
	/**
	 * Column Info
	 * @return refNo
	 */
	public String getRefNo() {
		return this.refNo;
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
	 * @return subSysCd
	 */
	public String getSubSysCd() {
		return this.subSysCd;
	}
	
	/**
	 * Column Info
	 * @return msgProcErrCtnt
	 */
	public String getMsgProcErrCtnt() {
		return this.msgProcErrCtnt;
	}
	
	/**
	 * Column Info
	 * @return ediSndrId
	 */
	public String getEdiSndrId() {
		return this.ediSndrId;
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
	 * @return ediMsgTpId
	 */
	public String getEdiMsgTpId() {
		return this.ediMsgTpId;
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
	 * @return creDt
	 */
	public String getCreDt() {
		return this.creDt;
	}
	
	/**
	 * Column Info
	 * @return msgTjDt
	 */
	public String getMsgTjDt() {
		return this.msgTjDt;
	}
	
	/**
	 * Column Info
	 * @return msgQuNm
	 */
	public String getMsgQuNm() {
		return this.msgQuNm;
	}
	
	/**
	 * Column Info
	 * @return atfcMsgId
	 */
	public String getAtfcMsgId() {
		return this.atfcMsgId;
	}
	
	/**
	 * Column Info
	 * @return msgProcStsCd
	 */
	public String getMsgProcStsCd() {
		return this.msgProcStsCd;
	}
	
	/**
	 * Column Info
	 * @return updDt
	 */
	public String getUpdDt() {
		return this.updDt;
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
	 * @param flatfileDownload
	 */
	public void setFlatfileDownload(String flatfileDownload) {
		this.flatfileDownload = flatfileDownload;
	}
	
	/**
	 * Column Info
	 * @param refNo
	 */
	public void setRefNo(String refNo) {
		this.refNo = refNo;
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
	 * @param subSysCd
	 */
	public void setSubSysCd(String subSysCd) {
		this.subSysCd = subSysCd;
	}
	
	/**
	 * Column Info
	 * @param msgProcErrCtnt
	 */
	public void setMsgProcErrCtnt(String msgProcErrCtnt) {
		this.msgProcErrCtnt = msgProcErrCtnt;
	}
	
	/**
	 * Column Info
	 * @param ediSndrId
	 */
	public void setEdiSndrId(String ediSndrId) {
		this.ediSndrId = ediSndrId;
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
	 * @param ediMsgTpId
	 */
	public void setEdiMsgTpId(String ediMsgTpId) {
		this.ediMsgTpId = ediMsgTpId;
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
	 * @param creDt
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
	}
	
	/**
	 * Column Info
	 * @param msgTjDt
	 */
	public void setMsgTjDt(String msgTjDt) {
		this.msgTjDt = msgTjDt;
	}
	
	/**
	 * Column Info
	 * @param msgQuNm
	 */
	public void setMsgQuNm(String msgQuNm) {
		this.msgQuNm = msgQuNm;
	}
	
	/**
	 * Column Info
	 * @param atfcMsgId
	 */
	public void setAtfcMsgId(String atfcMsgId) {
		this.atfcMsgId = atfcMsgId;
	}
	
	/**
	 * Column Info
	 * @param msgProcStsCd
	 */
	public void setMsgProcStsCd(String msgProcStsCd) {
		this.msgProcStsCd = msgProcStsCd;
	}
	
	/**
	 * Column Info
	 * @param updDt
	 */
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
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
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setFlatfileDownload(JSPUtil.getParameter(request, prefix + "flatfile_download", ""));
		setRefNo(JSPUtil.getParameter(request, prefix + "ref_no", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setSubSysCd(JSPUtil.getParameter(request, prefix + "sub_sys_cd", ""));
		setMsgProcErrCtnt(JSPUtil.getParameter(request, prefix + "msg_proc_err_ctnt", ""));
		setEdiSndrId(JSPUtil.getParameter(request, prefix + "edi_sndr_id", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setEdiMsgTpId(JSPUtil.getParameter(request, prefix + "edi_msg_tp_id", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setMsgTjDt(JSPUtil.getParameter(request, prefix + "msg_tj_dt", ""));
		setMsgQuNm(JSPUtil.getParameter(request, prefix + "msg_qu_nm", ""));
		setAtfcMsgId(JSPUtil.getParameter(request, prefix + "atfc_msg_id", ""));
		setMsgProcStsCd(JSPUtil.getParameter(request, prefix + "msg_proc_sts_cd", ""));
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return MqInboundMonitoringSearchVO[]
	 */
	public MqInboundMonitoringSearchVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return MqInboundMonitoringSearchVO[]
	 */
	public MqInboundMonitoringSearchVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		MqInboundMonitoringSearchVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] flatfileDownload = (JSPUtil.getParameter(request, prefix	+ "flatfile_download", length));
			String[] refNo = (JSPUtil.getParameter(request, prefix	+ "ref_no", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] subSysCd = (JSPUtil.getParameter(request, prefix	+ "sub_sys_cd", length));
			String[] msgProcErrCtnt = (JSPUtil.getParameter(request, prefix	+ "msg_proc_err_ctnt", length));
			String[] ediSndrId = (JSPUtil.getParameter(request, prefix	+ "edi_sndr_id", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] ediMsgTpId = (JSPUtil.getParameter(request, prefix	+ "edi_msg_tp_id", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] msgTjDt = (JSPUtil.getParameter(request, prefix	+ "msg_tj_dt", length));
			String[] msgQuNm = (JSPUtil.getParameter(request, prefix	+ "msg_qu_nm", length));
			String[] atfcMsgId = (JSPUtil.getParameter(request, prefix	+ "atfc_msg_id", length));
			String[] msgProcStsCd = (JSPUtil.getParameter(request, prefix	+ "msg_proc_sts_cd", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			
			for (int i = 0; i < length; i++) {
				model = new MqInboundMonitoringSearchVO();
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (flatfileDownload[i] != null)
					model.setFlatfileDownload(flatfileDownload[i]);
				if (refNo[i] != null)
					model.setRefNo(refNo[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (subSysCd[i] != null)
					model.setSubSysCd(subSysCd[i]);
				if (msgProcErrCtnt[i] != null)
					model.setMsgProcErrCtnt(msgProcErrCtnt[i]);
				if (ediSndrId[i] != null)
					model.setEdiSndrId(ediSndrId[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (ediMsgTpId[i] != null)
					model.setEdiMsgTpId(ediMsgTpId[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (msgTjDt[i] != null)
					model.setMsgTjDt(msgTjDt[i]);
				if (msgQuNm[i] != null)
					model.setMsgQuNm(msgQuNm[i]);
				if (atfcMsgId[i] != null)
					model.setAtfcMsgId(atfcMsgId[i]);
				if (msgProcStsCd[i] != null)
					model.setMsgProcStsCd(msgProcStsCd[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getMqInboundMonitoringSearchVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return MqInboundMonitoringSearchVO[]
	 */
	public MqInboundMonitoringSearchVO[] getMqInboundMonitoringSearchVOs(){
		MqInboundMonitoringSearchVO[] vos = (MqInboundMonitoringSearchVO[])models.toArray(new MqInboundMonitoringSearchVO[models.size()]);
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
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.flatfileDownload = this.flatfileDownload .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.refNo = this.refNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.subSysCd = this.subSysCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.msgProcErrCtnt = this.msgProcErrCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediSndrId = this.ediSndrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediMsgTpId = this.ediMsgTpId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.msgTjDt = this.msgTjDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.msgQuNm = this.msgQuNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.atfcMsgId = this.atfcMsgId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.msgProcStsCd = this.msgProcStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
