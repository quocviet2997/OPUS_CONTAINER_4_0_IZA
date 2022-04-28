/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : MST_CONTAINER.java
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
public final class MST_CONTAINER implements java.io.Serializable {

	private String              ibflag              = "";
	private String              page_rows           = "";
	private String              cntr_no             = "";
	private String              svr_id              = "";
	private String              svr_flg             = "";
	private String              mgst_no             = "";
	private String              ctrt_ofc_cty_cd     = "";
	private String              ctrt_seq            = "";
	private String              vndr_cnt_cd         = "";
	private String              vndr_seq            = "";
	private String              onh_dt              = "";
	private String              onh_yd_cd           = "";
	private String              onh_free_dys        = "";
	private String              cntr_mtrl_cd        = "";
	private String              cnmv_yr             = "";
	private String              cnmv_seq            = "";
	private String              cnmv_split_no       = "";
	private String              lst_sts_yd_cd       = "";
	private String              lst_sts_seq         = "";
	private String              cntr_in_flg         = "";
	private String              crnt_yd_cd          = "";
	private String              scc_cd              = "";
	private String              lcc_cd              = "";
	private String              rcc_cd              = "";
	private String              dest_yd_cd          = "";
	private String              vsl_cd              = "";
	private String              skd_voy_no          = "";
	private String              skd_dir_cd          = "";
	private String              cnmv_sts_cd         = "";
	private String              aciac_div_cd        = "";
	private String              cntr_tpsz_cd        = "";
	private String              cntr_pfx_cd         = "";
	private String              lstm_cd             = "";
	private String              cntr_spec_no        = "";
	private String              mftr_vndr_cnt_cd    = "";
	private String              mftr_vndr_seq       = "";
	private String              mft_dt              = "";
	private String              tare_wgt            = "";
	private String              cntr_cyc_no         = "";
	private String              cntr_hngr_rck_flg   = "";
	private String              dmg_flg             = "";
	private String              full_flg            = "";
	private String              cntr_rmk            = "";
	private String              cntr_sys_dt         = "";
	private String              cntr_usr_id         = "";
	private String              upd_dt              = "";
	private String              upd_usr_id          = "";
	private String              delt_flg            = "";
	private String              rfub_flg            = "";
	private String              rfub_dt             = "";
	private String              disp_flg            = "";
	private String              imdt_ext_flg        = "";
	private String              cnmv_dt             = "";
	private String              cnmv_op_cd          = "";
	private String              acpt_dt             = "";
	private String              cnmv_gmt_dt         = "";
	private String              cntr_dat_cng_nm     = "";
	private String              cntr_dat_cng_dt     = "";
	private String              cntr_dat_cng_svc_nm = "";
	private String              cntr_dat_cng_svr_nm = "";
	private String              hjs_cre_flg         = "";
	private String              mty_flg             = "";
	private String              ownr_co_cd          = "";
	private String              cntr_use_co_cd      = "";
	private String              cntr_sts_cd         = "";
	private String              cntr_pkup_no        = "";
	private String              cntr_pkup_dt        = "";
	private String              cntr_pkup_met_cd    = "";
	private String              nis_evnt_dt         = "";
	private String              cust_rmk            = "";
	private String              uclm_flg            = "";
	private String              uclm_dt             = "";
	private String              uclm_upd_usr_id     = "";
	private String              uclm_upd_dt         = "";
	private String              uclm_upd_rmk        = "";
	private String              rf_tp_cd            = "";
	private String              uclm_free_dys       = "";
	private String              uclm_ls_flg2        = "";
	private String              uclm_ls_flg         = "";
	private String              cntr_lst_sts_cd     = "";
	private String              cntr_spcl_dmg_flg   = "";
	private String              min_onh_dys         = "";
	private String              uclm_rmk            = "";
	private String              plst_flr_flg        = "";
	private String              auth_no             = "";
	private String              rf_up_rt_dt         = "";
	private String              sub_lstm_cd         = "";
	private String              cntr_lst_seq        = "";
	private String              cntr_hngr_bar_flg   = "";
	private String              cntr_curr_cd        = "";
	private String              cntr_curr_amt       = "";
	private String              cntr_invst_cd       = "";
	private String              erp_if_flg          = "";
	private String              erp_if_dt           = "";
	private String              ecc_cd              = "";
	private String              acct_qty_mzd_cd     = "";
	private String              eai_evnt_dt         = "";

	public MST_CONTAINER(){}

	public MST_CONTAINER(
			String              ibflag             ,
			String              page_rows          ,
			String              cntr_no            ,
			String              svr_id             ,
			String              svr_flg            ,
			String              mgst_no            ,
			String              ctrt_ofc_cty_cd    ,
			String              ctrt_seq           ,
			String              vndr_cnt_cd        ,
			String              vndr_seq           ,
			String              onh_dt             ,
			String              onh_yd_cd          ,
			String              onh_free_dys       ,
			String              cntr_mtrl_cd       ,
			String              cnmv_yr            ,
			String              cnmv_seq           ,
			String              cnmv_split_no      ,
			String              lst_sts_yd_cd      ,
			String              lst_sts_seq        ,
			String              cntr_in_flg        ,
			String              crnt_yd_cd         ,
			String              scc_cd             ,
			String              lcc_cd             ,
			String              rcc_cd             ,
			String              dest_yd_cd         ,
			String              vsl_cd             ,
			String              skd_voy_no         ,
			String              skd_dir_cd         ,
			String              cnmv_sts_cd        ,
			String              aciac_div_cd       ,
			String              cntr_tpsz_cd       ,
			String              cntr_pfx_cd        ,
			String              lstm_cd            ,
			String              cntr_spec_no       ,
			String              mftr_vndr_cnt_cd   ,
			String              mftr_vndr_seq      ,
			String              mft_dt             ,
			String              tare_wgt           ,
			String              cntr_cyc_no        ,
			String              cntr_hngr_rck_flg  ,
			String              dmg_flg            ,
			String              full_flg           ,
			String              cntr_rmk           ,
			String              cntr_sys_dt        ,
			String              cntr_usr_id        ,
			String              upd_dt             ,
			String              upd_usr_id         ,
			String              delt_flg           ,
			String              rfub_flg           ,
			String              rfub_dt            ,
			String              disp_flg           ,
			String              imdt_ext_flg       ,
			String              cnmv_dt            ,
			String              cnmv_op_cd         ,
			String              acpt_dt            ,
			String              cnmv_gmt_dt        ,
			String              cntr_dat_cng_nm    ,
			String              cntr_dat_cng_dt    ,
			String              cntr_dat_cng_svc_nm,
			String              cntr_dat_cng_svr_nm,
			String              hjs_cre_flg        ,
			String              mty_flg            ,
			String              ownr_co_cd         ,
			String              cntr_use_co_cd     ,
			String              cntr_sts_cd        ,
			String              cntr_pkup_no       ,
			String              cntr_pkup_dt       ,
			String              cntr_pkup_met_cd   ,
			String              nis_evnt_dt        ,
			String              cust_rmk           ,
			String              uclm_flg           ,
			String              uclm_dt            ,
			String              uclm_upd_usr_id    ,
			String              uclm_upd_dt        ,
			String              uclm_upd_rmk       ,
			String              rf_tp_cd           ,
			String              uclm_free_dys      ,
			String              uclm_ls_flg2       ,
			String              uclm_ls_flg        ,
			String              cntr_lst_sts_cd    ,
			String              cntr_spcl_dmg_flg  ,
			String              min_onh_dys        ,
			String              uclm_rmk           ,
			String              plst_flr_flg       ,
			String              auth_no            ,
			String              rf_up_rt_dt        ,
			String              sub_lstm_cd        ,
			String              cntr_lst_seq       ,
			String              cntr_hngr_bar_flg  ,
			String              cntr_curr_cd       ,
			String              cntr_curr_amt      ,
			String              cntr_invst_cd      ,
			String              erp_if_flg         ,
			String              erp_if_dt          ,
			String              ecc_cd             ,
			String              acct_qty_mzd_cd    ,
			String              eai_evnt_dt        ){
		this.ibflag              = ibflag             ;
		this.page_rows           = page_rows          ;
		this.cntr_no             = cntr_no            ;
		this.svr_id              = svr_id             ;
		this.svr_flg             = svr_flg            ;
		this.mgst_no             = mgst_no            ;
		this.ctrt_ofc_cty_cd     = ctrt_ofc_cty_cd    ;
		this.ctrt_seq            = ctrt_seq           ;
		this.vndr_cnt_cd         = vndr_cnt_cd        ;
		this.vndr_seq            = vndr_seq           ;
		this.onh_dt              = onh_dt             ;
		this.onh_yd_cd           = onh_yd_cd          ;
		this.onh_free_dys        = onh_free_dys       ;
		this.cntr_mtrl_cd        = cntr_mtrl_cd       ;
		this.cnmv_yr             = cnmv_yr            ;
		this.cnmv_seq            = cnmv_seq           ;
		this.cnmv_split_no       = cnmv_split_no      ;
		this.lst_sts_yd_cd       = lst_sts_yd_cd      ;
		this.lst_sts_seq         = lst_sts_seq        ;
		this.cntr_in_flg         = cntr_in_flg        ;
		this.crnt_yd_cd          = crnt_yd_cd         ;
		this.scc_cd              = scc_cd             ;
		this.lcc_cd              = lcc_cd             ;
		this.rcc_cd              = rcc_cd             ;
		this.dest_yd_cd          = dest_yd_cd         ;
		this.vsl_cd              = vsl_cd             ;
		this.skd_voy_no          = skd_voy_no         ;
		this.skd_dir_cd          = skd_dir_cd         ;
		this.cnmv_sts_cd         = cnmv_sts_cd        ;
		this.aciac_div_cd        = aciac_div_cd       ;
		this.cntr_tpsz_cd        = cntr_tpsz_cd       ;
		this.cntr_pfx_cd         = cntr_pfx_cd        ;
		this.lstm_cd             = lstm_cd            ;
		this.cntr_spec_no        = cntr_spec_no       ;
		this.mftr_vndr_cnt_cd    = mftr_vndr_cnt_cd   ;
		this.mftr_vndr_seq       = mftr_vndr_seq      ;
		this.mft_dt              = mft_dt             ;
		this.tare_wgt            = tare_wgt           ;
		this.cntr_cyc_no         = cntr_cyc_no        ;
		this.cntr_hngr_rck_flg   = cntr_hngr_rck_flg  ;
		this.dmg_flg             = dmg_flg            ;
		this.full_flg            = full_flg           ;
		this.cntr_rmk            = cntr_rmk           ;
		this.cntr_sys_dt         = cntr_sys_dt        ;
		this.cntr_usr_id         = cntr_usr_id        ;
		this.upd_dt              = upd_dt             ;
		this.upd_usr_id          = upd_usr_id         ;
		this.delt_flg            = delt_flg           ;
		this.rfub_flg            = rfub_flg           ;
		this.rfub_dt             = rfub_dt            ;
		this.disp_flg            = disp_flg           ;
		this.imdt_ext_flg        = imdt_ext_flg       ;
		this.cnmv_dt             = cnmv_dt            ;
		this.cnmv_op_cd          = cnmv_op_cd         ;
		this.acpt_dt             = acpt_dt            ;
		this.cnmv_gmt_dt         = cnmv_gmt_dt        ;
		this.cntr_dat_cng_nm     = cntr_dat_cng_nm    ;
		this.cntr_dat_cng_dt     = cntr_dat_cng_dt    ;
		this.cntr_dat_cng_svc_nm = cntr_dat_cng_svc_nm;
		this.cntr_dat_cng_svr_nm = cntr_dat_cng_svr_nm;
		this.hjs_cre_flg         = hjs_cre_flg        ;
		this.mty_flg             = mty_flg            ;
		this.ownr_co_cd          = ownr_co_cd         ;
		this.cntr_use_co_cd      = cntr_use_co_cd     ;
		this.cntr_sts_cd         = cntr_sts_cd        ;
		this.cntr_pkup_no        = cntr_pkup_no       ;
		this.cntr_pkup_dt        = cntr_pkup_dt       ;
		this.cntr_pkup_met_cd    = cntr_pkup_met_cd   ;
		this.nis_evnt_dt         = nis_evnt_dt        ;
		this.cust_rmk            = cust_rmk           ;
		this.uclm_flg            = uclm_flg           ;
		this.uclm_dt             = uclm_dt            ;
		this.uclm_upd_usr_id     = uclm_upd_usr_id    ;
		this.uclm_upd_dt         = uclm_upd_dt        ;
		this.uclm_upd_rmk        = uclm_upd_rmk       ;
		this.rf_tp_cd            = rf_tp_cd           ;
		this.uclm_free_dys       = uclm_free_dys      ;
		this.uclm_ls_flg2        = uclm_ls_flg2       ;
		this.uclm_ls_flg         = uclm_ls_flg        ;
		this.cntr_lst_sts_cd     = cntr_lst_sts_cd    ;
		this.cntr_spcl_dmg_flg   = cntr_spcl_dmg_flg  ;
		this.min_onh_dys         = min_onh_dys        ;
		this.uclm_rmk            = uclm_rmk           ;
		this.plst_flr_flg        = plst_flr_flg       ;
		this.auth_no             = auth_no            ;
		this.rf_up_rt_dt         = rf_up_rt_dt        ;
		this.sub_lstm_cd         = sub_lstm_cd        ;
		this.cntr_lst_seq        = cntr_lst_seq       ;
		this.cntr_hngr_bar_flg   = cntr_hngr_bar_flg  ;
		this.cntr_curr_cd        = cntr_curr_cd       ;
		this.cntr_curr_amt       = cntr_curr_amt      ;
		this.cntr_invst_cd       = cntr_invst_cd      ;
		this.erp_if_flg          = erp_if_flg         ;
		this.erp_if_dt           = erp_if_dt          ;
		this.ecc_cd              = ecc_cd             ;
		this.acct_qty_mzd_cd     = acct_qty_mzd_cd    ;
		this.eai_evnt_dt         = eai_evnt_dt        ;
	}

