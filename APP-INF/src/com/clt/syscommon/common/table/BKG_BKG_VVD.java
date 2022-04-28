/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : BKG_BKG_VVD.java
*@FileTitle : 사용자 관리5
*Open Issues :
*Change history :
*@LastModifyDate : 2007-01-05
*@LastModifier : Kildong_hong6
*@LastVersion : 1.0
* 2007-01-05 Kildong_hong6
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
public final class BKG_BKG_VVD implements java.io.Serializable {

	private String		ibflag			= "";
	private String		page_rows		= "";
	private String		bkg_no         	= "";
	private String		bkg_no_split   	= "";
	private String		vsl_pre_pst_cd 	= "";
	private String		vsl_seq        	= "";
	private String		vsl_cd         	= "";
	private String		skd_voy_no     	= "";
	private String		skd_dir_cd     	= "";
	private String		slan_cd        	= "";
	private String		vsl_lodg_dt    	= "";
	private String		vsl_pol_cd     	= "";
	private String		vsl_pod_cd     	= "";
	private String		cntr_lodg_flg  	= "";
	private String		nis_evnt_dt    	= "";
	private String		oop_cd         	= "";
	private String		trns_mod_cd    	= "";
	private String		fdr_cnn_tml_cd 	= "";
	private String		eai_evnt_dt    	= "";

	//2009.01.15 add
	private String		pol_zone_cd		= "";
  
	public BKG_BKG_VVD(){}

	public BKG_BKG_VVD(
			String         ibflag        ,
			String         page_rows     ,
			String         bkg_no        ,
			String         bkg_no_split  ,
			String         vsl_pre_pst_cd,
			String         vsl_seq       ,
			String         vsl_cd        ,
			String         skd_voy_no    ,
			String         skd_dir_cd    ,
			String         slan_cd       ,
			String         vsl_lodg_dt   ,
			String         vsl_pol_cd    ,
			String         vsl_pod_cd    ,
			String         cntr_lodg_flg ,
			String         nis_evnt_dt   ,
			String         oop_cd        ,
			String         trns_mod_cd   ,
			String 		   fdr_cnn_tml_cd,
			String 		   pol_zone_cd,
			String         eai_evnt_dt   ){
		this.ibflag         = ibflag        ;
		this.page_rows      = page_rows     ;
		this.bkg_no         = bkg_no        ;
		this.bkg_no_split   = bkg_no_split  ;
		this.vsl_pre_pst_cd = vsl_pre_pst_cd;
		this.vsl_seq        = vsl_seq       ;
		this.vsl_cd         = vsl_cd        ;
		this.skd_voy_no     = skd_voy_no    ;
		this.skd_dir_cd     = skd_dir_cd    ;
		this.slan_cd        = slan_cd       ;
		this.vsl_lodg_dt    = vsl_lodg_dt   ;
		this.vsl_pol_cd     = vsl_pol_cd    ;
		this.vsl_pod_cd     = vsl_pod_cd    ;
		this.cntr_lodg_flg  = cntr_lodg_flg ;
		this.nis_evnt_dt    = nis_evnt_dt   ;
		this.oop_cd         = oop_cd        ;
		this.trns_mod_cd    = trns_mod_cd   ;
		this.fdr_cnn_tml_cd = fdr_cnn_tml_cd;
		this.pol_zone_cd	= pol_zone_cd	;
		this.eai_evnt_dt    = eai_evnt_dt   ;
	}


	// getter method is proceeding ..
	public String         getIbflag        	(){	return ibflag        	;	}
	public String         getPage_rows     	(){	return page_rows     	;	}
	public String         getBkg_no        	(){	return bkg_no        	;	}
	public String         getBkg_no_split  	(){	return bkg_no_split  	;	}
	public String         getVsl_pre_pst_cd	(){	return vsl_pre_pst_cd	;	}
	public String         getVsl_seq       	(){	return vsl_seq       	;	}
	public String         getVsl_cd        	(){	return vsl_cd        	;	}
	public String         getSkd_voy_no    	(){	return skd_voy_no    	;	}
	public String         getSkd_dir_cd    	(){	return skd_dir_cd    	;	}
	public String         getSlan_cd       	(){	return slan_cd       	;	}
	public String         getVsl_lodg_dt   	(){	return vsl_lodg_dt   	;	}
	public String         getVsl_pol_cd    	(){	return vsl_pol_cd    	;	}
	public String         getVsl_pod_cd    	(){	return vsl_pod_cd    	;	}
	public String         getCntr_lodg_flg 	(){	return cntr_lodg_flg 	;	}
	public String         getNis_evnt_dt   	(){	return nis_evnt_dt   	;	}
	public String         getOop_cd        	(){	return oop_cd        	;	}
	public String         getTrns_mod_cd   	(){	return trns_mod_cd   	;	}
	public String 		  getFdr_cnn_tml_cd	(){	return fdr_cnn_tml_cd	;	}
	public String 		  getPol_zone_cd	(){	return pol_zone_cd		;	}
	public String         getEai_evnt_dt   (){	return eai_evnt_dt   	;	}

