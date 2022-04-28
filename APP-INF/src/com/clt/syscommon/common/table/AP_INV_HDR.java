/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : AP_INV_HDR.java
*@FileTitle : Terminal invoice CSR Creation - Summary
*Open Issues :
*Change history :
*@LastModifyDate : 2006-12-22
*@LastModifier : jongbaemoon
*@LastVersion : 1.0
* 2006-12-22 jongbaemoon
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
 * @author jongbaemoon
 * @since J2EE 1.4
 */
public final class AP_INV_HDR implements java.io.Serializable {

	private String           ibflag           = "";
	private String           page_rows        = "";
	private String           csr_no           = "";
	private String           csr_tp_cd        = "";
	private String           inv_dt           = "";
	private String           inv_term_dt      = "";
	private String           gl_dt            = "";
	private String           vndr_no          = "";
	private String           csr_amt          = "";
	private String           pay_amt          = "";
	private String           pay_dt           = "";
	private String           csr_curr_cd      = "";
	private String           vndr_term_nm     = "";
	private String           inv_desc         = "";
	private String           attr_cate_nm     = "";
	private String           attr_ctnt1       = "";
	private String           attr_ctnt2       = "";
	private String           attr_ctnt3       = "";
	private String           attr_ctnt4       = "";
	private String           attr_ctnt5       = "";
	private String           attr_ctnt6       = "";
	private String           attr_ctnt7       = "";
	private String           attr_ctnt8       = "";
	private String           attr_ctnt9       = "";
	private String           attr_ctnt10      = "";
	private String           attr_ctnt11      = "";
	private String           attr_ctnt12      = "";
	private String           attr_ctnt13      = "";
	private String           attr_ctnt14      = "";
	private String           attr_ctnt15      = "";
	private String           glo_attr_ctnt1   = "";
	private String           glo_attr_ctnt2   = "";
	private String           glo_attr_ctnt3   = "";
	private String           glo_attr_ctnt4   = "";
	private String           glo_attr_ctnt5   = "";
	private String           glo_attr_ctnt6   = "";
	private String           glo_attr_ctnt7   = "";
	private String           glo_attr_ctnt8   = "";
	private String           glo_attr_ctnt9   = "";
	private String           glo_attr_ctnt10  = "";
	private String           glo_attr_ctnt11  = "";
	private String           glo_attr_ctnt12  = "";
	private String           glo_attr_ctnt13  = "";
	private String           glo_attr_ctnt14  = "";
	private String           glo_attr_ctnt15  = "";
	private String           glo_attr_ctnt16  = "";
	private String           glo_attr_ctnt17  = "";
	private String           glo_attr_ctnt18  = "";
	private String           src_ctnt         = "";
	private String           pay_mzd_lu_cd    = "";
	private String           pay_grp_lu_cd    = "";
	private String           coa_co_cd        = "";
	private String           coa_rgn_cd       = "";
	private String           coa_ctr_cd       = "";
	private String           coa_acct_cd      = "";
	private String           coa_vvd_cd       = "";
	private String           coa_inter_co_cd  = "";
	private String           coa_ftu_n1st_cd  = "";
	private String           coa_ftu_n2nd_cd  = "";
	private String           ppd_no           = "";
	private String           ppd_dtrb_no      = "";
	private String           ppd_aply_amt     = "";
	private String           ppd_gl_dt        = "";
	private String           apro_flg         = "";
	private String           tax_decl_flg     = "";
	private String           err_csr_no       = "";
	private String           if_flg           = "";
	private String           if_dt            = "";
	private String           if_err_rsn       = "";
	private String           ppay_aply_flg    = "";
	private String           tj_ofc_cd        = "";
	private String           act_xch_rt       = "";
	private String           imp_err_flg      = "";
	private String           rcv_err_flg      = "";
	private String           tax_curr_xch_flg = "";
	private String           usr_eml          = "";
	private String           imp_err_rsn      = "";
	private String           rcv_err_rsn      = "";
	private String           ftu_use_ctnt1    = "";
	private String           ftu_use_ctnt2    = "";
	private String           ftu_use_ctnt3    = "";
	private String           ftu_use_ctnt4    = "";
	private String           ftu_use_ctnt5    = "";
	private String           cre_dt           = "";
	private String           cre_usr_id       = "";
	private String           eai_evnt_dt      = "";

	public AP_INV_HDR(){}

	public AP_INV_HDR(
			String           ibflag          ,
			String           page_rows       ,
			String           csr_no          ,
			String           csr_tp_cd       ,
			String           inv_dt          ,
			String           inv_term_dt     ,
			String           gl_dt           ,
			String           vndr_no         ,
			String           csr_amt         ,
			String           pay_amt         ,
			String           pay_dt          ,
			String           csr_curr_cd     ,
			String           vndr_term_nm    ,
			String           inv_desc        ,
			String           attr_cate_nm    ,
			String           attr_ctnt1      ,
			String           attr_ctnt2      ,
			String           attr_ctnt3      ,
			String           attr_ctnt4      ,
			String           attr_ctnt5      ,
			String           attr_ctnt6      ,
			String           attr_ctnt7      ,
			String           attr_ctnt8      ,
			String           attr_ctnt9      ,
			String           attr_ctnt10     ,
			String           attr_ctnt11     ,
			String           attr_ctnt12     ,
			String           attr_ctnt13     ,
			String           attr_ctnt14     ,
			String           attr_ctnt15     ,
			String           glo_attr_ctnt1  ,
			String           glo_attr_ctnt2  ,
			String           glo_attr_ctnt3  ,
			String           glo_attr_ctnt4  ,
			String           glo_attr_ctnt5  ,
			String           glo_attr_ctnt6  ,
			String           glo_attr_ctnt7  ,
			String           glo_attr_ctnt8  ,
			String           glo_attr_ctnt9  ,
			String           glo_attr_ctnt10 ,
			String           glo_attr_ctnt11 ,
			String           glo_attr_ctnt12 ,
			String           glo_attr_ctnt13 ,
			String           glo_attr_ctnt14 ,
			String           glo_attr_ctnt15 ,
			String           glo_attr_ctnt16 ,
			String           glo_attr_ctnt17 ,
			String           glo_attr_ctnt18 ,
			String           src_ctnt        ,
			String           pay_mzd_lu_cd   ,
			String           pay_grp_lu_cd   ,
			String           coa_co_cd       ,
			String           coa_rgn_cd      ,
			String           coa_ctr_cd      ,
			String           coa_acct_cd     ,
			String           coa_vvd_cd      ,
			String           coa_inter_co_cd ,
			String           coa_ftu_n1st_cd ,
			String           coa_ftu_n2nd_cd ,
			String           ppd_no          ,
			String           ppd_dtrb_no     ,
			String           ppd_aply_amt    ,
			String           ppd_gl_dt       ,
			String           apro_flg        ,
			String           tax_decl_flg    ,
			String           err_csr_no      ,
			String           if_flg          ,
			String           if_dt           ,
			String           if_err_rsn      ,
			String           ppay_aply_flg   ,
			String           tj_ofc_cd       ,
			String           act_xch_rt      ,
			String           imp_err_flg     ,
			String           rcv_err_flg     ,
			String           tax_curr_xch_flg,
			String           usr_eml         ,
			String           imp_err_rsn     ,
			String           rcv_err_rsn     ,
			String           ftu_use_ctnt1   ,
			String           ftu_use_ctnt2   ,
			String           ftu_use_ctnt3   ,
			String           ftu_use_ctnt4   ,
			String           ftu_use_ctnt5   ,
			String           cre_dt          ,
			String           cre_usr_id      ,
			String           eai_evnt_dt     ){
		this.ibflag           = ibflag          ;
		this.page_rows        = page_rows       ;
		this.csr_no           = csr_no          ;
		this.csr_tp_cd        = csr_tp_cd       ;
		this.inv_dt           = inv_dt          ;
		this.inv_term_dt      = inv_term_dt     ;
		this.gl_dt            = gl_dt           ;
		this.vndr_no          = vndr_no         ;
		this.csr_amt          = csr_amt         ;
		this.pay_amt          = pay_amt         ;
		this.pay_dt           = pay_dt          ;
		this.csr_curr_cd      = csr_curr_cd     ;
		this.vndr_term_nm     = vndr_term_nm    ;
		this.inv_desc         = inv_desc        ;
		this.attr_cate_nm     = attr_cate_nm    ;
		this.attr_ctnt1       = attr_ctnt1      ;
		this.attr_ctnt2       = attr_ctnt2      ;
		this.attr_ctnt3       = attr_ctnt3      ;
		this.attr_ctnt4       = attr_ctnt4      ;
		this.attr_ctnt5       = attr_ctnt5      ;
		this.attr_ctnt6       = attr_ctnt6      ;
		this.attr_ctnt7       = attr_ctnt7      ;
		this.attr_ctnt8       = attr_ctnt8      ;
		this.attr_ctnt9       = attr_ctnt9      ;
		this.attr_ctnt10      = attr_ctnt10     ;
		this.attr_ctnt11      = attr_ctnt11     ;
		this.attr_ctnt12      = attr_ctnt12     ;
		this.attr_ctnt13      = attr_ctnt13     ;
		this.attr_ctnt14      = attr_ctnt14     ;
		this.attr_ctnt15      = attr_ctnt15     ;
		this.glo_attr_ctnt1   = glo_attr_ctnt1  ;
		this.glo_attr_ctnt2   = glo_attr_ctnt2  ;
		this.glo_attr_ctnt3   = glo_attr_ctnt3  ;
		this.glo_attr_ctnt4   = glo_attr_ctnt4  ;
		this.glo_attr_ctnt5   = glo_attr_ctnt5  ;
		this.glo_attr_ctnt6   = glo_attr_ctnt6  ;
		this.glo_attr_ctnt7   = glo_attr_ctnt7  ;
		this.glo_attr_ctnt8   = glo_attr_ctnt8  ;
		this.glo_attr_ctnt9   = glo_attr_ctnt9  ;
		this.glo_attr_ctnt10  = glo_attr_ctnt10 ;
		this.glo_attr_ctnt11  = glo_attr_ctnt11 ;
		this.glo_attr_ctnt12  = glo_attr_ctnt12 ;
		this.glo_attr_ctnt13  = glo_attr_ctnt13 ;
		this.glo_attr_ctnt14  = glo_attr_ctnt14 ;
		this.glo_attr_ctnt15  = glo_attr_ctnt15 ;
		this.glo_attr_ctnt16  = glo_attr_ctnt16 ;
		this.glo_attr_ctnt17  = glo_attr_ctnt17 ;
		this.glo_attr_ctnt18  = glo_attr_ctnt18 ;
		this.src_ctnt         = src_ctnt        ;
		this.pay_mzd_lu_cd    = pay_mzd_lu_cd   ;
		this.pay_grp_lu_cd    = pay_grp_lu_cd   ;
		this.coa_co_cd        = coa_co_cd       ;
		this.coa_rgn_cd       = coa_rgn_cd      ;
		this.coa_ctr_cd       = coa_ctr_cd      ;
		this.coa_acct_cd      = coa_acct_cd     ;
		this.coa_vvd_cd       = coa_vvd_cd      ;
		this.coa_inter_co_cd  = coa_inter_co_cd ;
		this.coa_ftu_n1st_cd  = coa_ftu_n1st_cd ;
		this.coa_ftu_n2nd_cd  = coa_ftu_n2nd_cd ;
		this.ppd_no           = ppd_no          ;
		this.ppd_dtrb_no      = ppd_dtrb_no     ;
		this.ppd_aply_amt     = ppd_aply_amt    ;
		this.ppd_gl_dt        = ppd_gl_dt       ;
		this.apro_flg         = apro_flg        ;
		this.tax_decl_flg     = tax_decl_flg    ;
		this.err_csr_no       = err_csr_no      ;
		this.if_flg           = if_flg          ;
		this.if_dt            = if_dt           ;
		this.if_err_rsn       = if_err_rsn      ;
		this.ppay_aply_flg    = ppay_aply_flg   ;
		this.tj_ofc_cd        = tj_ofc_cd       ;
		this.act_xch_rt       = act_xch_rt      ;
		this.imp_err_flg      = imp_err_flg     ;
		this.rcv_err_flg      = rcv_err_flg     ;
		this.tax_curr_xch_flg = tax_curr_xch_flg;
		this.usr_eml          = usr_eml         ;
		this.imp_err_rsn      = imp_err_rsn     ;
		this.rcv_err_rsn      = rcv_err_rsn     ;
		this.ftu_use_ctnt1    = ftu_use_ctnt1   ;
		this.ftu_use_ctnt2    = ftu_use_ctnt2   ;
		this.ftu_use_ctnt3    = ftu_use_ctnt3   ;
		this.ftu_use_ctnt4    = ftu_use_ctnt4   ;
		this.ftu_use_ctnt5    = ftu_use_ctnt5   ;
		this.cre_dt           = cre_dt          ;
		this.cre_usr_id       = cre_usr_id      ;
		this.eai_evnt_dt      = eai_evnt_dt     ;
	}