	// getter method is proceeding ..
	public String              getIbflag             (){	return ibflag             	;	}
	public String              getPage_rows          (){	return page_rows          	;	}
	public String              getCntr_no            (){	return cntr_no            	;	}
	public String              getSvr_id             (){	return svr_id             	;	}
	public String              getSvr_flg            (){	return svr_flg            	;	}
	public String              getMgst_no            (){	return mgst_no            	;	}
	public String              getCtrt_ofc_cty_cd    (){	return ctrt_ofc_cty_cd    	;	}
	public String              getCtrt_seq           (){	return ctrt_seq           	;	}
	public String              getVndr_cnt_cd        (){	return vndr_cnt_cd        	;	}
	public String              getVndr_seq           (){	return vndr_seq           	;	}
	public String              getOnh_dt             (){	return onh_dt             	;	}
	public String              getOnh_yd_cd          (){	return onh_yd_cd          	;	}
	public String              getOnh_free_dys       (){	return onh_free_dys       	;	}
	public String              getCntr_mtrl_cd       (){	return cntr_mtrl_cd       	;	}
	public String              getCnmv_yr            (){	return cnmv_yr            	;	}
	public String              getCnmv_seq           (){	return cnmv_seq           	;	}
	public String              getCnmv_split_no      (){	return cnmv_split_no      	;	}
	public String              getLst_sts_yd_cd      (){	return lst_sts_yd_cd      	;	}
	public String              getLst_sts_seq        (){	return lst_sts_seq        	;	}
	public String              getCntr_in_flg        (){	return cntr_in_flg        	;	}
	public String              getCrnt_yd_cd         (){	return crnt_yd_cd         	;	}
	public String              getScc_cd             (){	return scc_cd             	;	}
	public String              getLcc_cd             (){	return lcc_cd             	;	}
	public String              getRcc_cd             (){	return rcc_cd             	;	}
	public String              getDest_yd_cd         (){	return dest_yd_cd         	;	}
	public String              getVsl_cd             (){	return vsl_cd             	;	}
	public String              getSkd_voy_no         (){	return skd_voy_no         	;	}
	public String              getSkd_dir_cd         (){	return skd_dir_cd         	;	}
	public String              getCnmv_sts_cd        (){	return cnmv_sts_cd        	;	}
	public String              getAciac_div_cd       (){	return aciac_div_cd       	;	}
	public String              getCntr_tpsz_cd       (){	return cntr_tpsz_cd       	;	}
	public String              getCntr_pfx_cd        (){	return cntr_pfx_cd        	;	}
	public String              getLstm_cd            (){	return lstm_cd            	;	}
	public String              getCntr_spec_no       (){	return cntr_spec_no       	;	}
	public String              getMftr_vndr_cnt_cd   (){	return mftr_vndr_cnt_cd   	;	}
	public String              getMftr_vndr_seq      (){	return mftr_vndr_seq      	;	}
	public String              getMft_dt             (){	return mft_dt             	;	}
	public String              getTare_wgt           (){	return tare_wgt           	;	}
	public String              getCntr_cyc_no        (){	return cntr_cyc_no        	;	}
	public String              getCntr_hngr_rck_flg  (){	return cntr_hngr_rck_flg  	;	}
	public String              getDmg_flg            (){	return dmg_flg            	;	}
	public String              getFull_flg           (){	return full_flg           	;	}
	public String              getCntr_rmk           (){	return cntr_rmk           	;	}
	public String              getCntr_sys_dt        (){	return cntr_sys_dt        	;	}
	public String              getCntr_usr_id        (){	return cntr_usr_id        	;	}
	public String              getUpd_dt             (){	return upd_dt             	;	}
	public String              getUpd_usr_id         (){	return upd_usr_id         	;	}
	public String              getDelt_flg           (){	return delt_flg           	;	}
	public String              getRfub_flg           (){	return rfub_flg           	;	}
	public String              getRfub_dt            (){	return rfub_dt            	;	}
	public String              getDisp_flg           (){	return disp_flg           	;	}
	public String              getImdt_ext_flg       (){	return imdt_ext_flg       	;	}
	public String              getCnmv_dt            (){	return cnmv_dt            	;	}
	public String              getCnmv_op_cd         (){	return cnmv_op_cd         	;	}
	public String              getAcpt_dt            (){	return acpt_dt            	;	}
	public String              getCnmv_gmt_dt        (){	return cnmv_gmt_dt        	;	}
	public String              getCntr_dat_cng_nm    (){	return cntr_dat_cng_nm    	;	}
	public String              getCntr_dat_cng_dt    (){	return cntr_dat_cng_dt    	;	}
	public String              getCntr_dat_cng_svc_nm(){	return cntr_dat_cng_svc_nm	;	}
	public String              getCntr_dat_cng_svr_nm(){	return cntr_dat_cng_svr_nm	;	}
	public String              getHjs_cre_flg        (){	return hjs_cre_flg        	;	}
	public String              getMty_flg            (){	return mty_flg            	;	}
	public String              getOwnr_co_cd         (){	return ownr_co_cd         	;	}
	public String              getCntr_use_co_cd     (){	return cntr_use_co_cd     	;	}
	public String              getCntr_sts_cd        (){	return cntr_sts_cd        	;	}
	public String              getCntr_pkup_no       (){	return cntr_pkup_no       	;	}
	public String              getCntr_pkup_dt       (){	return cntr_pkup_dt       	;	}
	public String              getCntr_pkup_met_cd   (){	return cntr_pkup_met_cd   	;	}
	public String              getNis_evnt_dt        (){	return nis_evnt_dt        	;	}
	public String              getCust_rmk           (){	return cust_rmk           	;	}
	public String              getUclm_flg           (){	return uclm_flg           	;	}
	public String              getUclm_dt            (){	return uclm_dt            	;	}
	public String              getUclm_upd_usr_id    (){	return uclm_upd_usr_id    	;	}
	public String              getUclm_upd_dt        (){	return uclm_upd_dt        	;	}
	public String              getUclm_upd_rmk       (){	return uclm_upd_rmk       	;	}
	public String              getRf_tp_cd           (){	return rf_tp_cd           	;	}
	public String              getUclm_free_dys      (){	return uclm_free_dys      	;	}
	public String              getUclm_ls_flg2       (){	return uclm_ls_flg2       	;	}
	public String              getUclm_ls_flg        (){	return uclm_ls_flg        	;	}
	public String              getCntr_lst_sts_cd    (){	return cntr_lst_sts_cd    	;	}
	public String              getCntr_spcl_dmg_flg  (){	return cntr_spcl_dmg_flg  	;	}
	public String              getMin_onh_dys        (){	return min_onh_dys        	;	}
	public String              getUclm_rmk           (){	return uclm_rmk           	;	}
	public String              getPlst_flr_flg       (){	return plst_flr_flg       	;	}
	public String              getAuth_no            (){	return auth_no            	;	}
	public String              getRf_up_rt_dt        (){	return rf_up_rt_dt        	;	}
	public String              getSub_lstm_cd        (){	return sub_lstm_cd        	;	}
	public String              getCntr_lst_seq       (){	return cntr_lst_seq       	;	}
	public String              getCntr_hngr_bar_flg  (){	return cntr_hngr_bar_flg  	;	}
	public String              getCntr_curr_cd       (){	return cntr_curr_cd       	;	}
	public String              getCntr_curr_amt      (){	return cntr_curr_amt      	;	}
	public String              getCntr_invst_cd      (){	return cntr_invst_cd      	;	}
	public String              getErp_if_flg         (){	return erp_if_flg         	;	}
	public String              getErp_if_dt          (){	return erp_if_dt          	;	}
	public String              getEcc_cd             (){	return ecc_cd             	;	}
	public String              getAcct_qty_mzd_cd    (){	return acct_qty_mzd_cd    	;	}
	public String              getEai_evnt_dt        (){	return eai_evnt_dt        	;	}

