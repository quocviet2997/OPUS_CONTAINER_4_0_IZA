/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : TRS_TRSP_OFC_EXPT_RULE.java
*@FileTitle : Control Office Exception Case Creation
*Open Issues :
*Change history :
*@LastModifyDate : 2006-09-27
*@LastModifier : poong
*@LastVersion : 1.0
* 2006-09-27 poong
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
 * @author poong
 * @since J2EE 1.4
 */
public final class TrsTrspOfcExptRule2VO implements java.io.Serializable {

	private String          ibflag          = "";
	private String          page_rows       = "";
	private String          fm_nod_cd       = "";
	private String          to_nod_cd       = "";
	private String          via_nod_cd      = "";
	private String          dor_nod_cd      = "";
	private String          ctrl_ofc_div_cd = "";
	private String          ctrl_ofc_cd     = "";
	private String          delt_flg        = "";
	private String          cre_ofc_cd      = "";
	private String          cre_usr_id      = "";
	private String          cre_dt          = "";
	private String          upd_usr_id      = "";
	private String          upd_dt          = "";
	private String          delt_usr_id     = "";
	private String          delt_dt         = "";

	public TrsTrspOfcExptRule2VO(){}

	public TrsTrspOfcExptRule2VO(
			String          ibflag         ,
			String          page_rows      ,
			String          fm_nod_cd      ,
			String          to_nod_cd      ,
			String          via_nod_cd     ,
			String          dor_nod_cd     ,
			String          ctrl_ofc_div_cd,
			String          ctrl_ofc_cd    ,
			String          delt_flg       ,
			String          cre_ofc_cd     ,
			String          cre_usr_id     ,
			String          cre_dt         ,
			String          upd_usr_id     ,
			String          upd_dt         ,
			String          delt_usr_id    ,
			String          delt_dt        ){
		this.ibflag          = ibflag         ;
		this.page_rows       = page_rows      ;
		this.fm_nod_cd       = fm_nod_cd      ;
		this.to_nod_cd       = to_nod_cd      ;
		this.via_nod_cd      = via_nod_cd     ;
		this.dor_nod_cd      = dor_nod_cd     ;
		this.ctrl_ofc_div_cd = ctrl_ofc_div_cd;
		this.ctrl_ofc_cd     = ctrl_ofc_cd    ;
		this.delt_flg        = delt_flg       ;
		this.cre_ofc_cd      = cre_ofc_cd     ;
		this.cre_usr_id      = cre_usr_id     ;
		this.cre_dt          = cre_dt         ;
		this.upd_usr_id      = upd_usr_id     ;
		this.upd_dt          = upd_dt         ;
		this.delt_usr_id     = delt_usr_id    ;
		this.delt_dt         = delt_dt        ;
	}

	// getter method is proceeding ..
	public String          getIbflag         (){	return ibflag         	;	}
	public String          getPage_rows      (){	return page_rows      	;	}
	public String          getFm_nod_cd      (){	return fm_nod_cd      	;	}
	public String          getTo_nod_cd      (){	return to_nod_cd      	;	}
	public String          getVia_nod_cd     (){	return via_nod_cd     	;	}
	public String          getDor_nod_cd     (){	return dor_nod_cd     	;	}
	public String          getCtrl_ofc_div_cd(){	return ctrl_ofc_div_cd	;	}
	public String          getCtrl_ofc_cd    (){	return ctrl_ofc_cd    	;	}
	public String          getDelt_flg       (){	return delt_flg       	;	}
	public String          getCre_ofc_cd     (){	return cre_ofc_cd     	;	}
	public String          getCre_usr_id     (){	return cre_usr_id     	;	}
	public String          getCre_dt         (){	return cre_dt         	;	}
	public String          getUpd_usr_id     (){	return upd_usr_id     	;	}
	public String          getUpd_dt         (){	return upd_dt         	;	}
	public String          getDelt_usr_id    (){	return delt_usr_id    	;	}
	public String          getDelt_dt        (){	return delt_dt        	;	}

