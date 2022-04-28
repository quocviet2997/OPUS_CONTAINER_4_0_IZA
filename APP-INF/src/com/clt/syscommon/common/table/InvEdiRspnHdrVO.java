/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : InvEdiRspnHdrVO.java
*@FileTitle : InvEdiRspnHdrVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.04.27
*@LastModifier : 김세일
*@LastVersion : 1.0
* 2009.04.27 김세일 
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
 * @author 김세일
 * @since J2EE 1.5
 */

public class InvEdiRspnHdrVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<InvEdiRspnHdrVO> models = new ArrayList<InvEdiRspnHdrVO>();
	
	/* Column Info */
	private String rcvrAddr = null;
	/* Column Info */
	private String sndrAddr = null;
	/* Column Info */
	private String rcvrId = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String rcvrCeoNm = null;
	/* Column Info */
	private String rspnTpCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String msgNo = null;
	/* Column Info */
	private String sndrCeoNm = null;
	/* Column Info */
	private String msgRefNo = null;
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String msgNm = null;
	/* Column Info */
	private String sndrCoNm = null;
	/* Column Info */
	private String sndrId = null;
	/* Column Info */
	private String msgId = null;
	/* Column Info */
	private String custCntCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String invEditSndScsCd = null;
	/* Column Info */
	private String rcvrCoNm = null;
	/* Column Info */
	private String custSeq = null;
	/* Column Info */
	private String msgSndDtNo = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String sndrNm = null;
	/* Column Info */
	private String rcvrNm = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public InvEdiRspnHdrVO() {}

	public InvEdiRspnHdrVO(String ibflag, String pagerows, String msgId, String msgNo, String msgRefNo, String rspnTpCd, String sndrId, String sndrNm, String rcvrId, String rcvrNm, String msgNm, String invEditSndScsCd, String msgSndDtNo, String rcvrCoNm, String rcvrCeoNm, String rcvrAddr, String sndrCoNm, String sndrCeoNm, String sndrAddr, String custCntCd, String custSeq, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.rcvrAddr = rcvrAddr;
		this.sndrAddr = sndrAddr;
		this.rcvrId = rcvrId;
		this.creDt = creDt;
		this.rcvrCeoNm = rcvrCeoNm;
		this.rspnTpCd = rspnTpCd;
		this.pagerows = pagerows;
		this.msgNo = msgNo;
		this.sndrCeoNm = sndrCeoNm;
		this.msgRefNo = msgRefNo;
		this.ibflag = ibflag;
		this.msgNm = msgNm;
		this.sndrCoNm = sndrCoNm;
		this.sndrId = sndrId;
		this.msgId = msgId;
		this.custCntCd = custCntCd;
		this.updUsrId = updUsrId;
		this.updDt = updDt;
		this.invEditSndScsCd = invEditSndScsCd;
		this.rcvrCoNm = rcvrCoNm;
		this.custSeq = custSeq;
		this.msgSndDtNo = msgSndDtNo;
		this.creUsrId = creUsrId;
		this.sndrNm = sndrNm;
		this.rcvrNm = rcvrNm;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("rcvr_addr", getRcvrAddr());
		this.hashColumns.put("sndr_addr", getSndrAddr());
		this.hashColumns.put("rcvr_id", getRcvrId());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("rcvr_ceo_nm", getRcvrCeoNm());
		this.hashColumns.put("rspn_tp_cd", getRspnTpCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("msg_no", getMsgNo());
		this.hashColumns.put("sndr_ceo_nm", getSndrCeoNm());
		this.hashColumns.put("msg_ref_no", getMsgRefNo());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("msg_nm", getMsgNm());
		this.hashColumns.put("sndr_co_nm", getSndrCoNm());
		this.hashColumns.put("sndr_id", getSndrId());
		this.hashColumns.put("msg_id", getMsgId());
		this.hashColumns.put("cust_cnt_cd", getCustCntCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("inv_edit_snd_scs_cd", getInvEditSndScsCd());
		this.hashColumns.put("rcvr_co_nm", getRcvrCoNm());
		this.hashColumns.put("cust_seq", getCustSeq());
		this.hashColumns.put("msg_snd_dt_no", getMsgSndDtNo());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("sndr_nm", getSndrNm());
		this.hashColumns.put("rcvr_nm", getRcvrNm());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("rcvr_addr", "rcvrAddr");
		this.hashFields.put("sndr_addr", "sndrAddr");
		this.hashFields.put("rcvr_id", "rcvrId");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("rcvr_ceo_nm", "rcvrCeoNm");
		this.hashFields.put("rspn_tp_cd", "rspnTpCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("msg_no", "msgNo");
		this.hashFields.put("sndr_ceo_nm", "sndrCeoNm");
		this.hashFields.put("msg_ref_no", "msgRefNo");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("msg_nm", "msgNm");
		this.hashFields.put("sndr_co_nm", "sndrCoNm");
		this.hashFields.put("sndr_id", "sndrId");
		this.hashFields.put("msg_id", "msgId");
		this.hashFields.put("cust_cnt_cd", "custCntCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("inv_edit_snd_scs_cd", "invEditSndScsCd");
		this.hashFields.put("rcvr_co_nm", "rcvrCoNm");
		this.hashFields.put("cust_seq", "custSeq");
		this.hashFields.put("msg_snd_dt_no", "msgSndDtNo");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("sndr_nm", "sndrNm");
		this.hashFields.put("rcvr_nm", "rcvrNm");
		return this.hashFields;
	}
	
	public String getRcvrAddr() {
		return this.rcvrAddr;
	}
	public String getSndrAddr() {
		return this.sndrAddr;
	}
	public String getRcvrId() {
		return this.rcvrId;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getRcvrCeoNm() {
		return this.rcvrCeoNm;
	}
	public String getRspnTpCd() {
		return this.rspnTpCd;
	}
	public String getPagerows() {
		return this.pagerows;
	}
	public String getMsgNo() {
		return this.msgNo;
	}
	public String getSndrCeoNm() {
		return this.sndrCeoNm;
	}
	public String getMsgRefNo() {
		return this.msgRefNo;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getMsgNm() {
		return this.msgNm;
	}
	public String getSndrCoNm() {
		return this.sndrCoNm;
	}
	public String getSndrId() {
		return this.sndrId;
	}
	public String getMsgId() {
		return this.msgId;
	}
	public String getCustCntCd() {
		return this.custCntCd;
	}
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	public String getUpdDt() {
		return this.updDt;
	}
	public String getInvEditSndScsCd() {
		return this.invEditSndScsCd;
	}
	public String getRcvrCoNm() {
		return this.rcvrCoNm;
	}
	public String getCustSeq() {
		return this.custSeq;
	}
	public String getMsgSndDtNo() {
		return this.msgSndDtNo;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getSndrNm() {
		return this.sndrNm;
	}
	public String getRcvrNm() {
		return this.rcvrNm;
	}

	public void setRcvrAddr(String rcvrAddr) {
		this.rcvrAddr = rcvrAddr;
		//this.rcvrAddr=true;
	}
	public void setSndrAddr(String sndrAddr) {
		this.sndrAddr = sndrAddr;
		//this.sndrAddr=true;
	}
	public void setRcvrId(String rcvrId) {
		this.rcvrId = rcvrId;
		//this.rcvrId=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setRcvrCeoNm(String rcvrCeoNm) {
		this.rcvrCeoNm = rcvrCeoNm;
		//this.rcvrCeoNm=true;
	}
	public void setRspnTpCd(String rspnTpCd) {
		this.rspnTpCd = rspnTpCd;
		//this.rspnTpCd=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void setMsgNo(String msgNo) {
		this.msgNo = msgNo;
		//this.msgNo=true;
	}
	public void setSndrCeoNm(String sndrCeoNm) {
		this.sndrCeoNm = sndrCeoNm;
		//this.sndrCeoNm=true;
	}
	public void setMsgRefNo(String msgRefNo) {
		this.msgRefNo = msgRefNo;
		//this.msgRefNo=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setMsgNm(String msgNm) {
		this.msgNm = msgNm;
		//this.msgNm=true;
	}
	public void setSndrCoNm(String sndrCoNm) {
		this.sndrCoNm = sndrCoNm;
		//this.sndrCoNm=true;
	}
	public void setSndrId(String sndrId) {
		this.sndrId = sndrId;
		//this.sndrId=true;
	}
	public void setMsgId(String msgId) {
		this.msgId = msgId;
		//this.msgId=true;
	}
	public void setCustCntCd(String custCntCd) {
		this.custCntCd = custCntCd;
		//this.custCntCd=true;
	}
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setInvEditSndScsCd(String invEditSndScsCd) {
		this.invEditSndScsCd = invEditSndScsCd;
		//this.invEditSndScsCd=true;
	}
	public void setRcvrCoNm(String rcvrCoNm) {
		this.rcvrCoNm = rcvrCoNm;
		//this.rcvrCoNm=true;
	}
	public void setCustSeq(String custSeq) {
		this.custSeq = custSeq;
		//this.custSeq=true;
	}
	public void setMsgSndDtNo(String msgSndDtNo) {
		this.msgSndDtNo = msgSndDtNo;
		//this.msgSndDtNo=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setSndrNm(String sndrNm) {
		this.sndrNm = sndrNm;
		//this.sndrNm=true;
	}
	public void setRcvrNm(String rcvrNm) {
		this.rcvrNm = rcvrNm;
		//this.rcvrNm=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setRcvrAddr(JSPUtil.getParameter(request, "rcvr_addr", ""));
		setSndrAddr(JSPUtil.getParameter(request, "sndr_addr", ""));
		setRcvrId(JSPUtil.getParameter(request, "rcvr_id", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setRcvrCeoNm(JSPUtil.getParameter(request, "rcvr_ceo_nm", ""));
		setRspnTpCd(JSPUtil.getParameter(request, "rspn_tp_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setMsgNo(JSPUtil.getParameter(request, "msg_no", ""));
		setSndrCeoNm(JSPUtil.getParameter(request, "sndr_ceo_nm", ""));
		setMsgRefNo(JSPUtil.getParameter(request, "msg_ref_no", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setMsgNm(JSPUtil.getParameter(request, "msg_nm", ""));
		setSndrCoNm(JSPUtil.getParameter(request, "sndr_co_nm", ""));
		setSndrId(JSPUtil.getParameter(request, "sndr_id", ""));
		setMsgId(JSPUtil.getParameter(request, "msg_id", ""));
		setCustCntCd(JSPUtil.getParameter(request, "cust_cnt_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setInvEditSndScsCd(JSPUtil.getParameter(request, "inv_edit_snd_scs_cd", ""));
		setRcvrCoNm(JSPUtil.getParameter(request, "rcvr_co_nm", ""));
		setCustSeq(JSPUtil.getParameter(request, "cust_seq", ""));
		setMsgSndDtNo(JSPUtil.getParameter(request, "msg_snd_dt_no", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setSndrNm(JSPUtil.getParameter(request, "sndr_nm", ""));
		setRcvrNm(JSPUtil.getParameter(request, "rcvr_nm", ""));
	}

	public InvEdiRspnHdrVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public InvEdiRspnHdrVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		InvEdiRspnHdrVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] rcvrAddr = (JSPUtil.getParameter(request, prefix	+ "rcvr_addr".trim(), length));
			String[] sndrAddr = (JSPUtil.getParameter(request, prefix	+ "sndr_addr".trim(), length));
			String[] rcvrId = (JSPUtil.getParameter(request, prefix	+ "rcvr_id".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] rcvrCeoNm = (JSPUtil.getParameter(request, prefix	+ "rcvr_ceo_nm".trim(), length));
			String[] rspnTpCd = (JSPUtil.getParameter(request, prefix	+ "rspn_tp_cd".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] msgNo = (JSPUtil.getParameter(request, prefix	+ "msg_no".trim(), length));
			String[] sndrCeoNm = (JSPUtil.getParameter(request, prefix	+ "sndr_ceo_nm".trim(), length));
			String[] msgRefNo = (JSPUtil.getParameter(request, prefix	+ "msg_ref_no".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] msgNm = (JSPUtil.getParameter(request, prefix	+ "msg_nm".trim(), length));
			String[] sndrCoNm = (JSPUtil.getParameter(request, prefix	+ "sndr_co_nm".trim(), length));
			String[] sndrId = (JSPUtil.getParameter(request, prefix	+ "sndr_id".trim(), length));
			String[] msgId = (JSPUtil.getParameter(request, prefix	+ "msg_id".trim(), length));
			String[] custCntCd = (JSPUtil.getParameter(request, prefix	+ "cust_cnt_cd".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] invEditSndScsCd = (JSPUtil.getParameter(request, prefix	+ "inv_edit_snd_scs_cd".trim(), length));
			String[] rcvrCoNm = (JSPUtil.getParameter(request, prefix	+ "rcvr_co_nm".trim(), length));
			String[] custSeq = (JSPUtil.getParameter(request, prefix	+ "cust_seq".trim(), length));
			String[] msgSndDtNo = (JSPUtil.getParameter(request, prefix	+ "msg_snd_dt_no".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] sndrNm = (JSPUtil.getParameter(request, prefix	+ "sndr_nm".trim(), length));
			String[] rcvrNm = (JSPUtil.getParameter(request, prefix	+ "rcvr_nm".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new InvEdiRspnHdrVO();
				if (rcvrAddr[i] != null)
					model.setRcvrAddr(rcvrAddr[i]);
				if (sndrAddr[i] != null)
					model.setSndrAddr(sndrAddr[i]);
				if (rcvrId[i] != null)
					model.setRcvrId(rcvrId[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (rcvrCeoNm[i] != null)
					model.setRcvrCeoNm(rcvrCeoNm[i]);
				if (rspnTpCd[i] != null)
					model.setRspnTpCd(rspnTpCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (msgNo[i] != null)
					model.setMsgNo(msgNo[i]);
				if (sndrCeoNm[i] != null)
					model.setSndrCeoNm(sndrCeoNm[i]);
				if (msgRefNo[i] != null)
					model.setMsgRefNo(msgRefNo[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (msgNm[i] != null)
					model.setMsgNm(msgNm[i]);
				if (sndrCoNm[i] != null)
					model.setSndrCoNm(sndrCoNm[i]);
				if (sndrId[i] != null)
					model.setSndrId(sndrId[i]);
				if (msgId[i] != null)
					model.setMsgId(msgId[i]);
				if (custCntCd[i] != null)
					model.setCustCntCd(custCntCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (invEditSndScsCd[i] != null)
					model.setInvEditSndScsCd(invEditSndScsCd[i]);
				if (rcvrCoNm[i] != null)
					model.setRcvrCoNm(rcvrCoNm[i]);
				if (custSeq[i] != null)
					model.setCustSeq(custSeq[i]);
				if (msgSndDtNo[i] != null)
					model.setMsgSndDtNo(msgSndDtNo[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (sndrNm[i] != null)
					model.setSndrNm(sndrNm[i]);
				if (rcvrNm[i] != null)
					model.setRcvrNm(rcvrNm[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getInvEdiRspnHdrVOs();
	}

	public InvEdiRspnHdrVO[] getInvEdiRspnHdrVOs(){
		InvEdiRspnHdrVO[] vos = (InvEdiRspnHdrVO[])models.toArray(new InvEdiRspnHdrVO[models.size()]);
		return vos;
	}
	
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
		} catch (Exception ex) {}
		return ret.toString();
	}
	
	/**
	 * 각 클래스 해당하는 필드 정보를 배열에 담는다 
	 * @param field
	 * @param i
	 * @return String[]
	 * @throws IllegalAccessException
	 */
	private String[] getField(Field[] field, int i) throws IllegalAccessException {
		String[] arr;
		try{
			arr = (String[]) field[i].get(this);
		}catch(Exception ex){
			arr = new String[1];
			arr[0] = String.valueOf(field[i].get(this));
		}
		return arr;
	}
	
	/**
	* DataFormat 설정
	*/
	public void onDataFormat(){
		this.rcvrAddr = this.rcvrAddr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sndrAddr = this.sndrAddr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcvrId = this.rcvrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcvrCeoNm = this.rcvrCeoNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rspnTpCd = this.rspnTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.msgNo = this.msgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sndrCeoNm = this.sndrCeoNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.msgRefNo = this.msgRefNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.msgNm = this.msgNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sndrCoNm = this.sndrCoNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sndrId = this.sndrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.msgId = this.msgId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custCntCd = this.custCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invEditSndScsCd = this.invEditSndScsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcvrCoNm = this.rcvrCoNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custSeq = this.custSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.msgSndDtNo = this.msgSndDtNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sndrNm = this.sndrNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcvrNm = this.rcvrNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
