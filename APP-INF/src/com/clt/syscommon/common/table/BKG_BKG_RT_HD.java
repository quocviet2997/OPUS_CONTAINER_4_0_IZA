/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : BKG_BKG_RT_HD.java
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
public final class BKG_BKG_RT_HD implements java.io.Serializable {

	private String           ibflag           = "";
	private String           page_rows        = "";
	private String           bkg_no           = "";
	private String           bkg_no_split     = "";
	private String           bkg_agmt_tp_cd   = "";
	private String           sc_rfa_agmt_no   = "";
	private String           lcl_tp_cd        = "";
	private String           cbm_amt          = "";
	private String           cbm_curr_cd      = "";
	private String           mty_rt_amt       = "";
	private String           mty_curr_cd      = "";
	private String           ppd_ofc_cd       = "";
	private String           clt_ofc_cd       = "";
	private String           chg_hdr_cre_dt   = "";
	private String           cre_usr_id       = "";
	private String           hdr_upd_dt       = "";
	private String           upd_usr_id       = "";
	private String           bkg_rt_hd_usr_id = "";
	private String           bkg_rev_div_cd   = "";
	private String           cobiz_no         = "";
	private String           org_via_cd       = "";
	private String           dest_via_cd      = "";
	private String           rt_cfm_flg       = "";
	private String           rt_cfm_usr_id    = "";
	private String           rt_cfm_dt        = "";
	private String           sc_no            = "";
	private String           gen_trf_no       = "";
	private String           ppayr_cnt_cd     = "";
	private String           ppayr_seq        = "";
	private String           act_ppayr_cnt_cd = "";
	private String           act_ppayr_seq    = "";
	private String           bfr_ofc_cd       = "";
	private String           clt_payr_cnt_cd  = "";
	private String           clt_payr_seq     = "";
	private String           act_payr_cnt_cd  = "";
	private String           act_payr_seq     = "";
	private String           bfr_clt_ofc_cd   = "";
	private String           cust_cr_flg      = "";
	private String           bl_cr_dys        = "";
	private String           rfa_no           = "";
	private String           cgo_rcv_dt       = "";
	private String           nis_evnt_dt      = "";
	private String           wfg_expt_flg     = "";
	private String           wfg_shpr_rgst_no = "";
	private String           clt_expt_cd     = "";
	private String           auto_rat_flg     = "";
	private String           cfm_flg          = "";
	private String           cfm_usr_id       = "";
	private String           cfm_dt           = "";
	private String           sc_rt_tp_cd      = "";
	private String           cmdt_cd          = "";
	private String           bkg_rat_max_cre_dt = "";
	// 2008 04 10 hyunsu 
	private String 			ctrt_cust_cnt_cd 	= "";
	private String 			ctrt_cust_seq  		= "";
	
	private String           eai_evnt_dt      = "";

	public BKG_BKG_RT_HD(){}

	public BKG_BKG_RT_HD(
			String           ibflag          ,
			String           page_rows       ,
			String           bkg_no          ,
			String           bkg_no_split    ,
			String           bkg_agmt_tp_cd  ,
			String           sc_rfa_agmt_no  ,
			String           lcl_tp_cd       ,
			String           cbm_amt         ,
			String           cbm_curr_cd     ,
			String           mty_rt_amt      ,
			String           mty_curr_cd     ,
			String           ppd_ofc_cd      ,
			String           clt_ofc_cd      ,
			String           chg_hdr_cre_dt  ,
			String           cre_usr_id      ,
			String           hdr_upd_dt      ,
			String           upd_usr_id      ,
			String           bkg_rt_hd_usr_id,
			String           bkg_rev_div_cd  ,
			String           cobiz_no        ,
			String           org_via_cd      ,
			String           dest_via_cd     ,
			String           rt_cfm_flg      ,
			String           rt_cfm_usr_id   ,
			String           rt_cfm_dt       ,
			String           sc_no           ,
			String           gen_trf_no      ,
			String           ppayr_cnt_cd    ,
			String           ppayr_seq       ,
			String           act_ppayr_cnt_cd,
			String           act_ppayr_seq   ,
			String           bfr_ofc_cd      ,
			String           clt_payr_cnt_cd ,
			String           clt_payr_seq    ,
			String           act_payr_cnt_cd ,
			String           act_payr_seq    ,
			String           bfr_clt_ofc_cd  ,
			String           cust_cr_flg     ,
			String           bl_cr_dys       ,
			String           rfa_no          ,
			String           cgo_rcv_dt      ,
			String           nis_evnt_dt     ,
			String           wfg_expt_flg    ,
			String           wfg_shpr_rgst_no,
			String           clt_expt_cd    ,
			String           auto_rat_flg    ,
			String           cfm_flg         ,
			String           cfm_usr_id      ,
			String           cfm_dt          ,
			String           sc_rt_tp_cd     ,
			String           cmdt_cd         ,
			String			 bkg_rat_max_cre_dt,
			String			ctrt_cust_cnt_cd,
			String 			ctrt_cust_seq,
			String           eai_evnt_dt     ){
		this.ibflag           = ibflag          ;
		this.page_rows        = page_rows       ;
		this.bkg_no           = bkg_no          ;
		this.bkg_no_split     = bkg_no_split    ;
		this.bkg_agmt_tp_cd   = bkg_agmt_tp_cd  ;
		this.sc_rfa_agmt_no   = sc_rfa_agmt_no  ;
		this.lcl_tp_cd        = lcl_tp_cd       ;
		this.cbm_amt          = cbm_amt         ;
		this.cbm_curr_cd      = cbm_curr_cd     ;
		this.mty_rt_amt       = mty_rt_amt      ;
		this.mty_curr_cd      = mty_curr_cd     ;
		this.ppd_ofc_cd       = ppd_ofc_cd      ;
		this.clt_ofc_cd       = clt_ofc_cd      ;
		this.chg_hdr_cre_dt   = chg_hdr_cre_dt  ;
		this.cre_usr_id       = cre_usr_id      ;
		this.hdr_upd_dt       = hdr_upd_dt      ;
		this.upd_usr_id       = upd_usr_id      ;
		this.bkg_rt_hd_usr_id = bkg_rt_hd_usr_id;
		this.bkg_rev_div_cd   = bkg_rev_div_cd  ;
		this.cobiz_no         = cobiz_no        ;
		this.org_via_cd       = org_via_cd      ;
		this.dest_via_cd      = dest_via_cd     ;
		this.rt_cfm_flg       = rt_cfm_flg      ;
		this.rt_cfm_usr_id    = rt_cfm_usr_id   ;
		this.rt_cfm_dt        = rt_cfm_dt       ;
		this.sc_no            = sc_no           ;
		this.gen_trf_no       = gen_trf_no      ;
		this.ppayr_cnt_cd     = ppayr_cnt_cd    ;
		this.ppayr_seq        = ppayr_seq       ;
		this.act_ppayr_cnt_cd = act_ppayr_cnt_cd;
		this.act_ppayr_seq    = act_ppayr_seq   ;
		this.bfr_ofc_cd       = bfr_ofc_cd      ;
		this.clt_payr_cnt_cd  = clt_payr_cnt_cd ;
		this.clt_payr_seq     = clt_payr_seq    ;
		this.act_payr_cnt_cd  = act_payr_cnt_cd ;
		this.act_payr_seq     = act_payr_seq    ;
		this.bfr_clt_ofc_cd   = bfr_clt_ofc_cd  ;
		this.cust_cr_flg      = cust_cr_flg     ;
		this.bl_cr_dys        = bl_cr_dys       ;
		this.rfa_no           = rfa_no          ;
		this.cgo_rcv_dt       = cgo_rcv_dt      ;
		this.nis_evnt_dt      = nis_evnt_dt     ;
		this.wfg_expt_flg     = wfg_expt_flg    ;
		this.wfg_shpr_rgst_no = wfg_shpr_rgst_no;
		this.clt_expt_cd     = clt_expt_cd    ;
		this.auto_rat_flg     = auto_rat_flg    ;
		this.cfm_flg          = cfm_flg         ;
		this.cfm_usr_id       = cfm_usr_id      ;
		this.cfm_dt           = cfm_dt          ;
		this.sc_rt_tp_cd      = sc_rt_tp_cd     ;
		this.cmdt_cd          = cmdt_cd         ;
		this.bkg_rat_max_cre_dt = bkg_rat_max_cre_dt         ; // 2008 03 07 hyunsu added 
		this.ctrt_cust_cnt_cd 	= ctrt_cust_cnt_cd;				// 2008 04 10 hyunsu added 
		this.ctrt_cust_seq  	= ctrt_cust_seq;				// 2008 04 10 hyunsu added 

		this.eai_evnt_dt      = eai_evnt_dt     ;
	}

