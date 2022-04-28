/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : MDM_VSL_SVC_LANE.java
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
public final class MdmVslSvcLane implements java.io.Serializable {

	private String             ibflag             = "";
	private String             page_rows          = "";
	private String             vsl_slan_cd        = "";
	private String             vsl_slan_nm        = "";
	private String             vsl_svc_tp_cd      = "";
	private String             vsl_tp_cd          = "";
	private String             st_eff_dt          = "";
	private String             end_eff_dt         = "";
	private String             vsl_slan_skd_tp_cd = "";
	private String             ofc_cd             = "";
	private String             co_cd              = "";
	private String             fdr_div_cd         = "";
	private String             cre_usr_id         = "";
	private String             cre_dt             = "";
	private String             upd_usr_id         = "";
	private String             upd_dt             = "";
	private String             delt_flg           = "";
	private String             eai_evnt_dt        = "";

	public MdmVslSvcLane(){}

	public MdmVslSvcLane(
			String             ibflag            ,
			String             page_rows         ,
			String             vsl_slan_cd       ,
			String             vsl_slan_nm       ,
			String             vsl_svc_tp_cd     ,
			String             vsl_tp_cd         ,
			String             st_eff_dt         ,
			String             end_eff_dt        ,
			String             vsl_slan_skd_tp_cd,
			String             ofc_cd            ,
			String             co_cd             ,
			String             fdr_div_cd        ,
			String             cre_usr_id        ,
			String             cre_dt            ,
			String             upd_usr_id        ,
			String             upd_dt            ,
			String             delt_flg          ,
			String             eai_evnt_dt       ){
		this.ibflag             = ibflag            ;
		this.page_rows          = page_rows         ;
		this.vsl_slan_cd        = vsl_slan_cd       ;
		this.vsl_slan_nm        = vsl_slan_nm       ;
		this.vsl_svc_tp_cd      = vsl_svc_tp_cd     ;
		this.vsl_tp_cd          = vsl_tp_cd         ;
		this.st_eff_dt          = st_eff_dt         ;
		this.end_eff_dt         = end_eff_dt        ;
		this.vsl_slan_skd_tp_cd = vsl_slan_skd_tp_cd;
		this.ofc_cd             = ofc_cd            ;
		this.co_cd              = co_cd             ;
		this.fdr_div_cd         = fdr_div_cd        ;
		this.cre_usr_id         = cre_usr_id        ;
		this.cre_dt             = cre_dt            ;
		this.upd_usr_id         = upd_usr_id        ;
		this.upd_dt             = upd_dt            ;
		this.delt_flg           = delt_flg          ;
		this.eai_evnt_dt        = eai_evnt_dt       ;
	}

	// getter method is proceeding ..
	public String             getIbflag            (){	return ibflag            	;	}
	public String             getPage_rows         (){	return page_rows         	;	}
	public String             getVsl_slan_cd       (){	return vsl_slan_cd       	;	}
	public String             getVsl_slan_nm       (){	return vsl_slan_nm       	;	}
	public String             getVsl_svc_tp_cd     (){	return vsl_svc_tp_cd     	;	}
	public String             getVsl_tp_cd         (){	return vsl_tp_cd         	;	}
	public String             getSt_eff_dt         (){	return st_eff_dt         	;	}
	public String             getEnd_eff_dt        (){	return end_eff_dt        	;	}
	public String             getVsl_slan_skd_tp_cd(){	return vsl_slan_skd_tp_cd	;	}
	public String             getOfc_cd            (){	return ofc_cd            	;	}
	public String             getCo_cd             (){	return co_cd             	;	}
	public String             getFdr_div_cd        (){	return fdr_div_cd        	;	}
	public String             getCre_usr_id        (){	return cre_usr_id        	;	}
	public String             getCre_dt            (){	return cre_dt            	;	}
	public String             getUpd_usr_id        (){	return upd_usr_id        	;	}
	public String             getUpd_dt            (){	return upd_dt            	;	}
	public String             getDelt_flg          (){	return delt_flg          	;	}
	public String             getEai_evnt_dt       (){	return eai_evnt_dt       	;	}

