/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : BKG_AWK_CGO.java
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
public final class BKG_AWK_CGO implements java.io.Serializable {

	private String          ibflag          = "";
	private String          page_rows       = "";
	private String          bkg_no          = "";
	private String          bkg_no_split    = "";
	private String          awk_cgo_seq     = "";
	private String          cntr_no         = "";
	private String          cntr_tpsz_cd    = "";
	private String          pck_tp_cd       = "";
	private String          pck_qty         = "";
	private String          grs_wgt_tp_cd   = "";
	private String          grs_wgt         = "";
	private String          net_wgt_tp_cd   = "";
	private String          net_wgt         = "";
	private String          cmdt_cd         = "";
	private String          ttl_dim_len     = "";
	private String          ttl_dim_wdt     = "";
	private String          ttl_dim_hgt     = "";
	private String          fwrd_ovr_len    = "";
	private String          bkwd_ovr_len    = "";
	private String          ovr_hgt         = "";
	private String          ovr_port_no     = "";
	private String          ovr_sd_no       = "";
	private String          stwg_instr_desc = "";
	private String          ovr_void_slt_no = "";
	private String          shp_crn_no      = "";
	private String          awk_cgo_rmk     = "";
	private String          eai_evnt_dt     = "";

	public BKG_AWK_CGO(){}

	public BKG_AWK_CGO(
			String          ibflag         ,
			String          page_rows      ,
			String          bkg_no         ,
			String          bkg_no_split   ,
			String          awk_cgo_seq    ,
			String          cntr_no        ,
			String          cntr_tpsz_cd   ,
			String          pck_tp_cd      ,
			String          pck_qty        ,
			String          grs_wgt_tp_cd  ,
			String          grs_wgt        ,
			String          net_wgt_tp_cd  ,
			String          net_wgt        ,
			String          cmdt_cd        ,
			String          ttl_dim_len    ,
			String          ttl_dim_wdt    ,
			String          ttl_dim_hgt    ,
			String          fwrd_ovr_len   ,
			String          bkwd_ovr_len   ,
			String          ovr_hgt        ,
			String          ovr_port_no    ,
			String          ovr_sd_no      ,
			String          stwg_instr_desc,
			String          ovr_void_slt_no,
			String          shp_crn_no     ,
			String          awk_cgo_rmk    ,
			String          eai_evnt_dt    ){
		this.ibflag          = ibflag         ;
		this.page_rows       = page_rows      ;
		this.bkg_no          = bkg_no         ;
		this.bkg_no_split    = bkg_no_split   ;
		this.awk_cgo_seq     = awk_cgo_seq    ;
		this.cntr_no         = cntr_no        ;
		this.cntr_tpsz_cd    = cntr_tpsz_cd   ;
		this.pck_tp_cd       = pck_tp_cd      ;
		this.pck_qty         = pck_qty        ;
		this.grs_wgt_tp_cd   = grs_wgt_tp_cd  ;
		this.grs_wgt         = grs_wgt        ;
		this.net_wgt_tp_cd   = net_wgt_tp_cd  ;
		this.net_wgt         = net_wgt        ;
		this.cmdt_cd         = cmdt_cd        ;
		this.ttl_dim_len     = ttl_dim_len    ;
		this.ttl_dim_wdt     = ttl_dim_wdt    ;
		this.ttl_dim_hgt     = ttl_dim_hgt    ;
		this.fwrd_ovr_len    = fwrd_ovr_len   ;
		this.bkwd_ovr_len    = bkwd_ovr_len   ;
		this.ovr_hgt         = ovr_hgt        ;
		this.ovr_port_no     = ovr_port_no    ;
		this.ovr_sd_no       = ovr_sd_no      ;
		this.stwg_instr_desc = stwg_instr_desc;
		this.ovr_void_slt_no = ovr_void_slt_no;
		this.shp_crn_no      = shp_crn_no     ;
		this.awk_cgo_rmk     = awk_cgo_rmk    ;
		this.eai_evnt_dt     = eai_evnt_dt    ;
	}

