/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : VSK_PF_SKD_DTL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2006-12-18
*@LastModifier : Jeongseon An
*@LastVersion : 1.0
* 2006-12-18 Jeongseon An
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
 * @author Jeongseon An
 * @since J2EE 1.4
 */
public final class VSK_PF_SKD_DTL implements java.io.Serializable {

	private String                ibflag                = "";
	private String                page_rows             = "";
	private String                vsl_slan_cd           = "";
	private String                pf_svc_tp_cd          = "";
	private String                port_cd               = "";
	private String                skd_dir_cd            = "";
	private String                clpt_seq              = "";
	private String                port_rotn_seq         = "";
	private String                lnk_dist              = "";
	private String                tztm_hrs              = "";
	private String                lnk_spd               = "";
	private String                ib_ipcgo_qty          = "";
	private String                tml_nm                = "";
	private String                tml_prod_qty          = "";
	private String                act_wrk_hrs           = "";
	private String                etb_dy_cd             = "";
	private String                etb_dy_no             = "";
	private String                etb_tm_hrmnt          = "";
	private String                etd_dy_cd             = "";
	private String                etd_dy_no             = "";
	private String                etd_tm_hrmnt          = "";
	private String                sea_buf_hrs           = "";
	private String                port_buf_hrs          = "";
	private String                nxt_port_cd           = "";
	private String                nxt_skd_dir_cd        = "";
	private String                mnvr_in_hrs           = "";
	private String                mnvr_out_hrs          = "";
	private String                turn_port_flg         = "";
	private String                crr_skd_dir_cd        = "";
	private String                slan_stnd_flg         = "";
	private String                pf_src_tp_cd          = "";
	private String                finc_skd_dir_cd       = "";
	private String                co_ind_cd             = "";
	private String                prod_ocn_rout_use_flg = "";
	private String                nis_evnt_dt           = "";
	private String                sea_buf_spd           = "";
	private String                ib_ocn_cgo_qty        = "";
	private String                ob_ipcgo_qty          = "";
	private String                ob_ocn_cgo_qty        = "";
	private String                crn_knt               = "";
	private String                doc_wrk_hrs           = "";
	private String                nwork_hrs             = "";
	private String                pf_skd_dtl_rmk        = "";

	public VSK_PF_SKD_DTL(){}

	public VSK_PF_SKD_DTL(
			String                ibflag               ,
			String                page_rows            ,
			String                vsl_slan_cd          ,
			String                pf_svc_tp_cd         ,
			String                port_cd              ,
			String                skd_dir_cd           ,
			String                clpt_seq             ,
			String                port_rotn_seq        ,
			String                lnk_dist             ,
			String                tztm_hrs             ,
			String                lnk_spd              ,
			String                ib_ipcgo_qty         ,
			String                tml_nm               ,
			String                tml_prod_qty         ,
			String                act_wrk_hrs          ,
			String                etb_dy_cd            ,
			String                etb_dy_no            ,
			String                etb_tm_hrmnt         ,
			String                etd_dy_cd            ,
			String                etd_dy_no            ,
			String                etd_tm_hrmnt         ,
			String                sea_buf_hrs          ,
			String                port_buf_hrs         ,
			String                nxt_port_cd          ,
			String                nxt_skd_dir_cd       ,
			String                mnvr_in_hrs          ,
			String                mnvr_out_hrs         ,
			String                turn_port_flg        ,
			String                crr_skd_dir_cd       ,
			String                slan_stnd_flg        ,
			String                pf_src_tp_cd         ,
			String                finc_skd_dir_cd      ,
			String                co_ind_cd            ,
			String                prod_ocn_rout_use_flg,
			String                nis_evnt_dt          ,
			String                sea_buf_spd          ,
			String                ib_ocn_cgo_qty       ,
			String                ob_ipcgo_qty         ,
			String                ob_ocn_cgo_qty       ,
			String                crn_knt              ,
			String                doc_wrk_hrs          ,
			String                nwork_hrs            ,
			String                pf_skd_dtl_rmk       ){
		this.ibflag                = ibflag               ;
		this.page_rows             = page_rows            ;
		this.vsl_slan_cd           = vsl_slan_cd          ;
		this.pf_svc_tp_cd          = pf_svc_tp_cd         ;
		this.port_cd               = port_cd              ;
		this.skd_dir_cd            = skd_dir_cd           ;
		this.clpt_seq              = clpt_seq             ;
		this.port_rotn_seq         = port_rotn_seq        ;
		this.lnk_dist              = lnk_dist             ;
		this.tztm_hrs              = tztm_hrs             ;
		this.lnk_spd               = lnk_spd              ;
		this.ib_ipcgo_qty          = ib_ipcgo_qty         ;
		this.tml_nm                = tml_nm               ;
		this.tml_prod_qty          = tml_prod_qty         ;
		this.act_wrk_hrs           = act_wrk_hrs          ;
		this.etb_dy_cd             = etb_dy_cd            ;
		this.etb_dy_no             = etb_dy_no            ;
		this.etb_tm_hrmnt          = etb_tm_hrmnt         ;
		this.etd_dy_cd             = etd_dy_cd            ;
		this.etd_dy_no             = etd_dy_no            ;
		this.etd_tm_hrmnt          = etd_tm_hrmnt         ;
		this.sea_buf_hrs           = sea_buf_hrs          ;
		this.port_buf_hrs          = port_buf_hrs         ;
		this.nxt_port_cd           = nxt_port_cd          ;
		this.nxt_skd_dir_cd        = nxt_skd_dir_cd       ;
		this.mnvr_in_hrs           = mnvr_in_hrs          ;
		this.mnvr_out_hrs          = mnvr_out_hrs         ;
		this.turn_port_flg         = turn_port_flg        ;
		this.crr_skd_dir_cd        = crr_skd_dir_cd       ;
		this.slan_stnd_flg         = slan_stnd_flg        ;
		this.pf_src_tp_cd          = pf_src_tp_cd         ;
		this.finc_skd_dir_cd       = finc_skd_dir_cd      ;
		this.co_ind_cd             = co_ind_cd            ;
		this.prod_ocn_rout_use_flg = prod_ocn_rout_use_flg;
		this.nis_evnt_dt           = nis_evnt_dt          ;
		this.sea_buf_spd           = sea_buf_spd          ;
		this.ib_ocn_cgo_qty        = ib_ocn_cgo_qty       ;
		this.ob_ipcgo_qty          = ob_ipcgo_qty         ;
		this.ob_ocn_cgo_qty        = ob_ocn_cgo_qty       ;
		this.crn_knt               = crn_knt              ;
		this.doc_wrk_hrs           = doc_wrk_hrs          ;
		this.nwork_hrs             = nwork_hrs            ;
		this.pf_skd_dtl_rmk        = pf_skd_dtl_rmk       ;
	}

