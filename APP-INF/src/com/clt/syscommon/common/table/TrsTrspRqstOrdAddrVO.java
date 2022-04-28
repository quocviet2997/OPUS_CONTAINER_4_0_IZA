/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : TRS_TRSP_RQST_ORD_ADDR_TMP.java
*@FileTitle : Adding Surcharge Agreement
*Open Issues :
*Change history :
*@LastModifyDate : 2007-05-11
*@LastModifier : agreement
*@LastVersion : 1.0
* 2007-05-11 agreement
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
public final class TrsTrspRqstOrdAddrVO implements java.io.Serializable {

	private String                ibflag                = "";
	private String                page_rows             = "";
	private String                bkg_no                = "";
	private String                bkg_no_split          = "";
	private String                trsp_rqst_ord_bnd_cd  = "";
	private String                trsp_rqst_ord_seq     = "";
	private String                trsp_rqst_ord_sub_seq = "";
	private String                dor_arr_dt            = "";
	private String                dor_loc_cd            = "";
	private String                dor_addr              = "";
	private String                dor_addr_tp_cd        = "";
	private String                dor_pst_cd            = "";
	private String                cntc_pson_ctnt        = "";
	private String                cntc_pson_phn_no      = "";
	private String                cre_ofc_cd            = "";
	private String                cre_dt                = "";
	private String                cre_usr_id            = "";
	private String                upd_dt                = "";
	private String                upd_usr_id            = "";
	private String                eai_evnt_dt           = "";

	public TrsTrspRqstOrdAddrVO(){}

	public TrsTrspRqstOrdAddrVO(
			String                ibflag               ,
			String                page_rows            ,
			String                bkg_no               ,
			String                bkg_no_split         ,
			String                trsp_rqst_ord_bnd_cd ,
			String                trsp_rqst_ord_seq    ,
			String                trsp_rqst_ord_sub_seq,
			String                dor_arr_dt           ,
			String                dor_loc_cd           ,
			String                dor_addr             ,
			String                dor_addr_tp_cd       ,
			String                dor_pst_cd           ,
			String                cntc_pson_ctnt       ,
			String                cntc_pson_phn_no     ,
			String                cre_ofc_cd           ,
			String                cre_dt               ,
			String                cre_usr_id           ,
			String                upd_dt               ,
			String                upd_usr_id           ,
			String                eai_evnt_dt          ){
		this.ibflag                = ibflag               ;
		this.page_rows             = page_rows            ;
		this.bkg_no                = bkg_no               ;
		this.bkg_no_split          = bkg_no_split         ;
		this.trsp_rqst_ord_bnd_cd  = trsp_rqst_ord_bnd_cd ;
		this.trsp_rqst_ord_seq     = trsp_rqst_ord_seq    ;
		this.trsp_rqst_ord_sub_seq = trsp_rqst_ord_sub_seq;
		this.dor_arr_dt            = dor_arr_dt           ;
		this.dor_loc_cd            = dor_loc_cd           ;
		this.dor_addr              = dor_addr             ;
		this.dor_addr_tp_cd        = dor_addr_tp_cd       ;
		this.dor_pst_cd            = dor_pst_cd           ;
		this.cntc_pson_ctnt        = cntc_pson_ctnt       ;
		this.cntc_pson_phn_no      = cntc_pson_phn_no     ;
		this.cre_ofc_cd            = cre_ofc_cd           ;
		this.cre_dt                = cre_dt               ;
		this.cre_usr_id            = cre_usr_id           ;
		this.upd_dt                = upd_dt               ;
		this.upd_usr_id            = upd_usr_id           ;
		this.eai_evnt_dt           = eai_evnt_dt          ;
	}

