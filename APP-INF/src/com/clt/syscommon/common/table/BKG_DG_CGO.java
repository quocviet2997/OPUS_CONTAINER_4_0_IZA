/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : BKG_DG_CGO.java
*@FileTitle : 사용자 관리5
*Open Issues :
*Change history :
*@LastModifyDate : 2007-01-25
*@LastModifier : Kildong_hong6
*@LastVersion : 1.0
* 2007-01-25 Kildong_hong6
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
public final class BKG_DG_CGO implements java.io.Serializable {

	private String                      ibflag                      = "";
	private String                      page_rows                   = "";
	private String                      bkg_no                      = "";
	private String                      bkg_no_split                = "";
	private String                      dcgo_seq                    = "";
	private String                      dcgo_un_no                  = "";
	private String                      dcgo_un_no_seq              = "";
	private String                      dcgo_net_wgt                = "";
	private String                      dcgo_wgt_tp_cd              = "";
	private String                      dcgo_grs_wgt                = "";
	private String                      dcgo_flsh_pnt_fdo_temp_ctnt = "";
	private String                      dcgo_rqst_dt                = "";
	private String                      dcgo_act_shp_nm             = "";
	private String                      dcgo_meas_qty               = "";
	private String                      dcgo_meas_tp_cd             = "";
	private String                      dcgo_imo_clss_cd            = "";
	private String                      dcgo_hzd_desc               = "";
	private String                      dcgo_tnk_tp_cd              = "";
	private String                      dcgo_stwg_instr_desc        = "";
	private String                      dcgo_vapr_cd                = "";
	private String                      dcgo_emer_cntc_pnt_nm       = "";
	private String                      cntr_tpsz_cd                = "";
	private String                      cntr_no                     = "";
	private String                      dcgo_auth_flg               = "";
	private String                      dcgo_rjct_rsn               = "";
	private String                      dcgo_rmk                    = "";
	private String                      dcgo_pck_qty                = "";
	private String                      dcgo_pck_cd                 = "";
	private String                      dcgo_rc_seq                 = "";
	private String                      dcgo_rslt_cd                = "";
	private String                      dcgo_auth_usr_id            = "";
	private String                      dcgo_auth_dt                = "";
	private String                      dcgo_lcl_ind_cd             = "";
	private String                      dcgo_cnsl_un_no             = "";
	private String                      dcgo_sts_cd                 = "";
	private String                      dcgo_cntr_ser_no            = "";
	private String                      dcgo_imo_comp_grp_cd        = "";
	private String                      dcgo_flsh_pnt_temp          = "";
	private String                      dcgo_n1st_pck_grp_cd        = "";
	private String                      dcgo_n2nd_pck_grp_cd        = "";
	private String                      dcgo_n3rd_pck_grp_cd        = "";
	private String                      dcgo_mrn_polut_cd           = "";
	private String                      dcgo_psa_cd                 = "";
	private String                      dcgo_cntr_sub_ser_no        = "";
	private String                      dcgo_certi_no               = "";
	private String                      dcgo_in_pck_n1st_qty        = "";
	private String                      dcgo_in_pck_n1st_tp_cd      = "";
	private String                      dcgo_in_pck_n2nd_qty        = "";
	private String                      dcgo_in_pck_n2nd_tp_cd      = "";
	private String                      dcgo_out_pck_n1st_qty       = "";
	private String                      dcgo_out_pck_n1st_tp_cd     = "";
	private String                      dcgo_out_pck_n2nd_qty       = "";
	private String                      dcgo_out_pck_n2nd_tp_cd     = "";
	private String                      dcgo_sub_lbl_desc           = "";
	private String                      dcgo_imo_pck_no             = "";
	private String                      dcgo_ems_no                 = "";
	private String                      dcgo_meas_no                = "";
	private String                      dcgo_emer_no                = "";
	private String                      dcgo_cnee_dtl_desc          = "";
	private String                      dcgo_net_explo_wgt          = "";
	private String                      dcgo_rada_skd_cd            = "";
	private String                      dcgo_rada_qty               = "";
	private String                      dcgo_rada_tp_cd             = "";
	private String                      dcgo_rada_trsp_id           = "";
	private String                      dcgo_ctrl_temp_ctnt         = "";
	private String                      dcgo_emer_temp_ctnt         = "";
	private String                      dcgo_rqst_no                = "";
	private String                      dcgo_appl_usr_id            = "";
	private String                      dcgo_awk_ind_cd             = "";
	private String                      dcgo_bb_ind_cd              = "";
	private String                      dcgo_rf_ind_cd              = "";
	private String                      dcgo_clod_ind_cd            = "";
	private String                      dcgo_tp_seq                 = "";
	private String                      dcgo_psa_clss_cd            = "";
	private String                      dcgo_emer_chr_cd            = "";
	private String                      dcgo_mft_n1st_no            = "";
	private String                      dcgo_mft_n2nd_no            = "";
	private String                      dcgo_mft_sub_no             = "";
	private String                      nis_evnt_dt                 = "";
	private String                      dcgo_in_max_qty             = "";
	private String                      dcgo_in_max_tp_cd           = "";
	private String                      dcgo_imo_lmt_flg            = "";
	private String                      dcgo_hcdg_flg               = "";
	private String                      dcgo_hcdg_dpnd_flg          = "";
	private String                      eai_evnt_dt                 = "";

	public BKG_DG_CGO(){}

	public BKG_DG_CGO(
			String                      ibflag                     ,
			String                      page_rows                  ,
			String                      bkg_no                     ,
			String                      bkg_no_split               ,
			String                      dcgo_seq                   ,
			String                      dcgo_un_no                 ,
			String                      dcgo_un_no_seq             ,
			String                      dcgo_net_wgt               ,
			String                      dcgo_wgt_tp_cd             ,
			String                      dcgo_grs_wgt               ,
			String                      dcgo_flsh_pnt_fdo_temp_ctnt,
			String                      dcgo_rqst_dt               ,
			String                      dcgo_act_shp_nm            ,
			String                      dcgo_meas_qty              ,
			String                      dcgo_meas_tp_cd            ,
			String                      dcgo_imo_clss_cd           ,
			String                      dcgo_hzd_desc              ,
			String                      dcgo_tnk_tp_cd             ,
			String                      dcgo_stwg_instr_desc       ,
			String                      dcgo_vapr_cd               ,
			String                      dcgo_emer_cntc_pnt_nm      ,
			String                      cntr_tpsz_cd               ,
			String                      cntr_no                    ,
			String                      dcgo_auth_flg              ,
			String                      dcgo_rjct_rsn              ,
			String                      dcgo_rmk                   ,
			String                      dcgo_pck_qty               ,
			String                      dcgo_pck_cd                ,
			String                      dcgo_rc_seq                ,
			String                      dcgo_rslt_cd               ,
			String                      dcgo_auth_usr_id           ,
			String                      dcgo_auth_dt               ,
			String                      dcgo_lcl_ind_cd            ,
			String                      dcgo_cnsl_un_no            ,
			String                      dcgo_sts_cd                ,
			String                      dcgo_cntr_ser_no           ,
			String                      dcgo_imo_comp_grp_cd       ,
			String                      dcgo_flsh_pnt_temp         ,
			String                      dcgo_n1st_pck_grp_cd       ,
			String                      dcgo_n2nd_pck_grp_cd       ,
			String                      dcgo_n3rd_pck_grp_cd       ,
			String                      dcgo_mrn_polut_cd          ,
			String                      dcgo_psa_cd                ,
			String                      dcgo_cntr_sub_ser_no       ,
			String                      dcgo_certi_no              ,
			String                      dcgo_in_pck_n1st_qty       ,
			String                      dcgo_in_pck_n1st_tp_cd     ,
			String                      dcgo_in_pck_n2nd_qty       ,
			String                      dcgo_in_pck_n2nd_tp_cd     ,
			String                      dcgo_out_pck_n1st_qty      ,
			String                      dcgo_out_pck_n1st_tp_cd    ,
			String                      dcgo_out_pck_n2nd_qty      ,
			String                      dcgo_out_pck_n2nd_tp_cd    ,
			String                      dcgo_sub_lbl_desc          ,
			String                      dcgo_imo_pck_no            ,
			String                      dcgo_ems_no                ,
			String                      dcgo_meas_no               ,
			String                      dcgo_emer_no               ,
			String                      dcgo_cnee_dtl_desc         ,
			String                      dcgo_net_explo_wgt         ,
			String                      dcgo_rada_skd_cd           ,
			String                      dcgo_rada_qty              ,
			String                      dcgo_rada_tp_cd            ,
			String                      dcgo_rada_trsp_id          ,
			String                      dcgo_ctrl_temp_ctnt        ,
			String                      dcgo_emer_temp_ctnt        ,
			String                      dcgo_rqst_no               ,
			String                      dcgo_appl_usr_id           ,
			String                      dcgo_awk_ind_cd            ,
			String                      dcgo_bb_ind_cd             ,
			String                      dcgo_rf_ind_cd             ,
			String                      dcgo_clod_ind_cd           ,
			String                      dcgo_tp_seq                ,
			String                      dcgo_psa_clss_cd           ,
			String                      dcgo_emer_chr_cd           ,
			String                      dcgo_mft_n1st_no           ,
			String                      dcgo_mft_n2nd_no           ,
			String                      dcgo_mft_sub_no            ,
			String                      nis_evnt_dt                ,
			String                      dcgo_in_max_qty            ,
			String                      dcgo_in_max_tp_cd          ,
			String                      dcgo_imo_lmt_flg           ,
			String                      dcgo_hcdg_flg              ,
			String                      dcgo_hcdg_dpnd_flg         ,
			String                      eai_evnt_dt                ){
		this.ibflag                      = ibflag                     ;
		this.page_rows                   = page_rows                  ;
		this.bkg_no                      = bkg_no                     ;
		this.bkg_no_split                = bkg_no_split               ;
		this.dcgo_seq                    = dcgo_seq                   ;
		this.dcgo_un_no                  = dcgo_un_no                 ;
		this.dcgo_un_no_seq              = dcgo_un_no_seq             ;
		this.dcgo_net_wgt                = dcgo_net_wgt               ;
		this.dcgo_wgt_tp_cd              = dcgo_wgt_tp_cd             ;
		this.dcgo_grs_wgt                = dcgo_grs_wgt               ;
		this.dcgo_flsh_pnt_fdo_temp_ctnt = dcgo_flsh_pnt_fdo_temp_ctnt;
		this.dcgo_rqst_dt                = dcgo_rqst_dt               ;
		this.dcgo_act_shp_nm             = dcgo_act_shp_nm            ;
		this.dcgo_meas_qty               = dcgo_meas_qty              ;
		this.dcgo_meas_tp_cd             = dcgo_meas_tp_cd            ;
		this.dcgo_imo_clss_cd            = dcgo_imo_clss_cd           ;
		this.dcgo_hzd_desc               = dcgo_hzd_desc              ;
		this.dcgo_tnk_tp_cd              = dcgo_tnk_tp_cd             ;
		this.dcgo_stwg_instr_desc        = dcgo_stwg_instr_desc       ;
		this.dcgo_vapr_cd                = dcgo_vapr_cd               ;
		this.dcgo_emer_cntc_pnt_nm       = dcgo_emer_cntc_pnt_nm      ;
		this.cntr_tpsz_cd                = cntr_tpsz_cd               ;
		this.cntr_no                     = cntr_no                    ;
		this.dcgo_auth_flg               = dcgo_auth_flg              ;
		this.dcgo_rjct_rsn               = dcgo_rjct_rsn              ;
		this.dcgo_rmk                    = dcgo_rmk                   ;
		this.dcgo_pck_qty                = dcgo_pck_qty               ;
		this.dcgo_pck_cd                 = dcgo_pck_cd                ;
		this.dcgo_rc_seq                 = dcgo_rc_seq                ;
		this.dcgo_rslt_cd                = dcgo_rslt_cd               ;
		this.dcgo_auth_usr_id            = dcgo_auth_usr_id           ;
		this.dcgo_auth_dt                = dcgo_auth_dt               ;
		this.dcgo_lcl_ind_cd             = dcgo_lcl_ind_cd            ;
		this.dcgo_cnsl_un_no             = dcgo_cnsl_un_no            ;
		this.dcgo_sts_cd                 = dcgo_sts_cd                ;
		this.dcgo_cntr_ser_no            = dcgo_cntr_ser_no           ;
		this.dcgo_imo_comp_grp_cd        = dcgo_imo_comp_grp_cd       ;
		this.dcgo_flsh_pnt_temp          = dcgo_flsh_pnt_temp         ;
		this.dcgo_n1st_pck_grp_cd        = dcgo_n1st_pck_grp_cd       ;
		this.dcgo_n2nd_pck_grp_cd        = dcgo_n2nd_pck_grp_cd       ;
		this.dcgo_n3rd_pck_grp_cd        = dcgo_n3rd_pck_grp_cd       ;
		this.dcgo_mrn_polut_cd           = dcgo_mrn_polut_cd          ;
		this.dcgo_psa_cd                 = dcgo_psa_cd                ;
		this.dcgo_cntr_sub_ser_no        = dcgo_cntr_sub_ser_no       ;
		this.dcgo_certi_no               = dcgo_certi_no              ;
		this.dcgo_in_pck_n1st_qty        = dcgo_in_pck_n1st_qty       ;
		this.dcgo_in_pck_n1st_tp_cd      = dcgo_in_pck_n1st_tp_cd     ;
		this.dcgo_in_pck_n2nd_qty        = dcgo_in_pck_n2nd_qty       ;
		this.dcgo_in_pck_n2nd_tp_cd      = dcgo_in_pck_n2nd_tp_cd     ;
		this.dcgo_out_pck_n1st_qty       = dcgo_out_pck_n1st_qty      ;
		this.dcgo_out_pck_n1st_tp_cd     = dcgo_out_pck_n1st_tp_cd    ;
		this.dcgo_out_pck_n2nd_qty       = dcgo_out_pck_n2nd_qty      ;
		this.dcgo_out_pck_n2nd_tp_cd     = dcgo_out_pck_n2nd_tp_cd    ;
		this.dcgo_sub_lbl_desc           = dcgo_sub_lbl_desc          ;
		this.dcgo_imo_pck_no             = dcgo_imo_pck_no            ;
		this.dcgo_ems_no                 = dcgo_ems_no                ;
		this.dcgo_meas_no                = dcgo_meas_no               ;
		this.dcgo_emer_no                = dcgo_emer_no               ;
		this.dcgo_cnee_dtl_desc          = dcgo_cnee_dtl_desc         ;
		this.dcgo_net_explo_wgt          = dcgo_net_explo_wgt         ;
		this.dcgo_rada_skd_cd            = dcgo_rada_skd_cd           ;
		this.dcgo_rada_qty               = dcgo_rada_qty              ;
		this.dcgo_rada_tp_cd             = dcgo_rada_tp_cd            ;
		this.dcgo_rada_trsp_id           = dcgo_rada_trsp_id          ;
		this.dcgo_ctrl_temp_ctnt         = dcgo_ctrl_temp_ctnt        ;
		this.dcgo_emer_temp_ctnt         = dcgo_emer_temp_ctnt        ;
		this.dcgo_rqst_no                = dcgo_rqst_no               ;
		this.dcgo_appl_usr_id            = dcgo_appl_usr_id           ;
		this.dcgo_awk_ind_cd             = dcgo_awk_ind_cd            ;
		this.dcgo_bb_ind_cd              = dcgo_bb_ind_cd             ;
		this.dcgo_rf_ind_cd              = dcgo_rf_ind_cd             ;
		this.dcgo_clod_ind_cd            = dcgo_clod_ind_cd           ;
		this.dcgo_tp_seq                 = dcgo_tp_seq                ;
		this.dcgo_psa_clss_cd            = dcgo_psa_clss_cd           ;
		this.dcgo_emer_chr_cd            = dcgo_emer_chr_cd           ;
		this.dcgo_mft_n1st_no            = dcgo_mft_n1st_no           ;
		this.dcgo_mft_n2nd_no            = dcgo_mft_n2nd_no           ;
		this.dcgo_mft_sub_no             = dcgo_mft_sub_no            ;
		this.nis_evnt_dt                 = nis_evnt_dt                ;
		this.dcgo_in_max_qty             = dcgo_in_max_qty            ;
		this.dcgo_in_max_tp_cd           = dcgo_in_max_tp_cd          ;
		this.dcgo_imo_lmt_flg            = dcgo_imo_lmt_flg           ;
		this.dcgo_hcdg_flg               = dcgo_hcdg_flg              ;
		this.dcgo_hcdg_dpnd_flg          = dcgo_hcdg_dpnd_flg         ;
		this.eai_evnt_dt                 = eai_evnt_dt                ;
	}

