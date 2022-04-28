/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : SPE_SVC_PROV_SVC_CATE_MTCH.java
*@FileTitle : Service Provider Evolution
*Open Issues :
*Change history :
*@LastModifyDate : 2007-03-19
*@LastModifier : Jung-Jae Kim
*@LastVersion : 1.0
* 2007-03-19 Jung-Jae Kim
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
 * @author Jung-Jae Kim
 * @since J2EE 1.4
 */
public final class SPE_SVC_PROV_SVC_CATE_MTCH implements java.io.Serializable {

	private String        ibflag        	 = "";
	private String        vndr_seq     		 = "";
	private String        svc_cate_trsp_flg  = "";
	private String        svc_cate_rail_flg  = "";
	private String        svc_cate_cy_flg    = "";
	private String        svc_cate_tml_flg   = "";
	private String        svc_cate_wtr_flg   = "";
	private String        svc_cate_eq_flg 	 = "";
	private String        cre_usr_id         = "";
	private String        cre_dt        	 = "";
	private String        upd_usr_id    	 = "";
	private String        upd_dt        	 = "";

	public SPE_SVC_PROV_SVC_CATE_MTCH(){}

	public SPE_SVC_PROV_SVC_CATE_MTCH(
			String        ibflag       			,
			String        vndr_seq    			,
			String        svc_cate_trsp_flg     ,
			String        svc_cate_rail_flg    	,
			String        svc_cate_cy_flg    	,
			String        svc_cate_tml_flg    	,
			String        svc_cate_wtr_flg  	,
			String        svc_cate_eq_flg		,
			String        cre_usr_id   			,
			String        cre_dt       			,
			String        upd_usr_id   			,
			String        upd_dt       			){
		this.ibflag        		= ibflag       		;
		this.vndr_seq     		= vndr_seq    		;
		this.svc_cate_trsp_flg  = svc_cate_trsp_flg ;
		this.svc_cate_rail_flg  = svc_cate_rail_flg ;
		this.svc_cate_cy_flg    = svc_cate_cy_flg   ;
		this.svc_cate_tml_flg   = svc_cate_tml_flg  ;
		this.svc_cate_wtr_flg   = svc_cate_wtr_flg  ;
		this.svc_cate_eq_flg 	= svc_cate_eq_flg	;
		this.cre_usr_id    		= cre_usr_id   		;
		this.cre_dt        		= cre_dt       		;
		this.upd_usr_id    		= upd_usr_id   		;
		this.upd_dt        		= upd_dt       		;
	}

	// getter method is proceeding ..
	public String        getIbflag       		(){	return ibflag       		;	}
	public String        getVndr_seq    		(){	return vndr_seq    			;	}
	public String        getSvc_cate_trsp_flg   (){	return svc_cate_trsp_flg   	;	}
	public String        getSvc_cate_rail_flg   (){	return svc_cate_rail_flg    ;	}
	public String        getSvc_cate_cy_flg     (){	return svc_cate_cy_flg    	;	}
	public String        getSvc_cate_tml_flg    (){	return svc_cate_tml_flg    	;	}
	public String        getSvc_cate_wtr_flg  	(){	return svc_cate_wtr_flg  	;	}
	public String        getSvc_cate_eq_flg		(){	return svc_cate_eq_flg		;	}
	public String        getCre_usr_id   		(){	return cre_usr_id   		;	}
	public String        getCre_dt       		(){	return cre_dt       		;	}
	public String        getUpd_usr_id   		(){	return upd_usr_id   		;	}
	public String        getUpd_dt       		(){	return upd_dt       		;	}