	// getter method is proceeding ..
	public String           getIbflag          (){	return ibflag          	;	}
	public String           getPage_rows       (){	return page_rows       	;	}
	public String           getBkg_no          (){	return bkg_no          	;	}
	public String           getBkg_no_split    (){	return bkg_no_split    	;	}
	public String           getBkg_agmt_tp_cd  (){	return bkg_agmt_tp_cd  	;	}
	public String           getSc_rfa_agmt_no  (){	return sc_rfa_agmt_no  	;	}
	public String           getLcl_tp_cd       (){	return lcl_tp_cd       	;	}
	public String           getCbm_amt         (){	return cbm_amt         	;	}
	public String           getCbm_curr_cd     (){	return cbm_curr_cd     	;	}
	public String           getMty_rt_amt      (){	return mty_rt_amt      	;	}
	public String           getMty_curr_cd     (){	return mty_curr_cd     	;	}
	public String           getPpd_ofc_cd      (){	return ppd_ofc_cd      	;	}
	public String           getClt_ofc_cd      (){	return clt_ofc_cd      	;	}
	public String           getChg_hdr_cre_dt  (){	return chg_hdr_cre_dt  	;	}
	public String           getCre_usr_id      (){	return cre_usr_id      	;	}
	public String           getHdr_upd_dt      (){	return hdr_upd_dt      	;	}
	public String           getUpd_usr_id      (){	return upd_usr_id      	;	}
	public String           getBkg_rt_hd_usr_id(){	return bkg_rt_hd_usr_id	;	}
	public String           getBkg_rev_div_cd  (){	return bkg_rev_div_cd  	;	}
	public String           getCobiz_no        (){	return cobiz_no        	;	}
	public String           getOrg_via_cd      (){	return org_via_cd      	;	}
	public String           getDest_via_cd     (){	return dest_via_cd     	;	}
	public String           getRt_cfm_flg      (){	return rt_cfm_flg      	;	}
	public String           getRt_cfm_usr_id   (){	return rt_cfm_usr_id   	;	}
	public String           getRt_cfm_dt       (){	return rt_cfm_dt       	;	}
	public String           getSc_no           (){	return sc_no           	;	}
	public String           getGen_trf_no      (){	return gen_trf_no      	;	}
	public String           getPpayr_cnt_cd    (){	return ppayr_cnt_cd    	;	}
	public String           getPpayr_seq       (){	return ppayr_seq       	;	}
	public String           getAct_ppayr_cnt_cd(){	return act_ppayr_cnt_cd	;	}
	public String           getAct_ppayr_seq   (){	return act_ppayr_seq   	;	}
	public String           getBfr_ofc_cd      (){	return bfr_ofc_cd      	;	}
	public String           getClt_payr_cnt_cd (){	return clt_payr_cnt_cd 	;	}
	public String           getClt_payr_seq    (){	return clt_payr_seq    	;	}
	public String           getAct_payr_cnt_cd (){	return act_payr_cnt_cd 	;	}
	public String           getAct_payr_seq    (){	return act_payr_seq    	;	}
	public String           getBfr_clt_ofc_cd  (){	return bfr_clt_ofc_cd  	;	}
	public String           getCust_cr_flg     (){	return cust_cr_flg     	;	}
	public String           getBl_cr_dys       (){	return bl_cr_dys       	;	}
	public String           getRfa_no          (){	return rfa_no          	;	}
	public String           getCgo_rcv_dt      (){	return cgo_rcv_dt      	;	}
	public String           getNis_evnt_dt     (){	return nis_evnt_dt     	;	}
	public String           getWfg_expt_flg    (){	return wfg_expt_flg    	;	}
	public String           getWfg_shpr_rgst_no(){	return wfg_shpr_rgst_no	;	}
	public String           getClt_expt_cd    (){	return clt_expt_cd    	;	}
	public String           getAuto_rat_flg    (){	return auto_rat_flg    	;	}
	public String           getCfm_flg         (){	return cfm_flg         	;	}
	public String           getCfm_usr_id      (){	return cfm_usr_id      	;	}
	public String           getCfm_dt          (){	return cfm_dt          	;	}
	public String           getSc_rt_tp_cd     (){	return sc_rt_tp_cd     	;	}
	public String           getCmdt_cd         (){	return cmdt_cd         	;	}   
	public String           getBkg_rat_max_cre_dt(){	return bkg_rat_max_cre_dt         	;	} // 2008 03 07 hyunsu added 
	public String           getCtrt_cust_cnt_cd	(){	return ctrt_cust_cnt_cd	;	} 					// 2008 03 07 hyunsu added 
	public String           getCtrt_cust_seq		(){	return ctrt_cust_seq   	;	} 					// 2008 03 07 hyunsu added
	
