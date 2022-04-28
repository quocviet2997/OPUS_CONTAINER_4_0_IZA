/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : EDI_USA_IBD_CNTR_CMDT.java
*@FileTitle : Adding Surcharge Agreement
*Open Issues :
*Change history :
*@LastModifyDate : 2007-05-18
*@LastModifier : agreement
*@LastVersion : 1.0
* 2007-05-18 agreement
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
public final class EDI_USA_IBD_CNTR_CMDT implements java.io.Serializable {

	private String                  ibflag                  = "";
	private String                  page_rows               = "";
	private String                  bl_no                   = "";
	private String                  bl_no_tp                = "";
	private String                  bl_no_chk               = "";
	private String                  cntr_no                 = "";
	private String                  ibd_cntr_cmdt_seq       = "";
	private String                  ibd_cntr_cmdt_pck_qty   = "";
	private String                  ibd_cntr_cmdt_wgt_tp_cd = "";
	private String                  ibd_cntr_cmdt_desc      = "";
	private String                  eai_evnt_dt             = "";

	public EDI_USA_IBD_CNTR_CMDT(){}

	public EDI_USA_IBD_CNTR_CMDT(
			String                  ibflag                 ,
			String                  page_rows              ,
			String                  bl_no                  ,
			String                  bl_no_tp               ,
			String                  bl_no_chk              ,
			String                  cntr_no                ,
			String                  ibd_cntr_cmdt_seq      ,
			String                  ibd_cntr_cmdt_pck_qty  ,
			String                  ibd_cntr_cmdt_wgt_tp_cd,
			String                  ibd_cntr_cmdt_desc     ,
			String                  eai_evnt_dt            ){
		this.ibflag                  = ibflag                 ;
		this.page_rows               = page_rows              ;
		this.bl_no                   = bl_no                  ;
		this.bl_no_tp                = bl_no_tp               ;
		this.bl_no_chk               = bl_no_chk              ;
		this.cntr_no                 = cntr_no                ;
		this.ibd_cntr_cmdt_seq       = ibd_cntr_cmdt_seq      ;
		this.ibd_cntr_cmdt_pck_qty   = ibd_cntr_cmdt_pck_qty  ;
		this.ibd_cntr_cmdt_wgt_tp_cd = ibd_cntr_cmdt_wgt_tp_cd;
		this.ibd_cntr_cmdt_desc      = ibd_cntr_cmdt_desc     ;
		this.eai_evnt_dt             = eai_evnt_dt            ;
	}

	// getter method is proceeding ..
	public String                  getIbflag                 (){	return ibflag                 	;	}
	public String                  getPage_rows              (){	return page_rows              	;	}
	public String                  getBl_no                  (){	return bl_no                  	;	}
	public String                  getBl_no_tp               (){	return bl_no_tp               	;	}
	public String                  getBl_no_chk              (){	return bl_no_chk              	;	}
	public String                  getCntr_no                (){	return cntr_no                	;	}
	public String                  getIbd_cntr_cmdt_seq      (){	return ibd_cntr_cmdt_seq      	;	}
	public String                  getIbd_cntr_cmdt_pck_qty  (){	return ibd_cntr_cmdt_pck_qty  	;	}
	public String                  getIbd_cntr_cmdt_wgt_tp_cd(){	return ibd_cntr_cmdt_wgt_tp_cd	;	}
	public String                  getIbd_cntr_cmdt_desc     (){	return ibd_cntr_cmdt_desc     	;	}
	public String                  getEai_evnt_dt            (){	return eai_evnt_dt            	;	}

