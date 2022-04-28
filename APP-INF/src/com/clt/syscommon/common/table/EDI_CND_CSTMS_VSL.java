/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : EDI_CND_CSTMS_VSL.java
*@FileTitle : Adding Surcharge Agreement
*Open Issues :
*Change history :
*@LastModifyDate : 2007-06-20
*@LastModifier : agreement
*@LastVersion : 1.0
* 2007-06-20 agreement
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
public final class EDI_CND_CSTMS_VSL implements java.io.Serializable {

	private String             ibflag             = "";
	private String             page_rows          = "";
	private String             vsl_cd             = "";
	private String             skd_voy_no         = "";
	private String             skd_dir_cd         = "";
	private String             cvy_mrn_no         = "";
	private String             cvy_cap_nm         = "";
	private String             cvy_eta_dt         = "";
	private String             vsl_cvy_no         = "";
	private String             upd_usr_id         = "";
	private String             upd_dt             = "";
	private String             vsl_arr_rpt_snt_dt = "";
	private String             cvy_ack_ctrl_no    = "";
	private String             cvy_ack_cd         = "";
	private String             cvy_ack_no         = "";
	private String             rcv_err_msg        = "";
	private String             rspn_rcv_dt        = "";
	private String             cnd_cstms_rjct_cd  = "";
	private String             eai_evnt_dt        = "";

	public EDI_CND_CSTMS_VSL(){}

	public EDI_CND_CSTMS_VSL(
			String             ibflag            ,
			String             page_rows         ,
			String             vsl_cd            ,
			String             skd_voy_no        ,
			String             skd_dir_cd        ,
			String             cvy_mrn_no        ,
			String             cvy_cap_nm        ,
			String             cvy_eta_dt        ,
			String             vsl_cvy_no        ,
			String             upd_usr_id        ,
			String             upd_dt            ,
			String             vsl_arr_rpt_snt_dt,
			String             cvy_ack_ctrl_no   ,
			String             cvy_ack_cd        ,
			String             cvy_ack_no        ,
			String             rcv_err_msg       ,
			String             rspn_rcv_dt       ,
			String             cnd_cstms_rjct_cd ,
			String             eai_evnt_dt       ){
		this.ibflag             = ibflag            ;
		this.page_rows          = page_rows         ;
		this.vsl_cd             = vsl_cd            ;
		this.skd_voy_no         = skd_voy_no        ;
		this.skd_dir_cd         = skd_dir_cd        ;
		this.cvy_mrn_no         = cvy_mrn_no        ;
		this.cvy_cap_nm         = cvy_cap_nm        ;
		this.cvy_eta_dt         = cvy_eta_dt        ;
		this.vsl_cvy_no         = vsl_cvy_no        ;
		this.upd_usr_id         = upd_usr_id        ;
		this.upd_dt             = upd_dt            ;
		this.vsl_arr_rpt_snt_dt = vsl_arr_rpt_snt_dt;
		this.cvy_ack_ctrl_no    = cvy_ack_ctrl_no   ;
		this.cvy_ack_cd         = cvy_ack_cd        ;
		this.cvy_ack_no         = cvy_ack_no        ;
		this.rcv_err_msg        = rcv_err_msg       ;
		this.rspn_rcv_dt        = rspn_rcv_dt       ;
		this.cnd_cstms_rjct_cd  = cnd_cstms_rjct_cd ;
		this.eai_evnt_dt        = eai_evnt_dt       ;
	}

	// getter method is proceeding ..
	public String             getIbflag            (){	return ibflag            	;	}
	public String             getPage_rows         (){	return page_rows         	;	}
	public String             getVsl_cd            (){	return vsl_cd            	;	}
	public String             getSkd_voy_no        (){	return skd_voy_no        	;	}
	public String             getSkd_dir_cd        (){	return skd_dir_cd        	;	}
	public String             getCvy_mrn_no        (){	return cvy_mrn_no        	;	}
	public String             getCvy_cap_nm        (){	return cvy_cap_nm        	;	}
	public String             getCvy_eta_dt        (){	return cvy_eta_dt        	;	}
	public String             getVsl_cvy_no        (){	return vsl_cvy_no        	;	}
	public String             getUpd_usr_id        (){	return upd_usr_id        	;	}
	public String             getUpd_dt            (){	return upd_dt            	;	}
	public String             getVsl_arr_rpt_snt_dt(){	return vsl_arr_rpt_snt_dt	;	}
	public String             getCvy_ack_ctrl_no   (){	return cvy_ack_ctrl_no   	;	}
	public String             getCvy_ack_cd        (){	return cvy_ack_cd        	;	}
	public String             getCvy_ack_no        (){	return cvy_ack_no        	;	}
	public String             getRcv_err_msg       (){	return rcv_err_msg       	;	}
	public String             getRspn_rcv_dt       (){	return rspn_rcv_dt       	;	}
	public String             getCnd_cstms_rjct_cd (){	return cnd_cstms_rjct_cd 	;	}
	public String             getEai_evnt_dt       (){	return eai_evnt_dt       	;	}

