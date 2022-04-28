/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : TRS_EDI_NOD.java
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
public final class TrsEdiNodVO implements java.io.Serializable {

	private String                         ibflag                         = "";
	private String                         page_rows                      = "";
	private String                         edi_nod_cd                     = "";
	private String                         edi_nod_tp_cd                  = "";
	private String                         edi_nod_rcv_id                 = "";
	private String                         edi_nod_n1st_slan_cd           = "";
	private String                         edi_nod_n2nd_slan_cd           = "";
	private String                         edi_nod_n3rd_slan_cd           = "";
	private String                         edi_nod_n4th_slan_cd           = "";
	private String                         edi_nod_n5th_slan_cd           = "";
	private String                         edi_nod_n6th_slan_cd           = "";
	private String                         edi_nod_n7th_slan_cd           = "";
	private String                         edi_nod_n8th_slan_cd           = "";
	private String                         edi_nod_n9th_slan_cd           = "";
	private String                         edi_nod_n10th_slan_cd          = "";
	private String                         edi_nod_port_cd                = "";
	private String                         edi_nod_bkg_auto_edi_ind_cd    = "";
	private String                         edi_nod_mty_rlse_edi_ind_cd    = "";
	private String                         edi_nod_edi_snd_id             = "";
	private String                         edi_nod_fcgo_ind_cd            = "";
	private String                         edi_nod_mty_auto_edi_ind_cd    = "";
	private String                         edi_nod_bkg_mnl_edi_ind_cd     = "";
	private String                         edi_nod_tz_cgo_edi_n1st_ind_cd = "";
	private String                         edi_nod_tz_cgo_edi_n2nd_ind_cd = "";
	private String                         eai_evnt_dt                    = "";

	public TrsEdiNodVO(){}

	public TrsEdiNodVO(
			String                         ibflag                        ,
			String                         page_rows                     ,
			String                         edi_nod_cd                    ,
			String                         edi_nod_tp_cd                 ,
			String                         edi_nod_rcv_id                ,
			String                         edi_nod_n1st_slan_cd          ,
			String                         edi_nod_n2nd_slan_cd          ,
			String                         edi_nod_n3rd_slan_cd          ,
			String                         edi_nod_n4th_slan_cd          ,
			String                         edi_nod_n5th_slan_cd          ,
			String                         edi_nod_n6th_slan_cd          ,
			String                         edi_nod_n7th_slan_cd          ,
			String                         edi_nod_n8th_slan_cd          ,
			String                         edi_nod_n9th_slan_cd          ,
			String                         edi_nod_n10th_slan_cd         ,
			String                         edi_nod_port_cd               ,
			String                         edi_nod_bkg_auto_edi_ind_cd   ,
			String                         edi_nod_mty_rlse_edi_ind_cd   ,
			String                         edi_nod_edi_snd_id            ,
			String                         edi_nod_fcgo_ind_cd           ,
			String                         edi_nod_mty_auto_edi_ind_cd   ,
			String                         edi_nod_bkg_mnl_edi_ind_cd    ,
			String                         edi_nod_tz_cgo_edi_n1st_ind_cd,
			String                         edi_nod_tz_cgo_edi_n2nd_ind_cd,
			String                         eai_evnt_dt                   ){
		this.ibflag                         = ibflag                        ;
		this.page_rows                      = page_rows                     ;
		this.edi_nod_cd                     = edi_nod_cd                    ;
		this.edi_nod_tp_cd                  = edi_nod_tp_cd                 ;
		this.edi_nod_rcv_id                 = edi_nod_rcv_id                ;
		this.edi_nod_n1st_slan_cd           = edi_nod_n1st_slan_cd          ;
		this.edi_nod_n2nd_slan_cd           = edi_nod_n2nd_slan_cd          ;
		this.edi_nod_n3rd_slan_cd           = edi_nod_n3rd_slan_cd          ;
		this.edi_nod_n4th_slan_cd           = edi_nod_n4th_slan_cd          ;
		this.edi_nod_n5th_slan_cd           = edi_nod_n5th_slan_cd          ;
		this.edi_nod_n6th_slan_cd           = edi_nod_n6th_slan_cd          ;
		this.edi_nod_n7th_slan_cd           = edi_nod_n7th_slan_cd          ;
		this.edi_nod_n8th_slan_cd           = edi_nod_n8th_slan_cd          ;
		this.edi_nod_n9th_slan_cd           = edi_nod_n9th_slan_cd          ;
		this.edi_nod_n10th_slan_cd          = edi_nod_n10th_slan_cd         ;
		this.edi_nod_port_cd                = edi_nod_port_cd               ;
		this.edi_nod_bkg_auto_edi_ind_cd    = edi_nod_bkg_auto_edi_ind_cd   ;
		this.edi_nod_mty_rlse_edi_ind_cd    = edi_nod_mty_rlse_edi_ind_cd   ;
		this.edi_nod_edi_snd_id             = edi_nod_edi_snd_id            ;
		this.edi_nod_fcgo_ind_cd            = edi_nod_fcgo_ind_cd           ;
		this.edi_nod_mty_auto_edi_ind_cd    = edi_nod_mty_auto_edi_ind_cd   ;
		this.edi_nod_bkg_mnl_edi_ind_cd     = edi_nod_bkg_mnl_edi_ind_cd    ;
		this.edi_nod_tz_cgo_edi_n1st_ind_cd = edi_nod_tz_cgo_edi_n1st_ind_cd;
		this.edi_nod_tz_cgo_edi_n2nd_ind_cd = edi_nod_tz_cgo_edi_n2nd_ind_cd;
		this.eai_evnt_dt                    = eai_evnt_dt                   ;
	}

