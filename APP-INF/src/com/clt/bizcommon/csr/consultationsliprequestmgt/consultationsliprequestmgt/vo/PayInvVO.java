/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : TES_TML_SO_HDR.java
*@FileTitle : Off-dock CY  Invoice관리
*Open Issues :
*Change history :
*@LastModifyDate : 2007-03-05
*@LastModifier : byungheeyoo
*@LastVersion : 1.0
* 2007-03-05 byungheeyoo
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import com.clt.framework.component.common.AbstractValueObject;
import com.clt.framework.component.util.JSPUtil;

/**
 * Table Value Ojbect<br>
 * - 모든 업무에서 공통으로 사용하는 PDTO(Data Transfer Object including Parameters)<br>
 * - 관련 Event에서 작성, 서버실행요청시 PDTO의 역할을 수행하는 Value Object<br>
 *
 * @author byungheeyoo
 * @since J2EE 1.4
 */
public final class PayInvVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;

	private String              ibflag              = "";
	private String              page_rows           = "";
	private String              inv_rgst_no     	  = "";
	private String              so_ofc_cty_cd   	  = "";
	private String              so_seq          	  = "";
	private String              inv_ofc_cd          = "";
	private String              cost_ofc_cd         = "";
	private String              inv_no              = "";
	private String              err_inv_no          = "";
	private String              vndr_seq            = "";
	private String              yd_cd               = "";
	private String              curr_cd             = "";
	private String              ttl_inv_amt         = "";
	private String              vat_amt             = "";
	private String              ttl_calc_amt        = "";
	private String              fm_prd_dt           = "";
	private String              hld_flg             = "";
	private String              hld_rmk             = "";
	private String              to_prd_dt           = "";
	private String              gl_dt	       	    = "";
	private String              ttl_lss_div_cd      = "";
	private String              tml_inv_tp_cd       = "";
	private String              tml_cost_grp_cd     = "";
	private String              tml_calc_ind_cd     = "";
	private String              sto_dys_ind_cd      = "";
	private String              iss_dt              = "";
	private String              rcv_dt              = "";
	private String              eff_dt              = "";
	private String              pay_due_dt          = "";
	private String              pay_dt              = "";
	private String              pay_flg             = "";
	private String              tml_inv_sts_cd      = "";
	private String              tml_inv_rjct_sts_cd = "";
	private String              inv_cfm_dt          = "";
	private String              inv_rjct_dt         = "";
	private String              inv_rjct_rmk        = "";
	private String              csr_no              = "";
	private String              trns_slp_csr_no     = "";
	private String              trns_slp_dt         = "";
	private String              whld_tax_amt        = "";
	private String              cre_usr_id          = "";
	private String              cre_dt              = "";
	private String              upd_usr_id          = "";
	private String              upd_dt              = "";
	//추가 2009-07-28
	private String				inv_sts_cd			= "";
	private String              ofc_cd          	= "";
	private String              inv_tax_cd         	= "";
	private String              evi_tax_code        = "";
	//추가 2009-08-07
	private String				attr_ctnt1			= "";
	private String				cost_cd				= "";
	private String				cntr_tpsz_cd		= "";
	private String				gap					= "";
	//추가 2009-10-05
	private String              retval		       	= "";
	private String              clz_sts_cd	       	= "";
	private String              new_gl_dt	       	= "";
 
	public PayInvVO(){}

	public PayInvVO(
			String              ibflag             ,
			String              page_rows          ,
			String				inv_rgst_no		   ,
			String              so_ofc_cty_cd  	   ,
			String              so_seq         	   ,
			String              inv_ofc_cd         ,
			String              ofc_cd         	   ,
			String              cost_ofc_cd        ,
			String              inv_no             ,
			String              err_inv_no         ,
			String              vndr_seq           ,
			String              yd_cd              ,
			String              curr_cd            ,
			String              ttl_inv_amt        ,
			String              vat_amt            ,
			String              ttl_calc_amt       ,
			String              fm_prd_dt          ,
			String              hld_flg            ,
			String              hld_rmk            ,
			String              to_prd_dt          ,
			String              gl_dt          	   ,
			String              ttl_lss_div_cd     ,
			String              tml_inv_tp_cd      ,
			String              tml_cost_grp_cd    ,
			String              tml_calc_ind_cd    ,
			String              sto_dys_ind_cd     ,
			String              iss_dt             ,
			String              rcv_dt             ,
			String              eff_dt             ,
			String              pay_due_dt         ,
			String              pay_dt             ,
			String              pay_flg            ,
			String              tml_inv_sts_cd     ,
			String							inv_sts_cd		   	 ,
			String							inv_tax_cd		   	 ,
			String							evi_tax_code		   ,
			String							attr_ctnt1				 ,
			String							cost_cd						 ,
			String							cntr_tpsz_cd			 ,
			String				gap				   ,
			String				retval				   ,
			String				clz_sts_cd				   ,
			String				new_gl_dt				   ,
			String              tml_inv_rjct_sts_cd,
			String              inv_cfm_dt         ,
			String              inv_rjct_dt        ,
			String              inv_rjct_rmk       ,
			String              csr_no             ,
			String              trns_slp_csr_no    ,
			String              trns_slp_dt        ,
			String              whld_tax_amt       ,
			String              cre_usr_id         ,
			String              cre_dt             ,
			String              upd_usr_id         ,
			String              upd_dt             ){
		this.ibflag              = ibflag             ;
		this.page_rows           = page_rows          ;
		this.inv_rgst_no         = inv_rgst_no        ;
		this.so_ofc_cty_cd   	 = so_ofc_cty_cd  	  ;
		this.so_seq          	 = so_seq        	  ;
		this.inv_ofc_cd          = inv_ofc_cd         ;
		this.ofc_cd          	 = ofc_cd         	  ;
		this.cost_ofc_cd         = cost_ofc_cd        ;
		this.inv_no              = inv_no             ;
		this.err_inv_no          = err_inv_no         ;
		this.vndr_seq            = vndr_seq           ;
		this.yd_cd               = yd_cd              ;
		this.curr_cd             = curr_cd            ;
		this.ttl_inv_amt         = ttl_inv_amt        ;
		this.vat_amt             = vat_amt            ;
		this.ttl_calc_amt        = ttl_calc_amt       ;
		this.fm_prd_dt           = fm_prd_dt          ;
		this.hld_flg             = hld_flg            ;
		this.hld_rmk             = hld_rmk            ;
		this.to_prd_dt           = to_prd_dt          ;
		this.gl_dt           	 = gl_dt          	  ;
		this.ttl_lss_div_cd      = ttl_lss_div_cd     ;
		this.tml_inv_tp_cd       = tml_inv_tp_cd      ;
		this.tml_cost_grp_cd     = tml_cost_grp_cd    ;
		this.tml_calc_ind_cd     = tml_calc_ind_cd    ;
		this.sto_dys_ind_cd      = sto_dys_ind_cd     ;
		this.iss_dt              = iss_dt             ;
		this.rcv_dt              = rcv_dt             ;
		this.eff_dt              = eff_dt             ;
		this.pay_due_dt          = pay_due_dt         ;
		this.pay_dt              = pay_dt             ;
		this.pay_flg             = pay_flg            ;
		this.tml_inv_sts_cd      = tml_inv_sts_cd     ;
		this.inv_sts_cd			 		 = inv_sts_cd		  		;
		this.inv_tax_cd			 		 = inv_tax_cd		  		;
		this.evi_tax_code		 		 = evi_tax_code		  	;
		this.attr_ctnt1			 		 = attr_ctnt1			  	;
		this.cost_cd		 		 		 = cost_cd		  		  ;
		this.cntr_tpsz_cd		 		 = cntr_tpsz_cd		  	;
		this.gap		 		 = gap		  	;
		this.retval		 		 = retval		  	;
		this.clz_sts_cd		 	 = clz_sts_cd		  	;
		this.new_gl_dt		 	 = new_gl_dt		  	;
		this.tml_inv_rjct_sts_cd = tml_inv_rjct_sts_cd;
		this.inv_cfm_dt          = inv_cfm_dt         ;
		this.inv_rjct_dt         = inv_rjct_dt        ;
		this.inv_rjct_rmk        = inv_rjct_rmk       ;
		this.csr_no              = csr_no             ;
		this.trns_slp_csr_no     = trns_slp_csr_no    ;
		this.trns_slp_dt         = trns_slp_dt        ;
		this.whld_tax_amt        = whld_tax_amt       ;
		this.cre_usr_id          = cre_usr_id         ;
		this.cre_dt              = cre_dt             ;
		this.upd_usr_id          = upd_usr_id         ;
		this.upd_dt              = upd_dt             ;
	}

	// getter method is proceeding ..
	public String              getIbflag             (){	return ibflag             	;	}
	public String              getPage_rows          (){	return page_rows          	;	}
	public String              getInv_rgst_no  	 	 (){	return inv_rgst_no  		;	}
	public String              getSo_ofc_cty_cd  	 (){	return so_ofc_cty_cd  		;	}
	public String              getSo_seq         	 (){	return so_seq         		;	}
	public String              getInv_ofc_cd         (){	return inv_ofc_cd         	;	}
	public String              getOfc_cd         	 (){	return ofc_cd         		;	}
	public String              getCost_ofc_cd        (){	return cost_ofc_cd        	;	}
	public String              getInv_no             (){	return inv_no             	;	}
	public String              getErr_inv_no         (){	return err_inv_no         	;	}
	public String              getVndr_seq           (){	return vndr_seq           	;	}
	public String              getYd_cd              (){	return yd_cd              	;	}
	public String              getCurr_cd            (){	return curr_cd            	;	}
	public String              getTtl_inv_amt        (){	return ttl_inv_amt        	;	}
	public String              getVat_amt            (){	return vat_amt            	;	}
	public String              getTtl_calc_amt       (){	return ttl_calc_amt       	;	}
	public String              getFm_prd_dt          (){	return fm_prd_dt          	;	}
	public String              getHld_flg            (){	return hld_flg            	;	}
	public String              getHld_rmk            (){	return hld_rmk            	;	}
	public String              getTo_prd_dt          (){	return to_prd_dt          	;	}
	public String              getGl_dt	             (){	return gl_dt          		;	}
	public String              getTtl_lss_div_cd     (){	return ttl_lss_div_cd       ;	}
	public String              getTml_inv_tp_cd      (){	return tml_inv_tp_cd      	;	}
	public String              getTml_cost_grp_cd    (){	return tml_cost_grp_cd    	;	}
	public String              getTml_calc_ind_cd    (){	return tml_calc_ind_cd    	;	}
	public String              getSto_dys_ind_cd     (){	return sto_dys_ind_cd     	;	}
	public String              getIss_dt             (){	return iss_dt             	;	}
	public String              getRcv_dt             (){	return rcv_dt             	;	}
	public String              getEff_dt             (){	return eff_dt             	;	}
	public String              getPay_due_dt         (){	return pay_due_dt         	;	}
	public String              getPay_dt             (){	return pay_dt             	;	}
	public String              getPay_flg            (){	return pay_flg            	;	}
	public String              getTml_inv_sts_cd     (){	return tml_inv_sts_cd     	;	}
	public String              getInv_sts_cd     	 	 (){	return inv_sts_cd     			;	}
	public String              getInv_tax_cd     	 	 (){	return inv_tax_cd     			;	}
	public String              getEvi_tax_code     	 (){	return evi_tax_code    			;	}
	public String              getAttr_ctnt1     	 	 (){	return attr_ctnt1    			  ;	}
	public String              getCost_cd     	 		 (){	return cost_cd    					;	}
	public String              getCntr_tpsz_cd     	 (){	return cntr_tpsz_cd    			;	}
	public String              getGap		     	 (){	return gap	    			;	}
	public String              getRetval		     	 (){	return retval	    			;	}
	public String              getClz_sts_cd		     	 (){	return clz_sts_cd	    			;	}
	public String              getNew_gl_dt		     	 (){	return new_gl_dt	    			;	}
	public String              getTml_inv_rjct_sts_cd(){	return tml_inv_rjct_sts_cd	;	}
	public String              getInv_cfm_dt         (){	return inv_cfm_dt         	;	}
	public String              getInv_rjct_dt        (){	return inv_rjct_dt        	;	}
	public String              getInv_rjct_rmk       (){	return inv_rjct_rmk       	;	}
	public String              getCsr_no             (){	return csr_no             	;	}
	public String              getTrns_slp_csr_no    (){	return trns_slp_csr_no    	;	}
	public String              getTrns_slp_dt        (){	return trns_slp_dt        	;	}
	public String              getWhld_tax_amt       (){	return whld_tax_amt        	;	}
	public String              getCre_usr_id         (){	return cre_usr_id         	;	}
	public String              getCre_dt             (){	return cre_dt             	;	}
	public String              getUpd_usr_id         (){	return upd_usr_id         	;	}
	public String              getUpd_dt             (){	return upd_dt             	;	}

	// setter method is proceeding ..
	public void setIbflag             ( String              ibflag              ){	this.ibflag              = ibflag             	;	}
	public void setPage_rows          ( String              page_rows           ){	this.page_rows           = page_rows          	;	}
	public void setInv_rgst_no  	  ( String              inv_rgst_no   		){	this.inv_rgst_no   	 	 = inv_rgst_no  		;	}
	public void setSo_ofc_cty_cd  	  ( String              so_ofc_cty_cd   	){	this.so_ofc_cty_cd   	 = so_ofc_cty_cd  		;	}
	public void setSo_seq         	  ( String              so_seq          	){	this.so_seq          	 = so_seq         		;	}
	public void setInv_ofc_cd         ( String              inv_ofc_cd          ){	this.inv_ofc_cd          = inv_ofc_cd         	;	}
	public void setOfc_cd         	  ( String              ofc_cd          	){	this.ofc_cd          	 = ofc_cd         		;	}
	public void setCost_ofc_cd        ( String              cost_ofc_cd         ){	this.cost_ofc_cd         = cost_ofc_cd        	;	}
	public void setInv_no             ( String              inv_no              ){	this.inv_no              = inv_no             	;	}
	public void setErr_inv_no         ( String              err_inv_no          ){	this.err_inv_no          = err_inv_no         	;	}
	public void setVndr_seq           ( String              vndr_seq            ){	this.vndr_seq            = vndr_seq           	;	}
	public void setYd_cd              ( String              yd_cd               ){	this.yd_cd               = yd_cd              	;	}
	public void setCurr_cd            ( String              curr_cd             ){	this.curr_cd             = curr_cd            	;	}
	public void setTtl_inv_amt        ( String              ttl_inv_amt         ){	this.ttl_inv_amt         = ttl_inv_amt        	;	}
	public void setVat_amt            ( String              vat_amt             ){	this.vat_amt             = vat_amt            	;	}
	public void setTtl_calc_amt       ( String              ttl_calc_amt        ){	this.ttl_calc_amt        = ttl_calc_amt       	;	}
	public void setFm_prd_dt          ( String              fm_prd_dt           ){	this.fm_prd_dt           = fm_prd_dt          	;	}
	public void setHld_flg            ( String              hld_flg             ){	this.hld_flg             = hld_flg            	;	}
	public void setHld_rmk            ( String              hld_rmk             ){	this.hld_rmk             = hld_rmk            	;	}
	public void setTo_prd_dt          ( String              to_prd_dt           ){	this.to_prd_dt           = to_prd_dt          	;	}
	public void setGl_dt          	  ( String              gl_dt	            ){	this.gl_dt	             = gl_dt             	;	}
	public void setTtl_lss_div_cd     ( String              ttl_lss_div_cd      ){	this.ttl_lss_div_cd      = ttl_lss_div_cd     	;	}
	public void setTml_inv_tp_cd      ( String              tml_inv_tp_cd       ){	this.tml_inv_tp_cd       = tml_inv_tp_cd      	;	}
	public void setTml_cost_grp_cd    ( String              tml_cost_grp_cd     ){	this.tml_cost_grp_cd     = tml_cost_grp_cd    	;	}
	public void setTml_calc_ind_cd    ( String              tml_calc_ind_cd     ){	this.tml_calc_ind_cd     = tml_calc_ind_cd    	;	}
	public void setSto_dys_ind_cd     ( String              sto_dys_ind_cd      ){	this.sto_dys_ind_cd      = sto_dys_ind_cd     	;	}
	public void setIss_dt             ( String              iss_dt              ){	this.iss_dt              = iss_dt             	;	}
	public void setRcv_dt             ( String              rcv_dt              ){	this.rcv_dt              = rcv_dt             	;	}
	public void setEff_dt             ( String              eff_dt              ){	this.eff_dt              = eff_dt             	;	}
	public void setPay_due_dt         ( String              pay_due_dt          ){	this.pay_due_dt          = pay_due_dt         	;	}
	public void setPay_dt             ( String              pay_dt              ){	this.pay_dt              = pay_dt             	;	}
	public void setPay_flg            ( String              pay_flg             ){	this.pay_flg             = pay_flg            	;	}
	public void setTml_inv_sts_cd     ( String              tml_inv_sts_cd      ){	this.tml_inv_sts_cd      = tml_inv_sts_cd     	;	}
	public void setInv_sts_cd     	  ( String              inv_sts_cd      		){	this.inv_sts_cd      	   = inv_sts_cd     			;	}
	public void setInv_tax_cd     	  ( String              inv_tax_cd      		){	this.inv_tax_cd      	   = inv_tax_cd     			;	}
	public void setEvi_tax_code       ( String              evi_tax_code      	){	this.evi_tax_code      	 = evi_tax_code    			;	}
	public void setAttr_ctnt1       	( String              attr_ctnt1      		){	this.attr_ctnt1      	 	 = attr_ctnt1    				;	}
	public void setCost_cd       			( String              cost_cd      				){	this.cost_cd      	 		 = cost_cd    					;	}
	public void setCntr_tpsz_cd       ( String              cntr_tpsz_cd      	){	this.cntr_tpsz_cd      	 = cntr_tpsz_cd    			;	}
	public void setGap			      ( String              gap			      	){	this.gap		      	 = gap	    			;	}
	public void setRetval			      ( String              retval			      	){	this.retval		      	 = retval	    			;	}
	public void setClz_sts_cd			      ( String              clz_sts_cd			      	){	this.clz_sts_cd		      	 = clz_sts_cd	    			;	}
	public void setNew_gl_dt			      ( String              new_gl_dt			      	){	this.new_gl_dt		      	 = new_gl_dt	    			;	}
	public void setTml_inv_rjct_sts_cd( String              tml_inv_rjct_sts_cd ){	this.tml_inv_rjct_sts_cd = tml_inv_rjct_sts_cd	;	}
	public void setInv_cfm_dt         ( String              inv_cfm_dt          ){	this.inv_cfm_dt          = inv_cfm_dt         	;	}
	public void setInv_rjct_dt        ( String              inv_rjct_dt         ){	this.inv_rjct_dt         = inv_rjct_dt        	;	}
	public void setInv_rjct_rmk       ( String              inv_rjct_rmk        ){	this.inv_rjct_rmk        = inv_rjct_rmk       	;	}
	public void setCsr_no             ( String              csr_no              ){	this.csr_no              = csr_no             	;	}
	public void setTrns_slp_csr_no    ( String              trns_slp_csr_no     ){	this.trns_slp_csr_no     = trns_slp_csr_no    	;	}
	public void setTrns_slp_dt        ( String              trns_slp_dt         ){	this.trns_slp_dt         = trns_slp_dt        	;	}
	public void setWhld_tax_amt       ( String              whld_tax_amt        ){	this.whld_tax_amt        = whld_tax_amt        	;	}
	public void setCre_usr_id         ( String              cre_usr_id          ){	this.cre_usr_id          = cre_usr_id         	;	}
	public void setCre_dt             ( String              cre_dt              ){	this.cre_dt              = cre_dt             	;	}
	public void setUpd_usr_id         ( String              upd_usr_id          ){	this.upd_usr_id          = upd_usr_id         	;	}
	public void setUpd_dt             ( String              upd_dt              ){	this.upd_dt              = upd_dt             	;	}

	public static PayInvVO fromRequest(HttpServletRequest request) {
		PayInvVO model = new PayInvVO();
		try {
			model.setIbflag             	(JSPUtil.getParameter(request, "ibflag             		".trim(), ""));
			model.setPage_rows          	(JSPUtil.getParameter(request, "page_rows          		".trim(), ""));
			model.setInv_rgst_no  			(JSPUtil.getParameter(request, "inv_rgst_no  			".trim(), ""));
			model.setSo_ofc_cty_cd  		(JSPUtil.getParameter(request, "so_ofc_cty_cd  			".trim(), ""));
			model.setSo_seq         		(JSPUtil.getParameter(request, "so_seq         			".trim(), ""));
			model.setInv_ofc_cd         	(JSPUtil.getParameter(request, "inv_ofc_cd         		".trim(), ""));
			model.setOfc_cd         		(JSPUtil.getParameter(request, "ofc_cd         			".trim(), ""));
			model.setCost_ofc_cd        	(JSPUtil.getParameter(request, "cost_ofc_cd        		".trim(), ""));
			model.setInv_no             	(JSPUtil.getParameter(request, "inv_no             		".trim(), ""));
			model.setErr_inv_no         	(JSPUtil.getParameter(request, "err_inv_no         		".trim(), ""));
			model.setVndr_seq           	(JSPUtil.getParameter(request, "vndr_seq           		".trim(), ""));
			model.setYd_cd              	(JSPUtil.getParameter(request, "yd_cd              		".trim(), ""));
			model.setCurr_cd            	(JSPUtil.getParameter(request, "curr_cd            		".trim(), ""));
			model.setTtl_inv_amt        	(JSPUtil.getParameter(request, "ttl_inv_amt        		".trim(), ""));
			model.setVat_amt            	(JSPUtil.getParameter(request, "vat_amt            		".trim(), ""));
			model.setTtl_calc_amt       	(JSPUtil.getParameter(request, "ttl_calc_amt       		".trim(), ""));
			model.setFm_prd_dt          	(JSPUtil.getParameter(request, "fm_prd_dt          		".trim(), ""));
			model.setHld_flg            	(JSPUtil.getParameter(request, "hld_flg            		".trim(), ""));
			model.setHld_rmk            	(JSPUtil.getParameter(request, "hld_rmk            		".trim(), ""));
			model.setTo_prd_dt          	(JSPUtil.getParameter(request, "to_prd_dt          		".trim(), ""));
			model.setTo_prd_dt          	(JSPUtil.getParameter(request, "to_prd_dt          		".trim(), ""));
			model.setGl_dt          		(JSPUtil.getParameter(request, "gl_dt          			".trim(), ""));
			model.setTtl_lss_div_cd      	(JSPUtil.getParameter(request, "ttl_lss_div_cd      	".trim(), ""));
			model.setTml_cost_grp_cd    	(JSPUtil.getParameter(request, "tml_cost_grp_cd    		".trim(), ""));
			model.setTml_calc_ind_cd    	(JSPUtil.getParameter(request, "tml_calc_ind_cd    		".trim(), ""));
			model.setSto_dys_ind_cd     	(JSPUtil.getParameter(request, "sto_dys_ind_cd     		".trim(), ""));
			model.setIss_dt             	(JSPUtil.getParameter(request, "iss_dt             		".trim(), ""));
			model.setRcv_dt             	(JSPUtil.getParameter(request, "rcv_dt             		".trim(), ""));
			model.setEff_dt             	(JSPUtil.getParameter(request, "eff_dt             		".trim(), ""));
			model.setPay_due_dt         	(JSPUtil.getParameter(request, "pay_due_dt         		".trim(), ""));
			model.setPay_dt             	(JSPUtil.getParameter(request, "pay_dt             		".trim(), ""));
			model.setPay_flg            	(JSPUtil.getParameter(request, "pay_flg            		".trim(), ""));
			model.setTml_inv_sts_cd     	(JSPUtil.getParameter(request, "tml_inv_sts_cd     		".trim(), ""));
			model.setInv_sts_cd     			(JSPUtil.getParameter(request, "inv_sts_cd     				".trim(), ""));
			model.setInv_tax_cd     			(JSPUtil.getParameter(request, "inv_tax_cd     				".trim(), ""));
			model.setEvi_tax_code     		(JSPUtil.getParameter(request, "evi_tax_code   				".trim(), ""));
			model.setAttr_ctnt1     			(JSPUtil.getParameter(request, "attr_ctnt1   					".trim(), ""));
			model.setCost_cd     					(JSPUtil.getParameter(request, "cost_cd   						".trim(), ""));
			model.setCntr_tpsz_cd     		(JSPUtil.getParameter(request, "cntr_tpsz_cd   				".trim(), ""));
			model.setGap		     		(JSPUtil.getParameter(request, "gap		   				".trim(), ""));
			model.setRetval		     		(JSPUtil.getParameter(request, "retval		   				".trim(), ""));
			model.setClz_sts_cd		     		(JSPUtil.getParameter(request, "clz_sts_cd		   				".trim(), ""));
			model.setNew_gl_dt		     		(JSPUtil.getParameter(request, "new_gl_dt		   				".trim(), ""));
			model.setTml_inv_rjct_sts_cd	(JSPUtil.getParameter(request, "tml_inv_rjct_sts_cd		".trim(), ""));
			model.setInv_cfm_dt         	(JSPUtil.getParameter(request, "inv_cfm_dt         		".trim(), ""));
			model.setInv_rjct_dt        	(JSPUtil.getParameter(request, "inv_rjct_dt        		".trim(), ""));
			model.setInv_rjct_rmk       	(JSPUtil.getParameter(request, "inv_rjct_rmk       		".trim(), ""));
			model.setCsr_no             	(JSPUtil.getParameter(request, "csr_no             		".trim(), ""));
			model.setTrns_slp_csr_no    	(JSPUtil.getParameter(request, "trns_slp_csr_no    		".trim(), ""));
			model.setTrns_slp_dt        	(JSPUtil.getParameter(request, "trns_slp_dt        		".trim(), ""));
			model.setWhld_tax_amt        	(JSPUtil.getParameter(request, "whld_tax_amt       		".trim(), ""));
			model.setCre_usr_id         	(JSPUtil.getParameter(request, "cre_usr_id         		".trim(), ""));
			model.setCre_dt             	(JSPUtil.getParameter(request, "cre_dt             		".trim(), ""));
			model.setUpd_usr_id         	(JSPUtil.getParameter(request, "upd_usr_id         		".trim(), ""));
			model.setUpd_dt             	(JSPUtil.getParameter(request, "upd_dt             		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		PayInvVO model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag              =  (JSPUtil.getParameter(request, "ibflag             		".trim(), length));
			String[] page_rows           =  (JSPUtil.getParameter(request, "page_rows          		".trim(), length));
			String[] inv_rgst_no  		 =  (JSPUtil.getParameter(request, "inv_rgst_no  			".trim(), length));
			String[] so_ofc_cty_cd  	 =  (JSPUtil.getParameter(request, "so_ofc_cty_cd  			".trim(), length));
			String[] so_seq          	 =  (JSPUtil.getParameter(request, "so_seq         			".trim(), length));
			String[] inv_ofc_cd          =  (JSPUtil.getParameter(request, "inv_ofc_cd         		".trim(), length));
			String[] ofc_cd          	 =  (JSPUtil.getParameter(request, "ofc_cd         			".trim(), length));
			String[] cost_ofc_cd         =  (JSPUtil.getParameter(request, "cost_ofc_cd        		".trim(), length));
			String[] inv_no              =  (JSPUtil.getParameter(request, "inv_no             		".trim(), length));
			String[] err_inv_no          =  (JSPUtil.getParameter(request, "err_inv_no         		".trim(), length));
			String[] vndr_seq            =  (JSPUtil.getParameter(request, "vndr_seq           		".trim(), length));
			String[] yd_cd               =  (JSPUtil.getParameter(request, "yd_cd              		".trim(), length));
			String[] curr_cd             =  (JSPUtil.getParameter(request, "curr_cd            		".trim(), length));
			String[] ttl_inv_amt         =  (JSPUtil.getParameter(request, "ttl_inv_amt        		".trim(), length));
			String[] vat_amt             =  (JSPUtil.getParameter(request, "vat_amt            		".trim(), length));
			String[] ttl_calc_amt        =  (JSPUtil.getParameter(request, "ttl_calc_amt       		".trim(), length));
			String[] fm_prd_dt           =  (JSPUtil.getParameter(request, "fm_prd_dt          		".trim(), length));
			String[] hld_flg             =  (JSPUtil.getParameter(request, "hld_flg            		".trim(), length));
			String[] hld_rmk             =  (JSPUtil.getParameter(request, "hld_rmk            		".trim(), length));
			String[] to_prd_dt           =  (JSPUtil.getParameter(request, "to_prd_dt          		".trim(), length));
			String[] gl_dt	             =  (JSPUtil.getParameter(request, "gl_dt	          		".trim(), length));
			String[] ttl_lss_div_cd      =  (JSPUtil.getParameter(request, "ttl_lss_div_cd     		".trim(), length));
			String[] tml_inv_tp_cd       =  (JSPUtil.getParameter(request, "tml_inv_tp_cd      		".trim(), length));
			String[] tml_cost_grp_cd     =  (JSPUtil.getParameter(request, "tml_cost_grp_cd    		".trim(), length));
			String[] tml_calc_ind_cd     =  (JSPUtil.getParameter(request, "tml_calc_ind_cd    		".trim(), length));
			String[] sto_dys_ind_cd      =  (JSPUtil.getParameter(request, "sto_dys_ind_cd     		".trim(), length));
			String[] iss_dt              =  (JSPUtil.getParameter(request, "iss_dt             		".trim(), length));
			String[] rcv_dt              =  (JSPUtil.getParameter(request, "rcv_dt             		".trim(), length));
			String[] eff_dt              =  (JSPUtil.getParameter(request, "eff_dt             		".trim(), length));
			String[] pay_due_dt          =  (JSPUtil.getParameter(request, "pay_due_dt         		".trim(), length));
			String[] pay_dt              =  (JSPUtil.getParameter(request, "pay_dt             		".trim(), length));
			String[] pay_flg             =  (JSPUtil.getParameter(request, "pay_flg            		".trim(), length));
			String[] tml_inv_sts_cd      =  (JSPUtil.getParameter(request, "tml_inv_sts_cd     		".trim(), length));
			String[] inv_sts_cd      	 	 =  (JSPUtil.getParameter(request, "inv_sts_cd     				".trim(), length));
			String[] inv_tax_cd      	 	 =  (JSPUtil.getParameter(request, "inv_tax_cd     				".trim(), length));
			String[] evi_tax_code      	 =  (JSPUtil.getParameter(request, "evi_tax_code   				".trim(), length));
			String[] attr_ctnt1      	 	 =  (JSPUtil.getParameter(request, "attr_ctnt1   					".trim(), length));
			String[] cost_cd      	 		 =  (JSPUtil.getParameter(request, "cost_cd   						".trim(), length));
			String[] cntr_tpsz_cd      	 =  (JSPUtil.getParameter(request, "cntr_tpsz_cd   				".trim(), length));
			String[] gap		      	 =  (JSPUtil.getParameter(request, "gap		   				".trim(), length));
			String[] retval		      	 =  (JSPUtil.getParameter(request, "retval		   				".trim(), length));
			String[] clz_sts_cd		      	 =  (JSPUtil.getParameter(request, "clz_sts_cd		   				".trim(), length));
			String[] new_gl_dt		      	 =  (JSPUtil.getParameter(request, "new_gl_dt		   				".trim(), length));
			String[] tml_inv_rjct_sts_cd =  (JSPUtil.getParameter(request, "tml_inv_rjct_sts_cd		".trim(), length));
			String[] inv_cfm_dt          =  (JSPUtil.getParameter(request, "inv_cfm_dt         		".trim(), length));
			String[] inv_rjct_dt         =  (JSPUtil.getParameter(request, "inv_rjct_dt        		".trim(), length));
			String[] inv_rjct_rmk        =  (JSPUtil.getParameter(request, "inv_rjct_rmk       		".trim(), length));
			String[] csr_no              =  (JSPUtil.getParameter(request, "csr_no             		".trim(), length));
			String[] trns_slp_csr_no     =  (JSPUtil.getParameter(request, "trns_slp_csr_no    		".trim(), length));
			String[] trns_slp_dt         =  (JSPUtil.getParameter(request, "trns_slp_dt        		".trim(), length));
			String[] whld_tax_amt        =  (JSPUtil.getParameter(request, "whld_tax_amt       		".trim(), length));
			String[] cre_usr_id          =  (JSPUtil.getParameter(request, "cre_usr_id         		".trim(), length));
			String[] cre_dt              =  (JSPUtil.getParameter(request, "cre_dt             		".trim(), length));
			String[] upd_usr_id          =  (JSPUtil.getParameter(request, "upd_usr_id         		".trim(), length));
			String[] upd_dt              =  (JSPUtil.getParameter(request, "upd_dt             		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new PayInvVO();
				model.setIbflag             		  (ibflag             	[i]);
				model.setPage_rows          		  (page_rows          	[i]);
				model.setInv_rgst_no  		  	  	  (inv_rgst_no  		[i]);
				model.setSo_ofc_cty_cd  		  	  (so_ofc_cty_cd  		[i]);
				model.setSo_seq         		  	  (so_seq         		[i]);
				model.setInv_ofc_cd         		  (inv_ofc_cd         	[i]);
				model.setOfc_cd         		  	  (ofc_cd         		[i]);
				model.setCost_ofc_cd        		  (cost_ofc_cd        	[i]);
				model.setInv_no             		  (inv_no             	[i]);
				model.setErr_inv_no         		  (err_inv_no         	[i]);
				model.setVndr_seq           		  (vndr_seq           	[i]);
				model.setYd_cd              		  (yd_cd              	[i]);
				model.setCurr_cd            		  (curr_cd            	[i]);
				model.setTtl_inv_amt        		  (ttl_inv_amt        	[i]);
				model.setVat_amt            		  (vat_amt            	[i]);
				model.setTtl_calc_amt       		  (ttl_calc_amt       	[i]);
				model.setFm_prd_dt          		  (fm_prd_dt          	[i]);
				model.setHld_flg            		  (hld_flg            	[i]);
				model.setHld_rmk            		  (hld_rmk            	[i]);
				model.setTo_prd_dt          		  (to_prd_dt          	[i]);
				model.setGl_dt          		  	  (gl_dt          		[i]);
				model.setTtl_lss_div_cd          	  (ttl_lss_div_cd       [i]);
				model.setTml_inv_tp_cd      		  (tml_inv_tp_cd      	[i]);
				model.setTml_cost_grp_cd    		  (tml_cost_grp_cd    	[i]);
				model.setTml_calc_ind_cd    		  (tml_calc_ind_cd    	[i]);
				model.setSto_dys_ind_cd     		  (sto_dys_ind_cd     	[i]);
				model.setIss_dt             		  (iss_dt             	[i]);
				model.setRcv_dt             		  (rcv_dt             	[i]);
				model.setEff_dt             		  (eff_dt             	[i]);
				model.setPay_due_dt         		  (pay_due_dt         	[i]);
				model.setPay_dt             		  (pay_dt             	[i]);
				model.setPay_flg            		  (pay_flg            	[i]);
				model.setTml_inv_sts_cd     		  (tml_inv_sts_cd     	[i]);
				model.setInv_sts_cd     		  	  (inv_sts_cd     			[i]);
				model.setInv_tax_cd     		  	  (inv_tax_cd     			[i]);
				model.setEvi_tax_code     		  	(evi_tax_code    			[i]);
				model.setAttr_ctnt1     		  	  (attr_ctnt1    				[i]);
				model.setCost_cd     		  	  		(cost_cd    					[i]);
				model.setCntr_tpsz_cd     		  	(cntr_tpsz_cd    			[i]);
				model.setGap		     		  	 (gap	    			[i]);
				model.setRetval		     		  	 (retval	    			[i]);
				model.setClz_sts_cd		     		  	 (clz_sts_cd	    			[i]);
				model.setNew_gl_dt		     		  	 (new_gl_dt	    			[i]);
				model.setTml_inv_rjct_sts_cd		  (tml_inv_rjct_sts_cd	[i]);
				model.setInv_cfm_dt         		  (inv_cfm_dt         	[i]);
				model.setInv_rjct_dt        		  (inv_rjct_dt        	[i]);
				model.setInv_rjct_rmk       		  (inv_rjct_rmk       	[i]);
				model.setCsr_no             		  (csr_no             	[i]);
				model.setTrns_slp_csr_no    		  (trns_slp_csr_no    	[i]);
				model.setTrns_slp_dt        		  (trns_slp_dt        	[i]);
				model.setWhld_tax_amt        		  (whld_tax_amt        	[i]);
				model.setCre_usr_id         		  (cre_usr_id         	[i]);
				model.setCre_dt             		  (cre_dt             	[i]);
				model.setUpd_usr_id         		  (upd_usr_id         	[i]);
				model.setUpd_dt             		  (upd_dt             	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		PayInvVO model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag")==null?0:request.getParameterValues(prefix+"ibflag").length;
		try {
			String[] ibflag              =  (JSPUtil.getParameter(request, prefix + "ibflag             		".trim(), length));
			String[] page_rows           =  (JSPUtil.getParameter(request, prefix + "page_rows          		".trim(), length));
			String[] inv_rgst_no  	 	 =  (JSPUtil.getParameter(request, prefix + "inv_rgst_no  				".trim(), length));
			String[] so_ofc_cty_cd  	 =  (JSPUtil.getParameter(request, prefix + "so_ofc_cty_cd  			".trim(), length));
			String[] so_seq         	 =  (JSPUtil.getParameter(request, prefix + "so_seq         			".trim(), length));
			String[] inv_ofc_cd          =  (JSPUtil.getParameter(request, prefix + "inv_ofc_cd         		".trim(), length));
			String[] ofc_cd          	 =  (JSPUtil.getParameter(request, prefix + "ofc_cd         			".trim(), length));
			String[] cost_ofc_cd         =  (JSPUtil.getParameter(request, prefix + "cost_ofc_cd        		".trim(), length));
			String[] inv_no              =  (JSPUtil.getParameter(request, prefix + "inv_no             		".trim(), length));
			String[] err_inv_no          =  (JSPUtil.getParameter(request, prefix + "err_inv_no         		".trim(), length));
			String[] vndr_seq            =  (JSPUtil.getParameter(request, prefix + "vndr_seq           		".trim(), length));
			String[] yd_cd               =  (JSPUtil.getParameter(request, prefix + "yd_cd              		".trim(), length));
			String[] curr_cd             =  (JSPUtil.getParameter(request, prefix + "curr_cd            		".trim(), length));
			String[] ttl_inv_amt         =  (JSPUtil.getParameter(request, prefix + "ttl_inv_amt        		".trim(), length));
			String[] vat_amt             =  (JSPUtil.getParameter(request, prefix + "vat_amt            		".trim(), length));
			String[] ttl_calc_amt        =  (JSPUtil.getParameter(request, prefix + "ttl_calc_amt       		".trim(), length));
			String[] fm_prd_dt           =  (JSPUtil.getParameter(request, prefix + "fm_prd_dt          		".trim(), length));
			String[] hld_flg             =  (JSPUtil.getParameter(request, prefix + "hld_flg            		".trim(), length));
			String[] hld_rmk             =  (JSPUtil.getParameter(request, prefix + "hld_rmk            		".trim(), length));
			String[] to_prd_dt           =  (JSPUtil.getParameter(request, prefix + "to_prd_dt          		".trim(), length));
			String[] gl_dt		         =  (JSPUtil.getParameter(request, prefix + "gl_dt		          		".trim(), length));
			String[] ttl_lss_div_cd      =  (JSPUtil.getParameter(request, prefix + "ttl_lss_div_cd        		".trim(), length));
			String[] tml_inv_tp_cd       =  (JSPUtil.getParameter(request, prefix + "tml_inv_tp_cd      		".trim(), length));
			String[] tml_cost_grp_cd     =  (JSPUtil.getParameter(request, prefix + "tml_cost_grp_cd    		".trim(), length));
			String[] tml_calc_ind_cd     =  (JSPUtil.getParameter(request, prefix + "tml_calc_ind_cd    		".trim(), length));
			String[] sto_dys_ind_cd      =  (JSPUtil.getParameter(request, prefix + "sto_dys_ind_cd     		".trim(), length));
			String[] iss_dt              =  (JSPUtil.getParameter(request, prefix + "iss_dt             		".trim(), length));
			String[] rcv_dt              =  (JSPUtil.getParameter(request, prefix + "rcv_dt             		".trim(), length));
			String[] eff_dt              =  (JSPUtil.getParameter(request, prefix + "eff_dt             		".trim(), length));
			String[] pay_due_dt          =  (JSPUtil.getParameter(request, prefix + "pay_due_dt         		".trim(), length));
			String[] pay_dt              =  (JSPUtil.getParameter(request, prefix + "pay_dt             		".trim(), length));
			String[] pay_flg             =  (JSPUtil.getParameter(request, prefix + "pay_flg            		".trim(), length));
			String[] tml_inv_sts_cd      =  (JSPUtil.getParameter(request, prefix + "tml_inv_sts_cd     		".trim(), length));
			String[] inv_sts_cd      	 	 =  (JSPUtil.getParameter(request, prefix + "inv_sts_cd     			  ".trim(), length));
			String[] inv_tax_cd      	 	 =  (JSPUtil.getParameter(request, prefix + "inv_tax_cd     			  ".trim(), length));
			String[] evi_tax_code      	 =  (JSPUtil.getParameter(request, prefix + "evi_tax_code     			".trim(), length));
			String[] attr_ctnt1      	 	 =  (JSPUtil.getParameter(request, prefix + "attr_ctnt1     			  ".trim(), length));
			String[] cost_cd      	 		 =  (JSPUtil.getParameter(request, prefix + "cost_cd     					  ".trim(), length));
			String[] cntr_tpsz_cd      	 =  (JSPUtil.getParameter(request, prefix + "cntr_tpsz_cd     			".trim(), length));
			String[] gap		      	 =  (JSPUtil.getParameter(request, prefix + "gap		     			".trim(), length));
			String[] retval		      	 =  (JSPUtil.getParameter(request, prefix + "retval		     			".trim(), length));
			String[] clz_sts_cd		      	 =  (JSPUtil.getParameter(request, prefix + "clz_sts_cd		     			".trim(), length));
			String[] new_gl_dt		      	 =  (JSPUtil.getParameter(request, prefix + "new_gl_dt		     			".trim(), length));
			String[] tml_inv_rjct_sts_cd =  (JSPUtil.getParameter(request, prefix + "tml_inv_rjct_sts_cd		".trim(), length));
			String[] inv_cfm_dt          =  (JSPUtil.getParameter(request, prefix + "inv_cfm_dt         		".trim(), length));
			String[] inv_rjct_dt         =  (JSPUtil.getParameter(request, prefix + "inv_rjct_dt        		".trim(), length));
			String[] inv_rjct_rmk        =  (JSPUtil.getParameter(request, prefix + "inv_rjct_rmk       		".trim(), length));
			String[] csr_no              =  (JSPUtil.getParameter(request, prefix + "csr_no             		".trim(), length));
			String[] trns_slp_csr_no     =  (JSPUtil.getParameter(request, prefix + "trns_slp_csr_no    		".trim(), length));
			String[] trns_slp_dt         =  (JSPUtil.getParameter(request, prefix + "trns_slp_dt        		".trim(), length));
			String[] whld_tax_amt        =  (JSPUtil.getParameter(request, prefix + "whld_tax_amt        		".trim(), length));
			String[] cre_usr_id          =  (JSPUtil.getParameter(request, prefix + "cre_usr_id         		".trim(), length));
			String[] cre_dt              =  (JSPUtil.getParameter(request, prefix + "cre_dt             		".trim(), length));
			String[] upd_usr_id          =  (JSPUtil.getParameter(request, prefix + "upd_usr_id         		".trim(), length));
			String[] upd_dt              =  (JSPUtil.getParameter(request, prefix + "upd_dt             		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new PayInvVO();
				model.setIbflag             		  ( ibflag             	[i]);
				model.setPage_rows          		  ( page_rows          	[i]);
				model.setInv_rgst_no 		  	  	  ( inv_rgst_no  	    [i]);
				model.setSo_ofc_cty_cd  		  	  ( so_ofc_cty_cd  	    [i]);
				model.setSo_seq         		  	  ( so_seq         	    [i]);
				model.setInv_ofc_cd         		  ( inv_ofc_cd         	[i]);
				model.setOfc_cd         		  	  ( ofc_cd         		[i]);
				model.setCost_ofc_cd        		  ( cost_ofc_cd        	[i]);
				model.setInv_no             		  ( inv_no             	[i]);
				model.setErr_inv_no         		  ( err_inv_no         	[i]);
				model.setVndr_seq           		  ( vndr_seq           	[i]);
				model.setYd_cd              		  ( yd_cd              	[i]);
				model.setCurr_cd            		  ( curr_cd            	[i]);
				model.setTtl_inv_amt        		  ( ttl_inv_amt        	[i]);
				model.setVat_amt            		  ( vat_amt            	[i]);
				model.setTtl_calc_amt       		  ( ttl_calc_amt       	[i]);
				model.setFm_prd_dt          		  ( fm_prd_dt          	[i]);
				model.setHld_flg            		  ( hld_flg            	[i]);
				model.setHld_rmk            		  ( hld_rmk            	[i]);
				model.setTo_prd_dt          		  ( to_prd_dt          	[i]);
				model.setGl_dt          		  	  ( gl_dt          		[i]);
				model.setTtl_lss_div_cd          	  ( ttl_lss_div_cd      [i]);
				model.setTml_inv_tp_cd      		  ( tml_inv_tp_cd      	[i]);
				model.setTml_cost_grp_cd    		  ( tml_cost_grp_cd    	[i]);
				model.setTml_calc_ind_cd    		  ( tml_calc_ind_cd    	[i]);
				model.setSto_dys_ind_cd     		  ( sto_dys_ind_cd     	[i]);
				model.setIss_dt             		  ( iss_dt             	[i]);
				model.setRcv_dt             		  ( rcv_dt             	[i]);
				model.setEff_dt             		  ( eff_dt             	[i]);
				model.setPay_due_dt         		  ( pay_due_dt         	[i]);
				model.setPay_dt             		  ( pay_dt             	[i]);
				model.setPay_flg            		  ( pay_flg            	[i]);
				model.setTml_inv_sts_cd     		  ( tml_inv_sts_cd     	[i]);
				model.setInv_sts_cd     		  	  ( inv_sts_cd     			[i]);
				model.setInv_tax_cd     		  	  ( inv_tax_cd     			[i]);
				model.setEvi_tax_code     		  	( evi_tax_code   			[i]);
				model.setAttr_ctnt1     		  	  ( attr_ctnt1   				[i]);
				model.setCost_cd     		  	  		( cost_cd   					[i]);
				model.setCntr_tpsz_cd     		  	( cntr_tpsz_cd   			[i]);
				model.setGap		     		  	  ( gap   				[i]);
				model.setRetval		     		  	  ( retval   				[i]);
				model.setClz_sts_cd		     		  	  ( clz_sts_cd   				[i]);
				model.setNew_gl_dt		     		  	  ( new_gl_dt   				[i]);
				model.setTml_inv_rjct_sts_cd		  ( tml_inv_rjct_sts_cd	[i]);
				model.setInv_cfm_dt         		  ( inv_cfm_dt         	[i]);
				model.setInv_rjct_dt        		  ( inv_rjct_dt        	[i]);
				model.setInv_rjct_rmk       		  ( inv_rjct_rmk       	[i]);
				model.setCsr_no             		  ( csr_no             	[i]);
				model.setTrns_slp_csr_no    		  ( trns_slp_csr_no    	[i]);
				model.setTrns_slp_dt        		  ( trns_slp_dt        	[i]);
				model.setWhld_tax_amt        		  ( whld_tax_amt       	[i]);
				model.setCre_usr_id         		  ( cre_usr_id         	[i]);
				model.setCre_dt             		  ( cre_dt             	[i]);
				model.setUpd_usr_id         		  ( upd_usr_id         	[i]);
				model.setUpd_dt             		  ( upd_dt             	[i]);
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

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();

	/**
	 * hashColumnsInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("ibflag",  				getIbflag            	());
		this.hashColumns.put("page_rows",  			getPage_rows          	());
		this.hashColumns.put("inv_rgst_no",  	getInv_rgst_no   		());
		this.hashColumns.put("so_ofc_cty_cd",  	getSo_ofc_cty_cd   		());
		this.hashColumns.put("so_seq",  				getSo_seq          		());
		this.hashColumns.put("inv_ofc_cd",  		getInv_ofc_cd         	());
		this.hashColumns.put("cost_ofc_cd",  		getCost_ofc_cd        	());
		this.hashColumns.put("inv_no",  				getInv_no             	());
		this.hashColumns.put("err_inv_no",  		getErr_inv_no         	());
		this.hashColumns.put("vndr_seq",  			getVndr_seq           	());
		this.hashColumns.put("yd_cd",  					getYd_cd              	());
		this.hashColumns.put("curr_cd",  				getCurr_cd            	());
		this.hashColumns.put("ttl_inv_amt",  		getTtl_inv_amt        	());
		this.hashColumns.put("vat_amt",  				getVat_amt            	());
		this.hashColumns.put("ttl_calc_amt",  	getTtl_calc_amt       	());
		this.hashColumns.put("fm_prd_dt",  			getFm_prd_dt          	());
		this.hashColumns.put("hld_flg",  				getHld_flg            	());
		this.hashColumns.put("hld_rmk",  				getHld_rmk            	());
		this.hashColumns.put("to_prd_dt",  			getTo_prd_dt          	());
		this.hashColumns.put("gl_dt",  			getGl_dt          	());
		this.hashColumns.put("ttl_lss_div_cd",  			getTtl_lss_div_cd          	());
		this.hashColumns.put("tml_inv_tp_cd",  	getTml_inv_tp_cd      	());
		this.hashColumns.put("tml_cost_grp_cd", getTml_cost_grp_cd    	());
		this.hashColumns.put("tml_calc_ind_cd", getTml_calc_ind_cd    	());
		this.hashColumns.put("sto_dys_ind_cd",  getSto_dys_ind_cd     	());
		this.hashColumns.put("iss_dt",  				getIss_dt             	());
		this.hashColumns.put("rcv_dt",  				getRcv_dt             	());
		this.hashColumns.put("eff_dt",  				getEff_dt             	());
		this.hashColumns.put("pay_due_dt",  		getPay_due_dt         	());
		this.hashColumns.put("pay_dt",  				getPay_dt             	());
		this.hashColumns.put("pay_flg",  				getPay_flg            	());
		this.hashColumns.put("tml_inv_sts_cd",  getTml_inv_sts_cd     	());
		this.hashColumns.put("tml_inv_rjct_sts_cd",  getTml_inv_rjct_sts_cd	());
		this.hashColumns.put("inv_cfm_dt",  		getInv_cfm_dt         	());
		this.hashColumns.put("inv_rjct_dt",  		getInv_rjct_dt        	());
		this.hashColumns.put("inv_rjct_rmk",  	getInv_rjct_rmk       	());
		this.hashColumns.put("csr_no",  				getCsr_no             	());
		this.hashColumns.put("trns_slp_csr_no", getTrns_slp_csr_no    	());
		this.hashColumns.put("trns_slp_dt",  		getTrns_slp_dt        	());
		this.hashColumns.put("whld_tax_amt",  	getWhld_tax_amt       	());
		this.hashColumns.put("cre_usr_id",  		getCre_usr_id         	());
		this.hashColumns.put("cre_dt",  				getCre_dt             	());
		this.hashColumns.put("upd_usr_id",  		getUpd_usr_id         	());
		this.hashColumns.put("upd_dt",  				getUpd_dt             	());
		this.hashColumns.put("inv_sts_cd",  		getInv_sts_cd           ());
		this.hashColumns.put("inv_tax_cd",  		getInv_tax_cd           ());
		this.hashColumns.put("evi_tax_code",  	getEvi_tax_code         ());
		this.hashColumns.put("attr_ctnt1",  		getAttr_ctnt1           ());
		this.hashColumns.put("cost_cd",  				getCost_cd             	());
		this.hashColumns.put("cntr_tpsz_cd",  	getCntr_tpsz_cd         ());
		this.hashColumns.put("gap",  			getGap         ());
		this.hashColumns.put("retval",  			getRetval         ());
		this.hashColumns.put("clz_sts_cd",  			getClz_sts_cd         ());
		this.hashColumns.put("new_gl_dt",  			getNew_gl_dt         ());
		this.hashColumns.put("ofc_cd",  				getOfc_cd             	());
		return this.hashColumns;
	}

	/**
	 * hashFieldsInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("ibflag",  				getIbflag            	());
		this.hashFields.put("page_rows",  			getPage_rows          	());
		this.hashFields.put("inv_rgst_no",  	getInv_rgst_no   		());
		this.hashFields.put("so_ofc_cty_cd",  	getSo_ofc_cty_cd   		());
		this.hashFields.put("so_seq",  				getSo_seq          		());
		this.hashFields.put("inv_ofc_cd",  		getInv_ofc_cd         	());
		this.hashFields.put("cost_ofc_cd",  		getCost_ofc_cd        	());
		this.hashFields.put("inv_no",  				getInv_no             	());
		this.hashFields.put("err_inv_no",  		getErr_inv_no         	());
		this.hashFields.put("vndr_seq",  			getVndr_seq           	());
		this.hashFields.put("yd_cd",  					getYd_cd              	());
		this.hashFields.put("curr_cd",  				getCurr_cd            	());
		this.hashFields.put("ttl_inv_amt",  		getTtl_inv_amt        	());
		this.hashFields.put("vat_amt",  				getVat_amt            	());
		this.hashFields.put("ttl_calc_amt",  	getTtl_calc_amt       	());
		this.hashFields.put("fm_prd_dt",  			getFm_prd_dt          	());
		this.hashFields.put("hld_flg",  				getHld_flg            	());
		this.hashFields.put("hld_rmk",  				getHld_rmk            	());
		this.hashFields.put("to_prd_dt",  			getTo_prd_dt          	());
		this.hashFields.put("gl_dt",  			getGl_dt          	());
		this.hashFields.put("ttl_lss_div_cd",  			getTtl_lss_div_cd          	());
		this.hashFields.put("tml_inv_tp_cd",  	getTml_inv_tp_cd      	());
		this.hashFields.put("tml_cost_grp_cd", getTml_cost_grp_cd    	());
		this.hashFields.put("tml_calc_ind_cd", getTml_calc_ind_cd    	());
		this.hashFields.put("sto_dys_ind_cd",  getSto_dys_ind_cd     	());
		this.hashFields.put("iss_dt",  				getIss_dt             	());
		this.hashFields.put("rcv_dt",  				getRcv_dt             	());
		this.hashFields.put("eff_dt",  				getEff_dt             	());
		this.hashFields.put("pay_due_dt",  		getPay_due_dt         	());
		this.hashFields.put("pay_dt",  				getPay_dt             	());
		this.hashFields.put("pay_flg",  				getPay_flg            ());
		this.hashFields.put("tml_inv_sts_cd",  getTml_inv_sts_cd     	());
		this.hashFields.put("tml_inv_rjct_sts_cd",  getTml_inv_rjct_sts_cd	());
		this.hashFields.put("inv_cfm_dt",  		getInv_cfm_dt         	());
		this.hashFields.put("inv_rjct_dt",  		getInv_rjct_dt        ());
		this.hashFields.put("inv_rjct_rmk",  	getInv_rjct_rmk       	());
		this.hashFields.put("csr_no",  				getCsr_no             	());
		this.hashFields.put("trns_slp_csr_no", getTrns_slp_csr_no    	());
		this.hashFields.put("trns_slp_dt",  		getTrns_slp_dt        ());
		this.hashFields.put("whld_tax_amt",  	getWhld_tax_amt       	());
		this.hashFields.put("cre_usr_id",  		getCre_usr_id         	());
		this.hashFields.put("cre_dt",  				getCre_dt             	());
		this.hashFields.put("upd_usr_id",  		getUpd_usr_id         	());
		this.hashFields.put("upd_dt",  				getUpd_dt             	());
		this.hashFields.put("inv_sts_cd",  		getInv_sts_cd           ());
		this.hashFields.put("inv_tax_cd",  		getInv_tax_cd           ());
		this.hashFields.put("evi_tax_code",  	getEvi_tax_code         ());
		this.hashFields.put("attr_ctnt1",  		getAttr_ctnt1           ());
		this.hashFields.put("cost_cd",  			getCost_cd             	());
		this.hashFields.put("cntr_tpsz_cd",  	getCntr_tpsz_cd         ());
		this.hashFields.put("gap",  			getGap         ());
		this.hashFields.put("retval",  			getRetval         ());
		this.hashFields.put("clz_sts_cd",  			getClz_sts_cd         ());
		this.hashFields.put("new_gl_dt",  			getNew_gl_dt         ());
		this.hashFields.put("ofc_cd",  				getOfc_cd             	());
		return this.hashFields;
	}
}
