/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : INV_YD_CNTR_SMRY.java
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
public final class INV_YD_CNTR_SMRY implements java.io.Serializable {

	private String            ibflag            = "";
	private String            page_rows         = "";
	private String            yd_cd             = "";
	private String            cntr_lstm_cd      = "";
	private String            cntr_tpsz_cd      = "";
	private String            cnmv_sts_cd       = "";
	private String            cntr_pfx_cd       = "";
	private String            cntr_full_flg     = "";
	private String            cntr_dmg_flg      = "";
	private String            cntr_hngr_flg     = "";
	private String            cntr_rfub_flg     = "";
	private String            cntr_disp_flg     = "";
	private String            dest_yd_cd        = "";
	private String            cntr_hngr_bar_flg = "";
	private String            svr_id            = "";
	private String            cntr_knt          = "";
	private String            nis_evnt_dt       = "";
	private String            eai_evnt_dt       = "";

	public INV_YD_CNTR_SMRY(){}

	public INV_YD_CNTR_SMRY(
			String            ibflag           ,
			String            page_rows        ,
			String            yd_cd            ,
			String            cntr_lstm_cd     ,
			String            cntr_tpsz_cd     ,
			String            cnmv_sts_cd      ,
			String            cntr_pfx_cd      ,
			String            cntr_full_flg    ,
			String            cntr_dmg_flg     ,
			String            cntr_hngr_flg    ,
			String            cntr_rfub_flg    ,
			String            cntr_disp_flg    ,
			String            dest_yd_cd       ,
			String            cntr_hngr_bar_flg,
			String            svr_id           ,
			String            cntr_knt         ,
			String            nis_evnt_dt      ,
			String            eai_evnt_dt      ){
		this.ibflag            = ibflag           ;
		this.page_rows         = page_rows        ;
		this.yd_cd             = yd_cd            ;
		this.cntr_lstm_cd      = cntr_lstm_cd     ;
		this.cntr_tpsz_cd      = cntr_tpsz_cd     ;
		this.cnmv_sts_cd       = cnmv_sts_cd      ;
		this.cntr_pfx_cd       = cntr_pfx_cd      ;
		this.cntr_full_flg     = cntr_full_flg    ;
		this.cntr_dmg_flg      = cntr_dmg_flg     ;
		this.cntr_hngr_flg     = cntr_hngr_flg    ;
		this.cntr_rfub_flg     = cntr_rfub_flg    ;
		this.cntr_disp_flg     = cntr_disp_flg    ;
		this.dest_yd_cd        = dest_yd_cd       ;
		this.cntr_hngr_bar_flg = cntr_hngr_bar_flg;
		this.svr_id            = svr_id           ;
		this.cntr_knt          = cntr_knt         ;
		this.nis_evnt_dt       = nis_evnt_dt      ;
		this.eai_evnt_dt       = eai_evnt_dt      ;
	}

	// getter method is proceeding ..
	public String            getIbflag           (){	return ibflag           	;	}
	public String            getPage_rows        (){	return page_rows        	;	}
	public String            getYd_cd            (){	return yd_cd            	;	}
	public String            getCntr_lstm_cd     (){	return cntr_lstm_cd     	;	}
	public String            getCntr_tpsz_cd     (){	return cntr_tpsz_cd     	;	}
	public String            getCnmv_sts_cd      (){	return cnmv_sts_cd      	;	}
	public String            getCntr_pfx_cd      (){	return cntr_pfx_cd      	;	}
	public String            getCntr_full_flg    (){	return cntr_full_flg    	;	}
	public String            getCntr_dmg_flg     (){	return cntr_dmg_flg     	;	}
	public String            getCntr_hngr_flg    (){	return cntr_hngr_flg    	;	}
	public String            getCntr_rfub_flg    (){	return cntr_rfub_flg    	;	}
	public String            getCntr_disp_flg    (){	return cntr_disp_flg    	;	}
	public String            getDest_yd_cd       (){	return dest_yd_cd       	;	}
	public String            getCntr_hngr_bar_flg(){	return cntr_hngr_bar_flg	;	}
	public String            getSvr_id           (){	return svr_id           	;	}
	public String            getCntr_knt         (){	return cntr_knt         	;	}
	public String            getNis_evnt_dt      (){	return nis_evnt_dt      	;	}
	public String            getEai_evnt_dt      (){	return eai_evnt_dt      	;	}

