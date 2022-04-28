/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : BKG_RF_CGO.java
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
public final class BKG_RF_CGO implements java.io.Serializable {

	private String                   ibflag                   = "";
	private String                   page_rows                = "";
	private String                   bkg_no                   = "";
	private String                   bkg_no_split             = "";
	private String                   rc_seq                   = "";
	private String                   cntr_no                  = "";
	private String                   cntr_tpsz_cd             = "";
	private String                   new_ctrl_atms_flg        = "";
	private String                   new_modi_atms_flg        = "";
	private String                   new_humid_flg            = "";
	private String                   cmdt_cd                  = "";
	private String                   cgo_ntr_cd               = "";
	private String                   fdo_temp                 = "";
	private String                   cdo_temp                 = "";
	private String                   rf_humid                 = "";
	private String                   new_vent_no              = "";
	private String                   new_uusd_vent_no         = "";
	private String                   pck_qty                  = "";
	private String                   pck_cd                   = "";
	private String                   grs_wgt_tp_cd            = "";
	private String                   grs_wgt                  = "";
	private String                   net_wgt_tp_cd            = "";
	private String                   net_wgt                  = "";
	private String                   new_drn_cgo_no           = "";
	private String                   mgst_pwr_spl_cbl_add_flg = "";
	private String                   rf_vltg_pwr              = "";
	private String                   rc_rmk                   = "";
	private String                   rf_vent_tp_cd            = "";
	private String                   eai_evnt_dt              = "";

	public BKG_RF_CGO(){}

	public BKG_RF_CGO(
			String                   ibflag                  ,
			String                   page_rows               ,
			String                   bkg_no                  ,
			String                   bkg_no_split            ,
			String                   rc_seq                  ,
			String                   cntr_no                 ,
			String                   cntr_tpsz_cd            ,
			String                   new_ctrl_atms_flg       ,
			String                   new_modi_atms_flg       ,
			String                   new_humid_flg           ,
			String                   cmdt_cd                 ,
			String                   cgo_ntr_cd              ,
			String                   fdo_temp                ,
			String                   cdo_temp                ,
			String                   rf_humid                ,
			String                   new_vent_no             ,
			String                   new_uusd_vent_no        ,
			String                   pck_qty                 ,
			String                   pck_cd                  ,
			String                   grs_wgt_tp_cd           ,
			String                   grs_wgt                 ,
			String                   net_wgt_tp_cd           ,
			String                   net_wgt                 ,
			String                   new_drn_cgo_no          ,
			String                   mgst_pwr_spl_cbl_add_flg,
			String                   rf_vltg_pwr             ,
			String                   rc_rmk                  ,
			String                   rf_vent_tp_cd           ,
			String                   eai_evnt_dt             ){
		this.ibflag                   = ibflag                  ;
		this.page_rows                = page_rows               ;
		this.bkg_no                   = bkg_no                  ;
		this.bkg_no_split             = bkg_no_split            ;
		this.rc_seq                   = rc_seq                  ;
		this.cntr_no                  = cntr_no                 ;
		this.cntr_tpsz_cd             = cntr_tpsz_cd            ;
		this.new_ctrl_atms_flg        = new_ctrl_atms_flg       ;
		this.new_modi_atms_flg        = new_modi_atms_flg       ;
		this.new_humid_flg            = new_humid_flg           ;
		this.cmdt_cd                  = cmdt_cd                 ;
		this.cgo_ntr_cd               = cgo_ntr_cd              ;
		this.fdo_temp                 = fdo_temp                ;
		this.cdo_temp                 = cdo_temp                ;
		this.rf_humid                 = rf_humid                ;
		this.new_vent_no              = new_vent_no             ;
		this.new_uusd_vent_no         = new_uusd_vent_no        ;
		this.pck_qty                  = pck_qty                 ;
		this.pck_cd                   = pck_cd                  ;
		this.grs_wgt_tp_cd            = grs_wgt_tp_cd           ;
		this.grs_wgt                  = grs_wgt                 ;
		this.net_wgt_tp_cd            = net_wgt_tp_cd           ;
		this.net_wgt                  = net_wgt                 ;
		this.new_drn_cgo_no           = new_drn_cgo_no          ;
		this.mgst_pwr_spl_cbl_add_flg = mgst_pwr_spl_cbl_add_flg;
		this.rf_vltg_pwr              = rf_vltg_pwr             ;
		this.rc_rmk                   = rc_rmk                  ;
		this.rf_vent_tp_cd            = rf_vent_tp_cd           ;
		this.eai_evnt_dt              = eai_evnt_dt             ;
	}

