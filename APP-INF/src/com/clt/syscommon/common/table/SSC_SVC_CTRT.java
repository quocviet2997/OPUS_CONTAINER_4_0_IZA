/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : SSC_SVC_CTRT.java
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
public final class SSC_SVC_CTRT implements java.io.Serializable {

	private String               ibflag               = "";
	private String               page_rows            = "";
	private String               sc_trd_pfx_cd        = "";
	private String               sc_seq_no            = "";
	private String               sc_svc_scp_cd        = "";
	private String               sc_dir_cd            = "";
	private String               sc_amdt_seq          = "";
	private String               rep_cmdt_cd          = "";
	private String               sc_cust_cnt_cd       = "";
	private String               sc_cust_seq          = "";
	private String               sc_ctrt_ofc_cd       = "";
	private String               sc_ctrt_srep_cd      = "";
	private String               sc_cust_tp_cd        = "";
	private String               sc_min_qty           = "";
	private String               sc_min_qty_ut_cd     = "";
	private String               sc_max_qty           = "";
	private String               sc_max_qty_ut_cd     = "";
	private String               sc_dur_fm_dt         = "";
	private String               sc_dur_to_dt         = "";
	private String               ddft_amt             = "";
	private String               svc_cmmt_qty         = "";
	private String               sc_rmk               = "";
	private String               cre_usr_id           = "";
	private String               cre_dt               = "";
	private String               upd_dt               = "";
	private String               sc_cust_rep_cmdt_cd1 = "";
	private String               sc_cust_rep_cmdt_cd2 = "";
	private String               old_sc_no            = "";
	private String               co_cd                = "";
	private String               nis_evnt_dt          = "";
	private String               eai_evnt_dt          = "";

	public SSC_SVC_CTRT(){}

	public SSC_SVC_CTRT(
			String               ibflag              ,
			String               page_rows           ,
			String               sc_trd_pfx_cd       ,
			String               sc_seq_no           ,
			String               sc_svc_scp_cd       ,
			String               sc_dir_cd           ,
			String               sc_amdt_seq         ,
			String               rep_cmdt_cd         ,
			String               sc_cust_cnt_cd      ,
			String               sc_cust_seq         ,
			String               sc_ctrt_ofc_cd      ,
			String               sc_ctrt_srep_cd     ,
			String               sc_cust_tp_cd       ,
			String               sc_min_qty          ,
			String               sc_min_qty_ut_cd    ,
			String               sc_max_qty          ,
			String               sc_max_qty_ut_cd    ,
			String               sc_dur_fm_dt        ,
			String               sc_dur_to_dt        ,
			String               ddft_amt            ,
			String               svc_cmmt_qty        ,
			String               sc_rmk              ,
			String               cre_usr_id          ,
			String               cre_dt              ,
			String               upd_dt              ,
			String               sc_cust_rep_cmdt_cd1,
			String               sc_cust_rep_cmdt_cd2,
			String               old_sc_no           ,
			String               co_cd               ,
			String               nis_evnt_dt         ,
			String               eai_evnt_dt         ){
		this.ibflag               = ibflag              ;
		this.page_rows            = page_rows           ;
		this.sc_trd_pfx_cd        = sc_trd_pfx_cd       ;
		this.sc_seq_no            = sc_seq_no           ;
		this.sc_svc_scp_cd        = sc_svc_scp_cd       ;
		this.sc_dir_cd            = sc_dir_cd           ;
		this.sc_amdt_seq          = sc_amdt_seq         ;
		this.rep_cmdt_cd          = rep_cmdt_cd         ;
		this.sc_cust_cnt_cd       = sc_cust_cnt_cd      ;
		this.sc_cust_seq          = sc_cust_seq         ;
		this.sc_ctrt_ofc_cd       = sc_ctrt_ofc_cd      ;
		this.sc_ctrt_srep_cd      = sc_ctrt_srep_cd     ;
		this.sc_cust_tp_cd        = sc_cust_tp_cd       ;
		this.sc_min_qty           = sc_min_qty          ;
		this.sc_min_qty_ut_cd     = sc_min_qty_ut_cd    ;
		this.sc_max_qty           = sc_max_qty          ;
		this.sc_max_qty_ut_cd     = sc_max_qty_ut_cd    ;
		this.sc_dur_fm_dt         = sc_dur_fm_dt        ;
		this.sc_dur_to_dt         = sc_dur_to_dt        ;
		this.ddft_amt             = ddft_amt            ;
		this.svc_cmmt_qty         = svc_cmmt_qty        ;
		this.sc_rmk               = sc_rmk              ;
		this.cre_usr_id           = cre_usr_id          ;
		this.cre_dt               = cre_dt              ;
		this.upd_dt               = upd_dt              ;
		this.sc_cust_rep_cmdt_cd1 = sc_cust_rep_cmdt_cd1;
		this.sc_cust_rep_cmdt_cd2 = sc_cust_rep_cmdt_cd2;
		this.old_sc_no            = old_sc_no           ;
		this.co_cd                = co_cd               ;
		this.nis_evnt_dt          = nis_evnt_dt         ;
		this.eai_evnt_dt          = eai_evnt_dt         ;
	}