	// setter method is proceeding ..
	public void setIbflag           ( String            ibflag            ){	this.ibflag            = ibflag           	;	}
	public void setPage_rows        ( String            page_rows         ){	this.page_rows         = page_rows        	;	}
	public void setYd_cd            ( String            yd_cd             ){	this.yd_cd             = yd_cd            	;	}
	public void setCntr_lstm_cd     ( String            cntr_lstm_cd      ){	this.cntr_lstm_cd      = cntr_lstm_cd     	;	}
	public void setCntr_tpsz_cd     ( String            cntr_tpsz_cd      ){	this.cntr_tpsz_cd      = cntr_tpsz_cd     	;	}
	public void setCnmv_sts_cd      ( String            cnmv_sts_cd       ){	this.cnmv_sts_cd       = cnmv_sts_cd      	;	}
	public void setCntr_pfx_cd      ( String            cntr_pfx_cd       ){	this.cntr_pfx_cd       = cntr_pfx_cd      	;	}
	public void setCntr_full_flg    ( String            cntr_full_flg     ){	this.cntr_full_flg     = cntr_full_flg    	;	}
	public void setCntr_dmg_flg     ( String            cntr_dmg_flg      ){	this.cntr_dmg_flg      = cntr_dmg_flg     	;	}
	public void setCntr_hngr_flg    ( String            cntr_hngr_flg     ){	this.cntr_hngr_flg     = cntr_hngr_flg    	;	}
	public void setCntr_rfub_flg    ( String            cntr_rfub_flg     ){	this.cntr_rfub_flg     = cntr_rfub_flg    	;	}
	public void setCntr_disp_flg    ( String            cntr_disp_flg     ){	this.cntr_disp_flg     = cntr_disp_flg    	;	}
	public void setDest_yd_cd       ( String            dest_yd_cd        ){	this.dest_yd_cd        = dest_yd_cd       	;	}
	public void setCntr_hngr_bar_flg( String            cntr_hngr_bar_flg ){	this.cntr_hngr_bar_flg = cntr_hngr_bar_flg	;	}
	public void setSvr_id           ( String            svr_id            ){	this.svr_id            = svr_id           	;	}
	public void setCntr_knt         ( String            cntr_knt          ){	this.cntr_knt          = cntr_knt         	;	}
	public void setNis_evnt_dt      ( String            nis_evnt_dt       ){	this.nis_evnt_dt       = nis_evnt_dt      	;	}
	public void setEai_evnt_dt      ( String            eai_evnt_dt       ){	this.eai_evnt_dt       = eai_evnt_dt      	;	}

