/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : MDM_CUSTOMER.java
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
public final class MdmCustCntcPnt implements java.io.Serializable {

	private String ibflag               = "";
	private String page_rows            = "";
	private String cust_cnt_cd          = "";
	private String cust_seq             = "";
	private String cust_cntc_pnt_seq    = "";
	private String cust_eml             = "";
	private String cust_ip              = "";
	private String cust_url             = "";
	private String intl_phn_no          = "";
	private String phn_no               = "";
	private String intl_fax_no          = "";
	private String fax_no               = "";
	private String eai_evnt_dt          = "";
	
	public MdmCustCntcPnt(){}

	public MdmCustCntcPnt(
			String ibflag           ,
			String page_rows        ,
			String cust_cnt_cd      ,
			String cust_seq         ,
			String cust_cntc_pnt_seq,
			String cust_eml         ,
			String cust_ip          ,
			String cust_url     	,
			String intl_phn_no   	,
			String phn_no        	,
			String intl_fax_no	    ,
			String fax_no      	    ,
			String eai_evnt_dt){
		this.ibflag               = ibflag           ;
		this.page_rows            = page_rows        ;
		this.cust_cnt_cd          = cust_cnt_cd      ;
		this.cust_seq             = cust_seq         ;
		this.cust_cntc_pnt_seq    = cust_cntc_pnt_seq;
		this.cust_eml             = cust_eml         ;
		this.cust_ip              = cust_ip          ;
		this.cust_url             = cust_url         ;
		this.intl_phn_no          = intl_phn_no      ;
		this.phn_no               = phn_no           ;
		this.intl_fax_no          = intl_fax_no      ;
		this.fax_no               = fax_no           ;
		this.eai_evnt_dt          = eai_evnt_dt      ;
	}

	// getter method is proceeding ..
	public String getIbflag            (){return ibflag           ;}
	public String getPage_rows         (){return page_rows        ;}
	public String getCust_cnt_cd       (){return cust_cnt_cd      ;}
	public String getCust_seq          (){return cust_seq         ;}
	public String getCust_cntc_pnt_seq (){return cust_cntc_pnt_seq;}
	public String getCust_eml          (){return cust_eml         ;}
	public String getCust_ip           (){return cust_ip          ;}
	public String getCust_url          (){return cust_url     	  ;}
	public String getIntl_phn_no       (){return intl_phn_no   	  ;}
	public String getPhn_no            (){return phn_no        	  ;}
	public String getIntl_fax_no       (){return intl_fax_no	  ;}
	public String getFax_no            (){return fax_no        	  ;}
	public String getEai_evnt_dt       (){return eai_evnt_dt      ;}
	
	// setter method is proceeding ..
	public void setIbflag            ( String ibflag            ){this.ibflag             = ibflag              ;}
	public void setPage_rows         ( String page_rows         ){this.page_rows          = page_rows           ;}
	public void setCust_cnt_cd       ( String cust_cnt_cd       ){this.cust_cnt_cd        = cust_cnt_cd         ;}
	public void setCust_seq          ( String cust_seq          ){this.cust_seq           = cust_seq            ;}
	public void setCust_cntc_pnt_seq ( String cust_cntc_pnt_seq ){this.cust_cntc_pnt_seq  = cust_cntc_pnt_seq	;}
	public void setCust_eml          ( String cust_eml          ){this.cust_eml           = cust_eml         	;}
	public void setCust_ip           ( String cust_ip           ){this.cust_ip            = cust_ip         	;}
	public void setCust_url          ( String cust_url          ){this.cust_url           = cust_url     		;}
	public void setIntl_phn_no       ( String intl_phn_no       ){this.intl_phn_no        = intl_phn_no   		;}
	public void setPhn_no            ( String phn_no            ){this.phn_no             = phn_no        		;}
	public void setIntl_fax_no       ( String intl_fax_no       ){this.intl_fax_no        = intl_fax_no	    	;}
	public void setFax_no            ( String fax_no            ){this.fax_no             = fax_no      		;}
	public void setEai_evnt_dt       ( String eai_evnt_dt       ){this.eai_evnt_dt        = eai_evnt_dt         ;}
	
