/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : BKG_CNTR_CMDT.java
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
public final class BKG_CNTR_CMDT implements java.io.Serializable {

	private String            ibflag            = "";
	private String            page_rows         = "";
	private String            bkg_no            = "";
	private String            bkg_no_split      = "";
	private String            cntr_no           = "";
	private String            bkg_cntr_cmdt_seq = "";
	private String            po_no             = "";
	private String            eai_evnt_dt       = "";

	public BKG_CNTR_CMDT(){}

	public BKG_CNTR_CMDT(
			String            ibflag           ,
			String            page_rows        ,
			String            bkg_no           ,
			String            bkg_no_split     ,
			String            cntr_no          ,
			String            bkg_cntr_cmdt_seq,
			String            po_no            ,
			String            eai_evnt_dt      ){
		this.ibflag            = ibflag           ;
		this.page_rows         = page_rows        ;
		this.bkg_no            = bkg_no           ;
		this.bkg_no_split      = bkg_no_split     ;
		this.cntr_no           = cntr_no          ;
		this.bkg_cntr_cmdt_seq = bkg_cntr_cmdt_seq;
		this.po_no             = po_no            ;
		this.eai_evnt_dt       = eai_evnt_dt      ;
	}

	// getter method is proceeding ..
	public String            getIbflag           (){	return ibflag           	;	}
	public String            getPage_rows        (){	return page_rows        	;	}
	public String            getBkg_no           (){	return bkg_no           	;	}
	public String            getBkg_no_split     (){	return bkg_no_split     	;	}
	public String            getCntr_no          (){	return cntr_no          	;	}
	public String            getBkg_cntr_cmdt_seq(){	return bkg_cntr_cmdt_seq	;	}
	public String            getPo_no            (){	return po_no            	;	}
	public String            getEai_evnt_dt      (){	return eai_evnt_dt      	;	}

	// setter method is proceeding ..
	public void setIbflag           ( String            ibflag            ){	this.ibflag            = ibflag           	;	}
	public void setPage_rows        ( String            page_rows         ){	this.page_rows         = page_rows        	;	}
	public void setBkg_no           ( String            bkg_no            ){	this.bkg_no            = bkg_no           	;	}
	public void setBkg_no_split     ( String            bkg_no_split      ){	this.bkg_no_split      = bkg_no_split     	;	}
	public void setCntr_no          ( String            cntr_no           ){	this.cntr_no           = cntr_no          	;	}
	public void setBkg_cntr_cmdt_seq( String            bkg_cntr_cmdt_seq ){	this.bkg_cntr_cmdt_seq = bkg_cntr_cmdt_seq	;	}
	public void setPo_no            ( String            po_no             ){	this.po_no             = po_no            	;	}
	public void setEai_evnt_dt      ( String            eai_evnt_dt       ){	this.eai_evnt_dt       = eai_evnt_dt      	;	}

	public static BKG_CNTR_CMDT fromRequest(HttpServletRequest request) {
		BKG_CNTR_CMDT model = new BKG_CNTR_CMDT();
		try {
			model.setIbflag           	(JSPUtil.getParameter(request, "ibflag           		".trim(), ""));
			model.setPage_rows        	(JSPUtil.getParameter(request, "page_rows        		".trim(), ""));
			model.setBkg_no           	(JSPUtil.getParameter(request, "bkg_no           		".trim(), ""));
			model.setBkg_no_split     	(JSPUtil.getParameter(request, "bkg_no_split     		".trim(), ""));
			model.setCntr_no          	(JSPUtil.getParameter(request, "cntr_no          		".trim(), ""));
			model.setBkg_cntr_cmdt_seq	(JSPUtil.getParameter(request, "bkg_cntr_cmdt_seq		".trim(), ""));
			model.setPo_no            	(JSPUtil.getParameter(request, "po_no            		".trim(), ""));
			model.setEai_evnt_dt      	(JSPUtil.getParameter(request, "eai_evnt_dt      		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		BKG_CNTR_CMDT model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag            =  (JSPUtil.getParameter(request, "ibflag           		".trim(), length));
			String[] page_rows         =  (JSPUtil.getParameter(request, "page_rows        		".trim(), length));
			String[] bkg_no            =  (JSPUtil.getParameter(request, "bkg_no           		".trim(), length));
			String[] bkg_no_split      =  (JSPUtil.getParameter(request, "bkg_no_split     		".trim(), length));
			String[] cntr_no           =  (JSPUtil.getParameter(request, "cntr_no          		".trim(), length));
			String[] bkg_cntr_cmdt_seq =  (JSPUtil.getParameter(request, "bkg_cntr_cmdt_seq		".trim(), length));
			String[] po_no             =  (JSPUtil.getParameter(request, "po_no            		".trim(), length));
			String[] eai_evnt_dt       =  (JSPUtil.getParameter(request, "eai_evnt_dt      		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new BKG_CNTR_CMDT();
				model.setIbflag           		  (ibflag           	[i]);
				model.setPage_rows        		  (page_rows        	[i]);
				model.setBkg_no           		  (bkg_no           	[i]);
				model.setBkg_no_split     		  (bkg_no_split     	[i]);
				model.setCntr_no          		  (cntr_no          	[i]);
				model.setBkg_cntr_cmdt_seq		  (bkg_cntr_cmdt_seq	[i]);
				model.setPo_no            		  (po_no            	[i]);
				model.setEai_evnt_dt      		  (eai_evnt_dt      	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		BKG_CNTR_CMDT model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag            =  (JSPUtil.getParameter(request, prefix + "ibflag           		".trim(), length));
			String[] page_rows         =  (JSPUtil.getParameter(request, prefix + "page_rows        		".trim(), length));
			String[] bkg_no            =  (JSPUtil.getParameter(request, prefix + "bkg_no           		".trim(), length));
			String[] bkg_no_split      =  (JSPUtil.getParameter(request, prefix + "bkg_no_split     		".trim(), length));
			String[] cntr_no           =  (JSPUtil.getParameter(request, prefix + "cntr_no          		".trim(), length));
			String[] bkg_cntr_cmdt_seq =  (JSPUtil.getParameter(request, prefix + "bkg_cntr_cmdt_seq		".trim(), length));
			String[] po_no             =  (JSPUtil.getParameter(request, prefix + "po_no            		".trim(), length));
			String[] eai_evnt_dt       =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt      		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new BKG_CNTR_CMDT();
				model.setIbflag           		  ( ibflag           	[i]);
				model.setPage_rows        		  ( page_rows        	[i]);
				model.setBkg_no           		  ( bkg_no           	[i]);
				model.setBkg_no_split     		  ( bkg_no_split     	[i]);
				model.setCntr_no          		  ( cntr_no          	[i]);
				model.setBkg_cntr_cmdt_seq		  ( bkg_cntr_cmdt_seq	[i]);
				model.setPo_no            		  ( po_no            	[i]);
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
