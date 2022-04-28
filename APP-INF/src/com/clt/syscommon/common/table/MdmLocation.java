/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : MDM_LOCATION.java
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
public final class MdmLocation implements java.io.Serializable {

	private String               ibflag               = "";
	private String               page_rows            = "";
	private String               loc_cd               = "";
	private String               scc_cd               = "";
	private String               loc_nm               = "";
	private String               rgn_cd               = "";
	private String               cnt_cd               = "";
	private String               ste_cd               = "";
	private String               conti_cd             = "";
	private String               port_inlnd_cd        = "";
	private String               loc_chr_cd           = "";
	private String               blk_port_flg         = "";
	private String               hub_loc_cd           = "";
	private String               sls_ofc_cd           = "";
	private String               loc_grd_no           = "";
	private String               gmt_hrs              = "";
	private String               bkg_bl_pfx_cd        = "";
	private String               call_port_flg        = "";
	private String               loc_ams_port_cd      = "";
	private String               finc_ctrl_ofc_cd     = "";
	private String               eq_ctrl_ofc_cd       = "";
	private String               mty_pkup_yd_cd       = "";
	private String               sen_eq_ofc_cd        = "";
	private String               eq_rtn_yd_cd         = "";
	private String               un_loc_ind_cd        = "";
	private String               un_loc_cd            = "";
	private String               cml_zn_flg           = "";
	private String               cstms_cd             = "";
	private String               loc_tp_cd            = "";
	private String               bfr_finc_ctrl_ofc_cd = "";
	private String               bfr_eq_ctrl_ofc_cd   = "";
	private String               bfr_sls_ofc_cd       = "";
	private String               bfr_ofc_cng_dt       = "";
	private String               rep_zn_cd            = "";
	private String               zip_cd               = "";
	private String               sconti_cd            = "";
	private String               cre_usr_id           = "";
	private String               cre_dt               = "";
	private String               upd_usr_id           = "";
	private String               upd_dt               = "";
	private String               delt_flg             = "";
	private String               eai_evnt_dt          = "";

	public MdmLocation(){}

	public MdmLocation(
			String               ibflag              ,
			String               page_rows           ,
			String               loc_cd              ,
			String               scc_cd              ,
			String               loc_nm              ,
			String               rgn_cd              ,
			String               cnt_cd              ,
			String               ste_cd              ,
			String               conti_cd            ,
			String               port_inlnd_cd       ,
			String               loc_chr_cd          ,
			String               blk_port_flg        ,
			String               hub_loc_cd          ,
			String               sls_ofc_cd          ,
			String               loc_grd_no          ,
			String               gmt_hrs             ,
			String               bkg_bl_pfx_cd       ,
			String               call_port_flg       ,
			String               loc_ams_port_cd     ,
			String               finc_ctrl_ofc_cd    ,
			String               eq_ctrl_ofc_cd      ,
			String               mty_pkup_yd_cd      ,
			String               sen_eq_ofc_cd       ,
			String               eq_rtn_yd_cd        ,
			String               un_loc_ind_cd       ,
			String               un_loc_cd           ,
			String               cml_zn_flg          ,
			String               cstms_cd            ,
			String               loc_tp_cd           ,
			String               bfr_finc_ctrl_ofc_cd,
			String               bfr_eq_ctrl_ofc_cd  ,
			String               bfr_sls_ofc_cd      ,
			String               bfr_ofc_cng_dt      ,
			String               rep_zn_cd           ,
			String               zip_cd              ,
			String               sconti_cd           ,
			String               cre_usr_id          ,
			String               cre_dt              ,
			String               upd_usr_id          ,
			String               upd_dt              ,
			String               delt_flg            ,
			String               eai_evnt_dt         ){
		this.ibflag               = ibflag              ;
		this.page_rows            = page_rows           ;
		this.loc_cd               = loc_cd              ;
		this.scc_cd               = scc_cd              ;
		this.loc_nm               = loc_nm              ;
		this.rgn_cd               = rgn_cd              ;
		this.cnt_cd               = cnt_cd              ;
		this.ste_cd               = ste_cd              ;
		this.conti_cd             = conti_cd            ;
		this.port_inlnd_cd        = port_inlnd_cd       ;
		this.loc_chr_cd           = loc_chr_cd          ;
		this.blk_port_flg         = blk_port_flg        ;
		this.hub_loc_cd           = hub_loc_cd          ;
		this.sls_ofc_cd           = sls_ofc_cd          ;
		this.loc_grd_no           = loc_grd_no          ;
		this.gmt_hrs              = gmt_hrs             ;
		this.bkg_bl_pfx_cd        = bkg_bl_pfx_cd       ;
		this.call_port_flg        = call_port_flg       ;
		this.loc_ams_port_cd      = loc_ams_port_cd     ;
		this.finc_ctrl_ofc_cd     = finc_ctrl_ofc_cd    ;
		this.eq_ctrl_ofc_cd       = eq_ctrl_ofc_cd      ;
		this.mty_pkup_yd_cd       = mty_pkup_yd_cd      ;
		this.sen_eq_ofc_cd        = sen_eq_ofc_cd       ;
		this.eq_rtn_yd_cd         = eq_rtn_yd_cd        ;
		this.un_loc_ind_cd        = un_loc_ind_cd       ;
		this.un_loc_cd            = un_loc_cd           ;
		this.cml_zn_flg           = cml_zn_flg          ;
		this.cstms_cd             = cstms_cd            ;
		this.loc_tp_cd            = loc_tp_cd           ;
		this.bfr_finc_ctrl_ofc_cd = bfr_finc_ctrl_ofc_cd;
		this.bfr_eq_ctrl_ofc_cd   = bfr_eq_ctrl_ofc_cd  ;
		this.bfr_sls_ofc_cd       = bfr_sls_ofc_cd      ;
		this.bfr_ofc_cng_dt       = bfr_ofc_cng_dt      ;
		this.rep_zn_cd            = rep_zn_cd           ;
		this.zip_cd               = zip_cd              ;
		this.sconti_cd            = sconti_cd           ;
		this.cre_usr_id           = cre_usr_id          ;
		this.cre_dt               = cre_dt              ;
		this.upd_usr_id           = upd_usr_id          ;
		this.upd_dt               = upd_dt              ;
		this.delt_flg             = delt_flg            ;
		this.eai_evnt_dt          = eai_evnt_dt         ;
	}