	// getter method is proceeding ..
	public String                   getIbflag                  (){	return ibflag                  	;	}
	public String                   getPage_rows               (){	return page_rows               	;	}
	public String                   getBkg_no                  (){	return bkg_no                  	;	}
	public String                   getBkg_no_split            (){	return bkg_no_split            	;	}
	public String                   getRc_seq                  (){	return rc_seq                  	;	}
	public String                   getCntr_no                 (){	return cntr_no                 	;	}
	public String                   getCntr_tpsz_cd            (){	return cntr_tpsz_cd            	;	}
	public String                   getNew_ctrl_atms_flg       (){	return new_ctrl_atms_flg       	;	}
	public String                   getNew_modi_atms_flg       (){	return new_modi_atms_flg       	;	}
	public String                   getNew_humid_flg           (){	return new_humid_flg           	;	}
	public String                   getCmdt_cd                 (){	return cmdt_cd                 	;	}
	public String                   getCgo_ntr_cd              (){	return cgo_ntr_cd              	;	}
	public String                   getFdo_temp                (){	return fdo_temp                	;	}
	public String                   getCdo_temp                (){	return cdo_temp                	;	}
	public String                   getRf_humid                (){	return rf_humid                	;	}
	public String                   getNew_vent_no             (){	return new_vent_no             	;	}
	public String                   getNew_uusd_vent_no        (){	return new_uusd_vent_no        	;	}
	public String                   getPck_qty                 (){	return pck_qty                 	;	}
	public String                   getPck_cd                  (){	return pck_cd                  	;	}
	public String                   getGrs_wgt_tp_cd           (){	return grs_wgt_tp_cd           	;	}
	public String                   getGrs_wgt                 (){	return grs_wgt                 	;	}
	public String                   getNet_wgt_tp_cd           (){	return net_wgt_tp_cd           	;	}
	public String                   getNet_wgt                 (){	return net_wgt                 	;	}
	public String                   getNew_drn_cgo_no          (){	return new_drn_cgo_no          	;	}
	public String                   getMgst_pwr_spl_cbl_add_flg(){	return mgst_pwr_spl_cbl_add_flg	;	}
	public String                   getRf_vltg_pwr             (){	return rf_vltg_pwr             	;	}
	public String                   getRc_rmk                  (){	return rc_rmk                  	;	}
	public String                   getRf_vent_tp_cd           (){	return rf_vent_tp_cd           	;	}
	public String                   getEai_evnt_dt             (){	return eai_evnt_dt             	;	}

