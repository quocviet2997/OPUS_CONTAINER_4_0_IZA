/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : MST_CNTR_STS_HIS.java
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
public final class MST_CNTR_STS_HIS implements java.io.Serializable {

	private String                 ibflag                 = "";
	private String                 page_rows              = "";
	private String                 cntr_no                = "";
	private String                 cntr_sts_seq           = "";
	private String                 yd_cd                  = "";
	private String                 scc_cd                 = "";
	private String                 lcc_cd                 = "";
	private String                 rcc_cd                 = "";
	private String                 ctrt_ofc_cty_cd        = "";
	private String                 ctrt_seq               = "";
	private String                 cntr_sts_cd            = "";
	private String                 ofc_cd                 = "";
	private String                 cntr_sts_evnt_dt       = "";
	private String                 cntr_sts_evnt_seq      = "";
	private String                 cntr_pkup_chg_amt      = "";
	private String                 curr_cd                = "";
	private String                 cntr_lft_chg_amt       = "";
	private String                 chg_free_dys           = "";
	private String                 cntr_dir_itchg_fee_amt = "";
	private String                 cntr_drff_cr_amt       = "";
	private String                 dir_itchg_vndr_cnt_cd  = "";
	private String                 dir_itchg_vndr_seq     = "";
	private String                 cntr_lost_ntfy_dt      = "";
	private String                 cntr_lstm_cng_flg      = "";
	private String                 prnr_yd_cd             = "";
	private String                 prnr_sts_seq           = "";
	private String                 cntr_sts_rmk           = "";
	private String                 cntr_sts_delt_flg      = "";
	private String                 cre_usr_id             = "";
	private String                 cre_dt                 = "";
	private String                 upd_usr_id             = "";
	private String                 upd_dt                 = "";
	private String                 cnmv_sts_cd            = "";
	private String                 cntr_full_flg          = "";
	private String                 cntr_free_dy_exp_dt    = "";
	private String                 cntr_chg_calc_flg      = "";
	private String                 cntr_ls_flg            = "";
	private String                 cntr_sts_pair_seq      = "";
	private String                 nis_evnt_dt            = "";
	private String                 cntr_min_onh_dys       = "";
	private String                 cntr_auth_no           = "";
	private String                 ecc_cd                 = "";
	private String                 eai_evnt_dt            = "";
	private String				   co_cd				  = "";

	public MST_CNTR_STS_HIS(){}

	public MST_CNTR_STS_HIS(
			String                 ibflag                ,
			String                 page_rows             ,
			String                 cntr_no               ,
			String                 cntr_sts_seq          ,
			String                 yd_cd                 ,
			String                 scc_cd                ,
			String                 lcc_cd                ,
			String                 rcc_cd                ,
			String                 ctrt_ofc_cty_cd       ,
			String                 ctrt_seq              ,
			String                 cntr_sts_cd           ,
			String                 ofc_cd                ,
			String                 cntr_sts_evnt_dt      ,
			String                 cntr_sts_evnt_seq     ,
			String                 cntr_pkup_chg_amt     ,
			String                 curr_cd               ,
			String                 cntr_lft_chg_amt      ,
			String                 chg_free_dys          ,
			String                 cntr_dir_itchg_fee_amt,
			String                 cntr_drff_cr_amt      ,
			String                 dir_itchg_vndr_cnt_cd ,
			String                 dir_itchg_vndr_seq    ,
			String                 cntr_lost_ntfy_dt     ,
			String                 cntr_lstm_cng_flg     ,
			String                 prnr_yd_cd            ,
			String                 prnr_sts_seq          ,
			String                 cntr_sts_rmk          ,
			String                 cntr_sts_delt_flg     ,
			String                 cre_usr_id            ,
			String                 cre_dt                ,
			String                 upd_usr_id            ,
			String                 upd_dt                ,
			String                 cnmv_sts_cd           ,
			String                 cntr_full_flg         ,
			String                 cntr_free_dy_exp_dt   ,
			String                 cntr_chg_calc_flg     ,
			String                 cntr_ls_flg           ,
			String                 cntr_sts_pair_seq     ,
			String                 nis_evnt_dt           ,
			String                 cntr_min_onh_dys      ,
			String                 cntr_auth_no          ,
			String                 ecc_cd                ,
			String                 eai_evnt_dt           ,
			String				   co_cd				 ){
		this.ibflag                 = ibflag                ;
		this.page_rows              = page_rows             ;
		this.cntr_no                = cntr_no               ;
		this.cntr_sts_seq           = cntr_sts_seq          ;
		this.yd_cd                  = yd_cd                 ;
		this.scc_cd                 = scc_cd                ;
		this.lcc_cd                 = lcc_cd                ;
		this.rcc_cd                 = rcc_cd                ;
		this.ctrt_ofc_cty_cd        = ctrt_ofc_cty_cd       ;
		this.ctrt_seq               = ctrt_seq              ;
		this.cntr_sts_cd            = cntr_sts_cd           ;
		this.ofc_cd                 = ofc_cd                ;
		this.cntr_sts_evnt_dt       = cntr_sts_evnt_dt      ;
		this.cntr_sts_evnt_seq      = cntr_sts_evnt_seq     ;
		this.cntr_pkup_chg_amt      = cntr_pkup_chg_amt     ;
		this.curr_cd                = curr_cd               ;
		this.cntr_lft_chg_amt       = cntr_lft_chg_amt      ;
		this.chg_free_dys           = chg_free_dys          ;
		this.cntr_dir_itchg_fee_amt = cntr_dir_itchg_fee_amt;
		this.cntr_drff_cr_amt       = cntr_drff_cr_amt      ;
		this.dir_itchg_vndr_cnt_cd  = dir_itchg_vndr_cnt_cd ;
		this.dir_itchg_vndr_seq     = dir_itchg_vndr_seq    ;
		this.cntr_lost_ntfy_dt      = cntr_lost_ntfy_dt     ;
		this.cntr_lstm_cng_flg      = cntr_lstm_cng_flg     ;
		this.prnr_yd_cd             = prnr_yd_cd            ;
		this.prnr_sts_seq           = prnr_sts_seq          ;
		this.cntr_sts_rmk           = cntr_sts_rmk          ;
		this.cntr_sts_delt_flg      = cntr_sts_delt_flg     ;
		this.cre_usr_id             = cre_usr_id            ;
		this.cre_dt                 = cre_dt                ;
		this.upd_usr_id             = upd_usr_id            ;
		this.upd_dt                 = upd_dt                ;
		this.cnmv_sts_cd            = cnmv_sts_cd           ;
		this.cntr_full_flg          = cntr_full_flg         ;
		this.cntr_free_dy_exp_dt    = cntr_free_dy_exp_dt   ;
		this.cntr_chg_calc_flg      = cntr_chg_calc_flg     ;
		this.cntr_ls_flg            = cntr_ls_flg           ;
		this.cntr_sts_pair_seq      = cntr_sts_pair_seq     ;
		this.nis_evnt_dt            = nis_evnt_dt           ;
		this.cntr_min_onh_dys       = cntr_min_onh_dys      ;
		this.cntr_auth_no           = cntr_auth_no          ;
		this.ecc_cd                 = ecc_cd                ;
		this.eai_evnt_dt            = eai_evnt_dt           ;
		this.co_cd					= co_cd					;
	}

