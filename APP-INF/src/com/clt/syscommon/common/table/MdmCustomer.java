/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : MDM_CUSTOMER.java
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
import java.util.ArrayList;
import java.util.Collection;

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
public final class MdmCustomer implements java.io.Serializable {

	private String               ibflag               = "";
	private String               page_rows            = "";
	private String               cust_cnt_cd          = "";
	private String               cust_seq             = "";
	private String               cntr_div_flg         = "";
	private String               blk_div_flg          = "";
	private String               cust_grp_id          = "";
	private String               cust_lgl_eng_nm      = "";
	private String               cust_locl_lang_nm    = "";
	private String               cust_abbr_nm         = "";
	private String               rvis_cntr_cust_tp_cd = "";
	private String               blk_cust_tp_cd       = "";
	private String               indiv_corp_div_cd    = "";
	private String               ofc_cd               = "";
	private String               fndt_dt              = "";
	private String               cust_rgst_no         = "";
	private String               finc_sts_lvl_cd      = "";
	private String               loc_cd               = "";
	private String               capi_curr_cd         = "";
	private String               capi_amt             = "";
	private String               lstk_flg             = "";
	private String               empe_knt             = "";
	private String               vndr_seq             = "";
	private String               cust_rmk             = "";
	private String               vbs_clss_cd          = "";
	private String               nbs_clss_cd1         = "";
	private String               nbs_clss_cd2         = "";
	private String               nbs_clss_cd3         = "";
	private String               cust_sts_cd          = "";
	private String               crm_row_id           = "";
	private String               nvocc_co_scac_cd     = "";
	private String               nvocc_bd_no          = "";
	private String               nvocc_lic_no         = "";
	private String               nvocc_bd_amt         = "";
	private String               nvocc_bd_st_eff_dt   = "";
	private String               nvocc_bd_end_eff_dt  = "";
	private String               indus_desc           = "";
	private String               crnt_vol_knt         = "";
	private String               cmpt_desc            = "";
	private String               spcl_req_desc        = "";
	private String               prf_svc_desc         = "";
	private String               prf_svc_dtl_desc     = "";
	private String               prf_grp_cmdt_cd      = "";
	private String               prf_cntr_tpsz_cd     = "";
	private String               prf_rep_cmdt_cd      = "";
	private String               srep_cd              = "";
	private String               cts_no               = "";
	private String               frt_fwrd_fmc_no      = "";
	private String               key_acct_flg         = "";
	private String               key_acct_st_eff_dt   = "";
	private String               key_acct_end_eff_dt  = "";
	private String               subs_co_cd           = "";
	private String               modi_cust_cnt_cd     = "";
	private String               modi_cust_seq        = "";
	private String               rfnd_psdo_vndr_seq   = "";
	private String               bfr_ofc_cd           = "";
	private String               bfr_ofc_cng_dt       = "";
	private String               cre_usr_id           = "";
	private String               cre_dt               = "";
	private String               upd_usr_id           = "";
	private String               upd_dt               = "";
	private String               delt_flg             = "";
	private String               eai_evnt_dt          = "";
	
	//추가
	private String				key_acct_mgr_glo_usr_id = "";
	private String 				key_acct_mgr_glo_usr_nm = "";
	private String				delt_eff_dt				= "";
	private String				sls_delt_flg			= "";
	
	//추가
	private String				nmd_cust_flg			= "";
	
	
	public MdmCustomer(){}

	public MdmCustomer(
			String               ibflag              ,
			String               page_rows           ,
			String               cust_cnt_cd         ,
			String               cust_seq            ,
			String               cntr_div_flg        ,
			String               blk_div_flg         ,
			String               cust_grp_id         ,
			String               cust_lgl_eng_nm     ,
			String               cust_locl_lang_nm   ,
			String               cust_abbr_nm        ,
			String               rvis_cntr_cust_tp_cd,
			String               blk_cust_tp_cd      ,
			String               indiv_corp_div_cd   ,
			String               ofc_cd              ,
			String               fndt_dt             ,
			String               cust_rgst_no        ,
			String               finc_sts_lvl_cd     ,
			String               loc_cd              ,
			String               capi_curr_cd        ,
			String               capi_amt            ,
			String               lstk_flg            ,
			String               empe_knt            ,
			String               vndr_seq            ,
			String               cust_rmk            ,
			String               vbs_clss_cd         ,
			String               nbs_clss_cd1        ,
			String               nbs_clss_cd2        ,
			String               nbs_clss_cd3        ,
			String               cust_sts_cd         ,
			String               crm_row_id          ,
			String               nvocc_co_scac_cd    ,
			String               nvocc_bd_no         ,
			String               nvocc_lic_no        ,
			String               nvocc_bd_amt        ,
			String               nvocc_bd_st_eff_dt  ,
			String               nvocc_bd_end_eff_dt ,
			String               indus_desc          ,
			String               crnt_vol_knt        ,
			String               cmpt_desc           ,
			String               spcl_req_desc       ,
			String               prf_svc_desc        ,
			String               prf_svc_dtl_desc    ,
			String               prf_grp_cmdt_cd     ,
			String               prf_cntr_tpsz_cd    ,
			String               prf_rep_cmdt_cd     ,
			String               srep_cd             ,
			String               cts_no              ,
			String               frt_fwrd_fmc_no     ,
			String               key_acct_flg        ,
			String               key_acct_st_eff_dt  ,
			String               key_acct_end_eff_dt ,
			String               subs_co_cd          ,
			String               modi_cust_cnt_cd    ,
			String               modi_cust_seq       ,
			String               rfnd_psdo_vndr_seq  ,
			String               bfr_ofc_cd          ,
			String               bfr_ofc_cng_dt      ,
			String               cre_usr_id          ,
			String               cre_dt              ,
			String               upd_usr_id          ,
			String               upd_dt              ,
			String               delt_flg            ,
			String               eai_evnt_dt         ,
			String				 key_acct_mgr_glo_usr_id,
			String				 key_acct_mgr_gol_usr_nm,
			String				 delt_eff_dt,
			String				 sls_delt_flg, 
			String				 nmd_cust_flg			){
		this.ibflag               = ibflag              ;
		this.page_rows            = page_rows           ;
		this.cust_cnt_cd          = cust_cnt_cd         ;
		this.cust_seq             = cust_seq            ;
		this.cntr_div_flg         = cntr_div_flg        ;
		this.blk_div_flg          = blk_div_flg         ;
		this.cust_grp_id          = cust_grp_id         ;
		this.cust_lgl_eng_nm      = cust_lgl_eng_nm     ;
		this.cust_locl_lang_nm    = cust_locl_lang_nm   ;
		this.cust_abbr_nm         = cust_abbr_nm        ;
		this.rvis_cntr_cust_tp_cd = rvis_cntr_cust_tp_cd;
		this.blk_cust_tp_cd       = blk_cust_tp_cd      ;
		this.indiv_corp_div_cd    = indiv_corp_div_cd   ;
		this.ofc_cd               = ofc_cd              ;
		this.fndt_dt              = fndt_dt             ;
		this.cust_rgst_no         = cust_rgst_no        ;
		this.finc_sts_lvl_cd      = finc_sts_lvl_cd     ;
		this.loc_cd               = loc_cd              ;
		this.capi_curr_cd         = capi_curr_cd        ;
		this.capi_amt             = capi_amt            ;
		this.lstk_flg             = lstk_flg            ;
		this.empe_knt             = empe_knt            ;
		this.vndr_seq             = vndr_seq            ;
		this.cust_rmk             = cust_rmk            ;
		this.vbs_clss_cd          = vbs_clss_cd         ;
		this.nbs_clss_cd1         = nbs_clss_cd1        ;
		this.nbs_clss_cd2         = nbs_clss_cd2        ;
		this.nbs_clss_cd3         = nbs_clss_cd3        ;
		this.cust_sts_cd          = cust_sts_cd         ;
		this.crm_row_id           = crm_row_id          ;
		this.nvocc_co_scac_cd     = nvocc_co_scac_cd    ;
		this.nvocc_bd_no          = nvocc_bd_no         ;
		this.nvocc_lic_no         = nvocc_lic_no        ;
		this.nvocc_bd_amt         = nvocc_bd_amt        ;
		this.nvocc_bd_st_eff_dt   = nvocc_bd_st_eff_dt  ;
		this.nvocc_bd_end_eff_dt  = nvocc_bd_end_eff_dt ;
		this.indus_desc           = indus_desc          ;
		this.crnt_vol_knt         = crnt_vol_knt        ;
		this.cmpt_desc            = cmpt_desc           ;
		this.spcl_req_desc        = spcl_req_desc       ;
		this.prf_svc_desc         = prf_svc_desc        ;
		this.prf_svc_dtl_desc     = prf_svc_dtl_desc    ;
		this.prf_grp_cmdt_cd      = prf_grp_cmdt_cd     ;
		this.prf_cntr_tpsz_cd     = prf_cntr_tpsz_cd    ;
		this.prf_rep_cmdt_cd      = prf_rep_cmdt_cd     ;
		this.srep_cd              = srep_cd             ;
		this.cts_no               = cts_no              ;
		this.frt_fwrd_fmc_no      = frt_fwrd_fmc_no     ;
		this.key_acct_flg         = key_acct_flg        ;
		this.key_acct_st_eff_dt   = key_acct_st_eff_dt  ;
		this.key_acct_end_eff_dt  = key_acct_end_eff_dt ;
		this.subs_co_cd           = subs_co_cd          ;
		this.modi_cust_cnt_cd     = modi_cust_cnt_cd    ;
		this.modi_cust_seq        = modi_cust_seq       ;
		this.rfnd_psdo_vndr_seq   = rfnd_psdo_vndr_seq  ;
		this.bfr_ofc_cd           = bfr_ofc_cd          ;
		this.bfr_ofc_cng_dt       = bfr_ofc_cng_dt      ;
		this.cre_usr_id           = cre_usr_id          ;
		this.cre_dt               = cre_dt              ;
		this.upd_usr_id           = upd_usr_id          ;
		this.upd_dt               = upd_dt              ;
		this.delt_flg             = delt_flg            ;
		this.eai_evnt_dt          = eai_evnt_dt         ;
		this.key_acct_mgr_glo_usr_id = key_acct_mgr_glo_usr_id ;
		this.key_acct_mgr_glo_usr_nm = key_acct_mgr_gol_usr_nm ;
		this.delt_eff_dt		  = delt_eff_dt			;
		this.sls_delt_flg		  = sls_delt_flg		;
		this.nmd_cust_flg		  = nmd_cust_flg		;
	}