	// getter method is proceeding ..
	public String                         getIbflag                        (){	return ibflag                        	;	}
	public String                         getPage_rows                     (){	return page_rows                     	;	}
	public String                         getEdi_nod_cd                    (){	return edi_nod_cd                    	;	}
	public String                         getEdi_nod_tp_cd                 (){	return edi_nod_tp_cd                 	;	}
	public String                         getEdi_nod_rcv_id                (){	return edi_nod_rcv_id                	;	}
	public String                         getEdi_nod_n1st_slan_cd          (){	return edi_nod_n1st_slan_cd          	;	}
	public String                         getEdi_nod_n2nd_slan_cd          (){	return edi_nod_n2nd_slan_cd          	;	}
	public String                         getEdi_nod_n3rd_slan_cd          (){	return edi_nod_n3rd_slan_cd          	;	}
	public String                         getEdi_nod_n4th_slan_cd          (){	return edi_nod_n4th_slan_cd          	;	}
	public String                         getEdi_nod_n5th_slan_cd          (){	return edi_nod_n5th_slan_cd          	;	}
	public String                         getEdi_nod_n6th_slan_cd          (){	return edi_nod_n6th_slan_cd          	;	}
	public String                         getEdi_nod_n7th_slan_cd          (){	return edi_nod_n7th_slan_cd          	;	}
	public String                         getEdi_nod_n8th_slan_cd          (){	return edi_nod_n8th_slan_cd          	;	}
	public String                         getEdi_nod_n9th_slan_cd          (){	return edi_nod_n9th_slan_cd          	;	}
	public String                         getEdi_nod_n10th_slan_cd         (){	return edi_nod_n10th_slan_cd         	;	}
	public String                         getEdi_nod_port_cd               (){	return edi_nod_port_cd               	;	}
	public String                         getEdi_nod_bkg_auto_edi_ind_cd   (){	return edi_nod_bkg_auto_edi_ind_cd   	;	}
	public String                         getEdi_nod_mty_rlse_edi_ind_cd   (){	return edi_nod_mty_rlse_edi_ind_cd   	;	}
	public String                         getEdi_nod_edi_snd_id            (){	return edi_nod_edi_snd_id            	;	}
	public String                         getEdi_nod_fcgo_ind_cd           (){	return edi_nod_fcgo_ind_cd           	;	}
	public String                         getEdi_nod_mty_auto_edi_ind_cd   (){	return edi_nod_mty_auto_edi_ind_cd   	;	}
	public String                         getEdi_nod_bkg_mnl_edi_ind_cd    (){	return edi_nod_bkg_mnl_edi_ind_cd    	;	}
	public String                         getEdi_nod_tz_cgo_edi_n1st_ind_cd(){	return edi_nod_tz_cgo_edi_n1st_ind_cd	;	}
	public String                         getEdi_nod_tz_cgo_edi_n2nd_ind_cd(){	return edi_nod_tz_cgo_edi_n2nd_ind_cd	;	}
	public String                         getEai_evnt_dt                   (){	return eai_evnt_dt                   	;	}

