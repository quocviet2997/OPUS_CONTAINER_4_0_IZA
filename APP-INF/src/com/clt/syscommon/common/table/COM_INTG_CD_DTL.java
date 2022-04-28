/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : COM_INTG_CD_DTL.java
*@FileTitle : 공통코드검색
*Open Issues :
*Change history :
*@LastModifyDate : 2006-09-08
*@LastModifier : HOESOO_JANG
*@LastVersion : 1.0
* 2006-09-08 HOESOO_JANG
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
 * @author HOESOO_JANG
 * @since J2EE 1.4
 */
public final class COM_INTG_CD_DTL implements java.io.Serializable {

	private String              ibflag              = "";
	private String              page_rows           = "";
	private String              intg_cd_id          = "";
	private String              intg_dtl_cd         = "";
	private String              intg_cd_val_ctnt    = "";
	private String              intg_cd_val_dp_desc = "";
	private String              intg_cd_desc        = "";
	private String              intg_cd_val_desc    = "";
	private String              intg_cd_dp_desc     = "";
	private String              intg_cd_dp_seq      = "";
	private String              intg_cd_val_dp_seq  = "";
	private String              aply_st_dt          = "";
	private String              cre_usr_id          = "";
	private String              aply_end_dt         = "";
	private String              cre_dt              = "";
	private String              upd_usr_id          = "";
	private String              upd_dt              = "";

	public COM_INTG_CD_DTL(){}

	public COM_INTG_CD_DTL(
			String              ibflag             ,
			String              page_rows          ,
			String              intg_cd_id         ,
			String              intg_dtl_cd        ,
			String              intg_cd_val_ctnt   ,
			String              intg_cd_val_dp_desc,
			String              intg_cd_desc       ,
			String              intg_cd_val_desc   ,
			String              intg_cd_dp_desc    ,
			String              intg_cd_dp_seq     ,
			String              intg_cd_val_dp_seq ,
			String              aply_st_dt         ,
			String              aply_end_dt        ,
			String              cre_usr_id         ,
			String              cre_dt             ,
			String              upd_usr_id         ,
			String              upd_dt             ){
		this.ibflag              = ibflag             ;
		this.page_rows           = page_rows          ;
		this.intg_cd_id          = intg_cd_id         ;
		this.intg_cd_id          = intg_cd_id         ;
		this.intg_dtl_cd         = intg_dtl_cd        ;
		this.intg_cd_val_ctnt    = intg_cd_val_ctnt   ;
		this.intg_cd_val_dp_desc = intg_cd_val_dp_desc;
		this.intg_cd_desc        = intg_cd_desc       ;
		this.intg_cd_val_desc    = intg_cd_val_desc   ;
		this.intg_cd_dp_desc     = intg_cd_dp_desc    ;
		this.intg_cd_dp_seq      = intg_cd_dp_seq     ;
		this.intg_cd_val_dp_seq  = intg_cd_val_dp_seq ;
		this.aply_st_dt          = aply_st_dt         ;
		this.cre_usr_id          = cre_usr_id         ;
		this.aply_end_dt         = aply_end_dt        ;
		this.cre_dt              = cre_dt             ;
		this.upd_usr_id          = upd_usr_id         ;
		this.upd_dt              = upd_dt             ;
	}

	// getter method is proceeding ..
	public String              getIbflag             (){	return ibflag             	;	}
	public String              getPage_rows          (){	return page_rows          	;	}
	public String              getIntg_cd_id         (){	return intg_cd_id         	;	}
	public String              getIntg_dtl_cd        (){	return intg_dtl_cd        	;	}
	public String              getIntg_cd_val_ctnt   (){	return intg_cd_val_ctnt   	;	}
	public String              getIntg_cd_val_dp_desc(){	return intg_cd_val_dp_desc	;	}
	public String              getIntg_cd_desc       (){	return intg_cd_desc       	;	}
	public String              getIntg_cd_val_desc   (){	return intg_cd_val_desc   	;	}
	public String              getIntg_cd_dp_desc    (){	return intg_cd_dp_desc    	;	}
	public String              getIntg_cd_dp_seq     (){	return intg_cd_dp_seq     	;	}
	public String              getIntg_cd_val_dp_seq (){	return intg_cd_val_dp_seq 	;	}
	public String              getAply_st_dt         (){	return aply_st_dt         	;	}
	public String              getCre_usr_id         (){	return cre_usr_id         	;	}
	public String              getAply_end_dt        (){	return aply_end_dt        	;	}
	public String              getCre_dt             (){	return cre_dt             	;	}
	public String              getUpd_usr_id         (){	return upd_usr_id         	;	}
	public String              getUpd_dt             (){	return upd_dt             	;	}