	// setter method is proceeding ..
	public void setIbflag                 ( String                  ibflag                  ){	this.ibflag                  = ibflag                 	;	}
	public void setPage_rows              ( String                  page_rows               ){	this.page_rows               = page_rows              	;	}
	public void setBl_no                  ( String                  bl_no                   ){	this.bl_no                   = bl_no                  	;	}
	public void setBl_no_tp               ( String                  bl_no_tp                ){	this.bl_no_tp                = bl_no_tp               	;	}
	public void setBl_no_chk              ( String                  bl_no_chk               ){	this.bl_no_chk               = bl_no_chk              	;	}
	public void setCntr_no                ( String                  cntr_no                 ){	this.cntr_no                 = cntr_no                	;	}
	public void setIbd_cntr_cmdt_seq      ( String                  ibd_cntr_cmdt_seq       ){	this.ibd_cntr_cmdt_seq       = ibd_cntr_cmdt_seq      	;	}
	public void setIbd_cntr_cmdt_pck_qty  ( String                  ibd_cntr_cmdt_pck_qty   ){	this.ibd_cntr_cmdt_pck_qty   = ibd_cntr_cmdt_pck_qty  	;	}
	public void setIbd_cntr_cmdt_wgt_tp_cd( String                  ibd_cntr_cmdt_wgt_tp_cd ){	this.ibd_cntr_cmdt_wgt_tp_cd = ibd_cntr_cmdt_wgt_tp_cd	;	}
	public void setIbd_cntr_cmdt_desc     ( String                  ibd_cntr_cmdt_desc      ){	this.ibd_cntr_cmdt_desc      = ibd_cntr_cmdt_desc     	;	}
	public void setEai_evnt_dt            ( String                  eai_evnt_dt             ){	this.eai_evnt_dt             = eai_evnt_dt            	;	}

