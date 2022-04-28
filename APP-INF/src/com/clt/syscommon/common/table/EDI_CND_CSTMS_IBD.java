/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : EDI_CND_CSTMS_IBD.java
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
public final class EDI_CND_CSTMS_IBD implements java.io.Serializable {

	private String                    ibflag                    = "";
	private String                    page_rows                 = "";
	private String                    bl_no                     = "";
	private String                    bl_no_tp                  = "";
	private String                    bl_no_chk                 = "";
	private String                    bkg_no                    = "";
	private String                    bkg_no_split              = "";
	private String                    vsl_cd                    = "";
	private String                    skd_voy_no                = "";
	private String                    skd_dir_cd                = "";
	private String                    vsl_dchg_port_cd          = "";
	private String                    ibd_trsp_hub_cty_cd       = "";
	private String                    ibd_cstms_clr_loc_cd      = "";
	private String                    ibd_bkg_sts_cd            = "";
	private String                    ibd_tp_cd                 = "";
	private String                    ibd_no                    = "";
	private String                    ibd_iss_dt                = "";
	private String                    ibd_cstms_clr_ind_cd      = "";
	private String                    ibd_ipi_locl_ind_cd       = "";
	private String                    ibd_non_vsl_op_crr_ftr_cd = "";
	private String                    cnd_loc_gds_cd            = "";
	private String                    eai_evnt_dt               = "";

	public EDI_CND_CSTMS_IBD(){}

	public EDI_CND_CSTMS_IBD(
			String                    ibflag                   ,
			String                    page_rows                ,
			String                    bl_no                    ,
			String                    bl_no_tp                 ,
			String                    bl_no_chk                ,
			String                    bkg_no                   ,
			String                    bkg_no_split             ,
			String                    vsl_cd                   ,
			String                    skd_voy_no               ,
			String                    skd_dir_cd               ,
			String                    vsl_dchg_port_cd         ,
			String                    ibd_trsp_hub_cty_cd      ,
			String                    ibd_cstms_clr_loc_cd     ,
			String                    ibd_bkg_sts_cd           ,
			String                    ibd_tp_cd                ,
			String                    ibd_no                   ,
			String                    ibd_iss_dt               ,
			String                    ibd_cstms_clr_ind_cd     ,
			String                    ibd_ipi_locl_ind_cd      ,
			String                    ibd_non_vsl_op_crr_ftr_cd,
			String                    cnd_loc_gds_cd           ,
			String                    eai_evnt_dt              ){
		this.ibflag                    = ibflag                   ;
		this.page_rows                 = page_rows                ;
		this.bl_no                     = bl_no                    ;
		this.bl_no_tp                  = bl_no_tp                 ;
		this.bl_no_chk                 = bl_no_chk                ;
		this.bkg_no                    = bkg_no                   ;
		this.bkg_no_split              = bkg_no_split             ;
		this.vsl_cd                    = vsl_cd                   ;
		this.skd_voy_no                = skd_voy_no               ;
		this.skd_dir_cd                = skd_dir_cd               ;
		this.vsl_dchg_port_cd          = vsl_dchg_port_cd         ;
		this.ibd_trsp_hub_cty_cd       = ibd_trsp_hub_cty_cd      ;
		this.ibd_cstms_clr_loc_cd      = ibd_cstms_clr_loc_cd     ;
		this.ibd_bkg_sts_cd            = ibd_bkg_sts_cd           ;
		this.ibd_tp_cd                 = ibd_tp_cd                ;
		this.ibd_no                    = ibd_no                   ;
		this.ibd_iss_dt                = ibd_iss_dt               ;
		this.ibd_cstms_clr_ind_cd      = ibd_cstms_clr_ind_cd     ;
		this.ibd_ipi_locl_ind_cd       = ibd_ipi_locl_ind_cd      ;
		this.ibd_non_vsl_op_crr_ftr_cd = ibd_non_vsl_op_crr_ftr_cd;
		this.cnd_loc_gds_cd            = cnd_loc_gds_cd           ;
		this.eai_evnt_dt               = eai_evnt_dt              ;
	}