	// setter method is proceeding ..
	public void setIbflag            ( String             ibflag             ){	this.ibflag             = ibflag            	;	}
	public void setPage_rows         ( String             page_rows          ){	this.page_rows          = page_rows         	;	}
	public void setVsl_cd            ( String             vsl_cd             ){	this.vsl_cd             = vsl_cd            	;	}
	public void setSkd_voy_no        ( String             skd_voy_no         ){	this.skd_voy_no         = skd_voy_no        	;	}
	public void setSkd_dir_cd        ( String             skd_dir_cd         ){	this.skd_dir_cd         = skd_dir_cd        	;	}
	public void setCvy_mrn_no        ( String             cvy_mrn_no         ){	this.cvy_mrn_no         = cvy_mrn_no        	;	}
	public void setCvy_cap_nm        ( String             cvy_cap_nm         ){	this.cvy_cap_nm         = cvy_cap_nm        	;	}
	public void setCvy_eta_dt        ( String             cvy_eta_dt         ){	this.cvy_eta_dt         = cvy_eta_dt        	;	}
	public void setVsl_cvy_no        ( String             vsl_cvy_no         ){	this.vsl_cvy_no         = vsl_cvy_no        	;	}
	public void setUpd_usr_id        ( String             upd_usr_id         ){	this.upd_usr_id         = upd_usr_id        	;	}
	public void setUpd_dt            ( String             upd_dt             ){	this.upd_dt             = upd_dt            	;	}
	public void setVsl_arr_rpt_snt_dt( String             vsl_arr_rpt_snt_dt ){	this.vsl_arr_rpt_snt_dt = vsl_arr_rpt_snt_dt	;	}
	public void setCvy_ack_ctrl_no   ( String             cvy_ack_ctrl_no    ){	this.cvy_ack_ctrl_no    = cvy_ack_ctrl_no   	;	}
	public void setCvy_ack_cd        ( String             cvy_ack_cd         ){	this.cvy_ack_cd         = cvy_ack_cd        	;	}
	public void setCvy_ack_no        ( String             cvy_ack_no         ){	this.cvy_ack_no         = cvy_ack_no        	;	}
	public void setRcv_err_msg       ( String             rcv_err_msg        ){	this.rcv_err_msg        = rcv_err_msg       	;	}
	public void setRspn_rcv_dt       ( String             rspn_rcv_dt        ){	this.rspn_rcv_dt        = rspn_rcv_dt       	;	}
	public void setCnd_cstms_rjct_cd ( String             cnd_cstms_rjct_cd  ){	this.cnd_cstms_rjct_cd  = cnd_cstms_rjct_cd 	;	}
	public void setEai_evnt_dt       ( String             eai_evnt_dt        ){	this.eai_evnt_dt        = eai_evnt_dt       	;	}

