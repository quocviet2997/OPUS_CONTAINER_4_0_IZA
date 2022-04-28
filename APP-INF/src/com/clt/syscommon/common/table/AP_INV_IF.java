/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : AP_INV_IF.java
*@FileTitle : Terminal invoice CSR Interface Temp
*Open Issues :
*Change history :
*@LastModifyDate : 2007-03-05
*@LastModifier : Jung-Hyung,Kim
*@LastVersion : 1.0
* 2007-03-05 Jung-Hyung,Kim
* 1.0 최초 생성
* 2009-07-23 Lee Ho Jin : N200907010040 GT 추정 결산 관련 업무 개선(cxl_dt 추가)
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
public final class AP_INV_IF implements java.io.Serializable {

	private String  ibflag                = "";
	private String  page_rows             = "";
	private String 	ap_pgm_no             = "";
	private String 	inv_seq               = "";
	private String 	ttl_row_knt           = "";
	private String 	row_knt               = "";
	private String 	hdr_csr_no            = "";
	private String 	hdr_csr_tp_cd         = "";
	private String 	hdr_inv_dt            = "";
	private String 	hdr_inv_term_dt       = "";
	private String 	hdr_gl_dt             = "";
	private String 	hdr_vndr_no           = "";
	private String 	hdr_csr_amt           = "";
	private String 	hdr_pay_amt           = "";
	private String 	hdr_pay_dt            = "";
	private String 	hdr_csr_curr_cd       = "";
	private String 	hdr_vndr_term_nm      = "";
	private String 	hdr_inv_desc          = "";
	private String 	hdr_attr_cate_nm      = "";
	private String 	hdr_attr_ctnt1        = "";
	private String 	hdr_attr_ctnt2        = "";
	private String 	hdr_attr_ctnt3        = "";
	private String 	hdr_attr_ctnt4        = "";
	private String 	hdr_attr_ctnt5        = "";
	private String 	hdr_attr_ctnt6        = "";
	private String 	hdr_attr_ctnt7        = "";
	private String 	hdr_attr_ctnt8        = "";
	private String 	hdr_attr_ctnt9        = "";
	private String 	hdr_attr_ctnt10       = "";
	private String 	hdr_attr_ctnt11       = "";
	private String 	hdr_attr_ctnt12       = "";
	private String 	hdr_attr_ctnt13       = "";
	private String 	hdr_attr_ctnt14       = "";
	private String 	hdr_attr_ctnt15       = "";
	private String 	hdr_glo_attr_ctnt1    = "";
	private String 	hdr_glo_attr_ctnt2    = "";
	private String 	hdr_glo_attr_ctnt3    = "";
	private String 	hdr_glo_attr_ctnt4    = "";
	private String 	hdr_glo_attr_ctnt5    = "";
	private String 	hdr_glo_attr_ctnt6    = "";
	private String 	hdr_glo_attr_ctnt7    = "";
	private String 	hdr_glo_attr_ctnt8    = "";
	private String 	hdr_glo_attr_ctnt9    = "";
	private String 	hdr_glo_attr_ctnt10   = "";
	private String 	hdr_glo_attr_ctnt11   = "";
	private String 	hdr_glo_attr_ctnt12   = "";
	private String 	hdr_glo_attr_ctnt13   = "";
	private String 	hdr_glo_attr_ctnt14   = "";
	private String 	hdr_glo_attr_ctnt15   = "";
	private String 	hdr_glo_attr_ctnt16   = "";
	private String 	hdr_glo_attr_ctnt17   = "";
	private String 	hdr_glo_attr_ctnt18   = "";
	private String 	hdr_src_ctnt          = "";
	private String 	hdr_pay_mzd_lu_cd     = "";
	private String 	hdr_pay_grp_lu_cd     = "";
	private String 	hdr_coa_co_cd         = "";
	private String 	hdr_coa_rgn_cd        = "";
	private String 	hdr_coa_ctr_cd        = "";
	private String 	hdr_coa_acct_cd       = "";
	private String 	hdr_coa_vvd_cd        = "";
	private String 	hdr_coa_inter_co_cd   = "";
	private String 	hdr_coa_ftu_n1st_cd   = "";
	private String 	hdr_coa_ftu_n2nd_cd   = "";
	private String 	hdr_ppd_no            = "";
	private String 	hdr_ppd_dtrb_no       = "";
	private String 	hdr_ppd_aply_amt      = "";
	private String 	hdr_ppd_gl_dt         = "";
	private String 	hdr_apro_flg          = "";
	private String 	hdr_tax_decl_flg      = "";
	private String 	hdr_err_csr_no        = "";
	private String 	hdr_if_flg            = "";
	private String 	hdr_if_dt             = "";
	private String 	hdr_if_err_rsn        = "";
	private String 	hdr_ppay_aply_flg     = "";
	private String 	hdr_tj_ofc_cd         = "";
	private String 	hdr_act_xch_rt        = "";
	private String 	hdr_imp_err_flg       = "";
	private String 	hdr_rcv_err_flg       = "";
	private String 	hdr_tax_curr_xch_flg  = "";
	private String 	hdr_usr_eml           = "";
	private String 	hdr_imp_err_rsn       = "";
	private String 	hdr_rcv_err_rsn       = "";
	private String 	hdr_ftu_use_ctnt1     = "";
	private String 	hdr_ftu_use_ctnt2     = "";
	private String 	hdr_ftu_use_ctnt3     = "";
	private String 	hdr_ftu_use_ctnt4     = "";
	private String 	hdr_ftu_use_ctnt5     = "";
	private String 	csr_no                = "";
	private String 	line_seq              = "";
	private String 	line_no               = "";
	private String 	line_tp_lu_cd         = "";
	private String 	inv_amt               = "";
	private String 	inv_desc              = "";
	private String 	inv_tax_cd            = "";
	private String 	dtrb_coa_co_cd        = "";
	private String 	dtrb_coa_rgn_cd       = "";
	private String 	dtrb_coa_ctr_cd       = "";
	private String 	dtrb_coa_acct_cd      = "";
	private String 	dtrb_coa_vvd_cd       = "";
	private String 	dtrb_coa_inter_co_cd  = "";
	private String 	dtrb_coa_ftu_n1st_cd  = "";
	private String 	dtrb_coa_ftu_n2nd_cd  = "";
	private String 	attr_cate_nm          = "";
	private String 	attr_ctnt1            = "";
	private String 	attr_ctnt2            = "";
	private String 	attr_ctnt3            = "";
	private String 	attr_ctnt4            = "";
	private String 	attr_ctnt5            = "";
	private String 	attr_ctnt6            = "";
	private String 	attr_ctnt7            = "";
	private String 	attr_ctnt8            = "";
	private String 	attr_ctnt9            = "";
	private String 	attr_ctnt10           = "";
	private String 	attr_ctnt11           = "";
	private String 	attr_ctnt12           = "";
	private String 	attr_ctnt13           = "";
	private String 	attr_ctnt14           = "";
	private String 	attr_ctnt15           = "";
	private String 	bkg_no                = "";
	private String 	bkg_no_split          = "";
	private String 	cntr_tpsz_cd          = "";
	private String 	act_vvd_cd            = "";
	private String 	pln_sctr_div_cd       = "";
	private String 	so_crr_cd             = "";
	private String 	yd_cd                 = "";
	private String 	ftu_use_ctnt1         = "";
	private String 	ftu_use_ctnt2         = "";
	private String 	ftu_use_ctnt3         = "";
	private String 	ftu_use_ctnt4         = "";
	private String 	ftu_use_ctnt5         = "";
	private String 	snd_flg               = "";
	private String 	cre_dt                = "";
	private String 	cre_usr_id            = "";
	private String 	eai_evnt_dt           = "";
	private String  cxl_dt				  = "";
			
	public AP_INV_IF(){}

	public AP_INV_IF(
			String ibflag               ,
			String page_rows            ,
			String ap_pgm_no            ,
			String inv_seq              ,
			String ttl_row_knt          ,
			String row_knt              ,
			String hdr_csr_no           ,
			String hdr_csr_tp_cd        ,
			String hdr_inv_dt           ,
			String hdr_inv_term_dt      ,
			String hdr_gl_dt            ,
			String hdr_vndr_no          ,
			String hdr_csr_amt          ,
			String hdr_pay_amt          ,
			String hdr_pay_dt           ,
			String hdr_csr_curr_cd      ,
			String hdr_vndr_term_nm     ,
			String hdr_inv_desc         ,
			String hdr_attr_cate_nm     ,
			String hdr_attr_ctnt1       ,
			String hdr_attr_ctnt2       ,
			String hdr_attr_ctnt3       ,
			String hdr_attr_ctnt4       ,
			String hdr_attr_ctnt5       ,
			String hdr_attr_ctnt6       ,
			String hdr_attr_ctnt7       ,
			String hdr_attr_ctnt8       ,
			String hdr_attr_ctnt9       ,
			String hdr_attr_ctnt10      ,
			String hdr_attr_ctnt11      ,
			String hdr_attr_ctnt12      ,
			String hdr_attr_ctnt13      ,
			String hdr_attr_ctnt14      ,
			String hdr_attr_ctnt15      ,
			String hdr_glo_attr_ctnt1   ,
			String hdr_glo_attr_ctnt2   ,
			String hdr_glo_attr_ctnt3   ,
			String hdr_glo_attr_ctnt4   ,
			String hdr_glo_attr_ctnt5   ,
			String hdr_glo_attr_ctnt6   ,
			String hdr_glo_attr_ctnt7   ,
			String hdr_glo_attr_ctnt8   ,
			String hdr_glo_attr_ctnt9   ,
			String hdr_glo_attr_ctnt10  ,
			String hdr_glo_attr_ctnt11  ,
			String hdr_glo_attr_ctnt12  ,
			String hdr_glo_attr_ctnt13  ,
			String hdr_glo_attr_ctnt14  ,
			String hdr_glo_attr_ctnt15  ,
			String hdr_glo_attr_ctnt16  ,
			String hdr_glo_attr_ctnt17  ,
			String hdr_glo_attr_ctnt18  ,
			String hdr_src_ctnt         ,
			String hdr_pay_mzd_lu_cd    ,
			String hdr_pay_grp_lu_cd    ,
			String hdr_coa_co_cd        ,
			String hdr_coa_rgn_cd       ,
			String hdr_coa_ctr_cd       ,
			String hdr_coa_acct_cd      ,
			String hdr_coa_vvd_cd       ,
			String hdr_coa_inter_co_cd  ,
			String hdr_coa_ftu_n1st_cd  ,
			String hdr_coa_ftu_n2nd_cd  ,
			String hdr_ppd_no           ,
			String hdr_ppd_dtrb_no      ,
			String hdr_ppd_aply_amt     ,
			String hdr_ppd_gl_dt        ,
			String hdr_apro_flg         ,
			String hdr_tax_decl_flg     ,
			String hdr_err_csr_no       ,
			String hdr_if_flg           ,
			String hdr_if_dt            ,
			String hdr_if_err_rsn       ,
			String hdr_ppay_aply_flg    ,
			String hdr_tj_ofc_cd        ,
			String hdr_act_xch_rt       ,
			String hdr_imp_err_flg      ,
			String hdr_rcv_err_flg      ,
			String hdr_tax_curr_xch_flg ,
			String hdr_usr_eml          ,
			String hdr_imp_err_rsn      ,
			String hdr_rcv_err_rsn      ,
			String hdr_ftu_use_ctnt1    ,
			String hdr_ftu_use_ctnt2    ,
			String hdr_ftu_use_ctnt3    ,
			String hdr_ftu_use_ctnt4    ,
			String hdr_ftu_use_ctnt5    ,
			String csr_no               ,
			String line_seq             ,
			String line_no              ,
			String line_tp_lu_cd        ,
			String inv_amt              ,
			String inv_desc             ,
			String inv_tax_cd           ,
			String dtrb_coa_co_cd       ,
			String dtrb_coa_rgn_cd      ,
			String dtrb_coa_ctr_cd      ,
			String dtrb_coa_acct_cd     ,
			String dtrb_coa_vvd_cd      ,
			String dtrb_coa_inter_co_cd ,
			String dtrb_coa_ftu_n1st_cd ,
			String dtrb_coa_ftu_n2nd_cd ,
			String attr_cate_nm         ,
			String attr_ctnt1           ,
			String attr_ctnt2           ,
			String attr_ctnt3           ,
			String attr_ctnt4           ,
			String attr_ctnt5           ,
			String attr_ctnt6           ,
			String attr_ctnt7           ,
			String attr_ctnt8           ,
			String attr_ctnt9           ,
			String attr_ctnt10          ,
			String attr_ctnt11          ,
			String attr_ctnt12          ,
			String attr_ctnt13          ,
			String attr_ctnt14          ,
			String attr_ctnt15          ,
			String bkg_no               ,
			String bkg_no_split         ,
			String cntr_tpsz_cd         ,
			String act_vvd_cd           ,
			String pln_sctr_div_cd      ,
			String so_crr_cd            ,
			String yd_cd                ,
			String ftu_use_ctnt1        ,
			String ftu_use_ctnt2        ,
			String ftu_use_ctnt3        ,
			String ftu_use_ctnt4        ,
			String ftu_use_ctnt5        ,
			String snd_flg              ,
			String cre_dt               ,
			String cre_usr_id           ,
			String eai_evnt_dt          ,
			String cxl_dt				){
		this.ibflag               = ibflag               ;
		this.page_rows            = page_rows            ;
		this.ap_pgm_no            = ap_pgm_no            ;
		this.inv_seq              = inv_seq              ;
		this.ttl_row_knt          = ttl_row_knt          ;
		this.row_knt              = row_knt              ;
		this.hdr_csr_no           = hdr_csr_no           ;
		this.hdr_csr_tp_cd        = hdr_csr_tp_cd        ;
		this.hdr_inv_dt           = hdr_inv_dt           ;
		this.hdr_inv_term_dt      = hdr_inv_term_dt      ;
		this.hdr_gl_dt            = hdr_gl_dt            ;
		this.hdr_vndr_no          = hdr_vndr_no          ;
		this.hdr_csr_amt          = hdr_csr_amt          ;
		this.hdr_pay_amt          = hdr_pay_amt          ;
		this.hdr_pay_dt           = hdr_pay_dt           ;
		this.hdr_csr_curr_cd      = hdr_csr_curr_cd      ;
		this.hdr_vndr_term_nm     = hdr_vndr_term_nm     ;
		this.hdr_inv_desc         = hdr_inv_desc         ;
		this.hdr_attr_cate_nm     = hdr_attr_cate_nm     ;
		this.hdr_attr_ctnt1       = hdr_attr_ctnt1       ;
		this.hdr_attr_ctnt2       = hdr_attr_ctnt2       ;
		this.hdr_attr_ctnt3       = hdr_attr_ctnt3       ;
		this.hdr_attr_ctnt4       = hdr_attr_ctnt4       ;
		this.hdr_attr_ctnt5       = hdr_attr_ctnt5       ;
		this.hdr_attr_ctnt6       = hdr_attr_ctnt6       ;
		this.hdr_attr_ctnt7       = hdr_attr_ctnt7       ;
		this.hdr_attr_ctnt8       = hdr_attr_ctnt8       ;
		this.hdr_attr_ctnt9       = hdr_attr_ctnt9       ;
		this.hdr_attr_ctnt10      = hdr_attr_ctnt10      ;
		this.hdr_attr_ctnt11      = hdr_attr_ctnt11      ;
		this.hdr_attr_ctnt12      = hdr_attr_ctnt12      ;
		this.hdr_attr_ctnt13      = hdr_attr_ctnt13      ;
		this.hdr_attr_ctnt14      = hdr_attr_ctnt14      ;
		this.hdr_attr_ctnt15      = hdr_attr_ctnt15      ;
		this.hdr_glo_attr_ctnt1   = hdr_glo_attr_ctnt1   ;
		this.hdr_glo_attr_ctnt2   = hdr_glo_attr_ctnt2   ;
		this.hdr_glo_attr_ctnt3   = hdr_glo_attr_ctnt3   ;
		this.hdr_glo_attr_ctnt4   = hdr_glo_attr_ctnt4   ;
		this.hdr_glo_attr_ctnt5   = hdr_glo_attr_ctnt5   ;
		this.hdr_glo_attr_ctnt6   = hdr_glo_attr_ctnt6   ;
		this.hdr_glo_attr_ctnt7   = hdr_glo_attr_ctnt7   ;
		this.hdr_glo_attr_ctnt8   = hdr_glo_attr_ctnt8   ;
		this.hdr_glo_attr_ctnt9   = hdr_glo_attr_ctnt9   ;
		this.hdr_glo_attr_ctnt10  = hdr_glo_attr_ctnt10  ;
		this.hdr_glo_attr_ctnt11  = hdr_glo_attr_ctnt11  ;
		this.hdr_glo_attr_ctnt12  = hdr_glo_attr_ctnt12  ;
		this.hdr_glo_attr_ctnt13  = hdr_glo_attr_ctnt13  ;
		this.hdr_glo_attr_ctnt14  = hdr_glo_attr_ctnt14  ;
		this.hdr_glo_attr_ctnt15  = hdr_glo_attr_ctnt15  ;
		this.hdr_glo_attr_ctnt16  = hdr_glo_attr_ctnt16  ;
		this.hdr_glo_attr_ctnt17  = hdr_glo_attr_ctnt17  ;
		this.hdr_glo_attr_ctnt18  = hdr_glo_attr_ctnt18  ;
		this.hdr_src_ctnt         = hdr_src_ctnt         ;
		this.hdr_pay_mzd_lu_cd    = hdr_pay_mzd_lu_cd    ;
		this.hdr_pay_grp_lu_cd    = hdr_pay_grp_lu_cd    ;
		this.hdr_coa_co_cd        = hdr_coa_co_cd        ;
		this.hdr_coa_rgn_cd       = hdr_coa_rgn_cd       ;
		this.hdr_coa_ctr_cd       = hdr_coa_ctr_cd       ;
		this.hdr_coa_acct_cd      = hdr_coa_acct_cd      ;
		this.hdr_coa_vvd_cd       = hdr_coa_vvd_cd       ;
		this.hdr_coa_inter_co_cd  = hdr_coa_inter_co_cd  ;
		this.hdr_coa_ftu_n1st_cd  = hdr_coa_ftu_n1st_cd  ;
		this.hdr_coa_ftu_n2nd_cd  = hdr_coa_ftu_n2nd_cd  ;
		this.hdr_ppd_no           = hdr_ppd_no           ;
		this.hdr_ppd_dtrb_no      = hdr_ppd_dtrb_no      ;
		this.hdr_ppd_aply_amt     = hdr_ppd_aply_amt     ;
		this.hdr_ppd_gl_dt        = hdr_ppd_gl_dt        ;
		this.hdr_apro_flg         = hdr_apro_flg         ;
		this.hdr_tax_decl_flg     = hdr_tax_decl_flg     ;
		this.hdr_err_csr_no       = hdr_err_csr_no       ;
		this.hdr_if_flg           = hdr_if_flg           ;
		this.hdr_if_dt            = hdr_if_dt            ;
		this.hdr_if_err_rsn       = hdr_if_err_rsn       ;
		this.hdr_ppay_aply_flg    = hdr_ppay_aply_flg    ;
		this.hdr_tj_ofc_cd        = hdr_tj_ofc_cd        ;
		this.hdr_act_xch_rt       = hdr_act_xch_rt       ;
		this.hdr_imp_err_flg      = hdr_imp_err_flg      ;
		this.hdr_rcv_err_flg      = hdr_rcv_err_flg      ;
		this.hdr_tax_curr_xch_flg = hdr_tax_curr_xch_flg ;
		this.hdr_usr_eml          = hdr_usr_eml          ;
		this.hdr_imp_err_rsn      = hdr_imp_err_rsn      ;
		this.hdr_rcv_err_rsn      = hdr_rcv_err_rsn      ;
		this.hdr_ftu_use_ctnt1    = hdr_ftu_use_ctnt1    ;
		this.hdr_ftu_use_ctnt2    = hdr_ftu_use_ctnt2    ;
		this.hdr_ftu_use_ctnt3    = hdr_ftu_use_ctnt3    ;
		this.hdr_ftu_use_ctnt4    = hdr_ftu_use_ctnt4    ;
		this.hdr_ftu_use_ctnt5    = hdr_ftu_use_ctnt5    ;
		this.csr_no               = csr_no               ;
		this.line_seq             = line_seq             ;
		this.line_no              = line_no              ;
		this.line_tp_lu_cd        = line_tp_lu_cd        ;
		this.inv_amt              = inv_amt              ;
		this.inv_desc             = inv_desc             ;
		this.inv_tax_cd           = inv_tax_cd           ;
		this.dtrb_coa_co_cd       = dtrb_coa_co_cd       ;
		this.dtrb_coa_rgn_cd      = dtrb_coa_rgn_cd      ;
		this.dtrb_coa_ctr_cd      = dtrb_coa_ctr_cd      ;
		this.dtrb_coa_acct_cd     = dtrb_coa_acct_cd     ;
		this.dtrb_coa_vvd_cd      = dtrb_coa_vvd_cd      ;
		this.dtrb_coa_inter_co_cd = dtrb_coa_inter_co_cd ;
		this.dtrb_coa_ftu_n1st_cd = dtrb_coa_ftu_n1st_cd ;
		this.dtrb_coa_ftu_n2nd_cd = dtrb_coa_ftu_n2nd_cd ;
		this.attr_cate_nm         = attr_cate_nm         ;
		this.attr_ctnt1           = attr_ctnt1           ;
		this.attr_ctnt2           = attr_ctnt2           ;
		this.attr_ctnt3           = attr_ctnt3           ;
		this.attr_ctnt4           = attr_ctnt4           ;
		this.attr_ctnt5           = attr_ctnt5           ;
		this.attr_ctnt6           = attr_ctnt6           ;
		this.attr_ctnt7           = attr_ctnt7           ;
		this.attr_ctnt8           = attr_ctnt8           ;
		this.attr_ctnt9           = attr_ctnt9           ;
		this.attr_ctnt10          = attr_ctnt10          ;
		this.attr_ctnt11          = attr_ctnt11          ;
		this.attr_ctnt12          = attr_ctnt12          ;
		this.attr_ctnt13          = attr_ctnt13          ;
		this.attr_ctnt14          = attr_ctnt14          ;
		this.attr_ctnt15          = attr_ctnt15          ;
		this.bkg_no               = bkg_no               ;
		this.bkg_no_split         = bkg_no_split         ;
		this.cntr_tpsz_cd         = cntr_tpsz_cd         ;
		this.act_vvd_cd           = act_vvd_cd           ;
		this.pln_sctr_div_cd      = pln_sctr_div_cd      ;
		this.so_crr_cd            = so_crr_cd            ;
		this.yd_cd                = yd_cd                ;
		this.ftu_use_ctnt1        = ftu_use_ctnt1        ;
		this.ftu_use_ctnt2        = ftu_use_ctnt2        ;
		this.ftu_use_ctnt3        = ftu_use_ctnt3        ;
		this.ftu_use_ctnt4        = ftu_use_ctnt4        ;
		this.ftu_use_ctnt5        = ftu_use_ctnt5        ;
		this.snd_flg              = snd_flg              ;
		this.cre_dt               = cre_dt               ;
		this.cre_usr_id           = cre_usr_id           ;
		this.eai_evnt_dt          = eai_evnt_dt          ;
		this.cxl_dt		          = cxl_dt		         ;
	}
	
