/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : MDM_CNTR_SZ.java
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
import java.util.ArrayList;
import java.util.Collection;

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
public final class MdmCntrSz implements java.io.Serializable {

	private String           ibflag           = "";
	private String           page_rows        = "";
	private String           cntr_sz_cd       = "";
	private String           cntr_sz_desc     = "";
	private String           cntr_sz_teu_capa = "";
	private String           modi_cntr_sz_cd  = "";
	private String           cre_usr_id       = "";
	private String           cre_dt           = "";
	private String           upd_usr_id       = "";
	private String           upd_dt           = "";
	private String           delt_flg         = "";
	private String           eai_evnt_dt      = "";
	private String           eai_if_id        = "";

	public MdmCntrSz(){}

	public MdmCntrSz(
			String           ibflag          ,
			String           page_rows       ,
			String           cntr_sz_cd      ,
			String           cntr_sz_desc    ,
			String           cntr_sz_teu_capa,
			String           modi_cntr_sz_cd ,
			String           cre_usr_id      ,
			String           cre_dt          ,
			String           upd_usr_id      ,
			String           upd_dt          ,
			String           delt_flg        ,
			String           eai_evnt_dt     ,
			String           eai_if_id       ){
		this.ibflag           = ibflag          ;
		this.page_rows        = page_rows       ;
		this.cntr_sz_cd       = cntr_sz_cd      ;
		this.cntr_sz_desc     = cntr_sz_desc    ;
		this.cntr_sz_teu_capa = cntr_sz_teu_capa;
		this.modi_cntr_sz_cd  = modi_cntr_sz_cd ;
		this.cre_usr_id       = cre_usr_id      ;
		this.cre_dt           = cre_dt          ;
		this.upd_usr_id       = upd_usr_id      ;
		this.upd_dt           = upd_dt          ;
		this.delt_flg         = delt_flg        ;
		this.eai_evnt_dt      = eai_evnt_dt     ;
		this.eai_if_id        = eai_if_id       ;
	}

	// getter method is proceeding ..
	public String           getIbflag          (){	return ibflag          	;	}
	public String           getPage_rows       (){	return page_rows       	;	}
	public String           getCntr_sz_cd      (){	return cntr_sz_cd      	;	}
	public String           getCntr_sz_desc    (){	return cntr_sz_desc    	;	}
	public String           getCntr_sz_teu_capa(){	return cntr_sz_teu_capa	;	}
	public String           getModi_cntr_sz_cd (){	return modi_cntr_sz_cd 	;	}
	public String           getCre_usr_id      (){	return cre_usr_id      	;	}
	public String           getCre_dt          (){	return cre_dt          	;	}
	public String           getUpd_usr_id      (){	return upd_usr_id      	;	}
	public String           getUpd_dt          (){	return upd_dt          	;	}
	public String           getDelt_flg        (){	return delt_flg        	;	}
	public String           getEai_evnt_dt     (){	return eai_evnt_dt     	;	}
	public String           getEai_if_id       (){	return eai_if_id		;	}

