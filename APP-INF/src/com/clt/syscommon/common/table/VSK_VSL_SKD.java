/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : VSK_VSL_SKD.java
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
public final class VSK_VSL_SKD implements java.io.Serializable {

	private String               ibflag               = "";
	private String               page_rows            = "";
	private String               vsl_cd               = "";
	private String               skd_voy_no           = "";
	private String               skd_dir_cd           = "";
	private String               slan_cd              = "";
	private String               skd_sts_cd           = "";
	private String               skd_cre_dt           = "";
	private String               skd_upd_ind_flg      = "";
	private String               skd_upd_pson_id      = "";
	private String               skd_upd_dt           = "";
	private String               nxt_port_cd          = "";
	private String               nxt_dir_cd           = "";
	private String               nxt_clpt_ind_seq     = "";
	private String               skd_cre_ind_cd       = "";
	private String               skd_rmk              = "";
	private String               skd_voy_tp_cd        = "";
	private String               skd_ldb_qty          = "";
	private String               rev_port_cd          = "";
	private String               rev_dt               = "";
	private String               port_chk_cd          = "";
	private String               jnt_opr_vvd_flg      = "";
	private String               jnt_opr_vvd_cd       = "";
	private String               skd_crr_cd           = "";
	private String               spc_qty              = "";
	private String               skd_cnl_cd           = "";
	private String               ttl_sail_dys         = "";
	private String               act_sail_dys         = "";
	private String               n1st_port_brth_dt    = "";
	private String               fdr_skd_flg          = "";
	private String               spc_ctrl_flg         = "";
	private String               stnd_pln_port_cd     = "";
	private String               pln_yrmon            = "";
	private String               st_port_cd           = "";
	private String               skd_off_band_cd      = "";
	private String               ar_cre_yrmon_dt      = "";
	private String               perf_mng_yrmon       = "";
	private String               tml_vvd_id           = "";
	private String               spc_aloc_qty         = "";
	private String               spc_aloc_wgt         = "";
	private String               spcl_new_ctrl_rf_cd  = "";
	private String               spcl_new_ctrl_wgt_cd = "";
	private String               cntr_blk_div_cd      = "";
	private String               psdo_vvd_cd          = "";
	private String               co_cd                = "";
	private String               cre_pson_id          = "";
	private String               skd_usd_ind_cd       = "";
	private String               nis_evnt_dt          = "";
	private String               skd_rlse_rmk         = "";
	private String               long_rng_skd_irr_flg = "";
	private String               pf_skd_tp_cd         = "";
	private String               long_rng_skd_stl_flg = "";
	private String               eai_evnt_dt          = "";

	public VSK_VSL_SKD(){}

	public VSK_VSL_SKD(
			String               ibflag              ,
			String               page_rows           ,
			String               vsl_cd              ,
			String               skd_voy_no          ,
			String               skd_dir_cd          ,
			String               slan_cd             ,
			String               skd_sts_cd          ,
			String               skd_cre_dt          ,
			String               skd_upd_ind_flg     ,
			String               skd_upd_pson_id     ,
			String               skd_upd_dt          ,
			String               nxt_port_cd         ,
			String               nxt_dir_cd          ,
			String               nxt_clpt_ind_seq    ,
			String               skd_cre_ind_cd      ,
			String               skd_rmk             ,
			String               skd_voy_tp_cd       ,
			String               skd_ldb_qty         ,
			String               rev_port_cd         ,
			String               rev_dt              ,
			String               port_chk_cd         ,
			String               jnt_opr_vvd_flg     ,
			String               jnt_opr_vvd_cd      ,
			String               skd_crr_cd          ,
			String               spc_qty             ,
			String               skd_cnl_cd          ,
			String               ttl_sail_dys        ,
			String               act_sail_dys        ,
			String               n1st_port_brth_dt   ,
			String               fdr_skd_flg         ,
			String               spc_ctrl_flg        ,
			String               stnd_pln_port_cd    ,
			String               pln_yrmon           ,
			String               st_port_cd          ,
			String               skd_off_band_cd     ,
			String               ar_cre_yrmon_dt     ,
			String               perf_mng_yrmon      ,
			String               tml_vvd_id          ,
			String               spc_aloc_qty        ,
			String               spc_aloc_wgt        ,
			String               spcl_new_ctrl_rf_cd ,
			String               spcl_new_ctrl_wgt_cd,
			String               cntr_blk_div_cd     ,
			String               psdo_vvd_cd         ,
			String               co_cd               ,
			String               cre_pson_id         ,
			String               skd_usd_ind_cd      ,
			String               nis_evnt_dt         ,
			String               skd_rlse_rmk        ,
			String               long_rng_skd_irr_flg,
			String               pf_skd_tp_cd        ,
			String               long_rng_skd_stl_flg,
			String               eai_evnt_dt         ){
		this.ibflag               = ibflag              ;
		this.page_rows            = page_rows           ;
		this.vsl_cd               = vsl_cd              ;
		this.skd_voy_no           = skd_voy_no          ;
		this.skd_dir_cd           = skd_dir_cd          ;
		this.slan_cd              = slan_cd             ;
		this.skd_sts_cd           = skd_sts_cd          ;
		this.skd_cre_dt           = skd_cre_dt          ;
		this.skd_upd_ind_flg      = skd_upd_ind_flg     ;
		this.skd_upd_pson_id      = skd_upd_pson_id     ;
		this.skd_upd_dt           = skd_upd_dt          ;
		this.nxt_port_cd          = nxt_port_cd         ;
		this.nxt_dir_cd           = nxt_dir_cd          ;
		this.nxt_clpt_ind_seq     = nxt_clpt_ind_seq    ;
		this.skd_cre_ind_cd       = skd_cre_ind_cd      ;
		this.skd_rmk              = skd_rmk             ;
		this.skd_voy_tp_cd        = skd_voy_tp_cd       ;
		this.skd_ldb_qty          = skd_ldb_qty         ;
		this.rev_port_cd          = rev_port_cd         ;
		this.rev_dt               = rev_dt              ;
		this.port_chk_cd          = port_chk_cd         ;
		this.jnt_opr_vvd_flg      = jnt_opr_vvd_flg     ;
		this.jnt_opr_vvd_cd       = jnt_opr_vvd_cd      ;
		this.skd_crr_cd           = skd_crr_cd          ;
		this.spc_qty              = spc_qty             ;
		this.skd_cnl_cd           = skd_cnl_cd          ;
		this.ttl_sail_dys         = ttl_sail_dys        ;
		this.act_sail_dys         = act_sail_dys        ;
		this.n1st_port_brth_dt    = n1st_port_brth_dt   ;
		this.fdr_skd_flg          = fdr_skd_flg         ;
		this.spc_ctrl_flg         = spc_ctrl_flg        ;
		this.stnd_pln_port_cd     = stnd_pln_port_cd    ;
		this.pln_yrmon            = pln_yrmon           ;
		this.st_port_cd           = st_port_cd          ;
		this.skd_off_band_cd      = skd_off_band_cd     ;
		this.ar_cre_yrmon_dt      = ar_cre_yrmon_dt     ;
		this.perf_mng_yrmon       = perf_mng_yrmon      ;
		this.tml_vvd_id           = tml_vvd_id          ;
		this.spc_aloc_qty         = spc_aloc_qty        ;
		this.spc_aloc_wgt         = spc_aloc_wgt        ;
		this.spcl_new_ctrl_rf_cd  = spcl_new_ctrl_rf_cd ;
		this.spcl_new_ctrl_wgt_cd = spcl_new_ctrl_wgt_cd;
		this.cntr_blk_div_cd      = cntr_blk_div_cd     ;
		this.psdo_vvd_cd          = psdo_vvd_cd         ;
		this.co_cd                = co_cd               ;
		this.cre_pson_id          = cre_pson_id         ;
		this.skd_usd_ind_cd       = skd_usd_ind_cd      ;
		this.nis_evnt_dt          = nis_evnt_dt         ;
		this.skd_rlse_rmk         = skd_rlse_rmk        ;
		this.long_rng_skd_irr_flg = long_rng_skd_irr_flg;
		this.pf_skd_tp_cd         = pf_skd_tp_cd        ;
		this.long_rng_skd_stl_flg = long_rng_skd_stl_flg;
		this.eai_evnt_dt          = eai_evnt_dt         ;
	}