	public String           getEai_evnt_dt     (){	return eai_evnt_dt     	;	}

	// setter method is proceeding ..
	public void setIbflag          ( String           ibflag           ){	this.ibflag           = ibflag          	;	}
	public void setPage_rows       ( String           page_rows        ){	this.page_rows        = page_rows       	;	}
	public void setBkg_no          ( String           bkg_no           ){	this.bkg_no           = bkg_no          	;	}
	public void setBkg_no_split    ( String           bkg_no_split     ){	this.bkg_no_split     = bkg_no_split    	;	}
	public void setBkg_agmt_tp_cd  ( String           bkg_agmt_tp_cd   ){	this.bkg_agmt_tp_cd   = bkg_agmt_tp_cd  	;	}
	public void setSc_rfa_agmt_no  ( String           sc_rfa_agmt_no   ){	this.sc_rfa_agmt_no   = sc_rfa_agmt_no  	;	}
	public void setLcl_tp_cd       ( String           lcl_tp_cd        ){	this.lcl_tp_cd        = lcl_tp_cd       	;	}
	public void setCbm_amt         ( String           cbm_amt          ){	this.cbm_amt          = cbm_amt         	;	}
	public void setCbm_curr_cd     ( String           cbm_curr_cd      ){	this.cbm_curr_cd      = cbm_curr_cd     	;	}
	public void setMty_rt_amt      ( String           mty_rt_amt       ){	this.mty_rt_amt       = mty_rt_amt      	;	}
	public void setMty_curr_cd     ( String           mty_curr_cd      ){	this.mty_curr_cd      = mty_curr_cd     	;	}
	public void setPpd_ofc_cd      ( String           ppd_ofc_cd       ){	this.ppd_ofc_cd       = ppd_ofc_cd      	;	}
	public void setClt_ofc_cd      ( String           clt_ofc_cd       ){	this.clt_ofc_cd       = clt_ofc_cd      	;	}
	public void setChg_hdr_cre_dt  ( String           chg_hdr_cre_dt   ){	this.chg_hdr_cre_dt   = chg_hdr_cre_dt  	;	}
	public void setCre_usr_id      ( String           cre_usr_id       ){	this.cre_usr_id       = cre_usr_id      	;	}
	public void setHdr_upd_dt      ( String           hdr_upd_dt       ){	this.hdr_upd_dt       = hdr_upd_dt      	;	}
	public void setUpd_usr_id      ( String           upd_usr_id       ){	this.upd_usr_id       = upd_usr_id      	;	}
	public void setBkg_rt_hd_usr_id( String           bkg_rt_hd_usr_id ){	this.bkg_rt_hd_usr_id = bkg_rt_hd_usr_id	;	}
	public void setBkg_rev_div_cd  ( String           bkg_rev_div_cd   ){	this.bkg_rev_div_cd   = bkg_rev_div_cd  	;	}
	public void setCobiz_no        ( String           cobiz_no         ){	this.cobiz_no         = cobiz_no        	;	}
	public void setOrg_via_cd      ( String           org_via_cd       ){	this.org_via_cd       = org_via_cd      	;	}
	public void setDest_via_cd     ( String           dest_via_cd      ){	this.dest_via_cd      = dest_via_cd     	;	}
	public void setRt_cfm_flg      ( String           rt_cfm_flg       ){	this.rt_cfm_flg       = rt_cfm_flg      	;	}
	public void setRt_cfm_usr_id   ( String           rt_cfm_usr_id    ){	this.rt_cfm_usr_id    = rt_cfm_usr_id   	;	}
	public void setRt_cfm_dt       ( String           rt_cfm_dt        ){	this.rt_cfm_dt        = rt_cfm_dt       	;	}
	public void setSc_no           ( String           sc_no            ){	this.sc_no            = sc_no           	;	}
	public void setGen_trf_no      ( String           gen_trf_no       ){	this.gen_trf_no       = gen_trf_no      	;	}
	public void setPpayr_cnt_cd    ( String           ppayr_cnt_cd     ){	this.ppayr_cnt_cd     = ppayr_cnt_cd    	;	}
	public void setPpayr_seq       ( String           ppayr_seq        ){	this.ppayr_seq        = ppayr_seq       	;	}
	public void setAct_ppayr_cnt_cd( String           act_ppayr_cnt_cd ){	this.act_ppayr_cnt_cd = act_ppayr_cnt_cd	;	}
	public void setAct_ppayr_seq   ( String           act_ppayr_seq    ){	this.act_ppayr_seq    = act_ppayr_seq   	;	}
	public void setBfr_ofc_cd      ( String           bfr_ofc_cd       ){	this.bfr_ofc_cd       = bfr_ofc_cd      	;	}
	public void setClt_payr_cnt_cd ( String           clt_payr_cnt_cd  ){	this.clt_payr_cnt_cd  = clt_payr_cnt_cd 	;	}
	public void setClt_payr_seq    ( String           clt_payr_seq     ){	this.clt_payr_seq     = clt_payr_seq    	;	}
	public void setAct_payr_cnt_cd ( String           act_payr_cnt_cd  ){	this.act_payr_cnt_cd  = act_payr_cnt_cd 	;	}
	public void setAct_payr_seq    ( String           act_payr_seq     ){	this.act_payr_seq     = act_payr_seq    	;	}
	public void setBfr_clt_ofc_cd  ( String           bfr_clt_ofc_cd   ){	this.bfr_clt_ofc_cd   = bfr_clt_ofc_cd  	;	}
	public void setCust_cr_flg     ( String           cust_cr_flg      ){	this.cust_cr_flg      = cust_cr_flg     	;	}
	public void setBl_cr_dys       ( String           bl_cr_dys        ){	this.bl_cr_dys        = bl_cr_dys       	;	}
	public void setRfa_no          ( String           rfa_no           ){	this.rfa_no           = rfa_no          	;	}
	public void setCgo_rcv_dt      ( String           cgo_rcv_dt       ){	this.cgo_rcv_dt       = cgo_rcv_dt      	;	}
	public void setNis_evnt_dt     ( String           nis_evnt_dt      ){	this.nis_evnt_dt      = nis_evnt_dt     	;	}
	public void setWfg_expt_flg    ( String           wfg_expt_flg     ){	this.wfg_expt_flg     = wfg_expt_flg    	;	}
	public void setWfg_shpr_rgst_no( String           wfg_shpr_rgst_no ){	this.wfg_shpr_rgst_no = wfg_shpr_rgst_no	;	}
	public void setClt_expt_cd    ( String           clt_expt_cd     ){	this.clt_expt_cd     = clt_expt_cd    	;	}
	public void setAuto_rat_flg    ( String           auto_rat_flg     ){	this.auto_rat_flg     = auto_rat_flg    	;	}
	public void setCfm_flg         ( String           cfm_flg          ){	this.cfm_flg          = cfm_flg         	;	}
	public void setCfm_usr_id      ( String           cfm_usr_id       ){	this.cfm_usr_id       = cfm_usr_id      	;	}
	public void setCfm_dt          ( String           cfm_dt           ){	this.cfm_dt           = cfm_dt          	;	}
	public void setSc_rt_tp_cd     ( String           sc_rt_tp_cd      ){	this.sc_rt_tp_cd      = sc_rt_tp_cd     	;	}
	public void setCmdt_cd         ( String           cmdt_cd          ){	this.cmdt_cd          = cmdt_cd         	;	}  
	public void setBkg_rat_max_cre_dt( String         bkg_rat_max_cre_dt ){	this.bkg_rat_max_cre_dt = bkg_rat_max_cre_dt;	} // 2008 03 07 hyunsu added
	public void setCtrt_cust_cnt_cd	( String         ctrt_cust_cnt_cd ){	this.ctrt_cust_cnt_cd = ctrt_cust_cnt_cd;	} // 2008 04 10 hyunsu added
	public void setCtrt_cust_seq		( String         ctrt_cust_seq ){	this.ctrt_cust_seq = ctrt_cust_seq;	} // 2008 03 07 hyunsu added

