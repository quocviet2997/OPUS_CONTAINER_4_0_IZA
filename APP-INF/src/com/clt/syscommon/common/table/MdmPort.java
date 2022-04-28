/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : MDM_PORT.java
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
public final class MdmPort implements java.io.Serializable {

	private String        ibflag        = "";
	private String        page_rows     = "";
	private String        port_cd       = "";
	private String        port_nm       = "";
	private String        port_altn_nm  = "";
	private String        port_lat      = "";
	private String        lat_ut_cd     = "";
	private String        port_lon      = "";
	private String        lon_ut_cd     = "";
	private String        ocn_cd        = "";
	private String        max_drft_dpth = "";
	private String        max_loa_wdt   = "";
	private String        max_bm_wdt    = "";
	private String        max_hgt       = "";
	private String        zn_tp_cd1     = "";
	private String        zn_tp_cd2     = "";
	private String        zn_tp_cd3     = "";
	private String        rp_cd         = "";
	private String        drft_ut_cd    = "";
	private String        loa_ut_cd     = "";
	private String        bm_ut_cd      = "";
	private String        hgt_ut_cd     = "";
	private String        modi_port_cd  = "";
	private String        cre_usr_id    = "";
	private String        cre_dt        = "";
	private String        upd_usr_id    = "";
	private String        upd_dt        = "";
	private String        delt_flg      = "";
	private String        eai_evnt_dt   = "";

	public MdmPort(){}

	public MdmPort(
			String        ibflag       ,
			String        page_rows    ,
			String        port_cd      ,
			String        port_nm      ,
			String        port_altn_nm ,
			String        port_lat     ,
			String        lat_ut_cd    ,
			String        port_lon     ,
			String        lon_ut_cd    ,
			String        ocn_cd       ,
			String        max_drft_dpth,
			String        max_loa_wdt  ,
			String        max_bm_wdt   ,
			String        max_hgt      ,
			String        zn_tp_cd1    ,
			String        zn_tp_cd2    ,
			String        zn_tp_cd3    ,
			String        rp_cd        ,
			String        drft_ut_cd   ,
			String        loa_ut_cd    ,
			String        bm_ut_cd     ,
			String        hgt_ut_cd    ,
			String        modi_port_cd ,
			String        cre_usr_id   ,
			String        cre_dt       ,
			String        upd_usr_id   ,
			String        upd_dt       ,
			String        delt_flg     ,
			String        eai_evnt_dt  ){
		this.ibflag        = ibflag       ;
		this.page_rows     = page_rows    ;
		this.port_cd       = port_cd      ;
		this.port_nm       = port_nm      ;
		this.port_altn_nm  = port_altn_nm ;
		this.port_lat      = port_lat     ;
		this.lat_ut_cd     = lat_ut_cd    ;
		this.port_lon      = port_lon     ;
		this.lon_ut_cd     = lon_ut_cd    ;
		this.ocn_cd        = ocn_cd       ;
		this.max_drft_dpth = max_drft_dpth;
		this.max_loa_wdt   = max_loa_wdt  ;
		this.max_bm_wdt    = max_bm_wdt   ;
		this.max_hgt       = max_hgt      ;
		this.zn_tp_cd1     = zn_tp_cd1    ;
		this.zn_tp_cd2     = zn_tp_cd2    ;
		this.zn_tp_cd3     = zn_tp_cd3    ;
		this.rp_cd         = rp_cd        ;
		this.drft_ut_cd    = drft_ut_cd   ;
		this.loa_ut_cd     = loa_ut_cd    ;
		this.bm_ut_cd      = bm_ut_cd     ;
		this.hgt_ut_cd     = hgt_ut_cd    ;
		this.modi_port_cd  = modi_port_cd ;
		this.cre_usr_id    = cre_usr_id   ;
		this.cre_dt        = cre_dt       ;
		this.upd_usr_id    = upd_usr_id   ;
		this.upd_dt        = upd_dt       ;
		this.delt_flg      = delt_flg     ;
		this.eai_evnt_dt   = eai_evnt_dt  ;
	}