	// getter method is proceeding ..
	public String          getIbflag         (){	return ibflag         	;	}
	public String          getPage_rows      (){	return page_rows      	;	}
	public String          getBkg_no         (){	return bkg_no         	;	}
	public String          getBkg_no_split   (){	return bkg_no_split   	;	}
	public String          getAwk_cgo_seq    (){	return awk_cgo_seq    	;	}
	public String          getCntr_no        (){	return cntr_no        	;	}
	public String          getCntr_tpsz_cd   (){	return cntr_tpsz_cd   	;	}
	public String          getPck_tp_cd      (){	return pck_tp_cd      	;	}
	public String          getPck_qty        (){	return pck_qty        	;	}
	public String          getGrs_wgt_tp_cd  (){	return grs_wgt_tp_cd  	;	}
	public String          getGrs_wgt        (){	return grs_wgt        	;	}
	public String          getNet_wgt_tp_cd  (){	return net_wgt_tp_cd  	;	}
	public String          getNet_wgt        (){	return net_wgt        	;	}
	public String          getCmdt_cd        (){	return cmdt_cd        	;	}
	public String          getTtl_dim_len    (){	return ttl_dim_len    	;	}
	public String          getTtl_dim_wdt    (){	return ttl_dim_wdt    	;	}
	public String          getTtl_dim_hgt    (){	return ttl_dim_hgt    	;	}
	public String          getFwrd_ovr_len   (){	return fwrd_ovr_len   	;	}
	public String          getBkwd_ovr_len   (){	return bkwd_ovr_len   	;	}
	public String          getOvr_hgt        (){	return ovr_hgt        	;	}
	public String          getOvr_port_no    (){	return ovr_port_no    	;	}
	public String          getOvr_sd_no      (){	return ovr_sd_no      	;	}
	public String          getStwg_instr_desc(){	return stwg_instr_desc	;	}
	public String          getOvr_void_slt_no(){	return ovr_void_slt_no	;	}
	public String          getShp_crn_no     (){	return shp_crn_no     	;	}
	public String          getAwk_cgo_rmk    (){	return awk_cgo_rmk    	;	}
	public String          getEai_evnt_dt    (){	return eai_evnt_dt    	;	}

	// setter method is proceeding ..
	public void setIbflag         ( String          ibflag          ){	this.ibflag          = ibflag         	;	}
	public void setPage_rows      ( String          page_rows       ){	this.page_rows       = page_rows      	;	}
	public void setBkg_no         ( String          bkg_no          ){	this.bkg_no          = bkg_no         	;	}
	public void setBkg_no_split   ( String          bkg_no_split    ){	this.bkg_no_split    = bkg_no_split   	;	}
	public void setAwk_cgo_seq    ( String          awk_cgo_seq     ){	this.awk_cgo_seq     = awk_cgo_seq    	;	}
	public void setCntr_no        ( String          cntr_no         ){	this.cntr_no         = cntr_no        	;	}
	public void setCntr_tpsz_cd   ( String          cntr_tpsz_cd    ){	this.cntr_tpsz_cd    = cntr_tpsz_cd   	;	}
	public void setPck_tp_cd      ( String          pck_tp_cd       ){	this.pck_tp_cd       = pck_tp_cd      	;	}
	public void setPck_qty        ( String          pck_qty         ){	this.pck_qty         = pck_qty        	;	}
	public void setGrs_wgt_tp_cd  ( String          grs_wgt_tp_cd   ){	this.grs_wgt_tp_cd   = grs_wgt_tp_cd  	;	}
	public void setGrs_wgt        ( String          grs_wgt         ){	this.grs_wgt         = grs_wgt        	;	}
	public void setNet_wgt_tp_cd  ( String          net_wgt_tp_cd   ){	this.net_wgt_tp_cd   = net_wgt_tp_cd  	;	}
	public void setNet_wgt        ( String          net_wgt         ){	this.net_wgt         = net_wgt        	;	}
	public void setCmdt_cd        ( String          cmdt_cd         ){	this.cmdt_cd         = cmdt_cd        	;	}
	public void setTtl_dim_len    ( String          ttl_dim_len     ){	this.ttl_dim_len     = ttl_dim_len    	;	}
	public void setTtl_dim_wdt    ( String          ttl_dim_wdt     ){	this.ttl_dim_wdt     = ttl_dim_wdt    	;	}
	public void setTtl_dim_hgt    ( String          ttl_dim_hgt     ){	this.ttl_dim_hgt     = ttl_dim_hgt    	;	}
	public void setFwrd_ovr_len   ( String          fwrd_ovr_len    ){	this.fwrd_ovr_len    = fwrd_ovr_len   	;	}
	public void setBkwd_ovr_len   ( String          bkwd_ovr_len    ){	this.bkwd_ovr_len    = bkwd_ovr_len   	;	}
	public void setOvr_hgt        ( String          ovr_hgt         ){	this.ovr_hgt         = ovr_hgt        	;	}
	public void setOvr_port_no    ( String          ovr_port_no     ){	this.ovr_port_no     = ovr_port_no    	;	}
	public void setOvr_sd_no      ( String          ovr_sd_no       ){	this.ovr_sd_no       = ovr_sd_no      	;	}
	public void setStwg_instr_desc( String          stwg_instr_desc ){	this.stwg_instr_desc = stwg_instr_desc	;	}
	public void setOvr_void_slt_no( String          ovr_void_slt_no ){	this.ovr_void_slt_no = ovr_void_slt_no	;	}
	public void setShp_crn_no     ( String          shp_crn_no      ){	this.shp_crn_no      = shp_crn_no     	;	}
	public void setAwk_cgo_rmk    ( String          awk_cgo_rmk     ){	this.awk_cgo_rmk     = awk_cgo_rmk    	;	}
	public void setEai_evnt_dt    ( String          eai_evnt_dt     ){	this.eai_evnt_dt     = eai_evnt_dt    	;	}

