/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : MDM_VSL_CNTR.java
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
public final class MdmVslCntr implements java.io.Serializable {

	private String               ibflag               = "";
	private String               page_rows            = "";
	private String               vsl_cd               = "";
	private String               vsl_clss_cd          = "";
	private String               vsl_eng_nm           = "";
	private String               vsl_krn_nm           = "";
	private String               foil_capa            = "";
	private String               doil_capa            = "";
	private String               frsh_wtr_capa        = "";
	private String               call_sgn_no          = "";
	private String               rgst_no              = "";
	private String               phn_no               = "";
	private String               fax_no               = "";
	private String               tlx_no               = "";
	private String               vsl_eml              = "";
	private String               piclb_desc           = "";
	private String               rgst_port_cd         = "";
	private String               clss_no_rgst_area_nm = "";
	private String               vsl_clss_no          = "";
	private String               vsl_bldr_nm          = "";
	private String               loa_len              = "";
	private String               lbp_len              = "";
	private String               vsl_wdt              = "";
	private String               vsl_dpth             = "";
	private String               smr_drft_hgt         = "";
	private String               dwt_wgt              = "";
	private String               lgt_shp_tong_wgt     = "";
	private String               grs_rgst_tong_wgt    = "";
	private String               net_rgst_tong_wgt    = "";
	private String               pnm_gt_wgt           = "";
	private String               pnm_net_tong_wgt     = "";
	private String               suz_gt_wgt           = "";
	private String               suz_net_tong_wgt     = "";
	private String               mn_eng_mkr_nm        = "";
	private String               mn_eng_tp_cd         = "";
	private String               mn_eng_bhp_pwr       = "";
	private String               vsl_own_ind_cd       = "";
	private String               vsl_rgst_cnt_cd      = "";
	private String               vsl_bld_cd           = "";
	private String               crr_cd               = "";
	private String               fdr_div_cd           = "";
	private String               vsl_svc_spd          = "";
	private String               max_spd              = "";
	private String               ecn_spd              = "";
	private String               crw_knt              = "";
	private String               cntr_dzn_capa        = "";
	private String               cntr_op_capa         = "";
	private String               cntr_pnm_capa        = "";
	private String               cntr_vsl_clss_capa   = "";
	private String               rf_rcpt_knt          = "";
	private String               rf_rcpt_max_knt      = "";
	private String               fbd_capa             = "";
	private String               dpl_capa             = "";
	private String               blst_tnk_capa        = "";
	private String               foil_csm             = "";
	private String               doil_csm             = "";
	private String               frsh_wtr_csm         = "";
	private String               mn_eng_rpm_pwr       = "";
	private String               gnr_rpm_pwr          = "";
	private String               vsl_hgt              = "";
	private String               rgst_dt              = "";
	private String               vsl_edi_nm           = "";
	private String               co_cd                = "";
	private String               vsl_clz_dt           = "";
	private String               vsl_cre_ofc_cd       = "";
	private String               vsl_delt_ofc_cd      = "";
	private String               vsl_bld_cnt_cd       = "";
	private String               gnr_mkr_nm           = "";
	private String               gnr_tp_cd            = "";
	private String               gnr_bhp_pwr          = "";
	private String               bwthst_mkr_nm        = "";
	private String               bwthst_tp_cd         = "";
	private String               bwthst_bhp_pwr       = "";
	private String               bwthst_rpm_pwr       = "";
	private String               lloyd_no             = "";
	private String               vsl_lnch_dt          = "";
	private String               vsl_de_dt            = "";
	private String               vsl_kel_ly_dt        = "";
	private String               vsl_hl_no            = "";
	private String               ttl_teu_knt          = "";
	private String               vsl_htch_knt         = "";
	private String               vsl_hld_knt          = "";
	private String               vsl_rmk              = "";
	private String               cre_usr_id           = "";
	private String               cre_dt               = "";
	private String               upd_usr_id           = "";
	private String               upd_dt               = "";
	private String               delt_flg             = "";
	private String               eai_evnt_dt          = "";
	private String			    vsl_bld_area_nm = "";

	public MdmVslCntr(){}

	public MdmVslCntr(
			String               ibflag              ,
			String               page_rows           ,
			String               vsl_cd              ,
			String               vsl_clss_cd         ,
			String               vsl_eng_nm          ,
			String               vsl_krn_nm          ,
			String               foil_capa           ,
			String               doil_capa           ,
			String               frsh_wtr_capa       ,
			String               call_sgn_no         ,
			String               rgst_no             ,
			String               phn_no              ,
			String               fax_no              ,
			String               tlx_no              ,
			String               vsl_eml             ,
			String               piclb_desc          ,
			String               rgst_port_cd        ,
			String               clss_no_rgst_area_nm,
			String               vsl_clss_no         ,
			String               vsl_bldr_nm         ,
			String               loa_len             ,
			String               lbp_len             ,
			String               vsl_wdt             ,
			String               vsl_dpth            ,
			String               smr_drft_hgt        ,
			String               dwt_wgt             ,
			String               lgt_shp_tong_wgt    ,
			String               grs_rgst_tong_wgt   ,
			String               net_rgst_tong_wgt   ,
			String               pnm_gt_wgt          ,
			String               pnm_net_tong_wgt    ,
			String               suz_gt_wgt          ,
			String               suz_net_tong_wgt    ,
			String               mn_eng_mkr_nm       ,
			String               mn_eng_tp_cd        ,
			String               mn_eng_bhp_pwr      ,
			String               vsl_own_ind_cd      ,
			String               vsl_rgst_cnt_cd     ,
			String               vsl_bld_cd          ,
			String               crr_cd              ,
			String               fdr_div_cd          ,
			String               vsl_svc_spd         ,
			String               max_spd             ,
			String               ecn_spd             ,
			String               crw_knt             ,
			String               cntr_dzn_capa       ,
			String               cntr_op_capa        ,
			String               cntr_pnm_capa       ,
			String               cntr_vsl_clss_capa  ,
			String               rf_rcpt_knt         ,
			String               rf_rcpt_max_knt     ,
			String               fbd_capa            ,
			String               dpl_capa            ,
			String               blst_tnk_capa       ,
			String               foil_csm            ,
			String               doil_csm            ,
			String               frsh_wtr_csm        ,
			String               mn_eng_rpm_pwr      ,
			String               gnr_rpm_pwr         ,
			String               vsl_hgt             ,
			String               rgst_dt             ,
			String               vsl_edi_nm          ,
			String               co_cd               ,
			String               vsl_clz_dt          ,
			String               vsl_cre_ofc_cd      ,
			String               vsl_delt_ofc_cd     ,
			String               vsl_bld_cnt_cd      ,
			String               gnr_mkr_nm          ,
			String               gnr_tp_cd           ,
			String               gnr_bhp_pwr         ,
			String               bwthst_mkr_nm       ,
			String               bwthst_tp_cd        ,
			String               bwthst_bhp_pwr      ,
			String               bwthst_rpm_pwr      ,
			String               lloyd_no            ,
			String               vsl_lnch_dt         ,
			String               vsl_de_dt           ,
			String               vsl_kel_ly_dt       ,
			String               vsl_hl_no           ,
			String               ttl_teu_knt         ,
			String               vsl_htch_knt        ,
			String               vsl_hld_knt         ,
			String               vsl_rmk             ,
			String               cre_usr_id          ,
			String               cre_dt              ,
			String               upd_usr_id          ,
			String               upd_dt              ,
			String               delt_flg            ,
			String               eai_evnt_dt         ,
			String			    vsl_bld_area_nm){
		this.ibflag               = ibflag              ;
		this.page_rows            = page_rows           ;
		this.vsl_cd               = vsl_cd              ;
		this.vsl_clss_cd          = vsl_clss_cd         ;
		this.vsl_eng_nm           = vsl_eng_nm          ;
		this.vsl_krn_nm           = vsl_krn_nm          ;
		this.foil_capa            = foil_capa           ;
		this.doil_capa            = doil_capa           ;
		this.frsh_wtr_capa        = frsh_wtr_capa       ;
		this.call_sgn_no          = call_sgn_no         ;
		this.rgst_no              = rgst_no             ;
		this.phn_no               = phn_no              ;
		this.fax_no               = fax_no              ;
		this.tlx_no               = tlx_no              ;
		this.vsl_eml              = vsl_eml             ;
		this.piclb_desc           = piclb_desc          ;
		this.rgst_port_cd         = rgst_port_cd        ;
		this.clss_no_rgst_area_nm = clss_no_rgst_area_nm;
		this.vsl_clss_no          = vsl_clss_no         ;
		this.vsl_bldr_nm          = vsl_bldr_nm         ;
		this.loa_len              = loa_len             ;
		this.lbp_len              = lbp_len             ;
		this.vsl_wdt              = vsl_wdt             ;
		this.vsl_dpth             = vsl_dpth            ;
		this.smr_drft_hgt         = smr_drft_hgt        ;
		this.dwt_wgt              = dwt_wgt             ;
		this.lgt_shp_tong_wgt     = lgt_shp_tong_wgt    ;
		this.grs_rgst_tong_wgt    = grs_rgst_tong_wgt   ;
		this.net_rgst_tong_wgt    = net_rgst_tong_wgt   ;
		this.pnm_gt_wgt           = pnm_gt_wgt          ;
		this.pnm_net_tong_wgt     = pnm_net_tong_wgt    ;
		this.suz_gt_wgt           = suz_gt_wgt          ;
		this.suz_net_tong_wgt     = suz_net_tong_wgt    ;
		this.mn_eng_mkr_nm        = mn_eng_mkr_nm       ;
		this.mn_eng_tp_cd         = mn_eng_tp_cd        ;
		this.mn_eng_bhp_pwr       = mn_eng_bhp_pwr      ;
		this.vsl_own_ind_cd       = vsl_own_ind_cd      ;
		this.vsl_rgst_cnt_cd      = vsl_rgst_cnt_cd     ;
		this.vsl_bld_cd           = vsl_bld_cd          ;
		this.crr_cd               = crr_cd              ;
		this.fdr_div_cd           = fdr_div_cd          ;
		this.vsl_svc_spd          = vsl_svc_spd         ;
		this.max_spd              = max_spd             ;
		this.ecn_spd              = ecn_spd             ;
		this.crw_knt              = crw_knt             ;
		this.cntr_dzn_capa        = cntr_dzn_capa       ;
		this.cntr_op_capa         = cntr_op_capa        ;
		this.cntr_pnm_capa        = cntr_pnm_capa       ;
		this.cntr_vsl_clss_capa   = cntr_vsl_clss_capa  ;
		this.rf_rcpt_knt          = rf_rcpt_knt         ;
		this.rf_rcpt_max_knt      = rf_rcpt_max_knt     ;
		this.fbd_capa             = fbd_capa            ;
		this.dpl_capa             = dpl_capa            ;
		this.blst_tnk_capa        = blst_tnk_capa       ;
		this.foil_csm             = foil_csm            ;
		this.doil_csm             = doil_csm            ;
		this.frsh_wtr_csm         = frsh_wtr_csm        ;
		this.mn_eng_rpm_pwr       = mn_eng_rpm_pwr      ;
		this.gnr_rpm_pwr          = gnr_rpm_pwr         ;
		this.vsl_hgt              = vsl_hgt             ;
		this.rgst_dt              = rgst_dt             ;
		this.vsl_edi_nm           = vsl_edi_nm          ;
		this.co_cd                = co_cd               ;
		this.vsl_clz_dt           = vsl_clz_dt          ;
		this.vsl_cre_ofc_cd       = vsl_cre_ofc_cd      ;
		this.vsl_delt_ofc_cd      = vsl_delt_ofc_cd     ;
		this.vsl_bld_cnt_cd       = vsl_bld_cnt_cd      ;
		this.gnr_mkr_nm           = gnr_mkr_nm          ;
		this.gnr_tp_cd            = gnr_tp_cd           ;
		this.gnr_bhp_pwr          = gnr_bhp_pwr         ;
		this.bwthst_mkr_nm        = bwthst_mkr_nm       ;
		this.bwthst_tp_cd         = bwthst_tp_cd        ;
		this.bwthst_bhp_pwr       = bwthst_bhp_pwr      ;
		this.bwthst_rpm_pwr       = bwthst_rpm_pwr      ;
		this.lloyd_no             = lloyd_no            ;
		this.vsl_lnch_dt          = vsl_lnch_dt         ;
		this.vsl_de_dt            = vsl_de_dt           ;
		this.vsl_kel_ly_dt        = vsl_kel_ly_dt       ;
		this.vsl_hl_no            = vsl_hl_no           ;
		this.ttl_teu_knt          = ttl_teu_knt         ;
		this.vsl_htch_knt         = vsl_htch_knt        ;
		this.vsl_hld_knt          = vsl_hld_knt         ;
		this.vsl_rmk              = vsl_rmk             ;
		this.cre_usr_id           = cre_usr_id          ;
		this.cre_dt               = cre_dt              ;
		this.upd_usr_id           = upd_usr_id          ;
		this.upd_dt               = upd_dt              ;
		this.delt_flg             = delt_flg            ;
		this.eai_evnt_dt          = eai_evnt_dt         ;
		this.vsl_bld_area_nm = vsl_bld_area_nm ;
	}

