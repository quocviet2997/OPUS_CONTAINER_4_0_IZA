/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : MDM_ACTIVITY.java
*@FileTitle : 사용자 관리5
*Open Issues :
*Change history :
*@LastModifyDate : 2007-01-25
*@LastModifier : Kildong_hong6
*@LastVersion : 1.0
* 2007-01-25 Kildong_hong6
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
public final class MdmActivity implements java.io.Serializable {

	private String               ibflag               = "";
	private String               page_rows            = "";
	private String               act_cd               = "";
	private String               act_nm               = "";
	private String               act_desc             = "";
	private String               act_tp_cd            = "";
	private String               full_mty_cd          = "";
	private String               bnd_vskd_seq_cd      = "";
	private String               nod_tp_cd            = "";
	private String               act_op_tp_cd         = "";
	private String               trsp_mod_cd          = "";
	private String               org_dest_cd          = "";
	private String               act_flg              = "";
	private String               act_sts_mapg_cd      = "";
	private String               act_stnd_edi_sts_cd  = "";
	private String               estm_stnd_edi_sts_cd = "";
	private String               bzc_vis_flg          = "";
	private String               cust_vis_flg         = "";
	private String               act_rcv_tp_cd        = "";
	private String               cop_skd_lgc_no       = "";
	private String               cop_skd_lgc_tp_cd    = "";
	private String               upd_aval_flg         = "";
	private String               delt_flg             = "";
	private String               cre_usr_id           = "";
	private String               cre_dt               = "";
	private String               upd_usr_id           = "";
	private String               upd_dt               = "";
	private String               eai_evnt_dt          = "";

	public MdmActivity(){}

	public MdmActivity(
			String               ibflag              ,
			String               page_rows           ,
			String               act_cd              ,
			String               act_nm              ,
			String               act_desc            ,
			String               act_tp_cd           ,
			String               full_mty_cd         ,
			String               bnd_vskd_seq_cd     ,
			String               nod_tp_cd           ,
			String               act_op_tp_cd        ,
			String               trsp_mod_cd         ,
			String               org_dest_cd         ,
			String               act_flg             ,
			String               act_sts_mapg_cd     ,
			String               act_stnd_edi_sts_cd ,
			String               estm_stnd_edi_sts_cd,
			String               bzc_vis_flg         ,
			String               cust_vis_flg        ,
			String               act_rcv_tp_cd       ,
			String               cop_skd_lgc_no      ,
			String               cop_skd_lgc_tp_cd   ,
			String               upd_aval_flg        ,
			String               delt_flg            ,
			String               cre_usr_id          ,
			String               cre_dt              ,
			String               upd_usr_id          ,
			String               upd_dt              ,
			String               eai_evnt_dt         ){
		this.ibflag               = ibflag              ;
		this.page_rows            = page_rows           ;
		this.act_cd               = act_cd              ;
		this.act_nm               = act_nm              ;
		this.act_desc             = act_desc            ;
		this.act_tp_cd            = act_tp_cd           ;
		this.full_mty_cd          = full_mty_cd         ;
		this.bnd_vskd_seq_cd      = bnd_vskd_seq_cd     ;
		this.nod_tp_cd            = nod_tp_cd           ;
		this.act_op_tp_cd         = act_op_tp_cd        ;
		this.trsp_mod_cd          = trsp_mod_cd         ;
		this.org_dest_cd          = org_dest_cd         ;
		this.act_flg              = act_flg             ;
		this.act_sts_mapg_cd      = act_sts_mapg_cd     ;
		this.act_stnd_edi_sts_cd  = act_stnd_edi_sts_cd ;
		this.estm_stnd_edi_sts_cd = estm_stnd_edi_sts_cd;
		this.bzc_vis_flg          = bzc_vis_flg         ;
		this.cust_vis_flg         = cust_vis_flg        ;
		this.act_rcv_tp_cd        = act_rcv_tp_cd       ;
		this.cop_skd_lgc_no       = cop_skd_lgc_no      ;
		this.cop_skd_lgc_tp_cd    = cop_skd_lgc_tp_cd   ;
		this.upd_aval_flg         = upd_aval_flg        ;
		this.delt_flg             = delt_flg            ;
		this.cre_usr_id           = cre_usr_id          ;
		this.cre_dt               = cre_dt              ;
		this.upd_usr_id           = upd_usr_id          ;
		this.upd_dt               = upd_dt              ;
		this.eai_evnt_dt          = eai_evnt_dt         ;
	}