	// setter method is proceeding ..
	public void setIbflag        	( String         ibflag         ){	this.ibflag         = ibflag        	;	}
	public void setPage_rows     	( String         page_rows      ){	this.page_rows      = page_rows     	;	}
	public void setBkg_no        	( String         bkg_no         ){	this.bkg_no         = bkg_no        	;	}
	public void setBkg_no_split  	( String         bkg_no_split   ){	this.bkg_no_split   = bkg_no_split  	;	}
	public void setVsl_pre_pst_cd	( String         vsl_pre_pst_cd ){	this.vsl_pre_pst_cd = vsl_pre_pst_cd	;	}
	public void setVsl_seq       	( String         vsl_seq        ){	this.vsl_seq        = vsl_seq       	;	}
	public void setVsl_cd        	( String         vsl_cd         ){	this.vsl_cd         = vsl_cd        	;	}
	public void setSkd_voy_no    	( String         skd_voy_no     ){	this.skd_voy_no     = skd_voy_no    	;	}
	public void setSkd_dir_cd    	( String         skd_dir_cd     ){	this.skd_dir_cd     = skd_dir_cd    	;	}
	public void setSlan_cd       	( String         slan_cd        ){	this.slan_cd        = slan_cd       	;	}
	public void setVsl_lodg_dt   	( String         vsl_lodg_dt    ){	this.vsl_lodg_dt    = vsl_lodg_dt   	;	}
	public void setVsl_pol_cd    	( String         vsl_pol_cd     ){	this.vsl_pol_cd     = vsl_pol_cd    	;	}
	public void setVsl_pod_cd    	( String         vsl_pod_cd     ){	this.vsl_pod_cd     = vsl_pod_cd    	;	}
	public void setCntr_lodg_flg 	( String         cntr_lodg_flg  ){	this.cntr_lodg_flg  = cntr_lodg_flg 	;	}
	public void setNis_evnt_dt   	( String         nis_evnt_dt    ){	this.nis_evnt_dt    = nis_evnt_dt   	;	}
	public void setOop_cd        	( String         oop_cd         ){	this.oop_cd         = oop_cd        	;	}
	public void setTrns_mod_cd   	( String         trns_mod_cd    ){	this.trns_mod_cd    = trns_mod_cd   	;	}
	public void setFdr_cnn_tml_cd	( String 		 fdr_cnn_tml_cd ){	this.fdr_cnn_tml_cd = fdr_cnn_tml_cd	;	}
	public void setPol_zone_cd		( String 		 pol_zone_cd 	){	this.pol_zone_cd 	= pol_zone_cd		;	}
	public void setEai_evnt_dt   	( String         eai_evnt_dt    ){	this.eai_evnt_dt    = eai_evnt_dt   	;	}