	// getter method is proceeding ..
	public String               getIbflag              (){	return ibflag              	;	}
	public String               getPage_rows           (){	return page_rows           	;	}
	public String               getSc_trd_pfx_cd       (){	return sc_trd_pfx_cd       	;	}
	public String               getSc_seq_no           (){	return sc_seq_no           	;	}
	public String               getSc_svc_scp_cd       (){	return sc_svc_scp_cd       	;	}
	public String               getSc_dir_cd           (){	return sc_dir_cd           	;	}
	public String               getSc_amdt_seq         (){	return sc_amdt_seq         	;	}
	public String               getRep_cmdt_cd         (){	return rep_cmdt_cd         	;	}
	public String               getSc_cust_cnt_cd      (){	return sc_cust_cnt_cd      	;	}
	public String               getSc_cust_seq         (){	return sc_cust_seq         	;	}
	public String               getSc_ctrt_ofc_cd      (){	return sc_ctrt_ofc_cd      	;	}
	public String               getSc_ctrt_srep_cd     (){	return sc_ctrt_srep_cd     	;	}
	public String               getSc_cust_tp_cd       (){	return sc_cust_tp_cd       	;	}
	public String               getSc_min_qty          (){	return sc_min_qty          	;	}
	public String               getSc_min_qty_ut_cd    (){	return sc_min_qty_ut_cd    	;	}
	public String               getSc_max_qty          (){	return sc_max_qty          	;	}
	public String               getSc_max_qty_ut_cd    (){	return sc_max_qty_ut_cd    	;	}
	public String               getSc_dur_fm_dt        (){	return sc_dur_fm_dt        	;	}
	public String               getSc_dur_to_dt        (){	return sc_dur_to_dt        	;	}
	public String               getDdft_amt            (){	return ddft_amt            	;	}
	public String               getSvc_cmmt_qty        (){	return svc_cmmt_qty        	;	}
	public String               getSc_rmk              (){	return sc_rmk              	;	}
	public String               getCre_usr_id          (){	return cre_usr_id          	;	}
	public String               getCre_dt              (){	return cre_dt              	;	}
	public String               getUpd_dt              (){	return upd_dt              	;	}
	public String               getSc_cust_rep_cmdt_cd1(){	return sc_cust_rep_cmdt_cd1	;	}
	public String               getSc_cust_rep_cmdt_cd2(){	return sc_cust_rep_cmdt_cd2	;	}
	public String               getOld_sc_no           (){	return old_sc_no           	;	}
	public String               getCo_cd               (){	return co_cd               	;	}
	public String               getNis_evnt_dt         (){	return nis_evnt_dt         	;	}
	public String               getEai_evnt_dt         (){	return eai_evnt_dt         	;	}