	// getter method is proceeding ..
	public String               getIbflag              (){	return ibflag              	;	}
	public String               getPage_rows           (){	return page_rows           	;	}
	public String               getVsl_cd              (){	return vsl_cd              	;	}
	public String               getVsl_clss_cd         (){	return vsl_clss_cd        	;	}
	public String               getVsl_eng_nm          (){	return vsl_eng_nm          	;	}
	public String               getVsl_krn_nm          (){	return vsl_krn_nm          	;	}
	public String               getFoil_capa           (){	return foil_capa           	;	}
	public String               getDoil_capa           (){	return doil_capa           	;	}
	public String               getFrsh_wtr_capa       (){	return frsh_wtr_capa       	;	}
	public String               getCall_sgn_no         (){	return call_sgn_no         	;	}
	public String               getRgst_no             (){	return rgst_no             	;	}
	public String               getPhn_no              (){	return phn_no              	;	}
	public String               getFax_no              (){	return fax_no              	;	}
	public String               getTlx_no              (){	return tlx_no              	;	}
	public String               getVsl_eml             (){	return vsl_eml             	;	}
	public String               getPiclb_desc          (){	return piclb_desc          	;	}
	public String               getRgst_port_cd        (){	return rgst_port_cd        	;	}
	public String               getClss_no_rgst_area_nm(){	return clss_no_rgst_area_nm	;	}
	public String               getVsl_clss_no         (){	return vsl_clss_no         	;	}
	public String               getVsl_bldr_nm         (){	return vsl_bldr_nm         	;	}
	public String               getLoa_len             (){	return loa_len             	;	}
	public String               getLbp_len             (){	return lbp_len             	;	}
	public String               getVsl_wdt             (){	return vsl_wdt             	;	}
	public String               getVsl_dpth            (){	return vsl_dpth            	;	}
	public String               getSmr_drft_hgt        (){	return smr_drft_hgt        	;	}
	public String               getDwt_wgt             (){	return dwt_wgt             	;	}
	public String               getLgt_shp_tong_wgt    (){	return lgt_shp_tong_wgt    	;	}
	public String               getGrs_rgst_tong_wgt   (){	return grs_rgst_tong_wgt   	;	}
	public String               getNet_rgst_tong_wgt   (){	return net_rgst_tong_wgt   	;	}
	public String               getPnm_gt_wgt          (){	return pnm_gt_wgt          	;	}
	public String               getPnm_net_tong_wgt    (){	return pnm_net_tong_wgt    	;	}
	public String               getSuz_gt_wgt          (){	return suz_gt_wgt          	;	}
	public String               getSuz_net_tong_wgt    (){	return suz_net_tong_wgt    	;	}
	public String               getMn_eng_mkr_nm       (){	return mn_eng_mkr_nm       	;	}
	public String               getMn_eng_tp_cd        (){	return mn_eng_tp_cd        	;	}
	public String               getMn_eng_bhp_pwr      (){	return mn_eng_bhp_pwr      	;	}
	public String               getVsl_own_ind_cd      (){	return vsl_own_ind_cd      	;	}
	public String               getVsl_rgst_cnt_cd     (){	return vsl_rgst_cnt_cd     	;	}
	public String               getVsl_bld_cd          (){	return vsl_bld_cd          	;	}
	public String               getCrr_cd              (){	return crr_cd              	;	}
	public String               getFdr_div_cd          (){	return fdr_div_cd          	;	}
	public String               getVsl_svc_spd         (){	return vsl_svc_spd         	;	}
	public String               getMax_spd             (){	return max_spd             	;	}
	public String               getEcn_spd             (){	return ecn_spd             	;	}
	public String               getCrw_knt             (){	return crw_knt             	;	}
	public String               getCntr_dzn_capa       (){	return cntr_dzn_capa       	;	}
	public String               getCntr_op_capa        (){	return cntr_op_capa        	;	}
	public String               getCntr_pnm_capa       (){	return cntr_pnm_capa       	;	}
	public String               getCntr_vsl_clss_capa  (){	return cntr_vsl_clss_capa  	;	}
	public String               getRf_rcpt_knt         (){	return rf_rcpt_knt         	;	}
	public String               getRf_rcpt_max_knt     (){	return rf_rcpt_max_knt     	;	}
	public String               getFbd_capa            (){	return fbd_capa            	;	}
	public String               getDpl_capa            (){	return dpl_capa            	;	}
	public String               getBlst_tnk_capa       (){	return blst_tnk_capa       	;	}
	public String               getFoil_csm            (){	return foil_csm            	;	}
	public String               getDoil_csm            (){	return doil_csm            	;	}
	public String               getFrsh_wtr_csm        (){	return frsh_wtr_csm        	;	}
	public String               getMn_eng_rpm_pwr      (){	return mn_eng_rpm_pwr      	;	}
	public String               getGnr_rpm_pwr         (){	return gnr_rpm_pwr         	;	}
	public String               getVsl_hgt             (){	return vsl_hgt             	;	}
	public String               getRgst_dt             (){	return rgst_dt             	;	}
	public String               getVsl_edi_nm          (){	return vsl_edi_nm          	;	}
	public String               getCo_cd               (){	return co_cd               	;	}
	public String               getVsl_clz_dt          (){	return vsl_clz_dt          	;	}
	public String               getVsl_cre_ofc_cd      (){	return vsl_cre_ofc_cd      	;	}
	public String               getVsl_delt_ofc_cd     (){	return vsl_delt_ofc_cd     	;	}
	public String               getVsl_bld_cnt_cd      (){	return vsl_bld_cnt_cd      	;	}
	public String               getGnr_mkr_nm          (){	return gnr_mkr_nm          	;	}
	public String               getGnr_tp_cd           (){	return gnr_tp_cd           	;	}
	public String               getGnr_bhp_pwr         (){	return gnr_bhp_pwr         	;	}
	public String               getBwthst_mkr_nm       (){	return bwthst_mkr_nm       	;	}
	public String               getBwthst_tp_cd        (){	return bwthst_tp_cd        	;	}
	public String               getBwthst_bhp_pwr      (){	return bwthst_bhp_pwr      	;	}
	public String               getBwthst_rpm_pwr      (){	return bwthst_rpm_pwr      	;	}
	public String               getLloyd_no            (){	return lloyd_no            	;	}
	public String               getVsl_lnch_dt         (){	return vsl_lnch_dt         	;	}
	public String               getVsl_de_dt           (){	return vsl_de_dt           	;	}
	public String               getVsl_kel_ly_dt       (){	return vsl_kel_ly_dt       	;	}
	public String               getVsl_hl_no           (){	return vsl_hl_no           	;	}
	public String               getTtl_teu_knt         (){	return ttl_teu_knt         	;	}
	public String               getVsl_htch_knt        (){	return vsl_htch_knt        	;	}
	public String               getVsl_hld_knt         (){	return vsl_hld_knt         	;	}
	public String               getVsl_rmk             (){	return vsl_rmk             	;	}
	public String               getCre_usr_id          (){	return cre_usr_id          	;	}
	public String               getCre_dt              (){	return cre_dt              	;	}
	public String               getUpd_usr_id          (){	return upd_usr_id          	;	}
	public String               getUpd_dt              (){	return upd_dt              	;	}
	public String               getDelt_flg            (){	return delt_flg            	;	}
	public String               getEai_evnt_dt         (){	return eai_evnt_dt         	;	}
	public String 			  getVsl_bld_area_nm(){	return vsl_bld_area_nm	;	}

