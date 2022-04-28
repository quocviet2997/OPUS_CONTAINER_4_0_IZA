/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : SCE_COST_ACT_GRP.java
*@FileTitle : Pending List Inquiry
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-18
*@LastModifier : juhyun
*@LastVersion : 1.0
* 2006-10-18 juhyun
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
 * @author juhyun
 * @since J2EE 1.4
 */
public final class SCE_COST_ACT_GRP implements java.io.Serializable {

	private String                     ibflag                     = "";
	private String                     page_rows                  = "";
	private String                     cop_no                     = "";
	private String                     cost_act_grp_seq           = "";
	private String                     cost_act_grp_cd            = "";
	private String                     cost_act_grp_tp_cd         = "";
	private String                     vsl_slan_cd                = "";
	private String                     ctrl_ofc_cd                = "";
	private String                     pctl_cost_mod_cd           = "";
	private String                     pctl_io_bnd_cd             = "";
	private String                     n1st_nod_cd                = "";
	private String                     n1st_nod_tp_cd             = "";
	private String                     n1st_nod_pln_dt            = "";
	private String                     n2nd_nod_cd                = "";
	private String                     n3rd_nod_cd                = "";
	private String                     n4th_nod_cd                = "";
	private String                     trsp_mod_cd                = "";
	private String                     n1st_lnk_dist              = "";
	private String                     n1st_lnk_dist_ut_cd        = "";
	private String                     n2nd_lnk_dist              = "";
	private String                     n2nd_lnk_dist_ut_cd        = "";
	private String                     n3rd_lnk_dist              = "";
	private String                     n3rd_dist_ut_cd            = "";
	private String                     n1st_vndr_seq              = "";
	private String                     n2nd_vndr_seq              = "";
	private String                     inlnd_rout_inv_bil_patt_cd = "";
	private String                     n3rd_vndr_seq              = "";
	private String                     cust_nomi_trkr_flg         = "";
	private String                     cust_cnt_cd                = "";
	private String                     cust_seq                   = "";
	private String                     pre_nod_cd                 = "";
	private String                     pre_vndr_seq               = "";
	private String                     nxt_nod_cd                 = "";
	private String                     nxt_vndr_seq               = "";
	private String                     trsp_so_sts_cd             = "";
	private String                     trsp_so_ofc_cty_cd         = "";
	private String                     trsp_so_seq                = "";
	private String                     wo_iss_due_dt              = "";
	private String                     cre_usr_id                 = "";
	private String                     cre_dt                     = "";
	private String                     upd_usr_id                 = "";
	private String                     upd_dt                     = "";

	public SCE_COST_ACT_GRP(){}

	public SCE_COST_ACT_GRP(
			String                     ibflag                    ,
			String                     page_rows                 ,
			String                     cop_no                    ,
			String                     cost_act_grp_seq          ,
			String                     cost_act_grp_cd           ,
			String                     cost_act_grp_tp_cd        ,
			String                     vsl_slan_cd               ,
			String                     ctrl_ofc_cd               ,
			String                     pctl_cost_mod_cd          ,
			String                     pctl_io_bnd_cd            ,
			String                     n1st_nod_cd               ,
			String                     n1st_nod_tp_cd            ,
			String                     n1st_nod_pln_dt           ,
			String                     n2nd_nod_cd               ,
			String                     n3rd_nod_cd               ,
			String                     n4th_nod_cd               ,
			String                     trsp_mod_cd               ,
			String                     n1st_lnk_dist             ,
			String                     n1st_lnk_dist_ut_cd       ,
			String                     n2nd_lnk_dist             ,
			String                     n2nd_lnk_dist_ut_cd       ,
			String                     n3rd_lnk_dist             ,
			String                     n3rd_dist_ut_cd           ,
			String                     n1st_vndr_seq             ,
			String                     n2nd_vndr_seq             ,
			String                     inlnd_rout_inv_bil_patt_cd,
			String                     n3rd_vndr_seq             ,
			String                     cust_nomi_trkr_flg        ,
			String                     cust_cnt_cd               ,
			String                     cust_seq                  ,
			String                     pre_nod_cd                ,
			String                     pre_vndr_seq              ,
			String                     nxt_nod_cd                ,
			String                     nxt_vndr_seq              ,
			String                     trsp_so_sts_cd            ,
			String                     trsp_so_ofc_cty_cd        ,
			String                     trsp_so_seq               ,
			String                     wo_iss_due_dt             ,
			String                     cre_usr_id                ,
			String                     cre_dt                    ,
			String                     upd_usr_id                ,
			String                     upd_dt                    ){
		this.ibflag                     = ibflag                    ;
		this.page_rows                  = page_rows                 ;
		this.cop_no                     = cop_no                    ;
		this.cost_act_grp_seq           = cost_act_grp_seq          ;
		this.cost_act_grp_cd            = cost_act_grp_cd           ;
		this.cost_act_grp_tp_cd         = cost_act_grp_tp_cd        ;
		this.vsl_slan_cd                = vsl_slan_cd               ;
		this.ctrl_ofc_cd                = ctrl_ofc_cd               ;
		this.pctl_cost_mod_cd           = pctl_cost_mod_cd          ;
		this.pctl_io_bnd_cd             = pctl_io_bnd_cd            ;
		this.n1st_nod_cd                = n1st_nod_cd               ;
		this.n1st_nod_tp_cd             = n1st_nod_tp_cd            ;
		this.n1st_nod_pln_dt            = n1st_nod_pln_dt           ;
		this.n2nd_nod_cd                = n2nd_nod_cd               ;
		this.n3rd_nod_cd                = n3rd_nod_cd               ;
		this.n4th_nod_cd                = n4th_nod_cd               ;
		this.trsp_mod_cd                = trsp_mod_cd               ;
		this.n1st_lnk_dist              = n1st_lnk_dist             ;
		this.n1st_lnk_dist_ut_cd        = n1st_lnk_dist_ut_cd       ;
		this.n2nd_lnk_dist              = n2nd_lnk_dist             ;
		this.n2nd_lnk_dist_ut_cd        = n2nd_lnk_dist_ut_cd       ;
		this.n3rd_lnk_dist              = n3rd_lnk_dist             ;
		this.n3rd_dist_ut_cd            = n3rd_dist_ut_cd           ;
		this.n1st_vndr_seq              = n1st_vndr_seq             ;
		this.n2nd_vndr_seq              = n2nd_vndr_seq             ;
		this.inlnd_rout_inv_bil_patt_cd = inlnd_rout_inv_bil_patt_cd;
		this.n3rd_vndr_seq              = n3rd_vndr_seq             ;
		this.cust_nomi_trkr_flg         = cust_nomi_trkr_flg        ;
		this.cust_cnt_cd                = cust_cnt_cd               ;
		this.cust_seq                   = cust_seq                  ;
		this.pre_nod_cd                 = pre_nod_cd                ;
		this.pre_vndr_seq               = pre_vndr_seq              ;
		this.nxt_nod_cd                 = nxt_nod_cd                ;
		this.nxt_vndr_seq               = nxt_vndr_seq              ;
		this.trsp_so_sts_cd             = trsp_so_sts_cd            ;
		this.trsp_so_ofc_cty_cd         = trsp_so_ofc_cty_cd        ;
		this.trsp_so_seq                = trsp_so_seq               ;
		this.wo_iss_due_dt              = wo_iss_due_dt             ;
		this.cre_usr_id                 = cre_usr_id                ;
		this.cre_dt                     = cre_dt                    ;
		this.upd_usr_id                 = upd_usr_id                ;
		this.upd_dt                     = upd_dt                    ;
	}

