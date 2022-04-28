/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : BKG_BRK_CGO.java
*@FileTitle : Adding Surcharge Agreement
*Open Issues :
*Change history :
*@LastModifyDate : 2007-05-18
*@LastModifier : agreement
*@LastVersion : 1.0
* 2007-05-18 agreement
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
public final class BKG_BRK_CGO implements java.io.Serializable {

	private String            ibflag            = "";
	private String            page_rows         = "";
	private String            bkg_no            = "";
	private String            bkg_no_split      = "";
	private String            brk_cgo_seq       = "";
	private String            cntr_no           = "";
	private String            cntr_tpsz_cd      = "";
	private String            cgo_pck_qty       = "";
	private String            pck_tp_cd         = "";
	private String            cgo_ttl_wgt_tp_cd = "";
	private String            cgo_ttl_wgt       = "";
	private String            cgo_grav_ctr_ctnt = "";
	private String            cmdt_cd           = "";
	private String            slng_pnt_flg      = "";
	private String            cgo_pck_dtl_desc  = "";
	private String            ttl_dim_len       = "";
	private String            ttl_dim_wdt       = "";
	private String            ttl_dim_hgt       = "";
	private String            void_slt_knt      = "";
	private String            lodg_mzd_knd_cd   = "";
	private String            shp_crn_wgt       = "";
	private String            scr_dng_desc      = "";
	private String            spcl_rqst_desc    = "";
	private String            brk_cgo_rmk       = "";
	private String            eai_evnt_dt       = "";

	public BKG_BRK_CGO(){}

	public BKG_BRK_CGO(
			String            ibflag           ,
			String            page_rows        ,
			String            bkg_no           ,
			String            bkg_no_split     ,
			String            brk_cgo_seq      ,
			String            cntr_no          ,
			String            cntr_tpsz_cd     ,
			String            cgo_pck_qty      ,
			String            pck_tp_cd        ,
			String            cgo_ttl_wgt_tp_cd,
			String            cgo_ttl_wgt      ,
			String            cgo_grav_ctr_ctnt,
			String            cmdt_cd          ,
			String            slng_pnt_flg     ,
			String            cgo_pck_dtl_desc ,
			String            ttl_dim_len      ,
			String            ttl_dim_wdt      ,
			String            ttl_dim_hgt      ,
			String            void_slt_knt     ,
			String            lodg_mzd_knd_cd  ,
			String            shp_crn_wgt      ,
			String            scr_dng_desc     ,
			String            spcl_rqst_desc   ,
			String            brk_cgo_rmk      ,
			String            eai_evnt_dt      ){
		this.ibflag            = ibflag           ;
		this.page_rows         = page_rows        ;
		this.bkg_no            = bkg_no           ;
		this.bkg_no_split      = bkg_no_split     ;
		this.brk_cgo_seq       = brk_cgo_seq      ;
		this.cntr_no           = cntr_no          ;
		this.cntr_tpsz_cd      = cntr_tpsz_cd     ;
		this.cgo_pck_qty       = cgo_pck_qty      ;
		this.pck_tp_cd         = pck_tp_cd        ;
		this.cgo_ttl_wgt_tp_cd = cgo_ttl_wgt_tp_cd;
		this.cgo_ttl_wgt       = cgo_ttl_wgt      ;
		this.cgo_grav_ctr_ctnt = cgo_grav_ctr_ctnt;
		this.cmdt_cd           = cmdt_cd          ;
		this.slng_pnt_flg      = slng_pnt_flg     ;
		this.cgo_pck_dtl_desc  = cgo_pck_dtl_desc ;
		this.ttl_dim_len       = ttl_dim_len      ;
		this.ttl_dim_wdt       = ttl_dim_wdt      ;
		this.ttl_dim_hgt       = ttl_dim_hgt      ;
		this.void_slt_knt      = void_slt_knt     ;
		this.lodg_mzd_knd_cd   = lodg_mzd_knd_cd  ;
		this.shp_crn_wgt       = shp_crn_wgt      ;
		this.scr_dng_desc      = scr_dng_desc     ;
		this.spcl_rqst_desc    = spcl_rqst_desc   ;
		this.brk_cgo_rmk       = brk_cgo_rmk      ;
		this.eai_evnt_dt       = eai_evnt_dt      ;
	}

