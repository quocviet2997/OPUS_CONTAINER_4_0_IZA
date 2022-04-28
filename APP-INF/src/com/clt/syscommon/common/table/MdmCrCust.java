/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : MDM_CR_CUST.java
*@FileTitle : 사용자 관리5
*Open Issues :
*Change history :
*@LastModifyDate : 2007-01-12
*@LastModifier : Kildong_hong6
*@LastVersion : 1.0
* 2007-01-12 Kildong_hong6
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
public final class MdmCrCust implements java.io.Serializable {

	private String                ibflag                = "";
	private String                page_rows             = "";
	private String                cust_cnt_cd           = "";
	private String                cust_seq              = "";
	private String                act_cust_cnt_cd       = "";
	private String                act_cust_seq          = "";
	private String                cust_rlse_ctrl_flg    = "";
	private String                cr_flg                = "";
	private String                cr_curr_cd            = "";
	private String                cr_amt                = "";
	private String                cr_clt_ofc_cd         = "";
	private String                cr_cust_rmk           = "";
	private String                ib_cr_term_dys        = "";
	private String                ob_cr_term_dys        = "";
	private String                pay_div_cd            = "";
	private String                cr_st_dt              = "";
	private String                cr_end_dt             = "";
	private String                cr_cust_tp_cd         = "";
	private String                kr_ib_ofc_cd          = "";
	private String                ob_eml                = "";
	private String                ib_eml                = "";
	private String                ob_phn_no             = "";
	private String                ib_phn_no             = "";
	private String                ob_fax_no             = "";
	private String                ib_fax_no             = "";
	private String                xch_rt_div_cd         = "";
	private String                cng_indiv_cd          = "";
	private String                dy_xch_aply_st_dt     = "";
	private String                iss_div_cd            = "";
	private String                bank_acct_no          = "";
	private String                cntc_pson_nm          = "";
	private String                cust_cr_due_dt_div_cd = "";
	private String                ownr_nm               = "";
	private String                bzct_nm               = "";
	private String                bztp_nm               = "";
	private String                pay_dt_dy1            = "";
	private String                pay_dt_dy2            = "";
	private String                pay_dt_dy3            = "";
	private String                pay_dt_dy4            = "";
	private String                locl_nm               = "";
	private String                locl_addr1            = "";
	private String                locl_addr2            = "";
	private String                locl_addr3            = "";
	private String                locl_addr4            = "";
	private String                locl_zip_cd           = "";
	private String                bfr_cr_clt_ofc_cd     = "";
	private String                bfr_ofc_cng_dt        = "";
	private String                bfr_kr_ib_ofc_cd      = "";
	private String                inv_due_dt_dp_flg     = "";
	private String                cre_usr_id            = "";
	private String                cre_dt                = "";
	private String                upd_usr_id            = "";
	private String                upd_dt                = "";
	private String                delt_flg              = "";
	private String                eai_evnt_dt           = "";

	public MdmCrCust(){}

	public MdmCrCust(
			String                ibflag               ,
			String                page_rows            ,
			String                cust_cnt_cd          ,
			String                cust_seq             ,
			String                act_cust_cnt_cd      ,
			String                act_cust_seq         ,
			String                cust_rlse_ctrl_flg   ,
			String                cr_flg               ,
			String                cr_curr_cd           ,
			String                cr_amt               ,
			String                cr_clt_ofc_cd        ,
			String                cr_cust_rmk          ,
			String                ib_cr_term_dys       ,
			String                ob_cr_term_dys       ,
			String                pay_div_cd           ,
			String                cr_st_dt             ,
			String                cr_end_dt            ,
			String                cr_cust_tp_cd        ,
			String                kr_ib_ofc_cd         ,
			String                ob_eml               ,
			String                ib_eml               ,
			String                ob_phn_no            ,
			String                ib_phn_no            ,
			String                ob_fax_no            ,
			String                ib_fax_no            ,
			String                xch_rt_div_cd        ,
			String                cng_indiv_cd         ,
			String                dy_xch_aply_st_dt    ,
			String                iss_div_cd           ,
			String                bank_acct_no         ,
			String                cntc_pson_nm         ,
			String                cust_cr_due_dt_div_cd,
			String                ownr_nm              ,
			String                bzct_nm              ,
			String                bztp_nm              ,
			String                pay_dt_dy1           ,
			String                pay_dt_dy2           ,
			String                pay_dt_dy3           ,
			String                pay_dt_dy4           ,
			String                locl_nm              ,
			String                locl_addr1           ,
			String                locl_addr2           ,
			String                locl_addr3           ,
			String                locl_addr4           ,
			String                locl_zip_cd          ,
			String                bfr_cr_clt_ofc_cd    ,
			String                bfr_ofc_cng_dt       ,
			String                bfr_kr_ib_ofc_cd     ,
			String                inv_due_dt_dp_flg    ,
			String                cre_usr_id           ,
			String                cre_dt               ,
			String                upd_usr_id           ,
			String                upd_dt               ,
			String                delt_flg             ,
			String                eai_evnt_dt          ){
		this.ibflag                = ibflag               ;
		this.page_rows             = page_rows            ;
		this.cust_cnt_cd           = cust_cnt_cd          ;
		this.cust_seq              = cust_seq             ;
		this.act_cust_cnt_cd       = act_cust_cnt_cd      ;
		this.act_cust_seq          = act_cust_seq         ;
		this.cust_rlse_ctrl_flg    = cust_rlse_ctrl_flg   ;
		this.cr_flg                = cr_flg               ;
		this.cr_curr_cd            = cr_curr_cd           ;
		this.cr_amt                = cr_amt               ;
		this.cr_clt_ofc_cd         = cr_clt_ofc_cd        ;
		this.cr_cust_rmk           = cr_cust_rmk          ;
		this.ib_cr_term_dys        = ib_cr_term_dys       ;
		this.ob_cr_term_dys        = ob_cr_term_dys       ;
		this.pay_div_cd            = pay_div_cd           ;
		this.cr_st_dt              = cr_st_dt             ;
		this.cr_end_dt             = cr_end_dt            ;
		this.cr_cust_tp_cd         = cr_cust_tp_cd        ;
		this.kr_ib_ofc_cd          = kr_ib_ofc_cd         ;
		this.ob_eml                = ob_eml               ;
		this.ib_eml                = ib_eml               ;
		this.ob_phn_no             = ob_phn_no            ;
		this.ib_phn_no             = ib_phn_no            ;
		this.ob_fax_no             = ob_fax_no            ;
		this.ib_fax_no             = ib_fax_no            ;
		this.xch_rt_div_cd         = xch_rt_div_cd        ;
		this.cng_indiv_cd          = cng_indiv_cd         ;
		this.dy_xch_aply_st_dt     = dy_xch_aply_st_dt    ;
		this.iss_div_cd            = iss_div_cd           ;
		this.bank_acct_no          = bank_acct_no         ;
		this.cntc_pson_nm          = cntc_pson_nm         ;
		this.cust_cr_due_dt_div_cd = cust_cr_due_dt_div_cd;
		this.ownr_nm               = ownr_nm              ;
		this.bzct_nm               = bzct_nm              ;
		this.bztp_nm               = bztp_nm              ;
		this.pay_dt_dy1            = pay_dt_dy1           ;
		this.pay_dt_dy2            = pay_dt_dy2           ;
		this.pay_dt_dy3            = pay_dt_dy3           ;
		this.pay_dt_dy4            = pay_dt_dy4           ;
		this.locl_nm               = locl_nm              ;
		this.locl_addr1            = locl_addr1           ;
		this.locl_addr2            = locl_addr2           ;
		this.locl_addr3            = locl_addr3           ;
		this.locl_addr4            = locl_addr4           ;
		this.locl_zip_cd           = locl_zip_cd          ;
		this.bfr_cr_clt_ofc_cd     = bfr_cr_clt_ofc_cd    ;
		this.bfr_ofc_cng_dt        = bfr_ofc_cng_dt       ;
		this.bfr_kr_ib_ofc_cd      = bfr_kr_ib_ofc_cd     ;
		this.inv_due_dt_dp_flg     = inv_due_dt_dp_flg    ;
		this.cre_usr_id            = cre_usr_id           ;
		this.cre_dt                = cre_dt               ;
		this.upd_usr_id            = upd_usr_id           ;
		this.upd_dt                = upd_dt               ;
		this.delt_flg              = delt_flg             ;
		this.eai_evnt_dt           = eai_evnt_dt          ;
	}

