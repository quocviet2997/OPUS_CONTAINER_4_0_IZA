/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : SSC_RFA_GEN.java
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
public final class SSC_RFA_GEN implements java.io.Serializable {

	private String          ibflag          = "";
	private String          page_rows       = "";
	private String          ofc_pfx_cd      = "";
	private String          ofc_qttn_seq    = "";
	private String          rfa_pfx_ofc_cd  = "";
	private String          rfa_seq         = "";
	private String          rfa_sts_cd      = "";
	private String          sls_ofc_cd      = "";
	private String          srep_cd         = "";
	private String          fnl_auth_ofc_cd = "";
	private String          fnl_auth_usr_id = "";
	private String          sc_no           = "";
	private String          cgo_tp_cd       = "";
	private String          cgo_dtl_itm_flg = "";
	private String          cmdt_cd         = "";
	private String          desc_cmdt_no    = "";
	private String          cmdt_desc       = "";
	private String          rep_cmdt_cd     = "";
	private String          conf_cmdt_cd    = "";
	private String          estm_teu_sz_qty = "";
	private String          estm_feu_sz_qty = "";
	private String          cgo_ttl_wgt     = "";
	private String          meas_ut_cd      = "";
	private String          svc_scp_cd      = "";
	private String          ttl_cgo_feu_qty = "";
	private String          pay_term_cd     = "";
	private String          eff_fm_dt       = "";
	private String          eff_to_dt       = "";
	private String          rfa_auth_dt     = "";
	private String          rfa_file_dt     = "";
	private String          rfa_cxl_dt      = "";
	private String          rfa_cxl_flg     = "";
	private String          cre_dt          = "";
	private String          upd_dt          = "";
	private String          cre_usr_id      = "";
	private String          rar_auth_no     = "";
	private String          cre_svr_id      = "";
	private String          repl_flg        = "";
	private String          trf_itm_no      = "";
	private String          trf_line_itm_no = "";
	private String          srep_nm         = "";
	private String          dup_flg         = "";
	private String          rfa_auth_no     = "";
	private String          rfa_file_flg    = "";
	private String          nis_evnt_dt     = "";
	private String          bis_flg         = "";
	private String          eai_evnt_dt     = "";

	public SSC_RFA_GEN(){}

	public SSC_RFA_GEN(
			String          ibflag         ,
			String          page_rows      ,
			String          ofc_pfx_cd     ,
			String          ofc_qttn_seq   ,
			String          rfa_pfx_ofc_cd ,
			String          rfa_seq        ,
			String          rfa_sts_cd     ,
			String          sls_ofc_cd     ,
			String          srep_cd        ,
			String          fnl_auth_ofc_cd,
			String          fnl_auth_usr_id,
			String          sc_no          ,
			String          cgo_tp_cd      ,
			String          cgo_dtl_itm_flg,
			String          cmdt_cd        ,
			String          desc_cmdt_no   ,
			String          cmdt_desc      ,
			String          rep_cmdt_cd    ,
			String          conf_cmdt_cd   ,
			String          estm_teu_sz_qty,
			String          estm_feu_sz_qty,
			String          cgo_ttl_wgt    ,
			String          meas_ut_cd     ,
			String          svc_scp_cd     ,
			String          ttl_cgo_feu_qty,
			String          pay_term_cd    ,
			String          eff_fm_dt      ,
			String          eff_to_dt      ,
			String          rfa_auth_dt    ,
			String          rfa_file_dt    ,
			String          rfa_cxl_dt     ,
			String          rfa_cxl_flg    ,
			String          cre_dt         ,
			String          upd_dt         ,
			String          cre_usr_id     ,
			String          rar_auth_no    ,
			String          cre_svr_id     ,
			String          repl_flg       ,
			String          trf_itm_no     ,
			String          trf_line_itm_no,
			String          srep_nm        ,
			String          dup_flg        ,
			String          rfa_auth_no    ,
			String          rfa_file_flg   ,
			String          nis_evnt_dt    ,
			String          bis_flg        ,
			String          eai_evnt_dt    ){
		this.ibflag          = ibflag         ;
		this.page_rows       = page_rows      ;
		this.ofc_pfx_cd      = ofc_pfx_cd     ;
		this.ofc_qttn_seq    = ofc_qttn_seq   ;
		this.rfa_pfx_ofc_cd  = rfa_pfx_ofc_cd ;
		this.rfa_seq         = rfa_seq        ;
		this.rfa_sts_cd      = rfa_sts_cd     ;
		this.sls_ofc_cd      = sls_ofc_cd     ;
		this.srep_cd         = srep_cd        ;
		this.fnl_auth_ofc_cd = fnl_auth_ofc_cd;
		this.fnl_auth_usr_id = fnl_auth_usr_id;
		this.sc_no           = sc_no          ;
		this.cgo_tp_cd       = cgo_tp_cd      ;
		this.cgo_dtl_itm_flg = cgo_dtl_itm_flg;
		this.cmdt_cd         = cmdt_cd        ;
		this.desc_cmdt_no    = desc_cmdt_no   ;
		this.cmdt_desc       = cmdt_desc      ;
		this.rep_cmdt_cd     = rep_cmdt_cd    ;
		this.conf_cmdt_cd    = conf_cmdt_cd   ;
		this.estm_teu_sz_qty = estm_teu_sz_qty;
		this.estm_feu_sz_qty = estm_feu_sz_qty;
		this.cgo_ttl_wgt     = cgo_ttl_wgt    ;
		this.meas_ut_cd      = meas_ut_cd     ;
		this.svc_scp_cd      = svc_scp_cd     ;
		this.ttl_cgo_feu_qty = ttl_cgo_feu_qty;
		this.pay_term_cd     = pay_term_cd    ;
		this.eff_fm_dt       = eff_fm_dt      ;
		this.eff_to_dt       = eff_to_dt      ;
		this.rfa_auth_dt     = rfa_auth_dt    ;
		this.rfa_file_dt     = rfa_file_dt    ;
		this.rfa_cxl_dt      = rfa_cxl_dt     ;
		this.rfa_cxl_flg     = rfa_cxl_flg    ;
		this.cre_dt          = cre_dt         ;
		this.upd_dt          = upd_dt         ;
		this.cre_usr_id      = cre_usr_id     ;
		this.rar_auth_no     = rar_auth_no    ;
		this.cre_svr_id      = cre_svr_id     ;
		this.repl_flg        = repl_flg       ;
		this.trf_itm_no      = trf_itm_no     ;
		this.trf_line_itm_no = trf_line_itm_no;
		this.srep_nm         = srep_nm        ;
		this.dup_flg         = dup_flg        ;
		this.rfa_auth_no     = rfa_auth_no    ;
		this.rfa_file_flg    = rfa_file_flg   ;
		this.nis_evnt_dt     = nis_evnt_dt    ;
		this.bis_flg         = bis_flg        ;
		this.eai_evnt_dt     = eai_evnt_dt    ;
	}

