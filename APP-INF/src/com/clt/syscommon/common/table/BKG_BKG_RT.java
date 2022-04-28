/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : BKG_BKG_RT.java
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
public final class BKG_BKG_RT implements java.io.Serializable {

	private String               ibflag               = "";
	private String               page_rows            = "";
	private String               bkg_no               = "";
	private String               bkg_no_split         = "";
	private String               agmt_rt_cd           = "";
	private String               rt_seq_no            = "";
	private String               bl_chg_cd            = "";
	private String               bkg_agmt_tp_cd       = "";
	private String               sc_rfa_agmt_no       = "";
	private String               rt_cust_tp_cd        = "";
	private String               curr_cd              = "";
	private String               trf_rt_amt           = "";
	private String               cntr_qty             = "";
	private String               bkg_agmt_ut_cd       = "";
	private String               rt_chg_amt           = "";
	private String               chg_tp_cd            = "";
	private String               dp_seq               = "";
	private String               bkg_qty              = "";
	private String               bkg_cbm_qty          = "";
	private String               bkg_mty_qty          = "";
	private String               cgo_cate_cd          = "";
	private String               imo_cate_cd          = "";
	private String               rcv_term_cd          = "";
	private String               de_term_cd           = "";
	private String               auto_mnl_div_cd      = "";
	private String               n3rd_ppd_ofc_cd      = "";
	private String               cre_dt               = "";
	private String               cre_usr_id           = "";
	private String               rt_rcv_loc_cd        = "";
	private String               upd_dt               = "";
	private String               upd_usr_id           = "";
	private String               rt_chg_flg           = "";
	private String               bkg_rt_xcld_cd       = "";
	private String               dest_loc_cd          = "";
	private String               bkg_inv_no           = "";
	private String               bkg_inv_sts_cd       = "";
	private String               chg_payr_tp_cd       = "";
	private String               nmf_chg_flg          = "";
	private String               n3rd_payr_cnt_cd     = "";
	private String               n3rd_payr_seq        = "";
	private String               act_n3rd_payr_cnt_cd = "";
	private String               act_n3rd_payr_seq    = "";
	private String               n3rd_bfr_ofc_cd      = "";
	private String               chg_alin_flg         = "";
	private String               mrg_seq              = "";
	private String               nis_evnt_dt          = "";
	private String               bl_prn_hdn_flg       = "";
	private String               eai_evnt_dt          = "";

	public BKG_BKG_RT(){}

	public BKG_BKG_RT(
			String               ibflag              ,
			String               page_rows           ,
			String               bkg_no              ,
			String               bkg_no_split        ,
			String               agmt_rt_cd          ,
			String               rt_seq_no           ,
			String               bl_chg_cd           ,
			String               bkg_agmt_tp_cd      ,
			String               sc_rfa_agmt_no      ,
			String               rt_cust_tp_cd       ,
			String               curr_cd             ,
			String               trf_rt_amt          ,
			String               cntr_qty            ,
			String               bkg_agmt_ut_cd      ,
			String               rt_chg_amt          ,
			String               chg_tp_cd           ,
			String               dp_seq              ,
			String               bkg_qty             ,
			String               bkg_cbm_qty         ,
			String               bkg_mty_qty         ,
			String               cgo_cate_cd         ,
			String               imo_cate_cd         ,
			String               rcv_term_cd         ,
			String               de_term_cd          ,
			String               auto_mnl_div_cd     ,
			String               n3rd_ppd_ofc_cd     ,
			String               cre_dt              ,
			String               cre_usr_id          ,
			String               rt_rcv_loc_cd       ,
			String               upd_dt              ,
			String               upd_usr_id          ,
			String               rt_chg_flg          ,
			String               bkg_rt_xcld_cd      ,
			String               dest_loc_cd         ,
			String               bkg_inv_no          ,
			String               bkg_inv_sts_cd      ,
			String               chg_payr_tp_cd      ,
			String               nmf_chg_flg         ,
			String               n3rd_payr_cnt_cd    ,
			String               n3rd_payr_seq       ,
			String               act_n3rd_payr_cnt_cd,
			String               act_n3rd_payr_seq   ,
			String               n3rd_bfr_ofc_cd     ,
			String               chg_alin_flg        ,
			String               mrg_seq             ,
			String               nis_evnt_dt         ,
			String               bl_prn_hdn_flg      ,
			String               eai_evnt_dt         ){
		this.ibflag               = ibflag              ;
		this.page_rows            = page_rows           ;
		this.bkg_no               = bkg_no              ;
		this.bkg_no_split         = bkg_no_split        ;
		this.agmt_rt_cd           = agmt_rt_cd          ;
		this.rt_seq_no            = rt_seq_no           ;
		this.bl_chg_cd            = bl_chg_cd           ;
		this.bkg_agmt_tp_cd       = bkg_agmt_tp_cd      ;
		this.sc_rfa_agmt_no       = sc_rfa_agmt_no      ;
		this.rt_cust_tp_cd        = rt_cust_tp_cd       ;
		this.curr_cd              = curr_cd             ;
		this.trf_rt_amt           = trf_rt_amt          ;
		this.cntr_qty             = cntr_qty            ;
		this.bkg_agmt_ut_cd       = bkg_agmt_ut_cd      ;
		this.rt_chg_amt           = rt_chg_amt          ;
		this.chg_tp_cd            = chg_tp_cd           ;
		this.dp_seq               = dp_seq              ;
		this.bkg_qty              = bkg_qty             ;
		this.bkg_cbm_qty          = bkg_cbm_qty         ;
		this.bkg_mty_qty          = bkg_mty_qty         ;
		this.cgo_cate_cd          = cgo_cate_cd         ;
		this.imo_cate_cd          = imo_cate_cd         ;
		this.rcv_term_cd          = rcv_term_cd         ;
		this.de_term_cd           = de_term_cd          ;
		this.auto_mnl_div_cd      = auto_mnl_div_cd     ;
		this.n3rd_ppd_ofc_cd      = n3rd_ppd_ofc_cd     ;
		this.cre_dt               = cre_dt              ;
		this.cre_usr_id           = cre_usr_id          ;
		this.rt_rcv_loc_cd        = rt_rcv_loc_cd       ;
		this.upd_dt               = upd_dt              ;
		this.upd_usr_id           = upd_usr_id          ;
		this.rt_chg_flg           = rt_chg_flg          ;
		this.bkg_rt_xcld_cd       = bkg_rt_xcld_cd      ;
		this.dest_loc_cd          = dest_loc_cd         ;
		this.bkg_inv_no           = bkg_inv_no          ;
		this.bkg_inv_sts_cd       = bkg_inv_sts_cd      ;
		this.chg_payr_tp_cd       = chg_payr_tp_cd      ;
		this.nmf_chg_flg          = nmf_chg_flg         ;
		this.n3rd_payr_cnt_cd     = n3rd_payr_cnt_cd    ;
		this.n3rd_payr_seq        = n3rd_payr_seq       ;
		this.act_n3rd_payr_cnt_cd = act_n3rd_payr_cnt_cd;
		this.act_n3rd_payr_seq    = act_n3rd_payr_seq   ;
		this.n3rd_bfr_ofc_cd      = n3rd_bfr_ofc_cd     ;
		this.chg_alin_flg         = chg_alin_flg        ;
		this.mrg_seq              = mrg_seq             ;
		this.nis_evnt_dt          = nis_evnt_dt         ;
		this.bl_prn_hdn_flg       = bl_prn_hdn_flg      ;
		this.eai_evnt_dt          = eai_evnt_dt         ;
	}