	// getter method is proceeding ..
	public String            getIbflag           (){	return ibflag           	;	}
	public String            getPage_rows        (){	return page_rows        	;	}
	public String            getBkg_no           (){	return bkg_no           	;	}
	public String            getBkg_no_split     (){	return bkg_no_split     	;	}
	public String            getBrk_cgo_seq      (){	return brk_cgo_seq      	;	}
	public String            getCntr_no          (){	return cntr_no          	;	}
	public String            getCntr_tpsz_cd     (){	return cntr_tpsz_cd     	;	}
	public String            getCgo_pck_qty      (){	return cgo_pck_qty      	;	}
	public String            getPck_tp_cd        (){	return pck_tp_cd        	;	}
	public String            getCgo_ttl_wgt_tp_cd(){	return cgo_ttl_wgt_tp_cd	;	}
	public String            getCgo_ttl_wgt      (){	return cgo_ttl_wgt      	;	}
	public String            getCgo_grav_ctr_ctnt(){	return cgo_grav_ctr_ctnt	;	}
	public String            getCmdt_cd          (){	return cmdt_cd          	;	}
	public String            getSlng_pnt_flg     (){	return slng_pnt_flg     	;	}
	public String            getCgo_pck_dtl_desc (){	return cgo_pck_dtl_desc 	;	}
	public String            getTtl_dim_len      (){	return ttl_dim_len      	;	}
	public String            getTtl_dim_wdt      (){	return ttl_dim_wdt      	;	}
	public String            getTtl_dim_hgt      (){	return ttl_dim_hgt      	;	}
	public String            getVoid_slt_knt     (){	return void_slt_knt     	;	}
	public String            getLodg_mzd_knd_cd  (){	return lodg_mzd_knd_cd  	;	}
	public String            getShp_crn_wgt      (){	return shp_crn_wgt      	;	}
	public String            getScr_dng_desc     (){	return scr_dng_desc     	;	}
	public String            getSpcl_rqst_desc   (){	return spcl_rqst_desc   	;	}
	public String            getBrk_cgo_rmk      (){	return brk_cgo_rmk      	;	}
	public String            getEai_evnt_dt      (){	return eai_evnt_dt      	;	}

