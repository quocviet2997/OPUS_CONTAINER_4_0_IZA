/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : SCE_COP_GRP.java
*@FileTitle : S/P Performance Evaluation Creation
*Open Issues :
*Change history :
*@LastModifyDate : 2006-11-28
*@LastModifier : juhyun
*@LastVersion : 1.0
* 2006-11-28 juhyun
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
public final class SCE_COP_GRP implements java.io.Serializable {

	private String             ibflag             = "";
	private String             page_rows          = "";
	private String             cop_no             = "";
	private String             cop_grp_seq        = "";
	private String             cop_grp_add_seq1   = "";
	private String             cop_grp_add_seq2   = "";
	private String             act_grp_cd         = "";
	private String             nod_lnk_ind_cd     = "";
	private String             bnd_vskd_seq_cd    = "";
	private String             trsp_mod_cd        = "";
	private String             init_pln_cost_amt  = "";
	private String             fnl_pln_cost_amt   = "";
	private String             estm_cost_amt      = "";
	private String             trsp_so_ofc_cty_cd = "";
	private String             trsp_so_seq        = "";
	private String             trsp_so_sts_cd     = "";
	private String             wo_iss_due_dt      = "";
	private String             prf_vndr_seq       = "";
	private String             org_nod_cd         = "";
	private String             dest_nod_cd        = "";
	private String             org_nod_tp_cd      = "";
	private String             dest_nod_tp_cd     = "";
	private String             arr_st_dt          = "";
	private String             dep_fsh_dt         = "";
	private String             tz_dwll_tm_hrs     = "";
	private String             vsl_cd             = "";
	private String             skd_voy_no         = "";
	private String             skd_dir_cd         = "";
	private String             aval_teu_spc       = "";
	private String             curr_cd            = "";
	private String             sect_expn_amt      = "";
	private String             cre_usr_id         = "";
	private String             cre_dt             = "";
	private String             upd_usr_id         = "";
	private String             upd_dt             = "";
	private String             cost_act_grp_seq   = "";

	public SCE_COP_GRP(){}

	public SCE_COP_GRP(
			String             ibflag            ,
			String             page_rows         ,
			String             cop_no            ,
			String             cop_grp_seq       ,
			String             cop_grp_add_seq1  ,
			String             cop_grp_add_seq2  ,
			String             act_grp_cd        ,
			String             nod_lnk_ind_cd    ,
			String             bnd_vskd_seq_cd   ,
			String             trsp_mod_cd       ,
			String             init_pln_cost_amt ,
			String             fnl_pln_cost_amt  ,
			String             estm_cost_amt     ,
			String             trsp_so_ofc_cty_cd,
			String             trsp_so_seq       ,
			String             trsp_so_sts_cd    ,
			String             wo_iss_due_dt     ,
			String             prf_vndr_seq      ,
			String             org_nod_cd        ,
			String             dest_nod_cd       ,
			String             org_nod_tp_cd     ,
			String             dest_nod_tp_cd    ,
			String             arr_st_dt         ,
			String             dep_fsh_dt        ,
			String             tz_dwll_tm_hrs    ,
			String             vsl_cd            ,
			String             skd_voy_no        ,
			String             skd_dir_cd        ,
			String             aval_teu_spc      ,
			String             curr_cd           ,
			String             sect_expn_amt     ,
			String             cre_usr_id        ,
			String             cre_dt            ,
			String             upd_usr_id        ,
			String             upd_dt            ,
			String             cost_act_grp_seq  ){
		this.ibflag             = ibflag            ;
		this.page_rows          = page_rows         ;
		this.cop_no             = cop_no            ;
		this.cop_grp_seq        = cop_grp_seq       ;
		this.cop_grp_add_seq1   = cop_grp_add_seq1  ;
		this.cop_grp_add_seq2   = cop_grp_add_seq2  ;
		this.act_grp_cd         = act_grp_cd        ;
		this.nod_lnk_ind_cd     = nod_lnk_ind_cd    ;
		this.bnd_vskd_seq_cd    = bnd_vskd_seq_cd   ;
		this.trsp_mod_cd        = trsp_mod_cd       ;
		this.init_pln_cost_amt  = init_pln_cost_amt ;
		this.fnl_pln_cost_amt   = fnl_pln_cost_amt  ;
		this.estm_cost_amt      = estm_cost_amt     ;
		this.trsp_so_ofc_cty_cd = trsp_so_ofc_cty_cd;
		this.trsp_so_seq        = trsp_so_seq       ;
		this.trsp_so_sts_cd     = trsp_so_sts_cd    ;
		this.wo_iss_due_dt      = wo_iss_due_dt     ;
		this.prf_vndr_seq       = prf_vndr_seq      ;
		this.org_nod_cd         = org_nod_cd        ;
		this.dest_nod_cd        = dest_nod_cd       ;
		this.org_nod_tp_cd      = org_nod_tp_cd     ;
		this.dest_nod_tp_cd     = dest_nod_tp_cd    ;
		this.arr_st_dt          = arr_st_dt         ;
		this.dep_fsh_dt         = dep_fsh_dt        ;
		this.tz_dwll_tm_hrs     = tz_dwll_tm_hrs    ;
		this.vsl_cd             = vsl_cd            ;
		this.skd_voy_no         = skd_voy_no        ;
		this.skd_dir_cd         = skd_dir_cd        ;
		this.aval_teu_spc       = aval_teu_spc      ;
		this.curr_cd            = curr_cd           ;
		this.sect_expn_amt      = sect_expn_amt     ;
		this.cre_usr_id         = cre_usr_id        ;
		this.cre_dt             = cre_dt            ;
		this.upd_usr_id         = upd_usr_id        ;
		this.upd_dt             = upd_dt            ;
		this.cost_act_grp_seq   = cost_act_grp_seq  ;
	}

