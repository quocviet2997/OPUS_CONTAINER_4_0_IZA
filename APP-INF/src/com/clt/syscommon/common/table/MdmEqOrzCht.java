/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : MDM_EQ_ORZ_CHT.java
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
public final class MdmEqOrzCht implements java.io.Serializable {

	private String      ibflag      = "";
	private String      page_rows   = "";
	private String      scc_cd      = "";
	private String      ecc_cd      = "";
	private String      lcc_cd      = "";
	private String      rcc_cd      = "";
	private String      cre_usr_id  = "";
	private String      cre_dt      = "";
	private String      upd_usr_id  = "";
	private String      upd_dt      = "";
	private String      delt_flg    = "";
	private String      eai_evnt_dt = "";
	private String      eai_if_id   = "";

	public MdmEqOrzCht(){}

	public MdmEqOrzCht(
			String      ibflag     ,
			String      page_rows  ,
			String      scc_cd     ,
			String      ecc_cd     ,
			String      lcc_cd     ,
			String      rcc_cd     ,
			String      cre_usr_id ,
			String      cre_dt     ,
			String      upd_usr_id ,
			String      upd_dt     ,
			String      delt_flg   ,
			String      eai_evnt_dt,
			String      eai_if_id  ){
		this.ibflag      = ibflag     ;
		this.page_rows   = page_rows  ;
		this.scc_cd      = scc_cd     ;
		this.ecc_cd      = ecc_cd     ;
		this.lcc_cd      = lcc_cd     ;
		this.rcc_cd      = rcc_cd     ;
		this.cre_usr_id  = cre_usr_id ;
		this.cre_dt      = cre_dt     ;
		this.upd_usr_id  = upd_usr_id ;
		this.upd_dt      = upd_dt     ;
		this.delt_flg    = delt_flg   ;
		this.eai_evnt_dt = eai_evnt_dt;
		this.eai_if_id   = eai_if_id  ;
	}

	// getter method is proceeding ..
	public String      getIbflag     (){	return ibflag     	;	}
	public String      getPage_rows  (){	return page_rows  	;	}
	public String      getScc_cd     (){	return scc_cd     	;	}
	public String      getEcc_cd     (){	return ecc_cd     	;	}
	public String      getLcc_cd     (){	return lcc_cd     	;	}
	public String      getRcc_cd     (){	return rcc_cd     	;	}
	public String      getCre_usr_id (){	return cre_usr_id 	;	}
	public String      getCre_dt     (){	return cre_dt     	;	}
	public String      getUpd_usr_id (){	return upd_usr_id 	;	}
	public String      getUpd_dt     (){	return upd_dt     	;	}
	public String      getDelt_flg   (){	return delt_flg   	;	}
	public String      getEai_evnt_dt(){	return eai_evnt_dt	;	}
	public String      getEai_if_id  (){	return eai_if_id  	;	}

	// setter method is proceeding ..
	public void setIbflag     ( String      ibflag      ){	this.ibflag      = ibflag     	;	}
	public void setPage_rows  ( String      page_rows   ){	this.page_rows   = page_rows  	;	}
	public void setScc_cd     ( String      scc_cd      ){	this.scc_cd      = scc_cd     	;	}
	public void setEcc_cd     ( String      ecc_cd      ){	this.ecc_cd      = ecc_cd     	;	}
	public void setLcc_cd     ( String      lcc_cd      ){	this.lcc_cd      = lcc_cd     	;	}
	public void setRcc_cd     ( String      rcc_cd      ){	this.rcc_cd      = rcc_cd     	;	}
	public void setCre_usr_id ( String      cre_usr_id  ){	this.cre_usr_id  = cre_usr_id 	;	}
	public void setCre_dt     ( String      cre_dt      ){	this.cre_dt      = cre_dt     	;	}
	public void setUpd_usr_id ( String      upd_usr_id  ){	this.upd_usr_id  = upd_usr_id 	;	}
	public void setUpd_dt     ( String      upd_dt      ){	this.upd_dt      = upd_dt     	;	}
	public void setDelt_flg   ( String      delt_flg    ){	this.delt_flg    = delt_flg   	;	}
	public void setEai_evnt_dt( String      eai_evnt_dt ){	this.eai_evnt_dt = eai_evnt_dt	;	}
	public void setEai_if_id  ( String      eai_if_id   ){	this.eai_if_id   = eai_if_id  	;	}