	// setter method is proceeding ..
	public void setIbflag       		( String        ibflag        		){	this.ibflag        		= ibflag       			;	}
	public void setVndr_seq    			( String        vndr_seq     		){	this.vndr_seq     		= vndr_seq    			;	}
	public void setSvc_cate_trsp_flg    ( String        svc_cate_trsp_flg   ){	this.svc_cate_trsp_flg  = svc_cate_trsp_flg     ;	}
	public void setSvc_cate_rail_flg    ( String        svc_cate_rail_flg   ){	this.svc_cate_rail_flg  = svc_cate_rail_flg    	;	}
	public void setSvc_cate_cy_flg    	( String        svc_cate_cy_flg     ){	this.svc_cate_cy_flg    = svc_cate_cy_flg    	;	}
	public void setSvc_cate_tml_flg    	( String        svc_cate_tml_flg    ){	this.svc_cate_tml_flg   = svc_cate_tml_flg    	;	}
	public void setSvc_cate_wtr_flg  	( String        svc_cate_wtr_flg   	){	this.svc_cate_wtr_flg   = svc_cate_wtr_flg  	;	}
	public void setSvc_cate_eq_flg		( String        svc_cate_eq_flg 	){	this.svc_cate_eq_flg 	= svc_cate_eq_flg		;	}
	public void setCre_usr_id   		( String        cre_usr_id    		){	this.cre_usr_id    		= cre_usr_id   			;	}
	public void setCre_dt       		( String        cre_dt        		){	this.cre_dt        		= cre_dt       			;	}
	public void setUpd_usr_id   		( String        upd_usr_id    		){	this.upd_usr_id    		= upd_usr_id   			;	}
	public void setUpd_dt       		( String        upd_dt        		){	this.upd_dt        		= upd_dt       			;	}

