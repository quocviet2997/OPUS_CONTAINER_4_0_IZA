/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : MDM_VENDOR.java
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
public final class MdmVendorMaster implements java.io.Serializable {

	private String              ibflag              = "";
	private String              page_rows           = "";
	private String              vndr_seq            = "";
	private String              vndr_cnt_cd         = "";
	private String              vndr_lgl_eng_nm     = "";
	private String              vndr_locl_lang_nm   = "";
	private String              vndr_abbr_nm        = "";
	private String              lgs_flg             = "";
	private String              procu_flg           = "";
	private String              team_flg            = "";
	private String              finc_flg            = "";
	private String              blk_flg             = "";
	private String              inter_co_flg        = "";
	private String              loc_cd              = "";
	private String              ofc_cd              = "";
	private String              ceo_nm              = "";
	private String              rgst_no             = "";
	private String              tax_id              = "";
	private String              prnt_cnt_cd         = "";
	private String              prnt_vndr_seq       = "";
	private String              dcgo_hndl_flg       = "";
	private String              svc_scp_cd_nm       = "";
	private String              svc_prd_tp_nm       = "";
	private String              svc_prd_rmk         = "";
	private String              bzct_nm             = "";
	private String              bztp_nm             = "";
	private String              gen_pay_term_cd     = "";
	private String              eng_addr            = "";
	private String              locl_lang_addr1     = "";
	private String              locl_lang_addr2     = "";
	private String              locl_lang_addr3     = "";
	private String              locl_lang_addr4     = "";
	private String              zip_cd              = "";
	private String              cntc_pson_nm        = "";
	private String              inv_curr_cd         = "";
	private String              pay_curr_cd         = "";
	private String              pay_mzd_cd          = "";
	private String              usa_edi_cd          = "";
	private String              wo_atch_file_flg    = "";
	private String              wo_edi_use_flg      = "";
	private String              inv_edi_use_flg     = "";
	private String              mty_rro_edi_use_flg = "";
	private String              blk_vndr_svc_cd     = "";
	private String              subs_co_cd          = "";
	private String              otr_flg             = "";
	private String              vndr_ofc_cd         = "";
	private String              modi_vndr_seq       = "";
	private String              cre_usr_id          = "";
	private String              cre_dt              = "";
	private String              upd_usr_id          = "";
	private String              upd_dt              = "";
	private String              delt_flg            = "";
	private String              eai_evnt_dt         = "";
	private String				rfnd_psdo_cust_cd   = "";
	private String				pay_term_tp_cd		= "";
	private String				chk_de_addr1		= "";
	private String				chk_de_addr2    	= "";
	private String				chk_de_addr3    	= "";
	private String				chk_de_cty_nm   	= "";
	private String				chk_de_ste_cd   	= "";
	private String				chk_de_zip_cd   	= "";
	private String				chk_de_cnt_cd   	= "";
	
	public MdmVendorMaster(){}

	public MdmVendorMaster(
			String              ibflag             ,
			String              page_rows          ,
			String              vndr_seq           ,
			String              vndr_cnt_cd        ,
			String              vndr_lgl_eng_nm    ,
			String              vndr_locl_lang_nm  ,
			String              vndr_abbr_nm       ,
			String              lgs_flg            ,
			String              procu_flg          ,
			String              team_flg           ,
			String              finc_flg           ,
			String              blk_flg            ,
			String              inter_co_flg       ,
			String              loc_cd             ,
			String              ofc_cd             ,
			String              ceo_nm             ,
			String              rgst_no            ,
			String              tax_id             ,
			String              prnt_cnt_cd        ,
			String              prnt_vndr_seq      ,
			String              dcgo_hndl_flg      ,
			String              svc_scp_cd_nm      ,
			String              svc_prd_tp_nm      ,
			String              svc_prd_rmk        ,
			String              bzct_nm            ,
			String              bztp_nm            ,
			String              gen_pay_term_cd    ,
			String              eng_addr           ,
			String              locl_lang_addr1    ,
			String              locl_lang_addr2    ,
			String              locl_lang_addr3    ,
			String              locl_lang_addr4    ,
			String              zip_cd             ,
			String              cntc_pson_nm       ,
			String              inv_curr_cd        ,
			String              pay_curr_cd        ,
			String              pay_mzd_cd         ,
			String              usa_edi_cd         ,
			String              wo_atch_file_flg   ,
			String              wo_edi_use_flg     ,
			String              inv_edi_use_flg    ,
			String              mty_rro_edi_use_flg,
			String              blk_vndr_svc_cd    ,
			String              subs_co_cd         ,
			String              otr_flg            ,
			String              vndr_ofc_cd        ,
			String              modi_vndr_seq      ,
			String              cre_usr_id         ,
			String              cre_dt             ,
			String              upd_usr_id         ,
			String              upd_dt             ,
			String              delt_flg           ,
			String              eai_evnt_dt        ,
			String				rfnd_psdo_cust_cd  ,
			String				pay_term_tp_cd	   ,
			String              chk_de_addr1 	   ,
			String              chk_de_addr2 	   ,
			String              chk_de_addr3 	   ,
			String              chk_de_cty_nm	   ,
			String              chk_de_ste_cd	   ,
			String              chk_de_zip_cd	   ,
			String              chk_de_cnt_cd ){
		this.ibflag              = ibflag             ;
		this.page_rows           = page_rows          ;
		this.vndr_seq            = vndr_seq           ;
		this.vndr_cnt_cd         = vndr_cnt_cd        ;
		this.vndr_lgl_eng_nm     = vndr_lgl_eng_nm    ;
		this.vndr_locl_lang_nm   = vndr_locl_lang_nm  ;
		this.vndr_abbr_nm        = vndr_abbr_nm       ;
		this.lgs_flg             = lgs_flg            ;
		this.procu_flg           = procu_flg          ;
		this.team_flg            = team_flg           ;
		this.finc_flg            = finc_flg           ;
		this.blk_flg             = blk_flg            ;
		this.inter_co_flg        = inter_co_flg       ;
		this.loc_cd              = loc_cd             ;
		this.ofc_cd              = ofc_cd             ;
		this.ceo_nm              = ceo_nm             ;
		this.rgst_no             = rgst_no            ;
		this.tax_id              = tax_id             ;
		this.prnt_cnt_cd         = prnt_cnt_cd        ;
		this.prnt_vndr_seq       = prnt_vndr_seq      ;
		this.dcgo_hndl_flg       = dcgo_hndl_flg      ;
		this.svc_scp_cd_nm       = svc_scp_cd_nm      ;
		this.svc_prd_tp_nm       = svc_prd_tp_nm      ;
		this.svc_prd_rmk         = svc_prd_rmk        ;
		this.bzct_nm             = bzct_nm            ;
		this.bztp_nm             = bztp_nm            ;
		this.gen_pay_term_cd     = gen_pay_term_cd    ;
		this.eng_addr            = eng_addr           ;
		this.locl_lang_addr1     = locl_lang_addr1    ;
		this.locl_lang_addr2     = locl_lang_addr2    ;
		this.locl_lang_addr3     = locl_lang_addr3    ;
		this.locl_lang_addr4     = locl_lang_addr4    ;
		this.zip_cd              = zip_cd             ;
		this.cntc_pson_nm        = cntc_pson_nm       ;
		this.inv_curr_cd         = inv_curr_cd        ;
		this.pay_curr_cd         = pay_curr_cd        ;
		this.pay_mzd_cd          = pay_mzd_cd         ;
		this.usa_edi_cd          = usa_edi_cd         ;
		this.wo_atch_file_flg    = wo_atch_file_flg   ;
		this.wo_edi_use_flg      = wo_edi_use_flg     ;
		this.inv_edi_use_flg     = inv_edi_use_flg    ;
		this.mty_rro_edi_use_flg = mty_rro_edi_use_flg;
		this.blk_vndr_svc_cd     = blk_vndr_svc_cd    ;
		this.subs_co_cd          = subs_co_cd         ;
		this.otr_flg             = otr_flg            ;
		this.vndr_ofc_cd         = vndr_ofc_cd        ;
		this.modi_vndr_seq       = modi_vndr_seq      ;
		this.cre_usr_id          = cre_usr_id         ;
		this.cre_dt              = cre_dt             ;
		this.upd_usr_id          = upd_usr_id         ;
		this.upd_dt              = upd_dt             ;
		this.delt_flg            = delt_flg           ;
		this.eai_evnt_dt         = eai_evnt_dt        ;
		this.rfnd_psdo_cust_cd   = rfnd_psdo_cust_cd  ;
		this.pay_term_tp_cd		 = pay_term_tp_cd	  ;
		this.chk_de_addr1		 = chk_de_addr1 	  ;
		this.chk_de_addr2        = chk_de_addr2       ;
		this.chk_de_addr3        = chk_de_addr3       ;
		this.chk_de_cty_nm       = chk_de_cty_nm      ;
		this.chk_de_ste_cd		 = chk_de_ste_cd      ;
		this.chk_de_zip_cd   	 = chk_de_zip_cd      ;
		this.chk_de_cnt_cd       = chk_de_cnt_cd      ;		
	}