	// setter method is proceeding ..
	public void setIbflag           ( String            ibflag            ){	this.ibflag            = ibflag           	;	}
	public void setPage_rows        ( String            page_rows         ){	this.page_rows         = page_rows        	;	}
	public void setBkg_no           ( String            bkg_no            ){	this.bkg_no            = bkg_no           	;	}
	public void setBkg_no_split     ( String            bkg_no_split      ){	this.bkg_no_split      = bkg_no_split     	;	}
	public void setBrk_cgo_seq      ( String            brk_cgo_seq       ){	this.brk_cgo_seq       = brk_cgo_seq      	;	}
	public void setCntr_no          ( String            cntr_no           ){	this.cntr_no           = cntr_no          	;	}
	public void setCntr_tpsz_cd     ( String            cntr_tpsz_cd      ){	this.cntr_tpsz_cd      = cntr_tpsz_cd     	;	}
	public void setCgo_pck_qty      ( String            cgo_pck_qty       ){	this.cgo_pck_qty       = cgo_pck_qty      	;	}
	public void setPck_tp_cd        ( String            pck_tp_cd         ){	this.pck_tp_cd         = pck_tp_cd        	;	}
	public void setCgo_ttl_wgt_tp_cd( String            cgo_ttl_wgt_tp_cd ){	this.cgo_ttl_wgt_tp_cd = cgo_ttl_wgt_tp_cd	;	}
	public void setCgo_ttl_wgt      ( String            cgo_ttl_wgt       ){	this.cgo_ttl_wgt       = cgo_ttl_wgt      	;	}
	public void setCgo_grav_ctr_ctnt( String            cgo_grav_ctr_ctnt ){	this.cgo_grav_ctr_ctnt = cgo_grav_ctr_ctnt	;	}
	public void setCmdt_cd          ( String            cmdt_cd           ){	this.cmdt_cd           = cmdt_cd          	;	}
	public void setSlng_pnt_flg     ( String            slng_pnt_flg      ){	this.slng_pnt_flg      = slng_pnt_flg     	;	}
	public void setCgo_pck_dtl_desc ( String            cgo_pck_dtl_desc  ){	this.cgo_pck_dtl_desc  = cgo_pck_dtl_desc 	;	}
	public void setTtl_dim_len      ( String            ttl_dim_len       ){	this.ttl_dim_len       = ttl_dim_len      	;	}
	public void setTtl_dim_wdt      ( String            ttl_dim_wdt       ){	this.ttl_dim_wdt       = ttl_dim_wdt      	;	}
	public void setTtl_dim_hgt      ( String            ttl_dim_hgt       ){	this.ttl_dim_hgt       = ttl_dim_hgt      	;	}
	public void setVoid_slt_knt     ( String            void_slt_knt      ){	this.void_slt_knt      = void_slt_knt     	;	}
	public void setLodg_mzd_knd_cd  ( String            lodg_mzd_knd_cd   ){	this.lodg_mzd_knd_cd   = lodg_mzd_knd_cd  	;	}
	public void setShp_crn_wgt      ( String            shp_crn_wgt       ){	this.shp_crn_wgt       = shp_crn_wgt      	;	}
	public void setScr_dng_desc     ( String            scr_dng_desc      ){	this.scr_dng_desc      = scr_dng_desc     	;	}
	public void setSpcl_rqst_desc   ( String            spcl_rqst_desc    ){	this.spcl_rqst_desc    = spcl_rqst_desc   	;	}
	public void setBrk_cgo_rmk      ( String            brk_cgo_rmk       ){	this.brk_cgo_rmk       = brk_cgo_rmk      	;	}
	public void setEai_evnt_dt      ( String            eai_evnt_dt       ){	this.eai_evnt_dt       = eai_evnt_dt      	;	}