	public static EDI_CND_CSTMS_VSL fromRequest(HttpServletRequest request) {
		EDI_CND_CSTMS_VSL model = new EDI_CND_CSTMS_VSL();
		try {
			model.setIbflag            	(JSPUtil.getParameter(request, "ibflag            		".trim(), ""));
			model.setPage_rows         	(JSPUtil.getParameter(request, "page_rows         		".trim(), ""));
			model.setVsl_cd            	(JSPUtil.getParameter(request, "vsl_cd            		".trim(), ""));
			model.setSkd_voy_no        	(JSPUtil.getParameter(request, "skd_voy_no        		".trim(), ""));
			model.setSkd_dir_cd        	(JSPUtil.getParameter(request, "skd_dir_cd        		".trim(), ""));
			model.setCvy_mrn_no        	(JSPUtil.getParameter(request, "cvy_mrn_no        		".trim(), ""));
			model.setCvy_cap_nm        	(JSPUtil.getParameter(request, "cvy_cap_nm        		".trim(), ""));
			model.setCvy_eta_dt        	(JSPUtil.getParameter(request, "cvy_eta_dt        		".trim(), ""));
			model.setVsl_cvy_no        	(JSPUtil.getParameter(request, "vsl_cvy_no        		".trim(), ""));
			model.setUpd_usr_id        	(JSPUtil.getParameter(request, "upd_usr_id        		".trim(), ""));
			model.setUpd_dt            	(JSPUtil.getParameter(request, "upd_dt            		".trim(), ""));
			model.setVsl_arr_rpt_snt_dt	(JSPUtil.getParameter(request, "vsl_arr_rpt_snt_dt		".trim(), ""));
			model.setCvy_ack_ctrl_no   	(JSPUtil.getParameter(request, "cvy_ack_ctrl_no   		".trim(), ""));
			model.setCvy_ack_cd        	(JSPUtil.getParameter(request, "cvy_ack_cd        		".trim(), ""));
			model.setCvy_ack_no        	(JSPUtil.getParameter(request, "cvy_ack_no        		".trim(), ""));
			model.setRcv_err_msg       	(JSPUtil.getParameter(request, "rcv_err_msg       		".trim(), ""));
			model.setRspn_rcv_dt       	(JSPUtil.getParameter(request, "rspn_rcv_dt       		".trim(), ""));
			model.setCnd_cstms_rjct_cd 	(JSPUtil.getParameter(request, "cnd_cstms_rjct_cd 		".trim(), ""));
			model.setEai_evnt_dt       	(JSPUtil.getParameter(request, "eai_evnt_dt       		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		EDI_CND_CSTMS_VSL model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag             =  (JSPUtil.getParameter(request, "ibflag            		".trim(), length));
			String[] page_rows          =  (JSPUtil.getParameter(request, "page_rows         		".trim(), length));
			String[] vsl_cd             =  (JSPUtil.getParameter(request, "vsl_cd            		".trim(), length));
			String[] skd_voy_no         =  (JSPUtil.getParameter(request, "skd_voy_no        		".trim(), length));
			String[] skd_dir_cd         =  (JSPUtil.getParameter(request, "skd_dir_cd        		".trim(), length));
			String[] cvy_mrn_no         =  (JSPUtil.getParameter(request, "cvy_mrn_no        		".trim(), length));
			String[] cvy_cap_nm         =  (JSPUtil.getParameter(request, "cvy_cap_nm        		".trim(), length));
			String[] cvy_eta_dt         =  (JSPUtil.getParameter(request, "cvy_eta_dt        		".trim(), length));
			String[] vsl_cvy_no         =  (JSPUtil.getParameter(request, "vsl_cvy_no        		".trim(), length));
			String[] upd_usr_id         =  (JSPUtil.getParameter(request, "upd_usr_id        		".trim(), length));
			String[] upd_dt             =  (JSPUtil.getParameter(request, "upd_dt            		".trim(), length));
			String[] vsl_arr_rpt_snt_dt =  (JSPUtil.getParameter(request, "vsl_arr_rpt_snt_dt		".trim(), length));
			String[] cvy_ack_ctrl_no    =  (JSPUtil.getParameter(request, "cvy_ack_ctrl_no   		".trim(), length));
			String[] cvy_ack_cd         =  (JSPUtil.getParameter(request, "cvy_ack_cd        		".trim(), length));
			String[] cvy_ack_no         =  (JSPUtil.getParameter(request, "cvy_ack_no        		".trim(), length));
			String[] rcv_err_msg        =  (JSPUtil.getParameter(request, "rcv_err_msg       		".trim(), length));
			String[] rspn_rcv_dt        =  (JSPUtil.getParameter(request, "rspn_rcv_dt       		".trim(), length));
			String[] cnd_cstms_rjct_cd  =  (JSPUtil.getParameter(request, "cnd_cstms_rjct_cd 		".trim(), length));
			String[] eai_evnt_dt        =  (JSPUtil.getParameter(request, "eai_evnt_dt       		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new EDI_CND_CSTMS_VSL();
				model.setIbflag            		  (ibflag            	[i]);
				model.setPage_rows         		  (page_rows         	[i]);
				model.setVsl_cd            		  (vsl_cd            	[i]);
				model.setSkd_voy_no        		  (skd_voy_no        	[i]);
				model.setSkd_dir_cd        		  (skd_dir_cd        	[i]);
				model.setCvy_mrn_no        		  (cvy_mrn_no        	[i]);
				model.setCvy_cap_nm        		  (cvy_cap_nm        	[i]);
				model.setCvy_eta_dt        		  (cvy_eta_dt        	[i]);
				model.setVsl_cvy_no        		  (vsl_cvy_no        	[i]);
				model.setUpd_usr_id        		  (upd_usr_id        	[i]);
				model.setUpd_dt            		  (upd_dt            	[i]);
				model.setVsl_arr_rpt_snt_dt		  (vsl_arr_rpt_snt_dt	[i]);
				model.setCvy_ack_ctrl_no   		  (cvy_ack_ctrl_no   	[i]);
				model.setCvy_ack_cd        		  (cvy_ack_cd        	[i]);
				model.setCvy_ack_no        		  (cvy_ack_no        	[i]);
				model.setRcv_err_msg       		  (rcv_err_msg       	[i]);
				model.setRspn_rcv_dt       		  (rspn_rcv_dt       	[i]);
				model.setCnd_cstms_rjct_cd 		  (cnd_cstms_rjct_cd 	[i]);
				model.setEai_evnt_dt       		  (eai_evnt_dt       	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		EDI_CND_CSTMS_VSL model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag             =  (JSPUtil.getParameter(request, prefix + "ibflag            		".trim(), length));
			String[] page_rows          =  (JSPUtil.getParameter(request, prefix + "page_rows         		".trim(), length));
			String[] vsl_cd             =  (JSPUtil.getParameter(request, prefix + "vsl_cd            		".trim(), length));
			String[] skd_voy_no         =  (JSPUtil.getParameter(request, prefix + "skd_voy_no        		".trim(), length));
			String[] skd_dir_cd         =  (JSPUtil.getParameter(request, prefix + "skd_dir_cd        		".trim(), length));
			String[] cvy_mrn_no         =  (JSPUtil.getParameter(request, prefix + "cvy_mrn_no        		".trim(), length));
			String[] cvy_cap_nm         =  (JSPUtil.getParameter(request, prefix + "cvy_cap_nm        		".trim(), length));
			String[] cvy_eta_dt         =  (JSPUtil.getParameter(request, prefix + "cvy_eta_dt        		".trim(), length));
			String[] vsl_cvy_no         =  (JSPUtil.getParameter(request, prefix + "vsl_cvy_no        		".trim(), length));
			String[] upd_usr_id         =  (JSPUtil.getParameter(request, prefix + "upd_usr_id        		".trim(), length));
			String[] upd_dt             =  (JSPUtil.getParameter(request, prefix + "upd_dt            		".trim(), length));
			String[] vsl_arr_rpt_snt_dt =  (JSPUtil.getParameter(request, prefix + "vsl_arr_rpt_snt_dt		".trim(), length));
			String[] cvy_ack_ctrl_no    =  (JSPUtil.getParameter(request, prefix + "cvy_ack_ctrl_no   		".trim(), length));
			String[] cvy_ack_cd         =  (JSPUtil.getParameter(request, prefix + "cvy_ack_cd        		".trim(), length));
			String[] cvy_ack_no         =  (JSPUtil.getParameter(request, prefix + "cvy_ack_no        		".trim(), length));
			String[] rcv_err_msg        =  (JSPUtil.getParameter(request, prefix + "rcv_err_msg       		".trim(), length));
			String[] rspn_rcv_dt        =  (JSPUtil.getParameter(request, prefix + "rspn_rcv_dt       		".trim(), length));
			String[] cnd_cstms_rjct_cd  =  (JSPUtil.getParameter(request, prefix + "cnd_cstms_rjct_cd 		".trim(), length));
			String[] eai_evnt_dt        =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt       		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new EDI_CND_CSTMS_VSL();
				model.setIbflag            		  ( ibflag            	[i]);
				model.setPage_rows         		  ( page_rows         	[i]);
				model.setVsl_cd            		  ( vsl_cd            	[i]);
				model.setSkd_voy_no        		  ( skd_voy_no        	[i]);
				model.setSkd_dir_cd        		  ( skd_dir_cd        	[i]);
				model.setCvy_mrn_no        		  ( cvy_mrn_no        	[i]);
				model.setCvy_cap_nm        		  ( cvy_cap_nm        	[i]);
				model.setCvy_eta_dt        		  ( cvy_eta_dt        	[i]);
				model.setVsl_cvy_no        		  ( vsl_cvy_no        	[i]);
				model.setUpd_usr_id        		  ( upd_usr_id        	[i]);
				model.setUpd_dt            		  ( upd_dt            	[i]);
				model.setVsl_arr_rpt_snt_dt		  ( vsl_arr_rpt_snt_dt	[i]);
				model.setCvy_ack_ctrl_no   		  ( cvy_ack_ctrl_no   	[i]);
				model.setCvy_ack_cd        		  ( cvy_ack_cd        	[i]);
				model.setCvy_ack_no        		  ( cvy_ack_no        	[i]);
				model.setRcv_err_msg       		  ( rcv_err_msg       	[i]);
				model.setRspn_rcv_dt       		  ( rspn_rcv_dt       	[i]);
				model.setCnd_cstms_rjct_cd 		  ( cnd_cstms_rjct_cd 	[i]);
				model.setEai_evnt_dt       		  ( eai_evnt_dt       	[i]);
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
