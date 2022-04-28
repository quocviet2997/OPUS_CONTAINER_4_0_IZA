/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BKG_CSTMS_ANR_EDI_HISVO.java
*@FileTitle : BKG_CSTMS_ANR_EDI_HISVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.29
*@LastModifier : 정재엽
*@LastVersion : 1.0
* 2009.07.29 정재엽 
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
 * @author 정재엽
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BKG_CSTMS_ANR_EDI_HISVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BKG_CSTMS_ANR_EDI_HISVO> models = new ArrayList<BKG_CSTMS_ANR_EDI_HISVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String errCtnt = null;
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String anrEdiRtnId = null;
	/* Column Info */
	private String ediSndUsrId = null;
	/* Column Info */
	private String msgLocCd = null;
	/* Column Info */
	private String sndOfcCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String msgTpCd = null;
	/* Column Info */
	private String sndDt = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String ediMsgErrId = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String refSeq = null;
	/* Column Info */
	private String errDesc = null;
	/* Column Info */
	private String ediSndStsCd = null;
	/* Column Info */
	private String ediRcvStsCd = null;
	/* Column Info */
	private String rcvDt = null;
	/* Column Info */
	private String anrDeclNo = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BKG_CSTMS_ANR_EDI_HISVO() {}

	public BKG_CSTMS_ANR_EDI_HISVO(String ibflag, String pagerows, String msgTpCd, String anrDeclNo, String refSeq, String vslCd, String skdVoyNo, String skdDirCd, String ediSndStsCd, String ediSndUsrId, String sndOfcCd, String sndDt, String ediRcvStsCd, String rcvDt, String anrEdiRtnId, String ediMsgErrId, String errDesc, String msgLocCd, String errCtnt, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.errCtnt = errCtnt;
		this.vslCd = vslCd;
		this.anrEdiRtnId = anrEdiRtnId;
		this.ediSndUsrId = ediSndUsrId;
		this.msgLocCd = msgLocCd;
		this.sndOfcCd = sndOfcCd;
		this.creDt = creDt;
		this.skdVoyNo = skdVoyNo;
		this.msgTpCd = msgTpCd;
		this.sndDt = sndDt;
		this.skdDirCd = skdDirCd;
		this.pagerows = pagerows;
		this.ediMsgErrId = ediMsgErrId;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.refSeq = refSeq;
		this.errDesc = errDesc;
		this.ediSndStsCd = ediSndStsCd;
		this.ediRcvStsCd = ediRcvStsCd;
		this.rcvDt = rcvDt;
		this.anrDeclNo = anrDeclNo;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("err_ctnt", getErrCtnt());
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("anr_edi_rtn_id", getAnrEdiRtnId());
		this.hashColumns.put("edi_snd_usr_id", getEdiSndUsrId());
		this.hashColumns.put("msg_loc_cd", getMsgLocCd());
		this.hashColumns.put("snd_ofc_cd", getSndOfcCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("msg_tp_cd", getMsgTpCd());
		this.hashColumns.put("snd_dt", getSndDt());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("edi_msg_err_id", getEdiMsgErrId());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("ref_seq", getRefSeq());
		this.hashColumns.put("err_desc", getErrDesc());
		this.hashColumns.put("edi_snd_sts_cd", getEdiSndStsCd());
		this.hashColumns.put("edi_rcv_sts_cd", getEdiRcvStsCd());
		this.hashColumns.put("rcv_dt", getRcvDt());
		this.hashColumns.put("anr_decl_no", getAnrDeclNo());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("err_ctnt", "errCtnt");
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("anr_edi_rtn_id", "anrEdiRtnId");
		this.hashFields.put("edi_snd_usr_id", "ediSndUsrId");
		this.hashFields.put("msg_loc_cd", "msgLocCd");
		this.hashFields.put("snd_ofc_cd", "sndOfcCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("msg_tp_cd", "msgTpCd");
		this.hashFields.put("snd_dt", "sndDt");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("edi_msg_err_id", "ediMsgErrId");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("ref_seq", "refSeq");
		this.hashFields.put("err_desc", "errDesc");
		this.hashFields.put("edi_snd_sts_cd", "ediSndStsCd");
		this.hashFields.put("edi_rcv_sts_cd", "ediRcvStsCd");
		this.hashFields.put("rcv_dt", "rcvDt");
		this.hashFields.put("anr_decl_no", "anrDeclNo");
		this.hashFields.put("upd_usr_id", "updUsrId");
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
	 * @return errCtnt
	 */
	public String getErrCtnt() {
		return this.errCtnt;
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
	 * @return anrEdiRtnId
	 */
	public String getAnrEdiRtnId() {
		return this.anrEdiRtnId;
	}
	
	/**
	 * Column Info
	 * @return ediSndUsrId
	 */
	public String getEdiSndUsrId() {
		return this.ediSndUsrId;
	}
	
	/**
	 * Column Info
	 * @return msgLocCd
	 */
	public String getMsgLocCd() {
		return this.msgLocCd;
	}
	
	/**
	 * Column Info
	 * @return sndOfcCd
	 */
	public String getSndOfcCd() {
		return this.sndOfcCd;
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
	 * @return skdVoyNo
	 */
	public String getSkdVoyNo() {
		return this.skdVoyNo;
	}
	
	/**
	 * Column Info
	 * @return msgTpCd
	 */
	public String getMsgTpCd() {
		return this.msgTpCd;
	}
	
	/**
	 * Column Info
	 * @return sndDt
	 */
	public String getSndDt() {
		return this.sndDt;
	}
	
	/**
	 * Column Info
	 * @return skdDirCd
	 */
	public String getSkdDirCd() {
		return this.skdDirCd;
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
	 * @return ediMsgErrId
	 */
	public String getEdiMsgErrId() {
		return this.ediMsgErrId;
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
	 * @return refSeq
	 */
	public String getRefSeq() {
		return this.refSeq;
	}
	
	/**
	 * Column Info
	 * @return errDesc
	 */
	public String getErrDesc() {
		return this.errDesc;
	}
	
	/**
	 * Column Info
	 * @return ediSndStsCd
	 */
	public String getEdiSndStsCd() {
		return this.ediSndStsCd;
	}
	
	/**
	 * Column Info
	 * @return ediRcvStsCd
	 */
	public String getEdiRcvStsCd() {
		return this.ediRcvStsCd;
	}
	
	/**
	 * Column Info
	 * @return rcvDt
	 */
	public String getRcvDt() {
		return this.rcvDt;
	}
	
	/**
	 * Column Info
	 * @return anrDeclNo
	 */
	public String getAnrDeclNo() {
		return this.anrDeclNo;
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
	 * @param updDt
	 */
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
	}
	
	/**
	 * Column Info
	 * @param errCtnt
	 */
	public void setErrCtnt(String errCtnt) {
		this.errCtnt = errCtnt;
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
	 * @param anrEdiRtnId
	 */
	public void setAnrEdiRtnId(String anrEdiRtnId) {
		this.anrEdiRtnId = anrEdiRtnId;
	}
	
	/**
	 * Column Info
	 * @param ediSndUsrId
	 */
	public void setEdiSndUsrId(String ediSndUsrId) {
		this.ediSndUsrId = ediSndUsrId;
	}
	
	/**
	 * Column Info
	 * @param msgLocCd
	 */
	public void setMsgLocCd(String msgLocCd) {
		this.msgLocCd = msgLocCd;
	}
	
	/**
	 * Column Info
	 * @param sndOfcCd
	 */
	public void setSndOfcCd(String sndOfcCd) {
		this.sndOfcCd = sndOfcCd;
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
	 * @param skdVoyNo
	 */
	public void setSkdVoyNo(String skdVoyNo) {
		this.skdVoyNo = skdVoyNo;
	}
	
	/**
	 * Column Info
	 * @param msgTpCd
	 */
	public void setMsgTpCd(String msgTpCd) {
		this.msgTpCd = msgTpCd;
	}
	
	/**
	 * Column Info
	 * @param sndDt
	 */
	public void setSndDt(String sndDt) {
		this.sndDt = sndDt;
	}
	
	/**
	 * Column Info
	 * @param skdDirCd
	 */
	public void setSkdDirCd(String skdDirCd) {
		this.skdDirCd = skdDirCd;
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
	 * @param ediMsgErrId
	 */
	public void setEdiMsgErrId(String ediMsgErrId) {
		this.ediMsgErrId = ediMsgErrId;
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
	 * @param refSeq
	 */
	public void setRefSeq(String refSeq) {
		this.refSeq = refSeq;
	}
	
	/**
	 * Column Info
	 * @param errDesc
	 */
	public void setErrDesc(String errDesc) {
		this.errDesc = errDesc;
	}
	
	/**
	 * Column Info
	 * @param ediSndStsCd
	 */
	public void setEdiSndStsCd(String ediSndStsCd) {
		this.ediSndStsCd = ediSndStsCd;
	}
	
	/**
	 * Column Info
	 * @param ediRcvStsCd
	 */
	public void setEdiRcvStsCd(String ediRcvStsCd) {
		this.ediRcvStsCd = ediRcvStsCd;
	}
	
	/**
	 * Column Info
	 * @param rcvDt
	 */
	public void setRcvDt(String rcvDt) {
		this.rcvDt = rcvDt;
	}
	
	/**
	 * Column Info
	 * @param anrDeclNo
	 */
	public void setAnrDeclNo(String anrDeclNo) {
		this.anrDeclNo = anrDeclNo;
	}
	
	/**
	 * Column Info
	 * @param updUsrId
	 */
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setErrCtnt(JSPUtil.getParameter(request, "err_ctnt", ""));
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setAnrEdiRtnId(JSPUtil.getParameter(request, "anr_edi_rtn_id", ""));
		setEdiSndUsrId(JSPUtil.getParameter(request, "edi_snd_usr_id", ""));
		setMsgLocCd(JSPUtil.getParameter(request, "msg_loc_cd", ""));
		setSndOfcCd(JSPUtil.getParameter(request, "snd_ofc_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, "skd_voy_no", ""));
		setMsgTpCd(JSPUtil.getParameter(request, "msg_tp_cd", ""));
		setSndDt(JSPUtil.getParameter(request, "snd_dt", ""));
		setSkdDirCd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setEdiMsgErrId(JSPUtil.getParameter(request, "edi_msg_err_id", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setRefSeq(JSPUtil.getParameter(request, "ref_seq", ""));
		setErrDesc(JSPUtil.getParameter(request, "err_desc", ""));
		setEdiSndStsCd(JSPUtil.getParameter(request, "edi_snd_sts_cd", ""));
		setEdiRcvStsCd(JSPUtil.getParameter(request, "edi_rcv_sts_cd", ""));
		setRcvDt(JSPUtil.getParameter(request, "rcv_dt", ""));
		setAnrDeclNo(JSPUtil.getParameter(request, "anr_decl_no", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BKG_CSTMS_ANR_EDI_HISVO[]
	 */
	public BKG_CSTMS_ANR_EDI_HISVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BKG_CSTMS_ANR_EDI_HISVO[]
	 */
	public BKG_CSTMS_ANR_EDI_HISVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BKG_CSTMS_ANR_EDI_HISVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] errCtnt = (JSPUtil.getParameter(request, prefix	+ "err_ctnt", length));
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] anrEdiRtnId = (JSPUtil.getParameter(request, prefix	+ "anr_edi_rtn_id", length));
			String[] ediSndUsrId = (JSPUtil.getParameter(request, prefix	+ "edi_snd_usr_id", length));
			String[] msgLocCd = (JSPUtil.getParameter(request, prefix	+ "msg_loc_cd", length));
			String[] sndOfcCd = (JSPUtil.getParameter(request, prefix	+ "snd_ofc_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no", length));
			String[] msgTpCd = (JSPUtil.getParameter(request, prefix	+ "msg_tp_cd", length));
			String[] sndDt = (JSPUtil.getParameter(request, prefix	+ "snd_dt", length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ediMsgErrId = (JSPUtil.getParameter(request, prefix	+ "edi_msg_err_id", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] refSeq = (JSPUtil.getParameter(request, prefix	+ "ref_seq", length));
			String[] errDesc = (JSPUtil.getParameter(request, prefix	+ "err_desc", length));
			String[] ediSndStsCd = (JSPUtil.getParameter(request, prefix	+ "edi_snd_sts_cd", length));
			String[] ediRcvStsCd = (JSPUtil.getParameter(request, prefix	+ "edi_rcv_sts_cd", length));
			String[] rcvDt = (JSPUtil.getParameter(request, prefix	+ "rcv_dt", length));
			String[] anrDeclNo = (JSPUtil.getParameter(request, prefix	+ "anr_decl_no", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new BKG_CSTMS_ANR_EDI_HISVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (errCtnt[i] != null)
					model.setErrCtnt(errCtnt[i]);
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (anrEdiRtnId[i] != null)
					model.setAnrEdiRtnId(anrEdiRtnId[i]);
				if (ediSndUsrId[i] != null)
					model.setEdiSndUsrId(ediSndUsrId[i]);
				if (msgLocCd[i] != null)
					model.setMsgLocCd(msgLocCd[i]);
				if (sndOfcCd[i] != null)
					model.setSndOfcCd(sndOfcCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (msgTpCd[i] != null)
					model.setMsgTpCd(msgTpCd[i]);
				if (sndDt[i] != null)
					model.setSndDt(sndDt[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ediMsgErrId[i] != null)
					model.setEdiMsgErrId(ediMsgErrId[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (refSeq[i] != null)
					model.setRefSeq(refSeq[i]);
				if (errDesc[i] != null)
					model.setErrDesc(errDesc[i]);
				if (ediSndStsCd[i] != null)
					model.setEdiSndStsCd(ediSndStsCd[i]);
				if (ediRcvStsCd[i] != null)
					model.setEdiRcvStsCd(ediRcvStsCd[i]);
				if (rcvDt[i] != null)
					model.setRcvDt(rcvDt[i]);
				if (anrDeclNo[i] != null)
					model.setAnrDeclNo(anrDeclNo[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBKG_CSTMS_ANR_EDI_HISVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BKG_CSTMS_ANR_EDI_HISVO[]
	 */
	public BKG_CSTMS_ANR_EDI_HISVO[] getBKG_CSTMS_ANR_EDI_HISVOs(){
		BKG_CSTMS_ANR_EDI_HISVO[] vos = (BKG_CSTMS_ANR_EDI_HISVO[])models.toArray(new BKG_CSTMS_ANR_EDI_HISVO[models.size()]);
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
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.errCtnt = this.errCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.anrEdiRtnId = this.anrEdiRtnId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediSndUsrId = this.ediSndUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.msgLocCd = this.msgLocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sndOfcCd = this.sndOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.msgTpCd = this.msgTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sndDt = this.sndDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediMsgErrId = this.ediMsgErrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.refSeq = this.refSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.errDesc = this.errDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediSndStsCd = this.ediSndStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediRcvStsCd = this.ediRcvStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcvDt = this.rcvDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.anrDeclNo = this.anrDeclNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
