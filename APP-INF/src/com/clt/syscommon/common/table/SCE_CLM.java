/*=========================================================
*Copyright(c) 2007 CyberLogitec
*@FileName : SCE_CLM.java
*@FileTitle : CLM Data 관리
*Open Issues :
*Change history :
*@LastModifyDate : 2007-02-06
*@LastModifier : JeongSeon An
*@LastVersion : 1.0
* 2007-02-06 JeongSeon An
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
 * @author Kildong_hong
 * @since J2EE 1.4
 */
public final class SCE_CLM implements java.io.Serializable {

	private String             ibflag             = "";
	private String             page_rows          = "";
	private String             cntr_no            = "";
	private String             cnmv_yr            = "";
	private String             cnmv_id_no         = "";
	private String             clm_seq            = "";
	private String             arr_dt             = "";
	private String             arr_loc_nm         = "";
	private String             arr_ste_cd         = "";
	private String             dep_dt             = "";
	private String             dep_loc_nm         = "";
	private String             dep_ste_cd         = "";
	private String             fcar_no            = "";
	private String             clm_sght_cd        = "";
	private String             full_mty_cd        = "";
	private String             clm_crr_nm         = "";
	private String             trsp_mod_tp_cd     = "";
	private String             trn_no             = "";
	private String             arr_splc_cd        = "";
	private String             dep_splc_cd        = "";
	private String             clm_cyc_no         = "";
	private String             trsp_so_ofc_cty_cd = "";
	private String             trsp_so_seq        = "";
	private String             clm_rcv_dt         = "";

	public SCE_CLM(){}

	public SCE_CLM(
			String             ibflag            ,
			String             page_rows         ,
			String             cntr_no           ,
			String             cnmv_yr           ,
			String             cnmv_id_no        ,
			String             clm_seq           ,
			String             arr_dt            ,
			String             arr_loc_nm        ,
			String             arr_ste_cd        ,
			String             dep_dt            ,
			String             dep_loc_nm        ,
			String             dep_ste_cd        ,
			String             fcar_no           ,
			String             clm_sght_cd       ,
			String             full_mty_cd       ,
			String             clm_crr_nm        ,
			String             trsp_mod_tp_cd    ,
			String             trn_no            ,
			String             arr_splc_cd       ,
			String             dep_splc_cd       ,
			String             clm_cyc_no        ,
			String             trsp_so_ofc_cty_cd,
			String             trsp_so_seq       ,
			String             clm_rcv_dt        ){
		this.ibflag             = ibflag            ;
		this.page_rows          = page_rows         ;
		this.cntr_no            = cntr_no           ;
		this.cnmv_yr            = cnmv_yr           ;
		this.cnmv_id_no         = cnmv_id_no        ;
		this.clm_seq            = clm_seq           ;
		this.arr_dt             = arr_dt            ;
		this.arr_loc_nm         = arr_loc_nm        ;
		this.arr_ste_cd         = arr_ste_cd        ;
		this.dep_dt             = dep_dt            ;
		this.dep_loc_nm         = dep_loc_nm        ;
		this.dep_ste_cd         = dep_ste_cd        ;
		this.fcar_no            = fcar_no           ;
		this.clm_sght_cd        = clm_sght_cd       ;
		this.full_mty_cd        = full_mty_cd       ;
		this.clm_crr_nm         = clm_crr_nm        ;
		this.trsp_mod_tp_cd     = trsp_mod_tp_cd    ;
		this.trn_no             = trn_no            ;
		this.arr_splc_cd        = arr_splc_cd       ;
		this.dep_splc_cd        = dep_splc_cd       ;
		this.clm_cyc_no         = clm_cyc_no        ;
		this.trsp_so_ofc_cty_cd = trsp_so_ofc_cty_cd;
		this.trsp_so_seq        = trsp_so_seq       ;
		this.clm_rcv_dt         = clm_rcv_dt        ;
	}