	// getter method is proceeding ..
	public String                getIbflag               (){	return ibflag               	;	}
	public String                getPage_rows            (){	return page_rows            	;	}
	public String                getBkg_no               (){	return bkg_no               	;	}
	public String                getBkg_no_split         (){	return bkg_no_split         	;	}
	public String                getTrsp_rqst_ord_bnd_cd (){	return trsp_rqst_ord_bnd_cd 	;	}
	public String                getTrsp_rqst_ord_seq    (){	return trsp_rqst_ord_seq    	;	}
	public String                getTrsp_rqst_ord_sub_seq(){	return trsp_rqst_ord_sub_seq	;	}
	public String                getDor_arr_dt           (){	return dor_arr_dt           	;	}
	public String                getDor_loc_cd           (){	return dor_loc_cd           	;	}
	public String                getDor_addr             (){	return dor_addr             	;	}
	public String                getDor_addr_tp_cd       (){	return dor_addr_tp_cd       	;	}
	public String                getDor_pst_cd           (){	return dor_pst_cd           	;	}
	public String                getCntc_pson_ctnt       (){	return cntc_pson_ctnt       	;	}
	public String                getCntc_pson_phn_no     (){	return cntc_pson_phn_no     	;	}
	public String                getCre_ofc_cd           (){	return cre_ofc_cd           	;	}
	public String                getCre_dt               (){	return cre_dt               	;	}
	public String                getCre_usr_id           (){	return cre_usr_id           	;	}
	public String                getUpd_dt               (){	return upd_dt               	;	}
	public String                getUpd_usr_id           (){	return upd_usr_id           	;	}
	public String                getEai_evnt_dt          (){	return eai_evnt_dt          	;	}

	// setter method is proceeding ..
	public void setIbflag               ( String                ibflag                ){	this.ibflag                = ibflag               	;	}
	public void setPage_rows            ( String                page_rows             ){	this.page_rows             = page_rows            	;	}
	public void setBkg_no               ( String                bkg_no                ){	this.bkg_no                = bkg_no               	;	}
	public void setBkg_no_split         ( String                bkg_no_split          ){	this.bkg_no_split          = bkg_no_split         	;	}
	public void setTrsp_rqst_ord_bnd_cd ( String                trsp_rqst_ord_bnd_cd  ){	this.trsp_rqst_ord_bnd_cd  = trsp_rqst_ord_bnd_cd 	;	}
	public void setTrsp_rqst_ord_seq    ( String                trsp_rqst_ord_seq     ){	this.trsp_rqst_ord_seq     = trsp_rqst_ord_seq    	;	}
	public void setTrsp_rqst_ord_sub_seq( String                trsp_rqst_ord_sub_seq ){	this.trsp_rqst_ord_sub_seq = trsp_rqst_ord_sub_seq	;	}
	public void setDor_arr_dt           ( String                dor_arr_dt            ){	this.dor_arr_dt            = dor_arr_dt           	;	}
	public void setDor_loc_cd           ( String                dor_loc_cd            ){	this.dor_loc_cd            = dor_loc_cd           	;	}
	public void setDor_addr             ( String                dor_addr              ){	this.dor_addr              = dor_addr             	;	}
	public void setDor_addr_tp_cd       ( String                dor_addr_tp_cd        ){	this.dor_addr_tp_cd        = dor_addr_tp_cd       	;	}
	public void setDor_pst_cd           ( String                dor_pst_cd            ){	this.dor_pst_cd            = dor_pst_cd           	;	}
	public void setCntc_pson_ctnt       ( String                cntc_pson_ctnt        ){	this.cntc_pson_ctnt        = cntc_pson_ctnt       	;	}
	public void setCntc_pson_phn_no     ( String                cntc_pson_phn_no      ){	this.cntc_pson_phn_no      = cntc_pson_phn_no     	;	}
	public void setCre_ofc_cd           ( String                cre_ofc_cd            ){	this.cre_ofc_cd            = cre_ofc_cd           	;	}
	public void setCre_dt               ( String                cre_dt                ){	this.cre_dt                = cre_dt               	;	}
	public void setCre_usr_id           ( String                cre_usr_id            ){	this.cre_usr_id            = cre_usr_id           	;	}
	public void setUpd_dt               ( String                upd_dt                ){	this.upd_dt                = upd_dt               	;	}
	public void setUpd_usr_id           ( String                upd_usr_id            ){	this.upd_usr_id            = upd_usr_id           	;	}
	public void setEai_evnt_dt          ( String                eai_evnt_dt           ){	this.eai_evnt_dt           = eai_evnt_dt          	;	}

