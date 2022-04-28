/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : VSK_VSL_PORT_SKD.java
*@FileTitle : 사용자 관리5
*Open Issues :
*Change history :
*@LastModifyDate : 2007-01-08
*@LastModifier : Kildong_hong6
*@LastVersion : 1.0
* 2007-01-08 Kildong_hong6
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
public final class VSK_VSL_PORT_SKD implements java.io.Serializable {

	private String                 ibflag                 = "";
	private String                 page_rows              = "";
	private String                 vsl_cd                 = "";
	private String                 skd_voy_no             = "";
	private String                 skd_dir_cd             = "";
	private String                 vps_port_cd            = "";
	private String                 clpt_ind_seq           = "";
	private String                 clpt_seq               = "";
	private String                 vps_eta_dt             = "";
	private String                 vps_etb_dt             = "";
	private String                 vps_etd_dt             = "";
	private String                 vps_cct_dt             = "";
	private String                 vps_bct_dt             = "";
	private String                 skd_sts_cd             = "";
	private String                 cng_sts_cd             = "";
	private String                 nxt_port_cd            = "";
	private String                 nxt_dir_cd             = "";
	private String                 nxt_clpt_ind_seq       = "";
	private String                 turn_port_ind_cd       = "";
	private String                 turn_skd_voy_no        = "";
	private String                 turn_skd_dir_cd        = "";
	private String                 turn_clpt_ind_seq      = "";
	private String                 bl_voy_dir_cd          = "";
	private String                 crr_dir_cd             = "";
	private String                 crr_voy_no             = "";
	private String                 tml_abbr_nm            = "";
	private String                 vps_rev_mk_flg         = "";
	private String                 cng_port_cd            = "";
	private String                 cng_clpt_ind_seq       = "";
	private String                 upd_dt                 = "";
	private String                 upd_usr_id             = "";
	private String                 vps_rmk                = "";
	private String                 phs_io_cd              = "";
	private String                 phs_io_rmk             = "";
	private String                 dck_in_dt              = "";
	private String                 dck_out_dt             = "";
	private String                 dck_nm                 = "";
	private String                 dck_tp_cd              = "";
	private String                 dck_rmk                = "";
	private String                 nxt_lane_cd            = "";
	private String                 vps_xch_rt             = "";
	private String                 act_arr_dt             = "";
	private String                 act_brth_dt            = "";
	private String                 act_dep_dt             = "";
	private String                 slan_cd                = "";
	private String                 bdr_ind_flg            = "";
	private String                 cbf_ind_flg            = "";
	private String                 hcos_vsl_cd            = "";
	private String                 cgo_vol_qty            = "";
	private String                 skd_brth_no            = "";
	private String                 finc_dir_cd            = "";
	private String                 cntr_blk_tp_cd         = "";
	private String                 vps_act_dt             = "";
	private String                 bkg_vsl_cd             = "";
	private String                 tml_crr_no             = "";
	private String                 finc_aply_ind_flg      = "";
	private String                 skd_ownr_cd            = "";
	private String                 nis_evnt_dt            = "";
	private String                 ib_cgo_qty             = "";
	private String                 ob_cgo_qty             = "";
	private String                 ts_cgo_qty             = "";
	private String                 tml_voy_no             = "";
	private String                 crn_wrk_cmnc_dt        = "";
	private String                 ts_tml_cd              = "";
	private String                 ts_cfm_cd              = "";
	private String                 lst_ata_dt             = "";
	private String                 lst_atb_dt             = "";
	private String                 lst_atd_dt             = "";
	private String                 shp_call_no            = "";
	private String                 pier_knt               = "";
	private String                 yd_cd                  = "";
	private String                 shp_call_no_upd_usr_id = "";
	private String                 shp_call_no_upd_dt     = "";
	private String                 tml_vsl_cd             = "";
	private String                 ft_dt                  = "";
	private String                 edi_snd_knt            = "";
	private String                 pf_eta_dt              = "";
	private String                 pf_etb_dt              = "";
	private String                 pf_etd_dt              = "";
	private String                 alt_set_hr             = "";
	private String                 act_inp_flg            = "";
	private String                 wrk_pln_inp_flg        = "";
	private String                 ofc_inp_flg            = "";
	private String                 noon_rpt_inp_flg       = "";
	private String                 dep_rpt_inp_flg        = "";
	private String                 init_skd_inp_flg       = "";
	private String                 vsl_port_drft_wgt      = "";
	private String                 eai_evnt_dt            = "";
    private String				   vsl_dlay_rsn_cd	      = "";
    private String 		   		   vsl_dlay_rsn_desc      = "";
    private String				   vps_dly_loc			  = "";
    	
	public VSK_VSL_PORT_SKD(){}

	public VSK_VSL_PORT_SKD(
			String                 ibflag                ,
			String                 page_rows             ,
			String                 vsl_cd                ,
			String                 skd_voy_no            ,
			String                 skd_dir_cd            ,
			String                 vps_port_cd           ,
			String                 clpt_ind_seq          ,
			String                 clpt_seq              ,
			String                 vps_eta_dt            ,
			String                 vps_etb_dt            ,
			String                 vps_etd_dt            ,
			String                 vps_cct_dt            ,
			String                 vps_bct_dt            ,
			String                 skd_sts_cd            ,
			String                 cng_sts_cd            ,
			String                 nxt_port_cd           ,
			String                 nxt_dir_cd            ,
			String                 nxt_clpt_ind_seq      ,
			String                 turn_port_ind_cd      ,
			String                 turn_skd_voy_no       ,
			String                 turn_skd_dir_cd       ,
			String                 turn_clpt_ind_seq     ,
			String                 bl_voy_dir_cd         ,
			String                 crr_dir_cd            ,
			String                 crr_voy_no            ,
			String                 tml_abbr_nm           ,
			String                 vps_rev_mk_flg        ,
			String                 cng_port_cd           ,
			String                 cng_clpt_ind_seq      ,
			String                 upd_dt                ,
			String                 upd_usr_id            ,
			String                 vps_rmk               ,
			String                 phs_io_cd             ,
			String                 phs_io_rmk            ,
			String                 dck_in_dt             ,
			String                 dck_out_dt            ,
			String                 dck_nm                ,
			String                 dck_tp_cd             ,
			String                 dck_rmk               ,
			String                 nxt_lane_cd           ,
			String                 vps_xch_rt            ,
			String                 act_arr_dt            ,
			String                 act_brth_dt           ,
			String                 act_dep_dt            ,
			String                 slan_cd               ,
			String                 bdr_ind_flg           ,
			String                 cbf_ind_flg           ,
			String                 hcos_vsl_cd           ,
			String                 cgo_vol_qty           ,
			String                 skd_brth_no           ,
			String                 finc_dir_cd           ,
			String                 cntr_blk_tp_cd        ,
			String                 vps_act_dt            ,
			String                 bkg_vsl_cd            ,
			String                 tml_crr_no            ,
			String                 finc_aply_ind_flg     ,
			String                 skd_ownr_cd           ,
			String                 nis_evnt_dt           ,
			String                 ib_cgo_qty            ,
			String                 ob_cgo_qty            ,
			String                 ts_cgo_qty            ,
			String                 tml_voy_no            ,
			String                 crn_wrk_cmnc_dt       ,
			String                 ts_tml_cd             ,
			String                 ts_cfm_cd             ,
			String                 lst_ata_dt            ,
			String                 lst_atb_dt            ,
			String                 lst_atd_dt            ,
			String                 shp_call_no           ,
			String                 pier_knt              ,
			String                 yd_cd                 ,
			String                 shp_call_no_upd_usr_id,
			String                 shp_call_no_upd_dt    ,
			String                 tml_vsl_cd            ,
			String                 ft_dt                 ,
			String                 edi_snd_knt           ,
			String                 pf_eta_dt             ,
			String                 pf_etb_dt             ,
			String                 pf_etd_dt             ,
			String                 alt_set_hr            ,
			String                 act_inp_flg           ,
			String                 wrk_pln_inp_flg       ,
			String                 ofc_inp_flg           ,
			String                 noon_rpt_inp_flg      ,
			String                 dep_rpt_inp_flg       ,
			String                 init_skd_inp_flg      ,
			String                 vsl_port_drft_wgt     ,
			String                 eai_evnt_dt           ,
		    String 		   		   vsl_dlay_rsn_cd	     ,
		    String 		   		   vsl_dlay_rsn_desc     ,
		    String 		   		   vps_dly_loc              ){
		this.ibflag                 = ibflag                ;
		this.page_rows              = page_rows             ;
		this.vsl_cd                 = vsl_cd                ;
		this.skd_voy_no             = skd_voy_no            ;
		this.skd_dir_cd             = skd_dir_cd            ;
		this.vps_port_cd            = vps_port_cd           ;
		this.clpt_ind_seq           = clpt_ind_seq          ;
		this.clpt_seq               = clpt_seq              ;
		this.vps_eta_dt             = vps_eta_dt            ;
		this.vps_etb_dt             = vps_etb_dt            ;
		this.vps_etd_dt             = vps_etd_dt            ;
		this.vps_cct_dt             = vps_cct_dt            ;
		this.vps_bct_dt             = vps_bct_dt            ;
		this.skd_sts_cd             = skd_sts_cd            ;
		this.cng_sts_cd             = cng_sts_cd            ;
		this.nxt_port_cd            = nxt_port_cd           ;
		this.nxt_dir_cd             = nxt_dir_cd            ;
		this.nxt_clpt_ind_seq       = nxt_clpt_ind_seq      ;
		this.turn_port_ind_cd       = turn_port_ind_cd      ;
		this.turn_skd_voy_no        = turn_skd_voy_no       ;
		this.turn_skd_dir_cd        = turn_skd_dir_cd       ;
		this.turn_clpt_ind_seq      = turn_clpt_ind_seq     ;
		this.bl_voy_dir_cd          = bl_voy_dir_cd         ;
		this.crr_dir_cd             = crr_dir_cd            ;
		this.crr_voy_no             = crr_voy_no            ;
		this.tml_abbr_nm            = tml_abbr_nm           ;
		this.vps_rev_mk_flg         = vps_rev_mk_flg        ;
		this.cng_port_cd            = cng_port_cd           ;
		this.cng_clpt_ind_seq       = cng_clpt_ind_seq      ;
		this.upd_dt                 = upd_dt                ;
		this.upd_usr_id             = upd_usr_id            ;
		this.vps_rmk                = vps_rmk               ;
		this.phs_io_cd              = phs_io_cd             ;
		this.phs_io_rmk             = phs_io_rmk            ;
		this.dck_in_dt              = dck_in_dt             ;
		this.dck_out_dt             = dck_out_dt            ;
		this.dck_nm                 = dck_nm                ;
		this.dck_tp_cd              = dck_tp_cd             ;
		this.dck_rmk                = dck_rmk               ;
		this.nxt_lane_cd            = nxt_lane_cd           ;
		this.vps_xch_rt             = vps_xch_rt            ;
		this.act_arr_dt             = act_arr_dt            ;
		this.act_brth_dt            = act_brth_dt           ;
		this.act_dep_dt             = act_dep_dt            ;
		this.slan_cd                = slan_cd               ;
		this.bdr_ind_flg            = bdr_ind_flg           ;
		this.cbf_ind_flg            = cbf_ind_flg           ;
		this.hcos_vsl_cd            = hcos_vsl_cd           ;
		this.cgo_vol_qty            = cgo_vol_qty           ;
		this.skd_brth_no            = skd_brth_no           ;
		this.finc_dir_cd            = finc_dir_cd           ;
		this.cntr_blk_tp_cd         = cntr_blk_tp_cd        ;
		this.vps_act_dt             = vps_act_dt            ;
		this.bkg_vsl_cd             = bkg_vsl_cd            ;
		this.tml_crr_no             = tml_crr_no            ;
		this.finc_aply_ind_flg      = finc_aply_ind_flg     ;
		this.skd_ownr_cd            = skd_ownr_cd           ;
		this.nis_evnt_dt            = nis_evnt_dt           ;
		this.ib_cgo_qty             = ib_cgo_qty            ;
		this.ob_cgo_qty             = ob_cgo_qty            ;
		this.ts_cgo_qty             = ts_cgo_qty            ;
		this.tml_voy_no             = tml_voy_no            ;
		this.crn_wrk_cmnc_dt        = crn_wrk_cmnc_dt       ;
		this.ts_tml_cd              = ts_tml_cd             ;
		this.ts_cfm_cd              = ts_cfm_cd             ;
		this.lst_ata_dt             = lst_ata_dt            ;
		this.lst_atb_dt             = lst_atb_dt            ;
		this.lst_atd_dt             = lst_atd_dt            ;
		this.shp_call_no            = shp_call_no           ;
		this.pier_knt               = pier_knt              ;
		this.yd_cd                  = yd_cd                 ;
		this.shp_call_no_upd_usr_id = shp_call_no_upd_usr_id;
		this.shp_call_no_upd_dt     = shp_call_no_upd_dt    ;
		this.tml_vsl_cd             = tml_vsl_cd            ;
		this.ft_dt                  = ft_dt                 ;
		this.edi_snd_knt            = edi_snd_knt           ;
		this.pf_eta_dt              = pf_eta_dt             ;
		this.pf_etb_dt              = pf_etb_dt             ;
		this.pf_etd_dt              = pf_etd_dt             ;
		this.alt_set_hr             = alt_set_hr            ;
		this.act_inp_flg            = act_inp_flg           ;
		this.wrk_pln_inp_flg        = wrk_pln_inp_flg       ;
		this.ofc_inp_flg            = ofc_inp_flg           ;
		this.noon_rpt_inp_flg       = noon_rpt_inp_flg      ;
		this.dep_rpt_inp_flg        = dep_rpt_inp_flg       ;
		this.init_skd_inp_flg       = init_skd_inp_flg      ;
		this.vsl_port_drft_wgt      = vsl_port_drft_wgt     ;
		this.eai_evnt_dt            = eai_evnt_dt           ;
        this.vsl_dlay_rsn_cd   		= vsl_dlay_rsn_cd  		;
        this.vsl_dlay_rsn_desc 		= vsl_dlay_rsn_desc		;
        this.vps_dly_loc			= vps_dly_loc			;
	}