	// getter method is proceeding ..
	public String           getIbflag          (){	return ibflag          	;	}
	public String           getPage_rows       (){	return page_rows       	;	}
	public String           getCsr_no          (){	return csr_no          	;	}
	public String           getCsr_tp_cd       (){	return csr_tp_cd       	;	}
	public String           getInv_dt          (){	return inv_dt          	;	}
	public String           getInv_term_dt     (){	return inv_term_dt     	;	}
	public String           getGl_dt           (){	return gl_dt           	;	}
	public String           getVndr_no         (){	return vndr_no         	;	}
	public String           getCsr_amt         (){	return csr_amt         	;	}
	public String           getPay_amt         (){	return pay_amt         	;	}
	public String           getPay_dt          (){	return pay_dt          	;	}
	public String           getCsr_curr_cd     (){	return csr_curr_cd     	;	}
	public String           getVndr_term_nm    (){	return vndr_term_nm    	;	}
	public String           getInv_desc        (){	return inv_desc        	;	}
	public String           getAttr_cate_nm    (){	return attr_cate_nm    	;	}
	public String           getAttr_ctnt1      (){	return attr_ctnt1      	;	}
	public String           getAttr_ctnt2      (){	return attr_ctnt2      	;	}
	public String           getAttr_ctnt3      (){	return attr_ctnt3      	;	}
	public String           getAttr_ctnt4      (){	return attr_ctnt4      	;	}
	public String           getAttr_ctnt5      (){	return attr_ctnt5      	;	}
	public String           getAttr_ctnt6      (){	return attr_ctnt6      	;	}
	public String           getAttr_ctnt7      (){	return attr_ctnt7      	;	}
	public String           getAttr_ctnt8      (){	return attr_ctnt8      	;	}
	public String           getAttr_ctnt9      (){	return attr_ctnt9      	;	}
	public String           getAttr_ctnt10     (){	return attr_ctnt10     	;	}
	public String           getAttr_ctnt11     (){	return attr_ctnt11     	;	}
	public String           getAttr_ctnt12     (){	return attr_ctnt12     	;	}
	public String           getAttr_ctnt13     (){	return attr_ctnt13     	;	}
	public String           getAttr_ctnt14     (){	return attr_ctnt14     	;	}
	public String           getAttr_ctnt15     (){	return attr_ctnt15     	;	}
	public String           getGlo_attr_ctnt1  (){	return glo_attr_ctnt1  	;	}
	public String           getGlo_attr_ctnt2  (){	return glo_attr_ctnt2  	;	}
	public String           getGlo_attr_ctnt3  (){	return glo_attr_ctnt3  	;	}
	public String           getGlo_attr_ctnt4  (){	return glo_attr_ctnt4  	;	}
	public String           getGlo_attr_ctnt5  (){	return glo_attr_ctnt5  	;	}
	public String           getGlo_attr_ctnt6  (){	return glo_attr_ctnt6  	;	}
	public String           getGlo_attr_ctnt7  (){	return glo_attr_ctnt7  	;	}
	public String           getGlo_attr_ctnt8  (){	return glo_attr_ctnt8  	;	}
	public String           getGlo_attr_ctnt9  (){	return glo_attr_ctnt9  	;	}
	public String           getGlo_attr_ctnt10 (){	return glo_attr_ctnt10 	;	}
	public String           getGlo_attr_ctnt11 (){	return glo_attr_ctnt11 	;	}
	public String           getGlo_attr_ctnt12 (){	return glo_attr_ctnt12 	;	}
	public String           getGlo_attr_ctnt13 (){	return glo_attr_ctnt13 	;	}
	public String           getGlo_attr_ctnt14 (){	return glo_attr_ctnt14 	;	}
	public String           getGlo_attr_ctnt15 (){	return glo_attr_ctnt15 	;	}
	public String           getGlo_attr_ctnt16 (){	return glo_attr_ctnt16 	;	}
	public String           getGlo_attr_ctnt17 (){	return glo_attr_ctnt17 	;	}
	public String           getGlo_attr_ctnt18 (){	return glo_attr_ctnt18 	;	}
	public String           getSrc_ctnt        (){	return src_ctnt        	;	}
	public String           getPay_mzd_lu_cd   (){	return pay_mzd_lu_cd   	;	}
	public String           getPay_grp_lu_cd   (){	return pay_grp_lu_cd   	;	}
	public String           getCoa_co_cd       (){	return coa_co_cd       	;	}
	public String           getCoa_rgn_cd      (){	return coa_rgn_cd      	;	}
	public String           getCoa_ctr_cd      (){	return coa_ctr_cd      	;	}
	public String           getCoa_acct_cd     (){	return coa_acct_cd     	;	}
	public String           getCoa_vvd_cd      (){	return coa_vvd_cd      	;	}
	public String           getCoa_inter_co_cd (){	return coa_inter_co_cd 	;	}
	public String           getCoa_ftu_n1st_cd (){	return coa_ftu_n1st_cd 	;	}
	public String           getCoa_ftu_n2nd_cd (){	return coa_ftu_n2nd_cd 	;	}
	public String           getPpd_no          (){	return ppd_no          	;	}
	public String           getPpd_dtrb_no     (){	return ppd_dtrb_no     	;	}
	public String           getPpd_aply_amt    (){	return ppd_aply_amt    	;	}
	public String           getPpd_gl_dt       (){	return ppd_gl_dt       	;	}
	public String           getApro_flg        (){	return apro_flg        	;	}
	public String           getTax_decl_flg    (){	return tax_decl_flg    	;	}
	public String           getErr_csr_no      (){	return err_csr_no      	;	}
	public String           getIf_flg          (){	return if_flg          	;	}
	public String           getIf_dt           (){	return if_dt           	;	}
	public String           getIf_err_rsn      (){	return if_err_rsn      	;	}
	public String           getPpay_aply_flg   (){	return ppay_aply_flg   	;	}
	public String           getTj_ofc_cd       (){	return tj_ofc_cd       	;	}
	public String           getAct_xch_rt      (){	return act_xch_rt      	;	}
	public String           getImp_err_flg     (){	return imp_err_flg     	;	}
	public String           getRcv_err_flg     (){	return rcv_err_flg     	;	}
	public String           getTax_curr_xch_flg(){	return tax_curr_xch_flg	;	}
	public String           getUsr_eml         (){	return usr_eml         	;	}
	public String           getImp_err_rsn     (){	return imp_err_rsn     	;	}
	public String           getRcv_err_rsn     (){	return rcv_err_rsn     	;	}
	public String           getFtu_use_ctnt1   (){	return ftu_use_ctnt1   	;	}
	public String           getFtu_use_ctnt2   (){	return ftu_use_ctnt2   	;	}
	public String           getFtu_use_ctnt3   (){	return ftu_use_ctnt3   	;	}
	public String           getFtu_use_ctnt4   (){	return ftu_use_ctnt4   	;	}
	public String           getFtu_use_ctnt5   (){	return ftu_use_ctnt5   	;	}
	public String           getCre_dt          (){	return cre_dt          	;	}
	public String           getCre_usr_id      (){	return cre_usr_id      	;	}
	public String           getEai_evnt_dt     (){	return eai_evnt_dt     	;	}

