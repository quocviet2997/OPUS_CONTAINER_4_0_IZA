/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : EDI_USA_IB_CGO_RLSE.java
*@FileTitle : USA Delivery Order Manage
*Open Issues :
*Change history :
*@LastModifyDate : 2009-02-16
*@LastModifier : poong yeon cho
*@LastVersion : 1.0
* 2009-02-16 poong yeon cho
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
 * @author poong yeon cho
 * @since J2EE 1.4
 */
public final class EDI_USA_IB_CGO_RLSE implements java.io.Serializable {

	private String                     ibflag                     = "";
	private String                     page_rows                  = "";
	private String                     bl_no                      = "";
	private String                     bl_no_tp                   = "";
	private String                     bl_no_chk                  = "";
	private String                     bkg_no                     = "";
	private String                     bkg_no_split               = "";
	private String                     ibd_bkg_sts_cd             = "";
	private String                     vsl_cd                     = "";
	private String                     skd_voy_no                 = "";
	private String                     skd_dir_cd                 = "";
	private String                     vsl_dchg_port_cd           = "";
	private String                     ibd_trsp_hub_cty_cd        = "";
	private String                     ibd_cstms_clr_loc_cd       = "";
	private String                     ibd_tp_cd                  = "";
	private String                     ibd_no                     = "";
	private String                     ibd_iss_dt                 = "";
	private String                     ibd_cstms_clr_ind_cd       = "";
	private String                     ibd_ipi_locl_ind_cd        = "";
	private String                     ibd_non_vsl_op_crr_ftr_cd  = "";
	private String                     cgor_frt_pay_ind_flg       = "";
	private String                     cgor_org_bl_rcvr_ind_flg   = "";
	private String                     cgor_cstms_acpt_re_ind_flg = "";
	private String                     cgor_ar_upd_dt             = "";
	private String                     cgor_org_bl_upd_dt         = "";
	private String                     cgor_cust_edi_flg          = "";
	private String                     cgor_cust_edi_dt           = "";
	private String                     cstms_acpt_flg             = "";
	private String                     ib_trns_no                 = "";
	private String                     cnd_loc_gds_cd             = "";
	private String                     cnd_ibd_no                 = "";
	private String                     cnd_mrn_no                 = "";
	private String                     ams_ins_dt                 = "";
	private String                     ams_upd_dt                 = "";
	private String                     eai_evnt_dt                = "";
	private String                     cgor_frt_upd_dt            = "";
	private String                     del_cd                     = "";
	private String                     trsp_evnt_tms              = "";
	private String                     edi_cgo_rmk                = "";

	public EDI_USA_IB_CGO_RLSE(){}

	public EDI_USA_IB_CGO_RLSE(
			String                     ibflag                    ,
			String                     page_rows                 ,
			String                     bl_no                     ,
			String                     bl_no_tp                  ,
			String                     bl_no_chk                 ,
			String                     bkg_no                    ,
			String                     bkg_no_split              ,
			String                     ibd_bkg_sts_cd            ,
			String                     vsl_cd                    ,
			String                     skd_voy_no                ,
			String                     skd_dir_cd                ,
			String                     vsl_dchg_port_cd          ,
			String                     ibd_trsp_hub_cty_cd       ,
			String                     ibd_cstms_clr_loc_cd      ,
			String                     ibd_tp_cd                 ,
			String                     ibd_no                    ,
			String                     ibd_iss_dt                ,
			String                     ibd_cstms_clr_ind_cd      ,
			String                     ibd_ipi_locl_ind_cd       ,
			String                     ibd_non_vsl_op_crr_ftr_cd ,
			String                     cgor_frt_pay_ind_flg      ,
			String                     cgor_org_bl_rcvr_ind_flg  ,
			String                     cgor_cstms_acpt_re_ind_flg,
			String                     cgor_ar_upd_dt            ,
			String                     cgor_org_bl_upd_dt        ,
			String                     cgor_cust_edi_flg         ,
			String                     cgor_cust_edi_dt          ,
			String                     cstms_acpt_flg            ,
			String                     ib_trns_no                ,
			String                     cnd_loc_gds_cd            ,
			String                     cnd_ibd_no                ,
			String                     cnd_mrn_no                ,
			String                     ams_ins_dt                ,
			String                     ams_upd_dt                ,
			String                     eai_evnt_dt               ,
			String                     cgor_frt_upd_dt           ,
			String                     del_cd                    ,
			String                     trsp_evnt_tms             ,
			String                     edi_cgo_rmk               ){
		this.ibflag                     = ibflag                    ;
		this.page_rows                  = page_rows                 ;
		this.bl_no                      = bl_no                     ;
		this.bl_no_tp                   = bl_no_tp                  ;
		this.bl_no_chk                  = bl_no_chk                 ;
		this.bkg_no                     = bkg_no                    ;
		this.bkg_no_split               = bkg_no_split              ;
		this.ibd_bkg_sts_cd             = ibd_bkg_sts_cd            ;
		this.vsl_cd                     = vsl_cd                    ;
		this.skd_voy_no                 = skd_voy_no                ;
		this.skd_dir_cd                 = skd_dir_cd                ;
		this.vsl_dchg_port_cd           = vsl_dchg_port_cd          ;
		this.ibd_trsp_hub_cty_cd        = ibd_trsp_hub_cty_cd       ;
		this.ibd_cstms_clr_loc_cd       = ibd_cstms_clr_loc_cd      ;
		this.ibd_tp_cd                  = ibd_tp_cd                 ;
		this.ibd_no                     = ibd_no                    ;
		this.ibd_iss_dt                 = ibd_iss_dt                ;
		this.ibd_cstms_clr_ind_cd       = ibd_cstms_clr_ind_cd      ;
		this.ibd_ipi_locl_ind_cd        = ibd_ipi_locl_ind_cd       ;
		this.ibd_non_vsl_op_crr_ftr_cd  = ibd_non_vsl_op_crr_ftr_cd ;
		this.cgor_frt_pay_ind_flg       = cgor_frt_pay_ind_flg      ;
		this.cgor_org_bl_rcvr_ind_flg   = cgor_org_bl_rcvr_ind_flg  ;
		this.cgor_cstms_acpt_re_ind_flg = cgor_cstms_acpt_re_ind_flg;
		this.cgor_ar_upd_dt             = cgor_ar_upd_dt            ;
		this.cgor_org_bl_upd_dt         = cgor_org_bl_upd_dt        ;
		this.cgor_cust_edi_flg          = cgor_cust_edi_flg         ;
		this.cgor_cust_edi_dt           = cgor_cust_edi_dt          ;
		this.cstms_acpt_flg             = cstms_acpt_flg            ;
		this.ib_trns_no                 = ib_trns_no                ;
		this.cnd_loc_gds_cd             = cnd_loc_gds_cd            ;
		this.cnd_ibd_no                 = cnd_ibd_no                ;
		this.cnd_mrn_no                 = cnd_mrn_no                ;
		this.ams_ins_dt                 = ams_ins_dt                ;
		this.ams_upd_dt                 = ams_upd_dt                ;
		this.eai_evnt_dt                = eai_evnt_dt               ;
		this.cgor_frt_upd_dt            = cgor_frt_upd_dt           ;
		this.del_cd                     = del_cd                    ;
		this.trsp_evnt_tms              = trsp_evnt_tms             ;
		this.edi_cgo_rmk                = edi_cgo_rmk               ;
	}