	// getter method is proceeding ..
	public String                 getIbflag                (){	return ibflag                	;	}
	public String                 getPage_rows             (){	return page_rows             	;	}
	public String                 getVsl_cd                (){	return vsl_cd                	;	}
	public String                 getSkd_voy_no            (){	return skd_voy_no            	;	}
	public String                 getSkd_dir_cd            (){	return skd_dir_cd            	;	}
	public String                 getVps_port_cd           (){	return vps_port_cd           	;	}
	public String                 getClpt_ind_seq          (){	return clpt_ind_seq          	;	}
	public String                 getClpt_seq              (){	return clpt_seq              	;	}
	public String                 getVps_eta_dt            (){	return vps_eta_dt            	;	}
	public String                 getVps_etb_dt            (){	return vps_etb_dt            	;	}
	public String                 getVps_etd_dt            (){	return vps_etd_dt            	;	}
	public String                 getVps_cct_dt            (){	return vps_cct_dt            	;	}
	public String                 getVps_bct_dt            (){	return vps_bct_dt            	;	}
	public String                 getSkd_sts_cd            (){	return skd_sts_cd            	;	}
	public String                 getCng_sts_cd            (){	return cng_sts_cd            	;	}
	public String                 getNxt_port_cd           (){	return nxt_port_cd           	;	}
	public String                 getNxt_dir_cd            (){	return nxt_dir_cd            	;	}
	public String                 getNxt_clpt_ind_seq      (){	return nxt_clpt_ind_seq      	;	}
	public String                 getTurn_port_ind_cd      (){	return turn_port_ind_cd      	;	}
	public String                 getTurn_skd_voy_no       (){	return turn_skd_voy_no       	;	}
	public String                 getTurn_skd_dir_cd       (){	return turn_skd_dir_cd       	;	}
	public String                 getTurn_clpt_ind_seq     (){	return turn_clpt_ind_seq     	;	}
	public String                 getBl_voy_dir_cd         (){	return bl_voy_dir_cd         	;	}
	public String                 getCrr_dir_cd            (){	return crr_dir_cd            	;	}
	public String                 getCrr_voy_no            (){	return crr_voy_no            	;	}
	public String                 getTml_abbr_nm           (){	return tml_abbr_nm           	;	}
	public String                 getVps_rev_mk_flg        (){	return vps_rev_mk_flg        	;	}
	public String                 getCng_port_cd           (){	return cng_port_cd           	;	}
	public String                 getCng_clpt_ind_seq      (){	return cng_clpt_ind_seq      	;	}
	public String                 getUpd_dt                (){	return upd_dt                	;	}
	public String                 getUpd_usr_id            (){	return upd_usr_id            	;	}
	public String                 getVps_rmk               (){	return vps_rmk               	;	}
	public String                 getPhs_io_cd             (){	return phs_io_cd             	;	}
	public String                 getPhs_io_rmk            (){	return phs_io_rmk            	;	}
	public String                 getDck_in_dt             (){	return dck_in_dt             	;	}
	public String                 getDck_out_dt            (){	return dck_out_dt            	;	}
	public String                 getDck_nm                (){	return dck_nm                	;	}
	public String                 getDck_tp_cd             (){	return dck_tp_cd             	;	}
	public String                 getDck_rmk               (){	return dck_rmk               	;	}
	public String                 getNxt_lane_cd           (){	return nxt_lane_cd           	;	}
	public String                 getVps_xch_rt            (){	return vps_xch_rt            	;	}
	public String                 getAct_arr_dt            (){	return act_arr_dt            	;	}
	public String                 getAct_brth_dt           (){	return act_brth_dt           	;	}
	public String                 getAct_dep_dt            (){	return act_dep_dt            	;	}
	public String                 getSlan_cd               (){	return slan_cd               	;	}
	public String                 getBdr_ind_flg           (){	return bdr_ind_flg           	;	}
	public String                 getCbf_ind_flg           (){	return cbf_ind_flg           	;	}
	public String                 getHcos_vsl_cd           (){	return hcos_vsl_cd           	;	}
	public String                 getCgo_vol_qty           (){	return cgo_vol_qty           	;	}
	public String                 getSkd_brth_no           (){	return skd_brth_no           	;	}
	public String                 getFinc_dir_cd           (){	return finc_dir_cd           	;	}
	public String                 getCntr_blk_tp_cd        (){	return cntr_blk_tp_cd        	;	}
	public String                 getVps_act_dt            (){	return vps_act_dt            	;	}
	public String                 getBkg_vsl_cd            (){	return bkg_vsl_cd            	;	}
	public String                 getTml_crr_no            (){	return tml_crr_no            	;	}
	public String                 getFinc_aply_ind_flg     (){	return finc_aply_ind_flg     	;	}
	public String                 getSkd_ownr_cd           (){	return skd_ownr_cd           	;	}
	public String                 getNis_evnt_dt           (){	return nis_evnt_dt           	;	}
	public String                 getIb_cgo_qty            (){	return ib_cgo_qty            	;	}
	public String                 getOb_cgo_qty            (){	return ob_cgo_qty            	;	}
	public String                 getTs_cgo_qty            (){	return ts_cgo_qty            	;	}
	public String                 getTml_voy_no            (){	return tml_voy_no            	;	}
	public String                 getCrn_wrk_cmnc_dt       (){	return crn_wrk_cmnc_dt       	;	}
	public String                 getTs_tml_cd             (){	return ts_tml_cd             	;	}
	public String                 getTs_cfm_cd             (){	return ts_cfm_cd             	;	}
	public String                 getLst_ata_dt            (){	return lst_ata_dt            	;	}
	public String                 getLst_atb_dt            (){	return lst_atb_dt            	;	}
	public String                 getLst_atd_dt            (){	return lst_atd_dt            	;	}
	public String                 getShp_call_no           (){	return shp_call_no           	;	}
	public String                 getPier_knt              (){	return pier_knt              	;	}
	public String                 getYd_cd                 (){	return yd_cd                 	;	}
	public String                 getShp_call_no_upd_usr_id(){	return shp_call_no_upd_usr_id	;	}
	public String                 getShp_call_no_upd_dt    (){	return shp_call_no_upd_dt    	;	}
	public String                 getTml_vsl_cd            (){	return tml_vsl_cd            	;	}
	public String                 getFt_dt                 (){	return ft_dt                 	;	}
	public String                 getEdi_snd_knt           (){	return edi_snd_knt           	;	}
	public String                 getPf_eta_dt             (){	return pf_eta_dt             	;	}
	public String                 getPf_etb_dt             (){	return pf_etb_dt             	;	}
	public String                 getPf_etd_dt             (){	return pf_etd_dt             	;	}
	public String                 getAlt_set_hr            (){	return alt_set_hr            	;	}
	public String                 getAct_inp_flg           (){	return act_inp_flg           	;	}
	public String                 getWrk_pln_inp_flg       (){	return wrk_pln_inp_flg       	;	}
	public String                 getOfc_inp_flg           (){	return ofc_inp_flg           	;	}
	public String                 getNoon_rpt_inp_flg      (){	return noon_rpt_inp_flg      	;	}
	public String                 getDep_rpt_inp_flg       (){	return dep_rpt_inp_flg       	;	}
	public String                 getInit_skd_inp_flg      (){	return init_skd_inp_flg      	;	}
	public String                 getVsl_port_drft_wgt     (){	return vsl_port_drft_wgt     	;	}
	public String                 getEai_evnt_dt           (){	return eai_evnt_dt           	;	}
	public String            	  getVsl_dlay_rsn_cd       (){  return vsl_dlay_rsn_cd          ;   }
	public String                 getVsl_dlay_rsn_desc     (){  return vsl_dlay_rsn_desc        ;   }
	public String				  getVps_dly_loc		   (){  return vps_dly_loc              ;   }