	// getter method is proceeding ..
	public String               getIbflag              (){	return ibflag              	;	}
	public String               getPage_rows           (){	return page_rows           	;	}
	public String               getLoc_cd              (){	return loc_cd              	;	}
	public String               getScc_cd              (){	return scc_cd              	;	}
	public String               getLoc_nm              (){	return loc_nm              	;	}
	public String               getRgn_cd              (){	return rgn_cd              	;	}
	public String               getCnt_cd              (){	return cnt_cd              	;	}
	public String               getSte_cd              (){	return ste_cd              	;	}
	public String               getConti_cd            (){	return conti_cd            	;	}
	public String               getPort_inlnd_cd       (){	return port_inlnd_cd       	;	}
	public String               getLoc_chr_cd          (){	return loc_chr_cd          	;	}
	public String               getBlk_port_flg        (){	return blk_port_flg        	;	}
	public String               getHub_loc_cd          (){	return hub_loc_cd          	;	}
	public String               getSls_ofc_cd          (){	return sls_ofc_cd          	;	}
	public String               getLoc_grd_no          (){	return loc_grd_no          	;	}
	public String               getGmt_hrs             (){	return gmt_hrs             	;	}
	public String               getBkg_bl_pfx_cd       (){	return bkg_bl_pfx_cd       	;	}
	public String               getCall_port_flg       (){	return call_port_flg       	;	}
	public String               getLoc_ams_port_cd     (){	return loc_ams_port_cd     	;	}
	public String               getFinc_ctrl_ofc_cd    (){	return finc_ctrl_ofc_cd    	;	}
	public String               getEq_ctrl_ofc_cd      (){	return eq_ctrl_ofc_cd      	;	}
	public String               getMty_pkup_yd_cd      (){	return mty_pkup_yd_cd      	;	}
	public String               getSen_eq_ofc_cd       (){	return sen_eq_ofc_cd       	;	}
	public String               getEq_rtn_yd_cd        (){	return eq_rtn_yd_cd        	;	}
	public String               getUn_loc_ind_cd       (){	return un_loc_ind_cd       	;	}
	public String               getUn_loc_cd           (){	return un_loc_cd           	;	}
	public String               getCml_zn_flg          (){	return cml_zn_flg          	;	}
	public String               getCstms_cd            (){	return cstms_cd            	;	}
	public String               getLoc_tp_cd           (){	return loc_tp_cd           	;	}
	public String               getBfr_finc_ctrl_ofc_cd(){	return bfr_finc_ctrl_ofc_cd	;	}
	public String               getBfr_eq_ctrl_ofc_cd  (){	return bfr_eq_ctrl_ofc_cd  	;	}
	public String               getBfr_sls_ofc_cd      (){	return bfr_sls_ofc_cd      	;	}
	public String               getBfr_ofc_cng_dt      (){	return bfr_ofc_cng_dt      	;	}
	public String               getRep_zn_cd           (){	return rep_zn_cd           	;	}
	public String               getZip_cd              (){	return zip_cd              	;	}
	public String               getSconti_cd           (){	return sconti_cd           	;	}
	public String               getCre_usr_id          (){	return cre_usr_id          	;	}
	public String               getCre_dt              (){	return cre_dt              	;	}
	public String               getUpd_usr_id          (){	return upd_usr_id          	;	}
	public String               getUpd_dt              (){	return upd_dt              	;	}
	public String               getDelt_flg            (){	return delt_flg            	;	}
	public String               getEai_evnt_dt         (){	return eai_evnt_dt         	;	}

