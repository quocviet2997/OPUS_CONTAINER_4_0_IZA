/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : MDM_ZONE.java
*@FileTitle : 사용자 관리5
*Open Issues :
*Change history :
*@LastModifyDate : 2007-01-12
*@LastModifier : Kildong_hong6
*@LastVersion : 1.0
* 2007-01-12 Kildong_hong6
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
public final class MdmZone implements java.io.Serializable {

	private String          ibflag          = "";
	private String          page_rows       = "";
	private String          zn_cd           = "";
	private String          zn_nm           = "";
	private String          rep_zn_flg      = "";
	private String          rep_yd_cd       = "";
	private String          tztm_hrs        = "";
	private String          cgo_hndl_tm_hrs = "";
	private String          loc_cd          = "";
	private String          lnk_dist        = "";
	private String          dist_ut_cd      = "";
	private String          cre_usr_id      = "";
	private String          cre_dt          = "";
	private String          upd_usr_id      = "";
	private String          upd_dt          = "";
	private String          delt_flg        = "";
	private String          eai_evnt_dt     = "";

	public MdmZone(){}

	public MdmZone(
			String          ibflag         ,
			String          page_rows      ,
			String          zn_cd          ,
			String          zn_nm          ,
			String          rep_zn_flg     ,
			String          rep_yd_cd      ,
			String          tztm_hrs       ,
			String          cgo_hndl_tm_hrs,
			String          loc_cd         ,
			String          lnk_dist       ,
			String          dist_ut_cd     ,
			String          cre_usr_id     ,
			String          cre_dt         ,
			String          upd_usr_id     ,
			String          upd_dt         ,
			String          delt_flg       ,
			String          eai_evnt_dt    ){
		this.ibflag          = ibflag         ;
		this.page_rows       = page_rows      ;
		this.zn_cd           = zn_cd          ;
		this.zn_nm           = zn_nm          ;
		this.rep_zn_flg      = rep_zn_flg     ;
		this.rep_yd_cd       = rep_yd_cd      ;
		this.tztm_hrs        = tztm_hrs       ;
		this.cgo_hndl_tm_hrs = cgo_hndl_tm_hrs;
		this.loc_cd          = loc_cd         ;
		this.lnk_dist        = lnk_dist       ;
		this.dist_ut_cd      = dist_ut_cd     ;
		this.cre_usr_id      = cre_usr_id     ;
		this.cre_dt          = cre_dt         ;
		this.upd_usr_id      = upd_usr_id     ;
		this.upd_dt          = upd_dt         ;
		this.delt_flg        = delt_flg       ;
		this.eai_evnt_dt     = eai_evnt_dt    ;
	}

	// getter method is proceeding ..
	public String          getIbflag         (){	return ibflag         	;	}
	public String          getPage_rows      (){	return page_rows      	;	}
	public String          getZn_cd          (){	return zn_cd          	;	}
	public String          getZn_nm          (){	return zn_nm          	;	}
	public String          getRep_zn_flg     (){	return rep_zn_flg     	;	}
	public String          getRep_yd_cd      (){	return rep_yd_cd      	;	}
	public String          getTztm_hrs       (){	return tztm_hrs       	;	}
	public String          getCgo_hndl_tm_hrs(){	return cgo_hndl_tm_hrs	;	}
	public String          getLoc_cd         (){	return loc_cd         	;	}
	public String          getLnk_dist       (){	return lnk_dist       	;	}
	public String          getDist_ut_cd     (){	return dist_ut_cd     	;	}
	public String          getCre_usr_id     (){	return cre_usr_id     	;	}
	public String          getCre_dt         (){	return cre_dt         	;	}
	public String          getUpd_usr_id     (){	return upd_usr_id     	;	}
	public String          getUpd_dt         (){	return upd_dt         	;	}
	public String          getDelt_flg       (){	return delt_flg       	;	}
	public String          getEai_evnt_dt    (){	return eai_evnt_dt    	;	}

