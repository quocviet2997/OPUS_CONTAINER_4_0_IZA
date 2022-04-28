/*=========================================================
*Copyright(c) 2007 CyberLogitec
*@FileName : CHS_CHASSIS.java
*@FileTitle : chassis
*Open Issues :
*Change history :
*@LastModifyDate : 2007-12-10
*@LastModifier : chassis
*@LastVersion : 1.0
* 2007-12-10 chassis
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
 * @author agreement
 * @since J2EE 1.4
 */
public final class CHS_CHASSIS implements java.io.Serializable {

	private String          ibflag          			= "";
	private String          page_rows       			= "";
	private String          chss_no         			= "";
	private String          ctrt_ofc_cty_cd 			= "";
	private String          ctrt_seq					= "";
	private String          vndr_cnt_cd		  			= "";
	private String          vndr_seq			  		= "";
	private String          mgst_no				  		= "";
	private String          chss_tpsz_cd	  			= "";
	private String          lstm_cd 			  		= "";
	private String          ofc_cd				  		= "";
	private String          onh_dt						= "";
	private String          onh_yd_cd			  		= "";
	private String          crnt_yd_cd		  			= "";
	private String          loc_cd				  		= "";
	private String          lcc_cd				  		= "";
	private String          rcc_cd				  		= "";
	private String          dest_yd_cd		  			= "";
	private String          mvmt_sts_cd					= "";
	private String          mvmt_dt				  		= "";
	private String          gate_io_cd		  			= "";
	private String          aciac_div_cd	  			= "";
	private String          chss_in_flg		  			= "";
	private String          chss_tmn_flg				= "";
	private String          lst_sts_yd_cd	  			= "";
	private String          lst_sts_seq		  			= "";
	private String          veh_id				  		= "";
	private String          chss_tit_no		  			= "";
	private String          tare_wgt			  		= "";	
	private String          mft_dt          			= "";
	private String          lse_chss_new_usd_cd	  		= "";
	private String          neu_pool_chss_yd_cd   		= "";
	private String          neu_pool_cre_dt       		= "";
	private String          cre_dt						= "";
	private String          cre_usr_id			      	= "";
	private String          upd_dt			          	= "";
	private String          upd_usr_id				    = "";
	private String          chss_spec_no	        	= "";
	private String          dmg_flg					    = "";
	private String          chss_als_no  	        	= "";
	private String          disp_flg		          	= "";
	private String          ownr_co_cd			 	    = "";
	private String          usr_co_cd				    = "";
	private String          tml_use_flg			    	= "";
	private String          chss_sts_flg			    = "";
	private String          chss_act_dt				    = "";
	private String          chss_term_flg        		= "";
	private String          eai_evnt_dt     			= "";

	public CHS_CHASSIS(){}

	public CHS_CHASSIS(
			String          ibflag          	 		,
			String          page_rows       	 		,
			String          chss_no         	 		,
			String          ctrt_ofc_cty_cd 	 		,
			String          ctrt_seq					,
			String          vndr_cnt_cd		  			,
			String          vndr_seq			  		,
			String          mgst_no				  	 	,
			String          chss_tpsz_cd	  	 		,
			String          lstm_cd 			  	 	,
			String          ofc_cd				  	 	,
			String          onh_dt						,
			String          onh_yd_cd			  	 	,
			String          crnt_yd_cd		  	 		,
			String          loc_cd				  	 	,
			String          lcc_cd				  	 	,
			String          rcc_cd				  	 	,
			String          dest_yd_cd		  	 		,
			String          mvmt_sts_cd				 	,
			String          mvmt_dt				  	 	,
			String          gate_io_cd		  	 		,
			String          aciac_div_cd	  	 		,
			String          chss_in_flg		  	 		,
			String          chss_tmn_flg			 	,
			String          lst_sts_yd_cd	  	 		,
			String          lst_sts_seq		  	 		,
			String          veh_id				  	 	,
			String          chss_tit_no		  	 		,
			String          tare_wgt			  	 	,
			String          mft_dt          	 		,
			String          lse_chss_new_usd_cd			,
			String          neu_pool_chss_yd_cd			,
			String          neu_pool_cre_dt    			,
			String          cre_dt						,
			String          cre_usr_id			   		,
			String          upd_dt			       		,
			String          upd_usr_id				 	,
			String          chss_spec_no	     		,
			String          dmg_flg						,
			String          chss_als_no  	     		,
			String          disp_flg		       		,
			String          ownr_co_cd			   		,
			String          usr_co_cd					,
			String          tml_use_flg			   		,
			String          chss_sts_flg			 	,
			String          chss_act_dt				 	,
			String          chss_term_flg      			,
			String          eai_evnt_dt     	 ){
		this.ibflag          	    = ibflag          	 	;
		this.page_rows       	    = page_rows       	 	;
		this.chss_no         	    = chss_no         	 	;
		this.ctrt_ofc_cty_cd 	    = ctrt_ofc_cty_cd 	 	;
		this.ctrt_seq				= ctrt_seq	 			;
		this.vndr_cnt_cd		  	= vndr_cnt_cd		 	;
		this.vndr_seq			  	= vndr_seq		 		;
		this.mgst_no				= mgst_no		 		;
		this.chss_tpsz_cd	  	    = chss_tpsz_cd	  	 	;
		this.lstm_cd 			  	= lstm_cd 		 		;
		this.ofc_cd				  	= ofc_cd		 		;
		this.onh_dt					= onh_dt	 			;
		this.onh_yd_cd			  	= onh_yd_cd			  	;
		this.crnt_yd_cd		  	    = crnt_yd_cd		  	;
		this.loc_cd				  	= loc_cd				;
		this.lcc_cd				  	= lcc_cd				;
		this.rcc_cd				  	= rcc_cd				;
		this.dest_yd_cd		  	    = dest_yd_cd		  	;
		this.mvmt_sts_cd			= mvmt_sts_cd			;
		this.mvmt_dt				= mvmt_dt				;
		this.gate_io_cd		  	    = gate_io_cd		  	;
		this.aciac_div_cd	  	    = aciac_div_cd	  	 	;
		this.chss_in_flg		  	= chss_in_flg		  	;
		this.chss_tmn_flg			= chss_tmn_flg			;
		this.lst_sts_yd_cd	  	  	= lst_sts_yd_cd	  	 	;
		this.lst_sts_seq		  	= lst_sts_seq		  	;
		this.veh_id				  	= veh_id				;
		this.chss_tit_no		  	= chss_tit_no		  	;
		this.tare_wgt			  	= tare_wgt			  	;
		this.mft_dt          	    = mft_dt          	 	;
		this.lse_chss_new_usd_cd  	= lse_chss_new_usd_cd	;
		this.neu_pool_chss_yd_cd  	= neu_pool_chss_yd_cd	;
		this.neu_pool_cre_dt     	= neu_pool_cre_dt    	;
		this.cre_dt					= cre_dt				;
		this.cre_usr_id			    = cre_usr_id			;
		this.upd_dt			        = upd_dt			    ;
		this.upd_usr_id				= upd_usr_id			;
		this.chss_spec_no	        = chss_spec_no	     	;
		this.dmg_flg				= dmg_flg				;
		this.chss_als_no  	      	= chss_als_no  	     	;
		this.disp_flg		        = disp_flg		       	;
		this.ownr_co_cd			    = ownr_co_cd			;
		this.usr_co_cd				= usr_co_cd				;
		this.tml_use_flg			= tml_use_flg			;
		this.chss_sts_flg			= chss_sts_flg			;
		this.chss_act_dt			= chss_act_dt			;
		this.chss_term_flg        	= chss_term_flg      	;
		this.eai_evnt_dt     	    = eai_evnt_dt     	 	;
	}