	// getter method is proceeding ..
	public String                     getIbflag                    (){	return ibflag                    	;	}
	public String                     getPage_rows                 (){	return page_rows                 	;	}
	public String                     getCop_no                    (){	return cop_no                    	;	}
	public String                     getCost_act_grp_seq          (){	return cost_act_grp_seq          	;	}
	public String                     getCost_act_grp_cd           (){	return cost_act_grp_cd           	;	}
	public String                     getCost_act_grp_tp_cd        (){	return cost_act_grp_tp_cd        	;	}
	public String                     getVsl_slan_cd               (){	return vsl_slan_cd               	;	}
	public String                     getCtrl_ofc_cd               (){	return ctrl_ofc_cd               	;	}
	public String                     getPctl_cost_mod_cd          (){	return pctl_cost_mod_cd          	;	}
	public String                     getPctl_io_bnd_cd            (){	return pctl_io_bnd_cd            	;	}
	public String                     getN1st_nod_cd               (){	return n1st_nod_cd               	;	}
	public String                     getN1st_nod_tp_cd            (){	return n1st_nod_tp_cd            	;	}
	public String                     getN1st_nod_pln_dt           (){	return n1st_nod_pln_dt           	;	}
	public String                     getN2nd_nod_cd               (){	return n2nd_nod_cd               	;	}
	public String                     getN3rd_nod_cd               (){	return n3rd_nod_cd               	;	}
	public String                     getN4th_nod_cd               (){	return n4th_nod_cd               	;	}
	public String                     getTrsp_mod_cd               (){	return trsp_mod_cd               	;	}
	public String                     getN1st_lnk_dist             (){	return n1st_lnk_dist             	;	}
	public String                     getN1st_lnk_dist_ut_cd       (){	return n1st_lnk_dist_ut_cd       	;	}
	public String                     getN2nd_lnk_dist             (){	return n2nd_lnk_dist             	;	}
	public String                     getN2nd_lnk_dist_ut_cd       (){	return n2nd_lnk_dist_ut_cd       	;	}
	public String                     getN3rd_lnk_dist             (){	return n3rd_lnk_dist             	;	}
	public String                     getN3rd_dist_ut_cd           (){	return n3rd_dist_ut_cd           	;	}
	public String                     getN1st_vndr_seq             (){	return n1st_vndr_seq             	;	}
	public String                     getN2nd_vndr_seq             (){	return n2nd_vndr_seq             	;	}
	public String                     getInlnd_rout_inv_bil_patt_cd(){	return inlnd_rout_inv_bil_patt_cd	;	}
	public String                     getN3rd_vndr_seq             (){	return n3rd_vndr_seq             	;	}
	public String                     getCust_nomi_trkr_flg        (){	return cust_nomi_trkr_flg        	;	}
	public String                     getCust_cnt_cd               (){	return cust_cnt_cd               	;	}
	public String                     getCust_seq                  (){	return cust_seq                  	;	}
	public String                     getPre_nod_cd                (){	return pre_nod_cd                	;	}
	public String                     getPre_vndr_seq              (){	return pre_vndr_seq              	;	}
	public String                     getNxt_nod_cd                (){	return nxt_nod_cd                	;	}
	public String                     getNxt_vndr_seq              (){	return nxt_vndr_seq              	;	}
	public String                     getTrsp_so_sts_cd            (){	return trsp_so_sts_cd            	;	}
	public String                     getTrsp_so_ofc_cty_cd        (){	return trsp_so_ofc_cty_cd        	;	}
	public String                     getTrsp_so_seq               (){	return trsp_so_seq               	;	}
	public String                     getWo_iss_due_dt             (){	return wo_iss_due_dt             	;	}
	public String                     getCre_usr_id                (){	return cre_usr_id                	;	}
	public String                     getCre_dt                    (){	return cre_dt                    	;	}
	public String                     getUpd_usr_id                (){	return upd_usr_id                	;	}
	public String                     getUpd_dt                    (){	return upd_dt                    	;	}