	// setter method is proceeding ..
	public void setIbflag         ( String          ibflag          ){	this.ibflag          = ibflag         	;	}
	public void setPage_rows      ( String          page_rows       ){	this.page_rows       = page_rows      	;	}
	public void setZn_cd          ( String          zn_cd           ){	this.zn_cd           = zn_cd          	;	}
	public void setZn_nm          ( String          zn_nm           ){	this.zn_nm           = zn_nm          	;	}
	public void setRep_zn_flg     ( String          rep_zn_flg      ){	this.rep_zn_flg      = rep_zn_flg     	;	}
	public void setRep_yd_cd      ( String          rep_yd_cd       ){	this.rep_yd_cd       = rep_yd_cd      	;	}
	public void setTztm_hrs       ( String          tztm_hrs        ){	this.tztm_hrs        = tztm_hrs       	;	}
	public void setCgo_hndl_tm_hrs( String          cgo_hndl_tm_hrs ){	this.cgo_hndl_tm_hrs = cgo_hndl_tm_hrs	;	}
	public void setLoc_cd         ( String          loc_cd          ){	this.loc_cd          = loc_cd         	;	}
	public void setLnk_dist       ( String          lnk_dist        ){	this.lnk_dist        = lnk_dist       	;	}
	public void setDist_ut_cd     ( String          dist_ut_cd      ){	this.dist_ut_cd      = dist_ut_cd     	;	}
	public void setCre_usr_id     ( String          cre_usr_id      ){	this.cre_usr_id      = cre_usr_id     	;	}
	public void setCre_dt         ( String          cre_dt          ){	this.cre_dt          = cre_dt         	;	}
	public void setUpd_usr_id     ( String          upd_usr_id      ){	this.upd_usr_id      = upd_usr_id     	;	}
	public void setUpd_dt         ( String          upd_dt          ){	this.upd_dt          = upd_dt         	;	}
	public void setDelt_flg       ( String          delt_flg        ){	this.delt_flg        = delt_flg       	;	}
	public void setEai_evnt_dt    ( String          eai_evnt_dt     ){	this.eai_evnt_dt     = eai_evnt_dt    	;	}