	// setter method is proceeding ..
	public void setIbflag              ( String               ibflag               ){	this.ibflag               = ibflag              	;	}
	public void setPage_rows           ( String               page_rows            ){	this.page_rows            = page_rows           	;	}
	public void setLoc_cd              ( String               loc_cd               ){	this.loc_cd               = loc_cd              	;	}
	public void setScc_cd              ( String               scc_cd               ){	this.scc_cd               = scc_cd              	;	}
	public void setLoc_nm              ( String               loc_nm               ){	this.loc_nm               = loc_nm              	;	}
	public void setRgn_cd              ( String               rgn_cd               ){	this.rgn_cd               = rgn_cd              	;	}
	public void setCnt_cd              ( String               cnt_cd               ){	this.cnt_cd               = cnt_cd              	;	}
	public void setSte_cd              ( String               ste_cd               ){	this.ste_cd               = ste_cd              	;	}
	public void setConti_cd            ( String               conti_cd             ){	this.conti_cd             = conti_cd            	;	}
	public void setPort_inlnd_cd       ( String               port_inlnd_cd        ){	this.port_inlnd_cd        = port_inlnd_cd       	;	}
	public void setLoc_chr_cd          ( String               loc_chr_cd           ){	this.loc_chr_cd           = loc_chr_cd          	;	}
	public void setBlk_port_flg        ( String               blk_port_flg         ){	this.blk_port_flg         = blk_port_flg        	;	}
	public void setHub_loc_cd          ( String               hub_loc_cd           ){	this.hub_loc_cd           = hub_loc_cd          	;	}
	public void setSls_ofc_cd          ( String               sls_ofc_cd           ){	this.sls_ofc_cd           = sls_ofc_cd          	;	}
	public void setLoc_grd_no          ( String               loc_grd_no           ){	this.loc_grd_no           = loc_grd_no          	;	}
	public void setGmt_hrs             ( String               gmt_hrs              ){	this.gmt_hrs              = gmt_hrs             	;	}
	public void setBkg_bl_pfx_cd       ( String               bkg_bl_pfx_cd        ){	this.bkg_bl_pfx_cd        = bkg_bl_pfx_cd       	;	}
	public void setCall_port_flg       ( String               call_port_flg        ){	this.call_port_flg        = call_port_flg       	;	}
	public void setLoc_ams_port_cd     ( String               loc_ams_port_cd      ){	this.loc_ams_port_cd      = loc_ams_port_cd     	;	}
	public void setFinc_ctrl_ofc_cd    ( String               finc_ctrl_ofc_cd     ){	this.finc_ctrl_ofc_cd     = finc_ctrl_ofc_cd    	;	}
	public void setEq_ctrl_ofc_cd      ( String               eq_ctrl_ofc_cd       ){	this.eq_ctrl_ofc_cd       = eq_ctrl_ofc_cd      	;	}
	public void setMty_pkup_yd_cd      ( String               mty_pkup_yd_cd       ){	this.mty_pkup_yd_cd       = mty_pkup_yd_cd      	;	}
	public void setSen_eq_ofc_cd       ( String               sen_eq_ofc_cd        ){	this.sen_eq_ofc_cd        = sen_eq_ofc_cd       	;	}
	public void setEq_rtn_yd_cd        ( String               eq_rtn_yd_cd         ){	this.eq_rtn_yd_cd         = eq_rtn_yd_cd        	;	}
	public void setUn_loc_ind_cd       ( String               un_loc_ind_cd        ){	this.un_loc_ind_cd        = un_loc_ind_cd       	;	}
	public void setUn_loc_cd           ( String               un_loc_cd            ){	this.un_loc_cd            = un_loc_cd           	;	}
	public void setCml_zn_flg          ( String               cml_zn_flg           ){	this.cml_zn_flg           = cml_zn_flg          	;	}
	public void setCstms_cd            ( String               cstms_cd             ){	this.cstms_cd             = cstms_cd            	;	}
	public void setLoc_tp_cd           ( String               loc_tp_cd            ){	this.loc_tp_cd            = loc_tp_cd           	;	}
	public void setBfr_finc_ctrl_ofc_cd( String               bfr_finc_ctrl_ofc_cd ){	this.bfr_finc_ctrl_ofc_cd = bfr_finc_ctrl_ofc_cd	;	}
	public void setBfr_eq_ctrl_ofc_cd  ( String               bfr_eq_ctrl_ofc_cd   ){	this.bfr_eq_ctrl_ofc_cd   = bfr_eq_ctrl_ofc_cd  	;	}
	public void setBfr_sls_ofc_cd      ( String               bfr_sls_ofc_cd       ){	this.bfr_sls_ofc_cd       = bfr_sls_ofc_cd      	;	}
	public void setBfr_ofc_cng_dt      ( String               bfr_ofc_cng_dt       ){	this.bfr_ofc_cng_dt       = bfr_ofc_cng_dt      	;	}
	public void setRep_zn_cd           ( String               rep_zn_cd            ){	this.rep_zn_cd            = rep_zn_cd           	;	}
	public void setZip_cd              ( String               zip_cd               ){	this.zip_cd               = zip_cd              	;	}
	public void setSconti_cd           ( String               sconti_cd            ){	this.sconti_cd            = sconti_cd           	;	}
	public void setCre_usr_id          ( String               cre_usr_id           ){	this.cre_usr_id           = cre_usr_id          	;	}
	public void setCre_dt              ( String               cre_dt               ){	this.cre_dt               = cre_dt              	;	}
	public void setUpd_usr_id          ( String               upd_usr_id           ){	this.upd_usr_id           = upd_usr_id          	;	}
	public void setUpd_dt              ( String               upd_dt               ){	this.upd_dt               = upd_dt              	;	}
	public void setDelt_flg            ( String               delt_flg             ){	this.delt_flg             = delt_flg            	;	}
	public void setEai_evnt_dt         ( String               eai_evnt_dt          ){	this.eai_evnt_dt          = eai_evnt_dt         	;	}