	// setter method is proceeding ..
	public void setIbflag             ( String              ibflag              ){	this.ibflag              = ibflag             	;	}
	public void setPage_rows          ( String              page_rows           ){	this.page_rows           = page_rows          	;	}
	public void setCntr_no            ( String              cntr_no             ){	this.cntr_no             = cntr_no            	;	}
	public void setSvr_id             ( String              svr_id              ){	this.svr_id              = svr_id             	;	}
	public void setSvr_flg            ( String              svr_flg             ){	this.svr_flg             = svr_flg            	;	}
	public void setMgst_no            ( String              mgst_no             ){	this.mgst_no             = mgst_no            	;	}
	public void setCtrt_ofc_cty_cd    ( String              ctrt_ofc_cty_cd     ){	this.ctrt_ofc_cty_cd     = ctrt_ofc_cty_cd    	;	}
	public void setCtrt_seq           ( String              ctrt_seq            ){	this.ctrt_seq            = ctrt_seq           	;	}
	public void setVndr_cnt_cd        ( String              vndr_cnt_cd         ){	this.vndr_cnt_cd         = vndr_cnt_cd        	;	}
	public void setVndr_seq           ( String              vndr_seq            ){	this.vndr_seq            = vndr_seq           	;	}
	public void setOnh_dt             ( String              onh_dt              ){	this.onh_dt              = onh_dt             	;	}
	public void setOnh_yd_cd          ( String              onh_yd_cd           ){	this.onh_yd_cd           = onh_yd_cd          	;	}
	public void setOnh_free_dys       ( String              onh_free_dys        ){	this.onh_free_dys        = onh_free_dys       	;	}
	public void setCntr_mtrl_cd       ( String              cntr_mtrl_cd        ){	this.cntr_mtrl_cd        = cntr_mtrl_cd       	;	}
	public void setCnmv_yr            ( String              cnmv_yr             ){	this.cnmv_yr             = cnmv_yr            	;	}
	public void setCnmv_seq           ( String              cnmv_seq            ){	this.cnmv_seq            = cnmv_seq           	;	}
	public void setCnmv_split_no      ( String              cnmv_split_no       ){	this.cnmv_split_no       = cnmv_split_no      	;	}
	public void setLst_sts_yd_cd      ( String              lst_sts_yd_cd       ){	this.lst_sts_yd_cd       = lst_sts_yd_cd      	;	}
	public void setLst_sts_seq        ( String              lst_sts_seq         ){	this.lst_sts_seq         = lst_sts_seq        	;	}
	public void setCntr_in_flg        ( String              cntr_in_flg         ){	this.cntr_in_flg         = cntr_in_flg        	;	}
	public void setCrnt_yd_cd         ( String              crnt_yd_cd          ){	this.crnt_yd_cd          = crnt_yd_cd         	;	}
	public void setScc_cd             ( String              scc_cd              ){	this.scc_cd              = scc_cd             	;	}
	public void setLcc_cd             ( String              lcc_cd              ){	this.lcc_cd              = lcc_cd             	;	}
	public void setRcc_cd             ( String              rcc_cd              ){	this.rcc_cd              = rcc_cd             	;	}
	public void setDest_yd_cd         ( String              dest_yd_cd          ){	this.dest_yd_cd          = dest_yd_cd         	;	}
	public void setVsl_cd             ( String              vsl_cd              ){	this.vsl_cd              = vsl_cd             	;	}
	public void setSkd_voy_no         ( String              skd_voy_no          ){	this.skd_voy_no          = skd_voy_no         	;	}
	public void setSkd_dir_cd         ( String              skd_dir_cd          ){	this.skd_dir_cd          = skd_dir_cd         	;	}
	public void setCnmv_sts_cd        ( String              cnmv_sts_cd         ){	this.cnmv_sts_cd         = cnmv_sts_cd        	;	}
	public void setAciac_div_cd       ( String              aciac_div_cd        ){	this.aciac_div_cd        = aciac_div_cd       	;	}
	public void setCntr_tpsz_cd       ( String              cntr_tpsz_cd        ){	this.cntr_tpsz_cd        = cntr_tpsz_cd       	;	}
	public void setCntr_pfx_cd        ( String              cntr_pfx_cd         ){	this.cntr_pfx_cd         = cntr_pfx_cd        	;	}
	public void setLstm_cd            ( String              lstm_cd             ){	this.lstm_cd             = lstm_cd            	;	}
	public void setCntr_spec_no       ( String              cntr_spec_no        ){	this.cntr_spec_no        = cntr_spec_no       	;	}
	public void setMftr_vndr_cnt_cd   ( String              mftr_vndr_cnt_cd    ){	this.mftr_vndr_cnt_cd    = mftr_vndr_cnt_cd   	;	}
	public void setMftr_vndr_seq      ( String              mftr_vndr_seq       ){	this.mftr_vndr_seq       = mftr_vndr_seq      	;	}
	public void setMft_dt             ( String              mft_dt              ){	this.mft_dt              = mft_dt             	;	}
	public void setTare_wgt           ( String              tare_wgt            ){	this.tare_wgt            = tare_wgt           	;	}
	public void setCntr_cyc_no        ( String              cntr_cyc_no         ){	this.cntr_cyc_no         = cntr_cyc_no        	;	}
	public void setCntr_hngr_rck_flg  ( String              cntr_hngr_rck_flg   ){	this.cntr_hngr_rck_flg   = cntr_hngr_rck_flg  	;	}
	public void setDmg_flg            ( String              dmg_flg             ){	this.dmg_flg             = dmg_flg            	;	}
	public void setFull_flg           ( String              full_flg            ){	this.full_flg            = full_flg           	;	}
	public void setCntr_rmk           ( String              cntr_rmk            ){	this.cntr_rmk            = cntr_rmk           	;	}
	public void setCntr_sys_dt        ( String              cntr_sys_dt         ){	this.cntr_sys_dt         = cntr_sys_dt        	;	}
	public void setCntr_usr_id        ( String              cntr_usr_id         ){	this.cntr_usr_id         = cntr_usr_id        	;	}
	public void setUpd_dt             ( String              upd_dt              ){	this.upd_dt              = upd_dt             	;	}
	public void setUpd_usr_id         ( String              upd_usr_id          ){	this.upd_usr_id          = upd_usr_id         	;	}
	public void setDelt_flg           ( String              delt_flg            ){	this.delt_flg            = delt_flg           	;	}
	public void setRfub_flg           ( String              rfub_flg            ){	this.rfub_flg            = rfub_flg           	;	}
	public void setRfub_dt            ( String              rfub_dt             ){	this.rfub_dt             = rfub_dt            	;	}
	public void setDisp_flg           ( String              disp_flg            ){	this.disp_flg            = disp_flg           	;	}
	public void setImdt_ext_flg       ( String              imdt_ext_flg        ){	this.imdt_ext_flg        = imdt_ext_flg       	;	}
	public void setCnmv_dt            ( String              cnmv_dt             ){	this.cnmv_dt             = cnmv_dt            	;	}
	public void setCnmv_op_cd         ( String              cnmv_op_cd          ){	this.cnmv_op_cd          = cnmv_op_cd         	;	}
	public void setAcpt_dt            ( String              acpt_dt             ){	this.acpt_dt             = acpt_dt            	;	}
	public void setCnmv_gmt_dt        ( String              cnmv_gmt_dt         ){	this.cnmv_gmt_dt         = cnmv_gmt_dt        	;	}
	public void setCntr_dat_cng_nm    ( String              cntr_dat_cng_nm     ){	this.cntr_dat_cng_nm     = cntr_dat_cng_nm    	;	}
	public void setCntr_dat_cng_dt    ( String              cntr_dat_cng_dt     ){	this.cntr_dat_cng_dt     = cntr_dat_cng_dt    	;	}
	public void setCntr_dat_cng_svc_nm( String              cntr_dat_cng_svc_nm ){	this.cntr_dat_cng_svc_nm = cntr_dat_cng_svc_nm	;	}
	public void setCntr_dat_cng_svr_nm( String              cntr_dat_cng_svr_nm ){	this.cntr_dat_cng_svr_nm = cntr_dat_cng_svr_nm	;	}
	public void setHjs_cre_flg        ( String              hjs_cre_flg         ){	this.hjs_cre_flg         = hjs_cre_flg        	;	}
	public void setMty_flg            ( String              mty_flg             ){	this.mty_flg             = mty_flg            	;	}
	public void setOwnr_co_cd         ( String              ownr_co_cd          ){	this.ownr_co_cd          = ownr_co_cd         	;	}
	public void setCntr_use_co_cd     ( String              cntr_use_co_cd      ){	this.cntr_use_co_cd      = cntr_use_co_cd     	;	}
	public void setCntr_sts_cd        ( String              cntr_sts_cd         ){	this.cntr_sts_cd         = cntr_sts_cd        	;	}
	public void setCntr_pkup_no       ( String              cntr_pkup_no        ){	this.cntr_pkup_no        = cntr_pkup_no       	;	}
	public void setCntr_pkup_dt       ( String              cntr_pkup_dt        ){	this.cntr_pkup_dt        = cntr_pkup_dt       	;	}
	public void setCntr_pkup_met_cd   ( String              cntr_pkup_met_cd    ){	this.cntr_pkup_met_cd    = cntr_pkup_met_cd   	;	}
	public void setNis_evnt_dt        ( String              nis_evnt_dt         ){	this.nis_evnt_dt         = nis_evnt_dt        	;	}
	public void setCust_rmk           ( String              cust_rmk            ){	this.cust_rmk            = cust_rmk           	;	}
	public void setUclm_flg           ( String              uclm_flg            ){	this.uclm_flg            = uclm_flg           	;	}
	public void setUclm_dt            ( String              uclm_dt             ){	this.uclm_dt             = uclm_dt            	;	}
	public void setUclm_upd_usr_id    ( String              uclm_upd_usr_id     ){	this.uclm_upd_usr_id     = uclm_upd_usr_id    	;	}
	public void setUclm_upd_dt        ( String              uclm_upd_dt         ){	this.uclm_upd_dt         = uclm_upd_dt        	;	}
	public void setUclm_upd_rmk       ( String              uclm_upd_rmk        ){	this.uclm_upd_rmk        = uclm_upd_rmk       	;	}
	public void setRf_tp_cd           ( String              rf_tp_cd            ){	this.rf_tp_cd            = rf_tp_cd           	;	}
	public void setUclm_free_dys      ( String              uclm_free_dys       ){	this.uclm_free_dys       = uclm_free_dys      	;	}
	public void setUclm_ls_flg2       ( String              uclm_ls_flg2        ){	this.uclm_ls_flg2        = uclm_ls_flg2       	;	}
	public void setUclm_ls_flg        ( String              uclm_ls_flg         ){	this.uclm_ls_flg         = uclm_ls_flg        	;	}
	public void setCntr_lst_sts_cd    ( String              cntr_lst_sts_cd     ){	this.cntr_lst_sts_cd     = cntr_lst_sts_cd    	;	}
	public void setCntr_spcl_dmg_flg  ( String              cntr_spcl_dmg_flg   ){	this.cntr_spcl_dmg_flg   = cntr_spcl_dmg_flg  	;	}
	public void setMin_onh_dys        ( String              min_onh_dys         ){	this.min_onh_dys         = min_onh_dys        	;	}
	public void setUclm_rmk           ( String              uclm_rmk            ){	this.uclm_rmk            = uclm_rmk           	;	}
	public void setPlst_flr_flg       ( String              plst_flr_flg        ){	this.plst_flr_flg        = plst_flr_flg       	;	}
	public void setAuth_no            ( String              auth_no             ){	this.auth_no             = auth_no            	;	}
	public void setRf_up_rt_dt        ( String              rf_up_rt_dt         ){	this.rf_up_rt_dt         = rf_up_rt_dt        	;	}
	public void setSub_lstm_cd        ( String              sub_lstm_cd         ){	this.sub_lstm_cd         = sub_lstm_cd        	;	}
	public void setCntr_lst_seq       ( String              cntr_lst_seq        ){	this.cntr_lst_seq        = cntr_lst_seq       	;	}
	public void setCntr_hngr_bar_flg  ( String              cntr_hngr_bar_flg   ){	this.cntr_hngr_bar_flg   = cntr_hngr_bar_flg  	;	}
	public void setCntr_curr_cd       ( String              cntr_curr_cd        ){	this.cntr_curr_cd        = cntr_curr_cd       	;	}
	public void setCntr_curr_amt      ( String              cntr_curr_amt       ){	this.cntr_curr_amt       = cntr_curr_amt      	;	}
	public void setCntr_invst_cd      ( String              cntr_invst_cd       ){	this.cntr_invst_cd       = cntr_invst_cd      	;	}
	public void setErp_if_flg         ( String              erp_if_flg          ){	this.erp_if_flg          = erp_if_flg         	;	}
	public void setErp_if_dt          ( String              erp_if_dt           ){	this.erp_if_dt           = erp_if_dt          	;	}
	public void setEcc_cd             ( String              ecc_cd              ){	this.ecc_cd              = ecc_cd             	;	}
	public void setAcct_qty_mzd_cd    ( String              acct_qty_mzd_cd     ){	this.acct_qty_mzd_cd     = acct_qty_mzd_cd    	;	}
	public void setEai_evnt_dt        ( String              eai_evnt_dt         ){	this.eai_evnt_dt         = eai_evnt_dt        	;	}

