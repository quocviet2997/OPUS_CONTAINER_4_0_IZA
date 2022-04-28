/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : COM_ENS_021HTMLAction.java
*@FileTitle : Contract No 조회
*Open Issues :
*Change history :
*@LastModifyDate : 2006-08-11
*@LastModifier : sangyool pak
*@LastVersion : 1.0
* 2006-08-11 sangyool pak
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.contractno.event;

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
 * - Parsing 한 정보를 Event로 변환, request에 담아 BizCommonSC로 실행요청<br>
 * - BizCommonSC에서 View(JSP)로 실행결과를 전송하는 EventResponse를 request에 셋팅<br>
 *
 * @author sangyool pak
 * @see ComEns021Event , COM_ENS_021EventResponse 참조
 * @since J2EE 1.4
 */
public class COM_ENS_021HTMLAction extends HTMLActionSupport {
	
	private static final long serialVersionUID = -3927249617063034472L;

	/**
     * COM_ENS_021HTMLAction 객체를 생성
     */
    public COM_ENS_021HTMLAction() {
    }

    /**
     * HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
     * HttpRequst의 정보를 COM_ENS_021Event로 파싱하여 request에 셋팅<br>
     * 
     * @param request HttpServletRequest HttpRequest
     * @return Event Event interface를 구현한 객체
     * @exception HTMLActionException
     */
    public Event perform(HttpServletRequest request) throws HTMLActionException {
         
    	// 메인화면에서 Contract No조회 팝업 버튼을 클릭 또는 Retrieve 버튼 클릭했을 경우  
        String cont_tp   = JSPUtil.getParameter(request, "cont_tp".trim(), "");
    	String cont_no   = JSPUtil.getParameter(request, "cont_no".trim(), "");
    	String cust_nm   = JSPUtil.getParameter(request, "cust_nm".trim(), "");
    	String sdate     = JSPUtil.getParameter(request, "sdate".trim(), "");
    	String edate     = JSPUtil.getParameter(request, "edate".trim(), "");
    	String ofc_cd     = JSPUtil.getParameter(request, "ofc_cd".trim(), "");
    	String ctrt_cust_sls_ofc_cd     = JSPUtil.getParameter(request, "ctrt_cust_sls_ofc_cd".trim(), "");
    	String mdm_yn     = JSPUtil.getParameter(request, "mdm_yn".trim(), "");
    	String delt_flg     = "";
    	if("Y".equals(mdm_yn)){
    		delt_flg = JSPUtil.getParameter(request, "delt_flg".trim(), "N");
    	}else{
    		delt_flg = JSPUtil.getParameter(request, "delt_flg".trim(), "");
    	}

    	int iPage           = JSPUtil.getParameterAsInt(request, "iPage", 1);
    	
    	FormCommand f_cmd = FormCommand.fromRequest(request);
    	
    	log.debug("iPage : " + iPage + ", Request iPage :" + JSPUtil.getParameter(request, "iPage"));
    	
        ComEns021Event event = new ComEns021Event(cont_tp, cont_no, cust_nm, sdate, edate, iPage, ofc_cd, ctrt_cust_sls_ofc_cd, mdm_yn, delt_flg);
    	
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