/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : MDM_VENDOR.java
*@FileTitle : 사용자 관리5
*Open Issues :
*Change history :
*@LastModifyDate : 2008-10-22
*@LastModifier : yujin
*@LastVersion : 1.0
* 2008-10-22 yujin
* 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.common.table;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;

import com.clt.framework.component.util.JSPUtil;

/**
 * Table Value Ojbect<br>
 * - 모든 업무에서 공통으로 사용하는 PDTO(Data Transfer Object including Parameters)<br>
 * - 관련 Event에서 작성, 서버실행요청시 PDTO의 역할을 수행하는 Value Object<br>
 * - Check Mailing Address 관리<br>
 * 
 * @author yujin
 * @since J2EE 1.4
 */ 
public class MdmChkmailAddr implements Serializable {

	private String	vndrseq			= "";
	private String	chk_de_addr1	= "";
	private String	chk_de_addr2    = "";
	private String	chk_de_addr3    = "";
	private String	chk_de_cty_nm   = "";
	private String	chk_de_ste_cd   = "";
	private String	chk_de_zip_cd   = "";
	private String	chk_de_cnt_cd   = "";
	private String	lu_delt_flg		= "";
	private String  creusrid		= "";
	private String  credt    		= "";
	private String  updusrid 		= "";
	private String  upddt    		= "";
	private String  eai_evnt_dt     = "";
	
	public MdmChkmailAddr(){}
	
	public MdmChkmailAddr(
			String				vndrseq		 ,
			String              chk_de_addr1 ,
			String              chk_de_addr2 ,
			String              chk_de_addr3 ,
			String              chk_de_cty_nm,
			String              chk_de_ste_cd,
			String              chk_de_zip_cd,
			String              chk_de_cnt_cd,
			String              lu_delt_flg,
			String              creusrid,
			String              credt,
			String              updusrid,
			String              upddt,
			String              eai_evnt_dt
			
	){
		this.vndrseq			= vndrseq ;
		this.chk_de_addr1		= chk_de_addr1 ;
		this.chk_de_addr2       = chk_de_addr2 ;
		this.chk_de_addr3       = chk_de_addr3 ;
		this.chk_de_cty_nm      = chk_de_cty_nm;
		this.chk_de_ste_cd		= chk_de_ste_cd;
		this.chk_de_zip_cd   	= chk_de_zip_cd;
		this.chk_de_cnt_cd      = chk_de_cnt_cd;
		this.lu_delt_flg        = lu_delt_flg  ;
		this.creusrid        	= creusrid  ;
		this.credt        		= credt  ;
		this.updusrid        	= updusrid  ;
		this.upddt        		= upddt  ;
		this.eai_evnt_dt        = eai_evnt_dt  ;
	}	

	// getter method is proceeding ..
	public String	getVndrSeq		(){	return vndrseq  	 ;}
	public String	getChk_de_addr1	(){	return chk_de_addr1  ;}
	public String   getChk_de_addr2	(){	return chk_de_addr2  ;}
	public String   getChk_de_addr3 (){	return chk_de_addr3  ;}
	public String   getChk_de_cty_nm(){	return chk_de_cty_nm ;}
	public String   getChk_de_ste_cd(){	return chk_de_ste_cd ;}
	public String   getChk_de_zip_cd(){	return chk_de_zip_cd ;}
	public String   getChk_de_cnt_cd(){	return chk_de_cnt_cd ;}
	public String   getLu_delt_flg  (){	return lu_delt_flg   ;}
	public String   getCreUsrId  	(){	return creusrid   	 ;}
	public String   getCreDt		(){	return credt   		 ;}
	public String   getUpdusrId  	(){	return updusrid   	 ;}
	public String   getUpdDt  		(){	return upddt   		 ;}
	public String   getEai_evnt_dt 	(){	return eai_evnt_dt   		 ;}