	// getter method is proceeding ..
	public String               getIbflag              (){	return ibflag              	;	}
	public String               getPage_rows           (){	return page_rows           	;	}
	public String               getVsl_cd              (){	return vsl_cd              	;	}
	public String               getSkd_voy_no          (){	return skd_voy_no          	;	}
	public String               getSkd_dir_cd          (){	return skd_dir_cd          	;	}
	public String               getSlan_cd             (){	return slan_cd             	;	}
	public String               getSkd_sts_cd          (){	return skd_sts_cd          	;	}
	public String               getSkd_cre_dt          (){	return skd_cre_dt          	;	}
	public String               getSkd_upd_ind_flg     (){	return skd_upd_ind_flg     	;	}
	public String               getSkd_upd_pson_id     (){	return skd_upd_pson_id     	;	}
	public String               getSkd_upd_dt          (){	return skd_upd_dt          	;	}
	public String               getNxt_port_cd         (){	return nxt_port_cd         	;	}
	public String               getNxt_dir_cd          (){	return nxt_dir_cd          	;	}
	public String               getNxt_clpt_ind_seq    (){	return nxt_clpt_ind_seq    	;	}
	public String               getSkd_cre_ind_cd      (){	return skd_cre_ind_cd      	;	}
	public String               getSkd_rmk             (){	return skd_rmk             	;	}
	public String               getSkd_voy_tp_cd       (){	return skd_voy_tp_cd       	;	}
	public String               getSkd_ldb_qty         (){	return skd_ldb_qty         	;	}
	public String               getRev_port_cd         (){	return rev_port_cd         	;	}
	public String               getRev_dt              (){	return rev_dt              	;	}
	public String               getPort_chk_cd         (){	return port_chk_cd         	;	}
	public String               getJnt_opr_vvd_flg     (){	return jnt_opr_vvd_flg     	;	}
	public String               getJnt_opr_vvd_cd      (){	return jnt_opr_vvd_cd      	;	}
	public String               getSkd_crr_cd          (){	return skd_crr_cd          	;	}
	public String               getSpc_qty             (){	return spc_qty             	;	}
	public String               getSkd_cnl_cd          (){	return skd_cnl_cd          	;	}
	public String               getTtl_sail_dys        (){	return ttl_sail_dys        	;	}
	public String               getAct_sail_dys        (){	return act_sail_dys        	;	}
	public String               getN1st_port_brth_dt   (){	return n1st_port_brth_dt   	;	}
	public String               getFdr_skd_flg         (){	return fdr_skd_flg         	;	}
	public String               getSpc_ctrl_flg        (){	return spc_ctrl_flg        	;	}
	public String               getStnd_pln_port_cd    (){	return stnd_pln_port_cd    	;	}
	public String               getPln_yrmon           (){	return pln_yrmon           	;	}
	public String               getSt_port_cd          (){	return st_port_cd          	;	}
	public String               getSkd_off_band_cd     (){	return skd_off_band_cd     	;	}
	public String               getAr_cre_yrmon_dt     (){	return ar_cre_yrmon_dt     	;	}
	public String               getPerf_mng_yrmon      (){	return perf_mng_yrmon      	;	}
	public String               getTml_vvd_id          (){	return tml_vvd_id          	;	}
	public String               getSpc_aloc_qty        (){	return spc_aloc_qty        	;	}
	public String               getSpc_aloc_wgt        (){	return spc_aloc_wgt        	;	}
	public String               getSpcl_new_ctrl_rf_cd (){	return spcl_new_ctrl_rf_cd 	;	}
	public String               getSpcl_new_ctrl_wgt_cd(){	return spcl_new_ctrl_wgt_cd	;	}
	public String               getCntr_blk_div_cd     (){	return cntr_blk_div_cd     	;	}
	public String               getPsdo_vvd_cd         (){	return psdo_vvd_cd         	;	}
	public String               getCo_cd               (){	return co_cd               	;	}
	public String               getCre_pson_id         (){	return cre_pson_id         	;	}
	public String               getSkd_usd_ind_cd      (){	return skd_usd_ind_cd      	;	}
	public String               getNis_evnt_dt         (){	return nis_evnt_dt         	;	}
	public String               getSkd_rlse_rmk        (){	return skd_rlse_rmk        	;	}
	public String               getLong_rng_skd_irr_flg(){	return long_rng_skd_irr_flg	;	}
	public String               getPf_skd_tp_cd        (){	return pf_skd_tp_cd        	;	}
	public String               getLong_rng_skd_stl_flg(){	return long_rng_skd_stl_flg	;	}
	public String               getEai_evnt_dt         (){	return eai_evnt_dt         	;	}