	public static MdmEqOrzCht fromRequest(HttpServletRequest request) {
		MdmEqOrzCht model = new MdmEqOrzCht();
		try {
			model.setIbflag     	(JSPUtil.getParameter(request, "ibflag     		".trim(), ""));
			model.setPage_rows  	(JSPUtil.getParameter(request, "page_rows  		".trim(), ""));
			model.setScc_cd     	(JSPUtil.getParameter(request, "scc_cd     		".trim(), ""));
			model.setEcc_cd     	(JSPUtil.getParameter(request, "ecc_cd     		".trim(), ""));
			model.setLcc_cd     	(JSPUtil.getParameter(request, "lcc_cd     		".trim(), ""));
			model.setRcc_cd     	(JSPUtil.getParameter(request, "rcc_cd     		".trim(), ""));
			model.setCre_usr_id 	(JSPUtil.getParameter(request, "cre_usr_id 		".trim(), ""));
			model.setCre_dt     	(JSPUtil.getParameter(request, "cre_dt     		".trim(), ""));
			model.setUpd_usr_id 	(JSPUtil.getParameter(request, "upd_usr_id 		".trim(), ""));
			model.setUpd_dt     	(JSPUtil.getParameter(request, "upd_dt     		".trim(), ""));
			model.setDelt_flg   	(JSPUtil.getParameter(request, "delt_flg   		".trim(), ""));
			model.setEai_evnt_dt	(JSPUtil.getParameter(request, "eai_evnt_dt		".trim(), ""));
			model.setEai_if_id  	(JSPUtil.getParameter(request, "eai_if_id  		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		MdmEqOrzCht model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag      =  (JSPUtil.getParameter(request, "ibflag     		".trim(), length));
			String[] page_rows   =  (JSPUtil.getParameter(request, "page_rows  		".trim(), length));
			String[] scc_cd      =  (JSPUtil.getParameter(request, "scc_cd     		".trim(), length));
			String[] ecc_cd      =  (JSPUtil.getParameter(request, "ecc_cd     		".trim(), length));
			String[] lcc_cd      =  (JSPUtil.getParameter(request, "lcc_cd     		".trim(), length));
			String[] rcc_cd      =  (JSPUtil.getParameter(request, "rcc_cd     		".trim(), length));
			String[] cre_usr_id  =  (JSPUtil.getParameter(request, "cre_usr_id 		".trim(), length));
			String[] cre_dt      =  (JSPUtil.getParameter(request, "cre_dt     		".trim(), length));
			String[] upd_usr_id  =  (JSPUtil.getParameter(request, "upd_usr_id 		".trim(), length));
			String[] upd_dt      =  (JSPUtil.getParameter(request, "upd_dt     		".trim(), length));
			String[] delt_flg    =  (JSPUtil.getParameter(request, "delt_flg   		".trim(), length));
			String[] eai_evnt_dt =  (JSPUtil.getParameter(request, "eai_evnt_dt		".trim(), length));
			String[] eai_if_id   =  (JSPUtil.getParameter(request, "eai_if_id  		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new MdmEqOrzCht();
				model.setIbflag     		  (ibflag     	[i]);
				model.setPage_rows  		  (page_rows  	[i]);
				model.setScc_cd     		  (scc_cd     	[i]);
				model.setEcc_cd     		  (ecc_cd     	[i]);
				model.setLcc_cd     		  (lcc_cd     	[i]);
				model.setRcc_cd     		  (rcc_cd     	[i]);
				model.setCre_usr_id 		  (cre_usr_id 	[i]);
				model.setCre_dt     		  (cre_dt     	[i]);
				model.setUpd_usr_id 		  (upd_usr_id 	[i]);
				model.setUpd_dt     		  (upd_dt     	[i]);
				model.setDelt_flg   		  (delt_flg   	[i]);
				model.setEai_evnt_dt		  (eai_evnt_dt	[i]);
				model.setEai_if_id  		  (eai_if_id  	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		MdmEqOrzCht model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag      =  (JSPUtil.getParameter(request, prefix + "ibflag     		".trim(), length));
			String[] page_rows   =  (JSPUtil.getParameter(request, prefix + "page_rows  		".trim(), length));
			String[] scc_cd      =  (JSPUtil.getParameter(request, prefix + "scc_cd     		".trim(), length));
			String[] ecc_cd      =  (JSPUtil.getParameter(request, prefix + "ecc_cd     		".trim(), length));
			String[] lcc_cd      =  (JSPUtil.getParameter(request, prefix + "lcc_cd     		".trim(), length));
			String[] rcc_cd      =  (JSPUtil.getParameter(request, prefix + "rcc_cd     		".trim(), length));
			String[] cre_usr_id  =  (JSPUtil.getParameter(request, prefix + "cre_usr_id 		".trim(), length));
			String[] cre_dt      =  (JSPUtil.getParameter(request, prefix + "cre_dt     		".trim(), length));
			String[] upd_usr_id  =  (JSPUtil.getParameter(request, prefix + "upd_usr_id 		".trim(), length));
			String[] upd_dt      =  (JSPUtil.getParameter(request, prefix + "upd_dt     		".trim(), length));
			String[] delt_flg    =  (JSPUtil.getParameter(request, prefix + "delt_flg   		".trim(), length));
			String[] eai_evnt_dt =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt		".trim(), length));
			String[] eai_if_id   =  (JSPUtil.getParameter(request, prefix + "eai_if_id  		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new MdmEqOrzCht();
				model.setIbflag     		  ( ibflag     	[i]);
				model.setPage_rows  		  ( page_rows  	[i]);
				model.setScc_cd     		  ( scc_cd     	[i]);
				model.setEcc_cd     		  ( ecc_cd     	[i]);
				model.setLcc_cd     		  ( lcc_cd     	[i]);
				model.setRcc_cd     		  ( rcc_cd     	[i]);
				model.setCre_usr_id 		  ( cre_usr_id 	[i]);
				model.setCre_dt     		  ( cre_dt     	[i]);
				model.setUpd_usr_id 		  ( upd_usr_id 	[i]);
				model.setUpd_dt     		  ( upd_dt     	[i]);
				model.setDelt_flg   		  ( delt_flg   	[i]);
				model.setEai_evnt_dt		  ( eai_evnt_dt	[i]);
				model.setEai_if_id  		  ( eai_if_id  	[i]);
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
