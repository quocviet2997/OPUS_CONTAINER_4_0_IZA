package com.clt.sample.lang.multylangaccess.event;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import com.clt.framework.core.controller.html.HTMLActionException;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.support.controller.HTMLActionSupport;
import com.clt.framework.support.controller.html.FormCommand;
import com.clt.framework.support.view.signon.web.SignOnFilter;
import com.clt.syscommon.common.table.ComUserVO;

public class MULTYLANGACCESSHTMLAction extends HTMLActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MULTYLANGACCESSHTMLAction() {}
	
	
	@Override
	public Event perform(HttpServletRequest request) throws HTMLActionException {
		String lang_tp_cd = (String) request.getSession().getAttribute(SignOnFilter.FORM_LANG_TP_CD_TYPE);
		
		MultyLangEvent event = new MultyLangEvent();
		ComUserVO testVo = (ComUserVO)getVO(request, ComUserVO.class);
		testVo.setLangTpCd(lang_tp_cd);
		event.setComUserVO(testVo);
		request.setAttribute("Event", event);
		
		return event;
	}

	
	@Override
	public void doEnd(ServletRequest request, EventResponse eventResponse) {
		request.setAttribute("EventResponse", eventResponse);
	}
	
	
}