	// getter method is proceeding ..
	public String                getIbflag               (){	return ibflag               	;	}
	public String                getPage_rows            (){	return page_rows            	;	}
	public String                getCust_cnt_cd          (){	return cust_cnt_cd          	;	}
	public String                getCust_seq             (){	return cust_seq             	;	}
	public String                getAct_cust_cnt_cd      (){	return act_cust_cnt_cd      	;	}
	public String                getAct_cust_seq         (){	return act_cust_seq         	;	}
	public String                getCust_rlse_ctrl_flg   (){	return cust_rlse_ctrl_flg   	;	}
	public String                getCr_flg               (){	return cr_flg               	;	}
	public String                getCr_curr_cd           (){	return cr_curr_cd           	;	}
	public String                getCr_amt               (){	return cr_amt               	;	}
	public String                getCr_clt_ofc_cd        (){	return cr_clt_ofc_cd        	;	}
	public String                getCr_cust_rmk          (){	return cr_cust_rmk          	;	}
	public String                getIb_cr_term_dys       (){	return ib_cr_term_dys       	;	}
	public String                getOb_cr_term_dys       (){	return ob_cr_term_dys       	;	}
	public String                getPay_div_cd           (){	return pay_div_cd           	;	}
	public String                getCr_st_dt             (){	return cr_st_dt             	;	}
	public String                getCr_end_dt            (){	return cr_end_dt            	;	}
	public String                getCr_cust_tp_cd        (){	return cr_cust_tp_cd        	;	}
	public String                getKr_ib_ofc_cd         (){	return kr_ib_ofc_cd         	;	}
	public String                getOb_eml               (){	return ob_eml               	;	}
	public String                getIb_eml               (){	return ib_eml               	;	}
	public String                getOb_phn_no            (){	return ob_phn_no            	;	}
	public String                getIb_phn_no            (){	return ib_phn_no            	;	}
	public String                getOb_fax_no            (){	return ob_fax_no            	;	}
	public String                getIb_fax_no            (){	return ib_fax_no            	;	}
	public String                getXch_rt_div_cd        (){	return xch_rt_div_cd        	;	}
	public String                getCng_indiv_cd         (){	return cng_indiv_cd         	;	}
	public String                getDy_xch_aply_st_dt    (){	return dy_xch_aply_st_dt    	;	}
	public String                getIss_div_cd           (){	return iss_div_cd           	;	}
	public String                getBank_acct_no         (){	return bank_acct_no         	;	}
	public String                getCntc_pson_nm         (){	return cntc_pson_nm         	;	}
	public String                getCust_cr_due_dt_div_cd(){	return cust_cr_due_dt_div_cd	;	}
	public String                getOwnr_nm              (){	return ownr_nm              	;	}
	public String                getBzct_nm              (){	return bzct_nm              	;	}
	public String                getBztp_nm              (){	return bztp_nm              	;	}
	public String                getPay_dt_dy1           (){	return pay_dt_dy1           	;	}
	public String                getPay_dt_dy2           (){	return pay_dt_dy2           	;	}
	public String                getPay_dt_dy3           (){	return pay_dt_dy3           	;	}
	public String                getPay_dt_dy4           (){	return pay_dt_dy4           	;	}
	public String                getLocl_nm              (){	return locl_nm              	;	}
	public String                getLocl_addr1           (){	return locl_addr1           	;	}
	public String                getLocl_addr2           (){	return locl_addr2           	;	}
	public String                getLocl_addr3           (){	return locl_addr3           	;	}
	public String                getLocl_addr4           (){	return locl_addr4           	;	}
	public String                getLocl_zip_cd          (){	return locl_zip_cd          	;	}
	public String                getBfr_cr_clt_ofc_cd    (){	return bfr_cr_clt_ofc_cd    	;	}
	public String                getBfr_ofc_cng_dt       (){	return bfr_ofc_cng_dt       	;	}
	public String                getBfr_kr_ib_ofc_cd     (){	return bfr_kr_ib_ofc_cd     	;	}
	public String                getInv_due_dt_dp_flg    (){	return inv_due_dt_dp_flg    	;	}
	public String                getCre_usr_id           (){	return cre_usr_id           	;	}
	public String                getCre_dt               (){	return cre_dt               	;	}
	public String                getUpd_usr_id           (){	return upd_usr_id           	;	}
	public String                getUpd_dt               (){	return upd_dt               	;	}
	public String                getDelt_flg             (){	return delt_flg             	;	}
	public String                getEai_evnt_dt          (){	return eai_evnt_dt          	;	}

