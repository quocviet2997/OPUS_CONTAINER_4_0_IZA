/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : TRS_BKG_RQST_ORD_DTL.java
*@FileTitle : Adding Surcharge Agreement
*Open Issues :
*Change history :
*@LastModifyDate : 2007-05-22
*@LastModifier : agreement
*@LastVersion : 1.0
* 2007-05-22 agreement
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
public final class TrsBkgRqstOrdDtlVO implements java.io.Serializable {

	private String                ibflag                = "";
	private String                page_rows             = "";
	private String                bkg_no                = "";
	private String                bkg_no_split          = "";
	private String                trsp_rqst_ord_bnd_cd  = "";
	private String                trsp_sptg_ord_seq     = "";
	private String                trsp_sptg_ord_sub_seq = "";
	private String                cntr_tpsz_cd          = "";
	private String                rqst_cntr_qty         = "";
	private String                cntr_no               = "";
	private String                cntr_pkup_yd_cd       = "";
	private String                cntr_rtn_yd_cd        = "";
	private String                sptg_dt               = "";
	private String                cxl_ind_cd            = "";
	private String                trsp_rqst_ord_so_qty  = "";
	private String                eai_evnt_dt           = "";

	public TrsBkgRqstOrdDtlVO(){}

	public TrsBkgRqstOrdDtlVO(
			String                ibflag               ,
			String                page_rows            ,
			String                bkg_no               ,
			String                bkg_no_split         ,
			String                trsp_rqst_ord_bnd_cd ,
			String                trsp_sptg_ord_seq    ,
			String                trsp_sptg_ord_sub_seq,
			String                cntr_tpsz_cd         ,
			String                rqst_cntr_qty        ,
			String                cntr_no              ,
			String                cntr_pkup_yd_cd      ,
			String                cntr_rtn_yd_cd       ,
			String                sptg_dt              ,
			String                cxl_ind_cd           ,
			String                trsp_rqst_ord_so_qty ,
			String                eai_evnt_dt          ){
		this.ibflag                = ibflag               ;
		this.page_rows             = page_rows            ;
		this.bkg_no                = bkg_no               ;
		this.bkg_no_split          = bkg_no_split         ;
		this.trsp_rqst_ord_bnd_cd  = trsp_rqst_ord_bnd_cd ;
		this.trsp_sptg_ord_seq     = trsp_sptg_ord_seq    ;
		this.trsp_sptg_ord_sub_seq = trsp_sptg_ord_sub_seq;
		this.cntr_tpsz_cd          = cntr_tpsz_cd         ;
		this.rqst_cntr_qty         = rqst_cntr_qty        ;
		this.cntr_no               = cntr_no              ;
		this.cntr_pkup_yd_cd       = cntr_pkup_yd_cd      ;
		this.cntr_rtn_yd_cd        = cntr_rtn_yd_cd       ;
		this.sptg_dt               = sptg_dt              ;
		this.cxl_ind_cd            = cxl_ind_cd           ;
		this.trsp_rqst_ord_so_qty  = trsp_rqst_ord_so_qty ;
		this.eai_evnt_dt           = eai_evnt_dt          ;
	}

	// getter method is proceeding ..
	public String                getIbflag               (){	return ibflag               	;	}
	public String                getPage_rows            (){	return page_rows            	;	}
	public String                getBkg_no               (){	return bkg_no               	;	}
	public String                getBkg_no_split         (){	return bkg_no_split         	;	}
	public String                getTrsp_rqst_ord_bnd_cd (){	return trsp_rqst_ord_bnd_cd 	;	}
	public String                getTrsp_sptg_ord_seq    (){	return trsp_sptg_ord_seq    	;	}
	public String                getTrsp_sptg_ord_sub_seq(){	return trsp_sptg_ord_sub_seq	;	}
	public String                getCntr_tpsz_cd         (){	return cntr_tpsz_cd         	;	}
	public String                getRqst_cntr_qty        (){	return rqst_cntr_qty        	;	}
	public String                getCntr_no              (){	return cntr_no              	;	}
	public String                getCntr_pkup_yd_cd      (){	return cntr_pkup_yd_cd      	;	}
	public String                getCntr_rtn_yd_cd       (){	return cntr_rtn_yd_cd       	;	}
	public String                getSptg_dt              (){	return sptg_dt              	;	}
	public String                getCxl_ind_cd           (){	return cxl_ind_cd           	;	}
	public String                getTrsp_rqst_ord_so_qty (){	return trsp_rqst_ord_so_qty 	;	}
	public String                getEai_evnt_dt          (){	return eai_evnt_dt          	;	}