	// setter method is proceeding ..
	public void setIbflag                        ( String                         ibflag                         ){	this.ibflag                         = ibflag                        	;	}
	public void setPage_rows                     ( String                         page_rows                      ){	this.page_rows                      = page_rows                     	;	}
	public void setEdi_nod_cd                    ( String                         edi_nod_cd                     ){	this.edi_nod_cd                     = edi_nod_cd                    	;	}
	public void setEdi_nod_tp_cd                 ( String                         edi_nod_tp_cd                  ){	this.edi_nod_tp_cd                  = edi_nod_tp_cd                 	;	}
	public void setEdi_nod_rcv_id                ( String                         edi_nod_rcv_id                 ){	this.edi_nod_rcv_id                 = edi_nod_rcv_id                	;	}
	public void setEdi_nod_n1st_slan_cd          ( String                         edi_nod_n1st_slan_cd           ){	this.edi_nod_n1st_slan_cd           = edi_nod_n1st_slan_cd          	;	}
	public void setEdi_nod_n2nd_slan_cd          ( String                         edi_nod_n2nd_slan_cd           ){	this.edi_nod_n2nd_slan_cd           = edi_nod_n2nd_slan_cd          	;	}
	public void setEdi_nod_n3rd_slan_cd          ( String                         edi_nod_n3rd_slan_cd           ){	this.edi_nod_n3rd_slan_cd           = edi_nod_n3rd_slan_cd          	;	}
	public void setEdi_nod_n4th_slan_cd          ( String                         edi_nod_n4th_slan_cd           ){	this.edi_nod_n4th_slan_cd           = edi_nod_n4th_slan_cd          	;	}
	public void setEdi_nod_n5th_slan_cd          ( String                         edi_nod_n5th_slan_cd           ){	this.edi_nod_n5th_slan_cd           = edi_nod_n5th_slan_cd          	;	}
	public void setEdi_nod_n6th_slan_cd          ( String                         edi_nod_n6th_slan_cd           ){	this.edi_nod_n6th_slan_cd           = edi_nod_n6th_slan_cd          	;	}
	public void setEdi_nod_n7th_slan_cd          ( String                         edi_nod_n7th_slan_cd           ){	this.edi_nod_n7th_slan_cd           = edi_nod_n7th_slan_cd          	;	}
	public void setEdi_nod_n8th_slan_cd          ( String                         edi_nod_n8th_slan_cd           ){	this.edi_nod_n8th_slan_cd           = edi_nod_n8th_slan_cd          	;	}
	public void setEdi_nod_n9th_slan_cd          ( String                         edi_nod_n9th_slan_cd           ){	this.edi_nod_n9th_slan_cd           = edi_nod_n9th_slan_cd          	;	}
	public void setEdi_nod_n10th_slan_cd         ( String                         edi_nod_n10th_slan_cd          ){	this.edi_nod_n10th_slan_cd          = edi_nod_n10th_slan_cd         	;	}
	public void setEdi_nod_port_cd               ( String                         edi_nod_port_cd                ){	this.edi_nod_port_cd                = edi_nod_port_cd               	;	}
	public void setEdi_nod_bkg_auto_edi_ind_cd   ( String                         edi_nod_bkg_auto_edi_ind_cd    ){	this.edi_nod_bkg_auto_edi_ind_cd    = edi_nod_bkg_auto_edi_ind_cd   	;	}
	public void setEdi_nod_mty_rlse_edi_ind_cd   ( String                         edi_nod_mty_rlse_edi_ind_cd    ){	this.edi_nod_mty_rlse_edi_ind_cd    = edi_nod_mty_rlse_edi_ind_cd   	;	}
	public void setEdi_nod_edi_snd_id            ( String                         edi_nod_edi_snd_id             ){	this.edi_nod_edi_snd_id             = edi_nod_edi_snd_id            	;	}
	public void setEdi_nod_fcgo_ind_cd           ( String                         edi_nod_fcgo_ind_cd            ){	this.edi_nod_fcgo_ind_cd            = edi_nod_fcgo_ind_cd           	;	}
	public void setEdi_nod_mty_auto_edi_ind_cd   ( String                         edi_nod_mty_auto_edi_ind_cd    ){	this.edi_nod_mty_auto_edi_ind_cd    = edi_nod_mty_auto_edi_ind_cd   	;	}
	public void setEdi_nod_bkg_mnl_edi_ind_cd    ( String                         edi_nod_bkg_mnl_edi_ind_cd     ){	this.edi_nod_bkg_mnl_edi_ind_cd     = edi_nod_bkg_mnl_edi_ind_cd    	;	}
	public void setEdi_nod_tz_cgo_edi_n1st_ind_cd( String                         edi_nod_tz_cgo_edi_n1st_ind_cd ){	this.edi_nod_tz_cgo_edi_n1st_ind_cd = edi_nod_tz_cgo_edi_n1st_ind_cd	;	}
	public void setEdi_nod_tz_cgo_edi_n2nd_ind_cd( String                         edi_nod_tz_cgo_edi_n2nd_ind_cd ){	this.edi_nod_tz_cgo_edi_n2nd_ind_cd = edi_nod_tz_cgo_edi_n2nd_ind_cd	;	}
	public void setEai_evnt_dt                   ( String                         eai_evnt_dt                    ){	this.eai_evnt_dt                    = eai_evnt_dt                   	;	}