	// getter method is proceeding ..
	public String                getIbflag               (){	return ibflag               	;	}
	public String                getPage_rows            (){	return page_rows            	;	}
	public String                getVsl_slan_cd          (){	return vsl_slan_cd          	;	}
	public String                getPf_svc_tp_cd         (){	return pf_svc_tp_cd         	;	}
	public String                getPort_cd              (){	return port_cd              	;	}
	public String                getSkd_dir_cd           (){	return skd_dir_cd           	;	}
	public String                getClpt_seq             (){	return clpt_seq             	;	}
	public String                getPort_rotn_seq        (){	return port_rotn_seq        	;	}
	public String                getLnk_dist             (){	return lnk_dist             	;	}
	public String                getTztm_hrs             (){	return tztm_hrs             	;	}
	public String                getLnk_spd              (){	return lnk_spd              	;	}
	public String                getIb_ipcgo_qty         (){	return ib_ipcgo_qty         	;	}
	public String                getTml_nm               (){	return tml_nm               	;	}
	public String                getTml_prod_qty         (){	return tml_prod_qty         	;	}
	public String                getAct_wrk_hrs          (){	return act_wrk_hrs          	;	}
	public String                getEtb_dy_cd            (){	return etb_dy_cd            	;	}
	public String                getEtb_dy_no            (){	return etb_dy_no            	;	}
	public String                getEtb_tm_hrmnt         (){	return etb_tm_hrmnt         	;	}
	public String                getEtd_dy_cd            (){	return etd_dy_cd            	;	}
	public String                getEtd_dy_no            (){	return etd_dy_no            	;	}
	public String                getEtd_tm_hrmnt         (){	return etd_tm_hrmnt         	;	}
	public String                getSea_buf_hrs          (){	return sea_buf_hrs          	;	}
	public String                getPort_buf_hrs         (){	return port_buf_hrs         	;	}
	public String                getNxt_port_cd          (){	return nxt_port_cd          	;	}
	public String                getNxt_skd_dir_cd       (){	return nxt_skd_dir_cd       	;	}
	public String                getMnvr_in_hrs          (){	return mnvr_in_hrs          	;	}
	public String                getMnvr_out_hrs         (){	return mnvr_out_hrs         	;	}
	public String                getTurn_port_flg        (){	return turn_port_flg        	;	}
	public String                getCrr_skd_dir_cd       (){	return crr_skd_dir_cd       	;	}
	public String                getSlan_stnd_flg        (){	return slan_stnd_flg        	;	}
	public String                getPf_src_tp_cd         (){	return pf_src_tp_cd         	;	}
	public String                getFinc_skd_dir_cd      (){	return finc_skd_dir_cd      	;	}
	public String                getCo_ind_cd            (){	return co_ind_cd            	;	}
	public String                getProd_ocn_rout_use_flg(){	return prod_ocn_rout_use_flg	;	}
	public String                getNis_evnt_dt          (){	return nis_evnt_dt          	;	}
	public String                getSea_buf_spd          (){	return sea_buf_spd          	;	}
	public String                getIb_ocn_cgo_qty       (){	return ib_ocn_cgo_qty       	;	}
	public String                getOb_ipcgo_qty         (){	return ob_ipcgo_qty         	;	}
	public String                getOb_ocn_cgo_qty       (){	return ob_ocn_cgo_qty       	;	}
	public String                getCrn_knt              (){	return crn_knt              	;	}
	public String                getDoc_wrk_hrs          (){	return doc_wrk_hrs          	;	}
	public String                getNwork_hrs            (){	return nwork_hrs            	;	}
	public String                getPf_skd_dtl_rmk       (){	return pf_skd_dtl_rmk       	;	}