	public static MST_CONTAINER fromRequest(HttpServletRequest request) {
		MST_CONTAINER model = new MST_CONTAINER();
		try {
			model.setIbflag             	(JSPUtil.getParameter(request, "ibflag             		".trim(), ""));
			model.setPage_rows          	(JSPUtil.getParameter(request, "page_rows          		".trim(), ""));
			model.setCntr_no            	(JSPUtil.getParameter(request, "cntr_no            		".trim(), ""));
			model.setSvr_id             	(JSPUtil.getParameter(request, "svr_id             		".trim(), ""));
			model.setSvr_flg            	(JSPUtil.getParameter(request, "svr_flg            		".trim(), ""));
			model.setMgst_no            	(JSPUtil.getParameter(request, "mgst_no            		".trim(), ""));
			model.setCtrt_ofc_cty_cd    	(JSPUtil.getParameter(request, "ctrt_ofc_cty_cd    		".trim(), ""));
			model.setCtrt_seq           	(JSPUtil.getParameter(request, "ctrt_seq           		".trim(), ""));
			model.setVndr_cnt_cd        	(JSPUtil.getParameter(request, "vndr_cnt_cd        		".trim(), ""));
			model.setVndr_seq           	(JSPUtil.getParameter(request, "vndr_seq           		".trim(), ""));
			model.setOnh_dt             	(JSPUtil.getParameter(request, "onh_dt             		".trim(), ""));
			model.setOnh_yd_cd          	(JSPUtil.getParameter(request, "onh_yd_cd          		".trim(), ""));
			model.setOnh_free_dys       	(JSPUtil.getParameter(request, "onh_free_dys       		".trim(), ""));
			model.setCntr_mtrl_cd       	(JSPUtil.getParameter(request, "cntr_mtrl_cd       		".trim(), ""));
			model.setCnmv_yr            	(JSPUtil.getParameter(request, "cnmv_yr            		".trim(), ""));
			model.setCnmv_seq           	(JSPUtil.getParameter(request, "cnmv_seq           		".trim(), ""));
			model.setCnmv_split_no      	(JSPUtil.getParameter(request, "cnmv_split_no      		".trim(), ""));
			model.setLst_sts_yd_cd      	(JSPUtil.getParameter(request, "lst_sts_yd_cd      		".trim(), ""));
			model.setLst_sts_seq        	(JSPUtil.getParameter(request, "lst_sts_seq        		".trim(), ""));
			model.setCntr_in_flg        	(JSPUtil.getParameter(request, "cntr_in_flg        		".trim(), ""));
			model.setCrnt_yd_cd         	(JSPUtil.getParameter(request, "crnt_yd_cd         		".trim(), ""));
			model.setScc_cd             	(JSPUtil.getParameter(request, "scc_cd             		".trim(), ""));
			model.setLcc_cd             	(JSPUtil.getParameter(request, "lcc_cd             		".trim(), ""));
			model.setRcc_cd             	(JSPUtil.getParameter(request, "rcc_cd             		".trim(), ""));
			model.setDest_yd_cd         	(JSPUtil.getParameter(request, "dest_yd_cd         		".trim(), ""));
			model.setVsl_cd             	(JSPUtil.getParameter(request, "vsl_cd             		".trim(), ""));
			model.setSkd_voy_no         	(JSPUtil.getParameter(request, "skd_voy_no         		".trim(), ""));
			model.setSkd_dir_cd         	(JSPUtil.getParameter(request, "skd_dir_cd         		".trim(), ""));
			model.setCnmv_sts_cd        	(JSPUtil.getParameter(request, "cnmv_sts_cd        		".trim(), ""));
			model.setAciac_div_cd       	(JSPUtil.getParameter(request, "aciac_div_cd       		".trim(), ""));
			model.setCntr_tpsz_cd       	(JSPUtil.getParameter(request, "cntr_tpsz_cd       		".trim(), ""));
			model.setCntr_pfx_cd        	(JSPUtil.getParameter(request, "cntr_pfx_cd        		".trim(), ""));
			model.setLstm_cd            	(JSPUtil.getParameter(request, "lstm_cd            		".trim(), ""));
			model.setCntr_spec_no       	(JSPUtil.getParameter(request, "cntr_spec_no       		".trim(), ""));
			model.setMftr_vndr_cnt_cd   	(JSPUtil.getParameter(request, "mftr_vndr_cnt_cd   		".trim(), ""));
			model.setMftr_vndr_seq      	(JSPUtil.getParameter(request, "mftr_vndr_seq      		".trim(), ""));
			model.setMft_dt             	(JSPUtil.getParameter(request, "mft_dt             		".trim(), ""));
			model.setTare_wgt           	(JSPUtil.getParameter(request, "tare_wgt           		".trim(), ""));
			model.setCntr_cyc_no        	(JSPUtil.getParameter(request, "cntr_cyc_no        		".trim(), ""));
			model.setCntr_hngr_rck_flg  	(JSPUtil.getParameter(request, "cntr_hngr_rck_flg  		".trim(), ""));
			model.setDmg_flg            	(JSPUtil.getParameter(request, "dmg_flg            		".trim(), ""));
			model.setFull_flg           	(JSPUtil.getParameter(request, "full_flg           		".trim(), ""));
			model.setCntr_rmk           	(JSPUtil.getParameter(request, "cntr_rmk           		".trim(), ""));
			model.setCntr_sys_dt        	(JSPUtil.getParameter(request, "cntr_sys_dt        		".trim(), ""));
			model.setCntr_usr_id        	(JSPUtil.getParameter(request, "cntr_usr_id        		".trim(), ""));
			model.setUpd_dt             	(JSPUtil.getParameter(request, "upd_dt             		".trim(), ""));
			model.setUpd_usr_id         	(JSPUtil.getParameter(request, "upd_usr_id         		".trim(), ""));
			model.setDelt_flg           	(JSPUtil.getParameter(request, "delt_flg           		".trim(), ""));
			model.setRfub_flg           	(JSPUtil.getParameter(request, "rfub_flg           		".trim(), ""));
			model.setRfub_dt            	(JSPUtil.getParameter(request, "rfub_dt            		".trim(), ""));
			model.setDisp_flg           	(JSPUtil.getParameter(request, "disp_flg           		".trim(), ""));
			model.setImdt_ext_flg       	(JSPUtil.getParameter(request, "imdt_ext_flg       		".trim(), ""));
			model.setCnmv_dt            	(JSPUtil.getParameter(request, "cnmv_dt            		".trim(), ""));
			model.setCnmv_op_cd         	(JSPUtil.getParameter(request, "cnmv_op_cd         		".trim(), ""));
			model.setAcpt_dt            	(JSPUtil.getParameter(request, "acpt_dt            		".trim(), ""));
			model.setCnmv_gmt_dt        	(JSPUtil.getParameter(request, "cnmv_gmt_dt        		".trim(), ""));
			model.setCntr_dat_cng_nm    	(JSPUtil.getParameter(request, "cntr_dat_cng_nm    		".trim(), ""));
			model.setCntr_dat_cng_dt    	(JSPUtil.getParameter(request, "cntr_dat_cng_dt    		".trim(), ""));
			model.setCntr_dat_cng_svc_nm	(JSPUtil.getParameter(request, "cntr_dat_cng_svc_nm		".trim(), ""));
			model.setCntr_dat_cng_svr_nm	(JSPUtil.getParameter(request, "cntr_dat_cng_svr_nm		".trim(), ""));
			model.setHjs_cre_flg        	(JSPUtil.getParameter(request, "hjs_cre_flg        		".trim(), ""));
			model.setMty_flg            	(JSPUtil.getParameter(request, "mty_flg            		".trim(), ""));
			model.setOwnr_co_cd         	(JSPUtil.getParameter(request, "ownr_co_cd         		".trim(), ""));
			model.setCntr_use_co_cd     	(JSPUtil.getParameter(request, "cntr_use_co_cd     		".trim(), ""));
			model.setCntr_sts_cd        	(JSPUtil.getParameter(request, "cntr_sts_cd        		".trim(), ""));
			model.setCntr_pkup_no       	(JSPUtil.getParameter(request, "cntr_pkup_no       		".trim(), ""));
			model.setCntr_pkup_dt       	(JSPUtil.getParameter(request, "cntr_pkup_dt       		".trim(), ""));
			model.setCntr_pkup_met_cd   	(JSPUtil.getParameter(request, "cntr_pkup_met_cd   		".trim(), ""));
			model.setNis_evnt_dt        	(JSPUtil.getParameter(request, "nis_evnt_dt        		".trim(), ""));
			model.setCust_rmk           	(JSPUtil.getParameter(request, "cust_rmk           		".trim(), ""));
			model.setUclm_flg           	(JSPUtil.getParameter(request, "uclm_flg           		".trim(), ""));
			model.setUclm_dt            	(JSPUtil.getParameter(request, "uclm_dt            		".trim(), ""));
			model.setUclm_upd_usr_id    	(JSPUtil.getParameter(request, "uclm_upd_usr_id    		".trim(), ""));
			model.setUclm_upd_dt        	(JSPUtil.getParameter(request, "uclm_upd_dt        		".trim(), ""));
			model.setUclm_upd_rmk       	(JSPUtil.getParameter(request, "uclm_upd_rmk       		".trim(), ""));
			model.setRf_tp_cd           	(JSPUtil.getParameter(request, "rf_tp_cd           		".trim(), ""));
			model.setUclm_free_dys      	(JSPUtil.getParameter(request, "uclm_free_dys      		".trim(), ""));
			model.setUclm_ls_flg2       	(JSPUtil.getParameter(request, "uclm_ls_flg2       		".trim(), ""));
			model.setUclm_ls_flg        	(JSPUtil.getParameter(request, "uclm_ls_flg        		".trim(), ""));
			model.setCntr_lst_sts_cd    	(JSPUtil.getParameter(request, "cntr_lst_sts_cd    		".trim(), ""));
			model.setCntr_spcl_dmg_flg  	(JSPUtil.getParameter(request, "cntr_spcl_dmg_flg  		".trim(), ""));
			model.setMin_onh_dys        	(JSPUtil.getParameter(request, "min_onh_dys        		".trim(), ""));
			model.setUclm_rmk           	(JSPUtil.getParameter(request, "uclm_rmk           		".trim(), ""));
			model.setPlst_flr_flg       	(JSPUtil.getParameter(request, "plst_flr_flg       		".trim(), ""));
			model.setAuth_no            	(JSPUtil.getParameter(request, "auth_no            		".trim(), ""));
			model.setRf_up_rt_dt        	(JSPUtil.getParameter(request, "rf_up_rt_dt        		".trim(), ""));
			model.setSub_lstm_cd        	(JSPUtil.getParameter(request, "sub_lstm_cd        		".trim(), ""));
			model.setCntr_lst_seq       	(JSPUtil.getParameter(request, "cntr_lst_seq       		".trim(), ""));
			model.setCntr_hngr_bar_flg  	(JSPUtil.getParameter(request, "cntr_hngr_bar_flg  		".trim(), ""));
			model.setCntr_curr_cd       	(JSPUtil.getParameter(request, "cntr_curr_cd       		".trim(), ""));
			model.setCntr_curr_amt      	(JSPUtil.getParameter(request, "cntr_curr_amt      		".trim(), ""));
			model.setCntr_invst_cd      	(JSPUtil.getParameter(request, "cntr_invst_cd      		".trim(), ""));
			model.setErp_if_flg         	(JSPUtil.getParameter(request, "erp_if_flg         		".trim(), ""));
			model.setErp_if_dt          	(JSPUtil.getParameter(request, "erp_if_dt          		".trim(), ""));
			model.setEcc_cd             	(JSPUtil.getParameter(request, "ecc_cd             		".trim(), ""));
			model.setAcct_qty_mzd_cd    	(JSPUtil.getParameter(request, "acct_qty_mzd_cd    		".trim(), ""));
			model.setEai_evnt_dt        	(JSPUtil.getParameter(request, "eai_evnt_dt        		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		MST_CONTAINER model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag              =  (JSPUtil.getParameter(request, "ibflag             		".trim(), length));
			String[] page_rows           =  (JSPUtil.getParameter(request, "page_rows          		".trim(), length));
			String[] cntr_no             =  (JSPUtil.getParameter(request, "cntr_no            		".trim(), length));
			String[] svr_id              =  (JSPUtil.getParameter(request, "svr_id             		".trim(), length));
			String[] svr_flg             =  (JSPUtil.getParameter(request, "svr_flg            		".trim(), length));
			String[] mgst_no             =  (JSPUtil.getParameter(request, "mgst_no            		".trim(), length));
			String[] ctrt_ofc_cty_cd     =  (JSPUtil.getParameter(request, "ctrt_ofc_cty_cd    		".trim(), length));
			String[] ctrt_seq            =  (JSPUtil.getParameter(request, "ctrt_seq           		".trim(), length));
			String[] vndr_cnt_cd         =  (JSPUtil.getParameter(request, "vndr_cnt_cd        		".trim(), length));
			String[] vndr_seq            =  (JSPUtil.getParameter(request, "vndr_seq           		".trim(), length));
			String[] onh_dt              =  (JSPUtil.getParameter(request, "onh_dt             		".trim(), length));
			String[] onh_yd_cd           =  (JSPUtil.getParameter(request, "onh_yd_cd          		".trim(), length));
			String[] onh_free_dys        =  (JSPUtil.getParameter(request, "onh_free_dys       		".trim(), length));
			String[] cntr_mtrl_cd        =  (JSPUtil.getParameter(request, "cntr_mtrl_cd       		".trim(), length));
			String[] cnmv_yr             =  (JSPUtil.getParameter(request, "cnmv_yr            		".trim(), length));
			String[] cnmv_seq            =  (JSPUtil.getParameter(request, "cnmv_seq           		".trim(), length));
			String[] cnmv_split_no       =  (JSPUtil.getParameter(request, "cnmv_split_no      		".trim(), length));
			String[] lst_sts_yd_cd       =  (JSPUtil.getParameter(request, "lst_sts_yd_cd      		".trim(), length));
			String[] lst_sts_seq         =  (JSPUtil.getParameter(request, "lst_sts_seq        		".trim(), length));
			String[] cntr_in_flg         =  (JSPUtil.getParameter(request, "cntr_in_flg        		".trim(), length));
			String[] crnt_yd_cd          =  (JSPUtil.getParameter(request, "crnt_yd_cd         		".trim(), length));
			String[] scc_cd              =  (JSPUtil.getParameter(request, "scc_cd             		".trim(), length));
			String[] lcc_cd              =  (JSPUtil.getParameter(request, "lcc_cd             		".trim(), length));
			String[] rcc_cd              =  (JSPUtil.getParameter(request, "rcc_cd             		".trim(), length));
			String[] dest_yd_cd          =  (JSPUtil.getParameter(request, "dest_yd_cd         		".trim(), length));
			String[] vsl_cd              =  (JSPUtil.getParameter(request, "vsl_cd             		".trim(), length));
			String[] skd_voy_no          =  (JSPUtil.getParameter(request, "skd_voy_no         		".trim(), length));
			String[] skd_dir_cd          =  (JSPUtil.getParameter(request, "skd_dir_cd         		".trim(), length));
			String[] cnmv_sts_cd         =  (JSPUtil.getParameter(request, "cnmv_sts_cd        		".trim(), length));
			String[] aciac_div_cd        =  (JSPUtil.getParameter(request, "aciac_div_cd       		".trim(), length));
			String[] cntr_tpsz_cd        =  (JSPUtil.getParameter(request, "cntr_tpsz_cd       		".trim(), length));
			String[] cntr_pfx_cd         =  (JSPUtil.getParameter(request, "cntr_pfx_cd        		".trim(), length));
			String[] lstm_cd             =  (JSPUtil.getParameter(request, "lstm_cd            		".trim(), length));
			String[] cntr_spec_no        =  (JSPUtil.getParameter(request, "cntr_spec_no       		".trim(), length));
			String[] mftr_vndr_cnt_cd    =  (JSPUtil.getParameter(request, "mftr_vndr_cnt_cd   		".trim(), length));
			String[] mftr_vndr_seq       =  (JSPUtil.getParameter(request, "mftr_vndr_seq      		".trim(), length));
			String[] mft_dt              =  (JSPUtil.getParameter(request, "mft_dt             		".trim(), length));
			String[] tare_wgt            =  (JSPUtil.getParameter(request, "tare_wgt           		".trim(), length));
			String[] cntr_cyc_no         =  (JSPUtil.getParameter(request, "cntr_cyc_no        		".trim(), length));
			String[] cntr_hngr_rck_flg   =  (JSPUtil.getParameter(request, "cntr_hngr_rck_flg  		".trim(), length));
			String[] dmg_flg             =  (JSPUtil.getParameter(request, "dmg_flg            		".trim(), length));
			String[] full_flg            =  (JSPUtil.getParameter(request, "full_flg           		".trim(), length));
			String[] cntr_rmk            =  (JSPUtil.getParameter(request, "cntr_rmk           		".trim(), length));
			String[] cntr_sys_dt         =  (JSPUtil.getParameter(request, "cntr_sys_dt        		".trim(), length));
			String[] cntr_usr_id         =  (JSPUtil.getParameter(request, "cntr_usr_id        		".trim(), length));
			String[] upd_dt              =  (JSPUtil.getParameter(request, "upd_dt             		".trim(), length));
			String[] upd_usr_id          =  (JSPUtil.getParameter(request, "upd_usr_id         		".trim(), length));
			String[] delt_flg            =  (JSPUtil.getParameter(request, "delt_flg           		".trim(), length));
			String[] rfub_flg            =  (JSPUtil.getParameter(request, "rfub_flg           		".trim(), length));
			String[] rfub_dt             =  (JSPUtil.getParameter(request, "rfub_dt            		".trim(), length));
			String[] disp_flg            =  (JSPUtil.getParameter(request, "disp_flg           		".trim(), length));
			String[] imdt_ext_flg        =  (JSPUtil.getParameter(request, "imdt_ext_flg       		".trim(), length));
			String[] cnmv_dt             =  (JSPUtil.getParameter(request, "cnmv_dt            		".trim(), length));
			String[] cnmv_op_cd          =  (JSPUtil.getParameter(request, "cnmv_op_cd         		".trim(), length));
			String[] acpt_dt             =  (JSPUtil.getParameter(request, "acpt_dt            		".trim(), length));
			String[] cnmv_gmt_dt         =  (JSPUtil.getParameter(request, "cnmv_gmt_dt        		".trim(), length));
			String[] cntr_dat_cng_nm     =  (JSPUtil.getParameter(request, "cntr_dat_cng_nm    		".trim(), length));
			String[] cntr_dat_cng_dt     =  (JSPUtil.getParameter(request, "cntr_dat_cng_dt    		".trim(), length));
			String[] cntr_dat_cng_svc_nm =  (JSPUtil.getParameter(request, "cntr_dat_cng_svc_nm		".trim(), length));
			String[] cntr_dat_cng_svr_nm =  (JSPUtil.getParameter(request, "cntr_dat_cng_svr_nm		".trim(), length));
			String[] hjs_cre_flg         =  (JSPUtil.getParameter(request, "hjs_cre_flg        		".trim(), length));
			String[] mty_flg             =  (JSPUtil.getParameter(request, "mty_flg            		".trim(), length));
			String[] ownr_co_cd          =  (JSPUtil.getParameter(request, "ownr_co_cd         		".trim(), length));
			String[] cntr_use_co_cd      =  (JSPUtil.getParameter(request, "cntr_use_co_cd     		".trim(), length));
			String[] cntr_sts_cd         =  (JSPUtil.getParameter(request, "cntr_sts_cd        		".trim(), length));
			String[] cntr_pkup_no        =  (JSPUtil.getParameter(request, "cntr_pkup_no       		".trim(), length));
			String[] cntr_pkup_dt        =  (JSPUtil.getParameter(request, "cntr_pkup_dt       		".trim(), length));
			String[] cntr_pkup_met_cd    =  (JSPUtil.getParameter(request, "cntr_pkup_met_cd   		".trim(), length));
			String[] nis_evnt_dt         =  (JSPUtil.getParameter(request, "nis_evnt_dt        		".trim(), length));
			String[] cust_rmk            =  (JSPUtil.getParameter(request, "cust_rmk           		".trim(), length));
			String[] uclm_flg            =  (JSPUtil.getParameter(request, "uclm_flg           		".trim(), length));
			String[] uclm_dt             =  (JSPUtil.getParameter(request, "uclm_dt            		".trim(), length));
			String[] uclm_upd_usr_id     =  (JSPUtil.getParameter(request, "uclm_upd_usr_id    		".trim(), length));
			String[] uclm_upd_dt         =  (JSPUtil.getParameter(request, "uclm_upd_dt        		".trim(), length));
			String[] uclm_upd_rmk        =  (JSPUtil.getParameter(request, "uclm_upd_rmk       		".trim(), length));
			String[] rf_tp_cd            =  (JSPUtil.getParameter(request, "rf_tp_cd           		".trim(), length));
			String[] uclm_free_dys       =  (JSPUtil.getParameter(request, "uclm_free_dys      		".trim(), length));
			String[] uclm_ls_flg2        =  (JSPUtil.getParameter(request, "uclm_ls_flg2       		".trim(), length));
			String[] uclm_ls_flg         =  (JSPUtil.getParameter(request, "uclm_ls_flg        		".trim(), length));
			String[] cntr_lst_sts_cd     =  (JSPUtil.getParameter(request, "cntr_lst_sts_cd    		".trim(), length));
			String[] cntr_spcl_dmg_flg   =  (JSPUtil.getParameter(request, "cntr_spcl_dmg_flg  		".trim(), length));
			String[] min_onh_dys         =  (JSPUtil.getParameter(request, "min_onh_dys        		".trim(), length));
			String[] uclm_rmk            =  (JSPUtil.getParameter(request, "uclm_rmk           		".trim(), length));
			String[] plst_flr_flg        =  (JSPUtil.getParameter(request, "plst_flr_flg       		".trim(), length));
			String[] auth_no             =  (JSPUtil.getParameter(request, "auth_no            		".trim(), length));
			String[] rf_up_rt_dt         =  (JSPUtil.getParameter(request, "rf_up_rt_dt        		".trim(), length));
			String[] sub_lstm_cd         =  (JSPUtil.getParameter(request, "sub_lstm_cd        		".trim(), length));
			String[] cntr_lst_seq        =  (JSPUtil.getParameter(request, "cntr_lst_seq       		".trim(), length));
			String[] cntr_hngr_bar_flg   =  (JSPUtil.getParameter(request, "cntr_hngr_bar_flg  		".trim(), length));
			String[] cntr_curr_cd        =  (JSPUtil.getParameter(request, "cntr_curr_cd       		".trim(), length));
			String[] cntr_curr_amt       =  (JSPUtil.getParameter(request, "cntr_curr_amt      		".trim(), length));
			String[] cntr_invst_cd       =  (JSPUtil.getParameter(request, "cntr_invst_cd      		".trim(), length));
			String[] erp_if_flg          =  (JSPUtil.getParameter(request, "erp_if_flg         		".trim(), length));
			String[] erp_if_dt           =  (JSPUtil.getParameter(request, "erp_if_dt          		".trim(), length));
			String[] ecc_cd              =  (JSPUtil.getParameter(request, "ecc_cd             		".trim(), length));
			String[] acct_qty_mzd_cd     =  (JSPUtil.getParameter(request, "acct_qty_mzd_cd    		".trim(), length));
			String[] eai_evnt_dt         =  (JSPUtil.getParameter(request, "eai_evnt_dt        		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new MST_CONTAINER();
				model.setIbflag             		  (ibflag             	[i]);
				model.setPage_rows          		  (page_rows          	[i]);
				model.setCntr_no            		  (cntr_no            	[i]);
				model.setSvr_id             		  (svr_id             	[i]);
				model.setSvr_flg            		  (svr_flg            	[i]);
				model.setMgst_no            		  (mgst_no            	[i]);
				model.setCtrt_ofc_cty_cd    		  (ctrt_ofc_cty_cd    	[i]);
				model.setCtrt_seq           		  (ctrt_seq           	[i]);
				model.setVndr_cnt_cd        		  (vndr_cnt_cd        	[i]);
				model.setVndr_seq           		  (vndr_seq           	[i]);
				model.setOnh_dt             		  (onh_dt             	[i]);
				model.setOnh_yd_cd          		  (onh_yd_cd          	[i]);
				model.setOnh_free_dys       		  (onh_free_dys       	[i]);
				model.setCntr_mtrl_cd       		  (cntr_mtrl_cd       	[i]);
				model.setCnmv_yr            		  (cnmv_yr            	[i]);
				model.setCnmv_seq           		  (cnmv_seq           	[i]);
				model.setCnmv_split_no      		  (cnmv_split_no      	[i]);
				model.setLst_sts_yd_cd      		  (lst_sts_yd_cd      	[i]);
				model.setLst_sts_seq        		  (lst_sts_seq        	[i]);
				model.setCntr_in_flg        		  (cntr_in_flg        	[i]);
				model.setCrnt_yd_cd         		  (crnt_yd_cd         	[i]);
				model.setScc_cd             		  (scc_cd             	[i]);
				model.setLcc_cd             		  (lcc_cd             	[i]);
				model.setRcc_cd             		  (rcc_cd             	[i]);
				model.setDest_yd_cd         		  (dest_yd_cd         	[i]);
				model.setVsl_cd             		  (vsl_cd             	[i]);
				model.setSkd_voy_no         		  (skd_voy_no         	[i]);
				model.setSkd_dir_cd         		  (skd_dir_cd         	[i]);
				model.setCnmv_sts_cd        		  (cnmv_sts_cd        	[i]);
				model.setAciac_div_cd       		  (aciac_div_cd       	[i]);
				model.setCntr_tpsz_cd       		  (cntr_tpsz_cd       	[i]);
				model.setCntr_pfx_cd        		  (cntr_pfx_cd        	[i]);
				model.setLstm_cd            		  (lstm_cd            	[i]);
				model.setCntr_spec_no       		  (cntr_spec_no       	[i]);
				model.setMftr_vndr_cnt_cd   		  (mftr_vndr_cnt_cd   	[i]);
				model.setMftr_vndr_seq      		  (mftr_vndr_seq      	[i]);
				model.setMft_dt             		  (mft_dt             	[i]);
				model.setTare_wgt           		  (tare_wgt           	[i]);
				model.setCntr_cyc_no        		  (cntr_cyc_no        	[i]);
				model.setCntr_hngr_rck_flg  		  (cntr_hngr_rck_flg  	[i]);
				model.setDmg_flg            		  (dmg_flg            	[i]);
				model.setFull_flg           		  (full_flg           	[i]);
				model.setCntr_rmk           		  (cntr_rmk           	[i]);
				model.setCntr_sys_dt        		  (cntr_sys_dt        	[i]);
				model.setCntr_usr_id        		  (cntr_usr_id        	[i]);
				model.setUpd_dt             		  (upd_dt             	[i]);
				model.setUpd_usr_id         		  (upd_usr_id         	[i]);
				model.setDelt_flg           		  (delt_flg           	[i]);
				model.setRfub_flg           		  (rfub_flg           	[i]);
				model.setRfub_dt            		  (rfub_dt            	[i]);
				model.setDisp_flg           		  (disp_flg           	[i]);
				model.setImdt_ext_flg       		  (imdt_ext_flg       	[i]);
				model.setCnmv_dt            		  (cnmv_dt            	[i]);
				model.setCnmv_op_cd         		  (cnmv_op_cd         	[i]);
				model.setAcpt_dt            		  (acpt_dt            	[i]);
				model.setCnmv_gmt_dt        		  (cnmv_gmt_dt        	[i]);
				model.setCntr_dat_cng_nm    		  (cntr_dat_cng_nm    	[i]);
				model.setCntr_dat_cng_dt    		  (cntr_dat_cng_dt    	[i]);
				model.setCntr_dat_cng_svc_nm		  (cntr_dat_cng_svc_nm	[i]);
				model.setCntr_dat_cng_svr_nm		  (cntr_dat_cng_svr_nm	[i]);
				model.setHjs_cre_flg        		  (hjs_cre_flg        	[i]);
				model.setMty_flg            		  (mty_flg            	[i]);
				model.setOwnr_co_cd         		  (ownr_co_cd         	[i]);
				model.setCntr_use_co_cd     		  (cntr_use_co_cd     	[i]);
				model.setCntr_sts_cd        		  (cntr_sts_cd        	[i]);
				model.setCntr_pkup_no       		  (cntr_pkup_no       	[i]);
				model.setCntr_pkup_dt       		  (cntr_pkup_dt       	[i]);
				model.setCntr_pkup_met_cd   		  (cntr_pkup_met_cd   	[i]);
				model.setNis_evnt_dt        		  (nis_evnt_dt        	[i]);
				model.setCust_rmk           		  (cust_rmk           	[i]);
				model.setUclm_flg           		  (uclm_flg           	[i]);
				model.setUclm_dt            		  (uclm_dt            	[i]);
				model.setUclm_upd_usr_id    		  (uclm_upd_usr_id    	[i]);
				model.setUclm_upd_dt        		  (uclm_upd_dt        	[i]);
				model.setUclm_upd_rmk       		  (uclm_upd_rmk       	[i]);
				model.setRf_tp_cd           		  (rf_tp_cd           	[i]);
				model.setUclm_free_dys      		  (uclm_free_dys      	[i]);
				model.setUclm_ls_flg2       		  (uclm_ls_flg2       	[i]);
				model.setUclm_ls_flg        		  (uclm_ls_flg        	[i]);
				model.setCntr_lst_sts_cd    		  (cntr_lst_sts_cd    	[i]);
				model.setCntr_spcl_dmg_flg  		  (cntr_spcl_dmg_flg  	[i]);
				model.setMin_onh_dys        		  (min_onh_dys        	[i]);
				model.setUclm_rmk           		  (uclm_rmk           	[i]);
				model.setPlst_flr_flg       		  (plst_flr_flg       	[i]);
				model.setAuth_no            		  (auth_no            	[i]);
				model.setRf_up_rt_dt        		  (rf_up_rt_dt        	[i]);
				model.setSub_lstm_cd        		  (sub_lstm_cd        	[i]);
				model.setCntr_lst_seq       		  (cntr_lst_seq       	[i]);
				model.setCntr_hngr_bar_flg  		  (cntr_hngr_bar_flg  	[i]);
				model.setCntr_curr_cd       		  (cntr_curr_cd       	[i]);
				model.setCntr_curr_amt      		  (cntr_curr_amt      	[i]);
				model.setCntr_invst_cd      		  (cntr_invst_cd      	[i]);
				model.setErp_if_flg         		  (erp_if_flg         	[i]);
				model.setErp_if_dt          		  (erp_if_dt          	[i]);
				model.setEcc_cd             		  (ecc_cd             	[i]);
				model.setAcct_qty_mzd_cd    		  (acct_qty_mzd_cd    	[i]);
				model.setEai_evnt_dt        		  (eai_evnt_dt        	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		MST_CONTAINER model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag              =  (JSPUtil.getParameter(request, prefix + "ibflag             		".trim(), length));
			String[] page_rows           =  (JSPUtil.getParameter(request, prefix + "page_rows          		".trim(), length));
			String[] cntr_no             =  (JSPUtil.getParameter(request, prefix + "cntr_no            		".trim(), length));
			String[] svr_id              =  (JSPUtil.getParameter(request, prefix + "svr_id             		".trim(), length));
			String[] svr_flg             =  (JSPUtil.getParameter(request, prefix + "svr_flg            		".trim(), length));
			String[] mgst_no             =  (JSPUtil.getParameter(request, prefix + "mgst_no            		".trim(), length));
			String[] ctrt_ofc_cty_cd     =  (JSPUtil.getParameter(request, prefix + "ctrt_ofc_cty_cd    		".trim(), length));
			String[] ctrt_seq            =  (JSPUtil.getParameter(request, prefix + "ctrt_seq           		".trim(), length));
			String[] vndr_cnt_cd         =  (JSPUtil.getParameter(request, prefix + "vndr_cnt_cd        		".trim(), length));
			String[] vndr_seq            =  (JSPUtil.getParameter(request, prefix + "vndr_seq           		".trim(), length));
			String[] onh_dt              =  (JSPUtil.getParameter(request, prefix + "onh_dt             		".trim(), length));
			String[] onh_yd_cd           =  (JSPUtil.getParameter(request, prefix + "onh_yd_cd          		".trim(), length));
			String[] onh_free_dys        =  (JSPUtil.getParameter(request, prefix + "onh_free_dys       		".trim(), length));
			String[] cntr_mtrl_cd        =  (JSPUtil.getParameter(request, prefix + "cntr_mtrl_cd       		".trim(), length));
			String[] cnmv_yr             =  (JSPUtil.getParameter(request, prefix + "cnmv_yr            		".trim(), length));
			String[] cnmv_seq            =  (JSPUtil.getParameter(request, prefix + "cnmv_seq           		".trim(), length));
			String[] cnmv_split_no       =  (JSPUtil.getParameter(request, prefix + "cnmv_split_no      		".trim(), length));
			String[] lst_sts_yd_cd       =  (JSPUtil.getParameter(request, prefix + "lst_sts_yd_cd      		".trim(), length));
			String[] lst_sts_seq         =  (JSPUtil.getParameter(request, prefix + "lst_sts_seq        		".trim(), length));
			String[] cntr_in_flg         =  (JSPUtil.getParameter(request, prefix + "cntr_in_flg        		".trim(), length));
			String[] crnt_yd_cd          =  (JSPUtil.getParameter(request, prefix + "crnt_yd_cd         		".trim(), length));
			String[] scc_cd              =  (JSPUtil.getParameter(request, prefix + "scc_cd             		".trim(), length));
			String[] lcc_cd              =  (JSPUtil.getParameter(request, prefix + "lcc_cd             		".trim(), length));
			String[] rcc_cd              =  (JSPUtil.getParameter(request, prefix + "rcc_cd             		".trim(), length));
			String[] dest_yd_cd          =  (JSPUtil.getParameter(request, prefix + "dest_yd_cd         		".trim(), length));
			String[] vsl_cd              =  (JSPUtil.getParameter(request, prefix + "vsl_cd             		".trim(), length));
			String[] skd_voy_no          =  (JSPUtil.getParameter(request, prefix + "skd_voy_no         		".trim(), length));
			String[] skd_dir_cd          =  (JSPUtil.getParameter(request, prefix + "skd_dir_cd         		".trim(), length));
			String[] cnmv_sts_cd         =  (JSPUtil.getParameter(request, prefix + "cnmv_sts_cd        		".trim(), length));
			String[] aciac_div_cd        =  (JSPUtil.getParameter(request, prefix + "aciac_div_cd       		".trim(), length));
			String[] cntr_tpsz_cd        =  (JSPUtil.getParameter(request, prefix + "cntr_tpsz_cd       		".trim(), length));
			String[] cntr_pfx_cd         =  (JSPUtil.getParameter(request, prefix + "cntr_pfx_cd        		".trim(), length));
			String[] lstm_cd             =  (JSPUtil.getParameter(request, prefix + "lstm_cd            		".trim(), length));
			String[] cntr_spec_no        =  (JSPUtil.getParameter(request, prefix + "cntr_spec_no       		".trim(), length));
			String[] mftr_vndr_cnt_cd    =  (JSPUtil.getParameter(request, prefix + "mftr_vndr_cnt_cd   		".trim(), length));
			String[] mftr_vndr_seq       =  (JSPUtil.getParameter(request, prefix + "mftr_vndr_seq      		".trim(), length));
			String[] mft_dt              =  (JSPUtil.getParameter(request, prefix + "mft_dt             		".trim(), length));
			String[] tare_wgt            =  (JSPUtil.getParameter(request, prefix + "tare_wgt           		".trim(), length));
			String[] cntr_cyc_no         =  (JSPUtil.getParameter(request, prefix + "cntr_cyc_no        		".trim(), length));
			String[] cntr_hngr_rck_flg   =  (JSPUtil.getParameter(request, prefix + "cntr_hngr_rck_flg  		".trim(), length));
			String[] dmg_flg             =  (JSPUtil.getParameter(request, prefix + "dmg_flg            		".trim(), length));
			String[] full_flg            =  (JSPUtil.getParameter(request, prefix + "full_flg           		".trim(), length));
			String[] cntr_rmk            =  (JSPUtil.getParameter(request, prefix + "cntr_rmk           		".trim(), length));
			String[] cntr_sys_dt         =  (JSPUtil.getParameter(request, prefix + "cntr_sys_dt        		".trim(), length));
			String[] cntr_usr_id         =  (JSPUtil.getParameter(request, prefix + "cntr_usr_id        		".trim(), length));
			String[] upd_dt              =  (JSPUtil.getParameter(request, prefix + "upd_dt             		".trim(), length));
			String[] upd_usr_id          =  (JSPUtil.getParameter(request, prefix + "upd_usr_id         		".trim(), length));
			String[] delt_flg            =  (JSPUtil.getParameter(request, prefix + "delt_flg           		".trim(), length));
			String[] rfub_flg            =  (JSPUtil.getParameter(request, prefix + "rfub_flg           		".trim(), length));
			String[] rfub_dt             =  (JSPUtil.getParameter(request, prefix + "rfub_dt            		".trim(), length));
			String[] disp_flg            =  (JSPUtil.getParameter(request, prefix + "disp_flg           		".trim(), length));
			String[] imdt_ext_flg        =  (JSPUtil.getParameter(request, prefix + "imdt_ext_flg       		".trim(), length));
			String[] cnmv_dt             =  (JSPUtil.getParameter(request, prefix + "cnmv_dt            		".trim(), length));
			String[] cnmv_op_cd          =  (JSPUtil.getParameter(request, prefix + "cnmv_op_cd         		".trim(), length));
			String[] acpt_dt             =  (JSPUtil.getParameter(request, prefix + "acpt_dt            		".trim(), length));
			String[] cnmv_gmt_dt         =  (JSPUtil.getParameter(request, prefix + "cnmv_gmt_dt        		".trim(), length));
			String[] cntr_dat_cng_nm     =  (JSPUtil.getParameter(request, prefix + "cntr_dat_cng_nm    		".trim(), length));
			String[] cntr_dat_cng_dt     =  (JSPUtil.getParameter(request, prefix + "cntr_dat_cng_dt    		".trim(), length));
			String[] cntr_dat_cng_svc_nm =  (JSPUtil.getParameter(request, prefix + "cntr_dat_cng_svc_nm		".trim(), length));
			String[] cntr_dat_cng_svr_nm =  (JSPUtil.getParameter(request, prefix + "cntr_dat_cng_svr_nm		".trim(), length));
			String[] hjs_cre_flg         =  (JSPUtil.getParameter(request, prefix + "hjs_cre_flg        		".trim(), length));
			String[] mty_flg             =  (JSPUtil.getParameter(request, prefix + "mty_flg            		".trim(), length));
			String[] ownr_co_cd          =  (JSPUtil.getParameter(request, prefix + "ownr_co_cd         		".trim(), length));
			String[] cntr_use_co_cd      =  (JSPUtil.getParameter(request, prefix + "cntr_use_co_cd     		".trim(), length));
			String[] cntr_sts_cd         =  (JSPUtil.getParameter(request, prefix + "cntr_sts_cd        		".trim(), length));
			String[] cntr_pkup_no        =  (JSPUtil.getParameter(request, prefix + "cntr_pkup_no       		".trim(), length));
			String[] cntr_pkup_dt        =  (JSPUtil.getParameter(request, prefix + "cntr_pkup_dt       		".trim(), length));
			String[] cntr_pkup_met_cd    =  (JSPUtil.getParameter(request, prefix + "cntr_pkup_met_cd   		".trim(), length));
			String[] nis_evnt_dt         =  (JSPUtil.getParameter(request, prefix + "nis_evnt_dt        		".trim(), length));
			String[] cust_rmk            =  (JSPUtil.getParameter(request, prefix + "cust_rmk           		".trim(), length));
			String[] uclm_flg            =  (JSPUtil.getParameter(request, prefix + "uclm_flg           		".trim(), length));
			String[] uclm_dt             =  (JSPUtil.getParameter(request, prefix + "uclm_dt            		".trim(), length));
			String[] uclm_upd_usr_id     =  (JSPUtil.getParameter(request, prefix + "uclm_upd_usr_id    		".trim(), length));
			String[] uclm_upd_dt         =  (JSPUtil.getParameter(request, prefix + "uclm_upd_dt        		".trim(), length));
			String[] uclm_upd_rmk        =  (JSPUtil.getParameter(request, prefix + "uclm_upd_rmk       		".trim(), length));
			String[] rf_tp_cd            =  (JSPUtil.getParameter(request, prefix + "rf_tp_cd           		".trim(), length));
			String[] uclm_free_dys       =  (JSPUtil.getParameter(request, prefix + "uclm_free_dys      		".trim(), length));
			String[] uclm_ls_flg2        =  (JSPUtil.getParameter(request, prefix + "uclm_ls_flg2       		".trim(), length));
			String[] uclm_ls_flg         =  (JSPUtil.getParameter(request, prefix + "uclm_ls_flg        		".trim(), length));
			String[] cntr_lst_sts_cd     =  (JSPUtil.getParameter(request, prefix + "cntr_lst_sts_cd    		".trim(), length));
			String[] cntr_spcl_dmg_flg   =  (JSPUtil.getParameter(request, prefix + "cntr_spcl_dmg_flg  		".trim(), length));
			String[] min_onh_dys         =  (JSPUtil.getParameter(request, prefix + "min_onh_dys        		".trim(), length));
			String[] uclm_rmk            =  (JSPUtil.getParameter(request, prefix + "uclm_rmk           		".trim(), length));
			String[] plst_flr_flg        =  (JSPUtil.getParameter(request, prefix + "plst_flr_flg       		".trim(), length));
			String[] auth_no             =  (JSPUtil.getParameter(request, prefix + "auth_no            		".trim(), length));
			String[] rf_up_rt_dt         =  (JSPUtil.getParameter(request, prefix + "rf_up_rt_dt        		".trim(), length));
			String[] sub_lstm_cd         =  (JSPUtil.getParameter(request, prefix + "sub_lstm_cd        		".trim(), length));
			String[] cntr_lst_seq        =  (JSPUtil.getParameter(request, prefix + "cntr_lst_seq       		".trim(), length));
			String[] cntr_hngr_bar_flg   =  (JSPUtil.getParameter(request, prefix + "cntr_hngr_bar_flg  		".trim(), length));
			String[] cntr_curr_cd        =  (JSPUtil.getParameter(request, prefix + "cntr_curr_cd       		".trim(), length));
			String[] cntr_curr_amt       =  (JSPUtil.getParameter(request, prefix + "cntr_curr_amt      		".trim(), length));
			String[] cntr_invst_cd       =  (JSPUtil.getParameter(request, prefix + "cntr_invst_cd      		".trim(), length));
			String[] erp_if_flg          =  (JSPUtil.getParameter(request, prefix + "erp_if_flg         		".trim(), length));
			String[] erp_if_dt           =  (JSPUtil.getParameter(request, prefix + "erp_if_dt          		".trim(), length));
			String[] ecc_cd              =  (JSPUtil.getParameter(request, prefix + "ecc_cd             		".trim(), length));
			String[] acct_qty_mzd_cd     =  (JSPUtil.getParameter(request, prefix + "acct_qty_mzd_cd    		".trim(), length));
			String[] eai_evnt_dt         =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt        		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new MST_CONTAINER();
				model.setIbflag             		  ( ibflag             	[i]);
				model.setPage_rows          		  ( page_rows          	[i]);
				model.setCntr_no            		  ( cntr_no            	[i]);
				model.setSvr_id             		  ( svr_id             	[i]);
				model.setSvr_flg            		  ( svr_flg            	[i]);
				model.setMgst_no            		  ( mgst_no            	[i]);
				model.setCtrt_ofc_cty_cd    		  ( ctrt_ofc_cty_cd    	[i]);
				model.setCtrt_seq           		  ( ctrt_seq           	[i]);
				model.setVndr_cnt_cd        		  ( vndr_cnt_cd        	[i]);
				model.setVndr_seq           		  ( vndr_seq           	[i]);
				model.setOnh_dt             		  ( onh_dt             	[i]);
				model.setOnh_yd_cd          		  ( onh_yd_cd          	[i]);
				model.setOnh_free_dys       		  ( onh_free_dys       	[i]);
				model.setCntr_mtrl_cd       		  ( cntr_mtrl_cd       	[i]);
				model.setCnmv_yr            		  ( cnmv_yr            	[i]);
				model.setCnmv_seq           		  ( cnmv_seq           	[i]);
				model.setCnmv_split_no      		  ( cnmv_split_no      	[i]);
				model.setLst_sts_yd_cd      		  ( lst_sts_yd_cd      	[i]);
				model.setLst_sts_seq        		  ( lst_sts_seq        	[i]);
				model.setCntr_in_flg        		  ( cntr_in_flg        	[i]);
				model.setCrnt_yd_cd         		  ( crnt_yd_cd         	[i]);
				model.setScc_cd             		  ( scc_cd             	[i]);
				model.setLcc_cd             		  ( lcc_cd             	[i]);
				model.setRcc_cd             		  ( rcc_cd             	[i]);
				model.setDest_yd_cd         		  ( dest_yd_cd         	[i]);
				model.setVsl_cd             		  ( vsl_cd             	[i]);
				model.setSkd_voy_no         		  ( skd_voy_no         	[i]);
				model.setSkd_dir_cd         		  ( skd_dir_cd         	[i]);
				model.setCnmv_sts_cd        		  ( cnmv_sts_cd        	[i]);
				model.setAciac_div_cd       		  ( aciac_div_cd       	[i]);
				model.setCntr_tpsz_cd       		  ( cntr_tpsz_cd       	[i]);
				model.setCntr_pfx_cd        		  ( cntr_pfx_cd        	[i]);
				model.setLstm_cd            		  ( lstm_cd            	[i]);
				model.setCntr_spec_no       		  ( cntr_spec_no       	[i]);
				model.setMftr_vndr_cnt_cd   		  ( mftr_vndr_cnt_cd   	[i]);
				model.setMftr_vndr_seq      		  ( mftr_vndr_seq      	[i]);
				model.setMft_dt             		  ( mft_dt             	[i]);
				model.setTare_wgt           		  ( tare_wgt           	[i]);
				model.setCntr_cyc_no        		  ( cntr_cyc_no        	[i]);
				model.setCntr_hngr_rck_flg  		  ( cntr_hngr_rck_flg  	[i]);
				model.setDmg_flg            		  ( dmg_flg            	[i]);
				model.setFull_flg           		  ( full_flg           	[i]);
				model.setCntr_rmk           		  ( cntr_rmk           	[i]);
				model.setCntr_sys_dt        		  ( cntr_sys_dt        	[i]);
				model.setCntr_usr_id        		  ( cntr_usr_id        	[i]);
				model.setUpd_dt             		  ( upd_dt             	[i]);
				model.setUpd_usr_id         		  ( upd_usr_id         	[i]);
				model.setDelt_flg           		  ( delt_flg           	[i]);
				model.setRfub_flg           		  ( rfub_flg           	[i]);
				model.setRfub_dt            		  ( rfub_dt            	[i]);
				model.setDisp_flg           		  ( disp_flg           	[i]);
				model.setImdt_ext_flg       		  ( imdt_ext_flg       	[i]);
				model.setCnmv_dt            		  ( cnmv_dt            	[i]);
				model.setCnmv_op_cd         		  ( cnmv_op_cd         	[i]);
				model.setAcpt_dt            		  ( acpt_dt            	[i]);
				model.setCnmv_gmt_dt        		  ( cnmv_gmt_dt        	[i]);
				model.setCntr_dat_cng_nm    		  ( cntr_dat_cng_nm    	[i]);
				model.setCntr_dat_cng_dt    		  ( cntr_dat_cng_dt    	[i]);
				model.setCntr_dat_cng_svc_nm		  ( cntr_dat_cng_svc_nm	[i]);
				model.setCntr_dat_cng_svr_nm		  ( cntr_dat_cng_svr_nm	[i]);
				model.setHjs_cre_flg        		  ( hjs_cre_flg        	[i]);
				model.setMty_flg            		  ( mty_flg            	[i]);
				model.setOwnr_co_cd         		  ( ownr_co_cd         	[i]);
				model.setCntr_use_co_cd     		  ( cntr_use_co_cd     	[i]);
				model.setCntr_sts_cd        		  ( cntr_sts_cd        	[i]);
				model.setCntr_pkup_no       		  ( cntr_pkup_no       	[i]);
				model.setCntr_pkup_dt       		  ( cntr_pkup_dt       	[i]);
				model.setCntr_pkup_met_cd   		  ( cntr_pkup_met_cd   	[i]);
				model.setNis_evnt_dt        		  ( nis_evnt_dt        	[i]);
				model.setCust_rmk           		  ( cust_rmk           	[i]);
				model.setUclm_flg           		  ( uclm_flg           	[i]);
				model.setUclm_dt            		  ( uclm_dt            	[i]);
				model.setUclm_upd_usr_id    		  ( uclm_upd_usr_id    	[i]);
				model.setUclm_upd_dt        		  ( uclm_upd_dt        	[i]);
				model.setUclm_upd_rmk       		  ( uclm_upd_rmk       	[i]);
				model.setRf_tp_cd           		  ( rf_tp_cd           	[i]);
				model.setUclm_free_dys      		  ( uclm_free_dys      	[i]);
				model.setUclm_ls_flg2       		  ( uclm_ls_flg2       	[i]);
				model.setUclm_ls_flg        		  ( uclm_ls_flg        	[i]);
				model.setCntr_lst_sts_cd    		  ( cntr_lst_sts_cd    	[i]);
				model.setCntr_spcl_dmg_flg  		  ( cntr_spcl_dmg_flg  	[i]);
				model.setMin_onh_dys        		  ( min_onh_dys        	[i]);
				model.setUclm_rmk           		  ( uclm_rmk           	[i]);
				model.setPlst_flr_flg       		  ( plst_flr_flg       	[i]);
				model.setAuth_no            		  ( auth_no            	[i]);
				model.setRf_up_rt_dt        		  ( rf_up_rt_dt        	[i]);
				model.setSub_lstm_cd        		  ( sub_lstm_cd        	[i]);
				model.setCntr_lst_seq       		  ( cntr_lst_seq       	[i]);
				model.setCntr_hngr_bar_flg  		  ( cntr_hngr_bar_flg  	[i]);
				model.setCntr_curr_cd       		  ( cntr_curr_cd       	[i]);
				model.setCntr_curr_amt      		  ( cntr_curr_amt      	[i]);
				model.setCntr_invst_cd      		  ( cntr_invst_cd      	[i]);
				model.setErp_if_flg         		  ( erp_if_flg         	[i]);
				model.setErp_if_dt          		  ( erp_if_dt          	[i]);
				model.setEcc_cd             		  ( ecc_cd             	[i]);
				model.setAcct_qty_mzd_cd    		  ( acct_qty_mzd_cd    	[i]);
				model.setEai_evnt_dt        		  ( eai_evnt_dt        	[i]);
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