	// setter method is proceeding ..
	public void setIbflag                    ( String                     ibflag                     ){	this.ibflag                     = ibflag                    	;	}
	public void setPage_rows                 ( String                     page_rows                  ){	this.page_rows                  = page_rows                 	;	}
	public void setCop_no                    ( String                     cop_no                     ){	this.cop_no                     = cop_no                    	;	}
	public void setCost_act_grp_seq          ( String                     cost_act_grp_seq           ){	this.cost_act_grp_seq           = cost_act_grp_seq          	;	}
	public void setCost_act_grp_cd           ( String                     cost_act_grp_cd            ){	this.cost_act_grp_cd            = cost_act_grp_cd           	;	}
	public void setCost_act_grp_tp_cd        ( String                     cost_act_grp_tp_cd         ){	this.cost_act_grp_tp_cd         = cost_act_grp_tp_cd        	;	}
	public void setVsl_slan_cd               ( String                     vsl_slan_cd                ){	this.vsl_slan_cd                = vsl_slan_cd               	;	}
	public void setCtrl_ofc_cd               ( String                     ctrl_ofc_cd                ){	this.ctrl_ofc_cd                = ctrl_ofc_cd               	;	}
	public void setPctl_cost_mod_cd          ( String                     pctl_cost_mod_cd           ){	this.pctl_cost_mod_cd           = pctl_cost_mod_cd          	;	}
	public void setPctl_io_bnd_cd            ( String                     pctl_io_bnd_cd             ){	this.pctl_io_bnd_cd             = pctl_io_bnd_cd            	;	}
	public void setN1st_nod_cd               ( String                     n1st_nod_cd                ){	this.n1st_nod_cd                = n1st_nod_cd               	;	}
	public void setN1st_nod_tp_cd            ( String                     n1st_nod_tp_cd             ){	this.n1st_nod_tp_cd             = n1st_nod_tp_cd            	;	}
	public void setN1st_nod_pln_dt           ( String                     n1st_nod_pln_dt            ){	this.n1st_nod_pln_dt            = n1st_nod_pln_dt           	;	}
	public void setN2nd_nod_cd               ( String                     n2nd_nod_cd                ){	this.n2nd_nod_cd                = n2nd_nod_cd               	;	}
	public void setN3rd_nod_cd               ( String                     n3rd_nod_cd                ){	this.n3rd_nod_cd                = n3rd_nod_cd               	;	}
	public void setN4th_nod_cd               ( String                     n4th_nod_cd                ){	this.n4th_nod_cd                = n4th_nod_cd               	;	}
	public void setTrsp_mod_cd               ( String                     trsp_mod_cd                ){	this.trsp_mod_cd                = trsp_mod_cd               	;	}
	public void setN1st_lnk_dist             ( String                     n1st_lnk_dist              ){	this.n1st_lnk_dist              = n1st_lnk_dist             	;	}
	public void setN1st_lnk_dist_ut_cd       ( String                     n1st_lnk_dist_ut_cd        ){	this.n1st_lnk_dist_ut_cd        = n1st_lnk_dist_ut_cd       	;	}
	public void setN2nd_lnk_dist             ( String                     n2nd_lnk_dist              ){	this.n2nd_lnk_dist              = n2nd_lnk_dist             	;	}
	public void setN2nd_lnk_dist_ut_cd       ( String                     n2nd_lnk_dist_ut_cd        ){	this.n2nd_lnk_dist_ut_cd        = n2nd_lnk_dist_ut_cd       	;	}
	public void setN3rd_lnk_dist             ( String                     n3rd_lnk_dist              ){	this.n3rd_lnk_dist              = n3rd_lnk_dist             	;	}
	public void setN3rd_dist_ut_cd           ( String                     n3rd_dist_ut_cd            ){	this.n3rd_dist_ut_cd            = n3rd_dist_ut_cd           	;	}
	public void setN1st_vndr_seq             ( String                     n1st_vndr_seq              ){	this.n1st_vndr_seq              = n1st_vndr_seq             	;	}
	public void setN2nd_vndr_seq             ( String                     n2nd_vndr_seq              ){	this.n2nd_vndr_seq              = n2nd_vndr_seq             	;	}
	public void setInlnd_rout_inv_bil_patt_cd( String                     inlnd_rout_inv_bil_patt_cd ){	this.inlnd_rout_inv_bil_patt_cd = inlnd_rout_inv_bil_patt_cd	;	}
	public void setN3rd_vndr_seq             ( String                     n3rd_vndr_seq              ){	this.n3rd_vndr_seq              = n3rd_vndr_seq             	;	}
	public void setCust_nomi_trkr_flg        ( String                     cust_nomi_trkr_flg         ){	this.cust_nomi_trkr_flg         = cust_nomi_trkr_flg        	;	}
	public void setCust_cnt_cd               ( String                     cust_cnt_cd                ){	this.cust_cnt_cd                = cust_cnt_cd               	;	}
	public void setCust_seq                  ( String                     cust_seq                   ){	this.cust_seq                   = cust_seq                  	;	}
	public void setPre_nod_cd                ( String                     pre_nod_cd                 ){	this.pre_nod_cd                 = pre_nod_cd                	;	}
	public void setPre_vndr_seq              ( String                     pre_vndr_seq               ){	this.pre_vndr_seq               = pre_vndr_seq              	;	}
	public void setNxt_nod_cd                ( String                     nxt_nod_cd                 ){	this.nxt_nod_cd                 = nxt_nod_cd                	;	}
	public void setNxt_vndr_seq              ( String                     nxt_vndr_seq               ){	this.nxt_vndr_seq               = nxt_vndr_seq              	;	}
	public void setTrsp_so_sts_cd            ( String                     trsp_so_sts_cd             ){	this.trsp_so_sts_cd             = trsp_so_sts_cd            	;	}
	public void setTrsp_so_ofc_cty_cd        ( String                     trsp_so_ofc_cty_cd         ){	this.trsp_so_ofc_cty_cd         = trsp_so_ofc_cty_cd        	;	}
	public void setTrsp_so_seq               ( String                     trsp_so_seq                ){	this.trsp_so_seq                = trsp_so_seq               	;	}
	public void setWo_iss_due_dt             ( String                     wo_iss_due_dt              ){	this.wo_iss_due_dt              = wo_iss_due_dt             	;	}
	public void setCre_usr_id                ( String                     cre_usr_id                 ){	this.cre_usr_id                 = cre_usr_id                	;	}
	public void setCre_dt                    ( String                     cre_dt                     ){	this.cre_dt                     = cre_dt                    	;	}
	public void setUpd_usr_id                ( String                     upd_usr_id                 ){	this.upd_usr_id                 = upd_usr_id                	;	}
	public void setUpd_dt                    ( String                     upd_dt                     ){	this.upd_dt                     = upd_dt                    	;	}