	public static TrsTrspRqstOrdAddrVO fromRequest(HttpServletRequest request) {
		TrsTrspRqstOrdAddrVO model = new TrsTrspRqstOrdAddrVO();
		try {
			model.setIbflag               	(JSPUtil.getParameter(request, "ibflag               		".trim(), ""));
			model.setPage_rows            	(JSPUtil.getParameter(request, "page_rows            		".trim(), ""));
			model.setBkg_no               	(JSPUtil.getParameter(request, "bkg_no               		".trim(), ""));
			model.setBkg_no_split         	(JSPUtil.getParameter(request, "bkg_no_split         		".trim(), ""));
			model.setTrsp_rqst_ord_bnd_cd 	(JSPUtil.getParameter(request, "trsp_rqst_ord_bnd_cd 		".trim(), ""));
			model.setTrsp_rqst_ord_seq    	(JSPUtil.getParameter(request, "trsp_rqst_ord_seq    		".trim(), ""));
			model.setTrsp_rqst_ord_sub_seq	(JSPUtil.getParameter(request, "trsp_rqst_ord_sub_seq		".trim(), ""));
			model.setDor_arr_dt           	(JSPUtil.getParameter(request, "dor_arr_dt           		".trim(), ""));
			model.setDor_loc_cd           	(JSPUtil.getParameter(request, "dor_loc_cd           		".trim(), ""));
			model.setDor_addr             	(JSPUtil.getParameter(request, "dor_addr             		".trim(), ""));
			model.setDor_addr_tp_cd       	(JSPUtil.getParameter(request, "dor_addr_tp_cd       		".trim(), ""));
			model.setDor_pst_cd           	(JSPUtil.getParameter(request, "dor_pst_cd           		".trim(), ""));
			model.setCntc_pson_ctnt       	(JSPUtil.getParameter(request, "cntc_pson_ctnt       		".trim(), ""));
			model.setCntc_pson_phn_no     	(JSPUtil.getParameter(request, "cntc_pson_phn_no     		".trim(), ""));
			model.setCre_ofc_cd           	(JSPUtil.getParameter(request, "cre_ofc_cd           		".trim(), ""));
			model.setCre_dt               	(JSPUtil.getParameter(request, "cre_dt               		".trim(), ""));
			model.setCre_usr_id           	(JSPUtil.getParameter(request, "cre_usr_id           		".trim(), ""));
			model.setUpd_dt               	(JSPUtil.getParameter(request, "upd_dt               		".trim(), ""));
			model.setUpd_usr_id           	(JSPUtil.getParameter(request, "upd_usr_id           		".trim(), ""));
			model.setEai_evnt_dt          	(JSPUtil.getParameter(request, "eai_evnt_dt          		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		TrsTrspRqstOrdAddrVO model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag                =  (JSPUtil.getParameter(request, "ibflag               		".trim(), length));
			String[] page_rows             =  (JSPUtil.getParameter(request, "page_rows            		".trim(), length));
			String[] bkg_no                =  (JSPUtil.getParameter(request, "bkg_no               		".trim(), length));
			String[] bkg_no_split          =  (JSPUtil.getParameter(request, "bkg_no_split         		".trim(), length));
			String[] trsp_rqst_ord_bnd_cd  =  (JSPUtil.getParameter(request, "trsp_rqst_ord_bnd_cd 		".trim(), length));
			String[] trsp_rqst_ord_seq     =  (JSPUtil.getParameter(request, "trsp_rqst_ord_seq    		".trim(), length));
			String[] trsp_rqst_ord_sub_seq =  (JSPUtil.getParameter(request, "trsp_rqst_ord_sub_seq		".trim(), length));
			String[] dor_arr_dt            =  (JSPUtil.getParameter(request, "dor_arr_dt           		".trim(), length));
			String[] dor_loc_cd            =  (JSPUtil.getParameter(request, "dor_loc_cd           		".trim(), length));
			String[] dor_addr              =  (JSPUtil.getParameter(request, "dor_addr             		".trim(), length));
			String[] dor_addr_tp_cd        =  (JSPUtil.getParameter(request, "dor_addr_tp_cd       		".trim(), length));
			String[] dor_pst_cd            =  (JSPUtil.getParameter(request, "dor_pst_cd           		".trim(), length));
			String[] cntc_pson_ctnt        =  (JSPUtil.getParameter(request, "cntc_pson_ctnt       		".trim(), length));
			String[] cntc_pson_phn_no      =  (JSPUtil.getParameter(request, "cntc_pson_phn_no     		".trim(), length));
			String[] cre_ofc_cd            =  (JSPUtil.getParameter(request, "cre_ofc_cd           		".trim(), length));
			String[] cre_dt                =  (JSPUtil.getParameter(request, "cre_dt               		".trim(), length));
			String[] cre_usr_id            =  (JSPUtil.getParameter(request, "cre_usr_id           		".trim(), length));
			String[] upd_dt                =  (JSPUtil.getParameter(request, "upd_dt               		".trim(), length));
			String[] upd_usr_id            =  (JSPUtil.getParameter(request, "upd_usr_id           		".trim(), length));
			String[] eai_evnt_dt           =  (JSPUtil.getParameter(request, "eai_evnt_dt          		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new TrsTrspRqstOrdAddrVO();
				model.setIbflag               		  (ibflag               	[i]);
				model.setPage_rows            		  (page_rows            	[i]);
				model.setBkg_no               		  (bkg_no               	[i]);
				model.setBkg_no_split         		  (bkg_no_split         	[i]);
				model.setTrsp_rqst_ord_bnd_cd 		  (trsp_rqst_ord_bnd_cd 	[i]);
				model.setTrsp_rqst_ord_seq    		  (trsp_rqst_ord_seq    	[i]);
				model.setTrsp_rqst_ord_sub_seq		  (trsp_rqst_ord_sub_seq	[i]);
				model.setDor_arr_dt           		  (dor_arr_dt           	[i]);
				model.setDor_loc_cd           		  (dor_loc_cd           	[i]);
				model.setDor_addr             		  (dor_addr             	[i]);
				model.setDor_addr_tp_cd       		  (dor_addr_tp_cd       	[i]);
				model.setDor_pst_cd           		  (dor_pst_cd           	[i]);
				model.setCntc_pson_ctnt       		  (cntc_pson_ctnt       	[i]);
				model.setCntc_pson_phn_no     		  (cntc_pson_phn_no     	[i]);
				model.setCre_ofc_cd           		  (cre_ofc_cd           	[i]);
				model.setCre_dt               		  (cre_dt               	[i]);
				model.setCre_usr_id           		  (cre_usr_id           	[i]);
				model.setUpd_dt               		  (upd_dt               	[i]);
				model.setUpd_usr_id           		  (upd_usr_id           	[i]);
				model.setEai_evnt_dt          		  (eai_evnt_dt          	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		TrsTrspRqstOrdAddrVO model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag                =  (JSPUtil.getParameter(request, prefix + "ibflag               		".trim(), length));
			String[] page_rows             =  (JSPUtil.getParameter(request, prefix + "page_rows            		".trim(), length));
			String[] bkg_no                =  (JSPUtil.getParameter(request, prefix + "bkg_no               		".trim(), length));
			String[] bkg_no_split          =  (JSPUtil.getParameter(request, prefix + "bkg_no_split         		".trim(), length));
			String[] trsp_rqst_ord_bnd_cd  =  (JSPUtil.getParameter(request, prefix + "trsp_rqst_ord_bnd_cd 		".trim(), length));
			String[] trsp_rqst_ord_seq     =  (JSPUtil.getParameter(request, prefix + "trsp_rqst_ord_seq    		".trim(), length));
			String[] trsp_rqst_ord_sub_seq =  (JSPUtil.getParameter(request, prefix + "trsp_rqst_ord_sub_seq		".trim(), length));
			String[] dor_arr_dt            =  (JSPUtil.getParameter(request, prefix + "dor_arr_dt           		".trim(), length));
			String[] dor_loc_cd            =  (JSPUtil.getParameter(request, prefix + "dor_loc_cd           		".trim(), length));
			String[] dor_addr              =  (JSPUtil.getParameter(request, prefix + "dor_addr             		".trim(), length));
			String[] dor_addr_tp_cd        =  (JSPUtil.getParameter(request, prefix + "dor_addr_tp_cd       		".trim(), length));
			String[] dor_pst_cd            =  (JSPUtil.getParameter(request, prefix + "dor_pst_cd           		".trim(), length));
			String[] cntc_pson_ctnt        =  (JSPUtil.getParameter(request, prefix + "cntc_pson_ctnt       		".trim(), length));
			String[] cntc_pson_phn_no      =  (JSPUtil.getParameter(request, prefix + "cntc_pson_phn_no     		".trim(), length));
			String[] cre_ofc_cd            =  (JSPUtil.getParameter(request, prefix + "cre_ofc_cd           		".trim(), length));
			String[] cre_dt                =  (JSPUtil.getParameter(request, prefix + "cre_dt               		".trim(), length));
			String[] cre_usr_id            =  (JSPUtil.getParameter(request, prefix + "cre_usr_id           		".trim(), length));
			String[] upd_dt                =  (JSPUtil.getParameter(request, prefix + "upd_dt               		".trim(), length));
			String[] upd_usr_id            =  (JSPUtil.getParameter(request, prefix + "upd_usr_id           		".trim(), length));
			String[] eai_evnt_dt           =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt          		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new TrsTrspRqstOrdAddrVO();
				model.setIbflag               		  ( ibflag               	[i]);
				model.setPage_rows            		  ( page_rows            	[i]);
				model.setBkg_no               		  ( bkg_no               	[i]);
				model.setBkg_no_split         		  ( bkg_no_split         	[i]);
				model.setTrsp_rqst_ord_bnd_cd 		  ( trsp_rqst_ord_bnd_cd 	[i]);
				model.setTrsp_rqst_ord_seq    		  ( trsp_rqst_ord_seq    	[i]);
				model.setTrsp_rqst_ord_sub_seq		  ( trsp_rqst_ord_sub_seq	[i]);
				model.setDor_arr_dt           		  ( dor_arr_dt           	[i]);
				model.setDor_loc_cd           		  ( dor_loc_cd           	[i]);
				model.setDor_addr             		  ( dor_addr             	[i]);
				model.setDor_addr_tp_cd       		  ( dor_addr_tp_cd       	[i]);
				model.setDor_pst_cd           		  ( dor_pst_cd           	[i]);
				model.setCntc_pson_ctnt       		  ( cntc_pson_ctnt       	[i]);
				model.setCntc_pson_phn_no     		  ( cntc_pson_phn_no     	[i]);
				model.setCre_ofc_cd           		  ( cre_ofc_cd           	[i]);
				model.setCre_dt               		  ( cre_dt               	[i]);
				model.setCre_usr_id           		  ( cre_usr_id           	[i]);
				model.setUpd_dt               		  ( upd_dt               	[i]);
				model.setUpd_usr_id           		  ( upd_usr_id           	[i]);
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
