/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ComMsgDataVO.java
*@FileTitle : ComMsgDataVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.08.03
*@LastModifier : 
*@LastVersion : 1.0
* 2009.08.03  
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.common.messages.vo;

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
 * @author 
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class ComMsgDataVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<ComMsgDataVO> models = new ArrayList<ComMsgDataVO>();
	
	/* Column Info */
	private String rcvrUsrNm = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String kepFlg = null;
	/* Column Info */
	private String rcvDt = null;
	/* Column Info */
	private String msgId = null;
	/* Column Info */
	private String msgCtnt = null;
	/* Column Info */
	private String rcvrUsrId = null;
	/* Column Info */
	private String sndDt = null;
	/* Column Info */
	private String sndrUsrId = null;
	/* Column Info */
	private String sndrUsrNm = null;
	/* Page Number */
	private String pagerows = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public ComMsgDataVO() {}

	public ComMsgDataVO(String ibflag, String pagerows, String msgId, String sndrUsrId, String sndrUsrNm, String sndDt, String msgCtnt, String rcvrUsrId, String rcvrUsrNm, String rcvDt, String kepFlg, String deltFlg) {
		this.rcvrUsrNm = rcvrUsrNm;
		this.ibflag = ibflag;
		this.deltFlg = deltFlg;
		this.kepFlg = kepFlg;
		this.rcvDt = rcvDt;
		this.msgId = msgId;
		this.msgCtnt = msgCtnt;
		this.rcvrUsrId = rcvrUsrId;
		this.sndDt = sndDt;
		this.sndrUsrId = sndrUsrId;
		this.sndrUsrNm = sndrUsrNm;
		this.pagerows = pagerows;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("rcvr_usr_nm", getRcvrUsrNm());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("kep_flg", getKepFlg());
		this.hashColumns.put("rcv_dt", getRcvDt());
		this.hashColumns.put("msg_id", getMsgId());
		this.hashColumns.put("msg_ctnt", getMsgCtnt());
		this.hashColumns.put("rcvr_usr_id", getRcvrUsrId());
		this.hashColumns.put("snd_dt", getSndDt());
		this.hashColumns.put("sndr_usr_id", getSndrUsrId());
		this.hashColumns.put("sndr_usr_nm", getSndrUsrNm());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("rcvr_usr_nm", "rcvrUsrNm");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("kep_flg", "kepFlg");
		this.hashFields.put("rcv_dt", "rcvDt");
		this.hashFields.put("msg_id", "msgId");
		this.hashFields.put("msg_ctnt", "msgCtnt");
		this.hashFields.put("rcvr_usr_id", "rcvrUsrId");
		this.hashFields.put("snd_dt", "sndDt");
		this.hashFields.put("sndr_usr_id", "sndrUsrId");
		this.hashFields.put("sndr_usr_nm", "sndrUsrNm");
		this.hashFields.put("pagerows", "pagerows");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return rcvrUsrNm
	 */
	public String getRcvrUsrNm() {
		return this.rcvrUsrNm;
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
	 * @return deltFlg
	 */
	public String getDeltFlg() {
		return this.deltFlg;
	}
	
	/**
	 * Column Info
	 * @return kepFlg
	 */
	public String getKepFlg() {
		return this.kepFlg;
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
	 * @return msgId
	 */
	public String getMsgId() {
		return this.msgId;
	}
	
	/**
	 * Column Info
	 * @return msgCtnt
	 */
	public String getMsgCtnt() {
		return this.msgCtnt;
	}
	
	/**
	 * Column Info
	 * @return rcvrUsrId
	 */
	public String getRcvrUsrId() {
		return this.rcvrUsrId;
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
	 * @return sndrUsrId
	 */
	public String getSndrUsrId() {
		return this.sndrUsrId;
	}
	
	/**
	 * Column Info
	 * @return sndrUsrNm
	 */
	public String getSndrUsrNm() {
		return this.sndrUsrNm;
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
	 * @param rcvrUsrNm
	 */
	public void setRcvrUsrNm(String rcvrUsrNm) {
		this.rcvrUsrNm = rcvrUsrNm;
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
	 * @param deltFlg
	 */
	public void setDeltFlg(String deltFlg) {
		this.deltFlg = deltFlg;
	}
	
	/**
	 * Column Info
	 * @param kepFlg
	 */
	public void setKepFlg(String kepFlg) {
		this.kepFlg = kepFlg;
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
	 * @param msgId
	 */
	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}
	
	/**
	 * Column Info
	 * @param msgCtnt
	 */
	public void setMsgCtnt(String msgCtnt) {
		this.msgCtnt = msgCtnt;
	}
	
	/**
	 * Column Info
	 * @param rcvrUsrId
	 */
	public void setRcvrUsrId(String rcvrUsrId) {
		this.rcvrUsrId = rcvrUsrId;
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
	 * @param sndrUsrId
	 */
	public void setSndrUsrId(String sndrUsrId) {
		this.sndrUsrId = sndrUsrId;
	}
	
	/**
	 * Column Info
	 * @param sndrUsrNm
	 */
	public void setSndrUsrNm(String sndrUsrNm) {
		this.sndrUsrNm = sndrUsrNm;
	}
	
	/**
	 * Page Number
	 * @param pagerows
	 */
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setRcvrUsrNm(JSPUtil.getParameter(request, "rcvr_usr_nm", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setDeltFlg(JSPUtil.getParameter(request, "delt_flg", ""));
		setKepFlg(JSPUtil.getParameter(request, "kep_flg", ""));
		setRcvDt(JSPUtil.getParameter(request, "rcv_dt", ""));
		setMsgId(JSPUtil.getParameter(request, "msg_id", ""));
		setMsgCtnt(JSPUtil.getParameter(request, "msg_ctnt", ""));
		setRcvrUsrId(JSPUtil.getParameter(request, "rcvr_usr_id", ""));
		setSndDt(JSPUtil.getParameter(request, "snd_dt", ""));
		setSndrUsrId(JSPUtil.getParameter(request, "sndr_usr_id", ""));
		setSndrUsrNm(JSPUtil.getParameter(request, "sndr_usr_nm", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return ComMsgDataVO[]
	 */
	public ComMsgDataVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return ComMsgDataVO[]
	 */
	public ComMsgDataVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		ComMsgDataVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] rcvrUsrNm = (JSPUtil.getParameter(request, prefix	+ "rcvr_usr_nm", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] kepFlg = (JSPUtil.getParameter(request, prefix	+ "kep_flg", length));
			String[] rcvDt = (JSPUtil.getParameter(request, prefix	+ "rcv_dt", length));
			String[] msgId = (JSPUtil.getParameter(request, prefix	+ "msg_id", length));
			String[] msgCtnt = (JSPUtil.getParameter(request, prefix	+ "msg_ctnt", length));
			String[] rcvrUsrId = (JSPUtil.getParameter(request, prefix	+ "rcvr_usr_id", length));
			String[] sndDt = (JSPUtil.getParameter(request, prefix	+ "snd_dt", length));
			String[] sndrUsrId = (JSPUtil.getParameter(request, prefix	+ "sndr_usr_id", length));
			String[] sndrUsrNm = (JSPUtil.getParameter(request, prefix	+ "sndr_usr_nm", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			
			for (int i = 0; i < length; i++) {
				model = new ComMsgDataVO();
				if (rcvrUsrNm[i] != null)
					model.setRcvrUsrNm(rcvrUsrNm[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (kepFlg[i] != null)
					model.setKepFlg(kepFlg[i]);
				if (rcvDt[i] != null)
					model.setRcvDt(rcvDt[i]);
				if (msgId[i] != null)
					model.setMsgId(msgId[i]);
				if (msgCtnt[i] != null)
					model.setMsgCtnt(msgCtnt[i]);
				if (rcvrUsrId[i] != null)
					model.setRcvrUsrId(rcvrUsrId[i]);
				if (sndDt[i] != null)
					model.setSndDt(sndDt[i]);
				if (sndrUsrId[i] != null)
					model.setSndrUsrId(sndrUsrId[i]);
				if (sndrUsrNm[i] != null)
					model.setSndrUsrNm(sndrUsrNm[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getComMsgDataVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return ComMsgDataVO[]
	 */
	public ComMsgDataVO[] getComMsgDataVOs(){
		ComMsgDataVO[] vos = (ComMsgDataVO[])models.toArray(new ComMsgDataVO[models.size()]);
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
		this.rcvrUsrNm = this.rcvrUsrNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.kepFlg = this.kepFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcvDt = this.rcvDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.msgId = this.msgId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.msgCtnt = this.msgCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcvrUsrId = this.rcvrUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sndDt = this.sndDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sndrUsrId = this.sndrUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sndrUsrNm = this.sndrUsrNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