	// setter method is proceeding ..
	public void setIbflag             ( String              ibflag              ){	this.ibflag              = ibflag             	;	}
	public void setPage_rows          ( String              page_rows           ){	this.page_rows           = page_rows          	;	}
	public void setIntg_cd_id         ( String              intg_cd_id          ){	this.intg_cd_id          = intg_cd_id         	;	}
	public void setIntg_dtl_cd        ( String              intg_dtl_cd         ){	this.intg_dtl_cd         = intg_dtl_cd        	;	}
	public void setIntg_cd_val_ctnt   ( String              intg_cd_val_ctnt    ){	this.intg_cd_val_ctnt    = intg_cd_val_ctnt   	;	}
	public void setIntg_cd_val_dp_desc( String              intg_cd_val_dp_desc ){	this.intg_cd_val_dp_desc = intg_cd_val_dp_desc	;	}
	public void setIntg_cd_desc       ( String              intg_cd_desc        ){	this.intg_cd_desc        = intg_cd_desc       	;	}
	public void setIntg_cd_val_desc   ( String              intg_cd_val_desc    ){	this.intg_cd_val_desc    = intg_cd_val_desc   	;	}
	public void setIntg_cd_dp_desc    ( String              intg_cd_dp_desc     ){	this.intg_cd_dp_desc     = intg_cd_dp_desc    	;	}
	public void setIntg_cd_dp_seq     ( String              intg_cd_dp_seq      ){	this.intg_cd_dp_seq      = intg_cd_dp_seq     	;	}
	public void setIntg_cd_val_dp_seq ( String              intg_cd_val_dp_seq  ){	this.intg_cd_val_dp_seq  = intg_cd_val_dp_seq 	;	}
	public void setAply_st_dt         ( String              aply_st_dt          ){	this.aply_st_dt          = aply_st_dt         	;	}
	public void setCre_usr_id         ( String              cre_usr_id          ){	this.cre_usr_id          = cre_usr_id         	;	}
	public void setAply_end_dt        ( String              aply_end_dt         ){	this.aply_end_dt         = aply_end_dt        	;	}
	public void setCre_dt             ( String              cre_dt              ){	this.cre_dt              = cre_dt             	;	}
	public void setUpd_usr_id         ( String              upd_usr_id          ){	this.upd_usr_id          = upd_usr_id         	;	}
	public void setUpd_dt             ( String              upd_dt              ){	this.upd_dt              = upd_dt             	;	}