	// getter method is proceeding ..
	public String getIbflag               (){ return ibflag               ; }
	public String getPage_rows            (){ return page_rows            ; }
	public String getAp_pgm_no            (){ return ap_pgm_no            ; }
	public String getInv_seq              (){ return inv_seq              ; }
	public String getTtl_row_knt          (){ return ttl_row_knt          ; }
	public String getRow_knt              (){ return row_knt              ; }
	public String getHdr_csr_no           (){ return hdr_csr_no           ; }
	public String getHdr_csr_tp_cd        (){ return hdr_csr_tp_cd        ; }
	public String getHdr_inv_dt           (){ return hdr_inv_dt           ; }
	public String getHdr_inv_term_dt      (){ return hdr_inv_term_dt      ; }
	public String getHdr_gl_dt            (){ return hdr_gl_dt            ; }
	public String getHdr_vndr_no          (){ return hdr_vndr_no          ; }
	public String getHdr_csr_amt          (){ return hdr_csr_amt          ; }
	public String getHdr_pay_amt          (){ return hdr_pay_amt          ; }
	public String getHdr_pay_dt           (){ return hdr_pay_dt           ; }
	public String getHdr_csr_curr_cd      (){ return hdr_csr_curr_cd      ; }
	public String getHdr_vndr_term_nm     (){ return hdr_vndr_term_nm     ; }
	public String getHdr_inv_desc         (){ return hdr_inv_desc         ; }
	public String getHdr_attr_cate_nm     (){ return hdr_attr_cate_nm     ; }
	public String getHdr_attr_ctnt1       (){ return hdr_attr_ctnt1       ; }
	public String getHdr_attr_ctnt2       (){ return hdr_attr_ctnt2       ; }
	public String getHdr_attr_ctnt3       (){ return hdr_attr_ctnt3       ; }
	public String getHdr_attr_ctnt4       (){ return hdr_attr_ctnt4       ; }
	public String getHdr_attr_ctnt5       (){ return hdr_attr_ctnt5       ; }
	public String getHdr_attr_ctnt6       (){ return hdr_attr_ctnt6       ; }
	public String getHdr_attr_ctnt7       (){ return hdr_attr_ctnt7       ; }
	public String getHdr_attr_ctnt8       (){ return hdr_attr_ctnt8       ; }
	public String getHdr_attr_ctnt9       (){ return hdr_attr_ctnt9       ; }
	public String getHdr_attr_ctnt10      (){ return hdr_attr_ctnt10      ; }
	public String getHdr_attr_ctnt11      (){ return hdr_attr_ctnt11      ; }
	public String getHdr_attr_ctnt12      (){ return hdr_attr_ctnt12      ; }
	public String getHdr_attr_ctnt13      (){ return hdr_attr_ctnt13      ; }
	public String getHdr_attr_ctnt14      (){ return hdr_attr_ctnt14      ; }
	public String getHdr_attr_ctnt15      (){ return hdr_attr_ctnt15      ; }
	public String getHdr_glo_attr_ctnt1   (){ return hdr_glo_attr_ctnt1   ; }
	public String getHdr_glo_attr_ctnt2   (){ return hdr_glo_attr_ctnt2   ; }
	public String getHdr_glo_attr_ctnt3   (){ return hdr_glo_attr_ctnt3   ; }
	public String getHdr_glo_attr_ctnt4   (){ return hdr_glo_attr_ctnt4   ; }
	public String getHdr_glo_attr_ctnt5   (){ return hdr_glo_attr_ctnt5   ; }
	public String getHdr_glo_attr_ctnt6   (){ return hdr_glo_attr_ctnt6   ; }
	public String getHdr_glo_attr_ctnt7   (){ return hdr_glo_attr_ctnt7   ; }
	public String getHdr_glo_attr_ctnt8   (){ return hdr_glo_attr_ctnt8   ; }
	public String getHdr_glo_attr_ctnt9   (){ return hdr_glo_attr_ctnt9   ; }
	public String getHdr_glo_attr_ctnt10  (){ return hdr_glo_attr_ctnt10  ; }
	public String getHdr_glo_attr_ctnt11  (){ return hdr_glo_attr_ctnt11  ; }
	public String getHdr_glo_attr_ctnt12  (){ return hdr_glo_attr_ctnt12  ; }
	public String getHdr_glo_attr_ctnt13  (){ return hdr_glo_attr_ctnt13  ; }
	public String getHdr_glo_attr_ctnt14  (){ return hdr_glo_attr_ctnt14  ; }
	public String getHdr_glo_attr_ctnt15  (){ return hdr_glo_attr_ctnt15  ; }
	public String getHdr_glo_attr_ctnt16  (){ return hdr_glo_attr_ctnt16  ; }
	public String getHdr_glo_attr_ctnt17  (){ return hdr_glo_attr_ctnt17  ; }
	public String getHdr_glo_attr_ctnt18  (){ return hdr_glo_attr_ctnt18  ; }
	public String getHdr_src_ctnt         (){ return hdr_src_ctnt         ; }
	public String getHdr_pay_mzd_lu_cd    (){ return hdr_pay_mzd_lu_cd    ; }
	public String getHdr_pay_grp_lu_cd    (){ return hdr_pay_grp_lu_cd    ; }
	public String getHdr_coa_co_cd        (){ return hdr_coa_co_cd        ; }
	public String getHdr_coa_rgn_cd       (){ return hdr_coa_rgn_cd       ; }
	public String getHdr_coa_ctr_cd       (){ return hdr_coa_ctr_cd       ; }
	public String getHdr_coa_acct_cd      (){ return hdr_coa_acct_cd      ; }
	public String getHdr_coa_vvd_cd       (){ return hdr_coa_vvd_cd       ; }
	public String getHdr_coa_inter_co_cd  (){ return hdr_coa_inter_co_cd  ; }
	public String getHdr_coa_ftu_n1st_cd  (){ return hdr_coa_ftu_n1st_cd  ; }
	public String getHdr_coa_ftu_n2nd_cd  (){ return hdr_coa_ftu_n2nd_cd  ; }
	public String getHdr_ppd_no           (){ return hdr_ppd_no           ; }
	public String getHdr_ppd_dtrb_no      (){ return hdr_ppd_dtrb_no      ; }
	public String getHdr_ppd_aply_amt     (){ return hdr_ppd_aply_amt     ; }
	public String getHdr_ppd_gl_dt        (){ return hdr_ppd_gl_dt        ; }
	public String getHdr_apro_flg         (){ return hdr_apro_flg         ; }
	public String getHdr_tax_decl_flg     (){ return hdr_tax_decl_flg     ; }
	public String getHdr_err_csr_no       (){ return hdr_err_csr_no       ; }
	public String getHdr_if_flg           (){ return hdr_if_flg           ; }
	public String getHdr_if_dt            (){ return hdr_if_dt            ; }
	public String getHdr_if_err_rsn       (){ return hdr_if_err_rsn       ; }
	public String getHdr_ppay_aply_flg    (){ return hdr_ppay_aply_flg    ; }
	public String getHdr_tj_ofc_cd        (){ return hdr_tj_ofc_cd        ; }
	public String getHdr_act_xch_rt       (){ return hdr_act_xch_rt       ; }
	public String getHdr_imp_err_flg      (){ return hdr_imp_err_flg      ; }
	public String getHdr_rcv_err_flg      (){ return hdr_rcv_err_flg      ; }
	public String getHdr_tax_curr_xch_flg (){ return hdr_tax_curr_xch_flg ; }
	public String getHdr_usr_eml          (){ return hdr_usr_eml          ; }
	public String getHdr_imp_err_rsn      (){ return hdr_imp_err_rsn      ; }
	public String getHdr_rcv_err_rsn      (){ return hdr_rcv_err_rsn      ; }
	public String getHdr_ftu_use_ctnt1    (){ return hdr_ftu_use_ctnt1    ; }
	public String getHdr_ftu_use_ctnt2    (){ return hdr_ftu_use_ctnt2    ; }
	public String getHdr_ftu_use_ctnt3    (){ return hdr_ftu_use_ctnt3    ; }
	public String getHdr_ftu_use_ctnt4    (){ return hdr_ftu_use_ctnt4    ; }
	public String getHdr_ftu_use_ctnt5    (){ return hdr_ftu_use_ctnt5    ; }
	public String getCsr_no               (){ return csr_no               ; }
	public String getLine_seq             (){ return line_seq             ; }
	public String getLine_no              (){ return line_no              ; }
	public String getLine_tp_lu_cd        (){ return line_tp_lu_cd        ; }
	public String getInv_amt              (){ return inv_amt              ; }
	public String getInv_desc             (){ return inv_desc             ; }
	public String getInv_tax_cd           (){ return inv_tax_cd           ; }
	public String getDtrb_coa_co_cd       (){ return dtrb_coa_co_cd       ; }
	public String getDtrb_coa_rgn_cd      (){ return dtrb_coa_rgn_cd      ; }
	public String getDtrb_coa_ctr_cd      (){ return dtrb_coa_ctr_cd      ; }
	public String getDtrb_coa_acct_cd     (){ return dtrb_coa_acct_cd     ; }
	public String getDtrb_coa_vvd_cd      (){ return dtrb_coa_vvd_cd      ; }
	public String getDtrb_coa_inter_co_cd (){ return dtrb_coa_inter_co_cd ; }
	public String getDtrb_coa_ftu_n1st_cd (){ return dtrb_coa_ftu_n1st_cd ; }
	public String getDtrb_coa_ftu_n2nd_cd (){ return dtrb_coa_ftu_n2nd_cd ; }
	public String getAttr_cate_nm         (){ return attr_cate_nm         ; }
	public String getAttr_ctnt1           (){ return attr_ctnt1           ; }
	public String getAttr_ctnt2           (){ return attr_ctnt2           ; }
	public String getAttr_ctnt3           (){ return attr_ctnt3           ; }
	public String getAttr_ctnt4           (){ return attr_ctnt4           ; }
	public String getAttr_ctnt5           (){ return attr_ctnt5           ; }
	public String getAttr_ctnt6           (){ return attr_ctnt6           ; }
	public String getAttr_ctnt7           (){ return attr_ctnt7           ; }
	public String getAttr_ctnt8           (){ return attr_ctnt8           ; }
	public String getAttr_ctnt9           (){ return attr_ctnt9           ; }
	public String getAttr_ctnt10          (){ return attr_ctnt10          ; }
	public String getAttr_ctnt11          (){ return attr_ctnt11          ; }
	public String getAttr_ctnt12          (){ return attr_ctnt12          ; }
	public String getAttr_ctnt13          (){ return attr_ctnt13          ; }
	public String getAttr_ctnt14          (){ return attr_ctnt14          ; }
	public String getAttr_ctnt15          (){ return attr_ctnt15          ; }
	public String getBkg_no               (){ return bkg_no               ; }
	public String getBkg_no_split         (){ return bkg_no_split         ; }
	public String getCntr_tpsz_cd         (){ return cntr_tpsz_cd         ; }
	public String getAct_vvd_cd           (){ return act_vvd_cd           ; }
	public String getPln_sctr_div_cd      (){ return pln_sctr_div_cd      ; }
	public String getSo_crr_cd            (){ return so_crr_cd            ; }
	public String getYd_cd                (){ return yd_cd                ; }
	public String getFtu_use_ctnt1        (){ return ftu_use_ctnt1        ; }
	public String getFtu_use_ctnt2        (){ return ftu_use_ctnt2        ; }
	public String getFtu_use_ctnt3        (){ return ftu_use_ctnt3        ; }
	public String getFtu_use_ctnt4        (){ return ftu_use_ctnt4        ; }
	public String getFtu_use_ctnt5        (){ return ftu_use_ctnt5        ; }
	public String getSnd_flg              (){ return snd_flg              ; }
	public String getCre_dt               (){ return cre_dt               ; }
	public String getCre_usr_id           (){ return cre_usr_id           ; }
	public String getEai_evnt_dt          (){ return eai_evnt_dt          ; }
	public String getCxl_dt		          (){ return cxl_dt		          ; }
	
