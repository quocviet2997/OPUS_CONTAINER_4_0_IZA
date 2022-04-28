/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : LEA_REV_VVD_CNG.java
*@FileTitle : SD Analysis Report
*Open Issues :
*Change history :
*@LastModifyDate : 2007-05-25
*@LastModifier : Jung-Jae Kim
*@LastVersion : 1.0
* 2007-05-25 Jung-Jae Kim
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
 * @author Jung-Jae Kim
 * @since J2EE 1.4
 */
public final class LEA_REV_VVD_CNG implements java.io.Serializable {

	private String       ibflag           = "";
	private String       page_rows        = "";
	private String		 exe_yrmon	  	  = "";
	private String		 csr_no			  = "";
	private String       bkg_no           = "";
	private String       bkg_no_split     = "";
	private String		 inv_sys_id	  	  = "";
	private String		 old_vsl_cd	  	  = "";
	private String       old_skd_voy_no   = "";
	private String       old_skd_dir_cd   = "";
	private String       old_rev_dir_cd   = "";
	private String       new_vsl_cd       = "";
	private String       new_skd_voy_no   = "";
	private String       new_skd_dir_cd   = "";
	private String       new_rev_dir_cd   = "";
	private String       old_rev_yrmon    = "";
	private String       new_rev_yrmon    = "";
	private String       modi_csr_no	  = "";
	private String       modi_gl_dt       = "";
	private String       modi_csr_cre_flg = "";
	private String		 erp_if_flg	  	  = "";
	private String		 inv_sys_rmk	  = "";
	private String		 cre_usr_id	  	  = "";
	private String		 cre_dt		  	  = "";
	private String		 upd_usr_id	  	  = "";
	private String		 upd_dt		  	  = "";
	private String		 lea_if_flg	  	  = "";

	public LEA_REV_VVD_CNG(){}

	public LEA_REV_VVD_CNG(
			String           ibflag          ,
			String           page_rows       ,
			String		 	 exe_yrmon	 	 ,
			String			 csr_no			 ,
			String           bkg_no          ,
			String           bkg_no_split    ,
			String		 	 inv_sys_id	 	 ,
			String		 	 old_vsl_cd	 	 ,
			String           old_skd_voy_no  ,
			String           old_skd_dir_cd  ,
			String           old_rev_dir_cd  ,
			String           new_vsl_cd      ,
			String           new_skd_voy_no  ,
			String           new_skd_dir_cd  ,
			String           new_rev_dir_cd  ,
			String           old_rev_yrmon   ,
			String           new_rev_yrmon   ,
			String           modi_csr_no	 ,
			String           modi_gl_dt      ,
			String           modi_csr_cre_flg,
			String		 	 erp_if_flg	 	 ,
			String		 	 inv_sys_rmk	 ,
			String		 	 cre_usr_id	 	 ,
			String		 	 cre_dt		 	 ,
			String		 	 upd_usr_id	 	 ,
			String		 	 upd_dt		 	 ,
			String			 lea_if_flg	  	 ){
		this.ibflag             = ibflag               ;     
		this.page_rows          = page_rows            ;  
		this.exe_yrmon	        = exe_yrmon	           ;
		this.csr_no				= csr_no			   ;
		this.bkg_no             = bkg_no               ;  
		this.bkg_no_split       = bkg_no_split         ;  
		this.inv_sys_id	        = inv_sys_id	       ;
		this.old_vsl_cd	        = old_vsl_cd	       ;
		this.old_skd_voy_no     = old_skd_voy_no       ;  
		this.old_skd_dir_cd     = old_skd_dir_cd       ;  
		this.old_rev_dir_cd     = old_rev_dir_cd       ;  
		this.new_vsl_cd         = new_vsl_cd           ;  
		this.new_skd_voy_no     = new_skd_voy_no       ;  
		this.new_skd_dir_cd     = new_skd_dir_cd       ;  
		this.new_rev_dir_cd     = new_rev_dir_cd       ;  
		this.old_rev_yrmon      = old_rev_yrmon        ;  
		this.new_rev_yrmon      = new_rev_yrmon        ;  
		this.modi_csr_no		= modi_csr_no	       ; 
		this.modi_gl_dt         = modi_gl_dt           ;  
        this.modi_csr_cre_flg   = modi_csr_cre_flg     ;  
        this.erp_if_flg	        = erp_if_flg	       ;
        this.inv_sys_rmk		= inv_sys_rmk	       ; 
        this.cre_usr_id	        = cre_usr_id	       ;
        this.cre_dt				= cre_dt	           ;         
        this.upd_usr_id	        = upd_usr_id	       ;
        this.upd_dt				= upd_dt	       	   ;
        this.lea_if_flg			= lea_if_flg		   ;       
	}                                               
                                                        
