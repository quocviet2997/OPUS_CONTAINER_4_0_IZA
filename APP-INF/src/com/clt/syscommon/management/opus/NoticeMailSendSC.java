/*========================================================
*Copyright(c) 2016 CyberLogitec
*ProcessChain    : TIS
*@FileName       : NoticeMailSC.java
*@FileTitle      	 : 
*@Author           : Jeong-Hoon, KIM
*Open Issues     :
*Change history  :
*@LastModifyDate : 2016. 3. 8.
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
package com.clt.syscommon.management.opus;

import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.core.layer.event.GeneralEventResponse;
import com.clt.framework.support.layer.service.ServiceCommandSupport;
import com.clt.syscommon.management.opus.mail.basic.NoticeMailBC;
import com.clt.syscommon.management.opus.mail.basic.NoticeMailBCImpl;
import com.clt.syscommon.management.opus.mail.vo.NoticeMailVO;

/**
 * NoticeMailSC.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2SE 1.6
 * 2016. 3. 8.
 */
public class NoticeMailSendSC extends ServiceCommandSupport {
	
	/**
	 * 
	 * perform
	 * @author Jeong-Hoon, KIM
	 * @param event
	 * @return
	 * @throws EventException EventResponse
	 */
	public EventResponse perform(Event event) throws EventException {
		NoticeMailBC noticeMailBC = new NoticeMailBCImpl();
		noticeMailBC.sendNoticeMail((NoticeMailVO)event.getAttribute("NoticeMailVO"));
		begin();
		commit();
		GeneralEventResponse generalEventResponse = new GeneralEventResponse();
		return generalEventResponse;
	}

}