	// getter method is proceeding ..
	public String          getIbflag         (){	return ibflag         	;	}
	public String          getPage_rows      (){	return page_rows      	;	}
	public String          getOfc_pfx_cd     (){	return ofc_pfx_cd     	;	}
	public String          getOfc_qttn_seq   (){	return ofc_qttn_seq   	;	}
	public String          getRfa_pfx_ofc_cd (){	return rfa_pfx_ofc_cd 	;	}
	public String          getRfa_seq        (){	return rfa_seq        	;	}
	public String          getRfa_sts_cd     (){	return rfa_sts_cd     	;	}
	public String          getSls_ofc_cd     (){	return sls_ofc_cd     	;	}
	public String          getSrep_cd        (){	return srep_cd        	;	}
	public String          getFnl_auth_ofc_cd(){	return fnl_auth_ofc_cd	;	}
	public String          getFnl_auth_usr_id(){	return fnl_auth_usr_id	;	}
	public String          getSc_no          (){	return sc_no          	;	}
	public String          getCgo_tp_cd      (){	return cgo_tp_cd      	;	}
	public String          getCgo_dtl_itm_flg(){	return cgo_dtl_itm_flg	;	}
	public String          getCmdt_cd        (){	return cmdt_cd        	;	}
	public String          getDesc_cmdt_no   (){	return desc_cmdt_no   	;	}
	public String          getCmdt_desc      (){	return cmdt_desc      	;	}
	public String          getRep_cmdt_cd    (){	return rep_cmdt_cd    	;	}
	public String          getConf_cmdt_cd   (){	return conf_cmdt_cd   	;	}
	public String          getEstm_teu_sz_qty(){	return estm_teu_sz_qty	;	}
	public String          getEstm_feu_sz_qty(){	return estm_feu_sz_qty	;	}
	public String          getCgo_ttl_wgt    (){	return cgo_ttl_wgt    	;	}
	public String          getMeas_ut_cd     (){	return meas_ut_cd     	;	}
	public String          getSvc_scp_cd     (){	return svc_scp_cd     	;	}
	public String          getTtl_cgo_feu_qty(){	return ttl_cgo_feu_qty	;	}
	public String          getPay_term_cd    (){	return pay_term_cd    	;	}
	public String          getEff_fm_dt      (){	return eff_fm_dt      	;	}
	public String          getEff_to_dt      (){	return eff_to_dt      	;	}
	public String          getRfa_auth_dt    (){	return rfa_auth_dt    	;	}
	public String          getRfa_file_dt    (){	return rfa_file_dt    	;	}
	public String          getRfa_cxl_dt     (){	return rfa_cxl_dt     	;	}
	public String          getRfa_cxl_flg    (){	return rfa_cxl_flg    	;	}
	public String          getCre_dt         (){	return cre_dt         	;	}
	public String          getUpd_dt         (){	return upd_dt         	;	}
	public String          getCre_usr_id     (){	return cre_usr_id     	;	}
	public String          getRar_auth_no    (){	return rar_auth_no    	;	}
	public String          getCre_svr_id     (){	return cre_svr_id     	;	}
	public String          getRepl_flg       (){	return repl_flg       	;	}
	public String          getTrf_itm_no     (){	return trf_itm_no     	;	}
	public String          getTrf_line_itm_no(){	return trf_line_itm_no	;	}
	public String          getSrep_nm        (){	return srep_nm        	;	}
	public String          getDup_flg        (){	return dup_flg        	;	}
	public String          getRfa_auth_no    (){	return rfa_auth_no    	;	}
	public String          getRfa_file_flg   (){	return rfa_file_flg   	;	}
	public String          getNis_evnt_dt    (){	return nis_evnt_dt    	;	}
	public String          getBis_flg        (){	return bis_flg        	;	}
	public String          getEai_evnt_dt    (){	return eai_evnt_dt    	;	}

