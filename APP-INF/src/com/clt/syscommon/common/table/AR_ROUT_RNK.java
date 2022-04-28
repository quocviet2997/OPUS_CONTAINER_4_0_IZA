/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : AR_ROUT_RNK.java
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
public final class AR_ROUT_RNK implements java.io.Serializable {

	private String      ibflag      = "";
	private String      page_rows   = "";
	private String      rlane_cd    = "";
	private String      rnk_seq     = "";
	private String      rlane_desc  = "";
	private String      zn_ioc_cd   = "";
	private String      ioc_desc    = "";
	private String      slan_cd     = "";
	private String      delt_flg    = "";
	private String      cre_usr_id  = "";
	private String      cre_dt      = "";
	private String      eai_evnt_dt = "";

	public AR_ROUT_RNK(){}

	public AR_ROUT_RNK(
			String      ibflag     ,
			String      page_rows  ,
			String      rlane_cd   ,
			String      rnk_seq    ,
			String      rlane_desc ,
			String      zn_ioc_cd  ,
			String      ioc_desc   ,
			String      slan_cd    ,
			String      delt_flg   ,
			String      cre_usr_id ,
			String      cre_dt     ,
			String      eai_evnt_dt){
		this.ibflag      = ibflag     ;
		this.page_rows   = page_rows  ;
		this.rlane_cd    = rlane_cd   ;
		this.rnk_seq     = rnk_seq    ;
		this.rlane_desc  = rlane_desc ;
		this.zn_ioc_cd   = zn_ioc_cd  ;
		this.ioc_desc    = ioc_desc   ;
		this.slan_cd     = slan_cd    ;
		this.delt_flg    = delt_flg   ;
		this.cre_usr_id  = cre_usr_id ;
		this.cre_dt      = cre_dt     ;
		this.eai_evnt_dt = eai_evnt_dt;
	}

	// getter method is proceeding ..
	public String      getIbflag     (){	return ibflag     	;	}
	public String      getPage_rows  (){	return page_rows  	;	}
	public String      getRlane_cd   (){	return rlane_cd   	;	}
	public String      getRnk_seq    (){	return rnk_seq    	;	}
	public String      getRlane_desc (){	return rlane_desc 	;	}
	public String      getZn_ioc_cd  (){	return zn_ioc_cd  	;	}
	public String      getIoc_desc   (){	return ioc_desc   	;	}
	public String      getSlan_cd    (){	return slan_cd    	;	}
	public String      getDelt_flg   (){	return delt_flg   	;	}
	public String      getCre_usr_id (){	return cre_usr_id 	;	}
	public String      getCre_dt     (){	return cre_dt     	;	}
	public String      getEai_evnt_dt(){	return eai_evnt_dt	;	}

	// setter method is proceeding ..
	public void setIbflag     ( String      ibflag      ){	this.ibflag      = ibflag     	;	}
	public void setPage_rows  ( String      page_rows   ){	this.page_rows   = page_rows  	;	}
	public void setRlane_cd   ( String      rlane_cd    ){	this.rlane_cd    = rlane_cd   	;	}
	public void setRnk_seq    ( String      rnk_seq     ){	this.rnk_seq     = rnk_seq    	;	}
	public void setRlane_desc ( String      rlane_desc  ){	this.rlane_desc  = rlane_desc 	;	}
	public void setZn_ioc_cd  ( String      zn_ioc_cd   ){	this.zn_ioc_cd   = zn_ioc_cd  	;	}
	public void setIoc_desc   ( String      ioc_desc    ){	this.ioc_desc    = ioc_desc   	;	}
	public void setSlan_cd    ( String      slan_cd     ){	this.slan_cd     = slan_cd    	;	}
	public void setDelt_flg   ( String      delt_flg    ){	this.delt_flg    = delt_flg   	;	}
	public void setCre_usr_id ( String      cre_usr_id  ){	this.cre_usr_id  = cre_usr_id 	;	}
	public void setCre_dt     ( String      cre_dt      ){	this.cre_dt      = cre_dt     	;	}
	public void setEai_evnt_dt( String      eai_evnt_dt ){	this.eai_evnt_dt = eai_evnt_dt	;	}