	// getter method is proceeding ..
	public String                 getIbflag                (){	return ibflag                	;	}
	public String                 getPage_rows             (){	return page_rows             	;	}
	public String                 getCntr_no               (){	return cntr_no               	;	}
	public String                 getCntr_sts_seq          (){	return cntr_sts_seq          	;	}
	public String                 getYd_cd                 (){	return yd_cd                 	;	}
	public String                 getScc_cd                (){	return scc_cd                	;	}
	public String                 getLcc_cd                (){	return lcc_cd                	;	}
	public String                 getRcc_cd                (){	return rcc_cd                	;	}
	public String                 getCtrt_ofc_cty_cd       (){	return ctrt_ofc_cty_cd       	;	}
	public String                 getCtrt_seq              (){	return ctrt_seq              	;	}
	public String                 getCntr_sts_cd           (){	return cntr_sts_cd           	;	}
	public String                 getOfc_cd                (){	return ofc_cd                	;	}
	public String                 getCntr_sts_evnt_dt      (){	return cntr_sts_evnt_dt      	;	}
	public String                 getCntr_sts_evnt_seq     (){	return cntr_sts_evnt_seq     	;	}
	public String                 getCntr_pkup_chg_amt     (){	return cntr_pkup_chg_amt     	;	}
	public String                 getCurr_cd               (){	return curr_cd               	;	}
	public String                 getCntr_lft_chg_amt      (){	return cntr_lft_chg_amt      	;	}
	public String                 getChg_free_dys          (){	return chg_free_dys          	;	}
	public String                 getCntr_dir_itchg_fee_amt(){	return cntr_dir_itchg_fee_amt	;	}
	public String                 getCntr_drff_cr_amt      (){	return cntr_drff_cr_amt      	;	}
	public String                 getDir_itchg_vndr_cnt_cd (){	return dir_itchg_vndr_cnt_cd 	;	}
	public String                 getDir_itchg_vndr_seq    (){	return dir_itchg_vndr_seq    	;	}
	public String                 getCntr_lost_ntfy_dt     (){	return cntr_lost_ntfy_dt     	;	}
	public String                 getCntr_lstm_cng_flg     (){	return cntr_lstm_cng_flg     	;	}
	public String                 getPrnr_yd_cd            (){	return prnr_yd_cd            	;	}
	public String                 getPrnr_sts_seq          (){	return prnr_sts_seq          	;	}
	public String                 getCntr_sts_rmk          (){	return cntr_sts_rmk          	;	}
	public String                 getCntr_sts_delt_flg     (){	return cntr_sts_delt_flg     	;	}
	public String                 getCre_usr_id            (){	return cre_usr_id            	;	}
	public String                 getCre_dt                (){	return cre_dt                	;	}
	public String                 getUpd_usr_id            (){	return upd_usr_id            	;	}
	public String                 getUpd_dt                (){	return upd_dt                	;	}
	public String                 getCnmv_sts_cd           (){	return cnmv_sts_cd           	;	}
	public String                 getCntr_full_flg         (){	return cntr_full_flg         	;	}
	public String                 getCntr_free_dy_exp_dt   (){	return cntr_free_dy_exp_dt   	;	}
	public String                 getCntr_chg_calc_flg     (){	return cntr_chg_calc_flg     	;	}
	public String                 getCntr_ls_flg           (){	return cntr_ls_flg           	;	}
	public String                 getCntr_sts_pair_seq     (){	return cntr_sts_pair_seq     	;	}
	public String                 getNis_evnt_dt           (){	return nis_evnt_dt           	;	}
	public String                 getCntr_min_onh_dys      (){	return cntr_min_onh_dys      	;	}
	public String                 getCntr_auth_no          (){	return cntr_auth_no          	;	}
	public String                 getEcc_cd                (){	return ecc_cd                	;	}
	public String                 getEai_evnt_dt           (){	return eai_evnt_dt           	;	}
	public String                 getCo_cd           (){	return co_cd           	;	}