	// setter method is proceeding ..
	public void setIbflag                  ( String                   ibflag                   ){	this.ibflag                   = ibflag                  	;	}
	public void setPage_rows               ( String                   page_rows                ){	this.page_rows                = page_rows               	;	}
	public void setBkg_no                  ( String                   bkg_no                   ){	this.bkg_no                   = bkg_no                  	;	}
	public void setBkg_no_split            ( String                   bkg_no_split             ){	this.bkg_no_split             = bkg_no_split            	;	}
	public void setRc_seq                  ( String                   rc_seq                   ){	this.rc_seq                   = rc_seq                  	;	}
	public void setCntr_no                 ( String                   cntr_no                  ){	this.cntr_no                  = cntr_no                 	;	}
	public void setCntr_tpsz_cd            ( String                   cntr_tpsz_cd             ){	this.cntr_tpsz_cd             = cntr_tpsz_cd            	;	}
	public void setNew_ctrl_atms_flg       ( String                   new_ctrl_atms_flg        ){	this.new_ctrl_atms_flg        = new_ctrl_atms_flg       	;	}
	public void setNew_modi_atms_flg       ( String                   new_modi_atms_flg        ){	this.new_modi_atms_flg        = new_modi_atms_flg       	;	}
	public void setNew_humid_flg           ( String                   new_humid_flg            ){	this.new_humid_flg            = new_humid_flg           	;	}
	public void setCmdt_cd                 ( String                   cmdt_cd                  ){	this.cmdt_cd                  = cmdt_cd                 	;	}
	public void setCgo_ntr_cd              ( String                   cgo_ntr_cd               ){	this.cgo_ntr_cd               = cgo_ntr_cd              	;	}
	public void setFdo_temp                ( String                   fdo_temp                 ){	this.fdo_temp                 = fdo_temp                	;	}
	public void setCdo_temp                ( String                   cdo_temp                 ){	this.cdo_temp                 = cdo_temp                	;	}
	public void setRf_humid                ( String                   rf_humid                 ){	this.rf_humid                 = rf_humid                	;	}
	public void setNew_vent_no             ( String                   new_vent_no              ){	this.new_vent_no              = new_vent_no             	;	}
	public void setNew_uusd_vent_no        ( String                   new_uusd_vent_no         ){	this.new_uusd_vent_no         = new_uusd_vent_no        	;	}
	public void setPck_qty                 ( String                   pck_qty                  ){	this.pck_qty                  = pck_qty                 	;	}
	public void setPck_cd                  ( String                   pck_cd                   ){	this.pck_cd                   = pck_cd                  	;	}
	public void setGrs_wgt_tp_cd           ( String                   grs_wgt_tp_cd            ){	this.grs_wgt_tp_cd            = grs_wgt_tp_cd           	;	}
	public void setGrs_wgt                 ( String                   grs_wgt                  ){	this.grs_wgt                  = grs_wgt                 	;	}
	public void setNet_wgt_tp_cd           ( String                   net_wgt_tp_cd            ){	this.net_wgt_tp_cd            = net_wgt_tp_cd           	;	}
	public void setNet_wgt                 ( String                   net_wgt                  ){	this.net_wgt                  = net_wgt                 	;	}
	public void setNew_drn_cgo_no          ( String                   new_drn_cgo_no           ){	this.new_drn_cgo_no           = new_drn_cgo_no          	;	}
	public void setMgst_pwr_spl_cbl_add_flg( String                   mgst_pwr_spl_cbl_add_flg ){	this.mgst_pwr_spl_cbl_add_flg = mgst_pwr_spl_cbl_add_flg	;	}
	public void setRf_vltg_pwr             ( String                   rf_vltg_pwr              ){	this.rf_vltg_pwr              = rf_vltg_pwr             	;	}
	public void setRc_rmk                  ( String                   rc_rmk                   ){	this.rc_rmk                   = rc_rmk                  	;	}
	public void setRf_vent_tp_cd           ( String                   rf_vent_tp_cd            ){	this.rf_vent_tp_cd            = rf_vent_tp_cd           	;	}
	public void setEai_evnt_dt             ( String                   eai_evnt_dt              ){	this.eai_evnt_dt              = eai_evnt_dt             	;	}