	// getter method is proceeding ..
	public String             getIbflag            (){	return ibflag            	;	}
	public String             getPage_rows         (){	return page_rows         	;	}
	public String             getCntr_no           (){	return cntr_no           	;	}
	public String             getCnmv_yr           (){	return cnmv_yr           	;	}
	public String             getCnmv_id_no        (){	return cnmv_id_no        	;	}
	public String             getClm_seq           (){	return clm_seq           	;	}
	public String             getArr_dt            (){	return arr_dt            	;	}
	public String             getArr_loc_nm        (){	return arr_loc_nm        	;	}
	public String             getArr_ste_cd        (){	return arr_ste_cd        	;	}
	public String             getDep_dt            (){	return dep_dt            	;	}
	public String             getDep_loc_nm        (){	return dep_loc_nm        	;	}
	public String             getDep_ste_cd        (){	return dep_ste_cd        	;	}
	public String             getFcar_no           (){	return fcar_no           	;	}
	public String             getClm_sght_cd       (){	return clm_sght_cd       	;	}
	public String             getFull_mty_cd       (){	return full_mty_cd       	;	}
	public String             getClm_crr_nm        (){	return clm_crr_nm        	;	}
	public String             getTrsp_mod_tp_cd    (){	return trsp_mod_tp_cd    	;	}
	public String             getTrn_no            (){	return trn_no            	;	}
	public String             getArr_splc_cd       (){	return arr_splc_cd       	;	}
	public String             getDep_splc_cd       (){	return dep_splc_cd       	;	}
	public String             getClm_cyc_no        (){	return clm_cyc_no        	;	}
	public String             getTrsp_so_ofc_cty_cd(){	return trsp_so_ofc_cty_cd	;	}
	public String             getTrsp_so_seq       (){	return trsp_so_seq       	;	}
	public String             getClm_rcv_dt        (){	return clm_rcv_dt        	;	}

	// setter method is proceeding ..
	public void setIbflag            ( String             ibflag             ){	this.ibflag             = ibflag            	;	}
	public void setPage_rows         ( String             page_rows          ){	this.page_rows          = page_rows         	;	}
	public void setCntr_no           ( String             cntr_no            ){	this.cntr_no            = cntr_no           	;	}
	public void setCnmv_yr           ( String             cnmv_yr            ){	this.cnmv_yr            = cnmv_yr           	;	}
	public void setCnmv_id_no        ( String             cnmv_id_no         ){	this.cnmv_id_no         = cnmv_id_no        	;	}
	public void setClm_seq           ( String             clm_seq            ){	this.clm_seq            = clm_seq           	;	}
	public void setArr_dt            ( String             arr_dt             ){	this.arr_dt             = arr_dt            	;	}
	public void setArr_loc_nm        ( String             arr_loc_nm         ){	this.arr_loc_nm         = arr_loc_nm        	;	}
	public void setArr_ste_cd        ( String             arr_ste_cd         ){	this.arr_ste_cd         = arr_ste_cd        	;	}
	public void setDep_dt            ( String             dep_dt             ){	this.dep_dt             = dep_dt            	;	}
	public void setDep_loc_nm        ( String             dep_loc_nm         ){	this.dep_loc_nm         = dep_loc_nm        	;	}
	public void setDep_ste_cd        ( String             dep_ste_cd         ){	this.dep_ste_cd         = dep_ste_cd        	;	}
	public void setFcar_no           ( String             fcar_no            ){	this.fcar_no            = fcar_no           	;	}
	public void setClm_sght_cd       ( String             clm_sght_cd        ){	this.clm_sght_cd        = clm_sght_cd       	;	}
	public void setFull_mty_cd       ( String             full_mty_cd        ){	this.full_mty_cd        = full_mty_cd       	;	}
	public void setClm_crr_nm        ( String             clm_crr_nm         ){	this.clm_crr_nm         = clm_crr_nm        	;	}
	public void setTrsp_mod_tp_cd    ( String             trsp_mod_tp_cd     ){	this.trsp_mod_tp_cd     = trsp_mod_tp_cd    	;	}
	public void setTrn_no            ( String             trn_no             ){	this.trn_no             = trn_no            	;	}
	public void setArr_splc_cd       ( String             arr_splc_cd        ){	this.arr_splc_cd        = arr_splc_cd       	;	}
	public void setDep_splc_cd       ( String             dep_splc_cd        ){	this.dep_splc_cd        = dep_splc_cd       	;	}
	public void setClm_cyc_no        ( String             clm_cyc_no         ){	this.clm_cyc_no         = clm_cyc_no        	;	}
	public void setTrsp_so_ofc_cty_cd( String             trsp_so_ofc_cty_cd ){	this.trsp_so_ofc_cty_cd = trsp_so_ofc_cty_cd	;	}
	public void setTrsp_so_seq       ( String             trsp_so_seq        ){	this.trsp_so_seq        = trsp_so_seq       	;	}
	public void setClm_rcv_dt        ( String             clm_rcv_dt         ){	this.clm_rcv_dt         = clm_rcv_dt        	;	}