	// getter method is proceeding ..
	public String                      getIbflag                     (){	return ibflag                     	;	}
	public String                      getPage_rows                  (){	return page_rows                  	;	}
	public String                      getBkg_no                     (){	return bkg_no                     	;	}
	public String                      getBkg_no_split               (){	return bkg_no_split               	;	}
	public String                      getDcgo_seq                   (){	return dcgo_seq                   	;	}
	public String                      getDcgo_un_no                 (){	return dcgo_un_no                 	;	}
	public String                      getDcgo_un_no_seq             (){	return dcgo_un_no_seq             	;	}
	public String                      getDcgo_net_wgt               (){	return dcgo_net_wgt               	;	}
	public String                      getDcgo_wgt_tp_cd             (){	return dcgo_wgt_tp_cd             	;	}
	public String                      getDcgo_grs_wgt               (){	return dcgo_grs_wgt               	;	}
	public String                      getDcgo_flsh_pnt_fdo_temp_ctnt(){	return dcgo_flsh_pnt_fdo_temp_ctnt	;	}
	public String                      getDcgo_rqst_dt               (){	return dcgo_rqst_dt               	;	}
	public String                      getDcgo_act_shp_nm            (){	return dcgo_act_shp_nm            	;	}
	public String                      getDcgo_meas_qty              (){	return dcgo_meas_qty              	;	}
	public String                      getDcgo_meas_tp_cd            (){	return dcgo_meas_tp_cd            	;	}
	public String                      getDcgo_imo_clss_cd           (){	return dcgo_imo_clss_cd           	;	}
	public String                      getDcgo_hzd_desc              (){	return dcgo_hzd_desc              	;	}
	public String                      getDcgo_tnk_tp_cd             (){	return dcgo_tnk_tp_cd             	;	}
	public String                      getDcgo_stwg_instr_desc       (){	return dcgo_stwg_instr_desc       	;	}
	public String                      getDcgo_vapr_cd               (){	return dcgo_vapr_cd               	;	}
	public String                      getDcgo_emer_cntc_pnt_nm      (){	return dcgo_emer_cntc_pnt_nm      	;	}
	public String                      getCntr_tpsz_cd               (){	return cntr_tpsz_cd               	;	}
	public String                      getCntr_no                    (){	return cntr_no                    	;	}
	public String                      getDcgo_auth_flg              (){	return dcgo_auth_flg              	;	}
	public String                      getDcgo_rjct_rsn              (){	return dcgo_rjct_rsn              	;	}
	public String                      getDcgo_rmk                   (){	return dcgo_rmk                   	;	}
	public String                      getDcgo_pck_qty               (){	return dcgo_pck_qty               	;	}
	public String                      getDcgo_pck_cd                (){	return dcgo_pck_cd                	;	}
	public String                      getDcgo_rc_seq                (){	return dcgo_rc_seq                	;	}
	public String                      getDcgo_rslt_cd               (){	return dcgo_rslt_cd               	;	}
	public String                      getDcgo_auth_usr_id           (){	return dcgo_auth_usr_id           	;	}
	public String                      getDcgo_auth_dt               (){	return dcgo_auth_dt               	;	}
	public String                      getDcgo_lcl_ind_cd            (){	return dcgo_lcl_ind_cd            	;	}
	public String                      getDcgo_cnsl_un_no            (){	return dcgo_cnsl_un_no            	;	}
	public String                      getDcgo_sts_cd                (){	return dcgo_sts_cd                	;	}
	public String                      getDcgo_cntr_ser_no           (){	return dcgo_cntr_ser_no           	;	}
	public String                      getDcgo_imo_comp_grp_cd       (){	return dcgo_imo_comp_grp_cd       	;	}
	public String                      getDcgo_flsh_pnt_temp         (){	return dcgo_flsh_pnt_temp         	;	}
	public String                      getDcgo_n1st_pck_grp_cd       (){	return dcgo_n1st_pck_grp_cd       	;	}
	public String                      getDcgo_n2nd_pck_grp_cd       (){	return dcgo_n2nd_pck_grp_cd       	;	}
	public String                      getDcgo_n3rd_pck_grp_cd       (){	return dcgo_n3rd_pck_grp_cd       	;	}
	public String                      getDcgo_mrn_polut_cd          (){	return dcgo_mrn_polut_cd          	;	}
	public String                      getDcgo_psa_cd                (){	return dcgo_psa_cd                	;	}
	public String                      getDcgo_cntr_sub_ser_no       (){	return dcgo_cntr_sub_ser_no       	;	}
	public String                      getDcgo_certi_no              (){	return dcgo_certi_no              	;	}
	public String                      getDcgo_in_pck_n1st_qty       (){	return dcgo_in_pck_n1st_qty       	;	}
	public String                      getDcgo_in_pck_n1st_tp_cd     (){	return dcgo_in_pck_n1st_tp_cd     	;	}
	public String                      getDcgo_in_pck_n2nd_qty       (){	return dcgo_in_pck_n2nd_qty       	;	}
	public String                      getDcgo_in_pck_n2nd_tp_cd     (){	return dcgo_in_pck_n2nd_tp_cd     	;	}
	public String                      getDcgo_out_pck_n1st_qty      (){	return dcgo_out_pck_n1st_qty      	;	}
	public String                      getDcgo_out_pck_n1st_tp_cd    (){	return dcgo_out_pck_n1st_tp_cd    	;	}
	public String                      getDcgo_out_pck_n2nd_qty      (){	return dcgo_out_pck_n2nd_qty      	;	}
	public String                      getDcgo_out_pck_n2nd_tp_cd    (){	return dcgo_out_pck_n2nd_tp_cd    	;	}
	public String                      getDcgo_sub_lbl_desc          (){	return dcgo_sub_lbl_desc          	;	}
	public String                      getDcgo_imo_pck_no            (){	return dcgo_imo_pck_no            	;	}
	public String                      getDcgo_ems_no                (){	return dcgo_ems_no                	;	}
	public String                      getDcgo_meas_no               (){	return dcgo_meas_no               	;	}
	public String                      getDcgo_emer_no               (){	return dcgo_emer_no               	;	}
	public String                      getDcgo_cnee_dtl_desc         (){	return dcgo_cnee_dtl_desc         	;	}
	public String                      getDcgo_net_explo_wgt         (){	return dcgo_net_explo_wgt         	;	}
	public String                      getDcgo_rada_skd_cd           (){	return dcgo_rada_skd_cd           	;	}
	public String                      getDcgo_rada_qty              (){	return dcgo_rada_qty              	;	}
	public String                      getDcgo_rada_tp_cd            (){	return dcgo_rada_tp_cd            	;	}
	public String                      getDcgo_rada_trsp_id          (){	return dcgo_rada_trsp_id          	;	}
	public String                      getDcgo_ctrl_temp_ctnt        (){	return dcgo_ctrl_temp_ctnt        	;	}
	public String                      getDcgo_emer_temp_ctnt        (){	return dcgo_emer_temp_ctnt        	;	}
	public String                      getDcgo_rqst_no               (){	return dcgo_rqst_no               	;	}
	public String                      getDcgo_appl_usr_id           (){	return dcgo_appl_usr_id           	;	}
	public String                      getDcgo_awk_ind_cd            (){	return dcgo_awk_ind_cd            	;	}
	public String                      getDcgo_bb_ind_cd             (){	return dcgo_bb_ind_cd             	;	}
	public String                      getDcgo_rf_ind_cd             (){	return dcgo_rf_ind_cd             	;	}
	public String                      getDcgo_clod_ind_cd           (){	return dcgo_clod_ind_cd           	;	}
	public String                      getDcgo_tp_seq                (){	return dcgo_tp_seq                	;	}
	public String                      getDcgo_psa_clss_cd           (){	return dcgo_psa_clss_cd           	;	}
	public String                      getDcgo_emer_chr_cd           (){	return dcgo_emer_chr_cd           	;	}
	public String                      getDcgo_mft_n1st_no           (){	return dcgo_mft_n1st_no           	;	}
	public String                      getDcgo_mft_n2nd_no           (){	return dcgo_mft_n2nd_no           	;	}
	public String                      getDcgo_mft_sub_no            (){	return dcgo_mft_sub_no            	;	}
	public String                      getNis_evnt_dt                (){	return nis_evnt_dt                	;	}
	public String                      getDcgo_in_max_qty            (){	return dcgo_in_max_qty            	;	}
	public String                      getDcgo_in_max_tp_cd          (){	return dcgo_in_max_tp_cd          	;	}
	public String                      getDcgo_imo_lmt_flg           (){	return dcgo_imo_lmt_flg           	;	}
	public String                      getDcgo_hcdg_flg              (){	return dcgo_hcdg_flg              	;	}
	public String                      getDcgo_hcdg_dpnd_flg         (){	return dcgo_hcdg_dpnd_flg         	;	}
	public String                      getEai_evnt_dt                (){	return eai_evnt_dt                	;	}

