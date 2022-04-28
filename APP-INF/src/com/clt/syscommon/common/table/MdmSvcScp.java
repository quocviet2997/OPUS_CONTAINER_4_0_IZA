/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : MDM_SVC_SCP.java
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
public final class MdmSvcScp implements java.io.Serializable {

	private String         ibflag         = "";
	private String         page_rows      = "";
	private String         svc_scp_cd     = "";
	private String         svc_scp_nm     = "";
	private String         fmc_file_flg   = "";
	private String         trf_pfx_cd     = "";
	private String         trf_no         = "";
	private String         conf_flg       = "";
	private String         svc_scp_bnd_cd = "";
	private String         cre_usr_id     = "";
	private String         upd_usr_id     = "";
	private String         cre_dt         = "";
	private String         upd_dt         = "";
	private String         delt_flg       = "";
	private String         eai_evnt_dt    = "";

	public MdmSvcScp(){}

	public MdmSvcScp(
			String         ibflag        ,
			String         page_rows     ,
			String         svc_scp_cd    ,
			String         svc_scp_nm    ,
			String         fmc_file_flg  ,
			String         trf_pfx_cd    ,
			String         trf_no        ,
			String         conf_flg      ,
			String         svc_scp_bnd_cd,
			String         cre_usr_id    ,
			String         upd_usr_id    ,
			String         cre_dt        ,
			String         upd_dt        ,
			String         delt_flg      ,
			String         eai_evnt_dt   ){
		this.ibflag         = ibflag        ;
		this.page_rows      = page_rows     ;
		this.svc_scp_cd     = svc_scp_cd    ;
		this.svc_scp_nm     = svc_scp_nm    ;
		this.fmc_file_flg   = fmc_file_flg  ;
		this.trf_pfx_cd     = trf_pfx_cd    ;
		this.trf_no         = trf_no        ;
		this.conf_flg       = conf_flg      ;
		this.svc_scp_bnd_cd = svc_scp_bnd_cd;
		this.cre_usr_id     = cre_usr_id    ;
		this.upd_usr_id     = upd_usr_id    ;
		this.cre_dt         = cre_dt        ;
		this.upd_dt         = upd_dt        ;
		this.delt_flg       = delt_flg      ;
		this.eai_evnt_dt    = eai_evnt_dt   ;
	}

	// getter method is proceeding ..
	public String         getIbflag        (){	return ibflag        	;	}
	public String         getPage_rows     (){	return page_rows     	;	}
	public String         getSvc_scp_cd    (){	return svc_scp_cd    	;	}
	public String         getSvc_scp_nm    (){	return svc_scp_nm    	;	}
	public String         getFmc_file_flg  (){	return fmc_file_flg  	;	}
	public String         getTrf_pfx_cd    (){	return trf_pfx_cd    	;	}
	public String         getTrf_no        (){	return trf_no        	;	}
	public String         getConf_flg      (){	return conf_flg      	;	}
	public String         getSvc_scp_bnd_cd(){	return svc_scp_bnd_cd	;	}
	public String         getCre_usr_id    (){	return cre_usr_id    	;	}
	public String         getUpd_usr_id    (){	return upd_usr_id    	;	}
	public String         getCre_dt        (){	return cre_dt        	;	}
	public String         getUpd_dt        (){	return upd_dt        	;	}
	public String         getDelt_flg      (){	return delt_flg      	;	}
	public String         getEai_evnt_dt   (){	return eai_evnt_dt   	;	}