	// setter method is proceeding ..
	public void setIbflag               ( String                ibflag                ){	this.ibflag                = ibflag               	;	}
	public void setPage_rows            ( String                page_rows             ){	this.page_rows             = page_rows            	;	}
	public void setVsl_slan_cd          ( String                vsl_slan_cd           ){	this.vsl_slan_cd           = vsl_slan_cd          	;	}
	public void setPf_svc_tp_cd         ( String                pf_svc_tp_cd          ){	this.pf_svc_tp_cd          = pf_svc_tp_cd         	;	}
	public void setPort_cd              ( String                port_cd               ){	this.port_cd               = port_cd              	;	}
	public void setSkd_dir_cd           ( String                skd_dir_cd            ){	this.skd_dir_cd            = skd_dir_cd           	;	}
	public void setClpt_seq             ( String                clpt_seq              ){	this.clpt_seq              = clpt_seq             	;	}
	public void setPort_rotn_seq        ( String                port_rotn_seq         ){	this.port_rotn_seq         = port_rotn_seq        	;	}
	public void setLnk_dist             ( String                lnk_dist              ){	this.lnk_dist              = lnk_dist             	;	}
	public void setTztm_hrs             ( String                tztm_hrs              ){	this.tztm_hrs              = tztm_hrs             	;	}
	public void setLnk_spd              ( String                lnk_spd               ){	this.lnk_spd               = lnk_spd              	;	}
	public void setIb_ipcgo_qty         ( String                ib_ipcgo_qty          ){	this.ib_ipcgo_qty          = ib_ipcgo_qty         	;	}
	public void setTml_nm               ( String                tml_nm                ){	this.tml_nm                = tml_nm               	;	}
	public void setTml_prod_qty         ( String                tml_prod_qty          ){	this.tml_prod_qty          = tml_prod_qty         	;	}
	public void setAct_wrk_hrs          ( String                act_wrk_hrs           ){	this.act_wrk_hrs           = act_wrk_hrs          	;	}
	public void setEtb_dy_cd            ( String                etb_dy_cd             ){	this.etb_dy_cd             = etb_dy_cd            	;	}
	public void setEtb_dy_no            ( String                etb_dy_no             ){	this.etb_dy_no             = etb_dy_no            	;	}
	public void setEtb_tm_hrmnt         ( String                etb_tm_hrmnt          ){	this.etb_tm_hrmnt          = etb_tm_hrmnt         	;	}
	public void setEtd_dy_cd            ( String                etd_dy_cd             ){	this.etd_dy_cd             = etd_dy_cd            	;	}
	public void setEtd_dy_no            ( String                etd_dy_no             ){	this.etd_dy_no             = etd_dy_no            	;	}
	public void setEtd_tm_hrmnt         ( String                etd_tm_hrmnt          ){	this.etd_tm_hrmnt          = etd_tm_hrmnt         	;	}
	public void setSea_buf_hrs          ( String                sea_buf_hrs           ){	this.sea_buf_hrs           = sea_buf_hrs          	;	}
	public void setPort_buf_hrs         ( String                port_buf_hrs          ){	this.port_buf_hrs          = port_buf_hrs         	;	}
	public void setNxt_port_cd          ( String                nxt_port_cd           ){	this.nxt_port_cd           = nxt_port_cd          	;	}
	public void setNxt_skd_dir_cd       ( String                nxt_skd_dir_cd        ){	this.nxt_skd_dir_cd        = nxt_skd_dir_cd       	;	}
	public void setMnvr_in_hrs          ( String                mnvr_in_hrs           ){	this.mnvr_in_hrs           = mnvr_in_hrs          	;	}
	public void setMnvr_out_hrs         ( String                mnvr_out_hrs          ){	this.mnvr_out_hrs          = mnvr_out_hrs         	;	}
	public void setTurn_port_flg        ( String                turn_port_flg         ){	this.turn_port_flg         = turn_port_flg        	;	}
	public void setCrr_skd_dir_cd       ( String                crr_skd_dir_cd        ){	this.crr_skd_dir_cd        = crr_skd_dir_cd       	;	}
	public void setSlan_stnd_flg        ( String                slan_stnd_flg         ){	this.slan_stnd_flg         = slan_stnd_flg        	;	}
	public void setPf_src_tp_cd         ( String                pf_src_tp_cd          ){	this.pf_src_tp_cd          = pf_src_tp_cd         	;	}
	public void setFinc_skd_dir_cd      ( String                finc_skd_dir_cd       ){	this.finc_skd_dir_cd       = finc_skd_dir_cd      	;	}
	public void setCo_ind_cd            ( String                co_ind_cd             ){	this.co_ind_cd             = co_ind_cd            	;	}
	public void setProd_ocn_rout_use_flg( String                prod_ocn_rout_use_flg ){	this.prod_ocn_rout_use_flg = prod_ocn_rout_use_flg	;	}
	public void setNis_evnt_dt          ( String                nis_evnt_dt           ){	this.nis_evnt_dt           = nis_evnt_dt          	;	}
	public void setSea_buf_spd          ( String                sea_buf_spd           ){	this.sea_buf_spd           = sea_buf_spd          	;	}
	public void setIb_ocn_cgo_qty       ( String                ib_ocn_cgo_qty        ){	this.ib_ocn_cgo_qty        = ib_ocn_cgo_qty       	;	}
	public void setOb_ipcgo_qty         ( String                ob_ipcgo_qty          ){	this.ob_ipcgo_qty          = ob_ipcgo_qty         	;	}
	public void setOb_ocn_cgo_qty       ( String                ob_ocn_cgo_qty        ){	this.ob_ocn_cgo_qty        = ob_ocn_cgo_qty       	;	}
	public void setCrn_knt              ( String                crn_knt               ){	this.crn_knt               = crn_knt              	;	}
	public void setDoc_wrk_hrs          ( String                doc_wrk_hrs           ){	this.doc_wrk_hrs           = doc_wrk_hrs          	;	}
	public void setNwork_hrs            ( String                nwork_hrs             ){	this.nwork_hrs             = nwork_hrs            	;	}
	public void setPf_skd_dtl_rmk       ( String                pf_skd_dtl_rmk        ){	this.pf_skd_dtl_rmk        = pf_skd_dtl_rmk       	;	}