	// setter method is proceeding ..
	public void setIbflag            ( String             ibflag             ){	this.ibflag             = ibflag            	;	}
	public void setPage_rows         ( String             page_rows          ){	this.page_rows          = page_rows         	;	}
	public void setVsl_slan_cd       ( String             vsl_slan_cd        ){	this.vsl_slan_cd        = vsl_slan_cd       	;	}
	public void setVsl_slan_nm       ( String             vsl_slan_nm        ){	this.vsl_slan_nm        = vsl_slan_nm       	;	}
	public void setVsl_svc_tp_cd     ( String             vsl_svc_tp_cd      ){	this.vsl_svc_tp_cd      = vsl_svc_tp_cd     	;	}
	public void setVsl_tp_cd         ( String             vsl_tp_cd          ){	this.vsl_tp_cd          = vsl_tp_cd         	;	}
	public void setSt_eff_dt         ( String             st_eff_dt          ){	this.st_eff_dt          = st_eff_dt         	;	}
	public void setEnd_eff_dt        ( String             end_eff_dt         ){	this.end_eff_dt         = end_eff_dt        	;	}
	public void setVsl_slan_skd_tp_cd( String             vsl_slan_skd_tp_cd ){	this.vsl_slan_skd_tp_cd = vsl_slan_skd_tp_cd	;	}
	public void setOfc_cd            ( String             ofc_cd             ){	this.ofc_cd             = ofc_cd            	;	}
	public void setCo_cd             ( String             co_cd              ){	this.co_cd              = co_cd             	;	}
	public void setFdr_div_cd        ( String             fdr_div_cd         ){	this.fdr_div_cd         = fdr_div_cd        	;	}
	public void setCre_usr_id        ( String             cre_usr_id         ){	this.cre_usr_id         = cre_usr_id        	;	}
	public void setCre_dt            ( String             cre_dt             ){	this.cre_dt             = cre_dt            	;	}
	public void setUpd_usr_id        ( String             upd_usr_id         ){	this.upd_usr_id         = upd_usr_id        	;	}
	public void setUpd_dt            ( String             upd_dt             ){	this.upd_dt             = upd_dt            	;	}
	public void setDelt_flg          ( String             delt_flg           ){	this.delt_flg           = delt_flg          	;	}
	public void setEai_evnt_dt       ( String             eai_evnt_dt        ){	this.eai_evnt_dt        = eai_evnt_dt       	;	}