	// setter method is proceeding ..
	public void setIbflag          ( String           ibflag           ){	this.ibflag           = ibflag          	;	}
	public void setPage_rows       ( String           page_rows        ){	this.page_rows        = page_rows       	;	}
	public void setCntr_sz_cd      ( String           cntr_sz_cd       ){	this.cntr_sz_cd       = cntr_sz_cd      	;	}
	public void setCntr_sz_desc    ( String           cntr_sz_desc     ){	this.cntr_sz_desc     = cntr_sz_desc    	;	}
	public void setCntr_sz_teu_capa( String           cntr_sz_teu_capa ){	this.cntr_sz_teu_capa = cntr_sz_teu_capa	;	}
	public void setModi_cntr_sz_cd ( String           modi_cntr_sz_cd  ){	this.modi_cntr_sz_cd  = modi_cntr_sz_cd 	;	}
	public void setCre_usr_id      ( String           cre_usr_id       ){	this.cre_usr_id       = cre_usr_id      	;	}
	public void setCre_dt          ( String           cre_dt           ){	this.cre_dt           = cre_dt          	;	}
	public void setUpd_usr_id      ( String           upd_usr_id       ){	this.upd_usr_id       = upd_usr_id      	;	}
	public void setUpd_dt          ( String           upd_dt           ){	this.upd_dt           = upd_dt          	;	}
	public void setDelt_flg        ( String           delt_flg         ){	this.delt_flg         = delt_flg        	;	}
	public void setEai_evnt_dt     ( String           eai_evnt_dt      ){	this.eai_evnt_dt      = eai_evnt_dt     	;	}
	public void setEai_if_id	   ( String           eai_if_id	      ){	this.eai_if_id	      = eai_if_id       	;	}

