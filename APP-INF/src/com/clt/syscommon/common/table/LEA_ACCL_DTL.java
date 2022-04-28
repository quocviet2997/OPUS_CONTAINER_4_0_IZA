/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : LEA_ACCL_DTL.java
*@FileTitle : Accrual Batch Result by Booking
*Open Issues :
*Change history :
*@LastModifyDate : 2007-02-14
*@LastModifier : Park Yeon Jin
*@LastVersion : 1.0
* 2007-02-14 Park Yeon Jin
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
 * @author Park Yeon Jin
 * @since J2EE 1.4
 */
public final class LEA_ACCL_DTL implements java.io.Serializable {

	private String            ibflag            = "";
	private String            page_rows         = "";
	private String            rev_yrmon         = "";
	private String            bkg_no            = "";
	private String            bkg_no_split      = "";
	private String            cntr_tpsz_cd      = "";
	private String            cost_act_grp_cd   = "";
	private String            cost_act_grp_seq  = "";
	private String            lgs_cost_cd       = "";
	private String            acct_cd           = "";
	private String            cntr_qty          = "";
	private String            vsl_cd            = "";
	private String            skd_voy_no        = "";
	private String            skd_dir_cd        = "";
	private String            rev_dir_cd        = "";
	private String            estm_vvd_tp_cd    = "";
	private String            estm_ioc_div_cd   = "";
	private String            estm_vvd_hdr_id   = "";
	private String            n1st_nod_cd       = "";
	private String            n2nd_nod_cd       = "";
	private String            n3rd_nod_cd       = "";
	private String            n4th_nod_cd       = "";
	private String            pre_estm_cost_amt = "";
	private String            pre_act_cost_amt  = "";
	private String            pre_accl_cost_amt = "";
	private String            estm_cost_amt     = "";
	private String            act_cost_amt      = "";
	private String            accl_cost_amt     = "";
	private String            accl_calc_flg     = "";
	private String            cre_dt            = "";
	private String            upd_dt            = "";

	public LEA_ACCL_DTL(){}

	public LEA_ACCL_DTL(
			String            ibflag           ,
			String            page_rows        ,
			String            rev_yrmon        ,
			String            bkg_no           ,
			String            bkg_no_split     ,
			String            cntr_tpsz_cd     ,
			String            cost_act_grp_cd  ,
			String            cost_act_grp_seq ,
			String            lgs_cost_cd      ,
			String            acct_cd          ,
			String            cntr_qty         ,
			String            vsl_cd           ,
			String            skd_voy_no       ,
			String            skd_dir_cd       ,
			String            rev_dir_cd       ,
			String            estm_vvd_tp_cd   ,
			String            estm_ioc_div_cd  ,
			String            estm_vvd_hdr_id  ,
			String            n1st_nod_cd      ,
			String            n2nd_nod_cd      ,
			String            n3rd_nod_cd      ,
			String            n4th_nod_cd      ,
			String            pre_estm_cost_amt,
			String            pre_act_cost_amt ,
			String            pre_accl_cost_amt,
			String            estm_cost_amt    ,
			String            act_cost_amt     ,
			String            accl_cost_amt    ,
			String            accl_calc_flg    ,
			String            cre_dt           ,
			String            upd_dt           ){
		this.ibflag            = ibflag           ;
		this.page_rows         = page_rows        ;
		this.rev_yrmon         = rev_yrmon        ;
		this.bkg_no            = bkg_no           ;
		this.bkg_no_split      = bkg_no_split     ;
		this.cntr_tpsz_cd      = cntr_tpsz_cd     ;
		this.cost_act_grp_cd   = cost_act_grp_cd  ;
		this.cost_act_grp_seq  = cost_act_grp_seq ;
		this.lgs_cost_cd       = lgs_cost_cd      ;
		this.acct_cd           = acct_cd          ;
		this.cntr_qty          = cntr_qty         ;
		this.vsl_cd            = vsl_cd           ;
		this.skd_voy_no        = skd_voy_no       ;
		this.skd_dir_cd        = skd_dir_cd       ;
		this.rev_dir_cd        = rev_dir_cd       ;
		this.estm_vvd_tp_cd    = estm_vvd_tp_cd   ;
		this.estm_ioc_div_cd   = estm_ioc_div_cd  ;
		this.estm_vvd_hdr_id   = estm_vvd_hdr_id  ;
		this.n1st_nod_cd       = n1st_nod_cd      ;
		this.n2nd_nod_cd       = n2nd_nod_cd      ;
		this.n3rd_nod_cd       = n3rd_nod_cd      ;
		this.n4th_nod_cd       = n4th_nod_cd      ;
		this.pre_estm_cost_amt = pre_estm_cost_amt;
		this.pre_act_cost_amt  = pre_act_cost_amt ;
		this.pre_accl_cost_amt = pre_accl_cost_amt;
		this.estm_cost_amt     = estm_cost_amt    ;
		this.act_cost_amt      = act_cost_amt     ;
		this.accl_cost_amt     = accl_cost_amt    ;
		this.accl_calc_flg     = accl_calc_flg    ;
		this.cre_dt            = cre_dt           ;
		this.upd_dt            = upd_dt           ;
	}