	// getter method is proceeding ..
	public String               getIbflag              (){	return ibflag              	;	}
	public String               getPage_rows           (){	return page_rows           	;	}
	public String               getAct_cd              (){	return act_cd              	;	}
	public String               getAct_nm              (){	return act_nm              	;	}
	public String               getAct_desc            (){	return act_desc            	;	}
	public String               getAct_tp_cd           (){	return act_tp_cd           	;	}
	public String               getFull_mty_cd         (){	return full_mty_cd         	;	}
	public String               getBnd_vskd_seq_cd     (){	return bnd_vskd_seq_cd     	;	}
	public String               getNod_tp_cd           (){	return nod_tp_cd           	;	}
	public String               getAct_op_tp_cd        (){	return act_op_tp_cd        	;	}
	public String               getTrsp_mod_cd         (){	return trsp_mod_cd         	;	}
	public String               getOrg_dest_cd         (){	return org_dest_cd         	;	}
	public String               getAct_flg             (){	return act_flg             	;	}
	public String               getAct_sts_mapg_cd     (){	return act_sts_mapg_cd     	;	}
	public String               getAct_stnd_edi_sts_cd (){	return act_stnd_edi_sts_cd 	;	}
	public String               getEstm_stnd_edi_sts_cd(){	return estm_stnd_edi_sts_cd	;	}
	public String               getBzc_vis_flg         (){	return bzc_vis_flg         	;	}
	public String               getCust_vis_flg        (){	return cust_vis_flg        	;	}
	public String               getAct_rcv_tp_cd       (){	return act_rcv_tp_cd       	;	}
	public String               getCop_skd_lgc_no      (){	return cop_skd_lgc_no      	;	}
	public String               getCop_skd_lgc_tp_cd   (){	return cop_skd_lgc_tp_cd   	;	}
	public String               getUpd_aval_flg        (){	return upd_aval_flg        	;	}
	public String               getDelt_flg            (){	return delt_flg            	;	}
	public String               getCre_usr_id          (){	return cre_usr_id          	;	}
	public String               getCre_dt              (){	return cre_dt              	;	}
	public String               getUpd_usr_id          (){	return upd_usr_id          	;	}
	public String               getUpd_dt              (){	return upd_dt              	;	}
	public String               getEai_evnt_dt         (){	return eai_evnt_dt         	;	}

