/*========================================================
*Copyright(c) 2009 CyberLogitec
*ProcessChain    : NPI
*@FileName       : BackEndJobSampleHTMLAction.java
*@FileTitle      : NIS2010
*Open Issues     :
*Change history  :
*@LastModifyDate : 2009. 4. 21.
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
package com.clt.sample.backendjob.workonremotelongtxserver.event;

import javax.servlet.http.HttpServletRequest;

import com.clt.framework.core.controller.html.HTMLActionException;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.support.controller.HTMLActionSupport;
import com.clt.framework.support.controller.html.FormCommand;
import com.clt.framework.table.ComBakEndJbVO;

/**
 * It's BackEndJobSampleHTMLAction.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2EE 1.5
 * 2009. 4. 21.
 */
public class WorkOnRemoteLongTxServerSampleHTMLAction extends HTMLActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7998710839821779730L;

	/**
	 * BackEndJobSampe HTMLAction.
	 */
	public Event perform(HttpServletRequest request) throws HTMLActionException {
		FormCommand command = FormCommand.fromRequest(request);
		WorkOnRemoteLongTxServerSampleEvent event = new WorkOnRemoteLongTxServerSampleEvent();
		
		if(command.isCommand(FormCommand.SEARCH)) {
			event.setComBakEndJbVO((ComBakEndJbVO)getVO(request, ComBakEndJbVO .class));
		}
		event.setAttribute("KEY", request.getParameter("workremotejob_key"));

		
		return event;
	}	
}
