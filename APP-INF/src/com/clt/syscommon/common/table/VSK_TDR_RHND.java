/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : VSK_TDR_RHND.java
*@FileTitle : Marine Terminal Storage Container List 조회 - Coincidence
*Open Issues :
*Change history :
*@LastModifyDate : 2006-12-07
*@LastModifier : kimjinjoo
*@LastVersion : 1.0
* 2006-12-07 kimjinjoo
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
 * @author kimjinjoo
 * @since J2EE 1.4
 */
public final class VSK_TDR_RHND implements java.io.Serializable {

	private String           ibflag           = "";
	private String           page_rows        = "";
	private String           rhnd_tp_cd       = "";
	private String           cntr_no          = "";
	private String           vsl_cd           = "";
	private String           skd_voy_no       = "";
	private String           skd_dir_cd       = "";
	private String           vps_loc_cd       = "";
	private String           vps_call_ind_cd  = "";
	private String           vsl_op_cd        = "";
	private String           pol_cd           = "";
	private String           pod_cd           = "";
	private String           cntr_tpsz_cd     = "";
	private String           pre_cell_psn_no  = "";
	private String           crnt_cell_psn_no = "";
	private String           rhnd_rsn_cd      = "";
	private String           respb_opr_cd     = "";
	private String           respb_pty_cd     = "";
	private String           rhnd_rsn_cntr_no = "";
	private String           cre_usr_id       = "";
	private String           cre_dt           = "";
	private String           upd_usr_id       = "";
	private String           upd_dt           = "";

	public VSK_TDR_RHND(){}

	public VSK_TDR_RHND(
			String           ibflag          ,
			String           page_rows       ,
			String           rhnd_tp_cd      ,
			String           cntr_no         ,
			String           vsl_cd          ,
			String           skd_voy_no      ,
			String           skd_dir_cd      ,
			String           vps_loc_cd      ,
			String           vps_call_ind_cd ,
			String           vsl_op_cd       ,
			String           pol_cd          ,
			String           pod_cd          ,
			String           cntr_tpsz_cd    ,
			String           pre_cell_psn_no ,
			String           crnt_cell_psn_no,
			String           rhnd_rsn_cd     ,
			String           respb_opr_cd    ,
			String           respb_pty_cd    ,
			String           rhnd_rsn_cntr_no,
			String           cre_usr_id      ,
			String           cre_dt          ,
			String           upd_usr_id      ,
			String           upd_dt          ){
		this.ibflag           = ibflag          ;
		this.page_rows        = page_rows       ;
		this.rhnd_tp_cd       = rhnd_tp_cd      ;
		this.cntr_no          = cntr_no         ;
		this.vsl_cd           = vsl_cd          ;
		this.skd_voy_no       = skd_voy_no      ;
		this.skd_dir_cd       = skd_dir_cd      ;
		this.vps_loc_cd       = vps_loc_cd      ;
		this.vps_call_ind_cd  = vps_call_ind_cd ;
		this.vsl_op_cd        = vsl_op_cd       ;
		this.pol_cd           = pol_cd          ;
		this.pod_cd           = pod_cd          ;
		this.cntr_tpsz_cd     = cntr_tpsz_cd    ;
		this.pre_cell_psn_no  = pre_cell_psn_no ;
		this.crnt_cell_psn_no = crnt_cell_psn_no;
		this.rhnd_rsn_cd      = rhnd_rsn_cd     ;
		this.respb_opr_cd     = respb_opr_cd    ;
		this.respb_pty_cd     = respb_pty_cd    ;
		this.rhnd_rsn_cntr_no = rhnd_rsn_cntr_no;
		this.cre_usr_id       = cre_usr_id      ;
		this.cre_dt           = cre_dt          ;
		this.upd_usr_id       = upd_usr_id      ;
		this.upd_dt           = upd_dt          ;
	}

