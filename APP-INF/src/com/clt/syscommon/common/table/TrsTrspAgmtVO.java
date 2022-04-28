/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : TRS_TRSP_AGMT.java
*@FileTitle : SO Inquiry
*Open Issues :
*Change history :
*@LastModifyDate : 2006-11-10
*@LastModifier : juhyun
*@LastVersion : 1.0
* 2006-11-10 juhyun
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
 * @author juhyun
 * @since J2EE 1.4
 */
public final class TrsTrspAgmtVO implements java.io.Serializable {

	private String       ibflag       = "";
	private String       page_rows    = "";
	private String       trsp_agmt_no = "";
	private String       ofc_cd       = "";
	private String       ref_no_desc  = "";
	private String       ctrt_pic_nm  = "";
	private String       agmt_rmk     = "";
	private String       curr_cd      = "";
	private String       cre_usr_id   = "";
	private String       cre_dt       = "";
	private String       upd_usr_id   = "";
	private String       upd_dt       = "";
	private String       delt_flg     = "";

	public TrsTrspAgmtVO(){}

	public TrsTrspAgmtVO(
			String       ibflag      ,
			String       page_rows   ,
			String       trsp_agmt_no,
			String       ofc_cd      ,
			String       ref_no_desc ,
			String       ctrt_pic_nm ,
			String       agmt_rmk    ,
			String       curr_cd     ,
			String       cre_usr_id  ,
			String       cre_dt      ,
			String       upd_usr_id  ,
			String       upd_dt      ,
			String       delt_flg    ){
		this.ibflag       = ibflag      ;
		this.page_rows    = page_rows   ;
		this.trsp_agmt_no = trsp_agmt_no;
		this.ofc_cd       = ofc_cd      ;
		this.ref_no_desc  = ref_no_desc ;
		this.ctrt_pic_nm  = ctrt_pic_nm ;
		this.agmt_rmk     = agmt_rmk    ;
		this.curr_cd      = curr_cd     ;
		this.cre_usr_id   = cre_usr_id  ;
		this.cre_dt       = cre_dt      ;
		this.upd_usr_id   = upd_usr_id  ;
		this.upd_dt       = upd_dt      ;
		this.delt_flg     = delt_flg    ;
	}

	// getter method is proceeding ..
	public String       getIbflag      (){	return ibflag      	;	}
	public String       getPage_rows   (){	return page_rows   	;	}
	public String       getTrsp_agmt_no(){	return trsp_agmt_no	;	}
	public String       getOfc_cd      (){	return ofc_cd      	;	}
	public String       getRef_no_desc (){	return ref_no_desc 	;	}
	public String       getCtrt_pic_nm (){	return ctrt_pic_nm 	;	}
	public String       getAgmt_rmk    (){	return agmt_rmk    	;	}
	public String       getCurr_cd     (){	return curr_cd     	;	}
	public String       getCre_usr_id  (){	return cre_usr_id  	;	}
	public String       getCre_dt      (){	return cre_dt      	;	}
	public String       getUpd_usr_id  (){	return upd_usr_id  	;	}
	public String       getUpd_dt      (){	return upd_dt      	;	}
	public String       getDelt_flg    (){	return delt_flg    	;	}

	// setter method is proceeding ..
	public void setIbflag      ( String       ibflag       ){	this.ibflag       = ibflag      	;	}
	public void setPage_rows   ( String       page_rows    ){	this.page_rows    = page_rows   	;	}
	public void setTrsp_agmt_no( String       trsp_agmt_no ){	this.trsp_agmt_no = trsp_agmt_no	;	}
	public void setOfc_cd      ( String       ofc_cd       ){	this.ofc_cd       = ofc_cd      	;	}
	public void setRef_no_desc ( String       ref_no_desc  ){	this.ref_no_desc  = ref_no_desc 	;	}
	public void setCtrt_pic_nm ( String       ctrt_pic_nm  ){	this.ctrt_pic_nm  = ctrt_pic_nm 	;	}
	public void setAgmt_rmk    ( String       agmt_rmk     ){	this.agmt_rmk     = agmt_rmk    	;	}
	public void setCurr_cd     ( String       curr_cd      ){	this.curr_cd      = curr_cd     	;	}
	public void setCre_usr_id  ( String       cre_usr_id   ){	this.cre_usr_id   = cre_usr_id  	;	}
	public void setCre_dt      ( String       cre_dt       ){	this.cre_dt       = cre_dt      	;	}
	public void setUpd_usr_id  ( String       upd_usr_id   ){	this.upd_usr_id   = upd_usr_id  	;	}
	public void setUpd_dt      ( String       upd_dt       ){	this.upd_dt       = upd_dt      	;	}
	public void setDelt_flg    ( String       delt_flg     ){	this.delt_flg     = delt_flg    	;	}