	public static AR_ROUT_RNK fromRequest(HttpServletRequest request) {
		AR_ROUT_RNK model = new AR_ROUT_RNK();
		try {
			model.setIbflag     	(JSPUtil.getParameter(request, "ibflag     		".trim(), ""));
			model.setPage_rows  	(JSPUtil.getParameter(request, "page_rows  		".trim(), ""));
			model.setRlane_cd   	(JSPUtil.getParameter(request, "rlane_cd   		".trim(), ""));
			model.setRnk_seq    	(JSPUtil.getParameter(request, "rnk_seq    		".trim(), ""));
			model.setRlane_desc 	(JSPUtil.getParameter(request, "rlane_desc 		".trim(), ""));
			model.setZn_ioc_cd  	(JSPUtil.getParameter(request, "zn_ioc_cd  		".trim(), ""));
			model.setIoc_desc   	(JSPUtil.getParameter(request, "ioc_desc   		".trim(), ""));
			model.setSlan_cd    	(JSPUtil.getParameter(request, "slan_cd    		".trim(), ""));
			model.setDelt_flg   	(JSPUtil.getParameter(request, "delt_flg   		".trim(), ""));
			model.setCre_usr_id 	(JSPUtil.getParameter(request, "cre_usr_id 		".trim(), ""));
			model.setCre_dt     	(JSPUtil.getParameter(request, "cre_dt     		".trim(), ""));
			model.setEai_evnt_dt	(JSPUtil.getParameter(request, "eai_evnt_dt		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		AR_ROUT_RNK model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag      =  (JSPUtil.getParameter(request, "ibflag     		".trim(), length));
			String[] page_rows   =  (JSPUtil.getParameter(request, "page_rows  		".trim(), length));
			String[] rlane_cd    =  (JSPUtil.getParameter(request, "rlane_cd   		".trim(), length));
			String[] rnk_seq     =  (JSPUtil.getParameter(request, "rnk_seq    		".trim(), length));
			String[] rlane_desc  =  (JSPUtil.getParameter(request, "rlane_desc 		".trim(), length));
			String[] zn_ioc_cd   =  (JSPUtil.getParameter(request, "zn_ioc_cd  		".trim(), length));
			String[] ioc_desc    =  (JSPUtil.getParameter(request, "ioc_desc   		".trim(), length));
			String[] slan_cd     =  (JSPUtil.getParameter(request, "slan_cd    		".trim(), length));
			String[] delt_flg    =  (JSPUtil.getParameter(request, "delt_flg   		".trim(), length));
			String[] cre_usr_id  =  (JSPUtil.getParameter(request, "cre_usr_id 		".trim(), length));
			String[] cre_dt      =  (JSPUtil.getParameter(request, "cre_dt     		".trim(), length));
			String[] eai_evnt_dt =  (JSPUtil.getParameter(request, "eai_evnt_dt		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new AR_ROUT_RNK();
				model.setIbflag     		  (ibflag     	[i]);
				model.setPage_rows  		  (page_rows  	[i]);
				model.setRlane_cd   		  (rlane_cd   	[i]);
				model.setRnk_seq    		  (rnk_seq    	[i]);
				model.setRlane_desc 		  (rlane_desc 	[i]);
				model.setZn_ioc_cd  		  (zn_ioc_cd  	[i]);
				model.setIoc_desc   		  (ioc_desc   	[i]);
				model.setSlan_cd    		  (slan_cd    	[i]);
				model.setDelt_flg   		  (delt_flg   	[i]);
				model.setCre_usr_id 		  (cre_usr_id 	[i]);
				model.setCre_dt     		  (cre_dt     	[i]);
				model.setEai_evnt_dt		  (eai_evnt_dt	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		AR_ROUT_RNK model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag      =  (JSPUtil.getParameter(request, prefix + "ibflag     		".trim(), length));
			String[] page_rows   =  (JSPUtil.getParameter(request, prefix + "page_rows  		".trim(), length));
			String[] rlane_cd    =  (JSPUtil.getParameter(request, prefix + "rlane_cd   		".trim(), length));
			String[] rnk_seq     =  (JSPUtil.getParameter(request, prefix + "rnk_seq    		".trim(), length));
			String[] rlane_desc  =  (JSPUtil.getParameter(request, prefix + "rlane_desc 		".trim(), length));
			String[] zn_ioc_cd   =  (JSPUtil.getParameter(request, prefix + "zn_ioc_cd  		".trim(), length));
			String[] ioc_desc    =  (JSPUtil.getParameter(request, prefix + "ioc_desc   		".trim(), length));
			String[] slan_cd     =  (JSPUtil.getParameter(request, prefix + "slan_cd    		".trim(), length));
			String[] delt_flg    =  (JSPUtil.getParameter(request, prefix + "delt_flg   		".trim(), length));
			String[] cre_usr_id  =  (JSPUtil.getParameter(request, prefix + "cre_usr_id 		".trim(), length));
			String[] cre_dt      =  (JSPUtil.getParameter(request, prefix + "cre_dt     		".trim(), length));
			String[] eai_evnt_dt =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new AR_ROUT_RNK();
				model.setIbflag     		  ( ibflag     	[i]);
				model.setPage_rows  		  ( page_rows  	[i]);
				model.setRlane_cd   		  ( rlane_cd   	[i]);
				model.setRnk_seq    		  ( rnk_seq    	[i]);
				model.setRlane_desc 		  ( rlane_desc 	[i]);
				model.setZn_ioc_cd  		  ( zn_ioc_cd  	[i]);
				model.setIoc_desc   		  ( ioc_desc   	[i]);
				model.setSlan_cd    		  ( slan_cd    	[i]);
				model.setDelt_flg   		  ( delt_flg   	[i]);
				model.setCre_usr_id 		  ( cre_usr_id 	[i]);
				model.setCre_dt     		  ( cre_dt     	[i]);
				model.setEai_evnt_dt		  ( eai_evnt_dt	[i]);
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
