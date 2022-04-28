/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : TRS_BLCK_STWG_GRP.java
*@FileTitle : Adding Surcharge Agreement
*Open Issues :
*Change history :
*@LastModifyDate : 2007-05-22
*@LastModifier : agreement
*@LastVersion : 1.0
* 2007-05-22 agreement
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
 * @author agreement
 * @since J2EE 1.4
 */
public final class TrsBlckStwgGrpVO implements java.io.Serializable {

	private String                ibflag                = "";
	private String                page_rows             = "";
	private String                blck_stwg_port_cd     = "";
	private String                blck_stwg_dest_loc_cd = "";
	private String                blck_stwg_hub_loc_cd  = "";
	private String                blck_stwg_grp_cd      = "";
	private String                blck_stwg_cd          = "";
	private String                blck_stwg_ofc_cd      = "";
	private String                cre_usr_id            = "";
	private String                cre_dt                = "";
	private String                eai_evnt_dt           = "";

	public TrsBlckStwgGrpVO(){}

	public TrsBlckStwgGrpVO(
			String                ibflag               ,
			String                page_rows            ,
			String                blck_stwg_port_cd    ,
			String                blck_stwg_dest_loc_cd,
			String                blck_stwg_hub_loc_cd ,
			String                blck_stwg_grp_cd     ,
			String                blck_stwg_cd         ,
			String                blck_stwg_ofc_cd     ,
			String                cre_usr_id           ,
			String                cre_dt               ,
			String                eai_evnt_dt          ){
		this.ibflag                = ibflag               ;
		this.page_rows             = page_rows            ;
		this.blck_stwg_port_cd     = blck_stwg_port_cd    ;
		this.blck_stwg_dest_loc_cd = blck_stwg_dest_loc_cd;
		this.blck_stwg_hub_loc_cd  = blck_stwg_hub_loc_cd ;
		this.blck_stwg_grp_cd      = blck_stwg_grp_cd     ;
		this.blck_stwg_cd          = blck_stwg_cd         ;
		this.blck_stwg_ofc_cd      = blck_stwg_ofc_cd     ;
		this.cre_usr_id            = cre_usr_id           ;
		this.cre_dt                = cre_dt               ;
		this.eai_evnt_dt           = eai_evnt_dt          ;
	}

	// getter method is proceeding ..
	public String                getIbflag               (){	return ibflag               	;	}
	public String                getPage_rows            (){	return page_rows            	;	}
	public String                getBlck_stwg_port_cd    (){	return blck_stwg_port_cd    	;	}
	public String                getBlck_stwg_dest_loc_cd(){	return blck_stwg_dest_loc_cd	;	}
	public String                getBlck_stwg_hub_loc_cd (){	return blck_stwg_hub_loc_cd 	;	}
	public String                getBlck_stwg_grp_cd     (){	return blck_stwg_grp_cd     	;	}
	public String                getBlck_stwg_cd         (){	return blck_stwg_cd         	;	}
	public String                getBlck_stwg_ofc_cd     (){	return blck_stwg_ofc_cd     	;	}
	public String                getCre_usr_id           (){	return cre_usr_id           	;	}
	public String                getCre_dt               (){	return cre_dt               	;	}
	public String                getEai_evnt_dt          (){	return eai_evnt_dt          	;	}

	// setter method is proceeding ..
	public void setIbflag               ( String                ibflag                ){	this.ibflag                = ibflag               	;	}
	public void setPage_rows            ( String                page_rows             ){	this.page_rows             = page_rows            	;	}
	public void setBlck_stwg_port_cd    ( String                blck_stwg_port_cd     ){	this.blck_stwg_port_cd     = blck_stwg_port_cd    	;	}
	public void setBlck_stwg_dest_loc_cd( String                blck_stwg_dest_loc_cd ){	this.blck_stwg_dest_loc_cd = blck_stwg_dest_loc_cd	;	}
	public void setBlck_stwg_hub_loc_cd ( String                blck_stwg_hub_loc_cd  ){	this.blck_stwg_hub_loc_cd  = blck_stwg_hub_loc_cd 	;	}
	public void setBlck_stwg_grp_cd     ( String                blck_stwg_grp_cd      ){	this.blck_stwg_grp_cd      = blck_stwg_grp_cd     	;	}
	public void setBlck_stwg_cd         ( String                blck_stwg_cd          ){	this.blck_stwg_cd          = blck_stwg_cd         	;	}
	public void setBlck_stwg_ofc_cd     ( String                blck_stwg_ofc_cd      ){	this.blck_stwg_ofc_cd      = blck_stwg_ofc_cd     	;	}
	public void setCre_usr_id           ( String                cre_usr_id            ){	this.cre_usr_id            = cre_usr_id           	;	}
	public void setCre_dt               ( String                cre_dt                ){	this.cre_dt                = cre_dt               	;	}
	public void setEai_evnt_dt          ( String                eai_evnt_dt           ){	this.eai_evnt_dt           = eai_evnt_dt          	;	}

