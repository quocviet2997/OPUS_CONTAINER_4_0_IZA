/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : VSL_PORT_SKD.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2006-12-15
*@LastModifier : JeongSeon An
*@LastVersion : 1.0
* 2006-12-15 JeongSeon An
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
 * @author Jeongseon An
 * @since J2EE 1.4
 */
public final class VSK_PF_SKD implements java.io.Serializable {

	private String                ibflag                = "";
	private String                page_rows             = "";
	private String                vsl_slan_cd           = "";
	private String                pf_svc_tp_cd          = "";
	private String                slan_stnd_flg         = "";
	private String                pf_src_tp_cd          = "";
	private String                svc_dur_dys           = "";
	private String                stnd_svc_spd          = "";
	private String                brth_itval_dys        = "";
	private String                pf_skd_opr_id         = "";
	private String                co_cd                 = "";
	private String                prod_ocn_rout_use_flg = "";
	private String                pf_skd_rmk            = "";
	private String                nis_evnt_dt           = "";
	private String                cre_usr_id            = "";
	private String                cre_dt                = "";
	private String                upd_usr_id            = "";
	private String                upd_dt                = "";

	public VSK_PF_SKD(){}

	public VSK_PF_SKD(
			String                ibflag               ,
			String                page_rows            ,
			String                vsl_slan_cd          ,
			String                pf_svc_tp_cd         ,
			String                slan_stnd_flg        ,
			String                pf_src_tp_cd         ,
			String                svc_dur_dys          ,
			String                stnd_svc_spd         ,
			String                brth_itval_dys       ,
			String                pf_skd_opr_id        ,
			String                co_cd                ,
			String                prod_ocn_rout_use_flg,
			String                pf_skd_rmk           ,
			String                nis_evnt_dt          ,
			String                cre_usr_id           ,
			String                cre_dt               ,
			String                upd_usr_id           ,
			String                upd_dt               ){
		this.ibflag                = ibflag               ;
		this.page_rows             = page_rows            ;
		this.vsl_slan_cd           = vsl_slan_cd          ;
		this.pf_svc_tp_cd          = pf_svc_tp_cd         ;
		this.slan_stnd_flg         = slan_stnd_flg        ;
		this.pf_src_tp_cd          = pf_src_tp_cd         ;
		this.svc_dur_dys           = svc_dur_dys          ;
		this.stnd_svc_spd          = stnd_svc_spd         ;
		this.brth_itval_dys        = brth_itval_dys       ;
		this.pf_skd_opr_id         = pf_skd_opr_id        ;
		this.co_cd                 = co_cd                ;
		this.prod_ocn_rout_use_flg = prod_ocn_rout_use_flg;
		this.pf_skd_rmk            = pf_skd_rmk           ;
		this.nis_evnt_dt           = nis_evnt_dt          ;
		this.cre_usr_id            = cre_usr_id           ;
		this.cre_dt                = cre_dt               ;
		this.upd_usr_id            = upd_usr_id           ;
		this.upd_dt                = upd_dt               ;
	}

	// getter method is proceeding ..
	public String                getIbflag               (){	return ibflag               	;	}
	public String                getPage_rows            (){	return page_rows            	;	}
	public String                getVsl_slan_cd          (){	return vsl_slan_cd          	;	}
	public String                getPf_svc_tp_cd         (){	return pf_svc_tp_cd         	;	}
	public String                getSlan_stnd_flg        (){	return slan_stnd_flg        	;	}
	public String                getPf_src_tp_cd         (){	return pf_src_tp_cd         	;	}
	public String                getSvc_dur_dys          (){	return svc_dur_dys          	;	}
	public String                getStnd_svc_spd         (){	return stnd_svc_spd         	;	}
	public String                getBrth_itval_dys       (){	return brth_itval_dys       	;	}
	public String                getPf_skd_opr_id        (){	return pf_skd_opr_id        	;	}
	public String                getCo_cd                (){	return co_cd                	;	}
	public String                getProd_ocn_rout_use_flg(){	return prod_ocn_rout_use_flg	;	}
	public String                getPf_skd_rmk           (){	return pf_skd_rmk           	;	}
	public String                getNis_evnt_dt          (){	return nis_evnt_dt          	;	}
	public String                getCre_usr_id           (){	return cre_usr_id           	;	}
	public String                getCre_dt               (){	return cre_dt               	;	}
	public String                getUpd_usr_id           (){	return upd_usr_id           	;	}
	public String                getUpd_dt               (){	return upd_dt               	;	}