	// getter method is proceeding ..
	public String             getIbflag            (){	return ibflag            	;	}
	public String             getPage_rows         (){	return page_rows         	;	}
	public String             getCop_no            (){	return cop_no            	;	}
	public String             getCop_grp_seq       (){	return cop_grp_seq       	;	}
	public String             getCop_grp_add_seq1  (){	return cop_grp_add_seq1  	;	}
	public String             getCop_grp_add_seq2  (){	return cop_grp_add_seq2  	;	}
	public String             getAct_grp_cd        (){	return act_grp_cd        	;	}
	public String             getNod_lnk_ind_cd    (){	return nod_lnk_ind_cd    	;	}
	public String             getBnd_vskd_seq_cd   (){	return bnd_vskd_seq_cd   	;	}
	public String             getTrsp_mod_cd       (){	return trsp_mod_cd       	;	}
	public String             getInit_pln_cost_amt (){	return init_pln_cost_amt 	;	}
	public String             getFnl_pln_cost_amt  (){	return fnl_pln_cost_amt  	;	}
	public String             getEstm_cost_amt     (){	return estm_cost_amt     	;	}
	public String             getTrsp_so_ofc_cty_cd(){	return trsp_so_ofc_cty_cd	;	}
	public String             getTrsp_so_seq       (){	return trsp_so_seq       	;	}
	public String             getTrsp_so_sts_cd    (){	return trsp_so_sts_cd    	;	}
	public String             getWo_iss_due_dt     (){	return wo_iss_due_dt     	;	}
	public String             getPrf_vndr_seq      (){	return prf_vndr_seq      	;	}
	public String             getOrg_nod_cd        (){	return org_nod_cd        	;	}
	public String             getDest_nod_cd       (){	return dest_nod_cd       	;	}
	public String             getOrg_nod_tp_cd     (){	return org_nod_tp_cd     	;	}
	public String             getDest_nod_tp_cd    (){	return dest_nod_tp_cd    	;	}
	public String             getArr_st_dt         (){	return arr_st_dt         	;	}
	public String             getDep_fsh_dt        (){	return dep_fsh_dt        	;	}
	public String             getTz_dwll_tm_hrs    (){	return tz_dwll_tm_hrs    	;	}
	public String             getVsl_cd            (){	return vsl_cd            	;	}
	public String             getSkd_voy_no        (){	return skd_voy_no        	;	}
	public String             getSkd_dir_cd        (){	return skd_dir_cd        	;	}
	public String             getAval_teu_spc      (){	return aval_teu_spc      	;	}
	public String             getCurr_cd           (){	return curr_cd           	;	}
	public String             getSect_expn_amt     (){	return sect_expn_amt     	;	}
	public String             getCre_usr_id        (){	return cre_usr_id        	;	}
	public String             getCre_dt            (){	return cre_dt            	;	}
	public String             getUpd_usr_id        (){	return upd_usr_id        	;	}
	public String             getUpd_dt            (){	return upd_dt            	;	}
	public String             getCost_act_grp_seq  (){	return cost_act_grp_seq  	;	}