	// getter method is proceeding ..
	public String          getIbflag          	 (){	return ibflag          	   	;	}
	public String          getPage_rows       	 (){	return page_rows       	   	;	}
	public String          getChss_no         	 (){	return chss_no         	   	;	}
	public String          getCtrt_ofc_cty_cd 	 (){	return ctrt_ofc_cty_cd 	   	;	}
	public String          getCtrt_seq			 (){	return ctrt_seq				;	}
	public String          getVndr_cnt_cd		 (){	return vndr_cnt_cd		  	;	}
	public String          getVndr_seq			 (){	return vndr_seq			  	;	}
	public String          getMgst_no			 (){	return mgst_no				;	}
	public String          getChss_tpsz_cd	  	 (){	return chss_tpsz_cd	  	   	;	}
	public String          getLstm_cd 			 (){	return lstm_cd 			  	;	}
	public String          getOfc_cd			 (){	return ofc_cd				;	}
	public String          getOnh_dt			 (){	return onh_dt				;	}
	public String          getOnh_yd_cd			 (){	return onh_yd_cd			;	}
	public String          getCrnt_yd_cd		 (){	return crnt_yd_cd		  	;	}
	public String          getLoc_cd			 (){	return loc_cd				;	}
	public String          getLcc_cd		 	 (){	return lcc_cd				;	}
	public String          getRcc_cd			 (){	return rcc_cd				;	}
	public String          getDest_yd_cd		 (){	return dest_yd_cd			;	}
	public String          getMvmt_sts_cd		 (){	return mvmt_sts_cd			;	}
	public String          getMvmt_dt			 (){	return mvmt_dt				;	}
	public String          getGate_io_cd		 (){	return gate_io_cd		  	;	}
	public String          getAciac_div_cd	  	 (){	return aciac_div_cd	  	   	;	}
	public String          getChss_in_flg		 (){	return chss_in_flg		  	;	}
	public String          getChss_tmn_flg		 (){	return chss_tmn_flg			;	}
	public String          getLst_sts_yd_cd	  	 (){	return lst_sts_yd_cd	  	;	}
	public String          getLst_sts_seq		 (){	return lst_sts_seq		  	;	}
	public String          getVeh_id			 (){	return veh_id		  	   	;	}
	public String          getChss_tit_no		 (){	return chss_tit_no		  	;	}
	public String          getTare_wgt			 (){	return tare_wgt			  	;	}
	public String          getMft_dt          	 (){	return mft_dt          	   	;	}
	public String          getLse_chss_new_usd_cd(){	return lse_chss_new_usd_cd 	;	}
	public String          getNeu_pool_chss_yd_cd(){	return neu_pool_chss_yd_cd 	;	}
	public String          getNeu_pool_cre_dt    (){	return neu_pool_cre_dt     	;	}
	public String          getCre_dt			 (){	return cre_dt				;	}
	public String          getCre_usr_id		 (){	return cre_usr_id			;	}
	public String          getUpd_dt			 (){	return upd_dt			    ;	}
	public String          getUpd_usr_id		 (){	return upd_usr_id			;	}
	public String          getChss_spec_no	     (){	return chss_spec_no	       	;	}
	public String          getDmg_flg			 (){	return dmg_flg				;	}
	public String          getChss_als_no  	     (){	return chss_als_no  	    ;	}
	public String          getDisp_flg		     (){	return disp_flg		        ;	}
	public String          getOwnr_co_cd		 (){	return ownr_co_cd			;	}
	public String          getUsr_co_cd			 (){	return usr_co_cd			;	}
	public String          getTml_use_flg		 (){	return tml_use_flg			;	}
	public String          getChss_sts_flg		 (){	return chss_sts_flg			;	}
	public String          getChss_act_dt		 (){	return chss_act_dt			;	}
	public String          getChss_term_flg      (){	return chss_term_flg       	;	}
	public String          getEai_evnt_dt     	 (){	return eai_evnt_dt     	   	;	}