	// setter method is proceeding ..
	public void setIbflag              ( String               ibflag               ){	this.ibflag               = ibflag              	;	}
	public void setPage_rows           ( String               page_rows            ){	this.page_rows            = page_rows           	;	}
	public void setVsl_cd              ( String               vsl_cd               ){	this.vsl_cd               = vsl_cd              	;	}
	public void setVsl_clss_cd         ( String               vsl_clss_cd          ){	this.vsl_clss_cd          = vsl_clss_cd        		;	}
	public void setVsl_eng_nm          ( String               vsl_eng_nm           ){	this.vsl_eng_nm           = vsl_eng_nm          	;	}
	public void setVsl_krn_nm          ( String               vsl_krn_nm           ){	this.vsl_krn_nm           = vsl_krn_nm          	;	}
	public void setFoil_capa           ( String               foil_capa            ){	this.foil_capa            = foil_capa           	;	}
	public void setDoil_capa           ( String               doil_capa            ){	this.doil_capa            = doil_capa           	;	}
	public void setFrsh_wtr_capa       ( String               frsh_wtr_capa        ){	this.frsh_wtr_capa        = frsh_wtr_capa       	;	}
	public void setCall_sgn_no         ( String               call_sgn_no          ){	this.call_sgn_no          = call_sgn_no         	;	}
	public void setRgst_no             ( String               rgst_no              ){	this.rgst_no              = rgst_no             	;	}
	public void setPhn_no              ( String               phn_no               ){	this.phn_no               = phn_no              	;	}
	public void setFax_no              ( String               fax_no               ){	this.fax_no               = fax_no              	;	}
	public void setTlx_no              ( String               tlx_no               ){	this.tlx_no               = tlx_no              	;	}
	public void setVsl_eml             ( String               vsl_eml              ){	this.vsl_eml              = vsl_eml             	;	}
	public void setPiclb_desc          ( String               piclb_desc           ){	this.piclb_desc           = piclb_desc          	;	}
	public void setRgst_port_cd        ( String               rgst_port_cd         ){	this.rgst_port_cd         = rgst_port_cd        	;	}
	public void setClss_no_rgst_area_nm( String               clss_no_rgst_area_nm ){	this.clss_no_rgst_area_nm = clss_no_rgst_area_nm	;	}
	public void setVsl_clss_no         ( String               vsl_clss_no          ){	this.vsl_clss_no          = vsl_clss_no         	;	}
	public void setVsl_bldr_nm         ( String               vsl_bldr_nm          ){	this.vsl_bldr_nm          = vsl_bldr_nm         	;	}
	public void setLoa_len             ( String               loa_len              ){	this.loa_len              = loa_len             	;	}
	public void setLbp_len             ( String               lbp_len              ){	this.lbp_len              = lbp_len             	;	}
	public void setVsl_wdt             ( String               vsl_wdt              ){	this.vsl_wdt              = vsl_wdt             	;	}
	public void setVsl_dpth            ( String               vsl_dpth             ){	this.vsl_dpth             = vsl_dpth            	;	}
	public void setSmr_drft_hgt        ( String               smr_drft_hgt         ){	this.smr_drft_hgt         = smr_drft_hgt        	;	}
	public void setDwt_wgt             ( String               dwt_wgt              ){	this.dwt_wgt              = dwt_wgt             	;	}
	public void setLgt_shp_tong_wgt    ( String               lgt_shp_tong_wgt     ){	this.lgt_shp_tong_wgt     = lgt_shp_tong_wgt    	;	}
	public void setGrs_rgst_tong_wgt   ( String               grs_rgst_tong_wgt    ){	this.grs_rgst_tong_wgt    = grs_rgst_tong_wgt   	;	}
	public void setNet_rgst_tong_wgt   ( String               net_rgst_tong_wgt    ){	this.net_rgst_tong_wgt    = net_rgst_tong_wgt   	;	}
	public void setPnm_gt_wgt          ( String               pnm_gt_wgt           ){	this.pnm_gt_wgt           = pnm_gt_wgt          	;	}
	public void setPnm_net_tong_wgt    ( String               pnm_net_tong_wgt     ){	this.pnm_net_tong_wgt     = pnm_net_tong_wgt    	;	}
	public void setSuz_gt_wgt          ( String               suz_gt_wgt           ){	this.suz_gt_wgt           = suz_gt_wgt          	;	}
	public void setSuz_net_tong_wgt    ( String               suz_net_tong_wgt     ){	this.suz_net_tong_wgt     = suz_net_tong_wgt    	;	}
	public void setMn_eng_mkr_nm       ( String               mn_eng_mkr_nm        ){	this.mn_eng_mkr_nm        = mn_eng_mkr_nm       	;	}
	public void setMn_eng_tp_cd        ( String               mn_eng_tp_cd         ){	this.mn_eng_tp_cd         = mn_eng_tp_cd        	;	}
	public void setMn_eng_bhp_pwr      ( String               mn_eng_bhp_pwr       ){	this.mn_eng_bhp_pwr       = mn_eng_bhp_pwr      	;	}
	public void setVsl_own_ind_cd      ( String               vsl_own_ind_cd       ){	this.vsl_own_ind_cd       = vsl_own_ind_cd      	;	}
	public void setVsl_rgst_cnt_cd     ( String               vsl_rgst_cnt_cd      ){	this.vsl_rgst_cnt_cd      = vsl_rgst_cnt_cd     	;	}
	public void setVsl_bld_cd          ( String               vsl_bld_cd           ){	this.vsl_bld_cd           = vsl_bld_cd          	;	}
	public void setCrr_cd              ( String               crr_cd               ){	this.crr_cd               = crr_cd              	;	}
	public void setFdr_div_cd          ( String               fdr_div_cd           ){	this.fdr_div_cd           = fdr_div_cd          	;	}
	public void setVsl_svc_spd         ( String               vsl_svc_spd          ){	this.vsl_svc_spd          = vsl_svc_spd         	;	}
	public void setMax_spd             ( String               max_spd              ){	this.max_spd              = max_spd             	;	}
	public void setEcn_spd             ( String               ecn_spd              ){	this.ecn_spd              = ecn_spd             	;	}
	public void setCrw_knt             ( String               crw_knt              ){	this.crw_knt              = crw_knt             	;	}
	public void setCntr_dzn_capa       ( String               cntr_dzn_capa        ){	this.cntr_dzn_capa        = cntr_dzn_capa       	;	}
	public void setCntr_op_capa        ( String               cntr_op_capa         ){	this.cntr_op_capa         = cntr_op_capa        	;	}
	public void setCntr_pnm_capa       ( String               cntr_pnm_capa        ){	this.cntr_pnm_capa        = cntr_pnm_capa       	;	}
	public void setCntr_vsl_clss_capa  ( String               cntr_vsl_clss_capa   ){	this.cntr_vsl_clss_capa   = cntr_vsl_clss_capa  	;	}
	public void setRf_rcpt_knt         ( String               rf_rcpt_knt          ){	this.rf_rcpt_knt          = rf_rcpt_knt         	;	}
	public void setRf_rcpt_max_knt     ( String               rf_rcpt_max_knt      ){	this.rf_rcpt_max_knt      = rf_rcpt_max_knt     	;	}
	public void setFbd_capa            ( String               fbd_capa             ){	this.fbd_capa             = fbd_capa            	;	}
	public void setDpl_capa            ( String               dpl_capa             ){	this.dpl_capa             = dpl_capa            	;	}
	public void setBlst_tnk_capa       ( String               blst_tnk_capa        ){	this.blst_tnk_capa        = blst_tnk_capa       	;	}
	public void setFoil_csm            ( String               foil_csm             ){	this.foil_csm             = foil_csm            	;	}
	public void setDoil_csm            ( String               doil_csm             ){	this.doil_csm             = doil_csm            	;	}
	public void setFrsh_wtr_csm        ( String               frsh_wtr_csm         ){	this.frsh_wtr_csm         = frsh_wtr_csm        	;	}
	public void setMn_eng_rpm_pwr      ( String               mn_eng_rpm_pwr       ){	this.mn_eng_rpm_pwr       = mn_eng_rpm_pwr      	;	}
	public void setGnr_rpm_pwr         ( String               gnr_rpm_pwr          ){	this.gnr_rpm_pwr          = gnr_rpm_pwr         	;	}
	public void setVsl_hgt             ( String               vsl_hgt              ){	this.vsl_hgt              = vsl_hgt             	;	}
	public void setRgst_dt             ( String               rgst_dt              ){	this.rgst_dt              = rgst_dt             	;	}
	public void setVsl_edi_nm          ( String               vsl_edi_nm           ){	this.vsl_edi_nm           = vsl_edi_nm          	;	}
	public void setCo_cd               ( String               co_cd                ){	this.co_cd                = co_cd               	;	}
	public void setVsl_clz_dt          ( String               vsl_clz_dt           ){	this.vsl_clz_dt           = vsl_clz_dt          	;	}
	public void setVsl_cre_ofc_cd      ( String               vsl_cre_ofc_cd       ){	this.vsl_cre_ofc_cd       = vsl_cre_ofc_cd      	;	}
	public void setVsl_delt_ofc_cd     ( String               vsl_delt_ofc_cd      ){	this.vsl_delt_ofc_cd      = vsl_delt_ofc_cd     	;	}
	public void setVsl_bld_cnt_cd      ( String               vsl_bld_cnt_cd       ){	this.vsl_bld_cnt_cd       = vsl_bld_cnt_cd      	;	}
	public void setGnr_mkr_nm          ( String               gnr_mkr_nm           ){	this.gnr_mkr_nm           = gnr_mkr_nm          	;	}
	public void setGnr_tp_cd           ( String               gnr_tp_cd            ){	this.gnr_tp_cd            = gnr_tp_cd           	;	}
	public void setGnr_bhp_pwr         ( String               gnr_bhp_pwr          ){	this.gnr_bhp_pwr          = gnr_bhp_pwr         	;	}
	public void setBwthst_mkr_nm       ( String               bwthst_mkr_nm        ){	this.bwthst_mkr_nm        = bwthst_mkr_nm       	;	}
	public void setBwthst_tp_cd        ( String               bwthst_tp_cd         ){	this.bwthst_tp_cd         = bwthst_tp_cd        	;	}
	public void setBwthst_bhp_pwr      ( String               bwthst_bhp_pwr       ){	this.bwthst_bhp_pwr       = bwthst_bhp_pwr      	;	}
	public void setBwthst_rpm_pwr      ( String               bwthst_rpm_pwr       ){	this.bwthst_rpm_pwr       = bwthst_rpm_pwr      	;	}
	public void setLloyd_no            ( String               lloyd_no             ){	this.lloyd_no             = lloyd_no            	;	}
	public void setVsl_lnch_dt         ( String               vsl_lnch_dt          ){	this.vsl_lnch_dt          = vsl_lnch_dt         	;	}
	public void setVsl_de_dt           ( String               vsl_de_dt            ){	this.vsl_de_dt            = vsl_de_dt           	;	}
	public void setVsl_kel_ly_dt       ( String               vsl_kel_ly_dt        ){	this.vsl_kel_ly_dt        = vsl_kel_ly_dt       	;	}
	public void setVsl_hl_no           ( String               vsl_hl_no            ){	this.vsl_hl_no            = vsl_hl_no           	;	}
	public void setTtl_teu_knt         ( String               ttl_teu_knt          ){	this.ttl_teu_knt          = ttl_teu_knt         	;	}
	public void setVsl_htch_knt        ( String               vsl_htch_knt         ){	this.vsl_htch_knt         = vsl_htch_knt        	;	}
	public void setVsl_hld_knt         ( String               vsl_hld_knt          ){	this.vsl_hld_knt          = vsl_hld_knt         	;	}
	public void setVsl_rmk             ( String               vsl_rmk              ){	this.vsl_rmk              = vsl_rmk             	;	}
	public void setCre_usr_id          ( String               cre_usr_id           ){	this.cre_usr_id           = cre_usr_id          	;	}
	public void setCre_dt              ( String               cre_dt               ){	this.cre_dt               = cre_dt              	;	}
	public void setUpd_usr_id          ( String               upd_usr_id           ){	this.upd_usr_id           = upd_usr_id          	;	}
	public void setUpd_dt              ( String               upd_dt               ){	this.upd_dt               = upd_dt              	;	}
	public void setDelt_flg            ( String               delt_flg             ){	this.delt_flg             = delt_flg            	;	}
	public void setEai_evnt_dt         ( String               eai_evnt_dt          ){	this.eai_evnt_dt          = eai_evnt_dt         	;	}
	public void setVsl_bld_area_nm (	String			vsl_bld_area_nm 	){	this.vsl_bld_area_nm  = vsl_bld_area_nm		;	}

