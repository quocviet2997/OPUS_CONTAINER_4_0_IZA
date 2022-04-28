/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : COM_ENS_081HTMLAction.java
*@FileTitle : Lane 조회(공통 Popup)
*Open Issues :
*Change history :
*@LastModifyDate : 2006-08-09
*@LastModifier : Hyung Choon
*@LastVersion : 1.0
* 2006-08-09 Hyung Choon
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.lane.event;

import javax.servlet.http.HttpServletRequest;

import com.clt.framework.component.util.JSPUtil;
import com.clt.framework.core.controller.html.HTMLActionException;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.support.controller.HTMLActionSupport;
import com.clt.framework.support.controller.html.FormCommand;


/**
 * HTTP Parser<br>
 * - com.clt.bizcommon 화면을 통해 서버로 전송되는 HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
 * - Parsing 한 정보를 Event로 변환, request에 담아 BIZCOMMONSC로 실행요청<br>
 * - BIZCOMMONSC에서 View(JSP)로 실행결과를 전송하는 EventResponse를 request에 셋팅<br>
 *
 * @author Hyung Choon
 * @see ComEns081Event , COM_ENS_081EventResponse 참조
 * @since J2EE 1.4
 */
public class COM_ENS_081HTMLAction extends HTMLActionSupport {

    /**
     * COM_ENS_081HTMLAction 객체를 생성
     */
    public COM_ENS_081HTMLAction() {
    }

    /**
     * HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
     * HttpRequst의 정보를 COM_ENS_081Event로 파싱하여 request에 셋팅<br>
     * 
     * @param request HttpServletRequest HttpRequest
     * @return Event Event interface를 구현한 객체
     * @exception HTMLActionException
     */
    public Event perform(HttpServletRequest request) throws HTMLActionException {
        
    	// 메인화면에서 Vessel팝업 버튼을 클릭 또는 Retrieve 버튼 클릭했을 경우
    	String trade_cd       = JSPUtil.getParameter(request, "trade_cd".trim(), "");
    	String sub_trade_cd   = JSPUtil.getParameter(request, "sub_trade_cd".trim(), "");
    	String svc_tp         = JSPUtil.getParameter(request, "svc_tp".trim(), "");
    	String lane_cd        = JSPUtil.getParameter(request, "lane_cd".trim(), "");
    	String lane_nm        = JSPUtil.getParameter(request, "lane_nm".trim(), "");
    	/*
    	 * 20120210 added by JUN SUNG, KIM
    	 * mdm yn 추가 관련 param
    	 */
    	String mdm_yn        = JSPUtil.getParameter(request, "mdm_yn".trim(), "");
    	String delt_flg = "";
    	if("Y".equals(mdm_yn)){
    		delt_flg        = JSPUtil.getParameter(request, "delt_flg".trim(), "N");
    	}else{
    		delt_flg        = JSPUtil.getParameter(request, "delt_flg".trim(), "");
    	}
    	
    	// Mode (Revenue or Service)
    	String mode			  = JSPUtil.getParameter(request, "mode".trim(), "");
    	
    	int iPage           = JSPUtil.getParameterAsInt(request, "iPage", 1);  
    	
    	FormCommand f_cmd = FormCommand.fromRequest(request);
    	
    	log.debug("iPage : " + iPage + ", Request iPage :" + JSPUtil.getParameter(request, "iPage"));
    	
    	ComEns081Event event = new ComEns081Event(trade_cd, sub_trade_cd, svc_tp, lane_cd, lane_nm, mode, iPage, mdm_yn, delt_flg);
                 
        event.setCommandClassName("BizCommonSC");
        event.setFormCommand(f_cmd);
        request.setAttribute("Event", event);
        
        return  event;
    }

    /**
     * HttpRequest의 attribute에 업무시나리오 수행결과 값 저장<br>
     * ServiceCommand에서 View(JSP)로 실행결과를 전송하는 ResultSet을 request에 셋팅<br>
     * 
     * @param request HttpServletRequest HttpRequest
     * @param eventResponse EventResponse interface를 구현한 객체
     */
    public void doEnd(HttpServletRequest request, EventResponse eventResponse) {
        request.setAttribute("EventResponse", eventResponse);
    }

    /**
     * HttpRequest의 attribute에 HttpRequest 파싱 수행결과 값 저장<br>
     * HttpRequest 파싱 수행결과 값 request에 셋팅<br>
     * 
     * @param request HttpServletRequest HttpRequest
     * @param event Event interface를 구현한 객체
     */
    public void doEnd(HttpServletRequest request, Event event) {
        request.setAttribute("Event", event);
    }

}