	// setter method is proceeding ..
	public void setIbflag               ( String                ibflag                ){	this.ibflag                = ibflag               	;	}
	public void setPage_rows            ( String                page_rows             ){	this.page_rows             = page_rows            	;	}
	public void setBkg_no               ( String                bkg_no                ){	this.bkg_no                = bkg_no               	;	}
	public void setBkg_no_split         ( String                bkg_no_split          ){	this.bkg_no_split          = bkg_no_split         	;	}
	public void setTrsp_rqst_ord_bnd_cd ( String                trsp_rqst_ord_bnd_cd  ){	this.trsp_rqst_ord_bnd_cd  = trsp_rqst_ord_bnd_cd 	;	}
	public void setTrsp_sptg_ord_seq    ( String                trsp_sptg_ord_seq     ){	this.trsp_sptg_ord_seq     = trsp_sptg_ord_seq    	;	}
	public void setTrsp_sptg_ord_sub_seq( String                trsp_sptg_ord_sub_seq ){	this.trsp_sptg_ord_sub_seq = trsp_sptg_ord_sub_seq	;	}
	public void setCntr_tpsz_cd         ( String                cntr_tpsz_cd          ){	this.cntr_tpsz_cd          = cntr_tpsz_cd         	;	}
	public void setRqst_cntr_qty        ( String                rqst_cntr_qty         ){	this.rqst_cntr_qty         = rqst_cntr_qty        	;	}
	public void setCntr_no              ( String                cntr_no               ){	this.cntr_no               = cntr_no              	;	}
	public void setCntr_pkup_yd_cd      ( String                cntr_pkup_yd_cd       ){	this.cntr_pkup_yd_cd       = cntr_pkup_yd_cd      	;	}
	public void setCntr_rtn_yd_cd       ( String                cntr_rtn_yd_cd        ){	this.cntr_rtn_yd_cd        = cntr_rtn_yd_cd       	;	}
	public void setSptg_dt              ( String                sptg_dt               ){	this.sptg_dt               = sptg_dt              	;	}
	public void setCxl_ind_cd           ( String                cxl_ind_cd            ){	this.cxl_ind_cd            = cxl_ind_cd           	;	}
	public void setTrsp_rqst_ord_so_qty ( String                trsp_rqst_ord_so_qty  ){	this.trsp_rqst_ord_so_qty  = trsp_rqst_ord_so_qty 	;	}
	public void setEai_evnt_dt          ( String                eai_evnt_dt           ){	this.eai_evnt_dt           = eai_evnt_dt          	;	}

