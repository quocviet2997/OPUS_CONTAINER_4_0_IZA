/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : BKG_BKG_CNTR.java
*@FileTitle : 사용자 관리5
*Open Issues :
*Change history :
*@LastModifyDate : 2007-01-05
*@LastModifier : Kildong_hong6
*@LastVersion : 1.0
* 2007-01-05 Kildong_hong6
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
public final class BKG_BKG_CNTR implements java.io.Serializable {

	private String                ibflag                = "";
	private String                page_rows             = "";
	private String                bkg_no                = "";
	private String                bkg_no_split          = "";
	private String                cntr_no               = "";
	private String                cntr_tpsz_cd          = "";
	private String                cntr_seal_no          = "";
	private String                cnmv_seq              = "";
	private String                cnmv_yr               = "";
	private String                bkg_cntr_sts_cd       = "";
	private String                pck_qty               = "";
	private String                pck_cd                = "";
	private String                cntr_wgt              = "";
	private String                ttl_meas_wgt          = "";
	private String                cntr_wgt_tp_cd        = "";
	private String                cntr_meas_tp_cd       = "";
	private String                cntr_rcv_term_cd      = "";
	private String                cntr_de_term_cd       = "";
	private String                cntr_prt_flg          = "";
	private String                cntr_vol_qty          = "";
	private String                cntr_cyc_no           = "";
	private String                cntr_expt_cd          = "";
	private String                hngr_flg              = "";
	private String                cntr_full_cyc_nm      = "";
	private String                cntr_hlg_flg          = "";
	private String                org_fm_loc_cd         = "";
	private String                org_to_yd_cd          = "";
	private String                dest_fm_loc_cd        = "";
	private String                dest_to_yd_cd         = "";
	private String                spcl_cgo_cntr_dg_flg  = "";
	private String                spcl_cgo_cntr_bb_flg  = "";
	private String                spcl_cgo_cntr_awk_flg = "";
	private String                spcl_cgo_cntr_rf_flg  = "";
	private String                spcl_cgo_cntr_rd_flg  = "";
	private String                soc_flg               = "";
	private String                bkg_cntr_rmk          = "";
	private String                cntr_tro_ob_seq       = "";
	private String                cntr_tro_ib_seq       = "";
	private String                cntr_tro_ob_sub_seq   = "";
	private String                cntr_tro_ib_sub_seq   = "";
	private String                cntr_cfm_flg          = "";
	private String                cntr_mf_cfm_flg       = "";
	private String                cntr_cdr_dt           = "";
	private String                cntr_cdr_yd_cd        = "";
	private String                cntr_sub_flg          = "";
	private String                subst_cntr_tpsz_cd    = "";
	private String                org_yd_cd             = "";
	private String                dest_yd_cd            = "";
	private String                cre_dt                = "";
	private String                cnmv_flg              = "";
	private String                do_no                 = "";
	private String                do_no_split           = "";
	private String                cntr_rmk              = "";
	private String                cntr_rmk_bl_flg       = "";
	private String                cntr_dp_seq           = "";
	private String                nis_evnt_dt           = "";
	private String                cntr_add_mv_cd        = "";
	private String                so_end_flg            = "";
	private String                po_no                 = "";
	private String                bkg_cntr_cre_dt       = "";
	private String                ob_cy_gen_dt          = "";
	private String                ob_cy_gen_tp_cd       = "";
	private String                cntr_tax_expt_cd      = "";
	private String                eai_sts               = "";
	private String                eai_dt                = "";
	private String                eai_evnt_dt           = "";
	
	// 추가 20070419
	private String				  mst_lcl_cd			= "";

	public BKG_BKG_CNTR(){}

	public BKG_BKG_CNTR(
			String                ibflag               ,
			String                page_rows            ,
			String                bkg_no               ,
			String                bkg_no_split         ,
			String                cntr_no              ,
			String                cntr_tpsz_cd         ,
			String                cntr_seal_no         ,
			String                cnmv_seq             ,
			String                cnmv_yr              ,
			String                bkg_cntr_sts_cd      ,
			String                pck_qty              ,
			String                pck_cd               ,
			String                cntr_wgt             ,
			String                ttl_meas_wgt         ,
			String                cntr_wgt_tp_cd       ,
			String                cntr_meas_tp_cd      ,
			String                cntr_rcv_term_cd     ,
			String                cntr_de_term_cd      ,
			String                cntr_prt_flg         ,
			String                cntr_vol_qty         ,
			String                cntr_cyc_no          ,
			String                cntr_expt_cd         ,
			String                hngr_flg             ,
			String                cntr_full_cyc_nm     ,
			String                cntr_hlg_flg         ,
			String                org_fm_loc_cd        ,
			String                org_to_yd_cd         ,
			String                dest_fm_loc_cd       ,
			String                dest_to_yd_cd        ,
			String                spcl_cgo_cntr_dg_flg ,
			String                spcl_cgo_cntr_bb_flg ,
			String                spcl_cgo_cntr_awk_flg,
			String                spcl_cgo_cntr_rf_flg ,
			String                spcl_cgo_cntr_rd_flg ,
			String                soc_flg              ,
			String                bkg_cntr_rmk         ,
			String                cntr_tro_ob_seq      ,
			String                cntr_tro_ib_seq      ,
			String                cntr_tro_ob_sub_seq  ,
			String                cntr_tro_ib_sub_seq  ,
			String                cntr_cfm_flg         ,
			String                cntr_mf_cfm_flg      ,
			String                cntr_cdr_dt          ,
			String                cntr_cdr_yd_cd       ,
			String                cntr_sub_flg         ,
			String                subst_cntr_tpsz_cd   ,
			String                org_yd_cd            ,
			String                dest_yd_cd           ,
			String                cre_dt               ,
			String                cnmv_flg             ,
			String                do_no                ,
			String                do_no_split          ,
			String                cntr_rmk             ,
			String                cntr_rmk_bl_flg      ,
			String                cntr_dp_seq          ,
			String                nis_evnt_dt          ,
			String                cntr_add_mv_cd       ,
			String                so_end_flg           ,
			String                po_no                ,
			String                bkg_cntr_cre_dt      ,
			String                ob_cy_gen_dt         ,
			String                ob_cy_gen_tp_cd      ,
			String                cntr_tax_expt_cd     ,
			String                eai_sts              ,
			String                eai_dt               ,
			String                eai_evnt_dt          ,
			String				  mst_lcl_cd			){
		this.ibflag                = ibflag               ;
		this.page_rows             = page_rows            ;
		this.bkg_no                = bkg_no               ;
		this.bkg_no_split          = bkg_no_split         ;
		this.cntr_no               = cntr_no              ;
		this.cntr_tpsz_cd          = cntr_tpsz_cd         ;
		this.cntr_seal_no          = cntr_seal_no         ;
		this.cnmv_seq              = cnmv_seq             ;
		this.cnmv_yr               = cnmv_yr              ;
		this.bkg_cntr_sts_cd       = bkg_cntr_sts_cd      ;
		this.pck_qty               = pck_qty              ;
		this.pck_cd                = pck_cd               ;
		this.cntr_wgt              = cntr_wgt             ;
		this.ttl_meas_wgt          = ttl_meas_wgt         ;
		this.cntr_wgt_tp_cd        = cntr_wgt_tp_cd       ;
		this.cntr_meas_tp_cd       = cntr_meas_tp_cd      ;
		this.cntr_rcv_term_cd      = cntr_rcv_term_cd     ;
		this.cntr_de_term_cd       = cntr_de_term_cd      ;
		this.cntr_prt_flg          = cntr_prt_flg         ;
		this.cntr_vol_qty          = cntr_vol_qty         ;
		this.cntr_cyc_no           = cntr_cyc_no          ;
		this.cntr_expt_cd          = cntr_expt_cd         ;
		this.hngr_flg              = hngr_flg             ;
		this.cntr_full_cyc_nm      = cntr_full_cyc_nm     ;
		this.cntr_hlg_flg          = cntr_hlg_flg         ;
		this.org_fm_loc_cd         = org_fm_loc_cd        ;
		this.org_to_yd_cd          = org_to_yd_cd         ;
		this.dest_fm_loc_cd        = dest_fm_loc_cd       ;
		this.dest_to_yd_cd         = dest_to_yd_cd        ;
		this.spcl_cgo_cntr_dg_flg  = spcl_cgo_cntr_dg_flg ;
		this.spcl_cgo_cntr_bb_flg  = spcl_cgo_cntr_bb_flg ;
		this.spcl_cgo_cntr_awk_flg = spcl_cgo_cntr_awk_flg;
		this.spcl_cgo_cntr_rf_flg  = spcl_cgo_cntr_rf_flg ;
		this.spcl_cgo_cntr_rd_flg  = spcl_cgo_cntr_rd_flg ;
		this.soc_flg               = soc_flg              ;
		this.bkg_cntr_rmk          = bkg_cntr_rmk         ;
		this.cntr_tro_ob_seq       = cntr_tro_ob_seq      ;
		this.cntr_tro_ib_seq       = cntr_tro_ib_seq      ;
		this.cntr_tro_ob_sub_seq   = cntr_tro_ob_sub_seq  ;
		this.cntr_tro_ib_sub_seq   = cntr_tro_ib_sub_seq  ;
		this.cntr_cfm_flg          = cntr_cfm_flg         ;
		this.cntr_mf_cfm_flg       = cntr_mf_cfm_flg      ;
		this.cntr_cdr_dt           = cntr_cdr_dt          ;
		this.cntr_cdr_yd_cd        = cntr_cdr_yd_cd       ;
		this.cntr_sub_flg          = cntr_sub_flg         ;
		this.subst_cntr_tpsz_cd    = subst_cntr_tpsz_cd   ;
		this.org_yd_cd             = org_yd_cd            ;
		this.dest_yd_cd            = dest_yd_cd           ;
		this.cre_dt                = cre_dt               ;
		this.cnmv_flg              = cnmv_flg             ;
		this.do_no                 = do_no                ;
		this.do_no_split           = do_no_split          ;
		this.cntr_rmk              = cntr_rmk             ;
		this.cntr_rmk_bl_flg       = cntr_rmk_bl_flg      ;
		this.cntr_dp_seq           = cntr_dp_seq          ;
		this.nis_evnt_dt           = nis_evnt_dt          ;
		this.cntr_add_mv_cd        = cntr_add_mv_cd       ;
		this.so_end_flg            = so_end_flg           ;
		this.po_no                 = po_no                ;
		this.bkg_cntr_cre_dt       = bkg_cntr_cre_dt      ;
		this.ob_cy_gen_dt          = ob_cy_gen_dt         ;
		this.ob_cy_gen_tp_cd       = ob_cy_gen_tp_cd      ;
		this.cntr_tax_expt_cd      = cntr_tax_expt_cd     ;
		this.eai_sts               = eai_sts              ;
		this.eai_dt                = eai_dt               ;
		this.eai_evnt_dt           = eai_evnt_dt          ;
		this.mst_lcl_cd			   = mst_lcl_cd			  ;
	}

