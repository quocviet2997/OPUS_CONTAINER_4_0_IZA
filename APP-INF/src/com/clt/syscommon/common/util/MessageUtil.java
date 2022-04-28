/*=========================================================
 *Copyright(c) 2008 CyberLogitec
 *@FileName : MessageUtil.java
 *@FileTitle : MessageUtil
 *Open Issues :
 *Change history :
 *@LastModifyDate : 2008.12.23
 *@LastModifier : 정인선
 *@LastVersion : 1.0
 * 2008.12.23 정인선
 * 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.common.util;

import java.util.HashMap;
import java.util.Map;

import com.clt.syscommon.common.messages.integration.MessagesDAO;

/**
 * NIS2010-MessageUtil.
 * 
 * @author Jung_InSun
 * @see MessagesDBDAO
 * @since J2EE 1.4
 */
public class MessageUtil {
	
	/**
	  * 업무시스템에서 자동으로 Message를 발송하기 위한 메소드..
	 * @param sndNm	보내는사람 이름
	 * @param sndrId	보내는사람 아이디
	 * @param rcvNm	받는사람 이름
	 * @param rcvrId	받는사람 아이디
	 * @param content	메시지 내용
	 * @return		메시지 ID
	 */
	public String messageInsert(String sndNm, String sndrId, String rcvNm, String rcvrId, String content){
		String msgId = "";
		Map<String,Object> params = new HashMap<String, Object>();
		if( !sndNm.equals("") && !sndrId.equals("") && !rcvNm.equals("") && !rcvrId.equals("") ) {
			params.put("sndr_usr_nm", sndNm);
			params.put("sndr_usr_id", sndrId);
			params.put("rcvr_usr_nm", rcvNm);
			params.put("rcvr_usr_id", rcvrId);
			params.put("msg_ctnt", content);
			params.put("kep_flg", "N");
			MessagesDAO dao = new MessagesDAO();
			msgId = dao.messageInset(params);
		}

		return msgId;
	}

}
