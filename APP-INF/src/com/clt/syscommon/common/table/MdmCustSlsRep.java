/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : MDM_CUST_SLS_REP.java
*@FileTitle : 사용자 관리5
*Open Issues :
*Change history :
*@LastModifyDate : 2007-01-12
*@LastModifier : Kildong_hong6
*@LastVersion : 1.0
* 2007-01-12 Kildong_hong6
* 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.common.table;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;

import com.clt.framework.component.util.JSPUtil;

/**
 * Table Value Ojbect<br>
 * - 모든 업무에서 공통으로 사용하는 PDTO(Data Transfer Object including Parameters)<br>
 * - 관련 Event에서 작성, 서버실행요청시 PDTO의 역할을 수행하는 Value Object<br>
 * 
 * @author Kildong_hong6
 * @since J2EE 1.4
 */
public final class MdmCustSlsRep implements java.io.Serializable {

	private String    ibflag    = "";
	private String    page_rows = "";

	public MdmCustSlsRep(){}

	public MdmCustSlsRep(
			String    ibflag   ,
			String    page_rows){
		this.ibflag    = ibflag   ;
		this.page_rows = page_rows;
	}

	// getter method is proceeding ..
	public String    getIbflag   (){	return ibflag   	;	}
	public String    getPage_rows(){	return page_rows	;	}

	// setter method is proceeding ..
	public void setIbflag   ( String    ibflag    ){	this.ibflag    = ibflag   	;	}
	public void setPage_rows( String    page_rows ){	this.page_rows = page_rows	;	}

	public static MdmCustSlsRep fromRequest(HttpServletRequest request) {
		MdmCustSlsRep model = new MdmCustSlsRep();
		try {
			model.setIbflag   	(JSPUtil.getParameter(request, "ibflag   		".trim(), ""));
			model.setPage_rows	(JSPUtil.getParameter(request, "page_rows		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		MdmCustSlsRep model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag    =  (JSPUtil.getParameter(request, "ibflag   		".trim(), length));
			String[] page_rows =  (JSPUtil.getParameter(request, "page_rows		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new MdmCustSlsRep();
				model.setIbflag   		  (ibflag   	[i]);
				model.setPage_rows		  (page_rows	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		MdmCustSlsRep model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag    =  (JSPUtil.getParameter(request, prefix + "ibflag   		".trim(), length));
			String[] page_rows =  (JSPUtil.getParameter(request, prefix + "page_rows		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new MdmCustSlsRep();
				model.setIbflag   		  ( ibflag   	[i]);
				model.setPage_rows		  ( page_rows	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}

	// toString() method is overriding ..
	public String toString() {
		StringBuffer ret = new StringBuffer();
		Field[] field = this.getClass().getDeclaredFields();
		String space="                              ";
		try {
			for (int i = 0; i < field.length; i++) {
				String[] arr=null;
				try {
					arr = (String[]) field[i].get(this);
				}catch(Exception ex) {
					arr=new String[1];
					arr[0]=String.valueOf(field[i].get(this));
				}
				if (arr != null) {
					for (int j = 0; j < arr.length; j++) {
						ret.append(field[i].getName().concat(space).substring(0,30).concat("= ") + arr[j] +"\n");
					}
				} else {
					ret.append(field[i].getName() + " =  null \n");
				}
			}
		} catch (Exception ex) {}
		return ret.toString();
	}

}