	// setter method is proceeding ..
	public void setIbflag            ( String             ibflag             ){	this.ibflag             = ibflag            	;	}
	public void setPage_rows         ( String             page_rows          ){	this.page_rows          = page_rows         	;	}
	public void setCop_no            ( String             cop_no             ){	this.cop_no             = cop_no            	;	}
	public void setCop_grp_seq       ( String             cop_grp_seq        ){	this.cop_grp_seq        = cop_grp_seq       	;	}
	public void setCop_grp_add_seq1  ( String             cop_grp_add_seq1   ){	this.cop_grp_add_seq1   = cop_grp_add_seq1  	;	}
	public void setCop_grp_add_seq2  ( String             cop_grp_add_seq2   ){	this.cop_grp_add_seq2   = cop_grp_add_seq2  	;	}
	public void setAct_grp_cd        ( String             act_grp_cd         ){	this.act_grp_cd         = act_grp_cd        	;	}
	public void setNod_lnk_ind_cd    ( String             nod_lnk_ind_cd     ){	this.nod_lnk_ind_cd     = nod_lnk_ind_cd    	;	}
	public void setBnd_vskd_seq_cd   ( String             bnd_vskd_seq_cd    ){	this.bnd_vskd_seq_cd    = bnd_vskd_seq_cd   	;	}
	public void setTrsp_mod_cd       ( String             trsp_mod_cd        ){	this.trsp_mod_cd        = trsp_mod_cd       	;	}
	public void setInit_pln_cost_amt ( String             init_pln_cost_amt  ){	this.init_pln_cost_amt  = init_pln_cost_amt 	;	}
	public void setFnl_pln_cost_amt  ( String             fnl_pln_cost_amt   ){	this.fnl_pln_cost_amt   = fnl_pln_cost_amt  	;	}
	public void setEstm_cost_amt     ( String             estm_cost_amt      ){	this.estm_cost_amt      = estm_cost_amt     	;	}
	public void setTrsp_so_ofc_cty_cd( String             trsp_so_ofc_cty_cd ){	this.trsp_so_ofc_cty_cd = trsp_so_ofc_cty_cd	;	}
	public void setTrsp_so_seq       ( String             trsp_so_seq        ){	this.trsp_so_seq        = trsp_so_seq       	;	}
	public void setTrsp_so_sts_cd    ( String             trsp_so_sts_cd     ){	this.trsp_so_sts_cd     = trsp_so_sts_cd    	;	}
	public void setWo_iss_due_dt     ( String             wo_iss_due_dt      ){	this.wo_iss_due_dt      = wo_iss_due_dt     	;	}
	public void setPrf_vndr_seq      ( String             prf_vndr_seq       ){	this.prf_vndr_seq       = prf_vndr_seq      	;	}
	public void setOrg_nod_cd        ( String             org_nod_cd         ){	this.org_nod_cd         = org_nod_cd        	;	}
	public void setDest_nod_cd       ( String             dest_nod_cd        ){	this.dest_nod_cd        = dest_nod_cd       	;	}
	public void setOrg_nod_tp_cd     ( String             org_nod_tp_cd      ){	this.org_nod_tp_cd      = org_nod_tp_cd     	;	}
	public void setDest_nod_tp_cd    ( String             dest_nod_tp_cd     ){	this.dest_nod_tp_cd     = dest_nod_tp_cd    	;	}
	public void setArr_st_dt         ( String             arr_st_dt          ){	this.arr_st_dt          = arr_st_dt         	;	}
	public void setDep_fsh_dt        ( String             dep_fsh_dt         ){	this.dep_fsh_dt         = dep_fsh_dt        	;	}
	public void setTz_dwll_tm_hrs    ( String             tz_dwll_tm_hrs     ){	this.tz_dwll_tm_hrs     = tz_dwll_tm_hrs    	;	}
	public void setVsl_cd            ( String             vsl_cd             ){	this.vsl_cd             = vsl_cd            	;	}
	public void setSkd_voy_no        ( String             skd_voy_no         ){	this.skd_voy_no         = skd_voy_no        	;	}
	public void setSkd_dir_cd        ( String             skd_dir_cd         ){	this.skd_dir_cd         = skd_dir_cd        	;	}
	public void setAval_teu_spc      ( String             aval_teu_spc       ){	this.aval_teu_spc       = aval_teu_spc      	;	}
	public void setCurr_cd           ( String             curr_cd            ){	this.curr_cd            = curr_cd           	;	}
	public void setSect_expn_amt     ( String             sect_expn_amt      ){	this.sect_expn_amt      = sect_expn_amt     	;	}
	public void setCre_usr_id        ( String             cre_usr_id         ){	this.cre_usr_id         = cre_usr_id        	;	}
	public void setCre_dt            ( String             cre_dt             ){	this.cre_dt             = cre_dt            	;	}
	public void setUpd_usr_id        ( String             upd_usr_id         ){	this.upd_usr_id         = upd_usr_id        	;	}
	public void setUpd_dt            ( String             upd_dt             ){	this.upd_dt             = upd_dt            	;	}
	public void setCost_act_grp_seq  ( String             cost_act_grp_seq   ){	this.cost_act_grp_seq   = cost_act_grp_seq  	;	}