	public static MdmZone fromRequest(HttpServletRequest request) {
		MdmZone model = new MdmZone();
		try {
			model.setIbflag         	(JSPUtil.getParameter(request, "ibflag         		".trim(), ""));
			model.setPage_rows      	(JSPUtil.getParameter(request, "page_rows      		".trim(), ""));
			model.setZn_cd          	(JSPUtil.getParameter(request, "zn_cd          		".trim(), ""));
			model.setZn_nm          	(JSPUtil.getParameter(request, "zn_nm          		".trim(), ""));
			model.setRep_zn_flg     	(JSPUtil.getParameter(request, "rep_zn_flg     		".trim(), ""));
			model.setRep_yd_cd      	(JSPUtil.getParameter(request, "rep_yd_cd      		".trim(), ""));
			model.setTztm_hrs       	(JSPUtil.getParameter(request, "tztm_hrs       		".trim(), ""));
			model.setCgo_hndl_tm_hrs	(JSPUtil.getParameter(request, "cgo_hndl_tm_hrs		".trim(), ""));
			model.setLoc_cd         	(JSPUtil.getParameter(request, "loc_cd         		".trim(), ""));
			model.setLnk_dist       	(JSPUtil.getParameter(request, "lnk_dist       		".trim(), ""));
			model.setDist_ut_cd     	(JSPUtil.getParameter(request, "dist_ut_cd     		".trim(), ""));
			model.setCre_usr_id     	(JSPUtil.getParameter(request, "cre_usr_id     		".trim(), ""));
			model.setCre_dt         	(JSPUtil.getParameter(request, "cre_dt         		".trim(), ""));
			model.setUpd_usr_id     	(JSPUtil.getParameter(request, "upd_usr_id     		".trim(), ""));
			model.setUpd_dt         	(JSPUtil.getParameter(request, "upd_dt         		".trim(), ""));
			model.setDelt_flg       	(JSPUtil.getParameter(request, "delt_flg       		".trim(), ""));
			model.setEai_evnt_dt    	(JSPUtil.getParameter(request, "eai_evnt_dt    		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		MdmZone model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag          =  (JSPUtil.getParameter(request, "ibflag         		".trim(), length));
			String[] page_rows       =  (JSPUtil.getParameter(request, "page_rows      		".trim(), length));
			String[] zn_cd           =  (JSPUtil.getParameter(request, "zn_cd          		".trim(), length));
			String[] zn_nm           =  (JSPUtil.getParameter(request, "zn_nm          		".trim(), length));
			String[] rep_zn_flg      =  (JSPUtil.getParameter(request, "rep_zn_flg     		".trim(), length));
			String[] rep_yd_cd       =  (JSPUtil.getParameter(request, "rep_yd_cd      		".trim(), length));
			String[] tztm_hrs        =  (JSPUtil.getParameter(request, "tztm_hrs       		".trim(), length));
			String[] cgo_hndl_tm_hrs =  (JSPUtil.getParameter(request, "cgo_hndl_tm_hrs		".trim(), length));
			String[] loc_cd          =  (JSPUtil.getParameter(request, "loc_cd         		".trim(), length));
			String[] lnk_dist        =  (JSPUtil.getParameter(request, "lnk_dist       		".trim(), length));
			String[] dist_ut_cd      =  (JSPUtil.getParameter(request, "dist_ut_cd     		".trim(), length));
			String[] cre_usr_id      =  (JSPUtil.getParameter(request, "cre_usr_id     		".trim(), length));
			String[] cre_dt          =  (JSPUtil.getParameter(request, "cre_dt         		".trim(), length));
			String[] upd_usr_id      =  (JSPUtil.getParameter(request, "upd_usr_id     		".trim(), length));
			String[] upd_dt          =  (JSPUtil.getParameter(request, "upd_dt         		".trim(), length));
			String[] delt_flg        =  (JSPUtil.getParameter(request, "delt_flg       		".trim(), length));
			String[] eai_evnt_dt     =  (JSPUtil.getParameter(request, "eai_evnt_dt    		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new MdmZone();
				model.setIbflag         		  (ibflag         	[i]);
				model.setPage_rows      		  (page_rows      	[i]);
				model.setZn_cd          		  (zn_cd          	[i]);
				model.setZn_nm          		  (zn_nm          	[i]);
				model.setRep_zn_flg     		  (rep_zn_flg     	[i]);
				model.setRep_yd_cd      		  (rep_yd_cd      	[i]);
				model.setTztm_hrs       		  (tztm_hrs       	[i]);
				model.setCgo_hndl_tm_hrs		  (cgo_hndl_tm_hrs	[i]);
				model.setLoc_cd         		  (loc_cd         	[i]);
				model.setLnk_dist       		  (lnk_dist       	[i]);
				model.setDist_ut_cd     		  (dist_ut_cd     	[i]);
				model.setCre_usr_id     		  (cre_usr_id     	[i]);
				model.setCre_dt         		  (cre_dt         	[i]);
				model.setUpd_usr_id     		  (upd_usr_id     	[i]);
				model.setUpd_dt         		  (upd_dt         	[i]);
				model.setDelt_flg       		  (delt_flg       	[i]);
				model.setEai_evnt_dt    		  (eai_evnt_dt    	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		MdmZone model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag          =  (JSPUtil.getParameter(request, prefix + "ibflag         		".trim(), length));
			String[] page_rows       =  (JSPUtil.getParameter(request, prefix + "page_rows      		".trim(), length));
			String[] zn_cd           =  (JSPUtil.getParameter(request, prefix + "zn_cd          		".trim(), length));
			String[] zn_nm           =  (JSPUtil.getParameter(request, prefix + "zn_nm          		".trim(), length));
			String[] rep_zn_flg      =  (JSPUtil.getParameter(request, prefix + "rep_zn_flg     		".trim(), length));
			String[] rep_yd_cd       =  (JSPUtil.getParameter(request, prefix + "rep_yd_cd      		".trim(), length));
			String[] tztm_hrs        =  (JSPUtil.getParameter(request, prefix + "tztm_hrs       		".trim(), length));
			String[] cgo_hndl_tm_hrs =  (JSPUtil.getParameter(request, prefix + "cgo_hndl_tm_hrs		".trim(), length));
			String[] loc_cd          =  (JSPUtil.getParameter(request, prefix + "loc_cd         		".trim(), length));
			String[] lnk_dist        =  (JSPUtil.getParameter(request, prefix + "lnk_dist       		".trim(), length));
			String[] dist_ut_cd      =  (JSPUtil.getParameter(request, prefix + "dist_ut_cd     		".trim(), length));
			String[] cre_usr_id      =  (JSPUtil.getParameter(request, prefix + "cre_usr_id     		".trim(), length));
			String[] cre_dt          =  (JSPUtil.getParameter(request, prefix + "cre_dt         		".trim(), length));
			String[] upd_usr_id      =  (JSPUtil.getParameter(request, prefix + "upd_usr_id     		".trim(), length));
			String[] upd_dt          =  (JSPUtil.getParameter(request, prefix + "upd_dt         		".trim(), length));
			String[] delt_flg        =  (JSPUtil.getParameter(request, prefix + "delt_flg       		".trim(), length));
			String[] eai_evnt_dt     =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt    		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new MdmZone();
				model.setIbflag         		  ( ibflag         	[i]);
				model.setPage_rows      		  ( page_rows      	[i]);
				model.setZn_cd          		  ( zn_cd          	[i]);
				model.setZn_nm          		  ( zn_nm          	[i]);
				model.setRep_zn_flg     		  ( rep_zn_flg     	[i]);
				model.setRep_yd_cd      		  ( rep_yd_cd      	[i]);
				model.setTztm_hrs       		  ( tztm_hrs       	[i]);
				model.setCgo_hndl_tm_hrs		  ( cgo_hndl_tm_hrs	[i]);
				model.setLoc_cd         		  ( loc_cd         	[i]);
				model.setLnk_dist       		  ( lnk_dist       	[i]);
				model.setDist_ut_cd     		  ( dist_ut_cd     	[i]);
				model.setCre_usr_id     		  ( cre_usr_id     	[i]);
				model.setCre_dt         		  ( cre_dt         	[i]);
				model.setUpd_usr_id     		  ( upd_usr_id     	[i]);
				model.setUpd_dt         		  ( upd_dt         	[i]);
				model.setDelt_flg       		  ( delt_flg       	[i]);
				model.setEai_evnt_dt    		  ( eai_evnt_dt    	[i]);
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