	// setter method is proceeding ..
	public void setIbflag          ( String           ibflag           ){	this.ibflag           = ibflag          	;	}
	public void setPage_rows       ( String           page_rows        ){	this.page_rows        = page_rows       	;	}
	public void setCsr_no          ( String           csr_no           ){	this.csr_no           = csr_no          	;	}
	public void setCsr_tp_cd       ( String           csr_tp_cd        ){	this.csr_tp_cd        = csr_tp_cd       	;	}
	public void setInv_dt          ( String           inv_dt           ){	this.inv_dt           = inv_dt          	;	}
	public void setInv_term_dt     ( String           inv_term_dt      ){	this.inv_term_dt      = inv_term_dt     	;	}
	public void setGl_dt           ( String           gl_dt            ){	this.gl_dt            = gl_dt           	;	}
	public void setVndr_no         ( String           vndr_no          ){	this.vndr_no          = vndr_no         	;	}
	public void setCsr_amt         ( String           csr_amt          ){	this.csr_amt          = csr_amt         	;	}
	public void setPay_amt         ( String           pay_amt          ){	this.pay_amt          = pay_amt         	;	}
	public void setPay_dt          ( String           pay_dt           ){	this.pay_dt           = pay_dt          	;	}
	public void setCsr_curr_cd     ( String           csr_curr_cd      ){	this.csr_curr_cd      = csr_curr_cd     	;	}
	public void setVndr_term_nm    ( String           vndr_term_nm     ){	this.vndr_term_nm     = vndr_term_nm    	;	}
	public void setInv_desc        ( String           inv_desc         ){	this.inv_desc         = inv_desc        	;	}
	public void setAttr_cate_nm    ( String           attr_cate_nm     ){	this.attr_cate_nm     = attr_cate_nm    	;	}
	public void setAttr_ctnt1      ( String           attr_ctnt1       ){	this.attr_ctnt1       = attr_ctnt1      	;	}
	public void setAttr_ctnt2      ( String           attr_ctnt2       ){	this.attr_ctnt2       = attr_ctnt2      	;	}
	public void setAttr_ctnt3      ( String           attr_ctnt3       ){	this.attr_ctnt3       = attr_ctnt3      	;	}
	public void setAttr_ctnt4      ( String           attr_ctnt4       ){	this.attr_ctnt4       = attr_ctnt4      	;	}
	public void setAttr_ctnt5      ( String           attr_ctnt5       ){	this.attr_ctnt5       = attr_ctnt5      	;	}
	public void setAttr_ctnt6      ( String           attr_ctnt6       ){	this.attr_ctnt6       = attr_ctnt6      	;	}
	public void setAttr_ctnt7      ( String           attr_ctnt7       ){	this.attr_ctnt7       = attr_ctnt7      	;	}
	public void setAttr_ctnt8      ( String           attr_ctnt8       ){	this.attr_ctnt8       = attr_ctnt8      	;	}
	public void setAttr_ctnt9      ( String           attr_ctnt9       ){	this.attr_ctnt9       = attr_ctnt9      	;	}
	public void setAttr_ctnt10     ( String           attr_ctnt10      ){	this.attr_ctnt10      = attr_ctnt10     	;	}
	public void setAttr_ctnt11     ( String           attr_ctnt11      ){	this.attr_ctnt11      = attr_ctnt11     	;	}
	public void setAttr_ctnt12     ( String           attr_ctnt12      ){	this.attr_ctnt12      = attr_ctnt12     	;	}
	public void setAttr_ctnt13     ( String           attr_ctnt13      ){	this.attr_ctnt13      = attr_ctnt13     	;	}
	public void setAttr_ctnt14     ( String           attr_ctnt14      ){	this.attr_ctnt14      = attr_ctnt14     	;	}
	public void setAttr_ctnt15     ( String           attr_ctnt15      ){	this.attr_ctnt15      = attr_ctnt15     	;	}
	public void setGlo_attr_ctnt1  ( String           glo_attr_ctnt1   ){	this.glo_attr_ctnt1   = glo_attr_ctnt1  	;	}
	public void setGlo_attr_ctnt2  ( String           glo_attr_ctnt2   ){	this.glo_attr_ctnt2   = glo_attr_ctnt2  	;	}
	public void setGlo_attr_ctnt3  ( String           glo_attr_ctnt3   ){	this.glo_attr_ctnt3   = glo_attr_ctnt3  	;	}
	public void setGlo_attr_ctnt4  ( String           glo_attr_ctnt4   ){	this.glo_attr_ctnt4   = glo_attr_ctnt4  	;	}
	public void setGlo_attr_ctnt5  ( String           glo_attr_ctnt5   ){	this.glo_attr_ctnt5   = glo_attr_ctnt5  	;	}
	public void setGlo_attr_ctnt6  ( String           glo_attr_ctnt6   ){	this.glo_attr_ctnt6   = glo_attr_ctnt6  	;	}
	public void setGlo_attr_ctnt7  ( String           glo_attr_ctnt7   ){	this.glo_attr_ctnt7   = glo_attr_ctnt7  	;	}
	public void setGlo_attr_ctnt8  ( String           glo_attr_ctnt8   ){	this.glo_attr_ctnt8   = glo_attr_ctnt8  	;	}
	public void setGlo_attr_ctnt9  ( String           glo_attr_ctnt9   ){	this.glo_attr_ctnt9   = glo_attr_ctnt9  	;	}
	public void setGlo_attr_ctnt10 ( String           glo_attr_ctnt10  ){	this.glo_attr_ctnt10  = glo_attr_ctnt10 	;	}
	public void setGlo_attr_ctnt11 ( String           glo_attr_ctnt11  ){	this.glo_attr_ctnt11  = glo_attr_ctnt11 	;	}
	public void setGlo_attr_ctnt12 ( String           glo_attr_ctnt12  ){	this.glo_attr_ctnt12  = glo_attr_ctnt12 	;	}
	public void setGlo_attr_ctnt13 ( String           glo_attr_ctnt13  ){	this.glo_attr_ctnt13  = glo_attr_ctnt13 	;	}
	public void setGlo_attr_ctnt14 ( String           glo_attr_ctnt14  ){	this.glo_attr_ctnt14  = glo_attr_ctnt14 	;	}
	public void setGlo_attr_ctnt15 ( String           glo_attr_ctnt15  ){	this.glo_attr_ctnt15  = glo_attr_ctnt15 	;	}
	public void setGlo_attr_ctnt16 ( String           glo_attr_ctnt16  ){	this.glo_attr_ctnt16  = glo_attr_ctnt16 	;	}
	public void setGlo_attr_ctnt17 ( String           glo_attr_ctnt17  ){	this.glo_attr_ctnt17  = glo_attr_ctnt17 	;	}
	public void setGlo_attr_ctnt18 ( String           glo_attr_ctnt18  ){	this.glo_attr_ctnt18  = glo_attr_ctnt18 	;	}
	public void setSrc_ctnt        ( String           src_ctnt         ){	this.src_ctnt         = src_ctnt        	;	}
	public void setPay_mzd_lu_cd   ( String           pay_mzd_lu_cd    ){	this.pay_mzd_lu_cd    = pay_mzd_lu_cd   	;	}
	public void setPay_grp_lu_cd   ( String           pay_grp_lu_cd    ){	this.pay_grp_lu_cd    = pay_grp_lu_cd   	;	}
	public void setCoa_co_cd       ( String           coa_co_cd        ){	this.coa_co_cd        = coa_co_cd       	;	}
	public void setCoa_rgn_cd      ( String           coa_rgn_cd       ){	this.coa_rgn_cd       = coa_rgn_cd      	;	}
	public void setCoa_ctr_cd      ( String           coa_ctr_cd       ){	this.coa_ctr_cd       = coa_ctr_cd      	;	}
	public void setCoa_acct_cd     ( String           coa_acct_cd      ){	this.coa_acct_cd      = coa_acct_cd     	;	}
	public void setCoa_vvd_cd      ( String           coa_vvd_cd       ){	this.coa_vvd_cd       = coa_vvd_cd      	;	}
	public void setCoa_inter_co_cd ( String           coa_inter_co_cd  ){	this.coa_inter_co_cd  = coa_inter_co_cd 	;	}
	public void setCoa_ftu_n1st_cd ( String           coa_ftu_n1st_cd  ){	this.coa_ftu_n1st_cd  = coa_ftu_n1st_cd 	;	}
	public void setCoa_ftu_n2nd_cd ( String           coa_ftu_n2nd_cd  ){	this.coa_ftu_n2nd_cd  = coa_ftu_n2nd_cd 	;	}
	public void setPpd_no          ( String           ppd_no           ){	this.ppd_no           = ppd_no          	;	}
	public void setPpd_dtrb_no     ( String           ppd_dtrb_no      ){	this.ppd_dtrb_no      = ppd_dtrb_no     	;	}
	public void setPpd_aply_amt    ( String           ppd_aply_amt     ){	this.ppd_aply_amt     = ppd_aply_amt    	;	}
	public void setPpd_gl_dt       ( String           ppd_gl_dt        ){	this.ppd_gl_dt        = ppd_gl_dt       	;	}
	public void setApro_flg        ( String           apro_flg         ){	this.apro_flg         = apro_flg        	;	}
	public void setTax_decl_flg    ( String           tax_decl_flg     ){	this.tax_decl_flg     = tax_decl_flg    	;	}
	public void setErr_csr_no      ( String           err_csr_no       ){	this.err_csr_no       = err_csr_no      	;	}
	public void setIf_flg          ( String           if_flg           ){	this.if_flg           = if_flg          	;	}
	public void setIf_dt           ( String           if_dt            ){	this.if_dt            = if_dt           	;	}
	public void setIf_err_rsn      ( String           if_err_rsn       ){	this.if_err_rsn       = if_err_rsn      	;	}
	public void setPpay_aply_flg   ( String           ppay_aply_flg    ){	this.ppay_aply_flg    = ppay_aply_flg   	;	}
	public void setTj_ofc_cd       ( String           tj_ofc_cd        ){	this.tj_ofc_cd        = tj_ofc_cd       	;	}
	public void setAct_xch_rt      ( String           act_xch_rt       ){	this.act_xch_rt       = act_xch_rt      	;	}
	public void setImp_err_flg     ( String           imp_err_flg      ){	this.imp_err_flg      = imp_err_flg     	;	}
	public void setRcv_err_flg     ( String           rcv_err_flg      ){	this.rcv_err_flg      = rcv_err_flg     	;	}
	public void setTax_curr_xch_flg( String           tax_curr_xch_flg ){	this.tax_curr_xch_flg = tax_curr_xch_flg	;	}
	public void setUsr_eml         ( String           usr_eml          ){	this.usr_eml          = usr_eml         	;	}
	public void setImp_err_rsn     ( String           imp_err_rsn      ){	this.imp_err_rsn      = imp_err_rsn     	;	}
	public void setRcv_err_rsn     ( String           rcv_err_rsn      ){	this.rcv_err_rsn      = rcv_err_rsn     	;	}
	public void setFtu_use_ctnt1   ( String           ftu_use_ctnt1    ){	this.ftu_use_ctnt1    = ftu_use_ctnt1   	;	}
	public void setFtu_use_ctnt2   ( String           ftu_use_ctnt2    ){	this.ftu_use_ctnt2    = ftu_use_ctnt2   	;	}
	public void setFtu_use_ctnt3   ( String           ftu_use_ctnt3    ){	this.ftu_use_ctnt3    = ftu_use_ctnt3   	;	}
	public void setFtu_use_ctnt4   ( String           ftu_use_ctnt4    ){	this.ftu_use_ctnt4    = ftu_use_ctnt4   	;	}
	public void setFtu_use_ctnt5   ( String           ftu_use_ctnt5    ){	this.ftu_use_ctnt5    = ftu_use_ctnt5   	;	}
	public void setCre_dt          ( String           cre_dt           ){	this.cre_dt           = cre_dt          	;	}
	public void setCre_usr_id      ( String           cre_usr_id       ){	this.cre_usr_id       = cre_usr_id      	;	}
	public void setEai_evnt_dt     ( String           eai_evnt_dt      ){	this.eai_evnt_dt      = eai_evnt_dt     	;	}

