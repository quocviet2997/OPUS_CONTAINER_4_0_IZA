/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : GL_FMC_ENT.java
*@FileTitle : 사용자 관리5
*Open Issues :
*Change history :
*@LastModifyDate : 2007-01-25
*@LastModifier : Kildong_hong6
*@LastVersion : 1.0
* 2007-01-25 Kildong_hong6
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
public final class GL_FMC_ENT implements java.io.Serializable {

	private String          ibflag          = "";
	private String          page_rows       = "";
	private String          gl_misc_n1st_cd = "";
	private String          gl_misc_n2nd_cd = "";
	private String          gl_misc_n3rd_cd = "";
	private String          ent_nm          = "";
	private String          ent_abbr_nm     = "";
	private String          delt_flg        = "";
	private String          cre_dt          = "";
	private String          upd_usr_id      = "";
	private String          upd_dt          = "";
	private String          eai_evnt_dt     = "";

	public GL_FMC_ENT(){}

	public GL_FMC_ENT(
			String          ibflag         ,
			String          page_rows      ,
			String          gl_misc_n1st_cd,
			String          gl_misc_n2nd_cd,
			String          gl_misc_n3rd_cd,
			String          ent_nm         ,
			String          ent_abbr_nm    ,
			String          delt_flg       ,
			String          cre_dt         ,
			String          upd_usr_id     ,
			String          upd_dt         ,
			String          eai_evnt_dt    ){
		this.ibflag          = ibflag         ;
		this.page_rows       = page_rows      ;
		this.gl_misc_n1st_cd = gl_misc_n1st_cd;
		this.gl_misc_n2nd_cd = gl_misc_n2nd_cd;
		this.gl_misc_n3rd_cd = gl_misc_n3rd_cd;
		this.ent_nm          = ent_nm         ;
		this.ent_abbr_nm     = ent_abbr_nm    ;
		this.delt_flg        = delt_flg       ;
		this.cre_dt          = cre_dt         ;
		this.upd_usr_id      = upd_usr_id     ;
		this.upd_dt          = upd_dt         ;
		this.eai_evnt_dt     = eai_evnt_dt    ;
	}

	// getter method is proceeding ..
	public String          getIbflag         (){	return ibflag         	;	}
	public String          getPage_rows      (){	return page_rows      	;	}
	public String          getGl_misc_n1st_cd(){	return gl_misc_n1st_cd	;	}
	public String          getGl_misc_n2nd_cd(){	return gl_misc_n2nd_cd	;	}
	public String          getGl_misc_n3rd_cd(){	return gl_misc_n3rd_cd	;	}
	public String          getEnt_nm         (){	return ent_nm         	;	}
	public String          getEnt_abbr_nm    (){	return ent_abbr_nm    	;	}
	public String          getDelt_flg       (){	return delt_flg       	;	}
	public String          getCre_dt         (){	return cre_dt         	;	}
	public String          getUpd_usr_id     (){	return upd_usr_id     	;	}
	public String          getUpd_dt         (){	return upd_dt         	;	}
	public String          getEai_evnt_dt    (){	return eai_evnt_dt    	;	}

	// setter method is proceeding ..
	public void setIbflag         ( String          ibflag          ){	this.ibflag          = ibflag         	;	}
	public void setPage_rows      ( String          page_rows       ){	this.page_rows       = page_rows      	;	}
	public void setGl_misc_n1st_cd( String          gl_misc_n1st_cd ){	this.gl_misc_n1st_cd = gl_misc_n1st_cd	;	}
	public void setGl_misc_n2nd_cd( String          gl_misc_n2nd_cd ){	this.gl_misc_n2nd_cd = gl_misc_n2nd_cd	;	}
	public void setGl_misc_n3rd_cd( String          gl_misc_n3rd_cd ){	this.gl_misc_n3rd_cd = gl_misc_n3rd_cd	;	}
	public void setEnt_nm         ( String          ent_nm          ){	this.ent_nm          = ent_nm         	;	}
	public void setEnt_abbr_nm    ( String          ent_abbr_nm     ){	this.ent_abbr_nm     = ent_abbr_nm    	;	}
	public void setDelt_flg       ( String          delt_flg        ){	this.delt_flg        = delt_flg       	;	}
	public void setCre_dt         ( String          cre_dt          ){	this.cre_dt          = cre_dt         	;	}
	public void setUpd_usr_id     ( String          upd_usr_id      ){	this.upd_usr_id      = upd_usr_id     	;	}
	public void setUpd_dt         ( String          upd_dt          ){	this.upd_dt          = upd_dt         	;	}
	public void setEai_evnt_dt    ( String          eai_evnt_dt     ){	this.eai_evnt_dt     = eai_evnt_dt    	;	}