	// getter method is proceeding ..
	public String              getIbflag             (){	return ibflag             	;	}
	public String              getPage_rows          (){	return page_rows          	;	}
	public String              getVndr_seq           (){	return vndr_seq           	;	}
	public String              getVndr_cnt_cd        (){	return vndr_cnt_cd        	;	}
	public String              getVndr_lgl_eng_nm    (){	return vndr_lgl_eng_nm    	;	}
	public String              getVndr_locl_lang_nm  (){	return vndr_locl_lang_nm  	;	}
	public String              getVndr_abbr_nm       (){	return vndr_abbr_nm       	;	}
	public String              getLgs_flg            (){	return lgs_flg            	;	}
	public String              getProcu_flg          (){	return procu_flg          	;	}
	public String              getTeam_flg           (){	return team_flg           	;	}
	public String              getFinc_flg           (){	return finc_flg           	;	}
	public String              getBlk_flg            (){	return blk_flg            	;	}
	public String              getInter_co_flg       (){	return inter_co_flg       	;	}
	public String              getLoc_cd             (){	return loc_cd             	;	}
	public String              getOfc_cd             (){	return ofc_cd             	;	}
	public String              getCeo_nm             (){	return ceo_nm             	;	}
	public String              getRgst_no            (){	return rgst_no            	;	}
	public String              getTax_id             (){	return tax_id             	;	}
	public String              getPrnt_cnt_cd        (){	return prnt_cnt_cd        	;	}
	public String              getPrnt_vndr_seq      (){	return prnt_vndr_seq      	;	}
	public String              getDcgo_hndl_flg      (){	return dcgo_hndl_flg      	;	}
	public String              getSvc_scp_cd_nm      (){	return svc_scp_cd_nm      	;	}
	public String              getSvc_prd_tp_nm      (){	return svc_prd_tp_nm      	;	}
	public String              getSvc_prd_rmk        (){	return svc_prd_rmk        	;	}
	public String              getBzct_nm            (){	return bzct_nm            	;	}
	public String              getBztp_nm            (){	return bztp_nm            	;	}
	public String              getGen_pay_term_cd    (){	return gen_pay_term_cd    	;	}
	public String              getEng_addr           (){	return eng_addr           	;	}
	public String              getLocl_lang_addr1    (){	return locl_lang_addr1     	;	}
	public String              getLocl_lang_addr2    (){	return locl_lang_addr2     	;	}
	public String              getLocl_lang_addr3    (){	return locl_lang_addr3     	;	}
	public String              getLocl_lang_addr4    (){	return locl_lang_addr4     	;	}
	public String              getZip_cd             (){	return zip_cd             	;	}
	public String              getCntc_pson_nm       (){	return cntc_pson_nm       	;	}
	public String              getInv_curr_cd        (){	return inv_curr_cd        	;	}
	public String              getPay_curr_cd        (){	return pay_curr_cd        	;	}
	public String              getPay_mzd_cd         (){	return pay_mzd_cd         	;	}
	public String              getUsa_edi_cd         (){	return usa_edi_cd         	;	}
	public String              getWo_atch_file_flg   (){	return wo_atch_file_flg   	;	}
	public String              getWo_edi_use_flg     (){	return wo_edi_use_flg     	;	}
	public String              getInv_edi_use_flg    (){	return inv_edi_use_flg    	;	}
	public String              getMty_rro_edi_use_flg(){	return mty_rro_edi_use_flg	;	}
	public String              getBlk_vndr_svc_cd    (){	return blk_vndr_svc_cd    	;	}
	public String              getSubs_co_cd         (){	return subs_co_cd         	;	}
	public String              getOtr_flg            (){	return otr_flg            	;	}
	public String              getVndr_ofc_cd        (){	return vndr_ofc_cd        	;	}
	public String              getModi_vndr_seq      (){	return modi_vndr_seq      	;	}
	public String              getCre_usr_id         (){	return cre_usr_id         	;	}
	public String              getCre_dt             (){	return cre_dt             	;	}
	public String              getUpd_usr_id         (){	return upd_usr_id         	;	}
	public String              getUpd_dt             (){	return upd_dt             	;	}
	public String              getDelt_flg           (){	return delt_flg           	;	}
	public String              getEai_evnt_dt        (){	return eai_evnt_dt        	;	}
	public String 			   getRfnd_psdo_cust_cd  (){	return rfnd_psdo_cust_cd	;	}
	public String 			   getPay_term_tp_cd     (){	return pay_term_tp_cd		;	}
	public String			   getChk_de_addr1		 (){	return chk_de_addr1  		;	}
	public String              getChk_de_addr2		 (){	return chk_de_addr2  		;	}
	public String              getChk_de_addr3 	 	 (){	return chk_de_addr3  		;	}
	public String              getChk_de_cty_nm		 (){	return chk_de_cty_nm 		;	}
	public String              getChk_de_ste_cd		 (){	return chk_de_ste_cd 		;	}
	public String              getChk_de_zip_cd		 (){	return chk_de_zip_cd 		;	}
	public String              getChk_de_cnt_cd		 (){	return chk_de_cnt_cd 		;	}	
	