	// setter method is proceeding ..
	public void setIbflag               ( String ibflag               ){ this.ibflag                = ibflag          	    ; }
	public void setPage_rows            ( String page_rows            ){ this.page_rows             = page_rows       	    ; }
	public void setAp_pgm_no            ( String ap_pgm_no            ){ this.ap_pgm_no             = ap_pgm_no             ; }
	public void setInv_seq              ( String inv_seq              ){ this.inv_seq               = inv_seq               ; }
	public void setTtl_row_knt          ( String ttl_row_knt          ){ this.ttl_row_knt           = ttl_row_knt           ; }
	public void setRow_knt              ( String row_knt              ){ this.row_knt               = row_knt               ; }
	public void setHdr_csr_no           ( String hdr_csr_no           ){ this.hdr_csr_no            = hdr_csr_no            ; }
	public void setHdr_csr_tp_cd        ( String hdr_csr_tp_cd        ){ this.hdr_csr_tp_cd         = hdr_csr_tp_cd         ; }
	public void setHdr_inv_dt           ( String hdr_inv_dt           ){ this.hdr_inv_dt            = hdr_inv_dt            ; }
	public void setHdr_inv_term_dt      ( String hdr_inv_term_dt      ){ this.hdr_inv_term_dt       = hdr_inv_term_dt       ; }
	public void setHdr_gl_dt            ( String hdr_gl_dt            ){ this.hdr_gl_dt             = hdr_gl_dt             ; }
	public void setHdr_vndr_no          ( String hdr_vndr_no          ){ this.hdr_vndr_no           = hdr_vndr_no           ; }
	public void setHdr_csr_amt          ( String hdr_csr_amt          ){ this.hdr_csr_amt           = hdr_csr_amt           ; }
	public void setHdr_pay_amt          ( String hdr_pay_amt          ){ this.hdr_pay_amt           = hdr_pay_amt           ; }
	public void setHdr_pay_dt           ( String hdr_pay_dt           ){ this.hdr_pay_dt            = hdr_pay_dt            ; }
	public void setHdr_csr_curr_cd      ( String hdr_csr_curr_cd      ){ this.hdr_csr_curr_cd       = hdr_csr_curr_cd       ; }
	public void setHdr_vndr_term_nm     ( String hdr_vndr_term_nm     ){ this.hdr_vndr_term_nm      = hdr_vndr_term_nm      ; }
	public void setHdr_inv_desc         ( String hdr_inv_desc         ){ this.hdr_inv_desc          = hdr_inv_desc          ; }
	public void setHdr_attr_cate_nm     ( String hdr_attr_cate_nm     ){ this.hdr_attr_cate_nm      = hdr_attr_cate_nm      ; }
	public void setHdr_attr_ctnt1       ( String hdr_attr_ctnt1       ){ this.hdr_attr_ctnt1        = hdr_attr_ctnt1        ; }
	public void setHdr_attr_ctnt2       ( String hdr_attr_ctnt2       ){ this.hdr_attr_ctnt2        = hdr_attr_ctnt2        ; }
	public void setHdr_attr_ctnt3       ( String hdr_attr_ctnt3       ){ this.hdr_attr_ctnt3        = hdr_attr_ctnt3        ; }
	public void setHdr_attr_ctnt4       ( String hdr_attr_ctnt4       ){ this.hdr_attr_ctnt4        = hdr_attr_ctnt4        ; }
	public void setHdr_attr_ctnt5       ( String hdr_attr_ctnt5       ){ this.hdr_attr_ctnt5        = hdr_attr_ctnt5        ; }
	public void setHdr_attr_ctnt6       ( String hdr_attr_ctnt6       ){ this.hdr_attr_ctnt6        = hdr_attr_ctnt6        ; }
	public void setHdr_attr_ctnt7       ( String hdr_attr_ctnt7       ){ this.hdr_attr_ctnt7        = hdr_attr_ctnt7        ; }
	public void setHdr_attr_ctnt8       ( String hdr_attr_ctnt8       ){ this.hdr_attr_ctnt8        = hdr_attr_ctnt8        ; }
	public void setHdr_attr_ctnt9       ( String hdr_attr_ctnt9       ){ this.hdr_attr_ctnt9        = hdr_attr_ctnt9        ; }
	public void setHdr_attr_ctnt10      ( String hdr_attr_ctnt10      ){ this.hdr_attr_ctnt10       = hdr_attr_ctnt10       ; }
	public void setHdr_attr_ctnt11      ( String hdr_attr_ctnt11      ){ this.hdr_attr_ctnt11       = hdr_attr_ctnt11       ; }
	public void setHdr_attr_ctnt12      ( String hdr_attr_ctnt12      ){ this.hdr_attr_ctnt12       = hdr_attr_ctnt12       ; }
	public void setHdr_attr_ctnt13      ( String hdr_attr_ctnt13      ){ this.hdr_attr_ctnt13       = hdr_attr_ctnt13       ; }
	public void setHdr_attr_ctnt14      ( String hdr_attr_ctnt14      ){ this.hdr_attr_ctnt14       = hdr_attr_ctnt14       ; }
	public void setHdr_attr_ctnt15      ( String hdr_attr_ctnt15      ){ this.hdr_attr_ctnt15       = hdr_attr_ctnt15       ; }
	public void setHdr_glo_attr_ctnt1   ( String hdr_glo_attr_ctnt1   ){ this.hdr_glo_attr_ctnt1    = hdr_glo_attr_ctnt1    ; }
	public void setHdr_glo_attr_ctnt2   ( String hdr_glo_attr_ctnt2   ){ this.hdr_glo_attr_ctnt2    = hdr_glo_attr_ctnt2    ; }
	public void setHdr_glo_attr_ctnt3   ( String hdr_glo_attr_ctnt3   ){ this.hdr_glo_attr_ctnt3    = hdr_glo_attr_ctnt3    ; }
	public void setHdr_glo_attr_ctnt4   ( String hdr_glo_attr_ctnt4   ){ this.hdr_glo_attr_ctnt4    = hdr_glo_attr_ctnt4    ; }
	public void setHdr_glo_attr_ctnt5   ( String hdr_glo_attr_ctnt5   ){ this.hdr_glo_attr_ctnt5    = hdr_glo_attr_ctnt5    ; }
	public void setHdr_glo_attr_ctnt6   ( String hdr_glo_attr_ctnt6   ){ this.hdr_glo_attr_ctnt6    = hdr_glo_attr_ctnt6    ; }
	public void setHdr_glo_attr_ctnt7   ( String hdr_glo_attr_ctnt7   ){ this.hdr_glo_attr_ctnt7    = hdr_glo_attr_ctnt7    ; }
	public void setHdr_glo_attr_ctnt8   ( String hdr_glo_attr_ctnt8   ){ this.hdr_glo_attr_ctnt8    = hdr_glo_attr_ctnt8    ; }
	public void setHdr_glo_attr_ctnt9   ( String hdr_glo_attr_ctnt9   ){ this.hdr_glo_attr_ctnt9    = hdr_glo_attr_ctnt9    ; }
	public void setHdr_glo_attr_ctnt10  ( String hdr_glo_attr_ctnt10  ){ this.hdr_glo_attr_ctnt10   = hdr_glo_attr_ctnt10   ; }
	public void setHdr_glo_attr_ctnt11  ( String hdr_glo_attr_ctnt11  ){ this.hdr_glo_attr_ctnt11   = hdr_glo_attr_ctnt11   ; }
	public void setHdr_glo_attr_ctnt12  ( String hdr_glo_attr_ctnt12  ){ this.hdr_glo_attr_ctnt12   = hdr_glo_attr_ctnt12   ; }
	public void setHdr_glo_attr_ctnt13  ( String hdr_glo_attr_ctnt13  ){ this.hdr_glo_attr_ctnt13   = hdr_glo_attr_ctnt13   ; }
	public void setHdr_glo_attr_ctnt14  ( String hdr_glo_attr_ctnt14  ){ this.hdr_glo_attr_ctnt14   = hdr_glo_attr_ctnt14   ; }
	public void setHdr_glo_attr_ctnt15  ( String hdr_glo_attr_ctnt15  ){ this.hdr_glo_attr_ctnt15   = hdr_glo_attr_ctnt15   ; }
	public void setHdr_glo_attr_ctnt16  ( String hdr_glo_attr_ctnt16  ){ this.hdr_glo_attr_ctnt16   = hdr_glo_attr_ctnt16   ; }
	public void setHdr_glo_attr_ctnt17  ( String hdr_glo_attr_ctnt17  ){ this.hdr_glo_attr_ctnt17   = hdr_glo_attr_ctnt17   ; }
	public void setHdr_glo_attr_ctnt18  ( String hdr_glo_attr_ctnt18  ){ this.hdr_glo_attr_ctnt18   = hdr_glo_attr_ctnt18   ; }
	public void setHdr_src_ctnt         ( String hdr_src_ctnt         ){ this.hdr_src_ctnt          = hdr_src_ctnt          ; }
	public void setHdr_pay_mzd_lu_cd    ( String hdr_pay_mzd_lu_cd    ){ this.hdr_pay_mzd_lu_cd     = hdr_pay_mzd_lu_cd     ; }
	public void setHdr_pay_grp_lu_cd    ( String hdr_pay_grp_lu_cd    ){ this.hdr_pay_grp_lu_cd     = hdr_pay_grp_lu_cd     ; }
	public void setHdr_coa_co_cd        ( String hdr_coa_co_cd        ){ this.hdr_coa_co_cd         = hdr_coa_co_cd         ; }
	public void setHdr_coa_rgn_cd       ( String hdr_coa_rgn_cd       ){ this.hdr_coa_rgn_cd        = hdr_coa_rgn_cd        ; }
	public void setHdr_coa_ctr_cd       ( String hdr_coa_ctr_cd       ){ this.hdr_coa_ctr_cd        = hdr_coa_ctr_cd        ; }
	public void setHdr_coa_acct_cd      ( String hdr_coa_acct_cd      ){ this.hdr_coa_acct_cd       = hdr_coa_acct_cd       ; }
	public void setHdr_coa_vvd_cd       ( String hdr_coa_vvd_cd       ){ this.hdr_coa_vvd_cd        = hdr_coa_vvd_cd        ; }
	public void setHdr_coa_inter_co_cd  ( String hdr_coa_inter_co_cd  ){ this.hdr_coa_inter_co_cd   = hdr_coa_inter_co_cd   ; }
	public void setHdr_coa_ftu_n1st_cd  ( String hdr_coa_ftu_n1st_cd  ){ this.hdr_coa_ftu_n1st_cd   = hdr_coa_ftu_n1st_cd   ; }
	public void setHdr_coa_ftu_n2nd_cd  ( String hdr_coa_ftu_n2nd_cd  ){ this.hdr_coa_ftu_n2nd_cd   = hdr_coa_ftu_n2nd_cd   ; }
	public void setHdr_ppd_no           ( String hdr_ppd_no           ){ this.hdr_ppd_no            = hdr_ppd_no            ; }
	public void setHdr_ppd_dtrb_no      ( String hdr_ppd_dtrb_no      ){ this.hdr_ppd_dtrb_no       = hdr_ppd_dtrb_no       ; }
	public void setHdr_ppd_aply_amt     ( String hdr_ppd_aply_amt     ){ this.hdr_ppd_aply_amt      = hdr_ppd_aply_amt      ; }
	public void setHdr_ppd_gl_dt        ( String hdr_ppd_gl_dt        ){ this.hdr_ppd_gl_dt         = hdr_ppd_gl_dt         ; }
	public void setHdr_apro_flg         ( String hdr_apro_flg         ){ this.hdr_apro_flg          = hdr_apro_flg          ; }
	public void setHdr_tax_decl_flg     ( String hdr_tax_decl_flg     ){ this.hdr_tax_decl_flg      = hdr_tax_decl_flg      ; }
	public void setHdr_err_csr_no       ( String hdr_err_csr_no       ){ this.hdr_err_csr_no        = hdr_err_csr_no        ; }
	public void setHdr_if_flg           ( String hdr_if_flg           ){ this.hdr_if_flg            = hdr_if_flg            ; }
	public void setHdr_if_dt            ( String hdr_if_dt            ){ this.hdr_if_dt             = hdr_if_dt             ; }
	public void setHdr_if_err_rsn       ( String hdr_if_err_rsn       ){ this.hdr_if_err_rsn        = hdr_if_err_rsn        ; }
	public void setHdr_ppay_aply_flg    ( String hdr_ppay_aply_flg    ){ this.hdr_ppay_aply_flg     = hdr_ppay_aply_flg     ; }
	public void setHdr_tj_ofc_cd        ( String hdr_tj_ofc_cd        ){ this.hdr_tj_ofc_cd         = hdr_tj_ofc_cd         ; }
	public void setHdr_act_xch_rt       ( String hdr_act_xch_rt       ){ this.hdr_act_xch_rt        = hdr_act_xch_rt        ; }
	public void setHdr_imp_err_flg      ( String hdr_imp_err_flg      ){ this.hdr_imp_err_flg       = hdr_imp_err_flg       ; }
	public void setHdr_rcv_err_flg      ( String hdr_rcv_err_flg      ){ this.hdr_rcv_err_flg       = hdr_rcv_err_flg       ; }
	public void setHdr_tax_curr_xch_flg ( String hdr_tax_curr_xch_flg ){ this.hdr_tax_curr_xch_flg  = hdr_tax_curr_xch_flg  ; }
	public void setHdr_usr_eml          ( String hdr_usr_eml          ){ this.hdr_usr_eml           = hdr_usr_eml           ; }
	public void setHdr_imp_err_rsn      ( String hdr_imp_err_rsn      ){ this.hdr_imp_err_rsn       = hdr_imp_err_rsn       ; }
	public void setHdr_rcv_err_rsn      ( String hdr_rcv_err_rsn      ){ this.hdr_rcv_err_rsn       = hdr_rcv_err_rsn       ; }
	public void setHdr_ftu_use_ctnt1    ( String hdr_ftu_use_ctnt1    ){ this.hdr_ftu_use_ctnt1     = hdr_ftu_use_ctnt1     ; }
	public void setHdr_ftu_use_ctnt2    ( String hdr_ftu_use_ctnt2    ){ this.hdr_ftu_use_ctnt2     = hdr_ftu_use_ctnt2     ; }
	public void setHdr_ftu_use_ctnt3    ( String hdr_ftu_use_ctnt3    ){ this.hdr_ftu_use_ctnt3     = hdr_ftu_use_ctnt3     ; }
	public void setHdr_ftu_use_ctnt4    ( String hdr_ftu_use_ctnt4    ){ this.hdr_ftu_use_ctnt4     = hdr_ftu_use_ctnt4     ; }
	public void setHdr_ftu_use_ctnt5    ( String hdr_ftu_use_ctnt5    ){ this.hdr_ftu_use_ctnt5     = hdr_ftu_use_ctnt5     ; }
	public void setCsr_no               ( String csr_no               ){ this.csr_no                = csr_no                ; }
	public void setLine_seq             ( String line_seq             ){ this.line_seq              = line_seq              ; }
	public void setLine_no              ( String line_no              ){ this.line_no               = line_no               ; }
	public void setLine_tp_lu_cd        ( String line_tp_lu_cd        ){ this.line_tp_lu_cd         = line_tp_lu_cd         ; }
	public void setInv_amt              ( String inv_amt              ){ this.inv_amt               = inv_amt               ; }
	public void setInv_desc             ( String inv_desc             ){ this.inv_desc              = inv_desc              ; }
	public void setInv_tax_cd           ( String inv_tax_cd           ){ this.inv_tax_cd            = inv_tax_cd            ; }
	public void setDtrb_coa_co_cd       ( String dtrb_coa_co_cd       ){ this.dtrb_coa_co_cd        = dtrb_coa_co_cd        ; }
	public void setDtrb_coa_rgn_cd      ( String dtrb_coa_rgn_cd      ){ this.dtrb_coa_rgn_cd       = dtrb_coa_rgn_cd       ; }
	public void setDtrb_coa_ctr_cd      ( String dtrb_coa_ctr_cd      ){ this.dtrb_coa_ctr_cd       = dtrb_coa_ctr_cd       ; }
	public void setDtrb_coa_acct_cd     ( String dtrb_coa_acct_cd     ){ this.dtrb_coa_acct_cd      = dtrb_coa_acct_cd      ; }
	public void setDtrb_coa_vvd_cd      ( String dtrb_coa_vvd_cd      ){ this.dtrb_coa_vvd_cd       = dtrb_coa_vvd_cd       ; }
	public void setDtrb_coa_inter_co_cd ( String dtrb_coa_inter_co_cd ){ this.dtrb_coa_inter_co_cd  = dtrb_coa_inter_co_cd  ; }
	public void setDtrb_coa_ftu_n1st_cd ( String dtrb_coa_ftu_n1st_cd ){ this.dtrb_coa_ftu_n1st_cd  = dtrb_coa_ftu_n1st_cd  ; }
	public void setDtrb_coa_ftu_n2nd_cd ( String dtrb_coa_ftu_n2nd_cd ){ this.dtrb_coa_ftu_n2nd_cd  = dtrb_coa_ftu_n2nd_cd  ; }
	public void setAttr_cate_nm         ( String attr_cate_nm         ){ this.attr_cate_nm          = attr_cate_nm          ; }
	public void setAttr_ctnt1           ( String attr_ctnt1           ){ this.attr_ctnt1            = attr_ctnt1            ; }
	public void setAttr_ctnt2           ( String attr_ctnt2           ){ this.attr_ctnt2            = attr_ctnt2            ; }
	public void setAttr_ctnt3           ( String attr_ctnt3           ){ this.attr_ctnt3            = attr_ctnt3            ; }
	public void setAttr_ctnt4           ( String attr_ctnt4           ){ this.attr_ctnt4            = attr_ctnt4            ; }
	public void setAttr_ctnt5           ( String attr_ctnt5           ){ this.attr_ctnt5            = attr_ctnt5            ; }
	public void setAttr_ctnt6           ( String attr_ctnt6           ){ this.attr_ctnt6            = attr_ctnt6            ; }
	public void setAttr_ctnt7           ( String attr_ctnt7           ){ this.attr_ctnt7            = attr_ctnt7            ; }
	public void setAttr_ctnt8           ( String attr_ctnt8           ){ this.attr_ctnt8            = attr_ctnt8            ; }
	public void setAttr_ctnt9           ( String attr_ctnt9           ){ this.attr_ctnt9            = attr_ctnt9            ; }
	public void setAttr_ctnt10          ( String attr_ctnt10          ){ this.attr_ctnt10           = attr_ctnt10           ; }
	public void setAttr_ctnt11          ( String attr_ctnt11          ){ this.attr_ctnt11           = attr_ctnt11           ; }
	public void setAttr_ctnt12          ( String attr_ctnt12          ){ this.attr_ctnt12           = attr_ctnt12           ; }
	public void setAttr_ctnt13          ( String attr_ctnt13          ){ this.attr_ctnt13           = attr_ctnt13           ; }
	public void setAttr_ctnt14          ( String attr_ctnt14          ){ this.attr_ctnt14           = attr_ctnt14           ; }
	public void setAttr_ctnt15          ( String attr_ctnt15          ){ this.attr_ctnt15           = attr_ctnt15           ; }
	public void setBkg_no               ( String bkg_no               ){ this.bkg_no                = bkg_no                ; }
	public void setBkg_no_split         ( String bkg_no_split         ){ this.bkg_no_split          = bkg_no_split          ; }
	public void setCntr_tpsz_cd         ( String cntr_tpsz_cd         ){ this.cntr_tpsz_cd          = cntr_tpsz_cd          ; }
	public void setAct_vvd_cd           ( String act_vvd_cd           ){ this.act_vvd_cd            = act_vvd_cd            ; }
	public void setPln_sctr_div_cd      ( String pln_sctr_div_cd      ){ this.pln_sctr_div_cd       = pln_sctr_div_cd       ; }
	public void setSo_crr_cd            ( String so_crr_cd            ){ this.so_crr_cd             = so_crr_cd             ; }
	public void setYd_cd                ( String yd_cd                ){ this.yd_cd                 = yd_cd                 ; }
	public void setFtu_use_ctnt1        ( String ftu_use_ctnt1        ){ this.ftu_use_ctnt1         = ftu_use_ctnt1         ; }
	public void setFtu_use_ctnt2        ( String ftu_use_ctnt2        ){ this.ftu_use_ctnt2         = ftu_use_ctnt2         ; }
	public void setFtu_use_ctnt3        ( String ftu_use_ctnt3        ){ this.ftu_use_ctnt3         = ftu_use_ctnt3         ; }
	public void setFtu_use_ctnt4        ( String ftu_use_ctnt4        ){ this.ftu_use_ctnt4         = ftu_use_ctnt4         ; }
	public void setFtu_use_ctnt5        ( String ftu_use_ctnt5        ){ this.ftu_use_ctnt5         = ftu_use_ctnt5         ; }
	public void setSnd_flg              ( String snd_flg              ){ this.snd_flg               = snd_flg               ; }
	public void setCre_dt               ( String cre_dt               ){ this.cre_dt                = cre_dt                ; }
	public void setCre_usr_id           ( String cre_usr_id           ){ this.cre_usr_id            = cre_usr_id            ; }
	public void setEai_evnt_dt          ( String eai_evnt_dt          ){ this.eai_evnt_dt           = eai_evnt_dt           ; }
	public void setCxl_dt		        ( String cxl_dt		          ){ this.cxl_dt	            = cxl_dt	            ; }

