/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : CHS_CHSS_TP_SZ.java
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
public final class CHS_CHSS_TP_SZ implements java.io.Serializable {

	private String         ibflag         = "";
	private String         page_rows      = "";
	private String         chss_tpsz_cd   = "";
	private String         dp_seq         = "";
	private String         chss_tpsz_desc = "";
	private String         cre_dt         = "";
	private String         upd_usr_id     = "";
	private String         upd_dt         = "";
	private String         eai_evnt_dt    = "";

	public CHS_CHSS_TP_SZ(){}

	public CHS_CHSS_TP_SZ(
			String         ibflag        ,
			String         page_rows     ,
			String         chss_tpsz_cd  ,
			String         dp_seq        ,
			String         chss_tpsz_desc,
			String         cre_dt        ,
			String         upd_usr_id    ,
			String         upd_dt        ,
			String         eai_evnt_dt   ){
		this.ibflag         = ibflag        ;
		this.page_rows      = page_rows     ;
		this.chss_tpsz_cd   = chss_tpsz_cd  ;
		this.dp_seq         = dp_seq        ;
		this.chss_tpsz_desc = chss_tpsz_desc;
		this.cre_dt         = cre_dt        ;
		this.upd_usr_id     = upd_usr_id    ;
		this.upd_dt         = upd_dt        ;
		this.eai_evnt_dt    = eai_evnt_dt   ;
	}

	// getter method is proceeding ..
	public String         getIbflag        (){	return ibflag        	;	}
	public String         getPage_rows     (){	return page_rows     	;	}
	public String         getChss_tpsz_cd  (){	return chss_tpsz_cd  	;	}
	public String         getDp_seq        (){	return dp_seq        	;	}
	public String         getChss_tpsz_desc(){	return chss_tpsz_desc	;	}
	public String         getCre_dt        (){	return cre_dt        	;	}
	public String         getUpd_usr_id    (){	return upd_usr_id    	;	}
	public String         getUpd_dt        (){	return upd_dt        	;	}
	public String         getEai_evnt_dt   (){	return eai_evnt_dt   	;	}

	// setter method is proceeding ..
	public void setIbflag        ( String         ibflag         ){	this.ibflag         = ibflag        	;	}
	public void setPage_rows     ( String         page_rows      ){	this.page_rows      = page_rows     	;	}
	public void setChss_tpsz_cd  ( String         chss_tpsz_cd   ){	this.chss_tpsz_cd   = chss_tpsz_cd  	;	}
	public void setDp_seq        ( String         dp_seq         ){	this.dp_seq         = dp_seq        	;	}
	public void setChss_tpsz_desc( String         chss_tpsz_desc ){	this.chss_tpsz_desc = chss_tpsz_desc	;	}
	public void setCre_dt        ( String         cre_dt         ){	this.cre_dt         = cre_dt        	;	}
	public void setUpd_usr_id    ( String         upd_usr_id     ){	this.upd_usr_id     = upd_usr_id    	;	}
	public void setUpd_dt        ( String         upd_dt         ){	this.upd_dt         = upd_dt        	;	}
	public void setEai_evnt_dt   ( String         eai_evnt_dt    ){	this.eai_evnt_dt    = eai_evnt_dt   	;	}