	// setter method is proceeding ..
	public void setIbflag              ( String               ibflag               ){	this.ibflag               = ibflag              	;	}
	public void setPage_rows           ( String               page_rows            ){	this.page_rows            = page_rows           	;	}
	public void setAct_cd              ( String               act_cd               ){	this.act_cd               = act_cd              	;	}
	public void setAct_nm              ( String               act_nm               ){	this.act_nm               = act_nm              	;	}
	public void setAct_desc            ( String               act_desc             ){	this.act_desc             = act_desc            	;	}
	public void setAct_tp_cd           ( String               act_tp_cd            ){	this.act_tp_cd            = act_tp_cd           	;	}
	public void setFull_mty_cd         ( String               full_mty_cd          ){	this.full_mty_cd          = full_mty_cd         	;	}
	public void setBnd_vskd_seq_cd     ( String               bnd_vskd_seq_cd      ){	this.bnd_vskd_seq_cd      = bnd_vskd_seq_cd     	;	}
	public void setNod_tp_cd           ( String               nod_tp_cd            ){	this.nod_tp_cd            = nod_tp_cd           	;	}
	public void setAct_op_tp_cd        ( String               act_op_tp_cd         ){	this.act_op_tp_cd         = act_op_tp_cd        	;	}
	public void setTrsp_mod_cd         ( String               trsp_mod_cd          ){	this.trsp_mod_cd          = trsp_mod_cd         	;	}
	public void setOrg_dest_cd         ( String               org_dest_cd          ){	this.org_dest_cd          = org_dest_cd         	;	}
	public void setAct_flg             ( String               act_flg              ){	this.act_flg              = act_flg             	;	}
	public void setAct_sts_mapg_cd     ( String               act_sts_mapg_cd      ){	this.act_sts_mapg_cd      = act_sts_mapg_cd     	;	}
	public void setAct_stnd_edi_sts_cd ( String               act_stnd_edi_sts_cd  ){	this.act_stnd_edi_sts_cd  = act_stnd_edi_sts_cd 	;	}
	public void setEstm_stnd_edi_sts_cd( String               estm_stnd_edi_sts_cd ){	this.estm_stnd_edi_sts_cd = estm_stnd_edi_sts_cd	;	}
	public void setBzc_vis_flg         ( String               bzc_vis_flg          ){	this.bzc_vis_flg          = bzc_vis_flg         	;	}
	public void setCust_vis_flg        ( String               cust_vis_flg         ){	this.cust_vis_flg         = cust_vis_flg        	;	}
	public void setAct_rcv_tp_cd       ( String               act_rcv_tp_cd        ){	this.act_rcv_tp_cd        = act_rcv_tp_cd       	;	}
	public void setCop_skd_lgc_no      ( String               cop_skd_lgc_no       ){	this.cop_skd_lgc_no       = cop_skd_lgc_no      	;	}
	public void setCop_skd_lgc_tp_cd   ( String               cop_skd_lgc_tp_cd    ){	this.cop_skd_lgc_tp_cd    = cop_skd_lgc_tp_cd   	;	}
	public void setUpd_aval_flg        ( String               upd_aval_flg         ){	this.upd_aval_flg         = upd_aval_flg        	;	}
	public void setDelt_flg            ( String               delt_flg             ){	this.delt_flg             = delt_flg            	;	}
	public void setCre_usr_id          ( String               cre_usr_id           ){	this.cre_usr_id           = cre_usr_id          	;	}
	public void setCre_dt              ( String               cre_dt               ){	this.cre_dt               = cre_dt              	;	}
	public void setUpd_usr_id          ( String               upd_usr_id           ){	this.upd_usr_id           = upd_usr_id          	;	}
	public void setUpd_dt              ( String               upd_dt               ){	this.upd_dt               = upd_dt              	;	}
	public void setEai_evnt_dt         ( String               eai_evnt_dt          ){	this.eai_evnt_dt          = eai_evnt_dt         	;	}