	// setter method is proceeding ..
	public void setIbflag          	   ( String          ibflag          	   ){	this.ibflag          	   = ibflag          	  	;	}
	public void setPage_rows       	   ( String          page_rows       	   ){	this.page_rows       	   = page_rows       	  	;	}
	public void setChss_no         	   ( String          chss_no         	   ){	this.chss_no         	   = chss_no         	  	;	}
	public void setCtrt_ofc_cty_cd 	   ( String          ctrt_ofc_cty_cd 	   ){	this.ctrt_ofc_cty_cd 	   = ctrt_ofc_cty_cd 	  	;	}
	public void setCtrt_seq			   ( String          ctrt_seq			   ){	this.ctrt_seq			   = ctrt_seq				;	}
	public void setVndr_cnt_cd		   ( String          vndr_cnt_cd		   ){	this.vndr_cnt_cd		   = vndr_cnt_cd		  	;	}
	public void setVndr_seq			   ( String          vndr_seq			   ){	this.vndr_seq			   = vndr_seq			  	;	}
	public void setMgst_no			   ( String          mgst_no			   ){	this.mgst_no			   = mgst_no				;	}
	public void setChss_tpsz_cd	  	   ( String          chss_tpsz_cd	  	   ){	this.chss_tpsz_cd	  	   = chss_tpsz_cd	  	  	;	}
	public void setLstm_cd 			   ( String          lstm_cd 			   ){	this.lstm_cd 			   = lstm_cd 			  	;	}
	public void setOfc_cd			   ( String          ofc_cd				   ){	this.ofc_cd				   = ofc_cd				  	;	}
	public void setOnh_dt			   ( String          onh_dt				   ){	this.onh_dt				   = onh_dt				  	;	}
	public void setOnh_yd_cd		   ( String          onh_yd_cd			   ){	this.onh_yd_cd			   = onh_yd_cd		  		;	}
	public void setCrnt_yd_cd		   ( String          crnt_yd_cd		  	   ){	this.crnt_yd_cd		  	   = crnt_yd_cd		  	  	;	}
	public void setLoc_cd			   ( String          loc_cd				   ){	this.loc_cd				   = loc_cd				  	;	}
	public void setLcc_cd			   ( String          lcc_cd				   ){	this.lcc_cd				   = lcc_cd				  	;	}
	public void setRcc_cd			   ( String          rcc_cd				   ){	this.rcc_cd				   = rcc_cd				  	;	}
	public void setDest_yd_cd		   ( String          dest_yd_cd		  	   ){	this.dest_yd_cd		  	   = dest_yd_cd		  	  	;	}
	public void setMvmt_sts_cd		   ( String          mvmt_sts_cd		   ){	this.mvmt_sts_cd		   = mvmt_sts_cd			;	}
	public void setMvmt_dt			   ( String          mvmt_dt			   ){	this.mvmt_dt			   = mvmt_dt				;	}
	public void setGate_io_cd		   ( String          gate_io_cd		  	   ){	this.gate_io_cd		  	   = gate_io_cd		  	  	;	}
	public void setAciac_div_cd	  	   ( String          aciac_div_cd	  	   ){	this.aciac_div_cd	  	   = aciac_div_cd	  	  	;	}
	public void setChss_in_flg		   ( String          chss_in_flg		   ){	this.chss_in_flg		   = chss_in_flg		  	;	}
	public void setChss_tmn_flg		   ( String          chss_tmn_flg		   ){	this.chss_tmn_flg		   = chss_tmn_flg			;	}
	public void setLst_sts_yd_cd	   ( String          lst_sts_yd_cd	  	   ){	this.lst_sts_yd_cd	  	   = lst_sts_yd_cd	  		;	}
	public void setLst_sts_seq		   ( String          lst_sts_seq		   ){	this.lst_sts_seq		   = lst_sts_seq		  	;	}
	public void setVeh_id			   ( String          veh_id				   ){	this.veh_id				   = veh_id				  	;	}
	public void setChss_tit_no		   ( String          chss_tit_no		   ){	this.chss_tit_no		   = chss_tit_no		  	;	}
	public void setTare_wgt			   ( String          tare_wgt			   ){	this.tare_wgt			   = tare_wgt			  	;	}
	public void setMft_dt          	   ( String          mft_dt          	   ){	this.mft_dt          	   = mft_dt          	  	;	}
	public void setLse_chss_new_usd_cd ( String          lse_chss_new_usd_cd   ){	this.lse_chss_new_usd_cd   = lse_chss_new_usd_cd	;	}
	public void setNeu_pool_chss_yd_cd ( String          neu_pool_chss_yd_cd   ){	this.neu_pool_chss_yd_cd   = neu_pool_chss_yd_cd	;	}
	public void setNeu_pool_cre_dt     ( String          neu_pool_cre_dt       ){	this.neu_pool_cre_dt       = neu_pool_cre_dt    	;	}
	public void setCre_dt			   ( String          cre_dt				   ){	this.cre_dt				   = cre_dt					;	}
	public void setCre_usr_id		   ( String          cre_usr_id			   ){	this.cre_usr_id			   = cre_usr_id			   	;	}
	public void setUpd_dt			   ( String          upd_dt			       ){	this.upd_dt			       = upd_dt			        ;	}
	public void setUpd_usr_id		   ( String          upd_usr_id			   ){	this.upd_usr_id			   = upd_usr_id				;	}
	public void setChss_spec_no	       ( String          chss_spec_no	       ){	this.chss_spec_no	       = chss_spec_no	      	;	}
	public void setDmg_flg			   ( String          dmg_flg			   ){	this.dmg_flg			   = dmg_flg				;	}
	public void setChss_als_no  	   ( String          chss_als_no  	       ){	this.chss_als_no  	       = chss_als_no  	    	;	}
	public void setDisp_flg		       ( String          disp_flg		       ){	this.disp_flg		       = disp_flg		       	;	}
	public void setOwnr_co_cd		   ( String          ownr_co_cd			   ){	this.ownr_co_cd			   = ownr_co_cd			   	;	}
	public void setUsr_co_cd		   ( String          usr_co_cd			   ){	this.usr_co_cd			   = usr_co_cd				;	}
	public void setTml_use_flg		   ( String          tml_use_flg		   ){	this.tml_use_flg		   = tml_use_flg			;	}
	public void setChss_sts_flg		   ( String          chss_sts_flg		   ){	this.chss_sts_flg		   = chss_sts_flg			;	}
	public void setChss_act_dt		   ( String          chss_act_dt		   ){	this.chss_act_dt		   = chss_act_dt			;	}
	public void setChss_term_flg       ( String          chss_term_flg         ){	this.chss_term_flg         = chss_term_flg      	;	}
	public void setEai_evnt_dt     	   ( String          eai_evnt_dt     	   ){	this.eai_evnt_dt     	   = eai_evnt_dt     	  	;	}