	// setter method is proceeding ..
	public void setIbflag               ( String                ibflag                ){	this.ibflag                = ibflag               	;	}
	public void setPage_rows            ( String                page_rows             ){	this.page_rows             = page_rows            	;	}
	public void setCust_cnt_cd          ( String                cust_cnt_cd           ){	this.cust_cnt_cd           = cust_cnt_cd          	;	}
	public void setCust_seq             ( String                cust_seq              ){	this.cust_seq              = cust_seq             	;	}
	public void setAct_cust_cnt_cd      ( String                act_cust_cnt_cd       ){	this.act_cust_cnt_cd       = act_cust_cnt_cd      	;	}
	public void setAct_cust_seq         ( String                act_cust_seq          ){	this.act_cust_seq          = act_cust_seq         	;	}
	public void setCust_rlse_ctrl_flg   ( String                cust_rlse_ctrl_flg    ){	this.cust_rlse_ctrl_flg    = cust_rlse_ctrl_flg   	;	}
	public void setCr_flg               ( String                cr_flg                ){	this.cr_flg                = cr_flg               	;	}
	public void setCr_curr_cd           ( String                cr_curr_cd            ){	this.cr_curr_cd            = cr_curr_cd           	;	}
	public void setCr_amt               ( String                cr_amt                ){	this.cr_amt                = cr_amt               	;	}
	public void setCr_clt_ofc_cd        ( String                cr_clt_ofc_cd         ){	this.cr_clt_ofc_cd         = cr_clt_ofc_cd        	;	}
	public void setCr_cust_rmk          ( String                cr_cust_rmk           ){	this.cr_cust_rmk           = cr_cust_rmk          	;	}
	public void setIb_cr_term_dys       ( String                ib_cr_term_dys        ){	this.ib_cr_term_dys        = ib_cr_term_dys       	;	}
	public void setOb_cr_term_dys       ( String                ob_cr_term_dys        ){	this.ob_cr_term_dys        = ob_cr_term_dys       	;	}
	public void setPay_div_cd           ( String                pay_div_cd            ){	this.pay_div_cd            = pay_div_cd           	;	}
	public void setCr_st_dt             ( String                cr_st_dt              ){	this.cr_st_dt              = cr_st_dt             	;	}
	public void setCr_end_dt            ( String                cr_end_dt             ){	this.cr_end_dt             = cr_end_dt            	;	}
	public void setCr_cust_tp_cd        ( String                cr_cust_tp_cd         ){	this.cr_cust_tp_cd         = cr_cust_tp_cd        	;	}
	public void setKr_ib_ofc_cd         ( String                kr_ib_ofc_cd          ){	this.kr_ib_ofc_cd          = kr_ib_ofc_cd         	;	}
	public void setOb_eml               ( String                ob_eml                ){	this.ob_eml                = ob_eml               	;	}
	public void setIb_eml               ( String                ib_eml                ){	this.ib_eml                = ib_eml               	;	}
	public void setOb_phn_no            ( String                ob_phn_no             ){	this.ob_phn_no             = ob_phn_no            	;	}
	public void setIb_phn_no            ( String                ib_phn_no             ){	this.ib_phn_no             = ib_phn_no            	;	}
	public void setOb_fax_no            ( String                ob_fax_no             ){	this.ob_fax_no             = ob_fax_no            	;	}
	public void setIb_fax_no            ( String                ib_fax_no             ){	this.ib_fax_no             = ib_fax_no            	;	}
	public void setXch_rt_div_cd        ( String                xch_rt_div_cd         ){	this.xch_rt_div_cd         = xch_rt_div_cd        	;	}
	public void setCng_indiv_cd         ( String                cng_indiv_cd          ){	this.cng_indiv_cd          = cng_indiv_cd         	;	}
	public void setDy_xch_aply_st_dt    ( String                dy_xch_aply_st_dt     ){	this.dy_xch_aply_st_dt     = dy_xch_aply_st_dt    	;	}
	public void setIss_div_cd           ( String                iss_div_cd            ){	this.iss_div_cd            = iss_div_cd           	;	}
	public void setBank_acct_no         ( String                bank_acct_no          ){	this.bank_acct_no          = bank_acct_no         	;	}
	public void setCntc_pson_nm         ( String                cntc_pson_nm          ){	this.cntc_pson_nm          = cntc_pson_nm         	;	}
	public void setCust_cr_due_dt_div_cd( String                cust_cr_due_dt_div_cd ){	this.cust_cr_due_dt_div_cd = cust_cr_due_dt_div_cd	;	}
	public void setOwnr_nm              ( String                ownr_nm               ){	this.ownr_nm               = ownr_nm              	;	}
	public void setBzct_nm              ( String                bzct_nm               ){	this.bzct_nm               = bzct_nm              	;	}
	public void setBztp_nm              ( String                bztp_nm               ){	this.bztp_nm               = bztp_nm              	;	}
	public void setPay_dt_dy1           ( String                pay_dt_dy1            ){	this.pay_dt_dy1            = pay_dt_dy1           	;	}
	public void setPay_dt_dy2           ( String                pay_dt_dy2            ){	this.pay_dt_dy2            = pay_dt_dy2           	;	}
	public void setPay_dt_dy3           ( String                pay_dt_dy3            ){	this.pay_dt_dy3            = pay_dt_dy3           	;	}
	public void setPay_dt_dy4           ( String                pay_dt_dy4            ){	this.pay_dt_dy4            = pay_dt_dy4           	;	}
	public void setLocl_nm              ( String                locl_nm               ){	this.locl_nm               = locl_nm              	;	}
	public void setLocl_addr1           ( String                locl_addr1            ){	this.locl_addr1            = locl_addr1           	;	}
	public void setLocl_addr2           ( String                locl_addr2            ){	this.locl_addr2            = locl_addr2           	;	}
	public void setLocl_addr3           ( String                locl_addr3            ){	this.locl_addr3            = locl_addr3           	;	}
	public void setLocl_addr4           ( String                locl_addr4            ){	this.locl_addr4            = locl_addr4           	;	}
	public void setLocl_zip_cd          ( String                locl_zip_cd           ){	this.locl_zip_cd           = locl_zip_cd          	;	}
	public void setBfr_cr_clt_ofc_cd    ( String                bfr_cr_clt_ofc_cd     ){	this.bfr_cr_clt_ofc_cd     = bfr_cr_clt_ofc_cd    	;	}
	public void setBfr_ofc_cng_dt       ( String                bfr_ofc_cng_dt        ){	this.bfr_ofc_cng_dt        = bfr_ofc_cng_dt       	;	}
	public void setBfr_kr_ib_ofc_cd     ( String                bfr_kr_ib_ofc_cd      ){	this.bfr_kr_ib_ofc_cd      = bfr_kr_ib_ofc_cd     	;	}
	public void setInv_due_dt_dp_flg    ( String                inv_due_dt_dp_flg     ){	this.inv_due_dt_dp_flg     = inv_due_dt_dp_flg    	;	}
	public void setCre_usr_id           ( String                cre_usr_id            ){	this.cre_usr_id            = cre_usr_id           	;	}
	public void setCre_dt               ( String                cre_dt                ){	this.cre_dt                = cre_dt               	;	}
	public void setUpd_usr_id           ( String                upd_usr_id            ){	this.upd_usr_id            = upd_usr_id           	;	}
	public void setUpd_dt               ( String                upd_dt                ){	this.upd_dt                = upd_dt               	;	}
	public void setDelt_flg             ( String                delt_flg              ){	this.delt_flg              = delt_flg             	;	}
	public void setEai_evnt_dt          ( String                eai_evnt_dt           ){	this.eai_evnt_dt           = eai_evnt_dt          	;	}