	public static MdmActivity fromRequest(HttpServletRequest request) {
		MdmActivity model = new MdmActivity();
		try {
			model.setIbflag              	(JSPUtil.getParameter(request, "ibflag              		".trim(), ""));
			model.setPage_rows           	(JSPUtil.getParameter(request, "page_rows           		".trim(), ""));
			model.setAct_cd              	(JSPUtil.getParameter(request, "act_cd              		".trim(), ""));
			model.setAct_nm              	(JSPUtil.getParameter(request, "act_nm              		".trim(), ""));
			model.setAct_desc            	(JSPUtil.getParameter(request, "act_desc            		".trim(), ""));
			model.setAct_tp_cd           	(JSPUtil.getParameter(request, "act_tp_cd           		".trim(), ""));
			model.setFull_mty_cd         	(JSPUtil.getParameter(request, "full_mty_cd         		".trim(), ""));
			model.setBnd_vskd_seq_cd     	(JSPUtil.getParameter(request, "bnd_vskd_seq_cd     		".trim(), ""));
			model.setNod_tp_cd           	(JSPUtil.getParameter(request, "nod_tp_cd           		".trim(), ""));
			model.setAct_op_tp_cd        	(JSPUtil.getParameter(request, "act_op_tp_cd        		".trim(), ""));
			model.setTrsp_mod_cd         	(JSPUtil.getParameter(request, "trsp_mod_cd         		".trim(), ""));
			model.setOrg_dest_cd         	(JSPUtil.getParameter(request, "org_dest_cd         		".trim(), ""));
			model.setAct_flg             	(JSPUtil.getParameter(request, "act_flg             		".trim(), ""));
			model.setAct_sts_mapg_cd     	(JSPUtil.getParameter(request, "act_sts_mapg_cd     		".trim(), ""));
			model.setAct_stnd_edi_sts_cd 	(JSPUtil.getParameter(request, "act_stnd_edi_sts_cd 		".trim(), ""));
			model.setEstm_stnd_edi_sts_cd	(JSPUtil.getParameter(request, "estm_stnd_edi_sts_cd		".trim(), ""));
			model.setBzc_vis_flg         	(JSPUtil.getParameter(request, "bzc_vis_flg         		".trim(), ""));
			model.setCust_vis_flg        	(JSPUtil.getParameter(request, "cust_vis_flg        		".trim(), ""));
			model.setAct_rcv_tp_cd       	(JSPUtil.getParameter(request, "act_rcv_tp_cd       		".trim(), ""));
			model.setCop_skd_lgc_no      	(JSPUtil.getParameter(request, "cop_skd_lgc_no      		".trim(), ""));
			model.setCop_skd_lgc_tp_cd   	(JSPUtil.getParameter(request, "cop_skd_lgc_tp_cd   		".trim(), ""));
			model.setUpd_aval_flg        	(JSPUtil.getParameter(request, "upd_aval_flg        		".trim(), ""));
			model.setDelt_flg            	(JSPUtil.getParameter(request, "delt_flg            		".trim(), ""));
			model.setCre_usr_id          	(JSPUtil.getParameter(request, "cre_usr_id          		".trim(), ""));
			model.setCre_dt              	(JSPUtil.getParameter(request, "cre_dt              		".trim(), ""));
			model.setUpd_usr_id          	(JSPUtil.getParameter(request, "upd_usr_id          		".trim(), ""));
			model.setUpd_dt              	(JSPUtil.getParameter(request, "upd_dt              		".trim(), ""));
			model.setEai_evnt_dt         	(JSPUtil.getParameter(request, "eai_evnt_dt         		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		MdmActivity model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag               =  (JSPUtil.getParameter(request, "ibflag              		".trim(), length));
			String[] page_rows            =  (JSPUtil.getParameter(request, "page_rows           		".trim(), length));
			String[] act_cd               =  (JSPUtil.getParameter(request, "act_cd              		".trim(), length));
			String[] act_nm               =  (JSPUtil.getParameter(request, "act_nm              		".trim(), length));
			String[] act_desc             =  (JSPUtil.getParameter(request, "act_desc            		".trim(), length));
			String[] act_tp_cd            =  (JSPUtil.getParameter(request, "act_tp_cd           		".trim(), length));
			String[] full_mty_cd          =  (JSPUtil.getParameter(request, "full_mty_cd         		".trim(), length));
			String[] bnd_vskd_seq_cd      =  (JSPUtil.getParameter(request, "bnd_vskd_seq_cd     		".trim(), length));
			String[] nod_tp_cd            =  (JSPUtil.getParameter(request, "nod_tp_cd           		".trim(), length));
			String[] act_op_tp_cd         =  (JSPUtil.getParameter(request, "act_op_tp_cd        		".trim(), length));
			String[] trsp_mod_cd          =  (JSPUtil.getParameter(request, "trsp_mod_cd         		".trim(), length));
			String[] org_dest_cd          =  (JSPUtil.getParameter(request, "org_dest_cd         		".trim(), length));
			String[] act_flg              =  (JSPUtil.getParameter(request, "act_flg             		".trim(), length));
			String[] act_sts_mapg_cd      =  (JSPUtil.getParameter(request, "act_sts_mapg_cd     		".trim(), length));
			String[] act_stnd_edi_sts_cd  =  (JSPUtil.getParameter(request, "act_stnd_edi_sts_cd 		".trim(), length));
			String[] estm_stnd_edi_sts_cd =  (JSPUtil.getParameter(request, "estm_stnd_edi_sts_cd		".trim(), length));
			String[] bzc_vis_flg          =  (JSPUtil.getParameter(request, "bzc_vis_flg         		".trim(), length));
			String[] cust_vis_flg         =  (JSPUtil.getParameter(request, "cust_vis_flg        		".trim(), length));
			String[] act_rcv_tp_cd        =  (JSPUtil.getParameter(request, "act_rcv_tp_cd       		".trim(), length));
			String[] cop_skd_lgc_no       =  (JSPUtil.getParameter(request, "cop_skd_lgc_no      		".trim(), length));
			String[] cop_skd_lgc_tp_cd    =  (JSPUtil.getParameter(request, "cop_skd_lgc_tp_cd   		".trim(), length));
			String[] upd_aval_flg         =  (JSPUtil.getParameter(request, "upd_aval_flg        		".trim(), length));
			String[] delt_flg             =  (JSPUtil.getParameter(request, "delt_flg            		".trim(), length));
			String[] cre_usr_id           =  (JSPUtil.getParameter(request, "cre_usr_id          		".trim(), length));
			String[] cre_dt               =  (JSPUtil.getParameter(request, "cre_dt              		".trim(), length));
			String[] upd_usr_id           =  (JSPUtil.getParameter(request, "upd_usr_id          		".trim(), length));
			String[] upd_dt               =  (JSPUtil.getParameter(request, "upd_dt              		".trim(), length));
			String[] eai_evnt_dt          =  (JSPUtil.getParameter(request, "eai_evnt_dt         		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new MdmActivity();
				model.setIbflag              		  (ibflag              	[i]);
				model.setPage_rows           		  (page_rows           	[i]);
				model.setAct_cd              		  (act_cd              	[i]);
				model.setAct_nm              		  (act_nm              	[i]);
				model.setAct_desc            		  (act_desc            	[i]);
				model.setAct_tp_cd           		  (act_tp_cd           	[i]);
				model.setFull_mty_cd         		  (full_mty_cd         	[i]);
				model.setBnd_vskd_seq_cd     		  (bnd_vskd_seq_cd     	[i]);
				model.setNod_tp_cd           		  (nod_tp_cd           	[i]);
				model.setAct_op_tp_cd        		  (act_op_tp_cd        	[i]);
				model.setTrsp_mod_cd         		  (trsp_mod_cd         	[i]);
				model.setOrg_dest_cd         		  (org_dest_cd         	[i]);
				model.setAct_flg             		  (act_flg             	[i]);
				model.setAct_sts_mapg_cd     		  (act_sts_mapg_cd     	[i]);
				model.setAct_stnd_edi_sts_cd 		  (act_stnd_edi_sts_cd 	[i]);
				model.setEstm_stnd_edi_sts_cd		  (estm_stnd_edi_sts_cd	[i]);
				model.setBzc_vis_flg         		  (bzc_vis_flg         	[i]);
				model.setCust_vis_flg        		  (cust_vis_flg        	[i]);
				model.setAct_rcv_tp_cd       		  (act_rcv_tp_cd       	[i]);
				model.setCop_skd_lgc_no      		  (cop_skd_lgc_no      	[i]);
				model.setCop_skd_lgc_tp_cd   		  (cop_skd_lgc_tp_cd   	[i]);
				model.setUpd_aval_flg        		  (upd_aval_flg        	[i]);
				model.setDelt_flg            		  (delt_flg            	[i]);
				model.setCre_usr_id          		  (cre_usr_id          	[i]);
				model.setCre_dt              		  (cre_dt              	[i]);
				model.setUpd_usr_id          		  (upd_usr_id          	[i]);
				model.setUpd_dt              		  (upd_dt              	[i]);
				model.setEai_evnt_dt         		  (eai_evnt_dt         	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		MdmActivity model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag               =  (JSPUtil.getParameter(request, prefix + "ibflag              		".trim(), length));
			String[] page_rows            =  (JSPUtil.getParameter(request, prefix + "page_rows           		".trim(), length));
			String[] act_cd               =  (JSPUtil.getParameter(request, prefix + "act_cd              		".trim(), length));
			String[] act_nm               =  (JSPUtil.getParameter(request, prefix + "act_nm              		".trim(), length));
			String[] act_desc             =  (JSPUtil.getParameter(request, prefix + "act_desc            		".trim(), length));
			String[] act_tp_cd            =  (JSPUtil.getParameter(request, prefix + "act_tp_cd           		".trim(), length));
			String[] full_mty_cd          =  (JSPUtil.getParameter(request, prefix + "full_mty_cd         		".trim(), length));
			String[] bnd_vskd_seq_cd      =  (JSPUtil.getParameter(request, prefix + "bnd_vskd_seq_cd     		".trim(), length));
			String[] nod_tp_cd            =  (JSPUtil.getParameter(request, prefix + "nod_tp_cd           		".trim(), length));
			String[] act_op_tp_cd         =  (JSPUtil.getParameter(request, prefix + "act_op_tp_cd        		".trim(), length));
			String[] trsp_mod_cd          =  (JSPUtil.getParameter(request, prefix + "trsp_mod_cd         		".trim(), length));
			String[] org_dest_cd          =  (JSPUtil.getParameter(request, prefix + "org_dest_cd         		".trim(), length));
			String[] act_flg              =  (JSPUtil.getParameter(request, prefix + "act_flg             		".trim(), length));
			String[] act_sts_mapg_cd      =  (JSPUtil.getParameter(request, prefix + "act_sts_mapg_cd     		".trim(), length));
			String[] act_stnd_edi_sts_cd  =  (JSPUtil.getParameter(request, prefix + "act_stnd_edi_sts_cd 		".trim(), length));
			String[] estm_stnd_edi_sts_cd =  (JSPUtil.getParameter(request, prefix + "estm_stnd_edi_sts_cd		".trim(), length));
			String[] bzc_vis_flg          =  (JSPUtil.getParameter(request, prefix + "bzc_vis_flg         		".trim(), length));
			String[] cust_vis_flg         =  (JSPUtil.getParameter(request, prefix + "cust_vis_flg        		".trim(), length));
			String[] act_rcv_tp_cd        =  (JSPUtil.getParameter(request, prefix + "act_rcv_tp_cd       		".trim(), length));
			String[] cop_skd_lgc_no       =  (JSPUtil.getParameter(request, prefix + "cop_skd_lgc_no      		".trim(), length));
			String[] cop_skd_lgc_tp_cd    =  (JSPUtil.getParameter(request, prefix + "cop_skd_lgc_tp_cd   		".trim(), length));
			String[] upd_aval_flg         =  (JSPUtil.getParameter(request, prefix + "upd_aval_flg        		".trim(), length));
			String[] delt_flg             =  (JSPUtil.getParameter(request, prefix + "delt_flg            		".trim(), length));
			String[] cre_usr_id           =  (JSPUtil.getParameter(request, prefix + "cre_usr_id          		".trim(), length));
			String[] cre_dt               =  (JSPUtil.getParameter(request, prefix + "cre_dt              		".trim(), length));
			String[] upd_usr_id           =  (JSPUtil.getParameter(request, prefix + "upd_usr_id          		".trim(), length));
			String[] upd_dt               =  (JSPUtil.getParameter(request, prefix + "upd_dt              		".trim(), length));
			String[] eai_evnt_dt          =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt         		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new MdmActivity();
				model.setIbflag              		  ( ibflag              	[i]);
				model.setPage_rows           		  ( page_rows           	[i]);
				model.setAct_cd              		  ( act_cd              	[i]);
				model.setAct_nm              		  ( act_nm              	[i]);
				model.setAct_desc            		  ( act_desc            	[i]);
				model.setAct_tp_cd           		  ( act_tp_cd           	[i]);
				model.setFull_mty_cd         		  ( full_mty_cd         	[i]);
				model.setBnd_vskd_seq_cd     		  ( bnd_vskd_seq_cd     	[i]);
				model.setNod_tp_cd           		  ( nod_tp_cd           	[i]);
				model.setAct_op_tp_cd        		  ( act_op_tp_cd        	[i]);
				model.setTrsp_mod_cd         		  ( trsp_mod_cd         	[i]);
				model.setOrg_dest_cd         		  ( org_dest_cd         	[i]);
				model.setAct_flg             		  ( act_flg             	[i]);
				model.setAct_sts_mapg_cd     		  ( act_sts_mapg_cd     	[i]);
				model.setAct_stnd_edi_sts_cd 		  ( act_stnd_edi_sts_cd 	[i]);
				model.setEstm_stnd_edi_sts_cd		  ( estm_stnd_edi_sts_cd	[i]);
				model.setBzc_vis_flg         		  ( bzc_vis_flg         	[i]);
				model.setCust_vis_flg        		  ( cust_vis_flg        	[i]);
				model.setAct_rcv_tp_cd       		  ( act_rcv_tp_cd       	[i]);
				model.setCop_skd_lgc_no      		  ( cop_skd_lgc_no      	[i]);
				model.setCop_skd_lgc_tp_cd   		  ( cop_skd_lgc_tp_cd   	[i]);
				model.setUpd_aval_flg        		  ( upd_aval_flg        	[i]);
				model.setDelt_flg            		  ( delt_flg            	[i]);
				model.setCre_usr_id          		  ( cre_usr_id          	[i]);
				model.setCre_dt              		  ( cre_dt              	[i]);
				model.setUpd_usr_id          		  ( upd_usr_id          	[i]);
				model.setUpd_dt              		  ( upd_dt              	[i]);
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
