/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : AR_VVD_XCH_RT.java
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
public final class AR_VVD_XCH_RT implements java.io.Serializable {

	private String           ibflag           = "";
	private String           page_rows        = "";
	private String           vsl_cd           = "";
	private String           skd_voy_no       = "";
	private String           skd_dir_cd       = "";
	private String           port_cd          = "";
	private String           curr_cd          = "";
	private String           svc_scp_cd       = "";
	private String           io_bnd_cd        = "";
	private String           to_curr_cd       = "";
	private String           ofc_cd           = "";
	private String           usd_locl_xch_rt  = "";
	private String           usd_euro_xch_rt  = "";
	private String           euro_locl_xch_rt = "";
	private String           vvd_aply_dt      = "";
	private String           delt_flg         = "";
	private String           cre_usr_id       = "";
	private String           cre_dt           = "";
	private String           eai_evnt_dt      = "";

	public AR_VVD_XCH_RT(){}

	public AR_VVD_XCH_RT(
			String           ibflag          ,
			String           page_rows       ,
			String           vsl_cd          ,
			String           skd_voy_no      ,
			String           skd_dir_cd      ,
			String           port_cd         ,
			String           curr_cd         ,
			String           svc_scp_cd      ,
			String           io_bnd_cd       ,
			String           to_curr_cd      ,
			String           ofc_cd          ,
			String           usd_locl_xch_rt ,
			String           usd_euro_xch_rt ,
			String           euro_locl_xch_rt,
			String           vvd_aply_dt     ,
			String           delt_flg        ,
			String           cre_usr_id      ,
			String           cre_dt          ,
			String           eai_evnt_dt     ){
		this.ibflag           = ibflag          ;
		this.page_rows        = page_rows       ;
		this.vsl_cd           = vsl_cd          ;
		this.skd_voy_no       = skd_voy_no      ;
		this.skd_dir_cd       = skd_dir_cd      ;
		this.port_cd          = port_cd         ;
		this.curr_cd          = curr_cd         ;
		this.svc_scp_cd       = svc_scp_cd      ;
		this.io_bnd_cd        = io_bnd_cd       ;
		this.to_curr_cd       = to_curr_cd      ;
		this.ofc_cd           = ofc_cd          ;
		this.usd_locl_xch_rt  = usd_locl_xch_rt ;
		this.usd_euro_xch_rt  = usd_euro_xch_rt ;
		this.euro_locl_xch_rt = euro_locl_xch_rt;
		this.vvd_aply_dt      = vvd_aply_dt     ;
		this.delt_flg         = delt_flg        ;
		this.cre_usr_id       = cre_usr_id      ;
		this.cre_dt           = cre_dt          ;
		this.eai_evnt_dt      = eai_evnt_dt     ;
	}

	// getter method is proceeding ..
	public String           getIbflag          (){	return ibflag          	;	}
	public String           getPage_rows       (){	return page_rows       	;	}
	public String           getVsl_cd          (){	return vsl_cd          	;	}
	public String           getSkd_voy_no      (){	return skd_voy_no      	;	}
	public String           getSkd_dir_cd      (){	return skd_dir_cd      	;	}
	public String           getPort_cd         (){	return port_cd         	;	}
	public String           getCurr_cd         (){	return curr_cd         	;	}
	public String           getSvc_scp_cd      (){	return svc_scp_cd      	;	}
	public String           getIo_bnd_cd       (){	return io_bnd_cd       	;	}
	public String           getTo_curr_cd      (){	return to_curr_cd      	;	}
	public String           getOfc_cd          (){	return ofc_cd          	;	}
	public String           getUsd_locl_xch_rt (){	return usd_locl_xch_rt 	;	}
	public String           getUsd_euro_xch_rt (){	return usd_euro_xch_rt 	;	}
	public String           getEuro_locl_xch_rt(){	return euro_locl_xch_rt	;	}
	public String           getVvd_aply_dt     (){	return vvd_aply_dt     	;	}
	public String           getDelt_flg        (){	return delt_flg        	;	}
	public String           getCre_usr_id      (){	return cre_usr_id      	;	}
	public String           getCre_dt          (){	return cre_dt          	;	}
	public String           getEai_evnt_dt     (){	return eai_evnt_dt     	;	}

