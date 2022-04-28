/*=========================================================
*Copyright(c) 2016 CyberLogitec
*@FileName : FileOpenHTMLAction.java
*@FileTitle : File Open Action
*Open Issues :
*Change history :
*@LastModifyDate : 2016.06.01
*@LastModifier : 정인선
*@LastVersion : 1.0
* 2016.06.01 정인선
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.fileopen.event;

/*=========================================================
*Copyright(c) 2016 CyberLogitec
*@FileName : 
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2016.06.01
*@LastModifier : 정인선
*@LastVersion : 1.0
* 2016.06.01 정인선
* 1.0 Creation
=========================================================*/
import javax.servlet.http.HttpServletRequest;

import com.clt.framework.core.controller.html.HTMLActionException;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.support.controller.HTMLActionSupport;
import com.clt.framework.support.controller.html.FormCommand;
import com.clt.syscommon.fileopen.vo.FileOpenVO;

/**
*
* @author 
* @since J2EE 1.6
* @see 
*/
public class FileOpenHTMLAction extends HTMLActionSupport {
	
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 * @param request HttpServletRequest HttpRequest
	 * @return Event Event interface를 구현한 객체
	 * @exception HTMLActionException
	 */
	@Override
	public Event perform(HttpServletRequest request) throws HTMLActionException {
		FormCommand command = FormCommand.fromRequest( request );
		FileOpenEvent event = new FileOpenEvent();
		if( command.isCommand( FormCommand.DEFAULT ) ) {
			event.setFileOpen((FileOpenVO)getVO(request, FileOpenVO.class));
		}
		return event;
	}

}