	public static AP_INV_HDR fromRequest(HttpServletRequest request) {
		AP_INV_HDR model = new AP_INV_HDR();
		try {
			model.setIbflag          	(JSPUtil.getParameter(request, "ibflag          		".trim(), ""));
			model.setPage_rows       	(JSPUtil.getParameter(request, "page_rows       		".trim(), ""));
			model.setCsr_no          	(JSPUtil.getParameter(request, "csr_no          		".trim(), ""));
			model.setCsr_tp_cd       	(JSPUtil.getParameter(request, "csr_tp_cd       		".trim(), ""));
			model.setInv_dt          	(JSPUtil.getParameter(request, "inv_dt          		".trim(), ""));
			model.setInv_term_dt     	(JSPUtil.getParameter(request, "inv_term_dt     		".trim(), ""));
			model.setGl_dt           	(JSPUtil.getParameter(request, "gl_dt           		".trim(), ""));
			model.setVndr_no         	(JSPUtil.getParameter(request, "vndr_no         		".trim(), ""));
			model.setCsr_amt         	(JSPUtil.getParameter(request, "csr_amt         		".trim(), ""));
			model.setPay_amt         	(JSPUtil.getParameter(request, "pay_amt         		".trim(), ""));
			model.setPay_dt          	(JSPUtil.getParameter(request, "pay_dt          		".trim(), ""));
			model.setCsr_curr_cd     	(JSPUtil.getParameter(request, "csr_curr_cd     		".trim(), ""));
			model.setVndr_term_nm    	(JSPUtil.getParameter(request, "vndr_term_nm    		".trim(), ""));
			model.setInv_desc        	(JSPUtil.getParameter(request, "inv_desc        		".trim(), ""));
			model.setAttr_cate_nm    	(JSPUtil.getParameter(request, "attr_cate_nm    		".trim(), ""));
			model.setAttr_ctnt1      	(JSPUtil.getParameter(request, "attr_ctnt1      		".trim(), ""));
			model.setAttr_ctnt2      	(JSPUtil.getParameter(request, "attr_ctnt2      		".trim(), ""));
			model.setAttr_ctnt3      	(JSPUtil.getParameter(request, "attr_ctnt3      		".trim(), ""));
			model.setAttr_ctnt4      	(JSPUtil.getParameter(request, "attr_ctnt4      		".trim(), ""));
			model.setAttr_ctnt5      	(JSPUtil.getParameter(request, "attr_ctnt5      		".trim(), ""));
			model.setAttr_ctnt6      	(JSPUtil.getParameter(request, "attr_ctnt6      		".trim(), ""));
			model.setAttr_ctnt7      	(JSPUtil.getParameter(request, "attr_ctnt7      		".trim(), ""));
			model.setAttr_ctnt8      	(JSPUtil.getParameter(request, "attr_ctnt8      		".trim(), ""));
			model.setAttr_ctnt9      	(JSPUtil.getParameter(request, "attr_ctnt9      		".trim(), ""));
			model.setAttr_ctnt10     	(JSPUtil.getParameter(request, "attr_ctnt10     		".trim(), ""));
			model.setAttr_ctnt11     	(JSPUtil.getParameter(request, "attr_ctnt11     		".trim(), ""));
			model.setAttr_ctnt12     	(JSPUtil.getParameter(request, "attr_ctnt12     		".trim(), ""));
			model.setAttr_ctnt13     	(JSPUtil.getParameter(request, "attr_ctnt13     		".trim(), ""));
			model.setAttr_ctnt14     	(JSPUtil.getParameter(request, "attr_ctnt14     		".trim(), ""));
			model.setAttr_ctnt15     	(JSPUtil.getParameter(request, "attr_ctnt15     		".trim(), ""));
			model.setGlo_attr_ctnt1  	(JSPUtil.getParameter(request, "glo_attr_ctnt1  		".trim(), ""));
			model.setGlo_attr_ctnt2  	(JSPUtil.getParameter(request, "glo_attr_ctnt2  		".trim(), ""));
			model.setGlo_attr_ctnt3  	(JSPUtil.getParameter(request, "glo_attr_ctnt3  		".trim(), ""));
			model.setGlo_attr_ctnt4  	(JSPUtil.getParameter(request, "glo_attr_ctnt4  		".trim(), ""));
			model.setGlo_attr_ctnt5  	(JSPUtil.getParameter(request, "glo_attr_ctnt5  		".trim(), ""));
			model.setGlo_attr_ctnt6  	(JSPUtil.getParameter(request, "glo_attr_ctnt6  		".trim(), ""));
			model.setGlo_attr_ctnt7  	(JSPUtil.getParameter(request, "glo_attr_ctnt7  		".trim(), ""));
			model.setGlo_attr_ctnt8  	(JSPUtil.getParameter(request, "glo_attr_ctnt8  		".trim(), ""));
			model.setGlo_attr_ctnt9  	(JSPUtil.getParameter(request, "glo_attr_ctnt9  		".trim(), ""));
			model.setGlo_attr_ctnt10 	(JSPUtil.getParameter(request, "glo_attr_ctnt10 		".trim(), ""));
			model.setGlo_attr_ctnt11 	(JSPUtil.getParameter(request, "glo_attr_ctnt11 		".trim(), ""));
			model.setGlo_attr_ctnt12 	(JSPUtil.getParameter(request, "glo_attr_ctnt12 		".trim(), ""));
			model.setGlo_attr_ctnt13 	(JSPUtil.getParameter(request, "glo_attr_ctnt13 		".trim(), ""));
			model.setGlo_attr_ctnt14 	(JSPUtil.getParameter(request, "glo_attr_ctnt14 		".trim(), ""));
			model.setGlo_attr_ctnt15 	(JSPUtil.getParameter(request, "glo_attr_ctnt15 		".trim(), ""));
			model.setGlo_attr_ctnt16 	(JSPUtil.getParameter(request, "glo_attr_ctnt16 		".trim(), ""));
			model.setGlo_attr_ctnt17 	(JSPUtil.getParameter(request, "glo_attr_ctnt17 		".trim(), ""));
			model.setGlo_attr_ctnt18 	(JSPUtil.getParameter(request, "glo_attr_ctnt18 		".trim(), ""));
			model.setSrc_ctnt        	(JSPUtil.getParameter(request, "src_ctnt        		".trim(), ""));
			model.setPay_mzd_lu_cd   	(JSPUtil.getParameter(request, "pay_mzd_lu_cd   		".trim(), ""));
			model.setPay_grp_lu_cd   	(JSPUtil.getParameter(request, "pay_grp_lu_cd   		".trim(), ""));
			model.setCoa_co_cd       	(JSPUtil.getParameter(request, "coa_co_cd       		".trim(), ""));
			model.setCoa_rgn_cd      	(JSPUtil.getParameter(request, "coa_rgn_cd      		".trim(), ""));
			model.setCoa_ctr_cd      	(JSPUtil.getParameter(request, "coa_ctr_cd      		".trim(), ""));
			model.setCoa_acct_cd     	(JSPUtil.getParameter(request, "coa_acct_cd     		".trim(), ""));
			model.setCoa_vvd_cd      	(JSPUtil.getParameter(request, "coa_vvd_cd      		".trim(), ""));
			model.setCoa_inter_co_cd 	(JSPUtil.getParameter(request, "coa_inter_co_cd 		".trim(), ""));
			model.setCoa_ftu_n1st_cd 	(JSPUtil.getParameter(request, "coa_ftu_n1st_cd 		".trim(), ""));
			model.setCoa_ftu_n2nd_cd 	(JSPUtil.getParameter(request, "coa_ftu_n2nd_cd 		".trim(), ""));
			model.setPpd_no          	(JSPUtil.getParameter(request, "ppd_no          		".trim(), ""));
			model.setPpd_dtrb_no     	(JSPUtil.getParameter(request, "ppd_dtrb_no     		".trim(), ""));
			model.setPpd_aply_amt    	(JSPUtil.getParameter(request, "ppd_aply_amt    		".trim(), ""));
			model.setPpd_gl_dt       	(JSPUtil.getParameter(request, "ppd_gl_dt       		".trim(), ""));
			model.setApro_flg        	(JSPUtil.getParameter(request, "apro_flg        		".trim(), ""));
			model.setTax_decl_flg    	(JSPUtil.getParameter(request, "tax_decl_flg    		".trim(), ""));
			model.setErr_csr_no      	(JSPUtil.getParameter(request, "err_csr_no      		".trim(), ""));
			model.setIf_flg          	(JSPUtil.getParameter(request, "if_flg          		".trim(), ""));
			model.setIf_dt           	(JSPUtil.getParameter(request, "if_dt           		".trim(), ""));
			model.setIf_err_rsn      	(JSPUtil.getParameter(request, "if_err_rsn      		".trim(), ""));
			model.setPpay_aply_flg   	(JSPUtil.getParameter(request, "ppay_aply_flg   		".trim(), ""));
			model.setTj_ofc_cd       	(JSPUtil.getParameter(request, "tj_ofc_cd       		".trim(), ""));
			model.setAct_xch_rt      	(JSPUtil.getParameter(request, "act_xch_rt      		".trim(), ""));
			model.setImp_err_flg     	(JSPUtil.getParameter(request, "imp_err_flg     		".trim(), ""));
			model.setRcv_err_flg     	(JSPUtil.getParameter(request, "rcv_err_flg     		".trim(), ""));
			model.setTax_curr_xch_flg	(JSPUtil.getParameter(request, "tax_curr_xch_flg		".trim(), ""));
			model.setUsr_eml         	(JSPUtil.getParameter(request, "usr_eml         		".trim(), ""));
			model.setImp_err_rsn     	(JSPUtil.getParameter(request, "imp_err_rsn     		".trim(), ""));
			model.setRcv_err_rsn     	(JSPUtil.getParameter(request, "rcv_err_rsn     		".trim(), ""));
			model.setFtu_use_ctnt1   	(JSPUtil.getParameter(request, "ftu_use_ctnt1   		".trim(), ""));
			model.setFtu_use_ctnt2   	(JSPUtil.getParameter(request, "ftu_use_ctnt2   		".trim(), ""));
			model.setFtu_use_ctnt3   	(JSPUtil.getParameter(request, "ftu_use_ctnt3   		".trim(), ""));
			model.setFtu_use_ctnt4   	(JSPUtil.getParameter(request, "ftu_use_ctnt4   		".trim(), ""));
			model.setFtu_use_ctnt5   	(JSPUtil.getParameter(request, "ftu_use_ctnt5   		".trim(), ""));
			model.setCre_dt          	(JSPUtil.getParameter(request, "cre_dt          		".trim(), ""));
			model.setCre_usr_id      	(JSPUtil.getParameter(request, "cre_usr_id      		".trim(), ""));
			model.setEai_evnt_dt     	(JSPUtil.getParameter(request, "eai_evnt_dt     		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		AP_INV_HDR model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag           =  (JSPUtil.getParameter(request, "ibflag          		".trim(), length));
			String[] page_rows        =  (JSPUtil.getParameter(request, "page_rows       		".trim(), length));
			String[] csr_no           =  (JSPUtil.getParameter(request, "csr_no          		".trim(), length));
			String[] csr_tp_cd        =  (JSPUtil.getParameter(request, "csr_tp_cd       		".trim(), length));
			String[] inv_dt           =  (JSPUtil.getParameter(request, "inv_dt          		".trim(), length));
			String[] inv_term_dt      =  (JSPUtil.getParameter(request, "inv_term_dt     		".trim(), length));
			String[] gl_dt            =  (JSPUtil.getParameter(request, "gl_dt           		".trim(), length));
			String[] vndr_no          =  (JSPUtil.getParameter(request, "vndr_no         		".trim(), length));
			String[] csr_amt          =  (JSPUtil.getParameter(request, "csr_amt         		".trim(), length));
			String[] pay_amt          =  (JSPUtil.getParameter(request, "pay_amt         		".trim(), length));
			String[] pay_dt           =  (JSPUtil.getParameter(request, "pay_dt          		".trim(), length));
			String[] csr_curr_cd      =  (JSPUtil.getParameter(request, "csr_curr_cd     		".trim(), length));
			String[] vndr_term_nm     =  (JSPUtil.getParameter(request, "vndr_term_nm    		".trim(), length));
			String[] inv_desc         =  (JSPUtil.getParameter(request, "inv_desc        		".trim(), length));
			String[] attr_cate_nm     =  (JSPUtil.getParameter(request, "attr_cate_nm    		".trim(), length));
			String[] attr_ctnt1       =  (JSPUtil.getParameter(request, "attr_ctnt1      		".trim(), length));
			String[] attr_ctnt2       =  (JSPUtil.getParameter(request, "attr_ctnt2      		".trim(), length));
			String[] attr_ctnt3       =  (JSPUtil.getParameter(request, "attr_ctnt3      		".trim(), length));
			String[] attr_ctnt4       =  (JSPUtil.getParameter(request, "attr_ctnt4      		".trim(), length));
			String[] attr_ctnt5       =  (JSPUtil.getParameter(request, "attr_ctnt5      		".trim(), length));
			String[] attr_ctnt6       =  (JSPUtil.getParameter(request, "attr_ctnt6      		".trim(), length));
			String[] attr_ctnt7       =  (JSPUtil.getParameter(request, "attr_ctnt7      		".trim(), length));
			String[] attr_ctnt8       =  (JSPUtil.getParameter(request, "attr_ctnt8      		".trim(), length));
			String[] attr_ctnt9       =  (JSPUtil.getParameter(request, "attr_ctnt9      		".trim(), length));
			String[] attr_ctnt10      =  (JSPUtil.getParameter(request, "attr_ctnt10     		".trim(), length));
			String[] attr_ctnt11      =  (JSPUtil.getParameter(request, "attr_ctnt11     		".trim(), length));
			String[] attr_ctnt12      =  (JSPUtil.getParameter(request, "attr_ctnt12     		".trim(), length));
			String[] attr_ctnt13      =  (JSPUtil.getParameter(request, "attr_ctnt13     		".trim(), length));
			String[] attr_ctnt14      =  (JSPUtil.getParameter(request, "attr_ctnt14     		".trim(), length));
			String[] attr_ctnt15      =  (JSPUtil.getParameter(request, "attr_ctnt15     		".trim(), length));
			String[] glo_attr_ctnt1   =  (JSPUtil.getParameter(request, "glo_attr_ctnt1  		".trim(), length));
			String[] glo_attr_ctnt2   =  (JSPUtil.getParameter(request, "glo_attr_ctnt2  		".trim(), length));
			String[] glo_attr_ctnt3   =  (JSPUtil.getParameter(request, "glo_attr_ctnt3  		".trim(), length));
			String[] glo_attr_ctnt4   =  (JSPUtil.getParameter(request, "glo_attr_ctnt4  		".trim(), length));
			String[] glo_attr_ctnt5   =  (JSPUtil.getParameter(request, "glo_attr_ctnt5  		".trim(), length));
			String[] glo_attr_ctnt6   =  (JSPUtil.getParameter(request, "glo_attr_ctnt6  		".trim(), length));
			String[] glo_attr_ctnt7   =  (JSPUtil.getParameter(request, "glo_attr_ctnt7  		".trim(), length));
			String[] glo_attr_ctnt8   =  (JSPUtil.getParameter(request, "glo_attr_ctnt8  		".trim(), length));
			String[] glo_attr_ctnt9   =  (JSPUtil.getParameter(request, "glo_attr_ctnt9  		".trim(), length));
			String[] glo_attr_ctnt10  =  (JSPUtil.getParameter(request, "glo_attr_ctnt10 		".trim(), length));
			String[] glo_attr_ctnt11  =  (JSPUtil.getParameter(request, "glo_attr_ctnt11 		".trim(), length));
			String[] glo_attr_ctnt12  =  (JSPUtil.getParameter(request, "glo_attr_ctnt12 		".trim(), length));
			String[] glo_attr_ctnt13  =  (JSPUtil.getParameter(request, "glo_attr_ctnt13 		".trim(), length));
			String[] glo_attr_ctnt14  =  (JSPUtil.getParameter(request, "glo_attr_ctnt14 		".trim(), length));
			String[] glo_attr_ctnt15  =  (JSPUtil.getParameter(request, "glo_attr_ctnt15 		".trim(), length));
			String[] glo_attr_ctnt16  =  (JSPUtil.getParameter(request, "glo_attr_ctnt16 		".trim(), length));
			String[] glo_attr_ctnt17  =  (JSPUtil.getParameter(request, "glo_attr_ctnt17 		".trim(), length));
			String[] glo_attr_ctnt18  =  (JSPUtil.getParameter(request, "glo_attr_ctnt18 		".trim(), length));
			String[] src_ctnt         =  (JSPUtil.getParameter(request, "src_ctnt        		".trim(), length));
			String[] pay_mzd_lu_cd    =  (JSPUtil.getParameter(request, "pay_mzd_lu_cd   		".trim(), length));
			String[] pay_grp_lu_cd    =  (JSPUtil.getParameter(request, "pay_grp_lu_cd   		".trim(), length));
			String[] coa_co_cd        =  (JSPUtil.getParameter(request, "coa_co_cd       		".trim(), length));
			String[] coa_rgn_cd       =  (JSPUtil.getParameter(request, "coa_rgn_cd      		".trim(), length));
			String[] coa_ctr_cd       =  (JSPUtil.getParameter(request, "coa_ctr_cd      		".trim(), length));
			String[] coa_acct_cd      =  (JSPUtil.getParameter(request, "coa_acct_cd     		".trim(), length));
			String[] coa_vvd_cd       =  (JSPUtil.getParameter(request, "coa_vvd_cd      		".trim(), length));
			String[] coa_inter_co_cd  =  (JSPUtil.getParameter(request, "coa_inter_co_cd 		".trim(), length));
			String[] coa_ftu_n1st_cd  =  (JSPUtil.getParameter(request, "coa_ftu_n1st_cd 		".trim(), length));
			String[] coa_ftu_n2nd_cd  =  (JSPUtil.getParameter(request, "coa_ftu_n2nd_cd 		".trim(), length));
			String[] ppd_no           =  (JSPUtil.getParameter(request, "ppd_no          		".trim(), length));
			String[] ppd_dtrb_no      =  (JSPUtil.getParameter(request, "ppd_dtrb_no     		".trim(), length));
			String[] ppd_aply_amt     =  (JSPUtil.getParameter(request, "ppd_aply_amt    		".trim(), length));
			String[] ppd_gl_dt        =  (JSPUtil.getParameter(request, "ppd_gl_dt       		".trim(), length));
			String[] apro_flg         =  (JSPUtil.getParameter(request, "apro_flg        		".trim(), length));
			String[] tax_decl_flg     =  (JSPUtil.getParameter(request, "tax_decl_flg    		".trim(), length));
			String[] err_csr_no       =  (JSPUtil.getParameter(request, "err_csr_no      		".trim(), length));
			String[] if_flg           =  (JSPUtil.getParameter(request, "if_flg          		".trim(), length));
			String[] if_dt            =  (JSPUtil.getParameter(request, "if_dt           		".trim(), length));
			String[] if_err_rsn       =  (JSPUtil.getParameter(request, "if_err_rsn      		".trim(), length));
			String[] ppay_aply_flg    =  (JSPUtil.getParameter(request, "ppay_aply_flg   		".trim(), length));
			String[] tj_ofc_cd        =  (JSPUtil.getParameter(request, "tj_ofc_cd       		".trim(), length));
			String[] act_xch_rt       =  (JSPUtil.getParameter(request, "act_xch_rt      		".trim(), length));
			String[] imp_err_flg      =  (JSPUtil.getParameter(request, "imp_err_flg     		".trim(), length));
			String[] rcv_err_flg      =  (JSPUtil.getParameter(request, "rcv_err_flg     		".trim(), length));
			String[] tax_curr_xch_flg =  (JSPUtil.getParameter(request, "tax_curr_xch_flg		".trim(), length));
			String[] usr_eml          =  (JSPUtil.getParameter(request, "usr_eml         		".trim(), length));
			String[] imp_err_rsn      =  (JSPUtil.getParameter(request, "imp_err_rsn     		".trim(), length));
			String[] rcv_err_rsn      =  (JSPUtil.getParameter(request, "rcv_err_rsn     		".trim(), length));
			String[] ftu_use_ctnt1    =  (JSPUtil.getParameter(request, "ftu_use_ctnt1   		".trim(), length));
			String[] ftu_use_ctnt2    =  (JSPUtil.getParameter(request, "ftu_use_ctnt2   		".trim(), length));
			String[] ftu_use_ctnt3    =  (JSPUtil.getParameter(request, "ftu_use_ctnt3   		".trim(), length));
			String[] ftu_use_ctnt4    =  (JSPUtil.getParameter(request, "ftu_use_ctnt4   		".trim(), length));
			String[] ftu_use_ctnt5    =  (JSPUtil.getParameter(request, "ftu_use_ctnt5   		".trim(), length));
			String[] cre_dt           =  (JSPUtil.getParameter(request, "cre_dt          		".trim(), length));
			String[] cre_usr_id       =  (JSPUtil.getParameter(request, "cre_usr_id      		".trim(), length));
			String[] eai_evnt_dt      =  (JSPUtil.getParameter(request, "eai_evnt_dt     		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new AP_INV_HDR();
				model.setIbflag          		  (ibflag          	[i]);
				model.setPage_rows       		  (page_rows       	[i]);
				model.setCsr_no          		  (csr_no          	[i]);
				model.setCsr_tp_cd       		  (csr_tp_cd       	[i]);
				model.setInv_dt          		  (inv_dt          	[i]);
				model.setInv_term_dt     		  (inv_term_dt     	[i]);
				model.setGl_dt           		  (gl_dt           	[i]);
				model.setVndr_no         		  (vndr_no         	[i]);
				model.setCsr_amt         		  (csr_amt         	[i]);
				model.setPay_amt         		  (pay_amt         	[i]);
				model.setPay_dt          		  (pay_dt          	[i]);
				model.setCsr_curr_cd     		  (csr_curr_cd     	[i]);
				model.setVndr_term_nm    		  (vndr_term_nm    	[i]);
				model.setInv_desc        		  (inv_desc        	[i]);
				model.setAttr_cate_nm    		  (attr_cate_nm    	[i]);
				model.setAttr_ctnt1      		  (attr_ctnt1      	[i]);
				model.setAttr_ctnt2      		  (attr_ctnt2      	[i]);
				model.setAttr_ctnt3      		  (attr_ctnt3      	[i]);
				model.setAttr_ctnt4      		  (attr_ctnt4      	[i]);
				model.setAttr_ctnt5      		  (attr_ctnt5      	[i]);
				model.setAttr_ctnt6      		  (attr_ctnt6      	[i]);
				model.setAttr_ctnt7      		  (attr_ctnt7      	[i]);
				model.setAttr_ctnt8      		  (attr_ctnt8      	[i]);
				model.setAttr_ctnt9      		  (attr_ctnt9      	[i]);
				model.setAttr_ctnt10     		  (attr_ctnt10     	[i]);
				model.setAttr_ctnt11     		  (attr_ctnt11     	[i]);
				model.setAttr_ctnt12     		  (attr_ctnt12     	[i]);
				model.setAttr_ctnt13     		  (attr_ctnt13     	[i]);
				model.setAttr_ctnt14     		  (attr_ctnt14     	[i]);
				model.setAttr_ctnt15     		  (attr_ctnt15     	[i]);
				model.setGlo_attr_ctnt1  		  (glo_attr_ctnt1  	[i]);
				model.setGlo_attr_ctnt2  		  (glo_attr_ctnt2  	[i]);
				model.setGlo_attr_ctnt3  		  (glo_attr_ctnt3  	[i]);
				model.setGlo_attr_ctnt4  		  (glo_attr_ctnt4  	[i]);
				model.setGlo_attr_ctnt5  		  (glo_attr_ctnt5  	[i]);
				model.setGlo_attr_ctnt6  		  (glo_attr_ctnt6  	[i]);
				model.setGlo_attr_ctnt7  		  (glo_attr_ctnt7  	[i]);
				model.setGlo_attr_ctnt8  		  (glo_attr_ctnt8  	[i]);
				model.setGlo_attr_ctnt9  		  (glo_attr_ctnt9  	[i]);
				model.setGlo_attr_ctnt10 		  (glo_attr_ctnt10 	[i]);
				model.setGlo_attr_ctnt11 		  (glo_attr_ctnt11 	[i]);
				model.setGlo_attr_ctnt12 		  (glo_attr_ctnt12 	[i]);
				model.setGlo_attr_ctnt13 		  (glo_attr_ctnt13 	[i]);
				model.setGlo_attr_ctnt14 		  (glo_attr_ctnt14 	[i]);
				model.setGlo_attr_ctnt15 		  (glo_attr_ctnt15 	[i]);
				model.setGlo_attr_ctnt16 		  (glo_attr_ctnt16 	[i]);
				model.setGlo_attr_ctnt17 		  (glo_attr_ctnt17 	[i]);
				model.setGlo_attr_ctnt18 		  (glo_attr_ctnt18 	[i]);
				model.setSrc_ctnt        		  (src_ctnt        	[i]);
				model.setPay_mzd_lu_cd   		  (pay_mzd_lu_cd   	[i]);
				model.setPay_grp_lu_cd   		  (pay_grp_lu_cd   	[i]);
				model.setCoa_co_cd       		  (coa_co_cd       	[i]);
				model.setCoa_rgn_cd      		  (coa_rgn_cd      	[i]);
				model.setCoa_ctr_cd      		  (coa_ctr_cd      	[i]);
				model.setCoa_acct_cd     		  (coa_acct_cd     	[i]);
				model.setCoa_vvd_cd      		  (coa_vvd_cd      	[i]);
				model.setCoa_inter_co_cd 		  (coa_inter_co_cd 	[i]);
				model.setCoa_ftu_n1st_cd 		  (coa_ftu_n1st_cd 	[i]);
				model.setCoa_ftu_n2nd_cd 		  (coa_ftu_n2nd_cd 	[i]);
				model.setPpd_no          		  (ppd_no          	[i]);
				model.setPpd_dtrb_no     		  (ppd_dtrb_no     	[i]);
				model.setPpd_aply_amt    		  (ppd_aply_amt    	[i]);
				model.setPpd_gl_dt       		  (ppd_gl_dt       	[i]);
				model.setApro_flg        		  (apro_flg        	[i]);
				model.setTax_decl_flg    		  (tax_decl_flg    	[i]);
				model.setErr_csr_no      		  (err_csr_no      	[i]);
				model.setIf_flg          		  (if_flg          	[i]);
				model.setIf_dt           		  (if_dt           	[i]);
				model.setIf_err_rsn      		  (if_err_rsn      	[i]);
				model.setPpay_aply_flg   		  (ppay_aply_flg   	[i]);
				model.setTj_ofc_cd       		  (tj_ofc_cd       	[i]);
				model.setAct_xch_rt      		  (act_xch_rt      	[i]);
				model.setImp_err_flg     		  (imp_err_flg     	[i]);
				model.setRcv_err_flg     		  (rcv_err_flg     	[i]);
				model.setTax_curr_xch_flg		  (tax_curr_xch_flg	[i]);
				model.setUsr_eml         		  (usr_eml         	[i]);
				model.setImp_err_rsn     		  (imp_err_rsn     	[i]);
				model.setRcv_err_rsn     		  (rcv_err_rsn     	[i]);
				model.setFtu_use_ctnt1   		  (ftu_use_ctnt1   	[i]);
				model.setFtu_use_ctnt2   		  (ftu_use_ctnt2   	[i]);
				model.setFtu_use_ctnt3   		  (ftu_use_ctnt3   	[i]);
				model.setFtu_use_ctnt4   		  (ftu_use_ctnt4   	[i]);
				model.setFtu_use_ctnt5   		  (ftu_use_ctnt5   	[i]);
				model.setCre_dt          		  (cre_dt          	[i]);
				model.setCre_usr_id      		  (cre_usr_id      	[i]);
				model.setEai_evnt_dt     		  (eai_evnt_dt     	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		AP_INV_HDR model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues(prefix+"ibflag")==null?0:request.getParameterValues(prefix+"ibflag").length;
		try {
			String[] ibflag           =  (JSPUtil.getParameter(request, prefix + "ibflag          		".trim(), length));
			String[] page_rows        =  (JSPUtil.getParameter(request, prefix + "page_rows       		".trim(), length));
			String[] csr_no           =  (JSPUtil.getParameter(request, prefix + "csr_no          		".trim(), length));
			String[] csr_tp_cd        =  (JSPUtil.getParameter(request, prefix + "csr_tp_cd       		".trim(), length));
			String[] inv_dt           =  (JSPUtil.getParameter(request, prefix + "inv_dt          		".trim(), length));
			String[] inv_term_dt      =  (JSPUtil.getParameter(request, prefix + "inv_term_dt     		".trim(), length));
			String[] gl_dt            =  (JSPUtil.getParameter(request, prefix + "gl_dt           		".trim(), length));
			String[] vndr_no          =  (JSPUtil.getParameter(request, prefix + "vndr_no         		".trim(), length));
			String[] csr_amt          =  (JSPUtil.getParameter(request, prefix + "csr_amt         		".trim(), length));
			String[] pay_amt          =  (JSPUtil.getParameter(request, prefix + "pay_amt         		".trim(), length));
			String[] pay_dt           =  (JSPUtil.getParameter(request, prefix + "pay_dt          		".trim(), length));
			String[] csr_curr_cd      =  (JSPUtil.getParameter(request, prefix + "csr_curr_cd     		".trim(), length));
			String[] vndr_term_nm     =  (JSPUtil.getParameter(request, prefix + "vndr_term_nm    		".trim(), length));
			String[] inv_desc         =  (JSPUtil.getParameter(request, prefix + "inv_desc        		".trim(), length));
			String[] attr_cate_nm     =  (JSPUtil.getParameter(request, prefix + "attr_cate_nm    		".trim(), length));
			String[] attr_ctnt1       =  (JSPUtil.getParameter(request, prefix + "attr_ctnt1      		".trim(), length));
			String[] attr_ctnt2       =  (JSPUtil.getParameter(request, prefix + "attr_ctnt2      		".trim(), length));
			String[] attr_ctnt3       =  (JSPUtil.getParameter(request, prefix + "attr_ctnt3      		".trim(), length));
			String[] attr_ctnt4       =  (JSPUtil.getParameter(request, prefix + "attr_ctnt4      		".trim(), length));
			String[] attr_ctnt5       =  (JSPUtil.getParameter(request, prefix + "attr_ctnt5      		".trim(), length));
			String[] attr_ctnt6       =  (JSPUtil.getParameter(request, prefix + "attr_ctnt6      		".trim(), length));
			String[] attr_ctnt7       =  (JSPUtil.getParameter(request, prefix + "attr_ctnt7      		".trim(), length));
			String[] attr_ctnt8       =  (JSPUtil.getParameter(request, prefix + "attr_ctnt8      		".trim(), length));
			String[] attr_ctnt9       =  (JSPUtil.getParameter(request, prefix + "attr_ctnt9      		".trim(), length));
			String[] attr_ctnt10      =  (JSPUtil.getParameter(request, prefix + "attr_ctnt10     		".trim(), length));
			String[] attr_ctnt11      =  (JSPUtil.getParameter(request, prefix + "attr_ctnt11     		".trim(), length));
			String[] attr_ctnt12      =  (JSPUtil.getParameter(request, prefix + "attr_ctnt12     		".trim(), length));
			String[] attr_ctnt13      =  (JSPUtil.getParameter(request, prefix + "attr_ctnt13     		".trim(), length));
			String[] attr_ctnt14      =  (JSPUtil.getParameter(request, prefix + "attr_ctnt14     		".trim(), length));
			String[] attr_ctnt15      =  (JSPUtil.getParameter(request, prefix + "attr_ctnt15     		".trim(), length));
			String[] glo_attr_ctnt1   =  (JSPUtil.getParameter(request, prefix + "glo_attr_ctnt1  		".trim(), length));
			String[] glo_attr_ctnt2   =  (JSPUtil.getParameter(request, prefix + "glo_attr_ctnt2  		".trim(), length));
			String[] glo_attr_ctnt3   =  (JSPUtil.getParameter(request, prefix + "glo_attr_ctnt3  		".trim(), length));
			String[] glo_attr_ctnt4   =  (JSPUtil.getParameter(request, prefix + "glo_attr_ctnt4  		".trim(), length));
			String[] glo_attr_ctnt5   =  (JSPUtil.getParameter(request, prefix + "glo_attr_ctnt5  		".trim(), length));
			String[] glo_attr_ctnt6   =  (JSPUtil.getParameter(request, prefix + "glo_attr_ctnt6  		".trim(), length));
			String[] glo_attr_ctnt7   =  (JSPUtil.getParameter(request, prefix + "glo_attr_ctnt7  		".trim(), length));
			String[] glo_attr_ctnt8   =  (JSPUtil.getParameter(request, prefix + "glo_attr_ctnt8  		".trim(), length));
			String[] glo_attr_ctnt9   =  (JSPUtil.getParameter(request, prefix + "glo_attr_ctnt9  		".trim(), length));
			String[] glo_attr_ctnt10  =  (JSPUtil.getParameter(request, prefix + "glo_attr_ctnt10 		".trim(), length));
			String[] glo_attr_ctnt11  =  (JSPUtil.getParameter(request, prefix + "glo_attr_ctnt11 		".trim(), length));
			String[] glo_attr_ctnt12  =  (JSPUtil.getParameter(request, prefix + "glo_attr_ctnt12 		".trim(), length));
			String[] glo_attr_ctnt13  =  (JSPUtil.getParameter(request, prefix + "glo_attr_ctnt13 		".trim(), length));
			String[] glo_attr_ctnt14  =  (JSPUtil.getParameter(request, prefix + "glo_attr_ctnt14 		".trim(), length));
			String[] glo_attr_ctnt15  =  (JSPUtil.getParameter(request, prefix + "glo_attr_ctnt15 		".trim(), length));
			String[] glo_attr_ctnt16  =  (JSPUtil.getParameter(request, prefix + "glo_attr_ctnt16 		".trim(), length));
			String[] glo_attr_ctnt17  =  (JSPUtil.getParameter(request, prefix + "glo_attr_ctnt17 		".trim(), length));
			String[] glo_attr_ctnt18  =  (JSPUtil.getParameter(request, prefix + "glo_attr_ctnt18 		".trim(), length));
			String[] src_ctnt         =  (JSPUtil.getParameter(request, prefix + "src_ctnt        		".trim(), length));
			String[] pay_mzd_lu_cd    =  (JSPUtil.getParameter(request, prefix + "pay_mzd_lu_cd   		".trim(), length));
			String[] pay_grp_lu_cd    =  (JSPUtil.getParameter(request, prefix + "pay_grp_lu_cd   		".trim(), length));
			String[] coa_co_cd        =  (JSPUtil.getParameter(request, prefix + "coa_co_cd       		".trim(), length));
			String[] coa_rgn_cd       =  (JSPUtil.getParameter(request, prefix + "coa_rgn_cd      		".trim(), length));
			String[] coa_ctr_cd       =  (JSPUtil.getParameter(request, prefix + "coa_ctr_cd      		".trim(), length));
			String[] coa_acct_cd      =  (JSPUtil.getParameter(request, prefix + "coa_acct_cd     		".trim(), length));
			String[] coa_vvd_cd       =  (JSPUtil.getParameter(request, prefix + "coa_vvd_cd      		".trim(), length));
			String[] coa_inter_co_cd  =  (JSPUtil.getParameter(request, prefix + "coa_inter_co_cd 		".trim(), length));
			String[] coa_ftu_n1st_cd  =  (JSPUtil.getParameter(request, prefix + "coa_ftu_n1st_cd 		".trim(), length));
			String[] coa_ftu_n2nd_cd  =  (JSPUtil.getParameter(request, prefix + "coa_ftu_n2nd_cd 		".trim(), length));
			String[] ppd_no           =  (JSPUtil.getParameter(request, prefix + "ppd_no          		".trim(), length));
			String[] ppd_dtrb_no      =  (JSPUtil.getParameter(request, prefix + "ppd_dtrb_no     		".trim(), length));
			String[] ppd_aply_amt     =  (JSPUtil.getParameter(request, prefix + "ppd_aply_amt    		".trim(), length));
			String[] ppd_gl_dt        =  (JSPUtil.getParameter(request, prefix + "ppd_gl_dt       		".trim(), length));
			String[] apro_flg         =  (JSPUtil.getParameter(request, prefix + "apro_flg        		".trim(), length));
			String[] tax_decl_flg     =  (JSPUtil.getParameter(request, prefix + "tax_decl_flg    		".trim(), length));
			String[] err_csr_no       =  (JSPUtil.getParameter(request, prefix + "err_csr_no      		".trim(), length));
			String[] if_flg           =  (JSPUtil.getParameter(request, prefix + "if_flg          		".trim(), length));
			String[] if_dt            =  (JSPUtil.getParameter(request, prefix + "if_dt           		".trim(), length));
			String[] if_err_rsn       =  (JSPUtil.getParameter(request, prefix + "if_err_rsn      		".trim(), length));
			String[] ppay_aply_flg    =  (JSPUtil.getParameter(request, prefix + "ppay_aply_flg   		".trim(), length));
			String[] tj_ofc_cd        =  (JSPUtil.getParameter(request, prefix + "tj_ofc_cd       		".trim(), length));
			String[] act_xch_rt       =  (JSPUtil.getParameter(request, prefix + "act_xch_rt      		".trim(), length));
			String[] imp_err_flg      =  (JSPUtil.getParameter(request, prefix + "imp_err_flg     		".trim(), length));
			String[] rcv_err_flg      =  (JSPUtil.getParameter(request, prefix + "rcv_err_flg     		".trim(), length));
			String[] tax_curr_xch_flg =  (JSPUtil.getParameter(request, prefix + "tax_curr_xch_flg		".trim(), length));
			String[] usr_eml          =  (JSPUtil.getParameter(request, prefix + "usr_eml         		".trim(), length));
			String[] imp_err_rsn      =  (JSPUtil.getParameter(request, prefix + "imp_err_rsn     		".trim(), length));
			String[] rcv_err_rsn      =  (JSPUtil.getParameter(request, prefix + "rcv_err_rsn     		".trim(), length));
			String[] ftu_use_ctnt1    =  (JSPUtil.getParameter(request, prefix + "ftu_use_ctnt1   		".trim(), length));
			String[] ftu_use_ctnt2    =  (JSPUtil.getParameter(request, prefix + "ftu_use_ctnt2   		".trim(), length));
			String[] ftu_use_ctnt3    =  (JSPUtil.getParameter(request, prefix + "ftu_use_ctnt3   		".trim(), length));
			String[] ftu_use_ctnt4    =  (JSPUtil.getParameter(request, prefix + "ftu_use_ctnt4   		".trim(), length));
			String[] ftu_use_ctnt5    =  (JSPUtil.getParameter(request, prefix + "ftu_use_ctnt5   		".trim(), length));
			String[] cre_dt           =  (JSPUtil.getParameter(request, prefix + "cre_dt          		".trim(), length));
			String[] cre_usr_id       =  (JSPUtil.getParameter(request, prefix + "cre_usr_id      		".trim(), length));
			String[] eai_evnt_dt      =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt     		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new AP_INV_HDR();
				model.setIbflag          		  ( ibflag          	[i]);
				model.setPage_rows       		  ( page_rows       	[i]);
				model.setCsr_no          		  ( csr_no          	[i]);
				model.setCsr_tp_cd       		  ( csr_tp_cd       	[i]);
				model.setInv_dt          		  ( inv_dt          	[i]);
				model.setInv_term_dt     		  ( inv_term_dt     	[i]);
				model.setGl_dt           		  ( gl_dt           	[i]);
				model.setVndr_no         		  ( vndr_no         	[i]);
				model.setCsr_amt         		  ( csr_amt         	[i]);
				model.setPay_amt         		  ( pay_amt         	[i]);
				model.setPay_dt          		  ( pay_dt          	[i]);
				model.setCsr_curr_cd     		  ( csr_curr_cd     	[i]);
				model.setVndr_term_nm    		  ( vndr_term_nm    	[i]);
				model.setInv_desc        		  ( inv_desc        	[i]);
				model.setAttr_cate_nm    		  ( attr_cate_nm    	[i]);
				model.setAttr_ctnt1      		  ( attr_ctnt1      	[i]);
				model.setAttr_ctnt2      		  ( attr_ctnt2      	[i]);
				model.setAttr_ctnt3      		  ( attr_ctnt3      	[i]);
				model.setAttr_ctnt4      		  ( attr_ctnt4      	[i]);
				model.setAttr_ctnt5      		  ( attr_ctnt5      	[i]);
				model.setAttr_ctnt6      		  ( attr_ctnt6      	[i]);
				model.setAttr_ctnt7      		  ( attr_ctnt7      	[i]);
				model.setAttr_ctnt8      		  ( attr_ctnt8      	[i]);
				model.setAttr_ctnt9      		  ( attr_ctnt9      	[i]);
				model.setAttr_ctnt10     		  ( attr_ctnt10     	[i]);
				model.setAttr_ctnt11     		  ( attr_ctnt11     	[i]);
				model.setAttr_ctnt12     		  ( attr_ctnt12     	[i]);
				model.setAttr_ctnt13     		  ( attr_ctnt13     	[i]);
				model.setAttr_ctnt14     		  ( attr_ctnt14     	[i]);
				model.setAttr_ctnt15     		  ( attr_ctnt15     	[i]);
				model.setGlo_attr_ctnt1  		  ( glo_attr_ctnt1  	[i]);
				model.setGlo_attr_ctnt2  		  ( glo_attr_ctnt2  	[i]);
				model.setGlo_attr_ctnt3  		  ( glo_attr_ctnt3  	[i]);
				model.setGlo_attr_ctnt4  		  ( glo_attr_ctnt4  	[i]);
				model.setGlo_attr_ctnt5  		  ( glo_attr_ctnt5  	[i]);
				model.setGlo_attr_ctnt6  		  ( glo_attr_ctnt6  	[i]);
				model.setGlo_attr_ctnt7  		  ( glo_attr_ctnt7  	[i]);
				model.setGlo_attr_ctnt8  		  ( glo_attr_ctnt8  	[i]);
				model.setGlo_attr_ctnt9  		  ( glo_attr_ctnt9  	[i]);
				model.setGlo_attr_ctnt10 		  ( glo_attr_ctnt10 	[i]);
				model.setGlo_attr_ctnt11 		  ( glo_attr_ctnt11 	[i]);
				model.setGlo_attr_ctnt12 		  ( glo_attr_ctnt12 	[i]);
				model.setGlo_attr_ctnt13 		  ( glo_attr_ctnt13 	[i]);
				model.setGlo_attr_ctnt14 		  ( glo_attr_ctnt14 	[i]);
				model.setGlo_attr_ctnt15 		  ( glo_attr_ctnt15 	[i]);
				model.setGlo_attr_ctnt16 		  ( glo_attr_ctnt16 	[i]);
				model.setGlo_attr_ctnt17 		  ( glo_attr_ctnt17 	[i]);
				model.setGlo_attr_ctnt18 		  ( glo_attr_ctnt18 	[i]);
				model.setSrc_ctnt        		  ( src_ctnt        	[i]);
				model.setPay_mzd_lu_cd   		  ( pay_mzd_lu_cd   	[i]);
				model.setPay_grp_lu_cd   		  ( pay_grp_lu_cd   	[i]);
				model.setCoa_co_cd       		  ( coa_co_cd       	[i]);
				model.setCoa_rgn_cd      		  ( coa_rgn_cd      	[i]);
				model.setCoa_ctr_cd      		  ( coa_ctr_cd      	[i]);
				model.setCoa_acct_cd     		  ( coa_acct_cd     	[i]);
				model.setCoa_vvd_cd      		  ( coa_vvd_cd      	[i]);
				model.setCoa_inter_co_cd 		  ( coa_inter_co_cd 	[i]);
				model.setCoa_ftu_n1st_cd 		  ( coa_ftu_n1st_cd 	[i]);
				model.setCoa_ftu_n2nd_cd 		  ( coa_ftu_n2nd_cd 	[i]);
				model.setPpd_no          		  ( ppd_no          	[i]);
				model.setPpd_dtrb_no     		  ( ppd_dtrb_no     	[i]);
				model.setPpd_aply_amt    		  ( ppd_aply_amt    	[i]);
				model.setPpd_gl_dt       		  ( ppd_gl_dt       	[i]);
				model.setApro_flg        		  ( apro_flg        	[i]);
				model.setTax_decl_flg    		  ( tax_decl_flg    	[i]);
				model.setErr_csr_no      		  ( err_csr_no      	[i]);
				model.setIf_flg          		  ( if_flg          	[i]);
				model.setIf_dt           		  ( if_dt           	[i]);
				model.setIf_err_rsn      		  ( if_err_rsn      	[i]);
				model.setPpay_aply_flg   		  ( ppay_aply_flg   	[i]);
				model.setTj_ofc_cd       		  ( tj_ofc_cd       	[i]);
				model.setAct_xch_rt      		  ( act_xch_rt      	[i]);
				model.setImp_err_flg     		  ( imp_err_flg     	[i]);
				model.setRcv_err_flg     		  ( rcv_err_flg     	[i]);
				model.setTax_curr_xch_flg		  ( tax_curr_xch_flg	[i]);
				model.setUsr_eml         		  ( usr_eml         	[i]);
				model.setImp_err_rsn     		  ( imp_err_rsn     	[i]);
				model.setRcv_err_rsn     		  ( rcv_err_rsn     	[i]);
				model.setFtu_use_ctnt1   		  ( ftu_use_ctnt1   	[i]);
				model.setFtu_use_ctnt2   		  ( ftu_use_ctnt2   	[i]);
				model.setFtu_use_ctnt3   		  ( ftu_use_ctnt3   	[i]);
				model.setFtu_use_ctnt4   		  ( ftu_use_ctnt4   	[i]);
				model.setFtu_use_ctnt5   		  ( ftu_use_ctnt5   	[i]);
				model.setCre_dt          		  ( cre_dt          	[i]);
				model.setCre_usr_id      		  ( cre_usr_id      	[i]);
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