	// getter method is proceeding ..
	public String           getIbflag          (){	return ibflag          	;	}
	public String           getPage_rows       (){	return page_rows       	;	}
	public String           getRhnd_tp_cd      (){	return rhnd_tp_cd      	;	}
	public String           getCntr_no         (){	return cntr_no         	;	}
	public String           getVsl_cd          (){	return vsl_cd          	;	}
	public String           getSkd_voy_no      (){	return skd_voy_no      	;	}
	public String           getSkd_dir_cd      (){	return skd_dir_cd      	;	}
	public String           getVps_loc_cd      (){	return vps_loc_cd      	;	}
	public String           getVps_call_ind_cd (){	return vps_call_ind_cd 	;	}
	public String           getVsl_op_cd       (){	return vsl_op_cd       	;	}
	public String           getPol_cd          (){	return pol_cd          	;	}
	public String           getPod_cd          (){	return pod_cd          	;	}
	public String           getCntr_tpsz_cd    (){	return cntr_tpsz_cd    	;	}
	public String           getPre_cell_psn_no (){	return pre_cell_psn_no 	;	}
	public String           getCrnt_cell_psn_no(){	return crnt_cell_psn_no	;	}
	public String           getRhnd_rsn_cd     (){	return rhnd_rsn_cd     	;	}
	public String           getRespb_opr_cd    (){	return respb_opr_cd    	;	}
	public String           getRespb_pty_cd    (){	return respb_pty_cd    	;	}
	public String           getRhnd_rsn_cntr_no(){	return rhnd_rsn_cntr_no	;	}
	public String           getCre_usr_id      (){	return cre_usr_id      	;	}
	public String           getCre_dt          (){	return cre_dt          	;	}
	public String           getUpd_usr_id      (){	return upd_usr_id      	;	}
	public String           getUpd_dt          (){	return upd_dt          	;	}

	// setter method is proceeding ..
	public void setIbflag          ( String           ibflag           ){	this.ibflag           = ibflag          	;	}
	public void setPage_rows       ( String           page_rows        ){	this.page_rows        = page_rows       	;	}
	public void setRhnd_tp_cd      ( String           rhnd_tp_cd       ){	this.rhnd_tp_cd       = rhnd_tp_cd      	;	}
	public void setCntr_no         ( String           cntr_no          ){	this.cntr_no          = cntr_no         	;	}
	public void setVsl_cd          ( String           vsl_cd           ){	this.vsl_cd           = vsl_cd          	;	}
	public void setSkd_voy_no      ( String           skd_voy_no       ){	this.skd_voy_no       = skd_voy_no      	;	}
	public void setSkd_dir_cd      ( String           skd_dir_cd       ){	this.skd_dir_cd       = skd_dir_cd      	;	}
	public void setVps_loc_cd      ( String           vps_loc_cd       ){	this.vps_loc_cd       = vps_loc_cd      	;	}
	public void setVps_call_ind_cd ( String           vps_call_ind_cd  ){	this.vps_call_ind_cd  = vps_call_ind_cd 	;	}
	public void setVsl_op_cd       ( String           vsl_op_cd        ){	this.vsl_op_cd        = vsl_op_cd       	;	}
	public void setPol_cd          ( String           pol_cd           ){	this.pol_cd           = pol_cd          	;	}
	public void setPod_cd          ( String           pod_cd           ){	this.pod_cd           = pod_cd          	;	}
	public void setCntr_tpsz_cd    ( String           cntr_tpsz_cd     ){	this.cntr_tpsz_cd     = cntr_tpsz_cd    	;	}
	public void setPre_cell_psn_no ( String           pre_cell_psn_no  ){	this.pre_cell_psn_no  = pre_cell_psn_no 	;	}
	public void setCrnt_cell_psn_no( String           crnt_cell_psn_no ){	this.crnt_cell_psn_no = crnt_cell_psn_no	;	}
	public void setRhnd_rsn_cd     ( String           rhnd_rsn_cd      ){	this.rhnd_rsn_cd      = rhnd_rsn_cd     	;	}
	public void setRespb_opr_cd    ( String           respb_opr_cd     ){	this.respb_opr_cd     = respb_opr_cd    	;	}
	public void setRespb_pty_cd    ( String           respb_pty_cd     ){	this.respb_pty_cd     = respb_pty_cd    	;	}
	public void setRhnd_rsn_cntr_no( String           rhnd_rsn_cntr_no ){	this.rhnd_rsn_cntr_no = rhnd_rsn_cntr_no	;	}
	public void setCre_usr_id      ( String           cre_usr_id       ){	this.cre_usr_id       = cre_usr_id      	;	}
	public void setCre_dt          ( String           cre_dt           ){	this.cre_dt           = cre_dt          	;	}
	public void setUpd_usr_id      ( String           upd_usr_id       ){	this.upd_usr_id       = upd_usr_id      	;	}
	public void setUpd_dt          ( String           upd_dt           ){	this.upd_dt           = upd_dt          	;	}