	// getter method is proceeding ..
	public String               getIbflag              (){	return ibflag              	;	}
	public String               getPage_rows           (){	return page_rows           	;	}
	public String               getBkg_no              (){	return bkg_no              	;	}
	public String               getBkg_no_split        (){	return bkg_no_split        	;	}
	public String               getAgmt_rt_cd          (){	return agmt_rt_cd          	;	}
	public String               getRt_seq_no           (){	return rt_seq_no           	;	}
	public String               getBl_chg_cd           (){	return bl_chg_cd           	;	}
	public String               getBkg_agmt_tp_cd      (){	return bkg_agmt_tp_cd      	;	}
	public String               getSc_rfa_agmt_no      (){	return sc_rfa_agmt_no      	;	}
	public String               getRt_cust_tp_cd       (){	return rt_cust_tp_cd       	;	}
	public String               getCurr_cd             (){	return curr_cd             	;	}
	public String               getTrf_rt_amt          (){	return trf_rt_amt          	;	}
	public String               getCntr_qty            (){	return cntr_qty            	;	}
	public String               getBkg_agmt_ut_cd      (){	return bkg_agmt_ut_cd      	;	}
	public String               getRt_chg_amt          (){	return rt_chg_amt          	;	}
	public String               getChg_tp_cd           (){	return chg_tp_cd           	;	}
	public String               getDp_seq              (){	return dp_seq              	;	}
	public String               getBkg_qty             (){	return bkg_qty             	;	}
	public String               getBkg_cbm_qty         (){	return bkg_cbm_qty         	;	}
	public String               getBkg_mty_qty         (){	return bkg_mty_qty         	;	}
	public String               getCgo_cate_cd         (){	return cgo_cate_cd         	;	}
	public String               getImo_cate_cd         (){	return imo_cate_cd         	;	}
	public String               getRcv_term_cd         (){	return rcv_term_cd         	;	}
	public String               getDe_term_cd          (){	return de_term_cd          	;	}
	public String               getAuto_mnl_div_cd     (){	return auto_mnl_div_cd     	;	}
	public String               getN3rd_ppd_ofc_cd     (){	return n3rd_ppd_ofc_cd     	;	}
	public String               getCre_dt              (){	return cre_dt              	;	}
	public String               getCre_usr_id          (){	return cre_usr_id          	;	}
	public String               getRt_rcv_loc_cd       (){	return rt_rcv_loc_cd       	;	}
	public String               getUpd_dt              (){	return upd_dt              	;	}
	public String               getUpd_usr_id          (){	return upd_usr_id          	;	}
	public String               getRt_chg_flg          (){	return rt_chg_flg          	;	}
	public String               getBkg_rt_xcld_cd      (){	return bkg_rt_xcld_cd      	;	}
	public String               getDest_loc_cd         (){	return dest_loc_cd         	;	}
	public String               getBkg_inv_no          (){	return bkg_inv_no          	;	}
	public String               getBkg_inv_sts_cd      (){	return bkg_inv_sts_cd      	;	}
	public String               getChg_payr_tp_cd      (){	return chg_payr_tp_cd      	;	}
	public String               getNmf_chg_flg         (){	return nmf_chg_flg         	;	}
	public String               getN3rd_payr_cnt_cd    (){	return n3rd_payr_cnt_cd    	;	}
	public String               getN3rd_payr_seq       (){	return n3rd_payr_seq       	;	}
	public String               getAct_n3rd_payr_cnt_cd(){	return act_n3rd_payr_cnt_cd	;	}
	public String               getAct_n3rd_payr_seq   (){	return act_n3rd_payr_seq   	;	}
	public String               getN3rd_bfr_ofc_cd     (){	return n3rd_bfr_ofc_cd     	;	}
	public String               getChg_alin_flg        (){	return chg_alin_flg        	;	}
	public String               getMrg_seq             (){	return mrg_seq             	;	}
	public String               getNis_evnt_dt         (){	return nis_evnt_dt         	;	}
	public String               getBl_prn_hdn_flg      (){	return bl_prn_hdn_flg      	;	}
	public String               getEai_evnt_dt         (){	return eai_evnt_dt         	;	}