	// setter method is proceeding ..
	public void setIbflag        ( String         ibflag         ){	this.ibflag         = ibflag        	;	}
	public void setPage_rows     ( String         page_rows      ){	this.page_rows      = page_rows     	;	}
	public void setSvc_scp_cd    ( String         svc_scp_cd     ){	this.svc_scp_cd     = svc_scp_cd    	;	}
	public void setSvc_scp_nm    ( String         svc_scp_nm     ){	this.svc_scp_nm     = svc_scp_nm    	;	}
	public void setFmc_file_flg  ( String         fmc_file_flg   ){	this.fmc_file_flg   = fmc_file_flg  	;	}
	public void setTrf_pfx_cd    ( String         trf_pfx_cd     ){	this.trf_pfx_cd     = trf_pfx_cd    	;	}
	public void setTrf_no        ( String         trf_no         ){	this.trf_no         = trf_no        	;	}
	public void setConf_flg      ( String         conf_flg       ){	this.conf_flg       = conf_flg      	;	}
	public void setSvc_scp_bnd_cd( String         svc_scp_bnd_cd ){	this.svc_scp_bnd_cd = svc_scp_bnd_cd	;	}
	public void setCre_usr_id    ( String         cre_usr_id     ){	this.cre_usr_id     = cre_usr_id    	;	}
	public void setUpd_usr_id    ( String         upd_usr_id     ){	this.upd_usr_id     = upd_usr_id    	;	}
	public void setCre_dt        ( String         cre_dt         ){	this.cre_dt         = cre_dt        	;	}
	public void setUpd_dt        ( String         upd_dt         ){	this.upd_dt         = upd_dt        	;	}
	public void setDelt_flg      ( String         delt_flg       ){	this.delt_flg       = delt_flg      	;	}
	public void setEai_evnt_dt   ( String         eai_evnt_dt    ){	this.eai_evnt_dt    = eai_evnt_dt   	;	}