	// setter method is proceeding ..
	public void setIbflag                ( String                 ibflag                 ){	this.ibflag                 = ibflag                	;	}
	public void setPage_rows             ( String                 page_rows              ){	this.page_rows              = page_rows             	;	}
	public void setCntr_no               ( String                 cntr_no                ){	this.cntr_no                = cntr_no               	;	}
	public void setCntr_sts_seq          ( String                 cntr_sts_seq           ){	this.cntr_sts_seq           = cntr_sts_seq          	;	}
	public void setYd_cd                 ( String                 yd_cd                  ){	this.yd_cd                  = yd_cd                 	;	}
	public void setScc_cd                ( String                 scc_cd                 ){	this.scc_cd                 = scc_cd                	;	}
	public void setLcc_cd                ( String                 lcc_cd                 ){	this.lcc_cd                 = lcc_cd                	;	}
	public void setRcc_cd                ( String                 rcc_cd                 ){	this.rcc_cd                 = rcc_cd                	;	}
	public void setCtrt_ofc_cty_cd       ( String                 ctrt_ofc_cty_cd        ){	this.ctrt_ofc_cty_cd        = ctrt_ofc_cty_cd       	;	}
	public void setCtrt_seq              ( String                 ctrt_seq               ){	this.ctrt_seq               = ctrt_seq              	;	}
	public void setCntr_sts_cd           ( String                 cntr_sts_cd            ){	this.cntr_sts_cd            = cntr_sts_cd           	;	}
	public void setOfc_cd                ( String                 ofc_cd                 ){	this.ofc_cd                 = ofc_cd                	;	}
	public void setCntr_sts_evnt_dt      ( String                 cntr_sts_evnt_dt       ){	this.cntr_sts_evnt_dt       = cntr_sts_evnt_dt      	;	}
	public void setCntr_sts_evnt_seq     ( String                 cntr_sts_evnt_seq      ){	this.cntr_sts_evnt_seq      = cntr_sts_evnt_seq     	;	}
	public void setCntr_pkup_chg_amt     ( String                 cntr_pkup_chg_amt      ){	this.cntr_pkup_chg_amt      = cntr_pkup_chg_amt     	;	}
	public void setCurr_cd               ( String                 curr_cd                ){	this.curr_cd                = curr_cd               	;	}
	public void setCntr_lft_chg_amt      ( String                 cntr_lft_chg_amt       ){	this.cntr_lft_chg_amt       = cntr_lft_chg_amt      	;	}
	public void setChg_free_dys          ( String                 chg_free_dys           ){	this.chg_free_dys           = chg_free_dys          	;	}
	public void setCntr_dir_itchg_fee_amt( String                 cntr_dir_itchg_fee_amt ){	this.cntr_dir_itchg_fee_amt = cntr_dir_itchg_fee_amt	;	}
	public void setCntr_drff_cr_amt      ( String                 cntr_drff_cr_amt       ){	this.cntr_drff_cr_amt       = cntr_drff_cr_amt      	;	}
	public void setDir_itchg_vndr_cnt_cd ( String                 dir_itchg_vndr_cnt_cd  ){	this.dir_itchg_vndr_cnt_cd  = dir_itchg_vndr_cnt_cd 	;	}
	public void setDir_itchg_vndr_seq    ( String                 dir_itchg_vndr_seq     ){	this.dir_itchg_vndr_seq     = dir_itchg_vndr_seq    	;	}
	public void setCntr_lost_ntfy_dt     ( String                 cntr_lost_ntfy_dt      ){	this.cntr_lost_ntfy_dt      = cntr_lost_ntfy_dt     	;	}
	public void setCntr_lstm_cng_flg     ( String                 cntr_lstm_cng_flg      ){	this.cntr_lstm_cng_flg      = cntr_lstm_cng_flg     	;	}
	public void setPrnr_yd_cd            ( String                 prnr_yd_cd             ){	this.prnr_yd_cd             = prnr_yd_cd            	;	}
	public void setPrnr_sts_seq          ( String                 prnr_sts_seq           ){	this.prnr_sts_seq           = prnr_sts_seq          	;	}
	public void setCntr_sts_rmk          ( String                 cntr_sts_rmk           ){	this.cntr_sts_rmk           = cntr_sts_rmk          	;	}
	public void setCntr_sts_delt_flg     ( String                 cntr_sts_delt_flg      ){	this.cntr_sts_delt_flg      = cntr_sts_delt_flg     	;	}
	public void setCre_usr_id            ( String                 cre_usr_id             ){	this.cre_usr_id             = cre_usr_id            	;	}
	public void setCre_dt                ( String                 cre_dt                 ){	this.cre_dt                 = cre_dt                	;	}
	public void setUpd_usr_id            ( String                 upd_usr_id             ){	this.upd_usr_id             = upd_usr_id            	;	}
	public void setUpd_dt                ( String                 upd_dt                 ){	this.upd_dt                 = upd_dt                	;	}
	public void setCnmv_sts_cd           ( String                 cnmv_sts_cd            ){	this.cnmv_sts_cd            = cnmv_sts_cd           	;	}
	public void setCntr_full_flg         ( String                 cntr_full_flg          ){	this.cntr_full_flg          = cntr_full_flg         	;	}
	public void setCntr_free_dy_exp_dt   ( String                 cntr_free_dy_exp_dt    ){	this.cntr_free_dy_exp_dt    = cntr_free_dy_exp_dt   	;	}
	public void setCntr_chg_calc_flg     ( String                 cntr_chg_calc_flg      ){	this.cntr_chg_calc_flg      = cntr_chg_calc_flg     	;	}
	public void setCntr_ls_flg           ( String                 cntr_ls_flg            ){	this.cntr_ls_flg            = cntr_ls_flg           	;	}
	public void setCntr_sts_pair_seq     ( String                 cntr_sts_pair_seq      ){	this.cntr_sts_pair_seq      = cntr_sts_pair_seq     	;	}
	public void setNis_evnt_dt           ( String                 nis_evnt_dt            ){	this.nis_evnt_dt            = nis_evnt_dt           	;	}
	public void setCntr_min_onh_dys      ( String                 cntr_min_onh_dys       ){	this.cntr_min_onh_dys       = cntr_min_onh_dys      	;	}
	public void setCntr_auth_no          ( String                 cntr_auth_no           ){	this.cntr_auth_no           = cntr_auth_no          	;	}
	public void setEcc_cd                ( String                 ecc_cd                 ){	this.ecc_cd                 = ecc_cd                	;	}
	public void setEai_evnt_dt           ( String                 eai_evnt_dt            ){	this.eai_evnt_dt            = eai_evnt_dt           	;	}
	public void setCo_cd           ( String                 co_cd            ){	this.co_cd            = co_cd           	;	}