	// getter method is proceeding ..
	public String                    getIbflag                   (){	return ibflag                   	;	}
	public String                    getPage_rows                (){	return page_rows                	;	}
	public String                    getBl_no                    (){	return bl_no                    	;	}
	public String                    getBl_no_tp                 (){	return bl_no_tp                 	;	}
	public String                    getBl_no_chk                (){	return bl_no_chk                	;	}
	public String                    getBkg_no                   (){	return bkg_no                   	;	}
	public String                    getBkg_no_split             (){	return bkg_no_split             	;	}
	public String                    getVsl_cd                   (){	return vsl_cd                   	;	}
	public String                    getSkd_voy_no               (){	return skd_voy_no               	;	}
	public String                    getSkd_dir_cd               (){	return skd_dir_cd               	;	}
	public String                    getVsl_dchg_port_cd         (){	return vsl_dchg_port_cd         	;	}
	public String                    getIbd_trsp_hub_cty_cd      (){	return ibd_trsp_hub_cty_cd      	;	}
	public String                    getIbd_cstms_clr_loc_cd     (){	return ibd_cstms_clr_loc_cd     	;	}
	public String                    getIbd_bkg_sts_cd           (){	return ibd_bkg_sts_cd           	;	}
	public String                    getIbd_tp_cd                (){	return ibd_tp_cd                	;	}
	public String                    getIbd_no                   (){	return ibd_no                   	;	}
	public String                    getIbd_iss_dt               (){	return ibd_iss_dt               	;	}
	public String                    getIbd_cstms_clr_ind_cd     (){	return ibd_cstms_clr_ind_cd     	;	}
	public String                    getIbd_ipi_locl_ind_cd      (){	return ibd_ipi_locl_ind_cd      	;	}
	public String                    getIbd_non_vsl_op_crr_ftr_cd(){	return ibd_non_vsl_op_crr_ftr_cd	;	}
	public String                    getCnd_loc_gds_cd           (){	return cnd_loc_gds_cd           	;	}
	public String                    getEai_evnt_dt              (){	return eai_evnt_dt              	;	}

	// setter method is proceeding ..
	public void setIbflag                   ( String                    ibflag                    ){	this.ibflag                    = ibflag                   	;	}
	public void setPage_rows                ( String                    page_rows                 ){	this.page_rows                 = page_rows                	;	}
	public void setBl_no                    ( String                    bl_no                     ){	this.bl_no                     = bl_no                    	;	}
	public void setBl_no_tp                 ( String                    bl_no_tp                  ){	this.bl_no_tp                  = bl_no_tp                 	;	}
	public void setBl_no_chk                ( String                    bl_no_chk                 ){	this.bl_no_chk                 = bl_no_chk                	;	}
	public void setBkg_no                   ( String                    bkg_no                    ){	this.bkg_no                    = bkg_no                   	;	}
	public void setBkg_no_split             ( String                    bkg_no_split              ){	this.bkg_no_split              = bkg_no_split             	;	}
	public void setVsl_cd                   ( String                    vsl_cd                    ){	this.vsl_cd                    = vsl_cd                   	;	}
	public void setSkd_voy_no               ( String                    skd_voy_no                ){	this.skd_voy_no                = skd_voy_no               	;	}
	public void setSkd_dir_cd               ( String                    skd_dir_cd                ){	this.skd_dir_cd                = skd_dir_cd               	;	}
	public void setVsl_dchg_port_cd         ( String                    vsl_dchg_port_cd          ){	this.vsl_dchg_port_cd          = vsl_dchg_port_cd         	;	}
	public void setIbd_trsp_hub_cty_cd      ( String                    ibd_trsp_hub_cty_cd       ){	this.ibd_trsp_hub_cty_cd       = ibd_trsp_hub_cty_cd      	;	}
	public void setIbd_cstms_clr_loc_cd     ( String                    ibd_cstms_clr_loc_cd      ){	this.ibd_cstms_clr_loc_cd      = ibd_cstms_clr_loc_cd     	;	}
	public void setIbd_bkg_sts_cd           ( String                    ibd_bkg_sts_cd            ){	this.ibd_bkg_sts_cd            = ibd_bkg_sts_cd           	;	}
	public void setIbd_tp_cd                ( String                    ibd_tp_cd                 ){	this.ibd_tp_cd                 = ibd_tp_cd                	;	}
	public void setIbd_no                   ( String                    ibd_no                    ){	this.ibd_no                    = ibd_no                   	;	}
	public void setIbd_iss_dt               ( String                    ibd_iss_dt                ){	this.ibd_iss_dt                = ibd_iss_dt               	;	}
	public void setIbd_cstms_clr_ind_cd     ( String                    ibd_cstms_clr_ind_cd      ){	this.ibd_cstms_clr_ind_cd      = ibd_cstms_clr_ind_cd     	;	}
	public void setIbd_ipi_locl_ind_cd      ( String                    ibd_ipi_locl_ind_cd       ){	this.ibd_ipi_locl_ind_cd       = ibd_ipi_locl_ind_cd      	;	}
	public void setIbd_non_vsl_op_crr_ftr_cd( String                    ibd_non_vsl_op_crr_ftr_cd ){	this.ibd_non_vsl_op_crr_ftr_cd = ibd_non_vsl_op_crr_ftr_cd	;	}
	public void setCnd_loc_gds_cd           ( String                    cnd_loc_gds_cd            ){	this.cnd_loc_gds_cd            = cnd_loc_gds_cd           	;	}
	public void setEai_evnt_dt              ( String                    eai_evnt_dt               ){	this.eai_evnt_dt               = eai_evnt_dt              	;	}