	// getter method is proceeding ..
	public String            getIbflag           (){	return ibflag           	;	}
	public String            getPage_rows        (){	return page_rows        	;	}
	public String            getRev_yrmon        (){	return rev_yrmon        	;	}
	public String            getBkg_no           (){	return bkg_no           	;	}
	public String            getBkg_no_split     (){	return bkg_no_split     	;	}
	public String            getCntr_tpsz_cd     (){	return cntr_tpsz_cd     	;	}
	public String            getCost_act_grp_cd  (){	return cost_act_grp_cd  	;	}
	public String            getCost_act_grp_seq (){	return cost_act_grp_seq 	;	}
	public String            getLgs_cost_cd      (){	return lgs_cost_cd      	;	}
	public String            getAcct_cd          (){	return acct_cd          	;	}
	public String            getCntr_qty         (){	return cntr_qty         	;	}
	public String            getVsl_cd           (){	return vsl_cd           	;	}
	public String            getSkd_voy_no       (){	return skd_voy_no       	;	}
	public String            getSkd_dir_cd       (){	return skd_dir_cd       	;	}
	public String            getRev_dir_cd       (){	return rev_dir_cd       	;	}
	public String            getEstm_vvd_tp_cd   (){	return estm_vvd_tp_cd   	;	}
	public String            getEstm_ioc_div_cd  (){	return estm_ioc_div_cd  	;	}
	public String            getEstm_vvd_hdr_id  (){	return estm_vvd_hdr_id  	;	}
	public String            getN1st_nod_cd      (){	return n1st_nod_cd      	;	}
	public String            getN2nd_nod_cd      (){	return n2nd_nod_cd      	;	}
	public String            getN3rd_nod_cd      (){	return n3rd_nod_cd      	;	}
	public String            getN4th_nod_cd      (){	return n4th_nod_cd      	;	}
	public String            getPre_estm_cost_amt(){	return pre_estm_cost_amt	;	}
	public String            getPre_act_cost_amt (){	return pre_act_cost_amt 	;	}
	public String            getPre_accl_cost_amt(){	return pre_accl_cost_amt	;	}
	public String            getEstm_cost_amt    (){	return estm_cost_amt    	;	}
	public String            getAct_cost_amt     (){	return act_cost_amt     	;	}
	public String            getAccl_cost_amt    (){	return accl_cost_amt    	;	}
	public String            getAccl_calc_flg    (){	return accl_calc_flg    	;	}
	public String            getCre_dt           (){	return cre_dt           	;	}
	public String            getUpd_dt           (){	return upd_dt           	;	}

