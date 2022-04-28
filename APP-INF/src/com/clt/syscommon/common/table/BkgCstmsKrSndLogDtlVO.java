/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgCstmsKrSndLogDtlVO.java
*@FileTitle : BkgCstmsKrSndLogDtlVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.03
*@LastModifier : 손윤석
*@LastVersion : 1.0
* 2009.07.03 손윤석 
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
 * @author 손윤석
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgCstmsKrSndLogDtlVO extends AbstractValueObject {

private static final long serialVersionUID = 1L;
	
	private Collection<BkgCstmsKrSndLogDtlVO> models = new ArrayList<BkgCstmsKrSndLogDtlVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String inBound = null;
	/* Column Info */
	private String inCorrData = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String inKsDate = null;
	/* Column Info */
	private String sndDt = null;
	/* Column Info */
	private String msgLogTpId = null;
	/* Column Info */
	private String ediSndMsg = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String ofcCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String inOfcCd = null;
	/* Column Info */
	private String logDtlSeq = null;
	/* Column Info */
	private String inUserId = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgCstmsKrSndLogDtlVO() {}

	public BkgCstmsKrSndLogDtlVO(String ibflag, String pagerows, String msgLogTpId, String sndDt, String ofcCd, String logDtlSeq, String ediSndMsg, String creUsrId, String creDt, String updUsrId, String updDt, String inBound, String inKsDate, String inOfcCd, String inCorrData, String inUserId) {
		this.updDt = updDt;
		this.inBound = inBound;
		this.inCorrData = inCorrData;
		this.creDt = creDt;
		this.inKsDate = inKsDate;
		this.sndDt = sndDt;
		this.msgLogTpId = msgLogTpId;
		this.ediSndMsg = ediSndMsg;
		this.pagerows = pagerows;
		this.ofcCd = ofcCd;
		this.ibflag = ibflag;
		this.creUsrId = creUsrId;
		this.inOfcCd = inOfcCd;
		this.logDtlSeq = logDtlSeq;
		this.inUserId = inUserId;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("in_bound", getInBound());
		this.hashColumns.put("in_corr_data", getInCorrData());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("in_ks_date", getInKsDate());
		this.hashColumns.put("snd_dt", getSndDt());
		this.hashColumns.put("msg_log_tp_id", getMsgLogTpId());
		this.hashColumns.put("edi_snd_msg", getEdiSndMsg());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ofc_cd", getOfcCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("in_ofc_cd", getInOfcCd());
		this.hashColumns.put("log_dtl_seq", getLogDtlSeq());
		this.hashColumns.put("in_user_id", getInUserId());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("in_bound", "inBound");
		this.hashFields.put("in_corr_data", "inCorrData");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("in_ks_date", "inKsDate");
		this.hashFields.put("snd_dt", "sndDt");
		this.hashFields.put("msg_log_tp_id", "msgLogTpId");
		this.hashFields.put("edi_snd_msg", "ediSndMsg");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ofc_cd", "ofcCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("in_ofc_cd", "inOfcCd");
		this.hashFields.put("log_dtl_seq", "logDtlSeq");
		this.hashFields.put("in_user_id", "inUserId");
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
	 * @return inBound
	 */
	public String getInBound() {
		return this.inBound;
	}
	
	/**
	 * Column Info
	 * @return inCorrData
	 */
	public String getInCorrData() {
		return this.inCorrData;
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
	 * @return inKsDate
	 */
	public String getInKsDate() {
		return this.inKsDate;
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
	 * @return msgLogTpId
	 */
	public String getMsgLogTpId() {
		return this.msgLogTpId;
	}
	
	/**
	 * Column Info
	 * @return ediSndMsg
	 */
	public String getEdiSndMsg() {
		return this.ediSndMsg;
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
	 * @return ofcCd
	 */
	public String getOfcCd() {
		return this.ofcCd;
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
	 * @return creUsrId
	 */
	public String getCreUsrId() {
		return this.creUsrId;
	}
	
	/**
	 * Column Info
	 * @return inOfcCd
	 */
	public String getInOfcCd() {
		return this.inOfcCd;
	}
	
	/**
	 * Column Info
	 * @return logDtlSeq
	 */
	public String getLogDtlSeq() {
		return this.logDtlSeq;
	}
	
	/**
	 * Column Info
	 * @return inUserId
	 */
	public String getInUserId() {
		return this.inUserId;
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
	 * @param inBound
	 */
	public void setInBound(String inBound) {
		this.inBound = inBound;
	}
	
	/**
	 * Column Info
	 * @param inCorrData
	 */
	public void setInCorrData(String inCorrData) {
		this.inCorrData = inCorrData;
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
	 * @param inKsDate
	 */
	public void setInKsDate(String inKsDate) {
		this.inKsDate = inKsDate;
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
	 * @param msgLogTpId
	 */
	public void setMsgLogTpId(String msgLogTpId) {
		this.msgLogTpId = msgLogTpId;
	}
	
	/**
	 * Column Info
	 * @param ediSndMsg
	 */
	public void setEdiSndMsg(String ediSndMsg) {
		this.ediSndMsg = ediSndMsg;
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
	 * @param ofcCd
	 */
	public void setOfcCd(String ofcCd) {
		this.ofcCd = ofcCd;
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
	 * @param creUsrId
	 */
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
	}
	
	/**
	 * Column Info
	 * @param inOfcCd
	 */
	public void setInOfcCd(String inOfcCd) {
		this.inOfcCd = inOfcCd;
	}
	
	/**
	 * Column Info
	 * @param logDtlSeq
	 */
	public void setLogDtlSeq(String logDtlSeq) {
		this.logDtlSeq = logDtlSeq;
	}
	
	/**
	 * Column Info
	 * @param inUserId
	 */
	public void setInUserId(String inUserId) {
		this.inUserId = inUserId;
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
		setInBound(JSPUtil.getParameter(request, "in_bound", ""));
		setInCorrData(JSPUtil.getParameter(request, "in_corr_data", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setInKsDate(JSPUtil.getParameter(request, "in_ks_date", ""));
		setSndDt(JSPUtil.getParameter(request, "snd_dt", ""));
		setMsgLogTpId(JSPUtil.getParameter(request, "msg_log_tp_id", ""));
		setEdiSndMsg(JSPUtil.getParameter(request, "edi_snd_msg", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setOfcCd(JSPUtil.getParameter(request, "ofc_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setInOfcCd(JSPUtil.getParameter(request, "in_ofc_cd", ""));
		setLogDtlSeq(JSPUtil.getParameter(request, "log_dtl_seq", ""));
		setInUserId(JSPUtil.getParameter(request, "in_user_id", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgCstmsKrSndLogDtlVO[]
	 */
	public BkgCstmsKrSndLogDtlVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgCstmsKrSndLogDtlVO[]
	 */
	public BkgCstmsKrSndLogDtlVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgCstmsKrSndLogDtlVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] inBound = (JSPUtil.getParameter(request, prefix	+ "in_bound", length));
			String[] inCorrData = (JSPUtil.getParameter(request, prefix	+ "in_corr_data", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] inKsDate = (JSPUtil.getParameter(request, prefix	+ "in_ks_date", length));
			String[] sndDt = (JSPUtil.getParameter(request, prefix	+ "snd_dt", length));
			String[] msgLogTpId = (JSPUtil.getParameter(request, prefix	+ "msg_log_tp_id", length));
			String[] ediSndMsg = (JSPUtil.getParameter(request, prefix	+ "edi_snd_msg", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ofcCd = (JSPUtil.getParameter(request, prefix	+ "ofc_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] inOfcCd = (JSPUtil.getParameter(request, prefix	+ "in_ofc_cd", length));
			String[] logDtlSeq = (JSPUtil.getParameter(request, prefix	+ "log_dtl_seq", length));
			String[] inUserId = (JSPUtil.getParameter(request, prefix	+ "in_user_id", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgCstmsKrSndLogDtlVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (inBound[i] != null)
					model.setInBound(inBound[i]);
				if (inCorrData[i] != null)
					model.setInCorrData(inCorrData[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (inKsDate[i] != null)
					model.setInKsDate(inKsDate[i]);
				if (sndDt[i] != null)
					model.setSndDt(sndDt[i]);
				if (msgLogTpId[i] != null)
					model.setMsgLogTpId(msgLogTpId[i]);
				if (ediSndMsg[i] != null)
					model.setEdiSndMsg(ediSndMsg[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ofcCd[i] != null)
					model.setOfcCd(ofcCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (inOfcCd[i] != null)
					model.setInOfcCd(inOfcCd[i]);
				if (logDtlSeq[i] != null)
					model.setLogDtlSeq(logDtlSeq[i]);
				if (inUserId[i] != null)
					model.setInUserId(inUserId[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgCstmsKrSndLogDtlVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgCstmsKrSndLogDtlVO[]
	 */
	public BkgCstmsKrSndLogDtlVO[] getBkgCstmsKrSndLogDtlVOs(){
		BkgCstmsKrSndLogDtlVO[] vos = (BkgCstmsKrSndLogDtlVO[])models.toArray(new BkgCstmsKrSndLogDtlVO[models.size()]);
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
		this.inBound = this.inBound .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.inCorrData = this.inCorrData .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.inKsDate = this.inKsDate .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sndDt = this.sndDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.msgLogTpId = this.msgLogTpId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediSndMsg = this.ediSndMsg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcCd = this.ofcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.inOfcCd = this.inOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.logDtlSeq = this.logDtlSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.inUserId = this.inUserId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}