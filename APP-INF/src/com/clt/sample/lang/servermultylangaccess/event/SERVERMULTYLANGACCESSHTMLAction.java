package com.clt.sample.lang.servermultylangaccess.event;

import javax.servlet.http.HttpServletRequest;

import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.controller.html.HTMLActionException;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.support.controller.HTMLActionSupport;
import com.clt.framework.support.view.signon.web.SignOnFilter;
import com.clt.sample.lang.multylangaccess.event.MultyLangEvent;
import com.clt.syscommon.common.table.ComUserVO;

public class SERVERMULTYLANGACCESSHTMLAction extends HTMLActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public SERVERMULTYLANGACCESSHTMLAction() {
	}

	@Override
	public Event perform(HttpServletRequest request) throws HTMLActionException {
		String lang_tp_cd = (String) request.getSession().getAttribute(SignOnFilter.FORM_LANG_TP_CD_TYPE);
		
		String msgCdStr = "";
		if("EN".equals(lang_tp_cd)){
			msgCdStr = "JUN00001";
		}else if("KR".equals(lang_tp_cd)){
			msgCdStr = "JUN00002";
		}else if("CN".equals(lang_tp_cd)){
			msgCdStr = "JUN00003";
		}else{
			msgCdStr = "JUN00001";
		}
		
		throw new HTMLActionException(new ErrorHandler(msgCdStr).getMessage(), new EventException(new ErrorHandler(msgCdStr).getMessage()));
		
//		MultyLangEvent event = new MultyLangEvent();
//		ComUserVO testVo = (ComUserVO)getVO(request, ComUserVO.class);
//		testVo.setLangTpCd(lang_tp_cd);
//		event.setComUserVO(testVo);
//		request.setAttribute("Event", event);
//		return event;
	}
	
	@Override
	public void doEnd(HttpServletRequest request, EventResponse eventResponse) {
		request.setAttribute("EventResponse", eventResponse);
	}

}