	public static SCE_COP_GRP fromRequest(HttpServletRequest request) {
		SCE_COP_GRP model = new SCE_COP_GRP();
		try {
			model.setIbflag            	(JSPUtil.getParameter(request, "ibflag            		".trim(), ""));
			model.setPage_rows         	(JSPUtil.getParameter(request, "page_rows         		".trim(), ""));
			model.setCop_no            	(JSPUtil.getParameter(request, "cop_no            		".trim(), ""));
			model.setCop_grp_seq       	(JSPUtil.getParameter(request, "cop_grp_seq       		".trim(), ""));
			model.setCop_grp_add_seq1  	(JSPUtil.getParameter(request, "cop_grp_add_seq1  		".trim(), ""));
			model.setCop_grp_add_seq2  	(JSPUtil.getParameter(request, "cop_grp_add_seq2  		".trim(), ""));
			model.setAct_grp_cd        	(JSPUtil.getParameter(request, "act_grp_cd        		".trim(), ""));
			model.setNod_lnk_ind_cd    	(JSPUtil.getParameter(request, "nod_lnk_ind_cd    		".trim(), ""));
			model.setBnd_vskd_seq_cd   	(JSPUtil.getParameter(request, "bnd_vskd_seq_cd   		".trim(), ""));
			model.setTrsp_mod_cd       	(JSPUtil.getParameter(request, "trsp_mod_cd       		".trim(), ""));
			model.setInit_pln_cost_amt 	(JSPUtil.getParameter(request, "init_pln_cost_amt 		".trim(), ""));
			model.setFnl_pln_cost_amt  	(JSPUtil.getParameter(request, "fnl_pln_cost_amt  		".trim(), ""));
			model.setEstm_cost_amt     	(JSPUtil.getParameter(request, "estm_cost_amt     		".trim(), ""));
			model.setTrsp_so_ofc_cty_cd	(JSPUtil.getParameter(request, "trsp_so_ofc_cty_cd		".trim(), ""));
			model.setTrsp_so_seq       	(JSPUtil.getParameter(request, "trsp_so_seq       		".trim(), ""));
			model.setTrsp_so_sts_cd    	(JSPUtil.getParameter(request, "trsp_so_sts_cd    		".trim(), ""));
			model.setWo_iss_due_dt     	(JSPUtil.getParameter(request, "wo_iss_due_dt     		".trim(), ""));
			model.setPrf_vndr_seq      	(JSPUtil.getParameter(request, "prf_vndr_seq      		".trim(), ""));
			model.setOrg_nod_cd        	(JSPUtil.getParameter(request, "org_nod_cd        		".trim(), ""));
			model.setDest_nod_cd       	(JSPUtil.getParameter(request, "dest_nod_cd       		".trim(), ""));
			model.setOrg_nod_tp_cd     	(JSPUtil.getParameter(request, "org_nod_tp_cd     		".trim(), ""));
			model.setDest_nod_tp_cd    	(JSPUtil.getParameter(request, "dest_nod_tp_cd    		".trim(), ""));
			model.setArr_st_dt         	(JSPUtil.getParameter(request, "arr_st_dt         		".trim(), ""));
			model.setDep_fsh_dt        	(JSPUtil.getParameter(request, "dep_fsh_dt        		".trim(), ""));
			model.setTz_dwll_tm_hrs    	(JSPUtil.getParameter(request, "tz_dwll_tm_hrs    		".trim(), ""));
			model.setVsl_cd            	(JSPUtil.getParameter(request, "vsl_cd            		".trim(), ""));
			model.setSkd_voy_no        	(JSPUtil.getParameter(request, "skd_voy_no        		".trim(), ""));
			model.setSkd_dir_cd        	(JSPUtil.getParameter(request, "skd_dir_cd        		".trim(), ""));
			model.setAval_teu_spc      	(JSPUtil.getParameter(request, "aval_teu_spc      		".trim(), ""));
			model.setCurr_cd           	(JSPUtil.getParameter(request, "curr_cd           		".trim(), ""));
			model.setSect_expn_amt     	(JSPUtil.getParameter(request, "sect_expn_amt     		".trim(), ""));
			model.setCre_usr_id        	(JSPUtil.getParameter(request, "cre_usr_id        		".trim(), ""));
			model.setCre_dt            	(JSPUtil.getParameter(request, "cre_dt            		".trim(), ""));
			model.setUpd_usr_id        	(JSPUtil.getParameter(request, "upd_usr_id        		".trim(), ""));
			model.setUpd_dt            	(JSPUtil.getParameter(request, "upd_dt            		".trim(), ""));
			model.setCost_act_grp_seq  	(JSPUtil.getParameter(request, "cost_act_grp_seq  		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		SCE_COP_GRP model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag             =  (JSPUtil.getParameter(request, "ibflag            		".trim(), length));
			String[] page_rows          =  (JSPUtil.getParameter(request, "page_rows         		".trim(), length));
			String[] cop_no             =  (JSPUtil.getParameter(request, "cop_no            		".trim(), length));
			String[] cop_grp_seq        =  (JSPUtil.getParameter(request, "cop_grp_seq       		".trim(), length));
			String[] cop_grp_add_seq1   =  (JSPUtil.getParameter(request, "cop_grp_add_seq1  		".trim(), length));
			String[] cop_grp_add_seq2   =  (JSPUtil.getParameter(request, "cop_grp_add_seq2  		".trim(), length));
			String[] act_grp_cd         =  (JSPUtil.getParameter(request, "act_grp_cd        		".trim(), length));
			String[] nod_lnk_ind_cd     =  (JSPUtil.getParameter(request, "nod_lnk_ind_cd    		".trim(), length));
			String[] bnd_vskd_seq_cd    =  (JSPUtil.getParameter(request, "bnd_vskd_seq_cd   		".trim(), length));
			String[] trsp_mod_cd        =  (JSPUtil.getParameter(request, "trsp_mod_cd       		".trim(), length));
			String[] init_pln_cost_amt  =  (JSPUtil.getParameter(request, "init_pln_cost_amt 		".trim(), length));
			String[] fnl_pln_cost_amt   =  (JSPUtil.getParameter(request, "fnl_pln_cost_amt  		".trim(), length));
			String[] estm_cost_amt      =  (JSPUtil.getParameter(request, "estm_cost_amt     		".trim(), length));
			String[] trsp_so_ofc_cty_cd =  (JSPUtil.getParameter(request, "trsp_so_ofc_cty_cd		".trim(), length));
			String[] trsp_so_seq        =  (JSPUtil.getParameter(request, "trsp_so_seq       		".trim(), length));
			String[] trsp_so_sts_cd     =  (JSPUtil.getParameter(request, "trsp_so_sts_cd    		".trim(), length));
			String[] wo_iss_due_dt      =  (JSPUtil.getParameter(request, "wo_iss_due_dt     		".trim(), length));
			String[] prf_vndr_seq       =  (JSPUtil.getParameter(request, "prf_vndr_seq      		".trim(), length));
			String[] org_nod_cd         =  (JSPUtil.getParameter(request, "org_nod_cd        		".trim(), length));
			String[] dest_nod_cd        =  (JSPUtil.getParameter(request, "dest_nod_cd       		".trim(), length));
			String[] org_nod_tp_cd      =  (JSPUtil.getParameter(request, "org_nod_tp_cd     		".trim(), length));
			String[] dest_nod_tp_cd     =  (JSPUtil.getParameter(request, "dest_nod_tp_cd    		".trim(), length));
			String[] arr_st_dt          =  (JSPUtil.getParameter(request, "arr_st_dt         		".trim(), length));
			String[] dep_fsh_dt         =  (JSPUtil.getParameter(request, "dep_fsh_dt        		".trim(), length));
			String[] tz_dwll_tm_hrs     =  (JSPUtil.getParameter(request, "tz_dwll_tm_hrs    		".trim(), length));
			String[] vsl_cd             =  (JSPUtil.getParameter(request, "vsl_cd            		".trim(), length));
			String[] skd_voy_no         =  (JSPUtil.getParameter(request, "skd_voy_no        		".trim(), length));
			String[] skd_dir_cd         =  (JSPUtil.getParameter(request, "skd_dir_cd        		".trim(), length));
			String[] aval_teu_spc       =  (JSPUtil.getParameter(request, "aval_teu_spc      		".trim(), length));
			String[] curr_cd            =  (JSPUtil.getParameter(request, "curr_cd           		".trim(), length));
			String[] sect_expn_amt      =  (JSPUtil.getParameter(request, "sect_expn_amt     		".trim(), length));
			String[] cre_usr_id         =  (JSPUtil.getParameter(request, "cre_usr_id        		".trim(), length));
			String[] cre_dt             =  (JSPUtil.getParameter(request, "cre_dt            		".trim(), length));
			String[] upd_usr_id         =  (JSPUtil.getParameter(request, "upd_usr_id        		".trim(), length));
			String[] upd_dt             =  (JSPUtil.getParameter(request, "upd_dt            		".trim(), length));
			String[] cost_act_grp_seq   =  (JSPUtil.getParameter(request, "cost_act_grp_seq  		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new SCE_COP_GRP();
				model.setIbflag            		  (ibflag            	[i]);
				model.setPage_rows         		  (page_rows         	[i]);
				model.setCop_no            		  (cop_no            	[i]);
				model.setCop_grp_seq       		  (cop_grp_seq       	[i]);
				model.setCop_grp_add_seq1  		  (cop_grp_add_seq1  	[i]);
				model.setCop_grp_add_seq2  		  (cop_grp_add_seq2  	[i]);
				model.setAct_grp_cd        		  (act_grp_cd        	[i]);
				model.setNod_lnk_ind_cd    		  (nod_lnk_ind_cd    	[i]);
				model.setBnd_vskd_seq_cd   		  (bnd_vskd_seq_cd   	[i]);
				model.setTrsp_mod_cd       		  (trsp_mod_cd       	[i]);
				model.setInit_pln_cost_amt 		  (init_pln_cost_amt 	[i]);
				model.setFnl_pln_cost_amt  		  (fnl_pln_cost_amt  	[i]);
				model.setEstm_cost_amt     		  (estm_cost_amt     	[i]);
				model.setTrsp_so_ofc_cty_cd		  (trsp_so_ofc_cty_cd	[i]);
				model.setTrsp_so_seq       		  (trsp_so_seq       	[i]);
				model.setTrsp_so_sts_cd    		  (trsp_so_sts_cd    	[i]);
				model.setWo_iss_due_dt     		  (wo_iss_due_dt     	[i]);
				model.setPrf_vndr_seq      		  (prf_vndr_seq      	[i]);
				model.setOrg_nod_cd        		  (org_nod_cd        	[i]);
				model.setDest_nod_cd       		  (dest_nod_cd       	[i]);
				model.setOrg_nod_tp_cd     		  (org_nod_tp_cd     	[i]);
				model.setDest_nod_tp_cd    		  (dest_nod_tp_cd    	[i]);
				model.setArr_st_dt         		  (arr_st_dt         	[i]);
				model.setDep_fsh_dt        		  (dep_fsh_dt        	[i]);
				model.setTz_dwll_tm_hrs    		  (tz_dwll_tm_hrs    	[i]);
				model.setVsl_cd            		  (vsl_cd            	[i]);
				model.setSkd_voy_no        		  (skd_voy_no        	[i]);
				model.setSkd_dir_cd        		  (skd_dir_cd        	[i]);
				model.setAval_teu_spc      		  (aval_teu_spc      	[i]);
				model.setCurr_cd           		  (curr_cd           	[i]);
				model.setSect_expn_amt     		  (sect_expn_amt     	[i]);
				model.setCre_usr_id        		  (cre_usr_id        	[i]);
				model.setCre_dt            		  (cre_dt            	[i]);
				model.setUpd_usr_id        		  (upd_usr_id        	[i]);
				model.setUpd_dt            		  (upd_dt            	[i]);
				model.setCost_act_grp_seq  		  (cost_act_grp_seq  	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		SCE_COP_GRP model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag             =  (JSPUtil.getParameter(request, prefix + "ibflag            		".trim(), length));
			String[] page_rows          =  (JSPUtil.getParameter(request, prefix + "page_rows         		".trim(), length));
			String[] cop_no             =  (JSPUtil.getParameter(request, prefix + "cop_no            		".trim(), length));
			String[] cop_grp_seq        =  (JSPUtil.getParameter(request, prefix + "cop_grp_seq       		".trim(), length));
			String[] cop_grp_add_seq1   =  (JSPUtil.getParameter(request, prefix + "cop_grp_add_seq1  		".trim(), length));
			String[] cop_grp_add_seq2   =  (JSPUtil.getParameter(request, prefix + "cop_grp_add_seq2  		".trim(), length));
			String[] act_grp_cd         =  (JSPUtil.getParameter(request, prefix + "act_grp_cd        		".trim(), length));
			String[] nod_lnk_ind_cd     =  (JSPUtil.getParameter(request, prefix + "nod_lnk_ind_cd    		".trim(), length));
			String[] bnd_vskd_seq_cd    =  (JSPUtil.getParameter(request, prefix + "bnd_vskd_seq_cd   		".trim(), length));
			String[] trsp_mod_cd        =  (JSPUtil.getParameter(request, prefix + "trsp_mod_cd       		".trim(), length));
			String[] init_pln_cost_amt  =  (JSPUtil.getParameter(request, prefix + "init_pln_cost_amt 		".trim(), length));
			String[] fnl_pln_cost_amt   =  (JSPUtil.getParameter(request, prefix + "fnl_pln_cost_amt  		".trim(), length));
			String[] estm_cost_amt      =  (JSPUtil.getParameter(request, prefix + "estm_cost_amt     		".trim(), length));
			String[] trsp_so_ofc_cty_cd =  (JSPUtil.getParameter(request, prefix + "trsp_so_ofc_cty_cd		".trim(), length));
			String[] trsp_so_seq        =  (JSPUtil.getParameter(request, prefix + "trsp_so_seq       		".trim(), length));
			String[] trsp_so_sts_cd     =  (JSPUtil.getParameter(request, prefix + "trsp_so_sts_cd    		".trim(), length));
			String[] wo_iss_due_dt      =  (JSPUtil.getParameter(request, prefix + "wo_iss_due_dt     		".trim(), length));
			String[] prf_vndr_seq       =  (JSPUtil.getParameter(request, prefix + "prf_vndr_seq      		".trim(), length));
			String[] org_nod_cd         =  (JSPUtil.getParameter(request, prefix + "org_nod_cd        		".trim(), length));
			String[] dest_nod_cd        =  (JSPUtil.getParameter(request, prefix + "dest_nod_cd       		".trim(), length));
			String[] org_nod_tp_cd      =  (JSPUtil.getParameter(request, prefix + "org_nod_tp_cd     		".trim(), length));
			String[] dest_nod_tp_cd     =  (JSPUtil.getParameter(request, prefix + "dest_nod_tp_cd    		".trim(), length));
			String[] arr_st_dt          =  (JSPUtil.getParameter(request, prefix + "arr_st_dt         		".trim(), length));
			String[] dep_fsh_dt         =  (JSPUtil.getParameter(request, prefix + "dep_fsh_dt        		".trim(), length));
			String[] tz_dwll_tm_hrs     =  (JSPUtil.getParameter(request, prefix + "tz_dwll_tm_hrs    		".trim(), length));
			String[] vsl_cd             =  (JSPUtil.getParameter(request, prefix + "vsl_cd            		".trim(), length));
			String[] skd_voy_no         =  (JSPUtil.getParameter(request, prefix + "skd_voy_no        		".trim(), length));
			String[] skd_dir_cd         =  (JSPUtil.getParameter(request, prefix + "skd_dir_cd        		".trim(), length));
			String[] aval_teu_spc       =  (JSPUtil.getParameter(request, prefix + "aval_teu_spc      		".trim(), length));
			String[] curr_cd            =  (JSPUtil.getParameter(request, prefix + "curr_cd           		".trim(), length));
			String[] sect_expn_amt      =  (JSPUtil.getParameter(request, prefix + "sect_expn_amt     		".trim(), length));
			String[] cre_usr_id         =  (JSPUtil.getParameter(request, prefix + "cre_usr_id        		".trim(), length));
			String[] cre_dt             =  (JSPUtil.getParameter(request, prefix + "cre_dt            		".trim(), length));
			String[] upd_usr_id         =  (JSPUtil.getParameter(request, prefix + "upd_usr_id        		".trim(), length));
			String[] upd_dt             =  (JSPUtil.getParameter(request, prefix + "upd_dt            		".trim(), length));
			String[] cost_act_grp_seq   =  (JSPUtil.getParameter(request, prefix + "cost_act_grp_seq  		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new SCE_COP_GRP();
				model.setIbflag            		  ( ibflag            	[i]);
				model.setPage_rows         		  ( page_rows         	[i]);
				model.setCop_no            		  ( cop_no            	[i]);
				model.setCop_grp_seq       		  ( cop_grp_seq       	[i]);
				model.setCop_grp_add_seq1  		  ( cop_grp_add_seq1  	[i]);
				model.setCop_grp_add_seq2  		  ( cop_grp_add_seq2  	[i]);
				model.setAct_grp_cd        		  ( act_grp_cd        	[i]);
				model.setNod_lnk_ind_cd    		  ( nod_lnk_ind_cd    	[i]);
				model.setBnd_vskd_seq_cd   		  ( bnd_vskd_seq_cd   	[i]);
				model.setTrsp_mod_cd       		  ( trsp_mod_cd       	[i]);
				model.setInit_pln_cost_amt 		  ( init_pln_cost_amt 	[i]);
				model.setFnl_pln_cost_amt  		  ( fnl_pln_cost_amt  	[i]);
				model.setEstm_cost_amt     		  ( estm_cost_amt     	[i]);
				model.setTrsp_so_ofc_cty_cd		  ( trsp_so_ofc_cty_cd	[i]);
				model.setTrsp_so_seq       		  ( trsp_so_seq       	[i]);
				model.setTrsp_so_sts_cd    		  ( trsp_so_sts_cd    	[i]);
				model.setWo_iss_due_dt     		  ( wo_iss_due_dt     	[i]);
				model.setPrf_vndr_seq      		  ( prf_vndr_seq      	[i]);
				model.setOrg_nod_cd        		  ( org_nod_cd        	[i]);
				model.setDest_nod_cd       		  ( dest_nod_cd       	[i]);
				model.setOrg_nod_tp_cd     		  ( org_nod_tp_cd     	[i]);
				model.setDest_nod_tp_cd    		  ( dest_nod_tp_cd    	[i]);
				model.setArr_st_dt         		  ( arr_st_dt         	[i]);
				model.setDep_fsh_dt        		  ( dep_fsh_dt        	[i]);
				model.setTz_dwll_tm_hrs    		  ( tz_dwll_tm_hrs    	[i]);
				model.setVsl_cd            		  ( vsl_cd            	[i]);
				model.setSkd_voy_no        		  ( skd_voy_no        	[i]);
				model.setSkd_dir_cd        		  ( skd_dir_cd        	[i]);
				model.setAval_teu_spc      		  ( aval_teu_spc      	[i]);
				model.setCurr_cd           		  ( curr_cd           	[i]);
				model.setSect_expn_amt     		  ( sect_expn_amt     	[i]);
				model.setCre_usr_id        		  ( cre_usr_id        	[i]);
				model.setCre_dt            		  ( cre_dt            	[i]);
				model.setUpd_usr_id        		  ( upd_usr_id        	[i]);
				model.setUpd_dt            		  ( upd_dt            	[i]);
				model.setCost_act_grp_seq  		  ( cost_act_grp_seq  	[i]);
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
