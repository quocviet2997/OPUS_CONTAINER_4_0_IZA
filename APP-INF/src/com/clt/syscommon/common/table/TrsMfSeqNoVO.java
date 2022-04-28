/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : TRS_MF_SEQ_NO.java
*@FileTitle : Adding Surcharge Agreement
*Open Issues :
*Change history :
*@LastModifyDate : 2007-06-21
*@LastModifier : agreement
*@LastVersion : 1.0
* 2007-06-21 agreement
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
 * @author agreement
 * @since J2EE 1.4
 */
public final class TrsMfSeqNoVO implements java.io.Serializable {

	private String                   ibflag                   = "";
	private String                   page_rows                = "";
	private String                   bkg_no                   = "";
	private String                   bkg_no_split             = "";
	private String                   mrn_no                   = "";
	private String                   mrn_chk_cd               = "";
	private String                   msn_no                   = "";
	private String                   msn_bl_locl_ts_cd        = "";
	private String                   msn_bl_tp_cd             = "";
	private String                   msn_cstms_clr_tp_cd      = "";
	private String                   msn_dchg_loc_no          = "";
	private String                   msn_cstms_clr_loc_cd     = "";
	private String                   msn_cstms_clr_bd_area_cd = "";
	private String                   vsl_cd                   = "";
	private String                   skd_voy_no               = "";
	private String                   skd_dir_cd               = "";
	private String                   msn_cfm_cd               = "";
	private String                   msn_ts_chk_cd            = "";
	private String                   msn_sts_cd               = "";
	private String                   msn_bd_tp_cd             = "";
	private String                   msn_cfm_dt               = "";
	private String                   msn_snd_dt               = "";
	private String                   msn_upd_dt               = "";
	private String                   eai_evnt_dt              = "";

	public TrsMfSeqNoVO(){}

	public TrsMfSeqNoVO(
			String                   ibflag                  ,
			String                   page_rows               ,
			String                   bkg_no                  ,
			String                   bkg_no_split            ,
			String                   mrn_no                  ,
			String                   mrn_chk_cd              ,
			String                   msn_no                  ,
			String                   msn_bl_locl_ts_cd       ,
			String                   msn_bl_tp_cd            ,
			String                   msn_cstms_clr_tp_cd     ,
			String                   msn_dchg_loc_no         ,
			String                   msn_cstms_clr_loc_cd    ,
			String                   msn_cstms_clr_bd_area_cd,
			String                   vsl_cd                  ,
			String                   skd_voy_no              ,
			String                   skd_dir_cd              ,
			String                   msn_cfm_cd              ,
			String                   msn_ts_chk_cd           ,
			String                   msn_sts_cd              ,
			String                   msn_bd_tp_cd            ,
			String                   msn_cfm_dt              ,
			String                   msn_snd_dt              ,
			String                   msn_upd_dt              ,
			String                   eai_evnt_dt             ){
		this.ibflag                   = ibflag                  ;
		this.page_rows                = page_rows               ;
		this.bkg_no                   = bkg_no                  ;
		this.bkg_no_split             = bkg_no_split            ;
		this.mrn_no                   = mrn_no                  ;
		this.mrn_chk_cd               = mrn_chk_cd              ;
		this.msn_no                   = msn_no                  ;
		this.msn_bl_locl_ts_cd        = msn_bl_locl_ts_cd       ;
		this.msn_bl_tp_cd             = msn_bl_tp_cd            ;
		this.msn_cstms_clr_tp_cd      = msn_cstms_clr_tp_cd     ;
		this.msn_dchg_loc_no          = msn_dchg_loc_no         ;
		this.msn_cstms_clr_loc_cd     = msn_cstms_clr_loc_cd    ;
		this.msn_cstms_clr_bd_area_cd = msn_cstms_clr_bd_area_cd;
		this.vsl_cd                   = vsl_cd                  ;
		this.skd_voy_no               = skd_voy_no              ;
		this.skd_dir_cd               = skd_dir_cd              ;
		this.msn_cfm_cd               = msn_cfm_cd              ;
		this.msn_ts_chk_cd            = msn_ts_chk_cd           ;
		this.msn_sts_cd               = msn_sts_cd              ;
		this.msn_bd_tp_cd             = msn_bd_tp_cd            ;
		this.msn_cfm_dt               = msn_cfm_dt              ;
		this.msn_snd_dt               = msn_snd_dt              ;
		this.msn_upd_dt               = msn_upd_dt              ;
		this.eai_evnt_dt              = eai_evnt_dt             ;
	}