	public static MdmCustCntcPnt fromRequest(HttpServletRequest request) {
		MdmCustCntcPnt model = new MdmCustCntcPnt();
		try {
			model.setIbflag           	(JSPUtil.getParameter(request, "ibflag              ".trim(), ""));
			model.setPage_rows          (JSPUtil.getParameter(request, "page_rows           ".trim(), ""));
			model.setCust_cnt_cd        (JSPUtil.getParameter(request, "cust_cnt_cd         ".trim(), ""));
			model.setCust_seq           (JSPUtil.getParameter(request, "cust_seq            ".trim(), ""));
			model.setCust_cntc_pnt_seq  (JSPUtil.getParameter(request, "cust_cntc_pnt_seq   ".trim(), ""));
			model.setCust_eml         	(JSPUtil.getParameter(request, "cust_eml         	".trim(), ""));
			model.setCust_ip         	(JSPUtil.getParameter(request, "cust_ip         	".trim(), ""));
			model.setCust_url     		(JSPUtil.getParameter(request, "cust_url     		".trim(), ""));
			model.setIntl_phn_no   		(JSPUtil.getParameter(request, "intl_phn_no   		".trim(), ""));
			model.setPhn_no        		(JSPUtil.getParameter(request, "phn_no        		".trim(), ""));
			model.setIntl_fax_no		(JSPUtil.getParameter(request, "intl_fax_no			".trim(), ""));
			model.setFax_no      		(JSPUtil.getParameter(request, "fax_no      		".trim(), ""));
			model.setEai_evnt_dt        (JSPUtil.getParameter(request, "eai_evnt_dt         ".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		MdmCustCntcPnt model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag             =  (JSPUtil.getParameter(request, "ibflag              	".trim(), length));
			String[] page_rows          =  (JSPUtil.getParameter(request, "page_rows           	".trim(), length));
			String[] cust_cnt_cd        =  (JSPUtil.getParameter(request, "cust_cnt_cd         	".trim(), length));
			String[] cust_seq           =  (JSPUtil.getParameter(request, "cust_seq            	".trim(), length));
			String[] cust_cntc_pnt_seq  =  (JSPUtil.getParameter(request, "cust_cntc_pnt_seq    ".trim(), length));
			String[] cust_eml          	=  (JSPUtil.getParameter(request, "cust_eml         	".trim(), length));
			String[] cust_ip          	=  (JSPUtil.getParameter(request, "cust_ip         		".trim(), length));
			String[] cust_url      		=  (JSPUtil.getParameter(request, "cust_url     		".trim(), length));
			String[] intl_phn_no    	=  (JSPUtil.getParameter(request, "intl_phn_no   		".trim(), length));
			String[] phn_no         	=  (JSPUtil.getParameter(request, "phn_no        		".trim(), length));
			String[] intl_fax_no 		=  (JSPUtil.getParameter(request, "intl_fax_no			".trim(), length));
			String[] fax_no       		=  (JSPUtil.getParameter(request, "fax_no      			".trim(), length));
			String[] eai_evnt_dt        =  (JSPUtil.getParameter(request, "eai_evnt_dt         	".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new MdmCustCntcPnt();
				model.setIbflag             (ibflag             [i]);
				model.setPage_rows          (page_rows          [i]);
				model.setCust_cnt_cd        (cust_cnt_cd        [i]);
				model.setCust_seq           (cust_seq           [i]);
				model.setCust_cntc_pnt_seq	(cust_cntc_pnt_seq  [i]);
				model.setCust_eml         	(cust_eml         	[i]);
				model.setCust_ip         	(cust_ip         	[i]);
				model.setCust_url     		(cust_url     		[i]);
				model.setIntl_phn_no   		(intl_phn_no   		[i]);
				model.setPhn_no        		(phn_no        		[i]);
				model.setIntl_fax_no		(intl_fax_no		[i]);
				model.setFax_no      		(fax_no      		[i]);
				model.setEai_evnt_dt        (eai_evnt_dt        [i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		MdmCustCntcPnt model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag             =  (JSPUtil.getParameter(request, prefix + "ibflag              ".trim(), length));
			String[] page_rows          =  (JSPUtil.getParameter(request, prefix + "page_rows           ".trim(), length));
			String[] cust_cnt_cd        =  (JSPUtil.getParameter(request, prefix + "cust_cnt_cd         ".trim(), length));
			String[] cust_seq           =  (JSPUtil.getParameter(request, prefix + "cust_seq            ".trim(), length));
			String[] cust_cntc_pnt_seq	=  (JSPUtil.getParameter(request, prefix + "cust_cntc_pnt_seq   ".trim(), length));
			String[] cust_eml          	=  (JSPUtil.getParameter(request, prefix + "cust_eml         	".trim(), length));
			String[] cust_ip          	=  (JSPUtil.getParameter(request, prefix + "cust_ip         	".trim(), length));
			String[] cust_url      		=  (JSPUtil.getParameter(request, prefix + "cust_url     		".trim(), length));
			String[] intl_phn_no    	=  (JSPUtil.getParameter(request, prefix + "intl_phn_no   		".trim(), length));
			String[] phn_no        	 	=  (JSPUtil.getParameter(request, prefix + "phn_no        		".trim(), length));
			String[] intl_fax_no 		=  (JSPUtil.getParameter(request, prefix + "intl_fax_no			".trim(), length));
			String[] fax_no       		=  (JSPUtil.getParameter(request, prefix + "fax_no      		".trim(), length));
			String[] eai_evnt_dt        =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt         ".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new MdmCustCntcPnt();
				model.setIbflag             ( ibflag            [i]);
				model.setPage_rows          ( page_rows         [i]);
				model.setCust_cnt_cd        ( cust_cnt_cd       [i]);
				model.setCust_seq           ( cust_seq          [i]);
				model.setCust_cntc_pnt_seq	( cust_cntc_pnt_seq [i]);
				model.setCust_eml         	( cust_eml         	[i]);
				model.setCust_ip         	( cust_ip         	[i]);
				model.setCust_url     		( cust_url     		[i]);
				model.setIntl_phn_no   		( intl_phn_no   	[i]);
				model.setPhn_no        		( phn_no        	[i]);
				model.setIntl_fax_no		( intl_fax_no		[i]);
				model.setFax_no      		( fax_no      		[i]);
				model.setEai_evnt_dt        ( eai_evnt_dt       [i]);
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
