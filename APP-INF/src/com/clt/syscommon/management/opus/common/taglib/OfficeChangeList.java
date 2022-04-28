/*=========================================================
*Copyright(c) 2011 CyberLogitec
*@FileName : OfficeChangeList.java
*@FileTitle : OfficeChangeList
*Open Issues :
*Change history :
*@LastModifyDate : 2011.03.08
*@LastModifier : Hyunsu Ryu
*@LastVersion : 1.0
* 2011.03.08 Hyunsu Ryu
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.common.taglib;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

import org.apache.log4j.Logger;

import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.event.EventException;
import com.clt.syscommon.management.opus.accesshistory.integration.AccessHistoryDBDAO;
import com.clt.syscommon.management.opus.user.basic.UserOfcCngBC;
import com.clt.syscommon.management.opus.user.basic.UserOfcCngBCImpl;
import com.clt.syscommon.management.opus.user.event.UiComSys015Event;

/**
 * OfficeChangeList Tag Lib 
 * 
 * @author Hyunsu, Ryu
 * @see AccessHistoryDBDAO
 * @since J2EE 1.6
 */
public class OfficeChangeList extends TagSupport {

	protected transient Logger log;

	/**
	 * 
	 */
	private static final long serialVersionUID = 6844612368952649577L;
	protected String userId = "";
	protected String usrNm = "";
	protected String ofcCd = "";
	
	protected String styleValue = "";
	protected String classValue = "";
	protected String nameValue = "";
	protected String functionValue = "";
	   
	
	public String getOfcCd() {
		return ofcCd;
	}

	public String getStyleValue() {
		return styleValue;
	}

	public void setStyleValue(String styleValue) {
		this.styleValue = styleValue;
	}

	public String getClassValue() {
		return classValue;
	}

	public void setClassValue(String classValue) {
		this.classValue = classValue;
	}

	public String getNameValue() {
		return nameValue;
	}

	public void setNameValue(String nameValue) {
		this.nameValue = nameValue;
	}

	public String getFunctionValue() {
		return functionValue;
	}

	public void setFunctionValue(String functionValue) {
		this.functionValue = functionValue;
	}

	public void setOfcCd(String ofcCd) {
		this.ofcCd = ofcCd;
	}

	public String getUsrNm() {
		return usrNm;
	}

	public void setUsrNm(String usrNm) {
		this.usrNm = usrNm;
	}

	public OfficeChangeList() {
		log = Logger.getLogger(getClass().getName());
	}
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	
	
	/**
	 * make Tag  
	 * @return int
	 * CustomTag 실행 method
	 */
	public int doStartTag() throws JspException {
		try {
			JspWriter out = pageContext.getOut();
			DBRowSet rowset = getDataListText();
			StringBuffer sb = new StringBuffer();
			int cntRow = 0;

			sb.append("<select style=\""+styleValue+"\" " +  
					"class=\"" +classValue+ "\" "+ 
					"name =\"" +nameValue+ "\" "+
					functionValue + " > ");
			while (rowset.next()) {
				sb.append("<option " + ( rowset.getString("cng_ofc_cd").equals(ofcCd)?" SELECTED ":"" )+ 
						"value=\""+rowset.getString("cng_ofc_cd")+"\">"+rowset.getString("cng_ofc_cd")+"</option>");
				cntRow++;
			}
			sb.append("</select>");
			
			if(cntRow == 1){
				out.print(ofcCd);
			}else{
				out.print(sb.toString());
			}
			
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			throw new JspException(e);
		}
		return (SKIP_BODY);
	}
	

	
	/**
	 * get list info 
	 * List에 보여질 데이터를 조회하는 추상화 함수
	 * 
	 * @return String[][]
	 */
	protected DBRowSet getDataListText() throws EventException {
		
		DBRowSet rowset;
		UiComSys015Event event = new UiComSys015Event();
		
		try {
			event.setUsr_id(userId);
			event.setUsr_nm(usrNm);
			event.setAdmin_page("N");
			event.setDefault_ofc_cd(ofcCd);//lst_login_ofc_cd update
			
			UserOfcCngBC command = (UserOfcCngBC) new UserOfcCngBCImpl();
			command.changeOffice(event);//lst_login_ofc_cd update
			rowset = command.searchUserList(event);
			
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			throw new EventException(e.getMessage());
		}
		return rowset;
	}


}