	public static CHS_CHASSIS fromRequest(HttpServletRequest request) {
		CHS_CHASSIS model = new CHS_CHASSIS();
		try {
			model.setIbflag          	  	(JSPUtil.getParameter(request, "ibflag          	  		".trim(), ""));
			model.setPage_rows       	  	(JSPUtil.getParameter(request, "page_rows       	  		".trim(), ""));
			model.setChss_no         	  	(JSPUtil.getParameter(request, "chss_no         	  		".trim(), ""));
			model.setCtrt_ofc_cty_cd 	  	(JSPUtil.getParameter(request, "ctrt_ofc_cty_cd 	  		".trim(), ""));
			model.setCtrt_seq				(JSPUtil.getParameter(request, "ctrt_seq					".trim(), ""));
			model.setVndr_cnt_cd		  	(JSPUtil.getParameter(request, "vndr_cnt_cd		  	  		".trim(), ""));
			model.setVndr_seq			  	(JSPUtil.getParameter(request, "vndr_seq			  	  	".trim(), ""));
			model.setMgst_no				(JSPUtil.getParameter(request, "mgst_no				  	  	".trim(), ""));
			model.setChss_tpsz_cd	  	  	(JSPUtil.getParameter(request, "chss_tpsz_cd	  	  		".trim(), ""));
			model.setLstm_cd 			  	(JSPUtil.getParameter(request, "lstm_cd 			  	  	".trim(), ""));
			model.setOfc_cd				  	(JSPUtil.getParameter(request, "ofc_cd				  	  	".trim(), ""));
			model.setOnh_dt					(JSPUtil.getParameter(request, "onh_dt						".trim(), ""));
			model.setOnh_yd_cd			  	(JSPUtil.getParameter(request, "onh_yd_cd			  	  	".trim(), ""));
			model.setCrnt_yd_cd		  	  	(JSPUtil.getParameter(request, "crnt_yd_cd		  	  		".trim(), ""));
			model.setLoc_cd				  	(JSPUtil.getParameter(request, "loc_cd				  	  	".trim(), ""));
			model.setLcc_cd				  	(JSPUtil.getParameter(request, "lcc_cd				  	  	".trim(), ""));
			model.setRcc_cd				  	(JSPUtil.getParameter(request, "rcc_cd				  	  	".trim(), ""));
			model.setDest_yd_cd		  	  	(JSPUtil.getParameter(request, "dest_yd_cd		  	  		".trim(), ""));
			model.setMvmt_sts_cd			(JSPUtil.getParameter(request, "mvmt_sts_cd				  	".trim(), ""));
			model.setMvmt_dt				(JSPUtil.getParameter(request, "mvmt_dt				  	  	".trim(), ""));
			model.setGate_io_cd		  	  	(JSPUtil.getParameter(request, "gate_io_cd		  	  		".trim(), ""));
			model.setAciac_div_cd	  	  	(JSPUtil.getParameter(request, "aciac_div_cd	  	  		".trim(), ""));
			model.setChss_in_flg		  	(JSPUtil.getParameter(request, "chss_in_flg		  	  		".trim(), ""));
			model.setChss_tmn_flg			(JSPUtil.getParameter(request, "chss_tmn_flg			  	".trim(), ""));
			model.setLst_sts_yd_cd	  		(JSPUtil.getParameter(request, "lst_sts_yd_cd	  	  		".trim(), ""));
			model.setLst_sts_seq		  	(JSPUtil.getParameter(request, "lst_sts_seq		  	  		".trim(), ""));
			model.setVeh_id				  	(JSPUtil.getParameter(request, "veh_id				  	  	".trim(), ""));
			model.setChss_tit_no		  	(JSPUtil.getParameter(request, "chss_tit_no		  	  		".trim(), ""));
			model.setTare_wgt			  	(JSPUtil.getParameter(request, "tare_wgt			  	  	".trim(), ""));
			model.setMft_dt          	  	(JSPUtil.getParameter(request, "mft_dt          	  		".trim(), ""));
			model.setLse_chss_new_usd_cd	(JSPUtil.getParameter(request, "lse_chss_new_usd_cd 		".trim(), ""));
			model.setNeu_pool_chss_yd_cd	(JSPUtil.getParameter(request, "neu_pool_chss_yd_cd 		".trim(), ""));
			model.setNeu_pool_cre_dt    	(JSPUtil.getParameter(request, "neu_pool_cre_dt     		".trim(), ""));
			model.setCre_dt					(JSPUtil.getParameter(request, "cre_dt						".trim(), ""));
			model.setCre_usr_id			    (JSPUtil.getParameter(request, "cre_usr_id			    	".trim(), ""));
			model.setUpd_dt			        (JSPUtil.getParameter(request, "upd_dt			        	".trim(), ""));
			model.setUpd_usr_id				(JSPUtil.getParameter(request, "upd_usr_id				  	".trim(), ""));
			model.setChss_spec_no	      	(JSPUtil.getParameter(request, "chss_spec_no	      		".trim(), ""));
			model.setDmg_flg				(JSPUtil.getParameter(request, "dmg_flg						".trim(), ""));
			model.setChss_als_no  	    	(JSPUtil.getParameter(request, "chss_als_no  	      		".trim(), ""));
			model.setDisp_flg		        (JSPUtil.getParameter(request, "disp_flg		        	".trim(), ""));
			model.setOwnr_co_cd			    (JSPUtil.getParameter(request, "ownr_co_cd			    	".trim(), ""));
			model.setUsr_co_cd				(JSPUtil.getParameter(request, "usr_co_cd					".trim(), ""));
			model.setTml_use_flg			(JSPUtil.getParameter(request, "tml_use_flg			    	".trim(), ""));
			model.setChss_sts_flg			(JSPUtil.getParameter(request, "chss_sts_flg			  	".trim(), ""));
			model.setChss_act_dt			(JSPUtil.getParameter(request, "chss_act_dt				  	".trim(), ""));
			model.setChss_term_flg      	(JSPUtil.getParameter(request, "chss_term_flg       		".trim(), ""));
			model.setEai_evnt_dt     	  	(JSPUtil.getParameter(request, "eai_evnt_dt     	  		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		CHS_CHASSIS model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag          	   =  (JSPUtil.getParameter(request, "ibflag          	  		".trim(), length));
			String[] page_rows       	   =  (JSPUtil.getParameter(request, "page_rows       	  		".trim(), length));
			String[] chss_no         	   =  (JSPUtil.getParameter(request, "chss_no         	  		".trim(), length));
			String[] ctrt_ofc_cty_cd 	   =  (JSPUtil.getParameter(request, "ctrt_ofc_cty_cd 	  		".trim(), length));
			String[] ctrt_seq			   =  (JSPUtil.getParameter(request, "ctrt_seq					".trim(), length));
			String[] vndr_cnt_cd		   =  (JSPUtil.getParameter(request, "vndr_cnt_cd		  	  	".trim(), length));
			String[] vndr_seq			   =  (JSPUtil.getParameter(request, "vndr_seq			  	  	".trim(), length));
			String[] mgst_no			   =  (JSPUtil.getParameter(request, "mgst_no				  	".trim(), length));
			String[] chss_tpsz_cd	  	   =  (JSPUtil.getParameter(request, "chss_tpsz_cd	  	  		".trim(), length));
			String[] lstm_cd 			   =  (JSPUtil.getParameter(request, "lstm_cd 			  	  	".trim(), length));
			String[] ofc_cd				   =  (JSPUtil.getParameter(request, "ofc_cd				  	".trim(), length));
			String[] onh_dt				   =  (JSPUtil.getParameter(request, "onh_dt					".trim(), length));
			String[] onh_yd_cd			   =  (JSPUtil.getParameter(request, "onh_yd_cd			  	  	".trim(), length));
			String[] crnt_yd_cd		  	   =  (JSPUtil.getParameter(request, "crnt_yd_cd		  	  	".trim(), length));
			String[] loc_cd				   =  (JSPUtil.getParameter(request, "loc_cd				  	".trim(), length));
			String[] lcc_cd				   =  (JSPUtil.getParameter(request, "lcc_cd				  	".trim(), length));
			String[] rcc_cd				   =  (JSPUtil.getParameter(request, "rcc_cd				  	".trim(), length));
			String[] dest_yd_cd		  	   =  (JSPUtil.getParameter(request, "dest_yd_cd		  	  	".trim(), length));
			String[] mvmt_sts_cd		   =  (JSPUtil.getParameter(request, "mvmt_sts_cd				".trim(), length));
			String[] mvmt_dt			   =  (JSPUtil.getParameter(request, "mvmt_dt				  	".trim(), length));
			String[] gate_io_cd		  	   =  (JSPUtil.getParameter(request, "gate_io_cd		  	  	".trim(), length));
			String[] aciac_div_cd	  	   =  (JSPUtil.getParameter(request, "aciac_div_cd	  	  		".trim(), length));
			String[] chss_in_flg		   =  (JSPUtil.getParameter(request, "chss_in_flg		  	  	".trim(), length));
			String[] chss_tmn_flg		   =  (JSPUtil.getParameter(request, "chss_tmn_flg			  	".trim(), length));
			String[] lst_sts_yd_cd	  	   =  (JSPUtil.getParameter(request, "lst_sts_yd_cd	  	  		".trim(), length));
			String[] lst_sts_seq		   =  (JSPUtil.getParameter(request, "lst_sts_seq		  	  	".trim(), length));
			String[] veh_id				   =  (JSPUtil.getParameter(request, "veh_id				  	".trim(), length));
			String[] chss_tit_no		   =  (JSPUtil.getParameter(request, "chss_tit_no		  	  	".trim(), length));
			String[] tare_wgt			   =  (JSPUtil.getParameter(request, "tare_wgt			  	  	".trim(), length));
			String[] mft_dt          	   =  (JSPUtil.getParameter(request, "mft_dt          	  		".trim(), length));
			String[] lse_chss_new_usd_cd   =  (JSPUtil.getParameter(request, "lse_chss_new_usd_cd 		".trim(), length));
			String[] neu_pool_chss_yd_cd   =  (JSPUtil.getParameter(request, "neu_pool_chss_yd_cd 		".trim(), length));
			String[] neu_pool_cre_dt       =  (JSPUtil.getParameter(request, "neu_pool_cre_dt     		".trim(), length));
			String[] cre_dt				   =  (JSPUtil.getParameter(request, "cre_dt					".trim(), length));
			String[] cre_usr_id			   =  (JSPUtil.getParameter(request, "cre_usr_id			    ".trim(), length));
			String[] upd_dt			       =  (JSPUtil.getParameter(request, "upd_dt			        ".trim(), length));
			String[] upd_usr_id			   =  (JSPUtil.getParameter(request, "upd_usr_id				".trim(), length));
			String[] chss_spec_no	       =  (JSPUtil.getParameter(request, "chss_spec_no	      		".trim(), length));
			String[] dmg_flg			   =  (JSPUtil.getParameter(request, "dmg_flg					".trim(), length));
			String[] chss_als_no  	       =  (JSPUtil.getParameter(request, "chss_als_no  	      		".trim(), length));
			String[] disp_flg		       =  (JSPUtil.getParameter(request, "disp_flg		        	".trim(), length));
			String[] ownr_co_cd			   =  (JSPUtil.getParameter(request, "ownr_co_cd			    ".trim(), length));
			String[] usr_co_cd		       =  (JSPUtil.getParameter(request, "usr_co_cd					".trim(), length));
			String[] tml_use_flg		   =  (JSPUtil.getParameter(request, "tml_use_flg			    ".trim(), length));
			String[] chss_sts_flg		   =  (JSPUtil.getParameter(request, "chss_sts_flg			  	".trim(), length));
			String[] chss_act_dt		   =  (JSPUtil.getParameter(request, "chss_act_dt				".trim(), length));
			String[] chss_term_flg         =  (JSPUtil.getParameter(request, "chss_term_flg       		".trim(), length));
			String[] eai_evnt_dt     	   =  (JSPUtil.getParameter(request, "eai_evnt_dt     	  		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new CHS_CHASSIS();
				model.setIbflag          	  		  (ibflag          	  	[i]);
				model.setPage_rows       	  		  (page_rows       	  	[i]);
				model.setChss_no         	  		  (chss_no         	  	[i]);
				model.setCtrt_ofc_cty_cd 	  		  (ctrt_ofc_cty_cd 	  	[i]);
				model.setCtrt_seq					  (ctrt_seq				[i]);
				model.setVndr_cnt_cd		  		  (vndr_cnt_cd		  	[i]);
				model.setVndr_seq			  	  	  (vndr_seq			  	[i]);
				model.setMgst_no				  	  (mgst_no				[i]);
				model.setChss_tpsz_cd	  	  		  (chss_tpsz_cd	  	  	[i]);
				model.setLstm_cd 			  	  	  (lstm_cd 			  	[i]);
				model.setOfc_cd				  	  	  (ofc_cd				[i]);
				model.setOnh_dt						  (onh_dt				[i]);
				model.setOnh_yd_cd			  		  (onh_yd_cd			[i]);
				model.setCrnt_yd_cd		  	  		  (crnt_yd_cd		  	[i]);
				model.setLoc_cd				  	  	  (loc_cd				[i]);
				model.setLcc_cd				  	  	  (lcc_cd				[i]);
				model.setRcc_cd				  	  	  (rcc_cd				[i]);
				model.setDest_yd_cd		  	  		  (dest_yd_cd		  	[i]);
				model.setMvmt_sts_cd				  (mvmt_sts_cd			[i]);
				model.setMvmt_dt				  	  (mvmt_dt				[i]);
				model.setGate_io_cd		  	  		  (gate_io_cd		  	[i]);
				model.setAciac_div_cd	  	  		  (aciac_div_cd	  	  	[i]);
				model.setChss_in_flg		  		  (chss_in_flg		  	[i]);
				model.setChss_tmn_flg			  	  (chss_tmn_flg			[i]);
				model.setLst_sts_yd_cd	  			  (lst_sts_yd_cd	  	[i]);
				model.setLst_sts_seq		  		  (lst_sts_seq		  	[i]);
				model.setVeh_id				  	  	  (veh_id				[i]);
				model.setChss_tit_no		  		  (chss_tit_no		  	[i]);
				model.setTare_wgt			  	  	  (tare_wgt			  	[i]);
				model.setMft_dt          	  		  (mft_dt          	  	[i]);
				model.setLse_chss_new_usd_cd		  (lse_chss_new_usd_cd	[i]);
				model.setNeu_pool_chss_yd_cd		  (neu_pool_chss_yd_cd	[i]);
				model.setNeu_pool_cre_dt    		  (neu_pool_cre_dt    	[i]);
				model.setCre_dt						  (cre_dt				[i]);
				model.setCre_usr_id			    	  (cre_usr_id			[i]);
				model.setUpd_dt			        	  (upd_dt			    [i]);
				model.setUpd_usr_id				  	  (upd_usr_id			[i]);
				model.setChss_spec_no	      		  (chss_spec_no	      	[i]);
				model.setDmg_flg					  (dmg_flg				[i]);
				model.setChss_als_no  	    		  (chss_als_no  	    [i]);
				model.setDisp_flg		        	  (disp_flg		        [i]);
				model.setOwnr_co_cd			    	  (ownr_co_cd			[i]);
				model.setUsr_co_cd					  (usr_co_cd			[i]);
				model.setTml_use_flg			  	  (tml_use_flg			[i]);
				model.setChss_sts_flg			  	  (chss_sts_flg			[i]);
				model.setChss_act_dt				  (chss_act_dt			[i]);
				model.setChss_term_flg      		  (chss_term_flg      	[i]);
				model.setEai_evnt_dt     	  		  (eai_evnt_dt     	  	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		CHS_CHASSIS model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag          	   =  (JSPUtil.getParameter(request, prefix + "ibflag          	  		".trim(), length));
			String[] page_rows       	   =  (JSPUtil.getParameter(request, prefix + "page_rows       	  		".trim(), length));
			String[] chss_no         	   =  (JSPUtil.getParameter(request, prefix + "chss_no         	  		".trim(), length));
			String[] ctrt_ofc_cty_cd 	   =  (JSPUtil.getParameter(request, prefix + "ctrt_ofc_cty_cd 	  		".trim(), length));
			String[] ctrt_seq			   =  (JSPUtil.getParameter(request, prefix + "ctrt_seq					".trim(), length));
			String[] vndr_cnt_cd		   =  (JSPUtil.getParameter(request, prefix + "vndr_cnt_cd		  		".trim(), length));
			String[] vndr_seq			   =  (JSPUtil.getParameter(request, prefix + "vndr_seq			  	  	".trim(), length));
			String[] mgst_no			   =  (JSPUtil.getParameter(request, prefix + "mgst_no				  	".trim(), length));
			String[] chss_tpsz_cd	  	   =  (JSPUtil.getParameter(request, prefix + "chss_tpsz_cd	  	  		".trim(), length));
			String[] lstm_cd 			   =  (JSPUtil.getParameter(request, prefix + "lstm_cd 			  	  	".trim(), length));
			String[] ofc_cd				   =  (JSPUtil.getParameter(request, prefix + "ofc_cd				  	".trim(), length));
			String[] onh_dt				   =  (JSPUtil.getParameter(request, prefix + "onh_dt					".trim(), length));
			String[] onh_yd_cd			   =  (JSPUtil.getParameter(request, prefix + "onh_yd_cd			  	".trim(), length));
			String[] crnt_yd_cd		  	   =  (JSPUtil.getParameter(request, prefix + "crnt_yd_cd		  	  	".trim(), length));
			String[] loc_cd				   =  (JSPUtil.getParameter(request, prefix + "loc_cd				  	".trim(), length));
			String[] lcc_cd				   =  (JSPUtil.getParameter(request, prefix + "lcc_cd				  	".trim(), length));
			String[] rcc_cd				   =  (JSPUtil.getParameter(request, prefix + "rcc_cd				  	".trim(), length));
			String[] dest_yd_cd		  	   =  (JSPUtil.getParameter(request, prefix + "dest_yd_cd		  	  	".trim(), length));
			String[] mvmt_sts_cd		   =  (JSPUtil.getParameter(request, prefix + "mvmt_sts_cd				".trim(), length));
			String[] mvmt_dt			   =  (JSPUtil.getParameter(request, prefix + "mvmt_dt				  	".trim(), length));
			String[] gate_io_cd		  	   =  (JSPUtil.getParameter(request, prefix + "gate_io_cd		  	  	".trim(), length));
			String[] aciac_div_cd	  	   =  (JSPUtil.getParameter(request, prefix + "aciac_div_cd	  	  		".trim(), length));
			String[] chss_in_flg		   =  (JSPUtil.getParameter(request, prefix + "chss_in_flg		  		".trim(), length));
			String[] chss_tmn_flg		   =  (JSPUtil.getParameter(request, prefix + "chss_tmn_flg			  	".trim(), length));
			String[] lst_sts_yd_cd	  	   =  (JSPUtil.getParameter(request, prefix + "lst_sts_yd_cd	  		".trim(), length));
			String[] lst_sts_seq		   =  (JSPUtil.getParameter(request, prefix + "lst_sts_seq		  		".trim(), length));
			String[] veh_id				   =  (JSPUtil.getParameter(request, prefix + "veh_id				  	".trim(), length));
			String[] chss_tit_no		   =  (JSPUtil.getParameter(request, prefix + "chss_tit_no		  		".trim(), length));
			String[] tare_wgt			   =  (JSPUtil.getParameter(request, prefix + "tare_wgt			  	  	".trim(), length));
			String[] mft_dt          	   =  (JSPUtil.getParameter(request, prefix + "mft_dt          	  		".trim(), length));
			String[] lse_chss_new_usd_cd   =  (JSPUtil.getParameter(request, prefix + "lse_chss_new_usd_cd		".trim(), length));
			String[] neu_pool_chss_yd_cd   =  (JSPUtil.getParameter(request, prefix + "neu_pool_chss_yd_cd		".trim(), length));
			String[] neu_pool_cre_dt       =  (JSPUtil.getParameter(request, prefix + "neu_pool_cre_dt    		".trim(), length));
			String[] cre_dt				   =  (JSPUtil.getParameter(request, prefix + "cre_dt					".trim(), length));
			String[] cre_usr_id			   =  (JSPUtil.getParameter(request, prefix + "cre_usr_id			    ".trim(), length));
			String[] upd_dt			       =  (JSPUtil.getParameter(request, prefix + "upd_dt			        ".trim(), length));
			String[] upd_usr_id			   =  (JSPUtil.getParameter(request, prefix + "upd_usr_id				".trim(), length));
			String[] chss_spec_no	       =  (JSPUtil.getParameter(request, prefix + "chss_spec_no	      		".trim(), length));
			String[] dmg_flg			   =  (JSPUtil.getParameter(request, prefix + "dmg_flg					".trim(), length));
			String[] chss_als_no  	       =  (JSPUtil.getParameter(request, prefix + "chss_als_no  	    	".trim(), length));
			String[] disp_flg		       =  (JSPUtil.getParameter(request, prefix + "disp_flg		        	".trim(), length));
			String[] ownr_co_cd			   =  (JSPUtil.getParameter(request, prefix + "ownr_co_cd			    ".trim(), length));
			String[] usr_co_cd			   =  (JSPUtil.getParameter(request, prefix + "usr_co_cd				".trim(), length));
			String[] tml_use_flg		   =  (JSPUtil.getParameter(request, prefix + "tml_use_flg			  	".trim(), length));
			String[] chss_sts_flg		   =  (JSPUtil.getParameter(request, prefix + "chss_sts_flg			  	".trim(), length));
			String[] chss_act_dt		   =  (JSPUtil.getParameter(request, prefix + "chss_act_dt				".trim(), length));
			String[] chss_term_flg         =  (JSPUtil.getParameter(request, prefix + "chss_term_flg      		".trim(), length));
			String[] eai_evnt_dt     	   =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt     	  		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new CHS_CHASSIS();
				model.setIbflag          	  		  ( ibflag          	  	[i]);
				model.setPage_rows       	  		  ( page_rows       	  	[i]);
				model.setChss_no         	  		  ( chss_no         	  	[i]);
				model.setCtrt_ofc_cty_cd 	  		  ( ctrt_ofc_cty_cd 	  	[i]);
				model.setCtrt_seq					  ( ctrt_seq				[i]);
				model.setVndr_cnt_cd		  		  ( vndr_cnt_cd		  	  	[i]);
				model.setVndr_seq			  	  	  ( vndr_seq			  	[i]);
				model.setMgst_no				  	  ( mgst_no				  	[i]);
				model.setChss_tpsz_cd	  	  		  ( chss_tpsz_cd	  	  	[i]);
				model.setLstm_cd 			  	  	  ( lstm_cd 			  	[i]);
				model.setOfc_cd				  	  	  ( ofc_cd				  	[i]);
				model.setOnh_dt						  ( onh_dt					[i]);
				model.setOnh_yd_cd			  		  ( onh_yd_cd			  	[i]);
				model.setCrnt_yd_cd		  	  		  ( crnt_yd_cd		  	  	[i]);
				model.setLoc_cd				  	  	  ( loc_cd				  	[i]);
				model.setLcc_cd				  	  	  ( lcc_cd				  	[i]);
				model.setRcc_cd				  	  	  ( rcc_cd				  	[i]);
				model.setDest_yd_cd		  	  		  ( dest_yd_cd		  	  	[i]);
				model.setMvmt_sts_cd				  ( mvmt_sts_cd				[i]);
				model.setMvmt_dt				  	  ( mvmt_dt				  	[i]);
				model.setGate_io_cd		  	  		  ( gate_io_cd		  	  	[i]);
				model.setAciac_div_cd	  	  		  ( aciac_div_cd	  	  	[i]);
				model.setChss_in_flg		  		  ( chss_in_flg		  	  	[i]);
				model.setChss_tmn_flg			  	  ( chss_tmn_flg			[i]);
				model.setLst_sts_yd_cd	  			  ( lst_sts_yd_cd	  	  	[i]);
				model.setLst_sts_seq		  		  ( lst_sts_seq		  	  	[i]);
				model.setVeh_id				  	  	  ( veh_id				  	[i]);
				model.setChss_tit_no		  		  ( chss_tit_no		  	  	[i]);
				model.setTare_wgt			  	  	  ( tare_wgt			  	[i]);
				model.setMft_dt          	  		  ( mft_dt          	  	[i]);
				model.setLse_chss_new_usd_cd		  ( lse_chss_new_usd_cd 	[i]);
				model.setNeu_pool_chss_yd_cd		  ( neu_pool_chss_yd_cd 	[i]);
				model.setNeu_pool_cre_dt    		  ( neu_pool_cre_dt     	[i]);
				model.setCre_dt						  ( cre_dt					[i]);
				model.setCre_usr_id			    	  ( cre_usr_id			    [i]);
				model.setUpd_dt			        	  ( upd_dt			        [i]);
				model.setUpd_usr_id				  	  ( upd_usr_id				[i]);
				model.setChss_spec_no	      		  ( chss_spec_no	      	[i]);
				model.setDmg_flg					  ( dmg_flg					[i]);
				model.setChss_als_no  	    		  ( chss_als_no  	      	[i]);
				model.setDisp_flg		        	  ( disp_flg		        [i]);
				model.setOwnr_co_cd			    	  ( ownr_co_cd			    [i]);
				model.setUsr_co_cd					  ( usr_co_cd				[i]);
				model.setTml_use_flg			  	  ( tml_use_flg			    [i]);
				model.setChss_sts_flg			  	  ( chss_sts_flg			[i]);
				model.setChss_act_dt				  ( chss_act_dt				[i]);
				model.setChss_term_flg      		  ( chss_term_flg       	[i]);
				model.setEai_evnt_dt     	  		  ( eai_evnt_dt     	  	[i]);
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