	public static CHS_CHSS_TP_SZ fromRequest(HttpServletRequest request) {
		CHS_CHSS_TP_SZ model = new CHS_CHSS_TP_SZ();
		try {
			model.setIbflag        	(JSPUtil.getParameter(request, "ibflag        		".trim(), ""));
			model.setPage_rows     	(JSPUtil.getParameter(request, "page_rows     		".trim(), ""));
			model.setChss_tpsz_cd  	(JSPUtil.getParameter(request, "chss_tpsz_cd  		".trim(), ""));
			model.setDp_seq        	(JSPUtil.getParameter(request, "dp_seq        		".trim(), ""));
			model.setChss_tpsz_desc	(JSPUtil.getParameter(request, "chss_tpsz_desc		".trim(), ""));
			model.setCre_dt        	(JSPUtil.getParameter(request, "cre_dt        		".trim(), ""));
			model.setUpd_usr_id    	(JSPUtil.getParameter(request, "upd_usr_id    		".trim(), ""));
			model.setUpd_dt        	(JSPUtil.getParameter(request, "upd_dt        		".trim(), ""));
			model.setEai_evnt_dt   	(JSPUtil.getParameter(request, "eai_evnt_dt   		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		CHS_CHSS_TP_SZ model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag         =  (JSPUtil.getParameter(request, "ibflag        		".trim(), length));
			String[] page_rows      =  (JSPUtil.getParameter(request, "page_rows     		".trim(), length));
			String[] chss_tpsz_cd   =  (JSPUtil.getParameter(request, "chss_tpsz_cd  		".trim(), length));
			String[] dp_seq         =  (JSPUtil.getParameter(request, "dp_seq        		".trim(), length));
			String[] chss_tpsz_desc =  (JSPUtil.getParameter(request, "chss_tpsz_desc		".trim(), length));
			String[] cre_dt         =  (JSPUtil.getParameter(request, "cre_dt        		".trim(), length));
			String[] upd_usr_id     =  (JSPUtil.getParameter(request, "upd_usr_id    		".trim(), length));
			String[] upd_dt         =  (JSPUtil.getParameter(request, "upd_dt        		".trim(), length));
			String[] eai_evnt_dt    =  (JSPUtil.getParameter(request, "eai_evnt_dt   		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new CHS_CHSS_TP_SZ();
				model.setIbflag        		  (ibflag        	[i]);
				model.setPage_rows     		  (page_rows     	[i]);
				model.setChss_tpsz_cd  		  (chss_tpsz_cd  	[i]);
				model.setDp_seq        		  (dp_seq        	[i]);
				model.setChss_tpsz_desc		  (chss_tpsz_desc	[i]);
				model.setCre_dt        		  (cre_dt        	[i]);
				model.setUpd_usr_id    		  (upd_usr_id    	[i]);
				model.setUpd_dt        		  (upd_dt        	[i]);
				model.setEai_evnt_dt   		  (eai_evnt_dt   	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		CHS_CHSS_TP_SZ model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag         =  (JSPUtil.getParameter(request, prefix + "ibflag        		".trim(), length));
			String[] page_rows      =  (JSPUtil.getParameter(request, prefix + "page_rows     		".trim(), length));
			String[] chss_tpsz_cd   =  (JSPUtil.getParameter(request, prefix + "chss_tpsz_cd  		".trim(), length));
			String[] dp_seq         =  (JSPUtil.getParameter(request, prefix + "dp_seq        		".trim(), length));
			String[] chss_tpsz_desc =  (JSPUtil.getParameter(request, prefix + "chss_tpsz_desc		".trim(), length));
			String[] cre_dt         =  (JSPUtil.getParameter(request, prefix + "cre_dt        		".trim(), length));
			String[] upd_usr_id     =  (JSPUtil.getParameter(request, prefix + "upd_usr_id    		".trim(), length));
			String[] upd_dt         =  (JSPUtil.getParameter(request, prefix + "upd_dt        		".trim(), length));
			String[] eai_evnt_dt    =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt   		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new CHS_CHSS_TP_SZ();
				model.setIbflag        		  ( ibflag        	[i]);
				model.setPage_rows     		  ( page_rows     	[i]);
				model.setChss_tpsz_cd  		  ( chss_tpsz_cd  	[i]);
				model.setDp_seq        		  ( dp_seq        	[i]);
				model.setChss_tpsz_desc		  ( chss_tpsz_desc	[i]);
				model.setCre_dt        		  ( cre_dt        	[i]);
				model.setUpd_usr_id    		  ( upd_usr_id    	[i]);
				model.setUpd_dt        		  ( upd_dt        	[i]);
				model.setEai_evnt_dt   		  ( eai_evnt_dt   	[i]);
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
