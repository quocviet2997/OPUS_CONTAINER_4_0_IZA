/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : TRS_BKG_RQST_ORD.java
*@FileTitle : Adding Surcharge Agreement
*Open Issues :
*Change history :
*@LastModifyDate : 2007-05-22
*@LastModifier : agreement
*@LastVersion : 1.0
* 2007-05-22 agreement
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
public final class TrsBkgRqstOrdVO implements java.io.Serializable {

	private String                        ibflag                        = "";
	private String                        page_rows                     = "";
	private String                        bkg_no                        = "";
	private String                        bkg_no_split                  = "";
	private String                        trsp_rqst_ord_bnd_cd          = "";
	private String                        trsp_sptg_ord_seq             = "";
	private String                        rcvde_term_cd                 = "";
	private String                        act_shpr_seq                  = "";
	private String                        act_shpr_cnt_cd               = "";
	private String                        act_shpr_nm                   = "";
	private String                        act_shpr_phn_no               = "";
	private String                        act_shpr_addr                 = "";
	private String                        act_shpr_biz_rgst_no          = "";
	private String                        dor_loc_cd                    = "";
	private String                        dor_pst_no                    = "";
	private String                        trsp_rqst_so_ind_cd           = "";
	private String                        cxl_ind_cd                    = "";
	private String                        trsp_rqst_ord_rmk             = "";
	private String                        trsp_rqst_ord_fax_no          = "";
	private String                        trsp_rqst_ord_dt              = "";
	private String                        trsp_rqst_ord_pson_nm         = "";
	private String                        trsp_rqst_ord_ownr_trk_ind_cd = "";
	private String                        vsl_cd                        = "";
	private String                        skd_voy_no                    = "";
	private String                        skd_dir_cd                    = "";
	private String                        trsp_rqst_ord_pod_cd          = "";
	private String                        trsp_rqst_ord_bkg_no          = "";
	private String                        trsp_rqst_ord_bkg_no_split    = "";
	private String                        trsp_rqst_ord_so_cfm_ind_cd   = "";
	private String                        trsp_rqst_ord_rqst_id         = "";
	private String                        trsp_rqst_ord_pol_cd          = "";
	private String                        eai_evnt_dt                   = "";
	private String                        tro_cre_usr_id                = "";
	private String                        tro_cre_ofc_cd                = "";
	private String                        tro_cfm_dt                    = "";

	public TrsBkgRqstOrdVO(){}

	public TrsBkgRqstOrdVO(
			String                        ibflag                       ,
			String                        page_rows                    ,
			String                        bkg_no                       ,
			String                        bkg_no_split                 ,
			String                        trsp_rqst_ord_bnd_cd         ,
			String                        trsp_sptg_ord_seq            ,
			String                        rcvde_term_cd                ,
			String                        act_shpr_seq                 ,
			String                        act_shpr_cnt_cd              ,
			String                        act_shpr_nm                  ,
			String                        act_shpr_phn_no              ,
			String                        act_shpr_addr                ,
			String                        act_shpr_biz_rgst_no         ,
			String                        dor_loc_cd                   ,
			String                        dor_pst_no                   ,
			String                        trsp_rqst_so_ind_cd          ,
			String                        cxl_ind_cd                   ,
			String                        trsp_rqst_ord_rmk            ,
			String                        trsp_rqst_ord_fax_no         ,
			String                        trsp_rqst_ord_dt             ,
			String                        trsp_rqst_ord_pson_nm        ,
			String                        trsp_rqst_ord_ownr_trk_ind_cd,
			String                        vsl_cd                       ,
			String                        skd_voy_no                   ,
			String                        skd_dir_cd                   ,
			String                        trsp_rqst_ord_pod_cd         ,
			String                        trsp_rqst_ord_bkg_no         ,
			String                        trsp_rqst_ord_bkg_no_split   ,
			String                        trsp_rqst_ord_so_cfm_ind_cd  ,
			String                        trsp_rqst_ord_rqst_id        ,
			String                        trsp_rqst_ord_pol_cd         ,
			String                        eai_evnt_dt                  ,
			String                        tro_cre_usr_id               ,
			String                        tro_cre_ofc_cd               ,
			String                        tro_cfm_dt                   ){
		this.ibflag                        = ibflag                       ;
		this.page_rows                     = page_rows                    ;
		this.bkg_no                        = bkg_no                       ;
		this.bkg_no_split                  = bkg_no_split                 ;
		this.trsp_rqst_ord_bnd_cd          = trsp_rqst_ord_bnd_cd         ;
		this.trsp_sptg_ord_seq             = trsp_sptg_ord_seq            ;
		this.rcvde_term_cd                 = rcvde_term_cd                ;
		this.act_shpr_seq                  = act_shpr_seq                 ;
		this.act_shpr_cnt_cd               = act_shpr_cnt_cd              ;
		this.act_shpr_nm                   = act_shpr_nm                  ;
		this.act_shpr_phn_no               = act_shpr_phn_no              ;
		this.act_shpr_addr                 = act_shpr_addr                ;
		this.act_shpr_biz_rgst_no          = act_shpr_biz_rgst_no         ;
		this.dor_loc_cd                    = dor_loc_cd                   ;
		this.dor_pst_no                    = dor_pst_no                   ;
		this.trsp_rqst_so_ind_cd           = trsp_rqst_so_ind_cd          ;
		this.cxl_ind_cd                    = cxl_ind_cd                   ;
		this.trsp_rqst_ord_rmk             = trsp_rqst_ord_rmk            ;
		this.trsp_rqst_ord_fax_no          = trsp_rqst_ord_fax_no         ;
		this.trsp_rqst_ord_dt              = trsp_rqst_ord_dt             ;
		this.trsp_rqst_ord_pson_nm         = trsp_rqst_ord_pson_nm        ;
		this.trsp_rqst_ord_ownr_trk_ind_cd = trsp_rqst_ord_ownr_trk_ind_cd;
		this.vsl_cd                        = vsl_cd                       ;
		this.skd_voy_no                    = skd_voy_no                   ;
		this.skd_dir_cd                    = skd_dir_cd                   ;
		this.trsp_rqst_ord_pod_cd          = trsp_rqst_ord_pod_cd         ;
		this.trsp_rqst_ord_bkg_no          = trsp_rqst_ord_bkg_no         ;
		this.trsp_rqst_ord_bkg_no_split    = trsp_rqst_ord_bkg_no_split   ;
		this.trsp_rqst_ord_so_cfm_ind_cd   = trsp_rqst_ord_so_cfm_ind_cd  ;
		this.trsp_rqst_ord_rqst_id         = trsp_rqst_ord_rqst_id        ;
		this.trsp_rqst_ord_pol_cd          = trsp_rqst_ord_pol_cd         ;
		this.eai_evnt_dt                   = eai_evnt_dt                  ;
		this.tro_cre_usr_id                = tro_cre_usr_id               ;
		this.tro_cre_ofc_cd                = tro_cre_ofc_cd               ;
		this.tro_cfm_dt                    = tro_cfm_dt                   ;
	}