	public static MdmCntrSz fromRequest(HttpServletRequest request) {
		MdmCntrSz model = new MdmCntrSz();
		try {
			model.setIbflag          	(JSPUtil.getParameter(request, "ibflag          		".trim(), ""));
			model.setPage_rows       	(JSPUtil.getParameter(request, "page_rows       		".trim(), ""));
			model.setCntr_sz_cd      	(JSPUtil.getParameter(request, "cntr_sz_cd      		".trim(), ""));
			model.setCntr_sz_desc    	(JSPUtil.getParameter(request, "cntr_sz_desc    		".trim(), ""));
			model.setCntr_sz_teu_capa	(JSPUtil.getParameter(request, "cntr_sz_teu_capa		".trim(), ""));
			model.setModi_cntr_sz_cd 	(JSPUtil.getParameter(request, "modi_cntr_sz_cd 		".trim(), ""));
			model.setCre_usr_id      	(JSPUtil.getParameter(request, "cre_usr_id      		".trim(), ""));
			model.setCre_dt          	(JSPUtil.getParameter(request, "cre_dt          		".trim(), ""));
			model.setUpd_usr_id      	(JSPUtil.getParameter(request, "upd_usr_id      		".trim(), ""));
			model.setUpd_dt          	(JSPUtil.getParameter(request, "upd_dt          		".trim(), ""));
			model.setDelt_flg        	(JSPUtil.getParameter(request, "delt_flg        		".trim(), ""));
			model.setEai_evnt_dt     	(JSPUtil.getParameter(request, "eai_evnt_dt     		".trim(), ""));
			model.setEai_if_id	     	(JSPUtil.getParameter(request, "eai_if_id	     		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		MdmCntrSz model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag           =  (JSPUtil.getParameter(request, "ibflag          		".trim(), length));
			String[] page_rows        =  (JSPUtil.getParameter(request, "page_rows       		".trim(), length));
			String[] cntr_sz_cd       =  (JSPUtil.getParameter(request, "cntr_sz_cd      		".trim(), length));
			String[] cntr_sz_desc     =  (JSPUtil.getParameter(request, "cntr_sz_desc    		".trim(), length));
			String[] cntr_sz_teu_capa =  (JSPUtil.getParameter(request, "cntr_sz_teu_capa		".trim(), length));
			String[] modi_cntr_sz_cd  =  (JSPUtil.getParameter(request, "modi_cntr_sz_cd 		".trim(), length));
			String[] cre_usr_id       =  (JSPUtil.getParameter(request, "cre_usr_id      		".trim(), length));
			String[] cre_dt           =  (JSPUtil.getParameter(request, "cre_dt          		".trim(), length));
			String[] upd_usr_id       =  (JSPUtil.getParameter(request, "upd_usr_id      		".trim(), length));
			String[] upd_dt           =  (JSPUtil.getParameter(request, "upd_dt          		".trim(), length));
			String[] delt_flg         =  (JSPUtil.getParameter(request, "delt_flg        		".trim(), length));
			String[] eai_evnt_dt      =  (JSPUtil.getParameter(request, "eai_evnt_dt     		".trim(), length));
			String[] eai_if_id	      =  (JSPUtil.getParameter(request, "eai_if_id	     		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new MdmCntrSz();
				model.setIbflag          		  (ibflag          	[i]);
				model.setPage_rows       		  (page_rows       	[i]);
				model.setCntr_sz_cd      		  (cntr_sz_cd      	[i]);
				model.setCntr_sz_desc    		  (cntr_sz_desc    	[i]);
				model.setCntr_sz_teu_capa		  (cntr_sz_teu_capa	[i]);
				model.setModi_cntr_sz_cd 		  (modi_cntr_sz_cd 	[i]);
				model.setCre_usr_id      		  (cre_usr_id      	[i]);
				model.setCre_dt          		  (cre_dt          	[i]);
				model.setUpd_usr_id      		  (upd_usr_id      	[i]);
				model.setUpd_dt          		  (upd_dt          	[i]);
				model.setDelt_flg        		  (delt_flg        	[i]);
				model.setEai_evnt_dt     		  (eai_evnt_dt     	[i]);
				model.setEai_if_id	     		  (eai_if_id     	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		MdmCntrSz model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag           =  (JSPUtil.getParameter(request, prefix + "ibflag          		".trim(), length));
			String[] page_rows        =  (JSPUtil.getParameter(request, prefix + "page_rows       		".trim(), length));
			String[] cntr_sz_cd       =  (JSPUtil.getParameter(request, prefix + "cntr_sz_cd      		".trim(), length));
			String[] cntr_sz_desc     =  (JSPUtil.getParameter(request, prefix + "cntr_sz_desc    		".trim(), length));
			String[] cntr_sz_teu_capa =  (JSPUtil.getParameter(request, prefix + "cntr_sz_teu_capa		".trim(), length));
			String[] modi_cntr_sz_cd  =  (JSPUtil.getParameter(request, prefix + "modi_cntr_sz_cd 		".trim(), length));
			String[] cre_usr_id       =  (JSPUtil.getParameter(request, prefix + "cre_usr_id      		".trim(), length));
			String[] cre_dt           =  (JSPUtil.getParameter(request, prefix + "cre_dt          		".trim(), length));
			String[] upd_usr_id       =  (JSPUtil.getParameter(request, prefix + "upd_usr_id      		".trim(), length));
			String[] upd_dt           =  (JSPUtil.getParameter(request, prefix + "upd_dt          		".trim(), length));
			String[] delt_flg         =  (JSPUtil.getParameter(request, prefix + "delt_flg        		".trim(), length));
			String[] eai_evnt_dt      =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt     		".trim(), length));
			String[] eai_if_id	      =  (JSPUtil.getParameter(request, prefix + "eai_if_id	     		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new MdmCntrSz();
				model.setIbflag          		  ( ibflag          	[i]);
				model.setPage_rows       		  ( page_rows       	[i]);
				model.setCntr_sz_cd      		  ( cntr_sz_cd      	[i]);
				model.setCntr_sz_desc    		  ( cntr_sz_desc    	[i]);
				model.setCntr_sz_teu_capa		  ( cntr_sz_teu_capa	[i]);
				model.setModi_cntr_sz_cd 		  ( modi_cntr_sz_cd 	[i]);
				model.setCre_usr_id      		  ( cre_usr_id      	[i]);
				model.setCre_dt          		  ( cre_dt          	[i]);
				model.setUpd_usr_id      		  ( upd_usr_id      	[i]);
				model.setUpd_dt          		  ( upd_dt          	[i]);
				model.setDelt_flg        		  ( delt_flg        	[i]);
				model.setEai_evnt_dt     		  ( eai_evnt_dt     	[i]);
				model.setEai_if_id	     		  ( eai_if_id	     	[i]);
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