	// setter method is proceeding ..
	public void setIbflag          ( String           ibflag           ){	this.ibflag           = ibflag          	;	}
	public void setPage_rows       ( String           page_rows        ){	this.page_rows        = page_rows       	;	}
	public void setVsl_cd          ( String           vsl_cd           ){	this.vsl_cd           = vsl_cd          	;	}
	public void setSkd_voy_no      ( String           skd_voy_no       ){	this.skd_voy_no       = skd_voy_no      	;	}
	public void setSkd_dir_cd      ( String           skd_dir_cd       ){	this.skd_dir_cd       = skd_dir_cd      	;	}
	public void setPort_cd         ( String           port_cd          ){	this.port_cd          = port_cd         	;	}
	public void setCurr_cd         ( String           curr_cd          ){	this.curr_cd          = curr_cd         	;	}
	public void setSvc_scp_cd      ( String           svc_scp_cd       ){	this.svc_scp_cd       = svc_scp_cd      	;	}
	public void setIo_bnd_cd       ( String           io_bnd_cd        ){	this.io_bnd_cd        = io_bnd_cd       	;	}
	public void setTo_curr_cd      ( String           to_curr_cd       ){	this.to_curr_cd       = to_curr_cd      	;	}
	public void setOfc_cd          ( String           ofc_cd           ){	this.ofc_cd           = ofc_cd          	;	}
	public void setUsd_locl_xch_rt ( String           usd_locl_xch_rt  ){	this.usd_locl_xch_rt  = usd_locl_xch_rt 	;	}
	public void setUsd_euro_xch_rt ( String           usd_euro_xch_rt  ){	this.usd_euro_xch_rt  = usd_euro_xch_rt 	;	}
	public void setEuro_locl_xch_rt( String           euro_locl_xch_rt ){	this.euro_locl_xch_rt = euro_locl_xch_rt	;	}
	public void setVvd_aply_dt     ( String           vvd_aply_dt      ){	this.vvd_aply_dt      = vvd_aply_dt     	;	}
	public void setDelt_flg        ( String           delt_flg         ){	this.delt_flg         = delt_flg        	;	}
	public void setCre_usr_id      ( String           cre_usr_id       ){	this.cre_usr_id       = cre_usr_id      	;	}
	public void setCre_dt          ( String           cre_dt           ){	this.cre_dt           = cre_dt          	;	}
	public void setEai_evnt_dt     ( String           eai_evnt_dt      ){	this.eai_evnt_dt      = eai_evnt_dt     	;	}