	// getter method is proceeding ..
	public String                getIbflag               (){	return ibflag               	;	}
	public String                getPage_rows            (){	return page_rows            	;	}
	public String                getBkg_no               (){	return bkg_no               	;	}
	public String                getBkg_no_split         (){	return bkg_no_split         	;	}
	public String                getCntr_no              (){	return cntr_no              	;	}
	public String                getCntr_tpsz_cd         (){	return cntr_tpsz_cd         	;	}
	public String                getCntr_seal_no         (){	return cntr_seal_no         	;	}
	public String                getCnmv_seq             (){	return cnmv_seq             	;	}
	public String                getCnmv_yr              (){	return cnmv_yr              	;	}
	public String                getBkg_cntr_sts_cd      (){	return bkg_cntr_sts_cd      	;	}
	public String                getPck_qty              (){	return pck_qty              	;	}
	public String                getPck_cd               (){	return pck_cd               	;	}
	public String                getCntr_wgt             (){	return cntr_wgt             	;	}
	public String                getTtl_meas_wgt         (){	return ttl_meas_wgt         	;	}
	public String                getCntr_wgt_tp_cd       (){	return cntr_wgt_tp_cd       	;	}
	public String                getCntr_meas_tp_cd      (){	return cntr_meas_tp_cd      	;	}
	public String                getCntr_rcv_term_cd     (){	return cntr_rcv_term_cd     	;	}
	public String                getCntr_de_term_cd      (){	return cntr_de_term_cd      	;	}
	public String                getCntr_prt_flg         (){	return cntr_prt_flg         	;	}
	public String                getCntr_vol_qty         (){	return cntr_vol_qty         	;	}
	public String                getCntr_cyc_no          (){	return cntr_cyc_no          	;	}
	public String                getCntr_expt_cd         (){	return cntr_expt_cd         	;	}
	public String                getHngr_flg             (){	return hngr_flg             	;	}
	public String                getCntr_full_cyc_nm     (){	return cntr_full_cyc_nm     	;	}
	public String                getCntr_hlg_flg         (){	return cntr_hlg_flg         	;	}
	public String                getOrg_fm_loc_cd        (){	return org_fm_loc_cd        	;	}
	public String                getOrg_to_yd_cd         (){	return org_to_yd_cd         	;	}
	public String                getDest_fm_loc_cd       (){	return dest_fm_loc_cd       	;	}
	public String                getDest_to_yd_cd        (){	return dest_to_yd_cd        	;	}
	public String                getSpcl_cgo_cntr_dg_flg (){	return spcl_cgo_cntr_dg_flg 	;	}
	public String                getSpcl_cgo_cntr_bb_flg (){	return spcl_cgo_cntr_bb_flg 	;	}
	public String                getSpcl_cgo_cntr_awk_flg(){	return spcl_cgo_cntr_awk_flg	;	}
	public String                getSpcl_cgo_cntr_rf_flg (){	return spcl_cgo_cntr_rf_flg 	;	}
	public String                getSpcl_cgo_cntr_rd_flg (){	return spcl_cgo_cntr_rd_flg 	;	}
	public String                getSoc_flg              (){	return soc_flg              	;	}
	public String                getBkg_cntr_rmk         (){	return bkg_cntr_rmk         	;	}
	public String                getCntr_tro_ob_seq      (){	return cntr_tro_ob_seq      	;	}
	public String                getCntr_tro_ib_seq      (){	return cntr_tro_ib_seq      	;	}
	public String                getCntr_tro_ob_sub_seq  (){	return cntr_tro_ob_sub_seq  	;	}
	public String                getCntr_tro_ib_sub_seq  (){	return cntr_tro_ib_sub_seq  	;	}
	public String                getCntr_cfm_flg         (){	return cntr_cfm_flg         	;	}
	public String                getCntr_mf_cfm_flg      (){	return cntr_mf_cfm_flg      	;	}
	public String                getCntr_cdr_dt          (){	return cntr_cdr_dt          	;	}
	public String                getCntr_cdr_yd_cd       (){	return cntr_cdr_yd_cd       	;	}
	public String                getCntr_sub_flg         (){	return cntr_sub_flg         	;	}
	public String                getSubst_cntr_tpsz_cd   (){	return subst_cntr_tpsz_cd   	;	}
	public String                getOrg_yd_cd            (){	return org_yd_cd            	;	}
	public String                getDest_yd_cd           (){	return dest_yd_cd           	;	}
	public String                getCre_dt               (){	return cre_dt               	;	}
	public String                getCnmv_flg             (){	return cnmv_flg             	;	}
	public String                getDo_no                (){	return do_no                	;	}
	public String                getDo_no_split          (){	return do_no_split          	;	}
	public String                getCntr_rmk             (){	return cntr_rmk             	;	}
	public String                getCntr_rmk_bl_flg      (){	return cntr_rmk_bl_flg      	;	}
	public String                getCntr_dp_seq          (){	return cntr_dp_seq          	;	}
	public String                getNis_evnt_dt          (){	return nis_evnt_dt          	;	}
	public String                getCntr_add_mv_cd       (){	return cntr_add_mv_cd       	;	}
	public String                getSo_end_flg           (){	return so_end_flg           	;	}
	public String                getPo_no                (){	return po_no                	;	}
	public String                getBkg_cntr_cre_dt      (){	return bkg_cntr_cre_dt      	;	}
	public String                getOb_cy_gen_dt         (){	return ob_cy_gen_dt         	;	}
	public String                getOb_cy_gen_tp_cd      (){	return ob_cy_gen_tp_cd      	;	}
	public String                getCntr_tax_expt_cd     (){	return cntr_tax_expt_cd     	;	}
	public String                getEai_sts              (){	return eai_sts              	;	}
	public String                getEai_dt               (){	return eai_dt               	;	}
	public String                getEai_evnt_dt          (){	return eai_evnt_dt          	;	}
	