	public static VSK_PF_SKD_DTL fromRequest(HttpServletRequest request) {
		VSK_PF_SKD_DTL model = new VSK_PF_SKD_DTL();
		try {
			model.setIbflag               	(JSPUtil.getParameter(request, "ibflag               		".trim(), ""));
			model.setPage_rows            	(JSPUtil.getParameter(request, "page_rows            		".trim(), ""));
			model.setVsl_slan_cd          	(JSPUtil.getParameter(request, "vsl_slan_cd          		".trim(), ""));
			model.setPf_svc_tp_cd         	(JSPUtil.getParameter(request, "pf_svc_tp_cd         		".trim(), ""));
			model.setPort_cd              	(JSPUtil.getParameter(request, "port_cd              		".trim(), ""));
			model.setSkd_dir_cd           	(JSPUtil.getParameter(request, "skd_dir_cd           		".trim(), ""));
			model.setClpt_seq             	(JSPUtil.getParameter(request, "clpt_seq             		".trim(), ""));
			model.setPort_rotn_seq        	(JSPUtil.getParameter(request, "port_rotn_seq        		".trim(), ""));
			model.setLnk_dist             	(JSPUtil.getParameter(request, "lnk_dist             		".trim(), ""));
			model.setTztm_hrs             	(JSPUtil.getParameter(request, "tztm_hrs             		".trim(), ""));
			model.setLnk_spd              	(JSPUtil.getParameter(request, "lnk_spd              		".trim(), ""));
			model.setIb_ipcgo_qty         	(JSPUtil.getParameter(request, "ib_ipcgo_qty         		".trim(), ""));
			model.setTml_nm               	(JSPUtil.getParameter(request, "tml_nm               		".trim(), ""));
			model.setTml_prod_qty         	(JSPUtil.getParameter(request, "tml_prod_qty         		".trim(), ""));
			model.setAct_wrk_hrs          	(JSPUtil.getParameter(request, "act_wrk_hrs          		".trim(), ""));
			model.setEtb_dy_cd            	(JSPUtil.getParameter(request, "etb_dy_cd            		".trim(), ""));
			model.setEtb_dy_no            	(JSPUtil.getParameter(request, "etb_dy_no            		".trim(), ""));
			model.setEtb_tm_hrmnt         	(JSPUtil.getParameter(request, "etb_tm_hrmnt         		".trim(), ""));
			model.setEtd_dy_cd            	(JSPUtil.getParameter(request, "etd_dy_cd            		".trim(), ""));
			model.setEtd_dy_no            	(JSPUtil.getParameter(request, "etd_dy_no            		".trim(), ""));
			model.setEtd_tm_hrmnt         	(JSPUtil.getParameter(request, "etd_tm_hrmnt         		".trim(), ""));
			model.setSea_buf_hrs          	(JSPUtil.getParameter(request, "sea_buf_hrs          		".trim(), ""));
			model.setPort_buf_hrs         	(JSPUtil.getParameter(request, "port_buf_hrs         		".trim(), ""));
			model.setNxt_port_cd          	(JSPUtil.getParameter(request, "nxt_port_cd          		".trim(), ""));
			model.setNxt_skd_dir_cd       	(JSPUtil.getParameter(request, "nxt_skd_dir_cd       		".trim(), ""));
			model.setMnvr_in_hrs          	(JSPUtil.getParameter(request, "mnvr_in_hrs          		".trim(), ""));
			model.setMnvr_out_hrs         	(JSPUtil.getParameter(request, "mnvr_out_hrs         		".trim(), ""));
			model.setTurn_port_flg        	(JSPUtil.getParameter(request, "turn_port_flg        		".trim(), ""));
			model.setCrr_skd_dir_cd       	(JSPUtil.getParameter(request, "crr_skd_dir_cd       		".trim(), ""));
			model.setSlan_stnd_flg        	(JSPUtil.getParameter(request, "slan_stnd_flg        		".trim(), ""));
			model.setPf_src_tp_cd         	(JSPUtil.getParameter(request, "pf_src_tp_cd         		".trim(), ""));
			model.setFinc_skd_dir_cd      	(JSPUtil.getParameter(request, "finc_skd_dir_cd      		".trim(), ""));
			model.setCo_ind_cd            	(JSPUtil.getParameter(request, "co_ind_cd            		".trim(), ""));
			model.setProd_ocn_rout_use_flg	(JSPUtil.getParameter(request, "prod_ocn_rout_use_flg		".trim(), ""));
			model.setNis_evnt_dt          	(JSPUtil.getParameter(request, "nis_evnt_dt          		".trim(), ""));
			model.setSea_buf_spd          	(JSPUtil.getParameter(request, "sea_buf_spd          		".trim(), ""));
			model.setIb_ocn_cgo_qty       	(JSPUtil.getParameter(request, "ib_ocn_cgo_qty       		".trim(), ""));
			model.setOb_ipcgo_qty         	(JSPUtil.getParameter(request, "ob_ipcgo_qty         		".trim(), ""));
			model.setOb_ocn_cgo_qty       	(JSPUtil.getParameter(request, "ob_ocn_cgo_qty       		".trim(), ""));
			model.setCrn_knt              	(JSPUtil.getParameter(request, "crn_knt              		".trim(), ""));
			model.setDoc_wrk_hrs          	(JSPUtil.getParameter(request, "doc_wrk_hrs          		".trim(), ""));
			model.setNwork_hrs            	(JSPUtil.getParameter(request, "nwork_hrs            		".trim(), ""));
			model.setPf_skd_dtl_rmk       	(JSPUtil.getParameter(request, "pf_skd_dtl_rmk       		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		VSK_PF_SKD_DTL model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag                =  (JSPUtil.getParameter(request, "ibflag               		".trim(), length));
			String[] page_rows             =  (JSPUtil.getParameter(request, "page_rows            		".trim(), length));
			String[] vsl_slan_cd           =  (JSPUtil.getParameter(request, "vsl_slan_cd          		".trim(), length));
			String[] pf_svc_tp_cd          =  (JSPUtil.getParameter(request, "pf_svc_tp_cd         		".trim(), length));
			String[] port_cd               =  (JSPUtil.getParameter(request, "port_cd              		".trim(), length));
			String[] skd_dir_cd            =  (JSPUtil.getParameter(request, "skd_dir_cd           		".trim(), length));
			String[] clpt_seq              =  (JSPUtil.getParameter(request, "clpt_seq             		".trim(), length));
			String[] port_rotn_seq         =  (JSPUtil.getParameter(request, "port_rotn_seq        		".trim(), length));
			String[] lnk_dist              =  (JSPUtil.getParameter(request, "lnk_dist             		".trim(), length));
			String[] tztm_hrs              =  (JSPUtil.getParameter(request, "tztm_hrs             		".trim(), length));
			String[] lnk_spd               =  (JSPUtil.getParameter(request, "lnk_spd              		".trim(), length));
			String[] ib_ipcgo_qty          =  (JSPUtil.getParameter(request, "ib_ipcgo_qty         		".trim(), length));
			String[] tml_nm                =  (JSPUtil.getParameter(request, "tml_nm               		".trim(), length));
			String[] tml_prod_qty          =  (JSPUtil.getParameter(request, "tml_prod_qty         		".trim(), length));
			String[] act_wrk_hrs           =  (JSPUtil.getParameter(request, "act_wrk_hrs          		".trim(), length));
			String[] etb_dy_cd             =  (JSPUtil.getParameter(request, "etb_dy_cd            		".trim(), length));
			String[] etb_dy_no             =  (JSPUtil.getParameter(request, "etb_dy_no            		".trim(), length));
			String[] etb_tm_hrmnt          =  (JSPUtil.getParameter(request, "etb_tm_hrmnt         		".trim(), length));
			String[] etd_dy_cd             =  (JSPUtil.getParameter(request, "etd_dy_cd            		".trim(), length));
			String[] etd_dy_no             =  (JSPUtil.getParameter(request, "etd_dy_no            		".trim(), length));
			String[] etd_tm_hrmnt          =  (JSPUtil.getParameter(request, "etd_tm_hrmnt         		".trim(), length));
			String[] sea_buf_hrs           =  (JSPUtil.getParameter(request, "sea_buf_hrs          		".trim(), length));
			String[] port_buf_hrs          =  (JSPUtil.getParameter(request, "port_buf_hrs         		".trim(), length));
			String[] nxt_port_cd           =  (JSPUtil.getParameter(request, "nxt_port_cd          		".trim(), length));
			String[] nxt_skd_dir_cd        =  (JSPUtil.getParameter(request, "nxt_skd_dir_cd       		".trim(), length));
			String[] mnvr_in_hrs           =  (JSPUtil.getParameter(request, "mnvr_in_hrs          		".trim(), length));
			String[] mnvr_out_hrs          =  (JSPUtil.getParameter(request, "mnvr_out_hrs         		".trim(), length));
			String[] turn_port_flg         =  (JSPUtil.getParameter(request, "turn_port_flg        		".trim(), length));
			String[] crr_skd_dir_cd        =  (JSPUtil.getParameter(request, "crr_skd_dir_cd       		".trim(), length));
			String[] slan_stnd_flg         =  (JSPUtil.getParameter(request, "slan_stnd_flg        		".trim(), length));
			String[] pf_src_tp_cd          =  (JSPUtil.getParameter(request, "pf_src_tp_cd         		".trim(), length));
			String[] finc_skd_dir_cd       =  (JSPUtil.getParameter(request, "finc_skd_dir_cd      		".trim(), length));
			String[] co_ind_cd             =  (JSPUtil.getParameter(request, "co_ind_cd            		".trim(), length));
			String[] prod_ocn_rout_use_flg =  (JSPUtil.getParameter(request, "prod_ocn_rout_use_flg		".trim(), length));
			String[] nis_evnt_dt           =  (JSPUtil.getParameter(request, "nis_evnt_dt          		".trim(), length));
			String[] sea_buf_spd           =  (JSPUtil.getParameter(request, "sea_buf_spd          		".trim(), length));
			String[] ib_ocn_cgo_qty        =  (JSPUtil.getParameter(request, "ib_ocn_cgo_qty       		".trim(), length));
			String[] ob_ipcgo_qty          =  (JSPUtil.getParameter(request, "ob_ipcgo_qty         		".trim(), length));
			String[] ob_ocn_cgo_qty        =  (JSPUtil.getParameter(request, "ob_ocn_cgo_qty       		".trim(), length));
			String[] crn_knt               =  (JSPUtil.getParameter(request, "crn_knt              		".trim(), length));
			String[] doc_wrk_hrs           =  (JSPUtil.getParameter(request, "doc_wrk_hrs          		".trim(), length));
			String[] nwork_hrs             =  (JSPUtil.getParameter(request, "nwork_hrs            		".trim(), length));
			String[] pf_skd_dtl_rmk        =  (JSPUtil.getParameter(request, "pf_skd_dtl_rmk       		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new VSK_PF_SKD_DTL();
				model.setIbflag               		  (ibflag               	[i]);
				model.setPage_rows            		  (page_rows            	[i]);
				model.setVsl_slan_cd          		  (vsl_slan_cd          	[i]);
				model.setPf_svc_tp_cd         		  (pf_svc_tp_cd         	[i]);
				model.setPort_cd              		  (port_cd              	[i]);
				model.setSkd_dir_cd           		  (skd_dir_cd           	[i]);
				model.setClpt_seq             		  (clpt_seq             	[i]);
				model.setPort_rotn_seq        		  (port_rotn_seq        	[i]);
				model.setLnk_dist             		  (lnk_dist             	[i]);
				model.setTztm_hrs             		  (tztm_hrs             	[i]);
				model.setLnk_spd              		  (lnk_spd              	[i]);
				model.setIb_ipcgo_qty         		  (ib_ipcgo_qty         	[i]);
				model.setTml_nm               		  (tml_nm               	[i]);
				model.setTml_prod_qty         		  (tml_prod_qty         	[i]);
				model.setAct_wrk_hrs          		  (act_wrk_hrs          	[i]);
				model.setEtb_dy_cd            		  (etb_dy_cd            	[i]);
				model.setEtb_dy_no            		  (etb_dy_no            	[i]);
				model.setEtb_tm_hrmnt         		  (etb_tm_hrmnt         	[i]);
				model.setEtd_dy_cd            		  (etd_dy_cd            	[i]);
				model.setEtd_dy_no            		  (etd_dy_no            	[i]);
				model.setEtd_tm_hrmnt         		  (etd_tm_hrmnt         	[i]);
				model.setSea_buf_hrs          		  (sea_buf_hrs          	[i]);
				model.setPort_buf_hrs         		  (port_buf_hrs         	[i]);
				model.setNxt_port_cd          		  (nxt_port_cd          	[i]);
				model.setNxt_skd_dir_cd       		  (nxt_skd_dir_cd       	[i]);
				model.setMnvr_in_hrs          		  (mnvr_in_hrs          	[i]);
				model.setMnvr_out_hrs         		  (mnvr_out_hrs         	[i]);
				model.setTurn_port_flg        		  (turn_port_flg        	[i]);
				model.setCrr_skd_dir_cd       		  (crr_skd_dir_cd       	[i]);
				model.setSlan_stnd_flg        		  (slan_stnd_flg        	[i]);
				model.setPf_src_tp_cd         		  (pf_src_tp_cd         	[i]);
				model.setFinc_skd_dir_cd      		  (finc_skd_dir_cd      	[i]);
				model.setCo_ind_cd            		  (co_ind_cd            	[i]);
				model.setProd_ocn_rout_use_flg		  (prod_ocn_rout_use_flg	[i]);
				model.setNis_evnt_dt          		  (nis_evnt_dt          	[i]);
				model.setSea_buf_spd          		  (sea_buf_spd          	[i]);
				model.setIb_ocn_cgo_qty       		  (ib_ocn_cgo_qty       	[i]);
				model.setOb_ipcgo_qty         		  (ob_ipcgo_qty         	[i]);
				model.setOb_ocn_cgo_qty       		  (ob_ocn_cgo_qty       	[i]);
				model.setCrn_knt              		  (crn_knt              	[i]);
				model.setDoc_wrk_hrs          		  (doc_wrk_hrs          	[i]);
				model.setNwork_hrs            		  (nwork_hrs            	[i]);
				model.setPf_skd_dtl_rmk       		  (pf_skd_dtl_rmk       	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		VSK_PF_SKD_DTL model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag                =  (JSPUtil.getParameter(request, prefix + "ibflag               		".trim(), length));
			String[] page_rows             =  (JSPUtil.getParameter(request, prefix + "page_rows            		".trim(), length));
			String[] vsl_slan_cd           =  (JSPUtil.getParameter(request, prefix + "vsl_slan_cd          		".trim(), length));
			String[] pf_svc_tp_cd          =  (JSPUtil.getParameter(request, prefix + "pf_svc_tp_cd         		".trim(), length));
			String[] port_cd               =  (JSPUtil.getParameter(request, prefix + "port_cd              		".trim(), length));
			String[] skd_dir_cd            =  (JSPUtil.getParameter(request, prefix + "skd_dir_cd           		".trim(), length));
			String[] clpt_seq              =  (JSPUtil.getParameter(request, prefix + "clpt_seq             		".trim(), length));
			String[] port_rotn_seq         =  (JSPUtil.getParameter(request, prefix + "port_rotn_seq        		".trim(), length));
			String[] lnk_dist              =  (JSPUtil.getParameter(request, prefix + "lnk_dist             		".trim(), length));
			String[] tztm_hrs              =  (JSPUtil.getParameter(request, prefix + "tztm_hrs             		".trim(), length));
			String[] lnk_spd               =  (JSPUtil.getParameter(request, prefix + "lnk_spd              		".trim(), length));
			String[] ib_ipcgo_qty          =  (JSPUtil.getParameter(request, prefix + "ib_ipcgo_qty         		".trim(), length));
			String[] tml_nm                =  (JSPUtil.getParameter(request, prefix + "tml_nm               		".trim(), length));
			String[] tml_prod_qty          =  (JSPUtil.getParameter(request, prefix + "tml_prod_qty         		".trim(), length));
			String[] act_wrk_hrs           =  (JSPUtil.getParameter(request, prefix + "act_wrk_hrs          		".trim(), length));
			String[] etb_dy_cd             =  (JSPUtil.getParameter(request, prefix + "etb_dy_cd            		".trim(), length));
			String[] etb_dy_no             =  (JSPUtil.getParameter(request, prefix + "etb_dy_no            		".trim(), length));
			String[] etb_tm_hrmnt          =  (JSPUtil.getParameter(request, prefix + "etb_tm_hrmnt         		".trim(), length));
			String[] etd_dy_cd             =  (JSPUtil.getParameter(request, prefix + "etd_dy_cd            		".trim(), length));
			String[] etd_dy_no             =  (JSPUtil.getParameter(request, prefix + "etd_dy_no            		".trim(), length));
			String[] etd_tm_hrmnt          =  (JSPUtil.getParameter(request, prefix + "etd_tm_hrmnt         		".trim(), length));
			String[] sea_buf_hrs           =  (JSPUtil.getParameter(request, prefix + "sea_buf_hrs          		".trim(), length));
			String[] port_buf_hrs          =  (JSPUtil.getParameter(request, prefix + "port_buf_hrs         		".trim(), length));
			String[] nxt_port_cd           =  (JSPUtil.getParameter(request, prefix + "nxt_port_cd          		".trim(), length));
			String[] nxt_skd_dir_cd        =  (JSPUtil.getParameter(request, prefix + "nxt_skd_dir_cd       		".trim(), length));
			String[] mnvr_in_hrs           =  (JSPUtil.getParameter(request, prefix + "mnvr_in_hrs          		".trim(), length));
			String[] mnvr_out_hrs          =  (JSPUtil.getParameter(request, prefix + "mnvr_out_hrs         		".trim(), length));
			String[] turn_port_flg         =  (JSPUtil.getParameter(request, prefix + "turn_port_flg        		".trim(), length));
			String[] crr_skd_dir_cd        =  (JSPUtil.getParameter(request, prefix + "crr_skd_dir_cd       		".trim(), length));
			String[] slan_stnd_flg         =  (JSPUtil.getParameter(request, prefix + "slan_stnd_flg        		".trim(), length));
			String[] pf_src_tp_cd          =  (JSPUtil.getParameter(request, prefix + "pf_src_tp_cd         		".trim(), length));
			String[] finc_skd_dir_cd       =  (JSPUtil.getParameter(request, prefix + "finc_skd_dir_cd      		".trim(), length));
			String[] co_ind_cd             =  (JSPUtil.getParameter(request, prefix + "co_ind_cd            		".trim(), length));
			String[] prod_ocn_rout_use_flg =  (JSPUtil.getParameter(request, prefix + "prod_ocn_rout_use_flg		".trim(), length));
			String[] nis_evnt_dt           =  (JSPUtil.getParameter(request, prefix + "nis_evnt_dt          		".trim(), length));
			String[] sea_buf_spd           =  (JSPUtil.getParameter(request, prefix + "sea_buf_spd          		".trim(), length));
			String[] ib_ocn_cgo_qty        =  (JSPUtil.getParameter(request, prefix + "ib_ocn_cgo_qty       		".trim(), length));
			String[] ob_ipcgo_qty          =  (JSPUtil.getParameter(request, prefix + "ob_ipcgo_qty         		".trim(), length));
			String[] ob_ocn_cgo_qty        =  (JSPUtil.getParameter(request, prefix + "ob_ocn_cgo_qty       		".trim(), length));
			String[] crn_knt               =  (JSPUtil.getParameter(request, prefix + "crn_knt              		".trim(), length));
			String[] doc_wrk_hrs           =  (JSPUtil.getParameter(request, prefix + "doc_wrk_hrs          		".trim(), length));
			String[] nwork_hrs             =  (JSPUtil.getParameter(request, prefix + "nwork_hrs            		".trim(), length));
			String[] pf_skd_dtl_rmk        =  (JSPUtil.getParameter(request, prefix + "pf_skd_dtl_rmk       		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new VSK_PF_SKD_DTL();
				model.setIbflag               		  ( ibflag               	[i]);
				model.setPage_rows            		  ( page_rows            	[i]);
				model.setVsl_slan_cd          		  ( vsl_slan_cd          	[i]);
				model.setPf_svc_tp_cd         		  ( pf_svc_tp_cd         	[i]);
				model.setPort_cd              		  ( port_cd              	[i]);
				model.setSkd_dir_cd           		  ( skd_dir_cd           	[i]);
				model.setClpt_seq             		  ( clpt_seq             	[i]);
				model.setPort_rotn_seq        		  ( port_rotn_seq        	[i]);
				model.setLnk_dist             		  ( lnk_dist             	[i]);
				model.setTztm_hrs             		  ( tztm_hrs             	[i]);
				model.setLnk_spd              		  ( lnk_spd              	[i]);
				model.setIb_ipcgo_qty         		  ( ib_ipcgo_qty         	[i]);
				model.setTml_nm               		  ( tml_nm               	[i]);
				model.setTml_prod_qty         		  ( tml_prod_qty         	[i]);
				model.setAct_wrk_hrs          		  ( act_wrk_hrs          	[i]);
				model.setEtb_dy_cd            		  ( etb_dy_cd            	[i]);
				model.setEtb_dy_no            		  ( etb_dy_no            	[i]);
				model.setEtb_tm_hrmnt         		  ( etb_tm_hrmnt         	[i]);
				model.setEtd_dy_cd            		  ( etd_dy_cd            	[i]);
				model.setEtd_dy_no            		  ( etd_dy_no            	[i]);
				model.setEtd_tm_hrmnt         		  ( etd_tm_hrmnt         	[i]);
				model.setSea_buf_hrs          		  ( sea_buf_hrs          	[i]);
				model.setPort_buf_hrs         		  ( port_buf_hrs         	[i]);
				model.setNxt_port_cd          		  ( nxt_port_cd          	[i]);
				model.setNxt_skd_dir_cd       		  ( nxt_skd_dir_cd       	[i]);
				model.setMnvr_in_hrs          		  ( mnvr_in_hrs          	[i]);
				model.setMnvr_out_hrs         		  ( mnvr_out_hrs         	[i]);
				model.setTurn_port_flg        		  ( turn_port_flg        	[i]);
				model.setCrr_skd_dir_cd       		  ( crr_skd_dir_cd       	[i]);
				model.setSlan_stnd_flg        		  ( slan_stnd_flg        	[i]);
				model.setPf_src_tp_cd         		  ( pf_src_tp_cd         	[i]);
				model.setFinc_skd_dir_cd      		  ( finc_skd_dir_cd      	[i]);
				model.setCo_ind_cd            		  ( co_ind_cd            	[i]);
				model.setProd_ocn_rout_use_flg		  ( prod_ocn_rout_use_flg	[i]);
				model.setNis_evnt_dt          		  ( nis_evnt_dt          	[i]);
				model.setSea_buf_spd          		  ( sea_buf_spd          	[i]);
				model.setIb_ocn_cgo_qty       		  ( ib_ocn_cgo_qty       	[i]);
				model.setOb_ipcgo_qty         		  ( ob_ipcgo_qty         	[i]);
				model.setOb_ocn_cgo_qty       		  ( ob_ocn_cgo_qty       	[i]);
				model.setCrn_knt              		  ( crn_knt              	[i]);
				model.setDoc_wrk_hrs          		  ( doc_wrk_hrs          	[i]);
				model.setNwork_hrs            		  ( nwork_hrs            	[i]);
				model.setPf_skd_dtl_rmk       		  ( pf_skd_dtl_rmk       	[i]);
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