	public static BKG_BRK_CGO fromRequest(HttpServletRequest request) {
		BKG_BRK_CGO model = new BKG_BRK_CGO();
		try {
			model.setIbflag           	(JSPUtil.getParameter(request, "ibflag           		".trim(), ""));
			model.setPage_rows        	(JSPUtil.getParameter(request, "page_rows        		".trim(), ""));
			model.setBkg_no           	(JSPUtil.getParameter(request, "bkg_no           		".trim(), ""));
			model.setBkg_no_split     	(JSPUtil.getParameter(request, "bkg_no_split     		".trim(), ""));
			model.setBrk_cgo_seq      	(JSPUtil.getParameter(request, "brk_cgo_seq      		".trim(), ""));
			model.setCntr_no          	(JSPUtil.getParameter(request, "cntr_no          		".trim(), ""));
			model.setCntr_tpsz_cd     	(JSPUtil.getParameter(request, "cntr_tpsz_cd     		".trim(), ""));
			model.setCgo_pck_qty      	(JSPUtil.getParameter(request, "cgo_pck_qty      		".trim(), ""));
			model.setPck_tp_cd        	(JSPUtil.getParameter(request, "pck_tp_cd        		".trim(), ""));
			model.setCgo_ttl_wgt_tp_cd	(JSPUtil.getParameter(request, "cgo_ttl_wgt_tp_cd		".trim(), ""));
			model.setCgo_ttl_wgt      	(JSPUtil.getParameter(request, "cgo_ttl_wgt      		".trim(), ""));
			model.setCgo_grav_ctr_ctnt	(JSPUtil.getParameter(request, "cgo_grav_ctr_ctnt		".trim(), ""));
			model.setCmdt_cd          	(JSPUtil.getParameter(request, "cmdt_cd          		".trim(), ""));
			model.setSlng_pnt_flg     	(JSPUtil.getParameter(request, "slng_pnt_flg     		".trim(), ""));
			model.setCgo_pck_dtl_desc 	(JSPUtil.getParameter(request, "cgo_pck_dtl_desc 		".trim(), ""));
			model.setTtl_dim_len      	(JSPUtil.getParameter(request, "ttl_dim_len      		".trim(), ""));
			model.setTtl_dim_wdt      	(JSPUtil.getParameter(request, "ttl_dim_wdt      		".trim(), ""));
			model.setTtl_dim_hgt      	(JSPUtil.getParameter(request, "ttl_dim_hgt      		".trim(), ""));
			model.setVoid_slt_knt     	(JSPUtil.getParameter(request, "void_slt_knt     		".trim(), ""));
			model.setLodg_mzd_knd_cd  	(JSPUtil.getParameter(request, "lodg_mzd_knd_cd  		".trim(), ""));
			model.setShp_crn_wgt      	(JSPUtil.getParameter(request, "shp_crn_wgt      		".trim(), ""));
			model.setScr_dng_desc     	(JSPUtil.getParameter(request, "scr_dng_desc     		".trim(), ""));
			model.setSpcl_rqst_desc   	(JSPUtil.getParameter(request, "spcl_rqst_desc   		".trim(), ""));
			model.setBrk_cgo_rmk      	(JSPUtil.getParameter(request, "brk_cgo_rmk      		".trim(), ""));
			model.setEai_evnt_dt      	(JSPUtil.getParameter(request, "eai_evnt_dt      		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		BKG_BRK_CGO model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag            =  (JSPUtil.getParameter(request, "ibflag           		".trim(), length));
			String[] page_rows         =  (JSPUtil.getParameter(request, "page_rows        		".trim(), length));
			String[] bkg_no            =  (JSPUtil.getParameter(request, "bkg_no           		".trim(), length));
			String[] bkg_no_split      =  (JSPUtil.getParameter(request, "bkg_no_split     		".trim(), length));
			String[] brk_cgo_seq       =  (JSPUtil.getParameter(request, "brk_cgo_seq      		".trim(), length));
			String[] cntr_no           =  (JSPUtil.getParameter(request, "cntr_no          		".trim(), length));
			String[] cntr_tpsz_cd      =  (JSPUtil.getParameter(request, "cntr_tpsz_cd     		".trim(), length));
			String[] cgo_pck_qty       =  (JSPUtil.getParameter(request, "cgo_pck_qty      		".trim(), length));
			String[] pck_tp_cd         =  (JSPUtil.getParameter(request, "pck_tp_cd        		".trim(), length));
			String[] cgo_ttl_wgt_tp_cd =  (JSPUtil.getParameter(request, "cgo_ttl_wgt_tp_cd		".trim(), length));
			String[] cgo_ttl_wgt       =  (JSPUtil.getParameter(request, "cgo_ttl_wgt      		".trim(), length));
			String[] cgo_grav_ctr_ctnt =  (JSPUtil.getParameter(request, "cgo_grav_ctr_ctnt		".trim(), length));
			String[] cmdt_cd           =  (JSPUtil.getParameter(request, "cmdt_cd          		".trim(), length));
			String[] slng_pnt_flg      =  (JSPUtil.getParameter(request, "slng_pnt_flg     		".trim(), length));
			String[] cgo_pck_dtl_desc  =  (JSPUtil.getParameter(request, "cgo_pck_dtl_desc 		".trim(), length));
			String[] ttl_dim_len       =  (JSPUtil.getParameter(request, "ttl_dim_len      		".trim(), length));
			String[] ttl_dim_wdt       =  (JSPUtil.getParameter(request, "ttl_dim_wdt      		".trim(), length));
			String[] ttl_dim_hgt       =  (JSPUtil.getParameter(request, "ttl_dim_hgt      		".trim(), length));
			String[] void_slt_knt      =  (JSPUtil.getParameter(request, "void_slt_knt     		".trim(), length));
			String[] lodg_mzd_knd_cd   =  (JSPUtil.getParameter(request, "lodg_mzd_knd_cd  		".trim(), length));
			String[] shp_crn_wgt       =  (JSPUtil.getParameter(request, "shp_crn_wgt      		".trim(), length));
			String[] scr_dng_desc      =  (JSPUtil.getParameter(request, "scr_dng_desc     		".trim(), length));
			String[] spcl_rqst_desc    =  (JSPUtil.getParameter(request, "spcl_rqst_desc   		".trim(), length));
			String[] brk_cgo_rmk       =  (JSPUtil.getParameter(request, "brk_cgo_rmk      		".trim(), length));
			String[] eai_evnt_dt       =  (JSPUtil.getParameter(request, "eai_evnt_dt      		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new BKG_BRK_CGO();
				model.setIbflag           		  (ibflag           	[i]);
				model.setPage_rows        		  (page_rows        	[i]);
				model.setBkg_no           		  (bkg_no           	[i]);
				model.setBkg_no_split     		  (bkg_no_split     	[i]);
				model.setBrk_cgo_seq      		  (brk_cgo_seq      	[i]);
				model.setCntr_no          		  (cntr_no          	[i]);
				model.setCntr_tpsz_cd     		  (cntr_tpsz_cd     	[i]);
				model.setCgo_pck_qty      		  (cgo_pck_qty      	[i]);
				model.setPck_tp_cd        		  (pck_tp_cd        	[i]);
				model.setCgo_ttl_wgt_tp_cd		  (cgo_ttl_wgt_tp_cd	[i]);
				model.setCgo_ttl_wgt      		  (cgo_ttl_wgt      	[i]);
				model.setCgo_grav_ctr_ctnt		  (cgo_grav_ctr_ctnt	[i]);
				model.setCmdt_cd          		  (cmdt_cd          	[i]);
				model.setSlng_pnt_flg     		  (slng_pnt_flg     	[i]);
				model.setCgo_pck_dtl_desc 		  (cgo_pck_dtl_desc 	[i]);
				model.setTtl_dim_len      		  (ttl_dim_len      	[i]);
				model.setTtl_dim_wdt      		  (ttl_dim_wdt      	[i]);
				model.setTtl_dim_hgt      		  (ttl_dim_hgt      	[i]);
				model.setVoid_slt_knt     		  (void_slt_knt     	[i]);
				model.setLodg_mzd_knd_cd  		  (lodg_mzd_knd_cd  	[i]);
				model.setShp_crn_wgt      		  (shp_crn_wgt      	[i]);
				model.setScr_dng_desc     		  (scr_dng_desc     	[i]);
				model.setSpcl_rqst_desc   		  (spcl_rqst_desc   	[i]);
				model.setBrk_cgo_rmk      		  (brk_cgo_rmk      	[i]);
				model.setEai_evnt_dt      		  (eai_evnt_dt      	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		BKG_BRK_CGO model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag            =  (JSPUtil.getParameter(request, prefix + "ibflag           		".trim(), length));
			String[] page_rows         =  (JSPUtil.getParameter(request, prefix + "page_rows        		".trim(), length));
			String[] bkg_no            =  (JSPUtil.getParameter(request, prefix + "bkg_no           		".trim(), length));
			String[] bkg_no_split      =  (JSPUtil.getParameter(request, prefix + "bkg_no_split     		".trim(), length));
			String[] brk_cgo_seq       =  (JSPUtil.getParameter(request, prefix + "brk_cgo_seq      		".trim(), length));
			String[] cntr_no           =  (JSPUtil.getParameter(request, prefix + "cntr_no          		".trim(), length));
			String[] cntr_tpsz_cd      =  (JSPUtil.getParameter(request, prefix + "cntr_tpsz_cd     		".trim(), length));
			String[] cgo_pck_qty       =  (JSPUtil.getParameter(request, prefix + "cgo_pck_qty      		".trim(), length));
			String[] pck_tp_cd         =  (JSPUtil.getParameter(request, prefix + "pck_tp_cd        		".trim(), length));
			String[] cgo_ttl_wgt_tp_cd =  (JSPUtil.getParameter(request, prefix + "cgo_ttl_wgt_tp_cd		".trim(), length));
			String[] cgo_ttl_wgt       =  (JSPUtil.getParameter(request, prefix + "cgo_ttl_wgt      		".trim(), length));
			String[] cgo_grav_ctr_ctnt =  (JSPUtil.getParameter(request, prefix + "cgo_grav_ctr_ctnt		".trim(), length));
			String[] cmdt_cd           =  (JSPUtil.getParameter(request, prefix + "cmdt_cd          		".trim(), length));
			String[] slng_pnt_flg      =  (JSPUtil.getParameter(request, prefix + "slng_pnt_flg     		".trim(), length));
			String[] cgo_pck_dtl_desc  =  (JSPUtil.getParameter(request, prefix + "cgo_pck_dtl_desc 		".trim(), length));
			String[] ttl_dim_len       =  (JSPUtil.getParameter(request, prefix + "ttl_dim_len      		".trim(), length));
			String[] ttl_dim_wdt       =  (JSPUtil.getParameter(request, prefix + "ttl_dim_wdt      		".trim(), length));
			String[] ttl_dim_hgt       =  (JSPUtil.getParameter(request, prefix + "ttl_dim_hgt      		".trim(), length));
			String[] void_slt_knt      =  (JSPUtil.getParameter(request, prefix + "void_slt_knt     		".trim(), length));
			String[] lodg_mzd_knd_cd   =  (JSPUtil.getParameter(request, prefix + "lodg_mzd_knd_cd  		".trim(), length));
			String[] shp_crn_wgt       =  (JSPUtil.getParameter(request, prefix + "shp_crn_wgt      		".trim(), length));
			String[] scr_dng_desc      =  (JSPUtil.getParameter(request, prefix + "scr_dng_desc     		".trim(), length));
			String[] spcl_rqst_desc    =  (JSPUtil.getParameter(request, prefix + "spcl_rqst_desc   		".trim(), length));
			String[] brk_cgo_rmk       =  (JSPUtil.getParameter(request, prefix + "brk_cgo_rmk      		".trim(), length));
			String[] eai_evnt_dt       =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt      		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new BKG_BRK_CGO();
				model.setIbflag           		  ( ibflag           	[i]);
				model.setPage_rows        		  ( page_rows        	[i]);
				model.setBkg_no           		  ( bkg_no           	[i]);
				model.setBkg_no_split     		  ( bkg_no_split     	[i]);
				model.setBrk_cgo_seq      		  ( brk_cgo_seq      	[i]);
				model.setCntr_no          		  ( cntr_no          	[i]);
				model.setCntr_tpsz_cd     		  ( cntr_tpsz_cd     	[i]);
				model.setCgo_pck_qty      		  ( cgo_pck_qty      	[i]);
				model.setPck_tp_cd        		  ( pck_tp_cd        	[i]);
				model.setCgo_ttl_wgt_tp_cd		  ( cgo_ttl_wgt_tp_cd	[i]);
				model.setCgo_ttl_wgt      		  ( cgo_ttl_wgt      	[i]);
				model.setCgo_grav_ctr_ctnt		  ( cgo_grav_ctr_ctnt	[i]);
				model.setCmdt_cd          		  ( cmdt_cd          	[i]);
				model.setSlng_pnt_flg     		  ( slng_pnt_flg     	[i]);
				model.setCgo_pck_dtl_desc 		  ( cgo_pck_dtl_desc 	[i]);
				model.setTtl_dim_len      		  ( ttl_dim_len      	[i]);
				model.setTtl_dim_wdt      		  ( ttl_dim_wdt      	[i]);
				model.setTtl_dim_hgt      		  ( ttl_dim_hgt      	[i]);
				model.setVoid_slt_knt     		  ( void_slt_knt     	[i]);
				model.setLodg_mzd_knd_cd  		  ( lodg_mzd_knd_cd  	[i]);
				model.setShp_crn_wgt      		  ( shp_crn_wgt      	[i]);
				model.setScr_dng_desc     		  ( scr_dng_desc     	[i]);
				model.setSpcl_rqst_desc   		  ( spcl_rqst_desc   	[i]);
				model.setBrk_cgo_rmk      		  ( brk_cgo_rmk      	[i]);
				model.setEai_evnt_dt      		  ( eai_evnt_dt      	[i]);
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