	// setter method is proceeding ..
	public void setIbflag         ( String          ibflag          ){	this.ibflag          = ibflag         	;	}
	public void setPage_rows      ( String          page_rows       ){	this.page_rows       = page_rows      	;	}
	public void setFm_nod_cd      ( String          fm_nod_cd       ){	this.fm_nod_cd       = fm_nod_cd      	;	}
	public void setTo_nod_cd      ( String          to_nod_cd       ){	this.to_nod_cd       = to_nod_cd      	;	}
	public void setVia_nod_cd     ( String          via_nod_cd      ){	this.via_nod_cd      = via_nod_cd     	;	}
	public void setDor_nod_cd     ( String          dor_nod_cd      ){	this.dor_nod_cd      = dor_nod_cd     	;	}
	public void setCtrl_ofc_div_cd( String          ctrl_ofc_div_cd ){	this.ctrl_ofc_div_cd = ctrl_ofc_div_cd	;	}
	public void setCtrl_ofc_cd    ( String          ctrl_ofc_cd     ){	this.ctrl_ofc_cd     = ctrl_ofc_cd    	;	}
	public void setDelt_flg       ( String          delt_flg        ){	this.delt_flg        = delt_flg       	;	}
	public void setCre_ofc_cd     ( String          cre_ofc_cd      ){	this.cre_ofc_cd      = cre_ofc_cd     	;	}
	public void setCre_usr_id     ( String          cre_usr_id      ){	this.cre_usr_id      = cre_usr_id     	;	}
	public void setCre_dt         ( String          cre_dt          ){	this.cre_dt          = cre_dt         	;	}
	public void setUpd_usr_id     ( String          upd_usr_id      ){	this.upd_usr_id      = upd_usr_id     	;	}
	public void setUpd_dt         ( String          upd_dt          ){	this.upd_dt          = upd_dt         	;	}
	public void setDelt_usr_id    ( String          delt_usr_id     ){	this.delt_usr_id     = delt_usr_id    	;	}
	public void setDelt_dt        ( String          delt_dt         ){	this.delt_dt         = delt_dt        	;	}

