/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : EDI_322_MSG.java
*@FileTitle : 사용자 관리
*Open Issues :
*Change history :
*@LastModifyDate : 2007-01-12
*@LastModifier : JeongSeon An
*@LastVersion : 1.0
* 2007-01-12 JeongSeon An
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
 * @author Kildong_hong
 * @since J2EE 1.4
 */
public final class EDI_322_MSG implements java.io.Serializable {

	private String          ibflag          = "";
	private String          page_rows       = "";
	private String          evnt_dt         = "";
	private String          eq_no           = "";
	private String          edi_322_sts_cd  = "";
	private String          sndr_id         = "";
	private String          rcvr_id         = "";
	private String          evnt_yd_cd      = "";
	private String          evnt_cty_nm     = "";
	private String          evnt_ste_cd     = "";
	private String          evnt_cnt_cd     = "";
	private String          eq_desc_cd      = "";
	private String          eq_sts_cd       = "";
	private String          chss_edi_322_no = "";
	private String          vsl_cd          = "";
	private String          lloyd_vsl_no    = "";
	private String          vsl_nm          = "";
	private String          vsl_voy_dir_no  = "";
	private String          spcl_hndl_cd    = "";
	private String          bl_edi_322_no   = "";
	private String          bkg_edi_322_no  = "";
	private String          cre_dt          = "";
	private String          psn_cd          = "";
	private String          pkup_edi_322_no = "";
	private String          rail_dest_eta_dt= "";

	public EDI_322_MSG(){}

	public EDI_322_MSG(
			String          ibflag         ,
			String          page_rows      ,
			String          evnt_dt        ,
			String          eq_no          ,
			String          edi_322_sts_cd ,
			String          sndr_id        ,
			String          rcvr_id        ,
			String          evnt_yd_cd     ,
			String          evnt_cty_nm    ,
			String          evnt_ste_cd    ,
			String          evnt_cnt_cd    ,
			String          eq_desc_cd     ,
			String          eq_sts_cd      ,
			String          chss_edi_322_no,
			String          vsl_cd         ,
			String          lloyd_vsl_no   ,
			String          vsl_nm         ,
			String          vsl_voy_dir_no ,
			String          spcl_hndl_cd   ,
			String          bl_edi_322_no  ,
			String          bkg_edi_322_no ,
			String          cre_dt         ,
			String          psn_cd         ,
			String          pkup_edi_322_no,
			String			rail_dest_eta_dt){
		this.ibflag          = ibflag         ;
		this.page_rows       = page_rows      ;
		this.evnt_dt         = evnt_dt        ;
		this.eq_no           = eq_no          ;
		this.edi_322_sts_cd  = edi_322_sts_cd ;
		this.sndr_id         = sndr_id        ;
		this.rcvr_id         = rcvr_id        ;
		this.evnt_yd_cd      = evnt_yd_cd     ;
		this.evnt_cty_nm     = evnt_cty_nm    ;
		this.evnt_ste_cd     = evnt_ste_cd    ;
		this.evnt_cnt_cd     = evnt_cnt_cd    ;
		this.eq_desc_cd      = eq_desc_cd     ;
		this.eq_sts_cd       = eq_sts_cd      ;
		this.chss_edi_322_no = chss_edi_322_no;
		this.vsl_cd          = vsl_cd         ;
		this.lloyd_vsl_no    = lloyd_vsl_no   ;
		this.vsl_nm          = vsl_nm         ;
		this.vsl_voy_dir_no  = vsl_voy_dir_no ;
		this.spcl_hndl_cd    = spcl_hndl_cd   ;
		this.bl_edi_322_no   = bl_edi_322_no  ;
		this.bkg_edi_322_no  = bkg_edi_322_no ;
		this.cre_dt          = cre_dt         ;
		this.psn_cd          = psn_cd         ;
		this.pkup_edi_322_no = pkup_edi_322_no;
		this.rail_dest_eta_dt= rail_dest_eta_dt;
	}