	// setter method is proceeding ..
	public void setIbflag              ( String               ibflag               ){	this.ibflag               = ibflag              	;	}
	public void setPage_rows           ( String               page_rows            ){	this.page_rows            = page_rows           	;	}
	public void setSc_trd_pfx_cd       ( String               sc_trd_pfx_cd        ){	this.sc_trd_pfx_cd        = sc_trd_pfx_cd       	;	}
	public void setSc_seq_no           ( String               sc_seq_no            ){	this.sc_seq_no            = sc_seq_no           	;	}
	public void setSc_svc_scp_cd       ( String               sc_svc_scp_cd        ){	this.sc_svc_scp_cd        = sc_svc_scp_cd       	;	}
	public void setSc_dir_cd           ( String               sc_dir_cd            ){	this.sc_dir_cd            = sc_dir_cd           	;	}
	public void setSc_amdt_seq         ( String               sc_amdt_seq          ){	this.sc_amdt_seq          = sc_amdt_seq         	;	}
	public void setRep_cmdt_cd         ( String               rep_cmdt_cd          ){	this.rep_cmdt_cd          = rep_cmdt_cd         	;	}
	public void setSc_cust_cnt_cd      ( String               sc_cust_cnt_cd       ){	this.sc_cust_cnt_cd       = sc_cust_cnt_cd      	;	}
	public void setSc_cust_seq         ( String               sc_cust_seq          ){	this.sc_cust_seq          = sc_cust_seq         	;	}
	public void setSc_ctrt_ofc_cd      ( String               sc_ctrt_ofc_cd       ){	this.sc_ctrt_ofc_cd       = sc_ctrt_ofc_cd      	;	}
	public void setSc_ctrt_srep_cd     ( String               sc_ctrt_srep_cd      ){	this.sc_ctrt_srep_cd      = sc_ctrt_srep_cd     	;	}
	public void setSc_cust_tp_cd       ( String               sc_cust_tp_cd        ){	this.sc_cust_tp_cd        = sc_cust_tp_cd       	;	}
	public void setSc_min_qty          ( String               sc_min_qty           ){	this.sc_min_qty           = sc_min_qty          	;	}
	public void setSc_min_qty_ut_cd    ( String               sc_min_qty_ut_cd     ){	this.sc_min_qty_ut_cd     = sc_min_qty_ut_cd    	;	}
	public void setSc_max_qty          ( String               sc_max_qty           ){	this.sc_max_qty           = sc_max_qty          	;	}
	public void setSc_max_qty_ut_cd    ( String               sc_max_qty_ut_cd     ){	this.sc_max_qty_ut_cd     = sc_max_qty_ut_cd    	;	}
	public void setSc_dur_fm_dt        ( String               sc_dur_fm_dt         ){	this.sc_dur_fm_dt         = sc_dur_fm_dt        	;	}
	public void setSc_dur_to_dt        ( String               sc_dur_to_dt         ){	this.sc_dur_to_dt         = sc_dur_to_dt        	;	}
	public void setDdft_amt            ( String               ddft_amt             ){	this.ddft_amt             = ddft_amt            	;	}
	public void setSvc_cmmt_qty        ( String               svc_cmmt_qty         ){	this.svc_cmmt_qty         = svc_cmmt_qty        	;	}
	public void setSc_rmk              ( String               sc_rmk               ){	this.sc_rmk               = sc_rmk              	;	}
	public void setCre_usr_id          ( String               cre_usr_id           ){	this.cre_usr_id           = cre_usr_id          	;	}
	public void setCre_dt              ( String               cre_dt               ){	this.cre_dt               = cre_dt              	;	}
	public void setUpd_dt              ( String               upd_dt               ){	this.upd_dt               = upd_dt              	;	}
	public void setSc_cust_rep_cmdt_cd1( String               sc_cust_rep_cmdt_cd1 ){	this.sc_cust_rep_cmdt_cd1 = sc_cust_rep_cmdt_cd1	;	}
	public void setSc_cust_rep_cmdt_cd2( String               sc_cust_rep_cmdt_cd2 ){	this.sc_cust_rep_cmdt_cd2 = sc_cust_rep_cmdt_cd2	;	}
	public void setOld_sc_no           ( String               old_sc_no            ){	this.old_sc_no            = old_sc_no           	;	}
	public void setCo_cd               ( String               co_cd                ){	this.co_cd                = co_cd               	;	}
	public void setNis_evnt_dt         ( String               nis_evnt_dt          ){	this.nis_evnt_dt          = nis_evnt_dt         	;	}
	public void setEai_evnt_dt         ( String               eai_evnt_dt          ){	this.eai_evnt_dt          = eai_evnt_dt         	;	}

