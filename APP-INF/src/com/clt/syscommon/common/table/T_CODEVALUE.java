/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : T_CODEVALUE.java
*@FileTitle : 공통코드관리
*Open Issues :
*Change history :
*@LastModifyDate : 2006-09-07
*@LastModifier : SeongWook Kim
*@LastVersion : 1.0
* 2006-09-07 SeongWook Kim
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
 * @author SeongWook Kim
 * @since J2EE 1.4
 */
public final class T_CODEVALUE implements java.io.Serializable {

	private String         ibflag         = "";
	private String         page_rows      = "";
	private String         id             = "";
	private String         codeid         = "";
	private String         name           = "";
	private String         description    = "";
	private String         begindate      = "";
	private String         enddate        = "";
	private String         creator        = "";
	private String         createdatetime = "";
	private String         updator        = "";
	private String         updatedatetime = "";
	private String         codeorder      = "";

	public T_CODEVALUE(){}

	public T_CODEVALUE(
			String         ibflag        ,
			String         page_rows     ,
			String         id            ,
			String         codeid        ,
			String         name          ,
			String         description   ,
			String         begindate     ,
			String         enddate       ,
			String         creator       ,
			String         createdatetime,
			String         updator       ,
			String         updatedatetime,
			String         codeorder     ){
		this.ibflag         = ibflag        ;
		this.page_rows      = page_rows     ;
		this.id             = id            ;
		this.codeid         = codeid        ;
		this.name           = name          ;
		this.description    = description   ;
		this.begindate      = begindate     ;
		this.enddate        = enddate       ;
		this.creator        = creator       ;
		this.createdatetime = createdatetime;
		this.updator        = updator       ;
		this.updatedatetime = updatedatetime;
		this.codeorder      = codeorder     ;
	}

	// getter method is proceeding ..
	public String         getIbflag        (){	return ibflag        	;	}
	public String         getPage_rows     (){	return page_rows     	;	}
	public String         getId            (){	return id            	;	}
	public String         getCodeid        (){	return codeid        	;	}
	public String         getName          (){	return name          	;	}
	public String         getDescription   (){	return description   	;	}
	public String         getBegindate     (){	return begindate     	;	}
	public String         getEnddate       (){	return enddate       	;	}
	public String         getCreator       (){	return creator       	;	}
	public String         getCreatedatetime(){	return createdatetime	;	}
	public String         getUpdator       (){	return updator       	;	}
	public String         getUpdatedatetime(){	return updatedatetime	;	}
	public String         getCodeorder     (){	return codeorder     	;	}

	// setter method is proceeding ..
	public void setIbflag        ( String         ibflag         ){	this.ibflag         = ibflag        	;	}
	public void setPage_rows     ( String         page_rows      ){	this.page_rows      = page_rows     	;	}
	public void setId            ( String         id             ){	this.id             = id            	;	}
	public void setCodeid        ( String         codeid         ){	this.codeid         = codeid        	;	}
	public void setName          ( String         name           ){	this.name           = name          	;	}
	public void setDescription   ( String         description    ){	this.description    = description   	;	}
	public void setBegindate     ( String         begindate      ){	this.begindate      = begindate     	;	}
	public void setEnddate       ( String         enddate        ){	this.enddate        = enddate       	;	}
	public void setCreator       ( String         creator        ){	this.creator        = creator       	;	}
	public void setCreatedatetime( String         createdatetime ){	this.createdatetime = createdatetime	;	}
	public void setUpdator       ( String         updator        ){	this.updator        = updator       	;	}
	public void setUpdatedatetime( String         updatedatetime ){	this.updatedatetime = updatedatetime	;	}
	public void setCodeorder     ( String         codeorder      ){	this.codeorder      = codeorder     	;	}