	// getter method is proceeding ..
	public String               getIbflag              (){	return ibflag              	;	}
	public String               getPage_rows           (){	return page_rows           	;	}
	public String               getCust_cnt_cd         (){	return cust_cnt_cd         	;	}
	public String               getCust_seq            (){	return cust_seq            	;	}
	public String               getCntr_div_flg        (){	return cntr_div_flg        	;	}
	public String               getBlk_div_flg         (){	return blk_div_flg         	;	}
	public String               getCust_grp_id         (){	return cust_grp_id         	;	}
	public String               getCust_lgl_eng_nm     (){	return cust_lgl_eng_nm     	;	}
	public String               getCust_locl_lang_nm   (){	return cust_locl_lang_nm   	;	}
	public String               getCust_abbr_nm        (){	return cust_abbr_nm        	;	}
	public String               getRvis_cntr_cust_tp_cd(){	return rvis_cntr_cust_tp_cd	;	}
	public String               getBlk_cust_tp_cd      (){	return blk_cust_tp_cd      	;	}
	public String               getIndiv_corp_div_cd   (){	return indiv_corp_div_cd   	;	}
	public String               getOfc_cd              (){	return ofc_cd              	;	}
	public String               getFndt_dt             (){	return fndt_dt             	;	}
	public String               getCust_rgst_no        (){	return cust_rgst_no        	;	}
	public String               getFinc_sts_lvl_cd     (){	return finc_sts_lvl_cd     	;	}
	public String               getLoc_cd              (){	return loc_cd              	;	}
	public String               getCapi_curr_cd        (){	return capi_curr_cd        	;	}
	public String               getCapi_amt            (){	return capi_amt            	;	}
	public String               getLstk_flg            (){	return lstk_flg            	;	}
	public String               getEmpe_knt            (){	return empe_knt            	;	}
	public String               getVndr_seq            (){	return vndr_seq            	;	}
	public String               getCust_rmk            (){	return cust_rmk            	;	}
	public String               getVbs_clss_cd         (){	return vbs_clss_cd         	;	}
	public String               getNbs_clss_cd1        (){	return nbs_clss_cd1        	;	}
	public String               getNbs_clss_cd2        (){	return nbs_clss_cd2        	;	}
	public String               getNbs_clss_cd3        (){	return nbs_clss_cd3        	;	}
	public String               getCust_sts_cd         (){	return cust_sts_cd         	;	}
	public String               getCrm_row_id          (){	return crm_row_id          	;	}
	public String               getNvocc_co_scac_cd    (){	return nvocc_co_scac_cd   	;	}
	public String               getNvocc_bd_no         (){	return nvocc_bd_no         	;	}
	public String               getNvocc_lic_no        (){	return nvocc_lic_no        	;	}
	public String               getNvocc_bd_amt        (){	return nvocc_bd_amt        	;	}
	public String               getNvocc_bd_st_eff_dt  (){	return nvocc_bd_st_eff_dt  	;	}
	public String               getNvocc_bd_end_eff_dt (){	return nvocc_bd_end_eff_dt 	;	}
	public String               getIndus_desc          (){	return indus_desc          	;	}
	public String               getCrnt_vol_knt        (){	return crnt_vol_knt        	;	}
	public String               getCmpt_desc           (){	return cmpt_desc           	;	}
	public String               getSpcl_req_desc       (){	return spcl_req_desc       	;	}
	public String               getPrf_svc_desc        (){	return prf_svc_desc        	;	}
	public String               getPrf_svc_dtl_desc    (){	return prf_svc_dtl_desc    	;	}
	public String               getPrf_grp_cmdt_cd     (){	return prf_grp_cmdt_cd     	;	}
	public String               getPrf_cntr_tpsz_cd    (){	return prf_cntr_tpsz_cd    	;	}
	public String               getPrf_rep_cmdt_cd     (){	return prf_rep_cmdt_cd     	;	}
	public String               getSrep_cd             (){	return srep_cd             	;	}
	public String               getCts_no              (){	return cts_no              	;	}
	public String               getFrt_fwrd_fmc_no     (){	return frt_fwrd_fmc_no     	;	}
	public String               getKey_acct_flg        (){	return key_acct_flg        	;	}
	public String               getKey_acct_st_eff_dt  (){	return key_acct_st_eff_dt  	;	}
	public String               getKey_acct_end_eff_dt (){	return key_acct_end_eff_dt 	;	}
	public String               getSubs_co_cd          (){	return subs_co_cd          	;	}
	public String               getModi_cust_cnt_cd    (){	return modi_cust_cnt_cd    	;	}
	public String               getModi_cust_seq       (){	return modi_cust_seq       	;	}
	public String               getRfnd_psdo_vndr_seq  (){	return rfnd_psdo_vndr_seq  	;	}
	public String               getBfr_ofc_cd          (){	return bfr_ofc_cd          	;	}
	public String               getBfr_ofc_cng_dt      (){	return bfr_ofc_cng_dt      	;	}
	public String               getCre_usr_id          (){	return cre_usr_id          	;	}
	public String               getCre_dt              (){	return cre_dt              	;	}
	public String               getUpd_usr_id          (){	return upd_usr_id          	;	}
	public String               getUpd_dt              (){	return upd_dt              	;	}
	public String               getDelt_flg            (){	return delt_flg            	;	}
	public String               getEai_evnt_dt         (){	return eai_evnt_dt         	;	}
	public String				getKey_acct_mgr_glo_usr_id () {	return key_acct_mgr_glo_usr_id;	}
	public String				getKey_acct_mgr_glo_usr_nm () {	return key_acct_mgr_glo_usr_nm;	}
	public String				getDelt_eff_dt		   (){	return delt_eff_dt			;	}
	public String 				getSls_delt_flg		   (){	return sls_delt_flg			;	}
	public String 				getNmd_cust_flg		   (){	return nmd_cust_flg			;	}
	