	public static EDI_CND_CSTMS_IBD fromRequest(HttpServletRequest request) {
		EDI_CND_CSTMS_IBD model = new EDI_CND_CSTMS_IBD();
		try {
			model.setIbflag                   	(JSPUtil.getParameter(request, "ibflag                   		".trim(), ""));
			model.setPage_rows                	(JSPUtil.getParameter(request, "page_rows                		".trim(), ""));
			model.setBl_no                    	(JSPUtil.getParameter(request, "bl_no                    		".trim(), ""));
			model.setBl_no_tp                 	(JSPUtil.getParameter(request, "bl_no_tp                 		".trim(), ""));
			model.setBl_no_chk                	(JSPUtil.getParameter(request, "bl_no_chk                		".trim(), ""));
			model.setBkg_no                   	(JSPUtil.getParameter(request, "bkg_no                   		".trim(), ""));
			model.setBkg_no_split             	(JSPUtil.getParameter(request, "bkg_no_split             		".trim(), ""));
			model.setVsl_cd                   	(JSPUtil.getParameter(request, "vsl_cd                   		".trim(), ""));
			model.setSkd_voy_no               	(JSPUtil.getParameter(request, "skd_voy_no               		".trim(), ""));
			model.setSkd_dir_cd               	(JSPUtil.getParameter(request, "skd_dir_cd               		".trim(), ""));
			model.setVsl_dchg_port_cd         	(JSPUtil.getParameter(request, "vsl_dchg_port_cd         		".trim(), ""));
			model.setIbd_trsp_hub_cty_cd      	(JSPUtil.getParameter(request, "ibd_trsp_hub_cty_cd      		".trim(), ""));
			model.setIbd_cstms_clr_loc_cd     	(JSPUtil.getParameter(request, "ibd_cstms_clr_loc_cd     		".trim(), ""));
			model.setIbd_bkg_sts_cd           	(JSPUtil.getParameter(request, "ibd_bkg_sts_cd           		".trim(), ""));
			model.setIbd_tp_cd                	(JSPUtil.getParameter(request, "ibd_tp_cd                		".trim(), ""));
			model.setIbd_no                   	(JSPUtil.getParameter(request, "ibd_no                   		".trim(), ""));
			model.setIbd_iss_dt               	(JSPUtil.getParameter(request, "ibd_iss_dt               		".trim(), ""));
			model.setIbd_cstms_clr_ind_cd     	(JSPUtil.getParameter(request, "ibd_cstms_clr_ind_cd     		".trim(), ""));
			model.setIbd_ipi_locl_ind_cd      	(JSPUtil.getParameter(request, "ibd_ipi_locl_ind_cd      		".trim(), ""));
			model.setIbd_non_vsl_op_crr_ftr_cd	(JSPUtil.getParameter(request, "ibd_non_vsl_op_crr_ftr_cd		".trim(), ""));
			model.setCnd_loc_gds_cd           	(JSPUtil.getParameter(request, "cnd_loc_gds_cd           		".trim(), ""));
			model.setEai_evnt_dt              	(JSPUtil.getParameter(request, "eai_evnt_dt              		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		EDI_CND_CSTMS_IBD model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag                    =  (JSPUtil.getParameter(request, "ibflag                   		".trim(), length));
			String[] page_rows                 =  (JSPUtil.getParameter(request, "page_rows                		".trim(), length));
			String[] bl_no                     =  (JSPUtil.getParameter(request, "bl_no                    		".trim(), length));
			String[] bl_no_tp                  =  (JSPUtil.getParameter(request, "bl_no_tp                 		".trim(), length));
			String[] bl_no_chk                 =  (JSPUtil.getParameter(request, "bl_no_chk                		".trim(), length));
			String[] bkg_no                    =  (JSPUtil.getParameter(request, "bkg_no                   		".trim(), length));
			String[] bkg_no_split              =  (JSPUtil.getParameter(request, "bkg_no_split             		".trim(), length));
			String[] vsl_cd                    =  (JSPUtil.getParameter(request, "vsl_cd                   		".trim(), length));
			String[] skd_voy_no                =  (JSPUtil.getParameter(request, "skd_voy_no               		".trim(), length));
			String[] skd_dir_cd                =  (JSPUtil.getParameter(request, "skd_dir_cd               		".trim(), length));
			String[] vsl_dchg_port_cd          =  (JSPUtil.getParameter(request, "vsl_dchg_port_cd         		".trim(), length));
			String[] ibd_trsp_hub_cty_cd       =  (JSPUtil.getParameter(request, "ibd_trsp_hub_cty_cd      		".trim(), length));
			String[] ibd_cstms_clr_loc_cd      =  (JSPUtil.getParameter(request, "ibd_cstms_clr_loc_cd     		".trim(), length));
			String[] ibd_bkg_sts_cd            =  (JSPUtil.getParameter(request, "ibd_bkg_sts_cd           		".trim(), length));
			String[] ibd_tp_cd                 =  (JSPUtil.getParameter(request, "ibd_tp_cd                		".trim(), length));
			String[] ibd_no                    =  (JSPUtil.getParameter(request, "ibd_no                   		".trim(), length));
			String[] ibd_iss_dt                =  (JSPUtil.getParameter(request, "ibd_iss_dt               		".trim(), length));
			String[] ibd_cstms_clr_ind_cd      =  (JSPUtil.getParameter(request, "ibd_cstms_clr_ind_cd     		".trim(), length));
			String[] ibd_ipi_locl_ind_cd       =  (JSPUtil.getParameter(request, "ibd_ipi_locl_ind_cd      		".trim(), length));
			String[] ibd_non_vsl_op_crr_ftr_cd =  (JSPUtil.getParameter(request, "ibd_non_vsl_op_crr_ftr_cd		".trim(), length));
			String[] cnd_loc_gds_cd            =  (JSPUtil.getParameter(request, "cnd_loc_gds_cd           		".trim(), length));
			String[] eai_evnt_dt               =  (JSPUtil.getParameter(request, "eai_evnt_dt              		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new EDI_CND_CSTMS_IBD();
				model.setIbflag                   		  (ibflag                   	[i]);
				model.setPage_rows                		  (page_rows                	[i]);
				model.setBl_no                    		  (bl_no                    	[i]);
				model.setBl_no_tp                 		  (bl_no_tp                 	[i]);
				model.setBl_no_chk                		  (bl_no_chk                	[i]);
				model.setBkg_no                   		  (bkg_no                   	[i]);
				model.setBkg_no_split             		  (bkg_no_split             	[i]);
				model.setVsl_cd                   		  (vsl_cd                   	[i]);
				model.setSkd_voy_no               		  (skd_voy_no               	[i]);
				model.setSkd_dir_cd               		  (skd_dir_cd               	[i]);
				model.setVsl_dchg_port_cd         		  (vsl_dchg_port_cd         	[i]);
				model.setIbd_trsp_hub_cty_cd      		  (ibd_trsp_hub_cty_cd      	[i]);
				model.setIbd_cstms_clr_loc_cd     		  (ibd_cstms_clr_loc_cd     	[i]);
				model.setIbd_bkg_sts_cd           		  (ibd_bkg_sts_cd           	[i]);
				model.setIbd_tp_cd                		  (ibd_tp_cd                	[i]);
				model.setIbd_no                   		  (ibd_no                   	[i]);
				model.setIbd_iss_dt               		  (ibd_iss_dt               	[i]);
				model.setIbd_cstms_clr_ind_cd     		  (ibd_cstms_clr_ind_cd     	[i]);
				model.setIbd_ipi_locl_ind_cd      		  (ibd_ipi_locl_ind_cd      	[i]);
				model.setIbd_non_vsl_op_crr_ftr_cd		  (ibd_non_vsl_op_crr_ftr_cd	[i]);
				model.setCnd_loc_gds_cd           		  (cnd_loc_gds_cd           	[i]);
				model.setEai_evnt_dt              		  (eai_evnt_dt              	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		EDI_CND_CSTMS_IBD model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag                    =  (JSPUtil.getParameter(request, prefix + "ibflag                   		".trim(), length));
			String[] page_rows                 =  (JSPUtil.getParameter(request, prefix + "page_rows                		".trim(), length));
			String[] bl_no                     =  (JSPUtil.getParameter(request, prefix + "bl_no                    		".trim(), length));
			String[] bl_no_tp                  =  (JSPUtil.getParameter(request, prefix + "bl_no_tp                 		".trim(), length));
			String[] bl_no_chk                 =  (JSPUtil.getParameter(request, prefix + "bl_no_chk                		".trim(), length));
			String[] bkg_no                    =  (JSPUtil.getParameter(request, prefix + "bkg_no                   		".trim(), length));
			String[] bkg_no_split              =  (JSPUtil.getParameter(request, prefix + "bkg_no_split             		".trim(), length));
			String[] vsl_cd                    =  (JSPUtil.getParameter(request, prefix + "vsl_cd                   		".trim(), length));
			String[] skd_voy_no                =  (JSPUtil.getParameter(request, prefix + "skd_voy_no               		".trim(), length));
			String[] skd_dir_cd                =  (JSPUtil.getParameter(request, prefix + "skd_dir_cd               		".trim(), length));
			String[] vsl_dchg_port_cd          =  (JSPUtil.getParameter(request, prefix + "vsl_dchg_port_cd         		".trim(), length));
			String[] ibd_trsp_hub_cty_cd       =  (JSPUtil.getParameter(request, prefix + "ibd_trsp_hub_cty_cd      		".trim(), length));
			String[] ibd_cstms_clr_loc_cd      =  (JSPUtil.getParameter(request, prefix + "ibd_cstms_clr_loc_cd     		".trim(), length));
			String[] ibd_bkg_sts_cd            =  (JSPUtil.getParameter(request, prefix + "ibd_bkg_sts_cd           		".trim(), length));
			String[] ibd_tp_cd                 =  (JSPUtil.getParameter(request, prefix + "ibd_tp_cd                		".trim(), length));
			String[] ibd_no                    =  (JSPUtil.getParameter(request, prefix + "ibd_no                   		".trim(), length));
			String[] ibd_iss_dt                =  (JSPUtil.getParameter(request, prefix + "ibd_iss_dt               		".trim(), length));
			String[] ibd_cstms_clr_ind_cd      =  (JSPUtil.getParameter(request, prefix + "ibd_cstms_clr_ind_cd     		".trim(), length));
			String[] ibd_ipi_locl_ind_cd       =  (JSPUtil.getParameter(request, prefix + "ibd_ipi_locl_ind_cd      		".trim(), length));
			String[] ibd_non_vsl_op_crr_ftr_cd =  (JSPUtil.getParameter(request, prefix + "ibd_non_vsl_op_crr_ftr_cd		".trim(), length));
			String[] cnd_loc_gds_cd            =  (JSPUtil.getParameter(request, prefix + "cnd_loc_gds_cd           		".trim(), length));
			String[] eai_evnt_dt               =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt              		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new EDI_CND_CSTMS_IBD();
				model.setIbflag                   		  ( ibflag                   	[i]);
				model.setPage_rows                		  ( page_rows                	[i]);
				model.setBl_no                    		  ( bl_no                    	[i]);
				model.setBl_no_tp                 		  ( bl_no_tp                 	[i]);
				model.setBl_no_chk                		  ( bl_no_chk                	[i]);
				model.setBkg_no                   		  ( bkg_no                   	[i]);
				model.setBkg_no_split             		  ( bkg_no_split             	[i]);
				model.setVsl_cd                   		  ( vsl_cd                   	[i]);
				model.setSkd_voy_no               		  ( skd_voy_no               	[i]);
				model.setSkd_dir_cd               		  ( skd_dir_cd               	[i]);
				model.setVsl_dchg_port_cd         		  ( vsl_dchg_port_cd         	[i]);
				model.setIbd_trsp_hub_cty_cd      		  ( ibd_trsp_hub_cty_cd      	[i]);
				model.setIbd_cstms_clr_loc_cd     		  ( ibd_cstms_clr_loc_cd     	[i]);
				model.setIbd_bkg_sts_cd           		  ( ibd_bkg_sts_cd           	[i]);
				model.setIbd_tp_cd                		  ( ibd_tp_cd                	[i]);
				model.setIbd_no                   		  ( ibd_no                   	[i]);
				model.setIbd_iss_dt               		  ( ibd_iss_dt               	[i]);
				model.setIbd_cstms_clr_ind_cd     		  ( ibd_cstms_clr_ind_cd     	[i]);
				model.setIbd_ipi_locl_ind_cd      		  ( ibd_ipi_locl_ind_cd      	[i]);
				model.setIbd_non_vsl_op_crr_ftr_cd		  ( ibd_non_vsl_op_crr_ftr_cd	[i]);
				model.setCnd_loc_gds_cd           		  ( cnd_loc_gds_cd           	[i]);
				model.setEai_evnt_dt              		  ( eai_evnt_dt              	[i]);
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