	// setter method is proceeding ..
	public void setIbflag           ( String            ibflag            ){	this.ibflag            = ibflag           	;	}
	public void setPage_rows        ( String            page_rows         ){	this.page_rows         = page_rows        	;	}
	public void setRev_yrmon        ( String            rev_yrmon         ){	this.rev_yrmon         = rev_yrmon        	;	}
	public void setBkg_no           ( String            bkg_no            ){	this.bkg_no            = bkg_no           	;	}
	public void setBkg_no_split     ( String            bkg_no_split      ){	this.bkg_no_split      = bkg_no_split     	;	}
	public void setCntr_tpsz_cd     ( String            cntr_tpsz_cd      ){	this.cntr_tpsz_cd      = cntr_tpsz_cd     	;	}
	public void setCost_act_grp_cd  ( String            cost_act_grp_cd   ){	this.cost_act_grp_cd   = cost_act_grp_cd  	;	}
	public void setCost_act_grp_seq ( String            cost_act_grp_seq  ){	this.cost_act_grp_seq  = cost_act_grp_seq 	;	}
	public void setLgs_cost_cd      ( String            lgs_cost_cd       ){	this.lgs_cost_cd       = lgs_cost_cd      	;	}
	public void setAcct_cd          ( String            acct_cd           ){	this.acct_cd           = acct_cd          	;	}
	public void setCntr_qty         ( String            cntr_qty          ){	this.cntr_qty          = cntr_qty         	;	}
	public void setVsl_cd           ( String            vsl_cd            ){	this.vsl_cd            = vsl_cd           	;	}
	public void setSkd_voy_no       ( String            skd_voy_no        ){	this.skd_voy_no        = skd_voy_no       	;	}
	public void setSkd_dir_cd       ( String            skd_dir_cd        ){	this.skd_dir_cd        = skd_dir_cd       	;	}
	public void setRev_dir_cd       ( String            rev_dir_cd        ){	this.rev_dir_cd        = rev_dir_cd       	;	}
	public void setEstm_vvd_tp_cd   ( String            estm_vvd_tp_cd    ){	this.estm_vvd_tp_cd    = estm_vvd_tp_cd   	;	}
	public void setEstm_ioc_div_cd  ( String            estm_ioc_div_cd   ){	this.estm_ioc_div_cd   = estm_ioc_div_cd  	;	}
	public void setEstm_vvd_hdr_id  ( String            estm_vvd_hdr_id   ){	this.estm_vvd_hdr_id   = estm_vvd_hdr_id  	;	}
	public void setN1st_nod_cd      ( String            n1st_nod_cd       ){	this.n1st_nod_cd       = n1st_nod_cd      	;	}
	public void setN2nd_nod_cd      ( String            n2nd_nod_cd       ){	this.n2nd_nod_cd       = n2nd_nod_cd      	;	}
	public void setN3rd_nod_cd      ( String            n3rd_nod_cd       ){	this.n3rd_nod_cd       = n3rd_nod_cd      	;	}
	public void setN4th_nod_cd      ( String            n4th_nod_cd       ){	this.n4th_nod_cd       = n4th_nod_cd      	;	}
	public void setPre_estm_cost_amt( String            pre_estm_cost_amt ){	this.pre_estm_cost_amt = pre_estm_cost_amt	;	}
	public void setPre_act_cost_amt ( String            pre_act_cost_amt  ){	this.pre_act_cost_amt  = pre_act_cost_amt 	;	}
	public void setPre_accl_cost_amt( String            pre_accl_cost_amt ){	this.pre_accl_cost_amt = pre_accl_cost_amt	;	}
	public void setEstm_cost_amt    ( String            estm_cost_amt     ){	this.estm_cost_amt     = estm_cost_amt    	;	}
	public void setAct_cost_amt     ( String            act_cost_amt      ){	this.act_cost_amt      = act_cost_amt     	;	}
	public void setAccl_cost_amt    ( String            accl_cost_amt     ){	this.accl_cost_amt     = accl_cost_amt    	;	}
	public void setAccl_calc_flg    ( String            accl_calc_flg     ){	this.accl_calc_flg     = accl_calc_flg    	;	}
	public void setCre_dt           ( String            cre_dt            ){	this.cre_dt            = cre_dt           	;	}
	public void setUpd_dt           ( String            upd_dt            ){	this.upd_dt            = upd_dt           	;	}