	public static SSC_SVC_CTRT fromRequest(HttpServletRequest request) {
		SSC_SVC_CTRT model = new SSC_SVC_CTRT();
		try {
			model.setIbflag              	(JSPUtil.getParameter(request, "ibflag              		".trim(), ""));
			model.setPage_rows           	(JSPUtil.getParameter(request, "page_rows           		".trim(), ""));
			model.setSc_trd_pfx_cd       	(JSPUtil.getParameter(request, "sc_trd_pfx_cd       		".trim(), ""));
			model.setSc_seq_no           	(JSPUtil.getParameter(request, "sc_seq_no           		".trim(), ""));
			model.setSc_svc_scp_cd       	(JSPUtil.getParameter(request, "sc_svc_scp_cd       		".trim(), ""));
			model.setSc_dir_cd           	(JSPUtil.getParameter(request, "sc_dir_cd           		".trim(), ""));
			model.setSc_amdt_seq         	(JSPUtil.getParameter(request, "sc_amdt_seq         		".trim(), ""));
			model.setRep_cmdt_cd         	(JSPUtil.getParameter(request, "rep_cmdt_cd         		".trim(), ""));
			model.setSc_cust_cnt_cd      	(JSPUtil.getParameter(request, "sc_cust_cnt_cd      		".trim(), ""));
			model.setSc_cust_seq         	(JSPUtil.getParameter(request, "sc_cust_seq         		".trim(), ""));
			model.setSc_ctrt_ofc_cd      	(JSPUtil.getParameter(request, "sc_ctrt_ofc_cd      		".trim(), ""));
			model.setSc_ctrt_srep_cd     	(JSPUtil.getParameter(request, "sc_ctrt_srep_cd     		".trim(), ""));
			model.setSc_cust_tp_cd       	(JSPUtil.getParameter(request, "sc_cust_tp_cd       		".trim(), ""));
			model.setSc_min_qty          	(JSPUtil.getParameter(request, "sc_min_qty          		".trim(), ""));
			model.setSc_min_qty_ut_cd    	(JSPUtil.getParameter(request, "sc_min_qty_ut_cd    		".trim(), ""));
			model.setSc_max_qty          	(JSPUtil.getParameter(request, "sc_max_qty          		".trim(), ""));
			model.setSc_max_qty_ut_cd    	(JSPUtil.getParameter(request, "sc_max_qty_ut_cd    		".trim(), ""));
			model.setSc_dur_fm_dt        	(JSPUtil.getParameter(request, "sc_dur_fm_dt        		".trim(), ""));
			model.setSc_dur_to_dt        	(JSPUtil.getParameter(request, "sc_dur_to_dt        		".trim(), ""));
			model.setDdft_amt            	(JSPUtil.getParameter(request, "ddft_amt            		".trim(), ""));
			model.setSvc_cmmt_qty        	(JSPUtil.getParameter(request, "svc_cmmt_qty        		".trim(), ""));
			model.setSc_rmk              	(JSPUtil.getParameter(request, "sc_rmk              		".trim(), ""));
			model.setCre_usr_id          	(JSPUtil.getParameter(request, "cre_usr_id          		".trim(), ""));
			model.setCre_dt              	(JSPUtil.getParameter(request, "cre_dt              		".trim(), ""));
			model.setUpd_dt              	(JSPUtil.getParameter(request, "upd_dt              		".trim(), ""));
			model.setSc_cust_rep_cmdt_cd1	(JSPUtil.getParameter(request, "sc_cust_rep_cmdt_cd1		".trim(), ""));
			model.setSc_cust_rep_cmdt_cd2	(JSPUtil.getParameter(request, "sc_cust_rep_cmdt_cd2		".trim(), ""));
			model.setOld_sc_no           	(JSPUtil.getParameter(request, "old_sc_no           		".trim(), ""));
			model.setCo_cd               	(JSPUtil.getParameter(request, "co_cd               		".trim(), ""));
			model.setNis_evnt_dt         	(JSPUtil.getParameter(request, "nis_evnt_dt         		".trim(), ""));
			model.setEai_evnt_dt         	(JSPUtil.getParameter(request, "eai_evnt_dt         		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		SSC_SVC_CTRT model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag               =  (JSPUtil.getParameter(request, "ibflag              		".trim(), length));
			String[] page_rows            =  (JSPUtil.getParameter(request, "page_rows           		".trim(), length));
			String[] sc_trd_pfx_cd        =  (JSPUtil.getParameter(request, "sc_trd_pfx_cd       		".trim(), length));
			String[] sc_seq_no            =  (JSPUtil.getParameter(request, "sc_seq_no           		".trim(), length));
			String[] sc_svc_scp_cd        =  (JSPUtil.getParameter(request, "sc_svc_scp_cd       		".trim(), length));
			String[] sc_dir_cd            =  (JSPUtil.getParameter(request, "sc_dir_cd           		".trim(), length));
			String[] sc_amdt_seq          =  (JSPUtil.getParameter(request, "sc_amdt_seq         		".trim(), length));
			String[] rep_cmdt_cd          =  (JSPUtil.getParameter(request, "rep_cmdt_cd         		".trim(), length));
			String[] sc_cust_cnt_cd       =  (JSPUtil.getParameter(request, "sc_cust_cnt_cd      		".trim(), length));
			String[] sc_cust_seq          =  (JSPUtil.getParameter(request, "sc_cust_seq         		".trim(), length));
			String[] sc_ctrt_ofc_cd       =  (JSPUtil.getParameter(request, "sc_ctrt_ofc_cd      		".trim(), length));
			String[] sc_ctrt_srep_cd      =  (JSPUtil.getParameter(request, "sc_ctrt_srep_cd     		".trim(), length));
			String[] sc_cust_tp_cd        =  (JSPUtil.getParameter(request, "sc_cust_tp_cd       		".trim(), length));
			String[] sc_min_qty           =  (JSPUtil.getParameter(request, "sc_min_qty          		".trim(), length));
			String[] sc_min_qty_ut_cd     =  (JSPUtil.getParameter(request, "sc_min_qty_ut_cd    		".trim(), length));
			String[] sc_max_qty           =  (JSPUtil.getParameter(request, "sc_max_qty          		".trim(), length));
			String[] sc_max_qty_ut_cd     =  (JSPUtil.getParameter(request, "sc_max_qty_ut_cd    		".trim(), length));
			String[] sc_dur_fm_dt         =  (JSPUtil.getParameter(request, "sc_dur_fm_dt        		".trim(), length));
			String[] sc_dur_to_dt         =  (JSPUtil.getParameter(request, "sc_dur_to_dt        		".trim(), length));
			String[] ddft_amt             =  (JSPUtil.getParameter(request, "ddft_amt            		".trim(), length));
			String[] svc_cmmt_qty         =  (JSPUtil.getParameter(request, "svc_cmmt_qty        		".trim(), length));
			String[] sc_rmk               =  (JSPUtil.getParameter(request, "sc_rmk              		".trim(), length));
			String[] cre_usr_id           =  (JSPUtil.getParameter(request, "cre_usr_id          		".trim(), length));
			String[] cre_dt               =  (JSPUtil.getParameter(request, "cre_dt              		".trim(), length));
			String[] upd_dt               =  (JSPUtil.getParameter(request, "upd_dt              		".trim(), length));
			String[] sc_cust_rep_cmdt_cd1 =  (JSPUtil.getParameter(request, "sc_cust_rep_cmdt_cd1		".trim(), length));
			String[] sc_cust_rep_cmdt_cd2 =  (JSPUtil.getParameter(request, "sc_cust_rep_cmdt_cd2		".trim(), length));
			String[] old_sc_no            =  (JSPUtil.getParameter(request, "old_sc_no           		".trim(), length));
			String[] co_cd                =  (JSPUtil.getParameter(request, "co_cd               		".trim(), length));
			String[] nis_evnt_dt          =  (JSPUtil.getParameter(request, "nis_evnt_dt         		".trim(), length));
			String[] eai_evnt_dt          =  (JSPUtil.getParameter(request, "eai_evnt_dt         		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new SSC_SVC_CTRT();
				model.setIbflag              		  (ibflag              	[i]);
				model.setPage_rows           		  (page_rows           	[i]);
				model.setSc_trd_pfx_cd       		  (sc_trd_pfx_cd       	[i]);
				model.setSc_seq_no           		  (sc_seq_no           	[i]);
				model.setSc_svc_scp_cd       		  (sc_svc_scp_cd       	[i]);
				model.setSc_dir_cd           		  (sc_dir_cd           	[i]);
				model.setSc_amdt_seq         		  (sc_amdt_seq         	[i]);
				model.setRep_cmdt_cd         		  (rep_cmdt_cd         	[i]);
				model.setSc_cust_cnt_cd      		  (sc_cust_cnt_cd      	[i]);
				model.setSc_cust_seq         		  (sc_cust_seq         	[i]);
				model.setSc_ctrt_ofc_cd      		  (sc_ctrt_ofc_cd      	[i]);
				model.setSc_ctrt_srep_cd     		  (sc_ctrt_srep_cd     	[i]);
				model.setSc_cust_tp_cd       		  (sc_cust_tp_cd       	[i]);
				model.setSc_min_qty          		  (sc_min_qty          	[i]);
				model.setSc_min_qty_ut_cd    		  (sc_min_qty_ut_cd    	[i]);
				model.setSc_max_qty          		  (sc_max_qty          	[i]);
				model.setSc_max_qty_ut_cd    		  (sc_max_qty_ut_cd    	[i]);
				model.setSc_dur_fm_dt        		  (sc_dur_fm_dt        	[i]);
				model.setSc_dur_to_dt        		  (sc_dur_to_dt        	[i]);
				model.setDdft_amt            		  (ddft_amt            	[i]);
				model.setSvc_cmmt_qty        		  (svc_cmmt_qty        	[i]);
				model.setSc_rmk              		  (sc_rmk              	[i]);
				model.setCre_usr_id          		  (cre_usr_id          	[i]);
				model.setCre_dt              		  (cre_dt              	[i]);
				model.setUpd_dt              		  (upd_dt              	[i]);
				model.setSc_cust_rep_cmdt_cd1		  (sc_cust_rep_cmdt_cd1	[i]);
				model.setSc_cust_rep_cmdt_cd2		  (sc_cust_rep_cmdt_cd2	[i]);
				model.setOld_sc_no           		  (old_sc_no           	[i]);
				model.setCo_cd               		  (co_cd               	[i]);
				model.setNis_evnt_dt         		  (nis_evnt_dt         	[i]);
				model.setEai_evnt_dt         		  (eai_evnt_dt         	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		SSC_SVC_CTRT model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag               =  (JSPUtil.getParameter(request, prefix + "ibflag              		".trim(), length));
			String[] page_rows            =  (JSPUtil.getParameter(request, prefix + "page_rows           		".trim(), length));
			String[] sc_trd_pfx_cd        =  (JSPUtil.getParameter(request, prefix + "sc_trd_pfx_cd       		".trim(), length));
			String[] sc_seq_no            =  (JSPUtil.getParameter(request, prefix + "sc_seq_no           		".trim(), length));
			String[] sc_svc_scp_cd        =  (JSPUtil.getParameter(request, prefix + "sc_svc_scp_cd       		".trim(), length));
			String[] sc_dir_cd            =  (JSPUtil.getParameter(request, prefix + "sc_dir_cd           		".trim(), length));
			String[] sc_amdt_seq          =  (JSPUtil.getParameter(request, prefix + "sc_amdt_seq         		".trim(), length));
			String[] rep_cmdt_cd          =  (JSPUtil.getParameter(request, prefix + "rep_cmdt_cd         		".trim(), length));
			String[] sc_cust_cnt_cd       =  (JSPUtil.getParameter(request, prefix + "sc_cust_cnt_cd      		".trim(), length));
			String[] sc_cust_seq          =  (JSPUtil.getParameter(request, prefix + "sc_cust_seq         		".trim(), length));
			String[] sc_ctrt_ofc_cd       =  (JSPUtil.getParameter(request, prefix + "sc_ctrt_ofc_cd      		".trim(), length));
			String[] sc_ctrt_srep_cd      =  (JSPUtil.getParameter(request, prefix + "sc_ctrt_srep_cd     		".trim(), length));
			String[] sc_cust_tp_cd        =  (JSPUtil.getParameter(request, prefix + "sc_cust_tp_cd       		".trim(), length));
			String[] sc_min_qty           =  (JSPUtil.getParameter(request, prefix + "sc_min_qty          		".trim(), length));
			String[] sc_min_qty_ut_cd     =  (JSPUtil.getParameter(request, prefix + "sc_min_qty_ut_cd    		".trim(), length));
			String[] sc_max_qty           =  (JSPUtil.getParameter(request, prefix + "sc_max_qty          		".trim(), length));
			String[] sc_max_qty_ut_cd     =  (JSPUtil.getParameter(request, prefix + "sc_max_qty_ut_cd    		".trim(), length));
			String[] sc_dur_fm_dt         =  (JSPUtil.getParameter(request, prefix + "sc_dur_fm_dt        		".trim(), length));
			String[] sc_dur_to_dt         =  (JSPUtil.getParameter(request, prefix + "sc_dur_to_dt        		".trim(), length));
			String[] ddft_amt             =  (JSPUtil.getParameter(request, prefix + "ddft_amt            		".trim(), length));
			String[] svc_cmmt_qty         =  (JSPUtil.getParameter(request, prefix + "svc_cmmt_qty        		".trim(), length));
			String[] sc_rmk               =  (JSPUtil.getParameter(request, prefix + "sc_rmk              		".trim(), length));
			String[] cre_usr_id           =  (JSPUtil.getParameter(request, prefix + "cre_usr_id          		".trim(), length));
			String[] cre_dt               =  (JSPUtil.getParameter(request, prefix + "cre_dt              		".trim(), length));
			String[] upd_dt               =  (JSPUtil.getParameter(request, prefix + "upd_dt              		".trim(), length));
			String[] sc_cust_rep_cmdt_cd1 =  (JSPUtil.getParameter(request, prefix + "sc_cust_rep_cmdt_cd1		".trim(), length));
			String[] sc_cust_rep_cmdt_cd2 =  (JSPUtil.getParameter(request, prefix + "sc_cust_rep_cmdt_cd2		".trim(), length));
			String[] old_sc_no            =  (JSPUtil.getParameter(request, prefix + "old_sc_no           		".trim(), length));
			String[] co_cd                =  (JSPUtil.getParameter(request, prefix + "co_cd               		".trim(), length));
			String[] nis_evnt_dt          =  (JSPUtil.getParameter(request, prefix + "nis_evnt_dt         		".trim(), length));
			String[] eai_evnt_dt          =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt         		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new SSC_SVC_CTRT();
				model.setIbflag              		  ( ibflag              	[i]);
				model.setPage_rows           		  ( page_rows           	[i]);
				model.setSc_trd_pfx_cd       		  ( sc_trd_pfx_cd       	[i]);
				model.setSc_seq_no           		  ( sc_seq_no           	[i]);
				model.setSc_svc_scp_cd       		  ( sc_svc_scp_cd       	[i]);
				model.setSc_dir_cd           		  ( sc_dir_cd           	[i]);
				model.setSc_amdt_seq         		  ( sc_amdt_seq         	[i]);
				model.setRep_cmdt_cd         		  ( rep_cmdt_cd         	[i]);
				model.setSc_cust_cnt_cd      		  ( sc_cust_cnt_cd      	[i]);
				model.setSc_cust_seq         		  ( sc_cust_seq         	[i]);
				model.setSc_ctrt_ofc_cd      		  ( sc_ctrt_ofc_cd      	[i]);
				model.setSc_ctrt_srep_cd     		  ( sc_ctrt_srep_cd     	[i]);
				model.setSc_cust_tp_cd       		  ( sc_cust_tp_cd       	[i]);
				model.setSc_min_qty          		  ( sc_min_qty          	[i]);
				model.setSc_min_qty_ut_cd    		  ( sc_min_qty_ut_cd    	[i]);
				model.setSc_max_qty          		  ( sc_max_qty          	[i]);
				model.setSc_max_qty_ut_cd    		  ( sc_max_qty_ut_cd    	[i]);
				model.setSc_dur_fm_dt        		  ( sc_dur_fm_dt        	[i]);
				model.setSc_dur_to_dt        		  ( sc_dur_to_dt        	[i]);
				model.setDdft_amt            		  ( ddft_amt            	[i]);
				model.setSvc_cmmt_qty        		  ( svc_cmmt_qty        	[i]);
				model.setSc_rmk              		  ( sc_rmk              	[i]);
				model.setCre_usr_id          		  ( cre_usr_id          	[i]);
				model.setCre_dt              		  ( cre_dt              	[i]);
				model.setUpd_dt              		  ( upd_dt              	[i]);
				model.setSc_cust_rep_cmdt_cd1		  ( sc_cust_rep_cmdt_cd1	[i]);
				model.setSc_cust_rep_cmdt_cd2		  ( sc_cust_rep_cmdt_cd2	[i]);
				model.setOld_sc_no           		  ( old_sc_no           	[i]);
				model.setCo_cd               		  ( co_cd               	[i]);
				model.setNis_evnt_dt         		  ( nis_evnt_dt         	[i]);
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