	//
	public static AP_INV_IF fromRequest(HttpServletRequest request) {
		AP_INV_IF model = new AP_INV_IF();
		try {
			model.setIbflag          	   (JSPUtil.getParameter(request, "ibflag              ".trim(), ""));
			model.setPage_rows       	   (JSPUtil.getParameter(request, "page_rows   	       ".trim(), ""));
			model.setAp_pgm_no             (JSPUtil.getParameter(request, "ap_pgm_no           ".trim(), ""));
			model.setInv_seq               (JSPUtil.getParameter(request, "inv_seq             ".trim(), ""));
			model.setTtl_row_knt           (JSPUtil.getParameter(request, "ttl_row_knt         ".trim(), ""));
			model.setRow_knt               (JSPUtil.getParameter(request, "row_knt             ".trim(), ""));
			model.setHdr_csr_no            (JSPUtil.getParameter(request, "hdr_csr_no          ".trim(), ""));
			model.setHdr_csr_tp_cd         (JSPUtil.getParameter(request, "hdr_csr_tp_cd       ".trim(), ""));
			model.setHdr_inv_dt            (JSPUtil.getParameter(request, "hdr_inv_dt          ".trim(), ""));
			model.setHdr_inv_term_dt       (JSPUtil.getParameter(request, "hdr_inv_term_dt     ".trim(), ""));
			model.setHdr_gl_dt             (JSPUtil.getParameter(request, "hdr_gl_dt           ".trim(), ""));
			model.setHdr_vndr_no           (JSPUtil.getParameter(request, "hdr_vndr_no         ".trim(), ""));
			model.setHdr_csr_amt           (JSPUtil.getParameter(request, "hdr_csr_amt         ".trim(), ""));
			model.setHdr_pay_amt           (JSPUtil.getParameter(request, "hdr_pay_amt         ".trim(), ""));
			model.setHdr_pay_dt            (JSPUtil.getParameter(request, "hdr_pay_dt          ".trim(), ""));
			model.setHdr_csr_curr_cd       (JSPUtil.getParameter(request, "hdr_csr_curr_cd     ".trim(), ""));
			model.setHdr_vndr_term_nm      (JSPUtil.getParameter(request, "hdr_vndr_term_nm    ".trim(), ""));
			model.setHdr_inv_desc          (JSPUtil.getParameter(request, "hdr_inv_desc        ".trim(), ""));
			model.setHdr_attr_cate_nm      (JSPUtil.getParameter(request, "hdr_attr_cate_nm    ".trim(), ""));
			model.setHdr_attr_ctnt1        (JSPUtil.getParameter(request, "hdr_attr_ctnt1      ".trim(), ""));
			model.setHdr_attr_ctnt2        (JSPUtil.getParameter(request, "hdr_attr_ctnt2      ".trim(), ""));
			model.setHdr_attr_ctnt3        (JSPUtil.getParameter(request, "hdr_attr_ctnt3      ".trim(), ""));
			model.setHdr_attr_ctnt4        (JSPUtil.getParameter(request, "hdr_attr_ctnt4      ".trim(), ""));
			model.setHdr_attr_ctnt5        (JSPUtil.getParameter(request, "hdr_attr_ctnt5      ".trim(), ""));
			model.setHdr_attr_ctnt6        (JSPUtil.getParameter(request, "hdr_attr_ctnt6      ".trim(), ""));
			model.setHdr_attr_ctnt7        (JSPUtil.getParameter(request, "hdr_attr_ctnt7      ".trim(), ""));
			model.setHdr_attr_ctnt8        (JSPUtil.getParameter(request, "hdr_attr_ctnt8      ".trim(), ""));
			model.setHdr_attr_ctnt9        (JSPUtil.getParameter(request, "hdr_attr_ctnt9      ".trim(), ""));
			model.setHdr_attr_ctnt10       (JSPUtil.getParameter(request, "hdr_attr_ctnt10     ".trim(), ""));
			model.setHdr_attr_ctnt11       (JSPUtil.getParameter(request, "hdr_attr_ctnt11     ".trim(), ""));
			model.setHdr_attr_ctnt12       (JSPUtil.getParameter(request, "hdr_attr_ctnt12     ".trim(), ""));
			model.setHdr_attr_ctnt13       (JSPUtil.getParameter(request, "hdr_attr_ctnt13     ".trim(), ""));
			model.setHdr_attr_ctnt14       (JSPUtil.getParameter(request, "hdr_attr_ctnt14     ".trim(), ""));
			model.setHdr_attr_ctnt15       (JSPUtil.getParameter(request, "hdr_attr_ctnt15     ".trim(), ""));
			model.setHdr_glo_attr_ctnt1    (JSPUtil.getParameter(request, "hdr_glo_attr_ctnt1  ".trim(), ""));
			model.setHdr_glo_attr_ctnt2    (JSPUtil.getParameter(request, "hdr_glo_attr_ctnt2  ".trim(), ""));
			model.setHdr_glo_attr_ctnt3    (JSPUtil.getParameter(request, "hdr_glo_attr_ctnt3  ".trim(), ""));
			model.setHdr_glo_attr_ctnt4    (JSPUtil.getParameter(request, "hdr_glo_attr_ctnt4  ".trim(), ""));
			model.setHdr_glo_attr_ctnt5    (JSPUtil.getParameter(request, "hdr_glo_attr_ctnt5  ".trim(), ""));
			model.setHdr_glo_attr_ctnt6    (JSPUtil.getParameter(request, "hdr_glo_attr_ctnt6  ".trim(), ""));
			model.setHdr_glo_attr_ctnt7    (JSPUtil.getParameter(request, "hdr_glo_attr_ctnt7  ".trim(), ""));
			model.setHdr_glo_attr_ctnt8    (JSPUtil.getParameter(request, "hdr_glo_attr_ctnt8  ".trim(), ""));
			model.setHdr_glo_attr_ctnt9    (JSPUtil.getParameter(request, "hdr_glo_attr_ctnt9  ".trim(), ""));
			model.setHdr_glo_attr_ctnt10   (JSPUtil.getParameter(request, "hdr_glo_attr_ctnt10 ".trim(), ""));
			model.setHdr_glo_attr_ctnt11   (JSPUtil.getParameter(request, "hdr_glo_attr_ctnt11 ".trim(), ""));
			model.setHdr_glo_attr_ctnt12   (JSPUtil.getParameter(request, "hdr_glo_attr_ctnt12 ".trim(), ""));
			model.setHdr_glo_attr_ctnt13   (JSPUtil.getParameter(request, "hdr_glo_attr_ctnt13 ".trim(), ""));
			model.setHdr_glo_attr_ctnt14   (JSPUtil.getParameter(request, "hdr_glo_attr_ctnt14 ".trim(), ""));
			model.setHdr_glo_attr_ctnt15   (JSPUtil.getParameter(request, "hdr_glo_attr_ctnt15 ".trim(), ""));
			model.setHdr_glo_attr_ctnt16   (JSPUtil.getParameter(request, "hdr_glo_attr_ctnt16 ".trim(), ""));
			model.setHdr_glo_attr_ctnt17   (JSPUtil.getParameter(request, "hdr_glo_attr_ctnt17 ".trim(), ""));
			model.setHdr_glo_attr_ctnt18   (JSPUtil.getParameter(request, "hdr_glo_attr_ctnt18 ".trim(), ""));
			model.setHdr_src_ctnt          (JSPUtil.getParameter(request, "hdr_src_ctnt        ".trim(), ""));
			model.setHdr_pay_mzd_lu_cd     (JSPUtil.getParameter(request, "hdr_pay_mzd_lu_cd   ".trim(), ""));
			model.setHdr_pay_grp_lu_cd     (JSPUtil.getParameter(request, "hdr_pay_grp_lu_cd   ".trim(), ""));
			model.setHdr_coa_co_cd         (JSPUtil.getParameter(request, "hdr_coa_co_cd       ".trim(), ""));
			model.setHdr_coa_rgn_cd        (JSPUtil.getParameter(request, "hdr_coa_rgn_cd      ".trim(), ""));
			model.setHdr_coa_ctr_cd        (JSPUtil.getParameter(request, "hdr_coa_ctr_cd      ".trim(), ""));
			model.setHdr_coa_acct_cd       (JSPUtil.getParameter(request, "hdr_coa_acct_cd     ".trim(), ""));
			model.setHdr_coa_vvd_cd        (JSPUtil.getParameter(request, "hdr_coa_vvd_cd      ".trim(), ""));
			model.setHdr_coa_inter_co_cd   (JSPUtil.getParameter(request, "hdr_coa_inter_co_cd ".trim(), ""));
			model.setHdr_coa_ftu_n1st_cd   (JSPUtil.getParameter(request, "hdr_coa_ftu_n1st_cd ".trim(), ""));
			model.setHdr_coa_ftu_n2nd_cd   (JSPUtil.getParameter(request, "hdr_coa_ftu_n2nd_cd ".trim(), ""));
			model.setHdr_ppd_no            (JSPUtil.getParameter(request, "hdr_ppd_no          ".trim(), ""));
			model.setHdr_ppd_dtrb_no       (JSPUtil.getParameter(request, "hdr_ppd_dtrb_no     ".trim(), ""));
			model.setHdr_ppd_aply_amt      (JSPUtil.getParameter(request, "hdr_ppd_aply_amt    ".trim(), ""));
			model.setHdr_ppd_gl_dt         (JSPUtil.getParameter(request, "hdr_ppd_gl_dt       ".trim(), ""));
			model.setHdr_apro_flg          (JSPUtil.getParameter(request, "hdr_apro_flg        ".trim(), ""));
			model.setHdr_tax_decl_flg      (JSPUtil.getParameter(request, "hdr_tax_decl_flg    ".trim(), ""));
			model.setHdr_err_csr_no        (JSPUtil.getParameter(request, "hdr_err_csr_no      ".trim(), ""));
			model.setHdr_if_flg            (JSPUtil.getParameter(request, "hdr_if_flg          ".trim(), ""));
			model.setHdr_if_dt             (JSPUtil.getParameter(request, "hdr_if_dt           ".trim(), ""));
			model.setHdr_if_err_rsn        (JSPUtil.getParameter(request, "hdr_if_err_rsn      ".trim(), ""));
			model.setHdr_ppay_aply_flg     (JSPUtil.getParameter(request, "hdr_ppay_aply_flg   ".trim(), ""));
			model.setHdr_tj_ofc_cd         (JSPUtil.getParameter(request, "hdr_tj_ofc_cd       ".trim(), ""));
			model.setHdr_act_xch_rt        (JSPUtil.getParameter(request, "hdr_act_xch_rt      ".trim(), ""));
			model.setHdr_imp_err_flg       (JSPUtil.getParameter(request, "hdr_imp_err_flg     ".trim(), ""));
			model.setHdr_rcv_err_flg       (JSPUtil.getParameter(request, "hdr_rcv_err_flg     ".trim(), ""));
			model.setHdr_tax_curr_xch_flg  (JSPUtil.getParameter(request, "hdr_tax_curr_xch_flg".trim(), ""));
			model.setHdr_usr_eml           (JSPUtil.getParameter(request, "hdr_usr_eml         ".trim(), ""));
			model.setHdr_imp_err_rsn       (JSPUtil.getParameter(request, "hdr_imp_err_rsn     ".trim(), ""));
			model.setHdr_rcv_err_rsn       (JSPUtil.getParameter(request, "hdr_rcv_err_rsn     ".trim(), ""));
			model.setHdr_ftu_use_ctnt1     (JSPUtil.getParameter(request, "hdr_ftu_use_ctnt1   ".trim(), ""));
			model.setHdr_ftu_use_ctnt2     (JSPUtil.getParameter(request, "hdr_ftu_use_ctnt2   ".trim(), ""));
			model.setHdr_ftu_use_ctnt3     (JSPUtil.getParameter(request, "hdr_ftu_use_ctnt3   ".trim(), ""));
			model.setHdr_ftu_use_ctnt4     (JSPUtil.getParameter(request, "hdr_ftu_use_ctnt4   ".trim(), ""));
			model.setHdr_ftu_use_ctnt5     (JSPUtil.getParameter(request, "hdr_ftu_use_ctnt5   ".trim(), ""));
			model.setCsr_no                (JSPUtil.getParameter(request, "csr_no              ".trim(), ""));
			model.setLine_seq              (JSPUtil.getParameter(request, "line_seq            ".trim(), ""));
			model.setLine_no               (JSPUtil.getParameter(request, "line_no             ".trim(), ""));
			model.setLine_tp_lu_cd         (JSPUtil.getParameter(request, "line_tp_lu_cd       ".trim(), ""));
			model.setInv_amt               (JSPUtil.getParameter(request, "inv_amt             ".trim(), ""));
			model.setInv_desc              (JSPUtil.getParameter(request, "inv_desc            ".trim(), ""));
			model.setInv_tax_cd            (JSPUtil.getParameter(request, "inv_tax_cd          ".trim(), ""));
			model.setDtrb_coa_co_cd        (JSPUtil.getParameter(request, "dtrb_coa_co_cd      ".trim(), ""));
			model.setDtrb_coa_rgn_cd       (JSPUtil.getParameter(request, "dtrb_coa_rgn_cd     ".trim(), ""));
			model.setDtrb_coa_ctr_cd       (JSPUtil.getParameter(request, "dtrb_coa_ctr_cd     ".trim(), ""));
			model.setDtrb_coa_acct_cd      (JSPUtil.getParameter(request, "dtrb_coa_acct_cd    ".trim(), ""));
			model.setDtrb_coa_vvd_cd       (JSPUtil.getParameter(request, "dtrb_coa_vvd_cd     ".trim(), ""));
			model.setDtrb_coa_inter_co_cd  (JSPUtil.getParameter(request, "dtrb_coa_inter_co_cd".trim(), ""));
			model.setDtrb_coa_ftu_n1st_cd  (JSPUtil.getParameter(request, "dtrb_coa_ftu_n1st_cd".trim(), ""));
			model.setDtrb_coa_ftu_n2nd_cd  (JSPUtil.getParameter(request, "dtrb_coa_ftu_n2nd_cd".trim(), ""));
			model.setAttr_cate_nm          (JSPUtil.getParameter(request, "attr_cate_nm        ".trim(), ""));
			model.setAttr_ctnt1            (JSPUtil.getParameter(request, "attr_ctnt1          ".trim(), ""));
			model.setAttr_ctnt2            (JSPUtil.getParameter(request, "attr_ctnt2          ".trim(), ""));
			model.setAttr_ctnt3            (JSPUtil.getParameter(request, "attr_ctnt3          ".trim(), ""));
			model.setAttr_ctnt4            (JSPUtil.getParameter(request, "attr_ctnt4          ".trim(), ""));
			model.setAttr_ctnt5            (JSPUtil.getParameter(request, "attr_ctnt5          ".trim(), ""));
			model.setAttr_ctnt6            (JSPUtil.getParameter(request, "attr_ctnt6          ".trim(), ""));
			model.setAttr_ctnt7            (JSPUtil.getParameter(request, "attr_ctnt7          ".trim(), ""));
			model.setAttr_ctnt8            (JSPUtil.getParameter(request, "attr_ctnt8          ".trim(), ""));
			model.setAttr_ctnt9            (JSPUtil.getParameter(request, "attr_ctnt9          ".trim(), ""));
			model.setAttr_ctnt10           (JSPUtil.getParameter(request, "attr_ctnt10         ".trim(), ""));
			model.setAttr_ctnt11           (JSPUtil.getParameter(request, "attr_ctnt11         ".trim(), ""));
			model.setAttr_ctnt12           (JSPUtil.getParameter(request, "attr_ctnt12         ".trim(), ""));
			model.setAttr_ctnt13           (JSPUtil.getParameter(request, "attr_ctnt13         ".trim(), ""));
			model.setAttr_ctnt14           (JSPUtil.getParameter(request, "attr_ctnt14         ".trim(), ""));
			model.setAttr_ctnt15           (JSPUtil.getParameter(request, "attr_ctnt15         ".trim(), ""));
			model.setBkg_no                (JSPUtil.getParameter(request, "bkg_no              ".trim(), ""));
			model.setBkg_no_split          (JSPUtil.getParameter(request, "bkg_no_split        ".trim(), ""));
			model.setCntr_tpsz_cd          (JSPUtil.getParameter(request, "cntr_tpsz_cd        ".trim(), ""));
			model.setAct_vvd_cd            (JSPUtil.getParameter(request, "act_vvd_cd          ".trim(), ""));
			model.setPln_sctr_div_cd       (JSPUtil.getParameter(request, "pln_sctr_div_cd     ".trim(), ""));
			model.setSo_crr_cd             (JSPUtil.getParameter(request, "so_crr_cd           ".trim(), ""));
			model.setYd_cd                 (JSPUtil.getParameter(request, "yd_cd               ".trim(), ""));
			model.setFtu_use_ctnt1         (JSPUtil.getParameter(request, "ftu_use_ctnt1       ".trim(), ""));
			model.setFtu_use_ctnt2         (JSPUtil.getParameter(request, "ftu_use_ctnt2       ".trim(), ""));
			model.setFtu_use_ctnt3         (JSPUtil.getParameter(request, "ftu_use_ctnt3       ".trim(), ""));
			model.setFtu_use_ctnt4         (JSPUtil.getParameter(request, "ftu_use_ctnt4       ".trim(), ""));
			model.setFtu_use_ctnt5         (JSPUtil.getParameter(request, "ftu_use_ctnt5       ".trim(), ""));
			model.setSnd_flg               (JSPUtil.getParameter(request, "snd_flg             ".trim(), ""));
			model.setCre_dt                (JSPUtil.getParameter(request, "cre_dt              ".trim(), ""));
			model.setCre_usr_id            (JSPUtil.getParameter(request, "cre_usr_id          ".trim(), ""));
			model.setEai_evnt_dt           (JSPUtil.getParameter(request, "eai_evnt_dt         ".trim(), ""));
			model.setCxl_dt		           (JSPUtil.getParameter(request, "cxl_dt	           ".trim(), ""));
			
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}   
		return model;
	}       
	        