	// getter method is proceeding ..
	public String                   getIbflag                  (){	return ibflag                  	;	}
	public String                   getPage_rows               (){	return page_rows               	;	}
	public String                   getBkg_no                  (){	return bkg_no                  	;	}
	public String                   getBkg_no_split            (){	return bkg_no_split            	;	}
	public String                   getMrn_no                  (){	return mrn_no                  	;	}
	public String                   getMrn_chk_cd              (){	return mrn_chk_cd              	;	}
	public String                   getMsn_no                  (){	return msn_no                  	;	}
	public String                   getMsn_bl_locl_ts_cd       (){	return msn_bl_locl_ts_cd       	;	}
	public String                   getMsn_bl_tp_cd            (){	return msn_bl_tp_cd            	;	}
	public String                   getMsn_cstms_clr_tp_cd     (){	return msn_cstms_clr_tp_cd     	;	}
	public String                   getMsn_dchg_loc_no         (){	return msn_dchg_loc_no         	;	}
	public String                   getMsn_cstms_clr_loc_cd    (){	return msn_cstms_clr_loc_cd    	;	}
	public String                   getMsn_cstms_clr_bd_area_cd(){	return msn_cstms_clr_bd_area_cd	;	}
	public String                   getVsl_cd                  (){	return vsl_cd                  	;	}
	public String                   getSkd_voy_no              (){	return skd_voy_no              	;	}
	public String                   getSkd_dir_cd              (){	return skd_dir_cd              	;	}
	public String                   getMsn_cfm_cd              (){	return msn_cfm_cd              	;	}
	public String                   getMsn_ts_chk_cd           (){	return msn_ts_chk_cd           	;	}
	public String                   getMsn_sts_cd              (){	return msn_sts_cd              	;	}
	public String                   getMsn_bd_tp_cd            (){	return msn_bd_tp_cd            	;	}
	public String                   getMsn_cfm_dt              (){	return msn_cfm_dt              	;	}
	public String                   getMsn_snd_dt              (){	return msn_snd_dt              	;	}
	public String                   getMsn_upd_dt              (){	return msn_upd_dt              	;	}
	public String                   getEai_evnt_dt             (){	return eai_evnt_dt             	;	}