	// setter method is proceeding ..
	public void setIbflag         ( String          ibflag          ){	this.ibflag          = ibflag         	;	}
	public void setPage_rows      ( String          page_rows       ){	this.page_rows       = page_rows      	;	}
	public void setOfc_pfx_cd     ( String          ofc_pfx_cd      ){	this.ofc_pfx_cd      = ofc_pfx_cd     	;	}
	public void setOfc_qttn_seq   ( String          ofc_qttn_seq    ){	this.ofc_qttn_seq    = ofc_qttn_seq   	;	}
	public void setRfa_pfx_ofc_cd ( String          rfa_pfx_ofc_cd  ){	this.rfa_pfx_ofc_cd  = rfa_pfx_ofc_cd 	;	}
	public void setRfa_seq        ( String          rfa_seq         ){	this.rfa_seq         = rfa_seq        	;	}
	public void setRfa_sts_cd     ( String          rfa_sts_cd      ){	this.rfa_sts_cd      = rfa_sts_cd     	;	}
	public void setSls_ofc_cd     ( String          sls_ofc_cd      ){	this.sls_ofc_cd      = sls_ofc_cd     	;	}
	public void setSrep_cd        ( String          srep_cd         ){	this.srep_cd         = srep_cd        	;	}
	public void setFnl_auth_ofc_cd( String          fnl_auth_ofc_cd ){	this.fnl_auth_ofc_cd = fnl_auth_ofc_cd	;	}
	public void setFnl_auth_usr_id( String          fnl_auth_usr_id ){	this.fnl_auth_usr_id = fnl_auth_usr_id	;	}
	public void setSc_no          ( String          sc_no           ){	this.sc_no           = sc_no          	;	}
	public void setCgo_tp_cd      ( String          cgo_tp_cd       ){	this.cgo_tp_cd       = cgo_tp_cd      	;	}
	public void setCgo_dtl_itm_flg( String          cgo_dtl_itm_flg ){	this.cgo_dtl_itm_flg = cgo_dtl_itm_flg	;	}
	public void setCmdt_cd        ( String          cmdt_cd         ){	this.cmdt_cd         = cmdt_cd        	;	}
	public void setDesc_cmdt_no   ( String          desc_cmdt_no    ){	this.desc_cmdt_no    = desc_cmdt_no   	;	}
	public void setCmdt_desc      ( String          cmdt_desc       ){	this.cmdt_desc       = cmdt_desc      	;	}
	public void setRep_cmdt_cd    ( String          rep_cmdt_cd     ){	this.rep_cmdt_cd     = rep_cmdt_cd    	;	}
	public void setConf_cmdt_cd   ( String          conf_cmdt_cd    ){	this.conf_cmdt_cd    = conf_cmdt_cd   	;	}
	public void setEstm_teu_sz_qty( String          estm_teu_sz_qty ){	this.estm_teu_sz_qty = estm_teu_sz_qty	;	}
	public void setEstm_feu_sz_qty( String          estm_feu_sz_qty ){	this.estm_feu_sz_qty = estm_feu_sz_qty	;	}
	public void setCgo_ttl_wgt    ( String          cgo_ttl_wgt     ){	this.cgo_ttl_wgt     = cgo_ttl_wgt    	;	}
	public void setMeas_ut_cd     ( String          meas_ut_cd      ){	this.meas_ut_cd      = meas_ut_cd     	;	}
	public void setSvc_scp_cd     ( String          svc_scp_cd      ){	this.svc_scp_cd      = svc_scp_cd     	;	}
	public void setTtl_cgo_feu_qty( String          ttl_cgo_feu_qty ){	this.ttl_cgo_feu_qty = ttl_cgo_feu_qty	;	}
	public void setPay_term_cd    ( String          pay_term_cd     ){	this.pay_term_cd     = pay_term_cd    	;	}
	public void setEff_fm_dt      ( String          eff_fm_dt       ){	this.eff_fm_dt       = eff_fm_dt      	;	}
	public void setEff_to_dt      ( String          eff_to_dt       ){	this.eff_to_dt       = eff_to_dt      	;	}
	public void setRfa_auth_dt    ( String          rfa_auth_dt     ){	this.rfa_auth_dt     = rfa_auth_dt    	;	}
	public void setRfa_file_dt    ( String          rfa_file_dt     ){	this.rfa_file_dt     = rfa_file_dt    	;	}
	public void setRfa_cxl_dt     ( String          rfa_cxl_dt      ){	this.rfa_cxl_dt      = rfa_cxl_dt     	;	}
	public void setRfa_cxl_flg    ( String          rfa_cxl_flg     ){	this.rfa_cxl_flg     = rfa_cxl_flg    	;	}
	public void setCre_dt         ( String          cre_dt          ){	this.cre_dt          = cre_dt         	;	}
	public void setUpd_dt         ( String          upd_dt          ){	this.upd_dt          = upd_dt         	;	}
	public void setCre_usr_id     ( String          cre_usr_id      ){	this.cre_usr_id      = cre_usr_id     	;	}
	public void setRar_auth_no    ( String          rar_auth_no     ){	this.rar_auth_no     = rar_auth_no    	;	}
	public void setCre_svr_id     ( String          cre_svr_id      ){	this.cre_svr_id      = cre_svr_id     	;	}
	public void setRepl_flg       ( String          repl_flg        ){	this.repl_flg        = repl_flg       	;	}
	public void setTrf_itm_no     ( String          trf_itm_no      ){	this.trf_itm_no      = trf_itm_no     	;	}
	public void setTrf_line_itm_no( String          trf_line_itm_no ){	this.trf_line_itm_no = trf_line_itm_no	;	}
	public void setSrep_nm        ( String          srep_nm         ){	this.srep_nm         = srep_nm        	;	}
	public void setDup_flg        ( String          dup_flg         ){	this.dup_flg         = dup_flg        	;	}
	public void setRfa_auth_no    ( String          rfa_auth_no     ){	this.rfa_auth_no     = rfa_auth_no    	;	}
	public void setRfa_file_flg   ( String          rfa_file_flg    ){	this.rfa_file_flg    = rfa_file_flg   	;	}
	public void setNis_evnt_dt    ( String          nis_evnt_dt     ){	this.nis_evnt_dt     = nis_evnt_dt    	;	}
	public void setBis_flg        ( String          bis_flg         ){	this.bis_flg         = bis_flg        	;	}
	public void setEai_evnt_dt    ( String          eai_evnt_dt     ){	this.eai_evnt_dt     = eai_evnt_dt    	;	}