	// getter method is proceeding ..
	public String                     getIbflag                    (){	return ibflag                    	;	}
	public String                     getPage_rows                 (){	return page_rows                 	;	}
	public String                     getBl_no                     (){	return bl_no                     	;	}
	public String                     getBl_no_tp                  (){	return bl_no_tp                  	;	}
	public String                     getBl_no_chk                 (){	return bl_no_chk                 	;	}
	public String                     getBkg_no                    (){	return bkg_no                    	;	}
	public String                     getBkg_no_split              (){	return bkg_no_split              	;	}
	public String                     getIbd_bkg_sts_cd            (){	return ibd_bkg_sts_cd            	;	}
	public String                     getVsl_cd                    (){	return vsl_cd                    	;	}
	public String                     getSkd_voy_no                (){	return skd_voy_no                	;	}
	public String                     getSkd_dir_cd                (){	return skd_dir_cd                	;	}
	public String                     getVsl_dchg_port_cd          (){	return vsl_dchg_port_cd          	;	}
	public String                     getIbd_trsp_hub_cty_cd       (){	return ibd_trsp_hub_cty_cd       	;	}
	public String                     getIbd_cstms_clr_loc_cd      (){	return ibd_cstms_clr_loc_cd      	;	}
	public String                     getIbd_tp_cd                 (){	return ibd_tp_cd                 	;	}
	public String                     getIbd_no                    (){	return ibd_no                    	;	}
	public String                     getIbd_iss_dt                (){	return ibd_iss_dt                	;	}
	public String                     getIbd_cstms_clr_ind_cd      (){	return ibd_cstms_clr_ind_cd      	;	}
	public String                     getIbd_ipi_locl_ind_cd       (){	return ibd_ipi_locl_ind_cd       	;	}
	public String                     getIbd_non_vsl_op_crr_ftr_cd (){	return ibd_non_vsl_op_crr_ftr_cd 	;	}
	public String                     getCgor_frt_pay_ind_flg      (){	return cgor_frt_pay_ind_flg      	;	}
	public String                     getCgor_org_bl_rcvr_ind_flg  (){	return cgor_org_bl_rcvr_ind_flg  	;	}
	public String                     getCgor_cstms_acpt_re_ind_flg(){	return cgor_cstms_acpt_re_ind_flg	;	}
	public String                     getCgor_ar_upd_dt            (){	return cgor_ar_upd_dt            	;	}
	public String                     getCgor_org_bl_upd_dt        (){	return cgor_org_bl_upd_dt        	;	}
	public String                     getCgor_cust_edi_flg         (){	return cgor_cust_edi_flg         	;	}
	public String                     getCgor_cust_edi_dt          (){	return cgor_cust_edi_dt          	;	}
	public String                     getCstms_acpt_flg            (){	return cstms_acpt_flg            	;	}
	public String                     getIb_trns_no                (){	return ib_trns_no                	;	}
	public String                     getCnd_loc_gds_cd            (){	return cnd_loc_gds_cd            	;	}
	public String                     getCnd_ibd_no                (){	return cnd_ibd_no                	;	}
	public String                     getCnd_mrn_no                (){	return cnd_mrn_no                	;	}
	public String                     getAms_ins_dt                (){	return ams_ins_dt                	;	}
	public String                     getAms_upd_dt                (){	return ams_upd_dt                	;	}
	public String                     getEai_evnt_dt               (){	return eai_evnt_dt               	;	}
	public String                     getCgor_frt_upd_dt           (){	return cgor_frt_upd_dt           	;	}
	public String                     getDel_cd                    (){	return del_cd                    	;	}
	public String                     getTrsp_evnt_tms             (){	return trsp_evnt_tms             	;	}
	public String                     getEdi_cgo_rmk               (){	return edi_cgo_rmk               	;	}