	public static Collection fromRequest(HttpServletRequest request, int length) {
		AP_INV_IF model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag                = (JSPUtil.getParameter(request, "ibflag              ".trim(), length));
			String[] page_rows             = (JSPUtil.getParameter(request, "page_rows           ".trim(), length));
			String[] ap_pgm_no             = (JSPUtil.getParameter(request, "ap_pgm_no           ".trim(), length));
			String[] inv_seq               = (JSPUtil.getParameter(request, "inv_seq             ".trim(), length));
			String[] ttl_row_knt           = (JSPUtil.getParameter(request, "ttl_row_knt         ".trim(), length));
			String[] row_knt               = (JSPUtil.getParameter(request, "row_knt             ".trim(), length));
			String[] hdr_csr_no            = (JSPUtil.getParameter(request, "hdr_csr_no          ".trim(), length));
			String[] hdr_csr_tp_cd         = (JSPUtil.getParameter(request, "hdr_csr_tp_cd       ".trim(), length));
			String[] hdr_inv_dt            = (JSPUtil.getParameter(request, "hdr_inv_dt          ".trim(), length));
			String[] hdr_inv_term_dt       = (JSPUtil.getParameter(request, "hdr_inv_term_dt     ".trim(), length));
			String[] hdr_gl_dt             = (JSPUtil.getParameter(request, "hdr_gl_dt           ".trim(), length));
			String[] hdr_vndr_no           = (JSPUtil.getParameter(request, "hdr_vndr_no         ".trim(), length));
			String[] hdr_csr_amt           = (JSPUtil.getParameter(request, "hdr_csr_amt         ".trim(), length));
			String[] hdr_pay_amt           = (JSPUtil.getParameter(request, "hdr_pay_amt         ".trim(), length));
			String[] hdr_pay_dt            = (JSPUtil.getParameter(request, "hdr_pay_dt          ".trim(), length));
			String[] hdr_csr_curr_cd       = (JSPUtil.getParameter(request, "hdr_csr_curr_cd     ".trim(), length));
			String[] hdr_vndr_term_nm      = (JSPUtil.getParameter(request, "hdr_vndr_term_nm    ".trim(), length));
			String[] hdr_inv_desc          = (JSPUtil.getParameter(request, "hdr_inv_desc        ".trim(), length));
			String[] hdr_attr_cate_nm      = (JSPUtil.getParameter(request, "hdr_attr_cate_nm    ".trim(), length));
			String[] hdr_attr_ctnt1        = (JSPUtil.getParameter(request, "hdr_attr_ctnt1      ".trim(), length));
			String[] hdr_attr_ctnt2        = (JSPUtil.getParameter(request, "hdr_attr_ctnt2      ".trim(), length));
			String[] hdr_attr_ctnt3        = (JSPUtil.getParameter(request, "hdr_attr_ctnt3      ".trim(), length));
			String[] hdr_attr_ctnt4        = (JSPUtil.getParameter(request, "hdr_attr_ctnt4      ".trim(), length));
			String[] hdr_attr_ctnt5        = (JSPUtil.getParameter(request, "hdr_attr_ctnt5      ".trim(), length));
			String[] hdr_attr_ctnt6        = (JSPUtil.getParameter(request, "hdr_attr_ctnt6      ".trim(), length));
			String[] hdr_attr_ctnt7        = (JSPUtil.getParameter(request, "hdr_attr_ctnt7      ".trim(), length));
			String[] hdr_attr_ctnt8        = (JSPUtil.getParameter(request, "hdr_attr_ctnt8      ".trim(), length));
			String[] hdr_attr_ctnt9        = (JSPUtil.getParameter(request, "hdr_attr_ctnt9      ".trim(), length));
			String[] hdr_attr_ctnt10       = (JSPUtil.getParameter(request, "hdr_attr_ctnt10     ".trim(), length));
			String[] hdr_attr_ctnt11       = (JSPUtil.getParameter(request, "hdr_attr_ctnt11     ".trim(), length));
			String[] hdr_attr_ctnt12       = (JSPUtil.getParameter(request, "hdr_attr_ctnt12     ".trim(), length));
			String[] hdr_attr_ctnt13       = (JSPUtil.getParameter(request, "hdr_attr_ctnt13     ".trim(), length));
			String[] hdr_attr_ctnt14       = (JSPUtil.getParameter(request, "hdr_attr_ctnt14     ".trim(), length));
			String[] hdr_attr_ctnt15       = (JSPUtil.getParameter(request, "hdr_attr_ctnt15     ".trim(), length));
			String[] hdr_glo_attr_ctnt1    = (JSPUtil.getParameter(request, "hdr_glo_attr_ctnt1  ".trim(), length));
			String[] hdr_glo_attr_ctnt2    = (JSPUtil.getParameter(request, "hdr_glo_attr_ctnt2  ".trim(), length));
			String[] hdr_glo_attr_ctnt3    = (JSPUtil.getParameter(request, "hdr_glo_attr_ctnt3  ".trim(), length));
			String[] hdr_glo_attr_ctnt4    = (JSPUtil.getParameter(request, "hdr_glo_attr_ctnt4  ".trim(), length));
			String[] hdr_glo_attr_ctnt5    = (JSPUtil.getParameter(request, "hdr_glo_attr_ctnt5  ".trim(), length));
			String[] hdr_glo_attr_ctnt6    = (JSPUtil.getParameter(request, "hdr_glo_attr_ctnt6  ".trim(), length));
			String[] hdr_glo_attr_ctnt7    = (JSPUtil.getParameter(request, "hdr_glo_attr_ctnt7  ".trim(), length));
			String[] hdr_glo_attr_ctnt8    = (JSPUtil.getParameter(request, "hdr_glo_attr_ctnt8  ".trim(), length));
			String[] hdr_glo_attr_ctnt9    = (JSPUtil.getParameter(request, "hdr_glo_attr_ctnt9  ".trim(), length));
			String[] hdr_glo_attr_ctnt10   = (JSPUtil.getParameter(request, "hdr_glo_attr_ctnt10 ".trim(), length));
			String[] hdr_glo_attr_ctnt11   = (JSPUtil.getParameter(request, "hdr_glo_attr_ctnt11 ".trim(), length));
			String[] hdr_glo_attr_ctnt12   = (JSPUtil.getParameter(request, "hdr_glo_attr_ctnt12 ".trim(), length));
			String[] hdr_glo_attr_ctnt13   = (JSPUtil.getParameter(request, "hdr_glo_attr_ctnt13 ".trim(), length));
			String[] hdr_glo_attr_ctnt14   = (JSPUtil.getParameter(request, "hdr_glo_attr_ctnt14 ".trim(), length));
			String[] hdr_glo_attr_ctnt15   = (JSPUtil.getParameter(request, "hdr_glo_attr_ctnt15 ".trim(), length));
			String[] hdr_glo_attr_ctnt16   = (JSPUtil.getParameter(request, "hdr_glo_attr_ctnt16 ".trim(), length));
			String[] hdr_glo_attr_ctnt17   = (JSPUtil.getParameter(request, "hdr_glo_attr_ctnt17 ".trim(), length));
			String[] hdr_glo_attr_ctnt18   = (JSPUtil.getParameter(request, "hdr_glo_attr_ctnt18 ".trim(), length));
			String[] hdr_src_ctnt          = (JSPUtil.getParameter(request, "hdr_src_ctnt        ".trim(), length));
			String[] hdr_pay_mzd_lu_cd     = (JSPUtil.getParameter(request, "hdr_pay_mzd_lu_cd   ".trim(), length));
			String[] hdr_pay_grp_lu_cd     = (JSPUtil.getParameter(request, "hdr_pay_grp_lu_cd   ".trim(), length));
			String[] hdr_coa_co_cd         = (JSPUtil.getParameter(request, "hdr_coa_co_cd       ".trim(), length));
			String[] hdr_coa_rgn_cd        = (JSPUtil.getParameter(request, "hdr_coa_rgn_cd      ".trim(), length));
			String[] hdr_coa_ctr_cd        = (JSPUtil.getParameter(request, "hdr_coa_ctr_cd      ".trim(), length));
			String[] hdr_coa_acct_cd       = (JSPUtil.getParameter(request, "hdr_coa_acct_cd     ".trim(), length));
			String[] hdr_coa_vvd_cd        = (JSPUtil.getParameter(request, "hdr_coa_vvd_cd      ".trim(), length));
			String[] hdr_coa_inter_co_cd   = (JSPUtil.getParameter(request, "hdr_coa_inter_co_cd ".trim(), length));
			String[] hdr_coa_ftu_n1st_cd   = (JSPUtil.getParameter(request, "hdr_coa_ftu_n1st_cd ".trim(), length));
			String[] hdr_coa_ftu_n2nd_cd   = (JSPUtil.getParameter(request, "hdr_coa_ftu_n2nd_cd ".trim(), length));
			String[] hdr_ppd_no            = (JSPUtil.getParameter(request, "hdr_ppd_no          ".trim(), length));
			String[] hdr_ppd_dtrb_no       = (JSPUtil.getParameter(request, "hdr_ppd_dtrb_no     ".trim(), length));
			String[] hdr_ppd_aply_amt      = (JSPUtil.getParameter(request, "hdr_ppd_aply_amt    ".trim(), length));
			String[] hdr_ppd_gl_dt         = (JSPUtil.getParameter(request, "hdr_ppd_gl_dt       ".trim(), length));
			String[] hdr_apro_flg          = (JSPUtil.getParameter(request, "hdr_apro_flg        ".trim(), length));
			String[] hdr_tax_decl_flg      = (JSPUtil.getParameter(request, "hdr_tax_decl_flg    ".trim(), length));
			String[] hdr_err_csr_no        = (JSPUtil.getParameter(request, "hdr_err_csr_no      ".trim(), length));
			String[] hdr_if_flg            = (JSPUtil.getParameter(request, "hdr_if_flg          ".trim(), length));
			String[] hdr_if_dt             = (JSPUtil.getParameter(request, "hdr_if_dt           ".trim(), length));
			String[] hdr_if_err_rsn        = (JSPUtil.getParameter(request, "hdr_if_err_rsn      ".trim(), length));
			String[] hdr_ppay_aply_flg     = (JSPUtil.getParameter(request, "hdr_ppay_aply_flg   ".trim(), length));
			String[] hdr_tj_ofc_cd         = (JSPUtil.getParameter(request, "hdr_tj_ofc_cd       ".trim(), length));
			String[] hdr_act_xch_rt        = (JSPUtil.getParameter(request, "hdr_act_xch_rt      ".trim(), length));
			String[] hdr_imp_err_flg       = (JSPUtil.getParameter(request, "hdr_imp_err_flg     ".trim(), length));
			String[] hdr_rcv_err_flg       = (JSPUtil.getParameter(request, "hdr_rcv_err_flg     ".trim(), length));
			String[] hdr_tax_curr_xch_flg  = (JSPUtil.getParameter(request, "hdr_tax_curr_xch_flg".trim(), length));
			String[] hdr_usr_eml           = (JSPUtil.getParameter(request, "hdr_usr_eml         ".trim(), length));
			String[] hdr_imp_err_rsn       = (JSPUtil.getParameter(request, "hdr_imp_err_rsn     ".trim(), length));
			String[] hdr_rcv_err_rsn       = (JSPUtil.getParameter(request, "hdr_rcv_err_rsn     ".trim(), length));
			String[] hdr_ftu_use_ctnt1     = (JSPUtil.getParameter(request, "hdr_ftu_use_ctnt1   ".trim(), length));
			String[] hdr_ftu_use_ctnt2     = (JSPUtil.getParameter(request, "hdr_ftu_use_ctnt2   ".trim(), length));
			String[] hdr_ftu_use_ctnt3     = (JSPUtil.getParameter(request, "hdr_ftu_use_ctnt3   ".trim(), length));
			String[] hdr_ftu_use_ctnt4     = (JSPUtil.getParameter(request, "hdr_ftu_use_ctnt4   ".trim(), length));
			String[] hdr_ftu_use_ctnt5     = (JSPUtil.getParameter(request, "hdr_ftu_use_ctnt5   ".trim(), length));
			String[] csr_no                = (JSPUtil.getParameter(request, "csr_no              ".trim(), length));
			String[] line_seq              = (JSPUtil.getParameter(request, "line_seq            ".trim(), length));
			String[] line_no               = (JSPUtil.getParameter(request, "line_no             ".trim(), length));
			String[] line_tp_lu_cd         = (JSPUtil.getParameter(request, "line_tp_lu_cd       ".trim(), length));
			String[] inv_amt               = (JSPUtil.getParameter(request, "inv_amt             ".trim(), length));
			String[] inv_desc              = (JSPUtil.getParameter(request, "inv_desc            ".trim(), length));
			String[] inv_tax_cd            = (JSPUtil.getParameter(request, "inv_tax_cd          ".trim(), length));
			String[] dtrb_coa_co_cd        = (JSPUtil.getParameter(request, "dtrb_coa_co_cd      ".trim(), length));
			String[] dtrb_coa_rgn_cd       = (JSPUtil.getParameter(request, "dtrb_coa_rgn_cd     ".trim(), length));
			String[] dtrb_coa_ctr_cd       = (JSPUtil.getParameter(request, "dtrb_coa_ctr_cd     ".trim(), length));
			String[] dtrb_coa_acct_cd      = (JSPUtil.getParameter(request, "dtrb_coa_acct_cd    ".trim(), length));
			String[] dtrb_coa_vvd_cd       = (JSPUtil.getParameter(request, "dtrb_coa_vvd_cd     ".trim(), length));
			String[] dtrb_coa_inter_co_cd  = (JSPUtil.getParameter(request, "dtrb_coa_inter_co_cd".trim(), length));
			String[] dtrb_coa_ftu_n1st_cd  = (JSPUtil.getParameter(request, "dtrb_coa_ftu_n1st_cd".trim(), length));
			String[] dtrb_coa_ftu_n2nd_cd  = (JSPUtil.getParameter(request, "dtrb_coa_ftu_n2nd_cd".trim(), length));
			String[] attr_cate_nm          = (JSPUtil.getParameter(request, "attr_cate_nm        ".trim(), length));
			String[] attr_ctnt1            = (JSPUtil.getParameter(request, "attr_ctnt1          ".trim(), length));
			String[] attr_ctnt2            = (JSPUtil.getParameter(request, "attr_ctnt2          ".trim(), length));
			String[] attr_ctnt3            = (JSPUtil.getParameter(request, "attr_ctnt3          ".trim(), length));
			String[] attr_ctnt4            = (JSPUtil.getParameter(request, "attr_ctnt4          ".trim(), length));
			String[] attr_ctnt5            = (JSPUtil.getParameter(request, "attr_ctnt5          ".trim(), length));
			String[] attr_ctnt6            = (JSPUtil.getParameter(request, "attr_ctnt6          ".trim(), length));
			String[] attr_ctnt7            = (JSPUtil.getParameter(request, "attr_ctnt7          ".trim(), length));
			String[] attr_ctnt8            = (JSPUtil.getParameter(request, "attr_ctnt8          ".trim(), length));
			String[] attr_ctnt9            = (JSPUtil.getParameter(request, "attr_ctnt9          ".trim(), length));
			String[] attr_ctnt10           = (JSPUtil.getParameter(request, "attr_ctnt10         ".trim(), length));
			String[] attr_ctnt11           = (JSPUtil.getParameter(request, "attr_ctnt11         ".trim(), length));
			String[] attr_ctnt12           = (JSPUtil.getParameter(request, "attr_ctnt12         ".trim(), length));
			String[] attr_ctnt13           = (JSPUtil.getParameter(request, "attr_ctnt13         ".trim(), length));
			String[] attr_ctnt14           = (JSPUtil.getParameter(request, "attr_ctnt14         ".trim(), length));
			String[] attr_ctnt15           = (JSPUtil.getParameter(request, "attr_ctnt15         ".trim(), length));
			String[] bkg_no                = (JSPUtil.getParameter(request, "bkg_no              ".trim(), length));
			String[] bkg_no_split          = (JSPUtil.getParameter(request, "bkg_no_split        ".trim(), length));
			String[] cntr_tpsz_cd          = (JSPUtil.getParameter(request, "cntr_tpsz_cd        ".trim(), length));
			String[] act_vvd_cd            = (JSPUtil.getParameter(request, "act_vvd_cd          ".trim(), length));
			String[] pln_sctr_div_cd       = (JSPUtil.getParameter(request, "pln_sctr_div_cd     ".trim(), length));
			String[] so_crr_cd             = (JSPUtil.getParameter(request, "so_crr_cd           ".trim(), length));
			String[] yd_cd                 = (JSPUtil.getParameter(request, "yd_cd               ".trim(), length));
			String[] ftu_use_ctnt1         = (JSPUtil.getParameter(request, "ftu_use_ctnt1       ".trim(), length));
			String[] ftu_use_ctnt2         = (JSPUtil.getParameter(request, "ftu_use_ctnt2       ".trim(), length));
			String[] ftu_use_ctnt3         = (JSPUtil.getParameter(request, "ftu_use_ctnt3       ".trim(), length));
			String[] ftu_use_ctnt4         = (JSPUtil.getParameter(request, "ftu_use_ctnt4       ".trim(), length));
			String[] ftu_use_ctnt5         = (JSPUtil.getParameter(request, "ftu_use_ctnt5       ".trim(), length));
			String[] snd_flg               = (JSPUtil.getParameter(request, "snd_flg             ".trim(), length));
			String[] cre_dt                = (JSPUtil.getParameter(request, "cre_dt              ".trim(), length));
			String[] cre_usr_id            = (JSPUtil.getParameter(request, "cre_usr_id          ".trim(), length));
			String[] eai_evnt_dt           = (JSPUtil.getParameter(request, "eai_evnt_dt         ".trim(), length));
			String[] cxl_dt		           = (JSPUtil.getParameter(request, "cxl_dt         ".trim(), length));
			
			for (int i=0; i<length; i++) {
				model = new AP_INV_IF();
				model.setIbflag          		(ibflag               [i]);
				model.setPage_rows       		(page_rows            [i]);
				model.setAp_pgm_no              (ap_pgm_no            [i]);
				model.setInv_seq                (inv_seq              [i]);
				model.setTtl_row_knt            (ttl_row_knt          [i]);
				model.setRow_knt                (row_knt              [i]);
				model.setHdr_csr_no             (hdr_csr_no           [i]);
				model.setHdr_csr_tp_cd          (hdr_csr_tp_cd        [i]);
				model.setHdr_inv_dt             (hdr_inv_dt           [i]);
				model.setHdr_inv_term_dt        (hdr_inv_term_dt      [i]);
				model.setHdr_gl_dt              (hdr_gl_dt            [i]);
				model.setHdr_vndr_no            (hdr_vndr_no          [i]);
				model.setHdr_csr_amt            (hdr_csr_amt          [i]);
				model.setHdr_pay_amt            (hdr_pay_amt          [i]);
				model.setHdr_pay_dt             (hdr_pay_dt           [i]);
				model.setHdr_csr_curr_cd        (hdr_csr_curr_cd      [i]);
				model.setHdr_vndr_term_nm       (hdr_vndr_term_nm     [i]);
				model.setHdr_inv_desc           (hdr_inv_desc         [i]);
				model.setHdr_attr_cate_nm       (hdr_attr_cate_nm     [i]);
				model.setHdr_attr_ctnt1         (hdr_attr_ctnt1       [i]);
				model.setHdr_attr_ctnt2         (hdr_attr_ctnt2       [i]);
				model.setHdr_attr_ctnt3         (hdr_attr_ctnt3       [i]);
				model.setHdr_attr_ctnt4         (hdr_attr_ctnt4       [i]);
				model.setHdr_attr_ctnt5         (hdr_attr_ctnt5       [i]);
				model.setHdr_attr_ctnt6         (hdr_attr_ctnt6       [i]);
				model.setHdr_attr_ctnt7         (hdr_attr_ctnt7       [i]);
				model.setHdr_attr_ctnt8         (hdr_attr_ctnt8       [i]);
				model.setHdr_attr_ctnt9         (hdr_attr_ctnt9       [i]);
				model.setHdr_attr_ctnt10        (hdr_attr_ctnt10      [i]);
				model.setHdr_attr_ctnt11        (hdr_attr_ctnt11      [i]);
				model.setHdr_attr_ctnt12        (hdr_attr_ctnt12      [i]);
				model.setHdr_attr_ctnt13        (hdr_attr_ctnt13      [i]);
				model.setHdr_attr_ctnt14        (hdr_attr_ctnt14      [i]);
				model.setHdr_attr_ctnt15        (hdr_attr_ctnt15      [i]);
				model.setHdr_glo_attr_ctnt1     (hdr_glo_attr_ctnt1   [i]);
				model.setHdr_glo_attr_ctnt2     (hdr_glo_attr_ctnt2   [i]);
				model.setHdr_glo_attr_ctnt3     (hdr_glo_attr_ctnt3   [i]);
				model.setHdr_glo_attr_ctnt4     (hdr_glo_attr_ctnt4   [i]);
				model.setHdr_glo_attr_ctnt5     (hdr_glo_attr_ctnt5   [i]);
				model.setHdr_glo_attr_ctnt6     (hdr_glo_attr_ctnt6   [i]);
				model.setHdr_glo_attr_ctnt7     (hdr_glo_attr_ctnt7   [i]);
				model.setHdr_glo_attr_ctnt8     (hdr_glo_attr_ctnt8   [i]);
				model.setHdr_glo_attr_ctnt9     (hdr_glo_attr_ctnt9   [i]);
				model.setHdr_glo_attr_ctnt10    (hdr_glo_attr_ctnt10  [i]);
				model.setHdr_glo_attr_ctnt11    (hdr_glo_attr_ctnt11  [i]);
				model.setHdr_glo_attr_ctnt12    (hdr_glo_attr_ctnt12  [i]);
				model.setHdr_glo_attr_ctnt13    (hdr_glo_attr_ctnt13  [i]);
				model.setHdr_glo_attr_ctnt14    (hdr_glo_attr_ctnt14  [i]);
				model.setHdr_glo_attr_ctnt15    (hdr_glo_attr_ctnt15  [i]);
				model.setHdr_glo_attr_ctnt16    (hdr_glo_attr_ctnt16  [i]);
				model.setHdr_glo_attr_ctnt17    (hdr_glo_attr_ctnt17  [i]);
				model.setHdr_glo_attr_ctnt18    (hdr_glo_attr_ctnt18  [i]);
				model.setHdr_src_ctnt           (hdr_src_ctnt         [i]);
				model.setHdr_pay_mzd_lu_cd      (hdr_pay_mzd_lu_cd    [i]);
				model.setHdr_pay_grp_lu_cd      (hdr_pay_grp_lu_cd    [i]);
				model.setHdr_coa_co_cd          (hdr_coa_co_cd        [i]);
				model.setHdr_coa_rgn_cd         (hdr_coa_rgn_cd       [i]);
				model.setHdr_coa_ctr_cd         (hdr_coa_ctr_cd       [i]);
				model.setHdr_coa_acct_cd        (hdr_coa_acct_cd      [i]);
				model.setHdr_coa_vvd_cd         (hdr_coa_vvd_cd       [i]);
				model.setHdr_coa_inter_co_cd    (hdr_coa_inter_co_cd  [i]);
				model.setHdr_coa_ftu_n1st_cd    (hdr_coa_ftu_n1st_cd  [i]);
				model.setHdr_coa_ftu_n2nd_cd    (hdr_coa_ftu_n2nd_cd  [i]);
				model.setHdr_ppd_no             (hdr_ppd_no           [i]);
				model.setHdr_ppd_dtrb_no        (hdr_ppd_dtrb_no      [i]);
				model.setHdr_ppd_aply_amt       (hdr_ppd_aply_amt     [i]);
				model.setHdr_ppd_gl_dt          (hdr_ppd_gl_dt        [i]);
				model.setHdr_apro_flg           (hdr_apro_flg         [i]);
				model.setHdr_tax_decl_flg       (hdr_tax_decl_flg     [i]);
				model.setHdr_err_csr_no         (hdr_err_csr_no       [i]);
				model.setHdr_if_flg             (hdr_if_flg           [i]);
				model.setHdr_if_dt              (hdr_if_dt            [i]);
				model.setHdr_if_err_rsn         (hdr_if_err_rsn       [i]);
				model.setHdr_ppay_aply_flg      (hdr_ppay_aply_flg    [i]);
				model.setHdr_tj_ofc_cd          (hdr_tj_ofc_cd        [i]);
				model.setHdr_act_xch_rt         (hdr_act_xch_rt       [i]);
				model.setHdr_imp_err_flg        (hdr_imp_err_flg      [i]);
				model.setHdr_rcv_err_flg        (hdr_rcv_err_flg      [i]);
				model.setHdr_tax_curr_xch_flg   (hdr_tax_curr_xch_flg [i]);
				model.setHdr_usr_eml            (hdr_usr_eml          [i]);
				model.setHdr_imp_err_rsn        (hdr_imp_err_rsn      [i]);
				model.setHdr_rcv_err_rsn        (hdr_rcv_err_rsn      [i]);
				model.setHdr_ftu_use_ctnt1      (hdr_ftu_use_ctnt1    [i]);
				model.setHdr_ftu_use_ctnt2      (hdr_ftu_use_ctnt2    [i]);
				model.setHdr_ftu_use_ctnt3      (hdr_ftu_use_ctnt3    [i]);
				model.setHdr_ftu_use_ctnt4      (hdr_ftu_use_ctnt4    [i]);
				model.setHdr_ftu_use_ctnt5      (hdr_ftu_use_ctnt5    [i]);
				model.setCsr_no                 (csr_no               [i]);
				model.setLine_seq               (line_seq             [i]);
				model.setLine_no                (line_no              [i]);
				model.setLine_tp_lu_cd          (line_tp_lu_cd        [i]);
				model.setInv_amt                (inv_amt              [i]);
				model.setInv_desc               (inv_desc             [i]);
				model.setInv_tax_cd             (inv_tax_cd           [i]);
				model.setDtrb_coa_co_cd         (dtrb_coa_co_cd       [i]);
				model.setDtrb_coa_rgn_cd        (dtrb_coa_rgn_cd      [i]);
				model.setDtrb_coa_ctr_cd        (dtrb_coa_ctr_cd      [i]);
				model.setDtrb_coa_acct_cd       (dtrb_coa_acct_cd     [i]);
				model.setDtrb_coa_vvd_cd        (dtrb_coa_vvd_cd      [i]);
				model.setDtrb_coa_inter_co_cd   (dtrb_coa_inter_co_cd [i]);
				model.setDtrb_coa_ftu_n1st_cd   (dtrb_coa_ftu_n1st_cd [i]);
				model.setDtrb_coa_ftu_n2nd_cd   (dtrb_coa_ftu_n2nd_cd [i]);
				model.setAttr_cate_nm           (attr_cate_nm         [i]);
				model.setAttr_ctnt1             (attr_ctnt1           [i]);
				model.setAttr_ctnt2             (attr_ctnt2           [i]);
				model.setAttr_ctnt3             (attr_ctnt3           [i]);
				model.setAttr_ctnt4             (attr_ctnt4           [i]);
				model.setAttr_ctnt5             (attr_ctnt5           [i]);
				model.setAttr_ctnt6             (attr_ctnt6           [i]);
				model.setAttr_ctnt7             (attr_ctnt7           [i]);
				model.setAttr_ctnt8             (attr_ctnt8           [i]);
				model.setAttr_ctnt9             (attr_ctnt9           [i]);
				model.setAttr_ctnt10            (attr_ctnt10          [i]);
				model.setAttr_ctnt11            (attr_ctnt11          [i]);
				model.setAttr_ctnt12            (attr_ctnt12          [i]);
				model.setAttr_ctnt13            (attr_ctnt13          [i]);
				model.setAttr_ctnt14            (attr_ctnt14          [i]);
				model.setAttr_ctnt15            (attr_ctnt15          [i]);
				model.setBkg_no                 (bkg_no               [i]);
				model.setBkg_no_split           (bkg_no_split         [i]);
				model.setCntr_tpsz_cd           (cntr_tpsz_cd         [i]);
				model.setAct_vvd_cd             (act_vvd_cd           [i]);
				model.setPln_sctr_div_cd        (pln_sctr_div_cd      [i]);
				model.setSo_crr_cd              (so_crr_cd            [i]);
				model.setYd_cd                  (yd_cd                [i]);
				model.setFtu_use_ctnt1          (ftu_use_ctnt1        [i]);
				model.setFtu_use_ctnt2          (ftu_use_ctnt2        [i]);
				model.setFtu_use_ctnt3          (ftu_use_ctnt3        [i]);
				model.setFtu_use_ctnt4          (ftu_use_ctnt4        [i]);
				model.setFtu_use_ctnt5          (ftu_use_ctnt5        [i]);
				model.setSnd_flg                (snd_flg              [i]);
				model.setCre_dt                 (cre_dt               [i]);
				model.setCre_usr_id             (cre_usr_id           [i]);
				model.setEai_evnt_dt            (eai_evnt_dt          [i]);
				model.setCxl_dt		            (cxl_dt		          [i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}   
		return models;
	}       
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		AP_INV_IF model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues(prefix+"ibflag")==null?0:request.getParameterValues(prefix+"ibflag").length;
		try {
			String[] ibflag           =  (JSPUtil.getParameter(request, prefix + "ibflag          		".trim(), length));
			String[] page_rows        =  (JSPUtil.getParameter(request, prefix + "page_rows       		".trim(), length));
			String[] ap_pgm_no            = (JSPUtil.getParameter(request, prefix + "ap_pgm_no           ".trim(), length));
			String[] inv_seq              = (JSPUtil.getParameter(request, prefix + "inv_seq             ".trim(), length));
			String[] ttl_row_knt          = (JSPUtil.getParameter(request, prefix + "ttl_row_knt         ".trim(), length));
			String[] row_knt              = (JSPUtil.getParameter(request, prefix + "row_knt             ".trim(), length));
			String[] hdr_csr_no           = (JSPUtil.getParameter(request, prefix + "hdr_csr_no          ".trim(), length));
			String[] hdr_csr_tp_cd        = (JSPUtil.getParameter(request, prefix + "hdr_csr_tp_cd       ".trim(), length));
			String[] hdr_inv_dt           = (JSPUtil.getParameter(request, prefix + "hdr_inv_dt          ".trim(), length));
			String[] hdr_inv_term_dt      = (JSPUtil.getParameter(request, prefix + "hdr_inv_term_dt     ".trim(), length));
			String[] hdr_gl_dt            = (JSPUtil.getParameter(request, prefix + "hdr_gl_dt           ".trim(), length));
			String[] hdr_vndr_no          = (JSPUtil.getParameter(request, prefix + "hdr_vndr_no         ".trim(), length));
			String[] hdr_csr_amt          = (JSPUtil.getParameter(request, prefix + "hdr_csr_amt         ".trim(), length));
			String[] hdr_pay_amt          = (JSPUtil.getParameter(request, prefix + "hdr_pay_amt         ".trim(), length));
			String[] hdr_pay_dt           = (JSPUtil.getParameter(request, prefix + "hdr_pay_dt          ".trim(), length));
			String[] hdr_csr_curr_cd      = (JSPUtil.getParameter(request, prefix + "hdr_csr_curr_cd     ".trim(), length));
			String[] hdr_vndr_term_nm     = (JSPUtil.getParameter(request, prefix + "hdr_vndr_term_nm    ".trim(), length));
			String[] hdr_inv_desc         = (JSPUtil.getParameter(request, prefix + "hdr_inv_desc        ".trim(), length));
			String[] hdr_attr_cate_nm     = (JSPUtil.getParameter(request, prefix + "hdr_attr_cate_nm    ".trim(), length));
			String[] hdr_attr_ctnt1       = (JSPUtil.getParameter(request, prefix + "hdr_attr_ctnt1      ".trim(), length));
			String[] hdr_attr_ctnt2       = (JSPUtil.getParameter(request, prefix + "hdr_attr_ctnt2      ".trim(), length));
			String[] hdr_attr_ctnt3       = (JSPUtil.getParameter(request, prefix + "hdr_attr_ctnt3      ".trim(), length));
			String[] hdr_attr_ctnt4       = (JSPUtil.getParameter(request, prefix + "hdr_attr_ctnt4      ".trim(), length));
			String[] hdr_attr_ctnt5       = (JSPUtil.getParameter(request, prefix + "hdr_attr_ctnt5      ".trim(), length));
			String[] hdr_attr_ctnt6       = (JSPUtil.getParameter(request, prefix + "hdr_attr_ctnt6      ".trim(), length));
			String[] hdr_attr_ctnt7       = (JSPUtil.getParameter(request, prefix + "hdr_attr_ctnt7      ".trim(), length));
			String[] hdr_attr_ctnt8       = (JSPUtil.getParameter(request, prefix + "hdr_attr_ctnt8      ".trim(), length));
			String[] hdr_attr_ctnt9       = (JSPUtil.getParameter(request, prefix + "hdr_attr_ctnt9      ".trim(), length));
			String[] hdr_attr_ctnt10      = (JSPUtil.getParameter(request, prefix + "hdr_attr_ctnt10     ".trim(), length));
			String[] hdr_attr_ctnt11      = (JSPUtil.getParameter(request, prefix + "hdr_attr_ctnt11     ".trim(), length));
			String[] hdr_attr_ctnt12      = (JSPUtil.getParameter(request, prefix + "hdr_attr_ctnt12     ".trim(), length));
			String[] hdr_attr_ctnt13      = (JSPUtil.getParameter(request, prefix + "hdr_attr_ctnt13     ".trim(), length));
			String[] hdr_attr_ctnt14      = (JSPUtil.getParameter(request, prefix + "hdr_attr_ctnt14     ".trim(), length));
			String[] hdr_attr_ctnt15      = (JSPUtil.getParameter(request, prefix + "hdr_attr_ctnt15     ".trim(), length));
			String[] hdr_glo_attr_ctnt1   = (JSPUtil.getParameter(request, prefix + "hdr_glo_attr_ctnt1  ".trim(), length));
			String[] hdr_glo_attr_ctnt2   = (JSPUtil.getParameter(request, prefix + "hdr_glo_attr_ctnt2  ".trim(), length));
			String[] hdr_glo_attr_ctnt3   = (JSPUtil.getParameter(request, prefix + "hdr_glo_attr_ctnt3  ".trim(), length));
			String[] hdr_glo_attr_ctnt4   = (JSPUtil.getParameter(request, prefix + "hdr_glo_attr_ctnt4  ".trim(), length));
			String[] hdr_glo_attr_ctnt5   = (JSPUtil.getParameter(request, prefix + "hdr_glo_attr_ctnt5  ".trim(), length));
			String[] hdr_glo_attr_ctnt6   = (JSPUtil.getParameter(request, prefix + "hdr_glo_attr_ctnt6  ".trim(), length));
			String[] hdr_glo_attr_ctnt7   = (JSPUtil.getParameter(request, prefix + "hdr_glo_attr_ctnt7  ".trim(), length));
			String[] hdr_glo_attr_ctnt8   = (JSPUtil.getParameter(request, prefix + "hdr_glo_attr_ctnt8  ".trim(), length));
			String[] hdr_glo_attr_ctnt9   = (JSPUtil.getParameter(request, prefix + "hdr_glo_attr_ctnt9  ".trim(), length));
			String[] hdr_glo_attr_ctnt10  = (JSPUtil.getParameter(request, prefix + "hdr_glo_attr_ctnt10 ".trim(), length));
			String[] hdr_glo_attr_ctnt11  = (JSPUtil.getParameter(request, prefix + "hdr_glo_attr_ctnt11 ".trim(), length));
			String[] hdr_glo_attr_ctnt12  = (JSPUtil.getParameter(request, prefix + "hdr_glo_attr_ctnt12 ".trim(), length));
			String[] hdr_glo_attr_ctnt13  = (JSPUtil.getParameter(request, prefix + "hdr_glo_attr_ctnt13 ".trim(), length));
			String[] hdr_glo_attr_ctnt14  = (JSPUtil.getParameter(request, prefix + "hdr_glo_attr_ctnt14 ".trim(), length));
			String[] hdr_glo_attr_ctnt15  = (JSPUtil.getParameter(request, prefix + "hdr_glo_attr_ctnt15 ".trim(), length));
			String[] hdr_glo_attr_ctnt16  = (JSPUtil.getParameter(request, prefix + "hdr_glo_attr_ctnt16 ".trim(), length));
			String[] hdr_glo_attr_ctnt17  = (JSPUtil.getParameter(request, prefix + "hdr_glo_attr_ctnt17 ".trim(), length));
			String[] hdr_glo_attr_ctnt18  = (JSPUtil.getParameter(request, prefix + "hdr_glo_attr_ctnt18 ".trim(), length));
			String[] hdr_src_ctnt         = (JSPUtil.getParameter(request, prefix + "hdr_src_ctnt        ".trim(), length));
			String[] hdr_pay_mzd_lu_cd    = (JSPUtil.getParameter(request, prefix + "hdr_pay_mzd_lu_cd   ".trim(), length));
			String[] hdr_pay_grp_lu_cd    = (JSPUtil.getParameter(request, prefix + "hdr_pay_grp_lu_cd   ".trim(), length));
			String[] hdr_coa_co_cd        = (JSPUtil.getParameter(request, prefix + "hdr_coa_co_cd       ".trim(), length));
			String[] hdr_coa_rgn_cd       = (JSPUtil.getParameter(request, prefix + "hdr_coa_rgn_cd      ".trim(), length));
			String[] hdr_coa_ctr_cd       = (JSPUtil.getParameter(request, prefix + "hdr_coa_ctr_cd      ".trim(), length));
			String[] hdr_coa_acct_cd      = (JSPUtil.getParameter(request, prefix + "hdr_coa_acct_cd     ".trim(), length));
			String[] hdr_coa_vvd_cd       = (JSPUtil.getParameter(request, prefix + "hdr_coa_vvd_cd      ".trim(), length));
			String[] hdr_coa_inter_co_cd  = (JSPUtil.getParameter(request, prefix + "hdr_coa_inter_co_cd ".trim(), length));
			String[] hdr_coa_ftu_n1st_cd  = (JSPUtil.getParameter(request, prefix + "hdr_coa_ftu_n1st_cd ".trim(), length));
			String[] hdr_coa_ftu_n2nd_cd  = (JSPUtil.getParameter(request, prefix + "hdr_coa_ftu_n2nd_cd ".trim(), length));
			String[] hdr_ppd_no           = (JSPUtil.getParameter(request, prefix + "hdr_ppd_no          ".trim(), length));
			String[] hdr_ppd_dtrb_no      = (JSPUtil.getParameter(request, prefix + "hdr_ppd_dtrb_no     ".trim(), length));
			String[] hdr_ppd_aply_amt     = (JSPUtil.getParameter(request, prefix + "hdr_ppd_aply_amt    ".trim(), length));
			String[] hdr_ppd_gl_dt        = (JSPUtil.getParameter(request, prefix + "hdr_ppd_gl_dt       ".trim(), length));
			String[] hdr_apro_flg         = (JSPUtil.getParameter(request, prefix + "hdr_apro_flg        ".trim(), length));
			String[] hdr_tax_decl_flg     = (JSPUtil.getParameter(request, prefix + "hdr_tax_decl_flg    ".trim(), length));
			String[] hdr_err_csr_no       = (JSPUtil.getParameter(request, prefix + "hdr_err_csr_no      ".trim(), length));
			String[] hdr_if_flg           = (JSPUtil.getParameter(request, prefix + "hdr_if_flg          ".trim(), length));
			String[] hdr_if_dt            = (JSPUtil.getParameter(request, prefix + "hdr_if_dt           ".trim(), length));
			String[] hdr_if_err_rsn       = (JSPUtil.getParameter(request, prefix + "hdr_if_err_rsn      ".trim(), length));
			String[] hdr_ppay_aply_flg    = (JSPUtil.getParameter(request, prefix + "hdr_ppay_aply_flg   ".trim(), length));
			String[] hdr_tj_ofc_cd        = (JSPUtil.getParameter(request, prefix + "hdr_tj_ofc_cd       ".trim(), length));
			String[] hdr_act_xch_rt       = (JSPUtil.getParameter(request, prefix + "hdr_act_xch_rt      ".trim(), length));
			String[] hdr_imp_err_flg      = (JSPUtil.getParameter(request, prefix + "hdr_imp_err_flg     ".trim(), length));
			String[] hdr_rcv_err_flg      = (JSPUtil.getParameter(request, prefix + "hdr_rcv_err_flg     ".trim(), length));
			String[] hdr_tax_curr_xch_flg = (JSPUtil.getParameter(request, prefix + "hdr_tax_curr_xch_flg".trim(), length));
			String[] hdr_usr_eml          = (JSPUtil.getParameter(request, prefix + "hdr_usr_eml         ".trim(), length));
			String[] hdr_imp_err_rsn      = (JSPUtil.getParameter(request, prefix + "hdr_imp_err_rsn     ".trim(), length));
			String[] hdr_rcv_err_rsn      = (JSPUtil.getParameter(request, prefix + "hdr_rcv_err_rsn     ".trim(), length));
			String[] hdr_ftu_use_ctnt1    = (JSPUtil.getParameter(request, prefix + "hdr_ftu_use_ctnt1   ".trim(), length));
			String[] hdr_ftu_use_ctnt2    = (JSPUtil.getParameter(request, prefix + "hdr_ftu_use_ctnt2   ".trim(), length));
			String[] hdr_ftu_use_ctnt3    = (JSPUtil.getParameter(request, prefix + "hdr_ftu_use_ctnt3   ".trim(), length));
			String[] hdr_ftu_use_ctnt4    = (JSPUtil.getParameter(request, prefix + "hdr_ftu_use_ctnt4   ".trim(), length));
			String[] hdr_ftu_use_ctnt5    = (JSPUtil.getParameter(request, prefix + "hdr_ftu_use_ctnt5   ".trim(), length));
			String[] csr_no               = (JSPUtil.getParameter(request, prefix + "csr_no              ".trim(), length));
			String[] line_seq             = (JSPUtil.getParameter(request, prefix + "line_seq            ".trim(), length));
			String[] line_no              = (JSPUtil.getParameter(request, prefix + "line_no             ".trim(), length));
			String[] line_tp_lu_cd        = (JSPUtil.getParameter(request, prefix + "line_tp_lu_cd       ".trim(), length));
			String[] inv_amt              = (JSPUtil.getParameter(request, prefix + "inv_amt             ".trim(), length));
			String[] inv_desc             = (JSPUtil.getParameter(request, prefix + "inv_desc            ".trim(), length));
			String[] inv_tax_cd           = (JSPUtil.getParameter(request, prefix + "inv_tax_cd          ".trim(), length));
			String[] dtrb_coa_co_cd       = (JSPUtil.getParameter(request, prefix + "dtrb_coa_co_cd      ".trim(), length));
			String[] dtrb_coa_rgn_cd      = (JSPUtil.getParameter(request, prefix + "dtrb_coa_rgn_cd     ".trim(), length));
			String[] dtrb_coa_ctr_cd      = (JSPUtil.getParameter(request, prefix + "dtrb_coa_ctr_cd     ".trim(), length));
			String[] dtrb_coa_acct_cd     = (JSPUtil.getParameter(request, prefix + "dtrb_coa_acct_cd    ".trim(), length));
			String[] dtrb_coa_vvd_cd      = (JSPUtil.getParameter(request, prefix + "dtrb_coa_vvd_cd     ".trim(), length));
			String[] dtrb_coa_inter_co_cd = (JSPUtil.getParameter(request, prefix + "dtrb_coa_inter_co_cd".trim(), length));
			String[] dtrb_coa_ftu_n1st_cd = (JSPUtil.getParameter(request, prefix + "dtrb_coa_ftu_n1st_cd".trim(), length));
			String[] dtrb_coa_ftu_n2nd_cd = (JSPUtil.getParameter(request, prefix + "dtrb_coa_ftu_n2nd_cd".trim(), length));
			String[] attr_cate_nm         = (JSPUtil.getParameter(request, prefix + "attr_cate_nm        ".trim(), length));
			String[] attr_ctnt1           = (JSPUtil.getParameter(request, prefix + "attr_ctnt1          ".trim(), length));
			String[] attr_ctnt2           = (JSPUtil.getParameter(request, prefix + "attr_ctnt2          ".trim(), length));
			String[] attr_ctnt3           = (JSPUtil.getParameter(request, prefix + "attr_ctnt3          ".trim(), length));
			String[] attr_ctnt4           = (JSPUtil.getParameter(request, prefix + "attr_ctnt4          ".trim(), length));
			String[] attr_ctnt5           = (JSPUtil.getParameter(request, prefix + "attr_ctnt5          ".trim(), length));
			String[] attr_ctnt6           = (JSPUtil.getParameter(request, prefix + "attr_ctnt6          ".trim(), length));
			String[] attr_ctnt7           = (JSPUtil.getParameter(request, prefix + "attr_ctnt7          ".trim(), length));
			String[] attr_ctnt8           = (JSPUtil.getParameter(request, prefix + "attr_ctnt8          ".trim(), length));
			String[] attr_ctnt9           = (JSPUtil.getParameter(request, prefix + "attr_ctnt9          ".trim(), length));
			String[] attr_ctnt10          = (JSPUtil.getParameter(request, prefix + "attr_ctnt10         ".trim(), length));
			String[] attr_ctnt11          = (JSPUtil.getParameter(request, prefix + "attr_ctnt11         ".trim(), length));
			String[] attr_ctnt12          = (JSPUtil.getParameter(request, prefix + "attr_ctnt12         ".trim(), length));
			String[] attr_ctnt13          = (JSPUtil.getParameter(request, prefix + "attr_ctnt13         ".trim(), length));
			String[] attr_ctnt14          = (JSPUtil.getParameter(request, prefix + "attr_ctnt14         ".trim(), length));
			String[] attr_ctnt15          = (JSPUtil.getParameter(request, prefix + "attr_ctnt15         ".trim(), length));
			String[] bkg_no               = (JSPUtil.getParameter(request, prefix + "bkg_no              ".trim(), length));
			String[] bkg_no_split         = (JSPUtil.getParameter(request, prefix + "bkg_no_split        ".trim(), length));
			String[] cntr_tpsz_cd         = (JSPUtil.getParameter(request, prefix + "cntr_tpsz_cd        ".trim(), length));
			String[] act_vvd_cd           = (JSPUtil.getParameter(request, prefix + "act_vvd_cd          ".trim(), length));
			String[] pln_sctr_div_cd      = (JSPUtil.getParameter(request, prefix + "pln_sctr_div_cd     ".trim(), length));
			String[] so_crr_cd            = (JSPUtil.getParameter(request, prefix + "so_crr_cd           ".trim(), length));
			String[] yd_cd                = (JSPUtil.getParameter(request, prefix + "yd_cd               ".trim(), length));
			String[] ftu_use_ctnt1        = (JSPUtil.getParameter(request, prefix + "ftu_use_ctnt1       ".trim(), length));
			String[] ftu_use_ctnt2        = (JSPUtil.getParameter(request, prefix + "ftu_use_ctnt2       ".trim(), length));
			String[] ftu_use_ctnt3        = (JSPUtil.getParameter(request, prefix + "ftu_use_ctnt3       ".trim(), length));
			String[] ftu_use_ctnt4        = (JSPUtil.getParameter(request, prefix + "ftu_use_ctnt4       ".trim(), length));
			String[] ftu_use_ctnt5        = (JSPUtil.getParameter(request, prefix + "ftu_use_ctnt5       ".trim(), length));
			String[] snd_flg              = (JSPUtil.getParameter(request, prefix + "snd_flg             ".trim(), length));
			String[] cre_dt               = (JSPUtil.getParameter(request, prefix + "cre_dt              ".trim(), length));
			String[] cre_usr_id           = (JSPUtil.getParameter(request, prefix + "cre_usr_id          ".trim(), length));
			String[] eai_evnt_dt          = (JSPUtil.getParameter(request, prefix + "eai_evnt_dt         ".trim(), length));
			String[] cxl_dt		          = (JSPUtil.getParameter(request, prefix + "cxl_dt         ".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new AP_INV_IF();
				model.setIbflag               (ibflag          	   [i]);
				model.setPage_rows            (page_rows       	   [i]);
				model.setAp_pgm_no            (ap_pgm_no           [i]);
				model.setInv_seq              (inv_seq             [i]);
				model.setTtl_row_knt          (ttl_row_knt         [i]);
				model.setRow_knt              (row_knt             [i]);
				model.setHdr_csr_no           (hdr_csr_no          [i]);
				model.setHdr_csr_tp_cd        (hdr_csr_tp_cd       [i]);
				model.setHdr_inv_dt           (hdr_inv_dt          [i]);
				model.setHdr_inv_term_dt      (hdr_inv_term_dt     [i]);
				model.setHdr_gl_dt            (hdr_gl_dt           [i]);
				model.setHdr_vndr_no          (hdr_vndr_no         [i]);
				model.setHdr_csr_amt          (hdr_csr_amt         [i]);
				model.setHdr_pay_amt          (hdr_pay_amt         [i]);
				model.setHdr_pay_dt           (hdr_pay_dt          [i]);
				model.setHdr_csr_curr_cd      (hdr_csr_curr_cd     [i]);
				model.setHdr_vndr_term_nm     (hdr_vndr_term_nm    [i]);
				model.setHdr_inv_desc         (hdr_inv_desc        [i]);
				model.setHdr_attr_cate_nm     (hdr_attr_cate_nm    [i]);
				model.setHdr_attr_ctnt1       (hdr_attr_ctnt1      [i]);
				model.setHdr_attr_ctnt2       (hdr_attr_ctnt2      [i]);
				model.setHdr_attr_ctnt3       (hdr_attr_ctnt3      [i]);
				model.setHdr_attr_ctnt4       (hdr_attr_ctnt4      [i]);
				model.setHdr_attr_ctnt5       (hdr_attr_ctnt5      [i]);
				model.setHdr_attr_ctnt6       (hdr_attr_ctnt6      [i]);
				model.setHdr_attr_ctnt7       (hdr_attr_ctnt7      [i]);
				model.setHdr_attr_ctnt8       (hdr_attr_ctnt8      [i]);
				model.setHdr_attr_ctnt9       (hdr_attr_ctnt9      [i]);
				model.setHdr_attr_ctnt10      (hdr_attr_ctnt10     [i]);
				model.setHdr_attr_ctnt11      (hdr_attr_ctnt11     [i]);
				model.setHdr_attr_ctnt12      (hdr_attr_ctnt12     [i]);
				model.setHdr_attr_ctnt13      (hdr_attr_ctnt13     [i]);
				model.setHdr_attr_ctnt14      (hdr_attr_ctnt14     [i]);
				model.setHdr_attr_ctnt15      (hdr_attr_ctnt15     [i]);
				model.setHdr_glo_attr_ctnt1   (hdr_glo_attr_ctnt1  [i]);
				model.setHdr_glo_attr_ctnt2   (hdr_glo_attr_ctnt2  [i]);
				model.setHdr_glo_attr_ctnt3   (hdr_glo_attr_ctnt3  [i]);
				model.setHdr_glo_attr_ctnt4   (hdr_glo_attr_ctnt4  [i]);
				model.setHdr_glo_attr_ctnt5   (hdr_glo_attr_ctnt5  [i]);
				model.setHdr_glo_attr_ctnt6   (hdr_glo_attr_ctnt6  [i]);
				model.setHdr_glo_attr_ctnt7   (hdr_glo_attr_ctnt7  [i]);
				model.setHdr_glo_attr_ctnt8   (hdr_glo_attr_ctnt8  [i]);
				model.setHdr_glo_attr_ctnt9   (hdr_glo_attr_ctnt9  [i]);
				model.setHdr_glo_attr_ctnt10  (hdr_glo_attr_ctnt10 [i]);
				model.setHdr_glo_attr_ctnt11  (hdr_glo_attr_ctnt11 [i]);
				model.setHdr_glo_attr_ctnt12  (hdr_glo_attr_ctnt12 [i]);
				model.setHdr_glo_attr_ctnt13  (hdr_glo_attr_ctnt13 [i]);
				model.setHdr_glo_attr_ctnt14  (hdr_glo_attr_ctnt14 [i]);
				model.setHdr_glo_attr_ctnt15  (hdr_glo_attr_ctnt15 [i]);
				model.setHdr_glo_attr_ctnt16  (hdr_glo_attr_ctnt16 [i]);
				model.setHdr_glo_attr_ctnt17  (hdr_glo_attr_ctnt17 [i]);
				model.setHdr_glo_attr_ctnt18  (hdr_glo_attr_ctnt18 [i]);
				model.setHdr_src_ctnt         (hdr_src_ctnt        [i]);
				model.setHdr_pay_mzd_lu_cd    (hdr_pay_mzd_lu_cd   [i]);
				model.setHdr_pay_grp_lu_cd    (hdr_pay_grp_lu_cd   [i]);
				model.setHdr_coa_co_cd        (hdr_coa_co_cd       [i]);
				model.setHdr_coa_rgn_cd       (hdr_coa_rgn_cd      [i]);
				model.setHdr_coa_ctr_cd       (hdr_coa_ctr_cd      [i]);
				model.setHdr_coa_acct_cd      (hdr_coa_acct_cd     [i]);
				model.setHdr_coa_vvd_cd       (hdr_coa_vvd_cd      [i]);
				model.setHdr_coa_inter_co_cd  (hdr_coa_inter_co_cd [i]);
				model.setHdr_coa_ftu_n1st_cd  (hdr_coa_ftu_n1st_cd [i]);
				model.setHdr_coa_ftu_n2nd_cd  (hdr_coa_ftu_n2nd_cd [i]);
				model.setHdr_ppd_no           (hdr_ppd_no          [i]);
				model.setHdr_ppd_dtrb_no      (hdr_ppd_dtrb_no     [i]);
				model.setHdr_ppd_aply_amt     (hdr_ppd_aply_amt    [i]);
				model.setHdr_ppd_gl_dt        (hdr_ppd_gl_dt       [i]);
				model.setHdr_apro_flg         (hdr_apro_flg        [i]);
				model.setHdr_tax_decl_flg     (hdr_tax_decl_flg    [i]);
				model.setHdr_err_csr_no       (hdr_err_csr_no      [i]);
				model.setHdr_if_flg           (hdr_if_flg          [i]);
				model.setHdr_if_dt            (hdr_if_dt           [i]);
				model.setHdr_if_err_rsn       (hdr_if_err_rsn      [i]);
				model.setHdr_ppay_aply_flg    (hdr_ppay_aply_flg   [i]);
				model.setHdr_tj_ofc_cd        (hdr_tj_ofc_cd       [i]);
				model.setHdr_act_xch_rt       (hdr_act_xch_rt      [i]);
				model.setHdr_imp_err_flg      (hdr_imp_err_flg     [i]);
				model.setHdr_rcv_err_flg      (hdr_rcv_err_flg     [i]);
				model.setHdr_tax_curr_xch_flg (hdr_tax_curr_xch_flg[i]);
				model.setHdr_usr_eml          (hdr_usr_eml         [i]);
				model.setHdr_imp_err_rsn      (hdr_imp_err_rsn     [i]);
				model.setHdr_rcv_err_rsn      (hdr_rcv_err_rsn     [i]);
				model.setHdr_ftu_use_ctnt1    (hdr_ftu_use_ctnt1   [i]);
				model.setHdr_ftu_use_ctnt2    (hdr_ftu_use_ctnt2   [i]);
				model.setHdr_ftu_use_ctnt3    (hdr_ftu_use_ctnt3   [i]);
				model.setHdr_ftu_use_ctnt4    (hdr_ftu_use_ctnt4   [i]);
				model.setHdr_ftu_use_ctnt5    (hdr_ftu_use_ctnt5   [i]);
				model.setCsr_no               (csr_no              [i]);
				model.setLine_seq             (line_seq            [i]);
				model.setLine_no              (line_no             [i]);
				model.setLine_tp_lu_cd        (line_tp_lu_cd       [i]);
				model.setInv_amt              (inv_amt             [i]);
				model.setInv_desc             (inv_desc            [i]);
				model.setInv_tax_cd           (inv_tax_cd          [i]);
				model.setDtrb_coa_co_cd       (dtrb_coa_co_cd      [i]);
				model.setDtrb_coa_rgn_cd      (dtrb_coa_rgn_cd     [i]);
				model.setDtrb_coa_ctr_cd      (dtrb_coa_ctr_cd     [i]);
				model.setDtrb_coa_acct_cd     (dtrb_coa_acct_cd    [i]);
				model.setDtrb_coa_vvd_cd      (dtrb_coa_vvd_cd     [i]);
				model.setDtrb_coa_inter_co_cd (dtrb_coa_inter_co_cd[i]);
				model.setDtrb_coa_ftu_n1st_cd (dtrb_coa_ftu_n1st_cd[i]);
				model.setDtrb_coa_ftu_n2nd_cd (dtrb_coa_ftu_n2nd_cd[i]);
				model.setAttr_cate_nm         (attr_cate_nm        [i]);
				model.setAttr_ctnt1           (attr_ctnt1          [i]);
				model.setAttr_ctnt2           (attr_ctnt2          [i]);
				model.setAttr_ctnt3           (attr_ctnt3          [i]);
				model.setAttr_ctnt4           (attr_ctnt4          [i]);
				model.setAttr_ctnt5           (attr_ctnt5          [i]);
				model.setAttr_ctnt6           (attr_ctnt6          [i]);
				model.setAttr_ctnt7           (attr_ctnt7          [i]);
				model.setAttr_ctnt8           (attr_ctnt8          [i]);
				model.setAttr_ctnt9           (attr_ctnt9          [i]);
				model.setAttr_ctnt10          (attr_ctnt10         [i]);
				model.setAttr_ctnt11          (attr_ctnt11         [i]);
				model.setAttr_ctnt12          (attr_ctnt12         [i]);
				model.setAttr_ctnt13          (attr_ctnt13         [i]);
				model.setAttr_ctnt14          (attr_ctnt14         [i]);
				model.setAttr_ctnt15          (attr_ctnt15         [i]);
				model.setBkg_no               (bkg_no              [i]);
				model.setBkg_no_split         (bkg_no_split        [i]);
				model.setCntr_tpsz_cd         (cntr_tpsz_cd        [i]);
				model.setAct_vvd_cd           (act_vvd_cd          [i]);
				model.setPln_sctr_div_cd      (pln_sctr_div_cd     [i]);
				model.setSo_crr_cd            (so_crr_cd           [i]);
				model.setYd_cd                (yd_cd               [i]);
				model.setFtu_use_ctnt1        (ftu_use_ctnt1       [i]);
				model.setFtu_use_ctnt2        (ftu_use_ctnt2       [i]);
				model.setFtu_use_ctnt3        (ftu_use_ctnt3       [i]);
				model.setFtu_use_ctnt4        (ftu_use_ctnt4       [i]);
				model.setFtu_use_ctnt5        (ftu_use_ctnt5       [i]);
				model.setSnd_flg              (snd_flg             [i]);
				model.setCre_dt               (cre_dt              [i]);
				model.setCre_usr_id           (cre_usr_id          [i]);
				model.setEai_evnt_dt          (eai_evnt_dt         [i]);
				model.setCxl_dt		          (cxl_dt		       [i]);
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
