/*========================================================
*Copyright(c) 2016 CyberLogitec
*ProcessChain    : TIS
*@FileName       : MailMonitoringHTMLAction.java
*@FileTitle      	 : 
*@Author           : Jeong-Hoon, KIM
*Open Issues     :
*Change history  :
*@LastModifyDate : 2016. 3. 16.
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
package com.clt.syscommon.management.opus.mailmonitoring.event;

import javax.servlet.http.HttpServletRequest;

import com.clt.framework.core.controller.html.HTMLActionException;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.support.controller.HTMLActionSupport;
import com.clt.framework.support.controller.html.FormCommand;
import com.clt.framework.table.ComEmlSndInfoVO;
import com.clt.utilitybox.utility.CalendarUtility;

/**
 * MailMonitoringHTMLAction.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2SE 1.6
 * 2016. 3. 16.
 */
public class MailMonitoringHTMLAction extends HTMLActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2544063530015442409L;

	/**
	 * 
	 * perform
	 * @author Jeong-Hoon, KIM
	 * @param request
	 * @return
	 * @throws HTMLActionException Event
	 */
	public Event perform(HttpServletRequest request) throws HTMLActionException {
		FormCommand formCommand = FormCommand.fromRequest(request);
		ComEmlSndInfoVO comEmlSndInfoVO = (ComEmlSndInfoVO)getVO(request, ComEmlSndInfoVO.class);
		if(formCommand.isCommand(FormCommand.COMMAND01)){
			MailMonitoringSendEvent mailMonitoringSendEvent = new MailMonitoringSendEvent();
			mailMonitoringSendEvent.setAttribute("eml_snd_no", comEmlSndInfoVO.getEmlSndNo());
			return mailMonitoringSendEvent;
		}else if(formCommand.isCommand(FormCommand.SEARCH01)){
			MailMonitoringEvent mailMonitoringEvent = new MailMonitoringEvent();
			String emlDt = request.getParameter("emlDate").replace("-", "")+request.getParameter("emlHour")+request.getParameter("emlMinute")+"00";
			comEmlSndInfoVO.setEmlDt(emlDt);
			mailMonitoringEvent.setAttribute("ComEmlSndInfoVO", comEmlSndInfoVO);
			return mailMonitoringEvent;
		}else{
			MailMonitoringEvent mailMonitoringEvent = new MailMonitoringEvent();
			String emlDt = CalendarUtility.getTodayYearMonthDayHourMinuteSecond();
			comEmlSndInfoVO.setEmlDt(emlDt);
			mailMonitoringEvent.setAttribute("ComEmlSndInfoVO", comEmlSndInfoVO);
			return mailMonitoringEvent;
		}
	}

}