	// getter method is proceeding ..               
	public String           getIbflag           (){	return ibflag            	;	}
	public String           getPage_rows        (){	return page_rows         	;	}
	public String           getExe_yrmon	 	(){	return exe_yrmon	  		;	}
	public String 			getCsr_no			(){	return csr_no				;	}
	public String           getBkg_no           (){	return bkg_no            	;	}
	public String           getBkg_no_split     (){	return bkg_no_split      	;	}
	public String           getInv_sys_id	 	(){	return inv_sys_id	  		;	}
	public String           getOld_vsl_cd	 	(){	return old_vsl_cd	  		;	}
	public String           getOld_skd_voy_no   (){	return old_skd_voy_no    	;	}
	public String           getOld_skd_dir_cd   (){	return old_skd_dir_cd    	;	}
	public String           getOld_rev_dir_cd   (){	return old_rev_dir_cd    	;	}
	public String           getNew_vsl_cd       (){	return new_vsl_cd        	;	}
	public String           getNew_skd_voy_no   (){	return new_skd_voy_no    	;	}
	public String           getNew_skd_dir_cd   (){	return new_skd_dir_cd    	;	}
	public String           getNew_rev_dir_cd   (){	return new_rev_dir_cd    	;	}
	public String           getOld_rev_yrmon    (){	return old_rev_yrmon     	;	}
	public String           getNew_rev_yrmon    (){	return new_rev_yrmon     	;	}
	public String 			getModi_csr_no	    (){ return modi_csr_no	  		;	}
	public String 			getModi_gl_dt       (){ return modi_gl_dt           ;	}
	public String 			getModi_csr_cre_flg (){ return modi_csr_cre_flg     ;	}
	public String 			getErp_if_flg	    (){ return erp_if_flg	        ;	}
	public String 			getInv_sys_rmk	    (){ return inv_sys_rmk	        ;	}
	public String 			getCre_usr_id	    (){ return cre_usr_id	        ;	}
	public String 			getCre_dt	    	(){ return cre_dt	            ;	}
	public String 			getUpd_usr_id	    (){ return upd_usr_id	        ;	}
	public String 			getUpd_dt	    	(){ return upd_dt	            ;	}
	public String 			getLea_if_flg    	(){ return lea_if_flg           ;	}