	// setter method is proceeding ..
	public void setVndrSeq	  	  ( String	vndrseq  	  ){ this.vndrseq  		= vndrseq 	   ; }
	public void setChk_de_addr1	  ( String	chk_de_addr1  ){ this.chk_de_addr1  = chk_de_addr1 ; }
	public void setChk_de_addr2	  ( String	chk_de_addr2  ){ this.chk_de_addr2  = chk_de_addr2 ; }
	public void setChk_de_addr3   ( String	chk_de_addr3  ){ this.chk_de_addr3  = chk_de_addr3 ; }
	public void setChk_de_cty_nm  ( String	chk_de_cty_nm ){ this.chk_de_cty_nm = chk_de_cty_nm; }
	public void setChk_de_ste_cd  ( String	chk_de_ste_cd ){ this.chk_de_ste_cd = chk_de_ste_cd; }
	public void setChk_de_zip_cd  ( String	chk_de_zip_cd ){ this.chk_de_zip_cd = chk_de_zip_cd; }
	public void setChk_de_cnt_cd  ( String	chk_de_cnt_cd ){ this.chk_de_cnt_cd = chk_de_cnt_cd; }
	public void setLu_delt_flg    ( String	lu_delt_flg   ){ this.lu_delt_flg   = lu_delt_flg  ; }
	public void setCreUsrId    	  ( String	creusrid   	  ){ this.creusrid   	= creusrid     ; }
	public void setCreDt    	  ( String	credt   	  ){ this.credt   		= credt  	   ; }
	public void setUpdusrId    	  ( String	updusrid   	  ){ this.updusrid   	= updusrid     ; }
	public void setUpdDt    	  ( String	upddt   	  ){ this.upddt   		= upddt  	   ; }
	public void setEai_evnt_dt    ( String  eai_evnt_dt   ){ this.eai_evnt_dt   = eai_evnt_dt  ; }
	
