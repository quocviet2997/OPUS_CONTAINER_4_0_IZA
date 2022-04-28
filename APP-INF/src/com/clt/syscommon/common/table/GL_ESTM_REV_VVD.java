/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : GL_ESTM_REV_VVD.java
*@FileTitle : Rev. VVD Inquiry & Selection (Pop-up)
*Open Issues :
*Change history :
*@LastModifyDate : 2007-02-14
*@LastModifier : Park Yeon Jin
*@LastVersion : 1.0
* 2007-02-14 Park Yeon Jin
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
 * @author Park Yeon Jin
 * @since J2EE 1.4
 */
public final class GL_ESTM_REV_VVD implements java.io.Serializable {

	private String          ibflag          = "";
	private String          page_rows       = "";
	private String          exe_yrmon       = "";
	private String          rev_yrmon       = "";
	private String          vsl_cd          = "";
	private String          skd_voy_no      = "";
	private String          skd_dir_cd      = "";
	private String          rev_dir_cd      = "";
	private String          estm_vvd_tp_cd  = "";
	private String          estm_ioc_div_cd = "";
	private String          estm_vvd_hdr_id = "";
	private String          estm_bc_div_cd  = "";
	private String          cre_dt          = "";

	public GL_ESTM_REV_VVD(){}

	public GL_ESTM_REV_VVD(
			String          ibflag         ,
			String          page_rows      ,
			String          exe_yrmon      ,
			String          rev_yrmon      ,
			String          vsl_cd         ,
			String          skd_voy_no     ,
			String          skd_dir_cd     ,
			String          rev_dir_cd     ,
			String          estm_vvd_tp_cd ,
			String          estm_ioc_div_cd,
			String          estm_vvd_hdr_id,
			String          estm_bc_div_cd ,
			String          cre_dt         ){
		this.ibflag          = ibflag         ;
		this.page_rows       = page_rows      ;
		this.exe_yrmon       = exe_yrmon      ;
		this.rev_yrmon       = rev_yrmon      ;
		this.vsl_cd          = vsl_cd         ;
		this.skd_voy_no      = skd_voy_no     ;
		this.skd_dir_cd      = skd_dir_cd     ;
		this.rev_dir_cd      = rev_dir_cd     ;
		this.estm_vvd_tp_cd  = estm_vvd_tp_cd ;
		this.estm_ioc_div_cd = estm_ioc_div_cd;
		this.estm_vvd_hdr_id = estm_vvd_hdr_id;
		this.estm_bc_div_cd  = estm_bc_div_cd ;
		this.cre_dt          = cre_dt         ;
	}

	// getter method is proceeding ..
	public String          getIbflag         (){	return ibflag         	;	}
	public String          getPage_rows      (){	return page_rows      	;	}
	public String          getExe_yrmon      (){	return exe_yrmon      	;	}
	public String          getRev_yrmon      (){	return rev_yrmon      	;	}
	public String          getVsl_cd         (){	return vsl_cd         	;	}
	public String          getSkd_voy_no     (){	return skd_voy_no     	;	}
	public String          getSkd_dir_cd     (){	return skd_dir_cd     	;	}
	public String          getRev_dir_cd     (){	return rev_dir_cd     	;	}
	public String          getEstm_vvd_tp_cd (){	return estm_vvd_tp_cd 	;	}
	public String          getEstm_ioc_div_cd(){	return estm_ioc_div_cd	;	}
	public String          getEstm_vvd_hdr_id(){	return estm_vvd_hdr_id	;	}
	public String          getEstm_bc_div_cd (){	return estm_bc_div_cd 	;	}
	public String          getCre_dt         (){	return cre_dt         	;	}

