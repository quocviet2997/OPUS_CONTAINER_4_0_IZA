/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : COM_ENS_051HTMLAction.java
*@FileTitle : Location조회(공통 Popup)
*Open Issues :
*Change history :
*@LastModifyDate : 2006-08-03
*@LastModifier : HyungChoonRoh
*@LastVersion : 1.0
* 2006-08-03 HyungChoonRoh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.location.event;

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
 * @author HyungChoonRoh
 * @see ComEns051Event , COM_ENS_051EventResponse 참조
 * @since J2EE 1.4
 */
public class COM_ENS_051HTMLAction extends HTMLActionSupport {

    /**
     * COM_ENS_051HTMLAction 객체를 생성
     */
    public COM_ENS_051HTMLAction() {
    }

    /**
     * HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
     * HttpRequst의 정보를 COM_ENS_051Event로 파싱하여 request에 셋팅<br>
     * 
     * @param request HttpServletRequest HttpRequest
     * @return Event Event interface를 구현한 객체
     * @exception HTMLActionException
     */
    public Event perform(HttpServletRequest request) throws HTMLActionException {
        
    	// 메인화면에서 Location팝업 버튼을 클릭 또는 Retrieve 버튼 클릭했을 경우
    	String locCd = JSPUtil.getParameter(request, "loc_cd".trim(), "");
    	String locNm = JSPUtil.getParameter(request, "loc_nm".trim(), "");
    	String unLocIndCd = JSPUtil.getParameter(request, "un_loc_ind_cd".trim(), "");
    	String cntCd = JSPUtil.getParameter(request, "cnt_cd".trim(), "");
    	String locEqOfc = JSPUtil.getParameter(request, "loc_eq_ofc".trim(), "");
    	String select = request.getParameter("select");
    	String rccCd = request.getParameter("rcc_cd");
    	String lccCd = request.getParameter("lcc_cd");
    	String locState = request.getParameter("loc_state");
    	
    	/*
    	 * 20120209 added by JUN SUNG, KIM 
    	 * mdm yn 추가 관련 param
    	 */
    	String mdmYN = JSPUtil.getParameter(request, "mdm_yn".trim(), "");
    	String deltFlg = "";
    	if("Y".equals(mdmYN)){
    		deltFlg = JSPUtil.getParameter(request, "delt_flg".trim(), "N");
    	}else{
    		deltFlg = JSPUtil.getParameter(request, "delt_flg".trim(), "");
    	}
    	
    	/*
    	 * 20120328 added by JUN SUNG, KIM
    	 * scc flag 추가관련 param
    	 * default value N -> A.SCC_CD = C.SCC_CD(+)
    	 * 					Y -> A.LOC_CD = C.SCC_CD(+)
    	 */
    	String sccFlg = JSPUtil.getParameter(request, "scc_flg".trim(), "N");
    	
    	
    	int iPage = JSPUtil.getParameterAsInt(request, "iPage", 1);  
    	FormCommand f_cmd = FormCommand.fromRequest(request);
    	log.debug("iPage : " + iPage + ", Request iPage :" + JSPUtil.getParameter(request, "iPage"));
    	
    	ComEns051Event event = new ComEns051Event();
    	
    	event.setMdmYN(mdmYN);
    	event.setDeltFlg(deltFlg);
    	event.setLocCd(locCd);
    	event.setLocNm(locNm);
    	event.setUnLocIndCd(unLocIndCd);
    	event.setCntCd(cntCd);
    	event.setLocEqOfc(locEqOfc);
    	event.setIPage(iPage);
    	event.setSelect(select);
        event.setCommandClassName("BizCommonSC");
        event.setFormCommand(f_cmd);
        event.setRccCd(rccCd);
        event.setLccCd(lccCd);
        event.setLocState(locState);
        // scc flag 추가.
        event.setSccFlg(sccFlg);
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