	// setter method is proceeding ..
	public void setIbflag              ( String               ibflag               ){	this.ibflag               = ibflag              	;	}
	public void setPage_rows           ( String               page_rows            ){	this.page_rows            = page_rows           	;	}
	public void setCust_cnt_cd         ( String               cust_cnt_cd          ){	this.cust_cnt_cd          = cust_cnt_cd         	;	}
	public void setCust_seq            ( String               cust_seq             ){	this.cust_seq             = cust_seq            	;	}
	public void setCntr_div_flg        ( String               cntr_div_flg         ){	this.cntr_div_flg         = cntr_div_flg        	;	}
	public void setBlk_div_flg         ( String               blk_div_flg          ){	this.blk_div_flg          = blk_div_flg         	;	}
	public void setCust_grp_id         ( String               cust_grp_id          ){	this.cust_grp_id          = cust_grp_id         	;	}
	public void setCust_lgl_eng_nm     ( String               cust_lgl_eng_nm      ){	this.cust_lgl_eng_nm      = cust_lgl_eng_nm     	;	}
	public void setCust_locl_lang_nm   ( String               cust_locl_lang_nm    ){	this.cust_locl_lang_nm    = cust_locl_lang_nm   	;	}
	public void setCust_abbr_nm        ( String               cust_abbr_nm         ){	this.cust_abbr_nm         = cust_abbr_nm        	;	}
	public void setRvis_cntr_cust_tp_cd( String               rvis_cntr_cust_tp_cd ){	this.rvis_cntr_cust_tp_cd = rvis_cntr_cust_tp_cd	;	}
	public void setBlk_cust_tp_cd      ( String               blk_cust_tp_cd       ){	this.blk_cust_tp_cd       = blk_cust_tp_cd      	;	}
	public void setIndiv_corp_div_cd   ( String               indiv_corp_div_cd    ){	this.indiv_corp_div_cd    = indiv_corp_div_cd   	;	}
	public void setOfc_cd              ( String               ofc_cd               ){	this.ofc_cd               = ofc_cd              	;	}
	public void setFndt_dt             ( String               fndt_dt              ){	this.fndt_dt              = fndt_dt             	;	}
	public void setCust_rgst_no        ( String               cust_rgst_no         ){	this.cust_rgst_no         = cust_rgst_no        	;	}
	public void setFinc_sts_lvl_cd     ( String               finc_sts_lvl_cd      ){	this.finc_sts_lvl_cd      = finc_sts_lvl_cd     	;	}
	public void setLoc_cd              ( String               loc_cd               ){	this.loc_cd               = loc_cd              	;	}
	public void setCapi_curr_cd        ( String               capi_curr_cd         ){	this.capi_curr_cd         = capi_curr_cd        	;	}
	public void setCapi_amt            ( String               capi_amt             ){	this.capi_amt             = capi_amt            	;	}
	public void setLstk_flg            ( String               lstk_flg             ){	this.lstk_flg             = lstk_flg            	;	}
	public void setEmpe_knt            ( String               empe_knt             ){	this.empe_knt             = empe_knt            	;	}
	public void setVndr_seq            ( String               vndr_seq             ){	this.vndr_seq             = vndr_seq            	;	}
	public void setCust_rmk            ( String               cust_rmk             ){	this.cust_rmk             = cust_rmk            	;	}
	public void setVbs_clss_cd         ( String               vbs_clss_cd          ){	this.vbs_clss_cd          = vbs_clss_cd         	;	}
	public void setNbs_clss_cd1        ( String               nbs_clss_cd1         ){	this.nbs_clss_cd1         = nbs_clss_cd1        	;	}
	public void setNbs_clss_cd2        ( String               nbs_clss_cd2         ){	this.nbs_clss_cd2         = nbs_clss_cd2        	;	}
	public void setNbs_clss_cd3        ( String               nbs_clss_cd3         ){	this.nbs_clss_cd3         = nbs_clss_cd3        	;	}
	public void setCust_sts_cd         ( String               cust_sts_cd          ){	this.cust_sts_cd          = cust_sts_cd         	;	}
	public void setCrm_row_id          ( String               crm_row_id           ){	this.crm_row_id           = crm_row_id          	;	}
	public void setNvocc_co_scac_cd    ( String               nvocc_co_scac_cd     ){	this.nvocc_co_scac_cd     = nvocc_co_scac_cd   		;	}
	public void setNvocc_bd_no         ( String               nvocc_bd_no          ){	this.nvocc_bd_no          = nvocc_bd_no         	;	}
	public void setNvocc_lic_no        ( String               nvocc_lic_no         ){	this.nvocc_lic_no         = nvocc_lic_no        	;	}
	public void setNvocc_bd_amt        ( String               nvocc_bd_amt         ){	this.nvocc_bd_amt         = nvocc_bd_amt        	;	}
	public void setNvocc_bd_st_eff_dt  ( String               nvocc_bd_st_eff_dt   ){	this.nvocc_bd_st_eff_dt   = nvocc_bd_st_eff_dt  	;	}
	public void setNvocc_bd_end_eff_dt ( String               nvocc_bd_end_eff_dt  ){	this.nvocc_bd_end_eff_dt  = nvocc_bd_end_eff_dt 	;	}
	public void setIndus_desc          ( String               indus_desc           ){	this.indus_desc           = indus_desc          	;	}
	public void setCrnt_vol_knt        ( String               crnt_vol_knt         ){	this.crnt_vol_knt         = crnt_vol_knt        	;	}
	public void setCmpt_desc           ( String               cmpt_desc            ){	this.cmpt_desc            = cmpt_desc           	;	}
	public void setSpcl_req_desc       ( String               spcl_req_desc        ){	this.spcl_req_desc        = spcl_req_desc       	;	}
	public void setPrf_svc_desc        ( String               prf_svc_desc         ){	this.prf_svc_desc         = prf_svc_desc        	;	}
	public void setPrf_svc_dtl_desc    ( String               prf_svc_dtl_desc     ){	this.prf_svc_dtl_desc     = prf_svc_dtl_desc    	;	}
	public void setPrf_grp_cmdt_cd     ( String               prf_grp_cmdt_cd      ){	this.prf_grp_cmdt_cd      = prf_grp_cmdt_cd     	;	}
	public void setPrf_cntr_tpsz_cd    ( String               prf_cntr_tpsz_cd     ){	this.prf_cntr_tpsz_cd     = prf_cntr_tpsz_cd    	;	}
	public void setPrf_rep_cmdt_cd     ( String               prf_rep_cmdt_cd      ){	this.prf_rep_cmdt_cd      = prf_rep_cmdt_cd     	;	}
	public void setSrep_cd             ( String               srep_cd              ){	this.srep_cd              = srep_cd             	;	}
	public void setCts_no              ( String               cts_no               ){	this.cts_no               = cts_no              	;	}
	public void setFrt_fwrd_fmc_no     ( String               frt_fwrd_fmc_no      ){	this.frt_fwrd_fmc_no      = frt_fwrd_fmc_no     	;	}
	public void setKey_acct_flg        ( String               key_acct_flg         ){	this.key_acct_flg         = key_acct_flg        	;	}
	public void setKey_acct_st_eff_dt  ( String               key_acct_st_eff_dt   ){	this.key_acct_st_eff_dt   = key_acct_st_eff_dt  	;	}
	public void setKey_acct_end_eff_dt ( String               key_acct_end_eff_dt  ){	this.key_acct_end_eff_dt  = key_acct_end_eff_dt 	;	}
	public void setSubs_co_cd          ( String               subs_co_cd           ){	this.subs_co_cd           = subs_co_cd          	;	}
	public void setModi_cust_cnt_cd    ( String               modi_cust_cnt_cd     ){	this.modi_cust_cnt_cd     = modi_cust_cnt_cd    	;	}
	public void setModi_cust_seq       ( String               modi_cust_seq        ){	this.modi_cust_seq        = modi_cust_seq       	;	}
	public void setRfnd_psdo_vndr_seq  ( String               rfnd_psdo_vndr_seq   ){	this.rfnd_psdo_vndr_seq   = rfnd_psdo_vndr_seq  	;	}
	public void setBfr_ofc_cd          ( String               bfr_ofc_cd           ){	this.bfr_ofc_cd           = bfr_ofc_cd          	;	}
	public void setBfr_ofc_cng_dt      ( String               bfr_ofc_cng_dt       ){	this.bfr_ofc_cng_dt       = bfr_ofc_cng_dt      	;	}
	public void setCre_usr_id          ( String               cre_usr_id           ){	this.cre_usr_id           = cre_usr_id          	;	}
	public void setCre_dt              ( String               cre_dt               ){	this.cre_dt               = cre_dt              	;	}
	public void setUpd_usr_id          ( String               upd_usr_id           ){	this.upd_usr_id           = upd_usr_id          	;	}
	public void setUpd_dt              ( String               upd_dt               ){	this.upd_dt               = upd_dt              	;	}
	public void setDelt_flg            ( String               delt_flg             ){	this.delt_flg             = delt_flg            	;	}
	public void setEai_evnt_dt         ( String               eai_evnt_dt          ){	this.eai_evnt_dt          = eai_evnt_dt         	;	}
	public void setKey_acct_mgr_glo_usr_id ( String				key_acct_mgr_glo_usr_id){	this.key_acct_mgr_glo_usr_id = key_acct_mgr_glo_usr_id;	}
	public void setKey_acct_mgr_glo_usr_nm ( String				key_acct_mgr_glo_usr_nm){	this.key_acct_mgr_glo_usr_nm = key_acct_mgr_glo_usr_nm;	}
	public void setDelt_eff_dt		   ( String				  delt_eff_dt		   ){	this.delt_eff_dt		  = delt_eff_dt				;	}
	public void setSls_delt_flg		   ( String				  sls_delt_flg		   ){	this.sls_delt_flg		  = sls_delt_flg			;	}
	public void setNmd_cust_flg		   ( String				  nmd_cust_flg		   ){	this.nmd_cust_flg		  = nmd_cust_flg			;	}
	