	// setter method is proceeding ..
	public void setIbflag              ( String               ibflag               ){	this.ibflag               = ibflag              	;	}
	public void setPage_rows           ( String               page_rows            ){	this.page_rows            = page_rows           	;	}
	public void setBkg_no              ( String               bkg_no               ){	this.bkg_no               = bkg_no              	;	}
	public void setBkg_no_split        ( String               bkg_no_split         ){	this.bkg_no_split         = bkg_no_split        	;	}
	public void setAgmt_rt_cd          ( String               agmt_rt_cd           ){	this.agmt_rt_cd           = agmt_rt_cd          	;	}
	public void setRt_seq_no           ( String               rt_seq_no            ){	this.rt_seq_no            = rt_seq_no           	;	}
	public void setBl_chg_cd           ( String               bl_chg_cd            ){	this.bl_chg_cd            = bl_chg_cd           	;	}
	public void setBkg_agmt_tp_cd      ( String               bkg_agmt_tp_cd       ){	this.bkg_agmt_tp_cd       = bkg_agmt_tp_cd      	;	}
	public void setSc_rfa_agmt_no      ( String               sc_rfa_agmt_no       ){	this.sc_rfa_agmt_no       = sc_rfa_agmt_no      	;	}
	public void setRt_cust_tp_cd       ( String               rt_cust_tp_cd        ){	this.rt_cust_tp_cd        = rt_cust_tp_cd       	;	}
	public void setCurr_cd             ( String               curr_cd              ){	this.curr_cd              = curr_cd             	;	}
	public void setTrf_rt_amt          ( String               trf_rt_amt           ){	this.trf_rt_amt           = trf_rt_amt          	;	}
	public void setCntr_qty            ( String               cntr_qty             ){	this.cntr_qty             = cntr_qty            	;	}
	public void setBkg_agmt_ut_cd      ( String               bkg_agmt_ut_cd       ){	this.bkg_agmt_ut_cd       = bkg_agmt_ut_cd      	;	}
	public void setRt_chg_amt          ( String               rt_chg_amt           ){	this.rt_chg_amt           = rt_chg_amt          	;	}
	public void setChg_tp_cd           ( String               chg_tp_cd            ){	this.chg_tp_cd            = chg_tp_cd           	;	}
	public void setDp_seq              ( String               dp_seq               ){	this.dp_seq               = dp_seq              	;	}
	public void setBkg_qty             ( String               bkg_qty              ){	this.bkg_qty              = bkg_qty             	;	}
	public void setBkg_cbm_qty         ( String               bkg_cbm_qty          ){	this.bkg_cbm_qty          = bkg_cbm_qty         	;	}
	public void setBkg_mty_qty         ( String               bkg_mty_qty          ){	this.bkg_mty_qty          = bkg_mty_qty         	;	}
	public void setCgo_cate_cd         ( String               cgo_cate_cd          ){	this.cgo_cate_cd          = cgo_cate_cd         	;	}
	public void setImo_cate_cd         ( String               imo_cate_cd          ){	this.imo_cate_cd          = imo_cate_cd         	;	}
	public void setRcv_term_cd         ( String               rcv_term_cd          ){	this.rcv_term_cd          = rcv_term_cd         	;	}
	public void setDe_term_cd          ( String               de_term_cd           ){	this.de_term_cd           = de_term_cd          	;	}
	public void setAuto_mnl_div_cd     ( String               auto_mnl_div_cd      ){	this.auto_mnl_div_cd      = auto_mnl_div_cd     	;	}
	public void setN3rd_ppd_ofc_cd     ( String               n3rd_ppd_ofc_cd      ){	this.n3rd_ppd_ofc_cd      = n3rd_ppd_ofc_cd     	;	}
	public void setCre_dt              ( String               cre_dt               ){	this.cre_dt               = cre_dt              	;	}
	public void setCre_usr_id          ( String               cre_usr_id           ){	this.cre_usr_id           = cre_usr_id          	;	}
	public void setRt_rcv_loc_cd       ( String               rt_rcv_loc_cd        ){	this.rt_rcv_loc_cd        = rt_rcv_loc_cd       	;	}
	public void setUpd_dt              ( String               upd_dt               ){	this.upd_dt               = upd_dt              	;	}
	public void setUpd_usr_id          ( String               upd_usr_id           ){	this.upd_usr_id           = upd_usr_id          	;	}
	public void setRt_chg_flg          ( String               rt_chg_flg           ){	this.rt_chg_flg           = rt_chg_flg          	;	}
	public void setBkg_rt_xcld_cd      ( String               bkg_rt_xcld_cd       ){	this.bkg_rt_xcld_cd       = bkg_rt_xcld_cd      	;	}
	public void setDest_loc_cd         ( String               dest_loc_cd          ){	this.dest_loc_cd          = dest_loc_cd         	;	}
	public void setBkg_inv_no          ( String               bkg_inv_no           ){	this.bkg_inv_no           = bkg_inv_no          	;	}
	public void setBkg_inv_sts_cd      ( String               bkg_inv_sts_cd       ){	this.bkg_inv_sts_cd       = bkg_inv_sts_cd      	;	}
	public void setChg_payr_tp_cd      ( String               chg_payr_tp_cd       ){	this.chg_payr_tp_cd       = chg_payr_tp_cd      	;	}
	public void setNmf_chg_flg         ( String               nmf_chg_flg          ){	this.nmf_chg_flg          = nmf_chg_flg         	;	}
	public void setN3rd_payr_cnt_cd    ( String               n3rd_payr_cnt_cd     ){	this.n3rd_payr_cnt_cd     = n3rd_payr_cnt_cd    	;	}
	public void setN3rd_payr_seq       ( String               n3rd_payr_seq        ){	this.n3rd_payr_seq        = n3rd_payr_seq       	;	}
	public void setAct_n3rd_payr_cnt_cd( String               act_n3rd_payr_cnt_cd ){	this.act_n3rd_payr_cnt_cd = act_n3rd_payr_cnt_cd	;	}
	public void setAct_n3rd_payr_seq   ( String               act_n3rd_payr_seq    ){	this.act_n3rd_payr_seq    = act_n3rd_payr_seq   	;	}
	public void setN3rd_bfr_ofc_cd     ( String               n3rd_bfr_ofc_cd      ){	this.n3rd_bfr_ofc_cd      = n3rd_bfr_ofc_cd     	;	}
	public void setChg_alin_flg        ( String               chg_alin_flg         ){	this.chg_alin_flg         = chg_alin_flg        	;	}
	public void setMrg_seq             ( String               mrg_seq              ){	this.mrg_seq              = mrg_seq             	;	}
	public void setNis_evnt_dt         ( String               nis_evnt_dt          ){	this.nis_evnt_dt          = nis_evnt_dt         	;	}
	public void setBl_prn_hdn_flg      ( String               bl_prn_hdn_flg       ){	this.bl_prn_hdn_flg       = bl_prn_hdn_flg      	;	}
	public void setEai_evnt_dt         ( String               eai_evnt_dt          ){	this.eai_evnt_dt          = eai_evnt_dt         	;	}