	public static MST_CNTR_STS_HIS fromRequest(HttpServletRequest request) {
		MST_CNTR_STS_HIS model = new MST_CNTR_STS_HIS();
		try {
			model.setIbflag                	(JSPUtil.getParameter(request, "ibflag                		".trim(), ""));
			model.setPage_rows             	(JSPUtil.getParameter(request, "page_rows             		".trim(), ""));
			model.setCntr_no               	(JSPUtil.getParameter(request, "cntr_no               		".trim(), ""));
			model.setCntr_sts_seq          	(JSPUtil.getParameter(request, "cntr_sts_seq          		".trim(), ""));
			model.setYd_cd                 	(JSPUtil.getParameter(request, "yd_cd                 		".trim(), ""));
			model.setScc_cd                	(JSPUtil.getParameter(request, "scc_cd                		".trim(), ""));
			model.setLcc_cd                	(JSPUtil.getParameter(request, "lcc_cd                		".trim(), ""));
			model.setRcc_cd                	(JSPUtil.getParameter(request, "rcc_cd                		".trim(), ""));
			model.setCtrt_ofc_cty_cd       	(JSPUtil.getParameter(request, "ctrt_ofc_cty_cd       		".trim(), ""));
			model.setCtrt_seq              	(JSPUtil.getParameter(request, "ctrt_seq              		".trim(), ""));
			model.setCntr_sts_cd           	(JSPUtil.getParameter(request, "cntr_sts_cd           		".trim(), ""));
			model.setOfc_cd                	(JSPUtil.getParameter(request, "ofc_cd                		".trim(), ""));
			model.setCntr_sts_evnt_dt      	(JSPUtil.getParameter(request, "cntr_sts_evnt_dt      		".trim(), ""));
			model.setCntr_sts_evnt_seq     	(JSPUtil.getParameter(request, "cntr_sts_evnt_seq     		".trim(), ""));
			model.setCntr_pkup_chg_amt     	(JSPUtil.getParameter(request, "cntr_pkup_chg_amt     		".trim(), ""));
			model.setCurr_cd               	(JSPUtil.getParameter(request, "curr_cd               		".trim(), ""));
			model.setCntr_lft_chg_amt      	(JSPUtil.getParameter(request, "cntr_lft_chg_amt      		".trim(), ""));
			model.setChg_free_dys          	(JSPUtil.getParameter(request, "chg_free_dys          		".trim(), ""));
			model.setCntr_dir_itchg_fee_amt	(JSPUtil.getParameter(request, "cntr_dir_itchg_fee_amt		".trim(), ""));
			model.setCntr_drff_cr_amt      	(JSPUtil.getParameter(request, "cntr_drff_cr_amt      		".trim(), ""));
			model.setDir_itchg_vndr_cnt_cd 	(JSPUtil.getParameter(request, "dir_itchg_vndr_cnt_cd 		".trim(), ""));
			model.setDir_itchg_vndr_seq    	(JSPUtil.getParameter(request, "dir_itchg_vndr_seq    		".trim(), ""));
			model.setCntr_lost_ntfy_dt     	(JSPUtil.getParameter(request, "cntr_lost_ntfy_dt     		".trim(), ""));
			model.setCntr_lstm_cng_flg     	(JSPUtil.getParameter(request, "cntr_lstm_cng_flg     		".trim(), ""));
			model.setPrnr_yd_cd            	(JSPUtil.getParameter(request, "prnr_yd_cd            		".trim(), ""));
			model.setPrnr_sts_seq          	(JSPUtil.getParameter(request, "prnr_sts_seq          		".trim(), ""));
			model.setCntr_sts_rmk          	(JSPUtil.getParameter(request, "cntr_sts_rmk          		".trim(), ""));
			model.setCntr_sts_delt_flg     	(JSPUtil.getParameter(request, "cntr_sts_delt_flg     		".trim(), ""));
			model.setCre_usr_id            	(JSPUtil.getParameter(request, "cre_usr_id            		".trim(), ""));
			model.setCre_dt                	(JSPUtil.getParameter(request, "cre_dt                		".trim(), ""));
			model.setUpd_usr_id            	(JSPUtil.getParameter(request, "upd_usr_id            		".trim(), ""));
			model.setUpd_dt                	(JSPUtil.getParameter(request, "upd_dt                		".trim(), ""));
			model.setCnmv_sts_cd           	(JSPUtil.getParameter(request, "cnmv_sts_cd           		".trim(), ""));
			model.setCntr_full_flg         	(JSPUtil.getParameter(request, "cntr_full_flg         		".trim(), ""));
			model.setCntr_free_dy_exp_dt   	(JSPUtil.getParameter(request, "cntr_free_dy_exp_dt   		".trim(), ""));
			model.setCntr_chg_calc_flg     	(JSPUtil.getParameter(request, "cntr_chg_calc_flg     		".trim(), ""));
			model.setCntr_ls_flg           	(JSPUtil.getParameter(request, "cntr_ls_flg           		".trim(), ""));
			model.setCntr_sts_pair_seq     	(JSPUtil.getParameter(request, "cntr_sts_pair_seq     		".trim(), ""));
			model.setNis_evnt_dt           	(JSPUtil.getParameter(request, "nis_evnt_dt           		".trim(), ""));
			model.setCntr_min_onh_dys      	(JSPUtil.getParameter(request, "cntr_min_onh_dys      		".trim(), ""));
			model.setCntr_auth_no          	(JSPUtil.getParameter(request, "cntr_auth_no          		".trim(), ""));
			model.setEcc_cd                	(JSPUtil.getParameter(request, "ecc_cd                		".trim(), ""));
			model.setEai_evnt_dt           	(JSPUtil.getParameter(request, "eai_evnt_dt           		".trim(), ""));
			model.setCo_cd           	(JSPUtil.getParameter(request, "co_cd           		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		MST_CNTR_STS_HIS model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag                 =  (JSPUtil.getParameter(request, "ibflag                		".trim(), length));
			String[] page_rows              =  (JSPUtil.getParameter(request, "page_rows             		".trim(), length));
			String[] cntr_no                =  (JSPUtil.getParameter(request, "cntr_no               		".trim(), length));
			String[] cntr_sts_seq           =  (JSPUtil.getParameter(request, "cntr_sts_seq          		".trim(), length));
			String[] yd_cd                  =  (JSPUtil.getParameter(request, "yd_cd                 		".trim(), length));
			String[] scc_cd                 =  (JSPUtil.getParameter(request, "scc_cd                		".trim(), length));
			String[] lcc_cd                 =  (JSPUtil.getParameter(request, "lcc_cd                		".trim(), length));
			String[] rcc_cd                 =  (JSPUtil.getParameter(request, "rcc_cd                		".trim(), length));
			String[] ctrt_ofc_cty_cd        =  (JSPUtil.getParameter(request, "ctrt_ofc_cty_cd       		".trim(), length));
			String[] ctrt_seq               =  (JSPUtil.getParameter(request, "ctrt_seq              		".trim(), length));
			String[] cntr_sts_cd            =  (JSPUtil.getParameter(request, "cntr_sts_cd           		".trim(), length));
			String[] ofc_cd                 =  (JSPUtil.getParameter(request, "ofc_cd                		".trim(), length));
			String[] cntr_sts_evnt_dt       =  (JSPUtil.getParameter(request, "cntr_sts_evnt_dt      		".trim(), length));
			String[] cntr_sts_evnt_seq      =  (JSPUtil.getParameter(request, "cntr_sts_evnt_seq     		".trim(), length));
			String[] cntr_pkup_chg_amt      =  (JSPUtil.getParameter(request, "cntr_pkup_chg_amt     		".trim(), length));
			String[] curr_cd                =  (JSPUtil.getParameter(request, "curr_cd               		".trim(), length));
			String[] cntr_lft_chg_amt       =  (JSPUtil.getParameter(request, "cntr_lft_chg_amt      		".trim(), length));
			String[] chg_free_dys           =  (JSPUtil.getParameter(request, "chg_free_dys          		".trim(), length));
			String[] cntr_dir_itchg_fee_amt =  (JSPUtil.getParameter(request, "cntr_dir_itchg_fee_amt		".trim(), length));
			String[] cntr_drff_cr_amt       =  (JSPUtil.getParameter(request, "cntr_drff_cr_amt      		".trim(), length));
			String[] dir_itchg_vndr_cnt_cd  =  (JSPUtil.getParameter(request, "dir_itchg_vndr_cnt_cd 		".trim(), length));
			String[] dir_itchg_vndr_seq     =  (JSPUtil.getParameter(request, "dir_itchg_vndr_seq    		".trim(), length));
			String[] cntr_lost_ntfy_dt      =  (JSPUtil.getParameter(request, "cntr_lost_ntfy_dt     		".trim(), length));
			String[] cntr_lstm_cng_flg      =  (JSPUtil.getParameter(request, "cntr_lstm_cng_flg     		".trim(), length));
			String[] prnr_yd_cd             =  (JSPUtil.getParameter(request, "prnr_yd_cd            		".trim(), length));
			String[] prnr_sts_seq           =  (JSPUtil.getParameter(request, "prnr_sts_seq          		".trim(), length));
			String[] cntr_sts_rmk           =  (JSPUtil.getParameter(request, "cntr_sts_rmk          		".trim(), length));
			String[] cntr_sts_delt_flg      =  (JSPUtil.getParameter(request, "cntr_sts_delt_flg     		".trim(), length));
			String[] cre_usr_id             =  (JSPUtil.getParameter(request, "cre_usr_id            		".trim(), length));
			String[] cre_dt                 =  (JSPUtil.getParameter(request, "cre_dt                		".trim(), length));
			String[] upd_usr_id             =  (JSPUtil.getParameter(request, "upd_usr_id            		".trim(), length));
			String[] upd_dt                 =  (JSPUtil.getParameter(request, "upd_dt                		".trim(), length));
			String[] cnmv_sts_cd            =  (JSPUtil.getParameter(request, "cnmv_sts_cd           		".trim(), length));
			String[] cntr_full_flg          =  (JSPUtil.getParameter(request, "cntr_full_flg         		".trim(), length));
			String[] cntr_free_dy_exp_dt    =  (JSPUtil.getParameter(request, "cntr_free_dy_exp_dt   		".trim(), length));
			String[] cntr_chg_calc_flg      =  (JSPUtil.getParameter(request, "cntr_chg_calc_flg     		".trim(), length));
			String[] cntr_ls_flg            =  (JSPUtil.getParameter(request, "cntr_ls_flg           		".trim(), length));
			String[] cntr_sts_pair_seq      =  (JSPUtil.getParameter(request, "cntr_sts_pair_seq     		".trim(), length));
			String[] nis_evnt_dt            =  (JSPUtil.getParameter(request, "nis_evnt_dt           		".trim(), length));
			String[] cntr_min_onh_dys       =  (JSPUtil.getParameter(request, "cntr_min_onh_dys      		".trim(), length));
			String[] cntr_auth_no           =  (JSPUtil.getParameter(request, "cntr_auth_no          		".trim(), length));
			String[] ecc_cd                 =  (JSPUtil.getParameter(request, "ecc_cd                		".trim(), length));
			String[] eai_evnt_dt            =  (JSPUtil.getParameter(request, "eai_evnt_dt           		".trim(), length));
			String[] co_cd            =  (JSPUtil.getParameter(request, "co_cd           		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new MST_CNTR_STS_HIS();
				model.setIbflag                		  (ibflag                	[i]);
				model.setPage_rows             		  (page_rows             	[i]);
				model.setCntr_no               		  (cntr_no               	[i]);
				model.setCntr_sts_seq          		  (cntr_sts_seq          	[i]);
				model.setYd_cd                 		  (yd_cd                 	[i]);
				model.setScc_cd                		  (scc_cd                	[i]);
				model.setLcc_cd                		  (lcc_cd                	[i]);
				model.setRcc_cd                		  (rcc_cd                	[i]);
				model.setCtrt_ofc_cty_cd       		  (ctrt_ofc_cty_cd       	[i]);
				model.setCtrt_seq              		  (ctrt_seq              	[i]);
				model.setCntr_sts_cd           		  (cntr_sts_cd           	[i]);
				model.setOfc_cd                		  (ofc_cd                	[i]);
				model.setCntr_sts_evnt_dt      		  (cntr_sts_evnt_dt      	[i]);
				model.setCntr_sts_evnt_seq     		  (cntr_sts_evnt_seq     	[i]);
				model.setCntr_pkup_chg_amt     		  (cntr_pkup_chg_amt     	[i]);
				model.setCurr_cd               		  (curr_cd               	[i]);
				model.setCntr_lft_chg_amt      		  (cntr_lft_chg_amt      	[i]);
				model.setChg_free_dys          		  (chg_free_dys          	[i]);
				model.setCntr_dir_itchg_fee_amt		  (cntr_dir_itchg_fee_amt	[i]);
				model.setCntr_drff_cr_amt      		  (cntr_drff_cr_amt      	[i]);
				model.setDir_itchg_vndr_cnt_cd 		  (dir_itchg_vndr_cnt_cd 	[i]);
				model.setDir_itchg_vndr_seq    		  (dir_itchg_vndr_seq    	[i]);
				model.setCntr_lost_ntfy_dt     		  (cntr_lost_ntfy_dt     	[i]);
				model.setCntr_lstm_cng_flg     		  (cntr_lstm_cng_flg     	[i]);
				model.setPrnr_yd_cd            		  (prnr_yd_cd            	[i]);
				model.setPrnr_sts_seq          		  (prnr_sts_seq          	[i]);
				model.setCntr_sts_rmk          		  (cntr_sts_rmk          	[i]);
				model.setCntr_sts_delt_flg     		  (cntr_sts_delt_flg     	[i]);
				model.setCre_usr_id            		  (cre_usr_id            	[i]);
				model.setCre_dt                		  (cre_dt                	[i]);
				model.setUpd_usr_id            		  (upd_usr_id            	[i]);
				model.setUpd_dt                		  (upd_dt                	[i]);
				model.setCnmv_sts_cd           		  (cnmv_sts_cd           	[i]);
				model.setCntr_full_flg         		  (cntr_full_flg         	[i]);
				model.setCntr_free_dy_exp_dt   		  (cntr_free_dy_exp_dt   	[i]);
				model.setCntr_chg_calc_flg     		  (cntr_chg_calc_flg     	[i]);
				model.setCntr_ls_flg           		  (cntr_ls_flg           	[i]);
				model.setCntr_sts_pair_seq     		  (cntr_sts_pair_seq     	[i]);
				model.setNis_evnt_dt           		  (nis_evnt_dt           	[i]);
				model.setCntr_min_onh_dys      		  (cntr_min_onh_dys      	[i]);
				model.setCntr_auth_no          		  (cntr_auth_no          	[i]);
				model.setEcc_cd                		  (ecc_cd                	[i]);
				model.setEai_evnt_dt           		  (eai_evnt_dt           	[i]);
				model.setCo_cd           		  (co_cd           	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		MST_CNTR_STS_HIS model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag                 =  (JSPUtil.getParameter(request, prefix + "ibflag                		".trim(), length));
			String[] page_rows              =  (JSPUtil.getParameter(request, prefix + "page_rows             		".trim(), length));
			String[] cntr_no                =  (JSPUtil.getParameter(request, prefix + "cntr_no               		".trim(), length));
			String[] cntr_sts_seq           =  (JSPUtil.getParameter(request, prefix + "cntr_sts_seq          		".trim(), length));
			String[] yd_cd                  =  (JSPUtil.getParameter(request, prefix + "yd_cd                 		".trim(), length));
			String[] scc_cd                 =  (JSPUtil.getParameter(request, prefix + "scc_cd                		".trim(), length));
			String[] lcc_cd                 =  (JSPUtil.getParameter(request, prefix + "lcc_cd                		".trim(), length));
			String[] rcc_cd                 =  (JSPUtil.getParameter(request, prefix + "rcc_cd                		".trim(), length));
			String[] ctrt_ofc_cty_cd        =  (JSPUtil.getParameter(request, prefix + "ctrt_ofc_cty_cd       		".trim(), length));
			String[] ctrt_seq               =  (JSPUtil.getParameter(request, prefix + "ctrt_seq              		".trim(), length));
			String[] cntr_sts_cd            =  (JSPUtil.getParameter(request, prefix + "cntr_sts_cd           		".trim(), length));
			String[] ofc_cd                 =  (JSPUtil.getParameter(request, prefix + "ofc_cd                		".trim(), length));
			String[] cntr_sts_evnt_dt       =  (JSPUtil.getParameter(request, prefix + "cntr_sts_evnt_dt      		".trim(), length));
			String[] cntr_sts_evnt_seq      =  (JSPUtil.getParameter(request, prefix + "cntr_sts_evnt_seq     		".trim(), length));
			String[] cntr_pkup_chg_amt      =  (JSPUtil.getParameter(request, prefix + "cntr_pkup_chg_amt     		".trim(), length));
			String[] curr_cd                =  (JSPUtil.getParameter(request, prefix + "curr_cd               		".trim(), length));
			String[] cntr_lft_chg_amt       =  (JSPUtil.getParameter(request, prefix + "cntr_lft_chg_amt      		".trim(), length));
			String[] chg_free_dys           =  (JSPUtil.getParameter(request, prefix + "chg_free_dys          		".trim(), length));
			String[] cntr_dir_itchg_fee_amt =  (JSPUtil.getParameter(request, prefix + "cntr_dir_itchg_fee_amt		".trim(), length));
			String[] cntr_drff_cr_amt       =  (JSPUtil.getParameter(request, prefix + "cntr_drff_cr_amt      		".trim(), length));
			String[] dir_itchg_vndr_cnt_cd  =  (JSPUtil.getParameter(request, prefix + "dir_itchg_vndr_cnt_cd 		".trim(), length));
			String[] dir_itchg_vndr_seq     =  (JSPUtil.getParameter(request, prefix + "dir_itchg_vndr_seq    		".trim(), length));
			String[] cntr_lost_ntfy_dt      =  (JSPUtil.getParameter(request, prefix + "cntr_lost_ntfy_dt     		".trim(), length));
			String[] cntr_lstm_cng_flg      =  (JSPUtil.getParameter(request, prefix + "cntr_lstm_cng_flg     		".trim(), length));
			String[] prnr_yd_cd             =  (JSPUtil.getParameter(request, prefix + "prnr_yd_cd            		".trim(), length));
			String[] prnr_sts_seq           =  (JSPUtil.getParameter(request, prefix + "prnr_sts_seq          		".trim(), length));
			String[] cntr_sts_rmk           =  (JSPUtil.getParameter(request, prefix + "cntr_sts_rmk          		".trim(), length));
			String[] cntr_sts_delt_flg      =  (JSPUtil.getParameter(request, prefix + "cntr_sts_delt_flg     		".trim(), length));
			String[] cre_usr_id             =  (JSPUtil.getParameter(request, prefix + "cre_usr_id            		".trim(), length));
			String[] cre_dt                 =  (JSPUtil.getParameter(request, prefix + "cre_dt                		".trim(), length));
			String[] upd_usr_id             =  (JSPUtil.getParameter(request, prefix + "upd_usr_id            		".trim(), length));
			String[] upd_dt                 =  (JSPUtil.getParameter(request, prefix + "upd_dt                		".trim(), length));
			String[] cnmv_sts_cd            =  (JSPUtil.getParameter(request, prefix + "cnmv_sts_cd           		".trim(), length));
			String[] cntr_full_flg          =  (JSPUtil.getParameter(request, prefix + "cntr_full_flg         		".trim(), length));
			String[] cntr_free_dy_exp_dt    =  (JSPUtil.getParameter(request, prefix + "cntr_free_dy_exp_dt   		".trim(), length));
			String[] cntr_chg_calc_flg      =  (JSPUtil.getParameter(request, prefix + "cntr_chg_calc_flg     		".trim(), length));
			String[] cntr_ls_flg            =  (JSPUtil.getParameter(request, prefix + "cntr_ls_flg           		".trim(), length));
			String[] cntr_sts_pair_seq      =  (JSPUtil.getParameter(request, prefix + "cntr_sts_pair_seq     		".trim(), length));
			String[] nis_evnt_dt            =  (JSPUtil.getParameter(request, prefix + "nis_evnt_dt           		".trim(), length));
			String[] cntr_min_onh_dys       =  (JSPUtil.getParameter(request, prefix + "cntr_min_onh_dys      		".trim(), length));
			String[] cntr_auth_no           =  (JSPUtil.getParameter(request, prefix + "cntr_auth_no          		".trim(), length));
			String[] ecc_cd                 =  (JSPUtil.getParameter(request, prefix + "ecc_cd                		".trim(), length));
			String[] eai_evnt_dt            =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt           		".trim(), length));
			String[] co_cd            =  (JSPUtil.getParameter(request, prefix + "co_cd           		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new MST_CNTR_STS_HIS();
				model.setIbflag                		  ( ibflag                	[i]);
				model.setPage_rows             		  ( page_rows             	[i]);
				model.setCntr_no               		  ( cntr_no               	[i]);
				model.setCntr_sts_seq          		  ( cntr_sts_seq          	[i]);
				model.setYd_cd                 		  ( yd_cd                 	[i]);
				model.setScc_cd                		  ( scc_cd                	[i]);
				model.setLcc_cd                		  ( lcc_cd                	[i]);
				model.setRcc_cd                		  ( rcc_cd                	[i]);
				model.setCtrt_ofc_cty_cd       		  ( ctrt_ofc_cty_cd       	[i]);
				model.setCtrt_seq              		  ( ctrt_seq              	[i]);
				model.setCntr_sts_cd           		  ( cntr_sts_cd           	[i]);
				model.setOfc_cd                		  ( ofc_cd                	[i]);
				model.setCntr_sts_evnt_dt      		  ( cntr_sts_evnt_dt      	[i]);
				model.setCntr_sts_evnt_seq     		  ( cntr_sts_evnt_seq     	[i]);
				model.setCntr_pkup_chg_amt     		  ( cntr_pkup_chg_amt     	[i]);
				model.setCurr_cd               		  ( curr_cd               	[i]);
				model.setCntr_lft_chg_amt      		  ( cntr_lft_chg_amt      	[i]);
				model.setChg_free_dys          		  ( chg_free_dys          	[i]);
				model.setCntr_dir_itchg_fee_amt		  ( cntr_dir_itchg_fee_amt	[i]);
				model.setCntr_drff_cr_amt      		  ( cntr_drff_cr_amt      	[i]);
				model.setDir_itchg_vndr_cnt_cd 		  ( dir_itchg_vndr_cnt_cd 	[i]);
				model.setDir_itchg_vndr_seq    		  ( dir_itchg_vndr_seq    	[i]);
				model.setCntr_lost_ntfy_dt     		  ( cntr_lost_ntfy_dt     	[i]);
				model.setCntr_lstm_cng_flg     		  ( cntr_lstm_cng_flg     	[i]);
				model.setPrnr_yd_cd            		  ( prnr_yd_cd            	[i]);
				model.setPrnr_sts_seq          		  ( prnr_sts_seq          	[i]);
				model.setCntr_sts_rmk          		  ( cntr_sts_rmk          	[i]);
				model.setCntr_sts_delt_flg     		  ( cntr_sts_delt_flg     	[i]);
				model.setCre_usr_id            		  ( cre_usr_id            	[i]);
				model.setCre_dt                		  ( cre_dt                	[i]);
				model.setUpd_usr_id            		  ( upd_usr_id            	[i]);
				model.setUpd_dt                		  ( upd_dt                	[i]);
				model.setCnmv_sts_cd           		  ( cnmv_sts_cd           	[i]);
				model.setCntr_full_flg         		  ( cntr_full_flg         	[i]);
				model.setCntr_free_dy_exp_dt   		  ( cntr_free_dy_exp_dt   	[i]);
				model.setCntr_chg_calc_flg     		  ( cntr_chg_calc_flg     	[i]);
				model.setCntr_ls_flg           		  ( cntr_ls_flg           	[i]);
				model.setCntr_sts_pair_seq     		  ( cntr_sts_pair_seq     	[i]);
				model.setNis_evnt_dt           		  ( nis_evnt_dt           	[i]);
				model.setCntr_min_onh_dys      		  ( cntr_min_onh_dys      	[i]);
				model.setCntr_auth_no          		  ( cntr_auth_no          	[i]);
				model.setEcc_cd                		  ( ecc_cd                	[i]);
				model.setEai_evnt_dt           		  ( eai_evnt_dt           	[i]);
				model.setCo_cd           		  ( co_cd           	[i]);
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