	// setter method is proceeding ..
	public void setIbflag                ( String                 ibflag                 ){	this.ibflag                 = ibflag                	;	}
	public void setPage_rows             ( String                 page_rows              ){	this.page_rows              = page_rows             	;	}
	public void setVsl_cd                ( String                 vsl_cd                 ){	this.vsl_cd                 = vsl_cd                	;	}
	public void setSkd_voy_no            ( String                 skd_voy_no             ){	this.skd_voy_no             = skd_voy_no            	;	}
	public void setSkd_dir_cd            ( String                 skd_dir_cd             ){	this.skd_dir_cd             = skd_dir_cd            	;	}
	public void setVps_port_cd           ( String                 vps_port_cd            ){	this.vps_port_cd            = vps_port_cd           	;	}
	public void setClpt_ind_seq          ( String                 clpt_ind_seq           ){	this.clpt_ind_seq           = clpt_ind_seq          	;	}
	public void setClpt_seq              ( String                 clpt_seq               ){	this.clpt_seq               = clpt_seq              	;	}
	public void setVps_eta_dt            ( String                 vps_eta_dt             ){	this.vps_eta_dt             = vps_eta_dt            	;	}
	public void setVps_etb_dt            ( String                 vps_etb_dt             ){	this.vps_etb_dt             = vps_etb_dt            	;	}
	public void setVps_etd_dt            ( String                 vps_etd_dt             ){	this.vps_etd_dt             = vps_etd_dt            	;	}
	public void setVps_cct_dt            ( String                 vps_cct_dt             ){	this.vps_cct_dt             = vps_cct_dt            	;	}
	public void setVps_bct_dt            ( String                 vps_bct_dt             ){	this.vps_bct_dt             = vps_bct_dt            	;	}
	public void setSkd_sts_cd            ( String                 skd_sts_cd             ){	this.skd_sts_cd             = skd_sts_cd            	;	}
	public void setCng_sts_cd            ( String                 cng_sts_cd             ){	this.cng_sts_cd             = cng_sts_cd            	;	}
	public void setNxt_port_cd           ( String                 nxt_port_cd            ){	this.nxt_port_cd            = nxt_port_cd           	;	}
	public void setNxt_dir_cd            ( String                 nxt_dir_cd             ){	this.nxt_dir_cd             = nxt_dir_cd            	;	}
	public void setNxt_clpt_ind_seq      ( String                 nxt_clpt_ind_seq       ){	this.nxt_clpt_ind_seq       = nxt_clpt_ind_seq      	;	}
	public void setTurn_port_ind_cd      ( String                 turn_port_ind_cd       ){	this.turn_port_ind_cd       = turn_port_ind_cd      	;	}
	public void setTurn_skd_voy_no       ( String                 turn_skd_voy_no        ){	this.turn_skd_voy_no        = turn_skd_voy_no       	;	}
	public void setTurn_skd_dir_cd       ( String                 turn_skd_dir_cd        ){	this.turn_skd_dir_cd        = turn_skd_dir_cd       	;	}
	public void setTurn_clpt_ind_seq     ( String                 turn_clpt_ind_seq      ){	this.turn_clpt_ind_seq      = turn_clpt_ind_seq     	;	}
	public void setBl_voy_dir_cd         ( String                 bl_voy_dir_cd          ){	this.bl_voy_dir_cd          = bl_voy_dir_cd         	;	}
	public void setCrr_dir_cd            ( String                 crr_dir_cd             ){	this.crr_dir_cd             = crr_dir_cd            	;	}
	public void setCrr_voy_no            ( String                 crr_voy_no             ){	this.crr_voy_no             = crr_voy_no            	;	}
	public void setTml_abbr_nm           ( String                 tml_abbr_nm            ){	this.tml_abbr_nm            = tml_abbr_nm           	;	}
	public void setVps_rev_mk_flg        ( String                 vps_rev_mk_flg         ){	this.vps_rev_mk_flg         = vps_rev_mk_flg        	;	}
	public void setCng_port_cd           ( String                 cng_port_cd            ){	this.cng_port_cd            = cng_port_cd           	;	}
	public void setCng_clpt_ind_seq      ( String                 cng_clpt_ind_seq       ){	this.cng_clpt_ind_seq       = cng_clpt_ind_seq      	;	}
	public void setUpd_dt                ( String                 upd_dt                 ){	this.upd_dt                 = upd_dt                	;	}
	public void setUpd_usr_id            ( String                 upd_usr_id             ){	this.upd_usr_id             = upd_usr_id            	;	}
	public void setVps_rmk               ( String                 vps_rmk                ){	this.vps_rmk                = vps_rmk               	;	}
	public void setPhs_io_cd             ( String                 phs_io_cd              ){	this.phs_io_cd              = phs_io_cd             	;	}
	public void setPhs_io_rmk            ( String                 phs_io_rmk             ){	this.phs_io_rmk             = phs_io_rmk            	;	}
	public void setDck_in_dt             ( String                 dck_in_dt              ){	this.dck_in_dt              = dck_in_dt             	;	}
	public void setDck_out_dt            ( String                 dck_out_dt             ){	this.dck_out_dt             = dck_out_dt            	;	}
	public void setDck_nm                ( String                 dck_nm                 ){	this.dck_nm                 = dck_nm                	;	}
	public void setDck_tp_cd             ( String                 dck_tp_cd              ){	this.dck_tp_cd              = dck_tp_cd             	;	}
	public void setDck_rmk               ( String                 dck_rmk                ){	this.dck_rmk                = dck_rmk               	;	}
	public void setNxt_lane_cd           ( String                 nxt_lane_cd            ){	this.nxt_lane_cd            = nxt_lane_cd           	;	}
	public void setVps_xch_rt            ( String                 vps_xch_rt             ){	this.vps_xch_rt             = vps_xch_rt            	;	}
	public void setAct_arr_dt            ( String                 act_arr_dt             ){	this.act_arr_dt             = act_arr_dt            	;	}
	public void setAct_brth_dt           ( String                 act_brth_dt            ){	this.act_brth_dt            = act_brth_dt           	;	}
	public void setAct_dep_dt            ( String                 act_dep_dt             ){	this.act_dep_dt             = act_dep_dt            	;	}
	public void setSlan_cd               ( String                 slan_cd                ){	this.slan_cd                = slan_cd               	;	}
	public void setBdr_ind_flg           ( String                 bdr_ind_flg            ){	this.bdr_ind_flg            = bdr_ind_flg           	;	}
	public void setCbf_ind_flg           ( String                 cbf_ind_flg            ){	this.cbf_ind_flg            = cbf_ind_flg           	;	}
	public void setHcos_vsl_cd           ( String                 hcos_vsl_cd            ){	this.hcos_vsl_cd            = hcos_vsl_cd           	;	}
	public void setCgo_vol_qty           ( String                 cgo_vol_qty            ){	this.cgo_vol_qty            = cgo_vol_qty           	;	}
	public void setSkd_brth_no           ( String                 skd_brth_no            ){	this.skd_brth_no            = skd_brth_no           	;	}
	public void setFinc_dir_cd           ( String                 finc_dir_cd            ){	this.finc_dir_cd            = finc_dir_cd           	;	}
	public void setCntr_blk_tp_cd        ( String                 cntr_blk_tp_cd         ){	this.cntr_blk_tp_cd         = cntr_blk_tp_cd        	;	}
	public void setVps_act_dt            ( String                 vps_act_dt             ){	this.vps_act_dt             = vps_act_dt            	;	}
	public void setBkg_vsl_cd            ( String                 bkg_vsl_cd             ){	this.bkg_vsl_cd             = bkg_vsl_cd            	;	}
	public void setTml_crr_no            ( String                 tml_crr_no             ){	this.tml_crr_no             = tml_crr_no            	;	}
	public void setFinc_aply_ind_flg     ( String                 finc_aply_ind_flg      ){	this.finc_aply_ind_flg      = finc_aply_ind_flg     	;	}
	public void setSkd_ownr_cd           ( String                 skd_ownr_cd            ){	this.skd_ownr_cd            = skd_ownr_cd           	;	}
	public void setNis_evnt_dt           ( String                 nis_evnt_dt            ){	this.nis_evnt_dt            = nis_evnt_dt           	;	}
	public void setIb_cgo_qty            ( String                 ib_cgo_qty             ){	this.ib_cgo_qty             = ib_cgo_qty            	;	}
	public void setOb_cgo_qty            ( String                 ob_cgo_qty             ){	this.ob_cgo_qty             = ob_cgo_qty            	;	}
	public void setTs_cgo_qty            ( String                 ts_cgo_qty             ){	this.ts_cgo_qty             = ts_cgo_qty            	;	}
	public void setTml_voy_no            ( String                 tml_voy_no             ){	this.tml_voy_no             = tml_voy_no            	;	}
	public void setCrn_wrk_cmnc_dt       ( String                 crn_wrk_cmnc_dt        ){	this.crn_wrk_cmnc_dt        = crn_wrk_cmnc_dt       	;	}
	public void setTs_tml_cd             ( String                 ts_tml_cd              ){	this.ts_tml_cd              = ts_tml_cd             	;	}
	public void setTs_cfm_cd             ( String                 ts_cfm_cd              ){	this.ts_cfm_cd              = ts_cfm_cd             	;	}
	public void setLst_ata_dt            ( String                 lst_ata_dt             ){	this.lst_ata_dt             = lst_ata_dt            	;	}
	public void setLst_atb_dt            ( String                 lst_atb_dt             ){	this.lst_atb_dt             = lst_atb_dt            	;	}
	public void setLst_atd_dt            ( String                 lst_atd_dt             ){	this.lst_atd_dt             = lst_atd_dt            	;	}
	public void setShp_call_no           ( String                 shp_call_no            ){	this.shp_call_no            = shp_call_no           	;	}
	public void setPier_knt              ( String                 pier_knt               ){	this.pier_knt               = pier_knt              	;	}
	public void setYd_cd                 ( String                 yd_cd                  ){	this.yd_cd                  = yd_cd                 	;	}
	public void setShp_call_no_upd_usr_id( String                 shp_call_no_upd_usr_id ){	this.shp_call_no_upd_usr_id = shp_call_no_upd_usr_id	;	}
	public void setShp_call_no_upd_dt    ( String                 shp_call_no_upd_dt     ){	this.shp_call_no_upd_dt     = shp_call_no_upd_dt    	;	}
	public void setTml_vsl_cd            ( String                 tml_vsl_cd             ){	this.tml_vsl_cd             = tml_vsl_cd            	;	}
	public void setFt_dt                 ( String                 ft_dt                  ){	this.ft_dt                  = ft_dt                 	;	}
	public void setEdi_snd_knt           ( String                 edi_snd_knt            ){	this.edi_snd_knt            = edi_snd_knt           	;	}
	public void setPf_eta_dt             ( String                 pf_eta_dt              ){	this.pf_eta_dt              = pf_eta_dt             	;	}
	public void setPf_etb_dt             ( String                 pf_etb_dt              ){	this.pf_etb_dt              = pf_etb_dt             	;	}
	public void setPf_etd_dt             ( String                 pf_etd_dt              ){	this.pf_etd_dt              = pf_etd_dt             	;	}
	public void setAlt_set_hr            ( String                 alt_set_hr             ){	this.alt_set_hr             = alt_set_hr            	;	}
	public void setAct_inp_flg           ( String                 act_inp_flg            ){	this.act_inp_flg            = act_inp_flg           	;	}
	public void setWrk_pln_inp_flg       ( String                 wrk_pln_inp_flg        ){	this.wrk_pln_inp_flg        = wrk_pln_inp_flg       	;	}
	public void setOfc_inp_flg           ( String                 ofc_inp_flg            ){	this.ofc_inp_flg            = ofc_inp_flg           	;	}
	public void setNoon_rpt_inp_flg      ( String                 noon_rpt_inp_flg       ){	this.noon_rpt_inp_flg       = noon_rpt_inp_flg      	;	}
	public void setDep_rpt_inp_flg       ( String                 dep_rpt_inp_flg        ){	this.dep_rpt_inp_flg        = dep_rpt_inp_flg       	;	}
	public void setInit_skd_inp_flg      ( String                 init_skd_inp_flg       ){	this.init_skd_inp_flg       = init_skd_inp_flg      	;	}
	public void setVsl_port_drft_wgt     ( String                 vsl_port_drft_wgt      ){	this.vsl_port_drft_wgt      = vsl_port_drft_wgt     	;	}
	public void setEai_evnt_dt           ( String                 eai_evnt_dt            ){	this.eai_evnt_dt            = eai_evnt_dt           	;	}
    public void setVsl_dlay_rsn_cd       ( String                 vsl_dlay_rsn_cd        ){ this.vsl_dlay_rsn_cd        = vsl_dlay_rsn_cd  			;   }
    public void setVsl_dlay_rsn_desc     ( String                 vsl_dlay_rsn_desc      ){ this.vsl_dlay_rsn_desc      = vsl_dlay_rsn_desc		    ;   }	
    public void setVps_dly_loc		     ( String                 vps_dly_loc            ){ this.vps_dly_loc            = vps_dly_loc		        ;   }

