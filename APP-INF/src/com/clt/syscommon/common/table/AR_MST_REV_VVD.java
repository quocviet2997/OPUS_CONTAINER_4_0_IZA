/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : AR_MST_REV_VVD.java
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
public final class AR_MST_REV_VVD implements java.io.Serializable {

	private String       ibflag       = "";
	private String       page_rows    = "";
	private String       vsl_cd       = "";
	private String       skd_voy_no   = "";
	private String       skd_dir_cd   = "";
	private String       voy_tp_cd    = "";
	private String       slan_cd      = "";
	private String       port_chk_flg = "";
	private String       lod_qty      = "";
	private String       rev_port_cd  = "";
	private String       rev_yrmon    = "";
	private String       com_vvd_flg  = "";
	private String       vvd_com_lvl  = "";
	private String       rlane_cd     = "";
	private String       delt_flg     = "";
	private String       cre_usr_id   = "";
	private String       cre_dt       = "";
	private String       eai_evnt_dt  = "";
	private String		 rlane_dir_cd = "";

	public AR_MST_REV_VVD(){}

	public AR_MST_REV_VVD(
			String       ibflag      ,
			String       page_rows   ,
			String       vsl_cd      ,
			String       skd_voy_no  ,
			String       skd_dir_cd  ,
			String       voy_tp_cd   ,
			String       slan_cd     ,
			String       port_chk_flg,
			String       lod_qty     ,
			String       rev_port_cd ,
			String       rev_yrmon   ,
			String       com_vvd_flg ,
			String       vvd_com_lvl ,
			String       rlane_cd    ,
			String       delt_flg    ,
			String       cre_usr_id  ,
			String       cre_dt      ,
			String       eai_evnt_dt ,
			String		 rlane_dir_cd){
		this.ibflag       = ibflag      ;
		this.page_rows    = page_rows   ;
		this.vsl_cd       = vsl_cd      ;
		this.skd_voy_no   = skd_voy_no  ;
		this.skd_dir_cd   = skd_dir_cd  ;
		this.voy_tp_cd    = voy_tp_cd   ;
		this.slan_cd      = slan_cd     ;
		this.port_chk_flg = port_chk_flg;
		this.lod_qty      = lod_qty     ;
		this.rev_port_cd  = rev_port_cd ;
		this.rev_yrmon    = rev_yrmon   ;
		this.com_vvd_flg  = com_vvd_flg ;
		this.vvd_com_lvl  = vvd_com_lvl ;
		this.rlane_cd     = rlane_cd    ;
		this.delt_flg     = delt_flg    ;
		this.cre_usr_id   = cre_usr_id  ;
		this.cre_dt       = cre_dt      ;
		this.eai_evnt_dt  = eai_evnt_dt ;
		this.rlane_dir_cd		 = rlane_dir_cd;
	}

	// getter method is proceeding ..
	public String       getIbflag      (){	return ibflag      	;	}
	public String       getPage_rows   (){	return page_rows   	;	}
	public String       getVsl_cd      (){	return vsl_cd      	;	}
	public String       getSkd_voy_no  (){	return skd_voy_no  	;	}
	public String       getSkd_dir_cd  (){	return skd_dir_cd  	;	}
	public String       getVoy_tp_cd   (){	return voy_tp_cd   	;	}
	public String       getSlan_cd     (){	return slan_cd     	;	}
	public String       getPort_chk_flg(){	return port_chk_flg	;	}
	public String       getLod_qty     (){	return lod_qty     	;	}
	public String       getRev_port_cd (){	return rev_port_cd 	;	}
	public String       getRev_yrmon   (){	return rev_yrmon   	;	}
	public String       getCom_vvd_flg (){	return com_vvd_flg 	;	}
	public String       getVvd_com_lvl (){	return vvd_com_lvl 	;	}
	public String       getRlane_cd    (){	return rlane_cd    	;	}
	public String       getDelt_flg    (){	return delt_flg    	;	}
	public String       getCre_usr_id  (){	return cre_usr_id  	;	}
	public String       getCre_dt      (){	return cre_dt      	;	}
	public String       getEai_evnt_dt (){	return eai_evnt_dt 	;	}
	public String       getRlane_dir_cd (){	return rlane_dir_cd 	;	}