	// setter method is proceeding ..
	public void setIbflag             ( String              ibflag              ){	this.ibflag              = ibflag             	;	}
	public void setPage_rows          ( String              page_rows           ){	this.page_rows           = page_rows          	;	}
	public void setVndr_seq           ( String              vndr_seq            ){	this.vndr_seq            = vndr_seq           	;	}
	public void setVndr_cnt_cd        ( String              vndr_cnt_cd         ){	this.vndr_cnt_cd         = vndr_cnt_cd        	;	}
	public void setVndr_lgl_eng_nm    ( String              vndr_lgl_eng_nm     ){	this.vndr_lgl_eng_nm     = vndr_lgl_eng_nm    	;	}
	public void setVndr_locl_lang_nm  ( String              vndr_locl_lang_nm   ){	this.vndr_locl_lang_nm   = vndr_locl_lang_nm  	;	}
	public void setVndr_abbr_nm       ( String              vndr_abbr_nm        ){	this.vndr_abbr_nm        = vndr_abbr_nm       	;	}
	public void setLgs_flg            ( String              lgs_flg             ){	this.lgs_flg             = lgs_flg            	;	}
	public void setProcu_flg          ( String              procu_flg           ){	this.procu_flg           = procu_flg          	;	}
	public void setTeam_flg           ( String              team_flg            ){	this.team_flg            = team_flg           	;	}
	public void setFinc_flg           ( String              finc_flg            ){	this.finc_flg            = finc_flg           	;	}
	public void setBlk_flg            ( String              blk_flg             ){	this.blk_flg             = blk_flg            	;	}
	public void setInter_co_flg       ( String              inter_co_flg        ){	this.inter_co_flg        = inter_co_flg       	;	}
	public void setLoc_cd             ( String              loc_cd              ){	this.loc_cd              = loc_cd             	;	}
	public void setOfc_cd             ( String              ofc_cd              ){	this.ofc_cd              = ofc_cd             	;	}
	public void setCeo_nm             ( String              ceo_nm              ){	this.ceo_nm              = ceo_nm             	;	}
	public void setRgst_no            ( String              rgst_no             ){	this.rgst_no             = rgst_no            	;	}
	public void setTax_id             ( String              tax_id              ){	this.tax_id              = tax_id             	;	}
	public void setPrnt_cnt_cd        ( String              prnt_cnt_cd         ){	this.prnt_cnt_cd         = prnt_cnt_cd        	;	}
	public void setPrnt_vndr_seq      ( String              prnt_vndr_seq       ){	this.prnt_vndr_seq       = prnt_vndr_seq      	;	}
	public void setDcgo_hndl_flg      ( String              dcgo_hndl_flg       ){	this.dcgo_hndl_flg       = dcgo_hndl_flg      	;	}
	public void setSvc_scp_cd_nm      ( String              svc_scp_cd_nm       ){	this.svc_scp_cd_nm       = svc_scp_cd_nm      	;	}
	public void setSvc_prd_tp_nm      ( String              svc_prd_tp_nm       ){	this.svc_prd_tp_nm       = svc_prd_tp_nm      	;	}
	public void setSvc_prd_rmk        ( String              svc_prd_rmk         ){	this.svc_prd_rmk         = svc_prd_rmk        	;	}
	public void setBzct_nm            ( String              bzct_nm             ){	this.bzct_nm             = bzct_nm            	;	}
	public void setBztp_nm            ( String              bztp_nm             ){	this.bztp_nm             = bztp_nm            	;	}
	public void setGen_pay_term_cd    ( String              gen_pay_term_cd     ){	this.gen_pay_term_cd     = gen_pay_term_cd    	;	}
	public void setEng_addr           ( String              eng_addr            ){	this.eng_addr            = eng_addr           	;	}
	public void setLocl_lang_addr1    ( String              locl_lang_addr1     ){	this.locl_lang_addr1     = locl_lang_addr1     	;	}
	public void setLocl_lang_addr2    ( String              locl_lang_addr2     ){	this.locl_lang_addr2     = locl_lang_addr2     	;	}
	public void setLocl_lang_addr3    ( String              locl_lang_addr3     ){	this.locl_lang_addr3     = locl_lang_addr3     	;	}
	public void setLocl_lang_addr4    ( String              locl_lang_addr4     ){	this.locl_lang_addr4     = locl_lang_addr4     	;	}
	public void setZip_cd             ( String              zip_cd              ){	this.zip_cd              = zip_cd             	;	}
	public void setCntc_pson_nm       ( String              cntc_pson_nm        ){	this.cntc_pson_nm        = cntc_pson_nm       	;	}
	public void setInv_curr_cd        ( String              inv_curr_cd         ){	this.inv_curr_cd         = inv_curr_cd        	;	}
	public void setPay_curr_cd        ( String              pay_curr_cd         ){	this.pay_curr_cd         = pay_curr_cd        	;	}
	public void setPay_mzd_cd         ( String              pay_mzd_cd          ){	this.pay_mzd_cd          = pay_mzd_cd         	;	}
	public void setUsa_edi_cd         ( String              usa_edi_cd          ){	this.usa_edi_cd          = usa_edi_cd         	;	}
	public void setWo_atch_file_flg   ( String              wo_atch_file_flg    ){	this.wo_atch_file_flg    = wo_atch_file_flg   	;	}
	public void setWo_edi_use_flg     ( String              wo_edi_use_flg      ){	this.wo_edi_use_flg      = wo_edi_use_flg     	;	}
	public void setInv_edi_use_flg    ( String              inv_edi_use_flg     ){	this.inv_edi_use_flg     = inv_edi_use_flg    	;	}
	public void setMty_rro_edi_use_flg( String              mty_rro_edi_use_flg ){	this.mty_rro_edi_use_flg = mty_rro_edi_use_flg	;	}
	public void setBlk_vndr_svc_cd    ( String              blk_vndr_svc_cd     ){	this.blk_vndr_svc_cd     = blk_vndr_svc_cd    	;	}
	public void setSubs_co_cd         ( String              subs_co_cd          ){	this.subs_co_cd          = subs_co_cd         	;	}
	public void setOtr_flg            ( String              otr_flg             ){	this.otr_flg             = otr_flg            	;	}
	public void setVndr_ofc_cd        ( String              vndr_ofc_cd         ){	this.vndr_ofc_cd         = vndr_ofc_cd        	;	}
	public void setModi_vndr_seq      ( String              modi_vndr_seq       ){	this.modi_vndr_seq       = modi_vndr_seq      	;	}
	public void setCre_usr_id         ( String              cre_usr_id          ){	this.cre_usr_id          = cre_usr_id         	;	}
	public void setCre_dt             ( String              cre_dt              ){	this.cre_dt              = cre_dt             	;	}
	public void setUpd_usr_id         ( String              upd_usr_id          ){	this.upd_usr_id          = upd_usr_id         	;	}
	public void setUpd_dt             ( String              upd_dt              ){	this.upd_dt              = upd_dt             	;	}
	public void setDelt_flg           ( String              delt_flg            ){	this.delt_flg            = delt_flg           	;	}
	public void setEai_evnt_dt        ( String              eai_evnt_dt         ){	this.eai_evnt_dt         = eai_evnt_dt        	;	}
	public void setRfnd_psdo_cust_cd  (	String				rfnd_psdo_cust_cd	){	this.rfnd_psdo_cust_cd	 = rfnd_psdo_cust_cd	;	}
	public void setPay_term_tp_cd  	  (	String				pay_term_tp_cd		){	this.pay_term_tp_cd	 	 = pay_term_tp_cd		;	}
	public void setChk_de_addr1	  	  ( String				chk_de_addr1  		){ 	this.chk_de_addr1  		 = chk_de_addr1 		; 	}
	public void setChk_de_addr2	  	  ( String				chk_de_addr2  		){ 	this.chk_de_addr2  		 = chk_de_addr2 		; 	}
	public void setChk_de_addr3   	  ( String				chk_de_addr3  		){ 	this.chk_de_addr3  		 = chk_de_addr3 		; 	}
	public void setChk_de_cty_nm  	  ( String				chk_de_cty_nm 		){ 	this.chk_de_cty_nm 		 = chk_de_cty_nm		; 	}
	public void setChk_de_ste_cd  	  ( String				chk_de_ste_cd 		){ 	this.chk_de_ste_cd 		 = chk_de_ste_cd		; 	}
	public void setChk_de_zip_cd  	  ( String				chk_de_zip_cd 		){ 	this.chk_de_zip_cd 		 = chk_de_zip_cd		; 	}
	public void setChk_de_cnt_cd  	  ( String				chk_de_cnt_cd 		){ 	this.chk_de_cnt_cd 		 = chk_de_cnt_cd		; 	}	
	
	
	public static MdmVendorMaster fromRequest(HttpServletRequest request) {
		MdmVendorMaster model = new MdmVendorMaster();
		try {
			model.setIbflag             	(JSPUtil.getParameter(request, "ibflag             		".trim(), ""));
			model.setPage_rows          	(JSPUtil.getParameter(request, "page_rows          		".trim(), ""));
			model.setVndr_seq           	(JSPUtil.getParameter(request, "vndr_seq           		".trim(), ""));
			model.setVndr_cnt_cd        	(JSPUtil.getParameter(request, "vndr_cnt_cd        		".trim(), ""));
			model.setVndr_lgl_eng_nm    	(JSPUtil.getParameter(request, "vndr_lgl_eng_nm    		".trim(), ""));
			model.setVndr_locl_lang_nm  	(JSPUtil.getParameter(request, "vndr_locl_lang_nm  		".trim(), ""));
			model.setVndr_abbr_nm       	(JSPUtil.getParameter(request, "vndr_abbr_nm       		".trim(), ""));
			model.setLgs_flg            	(JSPUtil.getParameter(request, "lgs_flg            		".trim(), ""));
			model.setProcu_flg          	(JSPUtil.getParameter(request, "procu_flg          		".trim(), ""));
			model.setTeam_flg           	(JSPUtil.getParameter(request, "team_flg           		".trim(), ""));
			model.setFinc_flg           	(JSPUtil.getParameter(request, "finc_flg           		".trim(), ""));
			model.setBlk_flg            	(JSPUtil.getParameter(request, "blk_flg            		".trim(), ""));
			model.setInter_co_flg       	(JSPUtil.getParameter(request, "inter_co_flg       		".trim(), ""));
			model.setLoc_cd             	(JSPUtil.getParameter(request, "loc_cd             		".trim(), ""));
			model.setOfc_cd             	(JSPUtil.getParameter(request, "ofc_cd             		".trim(), ""));
			model.setCeo_nm             	(JSPUtil.getParameter(request, "ceo_nm             		".trim(), ""));
			model.setRgst_no            	(JSPUtil.getParameter(request, "rgst_no            		".trim(), ""));
			model.setTax_id             	(JSPUtil.getParameter(request, "tax_id             		".trim(), ""));
			model.setPrnt_cnt_cd        	(JSPUtil.getParameter(request, "prnt_cnt_cd        		".trim(), ""));
			model.setPrnt_vndr_seq      	(JSPUtil.getParameter(request, "prnt_vndr_seq      		".trim(), ""));
			model.setDcgo_hndl_flg      	(JSPUtil.getParameter(request, "dcgo_hndl_flg      		".trim(), ""));
			model.setSvc_scp_cd_nm      	(JSPUtil.getParameter(request, "svc_scp_cd_nm      		".trim(), ""));
			model.setSvc_prd_tp_nm      	(JSPUtil.getParameter(request, "svc_prd_tp_nm      		".trim(), ""));
			model.setSvc_prd_rmk        	(JSPUtil.getParameter(request, "svc_prd_rmk        		".trim(), ""));
			model.setBzct_nm            	(JSPUtil.getParameter(request, "bzct_nm            		".trim(), ""));
			model.setBztp_nm            	(JSPUtil.getParameter(request, "bztp_nm            		".trim(), ""));
			model.setGen_pay_term_cd    	(JSPUtil.getParameter(request, "gen_pay_term_cd    		".trim(), ""));
			model.setEng_addr           	(JSPUtil.getParameter(request, "eng_addr           		".trim(), ""));
			model.setLocl_lang_addr1     	(JSPUtil.getParameter(request, "locl_lang_addr1    		".trim(), ""));
			model.setLocl_lang_addr2     	(JSPUtil.getParameter(request, "locl_lang_addr2    		".trim(), ""));
			model.setLocl_lang_addr3     	(JSPUtil.getParameter(request, "locl_lang_addr3    		".trim(), ""));
			model.setLocl_lang_addr4     	(JSPUtil.getParameter(request, "locl_lang_addr4    		".trim(), ""));
			model.setZip_cd             	(JSPUtil.getParameter(request, "zip_cd             		".trim(), ""));
			model.setCntc_pson_nm       	(JSPUtil.getParameter(request, "cntc_pson_nm       		".trim(), ""));
			model.setInv_curr_cd        	(JSPUtil.getParameter(request, "inv_curr_cd        		".trim(), ""));
			model.setPay_curr_cd        	(JSPUtil.getParameter(request, "pay_curr_cd        		".trim(), ""));
			model.setPay_mzd_cd         	(JSPUtil.getParameter(request, "pay_mzd_cd         		".trim(), ""));
			model.setUsa_edi_cd         	(JSPUtil.getParameter(request, "usa_edi_cd         		".trim(), ""));
			model.setWo_atch_file_flg   	(JSPUtil.getParameter(request, "wo_atch_file_flg   		".trim(), ""));
			model.setWo_edi_use_flg     	(JSPUtil.getParameter(request, "wo_edi_use_flg     		".trim(), ""));
			model.setInv_edi_use_flg    	(JSPUtil.getParameter(request, "inv_edi_use_flg    		".trim(), ""));
			model.setMty_rro_edi_use_flg	(JSPUtil.getParameter(request, "mty_rro_edi_use_flg		".trim(), ""));
			model.setBlk_vndr_svc_cd    	(JSPUtil.getParameter(request, "blk_vndr_svc_cd    		".trim(), ""));
			model.setSubs_co_cd         	(JSPUtil.getParameter(request, "subs_co_cd         		".trim(), ""));
			model.setOtr_flg            	(JSPUtil.getParameter(request, "otr_flg            		".trim(), ""));
			model.setVndr_ofc_cd        	(JSPUtil.getParameter(request, "vndr_ofc_cd        		".trim(), ""));
			model.setModi_vndr_seq      	(JSPUtil.getParameter(request, "modi_vndr_seq      		".trim(), ""));
			model.setCre_usr_id         	(JSPUtil.getParameter(request, "cre_usr_id         		".trim(), ""));
			model.setCre_dt             	(JSPUtil.getParameter(request, "cre_dt             		".trim(), ""));
			model.setUpd_usr_id         	(JSPUtil.getParameter(request, "upd_usr_id         		".trim(), ""));
			model.setUpd_dt             	(JSPUtil.getParameter(request, "upd_dt             		".trim(), ""));
			model.setDelt_flg           	(JSPUtil.getParameter(request, "delt_flg           		".trim(), ""));
			model.setEai_evnt_dt        	(JSPUtil.getParameter(request, "eai_evnt_dt        		".trim(), ""));
			model.setRfnd_psdo_cust_cd		(JSPUtil.getParameter(request, "rfnd_psdo_cust_cd       ".trim(), ""));
			model.setPay_term_tp_cd			(JSPUtil.getParameter(request, "pay_term_tp_cd       	".trim(), ""));
			model.setChk_de_addr1			(JSPUtil.getParameter(request, "chk_de_addr1   			".trim(), ""));
			model.setChk_de_addr2			(JSPUtil.getParameter(request, "chk_de_addr2   			".trim(), ""));
			model.setChk_de_addr3   		(JSPUtil.getParameter(request, "chk_de_addr3   			".trim(), ""));
			model.setChk_de_cty_nm  		(JSPUtil.getParameter(request, "chk_de_cty_nm  			".trim(), ""));
			model.setChk_de_ste_cd  		(JSPUtil.getParameter(request, "chk_de_ste_cd  			".trim(), ""));
			model.setChk_de_zip_cd  		(JSPUtil.getParameter(request, "chk_de_zip_cd  			".trim(), ""));
			model.setChk_de_cnt_cd 			(JSPUtil.getParameter(request, "chk_de_cnt_cd  			".trim(), ""));			
		} catch (Exception ex) {	
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		MdmVendorMaster model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag              =  (JSPUtil.getParameter(request, "ibflag             		".trim(), length));
			String[] page_rows           =  (JSPUtil.getParameter(request, "page_rows          		".trim(), length));
			String[] vndr_seq            =  (JSPUtil.getParameter(request, "vndr_seq           		".trim(), length));
			String[] vndr_cnt_cd         =  (JSPUtil.getParameter(request, "vndr_cnt_cd        		".trim(), length));
			String[] vndr_lgl_eng_nm     =  (JSPUtil.getParameter(request, "vndr_lgl_eng_nm    		".trim(), length));
			String[] vndr_locl_lang_nm   =  (JSPUtil.getParameter(request, "vndr_locl_lang_nm  		".trim(), length));
			String[] vndr_abbr_nm        =  (JSPUtil.getParameter(request, "vndr_abbr_nm       		".trim(), length));
			String[] lgs_flg             =  (JSPUtil.getParameter(request, "lgs_flg            		".trim(), length));
			String[] procu_flg           =  (JSPUtil.getParameter(request, "procu_flg          		".trim(), length));
			String[] team_flg            =  (JSPUtil.getParameter(request, "team_flg           		".trim(), length));
			String[] finc_flg            =  (JSPUtil.getParameter(request, "finc_flg           		".trim(), length));
			String[] blk_flg             =  (JSPUtil.getParameter(request, "blk_flg            		".trim(), length));
			String[] inter_co_flg        =  (JSPUtil.getParameter(request, "inter_co_flg       		".trim(), length));
			String[] loc_cd              =  (JSPUtil.getParameter(request, "loc_cd             		".trim(), length));
			String[] ofc_cd              =  (JSPUtil.getParameter(request, "ofc_cd             		".trim(), length));
			String[] ceo_nm              =  (JSPUtil.getParameter(request, "ceo_nm             		".trim(), length));
			String[] rgst_no             =  (JSPUtil.getParameter(request, "rgst_no            		".trim(), length));
			String[] tax_id              =  (JSPUtil.getParameter(request, "tax_id             		".trim(), length));
			String[] prnt_cnt_cd         =  (JSPUtil.getParameter(request, "prnt_cnt_cd        		".trim(), length));
			String[] prnt_vndr_seq       =  (JSPUtil.getParameter(request, "prnt_vndr_seq      		".trim(), length));
			String[] dcgo_hndl_flg       =  (JSPUtil.getParameter(request, "dcgo_hndl_flg      		".trim(), length));
			String[] svc_scp_cd_nm       =  (JSPUtil.getParameter(request, "svc_scp_cd_nm      		".trim(), length));
			String[] svc_prd_tp_nm       =  (JSPUtil.getParameter(request, "svc_prd_tp_nm      		".trim(), length));
			String[] svc_prd_rmk         =  (JSPUtil.getParameter(request, "svc_prd_rmk        		".trim(), length));
			String[] bzct_nm             =  (JSPUtil.getParameter(request, "bzct_nm            		".trim(), length));
			String[] bztp_nm             =  (JSPUtil.getParameter(request, "bztp_nm            		".trim(), length));
			String[] gen_pay_term_cd     =  (JSPUtil.getParameter(request, "gen_pay_term_cd    		".trim(), length));
			String[] eng_addr            =  (JSPUtil.getParameter(request, "eng_addr           		".trim(), length));
			String[] locl_lang_addr1     =  (JSPUtil.getParameter(request, "locl_lang_addr1    		".trim(), length));
			String[] locl_lang_addr2     =  (JSPUtil.getParameter(request, "locl_lang_addr2    		".trim(), length));
			String[] locl_lang_addr3     =  (JSPUtil.getParameter(request, "locl_lang_addr3    		".trim(), length));
			String[] locl_lang_addr4     =  (JSPUtil.getParameter(request, "locl_lang_addr4    		".trim(), length));
			String[] zip_cd              =  (JSPUtil.getParameter(request, "zip_cd             		".trim(), length));
			String[] cntc_pson_nm        =  (JSPUtil.getParameter(request, "cntc_pson_nm       		".trim(), length));
			String[] inv_curr_cd         =  (JSPUtil.getParameter(request, "inv_curr_cd        		".trim(), length));
			String[] pay_curr_cd         =  (JSPUtil.getParameter(request, "pay_curr_cd        		".trim(), length));
			String[] pay_mzd_cd          =  (JSPUtil.getParameter(request, "pay_mzd_cd         		".trim(), length));
			String[] usa_edi_cd          =  (JSPUtil.getParameter(request, "usa_edi_cd         		".trim(), length));
			String[] wo_atch_file_flg    =  (JSPUtil.getParameter(request, "wo_atch_file_flg   		".trim(), length));
			String[] wo_edi_use_flg      =  (JSPUtil.getParameter(request, "wo_edi_use_flg     		".trim(), length));
			String[] inv_edi_use_flg     =  (JSPUtil.getParameter(request, "inv_edi_use_flg    		".trim(), length));
			String[] mty_rro_edi_use_flg =  (JSPUtil.getParameter(request, "mty_rro_edi_use_flg		".trim(), length));
			String[] blk_vndr_svc_cd     =  (JSPUtil.getParameter(request, "blk_vndr_svc_cd    		".trim(), length));
			String[] subs_co_cd          =  (JSPUtil.getParameter(request, "subs_co_cd         		".trim(), length));
			String[] otr_flg             =  (JSPUtil.getParameter(request, "otr_flg            		".trim(), length));
			String[] vndr_ofc_cd         =  (JSPUtil.getParameter(request, "vndr_ofc_cd        		".trim(), length));
			String[] modi_vndr_seq       =  (JSPUtil.getParameter(request, "modi_vndr_seq      		".trim(), length));
			String[] cre_usr_id          =  (JSPUtil.getParameter(request, "cre_usr_id         		".trim(), length));
			String[] cre_dt              =  (JSPUtil.getParameter(request, "cre_dt             		".trim(), length));
			String[] upd_usr_id          =  (JSPUtil.getParameter(request, "upd_usr_id         		".trim(), length));
			String[] upd_dt              =  (JSPUtil.getParameter(request, "upd_dt             		".trim(), length));
			String[] delt_flg            =  (JSPUtil.getParameter(request, "delt_flg           		".trim(), length));
			String[] eai_evnt_dt         =  (JSPUtil.getParameter(request, "eai_evnt_dt        		".trim(), length));
			String[] rfnd_psdo_cust_cd   =  (JSPUtil.getParameter(request, "rfnd_psdo_cust_cd       ".trim(), length));
			String[] pay_term_tp_cd      =  (JSPUtil.getParameter(request, "pay_term_tp_cd          ".trim(), length));
			String[] chk_de_addr1    	 =  (JSPUtil.getParameter(request, "chk_de_addr1 			".trim(), length));
			String[] chk_de_addr2    	 =  (JSPUtil.getParameter(request, "chk_de_addr2 			".trim(), length));
			String[] chk_de_addr3    	 =  (JSPUtil.getParameter(request, "chk_de_addr3 			".trim(), length));
			String[] chk_de_cty_nm   	 =  (JSPUtil.getParameter(request, "chk_de_cty_nm			".trim(), length));
			String[] chk_de_ste_cd   	 =  (JSPUtil.getParameter(request, "chk_de_ste_cd			".trim(), length));
			String[] chk_de_zip_cd   	 =  (JSPUtil.getParameter(request, "chk_de_zip_cd			".trim(), length));
			String[] chk_de_cnt_cd    	 =  (JSPUtil.getParameter(request, "chk_de_cnt_cd			".trim(), length));			
			
			for (int i = 0; i < length; i++) {
				model = new MdmVendorMaster();
				model.setIbflag             		  (ibflag             	[i]);
				model.setPage_rows          		  (page_rows          	[i]);
				model.setVndr_seq           		  (vndr_seq           	[i]);
				model.setVndr_cnt_cd        		  (vndr_cnt_cd        	[i]);
				model.setVndr_lgl_eng_nm    		  (vndr_lgl_eng_nm    	[i]);
				model.setVndr_locl_lang_nm  		  (vndr_locl_lang_nm  	[i]);
				model.setVndr_abbr_nm       		  (vndr_abbr_nm       	[i]);
				model.setLgs_flg            		  (lgs_flg            	[i]);
				model.setProcu_flg          		  (procu_flg          	[i]);
				model.setTeam_flg           		  (team_flg           	[i]);
				model.setFinc_flg           		  (finc_flg           	[i]);
				model.setBlk_flg            		  (blk_flg            	[i]);
				model.setInter_co_flg       		  (inter_co_flg       	[i]);
				model.setLoc_cd             		  (loc_cd             	[i]);
				model.setOfc_cd             		  (ofc_cd             	[i]);
				model.setCeo_nm             		  (ceo_nm             	[i]);
				model.setRgst_no            		  (rgst_no            	[i]);
				model.setTax_id             		  (tax_id             	[i]);
				model.setPrnt_cnt_cd        		  (prnt_cnt_cd        	[i]);
				model.setPrnt_vndr_seq      		  (prnt_vndr_seq      	[i]);
				model.setDcgo_hndl_flg      		  (dcgo_hndl_flg      	[i]);
				model.setSvc_scp_cd_nm      		  (svc_scp_cd_nm      	[i]);
				model.setSvc_prd_tp_nm      		  (svc_prd_tp_nm      	[i]);
				model.setSvc_prd_rmk        		  (svc_prd_rmk        	[i]);
				model.setBzct_nm            		  (bzct_nm            	[i]);
				model.setBztp_nm            		  (bztp_nm            	[i]);
				model.setGen_pay_term_cd    		  (gen_pay_term_cd    	[i]);
				model.setEng_addr           		  (eng_addr           	[i]);
				model.setLocl_lang_addr1     		  (locl_lang_addr1     	[i]);
				model.setLocl_lang_addr2     		  (locl_lang_addr2     	[i]);
				model.setLocl_lang_addr3     		  (locl_lang_addr3     	[i]);
				model.setLocl_lang_addr4     		  (locl_lang_addr4     	[i]);
				model.setZip_cd             		  (zip_cd             	[i]);
				model.setCntc_pson_nm       		  (cntc_pson_nm       	[i]);
				model.setInv_curr_cd        		  (inv_curr_cd        	[i]);
				model.setPay_curr_cd        		  (pay_curr_cd        	[i]);
				model.setPay_mzd_cd         		  (pay_mzd_cd         	[i]);
				model.setUsa_edi_cd         		  (usa_edi_cd         	[i]);
				model.setWo_atch_file_flg   		  (wo_atch_file_flg   	[i]);
				model.setWo_edi_use_flg     		  (wo_edi_use_flg     	[i]);
				model.setInv_edi_use_flg    		  (inv_edi_use_flg    	[i]);
				model.setMty_rro_edi_use_flg		  (mty_rro_edi_use_flg	[i]);
				model.setBlk_vndr_svc_cd    		  (blk_vndr_svc_cd    	[i]);
				model.setSubs_co_cd         		  (subs_co_cd         	[i]);
				model.setOtr_flg            		  (otr_flg            	[i]);
				model.setVndr_ofc_cd        		  (vndr_ofc_cd        	[i]);
				model.setModi_vndr_seq      		  (modi_vndr_seq      	[i]);
				model.setCre_usr_id         		  (cre_usr_id         	[i]);
				model.setCre_dt             		  (cre_dt             	[i]);
				model.setUpd_usr_id         		  (upd_usr_id         	[i]);
				model.setUpd_dt             		  (upd_dt             	[i]);
				model.setDelt_flg           		  (delt_flg           	[i]);
				model.setEai_evnt_dt        		  (eai_evnt_dt        	[i]);
				model.setRfnd_psdo_cust_cd            (rfnd_psdo_cust_cd	[i]);
				model.setPay_term_tp_cd               (pay_term_tp_cd		[i]);
				model.setChk_de_addr1	  		  	  (chk_de_addr1   		[i]);
				model.setChk_de_addr2	  		  	  (chk_de_addr2   		[i]);
				model.setChk_de_addr3     		  	  (chk_de_addr3   		[i]);
				model.setChk_de_cty_nm    		  	  (chk_de_cty_nm  		[i]);
				model.setChk_de_ste_cd    		  	  (chk_de_ste_cd  		[i]);
				model.setChk_de_zip_cd    		  	  (chk_de_zip_cd  		[i]);
				model.setChk_de_cnt_cd    		   	  (chk_de_cnt_cd  		[i]);
				
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		MdmVendorMaster model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag              =  (JSPUtil.getParameter(request, prefix + "ibflag             		".trim(), length));
			String[] page_rows           =  (JSPUtil.getParameter(request, prefix + "page_rows          		".trim(), length));
			String[] vndr_seq            =  (JSPUtil.getParameter(request, prefix + "vndr_seq           		".trim(), length));
			String[] vndr_cnt_cd         =  (JSPUtil.getParameter(request, prefix + "vndr_cnt_cd        		".trim(), length));
			String[] vndr_lgl_eng_nm     =  (JSPUtil.getParameter(request, prefix + "vndr_lgl_eng_nm    		".trim(), length));
			String[] vndr_locl_lang_nm   =  (JSPUtil.getParameter(request, prefix + "vndr_locl_lang_nm  		".trim(), length));
			String[] vndr_abbr_nm        =  (JSPUtil.getParameter(request, prefix + "vndr_abbr_nm       		".trim(), length));
			String[] lgs_flg             =  (JSPUtil.getParameter(request, prefix + "lgs_flg            		".trim(), length));
			String[] procu_flg           =  (JSPUtil.getParameter(request, prefix + "procu_flg          		".trim(), length));
			String[] team_flg            =  (JSPUtil.getParameter(request, prefix + "team_flg           		".trim(), length));
			String[] finc_flg            =  (JSPUtil.getParameter(request, prefix + "finc_flg           		".trim(), length));
			String[] blk_flg             =  (JSPUtil.getParameter(request, prefix + "blk_flg            		".trim(), length));
			String[] inter_co_flg        =  (JSPUtil.getParameter(request, prefix + "inter_co_flg       		".trim(), length));
			String[] loc_cd              =  (JSPUtil.getParameter(request, prefix + "loc_cd             		".trim(), length));
			String[] ofc_cd              =  (JSPUtil.getParameter(request, prefix + "ofc_cd             		".trim(), length));
			String[] ceo_nm              =  (JSPUtil.getParameter(request, prefix + "ceo_nm             		".trim(), length));
			String[] rgst_no             =  (JSPUtil.getParameter(request, prefix + "rgst_no            		".trim(), length));
			String[] tax_id              =  (JSPUtil.getParameter(request, prefix + "tax_id             		".trim(), length));
			String[] prnt_cnt_cd         =  (JSPUtil.getParameter(request, prefix + "prnt_cnt_cd        		".trim(), length));
			String[] prnt_vndr_seq       =  (JSPUtil.getParameter(request, prefix + "prnt_vndr_seq      		".trim(), length));
			String[] dcgo_hndl_flg       =  (JSPUtil.getParameter(request, prefix + "dcgo_hndl_flg      		".trim(), length));
			String[] svc_scp_cd_nm       =  (JSPUtil.getParameter(request, prefix + "svc_scp_cd_nm      		".trim(), length));
			String[] svc_prd_tp_nm       =  (JSPUtil.getParameter(request, prefix + "svc_prd_tp_nm      		".trim(), length));
			String[] svc_prd_rmk         =  (JSPUtil.getParameter(request, prefix + "svc_prd_rmk        		".trim(), length));
			String[] bzct_nm             =  (JSPUtil.getParameter(request, prefix + "bzct_nm            		".trim(), length));
			String[] bztp_nm             =  (JSPUtil.getParameter(request, prefix + "bztp_nm            		".trim(), length));
			String[] gen_pay_term_cd     =  (JSPUtil.getParameter(request, prefix + "gen_pay_term_cd    		".trim(), length));
			String[] eng_addr            =  (JSPUtil.getParameter(request, prefix + "eng_addr           		".trim(), length));
			String[] locl_lang_addr1     =  (JSPUtil.getParameter(request, prefix + "locl_lang_addr1     		".trim(), length));
			String[] locl_lang_addr2     =  (JSPUtil.getParameter(request, prefix + "locl_lang_addr2     		".trim(), length));
			String[] locl_lang_addr3     =  (JSPUtil.getParameter(request, prefix + "locl_lang_addr3     		".trim(), length));
			String[] locl_lang_addr4     =  (JSPUtil.getParameter(request, prefix + "locl_lang_addr4     		".trim(), length));
			String[] zip_cd              =  (JSPUtil.getParameter(request, prefix + "zip_cd             		".trim(), length));
			String[] cntc_pson_nm        =  (JSPUtil.getParameter(request, prefix + "cntc_pson_nm       		".trim(), length));
			String[] inv_curr_cd         =  (JSPUtil.getParameter(request, prefix + "inv_curr_cd        		".trim(), length));
			String[] pay_curr_cd         =  (JSPUtil.getParameter(request, prefix + "pay_curr_cd        		".trim(), length));
			String[] pay_mzd_cd          =  (JSPUtil.getParameter(request, prefix + "pay_mzd_cd         		".trim(), length));
			String[] usa_edi_cd          =  (JSPUtil.getParameter(request, prefix + "usa_edi_cd         		".trim(), length));
			String[] wo_atch_file_flg    =  (JSPUtil.getParameter(request, prefix + "wo_atch_file_flg   		".trim(), length));
			String[] wo_edi_use_flg      =  (JSPUtil.getParameter(request, prefix + "wo_edi_use_flg     		".trim(), length));
			String[] inv_edi_use_flg     =  (JSPUtil.getParameter(request, prefix + "inv_edi_use_flg    		".trim(), length));
			String[] mty_rro_edi_use_flg =  (JSPUtil.getParameter(request, prefix + "mty_rro_edi_use_flg		".trim(), length));
			String[] blk_vndr_svc_cd     =  (JSPUtil.getParameter(request, prefix + "blk_vndr_svc_cd    		".trim(), length));
			String[] subs_co_cd          =  (JSPUtil.getParameter(request, prefix + "subs_co_cd         		".trim(), length));
			String[] otr_flg             =  (JSPUtil.getParameter(request, prefix + "otr_flg            		".trim(), length));
			String[] vndr_ofc_cd         =  (JSPUtil.getParameter(request, prefix + "vndr_ofc_cd        		".trim(), length));
			String[] modi_vndr_seq       =  (JSPUtil.getParameter(request, prefix + "modi_vndr_seq      		".trim(), length));
			String[] cre_usr_id          =  (JSPUtil.getParameter(request, prefix + "cre_usr_id         		".trim(), length));
			String[] cre_dt              =  (JSPUtil.getParameter(request, prefix + "cre_dt             		".trim(), length));
			String[] upd_usr_id          =  (JSPUtil.getParameter(request, prefix + "upd_usr_id         		".trim(), length));
			String[] upd_dt              =  (JSPUtil.getParameter(request, prefix + "upd_dt             		".trim(), length));
			String[] delt_flg            =  (JSPUtil.getParameter(request, prefix + "delt_flg           		".trim(), length));
			String[] eai_evnt_dt         =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt        		".trim(), length));
			String[] rfnd_psdo_cust_cd   =  (JSPUtil.getParameter(request, prefix + "rfnd_psdo_cust_cd          ".trim(), length));
			String[] pay_term_tp_cd      =  (JSPUtil.getParameter(request, prefix + "pay_term_tp_cd             ".trim(), length));
			String[] chk_de_addr1    	 =  (JSPUtil.getParameter(request, prefix + "chk_de_addr1   			".trim(), length));
			String[] chk_de_addr2    	 =  (JSPUtil.getParameter(request, prefix + "chk_de_addr2   			".trim(), length));
			String[] chk_de_addr3    	 =  (JSPUtil.getParameter(request, prefix + "chk_de_addr3   			".trim(), length));
			String[] chk_de_cty_nm   	 =  (JSPUtil.getParameter(request, prefix + "chk_de_cty_nm  			".trim(), length));
			String[] chk_de_ste_cd   	 =  (JSPUtil.getParameter(request, prefix + "chk_de_ste_cd  			".trim(), length));
			String[] chk_de_zip_cd   	 =  (JSPUtil.getParameter(request, prefix + "chk_de_zip_cd  			".trim(), length));
			String[] chk_de_cnt_cd   	 =  (JSPUtil.getParameter(request, prefix + "chk_de_cnt_cd  			".trim(), length));			
			
			for (int i = 0; i < length; i++) {
				model = new MdmVendorMaster();
				model.setIbflag             		  ( ibflag             	[i]);
				model.setPage_rows          		  ( page_rows          	[i]);
				model.setVndr_seq           		  ( vndr_seq           	[i]);
				model.setVndr_cnt_cd        		  ( vndr_cnt_cd        	[i]);
				model.setVndr_lgl_eng_nm    		  ( vndr_lgl_eng_nm    	[i]);
				model.setVndr_locl_lang_nm  		  ( vndr_locl_lang_nm  	[i]);
				model.setVndr_abbr_nm       		  ( vndr_abbr_nm       	[i]);
				model.setLgs_flg            		  ( lgs_flg            	[i]);
				model.setProcu_flg          		  ( procu_flg          	[i]);
				model.setTeam_flg           		  ( team_flg           	[i]);
				model.setFinc_flg           		  ( finc_flg           	[i]);
				model.setBlk_flg            		  ( blk_flg            	[i]);
				model.setInter_co_flg       		  ( inter_co_flg       	[i]);
				model.setLoc_cd             		  ( loc_cd             	[i]);
				model.setOfc_cd             		  ( ofc_cd             	[i]);
				model.setCeo_nm             		  ( ceo_nm             	[i]);
				model.setRgst_no            		  ( rgst_no            	[i]);
				model.setTax_id             		  ( tax_id             	[i]);
				model.setPrnt_cnt_cd        		  ( prnt_cnt_cd        	[i]);
				model.setPrnt_vndr_seq      		  ( prnt_vndr_seq      	[i]);
				model.setDcgo_hndl_flg      		  ( dcgo_hndl_flg      	[i]);
				model.setSvc_scp_cd_nm      		  ( svc_scp_cd_nm      	[i]);
				model.setSvc_prd_tp_nm      		  ( svc_prd_tp_nm      	[i]);
				model.setSvc_prd_rmk        		  ( svc_prd_rmk        	[i]);
				model.setBzct_nm            		  ( bzct_nm            	[i]);
				model.setBztp_nm            		  ( bztp_nm            	[i]);
				model.setGen_pay_term_cd    		  ( gen_pay_term_cd    	[i]);
				model.setEng_addr           		  ( eng_addr           	[i]);
				model.setLocl_lang_addr1     		  ( locl_lang_addr1    	[i]);
				model.setLocl_lang_addr2     		  ( locl_lang_addr2    	[i]);
				model.setLocl_lang_addr3     		  ( locl_lang_addr3    	[i]);
				model.setLocl_lang_addr4     		  ( locl_lang_addr4    	[i]);
				model.setZip_cd             		  ( zip_cd             	[i]);
				model.setCntc_pson_nm       		  ( cntc_pson_nm       	[i]);
				model.setInv_curr_cd        		  ( inv_curr_cd        	[i]);
				model.setPay_curr_cd        		  ( pay_curr_cd        	[i]);
				model.setPay_mzd_cd         		  ( pay_mzd_cd         	[i]);
				model.setUsa_edi_cd         		  ( usa_edi_cd         	[i]);
				model.setWo_atch_file_flg   		  ( wo_atch_file_flg   	[i]);
				model.setWo_edi_use_flg     		  ( wo_edi_use_flg     	[i]);
				model.setInv_edi_use_flg    		  ( inv_edi_use_flg    	[i]);
				model.setMty_rro_edi_use_flg		  ( mty_rro_edi_use_flg	[i]);
				model.setBlk_vndr_svc_cd    		  ( blk_vndr_svc_cd    	[i]);
				model.setSubs_co_cd         		  ( subs_co_cd         	[i]);
				model.setOtr_flg            		  ( otr_flg            	[i]);
				model.setVndr_ofc_cd        		  ( vndr_ofc_cd        	[i]);
				model.setModi_vndr_seq      		  ( modi_vndr_seq      	[i]);
				model.setCre_usr_id         		  ( cre_usr_id         	[i]);
				model.setCre_dt             		  ( cre_dt             	[i]);
				model.setUpd_usr_id         		  ( upd_usr_id         	[i]);
				model.setUpd_dt             		  ( upd_dt             	[i]);
				model.setDelt_flg           		  ( delt_flg           	[i]);
				model.setEai_evnt_dt        		  ( eai_evnt_dt        	[i]);
				model.setRfnd_psdo_cust_cd			  ( rfnd_psdo_cust_cd   [i]);
				model.setPay_term_tp_cd			  	  ( pay_term_tp_cd    	[i]);
				model.setChk_de_addr1	  		  	  ( chk_de_addr1   		[i]);
				model.setChk_de_addr2	  		  	  ( chk_de_addr2   		[i]);
				model.setChk_de_addr3     		  	  ( chk_de_addr3   		[i]);
				model.setChk_de_cty_nm    		  	  ( chk_de_cty_nm  		[i]);
				model.setChk_de_ste_cd    		  	  ( chk_de_ste_cd  		[i]);
				model.setChk_de_zip_cd    		  	  ( chk_de_zip_cd  		[i]);
				model.setChk_de_cnt_cd    		  	  ( chk_de_cnt_cd  		[i]);				
				
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