	// setter method is proceeding ..
	public void setIbflag               ( String                ibflag                ){	this.ibflag                = ibflag               	;	}
	public void setPage_rows            ( String                page_rows             ){	this.page_rows             = page_rows            	;	}
	public void setVsl_slan_cd          ( String                vsl_slan_cd           ){	this.vsl_slan_cd           = vsl_slan_cd          	;	}
	public void setPf_svc_tp_cd         ( String                pf_svc_tp_cd          ){	this.pf_svc_tp_cd          = pf_svc_tp_cd         	;	}
	public void setSlan_stnd_flg        ( String                slan_stnd_flg         ){	this.slan_stnd_flg         = slan_stnd_flg        	;	}
	public void setPf_src_tp_cd         ( String                pf_src_tp_cd          ){	this.pf_src_tp_cd          = pf_src_tp_cd         	;	}
	public void setSvc_dur_dys          ( String                svc_dur_dys           ){	this.svc_dur_dys           = svc_dur_dys          	;	}
	public void setStnd_svc_spd         ( String                stnd_svc_spd          ){	this.stnd_svc_spd          = stnd_svc_spd         	;	}
	public void setBrth_itval_dys       ( String                brth_itval_dys        ){	this.brth_itval_dys        = brth_itval_dys       	;	}
	public void setPf_skd_opr_id        ( String                pf_skd_opr_id         ){	this.pf_skd_opr_id         = pf_skd_opr_id        	;	}
	public void setCo_cd                ( String                co_cd                 ){	this.co_cd                 = co_cd                	;	}
	public void setProd_ocn_rout_use_flg( String                prod_ocn_rout_use_flg ){	this.prod_ocn_rout_use_flg = prod_ocn_rout_use_flg	;	}
	public void setPf_skd_rmk           ( String                pf_skd_rmk            ){	this.pf_skd_rmk            = pf_skd_rmk           	;	}
	public void setNis_evnt_dt          ( String                nis_evnt_dt           ){	this.nis_evnt_dt           = nis_evnt_dt          	;	}
	public void setCre_usr_id           ( String                cre_usr_id            ){	this.cre_usr_id            = cre_usr_id           	;	}
	public void setCre_dt               ( String                cre_dt                ){	this.cre_dt                = cre_dt               	;	}
	public void setUpd_usr_id           ( String                upd_usr_id            ){	this.upd_usr_id            = upd_usr_id           	;	}
	public void setUpd_dt               ( String                upd_dt                ){	this.upd_dt                = upd_dt               	;	}