	// getter method is proceeding ..
	public String          getIbflag         (){	return ibflag         	;	}
	public String          getPage_rows      (){	return page_rows      	;	}
	public String          getEvnt_dt        (){	return evnt_dt        	;	}
	public String          getEq_no          (){	return eq_no          	;	}
	public String          getEdi_322_sts_cd (){	return edi_322_sts_cd 	;	}
	public String          getSndr_id        (){	return sndr_id        	;	}
	public String          getRcvr_id        (){	return rcvr_id        	;	}
	public String          getEvnt_yd_cd     (){	return evnt_yd_cd     	;	}
	public String          getEvnt_cty_nm    (){	return evnt_cty_nm    	;	}
	public String          getEvnt_ste_cd    (){	return evnt_ste_cd    	;	}
	public String          getEvnt_cnt_cd    (){	return evnt_cnt_cd    	;	}
	public String          getEq_desc_cd     (){	return eq_desc_cd     	;	}
	public String          getEq_sts_cd      (){	return eq_sts_cd      	;	}
	public String          getChss_edi_322_no(){	return chss_edi_322_no	;	}
	public String          getVsl_cd         (){	return vsl_cd         	;	}
	public String          getLloyd_vsl_no   (){	return lloyd_vsl_no   	;	}
	public String          getVsl_nm         (){	return vsl_nm         	;	}
	public String          getVsl_voy_dir_no (){	return vsl_voy_dir_no 	;	}
	public String          getSpcl_hndl_cd   (){	return spcl_hndl_cd   	;	}
	public String          getBl_edi_322_no  (){	return bl_edi_322_no  	;	}
	public String          getBkg_edi_322_no (){	return bkg_edi_322_no 	;	}
	public String          getCre_dt         (){	return cre_dt         	;	}
	public String          getPsn_cd         (){	return psn_cd         	;	}
	public String          getPkup_edi_322_no(){	return pkup_edi_322_no	;	}
	public String		   getRail_dest_eta_dt(){   return rail_dest_eta_dt ;   }

	// setter method is proceeding ..
	public void setIbflag         ( String          ibflag          ){	this.ibflag          = ibflag         	;	}
	public void setPage_rows      ( String          page_rows       ){	this.page_rows       = page_rows      	;	}
	public void setEvnt_dt        ( String          evnt_dt         ){	this.evnt_dt         = evnt_dt        	;	}
	public void setEq_no          ( String          eq_no           ){	this.eq_no           = eq_no          	;	}
	public void setEdi_322_sts_cd ( String          edi_322_sts_cd  ){	this.edi_322_sts_cd  = edi_322_sts_cd 	;	}
	public void setSndr_id        ( String          sndr_id         ){	this.sndr_id         = sndr_id        	;	}
	public void setRcvr_id        ( String          rcvr_id         ){	this.rcvr_id         = rcvr_id        	;	}
	public void setEvnt_yd_cd     ( String          evnt_yd_cd      ){	this.evnt_yd_cd      = evnt_yd_cd     	;	}
	public void setEvnt_cty_nm    ( String          evnt_cty_nm     ){	this.evnt_cty_nm     = evnt_cty_nm    	;	}
	public void setEvnt_ste_cd    ( String          evnt_ste_cd     ){	this.evnt_ste_cd     = evnt_ste_cd    	;	}
	public void setEvnt_cnt_cd    ( String          evnt_cnt_cd     ){	this.evnt_cnt_cd     = evnt_cnt_cd    	;	}
	public void setEq_desc_cd     ( String          eq_desc_cd      ){	this.eq_desc_cd      = eq_desc_cd     	;	}
	public void setEq_sts_cd      ( String          eq_sts_cd       ){	this.eq_sts_cd       = eq_sts_cd      	;	}
	public void setChss_edi_322_no( String          chss_edi_322_no ){	this.chss_edi_322_no = chss_edi_322_no	;	}
	public void setVsl_cd         ( String          vsl_cd          ){	this.vsl_cd          = vsl_cd         	;	}
	public void setLloyd_vsl_no   ( String          lloyd_vsl_no    ){	this.lloyd_vsl_no    = lloyd_vsl_no   	;	}
	public void setVsl_nm         ( String          vsl_nm          ){	this.vsl_nm          = vsl_nm         	;	}
	public void setVsl_voy_dir_no ( String          vsl_voy_dir_no  ){	this.vsl_voy_dir_no  = vsl_voy_dir_no 	;	}
	public void setSpcl_hndl_cd   ( String          spcl_hndl_cd    ){	this.spcl_hndl_cd    = spcl_hndl_cd   	;	}
	public void setBl_edi_322_no  ( String          bl_edi_322_no   ){	this.bl_edi_322_no   = bl_edi_322_no  	;	}
	public void setBkg_edi_322_no ( String          bkg_edi_322_no  ){	this.bkg_edi_322_no  = bkg_edi_322_no 	;	}
	public void setCre_dt         ( String          cre_dt          ){	this.cre_dt          = cre_dt         	;	}
	public void setPsn_cd         ( String          psn_cd          ){	this.psn_cd          = psn_cd         	;	}
	public void setPkup_edi_322_no( String          pkup_edi_322_no ){	this.pkup_edi_322_no = pkup_edi_322_no	;	}
	public void setRail_dest_eta_dt( String          rail_dest_eta_dt ){	this.rail_dest_eta_dt = rail_dest_eta_dt	;	}