	// getter method is proceeding ..
	public String                        getIbflag                       (){	return ibflag                       	;	}
	public String                        getPage_rows                    (){	return page_rows                    	;	}
	public String                        getBkg_no                       (){	return bkg_no                       	;	}
	public String                        getBkg_no_split                 (){	return bkg_no_split                 	;	}
	public String                        getTrsp_rqst_ord_bnd_cd         (){	return trsp_rqst_ord_bnd_cd         	;	}
	public String                        getTrsp_sptg_ord_seq            (){	return trsp_sptg_ord_seq            	;	}
	public String                        getRcvde_term_cd                (){	return rcvde_term_cd                	;	}
	public String                        getAct_shpr_seq                 (){	return act_shpr_seq                 	;	}
	public String                        getAct_shpr_cnt_cd              (){	return act_shpr_cnt_cd              	;	}
	public String                        getAct_shpr_nm                  (){	return act_shpr_nm                  	;	}
	public String                        getAct_shpr_phn_no              (){	return act_shpr_phn_no              	;	}
	public String                        getAct_shpr_addr                (){	return act_shpr_addr                	;	}
	public String                        getAct_shpr_biz_rgst_no         (){	return act_shpr_biz_rgst_no         	;	}
	public String                        getDor_loc_cd                   (){	return dor_loc_cd                   	;	}
	public String                        getDor_pst_no                   (){	return dor_pst_no                   	;	}
	public String                        getTrsp_rqst_so_ind_cd          (){	return trsp_rqst_so_ind_cd          	;	}
	public String                        getCxl_ind_cd                   (){	return cxl_ind_cd                   	;	}
	public String                        getTrsp_rqst_ord_rmk            (){	return trsp_rqst_ord_rmk            	;	}
	public String                        getTrsp_rqst_ord_fax_no         (){	return trsp_rqst_ord_fax_no         	;	}
	public String                        getTrsp_rqst_ord_dt             (){	return trsp_rqst_ord_dt             	;	}
	public String                        getTrsp_rqst_ord_pson_nm        (){	return trsp_rqst_ord_pson_nm        	;	}
	public String                        getTrsp_rqst_ord_ownr_trk_ind_cd(){	return trsp_rqst_ord_ownr_trk_ind_cd	;	}
	public String                        getVsl_cd                       (){	return vsl_cd                       	;	}
	public String                        getSkd_voy_no                   (){	return skd_voy_no                   	;	}
	public String                        getSkd_dir_cd                   (){	return skd_dir_cd                   	;	}
	public String                        getTrsp_rqst_ord_pod_cd         (){	return trsp_rqst_ord_pod_cd         	;	}
	public String                        getTrsp_rqst_ord_bkg_no         (){	return trsp_rqst_ord_bkg_no         	;	}
	public String                        getTrsp_rqst_ord_bkg_no_split   (){	return trsp_rqst_ord_bkg_no_split   	;	}
	public String                        getTrsp_rqst_ord_so_cfm_ind_cd  (){	return trsp_rqst_ord_so_cfm_ind_cd  	;	}
	public String                        getTrsp_rqst_ord_rqst_id        (){	return trsp_rqst_ord_rqst_id        	;	}
	public String                        getTrsp_rqst_ord_pol_cd         (){	return trsp_rqst_ord_pol_cd         	;	}
	public String                        getEai_evnt_dt                  (){	return eai_evnt_dt                  	;	}
	public String                        getTro_cre_usr_id               (){	return tro_cre_usr_id               	;	}
	public String                        getTro_cre_ofc_cd               (){	return tro_cre_ofc_cd               	;	}
	public String                        getTro_cfm_dt                   (){	return tro_cfm_dt                   	;	}