	public static VSK_PF_SKD fromRequest(HttpServletRequest request) {
		VSK_PF_SKD model = new VSK_PF_SKD();
		try {
			model.setIbflag               	(JSPUtil.getParameter(request, "ibflag               		".trim(), ""));
			model.setPage_rows            	(JSPUtil.getParameter(request, "page_rows            		".trim(), ""));
			model.setVsl_slan_cd          	(JSPUtil.getParameter(request, "vsl_slan_cd          		".trim(), ""));
			model.setPf_svc_tp_cd         	(JSPUtil.getParameter(request, "pf_svc_tp_cd         		".trim(), ""));
			model.setSlan_stnd_flg        	(JSPUtil.getParameter(request, "slan_stnd_flg        		".trim(), ""));
			model.setPf_src_tp_cd         	(JSPUtil.getParameter(request, "pf_src_tp_cd         		".trim(), ""));
			model.setSvc_dur_dys          	(JSPUtil.getParameter(request, "svc_dur_dys          		".trim(), ""));
			model.setStnd_svc_spd         	(JSPUtil.getParameter(request, "stnd_svc_spd         		".trim(), ""));
			model.setBrth_itval_dys       	(JSPUtil.getParameter(request, "brth_itval_dys       		".trim(), ""));
			model.setPf_skd_opr_id        	(JSPUtil.getParameter(request, "pf_skd_opr_id        		".trim(), ""));
			model.setCo_cd                	(JSPUtil.getParameter(request, "co_cd                		".trim(), ""));
			model.setProd_ocn_rout_use_flg	(JSPUtil.getParameter(request, "prod_ocn_rout_use_flg		".trim(), ""));
			model.setPf_skd_rmk           	(JSPUtil.getParameter(request, "pf_skd_rmk           		".trim(), ""));
			model.setNis_evnt_dt          	(JSPUtil.getParameter(request, "nis_evnt_dt          		".trim(), ""));
			model.setCre_usr_id           	(JSPUtil.getParameter(request, "cre_usr_id           		".trim(), ""));
			model.setCre_dt               	(JSPUtil.getParameter(request, "cre_dt               		".trim(), ""));
			model.setUpd_usr_id           	(JSPUtil.getParameter(request, "upd_usr_id           		".trim(), ""));
			model.setUpd_dt               	(JSPUtil.getParameter(request, "upd_dt               		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		VSK_PF_SKD model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag                =  (JSPUtil.getParameter(request, "ibflag               		".trim(), length));
			String[] page_rows             =  (JSPUtil.getParameter(request, "page_rows            		".trim(), length));
			String[] vsl_slan_cd           =  (JSPUtil.getParameter(request, "vsl_slan_cd          		".trim(), length));
			String[] pf_svc_tp_cd          =  (JSPUtil.getParameter(request, "pf_svc_tp_cd         		".trim(), length));
			String[] slan_stnd_flg         =  (JSPUtil.getParameter(request, "slan_stnd_flg        		".trim(), length));
			String[] pf_src_tp_cd          =  (JSPUtil.getParameter(request, "pf_src_tp_cd         		".trim(), length));
			String[] svc_dur_dys           =  (JSPUtil.getParameter(request, "svc_dur_dys          		".trim(), length));
			String[] stnd_svc_spd          =  (JSPUtil.getParameter(request, "stnd_svc_spd         		".trim(), length));
			String[] brth_itval_dys        =  (JSPUtil.getParameter(request, "brth_itval_dys       		".trim(), length));
			String[] pf_skd_opr_id         =  (JSPUtil.getParameter(request, "pf_skd_opr_id        		".trim(), length));
			String[] co_cd                 =  (JSPUtil.getParameter(request, "co_cd                		".trim(), length));
			String[] prod_ocn_rout_use_flg =  (JSPUtil.getParameter(request, "prod_ocn_rout_use_flg		".trim(), length));
			String[] pf_skd_rmk            =  (JSPUtil.getParameter(request, "pf_skd_rmk           		".trim(), length));
			String[] nis_evnt_dt           =  (JSPUtil.getParameter(request, "nis_evnt_dt          		".trim(), length));
			String[] cre_usr_id            =  (JSPUtil.getParameter(request, "cre_usr_id           		".trim(), length));
			String[] cre_dt                =  (JSPUtil.getParameter(request, "cre_dt               		".trim(), length));
			String[] upd_usr_id            =  (JSPUtil.getParameter(request, "upd_usr_id           		".trim(), length));
			String[] upd_dt                =  (JSPUtil.getParameter(request, "upd_dt               		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new VSK_PF_SKD();
				model.setIbflag               		  (ibflag               	[i]);
				model.setPage_rows            		  (page_rows            	[i]);
				model.setVsl_slan_cd          		  (vsl_slan_cd          	[i]);
				model.setPf_svc_tp_cd         		  (pf_svc_tp_cd         	[i]);
				model.setSlan_stnd_flg        		  (slan_stnd_flg        	[i]);
				model.setPf_src_tp_cd         		  (pf_src_tp_cd         	[i]);
				model.setSvc_dur_dys          		  (svc_dur_dys          	[i]);
				model.setStnd_svc_spd         		  (stnd_svc_spd         	[i]);
				model.setBrth_itval_dys       		  (brth_itval_dys       	[i]);
				model.setPf_skd_opr_id        		  (pf_skd_opr_id        	[i]);
				model.setCo_cd                		  (co_cd                	[i]);
				model.setProd_ocn_rout_use_flg		  (prod_ocn_rout_use_flg	[i]);
				model.setPf_skd_rmk           		  (pf_skd_rmk           	[i]);
				model.setNis_evnt_dt          		  (nis_evnt_dt          	[i]);
				model.setCre_usr_id           		  (cre_usr_id           	[i]);
				model.setCre_dt               		  (cre_dt               	[i]);
				model.setUpd_usr_id           		  (upd_usr_id           	[i]);
				model.setUpd_dt               		  (upd_dt               	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		VSK_PF_SKD model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag                =  (JSPUtil.getParameter(request, prefix + "ibflag               		".trim(), length));
			String[] page_rows             =  (JSPUtil.getParameter(request, prefix + "page_rows            		".trim(), length));
			String[] vsl_slan_cd           =  (JSPUtil.getParameter(request, prefix + "vsl_slan_cd          		".trim(), length));
			String[] pf_svc_tp_cd          =  (JSPUtil.getParameter(request, prefix + "pf_svc_tp_cd         		".trim(), length));
			String[] slan_stnd_flg         =  (JSPUtil.getParameter(request, prefix + "slan_stnd_flg        		".trim(), length));
			String[] pf_src_tp_cd          =  (JSPUtil.getParameter(request, prefix + "pf_src_tp_cd         		".trim(), length));
			String[] svc_dur_dys           =  (JSPUtil.getParameter(request, prefix + "svc_dur_dys          		".trim(), length));
			String[] stnd_svc_spd          =  (JSPUtil.getParameter(request, prefix + "stnd_svc_spd         		".trim(), length));
			String[] brth_itval_dys        =  (JSPUtil.getParameter(request, prefix + "brth_itval_dys       		".trim(), length));
			String[] pf_skd_opr_id         =  (JSPUtil.getParameter(request, prefix + "pf_skd_opr_id        		".trim(), length));
			String[] co_cd                 =  (JSPUtil.getParameter(request, prefix + "co_cd                		".trim(), length));
			String[] prod_ocn_rout_use_flg =  (JSPUtil.getParameter(request, prefix + "prod_ocn_rout_use_flg		".trim(), length));
			String[] pf_skd_rmk            =  (JSPUtil.getParameter(request, prefix + "pf_skd_rmk           		".trim(), length));
			String[] nis_evnt_dt           =  (JSPUtil.getParameter(request, prefix + "nis_evnt_dt          		".trim(), length));
			String[] cre_usr_id            =  (JSPUtil.getParameter(request, prefix + "cre_usr_id           		".trim(), length));
			String[] cre_dt                =  (JSPUtil.getParameter(request, prefix + "cre_dt               		".trim(), length));
			String[] upd_usr_id            =  (JSPUtil.getParameter(request, prefix + "upd_usr_id           		".trim(), length));
			String[] upd_dt                =  (JSPUtil.getParameter(request, prefix + "upd_dt               		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new VSK_PF_SKD();
				model.setIbflag               		  ( ibflag               	[i]);
				model.setPage_rows            		  ( page_rows            	[i]);
				model.setVsl_slan_cd          		  ( vsl_slan_cd          	[i]);
				model.setPf_svc_tp_cd         		  ( pf_svc_tp_cd         	[i]);
				model.setSlan_stnd_flg        		  ( slan_stnd_flg        	[i]);
				model.setPf_src_tp_cd         		  ( pf_src_tp_cd         	[i]);
				model.setSvc_dur_dys          		  ( svc_dur_dys          	[i]);
				model.setStnd_svc_spd         		  ( stnd_svc_spd         	[i]);
				model.setBrth_itval_dys       		  ( brth_itval_dys       	[i]);
				model.setPf_skd_opr_id        		  ( pf_skd_opr_id        	[i]);
				model.setCo_cd                		  ( co_cd                	[i]);
				model.setProd_ocn_rout_use_flg		  ( prod_ocn_rout_use_flg	[i]);
				model.setPf_skd_rmk           		  ( pf_skd_rmk           	[i]);
				model.setNis_evnt_dt          		  ( nis_evnt_dt          	[i]);
				model.setCre_usr_id           		  ( cre_usr_id           	[i]);
				model.setCre_dt               		  ( cre_dt               	[i]);
				model.setUpd_usr_id           		  ( upd_usr_id           	[i]);
				model.setUpd_dt               		  ( upd_dt               	[i]);
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