	public static SCE_COST_ACT_GRP fromRequest(HttpServletRequest request) {
		SCE_COST_ACT_GRP model = new SCE_COST_ACT_GRP();
		try {
			model.setIbflag                    	(JSPUtil.getParameter(request, "ibflag                    		".trim(), ""));
			model.setPage_rows                 	(JSPUtil.getParameter(request, "page_rows                 		".trim(), ""));
			model.setCop_no                    	(JSPUtil.getParameter(request, "cop_no                    		".trim(), ""));
			model.setCost_act_grp_seq          	(JSPUtil.getParameter(request, "cost_act_grp_seq          		".trim(), ""));
			model.setCost_act_grp_cd           	(JSPUtil.getParameter(request, "cost_act_grp_cd           		".trim(), ""));
			model.setCost_act_grp_tp_cd        	(JSPUtil.getParameter(request, "cost_act_grp_tp_cd        		".trim(), ""));
			model.setVsl_slan_cd               	(JSPUtil.getParameter(request, "vsl_slan_cd               		".trim(), ""));
			model.setCtrl_ofc_cd               	(JSPUtil.getParameter(request, "ctrl_ofc_cd               		".trim(), ""));
			model.setPctl_cost_mod_cd          	(JSPUtil.getParameter(request, "pctl_cost_mod_cd          		".trim(), ""));
			model.setPctl_io_bnd_cd            	(JSPUtil.getParameter(request, "pctl_io_bnd_cd            		".trim(), ""));
			model.setN1st_nod_cd               	(JSPUtil.getParameter(request, "n1st_nod_cd               		".trim(), ""));
			model.setN1st_nod_tp_cd            	(JSPUtil.getParameter(request, "n1st_nod_tp_cd            		".trim(), ""));
			model.setN1st_nod_pln_dt           	(JSPUtil.getParameter(request, "n1st_nod_pln_dt           		".trim(), ""));
			model.setN2nd_nod_cd               	(JSPUtil.getParameter(request, "n2nd_nod_cd               		".trim(), ""));
			model.setN3rd_nod_cd               	(JSPUtil.getParameter(request, "n3rd_nod_cd               		".trim(), ""));
			model.setN4th_nod_cd               	(JSPUtil.getParameter(request, "n4th_nod_cd               		".trim(), ""));
			model.setTrsp_mod_cd               	(JSPUtil.getParameter(request, "trsp_mod_cd               		".trim(), ""));
			model.setN1st_lnk_dist             	(JSPUtil.getParameter(request, "n1st_lnk_dist             		".trim(), ""));
			model.setN1st_lnk_dist_ut_cd       	(JSPUtil.getParameter(request, "n1st_lnk_dist_ut_cd       		".trim(), ""));
			model.setN2nd_lnk_dist             	(JSPUtil.getParameter(request, "n2nd_lnk_dist             		".trim(), ""));
			model.setN2nd_lnk_dist_ut_cd       	(JSPUtil.getParameter(request, "n2nd_lnk_dist_ut_cd       		".trim(), ""));
			model.setN3rd_lnk_dist             	(JSPUtil.getParameter(request, "n3rd_lnk_dist             		".trim(), ""));
			model.setN3rd_dist_ut_cd           	(JSPUtil.getParameter(request, "n3rd_dist_ut_cd           		".trim(), ""));
			model.setN1st_vndr_seq             	(JSPUtil.getParameter(request, "n1st_vndr_seq             		".trim(), ""));
			model.setN2nd_vndr_seq             	(JSPUtil.getParameter(request, "n2nd_vndr_seq             		".trim(), ""));
			model.setInlnd_rout_inv_bil_patt_cd	(JSPUtil.getParameter(request, "inlnd_rout_inv_bil_patt_cd		".trim(), ""));
			model.setN3rd_vndr_seq             	(JSPUtil.getParameter(request, "n3rd_vndr_seq             		".trim(), ""));
			model.setCust_nomi_trkr_flg        	(JSPUtil.getParameter(request, "cust_nomi_trkr_flg        		".trim(), ""));
			model.setCust_cnt_cd               	(JSPUtil.getParameter(request, "cust_cnt_cd               		".trim(), ""));
			model.setCust_seq                  	(JSPUtil.getParameter(request, "cust_seq                  		".trim(), ""));
			model.setPre_nod_cd                	(JSPUtil.getParameter(request, "pre_nod_cd                		".trim(), ""));
			model.setPre_vndr_seq              	(JSPUtil.getParameter(request, "pre_vndr_seq              		".trim(), ""));
			model.setNxt_nod_cd                	(JSPUtil.getParameter(request, "nxt_nod_cd                		".trim(), ""));
			model.setNxt_vndr_seq              	(JSPUtil.getParameter(request, "nxt_vndr_seq              		".trim(), ""));
			model.setTrsp_so_sts_cd            	(JSPUtil.getParameter(request, "trsp_so_sts_cd            		".trim(), ""));
			model.setTrsp_so_ofc_cty_cd        	(JSPUtil.getParameter(request, "trsp_so_ofc_cty_cd        		".trim(), ""));
			model.setTrsp_so_seq               	(JSPUtil.getParameter(request, "trsp_so_seq               		".trim(), ""));
			model.setWo_iss_due_dt             	(JSPUtil.getParameter(request, "wo_iss_due_dt             		".trim(), ""));
			model.setCre_usr_id                	(JSPUtil.getParameter(request, "cre_usr_id                		".trim(), ""));
			model.setCre_dt                    	(JSPUtil.getParameter(request, "cre_dt                    		".trim(), ""));
			model.setUpd_usr_id                	(JSPUtil.getParameter(request, "upd_usr_id                		".trim(), ""));
			model.setUpd_dt                    	(JSPUtil.getParameter(request, "upd_dt                    		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		SCE_COST_ACT_GRP model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag                     =  (JSPUtil.getParameter(request, "ibflag                    		".trim(), length));
			String[] page_rows                  =  (JSPUtil.getParameter(request, "page_rows                 		".trim(), length));
			String[] cop_no                     =  (JSPUtil.getParameter(request, "cop_no                    		".trim(), length));
			String[] cost_act_grp_seq           =  (JSPUtil.getParameter(request, "cost_act_grp_seq          		".trim(), length));
			String[] cost_act_grp_cd            =  (JSPUtil.getParameter(request, "cost_act_grp_cd           		".trim(), length));
			String[] cost_act_grp_tp_cd         =  (JSPUtil.getParameter(request, "cost_act_grp_tp_cd        		".trim(), length));
			String[] vsl_slan_cd                =  (JSPUtil.getParameter(request, "vsl_slan_cd               		".trim(), length));
			String[] ctrl_ofc_cd                =  (JSPUtil.getParameter(request, "ctrl_ofc_cd               		".trim(), length));
			String[] pctl_cost_mod_cd           =  (JSPUtil.getParameter(request, "pctl_cost_mod_cd          		".trim(), length));
			String[] pctl_io_bnd_cd             =  (JSPUtil.getParameter(request, "pctl_io_bnd_cd            		".trim(), length));
			String[] n1st_nod_cd                =  (JSPUtil.getParameter(request, "n1st_nod_cd               		".trim(), length));
			String[] n1st_nod_tp_cd             =  (JSPUtil.getParameter(request, "n1st_nod_tp_cd            		".trim(), length));
			String[] n1st_nod_pln_dt            =  (JSPUtil.getParameter(request, "n1st_nod_pln_dt           		".trim(), length));
			String[] n2nd_nod_cd                =  (JSPUtil.getParameter(request, "n2nd_nod_cd               		".trim(), length));
			String[] n3rd_nod_cd                =  (JSPUtil.getParameter(request, "n3rd_nod_cd               		".trim(), length));
			String[] n4th_nod_cd                =  (JSPUtil.getParameter(request, "n4th_nod_cd               		".trim(), length));
			String[] trsp_mod_cd                =  (JSPUtil.getParameter(request, "trsp_mod_cd               		".trim(), length));
			String[] n1st_lnk_dist              =  (JSPUtil.getParameter(request, "n1st_lnk_dist             		".trim(), length));
			String[] n1st_lnk_dist_ut_cd        =  (JSPUtil.getParameter(request, "n1st_lnk_dist_ut_cd       		".trim(), length));
			String[] n2nd_lnk_dist              =  (JSPUtil.getParameter(request, "n2nd_lnk_dist             		".trim(), length));
			String[] n2nd_lnk_dist_ut_cd        =  (JSPUtil.getParameter(request, "n2nd_lnk_dist_ut_cd       		".trim(), length));
			String[] n3rd_lnk_dist              =  (JSPUtil.getParameter(request, "n3rd_lnk_dist             		".trim(), length));
			String[] n3rd_dist_ut_cd            =  (JSPUtil.getParameter(request, "n3rd_dist_ut_cd           		".trim(), length));
			String[] n1st_vndr_seq              =  (JSPUtil.getParameter(request, "n1st_vndr_seq             		".trim(), length));
			String[] n2nd_vndr_seq              =  (JSPUtil.getParameter(request, "n2nd_vndr_seq             		".trim(), length));
			String[] inlnd_rout_inv_bil_patt_cd =  (JSPUtil.getParameter(request, "inlnd_rout_inv_bil_patt_cd		".trim(), length));
			String[] n3rd_vndr_seq              =  (JSPUtil.getParameter(request, "n3rd_vndr_seq             		".trim(), length));
			String[] cust_nomi_trkr_flg         =  (JSPUtil.getParameter(request, "cust_nomi_trkr_flg        		".trim(), length));
			String[] cust_cnt_cd                =  (JSPUtil.getParameter(request, "cust_cnt_cd               		".trim(), length));
			String[] cust_seq                   =  (JSPUtil.getParameter(request, "cust_seq                  		".trim(), length));
			String[] pre_nod_cd                 =  (JSPUtil.getParameter(request, "pre_nod_cd                		".trim(), length));
			String[] pre_vndr_seq               =  (JSPUtil.getParameter(request, "pre_vndr_seq              		".trim(), length));
			String[] nxt_nod_cd                 =  (JSPUtil.getParameter(request, "nxt_nod_cd                		".trim(), length));
			String[] nxt_vndr_seq               =  (JSPUtil.getParameter(request, "nxt_vndr_seq              		".trim(), length));
			String[] trsp_so_sts_cd             =  (JSPUtil.getParameter(request, "trsp_so_sts_cd            		".trim(), length));
			String[] trsp_so_ofc_cty_cd         =  (JSPUtil.getParameter(request, "trsp_so_ofc_cty_cd        		".trim(), length));
			String[] trsp_so_seq                =  (JSPUtil.getParameter(request, "trsp_so_seq               		".trim(), length));
			String[] wo_iss_due_dt              =  (JSPUtil.getParameter(request, "wo_iss_due_dt             		".trim(), length));
			String[] cre_usr_id                 =  (JSPUtil.getParameter(request, "cre_usr_id                		".trim(), length));
			String[] cre_dt                     =  (JSPUtil.getParameter(request, "cre_dt                    		".trim(), length));
			String[] upd_usr_id                 =  (JSPUtil.getParameter(request, "upd_usr_id                		".trim(), length));
			String[] upd_dt                     =  (JSPUtil.getParameter(request, "upd_dt                    		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new SCE_COST_ACT_GRP();
				model.setIbflag                    		  (ibflag                    	[i]);
				model.setPage_rows                 		  (page_rows                 	[i]);
				model.setCop_no                    		  (cop_no                    	[i]);
				model.setCost_act_grp_seq          		  (cost_act_grp_seq          	[i]);
				model.setCost_act_grp_cd           		  (cost_act_grp_cd           	[i]);
				model.setCost_act_grp_tp_cd        		  (cost_act_grp_tp_cd        	[i]);
				model.setVsl_slan_cd               		  (vsl_slan_cd               	[i]);
				model.setCtrl_ofc_cd               		  (ctrl_ofc_cd               	[i]);
				model.setPctl_cost_mod_cd          		  (pctl_cost_mod_cd          	[i]);
				model.setPctl_io_bnd_cd            		  (pctl_io_bnd_cd            	[i]);
				model.setN1st_nod_cd               		  (n1st_nod_cd               	[i]);
				model.setN1st_nod_tp_cd            		  (n1st_nod_tp_cd            	[i]);
				model.setN1st_nod_pln_dt           		  (n1st_nod_pln_dt           	[i]);
				model.setN2nd_nod_cd               		  (n2nd_nod_cd               	[i]);
				model.setN3rd_nod_cd               		  (n3rd_nod_cd               	[i]);
				model.setN4th_nod_cd               		  (n4th_nod_cd               	[i]);
				model.setTrsp_mod_cd               		  (trsp_mod_cd               	[i]);
				model.setN1st_lnk_dist             		  (n1st_lnk_dist             	[i]);
				model.setN1st_lnk_dist_ut_cd       		  (n1st_lnk_dist_ut_cd       	[i]);
				model.setN2nd_lnk_dist             		  (n2nd_lnk_dist             	[i]);
				model.setN2nd_lnk_dist_ut_cd       		  (n2nd_lnk_dist_ut_cd       	[i]);
				model.setN3rd_lnk_dist             		  (n3rd_lnk_dist             	[i]);
				model.setN3rd_dist_ut_cd           		  (n3rd_dist_ut_cd           	[i]);
				model.setN1st_vndr_seq             		  (n1st_vndr_seq             	[i]);
				model.setN2nd_vndr_seq             		  (n2nd_vndr_seq             	[i]);
				model.setInlnd_rout_inv_bil_patt_cd		  (inlnd_rout_inv_bil_patt_cd	[i]);
				model.setN3rd_vndr_seq             		  (n3rd_vndr_seq             	[i]);
				model.setCust_nomi_trkr_flg        		  (cust_nomi_trkr_flg        	[i]);
				model.setCust_cnt_cd               		  (cust_cnt_cd               	[i]);
				model.setCust_seq                  		  (cust_seq                  	[i]);
				model.setPre_nod_cd                		  (pre_nod_cd                	[i]);
				model.setPre_vndr_seq              		  (pre_vndr_seq              	[i]);
				model.setNxt_nod_cd                		  (nxt_nod_cd                	[i]);
				model.setNxt_vndr_seq              		  (nxt_vndr_seq              	[i]);
				model.setTrsp_so_sts_cd            		  (trsp_so_sts_cd            	[i]);
				model.setTrsp_so_ofc_cty_cd        		  (trsp_so_ofc_cty_cd        	[i]);
				model.setTrsp_so_seq               		  (trsp_so_seq               	[i]);
				model.setWo_iss_due_dt             		  (wo_iss_due_dt             	[i]);
				model.setCre_usr_id                		  (cre_usr_id                	[i]);
				model.setCre_dt                    		  (cre_dt                    	[i]);
				model.setUpd_usr_id                		  (upd_usr_id                	[i]);
				model.setUpd_dt                    		  (upd_dt                    	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		SCE_COST_ACT_GRP model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag                     =  (JSPUtil.getParameter(request, prefix + "ibflag                    		".trim(), length));
			String[] page_rows                  =  (JSPUtil.getParameter(request, prefix + "page_rows                 		".trim(), length));
			String[] cop_no                     =  (JSPUtil.getParameter(request, prefix + "cop_no                    		".trim(), length));
			String[] cost_act_grp_seq           =  (JSPUtil.getParameter(request, prefix + "cost_act_grp_seq          		".trim(), length));
			String[] cost_act_grp_cd            =  (JSPUtil.getParameter(request, prefix + "cost_act_grp_cd           		".trim(), length));
			String[] cost_act_grp_tp_cd         =  (JSPUtil.getParameter(request, prefix + "cost_act_grp_tp_cd        		".trim(), length));
			String[] vsl_slan_cd                =  (JSPUtil.getParameter(request, prefix + "vsl_slan_cd               		".trim(), length));
			String[] ctrl_ofc_cd                =  (JSPUtil.getParameter(request, prefix + "ctrl_ofc_cd               		".trim(), length));
			String[] pctl_cost_mod_cd           =  (JSPUtil.getParameter(request, prefix + "pctl_cost_mod_cd          		".trim(), length));
			String[] pctl_io_bnd_cd             =  (JSPUtil.getParameter(request, prefix + "pctl_io_bnd_cd            		".trim(), length));
			String[] n1st_nod_cd                =  (JSPUtil.getParameter(request, prefix + "n1st_nod_cd               		".trim(), length));
			String[] n1st_nod_tp_cd             =  (JSPUtil.getParameter(request, prefix + "n1st_nod_tp_cd            		".trim(), length));
			String[] n1st_nod_pln_dt            =  (JSPUtil.getParameter(request, prefix + "n1st_nod_pln_dt           		".trim(), length));
			String[] n2nd_nod_cd                =  (JSPUtil.getParameter(request, prefix + "n2nd_nod_cd               		".trim(), length));
			String[] n3rd_nod_cd                =  (JSPUtil.getParameter(request, prefix + "n3rd_nod_cd               		".trim(), length));
			String[] n4th_nod_cd                =  (JSPUtil.getParameter(request, prefix + "n4th_nod_cd               		".trim(), length));
			String[] trsp_mod_cd                =  (JSPUtil.getParameter(request, prefix + "trsp_mod_cd               		".trim(), length));
			String[] n1st_lnk_dist              =  (JSPUtil.getParameter(request, prefix + "n1st_lnk_dist             		".trim(), length));
			String[] n1st_lnk_dist_ut_cd        =  (JSPUtil.getParameter(request, prefix + "n1st_lnk_dist_ut_cd       		".trim(), length));
			String[] n2nd_lnk_dist              =  (JSPUtil.getParameter(request, prefix + "n2nd_lnk_dist             		".trim(), length));
			String[] n2nd_lnk_dist_ut_cd        =  (JSPUtil.getParameter(request, prefix + "n2nd_lnk_dist_ut_cd       		".trim(), length));
			String[] n3rd_lnk_dist              =  (JSPUtil.getParameter(request, prefix + "n3rd_lnk_dist             		".trim(), length));
			String[] n3rd_dist_ut_cd            =  (JSPUtil.getParameter(request, prefix + "n3rd_dist_ut_cd           		".trim(), length));
			String[] n1st_vndr_seq              =  (JSPUtil.getParameter(request, prefix + "n1st_vndr_seq             		".trim(), length));
			String[] n2nd_vndr_seq              =  (JSPUtil.getParameter(request, prefix + "n2nd_vndr_seq             		".trim(), length));
			String[] inlnd_rout_inv_bil_patt_cd =  (JSPUtil.getParameter(request, prefix + "inlnd_rout_inv_bil_patt_cd		".trim(), length));
			String[] n3rd_vndr_seq              =  (JSPUtil.getParameter(request, prefix + "n3rd_vndr_seq             		".trim(), length));
			String[] cust_nomi_trkr_flg         =  (JSPUtil.getParameter(request, prefix + "cust_nomi_trkr_flg        		".trim(), length));
			String[] cust_cnt_cd                =  (JSPUtil.getParameter(request, prefix + "cust_cnt_cd               		".trim(), length));
			String[] cust_seq                   =  (JSPUtil.getParameter(request, prefix + "cust_seq                  		".trim(), length));
			String[] pre_nod_cd                 =  (JSPUtil.getParameter(request, prefix + "pre_nod_cd                		".trim(), length));
			String[] pre_vndr_seq               =  (JSPUtil.getParameter(request, prefix + "pre_vndr_seq              		".trim(), length));
			String[] nxt_nod_cd                 =  (JSPUtil.getParameter(request, prefix + "nxt_nod_cd                		".trim(), length));
			String[] nxt_vndr_seq               =  (JSPUtil.getParameter(request, prefix + "nxt_vndr_seq              		".trim(), length));
			String[] trsp_so_sts_cd             =  (JSPUtil.getParameter(request, prefix + "trsp_so_sts_cd            		".trim(), length));
			String[] trsp_so_ofc_cty_cd         =  (JSPUtil.getParameter(request, prefix + "trsp_so_ofc_cty_cd        		".trim(), length));
			String[] trsp_so_seq                =  (JSPUtil.getParameter(request, prefix + "trsp_so_seq               		".trim(), length));
			String[] wo_iss_due_dt              =  (JSPUtil.getParameter(request, prefix + "wo_iss_due_dt             		".trim(), length));
			String[] cre_usr_id                 =  (JSPUtil.getParameter(request, prefix + "cre_usr_id                		".trim(), length));
			String[] cre_dt                     =  (JSPUtil.getParameter(request, prefix + "cre_dt                    		".trim(), length));
			String[] upd_usr_id                 =  (JSPUtil.getParameter(request, prefix + "upd_usr_id                		".trim(), length));
			String[] upd_dt                     =  (JSPUtil.getParameter(request, prefix + "upd_dt                    		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new SCE_COST_ACT_GRP();
				model.setIbflag                    		  ( ibflag                    	[i]);
				model.setPage_rows                 		  ( page_rows                 	[i]);
				model.setCop_no                    		  ( cop_no                    	[i]);
				model.setCost_act_grp_seq          		  ( cost_act_grp_seq          	[i]);
				model.setCost_act_grp_cd           		  ( cost_act_grp_cd           	[i]);
				model.setCost_act_grp_tp_cd        		  ( cost_act_grp_tp_cd        	[i]);
				model.setVsl_slan_cd               		  ( vsl_slan_cd               	[i]);
				model.setCtrl_ofc_cd               		  ( ctrl_ofc_cd               	[i]);
				model.setPctl_cost_mod_cd          		  ( pctl_cost_mod_cd          	[i]);
				model.setPctl_io_bnd_cd            		  ( pctl_io_bnd_cd            	[i]);
				model.setN1st_nod_cd               		  ( n1st_nod_cd               	[i]);
				model.setN1st_nod_tp_cd            		  ( n1st_nod_tp_cd            	[i]);
				model.setN1st_nod_pln_dt           		  ( n1st_nod_pln_dt           	[i]);
				model.setN2nd_nod_cd               		  ( n2nd_nod_cd               	[i]);
				model.setN3rd_nod_cd               		  ( n3rd_nod_cd               	[i]);
				model.setN4th_nod_cd               		  ( n4th_nod_cd               	[i]);
				model.setTrsp_mod_cd               		  ( trsp_mod_cd               	[i]);
				model.setN1st_lnk_dist             		  ( n1st_lnk_dist             	[i]);
				model.setN1st_lnk_dist_ut_cd       		  ( n1st_lnk_dist_ut_cd       	[i]);
				model.setN2nd_lnk_dist             		  ( n2nd_lnk_dist             	[i]);
				model.setN2nd_lnk_dist_ut_cd       		  ( n2nd_lnk_dist_ut_cd       	[i]);
				model.setN3rd_lnk_dist             		  ( n3rd_lnk_dist             	[i]);
				model.setN3rd_dist_ut_cd           		  ( n3rd_dist_ut_cd           	[i]);
				model.setN1st_vndr_seq             		  ( n1st_vndr_seq             	[i]);
				model.setN2nd_vndr_seq             		  ( n2nd_vndr_seq             	[i]);
				model.setInlnd_rout_inv_bil_patt_cd		  ( inlnd_rout_inv_bil_patt_cd	[i]);
				model.setN3rd_vndr_seq             		  ( n3rd_vndr_seq             	[i]);
				model.setCust_nomi_trkr_flg        		  ( cust_nomi_trkr_flg        	[i]);
				model.setCust_cnt_cd               		  ( cust_cnt_cd               	[i]);
				model.setCust_seq                  		  ( cust_seq                  	[i]);
				model.setPre_nod_cd                		  ( pre_nod_cd                	[i]);
				model.setPre_vndr_seq              		  ( pre_vndr_seq              	[i]);
				model.setNxt_nod_cd                		  ( nxt_nod_cd                	[i]);
				model.setNxt_vndr_seq              		  ( nxt_vndr_seq              	[i]);
				model.setTrsp_so_sts_cd            		  ( trsp_so_sts_cd            	[i]);
				model.setTrsp_so_ofc_cty_cd        		  ( trsp_so_ofc_cty_cd        	[i]);
				model.setTrsp_so_seq               		  ( trsp_so_seq               	[i]);
				model.setWo_iss_due_dt             		  ( wo_iss_due_dt             	[i]);
				model.setCre_usr_id                		  ( cre_usr_id                	[i]);
				model.setCre_dt                    		  ( cre_dt                    	[i]);
				model.setUpd_usr_id                		  ( upd_usr_id                	[i]);
				model.setUpd_dt                    		  ( upd_dt                    	[i]);
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