	public static MdmVslCntr fromRequest(HttpServletRequest request) {
		MdmVslCntr model = new MdmVslCntr();
		try {
			model.setIbflag              	(JSPUtil.getParameter(request, "ibflag              		".trim(), ""));
			model.setPage_rows           	(JSPUtil.getParameter(request, "page_rows           		".trim(), ""));
			model.setVsl_cd              	(JSPUtil.getParameter(request, "vsl_cd              		".trim(), ""));
			model.setVsl_clss_cd        	(JSPUtil.getParameter(request, "vsl_clss_cd        			".trim(), ""));
			model.setVsl_eng_nm          	(JSPUtil.getParameter(request, "vsl_eng_nm          		".trim(), ""));
			model.setVsl_krn_nm          	(JSPUtil.getParameter(request, "vsl_krn_nm          		".trim(), ""));
			model.setFoil_capa           	(JSPUtil.getParameter(request, "foil_capa           		".trim(), ""));
			model.setDoil_capa           	(JSPUtil.getParameter(request, "doil_capa           		".trim(), ""));
			model.setFrsh_wtr_capa       	(JSPUtil.getParameter(request, "frsh_wtr_capa       		".trim(), ""));
			model.setCall_sgn_no         	(JSPUtil.getParameter(request, "call_sgn_no         		".trim(), ""));
			model.setRgst_no             	(JSPUtil.getParameter(request, "rgst_no             		".trim(), ""));
			model.setPhn_no              	(JSPUtil.getParameter(request, "phn_no              		".trim(), ""));
			model.setFax_no              	(JSPUtil.getParameter(request, "fax_no              		".trim(), ""));
			model.setTlx_no              	(JSPUtil.getParameter(request, "tlx_no              		".trim(), ""));
			model.setVsl_eml             	(JSPUtil.getParameter(request, "vsl_eml             		".trim(), ""));
			model.setPiclb_desc          	(JSPUtil.getParameter(request, "piclb_desc          		".trim(), ""));
			model.setRgst_port_cd        	(JSPUtil.getParameter(request, "rgst_port_cd        		".trim(), ""));
			model.setClss_no_rgst_area_nm	(JSPUtil.getParameter(request, "clss_no_rgst_area_nm		".trim(), ""));
			model.setVsl_clss_no         	(JSPUtil.getParameter(request, "vsl_clss_no         		".trim(), ""));
			model.setVsl_bldr_nm         	(JSPUtil.getParameter(request, "vsl_bldr_nm         		".trim(), ""));
			model.setLoa_len             	(JSPUtil.getParameter(request, "loa_len             		".trim(), ""));
			model.setLbp_len             	(JSPUtil.getParameter(request, "lbp_len             		".trim(), ""));
			model.setVsl_wdt             	(JSPUtil.getParameter(request, "vsl_wdt             		".trim(), ""));
			model.setVsl_dpth            	(JSPUtil.getParameter(request, "vsl_dpth            		".trim(), ""));
			model.setSmr_drft_hgt        	(JSPUtil.getParameter(request, "smr_drft_hgt        		".trim(), ""));
			model.setDwt_wgt             	(JSPUtil.getParameter(request, "dwt_wgt             		".trim(), ""));
			model.setLgt_shp_tong_wgt    	(JSPUtil.getParameter(request, "lgt_shp_tong_wgt    		".trim(), ""));
			model.setGrs_rgst_tong_wgt   	(JSPUtil.getParameter(request, "grs_rgst_tong_wgt   		".trim(), ""));
			model.setNet_rgst_tong_wgt   	(JSPUtil.getParameter(request, "net_rgst_tong_wgt   		".trim(), ""));
			model.setPnm_gt_wgt          	(JSPUtil.getParameter(request, "pnm_gt_wgt          		".trim(), ""));
			model.setPnm_net_tong_wgt    	(JSPUtil.getParameter(request, "pnm_net_tong_wgt    		".trim(), ""));
			model.setSuz_gt_wgt          	(JSPUtil.getParameter(request, "suz_gt_wgt          		".trim(), ""));
			model.setSuz_net_tong_wgt    	(JSPUtil.getParameter(request, "suz_net_tong_wgt    		".trim(), ""));
			model.setMn_eng_mkr_nm       	(JSPUtil.getParameter(request, "mn_eng_mkr_nm       		".trim(), ""));
			model.setMn_eng_tp_cd        	(JSPUtil.getParameter(request, "mn_eng_tp_cd        		".trim(), ""));
			model.setMn_eng_bhp_pwr      	(JSPUtil.getParameter(request, "mn_eng_bhp_pwr      		".trim(), ""));
			model.setVsl_own_ind_cd      	(JSPUtil.getParameter(request, "vsl_own_ind_cd      		".trim(), ""));
			model.setVsl_rgst_cnt_cd     	(JSPUtil.getParameter(request, "vsl_rgst_cnt_cd     		".trim(), ""));
			model.setVsl_bld_cd          	(JSPUtil.getParameter(request, "vsl_bld_cd          		".trim(), ""));
			model.setCrr_cd              	(JSPUtil.getParameter(request, "crr_cd              		".trim(), ""));
			model.setFdr_div_cd          	(JSPUtil.getParameter(request, "fdr_div_cd          		".trim(), ""));
			model.setVsl_svc_spd         	(JSPUtil.getParameter(request, "vsl_svc_spd         		".trim(), ""));
			model.setMax_spd             	(JSPUtil.getParameter(request, "max_spd             		".trim(), ""));
			model.setEcn_spd             	(JSPUtil.getParameter(request, "ecn_spd             		".trim(), ""));
			model.setCrw_knt             	(JSPUtil.getParameter(request, "crw_knt             		".trim(), ""));
			model.setCntr_dzn_capa       	(JSPUtil.getParameter(request, "cntr_dzn_capa       		".trim(), ""));
			model.setCntr_op_capa        	(JSPUtil.getParameter(request, "cntr_op_capa        		".trim(), ""));
			model.setCntr_pnm_capa       	(JSPUtil.getParameter(request, "cntr_pnm_capa       		".trim(), ""));
			model.setCntr_vsl_clss_capa  	(JSPUtil.getParameter(request, "cntr_vsl_clss_capa  		".trim(), ""));
			model.setRf_rcpt_knt         	(JSPUtil.getParameter(request, "rf_rcpt_knt         		".trim(), ""));
			model.setRf_rcpt_max_knt     	(JSPUtil.getParameter(request, "rf_rcpt_max_knt     		".trim(), ""));
			model.setFbd_capa            	(JSPUtil.getParameter(request, "fbd_capa            		".trim(), ""));
			model.setDpl_capa            	(JSPUtil.getParameter(request, "dpl_capa            		".trim(), ""));
			model.setBlst_tnk_capa       	(JSPUtil.getParameter(request, "blst_tnk_capa       		".trim(), ""));
			model.setFoil_csm            	(JSPUtil.getParameter(request, "foil_csm            		".trim(), ""));
			model.setDoil_csm            	(JSPUtil.getParameter(request, "doil_csm            		".trim(), ""));
			model.setFrsh_wtr_csm        	(JSPUtil.getParameter(request, "frsh_wtr_csm        		".trim(), ""));
			model.setMn_eng_rpm_pwr      	(JSPUtil.getParameter(request, "mn_eng_rpm_pwr      		".trim(), ""));
			model.setGnr_rpm_pwr         	(JSPUtil.getParameter(request, "gnr_rpm_pwr         		".trim(), ""));
			model.setVsl_hgt             	(JSPUtil.getParameter(request, "vsl_hgt             		".trim(), ""));
			model.setRgst_dt             	(JSPUtil.getParameter(request, "rgst_dt             		".trim(), ""));
			model.setVsl_edi_nm          	(JSPUtil.getParameter(request, "vsl_edi_nm          		".trim(), ""));
			model.setCo_cd               	(JSPUtil.getParameter(request, "co_cd               		".trim(), ""));
			model.setVsl_clz_dt          	(JSPUtil.getParameter(request, "vsl_clz_dt          		".trim(), ""));
			model.setVsl_cre_ofc_cd      	(JSPUtil.getParameter(request, "vsl_cre_ofc_cd      		".trim(), ""));
			model.setVsl_delt_ofc_cd     	(JSPUtil.getParameter(request, "vsl_delt_ofc_cd     		".trim(), ""));
			model.setVsl_bld_cnt_cd      	(JSPUtil.getParameter(request, "vsl_bld_cnt_cd      		".trim(), ""));
			model.setGnr_mkr_nm          	(JSPUtil.getParameter(request, "gnr_mkr_nm          		".trim(), ""));
			model.setGnr_tp_cd           	(JSPUtil.getParameter(request, "gnr_tp_cd           		".trim(), ""));
			model.setGnr_bhp_pwr         	(JSPUtil.getParameter(request, "gnr_bhp_pwr         		".trim(), ""));
			model.setBwthst_mkr_nm       	(JSPUtil.getParameter(request, "bwthst_mkr_nm       		".trim(), ""));
			model.setBwthst_tp_cd        	(JSPUtil.getParameter(request, "bwthst_tp_cd        		".trim(), ""));
			model.setBwthst_bhp_pwr      	(JSPUtil.getParameter(request, "bwthst_bhp_pwr      		".trim(), ""));
			model.setBwthst_rpm_pwr      	(JSPUtil.getParameter(request, "bwthst_rpm_pwr      		".trim(), ""));
			model.setLloyd_no            	(JSPUtil.getParameter(request, "lloyd_no            		".trim(), ""));
			model.setVsl_lnch_dt         	(JSPUtil.getParameter(request, "vsl_lnch_dt         		".trim(), ""));
			model.setVsl_de_dt           	(JSPUtil.getParameter(request, "vsl_de_dt           		".trim(), ""));
			model.setVsl_kel_ly_dt       	(JSPUtil.getParameter(request, "vsl_kel_ly_dt       		".trim(), ""));
			model.setVsl_hl_no           	(JSPUtil.getParameter(request, "vsl_hl_no           		".trim(), ""));
			model.setTtl_teu_knt         	(JSPUtil.getParameter(request, "ttl_teu_knt         		".trim(), ""));
			model.setVsl_htch_knt        	(JSPUtil.getParameter(request, "vsl_htch_knt        		".trim(), ""));
			model.setVsl_hld_knt         	(JSPUtil.getParameter(request, "vsl_hld_knt         		".trim(), ""));
			model.setVsl_rmk             	(JSPUtil.getParameter(request, "vsl_rmk             		".trim(), ""));
			model.setCre_usr_id          	(JSPUtil.getParameter(request, "cre_usr_id          		".trim(), ""));
			model.setCre_dt              	(JSPUtil.getParameter(request, "cre_dt              		".trim(), ""));
			model.setUpd_usr_id          	(JSPUtil.getParameter(request, "upd_usr_id          		".trim(), ""));
			model.setUpd_dt              	(JSPUtil.getParameter(request, "upd_dt              		".trim(), ""));
			model.setDelt_flg            	(JSPUtil.getParameter(request, "delt_flg            		".trim(), ""));
			model.setEai_evnt_dt         	(JSPUtil.getParameter(request, "eai_evnt_dt         		".trim(), ""));
			model.setVsl_bld_area_nm		(JSPUtil.getParameter(request, "vsl_bld_area_nm".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		MdmVslCntr model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag               =  (JSPUtil.getParameter(request, "ibflag              		".trim(), length));
			String[] page_rows            =  (JSPUtil.getParameter(request, "page_rows           		".trim(), length));
			String[] vsl_cd               =  (JSPUtil.getParameter(request, "vsl_cd              		".trim(), length));
			String[] vsl_clss_cd          =  (JSPUtil.getParameter(request, "vsl_clss_cd        		".trim(), length));
			String[] vsl_eng_nm           =  (JSPUtil.getParameter(request, "vsl_eng_nm          		".trim(), length));
			String[] vsl_krn_nm           =  (JSPUtil.getParameter(request, "vsl_krn_nm          		".trim(), length));
			String[] foil_capa            =  (JSPUtil.getParameter(request, "foil_capa           		".trim(), length));
			String[] doil_capa            =  (JSPUtil.getParameter(request, "doil_capa           		".trim(), length));
			String[] frsh_wtr_capa        =  (JSPUtil.getParameter(request, "frsh_wtr_capa       		".trim(), length));
			String[] call_sgn_no          =  (JSPUtil.getParameter(request, "call_sgn_no         		".trim(), length));
			String[] rgst_no              =  (JSPUtil.getParameter(request, "rgst_no             		".trim(), length));
			String[] phn_no               =  (JSPUtil.getParameter(request, "phn_no              		".trim(), length));
			String[] fax_no               =  (JSPUtil.getParameter(request, "fax_no              		".trim(), length));
			String[] tlx_no               =  (JSPUtil.getParameter(request, "tlx_no              		".trim(), length));
			String[] vsl_eml              =  (JSPUtil.getParameter(request, "vsl_eml             		".trim(), length));
			String[] piclb_desc           =  (JSPUtil.getParameter(request, "piclb_desc          		".trim(), length));
			String[] rgst_port_cd         =  (JSPUtil.getParameter(request, "rgst_port_cd        		".trim(), length));
			String[] clss_no_rgst_area_nm =  (JSPUtil.getParameter(request, "clss_no_rgst_area_nm		".trim(), length));
			String[] vsl_clss_no          =  (JSPUtil.getParameter(request, "vsl_clss_no         		".trim(), length));
			String[] vsl_bldr_nm          =  (JSPUtil.getParameter(request, "vsl_bldr_nm         		".trim(), length));
			String[] loa_len              =  (JSPUtil.getParameter(request, "loa_len             		".trim(), length));
			String[] lbp_len              =  (JSPUtil.getParameter(request, "lbp_len             		".trim(), length));
			String[] vsl_wdt              =  (JSPUtil.getParameter(request, "vsl_wdt             		".trim(), length));
			String[] vsl_dpth             =  (JSPUtil.getParameter(request, "vsl_dpth            		".trim(), length));
			String[] smr_drft_hgt         =  (JSPUtil.getParameter(request, "smr_drft_hgt        		".trim(), length));
			String[] dwt_wgt              =  (JSPUtil.getParameter(request, "dwt_wgt             		".trim(), length));
			String[] lgt_shp_tong_wgt     =  (JSPUtil.getParameter(request, "lgt_shp_tong_wgt    		".trim(), length));
			String[] grs_rgst_tong_wgt    =  (JSPUtil.getParameter(request, "grs_rgst_tong_wgt   		".trim(), length));
			String[] net_rgst_tong_wgt    =  (JSPUtil.getParameter(request, "net_rgst_tong_wgt   		".trim(), length));
			String[] pnm_gt_wgt           =  (JSPUtil.getParameter(request, "pnm_gt_wgt          		".trim(), length));
			String[] pnm_net_tong_wgt     =  (JSPUtil.getParameter(request, "pnm_net_tong_wgt    		".trim(), length));
			String[] suz_gt_wgt           =  (JSPUtil.getParameter(request, "suz_gt_wgt          		".trim(), length));
			String[] suz_net_tong_wgt     =  (JSPUtil.getParameter(request, "suz_net_tong_wgt    		".trim(), length));
			String[] mn_eng_mkr_nm        =  (JSPUtil.getParameter(request, "mn_eng_mkr_nm       		".trim(), length));
			String[] mn_eng_tp_cd         =  (JSPUtil.getParameter(request, "mn_eng_tp_cd        		".trim(), length));
			String[] mn_eng_bhp_pwr       =  (JSPUtil.getParameter(request, "mn_eng_bhp_pwr      		".trim(), length));
			String[] vsl_own_ind_cd       =  (JSPUtil.getParameter(request, "vsl_own_ind_cd      		".trim(), length));
			String[] vsl_rgst_cnt_cd      =  (JSPUtil.getParameter(request, "vsl_rgst_cnt_cd     		".trim(), length));
			String[] vsl_bld_cd           =  (JSPUtil.getParameter(request, "vsl_bld_cd          		".trim(), length));
			String[] crr_cd               =  (JSPUtil.getParameter(request, "crr_cd              		".trim(), length));
			String[] fdr_div_cd           =  (JSPUtil.getParameter(request, "fdr_div_cd          		".trim(), length));
			String[] vsl_svc_spd          =  (JSPUtil.getParameter(request, "vsl_svc_spd         		".trim(), length));
			String[] max_spd              =  (JSPUtil.getParameter(request, "max_spd             		".trim(), length));
			String[] ecn_spd              =  (JSPUtil.getParameter(request, "ecn_spd             		".trim(), length));
			String[] crw_knt              =  (JSPUtil.getParameter(request, "crw_knt             		".trim(), length));
			String[] cntr_dzn_capa        =  (JSPUtil.getParameter(request, "cntr_dzn_capa       		".trim(), length));
			String[] cntr_op_capa         =  (JSPUtil.getParameter(request, "cntr_op_capa        		".trim(), length));
			String[] cntr_pnm_capa        =  (JSPUtil.getParameter(request, "cntr_pnm_capa       		".trim(), length));
			String[] cntr_vsl_clss_capa   =  (JSPUtil.getParameter(request, "cntr_vsl_clss_capa  		".trim(), length));
			String[] rf_rcpt_knt          =  (JSPUtil.getParameter(request, "rf_rcpt_knt         		".trim(), length));
			String[] rf_rcpt_max_knt      =  (JSPUtil.getParameter(request, "rf_rcpt_max_knt     		".trim(), length));
			String[] fbd_capa             =  (JSPUtil.getParameter(request, "fbd_capa            		".trim(), length));
			String[] dpl_capa             =  (JSPUtil.getParameter(request, "dpl_capa            		".trim(), length));
			String[] blst_tnk_capa        =  (JSPUtil.getParameter(request, "blst_tnk_capa       		".trim(), length));
			String[] foil_csm             =  (JSPUtil.getParameter(request, "foil_csm            		".trim(), length));
			String[] doil_csm             =  (JSPUtil.getParameter(request, "doil_csm            		".trim(), length));
			String[] frsh_wtr_csm         =  (JSPUtil.getParameter(request, "frsh_wtr_csm        		".trim(), length));
			String[] mn_eng_rpm_pwr       =  (JSPUtil.getParameter(request, "mn_eng_rpm_pwr      		".trim(), length));
			String[] gnr_rpm_pwr          =  (JSPUtil.getParameter(request, "gnr_rpm_pwr         		".trim(), length));
			String[] vsl_hgt              =  (JSPUtil.getParameter(request, "vsl_hgt             		".trim(), length));
			String[] rgst_dt              =  (JSPUtil.getParameter(request, "rgst_dt             		".trim(), length));
			String[] vsl_edi_nm           =  (JSPUtil.getParameter(request, "vsl_edi_nm          		".trim(), length));
			String[] co_cd                =  (JSPUtil.getParameter(request, "co_cd               		".trim(), length));
			String[] vsl_clz_dt           =  (JSPUtil.getParameter(request, "vsl_clz_dt          		".trim(), length));
			String[] vsl_cre_ofc_cd       =  (JSPUtil.getParameter(request, "vsl_cre_ofc_cd      		".trim(), length));
			String[] vsl_delt_ofc_cd      =  (JSPUtil.getParameter(request, "vsl_delt_ofc_cd     		".trim(), length));
			String[] vsl_bld_cnt_cd       =  (JSPUtil.getParameter(request, "vsl_bld_cnt_cd      		".trim(), length));
			String[] gnr_mkr_nm           =  (JSPUtil.getParameter(request, "gnr_mkr_nm          		".trim(), length));
			String[] gnr_tp_cd            =  (JSPUtil.getParameter(request, "gnr_tp_cd           		".trim(), length));
			String[] gnr_bhp_pwr          =  (JSPUtil.getParameter(request, "gnr_bhp_pwr         		".trim(), length));
			String[] bwthst_mkr_nm        =  (JSPUtil.getParameter(request, "bwthst_mkr_nm       		".trim(), length));
			String[] bwthst_tp_cd         =  (JSPUtil.getParameter(request, "bwthst_tp_cd        		".trim(), length));
			String[] bwthst_bhp_pwr       =  (JSPUtil.getParameter(request, "bwthst_bhp_pwr      		".trim(), length));
			String[] bwthst_rpm_pwr       =  (JSPUtil.getParameter(request, "bwthst_rpm_pwr      		".trim(), length));
			String[] lloyd_no             =  (JSPUtil.getParameter(request, "lloyd_no            		".trim(), length));
			String[] vsl_lnch_dt          =  (JSPUtil.getParameter(request, "vsl_lnch_dt         		".trim(), length));
			String[] vsl_de_dt            =  (JSPUtil.getParameter(request, "vsl_de_dt           		".trim(), length));
			String[] vsl_kel_ly_dt        =  (JSPUtil.getParameter(request, "vsl_kel_ly_dt       		".trim(), length));
			String[] vsl_hl_no            =  (JSPUtil.getParameter(request, "vsl_hl_no           		".trim(), length));
			String[] ttl_teu_knt          =  (JSPUtil.getParameter(request, "ttl_teu_knt         		".trim(), length));
			String[] vsl_htch_knt         =  (JSPUtil.getParameter(request, "vsl_htch_knt        		".trim(), length));
			String[] vsl_hld_knt          =  (JSPUtil.getParameter(request, "vsl_hld_knt         		".trim(), length));
			String[] vsl_rmk              =  (JSPUtil.getParameter(request, "vsl_rmk             		".trim(), length));
			String[] cre_usr_id           =  (JSPUtil.getParameter(request, "cre_usr_id          		".trim(), length));
			String[] cre_dt               =  (JSPUtil.getParameter(request, "cre_dt              		".trim(), length));
			String[] upd_usr_id           =  (JSPUtil.getParameter(request, "upd_usr_id          		".trim(), length));
			String[] upd_dt               =  (JSPUtil.getParameter(request, "upd_dt              		".trim(), length));
			String[] delt_flg             =  (JSPUtil.getParameter(request, "delt_flg            		".trim(), length));
			String[] eai_evnt_dt          =  (JSPUtil.getParameter(request, "eai_evnt_dt         		".trim(), length));
			String[] vsl_bld_area_nm		= (JSPUtil.getParameter(request, "vsl_bld_area_nm		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new MdmVslCntr();
				model.setIbflag              		  (ibflag              	[i]);
				model.setPage_rows           		  (page_rows           	[i]);
				model.setVsl_cd              		  (vsl_cd              	[i]);
				model.setVsl_clss_cd        		  (vsl_clss_cd        	[i]);
				model.setVsl_eng_nm          		  (vsl_eng_nm          	[i]);
				model.setVsl_krn_nm          		  (vsl_krn_nm          	[i]);
				model.setFoil_capa           		  (foil_capa           	[i]);
				model.setDoil_capa           		  (doil_capa           	[i]);
				model.setFrsh_wtr_capa       		  (frsh_wtr_capa       	[i]);
				model.setCall_sgn_no         		  (call_sgn_no         	[i]);
				model.setRgst_no             		  (rgst_no             	[i]);
				model.setPhn_no              		  (phn_no              	[i]);
				model.setFax_no              		  (fax_no              	[i]);
				model.setTlx_no              		  (tlx_no              	[i]);
				model.setVsl_eml             		  (vsl_eml             	[i]);
				model.setPiclb_desc          		  (piclb_desc          	[i]);
				model.setRgst_port_cd        		  (rgst_port_cd        	[i]);
				model.setClss_no_rgst_area_nm		  (clss_no_rgst_area_nm	[i]);
				model.setVsl_clss_no         		  (vsl_clss_no         	[i]);
				model.setVsl_bldr_nm         		  (vsl_bldr_nm         	[i]);
				model.setLoa_len             		  (loa_len             	[i]);
				model.setLbp_len             		  (lbp_len             	[i]);
				model.setVsl_wdt             		  (vsl_wdt             	[i]);
				model.setVsl_dpth            		  (vsl_dpth            	[i]);
				model.setSmr_drft_hgt        		  (smr_drft_hgt        	[i]);
				model.setDwt_wgt             		  (dwt_wgt             	[i]);
				model.setLgt_shp_tong_wgt    		  (lgt_shp_tong_wgt    	[i]);
				model.setGrs_rgst_tong_wgt   		  (grs_rgst_tong_wgt   	[i]);
				model.setNet_rgst_tong_wgt   		  (net_rgst_tong_wgt   	[i]);
				model.setPnm_gt_wgt          		  (pnm_gt_wgt          	[i]);
				model.setPnm_net_tong_wgt    		  (pnm_net_tong_wgt    	[i]);
				model.setSuz_gt_wgt          		  (suz_gt_wgt          	[i]);
				model.setSuz_net_tong_wgt    		  (suz_net_tong_wgt    	[i]);
				model.setMn_eng_mkr_nm       		  (mn_eng_mkr_nm       	[i]);
				model.setMn_eng_tp_cd        		  (mn_eng_tp_cd        	[i]);
				model.setMn_eng_bhp_pwr      		  (mn_eng_bhp_pwr      	[i]);
				model.setVsl_own_ind_cd      		  (vsl_own_ind_cd      	[i]);
				model.setVsl_rgst_cnt_cd     		  (vsl_rgst_cnt_cd     	[i]);
				model.setVsl_bld_cd          		  (vsl_bld_cd          	[i]);
				model.setCrr_cd              		  (crr_cd              	[i]);
				model.setFdr_div_cd          		  (fdr_div_cd          	[i]);
				model.setVsl_svc_spd         		  (vsl_svc_spd         	[i]);
				model.setMax_spd             		  (max_spd             	[i]);
				model.setEcn_spd             		  (ecn_spd             	[i]);
				model.setCrw_knt             		  (crw_knt             	[i]);
				model.setCntr_dzn_capa       		  (cntr_dzn_capa       	[i]);
				model.setCntr_op_capa        		  (cntr_op_capa        	[i]);
				model.setCntr_pnm_capa       		  (cntr_pnm_capa       	[i]);
				model.setCntr_vsl_clss_capa  		  (cntr_vsl_clss_capa  	[i]);
				model.setRf_rcpt_knt         		  (rf_rcpt_knt         	[i]);
				model.setRf_rcpt_max_knt     		  (rf_rcpt_max_knt     	[i]);
				model.setFbd_capa            		  (fbd_capa            	[i]);
				model.setDpl_capa            		  (dpl_capa            	[i]);
				model.setBlst_tnk_capa       		  (blst_tnk_capa       	[i]);
				model.setFoil_csm            		  (foil_csm            	[i]);
				model.setDoil_csm            		  (doil_csm            	[i]);
				model.setFrsh_wtr_csm        		  (frsh_wtr_csm        	[i]);
				model.setMn_eng_rpm_pwr      		  (mn_eng_rpm_pwr      	[i]);
				model.setGnr_rpm_pwr         		  (gnr_rpm_pwr         	[i]);
				model.setVsl_hgt             		  (vsl_hgt             	[i]);
				model.setRgst_dt             		  (rgst_dt             	[i]);
				model.setVsl_edi_nm          		  (vsl_edi_nm          	[i]);
				model.setCo_cd               		  (co_cd               	[i]);
				model.setVsl_clz_dt          		  (vsl_clz_dt          	[i]);
				model.setVsl_cre_ofc_cd      		  (vsl_cre_ofc_cd      	[i]);
				model.setVsl_delt_ofc_cd     		  (vsl_delt_ofc_cd     	[i]);
				model.setVsl_bld_cnt_cd      		  (vsl_bld_cnt_cd      	[i]);
				model.setGnr_mkr_nm          		  (gnr_mkr_nm          	[i]);
				model.setGnr_tp_cd           		  (gnr_tp_cd           	[i]);
				model.setGnr_bhp_pwr         		  (gnr_bhp_pwr         	[i]);
				model.setBwthst_mkr_nm       		  (bwthst_mkr_nm       	[i]);
				model.setBwthst_tp_cd        		  (bwthst_tp_cd        	[i]);
				model.setBwthst_bhp_pwr      		  (bwthst_bhp_pwr      	[i]);
				model.setBwthst_rpm_pwr      		  (bwthst_rpm_pwr      	[i]);
				model.setLloyd_no            		  (lloyd_no            	[i]);
				model.setVsl_lnch_dt         		  (vsl_lnch_dt         	[i]);
				model.setVsl_de_dt           		  (vsl_de_dt           	[i]);
				model.setVsl_kel_ly_dt       		  (vsl_kel_ly_dt       	[i]);
				model.setVsl_hl_no           		  (vsl_hl_no           	[i]);
				model.setTtl_teu_knt         		  (ttl_teu_knt         	[i]);
				model.setVsl_htch_knt        		  (vsl_htch_knt        	[i]);
				model.setVsl_hld_knt         		  (vsl_hld_knt         	[i]);
				model.setVsl_rmk             		  (vsl_rmk             	[i]);
				model.setCre_usr_id          		  (cre_usr_id          	[i]);
				model.setCre_dt              		  (cre_dt              	[i]);
				model.setUpd_usr_id          		  (upd_usr_id          	[i]);
				model.setUpd_dt              		  (upd_dt              	[i]);
				model.setDelt_flg            		  (delt_flg            	[i]);
				model.setEai_evnt_dt         		  (eai_evnt_dt         	[i]);
				model.setVsl_bld_area_nm			(vsl_bld_area_nm		[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		MdmVslCntr model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag               =  (JSPUtil.getParameter(request, prefix + "ibflag              		".trim(), length));
			String[] page_rows            =  (JSPUtil.getParameter(request, prefix + "page_rows           		".trim(), length));
			String[] vsl_cd               =  (JSPUtil.getParameter(request, prefix + "vsl_cd              		".trim(), length));
			String[] vsl_clss_cd          =  (JSPUtil.getParameter(request, prefix + "vsl_clss_cd        		".trim(), length));
			String[] vsl_eng_nm           =  (JSPUtil.getParameter(request, prefix + "vsl_eng_nm          		".trim(), length));
			String[] vsl_krn_nm           =  (JSPUtil.getParameter(request, prefix + "vsl_krn_nm          		".trim(), length));
			String[] foil_capa            =  (JSPUtil.getParameter(request, prefix + "foil_capa           		".trim(), length));
			String[] doil_capa            =  (JSPUtil.getParameter(request, prefix + "doil_capa           		".trim(), length));
			String[] frsh_wtr_capa        =  (JSPUtil.getParameter(request, prefix + "frsh_wtr_capa       		".trim(), length));
			String[] call_sgn_no          =  (JSPUtil.getParameter(request, prefix + "call_sgn_no         		".trim(), length));
			String[] rgst_no              =  (JSPUtil.getParameter(request, prefix + "rgst_no             		".trim(), length));
			String[] phn_no               =  (JSPUtil.getParameter(request, prefix + "phn_no              		".trim(), length));
			String[] fax_no               =  (JSPUtil.getParameter(request, prefix + "fax_no              		".trim(), length));
			String[] tlx_no               =  (JSPUtil.getParameter(request, prefix + "tlx_no              		".trim(), length));
			String[] vsl_eml              =  (JSPUtil.getParameter(request, prefix + "vsl_eml             		".trim(), length));
			String[] piclb_desc           =  (JSPUtil.getParameter(request, prefix + "piclb_desc          		".trim(), length));
			String[] rgst_port_cd         =  (JSPUtil.getParameter(request, prefix + "rgst_port_cd        		".trim(), length));
			String[] clss_no_rgst_area_nm =  (JSPUtil.getParameter(request, prefix + "clss_no_rgst_area_nm		".trim(), length));
			String[] vsl_clss_no          =  (JSPUtil.getParameter(request, prefix + "vsl_clss_no         		".trim(), length));
			String[] vsl_bldr_nm          =  (JSPUtil.getParameter(request, prefix + "vsl_bldr_nm         		".trim(), length));
			String[] loa_len              =  (JSPUtil.getParameter(request, prefix + "loa_len             		".trim(), length));
			String[] lbp_len              =  (JSPUtil.getParameter(request, prefix + "lbp_len             		".trim(), length));
			String[] vsl_wdt              =  (JSPUtil.getParameter(request, prefix + "vsl_wdt             		".trim(), length));
			String[] vsl_dpth             =  (JSPUtil.getParameter(request, prefix + "vsl_dpth            		".trim(), length));
			String[] smr_drft_hgt         =  (JSPUtil.getParameter(request, prefix + "smr_drft_hgt        		".trim(), length));
			String[] dwt_wgt              =  (JSPUtil.getParameter(request, prefix + "dwt_wgt             		".trim(), length));
			String[] lgt_shp_tong_wgt     =  (JSPUtil.getParameter(request, prefix + "lgt_shp_tong_wgt    		".trim(), length));
			String[] grs_rgst_tong_wgt    =  (JSPUtil.getParameter(request, prefix + "grs_rgst_tong_wgt   		".trim(), length));
			String[] net_rgst_tong_wgt    =  (JSPUtil.getParameter(request, prefix + "net_rgst_tong_wgt   		".trim(), length));
			String[] pnm_gt_wgt           =  (JSPUtil.getParameter(request, prefix + "pnm_gt_wgt          		".trim(), length));
			String[] pnm_net_tong_wgt     =  (JSPUtil.getParameter(request, prefix + "pnm_net_tong_wgt    		".trim(), length));
			String[] suz_gt_wgt           =  (JSPUtil.getParameter(request, prefix + "suz_gt_wgt          		".trim(), length));
			String[] suz_net_tong_wgt     =  (JSPUtil.getParameter(request, prefix + "suz_net_tong_wgt    		".trim(), length));
			String[] mn_eng_mkr_nm        =  (JSPUtil.getParameter(request, prefix + "mn_eng_mkr_nm       		".trim(), length));
			String[] mn_eng_tp_cd         =  (JSPUtil.getParameter(request, prefix + "mn_eng_tp_cd        		".trim(), length));
			String[] mn_eng_bhp_pwr       =  (JSPUtil.getParameter(request, prefix + "mn_eng_bhp_pwr      		".trim(), length));
			String[] vsl_own_ind_cd       =  (JSPUtil.getParameter(request, prefix + "vsl_own_ind_cd      		".trim(), length));
			String[] vsl_rgst_cnt_cd      =  (JSPUtil.getParameter(request, prefix + "vsl_rgst_cnt_cd     		".trim(), length));
			String[] vsl_bld_cd           =  (JSPUtil.getParameter(request, prefix + "vsl_bld_cd          		".trim(), length));
			String[] crr_cd               =  (JSPUtil.getParameter(request, prefix + "crr_cd              		".trim(), length));
			String[] fdr_div_cd           =  (JSPUtil.getParameter(request, prefix + "fdr_div_cd          		".trim(), length));
			String[] vsl_svc_spd          =  (JSPUtil.getParameter(request, prefix + "vsl_svc_spd         		".trim(), length));
			String[] max_spd              =  (JSPUtil.getParameter(request, prefix + "max_spd             		".trim(), length));
			String[] ecn_spd              =  (JSPUtil.getParameter(request, prefix + "ecn_spd             		".trim(), length));
			String[] crw_knt              =  (JSPUtil.getParameter(request, prefix + "crw_knt             		".trim(), length));
			String[] cntr_dzn_capa        =  (JSPUtil.getParameter(request, prefix + "cntr_dzn_capa       		".trim(), length));
			String[] cntr_op_capa         =  (JSPUtil.getParameter(request, prefix + "cntr_op_capa        		".trim(), length));
			String[] cntr_pnm_capa        =  (JSPUtil.getParameter(request, prefix + "cntr_pnm_capa       		".trim(), length));
			String[] cntr_vsl_clss_capa   =  (JSPUtil.getParameter(request, prefix + "cntr_vsl_clss_capa  		".trim(), length));
			String[] rf_rcpt_knt          =  (JSPUtil.getParameter(request, prefix + "rf_rcpt_knt         		".trim(), length));
			String[] rf_rcpt_max_knt      =  (JSPUtil.getParameter(request, prefix + "rf_rcpt_max_knt     		".trim(), length));
			String[] fbd_capa             =  (JSPUtil.getParameter(request, prefix + "fbd_capa            		".trim(), length));
			String[] dpl_capa             =  (JSPUtil.getParameter(request, prefix + "dpl_capa            		".trim(), length));
			String[] blst_tnk_capa        =  (JSPUtil.getParameter(request, prefix + "blst_tnk_capa       		".trim(), length));
			String[] foil_csm             =  (JSPUtil.getParameter(request, prefix + "foil_csm            		".trim(), length));
			String[] doil_csm             =  (JSPUtil.getParameter(request, prefix + "doil_csm            		".trim(), length));
			String[] frsh_wtr_csm         =  (JSPUtil.getParameter(request, prefix + "frsh_wtr_csm        		".trim(), length));
			String[] mn_eng_rpm_pwr       =  (JSPUtil.getParameter(request, prefix + "mn_eng_rpm_pwr      		".trim(), length));
			String[] gnr_rpm_pwr          =  (JSPUtil.getParameter(request, prefix + "gnr_rpm_pwr         		".trim(), length));
			String[] vsl_hgt              =  (JSPUtil.getParameter(request, prefix + "vsl_hgt             		".trim(), length));
			String[] rgst_dt              =  (JSPUtil.getParameter(request, prefix + "rgst_dt             		".trim(), length));
			String[] vsl_edi_nm           =  (JSPUtil.getParameter(request, prefix + "vsl_edi_nm          		".trim(), length));
			String[] co_cd                =  (JSPUtil.getParameter(request, prefix + "co_cd               		".trim(), length));
			String[] vsl_clz_dt           =  (JSPUtil.getParameter(request, prefix + "vsl_clz_dt          		".trim(), length));
			String[] vsl_cre_ofc_cd       =  (JSPUtil.getParameter(request, prefix + "vsl_cre_ofc_cd      		".trim(), length));
			String[] vsl_delt_ofc_cd      =  (JSPUtil.getParameter(request, prefix + "vsl_delt_ofc_cd     		".trim(), length));
			String[] vsl_bld_cnt_cd       =  (JSPUtil.getParameter(request, prefix + "vsl_bld_cnt_cd      		".trim(), length));
			String[] gnr_mkr_nm           =  (JSPUtil.getParameter(request, prefix + "gnr_mkr_nm          		".trim(), length));
			String[] gnr_tp_cd            =  (JSPUtil.getParameter(request, prefix + "gnr_tp_cd           		".trim(), length));
			String[] gnr_bhp_pwr          =  (JSPUtil.getParameter(request, prefix + "gnr_bhp_pwr         		".trim(), length));
			String[] bwthst_mkr_nm        =  (JSPUtil.getParameter(request, prefix + "bwthst_mkr_nm       		".trim(), length));
			String[] bwthst_tp_cd         =  (JSPUtil.getParameter(request, prefix + "bwthst_tp_cd        		".trim(), length));
			String[] bwthst_bhp_pwr       =  (JSPUtil.getParameter(request, prefix + "bwthst_bhp_pwr      		".trim(), length));
			String[] bwthst_rpm_pwr       =  (JSPUtil.getParameter(request, prefix + "bwthst_rpm_pwr      		".trim(), length));
			String[] lloyd_no             =  (JSPUtil.getParameter(request, prefix + "lloyd_no            		".trim(), length));
			String[] vsl_lnch_dt          =  (JSPUtil.getParameter(request, prefix + "vsl_lnch_dt         		".trim(), length));
			String[] vsl_de_dt            =  (JSPUtil.getParameter(request, prefix + "vsl_de_dt           		".trim(), length));
			String[] vsl_kel_ly_dt        =  (JSPUtil.getParameter(request, prefix + "vsl_kel_ly_dt       		".trim(), length));
			String[] vsl_hl_no            =  (JSPUtil.getParameter(request, prefix + "vsl_hl_no           		".trim(), length));
			String[] ttl_teu_knt          =  (JSPUtil.getParameter(request, prefix + "ttl_teu_knt         		".trim(), length));
			String[] vsl_htch_knt         =  (JSPUtil.getParameter(request, prefix + "vsl_htch_knt        		".trim(), length));
			String[] vsl_hld_knt          =  (JSPUtil.getParameter(request, prefix + "vsl_hld_knt         		".trim(), length));
			String[] vsl_rmk              =  (JSPUtil.getParameter(request, prefix + "vsl_rmk             		".trim(), length));
			String[] cre_usr_id           =  (JSPUtil.getParameter(request, prefix + "cre_usr_id          		".trim(), length));
			String[] cre_dt               =  (JSPUtil.getParameter(request, prefix + "cre_dt              		".trim(), length));
			String[] upd_usr_id           =  (JSPUtil.getParameter(request, prefix + "upd_usr_id          		".trim(), length));
			String[] upd_dt               =  (JSPUtil.getParameter(request, prefix + "upd_dt              		".trim(), length));
			String[] delt_flg             =  (JSPUtil.getParameter(request, prefix + "delt_flg            		".trim(), length));
			String[] eai_evnt_dt          =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt         		".trim(), length));
			String[] vsl_bld_area_nm	  =  (JSPUtil.getParameter(request, prefix + "vsl_bld_area_nm		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new MdmVslCntr();
				model.setIbflag              		  ( ibflag              	[i]);
				model.setPage_rows           		  ( page_rows           	[i]);
				model.setVsl_cd              		  ( vsl_cd              	[i]);
				model.setVsl_clss_cd        		  ( vsl_clss_cd        		[i]);
				model.setVsl_eng_nm          		  ( vsl_eng_nm          	[i]);
				model.setVsl_krn_nm          		  ( vsl_krn_nm          	[i]);
				model.setFoil_capa           		  ( foil_capa           	[i]);
				model.setDoil_capa           		  ( doil_capa           	[i]);
				model.setFrsh_wtr_capa       		  ( frsh_wtr_capa       	[i]);
				model.setCall_sgn_no         		  ( call_sgn_no         	[i]);
				model.setRgst_no             		  ( rgst_no             	[i]);
				model.setPhn_no              		  ( phn_no              	[i]);
				model.setFax_no              		  ( fax_no              	[i]);
				model.setTlx_no              		  ( tlx_no              	[i]);
				model.setVsl_eml             		  ( vsl_eml             	[i]);
				model.setPiclb_desc          		  ( piclb_desc          	[i]);
				model.setRgst_port_cd        		  ( rgst_port_cd        	[i]);
				model.setClss_no_rgst_area_nm		  ( clss_no_rgst_area_nm	[i]);
				model.setVsl_clss_no         		  ( vsl_clss_no         	[i]);
				model.setVsl_bldr_nm         		  ( vsl_bldr_nm         	[i]);
				model.setLoa_len             		  ( loa_len             	[i]);
				model.setLbp_len             		  ( lbp_len             	[i]);
				model.setVsl_wdt             		  ( vsl_wdt             	[i]);
				model.setVsl_dpth            		  ( vsl_dpth            	[i]);
				model.setSmr_drft_hgt        		  ( smr_drft_hgt        	[i]);
				model.setDwt_wgt             		  ( dwt_wgt             	[i]);
				model.setLgt_shp_tong_wgt    		  ( lgt_shp_tong_wgt    	[i]);
				model.setGrs_rgst_tong_wgt   		  ( grs_rgst_tong_wgt   	[i]);
				model.setNet_rgst_tong_wgt   		  ( net_rgst_tong_wgt   	[i]);
				model.setPnm_gt_wgt          		  ( pnm_gt_wgt          	[i]);
				model.setPnm_net_tong_wgt    		  ( pnm_net_tong_wgt    	[i]);
				model.setSuz_gt_wgt          		  ( suz_gt_wgt          	[i]);
				model.setSuz_net_tong_wgt    		  ( suz_net_tong_wgt    	[i]);
				model.setMn_eng_mkr_nm       		  ( mn_eng_mkr_nm       	[i]);
				model.setMn_eng_tp_cd        		  ( mn_eng_tp_cd        	[i]);
				model.setMn_eng_bhp_pwr      		  ( mn_eng_bhp_pwr      	[i]);
				model.setVsl_own_ind_cd      		  ( vsl_own_ind_cd      	[i]);
				model.setVsl_rgst_cnt_cd     		  ( vsl_rgst_cnt_cd     	[i]);
				model.setVsl_bld_cd          		  ( vsl_bld_cd          	[i]);
				model.setCrr_cd              		  ( crr_cd              	[i]);
				model.setFdr_div_cd          		  ( fdr_div_cd          	[i]);
				model.setVsl_svc_spd         		  ( vsl_svc_spd         	[i]);
				model.setMax_spd             		  ( max_spd             	[i]);
				model.setEcn_spd             		  ( ecn_spd             	[i]);
				model.setCrw_knt             		  ( crw_knt             	[i]);
				model.setCntr_dzn_capa       		  ( cntr_dzn_capa       	[i]);
				model.setCntr_op_capa        		  ( cntr_op_capa        	[i]);
				model.setCntr_pnm_capa       		  ( cntr_pnm_capa       	[i]);
				model.setCntr_vsl_clss_capa  		  ( cntr_vsl_clss_capa  	[i]);
				model.setRf_rcpt_knt         		  ( rf_rcpt_knt         	[i]);
				model.setRf_rcpt_max_knt     		  ( rf_rcpt_max_knt     	[i]);
				model.setFbd_capa            		  ( fbd_capa            	[i]);
				model.setDpl_capa            		  ( dpl_capa            	[i]);
				model.setBlst_tnk_capa       		  ( blst_tnk_capa       	[i]);
				model.setFoil_csm            		  ( foil_csm            	[i]);
				model.setDoil_csm            		  ( doil_csm            	[i]);
				model.setFrsh_wtr_csm        		  ( frsh_wtr_csm        	[i]);
				model.setMn_eng_rpm_pwr      		  ( mn_eng_rpm_pwr      	[i]);
				model.setGnr_rpm_pwr         		  ( gnr_rpm_pwr         	[i]);
				model.setVsl_hgt             		  ( vsl_hgt             	[i]);
				model.setRgst_dt             		  ( rgst_dt             	[i]);
				model.setVsl_edi_nm          		  ( vsl_edi_nm          	[i]);
				model.setCo_cd               		  ( co_cd               	[i]);
				model.setVsl_clz_dt          		  ( vsl_clz_dt          	[i]);
				model.setVsl_cre_ofc_cd      		  ( vsl_cre_ofc_cd      	[i]);
				model.setVsl_delt_ofc_cd     		  ( vsl_delt_ofc_cd     	[i]);
				model.setVsl_bld_cnt_cd      		  ( vsl_bld_cnt_cd      	[i]);
				model.setGnr_mkr_nm          		  ( gnr_mkr_nm          	[i]);
				model.setGnr_tp_cd           		  ( gnr_tp_cd           	[i]);
				model.setGnr_bhp_pwr         		  ( gnr_bhp_pwr         	[i]);
				model.setBwthst_mkr_nm       		  ( bwthst_mkr_nm       	[i]);
				model.setBwthst_tp_cd        		  ( bwthst_tp_cd        	[i]);
				model.setBwthst_bhp_pwr      		  ( bwthst_bhp_pwr      	[i]);
				model.setBwthst_rpm_pwr      		  ( bwthst_rpm_pwr      	[i]);
				model.setLloyd_no            		  ( lloyd_no            	[i]);
				model.setVsl_lnch_dt         		  ( vsl_lnch_dt         	[i]);
				model.setVsl_de_dt           		  ( vsl_de_dt           	[i]);
				model.setVsl_kel_ly_dt       		  ( vsl_kel_ly_dt       	[i]);
				model.setVsl_hl_no           		  ( vsl_hl_no           	[i]);
				model.setTtl_teu_knt         		  ( ttl_teu_knt         	[i]);
				model.setVsl_htch_knt        		  ( vsl_htch_knt        	[i]);
				model.setVsl_hld_knt         		  ( vsl_hld_knt         	[i]);
				model.setVsl_rmk             		  ( vsl_rmk             	[i]);
				model.setCre_usr_id          		  ( cre_usr_id          	[i]);
				model.setCre_dt              		  ( cre_dt              	[i]);
				model.setUpd_usr_id          		  ( upd_usr_id          	[i]);
				model.setUpd_dt              		  ( upd_dt              	[i]);
				model.setDelt_flg            		  ( delt_flg            	[i]);
				model.setEai_evnt_dt         		  ( eai_evnt_dt         	[i]);
				model.setVsl_bld_area_nm		(	vsl_bld_area_nm		[i]);
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