	// setter method is proceeding ..
	public void setIbflag                     ( String                      ibflag                      ){	this.ibflag                      = ibflag                     	;	}
	public void setPage_rows                  ( String                      page_rows                   ){	this.page_rows                   = page_rows                  	;	}
	public void setBkg_no                     ( String                      bkg_no                      ){	this.bkg_no                      = bkg_no                     	;	}
	public void setBkg_no_split               ( String                      bkg_no_split                ){	this.bkg_no_split                = bkg_no_split               	;	}
	public void setDcgo_seq                   ( String                      dcgo_seq                    ){	this.dcgo_seq                    = dcgo_seq                   	;	}
	public void setDcgo_un_no                 ( String                      dcgo_un_no                  ){	this.dcgo_un_no                  = dcgo_un_no                 	;	}
	public void setDcgo_un_no_seq             ( String                      dcgo_un_no_seq              ){	this.dcgo_un_no_seq              = dcgo_un_no_seq             	;	}
	public void setDcgo_net_wgt               ( String                      dcgo_net_wgt                ){	this.dcgo_net_wgt                = dcgo_net_wgt               	;	}
	public void setDcgo_wgt_tp_cd             ( String                      dcgo_wgt_tp_cd              ){	this.dcgo_wgt_tp_cd              = dcgo_wgt_tp_cd             	;	}
	public void setDcgo_grs_wgt               ( String                      dcgo_grs_wgt                ){	this.dcgo_grs_wgt                = dcgo_grs_wgt               	;	}
	public void setDcgo_flsh_pnt_fdo_temp_ctnt( String                      dcgo_flsh_pnt_fdo_temp_ctnt ){	this.dcgo_flsh_pnt_fdo_temp_ctnt = dcgo_flsh_pnt_fdo_temp_ctnt	;	}
	public void setDcgo_rqst_dt               ( String                      dcgo_rqst_dt                ){	this.dcgo_rqst_dt                = dcgo_rqst_dt               	;	}
	public void setDcgo_act_shp_nm            ( String                      dcgo_act_shp_nm             ){	this.dcgo_act_shp_nm             = dcgo_act_shp_nm            	;	}
	public void setDcgo_meas_qty              ( String                      dcgo_meas_qty               ){	this.dcgo_meas_qty               = dcgo_meas_qty              	;	}
	public void setDcgo_meas_tp_cd            ( String                      dcgo_meas_tp_cd             ){	this.dcgo_meas_tp_cd             = dcgo_meas_tp_cd            	;	}
	public void setDcgo_imo_clss_cd           ( String                      dcgo_imo_clss_cd            ){	this.dcgo_imo_clss_cd            = dcgo_imo_clss_cd           	;	}
	public void setDcgo_hzd_desc              ( String                      dcgo_hzd_desc               ){	this.dcgo_hzd_desc               = dcgo_hzd_desc              	;	}
	public void setDcgo_tnk_tp_cd             ( String                      dcgo_tnk_tp_cd              ){	this.dcgo_tnk_tp_cd              = dcgo_tnk_tp_cd             	;	}
	public void setDcgo_stwg_instr_desc       ( String                      dcgo_stwg_instr_desc        ){	this.dcgo_stwg_instr_desc        = dcgo_stwg_instr_desc       	;	}
	public void setDcgo_vapr_cd               ( String                      dcgo_vapr_cd                ){	this.dcgo_vapr_cd                = dcgo_vapr_cd               	;	}
	public void setDcgo_emer_cntc_pnt_nm      ( String                      dcgo_emer_cntc_pnt_nm       ){	this.dcgo_emer_cntc_pnt_nm       = dcgo_emer_cntc_pnt_nm      	;	}
	public void setCntr_tpsz_cd               ( String                      cntr_tpsz_cd                ){	this.cntr_tpsz_cd                = cntr_tpsz_cd               	;	}
	public void setCntr_no                    ( String                      cntr_no                     ){	this.cntr_no                     = cntr_no                    	;	}
	public void setDcgo_auth_flg              ( String                      dcgo_auth_flg               ){	this.dcgo_auth_flg               = dcgo_auth_flg              	;	}
	public void setDcgo_rjct_rsn              ( String                      dcgo_rjct_rsn               ){	this.dcgo_rjct_rsn               = dcgo_rjct_rsn              	;	}
	public void setDcgo_rmk                   ( String                      dcgo_rmk                    ){	this.dcgo_rmk                    = dcgo_rmk                   	;	}
	public void setDcgo_pck_qty               ( String                      dcgo_pck_qty                ){	this.dcgo_pck_qty                = dcgo_pck_qty               	;	}
	public void setDcgo_pck_cd                ( String                      dcgo_pck_cd                 ){	this.dcgo_pck_cd                 = dcgo_pck_cd                	;	}
	public void setDcgo_rc_seq                ( String                      dcgo_rc_seq                 ){	this.dcgo_rc_seq                 = dcgo_rc_seq                	;	}
	public void setDcgo_rslt_cd               ( String                      dcgo_rslt_cd                ){	this.dcgo_rslt_cd                = dcgo_rslt_cd               	;	}
	public void setDcgo_auth_usr_id           ( String                      dcgo_auth_usr_id            ){	this.dcgo_auth_usr_id            = dcgo_auth_usr_id           	;	}
	public void setDcgo_auth_dt               ( String                      dcgo_auth_dt                ){	this.dcgo_auth_dt                = dcgo_auth_dt               	;	}
	public void setDcgo_lcl_ind_cd            ( String                      dcgo_lcl_ind_cd             ){	this.dcgo_lcl_ind_cd             = dcgo_lcl_ind_cd            	;	}
	public void setDcgo_cnsl_un_no            ( String                      dcgo_cnsl_un_no             ){	this.dcgo_cnsl_un_no             = dcgo_cnsl_un_no            	;	}
	public void setDcgo_sts_cd                ( String                      dcgo_sts_cd                 ){	this.dcgo_sts_cd                 = dcgo_sts_cd                	;	}
	public void setDcgo_cntr_ser_no           ( String                      dcgo_cntr_ser_no            ){	this.dcgo_cntr_ser_no            = dcgo_cntr_ser_no           	;	}
	public void setDcgo_imo_comp_grp_cd       ( String                      dcgo_imo_comp_grp_cd        ){	this.dcgo_imo_comp_grp_cd        = dcgo_imo_comp_grp_cd       	;	}
	public void setDcgo_flsh_pnt_temp         ( String                      dcgo_flsh_pnt_temp          ){	this.dcgo_flsh_pnt_temp          = dcgo_flsh_pnt_temp         	;	}
	public void setDcgo_n1st_pck_grp_cd       ( String                      dcgo_n1st_pck_grp_cd        ){	this.dcgo_n1st_pck_grp_cd        = dcgo_n1st_pck_grp_cd       	;	}
	public void setDcgo_n2nd_pck_grp_cd       ( String                      dcgo_n2nd_pck_grp_cd        ){	this.dcgo_n2nd_pck_grp_cd        = dcgo_n2nd_pck_grp_cd       	;	}
	public void setDcgo_n3rd_pck_grp_cd       ( String                      dcgo_n3rd_pck_grp_cd        ){	this.dcgo_n3rd_pck_grp_cd        = dcgo_n3rd_pck_grp_cd       	;	}
	public void setDcgo_mrn_polut_cd          ( String                      dcgo_mrn_polut_cd           ){	this.dcgo_mrn_polut_cd           = dcgo_mrn_polut_cd          	;	}
	public void setDcgo_psa_cd                ( String                      dcgo_psa_cd                 ){	this.dcgo_psa_cd                 = dcgo_psa_cd                	;	}
	public void setDcgo_cntr_sub_ser_no       ( String                      dcgo_cntr_sub_ser_no        ){	this.dcgo_cntr_sub_ser_no        = dcgo_cntr_sub_ser_no       	;	}
	public void setDcgo_certi_no              ( String                      dcgo_certi_no               ){	this.dcgo_certi_no               = dcgo_certi_no              	;	}
	public void setDcgo_in_pck_n1st_qty       ( String                      dcgo_in_pck_n1st_qty        ){	this.dcgo_in_pck_n1st_qty        = dcgo_in_pck_n1st_qty       	;	}
	public void setDcgo_in_pck_n1st_tp_cd     ( String                      dcgo_in_pck_n1st_tp_cd      ){	this.dcgo_in_pck_n1st_tp_cd      = dcgo_in_pck_n1st_tp_cd     	;	}
	public void setDcgo_in_pck_n2nd_qty       ( String                      dcgo_in_pck_n2nd_qty        ){	this.dcgo_in_pck_n2nd_qty        = dcgo_in_pck_n2nd_qty       	;	}
	public void setDcgo_in_pck_n2nd_tp_cd     ( String                      dcgo_in_pck_n2nd_tp_cd      ){	this.dcgo_in_pck_n2nd_tp_cd      = dcgo_in_pck_n2nd_tp_cd     	;	}
	public void setDcgo_out_pck_n1st_qty      ( String                      dcgo_out_pck_n1st_qty       ){	this.dcgo_out_pck_n1st_qty       = dcgo_out_pck_n1st_qty      	;	}
	public void setDcgo_out_pck_n1st_tp_cd    ( String                      dcgo_out_pck_n1st_tp_cd     ){	this.dcgo_out_pck_n1st_tp_cd     = dcgo_out_pck_n1st_tp_cd    	;	}
	public void setDcgo_out_pck_n2nd_qty      ( String                      dcgo_out_pck_n2nd_qty       ){	this.dcgo_out_pck_n2nd_qty       = dcgo_out_pck_n2nd_qty      	;	}
	public void setDcgo_out_pck_n2nd_tp_cd    ( String                      dcgo_out_pck_n2nd_tp_cd     ){	this.dcgo_out_pck_n2nd_tp_cd     = dcgo_out_pck_n2nd_tp_cd    	;	}
	public void setDcgo_sub_lbl_desc          ( String                      dcgo_sub_lbl_desc           ){	this.dcgo_sub_lbl_desc           = dcgo_sub_lbl_desc          	;	}
	public void setDcgo_imo_pck_no            ( String                      dcgo_imo_pck_no             ){	this.dcgo_imo_pck_no             = dcgo_imo_pck_no            	;	}
	public void setDcgo_ems_no                ( String                      dcgo_ems_no                 ){	this.dcgo_ems_no                 = dcgo_ems_no                	;	}
	public void setDcgo_meas_no               ( String                      dcgo_meas_no                ){	this.dcgo_meas_no                = dcgo_meas_no               	;	}
	public void setDcgo_emer_no               ( String                      dcgo_emer_no                ){	this.dcgo_emer_no                = dcgo_emer_no               	;	}
	public void setDcgo_cnee_dtl_desc         ( String                      dcgo_cnee_dtl_desc          ){	this.dcgo_cnee_dtl_desc          = dcgo_cnee_dtl_desc         	;	}
	public void setDcgo_net_explo_wgt         ( String                      dcgo_net_explo_wgt          ){	this.dcgo_net_explo_wgt          = dcgo_net_explo_wgt         	;	}
	public void setDcgo_rada_skd_cd           ( String                      dcgo_rada_skd_cd            ){	this.dcgo_rada_skd_cd            = dcgo_rada_skd_cd           	;	}
	public void setDcgo_rada_qty              ( String                      dcgo_rada_qty               ){	this.dcgo_rada_qty               = dcgo_rada_qty              	;	}
	public void setDcgo_rada_tp_cd            ( String                      dcgo_rada_tp_cd             ){	this.dcgo_rada_tp_cd             = dcgo_rada_tp_cd            	;	}
	public void setDcgo_rada_trsp_id          ( String                      dcgo_rada_trsp_id           ){	this.dcgo_rada_trsp_id           = dcgo_rada_trsp_id          	;	}
	public void setDcgo_ctrl_temp_ctnt        ( String                      dcgo_ctrl_temp_ctnt         ){	this.dcgo_ctrl_temp_ctnt         = dcgo_ctrl_temp_ctnt        	;	}
	public void setDcgo_emer_temp_ctnt        ( String                      dcgo_emer_temp_ctnt         ){	this.dcgo_emer_temp_ctnt         = dcgo_emer_temp_ctnt        	;	}
	public void setDcgo_rqst_no               ( String                      dcgo_rqst_no                ){	this.dcgo_rqst_no                = dcgo_rqst_no               	;	}
	public void setDcgo_appl_usr_id           ( String                      dcgo_appl_usr_id            ){	this.dcgo_appl_usr_id            = dcgo_appl_usr_id           	;	}
	public void setDcgo_awk_ind_cd            ( String                      dcgo_awk_ind_cd             ){	this.dcgo_awk_ind_cd             = dcgo_awk_ind_cd            	;	}
	public void setDcgo_bb_ind_cd             ( String                      dcgo_bb_ind_cd              ){	this.dcgo_bb_ind_cd              = dcgo_bb_ind_cd             	;	}
	public void setDcgo_rf_ind_cd             ( String                      dcgo_rf_ind_cd              ){	this.dcgo_rf_ind_cd              = dcgo_rf_ind_cd             	;	}
	public void setDcgo_clod_ind_cd           ( String                      dcgo_clod_ind_cd            ){	this.dcgo_clod_ind_cd            = dcgo_clod_ind_cd           	;	}
	public void setDcgo_tp_seq                ( String                      dcgo_tp_seq                 ){	this.dcgo_tp_seq                 = dcgo_tp_seq                	;	}
	public void setDcgo_psa_clss_cd           ( String                      dcgo_psa_clss_cd            ){	this.dcgo_psa_clss_cd            = dcgo_psa_clss_cd           	;	}
	public void setDcgo_emer_chr_cd           ( String                      dcgo_emer_chr_cd            ){	this.dcgo_emer_chr_cd            = dcgo_emer_chr_cd           	;	}
	public void setDcgo_mft_n1st_no           ( String                      dcgo_mft_n1st_no            ){	this.dcgo_mft_n1st_no            = dcgo_mft_n1st_no           	;	}
	public void setDcgo_mft_n2nd_no           ( String                      dcgo_mft_n2nd_no            ){	this.dcgo_mft_n2nd_no            = dcgo_mft_n2nd_no           	;	}
	public void setDcgo_mft_sub_no            ( String                      dcgo_mft_sub_no             ){	this.dcgo_mft_sub_no             = dcgo_mft_sub_no            	;	}
	public void setNis_evnt_dt                ( String                      nis_evnt_dt                 ){	this.nis_evnt_dt                 = nis_evnt_dt                	;	}
	public void setDcgo_in_max_qty            ( String                      dcgo_in_max_qty             ){	this.dcgo_in_max_qty             = dcgo_in_max_qty            	;	}
	public void setDcgo_in_max_tp_cd          ( String                      dcgo_in_max_tp_cd           ){	this.dcgo_in_max_tp_cd           = dcgo_in_max_tp_cd          	;	}
	public void setDcgo_imo_lmt_flg           ( String                      dcgo_imo_lmt_flg            ){	this.dcgo_imo_lmt_flg            = dcgo_imo_lmt_flg           	;	}
	public void setDcgo_hcdg_flg              ( String                      dcgo_hcdg_flg               ){	this.dcgo_hcdg_flg               = dcgo_hcdg_flg              	;	}
	public void setDcgo_hcdg_dpnd_flg         ( String                      dcgo_hcdg_dpnd_flg          ){	this.dcgo_hcdg_dpnd_flg          = dcgo_hcdg_dpnd_flg         	;	}
	public void setEai_evnt_dt                ( String                      eai_evnt_dt                 ){	this.eai_evnt_dt                 = eai_evnt_dt                	;	}