	public static TrsBlckStwgGrpVO fromRequest(HttpServletRequest request) {
		TrsBlckStwgGrpVO model = new TrsBlckStwgGrpVO();
		try {
			model.setIbflag               	(JSPUtil.getParameter(request, "ibflag               		".trim(), ""));
			model.setPage_rows            	(JSPUtil.getParameter(request, "page_rows            		".trim(), ""));
			model.setBlck_stwg_port_cd    	(JSPUtil.getParameter(request, "blck_stwg_port_cd    		".trim(), ""));
			model.setBlck_stwg_dest_loc_cd	(JSPUtil.getParameter(request, "blck_stwg_dest_loc_cd		".trim(), ""));
			model.setBlck_stwg_hub_loc_cd 	(JSPUtil.getParameter(request, "blck_stwg_hub_loc_cd 		".trim(), ""));
			model.setBlck_stwg_grp_cd     	(JSPUtil.getParameter(request, "blck_stwg_grp_cd     		".trim(), ""));
			model.setBlck_stwg_cd         	(JSPUtil.getParameter(request, "blck_stwg_cd         		".trim(), ""));
			model.setBlck_stwg_ofc_cd     	(JSPUtil.getParameter(request, "blck_stwg_ofc_cd     		".trim(), ""));
			model.setCre_usr_id           	(JSPUtil.getParameter(request, "cre_usr_id           		".trim(), ""));
			model.setCre_dt               	(JSPUtil.getParameter(request, "cre_dt               		".trim(), ""));
			model.setEai_evnt_dt          	(JSPUtil.getParameter(request, "eai_evnt_dt          		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		TrsBlckStwgGrpVO model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag                =  (JSPUtil.getParameter(request, "ibflag               		".trim(), length));
			String[] page_rows             =  (JSPUtil.getParameter(request, "page_rows            		".trim(), length));
			String[] blck_stwg_port_cd     =  (JSPUtil.getParameter(request, "blck_stwg_port_cd    		".trim(), length));
			String[] blck_stwg_dest_loc_cd =  (JSPUtil.getParameter(request, "blck_stwg_dest_loc_cd		".trim(), length));
			String[] blck_stwg_hub_loc_cd  =  (JSPUtil.getParameter(request, "blck_stwg_hub_loc_cd 		".trim(), length));
			String[] blck_stwg_grp_cd      =  (JSPUtil.getParameter(request, "blck_stwg_grp_cd     		".trim(), length));
			String[] blck_stwg_cd          =  (JSPUtil.getParameter(request, "blck_stwg_cd         		".trim(), length));
			String[] blck_stwg_ofc_cd      =  (JSPUtil.getParameter(request, "blck_stwg_ofc_cd     		".trim(), length));
			String[] cre_usr_id            =  (JSPUtil.getParameter(request, "cre_usr_id           		".trim(), length));
			String[] cre_dt                =  (JSPUtil.getParameter(request, "cre_dt               		".trim(), length));
			String[] eai_evnt_dt           =  (JSPUtil.getParameter(request, "eai_evnt_dt          		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new TrsBlckStwgGrpVO();
				model.setIbflag               		  (ibflag               	[i]);
				model.setPage_rows            		  (page_rows            	[i]);
				model.setBlck_stwg_port_cd    		  (blck_stwg_port_cd    	[i]);
				model.setBlck_stwg_dest_loc_cd		  (blck_stwg_dest_loc_cd	[i]);
				model.setBlck_stwg_hub_loc_cd 		  (blck_stwg_hub_loc_cd 	[i]);
				model.setBlck_stwg_grp_cd     		  (blck_stwg_grp_cd     	[i]);
				model.setBlck_stwg_cd         		  (blck_stwg_cd         	[i]);
				model.setBlck_stwg_ofc_cd     		  (blck_stwg_ofc_cd     	[i]);
				model.setCre_usr_id           		  (cre_usr_id           	[i]);
				model.setCre_dt               		  (cre_dt               	[i]);
				model.setEai_evnt_dt          		  (eai_evnt_dt          	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		TrsBlckStwgGrpVO model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag                =  (JSPUtil.getParameter(request, prefix + "ibflag               		".trim(), length));
			String[] page_rows             =  (JSPUtil.getParameter(request, prefix + "page_rows            		".trim(), length));
			String[] blck_stwg_port_cd     =  (JSPUtil.getParameter(request, prefix + "blck_stwg_port_cd    		".trim(), length));
			String[] blck_stwg_dest_loc_cd =  (JSPUtil.getParameter(request, prefix + "blck_stwg_dest_loc_cd		".trim(), length));
			String[] blck_stwg_hub_loc_cd  =  (JSPUtil.getParameter(request, prefix + "blck_stwg_hub_loc_cd 		".trim(), length));
			String[] blck_stwg_grp_cd      =  (JSPUtil.getParameter(request, prefix + "blck_stwg_grp_cd     		".trim(), length));
			String[] blck_stwg_cd          =  (JSPUtil.getParameter(request, prefix + "blck_stwg_cd         		".trim(), length));
			String[] blck_stwg_ofc_cd      =  (JSPUtil.getParameter(request, prefix + "blck_stwg_ofc_cd     		".trim(), length));
			String[] cre_usr_id            =  (JSPUtil.getParameter(request, prefix + "cre_usr_id           		".trim(), length));
			String[] cre_dt                =  (JSPUtil.getParameter(request, prefix + "cre_dt               		".trim(), length));
			String[] eai_evnt_dt           =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt          		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new TrsBlckStwgGrpVO();
				model.setIbflag               		  ( ibflag               	[i]);
				model.setPage_rows            		  ( page_rows            	[i]);
				model.setBlck_stwg_port_cd    		  ( blck_stwg_port_cd    	[i]);
				model.setBlck_stwg_dest_loc_cd		  ( blck_stwg_dest_loc_cd	[i]);
				model.setBlck_stwg_hub_loc_cd 		  ( blck_stwg_hub_loc_cd 	[i]);
				model.setBlck_stwg_grp_cd     		  ( blck_stwg_grp_cd     	[i]);
				model.setBlck_stwg_cd         		  ( blck_stwg_cd         	[i]);
				model.setBlck_stwg_ofc_cd     		  ( blck_stwg_ofc_cd     	[i]);
				model.setCre_usr_id           		  ( cre_usr_id           	[i]);
				model.setCre_dt               		  ( cre_dt               	[i]);
				model.setEai_evnt_dt          		  ( eai_evnt_dt          	[i]);
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