	// setter method is proceeding ..
	public void setIbflag                  ( String                   ibflag                   ){	this.ibflag                   = ibflag                  	;	}
	public void setPage_rows               ( String                   page_rows                ){	this.page_rows                = page_rows               	;	}
	public void setBkg_no                  ( String                   bkg_no                   ){	this.bkg_no                   = bkg_no                  	;	}
	public void setBkg_no_split            ( String                   bkg_no_split             ){	this.bkg_no_split             = bkg_no_split            	;	}
	public void setMrn_no                  ( String                   mrn_no                   ){	this.mrn_no                   = mrn_no                  	;	}
	public void setMrn_chk_cd              ( String                   mrn_chk_cd               ){	this.mrn_chk_cd               = mrn_chk_cd              	;	}
	public void setMsn_no                  ( String                   msn_no                   ){	this.msn_no                   = msn_no                  	;	}
	public void setMsn_bl_locl_ts_cd       ( String                   msn_bl_locl_ts_cd        ){	this.msn_bl_locl_ts_cd        = msn_bl_locl_ts_cd       	;	}
	public void setMsn_bl_tp_cd            ( String                   msn_bl_tp_cd             ){	this.msn_bl_tp_cd             = msn_bl_tp_cd            	;	}
	public void setMsn_cstms_clr_tp_cd     ( String                   msn_cstms_clr_tp_cd      ){	this.msn_cstms_clr_tp_cd      = msn_cstms_clr_tp_cd     	;	}
	public void setMsn_dchg_loc_no         ( String                   msn_dchg_loc_no          ){	this.msn_dchg_loc_no          = msn_dchg_loc_no         	;	}
	public void setMsn_cstms_clr_loc_cd    ( String                   msn_cstms_clr_loc_cd     ){	this.msn_cstms_clr_loc_cd     = msn_cstms_clr_loc_cd    	;	}
	public void setMsn_cstms_clr_bd_area_cd( String                   msn_cstms_clr_bd_area_cd ){	this.msn_cstms_clr_bd_area_cd = msn_cstms_clr_bd_area_cd	;	}
	public void setVsl_cd                  ( String                   vsl_cd                   ){	this.vsl_cd                   = vsl_cd                  	;	}
	public void setSkd_voy_no              ( String                   skd_voy_no               ){	this.skd_voy_no               = skd_voy_no              	;	}
	public void setSkd_dir_cd              ( String                   skd_dir_cd               ){	this.skd_dir_cd               = skd_dir_cd              	;	}
	public void setMsn_cfm_cd              ( String                   msn_cfm_cd               ){	this.msn_cfm_cd               = msn_cfm_cd              	;	}
	public void setMsn_ts_chk_cd           ( String                   msn_ts_chk_cd            ){	this.msn_ts_chk_cd            = msn_ts_chk_cd           	;	}
	public void setMsn_sts_cd              ( String                   msn_sts_cd               ){	this.msn_sts_cd               = msn_sts_cd              	;	}
	public void setMsn_bd_tp_cd            ( String                   msn_bd_tp_cd             ){	this.msn_bd_tp_cd             = msn_bd_tp_cd            	;	}
	public void setMsn_cfm_dt              ( String                   msn_cfm_dt               ){	this.msn_cfm_dt               = msn_cfm_dt              	;	}
	public void setMsn_snd_dt              ( String                   msn_snd_dt               ){	this.msn_snd_dt               = msn_snd_dt              	;	}
	public void setMsn_upd_dt              ( String                   msn_upd_dt               ){	this.msn_upd_dt               = msn_upd_dt              	;	}
	public void setEai_evnt_dt             ( String                   eai_evnt_dt              ){	this.eai_evnt_dt              = eai_evnt_dt             	;	}