	// getter method is proceeding ..
	public String        getIbflag       (){	return ibflag       	;	}
	public String        getPage_rows    (){	return page_rows    	;	}
	public String        getPort_cd      (){	return port_cd      	;	}
	public String        getPort_nm      (){	return port_nm      	;	}
	public String        getPort_altn_nm (){	return port_altn_nm 	;	}
	public String        getPort_lat     (){	return port_lat     	;	}
	public String        getLat_ut_cd    (){	return lat_ut_cd    	;	}
	public String        getPort_lon     (){	return port_lon     	;	}
	public String        getLon_ut_cd    (){	return lon_ut_cd    	;	}
	public String        getOcn_cd       (){	return ocn_cd       	;	}
	public String        getMax_drft_dpth(){	return max_drft_dpth	;	}
	public String        getMax_loa_wdt  (){	return max_loa_wdt  	;	}
	public String        getMax_bm_wdt   (){	return max_bm_wdt   	;	}
	public String        getMax_hgt      (){	return max_hgt      	;	}
	public String        getZn_tp_cd1    (){	return zn_tp_cd1    	;	}
	public String        getZn_tp_cd2    (){	return zn_tp_cd2    	;	}
	public String        getZn_tp_cd3    (){	return zn_tp_cd3    	;	}
	public String        getRp_cd        (){	return rp_cd        	;	}
	public String        getDrft_ut_cd   (){	return drft_ut_cd   	;	}
	public String        getLoa_ut_cd    (){	return loa_ut_cd    	;	}
	public String        getBm_ut_cd     (){	return bm_ut_cd     	;	}
	public String        getHgt_ut_cd    (){	return hgt_ut_cd    	;	}
	public String        getModi_port_cd (){	return modi_port_cd 	;	}
	public String        getCre_usr_id   (){	return cre_usr_id   	;	}
	public String        getCre_dt       (){	return cre_dt       	;	}
	public String        getUpd_usr_id   (){	return upd_usr_id   	;	}
	public String        getUpd_dt       (){	return upd_dt       	;	}
	public String        getDelt_flg     (){	return delt_flg     	;	}
	public String        getEai_evnt_dt  (){	return eai_evnt_dt  	;	}

	// setter method is proceeding ..
	public void setIbflag       ( String        ibflag        ){	this.ibflag        = ibflag       	;	}
	public void setPage_rows    ( String        page_rows     ){	this.page_rows     = page_rows    	;	}
	public void setPort_cd      ( String        port_cd       ){	this.port_cd       = port_cd      	;	}
	public void setPort_nm      ( String        port_nm       ){	this.port_nm       = port_nm      	;	}
	public void setPort_altn_nm ( String        port_altn_nm  ){	this.port_altn_nm  = port_altn_nm 	;	}
	public void setPort_lat     ( String        port_lat      ){	this.port_lat      = port_lat     	;	}
	public void setLat_ut_cd    ( String        lat_ut_cd     ){	this.lat_ut_cd     = lat_ut_cd    	;	}
	public void setPort_lon     ( String        port_lon      ){	this.port_lon      = port_lon     	;	}
	public void setLon_ut_cd    ( String        lon_ut_cd     ){	this.lon_ut_cd     = lon_ut_cd    	;	}
	public void setOcn_cd       ( String        ocn_cd        ){	this.ocn_cd        = ocn_cd       	;	}
	public void setMax_drft_dpth( String        max_drft_dpth ){	this.max_drft_dpth = max_drft_dpth	;	}
	public void setMax_loa_wdt  ( String        max_loa_wdt   ){	this.max_loa_wdt   = max_loa_wdt  	;	}
	public void setMax_bm_wdt   ( String        max_bm_wdt    ){	this.max_bm_wdt    = max_bm_wdt   	;	}
	public void setMax_hgt      ( String        max_hgt       ){	this.max_hgt       = max_hgt      	;	}
	public void setZn_tp_cd1    ( String        zn_tp_cd1     ){	this.zn_tp_cd1     = zn_tp_cd1    	;	}
	public void setZn_tp_cd2    ( String        zn_tp_cd2     ){	this.zn_tp_cd2     = zn_tp_cd2    	;	}
	public void setZn_tp_cd3    ( String        zn_tp_cd3     ){	this.zn_tp_cd3     = zn_tp_cd3    	;	}
	public void setRp_cd        ( String        rp_cd         ){	this.rp_cd         = rp_cd        	;	}
	public void setDrft_ut_cd   ( String        drft_ut_cd    ){	this.drft_ut_cd    = drft_ut_cd   	;	}
	public void setLoa_ut_cd    ( String        loa_ut_cd     ){	this.loa_ut_cd     = loa_ut_cd    	;	}
	public void setBm_ut_cd     ( String        bm_ut_cd      ){	this.bm_ut_cd      = bm_ut_cd     	;	}
	public void setHgt_ut_cd    ( String        hgt_ut_cd     ){	this.hgt_ut_cd     = hgt_ut_cd    	;	}
	public void setModi_port_cd ( String        modi_port_cd  ){	this.modi_port_cd  = modi_port_cd 	;	}
	public void setCre_usr_id   ( String        cre_usr_id    ){	this.cre_usr_id    = cre_usr_id   	;	}
	public void setCre_dt       ( String        cre_dt        ){	this.cre_dt        = cre_dt       	;	}
	public void setUpd_usr_id   ( String        upd_usr_id    ){	this.upd_usr_id    = upd_usr_id   	;	}
	public void setUpd_dt       ( String        upd_dt        ){	this.upd_dt        = upd_dt       	;	}
	public void setDelt_flg     ( String        delt_flg      ){	this.delt_flg      = delt_flg     	;	}
	public void setEai_evnt_dt  ( String        eai_evnt_dt   ){	this.eai_evnt_dt   = eai_evnt_dt  	;	}