	public static EDI_USA_IBD_CNTR_CMDT fromRequest(HttpServletRequest request) {
		EDI_USA_IBD_CNTR_CMDT model = new EDI_USA_IBD_CNTR_CMDT();
		try {
			model.setIbflag                 	(JSPUtil.getParameter(request, "ibflag                 		".trim(), ""));
			model.setPage_rows              	(JSPUtil.getParameter(request, "page_rows              		".trim(), ""));
			model.setBl_no                  	(JSPUtil.getParameter(request, "bl_no                  		".trim(), ""));
			model.setBl_no_tp               	(JSPUtil.getParameter(request, "bl_no_tp               		".trim(), ""));
			model.setBl_no_chk              	(JSPUtil.getParameter(request, "bl_no_chk              		".trim(), ""));
			model.setCntr_no                	(JSPUtil.getParameter(request, "cntr_no                		".trim(), ""));
			model.setIbd_cntr_cmdt_seq      	(JSPUtil.getParameter(request, "ibd_cntr_cmdt_seq      		".trim(), ""));
			model.setIbd_cntr_cmdt_pck_qty  	(JSPUtil.getParameter(request, "ibd_cntr_cmdt_pck_qty  		".trim(), ""));
			model.setIbd_cntr_cmdt_wgt_tp_cd	(JSPUtil.getParameter(request, "ibd_cntr_cmdt_wgt_tp_cd		".trim(), ""));
			model.setIbd_cntr_cmdt_desc     	(JSPUtil.getParameter(request, "ibd_cntr_cmdt_desc     		".trim(), ""));
			model.setEai_evnt_dt            	(JSPUtil.getParameter(request, "eai_evnt_dt            		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		EDI_USA_IBD_CNTR_CMDT model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag                  =  (JSPUtil.getParameter(request, "ibflag                 		".trim(), length));
			String[] page_rows               =  (JSPUtil.getParameter(request, "page_rows              		".trim(), length));
			String[] bl_no                   =  (JSPUtil.getParameter(request, "bl_no                  		".trim(), length));
			String[] bl_no_tp                =  (JSPUtil.getParameter(request, "bl_no_tp               		".trim(), length));
			String[] bl_no_chk               =  (JSPUtil.getParameter(request, "bl_no_chk              		".trim(), length));
			String[] cntr_no                 =  (JSPUtil.getParameter(request, "cntr_no                		".trim(), length));
			String[] ibd_cntr_cmdt_seq       =  (JSPUtil.getParameter(request, "ibd_cntr_cmdt_seq      		".trim(), length));
			String[] ibd_cntr_cmdt_pck_qty   =  (JSPUtil.getParameter(request, "ibd_cntr_cmdt_pck_qty  		".trim(), length));
			String[] ibd_cntr_cmdt_wgt_tp_cd =  (JSPUtil.getParameter(request, "ibd_cntr_cmdt_wgt_tp_cd		".trim(), length));
			String[] ibd_cntr_cmdt_desc      =  (JSPUtil.getParameter(request, "ibd_cntr_cmdt_desc     		".trim(), length));
			String[] eai_evnt_dt             =  (JSPUtil.getParameter(request, "eai_evnt_dt            		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new EDI_USA_IBD_CNTR_CMDT();
				model.setIbflag                 		  (ibflag                 	[i]);
				model.setPage_rows              		  (page_rows              	[i]);
				model.setBl_no                  		  (bl_no                  	[i]);
				model.setBl_no_tp               		  (bl_no_tp               	[i]);
				model.setBl_no_chk              		  (bl_no_chk              	[i]);
				model.setCntr_no                		  (cntr_no                	[i]);
				model.setIbd_cntr_cmdt_seq      		  (ibd_cntr_cmdt_seq      	[i]);
				model.setIbd_cntr_cmdt_pck_qty  		  (ibd_cntr_cmdt_pck_qty  	[i]);
				model.setIbd_cntr_cmdt_wgt_tp_cd		  (ibd_cntr_cmdt_wgt_tp_cd	[i]);
				model.setIbd_cntr_cmdt_desc     		  (ibd_cntr_cmdt_desc     	[i]);
				model.setEai_evnt_dt            		  (eai_evnt_dt            	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		EDI_USA_IBD_CNTR_CMDT model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag                  =  (JSPUtil.getParameter(request, prefix + "ibflag                 		".trim(), length));
			String[] page_rows               =  (JSPUtil.getParameter(request, prefix + "page_rows              		".trim(), length));
			String[] bl_no                   =  (JSPUtil.getParameter(request, prefix + "bl_no                  		".trim(), length));
			String[] bl_no_tp                =  (JSPUtil.getParameter(request, prefix + "bl_no_tp               		".trim(), length));
			String[] bl_no_chk               =  (JSPUtil.getParameter(request, prefix + "bl_no_chk              		".trim(), length));
			String[] cntr_no                 =  (JSPUtil.getParameter(request, prefix + "cntr_no                		".trim(), length));
			String[] ibd_cntr_cmdt_seq       =  (JSPUtil.getParameter(request, prefix + "ibd_cntr_cmdt_seq      		".trim(), length));
			String[] ibd_cntr_cmdt_pck_qty   =  (JSPUtil.getParameter(request, prefix + "ibd_cntr_cmdt_pck_qty  		".trim(), length));
			String[] ibd_cntr_cmdt_wgt_tp_cd =  (JSPUtil.getParameter(request, prefix + "ibd_cntr_cmdt_wgt_tp_cd		".trim(), length));
			String[] ibd_cntr_cmdt_desc      =  (JSPUtil.getParameter(request, prefix + "ibd_cntr_cmdt_desc     		".trim(), length));
			String[] eai_evnt_dt             =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt            		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new EDI_USA_IBD_CNTR_CMDT();
				model.setIbflag                 		  ( ibflag                 	[i]);
				model.setPage_rows              		  ( page_rows              	[i]);
				model.setBl_no                  		  ( bl_no                  	[i]);
				model.setBl_no_tp               		  ( bl_no_tp               	[i]);
				model.setBl_no_chk              		  ( bl_no_chk              	[i]);
				model.setCntr_no                		  ( cntr_no                	[i]);
				model.setIbd_cntr_cmdt_seq      		  ( ibd_cntr_cmdt_seq      	[i]);
				model.setIbd_cntr_cmdt_pck_qty  		  ( ibd_cntr_cmdt_pck_qty  	[i]);
				model.setIbd_cntr_cmdt_wgt_tp_cd		  ( ibd_cntr_cmdt_wgt_tp_cd	[i]);
				model.setIbd_cntr_cmdt_desc     		  ( ibd_cntr_cmdt_desc     	[i]);
				model.setEai_evnt_dt            		  ( eai_evnt_dt            	[i]);
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