	public String                getMst_lcl_cd           (){	return mst_lcl_cd          		;	}
	

	// setter method is proceeding ..
	public void setIbflag               ( String                ibflag                ){	this.ibflag                = ibflag               	;	}
	public void setPage_rows            ( String                page_rows             ){	this.page_rows             = page_rows            	;	}
	public void setBkg_no               ( String                bkg_no                ){	this.bkg_no                = bkg_no               	;	}
	public void setBkg_no_split         ( String                bkg_no_split          ){	this.bkg_no_split          = bkg_no_split         	;	}
	public void setCntr_no              ( String                cntr_no               ){	this.cntr_no               = cntr_no              	;	}
	public void setCntr_tpsz_cd         ( String                cntr_tpsz_cd          ){	this.cntr_tpsz_cd          = cntr_tpsz_cd         	;	}
	public void setCntr_seal_no         ( String                cntr_seal_no          ){	this.cntr_seal_no          = cntr_seal_no         	;	}
	public void setCnmv_seq             ( String                cnmv_seq              ){	this.cnmv_seq              = cnmv_seq             	;	}
	public void setCnmv_yr              ( String                cnmv_yr               ){	this.cnmv_yr               = cnmv_yr              	;	}
	public void setBkg_cntr_sts_cd      ( String                bkg_cntr_sts_cd       ){	this.bkg_cntr_sts_cd       = bkg_cntr_sts_cd      	;	}
	public void setPck_qty              ( String                pck_qty               ){	this.pck_qty               = pck_qty              	;	}
	public void setPck_cd               ( String                pck_cd                ){	this.pck_cd                = pck_cd               	;	}
	public void setCntr_wgt             ( String                cntr_wgt              ){	this.cntr_wgt              = cntr_wgt             	;	}
	public void setTtl_meas_wgt         ( String                ttl_meas_wgt          ){	this.ttl_meas_wgt          = ttl_meas_wgt         	;	}
	public void setCntr_wgt_tp_cd       ( String                cntr_wgt_tp_cd        ){	this.cntr_wgt_tp_cd        = cntr_wgt_tp_cd       	;	}
	public void setCntr_meas_tp_cd      ( String                cntr_meas_tp_cd       ){	this.cntr_meas_tp_cd       = cntr_meas_tp_cd      	;	}
	public void setCntr_rcv_term_cd     ( String                cntr_rcv_term_cd      ){	this.cntr_rcv_term_cd      = cntr_rcv_term_cd     	;	}
	public void setCntr_de_term_cd      ( String                cntr_de_term_cd       ){	this.cntr_de_term_cd       = cntr_de_term_cd      	;	}
	public void setCntr_prt_flg         ( String                cntr_prt_flg          ){	this.cntr_prt_flg          = cntr_prt_flg         	;	}
	public void setCntr_vol_qty         ( String                cntr_vol_qty          ){	this.cntr_vol_qty          = cntr_vol_qty         	;	}
	public void setCntr_cyc_no          ( String                cntr_cyc_no           ){	this.cntr_cyc_no           = cntr_cyc_no          	;	}
	public void setCntr_expt_cd         ( String                cntr_expt_cd          ){	this.cntr_expt_cd          = cntr_expt_cd         	;	}
	public void setHngr_flg             ( String                hngr_flg              ){	this.hngr_flg              = hngr_flg             	;	}
	public void setCntr_full_cyc_nm     ( String                cntr_full_cyc_nm      ){	this.cntr_full_cyc_nm      = cntr_full_cyc_nm     	;	}
	public void setCntr_hlg_flg         ( String                cntr_hlg_flg          ){	this.cntr_hlg_flg          = cntr_hlg_flg         	;	}
	public void setOrg_fm_loc_cd        ( String                org_fm_loc_cd         ){	this.org_fm_loc_cd         = org_fm_loc_cd        	;	}
	public void setOrg_to_yd_cd         ( String                org_to_yd_cd          ){	this.org_to_yd_cd          = org_to_yd_cd         	;	}
	public void setDest_fm_loc_cd       ( String                dest_fm_loc_cd        ){	this.dest_fm_loc_cd        = dest_fm_loc_cd       	;	}
	public void setDest_to_yd_cd        ( String                dest_to_yd_cd         ){	this.dest_to_yd_cd         = dest_to_yd_cd        	;	}
	public void setSpcl_cgo_cntr_dg_flg ( String                spcl_cgo_cntr_dg_flg  ){	this.spcl_cgo_cntr_dg_flg  = spcl_cgo_cntr_dg_flg 	;	}
	public void setSpcl_cgo_cntr_bb_flg ( String                spcl_cgo_cntr_bb_flg  ){	this.spcl_cgo_cntr_bb_flg  = spcl_cgo_cntr_bb_flg 	;	}
	public void setSpcl_cgo_cntr_awk_flg( String                spcl_cgo_cntr_awk_flg ){	this.spcl_cgo_cntr_awk_flg = spcl_cgo_cntr_awk_flg	;	}
	public void setSpcl_cgo_cntr_rf_flg ( String                spcl_cgo_cntr_rf_flg  ){	this.spcl_cgo_cntr_rf_flg  = spcl_cgo_cntr_rf_flg 	;	}
	public void setSpcl_cgo_cntr_rd_flg ( String                spcl_cgo_cntr_rd_flg  ){	this.spcl_cgo_cntr_rd_flg  = spcl_cgo_cntr_rd_flg 	;	}
	public void setSoc_flg              ( String                soc_flg               ){	this.soc_flg               = soc_flg              	;	}
	public void setBkg_cntr_rmk         ( String                bkg_cntr_rmk          ){	this.bkg_cntr_rmk          = bkg_cntr_rmk         	;	}
	public void setCntr_tro_ob_seq      ( String                cntr_tro_ob_seq       ){	this.cntr_tro_ob_seq       = cntr_tro_ob_seq      	;	}
	public void setCntr_tro_ib_seq      ( String                cntr_tro_ib_seq       ){	this.cntr_tro_ib_seq       = cntr_tro_ib_seq      	;	}
	public void setCntr_tro_ob_sub_seq  ( String                cntr_tro_ob_sub_seq   ){	this.cntr_tro_ob_sub_seq   = cntr_tro_ob_sub_seq  	;	}
	public void setCntr_tro_ib_sub_seq  ( String                cntr_tro_ib_sub_seq   ){	this.cntr_tro_ib_sub_seq   = cntr_tro_ib_sub_seq  	;	}
	public void setCntr_cfm_flg         ( String                cntr_cfm_flg          ){	this.cntr_cfm_flg          = cntr_cfm_flg         	;	}
	public void setCntr_mf_cfm_flg      ( String                cntr_mf_cfm_flg       ){	this.cntr_mf_cfm_flg       = cntr_mf_cfm_flg      	;	}
	public void setCntr_cdr_dt          ( String                cntr_cdr_dt           ){	this.cntr_cdr_dt           = cntr_cdr_dt          	;	}
	public void setCntr_cdr_yd_cd       ( String                cntr_cdr_yd_cd        ){	this.cntr_cdr_yd_cd        = cntr_cdr_yd_cd       	;	}
	public void setCntr_sub_flg         ( String                cntr_sub_flg          ){	this.cntr_sub_flg          = cntr_sub_flg         	;	}
	public void setSubst_cntr_tpsz_cd   ( String                subst_cntr_tpsz_cd    ){	this.subst_cntr_tpsz_cd    = subst_cntr_tpsz_cd   	;	}
	public void setOrg_yd_cd            ( String                org_yd_cd             ){	this.org_yd_cd             = org_yd_cd            	;	}
	public void setDest_yd_cd           ( String                dest_yd_cd            ){	this.dest_yd_cd            = dest_yd_cd           	;	}
	public void setCre_dt               ( String                cre_dt                ){	this.cre_dt                = cre_dt               	;	}
	public void setCnmv_flg             ( String                cnmv_flg              ){	this.cnmv_flg              = cnmv_flg             	;	}
	public void setDo_no                ( String                do_no                 ){	this.do_no                 = do_no                	;	}
	public void setDo_no_split          ( String                do_no_split           ){	this.do_no_split           = do_no_split          	;	}
	public void setCntr_rmk             ( String                cntr_rmk              ){	this.cntr_rmk              = cntr_rmk             	;	}
	public void setCntr_rmk_bl_flg      ( String                cntr_rmk_bl_flg       ){	this.cntr_rmk_bl_flg       = cntr_rmk_bl_flg      	;	}
	public void setCntr_dp_seq          ( String                cntr_dp_seq           ){	this.cntr_dp_seq           = cntr_dp_seq          	;	}
	public void setNis_evnt_dt          ( String                nis_evnt_dt           ){	this.nis_evnt_dt           = nis_evnt_dt          	;	}
	public void setCntr_add_mv_cd       ( String                cntr_add_mv_cd        ){	this.cntr_add_mv_cd        = cntr_add_mv_cd       	;	}
	public void setSo_end_flg           ( String                so_end_flg            ){	this.so_end_flg            = so_end_flg           	;	}
	public void setPo_no                ( String                po_no                 ){	this.po_no                 = po_no                	;	}
	public void setBkg_cntr_cre_dt      ( String                bkg_cntr_cre_dt       ){	this.bkg_cntr_cre_dt       = bkg_cntr_cre_dt      	;	}
	public void setOb_cy_gen_dt         ( String                ob_cy_gen_dt          ){	this.ob_cy_gen_dt          = ob_cy_gen_dt         	;	}
	public void setOb_cy_gen_tp_cd      ( String                ob_cy_gen_tp_cd       ){	this.ob_cy_gen_tp_cd       = ob_cy_gen_tp_cd      	;	}
	public void setCntr_tax_expt_cd     ( String                cntr_tax_expt_cd      ){	this.cntr_tax_expt_cd      = cntr_tax_expt_cd     	;	}
	public void setEai_sts              ( String                eai_sts               ){	this.eai_sts               = eai_sts              	;	}
	public void setEai_dt               ( String                eai_dt                ){	this.eai_dt                = eai_dt               	;	}
	public void setEai_evnt_dt          ( String                eai_evnt_dt           ){	this.eai_evnt_dt           = eai_evnt_dt          	;	}
	