	public static TrsBkgRqstOrdDtlVO fromRequest(HttpServletRequest request) {
		TrsBkgRqstOrdDtlVO model = new TrsBkgRqstOrdDtlVO();
		try {
			model.setIbflag               	(JSPUtil.getParameter(request, "ibflag               		".trim(), ""));
			model.setPage_rows            	(JSPUtil.getParameter(request, "page_rows            		".trim(), ""));
			model.setBkg_no               	(JSPUtil.getParameter(request, "bkg_no               		".trim(), ""));
			model.setBkg_no_split         	(JSPUtil.getParameter(request, "bkg_no_split         		".trim(), ""));
			model.setTrsp_rqst_ord_bnd_cd 	(JSPUtil.getParameter(request, "trsp_rqst_ord_bnd_cd 		".trim(), ""));
			model.setTrsp_sptg_ord_seq    	(JSPUtil.getParameter(request, "trsp_sptg_ord_seq    		".trim(), ""));
			model.setTrsp_sptg_ord_sub_seq	(JSPUtil.getParameter(request, "trsp_sptg_ord_sub_seq		".trim(), ""));
			model.setCntr_tpsz_cd         	(JSPUtil.getParameter(request, "cntr_tpsz_cd         		".trim(), ""));
			model.setRqst_cntr_qty        	(JSPUtil.getParameter(request, "rqst_cntr_qty        		".trim(), ""));
			model.setCntr_no              	(JSPUtil.getParameter(request, "cntr_no              		".trim(), ""));
			model.setCntr_pkup_yd_cd      	(JSPUtil.getParameter(request, "cntr_pkup_yd_cd      		".trim(), ""));
			model.setCntr_rtn_yd_cd       	(JSPUtil.getParameter(request, "cntr_rtn_yd_cd       		".trim(), ""));
			model.setSptg_dt              	(JSPUtil.getParameter(request, "sptg_dt              		".trim(), ""));
			model.setCxl_ind_cd           	(JSPUtil.getParameter(request, "cxl_ind_cd           		".trim(), ""));
			model.setTrsp_rqst_ord_so_qty 	(JSPUtil.getParameter(request, "trsp_rqst_ord_so_qty 		".trim(), ""));
			model.setEai_evnt_dt          	(JSPUtil.getParameter(request, "eai_evnt_dt          		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		TrsBkgRqstOrdDtlVO model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag                =  (JSPUtil.getParameter(request, "ibflag               		".trim(), length));
			String[] page_rows             =  (JSPUtil.getParameter(request, "page_rows            		".trim(), length));
			String[] bkg_no                =  (JSPUtil.getParameter(request, "bkg_no               		".trim(), length));
			String[] bkg_no_split          =  (JSPUtil.getParameter(request, "bkg_no_split         		".trim(), length));
			String[] trsp_rqst_ord_bnd_cd  =  (JSPUtil.getParameter(request, "trsp_rqst_ord_bnd_cd 		".trim(), length));
			String[] trsp_sptg_ord_seq     =  (JSPUtil.getParameter(request, "trsp_sptg_ord_seq    		".trim(), length));
			String[] trsp_sptg_ord_sub_seq =  (JSPUtil.getParameter(request, "trsp_sptg_ord_sub_seq		".trim(), length));
			String[] cntr_tpsz_cd          =  (JSPUtil.getParameter(request, "cntr_tpsz_cd         		".trim(), length));
			String[] rqst_cntr_qty         =  (JSPUtil.getParameter(request, "rqst_cntr_qty        		".trim(), length));
			String[] cntr_no               =  (JSPUtil.getParameter(request, "cntr_no              		".trim(), length));
			String[] cntr_pkup_yd_cd       =  (JSPUtil.getParameter(request, "cntr_pkup_yd_cd      		".trim(), length));
			String[] cntr_rtn_yd_cd        =  (JSPUtil.getParameter(request, "cntr_rtn_yd_cd       		".trim(), length));
			String[] sptg_dt               =  (JSPUtil.getParameter(request, "sptg_dt              		".trim(), length));
			String[] cxl_ind_cd            =  (JSPUtil.getParameter(request, "cxl_ind_cd           		".trim(), length));
			String[] trsp_rqst_ord_so_qty  =  (JSPUtil.getParameter(request, "trsp_rqst_ord_so_qty 		".trim(), length));
			String[] eai_evnt_dt           =  (JSPUtil.getParameter(request, "eai_evnt_dt          		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new TrsBkgRqstOrdDtlVO();
				model.setIbflag               		  (ibflag               	[i]);
				model.setPage_rows            		  (page_rows            	[i]);
				model.setBkg_no               		  (bkg_no               	[i]);
				model.setBkg_no_split         		  (bkg_no_split         	[i]);
				model.setTrsp_rqst_ord_bnd_cd 		  (trsp_rqst_ord_bnd_cd 	[i]);
				model.setTrsp_sptg_ord_seq    		  (trsp_sptg_ord_seq    	[i]);
				model.setTrsp_sptg_ord_sub_seq		  (trsp_sptg_ord_sub_seq	[i]);
				model.setCntr_tpsz_cd         		  (cntr_tpsz_cd         	[i]);
				model.setRqst_cntr_qty        		  (rqst_cntr_qty        	[i]);
				model.setCntr_no              		  (cntr_no              	[i]);
				model.setCntr_pkup_yd_cd      		  (cntr_pkup_yd_cd      	[i]);
				model.setCntr_rtn_yd_cd       		  (cntr_rtn_yd_cd       	[i]);
				model.setSptg_dt              		  (sptg_dt              	[i]);
				model.setCxl_ind_cd           		  (cxl_ind_cd           	[i]);
				model.setTrsp_rqst_ord_so_qty 		  (trsp_rqst_ord_so_qty 	[i]);
				model.setEai_evnt_dt          		  (eai_evnt_dt          	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		TrsBkgRqstOrdDtlVO model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag                =  (JSPUtil.getParameter(request, prefix + "ibflag               		".trim(), length));
			String[] page_rows             =  (JSPUtil.getParameter(request, prefix + "page_rows            		".trim(), length));
			String[] bkg_no                =  (JSPUtil.getParameter(request, prefix + "bkg_no               		".trim(), length));
			String[] bkg_no_split          =  (JSPUtil.getParameter(request, prefix + "bkg_no_split         		".trim(), length));
			String[] trsp_rqst_ord_bnd_cd  =  (JSPUtil.getParameter(request, prefix + "trsp_rqst_ord_bnd_cd 		".trim(), length));
			String[] trsp_sptg_ord_seq     =  (JSPUtil.getParameter(request, prefix + "trsp_sptg_ord_seq    		".trim(), length));
			String[] trsp_sptg_ord_sub_seq =  (JSPUtil.getParameter(request, prefix + "trsp_sptg_ord_sub_seq		".trim(), length));
			String[] cntr_tpsz_cd          =  (JSPUtil.getParameter(request, prefix + "cntr_tpsz_cd         		".trim(), length));
			String[] rqst_cntr_qty         =  (JSPUtil.getParameter(request, prefix + "rqst_cntr_qty        		".trim(), length));
			String[] cntr_no               =  (JSPUtil.getParameter(request, prefix + "cntr_no              		".trim(), length));
			String[] cntr_pkup_yd_cd       =  (JSPUtil.getParameter(request, prefix + "cntr_pkup_yd_cd      		".trim(), length));
			String[] cntr_rtn_yd_cd        =  (JSPUtil.getParameter(request, prefix + "cntr_rtn_yd_cd       		".trim(), length));
			String[] sptg_dt               =  (JSPUtil.getParameter(request, prefix + "sptg_dt              		".trim(), length));
			String[] cxl_ind_cd            =  (JSPUtil.getParameter(request, prefix + "cxl_ind_cd           		".trim(), length));
			String[] trsp_rqst_ord_so_qty  =  (JSPUtil.getParameter(request, prefix + "trsp_rqst_ord_so_qty 		".trim(), length));
			String[] eai_evnt_dt           =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt          		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new TrsBkgRqstOrdDtlVO();
				model.setIbflag               		  ( ibflag               	[i]);
				model.setPage_rows            		  ( page_rows            	[i]);
				model.setBkg_no               		  ( bkg_no               	[i]);
				model.setBkg_no_split         		  ( bkg_no_split         	[i]);
				model.setTrsp_rqst_ord_bnd_cd 		  ( trsp_rqst_ord_bnd_cd 	[i]);
				model.setTrsp_sptg_ord_seq    		  ( trsp_sptg_ord_seq    	[i]);
				model.setTrsp_sptg_ord_sub_seq		  ( trsp_sptg_ord_sub_seq	[i]);
				model.setCntr_tpsz_cd         		  ( cntr_tpsz_cd         	[i]);
				model.setRqst_cntr_qty        		  ( rqst_cntr_qty        	[i]);
				model.setCntr_no              		  ( cntr_no              	[i]);
				model.setCntr_pkup_yd_cd      		  ( cntr_pkup_yd_cd      	[i]);
				model.setCntr_rtn_yd_cd       		  ( cntr_rtn_yd_cd       	[i]);
				model.setSptg_dt              		  ( sptg_dt              	[i]);
				model.setCxl_ind_cd           		  ( cxl_ind_cd           	[i]);
				model.setTrsp_rqst_ord_so_qty 		  ( trsp_rqst_ord_so_qty 	[i]);
				model.setEai_evnt_dt          		  ( eai_evnt_dt          	[i]);
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
