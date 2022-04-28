/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : BkgIbEdiSndLogVO.java
*@FileTitle : BkgIbEdiSndLogVO
*Open Issues :
*Change history :
*@LastModifyDate : 2010.05.03
*@LastModifier : 윤한
*@LastVersion : 1.0
* 2010.05.03 윤한 
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
 * @author 윤한
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgIbEdiSndLogVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgIbEdiSndLogVO> models = new ArrayList<BkgIbEdiSndLogVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String msgTpId = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String fltFileRefNo = null;
	/* Column Info */
	private String ediSndMsgCtnt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String msgTpNm = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String doEdiTpCd = null;
	/* Column Info */
	private String ediEvntGdt = null;
	/* Column Info */
	private String ediSndSeq = null;
	/* Column Info */
	private String cntrNo = null;
	/* Column Info */
	private String ediEvntUsrId = null;
	/* Column Info */
	private String ediEvntOfcCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String ediEvntDt = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgIbEdiSndLogVO() {}

	public BkgIbEdiSndLogVO(String ibflag, String pagerows, String bkgNo, String ediSndSeq, String fltFileRefNo, String cntrNo, String doEdiTpCd, String msgTpNm, String msgTpId, String ediEvntUsrId, String ediEvntOfcCd, String ediEvntDt, String ediEvntGdt, String ediSndMsgCtnt, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.msgTpId = msgTpId;
		this.creDt = creDt;
		this.fltFileRefNo = fltFileRefNo;
		this.ediSndMsgCtnt = ediSndMsgCtnt;
		this.pagerows = pagerows;
		this.msgTpNm = msgTpNm;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.bkgNo = bkgNo;
		this.doEdiTpCd = doEdiTpCd;
		this.ediEvntGdt = ediEvntGdt;
		this.ediSndSeq = ediSndSeq;
		this.cntrNo = cntrNo;
		this.ediEvntUsrId = ediEvntUsrId;
		this.ediEvntOfcCd = ediEvntOfcCd;
		this.updUsrId = updUsrId;
		this.ediEvntDt = ediEvntDt;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("msg_tp_id", getMsgTpId());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("flt_file_ref_no", getFltFileRefNo());
		this.hashColumns.put("edi_snd_msg_ctnt", getEdiSndMsgCtnt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("msg_tp_nm", getMsgTpNm());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("do_edi_tp_cd", getDoEdiTpCd());
		this.hashColumns.put("edi_evnt_gdt", getEdiEvntGdt());
		this.hashColumns.put("edi_snd_seq", getEdiSndSeq());
		this.hashColumns.put("cntr_no", getCntrNo());
		this.hashColumns.put("edi_evnt_usr_id", getEdiEvntUsrId());
		this.hashColumns.put("edi_evnt_ofc_cd", getEdiEvntOfcCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("edi_evnt_dt", getEdiEvntDt());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("msg_tp_id", "msgTpId");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("flt_file_ref_no", "fltFileRefNo");
		this.hashFields.put("edi_snd_msg_ctnt", "ediSndMsgCtnt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("msg_tp_nm", "msgTpNm");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("do_edi_tp_cd", "doEdiTpCd");
		this.hashFields.put("edi_evnt_gdt", "ediEvntGdt");
		this.hashFields.put("edi_snd_seq", "ediSndSeq");
		this.hashFields.put("cntr_no", "cntrNo");
		this.hashFields.put("edi_evnt_usr_id", "ediEvntUsrId");
		this.hashFields.put("edi_evnt_ofc_cd", "ediEvntOfcCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("edi_evnt_dt", "ediEvntDt");
		return this.hashFields;
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
	 * @return msgTpId
	 */
	public String getMsgTpId() {
		return this.msgTpId;
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
	 * @return fltFileRefNo
	 */
	public String getFltFileRefNo() {
		return this.fltFileRefNo;
	}
	
	/**
	 * Column Info
	 * @return ediSndMsgCtnt
	 */
	public String getEdiSndMsgCtnt() {
		return this.ediSndMsgCtnt;
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
	 * @return msgTpNm
	 */
	public String getMsgTpNm() {
		return this.msgTpNm;
	}
	
	/**
	 * Column Info
	 * @return creUsrId
	 */
	public String getCreUsrId() {
		return this.creUsrId;
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
	 * @return bkgNo
	 */
	public String getBkgNo() {
		return this.bkgNo;
	}
	
	/**
	 * Column Info
	 * @return doEdiTpCd
	 */
	public String getDoEdiTpCd() {
		return this.doEdiTpCd;
	}
	
	/**
	 * Column Info
	 * @return ediEvntGdt
	 */
	public String getEdiEvntGdt() {
		return this.ediEvntGdt;
	}
	
	/**
	 * Column Info
	 * @return ediSndSeq
	 */
	public String getEdiSndSeq() {
		return this.ediSndSeq;
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
	 * @return ediEvntUsrId
	 */
	public String getEdiEvntUsrId() {
		return this.ediEvntUsrId;
	}
	
	/**
	 * Column Info
	 * @return ediEvntOfcCd
	 */
	public String getEdiEvntOfcCd() {
		return this.ediEvntOfcCd;
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
	 * @return ediEvntDt
	 */
	public String getEdiEvntDt() {
		return this.ediEvntDt;
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
	 * @param msgTpId
	 */
	public void setMsgTpId(String msgTpId) {
		this.msgTpId = msgTpId;
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
	 * @param fltFileRefNo
	 */
	public void setFltFileRefNo(String fltFileRefNo) {
		this.fltFileRefNo = fltFileRefNo;
	}
	
	/**
	 * Column Info
	 * @param ediSndMsgCtnt
	 */
	public void setEdiSndMsgCtnt(String ediSndMsgCtnt) {
		this.ediSndMsgCtnt = ediSndMsgCtnt;
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
	 * @param msgTpNm
	 */
	public void setMsgTpNm(String msgTpNm) {
		this.msgTpNm = msgTpNm;
	}
	
	/**
	 * Column Info
	 * @param creUsrId
	 */
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
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
	 * @param bkgNo
	 */
	public void setBkgNo(String bkgNo) {
		this.bkgNo = bkgNo;
	}
	
	/**
	 * Column Info
	 * @param doEdiTpCd
	 */
	public void setDoEdiTpCd(String doEdiTpCd) {
		this.doEdiTpCd = doEdiTpCd;
	}
	
	/**
	 * Column Info
	 * @param ediEvntGdt
	 */
	public void setEdiEvntGdt(String ediEvntGdt) {
		this.ediEvntGdt = ediEvntGdt;
	}
	
	/**
	 * Column Info
	 * @param ediSndSeq
	 */
	public void setEdiSndSeq(String ediSndSeq) {
		this.ediSndSeq = ediSndSeq;
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
	 * @param ediEvntUsrId
	 */
	public void setEdiEvntUsrId(String ediEvntUsrId) {
		this.ediEvntUsrId = ediEvntUsrId;
	}
	
	/**
	 * Column Info
	 * @param ediEvntOfcCd
	 */
	public void setEdiEvntOfcCd(String ediEvntOfcCd) {
		this.ediEvntOfcCd = ediEvntOfcCd;
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
	 * @param ediEvntDt
	 */
	public void setEdiEvntDt(String ediEvntDt) {
		this.ediEvntDt = ediEvntDt;
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
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setMsgTpId(JSPUtil.getParameter(request, prefix + "msg_tp_id", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setFltFileRefNo(JSPUtil.getParameter(request, prefix + "flt_file_ref_no", ""));
		setEdiSndMsgCtnt(JSPUtil.getParameter(request, prefix + "edi_snd_msg_ctnt", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setMsgTpNm(JSPUtil.getParameter(request, prefix + "msg_tp_nm", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setBkgNo(JSPUtil.getParameter(request, prefix + "bkg_no", ""));
		setDoEdiTpCd(JSPUtil.getParameter(request, prefix + "do_edi_tp_cd", ""));
		setEdiEvntGdt(JSPUtil.getParameter(request, prefix + "edi_evnt_gdt", ""));
		setEdiSndSeq(JSPUtil.getParameter(request, prefix + "edi_snd_seq", ""));
		setCntrNo(JSPUtil.getParameter(request, prefix + "cntr_no", ""));
		setEdiEvntUsrId(JSPUtil.getParameter(request, prefix + "edi_evnt_usr_id", ""));
		setEdiEvntOfcCd(JSPUtil.getParameter(request, prefix + "edi_evnt_ofc_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setEdiEvntDt(JSPUtil.getParameter(request, prefix + "edi_evnt_dt", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgIbEdiSndLogVO[]
	 */
	public BkgIbEdiSndLogVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgIbEdiSndLogVO[]
	 */
	public BkgIbEdiSndLogVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgIbEdiSndLogVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] msgTpId = (JSPUtil.getParameter(request, prefix	+ "msg_tp_id", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] fltFileRefNo = (JSPUtil.getParameter(request, prefix	+ "flt_file_ref_no", length));
			String[] ediSndMsgCtnt = (JSPUtil.getParameter(request, prefix	+ "edi_snd_msg_ctnt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] msgTpNm = (JSPUtil.getParameter(request, prefix	+ "msg_tp_nm", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] doEdiTpCd = (JSPUtil.getParameter(request, prefix	+ "do_edi_tp_cd", length));
			String[] ediEvntGdt = (JSPUtil.getParameter(request, prefix	+ "edi_evnt_gdt", length));
			String[] ediSndSeq = (JSPUtil.getParameter(request, prefix	+ "edi_snd_seq", length));
			String[] cntrNo = (JSPUtil.getParameter(request, prefix	+ "cntr_no", length));
			String[] ediEvntUsrId = (JSPUtil.getParameter(request, prefix	+ "edi_evnt_usr_id", length));
			String[] ediEvntOfcCd = (JSPUtil.getParameter(request, prefix	+ "edi_evnt_ofc_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] ediEvntDt = (JSPUtil.getParameter(request, prefix	+ "edi_evnt_dt", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgIbEdiSndLogVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (msgTpId[i] != null)
					model.setMsgTpId(msgTpId[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (fltFileRefNo[i] != null)
					model.setFltFileRefNo(fltFileRefNo[i]);
				if (ediSndMsgCtnt[i] != null)
					model.setEdiSndMsgCtnt(ediSndMsgCtnt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (msgTpNm[i] != null)
					model.setMsgTpNm(msgTpNm[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (doEdiTpCd[i] != null)
					model.setDoEdiTpCd(doEdiTpCd[i]);
				if (ediEvntGdt[i] != null)
					model.setEdiEvntGdt(ediEvntGdt[i]);
				if (ediSndSeq[i] != null)
					model.setEdiSndSeq(ediSndSeq[i]);
				if (cntrNo[i] != null)
					model.setCntrNo(cntrNo[i]);
				if (ediEvntUsrId[i] != null)
					model.setEdiEvntUsrId(ediEvntUsrId[i]);
				if (ediEvntOfcCd[i] != null)
					model.setEdiEvntOfcCd(ediEvntOfcCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (ediEvntDt[i] != null)
					model.setEdiEvntDt(ediEvntDt[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgIbEdiSndLogVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgIbEdiSndLogVO[]
	 */
	public BkgIbEdiSndLogVO[] getBkgIbEdiSndLogVOs(){
		BkgIbEdiSndLogVO[] vos = (BkgIbEdiSndLogVO[])models.toArray(new BkgIbEdiSndLogVO[models.size()]);
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
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.msgTpId = this.msgTpId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fltFileRefNo = this.fltFileRefNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediSndMsgCtnt = this.ediSndMsgCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.msgTpNm = this.msgTpNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.doEdiTpCd = this.doEdiTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediEvntGdt = this.ediEvntGdt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediSndSeq = this.ediSndSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrNo = this.cntrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediEvntUsrId = this.ediEvntUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediEvntOfcCd = this.ediEvntOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediEvntDt = this.ediEvntDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