	public void setMst_lcl_cd           ( String                mst_lcl_cd            ){	this.mst_lcl_cd            = mst_lcl_cd          	;	}
	

	public static BKG_BKG_CNTR fromRequest(HttpServletRequest request) {
		BKG_BKG_CNTR model = new BKG_BKG_CNTR();
		try {
			model.setIbflag               	(JSPUtil.getParameter(request, "ibflag               		".trim(), ""));
			model.setPage_rows            	(JSPUtil.getParameter(request, "page_rows            		".trim(), ""));
			model.setBkg_no               	(JSPUtil.getParameter(request, "bkg_no               		".trim(), ""));
			model.setBkg_no_split         	(JSPUtil.getParameter(request, "bkg_no_split         		".trim(), ""));
			model.setCntr_no              	(JSPUtil.getParameter(request, "cntr_no              		".trim(), ""));
			model.setCntr_tpsz_cd         	(JSPUtil.getParameter(request, "cntr_tpsz_cd         		".trim(), ""));
			model.setCntr_seal_no         	(JSPUtil.getParameter(request, "cntr_seal_no         		".trim(), ""));
			model.setCnmv_seq             	(JSPUtil.getParameter(request, "cnmv_seq             		".trim(), ""));
			model.setCnmv_yr              	(JSPUtil.getParameter(request, "cnmv_yr              		".trim(), ""));
			model.setBkg_cntr_sts_cd      	(JSPUtil.getParameter(request, "bkg_cntr_sts_cd      		".trim(), ""));
			model.setPck_qty              	(JSPUtil.getParameter(request, "pck_qty              		".trim(), ""));
			model.setPck_cd               	(JSPUtil.getParameter(request, "pck_cd               		".trim(), ""));
			model.setCntr_wgt             	(JSPUtil.getParameter(request, "cntr_wgt             		".trim(), ""));
			model.setTtl_meas_wgt         	(JSPUtil.getParameter(request, "ttl_meas_wgt         		".trim(), ""));
			model.setCntr_wgt_tp_cd       	(JSPUtil.getParameter(request, "cntr_wgt_tp_cd       		".trim(), ""));
			model.setCntr_meas_tp_cd      	(JSPUtil.getParameter(request, "cntr_meas_tp_cd      		".trim(), ""));
			model.setCntr_rcv_term_cd     	(JSPUtil.getParameter(request, "cntr_rcv_term_cd     		".trim(), ""));
			model.setCntr_de_term_cd      	(JSPUtil.getParameter(request, "cntr_de_term_cd      		".trim(), ""));
			model.setCntr_prt_flg         	(JSPUtil.getParameter(request, "cntr_prt_flg         		".trim(), ""));
			model.setCntr_vol_qty         	(JSPUtil.getParameter(request, "cntr_vol_qty         		".trim(), ""));
			model.setCntr_cyc_no          	(JSPUtil.getParameter(request, "cntr_cyc_no          		".trim(), ""));
			model.setCntr_expt_cd         	(JSPUtil.getParameter(request, "cntr_expt_cd         		".trim(), ""));
			model.setHngr_flg             	(JSPUtil.getParameter(request, "hngr_flg             		".trim(), ""));
			model.setCntr_full_cyc_nm     	(JSPUtil.getParameter(request, "cntr_full_cyc_nm     		".trim(), ""));
			model.setCntr_hlg_flg         	(JSPUtil.getParameter(request, "cntr_hlg_flg         		".trim(), ""));
			model.setOrg_fm_loc_cd        	(JSPUtil.getParameter(request, "org_fm_loc_cd        		".trim(), ""));
			model.setOrg_to_yd_cd         	(JSPUtil.getParameter(request, "org_to_yd_cd         		".trim(), ""));
			model.setDest_fm_loc_cd       	(JSPUtil.getParameter(request, "dest_fm_loc_cd       		".trim(), ""));
			model.setDest_to_yd_cd        	(JSPUtil.getParameter(request, "dest_to_yd_cd        		".trim(), ""));
			model.setSpcl_cgo_cntr_dg_flg 	(JSPUtil.getParameter(request, "spcl_cgo_cntr_dg_flg 		".trim(), ""));
			model.setSpcl_cgo_cntr_bb_flg 	(JSPUtil.getParameter(request, "spcl_cgo_cntr_bb_flg 		".trim(), ""));
			model.setSpcl_cgo_cntr_awk_flg	(JSPUtil.getParameter(request, "spcl_cgo_cntr_awk_flg		".trim(), ""));
			model.setSpcl_cgo_cntr_rf_flg 	(JSPUtil.getParameter(request, "spcl_cgo_cntr_rf_flg 		".trim(), ""));
			model.setSpcl_cgo_cntr_rd_flg 	(JSPUtil.getParameter(request, "spcl_cgo_cntr_rd_flg 		".trim(), ""));
			model.setSoc_flg              	(JSPUtil.getParameter(request, "soc_flg              		".trim(), ""));
			model.setBkg_cntr_rmk         	(JSPUtil.getParameter(request, "bkg_cntr_rmk         		".trim(), ""));
			model.setCntr_tro_ob_seq      	(JSPUtil.getParameter(request, "cntr_tro_ob_seq      		".trim(), ""));
			model.setCntr_tro_ib_seq      	(JSPUtil.getParameter(request, "cntr_tro_ib_seq      		".trim(), ""));
			model.setCntr_tro_ob_sub_seq  	(JSPUtil.getParameter(request, "cntr_tro_ob_sub_seq  		".trim(), ""));
			model.setCntr_tro_ib_sub_seq  	(JSPUtil.getParameter(request, "cntr_tro_ib_sub_seq  		".trim(), ""));
			model.setCntr_cfm_flg         	(JSPUtil.getParameter(request, "cntr_cfm_flg         		".trim(), ""));
			model.setCntr_mf_cfm_flg      	(JSPUtil.getParameter(request, "cntr_mf_cfm_flg      		".trim(), ""));
			model.setCntr_cdr_dt          	(JSPUtil.getParameter(request, "cntr_cdr_dt          		".trim(), ""));
			model.setCntr_cdr_yd_cd       	(JSPUtil.getParameter(request, "cntr_cdr_yd_cd       		".trim(), ""));
			model.setCntr_sub_flg         	(JSPUtil.getParameter(request, "cntr_sub_flg         		".trim(), ""));
			model.setSubst_cntr_tpsz_cd   	(JSPUtil.getParameter(request, "subst_cntr_tpsz_cd   		".trim(), ""));
			model.setOrg_yd_cd            	(JSPUtil.getParameter(request, "org_yd_cd            		".trim(), ""));
			model.setDest_yd_cd           	(JSPUtil.getParameter(request, "dest_yd_cd           		".trim(), ""));
			model.setCre_dt               	(JSPUtil.getParameter(request, "cre_dt               		".trim(), ""));
			model.setCnmv_flg             	(JSPUtil.getParameter(request, "cnmv_flg             		".trim(), ""));
			model.setDo_no                	(JSPUtil.getParameter(request, "do_no                		".trim(), ""));
			model.setDo_no_split          	(JSPUtil.getParameter(request, "do_no_split          		".trim(), ""));
			model.setCntr_rmk             	(JSPUtil.getParameter(request, "cntr_rmk             		".trim(), ""));
			model.setCntr_rmk_bl_flg      	(JSPUtil.getParameter(request, "cntr_rmk_bl_flg      		".trim(), ""));
			model.setCntr_dp_seq          	(JSPUtil.getParameter(request, "cntr_dp_seq          		".trim(), ""));
			model.setNis_evnt_dt          	(JSPUtil.getParameter(request, "nis_evnt_dt          		".trim(), ""));
			model.setCntr_add_mv_cd       	(JSPUtil.getParameter(request, "cntr_add_mv_cd       		".trim(), ""));
			model.setSo_end_flg           	(JSPUtil.getParameter(request, "so_end_flg           		".trim(), ""));
			model.setPo_no                	(JSPUtil.getParameter(request, "po_no                		".trim(), ""));
			model.setBkg_cntr_cre_dt      	(JSPUtil.getParameter(request, "bkg_cntr_cre_dt      		".trim(), ""));
			model.setOb_cy_gen_dt         	(JSPUtil.getParameter(request, "ob_cy_gen_dt         		".trim(), ""));
			model.setOb_cy_gen_tp_cd      	(JSPUtil.getParameter(request, "ob_cy_gen_tp_cd      		".trim(), ""));
			model.setCntr_tax_expt_cd     	(JSPUtil.getParameter(request, "cntr_tax_expt_cd     		".trim(), ""));
			model.setEai_sts              	(JSPUtil.getParameter(request, "eai_sts              		".trim(), ""));
			model.setEai_dt               	(JSPUtil.getParameter(request, "eai_dt               		".trim(), ""));
			model.setEai_evnt_dt          	(JSPUtil.getParameter(request, "eai_evnt_dt          		".trim(), ""));
			
			model.setMst_lcl_cd          	(JSPUtil.getParameter(request, "mst_lcl_cd          		".trim(), ""));
			
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		BKG_BKG_CNTR model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag                =  (JSPUtil.getParameter(request, "ibflag               		".trim(), length));
			String[] page_rows             =  (JSPUtil.getParameter(request, "page_rows            		".trim(), length));
			String[] bkg_no                =  (JSPUtil.getParameter(request, "bkg_no               		".trim(), length));
			String[] bkg_no_split          =  (JSPUtil.getParameter(request, "bkg_no_split         		".trim(), length));
			String[] cntr_no               =  (JSPUtil.getParameter(request, "cntr_no              		".trim(), length));
			String[] cntr_tpsz_cd          =  (JSPUtil.getParameter(request, "cntr_tpsz_cd         		".trim(), length));
			String[] cntr_seal_no          =  (JSPUtil.getParameter(request, "cntr_seal_no         		".trim(), length));
			String[] cnmv_seq              =  (JSPUtil.getParameter(request, "cnmv_seq             		".trim(), length));
			String[] cnmv_yr               =  (JSPUtil.getParameter(request, "cnmv_yr              		".trim(), length));
			String[] bkg_cntr_sts_cd       =  (JSPUtil.getParameter(request, "bkg_cntr_sts_cd      		".trim(), length));
			String[] pck_qty               =  (JSPUtil.getParameter(request, "pck_qty              		".trim(), length));
			String[] pck_cd                =  (JSPUtil.getParameter(request, "pck_cd               		".trim(), length));
			String[] cntr_wgt              =  (JSPUtil.getParameter(request, "cntr_wgt             		".trim(), length));
			String[] ttl_meas_wgt          =  (JSPUtil.getParameter(request, "ttl_meas_wgt         		".trim(), length));
			String[] cntr_wgt_tp_cd        =  (JSPUtil.getParameter(request, "cntr_wgt_tp_cd       		".trim(), length));
			String[] cntr_meas_tp_cd       =  (JSPUtil.getParameter(request, "cntr_meas_tp_cd      		".trim(), length));
			String[] cntr_rcv_term_cd      =  (JSPUtil.getParameter(request, "cntr_rcv_term_cd     		".trim(), length));
			String[] cntr_de_term_cd       =  (JSPUtil.getParameter(request, "cntr_de_term_cd      		".trim(), length));
			String[] cntr_prt_flg          =  (JSPUtil.getParameter(request, "cntr_prt_flg         		".trim(), length));
			String[] cntr_vol_qty          =  (JSPUtil.getParameter(request, "cntr_vol_qty         		".trim(), length));
			String[] cntr_cyc_no           =  (JSPUtil.getParameter(request, "cntr_cyc_no          		".trim(), length));
			String[] cntr_expt_cd          =  (JSPUtil.getParameter(request, "cntr_expt_cd         		".trim(), length));
			String[] hngr_flg              =  (JSPUtil.getParameter(request, "hngr_flg             		".trim(), length));
			String[] cntr_full_cyc_nm      =  (JSPUtil.getParameter(request, "cntr_full_cyc_nm     		".trim(), length));
			String[] cntr_hlg_flg          =  (JSPUtil.getParameter(request, "cntr_hlg_flg         		".trim(), length));
			String[] org_fm_loc_cd         =  (JSPUtil.getParameter(request, "org_fm_loc_cd        		".trim(), length));
			String[] org_to_yd_cd          =  (JSPUtil.getParameter(request, "org_to_yd_cd         		".trim(), length));
			String[] dest_fm_loc_cd        =  (JSPUtil.getParameter(request, "dest_fm_loc_cd       		".trim(), length));
			String[] dest_to_yd_cd         =  (JSPUtil.getParameter(request, "dest_to_yd_cd        		".trim(), length));
			String[] spcl_cgo_cntr_dg_flg  =  (JSPUtil.getParameter(request, "spcl_cgo_cntr_dg_flg 		".trim(), length));
			String[] spcl_cgo_cntr_bb_flg  =  (JSPUtil.getParameter(request, "spcl_cgo_cntr_bb_flg 		".trim(), length));
			String[] spcl_cgo_cntr_awk_flg =  (JSPUtil.getParameter(request, "spcl_cgo_cntr_awk_flg		".trim(), length));
			String[] spcl_cgo_cntr_rf_flg  =  (JSPUtil.getParameter(request, "spcl_cgo_cntr_rf_flg 		".trim(), length));
			String[] spcl_cgo_cntr_rd_flg  =  (JSPUtil.getParameter(request, "spcl_cgo_cntr_rd_flg 		".trim(), length));
			String[] soc_flg               =  (JSPUtil.getParameter(request, "soc_flg              		".trim(), length));
			String[] bkg_cntr_rmk          =  (JSPUtil.getParameter(request, "bkg_cntr_rmk         		".trim(), length));
			String[] cntr_tro_ob_seq       =  (JSPUtil.getParameter(request, "cntr_tro_ob_seq      		".trim(), length));
			String[] cntr_tro_ib_seq       =  (JSPUtil.getParameter(request, "cntr_tro_ib_seq      		".trim(), length));
			String[] cntr_tro_ob_sub_seq   =  (JSPUtil.getParameter(request, "cntr_tro_ob_sub_seq  		".trim(), length));
			String[] cntr_tro_ib_sub_seq   =  (JSPUtil.getParameter(request, "cntr_tro_ib_sub_seq  		".trim(), length));
			String[] cntr_cfm_flg          =  (JSPUtil.getParameter(request, "cntr_cfm_flg         		".trim(), length));
			String[] cntr_mf_cfm_flg       =  (JSPUtil.getParameter(request, "cntr_mf_cfm_flg      		".trim(), length));
			String[] cntr_cdr_dt           =  (JSPUtil.getParameter(request, "cntr_cdr_dt          		".trim(), length));
			String[] cntr_cdr_yd_cd        =  (JSPUtil.getParameter(request, "cntr_cdr_yd_cd       		".trim(), length));
			String[] cntr_sub_flg          =  (JSPUtil.getParameter(request, "cntr_sub_flg         		".trim(), length));
			String[] subst_cntr_tpsz_cd    =  (JSPUtil.getParameter(request, "subst_cntr_tpsz_cd   		".trim(), length));
			String[] org_yd_cd             =  (JSPUtil.getParameter(request, "org_yd_cd            		".trim(), length));
			String[] dest_yd_cd            =  (JSPUtil.getParameter(request, "dest_yd_cd           		".trim(), length));
			String[] cre_dt                =  (JSPUtil.getParameter(request, "cre_dt               		".trim(), length));
			String[] cnmv_flg              =  (JSPUtil.getParameter(request, "cnmv_flg             		".trim(), length));
			String[] do_no                 =  (JSPUtil.getParameter(request, "do_no                		".trim(), length));
			String[] do_no_split           =  (JSPUtil.getParameter(request, "do_no_split          		".trim(), length));
			String[] cntr_rmk              =  (JSPUtil.getParameter(request, "cntr_rmk             		".trim(), length));
			String[] cntr_rmk_bl_flg       =  (JSPUtil.getParameter(request, "cntr_rmk_bl_flg      		".trim(), length));
			String[] cntr_dp_seq           =  (JSPUtil.getParameter(request, "cntr_dp_seq          		".trim(), length));
			String[] nis_evnt_dt           =  (JSPUtil.getParameter(request, "nis_evnt_dt          		".trim(), length));
			String[] cntr_add_mv_cd        =  (JSPUtil.getParameter(request, "cntr_add_mv_cd       		".trim(), length));
			String[] so_end_flg            =  (JSPUtil.getParameter(request, "so_end_flg           		".trim(), length));
			String[] po_no                 =  (JSPUtil.getParameter(request, "po_no                		".trim(), length));
			String[] bkg_cntr_cre_dt       =  (JSPUtil.getParameter(request, "bkg_cntr_cre_dt      		".trim(), length));
			String[] ob_cy_gen_dt          =  (JSPUtil.getParameter(request, "ob_cy_gen_dt         		".trim(), length));
			String[] ob_cy_gen_tp_cd       =  (JSPUtil.getParameter(request, "ob_cy_gen_tp_cd      		".trim(), length));
			String[] cntr_tax_expt_cd      =  (JSPUtil.getParameter(request, "cntr_tax_expt_cd     		".trim(), length));
			String[] eai_sts               =  (JSPUtil.getParameter(request, "eai_sts              		".trim(), length));
			String[] eai_dt                =  (JSPUtil.getParameter(request, "eai_dt               		".trim(), length));
			String[] eai_evnt_dt           =  (JSPUtil.getParameter(request, "eai_evnt_dt          		".trim(), length));
			
			String[] mst_lcl_cd            =  (JSPUtil.getParameter(request, "mst_lcl_cd          		".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new BKG_BKG_CNTR();
				model.setIbflag               		  (ibflag               	[i]);
				model.setPage_rows            		  (page_rows            	[i]);
				model.setBkg_no               		  (bkg_no               	[i]);
				model.setBkg_no_split         		  (bkg_no_split         	[i]);
				model.setCntr_no              		  (cntr_no              	[i]);
				model.setCntr_tpsz_cd         		  (cntr_tpsz_cd         	[i]);
				model.setCntr_seal_no         		  (cntr_seal_no         	[i]);
				model.setCnmv_seq             		  (cnmv_seq             	[i]);
				model.setCnmv_yr              		  (cnmv_yr              	[i]);
				model.setBkg_cntr_sts_cd      		  (bkg_cntr_sts_cd      	[i]);
				model.setPck_qty              		  (pck_qty              	[i]);
				model.setPck_cd               		  (pck_cd               	[i]);
				model.setCntr_wgt             		  (cntr_wgt             	[i]);
				model.setTtl_meas_wgt         		  (ttl_meas_wgt         	[i]);
				model.setCntr_wgt_tp_cd       		  (cntr_wgt_tp_cd       	[i]);
				model.setCntr_meas_tp_cd      		  (cntr_meas_tp_cd      	[i]);
				model.setCntr_rcv_term_cd     		  (cntr_rcv_term_cd     	[i]);
				model.setCntr_de_term_cd      		  (cntr_de_term_cd      	[i]);
				model.setCntr_prt_flg         		  (cntr_prt_flg         	[i]);
				model.setCntr_vol_qty         		  (cntr_vol_qty         	[i]);
				model.setCntr_cyc_no          		  (cntr_cyc_no          	[i]);
				model.setCntr_expt_cd         		  (cntr_expt_cd         	[i]);
				model.setHngr_flg             		  (hngr_flg             	[i]);
				model.setCntr_full_cyc_nm     		  (cntr_full_cyc_nm     	[i]);
				model.setCntr_hlg_flg         		  (cntr_hlg_flg         	[i]);
				model.setOrg_fm_loc_cd        		  (org_fm_loc_cd        	[i]);
				model.setOrg_to_yd_cd         		  (org_to_yd_cd         	[i]);
				model.setDest_fm_loc_cd       		  (dest_fm_loc_cd       	[i]);
				model.setDest_to_yd_cd        		  (dest_to_yd_cd        	[i]);
				model.setSpcl_cgo_cntr_dg_flg 		  (spcl_cgo_cntr_dg_flg 	[i]);
				model.setSpcl_cgo_cntr_bb_flg 		  (spcl_cgo_cntr_bb_flg 	[i]);
				model.setSpcl_cgo_cntr_awk_flg		  (spcl_cgo_cntr_awk_flg	[i]);
				model.setSpcl_cgo_cntr_rf_flg 		  (spcl_cgo_cntr_rf_flg 	[i]);
				model.setSpcl_cgo_cntr_rd_flg 		  (spcl_cgo_cntr_rd_flg 	[i]);
				model.setSoc_flg              		  (soc_flg              	[i]);
				model.setBkg_cntr_rmk         		  (bkg_cntr_rmk         	[i]);
				model.setCntr_tro_ob_seq      		  (cntr_tro_ob_seq      	[i]);
				model.setCntr_tro_ib_seq      		  (cntr_tro_ib_seq      	[i]);
				model.setCntr_tro_ob_sub_seq  		  (cntr_tro_ob_sub_seq  	[i]);
				model.setCntr_tro_ib_sub_seq  		  (cntr_tro_ib_sub_seq  	[i]);
				model.setCntr_cfm_flg         		  (cntr_cfm_flg         	[i]);
				model.setCntr_mf_cfm_flg      		  (cntr_mf_cfm_flg      	[i]);
				model.setCntr_cdr_dt          		  (cntr_cdr_dt          	[i]);
				model.setCntr_cdr_yd_cd       		  (cntr_cdr_yd_cd       	[i]);
				model.setCntr_sub_flg         		  (cntr_sub_flg         	[i]);
				model.setSubst_cntr_tpsz_cd   		  (subst_cntr_tpsz_cd   	[i]);
				model.setOrg_yd_cd            		  (org_yd_cd            	[i]);
				model.setDest_yd_cd           		  (dest_yd_cd           	[i]);
				model.setCre_dt               		  (cre_dt               	[i]);
				model.setCnmv_flg             		  (cnmv_flg             	[i]);
				model.setDo_no                		  (do_no                	[i]);
				model.setDo_no_split          		  (do_no_split          	[i]);
				model.setCntr_rmk             		  (cntr_rmk             	[i]);
				model.setCntr_rmk_bl_flg      		  (cntr_rmk_bl_flg      	[i]);
				model.setCntr_dp_seq          		  (cntr_dp_seq          	[i]);
				model.setNis_evnt_dt          		  (nis_evnt_dt          	[i]);
				model.setCntr_add_mv_cd       		  (cntr_add_mv_cd       	[i]);
				model.setSo_end_flg           		  (so_end_flg           	[i]);
				model.setPo_no                		  (po_no                	[i]);
				model.setBkg_cntr_cre_dt      		  (bkg_cntr_cre_dt      	[i]);
				model.setOb_cy_gen_dt         		  (ob_cy_gen_dt         	[i]);
				model.setOb_cy_gen_tp_cd      		  (ob_cy_gen_tp_cd      	[i]);
				model.setCntr_tax_expt_cd     		  (cntr_tax_expt_cd     	[i]);
				model.setEai_sts              		  (eai_sts              	[i]);
				model.setEai_dt               		  (eai_dt               	[i]);
				model.setEai_evnt_dt          		  (eai_evnt_dt          	[i]);
				
				model.setMst_lcl_cd          		  (mst_lcl_cd          		[i]);
				
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		BKG_BKG_CNTR model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag                =  (JSPUtil.getParameter(request, prefix + "ibflag               		".trim(), length));
			String[] page_rows             =  (JSPUtil.getParameter(request, prefix + "page_rows            		".trim(), length));
			String[] bkg_no                =  (JSPUtil.getParameter(request, prefix + "bkg_no               		".trim(), length));
			String[] bkg_no_split          =  (JSPUtil.getParameter(request, prefix + "bkg_no_split         		".trim(), length));
			String[] cntr_no               =  (JSPUtil.getParameter(request, prefix + "cntr_no              		".trim(), length));
			String[] cntr_tpsz_cd          =  (JSPUtil.getParameter(request, prefix + "cntr_tpsz_cd         		".trim(), length));
			String[] cntr_seal_no          =  (JSPUtil.getParameter(request, prefix + "cntr_seal_no         		".trim(), length));
			String[] cnmv_seq              =  (JSPUtil.getParameter(request, prefix + "cnmv_seq             		".trim(), length));
			String[] cnmv_yr               =  (JSPUtil.getParameter(request, prefix + "cnmv_yr              		".trim(), length));
			String[] bkg_cntr_sts_cd       =  (JSPUtil.getParameter(request, prefix + "bkg_cntr_sts_cd      		".trim(), length));
			String[] pck_qty               =  (JSPUtil.getParameter(request, prefix + "pck_qty              		".trim(), length));
			String[] pck_cd                =  (JSPUtil.getParameter(request, prefix + "pck_cd               		".trim(), length));
			String[] cntr_wgt              =  (JSPUtil.getParameter(request, prefix + "cntr_wgt             		".trim(), length));
			String[] ttl_meas_wgt          =  (JSPUtil.getParameter(request, prefix + "ttl_meas_wgt         		".trim(), length));
			String[] cntr_wgt_tp_cd        =  (JSPUtil.getParameter(request, prefix + "cntr_wgt_tp_cd       		".trim(), length));
			String[] cntr_meas_tp_cd       =  (JSPUtil.getParameter(request, prefix + "cntr_meas_tp_cd      		".trim(), length));
			String[] cntr_rcv_term_cd      =  (JSPUtil.getParameter(request, prefix + "cntr_rcv_term_cd     		".trim(), length));
			String[] cntr_de_term_cd       =  (JSPUtil.getParameter(request, prefix + "cntr_de_term_cd      		".trim(), length));
			String[] cntr_prt_flg          =  (JSPUtil.getParameter(request, prefix + "cntr_prt_flg         		".trim(), length));
			String[] cntr_vol_qty          =  (JSPUtil.getParameter(request, prefix + "cntr_vol_qty         		".trim(), length));
			String[] cntr_cyc_no           =  (JSPUtil.getParameter(request, prefix + "cntr_cyc_no          		".trim(), length));
			String[] cntr_expt_cd          =  (JSPUtil.getParameter(request, prefix + "cntr_expt_cd         		".trim(), length));
			String[] hngr_flg              =  (JSPUtil.getParameter(request, prefix + "hngr_flg             		".trim(), length));
			String[] cntr_full_cyc_nm      =  (JSPUtil.getParameter(request, prefix + "cntr_full_cyc_nm     		".trim(), length));
			String[] cntr_hlg_flg          =  (JSPUtil.getParameter(request, prefix + "cntr_hlg_flg         		".trim(), length));
			String[] org_fm_loc_cd         =  (JSPUtil.getParameter(request, prefix + "org_fm_loc_cd        		".trim(), length));
			String[] org_to_yd_cd          =  (JSPUtil.getParameter(request, prefix + "org_to_yd_cd         		".trim(), length));
			String[] dest_fm_loc_cd        =  (JSPUtil.getParameter(request, prefix + "dest_fm_loc_cd       		".trim(), length));
			String[] dest_to_yd_cd         =  (JSPUtil.getParameter(request, prefix + "dest_to_yd_cd        		".trim(), length));
			String[] spcl_cgo_cntr_dg_flg  =  (JSPUtil.getParameter(request, prefix + "spcl_cgo_cntr_dg_flg 		".trim(), length));
			String[] spcl_cgo_cntr_bb_flg  =  (JSPUtil.getParameter(request, prefix + "spcl_cgo_cntr_bb_flg 		".trim(), length));
			String[] spcl_cgo_cntr_awk_flg =  (JSPUtil.getParameter(request, prefix + "spcl_cgo_cntr_awk_flg		".trim(), length));
			String[] spcl_cgo_cntr_rf_flg  =  (JSPUtil.getParameter(request, prefix + "spcl_cgo_cntr_rf_flg 		".trim(), length));
			String[] spcl_cgo_cntr_rd_flg  =  (JSPUtil.getParameter(request, prefix + "spcl_cgo_cntr_rd_flg 		".trim(), length));
			String[] soc_flg               =  (JSPUtil.getParameter(request, prefix + "soc_flg              		".trim(), length));
			String[] bkg_cntr_rmk          =  (JSPUtil.getParameter(request, prefix + "bkg_cntr_rmk         		".trim(), length));
			String[] cntr_tro_ob_seq       =  (JSPUtil.getParameter(request, prefix + "cntr_tro_ob_seq      		".trim(), length));
			String[] cntr_tro_ib_seq       =  (JSPUtil.getParameter(request, prefix + "cntr_tro_ib_seq      		".trim(), length));
			String[] cntr_tro_ob_sub_seq   =  (JSPUtil.getParameter(request, prefix + "cntr_tro_ob_sub_seq  		".trim(), length));
			String[] cntr_tro_ib_sub_seq   =  (JSPUtil.getParameter(request, prefix + "cntr_tro_ib_sub_seq  		".trim(), length));
			String[] cntr_cfm_flg          =  (JSPUtil.getParameter(request, prefix + "cntr_cfm_flg         		".trim(), length));
			String[] cntr_mf_cfm_flg       =  (JSPUtil.getParameter(request, prefix + "cntr_mf_cfm_flg      		".trim(), length));
			String[] cntr_cdr_dt           =  (JSPUtil.getParameter(request, prefix + "cntr_cdr_dt          		".trim(), length));
			String[] cntr_cdr_yd_cd        =  (JSPUtil.getParameter(request, prefix + "cntr_cdr_yd_cd       		".trim(), length));
			String[] cntr_sub_flg          =  (JSPUtil.getParameter(request, prefix + "cntr_sub_flg         		".trim(), length));
			String[] subst_cntr_tpsz_cd    =  (JSPUtil.getParameter(request, prefix + "subst_cntr_tpsz_cd   		".trim(), length));
			String[] org_yd_cd             =  (JSPUtil.getParameter(request, prefix + "org_yd_cd            		".trim(), length));
			String[] dest_yd_cd            =  (JSPUtil.getParameter(request, prefix + "dest_yd_cd           		".trim(), length));
			String[] cre_dt                =  (JSPUtil.getParameter(request, prefix + "cre_dt               		".trim(), length));
			String[] cnmv_flg              =  (JSPUtil.getParameter(request, prefix + "cnmv_flg             		".trim(), length));
			String[] do_no                 =  (JSPUtil.getParameter(request, prefix + "do_no                		".trim(), length));
			String[] do_no_split           =  (JSPUtil.getParameter(request, prefix + "do_no_split          		".trim(), length));
			String[] cntr_rmk              =  (JSPUtil.getParameter(request, prefix + "cntr_rmk             		".trim(), length));
			String[] cntr_rmk_bl_flg       =  (JSPUtil.getParameter(request, prefix + "cntr_rmk_bl_flg      		".trim(), length));
			String[] cntr_dp_seq           =  (JSPUtil.getParameter(request, prefix + "cntr_dp_seq          		".trim(), length));
			String[] nis_evnt_dt           =  (JSPUtil.getParameter(request, prefix + "nis_evnt_dt          		".trim(), length));
			String[] cntr_add_mv_cd        =  (JSPUtil.getParameter(request, prefix + "cntr_add_mv_cd       		".trim(), length));
			String[] so_end_flg            =  (JSPUtil.getParameter(request, prefix + "so_end_flg           		".trim(), length));
			String[] po_no                 =  (JSPUtil.getParameter(request, prefix + "po_no                		".trim(), length));
			String[] bkg_cntr_cre_dt       =  (JSPUtil.getParameter(request, prefix + "bkg_cntr_cre_dt      		".trim(), length));
			String[] ob_cy_gen_dt          =  (JSPUtil.getParameter(request, prefix + "ob_cy_gen_dt         		".trim(), length));
			String[] ob_cy_gen_tp_cd       =  (JSPUtil.getParameter(request, prefix + "ob_cy_gen_tp_cd      		".trim(), length));
			String[] cntr_tax_expt_cd      =  (JSPUtil.getParameter(request, prefix + "cntr_tax_expt_cd     		".trim(), length));
			String[] eai_sts               =  (JSPUtil.getParameter(request, prefix + "eai_sts              		".trim(), length));
			String[] eai_dt                =  (JSPUtil.getParameter(request, prefix + "eai_dt               		".trim(), length));
			String[] eai_evnt_dt           =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt          		".trim(), length));
			
			String[] mst_lcl_cd            =  (JSPUtil.getParameter(request, prefix + "mst_lcl_cd          			".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new BKG_BKG_CNTR();
				model.setIbflag               		  ( ibflag               	[i]);
				model.setPage_rows            		  ( page_rows            	[i]);
				model.setBkg_no               		  ( bkg_no               	[i]);
				model.setBkg_no_split         		  ( bkg_no_split         	[i]);
				model.setCntr_no              		  ( cntr_no              	[i]);
				model.setCntr_tpsz_cd         		  ( cntr_tpsz_cd         	[i]);
				model.setCntr_seal_no         		  ( cntr_seal_no         	[i]);
				model.setCnmv_seq             		  ( cnmv_seq             	[i]);
				model.setCnmv_yr              		  ( cnmv_yr              	[i]);
				model.setBkg_cntr_sts_cd      		  ( bkg_cntr_sts_cd      	[i]);
				model.setPck_qty              		  ( pck_qty              	[i]);
				model.setPck_cd               		  ( pck_cd               	[i]);
				model.setCntr_wgt             		  ( cntr_wgt             	[i]);
				model.setTtl_meas_wgt         		  ( ttl_meas_wgt         	[i]);
				model.setCntr_wgt_tp_cd       		  ( cntr_wgt_tp_cd       	[i]);
				model.setCntr_meas_tp_cd      		  ( cntr_meas_tp_cd      	[i]);
				model.setCntr_rcv_term_cd     		  ( cntr_rcv_term_cd     	[i]);
				model.setCntr_de_term_cd      		  ( cntr_de_term_cd      	[i]);
				model.setCntr_prt_flg         		  ( cntr_prt_flg         	[i]);
				model.setCntr_vol_qty         		  ( cntr_vol_qty         	[i]);
				model.setCntr_cyc_no          		  ( cntr_cyc_no          	[i]);
				model.setCntr_expt_cd         		  ( cntr_expt_cd         	[i]);
				model.setHngr_flg             		  ( hngr_flg             	[i]);
				model.setCntr_full_cyc_nm     		  ( cntr_full_cyc_nm     	[i]);
				model.setCntr_hlg_flg         		  ( cntr_hlg_flg         	[i]);
				model.setOrg_fm_loc_cd        		  ( org_fm_loc_cd        	[i]);
				model.setOrg_to_yd_cd         		  ( org_to_yd_cd         	[i]);
				model.setDest_fm_loc_cd       		  ( dest_fm_loc_cd       	[i]);
				model.setDest_to_yd_cd        		  ( dest_to_yd_cd        	[i]);
				model.setSpcl_cgo_cntr_dg_flg 		  ( spcl_cgo_cntr_dg_flg 	[i]);
				model.setSpcl_cgo_cntr_bb_flg 		  ( spcl_cgo_cntr_bb_flg 	[i]);
				model.setSpcl_cgo_cntr_awk_flg		  ( spcl_cgo_cntr_awk_flg	[i]);
				model.setSpcl_cgo_cntr_rf_flg 		  ( spcl_cgo_cntr_rf_flg 	[i]);
				model.setSpcl_cgo_cntr_rd_flg 		  ( spcl_cgo_cntr_rd_flg 	[i]);
				model.setSoc_flg              		  ( soc_flg              	[i]);
				model.setBkg_cntr_rmk         		  ( bkg_cntr_rmk         	[i]);
				model.setCntr_tro_ob_seq      		  ( cntr_tro_ob_seq      	[i]);
				model.setCntr_tro_ib_seq      		  ( cntr_tro_ib_seq      	[i]);
				model.setCntr_tro_ob_sub_seq  		  ( cntr_tro_ob_sub_seq  	[i]);
				model.setCntr_tro_ib_sub_seq  		  ( cntr_tro_ib_sub_seq  	[i]);
				model.setCntr_cfm_flg         		  ( cntr_cfm_flg         	[i]);
				model.setCntr_mf_cfm_flg      		  ( cntr_mf_cfm_flg      	[i]);
				model.setCntr_cdr_dt          		  ( cntr_cdr_dt          	[i]);
				model.setCntr_cdr_yd_cd       		  ( cntr_cdr_yd_cd       	[i]);
				model.setCntr_sub_flg         		  ( cntr_sub_flg         	[i]);
				model.setSubst_cntr_tpsz_cd   		  ( subst_cntr_tpsz_cd   	[i]);
				model.setOrg_yd_cd            		  ( org_yd_cd            	[i]);
				model.setDest_yd_cd           		  ( dest_yd_cd           	[i]);
				model.setCre_dt               		  ( cre_dt               	[i]);
				model.setCnmv_flg             		  ( cnmv_flg             	[i]);
				model.setDo_no                		  ( do_no                	[i]);
				model.setDo_no_split          		  ( do_no_split          	[i]);
				model.setCntr_rmk             		  ( cntr_rmk             	[i]);
				model.setCntr_rmk_bl_flg      		  ( cntr_rmk_bl_flg      	[i]);
				model.setCntr_dp_seq          		  ( cntr_dp_seq          	[i]);
				model.setNis_evnt_dt          		  ( nis_evnt_dt          	[i]);
				model.setCntr_add_mv_cd       		  ( cntr_add_mv_cd       	[i]);
				model.setSo_end_flg           		  ( so_end_flg           	[i]);
				model.setPo_no                		  ( po_no                	[i]);
				model.setBkg_cntr_cre_dt      		  ( bkg_cntr_cre_dt      	[i]);
				model.setOb_cy_gen_dt         		  ( ob_cy_gen_dt         	[i]);
				model.setOb_cy_gen_tp_cd      		  ( ob_cy_gen_tp_cd      	[i]);
				model.setCntr_tax_expt_cd     		  ( cntr_tax_expt_cd     	[i]);
				model.setEai_sts              		  ( eai_sts              	[i]);
				model.setEai_dt               		  ( eai_dt               	[i]);
				model.setEai_evnt_dt          		  ( eai_evnt_dt          	[i]);
				model.setMst_lcl_cd          		  ( mst_lcl_cd          	[i]);
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