	// setter method is proceeding ..
	public void setIbflag              ( String               ibflag               ){	this.ibflag               = ibflag              	;	}
	public void setPage_rows           ( String               page_rows            ){	this.page_rows            = page_rows           	;	}
	public void setVsl_cd              ( String               vsl_cd               ){	this.vsl_cd               = vsl_cd              	;	}
	public void setSkd_voy_no          ( String               skd_voy_no           ){	this.skd_voy_no           = skd_voy_no          	;	}
	public void setSkd_dir_cd          ( String               skd_dir_cd           ){	this.skd_dir_cd           = skd_dir_cd          	;	}
	public void setSlan_cd             ( String               slan_cd              ){	this.slan_cd              = slan_cd             	;	}
	public void setSkd_sts_cd          ( String               skd_sts_cd           ){	this.skd_sts_cd           = skd_sts_cd          	;	}
	public void setSkd_cre_dt          ( String               skd_cre_dt           ){	this.skd_cre_dt           = skd_cre_dt          	;	}
	public void setSkd_upd_ind_flg     ( String               skd_upd_ind_flg      ){	this.skd_upd_ind_flg      = skd_upd_ind_flg     	;	}
	public void setSkd_upd_pson_id     ( String               skd_upd_pson_id      ){	this.skd_upd_pson_id      = skd_upd_pson_id     	;	}
	public void setSkd_upd_dt          ( String               skd_upd_dt           ){	this.skd_upd_dt           = skd_upd_dt          	;	}
	public void setNxt_port_cd         ( String               nxt_port_cd          ){	this.nxt_port_cd          = nxt_port_cd         	;	}
	public void setNxt_dir_cd          ( String               nxt_dir_cd           ){	this.nxt_dir_cd           = nxt_dir_cd          	;	}
	public void setNxt_clpt_ind_seq    ( String               nxt_clpt_ind_seq     ){	this.nxt_clpt_ind_seq     = nxt_clpt_ind_seq    	;	}
	public void setSkd_cre_ind_cd      ( String               skd_cre_ind_cd       ){	this.skd_cre_ind_cd       = skd_cre_ind_cd      	;	}
	public void setSkd_rmk             ( String               skd_rmk              ){	this.skd_rmk              = skd_rmk             	;	}
	public void setSkd_voy_tp_cd       ( String               skd_voy_tp_cd        ){	this.skd_voy_tp_cd        = skd_voy_tp_cd       	;	}
	public void setSkd_ldb_qty         ( String               skd_ldb_qty          ){	this.skd_ldb_qty          = skd_ldb_qty         	;	}
	public void setRev_port_cd         ( String               rev_port_cd          ){	this.rev_port_cd          = rev_port_cd         	;	}
	public void setRev_dt              ( String               rev_dt               ){	this.rev_dt               = rev_dt              	;	}
	public void setPort_chk_cd         ( String               port_chk_cd          ){	this.port_chk_cd          = port_chk_cd         	;	}
	public void setJnt_opr_vvd_flg     ( String               jnt_opr_vvd_flg      ){	this.jnt_opr_vvd_flg      = jnt_opr_vvd_flg     	;	}
	public void setJnt_opr_vvd_cd      ( String               jnt_opr_vvd_cd       ){	this.jnt_opr_vvd_cd       = jnt_opr_vvd_cd      	;	}
	public void setSkd_crr_cd          ( String               skd_crr_cd           ){	this.skd_crr_cd           = skd_crr_cd          	;	}
	public void setSpc_qty             ( String               spc_qty              ){	this.spc_qty              = spc_qty             	;	}
	public void setSkd_cnl_cd          ( String               skd_cnl_cd           ){	this.skd_cnl_cd           = skd_cnl_cd          	;	}
	public void setTtl_sail_dys        ( String               ttl_sail_dys         ){	this.ttl_sail_dys         = ttl_sail_dys        	;	}
	public void setAct_sail_dys        ( String               act_sail_dys         ){	this.act_sail_dys         = act_sail_dys        	;	}
	public void setN1st_port_brth_dt   ( String               n1st_port_brth_dt    ){	this.n1st_port_brth_dt    = n1st_port_brth_dt   	;	}
	public void setFdr_skd_flg         ( String               fdr_skd_flg          ){	this.fdr_skd_flg          = fdr_skd_flg         	;	}
	public void setSpc_ctrl_flg        ( String               spc_ctrl_flg         ){	this.spc_ctrl_flg         = spc_ctrl_flg        	;	}
	public void setStnd_pln_port_cd    ( String               stnd_pln_port_cd     ){	this.stnd_pln_port_cd     = stnd_pln_port_cd    	;	}
	public void setPln_yrmon           ( String               pln_yrmon            ){	this.pln_yrmon            = pln_yrmon           	;	}
	public void setSt_port_cd          ( String               st_port_cd           ){	this.st_port_cd           = st_port_cd          	;	}
	public void setSkd_off_band_cd     ( String               skd_off_band_cd      ){	this.skd_off_band_cd      = skd_off_band_cd     	;	}
	public void setAr_cre_yrmon_dt     ( String               ar_cre_yrmon_dt      ){	this.ar_cre_yrmon_dt      = ar_cre_yrmon_dt     	;	}
	public void setPerf_mng_yrmon      ( String               perf_mng_yrmon       ){	this.perf_mng_yrmon       = perf_mng_yrmon      	;	}
	public void setTml_vvd_id          ( String               tml_vvd_id           ){	this.tml_vvd_id           = tml_vvd_id          	;	}
	public void setSpc_aloc_qty        ( String               spc_aloc_qty         ){	this.spc_aloc_qty         = spc_aloc_qty        	;	}
	public void setSpc_aloc_wgt        ( String               spc_aloc_wgt         ){	this.spc_aloc_wgt         = spc_aloc_wgt        	;	}
	public void setSpcl_new_ctrl_rf_cd ( String               spcl_new_ctrl_rf_cd  ){	this.spcl_new_ctrl_rf_cd  = spcl_new_ctrl_rf_cd 	;	}
	public void setSpcl_new_ctrl_wgt_cd( String               spcl_new_ctrl_wgt_cd ){	this.spcl_new_ctrl_wgt_cd = spcl_new_ctrl_wgt_cd	;	}
	public void setCntr_blk_div_cd     ( String               cntr_blk_div_cd      ){	this.cntr_blk_div_cd      = cntr_blk_div_cd     	;	}
	public void setPsdo_vvd_cd         ( String               psdo_vvd_cd          ){	this.psdo_vvd_cd          = psdo_vvd_cd         	;	}
	public void setCo_cd               ( String               co_cd                ){	this.co_cd                = co_cd               	;	}
	public void setCre_pson_id         ( String               cre_pson_id          ){	this.cre_pson_id          = cre_pson_id         	;	}
	public void setSkd_usd_ind_cd      ( String               skd_usd_ind_cd       ){	this.skd_usd_ind_cd       = skd_usd_ind_cd      	;	}
	public void setNis_evnt_dt         ( String               nis_evnt_dt          ){	this.nis_evnt_dt          = nis_evnt_dt         	;	}
	public void setSkd_rlse_rmk        ( String               skd_rlse_rmk         ){	this.skd_rlse_rmk         = skd_rlse_rmk        	;	}
	public void setLong_rng_skd_irr_flg( String               long_rng_skd_irr_flg ){	this.long_rng_skd_irr_flg = long_rng_skd_irr_flg	;	}
	public void setPf_skd_tp_cd        ( String               pf_skd_tp_cd         ){	this.pf_skd_tp_cd         = pf_skd_tp_cd        	;	}
	public void setLong_rng_skd_stl_flg( String               long_rng_skd_stl_flg ){	this.long_rng_skd_stl_flg = long_rng_skd_stl_flg	;	}
	public void setEai_evnt_dt         ( String               eai_evnt_dt          ){	this.eai_evnt_dt          = eai_evnt_dt         	;	}