	public static BKG_BKG_RT fromRequest(HttpServletRequest request) {
		BKG_BKG_RT model = new BKG_BKG_RT();
		try {
			model.setIbflag              	(JSPUtil.getParameter(request, "ibflag              		".trim(), ""));
			model.setPage_rows           	(JSPUtil.getParameter(request, "page_rows           		".trim(), ""));
			model.setBkg_no              	(JSPUtil.getParameter(request, "bkg_no              		".trim(), ""));
			model.setBkg_no_split        	(JSPUtil.getParameter(request, "bkg_no_split        		".trim(), ""));
			model.setAgmt_rt_cd          	(JSPUtil.getParameter(request, "agmt_rt_cd          		".trim(), ""));
			model.setRt_seq_no           	(JSPUtil.getParameter(request, "rt_seq_no           		".trim(), ""));
			model.setBl_chg_cd           	(JSPUtil.getParameter(request, "bl_chg_cd           		".trim(), ""));
			model.setBkg_agmt_tp_cd      	(JSPUtil.getParameter(request, "bkg_agmt_tp_cd      		".trim(), ""));
			model.setSc_rfa_agmt_no      	(JSPUtil.getParameter(request, "sc_rfa_agmt_no      		".trim(), ""));
			model.setRt_cust_tp_cd       	(JSPUtil.getParameter(request, "rt_cust_tp_cd       		".trim(), ""));
			model.setCurr_cd             	(JSPUtil.getParameter(request, "curr_cd             		".trim(), ""));
			model.setTrf_rt_amt          	(JSPUtil.getParameter(request, "trf_rt_amt          		".trim(), ""));
			model.setCntr_qty            	(JSPUtil.getParameter(request, "cntr_qty            		".trim(), ""));
			model.setBkg_agmt_ut_cd      	(JSPUtil.getParameter(request, "bkg_agmt_ut_cd      		".trim(), ""));
			model.setRt_chg_amt          	(JSPUtil.getParameter(request, "rt_chg_amt          		".trim(), ""));
			model.setChg_tp_cd           	(JSPUtil.getParameter(request, "chg_tp_cd           		".trim(), ""));
			model.setDp_seq              	(JSPUtil.getParameter(request, "dp_seq              		".trim(), ""));
			model.setBkg_qty             	(JSPUtil.getParameter(request, "bkg_qty             		".trim(), ""));
			model.setBkg_cbm_qty         	(JSPUtil.getParameter(request, "bkg_cbm_qty         		".trim(), ""));
			model.setBkg_mty_qty         	(JSPUtil.getParameter(request, "bkg_mty_qty         		".trim(), ""));
			model.setCgo_cate_cd         	(JSPUtil.getParameter(request, "cgo_cate_cd         		".trim(), ""));
			model.setImo_cate_cd         	(JSPUtil.getParameter(request, "imo_cate_cd         		".trim(), ""));
			model.setRcv_term_cd         	(JSPUtil.getParameter(request, "rcv_term_cd         		".trim(), ""));
			model.setDe_term_cd          	(JSPUtil.getParameter(request, "de_term_cd          		".trim(), ""));
			model.setAuto_mnl_div_cd     	(JSPUtil.getParameter(request, "auto_mnl_div_cd     		".trim(), ""));
			model.setN3rd_ppd_ofc_cd     	(JSPUtil.getParameter(request, "n3rd_ppd_ofc_cd     		".trim(), ""));
			model.setCre_dt              	(JSPUtil.getParameter(request, "cre_dt              		".trim(), ""));
			model.setCre_usr_id          	(JSPUtil.getParameter(request, "cre_usr_id          		".trim(), ""));
			model.setRt_rcv_loc_cd       	(JSPUtil.getParameter(request, "rt_rcv_loc_cd       		".trim(), ""));
			model.setUpd_dt              	(JSPUtil.getParameter(request, "upd_dt              		".trim(), ""));
			model.setUpd_usr_id          	(JSPUtil.getParameter(request, "upd_usr_id          		".trim(), ""));
			model.setRt_chg_flg          	(JSPUtil.getParameter(request, "rt_chg_flg          		".trim(), ""));
			model.setBkg_rt_xcld_cd      	(JSPUtil.getParameter(request, "bkg_rt_xcld_cd      		".trim(), ""));
			model.setDest_loc_cd         	(JSPUtil.getParameter(request, "dest_loc_cd         		".trim(), ""));
			model.setBkg_inv_no          	(JSPUtil.getParameter(request, "bkg_inv_no          		".trim(), ""));
			model.setBkg_inv_sts_cd      	(JSPUtil.getParameter(request, "bkg_inv_sts_cd      		".trim(), ""));
			model.setChg_payr_tp_cd      	(JSPUtil.getParameter(request, "chg_payr_tp_cd      		".trim(), ""));
			model.setNmf_chg_flg         	(JSPUtil.getParameter(request, "nmf_chg_flg         		".trim(), ""));
			model.setN3rd_payr_cnt_cd    	(JSPUtil.getParameter(request, "n3rd_payr_cnt_cd    		".trim(), ""));
			model.setN3rd_payr_seq       	(JSPUtil.getParameter(request, "n3rd_payr_seq       		".trim(), ""));
			model.setAct_n3rd_payr_cnt_cd	(JSPUtil.getParameter(request, "act_n3rd_payr_cnt_cd		".trim(), ""));
			model.setAct_n3rd_payr_seq   	(JSPUtil.getParameter(request, "act_n3rd_payr_seq   		".trim(), ""));
			model.setN3rd_bfr_ofc_cd     	(JSPUtil.getParameter(request, "n3rd_bfr_ofc_cd     		".trim(), ""));
			model.setChg_alin_flg        	(JSPUtil.getParameter(request, "chg_alin_flg        		".trim(), ""));
			model.setMrg_seq             	(JSPUtil.getParameter(request, "mrg_seq             		".trim(), ""));
			model.setNis_evnt_dt         	(JSPUtil.getParameter(request, "nis_evnt_dt         		".trim(), ""));
			model.setBl_prn_hdn_flg      	(JSPUtil.getParameter(request, "bl_prn_hdn_flg      		".trim(), ""));
			model.setEai_evnt_dt         	(JSPUtil.getParameter(request, "eai_evnt_dt         		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		BKG_BKG_RT model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag               =  (JSPUtil.getParameter(request, "ibflag              		".trim(), length));
			String[] page_rows            =  (JSPUtil.getParameter(request, "page_rows           		".trim(), length));
			String[] bkg_no               =  (JSPUtil.getParameter(request, "bkg_no              		".trim(), length));
			String[] bkg_no_split         =  (JSPUtil.getParameter(request, "bkg_no_split        		".trim(), length));
			String[] agmt_rt_cd           =  (JSPUtil.getParameter(request, "agmt_rt_cd          		".trim(), length));
			String[] rt_seq_no            =  (JSPUtil.getParameter(request, "rt_seq_no           		".trim(), length));
			String[] bl_chg_cd            =  (JSPUtil.getParameter(request, "bl_chg_cd           		".trim(), length));
			String[] bkg_agmt_tp_cd       =  (JSPUtil.getParameter(request, "bkg_agmt_tp_cd      		".trim(), length));
			String[] sc_rfa_agmt_no       =  (JSPUtil.getParameter(request, "sc_rfa_agmt_no      		".trim(), length));
			String[] rt_cust_tp_cd        =  (JSPUtil.getParameter(request, "rt_cust_tp_cd       		".trim(), length));
			String[] curr_cd              =  (JSPUtil.getParameter(request, "curr_cd             		".trim(), length));
			String[] trf_rt_amt           =  (JSPUtil.getParameter(request, "trf_rt_amt          		".trim(), length));
			String[] cntr_qty             =  (JSPUtil.getParameter(request, "cntr_qty            		".trim(), length));
			String[] bkg_agmt_ut_cd       =  (JSPUtil.getParameter(request, "bkg_agmt_ut_cd      		".trim(), length));
			String[] rt_chg_amt           =  (JSPUtil.getParameter(request, "rt_chg_amt          		".trim(), length));
			String[] chg_tp_cd            =  (JSPUtil.getParameter(request, "chg_tp_cd           		".trim(), length));
			String[] dp_seq               =  (JSPUtil.getParameter(request, "dp_seq              		".trim(), length));
			String[] bkg_qty              =  (JSPUtil.getParameter(request, "bkg_qty             		".trim(), length));
			String[] bkg_cbm_qty          =  (JSPUtil.getParameter(request, "bkg_cbm_qty         		".trim(), length));
			String[] bkg_mty_qty          =  (JSPUtil.getParameter(request, "bkg_mty_qty         		".trim(), length));
			String[] cgo_cate_cd          =  (JSPUtil.getParameter(request, "cgo_cate_cd         		".trim(), length));
			String[] imo_cate_cd          =  (JSPUtil.getParameter(request, "imo_cate_cd         		".trim(), length));
			String[] rcv_term_cd          =  (JSPUtil.getParameter(request, "rcv_term_cd         		".trim(), length));
			String[] de_term_cd           =  (JSPUtil.getParameter(request, "de_term_cd          		".trim(), length));
			String[] auto_mnl_div_cd      =  (JSPUtil.getParameter(request, "auto_mnl_div_cd     		".trim(), length));
			String[] n3rd_ppd_ofc_cd      =  (JSPUtil.getParameter(request, "n3rd_ppd_ofc_cd     		".trim(), length));
			String[] cre_dt               =  (JSPUtil.getParameter(request, "cre_dt              		".trim(), length));
			String[] cre_usr_id           =  (JSPUtil.getParameter(request, "cre_usr_id          		".trim(), length));
			String[] rt_rcv_loc_cd        =  (JSPUtil.getParameter(request, "rt_rcv_loc_cd       		".trim(), length));
			String[] upd_dt               =  (JSPUtil.getParameter(request, "upd_dt              		".trim(), length));
			String[] upd_usr_id           =  (JSPUtil.getParameter(request, "upd_usr_id          		".trim(), length));
			String[] rt_chg_flg           =  (JSPUtil.getParameter(request, "rt_chg_flg          		".trim(), length));
			String[] bkg_rt_xcld_cd       =  (JSPUtil.getParameter(request, "bkg_rt_xcld_cd      		".trim(), length));
			String[] dest_loc_cd          =  (JSPUtil.getParameter(request, "dest_loc_cd         		".trim(), length));
			String[] bkg_inv_no           =  (JSPUtil.getParameter(request, "bkg_inv_no          		".trim(), length));
			String[] bkg_inv_sts_cd       =  (JSPUtil.getParameter(request, "bkg_inv_sts_cd      		".trim(), length));
			String[] chg_payr_tp_cd       =  (JSPUtil.getParameter(request, "chg_payr_tp_cd      		".trim(), length));
			String[] nmf_chg_flg          =  (JSPUtil.getParameter(request, "nmf_chg_flg         		".trim(), length));
			String[] n3rd_payr_cnt_cd     =  (JSPUtil.getParameter(request, "n3rd_payr_cnt_cd    		".trim(), length));
			String[] n3rd_payr_seq        =  (JSPUtil.getParameter(request, "n3rd_payr_seq       		".trim(), length));
			String[] act_n3rd_payr_cnt_cd =  (JSPUtil.getParameter(request, "act_n3rd_payr_cnt_cd		".trim(), length));
			String[] act_n3rd_payr_seq    =  (JSPUtil.getParameter(request, "act_n3rd_payr_seq   		".trim(), length));
			String[] n3rd_bfr_ofc_cd      =  (JSPUtil.getParameter(request, "n3rd_bfr_ofc_cd     		".trim(), length));
			String[] chg_alin_flg         =  (JSPUtil.getParameter(request, "chg_alin_flg        		".trim(), length));
			String[] mrg_seq              =  (JSPUtil.getParameter(request, "mrg_seq             		".trim(), length));
			String[] nis_evnt_dt          =  (JSPUtil.getParameter(request, "nis_evnt_dt         		".trim(), length));
			String[] bl_prn_hdn_flg       =  (JSPUtil.getParameter(request, "bl_prn_hdn_flg      		".trim(), length));
			String[] eai_evnt_dt          =  (JSPUtil.getParameter(request, "eai_evnt_dt         		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new BKG_BKG_RT();
				model.setIbflag              		  (ibflag              	[i]);
				model.setPage_rows           		  (page_rows           	[i]);
				model.setBkg_no              		  (bkg_no              	[i]);
				model.setBkg_no_split        		  (bkg_no_split        	[i]);
				model.setAgmt_rt_cd          		  (agmt_rt_cd          	[i]);
				model.setRt_seq_no           		  (rt_seq_no           	[i]);
				model.setBl_chg_cd           		  (bl_chg_cd           	[i]);
				model.setBkg_agmt_tp_cd      		  (bkg_agmt_tp_cd      	[i]);
				model.setSc_rfa_agmt_no      		  (sc_rfa_agmt_no      	[i]);
				model.setRt_cust_tp_cd       		  (rt_cust_tp_cd       	[i]);
				model.setCurr_cd             		  (curr_cd             	[i]);
				model.setTrf_rt_amt          		  (trf_rt_amt          	[i]);
				model.setCntr_qty            		  (cntr_qty            	[i]);
				model.setBkg_agmt_ut_cd      		  (bkg_agmt_ut_cd      	[i]);
				model.setRt_chg_amt          		  (rt_chg_amt          	[i]);
				model.setChg_tp_cd           		  (chg_tp_cd           	[i]);
				model.setDp_seq              		  (dp_seq              	[i]);
				model.setBkg_qty             		  (bkg_qty             	[i]);
				model.setBkg_cbm_qty         		  (bkg_cbm_qty         	[i]);
				model.setBkg_mty_qty         		  (bkg_mty_qty         	[i]);
				model.setCgo_cate_cd         		  (cgo_cate_cd         	[i]);
				model.setImo_cate_cd         		  (imo_cate_cd         	[i]);
				model.setRcv_term_cd         		  (rcv_term_cd         	[i]);
				model.setDe_term_cd          		  (de_term_cd          	[i]);
				model.setAuto_mnl_div_cd     		  (auto_mnl_div_cd     	[i]);
				model.setN3rd_ppd_ofc_cd     		  (n3rd_ppd_ofc_cd     	[i]);
				model.setCre_dt              		  (cre_dt              	[i]);
				model.setCre_usr_id          		  (cre_usr_id          	[i]);
				model.setRt_rcv_loc_cd       		  (rt_rcv_loc_cd       	[i]);
				model.setUpd_dt              		  (upd_dt              	[i]);
				model.setUpd_usr_id          		  (upd_usr_id          	[i]);
				model.setRt_chg_flg          		  (rt_chg_flg          	[i]);
				model.setBkg_rt_xcld_cd      		  (bkg_rt_xcld_cd      	[i]);
				model.setDest_loc_cd         		  (dest_loc_cd         	[i]);
				model.setBkg_inv_no          		  (bkg_inv_no          	[i]);
				model.setBkg_inv_sts_cd      		  (bkg_inv_sts_cd      	[i]);
				model.setChg_payr_tp_cd      		  (chg_payr_tp_cd      	[i]);
				model.setNmf_chg_flg         		  (nmf_chg_flg         	[i]);
				model.setN3rd_payr_cnt_cd    		  (n3rd_payr_cnt_cd    	[i]);
				model.setN3rd_payr_seq       		  (n3rd_payr_seq       	[i]);
				model.setAct_n3rd_payr_cnt_cd		  (act_n3rd_payr_cnt_cd	[i]);
				model.setAct_n3rd_payr_seq   		  (act_n3rd_payr_seq   	[i]);
				model.setN3rd_bfr_ofc_cd     		  (n3rd_bfr_ofc_cd     	[i]);
				model.setChg_alin_flg        		  (chg_alin_flg        	[i]);
				model.setMrg_seq             		  (mrg_seq             	[i]);
				model.setNis_evnt_dt         		  (nis_evnt_dt         	[i]);
				model.setBl_prn_hdn_flg      		  (bl_prn_hdn_flg      	[i]);
				model.setEai_evnt_dt         		  (eai_evnt_dt         	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		BKG_BKG_RT model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag               =  (JSPUtil.getParameter(request, prefix + "ibflag              		".trim(), length));
			String[] page_rows            =  (JSPUtil.getParameter(request, prefix + "page_rows           		".trim(), length));
			String[] bkg_no               =  (JSPUtil.getParameter(request, prefix + "bkg_no              		".trim(), length));
			String[] bkg_no_split         =  (JSPUtil.getParameter(request, prefix + "bkg_no_split        		".trim(), length));
			String[] agmt_rt_cd           =  (JSPUtil.getParameter(request, prefix + "agmt_rt_cd          		".trim(), length));
			String[] rt_seq_no            =  (JSPUtil.getParameter(request, prefix + "rt_seq_no           		".trim(), length));
			String[] bl_chg_cd            =  (JSPUtil.getParameter(request, prefix + "bl_chg_cd           		".trim(), length));
			String[] bkg_agmt_tp_cd       =  (JSPUtil.getParameter(request, prefix + "bkg_agmt_tp_cd      		".trim(), length));
			String[] sc_rfa_agmt_no       =  (JSPUtil.getParameter(request, prefix + "sc_rfa_agmt_no      		".trim(), length));
			String[] rt_cust_tp_cd        =  (JSPUtil.getParameter(request, prefix + "rt_cust_tp_cd       		".trim(), length));
			String[] curr_cd              =  (JSPUtil.getParameter(request, prefix + "curr_cd             		".trim(), length));
			String[] trf_rt_amt           =  (JSPUtil.getParameter(request, prefix + "trf_rt_amt          		".trim(), length));
			String[] cntr_qty             =  (JSPUtil.getParameter(request, prefix + "cntr_qty            		".trim(), length));
			String[] bkg_agmt_ut_cd       =  (JSPUtil.getParameter(request, prefix + "bkg_agmt_ut_cd      		".trim(), length));
			String[] rt_chg_amt           =  (JSPUtil.getParameter(request, prefix + "rt_chg_amt          		".trim(), length));
			String[] chg_tp_cd            =  (JSPUtil.getParameter(request, prefix + "chg_tp_cd           		".trim(), length));
			String[] dp_seq               =  (JSPUtil.getParameter(request, prefix + "dp_seq              		".trim(), length));
			String[] bkg_qty              =  (JSPUtil.getParameter(request, prefix + "bkg_qty             		".trim(), length));
			String[] bkg_cbm_qty          =  (JSPUtil.getParameter(request, prefix + "bkg_cbm_qty         		".trim(), length));
			String[] bkg_mty_qty          =  (JSPUtil.getParameter(request, prefix + "bkg_mty_qty         		".trim(), length));
			String[] cgo_cate_cd          =  (JSPUtil.getParameter(request, prefix + "cgo_cate_cd         		".trim(), length));
			String[] imo_cate_cd          =  (JSPUtil.getParameter(request, prefix + "imo_cate_cd         		".trim(), length));
			String[] rcv_term_cd          =  (JSPUtil.getParameter(request, prefix + "rcv_term_cd         		".trim(), length));
			String[] de_term_cd           =  (JSPUtil.getParameter(request, prefix + "de_term_cd          		".trim(), length));
			String[] auto_mnl_div_cd      =  (JSPUtil.getParameter(request, prefix + "auto_mnl_div_cd     		".trim(), length));
			String[] n3rd_ppd_ofc_cd      =  (JSPUtil.getParameter(request, prefix + "n3rd_ppd_ofc_cd     		".trim(), length));
			String[] cre_dt               =  (JSPUtil.getParameter(request, prefix + "cre_dt              		".trim(), length));
			String[] cre_usr_id           =  (JSPUtil.getParameter(request, prefix + "cre_usr_id          		".trim(), length));
			String[] rt_rcv_loc_cd        =  (JSPUtil.getParameter(request, prefix + "rt_rcv_loc_cd       		".trim(), length));
			String[] upd_dt               =  (JSPUtil.getParameter(request, prefix + "upd_dt              		".trim(), length));
			String[] upd_usr_id           =  (JSPUtil.getParameter(request, prefix + "upd_usr_id          		".trim(), length));
			String[] rt_chg_flg           =  (JSPUtil.getParameter(request, prefix + "rt_chg_flg          		".trim(), length));
			String[] bkg_rt_xcld_cd       =  (JSPUtil.getParameter(request, prefix + "bkg_rt_xcld_cd      		".trim(), length));
			String[] dest_loc_cd          =  (JSPUtil.getParameter(request, prefix + "dest_loc_cd         		".trim(), length));
			String[] bkg_inv_no           =  (JSPUtil.getParameter(request, prefix + "bkg_inv_no          		".trim(), length));
			String[] bkg_inv_sts_cd       =  (JSPUtil.getParameter(request, prefix + "bkg_inv_sts_cd      		".trim(), length));
			String[] chg_payr_tp_cd       =  (JSPUtil.getParameter(request, prefix + "chg_payr_tp_cd      		".trim(), length));
			String[] nmf_chg_flg          =  (JSPUtil.getParameter(request, prefix + "nmf_chg_flg         		".trim(), length));
			String[] n3rd_payr_cnt_cd     =  (JSPUtil.getParameter(request, prefix + "n3rd_payr_cnt_cd    		".trim(), length));
			String[] n3rd_payr_seq        =  (JSPUtil.getParameter(request, prefix + "n3rd_payr_seq       		".trim(), length));
			String[] act_n3rd_payr_cnt_cd =  (JSPUtil.getParameter(request, prefix + "act_n3rd_payr_cnt_cd		".trim(), length));
			String[] act_n3rd_payr_seq    =  (JSPUtil.getParameter(request, prefix + "act_n3rd_payr_seq   		".trim(), length));
			String[] n3rd_bfr_ofc_cd      =  (JSPUtil.getParameter(request, prefix + "n3rd_bfr_ofc_cd     		".trim(), length));
			String[] chg_alin_flg         =  (JSPUtil.getParameter(request, prefix + "chg_alin_flg        		".trim(), length));
			String[] mrg_seq              =  (JSPUtil.getParameter(request, prefix + "mrg_seq             		".trim(), length));
			String[] nis_evnt_dt          =  (JSPUtil.getParameter(request, prefix + "nis_evnt_dt         		".trim(), length));
			String[] bl_prn_hdn_flg       =  (JSPUtil.getParameter(request, prefix + "bl_prn_hdn_flg      		".trim(), length));
			String[] eai_evnt_dt          =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt         		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new BKG_BKG_RT();
				model.setIbflag              		  ( ibflag              	[i]);
				model.setPage_rows           		  ( page_rows           	[i]);
				model.setBkg_no              		  ( bkg_no              	[i]);
				model.setBkg_no_split        		  ( bkg_no_split        	[i]);
				model.setAgmt_rt_cd          		  ( agmt_rt_cd          	[i]);
				model.setRt_seq_no           		  ( rt_seq_no           	[i]);
				model.setBl_chg_cd           		  ( bl_chg_cd           	[i]);
				model.setBkg_agmt_tp_cd      		  ( bkg_agmt_tp_cd      	[i]);
				model.setSc_rfa_agmt_no      		  ( sc_rfa_agmt_no      	[i]);
				model.setRt_cust_tp_cd       		  ( rt_cust_tp_cd       	[i]);
				model.setCurr_cd             		  ( curr_cd             	[i]);
				model.setTrf_rt_amt          		  ( trf_rt_amt          	[i]);
				model.setCntr_qty            		  ( cntr_qty            	[i]);
				model.setBkg_agmt_ut_cd      		  ( bkg_agmt_ut_cd      	[i]);
				model.setRt_chg_amt          		  ( rt_chg_amt          	[i]);
				model.setChg_tp_cd           		  ( chg_tp_cd           	[i]);
				model.setDp_seq              		  ( dp_seq              	[i]);
				model.setBkg_qty             		  ( bkg_qty             	[i]);
				model.setBkg_cbm_qty         		  ( bkg_cbm_qty         	[i]);
				model.setBkg_mty_qty         		  ( bkg_mty_qty         	[i]);
				model.setCgo_cate_cd         		  ( cgo_cate_cd         	[i]);
				model.setImo_cate_cd         		  ( imo_cate_cd         	[i]);
				model.setRcv_term_cd         		  ( rcv_term_cd         	[i]);
				model.setDe_term_cd          		  ( de_term_cd          	[i]);
				model.setAuto_mnl_div_cd     		  ( auto_mnl_div_cd     	[i]);
				model.setN3rd_ppd_ofc_cd     		  ( n3rd_ppd_ofc_cd     	[i]);
				model.setCre_dt              		  ( cre_dt              	[i]);
				model.setCre_usr_id          		  ( cre_usr_id          	[i]);
				model.setRt_rcv_loc_cd       		  ( rt_rcv_loc_cd       	[i]);
				model.setUpd_dt              		  ( upd_dt              	[i]);
				model.setUpd_usr_id          		  ( upd_usr_id          	[i]);
				model.setRt_chg_flg          		  ( rt_chg_flg          	[i]);
				model.setBkg_rt_xcld_cd      		  ( bkg_rt_xcld_cd      	[i]);
				model.setDest_loc_cd         		  ( dest_loc_cd         	[i]);
				model.setBkg_inv_no          		  ( bkg_inv_no          	[i]);
				model.setBkg_inv_sts_cd      		  ( bkg_inv_sts_cd      	[i]);
				model.setChg_payr_tp_cd      		  ( chg_payr_tp_cd      	[i]);
				model.setNmf_chg_flg         		  ( nmf_chg_flg         	[i]);
				model.setN3rd_payr_cnt_cd    		  ( n3rd_payr_cnt_cd    	[i]);
				model.setN3rd_payr_seq       		  ( n3rd_payr_seq       	[i]);
				model.setAct_n3rd_payr_cnt_cd		  ( act_n3rd_payr_cnt_cd	[i]);
				model.setAct_n3rd_payr_seq   		  ( act_n3rd_payr_seq   	[i]);
				model.setN3rd_bfr_ofc_cd     		  ( n3rd_bfr_ofc_cd     	[i]);
				model.setChg_alin_flg        		  ( chg_alin_flg        	[i]);
				model.setMrg_seq             		  ( mrg_seq             	[i]);
				model.setNis_evnt_dt         		  ( nis_evnt_dt         	[i]);
				model.setBl_prn_hdn_flg      		  ( bl_prn_hdn_flg      	[i]);
				model.setEai_evnt_dt         		  ( eai_evnt_dt         	[i]);
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