	public static TrsEdiNodVO fromRequest(HttpServletRequest request) {
		TrsEdiNodVO model = new TrsEdiNodVO();
		try {
			model.setIbflag                        	(JSPUtil.getParameter(request, "ibflag                        		".trim(), ""));
			model.setPage_rows                     	(JSPUtil.getParameter(request, "page_rows                     		".trim(), ""));
			model.setEdi_nod_cd                    	(JSPUtil.getParameter(request, "edi_nod_cd                    		".trim(), ""));
			model.setEdi_nod_tp_cd                 	(JSPUtil.getParameter(request, "edi_nod_tp_cd                 		".trim(), ""));
			model.setEdi_nod_rcv_id                	(JSPUtil.getParameter(request, "edi_nod_rcv_id                		".trim(), ""));
			model.setEdi_nod_n1st_slan_cd          	(JSPUtil.getParameter(request, "edi_nod_n1st_slan_cd          		".trim(), ""));
			model.setEdi_nod_n2nd_slan_cd          	(JSPUtil.getParameter(request, "edi_nod_n2nd_slan_cd          		".trim(), ""));
			model.setEdi_nod_n3rd_slan_cd          	(JSPUtil.getParameter(request, "edi_nod_n3rd_slan_cd          		".trim(), ""));
			model.setEdi_nod_n4th_slan_cd          	(JSPUtil.getParameter(request, "edi_nod_n4th_slan_cd          		".trim(), ""));
			model.setEdi_nod_n5th_slan_cd          	(JSPUtil.getParameter(request, "edi_nod_n5th_slan_cd          		".trim(), ""));
			model.setEdi_nod_n6th_slan_cd          	(JSPUtil.getParameter(request, "edi_nod_n6th_slan_cd          		".trim(), ""));
			model.setEdi_nod_n7th_slan_cd          	(JSPUtil.getParameter(request, "edi_nod_n7th_slan_cd          		".trim(), ""));
			model.setEdi_nod_n8th_slan_cd          	(JSPUtil.getParameter(request, "edi_nod_n8th_slan_cd          		".trim(), ""));
			model.setEdi_nod_n9th_slan_cd          	(JSPUtil.getParameter(request, "edi_nod_n9th_slan_cd          		".trim(), ""));
			model.setEdi_nod_n10th_slan_cd         	(JSPUtil.getParameter(request, "edi_nod_n10th_slan_cd         		".trim(), ""));
			model.setEdi_nod_port_cd               	(JSPUtil.getParameter(request, "edi_nod_port_cd               		".trim(), ""));
			model.setEdi_nod_bkg_auto_edi_ind_cd   	(JSPUtil.getParameter(request, "edi_nod_bkg_auto_edi_ind_cd   		".trim(), ""));
			model.setEdi_nod_mty_rlse_edi_ind_cd   	(JSPUtil.getParameter(request, "edi_nod_mty_rlse_edi_ind_cd   		".trim(), ""));
			model.setEdi_nod_edi_snd_id            	(JSPUtil.getParameter(request, "edi_nod_edi_snd_id            		".trim(), ""));
			model.setEdi_nod_fcgo_ind_cd           	(JSPUtil.getParameter(request, "edi_nod_fcgo_ind_cd           		".trim(), ""));
			model.setEdi_nod_mty_auto_edi_ind_cd   	(JSPUtil.getParameter(request, "edi_nod_mty_auto_edi_ind_cd   		".trim(), ""));
			model.setEdi_nod_bkg_mnl_edi_ind_cd    	(JSPUtil.getParameter(request, "edi_nod_bkg_mnl_edi_ind_cd    		".trim(), ""));
			model.setEdi_nod_tz_cgo_edi_n1st_ind_cd	(JSPUtil.getParameter(request, "edi_nod_tz_cgo_edi_n1st_ind_cd		".trim(), ""));
			model.setEdi_nod_tz_cgo_edi_n2nd_ind_cd	(JSPUtil.getParameter(request, "edi_nod_tz_cgo_edi_n2nd_ind_cd		".trim(), ""));
			model.setEai_evnt_dt                   	(JSPUtil.getParameter(request, "eai_evnt_dt                   		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		TrsEdiNodVO model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag                         =  (JSPUtil.getParameter(request, "ibflag                        		".trim(), length));
			String[] page_rows                      =  (JSPUtil.getParameter(request, "page_rows                     		".trim(), length));
			String[] edi_nod_cd                     =  (JSPUtil.getParameter(request, "edi_nod_cd                    		".trim(), length));
			String[] edi_nod_tp_cd                  =  (JSPUtil.getParameter(request, "edi_nod_tp_cd                 		".trim(), length));
			String[] edi_nod_rcv_id                 =  (JSPUtil.getParameter(request, "edi_nod_rcv_id                		".trim(), length));
			String[] edi_nod_n1st_slan_cd           =  (JSPUtil.getParameter(request, "edi_nod_n1st_slan_cd          		".trim(), length));
			String[] edi_nod_n2nd_slan_cd           =  (JSPUtil.getParameter(request, "edi_nod_n2nd_slan_cd          		".trim(), length));
			String[] edi_nod_n3rd_slan_cd           =  (JSPUtil.getParameter(request, "edi_nod_n3rd_slan_cd          		".trim(), length));
			String[] edi_nod_n4th_slan_cd           =  (JSPUtil.getParameter(request, "edi_nod_n4th_slan_cd          		".trim(), length));
			String[] edi_nod_n5th_slan_cd           =  (JSPUtil.getParameter(request, "edi_nod_n5th_slan_cd          		".trim(), length));
			String[] edi_nod_n6th_slan_cd           =  (JSPUtil.getParameter(request, "edi_nod_n6th_slan_cd          		".trim(), length));
			String[] edi_nod_n7th_slan_cd           =  (JSPUtil.getParameter(request, "edi_nod_n7th_slan_cd          		".trim(), length));
			String[] edi_nod_n8th_slan_cd           =  (JSPUtil.getParameter(request, "edi_nod_n8th_slan_cd          		".trim(), length));
			String[] edi_nod_n9th_slan_cd           =  (JSPUtil.getParameter(request, "edi_nod_n9th_slan_cd          		".trim(), length));
			String[] edi_nod_n10th_slan_cd          =  (JSPUtil.getParameter(request, "edi_nod_n10th_slan_cd         		".trim(), length));
			String[] edi_nod_port_cd                =  (JSPUtil.getParameter(request, "edi_nod_port_cd               		".trim(), length));
			String[] edi_nod_bkg_auto_edi_ind_cd    =  (JSPUtil.getParameter(request, "edi_nod_bkg_auto_edi_ind_cd   		".trim(), length));
			String[] edi_nod_mty_rlse_edi_ind_cd    =  (JSPUtil.getParameter(request, "edi_nod_mty_rlse_edi_ind_cd   		".trim(), length));
			String[] edi_nod_edi_snd_id             =  (JSPUtil.getParameter(request, "edi_nod_edi_snd_id            		".trim(), length));
			String[] edi_nod_fcgo_ind_cd            =  (JSPUtil.getParameter(request, "edi_nod_fcgo_ind_cd           		".trim(), length));
			String[] edi_nod_mty_auto_edi_ind_cd    =  (JSPUtil.getParameter(request, "edi_nod_mty_auto_edi_ind_cd   		".trim(), length));
			String[] edi_nod_bkg_mnl_edi_ind_cd     =  (JSPUtil.getParameter(request, "edi_nod_bkg_mnl_edi_ind_cd    		".trim(), length));
			String[] edi_nod_tz_cgo_edi_n1st_ind_cd =  (JSPUtil.getParameter(request, "edi_nod_tz_cgo_edi_n1st_ind_cd		".trim(), length));
			String[] edi_nod_tz_cgo_edi_n2nd_ind_cd =  (JSPUtil.getParameter(request, "edi_nod_tz_cgo_edi_n2nd_ind_cd		".trim(), length));
			String[] eai_evnt_dt                    =  (JSPUtil.getParameter(request, "eai_evnt_dt                   		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new TrsEdiNodVO();
				model.setIbflag                        		  (ibflag                        	[i]);
				model.setPage_rows                     		  (page_rows                     	[i]);
				model.setEdi_nod_cd                    		  (edi_nod_cd                    	[i]);
				model.setEdi_nod_tp_cd                 		  (edi_nod_tp_cd                 	[i]);
				model.setEdi_nod_rcv_id                		  (edi_nod_rcv_id                	[i]);
				model.setEdi_nod_n1st_slan_cd          		  (edi_nod_n1st_slan_cd          	[i]);
				model.setEdi_nod_n2nd_slan_cd          		  (edi_nod_n2nd_slan_cd          	[i]);
				model.setEdi_nod_n3rd_slan_cd          		  (edi_nod_n3rd_slan_cd          	[i]);
				model.setEdi_nod_n4th_slan_cd          		  (edi_nod_n4th_slan_cd          	[i]);
				model.setEdi_nod_n5th_slan_cd          		  (edi_nod_n5th_slan_cd          	[i]);
				model.setEdi_nod_n6th_slan_cd          		  (edi_nod_n6th_slan_cd          	[i]);
				model.setEdi_nod_n7th_slan_cd          		  (edi_nod_n7th_slan_cd          	[i]);
				model.setEdi_nod_n8th_slan_cd          		  (edi_nod_n8th_slan_cd          	[i]);
				model.setEdi_nod_n9th_slan_cd          		  (edi_nod_n9th_slan_cd          	[i]);
				model.setEdi_nod_n10th_slan_cd         		  (edi_nod_n10th_slan_cd         	[i]);
				model.setEdi_nod_port_cd               		  (edi_nod_port_cd               	[i]);
				model.setEdi_nod_bkg_auto_edi_ind_cd   		  (edi_nod_bkg_auto_edi_ind_cd   	[i]);
				model.setEdi_nod_mty_rlse_edi_ind_cd   		  (edi_nod_mty_rlse_edi_ind_cd   	[i]);
				model.setEdi_nod_edi_snd_id            		  (edi_nod_edi_snd_id            	[i]);
				model.setEdi_nod_fcgo_ind_cd           		  (edi_nod_fcgo_ind_cd           	[i]);
				model.setEdi_nod_mty_auto_edi_ind_cd   		  (edi_nod_mty_auto_edi_ind_cd   	[i]);
				model.setEdi_nod_bkg_mnl_edi_ind_cd    		  (edi_nod_bkg_mnl_edi_ind_cd    	[i]);
				model.setEdi_nod_tz_cgo_edi_n1st_ind_cd		  (edi_nod_tz_cgo_edi_n1st_ind_cd	[i]);
				model.setEdi_nod_tz_cgo_edi_n2nd_ind_cd		  (edi_nod_tz_cgo_edi_n2nd_ind_cd	[i]);
				model.setEai_evnt_dt                   		  (eai_evnt_dt                   	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		TrsEdiNodVO model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag                         =  (JSPUtil.getParameter(request, prefix + "ibflag                        		".trim(), length));
			String[] page_rows                      =  (JSPUtil.getParameter(request, prefix + "page_rows                     		".trim(), length));
			String[] edi_nod_cd                     =  (JSPUtil.getParameter(request, prefix + "edi_nod_cd                    		".trim(), length));
			String[] edi_nod_tp_cd                  =  (JSPUtil.getParameter(request, prefix + "edi_nod_tp_cd                 		".trim(), length));
			String[] edi_nod_rcv_id                 =  (JSPUtil.getParameter(request, prefix + "edi_nod_rcv_id                		".trim(), length));
			String[] edi_nod_n1st_slan_cd           =  (JSPUtil.getParameter(request, prefix + "edi_nod_n1st_slan_cd          		".trim(), length));
			String[] edi_nod_n2nd_slan_cd           =  (JSPUtil.getParameter(request, prefix + "edi_nod_n2nd_slan_cd          		".trim(), length));
			String[] edi_nod_n3rd_slan_cd           =  (JSPUtil.getParameter(request, prefix + "edi_nod_n3rd_slan_cd          		".trim(), length));
			String[] edi_nod_n4th_slan_cd           =  (JSPUtil.getParameter(request, prefix + "edi_nod_n4th_slan_cd          		".trim(), length));
			String[] edi_nod_n5th_slan_cd           =  (JSPUtil.getParameter(request, prefix + "edi_nod_n5th_slan_cd          		".trim(), length));
			String[] edi_nod_n6th_slan_cd           =  (JSPUtil.getParameter(request, prefix + "edi_nod_n6th_slan_cd          		".trim(), length));
			String[] edi_nod_n7th_slan_cd           =  (JSPUtil.getParameter(request, prefix + "edi_nod_n7th_slan_cd          		".trim(), length));
			String[] edi_nod_n8th_slan_cd           =  (JSPUtil.getParameter(request, prefix + "edi_nod_n8th_slan_cd          		".trim(), length));
			String[] edi_nod_n9th_slan_cd           =  (JSPUtil.getParameter(request, prefix + "edi_nod_n9th_slan_cd          		".trim(), length));
			String[] edi_nod_n10th_slan_cd          =  (JSPUtil.getParameter(request, prefix + "edi_nod_n10th_slan_cd         		".trim(), length));
			String[] edi_nod_port_cd                =  (JSPUtil.getParameter(request, prefix + "edi_nod_port_cd               		".trim(), length));
			String[] edi_nod_bkg_auto_edi_ind_cd    =  (JSPUtil.getParameter(request, prefix + "edi_nod_bkg_auto_edi_ind_cd   		".trim(), length));
			String[] edi_nod_mty_rlse_edi_ind_cd    =  (JSPUtil.getParameter(request, prefix + "edi_nod_mty_rlse_edi_ind_cd   		".trim(), length));
			String[] edi_nod_edi_snd_id             =  (JSPUtil.getParameter(request, prefix + "edi_nod_edi_snd_id            		".trim(), length));
			String[] edi_nod_fcgo_ind_cd            =  (JSPUtil.getParameter(request, prefix + "edi_nod_fcgo_ind_cd           		".trim(), length));
			String[] edi_nod_mty_auto_edi_ind_cd    =  (JSPUtil.getParameter(request, prefix + "edi_nod_mty_auto_edi_ind_cd   		".trim(), length));
			String[] edi_nod_bkg_mnl_edi_ind_cd     =  (JSPUtil.getParameter(request, prefix + "edi_nod_bkg_mnl_edi_ind_cd    		".trim(), length));
			String[] edi_nod_tz_cgo_edi_n1st_ind_cd =  (JSPUtil.getParameter(request, prefix + "edi_nod_tz_cgo_edi_n1st_ind_cd		".trim(), length));
			String[] edi_nod_tz_cgo_edi_n2nd_ind_cd =  (JSPUtil.getParameter(request, prefix + "edi_nod_tz_cgo_edi_n2nd_ind_cd		".trim(), length));
			String[] eai_evnt_dt                    =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt                   		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new TrsEdiNodVO();
				model.setIbflag                        		  ( ibflag                        	[i]);
				model.setPage_rows                     		  ( page_rows                     	[i]);
				model.setEdi_nod_cd                    		  ( edi_nod_cd                    	[i]);
				model.setEdi_nod_tp_cd                 		  ( edi_nod_tp_cd                 	[i]);
				model.setEdi_nod_rcv_id                		  ( edi_nod_rcv_id                	[i]);
				model.setEdi_nod_n1st_slan_cd          		  ( edi_nod_n1st_slan_cd          	[i]);
				model.setEdi_nod_n2nd_slan_cd          		  ( edi_nod_n2nd_slan_cd          	[i]);
				model.setEdi_nod_n3rd_slan_cd          		  ( edi_nod_n3rd_slan_cd          	[i]);
				model.setEdi_nod_n4th_slan_cd          		  ( edi_nod_n4th_slan_cd          	[i]);
				model.setEdi_nod_n5th_slan_cd          		  ( edi_nod_n5th_slan_cd          	[i]);
				model.setEdi_nod_n6th_slan_cd          		  ( edi_nod_n6th_slan_cd          	[i]);
				model.setEdi_nod_n7th_slan_cd          		  ( edi_nod_n7th_slan_cd          	[i]);
				model.setEdi_nod_n8th_slan_cd          		  ( edi_nod_n8th_slan_cd          	[i]);
				model.setEdi_nod_n9th_slan_cd          		  ( edi_nod_n9th_slan_cd          	[i]);
				model.setEdi_nod_n10th_slan_cd         		  ( edi_nod_n10th_slan_cd         	[i]);
				model.setEdi_nod_port_cd               		  ( edi_nod_port_cd               	[i]);
				model.setEdi_nod_bkg_auto_edi_ind_cd   		  ( edi_nod_bkg_auto_edi_ind_cd   	[i]);
				model.setEdi_nod_mty_rlse_edi_ind_cd   		  ( edi_nod_mty_rlse_edi_ind_cd   	[i]);
				model.setEdi_nod_edi_snd_id            		  ( edi_nod_edi_snd_id            	[i]);
				model.setEdi_nod_fcgo_ind_cd           		  ( edi_nod_fcgo_ind_cd           	[i]);
				model.setEdi_nod_mty_auto_edi_ind_cd   		  ( edi_nod_mty_auto_edi_ind_cd   	[i]);
				model.setEdi_nod_bkg_mnl_edi_ind_cd    		  ( edi_nod_bkg_mnl_edi_ind_cd    	[i]);
				model.setEdi_nod_tz_cgo_edi_n1st_ind_cd		  ( edi_nod_tz_cgo_edi_n1st_ind_cd	[i]);
				model.setEdi_nod_tz_cgo_edi_n2nd_ind_cd		  ( edi_nod_tz_cgo_edi_n2nd_ind_cd	[i]);
				model.setEai_evnt_dt                   		  ( eai_evnt_dt                   	[i]);
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