	// setter method is proceeding ..
	public void setIbflag                    ( String                     ibflag                     ){	this.ibflag                     = ibflag                    	;	}
	public void setPage_rows                 ( String                     page_rows                  ){	this.page_rows                  = page_rows                 	;	}
	public void setBl_no                     ( String                     bl_no                      ){	this.bl_no                      = bl_no                     	;	}
	public void setBl_no_tp                  ( String                     bl_no_tp                   ){	this.bl_no_tp                   = bl_no_tp                  	;	}
	public void setBl_no_chk                 ( String                     bl_no_chk                  ){	this.bl_no_chk                  = bl_no_chk                 	;	}
	public void setBkg_no                    ( String                     bkg_no                     ){	this.bkg_no                     = bkg_no                    	;	}
	public void setBkg_no_split              ( String                     bkg_no_split               ){	this.bkg_no_split               = bkg_no_split              	;	}
	public void setIbd_bkg_sts_cd            ( String                     ibd_bkg_sts_cd             ){	this.ibd_bkg_sts_cd             = ibd_bkg_sts_cd            	;	}
	public void setVsl_cd                    ( String                     vsl_cd                     ){	this.vsl_cd                     = vsl_cd                    	;	}
	public void setSkd_voy_no                ( String                     skd_voy_no                 ){	this.skd_voy_no                 = skd_voy_no                	;	}
	public void setSkd_dir_cd                ( String                     skd_dir_cd                 ){	this.skd_dir_cd                 = skd_dir_cd                	;	}
	public void setVsl_dchg_port_cd          ( String                     vsl_dchg_port_cd           ){	this.vsl_dchg_port_cd           = vsl_dchg_port_cd          	;	}
	public void setIbd_trsp_hub_cty_cd       ( String                     ibd_trsp_hub_cty_cd        ){	this.ibd_trsp_hub_cty_cd        = ibd_trsp_hub_cty_cd       	;	}
	public void setIbd_cstms_clr_loc_cd      ( String                     ibd_cstms_clr_loc_cd       ){	this.ibd_cstms_clr_loc_cd       = ibd_cstms_clr_loc_cd      	;	}
	public void setIbd_tp_cd                 ( String                     ibd_tp_cd                  ){	this.ibd_tp_cd                  = ibd_tp_cd                 	;	}
	public void setIbd_no                    ( String                     ibd_no                     ){	this.ibd_no                     = ibd_no                    	;	}
	public void setIbd_iss_dt                ( String                     ibd_iss_dt                 ){	this.ibd_iss_dt                 = ibd_iss_dt                	;	}
	public void setIbd_cstms_clr_ind_cd      ( String                     ibd_cstms_clr_ind_cd       ){	this.ibd_cstms_clr_ind_cd       = ibd_cstms_clr_ind_cd      	;	}
	public void setIbd_ipi_locl_ind_cd       ( String                     ibd_ipi_locl_ind_cd        ){	this.ibd_ipi_locl_ind_cd        = ibd_ipi_locl_ind_cd       	;	}
	public void setIbd_non_vsl_op_crr_ftr_cd ( String                     ibd_non_vsl_op_crr_ftr_cd  ){	this.ibd_non_vsl_op_crr_ftr_cd  = ibd_non_vsl_op_crr_ftr_cd 	;	}
	public void setCgor_frt_pay_ind_flg      ( String                     cgor_frt_pay_ind_flg       ){	this.cgor_frt_pay_ind_flg       = cgor_frt_pay_ind_flg      	;	}
	public void setCgor_org_bl_rcvr_ind_flg  ( String                     cgor_org_bl_rcvr_ind_flg   ){	this.cgor_org_bl_rcvr_ind_flg   = cgor_org_bl_rcvr_ind_flg  	;	}
	public void setCgor_cstms_acpt_re_ind_flg( String                     cgor_cstms_acpt_re_ind_flg ){	this.cgor_cstms_acpt_re_ind_flg = cgor_cstms_acpt_re_ind_flg	;	}
	public void setCgor_ar_upd_dt            ( String                     cgor_ar_upd_dt             ){	this.cgor_ar_upd_dt             = cgor_ar_upd_dt            	;	}
	public void setCgor_org_bl_upd_dt        ( String                     cgor_org_bl_upd_dt         ){	this.cgor_org_bl_upd_dt         = cgor_org_bl_upd_dt        	;	}
	public void setCgor_cust_edi_flg         ( String                     cgor_cust_edi_flg          ){	this.cgor_cust_edi_flg          = cgor_cust_edi_flg         	;	}
	public void setCgor_cust_edi_dt          ( String                     cgor_cust_edi_dt           ){	this.cgor_cust_edi_dt           = cgor_cust_edi_dt          	;	}
	public void setCstms_acpt_flg            ( String                     cstms_acpt_flg             ){	this.cstms_acpt_flg             = cstms_acpt_flg            	;	}
	public void setIb_trns_no                ( String                     ib_trns_no                 ){	this.ib_trns_no                 = ib_trns_no                	;	}
	public void setCnd_loc_gds_cd            ( String                     cnd_loc_gds_cd             ){	this.cnd_loc_gds_cd             = cnd_loc_gds_cd            	;	}
	public void setCnd_ibd_no                ( String                     cnd_ibd_no                 ){	this.cnd_ibd_no                 = cnd_ibd_no                	;	}
	public void setCnd_mrn_no                ( String                     cnd_mrn_no                 ){	this.cnd_mrn_no                 = cnd_mrn_no                	;	}
	public void setAms_ins_dt                ( String                     ams_ins_dt                 ){	this.ams_ins_dt                 = ams_ins_dt                	;	}
	public void setAms_upd_dt                ( String                     ams_upd_dt                 ){	this.ams_upd_dt                 = ams_upd_dt                	;	}
	public void setEai_evnt_dt               ( String                     eai_evnt_dt                ){	this.eai_evnt_dt                = eai_evnt_dt               	;	}
	public void setCgor_frt_upd_dt           ( String                     cgor_frt_upd_dt            ){	this.cgor_frt_upd_dt            = cgor_frt_upd_dt           	;	}
	public void setDel_cd                    ( String                     del_cd                     ){	this.del_cd                     = del_cd                    	;	}
	public void setTrsp_evnt_tms             ( String                     trsp_evnt_tms              ){	this.trsp_evnt_tms              = trsp_evnt_tms             	;	}
	public void setEdi_cgo_rmk               ( String                     edi_cgo_rmk                ){	this.edi_cgo_rmk                = edi_cgo_rmk               	;	}