	public static BKG_BKG_VVD fromRequest(HttpServletRequest request) {
		BKG_BKG_VVD model = new BKG_BKG_VVD();
		try {
			model.setIbflag        	(JSPUtil.getParameter(request, "ibflag        		".trim(), ""));
			model.setPage_rows     	(JSPUtil.getParameter(request, "page_rows     		".trim(), ""));
			model.setBkg_no        	(JSPUtil.getParameter(request, "bkg_no        		".trim(), ""));
			model.setBkg_no_split  	(JSPUtil.getParameter(request, "bkg_no_split  		".trim(), ""));
			model.setVsl_pre_pst_cd	(JSPUtil.getParameter(request, "vsl_pre_pst_cd		".trim(), ""));
			model.setVsl_seq       	(JSPUtil.getParameter(request, "vsl_seq       		".trim(), ""));
			model.setVsl_cd        	(JSPUtil.getParameter(request, "vsl_cd        		".trim(), ""));
			model.setSkd_voy_no    	(JSPUtil.getParameter(request, "skd_voy_no    		".trim(), ""));
			model.setSkd_dir_cd    	(JSPUtil.getParameter(request, "skd_dir_cd    		".trim(), ""));
			model.setSlan_cd       	(JSPUtil.getParameter(request, "slan_cd       		".trim(), ""));
			model.setVsl_lodg_dt   	(JSPUtil.getParameter(request, "vsl_lodg_dt   		".trim(), ""));
			model.setVsl_pol_cd    	(JSPUtil.getParameter(request, "vsl_pol_cd    		".trim(), ""));
			model.setVsl_pod_cd    	(JSPUtil.getParameter(request, "vsl_pod_cd    		".trim(), ""));
			model.setCntr_lodg_flg 	(JSPUtil.getParameter(request, "cntr_lodg_flg 		".trim(), ""));
			model.setNis_evnt_dt   	(JSPUtil.getParameter(request, "nis_evnt_dt   		".trim(), ""));
			model.setOop_cd        	(JSPUtil.getParameter(request, "oop_cd        		".trim(), ""));
			model.setTrns_mod_cd   	(JSPUtil.getParameter(request, "trns_mod_cd   		".trim(), ""));
			model.setFdr_cnn_tml_cd	(JSPUtil.getParameter(request, "fdr_cnn_tml_cd 		".trim(), ""));
			model.setPol_zone_cd	(JSPUtil.getParameter(request, "pol_zone_cd 		".trim(), ""));
			model.setEai_evnt_dt   	(JSPUtil.getParameter(request, "eai_evnt_dt   		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		BKG_BKG_VVD model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag         =  (JSPUtil.getParameter(request, "ibflag        		".trim(), length));
			String[] page_rows      =  (JSPUtil.getParameter(request, "page_rows     		".trim(), length));
			String[] bkg_no         =  (JSPUtil.getParameter(request, "bkg_no        		".trim(), length));
			String[] bkg_no_split   =  (JSPUtil.getParameter(request, "bkg_no_split  		".trim(), length));
			String[] vsl_pre_pst_cd =  (JSPUtil.getParameter(request, "vsl_pre_pst_cd		".trim(), length));
			String[] vsl_seq        =  (JSPUtil.getParameter(request, "vsl_seq       		".trim(), length));
			String[] vsl_cd         =  (JSPUtil.getParameter(request, "vsl_cd        		".trim(), length));
			String[] skd_voy_no     =  (JSPUtil.getParameter(request, "skd_voy_no    		".trim(), length));
			String[] skd_dir_cd     =  (JSPUtil.getParameter(request, "skd_dir_cd    		".trim(), length));
			String[] slan_cd        =  (JSPUtil.getParameter(request, "slan_cd       		".trim(), length));
			String[] vsl_lodg_dt    =  (JSPUtil.getParameter(request, "vsl_lodg_dt   		".trim(), length));
			String[] vsl_pol_cd     =  (JSPUtil.getParameter(request, "vsl_pol_cd    		".trim(), length));
			String[] vsl_pod_cd     =  (JSPUtil.getParameter(request, "vsl_pod_cd    		".trim(), length));
			String[] cntr_lodg_flg  =  (JSPUtil.getParameter(request, "cntr_lodg_flg 		".trim(), length));
			String[] nis_evnt_dt    =  (JSPUtil.getParameter(request, "nis_evnt_dt   		".trim(), length));
			String[] oop_cd         =  (JSPUtil.getParameter(request, "oop_cd        		".trim(), length));
			String[] trns_mod_cd    =  (JSPUtil.getParameter(request, "trns_mod_cd   		".trim(), length));
			String[] fdr_cnn_tml_cd =  (JSPUtil.getParameter(request, "fdr_cnn_tml_cd   	".trim(), length));
			String[] pol_zone_cd 	=  (JSPUtil.getParameter(request, "pol_zone_cd   		".trim(), length));
			String[] eai_evnt_dt    =  (JSPUtil.getParameter(request, "eai_evnt_dt   		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new BKG_BKG_VVD();
				model.setIbflag        		  (ibflag        	[i]);
				model.setPage_rows     		  (page_rows     	[i]);
				model.setBkg_no        		  (bkg_no        	[i]);
				model.setBkg_no_split  		  (bkg_no_split  	[i]);
				model.setVsl_pre_pst_cd		  (vsl_pre_pst_cd	[i]);
				model.setVsl_seq       		  (vsl_seq       	[i]);
				model.setVsl_cd        		  (vsl_cd        	[i]);
				model.setSkd_voy_no    		  (skd_voy_no    	[i]);
				model.setSkd_dir_cd    		  (skd_dir_cd    	[i]);
				model.setSlan_cd       		  (slan_cd       	[i]);
				model.setVsl_lodg_dt   		  (vsl_lodg_dt   	[i]);
				model.setVsl_pol_cd    		  (vsl_pol_cd    	[i]);
				model.setVsl_pod_cd    		  (vsl_pod_cd    	[i]);
				model.setCntr_lodg_flg 		  (cntr_lodg_flg 	[i]);
				model.setNis_evnt_dt   		  (nis_evnt_dt   	[i]);
				model.setOop_cd        		  (oop_cd        	[i]);
				model.setTrns_mod_cd   		  (trns_mod_cd   	[i]);
				model.setFdr_cnn_tml_cd		  (fdr_cnn_tml_cd	[i]);				
				model.setPol_zone_cd		  (pol_zone_cd		[i]);				
				model.setEai_evnt_dt   		  (eai_evnt_dt   	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		BKG_BKG_VVD model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag         =  (JSPUtil.getParameter(request, prefix + "ibflag        		".trim(), length));
			String[] page_rows      =  (JSPUtil.getParameter(request, prefix + "page_rows     		".trim(), length));
			String[] bkg_no         =  (JSPUtil.getParameter(request, prefix + "bkg_no        		".trim(), length));
			String[] bkg_no_split   =  (JSPUtil.getParameter(request, prefix + "bkg_no_split  		".trim(), length));
			String[] vsl_pre_pst_cd =  (JSPUtil.getParameter(request, prefix + "vsl_pre_pst_cd		".trim(), length));
			String[] vsl_seq        =  (JSPUtil.getParameter(request, prefix + "vsl_seq       		".trim(), length));
			String[] vsl_cd         =  (JSPUtil.getParameter(request, prefix + "vsl_cd        		".trim(), length));
			String[] skd_voy_no     =  (JSPUtil.getParameter(request, prefix + "skd_voy_no    		".trim(), length));
			String[] skd_dir_cd     =  (JSPUtil.getParameter(request, prefix + "skd_dir_cd    		".trim(), length));
			String[] slan_cd        =  (JSPUtil.getParameter(request, prefix + "slan_cd       		".trim(), length));
			String[] vsl_lodg_dt    =  (JSPUtil.getParameter(request, prefix + "vsl_lodg_dt   		".trim(), length));
			String[] vsl_pol_cd     =  (JSPUtil.getParameter(request, prefix + "vsl_pol_cd    		".trim(), length));
			String[] vsl_pod_cd     =  (JSPUtil.getParameter(request, prefix + "vsl_pod_cd    		".trim(), length));
			String[] cntr_lodg_flg  =  (JSPUtil.getParameter(request, prefix + "cntr_lodg_flg 		".trim(), length));
			String[] nis_evnt_dt    =  (JSPUtil.getParameter(request, prefix + "nis_evnt_dt   		".trim(), length));
			String[] oop_cd         =  (JSPUtil.getParameter(request, prefix + "oop_cd        		".trim(), length));
			String[] trns_mod_cd    =  (JSPUtil.getParameter(request, prefix + "trns_mod_cd   		".trim(), length));
			String[] fdr_cnn_tml_cd =  (JSPUtil.getParameter(request, prefix + "fdr_cnn_tml_cd   	".trim(), length));			
			String[] pol_zone_cd 	=  (JSPUtil.getParameter(request, prefix + "pol_zone_cd   		".trim(), length));
			String[] eai_evnt_dt    =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt   		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new BKG_BKG_VVD();
				model.setIbflag        		  ( ibflag        	[i]);
				model.setPage_rows     		  ( page_rows     	[i]);
				model.setBkg_no        		  ( bkg_no        	[i]);
				model.setBkg_no_split  		  ( bkg_no_split  	[i]);
				model.setVsl_pre_pst_cd		  ( vsl_pre_pst_cd	[i]);
				model.setVsl_seq       		  ( vsl_seq       	[i]);
				model.setVsl_cd        		  ( vsl_cd        	[i]);
				model.setSkd_voy_no    		  ( skd_voy_no    	[i]);
				model.setSkd_dir_cd    		  ( skd_dir_cd    	[i]);
				model.setSlan_cd       		  ( slan_cd       	[i]);
				model.setVsl_lodg_dt   		  ( vsl_lodg_dt   	[i]);
				model.setVsl_pol_cd    		  ( vsl_pol_cd    	[i]);
				model.setVsl_pod_cd    		  ( vsl_pod_cd    	[i]);
				model.setCntr_lodg_flg 		  ( cntr_lodg_flg 	[i]);
				model.setNis_evnt_dt   		  ( nis_evnt_dt   	[i]);
				model.setOop_cd        		  ( oop_cd        	[i]);
				model.setTrns_mod_cd   		  ( trns_mod_cd   	[i]);
				model.setFdr_cnn_tml_cd		  ( fdr_cnn_tml_cd 	[i]);				
				model.setPol_zone_cd		  ( pol_zone_cd 	[i]);				
				model.setEai_evnt_dt   		  ( eai_evnt_dt   	[i]);
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