	public static BKG_DG_CGO fromRequest(HttpServletRequest request) {
		BKG_DG_CGO model = new BKG_DG_CGO();
		try {
			model.setIbflag                     	(JSPUtil.getParameter(request, "ibflag                     		".trim(), ""));
			model.setPage_rows                  	(JSPUtil.getParameter(request, "page_rows                  		".trim(), ""));
			model.setBkg_no                     	(JSPUtil.getParameter(request, "bkg_no                     		".trim(), ""));
			model.setBkg_no_split               	(JSPUtil.getParameter(request, "bkg_no_split               		".trim(), ""));
			model.setDcgo_seq                   	(JSPUtil.getParameter(request, "dcgo_seq                   		".trim(), ""));
			model.setDcgo_un_no                 	(JSPUtil.getParameter(request, "dcgo_un_no                 		".trim(), ""));
			model.setDcgo_un_no_seq             	(JSPUtil.getParameter(request, "dcgo_un_no_seq             		".trim(), ""));
			model.setDcgo_net_wgt               	(JSPUtil.getParameter(request, "dcgo_net_wgt               		".trim(), ""));
			model.setDcgo_wgt_tp_cd             	(JSPUtil.getParameter(request, "dcgo_wgt_tp_cd             		".trim(), ""));
			model.setDcgo_grs_wgt               	(JSPUtil.getParameter(request, "dcgo_grs_wgt               		".trim(), ""));
			model.setDcgo_flsh_pnt_fdo_temp_ctnt	(JSPUtil.getParameter(request, "dcgo_flsh_pnt_fdo_temp_ctnt		".trim(), ""));
			model.setDcgo_rqst_dt               	(JSPUtil.getParameter(request, "dcgo_rqst_dt               		".trim(), ""));
			model.setDcgo_act_shp_nm            	(JSPUtil.getParameter(request, "dcgo_act_shp_nm            		".trim(), ""));
			model.setDcgo_meas_qty              	(JSPUtil.getParameter(request, "dcgo_meas_qty              		".trim(), ""));
			model.setDcgo_meas_tp_cd            	(JSPUtil.getParameter(request, "dcgo_meas_tp_cd            		".trim(), ""));
			model.setDcgo_imo_clss_cd           	(JSPUtil.getParameter(request, "dcgo_imo_clss_cd           		".trim(), ""));
			model.setDcgo_hzd_desc              	(JSPUtil.getParameter(request, "dcgo_hzd_desc              		".trim(), ""));
			model.setDcgo_tnk_tp_cd             	(JSPUtil.getParameter(request, "dcgo_tnk_tp_cd             		".trim(), ""));
			model.setDcgo_stwg_instr_desc       	(JSPUtil.getParameter(request, "dcgo_stwg_instr_desc       		".trim(), ""));
			model.setDcgo_vapr_cd               	(JSPUtil.getParameter(request, "dcgo_vapr_cd               		".trim(), ""));
			model.setDcgo_emer_cntc_pnt_nm      	(JSPUtil.getParameter(request, "dcgo_emer_cntc_pnt_nm      		".trim(), ""));
			model.setCntr_tpsz_cd               	(JSPUtil.getParameter(request, "cntr_tpsz_cd               		".trim(), ""));
			model.setCntr_no                    	(JSPUtil.getParameter(request, "cntr_no                    		".trim(), ""));
			model.setDcgo_auth_flg              	(JSPUtil.getParameter(request, "dcgo_auth_flg              		".trim(), ""));
			model.setDcgo_rjct_rsn              	(JSPUtil.getParameter(request, "dcgo_rjct_rsn              		".trim(), ""));
			model.setDcgo_rmk                   	(JSPUtil.getParameter(request, "dcgo_rmk                   		".trim(), ""));
			model.setDcgo_pck_qty               	(JSPUtil.getParameter(request, "dcgo_pck_qty               		".trim(), ""));
			model.setDcgo_pck_cd                	(JSPUtil.getParameter(request, "dcgo_pck_cd                		".trim(), ""));
			model.setDcgo_rc_seq                	(JSPUtil.getParameter(request, "dcgo_rc_seq                		".trim(), ""));
			model.setDcgo_rslt_cd               	(JSPUtil.getParameter(request, "dcgo_rslt_cd               		".trim(), ""));
			model.setDcgo_auth_usr_id           	(JSPUtil.getParameter(request, "dcgo_auth_usr_id           		".trim(), ""));
			model.setDcgo_auth_dt               	(JSPUtil.getParameter(request, "dcgo_auth_dt               		".trim(), ""));
			model.setDcgo_lcl_ind_cd            	(JSPUtil.getParameter(request, "dcgo_lcl_ind_cd            		".trim(), ""));
			model.setDcgo_cnsl_un_no            	(JSPUtil.getParameter(request, "dcgo_cnsl_un_no            		".trim(), ""));
			model.setDcgo_sts_cd                	(JSPUtil.getParameter(request, "dcgo_sts_cd                		".trim(), ""));
			model.setDcgo_cntr_ser_no           	(JSPUtil.getParameter(request, "dcgo_cntr_ser_no           		".trim(), ""));
			model.setDcgo_imo_comp_grp_cd       	(JSPUtil.getParameter(request, "dcgo_imo_comp_grp_cd       		".trim(), ""));
			model.setDcgo_flsh_pnt_temp         	(JSPUtil.getParameter(request, "dcgo_flsh_pnt_temp         		".trim(), ""));
			model.setDcgo_n1st_pck_grp_cd       	(JSPUtil.getParameter(request, "dcgo_n1st_pck_grp_cd       		".trim(), ""));
			model.setDcgo_n2nd_pck_grp_cd       	(JSPUtil.getParameter(request, "dcgo_n2nd_pck_grp_cd       		".trim(), ""));
			model.setDcgo_n3rd_pck_grp_cd       	(JSPUtil.getParameter(request, "dcgo_n3rd_pck_grp_cd       		".trim(), ""));
			model.setDcgo_mrn_polut_cd          	(JSPUtil.getParameter(request, "dcgo_mrn_polut_cd          		".trim(), ""));
			model.setDcgo_psa_cd                	(JSPUtil.getParameter(request, "dcgo_psa_cd                		".trim(), ""));
			model.setDcgo_cntr_sub_ser_no       	(JSPUtil.getParameter(request, "dcgo_cntr_sub_ser_no       		".trim(), ""));
			model.setDcgo_certi_no              	(JSPUtil.getParameter(request, "dcgo_certi_no              		".trim(), ""));
			model.setDcgo_in_pck_n1st_qty       	(JSPUtil.getParameter(request, "dcgo_in_pck_n1st_qty       		".trim(), ""));
			model.setDcgo_in_pck_n1st_tp_cd     	(JSPUtil.getParameter(request, "dcgo_in_pck_n1st_tp_cd     		".trim(), ""));
			model.setDcgo_in_pck_n2nd_qty       	(JSPUtil.getParameter(request, "dcgo_in_pck_n2nd_qty       		".trim(), ""));
			model.setDcgo_in_pck_n2nd_tp_cd     	(JSPUtil.getParameter(request, "dcgo_in_pck_n2nd_tp_cd     		".trim(), ""));
			model.setDcgo_out_pck_n1st_qty      	(JSPUtil.getParameter(request, "dcgo_out_pck_n1st_qty      		".trim(), ""));
			model.setDcgo_out_pck_n1st_tp_cd    	(JSPUtil.getParameter(request, "dcgo_out_pck_n1st_tp_cd    		".trim(), ""));
			model.setDcgo_out_pck_n2nd_qty      	(JSPUtil.getParameter(request, "dcgo_out_pck_n2nd_qty      		".trim(), ""));
			model.setDcgo_out_pck_n2nd_tp_cd    	(JSPUtil.getParameter(request, "dcgo_out_pck_n2nd_tp_cd    		".trim(), ""));
			model.setDcgo_sub_lbl_desc          	(JSPUtil.getParameter(request, "dcgo_sub_lbl_desc          		".trim(), ""));
			model.setDcgo_imo_pck_no            	(JSPUtil.getParameter(request, "dcgo_imo_pck_no            		".trim(), ""));
			model.setDcgo_ems_no                	(JSPUtil.getParameter(request, "dcgo_ems_no                		".trim(), ""));
			model.setDcgo_meas_no               	(JSPUtil.getParameter(request, "dcgo_meas_no               		".trim(), ""));
			model.setDcgo_emer_no               	(JSPUtil.getParameter(request, "dcgo_emer_no               		".trim(), ""));
			model.setDcgo_cnee_dtl_desc         	(JSPUtil.getParameter(request, "dcgo_cnee_dtl_desc         		".trim(), ""));
			model.setDcgo_net_explo_wgt         	(JSPUtil.getParameter(request, "dcgo_net_explo_wgt         		".trim(), ""));
			model.setDcgo_rada_skd_cd           	(JSPUtil.getParameter(request, "dcgo_rada_skd_cd           		".trim(), ""));
			model.setDcgo_rada_qty              	(JSPUtil.getParameter(request, "dcgo_rada_qty              		".trim(), ""));
			model.setDcgo_rada_tp_cd            	(JSPUtil.getParameter(request, "dcgo_rada_tp_cd            		".trim(), ""));
			model.setDcgo_rada_trsp_id          	(JSPUtil.getParameter(request, "dcgo_rada_trsp_id          		".trim(), ""));
			model.setDcgo_ctrl_temp_ctnt        	(JSPUtil.getParameter(request, "dcgo_ctrl_temp_ctnt        		".trim(), ""));
			model.setDcgo_emer_temp_ctnt        	(JSPUtil.getParameter(request, "dcgo_emer_temp_ctnt        		".trim(), ""));
			model.setDcgo_rqst_no               	(JSPUtil.getParameter(request, "dcgo_rqst_no               		".trim(), ""));
			model.setDcgo_appl_usr_id           	(JSPUtil.getParameter(request, "dcgo_appl_usr_id           		".trim(), ""));
			model.setDcgo_awk_ind_cd            	(JSPUtil.getParameter(request, "dcgo_awk_ind_cd            		".trim(), ""));
			model.setDcgo_bb_ind_cd             	(JSPUtil.getParameter(request, "dcgo_bb_ind_cd             		".trim(), ""));
			model.setDcgo_rf_ind_cd             	(JSPUtil.getParameter(request, "dcgo_rf_ind_cd             		".trim(), ""));
			model.setDcgo_clod_ind_cd           	(JSPUtil.getParameter(request, "dcgo_clod_ind_cd           		".trim(), ""));
			model.setDcgo_tp_seq                	(JSPUtil.getParameter(request, "dcgo_tp_seq                		".trim(), ""));
			model.setDcgo_psa_clss_cd           	(JSPUtil.getParameter(request, "dcgo_psa_clss_cd           		".trim(), ""));
			model.setDcgo_emer_chr_cd           	(JSPUtil.getParameter(request, "dcgo_emer_chr_cd           		".trim(), ""));
			model.setDcgo_mft_n1st_no           	(JSPUtil.getParameter(request, "dcgo_mft_n1st_no           		".trim(), ""));
			model.setDcgo_mft_n2nd_no           	(JSPUtil.getParameter(request, "dcgo_mft_n2nd_no           		".trim(), ""));
			model.setDcgo_mft_sub_no            	(JSPUtil.getParameter(request, "dcgo_mft_sub_no            		".trim(), ""));
			model.setNis_evnt_dt                	(JSPUtil.getParameter(request, "nis_evnt_dt                		".trim(), ""));
			model.setDcgo_in_max_qty            	(JSPUtil.getParameter(request, "dcgo_in_max_qty            		".trim(), ""));
			model.setDcgo_in_max_tp_cd          	(JSPUtil.getParameter(request, "dcgo_in_max_tp_cd          		".trim(), ""));
			model.setDcgo_imo_lmt_flg           	(JSPUtil.getParameter(request, "dcgo_imo_lmt_flg           		".trim(), ""));
			model.setDcgo_hcdg_flg              	(JSPUtil.getParameter(request, "dcgo_hcdg_flg              		".trim(), ""));
			model.setDcgo_hcdg_dpnd_flg         	(JSPUtil.getParameter(request, "dcgo_hcdg_dpnd_flg         		".trim(), ""));
			model.setEai_evnt_dt                	(JSPUtil.getParameter(request, "eai_evnt_dt                		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		BKG_DG_CGO model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag                      =  (JSPUtil.getParameter(request, "ibflag                     		".trim(), length));
			String[] page_rows                   =  (JSPUtil.getParameter(request, "page_rows                  		".trim(), length));
			String[] bkg_no                      =  (JSPUtil.getParameter(request, "bkg_no                     		".trim(), length));
			String[] bkg_no_split                =  (JSPUtil.getParameter(request, "bkg_no_split               		".trim(), length));
			String[] dcgo_seq                    =  (JSPUtil.getParameter(request, "dcgo_seq                   		".trim(), length));
			String[] dcgo_un_no                  =  (JSPUtil.getParameter(request, "dcgo_un_no                 		".trim(), length));
			String[] dcgo_un_no_seq              =  (JSPUtil.getParameter(request, "dcgo_un_no_seq             		".trim(), length));
			String[] dcgo_net_wgt                =  (JSPUtil.getParameter(request, "dcgo_net_wgt               		".trim(), length));
			String[] dcgo_wgt_tp_cd              =  (JSPUtil.getParameter(request, "dcgo_wgt_tp_cd             		".trim(), length));
			String[] dcgo_grs_wgt                =  (JSPUtil.getParameter(request, "dcgo_grs_wgt               		".trim(), length));
			String[] dcgo_flsh_pnt_fdo_temp_ctnt =  (JSPUtil.getParameter(request, "dcgo_flsh_pnt_fdo_temp_ctnt		".trim(), length));
			String[] dcgo_rqst_dt                =  (JSPUtil.getParameter(request, "dcgo_rqst_dt               		".trim(), length));
			String[] dcgo_act_shp_nm             =  (JSPUtil.getParameter(request, "dcgo_act_shp_nm            		".trim(), length));
			String[] dcgo_meas_qty               =  (JSPUtil.getParameter(request, "dcgo_meas_qty              		".trim(), length));
			String[] dcgo_meas_tp_cd             =  (JSPUtil.getParameter(request, "dcgo_meas_tp_cd            		".trim(), length));
			String[] dcgo_imo_clss_cd            =  (JSPUtil.getParameter(request, "dcgo_imo_clss_cd           		".trim(), length));
			String[] dcgo_hzd_desc               =  (JSPUtil.getParameter(request, "dcgo_hzd_desc              		".trim(), length));
			String[] dcgo_tnk_tp_cd              =  (JSPUtil.getParameter(request, "dcgo_tnk_tp_cd             		".trim(), length));
			String[] dcgo_stwg_instr_desc        =  (JSPUtil.getParameter(request, "dcgo_stwg_instr_desc       		".trim(), length));
			String[] dcgo_vapr_cd                =  (JSPUtil.getParameter(request, "dcgo_vapr_cd               		".trim(), length));
			String[] dcgo_emer_cntc_pnt_nm       =  (JSPUtil.getParameter(request, "dcgo_emer_cntc_pnt_nm      		".trim(), length));
			String[] cntr_tpsz_cd                =  (JSPUtil.getParameter(request, "cntr_tpsz_cd               		".trim(), length));
			String[] cntr_no                     =  (JSPUtil.getParameter(request, "cntr_no                    		".trim(), length));
			String[] dcgo_auth_flg               =  (JSPUtil.getParameter(request, "dcgo_auth_flg              		".trim(), length));
			String[] dcgo_rjct_rsn               =  (JSPUtil.getParameter(request, "dcgo_rjct_rsn              		".trim(), length));
			String[] dcgo_rmk                    =  (JSPUtil.getParameter(request, "dcgo_rmk                   		".trim(), length));
			String[] dcgo_pck_qty                =  (JSPUtil.getParameter(request, "dcgo_pck_qty               		".trim(), length));
			String[] dcgo_pck_cd                 =  (JSPUtil.getParameter(request, "dcgo_pck_cd                		".trim(), length));
			String[] dcgo_rc_seq                 =  (JSPUtil.getParameter(request, "dcgo_rc_seq                		".trim(), length));
			String[] dcgo_rslt_cd                =  (JSPUtil.getParameter(request, "dcgo_rslt_cd               		".trim(), length));
			String[] dcgo_auth_usr_id            =  (JSPUtil.getParameter(request, "dcgo_auth_usr_id           		".trim(), length));
			String[] dcgo_auth_dt                =  (JSPUtil.getParameter(request, "dcgo_auth_dt               		".trim(), length));
			String[] dcgo_lcl_ind_cd             =  (JSPUtil.getParameter(request, "dcgo_lcl_ind_cd            		".trim(), length));
			String[] dcgo_cnsl_un_no             =  (JSPUtil.getParameter(request, "dcgo_cnsl_un_no            		".trim(), length));
			String[] dcgo_sts_cd                 =  (JSPUtil.getParameter(request, "dcgo_sts_cd                		".trim(), length));
			String[] dcgo_cntr_ser_no            =  (JSPUtil.getParameter(request, "dcgo_cntr_ser_no           		".trim(), length));
			String[] dcgo_imo_comp_grp_cd        =  (JSPUtil.getParameter(request, "dcgo_imo_comp_grp_cd       		".trim(), length));
			String[] dcgo_flsh_pnt_temp          =  (JSPUtil.getParameter(request, "dcgo_flsh_pnt_temp         		".trim(), length));
			String[] dcgo_n1st_pck_grp_cd        =  (JSPUtil.getParameter(request, "dcgo_n1st_pck_grp_cd       		".trim(), length));
			String[] dcgo_n2nd_pck_grp_cd        =  (JSPUtil.getParameter(request, "dcgo_n2nd_pck_grp_cd       		".trim(), length));
			String[] dcgo_n3rd_pck_grp_cd        =  (JSPUtil.getParameter(request, "dcgo_n3rd_pck_grp_cd       		".trim(), length));
			String[] dcgo_mrn_polut_cd           =  (JSPUtil.getParameter(request, "dcgo_mrn_polut_cd          		".trim(), length));
			String[] dcgo_psa_cd                 =  (JSPUtil.getParameter(request, "dcgo_psa_cd                		".trim(), length));
			String[] dcgo_cntr_sub_ser_no        =  (JSPUtil.getParameter(request, "dcgo_cntr_sub_ser_no       		".trim(), length));
			String[] dcgo_certi_no               =  (JSPUtil.getParameter(request, "dcgo_certi_no              		".trim(), length));
			String[] dcgo_in_pck_n1st_qty        =  (JSPUtil.getParameter(request, "dcgo_in_pck_n1st_qty       		".trim(), length));
			String[] dcgo_in_pck_n1st_tp_cd      =  (JSPUtil.getParameter(request, "dcgo_in_pck_n1st_tp_cd     		".trim(), length));
			String[] dcgo_in_pck_n2nd_qty        =  (JSPUtil.getParameter(request, "dcgo_in_pck_n2nd_qty       		".trim(), length));
			String[] dcgo_in_pck_n2nd_tp_cd      =  (JSPUtil.getParameter(request, "dcgo_in_pck_n2nd_tp_cd     		".trim(), length));
			String[] dcgo_out_pck_n1st_qty       =  (JSPUtil.getParameter(request, "dcgo_out_pck_n1st_qty      		".trim(), length));
			String[] dcgo_out_pck_n1st_tp_cd     =  (JSPUtil.getParameter(request, "dcgo_out_pck_n1st_tp_cd    		".trim(), length));
			String[] dcgo_out_pck_n2nd_qty       =  (JSPUtil.getParameter(request, "dcgo_out_pck_n2nd_qty      		".trim(), length));
			String[] dcgo_out_pck_n2nd_tp_cd     =  (JSPUtil.getParameter(request, "dcgo_out_pck_n2nd_tp_cd    		".trim(), length));
			String[] dcgo_sub_lbl_desc           =  (JSPUtil.getParameter(request, "dcgo_sub_lbl_desc          		".trim(), length));
			String[] dcgo_imo_pck_no             =  (JSPUtil.getParameter(request, "dcgo_imo_pck_no            		".trim(), length));
			String[] dcgo_ems_no                 =  (JSPUtil.getParameter(request, "dcgo_ems_no                		".trim(), length));
			String[] dcgo_meas_no                =  (JSPUtil.getParameter(request, "dcgo_meas_no               		".trim(), length));
			String[] dcgo_emer_no                =  (JSPUtil.getParameter(request, "dcgo_emer_no               		".trim(), length));
			String[] dcgo_cnee_dtl_desc          =  (JSPUtil.getParameter(request, "dcgo_cnee_dtl_desc         		".trim(), length));
			String[] dcgo_net_explo_wgt          =  (JSPUtil.getParameter(request, "dcgo_net_explo_wgt         		".trim(), length));
			String[] dcgo_rada_skd_cd            =  (JSPUtil.getParameter(request, "dcgo_rada_skd_cd           		".trim(), length));
			String[] dcgo_rada_qty               =  (JSPUtil.getParameter(request, "dcgo_rada_qty              		".trim(), length));
			String[] dcgo_rada_tp_cd             =  (JSPUtil.getParameter(request, "dcgo_rada_tp_cd            		".trim(), length));
			String[] dcgo_rada_trsp_id           =  (JSPUtil.getParameter(request, "dcgo_rada_trsp_id          		".trim(), length));
			String[] dcgo_ctrl_temp_ctnt         =  (JSPUtil.getParameter(request, "dcgo_ctrl_temp_ctnt        		".trim(), length));
			String[] dcgo_emer_temp_ctnt         =  (JSPUtil.getParameter(request, "dcgo_emer_temp_ctnt        		".trim(), length));
			String[] dcgo_rqst_no                =  (JSPUtil.getParameter(request, "dcgo_rqst_no               		".trim(), length));
			String[] dcgo_appl_usr_id            =  (JSPUtil.getParameter(request, "dcgo_appl_usr_id           		".trim(), length));
			String[] dcgo_awk_ind_cd             =  (JSPUtil.getParameter(request, "dcgo_awk_ind_cd            		".trim(), length));
			String[] dcgo_bb_ind_cd              =  (JSPUtil.getParameter(request, "dcgo_bb_ind_cd             		".trim(), length));
			String[] dcgo_rf_ind_cd              =  (JSPUtil.getParameter(request, "dcgo_rf_ind_cd             		".trim(), length));
			String[] dcgo_clod_ind_cd            =  (JSPUtil.getParameter(request, "dcgo_clod_ind_cd           		".trim(), length));
			String[] dcgo_tp_seq                 =  (JSPUtil.getParameter(request, "dcgo_tp_seq                		".trim(), length));
			String[] dcgo_psa_clss_cd            =  (JSPUtil.getParameter(request, "dcgo_psa_clss_cd           		".trim(), length));
			String[] dcgo_emer_chr_cd            =  (JSPUtil.getParameter(request, "dcgo_emer_chr_cd           		".trim(), length));
			String[] dcgo_mft_n1st_no            =  (JSPUtil.getParameter(request, "dcgo_mft_n1st_no           		".trim(), length));
			String[] dcgo_mft_n2nd_no            =  (JSPUtil.getParameter(request, "dcgo_mft_n2nd_no           		".trim(), length));
			String[] dcgo_mft_sub_no             =  (JSPUtil.getParameter(request, "dcgo_mft_sub_no            		".trim(), length));
			String[] nis_evnt_dt                 =  (JSPUtil.getParameter(request, "nis_evnt_dt                		".trim(), length));
			String[] dcgo_in_max_qty             =  (JSPUtil.getParameter(request, "dcgo_in_max_qty            		".trim(), length));
			String[] dcgo_in_max_tp_cd           =  (JSPUtil.getParameter(request, "dcgo_in_max_tp_cd          		".trim(), length));
			String[] dcgo_imo_lmt_flg            =  (JSPUtil.getParameter(request, "dcgo_imo_lmt_flg           		".trim(), length));
			String[] dcgo_hcdg_flg               =  (JSPUtil.getParameter(request, "dcgo_hcdg_flg              		".trim(), length));
			String[] dcgo_hcdg_dpnd_flg          =  (JSPUtil.getParameter(request, "dcgo_hcdg_dpnd_flg         		".trim(), length));
			String[] eai_evnt_dt                 =  (JSPUtil.getParameter(request, "eai_evnt_dt                		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new BKG_DG_CGO();
				model.setIbflag                     		  (ibflag                     	[i]);
				model.setPage_rows                  		  (page_rows                  	[i]);
				model.setBkg_no                     		  (bkg_no                     	[i]);
				model.setBkg_no_split               		  (bkg_no_split               	[i]);
				model.setDcgo_seq                   		  (dcgo_seq                   	[i]);
				model.setDcgo_un_no                 		  (dcgo_un_no                 	[i]);
				model.setDcgo_un_no_seq             		  (dcgo_un_no_seq             	[i]);
				model.setDcgo_net_wgt               		  (dcgo_net_wgt               	[i]);
				model.setDcgo_wgt_tp_cd             		  (dcgo_wgt_tp_cd             	[i]);
				model.setDcgo_grs_wgt               		  (dcgo_grs_wgt               	[i]);
				model.setDcgo_flsh_pnt_fdo_temp_ctnt		  (dcgo_flsh_pnt_fdo_temp_ctnt	[i]);
				model.setDcgo_rqst_dt               		  (dcgo_rqst_dt               	[i]);
				model.setDcgo_act_shp_nm            		  (dcgo_act_shp_nm            	[i]);
				model.setDcgo_meas_qty              		  (dcgo_meas_qty              	[i]);
				model.setDcgo_meas_tp_cd            		  (dcgo_meas_tp_cd            	[i]);
				model.setDcgo_imo_clss_cd           		  (dcgo_imo_clss_cd           	[i]);
				model.setDcgo_hzd_desc              		  (dcgo_hzd_desc              	[i]);
				model.setDcgo_tnk_tp_cd             		  (dcgo_tnk_tp_cd             	[i]);
				model.setDcgo_stwg_instr_desc       		  (dcgo_stwg_instr_desc       	[i]);
				model.setDcgo_vapr_cd               		  (dcgo_vapr_cd               	[i]);
				model.setDcgo_emer_cntc_pnt_nm      		  (dcgo_emer_cntc_pnt_nm      	[i]);
				model.setCntr_tpsz_cd               		  (cntr_tpsz_cd               	[i]);
				model.setCntr_no                    		  (cntr_no                    	[i]);
				model.setDcgo_auth_flg              		  (dcgo_auth_flg              	[i]);
				model.setDcgo_rjct_rsn              		  (dcgo_rjct_rsn              	[i]);
				model.setDcgo_rmk                   		  (dcgo_rmk                   	[i]);
				model.setDcgo_pck_qty               		  (dcgo_pck_qty               	[i]);
				model.setDcgo_pck_cd                		  (dcgo_pck_cd                	[i]);
				model.setDcgo_rc_seq                		  (dcgo_rc_seq                	[i]);
				model.setDcgo_rslt_cd               		  (dcgo_rslt_cd               	[i]);
				model.setDcgo_auth_usr_id           		  (dcgo_auth_usr_id           	[i]);
				model.setDcgo_auth_dt               		  (dcgo_auth_dt               	[i]);
				model.setDcgo_lcl_ind_cd            		  (dcgo_lcl_ind_cd            	[i]);
				model.setDcgo_cnsl_un_no            		  (dcgo_cnsl_un_no            	[i]);
				model.setDcgo_sts_cd                		  (dcgo_sts_cd                	[i]);
				model.setDcgo_cntr_ser_no           		  (dcgo_cntr_ser_no           	[i]);
				model.setDcgo_imo_comp_grp_cd       		  (dcgo_imo_comp_grp_cd       	[i]);
				model.setDcgo_flsh_pnt_temp         		  (dcgo_flsh_pnt_temp         	[i]);
				model.setDcgo_n1st_pck_grp_cd       		  (dcgo_n1st_pck_grp_cd       	[i]);
				model.setDcgo_n2nd_pck_grp_cd       		  (dcgo_n2nd_pck_grp_cd       	[i]);
				model.setDcgo_n3rd_pck_grp_cd       		  (dcgo_n3rd_pck_grp_cd       	[i]);
				model.setDcgo_mrn_polut_cd          		  (dcgo_mrn_polut_cd          	[i]);
				model.setDcgo_psa_cd                		  (dcgo_psa_cd                	[i]);
				model.setDcgo_cntr_sub_ser_no       		  (dcgo_cntr_sub_ser_no       	[i]);
				model.setDcgo_certi_no              		  (dcgo_certi_no              	[i]);
				model.setDcgo_in_pck_n1st_qty       		  (dcgo_in_pck_n1st_qty       	[i]);
				model.setDcgo_in_pck_n1st_tp_cd     		  (dcgo_in_pck_n1st_tp_cd     	[i]);
				model.setDcgo_in_pck_n2nd_qty       		  (dcgo_in_pck_n2nd_qty       	[i]);
				model.setDcgo_in_pck_n2nd_tp_cd     		  (dcgo_in_pck_n2nd_tp_cd     	[i]);
				model.setDcgo_out_pck_n1st_qty      		  (dcgo_out_pck_n1st_qty      	[i]);
				model.setDcgo_out_pck_n1st_tp_cd    		  (dcgo_out_pck_n1st_tp_cd    	[i]);
				model.setDcgo_out_pck_n2nd_qty      		  (dcgo_out_pck_n2nd_qty      	[i]);
				model.setDcgo_out_pck_n2nd_tp_cd    		  (dcgo_out_pck_n2nd_tp_cd    	[i]);
				model.setDcgo_sub_lbl_desc          		  (dcgo_sub_lbl_desc          	[i]);
				model.setDcgo_imo_pck_no            		  (dcgo_imo_pck_no            	[i]);
				model.setDcgo_ems_no                		  (dcgo_ems_no                	[i]);
				model.setDcgo_meas_no               		  (dcgo_meas_no               	[i]);
				model.setDcgo_emer_no               		  (dcgo_emer_no               	[i]);
				model.setDcgo_cnee_dtl_desc         		  (dcgo_cnee_dtl_desc         	[i]);
				model.setDcgo_net_explo_wgt         		  (dcgo_net_explo_wgt         	[i]);
				model.setDcgo_rada_skd_cd           		  (dcgo_rada_skd_cd           	[i]);
				model.setDcgo_rada_qty              		  (dcgo_rada_qty              	[i]);
				model.setDcgo_rada_tp_cd            		  (dcgo_rada_tp_cd            	[i]);
				model.setDcgo_rada_trsp_id          		  (dcgo_rada_trsp_id          	[i]);
				model.setDcgo_ctrl_temp_ctnt        		  (dcgo_ctrl_temp_ctnt        	[i]);
				model.setDcgo_emer_temp_ctnt        		  (dcgo_emer_temp_ctnt        	[i]);
				model.setDcgo_rqst_no               		  (dcgo_rqst_no               	[i]);
				model.setDcgo_appl_usr_id           		  (dcgo_appl_usr_id           	[i]);
				model.setDcgo_awk_ind_cd            		  (dcgo_awk_ind_cd            	[i]);
				model.setDcgo_bb_ind_cd             		  (dcgo_bb_ind_cd             	[i]);
				model.setDcgo_rf_ind_cd             		  (dcgo_rf_ind_cd             	[i]);
				model.setDcgo_clod_ind_cd           		  (dcgo_clod_ind_cd           	[i]);
				model.setDcgo_tp_seq                		  (dcgo_tp_seq                	[i]);
				model.setDcgo_psa_clss_cd           		  (dcgo_psa_clss_cd           	[i]);
				model.setDcgo_emer_chr_cd           		  (dcgo_emer_chr_cd           	[i]);
				model.setDcgo_mft_n1st_no           		  (dcgo_mft_n1st_no           	[i]);
				model.setDcgo_mft_n2nd_no           		  (dcgo_mft_n2nd_no           	[i]);
				model.setDcgo_mft_sub_no            		  (dcgo_mft_sub_no            	[i]);
				model.setNis_evnt_dt                		  (nis_evnt_dt                	[i]);
				model.setDcgo_in_max_qty            		  (dcgo_in_max_qty            	[i]);
				model.setDcgo_in_max_tp_cd          		  (dcgo_in_max_tp_cd          	[i]);
				model.setDcgo_imo_lmt_flg           		  (dcgo_imo_lmt_flg           	[i]);
				model.setDcgo_hcdg_flg              		  (dcgo_hcdg_flg              	[i]);
				model.setDcgo_hcdg_dpnd_flg         		  (dcgo_hcdg_dpnd_flg         	[i]);
				model.setEai_evnt_dt                		  (eai_evnt_dt                	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		BKG_DG_CGO model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag                      =  (JSPUtil.getParameter(request, prefix + "ibflag                     		".trim(), length));
			String[] page_rows                   =  (JSPUtil.getParameter(request, prefix + "page_rows                  		".trim(), length));
			String[] bkg_no                      =  (JSPUtil.getParameter(request, prefix + "bkg_no                     		".trim(), length));
			String[] bkg_no_split                =  (JSPUtil.getParameter(request, prefix + "bkg_no_split               		".trim(), length));
			String[] dcgo_seq                    =  (JSPUtil.getParameter(request, prefix + "dcgo_seq                   		".trim(), length));
			String[] dcgo_un_no                  =  (JSPUtil.getParameter(request, prefix + "dcgo_un_no                 		".trim(), length));
			String[] dcgo_un_no_seq              =  (JSPUtil.getParameter(request, prefix + "dcgo_un_no_seq             		".trim(), length));
			String[] dcgo_net_wgt                =  (JSPUtil.getParameter(request, prefix + "dcgo_net_wgt               		".trim(), length));
			String[] dcgo_wgt_tp_cd              =  (JSPUtil.getParameter(request, prefix + "dcgo_wgt_tp_cd             		".trim(), length));
			String[] dcgo_grs_wgt                =  (JSPUtil.getParameter(request, prefix + "dcgo_grs_wgt               		".trim(), length));
			String[] dcgo_flsh_pnt_fdo_temp_ctnt =  (JSPUtil.getParameter(request, prefix + "dcgo_flsh_pnt_fdo_temp_ctnt		".trim(), length));
			String[] dcgo_rqst_dt                =  (JSPUtil.getParameter(request, prefix + "dcgo_rqst_dt               		".trim(), length));
			String[] dcgo_act_shp_nm             =  (JSPUtil.getParameter(request, prefix + "dcgo_act_shp_nm            		".trim(), length));
			String[] dcgo_meas_qty               =  (JSPUtil.getParameter(request, prefix + "dcgo_meas_qty              		".trim(), length));
			String[] dcgo_meas_tp_cd             =  (JSPUtil.getParameter(request, prefix + "dcgo_meas_tp_cd            		".trim(), length));
			String[] dcgo_imo_clss_cd            =  (JSPUtil.getParameter(request, prefix + "dcgo_imo_clss_cd           		".trim(), length));
			String[] dcgo_hzd_desc               =  (JSPUtil.getParameter(request, prefix + "dcgo_hzd_desc              		".trim(), length));
			String[] dcgo_tnk_tp_cd              =  (JSPUtil.getParameter(request, prefix + "dcgo_tnk_tp_cd             		".trim(), length));
			String[] dcgo_stwg_instr_desc        =  (JSPUtil.getParameter(request, prefix + "dcgo_stwg_instr_desc       		".trim(), length));
			String[] dcgo_vapr_cd                =  (JSPUtil.getParameter(request, prefix + "dcgo_vapr_cd               		".trim(), length));
			String[] dcgo_emer_cntc_pnt_nm       =  (JSPUtil.getParameter(request, prefix + "dcgo_emer_cntc_pnt_nm      		".trim(), length));
			String[] cntr_tpsz_cd                =  (JSPUtil.getParameter(request, prefix + "cntr_tpsz_cd               		".trim(), length));
			String[] cntr_no                     =  (JSPUtil.getParameter(request, prefix + "cntr_no                    		".trim(), length));
			String[] dcgo_auth_flg               =  (JSPUtil.getParameter(request, prefix + "dcgo_auth_flg              		".trim(), length));
			String[] dcgo_rjct_rsn               =  (JSPUtil.getParameter(request, prefix + "dcgo_rjct_rsn              		".trim(), length));
			String[] dcgo_rmk                    =  (JSPUtil.getParameter(request, prefix + "dcgo_rmk                   		".trim(), length));
			String[] dcgo_pck_qty                =  (JSPUtil.getParameter(request, prefix + "dcgo_pck_qty               		".trim(), length));
			String[] dcgo_pck_cd                 =  (JSPUtil.getParameter(request, prefix + "dcgo_pck_cd                		".trim(), length));
			String[] dcgo_rc_seq                 =  (JSPUtil.getParameter(request, prefix + "dcgo_rc_seq                		".trim(), length));
			String[] dcgo_rslt_cd                =  (JSPUtil.getParameter(request, prefix + "dcgo_rslt_cd               		".trim(), length));
			String[] dcgo_auth_usr_id            =  (JSPUtil.getParameter(request, prefix + "dcgo_auth_usr_id           		".trim(), length));
			String[] dcgo_auth_dt                =  (JSPUtil.getParameter(request, prefix + "dcgo_auth_dt               		".trim(), length));
			String[] dcgo_lcl_ind_cd             =  (JSPUtil.getParameter(request, prefix + "dcgo_lcl_ind_cd            		".trim(), length));
			String[] dcgo_cnsl_un_no             =  (JSPUtil.getParameter(request, prefix + "dcgo_cnsl_un_no            		".trim(), length));
			String[] dcgo_sts_cd                 =  (JSPUtil.getParameter(request, prefix + "dcgo_sts_cd                		".trim(), length));
			String[] dcgo_cntr_ser_no            =  (JSPUtil.getParameter(request, prefix + "dcgo_cntr_ser_no           		".trim(), length));
			String[] dcgo_imo_comp_grp_cd        =  (JSPUtil.getParameter(request, prefix + "dcgo_imo_comp_grp_cd       		".trim(), length));
			String[] dcgo_flsh_pnt_temp          =  (JSPUtil.getParameter(request, prefix + "dcgo_flsh_pnt_temp         		".trim(), length));
			String[] dcgo_n1st_pck_grp_cd        =  (JSPUtil.getParameter(request, prefix + "dcgo_n1st_pck_grp_cd       		".trim(), length));
			String[] dcgo_n2nd_pck_grp_cd        =  (JSPUtil.getParameter(request, prefix + "dcgo_n2nd_pck_grp_cd       		".trim(), length));
			String[] dcgo_n3rd_pck_grp_cd        =  (JSPUtil.getParameter(request, prefix + "dcgo_n3rd_pck_grp_cd       		".trim(), length));
			String[] dcgo_mrn_polut_cd           =  (JSPUtil.getParameter(request, prefix + "dcgo_mrn_polut_cd          		".trim(), length));
			String[] dcgo_psa_cd                 =  (JSPUtil.getParameter(request, prefix + "dcgo_psa_cd                		".trim(), length));
			String[] dcgo_cntr_sub_ser_no        =  (JSPUtil.getParameter(request, prefix + "dcgo_cntr_sub_ser_no       		".trim(), length));
			String[] dcgo_certi_no               =  (JSPUtil.getParameter(request, prefix + "dcgo_certi_no              		".trim(), length));
			String[] dcgo_in_pck_n1st_qty        =  (JSPUtil.getParameter(request, prefix + "dcgo_in_pck_n1st_qty       		".trim(), length));
			String[] dcgo_in_pck_n1st_tp_cd      =  (JSPUtil.getParameter(request, prefix + "dcgo_in_pck_n1st_tp_cd     		".trim(), length));
			String[] dcgo_in_pck_n2nd_qty        =  (JSPUtil.getParameter(request, prefix + "dcgo_in_pck_n2nd_qty       		".trim(), length));
			String[] dcgo_in_pck_n2nd_tp_cd      =  (JSPUtil.getParameter(request, prefix + "dcgo_in_pck_n2nd_tp_cd     		".trim(), length));
			String[] dcgo_out_pck_n1st_qty       =  (JSPUtil.getParameter(request, prefix + "dcgo_out_pck_n1st_qty      		".trim(), length));
			String[] dcgo_out_pck_n1st_tp_cd     =  (JSPUtil.getParameter(request, prefix + "dcgo_out_pck_n1st_tp_cd    		".trim(), length));
			String[] dcgo_out_pck_n2nd_qty       =  (JSPUtil.getParameter(request, prefix + "dcgo_out_pck_n2nd_qty      		".trim(), length));
			String[] dcgo_out_pck_n2nd_tp_cd     =  (JSPUtil.getParameter(request, prefix + "dcgo_out_pck_n2nd_tp_cd    		".trim(), length));
			String[] dcgo_sub_lbl_desc           =  (JSPUtil.getParameter(request, prefix + "dcgo_sub_lbl_desc          		".trim(), length));
			String[] dcgo_imo_pck_no             =  (JSPUtil.getParameter(request, prefix + "dcgo_imo_pck_no            		".trim(), length));
			String[] dcgo_ems_no                 =  (JSPUtil.getParameter(request, prefix + "dcgo_ems_no                		".trim(), length));
			String[] dcgo_meas_no                =  (JSPUtil.getParameter(request, prefix + "dcgo_meas_no               		".trim(), length));
			String[] dcgo_emer_no                =  (JSPUtil.getParameter(request, prefix + "dcgo_emer_no               		".trim(), length));
			String[] dcgo_cnee_dtl_desc          =  (JSPUtil.getParameter(request, prefix + "dcgo_cnee_dtl_desc         		".trim(), length));
			String[] dcgo_net_explo_wgt          =  (JSPUtil.getParameter(request, prefix + "dcgo_net_explo_wgt         		".trim(), length));
			String[] dcgo_rada_skd_cd            =  (JSPUtil.getParameter(request, prefix + "dcgo_rada_skd_cd           		".trim(), length));
			String[] dcgo_rada_qty               =  (JSPUtil.getParameter(request, prefix + "dcgo_rada_qty              		".trim(), length));
			String[] dcgo_rada_tp_cd             =  (JSPUtil.getParameter(request, prefix + "dcgo_rada_tp_cd            		".trim(), length));
			String[] dcgo_rada_trsp_id           =  (JSPUtil.getParameter(request, prefix + "dcgo_rada_trsp_id          		".trim(), length));
			String[] dcgo_ctrl_temp_ctnt         =  (JSPUtil.getParameter(request, prefix + "dcgo_ctrl_temp_ctnt        		".trim(), length));
			String[] dcgo_emer_temp_ctnt         =  (JSPUtil.getParameter(request, prefix + "dcgo_emer_temp_ctnt        		".trim(), length));
			String[] dcgo_rqst_no                =  (JSPUtil.getParameter(request, prefix + "dcgo_rqst_no               		".trim(), length));
			String[] dcgo_appl_usr_id            =  (JSPUtil.getParameter(request, prefix + "dcgo_appl_usr_id           		".trim(), length));
			String[] dcgo_awk_ind_cd             =  (JSPUtil.getParameter(request, prefix + "dcgo_awk_ind_cd            		".trim(), length));
			String[] dcgo_bb_ind_cd              =  (JSPUtil.getParameter(request, prefix + "dcgo_bb_ind_cd             		".trim(), length));
			String[] dcgo_rf_ind_cd              =  (JSPUtil.getParameter(request, prefix + "dcgo_rf_ind_cd             		".trim(), length));
			String[] dcgo_clod_ind_cd            =  (JSPUtil.getParameter(request, prefix + "dcgo_clod_ind_cd           		".trim(), length));
			String[] dcgo_tp_seq                 =  (JSPUtil.getParameter(request, prefix + "dcgo_tp_seq                		".trim(), length));
			String[] dcgo_psa_clss_cd            =  (JSPUtil.getParameter(request, prefix + "dcgo_psa_clss_cd           		".trim(), length));
			String[] dcgo_emer_chr_cd            =  (JSPUtil.getParameter(request, prefix + "dcgo_emer_chr_cd           		".trim(), length));
			String[] dcgo_mft_n1st_no            =  (JSPUtil.getParameter(request, prefix + "dcgo_mft_n1st_no           		".trim(), length));
			String[] dcgo_mft_n2nd_no            =  (JSPUtil.getParameter(request, prefix + "dcgo_mft_n2nd_no           		".trim(), length));
			String[] dcgo_mft_sub_no             =  (JSPUtil.getParameter(request, prefix + "dcgo_mft_sub_no            		".trim(), length));
			String[] nis_evnt_dt                 =  (JSPUtil.getParameter(request, prefix + "nis_evnt_dt                		".trim(), length));
			String[] dcgo_in_max_qty             =  (JSPUtil.getParameter(request, prefix + "dcgo_in_max_qty            		".trim(), length));
			String[] dcgo_in_max_tp_cd           =  (JSPUtil.getParameter(request, prefix + "dcgo_in_max_tp_cd          		".trim(), length));
			String[] dcgo_imo_lmt_flg            =  (JSPUtil.getParameter(request, prefix + "dcgo_imo_lmt_flg           		".trim(), length));
			String[] dcgo_hcdg_flg               =  (JSPUtil.getParameter(request, prefix + "dcgo_hcdg_flg              		".trim(), length));
			String[] dcgo_hcdg_dpnd_flg          =  (JSPUtil.getParameter(request, prefix + "dcgo_hcdg_dpnd_flg         		".trim(), length));
			String[] eai_evnt_dt                 =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt                		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new BKG_DG_CGO();
				model.setIbflag                     		  ( ibflag                     	[i]);
				model.setPage_rows                  		  ( page_rows                  	[i]);
				model.setBkg_no                     		  ( bkg_no                     	[i]);
				model.setBkg_no_split               		  ( bkg_no_split               	[i]);
				model.setDcgo_seq                   		  ( dcgo_seq                   	[i]);
				model.setDcgo_un_no                 		  ( dcgo_un_no                 	[i]);
				model.setDcgo_un_no_seq             		  ( dcgo_un_no_seq             	[i]);
				model.setDcgo_net_wgt               		  ( dcgo_net_wgt               	[i]);
				model.setDcgo_wgt_tp_cd             		  ( dcgo_wgt_tp_cd             	[i]);
				model.setDcgo_grs_wgt               		  ( dcgo_grs_wgt               	[i]);
				model.setDcgo_flsh_pnt_fdo_temp_ctnt		  ( dcgo_flsh_pnt_fdo_temp_ctnt	[i]);
				model.setDcgo_rqst_dt               		  ( dcgo_rqst_dt               	[i]);
				model.setDcgo_act_shp_nm            		  ( dcgo_act_shp_nm            	[i]);
				model.setDcgo_meas_qty              		  ( dcgo_meas_qty              	[i]);
				model.setDcgo_meas_tp_cd            		  ( dcgo_meas_tp_cd            	[i]);
				model.setDcgo_imo_clss_cd           		  ( dcgo_imo_clss_cd           	[i]);
				model.setDcgo_hzd_desc              		  ( dcgo_hzd_desc              	[i]);
				model.setDcgo_tnk_tp_cd             		  ( dcgo_tnk_tp_cd             	[i]);
				model.setDcgo_stwg_instr_desc       		  ( dcgo_stwg_instr_desc       	[i]);
				model.setDcgo_vapr_cd               		  ( dcgo_vapr_cd               	[i]);
				model.setDcgo_emer_cntc_pnt_nm      		  ( dcgo_emer_cntc_pnt_nm      	[i]);
				model.setCntr_tpsz_cd               		  ( cntr_tpsz_cd               	[i]);
				model.setCntr_no                    		  ( cntr_no                    	[i]);
				model.setDcgo_auth_flg              		  ( dcgo_auth_flg              	[i]);
				model.setDcgo_rjct_rsn              		  ( dcgo_rjct_rsn              	[i]);
				model.setDcgo_rmk                   		  ( dcgo_rmk                   	[i]);
				model.setDcgo_pck_qty               		  ( dcgo_pck_qty               	[i]);
				model.setDcgo_pck_cd                		  ( dcgo_pck_cd                	[i]);
				model.setDcgo_rc_seq                		  ( dcgo_rc_seq                	[i]);
				model.setDcgo_rslt_cd               		  ( dcgo_rslt_cd               	[i]);
				model.setDcgo_auth_usr_id           		  ( dcgo_auth_usr_id           	[i]);
				model.setDcgo_auth_dt               		  ( dcgo_auth_dt               	[i]);
				model.setDcgo_lcl_ind_cd            		  ( dcgo_lcl_ind_cd            	[i]);
				model.setDcgo_cnsl_un_no            		  ( dcgo_cnsl_un_no            	[i]);
				model.setDcgo_sts_cd                		  ( dcgo_sts_cd                	[i]);
				model.setDcgo_cntr_ser_no           		  ( dcgo_cntr_ser_no           	[i]);
				model.setDcgo_imo_comp_grp_cd       		  ( dcgo_imo_comp_grp_cd       	[i]);
				model.setDcgo_flsh_pnt_temp         		  ( dcgo_flsh_pnt_temp         	[i]);
				model.setDcgo_n1st_pck_grp_cd       		  ( dcgo_n1st_pck_grp_cd       	[i]);
				model.setDcgo_n2nd_pck_grp_cd       		  ( dcgo_n2nd_pck_grp_cd       	[i]);
				model.setDcgo_n3rd_pck_grp_cd       		  ( dcgo_n3rd_pck_grp_cd       	[i]);
				model.setDcgo_mrn_polut_cd          		  ( dcgo_mrn_polut_cd          	[i]);
				model.setDcgo_psa_cd                		  ( dcgo_psa_cd                	[i]);
				model.setDcgo_cntr_sub_ser_no       		  ( dcgo_cntr_sub_ser_no       	[i]);
				model.setDcgo_certi_no              		  ( dcgo_certi_no              	[i]);
				model.setDcgo_in_pck_n1st_qty       		  ( dcgo_in_pck_n1st_qty       	[i]);
				model.setDcgo_in_pck_n1st_tp_cd     		  ( dcgo_in_pck_n1st_tp_cd     	[i]);
				model.setDcgo_in_pck_n2nd_qty       		  ( dcgo_in_pck_n2nd_qty       	[i]);
				model.setDcgo_in_pck_n2nd_tp_cd     		  ( dcgo_in_pck_n2nd_tp_cd     	[i]);
				model.setDcgo_out_pck_n1st_qty      		  ( dcgo_out_pck_n1st_qty      	[i]);
				model.setDcgo_out_pck_n1st_tp_cd    		  ( dcgo_out_pck_n1st_tp_cd    	[i]);
				model.setDcgo_out_pck_n2nd_qty      		  ( dcgo_out_pck_n2nd_qty      	[i]);
				model.setDcgo_out_pck_n2nd_tp_cd    		  ( dcgo_out_pck_n2nd_tp_cd    	[i]);
				model.setDcgo_sub_lbl_desc          		  ( dcgo_sub_lbl_desc          	[i]);
				model.setDcgo_imo_pck_no            		  ( dcgo_imo_pck_no            	[i]);
				model.setDcgo_ems_no                		  ( dcgo_ems_no                	[i]);
				model.setDcgo_meas_no               		  ( dcgo_meas_no               	[i]);
				model.setDcgo_emer_no               		  ( dcgo_emer_no               	[i]);
				model.setDcgo_cnee_dtl_desc         		  ( dcgo_cnee_dtl_desc         	[i]);
				model.setDcgo_net_explo_wgt         		  ( dcgo_net_explo_wgt         	[i]);
				model.setDcgo_rada_skd_cd           		  ( dcgo_rada_skd_cd           	[i]);
				model.setDcgo_rada_qty              		  ( dcgo_rada_qty              	[i]);
				model.setDcgo_rada_tp_cd            		  ( dcgo_rada_tp_cd            	[i]);
				model.setDcgo_rada_trsp_id          		  ( dcgo_rada_trsp_id          	[i]);
				model.setDcgo_ctrl_temp_ctnt        		  ( dcgo_ctrl_temp_ctnt        	[i]);
				model.setDcgo_emer_temp_ctnt        		  ( dcgo_emer_temp_ctnt        	[i]);
				model.setDcgo_rqst_no               		  ( dcgo_rqst_no               	[i]);
				model.setDcgo_appl_usr_id           		  ( dcgo_appl_usr_id           	[i]);
				model.setDcgo_awk_ind_cd            		  ( dcgo_awk_ind_cd            	[i]);
				model.setDcgo_bb_ind_cd             		  ( dcgo_bb_ind_cd             	[i]);
				model.setDcgo_rf_ind_cd             		  ( dcgo_rf_ind_cd             	[i]);
				model.setDcgo_clod_ind_cd           		  ( dcgo_clod_ind_cd           	[i]);
				model.setDcgo_tp_seq                		  ( dcgo_tp_seq                	[i]);
				model.setDcgo_psa_clss_cd           		  ( dcgo_psa_clss_cd           	[i]);
				model.setDcgo_emer_chr_cd           		  ( dcgo_emer_chr_cd           	[i]);
				model.setDcgo_mft_n1st_no           		  ( dcgo_mft_n1st_no           	[i]);
				model.setDcgo_mft_n2nd_no           		  ( dcgo_mft_n2nd_no           	[i]);
				model.setDcgo_mft_sub_no            		  ( dcgo_mft_sub_no            	[i]);
				model.setNis_evnt_dt                		  ( nis_evnt_dt                	[i]);
				model.setDcgo_in_max_qty            		  ( dcgo_in_max_qty            	[i]);
				model.setDcgo_in_max_tp_cd          		  ( dcgo_in_max_tp_cd          	[i]);
				model.setDcgo_imo_lmt_flg           		  ( dcgo_imo_lmt_flg           	[i]);
				model.setDcgo_hcdg_flg              		  ( dcgo_hcdg_flg              	[i]);
				model.setDcgo_hcdg_dpnd_flg         		  ( dcgo_hcdg_dpnd_flg         	[i]);
				model.setEai_evnt_dt                		  ( eai_evnt_dt                	[i]);
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