	public static SSC_RFA_GEN fromRequest(HttpServletRequest request) {
		SSC_RFA_GEN model = new SSC_RFA_GEN();
		try {
			model.setIbflag         	(JSPUtil.getParameter(request, "ibflag         		".trim(), ""));
			model.setPage_rows      	(JSPUtil.getParameter(request, "page_rows      		".trim(), ""));
			model.setOfc_pfx_cd     	(JSPUtil.getParameter(request, "ofc_pfx_cd     		".trim(), ""));
			model.setOfc_qttn_seq   	(JSPUtil.getParameter(request, "ofc_qttn_seq   		".trim(), ""));
			model.setRfa_pfx_ofc_cd 	(JSPUtil.getParameter(request, "rfa_pfx_ofc_cd 		".trim(), ""));
			model.setRfa_seq        	(JSPUtil.getParameter(request, "rfa_seq        		".trim(), ""));
			model.setRfa_sts_cd     	(JSPUtil.getParameter(request, "rfa_sts_cd     		".trim(), ""));
			model.setSls_ofc_cd     	(JSPUtil.getParameter(request, "sls_ofc_cd     		".trim(), ""));
			model.setSrep_cd        	(JSPUtil.getParameter(request, "srep_cd        		".trim(), ""));
			model.setFnl_auth_ofc_cd	(JSPUtil.getParameter(request, "fnl_auth_ofc_cd		".trim(), ""));
			model.setFnl_auth_usr_id	(JSPUtil.getParameter(request, "fnl_auth_usr_id		".trim(), ""));
			model.setSc_no          	(JSPUtil.getParameter(request, "sc_no          		".trim(), ""));
			model.setCgo_tp_cd      	(JSPUtil.getParameter(request, "cgo_tp_cd      		".trim(), ""));
			model.setCgo_dtl_itm_flg	(JSPUtil.getParameter(request, "cgo_dtl_itm_flg		".trim(), ""));
			model.setCmdt_cd        	(JSPUtil.getParameter(request, "cmdt_cd        		".trim(), ""));
			model.setDesc_cmdt_no   	(JSPUtil.getParameter(request, "desc_cmdt_no   		".trim(), ""));
			model.setCmdt_desc      	(JSPUtil.getParameter(request, "cmdt_desc      		".trim(), ""));
			model.setRep_cmdt_cd    	(JSPUtil.getParameter(request, "rep_cmdt_cd    		".trim(), ""));
			model.setConf_cmdt_cd   	(JSPUtil.getParameter(request, "conf_cmdt_cd   		".trim(), ""));
			model.setEstm_teu_sz_qty	(JSPUtil.getParameter(request, "estm_teu_sz_qty		".trim(), ""));
			model.setEstm_feu_sz_qty	(JSPUtil.getParameter(request, "estm_feu_sz_qty		".trim(), ""));
			model.setCgo_ttl_wgt    	(JSPUtil.getParameter(request, "cgo_ttl_wgt    		".trim(), ""));
			model.setMeas_ut_cd     	(JSPUtil.getParameter(request, "meas_ut_cd     		".trim(), ""));
			model.setSvc_scp_cd     	(JSPUtil.getParameter(request, "svc_scp_cd     		".trim(), ""));
			model.setTtl_cgo_feu_qty	(JSPUtil.getParameter(request, "ttl_cgo_feu_qty		".trim(), ""));
			model.setPay_term_cd    	(JSPUtil.getParameter(request, "pay_term_cd    		".trim(), ""));
			model.setEff_fm_dt      	(JSPUtil.getParameter(request, "eff_fm_dt      		".trim(), ""));
			model.setEff_to_dt      	(JSPUtil.getParameter(request, "eff_to_dt      		".trim(), ""));
			model.setRfa_auth_dt    	(JSPUtil.getParameter(request, "rfa_auth_dt    		".trim(), ""));
			model.setRfa_file_dt    	(JSPUtil.getParameter(request, "rfa_file_dt    		".trim(), ""));
			model.setRfa_cxl_dt     	(JSPUtil.getParameter(request, "rfa_cxl_dt     		".trim(), ""));
			model.setRfa_cxl_flg    	(JSPUtil.getParameter(request, "rfa_cxl_flg    		".trim(), ""));
			model.setCre_dt         	(JSPUtil.getParameter(request, "cre_dt         		".trim(), ""));
			model.setUpd_dt         	(JSPUtil.getParameter(request, "upd_dt         		".trim(), ""));
			model.setCre_usr_id     	(JSPUtil.getParameter(request, "cre_usr_id     		".trim(), ""));
			model.setRar_auth_no    	(JSPUtil.getParameter(request, "rar_auth_no    		".trim(), ""));
			model.setCre_svr_id     	(JSPUtil.getParameter(request, "cre_svr_id     		".trim(), ""));
			model.setRepl_flg       	(JSPUtil.getParameter(request, "repl_flg       		".trim(), ""));
			model.setTrf_itm_no     	(JSPUtil.getParameter(request, "trf_itm_no     		".trim(), ""));
			model.setTrf_line_itm_no	(JSPUtil.getParameter(request, "trf_line_itm_no		".trim(), ""));
			model.setSrep_nm        	(JSPUtil.getParameter(request, "srep_nm        		".trim(), ""));
			model.setDup_flg        	(JSPUtil.getParameter(request, "dup_flg        		".trim(), ""));
			model.setRfa_auth_no    	(JSPUtil.getParameter(request, "rfa_auth_no    		".trim(), ""));
			model.setRfa_file_flg   	(JSPUtil.getParameter(request, "rfa_file_flg   		".trim(), ""));
			model.setNis_evnt_dt    	(JSPUtil.getParameter(request, "nis_evnt_dt    		".trim(), ""));
			model.setBis_flg        	(JSPUtil.getParameter(request, "bis_flg        		".trim(), ""));
			model.setEai_evnt_dt    	(JSPUtil.getParameter(request, "eai_evnt_dt    		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		SSC_RFA_GEN model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag          =  (JSPUtil.getParameter(request, "ibflag         		".trim(), length));
			String[] page_rows       =  (JSPUtil.getParameter(request, "page_rows      		".trim(), length));
			String[] ofc_pfx_cd      =  (JSPUtil.getParameter(request, "ofc_pfx_cd     		".trim(), length));
			String[] ofc_qttn_seq    =  (JSPUtil.getParameter(request, "ofc_qttn_seq   		".trim(), length));
			String[] rfa_pfx_ofc_cd  =  (JSPUtil.getParameter(request, "rfa_pfx_ofc_cd 		".trim(), length));
			String[] rfa_seq         =  (JSPUtil.getParameter(request, "rfa_seq        		".trim(), length));
			String[] rfa_sts_cd      =  (JSPUtil.getParameter(request, "rfa_sts_cd     		".trim(), length));
			String[] sls_ofc_cd      =  (JSPUtil.getParameter(request, "sls_ofc_cd     		".trim(), length));
			String[] srep_cd         =  (JSPUtil.getParameter(request, "srep_cd        		".trim(), length));
			String[] fnl_auth_ofc_cd =  (JSPUtil.getParameter(request, "fnl_auth_ofc_cd		".trim(), length));
			String[] fnl_auth_usr_id =  (JSPUtil.getParameter(request, "fnl_auth_usr_id		".trim(), length));
			String[] sc_no           =  (JSPUtil.getParameter(request, "sc_no          		".trim(), length));
			String[] cgo_tp_cd       =  (JSPUtil.getParameter(request, "cgo_tp_cd      		".trim(), length));
			String[] cgo_dtl_itm_flg =  (JSPUtil.getParameter(request, "cgo_dtl_itm_flg		".trim(), length));
			String[] cmdt_cd         =  (JSPUtil.getParameter(request, "cmdt_cd        		".trim(), length));
			String[] desc_cmdt_no    =  (JSPUtil.getParameter(request, "desc_cmdt_no   		".trim(), length));
			String[] cmdt_desc       =  (JSPUtil.getParameter(request, "cmdt_desc      		".trim(), length));
			String[] rep_cmdt_cd     =  (JSPUtil.getParameter(request, "rep_cmdt_cd    		".trim(), length));
			String[] conf_cmdt_cd    =  (JSPUtil.getParameter(request, "conf_cmdt_cd   		".trim(), length));
			String[] estm_teu_sz_qty =  (JSPUtil.getParameter(request, "estm_teu_sz_qty		".trim(), length));
			String[] estm_feu_sz_qty =  (JSPUtil.getParameter(request, "estm_feu_sz_qty		".trim(), length));
			String[] cgo_ttl_wgt     =  (JSPUtil.getParameter(request, "cgo_ttl_wgt    		".trim(), length));
			String[] meas_ut_cd      =  (JSPUtil.getParameter(request, "meas_ut_cd     		".trim(), length));
			String[] svc_scp_cd      =  (JSPUtil.getParameter(request, "svc_scp_cd     		".trim(), length));
			String[] ttl_cgo_feu_qty =  (JSPUtil.getParameter(request, "ttl_cgo_feu_qty		".trim(), length));
			String[] pay_term_cd     =  (JSPUtil.getParameter(request, "pay_term_cd    		".trim(), length));
			String[] eff_fm_dt       =  (JSPUtil.getParameter(request, "eff_fm_dt      		".trim(), length));
			String[] eff_to_dt       =  (JSPUtil.getParameter(request, "eff_to_dt      		".trim(), length));
			String[] rfa_auth_dt     =  (JSPUtil.getParameter(request, "rfa_auth_dt    		".trim(), length));
			String[] rfa_file_dt     =  (JSPUtil.getParameter(request, "rfa_file_dt    		".trim(), length));
			String[] rfa_cxl_dt      =  (JSPUtil.getParameter(request, "rfa_cxl_dt     		".trim(), length));
			String[] rfa_cxl_flg     =  (JSPUtil.getParameter(request, "rfa_cxl_flg    		".trim(), length));
			String[] cre_dt          =  (JSPUtil.getParameter(request, "cre_dt         		".trim(), length));
			String[] upd_dt          =  (JSPUtil.getParameter(request, "upd_dt         		".trim(), length));
			String[] cre_usr_id      =  (JSPUtil.getParameter(request, "cre_usr_id     		".trim(), length));
			String[] rar_auth_no     =  (JSPUtil.getParameter(request, "rar_auth_no    		".trim(), length));
			String[] cre_svr_id      =  (JSPUtil.getParameter(request, "cre_svr_id     		".trim(), length));
			String[] repl_flg        =  (JSPUtil.getParameter(request, "repl_flg       		".trim(), length));
			String[] trf_itm_no      =  (JSPUtil.getParameter(request, "trf_itm_no     		".trim(), length));
			String[] trf_line_itm_no =  (JSPUtil.getParameter(request, "trf_line_itm_no		".trim(), length));
			String[] srep_nm         =  (JSPUtil.getParameter(request, "srep_nm        		".trim(), length));
			String[] dup_flg         =  (JSPUtil.getParameter(request, "dup_flg        		".trim(), length));
			String[] rfa_auth_no     =  (JSPUtil.getParameter(request, "rfa_auth_no    		".trim(), length));
			String[] rfa_file_flg    =  (JSPUtil.getParameter(request, "rfa_file_flg   		".trim(), length));
			String[] nis_evnt_dt     =  (JSPUtil.getParameter(request, "nis_evnt_dt    		".trim(), length));
			String[] bis_flg         =  (JSPUtil.getParameter(request, "bis_flg        		".trim(), length));
			String[] eai_evnt_dt     =  (JSPUtil.getParameter(request, "eai_evnt_dt    		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new SSC_RFA_GEN();
				model.setIbflag         		  (ibflag         	[i]);
				model.setPage_rows      		  (page_rows      	[i]);
				model.setOfc_pfx_cd     		  (ofc_pfx_cd     	[i]);
				model.setOfc_qttn_seq   		  (ofc_qttn_seq   	[i]);
				model.setRfa_pfx_ofc_cd 		  (rfa_pfx_ofc_cd 	[i]);
				model.setRfa_seq        		  (rfa_seq        	[i]);
				model.setRfa_sts_cd     		  (rfa_sts_cd     	[i]);
				model.setSls_ofc_cd     		  (sls_ofc_cd     	[i]);
				model.setSrep_cd        		  (srep_cd        	[i]);
				model.setFnl_auth_ofc_cd		  (fnl_auth_ofc_cd	[i]);
				model.setFnl_auth_usr_id		  (fnl_auth_usr_id	[i]);
				model.setSc_no          		  (sc_no          	[i]);
				model.setCgo_tp_cd      		  (cgo_tp_cd      	[i]);
				model.setCgo_dtl_itm_flg		  (cgo_dtl_itm_flg	[i]);
				model.setCmdt_cd        		  (cmdt_cd        	[i]);
				model.setDesc_cmdt_no   		  (desc_cmdt_no   	[i]);
				model.setCmdt_desc      		  (cmdt_desc      	[i]);
				model.setRep_cmdt_cd    		  (rep_cmdt_cd    	[i]);
				model.setConf_cmdt_cd   		  (conf_cmdt_cd   	[i]);
				model.setEstm_teu_sz_qty		  (estm_teu_sz_qty	[i]);
				model.setEstm_feu_sz_qty		  (estm_feu_sz_qty	[i]);
				model.setCgo_ttl_wgt    		  (cgo_ttl_wgt    	[i]);
				model.setMeas_ut_cd     		  (meas_ut_cd     	[i]);
				model.setSvc_scp_cd     		  (svc_scp_cd     	[i]);
				model.setTtl_cgo_feu_qty		  (ttl_cgo_feu_qty	[i]);
				model.setPay_term_cd    		  (pay_term_cd    	[i]);
				model.setEff_fm_dt      		  (eff_fm_dt      	[i]);
				model.setEff_to_dt      		  (eff_to_dt      	[i]);
				model.setRfa_auth_dt    		  (rfa_auth_dt    	[i]);
				model.setRfa_file_dt    		  (rfa_file_dt    	[i]);
				model.setRfa_cxl_dt     		  (rfa_cxl_dt     	[i]);
				model.setRfa_cxl_flg    		  (rfa_cxl_flg    	[i]);
				model.setCre_dt         		  (cre_dt         	[i]);
				model.setUpd_dt         		  (upd_dt         	[i]);
				model.setCre_usr_id     		  (cre_usr_id     	[i]);
				model.setRar_auth_no    		  (rar_auth_no    	[i]);
				model.setCre_svr_id     		  (cre_svr_id     	[i]);
				model.setRepl_flg       		  (repl_flg       	[i]);
				model.setTrf_itm_no     		  (trf_itm_no     	[i]);
				model.setTrf_line_itm_no		  (trf_line_itm_no	[i]);
				model.setSrep_nm        		  (srep_nm        	[i]);
				model.setDup_flg        		  (dup_flg        	[i]);
				model.setRfa_auth_no    		  (rfa_auth_no    	[i]);
				model.setRfa_file_flg   		  (rfa_file_flg   	[i]);
				model.setNis_evnt_dt    		  (nis_evnt_dt    	[i]);
				model.setBis_flg        		  (bis_flg        	[i]);
				model.setEai_evnt_dt    		  (eai_evnt_dt    	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		SSC_RFA_GEN model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag          =  (JSPUtil.getParameter(request, prefix + "ibflag         		".trim(), length));
			String[] page_rows       =  (JSPUtil.getParameter(request, prefix + "page_rows      		".trim(), length));
			String[] ofc_pfx_cd      =  (JSPUtil.getParameter(request, prefix + "ofc_pfx_cd     		".trim(), length));
			String[] ofc_qttn_seq    =  (JSPUtil.getParameter(request, prefix + "ofc_qttn_seq   		".trim(), length));
			String[] rfa_pfx_ofc_cd  =  (JSPUtil.getParameter(request, prefix + "rfa_pfx_ofc_cd 		".trim(), length));
			String[] rfa_seq         =  (JSPUtil.getParameter(request, prefix + "rfa_seq        		".trim(), length));
			String[] rfa_sts_cd      =  (JSPUtil.getParameter(request, prefix + "rfa_sts_cd     		".trim(), length));
			String[] sls_ofc_cd      =  (JSPUtil.getParameter(request, prefix + "sls_ofc_cd     		".trim(), length));
			String[] srep_cd         =  (JSPUtil.getParameter(request, prefix + "srep_cd        		".trim(), length));
			String[] fnl_auth_ofc_cd =  (JSPUtil.getParameter(request, prefix + "fnl_auth_ofc_cd		".trim(), length));
			String[] fnl_auth_usr_id =  (JSPUtil.getParameter(request, prefix + "fnl_auth_usr_id		".trim(), length));
			String[] sc_no           =  (JSPUtil.getParameter(request, prefix + "sc_no          		".trim(), length));
			String[] cgo_tp_cd       =  (JSPUtil.getParameter(request, prefix + "cgo_tp_cd      		".trim(), length));
			String[] cgo_dtl_itm_flg =  (JSPUtil.getParameter(request, prefix + "cgo_dtl_itm_flg		".trim(), length));
			String[] cmdt_cd         =  (JSPUtil.getParameter(request, prefix + "cmdt_cd        		".trim(), length));
			String[] desc_cmdt_no    =  (JSPUtil.getParameter(request, prefix + "desc_cmdt_no   		".trim(), length));
			String[] cmdt_desc       =  (JSPUtil.getParameter(request, prefix + "cmdt_desc      		".trim(), length));
			String[] rep_cmdt_cd     =  (JSPUtil.getParameter(request, prefix + "rep_cmdt_cd    		".trim(), length));
			String[] conf_cmdt_cd    =  (JSPUtil.getParameter(request, prefix + "conf_cmdt_cd   		".trim(), length));
			String[] estm_teu_sz_qty =  (JSPUtil.getParameter(request, prefix + "estm_teu_sz_qty		".trim(), length));
			String[] estm_feu_sz_qty =  (JSPUtil.getParameter(request, prefix + "estm_feu_sz_qty		".trim(), length));
			String[] cgo_ttl_wgt     =  (JSPUtil.getParameter(request, prefix + "cgo_ttl_wgt    		".trim(), length));
			String[] meas_ut_cd      =  (JSPUtil.getParameter(request, prefix + "meas_ut_cd     		".trim(), length));
			String[] svc_scp_cd      =  (JSPUtil.getParameter(request, prefix + "svc_scp_cd     		".trim(), length));
			String[] ttl_cgo_feu_qty =  (JSPUtil.getParameter(request, prefix + "ttl_cgo_feu_qty		".trim(), length));
			String[] pay_term_cd     =  (JSPUtil.getParameter(request, prefix + "pay_term_cd    		".trim(), length));
			String[] eff_fm_dt       =  (JSPUtil.getParameter(request, prefix + "eff_fm_dt      		".trim(), length));
			String[] eff_to_dt       =  (JSPUtil.getParameter(request, prefix + "eff_to_dt      		".trim(), length));
			String[] rfa_auth_dt     =  (JSPUtil.getParameter(request, prefix + "rfa_auth_dt    		".trim(), length));
			String[] rfa_file_dt     =  (JSPUtil.getParameter(request, prefix + "rfa_file_dt    		".trim(), length));
			String[] rfa_cxl_dt      =  (JSPUtil.getParameter(request, prefix + "rfa_cxl_dt     		".trim(), length));
			String[] rfa_cxl_flg     =  (JSPUtil.getParameter(request, prefix + "rfa_cxl_flg    		".trim(), length));
			String[] cre_dt          =  (JSPUtil.getParameter(request, prefix + "cre_dt         		".trim(), length));
			String[] upd_dt          =  (JSPUtil.getParameter(request, prefix + "upd_dt         		".trim(), length));
			String[] cre_usr_id      =  (JSPUtil.getParameter(request, prefix + "cre_usr_id     		".trim(), length));
			String[] rar_auth_no     =  (JSPUtil.getParameter(request, prefix + "rar_auth_no    		".trim(), length));
			String[] cre_svr_id      =  (JSPUtil.getParameter(request, prefix + "cre_svr_id     		".trim(), length));
			String[] repl_flg        =  (JSPUtil.getParameter(request, prefix + "repl_flg       		".trim(), length));
			String[] trf_itm_no      =  (JSPUtil.getParameter(request, prefix + "trf_itm_no     		".trim(), length));
			String[] trf_line_itm_no =  (JSPUtil.getParameter(request, prefix + "trf_line_itm_no		".trim(), length));
			String[] srep_nm         =  (JSPUtil.getParameter(request, prefix + "srep_nm        		".trim(), length));
			String[] dup_flg         =  (JSPUtil.getParameter(request, prefix + "dup_flg        		".trim(), length));
			String[] rfa_auth_no     =  (JSPUtil.getParameter(request, prefix + "rfa_auth_no    		".trim(), length));
			String[] rfa_file_flg    =  (JSPUtil.getParameter(request, prefix + "rfa_file_flg   		".trim(), length));
			String[] nis_evnt_dt     =  (JSPUtil.getParameter(request, prefix + "nis_evnt_dt    		".trim(), length));
			String[] bis_flg         =  (JSPUtil.getParameter(request, prefix + "bis_flg        		".trim(), length));
			String[] eai_evnt_dt     =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt    		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new SSC_RFA_GEN();
				model.setIbflag         		  ( ibflag         	[i]);
				model.setPage_rows      		  ( page_rows      	[i]);
				model.setOfc_pfx_cd     		  ( ofc_pfx_cd     	[i]);
				model.setOfc_qttn_seq   		  ( ofc_qttn_seq   	[i]);
				model.setRfa_pfx_ofc_cd 		  ( rfa_pfx_ofc_cd 	[i]);
				model.setRfa_seq        		  ( rfa_seq        	[i]);
				model.setRfa_sts_cd     		  ( rfa_sts_cd     	[i]);
				model.setSls_ofc_cd     		  ( sls_ofc_cd     	[i]);
				model.setSrep_cd        		  ( srep_cd        	[i]);
				model.setFnl_auth_ofc_cd		  ( fnl_auth_ofc_cd	[i]);
				model.setFnl_auth_usr_id		  ( fnl_auth_usr_id	[i]);
				model.setSc_no          		  ( sc_no          	[i]);
				model.setCgo_tp_cd      		  ( cgo_tp_cd      	[i]);
				model.setCgo_dtl_itm_flg		  ( cgo_dtl_itm_flg	[i]);
				model.setCmdt_cd        		  ( cmdt_cd        	[i]);
				model.setDesc_cmdt_no   		  ( desc_cmdt_no   	[i]);
				model.setCmdt_desc      		  ( cmdt_desc      	[i]);
				model.setRep_cmdt_cd    		  ( rep_cmdt_cd    	[i]);
				model.setConf_cmdt_cd   		  ( conf_cmdt_cd   	[i]);
				model.setEstm_teu_sz_qty		  ( estm_teu_sz_qty	[i]);
				model.setEstm_feu_sz_qty		  ( estm_feu_sz_qty	[i]);
				model.setCgo_ttl_wgt    		  ( cgo_ttl_wgt    	[i]);
				model.setMeas_ut_cd     		  ( meas_ut_cd     	[i]);
				model.setSvc_scp_cd     		  ( svc_scp_cd     	[i]);
				model.setTtl_cgo_feu_qty		  ( ttl_cgo_feu_qty	[i]);
				model.setPay_term_cd    		  ( pay_term_cd    	[i]);
				model.setEff_fm_dt      		  ( eff_fm_dt      	[i]);
				model.setEff_to_dt      		  ( eff_to_dt      	[i]);
				model.setRfa_auth_dt    		  ( rfa_auth_dt    	[i]);
				model.setRfa_file_dt    		  ( rfa_file_dt    	[i]);
				model.setRfa_cxl_dt     		  ( rfa_cxl_dt     	[i]);
				model.setRfa_cxl_flg    		  ( rfa_cxl_flg    	[i]);
				model.setCre_dt         		  ( cre_dt         	[i]);
				model.setUpd_dt         		  ( upd_dt         	[i]);
				model.setCre_usr_id     		  ( cre_usr_id     	[i]);
				model.setRar_auth_no    		  ( rar_auth_no    	[i]);
				model.setCre_svr_id     		  ( cre_svr_id     	[i]);
				model.setRepl_flg       		  ( repl_flg       	[i]);
				model.setTrf_itm_no     		  ( trf_itm_no     	[i]);
				model.setTrf_line_itm_no		  ( trf_line_itm_no	[i]);
				model.setSrep_nm        		  ( srep_nm        	[i]);
				model.setDup_flg        		  ( dup_flg        	[i]);
				model.setRfa_auth_no    		  ( rfa_auth_no    	[i]);
				model.setRfa_file_flg   		  ( rfa_file_flg   	[i]);
				model.setNis_evnt_dt    		  ( nis_evnt_dt    	[i]);
				model.setBis_flg        		  ( bis_flg        	[i]);
				model.setEai_evnt_dt    		  ( eai_evnt_dt    	[i]);
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