	public static EDI_322_MSG fromRequest(HttpServletRequest request) {
		EDI_322_MSG model = new EDI_322_MSG();
		try {
			model.setIbflag         	(JSPUtil.getParameter(request, "ibflag         		".trim(), ""));
			model.setPage_rows      	(JSPUtil.getParameter(request, "page_rows      		".trim(), ""));
			model.setEvnt_dt        	(JSPUtil.getParameter(request, "evnt_dt        		".trim(), ""));
			model.setEq_no          	(JSPUtil.getParameter(request, "eq_no          		".trim(), ""));
			model.setEdi_322_sts_cd 	(JSPUtil.getParameter(request, "edi_322_sts_cd 		".trim(), ""));
			model.setSndr_id        	(JSPUtil.getParameter(request, "sndr_id        		".trim(), ""));
			model.setRcvr_id        	(JSPUtil.getParameter(request, "rcvr_id        		".trim(), ""));
			model.setEvnt_yd_cd     	(JSPUtil.getParameter(request, "evnt_yd_cd     		".trim(), ""));
			model.setEvnt_cty_nm    	(JSPUtil.getParameter(request, "evnt_cty_nm    		".trim(), ""));
			model.setEvnt_ste_cd    	(JSPUtil.getParameter(request, "evnt_ste_cd    		".trim(), ""));
			model.setEvnt_cnt_cd    	(JSPUtil.getParameter(request, "evnt_cnt_cd    		".trim(), ""));
			model.setEq_desc_cd     	(JSPUtil.getParameter(request, "eq_desc_cd     		".trim(), ""));
			model.setEq_sts_cd      	(JSPUtil.getParameter(request, "eq_sts_cd      		".trim(), ""));
			model.setChss_edi_322_no	(JSPUtil.getParameter(request, "chss_edi_322_no		".trim(), ""));
			model.setVsl_cd         	(JSPUtil.getParameter(request, "vsl_cd         		".trim(), ""));
			model.setLloyd_vsl_no   	(JSPUtil.getParameter(request, "lloyd_vsl_no   		".trim(), ""));
			model.setVsl_nm         	(JSPUtil.getParameter(request, "vsl_nm         		".trim(), ""));
			model.setVsl_voy_dir_no 	(JSPUtil.getParameter(request, "vsl_voy_dir_no 		".trim(), ""));
			model.setSpcl_hndl_cd   	(JSPUtil.getParameter(request, "spcl_hndl_cd   		".trim(), ""));
			model.setBl_edi_322_no  	(JSPUtil.getParameter(request, "bl_edi_322_no  		".trim(), ""));
			model.setBkg_edi_322_no 	(JSPUtil.getParameter(request, "bkg_edi_322_no 		".trim(), ""));
			model.setCre_dt         	(JSPUtil.getParameter(request, "cre_dt         		".trim(), ""));
			model.setPsn_cd         	(JSPUtil.getParameter(request, "psn_cd         		".trim(), ""));
			model.setPkup_edi_322_no	(JSPUtil.getParameter(request, "pkup_edi_322_no		".trim(), ""));
			model.setRail_dest_eta_dt	(JSPUtil.getParameter(request, "rail_dest_eta_dt		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		EDI_322_MSG model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag          =  (JSPUtil.getParameter(request, "ibflag         		".trim(), length));
			String[] page_rows       =  (JSPUtil.getParameter(request, "page_rows      		".trim(), length));
			String[] evnt_dt         =  (JSPUtil.getParameter(request, "evnt_dt        		".trim(), length));
			String[] eq_no           =  (JSPUtil.getParameter(request, "eq_no          		".trim(), length));
			String[] edi_322_sts_cd  =  (JSPUtil.getParameter(request, "edi_322_sts_cd 		".trim(), length));
			String[] sndr_id         =  (JSPUtil.getParameter(request, "sndr_id        		".trim(), length));
			String[] rcvr_id         =  (JSPUtil.getParameter(request, "rcvr_id        		".trim(), length));
			String[] evnt_yd_cd      =  (JSPUtil.getParameter(request, "evnt_yd_cd     		".trim(), length));
			String[] evnt_cty_nm     =  (JSPUtil.getParameter(request, "evnt_cty_nm    		".trim(), length));
			String[] evnt_ste_cd     =  (JSPUtil.getParameter(request, "evnt_ste_cd    		".trim(), length));
			String[] evnt_cnt_cd     =  (JSPUtil.getParameter(request, "evnt_cnt_cd    		".trim(), length));
			String[] eq_desc_cd      =  (JSPUtil.getParameter(request, "eq_desc_cd     		".trim(), length));
			String[] eq_sts_cd       =  (JSPUtil.getParameter(request, "eq_sts_cd      		".trim(), length));
			String[] chss_edi_322_no =  (JSPUtil.getParameter(request, "chss_edi_322_no		".trim(), length));
			String[] vsl_cd          =  (JSPUtil.getParameter(request, "vsl_cd         		".trim(), length));
			String[] lloyd_vsl_no    =  (JSPUtil.getParameter(request, "lloyd_vsl_no   		".trim(), length));
			String[] vsl_nm          =  (JSPUtil.getParameter(request, "vsl_nm         		".trim(), length));
			String[] vsl_voy_dir_no  =  (JSPUtil.getParameter(request, "vsl_voy_dir_no 		".trim(), length));
			String[] spcl_hndl_cd    =  (JSPUtil.getParameter(request, "spcl_hndl_cd   		".trim(), length));
			String[] bl_edi_322_no   =  (JSPUtil.getParameter(request, "bl_edi_322_no  		".trim(), length));
			String[] bkg_edi_322_no  =  (JSPUtil.getParameter(request, "bkg_edi_322_no 		".trim(), length));
			String[] cre_dt          =  (JSPUtil.getParameter(request, "cre_dt         		".trim(), length));
			String[] psn_cd          =  (JSPUtil.getParameter(request, "psn_cd         		".trim(), length));
			String[] pkup_edi_322_no =  (JSPUtil.getParameter(request, "pkup_edi_322_no		".trim(), length));
			String[] rail_dest_eta_dt =  (JSPUtil.getParameter(request, "rail_dest_eta_dt		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new EDI_322_MSG();
				model.setIbflag         		  (ibflag         	[i]);
				model.setPage_rows      		  (page_rows      	[i]);
				model.setEvnt_dt        		  (evnt_dt        	[i]);
				model.setEq_no          		  (eq_no          	[i]);
				model.setEdi_322_sts_cd 		  (edi_322_sts_cd 	[i]);
				model.setSndr_id        		  (sndr_id        	[i]);
				model.setRcvr_id        		  (rcvr_id        	[i]);
				model.setEvnt_yd_cd     		  (evnt_yd_cd     	[i]);
				model.setEvnt_cty_nm    		  (evnt_cty_nm    	[i]);
				model.setEvnt_ste_cd    		  (evnt_ste_cd    	[i]);
				model.setEvnt_cnt_cd    		  (evnt_cnt_cd    	[i]);
				model.setEq_desc_cd     		  (eq_desc_cd     	[i]);
				model.setEq_sts_cd      		  (eq_sts_cd      	[i]);
				model.setChss_edi_322_no		  (chss_edi_322_no	[i]);
				model.setVsl_cd         		  (vsl_cd         	[i]);
				model.setLloyd_vsl_no   		  (lloyd_vsl_no   	[i]);
				model.setVsl_nm         		  (vsl_nm         	[i]);
				model.setVsl_voy_dir_no 		  (vsl_voy_dir_no 	[i]);
				model.setSpcl_hndl_cd   		  (spcl_hndl_cd   	[i]);
				model.setBl_edi_322_no  		  (bl_edi_322_no  	[i]);
				model.setBkg_edi_322_no 		  (bkg_edi_322_no 	[i]);
				model.setCre_dt         		  (cre_dt         	[i]);
				model.setPsn_cd         		  (psn_cd         	[i]);
				model.setPkup_edi_322_no		  (pkup_edi_322_no	[i]);
				model.setRail_dest_eta_dt		  (rail_dest_eta_dt	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		EDI_322_MSG model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag          =  (JSPUtil.getParameter(request, prefix + "ibflag         		".trim(), length));
			String[] page_rows       =  (JSPUtil.getParameter(request, prefix + "page_rows      		".trim(), length));
			String[] evnt_dt         =  (JSPUtil.getParameter(request, prefix + "evnt_dt        		".trim(), length));
			String[] eq_no           =  (JSPUtil.getParameter(request, prefix + "eq_no          		".trim(), length));
			String[] edi_322_sts_cd  =  (JSPUtil.getParameter(request, prefix + "edi_322_sts_cd 		".trim(), length));
			String[] sndr_id         =  (JSPUtil.getParameter(request, prefix + "sndr_id        		".trim(), length));
			String[] rcvr_id         =  (JSPUtil.getParameter(request, prefix + "rcvr_id        		".trim(), length));
			String[] evnt_yd_cd      =  (JSPUtil.getParameter(request, prefix + "evnt_yd_cd     		".trim(), length));
			String[] evnt_cty_nm     =  (JSPUtil.getParameter(request, prefix + "evnt_cty_nm    		".trim(), length));
			String[] evnt_ste_cd     =  (JSPUtil.getParameter(request, prefix + "evnt_ste_cd    		".trim(), length));
			String[] evnt_cnt_cd     =  (JSPUtil.getParameter(request, prefix + "evnt_cnt_cd    		".trim(), length));
			String[] eq_desc_cd      =  (JSPUtil.getParameter(request, prefix + "eq_desc_cd     		".trim(), length));
			String[] eq_sts_cd       =  (JSPUtil.getParameter(request, prefix + "eq_sts_cd      		".trim(), length));
			String[] chss_edi_322_no =  (JSPUtil.getParameter(request, prefix + "chss_edi_322_no		".trim(), length));
			String[] vsl_cd          =  (JSPUtil.getParameter(request, prefix + "vsl_cd         		".trim(), length));
			String[] lloyd_vsl_no    =  (JSPUtil.getParameter(request, prefix + "lloyd_vsl_no   		".trim(), length));
			String[] vsl_nm          =  (JSPUtil.getParameter(request, prefix + "vsl_nm         		".trim(), length));
			String[] vsl_voy_dir_no  =  (JSPUtil.getParameter(request, prefix + "vsl_voy_dir_no 		".trim(), length));
			String[] spcl_hndl_cd    =  (JSPUtil.getParameter(request, prefix + "spcl_hndl_cd   		".trim(), length));
			String[] bl_edi_322_no   =  (JSPUtil.getParameter(request, prefix + "bl_edi_322_no  		".trim(), length));
			String[] bkg_edi_322_no  =  (JSPUtil.getParameter(request, prefix + "bkg_edi_322_no 		".trim(), length));
			String[] cre_dt          =  (JSPUtil.getParameter(request, prefix + "cre_dt         		".trim(), length));
			String[] psn_cd          =  (JSPUtil.getParameter(request, prefix + "psn_cd         		".trim(), length));
			String[] pkup_edi_322_no =  (JSPUtil.getParameter(request, prefix + "pkup_edi_322_no		".trim(), length));
			String[] rail_dest_eta_dt =  (JSPUtil.getParameter(request, prefix + "rail_dest_eta_dt		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new EDI_322_MSG();
				model.setIbflag         		  ( ibflag         	[i]);
				model.setPage_rows      		  ( page_rows      	[i]);
				model.setEvnt_dt        		  ( evnt_dt        	[i]);
				model.setEq_no          		  ( eq_no          	[i]);
				model.setEdi_322_sts_cd 		  ( edi_322_sts_cd 	[i]);
				model.setSndr_id        		  ( sndr_id        	[i]);
				model.setRcvr_id        		  ( rcvr_id        	[i]);
				model.setEvnt_yd_cd     		  ( evnt_yd_cd     	[i]);
				model.setEvnt_cty_nm    		  ( evnt_cty_nm    	[i]);
				model.setEvnt_ste_cd    		  ( evnt_ste_cd    	[i]);
				model.setEvnt_cnt_cd    		  ( evnt_cnt_cd    	[i]);
				model.setEq_desc_cd     		  ( eq_desc_cd     	[i]);
				model.setEq_sts_cd      		  ( eq_sts_cd      	[i]);
				model.setChss_edi_322_no		  ( chss_edi_322_no	[i]);
				model.setVsl_cd         		  ( vsl_cd         	[i]);
				model.setLloyd_vsl_no   		  ( lloyd_vsl_no   	[i]);
				model.setVsl_nm         		  ( vsl_nm         	[i]);
				model.setVsl_voy_dir_no 		  ( vsl_voy_dir_no 	[i]);
				model.setSpcl_hndl_cd   		  ( spcl_hndl_cd   	[i]);
				model.setBl_edi_322_no  		  ( bl_edi_322_no  	[i]);
				model.setBkg_edi_322_no 		  ( bkg_edi_322_no 	[i]);
				model.setCre_dt         		  ( cre_dt         	[i]);
				model.setPsn_cd         		  ( psn_cd         	[i]);
				model.setPkup_edi_322_no		  ( pkup_edi_322_no	[i]);
				model.setRail_dest_eta_dt		  ( rail_dest_eta_dt	[i]);
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