	// setter method is proceeding ..
	public void setIbflag           ( String           ibflag           ){	this.ibflag            = ibflag           	;	}
	public void setPage_rows        ( String           page_rows        ){	this.page_rows         = page_rows        	;	}
	public void setExe_yrmon		( String           exe_yrmon	    ){	this.exe_yrmon	       = exe_yrmon	 		;	}
	public void setCsr_no			( String		   csr_no			){	this.csr_no			   = csr_no				;	}
	public void setBkg_no           ( String           bkg_no           ){	this.bkg_no            = bkg_no           	;	}
	public void setBkg_no_split     ( String           bkg_no_split     ){	this.bkg_no_split      = bkg_no_split     	;	}
	public void setInv_sys_id		( String           inv_sys_id	    ){	this.inv_sys_id	       = inv_sys_id	 		;	}
	public void setOld_vsl_cd		( String           old_vsl_cd	    ){	this.old_vsl_cd	       = old_vsl_cd	 		;	}
	public void setOld_skd_voy_no   ( String           old_skd_voy_no   ){	this.old_skd_voy_no    = old_skd_voy_no   	;	}
	public void setOld_skd_dir_cd   ( String           old_skd_dir_cd   ){	this.old_skd_dir_cd    = old_skd_dir_cd   	;	}
	public void setOld_rev_dir_cd   ( String           old_rev_dir_cd   ){	this.old_rev_dir_cd    = old_rev_dir_cd   	;	}
	public void setNew_vsl_cd       ( String           new_vsl_cd       ){	this.new_vsl_cd        = new_vsl_cd       	;	}
	public void setNew_skd_voy_no   ( String           new_skd_voy_no   ){	this.new_skd_voy_no    = new_skd_voy_no   	;	}
	public void setNew_skd_dir_cd   ( String           new_skd_dir_cd   ){	this.new_skd_dir_cd    = new_skd_dir_cd   	;	}
	public void setNew_rev_dir_cd   ( String           new_rev_dir_cd   ){	this.new_rev_dir_cd    = new_rev_dir_cd   	;	}
	public void setOld_rev_yrmon    ( String           old_rev_yrmon    ){	this.old_rev_yrmon     = old_rev_yrmon    	;	}
	public void setNew_rev_yrmon    ( String           new_rev_yrmon    ){	this.new_rev_yrmon     = new_rev_yrmon    	;	}
	public void setModi_csr_no		( String           modi_csr_no	    ){  this.modi_csr_no       = modi_csr_no	 	;	}
	public void setModi_gl_dt       ( String           modi_gl_dt       ){  this.modi_gl_dt        = modi_gl_dt         ;	}
	public void setModi_csr_cre_flg ( String           modi_csr_cre_flg ){  this.modi_csr_cre_flg  = modi_csr_cre_flg   ;	}
	public void setErp_if_flg		( String           erp_if_flg	    ){  this.erp_if_flg	       = erp_if_flg	        ;	}
	public void setInv_sys_rmk		( String           inv_sys_rmk	    ){  this.inv_sys_rmk       = inv_sys_rmk	    ;	}
	public void setCre_usr_id		( String           cre_usr_id	    ){  this.cre_usr_id	       = cre_usr_id	        ;	}
	public void setCre_dt	        ( String           cre_dt	    	){  this.cre_dt	       	   = cre_dt	            ;	}
	public void setUpd_usr_id		( String           upd_usr_id	    ){  this.upd_usr_id	       = upd_usr_id	        ;	}
	public void setUpd_dt	        ( String           upd_dt	    	){  this.upd_dt	           = upd_dt	            ;	}
	public void setLea_if_flg       ( String           lea_if_flg    	){  this.lea_if_flg        = lea_if_flg         ;	}

