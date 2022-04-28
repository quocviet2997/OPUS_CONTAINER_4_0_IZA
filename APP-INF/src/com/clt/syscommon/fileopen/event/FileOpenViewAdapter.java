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
package com.clt.syscommon.fileopen.event;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.clt.framework.component.common.AbstractValueObject;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.controller.ViewAdapter;
import com.clt.framework.core.layer.event.GeneralEventResponse;

/**
*
* @author 
* @since J2EE 1.6
* @see 
*/
public class FileOpenViewAdapter extends ViewAdapter {

	/**
	 * VO List 를 Parsing 하여 <Data>태그 부분의 XML문자열을 반환한다.<br>
	 * 
	 * @param List<AbstractValueObject> vos
	 * @param String prefix
	 * @return String <Data>태그 부분의 XML문자열
	 * @exception 
	 */	
	@Override
	protected String makeDataTag(List<AbstractValueObject> vos, String prefix) {
		return null;
	}
	
	/**
	 * DBRowSet를 Parsing하여 <DATA>태그를 생성한다.<br>
	 * IBSheet의 prefix값이 있는 경우 COLORDER에 prefix를 붙인 column명으로 표시해 준다.<br>
	 * 
	 * @param rs DBRowSet 		VO객체
	 * @param prefix String 		IBSheet savename's prefix string
	 * @return String IBSheet 		<DATA>태그
	 * @exception 
	 */
	@Override
	protected String makeDataTag(DBRowSet rs, String prefix) {
		return null;
	}
	
	/**
	 * 
	 * @param request
	 * @param response
	 * @return 
	 */	
	public String makeXML(HttpServletRequest request, HttpServletResponse response){
	  GeneralEventResponse eventResponse = null;
	  String strXML = "";
	  try{
	    eventResponse = (GeneralEventResponse)request.getAttribute("EventResponse");
	    if (eventResponse != null) strXML = eventResponse.getETCData("msg");
	  }catch (Exception ex){
	    log.error(ex.getMessage(), ex);
	    strXML = ex.getMessage();
	  }
	  log.error("\n======================= fileOpen End ============================\n");
	  return strXML;
	}
}