	public static INV_YD_CNTR_SMRY fromRequest(HttpServletRequest request) {
		INV_YD_CNTR_SMRY model = new INV_YD_CNTR_SMRY();
		try {
			model.setIbflag           	(JSPUtil.getParameter(request, "ibflag           		".trim(), ""));
			model.setPage_rows        	(JSPUtil.getParameter(request, "page_rows        		".trim(), ""));
			model.setYd_cd            	(JSPUtil.getParameter(request, "yd_cd            		".trim(), ""));
			model.setCntr_lstm_cd     	(JSPUtil.getParameter(request, "cntr_lstm_cd     		".trim(), ""));
			model.setCntr_tpsz_cd     	(JSPUtil.getParameter(request, "cntr_tpsz_cd     		".trim(), ""));
			model.setCnmv_sts_cd      	(JSPUtil.getParameter(request, "cnmv_sts_cd      		".trim(), ""));
			model.setCntr_pfx_cd      	(JSPUtil.getParameter(request, "cntr_pfx_cd      		".trim(), ""));
			model.setCntr_full_flg    	(JSPUtil.getParameter(request, "cntr_full_flg    		".trim(), ""));
			model.setCntr_dmg_flg     	(JSPUtil.getParameter(request, "cntr_dmg_flg     		".trim(), ""));
			model.setCntr_hngr_flg    	(JSPUtil.getParameter(request, "cntr_hngr_flg    		".trim(), ""));
			model.setCntr_rfub_flg    	(JSPUtil.getParameter(request, "cntr_rfub_flg    		".trim(), ""));
			model.setCntr_disp_flg    	(JSPUtil.getParameter(request, "cntr_disp_flg    		".trim(), ""));
			model.setDest_yd_cd       	(JSPUtil.getParameter(request, "dest_yd_cd       		".trim(), ""));
			model.setCntr_hngr_bar_flg	(JSPUtil.getParameter(request, "cntr_hngr_bar_flg		".trim(), ""));
			model.setSvr_id           	(JSPUtil.getParameter(request, "svr_id           		".trim(), ""));
			model.setCntr_knt         	(JSPUtil.getParameter(request, "cntr_knt         		".trim(), ""));
			model.setNis_evnt_dt      	(JSPUtil.getParameter(request, "nis_evnt_dt      		".trim(), ""));
			model.setEai_evnt_dt      	(JSPUtil.getParameter(request, "eai_evnt_dt      		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		INV_YD_CNTR_SMRY model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag            =  (JSPUtil.getParameter(request, "ibflag           		".trim(), length));
			String[] page_rows         =  (JSPUtil.getParameter(request, "page_rows        		".trim(), length));
			String[] yd_cd             =  (JSPUtil.getParameter(request, "yd_cd            		".trim(), length));
			String[] cntr_lstm_cd      =  (JSPUtil.getParameter(request, "cntr_lstm_cd     		".trim(), length));
			String[] cntr_tpsz_cd      =  (JSPUtil.getParameter(request, "cntr_tpsz_cd     		".trim(), length));
			String[] cnmv_sts_cd       =  (JSPUtil.getParameter(request, "cnmv_sts_cd      		".trim(), length));
			String[] cntr_pfx_cd       =  (JSPUtil.getParameter(request, "cntr_pfx_cd      		".trim(), length));
			String[] cntr_full_flg     =  (JSPUtil.getParameter(request, "cntr_full_flg    		".trim(), length));
			String[] cntr_dmg_flg      =  (JSPUtil.getParameter(request, "cntr_dmg_flg     		".trim(), length));
			String[] cntr_hngr_flg     =  (JSPUtil.getParameter(request, "cntr_hngr_flg    		".trim(), length));
			String[] cntr_rfub_flg     =  (JSPUtil.getParameter(request, "cntr_rfub_flg    		".trim(), length));
			String[] cntr_disp_flg     =  (JSPUtil.getParameter(request, "cntr_disp_flg    		".trim(), length));
			String[] dest_yd_cd        =  (JSPUtil.getParameter(request, "dest_yd_cd       		".trim(), length));
			String[] cntr_hngr_bar_flg =  (JSPUtil.getParameter(request, "cntr_hngr_bar_flg		".trim(), length));
			String[] svr_id            =  (JSPUtil.getParameter(request, "svr_id           		".trim(), length));
			String[] cntr_knt          =  (JSPUtil.getParameter(request, "cntr_knt         		".trim(), length));
			String[] nis_evnt_dt       =  (JSPUtil.getParameter(request, "nis_evnt_dt      		".trim(), length));
			String[] eai_evnt_dt       =  (JSPUtil.getParameter(request, "eai_evnt_dt      		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new INV_YD_CNTR_SMRY();
				model.setIbflag           		  (ibflag           	[i]);
				model.setPage_rows        		  (page_rows        	[i]);
				model.setYd_cd            		  (yd_cd            	[i]);
				model.setCntr_lstm_cd     		  (cntr_lstm_cd     	[i]);
				model.setCntr_tpsz_cd     		  (cntr_tpsz_cd     	[i]);
				model.setCnmv_sts_cd      		  (cnmv_sts_cd      	[i]);
				model.setCntr_pfx_cd      		  (cntr_pfx_cd      	[i]);
				model.setCntr_full_flg    		  (cntr_full_flg    	[i]);
				model.setCntr_dmg_flg     		  (cntr_dmg_flg     	[i]);
				model.setCntr_hngr_flg    		  (cntr_hngr_flg    	[i]);
				model.setCntr_rfub_flg    		  (cntr_rfub_flg    	[i]);
				model.setCntr_disp_flg    		  (cntr_disp_flg    	[i]);
				model.setDest_yd_cd       		  (dest_yd_cd       	[i]);
				model.setCntr_hngr_bar_flg		  (cntr_hngr_bar_flg	[i]);
				model.setSvr_id           		  (svr_id           	[i]);
				model.setCntr_knt         		  (cntr_knt         	[i]);
				model.setNis_evnt_dt      		  (nis_evnt_dt      	[i]);
				model.setEai_evnt_dt      		  (eai_evnt_dt      	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		INV_YD_CNTR_SMRY model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag            =  (JSPUtil.getParameter(request, prefix + "ibflag           		".trim(), length));
			String[] page_rows         =  (JSPUtil.getParameter(request, prefix + "page_rows        		".trim(), length));
			String[] yd_cd             =  (JSPUtil.getParameter(request, prefix + "yd_cd            		".trim(), length));
			String[] cntr_lstm_cd      =  (JSPUtil.getParameter(request, prefix + "cntr_lstm_cd     		".trim(), length));
			String[] cntr_tpsz_cd      =  (JSPUtil.getParameter(request, prefix + "cntr_tpsz_cd     		".trim(), length));
			String[] cnmv_sts_cd       =  (JSPUtil.getParameter(request, prefix + "cnmv_sts_cd      		".trim(), length));
			String[] cntr_pfx_cd       =  (JSPUtil.getParameter(request, prefix + "cntr_pfx_cd      		".trim(), length));
			String[] cntr_full_flg     =  (JSPUtil.getParameter(request, prefix + "cntr_full_flg    		".trim(), length));
			String[] cntr_dmg_flg      =  (JSPUtil.getParameter(request, prefix + "cntr_dmg_flg     		".trim(), length));
			String[] cntr_hngr_flg     =  (JSPUtil.getParameter(request, prefix + "cntr_hngr_flg    		".trim(), length));
			String[] cntr_rfub_flg     =  (JSPUtil.getParameter(request, prefix + "cntr_rfub_flg    		".trim(), length));
			String[] cntr_disp_flg     =  (JSPUtil.getParameter(request, prefix + "cntr_disp_flg    		".trim(), length));
			String[] dest_yd_cd        =  (JSPUtil.getParameter(request, prefix + "dest_yd_cd       		".trim(), length));
			String[] cntr_hngr_bar_flg =  (JSPUtil.getParameter(request, prefix + "cntr_hngr_bar_flg		".trim(), length));
			String[] svr_id            =  (JSPUtil.getParameter(request, prefix + "svr_id           		".trim(), length));
			String[] cntr_knt          =  (JSPUtil.getParameter(request, prefix + "cntr_knt         		".trim(), length));
			String[] nis_evnt_dt       =  (JSPUtil.getParameter(request, prefix + "nis_evnt_dt      		".trim(), length));
			String[] eai_evnt_dt       =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt      		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new INV_YD_CNTR_SMRY();
				model.setIbflag           		  ( ibflag           	[i]);
				model.setPage_rows        		  ( page_rows        	[i]);
				model.setYd_cd            		  ( yd_cd            	[i]);
				model.setCntr_lstm_cd     		  ( cntr_lstm_cd     	[i]);
				model.setCntr_tpsz_cd     		  ( cntr_tpsz_cd     	[i]);
				model.setCnmv_sts_cd      		  ( cnmv_sts_cd      	[i]);
				model.setCntr_pfx_cd      		  ( cntr_pfx_cd      	[i]);
				model.setCntr_full_flg    		  ( cntr_full_flg    	[i]);
				model.setCntr_dmg_flg     		  ( cntr_dmg_flg     	[i]);
				model.setCntr_hngr_flg    		  ( cntr_hngr_flg    	[i]);
				model.setCntr_rfub_flg    		  ( cntr_rfub_flg    	[i]);
				model.setCntr_disp_flg    		  ( cntr_disp_flg    	[i]);
				model.setDest_yd_cd       		  ( dest_yd_cd       	[i]);
				model.setCntr_hngr_bar_flg		  ( cntr_hngr_bar_flg	[i]);
				model.setSvr_id           		  ( svr_id           	[i]);
				model.setCntr_knt         		  ( cntr_knt         	[i]);
				model.setNis_evnt_dt      		  ( nis_evnt_dt      	[i]);
				model.setEai_evnt_dt      		  ( eai_evnt_dt      	[i]);
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