	// setter method is proceeding ..
	public void setIbflag                       ( String                        ibflag                        ){	this.ibflag                        = ibflag                       	;	}
	public void setPage_rows                    ( String                        page_rows                     ){	this.page_rows                     = page_rows                    	;	}
	public void setBkg_no                       ( String                        bkg_no                        ){	this.bkg_no                        = bkg_no                       	;	}
	public void setBkg_no_split                 ( String                        bkg_no_split                  ){	this.bkg_no_split                  = bkg_no_split                 	;	}
	public void setTrsp_rqst_ord_bnd_cd         ( String                        trsp_rqst_ord_bnd_cd          ){	this.trsp_rqst_ord_bnd_cd          = trsp_rqst_ord_bnd_cd         	;	}
	public void setTrsp_sptg_ord_seq            ( String                        trsp_sptg_ord_seq             ){	this.trsp_sptg_ord_seq             = trsp_sptg_ord_seq            	;	}
	public void setRcvde_term_cd                ( String                        rcvde_term_cd                 ){	this.rcvde_term_cd                 = rcvde_term_cd                	;	}
	public void setAct_shpr_seq                 ( String                        act_shpr_seq                  ){	this.act_shpr_seq                  = act_shpr_seq                 	;	}
	public void setAct_shpr_cnt_cd              ( String                        act_shpr_cnt_cd               ){	this.act_shpr_cnt_cd               = act_shpr_cnt_cd              	;	}
	public void setAct_shpr_nm                  ( String                        act_shpr_nm                   ){	this.act_shpr_nm                   = act_shpr_nm                  	;	}
	public void setAct_shpr_phn_no              ( String                        act_shpr_phn_no               ){	this.act_shpr_phn_no               = act_shpr_phn_no              	;	}
	public void setAct_shpr_addr                ( String                        act_shpr_addr                 ){	this.act_shpr_addr                 = act_shpr_addr                	;	}
	public void setAct_shpr_biz_rgst_no         ( String                        act_shpr_biz_rgst_no          ){	this.act_shpr_biz_rgst_no          = act_shpr_biz_rgst_no         	;	}
	public void setDor_loc_cd                   ( String                        dor_loc_cd                    ){	this.dor_loc_cd                    = dor_loc_cd                   	;	}
	public void setDor_pst_no                   ( String                        dor_pst_no                    ){	this.dor_pst_no                    = dor_pst_no                   	;	}
	public void setTrsp_rqst_so_ind_cd          ( String                        trsp_rqst_so_ind_cd           ){	this.trsp_rqst_so_ind_cd           = trsp_rqst_so_ind_cd          	;	}
	public void setCxl_ind_cd                   ( String                        cxl_ind_cd                    ){	this.cxl_ind_cd                    = cxl_ind_cd                   	;	}
	public void setTrsp_rqst_ord_rmk            ( String                        trsp_rqst_ord_rmk             ){	this.trsp_rqst_ord_rmk             = trsp_rqst_ord_rmk            	;	}
	public void setTrsp_rqst_ord_fax_no         ( String                        trsp_rqst_ord_fax_no          ){	this.trsp_rqst_ord_fax_no          = trsp_rqst_ord_fax_no         	;	}
	public void setTrsp_rqst_ord_dt             ( String                        trsp_rqst_ord_dt              ){	this.trsp_rqst_ord_dt              = trsp_rqst_ord_dt             	;	}
	public void setTrsp_rqst_ord_pson_nm        ( String                        trsp_rqst_ord_pson_nm         ){	this.trsp_rqst_ord_pson_nm         = trsp_rqst_ord_pson_nm        	;	}
	public void setTrsp_rqst_ord_ownr_trk_ind_cd( String                        trsp_rqst_ord_ownr_trk_ind_cd ){	this.trsp_rqst_ord_ownr_trk_ind_cd = trsp_rqst_ord_ownr_trk_ind_cd	;	}
	public void setVsl_cd                       ( String                        vsl_cd                        ){	this.vsl_cd                        = vsl_cd                       	;	}
	public void setSkd_voy_no                   ( String                        skd_voy_no                    ){	this.skd_voy_no                    = skd_voy_no                   	;	}
	public void setSkd_dir_cd                   ( String                        skd_dir_cd                    ){	this.skd_dir_cd                    = skd_dir_cd                   	;	}
	public void setTrsp_rqst_ord_pod_cd         ( String                        trsp_rqst_ord_pod_cd          ){	this.trsp_rqst_ord_pod_cd          = trsp_rqst_ord_pod_cd         	;	}
	public void setTrsp_rqst_ord_bkg_no         ( String                        trsp_rqst_ord_bkg_no          ){	this.trsp_rqst_ord_bkg_no          = trsp_rqst_ord_bkg_no         	;	}
	public void setTrsp_rqst_ord_bkg_no_split   ( String                        trsp_rqst_ord_bkg_no_split    ){	this.trsp_rqst_ord_bkg_no_split    = trsp_rqst_ord_bkg_no_split   	;	}
	public void setTrsp_rqst_ord_so_cfm_ind_cd  ( String                        trsp_rqst_ord_so_cfm_ind_cd   ){	this.trsp_rqst_ord_so_cfm_ind_cd   = trsp_rqst_ord_so_cfm_ind_cd  	;	}
	public void setTrsp_rqst_ord_rqst_id        ( String                        trsp_rqst_ord_rqst_id         ){	this.trsp_rqst_ord_rqst_id         = trsp_rqst_ord_rqst_id        	;	}
	public void setTrsp_rqst_ord_pol_cd         ( String                        trsp_rqst_ord_pol_cd          ){	this.trsp_rqst_ord_pol_cd          = trsp_rqst_ord_pol_cd         	;	}
	public void setEai_evnt_dt                  ( String                        eai_evnt_dt                   ){	this.eai_evnt_dt                   = eai_evnt_dt                  	;	}
	public void setTro_cre_usr_id               ( String                        tro_cre_usr_id                ){	this.tro_cre_usr_id                = tro_cre_usr_id               	;	}
	public void setTro_cre_ofc_cd               ( String                        tro_cre_ofc_cd                ){	this.tro_cre_ofc_cd                = tro_cre_ofc_cd               	;	}
	public void setTro_cfm_dt                   ( String                        tro_cfm_dt                    ){	this.tro_cfm_dt                    = tro_cfm_dt                   	;	}