	public static TrsMfSeqNoVO fromRequest(HttpServletRequest request) {
		TrsMfSeqNoVO model = new TrsMfSeqNoVO();
		try {
			model.setIbflag                  	(JSPUtil.getParameter(request, "ibflag                  		".trim(), ""));
			model.setPage_rows               	(JSPUtil.getParameter(request, "page_rows               		".trim(), ""));
			model.setBkg_no                  	(JSPUtil.getParameter(request, "bkg_no                  		".trim(), ""));
			model.setBkg_no_split            	(JSPUtil.getParameter(request, "bkg_no_split            		".trim(), ""));
			model.setMrn_no                  	(JSPUtil.getParameter(request, "mrn_no                  		".trim(), ""));
			model.setMrn_chk_cd              	(JSPUtil.getParameter(request, "mrn_chk_cd              		".trim(), ""));
			model.setMsn_no                  	(JSPUtil.getParameter(request, "msn_no                  		".trim(), ""));
			model.setMsn_bl_locl_ts_cd       	(JSPUtil.getParameter(request, "msn_bl_locl_ts_cd       		".trim(), ""));
			model.setMsn_bl_tp_cd            	(JSPUtil.getParameter(request, "msn_bl_tp_cd            		".trim(), ""));
			model.setMsn_cstms_clr_tp_cd     	(JSPUtil.getParameter(request, "msn_cstms_clr_tp_cd     		".trim(), ""));
			model.setMsn_dchg_loc_no         	(JSPUtil.getParameter(request, "msn_dchg_loc_no         		".trim(), ""));
			model.setMsn_cstms_clr_loc_cd    	(JSPUtil.getParameter(request, "msn_cstms_clr_loc_cd    		".trim(), ""));
			model.setMsn_cstms_clr_bd_area_cd	(JSPUtil.getParameter(request, "msn_cstms_clr_bd_area_cd		".trim(), ""));
			model.setVsl_cd                  	(JSPUtil.getParameter(request, "vsl_cd                  		".trim(), ""));
			model.setSkd_voy_no              	(JSPUtil.getParameter(request, "skd_voy_no              		".trim(), ""));
			model.setSkd_dir_cd              	(JSPUtil.getParameter(request, "skd_dir_cd              		".trim(), ""));
			model.setMsn_cfm_cd              	(JSPUtil.getParameter(request, "msn_cfm_cd              		".trim(), ""));
			model.setMsn_ts_chk_cd           	(JSPUtil.getParameter(request, "msn_ts_chk_cd           		".trim(), ""));
			model.setMsn_sts_cd              	(JSPUtil.getParameter(request, "msn_sts_cd              		".trim(), ""));
			model.setMsn_bd_tp_cd            	(JSPUtil.getParameter(request, "msn_bd_tp_cd            		".trim(), ""));
			model.setMsn_cfm_dt              	(JSPUtil.getParameter(request, "msn_cfm_dt              		".trim(), ""));
			model.setMsn_snd_dt              	(JSPUtil.getParameter(request, "msn_snd_dt              		".trim(), ""));
			model.setMsn_upd_dt              	(JSPUtil.getParameter(request, "msn_upd_dt              		".trim(), ""));
			model.setEai_evnt_dt             	(JSPUtil.getParameter(request, "eai_evnt_dt             		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		TrsMfSeqNoVO model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag                   =  (JSPUtil.getParameter(request, "ibflag                  		".trim(), length));
			String[] page_rows                =  (JSPUtil.getParameter(request, "page_rows               		".trim(), length));
			String[] bkg_no                   =  (JSPUtil.getParameter(request, "bkg_no                  		".trim(), length));
			String[] bkg_no_split             =  (JSPUtil.getParameter(request, "bkg_no_split            		".trim(), length));
			String[] mrn_no                   =  (JSPUtil.getParameter(request, "mrn_no                  		".trim(), length));
			String[] mrn_chk_cd               =  (JSPUtil.getParameter(request, "mrn_chk_cd              		".trim(), length));
			String[] msn_no                   =  (JSPUtil.getParameter(request, "msn_no                  		".trim(), length));
			String[] msn_bl_locl_ts_cd        =  (JSPUtil.getParameter(request, "msn_bl_locl_ts_cd       		".trim(), length));
			String[] msn_bl_tp_cd             =  (JSPUtil.getParameter(request, "msn_bl_tp_cd            		".trim(), length));
			String[] msn_cstms_clr_tp_cd      =  (JSPUtil.getParameter(request, "msn_cstms_clr_tp_cd     		".trim(), length));
			String[] msn_dchg_loc_no          =  (JSPUtil.getParameter(request, "msn_dchg_loc_no         		".trim(), length));
			String[] msn_cstms_clr_loc_cd     =  (JSPUtil.getParameter(request, "msn_cstms_clr_loc_cd    		".trim(), length));
			String[] msn_cstms_clr_bd_area_cd =  (JSPUtil.getParameter(request, "msn_cstms_clr_bd_area_cd		".trim(), length));
			String[] vsl_cd                   =  (JSPUtil.getParameter(request, "vsl_cd                  		".trim(), length));
			String[] skd_voy_no               =  (JSPUtil.getParameter(request, "skd_voy_no              		".trim(), length));
			String[] skd_dir_cd               =  (JSPUtil.getParameter(request, "skd_dir_cd              		".trim(), length));
			String[] msn_cfm_cd               =  (JSPUtil.getParameter(request, "msn_cfm_cd              		".trim(), length));
			String[] msn_ts_chk_cd            =  (JSPUtil.getParameter(request, "msn_ts_chk_cd           		".trim(), length));
			String[] msn_sts_cd               =  (JSPUtil.getParameter(request, "msn_sts_cd              		".trim(), length));
			String[] msn_bd_tp_cd             =  (JSPUtil.getParameter(request, "msn_bd_tp_cd            		".trim(), length));
			String[] msn_cfm_dt               =  (JSPUtil.getParameter(request, "msn_cfm_dt              		".trim(), length));
			String[] msn_snd_dt               =  (JSPUtil.getParameter(request, "msn_snd_dt              		".trim(), length));
			String[] msn_upd_dt               =  (JSPUtil.getParameter(request, "msn_upd_dt              		".trim(), length));
			String[] eai_evnt_dt              =  (JSPUtil.getParameter(request, "eai_evnt_dt             		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new TrsMfSeqNoVO();
				model.setIbflag                  		  (ibflag                  	[i]);
				model.setPage_rows               		  (page_rows               	[i]);
				model.setBkg_no                  		  (bkg_no                  	[i]);
				model.setBkg_no_split            		  (bkg_no_split            	[i]);
				model.setMrn_no                  		  (mrn_no                  	[i]);
				model.setMrn_chk_cd              		  (mrn_chk_cd              	[i]);
				model.setMsn_no                  		  (msn_no                  	[i]);
				model.setMsn_bl_locl_ts_cd       		  (msn_bl_locl_ts_cd       	[i]);
				model.setMsn_bl_tp_cd            		  (msn_bl_tp_cd            	[i]);
				model.setMsn_cstms_clr_tp_cd     		  (msn_cstms_clr_tp_cd     	[i]);
				model.setMsn_dchg_loc_no         		  (msn_dchg_loc_no         	[i]);
				model.setMsn_cstms_clr_loc_cd    		  (msn_cstms_clr_loc_cd    	[i]);
				model.setMsn_cstms_clr_bd_area_cd		  (msn_cstms_clr_bd_area_cd	[i]);
				model.setVsl_cd                  		  (vsl_cd                  	[i]);
				model.setSkd_voy_no              		  (skd_voy_no              	[i]);
				model.setSkd_dir_cd              		  (skd_dir_cd              	[i]);
				model.setMsn_cfm_cd              		  (msn_cfm_cd              	[i]);
				model.setMsn_ts_chk_cd           		  (msn_ts_chk_cd           	[i]);
				model.setMsn_sts_cd              		  (msn_sts_cd              	[i]);
				model.setMsn_bd_tp_cd            		  (msn_bd_tp_cd            	[i]);
				model.setMsn_cfm_dt              		  (msn_cfm_dt              	[i]);
				model.setMsn_snd_dt              		  (msn_snd_dt              	[i]);
				model.setMsn_upd_dt              		  (msn_upd_dt              	[i]);
				model.setEai_evnt_dt             		  (eai_evnt_dt             	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		TrsMfSeqNoVO model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag                   =  (JSPUtil.getParameter(request, prefix + "ibflag                  		".trim(), length));
			String[] page_rows                =  (JSPUtil.getParameter(request, prefix + "page_rows               		".trim(), length));
			String[] bkg_no                   =  (JSPUtil.getParameter(request, prefix + "bkg_no                  		".trim(), length));
			String[] bkg_no_split             =  (JSPUtil.getParameter(request, prefix + "bkg_no_split            		".trim(), length));
			String[] mrn_no                   =  (JSPUtil.getParameter(request, prefix + "mrn_no                  		".trim(), length));
			String[] mrn_chk_cd               =  (JSPUtil.getParameter(request, prefix + "mrn_chk_cd              		".trim(), length));
			String[] msn_no                   =  (JSPUtil.getParameter(request, prefix + "msn_no                  		".trim(), length));
			String[] msn_bl_locl_ts_cd        =  (JSPUtil.getParameter(request, prefix + "msn_bl_locl_ts_cd       		".trim(), length));
			String[] msn_bl_tp_cd             =  (JSPUtil.getParameter(request, prefix + "msn_bl_tp_cd            		".trim(), length));
			String[] msn_cstms_clr_tp_cd      =  (JSPUtil.getParameter(request, prefix + "msn_cstms_clr_tp_cd     		".trim(), length));
			String[] msn_dchg_loc_no          =  (JSPUtil.getParameter(request, prefix + "msn_dchg_loc_no         		".trim(), length));
			String[] msn_cstms_clr_loc_cd     =  (JSPUtil.getParameter(request, prefix + "msn_cstms_clr_loc_cd    		".trim(), length));
			String[] msn_cstms_clr_bd_area_cd =  (JSPUtil.getParameter(request, prefix + "msn_cstms_clr_bd_area_cd		".trim(), length));
			String[] vsl_cd                   =  (JSPUtil.getParameter(request, prefix + "vsl_cd                  		".trim(), length));
			String[] skd_voy_no               =  (JSPUtil.getParameter(request, prefix + "skd_voy_no              		".trim(), length));
			String[] skd_dir_cd               =  (JSPUtil.getParameter(request, prefix + "skd_dir_cd              		".trim(), length));
			String[] msn_cfm_cd               =  (JSPUtil.getParameter(request, prefix + "msn_cfm_cd              		".trim(), length));
			String[] msn_ts_chk_cd            =  (JSPUtil.getParameter(request, prefix + "msn_ts_chk_cd           		".trim(), length));
			String[] msn_sts_cd               =  (JSPUtil.getParameter(request, prefix + "msn_sts_cd              		".trim(), length));
			String[] msn_bd_tp_cd             =  (JSPUtil.getParameter(request, prefix + "msn_bd_tp_cd            		".trim(), length));
			String[] msn_cfm_dt               =  (JSPUtil.getParameter(request, prefix + "msn_cfm_dt              		".trim(), length));
			String[] msn_snd_dt               =  (JSPUtil.getParameter(request, prefix + "msn_snd_dt              		".trim(), length));
			String[] msn_upd_dt               =  (JSPUtil.getParameter(request, prefix + "msn_upd_dt              		".trim(), length));
			String[] eai_evnt_dt              =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt             		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new TrsMfSeqNoVO();
				model.setIbflag                  		  ( ibflag                  	[i]);
				model.setPage_rows               		  ( page_rows               	[i]);
				model.setBkg_no                  		  ( bkg_no                  	[i]);
				model.setBkg_no_split            		  ( bkg_no_split            	[i]);
				model.setMrn_no                  		  ( mrn_no                  	[i]);
				model.setMrn_chk_cd              		  ( mrn_chk_cd              	[i]);
				model.setMsn_no                  		  ( msn_no                  	[i]);
				model.setMsn_bl_locl_ts_cd       		  ( msn_bl_locl_ts_cd       	[i]);
				model.setMsn_bl_tp_cd            		  ( msn_bl_tp_cd            	[i]);
				model.setMsn_cstms_clr_tp_cd     		  ( msn_cstms_clr_tp_cd     	[i]);
				model.setMsn_dchg_loc_no         		  ( msn_dchg_loc_no         	[i]);
				model.setMsn_cstms_clr_loc_cd    		  ( msn_cstms_clr_loc_cd    	[i]);
				model.setMsn_cstms_clr_bd_area_cd		  ( msn_cstms_clr_bd_area_cd	[i]);
				model.setVsl_cd                  		  ( vsl_cd                  	[i]);
				model.setSkd_voy_no              		  ( skd_voy_no              	[i]);
				model.setSkd_dir_cd              		  ( skd_dir_cd              	[i]);
				model.setMsn_cfm_cd              		  ( msn_cfm_cd              	[i]);
				model.setMsn_ts_chk_cd           		  ( msn_ts_chk_cd           	[i]);
				model.setMsn_sts_cd              		  ( msn_sts_cd              	[i]);
				model.setMsn_bd_tp_cd            		  ( msn_bd_tp_cd            	[i]);
				model.setMsn_cfm_dt              		  ( msn_cfm_dt              	[i]);
				model.setMsn_snd_dt              		  ( msn_snd_dt              	[i]);
				model.setMsn_upd_dt              		  ( msn_upd_dt              	[i]);
				model.setEai_evnt_dt             		  ( eai_evnt_dt             	[i]);
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