	public static VSK_VSL_SKD fromRequest(HttpServletRequest request) {
		VSK_VSL_SKD model = new VSK_VSL_SKD();
		try {
			model.setIbflag              	(JSPUtil.getParameter(request, "ibflag              		".trim(), ""));
			model.setPage_rows           	(JSPUtil.getParameter(request, "page_rows           		".trim(), ""));
			model.setVsl_cd              	(JSPUtil.getParameter(request, "vsl_cd              		".trim(), ""));
			model.setSkd_voy_no          	(JSPUtil.getParameter(request, "skd_voy_no          		".trim(), ""));
			model.setSkd_dir_cd          	(JSPUtil.getParameter(request, "skd_dir_cd          		".trim(), ""));
			model.setSlan_cd             	(JSPUtil.getParameter(request, "slan_cd             		".trim(), ""));
			model.setSkd_sts_cd          	(JSPUtil.getParameter(request, "skd_sts_cd          		".trim(), ""));
			model.setSkd_cre_dt          	(JSPUtil.getParameter(request, "skd_cre_dt          		".trim(), ""));
			model.setSkd_upd_ind_flg     	(JSPUtil.getParameter(request, "skd_upd_ind_flg     		".trim(), ""));
			model.setSkd_upd_pson_id     	(JSPUtil.getParameter(request, "skd_upd_pson_id     		".trim(), ""));
			model.setSkd_upd_dt          	(JSPUtil.getParameter(request, "skd_upd_dt          		".trim(), ""));
			model.setNxt_port_cd         	(JSPUtil.getParameter(request, "nxt_port_cd         		".trim(), ""));
			model.setNxt_dir_cd          	(JSPUtil.getParameter(request, "nxt_dir_cd          		".trim(), ""));
			model.setNxt_clpt_ind_seq    	(JSPUtil.getParameter(request, "nxt_clpt_ind_seq    		".trim(), ""));
			model.setSkd_cre_ind_cd      	(JSPUtil.getParameter(request, "skd_cre_ind_cd      		".trim(), ""));
			model.setSkd_rmk             	(JSPUtil.getParameter(request, "skd_rmk             		".trim(), ""));
			model.setSkd_voy_tp_cd       	(JSPUtil.getParameter(request, "skd_voy_tp_cd       		".trim(), ""));
			model.setSkd_ldb_qty         	(JSPUtil.getParameter(request, "skd_ldb_qty         		".trim(), ""));
			model.setRev_port_cd         	(JSPUtil.getParameter(request, "rev_port_cd         		".trim(), ""));
			model.setRev_dt              	(JSPUtil.getParameter(request, "rev_dt              		".trim(), ""));
			model.setPort_chk_cd         	(JSPUtil.getParameter(request, "port_chk_cd         		".trim(), ""));
			model.setJnt_opr_vvd_flg     	(JSPUtil.getParameter(request, "jnt_opr_vvd_flg     		".trim(), ""));
			model.setJnt_opr_vvd_cd      	(JSPUtil.getParameter(request, "jnt_opr_vvd_cd      		".trim(), ""));
			model.setSkd_crr_cd          	(JSPUtil.getParameter(request, "skd_crr_cd          		".trim(), ""));
			model.setSpc_qty             	(JSPUtil.getParameter(request, "spc_qty             		".trim(), ""));
			model.setSkd_cnl_cd          	(JSPUtil.getParameter(request, "skd_cnl_cd          		".trim(), ""));
			model.setTtl_sail_dys        	(JSPUtil.getParameter(request, "ttl_sail_dys        		".trim(), ""));
			model.setAct_sail_dys        	(JSPUtil.getParameter(request, "act_sail_dys        		".trim(), ""));
			model.setN1st_port_brth_dt   	(JSPUtil.getParameter(request, "n1st_port_brth_dt   		".trim(), ""));
			model.setFdr_skd_flg         	(JSPUtil.getParameter(request, "fdr_skd_flg         		".trim(), ""));
			model.setSpc_ctrl_flg        	(JSPUtil.getParameter(request, "spc_ctrl_flg        		".trim(), ""));
			model.setStnd_pln_port_cd    	(JSPUtil.getParameter(request, "stnd_pln_port_cd    		".trim(), ""));
			model.setPln_yrmon           	(JSPUtil.getParameter(request, "pln_yrmon           		".trim(), ""));
			model.setSt_port_cd          	(JSPUtil.getParameter(request, "st_port_cd          		".trim(), ""));
			model.setSkd_off_band_cd     	(JSPUtil.getParameter(request, "skd_off_band_cd     		".trim(), ""));
			model.setAr_cre_yrmon_dt     	(JSPUtil.getParameter(request, "ar_cre_yrmon_dt     		".trim(), ""));
			model.setPerf_mng_yrmon      	(JSPUtil.getParameter(request, "perf_mng_yrmon      		".trim(), ""));
			model.setTml_vvd_id          	(JSPUtil.getParameter(request, "tml_vvd_id          		".trim(), ""));
			model.setSpc_aloc_qty        	(JSPUtil.getParameter(request, "spc_aloc_qty        		".trim(), ""));
			model.setSpc_aloc_wgt        	(JSPUtil.getParameter(request, "spc_aloc_wgt        		".trim(), ""));
			model.setSpcl_new_ctrl_rf_cd 	(JSPUtil.getParameter(request, "spcl_new_ctrl_rf_cd 		".trim(), ""));
			model.setSpcl_new_ctrl_wgt_cd	(JSPUtil.getParameter(request, "spcl_new_ctrl_wgt_cd		".trim(), ""));
			model.setCntr_blk_div_cd     	(JSPUtil.getParameter(request, "cntr_blk_div_cd     		".trim(), ""));
			model.setPsdo_vvd_cd         	(JSPUtil.getParameter(request, "psdo_vvd_cd         		".trim(), ""));
			model.setCo_cd               	(JSPUtil.getParameter(request, "co_cd               		".trim(), ""));
			model.setCre_pson_id         	(JSPUtil.getParameter(request, "cre_pson_id         		".trim(), ""));
			model.setSkd_usd_ind_cd      	(JSPUtil.getParameter(request, "skd_usd_ind_cd      		".trim(), ""));
			model.setNis_evnt_dt         	(JSPUtil.getParameter(request, "nis_evnt_dt         		".trim(), ""));
			model.setSkd_rlse_rmk        	(JSPUtil.getParameter(request, "skd_rlse_rmk        		".trim(), ""));
			model.setLong_rng_skd_irr_flg	(JSPUtil.getParameter(request, "long_rng_skd_irr_flg		".trim(), ""));
			model.setPf_skd_tp_cd        	(JSPUtil.getParameter(request, "pf_skd_tp_cd        		".trim(), ""));
			model.setLong_rng_skd_stl_flg	(JSPUtil.getParameter(request, "long_rng_skd_stl_flg		".trim(), ""));
			model.setEai_evnt_dt         	(JSPUtil.getParameter(request, "eai_evnt_dt         		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		VSK_VSL_SKD model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag               =  (JSPUtil.getParameter(request, "ibflag              		".trim(), length));
			String[] page_rows            =  (JSPUtil.getParameter(request, "page_rows           		".trim(), length));
			String[] vsl_cd               =  (JSPUtil.getParameter(request, "vsl_cd              		".trim(), length));
			String[] skd_voy_no           =  (JSPUtil.getParameter(request, "skd_voy_no          		".trim(), length));
			String[] skd_dir_cd           =  (JSPUtil.getParameter(request, "skd_dir_cd          		".trim(), length));
			String[] slan_cd              =  (JSPUtil.getParameter(request, "slan_cd             		".trim(), length));
			String[] skd_sts_cd           =  (JSPUtil.getParameter(request, "skd_sts_cd          		".trim(), length));
			String[] skd_cre_dt           =  (JSPUtil.getParameter(request, "skd_cre_dt          		".trim(), length));
			String[] skd_upd_ind_flg      =  (JSPUtil.getParameter(request, "skd_upd_ind_flg     		".trim(), length));
			String[] skd_upd_pson_id      =  (JSPUtil.getParameter(request, "skd_upd_pson_id     		".trim(), length));
			String[] skd_upd_dt           =  (JSPUtil.getParameter(request, "skd_upd_dt          		".trim(), length));
			String[] nxt_port_cd          =  (JSPUtil.getParameter(request, "nxt_port_cd         		".trim(), length));
			String[] nxt_dir_cd           =  (JSPUtil.getParameter(request, "nxt_dir_cd          		".trim(), length));
			String[] nxt_clpt_ind_seq     =  (JSPUtil.getParameter(request, "nxt_clpt_ind_seq    		".trim(), length));
			String[] skd_cre_ind_cd       =  (JSPUtil.getParameter(request, "skd_cre_ind_cd      		".trim(), length));
			String[] skd_rmk              =  (JSPUtil.getParameter(request, "skd_rmk             		".trim(), length));
			String[] skd_voy_tp_cd        =  (JSPUtil.getParameter(request, "skd_voy_tp_cd       		".trim(), length));
			String[] skd_ldb_qty          =  (JSPUtil.getParameter(request, "skd_ldb_qty         		".trim(), length));
			String[] rev_port_cd          =  (JSPUtil.getParameter(request, "rev_port_cd         		".trim(), length));
			String[] rev_dt               =  (JSPUtil.getParameter(request, "rev_dt              		".trim(), length));
			String[] port_chk_cd          =  (JSPUtil.getParameter(request, "port_chk_cd         		".trim(), length));
			String[] jnt_opr_vvd_flg      =  (JSPUtil.getParameter(request, "jnt_opr_vvd_flg     		".trim(), length));
			String[] jnt_opr_vvd_cd       =  (JSPUtil.getParameter(request, "jnt_opr_vvd_cd      		".trim(), length));
			String[] skd_crr_cd           =  (JSPUtil.getParameter(request, "skd_crr_cd          		".trim(), length));
			String[] spc_qty              =  (JSPUtil.getParameter(request, "spc_qty             		".trim(), length));
			String[] skd_cnl_cd           =  (JSPUtil.getParameter(request, "skd_cnl_cd          		".trim(), length));
			String[] ttl_sail_dys         =  (JSPUtil.getParameter(request, "ttl_sail_dys        		".trim(), length));
			String[] act_sail_dys         =  (JSPUtil.getParameter(request, "act_sail_dys        		".trim(), length));
			String[] n1st_port_brth_dt    =  (JSPUtil.getParameter(request, "n1st_port_brth_dt   		".trim(), length));
			String[] fdr_skd_flg          =  (JSPUtil.getParameter(request, "fdr_skd_flg         		".trim(), length));
			String[] spc_ctrl_flg         =  (JSPUtil.getParameter(request, "spc_ctrl_flg        		".trim(), length));
			String[] stnd_pln_port_cd     =  (JSPUtil.getParameter(request, "stnd_pln_port_cd    		".trim(), length));
			String[] pln_yrmon            =  (JSPUtil.getParameter(request, "pln_yrmon           		".trim(), length));
			String[] st_port_cd           =  (JSPUtil.getParameter(request, "st_port_cd          		".trim(), length));
			String[] skd_off_band_cd      =  (JSPUtil.getParameter(request, "skd_off_band_cd     		".trim(), length));
			String[] ar_cre_yrmon_dt      =  (JSPUtil.getParameter(request, "ar_cre_yrmon_dt     		".trim(), length));
			String[] perf_mng_yrmon       =  (JSPUtil.getParameter(request, "perf_mng_yrmon      		".trim(), length));
			String[] tml_vvd_id           =  (JSPUtil.getParameter(request, "tml_vvd_id          		".trim(), length));
			String[] spc_aloc_qty         =  (JSPUtil.getParameter(request, "spc_aloc_qty        		".trim(), length));
			String[] spc_aloc_wgt         =  (JSPUtil.getParameter(request, "spc_aloc_wgt        		".trim(), length));
			String[] spcl_new_ctrl_rf_cd  =  (JSPUtil.getParameter(request, "spcl_new_ctrl_rf_cd 		".trim(), length));
			String[] spcl_new_ctrl_wgt_cd =  (JSPUtil.getParameter(request, "spcl_new_ctrl_wgt_cd		".trim(), length));
			String[] cntr_blk_div_cd      =  (JSPUtil.getParameter(request, "cntr_blk_div_cd     		".trim(), length));
			String[] psdo_vvd_cd          =  (JSPUtil.getParameter(request, "psdo_vvd_cd         		".trim(), length));
			String[] co_cd                =  (JSPUtil.getParameter(request, "co_cd               		".trim(), length));
			String[] cre_pson_id          =  (JSPUtil.getParameter(request, "cre_pson_id         		".trim(), length));
			String[] skd_usd_ind_cd       =  (JSPUtil.getParameter(request, "skd_usd_ind_cd      		".trim(), length));
			String[] nis_evnt_dt          =  (JSPUtil.getParameter(request, "nis_evnt_dt         		".trim(), length));
			String[] skd_rlse_rmk         =  (JSPUtil.getParameter(request, "skd_rlse_rmk        		".trim(), length));
			String[] long_rng_skd_irr_flg =  (JSPUtil.getParameter(request, "long_rng_skd_irr_flg		".trim(), length));
			String[] pf_skd_tp_cd         =  (JSPUtil.getParameter(request, "pf_skd_tp_cd        		".trim(), length));
			String[] long_rng_skd_stl_flg =  (JSPUtil.getParameter(request, "long_rng_skd_stl_flg		".trim(), length));
			String[] eai_evnt_dt          =  (JSPUtil.getParameter(request, "eai_evnt_dt         		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new VSK_VSL_SKD();
				model.setIbflag              		  (ibflag              	[i]);
				model.setPage_rows           		  (page_rows           	[i]);
				model.setVsl_cd              		  (vsl_cd              	[i]);
				model.setSkd_voy_no          		  (skd_voy_no          	[i]);
				model.setSkd_dir_cd          		  (skd_dir_cd          	[i]);
				model.setSlan_cd             		  (slan_cd             	[i]);
				model.setSkd_sts_cd          		  (skd_sts_cd          	[i]);
				model.setSkd_cre_dt          		  (skd_cre_dt          	[i]);
				model.setSkd_upd_ind_flg     		  (skd_upd_ind_flg     	[i]);
				model.setSkd_upd_pson_id     		  (skd_upd_pson_id     	[i]);
				model.setSkd_upd_dt          		  (skd_upd_dt          	[i]);
				model.setNxt_port_cd         		  (nxt_port_cd         	[i]);
				model.setNxt_dir_cd          		  (nxt_dir_cd          	[i]);
				model.setNxt_clpt_ind_seq    		  (nxt_clpt_ind_seq    	[i]);
				model.setSkd_cre_ind_cd      		  (skd_cre_ind_cd      	[i]);
				model.setSkd_rmk             		  (skd_rmk             	[i]);
				model.setSkd_voy_tp_cd       		  (skd_voy_tp_cd       	[i]);
				model.setSkd_ldb_qty         		  (skd_ldb_qty         	[i]);
				model.setRev_port_cd         		  (rev_port_cd         	[i]);
				model.setRev_dt              		  (rev_dt              	[i]);
				model.setPort_chk_cd         		  (port_chk_cd         	[i]);
				model.setJnt_opr_vvd_flg     		  (jnt_opr_vvd_flg     	[i]);
				model.setJnt_opr_vvd_cd      		  (jnt_opr_vvd_cd      	[i]);
				model.setSkd_crr_cd          		  (skd_crr_cd          	[i]);
				model.setSpc_qty             		  (spc_qty             	[i]);
				model.setSkd_cnl_cd          		  (skd_cnl_cd          	[i]);
				model.setTtl_sail_dys        		  (ttl_sail_dys        	[i]);
				model.setAct_sail_dys        		  (act_sail_dys        	[i]);
				model.setN1st_port_brth_dt   		  (n1st_port_brth_dt   	[i]);
				model.setFdr_skd_flg         		  (fdr_skd_flg         	[i]);
				model.setSpc_ctrl_flg        		  (spc_ctrl_flg        	[i]);
				model.setStnd_pln_port_cd    		  (stnd_pln_port_cd    	[i]);
				model.setPln_yrmon           		  (pln_yrmon           	[i]);
				model.setSt_port_cd          		  (st_port_cd          	[i]);
				model.setSkd_off_band_cd     		  (skd_off_band_cd     	[i]);
				model.setAr_cre_yrmon_dt     		  (ar_cre_yrmon_dt     	[i]);
				model.setPerf_mng_yrmon      		  (perf_mng_yrmon      	[i]);
				model.setTml_vvd_id          		  (tml_vvd_id          	[i]);
				model.setSpc_aloc_qty        		  (spc_aloc_qty        	[i]);
				model.setSpc_aloc_wgt        		  (spc_aloc_wgt        	[i]);
				model.setSpcl_new_ctrl_rf_cd 		  (spcl_new_ctrl_rf_cd 	[i]);
				model.setSpcl_new_ctrl_wgt_cd		  (spcl_new_ctrl_wgt_cd	[i]);
				model.setCntr_blk_div_cd     		  (cntr_blk_div_cd     	[i]);
				model.setPsdo_vvd_cd         		  (psdo_vvd_cd         	[i]);
				model.setCo_cd               		  (co_cd               	[i]);
				model.setCre_pson_id         		  (cre_pson_id         	[i]);
				model.setSkd_usd_ind_cd      		  (skd_usd_ind_cd      	[i]);
				model.setNis_evnt_dt         		  (nis_evnt_dt         	[i]);
				model.setSkd_rlse_rmk        		  (skd_rlse_rmk        	[i]);
				model.setLong_rng_skd_irr_flg		  (long_rng_skd_irr_flg	[i]);
				model.setPf_skd_tp_cd        		  (pf_skd_tp_cd        	[i]);
				model.setLong_rng_skd_stl_flg		  (long_rng_skd_stl_flg	[i]);
				model.setEai_evnt_dt         		  (eai_evnt_dt         	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		VSK_VSL_SKD model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag               =  (JSPUtil.getParameter(request, prefix + "ibflag              		".trim(), length));
			String[] page_rows            =  (JSPUtil.getParameter(request, prefix + "page_rows           		".trim(), length));
			String[] vsl_cd               =  (JSPUtil.getParameter(request, prefix + "vsl_cd              		".trim(), length));
			String[] skd_voy_no           =  (JSPUtil.getParameter(request, prefix + "skd_voy_no          		".trim(), length));
			String[] skd_dir_cd           =  (JSPUtil.getParameter(request, prefix + "skd_dir_cd          		".trim(), length));
			String[] slan_cd              =  (JSPUtil.getParameter(request, prefix + "slan_cd             		".trim(), length));
			String[] skd_sts_cd           =  (JSPUtil.getParameter(request, prefix + "skd_sts_cd          		".trim(), length));
			String[] skd_cre_dt           =  (JSPUtil.getParameter(request, prefix + "skd_cre_dt          		".trim(), length));
			String[] skd_upd_ind_flg      =  (JSPUtil.getParameter(request, prefix + "skd_upd_ind_flg     		".trim(), length));
			String[] skd_upd_pson_id      =  (JSPUtil.getParameter(request, prefix + "skd_upd_pson_id     		".trim(), length));
			String[] skd_upd_dt           =  (JSPUtil.getParameter(request, prefix + "skd_upd_dt          		".trim(), length));
			String[] nxt_port_cd          =  (JSPUtil.getParameter(request, prefix + "nxt_port_cd         		".trim(), length));
			String[] nxt_dir_cd           =  (JSPUtil.getParameter(request, prefix + "nxt_dir_cd          		".trim(), length));
			String[] nxt_clpt_ind_seq     =  (JSPUtil.getParameter(request, prefix + "nxt_clpt_ind_seq    		".trim(), length));
			String[] skd_cre_ind_cd       =  (JSPUtil.getParameter(request, prefix + "skd_cre_ind_cd      		".trim(), length));
			String[] skd_rmk              =  (JSPUtil.getParameter(request, prefix + "skd_rmk             		".trim(), length));
			String[] skd_voy_tp_cd        =  (JSPUtil.getParameter(request, prefix + "skd_voy_tp_cd       		".trim(), length));
			String[] skd_ldb_qty          =  (JSPUtil.getParameter(request, prefix + "skd_ldb_qty         		".trim(), length));
			String[] rev_port_cd          =  (JSPUtil.getParameter(request, prefix + "rev_port_cd         		".trim(), length));
			String[] rev_dt               =  (JSPUtil.getParameter(request, prefix + "rev_dt              		".trim(), length));
			String[] port_chk_cd          =  (JSPUtil.getParameter(request, prefix + "port_chk_cd         		".trim(), length));
			String[] jnt_opr_vvd_flg      =  (JSPUtil.getParameter(request, prefix + "jnt_opr_vvd_flg     		".trim(), length));
			String[] jnt_opr_vvd_cd       =  (JSPUtil.getParameter(request, prefix + "jnt_opr_vvd_cd      		".trim(), length));
			String[] skd_crr_cd           =  (JSPUtil.getParameter(request, prefix + "skd_crr_cd          		".trim(), length));
			String[] spc_qty              =  (JSPUtil.getParameter(request, prefix + "spc_qty             		".trim(), length));
			String[] skd_cnl_cd           =  (JSPUtil.getParameter(request, prefix + "skd_cnl_cd          		".trim(), length));
			String[] ttl_sail_dys         =  (JSPUtil.getParameter(request, prefix + "ttl_sail_dys        		".trim(), length));
			String[] act_sail_dys         =  (JSPUtil.getParameter(request, prefix + "act_sail_dys        		".trim(), length));
			String[] n1st_port_brth_dt    =  (JSPUtil.getParameter(request, prefix + "n1st_port_brth_dt   		".trim(), length));
			String[] fdr_skd_flg          =  (JSPUtil.getParameter(request, prefix + "fdr_skd_flg         		".trim(), length));
			String[] spc_ctrl_flg         =  (JSPUtil.getParameter(request, prefix + "spc_ctrl_flg        		".trim(), length));
			String[] stnd_pln_port_cd     =  (JSPUtil.getParameter(request, prefix + "stnd_pln_port_cd    		".trim(), length));
			String[] pln_yrmon            =  (JSPUtil.getParameter(request, prefix + "pln_yrmon           		".trim(), length));
			String[] st_port_cd           =  (JSPUtil.getParameter(request, prefix + "st_port_cd          		".trim(), length));
			String[] skd_off_band_cd      =  (JSPUtil.getParameter(request, prefix + "skd_off_band_cd     		".trim(), length));
			String[] ar_cre_yrmon_dt      =  (JSPUtil.getParameter(request, prefix + "ar_cre_yrmon_dt     		".trim(), length));
			String[] perf_mng_yrmon       =  (JSPUtil.getParameter(request, prefix + "perf_mng_yrmon      		".trim(), length));
			String[] tml_vvd_id           =  (JSPUtil.getParameter(request, prefix + "tml_vvd_id          		".trim(), length));
			String[] spc_aloc_qty         =  (JSPUtil.getParameter(request, prefix + "spc_aloc_qty        		".trim(), length));
			String[] spc_aloc_wgt         =  (JSPUtil.getParameter(request, prefix + "spc_aloc_wgt        		".trim(), length));
			String[] spcl_new_ctrl_rf_cd  =  (JSPUtil.getParameter(request, prefix + "spcl_new_ctrl_rf_cd 		".trim(), length));
			String[] spcl_new_ctrl_wgt_cd =  (JSPUtil.getParameter(request, prefix + "spcl_new_ctrl_wgt_cd		".trim(), length));
			String[] cntr_blk_div_cd      =  (JSPUtil.getParameter(request, prefix + "cntr_blk_div_cd     		".trim(), length));
			String[] psdo_vvd_cd          =  (JSPUtil.getParameter(request, prefix + "psdo_vvd_cd         		".trim(), length));
			String[] co_cd                =  (JSPUtil.getParameter(request, prefix + "co_cd               		".trim(), length));
			String[] cre_pson_id          =  (JSPUtil.getParameter(request, prefix + "cre_pson_id         		".trim(), length));
			String[] skd_usd_ind_cd       =  (JSPUtil.getParameter(request, prefix + "skd_usd_ind_cd      		".trim(), length));
			String[] nis_evnt_dt          =  (JSPUtil.getParameter(request, prefix + "nis_evnt_dt         		".trim(), length));
			String[] skd_rlse_rmk         =  (JSPUtil.getParameter(request, prefix + "skd_rlse_rmk        		".trim(), length));
			String[] long_rng_skd_irr_flg =  (JSPUtil.getParameter(request, prefix + "long_rng_skd_irr_flg		".trim(), length));
			String[] pf_skd_tp_cd         =  (JSPUtil.getParameter(request, prefix + "pf_skd_tp_cd        		".trim(), length));
			String[] long_rng_skd_stl_flg =  (JSPUtil.getParameter(request, prefix + "long_rng_skd_stl_flg		".trim(), length));
			String[] eai_evnt_dt          =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt         		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new VSK_VSL_SKD();
				model.setIbflag              		  ( ibflag              	[i]);
				model.setPage_rows           		  ( page_rows           	[i]);
				model.setVsl_cd              		  ( vsl_cd              	[i]);
				model.setSkd_voy_no          		  ( skd_voy_no          	[i]);
				model.setSkd_dir_cd          		  ( skd_dir_cd          	[i]);
				model.setSlan_cd             		  ( slan_cd             	[i]);
				model.setSkd_sts_cd          		  ( skd_sts_cd          	[i]);
				model.setSkd_cre_dt          		  ( skd_cre_dt          	[i]);
				model.setSkd_upd_ind_flg     		  ( skd_upd_ind_flg     	[i]);
				model.setSkd_upd_pson_id     		  ( skd_upd_pson_id     	[i]);
				model.setSkd_upd_dt          		  ( skd_upd_dt          	[i]);
				model.setNxt_port_cd         		  ( nxt_port_cd         	[i]);
				model.setNxt_dir_cd          		  ( nxt_dir_cd          	[i]);
				model.setNxt_clpt_ind_seq    		  ( nxt_clpt_ind_seq    	[i]);
				model.setSkd_cre_ind_cd      		  ( skd_cre_ind_cd      	[i]);
				model.setSkd_rmk             		  ( skd_rmk             	[i]);
				model.setSkd_voy_tp_cd       		  ( skd_voy_tp_cd       	[i]);
				model.setSkd_ldb_qty         		  ( skd_ldb_qty         	[i]);
				model.setRev_port_cd         		  ( rev_port_cd         	[i]);
				model.setRev_dt              		  ( rev_dt              	[i]);
				model.setPort_chk_cd         		  ( port_chk_cd         	[i]);
				model.setJnt_opr_vvd_flg     		  ( jnt_opr_vvd_flg     	[i]);
				model.setJnt_opr_vvd_cd      		  ( jnt_opr_vvd_cd      	[i]);
				model.setSkd_crr_cd          		  ( skd_crr_cd          	[i]);
				model.setSpc_qty             		  ( spc_qty             	[i]);
				model.setSkd_cnl_cd          		  ( skd_cnl_cd          	[i]);
				model.setTtl_sail_dys        		  ( ttl_sail_dys        	[i]);
				model.setAct_sail_dys        		  ( act_sail_dys        	[i]);
				model.setN1st_port_brth_dt   		  ( n1st_port_brth_dt   	[i]);
				model.setFdr_skd_flg         		  ( fdr_skd_flg         	[i]);
				model.setSpc_ctrl_flg        		  ( spc_ctrl_flg        	[i]);
				model.setStnd_pln_port_cd    		  ( stnd_pln_port_cd    	[i]);
				model.setPln_yrmon           		  ( pln_yrmon           	[i]);
				model.setSt_port_cd          		  ( st_port_cd          	[i]);
				model.setSkd_off_band_cd     		  ( skd_off_band_cd     	[i]);
				model.setAr_cre_yrmon_dt     		  ( ar_cre_yrmon_dt     	[i]);
				model.setPerf_mng_yrmon      		  ( perf_mng_yrmon      	[i]);
				model.setTml_vvd_id          		  ( tml_vvd_id          	[i]);
				model.setSpc_aloc_qty        		  ( spc_aloc_qty        	[i]);
				model.setSpc_aloc_wgt        		  ( spc_aloc_wgt        	[i]);
				model.setSpcl_new_ctrl_rf_cd 		  ( spcl_new_ctrl_rf_cd 	[i]);
				model.setSpcl_new_ctrl_wgt_cd		  ( spcl_new_ctrl_wgt_cd	[i]);
				model.setCntr_blk_div_cd     		  ( cntr_blk_div_cd     	[i]);
				model.setPsdo_vvd_cd         		  ( psdo_vvd_cd         	[i]);
				model.setCo_cd               		  ( co_cd               	[i]);
				model.setCre_pson_id         		  ( cre_pson_id         	[i]);
				model.setSkd_usd_ind_cd      		  ( skd_usd_ind_cd      	[i]);
				model.setNis_evnt_dt         		  ( nis_evnt_dt         	[i]);
				model.setSkd_rlse_rmk        		  ( skd_rlse_rmk        	[i]);
				model.setLong_rng_skd_irr_flg		  ( long_rng_skd_irr_flg	[i]);
				model.setPf_skd_tp_cd        		  ( pf_skd_tp_cd        	[i]);
				model.setLong_rng_skd_stl_flg		  ( long_rng_skd_stl_flg	[i]);
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