	public static MdmCustomer fromRequest(HttpServletRequest request) {
		MdmCustomer model = new MdmCustomer();
		try {
			model.setIbflag              	(JSPUtil.getParameter(request, "ibflag              		".trim(), ""));
			model.setPage_rows           	(JSPUtil.getParameter(request, "page_rows           		".trim(), ""));
			model.setCust_cnt_cd         	(JSPUtil.getParameter(request, "cust_cnt_cd         		".trim(), ""));
			model.setCust_seq            	(JSPUtil.getParameter(request, "cust_seq            		".trim(), ""));
			model.setCntr_div_flg        	(JSPUtil.getParameter(request, "cntr_div_flg        		".trim(), ""));
			model.setBlk_div_flg         	(JSPUtil.getParameter(request, "blk_div_flg         		".trim(), ""));
			model.setCust_grp_id         	(JSPUtil.getParameter(request, "cust_grp_id         		".trim(), ""));
			model.setCust_lgl_eng_nm     	(JSPUtil.getParameter(request, "cust_lgl_eng_nm     		".trim(), ""));
			model.setCust_locl_lang_nm   	(JSPUtil.getParameter(request, "cust_locl_lang_nm   		".trim(), ""));
			model.setCust_abbr_nm        	(JSPUtil.getParameter(request, "cust_abbr_nm        		".trim(), ""));
			model.setRvis_cntr_cust_tp_cd	(JSPUtil.getParameter(request, "rvis_cntr_cust_tp_cd		".trim(), ""));
			model.setBlk_cust_tp_cd      	(JSPUtil.getParameter(request, "blk_cust_tp_cd      		".trim(), ""));
			model.setIndiv_corp_div_cd   	(JSPUtil.getParameter(request, "indiv_corp_div_cd   		".trim(), ""));
			model.setOfc_cd              	(JSPUtil.getParameter(request, "ofc_cd              		".trim(), ""));
			model.setFndt_dt             	(JSPUtil.getParameter(request, "fndt_dt             		".trim(), ""));
			model.setCust_rgst_no        	(JSPUtil.getParameter(request, "cust_rgst_no        		".trim(), ""));
			model.setFinc_sts_lvl_cd     	(JSPUtil.getParameter(request, "finc_sts_lvl_cd     		".trim(), ""));
			model.setLoc_cd              	(JSPUtil.getParameter(request, "loc_cd              		".trim(), ""));
			model.setCapi_curr_cd        	(JSPUtil.getParameter(request, "capi_curr_cd        		".trim(), ""));
			model.setCapi_amt            	(JSPUtil.getParameter(request, "capi_amt            		".trim(), ""));
			model.setLstk_flg            	(JSPUtil.getParameter(request, "lstk_flg            		".trim(), ""));
			model.setEmpe_knt            	(JSPUtil.getParameter(request, "empe_knt            		".trim(), ""));
			model.setVndr_seq            	(JSPUtil.getParameter(request, "vndr_seq            		".trim(), ""));
			model.setCust_rmk            	(JSPUtil.getParameter(request, "cust_rmk            		".trim(), ""));
			model.setVbs_clss_cd         	(JSPUtil.getParameter(request, "vbs_clss_cd         		".trim(), ""));
			model.setNbs_clss_cd1        	(JSPUtil.getParameter(request, "nbs_clss_cd1        		".trim(), ""));
			model.setNbs_clss_cd2        	(JSPUtil.getParameter(request, "nbs_clss_cd2        		".trim(), ""));
			model.setNbs_clss_cd3        	(JSPUtil.getParameter(request, "nbs_clss_cd3        		".trim(), ""));
			model.setCust_sts_cd         	(JSPUtil.getParameter(request, "cust_sts_cd         		".trim(), ""));
			model.setCrm_row_id          	(JSPUtil.getParameter(request, "crm_row_id          		".trim(), ""));
			model.setNvocc_co_scac_cd   	(JSPUtil.getParameter(request, "nvocc_co_scac_cd   			".trim(), ""));
			model.setNvocc_bd_no         	(JSPUtil.getParameter(request, "nvocc_bd_no         		".trim(), ""));
			model.setNvocc_lic_no        	(JSPUtil.getParameter(request, "nvocc_lic_no        		".trim(), ""));
			model.setNvocc_bd_amt        	(JSPUtil.getParameter(request, "nvocc_bd_amt        		".trim(), ""));
			model.setNvocc_bd_st_eff_dt  	(JSPUtil.getParameter(request, "nvocc_bd_st_eff_dt  		".trim(), ""));
			model.setNvocc_bd_end_eff_dt 	(JSPUtil.getParameter(request, "nvocc_bd_end_eff_dt 		".trim(), ""));
			model.setIndus_desc          	(JSPUtil.getParameter(request, "indus_desc          		".trim(), ""));
			model.setCrnt_vol_knt        	(JSPUtil.getParameter(request, "crnt_vol_knt        		".trim(), ""));
			model.setCmpt_desc           	(JSPUtil.getParameter(request, "cmpt_desc           		".trim(), ""));
			model.setSpcl_req_desc       	(JSPUtil.getParameter(request, "spcl_req_desc       		".trim(), ""));
			model.setPrf_svc_desc        	(JSPUtil.getParameter(request, "prf_svc_desc        		".trim(), ""));
			model.setPrf_svc_dtl_desc    	(JSPUtil.getParameter(request, "prf_svc_dtl_desc    		".trim(), ""));
			model.setPrf_grp_cmdt_cd     	(JSPUtil.getParameter(request, "prf_grp_cmdt_cd     		".trim(), ""));
			model.setPrf_cntr_tpsz_cd    	(JSPUtil.getParameter(request, "prf_cntr_tpsz_cd    		".trim(), ""));
			model.setPrf_rep_cmdt_cd     	(JSPUtil.getParameter(request, "prf_rep_cmdt_cd     		".trim(), ""));
			model.setSrep_cd             	(JSPUtil.getParameter(request, "srep_cd             		".trim(), ""));
			model.setCts_no              	(JSPUtil.getParameter(request, "cts_no              		".trim(), ""));
			model.setFrt_fwrd_fmc_no     	(JSPUtil.getParameter(request, "frt_fwrd_fmc_no     		".trim(), ""));
			model.setKey_acct_flg        	(JSPUtil.getParameter(request, "key_acct_flg        		".trim(), ""));
			model.setKey_acct_st_eff_dt  	(JSPUtil.getParameter(request, "key_acct_st_eff_dt  		".trim(), ""));
			model.setKey_acct_end_eff_dt 	(JSPUtil.getParameter(request, "key_acct_end_eff_dt 		".trim(), ""));
			model.setSubs_co_cd          	(JSPUtil.getParameter(request, "subs_co_cd          		".trim(), ""));
			model.setModi_cust_cnt_cd    	(JSPUtil.getParameter(request, "modi_cust_cnt_cd    		".trim(), ""));
			model.setModi_cust_seq       	(JSPUtil.getParameter(request, "modi_cust_seq       		".trim(), ""));
			model.setRfnd_psdo_vndr_seq  	(JSPUtil.getParameter(request, "rfnd_psdo_vndr_seq  		".trim(), ""));
			model.setBfr_ofc_cd          	(JSPUtil.getParameter(request, "bfr_ofc_cd          		".trim(), ""));
			model.setBfr_ofc_cng_dt      	(JSPUtil.getParameter(request, "bfr_ofc_cng_dt      		".trim(), ""));
			model.setCre_usr_id          	(JSPUtil.getParameter(request, "cre_usr_id          		".trim(), ""));
			model.setCre_dt              	(JSPUtil.getParameter(request, "cre_dt              		".trim(), ""));
			model.setUpd_usr_id          	(JSPUtil.getParameter(request, "upd_usr_id          		".trim(), ""));
			model.setUpd_dt              	(JSPUtil.getParameter(request, "upd_dt              		".trim(), ""));
			model.setDelt_flg            	(JSPUtil.getParameter(request, "delt_flg            		".trim(), ""));
			model.setEai_evnt_dt         	(JSPUtil.getParameter(request, "eai_evnt_dt         		".trim(), ""));
			model.setKey_acct_mgr_glo_usr_id(JSPUtil.getParameter(request, "key_acct_mgr_glo_usr_id     ".trim(), ""));
			model.setKey_acct_mgr_glo_usr_nm(JSPUtil.getParameter(request, "key_acct_mgr_glo_usr_nm     ".trim(), ""));
			model.setDelt_eff_dt            (JSPUtil.getParameter(request, "delt_eff_dt					".trim(), ""));
			model.setSls_delt_flg           (JSPUtil.getParameter(request, "sls_delt_flg				".trim(), ""));
			model.setNmd_cust_flg           (JSPUtil.getParameter(request, "nmd_cust_flg				".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		MdmCustomer model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag               =  (JSPUtil.getParameter(request, "ibflag              		".trim(), length));
			String[] page_rows            =  (JSPUtil.getParameter(request, "page_rows           		".trim(), length));
			String[] cust_cnt_cd          =  (JSPUtil.getParameter(request, "cust_cnt_cd         		".trim(), length));
			String[] cust_seq             =  (JSPUtil.getParameter(request, "cust_seq            		".trim(), length));
			String[] cntr_div_flg         =  (JSPUtil.getParameter(request, "cntr_div_flg        		".trim(), length));
			String[] blk_div_flg          =  (JSPUtil.getParameter(request, "blk_div_flg         		".trim(), length));
			String[] cust_grp_id          =  (JSPUtil.getParameter(request, "cust_grp_id         		".trim(), length));
			String[] cust_lgl_eng_nm      =  (JSPUtil.getParameter(request, "cust_lgl_eng_nm     		".trim(), length));
			String[] cust_locl_lang_nm    =  (JSPUtil.getParameter(request, "cust_locl_lang_nm   		".trim(), length));
			String[] cust_abbr_nm         =  (JSPUtil.getParameter(request, "cust_abbr_nm        		".trim(), length));
			String[] rvis_cntr_cust_tp_cd =  (JSPUtil.getParameter(request, "rvis_cntr_cust_tp_cd		".trim(), length));
			String[] blk_cust_tp_cd       =  (JSPUtil.getParameter(request, "blk_cust_tp_cd      		".trim(), length));
			String[] indiv_corp_div_cd    =  (JSPUtil.getParameter(request, "indiv_corp_div_cd   		".trim(), length));
			String[] ofc_cd               =  (JSPUtil.getParameter(request, "ofc_cd              		".trim(), length));
			String[] fndt_dt              =  (JSPUtil.getParameter(request, "fndt_dt             		".trim(), length));
			String[] cust_rgst_no         =  (JSPUtil.getParameter(request, "cust_rgst_no        		".trim(), length));
			String[] finc_sts_lvl_cd      =  (JSPUtil.getParameter(request, "finc_sts_lvl_cd     		".trim(), length));
			String[] loc_cd               =  (JSPUtil.getParameter(request, "loc_cd              		".trim(), length));
			String[] capi_curr_cd         =  (JSPUtil.getParameter(request, "capi_curr_cd        		".trim(), length));
			String[] capi_amt             =  (JSPUtil.getParameter(request, "capi_amt            		".trim(), length));
			String[] lstk_flg             =  (JSPUtil.getParameter(request, "lstk_flg            		".trim(), length));
			String[] empe_knt             =  (JSPUtil.getParameter(request, "empe_knt            		".trim(), length));
			String[] vndr_seq             =  (JSPUtil.getParameter(request, "vndr_seq            		".trim(), length));
			String[] cust_rmk             =  (JSPUtil.getParameter(request, "cust_rmk            		".trim(), length));
			String[] vbs_clss_cd          =  (JSPUtil.getParameter(request, "vbs_clss_cd         		".trim(), length));
			String[] nbs_clss_cd1         =  (JSPUtil.getParameter(request, "nbs_clss_cd1        		".trim(), length));
			String[] nbs_clss_cd2         =  (JSPUtil.getParameter(request, "nbs_clss_cd2        		".trim(), length));
			String[] nbs_clss_cd3         =  (JSPUtil.getParameter(request, "nbs_clss_cd3        		".trim(), length));
			String[] cust_sts_cd          =  (JSPUtil.getParameter(request, "cust_sts_cd         		".trim(), length));
			String[] crm_row_id           =  (JSPUtil.getParameter(request, "crm_row_id          		".trim(), length));
			String[] nvocc_co_scac_cd     =  (JSPUtil.getParameter(request, "nvocc_co_scac_cd   		".trim(), length));
			String[] nvocc_bd_no          =  (JSPUtil.getParameter(request, "nvocc_bd_no         		".trim(), length));
			String[] nvocc_lic_no         =  (JSPUtil.getParameter(request, "nvocc_lic_no        		".trim(), length));
			String[] nvocc_bd_amt         =  (JSPUtil.getParameter(request, "nvocc_bd_amt        		".trim(), length));
			String[] nvocc_bd_st_eff_dt   =  (JSPUtil.getParameter(request, "nvocc_bd_st_eff_dt  		".trim(), length));
			String[] nvocc_bd_end_eff_dt  =  (JSPUtil.getParameter(request, "nvocc_bd_end_eff_dt 		".trim(), length));
			String[] indus_desc           =  (JSPUtil.getParameter(request, "indus_desc          		".trim(), length));
			String[] crnt_vol_knt         =  (JSPUtil.getParameter(request, "crnt_vol_knt        		".trim(), length));
			String[] cmpt_desc            =  (JSPUtil.getParameter(request, "cmpt_desc           		".trim(), length));
			String[] spcl_req_desc        =  (JSPUtil.getParameter(request, "spcl_req_desc       		".trim(), length));
			String[] prf_svc_desc         =  (JSPUtil.getParameter(request, "prf_svc_desc        		".trim(), length));
			String[] prf_svc_dtl_desc     =  (JSPUtil.getParameter(request, "prf_svc_dtl_desc    		".trim(), length));
			String[] prf_grp_cmdt_cd      =  (JSPUtil.getParameter(request, "prf_grp_cmdt_cd     		".trim(), length));
			String[] prf_cntr_tpsz_cd     =  (JSPUtil.getParameter(request, "prf_cntr_tpsz_cd    		".trim(), length));
			String[] prf_rep_cmdt_cd      =  (JSPUtil.getParameter(request, "prf_rep_cmdt_cd     		".trim(), length));
			String[] srep_cd              =  (JSPUtil.getParameter(request, "srep_cd             		".trim(), length));
			String[] cts_no               =  (JSPUtil.getParameter(request, "cts_no              		".trim(), length));
			String[] frt_fwrd_fmc_no      =  (JSPUtil.getParameter(request, "frt_fwrd_fmc_no     		".trim(), length));
			String[] key_acct_flg         =  (JSPUtil.getParameter(request, "key_acct_flg        		".trim(), length));
			String[] key_acct_st_eff_dt   =  (JSPUtil.getParameter(request, "key_acct_st_eff_dt  		".trim(), length));
			String[] key_acct_end_eff_dt  =  (JSPUtil.getParameter(request, "key_acct_end_eff_dt 		".trim(), length));
			String[] subs_co_cd           =  (JSPUtil.getParameter(request, "subs_co_cd          		".trim(), length));
			String[] modi_cust_cnt_cd     =  (JSPUtil.getParameter(request, "modi_cust_cnt_cd    		".trim(), length));
			String[] modi_cust_seq        =  (JSPUtil.getParameter(request, "modi_cust_seq       		".trim(), length));
			String[] rfnd_psdo_vndr_seq   =  (JSPUtil.getParameter(request, "rfnd_psdo_vndr_seq  		".trim(), length));
			String[] bfr_ofc_cd           =  (JSPUtil.getParameter(request, "bfr_ofc_cd          		".trim(), length));
			String[] bfr_ofc_cng_dt       =  (JSPUtil.getParameter(request, "bfr_ofc_cng_dt      		".trim(), length));
			String[] cre_usr_id           =  (JSPUtil.getParameter(request, "cre_usr_id          		".trim(), length));
			String[] cre_dt               =  (JSPUtil.getParameter(request, "cre_dt              		".trim(), length));
			String[] upd_usr_id           =  (JSPUtil.getParameter(request, "upd_usr_id          		".trim(), length));
			String[] upd_dt               =  (JSPUtil.getParameter(request, "upd_dt              		".trim(), length));
			String[] delt_flg             =  (JSPUtil.getParameter(request, "delt_flg            		".trim(), length));
			String[] eai_evnt_dt          =  (JSPUtil.getParameter(request, "eai_evnt_dt         		".trim(), length));
			String[] key_acct_mgr_glo_usr_id = (JSPUtil.getParameter(request, "key_acct_mgr_glo_usr_id  ".trim(), length));
			String[] key_acct_mgr_glo_usr_nm = (JSPUtil.getParameter(request, "key_acct_mgr_glo_usr_nm  ".trim(), length));
			String[] delt_eff_dt		  =  (JSPUtil.getParameter(request, "delt_eff_dt				".trim(), length));
			String[] sls_delt_flg		  =  (JSPUtil.getParameter(request, "sls_delt_flg				".trim(), length));
			String[] nmd_cust_flg		  =  (JSPUtil.getParameter(request, "nmd_cust_flg				".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new MdmCustomer();
				model.setIbflag              		  (ibflag              	[i]);
				model.setPage_rows           		  (page_rows           	[i]);
				model.setCust_cnt_cd         		  (cust_cnt_cd         	[i]);
				model.setCust_seq            		  (cust_seq            	[i]);
				model.setCntr_div_flg        		  (cntr_div_flg        	[i]);
				model.setBlk_div_flg         		  (blk_div_flg         	[i]);
				model.setCust_grp_id         		  (cust_grp_id         	[i]);
				model.setCust_lgl_eng_nm     		  (cust_lgl_eng_nm     	[i]);
				model.setCust_locl_lang_nm   		  (cust_locl_lang_nm   	[i]);
				model.setCust_abbr_nm        		  (cust_abbr_nm        	[i]);
				model.setRvis_cntr_cust_tp_cd		  (rvis_cntr_cust_tp_cd	[i]);
				model.setBlk_cust_tp_cd      		  (blk_cust_tp_cd      	[i]);
				model.setIndiv_corp_div_cd   		  (indiv_corp_div_cd   	[i]);
				model.setOfc_cd              		  (ofc_cd              	[i]);
				model.setFndt_dt             		  (fndt_dt             	[i]);
				model.setCust_rgst_no        		  (cust_rgst_no        	[i]);
				model.setFinc_sts_lvl_cd     		  (finc_sts_lvl_cd     	[i]);
				model.setLoc_cd              		  (loc_cd              	[i]);
				model.setCapi_curr_cd        		  (capi_curr_cd        	[i]);
				model.setCapi_amt            		  (capi_amt            	[i]);
				model.setLstk_flg            		  (lstk_flg            	[i]);
				model.setEmpe_knt            		  (empe_knt            	[i]);
				model.setVndr_seq            		  (vndr_seq            	[i]);
				model.setCust_rmk            		  (cust_rmk            	[i]);
				model.setVbs_clss_cd         		  (vbs_clss_cd         	[i]);
				model.setNbs_clss_cd1        		  (nbs_clss_cd1        	[i]);
				model.setNbs_clss_cd2        		  (nbs_clss_cd2        	[i]);
				model.setNbs_clss_cd3        		  (nbs_clss_cd3        	[i]);
				model.setCust_sts_cd         		  (cust_sts_cd         	[i]);
				model.setCrm_row_id          		  (crm_row_id          	[i]);
				model.setNvocc_co_scac_cd   		  (nvocc_co_scac_cd   	[i]);
				model.setNvocc_bd_no         		  (nvocc_bd_no         	[i]);
				model.setNvocc_lic_no        		  (nvocc_lic_no        	[i]);
				model.setNvocc_bd_amt        		  (nvocc_bd_amt        	[i]);
				model.setNvocc_bd_st_eff_dt  		  (nvocc_bd_st_eff_dt  	[i]);
				model.setNvocc_bd_end_eff_dt 		  (nvocc_bd_end_eff_dt 	[i]);
				model.setIndus_desc          		  (indus_desc          	[i]);
				model.setCrnt_vol_knt        		  (crnt_vol_knt        	[i]);
				model.setCmpt_desc           		  (cmpt_desc           	[i]);
				model.setSpcl_req_desc       		  (spcl_req_desc       	[i]);
				model.setPrf_svc_desc        		  (prf_svc_desc        	[i]);
				model.setPrf_svc_dtl_desc    		  (prf_svc_dtl_desc    	[i]);
				model.setPrf_grp_cmdt_cd     		  (prf_grp_cmdt_cd     	[i]);
				model.setPrf_cntr_tpsz_cd    		  (prf_cntr_tpsz_cd    	[i]);
				model.setPrf_rep_cmdt_cd     		  (prf_rep_cmdt_cd     	[i]);
				model.setSrep_cd             		  (srep_cd             	[i]);
				model.setCts_no              		  (cts_no              	[i]);
				model.setFrt_fwrd_fmc_no     		  (frt_fwrd_fmc_no     	[i]);
				model.setKey_acct_flg        		  (key_acct_flg        	[i]);
				model.setKey_acct_st_eff_dt  		  (key_acct_st_eff_dt  	[i]);
				model.setKey_acct_end_eff_dt 		  (key_acct_end_eff_dt 	[i]);
				model.setSubs_co_cd          		  (subs_co_cd          	[i]);
				model.setModi_cust_cnt_cd    		  (modi_cust_cnt_cd    	[i]);
				model.setModi_cust_seq       		  (modi_cust_seq       	[i]);
				model.setRfnd_psdo_vndr_seq  		  (rfnd_psdo_vndr_seq  	[i]);
				model.setBfr_ofc_cd          		  (bfr_ofc_cd          	[i]);
				model.setBfr_ofc_cng_dt      		  (bfr_ofc_cng_dt      	[i]);
				model.setCre_usr_id          		  (cre_usr_id          	[i]);
				model.setCre_dt              		  (cre_dt              	[i]);
				model.setUpd_usr_id          		  (upd_usr_id          	[i]);
				model.setUpd_dt              		  (upd_dt              	[i]);
				model.setDelt_flg            		  (delt_flg            	[i]);
				model.setEai_evnt_dt         		  (eai_evnt_dt         	[i]);
				model.setKey_acct_mgr_glo_usr_id      (key_acct_mgr_glo_usr_id[i]);
				model.setKey_acct_mgr_glo_usr_nm      (key_acct_mgr_glo_usr_nm[i]);
				model.setDelt_eff_dt				  (delt_eff_dt			[i]);
				model.setSls_delt_flg				  (sls_delt_flg			[i]);	
				model.setNmd_cust_flg				  (nmd_cust_flg			[i]);	
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		MdmCustomer model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag               =  (JSPUtil.getParameter(request, prefix + "ibflag              		".trim(), length));
			String[] page_rows            =  (JSPUtil.getParameter(request, prefix + "page_rows           		".trim(), length));
			String[] cust_cnt_cd          =  (JSPUtil.getParameter(request, prefix + "cust_cnt_cd         		".trim(), length));
			String[] cust_seq             =  (JSPUtil.getParameter(request, prefix + "cust_seq            		".trim(), length));
			String[] cntr_div_flg         =  (JSPUtil.getParameter(request, prefix + "cntr_div_flg        		".trim(), length));
			String[] blk_div_flg          =  (JSPUtil.getParameter(request, prefix + "blk_div_flg         		".trim(), length));
			String[] cust_grp_id          =  (JSPUtil.getParameter(request, prefix + "cust_grp_id         		".trim(), length));
			String[] cust_lgl_eng_nm      =  (JSPUtil.getParameter(request, prefix + "cust_lgl_eng_nm     		".trim(), length));
			String[] cust_locl_lang_nm    =  (JSPUtil.getParameter(request, prefix + "cust_locl_lang_nm   		".trim(), length));
			String[] cust_abbr_nm         =  (JSPUtil.getParameter(request, prefix + "cust_abbr_nm        		".trim(), length));
			String[] rvis_cntr_cust_tp_cd =  (JSPUtil.getParameter(request, prefix + "rvis_cntr_cust_tp_cd		".trim(), length));
			String[] blk_cust_tp_cd       =  (JSPUtil.getParameter(request, prefix + "blk_cust_tp_cd      		".trim(), length));
			String[] indiv_corp_div_cd    =  (JSPUtil.getParameter(request, prefix + "indiv_corp_div_cd   		".trim(), length));
			String[] ofc_cd               =  (JSPUtil.getParameter(request, prefix + "ofc_cd              		".trim(), length));
			String[] fndt_dt              =  (JSPUtil.getParameter(request, prefix + "fndt_dt             		".trim(), length));
			String[] cust_rgst_no         =  (JSPUtil.getParameter(request, prefix + "cust_rgst_no        		".trim(), length));
			String[] finc_sts_lvl_cd      =  (JSPUtil.getParameter(request, prefix + "finc_sts_lvl_cd     		".trim(), length));
			String[] loc_cd               =  (JSPUtil.getParameter(request, prefix + "loc_cd              		".trim(), length));
			String[] capi_curr_cd         =  (JSPUtil.getParameter(request, prefix + "capi_curr_cd        		".trim(), length));
			String[] capi_amt             =  (JSPUtil.getParameter(request, prefix + "capi_amt            		".trim(), length));
			String[] lstk_flg             =  (JSPUtil.getParameter(request, prefix + "lstk_flg            		".trim(), length));
			String[] empe_knt             =  (JSPUtil.getParameter(request, prefix + "empe_knt            		".trim(), length));
			String[] vndr_seq             =  (JSPUtil.getParameter(request, prefix + "vndr_seq            		".trim(), length));
			String[] cust_rmk             =  (JSPUtil.getParameter(request, prefix + "cust_rmk            		".trim(), length));
			String[] vbs_clss_cd          =  (JSPUtil.getParameter(request, prefix + "vbs_clss_cd         		".trim(), length));
			String[] nbs_clss_cd1         =  (JSPUtil.getParameter(request, prefix + "nbs_clss_cd1        		".trim(), length));
			String[] nbs_clss_cd2         =  (JSPUtil.getParameter(request, prefix + "nbs_clss_cd2        		".trim(), length));
			String[] nbs_clss_cd3         =  (JSPUtil.getParameter(request, prefix + "nbs_clss_cd3        		".trim(), length));
			String[] cust_sts_cd          =  (JSPUtil.getParameter(request, prefix + "cust_sts_cd         		".trim(), length));
			String[] crm_row_id           =  (JSPUtil.getParameter(request, prefix + "crm_row_id          		".trim(), length));
			String[] nvocc_co_scac_cd     =  (JSPUtil.getParameter(request, prefix + "nvocc_co_scac_cd   		".trim(), length));
			String[] nvocc_bd_no          =  (JSPUtil.getParameter(request, prefix + "nvocc_bd_no         		".trim(), length));
			String[] nvocc_lic_no         =  (JSPUtil.getParameter(request, prefix + "nvocc_lic_no        		".trim(), length));
			String[] nvocc_bd_amt         =  (JSPUtil.getParameter(request, prefix + "nvocc_bd_amt        		".trim(), length));
			String[] nvocc_bd_st_eff_dt   =  (JSPUtil.getParameter(request, prefix + "nvocc_bd_st_eff_dt  		".trim(), length));
			String[] nvocc_bd_end_eff_dt  =  (JSPUtil.getParameter(request, prefix + "nvocc_bd_end_eff_dt 		".trim(), length));
			String[] indus_desc           =  (JSPUtil.getParameter(request, prefix + "indus_desc          		".trim(), length));
			String[] crnt_vol_knt         =  (JSPUtil.getParameter(request, prefix + "crnt_vol_knt        		".trim(), length));
			String[] cmpt_desc            =  (JSPUtil.getParameter(request, prefix + "cmpt_desc           		".trim(), length));
			String[] spcl_req_desc        =  (JSPUtil.getParameter(request, prefix + "spcl_req_desc       		".trim(), length));
			String[] prf_svc_desc         =  (JSPUtil.getParameter(request, prefix + "prf_svc_desc        		".trim(), length));
			String[] prf_svc_dtl_desc     =  (JSPUtil.getParameter(request, prefix + "prf_svc_dtl_desc    		".trim(), length));
			String[] prf_grp_cmdt_cd      =  (JSPUtil.getParameter(request, prefix + "prf_grp_cmdt_cd     		".trim(), length));
			String[] prf_cntr_tpsz_cd     =  (JSPUtil.getParameter(request, prefix + "prf_cntr_tpsz_cd    		".trim(), length));
			String[] prf_rep_cmdt_cd      =  (JSPUtil.getParameter(request, prefix + "prf_rep_cmdt_cd     		".trim(), length));
			String[] srep_cd              =  (JSPUtil.getParameter(request, prefix + "srep_cd             		".trim(), length));
			String[] cts_no               =  (JSPUtil.getParameter(request, prefix + "cts_no              		".trim(), length));
			String[] frt_fwrd_fmc_no      =  (JSPUtil.getParameter(request, prefix + "frt_fwrd_fmc_no     		".trim(), length));
			String[] key_acct_flg         =  (JSPUtil.getParameter(request, prefix + "key_acct_flg        		".trim(), length));
			String[] key_acct_st_eff_dt   =  (JSPUtil.getParameter(request, prefix + "key_acct_st_eff_dt  		".trim(), length));
			String[] key_acct_end_eff_dt  =  (JSPUtil.getParameter(request, prefix + "key_acct_end_eff_dt 		".trim(), length));
			String[] subs_co_cd           =  (JSPUtil.getParameter(request, prefix + "subs_co_cd          		".trim(), length));
			String[] modi_cust_cnt_cd     =  (JSPUtil.getParameter(request, prefix + "modi_cust_cnt_cd    		".trim(), length));
			String[] modi_cust_seq        =  (JSPUtil.getParameter(request, prefix + "modi_cust_seq       		".trim(), length));
			String[] rfnd_psdo_vndr_seq   =  (JSPUtil.getParameter(request, prefix + "rfnd_psdo_vndr_seq  		".trim(), length));
			String[] bfr_ofc_cd           =  (JSPUtil.getParameter(request, prefix + "bfr_ofc_cd          		".trim(), length));
			String[] bfr_ofc_cng_dt       =  (JSPUtil.getParameter(request, prefix + "bfr_ofc_cng_dt      		".trim(), length));
			String[] cre_usr_id           =  (JSPUtil.getParameter(request, prefix + "cre_usr_id          		".trim(), length));
			String[] cre_dt               =  (JSPUtil.getParameter(request, prefix + "cre_dt              		".trim(), length));
			String[] upd_usr_id           =  (JSPUtil.getParameter(request, prefix + "upd_usr_id          		".trim(), length));
			String[] upd_dt               =  (JSPUtil.getParameter(request, prefix + "upd_dt              		".trim(), length));
			String[] delt_flg             =  (JSPUtil.getParameter(request, prefix + "delt_flg            		".trim(), length));
			String[] eai_evnt_dt          =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt         		".trim(), length));
			String[] key_acct_mgr_glo_usr_id = (JSPUtil.getParameter(request, prefix + "key_acct_mgr_glo_usr_id ".trim(), length));
			String[] key_acct_mgr_glo_usr_nm = (JSPUtil.getParameter(request, prefix + "key_acct_mgr_glo_usr_nm ".trim(), length));
			String[] delt_eff_dt		  =  (JSPUtil.getParameter(request, prefix + "delt_eff_dt				".trim(), length));
			String[] sls_delt_flg		  =  (JSPUtil.getParameter(request, prefix + "sls_delt_flg				".trim(), length));
			String[] nmd_cust_flg		  =  (JSPUtil.getParameter(request, prefix + "nmd_cust_flg				".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new MdmCustomer();
				model.setIbflag              		  ( ibflag              	[i]);
				model.setPage_rows           		  ( page_rows           	[i]);
				model.setCust_cnt_cd         		  ( cust_cnt_cd         	[i]);
				model.setCust_seq            		  ( cust_seq            	[i]);
				model.setCntr_div_flg        		  ( cntr_div_flg        	[i]);
				model.setBlk_div_flg         		  ( blk_div_flg         	[i]);
				model.setCust_grp_id         		  ( cust_grp_id         	[i]);
				model.setCust_lgl_eng_nm     		  ( cust_lgl_eng_nm     	[i]);
				model.setCust_locl_lang_nm   		  ( cust_locl_lang_nm   	[i]);
				model.setCust_abbr_nm        		  ( cust_abbr_nm        	[i]);
				model.setRvis_cntr_cust_tp_cd		  ( rvis_cntr_cust_tp_cd	[i]);
				model.setBlk_cust_tp_cd      		  ( blk_cust_tp_cd      	[i]);
				model.setIndiv_corp_div_cd   		  ( indiv_corp_div_cd   	[i]);
				model.setOfc_cd              		  ( ofc_cd              	[i]);
				model.setFndt_dt             		  ( fndt_dt             	[i]);
				model.setCust_rgst_no        		  ( cust_rgst_no        	[i]);
				model.setFinc_sts_lvl_cd     		  ( finc_sts_lvl_cd     	[i]);
				model.setLoc_cd              		  ( loc_cd              	[i]);
				model.setCapi_curr_cd        		  ( capi_curr_cd        	[i]);
				model.setCapi_amt            		  ( capi_amt            	[i]);
				model.setLstk_flg            		  ( lstk_flg            	[i]);
				model.setEmpe_knt            		  ( empe_knt            	[i]);
				model.setVndr_seq            		  ( vndr_seq            	[i]);
				model.setCust_rmk            		  ( cust_rmk            	[i]);
				model.setVbs_clss_cd         		  ( vbs_clss_cd         	[i]);
				model.setNbs_clss_cd1        		  ( nbs_clss_cd1        	[i]);
				model.setNbs_clss_cd2        		  ( nbs_clss_cd2        	[i]);
				model.setNbs_clss_cd3        		  ( nbs_clss_cd3        	[i]);
				model.setCust_sts_cd         		  ( cust_sts_cd         	[i]);
				model.setCrm_row_id          		  ( crm_row_id          	[i]);
				model.setNvocc_co_scac_cd   		  ( nvocc_co_scac_cd   		[i]);
				model.setNvocc_bd_no         		  ( nvocc_bd_no         	[i]);
				model.setNvocc_lic_no        		  ( nvocc_lic_no        	[i]);
				model.setNvocc_bd_amt        		  ( nvocc_bd_amt        	[i]);
				model.setNvocc_bd_st_eff_dt  		  ( nvocc_bd_st_eff_dt  	[i]);
				model.setNvocc_bd_end_eff_dt 		  ( nvocc_bd_end_eff_dt 	[i]);
				model.setIndus_desc          		  ( indus_desc          	[i]);
				model.setCrnt_vol_knt        		  ( crnt_vol_knt        	[i]);
				model.setCmpt_desc           		  ( cmpt_desc           	[i]);
				model.setSpcl_req_desc       		  ( spcl_req_desc       	[i]);
				model.setPrf_svc_desc        		  ( prf_svc_desc        	[i]);
				model.setPrf_svc_dtl_desc    		  ( prf_svc_dtl_desc    	[i]);
				model.setPrf_grp_cmdt_cd     		  ( prf_grp_cmdt_cd     	[i]);
				model.setPrf_cntr_tpsz_cd    		  ( prf_cntr_tpsz_cd    	[i]);
				model.setPrf_rep_cmdt_cd     		  ( prf_rep_cmdt_cd     	[i]);
				model.setSrep_cd             		  ( srep_cd             	[i]);
				model.setCts_no              		  ( cts_no              	[i]);
				model.setFrt_fwrd_fmc_no     		  ( frt_fwrd_fmc_no     	[i]);
				model.setKey_acct_flg        		  ( key_acct_flg        	[i]);
				model.setKey_acct_st_eff_dt  		  ( key_acct_st_eff_dt  	[i]);
				model.setKey_acct_end_eff_dt 		  ( key_acct_end_eff_dt 	[i]);
				model.setSubs_co_cd          		  ( subs_co_cd          	[i]);
				model.setModi_cust_cnt_cd    		  ( modi_cust_cnt_cd    	[i]);
				model.setModi_cust_seq       		  ( modi_cust_seq       	[i]);
				model.setRfnd_psdo_vndr_seq  		  ( rfnd_psdo_vndr_seq  	[i]);
				model.setBfr_ofc_cd          		  ( bfr_ofc_cd          	[i]);
				model.setBfr_ofc_cng_dt      		  ( bfr_ofc_cng_dt      	[i]);
				model.setCre_usr_id          		  ( cre_usr_id          	[i]);
				model.setCre_dt              		  ( cre_dt              	[i]);
				model.setUpd_usr_id          		  ( upd_usr_id          	[i]);
				model.setUpd_dt              		  ( upd_dt              	[i]);
				model.setDelt_flg            		  ( delt_flg            	[i]);
				model.setEai_evnt_dt         		  ( eai_evnt_dt         	[i]);
				model.setKey_acct_mgr_glo_usr_id      (key_acct_mgr_glo_usr_id  [i]);
				model.setKey_acct_mgr_glo_usr_nm      (key_acct_mgr_glo_usr_nm  [i]);
				model.setDelt_eff_dt                  (delt_eff_dt				[i]);
				model.setSls_delt_flg                 (sls_delt_flg				[i]);
				model.setNmd_cust_flg                 (nmd_cust_flg				[i]);
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