	public static LEA_ACCL_DTL fromRequest(HttpServletRequest request) {
		LEA_ACCL_DTL model = new LEA_ACCL_DTL();
		try {
			model.setIbflag           	(JSPUtil.getParameter(request, "ibflag           		".trim(), ""));
			model.setPage_rows        	(JSPUtil.getParameter(request, "page_rows        		".trim(), ""));
			model.setRev_yrmon        	(JSPUtil.getParameter(request, "rev_yrmon        		".trim(), ""));
			model.setBkg_no           	(JSPUtil.getParameter(request, "bkg_no           		".trim(), ""));
			model.setBkg_no_split     	(JSPUtil.getParameter(request, "bkg_no_split     		".trim(), ""));
			model.setCntr_tpsz_cd     	(JSPUtil.getParameter(request, "cntr_tpsz_cd     		".trim(), ""));
			model.setCost_act_grp_cd  	(JSPUtil.getParameter(request, "cost_act_grp_cd  		".trim(), ""));
			model.setCost_act_grp_seq 	(JSPUtil.getParameter(request, "cost_act_grp_seq 		".trim(), ""));
			model.setLgs_cost_cd      	(JSPUtil.getParameter(request, "lgs_cost_cd      		".trim(), ""));
			model.setAcct_cd          	(JSPUtil.getParameter(request, "acct_cd          		".trim(), ""));
			model.setCntr_qty         	(JSPUtil.getParameter(request, "cntr_qty         		".trim(), ""));
			model.setVsl_cd           	(JSPUtil.getParameter(request, "vsl_cd           		".trim(), ""));
			model.setSkd_voy_no       	(JSPUtil.getParameter(request, "skd_voy_no       		".trim(), ""));
			model.setSkd_dir_cd       	(JSPUtil.getParameter(request, "skd_dir_cd       		".trim(), ""));
			model.setRev_dir_cd       	(JSPUtil.getParameter(request, "rev_dir_cd       		".trim(), ""));
			model.setEstm_vvd_tp_cd   	(JSPUtil.getParameter(request, "estm_vvd_tp_cd   		".trim(), ""));
			model.setEstm_ioc_div_cd  	(JSPUtil.getParameter(request, "estm_ioc_div_cd  		".trim(), ""));
			model.setEstm_vvd_hdr_id  	(JSPUtil.getParameter(request, "estm_vvd_hdr_id  		".trim(), ""));
			model.setN1st_nod_cd      	(JSPUtil.getParameter(request, "n1st_nod_cd      		".trim(), ""));
			model.setN2nd_nod_cd      	(JSPUtil.getParameter(request, "n2nd_nod_cd      		".trim(), ""));
			model.setN3rd_nod_cd      	(JSPUtil.getParameter(request, "n3rd_nod_cd      		".trim(), ""));
			model.setN4th_nod_cd      	(JSPUtil.getParameter(request, "n4th_nod_cd      		".trim(), ""));
			model.setPre_estm_cost_amt	(JSPUtil.getParameter(request, "pre_estm_cost_amt		".trim(), ""));
			model.setPre_act_cost_amt 	(JSPUtil.getParameter(request, "pre_act_cost_amt 		".trim(), ""));
			model.setPre_accl_cost_amt	(JSPUtil.getParameter(request, "pre_accl_cost_amt		".trim(), ""));
			model.setEstm_cost_amt    	(JSPUtil.getParameter(request, "estm_cost_amt    		".trim(), ""));
			model.setAct_cost_amt     	(JSPUtil.getParameter(request, "act_cost_amt     		".trim(), ""));
			model.setAccl_cost_amt    	(JSPUtil.getParameter(request, "accl_cost_amt    		".trim(), ""));
			model.setAccl_calc_flg    	(JSPUtil.getParameter(request, "accl_calc_flg    		".trim(), ""));
			model.setCre_dt           	(JSPUtil.getParameter(request, "cre_dt           		".trim(), ""));
			model.setUpd_dt           	(JSPUtil.getParameter(request, "upd_dt           		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		LEA_ACCL_DTL model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag            =  (JSPUtil.getParameter(request, "ibflag           		".trim(), length));
			String[] page_rows         =  (JSPUtil.getParameter(request, "page_rows        		".trim(), length));
			String[] rev_yrmon         =  (JSPUtil.getParameter(request, "rev_yrmon        		".trim(), length));
			String[] bkg_no            =  (JSPUtil.getParameter(request, "bkg_no           		".trim(), length));
			String[] bkg_no_split      =  (JSPUtil.getParameter(request, "bkg_no_split     		".trim(), length));
			String[] cntr_tpsz_cd      =  (JSPUtil.getParameter(request, "cntr_tpsz_cd     		".trim(), length));
			String[] cost_act_grp_cd   =  (JSPUtil.getParameter(request, "cost_act_grp_cd  		".trim(), length));
			String[] cost_act_grp_seq  =  (JSPUtil.getParameter(request, "cost_act_grp_seq 		".trim(), length));
			String[] lgs_cost_cd       =  (JSPUtil.getParameter(request, "lgs_cost_cd      		".trim(), length));
			String[] acct_cd           =  (JSPUtil.getParameter(request, "acct_cd          		".trim(), length));
			String[] cntr_qty          =  (JSPUtil.getParameter(request, "cntr_qty         		".trim(), length));
			String[] vsl_cd            =  (JSPUtil.getParameter(request, "vsl_cd           		".trim(), length));
			String[] skd_voy_no        =  (JSPUtil.getParameter(request, "skd_voy_no       		".trim(), length));
			String[] skd_dir_cd        =  (JSPUtil.getParameter(request, "skd_dir_cd       		".trim(), length));
			String[] rev_dir_cd        =  (JSPUtil.getParameter(request, "rev_dir_cd       		".trim(), length));
			String[] estm_vvd_tp_cd    =  (JSPUtil.getParameter(request, "estm_vvd_tp_cd   		".trim(), length));
			String[] estm_ioc_div_cd   =  (JSPUtil.getParameter(request, "estm_ioc_div_cd  		".trim(), length));
			String[] estm_vvd_hdr_id   =  (JSPUtil.getParameter(request, "estm_vvd_hdr_id  		".trim(), length));
			String[] n1st_nod_cd       =  (JSPUtil.getParameter(request, "n1st_nod_cd      		".trim(), length));
			String[] n2nd_nod_cd       =  (JSPUtil.getParameter(request, "n2nd_nod_cd      		".trim(), length));
			String[] n3rd_nod_cd       =  (JSPUtil.getParameter(request, "n3rd_nod_cd      		".trim(), length));
			String[] n4th_nod_cd       =  (JSPUtil.getParameter(request, "n4th_nod_cd      		".trim(), length));
			String[] pre_estm_cost_amt =  (JSPUtil.getParameter(request, "pre_estm_cost_amt		".trim(), length));
			String[] pre_act_cost_amt  =  (JSPUtil.getParameter(request, "pre_act_cost_amt 		".trim(), length));
			String[] pre_accl_cost_amt =  (JSPUtil.getParameter(request, "pre_accl_cost_amt		".trim(), length));
			String[] estm_cost_amt     =  (JSPUtil.getParameter(request, "estm_cost_amt    		".trim(), length));
			String[] act_cost_amt      =  (JSPUtil.getParameter(request, "act_cost_amt     		".trim(), length));
			String[] accl_cost_amt     =  (JSPUtil.getParameter(request, "accl_cost_amt    		".trim(), length));
			String[] accl_calc_flg     =  (JSPUtil.getParameter(request, "accl_calc_flg    		".trim(), length));
			String[] cre_dt            =  (JSPUtil.getParameter(request, "cre_dt           		".trim(), length));
			String[] upd_dt            =  (JSPUtil.getParameter(request, "upd_dt           		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new LEA_ACCL_DTL();
				model.setIbflag           		  (ibflag           	[i]);
				model.setPage_rows        		  (page_rows        	[i]);
				model.setRev_yrmon        		  (rev_yrmon        	[i]);
				model.setBkg_no           		  (bkg_no           	[i]);
				model.setBkg_no_split     		  (bkg_no_split     	[i]);
				model.setCntr_tpsz_cd     		  (cntr_tpsz_cd     	[i]);
				model.setCost_act_grp_cd  		  (cost_act_grp_cd  	[i]);
				model.setCost_act_grp_seq 		  (cost_act_grp_seq 	[i]);
				model.setLgs_cost_cd      		  (lgs_cost_cd      	[i]);
				model.setAcct_cd          		  (acct_cd          	[i]);
				model.setCntr_qty         		  (cntr_qty         	[i]);
				model.setVsl_cd           		  (vsl_cd           	[i]);
				model.setSkd_voy_no       		  (skd_voy_no       	[i]);
				model.setSkd_dir_cd       		  (skd_dir_cd       	[i]);
				model.setRev_dir_cd       		  (rev_dir_cd       	[i]);
				model.setEstm_vvd_tp_cd   		  (estm_vvd_tp_cd   	[i]);
				model.setEstm_ioc_div_cd  		  (estm_ioc_div_cd  	[i]);
				model.setEstm_vvd_hdr_id  		  (estm_vvd_hdr_id  	[i]);
				model.setN1st_nod_cd      		  (n1st_nod_cd      	[i]);
				model.setN2nd_nod_cd      		  (n2nd_nod_cd      	[i]);
				model.setN3rd_nod_cd      		  (n3rd_nod_cd      	[i]);
				model.setN4th_nod_cd      		  (n4th_nod_cd      	[i]);
				model.setPre_estm_cost_amt		  (pre_estm_cost_amt	[i]);
				model.setPre_act_cost_amt 		  (pre_act_cost_amt 	[i]);
				model.setPre_accl_cost_amt		  (pre_accl_cost_amt	[i]);
				model.setEstm_cost_amt    		  (estm_cost_amt    	[i]);
				model.setAct_cost_amt     		  (act_cost_amt     	[i]);
				model.setAccl_cost_amt    		  (accl_cost_amt    	[i]);
				model.setAccl_calc_flg    		  (accl_calc_flg    	[i]);
				model.setCre_dt           		  (cre_dt           	[i]);
				model.setUpd_dt           		  (upd_dt           	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		LEA_ACCL_DTL model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag            =  (JSPUtil.getParameter(request, prefix + "ibflag           		".trim(), length));
			String[] page_rows         =  (JSPUtil.getParameter(request, prefix + "page_rows        		".trim(), length));
			String[] rev_yrmon         =  (JSPUtil.getParameter(request, prefix + "rev_yrmon        		".trim(), length));
			String[] bkg_no            =  (JSPUtil.getParameter(request, prefix + "bkg_no           		".trim(), length));
			String[] bkg_no_split      =  (JSPUtil.getParameter(request, prefix + "bkg_no_split     		".trim(), length));
			String[] cntr_tpsz_cd      =  (JSPUtil.getParameter(request, prefix + "cntr_tpsz_cd     		".trim(), length));
			String[] cost_act_grp_cd   =  (JSPUtil.getParameter(request, prefix + "cost_act_grp_cd  		".trim(), length));
			String[] cost_act_grp_seq  =  (JSPUtil.getParameter(request, prefix + "cost_act_grp_seq 		".trim(), length));
			String[] lgs_cost_cd       =  (JSPUtil.getParameter(request, prefix + "lgs_cost_cd      		".trim(), length));
			String[] acct_cd           =  (JSPUtil.getParameter(request, prefix + "acct_cd          		".trim(), length));
			String[] cntr_qty          =  (JSPUtil.getParameter(request, prefix + "cntr_qty         		".trim(), length));
			String[] vsl_cd            =  (JSPUtil.getParameter(request, prefix + "vsl_cd           		".trim(), length));
			String[] skd_voy_no        =  (JSPUtil.getParameter(request, prefix + "skd_voy_no       		".trim(), length));
			String[] skd_dir_cd        =  (JSPUtil.getParameter(request, prefix + "skd_dir_cd       		".trim(), length));
			String[] rev_dir_cd        =  (JSPUtil.getParameter(request, prefix + "rev_dir_cd       		".trim(), length));
			String[] estm_vvd_tp_cd    =  (JSPUtil.getParameter(request, prefix + "estm_vvd_tp_cd   		".trim(), length));
			String[] estm_ioc_div_cd   =  (JSPUtil.getParameter(request, prefix + "estm_ioc_div_cd  		".trim(), length));
			String[] estm_vvd_hdr_id   =  (JSPUtil.getParameter(request, prefix + "estm_vvd_hdr_id  		".trim(), length));
			String[] n1st_nod_cd       =  (JSPUtil.getParameter(request, prefix + "n1st_nod_cd      		".trim(), length));
			String[] n2nd_nod_cd       =  (JSPUtil.getParameter(request, prefix + "n2nd_nod_cd      		".trim(), length));
			String[] n3rd_nod_cd       =  (JSPUtil.getParameter(request, prefix + "n3rd_nod_cd      		".trim(), length));
			String[] n4th_nod_cd       =  (JSPUtil.getParameter(request, prefix + "n4th_nod_cd      		".trim(), length));
			String[] pre_estm_cost_amt =  (JSPUtil.getParameter(request, prefix + "pre_estm_cost_amt		".trim(), length));
			String[] pre_act_cost_amt  =  (JSPUtil.getParameter(request, prefix + "pre_act_cost_amt 		".trim(), length));
			String[] pre_accl_cost_amt =  (JSPUtil.getParameter(request, prefix + "pre_accl_cost_amt		".trim(), length));
			String[] estm_cost_amt     =  (JSPUtil.getParameter(request, prefix + "estm_cost_amt    		".trim(), length));
			String[] act_cost_amt      =  (JSPUtil.getParameter(request, prefix + "act_cost_amt     		".trim(), length));
			String[] accl_cost_amt     =  (JSPUtil.getParameter(request, prefix + "accl_cost_amt    		".trim(), length));
			String[] accl_calc_flg     =  (JSPUtil.getParameter(request, prefix + "accl_calc_flg    		".trim(), length));
			String[] cre_dt            =  (JSPUtil.getParameter(request, prefix + "cre_dt           		".trim(), length));
			String[] upd_dt            =  (JSPUtil.getParameter(request, prefix + "upd_dt           		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new LEA_ACCL_DTL();
				model.setIbflag           		  ( ibflag           	[i]);
				model.setPage_rows        		  ( page_rows        	[i]);
				model.setRev_yrmon        		  ( rev_yrmon        	[i]);
				model.setBkg_no           		  ( bkg_no           	[i]);
				model.setBkg_no_split     		  ( bkg_no_split     	[i]);
				model.setCntr_tpsz_cd     		  ( cntr_tpsz_cd     	[i]);
				model.setCost_act_grp_cd  		  ( cost_act_grp_cd  	[i]);
				model.setCost_act_grp_seq 		  ( cost_act_grp_seq 	[i]);
				model.setLgs_cost_cd      		  ( lgs_cost_cd      	[i]);
				model.setAcct_cd          		  ( acct_cd          	[i]);
				model.setCntr_qty         		  ( cntr_qty         	[i]);
				model.setVsl_cd           		  ( vsl_cd           	[i]);
				model.setSkd_voy_no       		  ( skd_voy_no       	[i]);
				model.setSkd_dir_cd       		  ( skd_dir_cd       	[i]);
				model.setRev_dir_cd       		  ( rev_dir_cd       	[i]);
				model.setEstm_vvd_tp_cd   		  ( estm_vvd_tp_cd   	[i]);
				model.setEstm_ioc_div_cd  		  ( estm_ioc_div_cd  	[i]);
				model.setEstm_vvd_hdr_id  		  ( estm_vvd_hdr_id  	[i]);
				model.setN1st_nod_cd      		  ( n1st_nod_cd      	[i]);
				model.setN2nd_nod_cd      		  ( n2nd_nod_cd      	[i]);
				model.setN3rd_nod_cd      		  ( n3rd_nod_cd      	[i]);
				model.setN4th_nod_cd      		  ( n4th_nod_cd      	[i]);
				model.setPre_estm_cost_amt		  ( pre_estm_cost_amt	[i]);
				model.setPre_act_cost_amt 		  ( pre_act_cost_amt 	[i]);
				model.setPre_accl_cost_amt		  ( pre_accl_cost_amt	[i]);
				model.setEstm_cost_amt    		  ( estm_cost_amt    	[i]);
				model.setAct_cost_amt     		  ( act_cost_amt     	[i]);
				model.setAccl_cost_amt    		  ( accl_cost_amt    	[i]);
				model.setAccl_calc_flg    		  ( accl_calc_flg    	[i]);
				model.setCre_dt           		  ( cre_dt           	[i]);
				model.setUpd_dt           		  ( upd_dt           	[i]);
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