	public static LEA_REV_VVD_CNG fromRequest(HttpServletRequest request) {
		LEA_REV_VVD_CNG model = new LEA_REV_VVD_CNG();
		try {
			model.setIbflag               	(JSPUtil.getParameter(request, "ibflag           		".trim(), ""));
			model.setPage_rows            	(JSPUtil.getParameter(request, "page_rows        		".trim(), ""));
			model.setExe_yrmon	        	(JSPUtil.getParameter(request, "exe_yrmon	 			".trim(), ""));
			model.setCsr_no					(JSPUtil.getParameter(request, "csr_no					".trim(), ""));
			model.setBkg_no               	(JSPUtil.getParameter(request, "bkg_no           		".trim(), ""));
			model.setBkg_no_split         	(JSPUtil.getParameter(request, "bkg_no_split     		".trim(), ""));
			model.setInv_sys_id	        	(JSPUtil.getParameter(request, "inv_sys_id	 			".trim(), ""));
			model.setOld_vsl_cd	        	(JSPUtil.getParameter(request, "old_vsl_cd	 			".trim(), ""));
			model.setOld_skd_voy_no       	(JSPUtil.getParameter(request, "old_skd_voy_no   		".trim(), ""));
			model.setOld_skd_dir_cd       	(JSPUtil.getParameter(request, "old_skd_dir_cd   		".trim(), ""));
			model.setOld_rev_dir_cd       	(JSPUtil.getParameter(request, "old_rev_dir_cd   		".trim(), ""));
			model.setNew_vsl_cd           	(JSPUtil.getParameter(request, "new_vsl_cd       		".trim(), ""));
			model.setNew_skd_voy_no       	(JSPUtil.getParameter(request, "new_skd_voy_no   		".trim(), ""));
			model.setNew_skd_dir_cd       	(JSPUtil.getParameter(request, "new_skd_dir_cd   		".trim(), ""));
			model.setNew_rev_dir_cd       	(JSPUtil.getParameter(request, "new_rev_dir_cd   		".trim(), ""));
			model.setOld_rev_yrmon        	(JSPUtil.getParameter(request, "old_rev_yrmon    		".trim(), ""));
			model.setNew_rev_yrmon        	(JSPUtil.getParameter(request, "new_rev_yrmon    		".trim(), ""));
			model.setModi_csr_no	        (JSPUtil.getParameter(request, "modi_csr_no	 			".trim(), ""));
			model.setModi_gl_dt             (JSPUtil.getParameter(request, "modi_gl_dt              ".trim(), ""));
			model.setModi_csr_cre_flg       (JSPUtil.getParameter(request, "modi_csr_cre_flg        ".trim(), ""));
			model.setErp_if_flg	        	(JSPUtil.getParameter(request, "erp_if_flg	            ".trim(), ""));
			model.setInv_sys_rmk	        (JSPUtil.getParameter(request, "inv_sys_rmk	            ".trim(), ""));
			model.setCre_usr_id	        	(JSPUtil.getParameter(request, "cre_usr_id	            ".trim(), ""));
			model.setCre_dt	                (JSPUtil.getParameter(request, "cre_dt	                ".trim(), ""));
			model.setUpd_usr_id	        	(JSPUtil.getParameter(request, "upd_usr_id	            ".trim(), ""));
			model.setUpd_dt	                (JSPUtil.getParameter(request, "upd_dt	                ".trim(), ""));	
			model.setLea_if_flg             (JSPUtil.getParameter(request, "lea_if_flg              ".trim(), ""));	
			
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		LEA_REV_VVD_CNG model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag            	=  (JSPUtil.getParameter(request, "ibflag          		".trim(), length));
			String[] page_rows         	=  (JSPUtil.getParameter(request, "page_rows       		".trim(), length));
			String[] exe_yrmon	   		=  (JSPUtil.getParameter(request, "exe_yrmon			".trim(), length));
			String[] csr_no				=  (JSPUtil.getParameter(request, "csr_no				".trim(), length));
			String[] bkg_no           	=  (JSPUtil.getParameter(request, "bkg_no          		".trim(), length));
			String[] bkg_no_split      	=  (JSPUtil.getParameter(request, "bkg_no_split    		".trim(), length));
			String[] inv_sys_id	   		=  (JSPUtil.getParameter(request, "inv_sys_id			".trim(), length));
			String[] old_vsl_cd	   		=  (JSPUtil.getParameter(request, "old_vsl_cd			".trim(), length));
			String[] old_skd_voy_no    	=  (JSPUtil.getParameter(request, "old_skd_voy_no  		".trim(), length));
			String[] old_skd_dir_cd   	=  (JSPUtil.getParameter(request, "old_skd_dir_cd  		".trim(), length));
			String[] old_rev_dir_cd    	=  (JSPUtil.getParameter(request, "old_rev_dir_cd  		".trim(), length));
			String[] new_vsl_cd        	=  (JSPUtil.getParameter(request, "new_vsl_cd      		".trim(), length));
			String[] new_skd_voy_no    	=  (JSPUtil.getParameter(request, "new_skd_voy_no  		".trim(), length));
			String[] new_skd_dir_cd    	=  (JSPUtil.getParameter(request, "new_skd_dir_cd  		".trim(), length));
			String[] new_rev_dir_cd    	=  (JSPUtil.getParameter(request, "new_rev_dir_cd  		".trim(), length));
			String[] old_rev_yrmon     	=  (JSPUtil.getParameter(request, "old_rev_yrmon   		".trim(), length));
			String[] new_rev_yrmon     	=  (JSPUtil.getParameter(request, "new_rev_yrmon   		".trim(), length));
			String[] modi_csr_no	   	=  (JSPUtil.getParameter(request, "modi_csr_no	 		".trim(), length));
			String[] modi_gl_dt        	=  (JSPUtil.getParameter(request, "modi_gl_dt      		".trim(), length));
			String[] modi_csr_cre_flg  	=  (JSPUtil.getParameter(request, "modi_csr_cre_flg     ".trim(), length));
			String[] erp_if_flg	   		=  (JSPUtil.getParameter(request, "erp_if_flg	        ".trim(), length));
			String[] inv_sys_rmk	   	=  (JSPUtil.getParameter(request, "inv_sys_rmk	        ".trim(), length));
			String[] cre_usr_id	   		=  (JSPUtil.getParameter(request, "cre_usr_id	        ".trim(), length));
			String[] cre_dt	           	=  (JSPUtil.getParameter(request, "cre_dt	            ".trim(), length));
			String[] upd_usr_id	   		=  (JSPUtil.getParameter(request, "upd_usr_id	        ".trim(), length));
			String[] upd_dt	           	=  (JSPUtil.getParameter(request, "upd_dt	            ".trim(), length)); 
			String[] lea_if_flg        	=  (JSPUtil.getParameter(request, "lea_if_flg           ".trim(), length));  
			                         
			for (int i = 0; i < length; i++) {
				model = new LEA_REV_VVD_CNG();
				model.setIbflag                		  	(ibflag          	[i]);
				model.setPage_rows             		  	(page_rows       	[i]);
				model.setExe_yrmon	         	  	 	(exe_yrmon			[i]);
				model.setCsr_no							(csr_no				[i]);
				model.setBkg_no                		  	(bkg_no          	[i]);
				model.setBkg_no_split          		  	(bkg_no_split    	[i]);
				model.setInv_sys_id	         	  		(inv_sys_id	        [i]);
				model.setOld_vsl_cd	         	  		(old_vsl_cd	        [i]);
				model.setOld_skd_voy_no        		  	(old_skd_voy_no  	[i]);
				model.setOld_skd_dir_cd        		  	(old_skd_dir_cd  	[i]);
				model.setOld_rev_dir_cd        		  	(old_rev_dir_cd  	[i]);
				model.setNew_vsl_cd            		  	(new_vsl_cd      	[i]);
				model.setNew_skd_voy_no        		  	(new_skd_voy_no  	[i]);
				model.setNew_skd_dir_cd        		  	(new_skd_dir_cd  	[i]);
				model.setNew_rev_dir_cd        		  	(new_rev_dir_cd  	[i]);
				model.setOld_rev_yrmon         		  	(old_rev_yrmon   	[i]);
				model.setNew_rev_yrmon         		  	(new_rev_yrmon   	[i]);
				model.setModi_csr_no	         	  	(modi_csr_no	    [i]);
				model.setModi_gl_dt                     (modi_gl_dt      	[i]);
				model.setModi_csr_cre_flg               (modi_csr_cre_flg   [i]);   
				model.setErp_if_flg	                  	(erp_if_flg	        [i]);
				model.setInv_sys_rmk	                (inv_sys_rmk	    [i]);
				model.setCre_usr_id	                  	(cre_usr_id	        [i]);
				model.setCre_dt	                        (cre_dt	        	[i]);        
				model.setUpd_usr_id	                  	(upd_usr_id	        [i]);
				model.setUpd_dt	                        (upd_dt	        	[i]);
				model.setLea_if_flg                     (lea_if_flg      	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		LEA_REV_VVD_CNG model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {			
			String[] ibflag            	=  (JSPUtil.getParameter(request, prefix + "ibflag          ".trim(), length));
			String[] page_rows         	=  (JSPUtil.getParameter(request, prefix + "page_rows       ".trim(), length));
			String[] exe_yrmon	  	  	=  (JSPUtil.getParameter(request, prefix + "exe_yrmon		".trim(), length));
			String[] csr_no				=  (JSPUtil.getParameter(request, prefix + "csr_no			".trim(), length));
			String[] bkg_no            	=  (JSPUtil.getParameter(request, prefix + "bkg_no          ".trim(), length));
			String[] bkg_no_split      	=  (JSPUtil.getParameter(request, prefix + "bkg_no_split    ".trim(), length));
			String[] inv_sys_id	   		=  (JSPUtil.getParameter(request, prefix + "inv_sys_id		".trim(), length));
			String[] old_vsl_cd	   		=  (JSPUtil.getParameter(request, prefix + "old_vsl_cd		".trim(), length));
			String[] old_skd_voy_no    	=  (JSPUtil.getParameter(request, prefix + "old_skd_voy_no  ".trim(), length));
			String[] old_skd_dir_cd    	=  (JSPUtil.getParameter(request, prefix + "old_skd_dir_cd  ".trim(), length));
			String[] old_rev_dir_cd    	=  (JSPUtil.getParameter(request, prefix + "old_rev_dir_cd  ".trim(), length));
			String[] new_vsl_cd        	=  (JSPUtil.getParameter(request, prefix + "new_vsl_cd      ".trim(), length));
			String[] new_skd_voy_no    	=  (JSPUtil.getParameter(request, prefix + "new_skd_voy_no  ".trim(), length));
			String[] new_skd_dir_cd    	=  (JSPUtil.getParameter(request, prefix + "new_skd_dir_cd  ".trim(), length));
			String[] new_rev_dir_cd    	=  (JSPUtil.getParameter(request, prefix + "new_rev_dir_cd  ".trim(), length));
			String[] old_rev_yrmon     	=  (JSPUtil.getParameter(request, prefix + "old_rev_yrmon   ".trim(), length));
			String[] new_rev_yrmon     	=  (JSPUtil.getParameter(request, prefix + "new_rev_yrmon   ".trim(), length));
			String[] modi_csr_no	   	=  (JSPUtil.getParameter(request, prefix + "modi_csr_no	 	".trim(), length));
			String[] modi_gl_dt        	=  (JSPUtil.getParameter(request, prefix + "modi_gl_dt      ".trim(), length));
			String[] modi_csr_cre_flg  	=  (JSPUtil.getParameter(request, prefix + "modi_csr_cre_flg".trim(), length));
			String[] erp_if_flg	   		=  (JSPUtil.getParameter(request, prefix + "erp_if_flg	    ".trim(), length));
			String[] inv_sys_rmk	   	=  (JSPUtil.getParameter(request, prefix + "inv_sys_rmk	    ".trim(), length));
			String[] cre_usr_id	   		=  (JSPUtil.getParameter(request, prefix + "cre_usr_id	    ".trim(), length));
			String[] cre_dt	           	=  (JSPUtil.getParameter(request, prefix + "cre_dt	        ".trim(), length));
			String[] upd_usr_id	   		=  (JSPUtil.getParameter(request, prefix + "upd_usr_id	    ".trim(), length));
			String[] upd_dt	           	=  (JSPUtil.getParameter(request, prefix + "upd_dt	        ".trim(), length)); 
			String[] lea_if_flg        	=  (JSPUtil.getParameter(request, prefix + "lea_if_flg      ".trim(), length)); 
			
			
			for (int i = 0; i < length; i++) {
				model = new LEA_REV_VVD_CNG();
				model.setIbflag                	(ibflag          	[i]);
				model.setPage_rows             	(page_rows       	[i]);
				model.setCsr_no					(csr_no				[i]);
				model.setExe_yrmon	         	(exe_yrmon			[i]);
				model.setBkg_no                	(bkg_no          	[i]);
				model.setBkg_no_split          	(bkg_no_split    	[i]);
				model.setInv_sys_id	         	(inv_sys_id	        [i]);
				model.setOld_vsl_cd	         	(old_vsl_cd	        [i]);
				model.setOld_skd_voy_no        	(old_skd_voy_no  	[i]);
				model.setOld_skd_dir_cd        	(old_skd_dir_cd  	[i]);
				model.setOld_rev_dir_cd        	(old_rev_dir_cd  	[i]);
				model.setNew_vsl_cd            	(new_vsl_cd      	[i]);
				model.setNew_skd_voy_no        	(new_skd_voy_no  	[i]);
				model.setNew_skd_dir_cd        	(new_skd_dir_cd  	[i]);
				model.setNew_rev_dir_cd        	(new_rev_dir_cd  	[i]);
				model.setOld_rev_yrmon         	(old_rev_yrmon   	[i]);
				model.setNew_rev_yrmon         	(new_rev_yrmon   	[i]);
				model.setModi_csr_no	        (modi_csr_no	    [i]);
				model.setModi_gl_dt             (modi_gl_dt      	[i]);
				model.setModi_csr_cre_flg       (modi_csr_cre_flg   [i]);   
				model.setErp_if_flg	            (erp_if_flg	        [i]);
				model.setInv_sys_rmk	        (inv_sys_rmk	    [i]);
				model.setCre_usr_id	            (cre_usr_id	        [i]);
				model.setCre_dt	                (cre_dt	        	[i]);        
				model.setUpd_usr_id	            (upd_usr_id	        [i]);
				model.setUpd_dt	                (upd_dt	        	[i]);  
				model.setLea_if_flg             (lea_if_flg      	[i]); 
				models.add(model);
			}
		} catch (Exception ex) {		}
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
