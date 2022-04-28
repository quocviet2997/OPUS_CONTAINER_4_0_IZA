/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : MessageEvent.java
*@FileTitle : Message
*Open Issues :
*Change history :
*@LastModifyDate : 2009.01.02
*@LastModifier : 정인선
*@LastVersion : 1.0
* 2009.01.02 정인선
* 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.common.messages.event;

import java.util.Arrays;

import com.clt.framework.support.layer.event.EventSupport;
import com.clt.syscommon.common.table.ComMsgRcvVO;
import com.clt.syscommon.common.table.ComMsgSndVO;

/**
 * Message 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * -  MessageHTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Jung_InSun
 * @see MessageHTMLAction 참조
 * @since J2EE 1.4
 */

public class MessageEvent extends EventSupport {

	private static final long serialVersionUID = -1238470617317672615L;
	
	private ComMsgSndVO[] comMsgSnds = null;

	private ComMsgRcvVO[] comMsgRcvs = null;
	
	private ComMsgSndVO comMsgSnd = null;
	private ComMsgRcvVO comMsgRcv = null;
	
	private String div = null;
	private String deltFlg = null;
	private String kepFlg = null;
	private String rcvDt = null;
	private String usrId = null;
	private String msgId = null;
	private String rcvrId = null;
	private String rcvrNm = null;
	private String msgCtnt = null;

	public MessageEvent(){}

	/**
	 * MessageEvent 객체 생성<br>
	 * MessageEvent를 생성한다.<br>
	 * @param ComMsgSndVO[] comMsgSnds
	 * @param ComMsgRcvVO[] comMsgRcvs
	 */
	public MessageEvent(ComMsgSndVO[] comMsgSnds, ComMsgRcvVO[] comMsgRcvs) {
		this.comMsgSnds = comMsgSnds;
		this.comMsgRcvs = comMsgRcvs;
    }

	public ComMsgSndVO[] getComMsgSnds(){
		ComMsgSndVO[] rtnVOs = null;
		if (this.comMsgSnds != null) {
			rtnVOs = Arrays.copyOf(comMsgSnds, comMsgSnds.length);
		}
		return rtnVOs;
	}

	public ComMsgRcvVO[] getComMsgRcvs() {
		ComMsgRcvVO[] rtnVOs = null;
		if (this.comMsgRcvs != null) {
			rtnVOs = Arrays.copyOf(comMsgRcvs, comMsgRcvs.length);
		}
		return rtnVOs;
	}

	/**
	 * @param comMsgRcv the comMsgRcv to set
	 */
	public void setComMsgRcv(ComMsgRcvVO comMsgRcv) {
		this.comMsgRcv = comMsgRcv;
	}

	/**
	 * @return the comMsgRcv
	 */
	public ComMsgRcvVO getComMsgRcv() {
		return comMsgRcv;
	}

	/**
	 * @param comMsgSnd the comMsgSnd to set
	 */
	public void setComMsgSnd(ComMsgSndVO comMsgSnd) {
		this.comMsgSnd = comMsgSnd;
	}

	/**
	 * @return the comMsgSnd
	 */
	public ComMsgSndVO getComMsgSnd() {
		return comMsgSnd;
	}

	/**
	 * @param div the div to set
	 */
	public void setDiv(String div) {
		this.div = div;
	}

	/**
	 * @return the div
	 */
	public String getDiv() {
		return div;
	}

	/**
	 * @param deltFlg the deltFlg to set
	 */
	public void setDeltFlg(String deltFlg) {
		this.deltFlg = deltFlg;
	}

	/**
	 * @return the deltFlg
	 */
	public String getDeltFlg() {
		return deltFlg;
	}

	/**
	 * @param kepFlg the kepFlg to set
	 */
	public void setKepFlg(String kepFlg) {
		this.kepFlg = kepFlg;
	}

	/**
	 * @return the kepFlg
	 */
	public String getKepFlg() {
		return kepFlg;
	}

	/**
	 * @param rcvDt the rcvDt to set
	 */
	public void setRcvDt(String rcvDt) {
		this.rcvDt = rcvDt;
	}

	/**
	 * @return the rcvDt
	 */
	public String getRcvDt() {
		return rcvDt;
	}

	/**
	 * @param usrId the usrId to set
	 */
	public void setUsrId(String usrId) {
		this.usrId = usrId;
	}

	/**
	 * @return the usrId
	 */
	public String getUsrId() {
		return usrId;
	}

	/**
	 * @param msgId the msgId to set
	 */
	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}

	/**
	 * @return the msgId
	 */
	public String getMsgId() {
		return msgId;
	}

	/**
	 * It's Getter. 
	 * @returnType String
	 * @return the rcvrId
	 */
	public String getRcvrId() {
		return rcvrId;
	}

	/**
	 * It's Setter. String
	 * @param rcvrId the rcvrId to set
	 */
	public void setRcvrId(String rcvrId) {
		this.rcvrId = rcvrId;
	}

	/**
	 * It's Getter. 
	 * @returnType String
	 * @return the rcvrNm
	 */
	public String getRcvrNm() {
		return rcvrNm;
	}

	/**
	 * It's Setter. String
	 * @param rcvrNm the rcvrNm to set
	 */
	public void setRcvrNm(String rcvrNm) {
		this.rcvrNm = rcvrNm;
	}

	/**
	 * It's Getter. 
	 * @returnType String
	 * @return the msgCtnt
	 */
	public String getMsgCtnt() {
		return msgCtnt;
	}

	/**
	 * It's Setter. String
	 * @param msgCtnt the msgCtnt to set
	 */
	public void setMsgCtnt(String msgCtnt) {
		this.msgCtnt = msgCtnt;
	}

}