	public static GL_FMC_ENT fromRequest(HttpServletRequest request) {
		GL_FMC_ENT model = new GL_FMC_ENT();
		try {
			model.setIbflag         	(JSPUtil.getParameter(request, "ibflag         		".trim(), ""));
			model.setPage_rows      	(JSPUtil.getParameter(request, "page_rows      		".trim(), ""));
			model.setGl_misc_n1st_cd	(JSPUtil.getParameter(request, "gl_misc_n1st_cd		".trim(), ""));
			model.setGl_misc_n2nd_cd	(JSPUtil.getParameter(request, "gl_misc_n2nd_cd		".trim(), ""));
			model.setGl_misc_n3rd_cd	(JSPUtil.getParameter(request, "gl_misc_n3rd_cd		".trim(), ""));
			model.setEnt_nm         	(JSPUtil.getParameter(request, "ent_nm         		".trim(), ""));
			model.setEnt_abbr_nm    	(JSPUtil.getParameter(request, "ent_abbr_nm    		".trim(), ""));
			model.setDelt_flg       	(JSPUtil.getParameter(request, "delt_flg       		".trim(), ""));
			model.setCre_dt         	(JSPUtil.getParameter(request, "cre_dt         		".trim(), ""));
			model.setUpd_usr_id     	(JSPUtil.getParameter(request, "upd_usr_id     		".trim(), ""));
			model.setUpd_dt         	(JSPUtil.getParameter(request, "upd_dt         		".trim(), ""));
			model.setEai_evnt_dt    	(JSPUtil.getParameter(request, "eai_evnt_dt    		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		GL_FMC_ENT model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag          =  (JSPUtil.getParameter(request, "ibflag         		".trim(), length));
			String[] page_rows       =  (JSPUtil.getParameter(request, "page_rows      		".trim(), length));
			String[] gl_misc_n1st_cd =  (JSPUtil.getParameter(request, "gl_misc_n1st_cd		".trim(), length));
			String[] gl_misc_n2nd_cd =  (JSPUtil.getParameter(request, "gl_misc_n2nd_cd		".trim(), length));
			String[] gl_misc_n3rd_cd =  (JSPUtil.getParameter(request, "gl_misc_n3rd_cd		".trim(), length));
			String[] ent_nm          =  (JSPUtil.getParameter(request, "ent_nm         		".trim(), length));
			String[] ent_abbr_nm     =  (JSPUtil.getParameter(request, "ent_abbr_nm    		".trim(), length));
			String[] delt_flg        =  (JSPUtil.getParameter(request, "delt_flg       		".trim(), length));
			String[] cre_dt          =  (JSPUtil.getParameter(request, "cre_dt         		".trim(), length));
			String[] upd_usr_id      =  (JSPUtil.getParameter(request, "upd_usr_id     		".trim(), length));
			String[] upd_dt          =  (JSPUtil.getParameter(request, "upd_dt         		".trim(), length));
			String[] eai_evnt_dt     =  (JSPUtil.getParameter(request, "eai_evnt_dt    		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new GL_FMC_ENT();
				model.setIbflag         		  (ibflag         	[i]);
				model.setPage_rows      		  (page_rows      	[i]);
				model.setGl_misc_n1st_cd		  (gl_misc_n1st_cd	[i]);
				model.setGl_misc_n2nd_cd		  (gl_misc_n2nd_cd	[i]);
				model.setGl_misc_n3rd_cd		  (gl_misc_n3rd_cd	[i]);
				model.setEnt_nm         		  (ent_nm         	[i]);
				model.setEnt_abbr_nm    		  (ent_abbr_nm    	[i]);
				model.setDelt_flg       		  (delt_flg       	[i]);
				model.setCre_dt         		  (cre_dt         	[i]);
				model.setUpd_usr_id     		  (upd_usr_id     	[i]);
				model.setUpd_dt         		  (upd_dt         	[i]);
				model.setEai_evnt_dt    		  (eai_evnt_dt    	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		GL_FMC_ENT model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag          =  (JSPUtil.getParameter(request, prefix + "ibflag         		".trim(), length));
			String[] page_rows       =  (JSPUtil.getParameter(request, prefix + "page_rows      		".trim(), length));
			String[] gl_misc_n1st_cd =  (JSPUtil.getParameter(request, prefix + "gl_misc_n1st_cd		".trim(), length));
			String[] gl_misc_n2nd_cd =  (JSPUtil.getParameter(request, prefix + "gl_misc_n2nd_cd		".trim(), length));
			String[] gl_misc_n3rd_cd =  (JSPUtil.getParameter(request, prefix + "gl_misc_n3rd_cd		".trim(), length));
			String[] ent_nm          =  (JSPUtil.getParameter(request, prefix + "ent_nm         		".trim(), length));
			String[] ent_abbr_nm     =  (JSPUtil.getParameter(request, prefix + "ent_abbr_nm    		".trim(), length));
			String[] delt_flg        =  (JSPUtil.getParameter(request, prefix + "delt_flg       		".trim(), length));
			String[] cre_dt          =  (JSPUtil.getParameter(request, prefix + "cre_dt         		".trim(), length));
			String[] upd_usr_id      =  (JSPUtil.getParameter(request, prefix + "upd_usr_id     		".trim(), length));
			String[] upd_dt          =  (JSPUtil.getParameter(request, prefix + "upd_dt         		".trim(), length));
			String[] eai_evnt_dt     =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt    		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new GL_FMC_ENT();
				model.setIbflag         		  ( ibflag         	[i]);
				model.setPage_rows      		  ( page_rows      	[i]);
				model.setGl_misc_n1st_cd		  ( gl_misc_n1st_cd	[i]);
				model.setGl_misc_n2nd_cd		  ( gl_misc_n2nd_cd	[i]);
				model.setGl_misc_n3rd_cd		  ( gl_misc_n3rd_cd	[i]);
				model.setEnt_nm         		  ( ent_nm         	[i]);
				model.setEnt_abbr_nm    		  ( ent_abbr_nm    	[i]);
				model.setDelt_flg       		  ( delt_flg       	[i]);
				model.setCre_dt         		  ( cre_dt         	[i]);
				model.setUpd_usr_id     		  ( upd_usr_id     	[i]);
				model.setUpd_dt         		  ( upd_dt         	[i]);
				model.setEai_evnt_dt    		  ( eai_evnt_dt    	[i]);
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