	public static EDI_USA_IB_CGO_RLSE fromRequest(HttpServletRequest request) {
		EDI_USA_IB_CGO_RLSE model = new EDI_USA_IB_CGO_RLSE();
		try {
			model.setIbflag                    	(JSPUtil.getParameter(request, "ibflag                    		".trim(), ""));
			model.setPage_rows                 	(JSPUtil.getParameter(request, "page_rows                 		".trim(), ""));
			model.setBl_no                     	(JSPUtil.getParameter(request, "bl_no                     		".trim(), ""));
			model.setBl_no_tp                  	(JSPUtil.getParameter(request, "bl_no_tp                  		".trim(), ""));
			model.setBl_no_chk                 	(JSPUtil.getParameter(request, "bl_no_chk                 		".trim(), ""));
			model.setBkg_no                    	(JSPUtil.getParameter(request, "bkg_no                    		".trim(), ""));
			model.setBkg_no_split              	(JSPUtil.getParameter(request, "bkg_no_split              		".trim(), ""));
			model.setIbd_bkg_sts_cd            	(JSPUtil.getParameter(request, "ibd_bkg_sts_cd            		".trim(), ""));
			model.setVsl_cd                    	(JSPUtil.getParameter(request, "vsl_cd                    		".trim(), ""));
			model.setSkd_voy_no                	(JSPUtil.getParameter(request, "skd_voy_no                		".trim(), ""));
			model.setSkd_dir_cd                	(JSPUtil.getParameter(request, "skd_dir_cd                		".trim(), ""));
			model.setVsl_dchg_port_cd          	(JSPUtil.getParameter(request, "vsl_dchg_port_cd          		".trim(), ""));
			model.setIbd_trsp_hub_cty_cd       	(JSPUtil.getParameter(request, "ibd_trsp_hub_cty_cd       		".trim(), ""));
			model.setIbd_cstms_clr_loc_cd      	(JSPUtil.getParameter(request, "ibd_cstms_clr_loc_cd      		".trim(), ""));
			model.setIbd_tp_cd                 	(JSPUtil.getParameter(request, "ibd_tp_cd                 		".trim(), ""));
			model.setIbd_no                    	(JSPUtil.getParameter(request, "ibd_no                    		".trim(), ""));
			model.setIbd_iss_dt                	(JSPUtil.getParameter(request, "ibd_iss_dt                		".trim(), ""));
			model.setIbd_cstms_clr_ind_cd      	(JSPUtil.getParameter(request, "ibd_cstms_clr_ind_cd      		".trim(), ""));
			model.setIbd_ipi_locl_ind_cd       	(JSPUtil.getParameter(request, "ibd_ipi_locl_ind_cd       		".trim(), ""));
			model.setIbd_non_vsl_op_crr_ftr_cd 	(JSPUtil.getParameter(request, "ibd_non_vsl_op_crr_ftr_cd 		".trim(), ""));
			model.setCgor_frt_pay_ind_flg      	(JSPUtil.getParameter(request, "cgor_frt_pay_ind_flg      		".trim(), ""));
			model.setCgor_org_bl_rcvr_ind_flg  	(JSPUtil.getParameter(request, "cgor_org_bl_rcvr_ind_flg  		".trim(), ""));
			model.setCgor_cstms_acpt_re_ind_flg	(JSPUtil.getParameter(request, "cgor_cstms_acpt_re_ind_flg		".trim(), ""));
			model.setCgor_ar_upd_dt            	(JSPUtil.getParameter(request, "cgor_ar_upd_dt            		".trim(), ""));
			model.setCgor_org_bl_upd_dt        	(JSPUtil.getParameter(request, "cgor_org_bl_upd_dt        		".trim(), ""));
			model.setCgor_cust_edi_flg         	(JSPUtil.getParameter(request, "cgor_cust_edi_flg         		".trim(), ""));
			model.setCgor_cust_edi_dt          	(JSPUtil.getParameter(request, "cgor_cust_edi_dt          		".trim(), ""));
			model.setCstms_acpt_flg            	(JSPUtil.getParameter(request, "cstms_acpt_flg            		".trim(), ""));
			model.setIb_trns_no                	(JSPUtil.getParameter(request, "ib_trns_no                		".trim(), ""));
			model.setCnd_loc_gds_cd            	(JSPUtil.getParameter(request, "cnd_loc_gds_cd            		".trim(), ""));
			model.setCnd_ibd_no                	(JSPUtil.getParameter(request, "cnd_ibd_no                		".trim(), ""));
			model.setCnd_mrn_no                	(JSPUtil.getParameter(request, "cnd_mrn_no                		".trim(), ""));
			model.setAms_ins_dt                	(JSPUtil.getParameter(request, "ams_ins_dt                		".trim(), ""));
			model.setAms_upd_dt                	(JSPUtil.getParameter(request, "ams_upd_dt                		".trim(), ""));
			model.setEai_evnt_dt               	(JSPUtil.getParameter(request, "eai_evnt_dt               		".trim(), ""));
			model.setCgor_frt_upd_dt           	(JSPUtil.getParameter(request, "cgor_frt_upd_dt           		".trim(), ""));
			model.setDel_cd                    	(JSPUtil.getParameter(request, "del_cd                    		".trim(), ""));
			model.setTrsp_evnt_tms             	(JSPUtil.getParameter(request, "trsp_evnt_tms             		".trim(), ""));
			model.setEdi_cgo_rmk               	(JSPUtil.getParameter(request, "edi_cgo_rmk               		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		EDI_USA_IB_CGO_RLSE model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag                     =  (JSPUtil.getParameter(request, "ibflag                    		".trim(), length));
			String[] page_rows                  =  (JSPUtil.getParameter(request, "page_rows                 		".trim(), length));
			String[] bl_no                      =  (JSPUtil.getParameter(request, "bl_no                     		".trim(), length));
			String[] bl_no_tp                   =  (JSPUtil.getParameter(request, "bl_no_tp                  		".trim(), length));
			String[] bl_no_chk                  =  (JSPUtil.getParameter(request, "bl_no_chk                 		".trim(), length));
			String[] bkg_no                     =  (JSPUtil.getParameter(request, "bkg_no                    		".trim(), length));
			String[] bkg_no_split               =  (JSPUtil.getParameter(request, "bkg_no_split              		".trim(), length));
			String[] ibd_bkg_sts_cd             =  (JSPUtil.getParameter(request, "ibd_bkg_sts_cd            		".trim(), length));
			String[] vsl_cd                     =  (JSPUtil.getParameter(request, "vsl_cd                    		".trim(), length));
			String[] skd_voy_no                 =  (JSPUtil.getParameter(request, "skd_voy_no                		".trim(), length));
			String[] skd_dir_cd                 =  (JSPUtil.getParameter(request, "skd_dir_cd                		".trim(), length));
			String[] vsl_dchg_port_cd           =  (JSPUtil.getParameter(request, "vsl_dchg_port_cd          		".trim(), length));
			String[] ibd_trsp_hub_cty_cd        =  (JSPUtil.getParameter(request, "ibd_trsp_hub_cty_cd       		".trim(), length));
			String[] ibd_cstms_clr_loc_cd       =  (JSPUtil.getParameter(request, "ibd_cstms_clr_loc_cd      		".trim(), length));
			String[] ibd_tp_cd                  =  (JSPUtil.getParameter(request, "ibd_tp_cd                 		".trim(), length));
			String[] ibd_no                     =  (JSPUtil.getParameter(request, "ibd_no                    		".trim(), length));
			String[] ibd_iss_dt                 =  (JSPUtil.getParameter(request, "ibd_iss_dt                		".trim(), length));
			String[] ibd_cstms_clr_ind_cd       =  (JSPUtil.getParameter(request, "ibd_cstms_clr_ind_cd      		".trim(), length));
			String[] ibd_ipi_locl_ind_cd        =  (JSPUtil.getParameter(request, "ibd_ipi_locl_ind_cd       		".trim(), length));
			String[] ibd_non_vsl_op_crr_ftr_cd  =  (JSPUtil.getParameter(request, "ibd_non_vsl_op_crr_ftr_cd 		".trim(), length));
			String[] cgor_frt_pay_ind_flg       =  (JSPUtil.getParameter(request, "cgor_frt_pay_ind_flg      		".trim(), length));
			String[] cgor_org_bl_rcvr_ind_flg   =  (JSPUtil.getParameter(request, "cgor_org_bl_rcvr_ind_flg  		".trim(), length));
			String[] cgor_cstms_acpt_re_ind_flg =  (JSPUtil.getParameter(request, "cgor_cstms_acpt_re_ind_flg		".trim(), length));
			String[] cgor_ar_upd_dt             =  (JSPUtil.getParameter(request, "cgor_ar_upd_dt            		".trim(), length));
			String[] cgor_org_bl_upd_dt         =  (JSPUtil.getParameter(request, "cgor_org_bl_upd_dt        		".trim(), length));
			String[] cgor_cust_edi_flg          =  (JSPUtil.getParameter(request, "cgor_cust_edi_flg         		".trim(), length));
			String[] cgor_cust_edi_dt           =  (JSPUtil.getParameter(request, "cgor_cust_edi_dt          		".trim(), length));
			String[] cstms_acpt_flg             =  (JSPUtil.getParameter(request, "cstms_acpt_flg            		".trim(), length));
			String[] ib_trns_no                 =  (JSPUtil.getParameter(request, "ib_trns_no                		".trim(), length));
			String[] cnd_loc_gds_cd             =  (JSPUtil.getParameter(request, "cnd_loc_gds_cd            		".trim(), length));
			String[] cnd_ibd_no                 =  (JSPUtil.getParameter(request, "cnd_ibd_no                		".trim(), length));
			String[] cnd_mrn_no                 =  (JSPUtil.getParameter(request, "cnd_mrn_no                		".trim(), length));
			String[] ams_ins_dt                 =  (JSPUtil.getParameter(request, "ams_ins_dt                		".trim(), length));
			String[] ams_upd_dt                 =  (JSPUtil.getParameter(request, "ams_upd_dt                		".trim(), length));
			String[] eai_evnt_dt                =  (JSPUtil.getParameter(request, "eai_evnt_dt               		".trim(), length));
			String[] cgor_frt_upd_dt            =  (JSPUtil.getParameter(request, "cgor_frt_upd_dt           		".trim(), length));
			String[] del_cd                     =  (JSPUtil.getParameter(request, "del_cd                    		".trim(), length));
			String[] trsp_evnt_tms              =  (JSPUtil.getParameter(request, "trsp_evnt_tms             		".trim(), length));
			String[] edi_cgo_rmk                =  (JSPUtil.getParameter(request, "edi_cgo_rmk               		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new EDI_USA_IB_CGO_RLSE();
				model.setIbflag                    		  (ibflag                    	[i]);
				model.setPage_rows                 		  (page_rows                 	[i]);
				model.setBl_no                     		  (bl_no                     	[i]);
				model.setBl_no_tp                  		  (bl_no_tp                  	[i]);
				model.setBl_no_chk                 		  (bl_no_chk                 	[i]);
				model.setBkg_no                    		  (bkg_no                    	[i]);
				model.setBkg_no_split              		  (bkg_no_split              	[i]);
				model.setIbd_bkg_sts_cd            		  (ibd_bkg_sts_cd            	[i]);
				model.setVsl_cd                    		  (vsl_cd                    	[i]);
				model.setSkd_voy_no                		  (skd_voy_no                	[i]);
				model.setSkd_dir_cd                		  (skd_dir_cd                	[i]);
				model.setVsl_dchg_port_cd          		  (vsl_dchg_port_cd          	[i]);
				model.setIbd_trsp_hub_cty_cd       		  (ibd_trsp_hub_cty_cd       	[i]);
				model.setIbd_cstms_clr_loc_cd      		  (ibd_cstms_clr_loc_cd      	[i]);
				model.setIbd_tp_cd                 		  (ibd_tp_cd                 	[i]);
				model.setIbd_no                    		  (ibd_no                    	[i]);
				model.setIbd_iss_dt                		  (ibd_iss_dt                	[i]);
				model.setIbd_cstms_clr_ind_cd      		  (ibd_cstms_clr_ind_cd      	[i]);
				model.setIbd_ipi_locl_ind_cd       		  (ibd_ipi_locl_ind_cd       	[i]);
				model.setIbd_non_vsl_op_crr_ftr_cd 		  (ibd_non_vsl_op_crr_ftr_cd 	[i]);
				model.setCgor_frt_pay_ind_flg      		  (cgor_frt_pay_ind_flg      	[i]);
				model.setCgor_org_bl_rcvr_ind_flg  		  (cgor_org_bl_rcvr_ind_flg  	[i]);
				model.setCgor_cstms_acpt_re_ind_flg		  (cgor_cstms_acpt_re_ind_flg	[i]);
				model.setCgor_ar_upd_dt            		  (cgor_ar_upd_dt            	[i]);
				model.setCgor_org_bl_upd_dt        		  (cgor_org_bl_upd_dt        	[i]);
				model.setCgor_cust_edi_flg         		  (cgor_cust_edi_flg         	[i]);
				model.setCgor_cust_edi_dt          		  (cgor_cust_edi_dt          	[i]);
				model.setCstms_acpt_flg            		  (cstms_acpt_flg            	[i]);
				model.setIb_trns_no                		  (ib_trns_no                	[i]);
				model.setCnd_loc_gds_cd            		  (cnd_loc_gds_cd            	[i]);
				model.setCnd_ibd_no                		  (cnd_ibd_no                	[i]);
				model.setCnd_mrn_no                		  (cnd_mrn_no                	[i]);
				model.setAms_ins_dt                		  (ams_ins_dt                	[i]);
				model.setAms_upd_dt                		  (ams_upd_dt                	[i]);
				model.setEai_evnt_dt               		  (eai_evnt_dt               	[i]);
				model.setCgor_frt_upd_dt           		  (cgor_frt_upd_dt           	[i]);
				model.setDel_cd                    		  (del_cd                    	[i]);
				model.setTrsp_evnt_tms             		  (trsp_evnt_tms             	[i]);
				model.setEdi_cgo_rmk               		  (edi_cgo_rmk               	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		EDI_USA_IB_CGO_RLSE model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues(prefix+"ibflag")==null?0:request.getParameterValues(prefix+"ibflag").length;
		try {
			String[] ibflag                     =  (JSPUtil.getParameter(request, prefix + "ibflag                    		".trim(), length));
			String[] page_rows                  =  (JSPUtil.getParameter(request, prefix + "page_rows                 		".trim(), length));
			String[] bl_no                      =  (JSPUtil.getParameter(request, prefix + "bl_no                     		".trim(), length));
			String[] bl_no_tp                   =  (JSPUtil.getParameter(request, prefix + "bl_no_tp                  		".trim(), length));
			String[] bl_no_chk                  =  (JSPUtil.getParameter(request, prefix + "bl_no_chk                 		".trim(), length));
			String[] bkg_no                     =  (JSPUtil.getParameter(request, prefix + "bkg_no                    		".trim(), length));
			String[] bkg_no_split               =  (JSPUtil.getParameter(request, prefix + "bkg_no_split              		".trim(), length));
			String[] ibd_bkg_sts_cd             =  (JSPUtil.getParameter(request, prefix + "ibd_bkg_sts_cd            		".trim(), length));
			String[] vsl_cd                     =  (JSPUtil.getParameter(request, prefix + "vsl_cd                    		".trim(), length));
			String[] skd_voy_no                 =  (JSPUtil.getParameter(request, prefix + "skd_voy_no                		".trim(), length));
			String[] skd_dir_cd                 =  (JSPUtil.getParameter(request, prefix + "skd_dir_cd                		".trim(), length));
			String[] vsl_dchg_port_cd           =  (JSPUtil.getParameter(request, prefix + "vsl_dchg_port_cd          		".trim(), length));
			String[] ibd_trsp_hub_cty_cd        =  (JSPUtil.getParameter(request, prefix + "ibd_trsp_hub_cty_cd       		".trim(), length));
			String[] ibd_cstms_clr_loc_cd       =  (JSPUtil.getParameter(request, prefix + "ibd_cstms_clr_loc_cd      		".trim(), length));
			String[] ibd_tp_cd                  =  (JSPUtil.getParameter(request, prefix + "ibd_tp_cd                 		".trim(), length));
			String[] ibd_no                     =  (JSPUtil.getParameter(request, prefix + "ibd_no                    		".trim(), length));
			String[] ibd_iss_dt                 =  (JSPUtil.getParameter(request, prefix + "ibd_iss_dt                		".trim(), length));
			String[] ibd_cstms_clr_ind_cd       =  (JSPUtil.getParameter(request, prefix + "ibd_cstms_clr_ind_cd      		".trim(), length));
			String[] ibd_ipi_locl_ind_cd        =  (JSPUtil.getParameter(request, prefix + "ibd_ipi_locl_ind_cd       		".trim(), length));
			String[] ibd_non_vsl_op_crr_ftr_cd  =  (JSPUtil.getParameter(request, prefix + "ibd_non_vsl_op_crr_ftr_cd 		".trim(), length));
			String[] cgor_frt_pay_ind_flg       =  (JSPUtil.getParameter(request, prefix + "cgor_frt_pay_ind_flg      		".trim(), length));
			String[] cgor_org_bl_rcvr_ind_flg   =  (JSPUtil.getParameter(request, prefix + "cgor_org_bl_rcvr_ind_flg  		".trim(), length));
			String[] cgor_cstms_acpt_re_ind_flg =  (JSPUtil.getParameter(request, prefix + "cgor_cstms_acpt_re_ind_flg		".trim(), length));
			String[] cgor_ar_upd_dt             =  (JSPUtil.getParameter(request, prefix + "cgor_ar_upd_dt            		".trim(), length));
			String[] cgor_org_bl_upd_dt         =  (JSPUtil.getParameter(request, prefix + "cgor_org_bl_upd_dt        		".trim(), length));
			String[] cgor_cust_edi_flg          =  (JSPUtil.getParameter(request, prefix + "cgor_cust_edi_flg         		".trim(), length));
			String[] cgor_cust_edi_dt           =  (JSPUtil.getParameter(request, prefix + "cgor_cust_edi_dt          		".trim(), length));
			String[] cstms_acpt_flg             =  (JSPUtil.getParameter(request, prefix + "cstms_acpt_flg            		".trim(), length));
			String[] ib_trns_no                 =  (JSPUtil.getParameter(request, prefix + "ib_trns_no                		".trim(), length));
			String[] cnd_loc_gds_cd             =  (JSPUtil.getParameter(request, prefix + "cnd_loc_gds_cd            		".trim(), length));
			String[] cnd_ibd_no                 =  (JSPUtil.getParameter(request, prefix + "cnd_ibd_no                		".trim(), length));
			String[] cnd_mrn_no                 =  (JSPUtil.getParameter(request, prefix + "cnd_mrn_no                		".trim(), length));
			String[] ams_ins_dt                 =  (JSPUtil.getParameter(request, prefix + "ams_ins_dt                		".trim(), length));
			String[] ams_upd_dt                 =  (JSPUtil.getParameter(request, prefix + "ams_upd_dt                		".trim(), length));
			String[] eai_evnt_dt                =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt               		".trim(), length));
			String[] cgor_frt_upd_dt            =  (JSPUtil.getParameter(request, prefix + "cgor_frt_upd_dt           		".trim(), length));
			String[] del_cd                     =  (JSPUtil.getParameter(request, prefix + "del_cd                    		".trim(), length));
			String[] trsp_evnt_tms              =  (JSPUtil.getParameter(request, prefix + "trsp_evnt_tms             		".trim(), length));
			String[] edi_cgo_rmk                =  (JSPUtil.getParameter(request, prefix + "edi_cgo_rmk               		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new EDI_USA_IB_CGO_RLSE();
				model.setIbflag                    		  ( ibflag                    	[i]);
				model.setPage_rows                 		  ( page_rows                 	[i]);
				model.setBl_no                     		  ( bl_no                     	[i]);
				model.setBl_no_tp                  		  ( bl_no_tp                  	[i]);
				model.setBl_no_chk                 		  ( bl_no_chk                 	[i]);
				model.setBkg_no                    		  ( bkg_no                    	[i]);
				model.setBkg_no_split              		  ( bkg_no_split              	[i]);
				model.setIbd_bkg_sts_cd            		  ( ibd_bkg_sts_cd            	[i]);
				model.setVsl_cd                    		  ( vsl_cd                    	[i]);
				model.setSkd_voy_no                		  ( skd_voy_no                	[i]);
				model.setSkd_dir_cd                		  ( skd_dir_cd                	[i]);
				model.setVsl_dchg_port_cd          		  ( vsl_dchg_port_cd          	[i]);
				model.setIbd_trsp_hub_cty_cd       		  ( ibd_trsp_hub_cty_cd       	[i]);
				model.setIbd_cstms_clr_loc_cd      		  ( ibd_cstms_clr_loc_cd      	[i]);
				model.setIbd_tp_cd                 		  ( ibd_tp_cd                 	[i]);
				model.setIbd_no                    		  ( ibd_no                    	[i]);
				model.setIbd_iss_dt                		  ( ibd_iss_dt                	[i]);
				model.setIbd_cstms_clr_ind_cd      		  ( ibd_cstms_clr_ind_cd      	[i]);
				model.setIbd_ipi_locl_ind_cd       		  ( ibd_ipi_locl_ind_cd       	[i]);
				model.setIbd_non_vsl_op_crr_ftr_cd 		  ( ibd_non_vsl_op_crr_ftr_cd 	[i]);
				model.setCgor_frt_pay_ind_flg      		  ( cgor_frt_pay_ind_flg      	[i]);
				model.setCgor_org_bl_rcvr_ind_flg  		  ( cgor_org_bl_rcvr_ind_flg  	[i]);
				model.setCgor_cstms_acpt_re_ind_flg		  ( cgor_cstms_acpt_re_ind_flg	[i]);
				model.setCgor_ar_upd_dt            		  ( cgor_ar_upd_dt            	[i]);
				model.setCgor_org_bl_upd_dt        		  ( cgor_org_bl_upd_dt        	[i]);
				model.setCgor_cust_edi_flg         		  ( cgor_cust_edi_flg         	[i]);
				model.setCgor_cust_edi_dt          		  ( cgor_cust_edi_dt          	[i]);
				model.setCstms_acpt_flg            		  ( cstms_acpt_flg            	[i]);
				model.setIb_trns_no                		  ( ib_trns_no                	[i]);
				model.setCnd_loc_gds_cd            		  ( cnd_loc_gds_cd            	[i]);
				model.setCnd_ibd_no                		  ( cnd_ibd_no                	[i]);
				model.setCnd_mrn_no                		  ( cnd_mrn_no                	[i]);
				model.setAms_ins_dt                		  ( ams_ins_dt                	[i]);
				model.setAms_upd_dt                		  ( ams_upd_dt                	[i]);
				model.setEai_evnt_dt               		  ( eai_evnt_dt               	[i]);
				model.setCgor_frt_upd_dt           		  ( cgor_frt_upd_dt           	[i]);
				model.setDel_cd                    		  ( del_cd                    	[i]);
				model.setTrsp_evnt_tms             		  ( trsp_evnt_tms             	[i]);
				model.setEdi_cgo_rmk               		  ( edi_cgo_rmk               	[i]);
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