	public static BKG_AWK_CGO fromRequest(HttpServletRequest request) {
		BKG_AWK_CGO model = new BKG_AWK_CGO();
		try {
			model.setIbflag         	(JSPUtil.getParameter(request, "ibflag         		".trim(), ""));
			model.setPage_rows      	(JSPUtil.getParameter(request, "page_rows      		".trim(), ""));
			model.setBkg_no         	(JSPUtil.getParameter(request, "bkg_no         		".trim(), ""));
			model.setBkg_no_split   	(JSPUtil.getParameter(request, "bkg_no_split   		".trim(), ""));
			model.setAwk_cgo_seq    	(JSPUtil.getParameter(request, "awk_cgo_seq    		".trim(), ""));
			model.setCntr_no        	(JSPUtil.getParameter(request, "cntr_no        		".trim(), ""));
			model.setCntr_tpsz_cd   	(JSPUtil.getParameter(request, "cntr_tpsz_cd   		".trim(), ""));
			model.setPck_tp_cd      	(JSPUtil.getParameter(request, "pck_tp_cd      		".trim(), ""));
			model.setPck_qty        	(JSPUtil.getParameter(request, "pck_qty        		".trim(), ""));
			model.setGrs_wgt_tp_cd  	(JSPUtil.getParameter(request, "grs_wgt_tp_cd  		".trim(), ""));
			model.setGrs_wgt        	(JSPUtil.getParameter(request, "grs_wgt        		".trim(), ""));
			model.setNet_wgt_tp_cd  	(JSPUtil.getParameter(request, "net_wgt_tp_cd  		".trim(), ""));
			model.setNet_wgt        	(JSPUtil.getParameter(request, "net_wgt        		".trim(), ""));
			model.setCmdt_cd        	(JSPUtil.getParameter(request, "cmdt_cd        		".trim(), ""));
			model.setTtl_dim_len    	(JSPUtil.getParameter(request, "ttl_dim_len    		".trim(), ""));
			model.setTtl_dim_wdt    	(JSPUtil.getParameter(request, "ttl_dim_wdt    		".trim(), ""));
			model.setTtl_dim_hgt    	(JSPUtil.getParameter(request, "ttl_dim_hgt    		".trim(), ""));
			model.setFwrd_ovr_len   	(JSPUtil.getParameter(request, "fwrd_ovr_len   		".trim(), ""));
			model.setBkwd_ovr_len   	(JSPUtil.getParameter(request, "bkwd_ovr_len   		".trim(), ""));
			model.setOvr_hgt        	(JSPUtil.getParameter(request, "ovr_hgt        		".trim(), ""));
			model.setOvr_port_no    	(JSPUtil.getParameter(request, "ovr_port_no    		".trim(), ""));
			model.setOvr_sd_no      	(JSPUtil.getParameter(request, "ovr_sd_no      		".trim(), ""));
			model.setStwg_instr_desc	(JSPUtil.getParameter(request, "stwg_instr_desc		".trim(), ""));
			model.setOvr_void_slt_no	(JSPUtil.getParameter(request, "ovr_void_slt_no		".trim(), ""));
			model.setShp_crn_no     	(JSPUtil.getParameter(request, "shp_crn_no     		".trim(), ""));
			model.setAwk_cgo_rmk    	(JSPUtil.getParameter(request, "awk_cgo_rmk    		".trim(), ""));
			model.setEai_evnt_dt    	(JSPUtil.getParameter(request, "eai_evnt_dt    		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		BKG_AWK_CGO model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag          =  (JSPUtil.getParameter(request, "ibflag         		".trim(), length));
			String[] page_rows       =  (JSPUtil.getParameter(request, "page_rows      		".trim(), length));
			String[] bkg_no          =  (JSPUtil.getParameter(request, "bkg_no         		".trim(), length));
			String[] bkg_no_split    =  (JSPUtil.getParameter(request, "bkg_no_split   		".trim(), length));
			String[] awk_cgo_seq     =  (JSPUtil.getParameter(request, "awk_cgo_seq    		".trim(), length));
			String[] cntr_no         =  (JSPUtil.getParameter(request, "cntr_no        		".trim(), length));
			String[] cntr_tpsz_cd    =  (JSPUtil.getParameter(request, "cntr_tpsz_cd   		".trim(), length));
			String[] pck_tp_cd       =  (JSPUtil.getParameter(request, "pck_tp_cd      		".trim(), length));
			String[] pck_qty         =  (JSPUtil.getParameter(request, "pck_qty        		".trim(), length));
			String[] grs_wgt_tp_cd   =  (JSPUtil.getParameter(request, "grs_wgt_tp_cd  		".trim(), length));
			String[] grs_wgt         =  (JSPUtil.getParameter(request, "grs_wgt        		".trim(), length));
			String[] net_wgt_tp_cd   =  (JSPUtil.getParameter(request, "net_wgt_tp_cd  		".trim(), length));
			String[] net_wgt         =  (JSPUtil.getParameter(request, "net_wgt        		".trim(), length));
			String[] cmdt_cd         =  (JSPUtil.getParameter(request, "cmdt_cd        		".trim(), length));
			String[] ttl_dim_len     =  (JSPUtil.getParameter(request, "ttl_dim_len    		".trim(), length));
			String[] ttl_dim_wdt     =  (JSPUtil.getParameter(request, "ttl_dim_wdt    		".trim(), length));
			String[] ttl_dim_hgt     =  (JSPUtil.getParameter(request, "ttl_dim_hgt    		".trim(), length));
			String[] fwrd_ovr_len    =  (JSPUtil.getParameter(request, "fwrd_ovr_len   		".trim(), length));
			String[] bkwd_ovr_len    =  (JSPUtil.getParameter(request, "bkwd_ovr_len   		".trim(), length));
			String[] ovr_hgt         =  (JSPUtil.getParameter(request, "ovr_hgt        		".trim(), length));
			String[] ovr_port_no     =  (JSPUtil.getParameter(request, "ovr_port_no    		".trim(), length));
			String[] ovr_sd_no       =  (JSPUtil.getParameter(request, "ovr_sd_no      		".trim(), length));
			String[] stwg_instr_desc =  (JSPUtil.getParameter(request, "stwg_instr_desc		".trim(), length));
			String[] ovr_void_slt_no =  (JSPUtil.getParameter(request, "ovr_void_slt_no		".trim(), length));
			String[] shp_crn_no      =  (JSPUtil.getParameter(request, "shp_crn_no     		".trim(), length));
			String[] awk_cgo_rmk     =  (JSPUtil.getParameter(request, "awk_cgo_rmk    		".trim(), length));
			String[] eai_evnt_dt     =  (JSPUtil.getParameter(request, "eai_evnt_dt    		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new BKG_AWK_CGO();
				model.setIbflag         		  (ibflag         	[i]);
				model.setPage_rows      		  (page_rows      	[i]);
				model.setBkg_no         		  (bkg_no         	[i]);
				model.setBkg_no_split   		  (bkg_no_split   	[i]);
				model.setAwk_cgo_seq    		  (awk_cgo_seq    	[i]);
				model.setCntr_no        		  (cntr_no        	[i]);
				model.setCntr_tpsz_cd   		  (cntr_tpsz_cd   	[i]);
				model.setPck_tp_cd      		  (pck_tp_cd      	[i]);
				model.setPck_qty        		  (pck_qty        	[i]);
				model.setGrs_wgt_tp_cd  		  (grs_wgt_tp_cd  	[i]);
				model.setGrs_wgt        		  (grs_wgt        	[i]);
				model.setNet_wgt_tp_cd  		  (net_wgt_tp_cd  	[i]);
				model.setNet_wgt        		  (net_wgt        	[i]);
				model.setCmdt_cd        		  (cmdt_cd        	[i]);
				model.setTtl_dim_len    		  (ttl_dim_len    	[i]);
				model.setTtl_dim_wdt    		  (ttl_dim_wdt    	[i]);
				model.setTtl_dim_hgt    		  (ttl_dim_hgt    	[i]);
				model.setFwrd_ovr_len   		  (fwrd_ovr_len   	[i]);
				model.setBkwd_ovr_len   		  (bkwd_ovr_len   	[i]);
				model.setOvr_hgt        		  (ovr_hgt        	[i]);
				model.setOvr_port_no    		  (ovr_port_no    	[i]);
				model.setOvr_sd_no      		  (ovr_sd_no      	[i]);
				model.setStwg_instr_desc		  (stwg_instr_desc	[i]);
				model.setOvr_void_slt_no		  (ovr_void_slt_no	[i]);
				model.setShp_crn_no     		  (shp_crn_no     	[i]);
				model.setAwk_cgo_rmk    		  (awk_cgo_rmk    	[i]);
				model.setEai_evnt_dt    		  (eai_evnt_dt    	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		BKG_AWK_CGO model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag          =  (JSPUtil.getParameter(request, prefix + "ibflag         		".trim(), length));
			String[] page_rows       =  (JSPUtil.getParameter(request, prefix + "page_rows      		".trim(), length));
			String[] bkg_no          =  (JSPUtil.getParameter(request, prefix + "bkg_no         		".trim(), length));
			String[] bkg_no_split    =  (JSPUtil.getParameter(request, prefix + "bkg_no_split   		".trim(), length));
			String[] awk_cgo_seq     =  (JSPUtil.getParameter(request, prefix + "awk_cgo_seq    		".trim(), length));
			String[] cntr_no         =  (JSPUtil.getParameter(request, prefix + "cntr_no        		".trim(), length));
			String[] cntr_tpsz_cd    =  (JSPUtil.getParameter(request, prefix + "cntr_tpsz_cd   		".trim(), length));
			String[] pck_tp_cd       =  (JSPUtil.getParameter(request, prefix + "pck_tp_cd      		".trim(), length));
			String[] pck_qty         =  (JSPUtil.getParameter(request, prefix + "pck_qty        		".trim(), length));
			String[] grs_wgt_tp_cd   =  (JSPUtil.getParameter(request, prefix + "grs_wgt_tp_cd  		".trim(), length));
			String[] grs_wgt         =  (JSPUtil.getParameter(request, prefix + "grs_wgt        		".trim(), length));
			String[] net_wgt_tp_cd   =  (JSPUtil.getParameter(request, prefix + "net_wgt_tp_cd  		".trim(), length));
			String[] net_wgt         =  (JSPUtil.getParameter(request, prefix + "net_wgt        		".trim(), length));
			String[] cmdt_cd         =  (JSPUtil.getParameter(request, prefix + "cmdt_cd        		".trim(), length));
			String[] ttl_dim_len     =  (JSPUtil.getParameter(request, prefix + "ttl_dim_len    		".trim(), length));
			String[] ttl_dim_wdt     =  (JSPUtil.getParameter(request, prefix + "ttl_dim_wdt    		".trim(), length));
			String[] ttl_dim_hgt     =  (JSPUtil.getParameter(request, prefix + "ttl_dim_hgt    		".trim(), length));
			String[] fwrd_ovr_len    =  (JSPUtil.getParameter(request, prefix + "fwrd_ovr_len   		".trim(), length));
			String[] bkwd_ovr_len    =  (JSPUtil.getParameter(request, prefix + "bkwd_ovr_len   		".trim(), length));
			String[] ovr_hgt         =  (JSPUtil.getParameter(request, prefix + "ovr_hgt        		".trim(), length));
			String[] ovr_port_no     =  (JSPUtil.getParameter(request, prefix + "ovr_port_no    		".trim(), length));
			String[] ovr_sd_no       =  (JSPUtil.getParameter(request, prefix + "ovr_sd_no      		".trim(), length));
			String[] stwg_instr_desc =  (JSPUtil.getParameter(request, prefix + "stwg_instr_desc		".trim(), length));
			String[] ovr_void_slt_no =  (JSPUtil.getParameter(request, prefix + "ovr_void_slt_no		".trim(), length));
			String[] shp_crn_no      =  (JSPUtil.getParameter(request, prefix + "shp_crn_no     		".trim(), length));
			String[] awk_cgo_rmk     =  (JSPUtil.getParameter(request, prefix + "awk_cgo_rmk    		".trim(), length));
			String[] eai_evnt_dt     =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt    		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new BKG_AWK_CGO();
				model.setIbflag         		  ( ibflag         	[i]);
				model.setPage_rows      		  ( page_rows      	[i]);
				model.setBkg_no         		  ( bkg_no         	[i]);
				model.setBkg_no_split   		  ( bkg_no_split   	[i]);
				model.setAwk_cgo_seq    		  ( awk_cgo_seq    	[i]);
				model.setCntr_no        		  ( cntr_no        	[i]);
				model.setCntr_tpsz_cd   		  ( cntr_tpsz_cd   	[i]);
				model.setPck_tp_cd      		  ( pck_tp_cd      	[i]);
				model.setPck_qty        		  ( pck_qty        	[i]);
				model.setGrs_wgt_tp_cd  		  ( grs_wgt_tp_cd  	[i]);
				model.setGrs_wgt        		  ( grs_wgt        	[i]);
				model.setNet_wgt_tp_cd  		  ( net_wgt_tp_cd  	[i]);
				model.setNet_wgt        		  ( net_wgt        	[i]);
				model.setCmdt_cd        		  ( cmdt_cd        	[i]);
				model.setTtl_dim_len    		  ( ttl_dim_len    	[i]);
				model.setTtl_dim_wdt    		  ( ttl_dim_wdt    	[i]);
				model.setTtl_dim_hgt    		  ( ttl_dim_hgt    	[i]);
				model.setFwrd_ovr_len   		  ( fwrd_ovr_len   	[i]);
				model.setBkwd_ovr_len   		  ( bkwd_ovr_len   	[i]);
				model.setOvr_hgt        		  ( ovr_hgt        	[i]);
				model.setOvr_port_no    		  ( ovr_port_no    	[i]);
				model.setOvr_sd_no      		  ( ovr_sd_no      	[i]);
				model.setStwg_instr_desc		  ( stwg_instr_desc	[i]);
				model.setOvr_void_slt_no		  ( ovr_void_slt_no	[i]);
				model.setShp_crn_no     		  ( shp_crn_no     	[i]);
				model.setAwk_cgo_rmk    		  ( awk_cgo_rmk    	[i]);
				model.setEai_evnt_dt    		  ( eai_evnt_dt    	[i]);
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