	public static SCE_CLM fromRequest(HttpServletRequest request) {
		SCE_CLM model = new SCE_CLM();
		try {
			model.setIbflag            	(JSPUtil.getParameter(request, "ibflag            		".trim(), ""));
			model.setPage_rows         	(JSPUtil.getParameter(request, "page_rows         		".trim(), ""));
			model.setCntr_no           	(JSPUtil.getParameter(request, "cntr_no           		".trim(), ""));
			model.setCnmv_yr           	(JSPUtil.getParameter(request, "cnmv_yr           		".trim(), ""));
			model.setCnmv_id_no        	(JSPUtil.getParameter(request, "cnmv_id_no        		".trim(), ""));
			model.setClm_seq           	(JSPUtil.getParameter(request, "clm_seq           		".trim(), ""));
			model.setArr_dt            	(JSPUtil.getParameter(request, "arr_dt            		".trim(), ""));
			model.setArr_loc_nm        	(JSPUtil.getParameter(request, "arr_loc_nm        		".trim(), ""));
			model.setArr_ste_cd        	(JSPUtil.getParameter(request, "arr_ste_cd        		".trim(), ""));
			model.setDep_dt            	(JSPUtil.getParameter(request, "dep_dt            		".trim(), ""));
			model.setDep_loc_nm        	(JSPUtil.getParameter(request, "dep_loc_nm        		".trim(), ""));
			model.setDep_ste_cd        	(JSPUtil.getParameter(request, "dep_ste_cd        		".trim(), ""));
			model.setFcar_no           	(JSPUtil.getParameter(request, "fcar_no           		".trim(), ""));
			model.setClm_sght_cd       	(JSPUtil.getParameter(request, "clm_sght_cd       		".trim(), ""));
			model.setFull_mty_cd       	(JSPUtil.getParameter(request, "full_mty_cd       		".trim(), ""));
			model.setClm_crr_nm        	(JSPUtil.getParameter(request, "clm_crr_nm        		".trim(), ""));
			model.setTrsp_mod_tp_cd    	(JSPUtil.getParameter(request, "trsp_mod_tp_cd    		".trim(), ""));
			model.setTrn_no            	(JSPUtil.getParameter(request, "trn_no            		".trim(), ""));
			model.setArr_splc_cd       	(JSPUtil.getParameter(request, "arr_splc_cd       		".trim(), ""));
			model.setDep_splc_cd       	(JSPUtil.getParameter(request, "dep_splc_cd       		".trim(), ""));
			model.setClm_cyc_no        	(JSPUtil.getParameter(request, "clm_cyc_no        		".trim(), ""));
			model.setTrsp_so_ofc_cty_cd	(JSPUtil.getParameter(request, "trsp_so_ofc_cty_cd		".trim(), ""));
			model.setTrsp_so_seq       	(JSPUtil.getParameter(request, "trsp_so_seq       		".trim(), ""));
			model.setClm_rcv_dt        	(JSPUtil.getParameter(request, "clm_rcv_dt        		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		SCE_CLM model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag             =  (JSPUtil.getParameter(request, "ibflag            		".trim(), length));
			String[] page_rows          =  (JSPUtil.getParameter(request, "page_rows         		".trim(), length));
			String[] cntr_no            =  (JSPUtil.getParameter(request, "cntr_no           		".trim(), length));
			String[] cnmv_yr            =  (JSPUtil.getParameter(request, "cnmv_yr           		".trim(), length));
			String[] cnmv_id_no         =  (JSPUtil.getParameter(request, "cnmv_id_no        		".trim(), length));
			String[] clm_seq            =  (JSPUtil.getParameter(request, "clm_seq           		".trim(), length));
			String[] arr_dt             =  (JSPUtil.getParameter(request, "arr_dt            		".trim(), length));
			String[] arr_loc_nm         =  (JSPUtil.getParameter(request, "arr_loc_nm        		".trim(), length));
			String[] arr_ste_cd         =  (JSPUtil.getParameter(request, "arr_ste_cd        		".trim(), length));
			String[] dep_dt             =  (JSPUtil.getParameter(request, "dep_dt            		".trim(), length));
			String[] dep_loc_nm         =  (JSPUtil.getParameter(request, "dep_loc_nm        		".trim(), length));
			String[] dep_ste_cd         =  (JSPUtil.getParameter(request, "dep_ste_cd        		".trim(), length));
			String[] fcar_no            =  (JSPUtil.getParameter(request, "fcar_no           		".trim(), length));
			String[] clm_sght_cd        =  (JSPUtil.getParameter(request, "clm_sght_cd       		".trim(), length));
			String[] full_mty_cd        =  (JSPUtil.getParameter(request, "full_mty_cd       		".trim(), length));
			String[] clm_crr_nm         =  (JSPUtil.getParameter(request, "clm_crr_nm        		".trim(), length));
			String[] trsp_mod_tp_cd     =  (JSPUtil.getParameter(request, "trsp_mod_tp_cd    		".trim(), length));
			String[] trn_no             =  (JSPUtil.getParameter(request, "trn_no            		".trim(), length));
			String[] arr_splc_cd        =  (JSPUtil.getParameter(request, "arr_splc_cd       		".trim(), length));
			String[] dep_splc_cd        =  (JSPUtil.getParameter(request, "dep_splc_cd       		".trim(), length));
			String[] clm_cyc_no         =  (JSPUtil.getParameter(request, "clm_cyc_no        		".trim(), length));
			String[] trsp_so_ofc_cty_cd =  (JSPUtil.getParameter(request, "trsp_so_ofc_cty_cd		".trim(), length));
			String[] trsp_so_seq        =  (JSPUtil.getParameter(request, "trsp_so_seq       		".trim(), length));
			String[] clm_rcv_dt         =  (JSPUtil.getParameter(request, "clm_rcv_dt        		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new SCE_CLM();
				model.setIbflag            		  (ibflag            	[i]);
				model.setPage_rows         		  (page_rows         	[i]);
				model.setCntr_no           		  (cntr_no           	[i]);
				model.setCnmv_yr           		  (cnmv_yr           	[i]);
				model.setCnmv_id_no        		  (cnmv_id_no        	[i]);
				model.setClm_seq           		  (clm_seq           	[i]);
				model.setArr_dt            		  (arr_dt            	[i]);
				model.setArr_loc_nm        		  (arr_loc_nm        	[i]);
				model.setArr_ste_cd        		  (arr_ste_cd        	[i]);
				model.setDep_dt            		  (dep_dt            	[i]);
				model.setDep_loc_nm        		  (dep_loc_nm        	[i]);
				model.setDep_ste_cd        		  (dep_ste_cd        	[i]);
				model.setFcar_no           		  (fcar_no           	[i]);
				model.setClm_sght_cd       		  (clm_sght_cd       	[i]);
				model.setFull_mty_cd       		  (full_mty_cd       	[i]);
				model.setClm_crr_nm        		  (clm_crr_nm        	[i]);
				model.setTrsp_mod_tp_cd    		  (trsp_mod_tp_cd    	[i]);
				model.setTrn_no            		  (trn_no            	[i]);
				model.setArr_splc_cd       		  (arr_splc_cd       	[i]);
				model.setDep_splc_cd       		  (dep_splc_cd       	[i]);
				model.setClm_cyc_no        		  (clm_cyc_no        	[i]);
				model.setTrsp_so_ofc_cty_cd		  (trsp_so_ofc_cty_cd	[i]);
				model.setTrsp_so_seq       		  (trsp_so_seq       	[i]);
				model.setClm_rcv_dt        		  (clm_rcv_dt        	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		SCE_CLM model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag             =  (JSPUtil.getParameter(request, prefix + "ibflag            		".trim(), length));
			String[] page_rows          =  (JSPUtil.getParameter(request, prefix + "page_rows         		".trim(), length));
			String[] cntr_no            =  (JSPUtil.getParameter(request, prefix + "cntr_no           		".trim(), length));
			String[] cnmv_yr            =  (JSPUtil.getParameter(request, prefix + "cnmv_yr           		".trim(), length));
			String[] cnmv_id_no         =  (JSPUtil.getParameter(request, prefix + "cnmv_id_no        		".trim(), length));
			String[] clm_seq            =  (JSPUtil.getParameter(request, prefix + "clm_seq           		".trim(), length));
			String[] arr_dt             =  (JSPUtil.getParameter(request, prefix + "arr_dt            		".trim(), length));
			String[] arr_loc_nm         =  (JSPUtil.getParameter(request, prefix + "arr_loc_nm        		".trim(), length));
			String[] arr_ste_cd         =  (JSPUtil.getParameter(request, prefix + "arr_ste_cd        		".trim(), length));
			String[] dep_dt             =  (JSPUtil.getParameter(request, prefix + "dep_dt            		".trim(), length));
			String[] dep_loc_nm         =  (JSPUtil.getParameter(request, prefix + "dep_loc_nm        		".trim(), length));
			String[] dep_ste_cd         =  (JSPUtil.getParameter(request, prefix + "dep_ste_cd        		".trim(), length));
			String[] fcar_no            =  (JSPUtil.getParameter(request, prefix + "fcar_no           		".trim(), length));
			String[] clm_sght_cd        =  (JSPUtil.getParameter(request, prefix + "clm_sght_cd       		".trim(), length));
			String[] full_mty_cd        =  (JSPUtil.getParameter(request, prefix + "full_mty_cd       		".trim(), length));
			String[] clm_crr_nm         =  (JSPUtil.getParameter(request, prefix + "clm_crr_nm        		".trim(), length));
			String[] trsp_mod_tp_cd     =  (JSPUtil.getParameter(request, prefix + "trsp_mod_tp_cd    		".trim(), length));
			String[] trn_no             =  (JSPUtil.getParameter(request, prefix + "trn_no            		".trim(), length));
			String[] arr_splc_cd        =  (JSPUtil.getParameter(request, prefix + "arr_splc_cd       		".trim(), length));
			String[] dep_splc_cd        =  (JSPUtil.getParameter(request, prefix + "dep_splc_cd       		".trim(), length));
			String[] clm_cyc_no         =  (JSPUtil.getParameter(request, prefix + "clm_cyc_no        		".trim(), length));
			String[] trsp_so_ofc_cty_cd =  (JSPUtil.getParameter(request, prefix + "trsp_so_ofc_cty_cd		".trim(), length));
			String[] trsp_so_seq        =  (JSPUtil.getParameter(request, prefix + "trsp_so_seq       		".trim(), length));
			String[] clm_rcv_dt         =  (JSPUtil.getParameter(request, prefix + "clm_rcv_dt        		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new SCE_CLM();
				model.setIbflag            		  ( ibflag            	[i]);
				model.setPage_rows         		  ( page_rows         	[i]);
				model.setCntr_no           		  ( cntr_no           	[i]);
				model.setCnmv_yr           		  ( cnmv_yr           	[i]);
				model.setCnmv_id_no        		  ( cnmv_id_no        	[i]);
				model.setClm_seq           		  ( clm_seq           	[i]);
				model.setArr_dt            		  ( arr_dt            	[i]);
				model.setArr_loc_nm        		  ( arr_loc_nm        	[i]);
				model.setArr_ste_cd        		  ( arr_ste_cd        	[i]);
				model.setDep_dt            		  ( dep_dt            	[i]);
				model.setDep_loc_nm        		  ( dep_loc_nm        	[i]);
				model.setDep_ste_cd        		  ( dep_ste_cd        	[i]);
				model.setFcar_no           		  ( fcar_no           	[i]);
				model.setClm_sght_cd       		  ( clm_sght_cd       	[i]);
				model.setFull_mty_cd       		  ( full_mty_cd       	[i]);
				model.setClm_crr_nm        		  ( clm_crr_nm        	[i]);
				model.setTrsp_mod_tp_cd    		  ( trsp_mod_tp_cd    	[i]);
				model.setTrn_no            		  ( trn_no            	[i]);
				model.setArr_splc_cd       		  ( arr_splc_cd       	[i]);
				model.setDep_splc_cd       		  ( dep_splc_cd       	[i]);
				model.setClm_cyc_no        		  ( clm_cyc_no        	[i]);
				model.setTrsp_so_ofc_cty_cd		  ( trsp_so_ofc_cty_cd	[i]);
				model.setTrsp_so_seq       		  ( trsp_so_seq       	[i]);
				model.setClm_rcv_dt        		  ( clm_rcv_dt        	[i]);
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