	public static COM_INTG_CD_DTL fromRequest(HttpServletRequest request) {
		COM_INTG_CD_DTL model = new COM_INTG_CD_DTL();
		try {
			model.setIbflag             	(JSPUtil.getParameter(request, "ibflag             		".trim(), ""));
			model.setPage_rows          	(JSPUtil.getParameter(request, "page_rows          		".trim(), ""));
			model.setIntg_cd_id         	(JSPUtil.getParameter(request, "intg_cd_id         		".trim(), ""));
			model.setIntg_dtl_cd        	(JSPUtil.getParameter(request, "intg_dtl_cd        		".trim(), ""));
			model.setIntg_cd_val_ctnt   	(JSPUtil.getParameter(request, "intg_cd_val_ctnt   		".trim(), ""));
			model.setIntg_cd_val_dp_desc	(JSPUtil.getParameter(request, "intg_cd_val_dp_desc		".trim(), ""));
			model.setIntg_cd_desc       	(JSPUtil.getParameter(request, "intg_cd_desc       		".trim(), ""));
			model.setIntg_cd_val_desc   	(JSPUtil.getParameter(request, "intg_cd_val_desc   		".trim(), ""));
			model.setIntg_cd_dp_desc    	(JSPUtil.getParameter(request, "intg_cd_dp_desc    		".trim(), ""));
			model.setIntg_cd_dp_seq     	(JSPUtil.getParameter(request, "intg_cd_dp_seq     		".trim(), ""));
			model.setIntg_cd_val_dp_seq 	(JSPUtil.getParameter(request, "intg_cd_val_dp_seq 		".trim(), ""));
			model.setAply_st_dt         	(JSPUtil.getParameter(request, "aply_st_dt         		".trim(), ""));
			model.setAply_end_dt        	(JSPUtil.getParameter(request, "aply_end_dt        		".trim(), ""));
			model.setCre_usr_id         	(JSPUtil.getParameter(request, "cre_usr_id         		".trim(), ""));
			model.setAply_end_dt        	(JSPUtil.getParameter(request, "aply_end_dt        		".trim(), ""));
			model.setCre_dt             	(JSPUtil.getParameter(request, "cre_dt             		".trim(), ""));
			model.setUpd_usr_id         	(JSPUtil.getParameter(request, "upd_usr_id         		".trim(), ""));
			model.setUpd_dt             	(JSPUtil.getParameter(request, "upd_dt             		".trim(), ""));
			
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		COM_INTG_CD_DTL model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag              =  (JSPUtil.getParameter(request, "ibflag             		".trim(), length));
			String[] page_rows           =  (JSPUtil.getParameter(request, "page_rows          		".trim(), length));
			String[] intg_cd_id          =  (JSPUtil.getParameter(request, "intg_cd_id         		".trim(), length));
			String[] intg_dtl_cd         =  (JSPUtil.getParameter(request, "intg_dtl_cd        		".trim(), length));
			String[] intg_cd_val_ctnt    =  (JSPUtil.getParameter(request, "intg_cd_val_ctnt   		".trim(), length));
			String[] intg_cd_val_dp_desc =  (JSPUtil.getParameter(request, "intg_cd_val_dp_desc		".trim(), length));
			String[] intg_cd_desc        =  (JSPUtil.getParameter(request, "intg_cd_desc       		".trim(), length));
			String[] intg_cd_val_desc    =  (JSPUtil.getParameter(request, "intg_cd_val_desc   		".trim(), length));
			String[] intg_cd_dp_desc     =  (JSPUtil.getParameter(request, "intg_cd_dp_desc    		".trim(), length));
			String[] intg_cd_dp_seq      =  (JSPUtil.getParameter(request, "intg_cd_dp_seq     		".trim(), length));
			String[] intg_cd_val_dp_seq  =  (JSPUtil.getParameter(request, "intg_cd_val_dp_seq 		".trim(), length));
			String[] aply_st_dt          =  (JSPUtil.getParameter(request, "aply_st_dt         		".trim(), length));
			String[] aply_end_dt         =  (JSPUtil.getParameter(request, "aply_end_dt        		".trim(), length));
			String[] cre_usr_id          =  (JSPUtil.getParameter(request, "cre_usr_id         		".trim(), length));
			String[] cre_dt              =  (JSPUtil.getParameter(request, "cre_dt             		".trim(), length));
			String[] upd_usr_id          =  (JSPUtil.getParameter(request, "upd_usr_id         		".trim(), length));
			String[] upd_dt              =  (JSPUtil.getParameter(request, "upd_dt             		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new COM_INTG_CD_DTL();
				model.setIbflag             		  (ibflag             	[i]);
				model.setPage_rows          		  (page_rows          	[i]);
				model.setIntg_cd_id         		  (intg_cd_id         	[i]);
				model.setIntg_dtl_cd        		  (intg_dtl_cd        	[i]);
				model.setIntg_cd_val_ctnt   		  (intg_cd_val_ctnt   	[i]);
				model.setIntg_cd_val_dp_desc		  (intg_cd_val_dp_desc	[i]);
				model.setIntg_cd_desc       		  (intg_cd_desc       	[i]);
				model.setIntg_cd_val_desc   		  (intg_cd_val_desc   	[i]);
				model.setIntg_cd_dp_desc    		  (intg_cd_dp_desc    	[i]);
				model.setIntg_cd_dp_seq     		  (intg_cd_dp_seq     	[i]);
				model.setIntg_cd_val_dp_seq 		  (intg_cd_val_dp_seq 	[i]);
				model.setAply_st_dt         		  (aply_st_dt         	[i]);
				model.setAply_end_dt        		  (aply_end_dt        	[i]);
				model.setCre_usr_id         		  (cre_usr_id         	[i]);
				model.setAply_end_dt        		  (aply_end_dt        	[i]);
				model.setCre_dt             		  (cre_dt             	[i]);
				model.setUpd_usr_id         		  (upd_usr_id         	[i]);
				model.setUpd_dt             		  (upd_dt             	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		COM_INTG_CD_DTL model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag              =  (JSPUtil.getParameter(request, prefix + "ibflag             		".trim(), length));
			String[] page_rows           =  (JSPUtil.getParameter(request, prefix + "page_rows          		".trim(), length));
			String[] intg_cd_id          =  (JSPUtil.getParameter(request, prefix + "intg_cd_id         		".trim(), length));
			String[] intg_dtl_cd         =  (JSPUtil.getParameter(request, prefix + "intg_dtl_cd        		".trim(), length));
			String[] intg_cd_val_ctnt    =  (JSPUtil.getParameter(request, prefix + "intg_cd_val_ctnt   		".trim(), length));
			String[] intg_cd_val_dp_desc =  (JSPUtil.getParameter(request, prefix + "intg_cd_val_dp_desc		".trim(), length));
			String[] intg_cd_desc        =  (JSPUtil.getParameter(request, prefix + "intg_cd_desc       		".trim(), length));
			String[] intg_cd_val_desc    =  (JSPUtil.getParameter(request, prefix + "intg_cd_val_desc   		".trim(), length));
			String[] intg_cd_dp_desc     =  (JSPUtil.getParameter(request, prefix + "intg_cd_dp_desc    		".trim(), length));
			String[] intg_cd_dp_seq      =  (JSPUtil.getParameter(request, prefix + "intg_cd_dp_seq     		".trim(), length));
			String[] intg_cd_val_dp_seq  =  (JSPUtil.getParameter(request, prefix + "intg_cd_val_dp_seq 		".trim(), length));
			String[] aply_st_dt          =  (JSPUtil.getParameter(request, prefix + "aply_st_dt         		".trim(), length));
			String[] aply_end_dt         =  (JSPUtil.getParameter(request, prefix + "aply_end_dt        		".trim(), length));
			String[] cre_usr_id          =  (JSPUtil.getParameter(request, prefix + "cre_usr_id         		".trim(), length));
			String[] cre_dt              =  (JSPUtil.getParameter(request, prefix + "cre_dt             		".trim(), length));
			String[] upd_usr_id          =  (JSPUtil.getParameter(request, prefix + "upd_usr_id         		".trim(), length));
			String[] upd_dt              =  (JSPUtil.getParameter(request, prefix + "upd_dt             		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new COM_INTG_CD_DTL();
				model.setIbflag             		  ( ibflag             	[i]);
				model.setPage_rows          		  ( page_rows          	[i]);
				model.setIntg_cd_id         		  ( intg_cd_id         	[i]);
				model.setIntg_dtl_cd        		  ( intg_dtl_cd        	[i]);
				model.setIntg_cd_val_ctnt   		  ( intg_cd_val_ctnt   	[i]);
				model.setIntg_cd_val_dp_desc		  ( intg_cd_val_dp_desc	[i]);
				model.setIntg_cd_desc       		  ( intg_cd_desc       	[i]);
				model.setIntg_cd_val_desc   		  ( intg_cd_val_desc   	[i]);
				model.setIntg_cd_dp_desc    		  ( intg_cd_dp_desc    	[i]);
				model.setIntg_cd_dp_seq     		  ( intg_cd_dp_seq     	[i]);
				model.setIntg_cd_val_dp_seq 		  ( intg_cd_val_dp_seq 	[i]);
				model.setAply_st_dt         		  ( aply_st_dt         	[i]);
				model.setCre_usr_id         		  ( cre_usr_id         	[i]);
				model.setAply_end_dt        		  ( aply_end_dt        	[i]);
				model.setCre_dt             		  ( cre_dt             	[i]);
				model.setUpd_usr_id         		  ( upd_usr_id         	[i]);
				model.setUpd_dt             		  ( upd_dt             	[i]);
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