	// setter method is proceeding ..
	public void setIbflag      ( String       ibflag       ){	this.ibflag       = ibflag      	;	}
	public void setPage_rows   ( String       page_rows    ){	this.page_rows    = page_rows   	;	}
	public void setVsl_cd      ( String       vsl_cd       ){	this.vsl_cd       = vsl_cd      	;	}
	public void setSkd_voy_no  ( String       skd_voy_no   ){	this.skd_voy_no   = skd_voy_no  	;	}
	public void setSkd_dir_cd  ( String       skd_dir_cd   ){	this.skd_dir_cd   = skd_dir_cd  	;	}
	public void setVoy_tp_cd   ( String       voy_tp_cd    ){	this.voy_tp_cd    = voy_tp_cd   	;	}
	public void setSlan_cd     ( String       slan_cd      ){	this.slan_cd      = slan_cd     	;	}
	public void setPort_chk_flg( String       port_chk_flg ){	this.port_chk_flg = port_chk_flg	;	}
	public void setLod_qty     ( String       lod_qty      ){	this.lod_qty      = lod_qty     	;	}
	public void setRev_port_cd ( String       rev_port_cd  ){	this.rev_port_cd  = rev_port_cd 	;	}
	public void setRev_yrmon   ( String       rev_yrmon    ){	this.rev_yrmon    = rev_yrmon   	;	}
	public void setCom_vvd_flg ( String       com_vvd_flg  ){	this.com_vvd_flg  = com_vvd_flg 	;	}
	public void setVvd_com_lvl ( String       vvd_com_lvl  ){	this.vvd_com_lvl  = vvd_com_lvl 	;	}
	public void setRlane_cd    ( String       rlane_cd     ){	this.rlane_cd     = rlane_cd    	;	}
	public void setDelt_flg    ( String       delt_flg     ){	this.delt_flg     = delt_flg    	;	}
	public void setCre_usr_id  ( String       cre_usr_id   ){	this.cre_usr_id   = cre_usr_id  	;	}
	public void setCre_dt      ( String       cre_dt       ){	this.cre_dt       = cre_dt      	;	}
	public void setEai_evnt_dt ( String       eai_evnt_dt  ){	this.eai_evnt_dt  = eai_evnt_dt 	;	}
	public void setRlane_dir_cd ( String       rlane_dir_cd  ){	this.rlane_dir_cd  = rlane_dir_cd 	;	}