	public static MdmChkmailAddr fromRequest(HttpServletRequest request) {
		MdmChkmailAddr model = new MdmChkmailAddr();
		try {
			model.setVndrSeq		(JSPUtil.getParameter(request, "vndrseq   			".trim(), ""));
			model.setChk_de_addr1	(JSPUtil.getParameter(request, "chk_de_addr1   		".trim(), ""));
			model.setChk_de_addr2	(JSPUtil.getParameter(request, "chk_de_addr2   		".trim(), ""));
			model.setChk_de_addr3   (JSPUtil.getParameter(request, "chk_de_addr3   		".trim(), ""));
			model.setChk_de_cty_nm  (JSPUtil.getParameter(request, "chk_de_cty_nm  		".trim(), ""));
			model.setChk_de_ste_cd  (JSPUtil.getParameter(request, "chk_de_ste_cd  		".trim(), ""));
			model.setChk_de_zip_cd  (JSPUtil.getParameter(request, "chk_de_zip_cd  		".trim(), ""));
			model.setChk_de_cnt_cd  (JSPUtil.getParameter(request, "chk_de_cnt_cd  		".trim(), ""));
			model.setLu_delt_flg    (JSPUtil.getParameter(request, "lu_delt_flg    		".trim(), ""));
			model.setCreUsrId   	(JSPUtil.getParameter(request, "creusrid    		".trim(), ""));
			model.setCreDt    		(JSPUtil.getParameter(request, "credt    			".trim(), ""));
			model.setUpdusrId    	(JSPUtil.getParameter(request, "updusrid    		".trim(), ""));
			model.setUpdDt    		(JSPUtil.getParameter(request, "upddt    			".trim(), ""));
			model.setEai_evnt_dt    (JSPUtil.getParameter(request, "eai_evnt_dt    		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	
	public static Collection fromRequest(HttpServletRequest request, int length) {
		MdmChkmailAddr model = null;
		Collection models = new ArrayList();
		try {
			String[] vndrseq    	 =  (JSPUtil.getParameter(request, "vndrseq 			".trim(), length));
			String[] chk_de_addr1    =  (JSPUtil.getParameter(request, "chk_de_addr1 		".trim(), length));
			String[] chk_de_addr2    =  (JSPUtil.getParameter(request, "chk_de_addr2 		".trim(), length));
			String[] chk_de_addr3    =  (JSPUtil.getParameter(request, "chk_de_addr3 		".trim(), length));
			String[] chk_de_cty_nm   =  (JSPUtil.getParameter(request, "chk_de_cty_nm		".trim(), length));
			String[] chk_de_ste_cd   =  (JSPUtil.getParameter(request, "chk_de_ste_cd		".trim(), length));
			String[] chk_de_zip_cd   =  (JSPUtil.getParameter(request, "chk_de_zip_cd		".trim(), length));
			String[] chk_de_cnt_cd   =  (JSPUtil.getParameter(request, "chk_de_cnt_cd		".trim(), length));
			String[] lu_delt_flg     =  (JSPUtil.getParameter(request, "lu_delt_flg  		".trim(), length));
			String[] creusrid    	 =  (JSPUtil.getParameter(request, "creusrid 			".trim(), length));
			String[] credt    		 =  (JSPUtil.getParameter(request, "credt 				".trim(), length));
			String[] updusrid    	 =  (JSPUtil.getParameter(request, "updusrid 			".trim(), length));
			String[] upddt    		 =  (JSPUtil.getParameter(request, "upddt 				".trim(), length));
			String[] eai_evnt_dt     =  (JSPUtil.getParameter(request, "eai_evnt_dt    		".trim(), length));

			for (int i = 0; i < length; i++) {
				model = new MdmChkmailAddr();
				model.setVndrSeq	  		  	  (vndrseq		  	[i]);
				model.setChk_de_addr1	  		  (chk_de_addr1   	[i]);
				model.setChk_de_addr2	  		  (chk_de_addr2   	[i]);
				model.setChk_de_addr3     		  (chk_de_addr3   	[i]);
				model.setChk_de_cty_nm    		  (chk_de_cty_nm  	[i]);
				model.setChk_de_ste_cd    		  (chk_de_ste_cd  	[i]);
				model.setChk_de_zip_cd    		  (chk_de_zip_cd  	[i]);
				model.setChk_de_cnt_cd    		  (chk_de_cnt_cd  	[i]);
				model.setLu_delt_flg      		  (lu_delt_flg    	[i]);
				model.setCreUsrId	  		  	  (creusrid		   	[i]);
				model.setCreDt	  		  		  (credt		   	[i]);
				model.setUpdusrId	  		  	  (updusrid		   	[i]);
				model.setUpdDt	  		  		  (upddt 		  	[i]);
				model.setEai_evnt_dt        	  (eai_evnt_dt     	[i]);
				
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		MdmChkmailAddr model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] vndrseq    	 =  (JSPUtil.getParameter(request, prefix + "vndrseq   				".trim(), length));
			String[] chk_de_addr1    =  (JSPUtil.getParameter(request, prefix + "chk_de_addr1   		".trim(), length));
			String[] chk_de_addr2    =  (JSPUtil.getParameter(request, prefix + "chk_de_addr2   		".trim(), length));
			String[] chk_de_addr3    =  (JSPUtil.getParameter(request, prefix + "chk_de_addr3   		".trim(), length));
			String[] chk_de_cty_nm   =  (JSPUtil.getParameter(request, prefix + "chk_de_cty_nm  		".trim(), length));
			String[] chk_de_ste_cd   =  (JSPUtil.getParameter(request, prefix + "chk_de_ste_cd  		".trim(), length));
			String[] chk_de_zip_cd   =  (JSPUtil.getParameter(request, prefix + "chk_de_zip_cd  		".trim(), length));
			String[] chk_de_cnt_cd   =  (JSPUtil.getParameter(request, prefix + "chk_de_cnt_cd  		".trim(), length));
			String[] lu_delt_flg     =  (JSPUtil.getParameter(request, prefix + "lu_delt_flg    		".trim(), length));
			String[] creusrid    	 =  (JSPUtil.getParameter(request, prefix + "creusrid   			".trim(), length));
			String[] credt    		 =  (JSPUtil.getParameter(request, prefix + "credt   				".trim(), length));
			String[] updusrid    	 =  (JSPUtil.getParameter(request, prefix + "updusrid   			".trim(), length));
			String[] upddt    		 =  (JSPUtil.getParameter(request, prefix + "upddt   				".trim(), length));
			String[] eai_evnt_dt     =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt       		".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new MdmChkmailAddr();
				model.setVndrSeq	  		  	  ( vndrseq   		[i]);
				model.setChk_de_addr1	  		  ( chk_de_addr1   	[i]);
				model.setChk_de_addr2	  		  ( chk_de_addr2   	[i]);
				model.setChk_de_addr3     		  ( chk_de_addr3   	[i]);
				model.setChk_de_cty_nm    		  ( chk_de_cty_nm  	[i]);
				model.setChk_de_ste_cd    		  ( chk_de_ste_cd  	[i]);
				model.setChk_de_zip_cd    		  ( chk_de_zip_cd  	[i]);
				model.setChk_de_cnt_cd    		  ( chk_de_cnt_cd  	[i]);
				model.setLu_delt_flg      		  ( lu_delt_flg    	[i]);
				model.setCreUsrId	  		  	  ( creusrid  	 	[i]);
				model.setCreDt	  		  		  ( credt   		[i]);
				model.setUpdusrId	  		 	  ( updusrid 	  	[i]);
				model.setUpdDt	  				  ( upddt   		[i]);
				model.setEai_evnt_dt         	  ( eai_evnt_dt    	[i]);

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