	public static MdmCrCust fromRequest(HttpServletRequest request) {
		MdmCrCust model = new MdmCrCust();
		try {
			model.setIbflag               	(JSPUtil.getParameter(request, "ibflag               		".trim(), ""));
			model.setPage_rows            	(JSPUtil.getParameter(request, "page_rows            		".trim(), ""));
			model.setCust_cnt_cd          	(JSPUtil.getParameter(request, "cust_cnt_cd          		".trim(), ""));
			model.setCust_seq             	(JSPUtil.getParameter(request, "cust_seq             		".trim(), ""));
			model.setAct_cust_cnt_cd      	(JSPUtil.getParameter(request, "act_cust_cnt_cd      		".trim(), ""));
			model.setAct_cust_seq         	(JSPUtil.getParameter(request, "act_cust_seq         		".trim(), ""));
			model.setCust_rlse_ctrl_flg   	(JSPUtil.getParameter(request, "cust_rlse_ctrl_flg   		".trim(), ""));
			model.setCr_flg               	(JSPUtil.getParameter(request, "cr_flg               		".trim(), ""));
			model.setCr_curr_cd           	(JSPUtil.getParameter(request, "cr_curr_cd           		".trim(), ""));
			model.setCr_amt               	(JSPUtil.getParameter(request, "cr_amt               		".trim(), ""));
			model.setCr_clt_ofc_cd        	(JSPUtil.getParameter(request, "cr_clt_ofc_cd        		".trim(), ""));
			model.setCr_cust_rmk          	(JSPUtil.getParameter(request, "cr_cust_rmk          		".trim(), ""));
			model.setIb_cr_term_dys       	(JSPUtil.getParameter(request, "ib_cr_term_dys       		".trim(), ""));
			model.setOb_cr_term_dys       	(JSPUtil.getParameter(request, "ob_cr_term_dys       		".trim(), ""));
			model.setPay_div_cd           	(JSPUtil.getParameter(request, "pay_div_cd           		".trim(), ""));
			model.setCr_st_dt             	(JSPUtil.getParameter(request, "cr_st_dt             		".trim(), ""));
			model.setCr_end_dt            	(JSPUtil.getParameter(request, "cr_end_dt            		".trim(), ""));
			model.setCr_cust_tp_cd        	(JSPUtil.getParameter(request, "cr_cust_tp_cd        		".trim(), ""));
			model.setKr_ib_ofc_cd         	(JSPUtil.getParameter(request, "kr_ib_ofc_cd         		".trim(), ""));
			model.setOb_eml               	(JSPUtil.getParameter(request, "ob_eml               		".trim(), ""));
			model.setIb_eml               	(JSPUtil.getParameter(request, "ib_eml               		".trim(), ""));
			model.setOb_phn_no            	(JSPUtil.getParameter(request, "ob_phn_no            		".trim(), ""));
			model.setIb_phn_no            	(JSPUtil.getParameter(request, "ib_phn_no            		".trim(), ""));
			model.setOb_fax_no            	(JSPUtil.getParameter(request, "ob_fax_no            		".trim(), ""));
			model.setIb_fax_no            	(JSPUtil.getParameter(request, "ib_fax_no            		".trim(), ""));
			model.setXch_rt_div_cd        	(JSPUtil.getParameter(request, "xch_rt_div_cd        		".trim(), ""));
			model.setCng_indiv_cd         	(JSPUtil.getParameter(request, "cng_indiv_cd         		".trim(), ""));
			model.setDy_xch_aply_st_dt    	(JSPUtil.getParameter(request, "dy_xch_aply_st_dt    		".trim(), ""));
			model.setIss_div_cd           	(JSPUtil.getParameter(request, "iss_div_cd           		".trim(), ""));
			model.setBank_acct_no         	(JSPUtil.getParameter(request, "bank_acct_no         		".trim(), ""));
			model.setCntc_pson_nm         	(JSPUtil.getParameter(request, "cntc_pson_nm         		".trim(), ""));
			model.setCust_cr_due_dt_div_cd	(JSPUtil.getParameter(request, "cust_cr_due_dt_div_cd		".trim(), ""));
			model.setOwnr_nm              	(JSPUtil.getParameter(request, "ownr_nm              		".trim(), ""));
			model.setBzct_nm              	(JSPUtil.getParameter(request, "bzct_nm              		".trim(), ""));
			model.setBztp_nm              	(JSPUtil.getParameter(request, "bztp_nm              		".trim(), ""));
			model.setPay_dt_dy1           	(JSPUtil.getParameter(request, "pay_dt_dy1           		".trim(), ""));
			model.setPay_dt_dy2           	(JSPUtil.getParameter(request, "pay_dt_dy2           		".trim(), ""));
			model.setPay_dt_dy3           	(JSPUtil.getParameter(request, "pay_dt_dy3           		".trim(), ""));
			model.setPay_dt_dy4           	(JSPUtil.getParameter(request, "pay_dt_dy4           		".trim(), ""));
			model.setLocl_nm              	(JSPUtil.getParameter(request, "locl_nm              		".trim(), ""));
			model.setLocl_addr1           	(JSPUtil.getParameter(request, "locl_addr1           		".trim(), ""));
			model.setLocl_addr2           	(JSPUtil.getParameter(request, "locl_addr2           		".trim(), ""));
			model.setLocl_addr3           	(JSPUtil.getParameter(request, "locl_addr3           		".trim(), ""));
			model.setLocl_addr4           	(JSPUtil.getParameter(request, "locl_addr4           		".trim(), ""));
			model.setLocl_zip_cd          	(JSPUtil.getParameter(request, "locl_zip_cd          		".trim(), ""));
			model.setBfr_cr_clt_ofc_cd    	(JSPUtil.getParameter(request, "bfr_cr_clt_ofc_cd    		".trim(), ""));
			model.setBfr_ofc_cng_dt       	(JSPUtil.getParameter(request, "bfr_ofc_cng_dt       		".trim(), ""));
			model.setBfr_kr_ib_ofc_cd     	(JSPUtil.getParameter(request, "bfr_kr_ib_ofc_cd     		".trim(), ""));
			model.setInv_due_dt_dp_flg    	(JSPUtil.getParameter(request, "inv_due_dt_dp_flg    		".trim(), ""));
			model.setCre_usr_id           	(JSPUtil.getParameter(request, "cre_usr_id           		".trim(), ""));
			model.setCre_dt               	(JSPUtil.getParameter(request, "cre_dt               		".trim(), ""));
			model.setUpd_usr_id           	(JSPUtil.getParameter(request, "upd_usr_id           		".trim(), ""));
			model.setUpd_dt               	(JSPUtil.getParameter(request, "upd_dt               		".trim(), ""));
			model.setDelt_flg             	(JSPUtil.getParameter(request, "delt_flg             		".trim(), ""));
			model.setEai_evnt_dt          	(JSPUtil.getParameter(request, "eai_evnt_dt          		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		MdmCrCust model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag                =  (JSPUtil.getParameter(request, "ibflag               		".trim(), length));
			String[] page_rows             =  (JSPUtil.getParameter(request, "page_rows            		".trim(), length));
			String[] cust_cnt_cd           =  (JSPUtil.getParameter(request, "cust_cnt_cd          		".trim(), length));
			String[] cust_seq              =  (JSPUtil.getParameter(request, "cust_seq             		".trim(), length));
			String[] act_cust_cnt_cd       =  (JSPUtil.getParameter(request, "act_cust_cnt_cd      		".trim(), length));
			String[] act_cust_seq          =  (JSPUtil.getParameter(request, "act_cust_seq         		".trim(), length));
			String[] cust_rlse_ctrl_flg    =  (JSPUtil.getParameter(request, "cust_rlse_ctrl_flg   		".trim(), length));
			String[] cr_flg                =  (JSPUtil.getParameter(request, "cr_flg               		".trim(), length));
			String[] cr_curr_cd            =  (JSPUtil.getParameter(request, "cr_curr_cd           		".trim(), length));
			String[] cr_amt                =  (JSPUtil.getParameter(request, "cr_amt               		".trim(), length));
			String[] cr_clt_ofc_cd         =  (JSPUtil.getParameter(request, "cr_clt_ofc_cd        		".trim(), length));
			String[] cr_cust_rmk           =  (JSPUtil.getParameter(request, "cr_cust_rmk          		".trim(), length));
			String[] ib_cr_term_dys        =  (JSPUtil.getParameter(request, "ib_cr_term_dys       		".trim(), length));
			String[] ob_cr_term_dys        =  (JSPUtil.getParameter(request, "ob_cr_term_dys       		".trim(), length));
			String[] pay_div_cd            =  (JSPUtil.getParameter(request, "pay_div_cd           		".trim(), length));
			String[] cr_st_dt              =  (JSPUtil.getParameter(request, "cr_st_dt             		".trim(), length));
			String[] cr_end_dt             =  (JSPUtil.getParameter(request, "cr_end_dt            		".trim(), length));
			String[] cr_cust_tp_cd         =  (JSPUtil.getParameter(request, "cr_cust_tp_cd        		".trim(), length));
			String[] kr_ib_ofc_cd          =  (JSPUtil.getParameter(request, "kr_ib_ofc_cd         		".trim(), length));
			String[] ob_eml                =  (JSPUtil.getParameter(request, "ob_eml               		".trim(), length));
			String[] ib_eml                =  (JSPUtil.getParameter(request, "ib_eml               		".trim(), length));
			String[] ob_phn_no             =  (JSPUtil.getParameter(request, "ob_phn_no            		".trim(), length));
			String[] ib_phn_no             =  (JSPUtil.getParameter(request, "ib_phn_no            		".trim(), length));
			String[] ob_fax_no             =  (JSPUtil.getParameter(request, "ob_fax_no            		".trim(), length));
			String[] ib_fax_no             =  (JSPUtil.getParameter(request, "ib_fax_no            		".trim(), length));
			String[] xch_rt_div_cd         =  (JSPUtil.getParameter(request, "xch_rt_div_cd        		".trim(), length));
			String[] cng_indiv_cd          =  (JSPUtil.getParameter(request, "cng_indiv_cd         		".trim(), length));
			String[] dy_xch_aply_st_dt     =  (JSPUtil.getParameter(request, "dy_xch_aply_st_dt    		".trim(), length));
			String[] iss_div_cd            =  (JSPUtil.getParameter(request, "iss_div_cd           		".trim(), length));
			String[] bank_acct_no          =  (JSPUtil.getParameter(request, "bank_acct_no         		".trim(), length));
			String[] cntc_pson_nm          =  (JSPUtil.getParameter(request, "cntc_pson_nm         		".trim(), length));
			String[] cust_cr_due_dt_div_cd =  (JSPUtil.getParameter(request, "cust_cr_due_dt_div_cd		".trim(), length));
			String[] ownr_nm               =  (JSPUtil.getParameter(request, "ownr_nm              		".trim(), length));
			String[] bzct_nm               =  (JSPUtil.getParameter(request, "bzct_nm              		".trim(), length));
			String[] bztp_nm               =  (JSPUtil.getParameter(request, "bztp_nm              		".trim(), length));
			String[] pay_dt_dy1            =  (JSPUtil.getParameter(request, "pay_dt_dy1           		".trim(), length));
			String[] pay_dt_dy2            =  (JSPUtil.getParameter(request, "pay_dt_dy2           		".trim(), length));
			String[] pay_dt_dy3            =  (JSPUtil.getParameter(request, "pay_dt_dy3           		".trim(), length));
			String[] pay_dt_dy4            =  (JSPUtil.getParameter(request, "pay_dt_dy4           		".trim(), length));
			String[] locl_nm               =  (JSPUtil.getParameter(request, "locl_nm              		".trim(), length));
			String[] locl_addr1            =  (JSPUtil.getParameter(request, "locl_addr1           		".trim(), length));
			String[] locl_addr2            =  (JSPUtil.getParameter(request, "locl_addr2           		".trim(), length));
			String[] locl_addr3            =  (JSPUtil.getParameter(request, "locl_addr3           		".trim(), length));
			String[] locl_addr4            =  (JSPUtil.getParameter(request, "locl_addr4           		".trim(), length));
			String[] locl_zip_cd           =  (JSPUtil.getParameter(request, "locl_zip_cd          		".trim(), length));
			String[] bfr_cr_clt_ofc_cd     =  (JSPUtil.getParameter(request, "bfr_cr_clt_ofc_cd    		".trim(), length));
			String[] bfr_ofc_cng_dt        =  (JSPUtil.getParameter(request, "bfr_ofc_cng_dt       		".trim(), length));
			String[] bfr_kr_ib_ofc_cd      =  (JSPUtil.getParameter(request, "bfr_kr_ib_ofc_cd     		".trim(), length));
			String[] inv_due_dt_dp_flg     =  (JSPUtil.getParameter(request, "inv_due_dt_dp_flg    		".trim(), length));
			String[] cre_usr_id            =  (JSPUtil.getParameter(request, "cre_usr_id           		".trim(), length));
			String[] cre_dt                =  (JSPUtil.getParameter(request, "cre_dt               		".trim(), length));
			String[] upd_usr_id            =  (JSPUtil.getParameter(request, "upd_usr_id           		".trim(), length));
			String[] upd_dt                =  (JSPUtil.getParameter(request, "upd_dt               		".trim(), length));
			String[] delt_flg              =  (JSPUtil.getParameter(request, "delt_flg             		".trim(), length));
			String[] eai_evnt_dt           =  (JSPUtil.getParameter(request, "eai_evnt_dt          		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new MdmCrCust();
				model.setIbflag               		  (ibflag               	[i]);
				model.setPage_rows            		  (page_rows            	[i]);
				model.setCust_cnt_cd          		  (cust_cnt_cd          	[i]);
				model.setCust_seq             		  (cust_seq             	[i]);
				model.setAct_cust_cnt_cd      		  (act_cust_cnt_cd      	[i]);
				model.setAct_cust_seq         		  (act_cust_seq         	[i]);
				model.setCust_rlse_ctrl_flg   		  (cust_rlse_ctrl_flg   	[i]);
				model.setCr_flg               		  (cr_flg               	[i]);
				model.setCr_curr_cd           		  (cr_curr_cd           	[i]);
				model.setCr_amt               		  (cr_amt               	[i]);
				model.setCr_clt_ofc_cd        		  (cr_clt_ofc_cd        	[i]);
				model.setCr_cust_rmk          		  (cr_cust_rmk          	[i]);
				model.setIb_cr_term_dys       		  (ib_cr_term_dys       	[i]);
				model.setOb_cr_term_dys       		  (ob_cr_term_dys       	[i]);
				model.setPay_div_cd           		  (pay_div_cd           	[i]);
				model.setCr_st_dt             		  (cr_st_dt             	[i]);
				model.setCr_end_dt            		  (cr_end_dt            	[i]);
				model.setCr_cust_tp_cd        		  (cr_cust_tp_cd        	[i]);
				model.setKr_ib_ofc_cd         		  (kr_ib_ofc_cd         	[i]);
				model.setOb_eml               		  (ob_eml               	[i]);
				model.setIb_eml               		  (ib_eml               	[i]);
				model.setOb_phn_no            		  (ob_phn_no            	[i]);
				model.setIb_phn_no            		  (ib_phn_no            	[i]);
				model.setOb_fax_no            		  (ob_fax_no            	[i]);
				model.setIb_fax_no            		  (ib_fax_no            	[i]);
				model.setXch_rt_div_cd        		  (xch_rt_div_cd        	[i]);
				model.setCng_indiv_cd         		  (cng_indiv_cd         	[i]);
				model.setDy_xch_aply_st_dt    		  (dy_xch_aply_st_dt    	[i]);
				model.setIss_div_cd           		  (iss_div_cd           	[i]);
				model.setBank_acct_no         		  (bank_acct_no         	[i]);
				model.setCntc_pson_nm         		  (cntc_pson_nm         	[i]);
				model.setCust_cr_due_dt_div_cd		  (cust_cr_due_dt_div_cd	[i]);
				model.setOwnr_nm              		  (ownr_nm              	[i]);
				model.setBzct_nm              		  (bzct_nm              	[i]);
				model.setBztp_nm              		  (bztp_nm              	[i]);
				model.setPay_dt_dy1           		  (pay_dt_dy1           	[i]);
				model.setPay_dt_dy2           		  (pay_dt_dy2           	[i]);
				model.setPay_dt_dy3           		  (pay_dt_dy3           	[i]);
				model.setPay_dt_dy4           		  (pay_dt_dy4           	[i]);
				model.setLocl_nm              		  (locl_nm              	[i]);
				model.setLocl_addr1           		  (locl_addr1           	[i]);
				model.setLocl_addr2           		  (locl_addr2           	[i]);
				model.setLocl_addr3           		  (locl_addr3           	[i]);
				model.setLocl_addr4           		  (locl_addr4           	[i]);
				model.setLocl_zip_cd          		  (locl_zip_cd          	[i]);
				model.setBfr_cr_clt_ofc_cd    		  (bfr_cr_clt_ofc_cd    	[i]);
				model.setBfr_ofc_cng_dt       		  (bfr_ofc_cng_dt       	[i]);
				model.setBfr_kr_ib_ofc_cd     		  (bfr_kr_ib_ofc_cd     	[i]);
				model.setInv_due_dt_dp_flg    		  (inv_due_dt_dp_flg    	[i]);
				model.setCre_usr_id           		  (cre_usr_id           	[i]);
				model.setCre_dt               		  (cre_dt               	[i]);
				model.setUpd_usr_id           		  (upd_usr_id           	[i]);
				model.setUpd_dt               		  (upd_dt               	[i]);
				model.setDelt_flg             		  (delt_flg             	[i]);
				model.setEai_evnt_dt          		  (eai_evnt_dt          	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		MdmCrCust model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag                =  (JSPUtil.getParameter(request, prefix + "ibflag               		".trim(), length));
			String[] page_rows             =  (JSPUtil.getParameter(request, prefix + "page_rows            		".trim(), length));
			String[] cust_cnt_cd           =  (JSPUtil.getParameter(request, prefix + "cust_cnt_cd          		".trim(), length));
			String[] cust_seq              =  (JSPUtil.getParameter(request, prefix + "cust_seq             		".trim(), length));
			String[] act_cust_cnt_cd       =  (JSPUtil.getParameter(request, prefix + "act_cust_cnt_cd      		".trim(), length));
			String[] act_cust_seq          =  (JSPUtil.getParameter(request, prefix + "act_cust_seq         		".trim(), length));
			String[] cust_rlse_ctrl_flg    =  (JSPUtil.getParameter(request, prefix + "cust_rlse_ctrl_flg   		".trim(), length));
			String[] cr_flg                =  (JSPUtil.getParameter(request, prefix + "cr_flg               		".trim(), length));
			String[] cr_curr_cd            =  (JSPUtil.getParameter(request, prefix + "cr_curr_cd           		".trim(), length));
			String[] cr_amt                =  (JSPUtil.getParameter(request, prefix + "cr_amt               		".trim(), length));
			String[] cr_clt_ofc_cd         =  (JSPUtil.getParameter(request, prefix + "cr_clt_ofc_cd        		".trim(), length));
			String[] cr_cust_rmk           =  (JSPUtil.getParameter(request, prefix + "cr_cust_rmk          		".trim(), length));
			String[] ib_cr_term_dys        =  (JSPUtil.getParameter(request, prefix + "ib_cr_term_dys       		".trim(), length));
			String[] ob_cr_term_dys        =  (JSPUtil.getParameter(request, prefix + "ob_cr_term_dys       		".trim(), length));
			String[] pay_div_cd            =  (JSPUtil.getParameter(request, prefix + "pay_div_cd           		".trim(), length));
			String[] cr_st_dt              =  (JSPUtil.getParameter(request, prefix + "cr_st_dt             		".trim(), length));
			String[] cr_end_dt             =  (JSPUtil.getParameter(request, prefix + "cr_end_dt            		".trim(), length));
			String[] cr_cust_tp_cd         =  (JSPUtil.getParameter(request, prefix + "cr_cust_tp_cd        		".trim(), length));
			String[] kr_ib_ofc_cd          =  (JSPUtil.getParameter(request, prefix + "kr_ib_ofc_cd         		".trim(), length));
			String[] ob_eml                =  (JSPUtil.getParameter(request, prefix + "ob_eml               		".trim(), length));
			String[] ib_eml                =  (JSPUtil.getParameter(request, prefix + "ib_eml               		".trim(), length));
			String[] ob_phn_no             =  (JSPUtil.getParameter(request, prefix + "ob_phn_no            		".trim(), length));
			String[] ib_phn_no             =  (JSPUtil.getParameter(request, prefix + "ib_phn_no            		".trim(), length));
			String[] ob_fax_no             =  (JSPUtil.getParameter(request, prefix + "ob_fax_no            		".trim(), length));
			String[] ib_fax_no             =  (JSPUtil.getParameter(request, prefix + "ib_fax_no            		".trim(), length));
			String[] xch_rt_div_cd         =  (JSPUtil.getParameter(request, prefix + "xch_rt_div_cd        		".trim(), length));
			String[] cng_indiv_cd          =  (JSPUtil.getParameter(request, prefix + "cng_indiv_cd         		".trim(), length));
			String[] dy_xch_aply_st_dt     =  (JSPUtil.getParameter(request, prefix + "dy_xch_aply_st_dt    		".trim(), length));
			String[] iss_div_cd            =  (JSPUtil.getParameter(request, prefix + "iss_div_cd           		".trim(), length));
			String[] bank_acct_no          =  (JSPUtil.getParameter(request, prefix + "bank_acct_no         		".trim(), length));
			String[] cntc_pson_nm          =  (JSPUtil.getParameter(request, prefix + "cntc_pson_nm         		".trim(), length));
			String[] cust_cr_due_dt_div_cd =  (JSPUtil.getParameter(request, prefix + "cust_cr_due_dt_div_cd		".trim(), length));
			String[] ownr_nm               =  (JSPUtil.getParameter(request, prefix + "ownr_nm              		".trim(), length));
			String[] bzct_nm               =  (JSPUtil.getParameter(request, prefix + "bzct_nm              		".trim(), length));
			String[] bztp_nm               =  (JSPUtil.getParameter(request, prefix + "bztp_nm              		".trim(), length));
			String[] pay_dt_dy1            =  (JSPUtil.getParameter(request, prefix + "pay_dt_dy1           		".trim(), length));
			String[] pay_dt_dy2            =  (JSPUtil.getParameter(request, prefix + "pay_dt_dy2           		".trim(), length));
			String[] pay_dt_dy3            =  (JSPUtil.getParameter(request, prefix + "pay_dt_dy3           		".trim(), length));
			String[] pay_dt_dy4            =  (JSPUtil.getParameter(request, prefix + "pay_dt_dy4           		".trim(), length));
			String[] locl_nm               =  (JSPUtil.getParameter(request, prefix + "locl_nm              		".trim(), length));
			String[] locl_addr1            =  (JSPUtil.getParameter(request, prefix + "locl_addr1           		".trim(), length));
			String[] locl_addr2            =  (JSPUtil.getParameter(request, prefix + "locl_addr2           		".trim(), length));
			String[] locl_addr3            =  (JSPUtil.getParameter(request, prefix + "locl_addr3           		".trim(), length));
			String[] locl_addr4            =  (JSPUtil.getParameter(request, prefix + "locl_addr4           		".trim(), length));
			String[] locl_zip_cd           =  (JSPUtil.getParameter(request, prefix + "locl_zip_cd          		".trim(), length));
			String[] bfr_cr_clt_ofc_cd     =  (JSPUtil.getParameter(request, prefix + "bfr_cr_clt_ofc_cd    		".trim(), length));
			String[] bfr_ofc_cng_dt        =  (JSPUtil.getParameter(request, prefix + "bfr_ofc_cng_dt       		".trim(), length));
			String[] bfr_kr_ib_ofc_cd      =  (JSPUtil.getParameter(request, prefix + "bfr_kr_ib_ofc_cd     		".trim(), length));
			String[] inv_due_dt_dp_flg     =  (JSPUtil.getParameter(request, prefix + "inv_due_dt_dp_flg    		".trim(), length));
			String[] cre_usr_id            =  (JSPUtil.getParameter(request, prefix + "cre_usr_id           		".trim(), length));
			String[] cre_dt                =  (JSPUtil.getParameter(request, prefix + "cre_dt               		".trim(), length));
			String[] upd_usr_id            =  (JSPUtil.getParameter(request, prefix + "upd_usr_id           		".trim(), length));
			String[] upd_dt                =  (JSPUtil.getParameter(request, prefix + "upd_dt               		".trim(), length));
			String[] delt_flg              =  (JSPUtil.getParameter(request, prefix + "delt_flg             		".trim(), length));
			String[] eai_evnt_dt           =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt          		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new MdmCrCust();
				model.setIbflag               		  ( ibflag               	[i]);
				model.setPage_rows            		  ( page_rows            	[i]);
				model.setCust_cnt_cd          		  ( cust_cnt_cd          	[i]);
				model.setCust_seq             		  ( cust_seq             	[i]);
				model.setAct_cust_cnt_cd      		  ( act_cust_cnt_cd      	[i]);
				model.setAct_cust_seq         		  ( act_cust_seq         	[i]);
				model.setCust_rlse_ctrl_flg   		  ( cust_rlse_ctrl_flg   	[i]);
				model.setCr_flg               		  ( cr_flg               	[i]);
				model.setCr_curr_cd           		  ( cr_curr_cd           	[i]);
				model.setCr_amt               		  ( cr_amt               	[i]);
				model.setCr_clt_ofc_cd        		  ( cr_clt_ofc_cd        	[i]);
				model.setCr_cust_rmk          		  ( cr_cust_rmk          	[i]);
				model.setIb_cr_term_dys       		  ( ib_cr_term_dys       	[i]);
				model.setOb_cr_term_dys       		  ( ob_cr_term_dys       	[i]);
				model.setPay_div_cd           		  ( pay_div_cd           	[i]);
				model.setCr_st_dt             		  ( cr_st_dt             	[i]);
				model.setCr_end_dt            		  ( cr_end_dt            	[i]);
				model.setCr_cust_tp_cd        		  ( cr_cust_tp_cd        	[i]);
				model.setKr_ib_ofc_cd         		  ( kr_ib_ofc_cd         	[i]);
				model.setOb_eml               		  ( ob_eml               	[i]);
				model.setIb_eml               		  ( ib_eml               	[i]);
				model.setOb_phn_no            		  ( ob_phn_no            	[i]);
				model.setIb_phn_no            		  ( ib_phn_no            	[i]);
				model.setOb_fax_no            		  ( ob_fax_no            	[i]);
				model.setIb_fax_no            		  ( ib_fax_no            	[i]);
				model.setXch_rt_div_cd        		  ( xch_rt_div_cd        	[i]);
				model.setCng_indiv_cd         		  ( cng_indiv_cd         	[i]);
				model.setDy_xch_aply_st_dt    		  ( dy_xch_aply_st_dt    	[i]);
				model.setIss_div_cd           		  ( iss_div_cd           	[i]);
				model.setBank_acct_no         		  ( bank_acct_no         	[i]);
				model.setCntc_pson_nm         		  ( cntc_pson_nm         	[i]);
				model.setCust_cr_due_dt_div_cd		  ( cust_cr_due_dt_div_cd	[i]);
				model.setOwnr_nm              		  ( ownr_nm              	[i]);
				model.setBzct_nm              		  ( bzct_nm              	[i]);
				model.setBztp_nm              		  ( bztp_nm              	[i]);
				model.setPay_dt_dy1           		  ( pay_dt_dy1           	[i]);
				model.setPay_dt_dy2           		  ( pay_dt_dy2           	[i]);
				model.setPay_dt_dy3           		  ( pay_dt_dy3           	[i]);
				model.setPay_dt_dy4           		  ( pay_dt_dy4           	[i]);
				model.setLocl_nm              		  ( locl_nm              	[i]);
				model.setLocl_addr1           		  ( locl_addr1           	[i]);
				model.setLocl_addr2           		  ( locl_addr2           	[i]);
				model.setLocl_addr3           		  ( locl_addr3           	[i]);
				model.setLocl_addr4           		  ( locl_addr4           	[i]);
				model.setLocl_zip_cd          		  ( locl_zip_cd          	[i]);
				model.setBfr_cr_clt_ofc_cd    		  ( bfr_cr_clt_ofc_cd    	[i]);
				model.setBfr_ofc_cng_dt       		  ( bfr_ofc_cng_dt       	[i]);
				model.setBfr_kr_ib_ofc_cd     		  ( bfr_kr_ib_ofc_cd     	[i]);
				model.setInv_due_dt_dp_flg    		  ( inv_due_dt_dp_flg    	[i]);
				model.setCre_usr_id           		  ( cre_usr_id           	[i]);
				model.setCre_dt               		  ( cre_dt               	[i]);
				model.setUpd_usr_id           		  ( upd_usr_id           	[i]);
				model.setUpd_dt               		  ( upd_dt               	[i]);
				model.setDelt_flg             		  ( delt_flg             	[i]);
				model.setEai_evnt_dt          		  ( eai_evnt_dt          	[i]);
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