	public static AR_VVD_XCH_RT fromRequest(HttpServletRequest request) {
		AR_VVD_XCH_RT model = new AR_VVD_XCH_RT();
		try {
			model.setIbflag          	(JSPUtil.getParameter(request, "ibflag          		".trim(), ""));
			model.setPage_rows       	(JSPUtil.getParameter(request, "page_rows       		".trim(), ""));
			model.setVsl_cd          	(JSPUtil.getParameter(request, "vsl_cd          		".trim(), ""));
			model.setSkd_voy_no      	(JSPUtil.getParameter(request, "skd_voy_no      		".trim(), ""));
			model.setSkd_dir_cd      	(JSPUtil.getParameter(request, "skd_dir_cd      		".trim(), ""));
			model.setPort_cd         	(JSPUtil.getParameter(request, "port_cd         		".trim(), ""));
			model.setCurr_cd         	(JSPUtil.getParameter(request, "curr_cd         		".trim(), ""));
			model.setSvc_scp_cd      	(JSPUtil.getParameter(request, "svc_scp_cd      		".trim(), ""));
			model.setIo_bnd_cd       	(JSPUtil.getParameter(request, "io_bnd_cd       		".trim(), ""));
			model.setTo_curr_cd      	(JSPUtil.getParameter(request, "to_curr_cd      		".trim(), ""));
			model.setOfc_cd          	(JSPUtil.getParameter(request, "ofc_cd          		".trim(), ""));
			model.setUsd_locl_xch_rt 	(JSPUtil.getParameter(request, "usd_locl_xch_rt 		".trim(), ""));
			model.setUsd_euro_xch_rt 	(JSPUtil.getParameter(request, "usd_euro_xch_rt 		".trim(), ""));
			model.setEuro_locl_xch_rt	(JSPUtil.getParameter(request, "euro_locl_xch_rt		".trim(), ""));
			model.setVvd_aply_dt     	(JSPUtil.getParameter(request, "vvd_aply_dt     		".trim(), ""));
			model.setDelt_flg        	(JSPUtil.getParameter(request, "delt_flg        		".trim(), ""));
			model.setCre_usr_id      	(JSPUtil.getParameter(request, "cre_usr_id      		".trim(), ""));
			model.setCre_dt          	(JSPUtil.getParameter(request, "cre_dt          		".trim(), ""));
			model.setEai_evnt_dt     	(JSPUtil.getParameter(request, "eai_evnt_dt     		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		AR_VVD_XCH_RT model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag           =  (JSPUtil.getParameter(request, "ibflag          		".trim(), length));
			String[] page_rows        =  (JSPUtil.getParameter(request, "page_rows       		".trim(), length));
			String[] vsl_cd           =  (JSPUtil.getParameter(request, "vsl_cd          		".trim(), length));
			String[] skd_voy_no       =  (JSPUtil.getParameter(request, "skd_voy_no      		".trim(), length));
			String[] skd_dir_cd       =  (JSPUtil.getParameter(request, "skd_dir_cd      		".trim(), length));
			String[] port_cd          =  (JSPUtil.getParameter(request, "port_cd         		".trim(), length));
			String[] curr_cd          =  (JSPUtil.getParameter(request, "curr_cd         		".trim(), length));
			String[] svc_scp_cd       =  (JSPUtil.getParameter(request, "svc_scp_cd      		".trim(), length));
			String[] io_bnd_cd        =  (JSPUtil.getParameter(request, "io_bnd_cd       		".trim(), length));
			String[] to_curr_cd       =  (JSPUtil.getParameter(request, "to_curr_cd      		".trim(), length));
			String[] ofc_cd           =  (JSPUtil.getParameter(request, "ofc_cd          		".trim(), length));
			String[] usd_locl_xch_rt  =  (JSPUtil.getParameter(request, "usd_locl_xch_rt 		".trim(), length));
			String[] usd_euro_xch_rt  =  (JSPUtil.getParameter(request, "usd_euro_xch_rt 		".trim(), length));
			String[] euro_locl_xch_rt =  (JSPUtil.getParameter(request, "euro_locl_xch_rt		".trim(), length));
			String[] vvd_aply_dt      =  (JSPUtil.getParameter(request, "vvd_aply_dt     		".trim(), length));
			String[] delt_flg         =  (JSPUtil.getParameter(request, "delt_flg        		".trim(), length));
			String[] cre_usr_id       =  (JSPUtil.getParameter(request, "cre_usr_id      		".trim(), length));
			String[] cre_dt           =  (JSPUtil.getParameter(request, "cre_dt          		".trim(), length));
			String[] eai_evnt_dt      =  (JSPUtil.getParameter(request, "eai_evnt_dt     		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new AR_VVD_XCH_RT();
				model.setIbflag          		  (ibflag          	[i]);
				model.setPage_rows       		  (page_rows       	[i]);
				model.setVsl_cd          		  (vsl_cd          	[i]);
				model.setSkd_voy_no      		  (skd_voy_no      	[i]);
				model.setSkd_dir_cd      		  (skd_dir_cd      	[i]);
				model.setPort_cd         		  (port_cd         	[i]);
				model.setCurr_cd         		  (curr_cd         	[i]);
				model.setSvc_scp_cd      		  (svc_scp_cd      	[i]);
				model.setIo_bnd_cd       		  (io_bnd_cd       	[i]);
				model.setTo_curr_cd      		  (to_curr_cd      	[i]);
				model.setOfc_cd          		  (ofc_cd          	[i]);
				model.setUsd_locl_xch_rt 		  (usd_locl_xch_rt 	[i]);
				model.setUsd_euro_xch_rt 		  (usd_euro_xch_rt 	[i]);
				model.setEuro_locl_xch_rt		  (euro_locl_xch_rt	[i]);
				model.setVvd_aply_dt     		  (vvd_aply_dt     	[i]);
				model.setDelt_flg        		  (delt_flg        	[i]);
				model.setCre_usr_id      		  (cre_usr_id      	[i]);
				model.setCre_dt          		  (cre_dt          	[i]);
				model.setEai_evnt_dt     		  (eai_evnt_dt     	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		AR_VVD_XCH_RT model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag           =  (JSPUtil.getParameter(request, prefix + "ibflag          		".trim(), length));
			String[] page_rows        =  (JSPUtil.getParameter(request, prefix + "page_rows       		".trim(), length));
			String[] vsl_cd           =  (JSPUtil.getParameter(request, prefix + "vsl_cd          		".trim(), length));
			String[] skd_voy_no       =  (JSPUtil.getParameter(request, prefix + "skd_voy_no      		".trim(), length));
			String[] skd_dir_cd       =  (JSPUtil.getParameter(request, prefix + "skd_dir_cd      		".trim(), length));
			String[] port_cd          =  (JSPUtil.getParameter(request, prefix + "port_cd         		".trim(), length));
			String[] curr_cd          =  (JSPUtil.getParameter(request, prefix + "curr_cd         		".trim(), length));
			String[] svc_scp_cd       =  (JSPUtil.getParameter(request, prefix + "svc_scp_cd      		".trim(), length));
			String[] io_bnd_cd        =  (JSPUtil.getParameter(request, prefix + "io_bnd_cd       		".trim(), length));
			String[] to_curr_cd       =  (JSPUtil.getParameter(request, prefix + "to_curr_cd      		".trim(), length));
			String[] ofc_cd           =  (JSPUtil.getParameter(request, prefix + "ofc_cd          		".trim(), length));
			String[] usd_locl_xch_rt  =  (JSPUtil.getParameter(request, prefix + "usd_locl_xch_rt 		".trim(), length));
			String[] usd_euro_xch_rt  =  (JSPUtil.getParameter(request, prefix + "usd_euro_xch_rt 		".trim(), length));
			String[] euro_locl_xch_rt =  (JSPUtil.getParameter(request, prefix + "euro_locl_xch_rt		".trim(), length));
			String[] vvd_aply_dt      =  (JSPUtil.getParameter(request, prefix + "vvd_aply_dt     		".trim(), length));
			String[] delt_flg         =  (JSPUtil.getParameter(request, prefix + "delt_flg        		".trim(), length));
			String[] cre_usr_id       =  (JSPUtil.getParameter(request, prefix + "cre_usr_id      		".trim(), length));
			String[] cre_dt           =  (JSPUtil.getParameter(request, prefix + "cre_dt          		".trim(), length));
			String[] eai_evnt_dt      =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt     		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new AR_VVD_XCH_RT();
				model.setIbflag          		  ( ibflag          	[i]);
				model.setPage_rows       		  ( page_rows       	[i]);
				model.setVsl_cd          		  ( vsl_cd          	[i]);
				model.setSkd_voy_no      		  ( skd_voy_no      	[i]);
				model.setSkd_dir_cd      		  ( skd_dir_cd      	[i]);
				model.setPort_cd         		  ( port_cd         	[i]);
				model.setCurr_cd         		  ( curr_cd         	[i]);
				model.setSvc_scp_cd      		  ( svc_scp_cd      	[i]);
				model.setIo_bnd_cd       		  ( io_bnd_cd       	[i]);
				model.setTo_curr_cd      		  ( to_curr_cd      	[i]);
				model.setOfc_cd          		  ( ofc_cd          	[i]);
				model.setUsd_locl_xch_rt 		  ( usd_locl_xch_rt 	[i]);
				model.setUsd_euro_xch_rt 		  ( usd_euro_xch_rt 	[i]);
				model.setEuro_locl_xch_rt		  ( euro_locl_xch_rt	[i]);
				model.setVvd_aply_dt     		  ( vvd_aply_dt     	[i]);
				model.setDelt_flg        		  ( delt_flg        	[i]);
				model.setCre_usr_id      		  ( cre_usr_id      	[i]);
				model.setCre_dt          		  ( cre_dt          	[i]);
				model.setEai_evnt_dt     		  ( eai_evnt_dt     	[i]);
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