	public static SPE_SVC_PROV_SVC_CATE_MTCH fromRequest(HttpServletRequest request) {
		SPE_SVC_PROV_SVC_CATE_MTCH model = new SPE_SVC_PROV_SVC_CATE_MTCH();
		try {
			model.setIbflag       		(JSPUtil.getParameter(request, "ibflag       		".trim(), ""));
			model.setVndr_seq    		(JSPUtil.getParameter(request, "vndr_seq    		".trim(), ""));
			model.setSvc_cate_trsp_flg  (JSPUtil.getParameter(request, "svc_cate_trsp_flg   ".trim(), ""));
			model.setSvc_cate_rail_flg  (JSPUtil.getParameter(request, "svc_cate_rail_flg   ".trim(), ""));
			model.setSvc_cate_cy_flg    (JSPUtil.getParameter(request, "svc_cate_cy_flg    	".trim(), ""));
			model.setSvc_cate_tml_flg   (JSPUtil.getParameter(request, "svc_cate_tml_flg    ".trim(), ""));
			model.setSvc_cate_wtr_flg  	(JSPUtil.getParameter(request, "svc_cate_wtr_flg  	".trim(), ""));
			model.setSvc_cate_eq_flg	(JSPUtil.getParameter(request, "svc_cate_eq_flg		".trim(), ""));
			model.setCre_usr_id   		(JSPUtil.getParameter(request, "cre_usr_id   		".trim(), ""));
			model.setCre_dt       		(JSPUtil.getParameter(request, "cre_dt       		".trim(), ""));
			model.setUpd_usr_id   		(JSPUtil.getParameter(request, "upd_usr_id   		".trim(), ""));
			model.setUpd_dt       		(JSPUtil.getParameter(request, "upd_dt       		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		SPE_SVC_PROV_SVC_CATE_MTCH model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag        		=  (JSPUtil.getParameter(request, "ibflag       		".trim(), length));
			String[] vndr_seq     		=  (JSPUtil.getParameter(request, "vndr_seq    			".trim(), length));
			String[] svc_cate_trsp_flg  =  (JSPUtil.getParameter(request, "svc_cate_trsp_flg    ".trim(), length));
			String[] svc_cate_rail_flg  =  (JSPUtil.getParameter(request, "svc_cate_rail_flg    ".trim(), length));
			String[] svc_cate_cy_flg    =  (JSPUtil.getParameter(request, "svc_cate_cy_flg    	".trim(), length));
			String[] svc_cate_tml_flg   =  (JSPUtil.getParameter(request, "svc_cate_tml_flg    	".trim(), length));
			String[] svc_cate_wtr_flg   =  (JSPUtil.getParameter(request, "svc_cate_wtr_flg  	".trim(), length));
			String[] svc_cate_eq_flg 	=  (JSPUtil.getParameter(request, "svc_cate_eq_flg		".trim(), length));
			String[] cre_usr_id    		=  (JSPUtil.getParameter(request, "cre_usr_id   		".trim(), length));
			String[] cre_dt        		=  (JSPUtil.getParameter(request, "cre_dt       		".trim(), length));
			String[] upd_usr_id    		=  (JSPUtil.getParameter(request, "upd_usr_id   		".trim(), length));
			String[] upd_dt        		=  (JSPUtil.getParameter(request, "upd_dt       		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new SPE_SVC_PROV_SVC_CATE_MTCH();
				model.setIbflag       		  (ibflag       	[i]);
				model.setVndr_seq    		  (vndr_seq    		[i]);
				model.setSvc_cate_trsp_flg    (svc_cate_trsp_flg[i]);
				model.setSvc_cate_rail_flg    (svc_cate_rail_flg[i]);
				model.setSvc_cate_cy_flg      (svc_cate_cy_flg  [i]);
				model.setSvc_cate_tml_flg     (svc_cate_tml_flg [i]);
				model.setSvc_cate_wtr_flg  	  (svc_cate_wtr_flg [i]);
				model.setSvc_cate_eq_flg	  (svc_cate_eq_flg	[i]);
				model.setCre_usr_id   		  (cre_usr_id   	[i]);
				model.setCre_dt       		  (cre_dt       	[i]);
				model.setUpd_usr_id   		  (upd_usr_id   	[i]);
				model.setUpd_dt       		  (upd_dt       	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		SPE_SVC_PROV_SVC_CATE_MTCH model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag        		=  (JSPUtil.getParameter(request, prefix + "ibflag       		".trim(), length));
			String[] vndr_seq     		=  (JSPUtil.getParameter(request, prefix + "vndr_seq    		".trim(), length));
			String[] svc_cate_trsp_flg  =  (JSPUtil.getParameter(request, prefix + "svc_cate_trsp_flg   ".trim(), length));
			String[] svc_cate_rail_flg  =  (JSPUtil.getParameter(request, prefix + "svc_cate_rail_flg   ".trim(), length));
			String[] svc_cate_cy_flg    =  (JSPUtil.getParameter(request, prefix + "svc_cate_cy_flg    	".trim(), length));
			String[] svc_cate_tml_flg   =  (JSPUtil.getParameter(request, prefix + "svc_cate_tml_flg    ".trim(), length));
			String[] svc_cate_wtr_flg   =  (JSPUtil.getParameter(request, prefix + "svc_cate_wtr_flg  	".trim(), length));
			String[] svc_cate_eq_flg 	=  (JSPUtil.getParameter(request, prefix + "svc_cate_eq_flg		".trim(), length));
			String[] cre_usr_id    		=  (JSPUtil.getParameter(request, prefix + "cre_usr_id   		".trim(), length));
			String[] cre_dt        		=  (JSPUtil.getParameter(request, prefix + "cre_dt       		".trim(), length));
			String[] upd_usr_id    		=  (JSPUtil.getParameter(request, prefix + "upd_usr_id   		".trim(), length));
			String[] upd_dt        		=  (JSPUtil.getParameter(request, prefix + "upd_dt       		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new SPE_SVC_PROV_SVC_CATE_MTCH();
				model.setIbflag       		  ( ibflag       	 [i]);
				model.setVndr_seq    		  ( vndr_seq    	 [i]);
				model.setSvc_cate_trsp_flg    ( svc_cate_trsp_flg[i]);
				model.setSvc_cate_rail_flg    ( svc_cate_rail_flg[i]);
				model.setSvc_cate_cy_flg      ( svc_cate_cy_flg  [i]);
				model.setSvc_cate_tml_flg     ( svc_cate_tml_flg [i]);
				model.setSvc_cate_wtr_flg  	  ( svc_cate_wtr_flg [i]);
				model.setSvc_cate_eq_flg	  ( svc_cate_eq_flg	 [i]);
				model.setCre_usr_id   		  ( cre_usr_id   	 [i]);
				model.setCre_dt       		  ( cre_dt       	 [i]);
				model.setUpd_usr_id   		  ( upd_usr_id   	 [i]);
				model.setUpd_dt       		  ( upd_dt       	 [i]);
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