	public void setEai_evnt_dt     ( String           eai_evnt_dt      ){	this.eai_evnt_dt      = eai_evnt_dt     	;	}

	public static BKG_BKG_RT_HD fromRequest(HttpServletRequest request) {
		BKG_BKG_RT_HD model = new BKG_BKG_RT_HD();
		try {
			model.setIbflag          	(JSPUtil.getParameter(request, "ibflag          		".trim(), ""));
			model.setPage_rows       	(JSPUtil.getParameter(request, "page_rows       		".trim(), ""));
			model.setBkg_no          	(JSPUtil.getParameter(request, "bkg_no          		".trim(), ""));
			model.setBkg_no_split    	(JSPUtil.getParameter(request, "bkg_no_split    		".trim(), ""));
			model.setBkg_agmt_tp_cd  	(JSPUtil.getParameter(request, "bkg_agmt_tp_cd  		".trim(), ""));
			model.setSc_rfa_agmt_no  	(JSPUtil.getParameter(request, "sc_rfa_agmt_no  		".trim(), ""));
			model.setLcl_tp_cd       	(JSPUtil.getParameter(request, "lcl_tp_cd       		".trim(), ""));
			model.setCbm_amt         	(JSPUtil.getParameter(request, "cbm_amt         		".trim(), ""));
			model.setCbm_curr_cd     	(JSPUtil.getParameter(request, "cbm_curr_cd     		".trim(), ""));
			model.setMty_rt_amt      	(JSPUtil.getParameter(request, "mty_rt_amt      		".trim(), ""));
			model.setMty_curr_cd     	(JSPUtil.getParameter(request, "mty_curr_cd     		".trim(), ""));
			model.setPpd_ofc_cd      	(JSPUtil.getParameter(request, "ppd_ofc_cd      		".trim(), ""));
			model.setClt_ofc_cd      	(JSPUtil.getParameter(request, "clt_ofc_cd      		".trim(), ""));
			model.setChg_hdr_cre_dt  	(JSPUtil.getParameter(request, "chg_hdr_cre_dt  		".trim(), ""));
			model.setCre_usr_id      	(JSPUtil.getParameter(request, "cre_usr_id      		".trim(), ""));
			model.setHdr_upd_dt      	(JSPUtil.getParameter(request, "hdr_upd_dt      		".trim(), ""));
			model.setUpd_usr_id      	(JSPUtil.getParameter(request, "upd_usr_id      		".trim(), ""));
			model.setBkg_rt_hd_usr_id	(JSPUtil.getParameter(request, "bkg_rt_hd_usr_id		".trim(), ""));
			model.setBkg_rev_div_cd  	(JSPUtil.getParameter(request, "bkg_rev_div_cd  		".trim(), ""));
			model.setCobiz_no        	(JSPUtil.getParameter(request, "cobiz_no        		".trim(), ""));
			model.setOrg_via_cd      	(JSPUtil.getParameter(request, "org_via_cd      		".trim(), ""));
			model.setDest_via_cd     	(JSPUtil.getParameter(request, "dest_via_cd     		".trim(), ""));
			model.setRt_cfm_flg      	(JSPUtil.getParameter(request, "rt_cfm_flg      		".trim(), ""));
			model.setRt_cfm_usr_id   	(JSPUtil.getParameter(request, "rt_cfm_usr_id   		".trim(), ""));
			model.setRt_cfm_dt       	(JSPUtil.getParameter(request, "rt_cfm_dt       		".trim(), ""));
			model.setSc_no           	(JSPUtil.getParameter(request, "sc_no           		".trim(), ""));
			model.setGen_trf_no      	(JSPUtil.getParameter(request, "gen_trf_no      		".trim(), ""));
			model.setPpayr_cnt_cd    	(JSPUtil.getParameter(request, "ppayr_cnt_cd    		".trim(), ""));
			model.setPpayr_seq       	(JSPUtil.getParameter(request, "ppayr_seq       		".trim(), ""));
			model.setAct_ppayr_cnt_cd	(JSPUtil.getParameter(request, "act_ppayr_cnt_cd		".trim(), ""));
			model.setAct_ppayr_seq   	(JSPUtil.getParameter(request, "act_ppayr_seq   		".trim(), ""));
			model.setBfr_ofc_cd      	(JSPUtil.getParameter(request, "bfr_ofc_cd      		".trim(), ""));
			model.setClt_payr_cnt_cd 	(JSPUtil.getParameter(request, "clt_payr_cnt_cd 		".trim(), ""));
			model.setClt_payr_seq    	(JSPUtil.getParameter(request, "clt_payr_seq    		".trim(), ""));
			model.setAct_payr_cnt_cd 	(JSPUtil.getParameter(request, "act_payr_cnt_cd 		".trim(), ""));
			model.setAct_payr_seq    	(JSPUtil.getParameter(request, "act_payr_seq    		".trim(), ""));
			model.setBfr_clt_ofc_cd  	(JSPUtil.getParameter(request, "bfr_clt_ofc_cd  		".trim(), ""));
			model.setCust_cr_flg     	(JSPUtil.getParameter(request, "cust_cr_flg     		".trim(), ""));
			model.setBl_cr_dys       	(JSPUtil.getParameter(request, "bl_cr_dys       		".trim(), ""));
			model.setRfa_no          	(JSPUtil.getParameter(request, "rfa_no          		".trim(), ""));
			model.setCgo_rcv_dt      	(JSPUtil.getParameter(request, "cgo_rcv_dt      		".trim(), ""));
			model.setNis_evnt_dt     	(JSPUtil.getParameter(request, "nis_evnt_dt     		".trim(), ""));
			model.setWfg_expt_flg    	(JSPUtil.getParameter(request, "wfg_expt_flg    		".trim(), ""));
			model.setWfg_shpr_rgst_no	(JSPUtil.getParameter(request, "wfg_shpr_rgst_no		".trim(), ""));
			model.setClt_expt_cd    	(JSPUtil.getParameter(request, "clt_expt_cd    		".trim(), ""));
			model.setAuto_rat_flg    	(JSPUtil.getParameter(request, "auto_rat_flg    		".trim(), ""));
			model.setCfm_flg         	(JSPUtil.getParameter(request, "cfm_flg         		".trim(), ""));
			model.setCfm_usr_id      	(JSPUtil.getParameter(request, "cfm_usr_id      		".trim(), ""));
			model.setCfm_dt          	(JSPUtil.getParameter(request, "cfm_dt          		".trim(), ""));
			model.setSc_rt_tp_cd     	(JSPUtil.getParameter(request, "sc_rt_tp_cd     		".trim(), ""));
			model.setCmdt_cd         	(JSPUtil.getParameter(request, "cmdt_cd         		".trim(), ""));
			model.setBkg_rat_max_cre_dt	(JSPUtil.getParameter(request, "bkg_rat_max_cre_dt 		".trim(), "")); // 2008 0307 hyunsu added 
			model.setCtrt_cust_cnt_cd	(JSPUtil.getParameter(request, "ctrt_cust_cnt_cd 		".trim(), "")); // 2008 0410 hyunsu added 
			model.setCtrt_cust_seq		(JSPUtil.getParameter(request, "ctrt_cust_seq 			".trim(), "")); // 2008 0410 hyunsu added 

			model.setEai_evnt_dt     	(JSPUtil.getParameter(request, "eai_evnt_dt     		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		BKG_BKG_RT_HD model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag           =  (JSPUtil.getParameter(request, "ibflag          		".trim(), length));
			String[] page_rows        =  (JSPUtil.getParameter(request, "page_rows       		".trim(), length));
			String[] bkg_no           =  (JSPUtil.getParameter(request, "bkg_no          		".trim(), length));
			String[] bkg_no_split     =  (JSPUtil.getParameter(request, "bkg_no_split    		".trim(), length));
			String[] bkg_agmt_tp_cd   =  (JSPUtil.getParameter(request, "bkg_agmt_tp_cd  		".trim(), length));
			String[] sc_rfa_agmt_no   =  (JSPUtil.getParameter(request, "sc_rfa_agmt_no  		".trim(), length));
			String[] lcl_tp_cd        =  (JSPUtil.getParameter(request, "lcl_tp_cd       		".trim(), length));
			String[] cbm_amt          =  (JSPUtil.getParameter(request, "cbm_amt         		".trim(), length));
			String[] cbm_curr_cd      =  (JSPUtil.getParameter(request, "cbm_curr_cd     		".trim(), length));
			String[] mty_rt_amt       =  (JSPUtil.getParameter(request, "mty_rt_amt      		".trim(), length));
			String[] mty_curr_cd      =  (JSPUtil.getParameter(request, "mty_curr_cd     		".trim(), length));
			String[] ppd_ofc_cd       =  (JSPUtil.getParameter(request, "ppd_ofc_cd      		".trim(), length));
			String[] clt_ofc_cd       =  (JSPUtil.getParameter(request, "clt_ofc_cd      		".trim(), length));
			String[] chg_hdr_cre_dt   =  (JSPUtil.getParameter(request, "chg_hdr_cre_dt  		".trim(), length));
			String[] cre_usr_id       =  (JSPUtil.getParameter(request, "cre_usr_id      		".trim(), length));
			String[] hdr_upd_dt       =  (JSPUtil.getParameter(request, "hdr_upd_dt      		".trim(), length));
			String[] upd_usr_id       =  (JSPUtil.getParameter(request, "upd_usr_id      		".trim(), length));
			String[] bkg_rt_hd_usr_id =  (JSPUtil.getParameter(request, "bkg_rt_hd_usr_id		".trim(), length));
			String[] bkg_rev_div_cd   =  (JSPUtil.getParameter(request, "bkg_rev_div_cd  		".trim(), length));
			String[] cobiz_no         =  (JSPUtil.getParameter(request, "cobiz_no        		".trim(), length));
			String[] org_via_cd       =  (JSPUtil.getParameter(request, "org_via_cd      		".trim(), length));
			String[] dest_via_cd      =  (JSPUtil.getParameter(request, "dest_via_cd     		".trim(), length));
			String[] rt_cfm_flg       =  (JSPUtil.getParameter(request, "rt_cfm_flg      		".trim(), length));
			String[] rt_cfm_usr_id    =  (JSPUtil.getParameter(request, "rt_cfm_usr_id   		".trim(), length));
			String[] rt_cfm_dt        =  (JSPUtil.getParameter(request, "rt_cfm_dt       		".trim(), length));
			String[] sc_no            =  (JSPUtil.getParameter(request, "sc_no           		".trim(), length));
			String[] gen_trf_no       =  (JSPUtil.getParameter(request, "gen_trf_no      		".trim(), length));
			String[] ppayr_cnt_cd     =  (JSPUtil.getParameter(request, "ppayr_cnt_cd    		".trim(), length));
			String[] ppayr_seq        =  (JSPUtil.getParameter(request, "ppayr_seq       		".trim(), length));
			String[] act_ppayr_cnt_cd =  (JSPUtil.getParameter(request, "act_ppayr_cnt_cd		".trim(), length));
			String[] act_ppayr_seq    =  (JSPUtil.getParameter(request, "act_ppayr_seq   		".trim(), length));
			String[] bfr_ofc_cd       =  (JSPUtil.getParameter(request, "bfr_ofc_cd      		".trim(), length));
			String[] clt_payr_cnt_cd  =  (JSPUtil.getParameter(request, "clt_payr_cnt_cd 		".trim(), length));
			String[] clt_payr_seq     =  (JSPUtil.getParameter(request, "clt_payr_seq    		".trim(), length));
			String[] act_payr_cnt_cd  =  (JSPUtil.getParameter(request, "act_payr_cnt_cd 		".trim(), length));
			String[] act_payr_seq     =  (JSPUtil.getParameter(request, "act_payr_seq    		".trim(), length));
			String[] bfr_clt_ofc_cd   =  (JSPUtil.getParameter(request, "bfr_clt_ofc_cd  		".trim(), length));
			String[] cust_cr_flg      =  (JSPUtil.getParameter(request, "cust_cr_flg     		".trim(), length));
			String[] bl_cr_dys        =  (JSPUtil.getParameter(request, "bl_cr_dys       		".trim(), length));
			String[] rfa_no           =  (JSPUtil.getParameter(request, "rfa_no          		".trim(), length));
			String[] cgo_rcv_dt       =  (JSPUtil.getParameter(request, "cgo_rcv_dt      		".trim(), length));
			String[] nis_evnt_dt      =  (JSPUtil.getParameter(request, "nis_evnt_dt     		".trim(), length));
			String[] wfg_expt_flg     =  (JSPUtil.getParameter(request, "wfg_expt_flg    		".trim(), length));
			String[] wfg_shpr_rgst_no =  (JSPUtil.getParameter(request, "wfg_shpr_rgst_no		".trim(), length));
			String[] clt_expt_cd     =  (JSPUtil.getParameter(request, "clt_expt_cd    		".trim(), length));
			String[] auto_rat_flg     =  (JSPUtil.getParameter(request, "auto_rat_flg    		".trim(), length));
			String[] cfm_flg          =  (JSPUtil.getParameter(request, "cfm_flg         		".trim(), length));
			String[] cfm_usr_id       =  (JSPUtil.getParameter(request, "cfm_usr_id      		".trim(), length));
			String[] cfm_dt           =  (JSPUtil.getParameter(request, "cfm_dt          		".trim(), length));
			String[] sc_rt_tp_cd      =  (JSPUtil.getParameter(request, "sc_rt_tp_cd     		".trim(), length));
			String[] cmdt_cd          =  (JSPUtil.getParameter(request, "cmdt_cd         		".trim(), length));
			String[] bkg_rat_max_cre_dt =  (JSPUtil.getParameter(request, "bkg_rat_max_cre_dt   ".trim(), length)); // 2008 03 07 hyunsu added 
			String[] ctrt_cust_cnt_cd =  (JSPUtil.getParameter(request, "ctrt_cust_cnt_cd   	".trim(), length)); // 2008 03 07 hyunsu added 
			String[] ctrt_cust_seq 	  =  (JSPUtil.getParameter(request, "ctrt_cust_seq   		".trim(), length)); // 2008 03 07 hyunsu added 

			
			String[] eai_evnt_dt      =  (JSPUtil.getParameter(request, "eai_evnt_dt     		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new BKG_BKG_RT_HD();
				model.setIbflag          		  (ibflag          	[i]);
				model.setPage_rows       		  (page_rows       	[i]);
				model.setBkg_no          		  (bkg_no          	[i]);
				model.setBkg_no_split    		  (bkg_no_split    	[i]);
				model.setBkg_agmt_tp_cd  		  (bkg_agmt_tp_cd  	[i]);
				model.setSc_rfa_agmt_no  		  (sc_rfa_agmt_no  	[i]);
				model.setLcl_tp_cd       		  (lcl_tp_cd       	[i]);
				model.setCbm_amt         		  (cbm_amt         	[i]);
				model.setCbm_curr_cd     		  (cbm_curr_cd     	[i]);
				model.setMty_rt_amt      		  (mty_rt_amt      	[i]);
				model.setMty_curr_cd     		  (mty_curr_cd     	[i]);
				model.setPpd_ofc_cd      		  (ppd_ofc_cd      	[i]);
				model.setClt_ofc_cd      		  (clt_ofc_cd      	[i]);
				model.setChg_hdr_cre_dt  		  (chg_hdr_cre_dt  	[i]);
				model.setCre_usr_id      		  (cre_usr_id      	[i]);
				model.setHdr_upd_dt      		  (hdr_upd_dt      	[i]);
				model.setUpd_usr_id      		  (upd_usr_id      	[i]);
				model.setBkg_rt_hd_usr_id		  (bkg_rt_hd_usr_id	[i]);
				model.setBkg_rev_div_cd  		  (bkg_rev_div_cd  	[i]);
				model.setCobiz_no        		  (cobiz_no        	[i]);
				model.setOrg_via_cd      		  (org_via_cd      	[i]);
				model.setDest_via_cd     		  (dest_via_cd     	[i]);
				model.setRt_cfm_flg      		  (rt_cfm_flg      	[i]);
				model.setRt_cfm_usr_id   		  (rt_cfm_usr_id   	[i]);
				model.setRt_cfm_dt       		  (rt_cfm_dt       	[i]);
				model.setSc_no           		  (sc_no           	[i]);
				model.setGen_trf_no      		  (gen_trf_no      	[i]);
				model.setPpayr_cnt_cd    		  (ppayr_cnt_cd    	[i]);
				model.setPpayr_seq       		  (ppayr_seq       	[i]);
				model.setAct_ppayr_cnt_cd		  (act_ppayr_cnt_cd	[i]);
				model.setAct_ppayr_seq   		  (act_ppayr_seq   	[i]);
				model.setBfr_ofc_cd      		  (bfr_ofc_cd      	[i]);
				model.setClt_payr_cnt_cd 		  (clt_payr_cnt_cd 	[i]);
				model.setClt_payr_seq    		  (clt_payr_seq    	[i]);
				model.setAct_payr_cnt_cd 		  (act_payr_cnt_cd 	[i]);
				model.setAct_payr_seq    		  (act_payr_seq    	[i]);
				model.setBfr_clt_ofc_cd  		  (bfr_clt_ofc_cd  	[i]);
				model.setCust_cr_flg     		  (cust_cr_flg     	[i]);
				model.setBl_cr_dys       		  (bl_cr_dys       	[i]);
				model.setRfa_no          		  (rfa_no          	[i]);
				model.setCgo_rcv_dt      		  (cgo_rcv_dt      	[i]);
				model.setNis_evnt_dt     		  (nis_evnt_dt     	[i]);
				model.setWfg_expt_flg    		  (wfg_expt_flg    	[i]);
				model.setWfg_shpr_rgst_no		  (wfg_shpr_rgst_no	[i]);
				model.setClt_expt_cd    		  (clt_expt_cd    	[i]);
				model.setAuto_rat_flg    		  (auto_rat_flg    	[i]);
				model.setCfm_flg         		  (cfm_flg         	[i]);
				model.setCfm_usr_id      		  (cfm_usr_id      	[i]);
				model.setCfm_dt          		  (cfm_dt          	[i]);
				model.setSc_rt_tp_cd     		  (sc_rt_tp_cd     	[i]);
				model.setCmdt_cd         		  (cmdt_cd         	[i]);
				model.setBkg_rat_max_cre_dt		  (bkg_rat_max_cre_dt[i]);
				model.setCtrt_cust_cnt_cd		  (ctrt_cust_cnt_cd	[i]);	// 2008 04 10 hyunsu added 
				model.setCtrt_cust_seq		  	  (ctrt_cust_seq	[i]);	// 2008 04 10 hyunsu added 
				
				model.setEai_evnt_dt     		  (eai_evnt_dt     	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		BKG_BKG_RT_HD model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag           =  (JSPUtil.getParameter(request, prefix + "ibflag          		".trim(), length));
			String[] page_rows        =  (JSPUtil.getParameter(request, prefix + "page_rows       		".trim(), length));
			String[] bkg_no           =  (JSPUtil.getParameter(request, prefix + "bkg_no          		".trim(), length));
			String[] bkg_no_split     =  (JSPUtil.getParameter(request, prefix + "bkg_no_split    		".trim(), length));
			String[] bkg_agmt_tp_cd   =  (JSPUtil.getParameter(request, prefix + "bkg_agmt_tp_cd  		".trim(), length));
			String[] sc_rfa_agmt_no   =  (JSPUtil.getParameter(request, prefix + "sc_rfa_agmt_no  		".trim(), length));
			String[] lcl_tp_cd        =  (JSPUtil.getParameter(request, prefix + "lcl_tp_cd       		".trim(), length));
			String[] cbm_amt          =  (JSPUtil.getParameter(request, prefix + "cbm_amt         		".trim(), length));
			String[] cbm_curr_cd      =  (JSPUtil.getParameter(request, prefix + "cbm_curr_cd     		".trim(), length));
			String[] mty_rt_amt       =  (JSPUtil.getParameter(request, prefix + "mty_rt_amt      		".trim(), length));
			String[] mty_curr_cd      =  (JSPUtil.getParameter(request, prefix + "mty_curr_cd     		".trim(), length));
			String[] ppd_ofc_cd       =  (JSPUtil.getParameter(request, prefix + "ppd_ofc_cd      		".trim(), length));
			String[] clt_ofc_cd       =  (JSPUtil.getParameter(request, prefix + "clt_ofc_cd      		".trim(), length));
			String[] chg_hdr_cre_dt   =  (JSPUtil.getParameter(request, prefix + "chg_hdr_cre_dt  		".trim(), length));
			String[] cre_usr_id       =  (JSPUtil.getParameter(request, prefix + "cre_usr_id      		".trim(), length));
			String[] hdr_upd_dt       =  (JSPUtil.getParameter(request, prefix + "hdr_upd_dt      		".trim(), length));
			String[] upd_usr_id       =  (JSPUtil.getParameter(request, prefix + "upd_usr_id      		".trim(), length));
			String[] bkg_rt_hd_usr_id =  (JSPUtil.getParameter(request, prefix + "bkg_rt_hd_usr_id		".trim(), length));
			String[] bkg_rev_div_cd   =  (JSPUtil.getParameter(request, prefix + "bkg_rev_div_cd  		".trim(), length));
			String[] cobiz_no         =  (JSPUtil.getParameter(request, prefix + "cobiz_no        		".trim(), length));
			String[] org_via_cd       =  (JSPUtil.getParameter(request, prefix + "org_via_cd      		".trim(), length));
			String[] dest_via_cd      =  (JSPUtil.getParameter(request, prefix + "dest_via_cd     		".trim(), length));
			String[] rt_cfm_flg       =  (JSPUtil.getParameter(request, prefix + "rt_cfm_flg      		".trim(), length));
			String[] rt_cfm_usr_id    =  (JSPUtil.getParameter(request, prefix + "rt_cfm_usr_id   		".trim(), length));
			String[] rt_cfm_dt        =  (JSPUtil.getParameter(request, prefix + "rt_cfm_dt       		".trim(), length));
			String[] sc_no            =  (JSPUtil.getParameter(request, prefix + "sc_no           		".trim(), length));
			String[] gen_trf_no       =  (JSPUtil.getParameter(request, prefix + "gen_trf_no      		".trim(), length));
			String[] ppayr_cnt_cd     =  (JSPUtil.getParameter(request, prefix + "ppayr_cnt_cd    		".trim(), length));
			String[] ppayr_seq        =  (JSPUtil.getParameter(request, prefix + "ppayr_seq       		".trim(), length));
			String[] act_ppayr_cnt_cd =  (JSPUtil.getParameter(request, prefix + "act_ppayr_cnt_cd		".trim(), length));
			String[] act_ppayr_seq    =  (JSPUtil.getParameter(request, prefix + "act_ppayr_seq   		".trim(), length));
			String[] bfr_ofc_cd       =  (JSPUtil.getParameter(request, prefix + "bfr_ofc_cd      		".trim(), length));
			String[] clt_payr_cnt_cd  =  (JSPUtil.getParameter(request, prefix + "clt_payr_cnt_cd 		".trim(), length));
			String[] clt_payr_seq     =  (JSPUtil.getParameter(request, prefix + "clt_payr_seq    		".trim(), length));
			String[] act_payr_cnt_cd  =  (JSPUtil.getParameter(request, prefix + "act_payr_cnt_cd 		".trim(), length));
			String[] act_payr_seq     =  (JSPUtil.getParameter(request, prefix + "act_payr_seq    		".trim(), length));
			String[] bfr_clt_ofc_cd   =  (JSPUtil.getParameter(request, prefix + "bfr_clt_ofc_cd  		".trim(), length));
			String[] cust_cr_flg      =  (JSPUtil.getParameter(request, prefix + "cust_cr_flg     		".trim(), length));
			String[] bl_cr_dys        =  (JSPUtil.getParameter(request, prefix + "bl_cr_dys       		".trim(), length));
			String[] rfa_no           =  (JSPUtil.getParameter(request, prefix + "rfa_no          		".trim(), length));
			String[] cgo_rcv_dt       =  (JSPUtil.getParameter(request, prefix + "cgo_rcv_dt      		".trim(), length));
			String[] nis_evnt_dt      =  (JSPUtil.getParameter(request, prefix + "nis_evnt_dt     		".trim(), length));
			String[] wfg_expt_flg     =  (JSPUtil.getParameter(request, prefix + "wfg_expt_flg    		".trim(), length));
			String[] wfg_shpr_rgst_no =  (JSPUtil.getParameter(request, prefix + "wfg_shpr_rgst_no		".trim(), length));
			String[] clt_expt_cd     =  (JSPUtil.getParameter(request, prefix + "clt_expt_cd    		".trim(), length));
			String[] auto_rat_flg     =  (JSPUtil.getParameter(request, prefix + "auto_rat_flg    		".trim(), length));
			String[] cfm_flg          =  (JSPUtil.getParameter(request, prefix + "cfm_flg         		".trim(), length));
			String[] cfm_usr_id       =  (JSPUtil.getParameter(request, prefix + "cfm_usr_id      		".trim(), length));
			String[] cfm_dt           =  (JSPUtil.getParameter(request, prefix + "cfm_dt          		".trim(), length));
			String[] sc_rt_tp_cd      =  (JSPUtil.getParameter(request, prefix + "sc_rt_tp_cd     		".trim(), length));
			String[] cmdt_cd          =  (JSPUtil.getParameter(request, prefix + "cmdt_cd         		".trim(), length));
			String[] bkg_rat_max_cre_dt =  (JSPUtil.getParameter(request, prefix + "bkg_rat_max_cre_dt	".trim(), length));
			String[] ctrt_cust_cnt_cd =  (JSPUtil.getParameter(request, prefix + "ctrt_cust_cnt_cd		".trim(), length)); // 2008 04 10 hyunsu added 
			String[] ctrt_cust_seq 	  =  (JSPUtil.getParameter(request, prefix + "ctrt_cust_seq			".trim(), length)); // 2008 04 10 hyunsu added 

			String[] eai_evnt_dt      =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt     		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new BKG_BKG_RT_HD();
				model.setIbflag          		  ( ibflag          	[i]);
				model.setPage_rows       		  ( page_rows       	[i]);
				model.setBkg_no          		  ( bkg_no          	[i]);
				model.setBkg_no_split    		  ( bkg_no_split    	[i]);
				model.setBkg_agmt_tp_cd  		  ( bkg_agmt_tp_cd  	[i]);
				model.setSc_rfa_agmt_no  		  ( sc_rfa_agmt_no  	[i]);
				model.setLcl_tp_cd       		  ( lcl_tp_cd       	[i]);
				model.setCbm_amt         		  ( cbm_amt         	[i]);
				model.setCbm_curr_cd     		  ( cbm_curr_cd     	[i]);
				model.setMty_rt_amt      		  ( mty_rt_amt      	[i]);
				model.setMty_curr_cd     		  ( mty_curr_cd     	[i]);
				model.setPpd_ofc_cd      		  ( ppd_ofc_cd      	[i]);
				model.setClt_ofc_cd      		  ( clt_ofc_cd      	[i]);
				model.setChg_hdr_cre_dt  		  ( chg_hdr_cre_dt  	[i]);
				model.setCre_usr_id      		  ( cre_usr_id      	[i]);
				model.setHdr_upd_dt      		  ( hdr_upd_dt      	[i]);
				model.setUpd_usr_id      		  ( upd_usr_id      	[i]);
				model.setBkg_rt_hd_usr_id		  ( bkg_rt_hd_usr_id	[i]);
				model.setBkg_rev_div_cd  		  ( bkg_rev_div_cd  	[i]);
				model.setCobiz_no        		  ( cobiz_no        	[i]);
				model.setOrg_via_cd      		  ( org_via_cd      	[i]);
				model.setDest_via_cd     		  ( dest_via_cd     	[i]);
				model.setRt_cfm_flg      		  ( rt_cfm_flg      	[i]);
				model.setRt_cfm_usr_id   		  ( rt_cfm_usr_id   	[i]);
				model.setRt_cfm_dt       		  ( rt_cfm_dt       	[i]);
				model.setSc_no           		  ( sc_no           	[i]);
				model.setGen_trf_no      		  ( gen_trf_no      	[i]);
				model.setPpayr_cnt_cd    		  ( ppayr_cnt_cd    	[i]);
				model.setPpayr_seq       		  ( ppayr_seq       	[i]);
				model.setAct_ppayr_cnt_cd		  ( act_ppayr_cnt_cd	[i]);
				model.setAct_ppayr_seq   		  ( act_ppayr_seq   	[i]);
				model.setBfr_ofc_cd      		  ( bfr_ofc_cd      	[i]);
				model.setClt_payr_cnt_cd 		  ( clt_payr_cnt_cd 	[i]);
				model.setClt_payr_seq    		  ( clt_payr_seq    	[i]);
				model.setAct_payr_cnt_cd 		  ( act_payr_cnt_cd 	[i]);
				model.setAct_payr_seq    		  ( act_payr_seq    	[i]);
				model.setBfr_clt_ofc_cd  		  ( bfr_clt_ofc_cd  	[i]);
				model.setCust_cr_flg     		  ( cust_cr_flg     	[i]);
				model.setBl_cr_dys       		  ( bl_cr_dys       	[i]);
				model.setRfa_no          		  ( rfa_no          	[i]);
				model.setCgo_rcv_dt      		  ( cgo_rcv_dt      	[i]);
				model.setNis_evnt_dt     		  ( nis_evnt_dt     	[i]);
				model.setWfg_expt_flg    		  ( wfg_expt_flg    	[i]);
				model.setWfg_shpr_rgst_no		  ( wfg_shpr_rgst_no	[i]);
				model.setClt_expt_cd    		  ( clt_expt_cd    	[i]);
				model.setAuto_rat_flg    		  ( auto_rat_flg    	[i]);
				model.setCfm_flg         		  ( cfm_flg         	[i]);
				model.setCfm_usr_id      		  ( cfm_usr_id      	[i]);
				model.setCfm_dt          		  ( cfm_dt          	[i]);
				model.setSc_rt_tp_cd     		  ( sc_rt_tp_cd     	[i]);
				model.setCmdt_cd         		  ( cmdt_cd         	[i]);
				model.setBkg_rat_max_cre_dt		  ( bkg_rat_max_cre_dt  [i]);
				model.setCtrt_cust_cnt_cd		  ( ctrt_cust_cnt_cd  	[i]); // 2008 04 10 hyunsu added 
				model.setCtrt_cust_seq		  	  ( ctrt_cust_seq  		[i]); // 2008 04 10 hyunsu added 
				
				model.setEai_evnt_dt     		  ( eai_evnt_dt     	[i]);
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