	public static VSK_VSL_PORT_SKD fromRequest(HttpServletRequest request) {
		VSK_VSL_PORT_SKD model = new VSK_VSL_PORT_SKD();
		try {
			model.setIbflag                	(JSPUtil.getParameter(request, "ibflag                		".trim(), ""));
			model.setPage_rows             	(JSPUtil.getParameter(request, "page_rows             		".trim(), ""));
			model.setVsl_cd                	(JSPUtil.getParameter(request, "vsl_cd                		".trim(), ""));
			model.setSkd_voy_no            	(JSPUtil.getParameter(request, "skd_voy_no            		".trim(), ""));
			model.setSkd_dir_cd            	(JSPUtil.getParameter(request, "skd_dir_cd            		".trim(), ""));
			model.setVps_port_cd           	(JSPUtil.getParameter(request, "vps_port_cd           		".trim(), ""));
			model.setClpt_ind_seq          	(JSPUtil.getParameter(request, "clpt_ind_seq          		".trim(), ""));
			model.setClpt_seq              	(JSPUtil.getParameter(request, "clpt_seq              		".trim(), ""));
			model.setVps_eta_dt            	(JSPUtil.getParameter(request, "vps_eta_dt            		".trim(), ""));
			model.setVps_etb_dt            	(JSPUtil.getParameter(request, "vps_etb_dt            		".trim(), ""));
			model.setVps_etd_dt            	(JSPUtil.getParameter(request, "vps_etd_dt            		".trim(), ""));
			model.setVps_cct_dt            	(JSPUtil.getParameter(request, "vps_cct_dt            		".trim(), ""));
			model.setVps_bct_dt            	(JSPUtil.getParameter(request, "vps_bct_dt            		".trim(), ""));
			model.setSkd_sts_cd            	(JSPUtil.getParameter(request, "skd_sts_cd            		".trim(), ""));
			model.setCng_sts_cd            	(JSPUtil.getParameter(request, "cng_sts_cd            		".trim(), ""));
			model.setNxt_port_cd           	(JSPUtil.getParameter(request, "nxt_port_cd           		".trim(), ""));
			model.setNxt_dir_cd            	(JSPUtil.getParameter(request, "nxt_dir_cd            		".trim(), ""));
			model.setNxt_clpt_ind_seq      	(JSPUtil.getParameter(request, "nxt_clpt_ind_seq      		".trim(), ""));
			model.setTurn_port_ind_cd      	(JSPUtil.getParameter(request, "turn_port_ind_cd      		".trim(), ""));
			model.setTurn_skd_voy_no       	(JSPUtil.getParameter(request, "turn_skd_voy_no       		".trim(), ""));
			model.setTurn_skd_dir_cd       	(JSPUtil.getParameter(request, "turn_skd_dir_cd       		".trim(), ""));
			model.setTurn_clpt_ind_seq     	(JSPUtil.getParameter(request, "turn_clpt_ind_seq     		".trim(), ""));
			model.setBl_voy_dir_cd         	(JSPUtil.getParameter(request, "bl_voy_dir_cd         		".trim(), ""));
			model.setCrr_dir_cd            	(JSPUtil.getParameter(request, "crr_dir_cd            		".trim(), ""));
			model.setCrr_voy_no            	(JSPUtil.getParameter(request, "crr_voy_no            		".trim(), ""));
			model.setTml_abbr_nm           	(JSPUtil.getParameter(request, "tml_abbr_nm           		".trim(), ""));
			model.setVps_rev_mk_flg        	(JSPUtil.getParameter(request, "vps_rev_mk_flg        		".trim(), ""));
			model.setCng_port_cd           	(JSPUtil.getParameter(request, "cng_port_cd           		".trim(), ""));
			model.setCng_clpt_ind_seq      	(JSPUtil.getParameter(request, "cng_clpt_ind_seq      		".trim(), ""));
			model.setUpd_dt                	(JSPUtil.getParameter(request, "upd_dt                		".trim(), ""));
			model.setUpd_usr_id            	(JSPUtil.getParameter(request, "upd_usr_id            		".trim(), ""));
			model.setVps_rmk               	(JSPUtil.getParameter(request, "vps_rmk               		".trim(), ""));
			model.setPhs_io_cd             	(JSPUtil.getParameter(request, "phs_io_cd             		".trim(), ""));
			model.setPhs_io_rmk            	(JSPUtil.getParameter(request, "phs_io_rmk            		".trim(), ""));
			model.setDck_in_dt             	(JSPUtil.getParameter(request, "dck_in_dt             		".trim(), ""));
			model.setDck_out_dt            	(JSPUtil.getParameter(request, "dck_out_dt            		".trim(), ""));
			model.setDck_nm                	(JSPUtil.getParameter(request, "dck_nm                		".trim(), ""));
			model.setDck_tp_cd             	(JSPUtil.getParameter(request, "dck_tp_cd             		".trim(), ""));
			model.setDck_rmk               	(JSPUtil.getParameter(request, "dck_rmk               		".trim(), ""));
			model.setNxt_lane_cd           	(JSPUtil.getParameter(request, "nxt_lane_cd           		".trim(), ""));
			model.setVps_xch_rt            	(JSPUtil.getParameter(request, "vps_xch_rt            		".trim(), ""));
			model.setAct_arr_dt            	(JSPUtil.getParameter(request, "act_arr_dt            		".trim(), ""));
			model.setAct_brth_dt           	(JSPUtil.getParameter(request, "act_brth_dt           		".trim(), ""));
			model.setAct_dep_dt            	(JSPUtil.getParameter(request, "act_dep_dt            		".trim(), ""));
			model.setSlan_cd               	(JSPUtil.getParameter(request, "slan_cd               		".trim(), ""));
			model.setBdr_ind_flg           	(JSPUtil.getParameter(request, "bdr_ind_flg           		".trim(), ""));
			model.setCbf_ind_flg           	(JSPUtil.getParameter(request, "cbf_ind_flg           		".trim(), ""));
			model.setHcos_vsl_cd           	(JSPUtil.getParameter(request, "hcos_vsl_cd           		".trim(), ""));
			model.setCgo_vol_qty           	(JSPUtil.getParameter(request, "cgo_vol_qty           		".trim(), ""));
			model.setSkd_brth_no           	(JSPUtil.getParameter(request, "skd_brth_no           		".trim(), ""));
			model.setFinc_dir_cd           	(JSPUtil.getParameter(request, "finc_dir_cd           		".trim(), ""));
			model.setCntr_blk_tp_cd        	(JSPUtil.getParameter(request, "cntr_blk_tp_cd        		".trim(), ""));
			model.setVps_act_dt            	(JSPUtil.getParameter(request, "vps_act_dt            		".trim(), ""));
			model.setBkg_vsl_cd            	(JSPUtil.getParameter(request, "bkg_vsl_cd            		".trim(), ""));
			model.setTml_crr_no            	(JSPUtil.getParameter(request, "tml_crr_no            		".trim(), ""));
			model.setFinc_aply_ind_flg     	(JSPUtil.getParameter(request, "finc_aply_ind_flg     		".trim(), ""));
			model.setSkd_ownr_cd           	(JSPUtil.getParameter(request, "skd_ownr_cd           		".trim(), ""));
			model.setNis_evnt_dt           	(JSPUtil.getParameter(request, "nis_evnt_dt           		".trim(), ""));
			model.setIb_cgo_qty            	(JSPUtil.getParameter(request, "ib_cgo_qty            		".trim(), ""));
			model.setOb_cgo_qty            	(JSPUtil.getParameter(request, "ob_cgo_qty            		".trim(), ""));
			model.setTs_cgo_qty            	(JSPUtil.getParameter(request, "ts_cgo_qty            		".trim(), ""));
			model.setTml_voy_no            	(JSPUtil.getParameter(request, "tml_voy_no            		".trim(), ""));
			model.setCrn_wrk_cmnc_dt       	(JSPUtil.getParameter(request, "crn_wrk_cmnc_dt       		".trim(), ""));
			model.setTs_tml_cd             	(JSPUtil.getParameter(request, "ts_tml_cd             		".trim(), ""));
			model.setTs_cfm_cd             	(JSPUtil.getParameter(request, "ts_cfm_cd             		".trim(), ""));
			model.setLst_ata_dt            	(JSPUtil.getParameter(request, "lst_ata_dt            		".trim(), ""));
			model.setLst_atb_dt            	(JSPUtil.getParameter(request, "lst_atb_dt            		".trim(), ""));
			model.setLst_atd_dt            	(JSPUtil.getParameter(request, "lst_atd_dt            		".trim(), ""));
			model.setShp_call_no           	(JSPUtil.getParameter(request, "shp_call_no           		".trim(), ""));
			model.setPier_knt              	(JSPUtil.getParameter(request, "pier_knt              		".trim(), ""));
			model.setYd_cd                 	(JSPUtil.getParameter(request, "yd_cd                 		".trim(), ""));
			model.setShp_call_no_upd_usr_id	(JSPUtil.getParameter(request, "shp_call_no_upd_usr_id		".trim(), ""));
			model.setShp_call_no_upd_dt    	(JSPUtil.getParameter(request, "shp_call_no_upd_dt    		".trim(), ""));
			model.setTml_vsl_cd            	(JSPUtil.getParameter(request, "tml_vsl_cd            		".trim(), ""));
			model.setFt_dt                 	(JSPUtil.getParameter(request, "ft_dt                 		".trim(), ""));
			model.setEdi_snd_knt           	(JSPUtil.getParameter(request, "edi_snd_knt           		".trim(), ""));
			model.setPf_eta_dt             	(JSPUtil.getParameter(request, "pf_eta_dt             		".trim(), ""));
			model.setPf_etb_dt             	(JSPUtil.getParameter(request, "pf_etb_dt             		".trim(), ""));
			model.setPf_etd_dt             	(JSPUtil.getParameter(request, "pf_etd_dt             		".trim(), ""));
			model.setAlt_set_hr            	(JSPUtil.getParameter(request, "alt_set_hr            		".trim(), ""));
			model.setAct_inp_flg           	(JSPUtil.getParameter(request, "act_inp_flg           		".trim(), ""));
			model.setWrk_pln_inp_flg       	(JSPUtil.getParameter(request, "wrk_pln_inp_flg       		".trim(), ""));
			model.setOfc_inp_flg           	(JSPUtil.getParameter(request, "ofc_inp_flg           		".trim(), ""));
			model.setNoon_rpt_inp_flg      	(JSPUtil.getParameter(request, "noon_rpt_inp_flg      		".trim(), ""));
			model.setDep_rpt_inp_flg       	(JSPUtil.getParameter(request, "dep_rpt_inp_flg       		".trim(), ""));
			model.setInit_skd_inp_flg      	(JSPUtil.getParameter(request, "init_skd_inp_flg      		".trim(), ""));
			model.setVsl_port_drft_wgt     	(JSPUtil.getParameter(request, "vsl_port_drft_wgt     		".trim(), ""));
			model.setEai_evnt_dt           	(JSPUtil.getParameter(request, "eai_evnt_dt           		".trim(), ""));
			model.setVsl_dlay_rsn_cd        (JSPUtil.getParameter(request, "vsl_dlay_rsn_cd             ".trim(), ""));
            model.setVsl_dlay_rsn_desc      (JSPUtil.getParameter(request, "vsl_dlay_rsn_desc           ".trim(), ""));			
            model.setVps_dly_loc	        (JSPUtil.getParameter(request, "vps_dly_loc		            ".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		VSK_VSL_PORT_SKD model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag                 =  (JSPUtil.getParameter(request, "ibflag                		".trim(), length));
			String[] page_rows              =  (JSPUtil.getParameter(request, "page_rows             		".trim(), length));
			String[] vsl_cd                 =  (JSPUtil.getParameter(request, "vsl_cd                		".trim(), length));
			String[] skd_voy_no             =  (JSPUtil.getParameter(request, "skd_voy_no            		".trim(), length));
			String[] skd_dir_cd             =  (JSPUtil.getParameter(request, "skd_dir_cd            		".trim(), length));
			String[] vps_port_cd            =  (JSPUtil.getParameter(request, "vps_port_cd           		".trim(), length));
			String[] clpt_ind_seq           =  (JSPUtil.getParameter(request, "clpt_ind_seq          		".trim(), length));
			String[] clpt_seq               =  (JSPUtil.getParameter(request, "clpt_seq              		".trim(), length));
			String[] vps_eta_dt             =  (JSPUtil.getParameter(request, "vps_eta_dt            		".trim(), length));
			String[] vps_etb_dt             =  (JSPUtil.getParameter(request, "vps_etb_dt            		".trim(), length));
			String[] vps_etd_dt             =  (JSPUtil.getParameter(request, "vps_etd_dt            		".trim(), length));
			String[] vps_cct_dt             =  (JSPUtil.getParameter(request, "vps_cct_dt            		".trim(), length));
			String[] vps_bct_dt             =  (JSPUtil.getParameter(request, "vps_bct_dt            		".trim(), length));
			String[] skd_sts_cd             =  (JSPUtil.getParameter(request, "skd_sts_cd            		".trim(), length));
			String[] cng_sts_cd             =  (JSPUtil.getParameter(request, "cng_sts_cd            		".trim(), length));
			String[] nxt_port_cd            =  (JSPUtil.getParameter(request, "nxt_port_cd           		".trim(), length));
			String[] nxt_dir_cd             =  (JSPUtil.getParameter(request, "nxt_dir_cd            		".trim(), length));
			String[] nxt_clpt_ind_seq       =  (JSPUtil.getParameter(request, "nxt_clpt_ind_seq      		".trim(), length));
			String[] turn_port_ind_cd       =  (JSPUtil.getParameter(request, "turn_port_ind_cd      		".trim(), length));
			String[] turn_skd_voy_no        =  (JSPUtil.getParameter(request, "turn_skd_voy_no       		".trim(), length));
			String[] turn_skd_dir_cd        =  (JSPUtil.getParameter(request, "turn_skd_dir_cd       		".trim(), length));
			String[] turn_clpt_ind_seq      =  (JSPUtil.getParameter(request, "turn_clpt_ind_seq     		".trim(), length));
			String[] bl_voy_dir_cd          =  (JSPUtil.getParameter(request, "bl_voy_dir_cd         		".trim(), length));
			String[] crr_dir_cd             =  (JSPUtil.getParameter(request, "crr_dir_cd            		".trim(), length));
			String[] crr_voy_no             =  (JSPUtil.getParameter(request, "crr_voy_no            		".trim(), length));
			String[] tml_abbr_nm            =  (JSPUtil.getParameter(request, "tml_abbr_nm           		".trim(), length));
			String[] vps_rev_mk_flg         =  (JSPUtil.getParameter(request, "vps_rev_mk_flg        		".trim(), length));
			String[] cng_port_cd            =  (JSPUtil.getParameter(request, "cng_port_cd           		".trim(), length));
			String[] cng_clpt_ind_seq       =  (JSPUtil.getParameter(request, "cng_clpt_ind_seq      		".trim(), length));
			String[] upd_dt                 =  (JSPUtil.getParameter(request, "upd_dt                		".trim(), length));
			String[] upd_usr_id             =  (JSPUtil.getParameter(request, "upd_usr_id            		".trim(), length));
			String[] vps_rmk                =  (JSPUtil.getParameter(request, "vps_rmk               		".trim(), length));
			String[] phs_io_cd              =  (JSPUtil.getParameter(request, "phs_io_cd             		".trim(), length));
			String[] phs_io_rmk             =  (JSPUtil.getParameter(request, "phs_io_rmk            		".trim(), length));
			String[] dck_in_dt              =  (JSPUtil.getParameter(request, "dck_in_dt             		".trim(), length));
			String[] dck_out_dt             =  (JSPUtil.getParameter(request, "dck_out_dt            		".trim(), length));
			String[] dck_nm                 =  (JSPUtil.getParameter(request, "dck_nm                		".trim(), length));
			String[] dck_tp_cd              =  (JSPUtil.getParameter(request, "dck_tp_cd             		".trim(), length));
			String[] dck_rmk                =  (JSPUtil.getParameter(request, "dck_rmk               		".trim(), length));
			String[] nxt_lane_cd            =  (JSPUtil.getParameter(request, "nxt_lane_cd           		".trim(), length));
			String[] vps_xch_rt             =  (JSPUtil.getParameter(request, "vps_xch_rt            		".trim(), length));
			String[] act_arr_dt             =  (JSPUtil.getParameter(request, "act_arr_dt            		".trim(), length));
			String[] act_brth_dt            =  (JSPUtil.getParameter(request, "act_brth_dt           		".trim(), length));
			String[] act_dep_dt             =  (JSPUtil.getParameter(request, "act_dep_dt            		".trim(), length));
			String[] slan_cd                =  (JSPUtil.getParameter(request, "slan_cd               		".trim(), length));
			String[] bdr_ind_flg            =  (JSPUtil.getParameter(request, "bdr_ind_flg           		".trim(), length));
			String[] cbf_ind_flg            =  (JSPUtil.getParameter(request, "cbf_ind_flg           		".trim(), length));
			String[] hcos_vsl_cd            =  (JSPUtil.getParameter(request, "hcos_vsl_cd           		".trim(), length));
			String[] cgo_vol_qty            =  (JSPUtil.getParameter(request, "cgo_vol_qty           		".trim(), length));
			String[] skd_brth_no            =  (JSPUtil.getParameter(request, "skd_brth_no           		".trim(), length));
			String[] finc_dir_cd            =  (JSPUtil.getParameter(request, "finc_dir_cd           		".trim(), length));
			String[] cntr_blk_tp_cd         =  (JSPUtil.getParameter(request, "cntr_blk_tp_cd        		".trim(), length));
			String[] vps_act_dt             =  (JSPUtil.getParameter(request, "vps_act_dt            		".trim(), length));
			String[] bkg_vsl_cd             =  (JSPUtil.getParameter(request, "bkg_vsl_cd            		".trim(), length));
			String[] tml_crr_no             =  (JSPUtil.getParameter(request, "tml_crr_no            		".trim(), length));
			String[] finc_aply_ind_flg      =  (JSPUtil.getParameter(request, "finc_aply_ind_flg     		".trim(), length));
			String[] skd_ownr_cd            =  (JSPUtil.getParameter(request, "skd_ownr_cd           		".trim(), length));
			String[] nis_evnt_dt            =  (JSPUtil.getParameter(request, "nis_evnt_dt           		".trim(), length));
			String[] ib_cgo_qty             =  (JSPUtil.getParameter(request, "ib_cgo_qty            		".trim(), length));
			String[] ob_cgo_qty             =  (JSPUtil.getParameter(request, "ob_cgo_qty            		".trim(), length));
			String[] ts_cgo_qty             =  (JSPUtil.getParameter(request, "ts_cgo_qty            		".trim(), length));
			String[] tml_voy_no             =  (JSPUtil.getParameter(request, "tml_voy_no            		".trim(), length));
			String[] crn_wrk_cmnc_dt        =  (JSPUtil.getParameter(request, "crn_wrk_cmnc_dt       		".trim(), length));
			String[] ts_tml_cd              =  (JSPUtil.getParameter(request, "ts_tml_cd             		".trim(), length));
			String[] ts_cfm_cd              =  (JSPUtil.getParameter(request, "ts_cfm_cd             		".trim(), length));
			String[] lst_ata_dt             =  (JSPUtil.getParameter(request, "lst_ata_dt            		".trim(), length));
			String[] lst_atb_dt             =  (JSPUtil.getParameter(request, "lst_atb_dt            		".trim(), length));
			String[] lst_atd_dt             =  (JSPUtil.getParameter(request, "lst_atd_dt            		".trim(), length));
			String[] shp_call_no            =  (JSPUtil.getParameter(request, "shp_call_no           		".trim(), length));
			String[] pier_knt               =  (JSPUtil.getParameter(request, "pier_knt              		".trim(), length));
			String[] yd_cd                  =  (JSPUtil.getParameter(request, "yd_cd                 		".trim(), length));
			String[] shp_call_no_upd_usr_id =  (JSPUtil.getParameter(request, "shp_call_no_upd_usr_id		".trim(), length));
			String[] shp_call_no_upd_dt     =  (JSPUtil.getParameter(request, "shp_call_no_upd_dt    		".trim(), length));
			String[] tml_vsl_cd             =  (JSPUtil.getParameter(request, "tml_vsl_cd            		".trim(), length));
			String[] ft_dt                  =  (JSPUtil.getParameter(request, "ft_dt                 		".trim(), length));
			String[] edi_snd_knt            =  (JSPUtil.getParameter(request, "edi_snd_knt           		".trim(), length));
			String[] pf_eta_dt              =  (JSPUtil.getParameter(request, "pf_eta_dt             		".trim(), length));
			String[] pf_etb_dt              =  (JSPUtil.getParameter(request, "pf_etb_dt             		".trim(), length));
			String[] pf_etd_dt              =  (JSPUtil.getParameter(request, "pf_etd_dt             		".trim(), length));
			String[] alt_set_hr             =  (JSPUtil.getParameter(request, "alt_set_hr            		".trim(), length));
			String[] act_inp_flg            =  (JSPUtil.getParameter(request, "act_inp_flg           		".trim(), length));
			String[] wrk_pln_inp_flg        =  (JSPUtil.getParameter(request, "wrk_pln_inp_flg       		".trim(), length));
			String[] ofc_inp_flg            =  (JSPUtil.getParameter(request, "ofc_inp_flg           		".trim(), length));
			String[] noon_rpt_inp_flg       =  (JSPUtil.getParameter(request, "noon_rpt_inp_flg      		".trim(), length));
			String[] dep_rpt_inp_flg        =  (JSPUtil.getParameter(request, "dep_rpt_inp_flg       		".trim(), length));
			String[] init_skd_inp_flg       =  (JSPUtil.getParameter(request, "init_skd_inp_flg      		".trim(), length));
			String[] vsl_port_drft_wgt      =  (JSPUtil.getParameter(request, "vsl_port_drft_wgt     		".trim(), length));
			String[] eai_evnt_dt            =  (JSPUtil.getParameter(request, "eai_evnt_dt           		".trim(), length));
			String[] vsl_dlay_rsn_cd   		=  (JSPUtil.getParameter(request, "vsl_dlay_rsn_cd              ".trim(), length));
	        String[] vsl_dlay_rsn_desc 		=  (JSPUtil.getParameter(request, "vsl_dlay_rsn_desc            ".trim(), length));			
	        String[] vps_dly_loc	 		=  (JSPUtil.getParameter(request, "vps_dly_loc		            ".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new VSK_VSL_PORT_SKD();
				model.setIbflag                		  (ibflag                	[i]);
				model.setPage_rows             		  (page_rows             	[i]);
				model.setVsl_cd                		  (vsl_cd                	[i]);
				model.setSkd_voy_no            		  (skd_voy_no            	[i]);
				model.setSkd_dir_cd            		  (skd_dir_cd            	[i]);
				model.setVps_port_cd           		  (vps_port_cd           	[i]);
				model.setClpt_ind_seq          		  (clpt_ind_seq          	[i]);
				model.setClpt_seq              		  (clpt_seq              	[i]);
				model.setVps_eta_dt            		  (vps_eta_dt            	[i]);
				model.setVps_etb_dt            		  (vps_etb_dt            	[i]);
				model.setVps_etd_dt            		  (vps_etd_dt            	[i]);
				model.setVps_cct_dt            		  (vps_cct_dt            	[i]);
				model.setVps_bct_dt            		  (vps_bct_dt            	[i]);
				model.setSkd_sts_cd            		  (skd_sts_cd            	[i]);
				model.setCng_sts_cd            		  (cng_sts_cd            	[i]);
				model.setNxt_port_cd           		  (nxt_port_cd           	[i]);
				model.setNxt_dir_cd            		  (nxt_dir_cd            	[i]);
				model.setNxt_clpt_ind_seq      		  (nxt_clpt_ind_seq      	[i]);
				model.setTurn_port_ind_cd      		  (turn_port_ind_cd      	[i]);
				model.setTurn_skd_voy_no       		  (turn_skd_voy_no       	[i]);
				model.setTurn_skd_dir_cd       		  (turn_skd_dir_cd       	[i]);
				model.setTurn_clpt_ind_seq     		  (turn_clpt_ind_seq     	[i]);
				model.setBl_voy_dir_cd         		  (bl_voy_dir_cd         	[i]);
				model.setCrr_dir_cd            		  (crr_dir_cd            	[i]);
				model.setCrr_voy_no            		  (crr_voy_no            	[i]);
				model.setTml_abbr_nm           		  (tml_abbr_nm           	[i]);
				model.setVps_rev_mk_flg        		  (vps_rev_mk_flg        	[i]);
				model.setCng_port_cd           		  (cng_port_cd           	[i]);
				model.setCng_clpt_ind_seq      		  (cng_clpt_ind_seq      	[i]);
				model.setUpd_dt                		  (upd_dt                	[i]);
				model.setUpd_usr_id            		  (upd_usr_id            	[i]);
				model.setVps_rmk               		  (vps_rmk               	[i]);
				model.setPhs_io_cd             		  (phs_io_cd             	[i]);
				model.setPhs_io_rmk            		  (phs_io_rmk            	[i]);
				model.setDck_in_dt             		  (dck_in_dt             	[i]);
				model.setDck_out_dt            		  (dck_out_dt            	[i]);
				model.setDck_nm                		  (dck_nm                	[i]);
				model.setDck_tp_cd             		  (dck_tp_cd             	[i]);
				model.setDck_rmk               		  (dck_rmk               	[i]);
				model.setNxt_lane_cd           		  (nxt_lane_cd           	[i]);
				model.setVps_xch_rt            		  (vps_xch_rt            	[i]);
				model.setAct_arr_dt            		  (act_arr_dt            	[i]);
				model.setAct_brth_dt           		  (act_brth_dt           	[i]);
				model.setAct_dep_dt            		  (act_dep_dt            	[i]);
				model.setSlan_cd               		  (slan_cd               	[i]);
				model.setBdr_ind_flg           		  (bdr_ind_flg           	[i]);
				model.setCbf_ind_flg           		  (cbf_ind_flg           	[i]);
				model.setHcos_vsl_cd           		  (hcos_vsl_cd           	[i]);
				model.setCgo_vol_qty           		  (cgo_vol_qty           	[i]);
				model.setSkd_brth_no           		  (skd_brth_no           	[i]);
				model.setFinc_dir_cd           		  (finc_dir_cd           	[i]);
				model.setCntr_blk_tp_cd        		  (cntr_blk_tp_cd        	[i]);
				model.setVps_act_dt            		  (vps_act_dt            	[i]);
				model.setBkg_vsl_cd            		  (bkg_vsl_cd            	[i]);
				model.setTml_crr_no            		  (tml_crr_no            	[i]);
				model.setFinc_aply_ind_flg     		  (finc_aply_ind_flg     	[i]);
				model.setSkd_ownr_cd           		  (skd_ownr_cd           	[i]);
				model.setNis_evnt_dt           		  (nis_evnt_dt           	[i]);
				model.setIb_cgo_qty            		  (ib_cgo_qty            	[i]);
				model.setOb_cgo_qty            		  (ob_cgo_qty            	[i]);
				model.setTs_cgo_qty            		  (ts_cgo_qty            	[i]);
				model.setTml_voy_no            		  (tml_voy_no            	[i]);
				model.setCrn_wrk_cmnc_dt       		  (crn_wrk_cmnc_dt       	[i]);
				model.setTs_tml_cd             		  (ts_tml_cd             	[i]);
				model.setTs_cfm_cd             		  (ts_cfm_cd             	[i]);
				model.setLst_ata_dt            		  (lst_ata_dt            	[i]);
				model.setLst_atb_dt            		  (lst_atb_dt            	[i]);
				model.setLst_atd_dt            		  (lst_atd_dt            	[i]);
				model.setShp_call_no           		  (shp_call_no           	[i]);
				model.setPier_knt              		  (pier_knt              	[i]);
				model.setYd_cd                 		  (yd_cd                 	[i]);
				model.setShp_call_no_upd_usr_id		  (shp_call_no_upd_usr_id	[i]);
				model.setShp_call_no_upd_dt    		  (shp_call_no_upd_dt    	[i]);
				model.setTml_vsl_cd            		  (tml_vsl_cd            	[i]);
				model.setFt_dt                 		  (ft_dt                 	[i]);
				model.setEdi_snd_knt           		  (edi_snd_knt           	[i]);
				model.setPf_eta_dt             		  (pf_eta_dt             	[i]);
				model.setPf_etb_dt             		  (pf_etb_dt             	[i]);
				model.setPf_etd_dt             		  (pf_etd_dt             	[i]);
				model.setAlt_set_hr            		  (alt_set_hr            	[i]);
				model.setAct_inp_flg           		  (act_inp_flg           	[i]);
				model.setWrk_pln_inp_flg       		  (wrk_pln_inp_flg       	[i]);
				model.setOfc_inp_flg           		  (ofc_inp_flg           	[i]);
				model.setNoon_rpt_inp_flg      		  (noon_rpt_inp_flg      	[i]);
				model.setDep_rpt_inp_flg       		  (dep_rpt_inp_flg       	[i]);
				model.setInit_skd_inp_flg      		  (init_skd_inp_flg      	[i]);
				model.setVsl_port_drft_wgt     		  (vsl_port_drft_wgt     	[i]);
				model.setEai_evnt_dt           		  (eai_evnt_dt           	[i]);
				model.setVsl_dlay_rsn_cd              (vsl_dlay_rsn_cd          [i]);
                model.setVsl_dlay_rsn_desc            (vsl_dlay_rsn_desc        [i]);				
                model.setVps_dly_loc	              (vps_dly_loc		        [i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		VSK_VSL_PORT_SKD model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag                 =  (JSPUtil.getParameter(request, prefix + "ibflag                		".trim(), length));
			String[] page_rows              =  (JSPUtil.getParameter(request, prefix + "page_rows             		".trim(), length));
			String[] vsl_cd                 =  (JSPUtil.getParameter(request, prefix + "vsl_cd                		".trim(), length));
			String[] skd_voy_no             =  (JSPUtil.getParameter(request, prefix + "skd_voy_no            		".trim(), length));
			String[] skd_dir_cd             =  (JSPUtil.getParameter(request, prefix + "skd_dir_cd            		".trim(), length));
			String[] vps_port_cd            =  (JSPUtil.getParameter(request, prefix + "vps_port_cd           		".trim(), length));
			String[] clpt_ind_seq           =  (JSPUtil.getParameter(request, prefix + "clpt_ind_seq          		".trim(), length));
			String[] clpt_seq               =  (JSPUtil.getParameter(request, prefix + "clpt_seq              		".trim(), length));
			String[] vps_eta_dt             =  (JSPUtil.getParameter(request, prefix + "vps_eta_dt            		".trim(), length));
			String[] vps_etb_dt             =  (JSPUtil.getParameter(request, prefix + "vps_etb_dt            		".trim(), length));
			String[] vps_etd_dt             =  (JSPUtil.getParameter(request, prefix + "vps_etd_dt            		".trim(), length));
			String[] vps_cct_dt             =  (JSPUtil.getParameter(request, prefix + "vps_cct_dt            		".trim(), length));
			String[] vps_bct_dt             =  (JSPUtil.getParameter(request, prefix + "vps_bct_dt            		".trim(), length));
			String[] skd_sts_cd             =  (JSPUtil.getParameter(request, prefix + "skd_sts_cd            		".trim(), length));
			String[] cng_sts_cd             =  (JSPUtil.getParameter(request, prefix + "cng_sts_cd            		".trim(), length));
			String[] nxt_port_cd            =  (JSPUtil.getParameter(request, prefix + "nxt_port_cd           		".trim(), length));
			String[] nxt_dir_cd             =  (JSPUtil.getParameter(request, prefix + "nxt_dir_cd            		".trim(), length));
			String[] nxt_clpt_ind_seq       =  (JSPUtil.getParameter(request, prefix + "nxt_clpt_ind_seq      		".trim(), length));
			String[] turn_port_ind_cd       =  (JSPUtil.getParameter(request, prefix + "turn_port_ind_cd      		".trim(), length));
			String[] turn_skd_voy_no        =  (JSPUtil.getParameter(request, prefix + "turn_skd_voy_no       		".trim(), length));
			String[] turn_skd_dir_cd        =  (JSPUtil.getParameter(request, prefix + "turn_skd_dir_cd       		".trim(), length));
			String[] turn_clpt_ind_seq      =  (JSPUtil.getParameter(request, prefix + "turn_clpt_ind_seq     		".trim(), length));
			String[] bl_voy_dir_cd          =  (JSPUtil.getParameter(request, prefix + "bl_voy_dir_cd         		".trim(), length));
			String[] crr_dir_cd             =  (JSPUtil.getParameter(request, prefix + "crr_dir_cd            		".trim(), length));
			String[] crr_voy_no             =  (JSPUtil.getParameter(request, prefix + "crr_voy_no            		".trim(), length));
			String[] tml_abbr_nm            =  (JSPUtil.getParameter(request, prefix + "tml_abbr_nm           		".trim(), length));
			String[] vps_rev_mk_flg         =  (JSPUtil.getParameter(request, prefix + "vps_rev_mk_flg        		".trim(), length));
			String[] cng_port_cd            =  (JSPUtil.getParameter(request, prefix + "cng_port_cd           		".trim(), length));
			String[] cng_clpt_ind_seq       =  (JSPUtil.getParameter(request, prefix + "cng_clpt_ind_seq      		".trim(), length));
			String[] upd_dt                 =  (JSPUtil.getParameter(request, prefix + "upd_dt                		".trim(), length));
			String[] upd_usr_id             =  (JSPUtil.getParameter(request, prefix + "upd_usr_id            		".trim(), length));
			String[] vps_rmk                =  (JSPUtil.getParameter(request, prefix + "vps_rmk               		".trim(), length));
			String[] phs_io_cd              =  (JSPUtil.getParameter(request, prefix + "phs_io_cd             		".trim(), length));
			String[] phs_io_rmk             =  (JSPUtil.getParameter(request, prefix + "phs_io_rmk            		".trim(), length));
			String[] dck_in_dt              =  (JSPUtil.getParameter(request, prefix + "dck_in_dt             		".trim(), length));
			String[] dck_out_dt             =  (JSPUtil.getParameter(request, prefix + "dck_out_dt            		".trim(), length));
			String[] dck_nm                 =  (JSPUtil.getParameter(request, prefix + "dck_nm                		".trim(), length));
			String[] dck_tp_cd              =  (JSPUtil.getParameter(request, prefix + "dck_tp_cd             		".trim(), length));
			String[] dck_rmk                =  (JSPUtil.getParameter(request, prefix + "dck_rmk               		".trim(), length));
			String[] nxt_lane_cd            =  (JSPUtil.getParameter(request, prefix + "nxt_lane_cd           		".trim(), length));
			String[] vps_xch_rt             =  (JSPUtil.getParameter(request, prefix + "vps_xch_rt            		".trim(), length));
			String[] act_arr_dt             =  (JSPUtil.getParameter(request, prefix + "act_arr_dt            		".trim(), length));
			String[] act_brth_dt            =  (JSPUtil.getParameter(request, prefix + "act_brth_dt           		".trim(), length));
			String[] act_dep_dt             =  (JSPUtil.getParameter(request, prefix + "act_dep_dt            		".trim(), length));
			String[] slan_cd                =  (JSPUtil.getParameter(request, prefix + "slan_cd               		".trim(), length));
			String[] bdr_ind_flg            =  (JSPUtil.getParameter(request, prefix + "bdr_ind_flg           		".trim(), length));
			String[] cbf_ind_flg            =  (JSPUtil.getParameter(request, prefix + "cbf_ind_flg           		".trim(), length));
			String[] hcos_vsl_cd            =  (JSPUtil.getParameter(request, prefix + "hcos_vsl_cd           		".trim(), length));
			String[] cgo_vol_qty            =  (JSPUtil.getParameter(request, prefix + "cgo_vol_qty           		".trim(), length));
			String[] skd_brth_no            =  (JSPUtil.getParameter(request, prefix + "skd_brth_no           		".trim(), length));
			String[] finc_dir_cd            =  (JSPUtil.getParameter(request, prefix + "finc_dir_cd           		".trim(), length));
			String[] cntr_blk_tp_cd         =  (JSPUtil.getParameter(request, prefix + "cntr_blk_tp_cd        		".trim(), length));
			String[] vps_act_dt             =  (JSPUtil.getParameter(request, prefix + "vps_act_dt            		".trim(), length));
			String[] bkg_vsl_cd             =  (JSPUtil.getParameter(request, prefix + "bkg_vsl_cd            		".trim(), length));
			String[] tml_crr_no             =  (JSPUtil.getParameter(request, prefix + "tml_crr_no            		".trim(), length));
			String[] finc_aply_ind_flg      =  (JSPUtil.getParameter(request, prefix + "finc_aply_ind_flg     		".trim(), length));
			String[] skd_ownr_cd            =  (JSPUtil.getParameter(request, prefix + "skd_ownr_cd           		".trim(), length));
			String[] nis_evnt_dt            =  (JSPUtil.getParameter(request, prefix + "nis_evnt_dt           		".trim(), length));
			String[] ib_cgo_qty             =  (JSPUtil.getParameter(request, prefix + "ib_cgo_qty            		".trim(), length));
			String[] ob_cgo_qty             =  (JSPUtil.getParameter(request, prefix + "ob_cgo_qty            		".trim(), length));
			String[] ts_cgo_qty             =  (JSPUtil.getParameter(request, prefix + "ts_cgo_qty            		".trim(), length));
			String[] tml_voy_no             =  (JSPUtil.getParameter(request, prefix + "tml_voy_no            		".trim(), length));
			String[] crn_wrk_cmnc_dt        =  (JSPUtil.getParameter(request, prefix + "crn_wrk_cmnc_dt       		".trim(), length));
			String[] ts_tml_cd              =  (JSPUtil.getParameter(request, prefix + "ts_tml_cd             		".trim(), length));
			String[] ts_cfm_cd              =  (JSPUtil.getParameter(request, prefix + "ts_cfm_cd             		".trim(), length));
			String[] lst_ata_dt             =  (JSPUtil.getParameter(request, prefix + "lst_ata_dt            		".trim(), length));
			String[] lst_atb_dt             =  (JSPUtil.getParameter(request, prefix + "lst_atb_dt            		".trim(), length));
			String[] lst_atd_dt             =  (JSPUtil.getParameter(request, prefix + "lst_atd_dt            		".trim(), length));
			String[] shp_call_no            =  (JSPUtil.getParameter(request, prefix + "shp_call_no           		".trim(), length));
			String[] pier_knt               =  (JSPUtil.getParameter(request, prefix + "pier_knt              		".trim(), length));
			String[] yd_cd                  =  (JSPUtil.getParameter(request, prefix + "yd_cd                 		".trim(), length));
			String[] shp_call_no_upd_usr_id =  (JSPUtil.getParameter(request, prefix + "shp_call_no_upd_usr_id		".trim(), length));
			String[] shp_call_no_upd_dt     =  (JSPUtil.getParameter(request, prefix + "shp_call_no_upd_dt    		".trim(), length));
			String[] tml_vsl_cd             =  (JSPUtil.getParameter(request, prefix + "tml_vsl_cd            		".trim(), length));
			String[] ft_dt                  =  (JSPUtil.getParameter(request, prefix + "ft_dt                 		".trim(), length));
			String[] edi_snd_knt            =  (JSPUtil.getParameter(request, prefix + "edi_snd_knt           		".trim(), length));
			String[] pf_eta_dt              =  (JSPUtil.getParameter(request, prefix + "pf_eta_dt             		".trim(), length));
			String[] pf_etb_dt              =  (JSPUtil.getParameter(request, prefix + "pf_etb_dt             		".trim(), length));
			String[] pf_etd_dt              =  (JSPUtil.getParameter(request, prefix + "pf_etd_dt             		".trim(), length));
			String[] alt_set_hr             =  (JSPUtil.getParameter(request, prefix + "alt_set_hr            		".trim(), length));
			String[] act_inp_flg            =  (JSPUtil.getParameter(request, prefix + "act_inp_flg           		".trim(), length));
			String[] wrk_pln_inp_flg        =  (JSPUtil.getParameter(request, prefix + "wrk_pln_inp_flg       		".trim(), length));
			String[] ofc_inp_flg            =  (JSPUtil.getParameter(request, prefix + "ofc_inp_flg           		".trim(), length));
			String[] noon_rpt_inp_flg       =  (JSPUtil.getParameter(request, prefix + "noon_rpt_inp_flg      		".trim(), length));
			String[] dep_rpt_inp_flg        =  (JSPUtil.getParameter(request, prefix + "dep_rpt_inp_flg       		".trim(), length));
			String[] init_skd_inp_flg       =  (JSPUtil.getParameter(request, prefix + "init_skd_inp_flg      		".trim(), length));
			String[] vsl_port_drft_wgt      =  (JSPUtil.getParameter(request, prefix + "vsl_port_drft_wgt     		".trim(), length));
			String[] eai_evnt_dt            =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt           		".trim(), length));
			String[] vsl_dlay_rsn_cd   		=  (JSPUtil.getParameter(request, prefix + "vsl_dlay_rsn_cd             ".trim(), length));
	        String[] vsl_dlay_rsn_desc 		=  (JSPUtil.getParameter(request, prefix + "vsl_dlay_rsn_desc           ".trim(), length));
	        String[] vps_dly_loc	 		=  (JSPUtil.getParameter(request, prefix + "vps_cly_loc		            ".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new VSK_VSL_PORT_SKD();
				model.setIbflag                		  ( ibflag                	[i]);
				model.setPage_rows             		  ( page_rows             	[i]);
				model.setVsl_cd                		  ( vsl_cd                	[i]);
				model.setSkd_voy_no            		  ( skd_voy_no            	[i]);
				model.setSkd_dir_cd            		  ( skd_dir_cd            	[i]);
				model.setVps_port_cd           		  ( vps_port_cd           	[i]);
				model.setClpt_ind_seq          		  ( clpt_ind_seq          	[i]);
				model.setClpt_seq              		  ( clpt_seq              	[i]);
				model.setVps_eta_dt            		  ( vps_eta_dt            	[i]);
				model.setVps_etb_dt            		  ( vps_etb_dt            	[i]);
				model.setVps_etd_dt            		  ( vps_etd_dt            	[i]);
				model.setVps_cct_dt            		  ( vps_cct_dt            	[i]);
				model.setVps_bct_dt            		  ( vps_bct_dt            	[i]);
				model.setSkd_sts_cd            		  ( skd_sts_cd            	[i]);
				model.setCng_sts_cd            		  ( cng_sts_cd            	[i]);
				model.setNxt_port_cd           		  ( nxt_port_cd           	[i]);
				model.setNxt_dir_cd            		  ( nxt_dir_cd            	[i]);
				model.setNxt_clpt_ind_seq      		  ( nxt_clpt_ind_seq      	[i]);
				model.setTurn_port_ind_cd      		  ( turn_port_ind_cd      	[i]);
				model.setTurn_skd_voy_no       		  ( turn_skd_voy_no       	[i]);
				model.setTurn_skd_dir_cd       		  ( turn_skd_dir_cd       	[i]);
				model.setTurn_clpt_ind_seq     		  ( turn_clpt_ind_seq     	[i]);
				model.setBl_voy_dir_cd         		  ( bl_voy_dir_cd         	[i]);
				model.setCrr_dir_cd            		  ( crr_dir_cd            	[i]);
				model.setCrr_voy_no            		  ( crr_voy_no            	[i]);
				model.setTml_abbr_nm           		  ( tml_abbr_nm           	[i]);
				model.setVps_rev_mk_flg        		  ( vps_rev_mk_flg        	[i]);
				model.setCng_port_cd           		  ( cng_port_cd           	[i]);
				model.setCng_clpt_ind_seq      		  ( cng_clpt_ind_seq      	[i]);
				model.setUpd_dt                		  ( upd_dt                	[i]);
				model.setUpd_usr_id            		  ( upd_usr_id            	[i]);
				model.setVps_rmk               		  ( vps_rmk               	[i]);
				model.setPhs_io_cd             		  ( phs_io_cd             	[i]);
				model.setPhs_io_rmk            		  ( phs_io_rmk            	[i]);
				model.setDck_in_dt             		  ( dck_in_dt             	[i]);
				model.setDck_out_dt            		  ( dck_out_dt            	[i]);
				model.setDck_nm                		  ( dck_nm                	[i]);
				model.setDck_tp_cd             		  ( dck_tp_cd             	[i]);
				model.setDck_rmk               		  ( dck_rmk               	[i]);
				model.setNxt_lane_cd           		  ( nxt_lane_cd           	[i]);
				model.setVps_xch_rt            		  ( vps_xch_rt            	[i]);
				model.setAct_arr_dt            		  ( act_arr_dt            	[i]);
				model.setAct_brth_dt           		  ( act_brth_dt           	[i]);
				model.setAct_dep_dt            		  ( act_dep_dt            	[i]);
				model.setSlan_cd               		  ( slan_cd               	[i]);
				model.setBdr_ind_flg           		  ( bdr_ind_flg           	[i]);
				model.setCbf_ind_flg           		  ( cbf_ind_flg           	[i]);
				model.setHcos_vsl_cd           		  ( hcos_vsl_cd           	[i]);
				model.setCgo_vol_qty           		  ( cgo_vol_qty           	[i]);
				model.setSkd_brth_no           		  ( skd_brth_no           	[i]);
				model.setFinc_dir_cd           		  ( finc_dir_cd           	[i]);
				model.setCntr_blk_tp_cd        		  ( cntr_blk_tp_cd        	[i]);
				model.setVps_act_dt            		  ( vps_act_dt            	[i]);
				model.setBkg_vsl_cd            		  ( bkg_vsl_cd            	[i]);
				model.setTml_crr_no            		  ( tml_crr_no            	[i]);
				model.setFinc_aply_ind_flg     		  ( finc_aply_ind_flg     	[i]);
				model.setSkd_ownr_cd           		  ( skd_ownr_cd           	[i]);
				model.setNis_evnt_dt           		  ( nis_evnt_dt           	[i]);
				model.setIb_cgo_qty            		  ( ib_cgo_qty            	[i]);
				model.setOb_cgo_qty            		  ( ob_cgo_qty            	[i]);
				model.setTs_cgo_qty            		  ( ts_cgo_qty            	[i]);
				model.setTml_voy_no            		  ( tml_voy_no            	[i]);
				model.setCrn_wrk_cmnc_dt       		  ( crn_wrk_cmnc_dt       	[i]);
				model.setTs_tml_cd             		  ( ts_tml_cd             	[i]);
				model.setTs_cfm_cd             		  ( ts_cfm_cd             	[i]);
				model.setLst_ata_dt            		  ( lst_ata_dt            	[i]);
				model.setLst_atb_dt            		  ( lst_atb_dt            	[i]);
				model.setLst_atd_dt            		  ( lst_atd_dt            	[i]);
				model.setShp_call_no           		  ( shp_call_no           	[i]);
				model.setPier_knt              		  ( pier_knt              	[i]);
				model.setYd_cd                 		  ( yd_cd                 	[i]);
				model.setShp_call_no_upd_usr_id		  ( shp_call_no_upd_usr_id	[i]);
				model.setShp_call_no_upd_dt    		  ( shp_call_no_upd_dt    	[i]);
				model.setTml_vsl_cd            		  ( tml_vsl_cd            	[i]);
				model.setFt_dt                 		  ( ft_dt                 	[i]);
				model.setEdi_snd_knt           		  ( edi_snd_knt           	[i]);
				model.setPf_eta_dt             		  ( pf_eta_dt             	[i]);
				model.setPf_etb_dt             		  ( pf_etb_dt             	[i]);
				model.setPf_etd_dt             		  ( pf_etd_dt             	[i]);
				model.setAlt_set_hr            		  ( alt_set_hr            	[i]);
				model.setAct_inp_flg           		  ( act_inp_flg           	[i]);
				model.setWrk_pln_inp_flg       		  ( wrk_pln_inp_flg       	[i]);
				model.setOfc_inp_flg           		  ( ofc_inp_flg           	[i]);
				model.setNoon_rpt_inp_flg      		  ( noon_rpt_inp_flg      	[i]);
				model.setDep_rpt_inp_flg       		  ( dep_rpt_inp_flg       	[i]);
				model.setInit_skd_inp_flg      		  ( init_skd_inp_flg      	[i]);
				model.setVsl_port_drft_wgt     		  ( vsl_port_drft_wgt     	[i]);
				model.setEai_evnt_dt           		  ( eai_evnt_dt           	[i]);
				model.setVsl_dlay_rsn_cd              (vsl_dlay_rsn_cd          [i]);
                model.setVsl_dlay_rsn_desc            (vsl_dlay_rsn_desc        [i]);				
                model.setVps_dly_loc	              (vps_dly_loc		        [i]);
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