	public static AR_MST_REV_VVD fromRequest(HttpServletRequest request) {
		AR_MST_REV_VVD model = new AR_MST_REV_VVD();
		try {
			model.setIbflag      	(JSPUtil.getParameter(request, "ibflag      		".trim(), ""));
			model.setPage_rows   	(JSPUtil.getParameter(request, "page_rows   		".trim(), ""));
			model.setVsl_cd      	(JSPUtil.getParameter(request, "vsl_cd      		".trim(), ""));
			model.setSkd_voy_no  	(JSPUtil.getParameter(request, "skd_voy_no  		".trim(), ""));
			model.setSkd_dir_cd  	(JSPUtil.getParameter(request, "skd_dir_cd  		".trim(), ""));
			model.setVoy_tp_cd   	(JSPUtil.getParameter(request, "voy_tp_cd   		".trim(), ""));
			model.setSlan_cd     	(JSPUtil.getParameter(request, "slan_cd     		".trim(), ""));
			model.setPort_chk_flg	(JSPUtil.getParameter(request, "port_chk_flg		".trim(), ""));
			model.setLod_qty     	(JSPUtil.getParameter(request, "lod_qty     		".trim(), ""));
			model.setRev_port_cd 	(JSPUtil.getParameter(request, "rev_port_cd 		".trim(), ""));
			model.setRev_yrmon   	(JSPUtil.getParameter(request, "rev_yrmon   		".trim(), ""));
			model.setCom_vvd_flg 	(JSPUtil.getParameter(request, "com_vvd_flg 		".trim(), ""));
			model.setVvd_com_lvl 	(JSPUtil.getParameter(request, "vvd_com_lvl 		".trim(), ""));
			model.setRlane_cd    	(JSPUtil.getParameter(request, "rlane_cd    		".trim(), ""));
			model.setDelt_flg    	(JSPUtil.getParameter(request, "delt_flg    		".trim(), ""));
			model.setCre_usr_id  	(JSPUtil.getParameter(request, "cre_usr_id  		".trim(), ""));
			model.setCre_dt      	(JSPUtil.getParameter(request, "cre_dt      		".trim(), ""));
			model.setEai_evnt_dt 	(JSPUtil.getParameter(request, "eai_evnt_dt 		".trim(), ""));
			model.setRlane_dir_cd 	(JSPUtil.getParameter(request, "rlane_dir_cd 		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		AR_MST_REV_VVD model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag       =  (JSPUtil.getParameter(request, "ibflag      		".trim(), length));
			String[] page_rows    =  (JSPUtil.getParameter(request, "page_rows   		".trim(), length));
			String[] vsl_cd       =  (JSPUtil.getParameter(request, "vsl_cd      		".trim(), length));
			String[] skd_voy_no   =  (JSPUtil.getParameter(request, "skd_voy_no  		".trim(), length));
			String[] skd_dir_cd   =  (JSPUtil.getParameter(request, "skd_dir_cd  		".trim(), length));
			String[] voy_tp_cd    =  (JSPUtil.getParameter(request, "voy_tp_cd   		".trim(), length));
			String[] slan_cd      =  (JSPUtil.getParameter(request, "slan_cd     		".trim(), length));
			String[] port_chk_flg =  (JSPUtil.getParameter(request, "port_chk_flg		".trim(), length));
			String[] lod_qty      =  (JSPUtil.getParameter(request, "lod_qty     		".trim(), length));
			String[] rev_port_cd  =  (JSPUtil.getParameter(request, "rev_port_cd 		".trim(), length));
			String[] rev_yrmon    =  (JSPUtil.getParameter(request, "rev_yrmon   		".trim(), length));
			String[] com_vvd_flg  =  (JSPUtil.getParameter(request, "com_vvd_flg 		".trim(), length));
			String[] vvd_com_lvl  =  (JSPUtil.getParameter(request, "vvd_com_lvl 		".trim(), length));
			String[] rlane_cd     =  (JSPUtil.getParameter(request, "rlane_cd    		".trim(), length));
			String[] delt_flg     =  (JSPUtil.getParameter(request, "delt_flg    		".trim(), length));
			String[] cre_usr_id   =  (JSPUtil.getParameter(request, "cre_usr_id  		".trim(), length));
			String[] cre_dt       =  (JSPUtil.getParameter(request, "cre_dt      		".trim(), length));
			String[] eai_evnt_dt  =  (JSPUtil.getParameter(request, "eai_evnt_dt 		".trim(), length));
			String[] rlane_dir_cd  =  (JSPUtil.getParameter(request, "rlane_dir_cd 		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new AR_MST_REV_VVD();
				model.setIbflag      		  (ibflag      	[i]);
				model.setPage_rows   		  (page_rows   	[i]);
				model.setVsl_cd      		  (vsl_cd      	[i]);
				model.setSkd_voy_no  		  (skd_voy_no  	[i]);
				model.setSkd_dir_cd  		  (skd_dir_cd  	[i]);
				model.setVoy_tp_cd   		  (voy_tp_cd   	[i]);
				model.setSlan_cd     		  (slan_cd     	[i]);
				model.setPort_chk_flg		  (port_chk_flg	[i]);
				model.setLod_qty     		  (lod_qty     	[i]);
				model.setRev_port_cd 		  (rev_port_cd 	[i]);
				model.setRev_yrmon   		  (rev_yrmon   	[i]);
				model.setCom_vvd_flg 		  (com_vvd_flg 	[i]);
				model.setVvd_com_lvl 		  (vvd_com_lvl 	[i]);
				model.setRlane_cd    		  (rlane_cd    	[i]);
				model.setDelt_flg    		  (delt_flg    	[i]);
				model.setCre_usr_id  		  (cre_usr_id  	[i]);
				model.setCre_dt      		  (cre_dt      	[i]);
				model.setEai_evnt_dt 		  (eai_evnt_dt 	[i]);
				model.setRlane_dir_cd 		  (rlane_dir_cd 	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		AR_MST_REV_VVD model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag       =  (JSPUtil.getParameter(request, prefix + "ibflag      		".trim(), length));
			String[] page_rows    =  (JSPUtil.getParameter(request, prefix + "page_rows   		".trim(), length));
			String[] vsl_cd       =  (JSPUtil.getParameter(request, prefix + "vsl_cd      		".trim(), length));
			String[] skd_voy_no   =  (JSPUtil.getParameter(request, prefix + "skd_voy_no  		".trim(), length));
			String[] skd_dir_cd   =  (JSPUtil.getParameter(request, prefix + "skd_dir_cd  		".trim(), length));
			String[] voy_tp_cd    =  (JSPUtil.getParameter(request, prefix + "voy_tp_cd   		".trim(), length));
			String[] slan_cd      =  (JSPUtil.getParameter(request, prefix + "slan_cd     		".trim(), length));
			String[] port_chk_flg =  (JSPUtil.getParameter(request, prefix + "port_chk_flg		".trim(), length));
			String[] lod_qty      =  (JSPUtil.getParameter(request, prefix + "lod_qty     		".trim(), length));
			String[] rev_port_cd  =  (JSPUtil.getParameter(request, prefix + "rev_port_cd 		".trim(), length));
			String[] rev_yrmon    =  (JSPUtil.getParameter(request, prefix + "rev_yrmon   		".trim(), length));
			String[] com_vvd_flg  =  (JSPUtil.getParameter(request, prefix + "com_vvd_flg 		".trim(), length));
			String[] vvd_com_lvl  =  (JSPUtil.getParameter(request, prefix + "vvd_com_lvl 		".trim(), length));
			String[] rlane_cd     =  (JSPUtil.getParameter(request, prefix + "rlane_cd    		".trim(), length));
			String[] delt_flg     =  (JSPUtil.getParameter(request, prefix + "delt_flg    		".trim(), length));
			String[] cre_usr_id   =  (JSPUtil.getParameter(request, prefix + "cre_usr_id  		".trim(), length));
			String[] cre_dt       =  (JSPUtil.getParameter(request, prefix + "cre_dt      		".trim(), length));
			String[] eai_evnt_dt  =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt 		".trim(), length));
			String[] rlane_dir_cd  =  (JSPUtil.getParameter(request, prefix + "rlane_dir_cd 		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new AR_MST_REV_VVD();
				model.setIbflag      		  ( ibflag      	[i]);
				model.setPage_rows   		  ( page_rows   	[i]);
				model.setVsl_cd      		  ( vsl_cd      	[i]);
				model.setSkd_voy_no  		  ( skd_voy_no  	[i]);
				model.setSkd_dir_cd  		  ( skd_dir_cd  	[i]);
				model.setVoy_tp_cd   		  ( voy_tp_cd   	[i]);
				model.setSlan_cd     		  ( slan_cd     	[i]);
				model.setPort_chk_flg		  ( port_chk_flg	[i]);
				model.setLod_qty     		  ( lod_qty     	[i]);
				model.setRev_port_cd 		  ( rev_port_cd 	[i]);
				model.setRev_yrmon   		  ( rev_yrmon   	[i]);
				model.setCom_vvd_flg 		  ( com_vvd_flg 	[i]);
				model.setVvd_com_lvl 		  ( vvd_com_lvl 	[i]);
				model.setRlane_cd    		  ( rlane_cd    	[i]);
				model.setDelt_flg    		  ( delt_flg    	[i]);
				model.setCre_usr_id  		  ( cre_usr_id  	[i]);
				model.setCre_dt      		  ( cre_dt      	[i]);
				model.setEai_evnt_dt 		  ( eai_evnt_dt 	[i]);
				model.setRlane_dir_cd 		  ( rlane_dir_cd 	[i]);
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