	public static TrsBkgRqstOrdVO fromRequest(HttpServletRequest request) {
		TrsBkgRqstOrdVO model = new TrsBkgRqstOrdVO();
		try {
			model.setIbflag                       	(JSPUtil.getParameter(request, "ibflag                       		".trim(), ""));
			model.setPage_rows                    	(JSPUtil.getParameter(request, "page_rows                    		".trim(), ""));
			model.setBkg_no                       	(JSPUtil.getParameter(request, "bkg_no                       		".trim(), ""));
			model.setBkg_no_split                 	(JSPUtil.getParameter(request, "bkg_no_split                 		".trim(), ""));
			model.setTrsp_rqst_ord_bnd_cd         	(JSPUtil.getParameter(request, "trsp_rqst_ord_bnd_cd         		".trim(), ""));
			model.setTrsp_sptg_ord_seq            	(JSPUtil.getParameter(request, "trsp_sptg_ord_seq            		".trim(), ""));
			model.setRcvde_term_cd                	(JSPUtil.getParameter(request, "rcvde_term_cd                		".trim(), ""));
			model.setAct_shpr_seq                 	(JSPUtil.getParameter(request, "act_shpr_seq                 		".trim(), ""));
			model.setAct_shpr_cnt_cd              	(JSPUtil.getParameter(request, "act_shpr_cnt_cd              		".trim(), ""));
			model.setAct_shpr_nm                  	(JSPUtil.getParameter(request, "act_shpr_nm                  		".trim(), ""));
			model.setAct_shpr_phn_no              	(JSPUtil.getParameter(request, "act_shpr_phn_no              		".trim(), ""));
			model.setAct_shpr_addr                	(JSPUtil.getParameter(request, "act_shpr_addr                		".trim(), ""));
			model.setAct_shpr_biz_rgst_no         	(JSPUtil.getParameter(request, "act_shpr_biz_rgst_no         		".trim(), ""));
			model.setDor_loc_cd                   	(JSPUtil.getParameter(request, "dor_loc_cd                   		".trim(), ""));
			model.setDor_pst_no                   	(JSPUtil.getParameter(request, "dor_pst_no                   		".trim(), ""));
			model.setTrsp_rqst_so_ind_cd          	(JSPUtil.getParameter(request, "trsp_rqst_so_ind_cd          		".trim(), ""));
			model.setCxl_ind_cd                   	(JSPUtil.getParameter(request, "cxl_ind_cd                   		".trim(), ""));
			model.setTrsp_rqst_ord_rmk            	(JSPUtil.getParameter(request, "trsp_rqst_ord_rmk            		".trim(), ""));
			model.setTrsp_rqst_ord_fax_no         	(JSPUtil.getParameter(request, "trsp_rqst_ord_fax_no         		".trim(), ""));
			model.setTrsp_rqst_ord_dt             	(JSPUtil.getParameter(request, "trsp_rqst_ord_dt             		".trim(), ""));
			model.setTrsp_rqst_ord_pson_nm        	(JSPUtil.getParameter(request, "trsp_rqst_ord_pson_nm        		".trim(), ""));
			model.setTrsp_rqst_ord_ownr_trk_ind_cd	(JSPUtil.getParameter(request, "trsp_rqst_ord_ownr_trk_ind_cd		".trim(), ""));
			model.setVsl_cd                       	(JSPUtil.getParameter(request, "vsl_cd                       		".trim(), ""));
			model.setSkd_voy_no                   	(JSPUtil.getParameter(request, "skd_voy_no                   		".trim(), ""));
			model.setSkd_dir_cd                   	(JSPUtil.getParameter(request, "skd_dir_cd                   		".trim(), ""));
			model.setTrsp_rqst_ord_pod_cd         	(JSPUtil.getParameter(request, "trsp_rqst_ord_pod_cd         		".trim(), ""));
			model.setTrsp_rqst_ord_bkg_no         	(JSPUtil.getParameter(request, "trsp_rqst_ord_bkg_no         		".trim(), ""));
			model.setTrsp_rqst_ord_bkg_no_split   	(JSPUtil.getParameter(request, "trsp_rqst_ord_bkg_no_split   		".trim(), ""));
			model.setTrsp_rqst_ord_so_cfm_ind_cd  	(JSPUtil.getParameter(request, "trsp_rqst_ord_so_cfm_ind_cd  		".trim(), ""));
			model.setTrsp_rqst_ord_rqst_id        	(JSPUtil.getParameter(request, "trsp_rqst_ord_rqst_id        		".trim(), ""));
			model.setTrsp_rqst_ord_pol_cd         	(JSPUtil.getParameter(request, "trsp_rqst_ord_pol_cd         		".trim(), ""));
			model.setEai_evnt_dt                  	(JSPUtil.getParameter(request, "eai_evnt_dt                  		".trim(), ""));
			model.setTro_cre_usr_id               	(JSPUtil.getParameter(request, "tro_cre_usr_id               		".trim(), ""));
			model.setTro_cre_ofc_cd               	(JSPUtil.getParameter(request, "tro_cre_ofc_cd               		".trim(), ""));
			model.setTro_cfm_dt                   	(JSPUtil.getParameter(request, "tro_cfm_dt                   		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		TrsBkgRqstOrdVO model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag                        =  (JSPUtil.getParameter(request, "ibflag                       		".trim(), length));
			String[] page_rows                     =  (JSPUtil.getParameter(request, "page_rows                    		".trim(), length));
			String[] bkg_no                        =  (JSPUtil.getParameter(request, "bkg_no                       		".trim(), length));
			String[] bkg_no_split                  =  (JSPUtil.getParameter(request, "bkg_no_split                 		".trim(), length));
			String[] trsp_rqst_ord_bnd_cd          =  (JSPUtil.getParameter(request, "trsp_rqst_ord_bnd_cd         		".trim(), length));
			String[] trsp_sptg_ord_seq             =  (JSPUtil.getParameter(request, "trsp_sptg_ord_seq            		".trim(), length));
			String[] rcvde_term_cd                 =  (JSPUtil.getParameter(request, "rcvde_term_cd                		".trim(), length));
			String[] act_shpr_seq                  =  (JSPUtil.getParameter(request, "act_shpr_seq                 		".trim(), length));
			String[] act_shpr_cnt_cd               =  (JSPUtil.getParameter(request, "act_shpr_cnt_cd              		".trim(), length));
			String[] act_shpr_nm                   =  (JSPUtil.getParameter(request, "act_shpr_nm                  		".trim(), length));
			String[] act_shpr_phn_no               =  (JSPUtil.getParameter(request, "act_shpr_phn_no              		".trim(), length));
			String[] act_shpr_addr                 =  (JSPUtil.getParameter(request, "act_shpr_addr                		".trim(), length));
			String[] act_shpr_biz_rgst_no          =  (JSPUtil.getParameter(request, "act_shpr_biz_rgst_no         		".trim(), length));
			String[] dor_loc_cd                    =  (JSPUtil.getParameter(request, "dor_loc_cd                   		".trim(), length));
			String[] dor_pst_no                    =  (JSPUtil.getParameter(request, "dor_pst_no                   		".trim(), length));
			String[] trsp_rqst_so_ind_cd           =  (JSPUtil.getParameter(request, "trsp_rqst_so_ind_cd          		".trim(), length));
			String[] cxl_ind_cd                    =  (JSPUtil.getParameter(request, "cxl_ind_cd                   		".trim(), length));
			String[] trsp_rqst_ord_rmk             =  (JSPUtil.getParameter(request, "trsp_rqst_ord_rmk            		".trim(), length));
			String[] trsp_rqst_ord_fax_no          =  (JSPUtil.getParameter(request, "trsp_rqst_ord_fax_no         		".trim(), length));
			String[] trsp_rqst_ord_dt              =  (JSPUtil.getParameter(request, "trsp_rqst_ord_dt             		".trim(), length));
			String[] trsp_rqst_ord_pson_nm         =  (JSPUtil.getParameter(request, "trsp_rqst_ord_pson_nm        		".trim(), length));
			String[] trsp_rqst_ord_ownr_trk_ind_cd =  (JSPUtil.getParameter(request, "trsp_rqst_ord_ownr_trk_ind_cd		".trim(), length));
			String[] vsl_cd                        =  (JSPUtil.getParameter(request, "vsl_cd                       		".trim(), length));
			String[] skd_voy_no                    =  (JSPUtil.getParameter(request, "skd_voy_no                   		".trim(), length));
			String[] skd_dir_cd                    =  (JSPUtil.getParameter(request, "skd_dir_cd                   		".trim(), length));
			String[] trsp_rqst_ord_pod_cd          =  (JSPUtil.getParameter(request, "trsp_rqst_ord_pod_cd         		".trim(), length));
			String[] trsp_rqst_ord_bkg_no          =  (JSPUtil.getParameter(request, "trsp_rqst_ord_bkg_no         		".trim(), length));
			String[] trsp_rqst_ord_bkg_no_split    =  (JSPUtil.getParameter(request, "trsp_rqst_ord_bkg_no_split   		".trim(), length));
			String[] trsp_rqst_ord_so_cfm_ind_cd   =  (JSPUtil.getParameter(request, "trsp_rqst_ord_so_cfm_ind_cd  		".trim(), length));
			String[] trsp_rqst_ord_rqst_id         =  (JSPUtil.getParameter(request, "trsp_rqst_ord_rqst_id        		".trim(), length));
			String[] trsp_rqst_ord_pol_cd          =  (JSPUtil.getParameter(request, "trsp_rqst_ord_pol_cd         		".trim(), length));
			String[] eai_evnt_dt                   =  (JSPUtil.getParameter(request, "eai_evnt_dt                  		".trim(), length));
			String[] tro_cre_usr_id                =  (JSPUtil.getParameter(request, "tro_cre_usr_id               		".trim(), length));
			String[] tro_cre_ofc_cd                =  (JSPUtil.getParameter(request, "tro_cre_ofc_cd               		".trim(), length));
			String[] tro_cfm_dt                    =  (JSPUtil.getParameter(request, "tro_cfm_dt                   		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new TrsBkgRqstOrdVO();
				model.setIbflag                       		  (ibflag                       	[i]);
				model.setPage_rows                    		  (page_rows                    	[i]);
				model.setBkg_no                       		  (bkg_no                       	[i]);
				model.setBkg_no_split                 		  (bkg_no_split                 	[i]);
				model.setTrsp_rqst_ord_bnd_cd         		  (trsp_rqst_ord_bnd_cd         	[i]);
				model.setTrsp_sptg_ord_seq            		  (trsp_sptg_ord_seq            	[i]);
				model.setRcvde_term_cd                		  (rcvde_term_cd                	[i]);
				model.setAct_shpr_seq                 		  (act_shpr_seq                 	[i]);
				model.setAct_shpr_cnt_cd              		  (act_shpr_cnt_cd              	[i]);
				model.setAct_shpr_nm                  		  (act_shpr_nm                  	[i]);
				model.setAct_shpr_phn_no              		  (act_shpr_phn_no              	[i]);
				model.setAct_shpr_addr                		  (act_shpr_addr                	[i]);
				model.setAct_shpr_biz_rgst_no         		  (act_shpr_biz_rgst_no         	[i]);
				model.setDor_loc_cd                   		  (dor_loc_cd                   	[i]);
				model.setDor_pst_no                   		  (dor_pst_no                   	[i]);
				model.setTrsp_rqst_so_ind_cd          		  (trsp_rqst_so_ind_cd          	[i]);
				model.setCxl_ind_cd                   		  (cxl_ind_cd                   	[i]);
				model.setTrsp_rqst_ord_rmk            		  (trsp_rqst_ord_rmk            	[i]);
				model.setTrsp_rqst_ord_fax_no         		  (trsp_rqst_ord_fax_no         	[i]);
				model.setTrsp_rqst_ord_dt             		  (trsp_rqst_ord_dt             	[i]);
				model.setTrsp_rqst_ord_pson_nm        		  (trsp_rqst_ord_pson_nm        	[i]);
				model.setTrsp_rqst_ord_ownr_trk_ind_cd		  (trsp_rqst_ord_ownr_trk_ind_cd	[i]);
				model.setVsl_cd                       		  (vsl_cd                       	[i]);
				model.setSkd_voy_no                   		  (skd_voy_no                   	[i]);
				model.setSkd_dir_cd                   		  (skd_dir_cd                   	[i]);
				model.setTrsp_rqst_ord_pod_cd         		  (trsp_rqst_ord_pod_cd         	[i]);
				model.setTrsp_rqst_ord_bkg_no         		  (trsp_rqst_ord_bkg_no         	[i]);
				model.setTrsp_rqst_ord_bkg_no_split   		  (trsp_rqst_ord_bkg_no_split   	[i]);
				model.setTrsp_rqst_ord_so_cfm_ind_cd  		  (trsp_rqst_ord_so_cfm_ind_cd  	[i]);
				model.setTrsp_rqst_ord_rqst_id        		  (trsp_rqst_ord_rqst_id        	[i]);
				model.setTrsp_rqst_ord_pol_cd         		  (trsp_rqst_ord_pol_cd         	[i]);
				model.setEai_evnt_dt                  		  (eai_evnt_dt                  	[i]);
				model.setTro_cre_usr_id               		  (tro_cre_usr_id               	[i]);
				model.setTro_cre_ofc_cd               		  (tro_cre_ofc_cd               	[i]);
				model.setTro_cfm_dt                   		  (tro_cfm_dt                   	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		TrsBkgRqstOrdVO model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues(prefix+"ibflag")==null?0:request.getParameterValues(prefix+"ibflag").length;
		try {
			String[] ibflag                        =  (JSPUtil.getParameter(request, prefix + "ibflag                       		".trim(), length));
			String[] page_rows                     =  (JSPUtil.getParameter(request, prefix + "page_rows                    		".trim(), length));
			String[] bkg_no                        =  (JSPUtil.getParameter(request, prefix + "bkg_no                       		".trim(), length));
			String[] bkg_no_split                  =  (JSPUtil.getParameter(request, prefix + "bkg_no_split                 		".trim(), length));
			String[] trsp_rqst_ord_bnd_cd          =  (JSPUtil.getParameter(request, prefix + "trsp_rqst_ord_bnd_cd         		".trim(), length));
			String[] trsp_sptg_ord_seq             =  (JSPUtil.getParameter(request, prefix + "trsp_sptg_ord_seq            		".trim(), length));
			String[] rcvde_term_cd                 =  (JSPUtil.getParameter(request, prefix + "rcvde_term_cd                		".trim(), length));
			String[] act_shpr_seq                  =  (JSPUtil.getParameter(request, prefix + "act_shpr_seq                 		".trim(), length));
			String[] act_shpr_cnt_cd               =  (JSPUtil.getParameter(request, prefix + "act_shpr_cnt_cd              		".trim(), length));
			String[] act_shpr_nm                   =  (JSPUtil.getParameter(request, prefix + "act_shpr_nm                  		".trim(), length));
			String[] act_shpr_phn_no               =  (JSPUtil.getParameter(request, prefix + "act_shpr_phn_no              		".trim(), length));
			String[] act_shpr_addr                 =  (JSPUtil.getParameter(request, prefix + "act_shpr_addr                		".trim(), length));
			String[] act_shpr_biz_rgst_no          =  (JSPUtil.getParameter(request, prefix + "act_shpr_biz_rgst_no         		".trim(), length));
			String[] dor_loc_cd                    =  (JSPUtil.getParameter(request, prefix + "dor_loc_cd                   		".trim(), length));
			String[] dor_pst_no                    =  (JSPUtil.getParameter(request, prefix + "dor_pst_no                   		".trim(), length));
			String[] trsp_rqst_so_ind_cd           =  (JSPUtil.getParameter(request, prefix + "trsp_rqst_so_ind_cd          		".trim(), length));
			String[] cxl_ind_cd                    =  (JSPUtil.getParameter(request, prefix + "cxl_ind_cd                   		".trim(), length));
			String[] trsp_rqst_ord_rmk             =  (JSPUtil.getParameter(request, prefix + "trsp_rqst_ord_rmk            		".trim(), length));
			String[] trsp_rqst_ord_fax_no          =  (JSPUtil.getParameter(request, prefix + "trsp_rqst_ord_fax_no         		".trim(), length));
			String[] trsp_rqst_ord_dt              =  (JSPUtil.getParameter(request, prefix + "trsp_rqst_ord_dt             		".trim(), length));
			String[] trsp_rqst_ord_pson_nm         =  (JSPUtil.getParameter(request, prefix + "trsp_rqst_ord_pson_nm        		".trim(), length));
			String[] trsp_rqst_ord_ownr_trk_ind_cd =  (JSPUtil.getParameter(request, prefix + "trsp_rqst_ord_ownr_trk_ind_cd		".trim(), length));
			String[] vsl_cd                        =  (JSPUtil.getParameter(request, prefix + "vsl_cd                       		".trim(), length));
			String[] skd_voy_no                    =  (JSPUtil.getParameter(request, prefix + "skd_voy_no                   		".trim(), length));
			String[] skd_dir_cd                    =  (JSPUtil.getParameter(request, prefix + "skd_dir_cd                   		".trim(), length));
			String[] trsp_rqst_ord_pod_cd          =  (JSPUtil.getParameter(request, prefix + "trsp_rqst_ord_pod_cd         		".trim(), length));
			String[] trsp_rqst_ord_bkg_no          =  (JSPUtil.getParameter(request, prefix + "trsp_rqst_ord_bkg_no         		".trim(), length));
			String[] trsp_rqst_ord_bkg_no_split    =  (JSPUtil.getParameter(request, prefix + "trsp_rqst_ord_bkg_no_split   		".trim(), length));
			String[] trsp_rqst_ord_so_cfm_ind_cd   =  (JSPUtil.getParameter(request, prefix + "trsp_rqst_ord_so_cfm_ind_cd  		".trim(), length));
			String[] trsp_rqst_ord_rqst_id         =  (JSPUtil.getParameter(request, prefix + "trsp_rqst_ord_rqst_id        		".trim(), length));
			String[] trsp_rqst_ord_pol_cd          =  (JSPUtil.getParameter(request, prefix + "trsp_rqst_ord_pol_cd         		".trim(), length));
			String[] eai_evnt_dt                   =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt                  		".trim(), length));
			String[] tro_cre_usr_id                =  (JSPUtil.getParameter(request, prefix + "tro_cre_usr_id               		".trim(), length));
			String[] tro_cre_ofc_cd                =  (JSPUtil.getParameter(request, prefix + "tro_cre_ofc_cd               		".trim(), length));
			String[] tro_cfm_dt                    =  (JSPUtil.getParameter(request, prefix + "tro_cfm_dt                   		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new TrsBkgRqstOrdVO();
				model.setIbflag                       		  ( ibflag                       	[i]);
				model.setPage_rows                    		  ( page_rows                    	[i]);
				model.setBkg_no                       		  ( bkg_no                       	[i]);
				model.setBkg_no_split                 		  ( bkg_no_split                 	[i]);
				model.setTrsp_rqst_ord_bnd_cd         		  ( trsp_rqst_ord_bnd_cd         	[i]);
				model.setTrsp_sptg_ord_seq            		  ( trsp_sptg_ord_seq            	[i]);
				model.setRcvde_term_cd                		  ( rcvde_term_cd                	[i]);
				model.setAct_shpr_seq                 		  ( act_shpr_seq                 	[i]);
				model.setAct_shpr_cnt_cd              		  ( act_shpr_cnt_cd              	[i]);
				model.setAct_shpr_nm                  		  ( act_shpr_nm                  	[i]);
				model.setAct_shpr_phn_no              		  ( act_shpr_phn_no              	[i]);
				model.setAct_shpr_addr                		  ( act_shpr_addr                	[i]);
				model.setAct_shpr_biz_rgst_no         		  ( act_shpr_biz_rgst_no         	[i]);
				model.setDor_loc_cd                   		  ( dor_loc_cd                   	[i]);
				model.setDor_pst_no                   		  ( dor_pst_no                   	[i]);
				model.setTrsp_rqst_so_ind_cd          		  ( trsp_rqst_so_ind_cd          	[i]);
				model.setCxl_ind_cd                   		  ( cxl_ind_cd                   	[i]);
				model.setTrsp_rqst_ord_rmk            		  ( trsp_rqst_ord_rmk            	[i]);
				model.setTrsp_rqst_ord_fax_no         		  ( trsp_rqst_ord_fax_no         	[i]);
				model.setTrsp_rqst_ord_dt             		  ( trsp_rqst_ord_dt             	[i]);
				model.setTrsp_rqst_ord_pson_nm        		  ( trsp_rqst_ord_pson_nm        	[i]);
				model.setTrsp_rqst_ord_ownr_trk_ind_cd		  ( trsp_rqst_ord_ownr_trk_ind_cd	[i]);
				model.setVsl_cd                       		  ( vsl_cd                       	[i]);
				model.setSkd_voy_no                   		  ( skd_voy_no                   	[i]);
				model.setSkd_dir_cd                   		  ( skd_dir_cd                   	[i]);
				model.setTrsp_rqst_ord_pod_cd         		  ( trsp_rqst_ord_pod_cd         	[i]);
				model.setTrsp_rqst_ord_bkg_no         		  ( trsp_rqst_ord_bkg_no         	[i]);
				model.setTrsp_rqst_ord_bkg_no_split   		  ( trsp_rqst_ord_bkg_no_split   	[i]);
				model.setTrsp_rqst_ord_so_cfm_ind_cd  		  ( trsp_rqst_ord_so_cfm_ind_cd  	[i]);
				model.setTrsp_rqst_ord_rqst_id        		  ( trsp_rqst_ord_rqst_id        	[i]);
				model.setTrsp_rqst_ord_pol_cd         		  ( trsp_rqst_ord_pol_cd         	[i]);
				model.setEai_evnt_dt                  		  ( eai_evnt_dt                  	[i]);
				model.setTro_cre_usr_id               		  ( tro_cre_usr_id               	[i]);
				model.setTro_cre_ofc_cd               		  ( tro_cre_ofc_cd               	[i]);
				model.setTro_cfm_dt                   		  ( tro_cfm_dt                   	[i]);
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