	public static TrsTrspOfcExptRule2VO fromRequest(HttpServletRequest request) {
		TrsTrspOfcExptRule2VO model = new TrsTrspOfcExptRule2VO();
		try {
			model.setIbflag         	(JSPUtil.getParameter(request, "ibflag         		".trim(), ""));
			model.setPage_rows      	(JSPUtil.getParameter(request, "page_rows      		".trim(), ""));
			model.setFm_nod_cd      	(JSPUtil.getParameter(request, "fm_loc_value   		".trim(), "")+JSPUtil.getParameter(request, "fm_yard_value      		".trim(), ""));
			model.setTo_nod_cd      	(JSPUtil.getParameter(request, "to_loc_value  		".trim(), "")+JSPUtil.getParameter(request, "to_yard_value      		".trim(), ""));
			model.setVia_nod_cd     	(JSPUtil.getParameter(request, "via_loc_value  		".trim(), "")+JSPUtil.getParameter(request, "via_yard_value      		".trim(), ""));
			model.setDor_nod_cd     	(JSPUtil.getParameter(request, "dor_loc_value  		".trim(), "")+JSPUtil.getParameter(request, "dor_yard_value      		".trim(), ""));
			model.setCtrl_ofc_div_cd	(JSPUtil.getParameter(request, "ctrl_ofc_div_cd		".trim(), ""));
			model.setCtrl_ofc_cd    	(JSPUtil.getParameter(request, "ctrl_ofc_cd    		".trim(), ""));
			model.setDelt_flg       	(JSPUtil.getParameter(request, "delt_flg       		".trim(), ""));
			model.setCre_ofc_cd     	(JSPUtil.getParameter(request, "cre_ofc_cd     		".trim(), ""));
			model.setCre_usr_id     	(JSPUtil.getParameter(request, "cre_usr_id     		".trim(), ""));
			model.setCre_dt         	(JSPUtil.getParameter(request, "cre_dt         		".trim(), ""));
			model.setUpd_usr_id     	(JSPUtil.getParameter(request, "upd_usr_id     		".trim(), ""));
			model.setUpd_dt         	(JSPUtil.getParameter(request, "upd_dt         		".trim(), ""));
			model.setDelt_usr_id    	(JSPUtil.getParameter(request, "delt_usr_id    		".trim(), ""));
			model.setDelt_dt        	(JSPUtil.getParameter(request, "delt_dt        		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		TrsTrspOfcExptRule2VO model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag          =  (JSPUtil.getParameter(request, "ibflag         		".trim(), length));
			String[] page_rows       =  (JSPUtil.getParameter(request, "page_rows      		".trim(), length));
			String[] fm_loc_value  	 =  (JSPUtil.getParameter(request, "fm_loc_value   		".trim(), length));
			String[] fm_yard_value  	 =  (JSPUtil.getParameter(request, "fm_yard_value   		".trim(), length));
			String[] to_loc_value  	 =  (JSPUtil.getParameter(request, "to_loc_value   		".trim(), length));
			String[] to_yard_value  	 =  (JSPUtil.getParameter(request, "to_yard_value   		".trim(), length));
			String[] via_loc_value 	 =  (JSPUtil.getParameter(request, "via_loc_value  		".trim(), length));
			String[] via_yard_value 	 =  (JSPUtil.getParameter(request, "via_yard_value  		".trim(), length));
			String[] dor_loc_value 	 =  (JSPUtil.getParameter(request, "dor_loc_value  		".trim(), length));
			String[] dor_yard_value 	 =  (JSPUtil.getParameter(request, "dor_yard_value  		".trim(), length));
			String[] ctrl_ofc_div_cd =  (JSPUtil.getParameter(request, "ctrl_ofc_div_cd		".trim(), length));
			String[] ctrl_ofc_cd     =  (JSPUtil.getParameter(request, "ctrl_ofc_cd    		".trim(), length));
			String[] delt_flg        =  (JSPUtil.getParameter(request, "delt_flg       		".trim(), length));
			String[] cre_ofc_cd      =  (JSPUtil.getParameter(request, "cre_ofc_cd     		".trim(), length));
			String[] cre_usr_id      =  (JSPUtil.getParameter(request, "cre_usr_id     		".trim(), length));
			String[] cre_dt          =  (JSPUtil.getParameter(request, "cre_dt         		".trim(), length));
			String[] upd_usr_id      =  (JSPUtil.getParameter(request, "upd_usr_id     		".trim(), length));
			String[] upd_dt          =  (JSPUtil.getParameter(request, "upd_dt         		".trim(), length));
			String[] delt_usr_id     =  (JSPUtil.getParameter(request, "delt_usr_id    		".trim(), length));
			String[] delt_dt         =  (JSPUtil.getParameter(request, "delt_dt        		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new TrsTrspOfcExptRule2VO();
				model.setIbflag         		  (ibflag         	[i]);
				model.setPage_rows      		  (page_rows      	[i]);
				model.setFm_nod_cd      		  (fm_loc_value[i]+ fm_yard_value[i]);
				model.setTo_nod_cd      		  (to_loc_value[i]+ to_yard_value[i]);
				model.setVia_nod_cd     		  (via_loc_value[i]+via_yard_value[i]);
				model.setDor_nod_cd     		  (dor_loc_value[i]+dor_yard_value[i]);
				model.setCtrl_ofc_div_cd		  (ctrl_ofc_div_cd	[i]);
				model.setCtrl_ofc_cd    		  (ctrl_ofc_cd    	[i]);
				model.setDelt_flg       		  (delt_flg       	[i]);
				model.setCre_ofc_cd     		  (cre_ofc_cd     	[i]);
				model.setCre_usr_id     		  (cre_usr_id     	[i]);
				model.setCre_dt         		  (cre_dt         	[i]);
				model.setUpd_usr_id     		  (upd_usr_id     	[i]);
				model.setUpd_dt         		  (upd_dt         	[i]);
				model.setDelt_usr_id    		  (delt_usr_id    	[i]);
				model.setDelt_dt        		  (delt_dt        	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		TrsTrspOfcExptRule2VO model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag          =  (JSPUtil.getParameter(request, prefix + "ibflag         		".trim(), length));
			String[] page_rows       =  (JSPUtil.getParameter(request, prefix + "page_rows      		".trim(), length));
			String[] fm_loc_value  	 =  (JSPUtil.getParameter(request, prefix + "fm_loc_value      		".trim(), length));
			String[] to_loc_value  	 =  (JSPUtil.getParameter(request, prefix + "to_loc_value      		".trim(), length));
			String[] via_loc_value 	 =  (JSPUtil.getParameter(request, prefix + "via_loc_value     		".trim(), length));
			String[] dor_loc_value 	 =  (JSPUtil.getParameter(request, prefix + "dor_loc_value     		".trim(), length));
			String[] fm_yard_value  	 =  (JSPUtil.getParameter(request, prefix + "fm_yard_value      		".trim(), length));
			String[] to_yard_value  	 =  (JSPUtil.getParameter(request, prefix + "to_yard_value      		".trim(), length));
			String[] via_yard_value 	 =  (JSPUtil.getParameter(request, prefix + "via_yard_value     		".trim(), length));
			String[] dor_yard_value 	 =  (JSPUtil.getParameter(request, prefix + "dor_yard_value     		".trim(), length));
			
			String[] ctrl_ofc_div_cd =  (JSPUtil.getParameter(request, prefix + "ctrl_ofc_div_cd		".trim(), length));
			String[] ctrl_ofc_cd     =  (JSPUtil.getParameter(request, prefix + "ctrl_ofc_cd    		".trim(), length));
			String[] delt_flg        =  (JSPUtil.getParameter(request, prefix + "delt_flg       		".trim(), length));
			String[] cre_ofc_cd      =  (JSPUtil.getParameter(request, prefix + "cre_ofc_cd     		".trim(), length));
			String[] cre_usr_id      =  (JSPUtil.getParameter(request, prefix + "cre_usr_id     		".trim(), length));
			String[] cre_dt          =  (JSPUtil.getParameter(request, prefix + "cre_dt         		".trim(), length));
			String[] upd_usr_id      =  (JSPUtil.getParameter(request, prefix + "upd_usr_id     		".trim(), length));
			String[] upd_dt          =  (JSPUtil.getParameter(request, prefix + "upd_dt         		".trim(), length));
			String[] delt_usr_id     =  (JSPUtil.getParameter(request, prefix + "delt_usr_id    		".trim(), length));
			String[] delt_dt         =  (JSPUtil.getParameter(request, prefix + "delt_dt        		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new TrsTrspOfcExptRule2VO();
				model.setIbflag         		  ( ibflag         	[i]);
				model.setPage_rows      		  ( page_rows      	[i]);
				model.setFm_nod_cd      		  (fm_loc_value[i]+ fm_yard_value[i]);
				model.setTo_nod_cd      		  (to_loc_value[i]+ to_yard_value[i]);
				model.setVia_nod_cd     		  (via_loc_value[i]+via_yard_value[i]);
				model.setDor_nod_cd     		  (dor_loc_value[i]+dor_yard_value[i]);
				model.setCtrl_ofc_div_cd		  ( ctrl_ofc_div_cd	[i]);
				model.setCtrl_ofc_cd    		  ( ctrl_ofc_cd    	[i]);
				model.setDelt_flg       		  ( delt_flg       	[i]);
				model.setCre_ofc_cd     		  ( cre_ofc_cd     	[i]);
				model.setCre_usr_id     		  ( cre_usr_id     	[i]);
				model.setCre_dt         		  ( cre_dt         	[i]);
				model.setUpd_usr_id     		  ( upd_usr_id     	[i]);
				model.setUpd_dt         		  ( upd_dt         	[i]);
				model.setDelt_usr_id    		  ( delt_usr_id    	[i]);
				model.setDelt_dt        		  ( delt_dt        	[i]);
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