	public static MdmPort fromRequest(HttpServletRequest request) {
		MdmPort model = new MdmPort();
		try {
			model.setIbflag       	(JSPUtil.getParameter(request, "ibflag       		".trim(), ""));
			model.setPage_rows    	(JSPUtil.getParameter(request, "page_rows    		".trim(), ""));
			model.setPort_cd      	(JSPUtil.getParameter(request, "port_cd      		".trim(), ""));
			model.setPort_nm      	(JSPUtil.getParameter(request, "port_nm      		".trim(), ""));
			model.setPort_altn_nm 	(JSPUtil.getParameter(request, "port_altn_nm 		".trim(), ""));
			model.setPort_lat     	(JSPUtil.getParameter(request, "port_lat     		".trim(), ""));
			model.setLat_ut_cd    	(JSPUtil.getParameter(request, "lat_ut_cd    		".trim(), ""));
			model.setPort_lon     	(JSPUtil.getParameter(request, "port_lon     		".trim(), ""));
			model.setLon_ut_cd    	(JSPUtil.getParameter(request, "lon_ut_cd    		".trim(), ""));
			model.setOcn_cd       	(JSPUtil.getParameter(request, "ocn_cd       		".trim(), ""));
			model.setMax_drft_dpth	(JSPUtil.getParameter(request, "max_drft_dpth		".trim(), ""));
			model.setMax_loa_wdt  	(JSPUtil.getParameter(request, "max_loa_wdt  		".trim(), ""));
			model.setMax_bm_wdt   	(JSPUtil.getParameter(request, "max_bm_wdt   		".trim(), ""));
			model.setMax_hgt      	(JSPUtil.getParameter(request, "max_hgt      		".trim(), ""));
			model.setZn_tp_cd1    	(JSPUtil.getParameter(request, "zn_tp_cd1    		".trim(), ""));
			model.setZn_tp_cd2    	(JSPUtil.getParameter(request, "zn_tp_cd2    		".trim(), ""));
			model.setZn_tp_cd3    	(JSPUtil.getParameter(request, "zn_tp_cd3    		".trim(), ""));
			model.setRp_cd        	(JSPUtil.getParameter(request, "rp_cd        		".trim(), ""));
			model.setDrft_ut_cd   	(JSPUtil.getParameter(request, "drft_ut_cd   		".trim(), ""));
			model.setLoa_ut_cd    	(JSPUtil.getParameter(request, "loa_ut_cd    		".trim(), ""));
			model.setBm_ut_cd     	(JSPUtil.getParameter(request, "bm_ut_cd     		".trim(), ""));
			model.setHgt_ut_cd    	(JSPUtil.getParameter(request, "hgt_ut_cd    		".trim(), ""));
			model.setModi_port_cd 	(JSPUtil.getParameter(request, "modi_port_cd 		".trim(), ""));
			model.setCre_usr_id   	(JSPUtil.getParameter(request, "cre_usr_id   		".trim(), ""));
			model.setCre_dt       	(JSPUtil.getParameter(request, "cre_dt       		".trim(), ""));
			model.setUpd_usr_id   	(JSPUtil.getParameter(request, "upd_usr_id   		".trim(), ""));
			model.setUpd_dt       	(JSPUtil.getParameter(request, "upd_dt       		".trim(), ""));
			model.setDelt_flg     	(JSPUtil.getParameter(request, "delt_flg     		".trim(), ""));
			model.setEai_evnt_dt  	(JSPUtil.getParameter(request, "eai_evnt_dt  		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		MdmPort model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag        =  (JSPUtil.getParameter(request, "ibflag       		".trim(), length));
			String[] page_rows     =  (JSPUtil.getParameter(request, "page_rows    		".trim(), length));
			String[] port_cd       =  (JSPUtil.getParameter(request, "port_cd      		".trim(), length));
			String[] port_nm       =  (JSPUtil.getParameter(request, "port_nm      		".trim(), length));
			String[] port_altn_nm  =  (JSPUtil.getParameter(request, "port_altn_nm 		".trim(), length));
			String[] port_lat      =  (JSPUtil.getParameter(request, "port_lat     		".trim(), length));
			String[] lat_ut_cd     =  (JSPUtil.getParameter(request, "lat_ut_cd    		".trim(), length));
			String[] port_lon      =  (JSPUtil.getParameter(request, "port_lon     		".trim(), length));
			String[] lon_ut_cd     =  (JSPUtil.getParameter(request, "lon_ut_cd    		".trim(), length));
			String[] ocn_cd        =  (JSPUtil.getParameter(request, "ocn_cd       		".trim(), length));
			String[] max_drft_dpth =  (JSPUtil.getParameter(request, "max_drft_dpth		".trim(), length));
			String[] max_loa_wdt   =  (JSPUtil.getParameter(request, "max_loa_wdt  		".trim(), length));
			String[] max_bm_wdt    =  (JSPUtil.getParameter(request, "max_bm_wdt   		".trim(), length));
			String[] max_hgt       =  (JSPUtil.getParameter(request, "max_hgt      		".trim(), length));
			String[] zn_tp_cd1     =  (JSPUtil.getParameter(request, "zn_tp_cd1    		".trim(), length));
			String[] zn_tp_cd2     =  (JSPUtil.getParameter(request, "zn_tp_cd2    		".trim(), length));
			String[] zn_tp_cd3     =  (JSPUtil.getParameter(request, "zn_tp_cd3    		".trim(), length));
			String[] rp_cd         =  (JSPUtil.getParameter(request, "rp_cd        		".trim(), length));
			String[] drft_ut_cd    =  (JSPUtil.getParameter(request, "drft_ut_cd   		".trim(), length));
			String[] loa_ut_cd     =  (JSPUtil.getParameter(request, "loa_ut_cd    		".trim(), length));
			String[] bm_ut_cd      =  (JSPUtil.getParameter(request, "bm_ut_cd     		".trim(), length));
			String[] hgt_ut_cd     =  (JSPUtil.getParameter(request, "hgt_ut_cd    		".trim(), length));
			String[] modi_port_cd  =  (JSPUtil.getParameter(request, "modi_port_cd 		".trim(), length));
			String[] cre_usr_id    =  (JSPUtil.getParameter(request, "cre_usr_id   		".trim(), length));
			String[] cre_dt        =  (JSPUtil.getParameter(request, "cre_dt       		".trim(), length));
			String[] upd_usr_id    =  (JSPUtil.getParameter(request, "upd_usr_id   		".trim(), length));
			String[] upd_dt        =  (JSPUtil.getParameter(request, "upd_dt       		".trim(), length));
			String[] delt_flg      =  (JSPUtil.getParameter(request, "delt_flg     		".trim(), length));
			String[] eai_evnt_dt   =  (JSPUtil.getParameter(request, "eai_evnt_dt  		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new MdmPort();
				model.setIbflag       		  (ibflag       	[i]);
				model.setPage_rows    		  (page_rows    	[i]);
				model.setPort_cd      		  (port_cd      	[i]);
				model.setPort_nm      		  (port_nm      	[i]);
				model.setPort_altn_nm 		  (port_altn_nm 	[i]);
				model.setPort_lat     		  (port_lat     	[i]);
				model.setLat_ut_cd    		  (lat_ut_cd    	[i]);
				model.setPort_lon     		  (port_lon     	[i]);
				model.setLon_ut_cd    		  (lon_ut_cd    	[i]);
				model.setOcn_cd       		  (ocn_cd       	[i]);
				model.setMax_drft_dpth		  (max_drft_dpth	[i]);
				model.setMax_loa_wdt  		  (max_loa_wdt  	[i]);
				model.setMax_bm_wdt   		  (max_bm_wdt   	[i]);
				model.setMax_hgt      		  (max_hgt      	[i]);
				model.setZn_tp_cd1    		  (zn_tp_cd1    	[i]);
				model.setZn_tp_cd2    		  (zn_tp_cd2    	[i]);
				model.setZn_tp_cd3    		  (zn_tp_cd3    	[i]);
				model.setRp_cd        		  (rp_cd        	[i]);
				model.setDrft_ut_cd   		  (drft_ut_cd   	[i]);
				model.setLoa_ut_cd    		  (loa_ut_cd    	[i]);
				model.setBm_ut_cd     		  (bm_ut_cd     	[i]);
				model.setHgt_ut_cd    		  (hgt_ut_cd    	[i]);
				model.setModi_port_cd 		  (modi_port_cd 	[i]);
				model.setCre_usr_id   		  (cre_usr_id   	[i]);
				model.setCre_dt       		  (cre_dt       	[i]);
				model.setUpd_usr_id   		  (upd_usr_id   	[i]);
				model.setUpd_dt       		  (upd_dt       	[i]);
				model.setDelt_flg     		  (delt_flg     	[i]);
				model.setEai_evnt_dt  		  (eai_evnt_dt  	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		MdmPort model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag        =  (JSPUtil.getParameter(request, prefix + "ibflag       		".trim(), length));
			String[] page_rows     =  (JSPUtil.getParameter(request, prefix + "page_rows    		".trim(), length));
			String[] port_cd       =  (JSPUtil.getParameter(request, prefix + "port_cd      		".trim(), length));
			String[] port_nm       =  (JSPUtil.getParameter(request, prefix + "port_nm      		".trim(), length));
			String[] port_altn_nm  =  (JSPUtil.getParameter(request, prefix + "port_altn_nm 		".trim(), length));
			String[] port_lat      =  (JSPUtil.getParameter(request, prefix + "port_lat     		".trim(), length));
			String[] lat_ut_cd     =  (JSPUtil.getParameter(request, prefix + "lat_ut_cd    		".trim(), length));
			String[] port_lon      =  (JSPUtil.getParameter(request, prefix + "port_lon     		".trim(), length));
			String[] lon_ut_cd     =  (JSPUtil.getParameter(request, prefix + "lon_ut_cd    		".trim(), length));
			String[] ocn_cd        =  (JSPUtil.getParameter(request, prefix + "ocn_cd       		".trim(), length));
			String[] max_drft_dpth =  (JSPUtil.getParameter(request, prefix + "max_drft_dpth		".trim(), length));
			String[] max_loa_wdt   =  (JSPUtil.getParameter(request, prefix + "max_loa_wdt  		".trim(), length));
			String[] max_bm_wdt    =  (JSPUtil.getParameter(request, prefix + "max_bm_wdt   		".trim(), length));
			String[] max_hgt       =  (JSPUtil.getParameter(request, prefix + "max_hgt      		".trim(), length));
			String[] zn_tp_cd1     =  (JSPUtil.getParameter(request, prefix + "zn_tp_cd1    		".trim(), length));
			String[] zn_tp_cd2     =  (JSPUtil.getParameter(request, prefix + "zn_tp_cd2    		".trim(), length));
			String[] zn_tp_cd3     =  (JSPUtil.getParameter(request, prefix + "zn_tp_cd3    		".trim(), length));
			String[] rp_cd         =  (JSPUtil.getParameter(request, prefix + "rp_cd        		".trim(), length));
			String[] drft_ut_cd    =  (JSPUtil.getParameter(request, prefix + "drft_ut_cd   		".trim(), length));
			String[] loa_ut_cd     =  (JSPUtil.getParameter(request, prefix + "loa_ut_cd    		".trim(), length));
			String[] bm_ut_cd      =  (JSPUtil.getParameter(request, prefix + "bm_ut_cd     		".trim(), length));
			String[] hgt_ut_cd     =  (JSPUtil.getParameter(request, prefix + "hgt_ut_cd    		".trim(), length));
			String[] modi_port_cd  =  (JSPUtil.getParameter(request, prefix + "modi_port_cd 		".trim(), length));
			String[] cre_usr_id    =  (JSPUtil.getParameter(request, prefix + "cre_usr_id   		".trim(), length));
			String[] cre_dt        =  (JSPUtil.getParameter(request, prefix + "cre_dt       		".trim(), length));
			String[] upd_usr_id    =  (JSPUtil.getParameter(request, prefix + "upd_usr_id   		".trim(), length));
			String[] upd_dt        =  (JSPUtil.getParameter(request, prefix + "upd_dt       		".trim(), length));
			String[] delt_flg      =  (JSPUtil.getParameter(request, prefix + "delt_flg     		".trim(), length));
			String[] eai_evnt_dt   =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt  		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new MdmPort();
				model.setIbflag       		  ( ibflag       	[i]);
				model.setPage_rows    		  ( page_rows    	[i]);
				model.setPort_cd      		  ( port_cd      	[i]);
				model.setPort_nm      		  ( port_nm      	[i]);
				model.setPort_altn_nm 		  ( port_altn_nm 	[i]);
				model.setPort_lat     		  ( port_lat     	[i]);
				model.setLat_ut_cd    		  ( lat_ut_cd    	[i]);
				model.setPort_lon     		  ( port_lon     	[i]);
				model.setLon_ut_cd    		  ( lon_ut_cd    	[i]);
				model.setOcn_cd       		  ( ocn_cd       	[i]);
				model.setMax_drft_dpth		  ( max_drft_dpth	[i]);
				model.setMax_loa_wdt  		  ( max_loa_wdt  	[i]);
				model.setMax_bm_wdt   		  ( max_bm_wdt   	[i]);
				model.setMax_hgt      		  ( max_hgt      	[i]);
				model.setZn_tp_cd1    		  ( zn_tp_cd1    	[i]);
				model.setZn_tp_cd2    		  ( zn_tp_cd2    	[i]);
				model.setZn_tp_cd3    		  ( zn_tp_cd3    	[i]);
				model.setRp_cd        		  ( rp_cd        	[i]);
				model.setDrft_ut_cd   		  ( drft_ut_cd   	[i]);
				model.setLoa_ut_cd    		  ( loa_ut_cd    	[i]);
				model.setBm_ut_cd     		  ( bm_ut_cd     	[i]);
				model.setHgt_ut_cd    		  ( hgt_ut_cd    	[i]);
				model.setModi_port_cd 		  ( modi_port_cd 	[i]);
				model.setCre_usr_id   		  ( cre_usr_id   	[i]);
				model.setCre_dt       		  ( cre_dt       	[i]);
				model.setUpd_usr_id   		  ( upd_usr_id   	[i]);
				model.setUpd_dt       		  ( upd_dt       	[i]);
				model.setDelt_flg     		  ( delt_flg     	[i]);
				model.setEai_evnt_dt  		  ( eai_evnt_dt  	[i]);
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