	// setter method is proceeding ..
	public void setIbflag         ( String          ibflag          ){	this.ibflag          = ibflag         	;	}
	public void setPage_rows      ( String          page_rows       ){	this.page_rows       = page_rows      	;	}
	public void setExe_yrmon      ( String          exe_yrmon       ){	this.exe_yrmon       = exe_yrmon      	;	}
	public void setRev_yrmon      ( String          rev_yrmon       ){	this.rev_yrmon       = rev_yrmon      	;	}
	public void setVsl_cd         ( String          vsl_cd          ){	this.vsl_cd          = vsl_cd         	;	}
	public void setSkd_voy_no     ( String          skd_voy_no      ){	this.skd_voy_no      = skd_voy_no     	;	}
	public void setSkd_dir_cd     ( String          skd_dir_cd      ){	this.skd_dir_cd      = skd_dir_cd     	;	}
	public void setRev_dir_cd     ( String          rev_dir_cd      ){	this.rev_dir_cd      = rev_dir_cd     	;	}
	public void setEstm_vvd_tp_cd ( String          estm_vvd_tp_cd  ){	this.estm_vvd_tp_cd  = estm_vvd_tp_cd 	;	}
	public void setEstm_ioc_div_cd( String          estm_ioc_div_cd ){	this.estm_ioc_div_cd = estm_ioc_div_cd	;	}
	public void setEstm_vvd_hdr_id( String          estm_vvd_hdr_id ){	this.estm_vvd_hdr_id = estm_vvd_hdr_id	;	}
	public void setEstm_bc_div_cd ( String          estm_bc_div_cd  ){	this.estm_bc_div_cd  = estm_bc_div_cd 	;	}
	public void setCre_dt         ( String          cre_dt          ){	this.cre_dt          = cre_dt         	;	}