	public static VSK_TDR_RHND fromRequest(HttpServletRequest request) {
		VSK_TDR_RHND model = new VSK_TDR_RHND();
		try {
			model.setIbflag          	(JSPUtil.getParameter(request, "ibflag          		".trim(), ""));
			model.setPage_rows       	(JSPUtil.getParameter(request, "page_rows       		".trim(), ""));
			model.setRhnd_tp_cd      	(JSPUtil.getParameter(request, "rhnd_tp_cd      		".trim(), ""));
			model.setCntr_no         	(JSPUtil.getParameter(request, "cntr_no         		".trim(), ""));
			model.setVsl_cd          	(JSPUtil.getParameter(request, "vsl_cd          		".trim(), ""));
			model.setSkd_voy_no      	(JSPUtil.getParameter(request, "skd_voy_no      		".trim(), ""));
			model.setSkd_dir_cd      	(JSPUtil.getParameter(request, "skd_dir_cd      		".trim(), ""));
			model.setVps_loc_cd      	(JSPUtil.getParameter(request, "vps_loc_cd      		".trim(), ""));
			model.setVps_call_ind_cd 	(JSPUtil.getParameter(request, "vps_call_ind_cd 		".trim(), ""));
			model.setVsl_op_cd       	(JSPUtil.getParameter(request, "vsl_op_cd       		".trim(), ""));
			model.setPol_cd          	(JSPUtil.getParameter(request, "pol_cd          		".trim(), ""));
			model.setPod_cd          	(JSPUtil.getParameter(request, "pod_cd          		".trim(), ""));
			model.setCntr_tpsz_cd    	(JSPUtil.getParameter(request, "cntr_tpsz_cd    		".trim(), ""));
			model.setPre_cell_psn_no 	(JSPUtil.getParameter(request, "pre_cell_psn_no 		".trim(), ""));
			model.setCrnt_cell_psn_no	(JSPUtil.getParameter(request, "crnt_cell_psn_no		".trim(), ""));
			model.setRhnd_rsn_cd     	(JSPUtil.getParameter(request, "rhnd_rsn_cd     		".trim(), ""));
			model.setRespb_opr_cd    	(JSPUtil.getParameter(request, "respb_opr_cd    		".trim(), ""));
			model.setRespb_pty_cd    	(JSPUtil.getParameter(request, "respb_pty_cd    		".trim(), ""));
			model.setRhnd_rsn_cntr_no	(JSPUtil.getParameter(request, "rhnd_rsn_cntr_no		".trim(), ""));
			model.setCre_usr_id      	(JSPUtil.getParameter(request, "cre_usr_id      		".trim(), ""));
			model.setCre_dt          	(JSPUtil.getParameter(request, "cre_dt          		".trim(), ""));
			model.setUpd_usr_id      	(JSPUtil.getParameter(request, "upd_usr_id      		".trim(), ""));
			model.setUpd_dt          	(JSPUtil.getParameter(request, "upd_dt          		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		VSK_TDR_RHND model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag           =  (JSPUtil.getParameter(request, "ibflag          		".trim(), length));
			String[] page_rows        =  (JSPUtil.getParameter(request, "page_rows       		".trim(), length));
			String[] rhnd_tp_cd       =  (JSPUtil.getParameter(request, "rhnd_tp_cd      		".trim(), length));
			String[] cntr_no          =  (JSPUtil.getParameter(request, "cntr_no         		".trim(), length));
			String[] vsl_cd           =  (JSPUtil.getParameter(request, "vsl_cd          		".trim(), length));
			String[] skd_voy_no       =  (JSPUtil.getParameter(request, "skd_voy_no      		".trim(), length));
			String[] skd_dir_cd       =  (JSPUtil.getParameter(request, "skd_dir_cd      		".trim(), length));
			String[] vps_loc_cd       =  (JSPUtil.getParameter(request, "vps_loc_cd      		".trim(), length));
			String[] vps_call_ind_cd  =  (JSPUtil.getParameter(request, "vps_call_ind_cd 		".trim(), length));
			String[] vsl_op_cd        =  (JSPUtil.getParameter(request, "vsl_op_cd       		".trim(), length));
			String[] pol_cd           =  (JSPUtil.getParameter(request, "pol_cd          		".trim(), length));
			String[] pod_cd           =  (JSPUtil.getParameter(request, "pod_cd          		".trim(), length));
			String[] cntr_tpsz_cd     =  (JSPUtil.getParameter(request, "cntr_tpsz_cd    		".trim(), length));
			String[] pre_cell_psn_no  =  (JSPUtil.getParameter(request, "pre_cell_psn_no 		".trim(), length));
			String[] crnt_cell_psn_no =  (JSPUtil.getParameter(request, "crnt_cell_psn_no		".trim(), length));
			String[] rhnd_rsn_cd      =  (JSPUtil.getParameter(request, "rhnd_rsn_cd     		".trim(), length));
			String[] respb_opr_cd     =  (JSPUtil.getParameter(request, "respb_opr_cd    		".trim(), length));
			String[] respb_pty_cd     =  (JSPUtil.getParameter(request, "respb_pty_cd    		".trim(), length));
			String[] rhnd_rsn_cntr_no =  (JSPUtil.getParameter(request, "rhnd_rsn_cntr_no		".trim(), length));
			String[] cre_usr_id       =  (JSPUtil.getParameter(request, "cre_usr_id      		".trim(), length));
			String[] cre_dt           =  (JSPUtil.getParameter(request, "cre_dt          		".trim(), length));
			String[] upd_usr_id       =  (JSPUtil.getParameter(request, "upd_usr_id      		".trim(), length));
			String[] upd_dt           =  (JSPUtil.getParameter(request, "upd_dt          		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new VSK_TDR_RHND();
				model.setIbflag          		  (ibflag          	[i]);
				model.setPage_rows       		  (page_rows       	[i]);
				model.setRhnd_tp_cd      		  (rhnd_tp_cd      	[i]);
				model.setCntr_no         		  (cntr_no         	[i]);
				model.setVsl_cd          		  (vsl_cd          	[i]);
				model.setSkd_voy_no      		  (skd_voy_no      	[i]);
				model.setSkd_dir_cd      		  (skd_dir_cd      	[i]);
				model.setVps_loc_cd      		  (vps_loc_cd      	[i]);
				model.setVps_call_ind_cd 		  (vps_call_ind_cd 	[i]);
				model.setVsl_op_cd       		  (vsl_op_cd       	[i]);
				model.setPol_cd          		  (pol_cd          	[i]);
				model.setPod_cd          		  (pod_cd          	[i]);
				model.setCntr_tpsz_cd    		  (cntr_tpsz_cd    	[i]);
				model.setPre_cell_psn_no 		  (pre_cell_psn_no 	[i]);
				model.setCrnt_cell_psn_no		  (crnt_cell_psn_no	[i]);
				model.setRhnd_rsn_cd     		  (rhnd_rsn_cd     	[i]);
				model.setRespb_opr_cd    		  (respb_opr_cd    	[i]);
				model.setRespb_pty_cd    		  (respb_pty_cd    	[i]);
				model.setRhnd_rsn_cntr_no		  (rhnd_rsn_cntr_no	[i]);
				model.setCre_usr_id      		  (cre_usr_id      	[i]);
				model.setCre_dt          		  (cre_dt          	[i]);
				model.setUpd_usr_id      		  (upd_usr_id      	[i]);
				model.setUpd_dt          		  (upd_dt          	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		VSK_TDR_RHND model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag           =  (JSPUtil.getParameter(request, prefix + "ibflag          		".trim(), length));
			String[] page_rows        =  (JSPUtil.getParameter(request, prefix + "page_rows       		".trim(), length));
			String[] rhnd_tp_cd       =  (JSPUtil.getParameter(request, prefix + "rhnd_tp_cd      		".trim(), length));
			String[] cntr_no          =  (JSPUtil.getParameter(request, prefix + "cntr_no         		".trim(), length));
			String[] vsl_cd           =  (JSPUtil.getParameter(request, prefix + "vsl_cd          		".trim(), length));
			String[] skd_voy_no       =  (JSPUtil.getParameter(request, prefix + "skd_voy_no      		".trim(), length));
			String[] skd_dir_cd       =  (JSPUtil.getParameter(request, prefix + "skd_dir_cd      		".trim(), length));
			String[] vps_loc_cd       =  (JSPUtil.getParameter(request, prefix + "vps_loc_cd      		".trim(), length));
			String[] vps_call_ind_cd  =  (JSPUtil.getParameter(request, prefix + "vps_call_ind_cd 		".trim(), length));
			String[] vsl_op_cd        =  (JSPUtil.getParameter(request, prefix + "vsl_op_cd       		".trim(), length));
			String[] pol_cd           =  (JSPUtil.getParameter(request, prefix + "pol_cd          		".trim(), length));
			String[] pod_cd           =  (JSPUtil.getParameter(request, prefix + "pod_cd          		".trim(), length));
			String[] cntr_tpsz_cd     =  (JSPUtil.getParameter(request, prefix + "cntr_tpsz_cd    		".trim(), length));
			String[] pre_cell_psn_no  =  (JSPUtil.getParameter(request, prefix + "pre_cell_psn_no 		".trim(), length));
			String[] crnt_cell_psn_no =  (JSPUtil.getParameter(request, prefix + "crnt_cell_psn_no		".trim(), length));
			String[] rhnd_rsn_cd      =  (JSPUtil.getParameter(request, prefix + "rhnd_rsn_cd     		".trim(), length));
			String[] respb_opr_cd     =  (JSPUtil.getParameter(request, prefix + "respb_opr_cd    		".trim(), length));
			String[] respb_pty_cd     =  (JSPUtil.getParameter(request, prefix + "respb_pty_cd    		".trim(), length));
			String[] rhnd_rsn_cntr_no =  (JSPUtil.getParameter(request, prefix + "rhnd_rsn_cntr_no		".trim(), length));
			String[] cre_usr_id       =  (JSPUtil.getParameter(request, prefix + "cre_usr_id      		".trim(), length));
			String[] cre_dt           =  (JSPUtil.getParameter(request, prefix + "cre_dt          		".trim(), length));
			String[] upd_usr_id       =  (JSPUtil.getParameter(request, prefix + "upd_usr_id      		".trim(), length));
			String[] upd_dt           =  (JSPUtil.getParameter(request, prefix + "upd_dt          		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new VSK_TDR_RHND();
				model.setIbflag          		  ( ibflag          	[i]);
				model.setPage_rows       		  ( page_rows       	[i]);
				model.setRhnd_tp_cd      		  ( rhnd_tp_cd      	[i]);
				model.setCntr_no         		  ( cntr_no         	[i]);
				model.setVsl_cd          		  ( vsl_cd          	[i]);
				model.setSkd_voy_no      		  ( skd_voy_no      	[i]);
				model.setSkd_dir_cd      		  ( skd_dir_cd      	[i]);
				model.setVps_loc_cd      		  ( vps_loc_cd      	[i]);
				model.setVps_call_ind_cd 		  ( vps_call_ind_cd 	[i]);
				model.setVsl_op_cd       		  ( vsl_op_cd       	[i]);
				model.setPol_cd          		  ( pol_cd          	[i]);
				model.setPod_cd          		  ( pod_cd          	[i]);
				model.setCntr_tpsz_cd    		  ( cntr_tpsz_cd    	[i]);
				model.setPre_cell_psn_no 		  ( pre_cell_psn_no 	[i]);
				model.setCrnt_cell_psn_no		  ( crnt_cell_psn_no	[i]);
				model.setRhnd_rsn_cd     		  ( rhnd_rsn_cd     	[i]);
				model.setRespb_opr_cd    		  ( respb_opr_cd    	[i]);
				model.setRespb_pty_cd    		  ( respb_pty_cd    	[i]);
				model.setRhnd_rsn_cntr_no		  ( rhnd_rsn_cntr_no	[i]);
				model.setCre_usr_id      		  ( cre_usr_id      	[i]);
				model.setCre_dt          		  ( cre_dt          	[i]);
				model.setUpd_usr_id      		  ( upd_usr_id      	[i]);
				model.setUpd_dt          		  ( upd_dt          	[i]);
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