	public static MdmVslSvcLane fromRequest(HttpServletRequest request) {
		MdmVslSvcLane model = new MdmVslSvcLane();
		try {
			model.setIbflag            	(JSPUtil.getParameter(request, "ibflag            		".trim(), ""));
			model.setPage_rows         	(JSPUtil.getParameter(request, "page_rows         		".trim(), ""));
			model.setVsl_slan_cd       	(JSPUtil.getParameter(request, "vsl_slan_cd       		".trim(), ""));
			model.setVsl_slan_nm       	(JSPUtil.getParameter(request, "vsl_slan_nm       		".trim(), ""));
			model.setVsl_svc_tp_cd     	(JSPUtil.getParameter(request, "vsl_svc_tp_cd     		".trim(), ""));
			model.setVsl_tp_cd         	(JSPUtil.getParameter(request, "vsl_tp_cd         		".trim(), ""));
			model.setSt_eff_dt         	(JSPUtil.getParameter(request, "st_eff_dt         		".trim(), ""));
			model.setEnd_eff_dt        	(JSPUtil.getParameter(request, "end_eff_dt        		".trim(), ""));
			model.setVsl_slan_skd_tp_cd	(JSPUtil.getParameter(request, "vsl_slan_skd_tp_cd		".trim(), ""));
			model.setOfc_cd            	(JSPUtil.getParameter(request, "ofc_cd            		".trim(), ""));
			model.setCo_cd             	(JSPUtil.getParameter(request, "co_cd             		".trim(), ""));
			model.setFdr_div_cd        	(JSPUtil.getParameter(request, "fdr_div_cd        		".trim(), ""));
			model.setCre_usr_id        	(JSPUtil.getParameter(request, "cre_usr_id        		".trim(), ""));
			model.setCre_dt            	(JSPUtil.getParameter(request, "cre_dt            		".trim(), ""));
			model.setUpd_usr_id        	(JSPUtil.getParameter(request, "upd_usr_id        		".trim(), ""));
			model.setUpd_dt            	(JSPUtil.getParameter(request, "upd_dt            		".trim(), ""));
			model.setDelt_flg          	(JSPUtil.getParameter(request, "delt_flg          		".trim(), ""));
			model.setEai_evnt_dt       	(JSPUtil.getParameter(request, "eai_evnt_dt       		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		MdmVslSvcLane model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag             =  (JSPUtil.getParameter(request, "ibflag            		".trim(), length));
			String[] page_rows          =  (JSPUtil.getParameter(request, "page_rows         		".trim(), length));
			String[] vsl_slan_cd        =  (JSPUtil.getParameter(request, "vsl_slan_cd       		".trim(), length));
			String[] vsl_slan_nm        =  (JSPUtil.getParameter(request, "vsl_slan_nm       		".trim(), length));
			String[] vsl_svc_tp_cd      =  (JSPUtil.getParameter(request, "vsl_svc_tp_cd     		".trim(), length));
			String[] vsl_tp_cd          =  (JSPUtil.getParameter(request, "vsl_tp_cd         		".trim(), length));
			String[] st_eff_dt          =  (JSPUtil.getParameter(request, "st_eff_dt         		".trim(), length));
			String[] end_eff_dt         =  (JSPUtil.getParameter(request, "end_eff_dt        		".trim(), length));
			String[] vsl_slan_skd_tp_cd =  (JSPUtil.getParameter(request, "vsl_slan_skd_tp_cd		".trim(), length));
			String[] ofc_cd             =  (JSPUtil.getParameter(request, "ofc_cd            		".trim(), length));
			String[] co_cd              =  (JSPUtil.getParameter(request, "co_cd             		".trim(), length));
			String[] fdr_div_cd         =  (JSPUtil.getParameter(request, "fdr_div_cd        		".trim(), length));
			String[] cre_usr_id         =  (JSPUtil.getParameter(request, "cre_usr_id        		".trim(), length));
			String[] cre_dt             =  (JSPUtil.getParameter(request, "cre_dt            		".trim(), length));
			String[] upd_usr_id         =  (JSPUtil.getParameter(request, "upd_usr_id        		".trim(), length));
			String[] upd_dt             =  (JSPUtil.getParameter(request, "upd_dt            		".trim(), length));
			String[] delt_flg           =  (JSPUtil.getParameter(request, "delt_flg          		".trim(), length));
			String[] eai_evnt_dt        =  (JSPUtil.getParameter(request, "eai_evnt_dt       		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new MdmVslSvcLane();
				model.setIbflag            		  (ibflag            	[i]);
				model.setPage_rows         		  (page_rows         	[i]);
				model.setVsl_slan_cd       		  (vsl_slan_cd       	[i]);
				model.setVsl_slan_nm       		  (vsl_slan_nm       	[i]);
				model.setVsl_svc_tp_cd     		  (vsl_svc_tp_cd     	[i]);
				model.setVsl_tp_cd         		  (vsl_tp_cd         	[i]);
				model.setSt_eff_dt         		  (st_eff_dt         	[i]);
				model.setEnd_eff_dt        		  (end_eff_dt        	[i]);
				model.setVsl_slan_skd_tp_cd		  (vsl_slan_skd_tp_cd	[i]);
				model.setOfc_cd            		  (ofc_cd            	[i]);
				model.setCo_cd             		  (co_cd             	[i]);
				model.setFdr_div_cd        		  (fdr_div_cd        	[i]);
				model.setCre_usr_id        		  (cre_usr_id        	[i]);
				model.setCre_dt            		  (cre_dt            	[i]);
				model.setUpd_usr_id        		  (upd_usr_id        	[i]);
				model.setUpd_dt            		  (upd_dt            	[i]);
				model.setDelt_flg          		  (delt_flg          	[i]);
				model.setEai_evnt_dt       		  (eai_evnt_dt       	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		MdmVslSvcLane model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag             =  (JSPUtil.getParameter(request, prefix + "ibflag            		".trim(), length));
			String[] page_rows          =  (JSPUtil.getParameter(request, prefix + "page_rows         		".trim(), length));
			String[] vsl_slan_cd        =  (JSPUtil.getParameter(request, prefix + "vsl_slan_cd       		".trim(), length));
			String[] vsl_slan_nm        =  (JSPUtil.getParameter(request, prefix + "vsl_slan_nm       		".trim(), length));
			String[] vsl_svc_tp_cd      =  (JSPUtil.getParameter(request, prefix + "vsl_svc_tp_cd     		".trim(), length));
			String[] vsl_tp_cd          =  (JSPUtil.getParameter(request, prefix + "vsl_tp_cd         		".trim(), length));
			String[] st_eff_dt          =  (JSPUtil.getParameter(request, prefix + "st_eff_dt         		".trim(), length));
			String[] end_eff_dt         =  (JSPUtil.getParameter(request, prefix + "end_eff_dt        		".trim(), length));
			String[] vsl_slan_skd_tp_cd =  (JSPUtil.getParameter(request, prefix + "vsl_slan_skd_tp_cd		".trim(), length));
			String[] ofc_cd             =  (JSPUtil.getParameter(request, prefix + "ofc_cd            		".trim(), length));
			String[] co_cd              =  (JSPUtil.getParameter(request, prefix + "co_cd             		".trim(), length));
			String[] fdr_div_cd         =  (JSPUtil.getParameter(request, prefix + "fdr_div_cd        		".trim(), length));
			String[] cre_usr_id         =  (JSPUtil.getParameter(request, prefix + "cre_usr_id        		".trim(), length));
			String[] cre_dt             =  (JSPUtil.getParameter(request, prefix + "cre_dt            		".trim(), length));
			String[] upd_usr_id         =  (JSPUtil.getParameter(request, prefix + "upd_usr_id        		".trim(), length));
			String[] upd_dt             =  (JSPUtil.getParameter(request, prefix + "upd_dt            		".trim(), length));
			String[] delt_flg           =  (JSPUtil.getParameter(request, prefix + "delt_flg          		".trim(), length));
			String[] eai_evnt_dt        =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt       		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new MdmVslSvcLane();
				model.setIbflag            		  ( ibflag            	[i]);
				model.setPage_rows         		  ( page_rows         	[i]);
				model.setVsl_slan_cd       		  ( vsl_slan_cd       	[i]);
				model.setVsl_slan_nm       		  ( vsl_slan_nm       	[i]);
				model.setVsl_svc_tp_cd     		  ( vsl_svc_tp_cd     	[i]);
				model.setVsl_tp_cd         		  ( vsl_tp_cd         	[i]);
				model.setSt_eff_dt         		  ( st_eff_dt         	[i]);
				model.setEnd_eff_dt        		  ( end_eff_dt        	[i]);
				model.setVsl_slan_skd_tp_cd		  ( vsl_slan_skd_tp_cd	[i]);
				model.setOfc_cd            		  ( ofc_cd            	[i]);
				model.setCo_cd             		  ( co_cd             	[i]);
				model.setFdr_div_cd        		  ( fdr_div_cd        	[i]);
				model.setCre_usr_id        		  ( cre_usr_id        	[i]);
				model.setCre_dt            		  ( cre_dt            	[i]);
				model.setUpd_usr_id        		  ( upd_usr_id        	[i]);
				model.setUpd_dt            		  ( upd_dt            	[i]);
				model.setDelt_flg          		  ( delt_flg          	[i]);
				model.setEai_evnt_dt       		  ( eai_evnt_dt       	[i]);
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