	public static GL_ESTM_REV_VVD fromRequest(HttpServletRequest request) {
		GL_ESTM_REV_VVD model = new GL_ESTM_REV_VVD();
		try {
			model.setIbflag         	(JSPUtil.getParameter(request, "ibflag         		".trim(), ""));
			model.setPage_rows      	(JSPUtil.getParameter(request, "page_rows      		".trim(), ""));
			model.setExe_yrmon      	(JSPUtil.getParameter(request, "exe_yrmon      		".trim(), ""));
			model.setRev_yrmon      	(JSPUtil.getParameter(request, "rev_yrmon      		".trim(), ""));
			model.setVsl_cd         	(JSPUtil.getParameter(request, "vsl_cd         		".trim(), ""));
			model.setSkd_voy_no     	(JSPUtil.getParameter(request, "skd_voy_no     		".trim(), ""));
			model.setSkd_dir_cd     	(JSPUtil.getParameter(request, "skd_dir_cd     		".trim(), ""));
			model.setRev_dir_cd     	(JSPUtil.getParameter(request, "rev_dir_cd     		".trim(), ""));
			model.setEstm_vvd_tp_cd 	(JSPUtil.getParameter(request, "estm_vvd_tp_cd 		".trim(), ""));
			model.setEstm_ioc_div_cd	(JSPUtil.getParameter(request, "estm_ioc_div_cd		".trim(), ""));
			model.setEstm_vvd_hdr_id	(JSPUtil.getParameter(request, "estm_vvd_hdr_id		".trim(), ""));
			model.setEstm_bc_div_cd 	(JSPUtil.getParameter(request, "estm_bc_div_cd 		".trim(), ""));
			model.setCre_dt         	(JSPUtil.getParameter(request, "cre_dt         		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		GL_ESTM_REV_VVD model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag          =  (JSPUtil.getParameter(request, "ibflag         		".trim(), length));
			String[] page_rows       =  (JSPUtil.getParameter(request, "page_rows      		".trim(), length));
			String[] exe_yrmon       =  (JSPUtil.getParameter(request, "exe_yrmon      		".trim(), length));
			String[] rev_yrmon       =  (JSPUtil.getParameter(request, "rev_yrmon      		".trim(), length));
			String[] vsl_cd          =  (JSPUtil.getParameter(request, "vsl_cd         		".trim(), length));
			String[] skd_voy_no      =  (JSPUtil.getParameter(request, "skd_voy_no     		".trim(), length));
			String[] skd_dir_cd      =  (JSPUtil.getParameter(request, "skd_dir_cd     		".trim(), length));
			String[] rev_dir_cd      =  (JSPUtil.getParameter(request, "rev_dir_cd     		".trim(), length));
			String[] estm_vvd_tp_cd  =  (JSPUtil.getParameter(request, "estm_vvd_tp_cd 		".trim(), length));
			String[] estm_ioc_div_cd =  (JSPUtil.getParameter(request, "estm_ioc_div_cd		".trim(), length));
			String[] estm_vvd_hdr_id =  (JSPUtil.getParameter(request, "estm_vvd_hdr_id		".trim(), length));
			String[] estm_bc_div_cd  =  (JSPUtil.getParameter(request, "estm_bc_div_cd 		".trim(), length));
			String[] cre_dt          =  (JSPUtil.getParameter(request, "cre_dt         		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new GL_ESTM_REV_VVD();
				model.setIbflag         		  (ibflag         	[i]);
				model.setPage_rows      		  (page_rows      	[i]);
				model.setExe_yrmon      		  (exe_yrmon      	[i]);
				model.setRev_yrmon      		  (rev_yrmon      	[i]);
				model.setVsl_cd         		  (vsl_cd         	[i]);
				model.setSkd_voy_no     		  (skd_voy_no     	[i]);
				model.setSkd_dir_cd     		  (skd_dir_cd     	[i]);
				model.setRev_dir_cd     		  (rev_dir_cd     	[i]);
				model.setEstm_vvd_tp_cd 		  (estm_vvd_tp_cd 	[i]);
				model.setEstm_ioc_div_cd		  (estm_ioc_div_cd	[i]);
				model.setEstm_vvd_hdr_id		  (estm_vvd_hdr_id	[i]);
				model.setEstm_bc_div_cd 		  (estm_bc_div_cd 	[i]);
				model.setCre_dt         		  (cre_dt         	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		GL_ESTM_REV_VVD model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag          =  (JSPUtil.getParameter(request, prefix + "ibflag         		".trim(), length));
			String[] page_rows       =  (JSPUtil.getParameter(request, prefix + "page_rows      		".trim(), length));
			String[] exe_yrmon       =  (JSPUtil.getParameter(request, prefix + "exe_yrmon      		".trim(), length));
			String[] rev_yrmon       =  (JSPUtil.getParameter(request, prefix + "rev_yrmon      		".trim(), length));
			String[] vsl_cd          =  (JSPUtil.getParameter(request, prefix + "vsl_cd         		".trim(), length));
			String[] skd_voy_no      =  (JSPUtil.getParameter(request, prefix + "skd_voy_no     		".trim(), length));
			String[] skd_dir_cd      =  (JSPUtil.getParameter(request, prefix + "skd_dir_cd     		".trim(), length));
			String[] rev_dir_cd      =  (JSPUtil.getParameter(request, prefix + "rev_dir_cd     		".trim(), length));
			String[] estm_vvd_tp_cd  =  (JSPUtil.getParameter(request, prefix + "estm_vvd_tp_cd 		".trim(), length));
			String[] estm_ioc_div_cd =  (JSPUtil.getParameter(request, prefix + "estm_ioc_div_cd		".trim(), length));
			String[] estm_vvd_hdr_id =  (JSPUtil.getParameter(request, prefix + "estm_vvd_hdr_id		".trim(), length));
			String[] estm_bc_div_cd  =  (JSPUtil.getParameter(request, prefix + "estm_bc_div_cd 		".trim(), length));
			String[] cre_dt          =  (JSPUtil.getParameter(request, prefix + "cre_dt         		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new GL_ESTM_REV_VVD();
				model.setIbflag         		  ( ibflag         	[i]);
				model.setPage_rows      		  ( page_rows      	[i]);
				model.setExe_yrmon      		  ( exe_yrmon      	[i]);
				model.setRev_yrmon      		  ( rev_yrmon      	[i]);
				model.setVsl_cd         		  ( vsl_cd         	[i]);
				model.setSkd_voy_no     		  ( skd_voy_no     	[i]);
				model.setSkd_dir_cd     		  ( skd_dir_cd     	[i]);
				model.setRev_dir_cd     		  ( rev_dir_cd     	[i]);
				model.setEstm_vvd_tp_cd 		  ( estm_vvd_tp_cd 	[i]);
				model.setEstm_ioc_div_cd		  ( estm_ioc_div_cd	[i]);
				model.setEstm_vvd_hdr_id		  ( estm_vvd_hdr_id	[i]);
				model.setEstm_bc_div_cd 		  ( estm_bc_div_cd 	[i]);
				model.setCre_dt         		  ( cre_dt         	[i]);
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