	public static BKG_RF_CGO fromRequest(HttpServletRequest request) {
		BKG_RF_CGO model = new BKG_RF_CGO();
		try {
			model.setIbflag                  	(JSPUtil.getParameter(request, "ibflag                  		".trim(), ""));
			model.setPage_rows               	(JSPUtil.getParameter(request, "page_rows               		".trim(), ""));
			model.setBkg_no                  	(JSPUtil.getParameter(request, "bkg_no                  		".trim(), ""));
			model.setBkg_no_split            	(JSPUtil.getParameter(request, "bkg_no_split            		".trim(), ""));
			model.setRc_seq                  	(JSPUtil.getParameter(request, "rc_seq                  		".trim(), ""));
			model.setCntr_no                 	(JSPUtil.getParameter(request, "cntr_no                 		".trim(), ""));
			model.setCntr_tpsz_cd            	(JSPUtil.getParameter(request, "cntr_tpsz_cd            		".trim(), ""));
			model.setNew_ctrl_atms_flg       	(JSPUtil.getParameter(request, "new_ctrl_atms_flg       		".trim(), ""));
			model.setNew_modi_atms_flg       	(JSPUtil.getParameter(request, "new_modi_atms_flg       		".trim(), ""));
			model.setNew_humid_flg           	(JSPUtil.getParameter(request, "new_humid_flg           		".trim(), ""));
			model.setCmdt_cd                 	(JSPUtil.getParameter(request, "cmdt_cd                 		".trim(), ""));
			model.setCgo_ntr_cd              	(JSPUtil.getParameter(request, "cgo_ntr_cd              		".trim(), ""));
			model.setFdo_temp                	(JSPUtil.getParameter(request, "fdo_temp                		".trim(), ""));
			model.setCdo_temp                	(JSPUtil.getParameter(request, "cdo_temp                		".trim(), ""));
			model.setRf_humid                	(JSPUtil.getParameter(request, "rf_humid                		".trim(), ""));
			model.setNew_vent_no             	(JSPUtil.getParameter(request, "new_vent_no             		".trim(), ""));
			model.setNew_uusd_vent_no        	(JSPUtil.getParameter(request, "new_uusd_vent_no        		".trim(), ""));
			model.setPck_qty                 	(JSPUtil.getParameter(request, "pck_qty                 		".trim(), ""));
			model.setPck_cd                  	(JSPUtil.getParameter(request, "pck_cd                  		".trim(), ""));
			model.setGrs_wgt_tp_cd           	(JSPUtil.getParameter(request, "grs_wgt_tp_cd           		".trim(), ""));
			model.setGrs_wgt                 	(JSPUtil.getParameter(request, "grs_wgt                 		".trim(), ""));
			model.setNet_wgt_tp_cd           	(JSPUtil.getParameter(request, "net_wgt_tp_cd           		".trim(), ""));
			model.setNet_wgt                 	(JSPUtil.getParameter(request, "net_wgt                 		".trim(), ""));
			model.setNew_drn_cgo_no          	(JSPUtil.getParameter(request, "new_drn_cgo_no          		".trim(), ""));
			model.setMgst_pwr_spl_cbl_add_flg	(JSPUtil.getParameter(request, "mgst_pwr_spl_cbl_add_flg		".trim(), ""));
			model.setRf_vltg_pwr             	(JSPUtil.getParameter(request, "rf_vltg_pwr             		".trim(), ""));
			model.setRc_rmk                  	(JSPUtil.getParameter(request, "rc_rmk                  		".trim(), ""));
			model.setRf_vent_tp_cd           	(JSPUtil.getParameter(request, "rf_vent_tp_cd           		".trim(), ""));
			model.setEai_evnt_dt             	(JSPUtil.getParameter(request, "eai_evnt_dt             		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		BKG_RF_CGO model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag                   =  (JSPUtil.getParameter(request, "ibflag                  		".trim(), length));
			String[] page_rows                =  (JSPUtil.getParameter(request, "page_rows               		".trim(), length));
			String[] bkg_no                   =  (JSPUtil.getParameter(request, "bkg_no                  		".trim(), length));
			String[] bkg_no_split             =  (JSPUtil.getParameter(request, "bkg_no_split            		".trim(), length));
			String[] rc_seq                   =  (JSPUtil.getParameter(request, "rc_seq                  		".trim(), length));
			String[] cntr_no                  =  (JSPUtil.getParameter(request, "cntr_no                 		".trim(), length));
			String[] cntr_tpsz_cd             =  (JSPUtil.getParameter(request, "cntr_tpsz_cd            		".trim(), length));
			String[] new_ctrl_atms_flg        =  (JSPUtil.getParameter(request, "new_ctrl_atms_flg       		".trim(), length));
			String[] new_modi_atms_flg        =  (JSPUtil.getParameter(request, "new_modi_atms_flg       		".trim(), length));
			String[] new_humid_flg            =  (JSPUtil.getParameter(request, "new_humid_flg           		".trim(), length));
			String[] cmdt_cd                  =  (JSPUtil.getParameter(request, "cmdt_cd                 		".trim(), length));
			String[] cgo_ntr_cd               =  (JSPUtil.getParameter(request, "cgo_ntr_cd              		".trim(), length));
			String[] fdo_temp                 =  (JSPUtil.getParameter(request, "fdo_temp                		".trim(), length));
			String[] cdo_temp                 =  (JSPUtil.getParameter(request, "cdo_temp                		".trim(), length));
			String[] rf_humid                 =  (JSPUtil.getParameter(request, "rf_humid                		".trim(), length));
			String[] new_vent_no              =  (JSPUtil.getParameter(request, "new_vent_no             		".trim(), length));
			String[] new_uusd_vent_no         =  (JSPUtil.getParameter(request, "new_uusd_vent_no        		".trim(), length));
			String[] pck_qty                  =  (JSPUtil.getParameter(request, "pck_qty                 		".trim(), length));
			String[] pck_cd                   =  (JSPUtil.getParameter(request, "pck_cd                  		".trim(), length));
			String[] grs_wgt_tp_cd            =  (JSPUtil.getParameter(request, "grs_wgt_tp_cd           		".trim(), length));
			String[] grs_wgt                  =  (JSPUtil.getParameter(request, "grs_wgt                 		".trim(), length));
			String[] net_wgt_tp_cd            =  (JSPUtil.getParameter(request, "net_wgt_tp_cd           		".trim(), length));
			String[] net_wgt                  =  (JSPUtil.getParameter(request, "net_wgt                 		".trim(), length));
			String[] new_drn_cgo_no           =  (JSPUtil.getParameter(request, "new_drn_cgo_no          		".trim(), length));
			String[] mgst_pwr_spl_cbl_add_flg =  (JSPUtil.getParameter(request, "mgst_pwr_spl_cbl_add_flg		".trim(), length));
			String[] rf_vltg_pwr              =  (JSPUtil.getParameter(request, "rf_vltg_pwr             		".trim(), length));
			String[] rc_rmk                   =  (JSPUtil.getParameter(request, "rc_rmk                  		".trim(), length));
			String[] rf_vent_tp_cd            =  (JSPUtil.getParameter(request, "rf_vent_tp_cd           		".trim(), length));
			String[] eai_evnt_dt              =  (JSPUtil.getParameter(request, "eai_evnt_dt             		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new BKG_RF_CGO();
				model.setIbflag                  		  (ibflag                  	[i]);
				model.setPage_rows               		  (page_rows               	[i]);
				model.setBkg_no                  		  (bkg_no                  	[i]);
				model.setBkg_no_split            		  (bkg_no_split            	[i]);
				model.setRc_seq                  		  (rc_seq                  	[i]);
				model.setCntr_no                 		  (cntr_no                 	[i]);
				model.setCntr_tpsz_cd            		  (cntr_tpsz_cd            	[i]);
				model.setNew_ctrl_atms_flg       		  (new_ctrl_atms_flg       	[i]);
				model.setNew_modi_atms_flg       		  (new_modi_atms_flg       	[i]);
				model.setNew_humid_flg           		  (new_humid_flg           	[i]);
				model.setCmdt_cd                 		  (cmdt_cd                 	[i]);
				model.setCgo_ntr_cd              		  (cgo_ntr_cd              	[i]);
				model.setFdo_temp                		  (fdo_temp                	[i]);
				model.setCdo_temp                		  (cdo_temp                	[i]);
				model.setRf_humid                		  (rf_humid                	[i]);
				model.setNew_vent_no             		  (new_vent_no             	[i]);
				model.setNew_uusd_vent_no        		  (new_uusd_vent_no        	[i]);
				model.setPck_qty                 		  (pck_qty                 	[i]);
				model.setPck_cd                  		  (pck_cd                  	[i]);
				model.setGrs_wgt_tp_cd           		  (grs_wgt_tp_cd           	[i]);
				model.setGrs_wgt                 		  (grs_wgt                 	[i]);
				model.setNet_wgt_tp_cd           		  (net_wgt_tp_cd           	[i]);
				model.setNet_wgt                 		  (net_wgt                 	[i]);
				model.setNew_drn_cgo_no          		  (new_drn_cgo_no          	[i]);
				model.setMgst_pwr_spl_cbl_add_flg		  (mgst_pwr_spl_cbl_add_flg	[i]);
				model.setRf_vltg_pwr             		  (rf_vltg_pwr             	[i]);
				model.setRc_rmk                  		  (rc_rmk                  	[i]);
				model.setRf_vent_tp_cd           		  (rf_vent_tp_cd           	[i]);
				model.setEai_evnt_dt             		  (eai_evnt_dt             	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		BKG_RF_CGO model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag                   =  (JSPUtil.getParameter(request, prefix + "ibflag                  		".trim(), length));
			String[] page_rows                =  (JSPUtil.getParameter(request, prefix + "page_rows               		".trim(), length));
			String[] bkg_no                   =  (JSPUtil.getParameter(request, prefix + "bkg_no                  		".trim(), length));
			String[] bkg_no_split             =  (JSPUtil.getParameter(request, prefix + "bkg_no_split            		".trim(), length));
			String[] rc_seq                   =  (JSPUtil.getParameter(request, prefix + "rc_seq                  		".trim(), length));
			String[] cntr_no                  =  (JSPUtil.getParameter(request, prefix + "cntr_no                 		".trim(), length));
			String[] cntr_tpsz_cd             =  (JSPUtil.getParameter(request, prefix + "cntr_tpsz_cd            		".trim(), length));
			String[] new_ctrl_atms_flg        =  (JSPUtil.getParameter(request, prefix + "new_ctrl_atms_flg       		".trim(), length));
			String[] new_modi_atms_flg        =  (JSPUtil.getParameter(request, prefix + "new_modi_atms_flg       		".trim(), length));
			String[] new_humid_flg            =  (JSPUtil.getParameter(request, prefix + "new_humid_flg           		".trim(), length));
			String[] cmdt_cd                  =  (JSPUtil.getParameter(request, prefix + "cmdt_cd                 		".trim(), length));
			String[] cgo_ntr_cd               =  (JSPUtil.getParameter(request, prefix + "cgo_ntr_cd              		".trim(), length));
			String[] fdo_temp                 =  (JSPUtil.getParameter(request, prefix + "fdo_temp                		".trim(), length));
			String[] cdo_temp                 =  (JSPUtil.getParameter(request, prefix + "cdo_temp                		".trim(), length));
			String[] rf_humid                 =  (JSPUtil.getParameter(request, prefix + "rf_humid                		".trim(), length));
			String[] new_vent_no              =  (JSPUtil.getParameter(request, prefix + "new_vent_no             		".trim(), length));
			String[] new_uusd_vent_no         =  (JSPUtil.getParameter(request, prefix + "new_uusd_vent_no        		".trim(), length));
			String[] pck_qty                  =  (JSPUtil.getParameter(request, prefix + "pck_qty                 		".trim(), length));
			String[] pck_cd                   =  (JSPUtil.getParameter(request, prefix + "pck_cd                  		".trim(), length));
			String[] grs_wgt_tp_cd            =  (JSPUtil.getParameter(request, prefix + "grs_wgt_tp_cd           		".trim(), length));
			String[] grs_wgt                  =  (JSPUtil.getParameter(request, prefix + "grs_wgt                 		".trim(), length));
			String[] net_wgt_tp_cd            =  (JSPUtil.getParameter(request, prefix + "net_wgt_tp_cd           		".trim(), length));
			String[] net_wgt                  =  (JSPUtil.getParameter(request, prefix + "net_wgt                 		".trim(), length));
			String[] new_drn_cgo_no           =  (JSPUtil.getParameter(request, prefix + "new_drn_cgo_no          		".trim(), length));
			String[] mgst_pwr_spl_cbl_add_flg =  (JSPUtil.getParameter(request, prefix + "mgst_pwr_spl_cbl_add_flg		".trim(), length));
			String[] rf_vltg_pwr              =  (JSPUtil.getParameter(request, prefix + "rf_vltg_pwr             		".trim(), length));
			String[] rc_rmk                   =  (JSPUtil.getParameter(request, prefix + "rc_rmk                  		".trim(), length));
			String[] rf_vent_tp_cd            =  (JSPUtil.getParameter(request, prefix + "rf_vent_tp_cd           		".trim(), length));
			String[] eai_evnt_dt              =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt             		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new BKG_RF_CGO();
				model.setIbflag                  		  ( ibflag                  	[i]);
				model.setPage_rows               		  ( page_rows               	[i]);
				model.setBkg_no                  		  ( bkg_no                  	[i]);
				model.setBkg_no_split            		  ( bkg_no_split            	[i]);
				model.setRc_seq                  		  ( rc_seq                  	[i]);
				model.setCntr_no                 		  ( cntr_no                 	[i]);
				model.setCntr_tpsz_cd            		  ( cntr_tpsz_cd            	[i]);
				model.setNew_ctrl_atms_flg       		  ( new_ctrl_atms_flg       	[i]);
				model.setNew_modi_atms_flg       		  ( new_modi_atms_flg       	[i]);
				model.setNew_humid_flg           		  ( new_humid_flg           	[i]);
				model.setCmdt_cd                 		  ( cmdt_cd                 	[i]);
				model.setCgo_ntr_cd              		  ( cgo_ntr_cd              	[i]);
				model.setFdo_temp                		  ( fdo_temp                	[i]);
				model.setCdo_temp                		  ( cdo_temp                	[i]);
				model.setRf_humid                		  ( rf_humid                	[i]);
				model.setNew_vent_no             		  ( new_vent_no             	[i]);
				model.setNew_uusd_vent_no        		  ( new_uusd_vent_no        	[i]);
				model.setPck_qty                 		  ( pck_qty                 	[i]);
				model.setPck_cd                  		  ( pck_cd                  	[i]);
				model.setGrs_wgt_tp_cd           		  ( grs_wgt_tp_cd           	[i]);
				model.setGrs_wgt                 		  ( grs_wgt                 	[i]);
				model.setNet_wgt_tp_cd           		  ( net_wgt_tp_cd           	[i]);
				model.setNet_wgt                 		  ( net_wgt                 	[i]);
				model.setNew_drn_cgo_no          		  ( new_drn_cgo_no          	[i]);
				model.setMgst_pwr_spl_cbl_add_flg		  ( mgst_pwr_spl_cbl_add_flg	[i]);
				model.setRf_vltg_pwr             		  ( rf_vltg_pwr             	[i]);
				model.setRc_rmk                  		  ( rc_rmk                  	[i]);
				model.setRf_vent_tp_cd           		  ( rf_vent_tp_cd           	[i]);
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