	public static MdmSvcScp fromRequest(HttpServletRequest request) {
		MdmSvcScp model = new MdmSvcScp();
		try {
			model.setIbflag        	(JSPUtil.getParameter(request, "ibflag        		".trim(), ""));
			model.setPage_rows     	(JSPUtil.getParameter(request, "page_rows     		".trim(), ""));
			model.setSvc_scp_cd    	(JSPUtil.getParameter(request, "svc_scp_cd    		".trim(), ""));
			model.setSvc_scp_nm    	(JSPUtil.getParameter(request, "svc_scp_nm    		".trim(), ""));
			model.setFmc_file_flg  	(JSPUtil.getParameter(request, "fmc_file_flg  		".trim(), ""));
			model.setTrf_pfx_cd    	(JSPUtil.getParameter(request, "trf_pfx_cd    		".trim(), ""));
			model.setTrf_no        	(JSPUtil.getParameter(request, "trf_no        		".trim(), ""));
			model.setConf_flg      	(JSPUtil.getParameter(request, "conf_flg      		".trim(), ""));
			model.setSvc_scp_bnd_cd	(JSPUtil.getParameter(request, "svc_scp_bnd_cd		".trim(), ""));
			model.setCre_usr_id    	(JSPUtil.getParameter(request, "cre_usr_id    		".trim(), ""));
			model.setUpd_usr_id    	(JSPUtil.getParameter(request, "upd_usr_id    		".trim(), ""));
			model.setCre_dt        	(JSPUtil.getParameter(request, "cre_dt        		".trim(), ""));
			model.setUpd_dt        	(JSPUtil.getParameter(request, "upd_dt        		".trim(), ""));
			model.setDelt_flg      	(JSPUtil.getParameter(request, "delt_flg      		".trim(), ""));
			model.setEai_evnt_dt   	(JSPUtil.getParameter(request, "eai_evnt_dt   		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		MdmSvcScp model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag         =  (JSPUtil.getParameter(request, "ibflag        		".trim(), length));
			String[] page_rows      =  (JSPUtil.getParameter(request, "page_rows     		".trim(), length));
			String[] svc_scp_cd     =  (JSPUtil.getParameter(request, "svc_scp_cd    		".trim(), length));
			String[] svc_scp_nm     =  (JSPUtil.getParameter(request, "svc_scp_nm    		".trim(), length));
			String[] fmc_file_flg   =  (JSPUtil.getParameter(request, "fmc_file_flg  		".trim(), length));
			String[] trf_pfx_cd     =  (JSPUtil.getParameter(request, "trf_pfx_cd    		".trim(), length));
			String[] trf_no         =  (JSPUtil.getParameter(request, "trf_no        		".trim(), length));
			String[] conf_flg       =  (JSPUtil.getParameter(request, "conf_flg      		".trim(), length));
			String[] svc_scp_bnd_cd =  (JSPUtil.getParameter(request, "svc_scp_bnd_cd		".trim(), length));
			String[] cre_usr_id     =  (JSPUtil.getParameter(request, "cre_usr_id    		".trim(), length));
			String[] upd_usr_id     =  (JSPUtil.getParameter(request, "upd_usr_id    		".trim(), length));
			String[] cre_dt         =  (JSPUtil.getParameter(request, "cre_dt        		".trim(), length));
			String[] upd_dt         =  (JSPUtil.getParameter(request, "upd_dt        		".trim(), length));
			String[] delt_flg       =  (JSPUtil.getParameter(request, "delt_flg      		".trim(), length));
			String[] eai_evnt_dt    =  (JSPUtil.getParameter(request, "eai_evnt_dt   		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new MdmSvcScp();
				model.setIbflag        		  (ibflag        	[i]);
				model.setPage_rows     		  (page_rows     	[i]);
				model.setSvc_scp_cd    		  (svc_scp_cd    	[i]);
				model.setSvc_scp_nm    		  (svc_scp_nm    	[i]);
				model.setFmc_file_flg  		  (fmc_file_flg  	[i]);
				model.setTrf_pfx_cd    		  (trf_pfx_cd    	[i]);
				model.setTrf_no        		  (trf_no        	[i]);
				model.setConf_flg      		  (conf_flg      	[i]);
				model.setSvc_scp_bnd_cd		  (svc_scp_bnd_cd	[i]);
				model.setCre_usr_id    		  (cre_usr_id    	[i]);
				model.setUpd_usr_id    		  (upd_usr_id    	[i]);
				model.setCre_dt        		  (cre_dt        	[i]);
				model.setUpd_dt        		  (upd_dt        	[i]);
				model.setDelt_flg      		  (delt_flg      	[i]);
				model.setEai_evnt_dt   		  (eai_evnt_dt   	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		MdmSvcScp model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag         =  (JSPUtil.getParameter(request, prefix + "ibflag        		".trim(), length));
			String[] page_rows      =  (JSPUtil.getParameter(request, prefix + "page_rows     		".trim(), length));
			String[] svc_scp_cd     =  (JSPUtil.getParameter(request, prefix + "svc_scp_cd    		".trim(), length));
			String[] svc_scp_nm     =  (JSPUtil.getParameter(request, prefix + "svc_scp_nm    		".trim(), length));
			String[] fmc_file_flg   =  (JSPUtil.getParameter(request, prefix + "fmc_file_flg  		".trim(), length));
			String[] trf_pfx_cd     =  (JSPUtil.getParameter(request, prefix + "trf_pfx_cd    		".trim(), length));
			String[] trf_no         =  (JSPUtil.getParameter(request, prefix + "trf_no        		".trim(), length));
			String[] conf_flg       =  (JSPUtil.getParameter(request, prefix + "conf_flg      		".trim(), length));
			String[] svc_scp_bnd_cd =  (JSPUtil.getParameter(request, prefix + "svc_scp_bnd_cd		".trim(), length));
			String[] cre_usr_id     =  (JSPUtil.getParameter(request, prefix + "cre_usr_id    		".trim(), length));
			String[] upd_usr_id     =  (JSPUtil.getParameter(request, prefix + "upd_usr_id    		".trim(), length));
			String[] cre_dt         =  (JSPUtil.getParameter(request, prefix + "cre_dt        		".trim(), length));
			String[] upd_dt         =  (JSPUtil.getParameter(request, prefix + "upd_dt        		".trim(), length));
			String[] delt_flg       =  (JSPUtil.getParameter(request, prefix + "delt_flg      		".trim(), length));
			String[] eai_evnt_dt    =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt   		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new MdmSvcScp();
				model.setIbflag        		  ( ibflag        	[i]);
				model.setPage_rows     		  ( page_rows     	[i]);
				model.setSvc_scp_cd    		  ( svc_scp_cd    	[i]);
				model.setSvc_scp_nm    		  ( svc_scp_nm    	[i]);
				model.setFmc_file_flg  		  ( fmc_file_flg  	[i]);
				model.setTrf_pfx_cd    		  ( trf_pfx_cd    	[i]);
				model.setTrf_no        		  ( trf_no        	[i]);
				model.setConf_flg      		  ( conf_flg      	[i]);
				model.setSvc_scp_bnd_cd		  ( svc_scp_bnd_cd	[i]);
				model.setCre_usr_id    		  ( cre_usr_id    	[i]);
				model.setUpd_usr_id    		  ( upd_usr_id    	[i]);
				model.setCre_dt        		  ( cre_dt        	[i]);
				model.setUpd_dt        		  ( upd_dt        	[i]);
				model.setDelt_flg      		  ( delt_flg      	[i]);
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