	public static TrsTrspAgmtVO fromRequest(HttpServletRequest request) {
		TrsTrspAgmtVO model = new TrsTrspAgmtVO();
		try {
			model.setIbflag      	(JSPUtil.getParameter(request, "ibflag      		".trim(), ""));
			model.setPage_rows   	(JSPUtil.getParameter(request, "page_rows   		".trim(), ""));
			model.setTrsp_agmt_no	(JSPUtil.getParameter(request, "trsp_agmt_no		".trim(), ""));
			model.setOfc_cd      	(JSPUtil.getParameter(request, "ofc_cd      		".trim(), ""));
			model.setRef_no_desc 	(JSPUtil.getParameter(request, "ref_no_desc 		".trim(), ""));
			model.setCtrt_pic_nm 	(JSPUtil.getParameter(request, "ctrt_pic_nm 		".trim(), ""));
			model.setAgmt_rmk    	(JSPUtil.getParameter(request, "agmt_rmk    		".trim(), ""));
			model.setCurr_cd     	(JSPUtil.getParameter(request, "curr_cd     		".trim(), ""));
			model.setCre_usr_id  	(JSPUtil.getParameter(request, "cre_usr_id  		".trim(), ""));
			model.setCre_dt      	(JSPUtil.getParameter(request, "cre_dt      		".trim(), ""));
			model.setUpd_usr_id  	(JSPUtil.getParameter(request, "upd_usr_id  		".trim(), ""));
			model.setUpd_dt      	(JSPUtil.getParameter(request, "upd_dt      		".trim(), ""));
			model.setDelt_flg    	(JSPUtil.getParameter(request, "delt_flg    		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		TrsTrspAgmtVO model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag       =  (JSPUtil.getParameter(request, "ibflag      		".trim(), length));
			String[] page_rows    =  (JSPUtil.getParameter(request, "page_rows   		".trim(), length));
			String[] trsp_agmt_no =  (JSPUtil.getParameter(request, "trsp_agmt_no		".trim(), length));
			String[] ofc_cd       =  (JSPUtil.getParameter(request, "ofc_cd      		".trim(), length));
			String[] ref_no_desc  =  (JSPUtil.getParameter(request, "ref_no_desc 		".trim(), length));
			String[] ctrt_pic_nm  =  (JSPUtil.getParameter(request, "ctrt_pic_nm 		".trim(), length));
			String[] agmt_rmk     =  (JSPUtil.getParameter(request, "agmt_rmk    		".trim(), length));
			String[] curr_cd      =  (JSPUtil.getParameter(request, "curr_cd     		".trim(), length));
			String[] cre_usr_id   =  (JSPUtil.getParameter(request, "cre_usr_id  		".trim(), length));
			String[] cre_dt       =  (JSPUtil.getParameter(request, "cre_dt      		".trim(), length));
			String[] upd_usr_id   =  (JSPUtil.getParameter(request, "upd_usr_id  		".trim(), length));
			String[] upd_dt       =  (JSPUtil.getParameter(request, "upd_dt      		".trim(), length));
			String[] delt_flg     =  (JSPUtil.getParameter(request, "delt_flg    		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new TrsTrspAgmtVO();
				model.setIbflag      		  (ibflag      	[i]);
				model.setPage_rows   		  (page_rows   	[i]);
				model.setTrsp_agmt_no		  (trsp_agmt_no	[i]);
				model.setOfc_cd      		  (ofc_cd      	[i]);
				model.setRef_no_desc 		  (ref_no_desc 	[i]);
				model.setCtrt_pic_nm 		  (ctrt_pic_nm 	[i]);
				model.setAgmt_rmk    		  (agmt_rmk    	[i]);
				model.setCurr_cd     		  (curr_cd     	[i]);
				model.setCre_usr_id  		  (cre_usr_id  	[i]);
				model.setCre_dt      		  (cre_dt      	[i]);
				model.setUpd_usr_id  		  (upd_usr_id  	[i]);
				model.setUpd_dt      		  (upd_dt      	[i]);
				model.setDelt_flg    		  (delt_flg    	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		TrsTrspAgmtVO model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag       =  (JSPUtil.getParameter(request, prefix + "ibflag      		".trim(), length));
			String[] page_rows    =  (JSPUtil.getParameter(request, prefix + "page_rows   		".trim(), length));
			String[] trsp_agmt_no =  (JSPUtil.getParameter(request, prefix + "trsp_agmt_no		".trim(), length));
			String[] ofc_cd       =  (JSPUtil.getParameter(request, prefix + "ofc_cd      		".trim(), length));
			String[] ref_no_desc  =  (JSPUtil.getParameter(request, prefix + "ref_no_desc 		".trim(), length));
			String[] ctrt_pic_nm  =  (JSPUtil.getParameter(request, prefix + "ctrt_pic_nm 		".trim(), length));
			String[] agmt_rmk     =  (JSPUtil.getParameter(request, prefix + "agmt_rmk    		".trim(), length));
			String[] curr_cd      =  (JSPUtil.getParameter(request, prefix + "curr_cd     		".trim(), length));
			String[] cre_usr_id   =  (JSPUtil.getParameter(request, prefix + "cre_usr_id  		".trim(), length));
			String[] cre_dt       =  (JSPUtil.getParameter(request, prefix + "cre_dt      		".trim(), length));
			String[] upd_usr_id   =  (JSPUtil.getParameter(request, prefix + "upd_usr_id  		".trim(), length));
			String[] upd_dt       =  (JSPUtil.getParameter(request, prefix + "upd_dt      		".trim(), length));
			String[] delt_flg     =  (JSPUtil.getParameter(request, prefix + "delt_flg    		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new TrsTrspAgmtVO();
				model.setIbflag      		  ( ibflag      	[i]);
				model.setPage_rows   		  ( page_rows   	[i]);
				model.setTrsp_agmt_no		  ( trsp_agmt_no	[i]);
				model.setOfc_cd      		  ( ofc_cd      	[i]);
				model.setRef_no_desc 		  ( ref_no_desc 	[i]);
				model.setCtrt_pic_nm 		  ( ctrt_pic_nm 	[i]);
				model.setAgmt_rmk    		  ( agmt_rmk    	[i]);
				model.setCurr_cd     		  ( curr_cd     	[i]);
				model.setCre_usr_id  		  ( cre_usr_id  	[i]);
				model.setCre_dt      		  ( cre_dt      	[i]);
				model.setUpd_usr_id  		  ( upd_usr_id  	[i]);
				model.setUpd_dt      		  ( upd_dt      	[i]);
				model.setDelt_flg    		  ( delt_flg    	[i]);
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