	public static T_CODEVALUE fromRequest(HttpServletRequest request) {
		T_CODEVALUE model = new T_CODEVALUE();
		try {
			model.setIbflag        	(JSPUtil.getParameter(request, "ibflag        		".trim(), ""));
			model.setPage_rows     	(JSPUtil.getParameter(request, "page_rows     		".trim(), ""));
			model.setId            	(JSPUtil.getParameter(request, "id            		".trim(), ""));
			model.setCodeid        	(JSPUtil.getParameter(request, "codeid        		".trim(), ""));
			model.setName          	(JSPUtil.getParameter(request, "name          		".trim(), ""));
			model.setDescription   	(JSPUtil.getParameter(request, "description   		".trim(), ""));
			model.setBegindate     	(JSPUtil.getParameter(request, "begindate     		".trim(), ""));
			model.setEnddate       	(JSPUtil.getParameter(request, "enddate       		".trim(), ""));
			model.setCreator       	(JSPUtil.getParameter(request, "creator       		".trim(), ""));
			model.setCreatedatetime	(JSPUtil.getParameter(request, "createdatetime		".trim(), ""));
			model.setUpdator       	(JSPUtil.getParameter(request, "updator       		".trim(), ""));
			model.setUpdatedatetime	(JSPUtil.getParameter(request, "updatedatetime		".trim(), ""));
			model.setCodeorder     	(JSPUtil.getParameter(request, "codeorder     		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		T_CODEVALUE model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag         =  (JSPUtil.getParameter(request, "ibflag        		".trim(), length));
			String[] page_rows      =  (JSPUtil.getParameter(request, "page_rows     		".trim(), length));
			String[] id             =  (JSPUtil.getParameter(request, "id            		".trim(), length));
			String[] codeid         =  (JSPUtil.getParameter(request, "codeid        		".trim(), length));
			String[] name           =  (JSPUtil.getParameter(request, "name          		".trim(), length));
			String[] description    =  (JSPUtil.getParameter(request, "description   		".trim(), length));
			String[] begindate      =  (JSPUtil.getParameter(request, "begindate     		".trim(), length));
			String[] enddate        =  (JSPUtil.getParameter(request, "enddate       		".trim(), length));
			String[] creator        =  (JSPUtil.getParameter(request, "creator       		".trim(), length));
			String[] createdatetime =  (JSPUtil.getParameter(request, "createdatetime		".trim(), length));
			String[] updator        =  (JSPUtil.getParameter(request, "updator       		".trim(), length));
			String[] updatedatetime =  (JSPUtil.getParameter(request, "updatedatetime		".trim(), length));
			String[] codeorder      =  (JSPUtil.getParameter(request, "codeorder     		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new T_CODEVALUE();
				model.setIbflag        		  (ibflag        	[i]);
				model.setPage_rows     		  (page_rows     	[i]);
				model.setId            		  (id            	[i]);
				model.setCodeid        		  (codeid        	[i]);
				model.setName          		  (name          	[i]);
				model.setDescription   		  (description   	[i]);
				model.setBegindate     		  (begindate     	[i]);
				model.setEnddate       		  (enddate       	[i]);
				model.setCreator       		  (creator       	[i]);
				model.setCreatedatetime		  (createdatetime	[i]);
				model.setUpdator       		  (updator       	[i]);
				model.setUpdatedatetime		  (updatedatetime	[i]);
				model.setCodeorder     		  (codeorder     	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		T_CODEVALUE model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag         =  (JSPUtil.getParameter(request, prefix + "ibflag        		".trim(), length));
			String[] page_rows      =  (JSPUtil.getParameter(request, prefix + "page_rows     		".trim(), length));
			String[] id             =  (JSPUtil.getParameter(request, prefix + "id            		".trim(), length));
			String[] codeid         =  (JSPUtil.getParameter(request, prefix + "codeid        		".trim(), length));
			String[] name           =  (JSPUtil.getParameter(request, prefix + "name          		".trim(), length));
			String[] description    =  (JSPUtil.getParameter(request, prefix + "description   		".trim(), length));
			String[] begindate      =  (JSPUtil.getParameter(request, prefix + "begindate     		".trim(), length));
			String[] enddate        =  (JSPUtil.getParameter(request, prefix + "enddate       		".trim(), length));
			String[] creator        =  (JSPUtil.getParameter(request, prefix + "creator       		".trim(), length));
			String[] createdatetime =  (JSPUtil.getParameter(request, prefix + "createdatetime		".trim(), length));
			String[] updator        =  (JSPUtil.getParameter(request, prefix + "updator       		".trim(), length));
			String[] updatedatetime =  (JSPUtil.getParameter(request, prefix + "updatedatetime		".trim(), length));
			String[] codeorder      =  (JSPUtil.getParameter(request, prefix + "codeorder     		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new T_CODEVALUE();
				model.setIbflag        		  ( ibflag        	[i]);
				model.setPage_rows     		  ( page_rows     	[i]);
				model.setId            		  ( id            	[i]);
				model.setCodeid        		  ( codeid        	[i]);
				model.setName          		  ( name          	[i]);
				model.setDescription   		  ( description   	[i]);
				model.setBegindate     		  ( begindate     	[i]);
				model.setEnddate       		  ( enddate       	[i]);
				model.setCreator       		  ( creator       	[i]);
				model.setCreatedatetime		  ( createdatetime	[i]);
				model.setUpdator       		  ( updator       	[i]);
				model.setUpdatedatetime		  ( updatedatetime	[i]);
				model.setCodeorder     		  ( codeorder     	[i]);
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