	public static MdmLocation fromRequest(HttpServletRequest request) {
		MdmLocation model = new MdmLocation();
		try {
			model.setIbflag              	(JSPUtil.getParameter(request, "ibflag              		".trim(), ""));
			model.setPage_rows           	(JSPUtil.getParameter(request, "page_rows           		".trim(), ""));
			model.setLoc_cd              	(JSPUtil.getParameter(request, "loc_cd              		".trim(), ""));
			model.setScc_cd              	(JSPUtil.getParameter(request, "scc_cd              		".trim(), ""));
			model.setLoc_nm              	(JSPUtil.getParameter(request, "loc_nm              		".trim(), ""));
			model.setRgn_cd              	(JSPUtil.getParameter(request, "rgn_cd              		".trim(), ""));
			model.setCnt_cd              	(JSPUtil.getParameter(request, "cnt_cd              		".trim(), ""));
			model.setSte_cd              	(JSPUtil.getParameter(request, "ste_cd              		".trim(), ""));
			model.setConti_cd            	(JSPUtil.getParameter(request, "conti_cd            		".trim(), ""));
			model.setPort_inlnd_cd       	(JSPUtil.getParameter(request, "port_inlnd_cd       		".trim(), ""));
			model.setLoc_chr_cd          	(JSPUtil.getParameter(request, "loc_chr_cd          		".trim(), ""));
			model.setBlk_port_flg        	(JSPUtil.getParameter(request, "blk_port_flg        		".trim(), ""));
			model.setHub_loc_cd          	(JSPUtil.getParameter(request, "hub_loc_cd          		".trim(), ""));
			model.setSls_ofc_cd          	(JSPUtil.getParameter(request, "sls_ofc_cd          		".trim(), ""));
			model.setLoc_grd_no          	(JSPUtil.getParameter(request, "loc_grd_no          		".trim(), ""));
			model.setGmt_hrs             	(JSPUtil.getParameter(request, "gmt_hrs             		".trim(), ""));
			model.setBkg_bl_pfx_cd       	(JSPUtil.getParameter(request, "bkg_bl_pfx_cd       		".trim(), ""));
			model.setCall_port_flg       	(JSPUtil.getParameter(request, "call_port_flg       		".trim(), ""));
			model.setLoc_ams_port_cd     	(JSPUtil.getParameter(request, "loc_ams_port_cd     		".trim(), ""));
			model.setFinc_ctrl_ofc_cd    	(JSPUtil.getParameter(request, "finc_ctrl_ofc_cd    		".trim(), ""));
			model.setEq_ctrl_ofc_cd      	(JSPUtil.getParameter(request, "eq_ctrl_ofc_cd      		".trim(), ""));
			model.setMty_pkup_yd_cd      	(JSPUtil.getParameter(request, "mty_pkup_yd_cd      		".trim(), ""));
			model.setSen_eq_ofc_cd       	(JSPUtil.getParameter(request, "sen_eq_ofc_cd       		".trim(), ""));
			model.setEq_rtn_yd_cd        	(JSPUtil.getParameter(request, "eq_rtn_yd_cd        		".trim(), ""));
			model.setUn_loc_ind_cd       	(JSPUtil.getParameter(request, "un_loc_ind_cd       		".trim(), ""));
			model.setUn_loc_cd           	(JSPUtil.getParameter(request, "un_loc_cd           		".trim(), ""));
			model.setCml_zn_flg          	(JSPUtil.getParameter(request, "cml_zn_flg          		".trim(), ""));
			model.setCstms_cd            	(JSPUtil.getParameter(request, "cstms_cd            		".trim(), ""));
			model.setLoc_tp_cd           	(JSPUtil.getParameter(request, "loc_tp_cd           		".trim(), ""));
			model.setBfr_finc_ctrl_ofc_cd	(JSPUtil.getParameter(request, "bfr_finc_ctrl_ofc_cd		".trim(), ""));
			model.setBfr_eq_ctrl_ofc_cd  	(JSPUtil.getParameter(request, "bfr_eq_ctrl_ofc_cd  		".trim(), ""));
			model.setBfr_sls_ofc_cd      	(JSPUtil.getParameter(request, "bfr_sls_ofc_cd      		".trim(), ""));
			model.setBfr_ofc_cng_dt      	(JSPUtil.getParameter(request, "bfr_ofc_cng_dt      		".trim(), ""));
			model.setRep_zn_cd           	(JSPUtil.getParameter(request, "rep_zn_cd           		".trim(), ""));
			model.setZip_cd              	(JSPUtil.getParameter(request, "zip_cd              		".trim(), ""));
			model.setSconti_cd           	(JSPUtil.getParameter(request, "sconti_cd           		".trim(), ""));
			model.setCre_usr_id          	(JSPUtil.getParameter(request, "cre_usr_id          		".trim(), ""));
			model.setCre_dt              	(JSPUtil.getParameter(request, "cre_dt              		".trim(), ""));
			model.setUpd_usr_id          	(JSPUtil.getParameter(request, "upd_usr_id          		".trim(), ""));
			model.setUpd_dt              	(JSPUtil.getParameter(request, "upd_dt              		".trim(), ""));
			model.setDelt_flg            	(JSPUtil.getParameter(request, "delt_flg            		".trim(), ""));
			model.setEai_evnt_dt         	(JSPUtil.getParameter(request, "eai_evnt_dt         		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		MdmLocation model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag               =  (JSPUtil.getParameter(request, "ibflag              		".trim(), length));
			String[] page_rows            =  (JSPUtil.getParameter(request, "page_rows           		".trim(), length));
			String[] loc_cd               =  (JSPUtil.getParameter(request, "loc_cd              		".trim(), length));
			String[] scc_cd               =  (JSPUtil.getParameter(request, "scc_cd              		".trim(), length));
			String[] loc_nm               =  (JSPUtil.getParameter(request, "loc_nm              		".trim(), length));
			String[] rgn_cd               =  (JSPUtil.getParameter(request, "rgn_cd              		".trim(), length));
			String[] cnt_cd               =  (JSPUtil.getParameter(request, "cnt_cd              		".trim(), length));
			String[] ste_cd               =  (JSPUtil.getParameter(request, "ste_cd              		".trim(), length));
			String[] conti_cd             =  (JSPUtil.getParameter(request, "conti_cd            		".trim(), length));
			String[] port_inlnd_cd        =  (JSPUtil.getParameter(request, "port_inlnd_cd       		".trim(), length));
			String[] loc_chr_cd           =  (JSPUtil.getParameter(request, "loc_chr_cd          		".trim(), length));
			String[] blk_port_flg         =  (JSPUtil.getParameter(request, "blk_port_flg        		".trim(), length));
			String[] hub_loc_cd           =  (JSPUtil.getParameter(request, "hub_loc_cd          		".trim(), length));
			String[] sls_ofc_cd           =  (JSPUtil.getParameter(request, "sls_ofc_cd          		".trim(), length));
			String[] loc_grd_no           =  (JSPUtil.getParameter(request, "loc_grd_no          		".trim(), length));
			String[] gmt_hrs              =  (JSPUtil.getParameter(request, "gmt_hrs             		".trim(), length));
			String[] bkg_bl_pfx_cd        =  (JSPUtil.getParameter(request, "bkg_bl_pfx_cd       		".trim(), length));
			String[] call_port_flg        =  (JSPUtil.getParameter(request, "call_port_flg       		".trim(), length));
			String[] loc_ams_port_cd      =  (JSPUtil.getParameter(request, "loc_ams_port_cd     		".trim(), length));
			String[] finc_ctrl_ofc_cd     =  (JSPUtil.getParameter(request, "finc_ctrl_ofc_cd    		".trim(), length));
			String[] eq_ctrl_ofc_cd       =  (JSPUtil.getParameter(request, "eq_ctrl_ofc_cd      		".trim(), length));
			String[] mty_pkup_yd_cd       =  (JSPUtil.getParameter(request, "mty_pkup_yd_cd      		".trim(), length));
			String[] sen_eq_ofc_cd        =  (JSPUtil.getParameter(request, "sen_eq_ofc_cd       		".trim(), length));
			String[] eq_rtn_yd_cd         =  (JSPUtil.getParameter(request, "eq_rtn_yd_cd        		".trim(), length));
			String[] un_loc_ind_cd        =  (JSPUtil.getParameter(request, "un_loc_ind_cd       		".trim(), length));
			String[] un_loc_cd            =  (JSPUtil.getParameter(request, "un_loc_cd           		".trim(), length));
			String[] cml_zn_flg           =  (JSPUtil.getParameter(request, "cml_zn_flg          		".trim(), length));
			String[] cstms_cd             =  (JSPUtil.getParameter(request, "cstms_cd            		".trim(), length));
			String[] loc_tp_cd            =  (JSPUtil.getParameter(request, "loc_tp_cd           		".trim(), length));
			String[] bfr_finc_ctrl_ofc_cd =  (JSPUtil.getParameter(request, "bfr_finc_ctrl_ofc_cd		".trim(), length));
			String[] bfr_eq_ctrl_ofc_cd   =  (JSPUtil.getParameter(request, "bfr_eq_ctrl_ofc_cd  		".trim(), length));
			String[] bfr_sls_ofc_cd       =  (JSPUtil.getParameter(request, "bfr_sls_ofc_cd      		".trim(), length));
			String[] bfr_ofc_cng_dt       =  (JSPUtil.getParameter(request, "bfr_ofc_cng_dt      		".trim(), length));
			String[] rep_zn_cd            =  (JSPUtil.getParameter(request, "rep_zn_cd           		".trim(), length));
			String[] zip_cd               =  (JSPUtil.getParameter(request, "zip_cd              		".trim(), length));
			String[] sconti_cd            =  (JSPUtil.getParameter(request, "sconti_cd           		".trim(), length));
			String[] cre_usr_id           =  (JSPUtil.getParameter(request, "cre_usr_id          		".trim(), length));
			String[] cre_dt               =  (JSPUtil.getParameter(request, "cre_dt              		".trim(), length));
			String[] upd_usr_id           =  (JSPUtil.getParameter(request, "upd_usr_id          		".trim(), length));
			String[] upd_dt               =  (JSPUtil.getParameter(request, "upd_dt              		".trim(), length));
			String[] delt_flg             =  (JSPUtil.getParameter(request, "delt_flg            		".trim(), length));
			String[] eai_evnt_dt          =  (JSPUtil.getParameter(request, "eai_evnt_dt         		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new MdmLocation();
				model.setIbflag              		  (ibflag              	[i]);
				model.setPage_rows           		  (page_rows           	[i]);
				model.setLoc_cd              		  (loc_cd              	[i]);
				model.setScc_cd              		  (scc_cd              	[i]);
				model.setLoc_nm              		  (loc_nm              	[i]);
				model.setRgn_cd              		  (rgn_cd              	[i]);
				model.setCnt_cd              		  (cnt_cd              	[i]);
				model.setSte_cd              		  (ste_cd              	[i]);
				model.setConti_cd            		  (conti_cd            	[i]);
				model.setPort_inlnd_cd       		  (port_inlnd_cd       	[i]);
				model.setLoc_chr_cd          		  (loc_chr_cd          	[i]);
				model.setBlk_port_flg        		  (blk_port_flg        	[i]);
				model.setHub_loc_cd          		  (hub_loc_cd          	[i]);
				model.setSls_ofc_cd          		  (sls_ofc_cd          	[i]);
				model.setLoc_grd_no          		  (loc_grd_no          	[i]);
				model.setGmt_hrs             		  (gmt_hrs             	[i]);
				model.setBkg_bl_pfx_cd       		  (bkg_bl_pfx_cd       	[i]);
				model.setCall_port_flg       		  (call_port_flg       	[i]);
				model.setLoc_ams_port_cd     		  (loc_ams_port_cd     	[i]);
				model.setFinc_ctrl_ofc_cd    		  (finc_ctrl_ofc_cd    	[i]);
				model.setEq_ctrl_ofc_cd      		  (eq_ctrl_ofc_cd      	[i]);
				model.setMty_pkup_yd_cd      		  (mty_pkup_yd_cd      	[i]);
				model.setSen_eq_ofc_cd       		  (sen_eq_ofc_cd       	[i]);
				model.setEq_rtn_yd_cd        		  (eq_rtn_yd_cd        	[i]);
				model.setUn_loc_ind_cd       		  (un_loc_ind_cd       	[i]);
				model.setUn_loc_cd           		  (un_loc_cd           	[i]);
				model.setCml_zn_flg          		  (cml_zn_flg          	[i]);
				model.setCstms_cd            		  (cstms_cd            	[i]);
				model.setLoc_tp_cd           		  (loc_tp_cd           	[i]);
				model.setBfr_finc_ctrl_ofc_cd		  (bfr_finc_ctrl_ofc_cd	[i]);
				model.setBfr_eq_ctrl_ofc_cd  		  (bfr_eq_ctrl_ofc_cd  	[i]);
				model.setBfr_sls_ofc_cd      		  (bfr_sls_ofc_cd      	[i]);
				model.setBfr_ofc_cng_dt      		  (bfr_ofc_cng_dt      	[i]);
				model.setRep_zn_cd           		  (rep_zn_cd           	[i]);
				model.setZip_cd              		  (zip_cd              	[i]);
				model.setSconti_cd           		  (sconti_cd           	[i]);
				model.setCre_usr_id          		  (cre_usr_id          	[i]);
				model.setCre_dt              		  (cre_dt              	[i]);
				model.setUpd_usr_id          		  (upd_usr_id          	[i]);
				model.setUpd_dt              		  (upd_dt              	[i]);
				model.setDelt_flg            		  (delt_flg            	[i]);
				model.setEai_evnt_dt         		  (eai_evnt_dt         	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		MdmLocation model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag               =  (JSPUtil.getParameter(request, prefix + "ibflag              		".trim(), length));
			String[] page_rows            =  (JSPUtil.getParameter(request, prefix + "page_rows           		".trim(), length));
			String[] loc_cd               =  (JSPUtil.getParameter(request, prefix + "loc_cd              		".trim(), length));
			String[] scc_cd               =  (JSPUtil.getParameter(request, prefix + "scc_cd              		".trim(), length));
			String[] loc_nm               =  (JSPUtil.getParameter(request, prefix + "loc_nm              		".trim(), length));
			String[] rgn_cd               =  (JSPUtil.getParameter(request, prefix + "rgn_cd              		".trim(), length));
			String[] cnt_cd               =  (JSPUtil.getParameter(request, prefix + "cnt_cd              		".trim(), length));
			String[] ste_cd               =  (JSPUtil.getParameter(request, prefix + "ste_cd              		".trim(), length));
			String[] conti_cd             =  (JSPUtil.getParameter(request, prefix + "conti_cd            		".trim(), length));
			String[] port_inlnd_cd        =  (JSPUtil.getParameter(request, prefix + "port_inlnd_cd       		".trim(), length));
			String[] loc_chr_cd           =  (JSPUtil.getParameter(request, prefix + "loc_chr_cd          		".trim(), length));
			String[] blk_port_flg         =  (JSPUtil.getParameter(request, prefix + "blk_port_flg        		".trim(), length));
			String[] hub_loc_cd           =  (JSPUtil.getParameter(request, prefix + "hub_loc_cd          		".trim(), length));
			String[] sls_ofc_cd           =  (JSPUtil.getParameter(request, prefix + "sls_ofc_cd          		".trim(), length));
			String[] loc_grd_no           =  (JSPUtil.getParameter(request, prefix + "loc_grd_no          		".trim(), length));
			String[] gmt_hrs              =  (JSPUtil.getParameter(request, prefix + "gmt_hrs             		".trim(), length));
			String[] bkg_bl_pfx_cd        =  (JSPUtil.getParameter(request, prefix + "bkg_bl_pfx_cd       		".trim(), length));
			String[] call_port_flg        =  (JSPUtil.getParameter(request, prefix + "call_port_flg       		".trim(), length));
			String[] loc_ams_port_cd      =  (JSPUtil.getParameter(request, prefix + "loc_ams_port_cd     		".trim(), length));
			String[] finc_ctrl_ofc_cd     =  (JSPUtil.getParameter(request, prefix + "finc_ctrl_ofc_cd    		".trim(), length));
			String[] eq_ctrl_ofc_cd       =  (JSPUtil.getParameter(request, prefix + "eq_ctrl_ofc_cd      		".trim(), length));
			String[] mty_pkup_yd_cd       =  (JSPUtil.getParameter(request, prefix + "mty_pkup_yd_cd      		".trim(), length));
			String[] sen_eq_ofc_cd        =  (JSPUtil.getParameter(request, prefix + "sen_eq_ofc_cd       		".trim(), length));
			String[] eq_rtn_yd_cd         =  (JSPUtil.getParameter(request, prefix + "eq_rtn_yd_cd        		".trim(), length));
			String[] un_loc_ind_cd        =  (JSPUtil.getParameter(request, prefix + "un_loc_ind_cd       		".trim(), length));
			String[] un_loc_cd            =  (JSPUtil.getParameter(request, prefix + "un_loc_cd           		".trim(), length));
			String[] cml_zn_flg           =  (JSPUtil.getParameter(request, prefix + "cml_zn_flg          		".trim(), length));
			String[] cstms_cd             =  (JSPUtil.getParameter(request, prefix + "cstms_cd            		".trim(), length));
			String[] loc_tp_cd            =  (JSPUtil.getParameter(request, prefix + "loc_tp_cd           		".trim(), length));
			String[] bfr_finc_ctrl_ofc_cd =  (JSPUtil.getParameter(request, prefix + "bfr_finc_ctrl_ofc_cd		".trim(), length));
			String[] bfr_eq_ctrl_ofc_cd   =  (JSPUtil.getParameter(request, prefix + "bfr_eq_ctrl_ofc_cd  		".trim(), length));
			String[] bfr_sls_ofc_cd       =  (JSPUtil.getParameter(request, prefix + "bfr_sls_ofc_cd      		".trim(), length));
			String[] bfr_ofc_cng_dt       =  (JSPUtil.getParameter(request, prefix + "bfr_ofc_cng_dt      		".trim(), length));
			String[] rep_zn_cd            =  (JSPUtil.getParameter(request, prefix + "rep_zn_cd           		".trim(), length));
			String[] zip_cd               =  (JSPUtil.getParameter(request, prefix + "zip_cd              		".trim(), length));
			String[] sconti_cd            =  (JSPUtil.getParameter(request, prefix + "sconti_cd           		".trim(), length));
			String[] cre_usr_id           =  (JSPUtil.getParameter(request, prefix + "cre_usr_id          		".trim(), length));
			String[] cre_dt               =  (JSPUtil.getParameter(request, prefix + "cre_dt              		".trim(), length));
			String[] upd_usr_id           =  (JSPUtil.getParameter(request, prefix + "upd_usr_id          		".trim(), length));
			String[] upd_dt               =  (JSPUtil.getParameter(request, prefix + "upd_dt              		".trim(), length));
			String[] delt_flg             =  (JSPUtil.getParameter(request, prefix + "delt_flg            		".trim(), length));
			String[] eai_evnt_dt          =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt         		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new MdmLocation();
				model.setIbflag              		  ( ibflag              	[i]);
				model.setPage_rows           		  ( page_rows           	[i]);
				model.setLoc_cd              		  ( loc_cd              	[i]);
				model.setScc_cd              		  ( scc_cd              	[i]);
				model.setLoc_nm              		  ( loc_nm              	[i]);
				model.setRgn_cd              		  ( rgn_cd              	[i]);
				model.setCnt_cd              		  ( cnt_cd              	[i]);
				model.setSte_cd              		  ( ste_cd              	[i]);
				model.setConti_cd            		  ( conti_cd            	[i]);
				model.setPort_inlnd_cd       		  ( port_inlnd_cd       	[i]);
				model.setLoc_chr_cd          		  ( loc_chr_cd          	[i]);
				model.setBlk_port_flg        		  ( blk_port_flg        	[i]);
				model.setHub_loc_cd          		  ( hub_loc_cd          	[i]);
				model.setSls_ofc_cd          		  ( sls_ofc_cd          	[i]);
				model.setLoc_grd_no          		  ( loc_grd_no          	[i]);
				model.setGmt_hrs             		  ( gmt_hrs             	[i]);
				model.setBkg_bl_pfx_cd       		  ( bkg_bl_pfx_cd       	[i]);
				model.setCall_port_flg       		  ( call_port_flg       	[i]);
				model.setLoc_ams_port_cd     		  ( loc_ams_port_cd     	[i]);
				model.setFinc_ctrl_ofc_cd    		  ( finc_ctrl_ofc_cd    	[i]);
				model.setEq_ctrl_ofc_cd      		  ( eq_ctrl_ofc_cd      	[i]);
				model.setMty_pkup_yd_cd      		  ( mty_pkup_yd_cd      	[i]);
				model.setSen_eq_ofc_cd       		  ( sen_eq_ofc_cd       	[i]);
				model.setEq_rtn_yd_cd        		  ( eq_rtn_yd_cd        	[i]);
				model.setUn_loc_ind_cd       		  ( un_loc_ind_cd       	[i]);
				model.setUn_loc_cd           		  ( un_loc_cd           	[i]);
				model.setCml_zn_flg          		  ( cml_zn_flg          	[i]);
				model.setCstms_cd            		  ( cstms_cd            	[i]);
				model.setLoc_tp_cd           		  ( loc_tp_cd           	[i]);
				model.setBfr_finc_ctrl_ofc_cd		  ( bfr_finc_ctrl_ofc_cd	[i]);
				model.setBfr_eq_ctrl_ofc_cd  		  ( bfr_eq_ctrl_ofc_cd  	[i]);
				model.setBfr_sls_ofc_cd      		  ( bfr_sls_ofc_cd      	[i]);
				model.setBfr_ofc_cng_dt      		  ( bfr_ofc_cng_dt      	[i]);
				model.setRep_zn_cd           		  ( rep_zn_cd           	[i]);
				model.setZip_cd              		  ( zip_cd              	[i]);
				model.setSconti_cd           		  ( sconti_cd           	[i]);
				model.setCre_usr_id          		  ( cre_usr_id          	[i]);
				model.setCre_dt              		  ( cre_dt              	[i]);
				model.setUpd_usr_id          		  ( upd_usr_id          	[i]);
				model.setUpd_dt              		  ( upd_dt              	[i]);
				model.setDelt_flg            		  ( delt_flg            	[i]);
				model.setEai_evnt_dt         		  ( eai_evnt_dt         	[i]);
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
